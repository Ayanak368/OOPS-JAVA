class Employee {
    int empid;
    String name;
    double salary;
    String address;
    
    public Employee(int empid, String name, double salary, String address) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

class Teacher extends Employee {
    String department;
    String subjectsTaught;
                                                                                                                                                                                                                        
    public Teacher(int empid, String name, double salary, String address, String department, String subjectsTaught) {
        super(empid, name, salary, address);  // Call the constructor of Employee class
        this.department = department;
        this.subjectsTaught = subjectsTaught;
    }

    // Method to display all data members of Teacher
    public void display() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Subjects Taught: " + subjectsTaught);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Number of teachers to be displayed
        int N = 3;  // You can change this value as per requirement

        // Array of Teacher objects
        Teacher[] teachers = new Teacher[N];

        // Initializing Teacher objects
        teachers[0] = new Teacher(101, "John Smith", 50000.00, "1234 Elm St", "Mathematics", "Algebra, Calculus");
        teachers[1] = new Teacher(102, "Alice Johnson", 55000.00, "5678 Oak St", "Physics", "Mechanics, Thermodynamics");
        teachers[2] = new Teacher(103, "Mark Davis", 60000.00, "9101 Pine St", "Chemistry", "Organic Chemistry, Inorganic Chemistry");

        // Displaying details of all teachers
        for (int i = 0; i < N; i++) {
            System.out.println("Teacher " + (i + 1) + " Details:");
            teachers[i].display();
        }
    }
}

