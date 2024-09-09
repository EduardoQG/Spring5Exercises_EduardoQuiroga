package com.bananaapps.bananamusic.domain.music;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@ToString
@Entity
@Table(name = "purchase_order_line_song")
public class PurchaseOrderLineSong {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long lineNumber;
    @ManyToOne
    @JoinColumn(name = "song_id")
    private Song song;
    private Integer quantity;

    public PurchaseOrderLineSong(Long lineNumber, Song song, Integer quantity, Double unitPrice) {
        this.lineNumber = lineNumber;
        this.song = song;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Column(name = "unit_price")
    private Double unitPrice;


    public void setOrder(PurchaseOrder purchase) {
    }
}
