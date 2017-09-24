package Models;
import java.io.*;
import java.util.ArrayList;
public class FileRead {
	
	public FileRead(){
		
	}
	public  ArrayList<Users> ReadUsersFile(String FileName)
	{
		BufferedReader br = null;
		ArrayList<Users> U= new ArrayList<Users>();;
		try {
			br = new BufferedReader(new FileReader(FileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
		        String line ="" ;

		        while(line != null) {
		        	String name = br.readLine() ;
		        	String password = br.readLine();
		        	String role = br.readLine();
		        	String score = br.readLine();
		        	Users temp = new Users();
		        	temp.setFromFile(name, password, role, score);
		        	
		        	U.add(temp);
		        	line = br.readLine();
		        	System.out.println(name);
		        	System.out.println(password);
		        	System.out.println(role);
		        	System.out.println(score);
		        	
		        }
		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
		        try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		 return U;
	}
	
	public  ArrayList<Questions> ReadQuizFile(String FileName){
		BufferedReader br = null;
		ArrayList<Questions> U= new ArrayList<Questions>();;
		try {
			br = new BufferedReader(new FileReader(FileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
		        String line ="" ;

		        while( line != null) {
		        	String statement = br.readLine() ;
		        	String op1 = br.readLine();
		        	String op2 = br.readLine();
		        	String op3 = br.readLine();
		        	String op4 = br.readLine();
		        	String answer = br.readLine();
		        	String type = br.readLine();  
		        	Questions temp = new Questions();
		        	temp.SetQuestions(statement, op1, op2, op3,op4,answer,type);
		        	
		        	U.add(temp);
		        	line = br.readLine();	        	
		        }
		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
		        try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		 return U;
	}
}
