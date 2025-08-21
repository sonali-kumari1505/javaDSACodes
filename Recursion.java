import com.sun.security.jgss.GSSUtil;

import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
//    print num from n to 1
public class Recursion {



    //Print  x^n to stack height =logn

//    public static int PrintFib(int x,int n) {
//        if (x == 0) {
//            return 0;
//        }
//        if (n == 0) {
//            return 1;
//        }
//        if (n % 2 == 0) {
//            return (PrintFib(x, n / 2) * PrintFib(x, n / 2));
//        } else {
//            return (PrintFib(x, n / 2) * PrintFib(x, n / 2) * x);
//        }
//    }
//        public static void main(String[] args){
//            int n=9;
//            int x=3;
//            System.out.println("x to powe n is :"+ PrintFib(3,));
//        }
//    /        if(n==1){
//            System.out.println("tranfer disk" + n + "from" + src+ "to"+ dest);
////            return;
////        }
////        towerOfHanoi(n-1,src,dest,helper);
////        System.out.println(n + src +helper + dest);
////        System.out.println("tranfer disk" + n + "from" + src+ "to"+ dest);
////        System.out.println(n + src +helper + dest);
////        towerOfHanoi(n-1,helper,src,dest);
////        System.out.println(n + src +helper + dest);
////Towe of honoi O(2^n)
///
public static int v=0;
    public static void towerOfHanoi(int n,String src,String helper,String dest){
if (n==1){
    System.out.println("trnasfer disk "+ n + "from"+ src +"to"+ dest);
    return;
}
        System.out.println(0);
        System.out.println(n +"called");
        towerOfHanoi(n-1,src,dest,helper);
        System.out.println("trnasfer disk "+ n + "from"+ src +"to"+ dest);
        System.out.println(1);
        System.out.println(n +"called");
        towerOfHanoi(n-1,helper,src,dest);
        System.out.println(2);
    }
    public static void main(String[] args){
        int n=4

                ;
        towerOfHanoi(n,"S","H","D");
//String s="sosododof";
//        System.out.println(s.substring(1));

    }


//   // print a sting in reverse
//public class Recursion {
//public static void RevStr(String name,int idx) {
////
//if(idx==5){
//    System.out.print(name.charAt(idx));
//    return;
//}
//
//RevStr(name,idx+1);
//    System.out.print(name.charAt(idx));
//}
//public static void main(String[] args){
//    String name="sonali";
//    RevStr(name,0);
//}
//Time Complexity =stringlength O(n)

//    // Find first and last occurence of an element in string
//public static int first=-1;
//public static int last=-1;
//public static void CountOcc(int idx,char ele,String name) {
//
//if (idx==name.length()){
//    System.out.println(first);
//    System.out.println(last);
//    return;
//}
//char currchar=name.charAt(idx);
//if(currchar==ele){
//    if(first==-1){
//        first=idx;
//    }
//    else{
//        last=idx;
//    }
//}
//    CountOcc(idx+1,'a',name);
//
//
//}
//public static void main (String[] args){
//
//   String name="Soanallakumari";
//    CountOcc(0,'a',name);
//}
//
//    public static boolean CheckSorted(int arr[], int i) {
//        if (i > arr.length - 2) {
//            return true;
//        }
//        if (arr[i] < arr[i + 1]) {
//
//
//            return CheckSorted(arr, i + 1);
//        }
//        return false;
//    }




//    public static void main(String [] args){
//        int[] arr={2,4,90,100,16};
//        System.out.println(CheckSorted(arr,0));
//    }

//    Move all 'x to the end of the String
//    time complexity is count + name.length O(n+count)~= O(n)
//public static int count=0;
//public static void Movallx(int idx,char ele,String name,String newstr) {
//if (idx==name.length()){
//    for(int i=0;i<count;i++){
//        newstr+="x";
//    }
//    System.out.println(newstr);
//   return;
//}
//
//    if (name.charAt(idx) == 'x') {
//        count = count + 1;
//        Movallx(idx + 1, 'x', name,newstr);
//    } else {
//        newstr+=name.charAt(idx);
//        Movallx(idx + 1, 'x', name,newstr);
//    }
//}
//    public static int count=0;
//        public static char c='x';
//        public static String s="avxxxsdsdxxxertxxxttx";
//    public static String Movallx(int i,String ns){
//        if(i==s.length()){
//            for(int i1=0;i1<count;i1++){
//                ns+=c;
//            }
//            return ns;
//        }
//        if(s.charAt(i)!=c){
//            ns+=s.charAt(i);
//        }
//        else{
//count++;
//        }
//        return Movallx(i+1,ns);
//    }
//    public static void main (String[] args){
//        System.out.println(Movallx(0,""));
//}
//public static boolean[] map=new boolean[26];
//public static void RemoveDuplicate(int idx,String name,String newstr) {
//if (idx==name.length()){
//
//    System.out.println(newstr);
//   return;
//}
//
//    if (map[name.charAt(idx)-'a'] == true) {
//
//        RemoveDuplicate(idx+1,name,newstr);
//    } else {
//        newstr+=name.charAt(idx);
//        map[name.charAt(idx)-'a'] = true;
//        RemoveDuplicate(idx+1,name,newstr);
//    }
//
//}
//    public static void main (String[] args){
//
//   String name="abbccdadc";
//        RemoveDuplicate(0,name,"");
//}


//Time com plexity is O(n)
//

//    print subsequences of a string

////
//    public static void  Subsequences(int idx,String name,String newstr) {
//        if (idx==name.length()){
//
//            System.out.println(newstr);
//            return;
//        }
//char ele=name.charAt(idx);
////        to be
//        Subsequences(idx+1,name,newstr+ele);
////        to be not
//        System.out.println("after to be");
//        System.out.println(idx);
//        Subsequences(idx+1,name,newstr);
//        System.out.println("after noot to");
//    }
////    each level has two choices
////   total  subsequences=2^stringh.length()
////    so Time complexity==2^n + 2^n-1 + 2^n-2 + .......+ 1=1(2^n+1 - 1)
//    public static void main (String[] args){
//
//        String name="abc";
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//        Subsequences(0,name,"");
//    }

//print unique subsequences with help of hashset
//public static void  Subsequences(int idx,String name,String newstr,HashSet<String>set) {
//    if (idx==name.length()) {
//        if (set.contains(newstr)) {
//            return;
//        } else {
//            System.out.println(newstr);
//            set.add(newstr);
//            return;
//        }
//    }
//    char ele=name.charAt(idx);
////        to be
//    Subsequences(idx+1,name,newstr+ele,set);
//        to be not
//    Subsequences(idx+1,name,newstr,set);
//
//}
//public static void main (String[] args){
//
//        String name="accss";
//        HashSet<String> set=new HashSet<>();
//        Subsequences(0,name,"",set);
////    }
//public static String[] keypard ={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
//public static void Keypard(String newstr,String str,int idx) {
//    if (idx == str.length()) {
//        System.out.println(newstr);
//        return;
//    }
//
//    char currchar = str.charAt(idx);
//    String mapping = keypard[currchar - '0'];
//    for (int i = 0; i < mapping.length(); i++) {
//        Keypard(newstr+mapping.charAt(i), str, idx + 1);
//    }
//}
////Time comlexity O(4^str.length()) here 4= max choices at the levels
//  public static void main (String[] args){
//    String str="9";
//      Keypard("",str,0);
//  }
//


//      5 advance problems of recursion

// permutation of a string
//public static void  Permutation(String name,String Perm) {
//    if (name.length()==0){
//        System.out.println(Perm);
//        return;
//    }
//for(int i=0;i<name.length();i++) {
//    char cc = name.charAt(i);
//    String str = name.substring(0, i) + name.substring(i + 1);
//    Permutation(str, Perm + cc);
//}}//Time complexity =O(n!)=phli kursi ke liye n dusri ke liye n-1 aise hi sabko multiply karte rho
//    public static void main (String[] args){
//        String name="abc";
//       Permutation(name,"");}

//  count total paths to move from (0,0) to (n,m);
//public static int CountPath(int i,int j,int m,int n) {
//  if (i==n-1 && j==m-1){
//     return 1;
//  }
//    if (i==n || j==m){
//        return 0;
//    }
//
////move downwards
//      int downPaths=CountPath(i+1,j,m,n);
// //move right
//    int rightPaths=CountPath(i,j+1,m,n);
//    return rightPaths + downPaths;
//
//}
////it has a lot of timecomplexity
////    so we use backtracking
//
//    public static void main (String[] args){
//    int n=3,m=3;
//        System.out.println( CountPath(0,0,m,n));
//}
//    place tiles of size 1*m in a floor of size n*m;
//    if n=4 and m=2
//     there are 5 ways to place tiles
//public static int  PlaceTiles(int n,int m){
////    basecase
//    if (n==m){
//        return 2;}
//    if (n<m){
//        return 1;}
//
//    int verticalplacements=PlaceTiles(n-m,m);
//    int horizontalplacements=   PlaceTiles(n-1,m);
//    return horizontalplacements+ verticalplacements;
//}
//        public static void main (String[] args){
//    int n=2,m=2;
//            System.out.println(PlaceTiles(1,2));
//}
//    // you have to invite guest in pair or single then count total number of guests
//public static int Countguest(int n){
//    if (n<1){
//        return 1;
//    }
//    int ways1=Countguest(n-1);
//    int ways2=Countguest(n-2) * (n-1);
//    return ways1 + ways2;
//}
//    public static void main (String[] args){
//        System.out.println(Countguest(2));
//    }

