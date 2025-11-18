package com.project_x.project_x_backend.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.UUID;
import java.sql.Timestamp;

@Entity
@Table(name = "pipeline_stages")
@Data
public class PipelineStage {

    @Id
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "audio_id", nullable = false)
    private AudioStore audio;

    @Column(name = "stage_name")
    private String stageName;

    private String model;

    @Column(name = "started_at")
    private Timestamp startedAt;

    @Column(name = "completed_at")
    private Timestamp completedAt;

    private String status;
}
