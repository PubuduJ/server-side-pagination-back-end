package lk.pubudu.app.student.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = 2033352714005864385L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, columnDefinition = "VARCHAR(100)")
    private String firstName;
    @Column(nullable = false, columnDefinition = "VARCHAR(100)")
    private String lastName;
    @Column(nullable = false)
    private Integer age;
    @Column(nullable = false, columnDefinition = "VARCHAR(50)")
    private String contact;
}
