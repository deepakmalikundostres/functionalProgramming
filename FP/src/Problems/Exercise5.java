package Problems;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise5{
    public static void main(String[] args) throws Exception {
        List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","AZURE","Kubernetes","Docker","PCF");

        // print course containing atleast 4 characters

        coursesContainingAtLeast4Char(courses);

        // print characters in each word

        charactersInEachWord(courses);

    }

    private static void charactersInEachWord(List<String> courses) {
        courses.stream().map(course->course + " " + course.length()).forEach(System.out::println);
    }

    private static void coursesContainingAtLeast4Char(List<String> courses) {

        courses.stream().filter(course->course.length()>=4).forEach(System.out::println);
    }
}

