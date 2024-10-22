package com.zahid.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import com.zahid.protobuf.proto.Student;
import com.zahid.protobuf.proto.Students;

import java.util.Arrays;

public class ProtobufApplication {

    public static void main(String[] args) throws InvalidProtocolBufferException {
        final Student zahid = Student.newBuilder().setName("Zahid").setAge(28).build();
        final Student arif = Student.newBuilder().setName("Arif").setAge(30).build();

        final Students students = Students.newBuilder().addStudent(zahid).addStudent(arif).build();

        final var byteArray = students.toByteArray();
        System.out.println("Serialization bytes : " + Arrays.toString(byteArray));

        System.out.println("Deserialization bytes: " + Students.parseFrom(byteArray));
    }
}
