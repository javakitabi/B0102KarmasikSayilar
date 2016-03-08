package b0102;

/**
 * Bu s�n�f {@link KarmasikSayi} s�n�f�n�n test s�n�f�d�r. 
 * {@link KarmasikSayi} s�n�f�ndan nesneler �retip onlar�n durumlar�n� belirler ve onlardan hizmet al�r.
 * 
 * @author Mustafa �il
 *
 */
public class KarmasikSayiTest {

	/**
	 * <code>main</code> metodda {@link KarmasikSayi} objeleri �retilir, durumlar� belirlenir ve metodlar� �a��r�l�r.
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
		System.out.println("Karma��k say�n�n mutlak de�eri: " + z.mutlakDegerHesapla());
		System.out.println(z.eslenigiBul());
		
		System.out.println();
		
		KarmasikSayi z2 = new KarmasikSayi(-6, 8);
		System.out.println(z2.bilgiVer());
		System.out.println("Karma��k say�n�n mutlak de�eri: " + z2.mutlakDegerHesapla());
		System.out.println(z2.eslenigiBul());
	
	
	}
	
}