package intro;

public class diziler {
	public static void main(String[] args) {
		
		String[] sehirler1 = new String[] {"Ankara","İstanbul","İzmir"};
		
		for(String sehir:sehirler1)
		{
			System.out.println(sehir);
		}
		
		for (int i = 0; i < sehirler1.length; i++) {
			System.out.println(sehirler1[i]);
		}
		
		String[] sehirler2 = new String[] {"Antep","Diyarbakır","Urfa"};

		sehirler1 = sehirler2;
		sehirler1[0] = "Adana";
		
		System.out.println(sehirler2[0]);
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 30;
		System.out.println(sayi1);
		
	}
}
