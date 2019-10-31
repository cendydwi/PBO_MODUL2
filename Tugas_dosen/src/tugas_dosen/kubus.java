package tugas_dosen;
import java.awt.event.*;

class kubus extends frame{
    public kubus() {
        sisi.setBounds(20, 60, 200, 30);
        form_sisi.setBounds(100, 60, 100, 20);
        
        btn_submit.setBounds(100, 170, 100, 25);
        
        volume.setBounds(20, 200, 200, 200);
        
        frame.setTitle("KUBUS");
        frame.add(sisi);
        frame.add(form_sisi);
        frame.add(volume);
        
        btn_submit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                String output;
                int sisi;
                double val_volume;
                
                sisi = Integer.parseInt(form_sisi.getText());
                val_volume = sisi * sisi *sisi;
                output = "Volume Kubus = "+ val_volume;
                
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
