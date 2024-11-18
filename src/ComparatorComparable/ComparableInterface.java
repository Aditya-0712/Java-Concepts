package ComparatorComparable;

import java.util.List;
import java.util.ArrayList;

class Student implements Comparable<Student>{
    private final int age;
    private final String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student that) {
        if (this.age==that.age)
            return 0;

        return this.age>that.age?1:-1;
    }

    @Override
    public String toString(){
        return "Age: " + this.getAge() + "      Name: " + this.getName();
    }
}

public class ComparableInterface {
    public static void main(String[] args) {
        List<Student> Students = new ArrayList<>();

        Students.add(new Student(13, "A"));
        Students.add(new Student(7, "B"));
        Students.add(new Student(20, "C"));
        Students.add(new Student(16, "D"));
        Students.add(new Student(23, "E"));

        Students.sort(null);

        for (Student student: Students){
            System.out.println(student);
        }
    }
}
//Over here the class Student implements the interface "Comparable" which is a functional interface containing the method
//compareTo(), which we can override and give our own logic of comparison (in this case is student's age)
//After that we can simply do Students.sort(null). As we have not used custom comparators here we have to pass the argument as null