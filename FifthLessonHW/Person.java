package FifthLessonHW;

public class Person {
/*1. Создать класс "Сотрудник" с полями:
ФИО, должность, email, телефон, зарплата, возраст.
2. Конструктор класса должен заполнять эти поля при создании объекта.
*/

    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;


    public Person(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String toString() {
        /*3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
        5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.*/
        if (age >= 40) {

            return "\nName: " + fullName + ", Age: " + age + "\nPosition: " + position + "\ne-mail: " + email + ", Phone: " + phoneNumber + "\nSalary: " + salary;
        }
    return "\nPerson.";
    }

    public void setAge() {
        if (age >= 18 && age <= 65) {
            this.age = age;
        } else {
            System.out.println("Сотрудник не подходит по возрасту!");
        }
    }

    public int getAge() {
        return age;


    }

}
