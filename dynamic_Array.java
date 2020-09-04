package com.company;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

//2 5
//1 0 5
//1 1 7
//1 0 3
//2 1 0
//2 1 1

class Result {

    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // Write your code here

        List<List<Integer>> seqlist = new ArrayList<>();
        int lastAnswer =0;

        for(int i=0;i<n;i++){
            seqlist.add(new ArrayList<>());
        }

        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<queries.size();i++){

            int x = queries.get(i).get(1);
            int y = queries.get(i).get(2);
            int index = (x^lastAnswer)%n;

            if(queries.get(i).get(0)==1){
                seqlist.get(index).add(y);
            }
            if(queries.get(i).get(0)==2){
                int sqsize = seqlist.get(index).size();
                lastAnswer = seqlist.get(index).get(y%sqsize);
                ans.add(lastAnswer);
            }
        }

        return ans;
    }

}

public class dynamic_Array {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = Result.dynamicArray(n, queries);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

