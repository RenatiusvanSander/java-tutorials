package modelviewcontroller.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelviewcontroller.model.CalculatorModel;
import modelviewcontroller.view.CalculatorPanel;

public class CalculatorController implements ActionListener {
	private CalculatorModel model;
	private CalculatorPanel viewPanel;

	public CalculatorController() {

	}

	public CalculatorController(CalculatorModel model, CalculatorPanel panel) {
		this.model = model;
		viewPanel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		String input = event.getActionCommand();

		switch (input) {
		case "0":
		case "1":
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
			if (viewPanel.isStart()) {
				viewPanel.getDisplay().setText(input);
				model.setResult(Double.parseDouble(input));
				viewPanel.setStart(false);
			} else {
				String anzeige = viewPanel.getDisplay().getText();
				if (anzeige.startsWith("*") || anzeige.startsWith("/") || anzeige.startsWith("+") || anzeige.startsWith("-")) {
					viewPanel.getDisplay().setText(input);
				} else {
					String neueAnzeige = anzeige + input;
					model.setResult(Double.parseDouble(neueAnzeige));
					viewPanel.getDisplay().setText(neueAnzeige);
				}
			}
			break;
		case "+":
		case "/":
		case "*":
		case "-":
			model.setLastCommand(input);
			viewPanel.getDisplay().setText(input);
			break;
		case "=":
			model.calculate(Double.parseDouble(viewPanel.getDisplay().getText()));
			String result = "" +model.getResult();
			viewPanel.getDisplay().setText(result);
			break;
		}
	}

	public void setLastCommand(String lastCommand) {
		model.setLastCommand(lastCommand);
	}

	public String getLastCommand() {
		return model.getLastCommand();
	}

	public void claculate(double x) {
		model.calculate(x);

		viewPanel.getDisplay().setText("" + model.getResult());
	}

}