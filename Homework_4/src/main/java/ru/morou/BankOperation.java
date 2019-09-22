package ru.morou;

public interface BankOperation {
    void execute();
    String getOperationName();
    String getOperationStatus();
}
