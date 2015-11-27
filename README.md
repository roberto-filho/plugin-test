# tycho-plugin-test
Testing tychos testing capabilities.
Works like a charm

Use a fragment project to code the tests and add packaging type eclipse-test-plugin to the pom.

Tycho runs tests only during the integration-test phase, so if you run ```mvn compile``` the tests won't be run.
### Run ```mvn verify``` to make tycho run the tests.
