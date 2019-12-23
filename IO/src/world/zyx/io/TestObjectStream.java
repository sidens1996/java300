package world.zyx.io;

import org.omg.PortableInterceptor.DISCARDING;

import java.io.*;

/**
 * @ClassName: TestObjectStream
 * @Description: 测试对象流ObjectInputStream和ObjectOutputStream
 * 写出后读取
 * 读取的顺序和写出的顺序一致
 * 不是所有的对象都可以序列化，必须实现Serializable接口
 * @Author: Achilles
 * @Date: 18/12/2019  14:39
 * @Version: 1.0
 **/

public class TestObjectStream {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee = new Employee("zyx", 20000, 420114199609032831L);
        FileOutputStream fileOutputStream = new FileOutputStream("object.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new BufferedOutputStream(fileOutputStream));
        objectOutputStream.writeUTF("this is a test");
        objectOutputStream.writeChar('a');
        objectOutputStream.writeObject(employee);
        objectOutputStream.flush();
        objectOutputStream.close();

        // 文件作为中转站
        // 读取
        ObjectInputStream objectInputStream = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream("object.txt")));
        System.out.println(objectInputStream.readUTF());
        System.out.println(objectInputStream.readChar());
        System.out.println(objectInputStream.readObject());
        objectInputStream.close();
    }
}

class Employee implements Serializable {
    private String name;
    private double salary;
    private transient long idCard;

    public Employee() {
    }

    public Employee(String name, double salary, long idCard) {
        this.name = name;
        this.salary = salary;
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getIdCard() {
        return idCard;
    }

    public void setIdCard(long idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", idCard=" + idCard +
                '}';
    }
}
