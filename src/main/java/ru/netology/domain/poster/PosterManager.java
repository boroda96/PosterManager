package ru.netology.domain.poster;

public class PosterManager {
    private String[] items = new String[0];
    private int limit;

    public PosterManager() {
        this.limit = 10;

    }

    public PosterManager(int limit) {
        this.limit = limit;

    }

    public void add(String item) {
        String[] tmp = new String[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public String[] findAll() {
        return items.clone();

    }

    public String[] findLastAll() {
        int resultLength;
        if (items.length < limit) {
            resultLength = items.length;
        } else {
            resultLength = limit;
        }
        String[] reversed = new String[resultLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = items[items.length - 1 - i];
        }
        return reversed;
    }


}
