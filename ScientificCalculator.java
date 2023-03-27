import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;

import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import java.awt.SystemColor;

public class ScientificCalculator {

	private JFrame frame;
	private JTextField TextField;
    
	double numb1;
    double numb2;
	double result;
    String action;
	String solution;
	private final ButtonGroup buttonGroup = new ButtonGroup();
    
    
    /**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScientificCalculator window = new ScientificCalculator();
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
	public ScientificCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(173, 216, 230));
		frame.getContentPane().setBackground(new Color(173, 216, 230));
		frame.setBounds(100, 100, 390, 589);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 112, 353, 425);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_2.setBackground(new Color(112, 128, 144));
		frame.getContentPane().add(panel_2);
		
		JButton buttonRoot = new JButton("\u221A");
		buttonRoot.setBackground(new Color(240, 255, 255));
		buttonRoot.setBounds(10, 43, 55, 42);
		buttonRoot.setEnabled(false);
		buttonRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double d = Math.sqrt(Double.parseDouble(TextField.getText()));
	            TextField.setText("");
			    TextField.setText(TextField.getText()+d);   
		    }
		});
		panel_2.setLayout(null);
		buttonRoot.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_2.add(buttonRoot);
		
		JButton button1 = new JButton("1/x");
		button1.setBackground(new Color(240, 255, 255));
		button1.setBounds(10, 101, 55, 42);
		button1.setEnabled(false);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Double d = 1/(Double.parseDouble(TextField.getText()));
				   TextField.setText("");
				   TextField.setText(TextField.getText()+d);
			}
		});
		button1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panel_2.add(button1);
		
		JButton buttonExp = new JButton("e");
		buttonExp.setBackground(new Color(240, 255, 255));
		buttonExp.setBounds(10, 157, 55, 42);
		buttonExp.setEnabled(false);
		buttonExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String numb = TextField.getText()+2.71828182846;
				   TextField.setText(numb);	
			}
		});
		buttonExp.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_2.add(buttonExp);
		
		JButton Numb7 = new JButton("7");
		Numb7.setBackground(Color.WHITE);
		Numb7.setBounds(10, 210, 48, 42);
		Numb7.setEnabled(false);
		Numb7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String numb = TextField.getText()+Numb7.getText();
				   TextField.setText(numb);
			}
		});
		Numb7.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panel_2.add(Numb7);
		
		JButton Numb4 = new JButton("4");
		Numb4.setBackground(Color.WHITE);
		Numb4.setBounds(10, 263, 48, 42);
		Numb4.setEnabled(false);
		Numb4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String numb = TextField.getText()+Numb4.getText();
				   TextField.setText(numb);
			}
		});
		Numb4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panel_2.add(Numb4);
		
		JButton Numb1 = new JButton("1");
		Numb1.setBackground(Color.WHITE);
		Numb1.setBounds(10, 316, 48, 42);
		Numb1.setEnabled(false);
		Numb1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Numb1.addActionListener(new ActionListener() {
		

			public void actionPerformed(ActionEvent e) {
			   String numb = TextField.getText()+Numb1.getText();
			   TextField.setText(numb);
			}
		});
		panel_2.add(Numb1);
		
		JButton Numb0 = new JButton("0");
		Numb0.setBackground(Color.WHITE);
		Numb0.setBounds(10, 369, 48, 42);
		Numb0.setEnabled(false);
		Numb0.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Numb0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String numb = TextField.getText()+Numb0.getText();
				   TextField.setText(numb);
			}
		});
		panel_2.add(Numb0);
		
		JButton button2 = new JButton("x^y");
		button2.setBackground(new Color(240, 255, 255));
		button2.setBounds(78, 43, 55, 42);
		button2.setEnabled(false);
		button2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 numb1 = Double.parseDouble(TextField.getText());
				   TextField.setText("");
				   action = "x^y";
			}
		});
		panel_2.add(button2);
		

		
		JButton button3 = new JButton();
		button3.setFont(new Font("Times New Roman", Font.BOLD, 13));
		button3.setBackground(new Color(240, 255, 255));
		button3.setBounds(147, 43, 55, 42);
		button3.setEnabled(false);
		button3.setText("x^2");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double d = (Double.parseDouble(TextField.getText()));
			    d = d*d;
			    TextField.setText("");
			    TextField.setText(TextField.getText()+d);
			}
		});
		panel_2.add(button3);
		
	    JButton btnNewButton  = new JButton("D");
	    btnNewButton.setBackground(new Color(240, 255, 255));
	    btnNewButton.setBounds(70, 7, 44, 29);
	    btnNewButton.setEnabled(false);
		btnNewButton .setFont(new Font("Times New Roman", Font.BOLD, 9));
		btnNewButton .addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
		       double d = Math.toDegrees(Double.parseDouble(TextField.getText()));
				   TextField.setText("");
				   TextField.setText(TextField.getText()+d);
			}
		});
		
		panel_2.add(btnNewButton );
			
		JButton button4 = new JButton("x^-y");
		button4.setBackground(new Color(240, 255, 255));
		button4.setBounds(217, 43, 55, 42);
		button4.setEnabled(false);
		button4.setFont(new Font("Times New Roman", Font.BOLD, 11));
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 numb1 = Double.parseDouble(TextField.getText());
				   TextField.setText("");
				   action = "x^-y";
			}
		});
		panel_2.add(button4);
		
		JButton buttonexp = new JButton("e^x");
		buttonexp.setBackground(new Color(240, 255, 255));
		buttonexp.setBounds(282, 43, 56, 42);
		buttonexp.setEnabled(false);
		buttonexp.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		buttonexp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Double d = Math.exp(Double.parseDouble(TextField.getText()));
				   TextField.setText("");
				   TextField.setText(TextField.getText()+d);
			}
		});
		panel_2.add(buttonexp);
		
		JButton buttonSin = new JButton("Sin");
		buttonSin.setBackground(new Color(240, 255, 255));
		buttonSin.setBounds(78, 101, 55, 42);
		buttonSin.setEnabled(false);
		buttonSin.setFont(new Font("Times New Roman", Font.BOLD, 13));
		buttonSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   Double d = Math.sin(Double.parseDouble(TextField.getText()));
			   TextField.setText("");
			   TextField.setText(TextField.getText()+d);
			}
		});
		panel_2.add(buttonSin);
		
		JButton buttonCos = new JButton("Cos");
		buttonCos.setBackground(new Color(240, 255, 255));
		buttonCos.setBounds(147, 101, 55, 42);
		buttonCos.setEnabled(false);
		buttonCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Double d = Math.cos(Double.parseDouble(TextField.getText()));
				   TextField.setText("");
				   TextField.setText(TextField.getText()+d);
			}
		});
		buttonCos.setFont(new Font("Times New Roman", Font.BOLD, 12));
		panel_2.add(buttonCos);
		
		JButton buttonTan = new JButton("Tan");
		buttonTan.setBackground(new Color(240, 255, 255));
		buttonTan.setBounds(217, 101, 55, 42);
		buttonTan.setEnabled(false);
		buttonTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Double d = Math.tan(Double.parseDouble(TextField.getText()));
				   TextField.setText("");
				   TextField.setText(TextField.getText()+d);
			}
		});
		buttonTan.setFont(new Font("Times New Roman", Font.BOLD, 12));
		panel_2.add(buttonTan);
		
		JButton buttonLog = new JButton("Log");
		buttonLog.setFont(new Font("Times New Roman", Font.BOLD, 13));
		buttonLog.setBackground(new Color(240, 255, 255));
		buttonLog.setBounds(282, 101, 56, 42);
		buttonLog.setEnabled(false);
		buttonLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Double d = Math.log(Double.parseDouble(TextField.getText()));
				   TextField.setText("");
				   TextField.setText(TextField.getText()+d);
			}
		});
		panel_2.add(buttonLog);
		
		JButton buttonarcS = new JButton("arcS");
		buttonarcS.setBackground(new Color(240, 255, 255));
		buttonarcS.setBounds(78, 157, 55, 42);
		buttonarcS.setEnabled(false);
		buttonarcS.setFont(new Font("Times New Roman", Font.BOLD, 10));
		buttonarcS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Double d = Math.asin(Double.parseDouble(TextField.getText()));
				   TextField.setText("");
				   TextField.setText(TextField.getText()+d);
			}
		});
		panel_2.add(buttonarcS);
		
		JButton buttonarcC = new JButton("arcC");
		buttonarcC.setBackground(new Color(240, 255, 255));
		buttonarcC.setBounds(147, 157, 55, 42);
		buttonarcC.setEnabled(false);
		buttonarcC.setFont(new Font("Times New Roman", Font.BOLD, 10));
		buttonarcC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Double d = Math.acos(Double.parseDouble(TextField.getText()));
				   TextField.setText("");
				   TextField.setText(TextField.getText()+d);
			}
		});
		panel_2.add(buttonarcC);
		
		JButton buttonarcT = new JButton("arcT");
		buttonarcT.setBackground(new Color(240, 255, 255));
		buttonarcT.setBounds(217, 157, 55, 42);
		buttonarcT.setEnabled(false);
		buttonarcT.setFont(new Font("Times New Roman", Font.BOLD, 10));
		buttonarcT.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
				 Double d = Math.atan(Double.parseDouble(TextField.getText()));
				   TextField.setText("");
				   TextField.setText(TextField.getText()+d);
			}
		});
		panel_2.add(buttonarcT);
		
		JButton buttonFact = new JButton("n!");
		buttonFact.setBackground(new Color(240, 255, 255));
		buttonFact.setBounds(282, 157, 56, 42);
		buttonFact.setEnabled(false);
		buttonFact.setFont(new Font("Tahoma", Font.PLAIN, 16));
		buttonFact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double d = (Double.parseDouble(TextField.getText()));
				  int fact=1;  
				   
				  for(int i=1; i <= d; i++){    
				      fact=fact*i;
			    }
				TextField.setText("");
			    TextField.setText(TextField.getText()+fact);
			}
		});
		panel_2.add(buttonFact);
		
		JButton Numb8 = new JButton("8");
		Numb8.setBackground(Color.WHITE);
		Numb8.setBounds(78, 210, 48, 42);
		Numb8.setEnabled(false);
		Numb8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String numb = TextField.getText()+Numb8.getText();
				   TextField.setText(numb);
			}
		});
		Numb8.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panel_2.add(Numb8);
		
		JButton Numb9 = new JButton("9");
		Numb9.setBackground(Color.WHITE);
		Numb9.setBounds(147, 210, 48, 42);
		Numb9.setEnabled(false);
		Numb9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String numb = TextField.getText()+Numb9.getText();
				   TextField.setText(numb);
			}
		});
		Numb9.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panel_2.add(Numb9);
		
		JButton buttonDel = new JButton("Del");
		buttonDel.setBackground(new Color(219, 112, 147));
		buttonDel.setBounds(217, 210, 55, 42);
		buttonDel.setEnabled(false);
		buttonDel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		buttonDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   String str = TextField.getText();
			   TextField.setText("");
			   for(int i=0; i<str.length()-1; i++) {
			       TextField.setText(TextField.getText()+str.charAt(i));
			   }
			}
		});
		panel_2.add(buttonDel);
		
		JButton button5 = new JButton("+/-");
		button5.setBackground(new Color(240, 255, 255));
		button5.setBounds(10, 7, 50, 29);
		button5.setEnabled(false);
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double scr = Double.parseDouble(String.valueOf(TextField.getText()));
				   scr = scr*(-1);
				   TextField.setText(String.valueOf(scr));
		    }
		});
        button5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		panel_2.add(button5);
		
        JButton buttonRad = new JButton("r");
        buttonRad.setBackground(new Color(240, 255, 255));
        buttonRad.setBounds(125, 7, 44, 29);
        buttonRad.setEnabled(false);
		buttonRad.setFont(new Font("Times New Roman", Font.BOLD, 11));
		buttonRad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
               double d = Math.toRadians(Double.parseDouble(TextField.getText()));
				  TextField.setText("");
				  TextField.setText(TextField.getText()+d);
			}
		});
		panel_2.add(buttonRad);
		
		JButton buttonRound = new JButton("R");
		buttonRound.setBackground(new Color(240, 255, 255));
		buttonRound.setBounds(180, 7, 44, 29);
		buttonRound.setEnabled(false);
		buttonRound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   double d = Math.round(Double.parseDouble(TextField.getText()));
				  TextField.setText("");
			      TextField.setText(TextField.getText()+d);
			}
		});
		buttonRound.setFont(new Font("Times New Roman", Font.BOLD, 10));
		panel_2.add(buttonRound);
		
		JButton buttonAC = new JButton("AC");
		buttonAC.setBackground(new Color(219, 112, 147));
		buttonAC.setBounds(282, 210, 56, 42);
		buttonAC.setEnabled(false);
		buttonAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   TextField.setText(null);
			}
		});
		buttonAC.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		panel_2.add(buttonAC);
		
		JButton Numb5 = new JButton("5");
		Numb5.setBackground(Color.WHITE);
		Numb5.setBounds(78, 263, 48, 42);
		Numb5.setEnabled(false);
		Numb5.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Numb5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String numb = TextField.getText()+Numb5.getText();
				   TextField.setText(numb);
			}
		});
		panel_2.add(Numb5);
		
		JButton Numb6 = new JButton("6");
		Numb6.setBackground(Color.WHITE);
		Numb6.setBounds(147, 263, 48, 42);
		Numb6.setEnabled(false);
		Numb6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String numb = TextField.getText()+Numb6.getText();
				   TextField.setText(numb);
			}
		});
		Numb6.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panel_2.add(Numb6);
		
		JButton buttonMultiply = new JButton("*");
		buttonMultiply.setBackground(Color.WHITE);
		buttonMultiply.setBounds(217, 263, 55, 42);
		buttonMultiply.setEnabled(false);
		buttonMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    numb1 = Double.parseDouble(TextField.getText());
				TextField.setText("");
				action = "*";
			}
		});
		buttonMultiply.setFont(new Font("Tahoma", Font.PLAIN, 23));
		panel_2.add(buttonMultiply);
		
		JButton buttonDivide = new JButton("/");
		buttonDivide.setBackground(Color.WHITE);
		buttonDivide.setBounds(282, 263, 56, 42);
		buttonDivide.setEnabled(false);
		buttonDivide.setFont(new Font("Tahoma", Font.PLAIN, 23));
		buttonDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numb1 = Double.parseDouble(TextField.getText());
				TextField.setText("");
				action = "/";
			}
		});
		panel_2.add(buttonDivide);
		
		JButton Numb2 = new JButton("2");
		Numb2.setBackground(Color.WHITE);
		Numb2.setBounds(78, 316, 48, 42);
		Numb2.setEnabled(false);
		Numb2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Numb2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
				
				 String numb = TextField.getText()+Numb2.getText();
				   TextField.setText(numb);
			}
		});
		panel_2.add(Numb2);
		
		JButton Numb3 = new JButton("3");
		Numb3.setBackground(Color.WHITE);
		Numb3.setBounds(147, 316, 48, 42);
		Numb3.setEnabled(false);
		Numb3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Numb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String numb = TextField.getText()+Numb3.getText();
				   TextField.setText(numb);
			}
		});
		panel_2.add(Numb3);
		
		JButton buttonAdd = new JButton("+");
		buttonAdd.setBackground(Color.WHITE);
		buttonAdd.setBounds(217, 316, 55, 42);
		buttonAdd.setEnabled(false);
		buttonAdd.setFont(new Font("Tahoma", Font.PLAIN, 23));
		buttonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   numb1 = Double.parseDouble(TextField.getText());
			   TextField.setText("");
			   action = "+";
			}
		});
		panel_2.add(buttonAdd);
		
		JButton buttonSubtract = new JButton("-");
		buttonSubtract.setBackground(Color.WHITE);
		buttonSubtract.setBounds(282, 316, 56, 42);
		buttonSubtract.setEnabled(false);
		buttonSubtract.setFont(new Font("Tahoma", Font.PLAIN, 23));
		buttonSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				   numb1 = Double.parseDouble(TextField.getText());
				   TextField.setText("");
				   action = "-";
			}
		});
		panel_2.add(buttonSubtract);
		
		JButton buttonDot = new JButton(".");
		buttonDot.setBackground(Color.WHITE);
		buttonDot.setBounds(78, 369, 48, 42);
		buttonDot.setEnabled(false);
		buttonDot.setFont(new Font("Tahoma", Font.PLAIN, 30));
		buttonDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String numb = TextField.getText()+buttonDot.getText();
				   TextField.setText(numb);
			}
		});
		panel_2.add(buttonDot);
		
		JButton buttonPI = new JButton("\u03C0");
		buttonPI.setBackground(Color.WHITE);
		buttonPI.setBounds(147, 369, 48, 42);
		buttonPI.setEnabled(false);
		buttonPI.setFont(new Font("Times New Roman", Font.BOLD, 17));
		buttonPI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String numb = TextField.getText()+Math.PI;
				   TextField.setText(numb);
			}
		});
		panel_2.add(buttonPI);
		
		JButton buttonPerc = new JButton("%");
		buttonPerc.setBackground(Color.WHITE);
		buttonPerc.setBounds(217, 369, 55, 42);
		buttonPerc.setEnabled(false);
		buttonPerc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numb1 = Double.parseDouble(TextField.getText());
				TextField.setText("");
				action = "%";
			}
		});
		buttonPerc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(buttonPerc);
		
		JButton buttonEqual = new JButton("=");
		buttonEqual.setBackground(new Color(173, 255, 47));
		buttonEqual.setBounds(283, 369, 55, 42);
		buttonEqual.setEnabled(false);
		buttonEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  numb2 = Double.parseDouble(TextField.getText());
					if(action == "+") {
			           
						result = numb1+numb2;
					    solution = String.format("%.8f", result);
					    TextField.setText(solution);
					}
					else if(action == "-") {
				           
						result = numb1-numb2;
					    solution = String.format("%.8f", result);
					    TextField.setText(solution);
					}
					else if(action == "*") {
				           
						result = numb1*numb2;
					    solution = String.format("%.8f", result);
					    TextField.setText(solution);
					}
					else if(action == "/") {
				           
						result = numb1/numb2;
					    solution = String.format("%.8f", result);
					    TextField.setText(solution);
					}
					else if(action == "%") {
				           
						result = numb1%numb2;
					    solution = String.format("%.8f", result);
					    TextField.setText(solution);
					}
					else if (action == "x^-y")
					{   
						numb2 = numb2*(-1);
						
						double result = Math.pow(numb1, numb2);
					    solution = String.format("%.8f", result);
					    TextField.setText(solution);
					}
					else if (action == "x^y")
					{   
						double result = Math.pow(numb1, numb2);
					    solution = String.format("%.8f", result);
					    TextField.setText(solution);
					}
					else if (action == "x/y")
					{   
						double results = 0.0;
						
							results = numb1/numb2;
						
					    solution = String.format("%.8f", results);
					    TextField.setText(solution);
					}
			}
		});
		buttonEqual.setFont(new Font("Tahoma", Font.PLAIN, 23));
		panel_2.add(buttonEqual);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("On");
		rdbtnNewRadioButton.setBounds(294, 7, 44, 23);
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  
				   Numb0.setEnabled(true);
				   Numb1.setEnabled(true);
				   Numb2.setEnabled(true);
				   Numb3.setEnabled(true);
				   Numb4.setEnabled(true);
				   Numb5.setEnabled(true);
				   Numb6.setEnabled(true);
				   Numb7.setEnabled(true);
				   Numb8.setEnabled(true);
				   Numb9.setEnabled(true);
				
				   buttonAdd.setEnabled(true);
				   buttonSubtract.setEnabled(true);
				   buttonMultiply.setEnabled(true);
				   buttonDivide.setEnabled(true);
				   buttonPerc.setEnabled(true);
	               
				   buttonEqual.setEnabled(true);

				   buttonPI.setEnabled(true);
				   buttonDot.setEnabled(true);
				   buttonExp.setEnabled(true);
				 

				   buttonAC.setEnabled(true);
	               buttonDel.setEnabled(true);

				   buttonSin.setEnabled(true);
	               buttonCos.setEnabled(true);
	               buttonTan.setEnabled(true);
	               
	               buttonarcS.setEnabled(true);
	               buttonarcC.setEnabled(true);
	               buttonarcT.setEnabled(true);

				   buttonLog.setEnabled(true);
	               buttonexp.setEnabled(true);

				   buttonRoot.setEnabled(true);

				   buttonFact.setEnabled(true);

				   buttonRoot.setEnabled(true);

				   button1.setEnabled(true);
                   button2.setEnabled(true);
                   button3.setEnabled(true);
                   button4.setEnabled(true);
                   button5.setEnabled(true);
	               
                   btnNewButton.setEnabled(true);
	               buttonRad.setEnabled(true);
	               buttonRound.setEnabled(true);
	               
	               TextField.setEnabled(true);
			}
		});
		
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBackground(new Color(95, 158, 160));
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_2.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Off");
		rdbtnNewRadioButton_1.setBounds(244, 7, 48, 23);
		rdbtnNewRadioButton_1.setSelected(true);
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				   Numb0.setEnabled(false);
				   Numb1.setEnabled(false);
				   Numb2.setEnabled(false);
				   Numb3.setEnabled(false);
				   Numb4.setEnabled(false);
				   Numb5.setEnabled(false);
				   Numb6.setEnabled(false);
				   Numb7.setEnabled(false);
				   Numb8.setEnabled(false);
				   Numb9.setEnabled(false);
				
				   buttonAdd.setEnabled(false);
				   buttonSubtract.setEnabled(false);
				   buttonMultiply.setEnabled(false);
				   buttonDivide.setEnabled(false);
				   buttonPerc.setEnabled(false);
	               
				   buttonEqual.setEnabled(false);

				   buttonPI.setEnabled(false);
				   buttonDot.setEnabled(false);
				   buttonExp.setEnabled(false);
				 

				   buttonAC.setEnabled(false);
	               buttonDel.setEnabled(false);

				   buttonSin.setEnabled(false);
	               buttonCos.setEnabled(false);
	               buttonTan.setEnabled(false);
	               
	               buttonarcS.setEnabled(false);
	               buttonarcC.setEnabled(false);
	               buttonarcT.setEnabled(false);

				   buttonLog.setEnabled(false);
	               buttonexp.setEnabled(false);

				   buttonRoot.setEnabled(false);

				   buttonFact.setEnabled(false);

				   buttonRoot.setEnabled(false);

				   button1.setEnabled(false);
                   button2.setEnabled(false);
                   button3.setEnabled(false);
                   button4.setEnabled(false);
                   button5.setEnabled(false);
	               
                   btnNewButton.setEnabled(false);
	               buttonRad.setEnabled(false);
	               buttonRound.setEnabled(false);
	               
	               TextField.setEnabled(false);
			}
		});
		
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBackground(new Color(95, 158, 160));
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_2.add(rdbtnNewRadioButton_1);
		
        JLabel lblNewLabel = new JLabel("Casino");
		lblNewLabel.setBounds(10, 30, 272, -14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Casino");
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 0, 123, 25);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(214, 0, 133, 31);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBackground(new Color(250, 250, 210));
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("Two Way Power");
		lblNewLabel_2.setBounds(261, 30, 86, 20);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 9));
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Fx-991-ES");
		lblNewLabel_3.setBackground(new Color(248, 248, 255));
		lblNewLabel_3.setBounds(10, 30, 96, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		TextField = new JTextField();
		TextField.setBackground(Color.WHITE);
		TextField.setEnabled(false);
		TextField.setEditable(false);
		TextField.setBounds(10, 53, 353, 48);
		TextField.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(TextField);
		TextField.setColumns(10);
	}
}

