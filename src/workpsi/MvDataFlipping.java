package workpsi;

import java.util.ArrayList;
import java.util.List;

class MvData {
    String Length;
    String value;

    MvData(String length, String value) {
        this.Length = length;
        this.value = value;
    }

    @Override
    public String toString() {
        return "{Length:\"" + Length + "\", value:\"" + value + "\"}";
    }
}

public class MvDataFlipping {

    public static List<MvData> flipMvDataList(List<MvData> inputList) {
        int n = inputList.size();
        List<MvData> resultList = new ArrayList<>(n);

        // Initialize the result list with dummy objects
        for (int i = 0; i < n; i++) {
            resultList.add(new MvData(inputList.get(i).Length, "0.0"));
        }

        // Perform flipping logic
        for (int i = 0; i < n; i++) {
            resultList.get(i).value = inputList.get(n - 1 - i).value;
        }

        return resultList;
    }

    public static void main(String[] args) {
        List<MvData> inputList = new ArrayList<>();
        inputList.add(new MvData("0.0", "0.0"));
        inputList.add(new MvData("10.0", "1.0"));
        inputList.add(new MvData("20.0", "2.0"));
        // Add the remaining data points here...

        List<MvData> resultList = flipMvDataList(inputList);
        resultList.forEach(System.out::println);
    }
}
