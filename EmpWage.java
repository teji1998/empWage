import java.util.Random;
public class EmpWage{
	public void getWelcomeMessage(){
		System.out.println("Welcome to the employee wage computation");
	}
	public void getAttendance(){
	Random random = new Random();
	int empCheck=random.nextInt(2);
	if(empCheck==1){
		System.out.println("Employee present");
		}
	else{
		System.out.println("Employee absent");
		}
	}
	public static void main(String[] args){
	EmpWage message =new EmpWage();
	message.getWelcomeMessage();
	EmpWage rand = new EmpWage();
	rand.getAttendance();
	}
}
