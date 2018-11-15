package ru.mashkova.su;

/**
 * Hello world!
 */
public class Employee {
    String name;
    String post;
    String email;
    long phoneNumber;
    int salary;
    int age;

    public Employee(String name, String post, String email, long phoneNumber, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", post='" + post + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Artem Adahov", "secretary", "asdf@mail.ru", 6567852, 543, 44);
        empArray[1] = new Employee("Lolita Ivanova", "admin", "dgjf@yadf.ru", 23456789, 234, 34);
        empArray[2] = new Employee("Matrin Luter", "writer", "ghjkl@mail.ru", 987654, 456, 48);
        empArray[3] = new Employee("Adam Smith", "economist", "otdjg@yadf.ru", 46540532, 345, 41);
        empArray[4] = new Employee("Marie Curie", "scientist", "djtfu@mail.ru", 876542789, 465, 37);

        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].age >= 40) {
                System.out.println(empArray[i].toString());
            }
        }
    }
}
