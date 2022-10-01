public class Main {
        public static void main (String[] args){


        int clientOS = 1;
                 if(clientOS==1)
        {
                System.out.println("Установите версию IOS по ссылке");
        }
                 else

        {       System.out.println("Установите версию Amdroid по ссылке ");

        }
        // задача 2
                int clientDeviceYear = 2019;
                 if (clientDeviceYear<=2015 && clientOS ==1){
                         System.out.println("Установи облегченную версию для IOS");
                 }else if (clientDeviceYear>2015 && clientOS==1) {
                         System.out.println("Установите приложение для IOS");
                } else if (clientDeviceYear<=2015&&clientOS!=1){
                     System.out.println("Установи облегченную версию для Android");
                 } else {System.out.println("Установите приложение для Android");}
        // задача 3


                int year = 2020;
                 switch (year){
                     case 2017:
                         System.out.println("Год не является високосным");
                         break;
                     case 2018:
                         System.out.println("Год является високосным");
                         break;
                     default:
                         System.out.println("Больше годов нет");
                 }
                 //задача 4

            int deliveryDistance = 4;
            int daysToDelivery;
            if (deliveryDistance <=20){
                System.out.println("Потребуется день для доставки");
            } else if (deliveryDistance>20 && deliveryDistance<60){
                System.out.println("Потребуется два дня на доставку");
            } else if (deliveryDistance>60 && deliveryDistance<100) {
                System.out.println("Потребуется 3 дня на доставку");
            }


// задача 5

            int monthNumber = 3;
            switch (monthNumber){
                case 1:
                case 2:
                case 3:
                    System.out.println("Зима");
                    break;
                case 4:
                case 5:
                case 6:
                    System.out.println("весна");
                    break;
                case 7:
                case 8:
                case 9:
                    System.out.println("Лето");
                    break;
                case 10:
                case 11:
                case 12:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Больше времен года нет");
            }

        }







        }


