package member.model;

public class Member {
	private String userid;
	private String passwd;
	private String username;
	private int age;
	private String salary;
	
	public Member() {}
	

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public String disp() {
		return "아이디 : " + userid 
				+ "\t 비밀번호 : " + passwd
				+ "\t 이름 : " + username
				+ "\t 나이 : " + age
				+ "\t 급여 : " + salary;
	}
	

}
