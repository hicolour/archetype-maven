com.github.hicolour.archetype
=============================

This repository contains maven [archehtypes] (http://maven.apache.org/guides/introduction/introduction-to-archetypes.html)
i.e. templates, for creating new projects.

The archetypes currently available are:

    java:  java, junit, mockito, hamcrest

Usage
=====

\# Checkout project<br/>
$ git clone git@github.com:hicolour/com.github.hicolour.archetype.git

\# Change into project directory<br/>
$ cd com.github.hicolour.archetype

\# Build archetypes and install into the local maven repository<br/>
$ mvn install

\# Check that the archetypes have been added to the local archetype catalogue (which resides in your .m2 directory)<br/>
$ cat ~/.m2/archetype-catalog.xml

\# Create a new project using the archetype (follow the prompts)<br/>
$ mvn archetype:generate -DarchetypeCatalog=local


