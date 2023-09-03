package com.ecabisrael.ecabdemo.service;


        import com.ecabisrael.ecabdemo.repository.BookingRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;

    @Autowired
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    // Implement additional service methods if needed for business logic
}
