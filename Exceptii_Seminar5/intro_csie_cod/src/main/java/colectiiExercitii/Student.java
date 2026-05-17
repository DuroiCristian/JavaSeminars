package colectiiExercitii;

import java.util.Objects;

public class Student {

    private String nume;
    private int nota;

    public Student() {
    }

    public Student(String nume, int nota) {
        this.nume = nume;
        this.nota = nota;
    }

    public String getNume() {
        return nume;
    }

    public int getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", nota=" + nota +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        return nota == student.nota &&
                Objects.equals(nume, student.nume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, nota);
    }
}