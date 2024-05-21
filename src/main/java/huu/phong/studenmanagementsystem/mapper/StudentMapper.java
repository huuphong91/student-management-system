package huu.phong.studenmanagementsystem.mapper;

import huu.phong.studenmanagementsystem.dto.StudentDto;
import huu.phong.studenmanagementsystem.entity.Student;

public class StudentMapper {

    public static StudentDto mapToDto(Student student) {
        StudentDto studentDto = new StudentDto();
        studentDto.setId(student.getId());
        studentDto.setFirstName(student.getFirstName());
        studentDto.setLastName(student.getLastName());
        studentDto.setEmail(student.getEmail());
        return studentDto;
    }

    public static Student mapToEntity(StudentDto studentDto) {
        Student student = new Student();
        student.setId(studentDto.getId());
        student.setFirstName(studentDto.getFirstName());
        student.setLastName(studentDto.getLastName());
        student.setEmail(studentDto.getEmail());
        return student;
    }
}
