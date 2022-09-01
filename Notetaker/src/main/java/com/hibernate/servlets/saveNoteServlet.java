package com.hibernate.servlets;

import com.hibernate.entities.Note;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/saveNoteServlet")//(name = "saveNoteServlet", urlPatterns ={"/saveNoteServlet"} )
public class saveNoteServlet extends HttpServlet {
    //PrintWriter printWriter;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //printWriter = response.getWriter();
        try {

            String title = request.getParameter("title");
            String content = request.getParameter("content");
            //printWriter.println(title + " " + content);
            Note note = new Note();
            note.setTitle(title);
            note.setContent(content);
            note.setAddedDate(new Date());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
