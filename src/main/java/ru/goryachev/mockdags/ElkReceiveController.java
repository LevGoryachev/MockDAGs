package ru.goryachev.mockdags;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Size;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ElkReceiveController {


    @GetMapping()
    public ResponseEntity<SimpleResponseDto> logstashEndpointAccGet(@RequestHeader("Upgrade") String upgrade,
                                                                    @RequestHeader("Connection") String connection
                                                                    /*@RequestBody Object logsBody*/) {

        System.out.println("Received request");
        System.out.println("Upgrade header: " + upgrade);
        System.out.println("Connection header: " + connection);

        System.out.println("Received: " + upgrade);

        return ResponseEntity.ok(new SimpleResponseDto());
    }

}
