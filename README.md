samba-connect
=============

run integration tests
=====================

`````
./gradlew integTest
`````

publish to sonarqube
====================

`````
./gradlew clean integTest sonarqube -Dsonar.host.url=http://sonar.ethiclab.it -Dsonar.junit.reportsPath=build/test-results/integTest -Dsonar.tests=src/integTest -Dsonar.jacoco.reportPath=build/jacoco/integTest.exec
`````
