// Interface Camera
interface Camera {
    void takePhoto();
}

// Interface MusicPlayer
interface MusicPlayer {
    void playMusic();
}

// Class SmartPhone implementing both Camera and MusicPlayer
class SmartPhone implements Camera, MusicPlayer {
    @Override
    public void takePhoto() {
        System.out.println("Taking a photo with SmartPhone camera");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music on SmartPhone");
    }
}

// Main class named code50
public class code50 {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone();

        // Call methods from both interfaces
        myPhone.takePhoto();
        myPhone.playMusic();
    }
}
