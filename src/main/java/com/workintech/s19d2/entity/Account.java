package com.workintech.s19d2.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "account", schema = "bank")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
}
