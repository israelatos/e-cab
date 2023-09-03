package com.ecabisrael.ecabdemo.event;

        import com.ecabisrael.ecabdemo.Booking;
        import org.springframework.amqp.rabbit.core.RabbitTemplate;
        import org.springframework.beans.factory.annotation.Value;
        import org.springframework.stereotype.Component;

@Component
public class BookingEventPublisher {
    private final RabbitTemplate rabbitTemplate;
    private final String exchangeName;

    @Autowired
    public BookingEventPublisher(RabbitTemplate rabbitTemplate, @Value("${rabbitmq.exchange.name}") String exchangeName) {
        this.rabbitTemplate = rabbitTemplate;
        this.exchangeName = exchangeName;
    }

    // Implement methods to publish booking events to RabbitMQ
}

