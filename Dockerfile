FROM openjdk:8-jre-alpine

COPY target/oap--core-arty-ws-*.jar oap--core-arty-ws.jar
COPY src/main/docker/config/cacerts /cacerts
COPY src/main/docker/config/wrapper.sh /wrapper.sh

RUN chown 2000:2000 /oap--core-arty-ws.jar /cacerts /wrapper.sh
RUN chmod +x /wrapper.sh

EXPOSE 8080

USER 2000

ENTRYPOINT ["/wrapper.sh"]
