import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//отпечатване на конзолата резултата след всеки живот.

public class Drawings {

    public static void PrintMan(int livesLeft) {
        if (livesLeft == 6) {
            System.out.println("                                    <>=======()                           ");
            System.out.println("		                           (/\\___   /|\\\\          ()==========<>_ ");
            System.out.println("		                                 \\_/ | \\\\        //|\\   ______/ \\)");
            System.out.println("		                                   \\_|  \\\\      // | \\_/          ");
            System.out.println("		                                     \\|\\/|\\_   //  /\\/            ");
            System.out.println("		                                      (oo)\\ \\_//  /               ");
            System.out.println("		                                     //_/\\_\\/ /  |                ");
            System.out.println("		                                    @@/  |=\\  \\  |                ");
            System.out.println("		                                         \\_=\\_ \\ |                ");
            System.out.println("		                                           \\==\\ \\|\\          ");
            System.out.println("		                                        __(\\===\\(  )\\             ");
            System.out.println("		                                       (((~) __(_/   |            ");
            System.out.println("		                                            (((~) \\  /            ");
            System.out.println("		                                            ______/ /             ");
            System.out.println("         _____                                                            ");
            System.out.println("       -=@@@@@\\             ,                                             ");
            System.out.println("   -=@@@@@@@@@@            //                                             ");
            System.out.println("    -=@@@@@/\\@/_          //                                              ");
            System.out.println("   -=@@@@@/ /+ _\\        //                                               ");
            System.out.println("  -=@@@@/  (   \\_)      //      ,                                         ");
            System.out.println("  -=@@/    (_____)     //      //                                         ");
            System.out.println("    ~~     /     \\  __//_ _/\\_//_                                         ");
            System.out.println("          | __)___)_/ }  //\\`  -+\\,____                                   ");
            System.out.println("         /   ___  \\|_(  //             <                                  ");
            System.out.println("        /  <-p-q-> \\ `.//     \\___/--\\_/                                  ");
            System.out.println("     ___\\  >-b-d-< /\\/)/      (   \\\\_                                     ");
            System.out.println("    _/   \\\\  \\|/  / \\/         \\  _____                                   ");
            System.out.println("  /_/     \\\\_____/   \\          \\/     \\                                  ");
            System.out.println("  |||     //______\\  _)         |  _/\\ |                                  ");
            System.out.println("   ||\\   //    >   |/ |         | | _/ |                                  ");
            System.out.println("   || / (/    /____|  /____     \\/ /_/_\\                                  ");
            System.out.println("  //\\\\ \\      )    /(____>  \\_    \\                                       ");
            System.out.println("  \\\\//  )    /    /           \\_   \\                                      ");
            System.out.println("   \\/  /    / \\  (              \\   )                                     ");
            System.out.println("      (    /   \\  \\              \\  \\                                     ");
            System.out.println("  -----\\  (-----\\  \\------------- \\  \\---                                 ");
            System.out.println("        \\  \\     \\__\\_             \\__\\_                                  ");
            System.out.println("           \\__\\                                                           ");
            System.out.println("         \\__\\_     \\__\\              \\__\\                          ");
            System.out.println("                                                                          ");

        } else if (livesLeft == 5) {
            System.out.println("      _,.                                   /           /     ");
            System.out.println("    ,` -.)                                  /' .,,,,  ./      ");
            System.out.println("   ( _/-\\\\-._                              /';'     ,/      ");
            System.out.println("  /,|`--._,-^|            ,               / /   ,,//,`'`      ");
            System.out.println("  \\_| |`-._/||          ,'|              ( ,, '_,  ,,,' ``   ");
            System.out.println("    |  `-, / |         /  /              |    /@  ,,, ;\" '    ");
            System.out.println("    |     || |        /  /              /    .   ,''/' `,``   ");
            System.out.println("     `r-._||/   __   /  /              /   .     ./, `,, ` ;  ");
            System.out.println(" __,-<_     )`-/  `./  /            ,./  .   ,-,',` ,,/''\\,' ");
            System.out.println("'  \\   `---'   \\   /  /            |   /; ./,,'`,,'' |   |  ");
            System.out.println("    |           |./  /             |     /   ','    /    |    ");
            System.out.println("    /           //  /               \\___/'   '     |     |   ");
            System.out.println("\\_/' \\         |/  /                  `,,'  |      /     `\\");
            System.out.println(" |    |   _,^-'/  /                        /      |        ~\\");
            System.out.println(" |    , ``  (\\/  /_                       '       (          ");
            System.out.println("  \\,.->._    \\X-=/^                      :                  ");
            System.out.println("  (  /   `-._//^`                       ; .         \\--      ");
            System.out.println("   `Y-.____(__}                       :   \\         ;        ");
            System.out.println("    |     {__)              ");
            System.out.println("          ()		        ");
            System.out.println();

        } else if (livesLeft == 4) {
            System.out.println(" /\\                                 																	");
            System.out.println(" ||                                           /|                                                        ");
            System.out.println(" ||                                      //^^^  ~~~~^^^^---___                   ^\\            /|      ");
            System.out.println(" ||                                   /c~~`'     ____          ^^^^             /| \\\\        /_ _\\   ");
            System.out.println(" ||           {}                      ~^^--; _\\\\\\    ~~~---___     ~~~~        / '|  \\\\       | |  ");
            System.out.println(" ||          .--.                         /_/                 --        ~~~__/ ,  |   \\\\       \\ \\  ");
            System.out.println(" ||         /.--.\\                       ~                      -        |\\--;' |  |    ;;      | |   ");
            System.out.println(" ||         |====|                                              |          \\   |    |    /     /  /    ");
            System.out.println(" ||         |`::`|                                             |__ \\  \\     ~--|/~~\\/~~|/     /  /   ");
            System.out.println("_||_    .-;`\\..../`;_.-^-._                               /---_.     \\  \\         |    /      |  |   ");
            System.out.println(" /\\\\   /  |...::..|`   :   `|                            ;-/   ~\\-----   ;         |           |  |  ");
            System.out.println(" |:'\\ |   /'''::''|   .:.   |                             '--\\_,--------'           |          |   |  ");
            System.out.println("  \\ /\\;-,/\\   ::  |..:::::..|                               / ____    _^^^_..        |        -      ");
            System.out.println("   \\ <` >  >._::_.| ':::::' |                              |       /^       ..       |       _    |    ");
            System.out.println("    `\"\"`  /   ^^  |   ':'   |                              | ---- |      .           |      _    |      ");
            System.out.println("          |       \\    :    /                               `     `.      |           |    -    -      ");
            System.out.println("          |        \\   :   /                                 ` .--  `      |           -__-    -       ");
            System.out.println("          |___/\\___|`-.:.-`                                   / ` -_.     /                   -        ");
            System.out.println("           \\_ || _/    `                                 _-__ ---^^     /          _---_____--         ");
            System.out.println("           <_ >< _>                                     ///  ///__ -__  / -____--~                      ");
            System.out.println("           |  ||  |                                                                                     ");
            System.out.println("           |  ||  |                                                                                     ");
            System.out.println("          _\\.:||:./_                                                                                   ");
            System.out.println("         /____/\\____\\                                                                                 ");
            System.out.println();

        } else if (livesLeft == 3) {
            System.out.println("                                                       ^     ^												");
            System.out.println("   / \\                                               / \\  //\\                                            ");
            System.out.println("   | |                                 |\\___/|      /   \\//  .\\                                          ");
            System.out.println("   |.|                                 /O  O  \\__  /    //  | \\ \\                                        ");
            System.out.println("   |.|                                /     /  \\/_/    //   |  \\  \\                                      ");
            System.out.println("   |:|      __                        @___@'    \\/_   //    |   \\   \\                                    ");
            System.out.println(" ,_|:|_,   /  )                          |       \\/_ //     |    \\    \\                                  ");
            System.out.println("   (Oo    / _I_                          |        \\///      |     \\     \\                                ");
            System.out.println("    +\\ \\  || __|                        _|_ /   )  //       |      \\     _\\                             ");
            System.out.println("       \\ \\||___|                       '/,_ _ _/  ( ; -.    |    _ _\\.-~        .-~~~^-.                 ");
            System.out.println("         \\ /.:.\\-\\                     ,-{        _      `-.|.-~-.           .~         `.               ");
            System.out.println("          |.:. /-----\\                  '/\\      /                 ~-. _ .-~      .-~^-.  \\              ");
            System.out.println("          |___|::oOo::|                    `.   {            }                   /      \\  \\              ");
            System.out.println("          /   |:<_T_>:|                  .----~-.\\        \\-'                 .~         \\  `. \\^-.     ");
            System.out.println("         |_____\\ ::: /                  ///.----..>    c   \\             _ -~             `.  ^-`   ^-_   ");
            System.out.println("          | |  \\ \\:/                      ///-._ _ _ _ _ _ _}^ - - - - ~                     ~--,   .-~   ");
            System.out.println("          | |   | |                                                                             /.-'        ");
            System.out.println("          \\ /   | \\__                 																	");
            System.out.println("          / |   \\____\\                														");
            System.out.println();

        } else if (livesLeft == 2) {
            System.out.println("    (  )   /\\   _                 (                                           ");
            System.out.println("    \\ |  (  \\ ( \\.(               )                       _____             ");
            System.out.println("  \\  \\ \\  `  `   ) \\             (  ___                 / _   \\           ");
            System.out.println(" (_`    \\+   . x  ( .\\            \\/   \\____-----------/ (o)   \\_         ");
            System.out.println("- .-               \\+  ;          (  O                           \\____       ");
            System.out.println("                          )        \\_____________  `              \\  /       ");
            System.out.println("(__                +- .( -'.- <. - _  VVVVVVV VV V\\                 \\/       ");
            System.out.println("(_____            ._._: <_ - <- _  (--  _AAAAAAA__A_/                  |       ");
            System.out.println("  .    /./.+-  . .- /  +--  - .     \\______________//_              \\_______ ");
            System.out.println("  (__ ' /x  / x _/ (                                  \\___'          \\     / ");
            System.out.println(" , x / ( '  . / .  /                                      |           \\   /   ");
            System.out.println("    /  /  _/ /    +                                      /              \\/    ");
            System.out.println("   '  (__/                                             /                  \\   ");
            System.out.println();

        } else if (livesLeft == 1) {

            System.out.println(" `7MM\"\"\"\"\"MMF'  .p8\"\"\"8q.     .g8\"\"\"bgd    `7MP\"\"MMF'`7MM\"\"\"YMM    `7MP\"\"MMF' `7MM\"\"\"YMM  `7MMF'  `7MMF'");
            System.out.println("   MM     MM   6M'     `Mp  .dP'     `M      M   MM    MM    `7      M   MM     MM    `7    MM      MM  ");
            System.out.println("   MM     MM  6MP       YMb dM'       `      P   MM    MM   d        P   MM     MM   d      MM      MM  ");
            System.out.println("   MM     MM  8MI       IM8 MM              j'   MM    MMmmMM       ;'   MM     MMmmMM      MMmmmmmmMM  ");
            System.out.println("   MM     MM  YMb       dM9 MM.            ,9    MM    MM   Y  ,   ,9    MM     MM   Y  ,   MM      MM  ");
            System.out.println("   MM     MM   YM.     ,M9  `Mb.     ,' ,.,9     MM    MM     ,M  ,9     MM     MM     ,M   MM      MM  ");
            System.out.println(" .JMML. .JMML.  `Mbmmmd\"'     `\"bmmmd'  OO'    ,JMML..JMMmmmmMMM gMmmmmmmMMmm .JMMmmmmMMM .JMML.  .JMML.");
            System.out.println("                                                                 MV        VM                           ");
            System.out.println("                                                                 V          V                           ");
            System.out.println("                                                                                                        ");
            System.out.println("                                                                                                        ");
            System.out.println("             o8b.  `7MMF'  ,d8o `7MMF'  `7MMF'`7MM\"\"\"Yp,   .p8\"\"\"8q.   MMP\"\"MM\"\"YMM      OO             ");
            System.out.println("               `Yb   MM   6P'     MM    ,AMM    MM    Yb  6M'     `Mp  P'   MM   `7      88             ");
            System.out.println("                 Y.  MM  ,9       MM   ,A'MM    MM    dP 6MP       YMb      MM           ||             ");
            System.out.println("                  >bmMMmd<        MM  AV  MM    MM\"\"\"bg. 8MI       IM8      MM           ||             ");
            System.out.println("               ,dP'  MM  `YM.     MM,V'   MM    MM    `Y YMb       dM9      MM           `'             ");
            System.out.println("               dM'   MM   `Mb     MMV'    MM    MM    ,9  YM.     ,M9       MM           ,,             ");
            System.out.println("             .dM   .JMML.  `Mba..JMML.  .JMML..JMMmmmd9    `Mbmmmd\"'      .JMML.         db             ");


            System.out.println();
        } else if (livesLeft < 1) {
            System.out.println("    __   _____  _   _    											");
            System.out.println("    \\ \\ / / _ \\| | | |   \\`----.__                 ____         ");
            System.out.println("     \\ V / | | | | | |    |       `--._         <=#  , *--,        ");
            System.out.println("      | || |_| | |_| |   /_             `-.    ,/  / `````          ");
            System.out.println("      |_| \\___/ \\___/      \\__             (_.'  ,'              ");
            System.out.println("                            \\__ ......'       \\___----^__         ");
            System.out.println("                             _./               ,'           `.      ");
            System.out.println("                    |\\     _.'   ___/ )\\...._\"   ___           \\ ");
            System.out.println("                    | \\__.'  __.'            `\"\"'   `\"\"`.'\"\"\"`--\\ ");
            System.out.println("                     \\____.-'   ____  _____    _    ____           ");
            System.out.println("                               |  _ \\| ____|  / \\  |  _ \\        ");
            System.out.println("                               | | | |  _|   / _ \\ | | | |         ");
            System.out.println("                               | |_| | |___ / ___ \\| |_| |         ");
            System.out.println("                               |____/|_____/_/   \\_\\____/         ");
            System.out.println();
            Sound.Road(0);

        }
    }

