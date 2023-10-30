package modelviewcontroller.view;

import javax.swing.JFrame;

public class CalculatorFrame extends JFrame {

	private static final String FRAME_TITLE = "Calculator";
	private static final long serialVersionUID = -1480906346410907794L;

	public CalculatorFrame() {
		initializeCalculatorFrame(true);
	}

	public CalculatorFrame(boolean isFrameVisible) {
		initializeCalculatorFrame(isFrameVisible);
	}

	public CalculatorFrame(boolean isFrameVisible, ScreenSizeIdentifier screenSize) {
		initializeCalculatorFrame(isFrameVisible, screenSize);
	}

	private void initializeCalculatorFrame(boolean isFrameVisible, ScreenSizeIdentifier... screenSize) {
		setVisible(isFrameVisible);
		setTitle(FRAME_TITLE); // Name der Titelleiste
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		CalculatorPanel panel = new CalculatorPanel();
		add(panel);
		
		if (screenSize.length > 0) {
//			setSize(ApplicationConstants.HORINZONTAL_SCREEN_SIZE, ApplicationConstants.VERTICAL_SCREEN_SIZE);
			setSize(screenSize[0].getSizeHorizontal(), screenSize[0].getSizeVertical());
		}
		
//		pack();
	}
}