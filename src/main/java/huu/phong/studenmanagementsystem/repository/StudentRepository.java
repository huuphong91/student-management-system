package huu.phong.studenmanagementsystem.repository;

import huu.phong.studenmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
