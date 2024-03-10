
package YoutubeCalisma;

public class BoksMaçı {
    public static void main(String[] args) {
        Fighter f1=new Fighter("Muhammed Ali",15,100,95,80);
        Fighter f2=new Fighter("Naci Kaptan",10,100,98,60);
        Match match=new Match(f1,f2,90,100);
        match.run();
    }
}
  