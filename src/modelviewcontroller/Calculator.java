package modelviewcontroller;

import modelviewcontroller.view.ScreenSizeIdentifier;
import modelviewcontroller.view.CalculatorFrame;

public class Calculator {

	public static void main(String[] args) {
		ScreenSizeIdentifier screenSize = ScreenSizeIdentifier.getInstance();
		CalculatorFrame frame = new CalculatorFrame(true, screenSize);
	}
}

