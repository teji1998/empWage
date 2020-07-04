import java.util.Random;
public class EmpWage{
	static final int ratePerHour=20;
	static final int fullTime=1;
	static final int partTime=2;
	static final int workDays=20;
	public void getMonthlyWage(){
	Random random = new Random();
	int empHour=0;
	int totalHrs=0;
	for(int i=0; i<workDays; i++) {
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
	totalHrs+=empHour;
	}
	System.out.println("Monthly Wage= "+(totalHrs*EmpWage.ratePerHour));
	}
	public static void main(String[] args){
	System.out.println("Welcome to the Employee Wage Computation");
	EmpWage monthlywage = new EmpWage();
	monthlywage.getMonthlyWage();
	}
}
