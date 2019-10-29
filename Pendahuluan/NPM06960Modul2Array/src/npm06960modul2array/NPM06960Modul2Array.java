package npm06960modul2array;
class pegawai{

    private class data{
        int nip;
        String nama;
        String jabatan;
        
        data(int a, String b, String c){
            this.nip = a;
            this.nama = b;
            this.jabatan = c;
            
        }
    }
    
    data[] pegawai = new data[4];
    
    void tambah(pegawai x,int i, int a, String nama, String jabatan){
        data tambah = new data(a,nama,jabatan);
            x.pegawai[i] = tambah;
    }
    
    void lihat(pegawai x){
        System.out.println("DATA PEGAWAI");
        for(int i = 0; i <= 3; i++){
        data view = x.pegawai[i];
        System.out.println(view.nama+" -> "+view.jabatan);
        }
    }
}

public class NPM06960Modul2Array {

    public static void main(String[] args) {
        pegawai data =new pegawai();
        data.tambah(data, 0, 1, "Andi", "Programer");
        data.tambah(data, 1, 2, "Budi", "designer");
        data.tambah(data, 2, 3, "Cici", "PM");
        data.tambah(data, 3, 4, "Didi", "Programer");
        data.lihat(data);
    }
    
}
