package colectiiExercitii;

import java.util.*;

public class ExercitiiColectii {

    public static void main(String[] args) {

        // 1. Lista studenti
        System.out.println("----- Exercitiul 1 -----");

        List<String> studenti = new ArrayList<>();

        studenti.add("Ion");
        studenti.add("Maria");
        studenti.add("Andrei");
        studenti.add("Elena");
        studenti.add("George");

        System.out.println(studenti);

        studenti.remove(2);

        System.out.println(studenti);


        // 2. Suma si media
        System.out.println("----- Exercitiul 2 -----");

        List<Integer> numere = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numere.add(i);
        }

        int suma = 0;

        for (Integer numar : numere) {
            suma += numar;
        }

        double media = (double) suma / numere.size();

        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);


        // 3. Inversare lista
        System.out.println("----- Exercitiul 3 -----");

        List<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        System.out.println("Lista initiala: " + lista);

        for (int i = 0; i < lista.size() / 2; i++) {

            int temp = lista.get(i);

            lista.set(i, lista.get(lista.size() - 1 - i));

            lista.set(lista.size() - 1 - i, temp);
        }

        System.out.println("Lista inversata: " + lista);


        // 4. Cuvinte unice
        System.out.println("----- Exercitiul 4 -----");

        String propozitie = "java este usor si java este puternic";

        String[] cuvinte = propozitie.split(" ");

        Set<String> cuvinteUnice = new HashSet<>();

        for (String cuvant : cuvinte) {
            cuvinteUnice.add(cuvant);
        }

        System.out.println(cuvinteUnice);
        System.out.println("Numar cuvinte unice: " + cuvinteUnice.size());


        // 5. Frecventa cuvinte
        System.out.println("----- Exercitiul 5 -----");

        String text = "apple banana apple orange banana apple";

        String[] cuvinteText = text.split(" ");

        Map<String, Integer> frecventa = new HashMap<>();

        for (String cuvant : cuvinteText) {

            if (frecventa.containsKey(cuvant)) {
                frecventa.put(cuvant, frecventa.get(cuvant) + 1);
            } else {
                frecventa.put(cuvant, 1);
            }
        }

        System.out.println(frecventa);


        // 6. Agenda telefonica
        System.out.println("----- Exercitiul 6 -----");

        Map<String, String> agenda = new HashMap<>();

        agenda.put("Ion", "0711111111");
        agenda.put("Maria", "0722222222");
        agenda.put("Andrei", "0733333333");

        System.out.println(agenda.get("Maria"));

        for (Map.Entry<String, String> entry : agenda.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


        // 7. Sistem studenti
        System.out.println("----- Exercitiul 7 -----");

        List<Student> listaStudenti = new ArrayList<>();

        listaStudenti.add(new Student("Ion", 8));
        listaStudenti.add(new Student("Maria", 10));
        listaStudenti.add(new Student("Andrei", 7));

        for (Student student : listaStudenti) {
            System.out.println(student);
        }

        Student studentMaxim = listaStudenti.get(0);

        for (Student student : listaStudenti) {

            if (student.getNota() > studentMaxim.getNota()) {
                studentMaxim = student;
            }
        }

        System.out.println("Student cu nota maxima: " + studentMaxim);


        // 8. Sortare studenti
        System.out.println("----- Exercitiul 8 -----");

        listaStudenti.sort(Comparator.comparing(Student::getNume));

        System.out.println("Sortare dupa nume:");
        System.out.println(listaStudenti);

        listaStudenti.sort((s1, s2) -> Integer.compare(s2.getNota(), s1.getNota()));

        System.out.println("Sortare dupa nota descrescator:");
        System.out.println(listaStudenti);


        // 9. Eliminare duplicate
        System.out.println("----- Exercitiul 9 -----");

        List<Student> studentiDuplicati = new ArrayList<>();

        studentiDuplicati.add(new Student("Ion", 8));
        studentiDuplicati.add(new Student("Ion", 8));
        studentiDuplicati.add(new Student("Maria", 10));

        Set<Student> studentiUnici = new HashSet<>(studentiDuplicati);

        System.out.println(studentiUnici);


        // 10. Cache LRU
        System.out.println("----- Exercitiul 10 -----");

        LinkedHashMap<Integer, String> cache =
                new LinkedHashMap<>(3, 0.75f, true) {

                    @Override
                    protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                        return size() > 3;
                    }
                };

        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");

        cache.get(1);

        cache.put(4, "D");

        System.out.println(cache);


        // 11. Combinare map-uri
        System.out.println("----- Exercitiul 11 -----");

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 2);
        map1.put("banana", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("banana", 4);
        map2.put("orange", 5);

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {

            map1.put(
                    entry.getKey(),
                    map1.getOrDefault(entry.getKey(), 0) + entry.getValue()
            );
        }

        System.out.println(map1);
    }
}