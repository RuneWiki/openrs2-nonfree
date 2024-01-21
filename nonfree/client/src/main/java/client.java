import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!client")
public final class client extends Applet_Sub1 {

	@OriginalMember(owner = "client!client", name = "J", descriptor = "I")
	private static int anInt242;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "Z")
	private static boolean aBoolean45;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
	private static int anInt271;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "I")
	private static int anInt276;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
	private static int anInt316;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
	private static int anInt322;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "I")
	private static int anInt337;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private static int anInt339;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private static int anInt357;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "I")
	public static int anInt367;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "I")
	private static int anInt368;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
	public static int anInt385;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "Z")
	private static boolean aBoolean67;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
	private static int anInt388;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "Lclient!bb;")
	public static Class1_Sub1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
	private static int anInt422;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
	private static int anInt425;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "I")
	private static int anInt426;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
	private static int anInt446;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "I")
	private static int anInt448;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "I")
	private static int anInt453;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "[[I")
	public static final int[][] anIntArrayArray3 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "[I")
	private static int[] anIntArray40 = new int[99];

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "[I")
	public static final int[] anIntArray46;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "Ljava/lang/String;")
	private static String aString11;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
	private static int anInt376;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "I")
	private static int anInt384;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "Z")
	private static boolean aBoolean66;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "I")
	private static int anInt412;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private static int anInt418;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "I")
	private static int anInt454;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "I")
	private int anInt244;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "I")
	private int anInt245;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
	private int anInt247;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "I")
	private int anInt248;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
	private int anInt251;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	private int anInt252;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	private int anInt253;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
	private int anInt256;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
	private int anInt257;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
	private int anInt258;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
	private int anInt259;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "[I")
	private int[] anIntArray36;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "[I")
	private int[] anIntArray37;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "[I")
	private int[] anIntArray38;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "[[B")
	private byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
	private int anInt260;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	private int anInt261;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
	private int anInt262;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
	private int anInt263;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
	private int anInt264;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
	private int anInt265;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private int anInt266;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
	private int anInt269;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_6;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_7;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
	private int anInt270;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
	private int anInt273;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
	private int anInt275;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "Lclient!s;")
	private Class38 aClass38_1;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
	private int anInt277;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt279;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
	private int anInt281;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "I")
	private int anInt282;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "I")
	private int anInt283;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "I")
	private int anInt284;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "I")
	private int anInt285;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "I")
	private int anInt286;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
	private int anInt287;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
	private int anInt288;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_8;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_9;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_10;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "Lclient!yb;")
	private Class46 aClass46_1;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
	private int anInt289;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
	private int anInt290;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "I")
	private int anInt291;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
	private int anInt292;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "I")
	private int anInt293;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
	private int anInt295;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
	private int anInt296;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "I")
	private int anInt297;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_11;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "Lclient!e;")
	private Class8 aClass8_1;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_1;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_2;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
	private int anInt299;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
	private int anInt300;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
	private int anInt301;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "I")
	private int anInt302;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "I")
	private int anInt303;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
	private int anInt306;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
	private int anInt307;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "I")
	private int anInt308;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
	private int anInt309;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
	private int anInt310;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
	private int anInt311;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_1;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_2;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "I")
	private int anInt313;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "I")
	private int anInt314;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
	private int anInt315;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "Ljava/lang/String;")
	private String aString9;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
	private int anInt317;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
	private int anInt318;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
	private int anInt319;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "I")
	private int anInt323;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "I")
	private int anInt324;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "I")
	private int anInt325;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "I")
	private int anInt326;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "I")
	private int anInt327;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "I")
	private int anInt330;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_6;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_7;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "[I")
	private int[] anIntArray51;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "[I")
	private int[] anIntArray52;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "[I")
	private int[] anIntArray53;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "[I")
	private int[] anIntArray54;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
	private int anInt331;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
	private int anInt333;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "I")
	private int anInt334;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "Lclient!fc;")
	private Class11 aClass11_1;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "I")
	private int anInt336;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "Lclient!xb;")
	private Class45 aClass45_1;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "I")
	private int anInt340;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "I")
	private int anInt341;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
	private int anInt342;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "I")
	private int anInt344;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_12;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_13;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
	private int anInt345;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "Lclient!rb;")
	private Class37 aClass37_3;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "Lclient!rb;")
	private Class37 aClass37_4;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "Lclient!rb;")
	private Class37 aClass37_5;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "Lclient!rb;")
	private Class37 aClass37_6;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "Lclient!rb;")
	private Class37 aClass37_7;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "Lclient!rb;")
	private Class37 aClass37_8;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "Lclient!rb;")
	private Class37 aClass37_9;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "Lclient!rb;")
	private Class37 aClass37_10;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "Lclient!rb;")
	private Class37 aClass37_11;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "I")
	private int anInt348;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
	private int anInt349;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private int anInt350;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
	private int anInt351;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "I")
	private int anInt352;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
	private int anInt353;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
	private int anInt354;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "I")
	private int anInt355;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
	private int anInt356;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "Lclient!rb;")
	private Class37 aClass37_12;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "Lclient!rb;")
	private Class37 aClass37_13;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "Lclient!rb;")
	private Class37 aClass37_14;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "Lclient!rb;")
	private Class37 aClass37_15;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "I")
	private int anInt358;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
	private int anInt359;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "[I")
	private int[] anIntArray60;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "[I")
	private int[] anIntArray61;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
	private int anInt360;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
	private int anInt361;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
	private int anInt362;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
	private int anInt363;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "I")
	private int anInt364;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "Ljava/lang/String;")
	private String aString13;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
	private int anInt365;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
	private int anInt366;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "Ljava/lang/String;")
	private String aString14;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
	private int anInt369;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
	private int anInt372;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
	private int anInt374;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
	private int anInt378;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
	private int anInt380;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
	private int anInt381;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
	private int anInt382;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "J")
	private long aLong16;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
	private int anInt383;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
	private int anInt386;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "I")
	private int anInt389;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_8;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_9;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_10;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private int anInt390;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
	private int anInt391;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
	private int anInt392;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
	private int anInt393;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
	private int anInt394;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
	private int anInt395;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_11;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_12;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_13;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
	private int anInt396;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
	private int anInt397;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "I")
	private int anInt398;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
	private int anInt399;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "I")
	private int anInt400;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "I")
	private int anInt401;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "I")
	private int anInt404;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
	private int anInt405;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "J")
	private long aLong17;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "I")
	private int anInt406;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "I")
	private int anInt407;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "I")
	private int anInt408;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "I")
	private int anInt409;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "I")
	private int anInt410;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
	private int anInt411;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "I")
	private int anInt413;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "[I")
	private int[] anIntArray85;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "[I")
	private int[] anIntArray86;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "[I")
	private int[] anIntArray87;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "[Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array2;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
	private int anInt414;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "Lclient!rb;")
	private Class37 aClass37_16;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "Lclient!rb;")
	private Class37 aClass37_17;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "Lclient!rb;")
	private Class37 aClass37_18;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "Lclient!rb;")
	private Class37 aClass37_19;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "Lclient!rb;")
	private Class37 aClass37_20;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "Lclient!rb;")
	private Class37 aClass37_21;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "Lclient!rb;")
	private Class37 aClass37_22;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "Lclient!rb;")
	private Class37 aClass37_23;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "Lclient!rb;")
	private Class37 aClass37_24;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "Lclient!rb;")
	private Class37 aClass37_25;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "Lclient!rb;")
	private Class37 aClass37_26;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "Lclient!rb;")
	private Class37 aClass37_27;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "Lclient!vb;")
	private Class43_Sub1 aClass43_Sub1_1;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
	private int anInt416;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_14;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_15;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_16;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_17;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_18;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
	private int anInt417;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
	private int anInt419;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "[I")
	private int[] anIntArray90;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "[I")
	private int[] anIntArray91;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
	private int anInt423;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
	private int anInt424;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "I")
	private int anInt427;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "Ljava/lang/String;")
	private String aString18;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
	private int anInt431;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
	private int anInt432;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "I")
	private int anInt433;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
	private int anInt435;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
	private int anInt437;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
	private int anInt438;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "I")
	private int anInt439;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "I")
	private int anInt440;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
	private int anInt441;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
	private int anInt442;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "I")
	private int anInt443;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
	private int anInt444;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
	private int anInt445;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "I")
	private int anInt447;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_19;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_20;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
	private int anInt449;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
	private int anInt450;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
	private int anInt451;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
	private int anInt452;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "Z")
	private boolean aBoolean42 = false;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "I")
	private int anInt243 = -1;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "Z")
	private boolean aBoolean43 = false;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "I")
	private int anInt246 = -14273;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "Ljava/lang/String;")
	private String aString5 = "";

	@OriginalMember(owner = "client!client", name = "S", descriptor = "Ljava/lang/String;")
	private String aString6 = "";

	@OriginalMember(owner = "client!client", name = "V", descriptor = "I")
	private int anInt249 = 2;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "[I")
	private int[] anIntArray34 = new int[50];

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Lclient!mb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_2 = Class1_Sub1_Sub3.method483();

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
	private int anInt250 = -1;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "[[I")
	private int[][] anIntArrayArray2 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Z")
	private boolean aBoolean44 = false;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "[I")
	private int[] anIntArray35 = new int[50];

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
	private int anInt254 = -1;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	private int anInt255 = 128;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
	private int anInt267 = -266;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
	private int anInt268 = -1;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "B")
	private byte aByte5 = -5;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "Lclient!d;")
	private Class6 aClass6_1 = new Class6();

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "I")
	private int anInt272 = -1;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private int anInt274 = 5063219;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "[I")
	private int[] anIntArray39 = new int[33];

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "[I")
	private int[] anIntArray41 = new int[7];

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "Ljava/lang/String;")
	private String aString7 = "";

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array3 = new Class1_Sub1_Sub2_Sub2[8];

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "Z")
	private boolean aBoolean46 = false;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
	private int anInt278 = -1;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "[I")
	private int[] anIntArray42 = new int[2000];

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "Z")
	private boolean aBoolean48 = false;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "Z")
	private boolean aBoolean49 = false;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "I")
	private int anInt280 = 751;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "[I")
	private int[] anIntArray43 = new int[5];

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "Z")
	private boolean aBoolean51 = false;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "B")
	private byte aByte6 = 3;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
	private int anInt294 = -266;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "[[[Lclient!pb;")
	private Class31[][][] aClass31ArrayArrayArray1 = new Class31[4][104][104];

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "[I")
	private int[] anIntArray44 = new int[5];

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "[I")
	private int[] anIntArray45 = new int[151];

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "Z")
	private boolean aBoolean52 = true;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "[Z")
	private boolean[] aBooleanArray4 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "B")
	private byte aByte7 = 5;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "[Lclient!wb;")
	public Class44[] aClass44Array1 = new Class44[5];

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "[Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array1 = new Class1_Sub1_Sub2_Sub3[50];

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "Ljava/lang/String;")
	private String aString8 = "";

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "Z")
	private boolean aBoolean53 = false;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "I")
	private int anInt304 = 751;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
	private int anInt305 = 922;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "[I")
	private int[] anIntArray47 = new int[5];

	@OriginalMember(owner = "client!client", name = "od", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array4 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
	private int anInt312 = 1;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "Lclient!mb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_3 = Class1_Sub1_Sub3.method483();

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "[I")
	private int[] anIntArray48 = new int[256];

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "[[I")
	private int[][] anIntArrayArray4 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "B")
	private byte aByte8 = -5;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "[I")
	private int[] anIntArray49 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "[I")
	private int[] anIntArray50 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "Z")
	private boolean aBoolean54 = false;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
	private int anInt320 = -1;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
	private int anInt321 = -1;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "I")
	private int anInt328 = -1;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "Lclient!pb;")
	private Class31 aClass31_1 = new Class31(false);

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "I")
	private int anInt329 = -286;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "I")
	private int anInt332 = 78;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "I")
	private int anInt335 = -1;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "Z")
	public boolean aBoolean55 = false;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "[J")
	private long[] aLongArray3 = new long[200];

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "Z")
	private boolean aBoolean56 = false;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "I")
	private final int anInt338 = 100;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "[I")
	private int[] anIntArray55 = new int[100];

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "B")
	private byte aByte9 = -41;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "Z")
	private boolean aBoolean57 = false;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "I")
	private int anInt343 = 1;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "Z")
	private boolean aBoolean58 = false;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray1 = new String[500];

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "[I")
	private int[] anIntArray56 = new int[100];

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray2 = new String[100];

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray3 = new String[100];

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "Z")
	private boolean aBoolean59 = false;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "Ljava/lang/String;")
	private String aString10 = "";

	@OriginalMember(owner = "client!client", name = "He", descriptor = "[I")
	private int[] anIntArray57 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "[I")
	private int[] anIntArray58 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
	private int anInt346 = 1;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "[I")
	private int[] anIntArray59 = new int[5];

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
	private int anInt347 = 7759444;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "B")
	private byte aByte10 = 86;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "Z")
	private boolean aBoolean61 = false;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "Z")
	private boolean aBoolean62 = true;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "Ljava/lang/String;")
	private String aString12 = "";

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "[I")
	private int[] anIntArray62 = new int[50];

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "[I")
	private int[] anIntArray63 = new int[5];

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "Lclient!pb;")
	private Class31 aClass31_2 = new Class31(false);

	@OriginalMember(owner = "client!client", name = "If", descriptor = "Lclient!pb;")
	private Class31 aClass31_3 = new Class31(false);

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
	private int anInt370 = 3;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
	private int anInt371 = -1;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "I")
	private int anInt373 = 1;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "B")
	private byte aByte11 = -1;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "Z")
	private boolean aBoolean63 = false;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "[I")
	private int[] anIntArray64 = new int[200];

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
	private int anInt375 = 50;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "[I")
	private int[] anIntArray65 = new int[this.anInt375];

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "[I")
	private int[] anIntArray66 = new int[this.anInt375];

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "[I")
	private int[] anIntArray67 = new int[this.anInt375];

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "[I")
	private int[] anIntArray68 = new int[this.anInt375];

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "[I")
	private int[] anIntArray69 = new int[this.anInt375];

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "[I")
	private int[] anIntArray70 = new int[this.anInt375];

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "[I")
	private int[] anIntArray71 = new int[this.anInt375];

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray4 = new String[this.anInt375];

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "B")
	private byte aByte12 = 32;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
	private int anInt377 = -732;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "[I")
	private int[] anIntArray72 = new int[2000];

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
	private int anInt379 = 2;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "Z")
	private boolean aBoolean64 = false;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "[I")
	private int[] anIntArray73 = new int[33];

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "Z")
	private boolean aBoolean65 = false;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "[Lclient!ab;")
	private Class1_Sub1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1_Sub1Array1 = new Class1_Sub1_Sub1_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "[I")
	private int[] anIntArray74 = new int[8192];

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "I")
	private int anInt387 = 3353893;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "Z")
	private boolean aBoolean68 = false;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "[I")
	private int[] anIntArray75 = new int[50];

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array5 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array6 = new Class1_Sub1_Sub2_Sub2[1000];

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "[I")
	private int[] anIntArray76 = new int[9];

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "B")
	private byte aByte13 = 5;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "[I")
	private int[] anIntArray77 = new int[151];

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "Z")
	private boolean aBoolean69 = false;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "I")
	private int anInt402 = 2048;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "I")
	private int anInt403 = 2047;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "[Lclient!bb;")
	private Class1_Sub1_Sub1_Sub1_Sub2[] aClass1_Sub1_Sub1_Sub1_Sub2Array1 = new Class1_Sub1_Sub1_Sub1_Sub2[this.anInt402];

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "[I")
	private int[] anIntArray78 = new int[this.anInt402];

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "[I")
	private int[] anIntArray79 = new int[this.anInt402];

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "[Lclient!mb;")
	private Class1_Sub1_Sub3[] aClass1_Sub1_Sub3Array1 = new Class1_Sub1_Sub3[this.anInt402];

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "Z")
	private boolean aBoolean70 = false;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "[J")
	private long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray5 = new String[200];

	@OriginalMember(owner = "client!client", name = "th", descriptor = "Z")
	private boolean aBoolean71 = true;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "[I")
	private int[] anIntArray80 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "[I")
	private int[] anIntArray81 = new int[500];

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "[I")
	private int[] anIntArray82 = new int[500];

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "[I")
	private int[] anIntArray83 = new int[500];

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "[I")
	private int[] anIntArray84 = new int[500];

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "Lclient!mb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_4 = Class1_Sub1_Sub3.method483();

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "[I")
	private int[] anIntArray88 = new int[50];

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "[I")
	private int[] anIntArray89 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "B")
	private byte aByte14 = -88;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "Z")
	private boolean aBoolean72 = true;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "Ljava/lang/String;")
	private String aString15 = "";

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "Ljava/lang/String;")
	private String aString16 = "";

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array7 = new Class1_Sub1_Sub2_Sub2[50];

	@OriginalMember(owner = "client!client", name = "di", descriptor = "I")
	private int anInt415 = -1;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "[Lclient!jc;")
	private Class19[] aClass19Array1 = new Class19[4];

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "[Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array3 = new Class1_Sub1_Sub2_Sub3[2];

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "Z")
	private boolean aBoolean73 = true;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "I")
	private int anInt420 = 2301979;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "Z")
	private boolean aBoolean74 = false;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "Z")
	private boolean aBoolean75 = false;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "B")
	private byte aByte15 = 4;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
	private int anInt421 = -1;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "[I")
	private int[] anIntArray92 = new int[50];

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "I")
	private int anInt428 = 909;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "I")
	private int anInt429 = 377;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "I")
	private int anInt430 = -1;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
	private int anInt434 = 43763;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
	private int anInt436 = 2;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "Z")
	private boolean aBoolean76 = true;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "[[I")
	private int[][] anIntArrayArray5 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "Z")
	private boolean aBoolean77 = false;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "[I")
	private final int[] anIntArray93 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "Z")
	private boolean aBoolean78 = false;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "[I")
	private int[] anIntArray94 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "[B")
	private byte[] aByteArray2 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "[Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array4 = new Class1_Sub1_Sub2_Sub3[13];

	static {
		@Pc(269) int local269 = 0;
		for (@Pc(271) int local271 = 0; local271 < 99; local271++) {
			@Pc(276) int local276 = local271 + 1;
			@Pc(289) int local289 = (int) ((double) local276 + Math.pow(2.0D, (double) local276 / 7.0D) * 300.0D);
			local269 += local289;
			anIntArray40[local271] = local269 / 4;
		}
		anIntArray46 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		aString11 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		anInt376 = -856;
		anInt384 = 10;
		aBoolean66 = true;
		anInt412 = -218;
		anInt418 = 3;
		aBoolean79 = true;
		anInt454 = -196;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(III)Ljava/lang/String;")
	private static String method107(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(13) int local13 = arg0 - arg1;
			if (local13 < -9) {
				return "@red@";
			} else if (local13 < -6) {
				return "@or3@";
			} else if (local13 < -3) {
				return "@or2@";
			} else if (local13 < 0) {
				return "@or1@";
			} else if (local13 > 9) {
				return "@gre@";
			} else if (local13 > 6) {
				return "@gr3@";
			} else if (local13 > 3) {
				return "@gr2@";
			} else if (local13 > 0) {
				return "@gr1@";
			} else {
				return "@yel@";
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("15039, " + -688 + ", " + arg0 + ", " + arg1 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private static void method141(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			Class38.aBoolean205 = false;
			Class1_Sub1_Sub2_Sub1.aBoolean147 = false;
			aBoolean67 = false;
			Class4.aBoolean32 = false;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("9516, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	private static String method153(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) String local4 = String.valueOf(arg0);
			for (@Pc(9) int local9 = local4.length() - 3; local9 > 0; local9 -= 3) {
				local4 = local4.substring(0, local9) + "," + local4.substring(local9);
			}
			if (local4.length() > 8) {
				local4 = "@gre@" + local4.substring(0, local4.length() - 8) + " million @whi@(" + local4 + ")";
			} else if (local4.length() > 4) {
				local4 = "@cya@" + local4.substring(0, local4.length() - 4) + "K @whi@(" + local4 + ")";
			}
			return " " + local4;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("52515, " + false + ", " + arg0 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private static void method162(@OriginalArg(0) int arg0) {
		try {
			Class38.aBoolean205 = true;
			Class1_Sub1_Sub2_Sub1.aBoolean147 = true;
			@Pc(7) boolean local7 = false;
			aBoolean67 = true;
			Class4.aBoolean32 = true;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("58197, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)Ljava/lang/String;")
	private static String method168(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("34535, " + true + ", " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 245);
			if (arg0.length == 5) {
				anInt384 = Integer.parseInt(arg0[0]);
				anInt385 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method162(856);
				} else if (arg0[2].equals("highmem")) {
					method141(271);
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean66 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean66 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt930 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method85(anInt454);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)Ljava/lang/String;")
	private String method98() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("33402, " + 8894 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	private void method99() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt273);
			if (this.aClass43_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass43_Sub1_1.anInt989);
			}
			System.out.println("loop-cycle:" + anInt367);
			if (this.aByte14 != -88) {
				this.anInt407 = -1;
			}
			System.out.println("draw-cycle:" + anInt446);
			System.out.println("ptype:" + this.anInt407);
			System.out.println("psize:" + this.anInt406);
			if (this.aClass8_1 != null) {
				this.aClass8_1.method249();
			}
			super.aBoolean38 = true;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("92885, " + -88 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)Ljava/awt/Component;")
	@Override
	protected Component method95() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("41332, " + -66 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIIZII)Z")
	private boolean method100(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray4[local7][local11] = 0;
					this.anIntArrayArray2[local7][local11] = 99999999;
				}
			}
			local11 = arg10;
			@Pc(39) int local39 = arg4;
			this.anIntArrayArray4[arg10][arg4] = 99;
			this.anIntArrayArray2[arg10][arg4] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray57[0] = arg10;
			@Pc(66) int local66 = local55 + 1;
			this.anIntArray58[0] = arg4;
			@Pc(70) boolean local70 = false;
			@Pc(74) int local74 = this.anIntArray57.length;
			@Pc(81) int[][] local81 = this.aClass19Array1[this.anInt419].anIntArrayArray17;
			@Pc(192) int local192;
			while (local57 != local66) {
				local11 = this.anIntArray57[local57];
				local39 = this.anIntArray58[local57];
				local57 = (local57 + 1) % local74;
				if (local11 == arg7 && local39 == arg9) {
					local70 = true;
					break;
				}
				if (arg0 != 0) {
					if ((arg0 < 5 || arg0 == 10) && this.aClass19Array1[this.anInt419].method421(arg0 - 1, local11, arg7, arg3, local39, arg9)) {
						local70 = true;
						break;
					}
					if (arg0 < 10 && this.aClass19Array1[this.anInt419].method422(local11, local39, arg0 - 1, arg3, arg7, arg9)) {
						local70 = true;
						break;
					}
				}
				if (arg5 != 0 && arg1 != 0 && this.aClass19Array1[this.anInt419].method423(arg1, 109, arg6, local39, arg9, arg5, local11, arg7)) {
					local70 = true;
					break;
				}
				local192 = this.anIntArrayArray2[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray4[local11 - 1][local39] == 0 && (local81[local11 - 1][local39] & 0x280108) == 0) {
					this.anIntArray57[local66] = local11 - 1;
					this.anIntArray58[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 - 1][local39] = 2;
					this.anIntArrayArray2[local11 - 1][local39] = local192;
				}
				if (local11 < 103 && this.anIntArrayArray4[local11 + 1][local39] == 0 && (local81[local11 + 1][local39] & 0x280180) == 0) {
					this.anIntArray57[local66] = local11 + 1;
					this.anIntArray58[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 + 1][local39] = 8;
					this.anIntArrayArray2[local11 + 1][local39] = local192;
				}
				if (local39 > 0 && this.anIntArrayArray4[local11][local39 - 1] == 0 && (local81[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray57[local66] = local11;
					this.anIntArray58[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11][local39 - 1] = 1;
					this.anIntArrayArray2[local11][local39 - 1] = local192;
				}
				if (local39 < 103 && this.anIntArrayArray4[local11][local39 + 1] == 0 && (local81[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray57[local66] = local11;
					this.anIntArray58[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11][local39 + 1] = 4;
					this.anIntArrayArray2[local11][local39 + 1] = local192;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray4[local11 - 1][local39 - 1] == 0 && (local81[local11 - 1][local39 - 1] & 0x28010E) == 0 && (local81[local11 - 1][local39] & 0x280108) == 0 && (local81[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray57[local66] = local11 - 1;
					this.anIntArray58[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray2[local11 - 1][local39 - 1] = local192;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray4[local11 + 1][local39 - 1] == 0 && (local81[local11 + 1][local39 - 1] & 0x280183) == 0 && (local81[local11 + 1][local39] & 0x280180) == 0 && (local81[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray57[local66] = local11 + 1;
					this.anIntArray58[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray2[local11 + 1][local39 - 1] = local192;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray4[local11 - 1][local39 + 1] == 0 && (local81[local11 - 1][local39 + 1] & 0x280138) == 0 && (local81[local11 - 1][local39] & 0x280108) == 0 && (local81[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray57[local66] = local11 - 1;
					this.anIntArray58[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray2[local11 - 1][local39 + 1] = local192;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray4[local11 + 1][local39 + 1] == 0 && (local81[local11 + 1][local39 + 1] & 0x2801E0) == 0 && (local81[local11 + 1][local39] & 0x280180) == 0 && (local81[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray57[local66] = local11 + 1;
					this.anIntArray58[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray2[local11 + 1][local39 + 1] = local192;
				}
			}
			this.anInt360 = 0;
			@Pc(808) int local808;
			@Pc(814) int local814;
			@Pc(820) int local820;
			if (!local70) {
				if (arg8) {
					local192 = 100;
					for (local808 = 1; local808 < 2; local808++) {
						for (local814 = arg7 - local808; local814 <= arg7 + local808; local814++) {
							for (local820 = arg9 - local808; local820 <= arg9 + local808; local820++) {
								if (local814 >= 0 && local820 >= 0 && local814 < 104 && local820 < 104 && this.anIntArrayArray2[local814][local820] < local192) {
									local192 = this.anIntArrayArray2[local814][local820];
									local11 = local814;
									local39 = local820;
									this.anInt360 = 1;
									local70 = true;
								}
							}
						}
						if (local70) {
							break;
						}
					}
				}
				if (!local70) {
					return false;
				}
			}
			@Pc(881) byte local881 = 0;
			this.anIntArray57[0] = local11;
			local57 = local881 + 1;
			this.anIntArray58[0] = local39;
			local192 = local808 = this.anIntArrayArray4[local11][local39];
			while (local11 != arg10 || local39 != arg4) {
				if (local192 != local808) {
					local808 = local192;
					this.anIntArray57[local57] = local11;
					this.anIntArray58[local57++] = local39;
				}
				if ((local192 & 0x2) != 0) {
					local11++;
				} else if ((local192 & 0x8) != 0) {
					local11--;
				}
				if ((local192 & 0x1) != 0) {
					local39++;
				} else if ((local192 & 0x4) != 0) {
					local39--;
				}
				local192 = this.anIntArrayArray4[local11][local39];
			}
			if (local57 > 0) {
				local74 = local57;
				if (local57 > 25) {
					local74 = 25;
				}
				local57--;
				local814 = this.anIntArray57[local57];
				local820 = this.anIntArray58[local57];
				if (arg2 == 0) {
					this.aClass1_Sub1_Sub3_2.method485(182);
					this.aClass1_Sub1_Sub3_2.method486(local74 + local74 + 3);
				}
				if (arg2 == 1) {
					this.aClass1_Sub1_Sub3_2.method485(198);
					this.aClass1_Sub1_Sub3_2.method486(local74 + local74 + 3 + 14);
				}
				if (arg2 == 2) {
					this.aClass1_Sub1_Sub3_2.method485(216);
					this.aClass1_Sub1_Sub3_2.method486(local74 + local74 + 3);
				}
				if (super.anIntArray32[5] == 1) {
					this.aClass1_Sub1_Sub3_2.method486(1);
				} else {
					this.aClass1_Sub1_Sub3_2.method486(0);
				}
				this.aClass1_Sub1_Sub3_2.method487(local814 + this.anInt281);
				this.aClass1_Sub1_Sub3_2.method487(local820 + this.anInt282);
				this.anInt287 = this.anIntArray57[0];
				this.anInt288 = this.anIntArray58[0];
				for (@Pc(1076) int local1076 = 1; local1076 < local74; local1076++) {
					local57--;
					this.aClass1_Sub1_Sub3_2.method486(this.anIntArray57[local57] - local814);
					this.aClass1_Sub1_Sub3_2.method486(this.anIntArray58[local57] - local820);
				}
				return true;
			} else if (arg2 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1111) RuntimeException local1111) {
			signlink.reporterror("76144, " + arg0 + ", " + 9 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method101() {
		try {
			this.method161(699);
			if (this.anInt303 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array3[this.anInt302 / 100].method404(this.anInt300 - 8 - 4, this.anInt301 - 8 - 4);
			}
			if (this.anInt303 == 2) {
				this.aClass1_Sub1_Sub2_Sub2Array3[this.anInt302 / 100 + 4].method404(this.anInt300 - 8 - 4, this.anInt301 - 8 - 4);
			}
			if (this.anInt371 != -1) {
				this.method214(this.anInt371, this.anInt296);
				this.method144(Class6.aClass6Array1[this.anInt371], 0, 0, 0);
			}
			@Pc(94) int local94;
			@Pc(96) int local96;
			if (this.anInt395 > 0) {
				local94 = 302 - (int) Math.abs(Math.sin((double) this.anInt395 / 10.0D) * 10.0D);
				for (local96 = 0; local96 < 30; local96++) {
					@Pc(104) int local104 = (30 - local96) * 16;
					Class1_Sub1_Sub2.method460(16776960, local96 + local94, this.anInt395, local104, 256 - local104 / 2);
				}
			}
			if (this.anInt254 != -1) {
				this.method214(this.anInt254, this.anInt296);
				this.method144(Class6.aClass6Array1[this.anInt254], 0, 0, 0);
			}
			this.method155();
			if (!this.aBoolean60) {
				this.method139();
				this.method171();
			} else if (this.anInt390 == 0) {
				this.method109();
			}
			if (this.anInt245 == 1) {
				if (this.anInt270 > 0 || this.anInt295 == 1) {
					this.aClass1_Sub1_Sub2_Sub2Array4[1].method404(472, 258);
				} else {
					this.aClass1_Sub1_Sub2_Sub2Array4[1].method404(472, 296);
				}
			}
			if (this.anInt270 > 0) {
				this.aClass1_Sub1_Sub2_Sub2Array4[0].method404(472, 296);
				this.aClass1_Sub1_Sub2_Sub4_2.method463(16776960, 484, 329, "Level: " + this.anInt270);
			}
			if (this.anInt295 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array4[6].method404(472, 296);
				this.aClass1_Sub1_Sub2_Sub4_2.method463(16776960, 484, 329, "Arena");
			}
			if (this.anInt438 != 0) {
				local94 = this.anInt438 / 50;
				local96 = local94 / 60;
				local94 %= 60;
				if (local94 < 10) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466("System update in: " + local96 + ":0" + local94, 16776960, 4, 329);
				} else {
					this.aClass1_Sub1_Sub2_Sub4_2.method466("System update in: " + local96 + ":" + local94, 16776960, 4, 329);
				}
			}
		} catch (@Pc(303) RuntimeException local303) {
			signlink.reporterror("50676, " + 6 + ", " + local303.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB[B)Z")
	private boolean method102(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			return arg1 == null ? true : signlink.wavesave(arg1, arg0);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("17834, " + arg0 + ", " + 113 + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
	private int method103(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = 256 - arg0;
			this.anInt406 += 0;
			return ((arg1 & 0xFF00FF) * local3 + (arg2 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg1 & 0xFF00) * local3 + (arg2 & 0xFF00) * arg0 & 0xFF0000) >> 8;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("62369, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;)Z")
	private boolean method104(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(5) int local5 = 0; local5 < this.anInt331; local5++) {
				if (arg0.equalsIgnoreCase(this.aStringArray5[local5])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("13098, " + 288 + ", " + arg0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class31 local9 = this.aClass31ArrayArrayArray1[this.anInt419][arg0][arg1];
		if (local9 == null) {
			this.aClass38_1.method599(this.anInt419, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub1_Sub1_Sub3 local23 = null;
		@Pc(27) Class1_Sub1_Sub1_Sub3 local27;
		for (local27 = (Class1_Sub1_Sub1_Sub3) local9.method524(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub3) local9.method526()) {
			@Pc(32) Class15 local32 = Class15.method343(local27.anInt490);
			@Pc(35) int local35 = local32.anInt626;
			if (local32.aBoolean140) {
				local35 *= local27.anInt491 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method522(local23);
		@Pc(65) Class1_Sub1_Sub1_Sub3 local65 = null;
		@Pc(67) Class1_Sub1_Sub1_Sub3 local67 = null;
		for (local27 = (Class1_Sub1_Sub1_Sub3) local9.method524(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub3) local9.method526()) {
			if (local27.anInt490 != local23.anInt490 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt490 != local23.anInt490 && local27.anInt490 != local65.anInt490 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass38_1.method585((byte) 6, local110, arg0, this.method197(arg1 * 128 + 64, this.anInt419, arg0 * 128 + 64, (byte) 2), this.anInt419, arg1, local65, local67, local23);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;)V")
	private void method106(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		try {
			if (arg1 == 0 && this.anInt278 != -1) {
				this.aString14 = arg2;
				super.anInt237 = 0;
			}
			if (this.anInt328 == -1) {
				this.aBoolean68 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray56[local20] = this.anIntArray56[local20 - 1];
				this.aStringArray2[local20] = this.aStringArray2[local20 - 1];
				this.aStringArray3[local20] = this.aStringArray3[local20 - 1];
			}
			this.anIntArray56[0] = arg1;
			this.aStringArray2[0] = arg0;
			this.aStringArray3[0] = arg2;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("71623, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(8) int local8 = Class32.aClass32Array1[arg1].anInt860;
			if (local8 != 0) {
				@Pc(16) int local16 = this.anIntArray72[arg1];
				if (local8 == 1) {
					if (local16 == 1) {
						Class1_Sub1_Sub2_Sub1.method377(anInt412, 0.9D);
					}
					if (local16 == 2) {
						Class1_Sub1_Sub2_Sub1.method377(anInt412, 0.8D);
					}
					if (local16 == 3) {
						Class1_Sub1_Sub2_Sub1.method377(anInt412, 0.7D);
					}
					if (local16 == 4) {
						Class1_Sub1_Sub2_Sub1.method377(anInt412, 0.6D);
					}
					Class15.aClass40_8.method639();
					this.aBoolean69 = true;
				}
				if (local8 == 3) {
					@Pc(54) boolean local54 = this.aBoolean72;
					if (local16 == 0) {
						this.method215(this.aBoolean72, 0);
						this.aBoolean72 = true;
					}
					if (local16 == 1) {
						this.method215(this.aBoolean72, -400);
						this.aBoolean72 = true;
					}
					if (local16 == 2) {
						this.method215(this.aBoolean72, -800);
						this.aBoolean72 = true;
					}
					if (local16 == 3) {
						this.method215(this.aBoolean72, -1200);
						this.aBoolean72 = true;
					}
					if (local16 == 4) {
						this.aBoolean72 = false;
					}
					if (this.aBoolean72 != local54 && !aBoolean67) {
						if (this.aBoolean72) {
							this.anInt319 = this.anInt250;
							this.aBoolean54 = false;
							this.aClass43_Sub1_1.method653(2, this.anInt319);
						} else {
							this.method186();
						}
						this.anInt285 = 0;
					}
				}
				if (local8 == 4) {
					if (local16 == 0) {
						this.aBoolean73 = true;
						this.method128(0);
					}
					if (local16 == 1) {
						this.aBoolean73 = true;
						this.method128(-400);
					}
					if (local16 == 2) {
						this.aBoolean73 = true;
						this.method128(-800);
					}
					if (local16 == 3) {
						this.aBoolean73 = true;
						this.method128(-1200);
					}
					if (local16 == 4) {
						this.aBoolean73 = false;
					}
				}
				if (local8 == 5) {
					this.anInt353 = local16;
				}
				if (local8 == 6) {
					this.anInt275 = local16;
				}
				if (local8 == 8) {
					this.anInt286 = local16;
					this.aBoolean68 = true;
				}
				if (local8 == 9) {
					this.anInt444 = local16;
				}
			}
		} catch (@Pc(214) RuntimeException local214) {
			signlink.reporterror("91427, " + arg0 + ", " + arg1 + ", " + local214.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method109() {
		try {
			@Pc(2) int local2 = this.anInt391;
			@Pc(5) int local5 = this.anInt392;
			@Pc(8) int local8 = this.anInt393;
			@Pc(11) int local11 = this.anInt394;
			Class1_Sub1_Sub2.method456(local5, local11, local2, local8, 6116423);
			Class1_Sub1_Sub2.method456(local5 + 1, 16, local2 + 1, local8 - 2, 0);
			Class1_Sub1_Sub2.method457(local2 + 1, local11 - 19, local5 + 18, local8 - 2, 0);
			this.aClass1_Sub1_Sub2_Sub4_3.method466("Choose Option", 6116423, local2 + 3, local5 + 14);
			@Pc(63) int local63 = super.anInt232;
			@Pc(66) int local66 = super.anInt233;
			if (this.anInt390 == 0) {
				local63 -= 4;
				local66 -= 4;
			}
			if (this.anInt390 == 1) {
				local63 -= 553;
				local66 -= 205;
			}
			if (this.anInt390 == 2) {
				local63 -= 17;
				local66 -= 357;
			}
			for (@Pc(88) int local88 = 0; local88 < this.anInt251; local88++) {
				@Pc(103) int local103 = local5 + (this.anInt251 - 1 - local88) * 15 + 31;
				@Pc(105) int local105 = 16777215;
				if (local63 > local2 && local63 < local2 + local8 && local66 > local103 - 13 && local66 < local103 + 3) {
					local105 = 16776960;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method468(local105, local2 + 3, local103, true, this.aStringArray1[local88]);
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("54882, " + 0 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method110() {
		try {
			for (@Pc(6) int local6 = 0; local6 < this.anInt382; local6++) {
				@Pc(13) int local13 = this.anIntArray74[local6];
				@Pc(18) Class1_Sub1_Sub1_Sub1_Sub1 local18 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local13];
				if (local18 != null) {
					this.method111(this.aByte11, local18.aClass13_1.aByte27, local18);
				}
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("15578, " + 0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!z;)V")
	private void method111(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub1_Sub1 arg2) {
		try {
			if (arg0 != -1) {
				this.anInt407 = -1;
			}
			if (arg2.anInt128 < 128 || arg2.anInt129 < 128 || arg2.anInt128 >= 13184 || arg2.anInt129 >= 13184) {
				arg2.anInt151 = -1;
				arg2.anInt156 = -1;
				arg2.anInt165 = 0;
				arg2.anInt166 = 0;
				arg2.anInt128 = arg2.anIntArray16[0] * 128 + arg2.anInt131 * 64;
				arg2.anInt129 = arg2.anIntArray17[0] * 128 + arg2.anInt131 * 64;
				arg2.method48();
			}
			if (arg2 == aClass1_Sub1_Sub1_Sub1_Sub2_1 && (arg2.anInt128 < 1536 || arg2.anInt129 < 1536 || arg2.anInt128 >= 11776 || arg2.anInt129 >= 11776)) {
				arg2.anInt151 = -1;
				arg2.anInt156 = -1;
				arg2.anInt165 = 0;
				arg2.anInt166 = 0;
				arg2.anInt128 = arg2.anIntArray16[0] * 128 + arg2.anInt131 * 64;
				arg2.anInt129 = arg2.anIntArray17[0] * 128 + arg2.anInt131 * 64;
				arg2.method48();
			}
			if (arg2.anInt165 > anInt367) {
				this.method112(arg2);
			} else if (arg2.anInt166 >= anInt367) {
				this.method113(arg2);
			} else {
				this.method114(735, arg2);
			}
			this.method115(arg2, (byte) 8);
			this.method116(arg2);
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("70066, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!z;)V")
	private void method112(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt165 - anInt367;
			@Pc(14) int local14 = arg0.anInt161 * 128 + arg0.anInt131 * 64;
			@Pc(24) int local24 = arg0.anInt163 * 128 + arg0.anInt131 * 64;
			arg0.anInt128 += (local14 - arg0.anInt128) / local4;
			arg0.anInt129 += (local24 - arg0.anInt129) / local4;
			arg0.anInt172 = 0;
			this.anInt406 += 0;
			if (arg0.anInt167 == 0) {
				arg0.anInt170 = 1024;
			}
			if (arg0.anInt167 == 1) {
				arg0.anInt170 = 1536;
			}
			if (arg0.anInt167 == 2) {
				arg0.anInt170 = 0;
			}
			if (arg0.anInt167 == 3) {
				arg0.anInt170 = 512;
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("39998, " + 0 + ", " + arg0 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!z;)V")
	private void method113(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			if (this.aByte12 != 32) {
				this.anInt407 = -1;
			}
			if (arg0.anInt166 == anInt367 || arg0.anInt151 == -1 || arg0.anInt154 != 0 || arg0.anInt153 + 1 > Class27.aClass27Array1[arg0.anInt151].method515(arg0.anInt152)) {
				@Pc(36) int local36 = arg0.anInt166 - arg0.anInt165;
				@Pc(41) int local41 = anInt367 - arg0.anInt165;
				@Pc(51) int local51 = arg0.anInt161 * 128 + arg0.anInt131 * 64;
				@Pc(61) int local61 = arg0.anInt163 * 128 + arg0.anInt131 * 64;
				@Pc(71) int local71 = arg0.anInt162 * 128 + arg0.anInt131 * 64;
				@Pc(81) int local81 = arg0.anInt164 * 128 + arg0.anInt131 * 64;
				arg0.anInt128 = (local51 * (local36 - local41) + local71 * local41) / local36;
				arg0.anInt129 = (local61 * (local36 - local41) + local81 * local41) / local36;
			}
			arg0.anInt172 = 0;
			if (arg0.anInt167 == 0) {
				arg0.anInt170 = 1024;
			}
			if (arg0.anInt167 == 1) {
				arg0.anInt170 = 1536;
			}
			if (arg0.anInt167 == 2) {
				arg0.anInt170 = 0;
			}
			if (arg0.anInt167 == 3) {
				arg0.anInt170 = 512;
			}
			arg0.anInt130 = arg0.anInt170;
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("89560, " + 32 + ", " + arg0 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!z;)V")
	private void method114(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg1) {
		try {
			arg1.anInt148 = arg1.anInt132;
			if (arg1.anInt171 == 0) {
				arg1.anInt172 = 0;
			} else {
				if (arg1.anInt151 != -1 && arg1.anInt154 == 0) {
					@Pc(24) Class27 local24 = Class27.aClass27Array1[arg1.anInt151];
					if (arg1.anInt173 > 0 && local24.anInt818 == 0) {
						arg1.anInt172++;
						return;
					}
					if (arg1.anInt173 <= 0 && local24.anInt819 == 0) {
						arg1.anInt172++;
						return;
					}
				}
				@Pc(53) int local53 = arg1.anInt128;
				@Pc(56) int local56 = arg1.anInt129;
				@Pc(71) int local71 = arg1.anIntArray16[arg1.anInt171 - 1] * 128 + arg1.anInt131 * 64;
				@Pc(86) int local86 = arg1.anIntArray17[arg1.anInt171 - 1] * 128 + arg1.anInt131 * 64;
				@Pc(90) boolean local90 = false;
				if (local71 - local53 <= 256 && local71 - local53 >= -256 && local86 - local56 <= 256 && local86 - local56 >= -256) {
					if (local53 < local71) {
						if (local56 < local86) {
							arg1.anInt170 = 1280;
						} else if (local56 > local86) {
							arg1.anInt170 = 1792;
						} else {
							arg1.anInt170 = 1536;
						}
					} else if (local53 > local71) {
						if (local56 < local86) {
							arg1.anInt170 = 768;
						} else if (local56 > local86) {
							arg1.anInt170 = 256;
						} else {
							arg1.anInt170 = 512;
						}
					} else if (local56 < local86) {
						arg1.anInt170 = 1024;
					} else {
						arg1.anInt170 = 0;
					}
					@Pc(184) int local184 = arg1.anInt170 - arg1.anInt130 & 0x7FF;
					if (local184 > 1024) {
						local184 -= 2048;
					}
					@Pc(191) int local191 = arg1.anInt135;
					if (local184 >= -256 && local184 <= 256) {
						local191 = arg1.anInt134;
					} else if (local184 >= 256 && local184 < 768) {
						local191 = arg1.anInt137;
					} else if (local184 >= -768 && local184 <= -256) {
						local191 = arg1.anInt136;
					}
					if (local191 == -1) {
						local191 = arg1.anInt134;
					}
					arg1.anInt148 = local191;
					@Pc(233) int local233 = 4;
					if (arg1.anInt130 != arg1.anInt170 && arg1.anInt145 == -1) {
						local233 = 2;
					}
					if (arg1.anInt171 > 2) {
						local233 = 6;
					}
					if (arg1.anInt171 > 3) {
						local233 = 8;
					}
					if (arg1.anInt172 > 0 && arg1.anInt171 > 1) {
						local233 = 8;
						arg1.anInt172--;
					}
					if (arg1.aBooleanArray3[arg1.anInt171 - 1]) {
						local233 <<= 0x1;
					}
					if (local233 >= 8 && arg1.anInt148 == arg1.anInt134 && arg1.anInt138 != -1) {
						arg1.anInt148 = arg1.anInt138;
					}
					if (local53 < local71) {
						arg1.anInt128 += local233;
						if (arg1.anInt128 > local71) {
							arg1.anInt128 = local71;
						}
					} else if (local53 > local71) {
						arg1.anInt128 -= local233;
						if (arg1.anInt128 < local71) {
							arg1.anInt128 = local71;
						}
					}
					if (local56 < local86) {
						arg1.anInt129 += local233;
						if (arg1.anInt129 > local86) {
							arg1.anInt129 = local86;
						}
					} else if (local56 > local86) {
						arg1.anInt129 -= local233;
						if (arg1.anInt129 < local86) {
							arg1.anInt129 = local86;
						}
					}
					if (arg1.anInt128 == local71 && arg1.anInt129 == local86) {
						arg1.anInt171--;
						if (arg1.anInt173 > 0) {
							arg1.anInt173--;
							return;
						}
					}
				} else {
					arg1.anInt128 = local71;
					arg1.anInt129 = local86;
				}
			}
		} catch (@Pc(392) RuntimeException local392) {
			signlink.reporterror("458, " + arg0 + ", " + arg1 + ", " + local392.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!z;B)V")
	private void method115(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(33) int local33;
			@Pc(39) int local39;
			if (arg0.anInt145 != -1 && arg0.anInt145 < 32768) {
				@Pc(25) Class1_Sub1_Sub1_Sub1_Sub1 local25 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[arg0.anInt145];
				if (local25 != null) {
					local33 = arg0.anInt128 - local25.anInt128;
					local39 = arg0.anInt129 - local25.anInt129;
					if (local33 != 0 || local39 != 0) {
						arg0.anInt170 = (int) (Math.atan2((double) local33, (double) local39) * 325.949D) & 0x7FF;
					}
				}
			}
			@Pc(64) int local64;
			if (arg0.anInt145 >= 32768) {
				local64 = arg0.anInt145 - 32768;
				if (local64 == this.anInt421) {
					local64 = this.anInt403;
				}
				@Pc(76) Class1_Sub1_Sub1_Sub1_Sub2 local76 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local64];
				if (local76 != null) {
					local39 = arg0.anInt128 - local76.anInt128;
					@Pc(90) int local90 = arg0.anInt129 - local76.anInt129;
					if (local39 != 0 || local90 != 0) {
						arg0.anInt170 = (int) (Math.atan2((double) local39, (double) local90) * 325.949D) & 0x7FF;
					}
				}
			}
			if ((arg0.anInt146 != 0 || arg0.anInt147 != 0) && (arg0.anInt171 == 0 || arg0.anInt172 > 0)) {
				local64 = arg0.anInt128 - (arg0.anInt146 - this.anInt281 - this.anInt281) * 64;
				local33 = arg0.anInt129 - (arg0.anInt147 - this.anInt282 - this.anInt282) * 64;
				if (local64 != 0 || local33 != 0) {
					arg0.anInt170 = (int) (Math.atan2((double) local64, (double) local33) * 325.949D) & 0x7FF;
				}
				arg0.anInt146 = 0;
				arg0.anInt147 = 0;
			}
			local64 = arg0.anInt170 - arg0.anInt130 & 0x7FF;
			if (local64 != 0) {
				if (local64 < 32 || local64 > 2016) {
					arg0.anInt130 = arg0.anInt170;
				} else if (local64 > 1024) {
					arg0.anInt130 -= 32;
				} else {
					arg0.anInt130 += 32;
				}
				arg0.anInt130 &= 0x7FF;
				if (arg0.anInt148 == arg0.anInt132 && arg0.anInt130 != arg0.anInt170) {
					if (arg0.anInt133 != -1) {
						arg0.anInt148 = arg0.anInt133;
						return;
					}
					arg0.anInt148 = arg0.anInt134;
					return;
				}
			}
		} catch (@Pc(238) RuntimeException local238) {
			signlink.reporterror("82212, " + arg0 + ", " + arg1 + ", " + local238.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!z;I)V")
	private void method116(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.aBoolean25 = false;
			@Pc(21) Class27 local21;
			if (arg0.anInt148 != -1) {
				local21 = Class27.aClass27Array1[arg0.anInt148];
				arg0.anInt150++;
				if (arg0.anInt149 < local21.anInt812 && arg0.anInt150 > local21.method515(arg0.anInt149)) {
					arg0.anInt150 = 0;
					arg0.anInt149++;
				}
				if (arg0.anInt149 >= local21.anInt812) {
					arg0.anInt150 = 0;
					arg0.anInt149 = 0;
				}
			}
			if (arg0.anInt156 != -1 && anInt367 >= arg0.anInt159) {
				if (arg0.anInt157 < 0) {
					arg0.anInt157 = 0;
				}
				local21 = Class29.aClass29Array1[arg0.anInt156].aClass27_2;
				arg0.anInt158++;
				while (arg0.anInt157 < local21.anInt812 && arg0.anInt158 > local21.method515(arg0.anInt157)) {
					arg0.anInt158 -= local21.method515(arg0.anInt157);
					arg0.anInt157++;
				}
				if (arg0.anInt157 >= local21.anInt812 && (arg0.anInt157 < 0 || arg0.anInt157 >= local21.anInt812)) {
					arg0.anInt156 = -1;
				}
			}
			if (arg0.anInt151 != -1 && arg0.anInt154 <= 1) {
				local21 = Class27.aClass27Array1[arg0.anInt151];
				if (local21.anInt818 == 1 && arg0.anInt173 > 0 && arg0.anInt165 <= anInt367 && arg0.anInt166 < anInt367) {
					arg0.anInt154 = 1;
					return;
				}
			}
			if (arg0.anInt151 != -1 && arg0.anInt154 == 0) {
				local21 = Class27.aClass27Array1[arg0.anInt151];
				arg0.anInt153++;
				while (arg0.anInt152 < local21.anInt812 && arg0.anInt153 > local21.method515(arg0.anInt152)) {
					arg0.anInt153 -= local21.method515(arg0.anInt152);
					arg0.anInt152++;
				}
				if (arg0.anInt152 >= local21.anInt812) {
					arg0.anInt152 -= local21.anInt813;
					arg0.anInt155++;
					if (arg0.anInt155 >= local21.anInt817) {
						arg0.anInt151 = -1;
					}
					if (arg0.anInt152 < 0 || arg0.anInt152 >= local21.anInt812) {
						arg0.anInt151 = -1;
					}
				}
				arg0.aBoolean25 = local21.aBoolean186;
			}
			if (arg0.anInt154 > 0) {
				arg0.anInt154--;
			}
		} catch (@Pc(266) RuntimeException local266) {
			signlink.reporterror("63418, " + arg0 + ", " + 46734 + ", " + local266.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method117() {
		try {
			if (this.aBoolean69) {
				this.aBoolean69 = false;
				this.aClass37_3.method575(0, super.aGraphics2, 4);
				this.aClass37_4.method575(0, super.aGraphics2, 357);
				this.aClass37_5.method575(722, super.aGraphics2, 4);
				this.aClass37_6.method575(743, super.aGraphics2, 205);
				this.aClass37_7.method575(0, super.aGraphics2, 0);
				this.aClass37_8.method575(516, super.aGraphics2, 4);
				this.aClass37_9.method575(516, super.aGraphics2, 205);
				this.aClass37_10.method575(496, super.aGraphics2, 357);
				this.aClass37_11.method575(0, super.aGraphics2, 338);
				this.aBoolean78 = true;
				this.aBoolean68 = true;
				this.aBoolean74 = true;
				this.aBoolean65 = true;
				if (this.anInt396 != 2) {
					this.aClass37_14.method575(4, super.aGraphics2, 4);
					this.aClass37_13.method575(550, super.aGraphics2, 4);
				}
			}
			if (this.anInt396 == 2) {
				this.method181();
			}
			if (this.aBoolean60 && this.anInt390 == 1) {
				this.aBoolean78 = true;
			}
			@Pc(138) boolean local138;
			if (this.anInt268 != -1) {
				local138 = this.method214(this.anInt268, this.anInt296);
				if (local138) {
					this.aBoolean78 = true;
				}
			}
			if (this.anInt452 == 2) {
				this.aBoolean78 = true;
			}
			if (this.anInt325 == 2) {
				this.aBoolean78 = true;
			}
			if (this.aBoolean78) {
				this.method229();
				this.aBoolean78 = false;
			}
			if (this.anInt328 == -1) {
				this.aClass6_1.anInt469 = this.anInt332 - this.anInt311 - 77;
				if (super.anInt232 > 448 && super.anInt232 < 560 && super.anInt233 > 332) {
					this.method207(0, 463, this.anInt332, 77, false, this.aClass6_1, super.anInt233 - 357, super.anInt232 - 17);
				}
				@Pc(220) int local220 = this.anInt332 - this.aClass6_1.anInt469 - 77;
				if (local220 < 0) {
					local220 = 0;
				}
				if (local220 > this.anInt332 - 77) {
					local220 = this.anInt332 - 77;
				}
				if (this.anInt311 != local220) {
					this.anInt311 = local220;
					this.aBoolean68 = true;
				}
			}
			if (this.anInt328 != -1) {
				local138 = this.method214(this.anInt328, this.anInt296);
				if (local138) {
					this.aBoolean68 = true;
				}
			}
			if (this.anInt452 == 3) {
				this.aBoolean68 = true;
			}
			if (this.anInt325 == 3) {
				this.aBoolean68 = true;
			}
			if (this.aString14 != null) {
				this.aBoolean68 = true;
			}
			if (this.aBoolean60 && this.anInt390 == 2) {
				this.aBoolean68 = true;
			}
			if (this.aBoolean68) {
				this.method208(this.anInt247);
				this.aBoolean68 = false;
			}
			if (this.anInt396 == 2) {
				this.method185(595);
				this.aClass37_13.method575(550, super.aGraphics2, 4);
			}
			if (this.anInt243 != -1) {
				this.aBoolean74 = true;
			}
			if (this.aBoolean74) {
				if (this.anInt243 != -1 && this.anInt243 == this.anInt370) {
					this.anInt243 = -1;
					this.aClass1_Sub1_Sub3_2.method485(243);
					this.aClass1_Sub1_Sub3_2.method486(this.anInt370);
				}
				this.aBoolean74 = false;
				this.aClass37_27.method574(this.aByte9);
				this.aClass1_Sub1_Sub2_Sub3_13.method443(0, 200, 0);
				if (this.anInt268 == -1) {
					if (this.anIntArray94[this.anInt370] != -1) {
						if (this.anInt370 == 0) {
							this.aClass1_Sub1_Sub2_Sub3_3.method443(22, 200, 10);
						}
						if (this.anInt370 == 1) {
							this.aClass1_Sub1_Sub2_Sub3_4.method443(54, 200, 8);
						}
						if (this.anInt370 == 2) {
							this.aClass1_Sub1_Sub2_Sub3_4.method443(82, 200, 8);
						}
						if (this.anInt370 == 3) {
							this.aClass1_Sub1_Sub2_Sub3_5.method443(110, 200, 8);
						}
						if (this.anInt370 == 4) {
							this.aClass1_Sub1_Sub2_Sub3_7.method443(153, 200, 8);
						}
						if (this.anInt370 == 5) {
							this.aClass1_Sub1_Sub2_Sub3_7.method443(181, 200, 8);
						}
						if (this.anInt370 == 6) {
							this.aClass1_Sub1_Sub2_Sub3_6.method443(209, 200, 9);
						}
					}
					if (this.anIntArray94[0] != -1 && (this.anInt243 != 0 || anInt367 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[0].method443(29, 200, 13);
					}
					if (this.anIntArray94[1] != -1 && (this.anInt243 != 1 || anInt367 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[1].method443(53, 200, 11);
					}
					if (this.anIntArray94[2] != -1 && (this.anInt243 != 2 || anInt367 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[2].method443(82, 200, 11);
					}
					if (this.anIntArray94[3] != -1 && (this.anInt243 != 3 || anInt367 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[3].method443(115, 200, 12);
					}
					if (this.anIntArray94[4] != -1 && (this.anInt243 != 4 || anInt367 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[4].method443(153, 200, 13);
					}
					if (this.anIntArray94[5] != -1 && (this.anInt243 != 5 || anInt367 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[5].method443(180, 200, 11);
					}
					if (this.anIntArray94[6] != -1 && (this.anInt243 != 6 || anInt367 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[6].method443(208, 200, 13);
					}
				}
				this.aClass37_27.method575(516, super.aGraphics2, 160);
				this.aClass37_26.method574(this.aByte9);
				this.aClass1_Sub1_Sub2_Sub3_12.method443(0, 200, 0);
				if (this.anInt268 == -1) {
					if (this.anIntArray94[this.anInt370] != -1) {
						if (this.anInt370 == 7) {
							this.aClass1_Sub1_Sub2_Sub3_14.method443(42, 200, 0);
						}
						if (this.anInt370 == 8) {
							this.aClass1_Sub1_Sub2_Sub3_15.method443(74, 200, 0);
						}
						if (this.anInt370 == 9) {
							this.aClass1_Sub1_Sub2_Sub3_15.method443(102, 200, 0);
						}
						if (this.anInt370 == 10) {
							this.aClass1_Sub1_Sub2_Sub3_16.method443(130, 200, 1);
						}
						if (this.anInt370 == 11) {
							this.aClass1_Sub1_Sub2_Sub3_18.method443(173, 200, 0);
						}
						if (this.anInt370 == 12) {
							this.aClass1_Sub1_Sub2_Sub3_18.method443(201, 200, 0);
						}
						if (this.anInt370 == 13) {
							this.aClass1_Sub1_Sub2_Sub3_17.method443(229, 200, 0);
						}
					}
					if (this.anIntArray94[8] != -1 && (this.anInt243 != 8 || anInt367 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[7].method443(74, 200, 2);
					}
					if (this.anIntArray94[9] != -1 && (this.anInt243 != 9 || anInt367 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[8].method443(102, 200, 3);
					}
					if (this.anIntArray94[10] != -1 && (this.anInt243 != 10 || anInt367 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[9].method443(137, 200, 4);
					}
					if (this.anIntArray94[11] != -1 && (this.anInt243 != 11 || anInt367 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[10].method443(174, 200, 2);
					}
					if (this.anIntArray94[12] != -1 && (this.anInt243 != 12 || anInt367 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[11].method443(201, 200, 2);
					}
					if (this.anIntArray94[13] != -1 && (this.anInt243 != 13 || anInt367 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[12].method443(226, 200, 2);
					}
				}
				this.aClass37_26.method575(496, super.aGraphics2, 466);
				this.aClass37_14.method574(this.aByte9);
			}
			if (this.aBoolean65) {
				this.aBoolean65 = false;
				this.aClass37_25.method574(this.aByte9);
				this.aClass1_Sub1_Sub2_Sub3_11.method443(0, 200, 0);
				this.aClass1_Sub1_Sub2_Sub4_2.method464(true, 28, 16777215, 55, "Public chat");
				if (this.anInt358 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method464(true, 41, 65280, 55, "On");
				}
				if (this.anInt358 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method464(true, 41, 16776960, 55, "Friends");
				}
				if (this.anInt358 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method464(true, 41, 16711680, 55, "Off");
				}
				if (this.anInt358 == 3) {
					this.aClass1_Sub1_Sub2_Sub4_2.method464(true, 41, 65535, 55, "Hide");
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method464(true, 28, 16777215, 184, "Private chat");
				if (this.anInt416 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method464(true, 41, 65280, 184, "On");
				}
				if (this.anInt416 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method464(true, 41, 16776960, 184, "Friends");
				}
				if (this.anInt416 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method464(true, 41, 16711680, 184, "Off");
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method464(true, 28, 16777215, 324, "Trade/duel");
				if (this.anInt386 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method464(true, 41, 65280, 324, "On");
				}
				if (this.anInt386 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method464(true, 41, 16776960, 324, "Friends");
				}
				if (this.anInt386 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method464(true, 41, 16711680, 324, "Off");
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method464(true, 33, 16777215, 458, "Report abuse");
				this.aClass37_25.method575(0, super.aGraphics2, 453);
				this.aClass37_14.method574(this.aByte9);
			}
			this.anInt296 = 0;
		} catch (@Pc(1061) RuntimeException local1061) {
			signlink.reporterror("14094, " + -761 + ", " + local1061.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method118() {
		try {
			@Pc(6) int local6 = this.anInt348 * 128 + 64;
			@Pc(13) int local13 = this.anInt349 * 128 + 64;
			@Pc(24) int local24 = this.method197(local13, this.anInt419, local6, (byte) 2) - this.anInt350;
			this.anInt406 += 0;
			if (this.anInt306 < local6) {
				this.anInt306 += this.anInt351 + (local6 - this.anInt306) * this.anInt352 / 1000;
				if (this.anInt306 > local6) {
					this.anInt306 = local6;
				}
			}
			if (this.anInt306 > local6) {
				this.anInt306 -= this.anInt351 + (this.anInt306 - local6) * this.anInt352 / 1000;
				if (this.anInt306 < local6) {
					this.anInt306 = local6;
				}
			}
			if (this.anInt307 < local24) {
				this.anInt307 += this.anInt351 + (local24 - this.anInt307) * this.anInt352 / 1000;
				if (this.anInt307 > local24) {
					this.anInt307 = local24;
				}
			}
			if (this.anInt307 > local24) {
				this.anInt307 -= this.anInt351 + (this.anInt307 - local24) * this.anInt352 / 1000;
				if (this.anInt307 < local24) {
					this.anInt307 = local24;
				}
			}
			if (this.anInt308 < local13) {
				this.anInt308 += this.anInt351 + (local13 - this.anInt308) * this.anInt352 / 1000;
				if (this.anInt308 > local13) {
					this.anInt308 = local13;
				}
			}
			if (this.anInt308 > local13) {
				this.anInt308 -= this.anInt351 + (this.anInt308 - local13) * this.anInt352 / 1000;
				if (this.anInt308 < local13) {
					this.anInt308 = local13;
				}
			}
			local6 = this.anInt262 * 128 + 64;
			local13 = this.anInt263 * 128 + 64;
			local24 = this.method197(local13, this.anInt419, local6, (byte) 2) - this.anInt264;
			@Pc(228) int local228 = local6 - this.anInt306;
			@Pc(233) int local233 = local24 - this.anInt307;
			@Pc(238) int local238 = local13 - this.anInt308;
			@Pc(249) int local249 = (int) Math.sqrt((double) (local228 * local228 + local238 * local238));
			@Pc(260) int local260 = (int) (Math.atan2((double) local233, (double) local249) * 325.949D) & 0x7FF;
			@Pc(271) int local271 = (int) (Math.atan2((double) local228, (double) local238) * -325.949D) & 0x7FF;
			if (local260 < 128) {
				local260 = 128;
			}
			if (local260 > 383) {
				local260 = 383;
			}
			if (this.anInt309 < local260) {
				this.anInt309 += this.anInt265 + (local260 - this.anInt309) * this.anInt266 / 1000;
				if (this.anInt309 > local260) {
					this.anInt309 = local260;
				}
			}
			if (this.anInt309 > local260) {
				this.anInt309 -= this.anInt265 + (this.anInt309 - local260) * this.anInt266 / 1000;
				if (this.anInt309 < local260) {
					this.anInt309 = local260;
				}
			}
			@Pc(342) int local342 = local271 - this.anInt310;
			if (local342 > 1024) {
				local342 -= 2048;
			}
			if (local342 < -1024) {
				local342 += 2048;
			}
			if (local342 > 0) {
				this.anInt310 += this.anInt265 + local342 * this.anInt266 / 1000;
				this.anInt310 &= 0x7FF;
			}
			if (local342 < 0) {
				this.anInt310 -= this.anInt265 + -local342 * this.anInt266 / 1000;
				this.anInt310 &= 0x7FF;
			}
			@Pc(400) int local400 = local271 - this.anInt310;
			if (local400 > 1024) {
				local400 -= 2048;
			}
			if (local400 < -1024) {
				local400 += 2048;
			}
			if (local400 < 0 && local342 > 0 || local400 > 0 && local342 < 0) {
				this.anInt310 = local271;
			}
		} catch (@Pc(421) RuntimeException local421) {
			signlink.reporterror("58007, " + 0 + ", " + local421.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean48) {
			this.method135();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method119() {
		try {
			if (this.aClass37_15 == null) {
				this.method175();
				super.aClass37_2 = null;
				this.aClass37_16 = null;
				this.aClass37_17 = null;
				this.aClass37_18 = null;
				this.aClass37_19 = null;
				this.aClass37_20 = null;
				this.aClass37_21 = null;
				this.aClass37_22 = null;
				this.aClass37_23 = null;
				this.aClass37_24 = null;
				this.aClass37_15 = new Class37(96, this.method95(), 0, 479);
				this.aClass37_13 = new Class37(156, this.method95(), 0, 172);
				Class1_Sub1_Sub2.method454();
				this.aClass1_Sub1_Sub2_Sub3_9.method443(0, 200, 0);
				this.aClass37_12 = new Class37(261, this.method95(), 0, 190);
				this.aClass37_14 = new Class37(334, this.method95(), 0, 512);
				Class1_Sub1_Sub2.method454();
				this.aClass37_25 = new Class37(50, this.method95(), 0, 496);
				this.aClass37_26 = new Class37(37, this.method95(), 0, 269);
				this.aClass37_27 = new Class37(45, this.method95(), 0, 249);
				this.aBoolean69 = true;
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("22480, " + 781 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)Z")
	private boolean method120() {
		try {
			if (this.aClass8_1 == null) {
				return false;
			}
			@Pc(621) String local621;
			@Pc(183) int local183;
			try {
				@Pc(16) int local16 = this.aClass8_1.method246();
				if (local16 == 0) {
					return false;
				}
				if (this.anInt407 == -1) {
					this.aClass8_1.method247(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 1);
					this.anInt407 = this.aClass1_Sub1_Sub3_3.aByteArray9[0] & 0xFF;
					if (this.aClass45_1 != null) {
						this.anInt407 = this.anInt407 - this.aClass45_1.method670() & 0xFF;
					}
					this.anInt406 = Class17.anIntArray189[this.anInt407];
					local16--;
				}
				if (this.anInt406 == -1) {
					if (local16 <= 0) {
						return false;
					}
					this.aClass8_1.method247(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 1);
					this.anInt406 = this.aClass1_Sub1_Sub3_3.aByteArray9[0] & 0xFF;
					local16--;
				}
				if (this.anInt406 == -2) {
					if (local16 <= 1) {
						return false;
					}
					this.aClass8_1.method247(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 2);
					this.aClass1_Sub1_Sub3_3.anInt778 = 0;
					this.anInt406 = this.aClass1_Sub1_Sub3_3.method498();
					local16 -= 2;
				}
				if (local16 < this.anInt406) {
					return false;
				}
				this.aClass1_Sub1_Sub3_3.anInt778 = 0;
				this.aClass8_1.method247(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, this.anInt406);
				this.anInt408 = 0;
				this.anInt356 = this.anInt355;
				this.anInt355 = this.anInt354;
				this.anInt354 = this.anInt407;
				if (this.anInt407 == 203) {
					this.anInt423 = this.aClass1_Sub1_Sub3_3.method496();
					this.anInt424 = this.aClass1_Sub1_Sub3_3.method496();
					this.anInt407 = -1;
					return true;
				}
				@Pc(179) int local179;
				if (this.anInt407 == 69) {
					local179 = this.aClass1_Sub1_Sub3_3.method498();
					local183 = this.aClass1_Sub1_Sub3_3.method498();
					Class6.aClass6Array1[local179].anInt481 = local183;
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 236) {
					local179 = this.aClass1_Sub1_Sub3_3.method498();
					this.method170(this.aBoolean50, local179);
					if (this.anInt328 != -1) {
						this.anInt328 = -1;
						this.aBoolean68 = true;
					}
					if (this.aBoolean43) {
						this.aBoolean43 = false;
						this.aBoolean68 = true;
					}
					this.anInt268 = local179;
					this.aBoolean78 = true;
					this.aBoolean74 = true;
					this.anInt254 = -1;
					this.aBoolean58 = false;
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 177) {
					local179 = this.aClass1_Sub1_Sub3_3.method498();
					this.method170(this.aBoolean50, local179);
					if (this.anInt268 != -1) {
						this.anInt268 = -1;
						this.aBoolean78 = true;
						this.aBoolean74 = true;
					}
					if (this.anInt328 != -1) {
						this.anInt328 = -1;
						this.aBoolean68 = true;
					}
					if (this.aBoolean43) {
						this.aBoolean43 = false;
						this.aBoolean68 = true;
					}
					this.anInt254 = local179;
					this.aBoolean58 = false;
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 165) {
					@Pc(308) Class1_Sub1_Sub3 local308 = Class10.method268();
					if (local308 != null) {
						this.aClass1_Sub1_Sub3_2.method485(19);
						this.aClass1_Sub1_Sub3_2.method487(local308.anInt778);
						this.aClass1_Sub1_Sub3_2.method494(local308.aByteArray9, local308.anInt778);
						local308.method484();
					}
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 60) {
					local179 = this.aClass1_Sub1_Sub3_3.method498();
					local183 = this.aClass1_Sub1_Sub3_3.method498();
					Class6.aClass6Array1[local179].anInt477 = 1;
					Class6.aClass6Array1[local179].anInt478 = local183;
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 105) {
					this.method143(this.anInt406, this.aClass1_Sub1_Sub3_3);
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 15) {
					this.anInt423 = this.aClass1_Sub1_Sub3_3.method496();
					this.anInt424 = this.aClass1_Sub1_Sub3_3.method496();
					while (this.aClass1_Sub1_Sub3_3.anInt778 < this.anInt406) {
						local179 = this.aClass1_Sub1_Sub3_3.method496();
						this.method174(this.aClass1_Sub1_Sub3_3, local179);
					}
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 8) {
					this.anInt370 = this.aClass1_Sub1_Sub3_3.method496();
					this.aBoolean78 = true;
					this.aBoolean74 = true;
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 152) {
					local179 = this.aClass1_Sub1_Sub3_3.method499();
					this.anInt278 = local179;
					this.aBoolean68 = true;
					this.anInt407 = -1;
					return true;
				}
				@Pc(469) int local469;
				@Pc(477) int local477;
				@Pc(498) int local498;
				@Pc(473) int local473;
				@Pc(475) boolean local475;
				@Pc(465) long local465;
				if (this.anInt407 == 207) {
					local465 = this.aClass1_Sub1_Sub3_3.method502();
					local469 = this.aClass1_Sub1_Sub3_3.method501();
					local473 = this.aClass1_Sub1_Sub3_3.method496();
					local475 = false;
					for (local477 = 0; local477 < 100; local477++) {
						if (this.anIntArray55[local477] == local469) {
							local475 = true;
							break;
						}
					}
					if (local473 <= 1) {
						for (local498 = 0; local498 < this.anInt333; local498++) {
							if (this.aLongArray4[local498] == local465) {
								local475 = true;
								break;
							}
						}
					}
					if (!local475 && this.anInt380 == 0) {
						try {
							this.anIntArray55[this.anInt345] = local469;
							this.anInt345 = (this.anInt345 + 1) % 100;
							@Pc(544) String local544 = Class2.method40(this.anInt406 - 13, this.aClass1_Sub1_Sub3_3);
							@Pc(548) String local548 = Class35.method546(local544);
							if (local473 == 2 || local473 == 3) {
								this.method106("@cr2@" + Class47.method679(Class47.method676(local465)), 7, local548);
							} else if (local473 == 1) {
								this.method106("@cr1@" + Class47.method679(Class47.method676(local465)), 7, local548);
							} else {
								this.method106(Class47.method679(Class47.method676(local465)), 3, local548);
							}
						} catch (@Pc(605) Exception local605) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt407 = -1;
					return true;
				}
				@Pc(632) String local632;
				if (this.anInt407 == 175) {
					local621 = this.aClass1_Sub1_Sub3_3.method503();
					@Pc(635) long local635;
					if (local621.endsWith(":tradereq:")) {
						local632 = local621.substring(0, local621.indexOf(":"));
						local635 = Class47.method675(local632);
						local475 = false;
						for (local477 = 0; local477 < this.anInt333; local477++) {
							if (this.aLongArray4[local477] == local635) {
								local475 = true;
								break;
							}
						}
						if (!local475 && this.anInt380 == 0) {
							this.method106(local632, 4, "wishes to trade with you.");
						}
					} else if (local621.endsWith(":duelreq:")) {
						local632 = local621.substring(0, local621.indexOf(":"));
						local635 = Class47.method675(local632);
						local475 = false;
						for (local477 = 0; local477 < this.anInt333; local477++) {
							if (this.aLongArray4[local477] == local635) {
								local475 = true;
								break;
							}
						}
						if (!local475 && this.anInt380 == 0) {
							this.method106(local632, 8, "wishes to duel with you.");
						}
					} else {
						this.method106("", 0, local621);
					}
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 181) {
					this.anInt333 = this.anInt406 / 8;
					for (local179 = 0; local179 < this.anInt333; local179++) {
						this.aLongArray4[local179] = this.aClass1_Sub1_Sub3_3.method502();
					}
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 229) {
					local179 = this.aClass1_Sub1_Sub3_3.method498();
					local183 = this.aClass1_Sub1_Sub3_3.method498();
					if (this.anInt328 != -1) {
						this.anInt328 = -1;
						this.aBoolean68 = true;
					}
					if (this.aBoolean43) {
						this.aBoolean43 = false;
						this.aBoolean68 = true;
					}
					this.anInt254 = local179;
					this.anInt268 = local183;
					this.aBoolean78 = true;
					this.aBoolean74 = true;
					this.aBoolean58 = false;
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 238) {
					this.anInt244 = this.aClass1_Sub1_Sub3_3.method501();
					this.anInt344 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt318 = this.aClass1_Sub1_Sub3_3.method496();
					this.anInt383 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt297 = this.aClass1_Sub1_Sub3_3.method496();
					if (this.anInt244 != 0 && this.anInt254 == -1) {
						signlink.dnslookup(Class47.method678(this.anInt244));
						this.method188();
						@Pc(859) short local859 = 650;
						if (this.anInt318 != 201 || this.anInt297 == 1) {
							local859 = 655;
						}
						this.aString17 = "";
						this.aBoolean44 = false;
						for (local183 = 0; local183 < Class6.aClass6Array1.length; local183++) {
							if (Class6.aClass6Array1[local183] != null && Class6.aClass6Array1[local183].anInt462 == local859) {
								this.anInt254 = Class6.aClass6Array1[local183].anInt459;
								break;
							}
						}
					}
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 161) {
					this.method156(this.anInt406, this.aClass1_Sub1_Sub3_3);
					this.aBoolean42 = false;
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 243) {
					this.anInt441 = this.aClass1_Sub1_Sub3_3.method496();
					if (this.anInt441 == 1) {
						this.anInt279 = this.aClass1_Sub1_Sub3_3.method498();
					}
					if (this.anInt441 >= 2 && this.anInt441 <= 6) {
						if (this.anInt441 == 2) {
							this.anInt292 = 64;
							this.anInt293 = 64;
						}
						if (this.anInt441 == 3) {
							this.anInt292 = 0;
							this.anInt293 = 64;
						}
						if (this.anInt441 == 4) {
							this.anInt292 = 128;
							this.anInt293 = 64;
						}
						if (this.anInt441 == 5) {
							this.anInt292 = 64;
							this.anInt293 = 0;
						}
						if (this.anInt441 == 6) {
							this.anInt292 = 64;
							this.anInt293 = 128;
						}
						this.anInt441 = 2;
						this.anInt289 = this.aClass1_Sub1_Sub3_3.method498();
						this.anInt290 = this.aClass1_Sub1_Sub3_3.method498();
						this.anInt291 = this.aClass1_Sub1_Sub3_3.method496();
					}
					if (this.anInt441 == 10) {
						this.anInt427 = this.aClass1_Sub1_Sub3_3.method498();
					}
					this.anInt407 = -1;
					return true;
				}
				@Pc(1062) int local1062;
				if (this.anInt407 == 135) {
					local179 = this.aClass1_Sub1_Sub3_3.method498();
					local183 = this.aClass1_Sub1_Sub3_3.method498();
					local469 = local183 >> 10 & 0x1F;
					local473 = local183 >> 5 & 0x1F;
					local1062 = local183 & 0x1F;
					Class6.aClass6Array1[local179].anInt473 = (local469 << 19) + (local473 << 11) + (local1062 << 3);
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 56) {
					this.aBoolean47 = false;
					this.aBoolean43 = true;
					this.aString10 = "";
					this.aBoolean68 = true;
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 7) {
					local179 = this.aClass1_Sub1_Sub3_3.method498();
					this.method170(this.aBoolean50, local179);
					if (this.anInt268 != -1) {
						this.anInt268 = -1;
						this.aBoolean78 = true;
						this.aBoolean74 = true;
					}
					this.anInt328 = local179;
					this.aBoolean68 = true;
					this.anInt254 = -1;
					this.aBoolean58 = false;
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 151 || this.anInt407 == 188 || this.anInt407 == 190 || this.anInt407 == 141 || this.anInt407 == 187 || this.anInt407 == 13 || this.anInt407 == 94 || this.anInt407 == 71 || this.anInt407 == 198 || this.anInt407 == 119) {
					this.method174(this.aClass1_Sub1_Sub3_3, this.anInt407);
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 96) {
					local179 = this.aClass1_Sub1_Sub3_3.method498();
					if (local179 == 65535) {
						local179 = -1;
					}
					if (local179 != this.anInt250 && this.aBoolean72 && !aBoolean67) {
						this.anInt319 = local179;
						this.aBoolean54 = true;
						this.aClass43_Sub1_1.method653(2, this.anInt319);
					}
					this.anInt250 = local179;
					this.anInt285 = 0;
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 39) {
					local179 = this.aClass1_Sub1_Sub3_3.method498();
					local183 = this.aClass1_Sub1_Sub3_3.method498();
					if (this.aBoolean72 && !aBoolean67) {
						this.anInt319 = local179;
						this.aBoolean54 = false;
						this.aClass43_Sub1_1.method653(2, this.anInt319);
						this.anInt285 = local183;
					}
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 225) {
					local179 = this.aClass1_Sub1_Sub3_3.method498();
					@Pc(1297) boolean local1297 = this.aClass1_Sub1_Sub3_3.method496() == 1;
					Class6.aClass6Array1[local179].aBoolean82 = local1297;
					this.anInt407 = -1;
					return true;
				}
				@Pc(1319) Class6 local1319;
				if (this.anInt407 == 143) {
					local179 = this.aClass1_Sub1_Sub3_3.method498();
					local1319 = Class6.aClass6Array1[local179];
					for (local469 = 0; local469 < local1319.anIntArray95.length; local469++) {
						local1319.anIntArray95[local469] = -1;
						local1319.anIntArray95[local469] = 0;
					}
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 26) {
					this.anInt438 = this.aClass1_Sub1_Sub3_3.method498() * 30;
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 209) {
					local179 = this.aClass1_Sub1_Sub3_3.method498();
					local183 = this.aClass1_Sub1_Sub3_3.method496();
					local469 = this.aClass1_Sub1_Sub3_3.method498();
					if (this.aBoolean73 && !aBoolean67 && this.anInt433 < 50) {
						this.anIntArray34[this.anInt433] = local179;
						this.anIntArray88[this.anInt433] = local183;
						this.anIntArray92[this.anInt433] = local469 + Class5.anIntArray31[local179];
						this.anInt433++;
					}
					this.anInt407 = -1;
					return true;
				}
				@Pc(1574) int local1574;
				if (this.anInt407 == 109) {
					local465 = this.aClass1_Sub1_Sub3_3.method502();
					local469 = this.aClass1_Sub1_Sub3_3.method496();
					@Pc(1437) String local1437 = Class47.method679(Class47.method676(local465));
					for (local1062 = 0; local1062 < this.anInt331; local1062++) {
						if (local465 == this.aLongArray3[local1062]) {
							if (this.anIntArray64[local1062] != local469) {
								this.anIntArray64[local1062] = local469;
								this.aBoolean78 = true;
								if (local469 > 0) {
									this.method106("", 5, local1437 + " has logged in.");
								}
								if (local469 == 0) {
									this.method106("", 5, local1437 + " has logged out.");
								}
							}
							local1437 = null;
							break;
						}
					}
					if (local1437 != null && this.anInt331 < 200) {
						this.aLongArray3[this.anInt331] = local465;
						this.aStringArray5[this.anInt331] = local1437;
						this.anIntArray64[this.anInt331] = local469;
						this.anInt331++;
						this.aBoolean78 = true;
					}
					@Pc(1535) boolean local1535 = false;
					while (!local1535) {
						local1535 = true;
						for (local498 = 0; local498 < this.anInt331 - 1; local498++) {
							if (this.anIntArray64[local498] != anInt384 && this.anIntArray64[local498 + 1] == anInt384 || this.anIntArray64[local498] == 0 && this.anIntArray64[local498 + 1] != 0) {
								local1574 = this.anIntArray64[local498];
								this.anIntArray64[local498] = this.anIntArray64[local498 + 1];
								this.anIntArray64[local498 + 1] = local1574;
								@Pc(1596) String local1596 = this.aStringArray5[local498];
								this.aStringArray5[local498] = this.aStringArray5[local498 + 1];
								this.aStringArray5[local498 + 1] = local1596;
								@Pc(1618) long local1618 = this.aLongArray3[local498];
								this.aLongArray3[local498] = this.aLongArray3[local498 + 1];
								this.aLongArray3[local498 + 1] = local1618;
								this.aBoolean78 = true;
								local1535 = false;
							}
						}
					}
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 2) {
					this.anInt358 = this.aClass1_Sub1_Sub3_3.method496();
					this.anInt416 = this.aClass1_Sub1_Sub3_3.method496();
					this.anInt386 = this.aClass1_Sub1_Sub3_3.method496();
					this.aBoolean65 = true;
					this.aBoolean68 = true;
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 36) {
					this.method225();
					this.anInt407 = -1;
					return false;
				}
				if (this.anInt407 == 28) {
					Class10.method265();
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 174) {
					if (this.anInt268 != -1) {
						this.anInt268 = -1;
						this.aBoolean78 = true;
						this.aBoolean74 = true;
					}
					if (this.anInt328 != -1) {
						this.anInt328 = -1;
						this.aBoolean68 = true;
					}
					if (this.aBoolean43) {
						this.aBoolean43 = false;
						this.aBoolean68 = true;
					}
					this.anInt254 = -1;
					this.aBoolean58 = false;
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 29) {
					local179 = this.aClass1_Sub1_Sub3_3.method498();
					local183 = this.aClass1_Sub1_Sub3_3.method496();
					if (local179 == 65535) {
						local179 = -1;
					}
					this.anIntArray94[local183] = local179;
					this.aBoolean78 = true;
					this.aBoolean74 = true;
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 132) {
					this.anInt243 = this.aClass1_Sub1_Sub3_3.method496();
					if (this.anInt243 == this.anInt370) {
						if (this.anInt243 == 3) {
							this.anInt370 = 1;
						} else {
							this.anInt370 = 3;
						}
						this.aBoolean78 = true;
					}
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 25) {
					for (local179 = 0; local179 < this.anIntArray72.length; local179++) {
						if (this.anIntArray72[local179] != this.anIntArray42[local179]) {
							this.anIntArray72[local179] = this.anIntArray42[local179];
							this.method108(238, local179);
							this.aBoolean78 = true;
						}
					}
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 156) {
					this.aBoolean78 = true;
					local179 = this.aClass1_Sub1_Sub3_3.method498();
					local1319 = Class6.aClass6Array1[local179];
					local469 = this.aClass1_Sub1_Sub3_3.method496();
					for (local473 = 0; local473 < local469; local473++) {
						local1319.anIntArray95[local473] = this.aClass1_Sub1_Sub3_3.method498();
						local1062 = this.aClass1_Sub1_Sub3_3.method496();
						if (local1062 == 255) {
							local1062 = this.aClass1_Sub1_Sub3_3.method501();
						}
						local1319.anIntArray96[local473] = local1062;
					}
					for (local1062 = local469; local1062 < local1319.anIntArray95.length; local1062++) {
						local1319.anIntArray95[local1062] = 0;
						local1319.anIntArray96[local1062] = 0;
					}
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 32) {
					local179 = this.aClass1_Sub1_Sub3_3.method498();
					local632 = this.aClass1_Sub1_Sub3_3.method503();
					Class6.aClass6Array1[local179].aString19 = local632;
					if (Class6.aClass6Array1[local179].anInt459 == this.anIntArray94[this.anInt370]) {
						this.aBoolean78 = true;
					}
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 140) {
					this.anInt423 = this.aClass1_Sub1_Sub3_3.method496();
					this.anInt424 = this.aClass1_Sub1_Sub3_3.method496();
					for (local179 = this.anInt423; local179 < this.anInt423 + 8; local179++) {
						for (local183 = this.anInt424; local183 < this.anInt424 + 8; local183++) {
							if (this.aClass31ArrayArrayArray1[this.anInt419][local179][local183] != null) {
								this.aClass31ArrayArrayArray1[this.anInt419][local179][local183] = null;
								this.method105(local179, local183);
							}
						}
					}
					for (@Pc(2041) Class1_Sub2 local2041 = (Class1_Sub2) this.aClass31_3.method524(); local2041 != null; local2041 = (Class1_Sub2) this.aClass31_3.method526()) {
						if (local2041.anInt829 >= this.anInt423 && local2041.anInt829 < this.anInt423 + 8 && local2041.anInt830 >= this.anInt424 && local2041.anInt830 < this.anInt424 + 8 && local2041.anInt827 == this.anInt419) {
							local2041.anInt838 = 0;
						}
					}
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 76) {
					local179 = this.aClass1_Sub1_Sub3_3.method498();
					local183 = this.aClass1_Sub1_Sub3_3.method498();
					Class6.aClass6Array1[local179].anInt477 = 2;
					Class6.aClass6Array1[local179].anInt478 = local183;
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 75) {
					local179 = this.aClass1_Sub1_Sub3_3.method498();
					local183 = this.aClass1_Sub1_Sub3_3.method501();
					this.anIntArray42[local179] = local183;
					if (this.anIntArray72[local179] != local183) {
						this.anIntArray72[local179] = local183;
						this.method108(238, local179);
						this.aBoolean78 = true;
						if (this.anInt278 != -1) {
							this.aBoolean68 = true;
						}
					}
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 134) {
					this.aBoolean56 = false;
					for (local179 = 0; local179 < 5; local179++) {
						this.aBooleanArray4[local179] = false;
					}
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 226) {
					local179 = this.aClass1_Sub1_Sub3_3.method498();
					local183 = this.aClass1_Sub1_Sub3_3.method498();
					@Pc(2203) Class6 local2203 = Class6.aClass6Array1[local179];
					if (local2203 != null && local2203.anInt460 == 0) {
						if (local183 < 0) {
							local183 = 0;
						}
						if (local183 > local2203.anInt468 - local2203.anInt464) {
							local183 = local2203.anInt468 - local2203.anInt464;
						}
						local2203.anInt469 = local183;
					}
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 103) {
					local179 = this.aClass1_Sub1_Sub3_3.method496();
					local183 = this.aClass1_Sub1_Sub3_3.method496();
					local469 = this.aClass1_Sub1_Sub3_3.method496();
					local473 = this.aClass1_Sub1_Sub3_3.method496();
					this.aBooleanArray4[local179] = true;
					this.anIntArray44[local179] = local183;
					this.anIntArray43[local179] = local469;
					this.anIntArray63[local179] = local473;
					this.anIntArray47[local179] = 0;
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 123) {
					this.aBoolean56 = true;
					this.anInt262 = this.aClass1_Sub1_Sub3_3.method496();
					this.anInt263 = this.aClass1_Sub1_Sub3_3.method496();
					this.anInt264 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt265 = this.aClass1_Sub1_Sub3_3.method496();
					this.anInt266 = this.aClass1_Sub1_Sub3_3.method496();
					if (this.anInt266 >= 100) {
						local179 = this.anInt262 * 128 + 64;
						local183 = this.anInt263 * 128 + 64;
						local469 = this.method197(local183, this.anInt419, local179, (byte) 2) - this.anInt264;
						local473 = local179 - this.anInt306;
						local1062 = local469 - this.anInt307;
						local477 = local183 - this.anInt308;
						local498 = (int) Math.sqrt((double) (local473 * local473 + local477 * local477));
						this.anInt309 = (int) (Math.atan2((double) local1062, (double) local498) * 325.949D) & 0x7FF;
						this.anInt310 = (int) (Math.atan2((double) local473, (double) local477) * -325.949D) & 0x7FF;
						if (this.anInt309 < 128) {
							this.anInt309 = 128;
						}
						if (this.anInt309 > 383) {
							this.anInt309 = 383;
						}
					}
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 95) {
					this.aBoolean78 = true;
					local179 = this.aClass1_Sub1_Sub3_3.method498();
					local1319 = Class6.aClass6Array1[local179];
					while (this.aClass1_Sub1_Sub3_3.anInt778 < this.anInt406) {
						local469 = this.aClass1_Sub1_Sub3_3.method496();
						local473 = this.aClass1_Sub1_Sub3_3.method498();
						local1062 = this.aClass1_Sub1_Sub3_3.method496();
						if (local1062 == 255) {
							local1062 = this.aClass1_Sub1_Sub3_3.method501();
						}
						if (local469 >= 0 && local469 < local1319.anIntArray95.length) {
							local1319.anIntArray95[local469] = local473;
							local1319.anIntArray96[local469] = local1062;
						}
					}
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 110) {
					this.aBoolean78 = true;
					local179 = this.aClass1_Sub1_Sub3_3.method496();
					local183 = this.aClass1_Sub1_Sub3_3.method501();
					local469 = this.aClass1_Sub1_Sub3_3.method496();
					this.anIntArray62[local179] = local183;
					this.anIntArray35[local179] = local469;
					this.anIntArray75[local179] = 1;
					for (local473 = 0; local473 < 98; local473++) {
						if (local183 >= anIntArray40[local473]) {
							this.anIntArray75[local179] = local473 + 2;
						}
					}
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 66) {
					local179 = this.aClass1_Sub1_Sub3_3.method498();
					local183 = this.aClass1_Sub1_Sub3_3.method498();
					if (this.anInt260 == local179 && this.anInt261 == local183 && this.anInt396 == 2) {
						this.anInt407 = -1;
						return true;
					}
					this.anInt260 = local179;
					this.anInt261 = local183;
					this.anInt281 = (this.anInt260 - 6) * 8;
					this.anInt282 = (this.anInt261 - 6) * 8;
					this.aBoolean59 = false;
					if ((this.anInt260 / 8 == 48 || this.anInt260 / 8 == 49) && this.anInt261 / 8 == 48) {
						this.aBoolean59 = true;
					}
					if (this.anInt260 / 8 == 48 && this.anInt261 / 8 == 148) {
						this.aBoolean59 = true;
					}
					this.anInt396 = 1;
					this.aLong14 = System.currentTimeMillis();
					this.aClass37_14.method574(this.aByte9);
					this.aClass1_Sub1_Sub2_Sub4_2.method463(0, 257, 151, "Loading - please wait.");
					this.aClass1_Sub1_Sub2_Sub4_2.method463(16777215, 256, 150, "Loading - please wait.");
					this.aClass37_14.method575(4, super.aGraphics2, 4);
					local469 = 0;
					for (local473 = (this.anInt260 - 6) / 8; local473 <= (this.anInt260 + 6) / 8; local473++) {
						for (local1062 = (this.anInt261 - 6) / 8; local1062 <= (this.anInt261 + 6) / 8; local1062++) {
							local469++;
						}
					}
					this.aByteArrayArray1 = new byte[local469][];
					this.aByteArrayArray2 = new byte[local469][];
					this.anIntArray85 = new int[local469];
					this.anIntArray86 = new int[local469];
					this.anIntArray87 = new int[local469];
					local469 = 0;
					for (local1062 = (this.anInt260 - 6) / 8; local1062 <= (this.anInt260 + 6) / 8; local1062++) {
						for (local477 = (this.anInt261 - 6) / 8; local477 <= (this.anInt261 + 6) / 8; local477++) {
							this.anIntArray85[local469] = (local1062 << 8) + local477;
							if (this.aBoolean59 && (local477 == 49 || local477 == 149 || local477 == 147 || local1062 == 50 || local1062 == 49 && local477 == 47)) {
								this.anIntArray86[local469] = -1;
								this.anIntArray87[local469] = -1;
								local469++;
							} else {
								local498 = this.anIntArray86[local469] = this.aClass43_Sub1_1.method648(0, local1062, local477);
								if (local498 != -1) {
									this.aClass43_Sub1_1.method653(3, local498);
								}
								local1574 = this.anIntArray87[local469] = this.aClass43_Sub1_1.method648(1, local1062, local477);
								if (local1574 != -1) {
									this.aClass43_Sub1_1.method653(3, local1574);
								}
								local469++;
							}
						}
					}
					local477 = this.anInt281 - this.anInt283;
					local498 = this.anInt282 - this.anInt284;
					this.anInt283 = this.anInt281;
					this.anInt284 = this.anInt282;
					for (local1574 = 0; local1574 < 8192; local1574++) {
						@Pc(2873) Class1_Sub1_Sub1_Sub1_Sub1 local2873 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local1574];
						if (local2873 != null) {
							for (@Pc(2877) int local2877 = 0; local2877 < 10; local2877++) {
								local2873.anIntArray16[local2877] -= local477;
								local2873.anIntArray17[local2877] -= local498;
							}
							local2873.anInt128 -= local477 * 128;
							local2873.anInt129 -= local498 * 128;
						}
					}
					for (@Pc(2921) int local2921 = 0; local2921 < this.anInt402; local2921++) {
						@Pc(2928) Class1_Sub1_Sub1_Sub1_Sub2 local2928 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local2921];
						if (local2928 != null) {
							for (@Pc(2932) int local2932 = 0; local2932 < 10; local2932++) {
								local2928.anIntArray16[local2932] -= local477;
								local2928.anIntArray17[local2932] -= local498;
							}
							local2928.anInt128 -= local477 * 128;
							local2928.anInt129 -= local498 * 128;
						}
					}
					this.aBoolean42 = true;
					@Pc(2980) byte local2980 = 0;
					@Pc(2982) byte local2982 = 104;
					@Pc(2984) byte local2984 = 1;
					if (local477 < 0) {
						local2980 = 103;
						local2982 = -1;
						local2984 = -1;
					}
					@Pc(2994) byte local2994 = 0;
					@Pc(2996) byte local2996 = 104;
					@Pc(2998) byte local2998 = 1;
					if (local498 < 0) {
						local2994 = 103;
						local2996 = -1;
						local2998 = -1;
					}
					for (@Pc(3008) int local3008 = local2980; local3008 != local2982; local3008 += local2984) {
						for (@Pc(3012) int local3012 = local2994; local3012 != local2996; local3012 += local2998) {
							@Pc(3018) int local3018 = local3008 + local477;
							@Pc(3022) int local3022 = local3012 + local498;
							for (@Pc(3024) int local3024 = 0; local3024 < 4; local3024++) {
								if (local3018 >= 0 && local3022 >= 0 && local3018 < 104 && local3022 < 104) {
									this.aClass31ArrayArrayArray1[local3024][local3008][local3012] = this.aClass31ArrayArrayArray1[local3024][local3018][local3022];
								} else {
									this.aClass31ArrayArrayArray1[local3024][local3008][local3012] = null;
								}
							}
						}
					}
					for (@Pc(3086) Class1_Sub2 local3086 = (Class1_Sub2) this.aClass31_3.method524(); local3086 != null; local3086 = (Class1_Sub2) this.aClass31_3.method526()) {
						local3086.anInt829 -= local477;
						local3086.anInt830 -= local498;
						if (local3086.anInt829 < 0 || local3086.anInt830 < 0 || local3086.anInt829 >= 104 || local3086.anInt830 >= 104) {
							local3086.method665();
						}
					}
					if (this.anInt287 != 0) {
						this.anInt287 -= local477;
						this.anInt288 -= local498;
					}
					this.aBoolean56 = false;
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 115) {
					local179 = this.aClass1_Sub1_Sub3_3.method499();
					this.anInt371 = local179;
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 144) {
					for (local179 = 0; local179 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length; local179++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local179] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local179].anInt151 = -1;
						}
					}
					for (local183 = 0; local183 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length; local183++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local183] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local183].anInt151 = -1;
						}
					}
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 108) {
					this.anInt395 = 255;
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 35) {
					this.anInt245 = this.aClass1_Sub1_Sub3_3.method496();
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 70) {
					if (this.anInt370 == 12) {
						this.aBoolean78 = true;
					}
					this.anInt269 = this.aClass1_Sub1_Sub3_3.method499();
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 83) {
					local179 = this.aClass1_Sub1_Sub3_3.method498();
					Class6.aClass6Array1[local179].anInt477 = 3;
					Class6.aClass6Array1[local179].anInt478 = (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray19[0] << 24) + (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray19[4] << 18) + (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray18[0] << 12) + (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray18[8] << 6) + aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray18[11];
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 153) {
					local179 = this.aClass1_Sub1_Sub3_3.method498();
					local183 = this.aClass1_Sub1_Sub3_3.method498();
					local469 = this.aClass1_Sub1_Sub3_3.method498();
					@Pc(3334) Class15 local3334 = Class15.method343(local183);
					Class6.aClass6Array1[local179].anInt477 = 4;
					Class6.aClass6Array1[local179].anInt478 = local183;
					Class6.aClass6Array1[local179].anInt484 = local3334.anInt620;
					Class6.aClass6Array1[local179].anInt485 = local3334.anInt621;
					Class6.aClass6Array1[local179].anInt483 = local3334.anInt619 * 100 / local469;
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 86) {
					this.aBoolean56 = true;
					this.anInt348 = this.aClass1_Sub1_Sub3_3.method496();
					this.anInt349 = this.aClass1_Sub1_Sub3_3.method496();
					this.anInt350 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt351 = this.aClass1_Sub1_Sub3_3.method496();
					this.anInt352 = this.aClass1_Sub1_Sub3_3.method496();
					if (this.anInt352 >= 100) {
						this.anInt306 = this.anInt348 * 128 + 64;
						this.anInt308 = this.anInt349 * 128 + 64;
						this.anInt307 = this.method197(this.anInt308, this.anInt419, this.anInt306, (byte) 2) - this.anInt350;
					}
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 230) {
					local179 = this.aClass1_Sub1_Sub3_3.method498();
					local183 = this.aClass1_Sub1_Sub3_3.method499();
					local469 = this.aClass1_Sub1_Sub3_3.method499();
					@Pc(3462) Class6 local3462 = Class6.aClass6Array1[local179];
					local3462.anInt465 = local183;
					local3462.anInt466 = local469;
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 233) {
					this.anInt287 = 0;
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 208) {
					if (this.anInt370 == 12) {
						this.aBoolean78 = true;
					}
					this.anInt411 = this.aClass1_Sub1_Sub3_3.method496();
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 49) {
					this.anInt421 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt442 = this.aClass1_Sub1_Sub3_3.method496();
					this.anInt407 = -1;
					return true;
				}
				if (this.anInt407 == 192) {
					local179 = this.aClass1_Sub1_Sub3_3.method498();
					@Pc(3537) byte local3537 = this.aClass1_Sub1_Sub3_3.method497();
					this.anIntArray42[local179] = local3537;
					if (this.anIntArray72[local179] != local3537) {
						this.anIntArray72[local179] = local3537;
						this.method108(238, local179);
						this.aBoolean78 = true;
						if (this.anInt278 != -1) {
							this.aBoolean68 = true;
						}
					}
					this.anInt407 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt407 + "," + this.anInt406 + " - " + this.anInt355 + "," + this.anInt356);
				this.method225();
			} catch (@Pc(3601) IOException local3601) {
				this.method178();
			} catch (@Pc(3606) Exception local3606) {
				local621 = "T2 - " + this.anInt407 + "," + this.anInt355 + "," + this.anInt356 + " - " + this.anInt406 + "," + (this.anInt281 + aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0]) + "," + (this.anInt282 + aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0]) + " - ";
				for (local183 = 0; local183 < this.anInt406 && local183 < 50; local183++) {
					local621 = local621 + this.aClass1_Sub1_Sub3_3.aByteArray9[local183] + ",";
				}
				signlink.reporterror(local621);
				this.method225();
			}
			return true;
		} catch (@Pc(3687) RuntimeException local3687) {
			signlink.reporterror("54298, " + 4 + ", " + local3687.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg0 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg4 & 0x7FF;
			@Pc(21) int local21 = 0;
			@Pc(23) int local23 = 0;
			@Pc(25) int local25 = arg5;
			@Pc(31) int local31;
			@Pc(35) int local35;
			@Pc(45) int local45;
			if (local5 != 0) {
				local31 = Class1_Sub1_Sub1_Sub5.anIntArray157[local5];
				local35 = Class1_Sub1_Sub1_Sub5.anIntArray158[local5];
				local45 = local35 * 0 - arg5 * local31 >> 16;
				local25 = local31 * 0 + arg5 * local35 >> 16;
				local23 = local45;
			}
			if (local11 != 0) {
				local31 = Class1_Sub1_Sub1_Sub5.anIntArray157[local11];
				local35 = Class1_Sub1_Sub1_Sub5.anIntArray158[local11];
				local45 = local25 * local31 + local35 * 0 >> 16;
				local25 = local25 * local35 - local31 * 0 >> 16;
				local21 = local45;
			}
			this.anInt306 = arg3 - local21;
			this.anInt307 = arg1 - local23;
			this.anInt308 = arg2 - local25;
			this.anInt309 = arg0;
			this.anInt310 = arg4;
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("59102, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 9 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method122() {
		try {
			this.aClass1_Sub1_Sub2_Sub3_19 = new Class1_Sub1_Sub2_Sub3(this.aClass46_1, "titlebox", 0);
			this.aClass1_Sub1_Sub2_Sub3_20 = new Class1_Sub1_Sub2_Sub3(this.aClass46_1, "titlebutton", 0);
			this.aClass1_Sub1_Sub2_Sub3Array2 = new Class1_Sub1_Sub2_Sub3[12];
			for (@Pc(33) int local33 = 0; local33 < 12; local33++) {
				this.aClass1_Sub1_Sub2_Sub3Array2[local33] = new Class1_Sub1_Sub2_Sub3(this.aClass46_1, "runes", local33);
			}
			this.aClass1_Sub1_Sub2_Sub2_9 = new Class1_Sub1_Sub2_Sub2(128, 265);
			this.aClass1_Sub1_Sub2_Sub2_10 = new Class1_Sub1_Sub2_Sub2(128, 265);
			for (@Pc(66) int local66 = 0; local66 < 33920; local66++) {
				this.aClass1_Sub1_Sub2_Sub2_9.anIntArray209[local66] = this.aClass37_19.anIntArray235[local66];
			}
			for (@Pc(84) int local84 = 0; local84 < 33920; local84++) {
				this.aClass1_Sub1_Sub2_Sub2_10.anIntArray209[local84] = this.aClass37_20.anIntArray235[local84];
			}
			this.anIntArray52 = new int[256];
			for (@Pc(106) int local106 = 0; local106 < 64; local106++) {
				this.anIntArray52[local106] = local106 * 262144;
			}
			for (@Pc(121) int local121 = 0; local121 < 64; local121++) {
				this.anIntArray52[local121 + 64] = local121 * 1024 + 16711680;
			}
			for (@Pc(140) int local140 = 0; local140 < 64; local140++) {
				this.anIntArray52[local140 + 128] = local140 * 4 + 16776960;
			}
			for (@Pc(159) int local159 = 0; local159 < 64; local159++) {
				this.anIntArray52[local159 + 192] = 16777215;
			}
			this.anIntArray53 = new int[256];
			for (@Pc(178) int local178 = 0; local178 < 64; local178++) {
				this.anIntArray53[local178] = local178 * 1024;
			}
			for (@Pc(193) int local193 = 0; local193 < 64; local193++) {
				this.anIntArray53[local193 + 64] = local193 * 4 + 65280;
			}
			for (@Pc(212) int local212 = 0; local212 < 64; local212++) {
				this.anIntArray53[local212 + 128] = local212 * 262144 + 65535;
			}
			for (@Pc(231) int local231 = 0; local231 < 64; local231++) {
				this.anIntArray53[local231 + 192] = 16777215;
			}
			this.anIntArray54 = new int[256];
			for (@Pc(250) int local250 = 0; local250 < 64; local250++) {
				this.anIntArray54[local250] = local250 * 4;
			}
			for (@Pc(265) int local265 = 0; local265 < 64; local265++) {
				this.anIntArray54[local265 + 64] = local265 * 262144 + 255;
			}
			for (@Pc(284) int local284 = 0; local284 < 64; local284++) {
				this.anIntArray54[local284 + 128] = local284 * 1024 + 16711935;
			}
			for (@Pc(303) int local303 = 0; local303 < 64; local303++) {
				this.anIntArray54[local303 + 192] = 16777215;
			}
			this.anIntArray51 = new int[256];
			this.anIntArray90 = new int[32768];
			this.anIntArray91 = new int[32768];
			this.method125(50, null);
			this.anIntArray60 = new int[32768];
			this.anIntArray61 = new int[32768];
			this.method97("Connecting to fileserver", 10);
			if (!this.aBoolean70) {
				this.aBoolean48 = true;
				this.aBoolean70 = true;
				this.method96(this, 2);
			}
		} catch (@Pc(360) RuntimeException local360) {
			signlink.reporterror("14575, " + 19831 + ", " + local360.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIB)V")
	private void method123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5) {
		try {
			@Pc(8) int local8 = this.aClass38_1.method604(arg3, arg0, arg1);
			@Pc(18) int local18;
			@Pc(24) int local24;
			@Pc(28) int local28;
			@Pc(30) int local30;
			@Pc(52) int local52;
			@Pc(58) int local58;
			if (local8 != 0) {
				local18 = this.aClass38_1.method608(arg3, arg0, arg1, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = arg4;
				if (local8 > 0) {
					local30 = arg2;
				}
				@Pc(38) int[] local38 = this.aClass1_Sub1_Sub2_Sub2_8.anIntArray209;
				local52 = arg0 * 4 + (103 - arg1) * 512 * 4 + 24624;
				local58 = local8 >> 14 & 0x7FFF;
				@Pc(61) Class9 local61 = Class9.method258(local58);
				if (local61.anInt528 == -1) {
					if (local28 == 0 || local28 == 2) {
						if (local24 == 0) {
							local38[local52] = local30;
							local38[local52 + 512] = local30;
							local38[local52 + 1024] = local30;
							local38[local52 + 1536] = local30;
						} else if (local24 == 1) {
							local38[local52] = local30;
							local38[local52 + 1] = local30;
							local38[local52 + 2] = local30;
							local38[local52 + 3] = local30;
						} else if (local24 == 2) {
							local38[local52 + 3] = local30;
							local38[local52 + 3 + 512] = local30;
							local38[local52 + 3 + 1024] = local30;
							local38[local52 + 3 + 1536] = local30;
						} else if (local24 == 3) {
							local38[local52 + 1536] = local30;
							local38[local52 + 1536 + 1] = local30;
							local38[local52 + 1536 + 2] = local30;
							local38[local52 + 1536 + 3] = local30;
						}
					}
					if (local28 == 3) {
						if (local24 == 0) {
							local38[local52] = local30;
						} else if (local24 == 1) {
							local38[local52 + 3] = local30;
						} else if (local24 == 2) {
							local38[local52 + 3 + 1536] = local30;
						} else if (local24 == 3) {
							local38[local52 + 1536] = local30;
						}
					}
					if (local28 == 2) {
						if (local24 == 3) {
							local38[local52] = local30;
							local38[local52 + 512] = local30;
							local38[local52 + 1024] = local30;
							local38[local52 + 1536] = local30;
						} else if (local24 == 0) {
							local38[local52] = local30;
							local38[local52 + 1] = local30;
							local38[local52 + 2] = local30;
							local38[local52 + 3] = local30;
						} else if (local24 == 1) {
							local38[local52 + 3] = local30;
							local38[local52 + 3 + 512] = local30;
							local38[local52 + 3 + 1024] = local30;
							local38[local52 + 3 + 1536] = local30;
						} else if (local24 == 2) {
							local38[local52 + 1536] = local30;
							local38[local52 + 1536 + 1] = local30;
							local38[local52 + 1536 + 2] = local30;
							local38[local52 + 1536 + 3] = local30;
						}
					}
				} else {
					@Pc(71) Class1_Sub1_Sub2_Sub3 local71 = this.aClass1_Sub1_Sub2_Sub3Array1[local61.anInt528];
					if (local71 != null) {
						@Pc(83) int local83 = (local61.anInt523 * 4 - local71.anInt719) / 2;
						@Pc(93) int local93 = (local61.anInt524 * 4 - local71.anInt720) / 2;
						local71.method443(arg0 * 4 + local83 + 48, 200, (104 - arg1 - local61.anInt524) * 4 + local93 + 48);
					}
				}
			}
			local8 = this.aClass38_1.method606(arg3, arg0, arg1);
			if (arg5 != this.aByte8) {
				for (local18 = 1; local18 > 0; local18++) {
				}
			}
			if (local8 != 0) {
				local18 = this.aClass38_1.method608(arg3, arg0, arg1, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = local8 >> 14 & 0x7FFF;
				@Pc(458) Class9 local458 = Class9.method258(local30);
				@Pc(490) int local490;
				if (local458.anInt528 != -1) {
					@Pc(468) Class1_Sub1_Sub2_Sub3 local468 = this.aClass1_Sub1_Sub2_Sub3Array1[local458.anInt528];
					if (local468 != null) {
						local58 = (local458.anInt523 * 4 - local468.anInt719) / 2;
						local490 = (local458.anInt524 * 4 - local468.anInt720) / 2;
						local468.method443(arg0 * 4 + local58 + 48, 200, (104 - arg1 - local458.anInt524) * 4 + local490 + 48);
					}
				} else if (local28 == 9) {
					local52 = 15658734;
					if (local8 > 0) {
						local52 = 15597568;
					}
					@Pc(527) int[] local527 = this.aClass1_Sub1_Sub2_Sub2_8.anIntArray209;
					local490 = arg0 * 4 + (103 - arg1) * 512 * 4 + 24624;
					if (local24 == 0 || local24 == 2) {
						local527[local490 + 1536] = local52;
						local527[local490 + 1024 + 1] = local52;
						local527[local490 + 512 + 2] = local52;
						local527[local490 + 3] = local52;
					} else {
						local527[local490] = local52;
						local527[local490 + 512 + 1] = local52;
						local527[local490 + 1024 + 2] = local52;
						local527[local490 + 1536 + 3] = local52;
					}
				}
			}
			local8 = this.aClass38_1.method607(arg3, arg0, arg1);
			if (local8 != 0) {
				local18 = local8 >> 14 & 0x7FFF;
				@Pc(622) Class9 local622 = Class9.method258(local18);
				if (local622.anInt528 != -1) {
					@Pc(632) Class1_Sub1_Sub2_Sub3 local632 = this.aClass1_Sub1_Sub2_Sub3Array1[local622.anInt528];
					if (local632 != null) {
						local30 = (local622.anInt523 * 4 - local632.anInt719) / 2;
						@Pc(654) int local654 = (local622.anInt524 * 4 - local632.anInt720) / 2;
						local632.method443(arg0 * 4 + local30 + 48, 200, (104 - arg1 - local622.anInt524) * 4 + local654 + 48);
						return;
					}
				}
			}
		} catch (@Pc(678) RuntimeException local678) {
			signlink.reporterror("99813, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local678.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	private void method124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			@Pc(3) int local3 = 51 / arg3;
			if (arg6 >= 1 && arg1 >= 1 && arg6 <= 102 && arg1 <= 102) {
				if (aBoolean67 && arg7 != this.anInt419) {
					return;
				}
				@Pc(24) int local24 = 0;
				if (arg4 == 0) {
					local24 = this.aClass38_1.method604(arg7, arg6, arg1);
				}
				if (arg4 == 1) {
					local24 = this.aClass38_1.method605(arg7, arg6, arg1);
				}
				if (arg4 == 2) {
					local24 = this.aClass38_1.method606(arg7, arg6, arg1);
				}
				if (arg4 == 3) {
					local24 = this.aClass38_1.method607(arg7, arg6, arg1);
				}
				@Pc(80) int local80;
				if (local24 != 0) {
					local80 = this.aClass38_1.method608(arg7, arg6, arg1, local24);
					@Pc(86) int local86 = local24 >> 14 & 0x7FFF;
					@Pc(90) int local90 = local80 & 0x1F;
					@Pc(94) int local94 = local80 >> 6;
					@Pc(106) Class9 local106;
					if (arg4 == 0) {
						this.aClass38_1.method595(arg1, arg7, arg6);
						local106 = Class9.method258(local86);
						if (local106.aBoolean103) {
							this.aClass19Array1[arg7].method417(arg1, local94, arg6, local90, local106.aBoolean104);
						}
					}
					if (arg4 == 1) {
						this.aClass38_1.method596(arg6, arg7, arg1);
					}
					if (arg4 == 2) {
						this.aClass38_1.method597(arg1, arg7, arg6);
						local106 = Class9.method258(local86);
						if (arg6 + local106.anInt523 > 103 || arg1 + local106.anInt523 > 103 || arg6 + local106.anInt524 > 103 || arg1 + local106.anInt524 > 103) {
							return;
						}
						if (local106.aBoolean103) {
							this.aClass19Array1[arg7].method418(arg6, local106.anInt523, arg1, local106.aBoolean104, local94, local106.anInt524);
						}
					}
					if (arg4 == 3) {
						this.aClass38_1.method598(arg6, 876, arg7, arg1);
						local106 = Class9.method258(local86);
						if (local106.aBoolean103 && local106.aBoolean105) {
							this.aClass19Array1[arg7].method420(arg1, arg6);
						}
					}
				}
				if (arg5 >= 0) {
					local80 = arg7;
					if (arg7 < 3 && (this.aByteArrayArrayArray7[1][arg6][arg1] & 0x2) == 2) {
						local80 = arg7 + 1;
					}
					Class4.method74(this.anIntArrayArrayArray3, this.aClass38_1, arg7, arg1, arg6, arg5, local80, arg0, this.aClass19Array1[arg7], arg2);
					return;
				}
			}
		} catch (@Pc(253) RuntimeException local253) {
			signlink.reporterror("55740, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local253.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!kb;)V")
	private void method125(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub3 arg1) {
		try {
			@Pc(7) boolean local7 = false;
			for (@Pc(9) int local9 = 0; local9 < this.anIntArray90.length; local9++) {
				this.anIntArray90[local9] = 0;
			}
			@Pc(34) int local34;
			for (@Pc(24) int local24 = 0; local24 < 5000; local24++) {
				local34 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray90[local34] = (int) (Math.random() * 256.0D);
			}
			@Pc(52) int local52;
			@Pc(56) int local56;
			@Pc(64) int local64;
			for (local34 = 0; local34 < 20; local34++) {
				for (local52 = 1; local52 < 255; local52++) {
					for (local56 = 1; local56 < 127; local56++) {
						local64 = local56 + (local52 << 7);
						this.anIntArray91[local64] = (this.anIntArray90[local64 - 1] + this.anIntArray90[local64 + 1] + this.anIntArray90[local64 - 128] + this.anIntArray90[local64 + 128]) / 4;
					}
				}
				@Pc(110) int[] local110 = this.anIntArray90;
				this.anIntArray90 = this.anIntArray91;
				this.anIntArray91 = local110;
			}
			if (arg1 != null) {
				local52 = 0;
				for (local56 = 0; local56 < arg1.anInt720; local56++) {
					for (local64 = 0; local64 < arg1.anInt719; local64++) {
						if (arg1.aByteArray7[local52++] != 0) {
							@Pc(146) int local146 = local64 + arg1.anInt721 + 16;
							@Pc(153) int local153 = local56 + arg1.anInt722 + 16;
							@Pc(159) int local159 = local146 + (local153 << 7);
							this.anIntArray90[local159] = 0;
						}
					}
				}
			}
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("90096, " + arg0 + ", " + arg1 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!mb;IB)V")
	private void method126(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt405; local1++) {
				@Pc(8) int local8 = this.anIntArray79[local1];
				@Pc(13) Class1_Sub1_Sub1_Sub1_Sub2 local13 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local8];
				@Pc(16) int local16 = arg0.method496();
				if ((local16 & 0x80) == 128) {
					local16 += arg0.method496() << 8;
				}
				this.method219((byte) 3, local16, local8, local13, arg0);
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("91933, " + arg0 + ", " + arg1 + ", " + 5 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	private void method127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(3) Class1_Sub2 local3 = null;
			for (@Pc(8) Class1_Sub2 local8 = (Class1_Sub2) this.aClass31_3.method524(); local8 != null; local8 = (Class1_Sub2) this.aClass31_3.method526()) {
				if (local8.anInt827 == arg2 && local8.anInt829 == arg7 && local8.anInt830 == arg4 && local8.anInt828 == arg1) {
					local3 = local8;
					break;
				}
			}
			if (local3 == null) {
				local3 = new Class1_Sub2();
				local3.anInt827 = arg2;
				local3.anInt828 = arg1;
				local3.anInt829 = arg7;
				local3.anInt830 = arg4;
				this.method192(local3);
				this.aClass31_3.method521(local3);
			}
			local3.anInt834 = arg0;
			local3.anInt836 = arg8;
			local3.anInt835 = arg3;
			local3.anInt837 = arg5;
			local3.anInt838 = arg6;
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("87555, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -431 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method128(@OriginalArg(0) int arg0) {
		try {
			signlink.anInt937 = arg0;
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("96347, " + arg0 + ", " + 0 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZB)V")
	private void method129(@OriginalArg(0) boolean arg0) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anInt382; local5++) {
				@Pc(15) Class1_Sub1_Sub1_Sub1_Sub1 local15 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray74[local5]];
				@Pc(24) int local24 = (this.anIntArray74[local5] << 14) + 536870912;
				if (local15 != null && local15.method49(this.aByte13) && local15.aClass13_1.aBoolean132 == arg0) {
					@Pc(41) int local41 = local15.anInt128 >> 7;
					@Pc(46) int local46 = local15.anInt129 >> 7;
					if (local41 >= 0 && local41 < 104 && local46 >= 0 && local46 < 104) {
						if (local15.anInt131 == 1 && (local15.anInt128 & 0x7F) == 64 && (local15.anInt129 & 0x7F) == 64) {
							if (this.anIntArrayArray5[local41][local46] == this.anInt447) {
								continue;
							}
							this.anIntArrayArray5[local41][local46] = this.anInt447;
						}
						this.aClass38_1.method589((local15.anInt131 - 1) * 64 + 60, local15.anInt129, local15.anInt130, local15.anInt128, local24, this.anInt419, local15.aBoolean25, this.method197(local15.anInt129, this.anInt419, local15.anInt128, (byte) 2), local15);
					}
				}
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("44365, " + arg0 + ", " + 3 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!z;I)V")
	private void method130(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		try {
			this.method131(arg0.anInt129, arg1, arg0.anInt128);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("47132, " + false + ", " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)V")
	private void method131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
				@Pc(28) int local28 = this.method197(arg0, this.anInt419, arg2, (byte) 2) - arg1;
				@Pc(33) int local33 = arg2 - this.anInt306;
				@Pc(48) int local48 = local28 - this.anInt307;
				@Pc(53) int local53 = arg0 - this.anInt308;
				@Pc(58) int local58 = Class1_Sub1_Sub1_Sub5.anIntArray157[this.anInt309];
				@Pc(63) int local63 = Class1_Sub1_Sub1_Sub5.anIntArray158[this.anInt309];
				@Pc(68) int local68 = Class1_Sub1_Sub1_Sub5.anIntArray157[this.anInt310];
				@Pc(73) int local73 = Class1_Sub1_Sub1_Sub5.anIntArray158[this.anInt310];
				@Pc(83) int local83 = local53 * local68 + local33 * local73 >> 16;
				@Pc(93) int local93 = local53 * local73 - local33 * local68 >> 16;
				@Pc(95) int local95 = local83;
				@Pc(105) int local105 = local48 * local63 - local93 * local58 >> 16;
				@Pc(115) int local115 = local48 * local58 + local93 * local63 >> 16;
				if (local115 >= 50) {
					this.anInt320 = Class1_Sub1_Sub2_Sub1.anInt664 + (local95 << 9) / local115;
					this.anInt321 = Class1_Sub1_Sub2_Sub1.anInt665 + (local105 << 9) / local115;
				} else {
					this.anInt320 = -1;
					this.anInt321 = -1;
				}
			} else {
				this.anInt320 = -1;
				this.anInt321 = -1;
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("71003, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -969 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method132() {
		try {
			this.aBoolean55 &= true;
			@Pc(10) Graphics local10 = this.method95().getGraphics();
			local10.setColor(Color.black);
			local10.fillRect(0, 0, 765, 503);
			this.method88();
			@Pc(42) byte local42;
			@Pc(48) int local48;
			if (this.aBoolean63) {
				this.aBoolean70 = false;
				local10.setFont(new Font("Helvetica", 1, 16));
				local10.setColor(Color.yellow);
				local42 = 35;
				local10.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
				local48 = local42 + 50;
				local10.setColor(Color.white);
				local10.drawString("To fix this try the following (in order):", 30, 85);
				@Pc(57) int local57 = local48 + 50;
				local10.setColor(Color.white);
				local10.setFont(new Font("Helvetica", 1, 12));
				local10.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				@Pc(74) int local74 = local57 + 30;
				local10.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
				@Pc(80) int local80 = local74 + 30;
				local10.drawString("3: Try using a different game-world", 30, 195);
				@Pc(86) int local86 = local80 + 30;
				local10.drawString("4: Try rebooting your computer", 30, 225);
				@Pc(92) int local92 = local86 + 30;
				local10.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
			}
			if (this.aBoolean51) {
				this.aBoolean70 = false;
				local10.setFont(new Font("Helvetica", 1, 20));
				local10.setColor(Color.white);
				local10.drawString("Error - unable to load game!", 50, 50);
				local10.drawString("To play RuneScape make sure you play from", 50, 100);
				local10.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean53) {
				this.aBoolean70 = false;
				local10.setColor(Color.yellow);
				local42 = 35;
				local10.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
				local48 = local42 + 50;
				local10.setColor(Color.white);
				local10.drawString("To fix this try the following (in order):", 30, 85);
				local48 += 50;
				local10.setColor(Color.white);
				local10.setFont(new Font("Helvetica", 1, 12));
				local10.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				local48 += 30;
				local10.drawString("2: Try rebooting your computer, and reloading", 30, 165);
				local48 += 30;
			}
		} catch (@Pc(180) RuntimeException local180) {
			signlink.reporterror("22842, " + true + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method133(@OriginalArg(1) int arg0) {
		try {
			if (arg0 >= 0) {
				if (this.aBoolean43) {
					this.aBoolean43 = false;
					this.aBoolean68 = true;
				}
				@Pc(18) int local18 = this.anIntArray81[arg0];
				@Pc(23) int local23 = this.anIntArray82[arg0];
				@Pc(28) int local28 = this.anIntArray83[arg0];
				@Pc(33) int local33 = this.anIntArray84[arg0];
				if (local28 >= 2000) {
					local28 -= 2000;
				}
				@Pc(64) Class6 local64;
				@Pc(82) int local82;
				if (local28 == 465) {
					this.aClass1_Sub1_Sub3_2.method485(177);
					this.aClass1_Sub1_Sub3_2.method487(local23);
					local64 = Class6.aClass6Array1[local23];
					if (local64.anIntArrayArray6 != null && local64.anIntArrayArray6[0][0] == 5) {
						local82 = local64.anIntArrayArray6[0][1];
						this.anIntArray72[local82] = 1 - this.anIntArray72[local82];
						this.method108(238, local82);
						this.aBoolean78 = true;
					}
				}
				if (local28 == 881) {
					this.aClass1_Sub1_Sub3_2.method485(126);
					this.aClass1_Sub1_Sub3_2.method487(local33);
					this.aClass1_Sub1_Sub3_2.method487(local18);
					this.aClass1_Sub1_Sub3_2.method487(local23);
					this.aClass1_Sub1_Sub3_2.method487(this.anInt364);
					this.aClass1_Sub1_Sub3_2.method487(this.anInt362);
					this.aClass1_Sub1_Sub3_2.method487(this.anInt363);
					this.anInt449 = 0;
					this.anInt450 = local23;
					this.anInt451 = local18;
					this.anInt452 = 2;
					if (Class6.aClass6Array1[local23].anInt459 == this.anInt254) {
						this.anInt452 = 1;
					}
					if (Class6.aClass6Array1[local23].anInt459 == this.anInt328) {
						this.anInt452 = 3;
					}
				}
				@Pc(172) Class15 local172;
				@Pc(181) String local181;
				if (local28 == 1102) {
					local172 = Class15.method343(local33);
					if (local172.aByteArray6 == null) {
						local181 = "It's a " + local172.aString26 + ".";
					} else {
						local181 = new String(local172.aByteArray6);
					}
					this.method106("", 0, local181);
				}
				if (local28 == 581) {
					if ((local33 & 0x3) == 0) {
						anInt339++;
					}
					if (anInt339 >= 99) {
						this.aClass1_Sub1_Sub3_2.method485(87);
						this.aClass1_Sub1_Sub3_2.method490(0);
					}
					this.method211(local33, 204, local18, local23);
				}
				@Pc(239) Class1_Sub1_Sub1_Sub1_Sub1 local239;
				if (local28 == 1607) {
					local239 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
					if (local239 != null) {
						if (local239.aClass13_1.aByteArray5 == null) {
							local181 = "It's a " + local239.aClass13_1.aString25 + ".";
						} else {
							local181 = new String(local239.aClass13_1.aByteArray5);
						}
						this.method106("", 0, local181);
					}
				}
				@Pc(293) String local293;
				if (local28 == 1175) {
					@Pc(281) int local281 = local33 >> 14 & 0x7FFF;
					@Pc(284) Class9 local284 = Class9.method258(local281);
					if (local284.aByteArray4 == null) {
						local293 = "It's a " + local284.aString24 + ".";
					} else {
						local293 = new String(local284.aByteArray4);
					}
					this.method106("", 0, local293);
				}
				if (local28 == 728 || local28 == 542 || local28 == 6 || local28 == 963 || local28 == 245) {
					local239 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
					if (local239 != null) {
						this.method100(0, 1, 2, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], 1, 0, local239.anIntArray16[0], false, local239.anIntArray17[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0]);
						this.anInt300 = super.anInt238;
						this.anInt301 = super.anInt239;
						this.anInt303 = 2;
						this.anInt302 = 0;
						if (local28 == 728) {
							this.aClass1_Sub1_Sub3_2.method485(180);
						}
						if (local28 == 963) {
							this.aClass1_Sub1_Sub3_2.method485(107);
						}
						if (local28 == 542) {
							this.aClass1_Sub1_Sub3_2.method485(252);
						}
						if (local28 == 6) {
							if ((local33 & 0x3) == 0) {
								anInt425++;
							}
							if (anInt425 >= 124) {
								this.aClass1_Sub1_Sub3_2.method485(95);
								this.aClass1_Sub1_Sub3_2.method490(0);
							}
							this.aClass1_Sub1_Sub3_2.method485(196);
						}
						if (local28 == 245) {
							if ((local33 & 0x3) == 0) {
								anInt368++;
							}
							if (anInt368 >= 85) {
								this.aClass1_Sub1_Sub3_2.method485(186);
								this.aClass1_Sub1_Sub3_2.method487(39596);
							}
							this.aClass1_Sub1_Sub3_2.method485(43);
						}
						this.aClass1_Sub1_Sub3_2.method487(local33);
					}
				}
				if (local28 == 1773) {
					local172 = Class15.method343(local33);
					if (local23 >= 100000) {
						local181 = local23 + " x " + local172.aString26;
					} else if (local172.aByteArray6 == null) {
						local181 = "It's a " + local172.aString26 + ".";
					} else {
						local181 = new String(local172.aByteArray6);
					}
					this.method106("", 0, local181);
				}
				if (local28 == 188) {
					this.anInt361 = 1;
					this.anInt362 = local18;
					this.anInt363 = local23;
					this.anInt364 = local33;
					this.aString13 = Class15.method343(local33).aString26;
					this.anInt313 = 0;
					this.aBoolean78 = true;
				} else {
					if (local28 == 900) {
						local239 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
						if (local239 != null) {
							this.method100(0, 1, 2, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], 1, 0, local239.anIntArray16[0], false, local239.anIntArray17[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0]);
							this.anInt300 = super.anInt238;
							this.anInt301 = super.anInt239;
							this.anInt303 = 2;
							this.anInt302 = 0;
							this.aClass1_Sub1_Sub3_2.method485(14);
							this.aClass1_Sub1_Sub3_2.method487(local33);
							this.aClass1_Sub1_Sub3_2.method487(this.anInt364);
							this.aClass1_Sub1_Sub3_2.method487(this.anInt362);
							this.aClass1_Sub1_Sub3_2.method487(this.anInt363);
						}
					}
					@Pc(636) boolean local636;
					if (local28 == 217) {
						local636 = this.method100(0, 0, 2, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], 0, 0, local18, false, local23, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0]);
						if (!local636) {
							this.method100(0, 1, 2, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], 1, 0, local18, false, local23, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0]);
						}
						this.anInt300 = super.anInt238;
						this.anInt301 = super.anInt239;
						this.anInt303 = 2;
						this.anInt302 = 0;
						this.aClass1_Sub1_Sub3_2.method485(143);
						this.aClass1_Sub1_Sub3_2.method487(local18 + this.anInt281);
						this.aClass1_Sub1_Sub3_2.method487(local23 + this.anInt282);
						this.aClass1_Sub1_Sub3_2.method487(local33);
						this.aClass1_Sub1_Sub3_2.method487(this.anInt364);
						this.aClass1_Sub1_Sub3_2.method487(this.anInt362);
						this.aClass1_Sub1_Sub3_2.method487(this.anInt363);
					}
					@Pc(719) Class1_Sub1_Sub1_Sub1_Sub2 local719;
					if (local28 == 651) {
						local719 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local719 != null) {
							this.method100(0, 1, 2, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], 1, 0, local719.anIntArray16[0], false, local719.anIntArray17[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0]);
							this.anInt300 = super.anInt238;
							this.anInt301 = super.anInt239;
							this.anInt303 = 2;
							this.anInt302 = 0;
							this.aClass1_Sub1_Sub3_2.method485(52);
							this.aClass1_Sub1_Sub3_2.method487(local33);
							this.aClass1_Sub1_Sub3_2.method487(this.anInt314);
						}
					}
					if (local28 == 602 || local28 == 596 || local28 == 22 || local28 == 892 || local28 == 415) {
						if (local28 == 22) {
							this.aClass1_Sub1_Sub3_2.method485(48);
						}
						if (local28 == 415) {
							if ((local23 & 0x3) == 0) {
								anInt322++;
							}
							if (anInt322 >= 55) {
								this.aClass1_Sub1_Sub3_2.method485(119);
								this.aClass1_Sub1_Sub3_2.method490(0);
							}
							this.aClass1_Sub1_Sub3_2.method485(242);
						}
						if (local28 == 892) {
							if ((local18 & 0x3) == 0) {
								anInt316++;
							}
							if (anInt316 >= 130) {
								this.aClass1_Sub1_Sub3_2.method485(233);
								this.aClass1_Sub1_Sub3_2.method486(177);
							}
							this.aClass1_Sub1_Sub3_2.method485(183);
						}
						if (local28 == 602) {
							this.aClass1_Sub1_Sub3_2.method485(13);
						}
						if (local28 == 596) {
							this.aClass1_Sub1_Sub3_2.method485(58);
						}
						this.aClass1_Sub1_Sub3_2.method487(local33);
						this.aClass1_Sub1_Sub3_2.method487(local18);
						this.aClass1_Sub1_Sub3_2.method487(local23);
						this.anInt449 = 0;
						this.anInt450 = local23;
						this.anInt451 = local18;
						this.anInt452 = 2;
						if (Class6.aClass6Array1[local23].anInt459 == this.anInt254) {
							this.anInt452 = 1;
						}
						if (Class6.aClass6Array1[local23].anInt459 == this.anInt328) {
							this.anInt452 = 3;
						}
					}
					if (local28 == 951) {
						local64 = Class6.aClass6Array1[local23];
						@Pc(924) boolean local924 = true;
						if (local64.anInt462 > 0) {
							local924 = this.method200(local64);
						}
						if (local924) {
							this.aClass1_Sub1_Sub3_2.method485(177);
							this.aClass1_Sub1_Sub3_2.method487(local23);
						}
					}
					if (local28 == 504) {
						this.method211(local33, 219, local18, local23);
					}
					if (local28 == 405 || local28 == 38 || local28 == 422 || local28 == 478 || local28 == 347) {
						if (local28 == 38) {
							this.aClass1_Sub1_Sub3_2.method485(193);
						}
						if (local28 == 347) {
							this.aClass1_Sub1_Sub3_2.method485(9);
						}
						if (local28 == 478) {
							if ((local18 & 0x3) == 0) {
								anInt426++;
							}
							if (anInt426 >= 90) {
								this.aClass1_Sub1_Sub3_2.method485(74);
							}
							this.aClass1_Sub1_Sub3_2.method485(194);
						}
						if (local28 == 422) {
							this.aClass1_Sub1_Sub3_2.method485(115);
						}
						if (local28 == 405) {
							anInt242 += local33;
							if (anInt242 >= 97) {
								this.aClass1_Sub1_Sub3_2.method485(146);
								this.aClass1_Sub1_Sub3_2.method489(14953816);
							}
							this.aClass1_Sub1_Sub3_2.method485(104);
						}
						this.aClass1_Sub1_Sub3_2.method487(local33);
						this.aClass1_Sub1_Sub3_2.method487(local18);
						this.aClass1_Sub1_Sub3_2.method487(local23);
						this.anInt449 = 0;
						this.anInt450 = local23;
						this.anInt451 = local18;
						this.anInt452 = 2;
						if (Class6.aClass6Array1[local23].anInt459 == this.anInt254) {
							this.anInt452 = 1;
						}
						if (Class6.aClass6Array1[local23].anInt459 == this.anInt328) {
							this.anInt452 = 3;
						}
					}
					if (local28 == 965) {
						local636 = this.method100(0, 0, 2, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], 0, 0, local18, false, local23, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0]);
						if (!local636) {
							this.method100(0, 1, 2, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], 1, 0, local18, false, local23, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0]);
						}
						this.anInt300 = super.anInt238;
						this.anInt301 = super.anInt239;
						this.anInt303 = 2;
						this.anInt302 = 0;
						this.aClass1_Sub1_Sub3_2.method485(122);
						this.aClass1_Sub1_Sub3_2.method487(local18 + this.anInt281);
						this.aClass1_Sub1_Sub3_2.method487(local23 + this.anInt282);
						this.aClass1_Sub1_Sub3_2.method487(local33);
						this.aClass1_Sub1_Sub3_2.method487(this.anInt314);
					}
					if (local28 == 367) {
						local719 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local719 != null) {
							this.method100(0, 1, 2, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], 1, 0, local719.anIntArray16[0], false, local719.anIntArray17[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0]);
							this.anInt300 = super.anInt238;
							this.anInt301 = super.anInt239;
							this.anInt303 = 2;
							this.anInt302 = 0;
							this.aClass1_Sub1_Sub3_2.method485(210);
							this.aClass1_Sub1_Sub3_2.method487(local33);
							this.aClass1_Sub1_Sub3_2.method487(this.anInt364);
							this.aClass1_Sub1_Sub3_2.method487(this.anInt362);
							this.aClass1_Sub1_Sub3_2.method487(this.anInt363);
						}
					}
					if (local28 == 947) {
						this.method188();
					}
					if (local28 == 44 && !this.aBoolean58) {
						this.aClass1_Sub1_Sub3_2.method485(239);
						this.aClass1_Sub1_Sub3_2.method487(local23);
						this.aBoolean58 = true;
					}
					if (local28 == 1501) {
						anInt337 += this.anInt282;
						if (anInt337 >= 92) {
							this.aClass1_Sub1_Sub3_2.method485(250);
							this.aClass1_Sub1_Sub3_2.method490(0);
						}
						this.method211(local33, 86, local18, local23);
					}
					if (local28 == 960) {
						this.aClass1_Sub1_Sub3_2.method485(177);
						this.aClass1_Sub1_Sub3_2.method487(local23);
						local64 = Class6.aClass6Array1[local23];
						if (local64.anIntArrayArray6 != null && local64.anIntArrayArray6[0][0] == 5) {
							local82 = local64.anIntArrayArray6[0][1];
							if (this.anIntArray72[local82] != local64.anIntArray98[0]) {
								this.anIntArray72[local82] = local64.anIntArray98[0];
								this.method108(238, local82);
								this.aBoolean78 = true;
							}
						}
					}
					if (local28 == 364) {
						this.method211(local33, 226, local18, local23);
					}
					if (local28 == 1373 || local28 == 1544 || local28 == 151 || local28 == 1101) {
						local719 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local719 != null) {
							this.method100(0, 1, 2, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], 1, 0, local719.anIntArray16[0], false, local719.anIntArray17[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0]);
							this.anInt300 = super.anInt238;
							this.anInt301 = super.anInt239;
							this.anInt303 = 2;
							this.anInt302 = 0;
							if (local28 == 1101) {
								this.aClass1_Sub1_Sub3_2.method485(135);
							}
							if (local28 == 1373) {
								this.aClass1_Sub1_Sub3_2.method485(54);
							}
							if (local28 == 1544) {
								this.aClass1_Sub1_Sub3_2.method485(172);
							}
							if (local28 == 151) {
								anInt388++;
								if (anInt388 >= 90) {
									this.aClass1_Sub1_Sub3_2.method485(171);
									this.aClass1_Sub1_Sub3_2.method487(31114);
								}
								this.aClass1_Sub1_Sub3_2.method485(165);
							}
							this.aClass1_Sub1_Sub3_2.method487(local33);
						}
					}
					if (local28 == 285) {
						this.method211(local33, 1, local18, local23);
					}
					if (local28 == 55 && this.method211(local33, 208, local18, local23)) {
						this.aClass1_Sub1_Sub3_2.method487(this.anInt314);
					}
					@Pc(1545) int local1545;
					@Pc(1520) String local1520;
					if (local28 == 903 || local28 == 363) {
						local1520 = this.aStringArray1[arg0];
						local82 = local1520.indexOf("@whi@");
						if (local82 != -1) {
							local1520 = local1520.substring(local82 + 5).trim();
							local293 = Class47.method679(Class47.method676(Class47.method675(local1520)));
							@Pc(1543) boolean local1543 = false;
							for (local1545 = 0; local1545 < this.anInt404; local1545++) {
								@Pc(1555) Class1_Sub1_Sub1_Sub1_Sub2 local1555 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray78[local1545]];
								if (local1555 != null && local1555.aString4 != null && local1555.aString4.equalsIgnoreCase(local293)) {
									this.method100(0, 1, 2, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], 1, 0, local1555.anIntArray16[0], false, local1555.anIntArray17[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0]);
									if (local28 == 903) {
										this.aClass1_Sub1_Sub3_2.method485(54);
									}
									if (local28 == 363) {
										this.aClass1_Sub1_Sub3_2.method485(135);
									}
									this.aClass1_Sub1_Sub3_2.method487(this.anIntArray78[local1545]);
									local1543 = true;
									break;
								}
							}
							if (!local1543) {
								this.method106("", 0, "Unable to find " + local293);
							}
						}
					}
					if (local28 == 265) {
						local239 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
						if (local239 != null) {
							this.method100(0, 1, 2, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], 1, 0, local239.anIntArray16[0], false, local239.anIntArray17[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0]);
							this.anInt300 = super.anInt238;
							this.anInt301 = super.anInt239;
							this.anInt303 = 2;
							this.anInt302 = 0;
							this.aClass1_Sub1_Sub3_2.method485(141);
							this.aClass1_Sub1_Sub3_2.method487(local33);
							this.aClass1_Sub1_Sub3_2.method487(this.anInt314);
						}
					}
					if (local28 == 660) {
						if (this.aBoolean60) {
							this.aClass38_1.method616(local18 - 4, local23 - 4);
						} else {
							this.aClass38_1.method616(super.anInt238 - 4, super.anInt239 - 4);
						}
					}
					if (local28 == 34) {
						local1520 = this.aStringArray1[arg0];
						local82 = local1520.indexOf("@whi@");
						if (local82 != -1) {
							this.method188();
							this.aString17 = local1520.substring(local82 + 5).trim();
							this.aBoolean44 = false;
							for (@Pc(1764) int local1764 = 0; local1764 < Class6.aClass6Array1.length; local1764++) {
								if (Class6.aClass6Array1[local1764] != null && Class6.aClass6Array1[local1764].anInt462 == 600) {
									this.anInt430 = this.anInt254 = Class6.aClass6Array1[local1764].anInt459;
									break;
								}
							}
						}
					}
					@Pc(1824) long local1824;
					if (local28 == 406 || local28 == 436 || local28 == 557 || local28 == 556) {
						local1520 = this.aStringArray1[arg0];
						local82 = local1520.indexOf("@whi@");
						if (local82 != -1) {
							local1824 = Class47.method675(local1520.substring(local82 + 5).trim());
							if (local28 == 406) {
								this.method201(local1824);
							}
							if (local28 == 436) {
								this.method138(local1824);
							}
							if (local28 == 557) {
								this.method142(local1824);
							}
							if (local28 == 556) {
								this.method220(local1824);
							}
						}
					}
					if (local28 == 224 || local28 == 993 || local28 == 99 || local28 == 746 || local28 == 877) {
						local636 = this.method100(0, 0, 2, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], 0, 0, local18, false, local23, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0]);
						if (!local636) {
							this.method100(0, 1, 2, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], 1, 0, local18, false, local23, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0]);
						}
						this.anInt300 = super.anInt238;
						this.anInt301 = super.anInt239;
						this.anInt303 = 2;
						this.anInt302 = 0;
						if (local28 == 99) {
							this.aClass1_Sub1_Sub3_2.method485(55);
						}
						if (local28 == 993) {
							this.aClass1_Sub1_Sub3_2.method485(238);
						}
						if (local28 == 224) {
							this.aClass1_Sub1_Sub3_2.method485(113);
						}
						if (local28 == 877) {
							this.aClass1_Sub1_Sub3_2.method485(247);
						}
						if (local28 == 746) {
							this.aClass1_Sub1_Sub3_2.method485(17);
						}
						this.aClass1_Sub1_Sub3_2.method487(local18 + this.anInt281);
						this.aClass1_Sub1_Sub3_2.method487(local23 + this.anInt282);
						this.aClass1_Sub1_Sub3_2.method487(local33);
					}
					if (local28 == 930) {
						local64 = Class6.aClass6Array1[local23];
						this.anInt313 = 1;
						this.anInt314 = local23;
						this.anInt315 = local64.anInt486;
						this.anInt361 = 0;
						this.aBoolean78 = true;
						local181 = local64.aString21;
						if (local181.indexOf(" ") != -1) {
							local181 = local181.substring(0, local181.indexOf(" "));
						}
						local293 = local64.aString21;
						if (local293.indexOf(" ") != -1) {
							local293 = local293.substring(local293.indexOf(" ") + 1);
						}
						this.aString9 = local181 + " " + local64.aString22 + " " + local293;
						if (this.anInt315 == 16) {
							this.aBoolean78 = true;
							this.anInt370 = 3;
							this.aBoolean74 = true;
						}
					} else {
						if (local28 == 679) {
							local1520 = this.aStringArray1[arg0];
							local82 = local1520.indexOf("@whi@");
							if (local82 != -1) {
								local1824 = Class47.method675(local1520.substring(local82 + 5).trim());
								local1545 = -1;
								for (@Pc(2095) int local2095 = 0; local2095 < this.anInt331; local2095++) {
									if (this.aLongArray3[local2095] == local1824) {
										local1545 = local2095;
										break;
									}
								}
								if (local1545 != -1 && this.anIntArray64[local1545] > 0) {
									this.aBoolean68 = true;
									this.aBoolean43 = false;
									this.aBoolean47 = true;
									this.aString12 = "";
									this.anInt443 = 3;
									this.aLong15 = this.aLongArray3[local1545];
									this.aString7 = "Enter message to send to " + this.aStringArray5[local1545];
								}
							}
						}
						if (local28 == 391) {
							this.aClass1_Sub1_Sub3_2.method485(188);
							this.aClass1_Sub1_Sub3_2.method487(local33);
							this.aClass1_Sub1_Sub3_2.method487(local18);
							this.aClass1_Sub1_Sub3_2.method487(local23);
							this.aClass1_Sub1_Sub3_2.method487(this.anInt314);
							this.anInt449 = 0;
							this.anInt450 = local23;
							this.anInt451 = local18;
							this.anInt452 = 2;
							if (Class6.aClass6Array1[local23].anInt459 == this.anInt254) {
								this.anInt452 = 1;
							}
							if (Class6.aClass6Array1[local23].anInt459 == this.anInt328) {
								this.anInt452 = 3;
							}
						}
						if (local28 == 450 && this.method211(local33, 147, local18, local23)) {
							this.aClass1_Sub1_Sub3_2.method487(this.anInt364);
							this.aClass1_Sub1_Sub3_2.method487(this.anInt362);
							this.aClass1_Sub1_Sub3_2.method487(this.anInt363);
						}
						this.anInt361 = 0;
						this.anInt313 = 0;
						this.aBoolean78 = true;
					}
				}
			}
		} catch (@Pc(2248) RuntimeException local2248) {
			signlink.reporterror("12169, " + -2 + ", " + arg0 + ", " + local2248.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!mb;IZ)V")
	private void method134(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			arg0.method506();
			@Pc(10) int local10 = arg0.method507(8, this.anInt377);
			@Pc(16) int local16;
			if (local10 < this.anInt382) {
				for (local16 = local10; local16 < this.anInt382; local16++) {
					this.anIntArray89[this.anInt414++] = this.anIntArray74[local16];
				}
			}
			if (local10 > this.anInt382) {
				signlink.reporterror(this.aString5 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt382 = 0;
			for (local16 = 0; local16 < local10; local16++) {
				@Pc(68) int local68 = this.anIntArray74[local16];
				@Pc(73) Class1_Sub1_Sub1_Sub1_Sub1 local73 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local68];
				@Pc(79) int local79 = arg0.method507(1, this.anInt377);
				if (local79 == 0) {
					this.anIntArray74[this.anInt382++] = local68;
					local73.anInt168 = anInt367;
				} else {
					@Pc(103) int local103 = arg0.method507(2, this.anInt377);
					if (local103 == 0) {
						this.anIntArray74[this.anInt382++] = local68;
						local73.anInt168 = anInt367;
						this.anIntArray79[this.anInt405++] = local68;
					} else {
						@Pc(155) int local155;
						@Pc(166) int local166;
						if (local103 == 1) {
							this.anIntArray74[this.anInt382++] = local68;
							local73.anInt168 = anInt367;
							local155 = arg0.method507(3, this.anInt377);
							local73.method47(false, local155);
							local166 = arg0.method507(1, this.anInt377);
							if (local166 == 1) {
								this.anIntArray79[this.anInt405++] = local68;
							}
						} else if (local103 == 2) {
							this.anIntArray74[this.anInt382++] = local68;
							local73.anInt168 = anInt367;
							local155 = arg0.method507(3, this.anInt377);
							local73.method47(true, local155);
							local166 = arg0.method507(3, this.anInt377);
							local73.method47(true, local166);
							@Pc(227) int local227 = arg0.method507(1, this.anInt377);
							if (local227 == 1) {
								this.anIntArray79[this.anInt405++] = local68;
							}
						} else if (local103 == 3) {
							this.anIntArray89[this.anInt414++] = local68;
						}
					}
				}
			}
		} catch (@Pc(268) RuntimeException local268) {
			signlink.reporterror("3058, " + arg0 + ", " + arg1 + ", " + true + ", " + local268.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method135() {
		try {
			this.aBoolean46 = true;
			try {
				@Pc(8) long local8 = System.currentTimeMillis();
				@Pc(10) int local10 = 0;
				@Pc(12) int local12 = 20;
				while (this.aBoolean70) {
					this.anInt273++;
					this.method164();
					this.method164();
					this.method183();
					local10++;
					if (local10 > 10) {
						@Pc(35) long local35 = System.currentTimeMillis();
						@Pc(44) int local44 = (int) (local35 - local8) / 10 - local12;
						local12 = 40 - local44;
						if (local12 < 5) {
							local12 = 5;
						}
						local10 = 0;
						local8 = local35;
					}
					try {
						Thread.sleep((long) local12);
					} catch (@Pc(62) Exception local62) {
					}
				}
			} catch (@Pc(68) Exception local68) {
			}
			this.aBoolean46 = false;
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("55684, " + 9 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!bb;III)V")
	private void method136(@OriginalArg(1) Class1_Sub1_Sub1_Sub1_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 != aClass1_Sub1_Sub1_Sub1_Sub2_1 && this.anInt251 < 400) {
				@Pc(32) String local32 = arg0.aString4 + method107(aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt177, arg0.anInt177) + " (level-" + arg0.anInt177 + ")";
				if (this.anInt361 == 1) {
					this.aStringArray1[this.anInt251] = "Use " + this.aString13 + " with @whi@" + local32;
					this.anIntArray83[this.anInt251] = 367;
					this.anIntArray84[this.anInt251] = arg2;
					this.anIntArray81[this.anInt251] = arg1;
					this.anIntArray82[this.anInt251] = arg3;
					this.anInt251++;
				} else if (this.anInt313 != 1) {
					this.aStringArray1[this.anInt251] = "Follow @whi@" + local32;
					this.anIntArray83[this.anInt251] = 1544;
					this.anIntArray84[this.anInt251] = arg2;
					this.anIntArray81[this.anInt251] = arg1;
					this.anIntArray82[this.anInt251] = arg3;
					this.anInt251++;
					if (this.anInt380 == 0) {
						this.aStringArray1[this.anInt251] = "Trade with @whi@" + local32;
						this.anIntArray83[this.anInt251] = 1373;
						this.anIntArray84[this.anInt251] = arg2;
						this.anIntArray81[this.anInt251] = arg1;
						this.anIntArray82[this.anInt251] = arg3;
						this.anInt251++;
					}
					if (this.anInt270 > 0) {
						this.aStringArray1[this.anInt251] = "Attack @whi@" + local32;
						if (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt177 >= arg0.anInt177) {
							this.anIntArray83[this.anInt251] = 151;
						} else {
							this.anIntArray83[this.anInt251] = 2151;
						}
						this.anIntArray84[this.anInt251] = arg2;
						this.anIntArray81[this.anInt251] = arg1;
						this.anIntArray82[this.anInt251] = arg3;
						this.anInt251++;
					}
					if (this.anInt295 == 1) {
						this.aStringArray1[this.anInt251] = "Fight @whi@" + local32;
						this.anIntArray83[this.anInt251] = 151;
						this.anIntArray84[this.anInt251] = arg2;
						this.anIntArray81[this.anInt251] = arg1;
						this.anIntArray82[this.anInt251] = arg3;
						this.anInt251++;
					}
					if (this.anInt295 == 2) {
						this.aStringArray1[this.anInt251] = "Duel-with @whi@" + local32;
						this.anIntArray83[this.anInt251] = 1101;
						this.anIntArray84[this.anInt251] = arg2;
						this.anIntArray81[this.anInt251] = arg1;
						this.anIntArray82[this.anInt251] = arg3;
						this.anInt251++;
					}
				} else if ((this.anInt315 & 0x8) == 8) {
					this.aStringArray1[this.anInt251] = this.aString9 + " @whi@" + local32;
					this.anIntArray83[this.anInt251] = 651;
					this.anIntArray84[this.anInt251] = arg2;
					this.anIntArray81[this.anInt251] = arg1;
					this.anIntArray82[this.anInt251] = arg3;
					this.anInt251++;
				}
				for (@Pc(387) int local387 = 0; local387 < this.anInt251; local387++) {
					if (this.anIntArray83[local387] == 660) {
						this.aStringArray1[local387] = "Walk here @whi@" + local32;
						return;
					}
				}
			}
		} catch (@Pc(414) RuntimeException local414) {
			signlink.reporterror("57649, " + 540 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local414.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!d;)V")
	private void method137(@OriginalArg(1) Class6 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt462;
			if (local4 >= 1 && local4 <= 100 || !(local4 < 701 || local4 > 800)) {
				if (local4 > 700) {
					local4 -= 601;
				} else {
					local4--;
				}
				if (local4 >= this.anInt331) {
					arg0.aString19 = "";
					arg0.anInt461 = 0;
				} else {
					arg0.aString19 = this.aStringArray5[local4];
					arg0.anInt461 = 1;
				}
			} else if (local4 >= 101 && local4 <= 200 || !(local4 < 801 || local4 > 900)) {
				if (local4 > 800) {
					local4 -= 701;
				} else {
					local4 -= 101;
				}
				if (local4 >= this.anInt331) {
					arg0.aString19 = "";
					arg0.anInt461 = 0;
				} else {
					if (this.anIntArray64[local4] == 0) {
						arg0.aString19 = "@red@Offline";
					} else if (this.anIntArray64[local4] == anInt384) {
						arg0.aString19 = "@gre@World-" + (this.anIntArray64[local4] - 9);
					} else {
						arg0.aString19 = "@yel@World-" + (this.anIntArray64[local4] - 9);
					}
					arg0.anInt461 = 1;
				}
			} else if (local4 == 203) {
				arg0.anInt468 = this.anInt331 * 15 + 20;
				if (arg0.anInt468 <= arg0.anInt464) {
					arg0.anInt468 = arg0.anInt464 + 1;
				}
			} else if (local4 >= 401 && local4 <= 500) {
				local4 -= 401;
				if (local4 >= this.anInt333) {
					arg0.aString19 = "";
					arg0.anInt461 = 0;
				} else {
					arg0.aString19 = Class47.method679(Class47.method676(this.aLongArray4[local4]));
					arg0.anInt461 = 1;
				}
			} else if (local4 == 503) {
				arg0.anInt468 = this.anInt333 * 15 + 20;
				if (arg0.anInt468 <= arg0.anInt464) {
					arg0.anInt468 = arg0.anInt464 + 1;
				}
			} else if (local4 == 327) {
				arg0.anInt484 = 150;
				arg0.anInt485 = (int) (Math.sin((double) anInt367 / 40.0D) * 256.0D) & 0x7FF;
				if (this.aBoolean61) {
					for (@Pc(235) int local235 = 0; local235 < 7; local235++) {
						@Pc(242) int local242 = this.anIntArray41[local235];
						if (local242 >= 0 && !Class23.aClass23Array1[local242].method477()) {
							return;
						}
					}
					this.aBoolean61 = false;
					@Pc(261) Class1_Sub1_Sub1_Sub5[] local261 = new Class1_Sub1_Sub1_Sub5[7];
					@Pc(263) int local263 = 0;
					for (@Pc(265) int local265 = 0; local265 < 7; local265++) {
						@Pc(272) int local272 = this.anIntArray41[local265];
						if (local272 >= 0) {
							local261[local263++] = Class23.aClass23Array1[local272].method478();
						}
					}
					@Pc(294) Class1_Sub1_Sub1_Sub5 local294 = new Class1_Sub1_Sub1_Sub5(false, local261, local263);
					for (@Pc(296) int local296 = 0; local296 < 5; local296++) {
						if (this.anIntArray59[local296] != 0) {
							local294.method301(anIntArrayArray3[local296][0], anIntArrayArray3[local296][this.anIntArray59[local296]]);
							if (local296 == 1) {
								local294.method301(anIntArray46[0], anIntArray46[this.anIntArray59[local296]]);
							}
						}
					}
					local294.method294(this.aByte10);
					local294.method295(Class27.aClass27Array1[aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt132].anIntArray226[0]);
					local294.method304(64, 850, -30, -50, -30, true);
					arg0.anInt477 = 5;
					arg0.anInt478 = 0;
					Class6.method234(local294);
				}
			} else if (local4 == 324) {
				if (this.aClass1_Sub1_Sub2_Sub2_12 == null) {
					this.aClass1_Sub1_Sub2_Sub2_12 = arg0.aClass1_Sub1_Sub2_Sub2_14;
					this.aClass1_Sub1_Sub2_Sub2_13 = arg0.aClass1_Sub1_Sub2_Sub2_15;
				}
				if (this.aBoolean62) {
					arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_13;
				} else {
					arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_12;
				}
			} else if (local4 == 325) {
				if (this.aClass1_Sub1_Sub2_Sub2_12 == null) {
					this.aClass1_Sub1_Sub2_Sub2_12 = arg0.aClass1_Sub1_Sub2_Sub2_14;
					this.aClass1_Sub1_Sub2_Sub2_13 = arg0.aClass1_Sub1_Sub2_Sub2_15;
				}
				if (this.aBoolean62) {
					arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_12;
				} else {
					arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_13;
				}
			} else if (local4 == 600) {
				arg0.aString19 = this.aString17;
				if (anInt367 % 20 < 10) {
					arg0.aString19 = arg0.aString19 + "|";
				} else {
					arg0.aString19 = arg0.aString19 + " ";
				}
			} else {
				if (local4 == 613) {
					if (this.anInt399 < 1) {
						arg0.aString19 = "";
					} else if (this.aBoolean44) {
						arg0.anInt473 = 16711680;
						arg0.aString19 = "Moderator option: Mute player for 48 hours: <ON>";
					} else {
						arg0.anInt473 = 16777215;
						arg0.aString19 = "Moderator option: Mute player for 48 hours: <OFF>";
					}
				}
				@Pc(503) String local503;
				if (local4 == 650 || local4 == 655) {
					if (this.anInt244 == 0) {
						arg0.aString19 = "";
					} else {
						if (this.anInt344 == 0) {
							local503 = "earlier today";
						} else if (this.anInt344 == 1) {
							local503 = "yesterday";
						} else {
							local503 = this.anInt344 + " days ago";
						}
						arg0.aString19 = "You last logged in " + local503 + " from: " + signlink.dns;
					}
				}
				if (local4 == 651) {
					if (this.anInt383 == 0) {
						arg0.aString19 = "0 unread messages";
						arg0.anInt473 = 16776960;
					}
					if (this.anInt383 == 1) {
						arg0.aString19 = "1 unread message";
						arg0.anInt473 = 65280;
					}
					if (this.anInt383 > 1) {
						arg0.aString19 = this.anInt383 + " unread messages";
						arg0.anInt473 = 65280;
					}
				}
				if (local4 == 652) {
					if (this.anInt318 == 201) {
						if (this.anInt297 == 1) {
							arg0.aString19 = "@yel@This is a non-members world: @whi@Since you are a member we";
						} else {
							arg0.aString19 = "";
						}
					} else if (this.anInt318 == 200) {
						arg0.aString19 = "You have not yet set any password recovery questions.";
					} else {
						if (this.anInt318 == 0) {
							local503 = "Earlier today";
						} else if (this.anInt318 == 1) {
							local503 = "Yesterday";
						} else {
							local503 = this.anInt318 + " days ago";
						}
						arg0.aString19 = local503 + " you changed your recovery questions";
					}
				}
				if (local4 == 653) {
					if (this.anInt318 == 201) {
						if (this.anInt297 == 1) {
							arg0.aString19 = "@whi@recommend you use a members world instead. You may use";
						} else {
							arg0.aString19 = "";
						}
					} else if (this.anInt318 == 200) {
						arg0.aString19 = "We strongly recommend you do so now to secure your account.";
					} else {
						arg0.aString19 = "If you do not remember making this change then cancel it immediately";
					}
				}
				if (local4 == 654) {
					if (this.anInt318 == 201) {
						if (this.anInt297 == 1) {
							arg0.aString19 = "@whi@this world but member benefits are unavailabe whilst here.";
						} else {
							arg0.aString19 = "";
						}
					} else if (this.anInt318 == 200) {
						arg0.aString19 = "Do this from the 'account management' area on our front webpage";
					} else {
						arg0.aString19 = "Do this from the 'account management' area on our front webpage";
					}
				}
			}
		} catch (@Pc(711) RuntimeException local711) {
			signlink.reporterror("7536, " + -429 + ", " + arg0 + ", " + local711.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method138(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt333 >= 100) {
					this.method106("", 0, "Your ignore list is full. Max of 100 hit");
				} else {
					@Pc(23) String local23 = Class47.method679(Class47.method676(arg0));
					for (@Pc(25) int local25 = 0; local25 < this.anInt333; local25++) {
						if (this.aLongArray4[local25] == arg0) {
							this.method106("", 0, local23 + " is already on your ignore list");
							return;
						}
					}
					for (@Pc(61) int local61 = 0; local61 < this.anInt331; local61++) {
						if (this.aLongArray3[local61] == arg0) {
							this.method106("", 0, "Please remove " + local23 + " from your friend list first");
							return;
						}
					}
					this.aLongArray4[this.anInt333++] = arg0;
					this.aBoolean78 = true;
					this.aClass1_Sub1_Sub3_2.method485(20);
					this.aClass1_Sub1_Sub3_2.method492(169, arg0);
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("77326, " + arg0 + ", " + 3652 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method139() {
		try {
			if (this.anInt325 == 0) {
				this.aStringArray1[0] = "Cancel";
				this.anIntArray83[0] = 1252;
				this.anInt251 = 1;
				this.method217(this.aByte15);
				this.anInt437 = 0;
				if (super.anInt232 > 4 && super.anInt233 > 4 && super.anInt232 < 516 && super.anInt233 < 338) {
					if (this.anInt254 == -1) {
						this.method203();
					} else {
						this.method165(4, super.anInt233, 0, Class6.aClass6Array1[this.anInt254], super.anInt232, 4);
					}
				}
				if (this.anInt437 != this.anInt277) {
					this.anInt277 = this.anInt437;
				}
				this.anInt437 = 0;
				if (super.anInt232 > 553 && super.anInt233 > 205 && super.anInt232 < 743 && super.anInt233 < 466) {
					if (this.anInt268 != -1) {
						this.method165(553, super.anInt233, 0, Class6.aClass6Array1[this.anInt268], super.anInt232, 205);
					} else if (this.anIntArray94[this.anInt370] != -1) {
						this.method165(553, super.anInt233, 0, Class6.aClass6Array1[this.anIntArray94[this.anInt370]], super.anInt232, 205);
					}
				}
				if (this.anInt437 != this.anInt369) {
					this.aBoolean78 = true;
					this.anInt369 = this.anInt437;
				}
				this.anInt437 = 0;
				if (super.anInt232 > 17 && super.anInt233 > 357 && super.anInt232 < 496 && super.anInt233 < 453) {
					if (this.anInt328 != -1) {
						this.method165(17, super.anInt233, 0, Class6.aClass6Array1[this.anInt328], super.anInt232, 357);
					} else if (super.anInt233 < 434 && super.anInt232 < 426) {
						this.method202(super.anInt232 - 17, super.anInt233 - 357);
					}
				}
				if (this.anInt328 != -1 && this.anInt437 != this.anInt252) {
					this.aBoolean68 = true;
					this.anInt252 = this.anInt437;
				}
				@Pc(224) boolean local224 = false;
				while (!local224) {
					local224 = true;
					for (@Pc(237) int local237 = 0; local237 < this.anInt251 - 1; local237++) {
						if (this.anIntArray83[local237] < 1000 && this.anIntArray83[local237 + 1] > 1000) {
							@Pc(258) String local258 = this.aStringArray1[local237];
							this.aStringArray1[local237] = this.aStringArray1[local237 + 1];
							this.aStringArray1[local237 + 1] = local258;
							@Pc(280) int local280 = this.anIntArray83[local237];
							this.anIntArray83[local237] = this.anIntArray83[local237 + 1];
							this.anIntArray83[local237 + 1] = local280;
							@Pc(302) int local302 = this.anIntArray81[local237];
							this.anIntArray81[local237] = this.anIntArray81[local237 + 1];
							this.anIntArray81[local237 + 1] = local302;
							@Pc(324) int local324 = this.anIntArray82[local237];
							this.anIntArray82[local237] = this.anIntArray82[local237 + 1];
							this.anIntArray82[local237 + 1] = local324;
							@Pc(346) int local346 = this.anIntArray84[local237];
							this.anIntArray84[local237] = this.anIntArray84[local237 + 1];
							this.anIntArray84[local237 + 1] = local346;
							local224 = false;
						}
					}
				}
			}
		} catch (@Pc(376) RuntimeException local376) {
			signlink.reporterror("83312, " + -540 + ", " + local376.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method140() {
		try {
			Class9.aClass40_4.method639();
			Class9.aClass40_5.method639();
			Class13.aClass40_6.method639();
			Class15.aClass40_7.method639();
			Class15.aClass40_8.method639();
			Class1_Sub1_Sub1_Sub1_Sub2.aClass40_1.method639();
			Class29.aClass40_9.method639();
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("57438, " + -10 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JZ)V")
	private void method142(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt331; local8++) {
					if (this.aLongArray3[local8] == arg0) {
						this.anInt331--;
						this.aBoolean78 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt331; local28++) {
							this.aStringArray5[local28] = this.aStringArray5[local28 + 1];
							this.anIntArray64[local28] = this.anIntArray64[local28 + 1];
							this.aLongArray3[local28] = this.aLongArray3[local28 + 1];
						}
						this.aClass1_Sub1_Sub3_2.method485(61);
						this.aClass1_Sub1_Sub3_2.method492(169, arg0);
						break;
					}
				}
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("60013, " + arg0 + ", " + false + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!mb;)V")
	private void method143(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			this.anInt414 = 0;
			this.anInt405 = 0;
			this.method134(arg1, arg0);
			this.method191(arg0, arg1);
			this.method173(arg1, arg0);
			@Pc(35) int local35;
			for (@Pc(28) int local28 = 0; local28 < this.anInt414; local28++) {
				local35 = this.anIntArray89[local28];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local35].anInt168 != anInt367) {
					this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local35].aClass13_1 = null;
					this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local35] = null;
				}
			}
			if (arg1.anInt778 != arg0) {
				signlink.reporterror(this.aString5 + " size mismatch in getnpcpos - pos:" + arg1.anInt778 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local35 = 0; local35 < this.anInt382; local35++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray74[local35]] == null) {
					signlink.reporterror(this.aString5 + " null entry in npc list - pos:" + local35 + " size:" + this.anInt382);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("84672, " + arg0 + ", " + 5 + ", " + arg1 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;IZII)V")
	private void method144(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0.anInt460 == 0 && arg0.anIntArray99 != null && (!arg0.aBoolean82 || this.anInt277 == arg0.anInt458 || this.anInt369 == arg0.anInt458 || this.anInt252 == arg0.anInt458)) {
				@Pc(29) int local29 = Class1_Sub1_Sub2.anInt747;
				@Pc(31) int local31 = Class1_Sub1_Sub2.anInt745;
				@Pc(33) int local33 = Class1_Sub1_Sub2.anInt748;
				@Pc(35) int local35 = Class1_Sub1_Sub2.anInt746;
				Class1_Sub1_Sub2.method453(arg3, arg1 + arg0.anInt463, arg3 + arg0.anInt464, arg1);
				@Pc(51) int local51 = arg0.anIntArray99.length;
				for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
					@Pc(62) int local62 = arg0.anIntArray100[local53] + arg1;
					@Pc(71) int local71 = arg0.anIntArray101[local53] + arg3 - arg2;
					@Pc(78) Class6 local78 = Class6.aClass6Array1[arg0.anIntArray99[local53]];
					@Pc(83) int local83 = local62 + local78.anInt465;
					@Pc(88) int local88 = local71 + local78.anInt466;
					if (local78.anInt462 > 0) {
						this.method137(local78);
					}
					if (local78.anInt460 == 0) {
						if (local78.anInt469 > local78.anInt468 - local78.anInt464) {
							local78.anInt469 = local78.anInt468 - local78.anInt464;
						}
						if (local78.anInt469 < 0) {
							local78.anInt469 = 0;
						}
						this.method144(local78, local83, local78.anInt469, local88);
						if (local78.anInt468 > local78.anInt464) {
							this.method209(local88, local83 + local78.anInt463, local78.anInt469, local78.anInt468, local78.anInt464);
						}
					} else if (local78.anInt460 != 1) {
						@Pc(160) int local160;
						@Pc(164) int local164;
						@Pc(175) int local175;
						@Pc(210) int local210;
						@Pc(217) int local217;
						@Pc(158) int local158;
						@Pc(208) int local208;
						if (local78.anInt460 == 2) {
							local158 = 0;
							for (local160 = 0; local160 < local78.anInt464; local160++) {
								for (local164 = 0; local164 < local78.anInt463; local164++) {
									local175 = local83 + local164 * (local78.anInt471 + 32);
									@Pc(184) int local184 = local88 + local160 * (local78.anInt472 + 32);
									if (local158 < 20) {
										local175 += local78.anIntArray102[local158];
										local184 += local78.anIntArray103[local158];
									}
									if (local78.anIntArray95[local158] > 0) {
										local208 = 0;
										local210 = 0;
										local217 = local78.anIntArray95[local158] - 1;
										if (local175 > Class1_Sub1_Sub2.anInt747 - 32 && local175 < Class1_Sub1_Sub2.anInt748 && local184 > Class1_Sub1_Sub2.anInt745 - 32 && local184 < Class1_Sub1_Sub2.anInt746 || this.anInt325 != 0 && this.anInt324 == local158) {
											@Pc(242) int local242 = 0;
											if (this.anInt361 == 1 && this.anInt362 == local158 && this.anInt363 == local78.anInt458) {
												local242 = 16777215;
											}
											@Pc(266) Class1_Sub1_Sub2_Sub2 local266 = Class15.method349(local242, local78.anIntArray96[local158], local217);
											if (local266 != null) {
												@Pc(345) int local345;
												if (this.anInt325 != 0 && this.anInt324 == local158 && this.anInt323 == local78.anInt458) {
													local208 = super.anInt232 - this.anInt326;
													local210 = super.anInt233 - this.anInt327;
													if (local208 < 5 && local208 > -5) {
														local208 = 0;
													}
													if (local210 < 5 && local210 > -5) {
														local210 = 0;
													}
													if (this.anInt359 < 5) {
														local208 = 0;
														local210 = 0;
													}
													local266.method406(local184 + local210, local175 + local208);
													if (local184 + local210 < Class1_Sub1_Sub2.anInt745 && arg0.anInt469 > 0) {
														local345 = this.anInt296 * (Class1_Sub1_Sub2.anInt745 - local184 - local210) / 3;
														if (local345 > this.anInt296 * 10) {
															local345 = this.anInt296 * 10;
														}
														if (local345 > arg0.anInt469) {
															local345 = arg0.anInt469;
														}
														arg0.anInt469 -= local345;
														this.anInt327 += local345;
													}
													if (local184 + local210 + 32 > Class1_Sub1_Sub2.anInt746 && arg0.anInt469 < arg0.anInt468 - arg0.anInt464) {
														local345 = this.anInt296 * (local184 + local210 + 32 - Class1_Sub1_Sub2.anInt746) / 3;
														if (local345 > this.anInt296 * 10) {
															local345 = this.anInt296 * 10;
														}
														if (local345 > arg0.anInt468 - arg0.anInt464 - arg0.anInt469) {
															local345 = arg0.anInt468 - arg0.anInt464 - arg0.anInt469;
														}
														arg0.anInt469 += local345;
														this.anInt327 -= local345;
													}
												} else if (this.anInt452 != 0 && this.anInt451 == local158 && this.anInt450 == local78.anInt458) {
													local266.method406(local184, local175);
												} else {
													local266.method404(local175, local184);
												}
												if (local266.anInt691 == 33 || local78.anIntArray96[local158] != 1) {
													local345 = local78.anIntArray96[local158];
													this.aClass1_Sub1_Sub2_Sub4_1.method466(method168(local345), 0, local175 + local208 + 1, local184 + 10 + local210);
													this.aClass1_Sub1_Sub2_Sub4_1.method466(method168(local345), 16776960, local175 + local208, local184 + 9 + local210);
												}
											}
										}
									} else if (local78.aClass1_Sub1_Sub2_Sub2Array8 != null && local158 < 20) {
										@Pc(534) Class1_Sub1_Sub2_Sub2 local534 = local78.aClass1_Sub1_Sub2_Sub2Array8[local158];
										if (local534 != null) {
											local534.method404(local175, local184);
										}
									}
									local158++;
								}
							}
						} else if (local78.anInt460 == 3) {
							@Pc(560) boolean local560 = false;
							if (this.anInt252 == local78.anInt458 || this.anInt369 == local78.anInt458 || this.anInt277 == local78.anInt458) {
								local560 = true;
							}
							if (this.method218(local78)) {
								local158 = local78.anInt474;
								if (local560 && local78.anInt476 != 0) {
									local158 = local78.anInt476;
								}
							} else {
								local158 = local78.anInt473;
								if (local560 && local78.anInt475 != 0) {
									local158 = local78.anInt475;
								}
							}
							if (local78.aByte17 == 0) {
								if (local78.aBoolean88) {
									Class1_Sub1_Sub2.method456(local88, local78.anInt464, local83, local78.anInt463, local158);
								} else {
									Class1_Sub1_Sub2.method457(local83, local78.anInt464, local88, local78.anInt463, local158);
								}
							} else if (local78.aBoolean88) {
								Class1_Sub1_Sub2.method455(local83, local78.anInt464, local88, local158, 256 - (local78.aByte17 & 0xFF), local78.anInt463);
							} else {
								Class1_Sub1_Sub2.method458(local78.anInt463, local83, local88, 256 - (local78.aByte17 & 0xFF), local158, local78.anInt464);
							}
						} else {
							@Pc(678) Class1_Sub1_Sub2_Sub4 local678;
							if (local78.anInt460 == 4) {
								local678 = local78.aClass1_Sub1_Sub2_Sub4_5;
								@Pc(681) String local681 = local78.aString19;
								@Pc(683) boolean local683 = false;
								if (this.anInt252 == local78.anInt458 || this.anInt369 == local78.anInt458 || this.anInt277 == local78.anInt458) {
									local683 = true;
								}
								if (this.method218(local78)) {
									local160 = local78.anInt474;
									if (local683 && local78.anInt476 != 0) {
										local160 = local78.anInt476;
									}
									if (local78.aString20.length() > 0) {
										local681 = local78.aString20;
									}
								} else {
									local160 = local78.anInt473;
									if (local683 && local78.anInt475 != 0) {
										local160 = local78.anInt475;
									}
								}
								if (local78.anInt461 == 6 && this.aBoolean58) {
									local681 = "Please wait...";
									local160 = local78.anInt473;
								}
								if (Class1_Sub1_Sub2.anInt743 == 479) {
									if (local160 == 16776960) {
										local160 = 255;
									}
									if (local160 == 49152) {
										local160 = 16777215;
									}
								}
								local208 = local88 + local678.anInt755;
								while (local681.length() > 0) {
									if (local681.indexOf("%") != -1) {
										label348: while (true) {
											local210 = local681.indexOf("%1");
											if (local210 == -1) {
												while (true) {
													local210 = local681.indexOf("%2");
													if (local210 == -1) {
														while (true) {
															local210 = local681.indexOf("%3");
															if (local210 == -1) {
																while (true) {
																	local210 = local681.indexOf("%4");
																	if (local210 == -1) {
																		while (true) {
																			local210 = local681.indexOf("%5");
																			if (local210 == -1) {
																				break label348;
																			}
																			local681 = local681.substring(0, local210) + this.method187(this.method223(this.anInt305, local78, 4)) + local681.substring(local210 + 2);
																		}
																	}
																	local681 = local681.substring(0, local210) + this.method187(this.method223(this.anInt305, local78, 3)) + local681.substring(local210 + 2);
																}
															}
															local681 = local681.substring(0, local210) + this.method187(this.method223(this.anInt305, local78, 2)) + local681.substring(local210 + 2);
														}
													}
													local681 = local681.substring(0, local210) + this.method187(this.method223(this.anInt305, local78, 1)) + local681.substring(local210 + 2);
												}
											}
											local681 = local681.substring(0, local210) + this.method187(this.method223(this.anInt305, local78, 0)) + local681.substring(local210 + 2);
										}
									}
									local210 = local681.indexOf("\\n");
									@Pc(960) String local960;
									if (local210 == -1) {
										local960 = local681;
										local681 = "";
									} else {
										local960 = local681.substring(0, local210);
										local681 = local681.substring(local210 + 2);
									}
									if (local78.aBoolean89) {
										local678.method464(local78.aBoolean90, local208, local160, local83 + local78.anInt463 / 2, local960);
									} else {
										local678.method468(local160, local83, local208, local78.aBoolean90, local960);
									}
									local208 += local678.anInt755;
								}
							} else if (local78.anInt460 == 5) {
								@Pc(1022) Class1_Sub1_Sub2_Sub2 local1022;
								if (this.method218(local78)) {
									local1022 = local78.aClass1_Sub1_Sub2_Sub2_15;
								} else {
									local1022 = local78.aClass1_Sub1_Sub2_Sub2_14;
								}
								if (local1022 != null) {
									local1022.method404(local83, local88);
								}
							} else if (local78.anInt460 == 6) {
								local158 = Class1_Sub1_Sub2_Sub1.anInt664;
								local160 = Class1_Sub1_Sub2_Sub1.anInt665;
								Class1_Sub1_Sub2_Sub1.anInt664 = local83 + local78.anInt463 / 2;
								Class1_Sub1_Sub2_Sub1.anInt665 = local88 + local78.anInt464 / 2;
								local164 = Class1_Sub1_Sub2_Sub1.anIntArray182[local78.anInt484] * local78.anInt483 >> 16;
								local175 = Class1_Sub1_Sub2_Sub1.anIntArray183[local78.anInt484] * local78.anInt483 >> 16;
								@Pc(1083) boolean local1083 = this.method218(local78);
								if (local1083) {
									local208 = local78.anInt482;
								} else {
									local208 = local78.anInt481;
								}
								@Pc(1104) Class1_Sub1_Sub1_Sub5 local1104;
								if (local208 == -1) {
									local1104 = local78.method232(-1, this.aByte6, local1083, -1);
								} else {
									@Pc(1110) Class27 local1110 = Class27.aClass27Array1[local208];
									local1104 = local78.method232(local1110.anIntArray226[local78.anInt456], this.aByte6, local1083, local1110.anIntArray227[local78.anInt456]);
								}
								if (local1104 != null) {
									local1104.method307(local78.anInt485, 0, local78.anInt484, 0, local164, local175);
								}
								Class1_Sub1_Sub2_Sub1.anInt664 = local158;
								Class1_Sub1_Sub2_Sub1.anInt665 = local160;
							} else if (local78.anInt460 == 7) {
								local678 = local78.aClass1_Sub1_Sub2_Sub4_5;
								local160 = 0;
								for (local164 = 0; local164 < local78.anInt464; local164++) {
									for (local175 = 0; local175 < local78.anInt463; local175++) {
										if (local78.anIntArray95[local160] > 0) {
											@Pc(1175) Class15 local1175 = Class15.method343(local78.anIntArray95[local160] - 1);
											@Pc(1178) String local1178 = local1175.aString26;
											if (local1175.aBoolean140 || local78.anIntArray96[local160] != 1) {
												local1178 = local1178 + " x" + method153(local78.anIntArray96[local160]);
											}
											local210 = local83 + local175 * (local78.anInt471 + 115);
											local217 = local88 + local164 * (local78.anInt472 + 12);
											if (local78.aBoolean89) {
												local678.method464(local78.aBoolean90, local217, local78.anInt473, local210 + local78.anInt463 / 2, local1178);
											} else {
												local678.method468(local78.anInt473, local210, local217, local78.aBoolean90, local1178);
											}
										}
										local160++;
									}
								}
							}
						}
					}
				}
				Class1_Sub1_Sub2.method453(local31, local33, local35, local29);
				this.aBoolean55 &= true;
			}
		} catch (@Pc(1280) RuntimeException local1280) {
			signlink.reporterror("33946, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + local1280.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method145() {
		try {
			while (true) {
				@Pc(12) Class1_Sub1_Sub4 local12 = this.aClass43_Sub1_1.method655();
				if (local12 == null) {
					return;
				}
				if (local12.anInt806 == 0) {
					Class1_Sub1_Sub1_Sub5.method285(local12.anInt807, local12.aByteArray10);
					if ((this.aClass43_Sub1_1.method651(local12.anInt807) & 0x62) != 0) {
						this.aBoolean78 = true;
						if (this.anInt328 != -1) {
							this.aBoolean68 = true;
						}
					}
				}
				if (local12.anInt806 == 1 && local12.aByteArray10 != null) {
					Class14.method324(local12.aByteArray10);
				}
				if (local12.anInt806 == 2 && local12.anInt807 == this.anInt319 && local12.aByteArray10 != null) {
					this.method213(this.aBoolean54, local12.aByteArray10);
				}
				if (local12.anInt806 == 3 && this.anInt396 == 1) {
					for (@Pc(83) int local83 = 0; local83 < this.aByteArrayArray1.length; local83++) {
						if (this.anIntArray86[local83] == local12.anInt807) {
							this.aByteArrayArray1[local83] = local12.aByteArray10;
							if (local12.aByteArray10 == null) {
								this.anIntArray86[local83] = -1;
							}
							break;
						}
						if (this.anIntArray87[local83] == local12.anInt807) {
							this.aByteArrayArray2[local83] = local12.aByteArray10;
							if (local12.aByteArray10 == null) {
								this.anIntArray87[local83] = -1;
							}
							break;
						}
					}
				}
				if (local12.anInt806 == 93 && this.aClass43_Sub1_1.method650(local12.anInt807)) {
					Class4.method60(this.anInt417, new Class1_Sub1_Sub3(local12.aByteArray10, false), this.aClass43_Sub1_1);
				}
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("70510, " + 18352 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method146() {
		try {
			if (aBoolean67 && this.anInt396 == 2 && Class4.anInt200 != this.anInt419) {
				this.aClass37_14.method574(this.aByte9);
				this.aClass1_Sub1_Sub2_Sub4_2.method463(0, 257, 151, "Loading - please wait.");
				this.aClass1_Sub1_Sub2_Sub4_2.method463(16777215, 256, 150, "Loading - please wait.");
				this.aClass37_14.method575(4, super.aGraphics2, 4);
				this.anInt396 = 1;
				this.aLong14 = System.currentTimeMillis();
			}
			if (this.anInt396 == 1) {
				@Pc(60) int local60 = this.method147();
				if (local60 != 0 && System.currentTimeMillis() - this.aLong14 > 360000L) {
					signlink.reporterror(this.aString5 + " glcfb " + this.aLong18 + "," + local60 + "," + aBoolean67 + "," + this.aClass44Array1[0] + "," + this.aClass43_Sub1_1.method654() + "," + this.anInt419 + "," + this.anInt260 + "," + this.anInt261);
					this.aLong14 = System.currentTimeMillis();
				}
			}
			if (this.anInt396 == 2 && this.anInt419 != this.anInt272) {
				this.anInt272 = this.anInt419;
				this.method193(this.anInt419);
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("86019, " + -612 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)I")
	private int method147() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray1.length; local3++) {
				if (this.aByteArrayArray1[local3] == null && this.anIntArray86[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray2[local3] == null && this.anIntArray87[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(50) int local50 = 0; local50 < this.aByteArrayArray1.length; local50++) {
				@Pc(57) byte[] local57 = this.aByteArrayArray2[local50];
				if (local57 != null) {
					@Pc(71) int local71 = (this.anIntArray85[local50] >> 8) * 64 - this.anInt281;
					@Pc(83) int local83 = (this.anIntArray85[local50] & 0xFF) * 64 - this.anInt282;
					local39 &= Class4.method59(local57, local83, local71);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean42) {
				return -4;
			} else {
				this.anInt396 = 2;
				Class4.anInt200 = this.anInt419;
				this.method206();
				return 0;
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("57605, " + -40528 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method148() {
		try {
			if (this.aClass37_16 == null) {
				super.aClass37_2 = null;
				this.aClass37_15 = null;
				this.aClass37_13 = null;
				this.aClass37_12 = null;
				this.aClass37_14 = null;
				this.aClass37_25 = null;
				this.aClass37_26 = null;
				this.aClass37_27 = null;
				this.aClass37_19 = new Class37(265, this.method95(), 0, 128);
				Class1_Sub1_Sub2.method454();
				this.aClass37_20 = new Class37(265, this.method95(), 0, 128);
				this.anInt406 += 0;
				Class1_Sub1_Sub2.method454();
				this.aClass37_16 = new Class37(171, this.method95(), 0, 509);
				Class1_Sub1_Sub2.method454();
				this.aClass37_17 = new Class37(132, this.method95(), 0, 360);
				Class1_Sub1_Sub2.method454();
				this.aClass37_18 = new Class37(200, this.method95(), 0, 360);
				Class1_Sub1_Sub2.method454();
				this.aClass37_21 = new Class37(238, this.method95(), 0, 202);
				Class1_Sub1_Sub2.method454();
				this.aClass37_22 = new Class37(238, this.method95(), 0, 203);
				Class1_Sub1_Sub2.method454();
				this.aClass37_23 = new Class37(94, this.method95(), 0, 74);
				Class1_Sub1_Sub2.method454();
				this.aClass37_24 = new Class37(94, this.method95(), 0, 75);
				Class1_Sub1_Sub2.method454();
				if (this.aClass46_1 != null) {
					this.method179();
					this.method122();
				}
				this.aBoolean69 = true;
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("15636, " + 0 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!gc;I)V")
	private void method149(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13 arg2, @OriginalArg(4) int arg3) {
		try {
			if (this.anInt251 < 400) {
				@Pc(20) String local20 = arg2.aString25;
				if (arg2.anInt591 != 0) {
					local20 = local20 + method107(aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt177, arg2.anInt591) + " (level-" + arg2.anInt591 + ")";
				}
				if (this.anInt361 == 1) {
					this.aStringArray1[this.anInt251] = "Use " + this.aString13 + " with @yel@" + local20;
					this.anIntArray83[this.anInt251] = 900;
					this.anIntArray84[this.anInt251] = arg1;
					this.anIntArray81[this.anInt251] = arg0;
					this.anIntArray82[this.anInt251] = arg3;
					this.anInt251++;
				} else if (this.anInt313 != 1) {
					@Pc(158) int local158;
					if (arg2.aStringArray8 != null) {
						for (local158 = 4; local158 >= 0; local158--) {
							if (arg2.aStringArray8[local158] != null && !arg2.aStringArray8[local158].equalsIgnoreCase("attack")) {
								this.aStringArray1[this.anInt251] = arg2.aStringArray8[local158] + " @yel@" + local20;
								if (local158 == 0) {
									this.anIntArray83[this.anInt251] = 728;
								}
								if (local158 == 1) {
									this.anIntArray83[this.anInt251] = 542;
								}
								if (local158 == 2) {
									this.anIntArray83[this.anInt251] = 6;
								}
								if (local158 == 3) {
									this.anIntArray83[this.anInt251] = 963;
								}
								if (local158 == 4) {
									this.anIntArray83[this.anInt251] = 245;
								}
								this.anIntArray84[this.anInt251] = arg1;
								this.anIntArray81[this.anInt251] = arg0;
								this.anIntArray82[this.anInt251] = arg3;
								this.anInt251++;
							}
						}
					}
					if (arg2.aStringArray8 != null) {
						for (local158 = 4; local158 >= 0; local158--) {
							if (arg2.aStringArray8[local158] != null && arg2.aStringArray8[local158].equalsIgnoreCase("attack")) {
								@Pc(282) short local282 = 0;
								if (arg2.anInt591 > aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt177) {
									local282 = 2000;
								}
								this.aStringArray1[this.anInt251] = arg2.aStringArray8[local158] + " @yel@" + local20;
								if (local158 == 0) {
									this.anIntArray83[this.anInt251] = local282 + 728;
								}
								if (local158 == 1) {
									this.anIntArray83[this.anInt251] = local282 + 542;
								}
								if (local158 == 2) {
									this.anIntArray83[this.anInt251] = local282 + 6;
								}
								if (local158 == 3) {
									this.anIntArray83[this.anInt251] = local282 + 963;
								}
								if (local158 == 4) {
									this.anIntArray83[this.anInt251] = local282 + 245;
								}
								this.anIntArray84[this.anInt251] = arg1;
								this.anIntArray81[this.anInt251] = arg0;
								this.anIntArray82[this.anInt251] = arg3;
								this.anInt251++;
							}
						}
					}
					this.aStringArray1[this.anInt251] = "Examine @yel@" + local20;
					this.anIntArray83[this.anInt251] = 1607;
					this.anIntArray84[this.anInt251] = arg1;
					this.anIntArray81[this.anInt251] = arg0;
					this.anIntArray82[this.anInt251] = arg3;
					this.anInt251++;
				} else if ((this.anInt315 & 0x2) == 2) {
					this.aStringArray1[this.anInt251] = this.aString9 + " @yel@" + local20;
					this.anIntArray83[this.anInt251] = 265;
					this.anIntArray84[this.anInt251] = arg1;
					this.anIntArray81[this.anInt251] = arg0;
					this.anIntArray82[this.anInt251] = arg3;
					this.anInt251++;
					return;
				}
			}
		} catch (@Pc(432) RuntimeException local432) {
			signlink.reporterror("61034, " + arg0 + ", " + -9932 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local432.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method150(@OriginalArg(0) byte arg0) {
		try {
			this.method148();
			this.aClass37_18.method574(this.aByte9);
			this.aClass1_Sub1_Sub2_Sub3_19.method443(0, 200, 0);
			@Pc(20) boolean local20 = false;
			@Pc(61) byte local61;
			@Pc(73) int local73;
			if (this.anInt397 == 0) {
				this.aClass1_Sub1_Sub2_Sub4_1.method464(true, 180, 7711145, 180, this.aClass43_Sub1_1.aString30);
				local61 = 80;
				this.aClass1_Sub1_Sub2_Sub4_3.method464(true, 80, 16776960, 180, "Welcome to RuneScape");
				local73 = local61 + 30;
				this.aClass1_Sub1_Sub2_Sub3_20.method443(27, 200, 100);
				this.aClass1_Sub1_Sub2_Sub4_3.method464(true, 125, 16777215, 100, "New user");
				this.aClass1_Sub1_Sub2_Sub3_20.method443(187, 200, 100);
				this.aClass1_Sub1_Sub2_Sub4_3.method464(true, 125, 16777215, 260, "Existing User");
			}
			if (this.anInt397 == 2) {
				local61 = 60;
				if (this.aString15.length() > 0) {
					this.aClass1_Sub1_Sub2_Sub4_3.method464(true, 45, 16776960, 180, this.aString15);
					this.aClass1_Sub1_Sub2_Sub4_3.method464(true, 60, 16776960, 180, this.aString16);
					local73 = local61 + 30;
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method464(true, 53, 16776960, 180, this.aString16);
					local73 = local61 + 30;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method468(16777215, 90, 90, true, "Username: " + this.aString5 + (this.anInt259 == 0 & anInt367 % 40 < 20 ? "@yel@|" : ""));
				local73 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method468(16777215, 92, 105, true, "Password: " + Class47.method681(this.aString6) + (this.anInt259 == 1 & anInt367 % 40 < 20 ? "@yel@|" : ""));
				local73 += 15;
				this.aClass1_Sub1_Sub2_Sub3_20.method443(27, 200, 130);
				this.aClass1_Sub1_Sub2_Sub4_3.method464(true, 155, 16777215, 100, "Login");
				this.aClass1_Sub1_Sub2_Sub3_20.method443(187, 200, 130);
				this.aClass1_Sub1_Sub2_Sub4_3.method464(true, 155, 16777215, 260, "Cancel");
			}
			if (this.anInt397 == 3) {
				this.aClass1_Sub1_Sub2_Sub4_3.method464(true, 40, 16776960, 180, "Create a free account");
				local61 = 65;
				this.aClass1_Sub1_Sub2_Sub4_3.method464(true, 65, 16777215, 180, "To create a new account you need to");
				local73 = local61 + 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method464(true, 80, 16777215, 180, "go back to the main RuneScape webpage");
				local73 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method464(true, 95, 16777215, 180, "and choose the red 'create account'");
				local73 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method464(true, 110, 16777215, 180, "button at the top right of that page.");
				local73 += 15;
				this.aClass1_Sub1_Sub2_Sub3_20.method443(107, 200, 130);
				this.aClass1_Sub1_Sub2_Sub4_3.method464(true, 155, 16777215, 180, "Cancel");
			}
			this.aClass37_18.method575(202, super.aGraphics2, 171);
			if (this.aBoolean69) {
				this.aBoolean69 = false;
				this.aClass37_16.method575(128, super.aGraphics2, 0);
				this.aClass37_17.method575(202, super.aGraphics2, 371);
				this.aClass37_21.method575(0, super.aGraphics2, 265);
				this.aClass37_22.method575(562, super.aGraphics2, 265);
				this.aClass37_23.method575(128, super.aGraphics2, 171);
				this.aClass37_24.method575(562, super.aGraphics2, 171);
			}
		} catch (@Pc(504) RuntimeException local504) {
			signlink.reporterror("73391, " + arg0 + ", " + local504.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!mb;I)V")
	private void method151(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(7) int local7 = arg0.method507(8, this.anInt377);
			@Pc(13) int local13;
			if (local7 < this.anInt404) {
				for (local13 = local7; local13 < this.anInt404; local13++) {
					this.anIntArray89[this.anInt414++] = this.anIntArray78[local13];
				}
			}
			if (local7 > this.anInt404) {
				signlink.reporterror(this.aString5 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt404 = 0;
			for (local13 = 0; local13 < local7; local13++) {
				@Pc(65) int local65 = this.anIntArray78[local13];
				@Pc(70) Class1_Sub1_Sub1_Sub1_Sub2 local70 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local65];
				@Pc(76) int local76 = arg0.method507(1, this.anInt377);
				if (local76 == 0) {
					this.anIntArray78[this.anInt404++] = local65;
					local70.anInt168 = anInt367;
				} else {
					@Pc(100) int local100 = arg0.method507(2, this.anInt377);
					if (local100 == 0) {
						this.anIntArray78[this.anInt404++] = local65;
						local70.anInt168 = anInt367;
						this.anIntArray79[this.anInt405++] = local65;
					} else {
						@Pc(152) int local152;
						@Pc(163) int local163;
						if (local100 == 1) {
							this.anIntArray78[this.anInt404++] = local65;
							local70.anInt168 = anInt367;
							local152 = arg0.method507(3, this.anInt377);
							local70.method47(false, local152);
							local163 = arg0.method507(1, this.anInt377);
							if (local163 == 1) {
								this.anIntArray79[this.anInt405++] = local65;
							}
						} else if (local100 == 2) {
							this.anIntArray78[this.anInt404++] = local65;
							local70.anInt168 = anInt367;
							local152 = arg0.method507(3, this.anInt377);
							local70.method47(true, local152);
							local163 = arg0.method507(3, this.anInt377);
							local70.method47(true, local163);
							@Pc(224) int local224 = arg0.method507(1, this.anInt377);
							if (local224 == 1) {
								this.anIntArray79[this.anInt405++] = local65;
							}
						} else if (local100 == 3) {
							this.anIntArray89[this.anInt414++] = local65;
						}
					}
				}
			}
		} catch (@Pc(266) RuntimeException local266) {
			signlink.reporterror("80677, " + false + ", " + arg0 + ", " + arg1 + ", " + local266.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method152(@OriginalArg(0) int arg0) {
		try {
			this.anInt374 = 0;
			@Pc(54) int local54;
			@Pc(74) int local74;
			for (@Pc(6) int local6 = -1; local6 < this.anInt404 + this.anInt382; local6++) {
				@Pc(13) Class1_Sub1_Sub1_Sub1 local13;
				if (local6 == -1) {
					local13 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
				} else if (local6 < this.anInt404) {
					local13 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray78[local6]];
				} else {
					local13 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray74[local6 - this.anInt404]];
				}
				if (local13 != null && local13.method49(this.aByte13)) {
					if (local6 >= this.anInt404) {
						@Pc(147) Class13 local147 = ((Class1_Sub1_Sub1_Sub1_Sub1) local13).aClass13_1;
						if (local147.anInt596 >= 0 && local147.anInt596 < this.aClass1_Sub1_Sub2_Sub2Array4.length) {
							this.method130(local13, local13.anInt169 + 15);
							if (this.anInt320 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array4[local147.anInt596].method404(this.anInt320 - 12, this.anInt321 - 30);
							}
						}
						if (this.anInt441 == 1 && this.anInt279 == this.anIntArray74[local6 - this.anInt404] && anInt367 % 20 < 10) {
							this.method130(local13, local13.anInt169 + 15);
							if (this.anInt320 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array4[2].method404(this.anInt320 - 12, this.anInt321 - 28);
							}
						}
					} else {
						local54 = 30;
						@Pc(57) Class1_Sub1_Sub1_Sub1_Sub2 local57 = (Class1_Sub1_Sub1_Sub1_Sub2) local13;
						if (local57.anInt176 != 0) {
							this.method130(local13, local13.anInt169 + 15);
							if (this.anInt320 > -1) {
								for (local74 = 0; local74 < 8; local74++) {
									if ((local57.anInt176 & 0x1 << local74) != 0) {
										this.aClass1_Sub1_Sub2_Sub2Array4[local74].method404(this.anInt320 - 12, this.anInt321 - local54);
										local54 -= 25;
									}
								}
							}
						}
						if (local6 >= 0 && this.anInt441 == 10 && this.anInt427 == this.anIntArray78[local6]) {
							this.method130(local13, local13.anInt169 + 15);
							if (this.anInt320 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array4[7].method404(this.anInt320 - 12, this.anInt321 - local54);
							}
						}
					}
					if (local13.aString3 != null && (local6 >= this.anInt404 || this.anInt358 == 0 || this.anInt358 == 3 || this.anInt358 == 1 && this.method104(((Class1_Sub1_Sub1_Sub1_Sub2) local13).aString4))) {
						this.method130(local13, local13.anInt169);
						if (this.anInt320 > -1 && this.anInt374 < this.anInt375) {
							this.anIntArray68[this.anInt374] = this.aClass1_Sub1_Sub2_Sub4_3.method465(local13.aString3) / 2;
							this.anIntArray67[this.anInt374] = this.aClass1_Sub1_Sub2_Sub4_3.anInt755;
							this.anIntArray65[this.anInt374] = this.anInt320;
							this.anIntArray66[this.anInt374] = this.anInt321;
							this.anIntArray69[this.anInt374] = local13.anInt140;
							this.anIntArray70[this.anInt374] = local13.anInt141;
							this.anIntArray71[this.anInt374] = local13.anInt139;
							this.aStringArray4[this.anInt374++] = local13.aString3;
							if (this.anInt275 == 0 && local13.anInt141 == 1) {
								this.anIntArray67[this.anInt374] += 10;
								this.anIntArray66[this.anInt374] += 5;
							}
							if (this.anInt275 == 0 && local13.anInt141 == 2) {
								this.anIntArray68[this.anInt374] = 60;
							}
						}
					}
					if (local13.anInt142 > anInt367) {
						this.method130(local13, local13.anInt169 + 15);
						if (this.anInt320 > -1) {
							local54 = local13.anInt143 * 30 / local13.anInt144;
							if (local54 > 30) {
								local54 = 30;
							}
							Class1_Sub1_Sub2.method456(this.anInt321 - 3, 5, this.anInt320 - 15, local54, 65280);
							Class1_Sub1_Sub2.method456(this.anInt321 - 3, 5, this.anInt320 + local54 - 15, 30 - local54, 16711680);
						}
					}
					for (local54 = 0; local54 < 4; local54++) {
						if (local13.anIntArray15[local54] > anInt367) {
							this.method130(local13, local13.anInt169 / 2);
							if (this.anInt320 > -1) {
								if (local54 == 1) {
									this.anInt321 -= 20;
								}
								if (local54 == 2) {
									this.anInt320 -= 15;
									this.anInt321 -= 10;
								}
								if (local54 == 3) {
									this.anInt320 += 15;
									this.anInt321 -= 10;
								}
								this.aClass1_Sub1_Sub2_Sub2Array5[local13.anIntArray14[local54]].method404(this.anInt320 - 12, this.anInt321 - 12);
								this.aClass1_Sub1_Sub2_Sub4_1.method463(0, this.anInt320, this.anInt321 + 4, String.valueOf(local13.anIntArray13[local54]));
								this.aClass1_Sub1_Sub2_Sub4_1.method463(16777215, this.anInt320 - 1, this.anInt321 + 3, String.valueOf(local13.anIntArray13[local54]));
							}
						}
					}
				}
			}
			for (@Pc(559) int local559 = 0; local559 < this.anInt374; local559++) {
				local54 = this.anIntArray65[local559];
				@Pc(571) int local571 = this.anIntArray66[local559];
				local74 = this.anIntArray68[local559];
				@Pc(581) int local581 = this.anIntArray67[local559];
				@Pc(583) boolean local583 = true;
				while (local583) {
					local583 = false;
					for (@Pc(589) int local589 = 0; local589 < local559; local589++) {
						if (local571 + 2 > this.anIntArray66[local589] - this.anIntArray67[local589] && local571 - local581 < this.anIntArray66[local589] + 2 && local54 - local74 < this.anIntArray65[local589] + this.anIntArray68[local589] && local54 + local74 > this.anIntArray65[local589] - this.anIntArray68[local589] && this.anIntArray66[local589] - this.anIntArray67[local589] < local571) {
							local571 = this.anIntArray66[local589] - this.anIntArray67[local589];
							local583 = true;
						}
					}
				}
				this.anInt320 = this.anIntArray65[local559];
				this.anInt321 = this.anIntArray66[local559] = local571;
				@Pc(688) String local688 = this.aStringArray4[local559];
				if (this.anInt275 == 0) {
					@Pc(693) int local693 = 16776960;
					if (this.anIntArray69[local559] < 6) {
						local693 = this.anIntArray80[this.anIntArray69[local559]];
					}
					if (this.anIntArray69[local559] == 6) {
						local693 = this.anInt447 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray69[local559] == 7) {
						local693 = this.anInt447 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray69[local559] == 8) {
						local693 = this.anInt447 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(768) int local768;
					if (this.anIntArray69[local559] == 9) {
						local768 = 150 - this.anIntArray71[local559];
						if (local768 < 50) {
							local693 = local768 * 1280 + 16711680;
						} else if (local768 < 100) {
							local693 = 16776960 - (local768 - 50) * 327680;
						} else if (local768 < 150) {
							local693 = (local768 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray69[local559] == 10) {
						local768 = 150 - this.anIntArray71[local559];
						if (local768 < 50) {
							local693 = local768 * 5 + 16711680;
						} else if (local768 < 100) {
							local693 = 16711935 - (local768 - 50) * 327680;
						} else if (local768 < 150) {
							local693 = (local768 - 100) * 327680 + 255 - (local768 - 100) * 5;
						}
					}
					if (this.anIntArray69[local559] == 11) {
						local768 = 150 - this.anIntArray71[local559];
						if (local768 < 50) {
							local693 = 16777215 - local768 * 327685;
						} else if (local768 < 100) {
							local693 = (local768 - 50) * 327685 + 65280;
						} else if (local768 < 150) {
							local693 = 16777215 - (local768 - 100) * 327680;
						}
					}
					if (this.anIntArray70[local559] == 0) {
						this.aClass1_Sub1_Sub2_Sub4_3.method463(0, this.anInt320, this.anInt321 + 1, local688);
						this.aClass1_Sub1_Sub2_Sub4_3.method463(local693, this.anInt320, this.anInt321, local688);
					}
					if (this.anIntArray70[local559] == 1) {
						this.aClass1_Sub1_Sub2_Sub4_3.method467(this.anInt320, 0, this.anInt321 + 1, local688, this.anInt447);
						this.aClass1_Sub1_Sub2_Sub4_3.method467(this.anInt320, local693, this.anInt321, local688, this.anInt447);
					}
					if (this.anIntArray70[local559] == 2) {
						local768 = this.aClass1_Sub1_Sub2_Sub4_3.method465(local688);
						@Pc(989) int local989 = (150 - this.anIntArray71[local559]) * (local768 + 100) / 150;
						Class1_Sub1_Sub2.method453(0, this.anInt320 + 50, 334, this.anInt320 - 50);
						this.aClass1_Sub1_Sub2_Sub4_3.method466(local688, 0, this.anInt320 + 50 - local989, this.anInt321 + 1);
						this.aClass1_Sub1_Sub2_Sub4_3.method466(local688, local693, this.anInt320 + 50 - local989, this.anInt321);
						Class1_Sub1_Sub2.method452();
					}
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method463(0, this.anInt320, this.anInt321 + 1, local688);
					this.aClass1_Sub1_Sub2_Sub4_3.method463(16776960, this.anInt320, this.anInt321, local688);
				}
			}
			@Pc(1066) boolean local1066 = false;
		} catch (@Pc(1068) RuntimeException local1068) {
			signlink.reporterror("19524, " + arg0 + ", " + local1068.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method154(@OriginalArg(0) String arg0) throws IOException {
		return signlink.mainapp == null ? new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream()) : signlink.openurl(arg0);
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method155() {
		try {
			@Pc(9) int local9 = (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 >> 7) + this.anInt281;
			@Pc(17) int local17 = (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 >> 7) + this.anInt282;
			if (local9 >= 2944 && local9 < 3392 && local17 >= 3520 && local17 < 6400) {
				this.anInt270 = (local17 - 3520) / 8 + 1;
			} else if (local9 >= 2944 && local9 < 3392 && local17 >= 9920 && local17 < 12800) {
				this.anInt270 = (local17 - 9920) / 8 + 1;
			} else {
				this.anInt270 = 0;
			}
			this.anInt295 = 0;
			if (local9 >= 3328 && local9 < 3392 && local17 >= 3200 && local17 < 3264) {
				@Pc(94) int local94 = local9 & 0x3F;
				@Pc(98) int local98 = local17 & 0x3F;
				if (local94 >= 4 && local94 <= 29 && local98 >= 44 && local98 <= 58) {
					this.anInt295 = 1;
				}
				if (local94 >= 36 && local94 <= 61 && local98 >= 44 && local98 <= 58) {
					this.anInt295 = 1;
				}
				if (local94 >= 4 && local94 <= 29 && local98 >= 25 && local98 <= 39) {
					this.anInt295 = 1;
				}
				if (local94 >= 36 && local94 <= 61 && local98 >= 25 && local98 <= 39) {
					this.anInt295 = 1;
				}
				if (local94 >= 4 && local94 <= 29 && local98 >= 6 && local98 <= 20) {
					this.anInt295 = 1;
				}
				if (local94 >= 36 && local94 <= 61 && local98 >= 6 && local98 <= 20) {
					this.anInt295 = 1;
				}
			}
			if (this.anInt295 == 0 && local9 >= 3328 && local9 <= 3393 && local17 >= 3203 && local17 <= 3325) {
				this.anInt295 = 2;
			}
			this.anInt380 = 0;
			if (local9 >= 3053 && local9 <= 3156 && local17 >= 3056 && local17 <= 3136) {
				this.anInt380 = 1;
			}
			if (local9 >= 3072 && local9 <= 3118 && local17 >= 9492 && local17 <= 9535) {
				this.anInt380 = 1;
			}
			if (this.anInt380 == 1 && local9 >= 3139 && local9 <= 3199 && local17 >= 3008 && local17 <= 3062) {
				this.anInt380 = 0;
			}
		} catch (@Pc(260) RuntimeException local260) {
			signlink.reporterror("56561, " + 3 + ", " + local260.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!mb;I)V")
	private void method156(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			this.anInt414 = 0;
			this.anInt405 = 0;
			this.method221(arg0, arg1);
			this.method151(arg1, arg0);
			this.method198(this.anInt246, arg1, arg0);
			this.method126(arg1, arg0);
			@Pc(42) int local42;
			for (@Pc(35) int local35 = 0; local35 < this.anInt414; local35++) {
				local42 = this.anIntArray89[local35];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local42].anInt168 != anInt367) {
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local42] = null;
				}
			}
			if (arg1.anInt778 != arg0) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.anInt778 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local42 = 0; local42 < this.anInt404; local42++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray78[local42]] == null) {
					signlink.reporterror(this.aString5 + " null entry in pl list - pos:" + local42 + " size:" + this.anInt404);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("99369, " + arg0 + ", " + arg1 + ", " + 45228 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method157() {
		try {
			if (this.anInt325 == 0) {
				@Pc(6) int local6 = super.anInt237;
				if (this.anInt313 == 1 && super.anInt238 >= 516 && super.anInt239 >= 160 && super.anInt238 <= 765 && super.anInt239 <= 205) {
					local6 = 0;
				}
				@Pc(41) int local41;
				@Pc(44) int local44;
				@Pc(120) int local120;
				if (this.aBoolean60) {
					if (local6 != 1) {
						local41 = super.anInt232;
						local44 = super.anInt233;
						if (this.anInt390 == 0) {
							local41 -= 4;
							local44 -= 4;
						}
						if (this.anInt390 == 1) {
							local41 -= 553;
							local44 -= 205;
						}
						if (this.anInt390 == 2) {
							local41 -= 17;
							local44 -= 357;
						}
						if (local41 < this.anInt391 - 10 || local41 > this.anInt391 + this.anInt393 + 10 || local44 < this.anInt392 - 10 || local44 > this.anInt392 + this.anInt394 + 10) {
							this.aBoolean60 = false;
							if (this.anInt390 == 1) {
								this.aBoolean78 = true;
							}
							if (this.anInt390 == 2) {
								this.aBoolean68 = true;
							}
						}
					}
					if (local6 == 1) {
						local41 = this.anInt391;
						local44 = this.anInt392;
						local120 = this.anInt393;
						@Pc(123) int local123 = super.anInt238;
						@Pc(126) int local126 = super.anInt239;
						if (this.anInt390 == 0) {
							local123 -= 4;
							local126 -= 4;
						}
						if (this.anInt390 == 1) {
							local123 -= 553;
							local126 -= 205;
						}
						if (this.anInt390 == 2) {
							local123 -= 17;
							local126 -= 357;
						}
						@Pc(145) int local145 = -1;
						for (@Pc(147) int local147 = 0; local147 < this.anInt251; local147++) {
							@Pc(162) int local162 = local44 + (this.anInt251 - 1 - local147) * 15 + 31;
							if (local123 > local41 && local123 < local41 + local120 && local126 > local162 - 13 && local126 < local162 + 3) {
								local145 = local147;
							}
						}
						if (local145 != -1) {
							this.method133(local145);
						}
						this.aBoolean60 = false;
						if (this.anInt390 == 1) {
							this.aBoolean78 = true;
						}
						if (this.anInt390 == 2) {
							this.aBoolean68 = true;
							return;
						}
					}
				} else {
					if (local6 == 1 && this.anInt251 > 0) {
						local41 = this.anIntArray83[this.anInt251 - 1];
						if (local41 == 602 || local41 == 596 || local41 == 22 || local41 == 892 || local41 == 415 || local41 == 405 || local41 == 38 || local41 == 422 || local41 == 478 || local41 == 347 || local41 == 188) {
							local44 = this.anIntArray81[this.anInt251 - 1];
							local120 = this.anIntArray82[this.anInt251 - 1];
							@Pc(279) Class6 local279 = Class6.aClass6Array1[local120];
							if (local279.aBoolean84 || local279.aBoolean87) {
								this.aBoolean75 = false;
								this.anInt359 = 0;
								this.anInt323 = local120;
								this.anInt324 = local44;
								this.anInt325 = 2;
								this.anInt326 = super.anInt238;
								this.anInt327 = super.anInt239;
								if (Class6.aClass6Array1[local120].anInt459 == this.anInt254) {
									this.anInt325 = 1;
								}
								if (Class6.aClass6Array1[local120].anInt459 == this.anInt328) {
									this.anInt325 = 3;
								}
								return;
							}
						}
					}
					if (local6 == 1 && (this.anInt353 == 1 || this.method163(this.anInt329, this.anInt251 - 1)) && this.anInt251 > 2) {
						local6 = 2;
					}
					if (local6 == 1 && this.anInt251 > 0) {
						this.method133(this.anInt251 - 1);
					}
					if (local6 != 2 || this.anInt251 <= 0) {
						return;
					}
					this.method204();
				}
			}
		} catch (@Pc(375) RuntimeException local375) {
			signlink.reporterror("16057, " + 4 + ", " + local375.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;I)Z")
	private boolean method158(@OriginalArg(0) Class6 arg0) {
		try {
			@Pc(10) int local10 = arg0.anInt462;
			if (local10 >= 1 && local10 <= 200 || !(local10 < 701 || local10 > 900)) {
				if (local10 >= 801) {
					local10 -= 701;
				} else if (local10 >= 701) {
					local10 -= 601;
				} else if (local10 >= 101) {
					local10 -= 101;
				} else {
					local10--;
				}
				this.aStringArray1[this.anInt251] = "Remove @whi@" + this.aStringArray5[local10];
				this.anIntArray83[this.anInt251] = 557;
				this.anInt251++;
				this.aStringArray1[this.anInt251] = "Message @whi@" + this.aStringArray5[local10];
				this.anIntArray83[this.anInt251] = 679;
				this.anInt251++;
				return true;
			} else if (local10 >= 401 && local10 <= 500) {
				this.aStringArray1[this.anInt251] = "Remove @whi@" + arg0.aString19;
				this.anIntArray83[this.anInt251] = 556;
				this.anInt251++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("67697, " + arg0 + ", " + 9 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!jb;II)V")
	private void method159(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub2 arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(7) int local7 = arg2 * arg2 + arg0 * arg0;
			if (local7 > 4225 && local7 < 90000) {
				@Pc(26) int local26 = this.anInt256 + this.anInt248 & 0x7FF;
				@Pc(30) int local30 = Class1_Sub1_Sub1_Sub5.anIntArray157[local26];
				@Pc(34) int local34 = Class1_Sub1_Sub1_Sub5.anIntArray158[local26];
				@Pc(43) int local43 = local30 * 256 / (this.anInt372 + 256);
				@Pc(52) int local52 = local34 * 256 / (this.anInt372 + 256);
				@Pc(62) int local62 = arg0 * local43 + arg2 * local52 >> 16;
				@Pc(72) int local72 = arg0 * local52 - arg2 * local43 >> 16;
				@Pc(78) double local78 = Math.atan2((double) local62, (double) local72);
				@Pc(84) int local84 = (int) (Math.sin(local78) * 63.0D);
				@Pc(90) int local90 = (int) (Math.cos(local78) * 57.0D);
				this.aClass1_Sub1_Sub2_Sub2_1.method409(local84 + 94 + 4 - 10, 83 - local90 - 20, local78);
			} else {
				this.method182(arg2, arg1, arg0);
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("58428, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 19482 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}
		try {
			if (super.aFrame_Sub1_2 != null) {
				return new URL("http://127.0.0.1:" + (anInt385 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method160(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			if (this.anInt396 == 2) {
				for (@Pc(21) Class1_Sub2 local21 = (Class1_Sub2) this.aClass31_3.method524(); local21 != null; local21 = (Class1_Sub2) this.aClass31_3.method526()) {
					if (local21.anInt838 > 0) {
						local21.anInt838--;
					}
					if (local21.anInt838 != 0) {
						if (local21.anInt837 > 0) {
							local21.anInt837--;
						}
						if (local21.anInt837 == 0 && local21.anInt829 >= 1 && local21.anInt830 >= 1 && local21.anInt829 <= 102 && local21.anInt830 <= 102 && (local21.anInt834 < 0 || Class4.method73(local21.anInt836, local21.anInt834))) {
							this.method124(local21.anInt836, local21.anInt830, local21.anInt835, this.anInt304, local21.anInt828, local21.anInt834, local21.anInt829, local21.anInt827);
							local21.anInt837 = -1;
							if (local21.anInt834 == local21.anInt831 && local21.anInt831 == -1) {
								local21.method665();
							} else if (local21.anInt834 == local21.anInt831 && local21.anInt835 == local21.anInt832 && local21.anInt836 == local21.anInt833) {
								local21.method665();
							}
						}
					} else if (local21.anInt831 < 0 || Class4.method73(local21.anInt833, local21.anInt831)) {
						this.method124(local21.anInt833, local21.anInt830, local21.anInt832, this.anInt304, local21.anInt828, local21.anInt831, local21.anInt829, local21.anInt827);
						local21.method665();
					}
				}
				anInt276++;
				if (anInt276 > 85) {
					anInt276 = 0;
					this.aClass1_Sub1_Sub3_2.method485(63);
					return;
				}
			}
		} catch (@Pc(180) RuntimeException local180) {
			signlink.reporterror("20176, " + arg0 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method161(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			if (this.anInt286 != 0) {
				@Pc(10) Class1_Sub1_Sub2_Sub4 local10 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(12) int local12 = 0;
				if (this.anInt438 != 0) {
					local12 = 1;
				}
				for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
					if (this.aStringArray3[local19] != null) {
						@Pc(31) int local31 = this.anIntArray56[local19];
						@Pc(36) String local36 = this.aStringArray2[local19];
						@Pc(38) byte local38 = 0;
						if (local36 != null && local36.startsWith("@cr1@")) {
							local36 = local36.substring(5);
							local38 = 1;
						}
						if (local36 != null && local36.startsWith("@cr2@")) {
							local36 = local36.substring(5);
							local38 = 2;
						}
						@Pc(89) int local89;
						if ((local31 == 3 || local31 == 7) && (local31 == 7 || this.anInt416 == 0 || this.anInt416 == 1 && this.method104(local36))) {
							local89 = 329 - local12 * 13;
							local10.method466("From", 0, 4, local89);
							local10.method466("From", 65535, 4, local89 - 1);
							@Pc(114) int local114 = local10.method465("From ") + 4;
							if (local38 == 1) {
								this.aClass1_Sub1_Sub2_Sub3Array3[0].method443(local114, 200, local89 - 12);
								local114 += 14;
							}
							if (local38 == 2) {
								this.aClass1_Sub1_Sub2_Sub3Array3[1].method443(local114, 200, local89 - 12);
								local114 += 14;
							}
							local10.method466(local36 + ": " + this.aStringArray3[local19], 0, local114, local89);
							local10.method466(local36 + ": " + this.aStringArray3[local19], 65535, local114, local89 - 1);
							local12++;
							if (local12 >= 5) {
								return;
							}
						}
						if (local31 == 5 && this.anInt416 < 2) {
							local89 = 329 - local12 * 13;
							local10.method466(this.aStringArray3[local19], 0, 4, local89);
							local10.method466(this.aStringArray3[local19], 65535, 4, local89 - 1);
							local12++;
							if (local12 >= 5) {
								return;
							}
						}
						if (local31 == 6 && this.anInt416 < 2) {
							local89 = 329 - local12 * 13;
							local10.method466("To " + local36 + ": " + this.aStringArray3[local19], 0, 4, local89);
							local10.method466("To " + local36 + ": " + this.aStringArray3[local19], 65535, 4, local89 - 1);
							local12++;
							if (local12 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("63302, " + arg0 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)Z")
	private boolean method163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 >= 0) {
				anInt376 = this.aClass45_1.method670();
			}
			if (arg1 < 0) {
				return false;
			}
			@Pc(14) int local14 = this.anIntArray83[arg1];
			if (local14 >= 2000) {
				local14 -= 2000;
			}
			return local14 == 406;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("51258, " + arg0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method164() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray60[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray60[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray61[local54] = (this.anIntArray60[local54 - 1] + this.anIntArray60[local54 + 1] + this.anIntArray60[local54 - 128] + this.anIntArray60[local54 + 128]) / 4;
				}
			}
			this.anInt445 += 128;
			if (this.anInt445 > this.anIntArray90.length) {
				this.anInt445 -= this.anIntArray90.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method125(50, this.aClass1_Sub1_Sub2_Sub3Array2[local48]);
			}
			@Pc(166) int local166;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local166 = local54 + (local48 << 7);
					@Pc(189) int local189 = this.anIntArray61[local166 + 128] - this.anIntArray90[local166 + this.anInt445 & this.anIntArray90.length - 1] / 5;
					if (local189 < 0) {
						local189 = 0;
					}
					this.anIntArray60[local166] = local189;
				}
			}
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray48[local54] = this.anIntArray48[local54 + 1];
			}
			this.anIntArray48[255] = (int) (Math.sin((double) anInt367 / 14.0D) * 16.0D + Math.sin((double) anInt367 / 15.0D) * 14.0D + Math.sin((double) anInt367 / 16.0D) * 12.0D);
			if (this.anInt431 > 0) {
				this.anInt431 -= 4;
			}
			if (this.anInt432 > 0) {
				this.anInt432 -= 4;
			}
			if (this.anInt431 == 0 && this.anInt432 == 0) {
				local166 = (int) (Math.random() * 2000.0D);
				if (local166 == 0) {
					this.anInt431 = 1024;
				}
				if (local166 == 1) {
					this.anInt432 = 1024;
					return;
				}
			}
		} catch (@Pc(306) RuntimeException local306) {
			signlink.reporterror("59027, " + -185 + ", " + local306.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZIILclient!d;II)V")
	private void method165(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class6 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg3.anInt460 == 0 && arg3.anIntArray99 != null && !arg3.aBoolean82 && (arg4 >= arg0 && arg1 >= arg5 && arg4 <= arg0 + arg3.anInt463 && arg1 <= arg5 + arg3.anInt464)) {
				@Pc(34) int local34 = arg3.anIntArray99.length;
				for (@Pc(46) int local46 = 0; local46 < local34; local46++) {
					@Pc(55) int local55 = arg3.anIntArray100[local46] + arg0;
					@Pc(64) int local64 = arg3.anIntArray101[local46] + arg5 - arg2;
					@Pc(71) Class6 local71 = Class6.aClass6Array1[arg3.anIntArray99[local46]];
					@Pc(76) int local76 = local55 + local71.anInt465;
					@Pc(81) int local81 = local64 + local71.anInt466;
					if ((local71.anInt467 >= 0 || local71.anInt475 != 0) && arg4 >= local76 && arg1 >= local81 && arg4 < local76 + local71.anInt463 && arg1 < local81 + local71.anInt464) {
						if (local71.anInt467 >= 0) {
							this.anInt437 = local71.anInt467;
						} else {
							this.anInt437 = local71.anInt458;
						}
					}
					if (local71.anInt460 == 0) {
						this.method165(local76, arg1, local71.anInt469, local71, arg4, local81);
						if (local71.anInt468 > local71.anInt464) {
							this.method207(local81, local76 + local71.anInt463, local71.anInt468, local71.anInt464, true, local71, arg1, arg4);
						}
					} else {
						if (local71.anInt461 == 1 && arg4 >= local76 && arg1 >= local81 && arg4 < local76 + local71.anInt463 && arg1 < local81 + local71.anInt464) {
							@Pc(178) boolean local178 = false;
							if (local71.anInt462 != 0) {
								local178 = this.method158(local71);
							}
							if (!local178) {
								this.aStringArray1[this.anInt251] = local71.aString23;
								this.anIntArray83[this.anInt251] = 951;
								this.anIntArray82[this.anInt251] = local71.anInt458;
								this.anInt251++;
							}
						}
						if (local71.anInt461 == 2 && this.anInt313 == 0 && arg4 >= local76 && arg1 >= local81 && arg4 < local76 + local71.anInt463 && arg1 < local81 + local71.anInt464) {
							@Pc(242) String local242 = local71.aString21;
							if (local242.indexOf(" ") != -1) {
								local242 = local242.substring(0, local242.indexOf(" "));
							}
							this.aStringArray1[this.anInt251] = local242 + " @gre@" + local71.aString22;
							this.anIntArray83[this.anInt251] = 930;
							this.anIntArray82[this.anInt251] = local71.anInt458;
							this.anInt251++;
						}
						if (local71.anInt461 == 3 && arg4 >= local76 && arg1 >= local81 && arg4 < local76 + local71.anInt463 && arg1 < local81 + local71.anInt464) {
							this.aStringArray1[this.anInt251] = "Close";
							this.anIntArray83[this.anInt251] = 947;
							this.anIntArray82[this.anInt251] = local71.anInt458;
							this.anInt251++;
						}
						if (local71.anInt461 == 4 && arg4 >= local76 && arg1 >= local81 && arg4 < local76 + local71.anInt463 && arg1 < local81 + local71.anInt464) {
							this.aStringArray1[this.anInt251] = local71.aString23;
							this.anIntArray83[this.anInt251] = 465;
							this.anIntArray82[this.anInt251] = local71.anInt458;
							this.anInt251++;
						}
						if (local71.anInt461 == 5 && arg4 >= local76 && arg1 >= local81 && arg4 < local76 + local71.anInt463 && arg1 < local81 + local71.anInt464) {
							this.aStringArray1[this.anInt251] = local71.aString23;
							this.anIntArray83[this.anInt251] = 960;
							this.anIntArray82[this.anInt251] = local71.anInt458;
							this.anInt251++;
						}
						if (local71.anInt461 == 6 && !this.aBoolean58 && arg4 >= local76 && arg1 >= local81 && arg4 < local76 + local71.anInt463 && arg1 < local81 + local71.anInt464) {
							this.aStringArray1[this.anInt251] = local71.aString23;
							this.anIntArray83[this.anInt251] = 44;
							this.anIntArray82[this.anInt251] = local71.anInt458;
							this.anInt251++;
						}
						if (local71.anInt460 == 2) {
							@Pc(490) int local490 = 0;
							for (@Pc(492) int local492 = 0; local492 < local71.anInt464; local492++) {
								for (@Pc(496) int local496 = 0; local496 < local71.anInt463; local496++) {
									@Pc(507) int local507 = local76 + local496 * (local71.anInt471 + 32);
									@Pc(516) int local516 = local81 + local492 * (local71.anInt472 + 32);
									if (local490 < 20) {
										local507 += local71.anIntArray102[local490];
										local516 += local71.anIntArray103[local490];
									}
									if (arg4 >= local507 && arg1 >= local516 && arg4 < local507 + 32 && arg1 < local516 + 32) {
										this.anInt365 = local490;
										this.anInt366 = local71.anInt458;
										if (local71.anIntArray95[local490] > 0) {
											@Pc(569) Class15 local569 = Class15.method343(local71.anIntArray95[local490] - 1);
											if (this.anInt361 == 1 && local71.aBoolean85) {
												if (local71.anInt458 != this.anInt363 || local490 != this.anInt362) {
													this.aStringArray1[this.anInt251] = "Use " + this.aString13 + " with @lre@" + local569.aString26;
													this.anIntArray83[this.anInt251] = 881;
													this.anIntArray84[this.anInt251] = local569.anInt617;
													this.anIntArray81[this.anInt251] = local490;
													this.anIntArray82[this.anInt251] = local71.anInt458;
													this.anInt251++;
												}
											} else if (this.anInt313 != 1 || !local71.aBoolean85) {
												@Pc(706) int local706;
												if (local71.aBoolean85) {
													for (local706 = 4; local706 >= 3; local706--) {
														if (local569.aStringArray10 != null && local569.aStringArray10[local706] != null) {
															this.aStringArray1[this.anInt251] = local569.aStringArray10[local706] + " @lre@" + local569.aString26;
															if (local706 == 3) {
																this.anIntArray83[this.anInt251] = 478;
															}
															if (local706 == 4) {
																this.anIntArray83[this.anInt251] = 347;
															}
															this.anIntArray84[this.anInt251] = local569.anInt617;
															this.anIntArray81[this.anInt251] = local490;
															this.anIntArray82[this.anInt251] = local71.anInt458;
															this.anInt251++;
														} else if (local706 == 4) {
															this.aStringArray1[this.anInt251] = "Drop @lre@" + local569.aString26;
															this.anIntArray83[this.anInt251] = 347;
															this.anIntArray84[this.anInt251] = local569.anInt617;
															this.anIntArray81[this.anInt251] = local490;
															this.anIntArray82[this.anInt251] = local71.anInt458;
															this.anInt251++;
														}
													}
												}
												if (local71.aBoolean86) {
													this.aStringArray1[this.anInt251] = "Use @lre@" + local569.aString26;
													this.anIntArray83[this.anInt251] = 188;
													this.anIntArray84[this.anInt251] = local569.anInt617;
													this.anIntArray81[this.anInt251] = local490;
													this.anIntArray82[this.anInt251] = local71.anInt458;
													this.anInt251++;
												}
												if (local71.aBoolean85 && local569.aStringArray10 != null) {
													for (local706 = 2; local706 >= 0; local706--) {
														if (local569.aStringArray10[local706] != null) {
															this.aStringArray1[this.anInt251] = local569.aStringArray10[local706] + " @lre@" + local569.aString26;
															if (local706 == 0) {
																this.anIntArray83[this.anInt251] = 405;
															}
															if (local706 == 1) {
																this.anIntArray83[this.anInt251] = 38;
															}
															if (local706 == 2) {
																this.anIntArray83[this.anInt251] = 422;
															}
															this.anIntArray84[this.anInt251] = local569.anInt617;
															this.anIntArray81[this.anInt251] = local490;
															this.anIntArray82[this.anInt251] = local71.anInt458;
															this.anInt251++;
														}
													}
												}
												if (local71.aStringArray6 != null) {
													for (local706 = 4; local706 >= 0; local706--) {
														if (local71.aStringArray6[local706] != null) {
															this.aStringArray1[this.anInt251] = local71.aStringArray6[local706] + " @lre@" + local569.aString26;
															if (local706 == 0) {
																this.anIntArray83[this.anInt251] = 602;
															}
															if (local706 == 1) {
																this.anIntArray83[this.anInt251] = 596;
															}
															if (local706 == 2) {
																this.anIntArray83[this.anInt251] = 22;
															}
															if (local706 == 3) {
																this.anIntArray83[this.anInt251] = 892;
															}
															if (local706 == 4) {
																this.anIntArray83[this.anInt251] = 415;
															}
															this.anIntArray84[this.anInt251] = local569.anInt617;
															this.anIntArray81[this.anInt251] = local490;
															this.anIntArray82[this.anInt251] = local71.anInt458;
															this.anInt251++;
														}
													}
												}
												this.aStringArray1[this.anInt251] = "Examine @lre@" + local569.aString26;
												this.anIntArray83[this.anInt251] = 1773;
												this.anIntArray84[this.anInt251] = local569.anInt617;
												this.anIntArray82[this.anInt251] = local71.anIntArray96[local490];
												this.anInt251++;
											} else if ((this.anInt315 & 0x10) == 16) {
												this.aStringArray1[this.anInt251] = this.aString9 + " @lre@" + local569.aString26;
												this.anIntArray83[this.anInt251] = 391;
												this.anIntArray84[this.anInt251] = local569.anInt617;
												this.anIntArray81[this.anInt251] = local490;
												this.anIntArray82[this.anInt251] = local71.anInt458;
												this.anInt251++;
											}
										}
									}
									local490++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1132) RuntimeException local1132) {
			signlink.reporterror("85153, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local1132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method166() {
		try {
			if (this.anInt441 == 2) {
				this.method131((this.anInt290 - this.anInt282 << 7) + this.anInt293, this.anInt291 * 2, (this.anInt289 - this.anInt281 << 7) + this.anInt292);
				if (this.anInt320 > -1 && anInt367 % 20 < 10) {
					this.aClass1_Sub1_Sub2_Sub2Array4[2].method404(this.anInt320 - 12, this.anInt321 - 28);
				}
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("64273, " + false + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method167() {
		try {
			this.aBoolean61 = true;
			for (@Pc(13) int local13 = 0; local13 < 7; local13++) {
				this.anIntArray41[local13] = -1;
				for (@Pc(22) int local22 = 0; local22 < Class23.anInt757; local22++) {
					if (!Class23.aClass23Array1[local22].aBoolean170 && Class23.aClass23Array1[local22].anInt758 == local13 + (this.aBoolean62 ? 0 : 7)) {
						this.anIntArray41[local13] = local22;
						break;
					}
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("46578, " + -943 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method91() {
		try {
			if (!this.aBoolean53 && !this.aBoolean63 && !this.aBoolean51) {
				anInt367++;
				if (this.aBoolean55) {
					this.method212(this.anInt294);
				} else {
					this.method184();
				}
				this.method145();
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("42806, " + 2 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method169() {
		try {
			for (@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) this.aClass31_3.method524(); local6 != null; local6 = (Class1_Sub2) this.aClass31_3.method526()) {
				if (local6.anInt838 == -1) {
					local6.anInt837 = 0;
					this.method192(local6);
				} else {
					local6.method665();
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("14241, " + 424 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ZI)V")
	private void method170(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) Class6 local3 = Class6.aClass6Array1[arg1];
			for (@Pc(5) int local5 = 0; local5 < local3.anIntArray99.length && local3.anIntArray99[local5] != -1; local5++) {
				@Pc(20) Class6 local20 = Class6.aClass6Array1[local3.anIntArray99[local5]];
				if (local20.anInt460 == 1) {
					this.method170(this.aBoolean50, local20.anInt458);
				}
				local20.anInt456 = 0;
				local20.anInt457 = 0;
			}
			if (!arg0) {
				;
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("51582, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method171() {
		try {
			if (this.anInt251 >= 2 || this.anInt361 != 0 || this.anInt313 != 0) {
				@Pc(39) String local39;
				if (this.anInt361 == 1 && this.anInt251 < 2) {
					local39 = "Use " + this.aString13 + " with...";
				} else if (this.anInt313 == 1 && this.anInt251 < 2) {
					local39 = this.aString9 + "...";
				} else {
					local39 = this.aStringArray1[this.anInt251 - 1];
				}
				if (this.anInt251 > 2) {
					local39 = local39 + "@whi@ / " + (this.anInt251 - 2) + " more options";
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method469(anInt367 / 1000, 16777215, local39, 15, 4);
			}
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("69071, " + -169 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method172() {
		try {
			if (super.anInt237 == 1) {
				if (super.anInt238 >= 539 && super.anInt238 <= 573 && super.anInt239 >= 169 && super.anInt239 < 205 && this.anIntArray94[0] != -1) {
					this.aBoolean78 = true;
					this.anInt370 = 0;
					this.aBoolean74 = true;
				}
				if (super.anInt238 >= 569 && super.anInt238 <= 599 && super.anInt239 >= 168 && super.anInt239 < 205 && this.anIntArray94[1] != -1) {
					this.aBoolean78 = true;
					this.anInt370 = 1;
					this.aBoolean74 = true;
				}
				if (super.anInt238 >= 597 && super.anInt238 <= 627 && super.anInt239 >= 168 && super.anInt239 < 205 && this.anIntArray94[2] != -1) {
					this.aBoolean78 = true;
					this.anInt370 = 2;
					this.aBoolean74 = true;
				}
				if (super.anInt238 >= 625 && super.anInt238 <= 669 && super.anInt239 >= 168 && super.anInt239 < 203 && this.anIntArray94[3] != -1) {
					this.aBoolean78 = true;
					this.anInt370 = 3;
					this.aBoolean74 = true;
				}
				if (super.anInt238 >= 666 && super.anInt238 <= 696 && super.anInt239 >= 168 && super.anInt239 < 205 && this.anIntArray94[4] != -1) {
					this.aBoolean78 = true;
					this.anInt370 = 4;
					this.aBoolean74 = true;
				}
				if (super.anInt238 >= 694 && super.anInt238 <= 724 && super.anInt239 >= 168 && super.anInt239 < 205 && this.anIntArray94[5] != -1) {
					this.aBoolean78 = true;
					this.anInt370 = 5;
					this.aBoolean74 = true;
				}
				if (super.anInt238 >= 722 && super.anInt238 <= 756 && super.anInt239 >= 169 && super.anInt239 < 205 && this.anIntArray94[6] != -1) {
					this.aBoolean78 = true;
					this.anInt370 = 6;
					this.aBoolean74 = true;
				}
				if (super.anInt238 >= 540 && super.anInt238 <= 574 && super.anInt239 >= 466 && super.anInt239 < 502 && this.anIntArray94[7] != -1) {
					this.aBoolean78 = true;
					this.anInt370 = 7;
					this.aBoolean74 = true;
				}
				if (super.anInt238 >= 572 && super.anInt238 <= 602 && super.anInt239 >= 466 && super.anInt239 < 503 && this.anIntArray94[8] != -1) {
					this.aBoolean78 = true;
					this.anInt370 = 8;
					this.aBoolean74 = true;
				}
				if (super.anInt238 >= 599 && super.anInt238 <= 629 && super.anInt239 >= 466 && super.anInt239 < 503 && this.anIntArray94[9] != -1) {
					this.aBoolean78 = true;
					this.anInt370 = 9;
					this.aBoolean74 = true;
				}
				if (super.anInt238 >= 627 && super.anInt238 <= 671 && super.anInt239 >= 467 && super.anInt239 < 502 && this.anIntArray94[10] != -1) {
					this.aBoolean78 = true;
					this.anInt370 = 10;
					this.aBoolean74 = true;
				}
				if (super.anInt238 >= 669 && super.anInt238 <= 699 && super.anInt239 >= 466 && super.anInt239 < 503 && this.anIntArray94[11] != -1) {
					this.aBoolean78 = true;
					this.anInt370 = 11;
					this.aBoolean74 = true;
				}
				if (super.anInt238 >= 696 && super.anInt238 <= 726 && super.anInt239 >= 466 && super.anInt239 < 503 && this.anIntArray94[12] != -1) {
					this.aBoolean78 = true;
					this.anInt370 = 12;
					this.aBoolean74 = true;
				}
				if (super.anInt238 >= 724 && super.anInt238 <= 758 && super.anInt239 >= 466 && super.anInt239 < 502 && this.anIntArray94[13] != -1) {
					this.aBoolean78 = true;
					this.anInt370 = 13;
					this.aBoolean74 = true;
				}
				anInt357++;
				if (anInt357 > 150) {
					anInt357 = 0;
					this.aClass1_Sub1_Sub3_2.method485(136);
					this.aClass1_Sub1_Sub3_2.method486(43);
					return;
				}
			}
		} catch (@Pc(462) RuntimeException local462) {
			signlink.reporterror("92471, " + false + ", " + local462.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!mb;I)V")
	private void method173(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(7) int local7 = 0; local7 < this.anInt405; local7++) {
				@Pc(14) int local14 = this.anIntArray79[local7];
				@Pc(19) Class1_Sub1_Sub1_Sub1_Sub1 local19 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local14];
				@Pc(22) int local22 = arg0.method496();
				@Pc(30) int local30;
				@Pc(33) int local33;
				if ((local22 & 0x1) == 1) {
					local30 = arg0.method496();
					local33 = arg0.method496();
					local19.method50(local33, local30);
					local19.anInt142 = anInt367 + 300;
					local19.anInt143 = arg0.method496();
					local19.anInt144 = arg0.method496();
				}
				if ((local22 & 0x2) == 2) {
					local30 = arg0.method498();
					if (local30 == 65535) {
						local30 = -1;
					}
					if (local30 == local19.anInt151) {
						local19.anInt155 = 0;
					}
					local33 = arg0.method496();
					if (local30 == local19.anInt151 && local30 != -1) {
						@Pc(86) int local86 = Class27.aClass27Array1[local30].anInt820;
						if (local86 == 1) {
							local19.anInt152 = 0;
							local19.anInt153 = 0;
							local19.anInt154 = local33;
							local19.anInt155 = 0;
						}
						if (local86 == 2) {
							local19.anInt155 = 0;
						}
					} else if (local30 == -1 || local19.anInt151 == -1 || Class27.aClass27Array1[local30].anInt814 >= Class27.aClass27Array1[local19.anInt151].anInt814) {
						local19.anInt151 = local30;
						local19.anInt152 = 0;
						local19.anInt153 = 0;
						local19.anInt154 = local33;
						local19.anInt155 = 0;
						local19.anInt173 = local19.anInt171;
					}
				}
				if ((local22 & 0x4) == 4) {
					local19.anInt145 = arg0.method498();
					if (local19.anInt145 == 65535) {
						local19.anInt145 = -1;
					}
				}
				if ((local22 & 0x8) == 8) {
					local19.aString3 = arg0.method503();
					local19.anInt139 = 100;
				}
				if ((local22 & 0x10) == 16) {
					local30 = arg0.method496();
					local33 = arg0.method496();
					local19.method50(local33, local30);
					local19.anInt142 = anInt367 + 300;
					local19.anInt143 = arg0.method496();
					local19.anInt144 = arg0.method496();
				}
				if ((local22 & 0x20) == 32) {
					local19.aClass13_1 = Class13.method319(arg0.method498());
					local19.anInt134 = local19.aClass13_1.anInt584;
					local19.anInt135 = local19.aClass13_1.anInt585;
					local19.anInt136 = local19.aClass13_1.anInt586;
					local19.anInt137 = local19.aClass13_1.anInt587;
					local19.anInt132 = local19.aClass13_1.anInt583;
				}
				if ((local22 & 0x40) == 64) {
					local19.anInt156 = arg0.method498();
					local30 = arg0.method501();
					local19.anInt160 = local30 >> 16;
					local19.anInt159 = anInt367 + (local30 & 0xFFFF);
					local19.anInt157 = 0;
					local19.anInt158 = 0;
					if (local19.anInt159 > anInt367) {
						local19.anInt157 = -1;
					}
					if (local19.anInt156 == 65535) {
						local19.anInt156 = -1;
					}
				}
				if ((local22 & 0x80) == 128) {
					local19.anInt146 = arg0.method498();
					local19.anInt147 = arg0.method498();
				}
			}
		} catch (@Pc(301) RuntimeException local301) {
			signlink.reporterror("30156, " + 46870 + ", " + arg0 + ", " + arg1 + ", " + local301.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!mb;BI)V")
	private void method174(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(16) int local16;
			@Pc(25) int local25;
			@Pc(32) int local32;
			@Pc(35) int local35;
			@Pc(39) int local39;
			@Pc(43) int local43;
			@Pc(48) int local48;
			@Pc(53) int local53;
			if (arg1 == 119 || arg1 == 198) {
				local16 = arg0.method496();
				local25 = this.anInt423 + (local16 >> 4 & 0x7);
				local32 = this.anInt424 + (local16 & 0x7);
				local35 = arg0.method496();
				local39 = local35 >> 2;
				local43 = local35 & 0x3;
				local48 = this.anIntArray93[local39];
				if (arg1 == 198) {
					local53 = -1;
				} else {
					local53 = arg0.method498();
				}
				if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
					this.method127(local53, local48, this.anInt419, local43, local32, 0, -1, local25, local39);
				}
			} else {
				@Pc(143) int local143;
				@Pc(155) int local155;
				@Pc(169) int local169;
				@Pc(181) int local181;
				if (arg1 == 71) {
					local16 = arg0.method496();
					local25 = this.anInt423 + (local16 >> 4 & 0x7);
					local32 = this.anInt424 + (local16 & 0x7);
					local35 = arg0.method496();
					local39 = local35 >> 2;
					local43 = local35 & 0x3;
					local48 = this.anIntArray93[local39];
					local53 = arg0.method498();
					if (local25 >= 0 && local32 >= 0 && local25 < 103 && local32 < 103) {
						local143 = this.anIntArrayArrayArray3[this.anInt419][local25][local32];
						local155 = this.anIntArrayArrayArray3[this.anInt419][local25 + 1][local32];
						local169 = this.anIntArrayArrayArray3[this.anInt419][local25 + 1][local32 + 1];
						local181 = this.anIntArrayArrayArray3[this.anInt419][local25][local32 + 1];
						if (local48 == 0) {
							@Pc(192) Class36 local192 = this.aClass38_1.method600(local32, this.anInt419, local25);
							if (local192 != null) {
								@Pc(201) int local201 = local192.anInt885 >> 14 & 0x7FFF;
								if (local39 == 2) {
									local192.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(local169, local201, (byte) 2, false, local143, local181, 2, local43 + 4, local155, local53);
									local192.aClass1_Sub1_Sub1_8 = new Class1_Sub1_Sub1_Sub2(local169, local201, (byte) 2, false, local143, local181, 2, local43 + 1 & 0x3, local155, local53);
								} else {
									local192.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(local169, local201, (byte) 2, false, local143, local181, local39, local43, local155, local53);
								}
							}
						}
						if (local48 == 1) {
							@Pc(270) Class16 local270 = this.aClass38_1.method601(local32, this.anInt419, local25, this.anInt429);
							if (local270 != null) {
								local270.aClass1_Sub1_Sub1_1 = new Class1_Sub1_Sub1_Sub2(local169, local270.anInt649 >> 14 & 0x7FFF, (byte) 2, false, local143, local181, 4, 0, local155, local53);
							}
						}
						if (local48 == 2) {
							@Pc(304) Class33 local304 = this.aClass38_1.method602(local32, local25, (byte) 1, this.anInt419);
							if (local39 == 11) {
								local39 = 10;
							}
							if (local304 != null) {
								local304.aClass1_Sub1_Sub1_6 = new Class1_Sub1_Sub1_Sub2(local169, local304.anInt873 >> 14 & 0x7FFF, (byte) 2, false, local143, local181, local39, local43, local155, local53);
							}
						}
						if (local48 == 3) {
							@Pc(343) Class20 local343 = this.aClass38_1.method603(local32, this.anInt419, local25);
							if (local343 != null) {
								local343.aClass1_Sub1_Sub1_2 = new Class1_Sub1_Sub1_Sub2(local169, local343.anInt703 >> 14 & 0x7FFF, (byte) 2, false, local143, local181, 22, local43, local155, local53);
							}
						}
					}
				} else {
					@Pc(408) Class1_Sub1_Sub1_Sub3 local408;
					if (arg1 == 94) {
						local16 = arg0.method496();
						local25 = this.anInt423 + (local16 >> 4 & 0x7);
						local32 = this.anInt424 + (local16 & 0x7);
						local35 = arg0.method498();
						local39 = arg0.method498();
						if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
							local408 = new Class1_Sub1_Sub1_Sub3();
							local408.anInt490 = local35;
							local408.anInt491 = local39;
							if (this.aClass31ArrayArrayArray1[this.anInt419][local25][local32] == null) {
								this.aClass31ArrayArrayArray1[this.anInt419][local25][local32] = new Class31(false);
							}
							this.aClass31ArrayArrayArray1[this.anInt419][local25][local32].method521(local408);
							this.method105(local25, local32);
						}
					} else if (arg1 == 13) {
						local16 = arg0.method496();
						local25 = this.anInt423 + (local16 >> 4 & 0x7);
						local32 = this.anInt424 + (local16 & 0x7);
						local35 = arg0.method498();
						if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
							@Pc(498) Class31 local498 = this.aClass31ArrayArrayArray1[this.anInt419][local25][local32];
							if (local498 != null) {
								for (local408 = (Class1_Sub1_Sub1_Sub3) local498.method524(); local408 != null; local408 = (Class1_Sub1_Sub1_Sub3) local498.method526()) {
									if (local408.anInt490 == (local35 & 0x7FFF)) {
										local408.method665();
										break;
									}
								}
								if (local498.method524() == null) {
									this.aClass31ArrayArrayArray1[this.anInt419][local25][local32] = null;
								}
								this.method105(local25, local32);
							}
						}
					} else if (arg1 == 187) {
						local16 = arg0.method496();
						local25 = this.anInt423 + (local16 >> 4 & 0x7);
						local32 = this.anInt424 + (local16 & 0x7);
						local35 = local25 + arg0.method497();
						local39 = local32 + arg0.method497();
						local43 = arg0.method499();
						local48 = arg0.method498();
						local53 = arg0.method496();
						local143 = arg0.method496();
						local155 = arg0.method498();
						local169 = arg0.method498();
						local181 = arg0.method496();
						@Pc(597) int local597 = arg0.method496();
						if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104 && local35 >= 0 && local39 >= 0 && local35 < 104 && local39 < 104) {
							local25 = local25 * 128 + 64;
							local32 = local32 * 128 + 64;
							local35 = local35 * 128 + 64;
							local39 = local39 * 128 + 64;
							@Pc(670) Class1_Sub1_Sub1_Sub4 local670 = new Class1_Sub1_Sub1_Sub4(this.method197(local32, this.anInt419, local25, (byte) 2) - local53, local597, this.anInt419, local32, local169 + anInt367, local143, local48, local181, local43, 200, local25, local155 + anInt367);
							local670.method254(local35, local39, local155 + anInt367, this.aByte7, this.method197(local39, this.anInt419, local35, (byte) 2) - local143);
							this.aClass31_2.method521(local670);
						}
					} else if (arg1 == 141) {
						local16 = arg0.method496();
						local25 = this.anInt423 + (local16 >> 4 & 0x7);
						local32 = this.anInt424 + (local16 & 0x7);
						local35 = arg0.method498();
						local39 = arg0.method496();
						local43 = arg0.method498();
						if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
							local25 = local25 * 128 + 64;
							local32 = local32 * 128 + 64;
							@Pc(767) Class1_Sub1_Sub1_Sub6 local767 = new Class1_Sub1_Sub1_Sub6(this.anInt419, local43, (byte) 9, local32, this.method197(local32, this.anInt419, local25, (byte) 2) - local39, local35, local25, anInt367);
							this.aClass31_1.method521(local767);
						}
					} else if (arg1 == 190) {
						local16 = arg0.method496();
						local25 = this.anInt423 + (local16 >> 4 & 0x7);
						local32 = this.anInt424 + (local16 & 0x7);
						local35 = arg0.method498();
						local39 = arg0.method498();
						local43 = arg0.method498();
						if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104 && local43 != this.anInt421) {
							@Pc(821) Class1_Sub1_Sub1_Sub3 local821 = new Class1_Sub1_Sub1_Sub3();
							local821.anInt490 = local35;
							local821.anInt491 = local39;
							if (this.aClass31ArrayArrayArray1[this.anInt419][local25][local32] == null) {
								this.aClass31ArrayArrayArray1[this.anInt419][local25][local32] = new Class31(false);
							}
							this.aClass31ArrayArrayArray1[this.anInt419][local25][local32].method521(local821);
							this.method105(local25, local32);
						}
					} else {
						if (arg1 == 188) {
							local16 = arg0.method496();
							local25 = this.anInt423 + (local16 >> 4 & 0x7);
							local32 = this.anInt424 + (local16 & 0x7);
							local35 = arg0.method496();
							local39 = local35 >> 2;
							local43 = local35 & 0x3;
							local48 = this.anIntArray93[local39];
							local53 = arg0.method498();
							local143 = arg0.method498();
							local155 = arg0.method498();
							local169 = arg0.method498();
							@Pc(919) byte local919 = arg0.method497();
							@Pc(922) byte local922 = arg0.method497();
							@Pc(925) byte local925 = arg0.method497();
							@Pc(928) byte local928 = arg0.method497();
							@Pc(934) Class1_Sub1_Sub1_Sub1_Sub2 local934;
							if (local169 == this.anInt421) {
								local934 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
							} else {
								local934 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local169];
							}
							if (local934 != null) {
								@Pc(946) Class9 local946 = Class9.method258(local53);
								@Pc(956) int local956 = this.anIntArrayArrayArray3[this.anInt419][local25][local32];
								@Pc(968) int local968 = this.anIntArrayArrayArray3[this.anInt419][local25 + 1][local32];
								@Pc(982) int local982 = this.anIntArrayArrayArray3[this.anInt419][local25 + 1][local32 + 1];
								@Pc(994) int local994 = this.anIntArrayArrayArray3[this.anInt419][local25][local32 + 1];
								@Pc(1004) Class1_Sub1_Sub1_Sub5 local1004 = local946.method264(local39, local43, local956, local968, local982, local994, -1);
								if (local1004 != null) {
									this.method127(-1, local48, this.anInt419, 0, local32, local143 + 1, local155 + 1, local25, 0);
									local934.anInt179 = local143 + anInt367;
									local934.anInt180 = local155 + anInt367;
									local934.aClass1_Sub1_Sub1_Sub5_1 = local1004;
									@Pc(1039) int local1039 = local946.anInt523;
									@Pc(1042) int local1042 = local946.anInt524;
									if (local43 == 1 || local43 == 3) {
										local1039 = local946.anInt524;
										local1042 = local946.anInt523;
									}
									local934.anInt181 = local25 * 128 + local1039 * 64;
									local934.anInt183 = local32 * 128 + local1042 * 64;
									local934.anInt182 = this.method197(local934.anInt183, this.anInt419, local934.anInt181, (byte) 2);
									@Pc(1088) byte local1088;
									if (local919 > local925) {
										local1088 = local919;
										local919 = local925;
										local925 = local1088;
									}
									if (local922 > local928) {
										local1088 = local922;
										local922 = local928;
										local928 = local1088;
									}
									local934.anInt184 = local25 + local919;
									local934.anInt186 = local25 + local925;
									local934.anInt185 = local32 + local922;
									local934.anInt187 = local32 + local928;
								}
							}
						}
						if (arg1 == 151) {
							local16 = arg0.method496();
							local25 = this.anInt423 + (local16 >> 4 & 0x7);
							local32 = this.anInt424 + (local16 & 0x7);
							local35 = arg0.method498();
							local39 = arg0.method498();
							local43 = arg0.method498();
							if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
								@Pc(1172) Class31 local1172 = this.aClass31ArrayArrayArray1[this.anInt419][local25][local32];
								if (local1172 != null) {
									for (@Pc(1178) Class1_Sub1_Sub1_Sub3 local1178 = (Class1_Sub1_Sub1_Sub3) local1172.method524(); local1178 != null; local1178 = (Class1_Sub1_Sub1_Sub3) local1172.method526()) {
										if (local1178.anInt490 == (local35 & 0x7FFF) && local1178.anInt491 == local39) {
											local1178.anInt491 = local43;
											break;
										}
									}
									this.method105(local25, local32);
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1208) RuntimeException local1208) {
			signlink.reporterror("75486, " + arg0 + ", " + 3 + ", " + arg1 + ", " + local1208.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method175() {
		try {
			this.aBoolean70 = false;
			while (this.aBoolean46) {
				this.aBoolean70 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass1_Sub1_Sub2_Sub3_19 = null;
			this.aClass1_Sub1_Sub2_Sub3_20 = null;
			this.aClass1_Sub1_Sub2_Sub3Array2 = null;
			this.anIntArray51 = null;
			this.anIntArray52 = null;
			this.anIntArray53 = null;
			this.anIntArray54 = null;
			this.anIntArray90 = null;
			this.anIntArray91 = null;
			this.anIntArray60 = null;
			this.anIntArray61 = null;
			this.aClass1_Sub1_Sub2_Sub2_9 = null;
			this.aClass1_Sub1_Sub2_Sub2_10 = null;
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("73506, " + false + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method176() {
		try {
			if (super.anInt237 == 1) {
				if (super.anInt238 >= 6 && super.anInt238 <= 106 && super.anInt239 >= 467 && super.anInt239 <= 499) {
					this.anInt358 = (this.anInt358 + 1) % 4;
					this.aBoolean65 = true;
					this.aBoolean68 = true;
					this.aClass1_Sub1_Sub3_2.method485(8);
					this.aClass1_Sub1_Sub3_2.method486(this.anInt358);
					this.aClass1_Sub1_Sub3_2.method486(this.anInt416);
					this.aClass1_Sub1_Sub3_2.method486(this.anInt386);
				}
				if (super.anInt238 >= 135 && super.anInt238 <= 235 && super.anInt239 >= 467 && super.anInt239 <= 499) {
					this.anInt416 = (this.anInt416 + 1) % 3;
					this.aBoolean65 = true;
					this.aBoolean68 = true;
					this.aClass1_Sub1_Sub3_2.method485(8);
					this.aClass1_Sub1_Sub3_2.method486(this.anInt358);
					this.aClass1_Sub1_Sub3_2.method486(this.anInt416);
					this.aClass1_Sub1_Sub3_2.method486(this.anInt386);
				}
				if (super.anInt238 >= 273 && super.anInt238 <= 373 && super.anInt239 >= 467 && super.anInt239 <= 499) {
					this.anInt386 = (this.anInt386 + 1) % 3;
					this.aBoolean65 = true;
					this.aBoolean68 = true;
					this.aClass1_Sub1_Sub3_2.method485(8);
					this.aClass1_Sub1_Sub3_2.method486(this.anInt358);
					this.aClass1_Sub1_Sub3_2.method486(this.anInt416);
					this.aClass1_Sub1_Sub3_2.method486(this.anInt386);
				}
				if (super.anInt238 >= 412 && super.anInt238 <= 512 && super.anInt239 >= 467 && super.anInt239 <= 499) {
					this.method188();
					this.aString17 = "";
					this.aBoolean44 = false;
					for (@Pc(185) int local185 = 0; local185 < Class6.aClass6Array1.length; local185++) {
						if (Class6.aClass6Array1[local185] != null && Class6.aClass6Array1[local185].anInt462 == 600) {
							this.anInt430 = this.anInt254 = Class6.aClass6Array1[local185].anInt459;
							return;
						}
					}
					return;
				}
			}
		} catch (@Pc(214) RuntimeException local214) {
			signlink.reporterror("97788, " + -34 + ", " + local214.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt384 = Integer.parseInt(this.getParameter("nodeid"));
		anInt385 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method162(856);
		} else {
			method141(271);
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean66 = false;
		} else {
			aBoolean66 = true;
		}
		this.method86();
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method177(@OriginalArg(0) int arg0) {
		try {
			if (!aBoolean67) {
				@Pc(17) Class1_Sub1_Sub2_Sub3 local17;
				@Pc(25) int local25;
				@Pc(33) int local33;
				@Pc(36) byte[] local36;
				@Pc(39) byte[] local39;
				@Pc(41) int local41;
				if (Class1_Sub1_Sub2_Sub1.anIntArray186[17] >= arg0) {
					local17 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[17];
					local25 = local17.anInt719 * local17.anInt720 - 1;
					local33 = local17.anInt719 * this.anInt296 * 2;
					local36 = local17.aByteArray7;
					local39 = this.aByteArray2;
					for (local41 = 0; local41 <= local25; local41++) {
						local39[local41] = local36[local41 - local33 & local25];
					}
					local17.aByteArray7 = local39;
					this.aByteArray2 = local36;
					Class1_Sub1_Sub2_Sub1.method375(17);
				}
				if (Class1_Sub1_Sub2_Sub1.anIntArray186[24] >= arg0) {
					local17 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[24];
					local25 = local17.anInt719 * local17.anInt720 - 1;
					local33 = local17.anInt719 * this.anInt296 * 2;
					local36 = local17.aByteArray7;
					local39 = this.aByteArray2;
					for (local41 = 0; local41 <= local25; local41++) {
						local39[local41] = local36[local41 - local33 & local25];
					}
					local17.aByteArray7 = local39;
					this.aByteArray2 = local36;
					Class1_Sub1_Sub2_Sub1.method375(24);
					return;
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("4947, " + arg0 + ", " + 744 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method178() {
		try {
			if (this.anInt410 > 0) {
				this.method225();
			} else {
				this.aClass37_14.method574(this.aByte9);
				this.aClass1_Sub1_Sub2_Sub4_2.method463(0, 257, 144, "Connection lost");
				this.aClass1_Sub1_Sub2_Sub4_2.method463(16777215, 256, 143, "Connection lost");
				this.aClass1_Sub1_Sub2_Sub4_2.method463(0, 257, 159, "Please wait - attempting to reestablish");
				this.aClass1_Sub1_Sub2_Sub4_2.method463(16777215, 256, 158, "Please wait - attempting to reestablish");
				this.aClass37_14.method575(4, super.aGraphics2, 4);
				this.anInt287 = 0;
				@Pc(65) Class8 local65 = this.aClass8_1;
				this.aBoolean55 = false;
				this.method222(this.aString5, this.aString6, true);
				if (!this.aBoolean55) {
					this.method225();
				}
				try {
					local65.method244();
				} catch (@Pc(85) Exception local85) {
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("35340, " + 22095 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method179() {
		try {
			@Pc(7) byte[] local7 = this.aClass46_1.method674("title.dat", null);
			@Pc(13) Class1_Sub1_Sub2_Sub2 local13 = new Class1_Sub1_Sub2_Sub2(local7, this);
			this.aClass37_19.method574(this.aByte9);
			local13.method402(0, 0);
			this.aClass37_20.method574(this.aByte9);
			local13.method402(-637, 0);
			this.aClass37_16.method574(this.aByte9);
			local13.method402(-128, 0);
			this.aClass37_17.method574(this.aByte9);
			local13.method402(-202, -371);
			this.aClass37_18.method574(this.aByte9);
			local13.method402(-202, -171);
			this.aClass37_21.method574(this.aByte9);
			local13.method402(0, -265);
			this.aClass37_22.method574(this.aByte9);
			local13.method402(-562, -265);
			this.aClass37_23.method574(this.aByte9);
			local13.method402(-128, -171);
			this.aClass37_24.method574(this.aByte9);
			local13.method402(-562, -171);
			@Pc(113) int[] local113 = new int[local13.anInt687];
			for (@Pc(115) int local115 = 0; local115 < local13.anInt688; local115++) {
				for (@Pc(119) int local119 = 0; local119 < local13.anInt687; local119++) {
					local113[local119] = local13.anIntArray209[local13.anInt687 + local13.anInt687 * local115 - local119 - 1];
				}
				for (@Pc(145) int local145 = 0; local145 < local13.anInt687; local145++) {
					local13.anIntArray209[local145 + local13.anInt687 * local115] = local113[local145];
				}
			}
			this.aClass37_19.method574(this.aByte9);
			local13.method402(382, 0);
			this.aClass37_20.method574(this.aByte9);
			local13.method402(-255, 0);
			this.aClass37_16.method574(this.aByte9);
			local13.method402(254, 0);
			this.aClass37_17.method574(this.aByte9);
			local13.method402(180, -371);
			this.aClass37_18.method574(this.aByte9);
			local13.method402(180, -171);
			this.aClass37_21.method574(this.aByte9);
			local13.method402(382, -265);
			this.aClass37_22.method574(this.aByte9);
			local13.method402(-180, -265);
			this.aClass37_23.method574(this.aByte9);
			local13.method402(254, -171);
			this.aClass37_24.method574(this.aByte9);
			local13.method402(-180, -171);
			local13 = new Class1_Sub1_Sub2_Sub2(this.aClass46_1, "logo", 0);
			this.aClass37_16.method574(this.aByte9);
			local13.method404(382 - local13.anInt687 / 2 - 128, 18);
			System.gc();
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("91206, " + 4 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;I)V")
	@Override
	protected void method97(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt334 = arg1;
			this.aString18 = arg0;
			this.method148();
			if (this.aClass46_1 == null) {
				super.method97(arg0, arg1);
			} else {
				this.aClass37_18.method574(this.aByte9);
				this.aClass1_Sub1_Sub2_Sub4_3.method463(16777215, 180, 54, "RuneScape is loading - please wait...");
				Class1_Sub1_Sub2.method457(28, 34, 62, 304, 9179409);
				Class1_Sub1_Sub2.method457(29, 32, 63, 302, 0);
				Class1_Sub1_Sub2.method456(64, 30, 30, arg1 * 3, 9179409);
				Class1_Sub1_Sub2.method456(64, 30, arg1 * 3 + 30, 300 - arg1 * 3, 0);
				this.aClass1_Sub1_Sub2_Sub4_3.method463(16777215, 180, 85, arg0);
				this.aClass37_18.method575(202, super.aGraphics2, 171);
				if (this.aBoolean69) {
					this.aBoolean69 = false;
					if (!this.aBoolean70) {
						this.aClass37_19.method575(0, super.aGraphics2, 0);
						this.aClass37_20.method575(637, super.aGraphics2, 0);
					}
					this.aClass37_16.method575(128, super.aGraphics2, 0);
					this.aClass37_17.method575(202, super.aGraphics2, 371);
					this.aClass37_21.method575(0, super.aGraphics2, 265);
					this.aClass37_22.method575(562, super.aGraphics2, 265);
					this.aClass37_23.method575(128, super.aGraphics2, 171);
					this.aClass37_24.method575(562, super.aGraphics2, 171);
				}
			}
		} catch (@Pc(217) RuntimeException local217) {
			signlink.reporterror("86225, " + 7 + ", " + arg0 + ", " + arg1 + ", " + local217.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method180(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				this.aClass31ArrayArrayArray1 = null;
			}
			for (@Pc(8) int local8 = 0; local8 < this.anInt433; local8++) {
				if (this.anIntArray92[local8] <= 0) {
					@Pc(17) boolean local17 = false;
					try {
						if (this.anIntArray34[local8] != this.anInt335 || this.anIntArray88[local8] != this.anInt415) {
							@Pc(50) Class1_Sub1_Sub3 local50 = Class5.method80(this.anIntArray34[local8], this.anIntArray88[local8]);
							if (System.currentTimeMillis() + (long) (local50.anInt778 / 22) > this.aLong16 + (long) (this.anInt439 / 22)) {
								this.anInt439 = local50.anInt778;
								this.aLong16 = System.currentTimeMillis();
								if (this.method102(local50.anInt778, local50.aByteArray9)) {
									this.anInt335 = this.anIntArray34[local8];
									this.anInt415 = this.anIntArray88[local8];
								} else {
									local17 = true;
								}
							}
						} else if (!this.method196()) {
							local17 = true;
						}
					} catch (@Pc(100) Exception local100) {
					}
					if (local17 && this.anIntArray92[local8] != -5) {
						this.anIntArray92[local8] = -5;
					} else {
						this.anInt433--;
						for (@Pc(116) int local116 = local8; local116 < this.anInt433; local116++) {
							this.anIntArray34[local116] = this.anIntArray34[local116 + 1];
							this.anIntArray88[local116] = this.anIntArray88[local116 + 1];
							this.anIntArray92[local116] = this.anIntArray92[local116 + 1];
						}
						local8--;
					}
				} else {
					@Pc(168) int local168 = this.anIntArray92[local8]--;
				}
			}
			if (this.anInt285 > 0) {
				this.anInt285 -= 20;
				if (this.anInt285 < 0) {
					this.anInt285 = 0;
				}
				if (this.anInt285 == 0 && this.aBoolean72 && !aBoolean67) {
					this.anInt319 = this.anInt250;
					this.aBoolean54 = false;
					this.aClass43_Sub1_1.method653(2, this.anInt319);
					return;
				}
			}
		} catch (@Pc(214) RuntimeException local214) {
			signlink.reporterror("60107, " + arg0 + ", " + local214.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method181() {
		try {
			this.anInt447++;
			this.method129(true);
			this.method199();
			this.method129(false);
			this.method216();
			this.method224();
			@Pc(30) int local30;
			@Pc(69) int local69;
			@Pc(116) int local116;
			if (!this.aBoolean56) {
				local30 = this.anInt255;
				if (this.anInt398 / 256 > local30) {
					local30 = this.anInt398 / 256;
				}
				if (this.aBooleanArray4[4] && this.anIntArray43[4] + 128 > local30) {
					local30 = this.anIntArray43[4] + 128;
				}
				local69 = this.anInt256 + this.anInt342 & 0x7FF;
				this.method121(local30, this.method197(aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129, this.anInt419, aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128, (byte) 2) - 50, this.anInt341, this.anInt340, local69, local30 * 3 + 600);
				anInt422++;
				if (anInt422 > 1802) {
					anInt422 = 0;
					this.aClass1_Sub1_Sub3_2.method485(223);
					this.aClass1_Sub1_Sub3_2.method486(0);
					local116 = this.aClass1_Sub1_Sub3_2.anInt778;
					this.aClass1_Sub1_Sub3_2.method487(29711);
					this.aClass1_Sub1_Sub3_2.method486(70);
					this.aClass1_Sub1_Sub3_2.method486((int) (Math.random() * 256.0D));
					this.aClass1_Sub1_Sub3_2.method486(242);
					this.aClass1_Sub1_Sub3_2.method486(186);
					this.aClass1_Sub1_Sub3_2.method486(39);
					this.aClass1_Sub1_Sub3_2.method486(61);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub3_2.method486(13);
					}
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub3_2.method487(57856);
					}
					this.aClass1_Sub1_Sub3_2.method487((int) (Math.random() * 65536.0D));
					this.aClass1_Sub1_Sub3_2.method495(this.aClass1_Sub1_Sub3_2.anInt778 - local116);
				}
			}
			if (this.aBoolean56) {
				local30 = this.method190();
			} else {
				local30 = this.method189();
			}
			local69 = this.anInt306;
			local116 = this.anInt307;
			@Pc(203) int local203 = this.anInt308;
			@Pc(206) int local206 = this.anInt309;
			@Pc(209) int local209 = this.anInt310;
			@Pc(258) int local258;
			for (@Pc(211) int local211 = 0; local211 < 5; local211++) {
				if (this.aBooleanArray4[local211]) {
					local258 = (int) (Math.random() * (double) (this.anIntArray44[local211] * 2 + 1) - (double) this.anIntArray44[local211] + Math.sin((double) this.anIntArray47[local211] * ((double) this.anIntArray63[local211] / 100.0D)) * (double) this.anIntArray43[local211]);
					if (local211 == 0) {
						this.anInt306 += local258;
					}
					if (local211 == 1) {
						this.anInt307 += local258;
					}
					if (local211 == 2) {
						this.anInt308 += local258;
					}
					if (local211 == 3) {
						this.anInt310 = this.anInt310 + local258 & 0x7FF;
					}
					if (local211 == 4) {
						this.anInt309 += local258;
						if (this.anInt309 < 128) {
							this.anInt309 = 128;
						}
						if (this.anInt309 > 383) {
							this.anInt309 = 383;
						}
					}
				}
			}
			local258 = Class1_Sub1_Sub2_Sub1.anInt668;
			Class1_Sub1_Sub1_Sub5.aBoolean123 = true;
			Class1_Sub1_Sub1_Sub5.anInt566 = 0;
			Class1_Sub1_Sub1_Sub5.anInt564 = super.anInt232 - 4;
			Class1_Sub1_Sub1_Sub5.anInt565 = super.anInt233 - 4;
			Class1_Sub1_Sub2.method454();
			this.aClass38_1.method617(this.anInt389, this.anInt309, this.anInt306, this.anInt307, this.anInt310, this.anInt308, local30);
			this.aClass38_1.method592();
			this.method152(326);
			this.method166();
			this.method177(local258);
			this.method101();
			this.aClass37_14.method575(4, super.aGraphics2, 4);
			this.anInt306 = local69;
			this.anInt307 = local116;
			this.anInt308 = local203;
			this.anInt309 = local206;
			this.anInt310 = local209;
		} catch (@Pc(405) RuntimeException local405) {
			signlink.reporterror("1004, " + 9 + ", " + local405.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!jb;II)V")
	private void method182(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub2 arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(7) int local7 = this.anInt256 + this.anInt248 & 0x7FF;
			@Pc(15) int local15 = arg0 * arg0 + arg2 * arg2;
			if (local15 <= 6400) {
				@Pc(23) int local23 = Class1_Sub1_Sub1_Sub5.anIntArray157[local7];
				@Pc(27) int local27 = Class1_Sub1_Sub1_Sub5.anIntArray158[local7];
				@Pc(36) int local36 = local23 * 256 / (this.anInt372 + 256);
				@Pc(58) int local58 = local27 * 256 / (this.anInt372 + 256);
				@Pc(68) int local68 = arg2 * local36 + arg0 * local58 >> 16;
				@Pc(78) int local78 = arg2 * local58 - arg0 * local36 >> 16;
				if (local15 > 2500) {
					arg1.method410(local68 + 94 + 4 - arg1.anInt691 / 2, this.aClass1_Sub1_Sub2_Sub3_9, 83 - local78 - arg1.anInt692 / 2 - 4);
				} else {
					arg1.method404(local68 + 94 + 4 - arg1.anInt691 / 2, 83 - local78 - arg1.anInt692 / 2 - 4);
				}
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("92552, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 5 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method183() {
		try {
			@Pc(8) int local8;
			if (this.anInt431 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt431 > 768) {
						this.anIntArray51[local8] = this.method103(1024 - this.anInt431, this.anIntArray52[local8], this.anIntArray53[local8]);
					} else if (this.anInt431 > 256) {
						this.anIntArray51[local8] = this.anIntArray53[local8];
					} else {
						this.anIntArray51[local8] = this.method103(256 - this.anInt431, this.anIntArray53[local8], this.anIntArray52[local8]);
					}
				}
			} else if (this.anInt432 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt432 > 768) {
						this.anIntArray51[local8] = this.method103(1024 - this.anInt432, this.anIntArray52[local8], this.anIntArray54[local8]);
					} else if (this.anInt432 > 256) {
						this.anIntArray51[local8] = this.anIntArray54[local8];
					} else {
						this.anIntArray51[local8] = this.method103(256 - this.anInt432, this.anIntArray54[local8], this.anIntArray52[local8]);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray51[local8] = this.anIntArray52[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass37_19.anIntArray235[local8] = this.aClass1_Sub1_Sub2_Sub2_9.anIntArray209[local8];
			}
			@Pc(181) int local181 = 0;
			@Pc(183) int local183 = 1152;
			@Pc(198) int local198;
			@Pc(202) int local202;
			@Pc(212) int local212;
			@Pc(220) int local220;
			@Pc(224) int local224;
			@Pc(228) int local228;
			@Pc(239) int local239;
			for (@Pc(185) int local185 = 1; local185 < 255; local185++) {
				local198 = this.anIntArray48[local185] * (256 - local185) / 256;
				local202 = local198 + 22;
				if (local202 < 0) {
					local202 = 0;
				}
				local181 += local202;
				for (local212 = local202; local212 < 128; local212++) {
					local220 = this.anIntArray60[local181++];
					if (local220 == 0) {
						local183++;
					} else {
						local224 = local220;
						local228 = 256 - local220;
						local220 = this.anIntArray51[local220];
						local239 = this.aClass37_19.anIntArray235[local183];
						this.aClass37_19.anIntArray235[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			this.aClass37_19.method575(0, super.aGraphics2, 0);
			for (local198 = 0; local198 < 33920; local198++) {
				this.aClass37_20.anIntArray235[local198] = this.aClass1_Sub1_Sub2_Sub2_10.anIntArray209[local198];
			}
			local181 = 0;
			local183 = 1176;
			for (local202 = 1; local202 < 255; local202++) {
				local212 = this.anIntArray48[local202] * (256 - local202) / 256;
				local220 = 103 - local212;
				local183 += local212;
				for (local224 = 0; local224 < local220; local224++) {
					local228 = this.anIntArray60[local181++];
					if (local228 == 0) {
						local183++;
					} else {
						local239 = local228;
						@Pc(362) int local362 = 256 - local228;
						local228 = this.anIntArray51[local228];
						@Pc(373) int local373 = this.aClass37_20.anIntArray235[local183];
						this.aClass37_20.anIntArray235[local183++] = ((local228 & 0xFF00FF) * local239 + (local373 & 0xFF00FF) * local362 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local373 & 0xFF00) * local362 & 0xFF0000) >> 8;
					}
				}
				local181 += 128 - local220;
				local183 += 128 - local220 - local212;
			}
			this.aClass37_20.method575(637, super.aGraphics2, 0);
		} catch (@Pc(450) RuntimeException local450) {
			signlink.reporterror("37828, " + -576 + ", " + local450.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method184() {
		try {
			this.anInt406 += 0;
			@Pc(17) int local17;
			@Pc(24) int local24;
			if (this.anInt397 == 0) {
				local17 = super.anInt228 / 2 - 80;
				local24 = super.anInt229 / 2 + 20;
				local24 += 20;
				if (super.anInt237 == 1 && super.anInt238 >= local17 - 75 && super.anInt238 <= local17 + 75 && super.anInt239 >= local24 - 20 && super.anInt239 <= local24 + 20) {
					this.anInt397 = 3;
					this.anInt259 = 0;
				}
				local17 = super.anInt228 / 2 + 80;
				if (super.anInt237 == 1 && super.anInt238 >= local17 - 75 && super.anInt238 <= local17 + 75 && super.anInt239 >= local24 - 20 && super.anInt239 <= local24 + 20) {
					this.aString15 = "";
					this.aString16 = "Enter your username & password.";
					this.anInt397 = 2;
					this.anInt259 = 0;
				}
			} else if (this.anInt397 == 2) {
				local17 = super.anInt229 / 2 - 40;
				local17 += 30;
				local17 += 25;
				if (super.anInt237 == 1 && super.anInt239 >= local17 - 15 && super.anInt239 < local17) {
					this.anInt259 = 0;
				}
				local17 += 15;
				if (super.anInt237 == 1 && super.anInt239 >= local17 - 15 && super.anInt239 < local17) {
					this.anInt259 = 1;
				}
				local17 += 15;
				local24 = super.anInt228 / 2 - 80;
				@Pc(170) int local170 = super.anInt229 / 2 + 50;
				@Pc(171) int local171 = local170 + 20;
				if (super.anInt237 == 1 && super.anInt238 >= local24 - 75 && super.anInt238 <= local24 + 75 && super.anInt239 >= local171 - 20 && super.anInt239 <= local171 + 20) {
					this.method222(this.aString5, this.aString6, false);
					if (this.aBoolean55) {
						return;
					}
				}
				local24 = super.anInt228 / 2 + 80;
				if (super.anInt237 == 1 && super.anInt238 >= local24 - 75 && super.anInt238 <= local24 + 75 && super.anInt239 >= local171 - 20 && super.anInt239 <= local171 + 20) {
					this.anInt397 = 0;
					this.aString5 = "";
					this.aString6 = "";
				}
				while (true) {
					while (true) {
						@Pc(258) int local258 = this.method89();
						if (local258 == -1) {
							return;
						}
						@Pc(263) boolean local263 = false;
						for (@Pc(265) int local265 = 0; local265 < aString11.length(); local265++) {
							if (local258 == aString11.charAt(local265)) {
								local263 = true;
								break;
							}
						}
						if (this.anInt259 == 0) {
							if (local258 == 8 && this.aString5.length() > 0) {
								this.aString5 = this.aString5.substring(0, this.aString5.length() - 1);
							}
							if (local258 == 9 || local258 == 10 || local258 == 13) {
								this.anInt259 = 1;
							}
							if (local263) {
								this.aString5 = this.aString5 + (char) local258;
							}
							if (this.aString5.length() > 12) {
								this.aString5 = this.aString5.substring(0, 12);
							}
						} else if (this.anInt259 == 1) {
							if (local258 == 8 && this.aString6.length() > 0) {
								this.aString6 = this.aString6.substring(0, this.aString6.length() - 1);
							}
							if (local258 == 9 || local258 == 10 || local258 == 13) {
								this.anInt259 = 0;
							}
							if (local263) {
								this.aString6 = this.aString6 + (char) local258;
							}
							if (this.aString6.length() > 20) {
								this.aString6 = this.aString6.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt397 == 3) {
				local17 = super.anInt228 / 2;
				local24 = super.anInt229 / 2 + 50;
				@Pc(422) int local422 = local24 + 20;
				if (super.anInt237 == 1 && super.anInt238 >= local17 - 75 && super.anInt238 <= local17 + 75 && super.anInt239 >= local422 - 20 && super.anInt239 <= local422 + 20) {
					this.anInt397 = 0;
					return;
				}
			}
		} catch (@Pc(455) RuntimeException local455) {
			signlink.reporterror("45267, " + 0 + ", " + local455.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method185(@OriginalArg(0) int arg0) {
		try {
			this.aClass37_13.method574(this.aByte9);
			@Pc(14) int local14 = this.anInt256 + this.anInt248 & 0x7FF;
			@Pc(21) int local21 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 / 32 + 48;
			@Pc(28) int local28 = 464 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 / 32;
			this.aClass1_Sub1_Sub2_Sub2_8.method408(this.anIntArray77, this.anIntArray45, this.anInt372 + 256, 5, local21, 151, local28, 146, local14, 25);
			this.aClass1_Sub1_Sub2_Sub2_11.method408(this.anIntArray39, this.anIntArray73, 256, 0, 25, 33, 25, 33, this.anInt256, 0);
			for (@Pc(66) int local66 = 0; local66 < this.anInt317; local66++) {
				local21 = this.anIntArray49[local66] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 / 32;
				local28 = this.anIntArray50[local66] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 / 32;
				this.method182(local21, this.aClass1_Sub1_Sub2_Sub2Array6[local66], local28);
			}
			@Pc(116) int local116;
			for (@Pc(112) int local112 = 0; local112 < 104; local112++) {
				for (local116 = 0; local116 < 104; local116++) {
					@Pc(128) Class31 local128 = this.aClass31ArrayArrayArray1[this.anInt419][local112][local116];
					if (local128 != null) {
						local21 = local112 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 / 32;
						local28 = local116 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 / 32;
						this.method182(local21, this.aClass1_Sub1_Sub2_Sub2_2, local28);
					}
				}
			}
			for (local116 = 0; local116 < this.anInt382; local116++) {
				@Pc(179) Class1_Sub1_Sub1_Sub1_Sub1 local179 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray74[local116]];
				if (local179 != null && local179.method49(this.aByte13) && local179.aClass13_1.aBoolean131) {
					local21 = local179.anInt128 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 / 32;
					local28 = local179.anInt129 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 / 32;
					this.method182(local21, this.aClass1_Sub1_Sub2_Sub2_3, local28);
				}
			}
			@Pc(234) Class1_Sub1_Sub1_Sub1_Sub2 local234;
			for (@Pc(224) int local224 = 0; local224 < this.anInt404; local224++) {
				local234 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray78[local224]];
				if (local234 != null && local234.method49(this.aByte13)) {
					local21 = local234.anInt128 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 / 32;
					local28 = local234.anInt129 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 / 32;
					@Pc(263) boolean local263 = false;
					@Pc(267) long local267 = Class47.method675(local234.aString4);
					for (@Pc(269) int local269 = 0; local269 < this.anInt331; local269++) {
						if (local267 == this.aLongArray3[local269] && this.anIntArray64[local269] != 0) {
							local263 = true;
							break;
						}
					}
					if (local263) {
						this.method182(local21, this.aClass1_Sub1_Sub2_Sub2_5, local28);
					} else {
						this.method182(local21, this.aClass1_Sub1_Sub2_Sub2_4, local28);
					}
				}
			}
			if (this.anInt441 != 0 && anInt367 % 20 < 10) {
				if (this.anInt441 == 1 && this.anInt279 >= 0 && this.anInt279 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length) {
					@Pc(342) Class1_Sub1_Sub1_Sub1_Sub1 local342 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anInt279];
					if (local342 != null) {
						local21 = local342.anInt128 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 / 32;
						local28 = local342.anInt129 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 / 32;
						this.method159(local28, this.aClass1_Sub1_Sub2_Sub2_7, local21);
					}
				}
				if (this.anInt441 == 2) {
					local21 = (this.anInt289 - this.anInt281) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 / 32;
					local28 = (this.anInt290 - this.anInt282) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 / 32;
					this.method159(local28, this.aClass1_Sub1_Sub2_Sub2_7, local21);
				}
				if (this.anInt441 == 10 && this.anInt427 >= 0 && this.anInt427 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length) {
					local234 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anInt427];
					if (local234 != null) {
						local21 = local234.anInt128 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 / 32;
						local28 = local234.anInt129 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 / 32;
						this.method159(local28, this.aClass1_Sub1_Sub2_Sub2_7, local21);
					}
				}
			}
			if (this.anInt287 != 0) {
				local21 = this.anInt287 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 / 32;
				local28 = this.anInt288 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 / 32;
				this.method182(local21, this.aClass1_Sub1_Sub2_Sub2_6, local28);
			}
			Class1_Sub1_Sub2.method456(78, 3, 97, 3, 16777215);
			@Pc(505) boolean local505 = false;
			this.aClass37_14.method574(this.aByte9);
		} catch (@Pc(512) RuntimeException local512) {
			signlink.reporterror("56513, " + arg0 + ", " + local512.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method186() {
		try {
			signlink.anInt935 = 0;
			signlink.midi = "stop";
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("91961, " + 0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)Ljava/lang/String;")
	private String method187(@OriginalArg(1) int arg0) {
		try {
			this.anInt406 += 0;
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("92645, " + 0 + ", " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
	private void method188() {
		try {
			this.aClass1_Sub1_Sub3_2.method485(245);
			if (this.anInt268 != -1) {
				this.anInt268 = -1;
				this.aBoolean78 = true;
				this.aBoolean58 = false;
				this.aBoolean74 = true;
			}
			if (this.anInt328 != -1) {
				this.anInt328 = -1;
				this.aBoolean68 = true;
				this.aBoolean58 = false;
			}
			this.anInt254 = -1;
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("279, " + -361 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	@Override
	public void method96(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}
		if (signlink.mainapp == null) {
			super.method96(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)I")
	private int method189() {
		try {
			@Pc(3) int local3 = 3;
			if (this.anInt309 < 310) {
				@Pc(18) int local18 = this.anInt306 >> 7;
				@Pc(23) int local23 = this.anInt308 >> 7;
				@Pc(28) int local28 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 >> 7;
				@Pc(33) int local33 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 >> 7;
				if ((this.aByteArrayArrayArray7[this.anInt419][local18][local23] & 0x4) != 0) {
					local3 = this.anInt419;
				}
				@Pc(55) int local55;
				if (local28 > local18) {
					local55 = local28 - local18;
				} else {
					local55 = local18 - local28;
				}
				@Pc(68) int local68;
				if (local33 > local23) {
					local68 = local33 - local23;
				} else {
					local68 = local23 - local33;
				}
				@Pc(83) int local83;
				@Pc(85) int local85;
				if (local55 > local68) {
					local83 = local68 * 65536 / local55;
					local85 = 32768;
					while (local18 != local28) {
						if (local18 < local28) {
							local18++;
						} else if (local18 > local28) {
							local18--;
						}
						if ((this.aByteArrayArrayArray7[this.anInt419][local18][local23] & 0x4) != 0) {
							local3 = this.anInt419;
						}
						local85 += local83;
						if (local85 >= 65536) {
							local85 -= 65536;
							if (local23 < local33) {
								local23++;
							} else if (local23 > local33) {
								local23--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt419][local18][local23] & 0x4) != 0) {
								local3 = this.anInt419;
							}
						}
					}
				} else {
					local83 = local55 * 65536 / local68;
					local85 = 32768;
					while (local23 != local33) {
						if (local23 < local33) {
							local23++;
						} else if (local23 > local33) {
							local23--;
						}
						if ((this.aByteArrayArrayArray7[this.anInt419][local18][local23] & 0x4) != 0) {
							local3 = this.anInt419;
						}
						local85 += local83;
						if (local85 >= 65536) {
							local85 -= 65536;
							if (local18 < local28) {
								local18++;
							} else if (local18 > local28) {
								local18--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt419][local18][local23] & 0x4) != 0) {
								local3 = this.anInt419;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray7[this.anInt419][aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 >> 7][aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 >> 7] & 0x4) != 0) {
				local3 = this.anInt419;
			}
			return local3;
		} catch (@Pc(251) RuntimeException local251) {
			signlink.reporterror("5099, " + -241 + ", " + local251.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)I")
	private int method190() {
		try {
			@Pc(14) int local14 = this.method197(this.anInt308, this.anInt419, this.anInt306, (byte) 2);
			return local14 - this.anInt307 >= 800 || (this.aByteArrayArrayArray7[this.anInt419][this.anInt306 >> 7][this.anInt308 >> 7] & 0x4) == 0 ? 3 : this.anInt419;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("56798, " + false + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IILclient!mb;)V")
	private void method191(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt779 + 21 < arg0 * 8) {
					@Pc(22) int local22 = arg1.method507(13, this.anInt377);
					if (local22 != 8191) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local22] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local22] = new Class1_Sub1_Sub1_Sub1_Sub1();
						}
						@Pc(42) Class1_Sub1_Sub1_Sub1_Sub1 local42 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local22];
						this.anIntArray74[this.anInt382++] = local22;
						local42.anInt168 = anInt367;
						local42.aClass13_1 = Class13.method319(arg1.method507(11, this.anInt377));
						local42.anInt131 = local42.aClass13_1.aByte27;
						local42.anInt134 = local42.aClass13_1.anInt584;
						local42.anInt135 = local42.aClass13_1.anInt585;
						local42.anInt136 = local42.aClass13_1.anInt586;
						local42.anInt137 = local42.aClass13_1.anInt587;
						local42.anInt132 = local42.aClass13_1.anInt583;
						@Pc(100) int local100 = arg1.method507(5, this.anInt377);
						if (local100 > 15) {
							local100 -= 32;
						}
						@Pc(110) int local110 = arg1.method507(5, this.anInt377);
						if (local110 > 15) {
							local110 -= 32;
						}
						local42.method46(aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0] + local100, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0] + local110, false);
						@Pc(136) int local136 = arg1.method507(1, this.anInt377);
						if (local136 == 1) {
							this.anIntArray79[this.anInt405++] = local22;
						}
						continue;
					}
				}
				arg1.method508();
				return;
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("11923, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method94() {
		try {
			this.anInt406 += 0;
			this.aBoolean69 = true;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("19213, " + 0 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!ob;)V")
	private void method192(@OriginalArg(1) Class1_Sub2 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt828 == 0) {
				local1 = this.aClass38_1.method604(arg0.anInt827, arg0.anInt829, arg0.anInt830);
			}
			if (arg0.anInt828 == 1) {
				local1 = this.aClass38_1.method605(arg0.anInt827, arg0.anInt829, arg0.anInt830);
			}
			if (arg0.anInt828 == 2) {
				local1 = this.aClass38_1.method606(arg0.anInt827, arg0.anInt829, arg0.anInt830);
			}
			if (arg0.anInt828 == 3) {
				local1 = this.aClass38_1.method607(arg0.anInt827, arg0.anInt829, arg0.anInt830);
			}
			if (local1 != 0) {
				@Pc(76) int local76 = this.aClass38_1.method608(arg0.anInt827, arg0.anInt829, arg0.anInt830, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local76 & 0x1F;
				local7 = local76 >> 6;
			}
			arg0.anInt831 = local3;
			arg0.anInt833 = local5;
			arg0.anInt832 = local7;
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("4214, " + 6 + ", " + arg0 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)V")
	private void method193(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass1_Sub1_Sub2_Sub2_8.anIntArray209;
			@Pc(8) int local8 = local5.length;
			for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
				local5[local10] = 0;
			}
			@Pc(34) int local34;
			@Pc(36) int local36;
			for (@Pc(22) int local22 = 1; local22 < 103; local22++) {
				local34 = (103 - local22) * 512 * 4 + 24628;
				for (local36 = 1; local36 < 103; local36++) {
					if ((this.aByteArrayArrayArray7[arg0][local36][local22] & 0x18) == 0) {
						this.aClass38_1.method613(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass38_1.method613(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass1_Sub1_Sub2_Sub2_8.method399(this.aByte9);
			@Pc(147) int local147;
			for (@Pc(143) int local143 = 1; local143 < 103; local143++) {
				for (local147 = 1; local147 < 103; local147++) {
					if ((this.aByteArrayArrayArray7[arg0][local147][local143] & 0x18) == 0) {
						this.method123(local147, local143, local36, arg0, local34, this.aByte5);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local147][local143] & 0x8) != 0) {
						this.method123(local147, local143, local36, arg0 + 1, local34, this.aByte5);
					}
				}
			}
			this.aClass37_14.method574(this.aByte9);
			this.anInt317 = 0;
			for (local147 = 0; local147 < 104; local147++) {
				for (@Pc(223) int local223 = 0; local223 < 104; local223++) {
					@Pc(233) int local233 = this.aClass38_1.method607(this.anInt419, local147, local223);
					if (local233 != 0) {
						local233 = local233 >> 14 & 0x7FFF;
						@Pc(245) int local245 = Class9.method258(local233).anInt527;
						if (local245 >= 0) {
							@Pc(249) int local249 = local147;
							@Pc(251) int local251 = local223;
							if (local245 != 22 && local245 != 29 && local245 != 34 && local245 != 36 && local245 != 46 && local245 != 47 && local245 != 48) {
								@Pc(283) int[][] local283 = this.aClass19Array1[this.anInt419].anIntArrayArray17;
								for (@Pc(285) int local285 = 0; local285 < 10; local285++) {
									@Pc(292) int local292 = (int) (Math.random() * 4.0D);
									if (local292 == 0 && local249 > 0 && local249 > local147 - 3 && (local283[local249 - 1][local251] & 0x280108) == 0) {
										local249--;
									}
									if (local292 == 1 && local249 < 103 && local249 < local147 + 3 && (local283[local249 + 1][local251] & 0x280180) == 0) {
										local249++;
									}
									if (local292 == 2 && local251 > 0 && local251 > local223 - 3 && (local283[local249][local251 - 1] & 0x280102) == 0) {
										local251--;
									}
									if (local292 == 3 && local251 < 103 && local251 < local223 + 3 && (local283[local249][local251 + 1] & 0x280120) == 0) {
										local251++;
									}
								}
							}
							this.aClass1_Sub1_Sub2_Sub2Array6[this.anInt317] = this.aClass1_Sub1_Sub2_Sub2Array7[local245];
							this.anIntArray49[this.anInt317] = local249;
							this.anIntArray50[this.anInt317] = local251;
							this.anInt317++;
						}
					}
				}
			}
		} catch (@Pc(422) RuntimeException local422) {
			signlink.reporterror("55104, " + arg0 + ", " + 25805 + ", " + local422.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
	private void method194(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= this.anInt312 && arg0 <= this.anInt312 && super.anInt237 == 1) {
				@Pc(19) int local19 = super.anInt238 - 25 - 550;
				@Pc(26) int local26 = super.anInt239 - 5 - 4;
				if (local19 >= 0 && local26 >= 0 && local19 < 146 && local26 < 151) {
					local19 -= 73;
					local26 -= 75;
					@Pc(46) int local46 = this.anInt256 + this.anInt248 & 0x7FF;
					@Pc(50) int local50 = Class1_Sub1_Sub2_Sub1.anIntArray182[local46];
					@Pc(54) int local54 = Class1_Sub1_Sub2_Sub1.anIntArray183[local46];
					@Pc(63) int local63 = local50 * (this.anInt372 + 256) >> 8;
					@Pc(72) int local72 = local54 * (this.anInt372 + 256) >> 8;
					@Pc(82) int local82 = local26 * local63 + local19 * local72 >> 11;
					@Pc(92) int local92 = local26 * local72 - local19 * local63 >> 11;
					@Pc(99) int local99 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 + local82 >> 7;
					@Pc(106) int local106 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 - local92 >> 7;
					@Pc(127) boolean local127 = this.method100(0, 0, 1, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], 0, 0, local99, true, local106, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0]);
					if (local127) {
						this.aClass1_Sub1_Sub3_2.method486(local19);
						this.aClass1_Sub1_Sub3_2.method486(local26);
						this.aClass1_Sub1_Sub3_2.method487(this.anInt256);
						this.aClass1_Sub1_Sub3_2.method486(57);
						this.aClass1_Sub1_Sub3_2.method486(this.anInt248);
						this.aClass1_Sub1_Sub3_2.method486(this.anInt372);
						this.aClass1_Sub1_Sub3_2.method486(89);
						this.aClass1_Sub1_Sub3_2.method487(aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128);
						this.aClass1_Sub1_Sub3_2.method487(aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129);
						this.aClass1_Sub1_Sub3_2.method486(this.anInt360);
						this.aClass1_Sub1_Sub3_2.method486(63);
						return;
					}
				}
			}
		} catch (@Pc(181) RuntimeException local181) {
			signlink.reporterror("69982, " + arg0 + ", " + local181.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method93() {
		try {
			if (this.aBoolean53 || this.aBoolean63 || this.aBoolean51) {
				this.method132();
			} else {
				anInt446++;
				if (this.aBoolean55) {
					this.method117();
				} else {
					this.method150((byte) 1);
				}
				this.anInt401 = 0;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("63880, " + -25868 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "N", descriptor = "(I)V")
	private void method195() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt404; local3++) {
				if (local3 == -1) {
					local11 = this.anInt403;
				} else {
					local11 = this.anIntArray78[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub2 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local11];
				if (local23 != null) {
					this.method111(this.aByte11, 1, local23);
				}
			}
			anInt453++;
			if (anInt453 > 1406) {
				anInt453 = 0;
				this.aClass1_Sub1_Sub3_2.method485(112);
				this.aClass1_Sub1_Sub3_2.method486(0);
				local11 = this.aClass1_Sub1_Sub3_2.anInt778;
				this.aClass1_Sub1_Sub3_2.method486(162);
				this.aClass1_Sub1_Sub3_2.method486(22);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_2.method486(84);
				}
				this.aClass1_Sub1_Sub3_2.method487(31824);
				this.aClass1_Sub1_Sub3_2.method487(13490);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_2.method486(123);
				}
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_2.method486(134);
				}
				this.aClass1_Sub1_Sub3_2.method486(100);
				this.aClass1_Sub1_Sub3_2.method486(94);
				this.aClass1_Sub1_Sub3_2.method487(35521);
				this.aClass1_Sub1_Sub3_2.method495(this.aClass1_Sub1_Sub3_2.anInt778 - local11);
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("5638, " + 31294 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)Z")
	private boolean method196() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("89487, " + -34 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIB)I")
	private int method197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			@Pc(3) int local3 = arg2 >> 7;
			@Pc(7) int local7 = arg0 >> 7;
			if (local3 < 0 || local7 < 0 || local3 > 103 || local7 > 103) {
				return 0;
			}
			@Pc(21) int local21 = arg1;
			if (arg1 < 3 && (this.aByteArrayArrayArray7[1][local3][local7] & 0x2) == 2) {
				local21 = arg1 + 1;
			}
			@Pc(41) int local41 = arg2 & 0x7F;
			@Pc(45) int local45 = arg0 & 0x7F;
			@Pc(73) int local73 = this.anIntArrayArrayArray3[local21][local3][local7] * (128 - local41) + this.anIntArrayArrayArray3[local21][local3 + 1][local7] * local41 >> 7;
			@Pc(105) int local105 = this.anIntArrayArrayArray3[local21][local3][local7 + 1] * (128 - local41) + this.anIntArrayArrayArray3[local21][local3 + 1][local7 + 1] * local41 >> 7;
			@Pc(110) boolean local110 = false;
			return local73 * (128 - local45) + local105 * local45 >> 7;
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("16226, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ILclient!mb;I)V")
	private void method198(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg0 != -14273) {
				this.aBoolean50 = !this.aBoolean50;
			}
			while (arg1.anInt779 + 10 < arg2 * 8) {
				@Pc(24) int local24 = arg1.method507(11, this.anInt377);
				if (local24 == 2047) {
					break;
				}
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local24] == null) {
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local24] = new Class1_Sub1_Sub1_Sub1_Sub2();
					if (this.aClass1_Sub1_Sub3Array1[local24] != null) {
						this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local24].method51(this.aClass1_Sub1_Sub3Array1[local24], this.anInt413);
					}
				}
				this.anIntArray78[this.anInt404++] = local24;
				@Pc(71) Class1_Sub1_Sub1_Sub1_Sub2 local71 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local24];
				local71.anInt168 = anInt367;
				@Pc(80) int local80 = arg1.method507(5, this.anInt377);
				if (local80 > 15) {
					local80 -= 32;
				}
				@Pc(90) int local90 = arg1.method507(5, this.anInt377);
				if (local90 > 15) {
					local90 -= 32;
				}
				@Pc(100) int local100 = arg1.method507(1, this.anInt377);
				local71.method46(aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0] + local80, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0] + local90, local100 == 1);
				@Pc(127) int local127 = arg1.method507(1, this.anInt377);
				if (local127 == 1) {
					this.anIntArray79[this.anInt405++] = local24;
				}
			}
			arg1.method508();
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("152, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "O", descriptor = "(I)V")
	private void method199() {
		try {
			if (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 >> 7 == this.anInt287 && aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 >> 7 == this.anInt288) {
				this.anInt287 = 0;
			}
			for (@Pc(20) int local20 = -1; local20 < this.anInt404; local20++) {
				@Pc(27) Class1_Sub1_Sub1_Sub1_Sub2 local27;
				@Pc(32) int local32;
				if (local20 == -1) {
					local27 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
					local32 = this.anInt403 << 14;
				} else {
					local27 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray78[local20]];
					local32 = this.anIntArray78[local20] << 14;
				}
				if (local27 != null && local27.method49(this.aByte13)) {
					local27.aBoolean29 = false;
					if ((aBoolean67 && this.anInt404 > 50 || this.anInt404 > 200) && local20 != -1 && local27.anInt148 == local27.anInt132) {
						local27.aBoolean29 = true;
					}
					@Pc(85) int local85 = local27.anInt128 >> 7;
					@Pc(90) int local90 = local27.anInt129 >> 7;
					if (local85 >= 0 && local85 < 104 && local90 >= 0 && local90 < 104) {
						if (local27.aClass1_Sub1_Sub1_Sub5_1 == null || anInt367 < local27.anInt179 || anInt367 >= local27.anInt180) {
							if ((local27.anInt128 & 0x7F) == 64 && (local27.anInt129 & 0x7F) == 64) {
								if (this.anIntArrayArray5[local85][local90] == this.anInt447 && local20 != -1) {
									continue;
								}
								this.anIntArrayArray5[local85][local90] = this.anInt447;
							}
							local27.anInt178 = this.method197(local27.anInt129, this.anInt419, local27.anInt128, (byte) 2);
							this.aClass38_1.method589(60, local27.anInt129, local27.anInt130, local27.anInt128, local32, this.anInt419, local27.aBoolean25, local27.anInt178, local27);
						} else {
							local27.aBoolean29 = false;
							local27.anInt178 = this.method197(local27.anInt129, this.anInt419, local27.anInt128, (byte) 2);
							this.aClass38_1.method590(local27.anInt128, local27.anInt184, local27.anInt187, local27.anInt185, local27.anInt130, local27.anInt186, local27, this.anInt419, local27.anInt178, local32, local27.anInt129);
						}
					}
				}
			}
		} catch (@Pc(229) RuntimeException local229) {
			signlink.reporterror("10637, " + 13283 + ", " + local229.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!d;)Z")
	private boolean method200(@OriginalArg(1) Class6 arg0) {
		try {
			@Pc(11) int local11 = arg0.anInt462;
			if (local11 == 201) {
				this.aBoolean68 = true;
				this.aBoolean43 = false;
				this.aBoolean47 = true;
				this.aString12 = "";
				this.anInt443 = 1;
				this.aString7 = "Enter name of friend to add to list";
			}
			if (local11 == 202) {
				this.aBoolean68 = true;
				this.aBoolean43 = false;
				this.aBoolean47 = true;
				this.aString12 = "";
				this.anInt443 = 2;
				this.aString7 = "Enter name of friend to delete from list";
			}
			if (local11 == 205) {
				this.anInt410 = 250;
				return true;
			}
			if (local11 == 501) {
				this.aBoolean68 = true;
				this.aBoolean43 = false;
				this.aBoolean47 = true;
				this.aString12 = "";
				this.anInt443 = 4;
				this.aString7 = "Enter name of player to add to list";
			}
			if (local11 == 502) {
				this.aBoolean68 = true;
				this.aBoolean43 = false;
				this.aBoolean47 = true;
				this.aString12 = "";
				this.anInt443 = 5;
				this.aString7 = "Enter name of player to delete from list";
			}
			@Pc(115) int local115;
			@Pc(119) int local119;
			@Pc(124) int local124;
			if (local11 >= 300 && local11 <= 313) {
				local115 = (local11 - 300) / 2;
				local119 = local11 & 0x1;
				local124 = this.anIntArray41[local115];
				if (local124 != -1) {
					while (true) {
						if (local119 == 0) {
							local124--;
							if (local124 < 0) {
								local124 = Class23.anInt757 - 1;
							}
						}
						if (local119 == 1) {
							local124++;
							if (local124 >= Class23.anInt757) {
								local124 = 0;
							}
						}
						if (!Class23.aClass23Array1[local124].aBoolean170 && Class23.aClass23Array1[local124].anInt758 == local115 + (this.aBoolean62 ? 0 : 7)) {
							this.anIntArray41[local115] = local124;
							this.aBoolean61 = true;
							break;
						}
					}
				}
			}
			if (local11 >= 314 && local11 <= 323) {
				local115 = (local11 - 314) / 2;
				local119 = local11 & 0x1;
				local124 = this.anIntArray59[local115];
				if (local119 == 0) {
					local124--;
					if (local124 < 0) {
						local124 = anIntArrayArray3[local115].length - 1;
					}
				}
				if (local119 == 1) {
					local124++;
					if (local124 >= anIntArrayArray3[local115].length) {
						local124 = 0;
					}
				}
				this.anIntArray59[local115] = local124;
				this.aBoolean61 = true;
			}
			if (local11 == 324 && !this.aBoolean62) {
				this.aBoolean62 = true;
				this.method167();
			}
			if (local11 == 325 && this.aBoolean62) {
				this.aBoolean62 = false;
				this.method167();
			}
			if (local11 == 326) {
				this.aClass1_Sub1_Sub3_2.method485(150);
				this.aClass1_Sub1_Sub3_2.method486(this.aBoolean62 ? 0 : 1);
				for (local115 = 0; local115 < 7; local115++) {
					this.aClass1_Sub1_Sub3_2.method486(this.anIntArray41[local115]);
				}
				for (local119 = 0; local119 < 5; local119++) {
					this.aClass1_Sub1_Sub3_2.method486(this.anIntArray59[local119]);
				}
				return true;
			}
			if (local11 == 613) {
				this.aBoolean44 = !this.aBoolean44;
			}
			if (local11 >= 601 && local11 <= 612) {
				this.method188();
				if (this.aString17.length() > 0) {
					this.aClass1_Sub1_Sub3_2.method485(205);
					this.aClass1_Sub1_Sub3_2.method492(169, Class47.method675(this.aString17));
					this.aClass1_Sub1_Sub3_2.method486(local11 - 601);
					this.aClass1_Sub1_Sub3_2.method486(this.aBoolean44 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(352) RuntimeException local352) {
			signlink.reporterror("68504, " + 63 + ", " + arg0 + ", " + local352.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method201(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt331 >= 100 && this.anInt442 != 1) {
					this.method106("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
				} else if (this.anInt331 >= 200) {
					this.method106("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
				} else {
					@Pc(38) String local38 = Class47.method679(Class47.method676(arg0));
					for (@Pc(40) int local40 = 0; local40 < this.anInt331; local40++) {
						if (this.aLongArray3[local40] == arg0) {
							this.method106("", 0, local38 + " is already on your friend list");
							return;
						}
					}
					for (@Pc(70) int local70 = 0; local70 < this.anInt333; local70++) {
						if (this.aLongArray4[local70] == arg0) {
							this.method106("", 0, "Please remove " + local38 + " from your ignore list first");
							return;
						}
					}
					if (!local38.equals(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4)) {
						this.aStringArray5[this.anInt331] = local38;
						this.aLongArray3[this.anInt331] = arg0;
						this.anIntArray64[this.anInt331] = 0;
						this.anInt331++;
						this.aBoolean78 = true;
						this.aClass1_Sub1_Sub3_2.method485(116);
						this.aClass1_Sub1_Sub3_2.method492(169, arg0);
					}
				}
			}
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("58661, " + -15246 + ", " + arg0 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIZ)V")
	private void method202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(1) int local1 = 0;
			this.aBoolean55 &= true;
			for (@Pc(9) int local9 = 0; local9 < 100; local9++) {
				if (this.aStringArray3[local9] != null) {
					@Pc(21) int local21 = this.anIntArray56[local9];
					@Pc(32) int local32 = this.anInt311 + 70 + 4 - local1 * 14;
					if (local32 < -20) {
						break;
					}
					@Pc(40) String local40 = this.aStringArray2[local9];
					if (local40 != null && local40.startsWith("@cr1@")) {
						local40 = local40.substring(5);
					}
					if (local40 != null && local40.startsWith("@cr2@")) {
						local40 = local40.substring(5);
					}
					if (local21 == 0) {
						local1++;
					}
					if ((local21 == 1 || local21 == 2) && (local21 == 1 || this.anInt358 == 0 || this.anInt358 == 1 && this.method104(local40))) {
						if (arg1 > local32 - 14 && arg1 <= local32 && !local40.equals(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4)) {
							if (this.anInt399 >= 1) {
								this.aStringArray1[this.anInt251] = "Report abuse @whi@" + local40;
								this.anIntArray83[this.anInt251] = 34;
								this.anInt251++;
							}
							this.aStringArray1[this.anInt251] = "Add ignore @whi@" + local40;
							this.anIntArray83[this.anInt251] = 436;
							this.anInt251++;
							this.aStringArray1[this.anInt251] = "Add friend @whi@" + local40;
							this.anIntArray83[this.anInt251] = 406;
							this.anInt251++;
						}
						local1++;
					}
					if ((local21 == 3 || local21 == 7) && this.anInt286 == 0 && (local21 == 7 || this.anInt416 == 0 || this.anInt416 == 1 && this.method104(local40))) {
						if (arg1 > local32 - 14 && arg1 <= local32) {
							if (this.anInt399 >= 1) {
								this.aStringArray1[this.anInt251] = "Report abuse @whi@" + local40;
								this.anIntArray83[this.anInt251] = 34;
								this.anInt251++;
							}
							this.aStringArray1[this.anInt251] = "Add ignore @whi@" + local40;
							this.anIntArray83[this.anInt251] = 436;
							this.anInt251++;
							this.aStringArray1[this.anInt251] = "Add friend @whi@" + local40;
							this.anIntArray83[this.anInt251] = 406;
							this.anInt251++;
						}
						local1++;
					}
					if (local21 == 4 && (this.anInt386 == 0 || this.anInt386 == 1 && this.method104(local40))) {
						if (arg1 > local32 - 14 && arg1 <= local32) {
							this.aStringArray1[this.anInt251] = "Accept trade @whi@" + local40;
							this.anIntArray83[this.anInt251] = 903;
							this.anInt251++;
						}
						local1++;
					}
					if ((local21 == 5 || local21 == 6) && this.anInt286 == 0 && this.anInt416 < 2) {
						local1++;
					}
					if (local21 == 8 && (this.anInt386 == 0 || this.anInt386 == 1 && this.method104(local40))) {
						if (arg1 > local32 - 14 && arg1 <= local32) {
							this.aStringArray1[this.anInt251] = "Accept duel @whi@" + local40;
							this.anIntArray83[this.anInt251] = 363;
							this.anInt251++;
						}
						local1++;
					}
				}
			}
		} catch (@Pc(405) RuntimeException local405) {
			signlink.reporterror("9686, " + arg0 + ", " + arg1 + ", " + true + ", " + local405.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method92(@OriginalArg(0) int arg0) {
		try {
			signlink.reporterror = false;
			try {
				if (this.aClass8_1 != null) {
					this.aClass8_1.method244();
				}
			} catch (@Pc(11) Exception local11) {
			}
			this.aClass8_1 = null;
			this.method186();
			if (this.aClass11_1 != null) {
				this.aClass11_1.aBoolean124 = false;
			}
			this.aClass11_1 = null;
			this.aClass43_Sub1_1.method645();
			this.aClass43_Sub1_1 = null;
			this.aClass1_Sub1_Sub3_2 = null;
			this.aClass1_Sub1_Sub3_4 = null;
			this.aClass1_Sub1_Sub3_3 = null;
			this.anIntArray85 = null;
			this.aByteArrayArray1 = null;
			this.aByteArrayArray2 = null;
			this.anIntArray86 = null;
			this.anIntArray87 = null;
			this.anIntArrayArrayArray3 = null;
			this.aByteArrayArrayArray7 = null;
			this.aClass38_1 = null;
			this.aClass19Array1 = null;
			this.anIntArrayArray4 = null;
			this.anIntArrayArray2 = null;
			this.anIntArray57 = null;
			this.anIntArray58 = null;
			this.aByteArray2 = null;
			this.aClass37_12 = null;
			this.aClass37_13 = null;
			this.aClass37_14 = null;
			this.aClass37_15 = null;
			this.aClass37_25 = null;
			this.aClass37_26 = null;
			this.aClass37_27 = null;
			this.aClass37_3 = null;
			this.aClass37_4 = null;
			this.aClass37_5 = null;
			this.aClass37_6 = null;
			this.aClass37_7 = null;
			this.aClass37_8 = null;
			this.aClass37_9 = null;
			this.aClass37_10 = null;
			this.aClass37_11 = null;
			this.aClass1_Sub1_Sub2_Sub3_8 = null;
			this.aClass1_Sub1_Sub2_Sub3_9 = null;
			this.aClass1_Sub1_Sub2_Sub3_10 = null;
			this.aClass1_Sub1_Sub2_Sub3_11 = null;
			this.aClass1_Sub1_Sub2_Sub3_12 = null;
			this.aClass1_Sub1_Sub2_Sub3_13 = null;
			this.aClass1_Sub1_Sub2_Sub3Array4 = null;
			this.aClass1_Sub1_Sub2_Sub3_3 = null;
			this.aClass1_Sub1_Sub2_Sub3_4 = null;
			this.aClass1_Sub1_Sub2_Sub3_5 = null;
			this.aClass1_Sub1_Sub2_Sub3_6 = null;
			this.aClass1_Sub1_Sub2_Sub3_7 = null;
			@Pc(172) boolean local172 = false;
			this.aClass1_Sub1_Sub2_Sub3_14 = null;
			this.aClass1_Sub1_Sub2_Sub3_15 = null;
			this.aClass1_Sub1_Sub2_Sub3_16 = null;
			this.aClass1_Sub1_Sub2_Sub3_17 = null;
			this.aClass1_Sub1_Sub2_Sub3_18 = null;
			this.aClass1_Sub1_Sub2_Sub2_11 = null;
			this.aClass1_Sub1_Sub2_Sub2Array5 = null;
			this.aClass1_Sub1_Sub2_Sub2Array4 = null;
			this.aClass1_Sub1_Sub2_Sub2Array3 = null;
			this.aClass1_Sub1_Sub2_Sub2_2 = null;
			this.aClass1_Sub1_Sub2_Sub2_3 = null;
			this.aClass1_Sub1_Sub2_Sub2_4 = null;
			this.aClass1_Sub1_Sub2_Sub2_5 = null;
			this.aClass1_Sub1_Sub2_Sub3Array1 = null;
			this.aClass1_Sub1_Sub2_Sub2Array7 = null;
			this.anIntArrayArray5 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub2Array1 = null;
			this.anIntArray78 = null;
			this.anIntArray79 = null;
			this.aClass1_Sub1_Sub3Array1 = null;
			this.anIntArray89 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub1Array1 = null;
			this.anIntArray74 = null;
			this.aClass31ArrayArrayArray1 = null;
			this.aClass31_3 = null;
			this.aClass31_2 = null;
			this.aClass31_1 = null;
			this.anIntArray81 = null;
			this.anIntArray82 = null;
			this.anIntArray83 = null;
			this.anIntArray84 = null;
			this.aStringArray1 = null;
			this.anIntArray72 = null;
			this.anIntArray49 = null;
			this.anIntArray50 = null;
			this.aClass1_Sub1_Sub2_Sub2Array6 = null;
			this.aClass1_Sub1_Sub2_Sub2_8 = null;
			this.aStringArray5 = null;
			this.aLongArray3 = null;
			this.anIntArray64 = null;
			this.aClass37_19 = null;
			this.aClass37_20 = null;
			this.aClass37_16 = null;
			this.aClass37_17 = null;
			this.aClass37_18 = null;
			this.aClass37_21 = null;
			this.aClass37_22 = null;
			this.aClass37_23 = null;
			this.aClass37_24 = null;
			this.method175();
			Class9.method257((byte) 6);
			Class13.method318((byte) 6);
			Class15.method342((byte) 6);
			Class21.aClass21Array1 = null;
			Class23.aClass23Array1 = null;
			Class6.aClass6Array1 = null;
			Class25.aClass25Array1 = null;
			Class27.aClass27Array1 = null;
			Class29.aClass29Array1 = null;
			Class29.aClass40_9 = null;
			Class32.aClass32Array1 = null;
			super.aClass37_2 = null;
			Class1_Sub1_Sub1_Sub1_Sub2.aClass40_1 = null;
			Class1_Sub1_Sub2_Sub1.method368();
			Class38.method577();
			Class1_Sub1_Sub1_Sub5.method283((byte) 6);
			Class14.method325((byte) 6);
			System.gc();
		} catch (@Pc(368) RuntimeException local368) {
			signlink.reporterror("15986, " + arg0 + ", " + local368.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "P", descriptor = "(I)V")
	private void method203() {
		try {
			if (this.anInt361 == 0 && this.anInt313 == 0) {
				this.aStringArray1[this.anInt251] = "Walk here";
				this.anIntArray83[this.anInt251] = 660;
				this.anIntArray81[this.anInt251] = super.anInt232;
				this.anIntArray82[this.anInt251] = super.anInt233;
				this.anInt251++;
			}
			@Pc(47) int local47 = -1;
			for (@Pc(49) int local49 = 0; local49 < Class1_Sub1_Sub1_Sub5.anInt566; local49++) {
				@Pc(55) int local55 = Class1_Sub1_Sub1_Sub5.anIntArray156[local49];
				@Pc(59) int local59 = local55 & 0x7F;
				@Pc(65) int local65 = local55 >> 7 & 0x7F;
				@Pc(71) int local71 = local55 >> 29 & 0x3;
				@Pc(77) int local77 = local55 >> 14 & 0x7FFF;
				if (local55 != local47) {
					local47 = local55;
					@Pc(215) int local215;
					if (local71 == 2 && this.aClass38_1.method608(this.anInt419, local59, local65, local55) >= 0) {
						@Pc(97) Class9 local97 = Class9.method258(local77);
						if (this.anInt361 == 1) {
							this.aStringArray1[this.anInt251] = "Use " + this.aString13 + " with @cya@" + local97.aString24;
							this.anIntArray83[this.anInt251] = 450;
							this.anIntArray84[this.anInt251] = local55;
							this.anIntArray81[this.anInt251] = local59;
							this.anIntArray82[this.anInt251] = local65;
							this.anInt251++;
						} else if (this.anInt313 != 1) {
							if (local97.aStringArray7 != null) {
								for (local215 = 4; local215 >= 0; local215--) {
									if (local97.aStringArray7[local215] != null) {
										this.aStringArray1[this.anInt251] = local97.aStringArray7[local215] + " @cya@" + local97.aString24;
										if (local215 == 0) {
											this.anIntArray83[this.anInt251] = 285;
										}
										if (local215 == 1) {
											this.anIntArray83[this.anInt251] = 504;
										}
										if (local215 == 2) {
											this.anIntArray83[this.anInt251] = 364;
										}
										if (local215 == 3) {
											this.anIntArray83[this.anInt251] = 581;
										}
										if (local215 == 4) {
											this.anIntArray83[this.anInt251] = 1501;
										}
										this.anIntArray84[this.anInt251] = local55;
										this.anIntArray81[this.anInt251] = local59;
										this.anIntArray82[this.anInt251] = local65;
										this.anInt251++;
									}
								}
							}
							this.aStringArray1[this.anInt251] = "Examine @cya@" + local97.aString24;
							this.anIntArray83[this.anInt251] = 1175;
							this.anIntArray84[this.anInt251] = local55;
							this.anIntArray81[this.anInt251] = local59;
							this.anIntArray82[this.anInt251] = local65;
							this.anInt251++;
						} else if ((this.anInt315 & 0x4) == 4) {
							this.aStringArray1[this.anInt251] = this.aString9 + " @cya@" + local97.aString24;
							this.anIntArray83[this.anInt251] = 55;
							this.anIntArray84[this.anInt251] = local55;
							this.anIntArray81[this.anInt251] = local59;
							this.anIntArray82[this.anInt251] = local65;
							this.anInt251++;
						}
					}
					@Pc(392) Class1_Sub1_Sub1_Sub1_Sub1 local392;
					if (local71 == 1) {
						@Pc(363) Class1_Sub1_Sub1_Sub1_Sub1 local363 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local77];
						if (local363.aClass13_1.aByte27 == 1 && (local363.anInt128 & 0x7F) == 64 && (local363.anInt129 & 0x7F) == 64) {
							for (local215 = 0; local215 < this.anInt382; local215++) {
								local392 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray74[local215]];
								if (local392 != null && local392 != local363 && local392.aClass13_1.aByte27 == 1 && local392.anInt128 == local363.anInt128 && local392.anInt129 == local363.anInt129) {
									this.method149(local59, this.anIntArray74[local215], local392.aClass13_1, local65);
								}
							}
						}
						this.method149(local59, local77, local363.aClass13_1, local65);
					}
					if (local71 == 0) {
						@Pc(443) Class1_Sub1_Sub1_Sub1_Sub2 local443 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local77];
						if ((local443.anInt128 & 0x7F) == 64 && (local443.anInt129 & 0x7F) == 64) {
							for (local215 = 0; local215 < this.anInt382; local215++) {
								local392 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray74[local215]];
								if (local392 != null && local392.aClass13_1.aByte27 == 1 && local392.anInt128 == local443.anInt128 && local392.anInt129 == local443.anInt129) {
									this.method149(local59, this.anIntArray74[local215], local392.aClass13_1, local65);
								}
							}
							for (@Pc(502) int local502 = 0; local502 < this.anInt404; local502++) {
								@Pc(512) Class1_Sub1_Sub1_Sub1_Sub2 local512 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray78[local502]];
								if (local512 != null && local512 != local443 && local512.anInt128 == local443.anInt128 && local512.anInt129 == local443.anInt129) {
									this.method136(local512, local59, this.anIntArray78[local502], local65);
								}
							}
						}
						this.method136(local443, local59, local77, local65);
					}
					if (local71 == 3) {
						@Pc(562) Class31 local562 = this.aClass31ArrayArrayArray1[this.anInt419][local59][local65];
						if (local562 != null) {
							for (@Pc(569) Class1_Sub1_Sub1_Sub3 local569 = (Class1_Sub1_Sub1_Sub3) local562.method525(); local569 != null; local569 = (Class1_Sub1_Sub1_Sub3) local562.method527()) {
								@Pc(575) Class15 local575 = Class15.method343(local569.anInt490);
								if (this.anInt361 == 1) {
									this.aStringArray1[this.anInt251] = "Use " + this.aString13 + " with @lre@" + local575.aString26;
									this.anIntArray83[this.anInt251] = 217;
									this.anIntArray84[this.anInt251] = local569.anInt490;
									this.anIntArray81[this.anInt251] = local59;
									this.anIntArray82[this.anInt251] = local65;
									this.anInt251++;
								} else if (this.anInt313 != 1) {
									for (@Pc(692) int local692 = 4; local692 >= 0; local692--) {
										if (local575.aStringArray9 != null && local575.aStringArray9[local692] != null) {
											this.aStringArray1[this.anInt251] = local575.aStringArray9[local692] + " @lre@" + local575.aString26;
											if (local692 == 0) {
												this.anIntArray83[this.anInt251] = 224;
											}
											if (local692 == 1) {
												this.anIntArray83[this.anInt251] = 993;
											}
											if (local692 == 2) {
												this.anIntArray83[this.anInt251] = 99;
											}
											if (local692 == 3) {
												this.anIntArray83[this.anInt251] = 746;
											}
											if (local692 == 4) {
												this.anIntArray83[this.anInt251] = 877;
											}
											this.anIntArray84[this.anInt251] = local569.anInt490;
											this.anIntArray81[this.anInt251] = local59;
											this.anIntArray82[this.anInt251] = local65;
											this.anInt251++;
										} else if (local692 == 2) {
											this.aStringArray1[this.anInt251] = "Take @lre@" + local575.aString26;
											this.anIntArray83[this.anInt251] = 99;
											this.anIntArray84[this.anInt251] = local569.anInt490;
											this.anIntArray81[this.anInt251] = local59;
											this.anIntArray82[this.anInt251] = local65;
											this.anInt251++;
										}
									}
									this.aStringArray1[this.anInt251] = "Examine @lre@" + local575.aString26;
									this.anIntArray83[this.anInt251] = 1102;
									this.anIntArray84[this.anInt251] = local569.anInt490;
									this.anIntArray81[this.anInt251] = local59;
									this.anIntArray82[this.anInt251] = local65;
									this.anInt251++;
								} else if ((this.anInt315 & 0x1) == 1) {
									this.aStringArray1[this.anInt251] = this.aString9 + " @lre@" + local575.aString26;
									this.anIntArray83[this.anInt251] = 965;
									this.anIntArray84[this.anInt251] = local569.anInt490;
									this.anIntArray81[this.anInt251] = local59;
									this.anIntArray82[this.anInt251] = local65;
									this.anInt251++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(899) RuntimeException local899) {
			signlink.reporterror("11026, " + 27250 + ", " + local899.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "(I)V")
	private void method204() {
		try {
			@Pc(7) int local7 = this.aClass1_Sub1_Sub2_Sub4_3.method465("Choose Option");
			@Pc(23) int local23;
			for (@Pc(12) int local12 = 0; local12 < this.anInt251; local12++) {
				local23 = this.aClass1_Sub1_Sub2_Sub4_3.method465(this.aStringArray1[local12]);
				if (local23 > local7) {
					local7 = local23;
				}
			}
			local7 += 8;
			local23 = this.anInt251 * 15 + 21;
			@Pc(66) int local66;
			@Pc(84) int local84;
			if (super.anInt238 > 4 && super.anInt239 > 4 && super.anInt238 < 516 && super.anInt239 < 338) {
				local66 = super.anInt238 - local7 / 2 - 4;
				if (local66 + local7 > 512) {
					local66 = 512 - local7;
				}
				if (local66 < 0) {
					local66 = 0;
				}
				local84 = super.anInt239 - 4;
				if (local84 + local23 > 334) {
					local84 = 334 - local23;
				}
				if (local84 < 0) {
					local84 = 0;
				}
				this.aBoolean60 = true;
				this.anInt390 = 0;
				this.anInt391 = local66;
				this.anInt392 = local84;
				this.anInt393 = local7;
				this.anInt394 = this.anInt251 * 15 + 22;
			}
			if (super.anInt238 > 553 && super.anInt239 > 205 && super.anInt238 < 743 && super.anInt239 < 466) {
				local66 = super.anInt238 - local7 / 2 - 553;
				if (local66 < 0) {
					local66 = 0;
				} else if (local66 + local7 > 190) {
					local66 = 190 - local7;
				}
				local84 = super.anInt239 - 205;
				if (local84 < 0) {
					local84 = 0;
				} else if (local84 + local23 > 261) {
					local84 = 261 - local23;
				}
				this.aBoolean60 = true;
				this.anInt390 = 1;
				this.anInt391 = local66;
				this.anInt392 = local84;
				this.anInt393 = local7;
				this.anInt394 = this.anInt251 * 15 + 22;
			}
			if (super.anInt238 > 17 && super.anInt239 > 357 && super.anInt238 < 496 && super.anInt239 < 453) {
				local66 = super.anInt238 - local7 / 2 - 17;
				if (local66 < 0) {
					local66 = 0;
				} else if (local66 + local7 > 479) {
					local66 = 479 - local7;
				}
				local84 = super.anInt239 - 357;
				if (local84 < 0) {
					local84 = 0;
				} else if (local84 + local23 > 96) {
					local84 = 96 - local23;
				}
				this.aBoolean60 = true;
				this.anInt390 = 2;
				this.anInt391 = local66;
				this.anInt392 = local84;
				this.anInt393 = local7;
				this.anInt394 = this.anInt251 * 15 + 22;
			}
		} catch (@Pc(288) RuntimeException local288) {
			signlink.reporterror("79607, " + 0 + ", " + local288.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "R", descriptor = "(I)V")
	private void method205() {
		try {
			try {
				@Pc(14) int local14 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 + this.anInt378;
				@Pc(20) int local20 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 + this.anInt435;
				if (this.anInt340 - local14 < -500 || this.anInt340 - local14 > 500 || this.anInt341 - local20 < -500 || this.anInt341 - local20 > 500) {
					this.anInt340 = local14;
					this.anInt341 = local20;
				}
				if (this.anInt340 != local14) {
					this.anInt340 += (local14 - this.anInt340) / 16;
				}
				if (this.anInt341 != local20) {
					this.anInt341 += (local20 - this.anInt341) / 16;
				}
				if (super.anIntArray32[1] == 1) {
					this.anInt257 += (-this.anInt257 - 24) / 2;
				} else if (super.anIntArray32[2] == 1) {
					this.anInt257 += (24 - this.anInt257) / 2;
				} else {
					this.anInt257 /= 2;
				}
				if (super.anIntArray32[3] == 1) {
					this.anInt258 += (12 - this.anInt258) / 2;
				} else if (super.anIntArray32[4] == 1) {
					this.anInt258 += (-this.anInt258 - 12) / 2;
				} else {
					this.anInt258 /= 2;
				}
				this.anInt256 = this.anInt256 + this.anInt257 / 2 & 0x7FF;
				this.anInt255 += this.anInt258 / 2;
				if (this.anInt255 < 128) {
					this.anInt255 = 128;
				}
				if (this.anInt255 > 383) {
					this.anInt255 = 383;
				}
				@Pc(207) int local207 = this.anInt340 >> 7;
				@Pc(212) int local212 = this.anInt341 >> 7;
				@Pc(222) int local222 = this.method197(this.anInt341, this.anInt419, this.anInt340, (byte) 2);
				@Pc(224) int local224 = 0;
				@Pc(240) int local240;
				if (local207 > 3 && local212 > 3 && local207 < 100 && local212 < 100) {
					for (local240 = local207 - 4; local240 <= local207 + 4; local240++) {
						for (@Pc(246) int local246 = local212 - 4; local246 <= local212 + 4; local246++) {
							@Pc(251) int local251 = this.anInt419;
							if (local251 < 3 && (this.aByteArrayArrayArray7[1][local240][local246] & 0x2) == 2) {
								local251++;
							}
							@Pc(278) int local278 = local222 - this.anIntArrayArrayArray3[local251][local240][local246];
							if (local278 > local224) {
								local224 = local278;
							}
						}
					}
				}
				local240 = local224 * 192;
				if (local240 > 98048) {
					local240 = 98048;
				}
				if (local240 < 32768) {
					local240 = 32768;
				}
				if (local240 > this.anInt398) {
					this.anInt398 += (local240 - this.anInt398) / 24;
				} else if (local240 < this.anInt398) {
					this.anInt398 += (local240 - this.anInt398) / 80;
				}
			} catch (@Pc(342) Exception local342) {
				signlink.reporterror("glfc_ex " + aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 + "," + aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 + "," + this.anInt340 + "," + this.anInt341 + "," + this.anInt260 + "," + this.anInt261 + "," + this.anInt281 + "," + this.anInt282);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(392) RuntimeException local392) {
			signlink.reporterror("85263, " + -171 + ", " + local392.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method206() {
		try {
			@Pc(21) int local21;
			@Pc(49) int local49;
			@Pc(53) int local53;
			@Pc(62) int local62;
			@Pc(69) int local69;
			@Pc(132) int local132;
			@Pc(189) int local189;
			try {
				this.anInt272 = -1;
				this.aClass31_1.method528();
				this.aClass31_2.method528();
				Class1_Sub1_Sub2_Sub1.method371();
				this.method140();
				this.aClass38_1.method578();
				for (local21 = 0; local21 < 4; local21++) {
					this.aClass19Array1[local21].method412();
				}
				System.gc();
				@Pc(45) Class4 local45 = new Class4(this.aByteArrayArrayArray7, this.anIntArrayArrayArray3, 104, 464, 104);
				local49 = this.aByteArrayArray1.length;
				Class4.aBoolean32 = Class38.aBoolean205;
				for (local53 = 0; local53 < local49; local53++) {
					local62 = this.anIntArray85[local53] >> 8;
					local69 = this.anIntArray85[local53] & 0xFF;
					if (local62 == 33 && local69 >= 71 && local69 <= 73) {
						Class4.aBoolean32 = false;
					}
				}
				if (Class4.aBoolean32) {
					this.aClass38_1.method579((byte) 1, this.anInt419);
				} else {
					this.aClass38_1.method579((byte) 1, 0);
				}
				this.aClass1_Sub1_Sub3_2.method485(206);
				@Pc(137) byte[] local137;
				for (local62 = 0; local62 < local49; local62++) {
					local69 = (this.anIntArray85[local62] >> 8) * 64 - this.anInt281;
					local132 = (this.anIntArray85[local62] & 0xFF) * 64 - this.anInt282;
					local137 = this.aByteArrayArray1[local62];
					if (local137 != null) {
						local45.method58(local137, (this.anInt260 - 6) * 8, local132, local69, (this.anInt261 - 6) * 8);
					}
				}
				for (local69 = 0; local69 < local49; local69++) {
					local132 = (this.anIntArray85[local69] >> 8) * 64 - this.anInt281;
					local189 = (this.anIntArray85[local69] & 0xFF) * 64 - this.anInt282;
					@Pc(194) byte[] local194 = this.aByteArrayArray1[local69];
					if (local194 == null && this.anInt261 < 800) {
						local45.method57(local189, local132);
					}
				}
				this.aClass1_Sub1_Sub3_2.method485(206);
				@Pc(239) int local239;
				for (local132 = 0; local132 < local49; local132++) {
					local137 = this.aByteArrayArray2[local132];
					if (local137 != null) {
						local239 = (this.anIntArray85[local132] >> 8) * 64 - this.anInt281;
						@Pc(251) int local251 = (this.anIntArray85[local132] & 0xFF) * 64 - this.anInt282;
						local45.method61(this.aClass19Array1, local251, local137, local239, this.aClass38_1);
					}
				}
				this.aClass1_Sub1_Sub3_2.method485(206);
				local45.method63(this.aClass19Array1, this.aClass38_1);
				this.aClass37_14.method574(this.aByte9);
				this.aClass1_Sub1_Sub3_2.method485(206);
				for (local189 = 0; local189 < 104; local189++) {
					for (local239 = 0; local239 < 104; local239++) {
						this.method105(local189, local239);
					}
				}
				this.method169();
			} catch (@Pc(312) Exception local312) {
			}
			Class9.aClass40_4.method639();
			@Pc(326) int local326;
			if (aBoolean67 && signlink.aRandomAccessFile1 != null) {
				local21 = this.aClass43_Sub1_1.method646(0);
				for (local326 = 0; local326 < local21; local326++) {
					local49 = this.aClass43_Sub1_1.method651(local326);
					if ((local49 & 0x79) == 0) {
						Class1_Sub1_Sub1_Sub5.method286(local326);
					}
				}
			}
			System.gc();
			Class1_Sub1_Sub2_Sub1.method372();
			this.aClass43_Sub1_1.method657();
			local21 = (this.anInt260 - 6) / 8 - 1;
			local326 = (this.anInt260 + 6) / 8 + 1;
			local49 = (this.anInt261 - 6) / 8 - 1;
			local53 = (this.anInt261 + 6) / 8 + 1;
			if (this.aBoolean59) {
				local21 = 49;
				local326 = 50;
				local49 = 49;
				local53 = 50;
			}
			for (local62 = local21; local62 <= local326; local62++) {
				for (local69 = local49; local69 <= local53; local69++) {
					if (local62 == local21 || local62 == local326 || local69 == local49 || local69 == local53) {
						local132 = this.aClass43_Sub1_1.method648(0, local62, local69);
						if (local132 != -1) {
							this.aClass43_Sub1_1.method658(local132, 3);
						}
						local189 = this.aClass43_Sub1_1.method648(1, local62, local69);
						if (local189 != -1) {
							this.aClass43_Sub1_1.method658(local189, 3);
						}
					}
				}
			}
		} catch (@Pc(471) RuntimeException local471) {
			signlink.reporterror("51360, " + false + ", " + local471.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIZLclient!d;IIB)V")
	private void method207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class6 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			if (this.aBoolean77) {
				this.anInt381 = 32;
			} else {
				this.anInt381 = 0;
			}
			this.aBoolean77 = false;
			if (arg7 >= arg1 && arg7 < arg1 + 16 && arg6 >= arg0 && arg6 < arg0 + 16) {
				arg5.anInt469 -= this.anInt401 * 4;
				if (arg4) {
					this.aBoolean78 = true;
					return;
				}
			} else if (arg7 >= arg1 && arg7 < arg1 + 16 && arg6 >= arg0 + arg3 - 16 && arg6 < arg0 + arg3) {
				arg5.anInt469 += this.anInt401 * 4;
				if (arg4) {
					this.aBoolean78 = true;
					return;
				}
			} else if (arg7 >= arg1 - this.anInt381 && arg7 < arg1 + this.anInt381 + 16 && arg6 >= arg0 + 16 && arg6 < arg0 + arg3 - 16 && this.anInt401 > 0) {
				@Pc(121) int local121 = (arg3 - 32) * arg3 / arg2;
				if (local121 < 8) {
					local121 = 8;
				}
				@Pc(136) int local136 = arg6 - arg0 - local121 / 2 - 16;
				@Pc(142) int local142 = arg3 - local121 - 32;
				arg5.anInt469 = (arg2 - arg3) * local136 / local142;
				if (arg4) {
					this.aBoolean78 = true;
				}
				this.aBoolean77 = true;
			} else {
				return;
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("12634, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 56 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "S", descriptor = "(I)V")
	private void method208(@OriginalArg(0) int arg0) {
		try {
			this.aClass37_15.method574(this.aByte9);
			Class1_Sub1_Sub2_Sub1.anIntArray184 = this.anIntArray36;
			this.aClass1_Sub1_Sub2_Sub3_10.method443(0, 200, 0);
			if (this.aBoolean47) {
				this.aClass1_Sub1_Sub2_Sub4_3.method463(0, 239, 40, this.aString7);
				this.aClass1_Sub1_Sub2_Sub4_3.method463(128, 239, 60, this.aString12 + "*");
			} else if (this.aBoolean43) {
				this.aClass1_Sub1_Sub2_Sub4_3.method463(0, 239, 40, "Enter amount:");
				this.aClass1_Sub1_Sub2_Sub4_3.method463(128, 239, 60, this.aString10 + "*");
			} else if (this.aString14 != null) {
				this.aClass1_Sub1_Sub2_Sub4_3.method463(0, 239, 40, this.aString14);
				this.aClass1_Sub1_Sub2_Sub4_3.method463(128, 239, 60, "Click to continue");
			} else if (this.anInt328 != -1) {
				this.method144(Class6.aClass6Array1[this.anInt328], 0, 0, 0);
			} else if (this.anInt278 == -1) {
				@Pc(131) Class1_Sub1_Sub2_Sub4 local131 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(133) int local133 = 0;
				Class1_Sub1_Sub2.method453(0, 463, 77, 0);
				for (@Pc(141) int local141 = 0; local141 < 100; local141++) {
					if (this.aStringArray3[local141] != null) {
						@Pc(153) int local153 = this.anIntArray56[local141];
						@Pc(162) int local162 = this.anInt311 + 70 - local133 * 14;
						@Pc(167) String local167 = this.aStringArray2[local141];
						@Pc(169) byte local169 = 0;
						if (local167 != null && local167.startsWith("@cr1@")) {
							local167 = local167.substring(5);
							local169 = 1;
						}
						if (local167 != null && local167.startsWith("@cr2@")) {
							local167 = local167.substring(5);
							local169 = 2;
						}
						if (local153 == 0) {
							if (local162 > 0 && local162 < 110) {
								local131.method466(this.aStringArray3[local141], 0, 4, local162);
							}
							local133++;
						}
						@Pc(239) int local239;
						if ((local153 == 1 || local153 == 2) && (local153 == 1 || this.anInt358 == 0 || this.anInt358 == 1 && this.method104(local167))) {
							if (local162 > 0 && local162 < 110) {
								local239 = 4;
								if (local169 == 1) {
									this.aClass1_Sub1_Sub2_Sub3Array3[0].method443(4, 200, local162 - 12);
									local239 += 14;
								}
								if (local169 == 2) {
									this.aClass1_Sub1_Sub2_Sub3Array3[1].method443(local239, 200, local162 - 12);
									local239 += 14;
								}
								local131.method466(local167 + ":", 0, local239, local162);
								local239 += local131.method465(local167) + 8;
								local131.method466(this.aStringArray3[local141], 255, local239, local162);
							}
							local133++;
						}
						if ((local153 == 3 || local153 == 7) && this.anInt286 == 0 && (local153 == 7 || this.anInt416 == 0 || this.anInt416 == 1 && this.method104(local167))) {
							if (local162 > 0 && local162 < 110) {
								local131.method466("From", 0, 4, local162);
								local239 = local131.method465("From ") + 4;
								if (local169 == 1) {
									this.aClass1_Sub1_Sub2_Sub3Array3[0].method443(local239, 200, local162 - 12);
									local239 += 14;
								}
								if (local169 == 2) {
									this.aClass1_Sub1_Sub2_Sub3Array3[1].method443(local239, 200, local162 - 12);
									local239 += 14;
								}
								local131.method466(local167 + ":", 0, local239, local162);
								local239 += local131.method465(local167) + 8;
								local131.method466(this.aStringArray3[local141], 8388608, local239, local162);
							}
							local133++;
						}
						if (local153 == 4 && (this.anInt386 == 0 || this.anInt386 == 1 && this.method104(local167))) {
							if (local162 > 0 && local162 < 110) {
								local131.method466(local167 + " " + this.aStringArray3[local141], 8388736, 4, local162);
							}
							local133++;
						}
						if (local153 == 5 && this.anInt286 == 0 && this.anInt416 < 2) {
							if (local162 > 0 && local162 < 110) {
								local131.method466(this.aStringArray3[local141], 8388608, 4, local162);
							}
							local133++;
						}
						if (local153 == 6 && this.anInt286 == 0 && this.anInt416 < 2) {
							if (local162 > 0 && local162 < 110) {
								local131.method466("To " + local167 + ":", 0, 4, local162);
								local131.method466(this.aStringArray3[local141], 8388608, local131.method465("To " + local167) + 12, local162);
							}
							local133++;
						}
						if (local153 == 8 && (this.anInt386 == 0 || this.anInt386 == 1 && this.method104(local167))) {
							if (local162 > 0 && local162 < 110) {
								local131.method466(local167 + " " + this.aStringArray3[local141], 8270336, 4, local162);
							}
							local133++;
						}
					}
				}
				Class1_Sub1_Sub2.method452();
				this.anInt332 = local133 * 14 + 7;
				if (this.anInt332 < 78) {
					this.anInt332 = 78;
				}
				this.method209(0, 463, this.anInt332 - this.anInt311 - 77, this.anInt332, 77);
				@Pc(609) String local609;
				if (aClass1_Sub1_Sub1_Sub1_Sub2_1 == null || aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4 == null) {
					local609 = Class47.method679(this.aString5);
				} else {
					local609 = aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4;
				}
				local131.method466(local609 + ":", 0, 4, 90);
				local131.method466(this.aString8 + "*", 255, local131.method465(local609 + ": ") + 6, 90);
				Class1_Sub1_Sub2.method459(77, 479, 0, 0);
			} else {
				this.method144(Class6.aClass6Array1[this.anInt278], 0, 0, 0);
			}
			if (this.aBoolean60 && this.anInt390 == 2) {
				this.method109();
			}
			this.aClass37_15.method575(17, super.aGraphics2, 357);
			this.aClass37_14.method574(this.aByte9);
			this.anInt406 += arg0;
			Class1_Sub1_Sub2_Sub1.anIntArray184 = this.anIntArray38;
		} catch (@Pc(697) RuntimeException local697) {
			signlink.reporterror("89530, " + arg0 + ", " + local697.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method90() {
		if (signlink.sunjava) {
			super.anInt226 = 5;
		}
		if (aBoolean45) {
			this.aBoolean53 = true;
			return;
		}
		aBoolean45 = true;
		@Pc(16) boolean local16 = false;
		@Pc(20) String local20 = this.method98();
		if (local20.endsWith("jagex.com")) {
			local16 = true;
		}
		if (local20.endsWith("runescape.com")) {
			local16 = true;
		}
		if (local20.endsWith("192.168.1.2")) {
			local16 = true;
		}
		if (local20.endsWith("192.168.1.247")) {
			local16 = true;
		}
		if (local20.endsWith("192.168.1.249")) {
			local16 = true;
		}
		if (local20.endsWith("192.168.1.253")) {
			local16 = true;
		}
		if (local20.endsWith("192.168.1.254")) {
			local16 = true;
		}
		if (local20.endsWith("127.0.0.1")) {
			local16 = true;
		}
		if (!local16) {
			this.aBoolean51 = true;
			return;
		}
		@Pc(78) int local78;
		if (signlink.aRandomAccessFile1 != null) {
			for (local78 = 0; local78 < 5; local78++) {
				this.aClass44Array1[local78] = new Class44((byte) 98, signlink.aRandomAccessFile1, local78 + 1, 500000, signlink.aRandomAccessFileArray1[local78]);
			}
		}
		try {
			local78 = 5;
			this.anIntArray76[8] = 0;
			while (this.anIntArray76[8] == 0) {
				this.method97("Connecting to web server", 20);
				try {
					@Pc(127) DataInputStream local127 = this.method154("crc" + (int) (Math.random() * 9.9999999E7D));
					@Pc(134) Class1_Sub1_Sub3 local134 = new Class1_Sub1_Sub3(new byte[36], false);
					local127.readFully(local134.aByteArray9, 0, 36);
					for (@Pc(142) int local142 = 0; local142 < 9; local142++) {
						this.anIntArray76[local142] = local134.method501();
					}
					local127.close();
				} catch (@Pc(158) IOException local158) {
					for (@Pc(160) int local160 = local78; local160 > 0; local160--) {
						this.method97("Error loading - Will retry in " + local160 + " secs.", 10);
						try {
							Thread.sleep(1000L);
						} catch (@Pc(179) Exception local179) {
						}
					}
					local78 *= 2;
					if (local78 > 60) {
						local78 = 60;
					}
				}
			}
			this.aClass46_1 = this.method226("title screen", 484, 1, this.anIntArray76[1], "title", 25);
			this.aClass1_Sub1_Sub2_Sub4_1 = new Class1_Sub1_Sub2_Sub4("p11", this.aClass46_1, (byte) -113);
			this.aClass1_Sub1_Sub2_Sub4_2 = new Class1_Sub1_Sub2_Sub4("p12", this.aClass46_1, (byte) -113);
			this.aClass1_Sub1_Sub2_Sub4_3 = new Class1_Sub1_Sub2_Sub4("b12", this.aClass46_1, (byte) -113);
			this.aClass1_Sub1_Sub2_Sub4_4 = new Class1_Sub1_Sub2_Sub4("q8", this.aClass46_1, (byte) -113);
			this.method179();
			this.method122();
			@Pc(265) Class46 local265 = this.method226("config", 484, 2, this.anIntArray76[2], "config", 30);
			@Pc(277) Class46 local277 = this.method226("interface", 484, 3, this.anIntArray76[3], "interface", 35);
			@Pc(289) Class46 local289 = this.method226("2d graphics", 484, 4, this.anIntArray76[4], "media", 40);
			@Pc(301) Class46 local301 = this.method226("textures", 484, 6, this.anIntArray76[6], "textures", 45);
			@Pc(313) Class46 local313 = this.method226("chat system", 484, 7, this.anIntArray76[7], "wordenc", 50);
			@Pc(325) Class46 local325 = this.method226("sound effects", 484, 8, this.anIntArray76[8], "sounds", 55);
			this.aByteArrayArrayArray7 = new byte[4][104][104];
			this.anIntArrayArrayArray3 = new int[4][105][105];
			this.aClass38_1 = new Class38(this.anIntArrayArrayArray3, 104, 104, 9, 4);
			for (@Pc(350) int local350 = 0; local350 < 4; local350++) {
				this.aClass19Array1[local350] = new Class19(104, 104, -799);
			}
			this.aClass1_Sub1_Sub2_Sub2_8 = new Class1_Sub1_Sub2_Sub2(512, 512);
			@Pc(385) Class46 local385 = this.method226("update list", 484, 5, this.anIntArray76[5], "versionlist", 60);
			this.method97("Connecting to update server", 60);
			this.aClass43_Sub1_1 = new Class43_Sub1();
			this.aClass43_Sub1_1.method644(local385, this);
			Class14.method323(this.aClass43_Sub1_1.method647());
			Class1_Sub1_Sub1_Sub5.method284(this.aClass43_Sub1_1.method646(0), this.aClass43_Sub1_1);
			if (!aBoolean67) {
				this.anInt319 = 0;
				this.aBoolean54 = false;
				this.aClass43_Sub1_1.method653(2, this.anInt319);
				while (this.aClass43_Sub1_1.method654() > 0) {
					this.method145();
					try {
						Thread.sleep(100L);
					} catch (@Pc(436) Exception local436) {
					}
				}
			}
			this.method97("Requesting animations", 65);
			@Pc(452) int local452 = this.aClass43_Sub1_1.method646(1);
			for (@Pc(454) int local454 = 0; local454 < local452; local454++) {
				this.aClass43_Sub1_1.method653(1, local454);
			}
			@Pc(473) int local473;
			while (this.aClass43_Sub1_1.method654() > 0) {
				local473 = local452 - this.aClass43_Sub1_1.method654();
				if (local473 > 0) {
					this.method97("Loading animations - " + local473 * 100 / local452 + "%", 65);
				}
				this.method145();
				try {
					Thread.sleep(100L);
				} catch (@Pc(499) Exception local499) {
				}
			}
			this.method97("Requesting models", 70);
			local452 = this.aClass43_Sub1_1.method646(0);
			@Pc(525) int local525;
			for (local473 = 0; local473 < local452; local473++) {
				local525 = this.aClass43_Sub1_1.method651(local473);
				if ((local525 & 0x1) != 0) {
					this.aClass43_Sub1_1.method653(0, local473);
				}
			}
			local452 = this.aClass43_Sub1_1.method654();
			while (this.aClass43_Sub1_1.method654() > 0) {
				local525 = local452 - this.aClass43_Sub1_1.method654();
				if (local525 > 0) {
					this.method97("Loading models - " + local525 * 100 / local452 + "%", 70);
				}
				this.method145();
				try {
					Thread.sleep(100L);
				} catch (@Pc(576) Exception local576) {
				}
			}
			if (this.aClass44Array1[0] != null) {
				this.method97("Requesting maps", 75);
				this.aClass43_Sub1_1.method653(3, this.aClass43_Sub1_1.method648(0, 47, 48));
				this.aClass43_Sub1_1.method653(3, this.aClass43_Sub1_1.method648(1, 47, 48));
				this.aClass43_Sub1_1.method653(3, this.aClass43_Sub1_1.method648(0, 48, 48));
				this.aClass43_Sub1_1.method653(3, this.aClass43_Sub1_1.method648(1, 48, 48));
				this.aClass43_Sub1_1.method653(3, this.aClass43_Sub1_1.method648(0, 49, 48));
				this.aClass43_Sub1_1.method653(3, this.aClass43_Sub1_1.method648(1, 49, 48));
				this.aClass43_Sub1_1.method653(3, this.aClass43_Sub1_1.method648(0, 47, 47));
				this.aClass43_Sub1_1.method653(3, this.aClass43_Sub1_1.method648(1, 47, 47));
				this.aClass43_Sub1_1.method653(3, this.aClass43_Sub1_1.method648(0, 48, 47));
				this.aClass43_Sub1_1.method653(3, this.aClass43_Sub1_1.method648(1, 48, 47));
				this.aClass43_Sub1_1.method653(3, this.aClass43_Sub1_1.method648(0, 48, 148));
				this.aClass43_Sub1_1.method653(3, this.aClass43_Sub1_1.method648(1, 48, 148));
				local452 = this.aClass43_Sub1_1.method654();
				while (this.aClass43_Sub1_1.method654() > 0) {
					local525 = local452 - this.aClass43_Sub1_1.method654();
					if (local525 > 0) {
						this.method97("Loading maps - " + local525 * 100 / local452 + "%", 75);
					}
					this.method145();
					try {
						Thread.sleep(100L);
					} catch (@Pc(761) Exception local761) {
					}
				}
			}
			local452 = this.aClass43_Sub1_1.method646(0);
			@Pc(782) int local782;
			for (local525 = 0; local525 < local452; local525++) {
				local782 = this.aClass43_Sub1_1.method651(local525);
				@Pc(784) byte local784 = 0;
				if ((local782 & 0x8) != 0) {
					local784 = 10;
				} else if ((local782 & 0x20) != 0) {
					local784 = 9;
				} else if ((local782 & 0x10) != 0) {
					local784 = 8;
				} else if ((local782 & 0x40) != 0) {
					local784 = 7;
				} else if ((local782 & 0x80) != 0) {
					local784 = 6;
				} else if ((local782 & 0x2) != 0) {
					local784 = 5;
				} else if ((local782 & 0x4) != 0) {
					local784 = 4;
				}
				if ((local782 & 0x1) != 0) {
					local784 = 3;
				}
				if (local784 != 0) {
					this.aClass43_Sub1_1.method656(local525, 0, local784);
				}
			}
			this.aClass43_Sub1_1.method649(aBoolean66);
			if (!aBoolean67) {
				local452 = this.aClass43_Sub1_1.method646(2);
				for (local782 = 1; local782 < local452; local782++) {
					if (this.aClass43_Sub1_1.method652(local782)) {
						this.aClass43_Sub1_1.method656(local782, 2, (byte) 1);
					}
				}
			}
			this.method97("Unpacking media", 80);
			this.aClass1_Sub1_Sub2_Sub3_8 = new Class1_Sub1_Sub2_Sub3(local289, "invback", 0);
			this.aClass1_Sub1_Sub2_Sub3_10 = new Class1_Sub1_Sub2_Sub3(local289, "chatback", 0);
			this.aClass1_Sub1_Sub2_Sub3_9 = new Class1_Sub1_Sub2_Sub3(local289, "mapback", 0);
			this.aClass1_Sub1_Sub2_Sub3_11 = new Class1_Sub1_Sub2_Sub3(local289, "backbase1", 0);
			this.aClass1_Sub1_Sub2_Sub3_12 = new Class1_Sub1_Sub2_Sub3(local289, "backbase2", 0);
			this.aClass1_Sub1_Sub2_Sub3_13 = new Class1_Sub1_Sub2_Sub3(local289, "backhmid1", 0);
			for (local782 = 0; local782 < 13; local782++) {
				this.aClass1_Sub1_Sub2_Sub3Array4[local782] = new Class1_Sub1_Sub2_Sub3(local289, "sideicons", local782);
			}
			this.aClass1_Sub1_Sub2_Sub2_11 = new Class1_Sub1_Sub2_Sub2(local289, "compass", 0);
			this.aClass1_Sub1_Sub2_Sub2_1 = new Class1_Sub1_Sub2_Sub2(local289, "mapedge", 0);
			this.aClass1_Sub1_Sub2_Sub2_1.method401();
			@Pc(984) int local984;
			try {
				for (local984 = 0; local984 < 50; local984++) {
					this.aClass1_Sub1_Sub2_Sub3Array1[local984] = new Class1_Sub1_Sub2_Sub3(local289, "mapscene", local984);
				}
			} catch (@Pc(1002) Exception local1002) {
			}
			try {
				for (local984 = 0; local984 < 50; local984++) {
					this.aClass1_Sub1_Sub2_Sub2Array7[local984] = new Class1_Sub1_Sub2_Sub2(local289, "mapfunction", local984);
				}
			} catch (@Pc(1022) Exception local1022) {
			}
			try {
				for (local984 = 0; local984 < 20; local984++) {
					this.aClass1_Sub1_Sub2_Sub2Array5[local984] = new Class1_Sub1_Sub2_Sub2(local289, "hitmarks", local984);
				}
			} catch (@Pc(1042) Exception local1042) {
			}
			try {
				for (local984 = 0; local984 < 20; local984++) {
					this.aClass1_Sub1_Sub2_Sub2Array4[local984] = new Class1_Sub1_Sub2_Sub2(local289, "headicons", local984);
				}
			} catch (@Pc(1062) Exception local1062) {
			}
			this.aClass1_Sub1_Sub2_Sub2_6 = new Class1_Sub1_Sub2_Sub2(local289, "mapmarker", 0);
			this.aClass1_Sub1_Sub2_Sub2_7 = new Class1_Sub1_Sub2_Sub2(local289, "mapmarker", 1);
			for (local984 = 0; local984 < 8; local984++) {
				this.aClass1_Sub1_Sub2_Sub2Array3[local984] = new Class1_Sub1_Sub2_Sub2(local289, "cross", local984);
			}
			this.aClass1_Sub1_Sub2_Sub2_2 = new Class1_Sub1_Sub2_Sub2(local289, "mapdots", 0);
			this.aClass1_Sub1_Sub2_Sub2_3 = new Class1_Sub1_Sub2_Sub2(local289, "mapdots", 1);
			this.aClass1_Sub1_Sub2_Sub2_4 = new Class1_Sub1_Sub2_Sub2(local289, "mapdots", 2);
			this.aClass1_Sub1_Sub2_Sub2_5 = new Class1_Sub1_Sub2_Sub2(local289, "mapdots", 3);
			this.aClass1_Sub1_Sub2_Sub3_1 = new Class1_Sub1_Sub2_Sub3(local289, "scrollbar", 0);
			this.aClass1_Sub1_Sub2_Sub3_2 = new Class1_Sub1_Sub2_Sub3(local289, "scrollbar", 1);
			this.aClass1_Sub1_Sub2_Sub3_3 = new Class1_Sub1_Sub2_Sub3(local289, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_4 = new Class1_Sub1_Sub2_Sub3(local289, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_5 = new Class1_Sub1_Sub2_Sub3(local289, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_6 = new Class1_Sub1_Sub2_Sub3(local289, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_6.method440();
			this.aClass1_Sub1_Sub2_Sub3_7 = new Class1_Sub1_Sub2_Sub3(local289, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_7.method440();
			this.aClass1_Sub1_Sub2_Sub3_14 = new Class1_Sub1_Sub2_Sub3(local289, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_14.method441();
			this.aClass1_Sub1_Sub2_Sub3_15 = new Class1_Sub1_Sub2_Sub3(local289, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_15.method441();
			this.aClass1_Sub1_Sub2_Sub3_16 = new Class1_Sub1_Sub2_Sub3(local289, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_16.method441();
			this.aClass1_Sub1_Sub2_Sub3_17 = new Class1_Sub1_Sub2_Sub3(local289, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_17.method440();
			this.aClass1_Sub1_Sub2_Sub3_17.method441();
			this.aClass1_Sub1_Sub2_Sub3_18 = new Class1_Sub1_Sub2_Sub3(local289, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_18.method440();
			this.aClass1_Sub1_Sub2_Sub3_18.method441();
			for (@Pc(1262) int local1262 = 0; local1262 < 2; local1262++) {
				this.aClass1_Sub1_Sub2_Sub3Array3[local1262] = new Class1_Sub1_Sub2_Sub3(local289, "mod_icons", local1262);
			}
			@Pc(1285) Class1_Sub1_Sub2_Sub2 local1285 = new Class1_Sub1_Sub2_Sub2(local289, "backleft1", 0);
			this.aClass37_3 = new Class37(local1285.anInt688, this.method95(), 0, local1285.anInt687);
			local1285.method402(0, 0);
			@Pc(1310) Class1_Sub1_Sub2_Sub2 local1310 = new Class1_Sub1_Sub2_Sub2(local289, "backleft2", 0);
			this.aClass37_4 = new Class37(local1310.anInt688, this.method95(), 0, local1310.anInt687);
			local1310.method402(0, 0);
			@Pc(1335) Class1_Sub1_Sub2_Sub2 local1335 = new Class1_Sub1_Sub2_Sub2(local289, "backright1", 0);
			this.aClass37_5 = new Class37(local1335.anInt688, this.method95(), 0, local1335.anInt687);
			local1335.method402(0, 0);
			@Pc(1360) Class1_Sub1_Sub2_Sub2 local1360 = new Class1_Sub1_Sub2_Sub2(local289, "backright2", 0);
			this.aClass37_6 = new Class37(local1360.anInt688, this.method95(), 0, local1360.anInt687);
			local1360.method402(0, 0);
			@Pc(1385) Class1_Sub1_Sub2_Sub2 local1385 = new Class1_Sub1_Sub2_Sub2(local289, "backtop1", 0);
			this.aClass37_7 = new Class37(local1385.anInt688, this.method95(), 0, local1385.anInt687);
			local1385.method402(0, 0);
			@Pc(1410) Class1_Sub1_Sub2_Sub2 local1410 = new Class1_Sub1_Sub2_Sub2(local289, "backvmid1", 0);
			this.aClass37_8 = new Class37(local1410.anInt688, this.method95(), 0, local1410.anInt687);
			local1410.method402(0, 0);
			@Pc(1435) Class1_Sub1_Sub2_Sub2 local1435 = new Class1_Sub1_Sub2_Sub2(local289, "backvmid2", 0);
			this.aClass37_9 = new Class37(local1435.anInt688, this.method95(), 0, local1435.anInt687);
			local1435.method402(0, 0);
			@Pc(1460) Class1_Sub1_Sub2_Sub2 local1460 = new Class1_Sub1_Sub2_Sub2(local289, "backvmid3", 0);
			this.aClass37_10 = new Class37(local1460.anInt688, this.method95(), 0, local1460.anInt687);
			local1460.method402(0, 0);
			@Pc(1485) Class1_Sub1_Sub2_Sub2 local1485 = new Class1_Sub1_Sub2_Sub2(local289, "backhmid2", 0);
			this.aClass37_11 = new Class37(local1485.anInt688, this.method95(), 0, local1485.anInt687);
			local1485.method402(0, 0);
			@Pc(1510) int local1510 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1517) int local1517 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1524) int local1524 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1531) int local1531 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1533) int local1533 = 0; local1533 < 50; local1533++) {
				if (this.aClass1_Sub1_Sub2_Sub2Array7[local1533] != null) {
					this.aClass1_Sub1_Sub2_Sub2Array7[local1533].method400(local1510 + local1531, local1517 + local1531, local1524 + local1531);
				}
				if (this.aClass1_Sub1_Sub2_Sub3Array1[local1533] != null) {
					this.aClass1_Sub1_Sub2_Sub3Array1[local1533].method442(local1510 + local1531, local1517 + local1531, local1524 + local1531);
				}
			}
			this.method97("Unpacking textures", 83);
			Class1_Sub1_Sub2_Sub1.method373(local301);
			Class1_Sub1_Sub2_Sub1.method377(anInt412, 0.8D);
			Class1_Sub1_Sub2_Sub1.method372();
			this.method97("Unpacking config", 86);
			Class27.method514(anInt418, local265);
			Class9.method256(local265);
			Class21.method445(anInt418, local265);
			Class15.method341(local265);
			Class13.method317(local265);
			Class23.method475(anInt418, local265);
			Class29.method518(anInt418, local265);
			Class32.method529(anInt418, local265);
			Class15.aBoolean138 = aBoolean66;
			if (!aBoolean67) {
				this.method97("Unpacking sounds", 90);
				@Pc(1633) byte[] local1633 = local325.method674("sounds.dat", null);
				@Pc(1639) Class1_Sub1_Sub3 local1639 = new Class1_Sub1_Sub3(local1633, false);
				Class5.method79(anInt418, local1639);
			}
			this.method97("Unpacking interfaces", 95);
			@Pc(1670) Class1_Sub1_Sub2_Sub4[] local1670 = new Class1_Sub1_Sub2_Sub4[] { this.aClass1_Sub1_Sub2_Sub4_1, this.aClass1_Sub1_Sub2_Sub4_2, this.aClass1_Sub1_Sub2_Sub4_3, this.aClass1_Sub1_Sub2_Sub4_4 };
			Class6.method230(local1670, local289, local277);
			this.method97("Preparing game engine", 100);
			@Pc(1686) int local1686;
			@Pc(1688) int local1688;
			@Pc(1690) int local1690;
			for (@Pc(1682) int local1682 = 0; local1682 < 33; local1682++) {
				local1686 = 999;
				local1688 = 0;
				for (local1690 = 0; local1690 < 34; local1690++) {
					if (this.aClass1_Sub1_Sub2_Sub3_9.aByteArray7[local1690 + local1682 * this.aClass1_Sub1_Sub2_Sub3_9.anInt719] == 0) {
						if (local1686 == 999) {
							local1686 = local1690;
						}
					} else if (local1686 != 999) {
						local1688 = local1690;
						break;
					}
				}
				this.anIntArray39[local1682] = local1686;
				this.anIntArray73[local1682] = local1688 - local1686;
			}
			@Pc(1748) int local1748;
			for (local1686 = 5; local1686 < 156; local1686++) {
				local1688 = 999;
				local1690 = 0;
				for (local1748 = 25; local1748 < 172; local1748++) {
					if (this.aClass1_Sub1_Sub2_Sub3_9.aByteArray7[local1748 + local1686 * this.aClass1_Sub1_Sub2_Sub3_9.anInt719] == 0 && (local1748 > 34 || local1686 > 34)) {
						if (local1688 == 999) {
							local1688 = local1748;
						}
					} else if (local1688 != 999) {
						local1690 = local1748;
						break;
					}
				}
				this.anIntArray77[local1686 - 5] = local1688 - 25;
				this.anIntArray45[local1686 - 5] = local1690 - local1688;
			}
			Class1_Sub1_Sub2_Sub1.method370(479, 96, anInt376);
			this.anIntArray36 = Class1_Sub1_Sub2_Sub1.anIntArray184;
			Class1_Sub1_Sub2_Sub1.method370(190, 261, anInt376);
			this.anIntArray37 = Class1_Sub1_Sub2_Sub1.anIntArray184;
			Class1_Sub1_Sub2_Sub1.method370(512, 334, anInt376);
			this.anIntArray38 = Class1_Sub1_Sub2_Sub1.anIntArray184;
			@Pc(1832) int[] local1832 = new int[9];
			for (local1690 = 0; local1690 < 9; local1690++) {
				local1748 = local1690 * 32 + 128 + 15;
				@Pc(1850) int local1850 = local1748 * 3 + 600;
				@Pc(1854) int local1854 = Class1_Sub1_Sub2_Sub1.anIntArray182[local1748];
				local1832[local1690] = local1850 * local1854 >> 16;
			}
			Class38.method614(local1832);
			Class35.method536(local313);
			this.aClass11_1 = new Class11(-16285, this);
		} catch (@Pc(1884) Exception local1884) {
			signlink.reporterror("loaderror " + this.aString18 + " " + this.anInt334);
			this.aBoolean63 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIZ)V")
	private void method209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			this.aClass1_Sub1_Sub2_Sub3_1.method443(arg1, 200, arg0);
			this.aClass1_Sub1_Sub2_Sub3_2.method443(arg1, 200, arg0 + arg4 - 16);
			Class1_Sub1_Sub2.method456(arg0 + 16, arg4 - 32, arg1, 16, this.anInt420);
			@Pc(35) int local35 = (arg4 - 32) * arg4 / arg3;
			if (local35 < 8) {
				local35 = 8;
			}
			@Pc(52) int local52 = (arg4 - local35 - 32) * arg2 / (arg3 - arg4);
			Class1_Sub1_Sub2.method456(arg0 + local52 + 16, local35, arg1, 16, this.anInt274);
			Class1_Sub1_Sub2.method461(this.anInt347, arg1, local35, arg0 + local52 + 16);
			Class1_Sub1_Sub2.method461(this.anInt347, arg1 + 1, local35, arg0 + local52 + 16);
			Class1_Sub1_Sub2.method459(arg0 + local52 + 16, 16, arg1, this.anInt347);
			Class1_Sub1_Sub2.method459(arg0 + local52 + 17, 16, arg1, this.anInt347);
			Class1_Sub1_Sub2.method461(this.anInt387, arg1 + 15, local35, arg0 + local52 + 16);
			Class1_Sub1_Sub2.method461(this.anInt387, arg1 + 14, local35 - 1, arg0 + local52 + 17);
			Class1_Sub1_Sub2.method459(arg0 + local52 + local35 + 15, 16, arg1, this.anInt387);
			Class1_Sub1_Sub2.method459(arg0 + local52 + local35 + 14, 15, arg1 + 1, this.anInt387);
		} catch (@Pc(173) RuntimeException local173) {
			signlink.reporterror("49670, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + false + ", " + local173.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "T", descriptor = "(I)V")
	private void method210() {
		try {
			@Pc(17) int local17;
			for (@Pc(9) int local9 = -1; local9 < this.anInt404; local9++) {
				if (local9 == -1) {
					local17 = this.anInt403;
				} else {
					local17 = this.anIntArray78[local9];
				}
				@Pc(29) Class1_Sub1_Sub1_Sub1_Sub2 local29 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local17];
				if (local29 != null && local29.anInt139 > 0) {
					local29.anInt139--;
					if (local29.anInt139 == 0) {
						local29.aString3 = null;
					}
				}
			}
			for (local17 = 0; local17 < this.anInt382; local17++) {
				@Pc(60) int local60 = this.anIntArray74[local17];
				@Pc(65) Class1_Sub1_Sub1_Sub1_Sub1 local65 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local60];
				if (local65 != null && local65.anInt139 > 0) {
					local65.anInt139--;
					if (local65.anInt139 == 0) {
						local65.aString3 = null;
					}
				}
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("16415, " + 121 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIIII)Z")
	private boolean method211(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(7) int local7 = arg0 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass38_1.method608(this.anInt419, arg2, arg3, arg0);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(43) Class9 local43 = Class9.method258(local7);
				@Pc(51) int local51;
				@Pc(54) int local54;
				if (local31 == 0 || local31 == 2) {
					local51 = local43.anInt523;
					local54 = local43.anInt524;
				} else {
					local51 = local43.anInt524;
					local54 = local43.anInt523;
				}
				@Pc(65) int local65 = local43.anInt535;
				if (local31 != 0) {
					local65 = (local65 << local31 & 0xF) + (local65 >> 4 - local31);
				}
				this.method100(0, local54, 2, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], local51, local65, arg2, false, arg3, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0]);
			} else {
				this.method100(local25 + 1, 0, 2, local31, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], 0, 0, arg2, false, arg3, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0]);
			}
			this.anInt300 = super.anInt238;
			this.anInt301 = super.anInt239;
			this.anInt303 = 2;
			this.anInt302 = 0;
			this.aClass1_Sub1_Sub3_2.method485(arg1);
			this.aClass1_Sub1_Sub3_2.method487(arg2 + this.anInt281);
			this.aClass1_Sub1_Sub3_2.method487(arg3 + this.anInt282);
			this.aClass1_Sub1_Sub3_2.method487(local7);
			return true;
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("27062, " + 39 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local175.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "U", descriptor = "(I)V")
	private void method212(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt438 > 1) {
				this.anInt438--;
			}
			if (this.anInt410 > 0) {
				this.anInt410--;
			}
			if (this.anInt395 > 0) {
				this.anInt395 -= 2;
			}
			for (@Pc(31) int local31 = 0; local31 < 5 && this.method120(); local31++) {
			}
			if (this.aBoolean55) {
				this.method146();
				this.method160((byte) 3);
				this.method180(this.anInt330);
				@Pc(60) Class1_Sub1_Sub3 local60 = Class10.method267(this.anInt434);
				if (local60 != null) {
					this.aClass1_Sub1_Sub3_2.method485(19);
					this.aClass1_Sub1_Sub3_2.method487(local60.anInt778);
					this.aClass1_Sub1_Sub3_2.method494(local60.aByteArray9, local60.anInt778);
					local60.method484();
				}
				this.anInt408++;
				if (this.anInt408 > 750) {
					this.method178();
				}
				this.method195();
				this.method110();
				this.method210();
				this.anInt296++;
				if (this.anInt303 != 0) {
					this.anInt302 += 20;
					if (this.anInt302 >= 400) {
						this.anInt303 = 0;
					}
				}
				if (this.anInt452 != 0) {
					this.anInt449++;
					if (this.anInt449 >= 15) {
						if (this.anInt452 == 2) {
							this.aBoolean78 = true;
						}
						if (this.anInt452 == 3) {
							this.aBoolean68 = true;
						}
						this.anInt452 = 0;
					}
				}
				if (this.anInt325 != 0) {
					this.anInt359++;
					if (super.anInt232 > this.anInt326 + 5 || super.anInt232 < this.anInt326 - 5 || super.anInt233 > this.anInt327 + 5 || super.anInt233 < this.anInt327 - 5) {
						this.aBoolean75 = true;
					}
					if (super.anInt231 == 0) {
						if (this.anInt325 == 2) {
							this.aBoolean78 = true;
						}
						if (this.anInt325 == 3) {
							this.aBoolean68 = true;
						}
						this.anInt325 = 0;
						if (this.aBoolean75 && this.anInt359 >= 5) {
							this.anInt366 = -1;
							this.method139();
							if (this.anInt366 == this.anInt323 && this.anInt365 != this.anInt324) {
								@Pc(246) Class6 local246 = Class6.aClass6Array1[this.anInt323];
								@Pc(248) byte local248 = 0;
								if (this.anInt444 == 1 && local246.anInt462 == 206) {
									local248 = 1;
								}
								if (local246.anIntArray95[this.anInt365] <= 0) {
									local248 = 0;
								}
								@Pc(272) int local272;
								@Pc(275) int local275;
								if (local246.aBoolean87) {
									local272 = this.anInt324;
									local275 = this.anInt365;
									local246.anIntArray95[local275] = local246.anIntArray95[local272];
									local246.anIntArray96[local275] = local246.anIntArray96[local272];
									local246.anIntArray95[local272] = -1;
									local246.anIntArray96[local272] = 0;
								} else if (local248 == 1) {
									local272 = this.anInt324;
									local275 = this.anInt365;
									while (local272 != local275) {
										if (local272 > local275) {
											local246.method231(local272, local272 - 1);
											local272--;
										} else if (local272 < local275) {
											local246.method231(local272, local272 + 1);
											local272++;
										}
									}
								} else {
									local246.method231(this.anInt324, this.anInt365);
								}
								this.aClass1_Sub1_Sub3_2.method485(7);
								this.aClass1_Sub1_Sub3_2.method487(this.anInt323);
								this.aClass1_Sub1_Sub3_2.method487(this.anInt324);
								this.aClass1_Sub1_Sub3_2.method487(this.anInt365);
								this.aClass1_Sub1_Sub3_2.method486(local248);
							}
						} else if ((this.anInt353 == 1 || this.method163(this.anInt329, this.anInt251 - 1)) && this.anInt251 > 2) {
							this.method204();
						} else if (this.anInt251 > 0) {
							this.method133(this.anInt251 - 1);
						}
						this.anInt449 = 10;
						super.anInt237 = 0;
					}
				}
				anInt448++;
				if (anInt448 > 127) {
					anInt448 = 0;
					this.aClass1_Sub1_Sub3_2.method485(181);
					this.aClass1_Sub1_Sub3_2.method489(4991788);
				}
				@Pc(437) int local437;
				@Pc(439) int local439;
				if (Class38.anInt918 != -1) {
					local437 = Class38.anInt918;
					local439 = Class38.anInt919;
					@Pc(460) boolean local460 = this.method100(0, 0, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], 0, 0, local437, true, local439, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0]);
					Class38.anInt918 = -1;
					if (local460) {
						this.anInt300 = super.anInt238;
						this.anInt301 = super.anInt239;
						this.anInt303 = 1;
						this.anInt302 = 0;
					}
				}
				if (super.anInt237 == 1 && this.aString14 != null) {
					this.aString14 = null;
					this.aBoolean68 = true;
					super.anInt237 = 0;
				}
				this.method157();
				this.method194(this.anInt346);
				if (arg0 < 0) {
					this.method172();
					this.method176();
					if (super.anInt231 == 1 || super.anInt237 == 1) {
						this.anInt401++;
					}
					if (this.anInt396 == 2) {
						this.method205();
					}
					if (this.anInt396 == 2 && this.aBoolean56) {
						this.method118();
					}
					for (local437 = 0; local437 < 5; local437++) {
						@Pc(552) int local552 = this.anIntArray47[local437]++;
					}
					this.method228(this.anInt336);
					super.anInt230++;
					if (super.anInt230 > 4500) {
						this.anInt410 = 250;
						super.anInt230 -= 500;
						this.aClass1_Sub1_Sub3_2.method485(102);
					}
					this.anInt440++;
					if (this.anInt440 > 500) {
						this.anInt440 = 0;
						local439 = (int) (Math.random() * 8.0D);
						if ((local439 & 0x1) == 1) {
							this.anInt378 += this.anInt379;
						}
						if ((local439 & 0x2) == 2) {
							this.anInt435 += this.anInt436;
						}
						if ((local439 & 0x4) == 4) {
							this.anInt342 += this.anInt343;
						}
					}
					if (this.anInt378 < -50) {
						this.anInt379 = 2;
					}
					if (this.anInt378 > 50) {
						this.anInt379 = -2;
					}
					if (this.anInt435 < -55) {
						this.anInt436 = 2;
					}
					if (this.anInt435 > 55) {
						this.anInt436 = -2;
					}
					if (this.anInt342 < -40) {
						this.anInt343 = 1;
					}
					if (this.anInt342 > 40) {
						this.anInt343 = -1;
					}
					this.anInt400++;
					if (this.anInt400 > 500) {
						this.anInt400 = 0;
						local439 = (int) (Math.random() * 8.0D);
						if ((local439 & 0x1) == 1) {
							this.anInt248 += this.anInt249;
						}
						if ((local439 & 0x2) == 2) {
							this.anInt372 += this.anInt373;
						}
					}
					if (this.anInt248 < -60) {
						this.anInt249 = 2;
					}
					if (this.anInt248 > 60) {
						this.anInt249 = -2;
					}
					if (this.anInt372 < -20) {
						this.anInt373 = 1;
					}
					if (this.anInt372 > 10) {
						this.anInt373 = -1;
					}
					anInt271++;
					if (anInt271 > 110) {
						anInt271 = 0;
						this.aClass1_Sub1_Sub3_2.method485(94);
						this.aClass1_Sub1_Sub3_2.method490(0);
					}
					this.anInt409++;
					if (this.anInt409 > 50) {
						this.aClass1_Sub1_Sub3_2.method485(206);
					}
					try {
						if (this.aClass8_1 != null && this.aClass1_Sub1_Sub3_2.anInt778 > 0) {
							this.aClass8_1.method248(this.aClass1_Sub1_Sub3_2.anInt778, this.aClass1_Sub1_Sub3_2.aByteArray9);
							this.aClass1_Sub1_Sub3_2.anInt778 = 0;
							this.anInt409 = 0;
						}
					} catch (@Pc(813) IOException local813) {
						this.method178();
					} catch (@Pc(818) Exception local818) {
						this.method225();
					}
				}
			}
		} catch (@Pc(823) RuntimeException local823) {
			signlink.reporterror("97058, " + arg0 + ", " + local823.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[BZ)V")
	private void method213(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		try {
			signlink.anInt935 = arg0 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("96869, " + arg0 + ", " + arg1 + ", " + false + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Z")
	private boolean method214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(14) Class6 local14 = Class6.aClass6Array1[arg0];
			for (@Pc(16) int local16 = 0; local16 < local14.anIntArray99.length && local14.anIntArray99[local16] != -1; local16++) {
				@Pc(31) Class6 local31 = Class6.aClass6Array1[local14.anIntArray99[local16]];
				if (local31.anInt460 == 1) {
					local3 |= this.method214(local31.anInt458, arg1);
				}
				if (local31.anInt460 == 6 && (local31.anInt481 != -1 || local31.anInt482 != -1)) {
					@Pc(61) boolean local61 = this.method218(local31);
					@Pc(66) int local66;
					if (local61) {
						local66 = local31.anInt482;
					} else {
						local66 = local31.anInt481;
					}
					if (local66 != -1) {
						@Pc(78) Class27 local78 = Class27.aClass27Array1[local66];
						local31.anInt457 += arg1;
						while (local31.anInt457 > local78.method515(local31.anInt456)) {
							local31.anInt457 -= local78.method515(local31.anInt456) + 1;
							local31.anInt456++;
							if (local31.anInt456 >= local78.anInt812) {
								local31.anInt456 -= local78.anInt813;
								if (local31.anInt456 < 0 || local31.anInt456 >= local78.anInt812) {
									local31.anInt456 = 0;
								}
							}
							local3 = true;
						}
					}
				}
			}
			return local3;
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("75142, " + arg0 + ", " + arg1 + ", " + -450 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZII)V")
	private void method215(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		try {
			signlink.anInt934 = arg1;
			if (arg0) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("2415, " + arg0 + ", " + 5 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "V", descriptor = "(I)V")
	private void method216() {
		try {
			for (@Pc(12) Class1_Sub1_Sub1_Sub4 local12 = (Class1_Sub1_Sub1_Sub4) this.aClass31_2.method524(); local12 != null; local12 = (Class1_Sub1_Sub1_Sub4) this.aClass31_2.method526()) {
				if (local12.anInt504 != this.anInt419 || anInt367 > local12.anInt510) {
					local12.method665();
				} else if (anInt367 >= local12.anInt509) {
					if (local12.anInt513 > 0) {
						@Pc(42) Class1_Sub1_Sub1_Sub1_Sub1 local42 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local12.anInt513 - 1];
						if (local42 != null && local42.anInt128 >= 0 && local42.anInt128 < 13312 && local42.anInt129 >= 0 && local42.anInt129 < 13312) {
							local12.method254(local42.anInt128, local42.anInt129, anInt367, this.aByte7, this.method197(local42.anInt129, local12.anInt504, local42.anInt128, (byte) 2) - local12.anInt508);
						}
					}
					if (local12.anInt513 < 0) {
						@Pc(88) int local88 = -local12.anInt513 - 1;
						@Pc(94) Class1_Sub1_Sub1_Sub1_Sub2 local94;
						if (local88 == this.anInt421) {
							local94 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
						} else {
							local94 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local88];
						}
						if (local94 != null && local94.anInt128 >= 0 && local94.anInt128 < 13312 && local94.anInt129 >= 0 && local94.anInt129 < 13312) {
							local12.method254(local94.anInt128, local94.anInt129, anInt367, this.aByte7, this.method197(local94.anInt129, local12.anInt504, local94.anInt128, (byte) 2) - local12.anInt508);
						}
					}
					local12.method255(this.anInt296);
					this.aClass38_1.method589(60, (int) local12.aDouble2, local12.anInt514, (int) local12.aDouble1, -1, this.anInt419, false, (int) local12.aDouble3, local12);
				}
			}
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("65088, " + -493 + ", " + local175.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method217(@OriginalArg(0) byte arg0) {
		try {
			if (this.anInt286 != 0) {
				@Pc(5) int local5 = 0;
				if (arg0 != 4) {
					this.anInt299 = this.aClass45_1.method670();
				}
				if (this.anInt438 != 0) {
					local5 = 1;
				}
				for (@Pc(20) int local20 = 0; local20 < 100; local20++) {
					if (this.aStringArray3[local20] != null) {
						@Pc(32) int local32 = this.anIntArray56[local20];
						@Pc(37) String local37 = this.aStringArray2[local20];
						if (local37 != null && local37.startsWith("@cr1@")) {
							local37 = local37.substring(5);
						}
						if (local37 != null && local37.startsWith("@cr2@")) {
							local37 = local37.substring(5);
						}
						if ((local32 == 3 || local32 == 7) && (local32 == 7 || this.anInt416 == 0 || this.anInt416 == 1 && this.method104(local37))) {
							@Pc(90) int local90 = 329 - local5 * 13;
							if (super.anInt232 > 4 && super.anInt233 - 4 > local90 - 10 && super.anInt233 - 4 <= local90 + 3) {
								@Pc(129) int local129 = this.aClass1_Sub1_Sub2_Sub4_2.method465("From:  " + local37 + this.aStringArray3[local20]) + 25;
								if (local129 > 450) {
									local129 = 450;
								}
								if (super.anInt232 < local129 + 4) {
									if (this.anInt399 >= 1) {
										this.aStringArray1[this.anInt251] = "Report abuse @whi@" + local37;
										this.anIntArray83[this.anInt251] = 2034;
										this.anInt251++;
									}
									this.aStringArray1[this.anInt251] = "Add ignore @whi@" + local37;
									this.anIntArray83[this.anInt251] = 2436;
									this.anInt251++;
									this.aStringArray1[this.anInt251] = "Add friend @whi@" + local37;
									this.anIntArray83[this.anInt251] = 2406;
									this.anInt251++;
								}
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local32 == 5 || local32 == 6) && this.anInt416 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(242) RuntimeException local242) {
			signlink.reporterror("43008, " + arg0 + ", " + local242.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;B)Z")
	private boolean method218(@OriginalArg(0) Class6 arg0) {
		try {
			if (arg0.anIntArray97 == null) {
				return false;
			}
			for (@Pc(6) int local6 = 0; local6 < arg0.anIntArray97.length; local6++) {
				@Pc(15) int local15 = this.method223(this.anInt305, arg0, local6);
				@Pc(20) int local20 = arg0.anIntArray98[local6];
				if (arg0.anIntArray97[local6] == 2) {
					if (local15 >= local20) {
						return false;
					}
				} else if (arg0.anIntArray97[local6] == 3) {
					if (local15 <= local20) {
						return false;
					}
				} else if (arg0.anIntArray97[local6] == 4) {
					if (local15 == local20) {
						return false;
					}
				} else if (local15 != local20) {
					return false;
				}
			}
			return true;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("53014, " + arg0 + ", " + 0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIILclient!bb;Lclient!mb;)V")
	private void method219(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub1_Sub1_Sub1_Sub2 arg3, @OriginalArg(4) Class1_Sub1_Sub3 arg4) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(21) int local21;
			if ((arg1 & 0x1) == 1) {
				local21 = arg4.method496();
				@Pc(24) byte[] local24 = new byte[local21];
				@Pc(30) Class1_Sub1_Sub3 local30 = new Class1_Sub1_Sub3(local24, false);
				arg4.method505(local21, local24);
				this.aClass1_Sub1_Sub3Array1[arg2] = local30;
				arg3.method51(local30, this.anInt413);
			}
			@Pc(69) int local69;
			@Pc(81) int local81;
			if ((arg1 & 0x2) == 2) {
				local21 = arg4.method498();
				if (local21 == 65535) {
					local21 = -1;
				}
				if (local21 == arg3.anInt151) {
					arg3.anInt155 = 0;
				}
				local69 = arg4.method496();
				if (local21 == arg3.anInt151 && local21 != -1) {
					local81 = Class27.aClass27Array1[local21].anInt820;
					if (local81 == 1) {
						arg3.anInt152 = 0;
						arg3.anInt153 = 0;
						arg3.anInt154 = local69;
						arg3.anInt155 = 0;
					}
					if (local81 == 2) {
						arg3.anInt155 = 0;
					}
				} else if (local21 == -1 || arg3.anInt151 == -1 || Class27.aClass27Array1[local21].anInt814 >= Class27.aClass27Array1[arg3.anInt151].anInt814) {
					arg3.anInt151 = local21;
					arg3.anInt152 = 0;
					arg3.anInt153 = 0;
					arg3.anInt154 = local69;
					arg3.anInt155 = 0;
					arg3.anInt173 = arg3.anInt171;
				}
			}
			if ((arg1 & 0x4) == 4) {
				arg3.anInt145 = arg4.method498();
				if (arg3.anInt145 == 65535) {
					arg3.anInt145 = -1;
				}
			}
			if ((arg1 & 0x8) == 8) {
				arg3.aString3 = arg4.method503();
				arg3.anInt140 = 0;
				arg3.anInt141 = 0;
				arg3.anInt139 = 150;
				this.method106(arg3.aString4, 2, arg3.aString3);
			}
			if ((arg1 & 0x10) == 16) {
				local21 = arg4.method496();
				local69 = arg4.method496();
				arg3.method50(local69, local21);
				arg3.anInt142 = anInt367 + 300;
				arg3.anInt143 = arg4.method496();
				arg3.anInt144 = arg4.method496();
			}
			if ((arg1 & 0x20) == 32) {
				arg3.anInt146 = arg4.method498();
				arg3.anInt147 = arg4.method498();
			}
			if ((arg1 & 0x40) == 64) {
				local21 = arg4.method498();
				local69 = arg4.method496();
				local81 = arg4.method496();
				@Pc(241) int local241 = arg4.anInt778;
				if (arg3.aString4 != null && arg3.aBoolean28) {
					@Pc(251) long local251 = Class47.method675(arg3.aString4);
					@Pc(253) boolean local253 = false;
					if (local69 <= 1) {
						for (@Pc(258) int local258 = 0; local258 < this.anInt333; local258++) {
							if (this.aLongArray4[local258] == local251) {
								local253 = true;
								break;
							}
						}
					}
					if (!local253 && this.anInt380 == 0) {
						try {
							@Pc(286) String local286 = Class2.method40(local81, arg4);
							@Pc(290) String local290 = Class35.method546(local286);
							arg3.aString3 = local290;
							arg3.anInt140 = local21 >> 8;
							arg3.anInt141 = local21 & 0xFF;
							arg3.anInt139 = 150;
							if (local69 == 2 || local69 == 3) {
								this.method106("@cr2@" + arg3.aString4, 1, local290);
							} else if (local69 == 1) {
								this.method106("@cr1@" + arg3.aString4, 1, local290);
							} else {
								this.method106(arg3.aString4, 2, local290);
							}
						} catch (@Pc(354) Exception local354) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg4.anInt778 = local241 + local81;
			}
			if ((arg1 & 0x100) == 256) {
				arg3.anInt156 = arg4.method498();
				local21 = arg4.method501();
				arg3.anInt160 = local21 >> 16;
				arg3.anInt159 = anInt367 + (local21 & 0xFFFF);
				arg3.anInt157 = 0;
				arg3.anInt158 = 0;
				if (arg3.anInt159 > anInt367) {
					arg3.anInt157 = -1;
				}
				if (arg3.anInt156 == 65535) {
					arg3.anInt156 = -1;
				}
			}
			if ((arg1 & 0x200) == 512) {
				arg3.anInt161 = arg4.method496();
				arg3.anInt163 = arg4.method496();
				arg3.anInt162 = arg4.method496();
				arg3.anInt164 = arg4.method496();
				arg3.anInt165 = arg4.method498() + anInt367;
				arg3.anInt166 = arg4.method498() + anInt367;
				arg3.anInt167 = arg4.method496();
				arg3.method48();
			}
			if ((arg1 & 0x400) == 1024) {
				local21 = arg4.method496();
				local69 = arg4.method496();
				arg3.method50(local69, local21);
				arg3.anInt142 = anInt367 + 300;
				arg3.anInt143 = arg4.method496();
				arg3.anInt144 = arg4.method496();
			}
		} catch (@Pc(477) RuntimeException local477) {
			signlink.reporterror("1057, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local477.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
	private void method220(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(15) int local15 = 0; local15 < this.anInt333; local15++) {
					if (this.aLongArray4[local15] == arg0) {
						this.anInt333--;
						this.aBoolean78 = true;
						for (@Pc(35) int local35 = local15; local35 < this.anInt333; local35++) {
							this.aLongArray4[local35] = this.aLongArray4[local35 + 1];
						}
						this.aClass1_Sub1_Sub3_2.method485(4);
						this.aClass1_Sub1_Sub3_2.method492(169, arg0);
						return;
					}
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("22551, " + false + ", " + arg0 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IILclient!mb;)V")
	private void method221(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			arg1.method506();
			@Pc(11) int local11 = arg1.method507(1, this.anInt377);
			if (local11 != 0) {
				@Pc(20) int local20 = arg1.method507(2, this.anInt377);
				if (local20 == 0) {
					this.anIntArray79[this.anInt405++] = this.anInt403;
				} else {
					@Pc(44) int local44;
					@Pc(55) int local55;
					if (local20 == 1) {
						local44 = arg1.method507(3, this.anInt377);
						aClass1_Sub1_Sub1_Sub1_Sub2_1.method47(false, local44);
						local55 = arg1.method507(1, this.anInt377);
						if (local55 == 1) {
							this.anIntArray79[this.anInt405++] = this.anInt403;
						}
					} else {
						@Pc(102) int local102;
						if (local20 == 2) {
							local44 = arg1.method507(3, this.anInt377);
							aClass1_Sub1_Sub1_Sub1_Sub2_1.method47(true, local44);
							local55 = arg1.method507(3, this.anInt377);
							aClass1_Sub1_Sub1_Sub1_Sub2_1.method47(true, local55);
							local102 = arg1.method507(1, this.anInt377);
							if (local102 == 1) {
								this.anIntArray79[this.anInt405++] = this.anInt403;
							}
						} else if (local20 == 3) {
							this.anInt419 = arg1.method507(2, this.anInt377);
							local44 = arg1.method507(7, this.anInt377);
							local55 = arg1.method507(7, this.anInt377);
							local102 = arg1.method507(1, this.anInt377);
							aClass1_Sub1_Sub1_Sub1_Sub2_1.method46(local44, local55, local102 == 1);
							@Pc(163) int local163 = arg1.method507(1, this.anInt377);
							if (local163 == 1) {
								this.anIntArray79[this.anInt405++] = this.anInt403;
							}
						}
					}
				}
			}
		} catch (@Pc(180) RuntimeException local180) {
			signlink.reporterror("233, " + arg0 + ", " + -99 + ", " + arg1 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method222(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString15 = "";
				this.aString16 = "Connecting to server...";
				this.method150((byte) 1);
			}
			this.aClass8_1 = new Class8(this, 8, this.method227(anInt385 + 43594));
			@Pc(29) long local29 = Class47.method675(arg0);
			@Pc(36) int local36 = (int) (local29 >> 16 & 0x1FL);
			this.aClass1_Sub1_Sub3_2.anInt778 = 0;
			this.aClass1_Sub1_Sub3_2.method486(14);
			this.aClass1_Sub1_Sub3_2.method486(local36);
			this.aClass8_1.method248(2, this.aClass1_Sub1_Sub3_2.aByteArray9);
			for (@Pc(59) int local59 = 0; local59 < 8; local59++) {
				this.aClass8_1.method245();
			}
			@Pc(73) int local73 = this.aClass8_1.method245();
			@Pc(216) int local216;
			@Pc(251) int local251;
			if (local73 == 0) {
				this.aClass8_1.method247(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 8);
				this.aClass1_Sub1_Sub3_3.anInt778 = 0;
				this.aLong18 = this.aClass1_Sub1_Sub3_3.method502();
				@Pc(96) int[] local96 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong18 >> 32), (int) this.aLong18 };
				this.aClass1_Sub1_Sub3_2.anInt778 = 0;
				this.aClass1_Sub1_Sub3_2.method486(10);
				this.aClass1_Sub1_Sub3_2.method490(local96[0]);
				this.aClass1_Sub1_Sub3_2.method490(local96[1]);
				this.aClass1_Sub1_Sub3_2.method490(local96[2]);
				this.aClass1_Sub1_Sub3_2.method490(local96[3]);
				this.aClass1_Sub1_Sub3_2.method490(signlink.anInt929);
				this.aClass1_Sub1_Sub3_2.method493(arg0);
				this.aClass1_Sub1_Sub3_2.method493(arg1);
				this.aClass1_Sub1_Sub3_2.method511(aBigInteger2, aBigInteger1);
				this.aClass1_Sub1_Sub3_4.anInt778 = 0;
				if (arg2) {
					this.aClass1_Sub1_Sub3_4.method486(18);
				} else {
					this.aClass1_Sub1_Sub3_4.method486(16);
				}
				this.aClass1_Sub1_Sub3_4.method486(this.aClass1_Sub1_Sub3_2.anInt778 + 36 + 1 + 1);
				this.aClass1_Sub1_Sub3_4.method486(245);
				this.aClass1_Sub1_Sub3_4.method486(aBoolean67 ? 1 : 0);
				for (local216 = 0; local216 < 9; local216++) {
					this.aClass1_Sub1_Sub3_4.method490(this.anIntArray76[local216]);
				}
				this.aClass1_Sub1_Sub3_4.method494(this.aClass1_Sub1_Sub3_2.aByteArray9, this.aClass1_Sub1_Sub3_2.anInt778);
				this.aClass1_Sub1_Sub3_2.aClass45_2 = new Class45(local96, this.anInt428);
				for (local251 = 0; local251 < 4; local251++) {
					local96[local251] += 50;
				}
				this.aClass45_1 = new Class45(local96, this.anInt428);
				this.aClass8_1.method248(this.aClass1_Sub1_Sub3_4.anInt778, this.aClass1_Sub1_Sub3_4.aByteArray9);
				local73 = this.aClass8_1.method245();
			}
			if (local73 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(294) Exception local294) {
				}
				this.method222(arg0, arg1, arg2);
			} else if (local73 == 2 || local73 == 18 || local73 == 19) {
				this.anInt399 = 0;
				if (local73 == 18) {
					this.anInt399 = 1;
				}
				if (local73 == 19) {
					this.anInt399 = 2;
				}
				Class10.method266();
				this.aLong17 = 0L;
				this.anInt253 = 0;
				this.aClass11_1.anInt567 = 0;
				super.aBoolean40 = true;
				this.aBoolean71 = true;
				this.aBoolean55 = true;
				this.aClass1_Sub1_Sub3_2.anInt778 = 0;
				this.aClass1_Sub1_Sub3_3.anInt778 = 0;
				this.anInt407 = -1;
				this.anInt354 = -1;
				this.anInt355 = -1;
				this.anInt356 = -1;
				this.anInt406 = 0;
				this.anInt408 = 0;
				this.anInt438 = 0;
				this.anInt410 = 0;
				this.anInt441 = 0;
				this.anInt395 = 0;
				this.anInt251 = 0;
				this.aBoolean60 = false;
				super.anInt230 = 0;
				for (@Pc(394) int local394 = 0; local394 < 100; local394++) {
					this.aStringArray3[local394] = null;
				}
				this.anInt361 = 0;
				this.anInt313 = 0;
				this.anInt396 = 0;
				this.anInt433 = 0;
				this.anInt378 = (int) (Math.random() * 100.0D) - 50;
				this.anInt435 = (int) (Math.random() * 110.0D) - 55;
				this.anInt342 = (int) (Math.random() * 80.0D) - 40;
				this.anInt248 = (int) (Math.random() * 120.0D) - 60;
				this.anInt372 = (int) (Math.random() * 30.0D) - 20;
				this.anInt256 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				this.anInt272 = -1;
				this.anInt287 = 0;
				this.anInt288 = 0;
				this.anInt404 = 0;
				this.anInt382 = 0;
				for (local216 = 0; local216 < this.anInt402; local216++) {
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local216] = null;
					this.aClass1_Sub1_Sub3Array1[local216] = null;
				}
				for (local251 = 0; local251 < 8192; local251++) {
					this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local251] = null;
				}
				aClass1_Sub1_Sub1_Sub1_Sub2_1 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anInt403] = new Class1_Sub1_Sub1_Sub1_Sub2();
				this.aClass31_2.method528();
				this.aClass31_1.method528();
				@Pc(536) int local536;
				for (@Pc(532) int local532 = 0; local532 < 4; local532++) {
					for (local536 = 0; local536 < 104; local536++) {
						for (@Pc(540) int local540 = 0; local540 < 104; local540++) {
							this.aClass31ArrayArrayArray1[local532][local536][local540] = null;
						}
					}
				}
				this.aClass31_3 = new Class31(false);
				this.anInt331 = 0;
				this.anInt278 = -1;
				this.anInt328 = -1;
				this.anInt254 = -1;
				this.anInt268 = -1;
				this.anInt371 = -1;
				this.aBoolean58 = false;
				this.anInt370 = 3;
				this.aBoolean43 = false;
				this.aBoolean60 = false;
				this.aBoolean47 = false;
				this.aString14 = null;
				this.anInt245 = 0;
				this.anInt243 = -1;
				this.aBoolean62 = true;
				this.method167();
				for (local536 = 0; local536 < 5; local536++) {
					this.anIntArray59[local536] = 0;
				}
				anInt339 = 0;
				anInt425 = 0;
				anInt242 = 0;
				anInt368 = 0;
				anInt426 = 0;
				anInt337 = 0;
				anInt322 = 0;
				anInt388 = 0;
				anInt316 = 0;
				this.method119();
			} else if (local73 == 3) {
				this.aString15 = "";
				this.aString16 = "Invalid username or password.";
			} else if (local73 == 4) {
				this.aString15 = "Your account has been disabled.";
				this.aString16 = "Please check your message-centre for details.";
			} else if (local73 == 5) {
				this.aString15 = "Your account is already logged in.";
				this.aString16 = "Try again in 60 secs...";
			} else if (local73 == 6) {
				this.aString15 = "RuneScape has been updated!";
				this.aString16 = "Please reload this page.";
			} else if (local73 == 7) {
				this.aString15 = "This world is full.";
				this.aString16 = "Please use a different world.";
			} else if (local73 == 8) {
				this.aString15 = "Unable to connect.";
				this.aString16 = "Login server offline.";
			} else if (local73 == 9) {
				this.aString15 = "Login limit exceeded.";
				this.aString16 = "Too many connections from your address.";
			} else if (local73 == 10) {
				this.aString15 = "Unable to connect.";
				this.aString16 = "Bad session id.";
			} else if (local73 == 11) {
				this.aString16 = "Login server rejected session.";
				this.aString16 = "Please try again.";
			} else if (local73 == 12) {
				this.aString15 = "You need a members account to login to this world.";
				this.aString16 = "Please subscribe, or use a different world.";
			} else if (local73 == 13) {
				this.aString15 = "Could not complete login.";
				this.aString16 = "Please try using a different world.";
			} else if (local73 == 14) {
				this.aString15 = "The server is being updated.";
				this.aString16 = "Please wait 1 minute and try again.";
			} else if (local73 == 15) {
				this.aBoolean55 = true;
				this.aClass1_Sub1_Sub3_2.anInt778 = 0;
				this.aClass1_Sub1_Sub3_3.anInt778 = 0;
				this.anInt407 = -1;
				this.anInt354 = -1;
				this.anInt355 = -1;
				this.anInt356 = -1;
				this.anInt406 = 0;
				this.anInt408 = 0;
				this.anInt438 = 0;
				this.anInt251 = 0;
				this.aBoolean60 = false;
				this.aLong14 = System.currentTimeMillis();
			} else if (local73 == 16) {
				this.aString15 = "Login attempts exceeded.";
				this.aString16 = "Please wait 1 minute and try again.";
			} else if (local73 == 17) {
				this.aString15 = "You are standing in a members-only area.";
				this.aString16 = "To play on this world move to a free area first";
			} else if (local73 == 20) {
				this.aString15 = "Invalid loginserver requested";
				this.aString16 = "Please try using a different world.";
			} else {
				this.aString15 = "Unexpected server response";
				this.aString16 = "Please try using a different world.";
			}
		} catch (@Pc(857) IOException local857) {
			this.aString15 = "";
			this.aString16 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!d;I)I")
	private int method223(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(5) int local5 = 59 / arg0;
			if (arg1.anIntArrayArray6 == null || arg2 >= arg1.anIntArrayArray6.length) {
				return -2;
			}
			try {
				@Pc(20) int[] local20 = arg1.anIntArrayArray6[arg2];
				@Pc(22) int local22 = 0;
				@Pc(24) int local24 = 0;
				while (true) {
					@Pc(29) int local29 = local20[local24++];
					if (local29 == 0) {
						return local22;
					}
					if (local29 == 1) {
						local22 += this.anIntArray35[local20[local24++]];
					}
					if (local29 == 2) {
						local22 += this.anIntArray75[local20[local24++]];
					}
					if (local29 == 3) {
						local22 += this.anIntArray62[local20[local24++]];
					}
					@Pc(82) Class6 local82;
					@Pc(89) int local89;
					@Pc(91) int local91;
					if (local29 == 4) {
						local82 = Class6.aClass6Array1[local20[local24++]];
						local89 = local20[local24++] + 1;
						for (local91 = 0; local91 < local82.anIntArray95.length; local91++) {
							if (local82.anIntArray95[local91] == local89) {
								local22 += local82.anIntArray96[local91];
							}
						}
					}
					if (local29 == 5) {
						local22 += this.anIntArray72[local20[local24++]];
					}
					if (local29 == 6) {
						local22 += anIntArray40[this.anIntArray75[local20[local24++]] - 1];
					}
					if (local29 == 7) {
						local22 += this.anIntArray72[local20[local24++]] * 100 / 46875;
					}
					if (local29 == 8) {
						local22 += aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt177;
					}
					@Pc(172) int local172;
					if (local29 == 9) {
						for (local172 = 0; local172 < 19; local172++) {
							if (local172 == 18) {
								local172 = 20;
							}
							local22 += this.anIntArray75[local172];
						}
					}
					if (local29 == 10) {
						local82 = Class6.aClass6Array1[local20[local24++]];
						local89 = local20[local24++] + 1;
						for (local91 = 0; local91 < local82.anIntArray95.length; local91++) {
							if (local82.anIntArray95[local91] == local89) {
								local22 += 999999999;
								break;
							}
						}
					}
					if (local29 == 11) {
						local22 += this.anInt411;
					}
					if (local29 == 12) {
						local22 += this.anInt269;
					}
					if (local29 == 13) {
						local172 = this.anIntArray72[local20[local24++]];
						local89 = local20[local24++];
						local22 += (local172 & 0x1 << local89) == 0 ? 0 : 1;
					}
				}
			} catch (@Pc(275) Exception local275) {
				return -1;
			}
		} catch (@Pc(278) RuntimeException local278) {
			signlink.reporterror("39615, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local278.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "W", descriptor = "(I)V")
	private void method224() {
		try {
			for (@Pc(14) Class1_Sub1_Sub1_Sub6 local14 = (Class1_Sub1_Sub1_Sub6) this.aClass31_1.method524(); local14 != null; local14 = (Class1_Sub1_Sub1_Sub6) this.aClass31_1.method526()) {
				if (local14.anInt573 != this.anInt419 || local14.aBoolean128) {
					local14.method665();
				} else if (anInt367 >= local14.anInt572) {
					local14.method316(this.anInt296);
					if (local14.aBoolean128) {
						local14.method665();
					} else {
						this.aClass38_1.method589(60, local14.anInt575, 0, local14.anInt574, -1, local14.anInt573, false, local14.anInt576, local14);
					}
				}
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("72813, " + 1 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "X", descriptor = "(I)V")
	private void method225() {
		try {
			try {
				if (this.aClass8_1 != null) {
					this.aClass8_1.method244();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass8_1 = null;
			this.aBoolean55 = false;
			this.anInt397 = 0;
			this.aString5 = "";
			this.aString6 = "";
			Class10.method266();
			this.method140();
			this.aClass38_1.method578();
			for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
				this.aClass19Array1[local40].method412();
			}
			System.gc();
			this.method186();
			this.anInt250 = -1;
			this.anInt319 = -1;
			this.anInt285 = 0;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("89427, " + -956 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;IIILjava/lang/String;I)Lclient!yb;")
	private Class46 method226(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(7) byte[] local7 = null;
			@Pc(9) int local9 = 5;
			try {
				if (this.aClass44Array1[0] != null) {
					local7 = this.aClass44Array1[0].method666(arg2);
				}
			} catch (@Pc(24) Exception local24) {
			}
			@Pc(38) int local38;
			if (local7 != null) {
				this.aCRC32_1.reset();
				this.aCRC32_1.update(local7);
				local38 = (int) this.aCRC32_1.getValue();
				if (local38 != arg3) {
					local7 = null;
				}
			}
			if (local7 != null) {
				return new Class46(4, local7);
			}
			local38 = 0;
			while (local7 == null) {
				@Pc(59) String local59 = "Unknown error";
				this.method97("Requesting " + arg0, arg5);
				@Pc(74) int local74;
				try {
					local74 = 0;
					@Pc(85) DataInputStream local85 = this.method154(arg4 + arg3);
					@Pc(88) byte[] local88 = new byte[6];
					local85.readFully(local88, 0, 6);
					@Pc(99) Class1_Sub1_Sub3 local99 = new Class1_Sub1_Sub3(local88, false);
					local99.anInt778 = 3;
					@Pc(107) int local107 = local99.method500() + 6;
					@Pc(109) int local109 = 6;
					local7 = new byte[local107];
					for (@Pc(114) int local114 = 0; local114 < 6; local114++) {
						local7[local114] = local88[local114];
					}
					@Pc(131) int local131;
					while (local109 < local107) {
						local131 = local107 - local109;
						if (local131 > 1000) {
							local131 = 1000;
						}
						@Pc(142) int local142 = local85.read(local7, local109, local131);
						if (local142 < 0) {
							(new StringBuffer("Length error: ")).append(local109).append("/").append(local107).toString();
							throw new IOException("EOF");
						}
						local109 += local142;
						@Pc(171) int local171 = local109 * 100 / local107;
						if (local171 != local74) {
							this.method97("Loading " + arg0 + " - " + local171 + "%", arg5);
						}
						local74 = local171;
					}
					local85.close();
					try {
						if (this.aClass44Array1[0] != null) {
							this.aClass44Array1[0].method667(local7, arg2, local7.length);
						}
					} catch (@Pc(216) Exception local216) {
						this.aClass44Array1[0] = null;
					}
					if (local7 != null) {
						this.aCRC32_1.reset();
						this.aCRC32_1.update(local7);
						local131 = (int) this.aCRC32_1.getValue();
						if (local131 != arg3) {
							local7 = null;
							local38++;
							local59 = "Checksum error: " + local131;
						}
					}
				} catch (@Pc(251) IOException local251) {
					if (local59.equals("Unknown error")) {
						local59 = "Connection error";
					}
					local7 = null;
				} catch (@Pc(261) NullPointerException local261) {
					local59 = "Null error";
					local7 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(270) ArrayIndexOutOfBoundsException local270) {
					local59 = "Bounds error";
					local7 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(279) Exception local279) {
					local59 = "Unexpected error";
					local7 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local7 == null) {
					for (local74 = local9; local74 > 0; local74--) {
						if (local38 >= 3) {
							this.method97("Game updated - please reload page", arg5);
							local74 = 10;
						} else {
							this.method97(local59 + " - Retrying in " + local74, arg5);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(323) Exception local323) {
						}
					}
					local9 *= 2;
					if (local9 > 60) {
						local9 = 60;
					}
				}
			}
			return new Class46(4, local7);
		} catch (@Pc(347) RuntimeException local347) {
			signlink.reporterror("5001, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local347.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "(I)Ljava/net/Socket;")
	public Socket method227(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "(I)V")
	private void method228(@OriginalArg(0) int arg0) {
		try {
			@Pc(11) int local11;
			if (arg0 < this.anInt336 || arg0 > this.anInt336) {
				for (local11 = 1; local11 > 0; local11++) {
				}
			}
			while (true) {
				do {
					while (true) {
						local11 = this.method89();
						if (local11 == -1) {
							return;
						}
						if (this.anInt254 != -1 && this.anInt254 == this.anInt430) {
							if (local11 == 8 && this.aString17.length() > 0) {
								this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
							}
							break;
						}
						@Pc(200) int local200;
						if (this.aBoolean47) {
							if (local11 >= 32 && local11 <= 122 && this.aString12.length() < 80) {
								this.aString12 = this.aString12 + (char) local11;
								this.aBoolean68 = true;
							}
							if (local11 == 8 && this.aString12.length() > 0) {
								this.aString12 = this.aString12.substring(0, this.aString12.length() - 1);
								this.aBoolean68 = true;
							}
							if (local11 == 13 || local11 == 10) {
								this.aBoolean47 = false;
								this.aBoolean68 = true;
								@Pc(160) long local160;
								if (this.anInt443 == 1) {
									local160 = Class47.method675(this.aString12);
									this.method201(local160);
								}
								if (this.anInt443 == 2 && this.anInt331 > 0) {
									local160 = Class47.method675(this.aString12);
									this.method142(local160);
								}
								if (this.anInt443 == 3 && this.aString12.length() > 0) {
									this.aClass1_Sub1_Sub3_2.method485(99);
									this.aClass1_Sub1_Sub3_2.method486(0);
									local200 = this.aClass1_Sub1_Sub3_2.anInt778;
									this.aClass1_Sub1_Sub3_2.method492(169, this.aLong15);
									Class2.method41(this.aClass1_Sub1_Sub3_2, this.aString12);
									this.aClass1_Sub1_Sub3_2.method495(this.aClass1_Sub1_Sub3_2.anInt778 - local200);
									this.aString12 = Class47.method680(this.aString12);
									this.aString12 = Class35.method546(this.aString12);
									this.method106(Class47.method679(Class47.method676(this.aLong15)), 6, this.aString12);
									if (this.anInt416 == 2) {
										this.anInt416 = 1;
										this.aBoolean65 = true;
										this.aClass1_Sub1_Sub3_2.method485(8);
										this.aClass1_Sub1_Sub3_2.method486(this.anInt358);
										this.aClass1_Sub1_Sub3_2.method486(this.anInt416);
										this.aClass1_Sub1_Sub3_2.method486(this.anInt386);
									}
								}
								if (this.anInt443 == 4 && this.anInt333 < 100) {
									local160 = Class47.method675(this.aString12);
									this.method138(local160);
								}
								if (this.anInt443 == 5 && this.anInt333 > 0) {
									local160 = Class47.method675(this.aString12);
									this.method220(local160);
								}
							}
						} else if (this.aBoolean43) {
							if (local11 >= 48 && local11 <= 57 && this.aString10.length() < 10) {
								this.aString10 = this.aString10 + (char) local11;
								this.aBoolean68 = true;
							}
							if (local11 == 8 && this.aString10.length() > 0) {
								this.aString10 = this.aString10.substring(0, this.aString10.length() - 1);
								this.aBoolean68 = true;
							}
							if (local11 == 13 || local11 == 10) {
								if (this.aString10.length() > 0) {
									local200 = 0;
									try {
										local200 = Integer.parseInt(this.aString10);
									} catch (@Pc(376) Exception local376) {
									}
									this.aClass1_Sub1_Sub3_2.method485(241);
									this.aClass1_Sub1_Sub3_2.method490(local200);
								}
								this.aBoolean43 = false;
								this.aBoolean68 = true;
							}
						} else if (this.anInt328 == -1) {
							if (local11 >= 32 && local11 <= 122 && this.aString8.length() < 80) {
								this.aString8 = this.aString8 + (char) local11;
								this.aBoolean68 = true;
							}
							if (local11 == 8 && this.aString8.length() > 0) {
								this.aString8 = this.aString8.substring(0, this.aString8.length() - 1);
								this.aBoolean68 = true;
							}
							if ((local11 == 13 || local11 == 10) && this.aString8.length() > 0) {
								if (this.anInt399 == 2) {
									if (this.aString8.equals("::clientdrop")) {
										this.method178();
									}
									if (this.aString8.equals("::lag")) {
										this.method99();
									}
									if (this.aString8.equals("::prefetchmusic")) {
										for (local200 = 0; local200 < this.aClass43_Sub1_1.method646(2); local200++) {
											this.aClass43_Sub1_1.method656(local200, 2, (byte) 1);
										}
									}
								}
								if (this.aString8.startsWith("::")) {
									this.aClass1_Sub1_Sub3_2.method485(11);
									this.aClass1_Sub1_Sub3_2.method486(this.aString8.length() - 1);
									this.aClass1_Sub1_Sub3_2.method493(this.aString8.substring(2));
								} else {
									@Pc(527) byte local527 = 0;
									if (this.aString8.startsWith("yellow:")) {
										local527 = 0;
										this.aString8 = this.aString8.substring(7);
									}
									if (this.aString8.startsWith("red:")) {
										local527 = 1;
										this.aString8 = this.aString8.substring(4);
									}
									if (this.aString8.startsWith("green:")) {
										local527 = 2;
										this.aString8 = this.aString8.substring(6);
									}
									if (this.aString8.startsWith("cyan:")) {
										local527 = 3;
										this.aString8 = this.aString8.substring(5);
									}
									if (this.aString8.startsWith("purple:")) {
										local527 = 4;
										this.aString8 = this.aString8.substring(7);
									}
									if (this.aString8.startsWith("white:")) {
										local527 = 5;
										this.aString8 = this.aString8.substring(6);
									}
									if (this.aString8.startsWith("flash1:")) {
										local527 = 6;
										this.aString8 = this.aString8.substring(7);
									}
									if (this.aString8.startsWith("flash2:")) {
										local527 = 7;
										this.aString8 = this.aString8.substring(7);
									}
									if (this.aString8.startsWith("flash3:")) {
										local527 = 8;
										this.aString8 = this.aString8.substring(7);
									}
									if (this.aString8.startsWith("glow1:")) {
										local527 = 9;
										this.aString8 = this.aString8.substring(6);
									}
									if (this.aString8.startsWith("glow2:")) {
										local527 = 10;
										this.aString8 = this.aString8.substring(6);
									}
									if (this.aString8.startsWith("glow3:")) {
										local527 = 11;
										this.aString8 = this.aString8.substring(6);
									}
									@Pc(685) byte local685 = 0;
									if (this.aString8.startsWith("wave:")) {
										local685 = 1;
										this.aString8 = this.aString8.substring(5);
									}
									if (this.aString8.startsWith("scroll:")) {
										local685 = 2;
										this.aString8 = this.aString8.substring(7);
									}
									this.aClass1_Sub1_Sub3_2.method485(78);
									this.aClass1_Sub1_Sub3_2.method486(0);
									@Pc(724) int local724 = this.aClass1_Sub1_Sub3_2.anInt778;
									this.aClass1_Sub1_Sub3_2.method486(local527);
									this.aClass1_Sub1_Sub3_2.method486(local685);
									Class2.method41(this.aClass1_Sub1_Sub3_2, this.aString8);
									this.aClass1_Sub1_Sub3_2.method495(this.aClass1_Sub1_Sub3_2.anInt778 - local724);
									this.aString8 = Class47.method680(this.aString8);
									this.aString8 = Class35.method546(this.aString8);
									aClass1_Sub1_Sub1_Sub1_Sub2_1.aString3 = this.aString8;
									aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt140 = local527;
									aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt141 = local685;
									aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt139 = 150;
									if (this.anInt399 == 2) {
										this.method106("@cr2@" + aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4, 2, aClass1_Sub1_Sub1_Sub1_Sub2_1.aString3);
									} else if (this.anInt399 == 1) {
										this.method106("@cr1@" + aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4, 2, aClass1_Sub1_Sub1_Sub1_Sub2_1.aString3);
									} else {
										this.method106(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4, 2, aClass1_Sub1_Sub1_Sub1_Sub2_1.aString3);
									}
									if (this.anInt358 == 2) {
										this.anInt358 = 3;
										this.aBoolean65 = true;
										this.aClass1_Sub1_Sub3_2.method485(8);
										this.aClass1_Sub1_Sub3_2.method486(this.anInt358);
										this.aClass1_Sub1_Sub3_2.method486(this.anInt416);
										this.aClass1_Sub1_Sub3_2.method486(this.anInt386);
									}
								}
								this.aString8 = "";
								this.aBoolean68 = true;
							}
						}
					}
				} while ((local11 < 97 || local11 > 122) && (local11 < 65 || local11 > 90) && (local11 < 48 || local11 > 57) && local11 != 32);
				if (this.aString17.length() < 12) {
					this.aString17 = this.aString17 + (char) local11;
				}
			}
		} catch (@Pc(860) RuntimeException local860) {
			signlink.reporterror("16125, " + arg0 + ", " + local860.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "(I)V")
	private void method229() {
		try {
			this.aClass37_12.method574(this.aByte9);
			Class1_Sub1_Sub2_Sub1.anIntArray184 = this.anIntArray37;
			this.aClass1_Sub1_Sub2_Sub3_8.method443(0, 200, 0);
			if (this.anInt268 != -1) {
				this.method144(Class6.aClass6Array1[this.anInt268], 0, 0, 0);
			} else if (this.anIntArray94[this.anInt370] != -1) {
				this.method144(Class6.aClass6Array1[this.anIntArray94[this.anInt370]], 0, 0, 0);
			}
			if (this.aBoolean60 && this.anInt390 == 1) {
				this.method109();
			}
			this.aClass37_12.method575(553, super.aGraphics2, 205);
			this.aClass37_14.method574(this.aByte9);
			Class1_Sub1_Sub2_Sub1.anIntArray184 = this.anIntArray38;
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("2979, " + 8 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}
}
