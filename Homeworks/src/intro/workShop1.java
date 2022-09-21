package intro;

public class workShop1 {
public static void main(String[] args) {
		
		int[] sayilar = new int[] {1,2,3,4,5,6,7,8,9,10};
		int aranacak = 16;
		
		boolean varMi = sayiBul(aranacak,sayilar);
		
		mesajVer(varMi,aranacak);
		
		
		
	}
	public static boolean sayiBul(int aranacak, int[] sayilar)
	{
		boolean varMi = false;
		for(int sayi:sayilar)
		{
			if(sayi == aranacak)
			{
				varMi = true;
				break;
			}
		}
		return varMi;
	}
	public static void mesajVer(boolean varMi,int aranacak)
	{
		if(varMi)
		{
			System.out.println("Sayı mevcuttur: " + aranacak);
		}
		else
		{
			System.out.println("Sayı mevcut değildir: "+ aranacak);
		}
	}
}
