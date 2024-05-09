package com.tahase.tagebuch.tagebuch;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagebuchRepository extends JpaRepository<Tagebuch, Long> {
    List<Tagebuch> findAllByOrderByDateDesc();
}
