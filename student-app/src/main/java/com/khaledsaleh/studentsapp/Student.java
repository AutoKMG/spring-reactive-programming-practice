package com.khaledsaleh.studentsapp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@Builder
@Table(name = "student")
public class Student {
    @Id
    private Integer id;
    @Column("firstName")
    private String firstName;
    @Column("lastName")
    private String lastName;
    private int age;
}
