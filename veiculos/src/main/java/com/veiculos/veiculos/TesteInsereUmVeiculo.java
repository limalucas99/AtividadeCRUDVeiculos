package com.veiculos.veiculos;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.veiculos.model.beans.Veiculo;
import com.veiculos.veiculos.persistence.JPAUtil;

public class TesteInsereUmVeiculo {

	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Veiculo v = new Veiculo();
		v.setModelo("Argo");
		v.setMarca("Fiat");
		v.setAno(2009);
		manager.persist(v);
		transaction.commit();
		manager.close();
		JPAUtil.close();
		
		
		
		
		
	}

}
