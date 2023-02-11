package animal;
import animal.Thinkable;

public class Human extends Animal implements Thinkable {

    // フィールドの追加
    private String hobby;

    // コンストラクタ
    public Human() {
    }
    public Human(String name, int age) {
        super.setName(name);
        super.setAge(age);
        this.hobby = "未定";
    }
    @Override
    public void think() {
        System.out.println("私は"+hobby+"について考えています。");
    }
}
