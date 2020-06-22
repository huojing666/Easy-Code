package baseoncomputer.serializable;

/**
 * @author Sweeney
 * @date 2020/6/22 8:07 PM
 */


import java.io.*;
import java.util.Date;

/**
 * Java原生序列化与反序列化
 * */
public class ByApi {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("/Users/mac/Desktop/EasyCode" +
                "/a.txt"));
        Person person = new Person("何静",100);
        outputStream.writeObject("王八蛋！");
        outputStream.writeObject(new Date());
        outputStream.writeObject(person);
        outputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("/Users/mac/Desktop/EasyCode/a.t" +
                "xt"));
        System.out.println((String)inputStream.readObject());
        System.out.println(inputStream.readObject());
        Person person1 = (Person) inputStream.readObject();
        System.out.println(person1);
        inputStream.close();

    }
}
