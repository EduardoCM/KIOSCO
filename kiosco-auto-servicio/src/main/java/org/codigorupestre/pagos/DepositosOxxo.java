package org.codigorupestre.pagos;

import java.math.BigDecimal;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import org.codigorupestre.pagos.autoservicio.OperacionesBancariasAutoServicio;

public class DepositosOxxo {
	
	public static void main(String[] args) {
		
		OperacionesBancariasAutoServicio operacionesBancarias;
		
		String[] options = {"deposito", "retiro"};
		
		ImageIcon icon = new ImageIcon("src/main/resources/images/tarjeta-saldazo.png");
		
		String operacion = (String)JOptionPane.showInputDialog(null, "Que operacion va a realizar?", "Operaciones bancarias", JOptionPane.QUESTION_MESSAGE, icon, options, null);
		
		String numeroTarjeta = JOptionPane.showInputDialog("Ingresa numero de tarjeta");
		BigDecimal monto = new BigDecimal(JOptionPane.showInputDialog("Ingresa el monto"));
		
		System.out.println("Operacion: " + operacion);
   		
		switch(operacion) {
	
		case "deposito":
			operacionesBancarias = new OperacionesBancariasAutoServicio();
			operacionesBancarias.depositar(numeroTarjeta, monto);
			break;
	     
		case "retiro":
			operacionesBancarias = new OperacionesBancariasAutoServicio();
			operacionesBancarias.retirar(numeroTarjeta, monto);
			break;	
		}
    
	}

}
