package Exercise02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Note note1 = new Note("To jest próbna notatka");
        Note note2 = new Note("Notatka z danymi");

        note1.addTag("personalna ");
        note2.addTag("praca");
        note2.addTag("ważne");

        List<String> searchTags = new ArrayList<>();
        searchTags.add("praca");
        searchTags.add("dane");

        System.out.println(note1);
        System.out.println(note2);

        System.out.println(note1.match("próbna",searchTags));
        System.out.println(note2.match("ważne",searchTags));


    }
}
