package Oopsconcept;

public class StudentinfoEncapsulation13 {
	//to achieve encapsulation set variable to private
	private String emailid;
	private String pswd;
	
	//we have to make public get and set methods
	public void setemailid(String emailid,String pswd) {
		this.emailid = emailid;
		this.pswd = pswd;
	}
	
	public String getemailid () {
		return emailid;
	}
	public String getpswd() {
		return pswd;
	}

}
