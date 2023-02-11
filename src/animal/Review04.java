package animal;

public class Review04 {

    public static void main(String[] args) {

        Human tanaka = new Human();
        tanaka.name = "田中 太郎";
        tanaka.age = 25;
        tanaka.hobby = "電車";
        tanaka.say();
        tanaka.think();

        Human suzuki = new Human();
        suzuki.name = "鈴木 次郎";
        suzuki.age = 30;
        suzuki.hobby = "野球";
        suzuki.say();
        suzuki.think();

        Human sato = new Human();
        sato.name = "佐藤 花子";
        sato.age = 20;
        sato.hobby = "映画";
        sato.say();
        sato.think();
    }

}
