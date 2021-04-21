import java.awt.EventQueue;
import java.util.Arrays;
import java.text.ParseException;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class Smart_Calculator {

	private JFrame frmSmartCalci;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String answer;
	int DecimalInt;
	int BinaryInt;
	int OctalInt;
	String HexInput;
	String Decimalstring;
	String Binarystring;
	String Octalstring;
	String Hexstring;
	int conversion ;
	
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField textFieldDecimal;
	private JTextField textFieldBinary;
	private JTextField textFieldOctal;
	private JTextField textFieldHex;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextPane textPaneInput;
	private JTextPane textPaneOutput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Smart_Calculator window = new Smart_Calculator();
					window.frmSmartCalci.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Smart_Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSmartCalci = new JFrame();
		frmSmartCalci.getContentPane().setFocusable(false);
		frmSmartCalci.setFocusable(false);
		frmSmartCalci.getContentPane().setBackground(Color.DARK_GRAY);
		frmSmartCalci.setForeground(Color.DARK_GRAY);
		frmSmartCalci.setBackground(new Color(64, 64, 64));
		frmSmartCalci.setResizable(false);
		frmSmartCalci.setTitle("Smart Calculator");
		frmSmartCalci.setBounds(100, 100, 407, 640);
		frmSmartCalci.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSmartCalci.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Scientific Calculator");
		lblNewLabel.setBounds(23, 0, 296, 44);
		lblNewLabel.setFocusable(false);
		lblNewLabel.setForeground(new Color(230, 230, 250));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setEnabled(false);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		frmSmartCalci.getContentPane().add(lblNewLabel);
		
		JLabel btnVersion = new JLabel("Version 3.1.0");
		btnVersion.setBounds(297, 16, 84, 25);
		btnVersion.setFocusable(false);
		btnVersion.setEnabled(false);
		btnVersion.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 13));
		btnVersion.setForeground(new Color(230, 230, 250));
		frmSmartCalci.getContentPane().add(btnVersion);
		
		JButton btnRoot = new JButton("\u221Ax");
		btnRoot.setBounds(12, 157, 63, 50);
		btnRoot.setFocusable(false);
		btnRoot.setBackground(new Color(0, 0, 0));
		btnRoot.setForeground(new Color(240, 248, 255));
		btnRoot.setEnabled(false);
		btnRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnRoot.setFont(new Font("Times New Roman", Font.BOLD, 25));
		frmSmartCalci.getContentPane().add(btnRoot);
		
		JButton btnReciprocal = new JButton("1/x");
		btnReciprocal.setBounds(10, 217, 65, 50);
		btnReciprocal.setFocusable(false);
		btnReciprocal.setForeground(Color.WHITE);
		btnReciprocal.setBackground(Color.BLACK);
		btnReciprocal.setEnabled(false);
		btnReciprocal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = 1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnReciprocal.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 23));
		frmSmartCalci.getContentPane().add(btnReciprocal);
		
		JButton btnXPowY = new JButton("X^Y");
		btnXPowY.setBounds(10, 277, 65, 50);
		btnXPowY.setFocusable(false);
		btnXPowY.setForeground(Color.WHITE);
		btnXPowY.setBackground(Color.BLACK);
		btnXPowY.setEnabled(false);
		btnXPowY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "X^Y";
			}
		});
		btnXPowY.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		frmSmartCalci.getContentPane().add(btnXPowY);
		
		JButton btnCube = new JButton("X^3");
		btnCube.setBounds(12, 337, 63, 50);
		btnCube.setFocusable(false);
		btnCube.setForeground(Color.WHITE);
		btnCube.setBackground(Color.BLACK);
		btnCube.setEnabled(false);
		btnCube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a = (Double.parseDouble(textField.getText()));
				a = Math.pow(a, 3);
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCube.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		frmSmartCalci.getContentPane().add(btnCube);
		
		JButton btnSquare = new JButton("X^2");
		btnSquare.setBounds(12, 397, 63, 50);
		btnSquare.setFocusable(false);
		btnSquare.setForeground(Color.WHITE);
		btnSquare.setBackground(Color.BLACK);
		btnSquare.setEnabled(false);
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a = Math.pow(a, 2);
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSquare.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		frmSmartCalci.getContentPane().add(btnSquare);
		
		JButton btnFactorial = new JButton("n!");
		btnFactorial.setBounds(12, 457, 63, 50);
		btnFactorial.setFocusable(false);
		btnFactorial.setBackground(Color.BLACK);
		btnFactorial.setForeground(Color.WHITE);
		btnFactorial.setEnabled(false);
		btnFactorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 double a = Double.parseDouble(textField.getText());
				 double Factorial = 1;
				 
				 for(int i=1 ; i<=a ; i++)
				 {
					 Factorial = Factorial*i;
				 }
				 
				 textField.setText("");
				 textField.setText(textField.getText()+Factorial);
			}
		});
		btnFactorial.setFont(new Font("Times New Roman", Font.PLAIN, 34));
		frmSmartCalci.getContentPane().add(btnFactorial);
		
		JButton btnPlusOrMinus = new JButton("+/-");
		btnPlusOrMinus.setBounds(10, 517, 65, 50);
		btnPlusOrMinus.setFocusable(false);
		btnPlusOrMinus.setForeground(Color.WHITE);
		btnPlusOrMinus.setBackground(Color.BLACK);
		btnPlusOrMinus.setEnabled(false);
		btnPlusOrMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(String.valueOf(textField.getText()));
				a = a*(-1);
				textField.setText(String.valueOf(a));
				
			}
		});
		btnPlusOrMinus.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		frmSmartCalci.getContentPane().add(btnPlusOrMinus);
		
		JButton btnExponent = new JButton("e^x");
		btnExponent.setBounds(83, 157, 66, 50);
		btnExponent.setFocusable(false);
		btnExponent.setForeground(new Color(240, 248, 255));
		btnExponent.setBackground(new Color(112, 128, 144));
		btnExponent.setEnabled(false);
		btnExponent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnExponent.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 33));
		frmSmartCalci.getContentPane().add(btnExponent);
		
		JButton btnLog = new JButton("Log");
		btnLog.setBounds(83, 217, 66, 50);
		btnLog.setFocusable(false);
		btnLog.setForeground(new Color(240, 248, 255));
		btnLog.setBackground(new Color(112, 128, 144));
		btnLog.setEnabled(false);
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnLog.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 27));
		frmSmartCalci.getContentPane().add(btnLog);
		
		JButton btnPercentage = new JButton("%");
		btnPercentage.setBounds(83, 277, 66, 50);
		btnPercentage.setFocusable(false);
		btnPercentage.setBackground(SystemColor.activeCaption);
		btnPercentage.setEnabled(false);
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btnPercentage.setFont(new Font("Times New Roman", Font.BOLD, 20));
		frmSmartCalci.getContentPane().add(btnPercentage);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(83, 337, 66, 50);
		btn7.setFocusable(false);
		btn7.setForeground(new Color(255, 255, 255));
		btn7.setBackground(new Color(105, 105, 105));
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Times New Roman", Font.BOLD, 30));
		frmSmartCalci.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(83, 397, 66, 50);
		btn4.setFocusable(false);
		btn4.setBackground(new Color(105, 105, 105));
		btn4.setForeground(new Color(255, 255, 255));
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Times New Roman", Font.BOLD, 30));
		frmSmartCalci.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(83, 457, 66, 50);
		btn1.setFocusable(false);
		btn1.setForeground(new Color(255, 255, 255));
		btn1.setBackground(new Color(105, 105, 105));
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		frmSmartCalci.getContentPane().add(btn1);
		
		JButton btnSine = new JButton("sin");
		btnSine.setBounds(159, 157, 66, 50);
		btnSine.setFocusable(false);
		btnSine.setForeground(new Color(255, 255, 255));
		btnSine.setBackground(new Color(112, 128, 144));
		btnSine.setEnabled(false);
		btnSine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSine.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		frmSmartCalci.getContentPane().add(btnSine);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(158, 338, 67, 50);
		btn8.setFocusable(false);
		btn8.setBackground(new Color(105, 105, 105));
		btn8.setForeground(new Color(255, 255, 255));
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Times New Roman", Font.BOLD, 30));
		frmSmartCalci.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(158, 398, 67, 50);
		btn5.setFocusable(false);
		btn5.setForeground(new Color(255, 255, 255));
		btn5.setBackground(new Color(105, 105, 105));
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Times New Roman", Font.BOLD, 30));
		frmSmartCalci.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(158, 458, 67, 50);
		btn2.setFocusable(false);
		btn2.setForeground(new Color(255, 255, 255));
		btn2.setBackground(new Color(105, 105, 105));
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		frmSmartCalci.getContentPane().add(btn2);
		
		JButton btnCos = new JButton("cos");
		btnCos.setBounds(235, 156, 68, 50);
		btnCos.setFocusable(false);
		btnCos.setForeground(new Color(255, 255, 255));
		btnCos.setBackground(new Color(112, 128, 144));
		btnCos.setEnabled(false);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCos.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		frmSmartCalci.getContentPane().add(btnCos);
		
		JButton btnB = new JButton("\uF0E7");
		btnB.setBounds(234, 277, 69, 50);
		btnB.setFocusable(false);
		btnB.setBackground(new Color(178, 34, 34));
		btnB.setForeground(new Color(255, 255, 255));
		btnB.setEnabled(false);
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String BackSpace = null;
				
				if(textField.getText().length() >0)
				{
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					BackSpace = str.toString();
					textField.setText(BackSpace);
				}
			}
		});
		btnB.setFont(new Font("Wingdings", Font.BOLD, 25));
		frmSmartCalci.getContentPane().add(btnB);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(234, 337, 69, 50);
		btn9.setFocusable(false);
		btn9.setForeground(new Color(255, 255, 255));
		btn9.setBackground(new Color(105, 105, 105));
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Times New Roman", Font.BOLD, 30));
		frmSmartCalci.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(234, 397, 69, 50);
		btn6.setFocusable(false);
		btn6.setForeground(new Color(255, 255, 255));
		btn6.setBackground(new Color(105, 105, 105));
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Times New Roman", Font.BOLD, 30));
		frmSmartCalci.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(234, 457, 69, 50);
		btn3.setFocusable(false);
		btn3.setForeground(new Color(255, 255, 255));
		btn3.setBackground(new Color(105, 105, 105));
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Times New Roman", Font.BOLD, 30));
		frmSmartCalci.getContentPane().add(btn3);
		
		JButton btnDot = new JButton(".");
		btnDot.setBounds(235, 515, 69, 50);
		btnDot.setFocusable(false);
		btnDot.setBackground(SystemColor.activeCaption);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setEnabled(false);
		btnDot.setFont(new Font("Times New Roman", Font.BOLD, 30));
		frmSmartCalci.getContentPane().add(btnDot);
		
		JButton btnTan = new JButton("tan");
		btnTan.setBounds(313, 157, 68, 50);
		btnTan.setFocusable(false);
		btnTan.setForeground(new Color(255, 255, 255));
		btnTan.setBackground(new Color(112, 128, 144));
		btnTan.setEnabled(false);
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTan.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		frmSmartCalci.getContentPane().add(btnTan);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setBounds(312, 277, 69, 50);
		btnAdd.setFocusable(false);
		btnAdd.setForeground(new Color(255, 255, 255));
		btnAdd.setBackground(new Color(46, 139, 87));
		btnAdd.setEnabled(false);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 30));
		frmSmartCalci.getContentPane().add(btnAdd);
		
		JButton btnSubract = new JButton("-");
		btnSubract.setBounds(312, 337, 69, 50);
		btnSubract.setFocusable(false);
		btnSubract.setForeground(new Color(255, 255, 255));
		btnSubract.setBackground(new Color(46, 139, 87));
		btnSubract.setEnabled(false);
		btnSubract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnSubract.setFont(new Font("Times New Roman", Font.BOLD, 30));
		frmSmartCalci.getContentPane().add(btnSubract);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.setBounds(312, 397, 69, 50);
		btnMultiply.setFocusable(false);
		btnMultiply.setForeground(new Color(255, 255, 255));
		btnMultiply.setBackground(new Color(46, 139, 87));
		btnMultiply.setEnabled(false);
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnMultiply.setFont(new Font("Times New Roman", Font.BOLD, 30));
		frmSmartCalci.getContentPane().add(btnMultiply);
		
		JButton btnDivides = new JButton("/");
		btnDivides.setBounds(312, 457, 69, 50);
		btnDivides.setFocusable(false);
		btnDivides.setForeground(new Color(255, 255, 255));
		btnDivides.setBackground(new Color(46, 139, 87));
		btnDivides.setEnabled(false);
		btnDivides.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btnDivides.setFont(new Font("Times New Roman", Font.BOLD, 30));
		frmSmartCalci.getContentPane().add(btnDivides);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setBounds(312, 515, 69, 50);
		btnEqual.setFocusable(false);
		btnEqual.setBackground(new Color(152, 251, 152));
		btnEqual.setForeground(new Color(0, 0, 0));
		btnEqual.setEnabled(false);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = Double.parseDouble(textField.getText());
				if(operation == "+")
				{
					result = first+second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "-")
				{
					result = first-second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "*")
				{
					result = first*second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "/")
				{
					result = first/second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "%")
				{
					result = first%second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "X^Y")
				{
					result = Math.pow(first,second);
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				
			}
		});
		btnEqual.setFont(new Font("Times New Roman", Font.BOLD, 30));
		frmSmartCalci.getContentPane().add(btnEqual);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(158, 278, 67, 50);
		btnC.setFocusable(false);
		btnC.setForeground(Color.WHITE);
		btnC.setBackground(new Color(178, 34, 34));
		btnC.setEnabled(false);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				
			}
		});
		btnC.setFont(new Font("Times New Roman", Font.BOLD, 25));
		frmSmartCalci.getContentPane().add(btnC);
		
		JButton btnSineh = new JButton("sinh");
		btnSineh.setBounds(158, 218, 67, 50);
		btnSineh.setFocusable(false);
		btnSineh.setForeground(new Color(255, 255, 255));
		btnSineh.setBackground(new Color(112, 128, 144));
		btnSineh.setEnabled(false);
		btnSineh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSineh.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		frmSmartCalci.getContentPane().add(btnSineh);
		
		JButton btnCosh = new JButton("cosh");
		btnCosh.setBounds(234, 217, 69, 50);
		btnCosh.setFocusable(false);
		btnCosh.setForeground(new Color(255, 255, 255));
		btnCosh.setBackground(new Color(112, 128, 144));
		btnCosh.setEnabled(false);
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCosh.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		frmSmartCalci.getContentPane().add(btnCosh);
		
		JButton btnTanh = new JButton("tanh");
		btnTanh.setBounds(312, 218, 69, 50);
		btnTanh.setFocusable(false);
		btnTanh.setForeground(new Color(255, 255, 255));
		btnTanh.setBackground(new Color(112, 128, 144));
		btnTanh.setEnabled(false);
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTanh.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		frmSmartCalci.getContentPane().add(btnTanh);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(87, 517, 140, 50);
		btn0.setFocusable(false);
		btn0.setForeground(new Color(255, 255, 255));
		btn0.setBackground(new Color(105, 105, 105));
		btn0.setEnabled(false);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Times New Roman", Font.BOLD, 30));
		frmSmartCalci.getContentPane().add(btn0);
		
		
		textField = new JTextField();
		textField.setBounds(12, 38, 369, 79);
		textField.setEnabled(false);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmSmartCalci.getContentPane().add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(408, 16, 7, 551);
		separator.setForeground(Color.WHITE);
		separator.setOrientation(SwingConstants.VERTICAL);
		frmSmartCalci.getContentPane().add(separator);
		
		JLabel lblNewLabel2 = new JLabel("Number Converter");
		lblNewLabel2.setBounds(448, 16, 238, 62);
		lblNewLabel2.setFocusable(false);
		lblNewLabel2.setEnabled(false);
		lblNewLabel2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel2.setForeground(Color.WHITE);
		frmSmartCalci.getContentPane().add(lblNewLabel2);
		
		
		
		textFieldDecimal = new JTextField();
		textFieldDecimal.setBounds(448, 111, 238, 62);
		textFieldDecimal.setForeground(Color.BLACK);
		textFieldDecimal.setEnabled(false);
		textFieldDecimal.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frmSmartCalci.getContentPane().add(textFieldDecimal);
		textFieldDecimal.setColumns(10);
		
		textFieldBinary = new JTextField();
		textFieldBinary.setBounds(448, 231, 238, 62);
		textFieldBinary.setForeground(Color.BLACK);
		textFieldBinary.setEnabled(false);
		textFieldBinary.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textFieldBinary.setColumns(10);
		frmSmartCalci.getContentPane().add(textFieldBinary);
		
		textFieldOctal = new JTextField();
		textFieldOctal.setBounds(448, 349, 238, 62);
		textFieldOctal.setForeground(Color.BLACK);
		textFieldOctal.setEnabled(false);
		textFieldOctal.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textFieldOctal.setColumns(10);
		frmSmartCalci.getContentPane().add(textFieldOctal);
		
		textFieldHex = new JTextField();
		textFieldHex.setBounds(448, 459, 238, 62);
		textFieldHex.setForeground(Color.BLACK);
		textFieldHex.setEnabled(false);
		textFieldHex.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textFieldHex.setColumns(10);
		frmSmartCalci.getContentPane().add(textFieldHex);
		
		
		JSeparator separator2 = new JSeparator();
		separator2.setBounds(435, 63, 220, 2);
		frmSmartCalci.getContentPane().add(separator2);
		
		JSeparator separator3 = new JSeparator();
		separator3.setBounds(714, 16, 7, 551);
		separator3.setOrientation(SwingConstants.VERTICAL);
		separator3.setForeground(Color.WHITE);
		frmSmartCalci.getContentPane().add(separator3);
		
		JLabel lblAsciiConverter = new JLabel("Ascii Converter");
		lblAsciiConverter.setBounds(777, 16, 238, 62);
		lblAsciiConverter.setForeground(Color.WHITE);
		lblAsciiConverter.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblAsciiConverter.setFocusable(false);
		lblAsciiConverter.setEnabled(false);
		frmSmartCalci.getContentPane().add(lblAsciiConverter);
		
		JSeparator separator4 = new JSeparator();
		separator4.setBounds(757, 63, 199, 2);
		frmSmartCalci.getContentPane().add(separator4);
		
		JLabel lblInputData = new JLabel("Input Data");
		lblInputData.setBounds(820, 88, 107, 33);
		lblInputData.setEnabled(false);
		lblInputData.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblInputData.setBackground(Color.DARK_GRAY);
		lblInputData.setForeground(Color.WHITE);
		frmSmartCalci.getContentPane().add(lblInputData);
		
		textPaneInput = new JTextPane();
		textPaneInput.setBounds(731, 123, 264, 144);
		textPaneInput.setEnabled(false);
		textPaneInput.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frmSmartCalci.getContentPane().add(textPaneInput);
		
		JLabel lblOutput = new JLabel("Ascii Value");
		lblOutput.setBounds(820, 292, 107, 25);
		lblOutput.setEnabled(false);
		lblOutput.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblOutput.setBackground(Color.DARK_GRAY);
		lblOutput.setForeground(Color.WHITE);
		frmSmartCalci.getContentPane().add(lblOutput);
		
		textPaneOutput = new JTextPane();
		textPaneOutput.setBounds(731, 322, 264, 158);
		textPaneOutput.setEnabled(false);
		frmSmartCalci.getContentPane().add(textPaneOutput);
		
		JButton btnAsciiConvert = new JButton("Convert");
		btnAsciiConvert.setBounds(910, 500, 85, 21);
		btnAsciiConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textPaneInput.getText();
		         String str = text.replaceAll("\\s", "");
		        try { 
		            byte[] bytes = str.getBytes("US-ASCII"); 
		            textPaneOutput.setText(Arrays.toString(bytes)); 
		        } 
		        catch (java.io.UnsupportedEncodingException c) 
		        {
		            c.printStackTrace(); 
		        }
			}
		});
		btnAsciiConvert.setFocusable(false);
		btnAsciiConvert.setEnabled(false);
		btnAsciiConvert.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		frmSmartCalci.getContentPane().add(btnAsciiConvert);
		
		JLabel lblFooter = new JLabel("\u00a9 2020 : By MANI - ANSITHA - LOKESH");
		lblFooter.setBounds(757, 560, 213, 25);
		lblFooter.setEnabled(false);
		lblFooter.setFont(new Font("Calibri", Font.ITALIC, 14));
		lblFooter.setBackground(Color.DARK_GRAY);
		lblFooter.setForeground(Color.WHITE);
		frmSmartCalci.getContentPane().add(lblFooter);
		
		JCheckBox chckbxDecimal = new JCheckBox("Decimal");
		chckbxDecimal.setBounds(525, 84, 93, 21);
		chckbxDecimal.setFocusable(false);
		chckbxDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldDecimal.setEnabled(true);
				textFieldBinary.setEnabled(false);
				textFieldOctal.setEnabled(false);
				textFieldHex.setEnabled(false);
				conversion = 1;
			}
		});
		buttonGroup.add(chckbxDecimal);
		chckbxDecimal.setEnabled(false);
		chckbxDecimal.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		chckbxDecimal.setBackground(Color.DARK_GRAY);
		chckbxDecimal.setForeground(Color.WHITE);
		frmSmartCalci.getContentPane().add(chckbxDecimal);
		
		JCheckBox chckbxBinary = new JCheckBox("Binary");
		chckbxBinary.setBounds(525, 204, 93, 21);
		chckbxBinary.setFocusable(false);
		chckbxBinary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldDecimal.setEnabled(false);
				textFieldBinary.setEnabled(true);
				textFieldOctal.setEnabled(false);
				textFieldHex.setEnabled(false);
				conversion = 2;
			}
		});
		buttonGroup.add(chckbxBinary);
		chckbxBinary.setEnabled(false);
		chckbxBinary.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		chckbxBinary.setBackground(Color.DARK_GRAY);
		chckbxBinary.setForeground(Color.WHITE);
		frmSmartCalci.getContentPane().add(chckbxBinary);
		
		JCheckBox chckbxOctal = new JCheckBox("Octal");
		chckbxOctal.setBounds(525, 322, 93, 21);
		chckbxOctal.setFocusable(false);
		chckbxOctal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldDecimal.setEnabled(false);
				textFieldBinary.setEnabled(false);
				textFieldOctal.setEnabled(true);
				textFieldHex.setEnabled(false);
				conversion = 3;
			}
		});
		buttonGroup.add(chckbxOctal);
		chckbxOctal.setEnabled(false);
		chckbxOctal.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		chckbxOctal.setBackground(Color.DARK_GRAY);
		chckbxOctal.setForeground(Color.WHITE);
		frmSmartCalci.getContentPane().add(chckbxOctal);
		
		JCheckBox chckbxHex = new JCheckBox("Hex");
		chckbxHex.setBounds(525, 432, 93, 21);
		chckbxHex.setFocusable(false);
		chckbxHex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldDecimal.setEnabled(false);
				textFieldBinary.setEnabled(false);
				textFieldOctal.setEnabled(false);
				textFieldHex.setEnabled(true);
				conversion = 4;
			}
		});
		buttonGroup.add(chckbxHex);
		chckbxHex.setEnabled(false);
		chckbxHex.setBackground(Color.DARK_GRAY);
		chckbxHex.setForeground(Color.WHITE);
		chckbxHex.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		frmSmartCalci.getContentPane().add(chckbxHex);
		
		
		
		JButton btnClear = new JButton("clear");
		btnClear.setBounds(601, 546, 85, 21);
		btnClear.setFocusable(false);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldDecimal.setText(null);
				textFieldBinary.setText(null);
				textFieldOctal.setText(null);
				textFieldHex.setText(null);
				textFieldDecimal.setEnabled(false);
				textFieldBinary.setEnabled(false);
				textFieldOctal.setEnabled(false);
				textFieldHex.setEnabled(false);
				buttonGroup.clearSelection();
				
			}
		});
		btnClear.setEnabled(false);
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		frmSmartCalci.getContentPane().add(btnClear);
		
		JButton btnClearAscii = new JButton("Clear Ascii");
		btnClearAscii.setBounds(729, 501, 107, 21);
		btnClearAscii.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPaneInput.setText(null);
				textPaneOutput.setText(null);

			}
		});
		btnClearAscii.setFocusable(false);
		btnClearAscii.setEnabled(false);
		btnClearAscii.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frmSmartCalci.getContentPane().add(btnClearAscii);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.setBounds(448, 548, 85, 21);
		btnConvert.setFocusable(false);
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(conversion == 1)
				{
					DecimalInt = Integer.parseInt(textFieldDecimal.getText());
					Binarystring = Integer.toBinaryString(DecimalInt);
					Octalstring = Integer.toOctalString(DecimalInt);
					Hexstring = Integer.toHexString(DecimalInt);
					textFieldBinary.setText(Binarystring);
					textFieldOctal.setText(Octalstring);
					textFieldHex.setText(Hexstring);
					textFieldDecimal.setEnabled(true);
					textFieldBinary.setEnabled(true);
					textFieldOctal.setEnabled(true);
					textFieldHex.setEnabled(true);
					
				}
				else if(conversion == 2)
				{
					BinaryInt = Integer.parseInt(textFieldBinary.getText());
					String Binary_str = Integer.toString(BinaryInt);
					int decimal=Integer.parseInt(Binary_str,2);
					Decimalstring = Integer.toString(decimal);
					Octalstring = Integer.toOctalString(decimal);
					Hexstring = Integer.toHexString(decimal);
					textFieldDecimal.setText(Decimalstring);
					textFieldOctal.setText(Octalstring);
					textFieldHex.setText(Hexstring);
					textFieldDecimal.setEnabled(true);
					textFieldBinary.setEnabled(true);
					textFieldOctal.setEnabled(true);
					textFieldHex.setEnabled(true);

				}
				else if(conversion == 3)
				{
					OctalInt = Integer.parseInt(textFieldOctal.getText());
					String Octal_str = Integer.toString(OctalInt);
					int decimal = Integer.parseInt(Octal_str,8);
					Decimalstring = Integer.toString(decimal);
					Binarystring = Integer.toBinaryString(decimal);
					Hexstring = Integer.toHexString(decimal);
					textFieldDecimal.setText(Decimalstring);
					textFieldBinary.setText(Binarystring);
					textFieldHex.setText(Hexstring);
					textFieldDecimal.setEnabled(true);
					textFieldBinary.setEnabled(true);
					textFieldOctal.setEnabled(true);
					textFieldHex.setEnabled(true);
					
				}
				else if(conversion == 4)
				{
					HexInput = textFieldHex.getText();
					int decimal = Integer.parseInt(HexInput,16);
					Decimalstring = Integer.toString(decimal);
					Binarystring = Integer.toBinaryString(decimal);
					Octalstring = Integer.toOctalString(decimal);
					textFieldDecimal.setText(Decimalstring);
					textFieldBinary.setText(Binarystring);
					textFieldOctal.setText(Octalstring);
					textFieldDecimal.setEnabled(true);
					textFieldBinary.setEnabled(true);
					textFieldOctal.setEnabled(true);
					textFieldHex.setEnabled(true);
					
				}
				
			}
		});
		btnConvert.setHorizontalAlignment(SwingConstants.RIGHT);
		btnConvert.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnConvert.setEnabled(false);
		frmSmartCalci.getContentPane().add(btnConvert);
		
		
		JRadioButton rdbtnOFF = new JRadioButton("OFF");
		rdbtnOFF.setBounds(228, 123, 102, 28);
		rdbtnOFF.setFocusable(false);
		rdbtnOFF.setEnabled(false);
		rdbtnOFF.setForeground(Color.WHITE);
		rdbtnOFF.setBackground(Color.DARK_GRAY);
		rdbtnOFF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btnDot.setEnabled(false);
				btnAdd.setEnabled(false);
				btnSubract.setEnabled(false);
				btnMultiply.setEnabled(false);
				btnDivides.setEnabled(false);
				btnEqual.setEnabled(false);
				btnRoot.setEnabled(false);
				btnExponent.setEnabled(false);
				btnSine.setEnabled(false);
				btnCos.setEnabled(false);
				btnTan.setEnabled(false);
				btnSineh.setEnabled(false);
				btnCosh.setEnabled(false);
				btnTanh.setEnabled(false);
				btnLog.setEnabled(false);
				btnReciprocal.setEnabled(false);
				btnSquare.setEnabled(false);
				btnCube.setEnabled(false);
				btnPercentage.setEnabled(false);
				btnB.setEnabled(false);
				btnC.setEnabled(false);
				btnPlusOrMinus.setEnabled(false);
				btn0.setEnabled(false);
				btnXPowY.setEnabled(false);
				btnFactorial.setEnabled(false);
				textField.setEnabled(false);
				textFieldDecimal.setEnabled(false);
				textFieldBinary.setEnabled(false);
				textFieldOctal.setEnabled(false);
				textFieldHex.setEnabled(false);
				lblNewLabel.setEnabled(false);
				btnVersion.setEnabled(false);
				textField.setText(null);
				textFieldDecimal.setText(null);
				textFieldBinary.setText(null);
				textFieldOctal.setText(null);
				textFieldHex.setText(null);
				separator.setEnabled(false);
				lblNewLabel2.setEnabled(false);
				chckbxDecimal.setEnabled(false);
				chckbxBinary.setEnabled(false);
				chckbxOctal.setEnabled(false);
				chckbxHex.setEnabled(false);
				separator2.setEnabled(false);
				btnClear.setEnabled(false);
				btnConvert.setEnabled(false);
				lblAsciiConverter.setEnabled(false);
				lblInputData.setEnabled(false);
				lblOutput.setEnabled(false);
				textPaneInput.setEnabled(false);
				textPaneOutput.setEnabled(false);
				btnAsciiConvert.setEnabled(false);
				btnClearAscii.setEnabled(false);
				textPaneInput.setText(null);
				textPaneOutput.setText(null);
				buttonGroup.clearSelection();
				
			}
		});
		buttonGroup_1.add(rdbtnOFF);
		rdbtnOFF.setFont(new Font("Times New Roman", Font.BOLD, 25));
		frmSmartCalci.getContentPane().add(rdbtnOFF);
		
		JRadioButton rdbtnON = new JRadioButton("ON");
		rdbtnON.setBounds(68, 123, 65, 28);
		rdbtnON.setFocusable(false);
		rdbtnON.setForeground(Color.WHITE);
		rdbtnON.setBackground(Color.DARK_GRAY);
		rdbtnON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btnDot.setEnabled(true);
				btnAdd.setEnabled(true);
				btnSubract.setEnabled(true);
				btnMultiply.setEnabled(true);
				btnDivides.setEnabled(true);
				btnEqual.setEnabled(true);
				btnRoot.setEnabled(true);
				btnExponent.setEnabled(true);
				btnSine.setEnabled(true);
				btnCos.setEnabled(true);
				btnTan.setEnabled(true);
				btnSineh.setEnabled(true);
				btnCosh.setEnabled(true);
				btnTanh.setEnabled(true);
				btnLog.setEnabled(true);
				btnReciprocal.setEnabled(true);
				btnSquare.setEnabled(true);
				btnCube.setEnabled(true);
				btnPercentage.setEnabled(true);
				btnB.setEnabled(true);
				btnC.setEnabled(true);
				btnPlusOrMinus.setEnabled(true);
				btn0.setEnabled(true);
				btnXPowY.setEnabled(true);
				btnFactorial.setEnabled(true);
				textField.setEnabled(true);
				lblNewLabel.setEnabled(true);
				rdbtnOFF.setEnabled(true);
				btnVersion.setEnabled(true);
				separator.setEnabled(true);
				lblNewLabel2.setEnabled(true);
				chckbxDecimal.setEnabled(true);
				chckbxBinary.setEnabled(true);
				chckbxOctal.setEnabled(true);
				chckbxHex.setEnabled(true);
				textFieldDecimal.setEnabled(true);
				textFieldBinary.setEnabled(true);
				textFieldOctal.setEnabled(true);
				textFieldHex.setEnabled(true);
				separator2.setEnabled(true);
				btnClear.setEnabled(true);
				btnConvert.setEnabled(true);
				lblAsciiConverter.setEnabled(true);
				lblInputData.setEnabled(true);
				lblOutput.setEnabled(true);
				textPaneInput.setEnabled(true);
				textPaneOutput.setEnabled(true);
				btnAsciiConvert.setEnabled(true);
				btnClearAscii.setEnabled(true);
				textPaneOutput.setEditable(false);
				buttonGroup.clearSelection();
			}
		});
		buttonGroup_1.add(rdbtnON);
		rdbtnON.setFont(new Font("Times New Roman", Font.BOLD, 25));
		frmSmartCalci.getContentPane().add(rdbtnON);
		
		JMenuBar menuBar = new JMenuBar();
		frmSmartCalci.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnFile);
		
		JMenuItem mntmStandard = new JMenuItem("Standard Calculator");
		mntmStandard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSmartCalci.setBounds(100, 100, 407, 640);
			}
		});
		mntmStandard.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.SHIFT_MASK));
		mnFile.add(mntmStandard);
		
		JSeparator Menu_separator_1 = new JSeparator();
		mnFile.add(Menu_separator_1);
		
		JMenuItem mntmNumberConverter = new JMenuItem("Number Converter");
		mntmNumberConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSmartCalci.setBounds(100, 100, 724, 643);
			}
		});
		mntmNumberConverter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.SHIFT_MASK));
		mnFile.add(mntmNumberConverter);
		
		JSeparator Menu_separator_2 = new JSeparator();
		mnFile.add(Menu_separator_2);
		
		JMenuItem mntmAsciiConverter = new JMenuItem("Ascii Converter");
		mntmAsciiConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSmartCalci.setBounds(100, 100, 1025, 645);
			}
		});
		mntmAsciiConverter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.SHIFT_MASK));
		mnFile.add(mntmAsciiConverter);
		
		JMenu mnManual = new JMenu("Instruction Mannual");
		mnManual.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnManual);
		
		JMenuItem mntmPdfbutton = new JMenuItem("click Here to View Mannual.");
		mntmPdfbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().open(new java.io.File("File\\Mannual.pdf"));
				}catch(Exception a) {
					a.printStackTrace();
				}
			}
		});
		mnManual.add(mntmPdfbutton);
		
		
		
	}
}