package com.invoiceservice.api.invoice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter @Setter 
public class DtoCustomer {
	private int id;
	private String nombre;
	private String apellidos;
	private String rfc;
	private String correo;
	//private int id_region;
}
