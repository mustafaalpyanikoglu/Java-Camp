package intro;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		String ortaMetin = "İlginizi çekebilir";
		String altMetin = "Vade süresi";
		
		System.out.println(ortaMetin);
		
		int vade = 12;
		
		double dolarDun = 18.10;
		double dolarBugun = 18.10;
		
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if(dolarBugun < dolarDun)
		{
			okYonu = "down.svg";
			System.out.println(okYonu);
		}
		else if(dolarBugun == dolarDun)
		{
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		else
		{
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		
		String[] krediler = {"Hızlı Kredi","Maaşın Halkbanktan","Mutlu Emekli"};
		
		for (String kredi : krediler) {
			System.out.println(kredi);
		}
	}

}
