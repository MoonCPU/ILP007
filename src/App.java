import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class App {
	public static void main(String[] args) {
		
		// instanciando os componentes 
		JFrame frame = new JFrame();
		JLabel label = new JLabel();
		ImageIcon logo = new ImageIcon("imagens/logo1.PNG"); // logo do app
		ImageIcon icone = new ImageIcon("imagens/icone.png"); // icone do app
		
		// ==================================== FRAME e LABEL =======================================
		
		//configurando o frame 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 590); // x, y
		frame.setTitle("ILP007");	//título do app
		frame.setVisible(true);	//ficar vísivel
		frame.setLayout(null);
		frame.add(label);	//adicionando o label "MENU"
		frame.setResizable(false);	//desbilitar resize
		frame.setIconImage(icone.getImage()); // icone do app
		frame.getContentPane().setBackground(new Color(248,248,255));	//cor background 
		
		// configurando o label (imagem e MENU)
		label.setText("MENU");
		label.setIcon(logo);
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(230, 20, 250, 250);
		label.setFont(new Font("Open Sans", Font.BOLD, 50));
		label.setVerticalTextPosition(JLabel.TOP);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setForeground(new Color(139, 0, 0));
		
		// ==================================== CARDLAYOUT =======================================
		
		//card layout
		//pra trocar frame de PRATO, SOBREMESA e BEBIDAS
		CardLayout layout = new CardLayout();	//criando instancia de CardLayout
		JPanel deck = new JPanel();
		deck.setLayout(layout);
		deck.setBounds(250, 270, 400, 250);
		frame.add(deck);
		JPanel PRATO = new JPanel();
		PRATO.setBackground(new Color(248,248,255));
		PRATO.setBorder(BorderFactory.createLineBorder(Color.black));	//fazer borda
		JPanel SOBREMESA = new JPanel();
		SOBREMESA.setBackground(new Color(248,248,255));
		SOBREMESA.setBorder(BorderFactory.createLineBorder(Color.black));
		JPanel BEBIDAS = new JPanel();
		BEBIDAS.setBackground(new Color(248,248,255));
		BEBIDAS.setBorder(BorderFactory.createLineBorder(Color.black));
		
		// ==================================== Menu Pratos =======================================
		
		//instanciando classe PRATO
		Prato prato1 = new Prato("Feijoada", 20.99);
		Prato prato2 = new Prato("Moqueca", 37.99);
		Prato prato3 = new Prato("Arroz Carreteiro", 14.99);
		Prato prato4 = new Prato("Bife à Parmegiana", 29.00);
		Prato prato5 = new Prato("Batata Frita", 9.99);
		Prato prato6 = new Prato("Peito de Frango", 16.99);
		Prato prato7 = new Prato("Lasanha", 32.99);
		
		//criando um label para cada instância JLabel para cada item Prato
		//não consigo usar o loop porque não dá pra criar novos objetos dinamicamente
		JLabel labelPrato1 = new JLabel();
		JLabel labelPrato2 = new JLabel();
		JLabel labelPrato3 = new JLabel();
		JLabel labelPrato4 = new JLabel();
		JLabel labelPrato5 = new JLabel();
		JLabel labelPrato6 = new JLabel();
		JLabel labelPrato7 = new JLabel();
		
		//formatando os labelPrato
		labelPrato1.setText(prato1.nome + "       R$ " + prato1.preco);
		labelPrato1.setFont(new Font("Open Sans", Font.PLAIN, 22));
		labelPrato2.setText(prato2.nome + "       R$ " + prato2.preco);
		labelPrato2.setFont(new Font("Open Sans", Font.PLAIN, 22));
		labelPrato3.setText(prato3.nome + "       R$ " + prato3.preco);
		labelPrato3.setFont(new Font("Open Sans", Font.PLAIN, 22));
		labelPrato4.setText(prato4.nome + "       R$ " + prato4.preco);
		labelPrato4.setFont(new Font("Open Sans", Font.PLAIN, 22));
		labelPrato5.setText(prato5.nome + "       R$ " + prato5.preco);
		labelPrato5.setFont(new Font("Open Sans", Font.PLAIN, 22));
		labelPrato6.setText(prato6.nome + "       R$ " + prato6.preco);
		labelPrato6.setFont(new Font("Open Sans", Font.PLAIN, 22));
		labelPrato7.setText(prato7.nome + "       R$ " + prato7.preco);
		labelPrato7.setFont(new Font("Open Sans", Font.PLAIN, 22));
		
		//adicionando os labels para o panel
		PRATO.add(labelPrato1);
		PRATO.add(labelPrato2);
		PRATO.add(labelPrato3);
		PRATO.add(labelPrato4);
		PRATO.add(labelPrato5);
		PRATO.add(labelPrato6);
		PRATO.add(labelPrato7);

		//adicionando jpanel PRATO ao jpanel deck
		deck.add(PRATO, "primeiro");
		
		// ==================================== Menu Sobremesa =======================================
		
		//instanciando classe Sobremesa
		Sobremesa sobr1 = new Sobremesa("Pudim", 3.99);
		Sobremesa sobr2 = new Sobremesa("Brigadeiro", 2.99);
		Sobremesa sobr3 = new Sobremesa("Paçoca", 1.99);
		Sobremesa sobr4 = new Sobremesa("Goiabada ", 6.00);
		Sobremesa sobr5 = new Sobremesa("Pé-de-moleque", 5.99);
		Sobremesa sobr6 = new Sobremesa("Quindim", 3.99);

		//criando um label para cada instância JLabel para cada item Sobremesa
		JLabel labelSobr1 = new JLabel();
		JLabel labelSobr2 = new JLabel();
		JLabel labelSobr3 = new JLabel();
		JLabel labelSobr4 = new JLabel();
		JLabel labelSobr5 = new JLabel();
		JLabel labelSobr6 = new JLabel();
		
		//formatando labelSobr
		labelSobr1.setText(sobr1.nome + "       R$ " + sobr1.preco);
		labelSobr1.setFont(new Font("Open Sans", Font.PLAIN, 22));
		labelSobr2.setText(sobr2.nome + "       R$ " + sobr2.preco);
		labelSobr2.setFont(new Font("Open Sans", Font.PLAIN, 22));
		labelSobr3.setText(sobr3.nome + "       R$ " + sobr3.preco);
		labelSobr3.setFont(new Font("Open Sans", Font.PLAIN, 22));
		labelSobr4.setText(sobr4.nome + "       R$ " + sobr4.preco);
		labelSobr4.setFont(new Font("Open Sans", Font.PLAIN, 22));
		labelSobr5.setText(sobr5.nome + "       R$ " + sobr5.preco);
		labelSobr5.setFont(new Font("Open Sans", Font.PLAIN, 22));
		labelSobr6.setText(sobr6.nome + "       R$ " + sobr6.preco);
		labelSobr6.setFont(new Font("Open Sans", Font.PLAIN, 22));
		
		//adicionando os labels para o panel
		SOBREMESA.add(labelSobr1);
		SOBREMESA.add(labelSobr2);
		SOBREMESA.add(labelSobr3);
		SOBREMESA.add(labelSobr4);
		SOBREMESA.add(labelSobr5);
		SOBREMESA.add(labelSobr6);
		deck.add(SOBREMESA, "segundo");
		
		// ==================================== Menu Bebidas =======================================
		//instanciando classe Sobremesa
		Bebidas bebida1 = new Bebidas("Água", 2.99);
		Bebidas bebida2 = new Bebidas("Refrigerante 2L", 8.99);
		Bebidas bebida3 = new Bebidas("Refrigerante Lata", 3.99);
		Bebidas bebida4 = new Bebidas("Suco de Laranja", 5.99);
		Bebidas bebida5 = new Bebidas("Milkshake", 6.99);

		//criando um label para cada instância JLabel para cada item Sobremesa
		JLabel labelBebida1 = new JLabel();
		JLabel labelBebida2 = new JLabel();
		JLabel labelBebida3 = new JLabel();
		JLabel labelBebida4 = new JLabel();
		JLabel labelBebida5 = new JLabel();
		
		//formatando labelSobr
		labelBebida1.setText(bebida1.nome + "       R$ " + bebida1.preco);
		labelBebida1.setFont(new Font("Open Sans", Font.PLAIN, 22));
		labelBebida2.setText(bebida2.nome + "       R$ " + bebida2.preco);
		labelBebida2.setFont(new Font("Open Sans", Font.PLAIN, 22));
		labelBebida3.setText(bebida3.nome + "       R$ " + bebida3.preco);
		labelBebida3.setFont(new Font("Open Sans", Font.PLAIN, 22));
		labelBebida4.setText(bebida4.nome + "       R$ " + bebida4.preco);
		labelBebida4.setFont(new Font("Open Sans", Font.PLAIN, 22));
		labelBebida5.setText(bebida5.nome + "       R$ " + bebida5.preco);
		labelBebida5.setFont(new Font("Open Sans", Font.PLAIN, 22));
		
		//adicionando os labels para o panel
		BEBIDAS.add(labelBebida1);
		BEBIDAS.add(labelBebida2);
		BEBIDAS.add(labelBebida3);
		BEBIDAS.add(labelBebida4);
		BEBIDAS.add(labelBebida5);
		// terceiro panel, BEBIDAS
		deck.add(BEBIDAS, "terceiro");

		// ==================================== BOTÃO =======================================
		
		// criar botoes para comida, sobremesa e bebida
		JRadioButton botaoPrato = new JRadioButton();
		JRadioButton botaoSobremesa = new JRadioButton();
		JRadioButton botaoBebida = new JRadioButton();
		
		ButtonGroup grupoBotao = new ButtonGroup();
		grupoBotao.add(botaoPrato);
		grupoBotao.add(botaoSobremesa);
		grupoBotao.add(botaoBebida);

		ImageIcon logoPrato = new ImageIcon("imagens/comida.PNG"); // logo de prato
		ImageIcon logoSobremesa = new ImageIcon("imagens/sobremesa.PNG"); // logo de sobremesa
		ImageIcon logoBebida = new ImageIcon("imagens/bebida.PNG"); // logo de sobremesa
		
		//cursor "apertável" para os botões
		Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
		
		// configurando os botoes
		botaoPrato.setBounds(60, 300, 100, 50);
		botaoPrato.setBackground(new Color(248,248,255)); // cor de fundo
		botaoPrato.setFocusable(false);
		botaoPrato.setIcon(logoPrato);	//colocando logo como botão
		botaoPrato.setCursor(cursor);
		botaoPrato.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				layout.show(deck, "primeiro");	//trocar para panel SOBREMESA
			}
		});
		frame.add(botaoPrato);

		botaoSobremesa.setBounds(70, 380, 100, 55);
		botaoSobremesa.setBackground(new Color(248,248,255)); // cor de fundo
		botaoSobremesa.setFocusable(false);
		botaoSobremesa.setIcon(logoSobremesa);
		botaoSobremesa.setCursor(cursor);
		botaoSobremesa.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				layout.show(deck, "segundo");	//trocar para panel 
			}
		});
		frame.add(botaoSobremesa);

		botaoBebida.setBounds(60, 460, 100, 50);
		botaoBebida.setBackground(new Color(248,248,255)); // cor de fundo
		botaoBebida.setFocusable(false);
		botaoBebida.setIcon(logoBebida);
		botaoBebida.setCursor(cursor);
		botaoBebida.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				layout.show(deck, "terceiro");
			}
		});
		frame.add(botaoBebida);
		

	}
	
}

// ==================================== CLASSES =======================================

class Menu {
	// atributos
	public String nome;
	public double preco;
	static String tipo;

	// construtor da classe Menu
	public Menu(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public void tipo() {
		System.out.println("Isso é um tipo Menu");
	}

}

//classe prato
class Prato extends Menu {
	static String tipo = "prato principal";
	public Prato(String nome, double preco) {
		super(nome, preco);
	}
	
	@Override
	public void tipo() {
		System.out.println(Prato.tipo);
	}
}

//classe sobremesa
class Sobremesa extends Menu {
	static String tipo = "sobremesas";
	public Sobremesa(String nome, double preco) {
		super(nome, preco);
	}
	
	@Override
	public void tipo() {
		System.out.println(Sobremesa.tipo);
	}
}

//classe bebidas
class Bebidas extends Menu {
	static String tipo = "Bebidas";
	public Bebidas(String nome, double preco) {
		super(nome, preco);
	}
	
	@Override
	public void tipo() {
		System.out.println(Bebidas.tipo);
	}
}