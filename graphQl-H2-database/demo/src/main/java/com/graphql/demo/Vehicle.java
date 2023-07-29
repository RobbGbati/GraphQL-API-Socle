package com.graphql.demo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;


@Entity
@Data
public class Vehicle implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String type;
    private String modelCode;
    private String brandName;
    private LocalDate launchDate;

    private transient String formattedDate;

    public String getFormattedDate() {
        return this.getLaunchDate().toString();
    }
}
