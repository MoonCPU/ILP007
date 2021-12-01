import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class NovaPaginaPratos {

	JFrame framePratos = new JFrame(); 
	ImageIcon logoPratos = new ImageIcon("imagens/logo1.PNG");	//logo de pratos
	ImageIcon iconePratos = new ImageIcon("imagens/icone.png");	//icone de pratos
	JLabel labelPratos = new JLabel("Pratos");
	//construtor
	NovaPaginaPratos(){
		labelPratos.setBounds(100, 100, 100, 50);
		labelPratos.setFont(new Font("Open Sans", Font.BOLD, 20));
		
		framePratos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		framePratos.setSize(500, 550);	// x, y
		framePratos.setTitle("Pratos");
		framePratos.setVisible(true);
		framePratos.setLayout(null);
		framePratos.add(labelPratos);
		framePratos.setResizable(false);
		framePratos.setIconImage(iconePratos.getImage());	//icone do app
		framePratos.getContentPane().setBackground(new Color(230,230,250));
		
	}
}
