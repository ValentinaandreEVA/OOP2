public class Radio {
    private int currentVolume;
    private int currentStation;
    private int stationCount;

    public Radio(int stationCount) {
        this.stationCount = stationCount;
    }

    public Radio() {
        this.stationCount = 10;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            currentVolume = 100;
        } else if (newCurrentVolume < 0) {
            currentVolume = 0;
        } else {
            currentVolume = newCurrentVolume;
        }
    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }


    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    } // узнать станцию


    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > stationCount - 1) {
            currentStation = 9;
        } else if (newCurrentStation < 0) {
            currentStation = 0;
        } else {
            currentStation = newCurrentStation;
        }
    }


    public void nextStation() {
        if (currentStation < stationCount - 1) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }


    public void previewStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }
}
