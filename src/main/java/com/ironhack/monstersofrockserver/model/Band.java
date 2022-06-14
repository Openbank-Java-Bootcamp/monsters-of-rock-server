package com.ironhack.monstersofrockserver.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
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
    @Lob
    private String logo;
    @NotEmpty(message = "Provide a name.")
    private String name;
    @NotEmpty
    @Lob
    private String image;
    @NotEmpty(message = "Provide a country.")
    private String country;
    private String kind;
    private String website;
    @NotEmpty
    private String video;




}
