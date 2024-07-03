
package com.practica01.demo.dao;

import com.tienda.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository es la interface que tiene la bd para poder realizar instrucciónes sin usar codígo sql
public interface ArbolDao extends JpaRepository<Categoria,Long>{
    
    
}
