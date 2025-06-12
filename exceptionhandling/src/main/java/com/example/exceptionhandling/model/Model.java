package com.example.exceptionhandling.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.annotation.processing.Generated;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Model {
    @Id
  //  @Generated(GeneratedValue=)
    private int id;

    @Column
    @NotBlank(message = "name cannot be null")
    private String name;
    @Column
    @NotBlank(message = "email cannot be null")
    private String email;
    @Column
    @NotBlank(message= "password needs to be given")
    private String password ;


}
