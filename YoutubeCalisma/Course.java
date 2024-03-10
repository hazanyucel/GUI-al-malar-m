
package YoutubeCalisma;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;//ünvan
    int note;
    Course(String name,String code,String prefix){ //constructor
        this.code=code;
        this.name=name;
        this.prefix=prefix;
        
        int note=0;       
        
    }
    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)) {
        this.teacher=teacher;
        printTeacherInfo();}
        else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor!");}
    }
    void printTeacherInfo(){
        this.teacher.print();
    }
}
