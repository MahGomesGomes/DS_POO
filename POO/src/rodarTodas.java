import javax.swing.JOptionPane;

public class rodarTodas {

	public static void main(String[] args) {
	
                  todasPOO bixo = new todasPOO();
                  char i=bixo.solicitarResposta();
                  
                  while(i!="Sair") {
	                  if(i=="+"){
	                	  somaPOO soma = new somaPOO();
	                      soma.solicitarNumeros();
	                      soma.somar();
	                      soma.exibir();
	                  } else if (i=="-"){
	                	  subtracaoPOO sub = new subtracaoPOO();
	                      sub.solicitarNumeros();
	                      sub.subtrair();
	                      sub.exibir();
	                  }else if (i=="*"){
	                	  multiplicacaoPOO mult = new multiplicacaoPOO();
	                      mult.solicitarNumeros();
	                      mult.multiplicar();
	                      mult.exibir();
	                  }else if(i=="/"){
	                	  divisaoPOO div = new divisaoPOO();
	                      div.solicitarNumeros();
	                      div.dividir();
	                      div.exibir();
	                  } else{
	                	  JOptionPane.showMessageDialog(null,"Valor inválido, digite outro");
	                  }
	                  i=bixo.solicitarResposta();
                  }
	}

}