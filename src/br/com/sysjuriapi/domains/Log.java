package br.com.sysjuriapi.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
//import java.util.Map;

@Entity
@Table(name="log_table")
public class Log {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="log_id")
	private Long id;
	
	@Column(name="log_product")
	public String product;
	
	@Column(name="log_client")
	public String client;
	
	@Column(name="log_localdatetime")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern="dd/MM/yyyy")
	public Date dateTime;
	
	@Column(name="log_category")
	public String category;
	
	//private Map<String, Log> Register;
	public Log() {}
	public Log(Long id, String product, String client, String category) {
		super();
		this.id = id;
		this.product = product;
		this.client = client;
		this.category= category;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateStart) {
		this.dateTime = dateStart;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
	
}
