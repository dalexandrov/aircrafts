# Helidon SE Aircrafts app

Minimal Helidon SE project demonstrating the newest Java 17 features

## Build and run

With JDK17+
```bash
mvn package
java -jar --enable-preview target/aircrafts.jar 
```

## Exercise the application

```
curl -X GET  http://localhost:8080/aircraft/LZ-001
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