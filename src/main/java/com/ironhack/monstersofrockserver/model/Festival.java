package com.ironhack.monstersofrockserver.model;

import com.ironhack.monstersofrockserver.utils.Address;
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
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "streetAddress", column = @Column(name = "Festival_address_Street_Address")),
            @AttributeOverride(name = "streetNumber", column = @Column(name = "Festival_address_Street_number")),
            @AttributeOverride(name = "city", column = @Column(name = "Festival_address_city")),
            @AttributeOverride(name = "country", column = @Column(name = "Festival_address_country")),
            @AttributeOverride(name = "postCode", column = @Column(name = "Festival_address_postalCode"))
    })
    private Address address;
    @NotNull
    private String website;
    private String map;
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
