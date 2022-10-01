public class Main {
        public static void main (String[] args){


        boolean clientOS = false;
                 if(clientOS)
        {
                System.out.println("Установите версию IOS по ссылке");
        }
                 else

        {       System.out.println("Установите версию Amdroid по ссылке ");

        }
        // задача 2
                int clientDeviceYear = 2014;
                 if (clientDeviceYear<=2015 && clientOS){
                         System.out.println("Установи облегченную версию для IOS");
                 }else if (clientDeviceYear>2015 && clientOS) {
                         System.out.println("Установите приложение для IOS");
                } else if (clientDeviceYear<=2015&&clientOS==false){
                     System.out.println("Установи облегченную версию для Android");
                 } else {System.out.println("Установите приложение для Android");}





        }







        }


