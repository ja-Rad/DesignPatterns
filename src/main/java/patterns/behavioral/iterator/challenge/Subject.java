package patterns.behavioral.iterator.challenge;

import java.util.LinkedList;
import java.util.List;

public interface Subject {
    Iterator createIterator();
}

class Arts implements Subject {

    private String[] subjects;

    public Arts() {
        subjects = new String[2];
        subjects[0] = "Bengali";
        subjects[1] = "English";
    }

    @Override
    public Iterator createIterator() {
        return new ArtsIterator(subjects);
    }
}

class Science implements Subject {

    private List<String> subjects;

    public Science() {
        subjects = new LinkedList<>();
        subjects.add("Maths");
        subjects.add("Comp. Sc.");
        subjects.add("Physics");
    }

    @Override
    public Iterator createIterator() {
        return new ScienceIterator(subjects);
    }
}
