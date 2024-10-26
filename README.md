1. Run the below in terminal to generate the classes:

```shell
./protoc_compiler.exe -I=proto --java_out=src/main/java/ proto/*.proto
```