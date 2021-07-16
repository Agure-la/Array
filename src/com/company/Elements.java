package com.company;

class Elements implements Comparable<Elements>{

   int index, value;

    public Elements(int index, int value) {
        this.index = index;
        this.value = value;
    }

    @Override
    public int compareTo(Elements e) {
        return this.value - e.value;
    }
}
