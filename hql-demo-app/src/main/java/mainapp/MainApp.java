package mainapp;

import util.HQL_Operations;
import util.HibernateUtil;

public class MainApp {
    public static void main(String[] args) {
        HQL_Operations hql_Operations = new HQL_Operations();
//        hql_Operations.insertRecords();
//        hql_Operations.fetchAllStudents();
//        hql_Operations.fetchUnique();
//        hql_Operations.fetchWithAND_clause();
//        hql_Operations.fetchUsing_OR_clause();
//        hql_Operations.deleteUsingHQL();
//        hql_Operations.updateUser();

        hql_Operations.closeChannels();
    }
}
