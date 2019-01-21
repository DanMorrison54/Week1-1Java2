package JavaWeek2P2.AirportQ;

import java.util.Date;

public class Flight {
    protected int flightNum;
    protected Date departureTime;
    protected String destination;

    public Flight() {
    }

    public Flight(String destination, Date departureTime, int flightNum) {
        this.destination = destination;
        this.flightNum = flightNum;
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public void updateDestination(String destination) {
        this.destination = destination;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void updateDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public int getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(int flightNum) {
        this.flightNum = flightNum;
    }
}
