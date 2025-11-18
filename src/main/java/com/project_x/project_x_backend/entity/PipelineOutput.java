package com.project_x.project_x_backend.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.UUID;
import java.sql.Timestamp;

@Entity
@Table(name = "pipeline_outputs")
@Data
public class PipelineOutput {

    @Id
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "stage_id", nullable = false)
    private PipelineStage stage;

    @Column(columnDefinition = "text")
    private String content;

    @Column(columnDefinition = "jsonb")
    private String data;

    @Column(name = "start_second")
    private Integer startSecond;

    @Column(name = "end_second")
    private Integer endSecond;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "deleted_at")
    private Timestamp deletedAt;
}
