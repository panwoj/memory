package com.wpirog.memory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "values")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Value {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String value;

    public Value(String value) {
        this.value = value;
    }
}
