package com.personal.practice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.lang.model.element.Name;
import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "TBL_Property_Management")
public class PropertyManagement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "ID")
    private Long id;

    @Column(name = "bedrooms")
    private String bedrooms;

    @Column(name = "location")
    private String location;

    @Column(name = "name")
    private String name;

    @Column(name = "phone_number")
    private Long phoneNumber;

    @Column(name = "project_type")
    private String projectType;

    @Column(name = "property_for")
    private String propertyFor;

    @Column(name = "e_mail")
    private String email;









}
