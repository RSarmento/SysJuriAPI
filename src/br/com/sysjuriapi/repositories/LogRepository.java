package br.com.sysjuriapi.repositories;

import br.com.sysjuriapi.domains.Log;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LogRepository extends JpaRepository <Log, Long>{
	
	//The repository shoul receive a Log object and use it's properties to complete the following query
//	@Query(value="SELECT * FROM log_table l WHERE "
//			+ "l.log_product = 'log.product' and"
//			+ "l.log_client = 'log.client'", nativeQuery=true)
//	List<Log> findByTerms(Log log);
	
	//Trying to select using a list of terms
	@Query(value="SELECT * FROM log_table l WHERE "
			+ "l.log_product = 'queryList[0]' and"
			+ "l.log_client = 'queryList[1]' and"
			+ "l.log_datatime = 'queryList[2]'", nativeQuery=true)
	List<Log> findByTerms(List<String> queryList);

}
