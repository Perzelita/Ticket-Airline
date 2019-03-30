
import java.util.Scanner;//input import
import java.sql.Timestamp;

public class PrintBoardingPass {

	static void printde(Demostic a) {//Polymorphism Method
		System.out.println(a.BoardingPass());
	}
	static void printda(Dateandmin b)
	{System.out.println(b.BoardingPass());}
	static void printdet(Details c)
	{System.out.println(c.BoardingPass());}
	public static void main(String args[]){
		Scanner cin=new Scanner (System.in);
		System.out.println("MODE PRINT BOARDING PASS FOR DOMOSITC AIRPORT ");
		System.out.print("ARRIVAL : " );
		String ar= cin.nextLine();//input
		System.out.print("DEPARTURE : " );
		String de= cin.nextLine();//input
		System.out.print("AIRLINES : " );
		String ai= cin.nextLine();//input
		System.out.print("FLIGHT EG(SHORT AIRLINESNAME-SERIAL) : " );
		String fi= cin.nextLine();//input
		System.out.println("\n------------------------------- \n " );
		System.out.println("TIMES : " );
		System.out.println("ARRIVAL TIME EX:16/4/2017 13:45 IS 16420171345 : " );
		System.out.print("DAY : " );
		int ad= cin.nextInt();//input
		System.out.print("MONTH :" );
		int am= cin.nextInt();//input
		System.out.print("YEAR : " );
		int ay= cin.nextInt();//input
		System.out.println("TIMES  " );
		System.out.print("HOUR : " );
		int ah= cin.nextInt();//input
		System.out.print("MIN: " );
		int ami= cin.nextInt();//input
		System.out.println("\n------------------------------- " );
		System.out.println("DEPARTURE TIME EX:16/4/2017 14:55 IS 16420171455 : " );
		System.out.print("DAY : " );
		int dd= cin.nextInt();//input
		System.out.print("MONTH :" );
		int dm= cin.nextInt();//input
		System.out.print("YEAR : " );
		int dy= cin.nextInt();//input
		System.out.println("TIMES  " );
		System.out.print("HOUR : " );
		int dh= cin.nextInt();//input
		System.out.print("MIN: " );
		int dmi= cin.nextInt();//input
		System.out.println("\n-------------------------------  " );
		System.out.println("DETAILS  " );
		String dd1=cin.nextLine();//input
		System.out.print("NAME FIRST-FAMILY :  " );
		String na=cin.nextLine();//input
		System.out.print("SEAT EX  A2 :  " );
		String se= cin.nextLine();//input
		
		System.out.print("GATE EX: GATE-A41 :  " );
		String ga= cin.nextLine();//input
		System.out.println("\n------------------------------- \n " );
		System.out.println("PROCESS....................... " );
		System.out.println("\n------------------------------- \n " );
		System.out.println("******************************* \n " );
		System.out.println("DONE \n" );
		System.out.println("------------------------------------------------------------- \n " );
		//Polymorphism Method
		printde(new Demostic(ar, de, ai, fi));
		printda(new Dateandmin(ar, de, ai, fi, ad, am, ay, ah, ami, dd, dm, dy, dh, dmi));
		printdet(new Details(ar, de, ai, fi, na, se, ga));
		//Polymorphism Method Print out time currents.
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.print("Print in :");
        System.out.print(timestamp);
        System.out.print("\n");

		System.out.println("------------------------------------------------------------- \n " );
       
        
		
		/*printde(new Demostic("KHONKAEN", "DONMEUGN", "THAIAIRWAYS", "TG53-0"));
		printda(new Dateandmin("KHONKAEN", "DONMEUGN", "THAIAIRWAYS", "TG53-0" ,3, 5, 1995, 15, 5, 21, 5, 1996, 10, 00));
		printdet(new Details("KHONKAEN", "DONMEUGN", "THAIAIRWAYS", "TG53-0",  "Perzelita Kon", "T35", "D39"));*/
	} 
}
