package com.donato.project.bookstore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity(name = "order")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private Long id;

    @OneToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private User user;

    @Setter
    @Column(name = "order_date")
    private LocalDateTime orderDate;

    @Setter
    @Column(name = "total_price")
    private float totalPrice;
}
