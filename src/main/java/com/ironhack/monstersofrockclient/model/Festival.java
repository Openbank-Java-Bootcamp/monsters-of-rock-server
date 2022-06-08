package com.ironhack.monstersofrockclient.model;

import com.ironhack.monstersofrockclient.utils.Address;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Festival {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private List<Date> dates;
    @NotNull
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "streetAddress", column = @Column(name = "AccountHolders_address_Street_Address")),
            @AttributeOverride(name = "streetNumber", column = @Column(name = "AccountHolders_address_Street_number")),
            @AttributeOverride(name = "city", column = @Column(name = "AccountHolders_address_city")),
            @AttributeOverride(name = "country", column = @Column(name = "AccountHolders_address_country")),
            @AttributeOverride(name = "postCode", column = @Column(name = "AccountHolders_address_postalCode"))
    })
    private Address address;
    @NotNull
    private String website;
    private String history;
    private String extraInfo;
    private
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "festivals_bands",
            joinColumns = { @JoinColumn(name = "festival_id")},
            inverseJoinColumns = { @JoinColumn(name = "band_id")}
    )
    List<Band> bands;
}
