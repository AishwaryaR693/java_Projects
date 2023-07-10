package sdbs;

import java.util.Scanner;

import CustomeExceptions.InvalidchoiceException;

public class Solution {

	public static void main(String[] args) {
		//Scanner
		//sms=smsimpl -> upcasting
		//infinateloop
		//menu Diven program --> display 1: add student .... 11: exit
		//switch --> case1...11&default
		
		System.out.println("welcom to StudentManagementSystem");
		System.out.println("---------------------");
		//System.out.println("");
		Scanner scan=new Scanner(System.in);
	
		
		 Student_management_System sms=new Student_management_System_impli();
		 
		 while(true) {
		System.out.println("1 :addStudent\n2 :displayStudent\n3 :displayAllStudent\n4 :removeStudent\n5 :removeAllStudent ");
		System.out.println("6 :updateStudent\n7 :countStudent\n8 :sotStudent\n9 :getStudentWithHighesMaarks\n10 :getStudentWithLowesMaarks ");
		System.out.println("11 :Exite");
		
		
		int choice =scan.nextInt();
		
		//Switch starts from here
		switch (choice) {
		case 1:
			sms.addStudent();
			
			break;
			
        case 2:
			sms.displayStudent();
			
			break;
			
        case 3:
	sms.displayAllStudent();
	
	break;

     case 4:
			sms.removeStudent();
			
			break;	
			
     case 5:
			sms.removeAllStudent();
			
			break; 
			
			
     case 6:
			sms.updateStudent();
			
			break;
			
     case 7:
			sms.countStudent();
			
			break;
			
			
     case 8:
			sms.sotStudent();
			
			
			break;
			
     case 9:
			sms.getStudentWithHighesMaarks();
			
			break;
			
			
     case 10:
			sms.getStudentWithLowesMaarks();
			
			break;
			
     case 11:
			System.out.println("Exit");
			System.exit(0);
			
			break;
			
		default:
			//package -> custom exception
			//invalidChoiceException
			
			try {
				String message="invalid choice,kindly enter a valid choice";
				throw new InvalidchoiceException(message);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
		}// end of switch
	} // end of while
		
		
	}// end of main
	
}// end of class
	
	
	
