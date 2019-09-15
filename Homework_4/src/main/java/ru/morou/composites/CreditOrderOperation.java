package ru.morou.composites;

import ru.morou.BankOperation;
import ru.morou.OperationStatus;

import java.util.Random;

public class CreditOrderOperation implements BankOperation {
    private String operationName = "CreditOperation";
    private OperationStatus status = OperationStatus.WAITING;

    @Override
    public void execute() {
        Random random = new Random();
        status = OperationStatus.PROCESS;
        //Doing credit operation...
        System.out.println(operationName + ":" + getOperationStatus());

        if (random.nextInt(10) > 5) {
            status = OperationStatus.SUCCESS;
        } else {
            status = OperationStatus.ERROR;
        }
    }

    @Override
    public String getOperationName() {
        return operationName;
    }

    @Override
    public String getOperationStatus() {
        return operationName + ":" + status.toString();
    }
}
