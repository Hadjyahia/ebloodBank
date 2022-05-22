package com.fsb.eblood.dao.repositories;

import com.fsb.eblood.dao.entities.Publication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PubRepository extends JpaRepository<Publication,Integer> {
     List<Publication> findAllByOrderByPubIdDesc();


}
