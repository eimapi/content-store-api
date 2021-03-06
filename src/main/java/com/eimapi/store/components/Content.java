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
package com.eimapi.store.components;

import com.eimapi.store.bunddle.ContentStoreMessager;
import com.eimapi.store.exception.ContentStoreException;

import java.io.Serializable;

/**
 * Abstract class to be used as base to create a Content object implementation.
 *
 * @version 0.0.1
 * @since 0.0.1
 */
public abstract class Content<T extends SpaceStore> implements ContentOperations, Serializable {

    private static final long serialVersionUID = -8191495574858642382L;

    private String uuid;
    private String base;
    private T spaceStore;

    protected Content() {
    }

    /**
     * default constructor
     *
     * @param spaceStore - the content spaceStore
     * @throws ContentStoreException - any exception
     */
    protected Content(T spaceStore) throws ContentStoreException {
        this();
        this.setSpaceStore(spaceStore);
    }

    /**
     * constructor
     *
     * @param spaceStore - the content spaceStore
     * @param uuid       - the content uuid
     * @param base       - the content base
     * @throws ContentStoreException - any exception
     */
    protected Content(T spaceStore, String uuid, String base) throws ContentStoreException {
        this(spaceStore);
        this.setUuid(uuid);
        this.setBase(base);
    }

    /**
     * get the uuid
     *
     * @return String
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Set the UUID
     *
     * @param uuid - the uuid in a {@link String} format
     * @throws ContentStoreException - any exception
     */
    public void setUuid(String uuid) throws ContentStoreException {
        if (uuid == null || uuid.trim().isEmpty()) {
            throw new ContentStoreException(
                    ContentStoreMessager.getMessage("store.field.null", "uuid", Content.class.getSimpleName())
            );
        }

        this.uuid = uuid;
    }

    /**
     * Get the content base.
     *
     * @return String
     */
    public String getBase() {
        return base;
    }

    /**
     * Set the content base
     *
     * @param base - the base for content
     * @throws ContentStoreException - any exception
     */
    public void setBase(String base) throws ContentStoreException {
        if (base == null || base.trim().isEmpty()) {
            throw new ContentStoreException(
                    ContentStoreMessager.getMessage("store.field.null", "base", Content.class.getSimpleName())
            );
        }

        this.base = base;
    }

    /**
     * get the {@link SpaceStore}
     *
     * @return E - the space store element
     */
    public T getSpaceStore() {
        return spaceStore;
    }

    /**
     * set the {@link SpaceStore}
     *
     * @param spaceStore - the space store element
     * @throws ContentStoreException - any exception
     */
    public void setSpaceStore(T spaceStore) throws ContentStoreException {
        if (spaceStore == null) {
            throw new ContentStoreException(
                    ContentStoreMessager.getMessage("store.field.null", "spaceStore", Content.class.getSimpleName())
            );
        }

        this.spaceStore = spaceStore;
    }

    /**
     * @see Object#equals(Object)
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Content)) return false;

        Content<?> content = (Content<?>) o;

        if (uuid != null ? !uuid.equals(content.uuid) : content.uuid != null) return false;
        if (base != null ? !base.equals(content.base) : content.base != null) return false;
        return spaceStore != null ? spaceStore.equals(content.spaceStore) : content.spaceStore == null;
    }

    /**
     * @see Object#hashCode()
     */
    @Override
    public int hashCode() {
        int result = uuid != null ? uuid.hashCode() : 0;
        result = 31 * result + (base != null ? base.hashCode() : 0);
        result = 31 * result + (spaceStore != null ? spaceStore.hashCode() : 0);
        return result;
    }
}
