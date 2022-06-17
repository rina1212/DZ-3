package com.step.matiul.servlet;

import org.jetbrains.annotations.NotNull;

import javax.servlet.http.HttpServletRequest;

import static java.lang.Integer.parseInt;

public class MultiplicationTable {
    public static void getNumber(HttpServletRequest request, String number) {
        request.getSession().setAttribute("number",number);

    }
    @NotNull
    public static String getMultiplicationTable(HttpServletRequest request, String number) {
        StringBuilder table=new StringBuilder("<div class=\"class\">");
        Integer a=parseInt(TableY.str);
        for (int i = a; i <= 10; i++) {
            table.append("<span type=\"1\">").append("<ol type=\"1\">");
                      for (int j = 1; j <= 10; j++) {
                String res1 =String.format("%4d * %4d =   %4d \t",i,j,i*j);
                table.append("<li>").append(res1).append("</li>\n");
            }
                      table.append("</ol>").append("</span>");
        }
        table.append("</div>\n");
        return table.toString();
    }




}

