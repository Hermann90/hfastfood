package com.fastfood.fastfood.repository;

import com.fastfood.fastfood.entities.CarryBox;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CarryBoxRepository extends JpaRepository<CarryBox, Integer> {

    @Query("select count(carryBox.boxId) from elef_carrybox carryBox")
    public Long getCarryBoxCount();

    @Query("select max(carryBox.boxId) from elef_carrybox carryBox")
    public int getMaxBoxId();
    public CarryBox findByBoxId(int boxId);

}