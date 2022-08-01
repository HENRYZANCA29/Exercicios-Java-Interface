package model;



import javax.swing.JOptionPane;

public class Loja {

	public static void main(String[] args) {
		
		String nome, autor;
		double preco;
		int op,faixas,minutos;
		
		for(;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog("___CADASTRO DOS PRODUTOS___\n"+
		"--> 1-CD \n"+"-->2-DVD \n"+"-->3 Livro \n"+"-->4 Finalizar"));
		
		
		if(op==1) {
			nome=JOptionPane.showInputDialog("nome do cd: ");
			preco = Double.parseDouble("Preço do cd: ");
			faixas = Integer.parseInt("Faixas do cd: ");
			
			CD cd = new CD(nome, preco, faixas);
			cd.Imprime();
			
		}else if(op==2) {
			nome = JOptionPane.showInputDialog("Nome do filme: ");
					preco=Double.parseDouble(JOptionPane.showInputDialog("Preço do filme: "));
					minutos=Integer.parseInt(JOptionPane.showInputDialog("Minutos do filme: "));
			DVD dvd= new DVD(nome, preco, minutos);
			dvd.Imprime();
		}else if(op==3) {
			
			nome=JOptionPane.showInputDialog("Nome do Livro: ");
			preco=Double.parseDouble(JOptionPane.showInputDialog("Preco do Livro: "));
			autor=JOptionPane.showInputDialog("Nome do autor: ");
			Livro livro = new Livro(nome, preco, autor);
			livro.Imprime();
			
			
		}else if(op==4) {
			JOptionPane.showMessageDialog(null, "FINALIZANDO...");
			break;
		}else {
			JOptionPane.showMessageDialog(null, "OPÇÃO INVALIDA...");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
