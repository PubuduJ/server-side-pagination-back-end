package lk.pubudu.app.dto;

import lk.pubudu.app.student.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentResponse implements Serializable {
    @Serial
    private static final long serialVersionUID = -4263298977960524127L;
    private Integer totalCount;
    private List<Student> studentList;
}
