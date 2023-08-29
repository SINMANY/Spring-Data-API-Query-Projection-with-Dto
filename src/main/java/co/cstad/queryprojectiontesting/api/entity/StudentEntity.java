package co.cstad.queryprojectiontesting.api.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="students")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long id;
    @Column(unique = true, nullable = false)
    private String uuid;
    @Column(name = "username", length = 100)
    private String username;
    @Column(name = "password", length = 100)
    private String password;
    @Column(name = "email", length = 100)
    private String email;

}