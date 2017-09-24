package Models;

public class Users {
	private String name, password , role , score;
	public Users(){
		this.name = "";
		this.password = "";
		this.role ="";
		this.score = "";
	}
	
	public boolean matchPassword(String Password) {
		if(this.password.equals(Password)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void setFromFile(String Name , String Password , String Role , String Score) {
		this.name = Name;
		this.password = Password;
		this.role = Role;
		this.score = Score;
	}
	
	public String getElement (char Ele)/*N R S*/ {
		switch(Ele) {
		case 'N': case'n':
			return this.name;
		case 'R': case 'r':
			return this.role;
		case 'S': case 's':
			return this.score;
		default:
			return "Invalid Option";
		}
	}
	
}
