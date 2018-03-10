package com.zzj.test;

import com.zzj.model.Student;
import com.zzj.service.StudentService;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class StudentServiceTest {
    private static StudentService studentService;

    @BeforeClass
    public static void setUp() {
        studentService = new StudentService();
    }

    @AfterClass
    public static void tearDown() {
        studentService = null;
    }

    @Test
    public void testFindAllStudents() {
        List<Student> students = studentService.findAllStudents();
        Assert.assertNotNull(students);
        for (Student student: students) {
            System.out.println(student);
        }
    }

    @Test
    public void testFindStudentById() {
        Student student = studentService.findStudentById(1);
        Assert.assertNotNull(student);
        System.out.println(student);
    }

    @Test
    public void testCreateStudent() {
        Student student = new Student();
        student.setName("1234");
        studentService.createStudent(student);
        testFindAllStudents();
    }
}
