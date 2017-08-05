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
package com.eimapi.store;

import com.eimapi.store.components.SpaceStore;

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
     * @param name the name of {@link SpaceStore}
     * @return T - the space store
     */
    T createSpaceStore(String name);

    /**
     * Delete the {@link SpaceStore}.
     *
     * @param spaceStore - the space store to be deleted
     */
    void deleteSpaceStore(T spaceStore);

    /**
     * Load {@link SpaceStore} based in their uuid
     *
     * @param uuid - the {@link SpaceStore} uuid
     * @return T - the SpaceStore
     */
    T loadSpaceStore(String uuid);
}
