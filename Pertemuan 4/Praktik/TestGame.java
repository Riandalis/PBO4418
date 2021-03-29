public class TestGame {

    public static void main(String[] args) {

        GamePlayer player = new GamePlayer();
        player.setDimension(12, 12);
        player.setPosition(10, 220);
        System.out.println("Player Position: "+player.getX()+","+player.getY());
        player.Run(12);
        System.out.println("Player Position: "+player.getX()+","+player.getY());

        //  PLAYER
        GamePlayer player2 = new GamePlayer();
        player2.setDimension(12, 32);
        player2.setPosition(10, 10);

        //  ENEMY
        GameEnemy enemy = new GameEnemy();
        enemy.setDimension(12, 32);
        enemy.setPosition(10, 10);

        //  GameEnvironment
        GameEnvironment scene = new GameEnvironment();
        scene.addPlayer(player);
        scene.addPlayer(player);
        scene.addPlayer(player2);
        scene.getAllPlayer();
        scene.removePlayer(player);
        scene.getAllEnemy();
        scene.addEnemy(enemy);
        scene.interaction();
    }
}
