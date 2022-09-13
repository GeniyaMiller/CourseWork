public class Main {
    public static Employee [] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Petr", "Petrovich", "Petrov", 1, 98560);
        employees[1] = new Employee("Ivan", "Ivanov", "Ivanovich", 2, 67360);
        employees[2] = new Employee("Sidor", "Sidorovich", "Sidorov", 3, 120120);
        employees[3] = new Employee("Inga", "Valerievna", "Serova", 1, 75448);
        employees[4] = new Employee("Svetlana", "Konstantinovna", "Pavlenko", 4, 93420);
        employees[5] = new Employee("Pavel", "Phedorovich", "Kapustin", 5, 83679);
        employees[6] = new Employee("Tatiana", "Aleksandrovna", "Lebedeva", 4, 88888);
        employees[7] = new Employee("Olga", "Stanislavovna", "Shmeleva", 2, 79123);
        employees[8] = new Employee("Igor", "Semenovich", "Gvozdev", 3, 101101);
        employees[9] = new Employee("Irina", "Petrovna", "Stolyar", 5, 103789);

        System.out.println("Employees: ");
        printEmployees(employees);
        System.out.println();
        double sumSalary = calculateSalary(employees);
        System.out.println("The amount of salaries for the month: " + sumSalary);
        System.out.println();
        double minSalary = findMinSalary(employees);
        System.out.println("Minimum salary: " + minSalary);
        System.out.println();
        double maxSalary = findMaxSalary(employees);
        System.out.println("Maximum salary: " + maxSalary);
        System.out.println();
        double averageSalary = findAverageSalary(employees);
        System.out.println("Average salary " + averageSalary);
        System.out.println();
        printName(employees);
    }
    public static void printEmployees (Employee [] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static double calculateSalary (Employee[] employees) {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }
    public static double findMinSalary (Employee[] employees) {
        double min = 300_000;
        for (Employee employee : employees) {
            if (employee.getSalary() < min) {
                min = employee.getSalary();
            }
        }
        return min;
    }
    public static double findMaxSalary (Employee[] employees) {
        double max = 1;
        for (Employee employee : employees) {
            if (employee.getSalary() > max) {
                max = employee.getSalary();
            }
        }
        return max;
    }

    public static double findAverageSalary(Employee[] employees) {
        double average = calculateSalary(employees)/ employees.length;
        return average;
    }
    public static void printName (Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getName() + (" ") + employee.getPatronymic() + (" ") + employee.getSurname());
        }
    }



}
