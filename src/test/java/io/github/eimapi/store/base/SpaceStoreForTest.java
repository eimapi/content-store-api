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
package io.github.eimapi.store.base;

import io.github.eimapi.store.components.SpaceStore;
import io.github.eimapi.store.exception.ContentStoreException;

/**
 * Class extended from {@link SpaceStore} just for a test propose
 *
 * @version 0.0.1
 * @since 0.0.1
 */
public class SpaceStoreForTest extends SpaceStore {
    /**
     * default constructor
     *
     * @param base - the base for space store
     */
    public SpaceStoreForTest(String base) throws ContentStoreException {
        super(base);
    }

    /**
     * constructor
     *
     * @param base - the base for space store
     * @param uuid - the space store uuid
     */
    public SpaceStoreForTest(String base, String uuid) throws ContentStoreException {
        super(base, uuid);
    }
}
