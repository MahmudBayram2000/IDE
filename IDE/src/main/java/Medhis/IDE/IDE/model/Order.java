package Medhis.IDE.IDE.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;

import java.util.Date;

@Data
@Entity
@Getter
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String barcode;
    private Integer hospitalId;
    private String xidmetAdi;
    private String sifarisAdi;
    private String pasient;
    private Integer pasientCins;
    private Date pasientDogumTarixi;
    private Integer ideXidmetId;
    private String gonderenAdi;
    private Date gonderilenTarix;

    // Getters and Setters
}
