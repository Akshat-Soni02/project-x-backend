package com.project_x.project_x_backend.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.UUID;
import java.sql.Timestamp;

@Entity
@Table(name = "tags",
       uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id", "name"})})
@Data
public class Tag {

    @Id
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String name;

    @Column(columnDefinition = "text")
    private String description;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;
}
