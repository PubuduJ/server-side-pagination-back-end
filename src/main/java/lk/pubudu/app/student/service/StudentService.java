package lk.pubudu.app.student.service;

import lk.pubudu.app.dto.StudentResponse;
import lk.pubudu.app.student.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentResponse getPaginatedStudentsByQuery(String q, int size, int page) {
        return null;
    }

}
