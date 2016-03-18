public class Student{

	private int studentNum;
	private String lName, fName;
	private int[] questionAns;

	public Student(int studentNum, String lName, String fName, int[] questionAns){
		this.studentNum = studentNum;
		this.lName = lName;
		this.fName = fName;
		this.questionAns = questionAns;
	}

	//Getter for each instance var
	public int getStudentNum(){
		return studentNum;
	}

	public int[] getQuestionAns(){
		return questionAns;
	}

	public String toString(){
		String s = "Student num: " + studentNum + " " + lName + " " + fName;
		for(int i = 0; i < questionAns.length; i++){
			s += " " + questionAns[i];
		}
		return s;
	}

}