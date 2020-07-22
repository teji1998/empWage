import java.util.Random;
public class EmpWage{
  	private final int ratePerHour;
	private final int fullTime=1;
	private final int partTime=2;
	private final int maxWorkDays;
	private final int fullHrs;
	private final int partHrs;
	private final int maxHours;
	private final String company;
	public EmpWage(String company, int ratePerHour, int fullHrs, int partHrs, int maxWorkDays,int maxHours){
		this.ratePerHour = ratePerHour;
     		this.fullHrs = fullHrs;
		this.partHrs = partHrs;
		this.maxWorkDays = maxWorkDays;
		this.maxHours = maxHours;
		this.company=company;
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
	    		EmpWage empDMart = new EmpWage("DMart", 20, 8, 4, 20, 100);
			EmpWage empReliance = new EmpWage("Reliance", 24, 9, 5, 25, 120);
			EmpWage empBigBasket = new EmpWage("BigBasket", 20, 8, 5, 24, 120);
	      		System.out.println("Employee Total wage of Company: "+ empDMart.company +" and month wage is: "+empDMart.getTotalEmpSalary());
			System.out.println("Employee Tatal wage of Company: "+ empReliance.company +" and month wage is: "+ empReliance.getTotalEmpSalary());
			System.out.println("Employee Tatal wage of Company: "+ empBigBasket.company +" and month wage is: "+ empBigBasket.getTotalEmpSalary());
	   	}
	}

