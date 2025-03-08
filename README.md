# Müşteri Kargo Takip Uygulaması

Bu proje, müşterilerin kargo takip numaralarını kullanarak gönderi durumlarını sorgulayabileceği bir Java uygulamasıdır. Uygulama, kullanıcı dostu bir arayüz sunarak kolay kargo takibi sağlar.

## Özellikler
- **Kargo ekleme:** Kullanıcıdan kargo bilgilerini alarak sisteme kaydeder.
- **Kargo durumu sorgulama:** Takip numarası ile kargonun güncel durumunu görüntüler.
- **Kargo güncelleme:** Kargo bilgilerinde değişiklik yapma imkânı sunar.
- **Veritabanı entegrasyonu:** Kargo bilgilerini bir veritabanında saklar ve günceller.

## Kullanım
Program, ana menü üzerinden kullanıcıya şu seçenekleri sunar:

```
1- Yeni kargo ekle
2- Kargo durumu sorgula
3- Kargo bilgilerini güncelle
4- Sistemdeki tüm kargoları listele
0- Çıkış
```

## Çalıştırma Talimatları
1. Java'nın sisteminizde kurulu olduğundan emin olun.
2. Proje dosyalarını bir Java projesi olarak açın.
3. Ana sınıf olarak `Main` dosyasını çalıştırın.
4. Terminal veya konsoldan menü seçeneklerini kullanarak programı yönetin.

## Gereksinimler
- Java 8 veya üstü
- Derleyici veya IDE (Eclipse, IntelliJ IDEA, NetBeans vs.)
- Veritabanı bağlantısı için SQLite veya MySQL

## Örnek Kullanım
```
Yeni kargo ekleme:
Kargo takip numarası: 123456
Gönderen: Ahmet Yılmaz
Alıcı: Mehmet Demir
Durum: Yolda
Kargo başarıyla sisteme kaydedildi.

Kargo sorgulama:
Takip numarası: 123456
Durum: Yolda
Tahmini Teslimat: 2 gün
```

## Lisans
Bu proje açık kaynaklıdır ve dilediğiniz gibi kullanılabilir.


