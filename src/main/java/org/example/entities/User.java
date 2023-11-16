package org.example.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="users")
public class User {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    private String name,email,password;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    @Getter
    @Setter
    private List<Goal> goals;
}