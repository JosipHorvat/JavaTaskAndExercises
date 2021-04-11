package com.vjezba1.oopIntroductionExercises.objectasmethodreturnvalue;

/*
Counter counter = new Counter();
counter.increase();
counter.increase();

System.out.println(counter);         // prints 2

Counter clone = counter.clone();

System.out.println(counter);         // prints 2
System.out.println(clone);          // prints 2

counter.increase();
counter.increase();
counter.increase();
counter.increase();

System.out.println(counter);         // prints 6
System.out.println(clone);          // prints 2

clone.increase();

System.out.println(counter);         // prints 6
System.out.println(clone);          // prints 3
 */
public class Counter {

    private int value;

    // example of using multiple constructors:
    // you can call another constructor from a constructor by calling this
    // notice that the this call must be on the first line of the constructor
    public Counter() {
        this(0);
    }

    public Counter(int initialValue) {
        this.value = initialValue;
    }

    public void increase() {
        this.value = this.value + 1;
    }

    public String toString() {
        return "value: " + value;
    }

    public Counter clone() {
        // create a new counter object that receives the value of the cloned counter as its initial value
        Counter clone = new Counter(this.value);

        // return the clone to the caller
        return clone;
    }
}
