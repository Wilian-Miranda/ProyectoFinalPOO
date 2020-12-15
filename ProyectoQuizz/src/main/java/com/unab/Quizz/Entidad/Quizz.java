package com.unab.Quizz.Entidad;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "users")

public class Quizz implements Serializable{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id_Nombre;
		private String Persona;
		private String Puntaje;
		public long getId_user() {
			return id_Nombre;
		}
		public void setId_user(long id_user) {
			this.id_Nombre = id_user;
		}
		public String getNombre() {
			return Persona;
		}
		public void setNombre(String nombre) {
			this.Persona = nombre;
		}
		public String getPuntaje() {
			return Puntaje;
		}
		public void setPuntaje(String puntaje) {
			this.Puntaje = puntaje;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		
		
}
