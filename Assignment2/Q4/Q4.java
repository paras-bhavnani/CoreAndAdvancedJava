class Q4{
        public static void main(String args[]){
            Message message = new Message();
            Thread t1 = new Thread(new Writer(message));
            Thread t2 = new Thread(new Reader(message));
            
            try{
                t1.start();
                t1.join();

                t2.start();
                //t2.join();
                
            }
            catch(Exception e){
                System.out.println(e);
            }
            
        }
}