package ig;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Funcionario extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfCargo;
	private JTextField tfSalario;
	private JTextField tfResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Funcionario frame = new Funcionario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Funcionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 11, 83, 20);
		contentPane.add(lblNewLabel);
		
		JLabel abab = new JLabel("Cargo:");
		abab.setFont(new Font("Tahoma", Font.PLAIN, 15));
		abab.setBounds(10, 42, 83, 20);
		contentPane.add(abab);
		
		JLabel oaoa = new JLabel("Salario:");
		oaoa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		oaoa.setBounds(10, 73, 83, 20);
		contentPane.add(oaoa);
		
		tfNome = new JTextField();
		tfNome.setBounds(65, 13, 327, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfCargo = new JTextField();
		tfCargo.setColumns(10);
		tfCargo.setBounds(65, 42, 327, 20);
		contentPane.add(tfCargo);
		
		tfSalario = new JTextField();
		tfSalario.setColumns(10);
		tfSalario.setBounds(65, 73, 327, 20);
		contentPane.add(tfSalario);
		
		JButton tfAumentar = new JButton("AumentarSalario");
		tfAumentar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String nome=tfNome.getText();
				String cargo=tfCargo.getText();
				double sal;
				double salario = Double.parseDouble(tfSalario.getText());
				if(salario <= 1500) {
					sal = salario * 1.3;
				}else if(salario <=2000) {
				sal = salario * 1.2; 
				}else {
					sal = salario * 1.1;
				}
				tfResultado.setText(nome+" do cargo de "+cargo+" recebeu um aumento para "+sal);
				
			}
		});
		tfAumentar.setBounds(10, 104, 176, 23);
		contentPane.add(tfAumentar);
		
		JButton tfDiminuir = new JButton("Diminuir Salario");
		tfDiminuir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome=tfNome.getText();
				String cargo=tfCargo.getText();
				double salario = Double.parseDouble(tfSalario.getText());
				double sal;
				
				if (salario <= 1500) {
					sal= salario*0.9;
				}else if(salario<=2000) {
					sal = salario * 0.8;
				}else {sal = salario * 0.7;}
				tfResultado.setText(nome+" do Cargo de "+cargo+" Novo salario: R$"+sal);
				
				
				
				
				
				
				
				
				
				
			
			}	});
		
		tfDiminuir.setBounds(216, 104, 176, 23);
		contentPane.add(tfDiminuir);
		
		tfResultado = new JTextField();
		tfResultado.setBounds(7, 138, 385, 112);
		contentPane.add(tfResultado);
		tfResultado.setColumns(10);
	}

}
