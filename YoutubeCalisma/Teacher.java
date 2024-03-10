
package YoutubeCalisma;

public class Teacher {
    String name;
    String mpno; //mobile phone no
    String branch; //branş
    Teacher(String name,String branch,String mpno){
        this.name=name;
        this.mpno=mpno;
        this.branch=branch;
    }
    void print(){
        System.out.println("Adı: "+this.name);
        System.out.println("Telefon numarası: "+this.mpno);
        System.out.println("Dersin ünvanı: "+this.branch);
    }
}
