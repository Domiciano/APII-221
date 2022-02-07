package exception;

public class NegativeMoneyException extends Exception{
	
	public NegativeMoneyException(double cantidad) {
		super("Intentó usar una cantidad negativa de dinero: "+cantidad);
	}

}
