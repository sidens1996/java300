package defaultpackage;

public class User2 {

    int id;
    String name;
    String pwd;

    static String company = "hust";
    public User2(int id,String name){
        super();
        this.id = id;
        this.name = name;
    }

    public void login(){
        System.out.println("登录："+ name);
    }

    public static void printCompany(){
        System.out.println(company);
    }

    public static void main(String[] args) {

        User2 u = new User2(101,"zyx");
        User2.printCompany();
        User2.company = "hust";
        User2.printCompany();
    }
}
