public class Main {
    public static void main(String[] args) {

        GameEngineFacade game = new GameEngineFacade();
        game.startGame();
    }
    GameObject player = new SpeedBoost(
        GameObjectFactory.create("player")
);

player.update();
}
