package ig;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Livraria extends JFrame {

	private JPanel contentPane;
	private JTextField tfLivro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Livraria frame = new Livraria();
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
	public Livraria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox tfValorTrinta = new JCheckBox("R$ 30,00");
		tfValorTrinta.setBounds(331, 102, 97, 23);
		contentPane.add(tfValorTrinta);
		
		JCheckBox tfValorDez = new JCheckBox("R$ 10,00");
		tfValorDez.setBounds(331, 50, 97, 23);
		contentPane.add(tfValorDez);
		
		JCheckBox tfValorVInte = new JCheckBox("R$ 20,00");
		tfValorVInte.setBounds(331, 76, 97, 23);
		contentPane.add(tfValorVInte);
		
		tfLivro = new JTextField();
		tfLivro.setHorizontalAlignment(SwingConstants.CENTER);
		tfLivro.setBounds(20, 38, 149, 20);
		contentPane.add(tfLivro);
		tfLivro.setColumns(10);
		
		JRadioButton rb1 = new JRadioButton("");
		rb1.setBounds(10, 102, 109, 23);
		contentPane.add(rb1);
		
		JRadioButton rb2 = new JRadioButton("New radio button");
		rb2.setBounds(10, 128, 109, 23);
		contentPane.add(rb2);
		
		JLabel lblNewLabel = new JLabel("Quantidade de livros");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(10, 11, 183, 23);
		contentPane.add(lblNewLabel);
		
		JLabel tfPreco = new JLabel("Pre\u00E7os");
		tfPreco.setFont(new Font("Tahoma", Font.PLAIN, 21));
		tfPreco.setHorizontalAlignment(SwingConstants.CENTER);
		tfPreco.setBounds(318, 19, 93, 24);
		contentPane.add(tfPreco);
		
		JLabel lblNewLabel_1 = new JLabel("Embrulhar para presente?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 78, 195, 14);
		contentPane.add(lblNewLabel_1);
	}
}
