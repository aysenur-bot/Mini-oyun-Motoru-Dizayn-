public class SpeedBoost extends GameObjectDecorator {

    public SpeedBoost(GameObject object) {
        super(object);
    }

    public void update() {
        super.update();
        System.out.println("Speed increased!");
    }
}