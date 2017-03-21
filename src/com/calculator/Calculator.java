package com.calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Ts_Lee //简易计算机
 */

public class Calculator {
	private JTextArea Output = null;
	private JTextArea Input = null;
	private List<Integer> locations = new ArrayList<Integer>();
	private JFrame frame;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setTitle("计 算 器");
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 386, 281);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		
		Input = new JTextArea();
		Input.setBounds(10, 10, 347, 46);
		Input.setEditable(false);
		frame.getContentPane().add(Input);

		Output = new JTextArea();
		Output.setText("result :");
		Output.setBounds(10, 66, 347, 24);
		Output.setEditable(false);
		frame.getContentPane().add(Output);

		JButton SevenButton = new JButton("7");
		SevenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ButtonSeven = SevenButton.getText();
				String TextInput = Input.getText();
				Input.setText(TextInput + ButtonSeven);
			}
		});
		SevenButton.setBounds(10, 103, 62, 23);
		frame.getContentPane().add(SevenButton);

		JButton Eigth_Button = new JButton("8");
		Eigth_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ButtonEigth = Eigth_Button.getText();
				String TextInput = Input.getText();
				Input.setText(TextInput + ButtonEigth);
			}
		});
		Eigth_Button.setBounds(79, 103, 62, 23);
		frame.getContentPane().add(Eigth_Button);

		JButton Nine_Button = new JButton("9");
		Nine_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ButtonNine = Nine_Button.getText();
				String TextInput = Input.getText();
				Input.setText(TextInput + ButtonNine);
			}
		});
		Nine_Button.setBounds(151, 103, 62, 23);
		frame.getContentPane().add(Nine_Button);

		JButton AdditionButton = new JButton("+");
		AdditionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textButton = AdditionButton.getText();
				String textInput = Input.getText();
				if (textInput.length() == 0 || textInput.equals(null)
						|| textInput.equals(".")) {
					textInput = "0";
					Input.setText(textInput + textButton);
				}
				Input.setText(textInput + textButton);
				locations.add(textInput.length());
			}
		});
		AdditionButton.setBounds(223, 103, 62, 23);
		frame.getContentPane().add(AdditionButton);

		JButton PowerButton = new JButton("^");
		PowerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textButton = PowerButton.getText();
				String textInput = Input.getText();
				if (textInput.length() == 0 || textInput.equals(null)
						|| textInput.equals(".")) {
					textInput = "0";
					Input.setText(textInput + textButton);
				}
				Input.setText(textInput + textButton);
				locations.add(textInput.length());
			}
		});
		PowerButton.setBounds(295, 103, 62, 23);
		frame.getContentPane().add(PowerButton);

		JButton FourButton = new JButton("4");
		FourButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ButtonFour = FourButton.getText();
				String TextInput = Input.getText();
				Input.setText(TextInput + ButtonFour);
			}
		});
		FourButton.setBounds(10, 136, 62, 23);
		frame.getContentPane().add(FourButton);

		JButton OneButton = new JButton("1");
		OneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String ButtonOne = OneButton.getText();
				String TextInput = Input.getText();
				Input.setText(TextInput + ButtonOne);
			}
		});
		OneButton.setBounds(10, 169, 62, 23);
		frame.getContentPane().add(OneButton);

		JButton DelButton = new JButton("C");
		DelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = Input.getText();
				if (!(text.equals("") || text == null)) {
					if (text.endsWith("+") || text.endsWith("-")
							|| text.endsWith("*") || text.endsWith("/")) {
						locations.remove(locations.size() - 1);

					}
					Input.setText(text.substring(0, text.length() - 1));
				}
			}
		});
		DelButton.setBounds(10, 202, 62, 23);
		frame.getContentPane().add(DelButton);

		JButton FiveButton = new JButton("5");
		FiveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ButtonFive = FiveButton.getText();
				String TextInput = Input.getText();
				Input.setText(TextInput + ButtonFive);
			}
		});
		FiveButton.setBounds(79, 136, 62, 23);
		frame.getContentPane().add(FiveButton);

		JButton TwoButton = new JButton("2");
		TwoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ButtonTwo = TwoButton.getText();
				String TextInput = Input.getText();
				Input.setText(TextInput + ButtonTwo);
			}
		});
		TwoButton.setBounds(79, 169, 62, 23);
		frame.getContentPane().add(TwoButton);

		JButton ZeroButton = new JButton("0");
		ZeroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ButtonZero = ZeroButton.getText();
				String TextInput = Input.getText();
				Input.setText(TextInput + ButtonZero);
			}
		});
		ZeroButton.setBounds(79, 202, 62, 23);
		frame.getContentPane().add(ZeroButton);

		JButton SixButton = new JButton("6");
		SixButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ButtonSix = SixButton.getText();
				String TextInput = Input.getText();
				Input.setText(TextInput + ButtonSix);
			}
		});
		SixButton.setBounds(151, 136, 62, 23);
		frame.getContentPane().add(SixButton);

		JButton ThreeButton = new JButton("3");
		ThreeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ButtonThree = ThreeButton.getText();
				String TextInput = Input.getText();
				Input.setText(TextInput + ButtonThree);
			}
		});
		ThreeButton.setBounds(151, 169, 62, 23);
		frame.getContentPane().add(ThreeButton);

		JButton PointButton = new JButton(".");
		PointButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ButtonPoint = PointButton.getText();
				String TextInput = Input.getText();
				Input.setText(TextInput + ButtonPoint);
			}
		});
		PointButton.setBounds(151, 202, 62, 23);
		frame.getContentPane().add(PointButton);

		JButton SubductioButton = new JButton("-");
		SubductioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textButton = SubductioButton.getText();
				String textInput = Input.getText();
				if (textInput.length() == 0 || textInput.equals(null)
						|| textInput.equals(".")) {
					textInput = "0";
					Input.setText(textInput + textButton);
				}
				Input.setText(textInput + textButton);
				locations.add(textInput.length());
			}
		});
		SubductioButton.setBounds(223, 136, 62, 23);
		frame.getContentPane().add(SubductioButton);

		JButton MultiplicationButton = new JButton("*");
		MultiplicationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textButton = MultiplicationButton.getText();
				String textInput = Input.getText();
				if (textInput.length() == 0 || textInput.equals(null)
						|| textInput.equals(".")) {
					textInput = "0";
					Input.setText(textInput + textButton);
				}
				Input.setText(textInput + textButton);
				locations.add(textInput.length());
			}
		});
		MultiplicationButton.setBounds(223, 169, 62, 23);
		frame.getContentPane().add(MultiplicationButton);

		JButton DivisionButton = new JButton("/");
		DivisionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textButton = DivisionButton.getText();
				String textInput = Input.getText();
				if (textInput.length() == 0 || textInput.equals(null)
						|| textInput.equals(".")) {
					textInput = "0";
					Input.setText(textInput + textButton);
				}
				Input.setText(textInput + textButton);
				locations.add(textInput.length());
			}
		});
		DivisionButton.setBounds(223, 202, 62, 23);
		frame.getContentPane().add(DivisionButton);

		JButton SquareRootButton = new JButton("\u221A");
		SquareRootButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textButton = SquareRootButton.getText();
				String textInput = Input.getText();
				if (!(textInput.equals("") || textInput == null)) {
					String thelast = textInput.substring(textInput.length() - 1);
					if (!(thelast.equals("+") || thelast.equals("-")
							|| thelast.equals("*") || thelast.equals("/")
							|| thelast.equals(".") || thelast.equals("^"))) {
						Input.setText(textInput + textButton);
						locations.add(textInput.length());
						SquareRoot(textInput, locations);
						Input.setText("");
						locations.clear();
					} else {
						String textInput2 = textInput + "0";
						Input.setText(textInput2 + textButton);
						locations.add(textInput.length());
						SquareRoot(textInput2, locations);
						Input.setText("");
						locations.clear();
					}

				}
			}
		});
		SquareRootButton.setBounds(295, 136, 62, 23);
		frame.getContentPane().add(SquareRootButton);

		JButton SinButton = new JButton("CE");
		SinButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = Input.getText();
				if (!(text.equals("") || text == null)) {
					Input.setText(text.substring(text.length()));
				}
			}
		});
		SinButton.setBounds(295, 169, 62, 23);
		frame.getContentPane().add(SinButton);

		JButton EquationButton = new JButton("=");
		EquationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textButton = EquationButton.getText();
				String textInput = Input.getText();
				if (!(textInput.equals("") || textInput == null)) {
					String thelast = textInput.substring(textInput.length() - 1);
					if (!(thelast.equals("+") || thelast.equals("-")
							|| thelast.equals("*") || thelast.equals("/")
							|| thelast.equals(".") || thelast.equals("^"))) {
						Input.setText(textInput + textButton);
						getNumbers(textInput, locations);
						Input.setText("");
						// ��ռ���
						locations.clear();
					} else {
						String textInput2 = textInput + "0";
						Input.setText(textInput2 + textButton);
						getNumbers(textInput2, locations);
						Input.setText("");
						locations.clear();
					}

				}
			}
		});
		EquationButton.setBounds(295, 202, 62, 23);
		frame.getContentPane().add(EquationButton);
	}

	public void getNumbers(String input, List<Integer> locations) {
		String num1 = input.substring(0, locations.get(0));
		double actnumber1 = Double.parseDouble(num1);
		double result = operator(actnumber1, 0, input);
		Output.setText("result :" + result + "");
		locations.clear();
	}

	public void SquareRoot(String input, List<Integer> locations) {
		String inputtext = input.substring(0, locations.get(0));
		if (!(inputtext.equals("+") || inputtext.equals("-")
				|| inputtext.equals("*") || inputtext.equals("/")
				|| inputtext.equals("^") || inputtext.equals("."))) {
			double actnumber1 = Double.parseDouble(inputtext);
			double result = Math.sqrt(actnumber1);
			Output.setText("result :" + result + "");
			locations.clear();
		}
	}

	
	public double operator(double fristNumber, int i, String input) {
		String operateB = "";
		double result = 0;

		if (i == locations.size() - 1) {
			operateB = input.substring(locations.get(i) + 1);
		} else {
			operateB = input.substring(locations.get(i) + 1,
					locations.get(i + 1));
		}

		char operation = input.charAt(locations.get(i));

		if (operation == '+') {
			double number2 = Double.parseDouble(operateB);
			result = fristNumber + number2;
		} else if (operation == '-') {
			double number2 = Double.parseDouble(operateB);
			result = fristNumber - number2;
		} else if (operation == '*') {
			double number2 = Double.parseDouble(operateB);
			result = fristNumber * number2;
		} else if (operation == '/') {
			double number2 = Double.parseDouble(operateB);
			result = (fristNumber / number2);
		} else if (operation == '^') {
			double number2 = Double.parseDouble(operateB);
			result = Math.pow(fristNumber, number2);
		}

		if (i == locations.size() - 1) {
			return result;
		} else {
			result = operator(result, i + 1, input);
		}
		return result;
	}

}
