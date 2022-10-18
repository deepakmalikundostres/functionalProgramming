package programming;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) throws Exception {
        printAllNumbersInListFunctional(List.of(1, 2, 3));
        printEvenNumbersInListFunctionalUsingFilter(List.of(1,2,3,4,5,120,1232));
    }

    private static void printEvenNumbersInListFunctionalUsingFilter(List<Integer> list) throws Exception {

        list.stream().filter(FP01Functional::isEven).forEach(FP01Functional::printNumber);
        // different way to print even numbers in lists
        list.stream().filter(num-> num%2==0).forEach(FP01Functional::printNumber);

        // or
        list.stream().filter(num-> num%2==0).forEach(System.out::println);

    }

    private static boolean isEven(Integer integer) {
        return integer%2==0;
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
