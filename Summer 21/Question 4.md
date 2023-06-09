# حسبي الله ونعم الوكيل 🥺💔
## السؤال مش لامم كل الاحتمالات طبعا زي مثلا إن لو عدد الساعات أقل من 0 يدي ايرور والكلام ده + ممكن يكون فيه خطأ أو حاجة عشان توهت من طول السؤال وربنا معانا
## ملحوظة دي الكلاسز بس من غير التست ونسيت برضو يا شباب أضيف ساعات وأنقص ساعات للطالب اللي بضيفه أو بشيله ابقوا ضيفوها
``` java

class Student{
    private int id;
    private String studentName;
    private double GPA;
    private int creditHours;



    public Student(int id, String studentName, double GPA) {
        this.id = id;
        this.studentName = studentName;
        this.GPA = GPA;
        this.creditHours = 0;
    }

    @Override
    public boolean equals(Object obj) {
        return (this.id == ((Student)obj).id
                && this.studentName.equals(((Student)obj).studentName)
                && this.GPA == ((Student)obj).GPA
                && this.creditHours == ((Student)obj).creditHours);
    }

    @Override
    public String toString() {
        return "Student Name: " + studentName +"\nID: "+ id +"\nGPA: " + GPA + "\nCreditHours: " + creditHours;
    }

    public int getHours() {
        return creditHours;
    }

    public void addHours(int creditHours) {
        this.creditHours += creditHours;
    }

    public double getGPA() {
        return GPA;
    }

    public int getPayment(){
        return creditHours*1000;
    }
}

class Course{
    private int courseCode;
    private String courseName;
    private int creditHours;
    public boolean offered;
    private Student[] students = new Student[100];

    private static int registered;

    public Course(int courseCode, String courseName, int creditHours) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.creditHours = creditHours;
    }

    @Override
    public boolean equals(Object obj) {
        if(this.courseCode == ((Course)obj).courseCode &&
        this.courseName.equals(((Course)obj).courseName) &&
        this.creditHours == ((Course)obj).creditHours){
            for (int i = 0; i < students.length; i++){
                if(!this.students[i].equals(((Course)obj).students[i])){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return  "Course Code: " + this.courseCode +
                "Course Name: " + this.courseName +
                "Course hours: " + this.creditHours;
    }
    public void register(Student student){
        if(this.offered){
            if((student.getHours() + this.creditHours) <= 21 && student.getGPA() >= 3.0){
                for (int i = 0; i < students.length; i++){
                    if(students[i] == null){
                        students[i] = student;
                        break;
                    }
                }
            } else if ((student.getHours() + this.creditHours) <= 12 && student.getGPA() < 2.0) {
                for (int i = 0; i < students.length; i++){
                    if(students[i] == null){
                        students[i] = student;
                    }
                }
            } else if ((student.getHours() + this.creditHours) <= 18){
                for (int i = 0; i < students.length; i++){
                    if(students[i] == null){
                        students[i] = student;
                    }
                }
            }else {
                System.out.println("Course can't be registered");
            }
        }
    }

    public void drop(Student student){
        for (int i = 0; i < students.length; i++){
            if(this.isRegistered(student)){
                students[i] = null;
            }
        }
    }


    public boolean isRegistered(Student student) {
        for (int i = 0; i < students.length; i++) {
            if(student.equals(students[i])) {
                return true;
            }
        }
        return false;
    }


    public void offer(){
        this.offered = true;
    }

    public void cancel(){
        this.offered = false;
    }

    public Student[] getStudents(){
        for (int i = 0; i < students.length; i++){
            if(this.isRegistered(students[i])){
                registered++;
            }
        }
        Student[] registeredStudents = new Student[registered];
        for(int j = 0; j < registeredStudents.length; j++){
            registeredStudents[j] = students[j];
        }
        return registeredStudents;
    }

    public static int totalRegistrations(){
        return registered;
    }



}

```
