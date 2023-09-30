package Day35_Encapsulation_2;

public class Teacher {
    private static int id = 5000;
    private String teacherId;
    private String name;
    private double salary;

    public Teacher() {
        setId();
        setTeacherId();
    }

    public Teacher(String teacherId, String name, double salary) {
        setId();
        setTeacherId();
        this.teacherId = teacherId;
        setName(name);
        this.salary = salary;
    }

    public static int getId() {
        return id;
    }

    public static void setId() {
        id++;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId() {

        this.teacherId = "2022-" + id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim().toUpperCase();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher : " + teacherId + " " + name + " " + salary +"\n";
    }
}
