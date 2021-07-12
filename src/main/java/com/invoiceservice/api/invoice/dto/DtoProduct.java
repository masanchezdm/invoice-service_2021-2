package com.invoiceservice.api.invoice.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter @Setter 
public class DtoProduct {
	
	private int id;
	private String codigo;
	private String producto;
	private String descripcion;
	private double precio;
	private int cantidad;
	private LocalDate fecha_creacion;
	private int id_categoria;
}