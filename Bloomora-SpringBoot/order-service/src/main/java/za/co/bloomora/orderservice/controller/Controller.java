package za.co.bloomora.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order/")
public class Controller {

    @GetMapping("test")
    public String test(){
        return "HELO";
    }
}
