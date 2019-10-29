package npm06960Modul_2;
class rapor {
    private static class node{
        String nama;
        int mat,ipa;
        node next,prev;
        
        node(String nama, int mat, int ipa){
            this.nama = nama;
            this.mat = mat;
            this.ipa = ipa;
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
    }
    
    void view(rapor list){
        node view = list.tail;
        System.out.println("Nilai Siswa\n");
        while(view != null){
            System.out.println(view.nama+"\nNilai Matematika= "+view.mat+"\nNilai IPA= "+view.ipa+"\n");
            view = view.next;
        }
    }
}
