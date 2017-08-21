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

import com.eimapi.store.components.Content;
import com.eimapi.store.components.SpaceStore;
import com.eimapi.store.exception.ContentStoreException;


/**
 * Interface to provide all methods to manage the content.
 * <p>
 * These methods do not organize the content in a data structure. The main function
 * of this interface is provide methods to create remove and read content. To read
 * the content is necessary that user has all information about content that want to
 * be read.
 *
 * @version 0.0.1
 * @since 0.0.1
 */
public interface ContentService<T extends Content, E extends SpaceStore> {

    /**
     * Create a new content in a provided space store
     *
     * @param spaceStore - the space store that will receive the content
     * @return T - the created content
     * @throws ContentStoreException - any exception
     */
    T createNewContent(E spaceStore) throws ContentStoreException;

    /**
     * Delete the provided content inside space store (also provided)
     *
     * @param spaceStore - the space store that contain content
     * @param content    - the content that will be deleted
     * @throws ContentStoreException - any exception
     */
    void deleteContent(E spaceStore, T content) throws ContentStoreException;

    /**
     * Create a new version of content.
     *
     * @param spaceStore   - the space store that will receive the content new version
     * @param contentBase  - the content that will be versioned
     * @param versionLabel - the new version label
     * @return T - the new version of content
     * @throws ContentStoreException - any exception
     */
    T createNewVersion(E spaceStore, T contentBase, String versionLabel) throws ContentStoreException;

    /**
     * Recovery the version content
     *
     * @param spaceStore   - the space store that will receive the recovered content
     * @param contentBase  - the content that will be recovered
     * @param versionLabel - the new version label
     * @return T - the recovered content
     * @throws ContentStoreException - any exception
     */
    T recoveryVersion(E spaceStore, T contentBase, String versionLabel) throws ContentStoreException;
}
