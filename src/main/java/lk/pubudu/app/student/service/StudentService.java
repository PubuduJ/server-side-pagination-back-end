package lk.pubudu.app.student.service;

import lk.pubudu.app.dto.StudentResponse;
import lk.pubudu.app.student.entity.Student;
import lk.pubudu.app.student.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentResponse getPaginatedStudentsByQuery(String q, int size, int page) {
        String query = "%".concat(q).concat("%");
        int offset = (page - 1) * size;
        List<Student> studentList = studentRepository.getPaginatedStudentsByQuery(query, size, offset);
        StudentResponse studentResponse = new StudentResponse();
        return null;
    }

}
