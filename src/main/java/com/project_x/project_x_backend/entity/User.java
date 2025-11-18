package com.project_x.project_x_backend.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.UUID;
import java.sql.Timestamp;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    private UUID id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;
}
