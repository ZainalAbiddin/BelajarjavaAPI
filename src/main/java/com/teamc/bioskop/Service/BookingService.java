package com.teamc.bioskop.Service;

import com.teamc.bioskop.Model.Booking;
import com.teamc.bioskop.Model.Films;
import com.teamc.bioskop.Model.Schedule;
import com.teamc.bioskop.Model.Seats;

import java.util.List;
import java.util.Optional;

public interface BookingService {

    List<Booking> getAll();
    Optional<Booking> getBookingById(Long Id);
    Booking createBooking(Booking booking);
    void deleteSBookingById(Long Id);
    Booking updateBooking(Booking booking);
    Booking getReferenceById (Long Id);
    List<Booking> getBookingByFilmName(String name);

}
