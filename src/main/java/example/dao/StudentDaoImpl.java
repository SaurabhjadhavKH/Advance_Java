package example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import example.pojo.Student;

public class StudentDaoImpl implements StudentDao {
	
	public StudentDaoImpl(){
		
	}

	private final String INSERT_STUDENT="insert into newstudent (SName , Semail , SCourse ,SFees) values(?,?,?,?)";
	
	private final String UPDATE_STUDENT ="update newstudent set SCourse=? , SFees=? where SId=?";
	
	

	@Override
	public int insertStudent(Student std) throws SQLException {
		
		
		
		// Start
		
		int noOfStudentsInserted = 0;
		Connection con = null;
		PreparedStatement pStmt =null;
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "cdac");
			
			 
		
			
			
			
			pStmt=con.prepareStatement(INSERT_STUDENT);
			

			pStmt.setString(1, std.getSName());
			pStmt.setString(2, std.getSemail());
			pStmt.setString(3, std.getSCourse());
			pStmt.setString(4, std.getSFees());
			
			noOfStudentsInserted =pStmt.executeUpdate();
			
			
			
			
		System.out.print("\n No Of Student Records Inserted: " + noOfStudentsInserted);
			
			}catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			
			
			try {
				
				if(pStmt!=null)
					con.close();
			
			
			if(con!=null)
				con.close();
				} catch (SQLException e) {
			
				e.printStackTrace();
			}
		}
		
		
		
		//End
		return noOfStudentsInserted ;
	}



	@Override
	public int updateStudent(Student std) throws SQLException {

		
		int noOfStudentsUpdated = 0;
		// Start
		
		int noOfStudentsInserted = 0;
		Connection con = null;
		PreparedStatement pStmt =null;
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "cdac");
			
			 
		
			
			
			
			pStmt=con.prepareStatement(UPDATE_STUDENT);
			

			
			
			pStmt.setString(1, std.getSCourse());
			pStmt.setString(2, std.getSFees());
			pStmt.setInt(3, std.getSid());
			
			noOfStudentsUpdated =pStmt.executeUpdate();
			
			
			
			
		System.out.print("\n No Of Student Records Inserted: " + noOfStudentsUpdated);
			
			}catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			
			
			try {
				
				if(pStmt!=null)
					con.close();
			
			
			if(con!=null)
				con.close();
				} catch (SQLException e) {
			
				e.printStackTrace();
			}
		}
		
		
		
		//End
		
		
		
		
		
		
		return noOfStudentsUpdated;
	}



	@Override
	public int deleteStudent(Student student) throws SQLException {
		
		return 0;
	}

}
