import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class PasswordControlPanel {
    private static final String CORRECT_PASSWORD = "1234"; // 设置的正确密码
    private static final int MAX_ATTEMPTS = 3; // 最大错误次数
    private static final int LOCK_TIME = 120000; // 锁定时间（120秒）

    private int attemptCount = 0; // 当前错误次数
    private boolean isLocked = false; // 是否锁定
    private long lockEndTime = 0; // 锁定结束时间戳

    public static void main(String[] args) {
        PasswordControlPanel panel = new PasswordControlPanel();
        panel.start();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            if (isLocked) {
                long currentTime = System.currentTimeMillis();
                if (currentTime < lockEndTime) {
                    System.out.println("控制面板已锁定，请等待...");
                    continue;
                } else {
                    isLocked = false;
                    attemptCount = 0;
                    System.out.println("控制面板已解锁，可以重新输入密码。");
                }
            }

            System.out.print("请输入密码: ");
            String inputPassword = scanner.nextLine();

            if (validatePassword(inputPassword)) {
                System.out.println("密码正确，进入系统功能选择状态。");
                break;
            } else {
                attemptCount++;
                System.out.println("密码错误！错误次数: " + attemptCount);

                if (attemptCount >= MAX_ATTEMPTS) {
                    lockPanel();
                }
            }
        }
        
        scanner.close();
    }

    private boolean validatePassword(String inputPassword) {
        return CORRECT_PASSWORD.equals(inputPassword);
    }

    private void lockPanel() {
        isLocked = true;
        lockEndTime = System.currentTimeMillis() + LOCK_TIME;
        System.out.println("密码错误3次，控制面板已锁定120秒。");
        
        // 使用Timer实现锁定计时
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                isLocked = false;
                attemptCount = 0;
                System.out.println("控制面板已解锁，可以重新输入密码。");
            }
        }, LOCK_TIME);
    }
}
