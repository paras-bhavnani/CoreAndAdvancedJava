class Message{
    String text;
    boolean isEmpty = true;

    synchronized String read(){
        while(!this.isEmpty){
            System.out.println("Inside Message file invoking Read function ");
            this.isEmpty = true;
        }
        return this.text;
    }

    synchronized void write( String message ){
        while(this.isEmpty){
            System.out.println("Inside Message file invoking Write function ");
            this.isEmpty = false;
        }
        this.text = message;
    }
}

class Writer extends Thread{
    private Message message;

    Writer(Message message){
        this.message = message;
    }
    @Override
    public void run(){
        String msg = "Java Script Assignment 2 Question 4";

        try{
            message.write(msg);
            Thread.sleep(2000);
            System.out.println("Written "+this.message.text);
        }
        catch(Exception e){

            System.out.println(e);
        }
        System.out.println("Writing is done");
    }
}

class Reader extends Thread{
    private Message message;

    Reader(Message message){
        this.message = message;
    }
    @Override
    public void run(){
       try{
            this.message.text = message.read();
            Thread.sleep(2000);
            System.out.println("Read "+this.message.text);
        }
        catch(Exception e){

            System.out.println(e);
        }
        System.out.println("Reading is done");
    }
}