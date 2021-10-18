package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double[] abc=data();

        double[] sol=solution(abc);

        System.out.print(outputtingTheResult(sol));

    }

    public static double[]  data(){
        double[] result= new double[3];
        Scanner sc= new Scanner(System.in);

        System.out.print("a --> ");
        result[0]=sc.nextDouble();
        System.out.print("b --> ");
        result[1]=sc.nextDouble();
        System.out.print("c --> ");

        result[2]=sc.nextDouble();
        return result;
    }
    public static double[] solution(double[] coef) {
        double[] result = new double[4];
        // ax^2+bx+c=0
        if (coef[0] == 0) { //a=0
            if (coef[1] == 0) {//b=0
                if (coef[2] == 0) { //c=0  бесконечное множество корней
                    result[0] = 1;
                    result[1] = 3;
                } else { // c!=0 корней нет
                    result[0] = 0;
                }
            } else { //b!=0
                if (coef[2] == 0) { // c=0
                    result[0] = 1;
                    result[1] = 1;
                    result[2] = 0;
                } else { // c!=0
                    result[0] = 1;
                    result[1] = 1;
                    result[2] = -coef[2] / coef[1];
                }
            }
        }
        else{// a!=0
            if(coef[1]==0){//b=0
                if(coef[2]==0){ //c=0
                    result[0]=1;
                    result[1]=1;
                    result[2]=0;
                }
                else{ // c!=0
                    if((coef[0]>0)^(coef[2]>0)){ // а и с разного знака
                        result[0]=1;
                        result[1]=1;
                        result[2]=Math.sqrt(-coef[2]/coef[0]);
                    }
                    else{
                        result[0]=0;
                    }
                }
            }
            else{ //b!=0
                if(coef[2]==0){ // c=0
                    result[0]=1;
                    result[1]=2;
                    result[2]=0;
                    result[3]=-coef[1]/coef[0];
                }
                else{ // c!=0
                    double diskr=coef[1]*coef[1]-4*coef[0]*coef[2];
                    if (diskr<0)
                        result[0]=0;
                    else{
                        double cqDiskr=Math.sqrt(diskr);
                        result[0]=1;
                        result[1]=2;
                        result[2]=(-coef[1]+cqDiskr)/(2*coef[0]);
                        result[3]=(-coef[1]-cqDiskr)/(2*coef[0]);
                    }
                }
            }
        }
        return result;
    }// solution
    public static String outputtingTheResult(double [] res){
        String result="";
        if(res[0]==0)
            result="действительных корней нет ";
        else{ // корни есть
            if (res[1]==1){
                result="корень один и равен "+res[2];
            }
            else{
                if (res[1]==3) result="бесконечное количество корней ";
                else{
                    result="два корня "+res[2]+"  "+res[3];
                }
            }
        }
        return result;
    }
}
