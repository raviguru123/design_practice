public abstract class MediaFile {
	String name;
	String description;
	String published;
	String artist;
	String thumbnail;
	PlayerType playerType;

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public void setPlayerType(PlayerType playerType) {
		this.playerType = playerType;
	}

	public String getName() {
		return this.name;
	}

	public String getDescrption() {
		return this.description;
	}
	public String getArtist() {
		return this.artist;
	} 

	public String getThumbnail() {
		return this.thumbnail;
	}

	public PlayerType getPlayerType() {
		return this.playerType;
	}
}