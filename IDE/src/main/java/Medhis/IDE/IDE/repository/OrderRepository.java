package Medhis.IDE.IDE.repository;


import Medhis.IDE.IDE.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    @Procedure(name = "ReceiveOrder")
    void receiveOrder(
            @Param("barcode") String barcode,
            @Param("hospital_id") Integer hospitalId,
            @Param("xidmet_adi") String xidmetAdi,
            @Param("sifaris_adı") String sifarisAdi,
            @Param("pasient") String pasient,
            @Param("pasient_cins") Integer pasientCins,
            @Param("pasient_dogum_tarixi") Date pasientDogumTarixi,
            @Param("IDE_xidmet_id") Integer ideXidmetId,
            @Param("gonderen_adi") String gonderenAdi,
            @Param("gonderilen_tarix") Date gonderilenTarix
    );

    @Procedure(name = "SendOrder")
    void sendOrder(
            @Param("hospital_id") Integer hospitalId,
            @Param("xidmet_adi") String xidmetAdi,
            @Param("sifaris_adı") String sifarisAdi,
            @Param("pasient") String pasient,
            @Param("pasient_cins") Integer pasientCins,
            @Param("pasient_dogum_tarixi") Date pasientDogumTarixi,
            @Param("IDE_xidmet_id") Integer ideXidmetId,
            @Param("barcode") String barcode,
            @Param("gonderen_adi") String gonderenAdi,
            @Param("gonderilen_tarix") Date gonderilenTarix
    );
}
