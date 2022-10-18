package Problems;

import java.util.List;

public class Exercise1 {
    public static void main(String[] args) throws Exception {
        List<Integer> list = List.of(12,1223,12312,12,2,3,2213,2,2);
        // print only Odd Numbers from the List
        printOddNumbers(list);
    }

    private static void printOddNumbers(List<Integer> list) {
        list.stream().filter(x->x%2!=0).forEach(System.out::println);
    }
}
