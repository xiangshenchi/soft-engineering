

public class WaterHeater {
    // 定义状态枚举
    enum State {
        SLEEP, HEATING_CONTROL, HEATING, WAITING, NO_WATER, REPAIR
    }

    private State currentState = State.SLEEP;
    private double temperature = 20.0; // 当前水温
    private boolean hasWater = true; // 水箱是否有水
    private boolean damaged = false; // 水箱是否损坏
    private int hour = 7; // 当前时间（假设以小时为单位）

    // 状态机逻辑
    public void updateState() {
        switch (currentState) {
            case SLEEP:
                if (hour == 7) {
                    currentState = State.HEATING_CONTROL;
                    System.out.println("早上7点，进入恒温控制状态");
                }
                break;

            case HEATING_CONTROL:
                if (!hasWater) {
                    currentState = State.NO_WATER;
                    System.out.println("水箱无水，进入缺水状态");
                } else if (temperature < 20) {
                    currentState = State.HEATING;
                    System.out.println("温度低于20度，开始加热");
                } else {
                    currentState = State.WAITING;
                    System.out.println("温度足够，进入待机状态");
                }
                break;

            case HEATING:
                if (temperature >= 100) {
                    currentState = State.WAITING;
                    System.out.println("温度达到100度，停止加热，进入待机状态");
                } else if (!hasWater) {
                    currentState = State.NO_WATER;
                    System.out.println("加热中无水，进入缺水状态");
                }
                break;

            case WAITING:
                if (hour == 23) {
                    currentState = State.SLEEP;
                    System.out.println("晚上11点，进入休眠状态");
                } else if (temperature < 20 && hasWater) {
                    currentState = State.HEATING;
                    System.out.println("温度低于20度，恢复加热");
                }
                break;

            case NO_WATER:
                if (damaged) {
                    currentState = State.REPAIR;
                    System.out.println("水箱损坏，进入维修状态");
                } else if (hasWater) {
                    currentState = State.HEATING_CONTROL;
                    System.out.println("注水完成，恢复恒温控制");
                }
                break;

            case REPAIR:
                if (!damaged) {
                    currentState = State.HEATING_CONTROL;
                    System.out.println("维修完成，恢复恒温控制");
                }
                break;
        }
    }

    // 模拟加热
    public void heatWater() {
        if (currentState == State.HEATING && hasWater) {
            temperature += 5; // 假设每次加热提升5度
            System.out.println("加热中，当前温度: " + temperature + "度");
        }
    }

    // 设置水箱状态
    public void setWater(boolean hasWater) {
        this.hasWater = hasWater;
    }
    public void setDamaged(boolean damaged) {
        this.damaged = damaged;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    public static void main(String[] args) {
        WaterHeater heater = new WaterHeater();

        // 模拟状态机运行
        heater.setHour(7);
        heater.updateState();

        // 模拟加热过程
        for (int i = 0; i < 20; i++) {
            heater.heatWater();
            heater.updateState();

            // 模拟温度变化
            if (heater.temperature >= 100) {
                heater.setTemperature(20); // 降温到20度，重新循环测试
            }
        }

        // 模拟晚上休眠
        heater.setHour(23);
        heater.updateState();
    }
}


