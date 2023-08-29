package co.cstad.queryprojectiontesting.api.repository;

import co.cstad.queryprojectiontesting.api.entity.StudentEntity;
import co.cstad.queryprojectiontesting.api.web.StudentDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

    @Query("SELECT new co.cstad.queryprojectiontesting.api.web.StudentDto(s.username, s.email) FROM StudentEntity s WHERE s.username = :username")
    List<StudentDto> findByUsername(String username);



}