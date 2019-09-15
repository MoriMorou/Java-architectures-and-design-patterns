package ru.morou;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeOperation implements BankOperation {

    private List<BankOperation> operations;

    public CompositeOperation() {
        operations = new ArrayList<>();
    }

    @Override
    public void execute() {
        for (int i = 0; i < operations.size(); i++) {
            operations.get(i).execute();
        }
    }

    @Override
    public String getOperationName() {
        StringBuilder result = new StringBuilder();
        result.append("[ ");
        for (BankOperation operation: operations) {
            result.append(operation.getOperationName());
            if (operations.indexOf(operation) < operations.size()) result.append(", ");
        }
        result.append(" ]");
        return result.toString();
    }

    @Override
    public String getOperationStatus() {
        StringBuilder result = new StringBuilder();
        result.append("[ ");
        for (BankOperation operation: operations) {
            result.append(operation.getOperationStatus());
            if (operations.indexOf(operation) < operations.size() - 1) result.append(", ");
        }
        result.append(" ]");

        return result.toString();
    }

    public BankOperation addOperation(BankOperation... operations) {
        this.operations.addAll(Arrays.asList(operations));
        return this;
    }
}
