package modelviewcontroller.view;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;

public class ScreenSizeIdentifier {

	private static volatile ScreenSizeIdentifier screenSize;
	private static volatile Rectangle resoulution;

	private ScreenSizeIdentifier() {
		GraphicsDevice defaultDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		resoulution = defaultDevice.getDefaultConfiguration().getBounds();
	}

	public static ScreenSizeIdentifier getInstance() {
		if (screenSize == null) {
			screenSize = new ScreenSizeIdentifier();
		}

		return screenSize;
	}

	public int getSizeHorizontal() {
		return resoulution.width;
	}

	public int getSizeVertical() {
		return resoulution.height;
	}
}
