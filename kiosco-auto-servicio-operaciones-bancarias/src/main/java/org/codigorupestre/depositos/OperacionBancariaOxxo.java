package org.codigorupestre.depositos;

import java.math.BigDecimal;
import java.util.logging.Logger;

public class OperacionBancariaOxxo {
	
	private static final Logger LOG = Logger.getLogger(OperacionBancariaOxxo.class.getName());
	
	private String numeroTarjeta;
	
	private BigDecimal monto;
	
	public OperacionBancariaOxxo() {
		
	}
	
	public OperacionBancariaOxxo(String numeroTarjeta, BigDecimal monto) {
	     this.numeroTarjeta = numeroTarjeta;
	     this.monto = monto;
	}
	
	
	public void depositar() {
	 LOG.info("Se realizo DEPOSITO de forma exitosa");
	 LOG.info("Numero de tarjeta: " + this.numeroTarjeta);
	 LOG.info("Monto: " + this.monto);
	}
	
	
	public void retirar() {
		LOG.info("Se realizo RETIRO de forma exitosa");
		LOG.info("Numero de tarjeta: " + this.numeroTarjeta);
		LOG.info("Monto: " + this.monto);
		
	}
	
	
	

}
