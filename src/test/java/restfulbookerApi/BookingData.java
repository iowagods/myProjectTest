package restfulbookerApi;

import com.fasterxml.jackson.annotation.JsonProperty;


public class BookingData {
    @JsonProperty


    private Integer bookingid;

    public int getBookingId() {
        return bookingid;
    }

    public BookingData() {
    }

    public BookingData(int bookingId) {
        this.bookingid = bookingId;
    }

    public BookingData(Integer bookingid) {
        this.bookingid = bookingid;
    }

    public Integer getBookingid() {
        return bookingid;
    }

    public void setBookingid(Integer bookingid) {
        this.bookingid = bookingid;
    }
}
