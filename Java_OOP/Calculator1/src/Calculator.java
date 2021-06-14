
public class Calculator {

	public static double OperandOne;
	public String Operation;
	public static double OperandTwo;
	public String performOperation;
	public static double Results;
	
	public Calculator(double Operand1 , double Operand2 , String string) {
		this.OperandOne = Operand1;
		this.OperandTwo=Operand2;
		this.Operation=string;
	}
	
	public static void setOperandOne( double num) {
		OperandOne=num;
	}
	
	public void setOperation(String operation) {
		 this.Operation=operation;
	}
	
	
	public static void setOperandTwo( double num ) {
		OperandTwo=num;
	}
	
	public double getOperandOne() {
		return OperandOne;
	}
	
	public double getOperandTwo() {
		return OperandTwo;
	}
	
	public double performOperation() {
		if (Operation == "+" ) {
			Results = getOperandOne() + getOperandTwo();
	}
		if (Operation == "-" ) {
			Results = getOperandOne() - getOperandTwo();
	}
		return Results;
	}
	
	public void setOperation1(String operation) {
		this.Operation=operation;
	}
	
	static double Results() {
		return Results;
	}
	
	

	public static void main(String[] args) {
		Calculator method = new Calculator(3, 8, "+");
		
	
		method.performOperation();
		System.out.println(method.Results());
		

	}

}
