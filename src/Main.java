public class Main {
    public static void main(String[] args) {

        GameObject p = GameObjectFactory.create("player");
        GameObject e = GameObjectFactory.create("enemy");

        p.update();
        e.update();
    }
}