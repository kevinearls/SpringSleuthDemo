# Spring Sleuth Example

Based on http://ryanjbaxter.com/cloud/spring%20cloud/spring/2016/07/07/spring-cloud-sleuth.html

+ Start Zipkin: `docker run -d -p 9411:9411 openzipkin/zipkin`
+ Run the example: `mvn clean install spring-boot:run`
+ `curl http://localhost:8080` or `curl http://localhost:8080/callHome` to generate spans
+ Open Zipkin in a browser by going to `http://localhost:9411`