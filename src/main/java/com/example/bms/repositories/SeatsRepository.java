package com.example.bms.repositories;

import com.example.bms.models.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatsRepository extends JpaRepository<Seat, Integer> {

    @Override
    List<Seat> findAllById(Iterable<Integer> integers);
}
