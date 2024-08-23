package Medhis.IDE.IDE.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long regId;

    private Integer cariId;
    private Integer xidmetId;
    private String xidmetAdi;
    private Integer sifarisId;
    private String sifarisAdi;
    private Integer labId;
    private String pasient;
    private Integer pasientId;
    private Integer pasientCins;
    private Date pasientDogumTarixi;
    private Integer IDEXidmetId;
    private Integer statusId;
    private String barcode;
    private Integer hospitalId;
    private Integer gonderenId;
    private String gonderenAdi;
    private Date gonderilenTarix;

}
