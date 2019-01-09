public class AppTest {
	public static void main(String[] args) {
		Cell initpos = new Cell(0,0);
		Board board = new Board(10, 10);
		Snake snake = new Snake(initpos);
		Game game = new Game(snake, board);
		game.gameover = false;
		game.direction = 1;

	}
}




