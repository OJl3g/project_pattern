package org.OJl3g;

public class SettingServer {
    private static SettingServer settingServer;
    private int port;
    private String address;

    private SettingServer() {
    }

    public static SettingServer getInstant(){
        if (settingServer == null){
            settingServer = new SettingServer();
        }
        return settingServer;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}



class Main{
    public static void main(String[] args) {
        SettingServer settingServer = SettingServer.getInstant();
        SettingServer settingServer2 = SettingServer.getInstant();
        settingServer.setPort(9090);

        System.out.println(settingServer2);
        System.out.println(settingServer);

        SettingServer settingServer3 = SettingServer.getInstant();
        System.out.println(settingServer3.getPort());

    }
}