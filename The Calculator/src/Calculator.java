import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
	JFrame frame;
	JPanel buttonPanel;
	JLabel DisplayLabel;
	JButton zeroButton,oneButton,twoButton,threeButton,fourButton;
	JButton fiveButton,sixButton,sevenButton,eightButton,nineButton;
	JButton addButton,subButton,divButton,multiplyButton;
	JButton allClearButton,delButton,dotButton,equalButton;
	JTextField currentField,previousField;
	
	Font font = new Font("Montserrat",Font.PLAIN,25);
	Font btnfont = new Font("Montserrat",Font.PLAIN,20);
	Font operatorfont = new Font("Montserrat",Font.PLAIN,30);
	Font prevfont = new Font("Montserrat",Font.PLAIN,18);
	Color prevdisplayColor = Color.decode("#797979");
	Color bgColor = Color.decode("#1d1d1d");
	Color equalColor = Color.decode("#7205b1");
	Color textColor = Color.decode("#ffffff");
	Color numBtnColor = Color.decode("#222222");
	Color operatorBtnColor = Color.decode("#272727");
	
	char operators;
	String prevValue,delString;
	double valueprev, valuecurrent,result;
	boolean isButtonClicked = false;
	
	public void compute() {
		valueprev = Double.parseDouble(prevValue);
		valuecurrent = Double.parseDouble(currentField.getText());
		
		switch (operators) {
			case '+':
				result = valueprev+valuecurrent;
				currentField.setText(result+"");
			break;
			case '-':
				result = valueprev-valuecurrent;
				currentField.setText(result+"");
				break;
			case '÷':
				result = valueprev/valuecurrent;
				currentField.setText(result+"");
				break;
			case '×':
				result = valueprev*valuecurrent;
				currentField.setText(result+"");
				break;
			default:
				currentField.setText("Syntax Error");
		}
	}
	
	Calculator() {
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(340,516);
		frame.setLayout(null);
		frame.getContentPane().setBackground(bgColor);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		previousField = new JTextField();
		previousField.setBounds(0, 10, 323, 30);
		previousField.setFocusable(false);
		previousField.setBackground(bgColor);
		previousField.setBorder(BorderFactory.createEmptyBorder(4,4,4,4));
		previousField.setForeground(prevdisplayColor);
		previousField.setFont(prevfont);
		previousField.setHorizontalAlignment(SwingConstants.RIGHT);
		
		currentField = new JTextField();
		currentField.setBounds(0, 36, 323, 80);
		currentField.setFocusable(false);
		currentField.setBackground(bgColor);
		currentField.setBorder(BorderFactory.createEmptyBorder(4,4,4,4));
		currentField.setForeground(Color.white);
		currentField.setFont(font);
		currentField.setHorizontalAlignment(SwingConstants.RIGHT);
		
		addButton = new JButton("+");
		subButton = new JButton("-");
		divButton = new JButton("÷");
		multiplyButton = new JButton("×");
		allClearButton = new JButton("All Clear");
		delButton = new JButton("Del");
		dotButton = new JButton(".");
		equalButton = new JButton("=");
		zeroButton = new JButton("0");
		oneButton = new JButton("1");
		twoButton = new JButton("2");
		threeButton = new JButton("3");
		fourButton = new JButton("4");
		fiveButton = new JButton("5");
		sixButton = new JButton("6");
		sevenButton = new JButton("7");
		eightButton = new JButton("8");
		nineButton = new JButton("9");
		
		addButton.addActionListener(this);
		subButton.addActionListener(this);
		divButton.addActionListener(this); 
		multiplyButton.addActionListener(this); 
		allClearButton.addActionListener(this); 
		delButton.addActionListener(this); 
		dotButton.addActionListener(this);
		equalButton.addActionListener(this);
		zeroButton.addActionListener(this); 
		oneButton.addActionListener(this);
		twoButton.addActionListener(this);
		threeButton.addActionListener(this);
		fourButton.addActionListener(this);
		fiveButton.addActionListener(this);
		sixButton.addActionListener(this);
		sevenButton.addActionListener(this);
		eightButton.addActionListener(this);
		nineButton.addActionListener(this);
		
		allClearButton.setBackground(operatorBtnColor);
		allClearButton.setForeground(textColor);
		allClearButton.setBorderPainted(false);
		allClearButton.setFocusable(false);
		allClearButton.setBounds(0,27,162,70);
		allClearButton.setFont(btnfont);
		
		delButton.setBackground(operatorBtnColor);
		delButton.setForeground(textColor);
		delButton.setBorderPainted(false);
		delButton.setFocusable(false);
		delButton.setBounds(164,27,80,70);
		delButton.setFont(btnfont);
		
		divButton.setBackground(operatorBtnColor);
		divButton.setForeground(textColor);
		divButton.setBorderPainted(false);
		divButton.setFocusable(false);
		divButton.setBounds(246,27,80,70);
		divButton.setFont(operatorfont);
		
		sevenButton.setBackground(numBtnColor);
		sevenButton.setForeground(textColor);
		sevenButton.setBorderPainted(false);
		sevenButton.setFocusable(false);
		sevenButton.setBounds(0,99,80,70);
		sevenButton.setFont(btnfont);
		
		eightButton.setBackground(numBtnColor);
		eightButton.setForeground(textColor);
		eightButton.setBorderPainted(false);
		eightButton.setFocusable(false);
		eightButton.setBounds(82,99,80,70);
		eightButton.setFont(btnfont);
		
		nineButton.setBackground(numBtnColor);
		nineButton.setForeground(textColor);
		nineButton.setBorderPainted(false);
		nineButton.setFocusable(false);
		nineButton.setBounds(164,99,80,70);
		nineButton.setFont(btnfont);
		
		multiplyButton.setBackground(operatorBtnColor);
		multiplyButton.setForeground(textColor);
		multiplyButton.setBorderPainted(false);
		multiplyButton.setFocusable(false);
		multiplyButton.setBounds(246,99,80,70);
		multiplyButton.setFont(operatorfont);
		
		fourButton.setBackground(numBtnColor);
		fourButton.setForeground(textColor);
		fourButton.setBorderPainted(false);
		fourButton.setFocusable(false);
		fourButton.setBounds(0,171,80,70);
		fourButton.setFont(btnfont);

		fiveButton.setBackground(numBtnColor);
		fiveButton.setForeground(textColor);
		fiveButton.setBorderPainted(false);
		fiveButton.setFocusable(false);
		fiveButton.setBounds(82,171,80,70);
		fiveButton.setFont(btnfont);
		
		sixButton.setBackground(numBtnColor);
		sixButton.setForeground(textColor);
		sixButton.setBorderPainted(false);
		sixButton.setFocusable(false);
		sixButton.setBounds(164,171,80,70);
		sixButton.setFont(btnfont);
		
		subButton.setBackground(operatorBtnColor);
		subButton.setForeground(textColor);
		subButton.setBorderPainted(false);
		subButton.setFocusable(false);
		subButton.setBounds(246,171,80,70);
		subButton.setFont(operatorfont);
		
		oneButton.setBackground(numBtnColor);
		oneButton.setForeground(textColor);
		oneButton.setBorderPainted(false);
		oneButton.setFocusable(false);
		oneButton.setBounds(0,243,80,70);
		oneButton.setFont(btnfont);

		twoButton.setBackground(numBtnColor);
		twoButton.setForeground(textColor);
		twoButton.setBorderPainted(false);
		twoButton.setFocusable(false);
		twoButton.setBounds(82,243,80,70);
		twoButton.setFont(btnfont);
		
		threeButton.setBackground(numBtnColor);
		threeButton.setForeground(textColor);
		threeButton.setBorderPainted(false);
		threeButton.setFocusable(false);
		threeButton.setBounds(164,243,80,70);
		threeButton.setFont(btnfont);
		
		addButton.setBackground(operatorBtnColor);
		addButton.setForeground(textColor);
		addButton.setBorderPainted(false);
		addButton.setFocusable(false);
		addButton.setBounds(246,243,80,70);
		addButton.setFont(operatorfont);
		
		dotButton.setBackground(operatorBtnColor);
		dotButton.setForeground(textColor);
		dotButton.setBorderPainted(false);
		dotButton.setFocusable(false);
		dotButton.setBounds(0,315,80,70);
		dotButton.setFont(operatorfont);
		
		zeroButton.setBackground(numBtnColor);
		zeroButton.setForeground(textColor);
		zeroButton.setBorderPainted(false);
		zeroButton.setFocusable(false);
		zeroButton.setBounds(82,315,80,70);
		zeroButton.setFont(btnfont);
		
		equalButton.setBackground(equalColor);
		equalButton.setForeground(textColor);
		equalButton.setBorderPainted(false);
		equalButton.setFocusable(false);
		equalButton.setBounds(164,315,162,70);
		equalButton.setFont(operatorfont);
		
		buttonPanel = new JPanel();
		buttonPanel.setBounds(0,90,323,430);
		buttonPanel.setLayout(null);
		buttonPanel.setBackground(bgColor);
		
		buttonPanel.add(allClearButton);
		buttonPanel.add(delButton);
		buttonPanel.add(divButton);
		buttonPanel.add(sevenButton);
		buttonPanel.add(eightButton);
		buttonPanel.add(nineButton);
		buttonPanel.add(multiplyButton);
		buttonPanel.add(fourButton);
		buttonPanel.add(fiveButton);
		buttonPanel.add(sixButton);
		buttonPanel.add(subButton);
		buttonPanel.add(oneButton);
		buttonPanel.add(twoButton);
		buttonPanel.add(threeButton);
		buttonPanel.add(addButton);
		buttonPanel.add(dotButton);
		buttonPanel.add(zeroButton);
		buttonPanel.add(equalButton);
		
		frame.add(buttonPanel);
		frame.add(previousField);
		frame.add(currentField);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == oneButton) {
			
			if (isButtonClicked) {
				currentField.setText(oneButton.getText());
				isButtonClicked = false;
			}else {
				currentField.setText(currentField.getText()+oneButton.getText());
			}
			
		}else if(e.getSource() == twoButton) {
			
			if (isButtonClicked) {
				currentField.setText(twoButton.getText());
				isButtonClicked = false;
			}else {
				currentField.setText(currentField.getText()+twoButton.getText());
			}
			
		}else if(e.getSource() == threeButton) {
			
			if (isButtonClicked) {
				currentField.setText(threeButton.getText());
				isButtonClicked = false;
			}else {
				currentField.setText(currentField.getText()+threeButton.getText());
			}
			
		}else if(e.getSource() == fourButton) {
			
			if (isButtonClicked) {
				currentField.setText(fourButton.getText());
				isButtonClicked = false;
			}else {
				currentField.setText(currentField.getText()+fourButton.getText());
			}
			
		}else if(e.getSource() == fiveButton) {
			
			if (isButtonClicked) {
				currentField.setText(fiveButton.getText());
				isButtonClicked = false;
			}else {
				currentField.setText(currentField.getText()+fiveButton.getText());
			}
			
		}else if(e.getSource() == sixButton) {
			
			if (isButtonClicked) {
				currentField.setText(sixButton.getText());
				isButtonClicked = false;
			}else {
				currentField.setText(currentField.getText()+sixButton.getText());
			}
			
		}else if(e.getSource() == sevenButton) {
			
			if (isButtonClicked) {
				currentField.setText(sevenButton.getText());
				isButtonClicked = false;
			}else {
				currentField.setText(currentField.getText()+sevenButton.getText());
			}
			
		}else if(e.getSource() == eightButton) {
			
			if (isButtonClicked) {
				currentField.setText(eightButton.getText());
				isButtonClicked = false;
			}else {
				currentField.setText(currentField.getText()+eightButton.getText());
			}
			
		}else if(e.getSource() == nineButton) {
			
			if (isButtonClicked) {
				currentField.setText(nineButton.getText());
				isButtonClicked = false;
			}else {
				currentField.setText(currentField.getText()+nineButton.getText());
			}
			
		}else if(e.getSource() == zeroButton) {
			
			if (isButtonClicked) {
				currentField.setText(zeroButton.getText());
				isButtonClicked = false;
			}else {
				currentField.setText(currentField.getText()+zeroButton.getText());
			}
			
		}else if(e.getSource() == dotButton) {
			
			if (isButtonClicked) {
				currentField.setText(dotButton.getText());
				isButtonClicked = false;
			}else {
				currentField.setText(currentField.getText()+dotButton.getText());
			}
			
		}else if (e.getSource() == addButton) {
			isButtonClicked = true;
			prevValue = currentField.getText();
			operators = '+';
			previousField.setText(prevValue+" "+operators);
			currentField.setText("");
		}
		else if (e.getSource() == subButton) {
			isButtonClicked = true;
			prevValue = currentField.getText();
			operators = '-';
			previousField.setText(prevValue+" "+operators);
			currentField.setText("");
		}
		else if (e.getSource() == divButton) {
			isButtonClicked = true;
			prevValue = currentField.getText();
			operators = '÷';
			previousField.setText(prevValue+" "+operators);
			currentField.setText("");
		}
		else if (e.getSource() == multiplyButton) {
			isButtonClicked = true;
			prevValue = currentField.getText();
			operators = '×';
			previousField.setText(prevValue+" "+operators);
			currentField.setText("");
		}else if(e.getSource() == equalButton) {
			compute();
		}
		else if(e.getSource() == allClearButton) {
			currentField.setText("");
			previousField.setText("");
		}else if(e.getSource() == delButton) {
				delString = currentField.getText();
				String lastVal = "" ;
				lastVal = delString.substring(0, delString.length()-1);
				currentField.setText(lastVal);		
			
		}
		
	}
	
}
