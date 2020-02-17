import javax.swing.JOptionPane;

public class subtracaoPOO {
	
    double numero1,numero2;
	double resultado;
	
	 public void solicitarNumeros()
	 {
		 
		numero1 = Double.parseDouble(JOptionPane.showInputDialog
				("Digite o 1 numero")) ;
		
		numero2 = Double.parseDouble(JOptionPane.showInputDialog
				(null,"Digite o 2 numero")); 
	 }
	
	 public double subtrair()
	 {
		 
		 resultado = numero1-numero2;
		 
		 return resultado;	 
	 }
	 
	 public void exibir() {
		 
		 JOptionPane.showMessageDialog(null,"O resultado da subtração é" +
resultado);
	 }
	

}