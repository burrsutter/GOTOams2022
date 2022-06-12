package org.jboss.as.quickstarts.helloworld;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/stuff")
public class Stuff extends HttpServlet {

    private String from = "Java Servlet WAR";

    private String HOSTNAME =
       System.getenv().getOrDefault("HOSTNAME", "unknown");

    private int count = 0; // simple counter to see lifecycle

    String greeting;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
        PrintWriter writer = resp.getWriter();
        greeting = System.getenv().getOrDefault("GREETING","Bonjour");
        count++;
        if (HOSTNAME.equals("unknown")) {
            HOSTNAME = req.getRequestURL().toString();
        }
        String result = greeting + " from " + from + " on " + HOSTNAME + ":" + count;
        System.out.println(result);

        writer.println(result);

        writer.close();
    }
}