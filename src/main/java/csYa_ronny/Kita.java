package csYa_ronny;

public class Kita {
    private Person teacher;
    private String kitaName;
    private int studentsAmount;
    private Person[] students;

    public Kita(Person teacher, String kitaName, int studentsAmount) {
        this.teacher = teacher;
        this.kitaName = kitaName;
        this.studentsAmount = studentsAmount;
        this.students = new Person[studentsAmount];
    }

    public boolean addStudent(Person student){
        if(student.getRole()== 2)
            return false;
        for (int i = 0; i < this.students.length; i++) {
            if(this.students[i] == null){
                this.students[i]  = student;
                return true;
            }
        }
        return false;
    }
    public String getKitaName() {
        return kitaName;
    }

    public void setKitaName(String kitaName) {
        this.kitaName = kitaName;
    }

    public Person getTeacher() {
        return teacher;
    }

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }

    public int getStudentsAmount() {
        return studentsAmount;
    }

    public void setStudentsAmount(int studentsAmount) {
        this.studentsAmount = studentsAmount;
    }

    public Person[] getStudents() {
        return students;
    }

    public void setStudents(Person[] students) {
        this.students = students;
    }
}
