package org.japjot.springbootstarter.topic;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repositories extends JpaRepository<Topic,Long>  {

    public List<Topic> findByName(String name);

}
