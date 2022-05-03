package com.dlithe.baking.repository;


import com.dlithe.baking.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BankDAO  extends JpaRepository<Bank,Integer> {



    @Query(value = "select * from bank where name=?1",nativeQuery = true)
    Bank findByName(String bankName);

}
