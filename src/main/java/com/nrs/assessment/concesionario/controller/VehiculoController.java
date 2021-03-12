/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.nrs.assessment.concesionario.controller;

import java.util.List;

import com.nrs.assessment.concesionario.model.Vehiculo;
import com.nrs.assessment.concesionario.service.VehiculoRepository;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author Luis Urbina
 */
@Controller
@CrossOrigin(origins = "*")
class VehiculoController {

    private final VehiculoRepository vehiculos;

    public VehiculoController(VehiculoRepository vehiculoservice) {
        this.vehiculos = vehiculoservice;
    }

    @GetMapping("/vehiculos")
    public List<Vehiculo> getvehiculos() {
        return (List<Vehiculo>) vehiculos.findAll();
    }

    @PostMapping("/vehiculos")
    void addVehiculo(@RequestBody Vehiculo vehiculo) {
        vehiculos.save(vehiculo);
    }

}
