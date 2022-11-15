package com.company;

class Foo {
    int thingCount;
    int[] things;

    public Foo() {
        things = new int[100];
        thingCount = 0;
    }

    public void addThing(int newThing) {
        things[thingCount] = newThing;
        incrementThingCount();
    }

    public int getThingCount() {
        return thingCount;
    }

    private void incrementThingCount() {
        if (thingCount < 100) {
            thingCount++;
        }
    }

    public int getThingAtIndex(int i) {
        if (i >=0 && i <100) {
            return things[i];
        } else {
            return -1;
        }
    }
}