import javax.swing.JOptionPane;

public class todasPOO {
	
	
	String operacao;
	
	 public void solicitarResposta()
	 {

		operacao = JOptionPane.showInputDialog
				(null,"Escolha qual opera��o voc� quer para esse problema:"
						+ "\n Soma: +"
						+ "\n Subtra��o: -"
						+ "\n Divis�o: /"
						+ "\n Multiplica��o: x");
	 }
	 
	 
}
	