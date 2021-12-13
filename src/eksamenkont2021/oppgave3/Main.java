package eksamenkont2021.oppgave3;

import eksamenkont2021.oppgave3.Fag;
import eksamenkont2021.oppgave3.Student;

public class Main {

    public static void main(String[] args) {

        Fag fag1 = new Fag("Programmering", 2020);

        Student student1 = new Student("Kari Olsen", "S234556");
        Student student2 = new Student("Ole Hansen", "S356734");

        System.out.println(fag1.toString());
        System.out.println(student1.toString());
        System.out.println(student2.toString());

    }
}
