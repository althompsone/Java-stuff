public class Question{

	String question;
	String answerOne;
	String answerTwo;
	String answerThree;
	String answerFour;
	String answerFive;

	int answerGiven;
	int correctAnswer;

	boolean correctAnswerGiven;

	public Question(String question, String s1, String s2, String s3, String s4, String s5, int cAnswer){
		this.question = question;
		answerOne = s1;
		answerTwo = s2;
		answerThree = s3;
		answerFour = s4;
		answerFive = s5;
		correctAnswer = cAnswer;

		answerGiven = -1;
		correctAnswerGiven = false;
	}

	public void setAnswer(int answerEntered){
		answerGiven = answerEntered;
		if(answerEntered == correctAnswer){
			correctAnswerGiven = true;
		}else{
			correctAnswerGiven = false;
		}
	}

	// Polymoprhism as implementing inherited method from Object class
	public String toString(){
		String str = this.question + "?\n\t" + answerOne + "\t " + answerTwo + "\t " + answerThree + "\t " + answerFour + "\t " + answerFive + "\n "
		+ "Answer given: " + answerGiven + "\n Is is correct: " + correctAnswerGiven;

		return str;
	}

	public static void main(String[] args){
		Question q1 = new Question("What day is today?", "Mon","Tue","Wed","Thur","Fri",5);

		System.out.println(q1.toString());

		q1.setAnswer(5);

		System.out.println(q1.toString());

	}

}