public abstract class Reader {
	MediaFile mediaFile;
	ReaderType readerType;
	public void read(MediaFile mediaFile,int starttime) {
		this.mediaFile = mediaFile;
		System.out.println(this.readerType+" Reader Start Reading file name:: "+mediaFile.name + " And start time ="+starttime);
	}
}