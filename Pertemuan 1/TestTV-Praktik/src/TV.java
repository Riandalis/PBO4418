public class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on;

    TV(){
    }

    // ON & OFF
    public void turnOn(){
        on = true;
    }
    public void turnOff(){
        on = false;
    }   

    // SETTING CHANNEL & VOLUME
    public int setChannel(int newChannel) {
        channel = newChannel;
        return 0;
    }
    public int setVolume(int newVolumeLevel){
        volumeLevel = newVolumeLevel;
        return 0;
    }

    // UP AND DOWN
    public void channelUp(){
        if (on && channel < 120){
            channel++;
        }
    }
    public void channelDown(){
        if (on && channel > 1){
            channel--;
        }
    }
    public void volumeUp(){
        if (on && volumeLevel < 10){
            volumeLevel++;
        }
    }
    public void volumeDown(){
        if (on && volumeLevel < 1){
            volumeLevel--;
        }
    }
}
