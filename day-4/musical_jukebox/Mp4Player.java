public class Mp4Player extends Player {
	public Mp4Player() {
		this.reader = new Mp4Reader();
		this.playerType = PlayerType.MP4PLAYER;
	}
}