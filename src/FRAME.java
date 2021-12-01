import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FRAME extends JFrame{
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	ImageIcon logo = new ImageIcon("imagens/logo1.PNG"); // logo do app
	ImageIcon icone = new ImageIcon("imagens/icone.png"); // icone do app
	
	FRAME(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 550); // x, y
		frame.setTitle("ILP007");
		frame.setVisible(true);
		frame.setLayout(null);
		frame.add(label);
		frame.setResizable(false);
		frame.setIconImage(icone.getImage()); // icone do app
		frame.getContentPane().setBackground(new Color(230, 230, 250));

		// configurando o label (imagem e MENU)
		label.setText("MENU");
		label.setIcon(logo);
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(120, 20, 250, 250);
		label.setFont(new Font("Open Sans", Font.BOLD, 50));
		label.setVerticalTextPosition(JLabel.TOP);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setForeground(new Color(139, 0, 0));
	}
}
