
package free;

import java.io.*;
import java.util.Scanner;



public class Free {
 public static void yaz_dosya() throws FileNotFoundException, IOException{
        Scanner k = new Scanner(System.in);
        File fx1 = new File("RAKAM1.DAT");
        File fx2 = new File("DIGER1.DAT");
        if (!fx1.exists() && !fx2.exists()) {
         fx1.createNewFile();
         fx2.createNewFile();
     }
        PrintWriter p1 = new PrintWriter(fx1);
        PrintWriter p2 = new PrintWriter(fx2);
        for (int i = 0; i < 10; i++) {
            String s = k.next();
            if(s.length()==1 && (s.charAt(0)>='0' && s.charAt(0)<='9')) {
                p1.print(s);
            }
            else {
                p2.print(s);
            }
            p1.close();
            p2.close();
        }
    }
    public static void main(String[] args) throws IOException {
       
       yaz_dosya();
    
    }}