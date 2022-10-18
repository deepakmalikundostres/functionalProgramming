package programming;

import java.util.List;

public class FP01Structured {
    public static void main(String[] args) throws Exception {
        printAllNumbersInList(List.of(1, 2, 3));
    }

    private static void printAllNumbersInList(List<Integer> list) {

         // first way
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // second way
        for (Integer num : list) {
            System.out.println(num);
        }
    }
}
