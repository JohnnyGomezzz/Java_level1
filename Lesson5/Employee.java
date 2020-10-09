public class Employee {

    String name; //ФИО
    String position; //должность
    String email; //мыло
    String phone; //телефон
    int salary; //зарплата
    int age; //возраст

public Employee(String name, String position, String email, String phone, int salary, int age)
{
    this.name = name;
    this.position = position;
    this.email = email;
    this.phone = phone;
    this.salary = salary;
    this.age = age;
}

public void employeeInfo() //выводим инфу о сотруднике
{
    System.out.println("ФИО: " + name + "\n"
            + "Должность: " + position + "\n"
            + "E-mail: " + email + "\n"
            + "Телефон: " + phone + "\n"
            + "Зарплата: " + salary + "\n"
            + "Возраст: " + age + "\n");
}

}