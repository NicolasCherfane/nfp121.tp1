package question3;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main

{
    public static void main(String args[]){
        AuditeurCNAM a1=new AuditeurCNAM("Nicolas","Cherfane", "03-1234");
        AuditeurCNAM a2=new AuditeurCNAM("M@ria","haddad", "12345");
        AuditeurCNAM a3=new AuditeurCNAM("Piérre","Cherfane", "54321");
        
        
        System.out.println(a1.nom());
        System.out.println(a1.prenom());
        System.out.println(a1.toString());    
        System.out.println(a1.login());
        
        System.out.println(a2.nom());
        System.out.println(a2.prenom());
        System.out.println(a2.toString());
        System.out.println(a2.login());
        
        System.out.println(a3.nom());
        System.out.println(a3.prenom());
        System.out.println(a3.toString());
        System.out.println(a3.login()); 
        
        AuditeurCNAM a4=new AuditeurCNAM("äçc$sé","chloé", "12345");
        
        System.out.println(a4.nom());
        System.out.println( a4.prenom());
        System.out.println( a4.matricule());
        System.out.println( a4.login());
    }
}
