package com.jddc.rental_api.model;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_users")
@Data
public class UserEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.UUID)
        private String id;

        @Column(name = "name")
        private String name;

        @Column(name = "email")
        private String email;

        @Column(name = "created_at")
        @CreationTimestamp
        private LocalDateTime createdAt;

    }
