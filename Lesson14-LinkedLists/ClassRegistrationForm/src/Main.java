import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static Scanner scanner;
    private static Student[] students;

    public static void main(String[] args){
        initializeVariables();
        introduceConcept();
        classRegistrationLoop();
    }

    private static void initializeVariables(){
        scanner = new Scanner(System.in);
        students = new Student[10];
    }

    private static void introduceConcept(){
        System.out.println("I'm creating a new Java tutorial class and want people to sign up! I've created \n" +
                "a program that allows me to automatically register new students by simply typing \n" +
                "'add <name> <classyear>' where <name> is simply their name and <classyear> is 'Freshman', \n" +
                "'Sophomore', 'Junior', 'Senior', or any other class year I can come up with! \n" +
                "I can also remove students by typing 'remove <name>. Lastly, I can print the list of all students \n + " +
                "by typing 'print'. Check out my program!");
    }

    private static void classRegistrationLoop(){
        while(true){
            System.out.println("Type 'add <student> <class year>' to add a new student to the class");
            System.out.println("Type 'remove <student>' to add a new student to the class");
            System.out.print(">");
            String command = scanner.nextLine();
            String[] parsedCommand = command.split(" ");
            if(parsedCommand[0].toLowerCase().equals("add")){
                if(parsedCommand.length < 3) continue;
                addStudent(parsedCommand[1], parsedCommand[2]);

            }
            if(parsedCommand[0].toLowerCase().equals("remove")){
                if(parsedCommand.length < 2) continue;
                removeStudent(parsedCommand[1]);
            }
            if(parsedCommand[0].toLowerCase().equals("show")){
                printAllStudents();
            }
        }
    }

    private static void addStudent(String name, String classYear){
        /**
         * TODO: Create way to add student to the list
         */
    }

    private static void removeStudent(String name){
        /**
         * TODO: Create way to remove student from the list
         */
    }

    private static void printAllStudents(){
        for(int i = 0; i < students.length; i++){
            if(students[i] == null){
                System.out.println("This student does not exist");
                continue;
            }
            System.out.println("Student #: " + i + ", Name: " + students[i].getName() + ", Class: " + students[i].getClassYear());
        }
    }
}