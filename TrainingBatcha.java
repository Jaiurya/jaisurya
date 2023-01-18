public class TrainingBatcha{

            int id ;
            String  name;
            int teamSize;
            String    teamLocation;
            boolean      isActive;
            String      status;
            String     description ;
            long     mobileNo;


public TrainingBatcha(int id, String name){

this.id=id;
this.name=name;

}

 public String toString(){
return "id: "+id  + "   name: "+name;
}


        public static void main(String[] args) {

     TrainingBatcha  batch = new TrainingBatcha(1, "jaisruya");

System.out.println(batch);
   }
}
        /*public static void main(String[] args) {

               TrainingBatcha  batch1 = new TrainingBatcha();
                TrainingBatcha  batch2 = new TrainingBatcha();
                TrainingBatcha  batch3 = new TrainingBatcha();
 
            
 

             batch1.id = 1;
           batch1.name="surya";
            batch1.teamSize=6;
            batch1.teamLocation="nandyal";
            batch1.isActive=true;
            batch1.status="active";
            batch1.description = "developer";
            batch1.mobileNo = 7410852096l;

 

           batch2.id = 2;
           batch2.name="Chandu";
            batch2.teamSize=5;
            batch2.teamLocation="Allagdda";
            batch2.isActive=true;
            batch2.status="active";
            batch2.description = "developer";
            batch2.mobileNo = 9630258741l;

 


             batch3.id =3;
           batch3.name="Bhumi";
            batch3.teamSize=6;
            batch3.teamLocation="Allagdda";
            batch3.isActive=true;
            batch3.status="active";
            batch3.description = "developer";
            batch3.mobileNo = 9985632147l;

 

 

   
System.out.println(batch1.id+"  "+batch1.name+"  "+batch1.teamSize+"  "+batch1.teamLocation+"  "+batch1.isActive+"  "+batch1.status+"  "+batch1.description);
System.out.println(batch2.id+"  "+batch2.name+"  "+batch2.teamSize+"  "+batch2.teamLocation+"  "+batch2.isActive+"  "+batch2.status+"  "+batch2.description);
System.out.println(batch3.id+"  "+batch3.name+"  "+batch3.teamSize+"  "+batch3.teamLocation+"  "+batch3.isActive+"  "+batch3.status+"  "+batch3.description);

 

        }
}*/