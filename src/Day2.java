import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Day2 {
    public void day2() {
        char wrongstring = 0;
        String[] strings = {
                "cvfueihajytpmrdkgsxfqplbxn",
                "cbzueihajytnmrdkgtxfqplbwn",
                "cvzucihajytomrdkgstfqplqwn",
                "cvzueilajytomrdkgsxfqwnbwn",
                "cvzueihajytomrdkgsgwqphbwn",
                "wuzuerhajytomrdkgsxfqplbwn",
                "cyzueifajybomrdkgsxfqplbwn",
                "cvzueihajxtomrdkgpxfqplmwn",
                "ivzfevhajytomrdkgsxfqplbwn",
                "cvzueihajytomrdlgsxfqphbbn",
                "uvzueihajjtomrdkgsxfqpobwn",
                "cvzupihajytomrdkgsxfqplpwe",
                "cvzueihajyvomrdkgsxfqplbrl",
                "cczueihajytomrdkgsnfqpxbwn",
                "cvzueigajytdmrdkgsxyqplbwn",
                "cvzujihljytomrdkgsxuqplbwn",
                "cvzueisajytomrddgsxkqplbwn",
                "cvzneihajytomrdkgsgaqplbwn",
                "cvzueihajytomrdkgsinmplbwn",
                "cveueihajyromrdkgsxfqplown",
                "cypueihajytotrdkgzxfqplbwn",
                "cvzuoihajytomvdqgsxfqplbwn",
                "cvzuekhejytwmrdkgsxfqplbwn",
                "cvzseihajytomrdkgsxfqgmbwn",
                "cvfuhihajytomrdkgsxfqplbwi",
                "cvzueihujxtomrdkgsufqplbwn",
                "cvzueihdjytomrdogsxfqplbwh",
                "cvzueihdjyfohrdkgsxfqplbwn",
                "cvtudihajytolrdkgsxfqplbwn",
                "cvzueihajytymrdkgshzqplbwn",
                "cvzuebhajytomxdkgsxfqplbwt",
                "cvzulihajyxomrdkgsbfqplbwn",
                "cvzueihajywomrdkgsxfqplbts",
                "cvzueihajytouodkdsxfqplbwn",
                "cvzueihajytomgdkgqxfqklbwn",
                "cvzubihajytomvdkgsxfqplmwn",
                "cvhueihajyyocrdkgsxfqplbwn",
                "zvzueihajytourdkgsxflplbwn",
                "cvzbeihajytomadkgsxfoplbwn",
                "cvzueihajytomrdkgnxfqplbsl",
                "cvfueihajftkmrdkgsxfqplbwn",
                "cvzuexhajytomryugsxfqplbwn",
                "cvzueihajytomsckgsxfqalbwn",
                "cvzuexhajytomrdkbsxfqpluwn",
                "cvzueihajytbmrtkgsxwqplbwn",
                "cvzueihajytomrdigsxfqqlbsn",
                "cvzweihajytomydkgsxfmplbwn",
                "bvzteihajytimrdkgsxfqplbwn",
                "cvzueihajytpmrdkgsxfcpbbwn",
                "cvzueigsjltomrdkgsxfqplbwn",
                "cvzueihajytomrikgsxfopldwn",
                "cvzueihajstomrdkgsxfqplgon",
                "cvzueimajytomrnkxsxfqplbwn",
                "cvzleihagatomrdkgsxfqplbwn",
                "cvbueihajotomrdkgsxfqjlbwn",
                "cvzueihajytomrdkgsxfqppnvn",
                "hvzueihajytomrdkghxfkplbwn",
                "cvzueigajytxmrdkgsxfqplbjn",
                "cvzueihaaxtokrdkgsxfqplbwn",
                "cvzueihajyeomrdkgujfqplbwn",
                "cvzueiwajpoomrdkgsxfqplbwn",
                "cvzieidtjytomrdkgsxfqplbwn",
                "cvzueihalytomrakbsxfqplbwn",
                "wtzueihajytomrdkgsxfqplbwq",
                "cvzuelhaiytomrdkgsxfqplcwn",
                "cvzueihajytomrdkgsxfqslswd",
                "cvzueihajytomrykgssfqplbon",
                "cvzueihfjytovrdegsxfqplbwn",
                "cvzueihajytomldqgsxfqplbwy",
                "cvzleihjjytomrtkgsxfqplbwn",
                "cvzueihaldtomrdtgsxfqplbwn",
                "cvzueihajytzmrdkgsxfeplqwn",
                "cvzueihrjytomddkgsxfqpgbwn",
                "cyzulihajytokrdkgsxfqplbwn",
                "cvsueihajytoordfgsxfqplbwn",
                "fvzueyhajytomrdkgaxfqplbwn",
                "cczueihajytobrdkgsefqplbwn",
                "cvzueihajytomcdrgscfqplbwn",
                "cvzuexhajyvomrdkgssfqplbwn",
                "cvzsmihajyiomrdkgsxfqplbwn",
                "cvzzeihajttomrdkgsxzqplbwn",
                "cvzseihajytomrdkgsxfqpebvn",
                "cvzueihajgthmrdkgsbfqplbwn",
                "ruzueihajytomrdkgsxfqphbwn",
                "cvzueihajytofrdkgsnfrplbwn",
                "cvzuetdajytojrdkgsxfqplbwn",
                "fvzueihajytomrdkghxfqpobwn",
                "cvzueihsjytomrdkgsxfqglbxn",
                "cvzueihajytowrdkgsxfqpsbun",
                "cvzteihaiytomrdkfsxfqplbwn",
                "cvzueihajytkmrdkrsxfqplvwn",
                "cvzueihajyoomrdkasxfqjlbwn",
                "lvzurihajytkmrdkgsxfqplbwn",
                "cvzueihajyyomrdagsxfqelbwn",
                "cvfueihajytomrdkgsxfqplbbx",
                "cvwueihajytommdkgkxfqplbwn",
                "cvzucicajytomrdkgsxcqplbwn",
                "dvzueihahytgmrdkgsxfqplbwn",
                "cvzuechajytomrdkgsxfqelwwn",
                "cvzuekhajytomrdkgsxknplbwn",
                "cvtueihajytomphkgsxfqplbwn",
                "cvzueihabytnzrdkgsxfqplbwn",
                "cvzusihajytomrdkgfxfqplban",
                "cvfueihajytomcdfgsxfqplbwn",
                "mvzueihapytomrdkgsxfdplbwn",
                "cvzueihajytomhdkgsxmqppbwn",
                "jvsueihajytomrdkgsxfqplbln",
                "cvzujihajybomrdkgsxtqplbwn",
                "cvzuekhawytomrdkgsxfqplbwc",
                "svzueihanytomrdogsxfqplbwn",
                "cvzujihajytodrdkgslfqplbwn",
                "cvgdeihajytorrdkgsxfqplbwn",
                "cvzbeihajytoprdkgsxfqplbyn",
                "cvzueihkyytomjdkgsxfqplbwn",
                "cvzuelhojytomrdkgsxfqjlbwn",
                "evzueihajytimrdkgsxfqpsbwn",
                "cvzueihajydomrdkjsxfqplbjn",
                "ovzteihajytosrdkgsxfqplbwn",
                "cvzueihajyaomrdzgsxfqplbgn",
                "cvzuewhajmtomrdkgsufqplbwn",
                "cvzueihajqtomhukgsxfqplbwn",
                "cvzueihajytomzqkgsxfqplbwk",
                "cazuewhakytomrdkgsxfqplbwn",
                "clzueihatytomrdkgzxfqplbwn",
                "dvzueihajytomqdkgsxfqpnbwn",
                "cvzueidajdtomrdkgsxtqplbwn",
                "cvzueihabytowrdkgsxoqplbwn",
                "cvzujihwjytomrdkgsxeqplbwn",
                "cvtuedhajytomrdkgsxfqplbbn",
                "cvzueihajcgomrdkgsxfqplswn",
                "cvzuephajyiomrdngsxfqplbwn",
                "cvzueihajythmqdkgsxfqplbwf",
                "cvzueitajytomrdkgsxfepvbwn",
                "cvzueihajytomydkgsxfqplvwb",
                "dvzueshajytomrddgsxfqplbwn",
                "cvzueihajytomrdkgvxfqpwben",
                "cvzueihajytomrdkgvxfpplwwn",
                "cvzuefhajftomrdkgsxfqrlbwn",
                "cvzueihajytpmrvkgsxfqplbcn",
                "cvzueihajytohrdkgsxfqxnbwn",
                "cvzueihajytomrdposxfqulbwn",
                "cozueihajytomrpkgsxfqrlbwn",
                "cvzuuihaxytomrdkgsxfqplbtn",
                "cvzueihajytomrbzgsxyqplbwn",
                "cveueihajyxoqrdkgsxfqplbwn",
                "cvzueihajytomrkkgsxfqptbrn",
                "cvzuezhajatomrdkssxfqplbwn",
                "cpzueihajytomrdkgsxfhplbwo",
                "lviueihajytomrekgsxfqplbwn",
                "cvzueihwjytomrdkusxfyplbwn",
                "cvzgeihajytomwdkgsxfrplbwn",
                "cvzsejhzjytomrdkgsxfqplbwn",
                "cvzuuihajytomrdkgsxfqdlbwz",
                "cvzjeihajytomrdugsxftplbwn",
                "cvzueihaxytomrrkgsxfmplbwn",
                "cvzueihajgtomrdhgsxfqplwwn",
                "cvzulihajytomedkgsxfqplewn",
                "cvzueivajytomrdkmsxfqplbwc",
                "cvzuervajytomrdkgsxfwplbwn",
                "cvzuemhcjytomrdkgslfqplbwn",
                "cvzyerhauytomrdkgsxfqplbwn",
                "cvzueihaoytomrdkgsyfqplewn",
                "cvzueihanytomrdkgsafkplbwn",
                "cvzueihajvtomrdugsxfqpcbwn",
                "chzueihajytamrdxgsxfqplbwn",
                "cvzueihalytomrdsgsxfqplbln",
                "cvzueihajytoyaykgsxfqplbwn",
                "tlzueihajyeomrdkgsxfqplbwn",
                "cvpueihajytbmrdkgsxfxplbwn",
                "cvzueihajytomjdkgsxuqplkwn",
                "cvzueihajygomrdkgkxfqplbwg",
                "cvzueihajhtomrdkgbxsqplbwn",
                "cvzurihajytomrdkgsafqplbwx",
                "cdzuezhajytomrdkgsxrqplbwn",
                "cvbueihajytotrwkgsxfqplbwn",
                "cwzkeihajytomrdkgsxfqplbwh",
                "cvzheihajytolrikgsxfqplbwn",
                "cozuevhajytomrdkgkxfqplbwn",
                "chzueihajytomrjkgsxfqulbwn",
                "cvzueihkjyromrdkgsxvqplbwn",
                "cvzveihajytomrdkgsxpqplnwn",
                "cvzueihajytoirdkgsxfqihbwn",
                "cvoueihajytomrdkgsxfqpdawn",
                "pvzueihajytomrdkgnxfqplbfn",
                "cvzueihakytomxdkgssfqplbwn",
                "cvzueivajytomrdbgsxaqplbwn",
                "cvzueihajytokrdkgszrqplbwn",
                "cvzuevhajytomrdkgsxgqplbwi",
                "cvzueihajylomrdkgsxflplbpn",
                "hvzueihajytomvdkgsxfqplgwn",
                "cvzleihajytymrrkgsxfqplbwn",
                "crzueieajytomrdkgsxfqplbon",
                "cszueihajytomrdlgqxfqplbwn",
                "cvzueihacytomrdkgsxfjblbwn",
                "cvzreihajytomrdkgsxfqplzun",
                "cvzurihajytomrdkgsxiqplawn",
                "uvzueihajyhovrdkgsxfqplbwn",
                "cvzueihajyqodrdkgssfqplbwn",
                "cvzwiihrjytomrdkgsxfqplbwn",
                "cqzueihajytomrdkgjxfqplban",
                "cvmueihajytoordkgsxfqplbyn",
                "cypueihajytomrdkgzxfqplbwn",
                "cvzueihajykomrdkgsmfqplbtn",
                "cvzueidajytimrdkgsxfqpdbwn",
                "cvzheihajytomrdkgsxfqpfewn",
                "dvzueihajytumrdzgsxfqplbwn",
                "cvzueixajytomrdkgsvfqplgwn",
                "cvzuevhzjyzomrdkgsxfqplbwn",
                "cvyeeihajytomrdkgsxnqplbwn",
                "cvzueihajytomrdkggtpqplbwn",
                "cvzceiyajytomrdkgexfqplbwn",
                "cvzuelhajyyomrdkzsxfqplbwn",
                "cvzhzihajygomrdkgsxfqplbwn",
                "cvzueihwjytomrdkgsgfqplbrn",
                "cvzsevhajytomrdkgqxfqplbwn",
                "cvzueiuajytomrdkgsxfppebwn",
                "nvzueihajytemrdkgsxwqplbwn",
                "cvzueihajytocgdkgsxfqvlbwn",
                "cczusihajytomrdkgsxfqplbpn",
                "cmzueihajytomrdkbsxwqplbwn",
                "cvzumfdajytomrdkgsxfqplbwn",
                "cvzueihcjytomrdkgsxfqplbkl",
                "cvzueihajytomawknsxfqplbwn",
                "kvzueihijytomrdkgsxdqplbwn",
                "cdzutihajytomrdkgsxfkplbwn",
                "cvzufihadylomrdkgsxfqplbwn",
                "cvzueihajytomrgkxsxfqphbwn",
                "cvzuewhajyzomrdkgsxfqelbwn",
                "cvzueihajytomrdkgqxfqelbwc",
                "cvzueshajyoomrdkgsxfqflbwn",
                "cvzueihajyromrekgixfqplbwn",
                "chzugihajytomrdkgsxfqplawn",
                "cvzueihajytomrdkgsxfhpmbwy",
                "cvzueihacytodxdkgsxfqplbwn",
                "cvzurihajytourdkgsdfqplbwn",
                "cvzzeihmjytomrddgsxfqplbwn",
                "cvzucyhajygomrdkgsxfqplbwn",
                "ckzueihzjytomrdkgsxwqplbwn",
                "cvlueihajmtozrdkgsxfqplbwn",
                "cvzkeihajytomrdkgsxfqclbwc",
                "cvzueihajytomrdkgsxgdplbwa",
                "cvzueihyjytoxrdkgcxfqplbwn",
                "cvzueizavytomfdkgsxfqplbwn",
                "cvzueihajwtosrdkgsxfqllbwn",
                "cvzueihajytomrdaksxfqpllwn",
                "cvzuuihojytombdkgsxfqplbwn",
                "cvzuiibajytpmrdkgsxfqplbwn",
                "cvzueihajyuomydkgsxfqplzwn",
                "cvzueihajytimrmkgsxfqplfwn",
                "cvzueihajytomrdkgzxfqpljwo"};
        ArrayList<Integer> arrays = new ArrayList<>();
        for (int i = 0; i < 250; i++) {
            for (int j = i + 1; j < 250; j++) {
                int wrong = 0;
                for (int k = 0; k < strings[i].length(); k++) {
                    if (strings[i].charAt(k) != strings[j].charAt(k)) {
                        wrong++;
                        wrongstring = strings[i].charAt(k);
                    }
                }
                if(wrong==1){
                    System.out.println(strings[i]);
                    System.out.println(strings[j]);
                    System.out.println(wrongstring);
                }
            }
        }
    }

}
