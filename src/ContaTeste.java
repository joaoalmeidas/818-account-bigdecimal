import java.math.BigDecimal;
import java.text.DecimalFormat;

public class ContaTeste {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#,###.00");
	
		Conta conta1 = new Conta("João", BigDecimal.valueOf(50.00));
		Conta conta2 = new Conta("Guilherme", BigDecimal.valueOf(-8.50));
		
		System.out.printf("%s saldo: %s \n", conta1.getNome(), df.format(conta1.getSaldo()));
		System.out.printf("%s saldo: %s \n", conta2.getNome(), df.format(conta2.getSaldo()));

	}

}
