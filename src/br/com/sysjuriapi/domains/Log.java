package br.com.sysjuriapi.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.time.LocalDateTime;
//import java.util.Map;

@Entity
@Table(name="log_table")
public class Log {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="log_id")
	private Long id;
	
	@Column(name="log_product")
	public String Product;
	
	@Column(name="log_client")
	public String Client;
	
	@Column(name="log_localdatetime")
	@Temporal(TemporalType.TIMESTAMP)
	public LocalDateTime DateTime;
	
	@Column(name="log_category")
	public String Category;
	
	//private Map<String, Log> Register;
	public Log() {}
	public Log(Long id, String product, String client, String category) {
		super();
		this.id = id;
		Product = product;
		Client 	= client;
		Category= category;
	}
	
	
	
}
