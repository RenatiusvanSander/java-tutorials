package modelviewcontroller.model;

public class CalculatorModel {

	private String displayText;
	
	private double result = 0.0;
	
	private String lastCommand = "=";

	public double getResult() {
		return result;
	}

	public String getLastCommand() {
		return lastCommand;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public void setLastCommand(String lastCommand) {
		this.lastCommand = lastCommand;
	}

	public String getDisplayText() {
		return displayText;
	}

	public void setDisplayText(String displayText) {
		this.displayText = displayText;
	}
	
	public void calculate(double x) {
		switch (lastCommand) {
		case "+": {
			result += x;
			break;
		}
		case "-": {
			result -= x;
			break;
		}
		case "*": {
			result *= x;
			break;
		}
		case "/": {
			result /= x;
			break;
		}
		case "=": {
			result = x;
			break;
		}
		}
	}
}