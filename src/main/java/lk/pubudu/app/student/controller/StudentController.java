package lk.pubudu.app.student.controller;

import lk.pubudu.app.dto.StudentResponse;
import lk.pubudu.app.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
@CrossOrigin
public class StudentController {

    private final StudentService studentService;

    @GetMapping(params = {"q, size, page"}, produces = "application/json")
    public ResponseEntity<StudentResponse> getPaginatedStudentsByQuery(
            @RequestParam String q,
            @RequestParam int size,
            @RequestParam int page) {
        return ResponseEntity.status(HttpStatus.OK).body(studentService.getPaginatedStudentsByQuery(q, size, page));
    }

}
