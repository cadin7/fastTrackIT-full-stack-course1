package ro.fasttrackit.course1;

import java.util.Objects;

public class Person {
    private final String name;
    private final int age;
    private final String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //Factory methods
    public static Person me() {
        return new Person("Mark", 26, "Oradea");
    }

    public static Person somebody() {
        if (System.currentTimeMillis() % 2 == 0) {
            return me();
        } else {
            return new Person("once told me", 2, "Oradea");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    static class PersonBuilder {
        private String name;
        private int age;

        public static PersonBuilder person() {
            return new PersonBuilder();
        }

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(name, age, "Oradea");
        }
    }
}
