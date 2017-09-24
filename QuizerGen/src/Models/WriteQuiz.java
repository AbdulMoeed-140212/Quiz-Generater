package Models;
import java.io.*;
public class WriteQuiz {
	File file;
	FileWriter writer;
	String FileName;
	public WriteQuiz(String fileName , String description) {
		try {
		this.FileName = fileName;  
		file = new File(this.FileName+".txt");
			
		// creates the file
		      file.createNewFile();
		      // creates a FileWriter Object
		      writer = new FileWriter(file); 
		      
		      // Writes the content to the file
		      writer.write(fileName+"\r\n"+description+"\r\n"); 
		      writer.flush();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void WriteQuestion(String Question) {
		BufferedWriter bw = null;
		FileWriter fw = null;

		try {
			File file = new File(this.FileName+".txt");

			// if file doesnt exists, then create it
			if (!file.exists()) {
				//file.createNewFile();
				System.out.println("File does not exists");
			}

			// true = append file
			fw = new FileWriter(file.getAbsoluteFile(), true);
			bw = new BufferedWriter(fw);
			bw.append(Question);
			//bw.write(Question);

			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}

	}
}
