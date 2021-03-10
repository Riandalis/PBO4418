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
    public void setChannel(int newChannel) {
        channel = newChannel;
    }
    public void setVolume(int newVolumeLevel){
        volumeLevel = newVolumeLevel;
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
