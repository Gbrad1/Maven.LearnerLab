package io.zipcoder.interfaces;

public class Person {
    final Long id;
    String name;

    public Person(Long newId, String newName) {
        this.id = newId;
        this.name = newName;
    }

    public Person() {
        this.name = "template";
        this.id = 0000L;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
