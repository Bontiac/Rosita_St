package com.edu.konrad.Rosita.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.konrad.Rosita.commons.GenericServiceImpl;
import com.edu.konrad.Rosita.dto.UsuarioDTO;
import com.edu.konrad.Rosita.model.Usuario;
import com.edu.konrad.Rosita.service.API.UsuarioServiceAPI;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.Firestore;
@Service
public class UsuarioServiceImpl extends GenericServiceImpl<Usuario,UsuarioDTO> implements UsuarioServiceAPI {

    @Autowired
	private Firestore firestore;

	@Override
	public CollectionReference getCollection() {
		return firestore.collection("usuarios");
	}
}