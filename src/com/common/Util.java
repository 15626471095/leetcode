package com.common;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class Util {

    private Util() {
    }

    public static int[][] readMatrixArr(String input) {
        input = input.substring(1, input.length() - 1);
        StringBuilder buffer = new StringBuilder();
        List<String> arrInputs = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == ',' && buffer.length() == 0) {
                continue;
            }
            buffer.append(c);
            if (c == ']') {
                arrInputs.add(buffer.toString());
                buffer.setLength(0);
            }
        }
        int[][] ans = new int[arrInputs.size()][];
        for (int i = 0; i < arrInputs.size(); i++) {
            ans[i] = readArr(arrInputs.get(i));
        }
        return ans;
    }

    public static int[] readArr(String input) {
        input = input.substring(1, input.length() - 1);
        String[] numbers = input.split(",");
        int[] ans = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            ans[i] = Integer.valueOf(numbers[i]);
        }
        return ans;
    }

    public static <T> void printArr(int[] arr) {
        List<String> list = new ArrayList<>();
        for (int a : arr) {
            list.add(String.valueOf(a));
        }
        String ans = list.stream().collect(Collectors.joining(",", "[", "]"));
        System.out.println(ans);
    }

    public static int[] readArr() {
        try {
            String content = new String(Files.readAllBytes(Paths.get("C:\\Users\\Administrator\\IdeaProjects\\code\\resources\\test.json")));
            String[] strs = content.substring(1, content.length() - 1).split(",");
            int[] arr = new int[strs.length];
            for (int i = 0; i < strs.length; i++) {
                arr[i] = Integer.valueOf(strs[i]);
            }
            return arr;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new int[]{};
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
