package measure;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        String[] s = {"Erna", "Elly", "Laurits", "Bertha", "Christian",
                "August", "Marius", "John", "Tove", "Poul", "Torkild"};
        SortMethods.bubbleSort(s);
        System.out.println(Arrays.toString(s));
    }
}
