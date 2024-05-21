package huu.phong.studenmanagementsystem.service.impl;

import huu.phong.studenmanagementsystem.dto.StudentDto;
import huu.phong.studenmanagementsystem.entity.Student;
import huu.phong.studenmanagementsystem.mapper.StudentMapper;
import huu.phong.studenmanagementsystem.repository.StudentRepository;
import huu.phong.studenmanagementsystem.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public List<StudentDto> getAll() {
        List<Student> students = studentRepository.findAll();
        return students.stream().map(StudentMapper::mapToDto).toList();
    }


    @Override
    public void createStudent(StudentDto studentDto) {
        Student student = StudentMapper.mapToEntity(studentDto);
        studentRepository.save(student);
    }

    @Override
    public StudentDto getStudentById(Long studentId) {
        Student student = studentRepository.findById(studentId).get();
        StudentDto studentDto = StudentMapper.mapToDto(student);
        return studentDto;
    }

    @Override
    public void updateStudent(StudentDto studentDto) {
        studentRepository.save(StudentMapper.mapToEntity(studentDto));
    }

    @Override
    public void deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
    }
}