    //count subset of natural numbers
//public static void printSub(ArrayList<Integer> subSet){
//    for(int i=0; i<subSet.size();i++){
//        System.out.print(subSet.get(i)+" ");
//    }
//    System.out.println();
//}
//public static void subset(int n,ArrayList<Integer> subSet){
//   if (n==0){
//      printSub(subSet);
//       return;
//   }
//    //add hoga
//    subSet.add(n);
//    subset(n-1,subSet);
////    add nhi hoga
//    subSet.remove(subSet.size()-1);
//    subset(n-1,subSet);
//}
//time complexity is O(2^n)
//    public static void main(String[] args){
//    int n=3;
//    ArrayList<Integer> subSet=new ArrayList<>();
//    subset(n,subSet);
//    }
//backtracking
//by backtracking print permutation
//   public static void  printPerm(String str,String Perm,int idx){
//       if(str.length()==0){
//           System.out.println(Perm);
//           return;
//       }
//       for(int i=0;i<str.length();i++){
//           char curr=str.charAt(i);
//           String newStr=str.substring(0,i)+ str.substring(i+1);
//           printPerm(newStr,Perm+curr,idx+1);
//       }
//   }
////   time complexity is O(n*n!)
//   public static void main(String[] args) {
//       String str="abz";
//       printPerm(str,"",0);
//   }

//   Nqueens problems
//public boolean isSafe(int row,int col,char[][] board){
////    horizontal
//    for(int j=0;j<board.length;j++){
//
//        if (board[row][j]=='Q'){
//            return false;
//        }
//    }
////    vertical
//    for(int j=0;j<board.length;j++){
//        if (board[j][col]=='Q'){
//            return false;
//        }
//    }
////    upperleft
//    int r=row;
//    for(int c=col; c>=0 && r>=0;c--,r--){
//        if (board[r][c]=='Q'){
//            return false;
//        }
//    }
////    loweright
//    r=row;
//    int n=board.length-1;
//    for(int c=col; c<=n && r<=n;c++,r++){
//        if (board[r][c]=='Q'){
//            return false;
//        }
//    }
//    r=row;
//    n=board.length-1;
//    for(int c=col; c<=n && r>=0;c++,r--){
//        if (board[r][c]=='Q'){
//            return false;
//        }
//    }
//
//    for(int c=col; c>=0&& r<=n;c--,r++){
//        if (board[r][c]=='Q'){
//            return false;
//        }
//    }
//   return true;
//}
////public void saveBoard(char[][] board,List<List<String>> allBoards){
//    String row="";
//    List<String> newboard=new ArrayList<>();
//    for(int i=0;i<board.length; i++){
//       row="";
//       for(int j=0;j<board[0].length; j++){
//           if(board[i][j]=='Q'){
//               row+='Q';
//           }
//           else{
//               row+='.';
//           }
//
//       }
//       newboard.add(row);
//    }
//    allBoards.add(newboard);
//}
//public void helper(char[][] board,List<List<String>> allBoards,int col){
//    if (col==board.length){
//        saveBoard(board,allBoards);
//        return;
//    }
//    for(int row=0;row<board.length;row++){
//        if(isSafe(row,col,board)){
//            board[row][col]='Q';
//            helper(board,allBoards,col++-1);
//            board[row][col]='.';
//
//        }
//
//    }
//}
//    public List<List<String>> solveNQueens(int n){
//    List<List<String>> allBoards=new ArrayList<>();
//    char[][] board=new board[n][n];
//    helper(board,allBoards,0);
//    }
//Merge sort
//    public class MergeSort() {
//
//    }
//public class Recursion{
//
//
//}


}
