import java.util.Arrays;

public class Student {
    private String id;
    private String name;
    private String dateOfBith;
    private String[] classList;

    public Student(String id, String name, String dateOfBith, String[] classList) {
        this.id = id;
        this.name = name;
        this.dateOfBith = dateOfBith;
        this.classList = classList;
    }

    public String[] getClassList() {
        return classList;
    }

    public void printClassList() {
//        for (int i = 0; i < classList.length; i++)
//        {
//            System.out.println(classList[i]);
//        }
        System.out.println(Arrays.toString(classList));
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBith='" + dateOfBith + '\'' +
                ", classList=" + Arrays.toString(classList) +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBith() {
        return dateOfBith;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBith(String dateOfBith) {
        this.dateOfBith = dateOfBith;
    }

    public void setClassList(String[] classList) {
        this.classList = classList;
    }
}
