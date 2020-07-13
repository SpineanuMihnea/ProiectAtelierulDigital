package TemplatePattern;

    public class NormalGuest extends HotelOffers{

        String[] KidsPlayground = { "for kids between 4 and 10 years" };
        String[] PoolAccess = { "between 8:00 and 20:30", "unlimited" };

        boolean customerWantsSpaOptional() { return false; }
        boolean customerWantsRoomserviceOptional() { return false; }

        public void KidsPlaygroundOptional(){


                System.out.print("Includes kids playground: ");

                for (String kids : KidsPlayground){

                    System.out.print(kids + " ");

                }

        }

            public void PoolOptional(){

                System.out.print("Pool access: ");

                for (String pool : PoolAccess ){

                    System.out.print(pool + " ");

                }

            }

        void RoomserviceOptional() {}

        void SpaOptional() {}


    }

