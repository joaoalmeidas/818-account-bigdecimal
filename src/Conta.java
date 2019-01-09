import java.math.BigDecimal;

public class Conta {
	
	private String nome;
	private BigDecimal saldo;
	
	
	public Conta(String nome, BigDecimal saldo) {
		super();
		this.nome = nome;
		if(saldo.doubleValue() > 0.0) {
			
			this.saldo = saldo;
			
		}
		
	}
	
	
	
	
}
