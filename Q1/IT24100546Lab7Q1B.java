import java.util.Scanner;

	public class IT24100546Lab7Q1B{
		public static void main(String[] args){

		double average,sub_mark1,sub_mark2,sub_mark3,sub_mark4;

		Scanner x = new Scanner(System.in);

		int number_of_students = 3;

		for(int i=1; i<=number_of_students; i++){
		
			System.out.println("Student "+i);
			System.out.print("Enter marks: ");

			sub_mark1 = x.nextDouble();
			sub_mark2 = x.nextDouble(); 
			sub_mark3 = x.nextDouble();
			sub_mark4 = x.nextDouble();

		
		average = (sub_mark1+sub_mark2+sub_mark3+sub_mark4)/4.0;
		
			System.out.println("Average is: "+average);

		if(average>=75 && average<=100){
			System.out.println("Overall grade is: Distinction");
			System.out.println();
		}

		else if(average>=50 && average<=74){
			System.out.println("Overall grade is: credit");
			System.out.println();

		}

		else{
			System.out.println("Overall grade is: fail");
			System.out.println();

		}

		}

	}
}