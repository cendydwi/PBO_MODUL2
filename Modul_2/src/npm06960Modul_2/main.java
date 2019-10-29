package npm06960Modul_2;
import java.util.Scanner;
public class main {
    static void menu(){
        System.out.println("Rapor Elektrik");
        System.out.println("1.Input Data");
        System.out.println("2.Tampil Data");
    
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        rapor nilai = new rapor();
        String nama;
        int mat, ipa, pilih;
        do{
            menu();
            System.out.print("Pilih: ");pilih = input.nextInt();
            System.out.println();
            switch(pilih){
                case 1:
                    input.nextLine();
                    System.out.print("Masukkan Nama: ");nama = input.nextLine();
                    System.out.print("Masukkan Nilai Matematika: ");mat = input.nextInt();
                    System.out.print("Masukkan Nilai IPA: ");ipa = input.nextInt();
                    System.out.println();
                    nilai.input(nilai, nama, mat, ipa);
                break;
                
                case 2:
                    nilai.view(nilai);
                break;
            }
        }while (pilih!=3);
    }
}
