package com.zzj.dao;


import com.zzj.model.Student;

import java.util.List;

public interface StudentMapper {

    List<Student> findAllStudents();
    Student findStudentById(Integer id);
    void insertStudent(Student student);
}