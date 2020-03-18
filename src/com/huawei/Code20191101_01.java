package com.huawei;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Code20191101_01 {

    private StringBuilder builder = new StringBuilder(8);
    private Map<Integer, Boolean> flagMap = new LinkedHashMap<>();

    int[] registerStatus(int[] regs, long cycleNum) {
        builder.append("00000000");
        int[] nextRegs = new int[8];
        for (long i = 0; i < cycleNum; i++) {
            int flag = next(regs, nextRegs);
            if (flagMap.containsKey(flag)) {
                break;
            }
            flagMap.put(flag, true);
            System.arraycopy(nextRegs, 0, regs, 0, regs.length);
        }
        List<Integer> arr = new ArrayList<>();
        flagMap.forEach((k, v) -> {
            arr.add(k);
        });
        int res = arr.get((int) (cycleNum - 1L) % arr.size());
        char[] charArr = Integer.toBinaryString(res).toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (i < charArr.length) {
                nextRegs[nextRegs.length - 1 - i] = charArr[charArr.length - 1 - i] - '0';
            } else {
                nextRegs[nextRegs.length - 1 - i] = 0;
            }
        }
        return nextRegs;
    }

    int next(int[] regs, int[] nextRegs) {
        nextRegs[0] = 0;
        nextRegs[7] = 0;
        builder.setCharAt(0, '0');
        builder.setCharAt(7, '0');
        for (int i = 1; i < regs.length - 1; i++) {
            nextRegs[i] = 1 - (regs[i - 1] ^ regs[i + 1]);
            builder.setCharAt(i, (char) ('0' + nextRegs[i]));
        }
        return Integer.valueOf(builder.toString(), 2);
    }

    public static void test(int[] regs, long cycleNum) {
        Code20191101_01 code2019110101 = new Code20191101_01();
        regs = code2019110101.registerStatus(regs, cycleNum);
        print(regs, true);
    }

    public static void print(int[] regs, boolean ln) {
        for (int i = 0; i < regs.length; i++) {
            System.out.print(" " + regs[i]);
        }
        if (ln) {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        test(new int[]{0, 1, 0, 1, 1, 0, 0, 1}, 7);
        test(new int[]{1, 0, 0, 1, 0, 0, 1, 0}, 1000000000);
    }

}
