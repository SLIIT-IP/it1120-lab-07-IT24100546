import java.util.Scanner;

	public class IT24100546Lab7Q1A{
		public static void main(String[] args){

		double average,sub_mark1,sub_mark2,sub_mark3,sub_mark4;

		Scanner x = new Scanner(System.in);

		System.out.println("Enter mark for four subject: ");

		System.out.print("Enter subject mark 1: ");
		sub_mark1=x.nextDouble();

		System.out.print("Enter subject mark 2: ");
		sub_mark2=x.nextDouble();

		System.out.print("Enter subject mark 3: ");
		sub_mark3=x.nextDouble();

		System.out.print("Enter subject mark 4: ");
		sub_mark4=x.nextDouble();

		average = (sub_mark1+sub_mark2+sub_mark3+sub_mark4)/4.0;
		
		System.out.println();
		System.out.println("Average is: "+average);

		if(average>=75 && average<=100){
			System.out.println("Overall grade is: Distinction");
		}

		else if(average>=50 && average<=74){
			System.out.println("Overall grade is: credit");

		}

		else{
			System.out.println("Overall grade is: fail");

		}



	}
}