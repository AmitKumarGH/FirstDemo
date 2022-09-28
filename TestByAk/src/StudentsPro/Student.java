package StudentsPro;

public class Student {
	private int studentid;
	private String studentname;
	private String studentphone;
	private String studentcity;
	public Student(int studentId, String studentName, String studentPhone, String studentCity) {
		super();
		this.studentid = studentId;
		this.studentname = studentName;
		this.studentphone = studentPhone;
		this.studentcity = studentCity;
	}
	public Student(String studentName, String studentPhone, String studentCity) {
		super();
		this.studentname = studentName;
		this.studentphone = studentPhone;
		this.studentcity = studentCity;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentphone() {
		return studentphone;
	}
	public void setStudentphone(String studentphone) {
		this.studentphone = studentphone;
	}
	public String getStudentcity() {
		return studentcity;
	}
	public void setStudentcity(String studentcity) {
		this.studentcity = studentcity;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentphone=" + studentphone
				+ ", studentcity=" + studentcity + "]";
	}
}
