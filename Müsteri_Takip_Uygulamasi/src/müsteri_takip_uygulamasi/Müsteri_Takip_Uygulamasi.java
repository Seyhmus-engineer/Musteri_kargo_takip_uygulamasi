
package müsteri_takip_uygulamasi;

import java.util.Scanner;


public class Müsteri_Takip_Uygulamasi {

    
    public static void main(String[] args) {
        
        Scanner k=new Scanner(System.in);
        MüsteriList liste=new MüsteriList();
        
        int secim=-1;
        while(secim!=0){
            
            System.out.println("1- ekle");
            System.out.println("2- sil");
            System.out.println("3- guncelle");
            System.out.println("4- müsteri ara");
            System.out.println("5- yazdir");
            System.out.println("0- cikis");
            
            System.out.print("seciminiz : ");
            secim=k.nextInt();
            k.nextLine();
            
            switch(secim){
                case 1: liste.ekle();break;
                case 2: liste.sil();break;
                case 3: liste.guncelle();break;
                case 4: liste.müsteriAra();break;
                case 5: liste.yazdır();break;
                case 0: System.out.println("Cikis yaptiniz "); break;
                default: System.out.println("Hatali secim yaptiniz[0 5] "); break;
            }
        }
       
    }
    
}
