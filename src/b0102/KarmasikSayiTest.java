package b0102;

/**
 * Bu sýnýf {@link KarmasikSayi} sýnýfýnýn test sýnýfýdýr. 
 * {@link KarmasikSayi} sýnýfýndan nesneler üretip onlarýn durumlarýný belirler ve onlardan hizmet alýr.
 * 
 * @author Mustafa Çil
 *
 */
public class KarmasikSayiTest {

	/**
	 * <code>main</code> metodda {@link KarmasikSayi} objeleri üretilir, durumlarý belirlenir ve metodlarý çaðýrýlýr.
     *   
     * @see KarmasikSayi
     * @param args[] String dizisi.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		KarmasikSayi z = new KarmasikSayi();
		z.gercel = 3;
		z.sanal = 4;
		System.out.println(z.bilgiVer());
		System.out.println("Karmaþýk sayýnýn mutlak deðeri: " + z.mutlakDegerHesapla());
		System.out.println(z.eslenigiBul());
		
		System.out.println();
		
		KarmasikSayi z2 = new KarmasikSayi(-6, 8);
		System.out.println(z2.bilgiVer());
		System.out.println("Karmaþýk sayýnýn mutlak deðeri: " + z2.mutlakDegerHesapla());
		System.out.println(z2.eslenigiBul());
	
	
	}
	
}