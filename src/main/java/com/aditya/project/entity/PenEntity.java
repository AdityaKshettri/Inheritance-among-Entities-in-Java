package com.aditya.project.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@Entity
@DiscriminatorValue("pen")
@EqualsAndHashCode(callSuper = true)
public class PenEntity extends ProductEntity {

    @Column(name = "colour")
    private String colour;
}
