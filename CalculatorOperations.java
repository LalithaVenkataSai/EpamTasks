public class CalculatorOperations {
	public int add(int a,int b) {
		return a + b;
	}
	public int sub(int a,int b) {
		return a - b;
	}
	public int mul(int a,int b) {
		return a * b;
	}
	public int div(int a,int b) {
		
		if(b == 0)
			throw new ArithmeticException();
		else if(b>a)
		{
		    return 0;
		}
		else 
			return a / b;
	}
}