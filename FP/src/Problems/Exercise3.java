package Problems;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {
    public static void main(String[] args) throws Exception {
        List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","AZURE","Kubernetes","Docker","PCF");

        // print course containing Spring

        coursesContainingSpringWord(courses);

    }
    private static void coursesContainingSpringWord(List<String> courses) {

        courses.stream().filter(course->course.contains("spring")).forEach(System.out::println);
    }
}

