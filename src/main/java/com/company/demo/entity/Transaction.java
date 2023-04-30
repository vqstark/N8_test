package com.company.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    private Long id;
    @Column(name = "trans_type")
    private String trans_type;
    @Column(name = "order_id")
    private Long orderId;
    @Column(name = "amount")
    private Long amount;
    @Column(name = "description")
    private String description;
    @Column(name = "date")
    private Date date;

    public Transaction(Long transId, String trans_type, Long orderId, Long amount, String description){
        this.id = transId;
        this.trans_type = trans_type;
        this.orderId = orderId;
        this.amount = amount;
        this.description = description;
        this.date = new Date();
    }
}

