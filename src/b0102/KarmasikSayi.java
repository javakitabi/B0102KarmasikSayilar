package b0102;

/**
 * Bu sýnýf, karmaþýk sayý soyutlamasýnýn (abstraction) nasýl yapýlacaðýný gösterir. 
 * 
 * {@link KarmasikSayi} sýnýfý <code>gercel, operator ve sanal</code> olmak üzere üç adet deðiþkene sahip olup, 
 * belirli hizmetler sunmaktadýr. 
 * 
 * @author Mustafa Çil
 *
 */
public class KarmasikSayi {

	int gercel;
	private String operator;
	int sanal;
		
	/**
	 * Parametre almayan yapýlandýrýcý.
	 */
	public KarmasikSayi() {
			
	}
	
	/**
	 * Parametre olarak geçilen gerçel ve sanal bölüme göre karmaþýk sayý üretir.
	 * 
	 * @param gercel
	 * 			Karmaþýk sayýnýn gerçel bölümünü belirler.
	 * @param sanal
	 *			Karmaþýk sayýnýn sanal bölümünü belirler.
	 */			
	public KarmasikSayi(int gercel, int sanal){
		this.gercel=gercel;
		this.sanal = sanal;		
	}
	
	/**
	 * Sanal bölümün deðerine göre operatörü belirler ve karmaþýk sayýyý ekrana yazar.
	 * @return
	 * 			Karmaþýk sayý hakkýnda bilgi verir.
	 */
	public String bilgiVer(){
		
		if(sanal < 0)
		return "Karmaþýk Sayýyý " + gercel + sanal + "i" +" olarak belirlediniz.";
		else
			operator="+";
		return "Karmaþýk Sayýyý " + gercel + operator + sanal + "i" +" olarak belirlediniz.";
	}
	
	/**
	 * Karmaþýk sayýnýn mutlak deðerini hesaplar.
	 * @return
	 * 			Karmaþýk sayýnýn mutlak deðerini geri verir.
	 */
	
	public double mutlakDegerHesapla(){
		
			return Math.sqrt(Math.pow(gercel, 2) + Math.pow(sanal, 2));
	}
	
	/**
	 * Karmaþýk sayýnýn eþleniðini bulur.
	 * @return
	 * 		Karmaþýk sayýnýn eþleniðini bularak geri döndürür.
	 */
	public String eslenigiBul(){
		
		if (sanal > 0){
		operator = "-";
		return "Karmaþýk sayýnýn eþleniði: " + gercel + operator + sanal + "i" ;
		}
		else{
			operator = "+";
			return "Karmaþýk sayýnýn eþleniði: "  +  gercel +  operator + -1 *sanal + "i" ;  
		} 
		
		
	}

	
}
