package com.veiculos.veiculos;

import javax.persistence.Persistence;

public class TesteCriarBaseETabelas {

	public static void main(String[] args) {
		 
		Persistence.createEntityManagerFactory("bossiniPU");
	}

}
