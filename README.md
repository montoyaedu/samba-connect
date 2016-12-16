samba-connect
=============

[![Build Status](https://travis-ci.org/montoyaedu/samba-connect.svg?branch=master)](https://travis-ci.org/montoyaedu/samba-connect)

[![codecov](https://codecov.io/gh/montoyaedu/samba-connect/branch/master/graph/badge.svg)](https://codecov.io/gh/montoyaedu/samba-connect)

run integration tests
=====================

`````
./gradlew test
`````

publish to sonarqube
====================

`````
./gradlew clean test sonarqube -Dsonar.host.url=http://sonar.ethiclab.it
`````
