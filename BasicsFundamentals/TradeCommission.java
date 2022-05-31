package CondStatementsAdvanced;

import java.util.Scanner;

public class P12TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double percentComm = 0.00;
        if ("Sofia".equals(town)) {
            if (sales >= 0.00 && sales <= 500) {
                percentComm = 0.05;
            } else if (sales > 500 && sales <= 1000) {
                percentComm = 0.07;
            } else if (sales > 1000 && sales <= 10000) {
                percentComm = 0.08;
            } else if (sales > 10000) {
                percentComm = 0.12;
            }
            if (percentComm > 0.00) {
                double commission = sales * percentComm;
                System.out.printf("%.02f", commission);
            } else {
                System.out.println("error");
            }
        } else if ("Varna".equals(town)) {
            if (sales >= 0.00 && sales <= 500) {
                percentComm = 0.045;
            } else if (sales > 500 && sales <= 1000) {
                percentComm = 0.075;
            } else if (sales > 1000 && sales <= 10000) {
                percentComm = 0.10;
            } else if (sales > 10000) {
                percentComm = 0.13;
            }
            if (percentComm > 0.00) {
                double commission = sales * percentComm;
                System.out.printf("%.02f", commission);
            } else {
                System.out.println("error");
            }
        } else if ("Plovdiv".equals(town)) {
            if (sales >= 0.00 && sales <= 500) {
                percentComm = 0.055;
            } else if (sales > 500 && sales <= 1000) {
                percentComm = 0.08;
            } else if (sales > 1000 && sales <= 10000) {
                percentComm = 0.12;
            } else if (sales > 10000) {
                percentComm = 0.145;
            }
            if (percentComm > 0.00) {
                double commission = sales * percentComm;
                System.out.printf("%.02f", commission);
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
    }
}