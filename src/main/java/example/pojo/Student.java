package example.pojo;

public class Student {

	private int SId;
	private String SName;
	private String Semail;
	private String SCourse;
	private String SFees;
	public Student() {
		super();
		
	}
	public Student(int sid, String sName, String semail, String sCourse, String sFees) {
		super();
		SId = sid;
		SName = sName;
		Semail = semail;
		SCourse = sCourse;
		SFees = sFees;
	}
	public Student(String sName, String semail, String sCourse,String sFees) {
		super();
		SName = sName;
		Semail = semail;
		SCourse = sCourse;
		SFees = sFees;
	}
	public int getSid() {
		return SId;
	}
	public void setSid(int sid) {
		SId = sid;
	}
	public String getSName() {
		return SName;
	}
	public void setSName(String sName) {
		SName = sName;
	}
	public String getSemail() {
		return Semail;
	}
	public void setSemail(String semail) {
		Semail = semail;
	}
	public String getSCourse() {
		return SCourse;
	}
	public void setSCourse(String sCourse) {
		SCourse = sCourse;
	}
	public String getSFees() {
		return SFees;
	}
	public void setSFees(String sFees) {
		SFees = sFees;
	}
	@Override
	public String toString() {
		return "Student [Sid=" + SId + ", SName=" + SName + ", Semail=" + Semail + ", SCourse=" + SCourse + ", SFees="
				+ SFees + "]";
	}
	
	
	
	
	
	
	
	
		
	
	
}
