package br.com.bluesoft.agenda.model;

import java.util.Date;

public class Agendamento {

	private int id;
	private Date data;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
}