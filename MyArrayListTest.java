package Myarraylist;

import Myarraylist.MyArrayList;
import Myarraylist.Person;
import java.util.Scanner;

public class MyArrayListTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MyArrayList HostelBookings = new MyArrayList();
        while (true) {
            System.out.println("1- Add booking");
            System.out.println("2- Print the bookings");
            System.out.println("3- Number of bookings");
            System.out.println("4- Clear every bookings");
            System.out.println("5- Replace booking");
            System.out.println("6- Get Entry");
            System.out.println("7- Contains booking");
            System.out.println("8- Calculate total cost=  ");
            System.out.println("9- Exit");
            System.out.println("Enter your choice :)");

            int choice = scan.nextInt();
            scan.nextLine();

            if (choice == 1) {
                System.out.println("Enter the name of the person who wants to book");
                String x = scan.nextLine();
                System.out.println("Enter the age of the person who wants to book");
                int y = scan.nextInt();

                // Check if the age is less than or equal to 18
                if (y <= 18) {
                    System.out.println("Booking rejected. Age must be greater than 18.");
                    continue; // Skip the rest of the loop iteration
                }

                System.out.println("Enter the phone number of the person who wants to book");
                int z = scan.nextInt();
                System.out.println("How many days do you want to book");
                int d = scan.nextInt();

                Person p = new Person(x, y, z, d);
                HostelBookings.add(p);
            } else if (choice == 2) {
                HostelBookings.print();
            } else if (choice == 3) {
                if (HostelBookings.isEmpty()) {
                    System.out.println("The bookings are empty");
                } else {
                    System.out.println("Number of bookings is " + HostelBookings.getLength());
                }
            } else if (choice == 4) {
                HostelBookings.clear();
            } else if (choice == 9) {
                break;
            } else if (choice == 5) {
                System.out.println("Enter booking number");
                int givenPos = scan.nextInt();
                scan.nextLine();

                System.out.println("Enter the new name of the person who wants to book");
                String x = scan.nextLine();
                System.out.println("Enter the new age of the person who wants to book");
                int y = scan.nextInt();

                // Check if the new age is less than or equal to 18
                if (y <= 18) {
                    System.out.println("Booking replacement rejected. Age must be greater than 18.");
                    continue; // Skip the rest of the loop iteration
                }

                System.out.println("Enter the new phone number of the person who wants to book");
                int z = scan.nextInt();
                System.out.println("How many days do you want to book");
                int d = scan.nextInt();

                Person p = new Person(x, y, z, d);

                String replacedItem;
                replacedItem = HostelBookings.replace(givenPos, p);

                System.out.println("Done, " + replacedItem);
            } else if (choice == 6) {
                System.out.println("Enter booking number");
                int givenbooking = scan.nextInt();
                System.out.println("The booking number " + givenbooking + " : " + HostelBookings.getEntery(givenbooking));
            } else if (choice == 7) {
                System.out.println("Enter the booking name");
                String key = scan.nextLine();
                if (HostelBookings.contains(key)) {
                    System.out.println(key + " is found");
                } else {
                    System.out.println(key + " is not found");
                }
            } else if (choice == 8) {
                System.out.println("Enter the Duration of reservation:");
                int givenBooking = scan.nextInt();
                double totalCost = MyArrayList.calculateTotalCost(givenBooking);
                System.out.println("The total cost of the reservation is: $" + totalCost);
            } else if (choice == 9) {
                break;
                
            } 
        }

        scan.close();
    }

}
