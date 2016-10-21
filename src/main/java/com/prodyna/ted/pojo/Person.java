package com.prodyna.ted.pojo;

public class Person {

    public Person() {

    }

    public Person(final String name) {
        super();
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return "Person [name=" + this.name + "]";
    }

    /**
     * Gets the name for Person.
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name to given name.
     *
     * @param name
     *            the name to set
     */
    public void setName(final String name) {
        this.name = name;
    }

}
