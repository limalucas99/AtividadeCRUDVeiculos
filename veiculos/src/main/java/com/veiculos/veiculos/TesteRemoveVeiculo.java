package com.veiculos.veiculos;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.veiculos.model.beans.Veiculo;
import com.veiculos.veiculos.persistence.JPAUtil;

public class TesteRemoveVeiculo {

	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Veiculo v = manager.find(Veiculo.class, 2L);
		manager.remove(v);
		transaction.commit();
		manager.close();
		JPAUtil.close();

	}

}
