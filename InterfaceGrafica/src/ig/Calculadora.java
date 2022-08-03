package ig;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JTextField tfResultado1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Numero 1:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 16, 113, 14);
		contentPane.add(lblNewLabel);
		
		tfNum1 = new JTextField();
		tfNum1.setBounds(121, 15, 122, 20);
		contentPane.add(tfNum1);
		tfNum1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Numero 2:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 41, 113, 14);
		contentPane.add(lblNewLabel_1);
		
		tfNum2 = new JTextField();
		tfNum2.setColumns(10);
		tfNum2.setBounds(121, 40, 122, 20);
		contentPane.add(tfNum2);
		
		JLabel tfResultado = new JLabel("Resultado:");
		tfResultado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfResultado.setBounds(10, 112, 113, 14);
		contentPane.add(tfResultado);
		
		tfResultado1 = new JTextField();
		tfResultado1.setColumns(10);
		tfResultado1.setBounds(121, 111, 122, 20);
		contentPane.add(tfResultado1);
		
		JButton tfSoma = new JButton("Soma");
		tfSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num1;
				double num2;
				double resultado;
				
				num1=Double.parseDouble(tfNum1.getText());
				num2=Double.parseDouble(tfNum2.getText());
				
				resultado = num1 + num2;
				
				tfResultado1.setText(""+resultado);
				
				
				
				
				
			}
		});
		tfSoma.setBounds(266, 14, 93, 23);
		contentPane.add(tfSoma);
		
		JButton tfSubtracao = new JButton("Subtra\u00E7\u00E3o");
		tfSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1=Double.parseDouble(tfNum1.getText());
				double num2=Double.parseDouble(tfNum2.getText());
				
				double resultado = num1 - num2;
				tfResultado1.setText(""+resultado);
			}
		});
		tfSubtracao.setBounds(266, 39, 93, 23);
		contentPane.add(tfSubtracao);
		
		JButton tfMultiplicação = new JButton("Multiplica\u00E7\u00E3o");
		tfMultiplicação.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1=Double.parseDouble(tfNum1.getText());
				double num2=Double.parseDouble(tfNum2.getText());
				
				double resultado = num1 * num2;
				tfResultado1.setText(""+resultado);
			}});
		tfMultiplicação.setBounds(266, 65, 93, 23);
		contentPane.add(tfMultiplicação);
			
		
		
		
		
		
		
		
		
		
		
		}}
