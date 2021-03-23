public class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on;

    TV() {
    }

    // ON & OFF
    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    // SETTING CHANNEL & VOLUME
    public void setChannel(int newChannel) {
        if (newChannel >= 1 && newChannel <= 120) {
            channel = newChannel;
        } else {
            System.out.println("Channel tidak ditemukan");
        }
    }
    public void setVolume ( int newVolumeLevel){
        if (newVolumeLevel <= 7 && newVolumeLevel >= 1) {
            volumeLevel = newVolumeLevel;
        } else {
            System.out.println("Volume tidak ditemukan");
        }
    }

        // UP AND DOWN
    public void channelUp () {
        if (channel > 120) {
            System.out.println("channel not found");
        } else {
            channel++;
        }
    }
    public void channelDown () {
        if (channel < 1) {
            System.out.println("channel not found");
        } else {
            channel--;
        }
    }
    public void volumeUp () {
        if (volumeLevel > 7) {
            System.out.println("volume not found");
        } else {
            volumeLevel++;
        }
    }
    public void volumeDown () {
        if (volumeLevel < 1) {
            System.out.println("volume not found");
        } else {
            volumeLevel--;
        }
    }
}
