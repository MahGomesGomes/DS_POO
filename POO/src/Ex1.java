import javax.swing.JOptionPane;

public class Ex1 {
	
	double saldo= 1500;
	 double deposito;
	 double saque;

public void exibir() {

	JOptionPane.showMessageDialog(null,"o seu seu saldo ir� ser: "+saldo);
	
	
}

public   double Deposito() {
	 
	deposito=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de deposito:"));
	deposito=deposito+saldo;
	
	
	 
	 return deposito;
	 
	 
	
}


public void sacar(){
	
	saque=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o quanto voc� quer sacar :"));
	
	if(saque>saldo) {
		JOptionPane.showMessageDialog(null,"vc n�o tem esse tanto de dinheiro.");
	}else {
		JOptionPane.showMessageDialog(null,"o seu seu saldo ir� ser: "+(saldo-saque));
	}
}
public void sair() {
	JOptionPane.showMessageDialog(null,"adios");
}
}
