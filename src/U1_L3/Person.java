package U1_L3;

public class Person {
    int age;
    String name;
    String occupation;
    
    public Person(int age, String name, String occupation) {
        this.age = age;
        this.name = name;
        this.occupation = occupation;
    }
    
    public void introduce() {
        System.out.println("Hello, my name is " + name + ", I am " + age + " years old and I am a " + occupation + ".");
    }

    public static void main(String[] args) {
        Student student = new Student(generateNumber(5, 18), "Eevee", "Student", generateNumber(40, 99), generateNumber(40, 100), generateNumber(40, 100));
        Parent parent = new Parent(generateNumber(30, 60), "Bob", "Doctor", "Eevee");
        Teacher teacher = new Teacher(generateNumber(30, 60), "David", "Math Teacher");
        PTConfurence(parent, teacher, student);
    }

    public static void PTConfurence(Parent parent, Teacher teacher, Student student) {
        System.out.println("Parent-Teacher Conference:");
        student.introduce();
        parent.introduce(student);
        teacher.introduce(student);
        System.out.println("Your student is doing " + student.performance());
        System.out.println("They have a grade of " + student.grade + ".");
        System.out.println("Your child is " + student.aimability());
        System.out.println(student.parentalVertdict());
    }

    public static int generateNumber(int min, int max) {
        int number = (int) (Math.random() * (max - min + 1)) + min;
        return number;
    }
}

class Parent extends Person {
    String childName;
    
    public Parent(int age, String name, String occupation, String childName) {
        super(age, name, occupation);
        this.childName = childName;
    }
    
    public void introduce(Student child) {
        super.introduce();
        System.out.println("I am a parent of " + childName + ".");
    }
}

class Teacher extends Person {    
    public Teacher(int age, String name, String occupation) {
        super(age, name, occupation);
    }
    
    public void introduce(Student student) {
        super.introduce();
        System.out.println("I am " + student.name + "'s teacher.");
    }
}

class Student extends Person {
    int parentalTrustLevel;
    int grade;
    int aimability;

    
    public Student(int age, String name, String occupation, int grade, int parentalTrustLevel, int aimability) {
        super(age, name, occupation);
        this.grade = grade;
        this.parentalTrustLevel = parentalTrustLevel;
        this.aimability = aimability;
    }
    
    public void introduce() {
        super.introduce();
    }

    public String performance() {
        if (grade < 50) {
            return "very poorly in school, we really need to work on improving grades lest they fail the class.";
        } else if (grade < 70) {
            return "not too well in school, there is definitely room for improvement.";
        } else if (grade < 90) {
            return "pretty well in school, but there is still some room for improvement.";
        } else {
            return "exceptionally well in school, keep up the great work! You have a bright future ahead.";
        }
    }

    public String aimability() {
        if (aimability < 50) {
            return "very painful to deal with, they are a troublemaker and never listens to instructions. We need to work on their behavior.";
        } else if (aimability < 70) {
            return "somewhat difficult to deal with, they can be a bit of a troublemaker and sometimes don't listen to instructions. We need to work on their behavior a bit.";
        } else if (aimability < 90) {
            return "generally well-behaved, they follow instructions and are a pleasure to have in class.";
        } else {
            return "an absolute joy to have in class, they are well-behaved and always follow instructions. Keep up the great work!";
        }
    }

    public String parentalVertdict() {
        if (parentalTrustLevel < 50) {
            if (grade < 50) {
                return name + ", you are a disgrace to your bloodline, I'm taking your phone and grounding you for a month.";
            } else if (grade < 70) {
                return name + ", you are a disappointment, I'm taking your phone and grounding you for two weeks.";
            } else if (grade < 90) {
                return name + ", you are doing okay, but I expect better from you. I'm taking your phone for a week.";
            } else {
                return name + ", you are doing okay I guess...";
            }
        } else if (parentalTrustLevel < 75) {
            if (grade < 50) {
                return name + ", this is not ideal, we need to work on improving your grades.";
            } else if (grade < 70) {
                return name + ", you are not doing too well, but I believe you can do better.";
            } else if (grade < 90) {
                return name + ", you are not doing too bad, but I know you can do better. I'm not taking your phone, but I expect you to improve.";
            } else {
                return name + ", you are doing well, keep up the good work!";
            }
        } else {
            if (grade < 50) {
                return name + ", you are doing poorly, but I trust you to improve. I'm not taking your phone, but I expect you to do better.";
            } else if (grade < 70) {
                return name + ", you are doing okay, but I know you can do better. I'm not taking your phone, but I expect you to improve.";
            } else if (grade < 90) {
                return name + ", you are doing well, keep up the good work! I'm proud of you!";
            } else {
                return name + ", you are doing great, keep it up!";
            }
        }
    }
}