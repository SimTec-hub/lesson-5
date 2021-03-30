package geekbrain;

public class Main {

    public static void main(String[] args) {

        Employer[] emparray = {
                new Employer("Иванов Иван", "Инженер", "ivivan@mailbox.com", "892312312", 30000.00, 30),
                new Employer("Карпов Стас", "Программист", "skarp@mailbox.com", "892358937", 90000.00, 34),
                new Employer("Рыбаков Даниил", "Аналитик", "drybak@mailbox.com", "892356567", 50000.00, 50),
                new Employer("Артемьева Яна", "Секретарь", "yaartem@mailbox.com", "892312345", 25000.00, 29),
                new Employer("Кирьянов Леонид", "Директор", "boss@mailbox.com", "892311111", 100000.00, 58),
        };
        for (Employer employer : emparray) {
            if (employer.getAge() > 40) employer.printEmployer();
        }
    }
}
    class Employer {
        private String fio;
        private String position;
        private String email;
        private String phone;
        private double pay;
        private int age;

        public Employer(String fio, String position, String email, String phone, double pay, int age) {
            this.fio = fio;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.pay = pay;
            this.age = age;
        }

        public void printEmployer() {
            System.out.print("Фамилия, имя: " + fio + "; ");
            System.out.print("Должность: " + position + "; ");
            System.out.print("Email: " + email + "; ");
            System.out.print("Телефон: " + phone + "; ");
            System.out.print("Зарплата: " + pay + "; ");
            System.out.println("Возраст: " + age + ".");
        }

        public int getAge() {
            return age;
        }
    }