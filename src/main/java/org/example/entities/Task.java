package org.example.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tasks")
public class Task {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter
    @Setter
    private String name,status;
    @Getter
    @Setter
    private Date createdDate,endDate;

    @ManyToOne
    @JoinColumn(name = "goal_id")
    @Getter
    @Setter
    private Goal goal;

}