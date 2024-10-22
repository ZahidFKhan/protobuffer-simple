1. Install the protoc first from here: https://github.com/protocolbuffers/protobuf/releases/tag/v28.2

2. Run the below in terminal to generate the classes:

```shell
    protoc -I=proto --java_out=src/main/java/ proto/Customer.proto
```