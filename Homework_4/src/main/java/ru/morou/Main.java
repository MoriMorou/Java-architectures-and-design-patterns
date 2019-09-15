package ru.morou;

import ru.morou.composites.CreditOrderOperation;
import ru.morou.composites.DepositOrderOperation;
import ru.morou.composites.ScoringOperation;

public class Main {
    public static void main(String[] args) {

        BankOperation creditOrderOperation = new CreditOrderOperation ();
        BankOperation depositOrderOperation = new DepositOrderOperation ();
        BankOperation scoringOperation = new ScoringOperation ();
        CompositeOperation operation = new CompositeOperation();

        operation.addOperation(creditOrderOperation, depositOrderOperation, scoringOperation);
        System.out.println(operation.getOperationName());
        System.out.println("\nPrepare bank operations");
        System.out.println(operation.getOperationStatus());

        System.out.println("\nStart operations");
        operation.execute();

        System.out.println("\nFinish operations");
        System.out.println(operation.getOperationStatus());
    }
}
