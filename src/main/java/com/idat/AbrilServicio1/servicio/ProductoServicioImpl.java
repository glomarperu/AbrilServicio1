package com.idat.AbrilServicio1.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.AbrilServicio1.dto.ProductoDTORequest;
import com.idat.AbrilServicio1.dto.ProductoDTOResponse;
import com.idat.AbrilServicio1.modelo.Productos;
import com.idat.AbrilServicio1.repositorio.ProductoRepositorio;

@Service
public class ProductoServicioImpl implements ProductoServicio {
	
	@Autowired
	public ProductoRepositorio repositorio;
	
	@Override
	public void guardarProducto(ProductoDTORequest producto) {
		// TODO Auto-generated method stub
		
		Productos obj = new Productos();
		obj.setIdProducto(producto.getIdProductoDTO());
		obj.setNombreProducto(producto.getNombreProductoDTO());
		obj.setDescripcion(producto.getDescripcionDTO());
		obj.setPrecio(producto.getPrecioDTO());
		obj.setStock(producto.getStockDTO());
		
		repositorio.save(obj);

	}

	@Override
	public void editarProducto(ProductoDTORequest producto) {
		// TODO Auto-generated method stub
		
		Productos obj = new Productos();
		obj.setIdProducto(producto.getIdProductoDTO());
		obj.setNombreProducto(producto.getNombreProductoDTO());
		obj.setDescripcion(producto.getDescripcionDTO());
		obj.setPrecio(producto.getPrecioDTO());
		obj.setStock(producto.getStockDTO());
		
		repositorio.saveAndFlush(obj);
	}

	@Override
	public void eliminarProducto(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);;

	}

	@Override
	public List<ProductoDTOResponse> listarProductos() {
		// TODO Auto-generated method stub
		
		List<ProductoDTOResponse> lista = new ArrayList<ProductoDTOResponse>();
		ProductoDTOResponse obj = null;
		
		for(Productos producto : repositorio.findAll()){
			obj = new ProductoDTOResponse();
			obj.setIdProductoDTO(producto.getIdProducto());
			obj.setNombreProductoDTO(producto.getNombreProducto());
			obj.setDescripcionDTO(producto.getDescripcion());
			obj.setPrecioDTO(producto.getPrecio());
			obj.setStockDTO(producto.getStock());
			
			lista.add(obj);
		}
		
		return lista;
	}

	@Override
	public ProductoDTOResponse obtenerProductoId(Integer id) {
		// TODO Auto-generated method stub
		
		Productos producto = repositorio.findById(id).orElse(null);
		
		ProductoDTOResponse obj = new ProductoDTOResponse();
		obj.setIdProductoDTO(producto.getIdProducto());
		obj.setNombreProductoDTO(producto.getNombreProducto());
		obj.setDescripcionDTO(producto.getDescripcion());
		obj.setPrecioDTO(producto.getPrecio());
		obj.setStockDTO(producto.getStock());
		return obj;
	}

}
