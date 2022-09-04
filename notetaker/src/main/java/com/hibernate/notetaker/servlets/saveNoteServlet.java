package com.hibernate.notetaker.servlets;

import com.hibernate.notetaker.dao.DBOPs;
import com.hibernate.notetaker.entities.Note;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "saveNoteServlet", urlPatterns = {"/saveNoteServlet"})
public class saveNoteServlet extends HttpServlet {
    PrintWriter printWriter;
    DBOPs dboPs = new DBOPs();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        printWriter = response.getWriter();
        try {

            String title = request.getParameter("title").trim();
            String content = request.getParameter("content").trim();
            Note note = new Note();
            note.setTitle(title);
            note.setContent(content);
            note.setAddedDate(new Date());
            dboPs.save(note);
            response.sendRedirect("all_notes.jsp");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
