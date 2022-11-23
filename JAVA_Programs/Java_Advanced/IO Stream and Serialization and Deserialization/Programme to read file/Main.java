package Question_2;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("E://abc.txt");
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		while(line != null){
		System.out.println(line);
		line=br.readLine();
		}
		br.close();
		}


}
