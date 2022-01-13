From openjdk:8
copy ./target/ms-test-docker-0.0.1-SNAPSHOT.jar ms-test-docker-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","ms-test-docker-0.0.1-SNAPSHOT.jar"]