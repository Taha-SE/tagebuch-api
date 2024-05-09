package com.tahase.tagebuch.tagebuch;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.lang.NonNull;

import java.time.LocalDate;

@NoArgsConstructor(force = true)
@Entity
@Data
public class Tagebuch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nickname;
    @CreationTimestamp
    private LocalDate date;
    @NonNull
    private String text;
}
