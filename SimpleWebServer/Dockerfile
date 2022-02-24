FROM openjdk:11
WORKDIR /usr/src/app
COPY . /usr/src/app
RUN apt-get install maven
CMD ["mvn", "springBoot:run"]