
package YoutubeCalisma;

public class ÖğrenciBilgiSistemi {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Mahmut Tuncer","TRH","5869564525");
        Teacher t2=new Teacher("Graham Bell","FZK","852951529675");
        Teacher t3 = new Teacher("Ali Veli","KMY", "90550000002");
        Course tarih=new Course("Tarih","101","TRH");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");
        tarih.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);
        Student s1=new Student("İnek Şaban","1212","4",tarih,fizik,kimya);
        s1.addBulkExamNote(100,100,50);
        s1.isPass();
        Student s2=new Student("Fil Necati","444","4",tarih,fizik,kimya);
        s2.addBulkExamNote(50, 30, 10);
        s2.isPass();
    }
} 
