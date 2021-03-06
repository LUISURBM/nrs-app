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
package com.nrs.assessment.concesionario.service;

import java.util.Collection;

import com.nrs.assessment.concesionario.model.*;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

/**
 * Repository class for <code>Vehiculo</code> domain objects All method names are compliant with Spring Data naming
 * conventions so this interface can easily be extended for Spring Data.
 * See: https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods.query-creation
 *
 * @author Luis Urbina
 */
public interface VehiculoRepository extends Repository<Vehiculo, Integer> {

    /**
     * Retrieve all <code>autor</code>s from the data store.
     *
     * @return a <code>Collection</code> of <code>Autor</code>s
     */
    @Transactional(readOnly = true)
    @Cacheable("vehiculos")
    Collection<Vehiculo> findAll() throws DataAccessException;

    /**
     * Retrieve an {@link Vehiculo} from the data store by id.
     * @param id the id to search for
     * @return the {@link Vehiculo} if found
     */
    @Query("SELECT vehiculo FROM Vehiculo vehiculo WHERE vehiculo.firstName =:firstName")
    @Transactional(readOnly = true)
    Vehiculo findByFirstName(@Param("firstName") String firstName);

    /**
     * Save an {@link autor} to the data store, either inserting or updating it.
     * @param autor the {@link autor} to save
     */
    void save(Vehiculo autor);


}
