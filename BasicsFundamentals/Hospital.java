package ForCycles.ForCyclesMoreExercise;

import java.util.Scanner;

public class P02Hospital {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int days = Integer.parseInt(scanner.nextLine());

            int doctors = 7;
            int treatedPatients = 0;
            int untreatedPatients = 0;

        for (int i = 1; i <= days; i++) {
            int patients = Integer.parseInt(scanner.nextLine());
            int treated = 0;
            int untreated = 0;

            if (i % 3 == 0 && untreatedPatients > treatedPatients) { //every third day the hospital makes a review of untreated patients
                doctors++;
            }
            if (patients <= doctors) {
                treated = patients;
            } else {
                treated = doctors;
                untreated = patients - treated;
            }

            treatedPatients = treatedPatients + treated;
            untreatedPatients = untreatedPatients + untreated;

        }
        System.out.printf("Treated patients: %d.%n", treatedPatients);
        System.out.printf("Untreated patients: %d.", untreatedPatients);
    }
}
