package com.ecabisrael.ecabdemo.repository;

        import com.ecabisrael.ecabdemo.Booking;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    // You can define custom queries here if needed.
}
