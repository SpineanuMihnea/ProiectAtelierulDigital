package TemplatePattern;


    public class VIP extends HotelOffers {

        String[] PoolAccess = {"between 8:00 and 20:30", "unlimited"};
        String[] Spa = {"sauna", "massage", "balneotherapy", "body treatments"};
        String[] Roomservice = {"breakfast", "lunch", "dinner", "snacks"};
        String[] KidsPlayground = {"for kids between 4 and 10 years"};

        public void PoolOptional() {

            System.out.print("Pool access: ");

            for (String pool : PoolAccess) {

                System.out.print(pool + " ");

            }
        }

        public void SpaOptional() {

            System.out.print("Spa access: ");

            for (String spa : Spa) {

                System.out.print(spa + " ");

            }

        }

        public void RoomserviceOptional() {

            System.out.print("Includes roomservice: ");

            for (String room : Roomservice) {

                System.out.print(room + " ");

            }

        }

        public void KidsPlaygroundOptional() {

            System.out.print("Includes kids playground: ");

            for (String kids : KidsPlayground) {

                System.out.print(kids + " ");

            }

        }
    }






