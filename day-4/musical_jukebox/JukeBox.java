import java.util.*;


public class JukeBox {
	HashMap<PlayerType, Player> players;
	ArrayList<MediaFile> files;
	int curentIndex = -1 ;
	public JukeBox() {
		this.players = new HashMap<PlayerType, Player>();
		this.files = new ArrayList<MediaFile>();
	}

	public void addPlayer(Player player) {
		this.players.put(player.playerType, player);
	}
	public void addMediaFile(MediaFile mediaFile) {
		this.files.add(mediaFile);
	}

	public Player getPlayer(PlayerType playerType) {
		return this.players.get(playerType);
	}

	public void removeMediaFile(MediaFile mediaFile) {
		this.files.remove(mediaFile);
	}

	public void next() {
		int modifiedIndex = 0;
		if(this.files.size() > 0) {
			int index = this.getIndex();
			 modifiedIndex = (index < this.files.size() - 1) ? index+1 : 0 ;
		}
		
		this.setIndex(modifiedIndex);
	}

	public void previous() {
		int modifiedIndex = 0;
		if(this.files.size() > 0) {
			 int index = this.getIndex();
			 modifiedIndex = (index >= this.files.size() - 1) ? 0 : index -1; 
		}
		
		this.setIndex(modifiedIndex);
	}

	public void setIndex(int number) {
		this.curentIndex = number;
		System.out.println("Current Index of Jukebox::"+this.curentIndex);
	}

	public int getIndex() {
		return this.curentIndex;
	}

	public void printSongs() {
		for(MediaFile file : this.files) {
			System.out.println(file.name);
		}
	}

	public void play() {
		MediaFile mediaFile = this.files.get(this.curentIndex);
		PlayerType playerType = mediaFile.playerType;
		if(this.players.containsKey(playerType)) {
			this.players.get(playerType).play(mediaFile);
		}
	}


}