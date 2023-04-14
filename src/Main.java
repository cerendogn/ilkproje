import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
int mat, fizik, kimya, türkçe, tarih, muzik;
        Scanner inp= new  Scanner(System.in);
        System.out.print("Matematik notunuzu girin:");
        mat = inp.nextInt();

        System.out.print("Fizik notunuzu girin:");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuzu girin:");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunuzu girin:");
        türkçe = inp.nextInt();

        System.out.print("Tarih notunuzu girin:");
        tarih = inp.nextInt();

        System.out.print("Müzik notunuzu girin:");
        muzik= inp.nextInt();
        int toplam = (mat+ fizik + kimya+ türkçe+ tarih + muzik);
        double sonuc = toplam / 6.0;



        System.out.println("Ortalamanız:" +sonuc);
            System.out.println(sonuc>=60? "gectiniz":"kaldınız");

    }
}