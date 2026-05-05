public class GameEngineFacade {

    private GameObject player;
    private GameObject enemy;

    public GameEngineFacade() {
        player = GameObjectFactory.create("player");
        enemy = GameObjectFactory.create("enemy");
    }

    public void startGame() {
        System.out.println("Game Started");
        player.update();
        enemy.update();
    }
}