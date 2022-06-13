package com.ironhack.monstersofrockserver.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Festival {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String image;
    @NotNull
    private String name;
    @NotNull
    private String dates;
    @NotNull
    private String address;
    @NotNull
    private String city;
    @NotNull
    private String country;
    @NotNull
    private String website;
    @NotNull
    private String info;
    @NotNull
    private String tickets;
    private
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "festivals_bands",
            joinColumns = { @JoinColumn(name = "festival_id")},
            inverseJoinColumns = { @JoinColumn(name = "band_id")}

    )
    List<Band> bands;
}
