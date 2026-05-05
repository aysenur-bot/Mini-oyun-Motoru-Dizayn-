public abstract class GameObjectDecorator implements GameObject {
    protected GameObject object;

    public GameObjectDecorator(GameObject object) {
        this.object = object;
    }

    public void update() {
        object.update();
    }
}