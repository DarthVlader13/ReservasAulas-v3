package org.iesalandalus.programacion.reservasaulas.mvc.modelo;

import org.iesalandalus.programacion.reservasaulas.mvc.modelo.negocio.ficheros.FactoriaFuenteDatosFicheros;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.negocio.memoria.FactoriaFuenteDatosMemoria;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.negocio.memoria.IFuenteDatos;

public enum FactoriaFuenteDatos {
	MEMORIA{
		@Override
		public IFuenteDatos crear() {
			IFuenteDatos memoria=new FactoriaFuenteDatosMemoria();
			return memoria;
		}
	}, 
	FICHEROS {
		@Override
		public IFuenteDatos crear() {
			IFuenteDatos ficheros=new FactoriaFuenteDatosFicheros();
			return ficheros;
		}
	};
	
	FactoriaFuenteDatos() {	
	}
	
	public abstract IFuenteDatos crear();
}

