public class Mp3Player extends Player {
	public Mp3Player() {
		this.reader = new Mp3Reader();
		this.playerType = PlayerType.MP3PLAYER;
	}
}