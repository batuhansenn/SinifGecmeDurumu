import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int toplamNot = 0;
        int dersSayisi = 5; // Toplam ders sayısı
        int gecmeNotu = 55;
        int gecenDersler = 0;

        Scanner giris = new Scanner(System.in);

        for(int i = 1; i <= dersSayisi; i++) {
            System.out.print(i + ". ders notunuzu girin: ");
            int not = giris.nextInt();
            if (not >= 0 && not <= 100) { // Notlar 0 ve 100 arasında ise işleme katıl
                toplamNot += not;
                if (not >= gecmeNotu) { // Geçme notu 55'den büyükse dersi geçenlerin sayısını arttır
                    gecenDersler++;
                }
            }
        }

        double ortalama = (double) toplamNot / dersSayisi; // Ortalama hesabı

        System.out.println("Ders ortalaması: " + ortalama);
        System.out.println("Geçen ders sayısı: " + gecenDersler);
    }
}