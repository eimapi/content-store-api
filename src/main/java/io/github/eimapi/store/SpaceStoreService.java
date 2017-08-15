/*
 * Copyright 2017 eimapi.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.eimapi.store;

import io.github.eimapi.store.components.SpaceStore;
import io.github.eimapi.store.exception.ContentStoreException;

import java.util.List;
import java.util.Map;

/**
 * Interface that provide all methods to manage space stores.
 *
 * @version 0.0.1
 * @since 0.0.1
 */
public interface SpaceStoreService<T extends SpaceStore> {

    /**
     * Create a new {@link SpaceStore}
     *
     * @param name - the name of {@link SpaceStore}
     * @return T - the space store
     * @throws ContentStoreException - any exception
     */
    T createSpaceStore(String name) throws ContentStoreException;

    /**
     * Delete the {@link SpaceStore}.
     *
     * @param spaceStore - the space store to be deleted
     * @throws ContentStoreException - any exception
     */
    void deleteSpaceStore(T spaceStore) throws ContentStoreException;

    /**
     * Load {@link SpaceStore} based in their uuid
     *
     * @param params - the parameters to load a {@link SpaceStore}
     * @return T - the {@link SpaceStore}
     * @throws ContentStoreException - any exception
     */
    T loadSpaceStore(Map<String, String> params) throws ContentStoreException;

    /**
     * List all {@link SpaceStore} at the base referenced by parameter
     *
     * @param params - all parameters needed to list parametes
     * @return List - the list of {@link SpaceStore}
     * @throws ContentStoreException - any exception
     */
    List<T> listSpaceStore(Map<String, String> params) throws ContentStoreException;
}
