package baseoncomputer.serializable;

/**
 * @author Sweeney
 * @date 2020/6/22 8:36 PM
 */
import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 4359709211352400087L;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
