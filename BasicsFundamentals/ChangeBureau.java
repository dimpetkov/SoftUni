package March2020;

import java.util.Scanner;

public class P01ChangeBureau {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int btc = Integer.parseInt(scanner.nextLine());
            double cny = Double.parseDouble(scanner.nextLine());
            double commission = Double.parseDouble(scanner.nextLine());
        //1 btc = 1168 bgn.
        //1 cny = 0.15 usd.
        //1 usd = 1.76 bgn.
        //1 eur = 1.95 bgn.
        //exchange commission 0-5% on the eur amount %.2f
        double btcToEur = btc * 1168 / 1.95;
        double cnyToEur = cny * 0.15 * 1.76 / 1.95;
        double eur = btcToEur + cnyToEur;
        double eurNet = eur - (eur * commission / 100);
        System.out.printf("%.2f", eurNet);
    }

}
