package com.leetcode;

import com.common.Util;

import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        int[][] workers = Util.readMatrixArr("[[7,0],[4,4],[7,1],[5,0],[6,1],[5,2]]");
        int[][] bikes = Util.readMatrixArr("[[1,2],[3,3]]");

        int[][] people = Util.readMatrixArr("[[782719,59],[97218,426],[285314,349],[537945,87],[205108,277],[669440,115],[71006,459],[425834,108],[343058,318],[574882,156],[606628,150],[693054,248],[208466,592],[449833,213],[185160,115],[967250,11],[745488,220],[567089,184],[419369,100],[401392,209],[564401,80],[527351,21],[768394,180],[366256,500],[23182,362],[200987,504],[62795,204],[171794,504],[941728,44],[711564,255],[935247,31],[370448,220],[420782,569],[330334,468],[889260,0],[242061,561],[82050,722],[971924,10],[334779,299],[592586,379],[362297,33],[980456,4],[112110,155],[776180,12],[293026,665],[834946,4],[315644,268],[712376,181],[874974,108],[891466,90],[426555,224],[536873,444],[790563,9],[936585,61],[230151,54],[252481,130],[110911,329],[440376,69],[68399,607],[79690,35],[16228,590],[614946,26],[837209,9],[928291,13],[210525,31],[416758,61],[475789,211],[633766,192],[987799,2],[744477,240],[88582,56],[822254,104],[63046,701],[123090,156],[838287,46],[497683,352],[529462,339],[313522,408],[970780,21],[6484,962],[952861,45],[134463,442],[644664,93],[786252,172],[252833,0],[858053,61],[184492,772],[527645,140],[959639,18],[325554,283],[936271,66],[765871,198],[755148,151],[303818,403],[480129,223],[846894,64],[321825,588],[839366,23],[742780,245],[819353,23],[674446,194],[478979,229],[612959,331],[442043,318],[61770,576],[17638,493],[84148,747],[783348,151],[680297,92],[261451,653],[18202,673],[736906,1],[62382,811],[735047,54],[789835,191],[843428,5],[747036,22],[984200,8],[875109,79],[237575,652],[982346,19],[73990,81],[598388,202],[310992,642],[276174,502],[771206,128],[262432,405],[470641,92],[323221,492],[525347,441],[140186,385],[234956,458],[324635,477],[517553,391],[153954,538],[660703,241],[389304,559],[223956,192],[229157,713],[671759,314],[511414,87],[241302,246],[696634,33],[537736,80],[990260,2],[544070,396],[307071,66],[207428,215],[473950,17],[633726,231],[420005,450],[43633,872],[802159,172],[244564,145],[172326,697],[377259,227],[410399,257],[480709,256],[713458,274],[743294,67],[298129,256],[964125,12],[159651,212],[217043,202],[477949,349],[608944,41],[985588,5],[391879,582],[305250,75],[654945,336],[62638,926],[300131,346],[34589,435],[798817,148],[577216,290],[638589,73],[384795,27],[632904,208],[493503,455],[349542,641],[899551,10],[992200,3],[412082,76],[175617,760],[506457,454],[671754,279],[2780,493],[340947,204],[366796,505],[53428,388],[695171,171],[390769,70],[21018,517],[146790,61],[874211,50],[467324,155],[167744,504],[377601,82],[75704,173],[997111,5],[558628,71],[713846,76],[853489,74],[604139,330],[732493,179],[367563,54],[69027,601],[910435,15],[533764,411],[638893,277],[812661,172],[56618,569],[432483,399],[654461,186],[365760,243],[177440,459],[713256,75],[282619,623],[363193,387],[785506,86],[79269,533],[253491,378],[777724,39],[938445,52],[488613,487],[48626,760],[120160,750],[9428,688],[398337,504],[221117,20],[593630,17],[810012,76],[882271,35],[760186,182],[172784,470],[321676,448],[913064,49],[566124,367],[315329,167],[510827,410],[28215,565],[189141,313],[64472,121],[955432,42],[765135,130],[60014,655],[174967,755],[907571,91],[449294,365],[854042,69],[857344,37],[164556,232],[826264,14],[646711,324],[249809,602],[895841,47],[351142,558],[51878,795],[184096,386],[775927,186],[544874,336],[824071,42],[747294,90],[969710,22],[599300,336],[317824,344],[451352,420],[634295,67],[288709,433],[997946,1],[62718,152],[564350,255],[572996,22],[67850,857],[534702,251],[253510,197],[677717,324],[193485,322],[479885,146],[900658,35],[505904,159],[411310,233],[827549,9],[950880,23],[46355,589],[37126,365],[486052,461],[703183,262],[873513,32],[46647,578],[794114,9],[507986,275],[206657,292],[637651,86],[10946,335],[40403,736],[492631,77],[561859,255],[874951,36],[418557,481],[454328,192],[868264,69],[540637,152],[835412,56],[875057,37],[701101,240],[200848,311],[499950,198],[722835,132],[503766,40],[803069,27],[740259,196],[503157,437],[741187,47],[599174,200],[365914,266],[615055,150],[930959,38],[952847,24],[181467,111],[78408,212],[907854,10],[999960,0],[391568,380],[977805,9],[830430,146],[707329,284],[782912,173],[279136,188],[154589,338],[349144,155],[53842,245],[803669,19],[215463,454],[412034,70],[611410,136],[611886,213],[679781,33],[983804,14],[28861,53],[121288,568],[449638,510],[963290,37],[786386,140],[203107,108],[962507,27],[462029,318],[336718,237],[617546,264],[457716,405],[804735,125],[733606,234],[84506,696],[278674,20],[297508,207],[186306,626],[183458,344],[943880,16],[311796,97],[877140,111],[106892,146],[760029,37],[992300,4],[114447,35],[812754,154],[631809,325],[757446,174],[243428,82],[547042,183],[126901,224],[859963,10],[161631,835],[841549,55],[784284,114],[130772,527],[774186,86],[232676,29],[197086,271],[142496,231],[274723,141],[152167,754],[304435,380],[705710,37],[784416,14],[265587,640],[231109,682],[30096,168],[592203,326],[633623,313],[678155,72],[645107,164],[82014,132],[988865,6],[575986,369],[770136,4],[413008,7],[935695,10],[198530,237],[503441,229],[881423,36],[62251,188],[660056,140],[334107,211],[326644,194],[624031,230],[997811,2],[446286,165],[341138,448],[187500,483],[895504,74],[988751,6],[296984,61],[802345,68],[197235,59],[299958,479],[452470,338],[684367,100],[824656,116],[53542,256],[120688,583],[152986,9],[264286,347],[615859,105],[112644,598],[802942,101],[778693,4],[605807,146],[610720,264],[585770,409],[800870,139],[112711,107],[279192,415],[766839,2],[199093,189],[248263,320],[258726,133],[990816,8],[238858,225],[709878,30],[686227,42],[547889,76],[435776,49],[554421,137],[476175,169],[595513,333],[15033,708],[360161,331],[608488,207],[667123,117],[707775,30],[931765,44],[42772,315],[155594,254],[418325,113],[630960,25],[28380,827],[939443,7],[46007,312],[58106,319],[967037,24],[764303,172],[537967,66],[200707,739],[564030,316],[67697,5],[757669,215],[762327,192],[967137,15],[886384,6],[744777,234],[232173,685],[833023,80],[261902,646],[700573,65],[465626,178],[559277,27],[845289,75],[27572,261],[297893,529],[473495,77],[895038,7],[116035,441],[353825,327],[268824,544],[800096,145],[450052,36],[482362,52],[918107,47],[14057,745],[693059,199],[635767,4],[633400,333],[33882,214],[892936,99],[964680,32],[727208,14],[854097,96],[424260,242],[484169,21],[648609,331],[328242,446],[569078,157],[82199,905],[997813,3],[709433,38],[159161,196],[220360,677],[51571,864],[529848,276],[879552,86],[735328,112],[134495,655],[842053,41],[359216,275],[704485,152],[471744,498],[989944,12],[320763,324],[858988,76],[586442,313],[9719,22],[201114,368],[795367,5],[641238,31],[633179,124],[938157,54],[524763,199],[939013,4],[794536,0],[753319,101],[443370,163],[930122,46],[446676,318],[288549,555],[528560,382],[426701,244],[661736,38],[386989,313],[580744,223],[469976,357],[838155,146],[830643,74],[966848,21],[949730,15],[473287,505],[43860,211],[964522,25],[535680,221],[724902,238],[643253,105],[31502,77],[726230,181],[765595,29],[457257,295],[26234,755],[529490,42],[499281,207],[424758,181],[214337,691],[496414,343],[968158,31],[608253,227],[343702,491],[209439,478],[695777,262],[163925,488],[438146,386],[213486,9],[513990,409],[537283,181],[911786,22],[321335,512],[401433,40],[209118,334],[771801,32],[821955,37],[940042,42],[35368,692],[686974,20],[776790,206],[690626,63],[803193,29],[241306,506],[548226,281],[191794,743],[780768,44],[125315,430],[153579,97],[703447,75],[121924,367],[154931,39],[125972,320],[175739,578],[787096,7],[960250,37],[4513,171],[253215,728],[342203,640],[673949,88],[299067,156],[555567,4],[742850,146],[834853,68],[704412,257],[104896,261],[413640,149],[628447,27],[511154,410],[71161,38],[313970,356],[279876,60],[196342,681],[363558,84],[327630,249],[211926,86],[692331,183],[430207,176],[177290,193],[61048,770],[854683,57],[327934,26],[71125,816],[459970,230],[496746,147],[565483,376],[314462,242],[775275,52],[951318,20],[253681,182],[514995,211],[18184,381],[765404,157],[626771,359],[80532,601],[853939,108],[834684,11],[600361,309],[610417,291],[690958,42],[575260,311],[551514,156],[710555,66],[652302,43],[551394,84],[235104,175],[726095,13],[554595,251],[703163,234],[443203,161],[813159,126],[471704,450],[321698,424],[15469,630],[833555,39],[901004,72],[869388,39],[869906,69],[182313,140],[386251,146],[500113,268],[496619,290],[531187,302],[597698,124],[481135,24],[59619,573],[387570,6],[883852,30],[779927,28],[805545,92],[431554,235],[171894,399],[416032,473],[203630,707],[196008,149],[907231,40],[43682,63],[256709,434],[704485,101],[46387,692],[266994,626],[220239,514],[216249,103],[72999,4],[425913,446],[594861,147],[957436,43],[715235,65],[6071,507],[293554,596],[876229,62],[64835,98],[241042,351],[836299,81],[432110,307],[680589,26],[703868,172],[572601,96],[258803,157],[359554,448],[949164,10],[670806,69],[831160,112],[413069,34],[480878,165],[53150,333],[678241,135],[29501,335],[908766,65],[111544,462],[114526,702],[204105,99],[699356,166],[561149,303],[935500,72],[870037,3],[67660,895],[163042,337],[84821,853],[343444,255],[251761,348],[930242,37],[989693,14],[450857,101],[886978,94],[891254,85],[948088,54],[486946,284],[140492,658],[481123,36],[707074,249],[318023,445],[698078,115],[537541,288],[827834,33],[788777,85],[664872,203],[563181,287],[636010,301],[272784,155],[162069,289],[527998,225],[328364,126],[953877,24],[586311,324],[996966,0],[489210,162],[258051,490],[785752,103],[392187,479],[788924,110],[30386,711],[116632,116],[295657,411],[317458,468],[155066,819],[106687,852],[804712,22],[511625,31],[552368,410],[857366,17],[977904,19],[468232,312],[205946,676],[394080,307],[138264,365],[550658,139],[807124,169],[728802,13],[482649,345],[774565,26],[869451,64],[28656,507],[419962,313],[644696,302],[29729,292],[581324,343],[564037,386],[283858,538],[785900,11],[419117,430],[452111,234],[127682,161],[835733,19],[690868,309],[83598,492],[157265,110],[33621,699],[762508,151],[671564,161],[382211,391],[393799,49],[513271,299],[659818,267],[357055,291],[160450,88],[534319,132],[358641,319],[510539,45],[922596,41],[459967,350],[411556,209],[498187,502],[409560,148],[757408,163],[404628,46],[976257,3],[488339,388],[820659,19],[420959,428],[512505,103],[19540,26],[655804,120],[217934,600],[1642,623],[469147,492],[871043,79],[259617,349],[720737,112],[598623,155],[487534,448],[934303,41],[869528,68],[286229,54],[376850,382],[334055,474],[286977,85],[224149,667],[624893,149],[770711,107],[933007,9],[399826,127],[347194,58],[104524,411],[405247,594],[220435,14],[999213,1],[123786,768],[747319,144],[744777,186],[565744,154],[395738,115],[243658,674],[849492,91],[520631,16],[833102,82],[992893,5],[252277,625],[268428,700],[972417,15],[337363,631],[352949,46],[361246,256],[394660,575],[186733,215],[48401,55],[295539,402],[155027,822],[942709,35],[199267,486],[945229,56],[88109,379],[734017,266],[728279,258],[951142,4],[919358,50],[500838,256],[190528,68],[726503,269],[164626,570],[570124,406],[749339,222],[461929,470],[69410,226],[418417,429],[403454,327],[161002,427],[506853,51],[793078,128],[502308,161],[491186,318],[735668,179],[552958,438],[797756,98],[638368,320],[378337,302],[150212,21],[450127,1],[1379,525],[946550,23],[599372,260],[1842,716],[557302,335],[159999,386],[535326,209],[999242,0],[257692,582],[217177,483],[63328,635],[915875,43],[122431,821],[450250,285],[787582,117],[657902,117],[545290,95],[910875,18],[374729,202],[34225,811],[101662,153],[376250,377],[411305,257],[494151,439],[180237,374],[510062,331],[178440,679],[716509,190],[478661,435],[727699,47],[248617,364],[967523,25],[251327,679],[794893,178],[591440,255],[936636,60],[939255,58],[8430,149],[543363,374],[833934,5],[62934,927],[758863,54],[553902,406],[562275,390],[541320,22],[728906,134],[128825,332],[756387,168],[882584,87],[211983,281],[658082,166],[661448,296],[946632,26],[861120,48],[244856,127],[312851,25],[543483,211],[29448,245],[108003,572],[335526,425],[270210,140],[349476,649],[345764,552],[616554,53],[454833,185],[387964,432],[664225,159],[823381,56],[295407,105],[865573,114],[528784,209],[238502,49],[374759,55],[336688,35],[420424,345],[582315,281],[124046,774],[992210,5],[125413,523],[506748,383],[296358,273],[319300,490],[236448,461],[339680,389],[187937,589],[842292,129],[258962,729],[676898,220],[728258,71],[769257,162],[682775,232],[87195,163],[573790,91],[736335,40],[144369,544],[946277,0],[668784,156],[516898,447],[52176,855],[735658,180],[833661,131],[382700,60],[708313,43],[545820,259],[781272,125],[871000,36],[108342,745],[591002,324],[61648,213],[864840,17],[483316,2],[642738,183],[896499,37]]");
