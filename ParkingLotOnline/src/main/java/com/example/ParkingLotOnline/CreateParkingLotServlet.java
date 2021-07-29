package com.example.ParkingLotOnline;

import ParkingLot.ParkingLot;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "createParkingLot", value = "/createParking")
public class CreateParkingLotServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "This is ParkingLot Creating Page";
    }


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        ParkingLot parkingLot = new ParkingLot(3,30);
        String summary = parkingLot.summary();
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<p>" + summary + "<p>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}