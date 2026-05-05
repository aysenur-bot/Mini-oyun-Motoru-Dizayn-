class GameObject {
    String type;

    public GameObject(String type) {
        this.type = type;
    }

    public void update() {
        if (type.equals("player")) {
            System.out.println("Player moves");
        }
        else if (type.equals("enemy")) {
            System.out.println("Enemy attacks");
        }
        else if (type.equals("item")) {
            System.out.println("Item waits");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        GameObject p = new GameObject("player");
        GameObject e = new GameObject("enemy");
        GameObject i = new GameObject("item");

        p.update();
        e.update();
        i.update();
    }
}