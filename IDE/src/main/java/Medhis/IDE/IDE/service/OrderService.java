package Medhis.IDE.IDE.service;


import Medhis.IDE.IDE.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public void receiveOrder(String barcode, Integer hospitalId) {
        String xidmetAdi = null;
        String sifarisAdi = null;
        String pasient = null;
        Integer pasientCins = null;
        Date pasientDogumTarixi = null;
        Integer ideXidmetId = null;
        String gonderenAdi = null;
        Date gonderilenTarix = null;

        orderRepository.receiveOrder(
                barcode,
                hospitalId,
                xidmetAdi,
                sifarisAdi,
                pasient,
                pasientCins,
                pasientDogumTarixi,
                ideXidmetId,
                gonderenAdi,
                gonderilenTarix
        );

        // Use the output parameters for further processing if needed
    }

    public void sendOrder(Integer hospitalId, String xidmetAdi, String sifarisAdi, String pasient,
                          Integer pasientCins, Date pasientDogumTarixi, Integer ideXidmetId,
                          String barcode, String gonderenAdi, Date gonderilenTarix) {
        orderRepository.sendOrder(
                hospitalId,
                xidmetAdi,
                sifarisAdi,
                pasient,
                pasientCins,
                pasientDogumTarixi,
                ideXidmetId,
                barcode,
                gonderenAdi,
                gonderilenTarix
        );
    }
}
