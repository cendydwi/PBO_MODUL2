package asistensi_modul_2;
import java.util.Scanner;
class rapor {
    Scanner in = new Scanner(System.in);
    private static class node{
        String nama;
        int[] nilai = new int[3];
        char convert;
        node next,prev;
        
        node(String nama, int mat, int ipa){
            this.nama = nama;
            this.nilai[0] = mat;
            this.nilai[1] = ipa;
            this.nilai[2] = (mat+ipa)/2;
            if (nilai[2]>=80){
                this.convert ='A';
            }else if(nilai[2]>=50 && nilai[2]<80){
                this.convert = 'B';
            }else if(nilai[2]>=30 && nilai[2]<50){
                this.convert = 'C';
            }else{
                this.convert = 'D';
            }
            this.next = null;
            this.prev = null;
        }
    }
    
    node head,tail;
    
    void input(rapor list, String nama, int mat, int ipa){
        node data_siswa = new node(nama, mat, ipa);
        if(list.head == null){
            list.head = data_siswa;
            list.tail = data_siswa;
        }else{
            data_siswa.next = list.tail;
            data_siswa.prev = null;
            list.tail.prev = data_siswa;
            list.tail = data_siswa;
        }
        System.out.println("Data Telah Ditambahkan\n");
    }
    
    void view(rapor list){
        node view = list.head;
        System.out.println("Nilai Siswa\n");
        while(view != null){
            System.out.println("Nama= "+view.nama+"\nNilai Matematika= "+view.nilai[0]+
                    "\nNilai IPA= "+view.nilai[1]+"\nRata-Rata= "+view.nilai[2]+
                    "\nHasil= "+view.convert+"\n");
            view = view.prev;
        }
    }
    
    void delete(rapor list){
        node delete = list.tail;
        if(delete == list.head){
            System.out.println("Data Tidak Bisa Dihapus\n");
        }else{
            list.tail = list.tail.next;
            list.tail.prev = null;
            System.out.println("Data Terakhir Dihapus\n");
        }
    }
    
    void edit(rapor list, String cari){
        node search = list.tail;
        while (search != null){
            if (search.nama.equals(cari)){
                System.out.print("Masukkan Nilai Matematika: ");search.nilai[0] = in.nextInt();
                System.out.print("Masukkan Nilai IPA: ");search.nilai[1] = in.nextInt();    
                search.nilai[2] = (search.nilai[0]+search.nilai[1])/2;
                if (search.nilai[2]>=80){
                    search.convert ='A';
                }else if(search.nilai[2]>=50 && search.nilai[2]<80){
                    search.convert = 'B';
                }else if(search.nilai[2]>=30 && search.nilai[2]<50){
                    search.convert = 'C';
                }else{
                    search.convert = 'D';
                }
                
                System.out.println("Data Telah Diedit\n");
            }
            search = search.next;
        }        
    }
}
