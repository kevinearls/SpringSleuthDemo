# Spring Sleuth Example

Based on http://ryanjbaxter.com/cloud/spring%20cloud/spring/2016/07/07/spring-cloud-sleuth.html  This example can log
traces to either Zipkin or Jaeger

+ Start Zipkin: `docker run -d -p 9411:9411 openzipkin/zipkin`  OR Start Jaeger: `docker run -d -e COLLECTOR_ZIPKIN_HTTP_PORT=9411 -p5775:5775/udp -p6831:6831/udp -p6832:6832/udp -p5778:5778 -p16686:16686 -p14268:14268 -p9411:9411 jaegertracing/all-in-one:latest`
+ Run the example: `mvn clean install spring-boot:run`
+ `curl http://localhost:8080` or `curl http://localhost:8080/callHome` to generate traces
+ Open Zipkin in a browser by going to `http://localhost:9411` OR Open Jaeger at `http://localhost:16686`