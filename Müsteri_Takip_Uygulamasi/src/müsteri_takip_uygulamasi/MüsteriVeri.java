
package müsteri_takip_uygulamasi;


public class MüsteriVeri {
    
    int id;
    String ad;
    String soyad;
    String tel;
    String adres;
    String urun;
    
    MüsteriVeri next;
    MüsteriVeri back;

    public MüsteriVeri(int id, String ad, String soyad, String tel, String adres, String urun) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.tel = tel;
        this.adres = adres;
        this.urun = urun;
        next=null;
        back=null;
    }
    
    
            
    
    
}
