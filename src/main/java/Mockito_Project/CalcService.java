package Mockito_Project;


public class CalcService  {
	
	private AddService addService;
	
	public CalcService(AddService addService) {
		this.addService = addService;
	}

	public int calc(int num1, int num2) {
		System.out.println("**--- CalcService calc executed ---**");
		int sum =num1+num2;
		return sum;
		//return addService.add(num1, num2);
	}

	public int spyCalc(int num1, int num2) {
		System.out.println("**--- CalcService calc executed ---**");
		int sum=num1+num2;
		return sum;
	}

	
	

}
