/**
 * @author NAE (Noah Ertz) - naertz
 * CIS-175 - Fall 2021
 * Oct 24, 2021
 */

package computer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import computer.beans.Computer;

@Repository
public interface ComputerRepository extends JpaRepository<Computer, Long> { }
