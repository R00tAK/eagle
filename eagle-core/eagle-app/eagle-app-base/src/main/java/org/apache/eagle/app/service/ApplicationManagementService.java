/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.eagle.app.service;

import org.apache.eagle.metadata.exceptions.ApplicationWrongStatusException;
import org.apache.eagle.metadata.exceptions.EntityNotFoundException;
import org.apache.eagle.metadata.model.ApplicationEntity;

public interface ApplicationManagementService {
    /**
     * Install application.
     *
     * @param operation
     * @return
     */
    ApplicationEntity install(ApplicationOperations.InstallOperation operation) throws EntityNotFoundException;

    /**
     * Uninstall application.
     *
     * @param operation
     * @return
     */
    ApplicationEntity uninstall(ApplicationOperations.UninstallOperation operation) throws ApplicationWrongStatusException;

    /**
     * Start application.
     *
     * @param operation
     * @return
     */
    ApplicationEntity start(ApplicationOperations.StartOperation operation) throws ApplicationWrongStatusException;

    /**
     * Stop application.
     *
     * @param operation
     * @return
     */
    ApplicationEntity stop(ApplicationOperations.StopOperation operation) throws ApplicationWrongStatusException;

    /**
     * get application status.
     *
     * @param operation
     * @return
     */
    ApplicationEntity.Status getStatus(ApplicationOperations.CheckStatusOperation operation) throws EntityNotFoundException;

}