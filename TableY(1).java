package com.step.matiul.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = {"/testTable2"})
public class TableY extends HttpServlet {
    public static String str;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        str=req.getParameter("number");
        req.getSession().setAttribute("number", req.getParameter("number"));
        MultiplicationTable.getNumber(req,req.getParameter("number"));
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");// для того, чтобы читал любую кодировку
        resp.getWriter().println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <link rel=\"stylesheet\" href=\"/resource/Style.css\" type=\"text/css\"/>\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class=\"parallaks\">\n" +
                "    <div class=\"gupovka\">\n" +
                "        <div id=\"background\" class=\"nasloyene\">\n" +
                "            <div class=\"img1\"><img src=\"https://phonoteka.org/uploads/posts/2021-04/1618489210_2-phonoteka_org-p-dlinnii-fon-dlya-saita-2.jpg\"></div>\n" +
                "        </div>\n" +
                "        <h2 >Вы ввели число "+ req.getParameter("number")+" </h2>\n" +
                "<form action=\"/testTable3\" method=\"get\">\n"+

                "        \n" +
                "<p>\n"+
                "  <button type=\"submit\" value=\"Подтвердить\">Подтвердить</button>\n"+
                "</p>\n"+
                "</form>\n"+
                "    </div>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html");
    }
}
