package com.dlithe.baking.repository;


import com.dlithe.baking.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryDAO  extends JpaRepository<Country,Integer> {


    @Query(value = "select * from country where name=?1 ",nativeQuery = true)
    Country findByName(String countryName);
}
