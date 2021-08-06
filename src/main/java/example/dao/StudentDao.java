package example.dao;

import java.sql.SQLException;

import example.pojo.Student;

public interface StudentDao {
	
	int insertStudent(Student student) throws SQLException;
	
	int updateStudent(Student student) throws SQLException;
	
	int deleteStudent(Student student)throws SQLException;

}
