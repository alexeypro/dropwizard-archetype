dropwizard-archetype
====================

# Maven2 Archetype for Coda Hale&#39;s Dropwizard

$ mvn package

$ java -jar target/dropwizard-example-0.0.1-SNAPSHOT.jar server configs/hello-world.yml

$ open http://localhost:8080/hello-world/hi.json http://localhost:8080/hello-world/hi.json?name=Successful+Dropwizard+User

$ open http://localhost:8080/hello-world/hi.html http://localhost:8080/hello-world/hi.html?name=Successful+Dropwizard+User

$ open http://localhost:8081/ http://localhost:8081/metrics http://localhost:8081/threads http://localhost:8081/healthcheck

# If you need to create an archetype from it just do:

$ mvn archetype:create-from-project

$ cd target/generated-sources/archetype/

$ mvn install

$ cd ~/code/

$ mvn archetype:generate -DarchetypeGroupId=com.alexeypro.samples -DarchetypeArtifactId=dropwizard-example-archetype

All done. 
