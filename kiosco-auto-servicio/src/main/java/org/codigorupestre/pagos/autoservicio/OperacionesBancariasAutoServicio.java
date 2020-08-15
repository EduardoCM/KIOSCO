package org.codigorupestre.pagos.autoservicio;

import java.math.BigDecimal;

import org.codigorupestre.depositos.OperacionBancariaOxxo;


/**
 * 
 * @author eduardocastillo
 *
 */
public class OperacionesBancariasAutoServicio {


	OperacionBancariaOxxo operacionOxxo;
	
	public void depositar(String numeroTarjeta, BigDecimal monto) {
            operacionOxxo = new OperacionBancariaOxxo(numeroTarjeta, monto);
            operacionOxxo.depositar();
	}
	
	
	public void retirar(String numeroTarjeta, BigDecimal monto) {
		operacionOxxo = new OperacionBancariaOxxo(numeroTarjeta, monto);
		operacionOxxo.retirar();
	
	}

}
