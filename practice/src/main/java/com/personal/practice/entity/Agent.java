package com.personal.practice.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TBL_AGENT")
public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "specialization")
    private String specialization;

    @Column(name = "experience")
    private String experience;

    @Column(name = "languages")
    private String languages;

    @Column(name = "facebook")
    private String facebook;

    @Column(name = "instagram")
    private String instagram;

    @Column(name = "linkedin")
    private String linkedin;

    @Column(name = "youtube")
    private String youtube;

    @Column(name = "twitter")
    private String twitter;

    @Column(length = 10000, name = "description")
    private String description;

    @Column(name = "title")
    private String title;

    @Column(name = "photo_url")
    private String photo;

    @Column(name = "phone")
    private String phone;

    @Column(name = "name")
    private String name;

    @Column(name = "licence_no")
    private String licenceNo;

    @Column(name = "email", unique = true)
    private String email;
}
