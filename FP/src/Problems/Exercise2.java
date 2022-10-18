package Problems;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {
    public static void main(String[] args) throws Exception {
        List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","AZURE","Kubernetes","Docker","PCF");

        // print all courses individually

        courses.stream().forEach(System.out::println);

        //or

        courses.forEach(System.out::println);


    }

}
