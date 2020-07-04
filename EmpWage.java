import java.util.Random;
public class EmpWage{
	static final int ratePerHour=20;
	public void getWelcomeMessage(){
		System.out.println("Welcome to the employee wage computation");
	}
	public void getDailyWage(){
	Random random = new Random();
	int empHour=0;
	int empCheck=random.nextInt(2);
	if(empCheck==1){
		empHour=8;
		}
	else{
		empHour=0;
		}
	System.out.println("Daily Wage="+(empHour*EmpWage.ratePerHour));
	}
	public static void main(String[] args){
	EmpWage message =new EmpWage();
	message.getWelcomeMessage();
	EmpWage dailywage = new EmpWage();
	dailywage.getDailyWage();
	}
}
