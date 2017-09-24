package Test;
import Models.Questions;
import Models.FileRead;
import java.util.ArrayList;
public class TestMAin {

	public static void main(String[] args) {
		System.out.println("NOtihg Added");
		
		ArrayList<Questions> Qlist = new ArrayList<Questions>(); 
		FileRead File = new FileRead();
		
		Qlist = File.ReadQuizFile("Quiz.txt");
		
		for(Questions q:Qlist) {
			System.out.println(q.getStatement());
			System.out.println(q.getOp1());
			System.out.println(q.getOp2());
			System.out.println(q.getOp3());
			System.out.println(q.getOp4());
			System.out.println(q.getAnswer());
			System.out.println(q.getType());
			System.out.println("");
			}
	}

}
