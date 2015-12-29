package uk.co.eggsylife;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountRestController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/count")
    public CountPojo greeting() {
        return new CountPojo(counter.incrementAndGet());
    }
}
