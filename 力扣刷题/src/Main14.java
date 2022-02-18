import com.sun.xml.internal.ws.wsdl.writer.document.Types;

/**
 * @author LiFang
 * @version 1.0
 * @since 2022/2/13 20:53
 */
public class Main14 implements Runnable{

    public int count = 0;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            count++;
        }
    }

    void app(){
        for (int i = 0; i < 10; i++) {
            count++;
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Main14 m1 = new Main14();
        new Thread("Main14"){
        }.start();

//        Class<?> aClass = Class.forName("Main14");
//        Object o = aClass.newInstance();
//        System.out.println(Main14.class.isInstance());
        m1.app();
        System.out.println(m1.count);
    }
}
//class Runner1 implements Runnable{
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            count++;
//        }
//    }
//}
