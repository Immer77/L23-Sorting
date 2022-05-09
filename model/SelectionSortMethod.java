package model;

// Opgave 2
public class SelectionSortMethod {
    private static void swapStrings(String[] list, int i, int j) {
        String temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    public static void selectionSortString(String[] list) {
        for (int i = 0; i < list.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < list.length; j++) {
                if(list[j].compareTo(list[minPos]) < 0){
                    minPos = j;
                }
            }
            swapStrings(list, i, minPos);
        }
    }
    private static void swap(Customer[] list, int i, int j) {
        Customer temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    public static void selectionSortCustomer(Customer[] list) {
        for (int i = 0; i < list.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < list.length; j++) {
                if(list[j].compareTo(list[minPos]) < 0){
                    minPos = j;
                }
            }
            swap(list, i, minPos);
        }
    }

}
