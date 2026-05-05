public class GameObjectFactory {

    public static GameObject create(String type) {

        if (type.equals("player")) return new Player();
        if (type.equals("enemy")) return new Enemy();
        if (type.equals("item")) return new Item();

        return null;
    }
}