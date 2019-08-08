package IFDemo;

interface Radio {
	int FREQUENCY = 99;
	abstract void play();
}
interface MusicPlayer{
	void songsList();
}
interface ModernMusicPlayer extends MusicPlayer{
void playSongsFromCloud();	
}
class Mobile implements Radio,ModernMusicPlayer{

	@Override
	public void playSongsFromCloud() {
		System.out.println("cloud se gaanaa");
	}

	@Override
	public void play() {
	System.out.println("plaaaay");
	}

	@Override
	public void songsList() {
		System.out.println("gaaaanaaa");
	}
}

class interfaceDemo {
	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.play();
		m.playSongsFromCloud();
		m.songsList();
	}
	
}