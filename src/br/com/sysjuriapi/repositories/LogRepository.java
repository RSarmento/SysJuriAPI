package br.com.sysjuriapi.repositories;

import br.com.sysjuriapi.domains.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogRepository extends JpaRepository <Log, Long>{

}
