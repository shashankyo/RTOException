package Exceptionhandling;

public class RTO {
void initiate()
{
	DrivingLisence dl = new DrivingLisence();
	try
	{
		dl.acceptInput();
		dl.checkAge();
		
	}
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
