import java.util.Scanner;

public class Main {
    static class Car {
        int id;
        String model;
        String owner;

        Car(int id, String model, String owner) {
            this.id = id;
            this.model = model;
            this.owner = owner;
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Model: " + model + ", Owner: " + owner;
        }
    }

    static Car c[] = new Car[100];
    static int carCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Car Parking Management System ---");
            System.out.println("1. Park Car");
            System.out.println("2. View Parked Cars");
            System.out.println("3. Remove Car");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    parkCar(sc);
                    break;
                case 2:
                    viewCars();
                    break;
                case 3:
                    removeCar(sc);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }

    private static void parkCar(Scanner scanner) {
        System.out.print("Enter Car ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Car Model: ");
        String model = scanner.nextLine();
        System.out.print("Enter Owner Name: ");
        String owner = scanner.nextLine();
        c[carCount++] = new Car(id, model, owner);
        System.out.println("Car parked successfully.");
    }

    private static void viewCars() {
        if (carCount == 0) {
            System.out.println("No cars parked.");
        } else {
            System.out.println("\n--- List of Parked Cars ---");
            for (int i = 0; i < carCount; i++) {
                System.out.println(c[i]);
            }
        }
    }

    private static void removeCar(Scanner scanner) {
        if (carCount == 0) {
            System.out.println("No cars to remove.");
            return;
        }

        System.out.print("Enter Car ID to remove: ");
        int id = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < carCount; i++) {
            if (c[i].id == id) {
                for (int j = i; j < carCount - 1; j++) {
                    c[j] = c[j + 1];
                }
                c[--carCount] = null;
                found = true;
                System.out.println("Car removed successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("Car with ID " + id + " not found.");
        }
    }
}
