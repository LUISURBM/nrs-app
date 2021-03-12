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
package com.nrs.assessment.concesionario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
/**
 * Simple JavaBean domain object representing an autor.
 *
 * @author Luis Urbina
 */
@Entity
@Table(name = "vehiculos")
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "dor")
    @NotEmpty
    private String dor;

    @Column(name = "ciudad")
    @NotEmpty
    private String ciudad;

    @Column(name = "correo")
    private String correo;

    @Column(name = "marca")
    private String marca;
    
    @Column(name = "tpoCombustible")
    private String tpoCombustible;
    
    @Column(name = "vmax")
    private Integer vmax;

    @Column(name = "tpoTransmision")
    private String tpoTransmision;

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDor() {
        return this.dor;
    }

    public void setDor(String dor) {
        this.dor = dor;
    }

    public String getCiudad(){
        return this.ciudad;
    }

    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }

    public String getCorreo(){
        return this.correo;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTpoCombustible() {
        return tpoCombustible;
    }

    public void setTpoCombustible(String tpoCombustible) {
        this.tpoCombustible = tpoCombustible;
    }

    public Integer getVmax() {
        return vmax;
    }

    public void setVmax(Integer vmax) {
        this.vmax = vmax;
    }

    public String getTpoTransmision() {
        return tpoTransmision;
    }

    public void setTpoTransmision(String tpoTransmision) {
        this.tpoTransmision = tpoTransmision;
    }

    
}
