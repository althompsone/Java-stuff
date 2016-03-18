import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class FileReadExample{

	public static void main(String[] args){

		ArrayList studentClass =  new ArrayList<Student>();
		int count = 0;

		try{
			//File f1 = new File("students.dat");
			Scanner sc1 = new Scanner(new File("students.txt")); //new Scanner(f1)
					while (sc1.hasNext()) {
					    int studentNum = sc1.nextInt();
					    //System.out.println(studentNum);
					    String lName = sc1.next();
					    //System.out.println(lName);
					    String fName = sc1.next();
					    //System.out.println(fName);
					   // questionAns[0] = sc1.nextInt();
						int[] questionAns = new int[5];

						for(int i = 0; i < questionAns.length; i++){
							if(sc1.hasNextInt()){
								questionAns[i] = sc1.nextInt();
								 //System.out.println(questionAns[i]);
							}
						}
						Student newStudent = new Student(studentNum, lName, fName, questionAns);
						studentClass.add(newStudent);
					}
		}catch(Exception e){
			e.printStackTrace();
		}

		for (int i = 0; i < studentClass.size(); i++){
			System.out.println(studentClass.get(i).toString());
		}

	}
}