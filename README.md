# Content Store API

This is an generic API to work with content store in the **EIMAPI** project. Case you want to create a new persistence method to **EIMAPI** you neeed to create a new java project and implement the interfaces provided by this API following the guide bellow.

 1. Create new [Maven](http://maven.apache.org) or [Gradle](https://gradle.org/) project
 2. Import this API as library
 
       **Gradle**
       
        compile group: 'com.eimapi', name: 'content-store-api', version: '0.0.1'
    
       **Maven**
             
        <dependency>
           <groupId>com.eimapi</groupId>
           <artifactId>content-store-api</artifactId>
           <version>0.0.1</version>
        </dependency>
 3. Extends the **Content.java** and **SpaceStore.java** classes
 4. Implement the **ContentService** and **SpaceStoreService** interfaces.
 
An implementation can be found at [content-store-fs-impl](https://github.com/eimapi/content-store-fs-impl/tree/master) project. This project implements this API, and use the file system to persist the content.