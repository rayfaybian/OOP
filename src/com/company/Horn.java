package com.company;

public class Horn {
    private String myRingtone;

    public Horn(String myRingtone) {
        this.myRingtone = myRingtone;
    }

    public String getMyRingtone() {
        return myRingtone;
    }

    @Override
    public String toString() {
        return "\nHornsound :" + myRingtone;
    }
}

