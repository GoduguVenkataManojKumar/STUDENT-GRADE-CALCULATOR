package CodSoft_Programs;

import java.util.*;
public class Student_Grade {
	public static void main(String[] args) {
		int Telugu;
		int Hindi;
		int English;
		int Maths;
		int Science;
		int Social;		
		
		int total = 0;
		float Average = 0.0f;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Marks in Telugu : ");
		Telugu  = sc.nextInt();
		System.out.println("Enter Marks in Hindi : ");
		Hindi = sc.nextInt();
		System.out.println("Enter Marks in English : ");
		English = sc.nextInt();
		System.out.println("Enter Marks in Maths : ");
		Maths = sc.nextInt();
		System.out.println("Enter Marks in Science : ");
		Science = sc.nextInt();
		System.out.println("Enter Marks in Social");
		Social = sc.nextInt();
		
		total = Telugu+Hindi+English+Maths+Science+Social;
		
		Average = (total)/6.0f;
		
		System.out.println("Total Marks = "+total);
		System.out.println("Average Marks = "+Average);
		
		if(Telugu<35||Hindi<35||English<35||Maths<35||Science<35||Social<35) {
			System.out.println("The Student Failed ...");
		}
		else {
		
		if(Average>90) {
			System.out.println("The Student passed in Distinction");
		}
		else if(Average>80) {
			System.out.println("The Student Passed with A+ grade....");
			
		}
		else if(Average>70) {
			System.out.println("The Student Has Passed with A Grade : ");
		}
		else if(Average>60) {
			System.out.println(" The Student Has Passed with B+ Grade :");
		}
		else if(Average>50) {
			System.out.println("The Student Has Passed with  B Grade :");
		}
		else if(Average>40) {
			System.out.println("The Student Has Passed with C+ Grade :");
		}
		else if(Average>=35) {
			System.out.println("The Student Has Passed with C Grade :");
		}
		}
		
		
		
		
	}
		
	}
	
	


