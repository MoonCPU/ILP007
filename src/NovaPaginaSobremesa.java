import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NovaPaginaSobremesa {

	JFrame frameSobremesa = new JFrame();
	ImageIcon logoSobremesa = new ImageIcon("imagens/logo1.PNG"); // logo de pratos
	ImageIcon iconeSobremesa = new ImageIcon("imagens/icone.png"); // icone de pratos
	JLabel labelPratos = new JLabel("Sobremesa");

	// construtor
	NovaPaginaSobremesa() {
		labelPratos.setBounds(100, 100, 100, 50);
		labelPratos.setFont(new Font("Open Sans", Font.BOLD, 20));

		frameSobremesa.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frameSobremesa.setSize(500, 550); // x, y
		frameSobremesa.setTitle("Sobremesa");
		frameSobremesa.setVisible(true);
		frameSobremesa.setLayout(null);
		frameSobremesa.add(labelPratos);
		frameSobremesa.setResizable(false);
		frameSobremesa.setIconImage(iconeSobremesa.getImage()); // icone do app
		frameSobremesa.getContentPane().setBackground(new Color(230, 230, 250));

	}

}
