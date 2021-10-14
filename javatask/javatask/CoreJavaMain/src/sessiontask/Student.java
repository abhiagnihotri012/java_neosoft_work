package sessiontask;


public class Student
{
    private int studentId;
    private String studentName, emailId;
    private String mobile;
    
    public Student(int studentId, String studentName, String emailId,String mobile)
    {
        this.emailId=emailId;
        this.studentName=studentName;
        this.studentId=studentId;
        this.mobile=mobile;
    }

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
    

}