    public static void printWin() {

        System.out.println(" _  _   ___   __ __    __    __ __ __  __        ");
        System.out.println(" \\\\//  // \\\\  || ||    ||    || || ||\\ ||   ");
        System.out.println("  )/  ((   )) || ||    \\\\ /\\ // || ||\\\\||   ");
        System.out.println(" //    \\\\_//  \\\\_//     \\V/\\V/  || || \\|| ");
        System.out.println("                                                 ");
        System.out.println("                                                 ");
        System.out.println("                    {}                           ");
        System.out.println("                   {{}}                          ");
        System.out.println("                   {{}}                          ");
        System.out.println("                    {}                           ");
        System.out.println("                  .-''-.                         ");
        System.out.println("                 /  __  \\                       ");
        System.out.println("                /.-'  '-.\\                      ");
        System.out.println("                \\::.  .::/                      ");
        System.out.println("                 \\'    '/                       ");
        System.out.println("            __ ___)    (___ __                   ");
        System.out.println("          .'   \\\\        //   `.               ");
        System.out.println("         /     | '-.__.-' |     \\               ");
        System.out.println("         |     |  '::::'  |     |                ");
        System.out.println("         |    /    '::'    \\    |               ");
        System.out.println("         |_.-;\\     __     /;-._|               ");
        System.out.println("         \\.'^`\\\\    \\/    //`^'./            ");
        System.out.println("         /   _.-._ _||_ _.-._   \\               ");
        System.out.println("        `\\___\\    '-..-'    /___/`             ");
        System.out.println("             /'---.  `\\.---'\\                  ");
        System.out.println("            ||    |`\\\\\\|    ||                ");
        System.out.println("            ||    | || |    ||                   ");
        System.out.println("            |;.__.' || '.__.;|                   ");
        System.out.println("            |       ||       |                   ");
        System.out.println("            {{{{{{{{||}}}}}}}}                   ");
        System.out.println("             |      ||      |                    ");
        System.out.println("             |.-==-.||.-==-.|                    ");
        System.out.println("             <.    .||.    .>                    ");
        System.out.println("              \\'=='/||\\'=='/                   ");
        System.out.println("              |   / || \\   |                    ");
        System.out.println("              |   | || |   |                     ");
        System.out.println("              |   | || |   |                     ");
        System.out.println("              /^^\\| || |/^^\\                   ");
        System.out.println("             /   .' || '.   \\                   ");
        System.out.println("            /   /   ||   \\   \\                 ");
        System.out.println("           (__.'    \\/    '.__)                 ");
        System.out.println();
        Sound.Road(1);

    }

    public static void printThankYou() throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Resource/Shruikan.txt"));
            String line = reader.readLine();

            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }

            System.out.println();
            System.out.println();
            System.out.println();

            reader.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
    }

    public static void printHangman() throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Resource/Shruikan.txt"));
            String line = reader.readLine();

            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }

            System.out.println();
            System.out.println();
            System.out.println();

            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}