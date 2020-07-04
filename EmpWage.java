import java.util.Random;
public class EmpWage{
  	private static int ratePerHour;
	private static int fullTime=1;
	private static int partTime=2;
	private static int maxWorkDays;
	private static int fullHrs;
	private static int partHrs;
	private static int maxHours;
	public EmpWage( int ratePerHour, int fullHrs, int partHrs, int maxWorkDays,int maxHours){
		this.ratePerHour = ratePerHour;
     		this.fullHrs = fullHrs;
		this.partHrs = partHrs;
		this.maxWorkDays = maxWorkDays;
		this.maxHours = maxHours;
	}

	public int getEmpHrs(){
	Random random = new Random();
	int empCheck=random.nextInt(3);
	switch(empCheck){
	case 1: 
		return fullHrs;
	case 2: 
		return partHrs;
	}
	 return 0;
     }
	   public int getTotalEmpSalary(){
		int totalWage = 0;
		int workingDays = 0;
		int workingHrs = 0;
		while (workingDays < maxWorkDays && workingHrs < maxHours){
   			int empHrs = getEmpHrs();
     			int dailyWage = 0;
      			dailyWage = ratePerHour * empHrs;
			totalWage = totalWage + dailyWage;
			++workingDays;
			workingHrs = workingHrs + empHrs;
		}
		if (workingHrs > maxHours)
			return ratePerHour * maxHours;
      		return totalWage;
   	}
	public static void main(String[] args){
   		System.out.println("Welcome to Employee Wage..");
    		EmpWage totalSal = new EmpWage( 20, 8, 4, 20, 100);
		totalSal.getTotalEmpSalary();
		System.out.println("Total Salary="+ totalSal.getTotalEmpSalary());	
	}
}
