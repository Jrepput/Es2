import java.util.Scanner;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner s = new Scanner(System.in);
	
		File f = new File("test.txt");
	 Scanner sfile = new Scanner(f);//Scanner collegato al file

		if(!f.exists()){
			f.createNewFile();
		}else{
			System.out.print("Inserire quanti nomi si vogliono inserire: ");
			int n = s.nextInt();
			PrintWriter fw = new PrintWriter(f);
			s.nextLine();
			for(int i = 0; i < n; i++){				
				System.out.print("Inserire Nome: ");
				String nm = s.nextLine();
				fw.write( nm +"\n" );
        System.out.print("Inserire Eta': ");
				String et = s.nextLine();
				fw.write( et +"\n" );
				}
			fw.close();
		}
     while (sfile.hasNextLine()) { // Lettura del file
        String nm = sfile.nextLine();
        String et = sfile.nextLine();
        int num = Integer.parseInt(et);
        if(num<18){
          System.out.println(nm);
        }
      }
	}

}   