package npm06960modul2linklist;

class pegawai{
    private class node{
        int nip;
        String nama, jabatan;
        node next;
        node prev;
            
        node(int a, String b, String c){
            this.nip = a;
            this.nama = b;
            this.jabatan = c;
            this.next = null;
            this.prev = null;
        }
    }
    
    node head;
    node tail;
    
    void tambah(pegawai list, int a, String nama, String jabatan){
        node data_pegawai = new node(a, nama, jabatan);
        if(list.head == null){
            list.head = data_pegawai;
            list.tail = data_pegawai;
        }else{
            data_pegawai.next = list.tail;
            data_pegawai.prev = null;
            list.tail.prev = data_pegawai;
            list.tail = data_pegawai;
        }
    }
    
    void lihat(pegawai list){
        node view = list.tail;
        System.out.println("DATA PEGAWAI");
        
        while (view != null){
            System.out.println(view.nama+" -> "+view.jabatan);
            view = view.next;
        }
    }
}

public class npm06960Modul2LinkList {

    
    
    public static void main(String[] args) {
        pegawai karyawan = new pegawai();
        karyawan.tambah(karyawan, 1, "Andi", "Programer");
        karyawan.tambah(karyawan, 2, "Budi", "designer");
        karyawan.tambah(karyawan, 3, "Cici", "PM");
        karyawan.tambah(karyawan, 4, "Didi", "Programer");
        karyawan.lihat(karyawan);
    }
    
}
