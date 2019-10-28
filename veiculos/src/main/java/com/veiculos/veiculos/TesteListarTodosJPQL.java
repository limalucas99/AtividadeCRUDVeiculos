package com.veiculos.veiculos;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;

import com.veiculos.model.beans.Veiculo;
import com.veiculos.veiculos.persistence.JPAUtil;

public class TesteListarTodosJPQL {

	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		Query query = manager.createQuery("from Veiculo");
		List<Veiculo> veiculos = query.getResultList();
		for(Veiculo v: veiculos) {
			JOptionPane.showMessageDialog(null,v.toString());
		}
        manager.close();
        JPAUtil.close();
	}

}
