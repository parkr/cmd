import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import sun.audio.AudioData;
import sun.audio.AudioDataStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

/** Name: Parker Moore
 * Class: AP Computer Science
 * Teacher: Mr. Klus
 * Program: 
 * Description: 
 */

/**
 * @author parkermoore
 *
 */
public class Song {
		private AudioPlayer ap = AudioPlayer.player;
		AudioStream as;
		AudioData ad;
		AudioDataStream ads;
		ContinuousAudioDataStream cads;
		public void playSound(String soundFile) throws IOException{
			//Pre: Imports the location of a sound file in string form
			//Post: Plays the sound!
			FileInputStream fis = new FileInputStream(new File(soundFile));
			as = new AudioStream(fis);
			ad = as.getData();
			ads = new AudioDataStream(ad);
			cads = new ContinuousAudioDataStream(ad);
			ap.start(ads);
			for(int j=0;j<Integer.MAX_VALUE;j++){}
	}

}
