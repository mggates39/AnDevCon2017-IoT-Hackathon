package com.corgihat.iot.test01;

/**
 * Created by Marshall on 7/19/2017.
 */

import android.os.Build;

import com.google.android.things.pio.PeripheralManagerService;

import java.util.List;

public class BoardDefaults {
    private static final String DEVICE_EDISON_ARDUINO = "edison_arduino";
    private static final String DEVICE_EDISON = "edison";
    private static final String DEVICE_JOULE = "joule";
    private static final String DEVICE_RPI3 = "rpi3";
    private static final String DEVICE_IMX6UL_PICO = "imx6ul_pico";
    private static final String DEVICE_IMX6UL_VVDN = "imx6ul_iopb";
    private static final String DEVICE_IMX7D_PICO = "imx7d_pico";
    private static String sBoardVariant = "";

    public static String getAButtonGpioPin() {
        switch (getBoardVariant()) {
            case DEVICE_EDISON_ARDUINO:
                return "IO12";
            case DEVICE_EDISON:
                return "GP44";
            case DEVICE_JOULE:
                return "J7_71";
            case DEVICE_RPI3:
                return "BCM21";
            case DEVICE_IMX6UL_PICO:
                return "GPIO4_IO20";
            case DEVICE_IMX6UL_VVDN:
                return "GPIO3_IO01";
            case DEVICE_IMX7D_PICO:
                return "GPIO_174";
            default:
                throw new IllegalArgumentException("Unknown device: " + Build.DEVICE);
        }
    }

    public static String getBButtonGpioPin() {
        switch (getBoardVariant()) {
//            case DEVICE_EDISON_ARDUINO:
//                return "IO12";
//            case DEVICE_EDISON:
//                return "GP44";
//            case DEVICE_JOULE:
//                return "J7_71";
//            case DEVICE_RPI3:
//                return "BCM21";
//            case DEVICE_IMX6UL_PICO:
//                return "GPIO4_IO20";
//            case DEVICE_IMX6UL_VVDN:
//                return "GPIO3_IO01";
            case DEVICE_IMX7D_PICO:
                return "GPIO_175";
            default:
                throw new IllegalArgumentException("Unknown device: " + Build.DEVICE);
        }
    }

    public static String getCButtonGpioPin() {
        switch (getBoardVariant()) {
//            case DEVICE_EDISON_ARDUINO:
//                return "IO12";
//            case DEVICE_EDISON:
//                return "GP44";
//            case DEVICE_JOULE:
//                return "J7_71";
//            case DEVICE_RPI3:
//                return "BCM21";
//            case DEVICE_IMX6UL_PICO:
//                return "GPIO4_IO20";
//            case DEVICE_IMX6UL_VVDN:
//                return "GPIO3_IO01";
            case DEVICE_IMX7D_PICO:
                return "GPIO_39";
            default:
                throw new IllegalArgumentException("Unknown device: " + Build.DEVICE);
        }
    }

    public static String getRedLedGpioPin() {
        switch (getBoardVariant()) {
            case DEVICE_EDISON_ARDUINO:
                return "IO13";
            case DEVICE_EDISON:
                return "GP45";
            case DEVICE_JOULE:
                return "J6_25";
            case DEVICE_RPI3:
                return "BCM6";
            case DEVICE_IMX6UL_PICO:
                return "GPIO4_IO21";
            case DEVICE_IMX6UL_VVDN:
                return "GPIO3_IO06";
            case DEVICE_IMX7D_PICO:
                return "GPIO_34";
            default:
                throw new IllegalArgumentException("Unknown device: " + Build.DEVICE);
        }
    }

    public static String getGreenLedGpioPin() {
        switch (getBoardVariant()) {
//            case DEVICE_EDISON_ARDUINO:
//                return "IO13";
//            case DEVICE_EDISON:
//                return "GP45";
//            case DEVICE_JOULE:
//                return "J6_25";
//            case DEVICE_RPI3:
//                return "BCM6";
//            case DEVICE_IMX6UL_PICO:
//                return "GPIO4_IO21";
//            case DEVICE_IMX6UL_VVDN:
//                return "GPIO3_IO06";
            case DEVICE_IMX7D_PICO:
                return "GPIO_32";
            default:
                throw new IllegalArgumentException("Unknown device: " + Build.DEVICE);
        }
    }

    public static String getBlueLedGpioPin() {
        switch (getBoardVariant()) {
//            case DEVICE_EDISON_ARDUINO:
//                return "IO13";
//            case DEVICE_EDISON:
//                return "GP45";
//            case DEVICE_JOULE:
//                return "J6_25";
//            case DEVICE_RPI3:
//                return "BCM6";
//            case DEVICE_IMX6UL_PICO:
//                return "GPIO4_IO21";
//            case DEVICE_IMX6UL_VVDN:
//                return "GPIO3_IO06";
            case DEVICE_IMX7D_PICO:
                return "GPIO_37";
            default:
                throw new IllegalArgumentException("Unknown device: " + Build.DEVICE);
        }
    }

    public static String getI2cBus() {
        switch (getBoardVariant()) {
            case DEVICE_EDISON_ARDUINO:
                return "I2C6";
            case DEVICE_EDISON:
                return "I2C1";
            case DEVICE_JOULE:
                return "I2C0";
            case DEVICE_RPI3:
                return "I2C1";
            case DEVICE_IMX6UL_PICO:
                return "I2C2";
            case DEVICE_IMX6UL_VVDN:
                return "I2C4";
            case DEVICE_IMX7D_PICO:
                return "I2C1";
            default:
                throw new IllegalArgumentException("Unknown device: " + Build.DEVICE);
        }
    }

    public static String getSpiBus() {
        switch (getBoardVariant()) {
            case DEVICE_EDISON_ARDUINO:
                return "SPI1";
            case DEVICE_EDISON:
                return "SPI2";
            case DEVICE_JOULE:
                return "SPI0.0";
            case DEVICE_RPI3:
                return "SPI0.0";
            case DEVICE_IMX6UL_PICO:
                return "SPI3.0";
            case DEVICE_IMX6UL_VVDN:
                return "SPI1.0";
            case DEVICE_IMX7D_PICO:
                return "SPI3.1";
            default:
                throw new IllegalArgumentException("Unknown device: " + Build.DEVICE);
        }
    }

    public static String getSpeakerPwmPin() {
        switch (getBoardVariant()) {
            case DEVICE_EDISON_ARDUINO:
                return "IO3";
            case DEVICE_EDISON:
                return "GP13";
            case DEVICE_JOULE:
                return "PWM_0";
            case DEVICE_RPI3:
                return "PWM1";
            case DEVICE_IMX6UL_PICO:
                return "PWM7";
            case DEVICE_IMX6UL_VVDN:
                return "PWM3";
            case DEVICE_IMX7D_PICO:
                return "PWM2";
            default:
                throw new IllegalArgumentException("Unknown device: " + Build.DEVICE);
        }
    }

    private static String getBoardVariant() {
        if (!sBoardVariant.isEmpty()) {
            return sBoardVariant;
        }
        sBoardVariant = Build.DEVICE;
        // For the edison check the pin prefix
        // to always return Edison Breakout pin name when applicable.
        if (sBoardVariant.equals(DEVICE_EDISON)) {
            PeripheralManagerService pioService = new PeripheralManagerService();
            List<String> gpioList = pioService.getGpioList();
            if (gpioList.size() != 0) {
                String pin = gpioList.get(0);
                if (pin.startsWith("IO")) {
                    sBoardVariant = DEVICE_EDISON_ARDUINO;
                }
            }
        }
        return sBoardVariant;
    }
}
