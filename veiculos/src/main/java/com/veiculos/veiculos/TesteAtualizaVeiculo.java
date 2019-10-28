package com.veiculos.veiculos;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.veiculos.model.beans.Veiculo;
import com.veiculos.veiculos.persistence.JPAUtil;

public class TesteAtualizaVeiculo {

	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Veiculo v = manager.find(Veiculo.class, 1L);
		v.setMarca("Peugeot");
		v.setModelo("5008");
		transaction.commit();
		manager.close();
		JPAUtil.close();

	}

}
