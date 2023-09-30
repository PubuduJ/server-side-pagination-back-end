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
        int offset = 0;
        if (page != 0) offset = page * size;
        List<Student> studentList = studentRepository.getPaginatedStudentsByQuery(query, size, offset);
        Integer totalCount = studentRepository.getTotalStudentCountForQuery(query);
        return new StudentResponse(totalCount, studentList);
    }

}
