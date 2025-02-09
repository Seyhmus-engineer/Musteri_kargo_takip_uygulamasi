
package müsteri_takip_uygulamasi;

import java.util.Scanner;


public class MüsteriList {
    Scanner k=new Scanner(System.in);
    
    MüsteriVeri bas=null;
    MüsteriVeri son=null;
    
    int id;
    String ad;
    String soyad;
    String tel;
    String adres;
    String urun;
    
    void ekle(){
        
        System.out.println("Müsterinin bilgilerini giriniz : ");
        System.out.print("Numarası     : ");id=k.nextInt();
        k.nextLine();
        System.out.print("Ad           : ");ad=k.nextLine();
        System.out.print("Soyad        : ");soyad=k.nextLine();
        System.out.print("Telefon      : ");tel=k.nextLine();
        System.out.print("Adres        : ");adres=k.nextLine();
        System.out.print("Urun         : ");urun=k.nextLine();
        
        MüsteriVeri eleman= new MüsteriVeri(id,ad,soyad,tel,adres,urun);
        
        
        if (bas==null) {
            bas=eleman;
            son=eleman;
            System.out.println("Liste oluşturuldu,ilk müşteri kayıt edildi ");
        }
        else{
            eleman.next=bas;
            bas.back=eleman;
            bas=eleman;
            System.out.println(id+" numarali müsteri kayit edildi ");
        }
    }
    
    
    void sil(){
        
        boolean sonuc=false;
        
        if (bas==null) {
            System.out.println("Liste bos !!!");
        }
        else{
            System.out.print("Silinecek müsteri numarasi     : ");id=k.nextInt();
            k.nextLine();
            
            if (bas.next==null && bas.id==id) {
                bas=null;
                son=null;
                System.out.println(id+ " numaralı müsteri silindi");
                sonuc=true;
            }
            else if (bas.next!=null && bas.id==id) {
                bas=bas.next;
                bas.back=null;
                System.out.println(id+ " numaralı müsteri silindi");
                sonuc=true;
            }
            else if (son.id==id) {
                son=son.back;
                son.next=null;
                System.out.println(id+ " numaralı müsteri silindi");
                sonuc=true;
            }
            else{
             MüsteriVeri temp=bas;
             while(temp!=null){
                 if (temp.id==id) {
                     temp.next.back=temp.back;
                     temp.back.next=temp.next;
                     System.out.println(id+ " numaralı müsteri silindi");
                     sonuc=true;
                     break;
                 }
                 temp=temp.next;
             }
            }
        }
        
        if (!sonuc) {
            System.out.println(id+" numarali müsteri listede yok  ");
        }
 
    }
    
    void guncelle(){
        
        boolean sonuc=false;
        
        if (bas==null) {
            System.out.println("Liste bos !!!");
        }
        else{
            System.out.print("Guncellenecek müsteri numarasi     : ");id=k.nextInt();
            k.nextLine();
            
            
            
             MüsteriVeri temp=bas;
             while(temp!=null){
                 if (temp.id==id) {
                     System.out.println(id+" numarali müsteri bilgileri: ");
                     System.out.println("ad         :"+temp.ad);
                     System.out.println("soyad      :"+temp.soyad);
                     System.out.println("telefon    :"+temp.tel);
                     System.out.println("adres      :"+temp.adres);
                     System.out.println("urun       :"+temp.urun);
                     
                     System.out.print("Urun bilgisini guncelleyiniz: ");
                     temp.urun=k.nextLine();
                     System.out.println("Urun bilgisi guncellendi");
                     
                     sonuc=true;
                     break;
                 }
                 temp=temp.next;
             }
            
        }
        
        if (!sonuc) {
            System.out.println(id+" numarali müsteri listede yok  ");
        }
 
    }
    
    void müsteriAra(){
        
        boolean sonuc=false;
        
        if (bas==null) {
            System.out.println("Liste bos !!!");
        }
        else{
            System.out.print("Aranacak müsteri numarasi     : ");id=k.nextInt();
            k.nextLine();
            
            
            
             MüsteriVeri temp=bas;
             while(temp!=null){
                 if (temp.id==id) {
                     System.out.println(id+" numarali müsteri bilgileri: ");
                     System.out.println("ad         :"+temp.ad);
                     System.out.println("soyad      :"+temp.soyad);
                     System.out.println("telefon    :"+temp.tel);
                     System.out.println("adres      :"+temp.adres);
                     System.out.println("urun       :"+temp.urun);
                     
                     sonuc=true;
                     break;
                 }
                 temp=temp.next;
             }
            
        }
        
        if (!sonuc) {
            System.out.println(id+" numarali müsteri listede yok  ");
        }
 
    }
     
    void yazdır(){
        
        
        if (bas==null) {
            System.out.println("Liste bos !!!");
        }
        else{
            System.out.println();
            System.out.println("Numara\t   Ad \t soyad \t Telefon\t Adres\t Urun Adı \n");
            
             MüsteriVeri temp=bas;
             while(temp!=null){
                 
                 System.out.println(temp.id+"\t"+temp.ad+"\t"+temp.soyad+"\t"+temp.tel+"\t"+temp.adres+"\t"+temp.urun);
                 System.out.println();
                 temp=temp.next;
             }
            
        }
        
 
    } 
     
}
