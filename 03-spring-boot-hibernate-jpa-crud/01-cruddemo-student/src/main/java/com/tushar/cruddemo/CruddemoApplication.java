package com.tushar.cruddemo;

import com.tushar.cruddemo.dao.StudentDAO;
import com.tushar.cruddemo.dao.StudentDAOImpl;
import com.tushar.cruddemo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){

		return runner ->{
//			createStudent(studentDAO);
			createMultipleStudents(studentDAO);
//			readStudent(studentDAO);
//			queryForStudents(studentDAO);
//			queryForStudentsByLastName(studentDAO);
//			updateStudent(studentDAO);
//			deleteStudent(studentDAO);
//			deleteAllStudent(studentDAO);
		};
	}

	private void deleteAllStudent(StudentDAO studentDAO) {
		System.out.println("Deleting all lines");
		int numRowsDeleted = studentDAO.deleteAll();
		System.out.println("Number of rows deleted are " + numRowsDeleted);
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int theId=5;
		System.out.println("Deleting student with id "+ theId);
		studentDAO.delete(theId);

	}

	private void updateStudent(StudentDAO studentDAO) {
		int theId=1;
		System.out.println("Getting student with id " + theId);
		Student myStudent=studentDAO.findById(theId);

		System.out.println("Updating student name to Rahul");
		myStudent.setFirstName("Rahul");
		studentDAO.update(myStudent);
		System.out.println("Updated student is "+ myStudent);
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO){
	List<Student> theStudents = studentDAO.findByLastName("Sharma");

	for (Student tempStudent : theStudents){
		System.out.println(tempStudent);
	}

	}

	private void queryForStudents(StudentDAO studentDAO) {
		// get list of students
			List<Student> theStudents=studentDAO.findAll();
		// display list of students
		for (Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}
	}

	private void readStudent(StudentDAO studentDAO) {
		//	create a student object
		System.out.println("Creating new student");
		Student tempStudent = new Student("Vasu","Sharma","anu@gmail.com");
		//	save the object
		System.out.println("Saving the studens");
		studentDAO.save(tempStudent);
		//	display id of saved student
		int theId= tempStudent.getId();
		System.out.println("saved students generated id : " + theId);
		//	retrieve students based on id
		System.out.print("Retreiving studemt with id "+ theId);
		Student myStudent=studentDAO.findById(theId);
		//	display students
		System.out.println("Found the student : "+ myStudent);
	}

	@Autowired
	StudentDAOImpl studentDAO;

	private  void createMultipleStudents(StudentDAO studentDAO){
		System.out.println("rating 4 new students");
		Student tempStudent0 = new Student("Tushar","Sharma","tushar@gmail.com");
		Student tempStudent1 = new Student("Rajat","Sharma","rajat@gmail.com");
		Student tempStudent2 = new Student("Kajal","Sharma","kajal@gmail.com");
		Student tempStudent3 = new Student("Ankita","Sharma","test@gmail.com");

		studentDAO.save(tempStudent0);
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

	}

//	private void createStudent(StudentDAO studentDAO){
//		System.out.println("rating a new student");
//		Student tempStudent = new Student("Tushar","Sharma","test@gmail.com");
//		System.out.println("Saving the student");;
//		studentDAO.save(tempStudent);
//		System.out.println("Student Saved");
//	}

}
