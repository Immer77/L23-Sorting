package measure;

public class SortMethods {

    private static void swap(String[] list, int i, int j) {
        String temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
    // Opgave 1
    public static void bubbleSort(String[] array) {
        for(int i = array.length - 1; i >= 0; i--){
            for(int j = 0; j <= i - 1; j++){
                if(array[j].compareTo(array[j + 1]) > 0){
                    swap(array,j,j+1);
                }
            }
        }
    }
    
    public static void insertionSort(String[] list) {
        for (int i = 1; i < list.length; i++) {
            String next = list[i];
            int j = i;
            boolean found = false;
            while (!found && j > 0) {
                if (next.compareTo(list[j - 1]) > 0) {
                    found = true;
                } else {
                    list[j] = list[j - 1];
                    j--;
                }
            }
            list[j] = next;
        }
    }
    
    public static void selectionSort(String[] list) {
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
