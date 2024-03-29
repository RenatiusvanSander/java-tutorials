package modelviewcontroller.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import modelviewcontroller.controller.CalculatorController;
import modelviewcontroller.model.CalculatorModel;

public class CalculatorPanel extends JPanel {

	private static final long serialVersionUID = -4679169088169165087L;
	private JButton display;
	private JPanel panel;
	private boolean start;
	private CalculatorController controller;

	public CalculatorPanel() {
		initializeController();
		initializeLayout();
	}

	private void initializeLayout() {
		setLayout(new BorderLayout());
		start = true;
		// Display hinzufügen
		display = new JButton("0");
		display.setEnabled(false);
		// Display oben positionieren
//		add(display, BorderLayout.NORTH);

		panel = new JPanel();
		panel.setLayout(new GridLayout(5, 4));
		// Generierung der numerischen Taschenrechner-Tasten
		panel.add(display);
		addButton("7", controller);
		addButton("8", controller);
		addButton("9", controller);
		addButton("/", controller);

		addButton("4", controller);
		addButton("5", controller);
		addButton("6", controller);
		addButton("*", controller);

		addButton("1", controller);
		addButton("2", controller);
		addButton("3", controller);
		addButton("-", controller);

		addButton("0", controller);
		addButton(".", controller);
		addButton("+", controller);
		addButton("=", controller);

		add(panel, BorderLayout.CENTER);
	}

	/**
	 * Taste in die mittlere Grundfläche einfügen.
	 * 
	 * @param label Beschriftung der Taste
	 */
	private void addButton(String label, ActionListener listener) {
		JButton button = new JButton(label);
		// Ereignisempfänger für die Schaltfläche
		button.addActionListener(listener);
		panel.add(button);
	}
	
	private void initializeController() {
		CalculatorModel model = new CalculatorModel();
		controller = new CalculatorController(model, this);		
	}

	public JButton getDisplay() {
		return display;
	}

	public boolean isStart() {
		return start;
	}

	public void setDisplay(JButton display) {
		this.display = display;
	}

	public void setStart(boolean start) {
		this.start = start;
	}
}