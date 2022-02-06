package org.student;

import org.college.College;
import org.department.Department;
public class Student {
	public void StudentName() {
		System.out.println("Student Name:-Rashmi Bhatt");
}
	public void StudentDept() {
		System.out.println("Student Department:-MCA");
}	
	public void StudentId() {
		System.out.println("Student ID:-123456");
}
	public static void main(String[] args) {
		College college = new College();
		Department dept=new Department();
		Student student=new Student();
		college.collegeName();
		college.collegeRank();
		college.collegeCode();
		dept.deptName();
		student.StudentDept();
		student.StudentId();
		student.StudentName();

	}
}
