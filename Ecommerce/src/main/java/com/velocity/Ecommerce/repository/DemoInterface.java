//This DemoInterface is only for demo purpose
//do not alter or delete it
//create your own Repository interface in package(com.velocity.Ecommerce.repository) 
package com.velocity.Ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.Ecommerce.model.Demo;

@Repository
public interface DemoInterface extends JpaRepository<Demo, Integer>{
// created only for demo purpose
}
