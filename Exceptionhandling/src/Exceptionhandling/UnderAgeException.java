package Exceptionhandling;
public class UnderAgeException extends Exception{
public String getMessage() {
	return "you are too young";
}
}