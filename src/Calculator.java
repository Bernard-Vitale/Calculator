import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Calculator extends Application {
	
	// Create the text field
	TextField tfBox = new TextField();
	// Create all the needed buttons
	private Button btAdd = new Button("+");
	private Button btSubtract = new Button("-");
	private Button btMultiply = new Button("*");
	private Button btDivide = new Button("/");
	private Button btEquals = new Button("=");
	private Button btClear = new Button("C");
	private Button btDelete = new Button("<-");
	private Button btNeg = new Button ("(-)");
	private Button bt1 = new Button("1");
	private Button bt2 = new Button("2");
	private Button bt3 = new Button("3");
	private Button bt4 = new Button("4");
	private Button bt5 = new Button("5");
	private Button bt6 = new Button("6");
	private Button bt7 = new Button("7");
	private Button bt8 = new Button("8");
	private Button bt9 = new Button("9");
	private Button bt0 = new Button("0");
	private Button btDec = new Button(".");
	private Button btPercent = new Button("%");

	
	// Global Variables
	protected String operator = "";
	protected double num1;
	protected double num2;
	protected boolean equalsPressedLast;
	protected boolean operatorPressedLast;
	protected boolean consecutiveOperators;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Default text is 0
		tfBox.setText("0");
		tfBox.setEditable(false);
		// Set up the pane and place all the buttons in it
		Pane pane = new Pane();
		
		tfBox.setPrefSize(290, 45);
		tfBox.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
		tfBox.setLayoutX(10);
		tfBox.setLayoutY(10);
		tfBox.setAlignment(Pos.CENTER_RIGHT);
		
		btClear.setPrefSize(66.0, 58.0);
		btClear.setLayoutX(10.0);
		btClear.setLayoutY(60.0);
		btClear.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 30));
		
		btDelete.setPrefSize(66.0, 58.0);
		btDelete.setLayoutX(84.0);
		btDelete.setLayoutY(60.0);
		btDelete.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 24.52));
		
		btPercent.setPrefSize(66.0, 58.0);
		btPercent.setLayoutX(158.0);
		btPercent.setLayoutY(60.0);
		btPercent.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 25));


		btDivide.setPrefSize(66.0, 58.0);
		btDivide.setLayoutX(231.0);
		btDivide.setLayoutY(60.0);
		btDivide.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 29));
		
		bt7.setPrefSize(66.0, 62.0);
		bt7.setLayoutX(10.0);
		bt7.setLayoutY(123.0);
		bt7.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 32));
		
		bt8.setPrefSize(67.0, 61);
		bt8.setLayoutX(84.0);
		bt8.setLayoutY(123.0);
		bt8.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 32));
		
		bt9.setPrefSize(66.0, 61.0);
		bt9.setLayoutX(158.0);
		bt9.setLayoutY(123.0);
		bt9.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 32));
		
		btMultiply.setPrefSize(68.0, 61.0);
		btMultiply.setLayoutX(230.0);
		btMultiply.setLayoutY(123.0);
		btMultiply.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 32));
		
		bt4.setPrefSize(66.0, 61.0);
		bt4.setLayoutX(10.0);
		bt4.setLayoutY(189.0);
		bt4.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 32));
		
		bt5.setPrefSize(67.0, 61.0);
		bt5.setLayoutX(84.0);
		bt5.setLayoutY(189.0);
		bt5.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 32));
		
		bt6.setPrefSize(66.0, 61.0);
		bt6.setLayoutX(158.0);
		bt6.setLayoutY(189.0);
		bt6.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 32));
		
		btAdd.setPrefSize(67.0, 61.0);
		btAdd.setLayoutX(230.0);
		btAdd.setLayoutY(189.0);
		btAdd.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 30.5));

		bt1.setPrefSize(66.0, 61.0);
		bt1.setLayoutX(10.0);
		bt1.setLayoutY(255.0);
		bt1.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 32));
		
		bt2.setPrefSize(67.0, 62.0);
		bt2.setLayoutX(84.0);
		bt2.setLayoutY(255.0);
		bt2.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 32));
		
		bt3.setPrefSize(66.0, 62.0);
		bt3.setLayoutX(158.0);
		bt3.setLayoutY(255.0);
		bt3.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 32));
		
		btSubtract.setPrefSize(67.0, 61.0);
		btSubtract.setLayoutX(230.0);
		btSubtract.setLayoutY(255.0);
		btSubtract.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 30));
		
		btDec.setPrefSize(66.0, 62.0);
		btDec.setLayoutX(10.0);
		btDec.setLayoutY(322.0);
		btDec.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 32));
		
		bt0.setPrefSize(67.0, 62.0);
		bt0.setLayoutX(84.0);
		bt0.setLayoutY(322.0);
		bt0.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 32));
		
		btNeg.setPrefSize(66.0, 62.0);
		btNeg.setLayoutX(158.0);
		btNeg.setLayoutY(322.0);
		btNeg.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 22.5));
		
		btEquals.setPrefSize(67.0, 62.0);
		btEquals.setLayoutX(230.0);
		btEquals.setLayoutY(322.0);
		btEquals.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 30));
		

		
		//Events
		bt1.setOnAction(e -> {
			type("1");
			equalsPressedLast(false);
			operatorPressedLast(false);
		});
		bt2.setOnAction(e -> {
			type("2");
			equalsPressedLast(false);
			operatorPressedLast(false);
		});
		bt3.setOnAction(e -> {
			type("3");
			equalsPressedLast(false);
			operatorPressedLast(false);
		});
		bt4.setOnAction(e -> {
			type("4");
			equalsPressedLast(false);
			operatorPressedLast(false);
		});
		bt5.setOnAction(e ->{
			type("5");
			equalsPressedLast(false);
			operatorPressedLast(false);
		});
		bt6.setOnAction(e ->{
			type("6");
			equalsPressedLast(false);
			operatorPressedLast(false);
		});
		bt7.setOnAction(e ->{
			type("7");
			equalsPressedLast(false);
			operatorPressedLast(false);
		});
		bt8.setOnAction(e ->{
			type("8");
			equalsPressedLast(false);
			operatorPressedLast(false);
		});
		bt9.setOnAction(e ->{
			type("9");
			equalsPressedLast(false);
			operatorPressedLast(false);
		});
		bt0.setOnAction(e ->{
			type("0");
			equalsPressedLast(false);
			operatorPressedLast(false);
		});
		btNeg.setOnAction(e ->{
			type("(-)");
			equalsPressedLast(false);
			operatorPressedLast(false);
		});
		btAdd.setOnAction(e -> {
			type("+");
			equalsPressedLast(false);
			operatorPressedLast(true);
		});
		btEquals.setOnAction(e -> {
			type("=");
			equalsPressedLast(true);
			operatorPressedLast(false);
			consecutiveOperators(false); 

		});
		btMultiply.setOnAction(e -> {
			type("*");
			equalsPressedLast(false);
			operatorPressedLast(true);
		});
		btDivide.setOnAction(e -> {
			type("/");
			equalsPressedLast(false);
			operatorPressedLast(true);
		});
		btSubtract.setOnAction(e -> {
			type("-");
			equalsPressedLast(false);
			operatorPressedLast(true);
		});
		btClear.setOnAction(e -> {
			type("Clear");
			equalsPressedLast(false);
			operatorPressedLast(false);
			consecutiveOperators(false); 
		});
		btDelete.setOnAction(e -> {
			type("Del");
			operatorPressedLast(false);
		});
		btDec.setOnAction(e -> {
			type(".");
			equalsPressedLast(false);
			operatorPressedLast(false);
		});
		btPercent.setOnAction(e -> {
			type("%");
			equalsPressedLast(false);
			operatorPressedLast(false);
			consecutiveOperators(false); 

		});

		// Set background colors and add all the buttons to the pane
		pane.setBackground(Background.fill(Color.GREY));
		pane.setStyle("-fx-border-color: black; -fx-border-width: 5;");
		pane.getChildren().addAll(tfBox, btClear, btDelete, btPercent, btDivide, bt1, bt2, bt3, btMultiply, bt4, bt5 ,
				bt6, btAdd, bt7, bt8, bt9, btSubtract, btDec, bt0, btNeg, btEquals);

		// Set up the window
		Scene scene = new Scene(pane, 310, 395);
		primaryStage.setTitle("Calculator");
		primaryStage.centerOnScreen();
		primaryStage.setScene(scene);
		primaryStage.getIcons().add(new Image("calc.png"));
		primaryStage.setResizable(false);
		primaryStage.show();

		
		
	}
	
	// Function to change the value of equalsPressedLast
	private void equalsPressedLast(boolean b) {
		this.equalsPressedLast = b;
		return;
	}
	// Function to change the value of operatorPressedLast
	private void operatorPressedLast(boolean b) {
		this.operatorPressedLast = b;
		return;
	}
	// Function to change the value of consecutiveOperators
	private void consecutiveOperators(boolean b) {
		this.consecutiveOperators = b;
		return;
	}

	// Handle the inputs from each button pressed
	private void type(String c) {
		switch(c) {
			case "%":
				double temp;
				if(operatorPressedLast) {   //If an operator is pressed last then just ignore the operator and take percent
					temp = num1;
					operator = "";
				}else {
					temp = Double.parseDouble(tfBox.getText());
				}
				temp = temp / 100;
				tfBox.setText(String.valueOf(temp));
				operator="";
				break;
			
			case "(-)":	
				// If number in text box is 0, make it -0 (Like IPhone app)
				if(operatorPressedLast || tfBox.getText().compareTo("0") == 0 ) {
					tfBox.setText("-0");
					break;
				}else if (tfBox.getText().compareTo("0") == 0 ) {
					tfBox.setText("-0");
				// Else just make the number negative
				}else if(tfBox.getText().contains(".")) {
					double temp2 = Double.parseDouble(tfBox.getText());
					temp2 = temp2 * -1;
					tfBox.setText(String.valueOf(temp2));
				}
				else {
					int temp2 = Integer.parseInt(tfBox.getText());
					temp2 = temp2 * -1;
					tfBox.setText(String.valueOf(temp2));
				}
				operator = "";
				break;
				
			case ".":
				// If number already contains a decimal ignore
				if(tfBox.getText().contains(".")) {
					break;
				}
				// Else add a decimal
				tfBox.setText(tfBox.getText().concat(c));
				operator = "";
				break;
			case "+":
				// If an operator is pressed last, just change the operator to +
				if(operatorPressedLast) { 
					operator = "+";
				// If there is already a calculation input, then evaluate it, keep track of the result and change the operator
				// Kind of treating it as an = sign
				}else if(!equalsPressedLast && operator.compareTo("") != 0) {
					num2 = Double.parseDouble(tfBox.getText());
					calculation(operator);
					num1 = Double.parseDouble(tfBox.getText());
					operator = "+";
					//Keep track of when there is consecutive operators pressed, with equals not clicked in between (Do this so you cannot backspace on the result)
					consecutiveOperators(true); 
					break;	
				// Else just keep track of the number inputed as num1 and change operator to +
				}else {
					num1 = Double.parseDouble(tfBox.getText());
					operator = "+";
				}
				break;
			case "-":
				// If an operator is pressed last, just change the operator to -
				if(operatorPressedLast) {
					operator = "-";
				// If there is already a calculation input, then evaluate it, keep track of the result and change the operator
				// Kind of treating it as an = sign
				}else if(!equalsPressedLast && operator.compareTo("") != 0) {
					num2 = Double.parseDouble(tfBox.getText());
					calculation(operator);
					num1 = Double.parseDouble(tfBox.getText());
					operator = "-";
					//Keep track of when there is consecutive operators pressed, with equals not clicked in between (Do this so you cannot backspace on the result)
					consecutiveOperators(true); 
					break;	
				// Else just keep track of the number inputed as num1 and change operator to -
				}else {
					num1 = Double.parseDouble(tfBox.getText());
					operator = "-";
				}
				break;
			case "*":
				// If an operator is pressed last, just change the operator to *
				if(operatorPressedLast) {
					operator = "*";
				// If there is already a calculation input, then evaluate it, keep track of the result and change the operator
				// Kind of treating it as an = sign
				}else if(!equalsPressedLast && operator.compareTo("") != 0) {
					num2 = Double.parseDouble(tfBox.getText());
					calculation(operator);
					num1 = Double.parseDouble(tfBox.getText());
					operator = "*";
					//Keep track of when there is consecutive operators pressed, with equals not clicked in between (Do this so you cannot backspace on the result)
					consecutiveOperators(true); 
					break;	
				// Else just keep track of the number inputed as num1 and change operator to *
				}else {
					num1 = Double.parseDouble(tfBox.getText());
					operator = "*";
				}
				break;
			case "/":
				// If an operator is pressed last, just change the operator to /
				if(operatorPressedLast) {
					operator = "/";
				// If there is already a calculation input, then evaluate it, keep track of the result and change the operator
				// Kind of treating it as an = sign
				}else if(!equalsPressedLast && operator.compareTo("") != 0) {
					num2 = Double.parseDouble(tfBox.getText());
					calculation(operator);
					num1 = Double.parseDouble(tfBox.getText());
					operator = "/";
					//Keep track of when there is consecutive operators pressed, with equals not clicked in between (Do this so you cannot backspace on the result)
					consecutiveOperators(true); 
					break;				
				// Else just keep track of the number inputed as num1 and change operator to /
				}else {
					num1 = Double.parseDouble(tfBox.getText());
					operator = "/";
				}
				break;
			// If Clear button is hit just reset everything
			case "Clear":
				tfBox.setText("0");
				num1 = 0;
				num2 = 0;
				operator = "";
				break;		
			case "Del":
				//Not allowed to backspace on an answer or result
				if(equalsPressedLast || consecutiveOperators) {
					break;
				// No need to delete anything if there is only a 0
				}else if(tfBox.getText().compareTo("0") == 0) {
					break;
				}
				String str = tfBox.getText();
				tfBox.setText("");
				for(int i = 0; i < str.length()-1; i++) {
					tfBox.setText(tfBox.getText() + str.charAt(i));
				}
				break;
			case "=":
				// If the equal button is pressed last, the make result of the last calculation the num1 and just repeat last calculation
				if(equalsPressedLast == true) {
					num1 = Double.parseDouble(tfBox.getText());
				// If there is no operator selected just ignore the equal button being pressed
				}else if(operator.compareTo("") == 0) {
					break;
				// Get the second number for the calculation
				}else {
					num2 = Double.parseDouble(tfBox.getText());
				}
				// Perform the calculation
				calculation(operator);
				break;
			// If a number is pressed type the number into the text box
			default: 
				// If "Div by 0" Error display change the text to the number just clicked
				if(tfBox.getText().compareTo("Error: Can't Div by 0") == 0) {
					tfBox.setText(c);
				// If text box only has 0, and 0 is clocked do nothing
				}else if((tfBox.getText().compareTo("0") == 0  && c.compareTo("0")==0)) {
					break;
				// If text box only has 0 or has a result,just change the text to the number just clicked
				}else if(equalsPressedLast || tfBox.getText().compareTo("0") == 0 || consecutiveOperators ) {
					tfBox.setText(c);
				// if "-0" in text box, replace the 0 with the number clicked
				}else if(tfBox.getText().compareTo("-0") == 0) {
					String negStr = "-";
					tfBox.setText(negStr.concat(c));
				// If an operator is pressed last, change the text to the number clicked
				}else if (operatorPressedLast) {
					tfBox.setText(c);
				// Otherwise, just concatenate the current number with the number just clicked
				}else{
					tfBox.setText(tfBox.getText().concat(c));
				}
		}
		return;
	}
	
	
	void calculation(String operator) {
		// Evaluate the calculate depending on the operator and display the result in the text box
		switch(operator) {
		case"+":
			tfBox.setText(String.valueOf(num1 + num2));
			break;
		case"-":
			tfBox.setText(String.valueOf(num1 - num2));
			break;
		case"*":
			tfBox.setText(String.valueOf(num1 * num2));
			break;
		case"/":
			if(num2 == 0.0) {
				tfBox.setText("Error: Can't Div by 0");
				break;
			}
			tfBox.setText(String.valueOf(num1 / num2));
			break;
		}
		//Keep track of calculations in Console
		System.out.println(num1 + " " +  operator +  " " +  num2 +  " = " + tfBox.getText());

		return;
	}



	public static void main(String[] args) {
		// Header to keep track of previous caclulations in the terminal. (Maybe eventually incorporate this into my calculators design)
		System.out.println("Calculation History:");

		Application.launch(args);
	}

}
