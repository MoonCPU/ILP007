import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NovaPaginaBebidas {
	JFrame frameBebidas = new JFrame();
	ImageIcon logoBebidas = new ImageIcon("imagens/logo1.PNG"); // logo de pratos
	ImageIcon iconeBebidas = new ImageIcon("imagens/icone.png"); // icone de pratos
	JLabel labelPratos = new JLabel("Bebidas");

	// construtor
	NovaPaginaBebidas() {
		labelPratos.setBounds(100, 100, 100, 50);
		labelPratos.setFont(new Font("Open Sans", Font.BOLD, 20));

		frameBebidas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frameBebidas.setSize(500, 550); // x, y
		frameBebidas.setTitle("Sobremesa");
		frameBebidas.setVisible(true);
		frameBebidas.setLayout(null);
		frameBebidas.add(labelPratos);
		frameBebidas.setResizable(false);
		frameBebidas.setIconImage(iconeBebidas.getImage()); // icone do app
		frameBebidas.getContentPane().setBackground(new Color(230, 230, 250));

	}
}
