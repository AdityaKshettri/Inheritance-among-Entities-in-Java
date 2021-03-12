package com.aditya.project.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@Entity
@DiscriminatorValue("book")
@EqualsAndHashCode(callSuper = true)
public class BookEntity extends ProductEntity {

    @Column(name = "author")
    private String author;
}
