package hql_crud_operations.mainapp;

import hql_crud_operations.hql_operations.HqlCrudOperations;

public class MainApp {
    public static void main(String[] args) {
        HqlCrudOperations hqlCrud_Operations = new HqlCrudOperations();
        //       hqlCrud_Operations.insertRecords();
//        hqlCrud_Operations.fetchAllStudents();
//        hqlCrud_Operations.fetchUnique();
//        hqlCrud_Operations.fetchWithAND_clause();
//        hqlCrud_Operations.fetchUsing_OR_clause();
//        hqlCrud_Operations.deleteUsingHQL();
//        hqlCrud_Operations.updateUser();
        hqlCrud_Operations.hqlPagination();
    }
}
