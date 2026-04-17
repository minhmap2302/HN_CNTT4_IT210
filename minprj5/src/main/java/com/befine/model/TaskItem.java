
package com.befine.model;

import jakarta.validation.constraints.*;
import java.time.LocalDate;

public class TaskItem {

    private String id;

    @NotBlank
    @Size(min = 5)
    private String title;

    @NotNull
    @Future
    private LocalDate deadline;

    @Pattern(regexp = "HIGH|MEDIUM|LOW")
    private String priority;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public LocalDate getDeadline() { return deadline; }
    public void setDeadline(LocalDate deadline) { this.deadline = deadline; }

    public String getPriority() { return priority; }
    public void setPriority(String priority) { this.priority = priority; }
}
