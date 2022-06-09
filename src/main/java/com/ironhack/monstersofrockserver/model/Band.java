package com.ironhack.monstersofrockserver.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Band {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    private String image;
    @NotEmpty(message = "Provide a name.")
    private String name;
    @NotEmpty(message = "Provide a country.")
    private String country;
    private String kind;
    private String website;
    @NotEmpty
    private String video;




}
