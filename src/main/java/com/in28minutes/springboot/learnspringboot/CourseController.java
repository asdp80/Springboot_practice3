package com.in28minutes.springboot.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    //course : id, name, author
    @RequestMapping("/courses")
    public List<Course> retrieveAllCoures(){
        return Arrays.asList(
                new Course(1, "Learn AWS", "in28minutes"),
                new Course(2, "Learn JAVA", "in28minutes"),
                new Course(3, "Learn SPRING", "in28minutes"),
                new Course(4, "Learn AZURE", "in28minutes"),
                new Course(5, "Learn PYTHON", "in28minutes"),
                new Course(6, "Learn C++", "in28minutes"),
                new Course(7, "Learn C++", "in28minutes"),
                new Course(8, "Learn C", "in28minutes"),
                new Course(9, "Learn C", "in28minutes"),
                new Course(10, "why don't operate? ", "in28minutes")



        );
    }
}
