package programming;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) throws Exception {
        printAllNumbersInListFunctional(List.of(1, 2, 3));
    }

    private static void printAllNumbersInListFunctional(List<Integer> list) {
        // first convert list to stream of numbers
        // [1 2 3]
        // 1
        // 2
        // 3 ... stream of numbers

        list.stream().forEach(FP01Functional::printNumber);
    }
    private static void printNumber(int num){
        System.out.println("Number: " + num);
    }
}
