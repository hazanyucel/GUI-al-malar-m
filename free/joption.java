/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package free;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Hazan
 */
public class joption {
    //JOptionPane = pop up a standar dialog box that prompts users for a value 
    //              or informs them of something.
    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null, "DERS CALIS", "HATIRLATMA", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null, "DERS CALIS", "HATIRLATMA", JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "DERS CALIS", "HATIRLATMA", JOptionPane.ERROR_MESSAGE);
//        while(true){
//            JOptionPane.showMessageDialog(null, "VIRUS ALGILANDI", "WARNING!", JOptionPane.WARNING_MESSAGE);
//        }
        String[] responses={"No,you're awesome","thank you!","*blush*"};
        ImageIcon ıcon=new ImageIcon("images.jpeg");
        JOptionPane.showOptionDialog(null, "You're awesome","secret message", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,ıcon,responses,0);
        
        
        
    }
}