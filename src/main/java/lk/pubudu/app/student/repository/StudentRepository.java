package lk.pubudu.app.student.repository;

import lk.pubudu.app.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query(value = """
            SELECT * FROM student
            WHERE id LIKE ?1 OR
            first_name LIKE ?1 OR
            last_name LIKE ?1 OR
            age LIKE ?1 OR
            contact LIKE ?1
            LIMIT ?2
            OFFSET ?3""", nativeQuery = true)
    List<Student> getPaginatedStudentsByQuery(String query, int limit, int offset);

}
