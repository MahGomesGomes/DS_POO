import javax.swing.JOptionPane;

public class todasPOO {
	
	
	String operacao;
	
	 public void solicitarResposta()
	 {

		operacao = JOptionPane.showInputDialog
				(null,"Escolha qual operação você quer para esse problema:"
						+ "\n Soma: +"
						+ "\n Subtração: -"
						+ "\n Divisão: /"
						+ "\n Multiplicação: x");
	 }
	 
	 
}
	