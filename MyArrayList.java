package Myarraylist;

import Myarraylist.Person;

public class MyArrayList {

    Person items[];
    int noOfItems;

    public MyArrayList() {
        items = new Person[10];
        noOfItems = 0;

    }

    public void add(Person p) {
        if (isFull() == false) {
            items[noOfItems] = p;
            noOfItems++;
        } else {
            System.out.println("Sorry, the hostel is full");
        }

    }

    public void print() {
        if (isEmpty() == true) {
            System.out.println("The hostel is empty");
        } else {

            System.out.print("[");
            for (int i = 0; i < noOfItems - 1; i++) {
                Person person = items[i];
                double totalCost = calculateTotalCost(person.daysBooked);
                System.out.print("Name: " + person.name + ", Age: " + person.age + ", Phone: " + person.phone + ", Days: " + person.daysBooked + ", Total Cost: $" + totalCost + ",\n");
            }
            Person lastPerson = items[noOfItems - 1];
            double totalCost = calculateTotalCost(lastPerson.daysBooked);
            System.out.print("Name: " + lastPerson.name + ", Age: " + lastPerson.age + ", Phone: " + lastPerson.phone + ", Days: " + lastPerson.daysBooked + ", Total Cost: $" + totalCost);
            System.out.println("]");
        }
    }

    

    public boolean isFull() {
        if (noOfItems == items.length) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (noOfItems == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getLength() {
        return noOfItems;
    }

    public void clear() {
        if (isEmpty()) {
            System.out.println("The hostel is already empty");
        } else {
            noOfItems = 0;
            System.out.println("Done");
        }
    }

    public String replace(int givenPosition, Person newEntry) {
        if (isEmpty()) {
            return "Nothing the hostel is Empty";
        } else {
            Person oldItem = items[givenPosition - 1];
            items[givenPosition - 1] = newEntry;
            return "you replaced: " + oldItem.name + " \nwith age: " + oldItem.age + " \nand phone number: " + oldItem.phone;
        }

    }

    public String getEntery(int givenPosition) {
        if (isEmpty()) {
            return "Nothing the hostel is Empty";
        } else {
            return "Name is " + items[noOfItems - 1].name + " and Age is " + items[noOfItems - 1].age + " and Phone number is " + items[noOfItems - 1].phone;
        }
    }

    public boolean contains(String anEntry) {
        for (int i = 0; i < noOfItems; i++) {
            if (anEntry.equalsIgnoreCase(items[i].name)) {
                return true;
            }
        }
        return false;

    }
    public static double calculateTotalCost(int nights) {
        final double pricePerNight = 100.0;
        return nights * pricePerNight;
    }

}
