
 
package com.mycompany.taskmanager;


import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // Métodos adicionales de consulta si son necesarios
}
