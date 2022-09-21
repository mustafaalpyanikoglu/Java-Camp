package intro;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<CreditManager> credits = new ArrayList<CreditManager>();
		credits.add(new mortgageManager());
		credits.add(new vehicleManager());
		
		for (CreditManager creditManager : credits) {
			creditManager.calculate();
		}
	}
}

