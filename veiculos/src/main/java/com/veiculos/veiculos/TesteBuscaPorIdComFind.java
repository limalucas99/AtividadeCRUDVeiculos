package com.veiculos.veiculos;

import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

import com.veiculos.model.beans.Veiculo;
import com.veiculos.veiculos.persistence.JPAUtil;

public class TesteBuscaPorIdComFind {

	public static void main(String[] args) {
		
		
		EntityManager manager = JPAUtil.getEntityManager();
		Veiculo v = manager.find(Veiculo.class, 1L);
		JOptionPane.showMessageDialog(null, v.toString());
		manager.close();
		JPAUtil.close();
		
	}

}
