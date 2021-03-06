import java.math.BigDecimal;

public class Conta {
	
	private String nome;
	private BigDecimal saldo;
	
	
	public Conta(String nome, BigDecimal saldo) {
		super();
		this.nome = nome;
		
		if(saldo.compareTo(BigDecimal.valueOf(0.0)) == 1) {
			
			this.saldo = saldo;
			
		}else {
			
			this.saldo = BigDecimal.valueOf(0.0);
			
		}
		
	}
	
	public void deposita(BigDecimal quantidade) {
		
		if(quantidade.compareTo(BigDecimal.valueOf(0.0)) == 1) {
			
			setSaldo(getSaldo().add(quantidade));
			
		}
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	
	
	
	
}
