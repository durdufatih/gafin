package com.ztoh.gamer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by fatihdurdu on 17/02/2017.
 */
@Repository
public interface GamerRepository extends CrudRepository<Gamer,String> {
}
