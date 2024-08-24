package Medhis.IDE.IDE.controller;

import Medhis.IDE.IDE.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.sql.Timestamp;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/receive")
    public void receiveOrder(@RequestParam String barcode, @RequestParam Integer hospitalId) {
        orderService.receiveOrder(barcode, hospitalId);
    }

    @PostMapping("/send")
    public void sendOrder(@RequestParam Integer hospitalId, @RequestParam String xidmetAdi,
                          @RequestParam String sifarisAdi, @RequestParam String pasient,
                          @RequestParam Integer pasientCins, @RequestParam String pasientDogumTarixi,
                          @RequestParam Integer ideXidmetId, @RequestParam String barcode,
                          @RequestParam String gonderenAdi, @RequestParam String gonderilenTarix) {
        orderService.sendOrder(hospitalId, xidmetAdi, sifarisAdi, pasient, pasientCins,
                Date.valueOf(pasientDogumTarixi), ideXidmetId, barcode,
                gonderenAdi, Timestamp.valueOf(gonderilenTarix));
    }
}
