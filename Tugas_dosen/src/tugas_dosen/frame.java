package tugas_dosen;
import javax.swing.*;
public class frame{
    JFrame frame = new JFrame();
    
    JLabel pilih = new JLabel("Pilih");
    JLabel sisi = new JLabel("Sisi");
    JLabel panjang = new JLabel("Panjang");
    JLabel lebar = new JLabel("Lebar");
    JLabel tinggi = new JLabel("Tinggi");
    JLabel jari = new JLabel("Jari-Jari");
    
    JTextField form_pilih = new JTextField();
    JTextField form_sisi = new JTextField();
    JTextField form_panjang = new JTextField();
    JTextField form_lebar = new JTextField();
    JTextField form_tinggi = new JTextField();
    JTextField form_jari = new JTextField();
    
    String pilihan[] = {"Balok","Kubus","Tabung"};
    JComboBox combobox_pilih = new JComboBox(pilihan);
    
    JButton btn_pilih = new JButton("Pilih");
    JButton btn_submit = new JButton("Submit");
    
    JTextArea volume = new JTextArea();
    
    
}
