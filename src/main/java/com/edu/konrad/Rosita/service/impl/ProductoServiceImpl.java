package com.edu.konrad.Rosita.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.konrad.Rosita.commons.GenericServiceImpl;
import com.edu.konrad.Rosita.dto.ProductoDTO;
import com.edu.konrad.Rosita.model.Producto;
import com.edu.konrad.Rosita.service.API.ProductoServiceAPI;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.Firestore;

@Service
public class ProductoServiceImpl extends GenericServiceImpl<Producto, ProductoDTO> implements ProductoServiceAPI {
    @Autowired
    private Firestore firestore;

    @Override
    public CollectionReference getCollection() {
        return firestore.collection("productos");
    }

}