//        int[][] people = Util.readMatrixArr("[[2,4],[3,4],[9,0],[0,6],[7,1],[6,0],[7,3],[2,5],[1,1],[8,0]]");
        long start = System.currentTimeMillis();
        Object result = new Main().reconstructQueue(people);
        long stop = System.currentTimeMillis();
        if (result.getClass().getSimpleName().equals("int[]")) {
            Util.printArr((int[]) result);
        } else {
            System.out.println(result);
        }
        System.out.println((stop - start) + "ms");
        System.out.println((s) + "ms");
    }

    public int findMin(int[] arr, int exclude) {
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (i == exclude) {
                continue;
            }
            min = Math.min(min, arr[i]);
        }
        return min;
    }

    class MinStack {

        private int min = Integer.MAX_VALUE;
        private List<Integer> data = new LinkedList<>();


        /**
         * initialize your data structure here.
         */
        public MinStack() {
        }

        public void push(int x) {
            data.add(x);
            if (x < min) {
                min = x;
            }
        }

        public void pop() {
            int remove = data.remove(data.size() - 1);
            if (remove == min) {
                findMin();
            }
        }

        public int top() {
            return data.get(data.size() - 1);
        }

        private void findMin() {
            min = Integer.MAX_VALUE;
            for (int t : data) {
                if (t < min) {
                    min = t;
                }
            }
        }

        public int getMin() {
            return min;
        }
    }

    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(x);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */

    private List<Integer> window = new LinkedList<>();
    private Map<Integer, Integer> counterMap = new LinkedHashMap<>();
    private Map<Integer, List<Map.Entry<Integer, Integer>>> kMap = new HashMap<>();
    private Map<Integer, Map.Entry<Integer, Integer>> boundMap = new HashMap<>();
    private List<Map.Entry<Integer, Integer>> result = new ArrayList<>();


    public int[][] reconstructQueue(int[][] people) {
        for (int[] item : people) {
            Map.Entry<Integer, Integer> entry = new AbstractMap.SimpleEntry<>(item[0], item[1]);
            kMap.compute(item[1], (k, v) -> {
                if (v == null) {
                    v = new LinkedList<>();
                }
                v.add(entry);
                return v;
            });
        }
        kMap.forEach((k, v) -> v.sort(Comparator.comparingInt(Map.Entry::getKey)));
        while (result.size() != people.length) {
            List<Integer> positions = new ArrayList<>(counterMap.keySet());
            positions.add(0, 0);
            int lastBound = 0;
            for (int i = positions.size() - 1; i >= 0; i--) {
                int position = positions.get(i);
                int bound = position == 0 ? Integer.MAX_VALUE : counterMap.get(position);

                Map.Entry<Integer, Integer> match = findItem(kMap.get(position), lastBound, bound);
                lastBound = ++bound;
                if (match == null) {
                    continue;
                }
                result.add(match);
                pushItem(match.getKey());
                break;
            }
        }
        int[][] res = new int[people.length][2];
        for (int i = 0; i < people.length; i++) {
            Map.Entry<Integer, Integer> item = result.get(i);
            res[i][0] = item.getKey();
            res[i][1] = item.getValue();
        }
        return res;
    }

    public Map.Entry<Integer, Integer> findItem(List<Map.Entry<Integer, Integer>> list, int down, int up) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int size = list.size();
        int min = list.get(0).getKey();
        int max = list.get(size - 1).getKey();
        if (up < min || max < down) {
            return null;
        }

        for (int i = 0; i < size; i++) {
            Map.Entry<Integer, Integer> item = list.get(i);
            if (item.getKey() >= down && item.getKey() <= up) {
                list.remove(i);
                return item;
            }
        }

        return null;
    }

    private static long s = 0;

    public void pushItem(int h) {
        long s1 = System.currentTimeMillis();
        if (window.isEmpty()) {
            window.add(h);
        } else {
            int size = window.size();
            if (h < window.get(size - 1)) {
                window.add(h);
            } else {
                int i = 0;
                for (; i < size; i++) {
                    if (h >= window.get(i)) {
                        window.add(i, h);
                        break;
                    }
                }
            }
        }
        int size = window.size();
        int cur = window.get(0);
        counterMap.clear();
        for (int i = 1; i < size; i++) {
            int t = window.get(i);
            if (t != cur) {
                counterMap.put(i, cur);
                cur = t;
            }
        }
        counterMap.put(size, window.get(size - 1));
        s += (System.currentTimeMillis() - s1);
    }

    class Pair1057 {
        int worker;
        int workerX, workerY;
        int bike;
        int bikeX, bikeY;
        int distance;

        public Pair1057(int worker, int workerX, int workerY, int bike, int bikeX, int bikeY) {
            this.worker = worker;
            this.workerX = workerX;
            this.workerY = workerY;
            this.bike = bike;
            this.bikeX = bikeX;
            this.bikeY = bikeY;
            this.distance = manhattan(workerX, workerY, bikeX, bikeY);
        }

        public int compare(Pair1057 other) {
            int ans = Integer.compare(distance, other.distance);
            if (ans == 0) {
                ans = Integer.compare(this.worker, other.worker);
            }
            if (ans == 0) {
                ans = Integer.compare(this.bike, other.bike);
            }
            return ans;
        }
    }

    // leetcode 1057 校园自行车分配
    public int[] assignBikes(int[][] workers, int[][] bikes) {
        int n = workers.length;
        int m = bikes.length;
        List<Pair1057> pairs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                pairs.add(new Pair1057(i, workers[i][0], workers[i][1], j, bikes[j][0], bikes[j][1]));
            }
        }
        pairs.sort(Pair1057::compare);
        Set<Integer> usedWorker = new HashSet<>();
        Set<Integer> usedBike = new HashSet<>();
        List<Pair1057> matched = new ArrayList<>();
        for (int i = 0; i < pairs.size(); i++) {
            Pair1057 p = pairs.get(i);
            if (usedWorker.contains(p.worker) || usedBike.contains(p.bike)) {
                continue;
            }
            matched.add(p);
            usedBike.add(p.bike);
            usedWorker.add(p.worker);
        }
        matched.sort(Comparator.comparingInt(p -> p.worker));
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = matched.get(i).bike;
        }
        return ans;
    }

    public int manhattan(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }

    private char[] vowel = new char[]{'a', 'e', 'i', 'o', 'u'};
    private Map<Character, Integer> vowelIndex = new HashMap<>();
    private long[][] vowelDp = new long[5][20001];

    public int countVowelPermutation(int n) {
        if (n == 1) {
            return vowel.length;
        }
        for (int i = 0; i < vowel.length; i++) {
            vowelIndex.put(vowel[i], i);
        }
        long count = 0L;
        for (int i = 1; i <= n; i++) {
            count = 0L;
            for (int j = 0; j < vowel.length; j++) {
                count += countVowelPermutation(vowel[j], i - 1);
            }
        }
        return (int) (count % (10e8 + 7));
    }

    public long countVowelPermutation(char lastChar, int n) {
        if (n == 0) {
            return 1L;
        }
        int index = vowelIndex.get(lastChar);
        if (vowelDp[index][n] != 0) {
            return vowelDp[index][n];
        }
        long count = 0L;
        switch (lastChar) {
            case 'a':
                count += countVowelPermutation('e', n - 1);
                break;
            case 'e':
                count += countVowelPermutation('a', n - 1);
                count += countVowelPermutation('i', n - 1);
                break;
            case 'i':
                for (char c : vowel) {
                    if (c == 'i') {
                        continue;
                    }
                    count += countVowelPermutation(c, n - 1);
                }
                break;
            case 'o':
                count += countVowelPermutation('i', n - 1);
                count += countVowelPermutation('u', n - 1);
                break;
            case 'u':
                count += countVowelPermutation('a', n - 1);
                break;
        }
        count = (long) (count % (10e8 + 7));
        vowelDp[index][n] = count;
        return count;
    }

    private int[] directX = new int[]{-1, 1, 0, 0};
    private int[] directY = new int[]{0, 0, -1, 1};
    private int[][] grid5215;
    private int gridX, gridY;
    private int goldCount = 0;

    // leetcode 5215 黄金矿工
    public int getMaximumGold(int[][] grid) {
        grid5215 = grid;
        gridX = grid.length;
        gridY = grid[0].length;
        for (int i = 0; i < gridX; i++) {
            for (int j = 0; j < gridY; j++) {
                goldMine(i, j, 0);
            }
        }
        return goldCount;
    }

    public void goldMine(int x, int y, int count) {
        if (x < 0 || x >= gridX || y < 0 || y >= gridY) {
            return;
        }
        int gold = grid5215[x][y];
        if (gold == 0) {
            return;
        } else {
            grid5215[x][y] = 0;
            count += gold;
        }
        for (int i = 0; i < 4; i++) {
            int newX = x + directX[i];
            int newY = y + directY[i];
            goldMine(newX, newY, count);
        }
        goldCount = Math.max(goldCount, count);
        grid5215[x][y] = gold;
    }

    // leetcode 5214 最长定差子序列
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int len = map.getOrDefault(arr[i] - difference, 0) + 1;
            map.put(arr[i], len);
            max = Math.max(max, len);
        }
        return max;
    }

    // leetcode 5212 玩筹码
    public int minCostToMoveChips(int[] chips) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : chips) {
            map.compute(i, (k, v) -> {
                if (v == null) {
                    v = 0;
                }
                v++;
                return v;
            });
        }
        int count1 = 0, count2 = 0;
        for (int k : map.keySet()) {
            if (k % 2 == 0) {
                count1 += map.get(k);
            } else {
                count2 += map.get(k);
            }
        }
        return Math.min(count1, count2);
    }

    // leetcode 5099 验证回文字符串 III
    public boolean isValidPalindrome(String s, int k) {
        int len = s.length();
        int[][] dp = new int[len][len];
        for (int i = 1; i <= len; i++) {
            for (int j = 0; j < len - i; j++) {
                int j1 = j + i;
                if (s.charAt(j) == s.charAt(j1)) {
                    dp[j][j1] = dp[j + 1][j1 - 1];
                } else {
                    dp[j][j1] = Math.min(dp[j + 1][j1] + 1, dp[j][j1 - 1] + 1);
                }
            }
        }
        return dp[0][len - 1] <= k;
    }

    // leetcode 5081 步进数
    public List<Integer> countSteppingNumbers(int low, int high) {
        List<Integer> result = new ArrayList<>();
        if (low > high) {
            return result;
        }
        if (low == 0) {
            result.add(0);
            low++;
        }
        int lowLen = (int) Math.floor(Math.log10(low) + 1);
        int highLen = (int) Math.floor(Math.log10(high) + 1);

        for (int i = lowLen; i <= highLen; i++) {
            for (int j = 1; j < 10; j++) {
                countSteppingHelper(result, low, high, i, j);
            }
        }
        result.sort(Integer::compareTo);
        return result;
    }

    public void countSteppingHelper(List<Integer> res, int low, int high, int length, long num) {
        if (length - 1 == 0) {
            if (low <= num && num <= high) {
                res.add((int) num);
            }
            return;
        }
        int lastDigit = (int) (num % 10);
        if (lastDigit == 0) {
            countSteppingHelper(res, low, high, length - 1, num * 10 + 1);
        } else if (lastDigit == 9) {
            countSteppingHelper(res, low, high, length - 1, num * 10 + 8);
        } else {
            countSteppingHelper(res, low, high, length - 1, num * 10 + lastDigit + 1);
            countSteppingHelper(res, low, high, length - 1, num * 10 + lastDigit - 1);
        }
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // leetcode 5080 查找两棵二叉搜索树之和

    public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
        Set<Integer> set1 = new HashSet<>();
        readNode(root1, set1);
        Set<Integer> set2 = new HashSet<>();
        readNode(root2, set2);
        for (int i : set1) {
            if (set2.contains(target - i)) {
                return true;
            }
        }
        return false;
    }

    public void readNode(TreeNode node, Set<Integer> set) {
        set.add(node.val);
        if (node.left != null) {
            readNode(node.left, set);
        }
        if (node.right != null) {
            readNode(node.right, set);
        }
    }


    // leetcode
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        if (arr1.length == 0 || arr2.length == 0 || arr3.length == 0) {
            return new ArrayList<>();
        }
        Map<Integer, Boolean> map2 = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            map2.put(arr2[i], true);
        }
        Map<Integer, Boolean> map3 = new HashMap<>();
        for (int n : arr3) {
            map3.put(n, true);
        }
        List<Integer> result = new ArrayList<>();
        for (int n : arr1) {
            if (map2.containsKey(n) && map3.containsKey(n)) {
                result.add(n);
            }
        }
        return result;
    }

    // leetcode 1061 按字典序排列最小的等效字符串
    public String smallestEquivalentString(String A, String B, String S) {
        List<Set<Character>> list = new ArrayList<>();
        int len = A.length();
        for (int i = 0; i < len; i++) {
            char a = A.charAt(i);
            char b = B.charAt(i);
            boolean find = false;
            for (Set<Character> set : list) {
                if (set.contains(a) || set.contains(b)) {
                    set.add(a);
                    set.add(b);
                    find = true;
                    break;
                }
            }
            if (!find) {
                Set<Character> set = new HashSet<>();
                set.add(a);
                set.add(b);
                list.add(set);
            }
        }
        len = S.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char c = S.charAt(i);
            sb.append(c);
        }
        return sb.toString();
    }

    // leetcode 1060 有序数组中的缺失元素
    public int missingElement(int[] nums, int k) {
        int cur = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int next = nums[i];
            int gap = next - cur - 1;
            if (gap == 0) {
                cur = next;
                continue;
            }
            if (gap >= k) {
                return cur + k;
            }
            k -= gap;
            cur = next;
        }
        return cur + k;
    }

    // leetcode 41 缺失的第一个正数
    public int firstMissingPositive(int[] nums) {
        List<Long> flags = new ArrayList<>();
        while (flags.size() < (nums.length - 1) / 64 + 1) {
            flags.add(0L);
        }
        for (int n : nums) {
            if (n > nums.length || n <= 0) {
                continue;
            }
            int index = (n - 1) / 64;
            n = (n - 1) % 64 + 1;
            flags.set(index, flags.get(index) | (1L << (n - 1)));
        }
        for (int i = 1; i <= nums.length; i++) {
            int index = (i - 1) / 64;
            if (((1L << (i - 1)) & flags.get(index)) == 0) {
                return i;
            }
        }
        return nums.length + 1;
    }

    class LCP5Node {
        int n;
        long coins = 0;
        LCP5Node parent;
        Map<Integer, LCP5Node> children = new HashMap<>();

        LCP5Node(int n) {
            this.n = n;
        }

        public void setParent(LCP5Node parent) {
            this.parent = parent;
        }

        public void addChild(LCP5Node child) {
            children.put(child.n, child);
        }

        public int getChildrenCount() {
            if (childrenCountMap.containsKey(this)) {
                return childrenCountMap.get(this);
            }
            int count = children.size();
            for (LCP5Node child : children.values()) {
                count += child.getChildrenCount();
            }
            childrenCountMap.put(this, count);
            return count;
        }

        public long addCoinsWithChildren(long coins) {
            for (LCP5Node child : children.values()) {
                child.addCoinsWithChildren(coins);
            }
            long collectiveCoins = (getChildrenCount() + 1) * coins;
            this.coins += collectiveCoins;
            return collectiveCoins;
        }

        public void addCoins(long coins) {
            this.coins += coins;
            LCP5Node parent = this.parent;
            while (parent != null) {
                parent.coins += coins;
                parent = parent.parent;
            }
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof LCP5Node)) {
                return false;
            }
            LCP5Node other = (LCP5Node) obj;
            return this.n == other.n;
        }

        @Override
        public String toString() {
            return String.format("%d-%d", n, coins);
        }

        @Override
        public int hashCode() {
            return ("" + n).hashCode();
        }
    }

    private Map<Integer, LCP5Node> leaderMap = new HashMap<>();
    private Map<LCP5Node, Integer> childrenCountMap = new HashMap<>();

    // leetcode LCP 5  发LeetCoins
    public int[] bonus(int n, int[][] leadership, int[][] operations) {
        for (int i = 0; i < n - 1; i++) {
            int leaderNum = leadership[i][0];
            LCP5Node leader = leaderMap.compute(leaderNum, (k, v) -> {
                if (v == null) {
                    v = new LCP5Node(leaderNum);
                }
                return v;
            });
            int memberNum = leadership[i][1];
            LCP5Node member = leaderMap.compute(memberNum, (k, v) -> {
                if (v == null) {
                    v = new LCP5Node(memberNum);
                }
                return v;
            });
            member.setParent(leader);
            leader.addChild(member);
        }
        int[] result = new int[operations.length];
        int count = 0;
        for (int i = 0; i < operations.length; i++) {
            int type = operations[i][0];
            int member = operations[i][1];
            LCP5Node node = leaderMap.get(member);
            switch (type) {
                case 1:
                    node.addCoins(operations[i][2]);
                    break;
                case 2:
                    long moreCoins = node.addCoinsWithChildren(operations[i][2]);
                    if (node.parent != null) {
                        node.parent.addCoins(moreCoins);
                    }
                    break;
                case 3:
                    result[count++] = (int) (node.coins % (1e9 + 7));
            }
        }
        return Arrays.copyOf(result, count);
    }

    // leetcode LCP 4 多米诺骨牌 二分图 匈牙利算法
    public int domino(int n, int m, int[][] broken) {
        Map<PointLCF4, PointLCF4> cache = new HashMap<>();
        Map<PointLCF4, List<PointLCF4>> map = new HashMap<>();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < broken.length; i++) {
            matrix[broken[i][0]][broken[i][1]] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] != 0) {
                    continue;
                }
                if ((i + j) % 2 == 0) {
                    PointLCF4 left = new PointLCF4(i, j);
                    List<PointLCF4> right = new ArrayList<>();
                    for (int k = 0; k < 4; k++) {
                        int xx = i + offsetLCP4X[k];
                        int yy = j + offsetLCP4Y[k];
                        if (xx >= 0 && xx < n && yy >= 0 && yy < m && matrix[xx][yy] == 0) {
                            PointLCF4 r = new PointLCF4(xx, yy);
                            r = cache.getOrDefault(r, r);
                            cache.put(r, r);
                            right.add(r);
                        }
                    }
                    map.put(left, right);
                }
            }
        }
        for (PointLCF4 left : map.keySet()) {
            Map<PointLCF4, Boolean> used = new HashMap<>();
            hungray(map, used, left);
        }
        int count = 0;
        for (PointLCF4 left : map.keySet()) {
            count += (left.getMatch() == null ? 0 : 1);
        }
        return count;
    }

    public boolean hungray(Map<PointLCF4, List<PointLCF4>> map, Map<PointLCF4, Boolean> used, PointLCF4 left) {
        List<PointLCF4> rightList = map.get(left);
        if (rightList == null || rightList.isEmpty()) {
            return false;
        }
        for (PointLCF4 right : rightList) {
            if (!used.getOrDefault(right, false)) {
                used.put(right, true);
                if (right.getMatch() == null || hungray(map, used, right.getMatch())) {
                    left.setMatch(right);
                    right.setMatch(left);
                    return true;
                }
            }
        }
        return false;
    }

    class PointLCF4 {
        int x;
        int y;

        PointLCF4 match;

        public PointLCF4(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof PointLCF4)) {
                return false;
            }
            PointLCF4 other = (PointLCF4) obj;
            return this.x == other.x && this.y == other.y;
        }

        @Override
        public int hashCode() {
            return toString().hashCode();
        }

        @Override
        public String toString() {
            return String.format("[%d,%d]", x, y);
        }

        public PointLCF4 getMatch() {
            return match;
        }

        public void setMatch(PointLCF4 match) {
            this.match = match;
        }
    }

    private int[][] matrixLCP4;
    private int maxDomino = 0;
    private int maxLCP4X;
    private int maxLCP4Y;
    private int[] offsetLCP4X = new int[]{-1, 1, 0, 0};
    private int[] offsetLCP4Y = new int[]{0, 0, -1, 1};

    // leetcode LCP 4 多米诺骨牌 回溯 超时！！！
    public int dominoDFS(int n, int m, int[][] broken) {
        maxLCP4X = n;
        maxLCP4Y = m;
        matrixLCP4 = new int[n][m];
        for (int i = 0; i < broken.length; i++) {
            matrixLCP4[broken[i][0]][broken[i][1]] = 2;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dfsLCP4(i, j, 0);
            }
        }
        return maxDomino;
    }

    public void dfsLCP4(int x, int y, int step) {
        if (!checkBoundLCF4(x, y)) {
            maxDomino = Math.max(maxDomino, step);
            return;
        }
        matrixLCP4[x][y] = 1;
        for (int i = 0; i < 4; i++) {
            int x1 = x + offsetLCP4X[i];
            int y1 = y + offsetLCP4Y[i];
            if (!checkBoundLCF4(x1, y1)) {
                continue;
            }
            if (matrixLCP4[x1][y1] == 0) {
                matrixLCP4[x1][y1] = 1;
                step++;
            } else {
            }
            for (int j = 0; j < 4; j++) {
                int x2 = x1 + offsetLCP4X[j];
                int y2 = y1 + offsetLCP4Y[j];
                dfsLCP4(x2, y2, step);
            }
            matrixLCP4[x1][y1] = 0;
            step--;
        }
        matrixLCP4[x][y] = 0;
    }

    public boolean checkBoundLCF4(int x, int y) {
        return !(x < 0 || x >= maxLCP4X || y < 0 || y >= maxLCP4Y || matrixLCP4[x][y] != 0);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // leetcode 1063 有效子数组数目
    public int validSubarrays(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] >= nums[i]) {
                    result++;
                } else {
                    break;
                }
            }
        }
        return result;
    }

    public int maxCoins(int[] nums) {
        int len = nums.length;
        int dp[][] = new int[len + 2][len + 2];
        int[] newNums = new int[len + 2];
        len += 2;
        for (int i = 1; i < len - 1; i++) {
            newNums[i] = nums[i - 1];
        }
        newNums[0] = 1;
        newNums[len - 1] = 1;

        for (int i = 2; i < len; i++) {
            for (int j = 0; i + j < len; j++) {
                for (int k = j + 1; k < i + j; k++) {
                    dp[j][i + j] = Math.max(dp[j][i + j], dp[j][k] + dp[k][i + j] + newNums[k] * newNums[j] * newNums[i + j]);
                }
            }
        }
        return dp[0][len - 1];
    }


    // 最长连续序列
    // leetcode 128
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.compute(nums[i], (k, v) -> {
                if (v == null) {
                    v = 1;
                }
                return v;
            });
        }
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int v = nums[i];
            if (!map.containsKey(v)) {
                continue;
            }
            int len = 1;
            Integer last, next;
            v = nums[i];
            while ((last = map.get(--v)) != null) {
                len += last;
                map.remove(v);
            }
            v = nums[i];
            while ((next = map.get(++v)) != null) {
                len += next;
                map.remove(v);
            }
            if (len > max) {
                max = len;
            }
        }
        return max;
    }

    // 接雨水
    // leetcode 42
    public int trap(int[] height) {
        if (height.length == 0) {
            return 0;
        }
        int total = 0;
        for (int i = 0; i < height.length; ) {
            if (height[i] == 0) {
                i++;
                continue;
            }
            int water = 0;
            int j = i + 1;
            int nextPeek = 0;
            for (; j < height.length; j++) {
                if (height[j] > nextPeek) {
                    nextPeek = height[j];
                }
                if (height[j] >= height[i]) {
                    break;
                } else {
                    water += height[i] - height[j];
                }
            }
            if (nextPeek < height[i]) {
                water = 0;
                int k = i + 1;
                for (; k < height.length; k++) {
                    if (height[k] >= nextPeek) {
                        break;
                    }
                    water += nextPeek - height[k];
                }
                i = k;
            } else {
                if (j == height.length) {
                    water = 0;
                    i++;
                } else {
                    i = j;
                }
            }
            total += water;
        }
        return total;
    }

    // 最长有效括号
    // leetcode 32
    public int longestValidParentheses(String s) {
        Map<Integer, Integer> match = new HashMap<>();
        Stack<Map.Entry<Character, Integer>> stack = new Stack<>();
        int m = -1, n = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(new AbstractMap.SimpleEntry<>(c, i));
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    continue;
                }
                if (stack.peek().getKey() == '(') {
                    Map.Entry<Character, Integer> entry = stack.pop();
                    if (m == -1 && n == -1) {
                        m = entry.getValue();
                        n = i;
                    } else {
                        if (n + 1 == entry.getValue()) {
                            n = i;
                            m = Math.min(m, entry.getValue());
                        } else if (n + 1 == i) {
                            n = i;
                            m = entry.getValue();
                        } else {
                            m = entry.getValue();
                            n = i;
                        }
                    }
                    match.put(m, n);
                } else {
                    stack.push(new AbstractMap.SimpleEntry<>(c, i));
                }
            }
        }
        int max = 0;
        for (int start : match.keySet()) {
            int next = match.get(start) + 1;
            while (match.containsKey(next)) {
                next = match.get(next) + 1;
            }
            if (next - start > max) {
                max = next - start;
            }
        }
        return max;
    }

    // 合并K个排序链表
    // leetcode 23

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        return mergeKLists(0, lists.length - 1, lists);
    }

    public ListNode mergeKLists(int start, int end, ListNode[] lists) {
        if (start == end) {
            return lists[start];
        }
        if (end - start == 1) {
            ListNode res = new ListNode(0);
            ListNode cur = res;
            ListNode a = lists[start];
            ListNode b = lists[end];
            while (true) {
                if (a == null) {
                    cur.next = b;
                    break;
                }
                if (b == null) {
                    cur.next = a;
                    break;
                }
                if (a.val <= b.val) {
                    cur.next = new ListNode(a.val);
                    a = a.next;
                } else {
                    cur.next = new ListNode(b.val);
                    b = b.next;
                }
                cur = cur.next;
            }
            return res.next;
        }
        int mid = (end - start + 1) / 2;
        return mergeKLists(new ListNode[]{mergeKLists(start, start + mid - 1, lists), mergeKLists(start + mid, end, lists)});
    }

    // 不同路径
    // leetcode 980

    int step = 0;
    int[][] grid;
    int startX, startY;
    int endX, endY;
    int stepLine = 0;
    int[] offsetX = new int[]{-1, 1, 0, 0};
    int maxX, maxY;
    int[] offsetY = new int[]{0, 0, -1, 1};

    public int uniquePathsIII(int[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        maxX = grid.length;
        maxY = grid[0].length;
        this.grid = grid;
        for (int i = 0; i < maxX; i++) {
            for (int j = 0; j < maxY; j++) {
                int v = grid[i][j];
                if (v == 1) {
                    startX = i;
                    startY = j;
                } else if (v == 2) {
                    endX = i;
                    endY = j;
                } else if (v == 0) {
                    step++;
                }
            }
        }
        dfs(startX, startY, ++step);
        return stepLine;
    }

    public void dfs(int x, int y, int step) {
        if (step < 0) {
            return;
        }
        if (step == 0 && (x == endX && y == endY)) {
            stepLine++;
            return;
        }
        if (grid[x][y] == 0) {
            grid[x][y] = -1;
        }
        --step;
        for (int i = 0; i < 4; i++) {
            int nx = x + offsetX[i];
            int ny = y + offsetY[i];
            if (nx >= 0 && nx < maxX && ny >= 0 && ny < maxY) {
                if (grid[nx][ny] == 0 || (grid[nx][ny] == 2 && step == 0)) {
                    dfs(nx, ny, step);
                }
            }
        }
        if (grid[x][y] == -1) {
            grid[x][y] = 0;
        }
    }


    // 通配符匹配
    // leetcode 44
    // 动态规划
    public boolean isCommonRegexMatchDynamic(String s, String p) {
        int m = s.length();
        int n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;

        for (int i = 1; i <= n; i++) {
            if (p.charAt(i - 1) == '*') {
                dp[0][i] = true;
                continue;
            }
            break;
        }
        for (int i = 1; i <= m; i++) {
            dp[i][0] = false;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j - 1] && (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?');
                }
            }
        }
        return dp[m][n];
    }

    // 回溯 超时
    public boolean isCommonRegexMatch(String s, String p) {
        regexMap.clear();
        p = removeCommonRegex(p);
        if (p.length() >= 3 && p.charAt(0) == '*' && p.charAt(p.length() - 1) == '*') {
            boolean other = false;
            for (int i = 1; i < p.length() - 1; i++) {
                if (p.charAt(i) == '*' || p.charAt(i) == '?') {
                    other = true;
                    break;
                }
            }
            if (!other) {
                return s.contains(p.substring(1, p.length() - 1));
            }
        }
        return isCommonRegexMatch0(s, p);
    }

    public Map<String, Boolean> regexMap = new HashMap<>(1000000);

    public String removeCommonRegex(String p) {
        StringBuilder sb = new StringBuilder();
        char[] chars = p.toCharArray();
        boolean last = false;
        for (char c : chars) {
            if (c == '*') {
                if (last) {
                    continue;
                }
                last = true;
            } else {
                last = false;
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public boolean isCommonRegexMatch0(String s, String p) {
        if (regexMap.containsKey(s + "/" + p)) {
//            System.out.println("hint cache");
            return regexMap.get(s + "/" + p);
        }
        if (p.isEmpty()) {
            return s.isEmpty();
        }
        if (!s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '?')) {
            boolean result = isCommonRegexMatch0(s.substring(1), p.substring(1));
            regexMap.put(s.substring(1) + "/" + p.substring(1), result);
            return result;
        }
        if (p.charAt(0) != '*') {
            return false;
        }
        if (s.isEmpty()) {
            return p.length() == 1;
        }
        boolean r1 = isCommonRegexMatch0(s.substring(1), p);
        regexMap.put(s.substring(1) + "/" + p, r1);
        boolean r2 = isCommonRegexMatch0(s, p.substring(1));
        regexMap.put(s + "/" + p.substring(1), r2);
        return r1 || r2;
    }

    // 正则表达式匹配
    // leetcode 10
    public boolean isRegexMatchDynamic(String s, String p) {
        s = new StringBuilder(s).reverse().toString();
        p = new StringBuilder(p).reverse().toString();
        int m = s.length();
        int n = p.length();
        boolean dp[][] = new boolean[m + 1][n + 1];
        dp[0][0] = true;

        for (int i = 1; i <= n; i += 2) {
            if (p.charAt(i - 1) == '*') {
                dp[0][i + 1] = true;
                continue;
            }
            break;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (p.charAt(j - 1) == '*') {
                    continue;
                }
                if (j >= 2 && p.charAt(j - 2) == '*') {
                    dp[i][j] = (p.charAt(j - 1) == s.charAt(i - 1) || p.charAt(j - 1) == '.') ? dp[i - 1][j] || dp[i][j - 2] : dp[i][j - 2];
                } else {
                    dp[i][j] = dp[i - 1][j - 1] && (p.charAt(j - 1) == '.' || p.charAt(j - 1) == s.charAt(i - 1));
                }
            }
        }

        return dp[m][n];
    }

    public boolean isRegexMatch(String s, String p) {
        if (p.isEmpty()) {
            return s.isEmpty();
        }
        boolean first_match = !s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');
        if (p.length() == 1) {
            return first_match && s.length() == 1;
        }
        if (p.charAt(1) == '*') {
            return isRegexMatch(s, p.substring(2)) || (first_match && isRegexMatch(s.substring(1), p));
        } else {
            return first_match && isRegexMatch(s.substring(1), p.substring(1));
        }
    }


    //两数之和
    // leetcode 1
    public int[] twoSum(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{};
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int v = nums[i];
            if (map.containsKey(target - v)) {
                return new int[]{map.get(target - v), i};
            }
            map.put(v, i);
        }
        return new int[]{};
    }


    // 两数相加
    // leetcode 2
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder sb = new StringBuilder();
        sb.append(l1.val);
        while (l1.next != null) {
            l1 = l1.next;
            sb.append(l1.val);
        }
        BigInteger b1 = new BigInteger(sb.reverse().toString());
        sb.setLength(0);
        sb.append(l2.val);
        while (l2.next != null) {
            l2 = l2.next;
            sb.append(l2.val);
        }
        BigInteger b2 = new BigInteger(sb.reverse().toString());
        char[] chars = b1.add(b2).toString().toCharArray();
        ListNode root = new ListNode(Integer.valueOf("" + chars[chars.length - 1]));
        ListNode cur = root;
        for (int i = chars.length - 2; i >= 0; i--) {
            cur.next = new ListNode(Integer.valueOf("" + chars[i]));
            cur = cur.next;
        }
        return root;
    }

    // leetcode 3
    // 无重复字符的最长字串
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        Window window = new Window();
        int maxSize = 0;
        for (int i = 0; i < chars.length; i++) {
            window.addChar(chars[i], i);
            if (window.size() > maxSize) {
                maxSize = window.size();
            }
        }
        return maxSize;
    }

    class Window {
        Map<Character, Integer> map = new LinkedHashMap<>();

        void addChar(char c, int index) {
            if (map.containsKey(c)) {
                Set<Character> set = new LinkedHashSet<>(map.keySet());
                for (char key : set) {
                    if (key != c) {
                        map.remove(key);
                        continue;
                    }
                    break;
                }
                map.remove(c);
            }
            map.put(c, index);
        }

        int size() {
            return map.size();
        }
    }

    // leetcode 4
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        if (len == 0) {
            return 0d;
        }
        if (len % 2 == 0) {
            return (findN(nums1, nums2, len / 2) + findN(nums1, nums2, len / 2 + 1)) / 2.0;
        } else {
            return findN(nums1, nums2, len / 2 + 1);
        }
    }

    public int findN(int[] nums1, int[] nums2, int n) {
        int p1 = 0;
        int p2 = 0;
        while (n > 1) {
            int mid = n / 2;
            if (p1 >= nums1.length) {
                return nums2[p2 + n - 1];
            }
            if (p2 >= nums2.length) {
                return nums1[p1 + n - 1];
            }
            if (p1 + mid > nums1.length) {
                mid = nums1.length - p1;
            }
            if (p2 + mid > nums2.length) {
                mid = nums2.length - p2;
            }
            if (nums1[p1 + mid - 1] <= nums2[p2 + mid - 1]) {
                p1 += mid;
            } else {
                p2 += mid;
            }
            n -= mid;
        }
        if (p1 == nums1.length) {
            return nums2[p2];
        } else if (p2 == nums2.length) {
            return nums1[p1];
        }
        return Math.min(nums1[p1], nums2[p2]);
    }

    public int maxLenWithFixValueInArray(int[] nums, int k) {
        if (nums.length == 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int sum = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                max = Math.max(i - map.get(sum - k), max);
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return max;
    }
}
