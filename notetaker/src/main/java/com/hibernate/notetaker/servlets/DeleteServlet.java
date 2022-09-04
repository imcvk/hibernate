package com.hibernate.notetaker.servlets;

import com.hibernate.notetaker.dao.DBOPs;
import com.hibernate.notetaker.entities.Note;
import com.hibernate.notetaker.util.HibernateUtil;
import org.hibernate.Session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DeleteServlet", value = "/DeleteServlet")
public class DeleteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int id = Integer.parseInt(request.getParameter("note_id").trim());
            DBOPs dboPs = new DBOPs();
            Session session = HibernateUtil.getSessionFactory().openSession();
            Note note = session.get(Note.class, id);
            dboPs.deleteNote(note, session);
            response.sendRedirect("all_notes.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
