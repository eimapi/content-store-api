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
package com.eimapi.store.base;

import com.eimapi.store.components.Content;
import com.eimapi.store.components.SpaceStore;
import com.eimapi.store.exception.ContentStoreException;
import org.apache.commons.io.FileUtils;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Class extended from {@link com.eimapi.store.components.Content} just for a test propose
 *
 * @since 0.0.1
 * @version 0.0.1
 */
public class ContentForTest<SpaceStoreForTest> extends Content {

    /**
     * default constructor
     *
     * @param spaceStore - the content spaceStore
     * @throws ContentStoreException
     */
    public ContentForTest(SpaceStore spaceStore) throws ContentStoreException {
        super(spaceStore);
    }

    /**
     * constructor
     *
     * @param spaceStore - the content spaceStore
     * @param uuid       - the content uuid
     * @param base       - the content base
     * @throws ContentStoreException
     */
    public ContentForTest(SpaceStore spaceStore, String uuid, String base) throws ContentStoreException {
        super(spaceStore, uuid, base);
    }

    /**
     * write a {@link ByteArrayInputStream} at a content file
     *
     * @param baos
     */
    @Override
    public void write(ByteArrayOutputStream baos) throws ContentStoreException {
        throw new NotImplementedException();
    }

    /**
     * Read content and return their data in byte array input stream
     *
     * @return ByteArrayInputStream
     */
    @Override
    public ByteArrayInputStream read() throws ContentStoreException {
        throw new NotImplementedException();
    }
}
