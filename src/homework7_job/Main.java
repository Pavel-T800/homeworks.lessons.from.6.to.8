//        Создать классы "Директор", "Рабочий", "Бухгалтер".
//        Реализовать интерфейс с методом, который печатает название должности и имплементировать этот метод в созданные классы

package homework7_job;

public class Main {
    public static void main(String[] args) {

        Accountant accountant = new Accountant();
        Director director = new Director();
        Worker worker = new Worker();
        System.out.println("Job Title: " + accountant.jobTitle);
        System.out.println("Job Title: " + director.jobTitle);
        System.out.println("Job Title: " + worker.jobTitle);
    }
}
