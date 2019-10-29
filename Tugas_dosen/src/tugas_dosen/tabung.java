package tugas_dosen;
import javax.swing.*;
import java.awt.event.*;

public class tabung extends frame{
    public tabung() {
        jari.setBounds(20, 60, 200, 30);
        form_jari.setBounds(100, 60, 100, 20);
        
        tinggi.setBounds(20, 100, 200, 30);
        form_tinggi.setBounds(100, 100, 100, 20);
        
        btn_submit.setBounds(100, 170, 100, 25);
        
        volume.setBounds(20, 200, 200, 200);
        
        frame.setTitle("TABUNG");
        frame.add(jari);
        frame.add(form_jari);
        frame.add(tinggi);
        frame.add(form_tinggi);
        frame.add(volume);
        
        btn_submit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                String output;
                int jari, t;
                double val_volume;
                
                jari = Integer.parseInt(form_jari.getText());
                t = Integer.parseInt(form_tinggi.getText());
                
                val_volume = 3.14 * jari * jari * t;
                
                output = "Volume Tabung = "+val_volume;
                
                volume.setText(output);
                
            }
        });
        frame.add(btn_submit);
        frame.setLayout(null);
        frame.setSize(300, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
