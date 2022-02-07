package model;

import exception.NegativeMoneyException;
import exception.NotEnoughMoneyException;

public class Wallet {
	
	//Atributos
	private double capacidad;
	private double plataDisponible;
	private String propietarioID;
	
	
	//Metodos
	public Wallet() {
		
	}
	
	public void meterPlata(double cantidad) {
		
	}
	
	public void sacarPlata(double cantidad) throws NotEnoughMoneyException, NegativeMoneyException{
		//Situacion 1
		if(cantidad>this.plataDisponible) {
			//Lanzar excepcion
			throw new NotEnoughMoneyException(this.plataDisponible, cantidad);
		}else if(cantidad<0) {
			//Lanzar excepcion
			throw new NegativeMoneyException(cantidad);
		}else {
			this.plataDisponible -= cantidad;
		}
	}
	
	
	//GETTERS Y STTERS
	

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public double getPlataDisponible() {
		return plataDisponible;
	}

	public void setPlataDisponible(double plataDisponible) {
		this.plataDisponible = plataDisponible;
	}

	public String getPropietarioID() {
		return propietarioID;
	}

	public void setPropietarioID(String propietarioID) {
		this.propietarioID = propietarioID;
	}
	

	
	
}
