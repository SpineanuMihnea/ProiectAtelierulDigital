package TemplatePattern;



    public abstract class HotelOffers {

        boolean afterFirstOption = false;

        final void makeRezervation(){

            rentRoom();

            if(customerWantsPoolOptional()){

                PoolOptional();

                afterFirstOption = true;

            }

            if(customerWantsSpaOptional()){

                if(afterFirstOption) { System.out.print("\n"); }

                SpaOptional();

                afterFirstOption = true;

            }

            if(customerWantsRoomserviceOptional()){

                if(afterFirstOption) { System.out.print("\n"); }

                RoomserviceOptional();

                afterFirstOption = true;

            }

            if(customerWantsKidsPlaygroundOptional()){

                if(afterFirstOption) { System.out.print("\n"); }

                KidsPlaygroundOptional();

                afterFirstOption = true;

            }

            makeDeal();

        }



        abstract void PoolOptional();
        abstract void SpaOptional();
        abstract void RoomserviceOptional();
        abstract void KidsPlaygroundOptional();

        public void rentRoom(){

            System.out.println("Offers are listed to the customer");

        }

        boolean customerWantsPoolOptional() { return true; }
        boolean customerWantsSpaOptional() { return true; }
        boolean customerWantsRoomserviceOptional() { return true; }
        boolean customerWantsKidsPlaygroundOptional() { return true; }

        public void makeDeal(){

            System.out.println("\n Rent the room");

        }

        public void afterFirstOption(){

            System.out.println("\n");

        }

    }

