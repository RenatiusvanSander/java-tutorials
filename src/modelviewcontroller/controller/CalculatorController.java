package modelviewcontroller.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelviewcontroller.model.CalculatorModel;
import modelviewcontroller.view.CalculatorPanel;

public class CalculatorController implements ActionListener{
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

		// Beim Start keinen Text anzeigen
		// Das Start Flag anschließend auf false setzen
		if (viewPanel.isStart()) {
			viewPanel.getDisplay().setText("");
			viewPanel.setStart(false);
		}

		// Text anzeigen
		String displayText = viewPanel.getDisplay().getText() + input;
		model.setDisplayText(displayText);
		
		viewPanel.getDisplay().setText(displayText);
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