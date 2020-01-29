package com.company.scrumit.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|taskId")
@Table(name = "SCRUMIT_TASK_ESTIMATION")
@Entity(name = "scrumit$TaskEstimation")
public class TaskEstimation extends StandardEntity {
    private static final long serialVersionUID = 9092560208258651043L;

    @NotNull
    @Column(name = "taskId")
    protected String taskId;

    @NotNull
    @Column(name = "DESCRIPTION")
    protected String description;

    @NotNull
    @Column(name = "VALUE_")
    protected Double value;

    public void setValue(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }
}