# Spring-based WebSocket Chat Server

Demonstrates Spring WebSocket Server. Sample code based off of [Spring
Guide](https://spring.io/guides/gs/messaging-stomp-websocket/) with a
few changes.

The package includes a Web client which can be used to exercise the
functionality.

Build the software as follows:

    mvn clean package

Run it as follows, changing the port to 9090:

    java -Dserver.port=9090 -jar target/chat-server-0.1.0.jar

Connect to the web client at: http:://<hostname>:9090/.

For a demo Spring Java Client, see
[https://github.com/jaysridhar/spring-websocket-client].
