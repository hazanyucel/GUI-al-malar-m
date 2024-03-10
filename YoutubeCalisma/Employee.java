package YoutubeCalisma;

public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.hireYear = hireYear;
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
    }

    int tax() {
        if (this.salary < 1000) {
            System.out.println(this.salary + "Maaşınıza vergi uygulanmamıştır.");
            return this.salary;
        } else if (this.salary > 1000) {
            this.salary -= this.salary * 3 / 100;
            System.out.println("kesilen vergiden sonra maaşınız: " + this.salary);
            return this.salary;
        }
        return 0;
    }

    int bonus() {
        if (this.workHours > 40) {
            this.salary += (this.workHours - 40) * 30;
            System.out.println("Ekstra çalışma saatleri için ikramiye+maaşınız: " + salary);
            return this.salary;

        } else {
            return 0;
        }
    }

    int raiseSalary() {
        if (this.hireYear > 2011) {//şuan 2021 alıyoruz.
            this.salary = this.salary * 5 / 100;
            System.out.println("zam:" + this.salary);
            return this.salary;
        } else if (this.hireYear < 2012 && this.hireYear > 2001) {
            this.salary = this.salary * 10 / 100;
            System.out.println("zam: " + this.salary);
            return this.salary;
        } else if (this.hireYear < 2002) {
            this.salary = this.salary * 15 / 100;
            System.out.println("zam" + this.salary);
            return this.salary;
        }
        return 0;
    }
}
