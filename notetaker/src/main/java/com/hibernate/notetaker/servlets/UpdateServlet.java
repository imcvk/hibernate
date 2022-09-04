package com.hibernate.notetaker.servlets;

import com.hibernate.notetaker.dao.DBOPs;
import com.hibernate.notetaker.entities.Note;
import com.hibernate.notetaker.util.HibernateUtil;
import org.hibernate.Session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Date;

@WebServlet(name = "UpdateServlet", value = "/UpdateServlet")
public class UpdateServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("noteId"));
        String title = request.getParameter("title").trim();
        String content = request.getParameter("content").trim();
        Note note = new Note();
        note.setTitle(title);
        note.setContent(content);
        note.setAddedDate(new Date());
        note.setId(id);
        DBOPs dboPs = new DBOPs();
        Session session = HibernateUtil.getSessionFactory().openSession();
        dboPs.updateNote(note, session);

        response.sendRedirect("all_notes.jsp");
    }
}
