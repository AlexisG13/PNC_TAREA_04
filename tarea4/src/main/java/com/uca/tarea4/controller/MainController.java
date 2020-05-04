package com.uca.tarea4.controller;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.tarea4.domain.Producto;

@Controller
public class MainController {

    @RequestMapping("/producto")
    public ModelAndView index() {
	ModelAndView mav = new ModelAndView();
	mav.addObject("producto", new Producto());
	mav.setViewName("commons/producto");
	return mav;
    }

    @RequestMapping("/guardarProducto")
    public ModelAndView guardarProducto(@Valid() @ModelAttribute() Producto producto, BindingResult result) {
	ModelAndView mav = new ModelAndView();
	if (result.hasErrors()) {
	    mav.setViewName("commons/producto");
	    return mav;
	}
	mav.addObject("nombre", producto.getNombre());
	mav.addObject("UPC", producto.getUPC());
	mav.addObject("marca", producto.getMarca());
	mav.addObject("fechaIngreso", producto.getFechaIngreso());
	mav.addObject("existencias", producto.getExistencias());
	mav.addObject("descripcion", producto.getDescripcion());
	mav.setViewName("commons/productoGuardado");
	return mav;

    }
}
