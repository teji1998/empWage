import java.util.Random;
public class EmpWage{
	static final int ratePerHour=20;
	static final int fullTime=1;
	static final int partTime=2;
	static final int workDays=20;
	static final int maxHours=100;
	public void getTotalSal(){
	Random random = new Random();
	int empHour=0;
	int totalHrs=0;
	int diff=0;
	int totalWorkDays=0;
	while(totalHrs <= maxHours && totalWorkDays <= workDays) {
	totalWorkDays++;
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
	if(totalHrs>100);
		diff=totalHrs-100;
		empHour=diff;	
	}
	System.out.println("Day "+ totalWorkDays + " Hours: " + totalHrs );
	System.out.println("Total Salary= "+(totalHrs*EmpWage.ratePerHour));
	}
	public static void main(String[] args){
	System.out.println("Welcome to the Employee Wage Computation");
	EmpWage totalSal = new EmpWage();
	totalSal.getTotalSal();
	}
}
