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

import io.github.eimapi.store.base.SpaceStoreForTest;
import io.github.eimapi.store.exception.ContentStoreException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

/**
 * Test case for {@link SpaceStore} abstract class
 *
 * @version 0.0.1
 * @since 0.0.1
 */
public class SpaceStoreTest {
    private SpaceStoreForTest ssft;

    @Before
    public void setUp() throws Exception {
        this.ssft = new SpaceStoreForTest("/base", UUID.randomUUID().toString());
    }

    @Test
    public void constructorBase() throws Exception {
        SpaceStoreForTest ss = new SpaceStoreForTest("/base");

        Assert.assertNotNull(ss);
        Assert.assertNotNull(ss.getBase());
        Assert.assertFalse(ss.getBase().isEmpty());
    }

    @Test(expected = ContentStoreException.class)
    public void constructorBaseError() throws Exception {
        new SpaceStoreForTest(null);
    }

    @Test
    public void getUuid() throws Exception {
        Assert.assertNotNull(this.ssft.getUuid());
        Assert.assertFalse(this.ssft.getUuid().isEmpty());
    }

    @Test
    public void setUuid() throws Exception {
        this.ssft.setUuid("set-uuid");

        Assert.assertNotNull(this.ssft.getUuid());
        Assert.assertEquals(this.ssft.getUuid(), "set-uuid");
    }

    @Test(expected = ContentStoreException.class)
    public void setUuidError() throws Exception {
        this.ssft.setUuid(null);
    }

    @Test(expected = ContentStoreException.class)
    public void setUuidErrorEmpty() throws Exception {
        this.ssft.setUuid("   ");
    }

    @Test
    public void getBase() throws Exception {
        Assert.assertNotNull(this.ssft.getBase());
        Assert.assertFalse(this.ssft.getBase().isEmpty());
        Assert.assertEquals(this.ssft.getBase(), "/base");
    }

    @Test
    public void setBase() throws Exception {
        this.ssft.setBase("/opt");

        Assert.assertNotNull(this.ssft.getBase());
        Assert.assertEquals(this.ssft.getBase(), "/opt");
    }

    @Test(expected = ContentStoreException.class)
    public void setBaseError() throws Exception {
        this.ssft.setBase(null);
    }

    @Test(expected = ContentStoreException.class)
    public void setBaseErrorEmpty() throws Exception {
        this.ssft.setBase("     ");
    }
}
