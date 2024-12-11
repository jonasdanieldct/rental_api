package com.jddc.rental_api.model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;


@Entity
@Table(name = "tbl_users")
@Data
public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column(name = "name")
        private String name;

        @Column(name = "email")
        private String email;

        @Column(name = "created_at")
        private LocalDate createdAt;

    }
