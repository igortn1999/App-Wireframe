//<-Clique para expandir esse painel!---
//---------Entrega Parcial APMD---------
//-----Nome: Igor Tomazelli Nietmann----
//--------------RM: 82808---------------
//------------Turma: 3ECA---------------


package packageWireframe;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class AppWireframe extends JFrame{
	
	public void init() {
		//definindo titulo
		this.setTitle("Zona Sul é 10, minha NAC também");
		//adicionando tabbedpane 
		JTabbedPane abas = new JTabbedPane();
		
		
		
		//--------------PANEL DETALHES---------
		JPanel detalhes = new JPanel();
		detalhes.setLayout(new BoxLayout(detalhes, BoxLayout.X_AXIS));
		//box layout foi utilizado por ser mais flexivel
		//boxESQ (só a imagem)----------------
		JPanel boxESQ = new JPanel();
		//adicionando e formatando a imagem
		JLabel capa = new JLabel();
		capa.setPreferredSize(new Dimension(170,200));
		ImageIcon imageIcon = new ImageIcon(new ImageIcon("src/star_wars.jpg").getImage().getScaledInstance(170, 200, Image.SCALE_DEFAULT));
		capa.setIcon(imageIcon);
		boxESQ.add(capa);
		
		detalhes.add(boxESQ);
		//boxMEIO------------------------------
		JPanel boxMEIO = new JPanel();
		boxMEIO.setLayout(new BoxLayout(boxMEIO, BoxLayout.Y_AXIS));
		
		//titulo do filme
		JPanel juntaTITULO = new JPanel();
		juntaTITULO.setLayout(new BoxLayout(juntaTITULO, BoxLayout.Y_AXIS));
		//label titulo
		JLabel titulo = new JLabel("Titulo: ");
		titulo.setAlignmentX(CENTER_ALIGNMENT);
		juntaTITULO.add(titulo);
		//caixa de texto para receber titulo
		JTextArea caixa_titulo = new JTextArea();
		caixa_titulo.setBorder(BorderFactory.criar());
		caixa_titulo.setLineWrap(true);
		caixa_titulo.setWrapStyleWord(true);
		//scroll panel para ajudar na formatação 
		JScrollPane scroll_titulo = new JScrollPane();
		scroll_titulo.setViewportView(caixa_titulo);
		
		juntaTITULO.add(scroll_titulo);
		boxMEIO.add(juntaTITULO);
		
		//sinopse do filme, mesmo raciocinio do título
		JPanel juntaSINOPSE = new JPanel();
		juntaSINOPSE.setLayout(new BoxLayout(juntaSINOPSE, BoxLayout.Y_AXIS));
		JLabel sinopse = new JLabel("Sinopse: ");
		sinopse.setAlignmentX(CENTER_ALIGNMENT);
		juntaSINOPSE.add(sinopse);
		JTextArea caixa_sinopse = new JTextArea();
		caixa_sinopse.setBorder(BorderFactory.criar());
		caixa_sinopse.setLineWrap(true);
		caixa_sinopse.setWrapStyleWord(true);
		
		JScrollPane scroll_sinopse = new JScrollPane();
		scroll_sinopse.setViewportView(caixa_sinopse);

		juntaSINOPSE.add(scroll_sinopse);
		
		boxMEIO.add(juntaSINOPSE);
		//generos
		JPanel panel_generos = new JPanel();
		String[] generos = {"Selecione o Genero", "Ação", "Aventura", "Terror", "Comedia", "SciFi"};
		JComboBox<String> comboBoxGeneros = new JComboBox<String>(generos);
		panel_generos.add(comboBoxGeneros);
		boxMEIO.add(panel_generos);
		//botoes Salvar e Cancelar
		JPanel panel_botoes = new JPanel();
		panel_botoes.setLayout(new BoxLayout(panel_botoes, BoxLayout.X_AXIS));
		JButton botao_salvar = new JButton("Salvar");
		JButton botao_cancelar = new JButton("Cancelar");
		panel_botoes.add(botao_salvar);
		panel_botoes.add(botao_cancelar);
		boxMEIO.add(panel_botoes);
		//Botao salvar será usado no listener posteriormente
		
		detalhes.add(boxMEIO);
		
		//boxDIR-------------------------------------
		JPanel boxDIR = new JPanel();
		JPanel infos = new JPanel();
		infos.setLayout(new BoxLayout(infos, BoxLayout.Y_AXIS));
		//Onde assistir
		JLabel ondeAssistir = new JLabel("Onde Assistir");
		infos.add(ondeAssistir);
		//Criação dos radio buttons do "Onde assistir"
		JRadioButton dummyButton = new JRadioButton();//botao dummy para não dar erro se o usuario não escolher nada
		dummyButton.setSelected(true);
		dummyButton.setActionCommand("Não selecionado");
		JRadioButton buttonNetflix = new JRadioButton("Netflix");
		buttonNetflix.setActionCommand("Netflix");//torna mais facil pegar conteudo para o sysout
		JRadioButton buttonPrime = new JRadioButton("Prime Video");
		buttonPrime.setActionCommand("Prime Video");
		JRadioButton buttonPirate = new JRadioButton("Pirate Bay");
		buttonPirate.setActionCommand("Pirate Bay");
		ButtonGroup grupoOndeAssistir = new ButtonGroup();
		grupoOndeAssistir.add(dummyButton);
		grupoOndeAssistir.add(buttonNetflix);
		grupoOndeAssistir.add(buttonPrime);
		grupoOndeAssistir.add(buttonPirate);
		infos.add(buttonNetflix);
		infos.add(buttonPrime);
		infos.add(buttonPirate);
		//checkbox "Assistido"
		JCheckBox assistido = new JCheckBox("Assistido");
		infos.add(assistido);
		//Star Rater
		StarRater starRater = new StarRater(5);
		infos.add(starRater);
		//Adicionando o Box infos ao Box boxDIR
		boxDIR.add(infos);
		detalhes.add(boxDIR);
		
		//criando a classe filme
		Filme filme = new Filme();
		//Adicionando Listener ao botao_salvar implementado anteriormente
		SalvarListener salvarListener = new SalvarListener(filme, caixa_titulo, caixa_sinopse, 
				comboBoxGeneros, grupoOndeAssistir, assistido,
				starRater);
		botao_salvar.addActionListener(salvarListener);		
		
		//--------------PANEL LISTA------------
		JPanel lista = new JPanel();
		
		//--------------PANEL CREDITOS--------------------
		JPanel creditos = new JPanel();
		creditos.setLayout(new BoxLayout(creditos, BoxLayout.Y_AXIS));
		creditos.add(new JLabel("Desenvolvido por:"));
		creditos.add(new JLabel("Igor Tomazelli Nietmann | RM: 82808"));
		JLabel label_icone = new JLabel(new ImageIcon("src/logofiap.jpg"));
		creditos.add(label_icone);
		
		//--------------------Adição Panels-------------
		abas.add("Detalhes", detalhes);
		abas.add("Lista", lista);
		abas.add("Creditos", creditos);
		this.add(abas);
		
		setSize(500, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		new AppWireframe().init();//chamada função init
	}

}
