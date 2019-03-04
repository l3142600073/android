package com.xwd.hardlibrary;

public class HardControl {
    public static native int ledCtrl(int wich, int status);
    public static native int ledOpen();
    public static native void ledClose();

    static {
        try {
            System.loadLibrary("hardcountrol");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
