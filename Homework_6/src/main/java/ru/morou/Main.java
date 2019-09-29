package ru.morou;

import ru.morou.DataMapper.DBManager;
import ru.morou.DataMapper.Order;
import ru.morou.DataMapper.OrderMapper;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            DBManager.init();
            OrderMapper orderMapper = new OrderMapper(DBManager.getConnection());

            Order firstOrder = orderMapper.findOrderById(1);

            System.out.println("ID: " + firstOrder.getOrderId() + ", TYPE: " + firstOrder.getOrderType() + ", START DATE: "
                    + firstOrder.getOrderStartDate() + ", STATUS: " + firstOrder.getOrderStatus());

            //insert
            Order insertOrder = new Order("DEPOSIT", "12.03.2016", "OPEN");
            orderMapper.insert(insertOrder);

            //update
            Order updateOrder = new Order("CREDIT", "15.01.2012", "OPEN");
            orderMapper.insert(updateOrder);

            updateOrder = orderMapper.findOrderById(3);
            updateOrder.setOrderStatus("CLOSE");
            orderMapper.update(updateOrder);

            //delete
            Order deleteOrder = new Order("DEPOSIT", "03.12.2013", "ERROR");
            orderMapper.insert(deleteOrder);

            deleteOrder = orderMapper.findOrderById(4);
            orderMapper.delete(deleteOrder);

            //Тест Identity Map
            orderMapper.findOrderById(1); //из кэша
            orderMapper.findOrderById(2); //из БД
            orderMapper.findOrderById(2); //из кэша
            orderMapper.findOrderById(3); //из БД
            orderMapper.findOrderById(3); //из кэша
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                DBManager.closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}