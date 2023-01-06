package Exceptionhandling;

import java.util.Scanner;

public class DrivingLisence {
int age;
void acceptInput()
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter you age");
	age = scan.nextInt();
	
}

void checkAge ()throws Exception
{
	if (age < 18)
	{
		UnderAgeException uae = new UnderAgeException();
		System.out.println(uae.getMessage());
		throw uae;
		
	}else if(age > 65){
		OverAgeException oae = new OverAgeException();
		System.out.println(oae.getMessage());
		throw oae;
	}else {
		System.out.println("Take your");
	}
}
}
