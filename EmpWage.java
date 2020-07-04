import java.util.Random;
public class EmpWage{
	static final int ratePerHour=20;
	static final int fullTime=1;
	static final int partTime=2;
	public void getDailyWage(){
	Random random = new Random();
	int empHour=0;
	int empCheck=random.nextInt(3);
	switch(empCheck){
	case 1: empHour=8;
		break;
	case 2: empHour=4;
		break;
	default: empHour=0;
	}
	System.out.println("Employee hours is " +empHour);
	System.out.println("Daily Wage="+(empHour*EmpWage.ratePerHour));
	}
	public static void main(String[] args){
	System.out.println("Welcome to the Employee Wage Computation");
	EmpWage dailywage = new EmpWage();
	dailywage.getDailyWage();
	}
}
