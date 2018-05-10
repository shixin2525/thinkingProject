package createType.factory;

/**
 * Created by LSX on 2018/5/10.
 */

public class DataAccess {

 public static IUser createUser(String dbName){
       switch (dbName){
           case "SqlserverUser":
               return new SqlserverUser();
           case "AccessUser":
              return  new AccessUser();
       }
       return  null;
 }

 public static IDepartment createDepartment(String dbName){

     switch (dbName){
         case "SqlserverDepartment":
             return new SqlserverDepartment();
         case "AccessDepartment":
             return  new AccessDepartment();
     }
     return  null;

 }

}
