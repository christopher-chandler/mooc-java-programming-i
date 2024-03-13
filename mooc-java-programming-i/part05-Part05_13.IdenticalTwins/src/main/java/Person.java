
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals (Object compared) {

        Person comparedPerson = (Person) compared;

        if (this.name.equals(comparedPerson.name) &&
                this.height == comparedPerson.height &&
                this.weight == comparedPerson.weight &&
                this.birthday.getDay() == comparedPerson.birthday.getDay() &&
        this.birthday.getMonth() == comparedPerson.birthday.getMonth() &&
        this.birthday.getYear() == comparedPerson.birthday.getYear()){

            return  true;

        } else {
            return  false;
        }

    }




}