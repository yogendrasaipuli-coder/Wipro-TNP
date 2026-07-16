package service;

import bean.Student;
import exception.NullMarksArrayException;
import exception.NullNameException;
import exception.NullStudentObjectException;

public class StudentService {

    public int findNumberOfNullMarksArray(Student[] students) {
        int count = 0;
        StudentReport report = new StudentReport();

        for (Student s : students) {
            try {
                report.validate(s);
            } catch (NullMarksArrayException e) {
                count++;
            } catch (NullNameException e) {
            } catch (NullStudentObjectException e) {
            }
        }
        return count;
    }

    public int findNumberOfNullNames(Student[] students) {
        int count = 0;
        StudentReport report = new StudentReport();

        for (Student s : students) {
            try {
                report.validate(s);
            } catch (NullNameException e) {
                count++;
            } catch (NullMarksArrayException e) {
               
            } catch (NullStudentObjectException e) {
                
            }
        }
        return count;
    }

    public int findNumberOfNullObjects(Student[] students) {
        int count = 0;
        StudentReport report = new StudentReport();

        for (Student s : students) {
            try {
                report.validate(s);
            } catch (NullStudentObjectException e) {
                count++;
            } catch (NullMarksArrayException e) {
                
            } catch (NullNameException e) {
                
            }
        }
        return count;
    }
}