import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class App {
	public static void main(String[] args) {

		// instanciando os componentes 
		JFrame frame = new JFrame();
		JLabel label = new JLabel();
		ImageIcon logo = new ImageIcon("imagens/logo1.PNG"); // logo do app
		ImageIcon icone = new ImageIcon("imagens/icone.png"); // icone do app
		
		//configurando o frame 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 650); // x, y
		frame.setTitle("ILP007");	//título do app
		frame.setVisible(true);	//ficar vísivel
		frame.setLayout(null);
		frame.add(label);	//adicionando o label "MENU"
		frame.setResizable(false);	//desbilitar resize
		frame.setIconImage(icone.getImage()); // icone do app
		frame.getContentPane().setBackground(new Color(230, 230, 250));	//cor background 
		
		//card layout
		//pra trocar frame de PRATO, SOBREMESA e BEBIDAS
		CardLayout layout = new CardLayout();
		JPanel deck = new JPanel();
		deck.setLayout(layout);
		frame.add(deck);
		JPanel PRATO = new JPanel();
		JPanel SOBREMESA = new JPanel();
		JPanel thirdCard = new JPanel();
		deck.add(PRATO, "primeiro");
		deck.add(SOBREMESA, "segundo");
		deck.add(thirdCard, "third");
		
		//primeiro panel, PRATOS
		PRATO.setSize(100, 100);
		PRATO.setBackground(Color.red);
		PRATO.setBounds(250, 270, 500, 300);
		
		//segundo panel, SOBREMESA
		SOBREMESA.setSize(100, 100);
		SOBREMESA.setBackground(Color.blue);
		SOBREMESA.setBounds(250, 270, 500, 300);
		
		// terceiro panel, BEBIDAS
		thirdCard.setSize(100, 100);
		thirdCard.setBackground(Color.yellow);
		thirdCard.setBounds(250, 270, 500, 300);

		// criar botoes para comida, sobremesa e bebida
		JButton botaoComida = new JButton();
		JButton botaoSobremesa = new JButton();
		JButton botaoBebida = new JButton();


		//primeiro panel
		deck.setSize(100, 100);
		deck.setBackground(Color.red);
		deck.setBounds(250, 270, 500, 300);

		// configurando o label (imagem e MENU)
		label.setText("MENU");
		label.setIcon(logo);
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(250, 20, 250, 250);
		label.setFont(new Font("Open Sans", Font.BOLD, 50));
		label.setVerticalTextPosition(JLabel.TOP);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setForeground(new Color(139, 0, 0));

		// configurando os botoes
		botaoComida.setBounds(50, 350, 150, 30);
		botaoComida.setText("Pratos");
		botaoComida.setFocusable(false);
		botaoComida.setForeground(new Color(139, 0, 0)); // cor do texto
		botaoComida.setBackground(new Color(240, 248, 255)); // cor de fundo
		botaoComida.setFont(new Font("Open Sans", Font.BOLD, 15));
		botaoComida.setHorizontalTextPosition(JButton.LEFT);
		botaoComida.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				layout.show(deck, "primeiro");
			}
		});
		frame.add(botaoComida);

		botaoSobremesa.setBounds(50, 400, 150, 30);
		botaoSobremesa.setText("Sobremesa");
		botaoSobremesa.setFocusable(false);
		botaoSobremesa.setForeground(new Color(139, 0, 0));
		botaoSobremesa.setBackground(new Color(240, 248, 255)); // cor de fundo
		botaoSobremesa.setFont(new Font("Open Sans", Font.BOLD, 15));
		botaoSobremesa.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				layout.show(deck, "segundo");
			}
		});
		frame.add(botaoSobremesa);

		botaoBebida.setBounds(50, 450, 150, 30);
		botaoBebida.setText("Bebidas");
		botaoBebida.setFocusable(false);
		botaoBebida.setForeground(new Color(139, 0, 0));
		botaoBebida.setBackground(new Color(240, 248, 255)); // cor de fundo
		botaoBebida.setFont(new Font("Open Sans", Font.BOLD, 15));
		botaoBebida.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				layout.show(deck, "third");
			}
		});
		frame.add(botaoBebida);

		PRATO prato1 = new PRATO("Feijoada", 50 , 10.99);
		PRATO prato2 = new PRATO("Moqueca", 90 , 37.99);
		PRATO prato3 = new PRATO("Arroz Carreteiro", 86 , 14.99);

	}
}

class MENU {
	// atributos
	public String nome;
	public int calorias;
	public double preco;

	// construtor da classe Menu
	public MENU(String nome, int calorias, double preco) {
		this.nome = nome;
		this.calorias = calorias;
		this.preco = preco;
	}

}

class PRATO extends MENU {

	public PRATO(String nome, int calorias, double preco) {
		super(nome, calorias, preco);
		
	}
}