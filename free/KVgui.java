package free;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class KVgui {

    public static void main(String[] args) {
        //Graphical User Interface(GUI).
        //Swing: Sun Microsystems tarafından piyasaya sürülen resmi java GUI aracıdır.
        JFrame frame=new JFrame("Pencere");
        
        frame.setSize(200,200);
        JButton buton=new JButton("buton");
        
        frame.getContentPane().add(buton);
        JPanel panel=new JPanel();
        
        JLabel label=new JLabel("Yazı Kısmı");
        buton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Butona Tıklandı.");
            }
        });
        label.setBounds(100,50,100,30);
        panel.add(label);
        panel.add(buton);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        

        
}}
