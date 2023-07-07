package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;
import scala.collection.mutable.ListBuffer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.slf4j.LoggerFactory;
import org.apache.commons.lang3.StringUtils;
import com.google.common.base.Joiner;
import com.fasterxml.jackson.databind.ObjectMapper;
import graphql.schema.idl.*;
import org.xerial.snappy.Snappy;
import org.eclipse.jetty.server.Server;
import java.sql.*;
import javax.servlet.ServletException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

// MergeBase: Vulnerable Versions of Java Libraries for GRADLE
public class Main {


    public static void main(String[] args) throws ServletException, IOException {
        // Uses Log4j
        final Logger logger = LogManager.getLogger();
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warning message");
        logger.error("This is an error message");

        // Uses Apache Tomcat
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);

        Context context = tomcat.addContext("", null);
        Tomcat.addServlet(context, "helloServlet", new HelloServlet());
        context.addServletMappingDecoded("/", "helloServlet");

        // Uses Scala Library
        ListBuffer<Integer> list = new ListBuffer<>();
        list.$plus$eq(1);
        list.$plus$eq(2);
        list.$plus$eq(3);
        list.$plus$eq(4);
        list.$plus$eq(5);
        System.out.println(list.mkString(", "));

        // Uses Spring Framework

        try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(MyBean.class)) {
            MyBean myBean = appContext.getBean(MyBean.class);
            myBean.sayHello();
        }

        // Uses Apache Commons
        String input = "hello, world!";
        String capitalized = StringUtils.capitalize(input);
        System.out.println(capitalized);


        // Uses Google Guava
        List<String> words = Arrays.asList("Hello", "world", "Guava");
        String joinedString = Joiner.on(" ").join(words);
        System.out.println(joinedString);

        // Uses Jackson Databind
        ObjectMapper objectMapper = new ObjectMapper();

        Map<String, Object> personMap = new HashMap<>();
        personMap.put("name", "John Doe");
        personMap.put("age", 30);


        String json = objectMapper.writeValueAsString(personMap);

        // Uses GraphQL
        String schemaDefinition = "type Query { hello: String }";

        TypeDefinitionRegistry typeRegistry = new SchemaParser().parse(schemaDefinition);

        // Uses Snappy Java
        byte[] inputData = "Hello, Snappy!".getBytes();
        byte[] compressedData = Snappy.compress(inputData);
        byte[] decompressedData = Snappy.uncompress(compressedData);

        System.out.println("Original data: " + new String(inputData));
        System.out.println("Compressed data: " + new String(compressedData));
        System.out.println("Decompressed data: " + new String(decompressedData));
        // Uses Jetty
        Server server = new Server(8080);

        // Uses Oracle
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("Oracle JDBC driver loaded successfully.");

            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL");
            System.out.println("Connected to Oracle database!");

            // Perform database operations here

            connection.close();
            System.out.println("Connection closed.");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Failed to connect to Oracle database!");
            e.printStackTrace();
        }

        // Program also uses Apache Maven, Logback, Solon, Jenkins JUnit, GeoTools but usages omitted
    }


}