package com.neoteric.busticket;

public class Bus {
    public int serviceNo;

    @Override
    public String toString() {
        return "Bus{" +
                "serviceNo=" + serviceNo +
                ", froMLocation='" + froMLocation + '\'' +
                ", toLocation='" + toLocation + '\'' +
                ", busType='" + busType + '\'' +
                ", fromDate='" + fromDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", price=" + price +
                '}';
    }

    public Bus(String froMLocation, int serviceNo, String toLocation, String busType, String fromDate, String endDate, String startTime, String endTime, double price) {
        this.froMLocation = froMLocation;
        this.serviceNo = serviceNo;
        this.toLocation = toLocation;
        this.busType = busType;
        this.fromDate = fromDate;
        this.endDate = endDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.price = price;
    }

    public String froMLocation;
    public String toLocation;
    public String busType;
    public String fromDate;
    public String endDate;
    public String startTime;
    public String endTime;
    public double price;

}
