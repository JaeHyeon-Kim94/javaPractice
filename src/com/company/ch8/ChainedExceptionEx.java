package com.company.ch8;

public class ChainedExceptionEx {

    static void install() throws InstallException1 {
        try {

            startInstall();
            copyFiles();

        } catch (SpaceException1 se1) {

            InstallException1 ie1 = new InstallException1("설치 중 예외발생");
            ie1.initCause(se1);
            throw ie1;

        } catch (MemoryException1 me1) {

            throw new RuntimeException(new InstallException1("설치 중 예외 발생"));
            //위의 방식과 차이점 주목.
        } finally {

            deleteTempFiles();

        }
    }

    static void startInstall() throws SpaceException1, MemoryException1 {
        if (!enoughSpace()) {
            throw new SpaceException1("설치할 공간이 부족합니다.");
        }

        if (!enoughMemory()) {
            throw new MemoryException1("메모리가 부족합니다.");
            //throw new RuntimeException(new MemoryException1("메모리가 부족합니다."));
        }
    }

    static void copyFiles() { }

    static void deleteTempFiles() { }

    static boolean enoughSpace() { return true; }

    static boolean enoughMemory() { return false; }

    public static void main(String[] args) {
        try {
            install();
        } catch (InstallException1 e1) {
            e1.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


class InstallException1 extends Exception {
    InstallException1(String msg) {
        super(msg);
    }
}

class SpaceException1 extends Exception {
    SpaceException1(String msg) {
        super(msg);
    }
}

class MemoryException1 extends Exception {
    MemoryException1(String msg) {
        super(msg);
    }
}
