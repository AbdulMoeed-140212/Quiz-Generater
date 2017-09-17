package Log_In;

import java.util.ArrayList;
import java.io.*;
public class ReadUsers {
	public ArrayList<Login_DataLoad> users =new ArrayList<Login_DataLoad>();
	private String fileName;
	
	ReadUsers() throws IOException{
		fileName = "Auth.txt";
		 BufferedReader br = new BufferedReader(new FileReader(fileName));
		 try {
		        //StringBuilder sb = new StringBuilder();
		        String line ="" ;

		        while (line != null) {
		          //  sb.append(line);
		          //  sb.append("\n");
		        	String name = br.readLine() ;
		        	String password = br.readLine();
		        	boolean role = Boolean.parseBoolean(br.readLine());
		        	String score = br.readLine();
		        	Login_DataLoad temp  = new Login_DataLoad();
		        	temp.setFromFile(name, password, role, score);
		        	line = br.readLine();
		        	
		        	users.add(temp);
		        	temp.print();
		        	
		        }
		    } finally {
		        br.close();
		    }
	}
	
}
