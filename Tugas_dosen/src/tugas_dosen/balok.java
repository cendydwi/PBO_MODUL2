package tugas_dosen;
import java.awt.event.*;

class balok extends frame{
    public balok(){
        panjang.setBounds(20, 60, 200, 30);
        form_panjang.setBounds(100, 60, 100, 20);
        
        lebar.setBounds(20, 100, 200, 30);
        form_lebar.setBounds(100, 100, 100, 20);
        
        tinggi.setBounds(20, 140, 200, 30);
        form_tinggi.setBounds(100, 140, 100, 20);
        
        btn_submit.setBounds(100, 170, 100, 25);
        
        volume.setBounds(20, 200, 200, 200);
        
        frame.setTitle("BALOK");
        frame.add(panjang);
        frame.add(form_panjang);
        frame.add(lebar);
        frame.add(form_lebar);
        frame.add(tinggi);
        frame.add(form_tinggi);
        frame.add(volume);
        
        btn_submit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                String output;
                int p, l, t;
                double val_volume;
                
                p = Integer.parseInt(form_panjang.getText());
                l = Integer.parseInt(form_lebar.getText());
                t = Integer.parseInt(form_tinggi.getText());
                
                val_volume = p * l * t;
                
                output = "Volume Balok = "+val_volume;
                
                volume.setText(output);
                
            }
        });
        frame.add(btn_submit);
        frame.setLayout(null);
        frame.setSize(300, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
    }
    
}
