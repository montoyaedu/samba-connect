samba-connect
=============

run integration tests
=====================

`````
./gradlew integTest -Pshare.user='your user' -Pshare.password='your password' -Pshare.url="smb://your server/your share/"
`````

publish to sonarqube
====================

`````
./gradlew clean integTest sonarqube -Pshare.user='your user' -Pshare.password='your password' -Pshare.url="smb://your server/your share/" -Dsonar.host.url=http://sonar.ethiclab.it -Dsonar.junit.reportsPath=build/test-results/integTest -Dsonar.tests=src/integTest -Dsonar.jacoco.reportPath=build/jacoco/integTest.exec
`````
