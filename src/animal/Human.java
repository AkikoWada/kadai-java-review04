package animal;
import animal.Thinkable;

public class Human extends Animal implements Thinkable {

    // フィールドの追加
    private String hobby;

    // コンストラクタ
    public Human() {
    }
    public Human(String name, int age, String hobby) {
        super(name, age);
        this.hobby =hobby;
    }

    @Override
    public void think() {
        System.out.println("私は"+hobby+"について考えています。");
    }
}
