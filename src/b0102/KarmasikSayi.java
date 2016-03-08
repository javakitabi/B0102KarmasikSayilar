package b0102;

/**
 * Bu s�n�f, karma��k say� soyutlamas�n�n (abstraction) nas�l yap�laca��n� g�sterir. 
 * 
 * {@link KarmasikSayi} s�n�f� <code>gercel, operator ve sanal</code> olmak �zere �� adet de�i�kene sahip olup, 
 * belirli hizmetler sunmaktad�r. 
 * 
 * @author Mustafa �il
 *
 */
public class KarmasikSayi {

	int gercel;
	private String operator;
	int sanal;
		
	/**
	 * Parametre almayan yap�land�r�c�.
	 */
	public KarmasikSayi() {
			
	}
	
	/**
	 * Parametre olarak ge�ilen ger�el ve sanal b�l�me g�re karma��k say� �retir.
	 * 
	 * @param gercel
	 * 			Karma��k say�n�n ger�el b�l�m�n� belirler.
	 * @param sanal
	 *			Karma��k say�n�n sanal b�l�m�n� belirler.
	 */			
	public KarmasikSayi(int gercel, int sanal){
		this.gercel=gercel;
		this.sanal = sanal;		
	}
	
	/**
	 * Sanal b�l�m�n de�erine g�re operat�r� belirler ve karma��k say�y� ekrana yazar.
	 * @return
	 * 			Karma��k say� hakk�nda bilgi verir.
	 */
	public String bilgiVer(){
		
		if(sanal < 0)
		return "Karma��k Say�y� " + gercel + sanal + "i" +" olarak belirlediniz.";
		else
			operator="+";
		return "Karma��k Say�y� " + gercel + operator + sanal + "i" +" olarak belirlediniz.";
	}
	
	/**
	 * Karma��k say�n�n mutlak de�erini hesaplar.
	 * @return
	 * 			Karma��k say�n�n mutlak de�erini geri verir.
	 */
	
	public double mutlakDegerHesapla(){
		
			return Math.sqrt(Math.pow(gercel, 2) + Math.pow(sanal, 2));
	}
	
	/**
	 * Karma��k say�n�n e�leni�ini bulur.
	 * @return
	 * 		Karma��k say�n�n e�leni�ini bularak geri d�nd�r�r.
	 */
	public String eslenigiBul(){
		
		if (sanal > 0){
		operator = "-";
		return "Karma��k say�n�n e�leni�i: " + gercel + operator + sanal + "i" ;
		}
		else{
			operator = "+";
			return "Karma��k say�n�n e�leni�i: "  +  gercel +  operator + -1 *sanal + "i" ;  
		} 
		
		
	}

	
}
