FROM adeo-docker-public.jfrog.io/dockerfiles-collection/maven:3.6.0-jdk-8-alpine
# Define var ENV
ENV APP_OAP oap--core-arty-ws.jar
ENV APP_USER 2000
# Get the executable jar
COPY oap--core-arty-ws/target/oap--core-arty-ws-*.jar /${APP_OAP}
# Get the cacerts for the jvm. Allow to communicate with others API
COPY oap--core-arty-ws/config/cacerts /cacerts
# Get the wrapper to launch the application
COPY oap--core-arty-ws/config/wrapper.sh /wrapper.sh
# Set rights
RUN chown ${APP_USER}:${APP_USER} /${APP_OAP} /cacerts /wrapper.sh
RUN chmod +x /wrapper.sh
EXPOSE 8080 8081
USER ${APP_USER}
ENTRYPOINT ["/wrapper.sh"]
