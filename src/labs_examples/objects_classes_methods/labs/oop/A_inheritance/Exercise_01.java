package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Exercise_01 {
    public static void main(String[] args){
        Network network = new Network();
        network.networkInformation();
    }
}

class Layer_1{
    private int physicalStatus;
    private String cableType;

    public Layer_1(int ps, String ct){
        if(ps > 1 || ps < 1){
            ps = 0;
        }
        this.physicalStatus = ps;
        this.cableType = ct;
    }

    public void setPhysicalStatus(int physicalStatus) {
        this.physicalStatus = physicalStatus;
    }

    public void setCableType(String cableType) {
        this.cableType = cableType;
    }

    public int getPhysicalStatus() {
        return physicalStatus;
    }

    public String getCableType() {
        return cableType;
    }

    public String status(int ps){
        if(ps == 1){
            return "The device is on";
        }else{
            return "The device is off";
        }
    }
}

class Layer_2 extends Layer_1{
    private String deviceType;
    private String deviceModel;

    public Layer_2(String dt, String dm){
        super(1,"Ethernet");
        this.deviceType = dt;
        this.deviceModel = dm;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public String pushFrameToDestination(){
        //System.out.println("Pushing data frame to destination...");
        return "Pushing data frame to destination...";
    }
}

class Layer_3 extends Layer_2{
    private String routerModel;

    public Layer_3(String rm){
        super("Switch", "Cisco Catalyst 3650");
        this.routerModel = rm;
    }

    public void setRouterModel(String routerModel){
        this.routerModel = routerModel;
    }

    public String getRouterModel() {
        return routerModel;
    }

    public String segmentNetwork(){
        String frame = this.pushFrameToDestination();
        String packet = frame + " This frame will be wrapped in an IPV4 packet because it is outside the local network";
        return packet;
    }

}

class Layer_4 extends Layer_3{
    private String transportType;

    public Layer_4(String tt){
        super("Cisco Catalyst 9500");
        this.transportType = tt;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public String getTransportType() {
        return transportType;
    }

    public void transport(){
        System.out.println("-------------------------------------------------------------");
        if(this.transportType.toUpperCase() == "TCP"){
            System.out.println("The packet will be transported using TCP, connection based transport");
        }else if(this.transportType.toUpperCase() == "UDP"){
            System.out.println("The packet will be transported using UDP, connectionless based transport");
        }else{
            System.out.println("Are you trying to transport the packet with a legacy transport protocol?\n Packet dropped...");
        }
    }

}

class Network extends Layer_4{
    public Network(){
        super("TCP");
    }

    public void networkInformation(){
        System.out.println("Physical Status: " + this.getPhysicalStatus());
        System.out.println("Status: " + status(this.getPhysicalStatus()));
        System.out.println("Cable Type: " + this.getCableType());
        System.out.println("Device Type: " + this.getDeviceType());
        System.out.println("Device Model: " + this.getDeviceModel());
        System.out.println("Frame: " + this.pushFrameToDestination());
        System.out.println("Router Model: " + this.getRouterModel());
        System.out.println("Segment: " + this.segmentNetwork());
        System.out.println("Transport Type: " + this.getTransportType());
    }


}
