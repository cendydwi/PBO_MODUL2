package tugas_dosen;
import javax.swing.*;
import java.awt.event.*;

public class menu extends frame{
    public menu(){
        pilih.setBounds(20, 60, 200, 30);
        combobox_pilih.setBounds(100, 60, 150, 25);
        btn_pilih.setBounds(150, 100, 100, 25);
        
        frame.setTitle("MENU");
        frame.add(pilih);
        frame.add(combobox_pilih);
        
        btn_pilih.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                switch(combobox_pilih.getSelectedIndex()){
                    case 0:
                        new balok();
                        break;
                        
                    case 1:
                        new kubus();
                        break;
                        
                    case 2:
                        new tabung();
                        break;
                }
            }
        });
        
        frame.add(btn_pilih);
        frame.setLayout(null);
        frame.setSize(300, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new menu();
    }
}
