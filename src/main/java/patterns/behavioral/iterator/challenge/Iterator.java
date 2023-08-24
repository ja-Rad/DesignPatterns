package patterns.behavioral.iterator.challenge;

import java.util.List;

public interface Iterator {
    void first();

    String next();

    boolean hasNext();

    String currentItem();
}

class ArtsIterator implements Iterator {
    private String[] subjects;
    private int position;

    public ArtsIterator(String[] subjects) {
        this.subjects = subjects;
        position = 0;
    }

    @Override
    public void first() {
        position = 0;
    }

    @Override
    public String next() {
        return subjects[position++];
    }

    @Override
    public boolean hasNext() {
        return position < subjects.length;
    }

    @Override
    public String currentItem() {
        return subjects[position];
    }
}

class ScienceIterator implements Iterator {
    private List<String> subjects;
    private int position;

    public ScienceIterator(List<String> subjects) {
        this.subjects = subjects;
        position = 0;
    }

    @Override
    public void first() {
        position = 0;
    }

    @Override
    public String next() {
        return subjects.get(position++);
    }

    @Override
    public boolean hasNext() {
        return position < subjects.size();
    }

    @Override
    public String currentItem() {
        return subjects.get(position);
    }
}
