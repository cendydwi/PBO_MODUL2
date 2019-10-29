package asistensi_modul_2;
import java.util.Scanner;
public class main {
    static void menu(){
        System.out.println("Rapor Elektrik");
        System.out.println("1.Input Data");
        System.out.println("2.Tampil Data");
        System.out.println("3.Delete");
        System.out.println("4.Edit");
    
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        rapor nilai = new rapor();
        String nama;
        String cari;
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
                    
                case 3:
                    nilai.delete(nilai);
                break;
                
                case 4:
                    input.nextLine();
                    System.out.print("Masukkan Nama: ");cari = input.nextLine();
                    nilai.edit(nilai,cari);
                break;
            }
        }while (pilih!=5);
    }
}
