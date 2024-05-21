package huu.phong.studenmanagementsystem.service;

import huu.phong.studenmanagementsystem.dto.StudentDto;

import java.util.List;

public interface StudentService {
    List<StudentDto> getAll();

    void createStudent(StudentDto student);

    StudentDto getStudentById(Long studentId);

    void updateStudent(StudentDto studentDto);

    void deleteStudent(Long studentId);

}
