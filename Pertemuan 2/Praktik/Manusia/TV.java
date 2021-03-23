public class TV {
    int channel;
    int volumeLevel;
    boolean on;


    public TV(){
        channel = 1;
        volumeLevel = 1;
        on = false;
    }

    public void turnOn(){
        on = true;
    }

    public void turnOff(){
        on = false;
    }

    public void setChannel(int newChannel){
        if (newChannel >= 1 && newChannel <= 120) {
            channel = newChannel;
        }
        else {
            System.out.println("Channel tidak ditemukan");
        }
    }

    public void setVolume(int newVolumeLevel){
        if (newVolumeLevel <=7 && newVolumeLevel >= 1) {
            volumeLevel = newVolumeLevel;
        }
        else {
            System.out.println("Volume Tidak ditemukan");
        }
    }

    public void channelUp(){
        if (channel >120) {
            System.out.println("Channel tidak ditemukan");
        } else {
            channel++;
        }
    }

    public void channelDown(){
        if (channel <1) {
            System.out.println("Channel tidak ditemukan");
        } else {
            channel--;
        }
    }

    public void volumeUp(){
        if (volumeLevel >7) {
            System.out.println("Volume tidak ditemukan");
        } else {
            volumeLevel++;
        }
    }

    public void volumeDown(){
        if (volumeLevel <1) {
            System.out.println("volume not found");
        } else {
            volumeLevel--;
        }
    }

}
