package PZ1;

public class Student {
    private String name;
    private int age;
    private double gpa;

    // Геттери та сеттери
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age)
    {
        if (age < 0) {
            throw new IllegalArgumentException("Вік не може бути меншим за 0");
        }
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa < 0 || gpa > 4.0) {
            throw new IllegalArgumentException("Середній бал має бути в діапазоні від 0 до 4.0");
        }
        this.gpa = gpa;
    }

    public void printStudentInfo() {
        System.out.printf("Ім'я: %s%nВік: %d%nСередній бал: %.2f%n", name, age, gpa);
    }
}
