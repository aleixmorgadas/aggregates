package dev.aleixmorgadas.aggregates.domain.course;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(CourseController.URI)
public class CourseController {
    public static final String URI = "/course";

    @GetMapping
    ResponseEntity<List<String>> courses() {
        return ResponseEntity.ok(List.of());
    }
}
