package Task3;

import java.util.ArrayList;

public class Main {
    public  static void main(String[] args) {
        Customer customerUN1 = new Customer("a","b");
        Customer customerUN2= new Customer("c","d");
        Customer customerUN3 = new Customer("e","f");
        Customer customerUN4 = new Customer("g","h");
        Customer customerUN5 = new Customer("i","j");
        Customer customerUN6 = new Customer("k","l");
        customers.add(customerUN1);
        customers.add(customerUN2);
        customers.add(customerUN3);
        customers.add(customerUN4);
        customers.add(customerUN5);
        customers.add(customerUN6);
        printCustomers(customers);


    }
    private static void printCustomers(ArrayList<Customer>customers){
        for (Customer customerUN1: customers) {
            System.out.println(customerUN1);
        }
     }


    public static ArrayList<Customer> customers = new ArrayList<>();

}
