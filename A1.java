import java.util.Scanner;
public class A1 {
public static void main(String[]args){
double cotacAtual;
int perda;
double cotaProj;
String commodity;

Scanner teclado = new Scanner(System.in);
System.out.println("Digite nome da commodity:");
commodity=teclado.nextLine();

System.out.println("Digite a cotaçao atual do contrato:");
cotacAtual =teclado.nextDouble();

System.out.println("digite a perda estimada da safra:");
perda=teclado.nextInt();
if(perda<0){
    System.out.println("Erro: Percentual de perda de safra invalido.");
   return;
}
if(perda>100){
    System.out.println("Erro: Percentual de perda de safra invalido.");
   return;

}
cotaProj= cotacAtual + (perda*0.10);

System.out.println("A commodity "+commodity +" que possui a cotaçao atual de "+ cotacAtual + " cafetera a cotaçao projetada de "+cotaProj);

if(perda>15 && cotacAtual>50){
    System.out.println("ALERTA: Risco de alta volatilidade no mercado!");
}

}
    
}
