/*
 * Stage: Development-01
 * @author: Uğur Türkel, 119200070
 * @author: Vedat Vatan, 120200148
 * @author: Süleyman Mehmet Güneş, 119200077
 *
 * @author: waleed khaled alghool, 121200167
 * @author: abdulmoez Derrija 120200136
 * @author: Lütfü Orçun Selbasan, 119200063
 */

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class NewWindow extends JFrame implements ActionListener {
	private JLabel apple, Banana, carrots, milk;
	private JTextField Tapple, TBanana, Tcarrots, Tmilk;
	private JButton add_to_cart, empty_cart;
	public NewWindow() {
		
		setLayout(new GridLayout(5,2));
		setTitle("Cart");
		// Added items to choose from
		apple = new JLabel("Apple", SwingConstants.CENTER);
		Tapple = new JTextField();
		
		
		Banana = new JLabel("Banana", SwingConstants.CENTER);
		TBanana = new JTextField();
		
		carrots = new JLabel("Carrots", SwingConstants.CENTER);
		Tcarrots = new JTextField();
		
		
		milk = new JLabel("Milk", SwingConstants.CENTER);
		Tmilk = new JTextField();
		
		// Added buttons to interact with the UI
		add_to_cart = new JButton("Add to cart");
		empty_cart = new JButton("empty cart");
		
		// UI is updated with the labels, buttons, and inputs
		add(apple);
		add(Tapple);
		
		add(Banana);
		add(TBanana);
		
		add(carrots);
		add(Tcarrots);
		
		add(milk);
		add(Tmilk);
		
		add(empty_cart);
		add(add_to_cart);
		
		add_to_cart.addActionListener(this);
		empty_cart.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(1000, 1000);
		
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// We record the orders to Cart.txt file
		if (e.getSource()==add_to_cart) {
			FileWriter writer;
			try {
				writer = new FileWriter("Cart.txt",true);
				writer.write("Date of purchase: "+LocalDate.now()+"\n");
				writer.write("Number of Apples: "+Tapple.getText()+"\n");
				writer.write("Number of Banana: "+TBanana.getText()+"\n");
				writer.write("Number of Carrots: "+Tcarrots.getText()+"\n");
				writer.write("Number of Milk: "+Tmilk.getText()+"\n \n");
				writer.close();
			} catch (IOException e1) {

				System.out.println(e1.getMessage());
			}
			dispose();
		}
		// It reset the cart
		if (e.getSource()==empty_cart) {
			Tapple.setText("");
			TBanana.setText("");
			Tcarrots.setText("");
			Tmilk.setText("");
			
		}
		
	}
}
