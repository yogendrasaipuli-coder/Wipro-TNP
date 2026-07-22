package com.mile1.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentServiceTest {

    private StudentReport studentReport;
    private StudentService studentService;

    @Before
    public void setUp() {
        studentReport = new StudentReport();
        studentService = new StudentService();
    }

    @Test
    public void testTC1_GradeA() throws Exception {
        Student student = new Student("Alice", new int[]{85, 90, 95});
        String grade = studentReport.findGrade(student);
        assertEquals("A", grade);
    }

    @Test
    public void testTC2_GradeD() throws Exception {
        Student student = new Student("Bob", new int[]{40, 45, 50});
        String grade = studentReport.findGrade(student);
        assertEquals("D", grade);
    }

    @Test
    public void testTC3_GradeF() throws Exception {
        Student student = new Student("Charlie", new int[]{20, 30, 25});
        String grade = studentReport.findGrade(student);
        assertEquals("F", grade);
    }
}