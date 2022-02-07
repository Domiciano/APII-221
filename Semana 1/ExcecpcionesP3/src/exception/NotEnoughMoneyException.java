package exception;

public class NotEnoughMoneyException extends Exception{

	public NotEnoughMoneyException(double saldo, double gasto) {
		super("Falta dinero. Utedes tiene "+saldo+" e intentó gastar "+gasto);
	}
	
}
