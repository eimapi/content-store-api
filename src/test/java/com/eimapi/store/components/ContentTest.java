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

import com.eimapi.store.base.ContentForTest;
import com.eimapi.store.base.SpaceStoreForTest;
import com.eimapi.store.exception.ContentStoreException;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;

/**
 * Test case for {@link Content} abstract class
 *
 * @version 0.0.1
 * @since 0.0.1
 */
public class ContentTest {
    private ContentForTest<SpaceStoreForTest> content;
    private SpaceStoreForTest ss;

    @Before
    public void setUp() throws Exception {
        this.ss = new SpaceStoreForTest("./base", "base-test-uuid", "test");
        this.content = new ContentForTest<SpaceStoreForTest>(ss, "uuid-base-cc", "/tmp");
    }

    @Test
    public void ContentTestBuilder() throws Exception {
        ContentForTest content = new ContentForTest(this.ss);

        Assert.assertNotNull(content);
    }

    @Test(expected = ContentStoreException.class)
    public void ContentTestBuilderError() throws Exception {
        ContentForTest content = new ContentForTest(null);
    }

    @Test
    public void getUuid() throws Exception {
        Assert.assertNotNull(this.content.getUuid());
        Assert.assertEquals(this.content.getUuid(), "uuid-base-cc");
    }

    @Test
    public void setUuid() throws Exception {
        this.content.setUuid("test-case");

        Assert.assertNotNull(this.content.getUuid());
        Assert.assertEquals(this.content.getUuid(), "test-case");
    }

    @Test(expected = ContentStoreException.class)
    public void setUuidError() throws Exception {
        this.content.setUuid(null);
    }

    @Test(expected = ContentStoreException.class)
    public void setUuidErrorEmpty() throws Exception {
        this.content.setUuid("   ");
    }

    @Test
    public void getBase() throws Exception {
        Assert.assertNotNull(this.content.getBase());
        Assert.assertEquals(this.content.getBase(), "/tmp");
    }

    @Test
    public void setBase() throws Exception {
        this.content.setBase("/opt");

        Assert.assertNotNull(this.content.getBase());
        Assert.assertEquals(this.content.getBase(), "/opt");
    }

    @Test(expected = ContentStoreException.class)
    public void setBaseError() throws Exception {
        this.content.setBase(null);
    }

    @Test(expected = ContentStoreException.class)
    public void setBaseErrorEmpty() throws Exception {
        this.content.setBase("    ");
    }

    @Test
    public void getSpaceStore() throws Exception {
        Assert.assertNotNull(this.content.getSpaceStore());
        Assert.assertEquals(this.content.getSpaceStore(), this.ss);
    }

    @Test
    public void setSpaceStore() throws Exception {
        SpaceStoreForTest forTest = new SpaceStoreForTest("/base", "uuid", "name");
        this.content.setSpaceStore(forTest);

        Assert.assertNotNull(this.content.getSpaceStore());
        Assert.assertEquals(this.content.getSpaceStore(), forTest);
    }

    @Test(expected = NotImplementedException.class)
    public void write() throws Exception {
        this.content.write(new ByteArrayOutputStream());
    }

    @Test(expected = NotImplementedException.class)
    public void read() throws Exception {
        this.content.read();
    }
}