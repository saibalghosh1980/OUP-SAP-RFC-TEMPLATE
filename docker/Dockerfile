FROM saibalkumarghosh/ubuntu1404orajdk8latest:v1
EXPOSE 9191 
ADD SapRfcTemplate-0.0.1-SNAPSHOT.jar SapRfcTemplate-0.0.1-SNAPSHOT.jar
RUN mkdir -p /saplibs
ADD sapidoc3.jar /saplibs/sapidoc3.jar
ADD sapjco3.jar /saplibs/sapjco3.jar
ADD libsapjco3.so /saplibs/libsapjco3.so
ENTRYPOINT ["java","-Dloader.path=/saplibs/","-jar","/SapRfcTemplate-0.0.1-SNAPSHOT.jar"]