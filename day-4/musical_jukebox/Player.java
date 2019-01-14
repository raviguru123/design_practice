public abstract class Player {
	PlayerType playerType;
	PlayerStatus playerStatus = PlayerStatus.EMPTY;
	MediaFile mediaFile;
	Reader reader;
	int time;
	public int volume;

	public void setPlayerType(PlayerType playerType) {
		this.playerType = playerType;
	}

	public void setPlayerStatus(PlayerStatus playerStatus) {
		this.playerStatus = playerStatus;
	}
	public void setMediaFile(MediaFile mediaFile) {
		this.mediaFile = mediaFile;
	}
	public void moveForward(int numberOfSecond) {
		this.reader.read(this.mediaFile,numberOfSecond);
	}
	public void moveBackward(int numberOfSecond) {
		this.reader.read(this.mediaFile, numberOfSecond);
	}

	public void pause() {
		this.playerStatus = PlayerStatus.PAUSE;
		System.out.println("Current Status of Player is::"+this.playerStatus);
	}
	
	public void play(MediaFile mediaFile) {
		this.time = 0;
		this.mediaFile = mediaFile;
		this.reader.read(mediaFile, this.time);
	}

	public void play() {
		this.reader.read(mediaFile, this.time);
	}

	public void volumeUp() {
		System.out.println("Volume Down Method is callled");
		this.setVolume(this.volume + 1);
	}

	public void volumeDown() {
		System.out.println("Volume Down Method is called::");
		this.setVolume(this.volume -1);
	}

	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("Current Volume of Player is ::"+this.volume);
	}


	public PlayerType getPlayerType() {
		return this.playerType;
	}
	public PlayerStatus getPlayerStatus() {
		return this.playerStatus;
	}
	public MediaFile getMediaFile() {
		return this.mediaFile;
	}

	public int getVolume() {
		return this.volume;
	}
}