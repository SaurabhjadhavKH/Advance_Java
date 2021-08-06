package example.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import example.dao.StudentDao;
import example.dao.StudentDaoImpl;
import example.pojo.Student;


@WebServlet("/FirstServelet")
public class FirstServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	StudentDao  dao = new StudentDaoImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Student std = new Student("Saggy" ,"saggy@gmail.com","DS","5000");
		
		
		// ======================Insert====================//
		
//	int	SInserted = 0;
//		
//		StudentDao  dao = new StudentDaoImpl();
//		
//		try {
//			SInserted=dao.insertStudent(std);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//
//		System.out.println("Request received");
//		
//		System.out.println("Inserted="+SInserted);
		
		
		// ==========================================//
		
		
		
		// ======================Update====================//
		int noOfStudentsUpdated =0;
		
		Student  obj= new Student();
		obj.setSid(2);
		
		obj.setSCourse("WEB");
		
		obj.setSFees("50000");
		
		
		try {
			 noOfStudentsUpdated= dao.updateStudent(obj);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Update="+ noOfStudentsUpdated);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
