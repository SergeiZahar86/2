package _Java8._Глава_28_параллелизм._10;
// A simple lock example.
import java.util.concurrent.locks.*;
class LockDemo {
    public static void main (String[] args) {
        ReentrantLock lock = new ReentrantLock();
        new Thread(new LockThread(lock, "A")).start();
        new Thread(new LockThread(lock, "B")).start();
    }
}
// A shared resource.Общий ресурс
class Shared {
    static int count = 0;
}
// A thread of execution that increments count.
// Поток исполнения, инкрементирующий значение счетчика
class LockThread implements Runnable {
    String name;
    ReentrantLock lock;
    LockThread (ReentrantLock lk, String n) {
        lock = lk;
        name = n;
    }
    public void run () {
        System.out.println("Starting " + name);
        try {
            // First, lock count.сначала заблокировать счетчик
            System.out.println(name + " is waiting to lock count." +
                    " ожидает блокировки счетчика");
            lock.lock();
            System.out.println(name + " is locking count.");
            Shared.count++;
            System.out.println(name + ": " + Shared.count);
            // Now, allow a context switch -- if possible.
            // а теперь переключить контекст, если это возможно
            System.out.println(name + " is sleeping.");
            Thread.sleep(1000);
        } catch (InterruptedException exc) {
            System.out.println(exc);
        } finally {
            // Unlock снять блокировку
            System.out.println(name + " is unlocking count." +
                    "разблокирует счетчик");
            lock.unlock();
        }
    }
}
