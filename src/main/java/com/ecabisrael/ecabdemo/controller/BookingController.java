package com.ecabisrael.ecabdemo.controller;


import com.ecabisrael.ecabdemo.Booking;
import com.ecabisrael.ecabdemo.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookingController {
    private final BookingRepository bookingRepository;

    @Autowired
    public BookingController(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    // Implement other CRUD endpoints as needed (e.g., PUT, DELETE)
}
