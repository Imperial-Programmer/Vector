import java.util.*;

public class Main
{
    public static void main(String[] args) {  
        int pilihan;
        Scanner sc = new Scanner(System.in);
        Vector<Integer> number = new Vector<Integer>();
        do{
            System.out.println("\n\n\n\n\nSTACK NUMBER");
            System.out.println("1. add number");
            System.out.println("2. remove number");
            System.out.println("3. search number");
            System.out.println("4. view number");
            System.out.println("5. exit");
            do{
                System.out.print("Pilihan:");
                pilihan = sc.nextInt();
                sc.nextLine();
            }while(pilihan < 1 || pilihan > 4);
            
            if(pilihan == 1){
              int input;
              System.out.print("Masukan nilai: ");
              input = sc.nextInt();
              
              number.add(input);
              System.out.println("Input nilai berhasil!");
            }
            else if(pilihan == 2){
              String hapus;
              if(number.isEmpty())
              { 
                  System.out.println("Data kosong");
              }
              else
              {
                  do{
                      System.out.println("apakah ingin hapus element terakhir [Y|N]?");
                      hapus = sc.nextLine();
                      hapus = hapus.toUpperCase();
                  }while(!hapus.equals("Y") && !hapus.equals("N"));
                  
                  if(hapus.equals("Y"))
                  {
                      number.remove(number.size() - 1);
                      System.out.println("berhasil hapus!");
                  }
              }
            }
            else if(pilihan == 3){
                int input;
                System.out.println("masukan angka yang ingin dicari:");
                input = sc.nextInt();
                
                if(number.contains(input))
                {
                    System.out.println("Data ketemu!");
                    for(int i=0;i<number.size();i++)
                    {
                        if(number.get(i) == input)
                        {
                            System.out.println("angka ada di index ke "+ i);
                            break;
                        }
                    }
                }
                else
                {
                    System.out.println("Data tidak ditemukan");    
                }
            }
            else{
                if(number.isEmpty())
                {
                    System.out.println("Data kosong!!!!");
                }
                else
                {
                     System.out.println("LIST NUMBER");
                     for(int i = 0;i< number.size();i++)
                     {
                        System.out.println(number.get(i));
                     }
                }
                sc.next();
            }
        }while(pilihan !=5);
    }
}
