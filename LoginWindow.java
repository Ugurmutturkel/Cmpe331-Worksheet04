/*
 * Stage: Development-01
 * @author: Vedat Vatan
 * @author: Uğur Türkel
 * @author: Süleyman Mehmet Güneş
 *
 */

import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class LoginWindow extends JFrame implements ActionListener   {

	// main method for testing the application
	public static void main(String[] args) {
		new LoginWindow();
	}


	/*
	 * Graphical User Interface (GUI) Elements
	 *
	 * ! PLEASE RENAME THE OBJECTS ACCORDING TO THEIR PURPOSES !
	 * ! YOU CAN ADD MORE ELEMENTS IF IT IS NECESSARY !
	 */
	private JButton btn01, btn02;
	private JLabel lbl01, lbl02;
	private JTextField txt01, txt02;


	// Constructor
	public LoginWindow () {

		this.initializeGUI();
		this.setWindowProperties(3, 2);
		this.addGUIElementsToFrame();

	}


	/**
	 * Initialize GUI elements. If it is necessary, you can add more
	 * 	elements.
	 */
	public void initializeGUI() {
		lbl01 = new JLabel("User Name", SwingConstants.CENTER);
		lbl02 = new JLabel("Password", SwingConstants.CENTER);

		txt01 = new JTextField(); //For getting User Name
		txt02 = new JTextField(); //For Gettin PW

		txt01.setHorizontalAlignment(SwingConstants.CENTER);
		txt02.setHorizontalAlignment(SwingConstants.CENTER);

		btn01 = new JButton("Login");
		btn02 = new JButton("Sign-up");

		btn01.addActionListener(this);
		btn02.addActionListener(this);
	}

	NewWindow(){

		JFrame frame = new JFrame();
		JLabel label = new JLabel("Next Page");

		label.setBounds(150,100,300,50);

		frame.add(label);

		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);



	}

	/**
	 * Set the necessary properties for the window
	 *
	 * @param numRow number of row for GUI elements
	 * @param numCol number of column for GUI elements
	 */
	public void setWindowProperties(int numRow, int numCol) {
		this.setLayout(new GridLayout(numRow, numCol));

		this.setSize(800, 800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}


	/**
	 * Add GUI elements to the layout of the frame. If it is necessary,
	 * 	you can add more elements.
	 */
	public void addGUIElementsToFrame() {
		this.add(lbl01);
		this.add(txt01);

		this.add(lbl02);
		this.add(txt02);

		this.add(btn01);
		this.add(btn02);
	}


	/**
	 * Add margin to the frame.
	 */
	@Override
    public Insets getInsets() {
        return new Insets(100, 50, 100, 50);
    }


	/**
	 * Action listener for the buttons. If e.getSource() is from
	 * 	one of the buttons, apply the related operation.
	 *
	 * @param e action event for detecting which button is clicked
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn01)
			login();

		else if(e.getSource() == btn02)
			signup();

)

		// TODO Auto-generated method stub

	}
	public login(){
		 txt01.getText()//Get username
		txt02.getText() //Get PW
		NewWindow myWindow = new NewWindow();
}

	public signup(){
		txt01.getText()//Get username

		txt02.getText() //Get PW
		NewWindow myWindow = new NewWindow(); //
	}
