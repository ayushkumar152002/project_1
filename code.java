import java.util.Scanner;

class project
{
    public static void main(String[] args)
    {
        char a[][] = new char[3][3];
        char player='*';
        boolean gameover=false;
        Scanner sc = new Scanner(System.in);
        for(int row=0;row<a.length;row++)
        {
            for(int col=0;col<a[0].length;col++)
            {
                a[row][col]=' ';
            }
        }  
        while(gameover==false)
        {
            // printboard(a);
            System.out.println("enter row");
            int row=sc.nextInt();
            System.out.println("enter column");
            int col=sc.nextInt();
            System.out.println();
            if(a[row][col]==' ')
            {
                if(player=='0')
                {
                    
                    a[row][col]=player;
                    player='*';
                    gameover=winner(a);
                }
                else{
                    a[row][col]=player;
                    player='0';
                    gameover=winner(a);

                }
            }
            else
            {
                System.out.println("invalid move");
            }
            printboard(a);
        }
        if(player=='0'){
            player='*';
        }
        else{
            player='0';
        }
        System.out.println("player" + player + "is winner");
    }

    // code for printing the board

    public static void printboard(char b[][]) {
        for(int row=0;row<b.length;row++)
        {
            for(int col=0;col<b[0].length;col++)
            {
                System.out.print(b[row][col]);
            }
            System.out.println();            
            
        }
    }

    // code for winning the game
    public static boolean winner(char c[][])
    {
        for(int row=0;row<c.length;row++)
        {
            if((c[row][0]==c[row][1])&&(c[row][0]==c[row][2])&&(c[row][0]!=' ')&&(c[row][2]!=' '))
            {
                return true;
            }
        }
        for(int col=0;col<c[0].length;col++)
        {
            if((c[0][col]==c[1][col])&&(c[0][col]==c[2][col])&&(c[0][col]!=' ')&&(c[1][col]!=' '))
            {
                return true;
            }
        }
        if((c[0][0]==c[1][1])&&(c[0][0]!=' '))
        {
            if((c[1][1]==c[2][2])&&(c[2][2]!=' '))
            {
                return true;
            }
        }
        if((c[0][2]==c[1][1])&&(c[0][0]!=' '))
        {
            if((c[1][1]==c[2][0])&&(c[2][0]!=' '))
            {
                return true;
            }
        }
        return false;
    }
}