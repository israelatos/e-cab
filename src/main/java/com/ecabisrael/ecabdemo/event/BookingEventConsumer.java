package com.ecabisrael.ecabdemo.event;


        import org.springframework.amqp.rabbit.annotation.RabbitListener;
        import org.springframework.stereotype.Component;

@Component
public class BookingEventConsumer {
    // Implement a listener method to consume booking events from RabbitMQ
    @RabbitListener(queues = "booking.queue")
    public void handleBookingEvent(String eventMessage) {
        // Process the event message received from RabbitMQ
    }
}
