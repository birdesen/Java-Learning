public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;


    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    int bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        }
        return 0;
    }

    double raiseSalary() {
        int workingYear = 2021 - this.hireYear;
        if (workingYear < 10) {
            return this.salary * 0.05;
        } else if (workingYear >= 10 && workingYear < 20) {
            return this.salary * 0.1;
        } else {
            return this.salary * 0.15;
        }
    }

    double tax() {

        if (this.salary > 1000) {
            return this.salary * 0.03;
        } else {
            return 0;
        }
    }

    void print() {
        System.out.println("Adı: " + this.name + "\n" +
                "Maaşı: " + this.salary + "\n" +
                "Çalışma saaati: " + this.workHours + "\n" +
                "Başlangıç yılı: " + this.hireYear + "\n" +
                "Vergi: " + this.tax() + "\n" +
                "Bonus: " + this.bonus() + "\n" +
                "Maaş artışı: " + this.raiseSalary() + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş: " + (this.salary - this.tax() + this.bonus()) + "\n" +
                "Toplam maaş: " + (this.salary - this.tax() + this.bonus() + this.raiseSalary()));
    }


}
