package com.project_x.project_x_backend.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.UUID;

@Entity
@Table(name = "general_tags")
@Data
public class GeneralTag {

    @Id
    private UUID id;

    @Column(unique = true)
    private UUID name;

    @Column(columnDefinition = "text")
    private String description;
}
