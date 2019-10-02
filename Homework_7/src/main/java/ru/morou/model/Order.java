package ru.morou.model;

public class Order {
    private int id;
    private String type;
    private String startDate;
    private String status;

    public Order(String type, String startDate, String status) {
        this.type = type;
        this.startDate = startDate;
        this.status = status;
    }

    public Order(int id, String type, String startDate, String status) {
        this.id = id;
        this.type = type;
        this.startDate = startDate;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
