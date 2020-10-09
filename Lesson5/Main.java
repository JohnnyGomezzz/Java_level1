public class Main {

    public static void main(String[] args)
    {
        Employee [] employArray = new Employee[5]; //создаём массив из пяти сотрудников

        employArray[0] = new Employee("Авдеев Роман Сергеевич", "генеральный директор",
                "avrom@company.com", "+7-927-656-88-78", 500000, 50);
        employArray[1] = new Employee("Безухов Пьер Жанпольевич", "финансовый директор",
                "bezuh@company.com","+7-926-564-87-23", 300000, 30);
        employArray[2] = new Employee("Коробейникова Лариса Моисеевна", "главный бухгалтер", "korla@company.com",
                "+7-812-555-18-44", 200000, 65);
        employArray[3] = new Employee("Васильев Антон Феоктистович", "охранник", "ohrana@company.com",
                "+7-921-865-37-99", 50000, 44);
        employArray[4] = new Employee("Зарыев Замиг Фикрет оглы", "водитель-экспедитор", "zamigas@gmail.com",
                "+7-999-644-52-97", 40000, 32);

        System.out.println("Все сотрудники ООО \"Рога и копыта\":\n");

        for (Employee employee : employArray)
        {
            employee.employeeInfo();
        }

        System.out.println("Сотрудники старше 40 лет:\n");

        for (Employee employee : employArray)
        {
            if (employee.age > 40) {
                System.out.println(employee.name);
            }
        }

    }

}
