package com.example.promemoria.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;

@Column(name = "firtname")
    private String firstname;
@Column(name = "lastname")
    private String lastname;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "utenti")
    List<Utente> rebecca;
}

