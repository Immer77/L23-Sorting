package model;

import sortering.SelectionSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        Customer c1 = new Customer("Immersen", "Peter", 24);
        Customer c2 = new Customer("Hove", "Anne-Kirstine", 24);
        Customer c3 = new Customer("Hove", "Børge", 24);
        Customer c4 = new Customer("Ladefoged", "Susanne", 24);

        Customer[] cArray = {c1, c2, c4, c3};

        String[] s = {"Erna", "Elly", "Laurits", "Bertha", "Christian",
                "August", "Marius", "John", "Tove", "Poul", "Torkild"};

        // Opgave 2
//        SelectionSortMethod.selectionSortCustomer(cArray);
//        SelectionSortMethod.selectionSortString(s);
//        System.out.println(Arrays.toString(cArray));
//        System.out.println(Arrays.toString(s));

        // Opgave 3
        InsertionSortMethod.insertioneSortString(s);
        InsertionSortMethod.insertioneSortCustomer(cArray);
        System.out.println(Arrays.toString(cArray));
        System.out.println(Arrays.toString(s));

        // Opgave 4
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(c1);
        customers.add(c4);
        customers.add(c3);
        customers.add(c2);
        System.out.println(customers);
        Collections.sort(customers);
        System.out.println(customers);

    }
}
