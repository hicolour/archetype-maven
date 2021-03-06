archetype-maven
=============================

This repository contains maven [archehtypes] (http://maven.apache.org/guides/introduction/introduction-to-archetypes.html)
i.e. templates, for creating new projects.

The archetypes currently available are:

    archetype-maven-java7:  java, junit, mockito, hamcrest
    archetype-maven-java8:  java8, junit, mockito, hamcrest
    archetype-maven-scala:  scala, junit specs2, scalatest

Usage
=====

Checkout project

    git clone git@github.com:hicolour/archetype-maven.git

Change into project directory

    cd archetype-maven

Build archetypes and install into the local maven repository

    mvn install

Check that the archetypes have been added to the local archetype catalogue (which resides in your .m2 directory)

    cat ~/.m2/archetype-catalog.xml

Create a new project using the archetype (follow the prompts)

    mvn archetype:generate -DarchetypeCatalog=local


