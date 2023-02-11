package animal;

public class Animal {

    private String name;
    private int age;

    // コンストラクタ
    public Animal() {
    }
    public Animal(String name,int age) {
        this.name = name;
        this.age = age;
    }
    // 名前と年齢を名乗るメソッド
    public void say() {
    System.out.println(name+"です。"+age+"歳です。");
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

}