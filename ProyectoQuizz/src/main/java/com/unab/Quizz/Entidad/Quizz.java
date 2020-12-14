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
		private long id_user;
		private String nombre;
		private String puntaje;
		public long getId_user() {
			return id_user;
		}
		public void setId_user(long id_user) {
			this.id_user = id_user;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getPuntaje() {
			return puntaje;
		}
		public void setPuntaje(String puntaje) {
			this.puntaje = puntaje;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		
		
}
