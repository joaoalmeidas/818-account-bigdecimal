import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class ContaTeste {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		Conta conta1 = new Conta("João", BigDecimal.valueOf(50.00));
		Conta conta2 = new Conta("Guilherme", BigDecimal.valueOf(-8.50));
		
		System.out.printf("%s saldo: %s \n", conta1.getNome(), NumberFormat.getCurrencyInstance().format(conta1.getSaldo()));
		System.out.printf("%s saldo: %s \n", conta2.getNome(), NumberFormat.getCurrencyInstance().format(conta2.getSaldo()));
		
		System.out.printf("Insira uma quantia para depositar na conta1.\n");
		BigDecimal quantia = input.nextBigDecimal();
		conta1.deposita(quantia);
		System.out.printf("\n\nDepositando %s na conta1...\n\n", NumberFormat.getCurrencyInstance().format(quantia));
		
		System.out.printf("%s saldo: %s \n", conta1.getNome(), NumberFormat.getCurrencyInstance().format(conta1.getSaldo()));
		System.out.printf("%s saldo: %s \n", conta2.getNome(), NumberFormat.getCurrencyInstance().format(conta2.getSaldo()));
		
		System.out.printf("Insira uma quantia para depositar na conta2.\n");
		quantia = input.nextBigDecimal();
		conta2.deposita(quantia);
		System.out.printf("\n\nDepositando %s na conta2...\n\n", NumberFormat.getCurrencyInstance().format(quantia));
		
		System.out.printf("%s saldo: %s \n", conta1.getNome(), NumberFormat.getCurrencyInstance().format(conta1.getSaldo()));
		System.out.printf("%s saldo: %s \n", conta2.getNome(), NumberFormat.getCurrencyInstance().format(conta2.getSaldo()));
		
		
	}

}
