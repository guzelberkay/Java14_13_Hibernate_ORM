# ORM NEDIR?
Object Relational Mapping(Obje İlişli Eşleştirmesi)
OOP diller ile veritabanı arasındaki farklı yapıları arasındaki farklı yapıları
eşleştirmek için kullanılır.

ORM ile veritabanındaki tablolar ile projelerinizdeki sınıflar eşleştirili
Böylece veri tabanı ilişkilerimizi nesne odaklı bir şekilde yapabileceksiniz.

 ORM tabanı kullansak da yine veri tabanı işlemleri için DRIVER'a ihtiyacımız olacak.
 
Nesneler aracılığı ile veri tabanında;
* Ekleme
* Silme
* Güncelleme
* Listeleme
* İlişkileri
    * One to one
    * One to many
    * Many to one
    * Many to many
* PK, Sequence gibi tüm column özelliklerini belirleyeceksiniz.

ORM aracının yapamadığı en önemli şey : Veri tabanı oluşturmaz
PostgreSQL DB oluşturduktan sonra; ORM aracı ile DB ye bağlanabiliriz.

Avantajları:
* Yazılım geliştirme sürecini kısaltır.
* VT sorgularınızın detaylarıyla uğraşmazsınız

DEZAVANTAJLARI:
* Öğrenme evresi biraz zor.
* JDBC' ye göre biraz daha yavaş.
* Arka planı çok karışık.

#JPA: Java Persistance API -> Jakarta Persistence API (List)
Bir çeşit standart belirleme çatısı.

# ORM ARAÇLARI (ArrayList)
* Hibernate(Java için en popüler ORM aracı, JPA toolu)
* OpenJPA

| JDBC  | HIBERNATE |
|----------------------|--------------------------|
 | Low-Lvel SQL kodları kullanılır.| Arka planda JDBC kullanır ve sizi o katmandan
soyurlar.|
|Nesne ile taplo arasındaki ilişkileri MANUEL yaparız. | Otomatik gerçekleşecek.|
|SQL|SQL + HQL + JPQL|
| Veritabanına (PostgreSQL) direkt bağımlısınızdır.| Veritabanına bağlı kalamazsınız.|
|Cacheleme Yok.| Cach yapısı var.>
|Kodlar SQL ile karmaşıklaşabilir.| Çok daha basit şekilde sorgular oluşturulur.|

# ORM ARACI OLARAK HIBERNATE
Sen bana gerekli bilgileri ver. (IP, Port, DBName, Username, Password)
* Bağlantıyı ben kurarım.
* *Bütün temel işleri yapacak hazır methodları kullanabilirsin.

Hibernate configurasyon dosyası hazırlamak için önemlidir.


Linkler:

https://jakarta.ee/specifications/persistence/3.j/jakarta-persistence-spec-3.1.pdf

* Öncelikle veritabanı oluşturalım.
* HibernateTestDB
* build.gradle dosyamıza bağımlılıkları ekleyelim.
  implementation 'org.hibernate.orm:hibernate-core:6.4.4.Final'
  implementation 'org.postgresql:postgresql:42.7.3'






