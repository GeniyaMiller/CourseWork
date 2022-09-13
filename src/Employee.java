public class Employee {
    private String name;
    private String patronymic;
    private String surname;
    private int departmentNumber;
    private double salary;
    public static int count = 0;
    private int id;

    public Employee (String name, String patronymic, String surname, int departmentNumber, double salary) {
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
        id = count++;
    }
    public String getName (){
        return name;
    }
    public String getPatronymic (){
        return patronymic;
    }
    public String getSurname (){
        return surname;
    }
    public int getDepartmentNumber (){
        return departmentNumber;
    }
    public double getSalary (){
        return salary;
    }
    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return (name + " " + patronymic + " " + surname + " " + departmentNumber + " " + salary);
    }


}
