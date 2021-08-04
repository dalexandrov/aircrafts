# Helidon SE Bare

Minimal Helidon SE project demonstrating the newest Java 17 features

## Build and run

With JDK11+
```bash
mvn package
java -jar target/bare-se.jar
```

## Exercise the application

```
curl -X GET  http://localhost:8080/aircraft/LZ-001
{"message":"Hello World!"}
```

## Try health and metrics

```
curl -s -X GET http://localhost:8080/health
{"outcome":"UP",...
. . .

# Prometheus Format
curl -s -X GET http://localhost:8080/metrics
# TYPE base:gc_g1_young_generation_count gauge
. . .

# JSON Format
curl -H 'Accept: application/json' -X GET http://localhost:8080/metrics
{"base":...
. . .
```