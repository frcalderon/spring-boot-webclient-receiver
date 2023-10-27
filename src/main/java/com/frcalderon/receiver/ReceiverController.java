package com.frcalderon.receiver;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/receive")
public class ReceiverController {

    @PostMapping
    public String postReceive(@RequestBody String data) {
        System.out.println(data);
        return "OK desde Receiver";
    }
}
