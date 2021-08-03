FROM tomcat:latest
ADD target/first-app.war /usr/local/tomcat/webapps/
EXPOSE 8015
CMD ["catalina.sh", "run"]