package org.student;



public class Student extends org.department.Department {
	public void studentName() {
		System.out.println("Suja");
	}
	public void studentDept() {
		System.out.println("Elctronics");
	}
	public void studentId() {
		System.out.println("6407");
		
	}
	
	
	
	
	public static void main(String[] args) {
		Student obj = new Student();
		obj.collegeCode();
		obj.collegeName();
		obj.deptName();
		obj.collegeRank();
		obj.studentDept();
		obj.studentId();
		obj.studentName();
	}
	}
