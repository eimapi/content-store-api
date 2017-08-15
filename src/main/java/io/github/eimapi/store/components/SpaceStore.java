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
package io.github.eimapi.store.components;

import io.github.eimapi.store.exception.ContentStoreException;

import java.io.Serializable;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Abstract class to be used as base to create a SpaceStore object implementation.
 *
 * @version 0.0.1
 * @since 0.0.1
 */
public abstract class SpaceStore implements Serializable {

    private static final long serialVersionUID = 2797798527651509363L;

    private String uuid;
    private String base;

    private ResourceBundle bundle;

    /**
     * private constructor
     */
    protected SpaceStore() {
        this.bundle = ResourceBundle.getBundle("content-store", Locale.getDefault());
    }

    /**
     * default constructor
     *
     * @param base - the base for space store
     * @throws ContentStoreException - any exception
     */
    protected SpaceStore(String base) throws ContentStoreException {
        this();
        this.setBase(base);
    }

    /**
     * constructor
     *
     * @param base - the base for space store
     * @param uuid - the space store uuid
     * @throws ContentStoreException - any exception
     */
    protected SpaceStore(String base, String uuid) throws ContentStoreException {
        this(base);
        this.setUuid(uuid);
    }

    /**
     * get the space store uuid
     *
     * @return String - the UUID in a {@link String} format
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Set the space store uuid
     *
     * @param uuid - the uuid in a {@link String} format
     * @throws ContentStoreException - any exception
     */
    public void setUuid(String uuid) throws ContentStoreException {
        if (uuid == null || uuid.trim().isEmpty()) {
            throw new ContentStoreException(
                    this.getMessage("store.field.null", "uuid", SpaceStore.class.getSimpleName())
            );
        }

        this.uuid = uuid;
    }

    /**
     * get the store base
     *
     * @return String - the store base
     */
    public String getBase() {
        return base;
    }

    /**
     * set the store base
     *
     * @param base - the store base
     * @throws ContentStoreException - any exception
     */
    public void setBase(String base) throws ContentStoreException {
        if (base == null || base.trim().isEmpty()) {
            throw new ContentStoreException(
                    this.getMessage("store.field.null", "base", SpaceStore.class.getSimpleName())
            );
        }

        this.base = base;
    }

    /**
     * @see Object#equals(Object)
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SpaceStore)) return false;

        SpaceStore that = (SpaceStore) o;

        if (uuid != null ? !uuid.equals(that.uuid) : that.uuid != null) return false;
        return base != null ? base.equals(that.base) : that.base == null;
    }

    /**
     * @see Object#hashCode()
     */
    @Override
    public int hashCode() {
        int result = uuid != null ? uuid.hashCode() : 0;
        result = 31 * result + (base != null ? base.hashCode() : 0);
        return result;
    }

    /**
     * Message Bundle method
     *
     * @param key   - the key for message bundle
     * @param param - the parameter array
     * @return String - the message
     */
    private String getMessage(String key, Object... param) {
        return MessageFormat.format(this.bundle.getString(key), param);
    }
}