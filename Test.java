public class Test{
	private static int count = 0;

	private String firstString = "hi";

	public Test(){
		count++;
		firstString = "Hello world";
	}

	// Getter
	public String getFirstString(){
		return firstString;
	}

	//Setter
	public void setFirstString(String newString){
			firstString = newString;
	}


	public static void main(String[] args){

			//System.out.println(Test.firstString);
			//System.out.println(t1.getFirstString());
			Test t1 = new Test();
			System.out.println(t1.getFirstString());

			Test t2 = new Test();
			System.out.println("t2: " + t2.getFirstString());

			System.out.println("t1: " + t1.getFirstString());

			t2.setFirstString("Whats happening");

			System.out.println("t2: " + t2.getFirstString());

			System.out.println("t1: " + t1.getFirstString());

	}


}