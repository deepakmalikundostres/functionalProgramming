package Problems;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise4 {
    public static void main(String[] args) throws Exception {
        List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","AZURE","Kubernetes","Docker","PCF");

        // print course containing atleast 4 characters

        coursesContainingAtLeast4Char(courses);

    }
    private static void coursesContainingAtLeast4Char(List<String> courses) {

        courses.stream().filter(course->course.length()>=4).forEach(System.out::println);
    }
}

