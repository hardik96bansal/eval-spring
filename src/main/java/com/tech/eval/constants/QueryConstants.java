package com.tech.eval.constants;

public class QueryConstants {
    
    //public static final String coursesOfStudent1 = "SELECT NAME FROM Course WHERE id IN (SELECT ID FROM CourseStudent WHERE STUDENT_ID = :id)";
    //public static final String coursesOfStudent = "select Name from Course where ID in (1,2)";
    public static final String coursesOfStudent = "select Name from Course where ID in (SELECT courseId FROM CourseStudent WHERE studentId = :id)";
    public static final String studentsOfInstructor = "select FirstName from Student where ID in (select studentId from CourseStudent where courseId in (select ID from Course where InstructorId = :id))";
    public static final String totalCourseDurationOfStudent = "select sum(Duration) from Course where ID in (SELECT courseId FROM CourseStudent WHERE studentId = :id)";
}
