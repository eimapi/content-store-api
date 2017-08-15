# Content Store API

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/b53fda8864c8458b86047c14b809b8c7)](https://www.codacy.com/app/gsdenys/content-store-api?utm_source=github.com&utm_medium=referral&utm_content=eimapi/content-store-api&utm_campaign=badger)
[![Build Status](https://travis-ci.org/eimapi/content-store-api.svg?branch=master)](https://travis-ci.org/eimapi/content-store-api)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0) 
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.eimapi/content-store-api/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.github.eimapi/content-store-api)

This is an generic API to work with content store in the **EIMAPI** project. Case you want to create a new persistence method to **EIMAPI** you neeed to create a new java project and implement the interfaces provided by this API following the guide bellow.

 1. Create new [Maven](http://maven.apache.org) or [Gradle](https://gradle.org/) project
 2. Import this API as library
 
       **Gradle**
       
        compile group: 'io.github.eimapi', name: 'content-store-api', version: '0.0.1'
    
       **Maven**
             
        <dependency>
           <groupId>io.github.eimapi</groupId>
           <artifactId>content-store-api</artifactId>
           <version>0.0.1</version>
        </dependency>
 3. Extends the **Content.java** and **SpaceStore.java** classes
 4. Implement the **ContentService** and **SpaceStoreService** interfaces.
 
 
An implementation can be found at [content-store-fs-impl](https://github.com/eimapi/content-store-fs-impl/tree/master) project. This project implements this API, and use the file system to persist the content.
