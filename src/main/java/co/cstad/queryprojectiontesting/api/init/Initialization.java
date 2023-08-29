package co.cstad.queryprojectiontesting.api.init;

import co.cstad.queryprojectiontesting.api.entity.StudentEntity;
import co.cstad.queryprojectiontesting.api.repository.StudentRepository;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
@AllArgsConstructor
public class Initialization {

    private final StudentRepository studentRepository;

    @PostConstruct
    void init() {
        System.out.println("Start Initialize data");

        StudentEntity student = StudentEntity.builder()
                .uuid(UUID.randomUUID().toString())
                .username("many")
                .email("manysin48@gmail.com")
                .password("2329")
                .build();
        studentRepository.saveAll(List.of(student));
    }
}

