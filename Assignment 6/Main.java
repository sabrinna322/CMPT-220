import java.util.Random;
public class Main {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student("Sabrinna", "Sophomore", 3.7, 2111);
        Student student2 = new Student("Olivia", "Freshman", 3.0, 1111);
        Student student3 = new Student("Nevena", "Freshman", 3.5, 1112);
        Student student4 = new Student("Chanel", "Senior", 3.2, 4111);
        Student student5 = new Student("Haley", "Sophomore", 3.8, 2112);
        
        student1.HonorRoll();
        student2.HonorRoll();
        student3.HonorRoll();
        student4.HonorRoll();
        student5.HonorRoll();

        Student[] students = {student1, student2, student3, student4, student5};

        Random rand = new Random();
        int luckyID = rand.nextInt(5000) + 1000;

        for (Student s : students) {
            s.FreeLunch(luckyID);
        }
    }
}

//WIL: I learned how to generate a random id and then compare that to the id's already in the given list in order to execute the last method.
