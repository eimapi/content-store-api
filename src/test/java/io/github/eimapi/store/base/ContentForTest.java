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

import io.github.eimapi.store.components.Content;
import io.github.eimapi.store.components.SpaceStore;
import io.github.eimapi.store.exception.ContentStoreException;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * Class extended from {@link Content} just for a test propose
 *
 * @version 0.0.1
 * @since 0.0.1
 */
public class ContentForTest<SpaceStoreForTest extends SpaceStore> extends Content<SpaceStoreForTest> {

    /**
     * default constructor
     *
     * @param spaceStore - the content spaceStore
     * @throws ContentStoreException - if any errors occur
     */
    public ContentForTest(SpaceStoreForTest spaceStore) throws ContentStoreException {
        super(spaceStore);
    }

    /**
     * constructor
     *
     * @param spaceStore - the content spaceStore
     * @param uuid       - the content uuid
     * @param base       - the content base
     * @throws ContentStoreException - case any errors occur
     */
    public ContentForTest(SpaceStoreForTest spaceStore, String uuid, String base) throws ContentStoreException {
        super(spaceStore, uuid, base);
    }

    /**
     * write a {@link ByteArrayInputStream} at a content file
     *
     * @param baos -the byte array output stream to be writed
     */
    @Override
    public void write(ByteArrayOutputStream baos) throws ContentStoreException {
        throw new ContentStoreException();
    }

    /**
     * Read content and return their data in byte array input stream
     *
     * @return ByteArrayInputStream
     */
    @Override
    public ByteArrayInputStream read() throws ContentStoreException {
        throw new ContentStoreException();
    }
}
