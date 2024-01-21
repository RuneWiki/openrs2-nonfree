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

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
	public static int anInt268;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
	private static int anInt271;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
	private static int anInt296;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
	private static int anInt302;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
	private static int anInt319;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "I")
	public static int anInt329;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "Z")
	private static boolean aBoolean57;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
	private static int anInt331;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "I")
	private static int anInt337;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
	private static int anInt344;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "Z")
	private static boolean aBoolean63;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "I")
	private static int anInt360;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
	private static int anInt362;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
	private static int anInt376;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
	private static int anInt380;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
	private static int anInt381;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private static int anInt382;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "I")
	private static int anInt417;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "Lclient!bb;")
	public static Class1_Sub1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "I")
	private static int anInt449;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
	private static int anInt451;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "Z")
	private static boolean aBoolean86;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "[I")
	public static final int[] anIntArray39 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "B")
	private static byte aByte16 = 8;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
	private static int anInt299 = 9;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "I")
	private static int anInt328 = 10;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "Z")
	private static boolean aBoolean56 = true;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "Z")
	private static boolean aBoolean58 = true;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "[[I")
	public static final int[][] anIntArrayArray4 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "[I")
	private static int[] anIntArray63 = new int[32];

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "Ljava/lang/String;")
	private static String aString13;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "[I")
	private static int[] anIntArray78;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "Z")
	private static boolean aBoolean75;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "I")
	private static int anInt453;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "Z")
	private static boolean aBoolean89;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "[I")
	private int[] anIntArray34;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "[I")
	private int[] anIntArray35;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "I")
	private int anInt251;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "I")
	private int anInt252;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "I")
	private int anInt253;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "I")
	private int anInt254;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "I")
	private int anInt255;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
	private int anInt258;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	private int anInt259;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
	private int anInt260;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
	private int anInt261;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "I")
	private int anInt262;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
	private int anInt263;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
	private int anInt264;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	private int anInt265;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	private int anInt266;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	private int anInt267;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_1;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_2;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
	private int anInt269;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	private int anInt270;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	private int anInt272;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
	private int anInt273;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
	private int anInt274;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private int anInt276;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
	private int anInt277;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
	private int anInt278;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
	private int anInt279;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
	private int anInt280;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "[I")
	private int[] anIntArray42;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "[I")
	private int[] anIntArray43;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "[I")
	private int[] anIntArray44;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
	private int anInt281;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
	private int anInt284;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
	private int anInt286;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "I")
	private int anInt287;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_6;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_7;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
	private int anInt288;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
	private int anInt289;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
	private int anInt292;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "I")
	private int anInt293;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "Lclient!xb;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
	private int anInt294;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
	private int anInt295;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "I")
	private int anInt298;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
	private int anInt300;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
	private int anInt301;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
	private int anInt303;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
	private int anInt304;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
	private int anInt305;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "I")
	private int anInt306;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "I")
	private int anInt307;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
	private int anInt308;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
	private int anInt309;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
	private int anInt310;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "I")
	private int anInt311;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "Lclient!rb;")
	private Class37 aClass37_3;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "Lclient!rb;")
	private Class37 aClass37_4;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "Lclient!rb;")
	private Class37 aClass37_5;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "Lclient!rb;")
	private Class37 aClass37_6;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "Lclient!rb;")
	private Class37 aClass37_7;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "Lclient!rb;")
	private Class37 aClass37_8;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "Lclient!rb;")
	private Class37 aClass37_9;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "Lclient!rb;")
	private Class37 aClass37_10;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "Lclient!rb;")
	private Class37 aClass37_11;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "I")
	private int anInt313;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
	private int anInt314;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "I")
	private int anInt315;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
	private int anInt316;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
	private int anInt317;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "Ljava/lang/String;")
	private String aString8;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "Lclient!e;")
	private Class8 aClass8_1;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
	private int anInt318;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "Lclient!rb;")
	private Class37 aClass37_12;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "Lclient!rb;")
	private Class37 aClass37_13;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "Lclient!rb;")
	private Class37 aClass37_14;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "Lclient!rb;")
	private Class37 aClass37_15;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "Lclient!rb;")
	private Class37 aClass37_16;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "Lclient!rb;")
	private Class37 aClass37_17;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "Lclient!rb;")
	private Class37 aClass37_18;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "Lclient!rb;")
	private Class37 aClass37_19;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "Lclient!rb;")
	private Class37 aClass37_20;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "I")
	private int anInt322;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
	private int anInt323;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
	private int anInt325;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "I")
	private int anInt326;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_8;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_9;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_10;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_11;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_12;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
	private int anInt330;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
	private int anInt332;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "I")
	private int anInt333;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "I")
	private int anInt334;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
	private int anInt335;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
	private int anInt336;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
	private int anInt338;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
	private int anInt340;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
	private int anInt341;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "I")
	private int anInt342;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "I")
	private int anInt343;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "J")
	private long aLong16;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "Lclient!vb;")
	private Class45_Sub1 aClass45_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
	private int anInt346;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_6;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
	private int anInt348;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_7;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_8;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
	private int anInt349;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
	private int anInt354;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "Ljava/lang/String;")
	private String aString11;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
	private int anInt356;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private int anInt357;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
	private int anInt358;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private int anInt359;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "Ljava/lang/String;")
	private String aString12;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "I")
	private int anInt361;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_9;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_10;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
	private int anInt363;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
	private int anInt364;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "I")
	private int anInt365;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "I")
	private int anInt366;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
	private int anInt367;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
	private int anInt368;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "Lclient!s;")
	private Class39 aClass39_1;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "I")
	private int anInt369;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
	private int anInt370;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "[I")
	private int[] anIntArray52;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "[I")
	private int[] anIntArray53;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "[I")
	private int[] anIntArray54;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
	private int anInt371;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private int anInt373;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
	private int anInt374;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "[I")
	private int[] anIntArray56;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "[I")
	private int[] anIntArray57;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
	private int anInt377;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private int anInt378;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "[[B")
	private byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
	private int anInt383;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
	private int anInt385;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
	private int anInt386;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
	private int anInt387;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_11;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_12;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_13;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_14;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
	private int anInt390;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "I")
	private int anInt391;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
	private int anInt392;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "I")
	private int anInt393;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
	private int anInt394;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "[Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array3;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
	private int anInt397;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
	private int anInt398;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_1;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_2;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
	private int anInt400;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "I")
	private int anInt401;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
	private int anInt403;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "I")
	private int anInt404;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
	private int anInt405;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "I")
	private int anInt409;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "I")
	private int anInt410;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "I")
	private int anInt411;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "I")
	private int anInt412;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "I")
	private int anInt413;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_15;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_16;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_17;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "I")
	private int anInt415;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
	private int anInt418;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "Lclient!rb;")
	private Class37 aClass37_21;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "Lclient!rb;")
	private Class37 aClass37_22;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "Lclient!rb;")
	private Class37 aClass37_23;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "I")
	private int anInt419;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
	private int anInt420;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
	private int anInt421;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
	private int anInt422;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "I")
	private int anInt423;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
	private int anInt424;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "Lclient!rb;")
	private Class37 aClass37_24;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "Lclient!rb;")
	private Class37 aClass37_25;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "Lclient!rb;")
	private Class37 aClass37_26;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "Lclient!rb;")
	private Class37 aClass37_27;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
	private int anInt427;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "I")
	private int anInt428;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "I")
	private int anInt429;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
	private int anInt430;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
	private int anInt431;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
	private int anInt432;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
	private int anInt433;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "J")
	private long aLong17;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
	private int anInt434;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
	private int anInt435;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
	private int anInt436;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
	private int anInt437;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "I")
	private int anInt440;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "I")
	private int anInt441;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "I")
	private int anInt442;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "I")
	private int anInt443;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "Ljava/lang/String;")
	private String aString17;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "Lclient!fc;")
	private Class11 aClass11_1;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "Lclient!yb;")
	private Class48 aClass48_1;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
	private int anInt444;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
	private int anInt445;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
	private int anInt446;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
	private int anInt447;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "I")
	private int anInt452;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "I")
	private int anInt456;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "I")
	private int anInt457;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "I")
	private int anInt458;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_13;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "I")
	private int anInt460;

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_18;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_19;

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_20;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "[I")
	private int[] anIntArray92;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "[I")
	private int[] anIntArray93;

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "[I")
	private int[] anIntArray94;

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "[I")
	private int[] anIntArray95;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "I")
	private int anInt256 = 3;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "I")
	private int anInt257 = 9;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "Z")
	private boolean aBoolean44 = false;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "[I")
	private int[] anIntArray36 = new int[Class29.anInt855];

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "Z")
	private boolean aBoolean45 = false;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Z")
	private boolean aBoolean46 = false;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "[I")
	private int[] anIntArray37 = new int[1000];

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "[I")
	private int[] anIntArray38 = new int[2000];

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "[Lclient!jc;")
	private Class19[] aClass19Array1 = new Class19[4];

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
	private int anInt275 = 2;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "Z")
	private boolean aBoolean48 = false;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "[I")
	private int[] anIntArray40 = new int[5];

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "[I")
	private int[] anIntArray41 = new int[50];

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "[B")
	private byte[] aByteArray2 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
	private int anInt282 = 8;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "Ljava/lang/String;")
	private String aString5 = "";

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "Ljava/lang/String;")
	private String aString6 = "";

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "I")
	private int anInt283 = -302;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array3 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "B")
	private byte aByte13 = 2;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "B")
	private byte aByte14 = 56;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "Z")
	private boolean aBoolean49 = false;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "Z")
	private boolean aBoolean50 = true;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
	private int anInt285 = -1;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "B")
	private byte aByte15 = -36;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "Z")
	private boolean aBoolean51 = false;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "[I")
	private int[] anIntArray45 = new int[Class29.anInt855];

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "Z")
	private boolean aBoolean52 = false;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
	private int anInt290 = -1;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "I")
	private int anInt291 = -1;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "Lclient!pb;")
	private Class31 aClass31_1 = new Class31(aBoolean58);

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "Ljava/lang/String;")
	private String aString7 = "";

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
	private int anInt297 = 432;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "B")
	private byte aByte17 = -15;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "[[I")
	private int[][] anIntArrayArray2 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "Z")
	private boolean aBoolean53 = true;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "B")
	private byte aByte18 = -51;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
	private int anInt312 = -1;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "Lclient!mb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_2 = Class1_Sub1_Sub3.method485();

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
	private int anInt320 = 2048;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "I")
	private int anInt321 = 2047;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "[Lclient!bb;")
	private Class1_Sub1_Sub1_Sub1_Sub2[] aClass1_Sub1_Sub1_Sub1_Sub2Array1 = new Class1_Sub1_Sub1_Sub1_Sub2[this.anInt320];

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "[I")
	private int[] anIntArray46 = new int[this.anInt320];

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "[I")
	private int[] anIntArray47 = new int[this.anInt320];

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "[Lclient!mb;")
	private Class1_Sub1_Sub3[] aClass1_Sub1_Sub3Array1 = new Class1_Sub1_Sub3[this.anInt320];

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
	private int anInt324 = 724;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "I")
	private int anInt327 = -43533;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "Lclient!d;")
	private Class6 aClass6_1 = new Class6();

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "Z")
	private boolean aBoolean54 = true;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "Z")
	private boolean aBoolean55 = false;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray1 = new String[500];

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array4 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "[I")
	private int[] anIntArray48 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "be", descriptor = "[Z")
	private boolean[] aBooleanArray4 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "[I")
	private int[] anIntArray49 = new int[50];

	@OriginalMember(owner = "client!client", name = "le", descriptor = "Lclient!pb;")
	private Class31 aClass31_2 = new Class31(aBoolean58);

	@OriginalMember(owner = "client!client", name = "me", descriptor = "[Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array1 = new Class1_Sub1_Sub2_Sub3[50];

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "Z")
	private boolean aBoolean59 = true;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private int anInt339 = 128;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "Z")
	private boolean aBoolean61 = false;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "Z")
	private boolean aBoolean62 = false;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
	private int anInt345 = 7759444;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "[Lclient!wb;")
	public Class46[] aClass46Array1 = new Class46[5];

	@OriginalMember(owner = "client!client", name = "De", descriptor = "Z")
	private boolean aBoolean64 = false;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "[I")
	private int[] anIntArray50 = new int[256];

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "Z")
	private boolean aBoolean65 = false;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "Ljava/lang/String;")
	private String aString9 = "";

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "Ljava/lang/String;")
	private String aString10 = "";

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
	private int anInt350 = -1;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
	private int anInt351 = -1;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "Z")
	private boolean aBoolean66 = false;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
	private int anInt352 = -1;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private int anInt353 = 3353893;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "af", descriptor = "Lclient!mb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_3 = Class1_Sub1_Sub3.method485();

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
	private int anInt355 = 1;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "[I")
	private int[] anIntArray51 = new int[151];

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "[Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array2 = new Class1_Sub1_Sub2_Sub3[13];

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "[[I")
	private int[][] anIntArrayArray3 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "[I")
	private int[] anIntArray55 = new int[200];

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "[[[Lclient!pb;")
	private Class31[][][] aClass31ArrayArrayArray1 = new Class31[4][104][104];

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "I")
	private int anInt372 = 883;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
	private int anInt375 = 2;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "Z")
	private boolean aBoolean68 = false;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
	private int anInt379 = -1;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "Z")
	private boolean aBoolean69 = false;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "[I")
	private int[] anIntArray58 = new int[500];

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "[I")
	private int[] anIntArray59 = new int[500];

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "[I")
	private int[] anIntArray60 = new int[500];

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "[I")
	private int[] anIntArray61 = new int[500];

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
	private int anInt384 = -1;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "[Lclient!ab;")
	private Class1_Sub1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1_Sub1Array1 = new Class1_Sub1_Sub1_Sub1_Sub1[16384];

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "[I")
	private int[] anIntArray62 = new int[16384];

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "I")
	private int anInt388 = 253;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "[J")
	private long[] aLongArray4 = new long[200];

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
	private int anInt389 = 644;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "[I")
	private int[] anIntArray64 = new int[Class29.anInt855];

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "[I")
	private int[] anIntArray65 = new int[33];

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "Z")
	public boolean aBoolean70 = false;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "[I")
	private int[] anIntArray66 = new int[5];

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "Z")
	private boolean aBoolean71 = true;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
	private int anInt395 = 6;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
	private final int anInt396 = 100;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "[I")
	private int[] anIntArray67 = new int[100];

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray2 = new String[200];

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "[I")
	private int[] anIntArray68 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "[I")
	private int[] anIntArray69 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
	private int anInt399 = -1;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "Ljava/lang/String;")
	private String aString14 = "";

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "I")
	private int anInt402 = 2;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "I")
	private int anInt406 = 50;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "[I")
	private int[] anIntArray70 = new int[this.anInt406];

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "[I")
	private int[] anIntArray71 = new int[this.anInt406];

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "[I")
	private int[] anIntArray72 = new int[this.anInt406];

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "[I")
	private int[] anIntArray73 = new int[this.anInt406];

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "[I")
	private int[] anIntArray74 = new int[this.anInt406];

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "[I")
	private int[] anIntArray75 = new int[this.anInt406];

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "[I")
	private int[] anIntArray76 = new int[this.anInt406];

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray3 = new String[this.anInt406];

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "Z")
	private boolean aBoolean72 = false;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "I")
	private int anInt407 = -1;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "I")
	private int anInt408 = 5063219;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "[I")
	private int[] anIntArray77 = new int[33];

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "[I")
	private int[] anIntArray79 = new int[9];

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "Z")
	private boolean aBoolean73 = true;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
	private int anInt414 = 9;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "Z")
	private boolean aBoolean74 = true;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
	private int anInt416 = -1;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "Ljava/lang/String;")
	private String aString15 = "";

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "[I")
	private int[] anIntArray80 = new int[7];

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "[I")
	private int[] anIntArray81 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "[I")
	private int[] anIntArray82 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "[I")
	private int[] anIntArray83 = new int[50];

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "[I")
	private int[] anIntArray84 = new int[5];

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
	private int anInt425 = 17979;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "I")
	private int anInt426 = 28009;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "B")
	private byte aByte19 = -57;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "Z")
	private boolean aBoolean76 = true;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "Z")
	private boolean aBoolean77 = true;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "Z")
	private boolean aBoolean78 = false;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "B")
	private byte aByte20 = 0;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "Z")
	private boolean aBoolean79 = false;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "[I")
	private int[] anIntArray85 = new int[5];

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "B")
	private byte aByte21 = 6;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "[I")
	private int[] anIntArray86 = new int[151];

	@OriginalMember(owner = "client!client", name = "si", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
	private int anInt438 = -208;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "B")
	private byte aByte22 = -61;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "Z")
	private boolean aBoolean81 = true;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "Ljava/lang/String;")
	private String aString16 = "";

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "Z")
	private boolean aBoolean82 = true;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array5 = new Class1_Sub1_Sub2_Sub2[50];

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "[I")
	private int[] anIntArray87 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
	private int anInt439 = 889;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "Lclient!pb;")
	private Class31 aClass31_3 = new Class31(aBoolean58);

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "B")
	private byte aByte23 = 5;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "[Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array4 = new Class1_Sub1_Sub2_Sub3[2];

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
	private int anInt448 = 1;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "Z")
	private boolean aBoolean83 = false;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "[I")
	private final int[] anIntArray88 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "B")
	private byte aByte24 = 53;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "[I")
	private int[] anIntArray89 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
	private int anInt450 = -938;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "Z")
	private boolean aBoolean84 = false;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "Z")
	private boolean aBoolean85 = false;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array6 = new Class1_Sub1_Sub2_Sub2[1000];

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "Z")
	private boolean aBoolean87 = true;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "Z")
	private boolean aBoolean88 = false;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "[I")
	private int[] anIntArray90 = new int[100];

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray4 = new String[100];

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray5 = new String[100];

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "[I")
	private int[] anIntArray91 = new int[5];

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
	private int anInt454 = -1;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
	private int anInt455 = 809;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "Ljava/lang/String;")
	private String aString18 = "";

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array7 = new Class1_Sub1_Sub2_Sub2[8];

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "B")
	private byte aByte25 = 9;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "I")
	private int anInt459 = 78;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "[[I")
	private int[][] anIntArrayArray5 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "I")
	private int anInt461 = -1;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "Lclient!mb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_4 = Class1_Sub1_Sub3.method485();

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "B")
	private byte aByte26 = 5;

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "I")
	private int anInt462 = 2301979;

	static {
		@Pc(346) int local346 = 2;
		@Pc(348) int local348;
		for (local348 = 0; local348 < 32; local348++) {
			anIntArray63[local348] = local346 - 1;
			local346 += local346;
		}
		aString13 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		anIntArray78 = new int[99];
		local346 = 0;
		for (local348 = 0; local348 < 99; local348++) {
			@Pc(377) int local377 = local348 + 1;
			@Pc(390) int local390 = (int) ((double) local377 + Math.pow(2.0D, (double) local377 / 7.0D) * 300.0D);
			local346 += local390;
			anIntArray78[local348] = local346 / 4;
		}
		aBoolean75 = true;
		aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		anInt453 = 5100;
		aBoolean89 = true;
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private static void method118(@OriginalArg(0) byte arg0) {
		try {
			Class39.aBoolean212 = false;
			Class1_Sub1_Sub2_Sub1.aBoolean152 = false;
			@Pc(10) boolean local10 = false;
			aBoolean57 = false;
			Class4.aBoolean34 = false;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("96930, " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	private static String method126(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("24486, " + arg0 + ", " + true + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBI)Ljava/lang/String;")
	private static String method190(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg1 != -36) {
				throw new NullPointerException();
			}
			@Pc(10) int local10 = arg2 - arg0;
			if (local10 < -9) {
				return "@red@";
			} else if (local10 < -6) {
				return "@or3@";
			} else if (local10 < -3) {
				return "@or2@";
			} else if (local10 < 0) {
				return "@or1@";
			} else if (local10 > 9) {
				return "@gre@";
			} else if (local10 > 6) {
				return "@gr3@";
			} else if (local10 > 3) {
				return "@gr2@";
			} else if (local10 > 0) {
				return "@gr1@";
			} else {
				return "@yel@";
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("73813, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private static void method191() {
		try {
			Class39.aBoolean212 = true;
			Class1_Sub1_Sub2_Sub1.aBoolean152 = true;
			aBoolean57 = true;
			Class4.aBoolean34 = true;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("67356, " + -502 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)Ljava/lang/String;")
	private static String method201(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) String local4 = String.valueOf(arg0);
			for (@Pc(15) int local15 = local4.length() - 3; local15 > 0; local15 -= 3) {
				local4 = local4.substring(0, local15) + "," + local4.substring(local15);
			}
			if (local4.length() > 8) {
				local4 = "@gre@" + local4.substring(0, local4.length() - 8) + " million @whi@(" + local4 + ")";
			} else if (local4.length() > 4) {
				local4 = "@cya@" + local4.substring(0, local4.length() - 4) + "K @whi@(" + local4 + ")";
			}
			return " " + local4;
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("3386, " + 0 + ", " + arg0 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 252);
			if (arg0.length == 5) {
				anInt328 = Integer.parseInt(arg0[0]);
				anInt329 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method191();
				} else if (arg0[2].equals("highmem")) {
					method118((byte) 4);
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean56 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean56 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt955 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method85();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method98(@OriginalArg(1) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass1_Sub1_Sub2_Sub2_1.anIntArray210;
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
						this.aClass39_1.method579(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass39_1.method579(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass1_Sub1_Sub2_Sub2_1.method401();
			@Pc(146) int local146;
			if (this.aByte19 != -57) {
				for (local146 = 1; local146 > 0; local146++) {
				}
			}
			@Pc(157) int local157;
			for (local146 = 1; local146 < 103; local146++) {
				for (local157 = 1; local157 < 103; local157++) {
					if ((this.aByteArrayArrayArray7[arg0][local157][local146] & 0x18) == 0) {
						this.method129(local157, local36, local34, arg0, local146);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local157][local146] & 0x8) != 0) {
						this.method129(local157, local36, local34, arg0 + 1, local146);
					}
				}
			}
			this.aClass37_26.method538();
			this.anInt397 = 0;
			for (local157 = 0; local157 < 104; local157++) {
				for (@Pc(225) int local225 = 0; local225 < 104; local225++) {
					@Pc(235) int local235 = this.aClass39_1.method573(this.anInt279, local157, local225);
					if (local235 != 0) {
						local235 = local235 >> 14 & 0x7FFF;
						@Pc(247) int local247 = Class9.method258(local235).anInt537;
						if (local247 >= 0) {
							@Pc(251) int local251 = local157;
							@Pc(253) int local253 = local225;
							if (local247 != 22 && local247 != 29 && local247 != 34 && local247 != 36 && local247 != 46 && local247 != 47 && local247 != 48) {
								@Pc(285) int[][] local285 = this.aClass19Array1[this.anInt279].anIntArrayArray17;
								for (@Pc(287) int local287 = 0; local287 < 10; local287++) {
									@Pc(294) int local294 = (int) (Math.random() * 4.0D);
									if (local294 == 0 && local251 > 0 && local251 > local157 - 3 && (local285[local251 - 1][local253] & 0x280108) == 0) {
										local251--;
									}
									if (local294 == 1 && local251 < 103 && local251 < local157 + 3 && (local285[local251 + 1][local253] & 0x280180) == 0) {
										local251++;
									}
									if (local294 == 2 && local253 > 0 && local253 > local225 - 3 && (local285[local251][local253 - 1] & 0x280102) == 0) {
										local253--;
									}
									if (local294 == 3 && local253 < 103 && local253 < local225 + 3 && (local285[local251][local253 + 1] & 0x280120) == 0) {
										local253++;
									}
								}
							}
							this.aClass1_Sub1_Sub2_Sub2Array6[this.anInt397] = this.aClass1_Sub1_Sub2_Sub2Array5[local247];
							this.anIntArray68[this.anInt397] = local251;
							this.anIntArray69[this.anInt397] = local253;
							this.anInt397++;
						}
					}
				}
			}
		} catch (@Pc(424) RuntimeException local424) {
			signlink.reporterror("31535, " + -57 + ", " + arg0 + ", " + local424.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	private void method99() {
		try {
			if (this.aClass37_3 == null) {
				super.aClass37_2 = null;
				this.aClass37_27 = null;
				this.aClass37_25 = null;
				this.aClass37_24 = null;
				this.aClass37_26 = null;
				this.aClass37_21 = null;
				this.aClass37_22 = null;
				this.aClass37_23 = null;
				this.aClass37_6 = new Class37(this.method95(), 128, 265, anInt453);
				Class1_Sub1_Sub2.method456();
				this.aClass37_7 = new Class37(this.method95(), 128, 265, anInt453);
				Class1_Sub1_Sub2.method456();
				this.aClass37_3 = new Class37(this.method95(), 509, 171, anInt453);
				Class1_Sub1_Sub2.method456();
				this.aClass37_4 = new Class37(this.method95(), 360, 132, anInt453);
				Class1_Sub1_Sub2.method456();
				this.aClass37_5 = new Class37(this.method95(), 360, 200, anInt453);
				Class1_Sub1_Sub2.method456();
				this.aClass37_8 = new Class37(this.method95(), 202, 238, anInt453);
				Class1_Sub1_Sub2.method456();
				this.aClass37_9 = new Class37(this.method95(), 203, 238, anInt453);
				Class1_Sub1_Sub2.method456();
				this.aClass37_10 = new Class37(this.method95(), 74, 94, anInt453);
				Class1_Sub1_Sub2.method456();
				this.aClass37_11 = new Class37(this.method95(), 75, 94, anInt453);
				Class1_Sub1_Sub2.method456();
				if (this.aClass48_1 != null) {
					this.method197(aBoolean75);
					this.method227();
				}
				this.aBoolean84 = true;
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("94759, " + 0 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method100() {
		try {
			@Pc(21) int local21;
			@Pc(51) int local51;
			@Pc(55) int local55;
			@Pc(64) int local64;
			@Pc(71) int local71;
			@Pc(137) int local137;
			@Pc(194) int local194;
			try {
				this.anInt407 = -1;
				this.aClass31_3.method527();
				this.aClass31_2.method527();
				Class1_Sub1_Sub2_Sub1.method373();
				this.method127();
				this.aClass39_1.method544();
				for (local21 = 0; local21 < 4; local21++) {
					this.aClass19Array1[local21].method414(this.anInt282);
				}
				System.gc();
				@Pc(47) Class4 local47 = new Class4(this.aByteArrayArrayArray7, 104, this.aBoolean81, 104, this.anIntArrayArrayArray3);
				local51 = this.aByteArrayArray2.length;
				Class4.aBoolean34 = Class39.aBoolean212;
				for (local55 = 0; local55 < local51; local55++) {
					local64 = this.anIntArray52[local55] >> 8;
					local71 = this.anIntArray52[local55] & 0xFF;
					if (local64 == 33 && local71 >= 71 && local71 <= 73) {
						Class4.aBoolean34 = false;
					}
				}
				if (Class4.aBoolean34) {
					this.aClass39_1.method545(this.anInt279, this.aByte24);
				} else {
					this.aClass39_1.method545(0, this.aByte24);
				}
				this.aClass1_Sub1_Sub3_3.method487(139, this.anInt378);
				@Pc(142) byte[] local142;
				for (local64 = 0; local64 < local51; local64++) {
					local71 = (this.anIntArray52[local64] >> 8) * 64 - this.anInt390;
					local137 = (this.anIntArray52[local64] & 0xFF) * 64 - this.anInt391;
					local142 = this.aByteArrayArray2[local64];
					if (local142 != null) {
						local47.method58(local137, local142, local71, (this.anInt436 - 6) * 8, (this.anInt437 - 6) * 8);
					}
				}
				for (local71 = 0; local71 < local51; local71++) {
					local137 = (this.anIntArray52[local71] >> 8) * 64 - this.anInt390;
					local194 = (this.anIntArray52[local71] & 0xFF) * 64 - this.anInt391;
					@Pc(199) byte[] local199 = this.aByteArrayArray2[local71];
					if (local199 == null && this.anInt437 < 800) {
						local47.method57(local194, local137);
					}
				}
				this.aClass1_Sub1_Sub3_3.method487(139, this.anInt378);
				@Pc(245) int local245;
				for (local137 = 0; local137 < local51; local137++) {
					local142 = this.aByteArrayArray1[local137];
					if (local142 != null) {
						local245 = (this.anIntArray52[local137] >> 8) * 64 - this.anInt390;
						@Pc(257) int local257 = (this.anIntArray52[local137] & 0xFF) * 64 - this.anInt391;
						local47.method61(this.aClass19Array1, this.aClass39_1, local142, local257, local245);
					}
				}
				this.aClass1_Sub1_Sub3_3.method487(139, this.anInt378);
				local47.method63(this.aClass39_1, this.aClass19Array1);
				this.aClass37_26.method538();
				this.aClass1_Sub1_Sub3_3.method487(139, this.anInt378);
				for (local194 = 0; local194 < 104; local194++) {
					for (local245 = 0; local245 < 104; local245++) {
						this.method194(local194, local245);
					}
				}
				this.method206();
			} catch (@Pc(319) Exception local319) {
			}
			Class9.aClass42_4.method643();
			@Pc(333) int local333;
			if (aBoolean57 && signlink.aRandomAccessFile1 != null) {
				local21 = this.aClass45_Sub1_1.method650((byte) 6, 0);
				for (local333 = 0; local333 < local21; local333++) {
					local51 = this.aClass45_Sub1_1.method655(local333);
					if ((local51 & 0x79) == 0) {
						Class1_Sub1_Sub1_Sub5.method287(local333);
					}
				}
			}
			System.gc();
			Class1_Sub1_Sub2_Sub1.method374();
			this.aClass45_Sub1_1.method661();
			local21 = (this.anInt436 - 6) / 8 - 1;
			local333 = (this.anInt436 + 6) / 8 + 1;
			local51 = (this.anInt437 - 6) / 8 - 1;
			local55 = (this.anInt437 + 6) / 8 + 1;
			if (this.aBoolean64) {
				local21 = 49;
				local333 = 50;
				local51 = 49;
				local55 = 50;
			}
			for (local64 = local21; local64 <= local333; local64++) {
				for (local71 = local51; local71 <= local55; local71++) {
					if (local64 == local21 || local64 == local333 || local71 == local51 || local71 == local55) {
						local137 = this.aClass45_Sub1_1.method652(local64, local71, 0);
						if (local137 != -1) {
							this.aClass45_Sub1_1.method662(this.anInt294, 3, local137);
						}
						local194 = this.aClass45_Sub1_1.method652(local64, local71, 1);
						if (local194 != -1) {
							this.aClass45_Sub1_1.method662(this.anInt294, 3, local194);
						}
					}
				}
			}
		} catch (@Pc(479) RuntimeException local479) {
			signlink.reporterror("39694, " + -25 + ", " + local479.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	private void method101() {
		try {
			if (aBoolean57 && this.anInt288 == 2 && Class4.anInt205 != this.anInt279) {
				this.aClass37_26.method538();
				this.aClass1_Sub1_Sub2_Sub4_2.method465(0, "Loading - please wait.", 673, 151, 257);
				this.aClass1_Sub1_Sub2_Sub4_2.method465(16777215, "Loading - please wait.", 673, 150, 256);
				this.aClass37_26.method539(4, super.aGraphics2, 4, this.anInt455);
				this.anInt288 = 1;
				this.aLong14 = System.currentTimeMillis();
			}
			if (this.anInt288 == 1) {
				@Pc(58) int local58 = this.method102();
				if (local58 != 0 && System.currentTimeMillis() - this.aLong14 > 360000L) {
					signlink.reporterror(this.aString5 + " glcfb " + this.aLong17 + "," + local58 + "," + aBoolean57 + "," + this.aClass46Array1[0] + "," + this.aClass45_Sub1_1.method658() + "," + this.anInt279 + "," + this.anInt436 + "," + this.anInt437);
					this.aLong14 = System.currentTimeMillis();
				}
			}
			if (this.anInt288 == 2 && this.anInt279 != this.anInt407) {
				this.anInt407 = this.anInt279;
				this.method98(this.anInt279);
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("45056, " + 8 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)I")
	private int method102() {
		try {
			for (@Pc(9) int local9 = 0; local9 < this.aByteArrayArray2.length; local9++) {
				if (this.aByteArrayArray2[local9] == null && this.anIntArray53[local9] != -1) {
					return -1;
				}
				if (this.aByteArrayArray1[local9] == null && this.anIntArray54[local9] != -1) {
					return -2;
				}
			}
			@Pc(45) boolean local45 = true;
			for (@Pc(47) int local47 = 0; local47 < this.aByteArrayArray2.length; local47++) {
				@Pc(54) byte[] local54 = this.aByteArrayArray1[local47];
				if (local54 != null) {
					@Pc(68) int local68 = (this.anIntArray52[local47] >> 8) * 64 - this.anInt390;
					@Pc(80) int local80 = (this.anIntArray52[local47] & 0xFF) * 64 - this.anInt391;
					local45 &= Class4.method59(local68, local54, local80);
				}
			}
			if (!local45) {
				return -3;
			} else if (this.aBoolean49) {
				return -4;
			} else {
				this.anInt288 = 2;
				Class4.anInt205 = this.anInt279;
				this.method100();
				this.aClass1_Sub1_Sub3_3.method487(232, this.anInt378);
				return 0;
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("80359, " + 87 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
	private void method103(@OriginalArg(0) byte arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt134 >> 7 == this.anInt272 && aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt135 >> 7 == this.anInt273) {
				this.anInt272 = 0;
			}
			@Pc(21) int local21 = this.anInt322;
			if (arg1) {
				local21 = 1;
			}
			for (@Pc(27) int local27 = 0; local27 < local21; local27++) {
				@Pc(33) Class1_Sub1_Sub1_Sub1_Sub2 local33;
				@Pc(38) int local38;
				if (arg1) {
					local33 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
					local38 = this.anInt321 << 14;
				} else {
					local33 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray46[local27]];
					local38 = this.anIntArray46[local27] << 14;
				}
				if (local33 != null && local33.method49()) {
					local33.aBoolean29 = false;
					if ((aBoolean57 && this.anInt322 > 50 || this.anInt322 > 200) && !arg1 && local33.anInt154 == local33.anInt138) {
						local33.aBoolean29 = true;
					}
					@Pc(89) int local89 = local33.anInt134 >> 7;
					@Pc(94) int local94 = local33.anInt135 >> 7;
					if (local89 >= 0 && local89 < 104 && local94 >= 0 && local94 < 104) {
						if (local33.aClass1_Sub1_Sub1_Sub5_1 == null || anInt268 < local33.anInt185 || anInt268 >= local33.anInt186) {
							if ((local33.anInt134 & 0x7F) == 64 && (local33.anInt135 & 0x7F) == 64) {
								if (this.anIntArrayArray5[local89][local94] == this.anInt409) {
									continue;
								}
								this.anIntArrayArray5[local89][local94] = this.anInt409;
							}
							local33.anInt184 = this.method168(this.anInt279, local33.anInt134, local33.anInt135, 54);
							this.aClass39_1.method555(local33, local33.anInt184, this.anInt279, local38, local33.anInt134, 60, local33.anInt135, local33.anInt136, local33.aBoolean26);
						} else {
							local33.aBoolean29 = false;
							local33.anInt184 = this.method168(this.anInt279, local33.anInt134, local33.anInt135, 54);
							this.aClass39_1.method556(local33.anInt136, local33.anInt134, local33, local33.anInt190, local33.anInt184, local33.anInt192, this.anInt279, local33.anInt191, local33.anInt135, local33.anInt193, local38);
						}
					}
				}
			}
			@Pc(226) boolean local226 = false;
		} catch (@Pc(234) RuntimeException local234) {
			signlink.reporterror("60110, " + arg0 + ", " + arg1 + ", " + local234.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method104() {
		try {
			for (@Pc(6) Class1_Sub1_Sub1_Sub6 local6 = (Class1_Sub1_Sub1_Sub6) this.aClass31_3.method523(); local6 != null; local6 = (Class1_Sub1_Sub1_Sub6) this.aClass31_3.method525()) {
				if (local6.anInt584 != this.anInt279 || local6.aBoolean138) {
					local6.method669();
				} else if (anInt268 >= local6.anInt583) {
					local6.method317(this.anInt398);
					if (local6.aBoolean138) {
						local6.method669();
					} else {
						this.aClass39_1.method555(local6, local6.anInt587, local6.anInt584, -1, local6.anInt585, 60, local6.anInt586, 0, false);
					}
				}
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("37109, " + 114 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method105() {
		try {
			this.method174();
			if (this.anInt311 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array7[this.anInt310 / 100].method406(this.anInt309 - 8 - 4, this.anInt327, this.anInt308 - 8 - 4);
			}
			if (this.anInt311 == 2) {
				this.aClass1_Sub1_Sub2_Sub2Array7[this.anInt310 / 100 + 4].method406(this.anInt309 - 8 - 4, this.anInt327, this.anInt308 - 8 - 4);
			}
			if (this.anInt351 != -1) {
				this.method182(this.anInt351, this.anInt398);
				this.method193(Class6.aClass6Array1[this.anInt351], 0, 0, 0);
			}
			@Pc(99) int local99;
			@Pc(101) int local101;
			if (this.anInt361 > 0) {
				local99 = 302 - (int) Math.abs(Math.sin((double) this.anInt361 / 10.0D) * 10.0D);
				for (local101 = 0; local101 < 30; local101++) {
					@Pc(109) int local109 = (30 - local101) * 16;
					Class1_Sub1_Sub2.method462(local101 + local99, 16776960, this.anInt361, 256 - local109 / 2, local109);
				}
			}
			if (this.anInt379 != -1) {
				this.method182(this.anInt379, this.anInt398);
				this.method193(Class6.aClass6Array1[this.anInt379], 0, 0, 0);
			}
			this.method198();
			if (!this.aBoolean83) {
				this.method145();
				this.method173(this.aByte26);
			} else if (this.anInt420 == 0) {
				this.method116();
			}
			if (this.anInt413 == 1) {
				if (this.anInt383 > 0 || this.anInt371 == 1) {
					this.aClass1_Sub1_Sub2_Sub2Array3[1].method406(258, this.anInt327, 472);
				} else {
					this.aClass1_Sub1_Sub2_Sub2Array3[1].method406(296, this.anInt327, 472);
				}
			}
			if (this.anInt383 > 0) {
				this.aClass1_Sub1_Sub2_Sub2Array3[0].method406(296, this.anInt327, 472);
				this.aClass1_Sub1_Sub2_Sub4_2.method465(16776960, "Level: " + this.anInt383, 673, 329, 484);
			}
			if (this.anInt371 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array3[6].method406(296, this.anInt327, 472);
				this.aClass1_Sub1_Sub2_Sub4_2.method465(16776960, "Arena", 673, 329, 484);
			}
			if (this.anInt293 != 0) {
				local99 = this.anInt293 / 50;
				local101 = local99 / 60;
				local99 %= 60;
				if (local99 < 10) {
					this.aClass1_Sub1_Sub2_Sub4_2.method468(4, "System update in: " + local101 + ":0" + local99, 329, 16776960);
				} else {
					this.aClass1_Sub1_Sub2_Sub4_2.method468(4, "System update in: " + local101 + ":" + local99, 329, 16776960);
				}
			}
		} catch (@Pc(307) RuntimeException local307) {
			signlink.reporterror("97466, " + 383 + ", " + local307.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method106() {
		try {
			this.aClass1_Sub1_Sub3_3.method487(125, this.anInt378);
			if (this.anInt461 != -1) {
				this.anInt461 = -1;
				this.aBoolean45 = true;
				this.aBoolean80 = false;
				this.aBoolean72 = true;
			}
			if (this.anInt312 != -1) {
				this.anInt312 = -1;
				this.aBoolean65 = true;
				this.aBoolean80 = false;
			}
			this.anInt379 = -1;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("21773, " + 0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBIILclient!bb;)V")
	private void method107(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub1_Sub1_Sub2 arg4) {
		try {
			if (arg4 != aClass1_Sub1_Sub1_Sub1_Sub2_1 && this.anInt318 < 400) {
				@Pc(33) String local33 = arg4.aString4 + method190(arg4.anInt183, this.aByte15, aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt183) + " (level-" + arg4.anInt183 + ")";
				if (this.anInt440 == 1) {
					this.aStringArray1[this.anInt318] = "Use " + this.aString17 + " with @whi@" + local33;
					this.anIntArray60[this.anInt318] = 367;
					this.anIntArray61[this.anInt318] = arg2;
					this.anIntArray58[this.anInt318] = arg0;
					this.anIntArray59[this.anInt318] = arg3;
					this.anInt318++;
				} else if (this.anInt315 != 1) {
					this.aStringArray1[this.anInt318] = "Follow @whi@" + local33;
					this.anIntArray60[this.anInt318] = 1544;
					this.anIntArray61[this.anInt318] = arg2;
					this.anIntArray58[this.anInt318] = arg0;
					this.anIntArray59[this.anInt318] = arg3;
					this.anInt318++;
					if (this.anInt289 == 0) {
						this.aStringArray1[this.anInt318] = "Trade with @whi@" + local33;
						this.anIntArray60[this.anInt318] = 1373;
						this.anIntArray61[this.anInt318] = arg2;
						this.anIntArray58[this.anInt318] = arg0;
						this.anIntArray59[this.anInt318] = arg3;
						this.anInt318++;
					}
					if (this.anInt383 > 0) {
						this.aStringArray1[this.anInt318] = "Attack @whi@" + local33;
						if (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt183 >= arg4.anInt183) {
							this.anIntArray60[this.anInt318] = 151;
						} else {
							this.anIntArray60[this.anInt318] = 2151;
						}
						this.anIntArray61[this.anInt318] = arg2;
						this.anIntArray58[this.anInt318] = arg0;
						this.anIntArray59[this.anInt318] = arg3;
						this.anInt318++;
					}
					if (this.anInt371 == 1) {
						this.aStringArray1[this.anInt318] = "Fight @whi@" + local33;
						this.anIntArray60[this.anInt318] = 151;
						this.anIntArray61[this.anInt318] = arg2;
						this.anIntArray58[this.anInt318] = arg0;
						this.anIntArray59[this.anInt318] = arg3;
						this.anInt318++;
					}
					if (this.anInt371 == 2) {
						this.aStringArray1[this.anInt318] = "Duel-with @whi@" + local33;
						this.anIntArray60[this.anInt318] = 1101;
						this.anIntArray61[this.anInt318] = arg2;
						this.anIntArray58[this.anInt318] = arg0;
						this.anIntArray59[this.anInt318] = arg3;
						this.anInt318++;
					}
				} else if ((this.anInt317 & 0x8) == 8) {
					this.aStringArray1[this.anInt318] = this.aString8 + " @whi@" + local33;
					this.anIntArray60[this.anInt318] = 651;
					this.anIntArray61[this.anInt318] = arg2;
					this.anIntArray58[this.anInt318] = arg0;
					this.anIntArray59[this.anInt318] = arg3;
					this.anInt318++;
				}
				for (@Pc(383) int local383 = 0; local383 < this.anInt318; local383++) {
					if (this.anIntArray60[local383] == 660) {
						this.aStringArray1[local383] = "Walk here @whi@" + local33;
						break;
					}
				}
				@Pc(414) boolean local414 = false;
			}
		} catch (@Pc(422) RuntimeException local422) {
			signlink.reporterror("62254, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local422.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method108() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt322; local3++) {
				if (local3 == -1) {
					local11 = this.anInt321;
				} else {
					local11 = this.anIntArray46[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub2 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local11];
				if (local23 != null) {
					this.method160(local23, 1);
				}
			}
			anInt381++;
			if (anInt381 > 1406) {
				anInt381 = 0;
				this.aClass1_Sub1_Sub3_3.method487(54, this.anInt378);
				this.aClass1_Sub1_Sub3_3.method488(0);
				local11 = this.aClass1_Sub1_Sub3_3.anInt796;
				this.aClass1_Sub1_Sub3_3.method488(162);
				this.aClass1_Sub1_Sub3_3.method488(22);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_3.method488(84);
				}
				this.aClass1_Sub1_Sub3_3.method489(31824);
				this.aClass1_Sub1_Sub3_3.method489(13490);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_3.method488(123);
				}
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_3.method488(134);
				}
				this.aClass1_Sub1_Sub3_3.method488(100);
				this.aClass1_Sub1_Sub3_3.method488(94);
				this.aClass1_Sub1_Sub3_3.method489(35521);
				this.aClass1_Sub1_Sub3_3.method497(this.aClass1_Sub1_Sub3_3.anInt796 - local11, this.anInt324);
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("80223, " + false + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method109() {
		try {
			this.aBoolean46 = false;
			this.aBoolean70 &= true;
			while (this.aBoolean47) {
				this.aBoolean46 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(17) Exception local17) {
				}
			}
			this.aClass1_Sub1_Sub2_Sub3_1 = null;
			this.aClass1_Sub1_Sub2_Sub3_2 = null;
			this.aClass1_Sub1_Sub2_Sub3Array3 = null;
			this.anIntArray92 = null;
			this.anIntArray93 = null;
			this.anIntArray94 = null;
			this.anIntArray95 = null;
			this.anIntArray56 = null;
			this.anIntArray57 = null;
			this.anIntArray34 = null;
			this.anIntArray35 = null;
			this.aClass1_Sub1_Sub2_Sub2_7 = null;
			this.aClass1_Sub1_Sub2_Sub2_8 = null;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("21348, " + true + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!d;)Z")
	private boolean method110(@OriginalArg(1) Class6 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt470;
			if (this.anInt446 == 2) {
				if (local4 == 201) {
					this.aBoolean65 = true;
					this.aBoolean51 = false;
					this.aBoolean69 = true;
					this.aString14 = "";
					this.anInt338 = 1;
					this.aString7 = "Enter name of friend to add to list";
				}
				if (local4 == 202) {
					this.aBoolean65 = true;
					this.aBoolean51 = false;
					this.aBoolean69 = true;
					this.aString14 = "";
					this.anInt338 = 2;
					this.aString7 = "Enter name of friend to delete from list";
				}
			}
			if (local4 == 205) {
				this.anInt255 = 250;
				return true;
			}
			if (local4 == 501) {
				this.aBoolean65 = true;
				this.aBoolean51 = false;
				this.aBoolean69 = true;
				this.aString14 = "";
				this.anInt338 = 4;
				this.aString7 = "Enter name of player to add to list";
			}
			if (local4 == 502) {
				this.aBoolean65 = true;
				this.aBoolean51 = false;
				this.aBoolean69 = true;
				this.aString14 = "";
				this.anInt338 = 5;
				this.aString7 = "Enter name of player to delete from list";
			}
			@Pc(118) int local118;
			@Pc(122) int local122;
			@Pc(127) int local127;
			if (local4 >= 300 && local4 <= 313) {
				local118 = (local4 - 300) / 2;
				local122 = local4 & 0x1;
				local127 = this.anIntArray80[local118];
				if (local127 != -1) {
					while (true) {
						if (local122 == 0) {
							local127--;
							if (local127 < 0) {
								local127 = Class23.anInt771 - 1;
							}
						}
						if (local122 == 1) {
							local127++;
							if (local127 >= Class23.anInt771) {
								local127 = 0;
							}
						}
						if (!Class23.aClass23Array1[local127].aBoolean175 && Class23.aClass23Array1[local127].anInt772 == local118 + (this.aBoolean87 ? 0 : 7)) {
							this.anIntArray80[local118] = local127;
							this.aBoolean67 = true;
							break;
						}
					}
				}
			}
			if (local4 >= 314 && local4 <= 323) {
				local118 = (local4 - 314) / 2;
				local122 = local4 & 0x1;
				local127 = this.anIntArray40[local118];
				if (local122 == 0) {
					local127--;
					if (local127 < 0) {
						local127 = anIntArrayArray4[local118].length - 1;
					}
				}
				if (local122 == 1) {
					local127++;
					if (local127 >= anIntArrayArray4[local118].length) {
						local127 = 0;
					}
				}
				this.anIntArray40[local118] = local127;
				this.aBoolean67 = true;
			}
			if (local4 == 324 && !this.aBoolean87) {
				this.aBoolean87 = true;
				this.method123();
			}
			if (local4 == 325 && this.aBoolean87) {
				this.aBoolean87 = false;
				this.method123();
			}
			if (local4 == 326) {
				this.aClass1_Sub1_Sub3_3.method487(124, this.anInt378);
				this.aClass1_Sub1_Sub3_3.method488(this.aBoolean87 ? 0 : 1);
				for (local118 = 0; local118 < 7; local118++) {
					this.aClass1_Sub1_Sub3_3.method488(this.anIntArray80[local118]);
				}
				for (local122 = 0; local122 < 5; local122++) {
					this.aClass1_Sub1_Sub3_3.method488(this.anIntArray40[local122]);
				}
				return true;
			}
			if (local4 == 613) {
				this.aBoolean52 = !this.aBoolean52;
			}
			if (local4 >= 601 && local4 <= 612) {
				this.method106();
				if (this.aString18.length() > 0) {
					this.aClass1_Sub1_Sub3_3.method487(102, this.anInt378);
					this.aClass1_Sub1_Sub3_3.method494(Class49.method679(this.aString18));
					this.aClass1_Sub1_Sub3_3.method488(local4 - 601);
					this.aClass1_Sub1_Sub3_3.method488(this.aBoolean52 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(357) RuntimeException local357) {
			signlink.reporterror("19431, " + true + ", " + arg0 + ", " + local357.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) boolean local5 = false;
			if (!aBoolean57) {
				@Pc(16) Class1_Sub1_Sub2_Sub3 local16;
				@Pc(24) int local24;
				@Pc(32) int local32;
				@Pc(35) byte[] local35;
				@Pc(38) byte[] local38;
				@Pc(40) int local40;
				if (Class1_Sub1_Sub2_Sub1.anIntArray187[17] >= arg1) {
					local16 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[17];
					local24 = local16.anInt734 * local16.anInt735 - 1;
					local32 = local16.anInt734 * this.anInt398 * 2;
					local35 = local16.aByteArray7;
					local38 = this.aByteArray2;
					for (local40 = 0; local40 <= local24; local40++) {
						local38[local40] = local35[local40 - local32 & local24];
					}
					local16.aByteArray7 = local38;
					this.aByteArray2 = local35;
					Class1_Sub1_Sub2_Sub1.method377(17, (byte) 6);
				}
				if (Class1_Sub1_Sub2_Sub1.anIntArray187[24] >= arg1) {
					local16 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[24];
					local24 = local16.anInt734 * local16.anInt735 - 1;
					local32 = local16.anInt734 * this.anInt398 * 2;
					local35 = local16.aByteArray7;
					local38 = this.aByteArray2;
					for (local40 = 0; local40 <= local24; local40++) {
						local38[local40] = local35[local40 - local32 & local24];
					}
					local16.aByteArray7 = local38;
					this.aByteArray2 = local35;
					Class1_Sub1_Sub2_Sub1.method377(24, (byte) 6);
					return;
				}
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("88768, " + arg0 + ", " + arg1 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method112(@OriginalArg(0) byte arg0) {
		try {
			this.anInt409++;
			this.method103((byte) 6, true);
			this.method171(true);
			this.method103((byte) 6, false);
			this.method171(false);
			this.method122();
			this.method104();
			@Pc(35) int local35;
			@Pc(74) int local74;
			@Pc(122) int local122;
			if (!this.aBoolean78) {
				local35 = this.anInt339;
				if (this.anInt419 / 256 > local35) {
					local35 = this.anInt419 / 256;
				}
				if (this.aBooleanArray4[4] && this.anIntArray91[4] + 128 > local35) {
					local35 = this.anIntArray91[4] + 128;
				}
				local74 = this.anInt340 + this.anInt447 & 0x7FF;
				this.method178(this.anInt276, local74, this.anInt277, this.method168(this.anInt279, aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt134, aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt135, 54) - 50, local35 * 3 + 600, local35);
				anInt417++;
				if (anInt417 > 1802) {
					anInt417 = 0;
					this.aClass1_Sub1_Sub3_3.method487(180, this.anInt378);
					this.aClass1_Sub1_Sub3_3.method488(0);
					local122 = this.aClass1_Sub1_Sub3_3.anInt796;
					this.aClass1_Sub1_Sub3_3.method489(29711);
					this.aClass1_Sub1_Sub3_3.method488(70);
					this.aClass1_Sub1_Sub3_3.method488((int) (Math.random() * 256.0D));
					this.aClass1_Sub1_Sub3_3.method488(242);
					this.aClass1_Sub1_Sub3_3.method488(186);
					this.aClass1_Sub1_Sub3_3.method488(39);
					this.aClass1_Sub1_Sub3_3.method488(61);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub3_3.method488(13);
					}
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub3_3.method489(57856);
					}
					this.aClass1_Sub1_Sub3_3.method489((int) (Math.random() * 65536.0D));
					this.aClass1_Sub1_Sub3_3.method497(this.aClass1_Sub1_Sub3_3.anInt796 - local122, this.anInt324);
				}
			}
			if (this.aBoolean78) {
				local35 = this.method185();
			} else {
				local35 = this.method184();
			}
			local74 = this.anInt303;
			local122 = this.anInt304;
			@Pc(210) int local210 = this.anInt305;
			@Pc(213) int local213 = this.anInt306;
			@Pc(216) int local216 = this.anInt307;
			@Pc(265) int local265;
			for (@Pc(218) int local218 = 0; local218 < 5; local218++) {
				if (this.aBooleanArray4[local218]) {
					local265 = (int) (Math.random() * (double) (this.anIntArray84[local218] * 2 + 1) - (double) this.anIntArray84[local218] + Math.sin((double) this.anIntArray85[local218] * ((double) this.anIntArray66[local218] / 100.0D)) * (double) this.anIntArray91[local218]);
					if (local218 == 0) {
						this.anInt303 += local265;
					}
					if (local218 == 1) {
						this.anInt304 += local265;
					}
					if (local218 == 2) {
						this.anInt305 += local265;
					}
					if (local218 == 3) {
						this.anInt307 = this.anInt307 + local265 & 0x7FF;
					}
					if (local218 == 4) {
						this.anInt306 += local265;
						if (this.anInt306 < 128) {
							this.anInt306 = 128;
						}
						if (this.anInt306 > 383) {
							this.anInt306 = 383;
						}
					}
				}
			}
			local265 = Class1_Sub1_Sub2_Sub1.anInt678;
			if (arg0 == this.aByte25) {
				@Pc(337) boolean local337 = false;
				Class1_Sub1_Sub1_Sub5.aBoolean132 = true;
				Class1_Sub1_Sub1_Sub5.anInt576 = 0;
				Class1_Sub1_Sub1_Sub5.anInt574 = super.anInt240 - 4;
				Class1_Sub1_Sub1_Sub5.anInt575 = super.anInt241 - 4;
				Class1_Sub1_Sub2.method456();
				this.aClass39_1.method583(this.anInt303, local35, this.anInt304, this.anInt307, this.anInt305, this.anInt306);
				this.aClass39_1.method558();
				this.method217();
				this.method228();
				this.method111(670, local265);
				this.method105();
				this.aClass37_26.method539(4, super.aGraphics2, 4, this.anInt455);
				this.anInt303 = local74;
				this.anInt304 = local122;
				this.anInt305 = local210;
				this.anInt306 = local213;
				this.anInt307 = local216;
			}
		} catch (@Pc(414) RuntimeException local414) {
			signlink.reporterror("28549, " + arg0 + ", " + local414.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)Z")
	private boolean method113(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(21) int local21 = this.anIntArray60[arg0];
			if (local21 >= 2000) {
				local21 -= 2000;
			}
			return local21 == 406;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("61665, " + arg0 + ", " + -581 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)Z")
	private boolean method114(@OriginalArg(0) boolean arg0) {
		try {
			this.aBoolean70 &= arg0;
			if (this.aClass8_1 == null) {
				return false;
			}
			@Pc(3049) String local3049;
			@Pc(211) int local211;
			try {
				@Pc(16) int local16 = this.aClass8_1.method246();
				if (local16 == 0) {
					return false;
				}
				if (this.anInt252 == -1) {
					this.aClass8_1.method247(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, 1);
					this.anInt252 = this.aClass1_Sub1_Sub3_4.aByteArray9[0] & 0xFF;
					if (this.aClass47_1 != null) {
						this.anInt252 = this.anInt252 - this.aClass47_1.method674() & 0xFF;
					}
					this.anInt251 = Class17.anIntArray190[this.anInt252];
					local16--;
				}
				if (this.anInt251 == -1) {
					if (local16 <= 0) {
						return false;
					}
					this.aClass8_1.method247(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, 1);
					this.anInt251 = this.aClass1_Sub1_Sub3_4.aByteArray9[0] & 0xFF;
					local16--;
				}
				if (this.anInt251 == -2) {
					if (local16 <= 1) {
						return false;
					}
					this.aClass8_1.method247(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, 2);
					this.aClass1_Sub1_Sub3_4.anInt796 = 0;
					this.anInt251 = this.aClass1_Sub1_Sub3_4.method500();
					local16 -= 2;
				}
				if (local16 < this.anInt251) {
					return false;
				}
				this.aClass1_Sub1_Sub3_4.anInt796 = 0;
				this.aClass8_1.method247(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, this.anInt251);
				this.anInt253 = 0;
				this.anInt458 = this.anInt457;
				this.anInt457 = this.anInt456;
				this.anInt456 = this.anInt252;
				if (this.anInt252 == 75) {
					if (this.anInt461 != -1) {
						this.anInt461 = -1;
						this.aBoolean45 = true;
						this.aBoolean72 = true;
					}
					if (this.anInt312 != -1) {
						this.anInt312 = -1;
						this.aBoolean65 = true;
					}
					if (this.aBoolean51) {
						this.aBoolean51 = false;
						this.aBoolean65 = true;
					}
					this.anInt379 = -1;
					this.aBoolean80 = false;
					this.anInt252 = -1;
					return true;
				}
				@Pc(215) int local215;
				@Pc(207) int local207;
				if (this.anInt252 == 211) {
					local207 = this.aClass1_Sub1_Sub3_4.method500();
					local211 = this.aClass1_Sub1_Sub3_4.method500();
					local215 = this.aClass1_Sub1_Sub3_4.method500();
					@Pc(218) Class15 local218 = Class15.method345(local211);
					Class6.aClass6Array1[local207].anInt485 = 4;
					Class6.aClass6Array1[local207].anInt486 = local211;
					Class6.aClass6Array1[local207].anInt492 = local218.anInt630;
					Class6.aClass6Array1[local207].anInt493 = local218.anInt631;
					Class6.aClass6Array1[local207].anInt491 = local218.anInt629 * 100 / local215;
					this.anInt252 = -1;
					return true;
				}
				@Pc(279) int local279;
				@Pc(283) int local283;
				if (this.anInt252 == 170) {
					local207 = this.aClass1_Sub1_Sub3_4.method500();
					local211 = this.aClass1_Sub1_Sub3_4.method500();
					local215 = local211 >> 10 & 0x1F;
					local279 = local211 >> 5 & 0x1F;
					local283 = local211 & 0x1F;
					Class6.aClass6Array1[local207].anInt481 = (local215 << 19) + (local279 << 11) + (local283 << 3);
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 253) {
					local207 = this.aClass1_Sub1_Sub3_4.method501();
					this.anInt384 = local207;
					this.aBoolean65 = true;
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 214) {
					this.anInt373 = this.aClass1_Sub1_Sub3_4.method498();
					if (this.anInt373 == 1) {
						this.anInt348 = this.aClass1_Sub1_Sub3_4.method500();
					}
					if (this.anInt373 >= 2 && this.anInt373 <= 6) {
						if (this.anInt373 == 2) {
							this.anInt335 = 64;
							this.anInt336 = 64;
						}
						if (this.anInt373 == 3) {
							this.anInt335 = 0;
							this.anInt336 = 64;
						}
						if (this.anInt373 == 4) {
							this.anInt335 = 128;
							this.anInt336 = 64;
						}
						if (this.anInt373 == 5) {
							this.anInt335 = 64;
							this.anInt336 = 0;
						}
						if (this.anInt373 == 6) {
							this.anInt335 = 64;
							this.anInt336 = 128;
						}
						this.anInt373 = 2;
						this.anInt332 = this.aClass1_Sub1_Sub3_4.method500();
						this.anInt333 = this.aClass1_Sub1_Sub3_4.method500();
						this.anInt334 = this.aClass1_Sub1_Sub3_4.method498();
					}
					if (this.anInt373 == 10) {
						this.anInt359 = this.aClass1_Sub1_Sub3_4.method500();
					}
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 196) {
					this.anInt356 = this.aClass1_Sub1_Sub3_4.method498();
					this.anInt357 = this.aClass1_Sub1_Sub3_4.method498();
					while (this.aClass1_Sub1_Sub3_4.anInt796 < this.anInt251) {
						local207 = this.aClass1_Sub1_Sub3_4.method498();
						this.method175(local207, this.aClass1_Sub1_Sub3_4);
					}
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 220) {
					this.anInt428 = this.anInt251 / 8;
					for (local207 = 0; local207 < this.anInt428; local207++) {
						this.aLongArray3[local207] = this.aClass1_Sub1_Sub3_4.method504();
					}
					this.anInt252 = -1;
					return true;
				}
				@Pc(515) Class6 local515;
				if (this.anInt252 == 149) {
					local207 = this.aClass1_Sub1_Sub3_4.method500();
					local211 = this.aClass1_Sub1_Sub3_4.method500();
					local515 = Class6.aClass6Array1[local207];
					if (local515 != null && local515.anInt468 == 0) {
						if (local211 < 0) {
							local211 = 0;
						}
						if (local211 > local515.anInt476 - local515.anInt472) {
							local211 = local515.anInt476 - local515.anInt472;
						}
						local515.anInt477 = local211;
					}
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 147) {
					this.anInt413 = this.aClass1_Sub1_Sub3_4.method498();
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 217) {
					this.anInt256 = this.aClass1_Sub1_Sub3_4.method498();
					this.aBoolean45 = true;
					this.aBoolean72 = true;
					this.anInt252 = -1;
					return true;
				}
				@Pc(598) boolean local598;
				@Pc(600) int local600;
				@Pc(621) int local621;
				@Pc(588) long local588;
				if (this.anInt252 == 228) {
					local588 = this.aClass1_Sub1_Sub3_4.method504();
					local215 = this.aClass1_Sub1_Sub3_4.method503();
					local279 = this.aClass1_Sub1_Sub3_4.method498();
					local598 = false;
					for (local600 = 0; local600 < 100; local600++) {
						if (this.anIntArray67[local600] == local215) {
							local598 = true;
							break;
						}
					}
					if (local279 <= 1) {
						for (local621 = 0; local621 < this.anInt428; local621++) {
							if (this.aLongArray3[local621] == local588) {
								local598 = true;
								break;
							}
						}
					}
					if (!local598 && this.anInt289 == 0) {
						try {
							this.anIntArray67[this.anInt435] = local215;
							this.anInt435 = (this.anInt435 + 1) % 100;
							@Pc(667) String local667 = Class2.method40(this.aClass1_Sub1_Sub3_4, this.anInt251 - 13);
							@Pc(671) String local671 = Class41.method613(local667);
							if (local279 == 2 || local279 == 3) {
								this.method121(7, local671, "@cr2@" + Class49.method683(Class49.method680(local588)));
							} else if (local279 == 1) {
								this.method121(7, local671, "@cr1@" + Class49.method683(Class49.method680(local588)));
							} else {
								this.method121(3, local671, Class49.method683(Class49.method680(local588)));
							}
						} catch (@Pc(728) Exception local728) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 251) {
					this.method158(this.aClass1_Sub1_Sub3_4, this.anInt251);
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 233) {
					this.aBoolean78 = false;
					for (local207 = 0; local207 < 5; local207++) {
						this.aBooleanArray4[local207] = false;
					}
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 20) {
					this.aBoolean69 = false;
					this.aBoolean51 = true;
					this.aString15 = "";
					this.aBoolean65 = true;
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 157) {
					local207 = this.aClass1_Sub1_Sub3_4.method498();
					local211 = this.aClass1_Sub1_Sub3_4.method498();
					local215 = this.aClass1_Sub1_Sub3_4.method498();
					local279 = this.aClass1_Sub1_Sub3_4.method498();
					this.aBooleanArray4[local207] = true;
					this.anIntArray84[local207] = local211;
					this.anIntArray91[local207] = local215;
					this.anIntArray66[local207] = local279;
					this.anIntArray85[local207] = 0;
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 1) {
					local207 = this.aClass1_Sub1_Sub3_4.method501();
					if (local207 >= 0) {
						this.method202(local207);
					}
					this.anInt351 = local207;
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 26) {
					local207 = this.aClass1_Sub1_Sub3_4.method500();
					Class6.aClass6Array1[local207].anInt485 = 3;
					Class6.aClass6Array1[local207].anInt486 = (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray19[0] << 24) + (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray19[4] << 18) + (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray18[0] << 12) + (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray18[8] << 6) + aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray18[11];
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 23) {
					this.anInt356 = this.aClass1_Sub1_Sub3_4.method498();
					this.anInt357 = this.aClass1_Sub1_Sub3_4.method498();
					for (local207 = this.anInt356; local207 < this.anInt356 + 8; local207++) {
						for (local211 = this.anInt357; local211 < this.anInt357 + 8; local211++) {
							if (this.aClass31ArrayArrayArray1[this.anInt279][local207][local211] != null) {
								this.aClass31ArrayArrayArray1[this.anInt279][local207][local211] = null;
								this.method194(local207, local211);
							}
						}
					}
					for (@Pc(991) Class1_Sub2 local991 = (Class1_Sub2) this.aClass31_1.method523(); local991 != null; local991 = (Class1_Sub2) this.aClass31_1.method525()) {
						if (local991.anInt845 >= this.anInt356 && local991.anInt845 < this.anInt356 + 8 && local991.anInt846 >= this.anInt357 && local991.anInt846 < this.anInt357 + 8 && local991.anInt843 == this.anInt279) {
							local991.anInt854 = 0;
						}
					}
					this.anInt252 = -1;
					return true;
				}
				@Pc(1194) int local1194;
				if (this.anInt252 == 9) {
					local588 = this.aClass1_Sub1_Sub3_4.method504();
					local215 = this.aClass1_Sub1_Sub3_4.method498();
					@Pc(1057) String local1057 = Class49.method683(Class49.method680(local588));
					for (local283 = 0; local283 < this.anInt445; local283++) {
						if (local588 == this.aLongArray4[local283]) {
							if (this.anIntArray55[local283] != local215) {
								this.anIntArray55[local283] = local215;
								this.aBoolean45 = true;
								if (local215 > 0) {
									this.method121(5, local1057 + " has logged in.", "");
								}
								if (local215 == 0) {
									this.method121(5, local1057 + " has logged out.", "");
								}
							}
							local1057 = null;
							break;
						}
					}
					if (local1057 != null && this.anInt445 < 200) {
						this.aLongArray4[this.anInt445] = local588;
						this.aStringArray2[this.anInt445] = local1057;
						this.anIntArray55[this.anInt445] = local215;
						this.anInt445++;
						this.aBoolean45 = true;
					}
					@Pc(1155) boolean local1155 = false;
					while (!local1155) {
						local1155 = true;
						for (local621 = 0; local621 < this.anInt445 - 1; local621++) {
							if (this.anIntArray55[local621] != anInt328 && this.anIntArray55[local621 + 1] == anInt328 || this.anIntArray55[local621] == 0 && this.anIntArray55[local621 + 1] != 0) {
								local1194 = this.anIntArray55[local621];
								this.anIntArray55[local621] = this.anIntArray55[local621 + 1];
								this.anIntArray55[local621 + 1] = local1194;
								@Pc(1216) String local1216 = this.aStringArray2[local621];
								this.aStringArray2[local621] = this.aStringArray2[local621 + 1];
								this.aStringArray2[local621 + 1] = local1216;
								@Pc(1238) long local1238 = this.aLongArray4[local621];
								this.aLongArray4[local621] = this.aLongArray4[local621 + 1];
								this.aLongArray4[local621 + 1] = local1238;
								this.aBoolean45 = true;
								local1155 = false;
							}
						}
					}
					this.anInt252 = -1;
					return true;
				}
				@Pc(1286) String local1286;
				if (this.anInt252 == 120) {
					local207 = this.aClass1_Sub1_Sub3_4.method500();
					local1286 = this.aClass1_Sub1_Sub3_4.method505();
					Class6.aClass6Array1[local207].aString19 = local1286;
					if (Class6.aClass6Array1[local207].anInt467 == this.anIntArray87[this.anInt256]) {
						this.aBoolean45 = true;
					}
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 124) {
					@Pc(1316) Class1_Sub1_Sub3 local1316 = Class10.method269();
					if (local1316 != null) {
						this.aClass1_Sub1_Sub3_3.method487(253, this.anInt378);
						this.aClass1_Sub1_Sub3_3.method489(local1316.anInt796);
						this.aClass1_Sub1_Sub3_3.method496(local1316.aByteArray9, local1316.anInt796);
						local1316.method486();
					}
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 200) {
					this.anInt454 = this.aClass1_Sub1_Sub3_4.method498();
					if (this.anInt454 == this.anInt256) {
						if (this.anInt454 == 3) {
							this.anInt256 = 1;
						} else {
							this.anInt256 = 3;
						}
						this.aBoolean45 = true;
					}
					this.anInt252 = -1;
					return true;
				}
				@Pc(1392) Class6 local1392;
				if (this.anInt252 == 80) {
					local207 = this.aClass1_Sub1_Sub3_4.method500();
					local1392 = Class6.aClass6Array1[local207];
					for (local215 = 0; local215 < local1392.anIntArray96.length; local215++) {
						local1392.anIntArray96[local215] = -1;
						local1392.anIntArray96[local215] = 0;
					}
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 143) {
					local207 = this.aClass1_Sub1_Sub3_4.method500();
					local211 = this.aClass1_Sub1_Sub3_4.method498();
					if (local207 == 65535) {
						local207 = -1;
					}
					this.anIntArray87[local211] = local207;
					this.aBoolean45 = true;
					this.aBoolean72 = true;
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 156) {
					local207 = this.aClass1_Sub1_Sub3_4.method500();
					local211 = this.aClass1_Sub1_Sub3_4.method500();
					if (this.anInt312 != -1) {
						this.anInt312 = -1;
						this.aBoolean65 = true;
					}
					if (this.aBoolean51) {
						this.aBoolean51 = false;
						this.aBoolean65 = true;
					}
					this.anInt379 = local207;
					this.anInt461 = local211;
					this.aBoolean45 = true;
					this.aBoolean72 = true;
					this.aBoolean80 = false;
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 48) {
					local207 = this.aClass1_Sub1_Sub3_4.method500();
					if (local207 == 65535) {
						local207 = -1;
					}
					if (local207 != this.anInt399 && this.aBoolean73 && !aBoolean57 && this.anInt377 == 0) {
						this.anInt343 = local207;
						this.aBoolean60 = true;
						this.aClass45_Sub1_1.method657(2, this.anInt343);
					}
					this.anInt399 = local207;
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 131) {
					local207 = this.aClass1_Sub1_Sub3_4.method500();
					local211 = this.aClass1_Sub1_Sub3_4.method500();
					if (this.aBoolean73 && !aBoolean57) {
						this.anInt343 = local207;
						this.aBoolean60 = false;
						this.aClass45_Sub1_1.method657(2, this.anInt343);
						this.anInt377 = local211;
					}
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 237) {
					this.anInt361 = 255;
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 103) {
					this.anInt293 = this.aClass1_Sub1_Sub3_4.method500() * 30;
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 248) {
					this.anInt272 = 0;
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 106 || this.anInt252 == 125 || this.anInt252 == 31 || this.anInt252 == 82 || this.anInt252 == 146 || this.anInt252 == 174 || this.anInt252 == 38 || this.anInt252 == 117 || this.anInt252 == 112 || this.anInt252 == 84) {
					this.method175(this.anInt252, this.aClass1_Sub1_Sub3_4);
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 66) {
					local207 = this.aClass1_Sub1_Sub3_4.method500();
					@Pc(1687) byte local1687 = this.aClass1_Sub1_Sub3_4.method499();
					this.anIntArray89[local207] = local1687;
					if (this.anIntArray38[local207] != local1687) {
						this.anIntArray38[local207] = local1687;
						this.method208(this.aBoolean76, local207);
						this.aBoolean45 = true;
						if (this.anInt384 != -1) {
							this.aBoolean65 = true;
						}
					}
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 145) {
					this.aBoolean45 = true;
					local207 = this.aClass1_Sub1_Sub3_4.method500();
					local1392 = Class6.aClass6Array1[local207];
					local215 = this.aClass1_Sub1_Sub3_4.method498();
					for (local279 = 0; local279 < local215; local279++) {
						local1392.anIntArray96[local279] = this.aClass1_Sub1_Sub3_4.method500();
						local283 = this.aClass1_Sub1_Sub3_4.method498();
						if (local283 == 255) {
							local283 = this.aClass1_Sub1_Sub3_4.method503();
						}
						local1392.anIntArray97[local279] = local283;
					}
					for (local283 = local215; local283 < local1392.anIntArray96.length; local283++) {
						local1392.anIntArray96[local283] = 0;
						local1392.anIntArray97[local283] = 0;
					}
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 183) {
					local207 = this.aClass1_Sub1_Sub3_4.method500();
					this.method202(local207);
					if (this.anInt461 != -1) {
						this.anInt461 = -1;
						this.aBoolean45 = true;
						this.aBoolean72 = true;
					}
					this.anInt312 = local207;
					this.aBoolean65 = true;
					this.anInt379 = -1;
					this.aBoolean80 = false;
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 11) {
					local207 = this.aClass1_Sub1_Sub3_4.method500();
					local211 = this.aClass1_Sub1_Sub3_4.method500();
					Class6.aClass6Array1[local207].anInt485 = 1;
					Class6.aClass6Array1[local207].anInt486 = local211;
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 19) {
					Class10.method266();
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 154) {
					this.anInt446 = this.aClass1_Sub1_Sub3_4.method498();
					this.aBoolean45 = true;
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 101) {
					if (this.anInt256 == 12) {
						this.aBoolean45 = true;
					}
					this.anInt346 = this.aClass1_Sub1_Sub3_4.method501();
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 70) {
					local207 = this.aClass1_Sub1_Sub3_4.method500();
					local211 = this.aClass1_Sub1_Sub3_4.method503();
					this.anIntArray89[local207] = local211;
					if (this.anIntArray38[local207] != local211) {
						this.anIntArray38[local207] = local211;
						this.method208(this.aBoolean76, local207);
						this.aBoolean45 = true;
						if (this.anInt384 != -1) {
							this.aBoolean65 = true;
						}
					}
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 44) {
					local207 = this.aClass1_Sub1_Sub3_4.method500();
					local211 = this.aClass1_Sub1_Sub3_4.method500();
					Class6.aClass6Array1[local207].anInt485 = 2;
					Class6.aClass6Array1[local207].anInt486 = local211;
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 108) {
					this.anInt285 = this.aClass1_Sub1_Sub3_4.method500();
					this.anInt270 = this.aClass1_Sub1_Sub3_4.method498();
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 29) {
					this.method136();
					this.anInt252 = -1;
					return false;
				}
				if (this.anInt252 == 74) {
					local207 = this.aClass1_Sub1_Sub3_4.method500();
					local211 = this.aClass1_Sub1_Sub3_4.method500();
					if (this.anInt436 == local207 && this.anInt437 == local211 && this.anInt288 == 2) {
						this.anInt252 = -1;
						return true;
					}
					this.anInt436 = local207;
					this.anInt437 = local211;
					this.anInt390 = (this.anInt436 - 6) * 8;
					this.anInt391 = (this.anInt437 - 6) * 8;
					this.aBoolean64 = false;
					if ((this.anInt436 / 8 == 48 || this.anInt436 / 8 == 49) && this.anInt437 / 8 == 48) {
						this.aBoolean64 = true;
					}
					if (this.anInt436 / 8 == 48 && this.anInt437 / 8 == 148) {
						this.aBoolean64 = true;
					}
					this.anInt288 = 1;
					this.aLong14 = System.currentTimeMillis();
					this.aClass37_26.method538();
					this.aClass1_Sub1_Sub2_Sub4_2.method465(0, "Loading - please wait.", 673, 151, 257);
					this.aClass1_Sub1_Sub2_Sub4_2.method465(16777215, "Loading - please wait.", 673, 150, 256);
					this.aClass37_26.method539(4, super.aGraphics2, 4, this.anInt455);
					local215 = 0;
					for (local279 = (this.anInt436 - 6) / 8; local279 <= (this.anInt436 + 6) / 8; local279++) {
						for (local283 = (this.anInt437 - 6) / 8; local283 <= (this.anInt437 + 6) / 8; local283++) {
							local215++;
						}
					}
					this.aByteArrayArray2 = new byte[local215][];
					this.aByteArrayArray1 = new byte[local215][];
					this.anIntArray52 = new int[local215];
					this.anIntArray53 = new int[local215];
					this.anIntArray54 = new int[local215];
					local215 = 0;
					for (local283 = (this.anInt436 - 6) / 8; local283 <= (this.anInt436 + 6) / 8; local283++) {
						for (local600 = (this.anInt437 - 6) / 8; local600 <= (this.anInt437 + 6) / 8; local600++) {
							this.anIntArray52[local215] = (local283 << 8) + local600;
							if (this.aBoolean64 && (local600 == 49 || local600 == 149 || local600 == 147 || local283 == 50 || local283 == 49 && local600 == 47)) {
								this.anIntArray53[local215] = -1;
								this.anIntArray54[local215] = -1;
								local215++;
							} else {
								local621 = this.anIntArray53[local215] = this.aClass45_Sub1_1.method652(local283, local600, 0);
								if (local621 != -1) {
									this.aClass45_Sub1_1.method657(3, local621);
								}
								local1194 = this.anIntArray54[local215] = this.aClass45_Sub1_1.method652(local283, local600, 1);
								if (local1194 != -1) {
									this.aClass45_Sub1_1.method657(3, local1194);
								}
								local215++;
							}
						}
					}
					local600 = this.anInt390 - this.anInt392;
					local621 = this.anInt391 - this.anInt393;
					this.anInt392 = this.anInt390;
					this.anInt393 = this.anInt391;
					for (local1194 = 0; local1194 < 16384; local1194++) {
						@Pc(2359) Class1_Sub1_Sub1_Sub1_Sub1 local2359 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local1194];
						if (local2359 != null) {
							for (@Pc(2363) int local2363 = 0; local2363 < 10; local2363++) {
								local2359.anIntArray16[local2363] -= local600;
								local2359.anIntArray17[local2363] -= local621;
							}
							local2359.anInt134 -= local600 * 128;
							local2359.anInt135 -= local621 * 128;
						}
					}
					for (@Pc(2407) int local2407 = 0; local2407 < this.anInt320; local2407++) {
						@Pc(2414) Class1_Sub1_Sub1_Sub1_Sub2 local2414 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local2407];
						if (local2414 != null) {
							for (@Pc(2418) int local2418 = 0; local2418 < 10; local2418++) {
								local2414.anIntArray16[local2418] -= local600;
								local2414.anIntArray17[local2418] -= local621;
							}
							local2414.anInt134 -= local600 * 128;
							local2414.anInt135 -= local621 * 128;
						}
					}
					this.aBoolean49 = true;
					@Pc(2466) byte local2466 = 0;
					@Pc(2468) byte local2468 = 104;
					@Pc(2470) byte local2470 = 1;
					if (local600 < 0) {
						local2466 = 103;
						local2468 = -1;
						local2470 = -1;
					}
					@Pc(2480) byte local2480 = 0;
					@Pc(2482) byte local2482 = 104;
					@Pc(2484) byte local2484 = 1;
					if (local621 < 0) {
						local2480 = 103;
						local2482 = -1;
						local2484 = -1;
					}
					for (@Pc(2494) int local2494 = local2466; local2494 != local2468; local2494 += local2470) {
						for (@Pc(2498) int local2498 = local2480; local2498 != local2482; local2498 += local2484) {
							@Pc(2504) int local2504 = local2494 + local600;
							@Pc(2508) int local2508 = local2498 + local621;
							for (@Pc(2510) int local2510 = 0; local2510 < 4; local2510++) {
								if (local2504 >= 0 && local2508 >= 0 && local2504 < 104 && local2508 < 104) {
									this.aClass31ArrayArrayArray1[local2510][local2494][local2498] = this.aClass31ArrayArrayArray1[local2510][local2504][local2508];
								} else {
									this.aClass31ArrayArrayArray1[local2510][local2494][local2498] = null;
								}
							}
						}
					}
					for (@Pc(2572) Class1_Sub2 local2572 = (Class1_Sub2) this.aClass31_1.method523(); local2572 != null; local2572 = (Class1_Sub2) this.aClass31_1.method525()) {
						local2572.anInt845 -= local600;
						local2572.anInt846 -= local621;
						if (local2572.anInt845 < 0 || local2572.anInt846 < 0 || local2572.anInt845 >= 104 || local2572.anInt846 >= 104) {
							local2572.method669();
						}
					}
					if (this.anInt272 != 0) {
						this.anInt272 -= local600;
						this.anInt273 -= local621;
					}
					this.aBoolean78 = false;
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 223) {
					local207 = this.aClass1_Sub1_Sub3_4.method500();
					local211 = this.aClass1_Sub1_Sub3_4.method501();
					local215 = this.aClass1_Sub1_Sub3_4.method501();
					@Pc(2653) Class6 local2653 = Class6.aClass6Array1[local207];
					local2653.anInt473 = local211;
					local2653.anInt474 = local215;
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 144) {
					this.anInt358 = this.aClass1_Sub1_Sub3_4.method498();
					this.anInt387 = this.aClass1_Sub1_Sub3_4.method498();
					this.anInt427 = this.aClass1_Sub1_Sub3_4.method498();
					this.aBoolean85 = true;
					this.aBoolean65 = true;
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 114) {
					this.aBoolean45 = true;
					local207 = this.aClass1_Sub1_Sub3_4.method500();
					local1392 = Class6.aClass6Array1[local207];
					while (this.aClass1_Sub1_Sub3_4.anInt796 < this.anInt251) {
						local215 = this.aClass1_Sub1_Sub3_4.method498();
						local279 = this.aClass1_Sub1_Sub3_4.method500();
						local283 = this.aClass1_Sub1_Sub3_4.method498();
						if (local283 == 255) {
							local283 = this.aClass1_Sub1_Sub3_4.method503();
						}
						if (local215 >= 0 && local215 < local1392.anIntArray96.length) {
							local1392.anIntArray96[local215] = local279;
							local1392.anIntArray97[local215] = local283;
						}
					}
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 90) {
					for (local207 = 0; local207 < this.anIntArray38.length; local207++) {
						if (this.anIntArray38[local207] != this.anIntArray89[local207]) {
							this.anIntArray38[local207] = this.anIntArray89[local207];
							this.method208(this.aBoolean76, local207);
							this.aBoolean45 = true;
						}
					}
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 199) {
					local207 = this.aClass1_Sub1_Sub3_4.method500();
					local211 = this.aClass1_Sub1_Sub3_4.method498();
					local215 = this.aClass1_Sub1_Sub3_4.method500();
					if (this.aBoolean59 && !aBoolean57 && this.anInt325 < 50) {
						this.anIntArray83[this.anInt325] = local207;
						this.anIntArray49[this.anInt325] = local211;
						this.anIntArray41[this.anInt325] = local215 + Class5.anIntArray31[local207];
						this.anInt325++;
					}
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 192) {
					this.aBoolean78 = true;
					this.anInt259 = this.aClass1_Sub1_Sub3_4.method498();
					this.anInt260 = this.aClass1_Sub1_Sub3_4.method498();
					this.anInt261 = this.aClass1_Sub1_Sub3_4.method500();
					this.anInt262 = this.aClass1_Sub1_Sub3_4.method498();
					this.anInt263 = this.aClass1_Sub1_Sub3_4.method498();
					if (this.anInt263 >= 100) {
						local207 = this.anInt259 * 128 + 64;
						local211 = this.anInt260 * 128 + 64;
						local215 = this.method168(this.anInt279, local207, local211, 54) - this.anInt261;
						local279 = local207 - this.anInt303;
						local283 = local215 - this.anInt304;
						local600 = local211 - this.anInt305;
						local621 = (int) Math.sqrt((double) (local279 * local279 + local600 * local600));
						this.anInt306 = (int) (Math.atan2((double) local283, (double) local621) * 325.949D) & 0x7FF;
						this.anInt307 = (int) (Math.atan2((double) local279, (double) local600) * -325.949D) & 0x7FF;
						if (this.anInt306 < 128) {
							this.anInt306 = 128;
						}
						if (this.anInt306 > 383) {
							this.anInt306 = 383;
						}
					}
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 213) {
					local207 = this.aClass1_Sub1_Sub3_4.method500();
					local211 = this.aClass1_Sub1_Sub3_4.method501();
					local515 = Class6.aClass6Array1[local207];
					local515.anInt489 = local211;
					if (local211 == -1) {
						local515.anInt464 = 0;
						local515.anInt465 = 0;
					}
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 55) {
					this.anInt356 = this.aClass1_Sub1_Sub3_4.method498();
					this.anInt357 = this.aClass1_Sub1_Sub3_4.method498();
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 0) {
					local3049 = this.aClass1_Sub1_Sub3_4.method505();
					@Pc(3063) long local3063;
					if (local3049.endsWith(":tradereq:")) {
						local1286 = local3049.substring(0, local3049.indexOf(":"));
						local3063 = Class49.method679(local1286);
						local598 = false;
						for (local600 = 0; local600 < this.anInt428; local600++) {
							if (this.aLongArray3[local600] == local3063) {
								local598 = true;
								break;
							}
						}
						if (!local598 && this.anInt289 == 0) {
							this.method121(4, "wishes to trade with you.", local1286);
						}
					} else if (local3049.endsWith(":duelreq:")) {
						local1286 = local3049.substring(0, local3049.indexOf(":"));
						local3063 = Class49.method679(local1286);
						local598 = false;
						for (local600 = 0; local600 < this.anInt428; local600++) {
							if (this.aLongArray3[local600] == local3063) {
								local598 = true;
								break;
							}
						}
						if (!local598 && this.anInt289 == 0) {
							this.method121(8, "wishes to duel with you.", local1286);
						}
					} else {
						this.method121(0, local3049, "");
					}
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 100) {
					this.aBoolean78 = true;
					this.anInt429 = this.aClass1_Sub1_Sub3_4.method498();
					this.anInt430 = this.aClass1_Sub1_Sub3_4.method498();
					this.anInt431 = this.aClass1_Sub1_Sub3_4.method500();
					this.anInt432 = this.aClass1_Sub1_Sub3_4.method498();
					this.anInt433 = this.aClass1_Sub1_Sub3_4.method498();
					if (this.anInt433 >= 100) {
						this.anInt303 = this.anInt429 * 128 + 64;
						this.anInt305 = this.anInt430 * 128 + 64;
						this.anInt304 = this.method168(this.anInt279, this.anInt303, this.anInt305, 54) - this.anInt431;
					}
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 25) {
					local207 = this.aClass1_Sub1_Sub3_4.method500();
					@Pc(3246) boolean local3246 = this.aClass1_Sub1_Sub3_4.method498() == 1;
					Class6.aClass6Array1[local207].aBoolean93 = local3246;
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 209) {
					local207 = this.aClass1_Sub1_Sub3_4.method500();
					this.method202(local207);
					if (this.anInt461 != -1) {
						this.anInt461 = -1;
						this.aBoolean45 = true;
						this.aBoolean72 = true;
					}
					if (this.anInt312 != -1) {
						this.anInt312 = -1;
						this.aBoolean65 = true;
					}
					if (this.aBoolean51) {
						this.aBoolean51 = false;
						this.aBoolean65 = true;
					}
					this.anInt379 = local207;
					this.aBoolean80 = false;
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 126) {
					for (local207 = 0; local207 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length; local207++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local207] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local207].anInt157 = -1;
						}
					}
					for (local211 = 0; local211 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length; local211++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local211] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local211].anInt157 = -1;
						}
					}
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 42) {
					if (this.anInt256 == 12) {
						this.aBoolean45 = true;
					}
					this.anInt278 = this.aClass1_Sub1_Sub3_4.method498();
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 104) {
					this.method167(this.anInt251, this.aClass1_Sub1_Sub3_4);
					this.aBoolean49 = false;
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 56) {
					this.aBoolean45 = true;
					local207 = this.aClass1_Sub1_Sub3_4.method498();
					local211 = this.aClass1_Sub1_Sub3_4.method503();
					local215 = this.aClass1_Sub1_Sub3_4.method498();
					this.anIntArray64[local207] = local211;
					this.anIntArray45[local207] = local215;
					this.anIntArray36[local207] = 1;
					for (local279 = 0; local279 < 98; local279++) {
						if (local211 >= anIntArray78[local279]) {
							this.anIntArray36[local207] = local279 + 2;
						}
					}
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 134) {
					local207 = this.aClass1_Sub1_Sub3_4.method500();
					this.method202(local207);
					if (this.anInt312 != -1) {
						this.anInt312 = -1;
						this.aBoolean65 = true;
					}
					if (this.aBoolean51) {
						this.aBoolean51 = false;
						this.aBoolean65 = true;
					}
					this.anInt461 = local207;
					this.aBoolean45 = true;
					this.aBoolean72 = true;
					this.anInt379 = -1;
					this.aBoolean80 = false;
					this.anInt252 = -1;
					return true;
				}
				if (this.anInt252 == 105) {
					this.anInt368 = this.aClass1_Sub1_Sub3_4.method503();
					this.anInt298 = this.aClass1_Sub1_Sub3_4.method500();
					this.anInt444 = this.aClass1_Sub1_Sub3_4.method498();
					this.anInt280 = this.aClass1_Sub1_Sub3_4.method500();
					this.anInt369 = this.aClass1_Sub1_Sub3_4.method498();
					if (this.anInt368 != 0 && this.anInt379 == -1) {
						signlink.dnslookup(Class49.method682(this.anInt368));
						this.method106();
						@Pc(3558) short local3558 = 650;
						if (this.anInt444 != 201 || this.anInt369 == 1) {
							local3558 = 655;
						}
						this.aString18 = "";
						this.aBoolean52 = false;
						for (local211 = 0; local211 < Class6.aClass6Array1.length; local211++) {
							if (Class6.aClass6Array1[local211] != null && Class6.aClass6Array1[local211].anInt470 == local3558) {
								this.anInt379 = Class6.aClass6Array1[local211].anInt467;
								break;
							}
						}
					}
					this.anInt252 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt252 + "," + this.anInt251 + " - " + this.anInt457 + "," + this.anInt458);
				this.method136();
			} catch (@Pc(3635) IOException local3635) {
				this.method223();
			} catch (@Pc(3640) Exception local3640) {
				local3049 = "T2 - " + this.anInt252 + "," + this.anInt457 + "," + this.anInt458 + " - " + this.anInt251 + "," + (this.anInt390 + aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0]) + "," + (this.anInt391 + aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0]) + " - ";
				for (local211 = 0; local211 < this.anInt251 && local211 < 50; local211++) {
					local3049 = local3049 + this.aClass1_Sub1_Sub3_4.aByteArray9[local211] + ",";
				}
				signlink.reporterror(local3049);
				this.method136();
			}
			return true;
		} catch (@Pc(3721) RuntimeException local3721) {
			signlink.reporterror("86088, " + arg0 + ", " + local3721.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method115() {
		try {
			this.anInt251 += 0;
			@Pc(10) Graphics local10 = this.method95().getGraphics();
			local10.setColor(Color.black);
			local10.fillRect(0, 0, 765, 503);
			this.method88();
			@Pc(42) byte local42;
			@Pc(48) int local48;
			if (this.aBoolean55) {
				this.aBoolean46 = false;
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
			if (this.aBoolean88) {
				this.aBoolean46 = false;
				local10.setFont(new Font("Helvetica", 1, 20));
				local10.setColor(Color.white);
				local10.drawString("Error - unable to load game!", 50, 50);
				local10.drawString("To play RuneScape make sure you play from", 50, 100);
				local10.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean79) {
				this.aBoolean46 = false;
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
			signlink.reporterror("51315, " + 0 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method116() {
		try {
			@Pc(7) int local7 = this.anInt421;
			@Pc(10) int local10 = this.anInt422;
			@Pc(13) int local13 = this.anInt423;
			@Pc(16) int local16 = this.anInt424;
			Class1_Sub1_Sub2.method458(local10, local7, 6116423, local13, local16);
			Class1_Sub1_Sub2.method458(local10 + 1, local7 + 1, 0, local13 - 2, 16);
			Class1_Sub1_Sub2.method459(0, local10 + 18, local13 - 2, local16 - 19, local7 + 1);
			this.aClass1_Sub1_Sub2_Sub4_3.method468(local7 + 3, "Choose Option", local10 + 14, 6116423);
			@Pc(68) int local68 = super.anInt240;
			@Pc(71) int local71 = super.anInt241;
			if (this.anInt420 == 0) {
				local68 -= 4;
				local71 -= 4;
			}
			if (this.anInt420 == 1) {
				local68 -= 553;
				local71 -= 205;
			}
			if (this.anInt420 == 2) {
				local68 -= 17;
				local71 -= 357;
			}
			for (@Pc(90) int local90 = 0; local90 < this.anInt318; local90++) {
				@Pc(105) int local105 = local10 + (this.anInt318 - 1 - local90) * 15 + 31;
				@Pc(107) int local107 = 16777215;
				if (local68 > local7 && local68 < local7 + local13 && local71 > local105 - 13 && local71 < local105 + 3) {
					local107 = 16776960;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method470(this.aStringArray1[local90], local105, local7 + 3, local107, true);
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("90403, " + 341 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method117(@OriginalArg(0) String arg0) throws IOException {
		return signlink.mainapp == null ? new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream()) : signlink.openurl(arg0);
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)Z")
	private boolean method119() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("42513, " + 394 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBIZIIIIIIII)Z")
	private boolean method120(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray2[local7][local11] = 0;
					this.anIntArrayArray3[local7][local11] = 99999999;
				}
			}
			local11 = arg7;
			@Pc(39) int local39 = arg8;
			this.anIntArrayArray2[arg7][arg8] = 99;
			this.anIntArrayArray3[arg7][arg8] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray81[0] = arg7;
			@Pc(66) int local66 = local55 + 1;
			this.anIntArray82[0] = arg8;
			@Pc(70) boolean local70 = false;
			@Pc(74) int local74 = this.anIntArray81.length;
			@Pc(81) int[][] local81 = this.aClass19Array1[this.anInt279].anIntArrayArray17;
			@Pc(193) int local193;
			while (local57 != local66) {
				local11 = this.anIntArray81[local57];
				local39 = this.anIntArray82[local57];
				local57 = (local57 + 1) % local74;
				if (local11 == arg0 && local39 == arg9) {
					local70 = true;
					break;
				}
				if (arg4 != 0) {
					if ((arg4 < 5 || arg4 == 10) && this.aClass19Array1[this.anInt279].method423(arg4 - 1, arg0, arg9, local39, arg11, local11)) {
						local70 = true;
						break;
					}
					if (arg4 < 10 && this.aClass19Array1[this.anInt279].method424(arg0, this.anInt389, arg4 - 1, local39, arg11, local11, arg9)) {
						local70 = true;
						break;
					}
				}
				if (arg6 != 0 && arg2 != 0 && this.aClass19Array1[this.anInt279].method425(arg2, arg0, arg6, arg9, local39, arg5, local11)) {
					local70 = true;
					break;
				}
				local193 = this.anIntArrayArray3[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray2[local11 - 1][local39] == 0 && (local81[local11 - 1][local39] & 0x280108) == 0) {
					this.anIntArray81[local66] = local11 - 1;
					this.anIntArray82[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray2[local11 - 1][local39] = 2;
					this.anIntArrayArray3[local11 - 1][local39] = local193;
				}
				if (local11 < 103 && this.anIntArrayArray2[local11 + 1][local39] == 0 && (local81[local11 + 1][local39] & 0x280180) == 0) {
					this.anIntArray81[local66] = local11 + 1;
					this.anIntArray82[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray2[local11 + 1][local39] = 8;
					this.anIntArrayArray3[local11 + 1][local39] = local193;
				}
				if (local39 > 0 && this.anIntArrayArray2[local11][local39 - 1] == 0 && (local81[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray81[local66] = local11;
					this.anIntArray82[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray2[local11][local39 - 1] = 1;
					this.anIntArrayArray3[local11][local39 - 1] = local193;
				}
				if (local39 < 103 && this.anIntArrayArray2[local11][local39 + 1] == 0 && (local81[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray81[local66] = local11;
					this.anIntArray82[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray2[local11][local39 + 1] = 4;
					this.anIntArrayArray3[local11][local39 + 1] = local193;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray2[local11 - 1][local39 - 1] == 0 && (local81[local11 - 1][local39 - 1] & 0x28010E) == 0 && (local81[local11 - 1][local39] & 0x280108) == 0 && (local81[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray81[local66] = local11 - 1;
					this.anIntArray82[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray2[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray3[local11 - 1][local39 - 1] = local193;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray2[local11 + 1][local39 - 1] == 0 && (local81[local11 + 1][local39 - 1] & 0x280183) == 0 && (local81[local11 + 1][local39] & 0x280180) == 0 && (local81[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray81[local66] = local11 + 1;
					this.anIntArray82[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray2[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray3[local11 + 1][local39 - 1] = local193;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray2[local11 - 1][local39 + 1] == 0 && (local81[local11 - 1][local39 + 1] & 0x280138) == 0 && (local81[local11 - 1][local39] & 0x280108) == 0 && (local81[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray81[local66] = local11 - 1;
					this.anIntArray82[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray2[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray3[local11 - 1][local39 + 1] = local193;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray2[local11 + 1][local39 + 1] == 0 && (local81[local11 + 1][local39 + 1] & 0x2801E0) == 0 && (local81[local11 + 1][local39] & 0x280180) == 0 && (local81[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray81[local66] = local11 + 1;
					this.anIntArray82[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray2[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray3[local11 + 1][local39 + 1] = local193;
				}
			}
			this.anInt300 = 0;
			@Pc(806) boolean local806 = false;
			@Pc(820) int local820;
			@Pc(826) int local826;
			@Pc(832) int local832;
			if (!local70) {
				if (arg3) {
					local193 = 100;
					for (local820 = 1; local820 < 2; local820++) {
						for (local826 = arg0 - local820; local826 <= arg0 + local820; local826++) {
							for (local832 = arg9 - local820; local832 <= arg9 + local820; local832++) {
								if (local826 >= 0 && local832 >= 0 && local826 < 104 && local832 < 104 && this.anIntArrayArray3[local826][local832] < local193) {
									local193 = this.anIntArrayArray3[local826][local832];
									local11 = local826;
									local39 = local832;
									this.anInt300 = 1;
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
			@Pc(893) byte local893 = 0;
			this.anIntArray81[0] = local11;
			local57 = local893 + 1;
			this.anIntArray82[0] = local39;
			local193 = local820 = this.anIntArrayArray2[local11][local39];
			while (local11 != arg7 || local39 != arg8) {
				if (local193 != local820) {
					local820 = local193;
					this.anIntArray81[local57] = local11;
					this.anIntArray82[local57++] = local39;
				}
				if ((local193 & 0x2) != 0) {
					local11++;
				} else if ((local193 & 0x8) != 0) {
					local11--;
				}
				if ((local193 & 0x1) != 0) {
					local39++;
				} else if ((local193 & 0x4) != 0) {
					local39--;
				}
				local193 = this.anIntArrayArray2[local11][local39];
			}
			if (local57 > 0) {
				local74 = local57;
				if (local57 > 25) {
					local74 = 25;
				}
				local57--;
				local826 = this.anIntArray81[local57];
				local832 = this.anIntArray82[local57];
				if (arg10 == 0) {
					this.aClass1_Sub1_Sub3_3.method487(215, this.anInt378);
					this.aClass1_Sub1_Sub3_3.method488(local74 + local74 + 3);
				}
				if (arg10 == 1) {
					this.aClass1_Sub1_Sub3_3.method487(84, this.anInt378);
					this.aClass1_Sub1_Sub3_3.method488(local74 + local74 + 3 + 14);
				}
				if (arg10 == 2) {
					this.aClass1_Sub1_Sub3_3.method487(252, this.anInt378);
					this.aClass1_Sub1_Sub3_3.method488(local74 + local74 + 3);
				}
				if (super.anIntArray32[5] == 1) {
					this.aClass1_Sub1_Sub3_3.method488(1);
				} else {
					this.aClass1_Sub1_Sub3_3.method488(0);
				}
				this.aClass1_Sub1_Sub3_3.method489(local826 + this.anInt390);
				this.aClass1_Sub1_Sub3_3.method489(local832 + this.anInt391);
				this.anInt272 = this.anIntArray81[0];
				this.anInt273 = this.anIntArray82[0];
				for (@Pc(1084) int local1084 = 1; local1084 < local74; local1084++) {
					local57--;
					this.aClass1_Sub1_Sub3_3.method488(this.anIntArray81[local57] - local826);
					this.aClass1_Sub1_Sub3_3.method488(this.anIntArray82[local57] - local832);
				}
				return true;
			} else if (arg10 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1119) RuntimeException local1119) {
			signlink.reporterror("25524, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local1119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
	private void method121(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		try {
			if (arg0 == 0 && this.anInt384 != -1) {
				this.aString12 = arg1;
				super.anInt245 = 0;
			}
			if (this.anInt312 == -1) {
				this.aBoolean65 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray90[local20] = this.anIntArray90[local20 - 1];
				this.aStringArray4[local20] = this.aStringArray4[local20 - 1];
				this.aStringArray5[local20] = this.aStringArray5[local20 - 1];
			}
			this.anIntArray90[0] = arg0;
			this.aStringArray4[0] = arg2;
			this.aStringArray5[0] = arg1;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("11463, " + 2 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method122() {
		try {
			@Pc(6) Class1_Sub1_Sub1_Sub4 local6 = (Class1_Sub1_Sub1_Sub4) this.aClass31_2.method523();
			this.aBoolean70 &= true;
			while (local6 != null) {
				if (local6.anInt514 != this.anInt279 || anInt268 > local6.anInt520) {
					local6.method669();
				} else if (anInt268 >= local6.anInt519) {
					if (local6.anInt523 > 0) {
						@Pc(42) Class1_Sub1_Sub1_Sub1_Sub1 local42 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local6.anInt523 - 1];
						if (local42 != null && local42.anInt134 >= 0 && local42.anInt134 < 13312 && local42.anInt135 >= 0 && local42.anInt135 < 13312) {
							local6.method254(anInt268, local42.anInt134, local42.anInt135, this.method168(local6.anInt514, local42.anInt134, local42.anInt135, 54) - local6.anInt518);
						}
					}
					if (local6.anInt523 < 0) {
						@Pc(87) int local87 = -local6.anInt523 - 1;
						@Pc(93) Class1_Sub1_Sub1_Sub1_Sub2 local93;
						if (local87 == this.anInt285) {
							local93 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
						} else {
							local93 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local87];
						}
						if (local93 != null && local93.anInt134 >= 0 && local93.anInt134 < 13312 && local93.anInt135 >= 0 && local93.anInt135 < 13312) {
							local6.method254(anInt268, local93.anInt134, local93.anInt135, this.method168(local6.anInt514, local93.anInt134, local93.anInt135, 54) - local6.anInt518);
						}
					}
					local6.method255(this.anInt398);
					this.aClass39_1.method555(local6, (int) local6.aDouble3, this.anInt279, -1, (int) local6.aDouble1, 60, (int) local6.aDouble2, local6.anInt524, false);
				}
				local6 = (Class1_Sub1_Sub1_Sub4) this.aClass31_2.method525();
			}
		} catch (@Pc(173) RuntimeException local173) {
			signlink.reporterror("74697, " + true + ", " + local173.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method123() {
		try {
			this.aBoolean67 = true;
			for (@Pc(6) int local6 = 0; local6 < 7; local6++) {
				this.anIntArray80[local6] = -1;
				for (@Pc(15) int local15 = 0; local15 < Class23.anInt771; local15++) {
					if (!Class23.aClass23Array1[local15].aBoolean175 && Class23.aClass23Array1[local15].anInt772 == local6 + (this.aBoolean87 ? 0 : 7)) {
						this.anIntArray80[local6] = local15;
						break;
					}
				}
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("25212, " + -14998 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JZ)V")
	private void method124(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt445 >= 100 && this.anInt270 != 1) {
					this.method121(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
				} else if (this.anInt445 >= 200) {
					this.method121(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
				} else {
					@Pc(38) String local38 = Class49.method683(Class49.method680(arg0));
					this.aBoolean70 &= true;
					for (@Pc(46) int local46 = 0; local46 < this.anInt445; local46++) {
						if (this.aLongArray4[local46] == arg0) {
							this.method121(0, local38 + " is already on your friend list", "");
							return;
						}
					}
					for (@Pc(76) int local76 = 0; local76 < this.anInt428; local76++) {
						if (this.aLongArray3[local76] == arg0) {
							this.method121(0, "Please remove " + local38 + " from your ignore list first", "");
							return;
						}
					}
					if (!local38.equals(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4)) {
						this.aStringArray2[this.anInt445] = local38;
						this.aLongArray4[this.anInt445] = arg0;
						this.anIntArray55[this.anInt445] = 0;
						this.anInt445++;
						this.aBoolean45 = true;
						this.aClass1_Sub1_Sub3_3.method487(218, this.anInt378);
						this.aClass1_Sub1_Sub3_3.method494(arg0);
					}
				}
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("87881, " + arg0 + ", " + true + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method125() {
		try {
			@Pc(15) int local15;
			@Pc(22) int local22;
			if (this.anInt400 == 0) {
				local15 = super.anInt236 / 2 - 80;
				local22 = super.anInt237 / 2 + 20;
				local22 += 20;
				if (super.anInt245 == 1 && super.anInt246 >= local15 - 75 && super.anInt246 <= local15 + 75 && super.anInt247 >= local22 - 20 && super.anInt247 <= local22 + 20) {
					this.anInt400 = 3;
					this.anInt412 = 0;
				}
				local15 = super.anInt236 / 2 + 80;
				if (super.anInt245 == 1 && super.anInt246 >= local15 - 75 && super.anInt246 <= local15 + 75 && super.anInt247 >= local22 - 20 && super.anInt247 <= local22 + 20) {
					this.aString9 = "";
					this.aString10 = "Enter your username & password.";
					this.anInt400 = 2;
					this.anInt412 = 0;
				}
			} else if (this.anInt400 == 2) {
				local15 = super.anInt237 / 2 - 40;
				local15 += 30;
				local15 += 25;
				if (super.anInt245 == 1 && super.anInt247 >= local15 - 15 && super.anInt247 < local15) {
					this.anInt412 = 0;
				}
				local15 += 15;
				if (super.anInt245 == 1 && super.anInt247 >= local15 - 15 && super.anInt247 < local15) {
					this.anInt412 = 1;
				}
				local15 += 15;
				local22 = super.anInt236 / 2 - 80;
				@Pc(168) int local168 = super.anInt237 / 2 + 50;
				@Pc(169) int local169 = local168 + 20;
				if (super.anInt245 == 1 && super.anInt246 >= local22 - 75 && super.anInt246 <= local22 + 75 && super.anInt247 >= local169 - 20 && super.anInt247 <= local169 + 20) {
					this.method176(this.aString5, this.aString6, false);
					if (this.aBoolean70) {
						return;
					}
				}
				local22 = super.anInt236 / 2 + 80;
				if (super.anInt245 == 1 && super.anInt246 >= local22 - 75 && super.anInt246 <= local22 + 75 && super.anInt247 >= local169 - 20 && super.anInt247 <= local169 + 20) {
					this.anInt400 = 0;
					this.aString5 = "";
					this.aString6 = "";
				}
				while (true) {
					while (true) {
						@Pc(256) int local256 = this.method89();
						if (local256 == -1) {
							return;
						}
						@Pc(261) boolean local261 = false;
						for (@Pc(263) int local263 = 0; local263 < aString13.length(); local263++) {
							if (local256 == aString13.charAt(local263)) {
								local261 = true;
								break;
							}
						}
						if (this.anInt412 == 0) {
							if (local256 == 8 && this.aString5.length() > 0) {
								this.aString5 = this.aString5.substring(0, this.aString5.length() - 1);
							}
							if (local256 == 9 || local256 == 10 || local256 == 13) {
								this.anInt412 = 1;
							}
							if (local261) {
								this.aString5 = this.aString5 + (char) local256;
							}
							if (this.aString5.length() > 12) {
								this.aString5 = this.aString5.substring(0, 12);
							}
						} else if (this.anInt412 == 1) {
							if (local256 == 8 && this.aString6.length() > 0) {
								this.aString6 = this.aString6.substring(0, this.aString6.length() - 1);
							}
							if (local256 == 9 || local256 == 10 || local256 == 13) {
								this.anInt412 = 0;
							}
							if (local261) {
								this.aString6 = this.aString6 + (char) local256;
							}
							if (this.aString6.length() > 20) {
								this.aString6 = this.aString6.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt400 == 3) {
				local15 = super.anInt236 / 2;
				local22 = super.anInt237 / 2 + 50;
				@Pc(420) int local420 = local22 + 20;
				if (super.anInt245 == 1 && super.anInt246 >= local15 - 75 && super.anInt246 <= local15 + 75 && super.anInt247 >= local420 - 20 && super.anInt247 <= local420 + 20) {
					this.anInt400 = 0;
					return;
				}
			}
		} catch (@Pc(453) RuntimeException local453) {
			signlink.reporterror("95143, " + 0 + ", " + local453.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method90() {
		if (signlink.sunjava) {
			super.anInt234 = 5;
		}
		if (aBoolean63) {
			this.aBoolean79 = true;
			return;
		}
		aBoolean63 = true;
		@Pc(16) boolean local16 = false;
		@Pc(20) String local20 = this.method221();
		if (local20.endsWith("jagex.com")) {
			local16 = true;
		}
		if (local20.endsWith("runescape.com")) {
			local16 = true;
		}
		if (local20.endsWith("192.168.1.2")) {
			local16 = true;
		}
		if (local20.endsWith("192.168.1.246")) {
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
			this.aBoolean88 = true;
			return;
		}
		@Pc(84) int local84;
		if (signlink.aRandomAccessFile1 != null) {
			for (local84 = 0; local84 < 5; local84++) {
				this.aClass46Array1[local84] = new Class46(-61, 500000, signlink.aRandomAccessFile1, local84 + 1, signlink.aRandomAccessFileArray1[local84]);
			}
		}
		try {
			local84 = 5;
			this.anIntArray79[8] = 0;
			while (this.anIntArray79[8] == 0) {
				this.method97("Connecting to web server", 20);
				try {
					@Pc(133) DataInputStream local133 = this.method117("crc" + (int) (Math.random() * 9.9999999E7D));
					@Pc(140) Class1_Sub1_Sub3 local140 = new Class1_Sub1_Sub3(45427, new byte[36]);
					local133.readFully(local140.aByteArray9, 0, 36);
					for (@Pc(148) int local148 = 0; local148 < 9; local148++) {
						this.anIntArray79[local148] = local140.method503();
					}
					local133.close();
				} catch (@Pc(164) IOException local164) {
					for (@Pc(166) int local166 = local84; local166 > 0; local166--) {
						this.method97("Error loading - Will retry in " + local166 + " secs.", 10);
						try {
							Thread.sleep(1000L);
						} catch (@Pc(185) Exception local185) {
						}
					}
					local84 *= 2;
					if (local84 > 60) {
						local84 = 60;
					}
				}
			}
			this.aClass48_1 = this.method133(1, this.anIntArray79[1], "title", 25, anInt299, "title screen");
			this.aClass1_Sub1_Sub2_Sub4_1 = new Class1_Sub1_Sub2_Sub4(this.aClass48_1, 616, "p11");
			this.aClass1_Sub1_Sub2_Sub4_2 = new Class1_Sub1_Sub2_Sub4(this.aClass48_1, 616, "p12");
			this.aClass1_Sub1_Sub2_Sub4_3 = new Class1_Sub1_Sub2_Sub4(this.aClass48_1, 616, "b12");
			this.aClass1_Sub1_Sub2_Sub4_4 = new Class1_Sub1_Sub2_Sub4(this.aClass48_1, 616, "q8");
			this.method197(aBoolean75);
			this.method227();
			@Pc(271) Class48 local271 = this.method133(2, this.anIntArray79[2], "config", 30, anInt299, "config");
			@Pc(283) Class48 local283 = this.method133(3, this.anIntArray79[3], "interface", 35, anInt299, "interface");
			@Pc(295) Class48 local295 = this.method133(4, this.anIntArray79[4], "media", 40, anInt299, "2d graphics");
			@Pc(307) Class48 local307 = this.method133(6, this.anIntArray79[6], "textures", 45, anInt299, "textures");
			@Pc(319) Class48 local319 = this.method133(7, this.anIntArray79[7], "wordenc", 50, anInt299, "chat system");
			@Pc(331) Class48 local331 = this.method133(8, this.anIntArray79[8], "sounds", 55, anInt299, "sound effects");
			this.aByteArrayArrayArray7 = new byte[4][104][104];
			this.anIntArrayArrayArray3 = new int[4][105][105];
			this.aClass39_1 = new Class39(false, 104, this.anIntArrayArrayArray3, 4, 104);
			for (@Pc(356) int local356 = 0; local356 < 4; local356++) {
				this.aClass19Array1[local356] = new Class19(104, false, 104);
			}
			this.aClass1_Sub1_Sub2_Sub2_1 = new Class1_Sub1_Sub2_Sub2(512, 512);
			@Pc(391) Class48 local391 = this.method133(5, this.anIntArray79[5], "versionlist", 60, anInt299, "update list");
			this.method97("Connecting to update server", 60);
			this.aClass45_Sub1_1 = new Class45_Sub1();
			this.aClass45_Sub1_1.method648(local391, this);
			Class14.method324(this.aClass45_Sub1_1.method651());
			Class1_Sub1_Sub1_Sub5.method285(this.aClass45_Sub1_1.method650((byte) 6, 0), this.aClass45_Sub1_1);
			if (!aBoolean57) {
				this.anInt343 = 0;
				this.aBoolean60 = false;
				this.aClass45_Sub1_1.method657(2, this.anInt343);
				while (this.aClass45_Sub1_1.method658() > 0) {
					this.method188((byte) 2);
					try {
						Thread.sleep(100L);
					} catch (@Pc(442) Exception local442) {
					}
				}
			}
			this.method97("Requesting animations", 65);
			@Pc(458) int local458 = this.aClass45_Sub1_1.method650((byte) 6, 1);
			for (@Pc(460) int local460 = 0; local460 < local458; local460++) {
				this.aClass45_Sub1_1.method657(1, local460);
			}
			@Pc(479) int local479;
			while (this.aClass45_Sub1_1.method658() > 0) {
				local479 = local458 - this.aClass45_Sub1_1.method658();
				if (local479 > 0) {
					this.method97("Loading animations - " + local479 * 100 / local458 + "%", 65);
				}
				this.method188((byte) 2);
				try {
					Thread.sleep(100L);
				} catch (@Pc(505) Exception local505) {
				}
			}
			this.method97("Requesting models", 70);
			local458 = this.aClass45_Sub1_1.method650((byte) 6, 0);
			@Pc(531) int local531;
			for (local479 = 0; local479 < local458; local479++) {
				local531 = this.aClass45_Sub1_1.method655(local479);
				if ((local531 & 0x1) != 0) {
					this.aClass45_Sub1_1.method657(0, local479);
				}
			}
			local458 = this.aClass45_Sub1_1.method658();
			while (this.aClass45_Sub1_1.method658() > 0) {
				local531 = local458 - this.aClass45_Sub1_1.method658();
				if (local531 > 0) {
					this.method97("Loading models - " + local531 * 100 / local458 + "%", 70);
				}
				this.method188((byte) 2);
				try {
					Thread.sleep(100L);
				} catch (@Pc(582) Exception local582) {
				}
			}
			if (this.aClass46Array1[0] != null) {
				this.method97("Requesting maps", 75);
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(47, 48, 0));
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(47, 48, 1));
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(48, 48, 0));
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(48, 48, 1));
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(49, 48, 0));
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(49, 48, 1));
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(47, 47, 0));
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(47, 47, 1));
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(48, 47, 0));
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(48, 47, 1));
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(48, 148, 0));
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(48, 148, 1));
				local458 = this.aClass45_Sub1_1.method658();
				while (this.aClass45_Sub1_1.method658() > 0) {
					local531 = local458 - this.aClass45_Sub1_1.method658();
					if (local531 > 0) {
						this.method97("Loading maps - " + local531 * 100 / local458 + "%", 75);
					}
					this.method188((byte) 2);
					try {
						Thread.sleep(100L);
					} catch (@Pc(767) Exception local767) {
					}
				}
			}
			local458 = this.aClass45_Sub1_1.method650((byte) 6, 0);
			@Pc(788) int local788;
			for (local531 = 0; local531 < local458; local531++) {
				local788 = this.aClass45_Sub1_1.method655(local531);
				@Pc(790) byte local790 = 0;
				if ((local788 & 0x8) != 0) {
					local790 = 10;
				} else if ((local788 & 0x20) != 0) {
					local790 = 9;
				} else if ((local788 & 0x10) != 0) {
					local790 = 8;
				} else if ((local788 & 0x40) != 0) {
					local790 = 7;
				} else if ((local788 & 0x80) != 0) {
					local790 = 6;
				} else if ((local788 & 0x2) != 0) {
					local790 = 5;
				} else if ((local788 & 0x4) != 0) {
					local790 = 4;
				}
				if ((local788 & 0x1) != 0) {
					local790 = 3;
				}
				if (local790 != 0) {
					this.aClass45_Sub1_1.method660(local790, local531, 0);
				}
			}
			this.aClass45_Sub1_1.method653(aBoolean56);
			if (!aBoolean57) {
				local458 = this.aClass45_Sub1_1.method650((byte) 6, 2);
				for (local788 = 1; local788 < local458; local788++) {
					if (this.aClass45_Sub1_1.method656(local788)) {
						this.aClass45_Sub1_1.method660((byte) 1, local788, 2);
					}
				}
			}
			this.method97("Unpacking media", 80);
			this.aClass1_Sub1_Sub2_Sub3_18 = new Class1_Sub1_Sub2_Sub3(local295, "invback", 0);
			this.aClass1_Sub1_Sub2_Sub3_20 = new Class1_Sub1_Sub2_Sub3(local295, "chatback", 0);
			this.aClass1_Sub1_Sub2_Sub3_19 = new Class1_Sub1_Sub2_Sub3(local295, "mapback", 0);
			this.aClass1_Sub1_Sub2_Sub3_15 = new Class1_Sub1_Sub2_Sub3(local295, "backbase1", 0);
			this.aClass1_Sub1_Sub2_Sub3_16 = new Class1_Sub1_Sub2_Sub3(local295, "backbase2", 0);
			this.aClass1_Sub1_Sub2_Sub3_17 = new Class1_Sub1_Sub2_Sub3(local295, "backhmid1", 0);
			for (local788 = 0; local788 < 13; local788++) {
				this.aClass1_Sub1_Sub2_Sub3Array2[local788] = new Class1_Sub1_Sub2_Sub3(local295, "sideicons", local788);
			}
			this.aClass1_Sub1_Sub2_Sub2_2 = new Class1_Sub1_Sub2_Sub2(local295, "compass", 0);
			this.aClass1_Sub1_Sub2_Sub2_13 = new Class1_Sub1_Sub2_Sub2(local295, "mapedge", 0);
			this.aClass1_Sub1_Sub2_Sub2_13.method403(aByte16);
			@Pc(990) int local990;
			try {
				for (local990 = 0; local990 < 50; local990++) {
					this.aClass1_Sub1_Sub2_Sub3Array1[local990] = new Class1_Sub1_Sub2_Sub3(local295, "mapscene", local990);
				}
			} catch (@Pc(1008) Exception local1008) {
			}
			try {
				for (local990 = 0; local990 < 50; local990++) {
					this.aClass1_Sub1_Sub2_Sub2Array5[local990] = new Class1_Sub1_Sub2_Sub2(local295, "mapfunction", local990);
				}
			} catch (@Pc(1028) Exception local1028) {
			}
			try {
				for (local990 = 0; local990 < 20; local990++) {
					this.aClass1_Sub1_Sub2_Sub2Array4[local990] = new Class1_Sub1_Sub2_Sub2(local295, "hitmarks", local990);
				}
			} catch (@Pc(1048) Exception local1048) {
			}
			try {
				for (local990 = 0; local990 < 20; local990++) {
					this.aClass1_Sub1_Sub2_Sub2Array3[local990] = new Class1_Sub1_Sub2_Sub2(local295, "headicons", local990);
				}
			} catch (@Pc(1068) Exception local1068) {
			}
			this.aClass1_Sub1_Sub2_Sub2_11 = new Class1_Sub1_Sub2_Sub2(local295, "mapmarker", 0);
			this.aClass1_Sub1_Sub2_Sub2_12 = new Class1_Sub1_Sub2_Sub2(local295, "mapmarker", 1);
			for (local990 = 0; local990 < 8; local990++) {
				this.aClass1_Sub1_Sub2_Sub2Array7[local990] = new Class1_Sub1_Sub2_Sub2(local295, "cross", local990);
			}
			this.aClass1_Sub1_Sub2_Sub2_3 = new Class1_Sub1_Sub2_Sub2(local295, "mapdots", 0);
			this.aClass1_Sub1_Sub2_Sub2_4 = new Class1_Sub1_Sub2_Sub2(local295, "mapdots", 1);
			this.aClass1_Sub1_Sub2_Sub2_5 = new Class1_Sub1_Sub2_Sub2(local295, "mapdots", 2);
			this.aClass1_Sub1_Sub2_Sub2_6 = new Class1_Sub1_Sub2_Sub2(local295, "mapdots", 3);
			this.aClass1_Sub1_Sub2_Sub3_13 = new Class1_Sub1_Sub2_Sub3(local295, "scrollbar", 0);
			this.aClass1_Sub1_Sub2_Sub3_14 = new Class1_Sub1_Sub2_Sub3(local295, "scrollbar", 1);
			this.aClass1_Sub1_Sub2_Sub3_8 = new Class1_Sub1_Sub2_Sub3(local295, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_9 = new Class1_Sub1_Sub2_Sub3(local295, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_10 = new Class1_Sub1_Sub2_Sub3(local295, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_11 = new Class1_Sub1_Sub2_Sub3(local295, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_11.method442(923);
			this.aClass1_Sub1_Sub2_Sub3_12 = new Class1_Sub1_Sub2_Sub3(local295, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_12.method442(923);
			this.aClass1_Sub1_Sub2_Sub3_3 = new Class1_Sub1_Sub2_Sub3(local295, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_3.method443();
			this.aClass1_Sub1_Sub2_Sub3_4 = new Class1_Sub1_Sub2_Sub3(local295, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_4.method443();
			this.aClass1_Sub1_Sub2_Sub3_5 = new Class1_Sub1_Sub2_Sub3(local295, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_5.method443();
			this.aClass1_Sub1_Sub2_Sub3_6 = new Class1_Sub1_Sub2_Sub3(local295, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_6.method442(923);
			this.aClass1_Sub1_Sub2_Sub3_6.method443();
			this.aClass1_Sub1_Sub2_Sub3_7 = new Class1_Sub1_Sub2_Sub3(local295, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_7.method442(923);
			this.aClass1_Sub1_Sub2_Sub3_7.method443();
			for (@Pc(1268) int local1268 = 0; local1268 < 2; local1268++) {
				this.aClass1_Sub1_Sub2_Sub3Array4[local1268] = new Class1_Sub1_Sub2_Sub3(local295, "mod_icons", local1268);
			}
			@Pc(1291) Class1_Sub1_Sub2_Sub2 local1291 = new Class1_Sub1_Sub2_Sub2(local295, "backleft1", 0);
			this.aClass37_12 = new Class37(this.method95(), local1291.anInt699, local1291.anInt700, anInt453);
			local1291.method404(0, 0);
			@Pc(1316) Class1_Sub1_Sub2_Sub2 local1316 = new Class1_Sub1_Sub2_Sub2(local295, "backleft2", 0);
			this.aClass37_13 = new Class37(this.method95(), local1316.anInt699, local1316.anInt700, anInt453);
			local1316.method404(0, 0);
			@Pc(1341) Class1_Sub1_Sub2_Sub2 local1341 = new Class1_Sub1_Sub2_Sub2(local295, "backright1", 0);
			this.aClass37_14 = new Class37(this.method95(), local1341.anInt699, local1341.anInt700, anInt453);
			local1341.method404(0, 0);
			@Pc(1366) Class1_Sub1_Sub2_Sub2 local1366 = new Class1_Sub1_Sub2_Sub2(local295, "backright2", 0);
			this.aClass37_15 = new Class37(this.method95(), local1366.anInt699, local1366.anInt700, anInt453);
			local1366.method404(0, 0);
			@Pc(1391) Class1_Sub1_Sub2_Sub2 local1391 = new Class1_Sub1_Sub2_Sub2(local295, "backtop1", 0);
			this.aClass37_16 = new Class37(this.method95(), local1391.anInt699, local1391.anInt700, anInt453);
			local1391.method404(0, 0);
			@Pc(1416) Class1_Sub1_Sub2_Sub2 local1416 = new Class1_Sub1_Sub2_Sub2(local295, "backvmid1", 0);
			this.aClass37_17 = new Class37(this.method95(), local1416.anInt699, local1416.anInt700, anInt453);
			local1416.method404(0, 0);
			@Pc(1441) Class1_Sub1_Sub2_Sub2 local1441 = new Class1_Sub1_Sub2_Sub2(local295, "backvmid2", 0);
			this.aClass37_18 = new Class37(this.method95(), local1441.anInt699, local1441.anInt700, anInt453);
			local1441.method404(0, 0);
			@Pc(1466) Class1_Sub1_Sub2_Sub2 local1466 = new Class1_Sub1_Sub2_Sub2(local295, "backvmid3", 0);
			this.aClass37_19 = new Class37(this.method95(), local1466.anInt699, local1466.anInt700, anInt453);
			local1466.method404(0, 0);
			@Pc(1491) Class1_Sub1_Sub2_Sub2 local1491 = new Class1_Sub1_Sub2_Sub2(local295, "backhmid2", 0);
			this.aClass37_20 = new Class37(this.method95(), local1491.anInt699, local1491.anInt700, anInt453);
			local1491.method404(0, 0);
			@Pc(1516) int local1516 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1523) int local1523 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1530) int local1530 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1537) int local1537 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1539) int local1539 = 0; local1539 < 50; local1539++) {
				if (this.aClass1_Sub1_Sub2_Sub2Array5[local1539] != null) {
					this.aClass1_Sub1_Sub2_Sub2Array5[local1539].method402(local1523 + local1537, local1530 + local1537, local1516 + local1537);
				}
				if (this.aClass1_Sub1_Sub2_Sub3Array1[local1539] != null) {
					this.aClass1_Sub1_Sub2_Sub3Array1[local1539].method444(local1523 + local1537, local1530 + local1537, local1516 + local1537);
				}
			}
			this.method97("Unpacking textures", 83);
			Class1_Sub1_Sub2_Sub1.method375(local307);
			Class1_Sub1_Sub2_Sub1.method379(0.8D);
			Class1_Sub1_Sub2_Sub1.method374();
			this.method97("Unpacking config", 86);
			Class27.method516(local271, 680);
			Class9.method256(local271);
			Class21.method447(local271);
			Class15.method343(local271);
			Class13.method318(local271);
			Class23.method477(local271);
			Class32.method528(local271, 680);
			Class38.method541(local271, 680);
			Class35.method536(local271, 680);
			Class15.aBoolean146 = aBoolean56;
			if (!aBoolean57) {
				this.method97("Unpacking sounds", 90);
				@Pc(1642) byte[] local1642 = local331.method678("sounds.dat", null);
				@Pc(1648) Class1_Sub1_Sub3 local1648 = new Class1_Sub1_Sub3(45427, local1642);
				Class5.method79(local1648);
			}
			this.method97("Unpacking interfaces", 95);
			@Pc(1679) Class1_Sub1_Sub2_Sub4[] local1679 = new Class1_Sub1_Sub2_Sub4[] { this.aClass1_Sub1_Sub2_Sub4_1, this.aClass1_Sub1_Sub2_Sub4_2, this.aClass1_Sub1_Sub2_Sub4_3, this.aClass1_Sub1_Sub2_Sub4_4 };
			Class6.method230(local1679, local283, local295);
			this.method97("Preparing game engine", 100);
			@Pc(1695) int local1695;
			@Pc(1697) int local1697;
			@Pc(1699) int local1699;
			for (@Pc(1691) int local1691 = 0; local1691 < 33; local1691++) {
				local1695 = 999;
				local1697 = 0;
				for (local1699 = 0; local1699 < 34; local1699++) {
					if (this.aClass1_Sub1_Sub2_Sub3_19.aByteArray7[local1699 + local1691 * this.aClass1_Sub1_Sub2_Sub3_19.anInt734] == 0) {
						if (local1695 == 999) {
							local1695 = local1699;
						}
					} else if (local1695 != 999) {
						local1697 = local1699;
						break;
					}
				}
				this.anIntArray77[local1691] = local1695;
				this.anIntArray65[local1691] = local1697 - local1695;
			}
			@Pc(1757) int local1757;
			for (local1695 = 5; local1695 < 156; local1695++) {
				local1697 = 999;
				local1699 = 0;
				for (local1757 = 25; local1757 < 172; local1757++) {
					if (this.aClass1_Sub1_Sub2_Sub3_19.aByteArray7[local1757 + local1695 * this.aClass1_Sub1_Sub2_Sub3_19.anInt734] == 0 && (local1757 > 34 || local1695 > 34)) {
						if (local1697 == 999) {
							local1697 = local1757;
						}
					} else if (local1697 != 999) {
						local1699 = local1757;
						break;
					}
				}
				this.anIntArray51[local1695 - 5] = local1697 - 25;
				this.anIntArray86[local1695 - 5] = local1699 - local1697;
			}
			Class1_Sub1_Sub2_Sub1.method372(479, 96);
			this.anIntArray42 = Class1_Sub1_Sub2_Sub1.anIntArray185;
			Class1_Sub1_Sub2_Sub1.method372(190, 261);
			this.anIntArray43 = Class1_Sub1_Sub2_Sub1.anIntArray185;
			Class1_Sub1_Sub2_Sub1.method372(512, 334);
			this.anIntArray44 = Class1_Sub1_Sub2_Sub1.anIntArray185;
			@Pc(1841) int[] local1841 = new int[9];
			for (local1699 = 0; local1699 < 9; local1699++) {
				local1757 = local1699 * 32 + 128 + 15;
				@Pc(1859) int local1859 = local1757 * 3 + 600;
				@Pc(1863) int local1863 = Class1_Sub1_Sub2_Sub1.anIntArray183[local1757];
				local1841[local1699] = local1859 * local1863 >> 16;
			}
			Class39.method580(local1841);
			Class41.method603(local319);
			this.aClass11_1 = new Class11(false, this);
		} catch (@Pc(1893) Exception local1893) {
			signlink.reporterror("loaderror " + this.aString11 + " " + this.anInt314);
			this.aBoolean55 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method127() {
		try {
			Class9.aClass42_4.method643();
			Class9.aClass42_5.method643();
			Class13.aClass42_6.method643();
			Class15.aClass42_7.method643();
			Class15.aClass42_8.method643();
			Class1_Sub1_Sub1_Sub1_Sub2.aClass42_1.method643();
			Class32.aClass42_9.method643();
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("76827, " + -13523 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method128(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = 93 / arg0;
			if (this.anInt349 != 0) {
				@Pc(9) int local9 = 0;
				if (this.anInt293 != 0) {
					local9 = 1;
				}
				for (@Pc(16) int local16 = 0; local16 < 100; local16++) {
					if (this.aStringArray5[local16] != null) {
						@Pc(28) int local28 = this.anIntArray90[local16];
						@Pc(33) String local33 = this.aStringArray4[local16];
						if (local33 != null && local33.startsWith("@cr1@")) {
							local33 = local33.substring(5);
						}
						if (local33 != null && local33.startsWith("@cr2@")) {
							local33 = local33.substring(5);
						}
						if ((local28 == 3 || local28 == 7) && (local28 == 7 || this.anInt387 == 0 || this.anInt387 == 1 && this.method147(local33))) {
							@Pc(86) int local86 = 329 - local9 * 13;
							if (super.anInt240 > 4 && super.anInt241 - 4 > local86 - 10 && super.anInt241 - 4 <= local86 + 3) {
								@Pc(125) int local125 = this.aClass1_Sub1_Sub2_Sub4_2.method467((byte) 7, "From:  " + local33 + this.aStringArray5[local16]) + 25;
								if (local125 > 450) {
									local125 = 450;
								}
								if (super.anInt240 < local125 + 4) {
									if (this.anInt313 >= 1) {
										this.aStringArray1[this.anInt318] = "Report abuse @whi@" + local33;
										this.anIntArray60[this.anInt318] = 2034;
										this.anInt318++;
									}
									this.aStringArray1[this.anInt318] = "Add ignore @whi@" + local33;
									this.anIntArray60[this.anInt318] = 2436;
									this.anInt318++;
									this.aStringArray1[this.anInt318] = "Add friend @whi@" + local33;
									this.anIntArray60[this.anInt318] = 2406;
									this.anInt318++;
								}
							}
							local9++;
							if (local9 >= 5) {
								return;
							}
						}
						if ((local28 == 5 || local28 == 6) && this.anInt387 < 2) {
							local9++;
							if (local9 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(238) RuntimeException local238) {
			signlink.reporterror("32778, " + arg0 + ", " + local238.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIBII)V")
	private void method129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(8) int local8 = this.aClass39_1.method570(arg3, arg0, arg4);
			@Pc(18) int local18;
			@Pc(24) int local24;
			@Pc(28) int local28;
			@Pc(30) int local30;
			@Pc(52) int local52;
			@Pc(58) int local58;
			if (local8 != 0) {
				local18 = this.aClass39_1.method574(arg3, arg0, arg4, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = arg2;
				if (local8 > 0) {
					local30 = arg1;
				}
				@Pc(38) int[] local38 = this.aClass1_Sub1_Sub2_Sub2_1.anIntArray210;
				local52 = arg0 * 4 + (103 - arg4) * 512 * 4 + 24624;
				local58 = local8 >> 14 & 0x7FFF;
				@Pc(61) Class9 local61 = Class9.method258(local58);
				if (local61.anInt538 == -1) {
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
					@Pc(71) Class1_Sub1_Sub2_Sub3 local71 = this.aClass1_Sub1_Sub2_Sub3Array1[local61.anInt538];
					if (local71 != null) {
						@Pc(83) int local83 = (local61.anInt533 * 4 - local71.anInt734) / 2;
						@Pc(93) int local93 = (local61.anInt534 * 4 - local71.anInt735) / 2;
						local71.method445((104 - arg4 - local61.anInt534) * 4 + local93 + 48, this.anInt327, arg0 * 4 + local83 + 48);
					}
				}
			}
			local8 = this.aClass39_1.method572(arg3, arg0, arg4);
			if (local8 != 0) {
				local18 = this.aClass39_1.method574(arg3, arg0, arg4, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = local8 >> 14 & 0x7FFF;
				@Pc(448) Class9 local448 = Class9.method258(local30);
				@Pc(480) int local480;
				if (local448.anInt538 != -1) {
					@Pc(458) Class1_Sub1_Sub2_Sub3 local458 = this.aClass1_Sub1_Sub2_Sub3Array1[local448.anInt538];
					if (local458 != null) {
						local58 = (local448.anInt533 * 4 - local458.anInt734) / 2;
						local480 = (local448.anInt534 * 4 - local458.anInt735) / 2;
						local458.method445((104 - arg4 - local448.anInt534) * 4 + local480 + 48, this.anInt327, arg0 * 4 + local58 + 48);
					}
				} else if (local28 == 9) {
					local52 = 15658734;
					if (local8 > 0) {
						local52 = 15597568;
					}
					@Pc(518) int[] local518 = this.aClass1_Sub1_Sub2_Sub2_1.anIntArray210;
					local480 = arg0 * 4 + (103 - arg4) * 512 * 4 + 24624;
					if (local24 == 0 || local24 == 2) {
						local518[local480 + 1536] = local52;
						local518[local480 + 1024 + 1] = local52;
						local518[local480 + 512 + 2] = local52;
						local518[local480 + 3] = local52;
					} else {
						local518[local480] = local52;
						local518[local480 + 512 + 1] = local52;
						local518[local480 + 1024 + 2] = local52;
						local518[local480 + 1536 + 3] = local52;
					}
				}
			}
			local8 = this.aClass39_1.method573(arg3, arg0, arg4);
			if (local8 != 0) {
				local18 = local8 >> 14 & 0x7FFF;
				@Pc(617) Class9 local617 = Class9.method258(local18);
				if (local617.anInt538 != -1) {
					@Pc(627) Class1_Sub1_Sub2_Sub3 local627 = this.aClass1_Sub1_Sub2_Sub3Array1[local617.anInt538];
					if (local627 != null) {
						local30 = (local617.anInt533 * 4 - local627.anInt734) / 2;
						@Pc(649) int local649 = (local617.anInt534 * 4 - local627.anInt735) / 2;
						local627.method445((104 - arg4 - local617.anInt534) * 4 + local649 + 48, this.anInt327, arg0 * 4 + local30 + 48);
						return;
					}
				}
			}
		} catch (@Pc(674) RuntimeException local674) {
			signlink.reporterror("74658, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 6 + ", " + arg3 + ", " + arg4 + ", " + local674.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBZ)V")
	private void method130(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		try {
			signlink.anInt959 = arg0;
			if (arg1) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("63760, " + arg0 + ", " + 70 + ", " + arg1 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!mb;B)V")
	private void method131(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			arg1.method508(this.anInt414);
			@Pc(8) int local8 = arg1.method509(1);
			if (local8 != 0) {
				@Pc(20) int local20 = arg1.method509(2);
				if (local20 == 0) {
					this.anIntArray47[this.anInt323++] = this.anInt321;
				} else {
					@Pc(43) int local43;
					@Pc(53) int local53;
					if (local20 == 1) {
						local43 = arg1.method509(3);
						aClass1_Sub1_Sub1_Sub1_Sub2_1.method47(local43, false);
						local53 = arg1.method509(1);
						if (local53 == 1) {
							this.anIntArray47[this.anInt323++] = this.anInt321;
						}
					} else {
						@Pc(97) int local97;
						if (local20 == 2) {
							local43 = arg1.method509(3);
							aClass1_Sub1_Sub1_Sub1_Sub2_1.method47(local43, true);
							local53 = arg1.method509(3);
							aClass1_Sub1_Sub1_Sub1_Sub2_1.method47(local53, true);
							local97 = arg1.method509(1);
							if (local97 == 1) {
								this.anIntArray47[this.anInt323++] = this.anInt321;
							}
						} else if (local20 == 3) {
							this.anInt279 = arg1.method509(2);
							local43 = arg1.method509(7);
							local53 = arg1.method509(7);
							local97 = arg1.method509(1);
							aClass1_Sub1_Sub1_Sub1_Sub2_1.method46(local97 == 1, local53, local43);
							@Pc(153) int local153 = arg1.method509(1);
							if (local153 == 1) {
								this.anIntArray47[this.anInt323++] = this.anInt321;
							}
						}
					}
				}
			}
		} catch (@Pc(170) RuntimeException local170) {
			signlink.reporterror("94799, " + arg0 + ", " + arg1 + ", " + 110 + ", " + local170.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method94() {
		try {
			this.aBoolean84 = true;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("81284, " + false + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method132() {
		try {
			if (super.anInt245 == 1) {
				@Pc(16) int local16 = super.anInt246 - 25 - 550;
				@Pc(23) int local23 = super.anInt247 - 5 - 4;
				if (local16 >= 0 && local23 >= 0 && local16 < 146 && local23 < 151) {
					local16 -= 73;
					local23 -= 75;
					@Pc(43) int local43 = this.anInt340 + this.anInt374 & 0x7FF;
					@Pc(47) int local47 = Class1_Sub1_Sub2_Sub1.anIntArray183[local43];
					@Pc(51) int local51 = Class1_Sub1_Sub2_Sub1.anIntArray184[local43];
					@Pc(60) int local60 = local47 * (this.anInt354 + 256) >> 8;
					@Pc(69) int local69 = local51 * (this.anInt354 + 256) >> 8;
					@Pc(79) int local79 = local23 * local60 + local16 * local69 >> 11;
					@Pc(89) int local89 = local23 * local69 - local16 * local60 >> 11;
					@Pc(96) int local96 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt134 + local79 >> 7;
					@Pc(103) int local103 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt135 - local89 >> 7;
					@Pc(124) boolean local124 = this.method120(local96, (byte) 5, 0, true, 0, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], local103, 1, 0);
					if (local124) {
						this.aClass1_Sub1_Sub3_3.method488(local16);
						this.aClass1_Sub1_Sub3_3.method488(local23);
						this.aClass1_Sub1_Sub3_3.method489(this.anInt340);
						this.aClass1_Sub1_Sub3_3.method488(57);
						this.aClass1_Sub1_Sub3_3.method488(this.anInt374);
						this.aClass1_Sub1_Sub3_3.method488(this.anInt354);
						this.aClass1_Sub1_Sub3_3.method488(89);
						this.aClass1_Sub1_Sub3_3.method489(aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt134);
						this.aClass1_Sub1_Sub3_3.method489(aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt135);
						this.aClass1_Sub1_Sub3_3.method488(this.anInt300);
						this.aClass1_Sub1_Sub3_3.method488(63);
						return;
					}
				}
			}
		} catch (@Pc(178) RuntimeException local178) {
			signlink.reporterror("63512, " + 8 + ", " + local178.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/lang/String;IILjava/lang/String;)Lclient!yb;")
	private Class48 method133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5) {
		try {
			@Pc(3) byte[] local3 = null;
			@Pc(5) int local5 = 5;
			try {
				if (this.aClass46Array1[0] != null) {
					local3 = this.aClass46Array1[0].method670(arg0);
				}
			} catch (@Pc(20) Exception local20) {
			}
			@Pc(34) int local34;
			if (local3 != null) {
				this.aCRC32_1.reset();
				this.aCRC32_1.update(local3);
				local34 = (int) this.aCRC32_1.getValue();
				if (local34 != arg1) {
					local3 = null;
				}
			}
			if (local3 != null) {
				return new Class48(local3, (byte) -25);
			}
			local34 = 0;
			while (local3 == null) {
				@Pc(55) String local55 = "Unknown error";
				this.method97("Requesting " + arg5, arg3);
				@Pc(70) int local70;
				try {
					local70 = 0;
					@Pc(81) DataInputStream local81 = this.method117(arg2 + arg1);
					@Pc(84) byte[] local84 = new byte[6];
					local81.readFully(local84, 0, 6);
					@Pc(95) Class1_Sub1_Sub3 local95 = new Class1_Sub1_Sub3(45427, local84);
					local95.anInt796 = 3;
					@Pc(103) int local103 = local95.method502() + 6;
					@Pc(105) int local105 = 6;
					local3 = new byte[local103];
					for (@Pc(110) int local110 = 0; local110 < 6; local110++) {
						local3[local110] = local84[local110];
					}
					@Pc(128) int local128;
					while (local105 < local103) {
						local128 = local103 - local105;
						if (local128 > 1000) {
							local128 = 1000;
						}
						@Pc(139) int local139 = local81.read(local3, local105, local128);
						if (local139 < 0) {
							(new StringBuffer("Length error: ")).append(local105).append("/").append(local103).toString();
							throw new IOException("EOF");
						}
						local105 += local139;
						@Pc(168) int local168 = local105 * 100 / local103;
						if (local168 != local70) {
							this.method97("Loading " + arg5 + " - " + local168 + "%", arg3);
						}
						local70 = local168;
					}
					local81.close();
					try {
						if (this.aClass46Array1[0] != null) {
							this.aClass46Array1[0].method671(local3.length, arg0, local3);
						}
					} catch (@Pc(213) Exception local213) {
						this.aClass46Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_1.reset();
						this.aCRC32_1.update(local3);
						local128 = (int) this.aCRC32_1.getValue();
						if (local128 != arg1) {
							local3 = null;
							local34++;
							local55 = "Checksum error: " + local128;
						}
					}
				} catch (@Pc(248) IOException local248) {
					if (local55.equals("Unknown error")) {
						local55 = "Connection error";
					}
					local3 = null;
				} catch (@Pc(258) NullPointerException local258) {
					local55 = "Null error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(267) ArrayIndexOutOfBoundsException local267) {
					local55 = "Bounds error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(276) Exception local276) {
					local55 = "Unexpected error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local3 == null) {
					for (local70 = local5; local70 > 0; local70--) {
						if (local34 >= 3) {
							this.method97("Game updated - please reload page", arg3);
							local70 = 10;
						} else {
							this.method97(local55 + " - Retrying in " + local70, arg3);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(320) Exception local320) {
						}
					}
					local5 *= 2;
					if (local5 > 60) {
						local5 = 60;
					}
				}
			}
			@Pc(341) Class48 local341 = new Class48(local3, (byte) -25);
			if (arg4 != anInt299) {
				anInt453 = -426;
			}
			return local341;
		} catch (@Pc(349) RuntimeException local349) {
			signlink.reporterror("27438, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local349.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method134(@OriginalArg(0) boolean arg0) {
		try {
			if (this.anInt440 == 0 && this.anInt315 == 0) {
				this.aStringArray1[this.anInt318] = "Walk here";
				this.anIntArray60[this.anInt318] = 660;
				this.anIntArray58[this.anInt318] = super.anInt240;
				this.anIntArray59[this.anInt318] = super.anInt241;
				this.anInt318++;
			}
			@Pc(41) int local41 = -1;
			for (@Pc(43) int local43 = 0; local43 < Class1_Sub1_Sub1_Sub5.anInt576; local43++) {
				@Pc(49) int local49 = Class1_Sub1_Sub1_Sub5.anIntArray157[local43];
				@Pc(53) int local53 = local49 & 0x7F;
				@Pc(59) int local59 = local49 >> 7 & 0x7F;
				@Pc(65) int local65 = local49 >> 29 & 0x3;
				@Pc(71) int local71 = local49 >> 14 & 0x7FFF;
				if (local49 != local41) {
					local41 = local49;
					@Pc(209) int local209;
					if (local65 == 2 && this.aClass39_1.method574(this.anInt279, local53, local59, local49) >= 0) {
						@Pc(91) Class9 local91 = Class9.method258(local71);
						if (this.anInt440 == 1) {
							this.aStringArray1[this.anInt318] = "Use " + this.aString17 + " with @cya@" + local91.aString24;
							this.anIntArray60[this.anInt318] = 450;
							this.anIntArray61[this.anInt318] = local49;
							this.anIntArray58[this.anInt318] = local53;
							this.anIntArray59[this.anInt318] = local59;
							this.anInt318++;
						} else if (this.anInt315 != 1) {
							if (local91.aStringArray7 != null) {
								for (local209 = 4; local209 >= 0; local209--) {
									if (local91.aStringArray7[local209] != null) {
										this.aStringArray1[this.anInt318] = local91.aStringArray7[local209] + " @cya@" + local91.aString24;
										if (local209 == 0) {
											this.anIntArray60[this.anInt318] = 285;
										}
										if (local209 == 1) {
											this.anIntArray60[this.anInt318] = 504;
										}
										if (local209 == 2) {
											this.anIntArray60[this.anInt318] = 364;
										}
										if (local209 == 3) {
											this.anIntArray60[this.anInt318] = 581;
										}
										if (local209 == 4) {
											this.anIntArray60[this.anInt318] = 1501;
										}
										this.anIntArray61[this.anInt318] = local49;
										this.anIntArray58[this.anInt318] = local53;
										this.anIntArray59[this.anInt318] = local59;
										this.anInt318++;
									}
								}
							}
							this.aStringArray1[this.anInt318] = "Examine @cya@" + local91.aString24;
							this.anIntArray60[this.anInt318] = 1175;
							this.anIntArray61[this.anInt318] = local49;
							this.anIntArray58[this.anInt318] = local53;
							this.anIntArray59[this.anInt318] = local59;
							this.anInt318++;
						} else if ((this.anInt317 & 0x4) == 4) {
							this.aStringArray1[this.anInt318] = this.aString8 + " @cya@" + local91.aString24;
							this.anIntArray60[this.anInt318] = 55;
							this.anIntArray61[this.anInt318] = local49;
							this.anIntArray58[this.anInt318] = local53;
							this.anIntArray59[this.anInt318] = local59;
							this.anInt318++;
						}
					}
					@Pc(386) Class1_Sub1_Sub1_Sub1_Sub1 local386;
					if (local65 == 1) {
						@Pc(357) Class1_Sub1_Sub1_Sub1_Sub1 local357 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local71];
						if (local357.aClass13_1.aByte39 == 1 && (local357.anInt134 & 0x7F) == 64 && (local357.anInt135 & 0x7F) == 64) {
							for (local209 = 0; local209 < this.anInt385; local209++) {
								local386 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray62[local209]];
								if (local386 != null && local386 != local357 && local386.aClass13_1.aByte39 == 1 && local386.anInt134 == local357.anInt134 && local386.anInt135 == local357.anInt135) {
									this.method203(local386.aClass13_1, this.anIntArray62[local209], local53, local59);
								}
							}
						}
						this.method203(local357.aClass13_1, local71, local53, local59);
					}
					if (local65 == 0) {
						@Pc(437) Class1_Sub1_Sub1_Sub1_Sub2 local437 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local71];
						if ((local437.anInt134 & 0x7F) == 64 && (local437.anInt135 & 0x7F) == 64) {
							for (local209 = 0; local209 < this.anInt385; local209++) {
								local386 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray62[local209]];
								if (local386 != null && local386.aClass13_1.aByte39 == 1 && local386.anInt134 == local437.anInt134 && local386.anInt135 == local437.anInt135) {
									this.method203(local386.aClass13_1, this.anIntArray62[local209], local53, local59);
								}
							}
							for (@Pc(496) int local496 = 0; local496 < this.anInt322; local496++) {
								@Pc(506) Class1_Sub1_Sub1_Sub1_Sub2 local506 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray46[local496]];
								if (local506 != null && local506 != local437 && local506.anInt134 == local437.anInt134 && local506.anInt135 == local437.anInt135) {
									this.method107(local53, (byte) 3, this.anIntArray46[local496], local59, local506);
								}
							}
						}
						this.method107(local53, (byte) 3, local71, local59, local437);
					}
					if (local65 == 3) {
						@Pc(556) Class31 local556 = this.aClass31ArrayArrayArray1[this.anInt279][local53][local59];
						if (local556 != null) {
							for (@Pc(563) Class1_Sub1_Sub1_Sub3 local563 = (Class1_Sub1_Sub1_Sub3) local556.method524(); local563 != null; local563 = (Class1_Sub1_Sub1_Sub3) local556.method526()) {
								@Pc(569) Class15 local569 = Class15.method345(local563.anInt497);
								if (this.anInt440 == 1) {
									this.aStringArray1[this.anInt318] = "Use " + this.aString17 + " with @lre@" + local569.aString26;
									this.anIntArray60[this.anInt318] = 217;
									this.anIntArray61[this.anInt318] = local563.anInt497;
									this.anIntArray58[this.anInt318] = local53;
									this.anIntArray59[this.anInt318] = local59;
									this.anInt318++;
								} else if (this.anInt315 != 1) {
									for (@Pc(686) int local686 = 4; local686 >= 0; local686--) {
										if (local569.aStringArray9 != null && local569.aStringArray9[local686] != null) {
											this.aStringArray1[this.anInt318] = local569.aStringArray9[local686] + " @lre@" + local569.aString26;
											if (local686 == 0) {
												this.anIntArray60[this.anInt318] = 224;
											}
											if (local686 == 1) {
												this.anIntArray60[this.anInt318] = 993;
											}
											if (local686 == 2) {
												this.anIntArray60[this.anInt318] = 99;
											}
											if (local686 == 3) {
												this.anIntArray60[this.anInt318] = 746;
											}
											if (local686 == 4) {
												this.anIntArray60[this.anInt318] = 877;
											}
											this.anIntArray61[this.anInt318] = local563.anInt497;
											this.anIntArray58[this.anInt318] = local53;
											this.anIntArray59[this.anInt318] = local59;
											this.anInt318++;
										} else if (local686 == 2) {
											this.aStringArray1[this.anInt318] = "Take @lre@" + local569.aString26;
											this.anIntArray60[this.anInt318] = 99;
											this.anIntArray61[this.anInt318] = local563.anInt497;
											this.anIntArray58[this.anInt318] = local53;
											this.anIntArray59[this.anInt318] = local59;
											this.anInt318++;
										}
									}
									this.aStringArray1[this.anInt318] = "Examine @lre@" + local569.aString26;
									this.anIntArray60[this.anInt318] = 1102;
									this.anIntArray61[this.anInt318] = local563.anInt497;
									this.anIntArray58[this.anInt318] = local53;
									this.anIntArray59[this.anInt318] = local59;
									this.anInt318++;
								} else if ((this.anInt317 & 0x1) == 1) {
									this.aStringArray1[this.anInt318] = this.aString8 + " @lre@" + local569.aString26;
									this.anIntArray60[this.anInt318] = 965;
									this.anIntArray61[this.anInt318] = local563.anInt497;
									this.anIntArray58[this.anInt318] = local53;
									this.anIntArray59[this.anInt318] = local59;
									this.anInt318++;
								}
							}
						}
					}
				}
			}
			if (!arg0) {
				;
			}
		} catch (@Pc(895) RuntimeException local895) {
			signlink.reporterror("46438, " + arg0 + ", " + local895.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	private void method135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			@Pc(1) Class1_Sub2 local1 = null;
			@Pc(5) boolean local5 = false;
			for (@Pc(10) Class1_Sub2 local10 = (Class1_Sub2) this.aClass31_1.method523(); local10 != null; local10 = (Class1_Sub2) this.aClass31_1.method525()) {
				if (local10.anInt843 == arg0 && local10.anInt845 == arg7 && local10.anInt846 == arg2 && local10.anInt844 == arg6) {
					local1 = local10;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class1_Sub2();
				local1.anInt843 = arg0;
				local1.anInt844 = arg6;
				local1.anInt845 = arg7;
				local1.anInt846 = arg2;
				this.method170(local1);
				this.aClass31_1.method520(local1);
			}
			local1.anInt850 = arg8;
			local1.anInt852 = arg1;
			local1.anInt851 = arg5;
			local1.anInt853 = arg3;
			local1.anInt854 = arg4;
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("9661, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method136() {
		try {
			try {
				if (this.aClass8_1 != null) {
					this.aClass8_1.method244();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass8_1 = null;
			this.aBoolean70 = false;
			this.anInt400 = 0;
			this.aString5 = "";
			this.aString6 = "";
			Class10.method267();
			this.method127();
			this.aClass39_1.method544();
			for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
				this.aClass19Array1[local38].method414(this.anInt282);
			}
			System.gc();
			this.method226();
			this.anInt399 = -1;
			this.anInt343 = -1;
			this.anInt377 = 0;
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("81762, " + 35249 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean62) {
			this.method154();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BIZ)V")
	private void method137(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		try {
			if (arg1 != 17979) {
				this.anInt252 = -1;
			}
			signlink.anInt960 = arg2 ? 1 : 0;
			signlink.midisave(arg0, arg0.length);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("73506, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method138() {
		try {
			@Pc(6) int local6 = this.anInt429 * 128 + 64;
			@Pc(13) int local13 = this.anInt430 * 128 + 64;
			@Pc(24) int local24 = this.method168(this.anInt279, local6, local13, 54) - this.anInt431;
			if (this.anInt303 < local6) {
				this.anInt303 += this.anInt432 + (local6 - this.anInt303) * this.anInt433 / 1000;
				if (this.anInt303 > local6) {
					this.anInt303 = local6;
				}
			}
			if (this.anInt303 > local6) {
				this.anInt303 -= this.anInt432 + (this.anInt303 - local6) * this.anInt433 / 1000;
				if (this.anInt303 < local6) {
					this.anInt303 = local6;
				}
			}
			if (this.anInt304 < local24) {
				this.anInt304 += this.anInt432 + (local24 - this.anInt304) * this.anInt433 / 1000;
				if (this.anInt304 > local24) {
					this.anInt304 = local24;
				}
			}
			if (this.anInt304 > local24) {
				this.anInt304 -= this.anInt432 + (this.anInt304 - local24) * this.anInt433 / 1000;
				if (this.anInt304 < local24) {
					this.anInt304 = local24;
				}
			}
			if (this.anInt305 < local13) {
				this.anInt305 += this.anInt432 + (local13 - this.anInt305) * this.anInt433 / 1000;
				if (this.anInt305 > local13) {
					this.anInt305 = local13;
				}
			}
			if (this.anInt305 > local13) {
				this.anInt305 -= this.anInt432 + (this.anInt305 - local13) * this.anInt433 / 1000;
				if (this.anInt305 < local13) {
					this.anInt305 = local13;
				}
			}
			local6 = this.anInt259 * 128 + 64;
			local13 = this.anInt260 * 128 + 64;
			local24 = this.method168(this.anInt279, local6, local13, 54) - this.anInt261;
			@Pc(230) int local230 = local6 - this.anInt303;
			@Pc(235) int local235 = local24 - this.anInt304;
			@Pc(240) int local240 = local13 - this.anInt305;
			@Pc(251) int local251 = (int) Math.sqrt((double) (local230 * local230 + local240 * local240));
			@Pc(262) int local262 = (int) (Math.atan2((double) local235, (double) local251) * 325.949D) & 0x7FF;
			@Pc(273) int local273 = (int) (Math.atan2((double) local230, (double) local240) * -325.949D) & 0x7FF;
			if (local262 < 128) {
				local262 = 128;
			}
			if (local262 > 383) {
				local262 = 383;
			}
			if (this.anInt306 < local262) {
				this.anInt306 += this.anInt262 + (local262 - this.anInt306) * this.anInt263 / 1000;
				if (this.anInt306 > local262) {
					this.anInt306 = local262;
				}
			}
			if (this.anInt306 > local262) {
				this.anInt306 -= this.anInt262 + (this.anInt306 - local262) * this.anInt263 / 1000;
				if (this.anInt306 < local262) {
					this.anInt306 = local262;
				}
			}
			@Pc(344) int local344 = local273 - this.anInt307;
			if (local344 > 1024) {
				local344 -= 2048;
			}
			if (local344 < -1024) {
				local344 += 2048;
			}
			if (local344 > 0) {
				this.anInt307 += this.anInt262 + local344 * this.anInt263 / 1000;
				this.anInt307 &= 0x7FF;
			}
			if (local344 < 0) {
				this.anInt307 -= this.anInt262 + -local344 * this.anInt263 / 1000;
				this.anInt307 &= 0x7FF;
			}
			@Pc(402) int local402 = local273 - this.anInt307;
			if (local402 > 1024) {
				local402 -= 2048;
			}
			if (local402 < -1024) {
				local402 += 2048;
			}
			if (local402 < 0 && local344 > 0 || local402 > 0 && local344 < 0) {
				this.anInt307 = local273;
			}
		} catch (@Pc(423) RuntimeException local423) {
			signlink.reporterror("63842, " + 37 + ", " + local423.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method139() {
		try {
			this.aBoolean70 &= true;
			this.aClass37_24.method538();
			Class1_Sub1_Sub2_Sub1.anIntArray185 = this.anIntArray43;
			this.aClass1_Sub1_Sub2_Sub3_18.method445(0, this.anInt327, 0);
			if (this.anInt461 != -1) {
				this.method193(Class6.aClass6Array1[this.anInt461], 0, 0, 0);
			} else if (this.anIntArray87[this.anInt256] != -1) {
				this.method193(Class6.aClass6Array1[this.anIntArray87[this.anInt256]], 0, 0, 0);
			}
			if (this.aBoolean83 && this.anInt420 == 1) {
				this.method116();
			}
			this.aClass37_24.method539(553, super.aGraphics2, 205, this.anInt455);
			this.aClass37_26.method538();
			Class1_Sub1_Sub2_Sub1.anIntArray185 = this.anIntArray44;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("55964, " + true + ", " + local83.toString());
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!mb;Z)V")
	private void method140(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			for (@Pc(11) int local11 = 0; local11 < this.anInt323; local11++) {
				@Pc(18) int local18 = this.anIntArray47[local11];
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub2 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local18];
				@Pc(26) int local26 = arg1.method498();
				if ((local26 & 0x80) == 128) {
					local26 += arg1.method498() << 8;
				}
				this.method199(local18, local23, (byte) 7, arg1, local26);
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("25830, " + arg0 + ", " + arg1 + ", " + true + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method141() {
		try {
			this.anInt251 += 0;
			@Pc(14) int local14;
			if (this.anInt403 > 0) {
				for (local14 = 0; local14 < 256; local14++) {
					if (this.anInt403 > 768) {
						this.anIntArray92[local14] = this.method148(this.anIntArray94[local14], this.anIntArray93[local14], 1024 - this.anInt403);
					} else if (this.anInt403 > 256) {
						this.anIntArray92[local14] = this.anIntArray94[local14];
					} else {
						this.anIntArray92[local14] = this.method148(this.anIntArray93[local14], this.anIntArray94[local14], 256 - this.anInt403);
					}
				}
			} else if (this.anInt404 > 0) {
				for (local14 = 0; local14 < 256; local14++) {
					if (this.anInt404 > 768) {
						this.anIntArray92[local14] = this.method148(this.anIntArray95[local14], this.anIntArray93[local14], 1024 - this.anInt404);
					} else if (this.anInt404 > 256) {
						this.anIntArray92[local14] = this.anIntArray95[local14];
					} else {
						this.anIntArray92[local14] = this.method148(this.anIntArray93[local14], this.anIntArray95[local14], 256 - this.anInt404);
					}
				}
			} else {
				for (local14 = 0; local14 < 256; local14++) {
					this.anIntArray92[local14] = this.anIntArray93[local14];
				}
			}
			for (local14 = 0; local14 < 33920; local14++) {
				this.aClass37_6.anIntArray233[local14] = this.aClass1_Sub1_Sub2_Sub2_7.anIntArray210[local14];
			}
			@Pc(187) int local187 = 0;
			@Pc(189) int local189 = 1152;
			@Pc(204) int local204;
			@Pc(208) int local208;
			@Pc(218) int local218;
			@Pc(226) int local226;
			@Pc(230) int local230;
			@Pc(234) int local234;
			@Pc(245) int local245;
			for (@Pc(191) int local191 = 1; local191 < 255; local191++) {
				local204 = this.anIntArray50[local191] * (256 - local191) / 256;
				local208 = local204 + 22;
				if (local208 < 0) {
					local208 = 0;
				}
				local187 += local208;
				for (local218 = local208; local218 < 128; local218++) {
					local226 = this.anIntArray34[local187++];
					if (local226 == 0) {
						local189++;
					} else {
						local230 = local226;
						local234 = 256 - local226;
						local226 = this.anIntArray92[local226];
						local245 = this.aClass37_6.anIntArray233[local189];
						this.aClass37_6.anIntArray233[local189++] = ((local226 & 0xFF00FF) * local230 + (local245 & 0xFF00FF) * local234 & 0xFF00FF00) + ((local226 & 0xFF00) * local230 + (local245 & 0xFF00) * local234 & 0xFF0000) >> 8;
					}
				}
				local189 += local208;
			}
			this.aClass37_6.method539(0, super.aGraphics2, 0, this.anInt455);
			for (local204 = 0; local204 < 33920; local204++) {
				this.aClass37_7.anIntArray233[local204] = this.aClass1_Sub1_Sub2_Sub2_8.anIntArray210[local204];
			}
			local187 = 0;
			local189 = 1176;
			for (local208 = 1; local208 < 255; local208++) {
				local218 = this.anIntArray50[local208] * (256 - local208) / 256;
				local226 = 103 - local218;
				local189 += local218;
				for (local230 = 0; local230 < local226; local230++) {
					local234 = this.anIntArray34[local187++];
					if (local234 == 0) {
						local189++;
					} else {
						local245 = local234;
						@Pc(369) int local369 = 256 - local234;
						local234 = this.anIntArray92[local234];
						@Pc(380) int local380 = this.aClass37_7.anIntArray233[local189];
						this.aClass37_7.anIntArray233[local189++] = ((local234 & 0xFF00FF) * local245 + (local380 & 0xFF00FF) * local369 & 0xFF00FF00) + ((local234 & 0xFF00) * local245 + (local380 & 0xFF00) * local369 & 0xFF0000) >> 8;
					}
				}
				local187 += 128 - local226;
				local189 += 128 - local226 - local218;
			}
			this.aClass37_7.method539(637, super.aGraphics2, 0, this.anInt455);
		} catch (@Pc(453) RuntimeException local453) {
			signlink.reporterror("15989, " + 0 + ", " + local453.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!z;)V")
	private void method142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub1_Sub1 arg2) {
		try {
			this.method143(arg0, arg2.anInt134, arg2.anInt135);
			if (arg1 <= 0) {
				this.anInt282 = -59;
			}
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("23787, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V")
	private void method143(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg1 >= 128 && arg2 >= 128 && arg1 <= 13056 && arg2 <= 13056) {
				@Pc(34) int local34 = this.method168(this.anInt279, arg1, arg2, 54) - arg0;
				@Pc(39) int local39 = arg1 - this.anInt303;
				@Pc(44) int local44 = local34 - this.anInt304;
				@Pc(49) int local49 = arg2 - this.anInt305;
				@Pc(54) int local54 = Class1_Sub1_Sub1_Sub5.anIntArray158[this.anInt306];
				@Pc(59) int local59 = Class1_Sub1_Sub1_Sub5.anIntArray159[this.anInt306];
				@Pc(64) int local64 = Class1_Sub1_Sub1_Sub5.anIntArray158[this.anInt307];
				@Pc(69) int local69 = Class1_Sub1_Sub1_Sub5.anIntArray159[this.anInt307];
				@Pc(79) int local79 = local49 * local64 + local39 * local69 >> 16;
				@Pc(89) int local89 = local49 * local69 - local39 * local64 >> 16;
				@Pc(91) int local91 = local79;
				@Pc(101) int local101 = local44 * local59 - local89 * local54 >> 16;
				@Pc(111) int local111 = local44 * local54 + local89 * local59 >> 16;
				if (local111 >= 50) {
					this.anInt290 = Class1_Sub1_Sub2_Sub1.anInt674 + (local91 << 9) / local111;
					this.anInt291 = Class1_Sub1_Sub2_Sub1.anInt675 + (local101 << 9) / local111;
				} else {
					this.anInt290 = -1;
					this.anInt291 = -1;
				}
			} else {
				this.anInt290 = -1;
				this.anInt291 = -1;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("61545, " + arg0 + ", " + 29445 + ", " + arg1 + ", " + arg2 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBIIIII)V")
	private void method144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg6 >= 1 && arg2 >= 1 && arg6 <= 102 && arg2 <= 102) {
				if (aBoolean57 && arg3 != this.anInt279) {
					return;
				}
				@Pc(26) int local26 = 0;
				if (arg5 == 0) {
					local26 = this.aClass39_1.method570(arg3, arg6, arg2);
				}
				if (arg5 == 1) {
					local26 = this.aClass39_1.method571(arg2, (byte) 6, arg3, arg6);
				}
				if (arg5 == 2) {
					local26 = this.aClass39_1.method572(arg3, arg6, arg2);
				}
				if (arg5 == 3) {
					local26 = this.aClass39_1.method573(arg3, arg6, arg2);
				}
				@Pc(82) int local82;
				if (local26 != 0) {
					local82 = this.aClass39_1.method574(arg3, arg6, arg2, local26);
					@Pc(88) int local88 = local26 >> 14 & 0x7FFF;
					@Pc(92) int local92 = local82 & 0x1F;
					@Pc(96) int local96 = local82 >> 6;
					@Pc(108) Class9 local108;
					if (arg5 == 0) {
						this.aClass39_1.method561(940, arg2, arg6, arg3);
						local108 = Class9.method258(local88);
						if (local108.aBoolean114) {
							this.aClass19Array1[arg3].method419(arg6, arg2, local96, local108.aBoolean115, local92);
						}
					}
					if (arg5 == 1) {
						this.aClass39_1.method562(arg2, arg6, arg3);
					}
					if (arg5 == 2) {
						this.aClass39_1.method563(arg2, arg6, arg3);
						local108 = Class9.method258(local88);
						if (arg6 + local108.anInt533 > 103 || arg2 + local108.anInt533 > 103 || arg6 + local108.anInt534 > 103 || arg2 + local108.anInt534 > 103) {
							return;
						}
						if (local108.aBoolean114) {
							this.aClass19Array1[arg3].method420(local108.anInt533, local108.aBoolean115, arg6, 591, arg2, local96, local108.anInt534);
						}
					}
					if (arg5 == 3) {
						this.aClass39_1.method564(arg2, arg3, arg6);
						local108 = Class9.method258(local88);
						if (local108.aBoolean114 && local108.aBoolean116) {
							this.aClass19Array1[arg3].method422(arg2, arg6, this.aByte18);
						}
					}
				}
				if (arg0 >= 0) {
					local82 = arg3;
					if (arg3 < 3 && (this.aByteArrayArrayArray7[1][arg6][arg2] & 0x2) == 2) {
						local82 = arg3 + 1;
					}
					Class4.method74(this.aClass19Array1[arg3], this.aClass39_1, arg3, arg2, arg6, local82, this.anIntArrayArrayArray3, arg0, arg1, arg4);
					return;
				}
			}
		} catch (@Pc(256) RuntimeException local256) {
			signlink.reporterror("75801, " + arg0 + ", " + arg1 + ", " + 5 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local256.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;I)V")
	@Override
	protected void method97(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt314 = arg1;
			this.aString11 = arg0;
			this.method99();
			if (this.aClass48_1 == null) {
				super.method97(arg0, arg1);
			} else {
				this.aClass37_5.method538();
				this.aClass1_Sub1_Sub2_Sub4_3.method465(16777215, "RuneScape is loading - please wait...", 673, 54, 180);
				Class1_Sub1_Sub2.method459(9179409, 62, 304, 34, 28);
				Class1_Sub1_Sub2.method459(0, 63, 302, 32, 29);
				Class1_Sub1_Sub2.method458(64, 30, 9179409, arg1 * 3, 30);
				Class1_Sub1_Sub2.method458(64, arg1 * 3 + 30, 0, 300 - arg1 * 3, 30);
				this.aClass1_Sub1_Sub2_Sub4_3.method465(16777215, arg0, 673, 85, 180);
				this.aClass37_5.method539(202, super.aGraphics2, 171, this.anInt455);
				if (this.aBoolean84) {
					this.aBoolean84 = false;
					if (!this.aBoolean46) {
						this.aClass37_6.method539(0, super.aGraphics2, 0, this.anInt455);
						this.aClass37_7.method539(637, super.aGraphics2, 0, this.anInt455);
					}
					this.aClass37_3.method539(128, super.aGraphics2, 0, this.anInt455);
					this.aClass37_4.method539(202, super.aGraphics2, 371, this.anInt455);
					this.aClass37_8.method539(0, super.aGraphics2, 265, this.anInt455);
					this.aClass37_9.method539(562, super.aGraphics2, 265, this.anInt455);
					this.aClass37_10.method539(128, super.aGraphics2, 171, this.anInt455);
					this.aClass37_11.method539(562, super.aGraphics2, 171, this.anInt455);
				}
			}
		} catch (@Pc(223) RuntimeException local223) {
			signlink.reporterror("22642, " + 8 + ", " + arg0 + ", " + arg1 + ", " + local223.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method93() {
		try {
			if (this.aBoolean79 || this.aBoolean55 || this.aBoolean88) {
				this.method115();
			} else {
				anInt382++;
				if (this.aBoolean70) {
					this.method166();
				} else {
					this.method212(false);
				}
				this.anInt292 = 0;
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("11260, " + 0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method145() {
		try {
			if (this.anInt365 == 0) {
				this.aStringArray1[0] = "Cancel";
				this.anIntArray60[0] = 1252;
				this.anInt318 = 1;
				this.method128(this.anInt372);
				this.anInt295 = 0;
				if (super.anInt240 > 4 && super.anInt241 > 4 && super.anInt240 < 516 && super.anInt241 < 338) {
					if (this.anInt379 == -1) {
						this.method134(this.aBoolean61);
					} else {
						this.method183(0, super.anInt241, 4, 4, super.anInt240, Class6.aClass6Array1[this.anInt379]);
					}
				}
				if (this.anInt295 != this.anInt284) {
					this.anInt284 = this.anInt295;
				}
				this.anInt295 = 0;
				if (super.anInt240 > 553 && super.anInt241 > 205 && super.anInt240 < 743 && super.anInt241 < 466) {
					if (this.anInt461 != -1) {
						this.method183(0, super.anInt241, 553, 205, super.anInt240, Class6.aClass6Array1[this.anInt461]);
					} else if (this.anIntArray87[this.anInt256] != -1) {
						this.method183(0, super.anInt241, 553, 205, super.anInt240, Class6.aClass6Array1[this.anIntArray87[this.anInt256]]);
					}
				}
				if (this.anInt295 != this.anInt281) {
					this.aBoolean45 = true;
					this.anInt281 = this.anInt295;
				}
				this.anInt295 = 0;
				if (super.anInt240 > 17 && super.anInt241 > 357 && super.anInt240 < 496 && super.anInt241 < 453) {
					if (this.anInt312 != -1) {
						this.method183(0, super.anInt241, 17, 357, super.anInt240, Class6.aClass6Array1[this.anInt312]);
					} else if (super.anInt241 < 434 && super.anInt240 < 426) {
						this.method219(super.anInt240 - 17, super.anInt241 - 357);
					}
				}
				if (this.anInt312 != -1 && this.anInt295 != this.anInt410) {
					this.aBoolean65 = true;
					this.anInt410 = this.anInt295;
				}
				@Pc(232) boolean local232 = false;
				while (!local232) {
					local232 = true;
					for (@Pc(238) int local238 = 0; local238 < this.anInt318 - 1; local238++) {
						if (this.anIntArray60[local238] < 1000 && this.anIntArray60[local238 + 1] > 1000) {
							@Pc(259) String local259 = this.aStringArray1[local238];
							this.aStringArray1[local238] = this.aStringArray1[local238 + 1];
							this.aStringArray1[local238 + 1] = local259;
							@Pc(281) int local281 = this.anIntArray60[local238];
							this.anIntArray60[local238] = this.anIntArray60[local238 + 1];
							this.anIntArray60[local238 + 1] = local281;
							@Pc(303) int local303 = this.anIntArray58[local238];
							this.anIntArray58[local238] = this.anIntArray58[local238 + 1];
							this.anIntArray58[local238 + 1] = local303;
							@Pc(325) int local325 = this.anIntArray59[local238];
							this.anIntArray59[local238] = this.anIntArray59[local238 + 1];
							this.anIntArray59[local238 + 1] = local325;
							@Pc(347) int local347 = this.anIntArray61[local238];
							this.anIntArray61[local238] = this.anIntArray61[local238 + 1];
							this.anIntArray61[local238 + 1] = local347;
							local232 = false;
						}
					}
				}
			}
		} catch (@Pc(377) RuntimeException local377) {
			signlink.reporterror("45845, " + false + ", " + local377.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method146(@OriginalArg(0) int arg0) {
		try {
			if (this.aClass37_27 == null) {
				this.method109();
				super.aClass37_2 = null;
				this.aClass37_3 = null;
				this.aClass37_4 = null;
				this.aClass37_5 = null;
				this.aClass37_6 = null;
				if (arg0 >= 0) {
					this.anInt252 = this.aClass1_Sub1_Sub3_4.method498();
				}
				this.aClass37_7 = null;
				this.aClass37_8 = null;
				this.aClass37_9 = null;
				this.aClass37_10 = null;
				this.aClass37_11 = null;
				this.aClass37_27 = new Class37(this.method95(), 479, 96, anInt453);
				this.aClass37_25 = new Class37(this.method95(), 172, 156, anInt453);
				Class1_Sub1_Sub2.method456();
				this.aClass1_Sub1_Sub2_Sub3_19.method445(0, this.anInt327, 0);
				this.aClass37_24 = new Class37(this.method95(), 190, 261, anInt453);
				this.aClass37_26 = new Class37(this.method95(), 512, 334, anInt453);
				Class1_Sub1_Sub2.method456();
				this.aClass37_21 = new Class37(this.method95(), 496, 50, anInt453);
				this.aClass37_22 = new Class37(this.method95(), 269, 37, anInt453);
				this.aClass37_23 = new Class37(this.method95(), 249, 45, anInt453);
				this.aBoolean84 = true;
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("86818, " + arg0 + ", " + local136.toString());
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
				return new URL("http://127.0.0.1:" + (anInt329 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	private boolean method147(@OriginalArg(0) String arg0) {
		try {
			this.anInt251 += 0;
			if (arg0 == null) {
				return false;
			}
			for (@Pc(11) int local11 = 0; local11 < this.anInt445; local11++) {
				if (arg0.equalsIgnoreCase(this.aStringArray2[local11])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("77908, " + arg0 + ", " + 0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZI)I")
	private int method148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = 256 - arg2;
			return ((arg1 & 0xFF00FF) * local3 + (arg0 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg1 & 0xFF00) * local3 + (arg0 & 0xFF00) * arg2 & 0xFF0000) >> 8;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("85659, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLclient!mb;)V")
	private void method149(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt797 + 21 < arg0 * 8) {
					@Pc(22) int local22 = arg1.method509(14);
					if (local22 != 16383) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local22] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local22] = new Class1_Sub1_Sub1_Sub1_Sub1();
						}
						@Pc(42) Class1_Sub1_Sub1_Sub1_Sub1 local42 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local22];
						this.anIntArray62[this.anInt385++] = local22;
						local42.anInt174 = anInt268;
						local42.aClass13_1 = Class13.method320(arg1.method509(11));
						local42.anInt137 = local42.aClass13_1.aByte39;
						local42.anInt140 = local42.aClass13_1.anInt594;
						local42.anInt141 = local42.aClass13_1.anInt595;
						local42.anInt142 = local42.aClass13_1.anInt596;
						local42.anInt143 = local42.aClass13_1.anInt597;
						local42.anInt138 = local42.aClass13_1.anInt593;
						@Pc(98) int local98 = arg1.method509(5);
						if (local98 > 15) {
							local98 -= 32;
						}
						@Pc(107) int local107 = arg1.method509(5);
						if (local107 > 15) {
							local107 -= 32;
						}
						local42.method46(false, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0] + local107, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0] + local98);
						@Pc(132) int local132 = arg1.method509(1);
						if (local132 == 1) {
							this.anIntArray47[this.anInt323++] = local22;
						}
						continue;
					}
				}
				arg1.method510();
				return;
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("82604, " + arg0 + ", " + true + ", " + arg1 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method150() {
		try {
			while (true) {
				@Pc(16) int local16 = this.method89();
				if (local16 == -1) {
					return;
				}
				if (this.anInt379 != -1 && this.anInt379 == this.anInt416) {
					if (local16 == 8 && this.aString18.length() > 0) {
						this.aString18 = this.aString18.substring(0, this.aString18.length() - 1);
					}
					if ((local16 >= 97 && local16 <= 122 || local16 >= 65 && local16 <= 90 || local16 >= 48 && local16 <= 57 || local16 == 32) && this.aString18.length() < 12) {
						this.aString18 = this.aString18 + (char) local16;
					}
				} else {
					@Pc(197) int local197;
					if (this.aBoolean69) {
						if (local16 >= 32 && local16 <= 122 && this.aString14.length() < 80) {
							this.aString14 = this.aString14 + (char) local16;
							this.aBoolean65 = true;
						}
						if (local16 == 8 && this.aString14.length() > 0) {
							this.aString14 = this.aString14.substring(0, this.aString14.length() - 1);
							this.aBoolean65 = true;
						}
						if (local16 == 13 || local16 == 10) {
							this.aBoolean69 = false;
							this.aBoolean65 = true;
							@Pc(156) long local156;
							if (this.anInt338 == 1) {
								local156 = Class49.method679(this.aString14);
								this.method124(local156);
							}
							if (this.anInt338 == 2 && this.anInt445 > 0) {
								local156 = Class49.method679(this.aString14);
								this.method169(local156);
							}
							if (this.anInt338 == 3 && this.aString14.length() > 0) {
								this.aClass1_Sub1_Sub3_3.method487(217, this.anInt378);
								this.aClass1_Sub1_Sub3_3.method488(0);
								local197 = this.aClass1_Sub1_Sub3_3.anInt796;
								this.aClass1_Sub1_Sub3_3.method494(this.aLong15);
								Class2.method41(this.aString14, this.aClass1_Sub1_Sub3_3);
								this.aClass1_Sub1_Sub3_3.method497(this.aClass1_Sub1_Sub3_3.anInt796 - local197, this.anInt324);
								this.aString14 = Class49.method684(this.aString14);
								this.aString14 = Class41.method613(this.aString14);
								this.method121(6, this.aString14, Class49.method683(Class49.method680(this.aLong15)));
								if (this.anInt387 == 2) {
									this.anInt387 = 1;
									this.aBoolean85 = true;
									this.aClass1_Sub1_Sub3_3.method487(94, this.anInt378);
									this.aClass1_Sub1_Sub3_3.method488(this.anInt358);
									this.aClass1_Sub1_Sub3_3.method488(this.anInt387);
									this.aClass1_Sub1_Sub3_3.method488(this.anInt427);
								}
							}
							if (this.anInt338 == 4 && this.anInt428 < 100) {
								local156 = Class49.method679(this.aString14);
								this.method157(local156);
							}
							if (this.anInt338 == 5 && this.anInt428 > 0) {
								local156 = Class49.method679(this.aString14);
								this.method179(local156);
							}
						}
					} else if (this.aBoolean51) {
						if (local16 >= 48 && local16 <= 57 && this.aString15.length() < 10) {
							this.aString15 = this.aString15 + (char) local16;
							this.aBoolean65 = true;
						}
						if (local16 == 8 && this.aString15.length() > 0) {
							this.aString15 = this.aString15.substring(0, this.aString15.length() - 1);
							this.aBoolean65 = true;
						}
						if (local16 == 13 || local16 == 10) {
							if (this.aString15.length() > 0) {
								local197 = 0;
								try {
									local197 = Integer.parseInt(this.aString15);
								} catch (@Pc(375) Exception local375) {
								}
								this.aClass1_Sub1_Sub3_3.method487(19, this.anInt378);
								this.aClass1_Sub1_Sub3_3.method492(local197);
							}
							this.aBoolean51 = false;
							this.aBoolean65 = true;
						}
					} else if (this.anInt312 == -1) {
						if (local16 >= 32 && local16 <= 122 && this.aString16.length() < 80) {
							this.aString16 = this.aString16 + (char) local16;
							this.aBoolean65 = true;
						}
						if (local16 == 8 && this.aString16.length() > 0) {
							this.aString16 = this.aString16.substring(0, this.aString16.length() - 1);
							this.aBoolean65 = true;
						}
						if ((local16 == 13 || local16 == 10) && this.aString16.length() > 0) {
							if (this.anInt313 == 2) {
								if (this.aString16.equals("::clientdrop")) {
									this.method223();
								}
								if (this.aString16.equals("::lag")) {
									this.method216();
								}
								if (this.aString16.equals("::prefetchmusic")) {
									for (local197 = 0; local197 < this.aClass45_Sub1_1.method650((byte) 6, 2); local197++) {
										this.aClass45_Sub1_1.method660((byte) 1, local197, 2);
									}
								}
							}
							if (this.aString16.startsWith("::")) {
								this.aClass1_Sub1_Sub3_3.method487(92, this.anInt378);
								this.aClass1_Sub1_Sub3_3.method488(this.aString16.length() - 1);
								this.aClass1_Sub1_Sub3_3.method495(this.aString16.substring(2));
							} else {
								@Pc(528) byte local528 = 0;
								if (this.aString16.startsWith("yellow:")) {
									local528 = 0;
									this.aString16 = this.aString16.substring(7);
								}
								if (this.aString16.startsWith("red:")) {
									local528 = 1;
									this.aString16 = this.aString16.substring(4);
								}
								if (this.aString16.startsWith("green:")) {
									local528 = 2;
									this.aString16 = this.aString16.substring(6);
								}
								if (this.aString16.startsWith("cyan:")) {
									local528 = 3;
									this.aString16 = this.aString16.substring(5);
								}
								if (this.aString16.startsWith("purple:")) {
									local528 = 4;
									this.aString16 = this.aString16.substring(7);
								}
								if (this.aString16.startsWith("white:")) {
									local528 = 5;
									this.aString16 = this.aString16.substring(6);
								}
								if (this.aString16.startsWith("flash1:")) {
									local528 = 6;
									this.aString16 = this.aString16.substring(7);
								}
								if (this.aString16.startsWith("flash2:")) {
									local528 = 7;
									this.aString16 = this.aString16.substring(7);
								}
								if (this.aString16.startsWith("flash3:")) {
									local528 = 8;
									this.aString16 = this.aString16.substring(7);
								}
								if (this.aString16.startsWith("glow1:")) {
									local528 = 9;
									this.aString16 = this.aString16.substring(6);
								}
								if (this.aString16.startsWith("glow2:")) {
									local528 = 10;
									this.aString16 = this.aString16.substring(6);
								}
								if (this.aString16.startsWith("glow3:")) {
									local528 = 11;
									this.aString16 = this.aString16.substring(6);
								}
								@Pc(686) byte local686 = 0;
								if (this.aString16.startsWith("wave:")) {
									local686 = 1;
									this.aString16 = this.aString16.substring(5);
								}
								if (this.aString16.startsWith("scroll:")) {
									local686 = 2;
									this.aString16 = this.aString16.substring(7);
								}
								this.aClass1_Sub1_Sub3_3.method487(87, this.anInt378);
								this.aClass1_Sub1_Sub3_3.method488(0);
								@Pc(726) int local726 = this.aClass1_Sub1_Sub3_3.anInt796;
								this.aClass1_Sub1_Sub3_3.method488(local528);
								this.aClass1_Sub1_Sub3_3.method488(local686);
								Class2.method41(this.aString16, this.aClass1_Sub1_Sub3_3);
								this.aClass1_Sub1_Sub3_3.method497(this.aClass1_Sub1_Sub3_3.anInt796 - local726, this.anInt324);
								this.aString16 = Class49.method684(this.aString16);
								this.aString16 = Class41.method613(this.aString16);
								aClass1_Sub1_Sub1_Sub1_Sub2_1.aString3 = this.aString16;
								aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt146 = local528;
								aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt147 = local686;
								aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt145 = 150;
								if (this.anInt313 == 2) {
									this.method121(2, aClass1_Sub1_Sub1_Sub1_Sub2_1.aString3, "@cr2@" + aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4);
								} else if (this.anInt313 == 1) {
									this.method121(2, aClass1_Sub1_Sub1_Sub1_Sub2_1.aString3, "@cr1@" + aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4);
								} else {
									this.method121(2, aClass1_Sub1_Sub1_Sub1_Sub2_1.aString3, aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4);
								}
								if (this.anInt358 == 2) {
									this.anInt358 = 3;
									this.aBoolean85 = true;
									this.aClass1_Sub1_Sub3_3.method487(94, this.anInt378);
									this.aClass1_Sub1_Sub3_3.method488(this.anInt358);
									this.aClass1_Sub1_Sub3_3.method488(this.anInt387);
									this.aClass1_Sub1_Sub3_3.method488(this.anInt427);
								}
							}
							this.aString16 = "";
							this.aBoolean65 = true;
						}
					}
				}
			}
		} catch (@Pc(864) RuntimeException local864) {
			signlink.reporterror("53797, " + -5 + ", " + local864.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method151() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt322; local3++) {
				if (local3 == -1) {
					local11 = this.anInt321;
				} else {
					local11 = this.anIntArray46[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub2 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local11];
				if (local23 != null && local23.anInt145 > 0) {
					local23.anInt145--;
					if (local23.anInt145 == 0) {
						local23.aString3 = null;
					}
				}
			}
			for (local11 = 0; local11 < this.anInt385; local11++) {
				@Pc(54) int local54 = this.anIntArray62[local11];
				@Pc(59) Class1_Sub1_Sub1_Sub1_Sub1 local59 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local54];
				if (local59 != null && local59.anInt145 > 0) {
					local59.anInt145--;
					if (local59.anInt145 == 0) {
						local59.aString3 = null;
					}
				}
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("98574, " + 6 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!d;B)I")
	private int method152(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(6) boolean local6 = false;
			if (arg1.anIntArrayArray6 == null || arg0 >= arg1.anIntArrayArray6.length) {
				return -2;
			}
			try {
				@Pc(30) int[] local30 = arg1.anIntArrayArray6[arg0];
				@Pc(32) int local32 = 0;
				@Pc(34) int local34 = 0;
				while (true) {
					@Pc(39) int local39 = local30[local34++];
					if (local39 == 0) {
						return local32;
					}
					if (local39 == 1) {
						local32 += this.anIntArray45[local30[local34++]];
					}
					if (local39 == 2) {
						local32 += this.anIntArray36[local30[local34++]];
					}
					if (local39 == 3) {
						local32 += this.anIntArray64[local30[local34++]];
					}
					@Pc(92) Class6 local92;
					@Pc(97) int local97;
					@Pc(110) int local110;
					if (local39 == 4) {
						local92 = Class6.aClass6Array1[local30[local34++]];
						local97 = local30[local34++];
						if (local97 >= 0 && local97 < Class15.anInt625 && (!Class15.method345(local97).aBoolean148 || aBoolean56)) {
							for (local110 = 0; local110 < local92.anIntArray96.length; local110++) {
								if (local92.anIntArray96[local110] == local97 + 1) {
									local32 += local92.anIntArray97[local110];
								}
							}
						}
					}
					if (local39 == 5) {
						local32 += this.anIntArray38[local30[local34++]];
					}
					if (local39 == 6) {
						local32 += anIntArray78[this.anIntArray36[local30[local34++]] - 1];
					}
					if (local39 == 7) {
						local32 += this.anIntArray38[local30[local34++]] * 100 / 46875;
					}
					if (local39 == 8) {
						local32 += aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt183;
					}
					@Pc(193) int local193;
					if (local39 == 9) {
						for (local193 = 0; local193 < Class29.anInt855; local193++) {
							if (Class29.aBooleanArray9[local193]) {
								local32 += this.anIntArray36[local193];
							}
						}
					}
					if (local39 == 10) {
						local92 = Class6.aClass6Array1[local30[local34++]];
						local97 = local30[local34++] + 1;
						if (local97 >= 0 && local97 < Class15.anInt625 && (!Class15.method345(local97).aBoolean148 || aBoolean56)) {
							for (local110 = 0; local110 < local92.anIntArray96.length; local110++) {
								if (local92.anIntArray96[local110] == local97) {
									local32 += 999999999;
									break;
								}
							}
						}
					}
					if (local39 == 11) {
						local32 += this.anInt278;
					}
					if (local39 == 12) {
						local32 += this.anInt346;
					}
					if (local39 == 13) {
						local193 = this.anIntArray38[local30[local34++]];
						local97 = local30[local34++];
						local32 += (local193 & 0x1 << local97) == 0 ? 0 : 1;
					}
					if (local39 == 14) {
						local193 = local30[local34++];
						@Pc(316) Class35 local316 = Class35.aClass35Array1[local193];
						local110 = local316.anInt890;
						@Pc(322) int local322 = local316.anInt891;
						@Pc(325) int local325 = local316.anInt892;
						@Pc(331) int local331 = anIntArray63[local325 - local322];
						local32 += this.anIntArray38[local110] >> local322 & local331;
					}
				}
			} catch (@Pc(344) Exception local344) {
				return -1;
			}
		} catch (@Pc(347) RuntimeException local347) {
			signlink.reporterror("51711, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local347.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!d;)V")
	private void method153(@OriginalArg(1) Class6 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt470;
			@Pc(66) int local66;
			if ((local4 < 1 || local4 > 100) && (local4 < 701 || local4 > 800)) {
				if (local4 >= 101 && local4 <= 200 || local4 >= 801 && local4 <= 900) {
					local66 = this.anInt445;
					if (this.anInt446 != 2) {
						local66 = 0;
					}
					if (local4 > 800) {
						local4 -= 701;
					} else {
						local4 -= 101;
					}
					if (local4 >= local66) {
						arg0.aString19 = "";
						arg0.anInt469 = 0;
					} else {
						if (this.anIntArray55[local4] == 0) {
							arg0.aString19 = "@red@Offline";
						} else if (this.anIntArray55[local4] == anInt328) {
							arg0.aString19 = "@gre@World-" + (this.anIntArray55[local4] - 9);
						} else {
							arg0.aString19 = "@yel@World-" + (this.anIntArray55[local4] - 9);
						}
						arg0.anInt469 = 1;
					}
				} else if (local4 == 203) {
					local66 = this.anInt445;
					if (this.anInt446 != 2) {
						local66 = 0;
					}
					arg0.anInt476 = local66 * 15 + 20;
					if (arg0.anInt476 <= arg0.anInt472) {
						arg0.anInt476 = arg0.anInt472 + 1;
					}
				} else if (local4 >= 401 && local4 <= 500) {
					local4 -= 401;
					if (local4 >= this.anInt428) {
						arg0.aString19 = "";
						arg0.anInt469 = 0;
					} else {
						arg0.aString19 = Class49.method683(Class49.method680(this.aLongArray3[local4]));
						arg0.anInt469 = 1;
					}
				} else if (local4 == 503) {
					arg0.anInt476 = this.anInt428 * 15 + 20;
					if (arg0.anInt476 <= arg0.anInt472) {
						arg0.anInt476 = arg0.anInt472 + 1;
					}
				} else if (local4 == 327) {
					arg0.anInt492 = 150;
					arg0.anInt493 = (int) (Math.sin((double) anInt268 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean67) {
						for (local66 = 0; local66 < 7; local66++) {
							@Pc(303) int local303 = this.anIntArray80[local66];
							if (local303 >= 0 && !Class23.aClass23Array1[local303].method479((byte) 7)) {
								return;
							}
						}
						this.aBoolean67 = false;
						@Pc(322) Class1_Sub1_Sub1_Sub5[] local322 = new Class1_Sub1_Sub1_Sub5[7];
						@Pc(324) int local324 = 0;
						for (@Pc(326) int local326 = 0; local326 < 7; local326++) {
							@Pc(333) int local333 = this.anIntArray80[local326];
							if (local333 >= 0) {
								local322[local324++] = Class23.aClass23Array1[local333].method480();
							}
						}
						@Pc(355) Class1_Sub1_Sub1_Sub5 local355 = new Class1_Sub1_Sub1_Sub5(local324, local322, -38792);
						for (@Pc(357) int local357 = 0; local357 < 5; local357++) {
							if (this.anIntArray40[local357] != 0) {
								local355.method302(anIntArrayArray4[local357][0], anIntArrayArray4[local357][this.anIntArray40[local357]]);
								if (local357 == 1) {
									local355.method302(anIntArray39[0], anIntArray39[this.anIntArray40[local357]]);
								}
							}
						}
						local355.method295();
						local355.method296(this.aByte20, Class27.aClass27Array1[aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt138].anIntArray227[0]);
						local355.method305(64, 850, -30, -50, -30, true);
						arg0.anInt485 = 5;
						arg0.anInt486 = 0;
						Class6.method234(local355);
					}
				} else if (local4 == 324) {
					if (this.aClass1_Sub1_Sub2_Sub2_9 == null) {
						this.aClass1_Sub1_Sub2_Sub2_9 = arg0.aClass1_Sub1_Sub2_Sub2_14;
						this.aClass1_Sub1_Sub2_Sub2_10 = arg0.aClass1_Sub1_Sub2_Sub2_15;
					}
					if (this.aBoolean87) {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_10;
					} else {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_9;
					}
				} else if (local4 == 325) {
					if (this.aClass1_Sub1_Sub2_Sub2_9 == null) {
						this.aClass1_Sub1_Sub2_Sub2_9 = arg0.aClass1_Sub1_Sub2_Sub2_14;
						this.aClass1_Sub1_Sub2_Sub2_10 = arg0.aClass1_Sub1_Sub2_Sub2_15;
					}
					if (this.aBoolean87) {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_9;
					} else {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_10;
					}
				} else if (local4 == 600) {
					arg0.aString19 = this.aString18;
					if (anInt268 % 20 < 10) {
						arg0.aString19 = arg0.aString19 + "|";
					} else {
						arg0.aString19 = arg0.aString19 + " ";
					}
				} else {
					if (local4 == 613) {
						if (this.anInt313 < 1) {
							arg0.aString19 = "";
						} else if (this.aBoolean52) {
							arg0.anInt481 = 16711680;
							arg0.aString19 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt481 = 16777215;
							arg0.aString19 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(564) String local564;
					if (local4 == 650 || local4 == 655) {
						if (this.anInt368 == 0) {
							arg0.aString19 = "";
						} else {
							if (this.anInt298 == 0) {
								local564 = "earlier today";
							} else if (this.anInt298 == 1) {
								local564 = "yesterday";
							} else {
								local564 = this.anInt298 + " days ago";
							}
							arg0.aString19 = "You last logged in " + local564 + " from: " + signlink.dns;
						}
					}
					if (local4 == 651) {
						if (this.anInt280 == 0) {
							arg0.aString19 = "0 unread messages";
							arg0.anInt481 = 16776960;
						}
						if (this.anInt280 == 1) {
							arg0.aString19 = "1 unread message";
							arg0.anInt481 = 65280;
						}
						if (this.anInt280 > 1) {
							arg0.aString19 = this.anInt280 + " unread messages";
							arg0.anInt481 = 65280;
						}
					}
					if (local4 == 652) {
						if (this.anInt444 == 201) {
							if (this.anInt369 == 1) {
								arg0.aString19 = "@yel@This is a non-members world: @whi@Since you are a member we";
							} else {
								arg0.aString19 = "";
							}
						} else if (this.anInt444 == 200) {
							arg0.aString19 = "You have not yet set any password recovery questions.";
						} else {
							if (this.anInt444 == 0) {
								local564 = "Earlier today";
							} else if (this.anInt444 == 1) {
								local564 = "Yesterday";
							} else {
								local564 = this.anInt444 + " days ago";
							}
							arg0.aString19 = local564 + " you changed your recovery questions";
						}
					}
					if (local4 == 653) {
						if (this.anInt444 == 201) {
							if (this.anInt369 == 1) {
								arg0.aString19 = "@whi@recommend you use a members world instead. You may use";
							} else {
								arg0.aString19 = "";
							}
						} else if (this.anInt444 == 200) {
							arg0.aString19 = "We strongly recommend you do so now to secure your account.";
						} else {
							arg0.aString19 = "If you do not remember making this change then cancel it immediately";
						}
					}
					if (local4 == 654) {
						if (this.anInt444 == 201) {
							if (this.anInt369 == 1) {
								arg0.aString19 = "@whi@this world but member benefits are unavailabe whilst here.";
							} else {
								arg0.aString19 = "";
							}
						} else if (this.anInt444 == 200) {
							arg0.aString19 = "Do this from the 'account management' area on our front webpage";
						} else {
							arg0.aString19 = "Do this from the 'account management' area on our front webpage";
						}
					}
				}
			} else if (local4 == 1 && this.anInt446 == 0) {
				arg0.aString19 = "Loading friend list";
				arg0.anInt469 = 0;
			} else if (local4 == 1 && this.anInt446 == 1) {
				arg0.aString19 = "Connecting to friendserver";
				arg0.anInt469 = 0;
			} else if (local4 == 2 && this.anInt446 != 2) {
				arg0.aString19 = "Please wait...";
				arg0.anInt469 = 0;
			} else {
				local66 = this.anInt445;
				if (this.anInt446 != 2) {
					local66 = 0;
				}
				if (local4 > 700) {
					local4 -= 601;
				} else {
					local4--;
				}
				if (local4 >= local66) {
					arg0.aString19 = "";
					arg0.anInt469 = 0;
				} else {
					arg0.aString19 = this.aStringArray2[local4];
					arg0.anInt469 = 1;
				}
			}
		} catch (@Pc(772) RuntimeException local772) {
			signlink.reporterror("94487, " + 74 + ", " + arg0 + ", " + local772.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method154() {
		try {
			this.aBoolean47 = true;
			try {
				@Pc(6) long local6 = System.currentTimeMillis();
				@Pc(8) int local8 = 0;
				@Pc(10) int local10 = 20;
				while (this.aBoolean46) {
					this.anInt434++;
					this.method205();
					this.method205();
					this.method141();
					local8++;
					if (local8 > 10) {
						@Pc(33) long local33 = System.currentTimeMillis();
						@Pc(42) int local42 = (int) (local33 - local6) / 10 - local10;
						local10 = 40 - local42;
						if (local10 < 5) {
							local10 = 5;
						}
						local8 = 0;
						local6 = local33;
					}
					try {
						Thread.sleep((long) local10);
					} catch (@Pc(60) Exception local60) {
					}
				}
			} catch (@Pc(66) Exception local66) {
			}
			this.aBoolean47 = false;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("29510, " + 268 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method155(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			for (@Pc(14) int local14 = 0; local14 < this.anInt325; local14++) {
				if (this.anIntArray41[local14] <= 0) {
					@Pc(23) boolean local23 = false;
					try {
						if (this.anIntArray83[local14] != this.anInt352 || this.anIntArray49[local14] != this.anInt350) {
							@Pc(56) Class1_Sub1_Sub3 local56 = Class5.method80(this.anIntArray83[local14], this.anIntArray49[local14]);
							if (System.currentTimeMillis() + (long) (local56.anInt796 / 22) > this.aLong16 + (long) (this.anInt330 / 22)) {
								this.anInt330 = local56.anInt796;
								this.aLong16 = System.currentTimeMillis();
								if (this.method224(local56.anInt796, local56.aByteArray9)) {
									this.anInt352 = this.anIntArray83[local14];
									this.anInt350 = this.anIntArray49[local14];
								} else {
									local23 = true;
								}
							}
						} else if (!this.method119()) {
							local23 = true;
						}
					} catch (@Pc(106) Exception local106) {
					}
					if (local23 && this.anIntArray41[local14] != -5) {
						this.anIntArray41[local14] = -5;
					} else {
						this.anInt325--;
						for (@Pc(122) int local122 = local14; local122 < this.anInt325; local122++) {
							this.anIntArray83[local122] = this.anIntArray83[local122 + 1];
							this.anIntArray49[local122] = this.anIntArray49[local122 + 1];
							this.anIntArray41[local122] = this.anIntArray41[local122 + 1];
						}
						local14--;
					}
				} else {
					@Pc(174) int local174 = this.anIntArray41[local14]--;
				}
			}
			if (this.anInt377 > 0) {
				this.anInt377 -= 20;
				if (this.anInt377 < 0) {
					this.anInt377 = 0;
				}
				if (this.anInt377 == 0 && this.aBoolean73 && !aBoolean57) {
					this.anInt343 = this.anInt399;
					this.aBoolean60 = false;
					this.aClass45_Sub1_1.method657(2, this.anInt343);
					return;
				}
			}
		} catch (@Pc(220) RuntimeException local220) {
			signlink.reporterror("19083, " + arg0 + ", " + local220.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method156() {
		try {
			try {
				@Pc(11) int local11 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt134 + this.anInt401;
				@Pc(17) int local17 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt135 + this.anInt274;
				if (this.anInt276 - local11 < -500 || this.anInt276 - local11 > 500 || this.anInt277 - local17 < -500 || this.anInt277 - local17 > 500) {
					this.anInt276 = local11;
					this.anInt277 = local17;
				}
				if (this.anInt276 != local11) {
					this.anInt276 += (local11 - this.anInt276) / 16;
				}
				if (this.anInt277 != local17) {
					this.anInt277 += (local17 - this.anInt277) / 16;
				}
				if (super.anIntArray32[1] == 1) {
					this.anInt341 += (-this.anInt341 - 24) / 2;
				} else if (super.anIntArray32[2] == 1) {
					this.anInt341 += (24 - this.anInt341) / 2;
				} else {
					this.anInt341 /= 2;
				}
				if (super.anIntArray32[3] == 1) {
					this.anInt342 += (12 - this.anInt342) / 2;
				} else if (super.anIntArray32[4] == 1) {
					this.anInt342 += (-this.anInt342 - 12) / 2;
				} else {
					this.anInt342 /= 2;
				}
				this.anInt340 = this.anInt340 + this.anInt341 / 2 & 0x7FF;
				this.anInt339 += this.anInt342 / 2;
				if (this.anInt339 < 128) {
					this.anInt339 = 128;
				}
				if (this.anInt339 > 383) {
					this.anInt339 = 383;
				}
				@Pc(204) int local204 = this.anInt276 >> 7;
				@Pc(209) int local209 = this.anInt277 >> 7;
				@Pc(219) int local219 = this.method168(this.anInt279, this.anInt276, this.anInt277, 54);
				@Pc(221) int local221 = 0;
				@Pc(237) int local237;
				if (local204 > 3 && local209 > 3 && local204 < 100 && local209 < 100) {
					for (local237 = local204 - 4; local237 <= local204 + 4; local237++) {
						for (@Pc(243) int local243 = local209 - 4; local243 <= local209 + 4; local243++) {
							@Pc(248) int local248 = this.anInt279;
							if (local248 < 3 && (this.aByteArrayArrayArray7[1][local237][local243] & 0x2) == 2) {
								local248++;
							}
							@Pc(275) int local275 = local219 - this.anIntArrayArrayArray3[local248][local237][local243];
							if (local275 > local221) {
								local221 = local275;
							}
						}
					}
				}
				local237 = local221 * 192;
				if (local237 > 98048) {
					local237 = 98048;
				}
				if (local237 < 32768) {
					local237 = 32768;
				}
				if (local237 > this.anInt419) {
					this.anInt419 += (local237 - this.anInt419) / 24;
				} else if (local237 < this.anInt419) {
					this.anInt419 += (local237 - this.anInt419) / 80;
				}
			} catch (@Pc(339) Exception local339) {
				signlink.reporterror("glfc_ex " + aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt134 + "," + aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt135 + "," + this.anInt276 + "," + this.anInt277 + "," + this.anInt436 + "," + this.anInt437 + "," + this.anInt390 + "," + this.anInt391);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(389) RuntimeException local389) {
			signlink.reporterror("92695, " + -16 + ", " + local389.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method157(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt428 >= 100) {
					this.method121(0, "Your ignore list is full. Max of 100 hit", "");
				} else {
					@Pc(23) String local23 = Class49.method683(Class49.method680(arg0));
					for (@Pc(25) int local25 = 0; local25 < this.anInt428; local25++) {
						if (this.aLongArray3[local25] == arg0) {
							this.method121(0, local23 + " is already on your ignore list", "");
							return;
						}
					}
					for (@Pc(55) int local55 = 0; local55 < this.anInt445; local55++) {
						if (this.aLongArray4[local55] == arg0) {
							this.method121(0, "Please remove " + local23 + " from your friend list first", "");
							return;
						}
					}
					this.aLongArray3[this.anInt428++] = arg0;
					this.aBoolean45 = true;
					this.aClass1_Sub1_Sub3_3.method487(185, this.anInt378);
					this.aClass1_Sub1_Sub3_3.method494(arg0);
				}
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("45888, " + 253 + ", " + arg0 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!mb;II)V")
	private void method158(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt269 = 0;
			this.anInt323 = 0;
			this.method196(arg0, arg1);
			this.method149(arg1, arg0);
			this.method229(arg1, arg0);
			@Pc(36) int local36;
			for (@Pc(29) int local29 = 0; local29 < this.anInt269; local29++) {
				local36 = this.anIntArray37[local29];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local36].anInt174 != anInt268) {
					this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local36].aClass13_1 = null;
					this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local36] = null;
				}
			}
			if (arg0.anInt796 != arg1) {
				signlink.reporterror(this.aString5 + " size mismatch in getnpcpos - pos:" + arg0.anInt796 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local36 = 0; local36 < this.anInt385; local36++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray62[local36]] == null) {
					signlink.reporterror(this.aString5 + " null entry in npc list - pos:" + local36 + " size:" + this.anInt385);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("31384, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method159() {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt385; local1++) {
				@Pc(8) int local8 = this.anIntArray62[local1];
				@Pc(13) Class1_Sub1_Sub1_Sub1_Sub1 local13 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local8];
				if (local13 != null) {
					this.method160(local13, local13.aClass13_1.aByte39);
				}
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("20788, " + false + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!z;I)V")
	private void method160(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		try {
			if (arg0.anInt134 < 128 || arg0.anInt135 < 128 || arg0.anInt134 >= 13184 || arg0.anInt135 >= 13184) {
				arg0.anInt157 = -1;
				arg0.anInt162 = -1;
				arg0.anInt171 = 0;
				arg0.anInt172 = 0;
				arg0.anInt134 = arg0.anIntArray16[0] * 128 + arg0.anInt137 * 64;
				arg0.anInt135 = arg0.anIntArray17[0] * 128 + arg0.anInt137 * 64;
				arg0.method48();
			}
			if (arg0 == aClass1_Sub1_Sub1_Sub1_Sub2_1 && (arg0.anInt134 < 1536 || arg0.anInt135 < 1536 || arg0.anInt134 >= 11776 || arg0.anInt135 >= 11776)) {
				arg0.anInt157 = -1;
				arg0.anInt162 = -1;
				arg0.anInt171 = 0;
				arg0.anInt172 = 0;
				arg0.anInt134 = arg0.anIntArray16[0] * 128 + arg0.anInt137 * 64;
				arg0.anInt135 = arg0.anIntArray17[0] * 128 + arg0.anInt137 * 64;
				arg0.method48();
			}
			if (arg0.anInt171 > anInt268) {
				this.method161(arg0);
			} else if (arg0.anInt172 >= anInt268) {
				this.method162(arg0);
			} else {
				this.method163(arg0);
			}
			this.method164(this.aBoolean82, arg0);
			this.method165(arg0);
		} catch (@Pc(156) RuntimeException local156) {
			signlink.reporterror("38146, " + -938 + ", " + arg0 + ", " + arg1 + ", " + local156.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!z;)V")
	private void method161(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt171 - anInt268;
			@Pc(21) int local21 = arg0.anInt167 * 128 + arg0.anInt137 * 64;
			@Pc(31) int local31 = arg0.anInt169 * 128 + arg0.anInt137 * 64;
			arg0.anInt134 += (local21 - arg0.anInt134) / local4;
			arg0.anInt135 += (local31 - arg0.anInt135) / local4;
			arg0.anInt178 = 0;
			if (arg0.anInt173 == 0) {
				arg0.anInt176 = 1024;
			}
			if (arg0.anInt173 == 1) {
				arg0.anInt176 = 1536;
			}
			if (arg0.anInt173 == 2) {
				arg0.anInt176 = 0;
			}
			if (arg0.anInt173 == 3) {
				arg0.anInt176 = 512;
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("65142, " + 542 + ", " + arg0 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!z;I)V")
	private void method162(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt172 == anInt268 || arg0.anInt157 == -1 || arg0.anInt160 != 0 || arg0.anInt159 + 1 > Class27.aClass27Array1[arg0.anInt157].method517(arg0.anInt158)) {
				@Pc(36) int local36 = arg0.anInt172 - arg0.anInt171;
				@Pc(41) int local41 = anInt268 - arg0.anInt171;
				@Pc(51) int local51 = arg0.anInt167 * 128 + arg0.anInt137 * 64;
				@Pc(61) int local61 = arg0.anInt169 * 128 + arg0.anInt137 * 64;
				@Pc(71) int local71 = arg0.anInt168 * 128 + arg0.anInt137 * 64;
				@Pc(81) int local81 = arg0.anInt170 * 128 + arg0.anInt137 * 64;
				arg0.anInt134 = (local51 * (local36 - local41) + local71 * local41) / local36;
				arg0.anInt135 = (local61 * (local36 - local41) + local81 * local41) / local36;
			}
			arg0.anInt178 = 0;
			if (arg0.anInt173 == 0) {
				arg0.anInt176 = 1024;
			}
			if (arg0.anInt173 == 1) {
				arg0.anInt176 = 1536;
			}
			if (arg0.anInt173 == 2) {
				arg0.anInt176 = 0;
			}
			if (arg0.anInt173 == 3) {
				arg0.anInt176 = 512;
			}
			arg0.anInt136 = arg0.anInt176;
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("99791, " + arg0 + ", " + 0 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!z;)V")
	private void method163(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.anInt154 = arg0.anInt138;
			if (arg0.anInt177 == 0) {
				arg0.anInt178 = 0;
			} else {
				if (arg0.anInt157 != -1 && arg0.anInt160 == 0) {
					@Pc(34) Class27 local34 = Class27.aClass27Array1[arg0.anInt157];
					if (arg0.anInt179 > 0 && local34.anInt836 == 0) {
						arg0.anInt178++;
						return;
					}
					if (arg0.anInt179 <= 0 && local34.anInt837 == 0) {
						arg0.anInt178++;
						return;
					}
				}
				@Pc(63) int local63 = arg0.anInt134;
				@Pc(66) int local66 = arg0.anInt135;
				@Pc(81) int local81 = arg0.anIntArray16[arg0.anInt177 - 1] * 128 + arg0.anInt137 * 64;
				@Pc(96) int local96 = arg0.anIntArray17[arg0.anInt177 - 1] * 128 + arg0.anInt137 * 64;
				if (local81 - local63 <= 256 && local81 - local63 >= -256 && local96 - local66 <= 256 && local96 - local66 >= -256) {
					if (local63 < local81) {
						if (local66 < local96) {
							arg0.anInt176 = 1280;
						} else if (local66 > local96) {
							arg0.anInt176 = 1792;
						} else {
							arg0.anInt176 = 1536;
						}
					} else if (local63 > local81) {
						if (local66 < local96) {
							arg0.anInt176 = 768;
						} else if (local66 > local96) {
							arg0.anInt176 = 256;
						} else {
							arg0.anInt176 = 512;
						}
					} else if (local66 < local96) {
						arg0.anInt176 = 1024;
					} else {
						arg0.anInt176 = 0;
					}
					@Pc(190) int local190 = arg0.anInt176 - arg0.anInt136 & 0x7FF;
					if (local190 > 1024) {
						local190 -= 2048;
					}
					@Pc(197) int local197 = arg0.anInt141;
					if (local190 >= -256 && local190 <= 256) {
						local197 = arg0.anInt140;
					} else if (local190 >= 256 && local190 < 768) {
						local197 = arg0.anInt143;
					} else if (local190 >= -768 && local190 <= -256) {
						local197 = arg0.anInt142;
					}
					if (local197 == -1) {
						local197 = arg0.anInt140;
					}
					arg0.anInt154 = local197;
					@Pc(239) int local239 = 4;
					if (arg0.anInt136 != arg0.anInt176 && arg0.anInt151 == -1) {
						local239 = 2;
					}
					if (arg0.anInt177 > 2) {
						local239 = 6;
					}
					if (arg0.anInt177 > 3) {
						local239 = 8;
					}
					if (arg0.anInt178 > 0 && arg0.anInt177 > 1) {
						local239 = 8;
						arg0.anInt178--;
					}
					if (arg0.aBooleanArray3[arg0.anInt177 - 1]) {
						local239 <<= 0x1;
					}
					if (local239 >= 8 && arg0.anInt154 == arg0.anInt140 && arg0.anInt144 != -1) {
						arg0.anInt154 = arg0.anInt144;
					}
					if (local63 < local81) {
						arg0.anInt134 += local239;
						if (arg0.anInt134 > local81) {
							arg0.anInt134 = local81;
						}
					} else if (local63 > local81) {
						arg0.anInt134 -= local239;
						if (arg0.anInt134 < local81) {
							arg0.anInt134 = local81;
						}
					}
					if (local66 < local96) {
						arg0.anInt135 += local239;
						if (arg0.anInt135 > local96) {
							arg0.anInt135 = local96;
						}
					} else if (local66 > local96) {
						arg0.anInt135 -= local239;
						if (arg0.anInt135 < local96) {
							arg0.anInt135 = local96;
						}
					}
					if (arg0.anInt134 == local81 && arg0.anInt135 == local96) {
						arg0.anInt177--;
						if (arg0.anInt179 > 0) {
							arg0.anInt179--;
							return;
						}
					}
				} else {
					arg0.anInt134 = local81;
					arg0.anInt135 = local96;
				}
			}
		} catch (@Pc(398) RuntimeException local398) {
			signlink.reporterror("48775, " + 9 + ", " + arg0 + ", " + local398.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!z;)V")
	private void method164(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg1) {
		try {
			this.aBoolean70 &= arg0;
			@Pc(29) int local29;
			@Pc(35) int local35;
			if (arg1.anInt151 != -1 && arg1.anInt151 < 32768) {
				@Pc(21) Class1_Sub1_Sub1_Sub1_Sub1 local21 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[arg1.anInt151];
				if (local21 != null) {
					local29 = arg1.anInt134 - local21.anInt134;
					local35 = arg1.anInt135 - local21.anInt135;
					if (local29 != 0 || local35 != 0) {
						arg1.anInt176 = (int) (Math.atan2((double) local29, (double) local35) * 325.949D) & 0x7FF;
					}
				}
			}
			@Pc(60) int local60;
			if (arg1.anInt151 >= 32768) {
				local60 = arg1.anInt151 - 32768;
				if (local60 == this.anInt285) {
					local60 = this.anInt321;
				}
				@Pc(72) Class1_Sub1_Sub1_Sub1_Sub2 local72 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local60];
				if (local72 != null) {
					local35 = arg1.anInt134 - local72.anInt134;
					@Pc(86) int local86 = arg1.anInt135 - local72.anInt135;
					if (local35 != 0 || local86 != 0) {
						arg1.anInt176 = (int) (Math.atan2((double) local35, (double) local86) * 325.949D) & 0x7FF;
					}
				}
			}
			if ((arg1.anInt152 != 0 || arg1.anInt153 != 0) && (arg1.anInt177 == 0 || arg1.anInt178 > 0)) {
				local60 = arg1.anInt134 - (arg1.anInt152 - this.anInt390 - this.anInt390) * 64;
				local29 = arg1.anInt135 - (arg1.anInt153 - this.anInt391 - this.anInt391) * 64;
				if (local60 != 0 || local29 != 0) {
					arg1.anInt176 = (int) (Math.atan2((double) local60, (double) local29) * 325.949D) & 0x7FF;
				}
				arg1.anInt152 = 0;
				arg1.anInt153 = 0;
			}
			local60 = arg1.anInt176 - arg1.anInt136 & 0x7FF;
			if (local60 != 0) {
				if (local60 < 32 || local60 > 2016) {
					arg1.anInt136 = arg1.anInt176;
				} else if (local60 > 1024) {
					arg1.anInt136 -= 32;
				} else {
					arg1.anInt136 += 32;
				}
				arg1.anInt136 &= 0x7FF;
				if (arg1.anInt154 == arg1.anInt138 && arg1.anInt136 != arg1.anInt176) {
					if (arg1.anInt139 != -1) {
						arg1.anInt154 = arg1.anInt139;
						return;
					}
					arg1.anInt154 = arg1.anInt140;
					return;
				}
			}
		} catch (@Pc(234) RuntimeException local234) {
			signlink.reporterror("11005, " + arg0 + ", " + arg1 + ", " + local234.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!z;I)V")
	private void method165(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.aBoolean26 = false;
			@Pc(21) Class27 local21;
			if (arg0.anInt154 != -1) {
				local21 = Class27.aClass27Array1[arg0.anInt154];
				arg0.anInt156++;
				if (arg0.anInt155 < local21.anInt830 && arg0.anInt156 > local21.method517(arg0.anInt155)) {
					arg0.anInt156 = 0;
					arg0.anInt155++;
				}
				if (arg0.anInt155 >= local21.anInt830) {
					arg0.anInt156 = 0;
					arg0.anInt155 = 0;
				}
			}
			if (arg0.anInt162 != -1 && anInt268 >= arg0.anInt165) {
				if (arg0.anInt163 < 0) {
					arg0.anInt163 = 0;
				}
				local21 = Class32.aClass32Array1[arg0.anInt162].aClass27_2;
				arg0.anInt164++;
				while (arg0.anInt163 < local21.anInt830 && arg0.anInt164 > local21.method517(arg0.anInt163)) {
					arg0.anInt164 -= local21.method517(arg0.anInt163);
					arg0.anInt163++;
				}
				if (arg0.anInt163 >= local21.anInt830 && (arg0.anInt163 < 0 || arg0.anInt163 >= local21.anInt830)) {
					arg0.anInt162 = -1;
				}
			}
			if (arg0.anInt157 != -1 && arg0.anInt160 <= 1) {
				local21 = Class27.aClass27Array1[arg0.anInt157];
				if (local21.anInt836 == 1 && arg0.anInt179 > 0 && arg0.anInt171 <= anInt268 && arg0.anInt172 < anInt268) {
					arg0.anInt160 = 1;
					return;
				}
			}
			if (arg0.anInt157 != -1 && arg0.anInt160 == 0) {
				local21 = Class27.aClass27Array1[arg0.anInt157];
				arg0.anInt159++;
				while (arg0.anInt158 < local21.anInt830 && arg0.anInt159 > local21.method517(arg0.anInt158)) {
					arg0.anInt159 -= local21.method517(arg0.anInt158);
					arg0.anInt158++;
				}
				if (arg0.anInt158 >= local21.anInt830) {
					arg0.anInt158 -= local21.anInt831;
					arg0.anInt161++;
					if (arg0.anInt161 >= local21.anInt835) {
						arg0.anInt157 = -1;
					}
					if (arg0.anInt158 < 0 || arg0.anInt158 >= local21.anInt830) {
						arg0.anInt157 = -1;
					}
				}
				arg0.aBoolean26 = local21.aBoolean194;
			}
			if (arg0.anInt160 > 0) {
				arg0.anInt160--;
			}
		} catch (@Pc(266) RuntimeException local266) {
			signlink.reporterror("58405, " + arg0 + ", " + 0 + ", " + local266.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method166() {
		try {
			if (this.aBoolean84) {
				this.aBoolean84 = false;
				this.aClass37_12.method539(0, super.aGraphics2, 4, this.anInt455);
				this.aClass37_13.method539(0, super.aGraphics2, 357, this.anInt455);
				this.aClass37_14.method539(722, super.aGraphics2, 4, this.anInt455);
				this.aClass37_15.method539(743, super.aGraphics2, 205, this.anInt455);
				this.aClass37_16.method539(0, super.aGraphics2, 0, this.anInt455);
				this.aClass37_17.method539(516, super.aGraphics2, 4, this.anInt455);
				this.aClass37_18.method539(516, super.aGraphics2, 205, this.anInt455);
				this.aClass37_19.method539(496, super.aGraphics2, 357, this.anInt455);
				this.aClass37_20.method539(0, super.aGraphics2, 338, this.anInt455);
				this.aBoolean45 = true;
				this.aBoolean65 = true;
				this.aBoolean72 = true;
				this.aBoolean85 = true;
				if (this.anInt288 != 2) {
					this.aClass37_26.method539(4, super.aGraphics2, 4, this.anInt455);
					this.aClass37_25.method539(550, super.aGraphics2, 4, this.anInt455);
				}
			}
			if (this.anInt288 == 2) {
				this.method112(this.aByte25);
			}
			if (this.aBoolean83 && this.anInt420 == 1) {
				this.aBoolean45 = true;
			}
			@Pc(158) boolean local158;
			if (this.anInt461 != -1) {
				local158 = this.method182(this.anInt461, this.anInt398);
				if (local158) {
					this.aBoolean45 = true;
				}
			}
			if (this.anInt267 == 2) {
				this.aBoolean45 = true;
			}
			if (this.anInt365 == 2) {
				this.aBoolean45 = true;
			}
			if (this.aBoolean45) {
				this.method139();
				this.aBoolean45 = false;
			}
			if (this.anInt312 == -1) {
				this.aClass6_1.anInt477 = this.anInt459 - this.anInt370 - 77;
				if (super.anInt240 > 448 && super.anInt240 < 560 && super.anInt241 > 332) {
					this.method200(false, 463, 0, this.anInt459, this.aClass6_1, super.anInt241 - 357, super.anInt240 - 17, 77);
				}
				@Pc(240) int local240 = this.anInt459 - this.aClass6_1.anInt477 - 77;
				if (local240 < 0) {
					local240 = 0;
				}
				if (local240 > this.anInt459 - 77) {
					local240 = this.anInt459 - 77;
				}
				if (this.anInt370 != local240) {
					this.anInt370 = local240;
					this.aBoolean65 = true;
				}
			}
			if (this.anInt312 != -1) {
				local158 = this.method182(this.anInt312, this.anInt398);
				if (local158) {
					this.aBoolean65 = true;
				}
			}
			if (this.anInt267 == 3) {
				this.aBoolean65 = true;
			}
			if (this.anInt365 == 3) {
				this.aBoolean65 = true;
			}
			if (this.aString12 != null) {
				this.aBoolean65 = true;
			}
			if (this.aBoolean83 && this.anInt420 == 2) {
				this.aBoolean65 = true;
			}
			if (this.aBoolean65) {
				this.method192();
				this.aBoolean65 = false;
			}
			if (this.anInt288 == 2) {
				this.method215(this.aByte21);
				this.aClass37_25.method539(550, super.aGraphics2, 4, this.anInt455);
			}
			if (this.anInt454 != -1) {
				this.aBoolean72 = true;
			}
			if (this.aBoolean72) {
				if (this.anInt454 != -1 && this.anInt454 == this.anInt256) {
					this.anInt454 = -1;
					this.aClass1_Sub1_Sub3_3.method487(171, this.anInt378);
					this.aClass1_Sub1_Sub3_3.method488(this.anInt256);
				}
				this.aBoolean72 = false;
				this.aClass37_23.method538();
				this.aClass1_Sub1_Sub2_Sub3_17.method445(0, this.anInt327, 0);
				if (this.anInt461 == -1) {
					if (this.anIntArray87[this.anInt256] != -1) {
						if (this.anInt256 == 0) {
							this.aClass1_Sub1_Sub2_Sub3_8.method445(10, this.anInt327, 22);
						}
						if (this.anInt256 == 1) {
							this.aClass1_Sub1_Sub2_Sub3_9.method445(8, this.anInt327, 54);
						}
						if (this.anInt256 == 2) {
							this.aClass1_Sub1_Sub2_Sub3_9.method445(8, this.anInt327, 82);
						}
						if (this.anInt256 == 3) {
							this.aClass1_Sub1_Sub2_Sub3_10.method445(8, this.anInt327, 110);
						}
						if (this.anInt256 == 4) {
							this.aClass1_Sub1_Sub2_Sub3_12.method445(8, this.anInt327, 153);
						}
						if (this.anInt256 == 5) {
							this.aClass1_Sub1_Sub2_Sub3_12.method445(8, this.anInt327, 181);
						}
						if (this.anInt256 == 6) {
							this.aClass1_Sub1_Sub2_Sub3_11.method445(9, this.anInt327, 209);
						}
					}
					if (this.anIntArray87[0] != -1 && (this.anInt454 != 0 || anInt268 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[0].method445(13, this.anInt327, 29);
					}
					if (this.anIntArray87[1] != -1 && (this.anInt454 != 1 || anInt268 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[1].method445(11, this.anInt327, 53);
					}
					if (this.anIntArray87[2] != -1 && (this.anInt454 != 2 || anInt268 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[2].method445(11, this.anInt327, 82);
					}
					if (this.anIntArray87[3] != -1 && (this.anInt454 != 3 || anInt268 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[3].method445(12, this.anInt327, 115);
					}
					if (this.anIntArray87[4] != -1 && (this.anInt454 != 4 || anInt268 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[4].method445(13, this.anInt327, 153);
					}
					if (this.anIntArray87[5] != -1 && (this.anInt454 != 5 || anInt268 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[5].method445(11, this.anInt327, 180);
					}
					if (this.anIntArray87[6] != -1 && (this.anInt454 != 6 || anInt268 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[6].method445(13, this.anInt327, 208);
					}
				}
				this.aClass37_23.method539(516, super.aGraphics2, 160, this.anInt455);
				this.aClass37_22.method538();
				this.aClass1_Sub1_Sub2_Sub3_16.method445(0, this.anInt327, 0);
				if (this.anInt461 == -1) {
					if (this.anIntArray87[this.anInt256] != -1) {
						if (this.anInt256 == 7) {
							this.aClass1_Sub1_Sub2_Sub3_3.method445(0, this.anInt327, 42);
						}
						if (this.anInt256 == 8) {
							this.aClass1_Sub1_Sub2_Sub3_4.method445(0, this.anInt327, 74);
						}
						if (this.anInt256 == 9) {
							this.aClass1_Sub1_Sub2_Sub3_4.method445(0, this.anInt327, 102);
						}
						if (this.anInt256 == 10) {
							this.aClass1_Sub1_Sub2_Sub3_5.method445(1, this.anInt327, 130);
						}
						if (this.anInt256 == 11) {
							this.aClass1_Sub1_Sub2_Sub3_7.method445(0, this.anInt327, 173);
						}
						if (this.anInt256 == 12) {
							this.aClass1_Sub1_Sub2_Sub3_7.method445(0, this.anInt327, 201);
						}
						if (this.anInt256 == 13) {
							this.aClass1_Sub1_Sub2_Sub3_6.method445(0, this.anInt327, 229);
						}
					}
					if (this.anIntArray87[8] != -1 && (this.anInt454 != 8 || anInt268 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[7].method445(2, this.anInt327, 74);
					}
					if (this.anIntArray87[9] != -1 && (this.anInt454 != 9 || anInt268 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[8].method445(3, this.anInt327, 102);
					}
					if (this.anIntArray87[10] != -1 && (this.anInt454 != 10 || anInt268 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[9].method445(4, this.anInt327, 137);
					}
					if (this.anIntArray87[11] != -1 && (this.anInt454 != 11 || anInt268 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[10].method445(2, this.anInt327, 174);
					}
					if (this.anIntArray87[12] != -1 && (this.anInt454 != 12 || anInt268 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[11].method445(2, this.anInt327, 201);
					}
					if (this.anIntArray87[13] != -1 && (this.anInt454 != 13 || anInt268 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[12].method445(2, this.anInt327, 226);
					}
				}
				this.aClass37_22.method539(496, super.aGraphics2, 466, this.anInt455);
				this.aClass37_26.method538();
			}
			if (this.aBoolean85) {
				this.aBoolean85 = false;
				this.aClass37_21.method538();
				this.aClass1_Sub1_Sub2_Sub3_15.method445(0, this.anInt327, 0);
				this.aClass1_Sub1_Sub2_Sub4_2.method466(55, 16777215, true, 28, "Public chat");
				if (this.anInt358 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466(55, 65280, true, 41, "On");
				}
				if (this.anInt358 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466(55, 16776960, true, 41, "Friends");
				}
				if (this.anInt358 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466(55, 16711680, true, 41, "Off");
				}
				if (this.anInt358 == 3) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466(55, 65535, true, 41, "Hide");
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method466(184, 16777215, true, 28, "Private chat");
				if (this.anInt387 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466(184, 65280, true, 41, "On");
				}
				if (this.anInt387 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466(184, 16776960, true, 41, "Friends");
				}
				if (this.anInt387 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466(184, 16711680, true, 41, "Off");
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method466(324, 16777215, true, 28, "Trade/duel");
				if (this.anInt427 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466(324, 65280, true, 41, "On");
				}
				if (this.anInt427 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466(324, 16776960, true, 41, "Friends");
				}
				if (this.anInt427 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466(324, 16711680, true, 41, "Off");
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method466(458, 16777215, true, 33, "Report abuse");
				this.aClass37_21.method539(0, super.aGraphics2, 453, this.anInt455);
				this.aClass37_26.method538();
			}
			this.anInt398 = 0;
		} catch (@Pc(1102) RuntimeException local1102) {
			signlink.reporterror("40570, " + -208 + ", " + local1102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZLclient!mb;)V")
	private void method167(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			this.anInt269 = 0;
			this.anInt323 = 0;
			this.method131(arg0, arg1);
			this.method207(arg0, arg1);
			this.method222(arg1, (byte) 4, arg0);
			this.method140(arg0, arg1);
			@Pc(41) int local41;
			for (@Pc(34) int local34 = 0; local34 < this.anInt269; local34++) {
				local41 = this.anIntArray37[local34];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local41].anInt174 != anInt268) {
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local41] = null;
				}
			}
			if (arg1.anInt796 != arg0) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.anInt796 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local41 = 0; local41 < this.anInt322; local41++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray46[local41]] == null) {
					signlink.reporterror(this.aString5 + " null entry in pl list - pos:" + local41 + " size:" + this.anInt322);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("67780, " + arg0 + ", " + true + ", " + arg1 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)I")
	private int method168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) int local3 = arg1 >> 7;
			@Pc(7) int local7 = arg2 >> 7;
			if (local3 < 0 || local7 < 0 || local3 > 103 || local7 > 103) {
				return 0;
			}
			@Pc(21) int local21 = arg0;
			@Pc(25) boolean local25 = false;
			if (arg0 < 3 && (this.aByteArrayArrayArray7[1][local3][local7] & 0x2) == 2) {
				local21 = arg0 + 1;
			}
			@Pc(45) int local45 = arg1 & 0x7F;
			@Pc(49) int local49 = arg2 & 0x7F;
			@Pc(77) int local77 = this.anIntArrayArrayArray3[local21][local3][local7] * (128 - local45) + this.anIntArrayArrayArray3[local21][local3 + 1][local7] * local45 >> 7;
			@Pc(109) int local109 = this.anIntArrayArrayArray3[local21][local3][local7 + 1] * (128 - local45) + this.anIntArrayArrayArray3[local21][local3 + 1][local7 + 1] * local45 >> 7;
			return local77 * (128 - local49) + local109 * local49 >> 7;
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("17055, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IJ)V")
	private void method169(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(12) int local12 = 0; local12 < this.anInt445; local12++) {
					if (this.aLongArray4[local12] == arg0) {
						this.anInt445--;
						this.aBoolean45 = true;
						for (@Pc(32) int local32 = local12; local32 < this.anInt445; local32++) {
							this.aStringArray2[local32] = this.aStringArray2[local32 + 1];
							this.anIntArray55[local32] = this.anIntArray55[local32 + 1];
							this.aLongArray4[local32] = this.aLongArray4[local32 + 1];
						}
						this.aClass1_Sub1_Sub3_3.method487(157, this.anInt378);
						this.aClass1_Sub1_Sub3_3.method494(arg0);
						return;
					}
				}
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("77579, " + 3 + ", " + arg0 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!ob;)V")
	private void method170(@OriginalArg(1) Class1_Sub2 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt844 == 0) {
				local1 = this.aClass39_1.method570(arg0.anInt843, arg0.anInt845, arg0.anInt846);
			}
			if (arg0.anInt844 == 1) {
				local1 = this.aClass39_1.method571(arg0.anInt846, (byte) 6, arg0.anInt843, arg0.anInt845);
			}
			if (arg0.anInt844 == 2) {
				local1 = this.aClass39_1.method572(arg0.anInt843, arg0.anInt845, arg0.anInt846);
			}
			if (arg0.anInt844 == 3) {
				local1 = this.aClass39_1.method573(arg0.anInt843, arg0.anInt845, arg0.anInt846);
			}
			if (local1 != 0) {
				@Pc(76) int local76 = this.aClass39_1.method574(arg0.anInt843, arg0.anInt845, arg0.anInt846, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local76 & 0x1F;
				local7 = local76 >> 6;
			}
			arg0.anInt847 = local3;
			arg0.anInt849 = local5;
			arg0.anInt848 = local7;
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("27041, " + 2 + ", " + arg0 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZ)V")
	private void method171(@OriginalArg(1) boolean arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt385; local1++) {
				@Pc(11) Class1_Sub1_Sub1_Sub1_Sub1 local11 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray62[local1]];
				@Pc(20) int local20 = (this.anIntArray62[local1] << 14) + 536870912;
				if (local11 != null && local11.method49() && local11.aClass13_1.aBoolean140 == arg0) {
					@Pc(36) int local36 = local11.anInt134 >> 7;
					@Pc(41) int local41 = local11.anInt135 >> 7;
					if (local36 >= 0 && local36 < 104 && local41 >= 0 && local41 < 104) {
						if (local11.anInt137 == 1 && (local11.anInt134 & 0x7F) == 64 && (local11.anInt135 & 0x7F) == 64) {
							if (this.anIntArrayArray5[local36][local41] == this.anInt409) {
								continue;
							}
							this.anIntArrayArray5[local36][local41] = this.anInt409;
						}
						this.aClass39_1.method555(local11, this.method168(this.anInt279, local11.anInt134, local11.anInt135, 54), this.anInt279, local20, local11.anInt134, (local11.anInt137 - 1) * 64 + 60, local11.anInt135, local11.anInt136, local11.aBoolean26);
					}
				}
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("36231, " + true + ", " + arg0 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method172(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				if (this.aBoolean51) {
					this.aBoolean51 = false;
					this.aBoolean65 = true;
				}
				@Pc(18) int local18 = this.anIntArray58[arg0];
				@Pc(23) int local23 = this.anIntArray59[arg0];
				@Pc(28) int local28 = this.anIntArray60[arg0];
				@Pc(33) int local33 = this.anIntArray61[arg0];
				if (local28 >= 2000) {
					local28 -= 2000;
				}
				@Pc(53) Class1_Sub1_Sub1_Sub1_Sub1 local53;
				if (local28 == 265) {
					local53 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
					if (local53 != null) {
						this.method120(local53.anIntArray16[0], (byte) 5, 1, false, 0, 0, 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], local53.anIntArray17[0], 2, 0);
						this.anInt308 = super.anInt246;
						this.anInt309 = super.anInt247;
						this.anInt311 = 2;
						this.anInt310 = 0;
						this.aClass1_Sub1_Sub3_3.method487(250, this.anInt378);
						this.aClass1_Sub1_Sub3_3.method489(local33);
						this.aClass1_Sub1_Sub3_3.method489(this.anInt316);
					}
				}
				@Pc(119) Class1_Sub1_Sub1_Sub1_Sub2 local119;
				if (local28 == 651) {
					local119 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
					if (local119 != null) {
						this.method120(local119.anIntArray16[0], (byte) 5, 1, false, 0, 0, 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], local119.anIntArray17[0], 2, 0);
						this.anInt308 = super.anInt246;
						this.anInt309 = super.anInt247;
						this.anInt311 = 2;
						this.anInt310 = 0;
						this.aClass1_Sub1_Sub3_3.method487(230, this.anInt378);
						this.aClass1_Sub1_Sub3_3.method489(local33);
						this.aClass1_Sub1_Sub3_3.method489(this.anInt316);
					}
				}
				@Pc(212) int local212;
				@Pc(194) Class6 local194;
				if (local28 == 465) {
					this.aClass1_Sub1_Sub3_3.method487(21, this.anInt378);
					this.aClass1_Sub1_Sub3_3.method489(local23);
					local194 = Class6.aClass6Array1[local23];
					if (local194.anIntArrayArray6 != null && local194.anIntArrayArray6[0][0] == 5) {
						local212 = local194.anIntArrayArray6[0][1];
						this.anIntArray38[local212] = 1 - this.anIntArray38[local212];
						this.method208(this.aBoolean76, local212);
						this.aBoolean45 = true;
					}
				}
				@Pc(266) boolean local266;
				if (local28 == 224 || local28 == 993 || local28 == 99 || local28 == 746 || local28 == 877) {
					local266 = this.method120(local18, (byte) 5, 0, false, 0, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], local23, 2, 0);
					if (!local266) {
						this.method120(local18, (byte) 5, 1, false, 0, 0, 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], local23, 2, 0);
					}
					this.anInt308 = super.anInt246;
					this.anInt309 = super.anInt247;
					this.anInt311 = 2;
					this.anInt310 = 0;
					if (local28 == 993) {
						this.aClass1_Sub1_Sub3_3.method487(206, this.anInt378);
					}
					if (local28 == 877) {
						this.aClass1_Sub1_Sub3_3.method487(55, this.anInt378);
					}
					if (local28 == 224) {
						this.aClass1_Sub1_Sub3_3.method487(110, this.anInt378);
					}
					if (local28 == 746) {
						this.aClass1_Sub1_Sub3_3.method487(25, this.anInt378);
					}
					if (local28 == 99) {
						this.aClass1_Sub1_Sub3_3.method487(121, this.anInt378);
					}
					this.aClass1_Sub1_Sub3_3.method489(local18 + this.anInt390);
					this.aClass1_Sub1_Sub3_3.method489(local23 + this.anInt391);
					this.aClass1_Sub1_Sub3_3.method489(local33);
				}
				if (local28 == 44 && !this.aBoolean80) {
					this.aClass1_Sub1_Sub3_3.method487(96, this.anInt378);
					this.aClass1_Sub1_Sub3_3.method489(local23);
					this.aBoolean80 = true;
				}
				if (local28 == 965) {
					local266 = this.method120(local18, (byte) 5, 0, false, 0, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], local23, 2, 0);
					if (!local266) {
						this.method120(local18, (byte) 5, 1, false, 0, 0, 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], local23, 2, 0);
					}
					this.anInt308 = super.anInt246;
					this.anInt309 = super.anInt247;
					this.anInt311 = 2;
					this.anInt310 = 0;
					this.aClass1_Sub1_Sub3_3.method487(158, this.anInt378);
					this.aClass1_Sub1_Sub3_3.method489(local18 + this.anInt390);
					this.aClass1_Sub1_Sub3_3.method489(local23 + this.anInt391);
					this.aClass1_Sub1_Sub3_3.method489(local33);
					this.aClass1_Sub1_Sub3_3.method489(this.anInt316);
				}
				if (local28 == 581) {
					if ((local33 & 0x3) == 0) {
						anInt331++;
					}
					if (anInt331 >= 99) {
						this.aClass1_Sub1_Sub3_3.method487(222, this.anInt378);
						this.aClass1_Sub1_Sub3_3.method492(0);
					}
					this.method177(local33, local18, 41, local23);
				}
				if (local28 == 951) {
					local194 = Class6.aClass6Array1[local23];
					@Pc(516) boolean local516 = true;
					if (local194.anInt470 > 0) {
						local516 = this.method110(local194);
					}
					if (local516) {
						this.aClass1_Sub1_Sub3_3.method487(21, this.anInt378);
						this.aClass1_Sub1_Sub3_3.method489(local23);
					}
				}
				@Pc(568) long local568;
				@Pc(553) String local553;
				if (local28 == 406 || local28 == 436 || local28 == 557 || local28 == 556) {
					local553 = this.aStringArray1[arg0];
					local212 = local553.indexOf("@whi@");
					if (local212 != -1) {
						local568 = Class49.method679(local553.substring(local212 + 5).trim());
						if (local28 == 406) {
							this.method124(local568);
						}
						if (local28 == 436) {
							this.method157(local568);
						}
						if (local28 == 557) {
							this.method169(local568);
						}
						if (local28 == 556) {
							this.method179(local568);
						}
					}
				}
				if (local28 == 391) {
					this.aClass1_Sub1_Sub3_3.method487(72, this.anInt378);
					this.aClass1_Sub1_Sub3_3.method489(local33);
					this.aClass1_Sub1_Sub3_3.method489(local18);
					this.aClass1_Sub1_Sub3_3.method489(local23);
					this.aClass1_Sub1_Sub3_3.method489(this.anInt316);
					this.anInt264 = 0;
					this.anInt265 = local23;
					this.anInt266 = local18;
					this.anInt267 = 2;
					if (Class6.aClass6Array1[local23].anInt467 == this.anInt379) {
						this.anInt267 = 1;
					}
					if (Class6.aClass6Array1[local23].anInt467 == this.anInt312) {
						this.anInt267 = 3;
					}
				}
				if (local28 == 34) {
					local553 = this.aStringArray1[arg0];
					local212 = local553.indexOf("@whi@");
					if (local212 != -1) {
						this.method106();
						this.aString18 = local553.substring(local212 + 5).trim();
						this.aBoolean52 = false;
						for (@Pc(685) int local685 = 0; local685 < Class6.aClass6Array1.length; local685++) {
							if (Class6.aClass6Array1[local685] != null && Class6.aClass6Array1[local685].anInt470 == 600) {
								this.anInt416 = this.anInt379 = Class6.aClass6Array1[local685].anInt467;
								break;
							}
						}
					}
				}
				if (local28 == 728 || local28 == 542 || local28 == 6 || local28 == 963 || local28 == 245) {
					local53 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
					if (local53 != null) {
						this.method120(local53.anIntArray16[0], (byte) 5, 1, false, 0, 0, 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], local53.anIntArray17[0], 2, 0);
						this.anInt308 = super.anInt246;
						this.anInt309 = super.anInt247;
						this.anInt311 = 2;
						this.anInt310 = 0;
						if (local28 == 542) {
							this.aClass1_Sub1_Sub3_3.method487(133, this.anInt378);
						}
						if (local28 == 963) {
							this.aClass1_Sub1_Sub3_3.method487(6, this.anInt378);
						}
						if (local28 == 728) {
							this.aClass1_Sub1_Sub3_3.method487(223, this.anInt378);
						}
						if (local28 == 6) {
							if ((local33 & 0x3) == 0) {
								anInt337++;
							}
							if (anInt337 >= 124) {
								this.aClass1_Sub1_Sub3_3.method487(69, this.anInt378);
								this.aClass1_Sub1_Sub3_3.method492(0);
							}
							this.aClass1_Sub1_Sub3_3.method487(106, this.anInt378);
						}
						if (local28 == 245) {
							if ((local33 & 0x3) == 0) {
								anInt271++;
							}
							if (anInt271 >= 85) {
								this.aClass1_Sub1_Sub3_3.method487(61, this.anInt378);
								this.aClass1_Sub1_Sub3_3.method489(39596);
							}
							this.aClass1_Sub1_Sub3_3.method487(201, this.anInt378);
						}
						this.aClass1_Sub1_Sub3_3.method489(local33);
					}
				}
				@Pc(892) int local892;
				if (local28 == 679) {
					local553 = this.aStringArray1[arg0];
					local212 = local553.indexOf("@whi@");
					if (local212 != -1) {
						local568 = Class49.method679(local553.substring(local212 + 5).trim());
						local892 = -1;
						for (@Pc(894) int local894 = 0; local894 < this.anInt445; local894++) {
							if (this.aLongArray4[local894] == local568) {
								local892 = local894;
								break;
							}
						}
						if (local892 != -1 && this.anIntArray55[local892] > 0) {
							this.aBoolean65 = true;
							this.aBoolean51 = false;
							this.aBoolean69 = true;
							this.aString14 = "";
							this.anInt338 = 3;
							this.aLong15 = this.aLongArray4[local892];
							this.aString7 = "Enter message to send to " + this.aStringArray2[local892];
						}
					}
				}
				@Pc(959) Class15 local959;
				@Pc(986) String local986;
				if (local28 == 1773) {
					local959 = Class15.method345(local33);
					@Pc(963) Class6 local963 = Class6.aClass6Array1[local23];
					if (local963 != null && local963.anIntArray97[local18] >= 100000) {
						local986 = local963.anIntArray97[local18] + " x " + local959.aString26;
					} else if (local959.aByteArray6 == null) {
						local986 = "It's a " + local959.aString26 + ".";
					} else {
						local986 = new String(local959.aByteArray6);
					}
					this.method121(0, local986, "");
				}
				if (local28 == 367) {
					local119 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
					if (local119 != null) {
						this.method120(local119.anIntArray16[0], (byte) 5, 1, false, 0, 0, 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], local119.anIntArray17[0], 2, 0);
						this.anInt308 = super.anInt246;
						this.anInt309 = super.anInt247;
						this.anInt311 = 2;
						this.anInt310 = 0;
						this.aClass1_Sub1_Sub3_3.method487(143, this.anInt378);
						this.aClass1_Sub1_Sub3_3.method489(local33);
						this.aClass1_Sub1_Sub3_3.method489(this.anInt443);
						this.aClass1_Sub1_Sub3_3.method489(this.anInt441);
						this.aClass1_Sub1_Sub3_3.method489(this.anInt442);
					}
				}
				if (local28 == 660) {
					if (this.aBoolean83) {
						this.aClass39_1.method582(local18 - 4, local23 - 4);
					} else {
						this.aClass39_1.method582(super.anInt246 - 4, super.anInt247 - 4);
					}
				}
				if (local28 == 1607) {
					local53 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
					if (local53 != null) {
						if (local53.aClass13_1.aByteArray5 == null) {
							local986 = "It's a " + local53.aClass13_1.aString25 + ".";
						} else {
							local986 = new String(local53.aClass13_1.aByteArray5);
						}
						this.method121(0, local986, "");
					}
				}
				if (local28 == 900) {
					local53 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
					if (local53 != null) {
						this.method120(local53.anIntArray16[0], (byte) 5, 1, false, 0, 0, 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], local53.anIntArray17[0], 2, 0);
						this.anInt308 = super.anInt246;
						this.anInt309 = super.anInt247;
						this.anInt311 = 2;
						this.anInt310 = 0;
						this.aClass1_Sub1_Sub3_3.method487(247, this.anInt378);
						this.aClass1_Sub1_Sub3_3.method489(local33);
						this.aClass1_Sub1_Sub3_3.method489(this.anInt443);
						this.aClass1_Sub1_Sub3_3.method489(this.anInt441);
						this.aClass1_Sub1_Sub3_3.method489(this.anInt442);
					}
				}
				if (local28 == 55 && this.method177(local33, local18, 175, local23)) {
					this.aClass1_Sub1_Sub3_3.method489(this.anInt316);
				}
				if (local28 == 217) {
					local266 = this.method120(local18, (byte) 5, 0, false, 0, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], local23, 2, 0);
					if (!local266) {
						this.method120(local18, (byte) 5, 1, false, 0, 0, 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], local23, 2, 0);
					}
					this.anInt308 = super.anInt246;
					this.anInt309 = super.anInt247;
					this.anInt311 = 2;
					this.anInt310 = 0;
					this.aClass1_Sub1_Sub3_3.method487(23, this.anInt378);
					this.aClass1_Sub1_Sub3_3.method489(local18 + this.anInt390);
					this.aClass1_Sub1_Sub3_3.method489(local23 + this.anInt391);
					this.aClass1_Sub1_Sub3_3.method489(local33);
					this.aClass1_Sub1_Sub3_3.method489(this.anInt443);
					this.aClass1_Sub1_Sub3_3.method489(this.anInt441);
					this.aClass1_Sub1_Sub3_3.method489(this.anInt442);
				}
				if (local28 == 602 || local28 == 596 || local28 == 22 || local28 == 892 || local28 == 415) {
					if (local28 == 596) {
						this.aClass1_Sub1_Sub3_3.method487(181, this.anInt378);
					}
					if (local28 == 22) {
						this.aClass1_Sub1_Sub3_3.method487(168, this.anInt378);
					}
					if (local28 == 892) {
						if ((local18 & 0x3) == 0) {
							anInt362++;
						}
						if (anInt362 >= 130) {
							this.aClass1_Sub1_Sub3_3.method487(193, this.anInt378);
							this.aClass1_Sub1_Sub3_3.method488(177);
						}
						this.aClass1_Sub1_Sub3_3.method487(134, this.anInt378);
					}
					if (local28 == 602) {
						this.aClass1_Sub1_Sub3_3.method487(82, this.anInt378);
					}
					if (local28 == 415) {
						if ((local23 & 0x3) == 0) {
							anInt319++;
						}
						if (anInt319 >= 55) {
							this.aClass1_Sub1_Sub3_3.method487(104, this.anInt378);
							this.aClass1_Sub1_Sub3_3.method492(0);
						}
						this.aClass1_Sub1_Sub3_3.method487(30, this.anInt378);
					}
					this.aClass1_Sub1_Sub3_3.method489(local33);
					this.aClass1_Sub1_Sub3_3.method489(local18);
					this.aClass1_Sub1_Sub3_3.method489(local23);
					this.anInt264 = 0;
					this.anInt265 = local23;
					this.anInt266 = local18;
					this.anInt267 = 2;
					if (Class6.aClass6Array1[local23].anInt467 == this.anInt379) {
						this.anInt267 = 1;
					}
					if (Class6.aClass6Array1[local23].anInt467 == this.anInt312) {
						this.anInt267 = 3;
					}
				}
				if (local28 == 1102) {
					local959 = Class15.method345(local33);
					if (local959.aByteArray6 == null) {
						local986 = "It's a " + local959.aString26 + ".";
					} else {
						local986 = new String(local959.aByteArray6);
					}
					this.method121(0, local986, "");
				}
				if (local28 == 947) {
					this.method106();
				}
				if (local28 == 450 && this.method177(local33, local18, 8, local23)) {
					this.aClass1_Sub1_Sub3_3.method489(this.anInt443);
					this.aClass1_Sub1_Sub3_3.method489(this.anInt441);
					this.aClass1_Sub1_Sub3_3.method489(this.anInt442);
				}
				@Pc(1588) String local1588;
				if (local28 == 1175) {
					@Pc(1576) int local1576 = local33 >> 14 & 0x7FFF;
					@Pc(1579) Class9 local1579 = Class9.method258(local1576);
					if (local1579.aByteArray4 == null) {
						local1588 = "It's a " + local1579.aString24 + ".";
					} else {
						local1588 = new String(local1579.aByteArray4);
					}
					this.method121(0, local1588, "");
				}
				if (local28 == 188) {
					this.anInt440 = 1;
					this.anInt441 = local18;
					this.anInt442 = local23;
					this.anInt443 = local33;
					this.aString17 = Class15.method345(local33).aString26;
					this.anInt315 = 0;
					this.aBoolean45 = true;
				} else {
					if (local28 == 285) {
						this.method177(local33, local18, 7, local23);
					}
					if (local28 == 930) {
						local194 = Class6.aClass6Array1[local23];
						this.anInt315 = 1;
						this.anInt316 = local23;
						this.anInt317 = local194.anInt494;
						this.anInt440 = 0;
						this.aBoolean45 = true;
						local986 = local194.aString21;
						if (local986.indexOf(" ") != -1) {
							local986 = local986.substring(0, local986.indexOf(" "));
						}
						local1588 = local194.aString21;
						if (local1588.indexOf(" ") != -1) {
							local1588 = local1588.substring(local1588.indexOf(" ") + 1);
						}
						this.aString8 = local986 + " " + local194.aString22 + " " + local1588;
						if (this.anInt317 == 16) {
							this.aBoolean45 = true;
							this.anInt256 = 3;
							this.aBoolean72 = true;
						}
					} else {
						if (local28 == 1373 || local28 == 1544 || local28 == 151 || local28 == 1101) {
							local119 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
							if (local119 != null) {
								this.method120(local119.anIntArray16[0], (byte) 5, 1, false, 0, 0, 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], local119.anIntArray17[0], 2, 0);
								this.anInt308 = super.anInt246;
								this.anInt309 = super.anInt247;
								this.anInt311 = 2;
								this.anInt310 = 0;
								if (local28 == 1544) {
									this.aClass1_Sub1_Sub3_3.method487(184, this.anInt378);
								}
								if (local28 == 1101) {
									this.aClass1_Sub1_Sub3_3.method487(220, this.anInt378);
								}
								if (local28 == 151) {
									anInt449++;
									if (anInt449 >= 90) {
										this.aClass1_Sub1_Sub3_3.method487(162, this.anInt378);
										this.aClass1_Sub1_Sub3_3.method489(31114);
									}
									this.aClass1_Sub1_Sub3_3.method487(239, this.anInt378);
								}
								if (local28 == 1373) {
									this.aClass1_Sub1_Sub3_3.method487(234, this.anInt378);
								}
								this.aClass1_Sub1_Sub3_3.method489(local33);
							}
						}
						if (local28 == 405 || local28 == 38 || local28 == 422 || local28 == 478 || local28 == 347) {
							if (local28 == 347) {
								this.aClass1_Sub1_Sub3_3.method487(68, this.anInt378);
							}
							if (local28 == 478) {
								if ((local18 & 0x3) == 0) {
									anInt451++;
								}
								if (anInt451 >= 90) {
									this.aClass1_Sub1_Sub3_3.method487(62, this.anInt378);
								}
								this.aClass1_Sub1_Sub3_3.method487(101, this.anInt378);
							}
							if (local28 == 405) {
								anInt296 += local33;
								if (anInt296 >= 97) {
									this.aClass1_Sub1_Sub3_3.method487(131, this.anInt378);
									this.aClass1_Sub1_Sub3_3.method491(14953816);
								}
								this.aClass1_Sub1_Sub3_3.method487(154, this.anInt378);
							}
							if (local28 == 422) {
								this.aClass1_Sub1_Sub3_3.method487(177, this.anInt378);
							}
							if (local28 == 38) {
								this.aClass1_Sub1_Sub3_3.method487(196, this.anInt378);
							}
							this.aClass1_Sub1_Sub3_3.method489(local33);
							this.aClass1_Sub1_Sub3_3.method489(local18);
							this.aClass1_Sub1_Sub3_3.method489(local23);
							this.anInt264 = 0;
							this.anInt265 = local23;
							this.anInt266 = local18;
							this.anInt267 = 2;
							if (Class6.aClass6Array1[local23].anInt467 == this.anInt379) {
								this.anInt267 = 1;
							}
							if (Class6.aClass6Array1[local23].anInt467 == this.anInt312) {
								this.anInt267 = 3;
							}
						}
						if (local28 == 881) {
							this.aClass1_Sub1_Sub3_3.method487(130, this.anInt378);
							this.aClass1_Sub1_Sub3_3.method489(local33);
							this.aClass1_Sub1_Sub3_3.method489(local18);
							this.aClass1_Sub1_Sub3_3.method489(local23);
							this.aClass1_Sub1_Sub3_3.method489(this.anInt443);
							this.aClass1_Sub1_Sub3_3.method489(this.anInt441);
							this.aClass1_Sub1_Sub3_3.method489(this.anInt442);
							this.anInt264 = 0;
							this.anInt265 = local23;
							this.anInt266 = local18;
							this.anInt267 = 2;
							if (Class6.aClass6Array1[local23].anInt467 == this.anInt379) {
								this.anInt267 = 1;
							}
							if (Class6.aClass6Array1[local23].anInt467 == this.anInt312) {
								this.anInt267 = 3;
							}
						}
						if (local28 == 504) {
							this.method177(local33, local18, 105, local23);
						}
						if (local28 == 364) {
							this.method177(local33, local18, 192, local23);
						}
						if (local28 == 903 || local28 == 363) {
							local553 = this.aStringArray1[arg0];
							local212 = local553.indexOf("@whi@");
							if (local212 != -1) {
								local553 = local553.substring(local212 + 5).trim();
								local1588 = Class49.method683(Class49.method680(Class49.method679(local553)));
								@Pc(2109) boolean local2109 = false;
								for (local892 = 0; local892 < this.anInt322; local892++) {
									@Pc(2121) Class1_Sub1_Sub1_Sub1_Sub2 local2121 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray46[local892]];
									if (local2121 != null && local2121.aString4 != null && local2121.aString4.equalsIgnoreCase(local1588)) {
										this.method120(local2121.anIntArray16[0], (byte) 5, 1, false, 0, 0, 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], local2121.anIntArray17[0], 2, 0);
										if (local28 == 903) {
											this.aClass1_Sub1_Sub3_3.method487(234, this.anInt378);
										}
										if (local28 == 363) {
											this.aClass1_Sub1_Sub3_3.method487(220, this.anInt378);
										}
										this.aClass1_Sub1_Sub3_3.method489(this.anIntArray46[local892]);
										local2109 = true;
										break;
									}
								}
								if (!local2109) {
									this.method121(0, "Unable to find " + local1588, "");
								}
							}
						}
						if (local28 == 960) {
							this.aClass1_Sub1_Sub3_3.method487(21, this.anInt378);
							this.aClass1_Sub1_Sub3_3.method489(local23);
							local194 = Class6.aClass6Array1[local23];
							if (local194.anIntArrayArray6 != null && local194.anIntArrayArray6[0][0] == 5) {
								local212 = local194.anIntArrayArray6[0][1];
								if (this.anIntArray38[local212] != local194.anIntArray99[0]) {
									this.anIntArray38[local212] = local194.anIntArray99[0];
									this.method208(this.aBoolean76, local212);
									this.aBoolean45 = true;
								}
							}
						}
						if (local28 == 1501) {
							anInt360 += this.anInt391;
							if (anInt360 >= 92) {
								this.aClass1_Sub1_Sub3_3.method487(91, this.anInt378);
								this.aClass1_Sub1_Sub3_3.method492(0);
							}
							this.method177(local33, local18, 169, local23);
						}
						this.anInt440 = 0;
						this.anInt315 = 0;
						this.aBoolean45 = true;
					}
				}
			}
		} catch (@Pc(2306) RuntimeException local2306) {
			signlink.reporterror("68822, " + arg0 + ", " + 3 + ", " + local2306.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method173(@OriginalArg(0) byte arg0) {
		try {
			if (this.anInt318 >= 2 || this.anInt440 != 0 || this.anInt315 != 0) {
				@Pc(31) String local31;
				if (this.anInt440 == 1 && this.anInt318 < 2) {
					local31 = "Use " + this.aString17 + " with...";
				} else if (this.anInt315 == 1 && this.anInt318 < 2) {
					local31 = this.aString8 + "...";
				} else {
					local31 = this.aStringArray1[this.anInt318 - 1];
				}
				if (this.anInt318 > 2) {
					local31 = local31 + "@whi@ / " + (this.anInt318 - 2) + " more options";
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method471(4, 15, 16777215, anInt268 / 1000, local31);
				if (arg0 != 5) {
					this.anInt252 = this.aClass1_Sub1_Sub3_4.method498();
				}
			}
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("59986, " + arg0 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method174() {
		try {
			if (this.anInt349 != 0) {
				@Pc(6) Class1_Sub1_Sub2_Sub4 local6 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(8) int local8 = 0;
				if (this.anInt293 != 0) {
					local8 = 1;
				}
				for (@Pc(20) int local20 = 0; local20 < 100; local20++) {
					if (this.aStringArray5[local20] != null) {
						@Pc(32) int local32 = this.anIntArray90[local20];
						@Pc(37) String local37 = this.aStringArray4[local20];
						@Pc(39) byte local39 = 0;
						if (local37 != null && local37.startsWith("@cr1@")) {
							local37 = local37.substring(5);
							local39 = 1;
						}
						if (local37 != null && local37.startsWith("@cr2@")) {
							local37 = local37.substring(5);
							local39 = 2;
						}
						@Pc(90) int local90;
						if ((local32 == 3 || local32 == 7) && (local32 == 7 || this.anInt387 == 0 || this.anInt387 == 1 && this.method147(local37))) {
							local90 = 329 - local8 * 13;
							local6.method468(4, "From", local90, 0);
							local6.method468(4, "From", local90 - 1, 65535);
							@Pc(115) int local115 = local6.method467((byte) 7, "From ") + 4;
							if (local39 == 1) {
								this.aClass1_Sub1_Sub2_Sub3Array4[0].method445(local90 - 12, this.anInt327, local115);
								local115 += 14;
							}
							if (local39 == 2) {
								this.aClass1_Sub1_Sub2_Sub3Array4[1].method445(local90 - 12, this.anInt327, local115);
								local115 += 14;
							}
							local6.method468(local115, local37 + ": " + this.aStringArray5[local20], local90, 0);
							local6.method468(local115, local37 + ": " + this.aStringArray5[local20], local90 - 1, 65535);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local32 == 5 && this.anInt387 < 2) {
							local90 = 329 - local8 * 13;
							local6.method468(4, this.aStringArray5[local20], local90, 0);
							local6.method468(4, this.aStringArray5[local20], local90 - 1, 65535);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local32 == 6 && this.anInt387 < 2) {
							local90 = 329 - local8 * 13;
							local6.method468(4, "To " + local37 + ": " + this.aStringArray5[local20], local90, 0);
							local6.method468(4, "To " + local37 + ": " + this.aStringArray5[local20], local90 - 1, 65535);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(296) RuntimeException local296) {
			signlink.reporterror("57282, " + 0 + ", " + local296.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method92(@OriginalArg(0) byte arg0) {
		try {
			signlink.reporterror = false;
			try {
				if (this.aClass8_1 != null) {
					this.aClass8_1.method244();
				}
			} catch (@Pc(11) Exception local11) {
			}
			this.aClass8_1 = null;
			this.method226();
			if (this.aClass11_1 != null) {
				this.aClass11_1.aBoolean133 = false;
			}
			this.aClass11_1 = null;
			this.aClass45_Sub1_1.method649();
			this.aClass45_Sub1_1 = null;
			this.aClass1_Sub1_Sub3_3 = null;
			this.aClass1_Sub1_Sub3_2 = null;
			this.aClass1_Sub1_Sub3_4 = null;
			this.anIntArray52 = null;
			this.aByteArrayArray2 = null;
			this.aByteArrayArray1 = null;
			this.anIntArray53 = null;
			this.anIntArray54 = null;
			this.anIntArrayArrayArray3 = null;
			this.aByteArrayArrayArray7 = null;
			this.aClass39_1 = null;
			this.aClass19Array1 = null;
			this.anIntArrayArray2 = null;
			this.anIntArrayArray3 = null;
			this.anIntArray81 = null;
			this.anIntArray82 = null;
			this.aByteArray2 = null;
			this.aClass37_24 = null;
			this.aClass37_25 = null;
			this.aClass37_26 = null;
			this.aClass37_27 = null;
			this.aClass37_21 = null;
			this.aClass37_22 = null;
			this.aClass37_23 = null;
			this.aClass37_12 = null;
			this.aClass37_13 = null;
			this.aClass37_14 = null;
			this.aClass37_15 = null;
			this.aClass37_16 = null;
			this.aClass37_17 = null;
			this.aClass37_18 = null;
			this.aClass37_19 = null;
			this.aClass37_20 = null;
			this.aClass1_Sub1_Sub2_Sub3_18 = null;
			this.aClass1_Sub1_Sub2_Sub3_19 = null;
			this.aClass1_Sub1_Sub2_Sub3_20 = null;
			this.aClass1_Sub1_Sub2_Sub3_15 = null;
			this.aClass1_Sub1_Sub2_Sub3_16 = null;
			this.aClass1_Sub1_Sub2_Sub3_17 = null;
			this.aClass1_Sub1_Sub2_Sub3Array2 = null;
			this.aClass1_Sub1_Sub2_Sub3_8 = null;
			this.aClass1_Sub1_Sub2_Sub3_9 = null;
			this.aClass1_Sub1_Sub2_Sub3_10 = null;
			this.aClass1_Sub1_Sub2_Sub3_11 = null;
			this.aClass1_Sub1_Sub2_Sub3_12 = null;
			this.aClass1_Sub1_Sub2_Sub3_3 = null;
			this.aClass1_Sub1_Sub2_Sub3_4 = null;
			this.aClass1_Sub1_Sub2_Sub3_5 = null;
			this.aClass1_Sub1_Sub2_Sub3_6 = null;
			this.aClass1_Sub1_Sub2_Sub3_7 = null;
			this.aClass1_Sub1_Sub2_Sub2_2 = null;
			this.aClass1_Sub1_Sub2_Sub2Array4 = null;
			this.aClass1_Sub1_Sub2_Sub2Array3 = null;
			this.aClass1_Sub1_Sub2_Sub2Array7 = null;
			this.aClass1_Sub1_Sub2_Sub2_3 = null;
			this.aClass1_Sub1_Sub2_Sub2_4 = null;
			this.aClass1_Sub1_Sub2_Sub2_5 = null;
			this.aClass1_Sub1_Sub2_Sub2_6 = null;
			this.aClass1_Sub1_Sub2_Sub3Array1 = null;
			this.aClass1_Sub1_Sub2_Sub2Array5 = null;
			this.anIntArrayArray5 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub2Array1 = null;
			this.anIntArray46 = null;
			this.anIntArray47 = null;
			this.aClass1_Sub1_Sub3Array1 = null;
			this.anIntArray37 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub1Array1 = null;
			this.anIntArray62 = null;
			this.aClass31ArrayArrayArray1 = null;
			this.aClass31_1 = null;
			this.aClass31_2 = null;
			this.aClass31_3 = null;
			this.anIntArray58 = null;
			this.anIntArray59 = null;
			this.anIntArray60 = null;
			this.anIntArray61 = null;
			this.aStringArray1 = null;
			this.anIntArray38 = null;
			this.anIntArray68 = null;
			this.anIntArray69 = null;
			this.aClass1_Sub1_Sub2_Sub2Array6 = null;
			this.aClass1_Sub1_Sub2_Sub2_1 = null;
			this.aStringArray2 = null;
			this.aLongArray4 = null;
			this.anIntArray55 = null;
			this.aClass37_6 = null;
			this.aClass37_7 = null;
			this.aClass37_3 = null;
			this.aClass37_4 = null;
			this.aClass37_5 = null;
			this.aClass37_8 = null;
			this.aClass37_9 = null;
			this.aClass37_10 = null;
			this.aClass37_11 = null;
			this.method109();
			Class9.method257();
			Class13.method319();
			Class15.method344();
			Class21.aClass21Array1 = null;
			Class23.aClass23Array1 = null;
			Class6.aClass6Array1 = null;
			Class25.aClass25Array1 = null;
			Class27.aClass27Array1 = null;
			Class32.aClass32Array1 = null;
			Class32.aClass42_9 = null;
			Class38.aClass38Array1 = null;
			super.aClass37_2 = null;
			Class1_Sub1_Sub1_Sub1_Sub2.aClass42_1 = null;
			Class1_Sub1_Sub2_Sub1.method370();
			Class39.method543();
			Class1_Sub1_Sub1_Sub5.method284();
			Class14.method326();
			System.gc();
		} catch (@Pc(370) RuntimeException local370) {
			signlink.reporterror("54093, " + 1 + ", " + local370.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!mb;Z)V")
	private void method175(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(13) int local13;
			@Pc(22) int local22;
			@Pc(29) int local29;
			@Pc(32) int local32;
			@Pc(36) int local36;
			@Pc(40) int local40;
			@Pc(45) int local45;
			@Pc(50) int local50;
			if (arg0 == 84 || arg0 == 112) {
				local13 = arg1.method498();
				local22 = this.anInt356 + (local13 >> 4 & 0x7);
				local29 = this.anInt357 + (local13 & 0x7);
				local32 = arg1.method498();
				local36 = local32 >> 2;
				local40 = local32 & 0x3;
				local45 = this.anIntArray88[local36];
				if (arg0 == 112) {
					local50 = -1;
				} else {
					local50 = arg1.method500();
				}
				if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104) {
					this.method135(this.anInt279, local36, local29, 0, -1, local40, local45, local22, local50, 364);
				}
			} else {
				@Pc(140) int local140;
				@Pc(152) int local152;
				@Pc(166) int local166;
				@Pc(178) int local178;
				if (arg0 == 117) {
					local13 = arg1.method498();
					local22 = this.anInt356 + (local13 >> 4 & 0x7);
					local29 = this.anInt357 + (local13 & 0x7);
					local32 = arg1.method498();
					local36 = local32 >> 2;
					local40 = local32 & 0x3;
					local45 = this.anIntArray88[local36];
					local50 = arg1.method500();
					if (local22 >= 0 && local29 >= 0 && local22 < 103 && local29 < 103) {
						local140 = this.anIntArrayArrayArray3[this.anInt279][local22][local29];
						local152 = this.anIntArrayArrayArray3[this.anInt279][local22 + 1][local29];
						local166 = this.anIntArrayArrayArray3[this.anInt279][local22 + 1][local29 + 1];
						local178 = this.anIntArrayArrayArray3[this.anInt279][local22][local29 + 1];
						if (local45 == 0) {
							@Pc(189) Class36 local189 = this.aClass39_1.method566(local29, this.anInt279, local22);
							if (local189 != null) {
								@Pc(198) int local198 = local189.anInt898 >> 14 & 0x7FFF;
								if (local36 == 2) {
									local189.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(local166, local40 + 4, local198, this.aByte22, local152, local140, 2, false, local178, local50);
									local189.aClass1_Sub1_Sub1_8 = new Class1_Sub1_Sub1_Sub2(local166, local40 + 1 & 0x3, local198, this.aByte22, local152, local140, 2, false, local178, local50);
								} else {
									local189.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(local166, local40, local198, this.aByte22, local152, local140, local36, false, local178, local50);
								}
							}
						}
						if (local45 == 1) {
							@Pc(270) Class16 local270 = this.aClass39_1.method567(local22, this.anInt279, this.aByte23, local29);
							if (local270 != null) {
								local270.aClass1_Sub1_Sub1_1 = new Class1_Sub1_Sub1_Sub2(local166, 0, local270.anInt659 >> 14 & 0x7FFF, this.aByte22, local152, local140, 4, false, local178, local50);
							}
						}
						if (local45 == 2) {
							@Pc(305) Class33 local305 = this.aClass39_1.method568(local22, this.anInt279, local29);
							if (local36 == 11) {
								local36 = 10;
							}
							if (local305 != null) {
								local305.aClass1_Sub1_Sub1_6 = new Class1_Sub1_Sub1_Sub2(local166, local40, local305.anInt885 >> 14 & 0x7FFF, this.aByte22, local152, local140, local36, false, local178, local50);
							}
						}
						if (local45 == 3) {
							@Pc(345) Class20 local345 = this.aClass39_1.method569(this.anInt279, local22, local29);
							if (local345 != null) {
								local345.aClass1_Sub1_Sub1_2 = new Class1_Sub1_Sub1_Sub2(local166, local40, local345.anInt719 >> 14 & 0x7FFF, this.aByte22, local152, local140, 22, false, local178, local50);
							}
						}
					}
				} else {
					@Pc(411) Class1_Sub1_Sub1_Sub3 local411;
					if (arg0 == 38) {
						local13 = arg1.method498();
						local22 = this.anInt356 + (local13 >> 4 & 0x7);
						local29 = this.anInt357 + (local13 & 0x7);
						local32 = arg1.method500();
						local36 = arg1.method500();
						if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104) {
							local411 = new Class1_Sub1_Sub1_Sub3();
							local411.anInt497 = local32;
							local411.anInt498 = local36;
							if (this.aClass31ArrayArrayArray1[this.anInt279][local22][local29] == null) {
								this.aClass31ArrayArrayArray1[this.anInt279][local22][local29] = new Class31(aBoolean58);
							}
							this.aClass31ArrayArrayArray1[this.anInt279][local22][local29].method520(local411);
							this.method194(local22, local29);
						}
					} else if (arg0 == 174) {
						local13 = arg1.method498();
						local22 = this.anInt356 + (local13 >> 4 & 0x7);
						local29 = this.anInt357 + (local13 & 0x7);
						local32 = arg1.method500();
						if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104) {
							@Pc(501) Class31 local501 = this.aClass31ArrayArrayArray1[this.anInt279][local22][local29];
							if (local501 != null) {
								for (local411 = (Class1_Sub1_Sub1_Sub3) local501.method523(); local411 != null; local411 = (Class1_Sub1_Sub1_Sub3) local501.method525()) {
									if (local411.anInt497 == (local32 & 0x7FFF)) {
										local411.method669();
										break;
									}
								}
								if (local501.method523() == null) {
									this.aClass31ArrayArrayArray1[this.anInt279][local22][local29] = null;
								}
								this.method194(local22, local29);
							}
						}
					} else if (arg0 == 146) {
						local13 = arg1.method498();
						local22 = this.anInt356 + (local13 >> 4 & 0x7);
						local29 = this.anInt357 + (local13 & 0x7);
						local32 = local22 + arg1.method499();
						local36 = local29 + arg1.method499();
						local40 = arg1.method501();
						local45 = arg1.method500();
						local50 = arg1.method498() * 4;
						local140 = arg1.method498() * 4;
						local152 = arg1.method500();
						local166 = arg1.method500();
						local178 = arg1.method498();
						@Pc(604) int local604 = arg1.method498();
						if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104 && local32 >= 0 && local36 >= 0 && local32 < 104 && local36 < 104) {
							local22 = local22 * 128 + 64;
							local29 = local29 * 128 + 64;
							local32 = local32 * 128 + 64;
							local36 = local36 * 128 + 64;
							@Pc(677) Class1_Sub1_Sub1_Sub4 local677 = new Class1_Sub1_Sub1_Sub4(local152 + anInt268, this.anInt279, local604, local166 + anInt268, local140, local22, local178, 0, local29, local40, local45, this.method168(this.anInt279, local22, local29, 54) - local50);
							local677.method254(local152 + anInt268, local32, local36, this.method168(this.anInt279, local32, local36, 54) - local140);
							this.aClass31_2.method520(local677);
						}
					} else if (arg0 == 82) {
						local13 = arg1.method498();
						local22 = this.anInt356 + (local13 >> 4 & 0x7);
						local29 = this.anInt357 + (local13 & 0x7);
						local32 = arg1.method500();
						local36 = arg1.method498();
						local40 = arg1.method500();
						if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104) {
							local22 = local22 * 128 + 64;
							local29 = local29 * 128 + 64;
							@Pc(773) Class1_Sub1_Sub1_Sub6 local773 = new Class1_Sub1_Sub1_Sub6(this.anInt279, local32, anInt268, 0, this.method168(this.anInt279, local22, local29, 54) - local36, local22, local29, local40);
							this.aClass31_3.method520(local773);
						}
					} else if (arg0 == 31) {
						local13 = arg1.method498();
						local22 = this.anInt356 + (local13 >> 4 & 0x7);
						local29 = this.anInt357 + (local13 & 0x7);
						local32 = arg1.method500();
						local36 = arg1.method500();
						local40 = arg1.method500();
						if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104 && local40 != this.anInt285) {
							@Pc(827) Class1_Sub1_Sub1_Sub3 local827 = new Class1_Sub1_Sub1_Sub3();
							local827.anInt497 = local32;
							local827.anInt498 = local36;
							if (this.aClass31ArrayArrayArray1[this.anInt279][local22][local29] == null) {
								this.aClass31ArrayArrayArray1[this.anInt279][local22][local29] = new Class31(aBoolean58);
							}
							this.aClass31ArrayArrayArray1[this.anInt279][local22][local29].method520(local827);
							this.method194(local22, local29);
						}
					} else {
						if (arg0 == 125) {
							local13 = arg1.method498();
							local22 = this.anInt356 + (local13 >> 4 & 0x7);
							local29 = this.anInt357 + (local13 & 0x7);
							local32 = arg1.method498();
							local36 = local32 >> 2;
							local40 = local32 & 0x3;
							local45 = this.anIntArray88[local36];
							local50 = arg1.method500();
							local140 = arg1.method500();
							local152 = arg1.method500();
							local166 = arg1.method500();
							@Pc(925) byte local925 = arg1.method499();
							@Pc(928) byte local928 = arg1.method499();
							@Pc(931) byte local931 = arg1.method499();
							@Pc(934) byte local934 = arg1.method499();
							@Pc(940) Class1_Sub1_Sub1_Sub1_Sub2 local940;
							if (local166 == this.anInt285) {
								local940 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
							} else {
								local940 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local166];
							}
							if (local940 != null) {
								@Pc(952) Class9 local952 = Class9.method258(local50);
								@Pc(962) int local962 = this.anIntArrayArrayArray3[this.anInt279][local22][local29];
								@Pc(974) int local974 = this.anIntArrayArrayArray3[this.anInt279][local22 + 1][local29];
								@Pc(988) int local988 = this.anIntArrayArrayArray3[this.anInt279][local22 + 1][local29 + 1];
								@Pc(1000) int local1000 = this.anIntArrayArrayArray3[this.anInt279][local22][local29 + 1];
								@Pc(1010) Class1_Sub1_Sub1_Sub5 local1010 = local952.method264(local36, local40, local962, local974, local988, local1000, -1);
								if (local1010 != null) {
									this.method135(this.anInt279, 0, local29, local140 + 1, local152 + 1, 0, local45, local22, -1, 364);
									local940.anInt185 = local140 + anInt268;
									local940.anInt186 = local152 + anInt268;
									local940.aClass1_Sub1_Sub1_Sub5_1 = local1010;
									@Pc(1045) int local1045 = local952.anInt533;
									@Pc(1048) int local1048 = local952.anInt534;
									if (local40 == 1 || local40 == 3) {
										local1045 = local952.anInt534;
										local1048 = local952.anInt533;
									}
									local940.anInt187 = local22 * 128 + local1045 * 64;
									local940.anInt189 = local29 * 128 + local1048 * 64;
									local940.anInt188 = this.method168(this.anInt279, local940.anInt187, local940.anInt189, 54);
									@Pc(1094) byte local1094;
									if (local925 > local931) {
										local1094 = local925;
										local925 = local931;
										local931 = local1094;
									}
									if (local928 > local934) {
										local1094 = local928;
										local928 = local934;
										local934 = local1094;
									}
									local940.anInt190 = local22 + local925;
									local940.anInt192 = local22 + local931;
									local940.anInt191 = local29 + local928;
									local940.anInt193 = local29 + local934;
								}
							}
						}
						if (arg0 == 106) {
							local13 = arg1.method498();
							local22 = this.anInt356 + (local13 >> 4 & 0x7);
							local29 = this.anInt357 + (local13 & 0x7);
							local32 = arg1.method500();
							local36 = arg1.method500();
							local40 = arg1.method500();
							if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104) {
								@Pc(1178) Class31 local1178 = this.aClass31ArrayArrayArray1[this.anInt279][local22][local29];
								if (local1178 != null) {
									for (@Pc(1184) Class1_Sub1_Sub1_Sub3 local1184 = (Class1_Sub1_Sub1_Sub3) local1178.method523(); local1184 != null; local1184 = (Class1_Sub1_Sub1_Sub3) local1178.method525()) {
										if (local1184.anInt497 == (local32 & 0x7FFF) && local1184.anInt498 == local36) {
											local1184.anInt498 = local40;
											break;
										}
									}
									this.method194(local22, local29);
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1214) RuntimeException local1214) {
			signlink.reporterror("84532, " + arg0 + ", " + arg1 + ", " + false + ", " + local1214.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method176(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString9 = "";
				this.aString10 = "Connecting to server...";
				this.method212(true);
			}
			this.aClass8_1 = new Class8(true, this.method186(anInt329 + 43594), this);
			@Pc(30) long local30 = Class49.method679(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass1_Sub1_Sub3_3.anInt796 = 0;
			this.aClass1_Sub1_Sub3_3.method488(14);
			this.aClass1_Sub1_Sub3_3.method488(local37);
			this.aClass8_1.method248(this.aClass1_Sub1_Sub3_3.aByteArray9, 2, 225);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass8_1.method245();
			}
			@Pc(74) int local74 = this.aClass8_1.method245();
			@Pc(217) int local217;
			@Pc(251) int local251;
			if (local74 == 0) {
				this.aClass8_1.method247(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, 8);
				this.aClass1_Sub1_Sub3_4.anInt796 = 0;
				this.aLong17 = this.aClass1_Sub1_Sub3_4.method504();
				@Pc(97) int[] local97 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong17 >> 32), (int) this.aLong17 };
				this.aClass1_Sub1_Sub3_3.anInt796 = 0;
				this.aClass1_Sub1_Sub3_3.method488(10);
				this.aClass1_Sub1_Sub3_3.method492(local97[0]);
				this.aClass1_Sub1_Sub3_3.method492(local97[1]);
				this.aClass1_Sub1_Sub3_3.method492(local97[2]);
				this.aClass1_Sub1_Sub3_3.method492(local97[3]);
				this.aClass1_Sub1_Sub3_3.method492(signlink.anInt954);
				this.aClass1_Sub1_Sub3_3.method495(arg0);
				this.aClass1_Sub1_Sub3_3.method495(arg1);
				this.aClass1_Sub1_Sub3_3.method513(aBigInteger1, aBigInteger2);
				this.aClass1_Sub1_Sub3_2.anInt796 = 0;
				if (arg2) {
					this.aClass1_Sub1_Sub3_2.method488(18);
				} else {
					this.aClass1_Sub1_Sub3_2.method488(16);
				}
				this.aClass1_Sub1_Sub3_2.method488(this.aClass1_Sub1_Sub3_3.anInt796 + 36 + 1 + 1);
				this.aClass1_Sub1_Sub3_2.method488(252);
				this.aClass1_Sub1_Sub3_2.method488(aBoolean57 ? 1 : 0);
				for (local217 = 0; local217 < 9; local217++) {
					this.aClass1_Sub1_Sub3_2.method492(this.anIntArray79[local217]);
				}
				this.aClass1_Sub1_Sub3_2.method496(this.aClass1_Sub1_Sub3_3.aByteArray9, this.aClass1_Sub1_Sub3_3.anInt796);
				this.aClass1_Sub1_Sub3_3.aClass47_2 = new Class47((byte) 123, local97);
				for (local251 = 0; local251 < 4; local251++) {
					local97[local251] += 50;
				}
				this.aClass47_1 = new Class47((byte) 123, local97);
				this.aClass8_1.method248(this.aClass1_Sub1_Sub3_2.aByteArray9, this.aClass1_Sub1_Sub3_2.anInt796, 225);
				local74 = this.aClass8_1.method245();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(293) Exception local293) {
				}
				this.method176(arg0, arg1, arg2);
			} else {
				@Pc(386) int local386;
				if (local74 == 2) {
					this.anInt313 = this.aClass8_1.method245();
					aBoolean86 = this.aClass8_1.method245() == 1;
					Class10.method267();
					this.aLong18 = 0L;
					this.anInt394 = 0;
					this.aClass11_1.anInt577 = 0;
					super.aBoolean43 = true;
					this.aBoolean74 = true;
					this.aBoolean70 = true;
					this.aClass1_Sub1_Sub3_3.anInt796 = 0;
					this.aClass1_Sub1_Sub3_4.anInt796 = 0;
					this.anInt252 = -1;
					this.anInt456 = -1;
					this.anInt457 = -1;
					this.anInt458 = -1;
					this.anInt251 = 0;
					this.anInt253 = 0;
					this.anInt293 = 0;
					this.anInt255 = 0;
					this.anInt373 = 0;
					this.anInt361 = 0;
					this.anInt318 = 0;
					this.aBoolean83 = false;
					super.anInt238 = 0;
					for (local386 = 0; local386 < 100; local386++) {
						this.aStringArray5[local386] = null;
					}
					this.anInt440 = 0;
					this.anInt315 = 0;
					this.anInt288 = 0;
					this.anInt325 = 0;
					this.anInt401 = (int) (Math.random() * 100.0D) - 50;
					this.anInt274 = (int) (Math.random() * 110.0D) - 55;
					this.anInt447 = (int) (Math.random() * 80.0D) - 40;
					this.anInt374 = (int) (Math.random() * 120.0D) - 60;
					this.anInt354 = (int) (Math.random() * 30.0D) - 20;
					this.anInt340 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt407 = -1;
					this.anInt272 = 0;
					this.anInt273 = 0;
					this.anInt322 = 0;
					this.anInt385 = 0;
					for (local217 = 0; local217 < this.anInt320; local217++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local217] = null;
						this.aClass1_Sub1_Sub3Array1[local217] = null;
					}
					for (local251 = 0; local251 < 16384; local251++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local251] = null;
					}
					aClass1_Sub1_Sub1_Sub1_Sub2_1 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anInt321] = new Class1_Sub1_Sub1_Sub1_Sub2();
					this.aClass31_2.method527();
					this.aClass31_3.method527();
					@Pc(528) int local528;
					for (@Pc(524) int local524 = 0; local524 < 4; local524++) {
						for (local528 = 0; local528 < 104; local528++) {
							for (@Pc(532) int local532 = 0; local532 < 104; local532++) {
								this.aClass31ArrayArrayArray1[local524][local528][local532] = null;
							}
						}
					}
					this.aClass31_1 = new Class31(aBoolean58);
					this.anInt446 = 0;
					this.anInt445 = 0;
					this.anInt384 = -1;
					this.anInt312 = -1;
					this.anInt379 = -1;
					this.anInt461 = -1;
					this.anInt351 = -1;
					this.aBoolean80 = false;
					this.anInt256 = 3;
					this.aBoolean51 = false;
					this.aBoolean83 = false;
					this.aBoolean69 = false;
					this.aString12 = null;
					this.anInt413 = 0;
					this.anInt454 = -1;
					this.aBoolean87 = true;
					this.method123();
					for (local528 = 0; local528 < 5; local528++) {
						this.anIntArray40[local528] = 0;
					}
					anInt331 = 0;
					anInt337 = 0;
					anInt296 = 0;
					anInt271 = 0;
					anInt451 = 0;
					anInt360 = 0;
					anInt319 = 0;
					anInt449 = 0;
					anInt362 = 0;
					this.method146(this.anInt283);
				} else if (local74 == 3) {
					this.aString9 = "";
					this.aString10 = "Invalid username or password.";
				} else if (local74 == 4) {
					this.aString9 = "Your account has been disabled.";
					this.aString10 = "Please check your message-centre for details.";
				} else if (local74 == 5) {
					this.aString9 = "Your account is already logged in.";
					this.aString10 = "Try again in 60 secs...";
				} else if (local74 == 6) {
					this.aString9 = "RuneScape has been updated!";
					this.aString10 = "Please reload this page.";
				} else if (local74 == 7) {
					this.aString9 = "This world is full.";
					this.aString10 = "Please use a different world.";
				} else if (local74 == 8) {
					this.aString9 = "Unable to connect.";
					this.aString10 = "Login server offline.";
				} else if (local74 == 9) {
					this.aString9 = "Login limit exceeded.";
					this.aString10 = "Too many connections from your address.";
				} else if (local74 == 10) {
					this.aString9 = "Unable to connect.";
					this.aString10 = "Bad session id.";
				} else if (local74 == 11) {
					this.aString10 = "Login server rejected session.";
					this.aString10 = "Please try again.";
				} else if (local74 == 12) {
					this.aString9 = "You need a members account to login to this world.";
					this.aString10 = "Please subscribe, or use a different world.";
				} else if (local74 == 13) {
					this.aString9 = "Could not complete login.";
					this.aString10 = "Please try using a different world.";
				} else if (local74 == 14) {
					this.aString9 = "The server is being updated.";
					this.aString10 = "Please wait 1 minute and try again.";
				} else if (local74 == 15) {
					this.aBoolean70 = true;
					this.aClass1_Sub1_Sub3_3.anInt796 = 0;
					this.aClass1_Sub1_Sub3_4.anInt796 = 0;
					this.anInt252 = -1;
					this.anInt456 = -1;
					this.anInt457 = -1;
					this.anInt458 = -1;
					this.anInt251 = 0;
					this.anInt253 = 0;
					this.anInt293 = 0;
					this.anInt318 = 0;
					this.aBoolean83 = false;
					this.aLong14 = System.currentTimeMillis();
				} else if (local74 == 16) {
					this.aString9 = "Login attempts exceeded.";
					this.aString10 = "Please wait 1 minute and try again.";
				} else if (local74 == 17) {
					this.aString9 = "You are standing in a members-only area.";
					this.aString10 = "To play on this world move to a free area first";
				} else if (local74 == 20) {
					this.aString9 = "Invalid loginserver requested";
					this.aString10 = "Please try using a different world.";
				} else if (local74 == 21) {
					for (local386 = this.aClass8_1.method245(); local386 >= 0; local386--) {
						this.aString9 = "You have only just left another world";
						this.aString10 = "Your profile will be transfered in: " + local386 + " seconds";
						this.method212(true);
						try {
							Thread.sleep(1000L);
						} catch (@Pc(876) Exception local876) {
						}
					}
					this.method176(arg0, arg1, arg2);
				} else if (local74 == -1) {
					this.aString9 = "No response from server";
					this.aString10 = "Please try using a different world.";
				} else {
					System.out.println("response:" + local74);
					this.aString9 = "Unexpected server response";
					this.aString10 = "Please try using a different world.";
				}
			}
		} catch (@Pc(912) IOException local912) {
			this.aString9 = "";
			this.aString10 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIII)Z")
	private boolean method177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(7) int local7 = arg0 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass39_1.method574(this.anInt279, arg1, arg3, arg0);
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
					local51 = local43.anInt533;
					local54 = local43.anInt534;
				} else {
					local51 = local43.anInt534;
					local54 = local43.anInt533;
				}
				@Pc(65) int local65 = local43.anInt545;
				if (local31 != 0) {
					local65 = (local65 << local31 & 0xF) + (local65 >> 4 - local31);
				}
				this.method120(arg1, (byte) 5, local54, false, 0, local65, local51, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], arg3, 2, 0);
			} else {
				this.method120(arg1, (byte) 5, 0, false, local25 + 1, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], arg3, 2, local31);
			}
			this.anInt308 = super.anInt246;
			this.anInt309 = super.anInt247;
			this.anInt311 = 2;
			this.anInt310 = 0;
			this.aClass1_Sub1_Sub3_3.method487(arg2, this.anInt378);
			this.aClass1_Sub1_Sub3_3.method489(arg1 + this.anInt390);
			this.anInt251 += 0;
			this.aClass1_Sub1_Sub3_3.method489(arg3 + this.anInt391);
			this.aClass1_Sub1_Sub3_3.method489(local7);
			return true;
		} catch (@Pc(172) RuntimeException local172) {
			signlink.reporterror("35297, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + local172.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg5 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg1 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg4;
			@Pc(23) int local23;
			@Pc(27) int local27;
			@Pc(37) int local37;
			if (local5 != 0) {
				local23 = Class1_Sub1_Sub1_Sub5.anIntArray158[local5];
				local27 = Class1_Sub1_Sub1_Sub5.anIntArray159[local5];
				local37 = local27 * 0 - arg4 * local23 >> 16;
				local17 = local23 * 0 + arg4 * local27 >> 16;
				local15 = local37;
			}
			if (local11 != 0) {
				local23 = Class1_Sub1_Sub1_Sub5.anIntArray158[local11];
				local27 = Class1_Sub1_Sub1_Sub5.anIntArray159[local11];
				local37 = local17 * local23 + local27 * 0 >> 16;
				local17 = local17 * local27 - local23 * 0 >> 16;
				local13 = local37;
			}
			this.anInt303 = arg0 - local13;
			this.anInt304 = arg3 - local15;
			this.anInt305 = arg2 - local17;
			this.anInt306 = arg5;
			this.anInt307 = arg1;
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("57048, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + arg5 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(JZ)V")
	private void method179(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt428; local8++) {
					if (this.aLongArray3[local8] == arg0) {
						this.anInt428--;
						this.aBoolean45 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt428; local28++) {
							this.aLongArray3[local28] = this.aLongArray3[local28 + 1];
						}
						this.aClass1_Sub1_Sub3_3.method487(74, this.anInt378);
						this.aClass1_Sub1_Sub3_3.method494(arg0);
						break;
					}
				}
				this.aBoolean70 &= true;
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("43280, " + arg0 + ", " + true + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;I)Z")
	private boolean method180(@OriginalArg(0) Class6 arg0) {
		try {
			if (arg0.anIntArray98 == null) {
				return false;
			}
			for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray98.length; local12++) {
				@Pc(20) int local20 = this.method152(local12, arg0, (byte) 9);
				@Pc(25) int local25 = arg0.anIntArray99[local12];
				if (arg0.anIntArray98[local12] == 2) {
					if (local20 >= local25) {
						return false;
					}
				} else if (arg0.anIntArray98[local12] == 3) {
					if (local20 <= local25) {
						return false;
					}
				} else if (arg0.anIntArray98[local12] == 4) {
					if (local20 == local25) {
						return false;
					}
				} else if (local20 != local25) {
					return false;
				}
			}
			return true;
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("56833, " + arg0 + ", " + -98 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!jb;)V")
	private void method181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub1_Sub2_Sub2 arg2) {
		try {
			@Pc(7) int local7 = this.anInt340 + this.anInt374 & 0x7FF;
			@Pc(15) int local15 = arg1 * arg1 + arg0 * arg0;
			if (local15 <= 6400) {
				@Pc(23) int local23 = Class1_Sub1_Sub1_Sub5.anIntArray158[local7];
				@Pc(27) int local27 = Class1_Sub1_Sub1_Sub5.anIntArray159[local7];
				@Pc(36) int local36 = local23 * 256 / (this.anInt354 + 256);
				@Pc(53) int local53 = local27 * 256 / (this.anInt354 + 256);
				@Pc(63) int local63 = arg0 * local36 + arg1 * local53 >> 16;
				@Pc(73) int local73 = arg0 * local53 - arg1 * local36 >> 16;
				if (local15 > 2500) {
					arg2.method412(local63 + 94 + 4 - arg2.anInt703 / 2, 83 - local73 - arg2.anInt704 / 2 - 4, this.aClass1_Sub1_Sub2_Sub3_19);
				} else {
					arg2.method406(83 - local73 - arg2.anInt704 / 2 - 4, this.anInt327, local63 + 94 + 4 - arg2.anInt703 / 2);
				}
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("14108, " + arg0 + ", " + arg1 + ", " + 4 + ", " + arg2 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIZ)Z")
	private boolean method182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(16) Class6 local16 = Class6.aClass6Array1[arg0];
			for (@Pc(18) int local18 = 0; local18 < local16.anIntArray100.length && local16.anIntArray100[local18] != -1; local18++) {
				@Pc(33) Class6 local33 = Class6.aClass6Array1[local16.anIntArray100[local18]];
				if (local33.anInt468 == 1) {
					local3 |= this.method182(local33.anInt466, arg1);
				}
				if (local33.anInt468 == 6 && (local33.anInt489 != -1 || local33.anInt490 != -1)) {
					@Pc(63) boolean local63 = this.method180(local33);
					@Pc(68) int local68;
					if (local63) {
						local68 = local33.anInt490;
					} else {
						local68 = local33.anInt489;
					}
					if (local68 != -1) {
						@Pc(80) Class27 local80 = Class27.aClass27Array1[local68];
						local33.anInt465 += arg1;
						while (local33.anInt465 > local80.method517(local33.anInt464)) {
							local33.anInt465 -= local80.method517(local33.anInt464) + 1;
							local33.anInt464++;
							if (local33.anInt464 >= local80.anInt830) {
								local33.anInt464 -= local80.anInt831;
								if (local33.anInt464 < 0 || local33.anInt464 >= local80.anInt830) {
									local33.anInt464 = 0;
								}
							}
							local3 = true;
						}
					}
				}
			}
			return local3;
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("87857, " + arg0 + ", " + arg1 + ", " + false + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIILclient!d;)V")
	private void method183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class6 arg5) {
		try {
			if (arg5.anInt468 == 0 && arg5.anIntArray100 != null && !arg5.aBoolean93 && (arg4 >= arg2 && arg1 >= arg3 && arg4 <= arg2 + arg5.anInt471 && arg1 <= arg3 + arg5.anInt472)) {
				@Pc(34) int local34 = arg5.anIntArray100.length;
				for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
					@Pc(45) int local45 = arg5.anIntArray101[local36] + arg2;
					@Pc(54) int local54 = arg5.anIntArray102[local36] + arg3 - arg0;
					@Pc(61) Class6 local61 = Class6.aClass6Array1[arg5.anIntArray100[local36]];
					@Pc(66) int local66 = local45 + local61.anInt473;
					@Pc(71) int local71 = local54 + local61.anInt474;
					if ((local61.anInt475 >= 0 || local61.anInt483 != 0) && arg4 >= local66 && arg1 >= local71 && arg4 < local66 + local61.anInt471 && arg1 < local71 + local61.anInt472) {
						if (local61.anInt475 >= 0) {
							this.anInt295 = local61.anInt475;
						} else {
							this.anInt295 = local61.anInt466;
						}
					}
					if (local61.anInt468 == 0) {
						this.method183(local61.anInt477, arg1, local66, local71, arg4, local61);
						if (local61.anInt476 > local61.anInt472) {
							this.method200(true, local66 + local61.anInt471, local71, local61.anInt476, local61, arg1, arg4, local61.anInt472);
						}
					} else {
						if (local61.anInt469 == 1 && arg4 >= local66 && arg1 >= local71 && arg4 < local66 + local61.anInt471 && arg1 < local71 + local61.anInt472) {
							@Pc(168) boolean local168 = false;
							if (local61.anInt470 != 0) {
								local168 = this.method204(local61);
							}
							if (!local168) {
								this.aStringArray1[this.anInt318] = local61.aString23;
								this.anIntArray60[this.anInt318] = 951;
								this.anIntArray59[this.anInt318] = local61.anInt466;
								this.anInt318++;
							}
						}
						if (local61.anInt469 == 2 && this.anInt315 == 0 && arg4 >= local66 && arg1 >= local71 && arg4 < local66 + local61.anInt471 && arg1 < local71 + local61.anInt472) {
							@Pc(232) String local232 = local61.aString21;
							if (local232.indexOf(" ") != -1) {
								local232 = local232.substring(0, local232.indexOf(" "));
							}
							this.aStringArray1[this.anInt318] = local232 + " @gre@" + local61.aString22;
							this.anIntArray60[this.anInt318] = 930;
							this.anIntArray59[this.anInt318] = local61.anInt466;
							this.anInt318++;
						}
						if (local61.anInt469 == 3 && arg4 >= local66 && arg1 >= local71 && arg4 < local66 + local61.anInt471 && arg1 < local71 + local61.anInt472) {
							this.aStringArray1[this.anInt318] = "Close";
							this.anIntArray60[this.anInt318] = 947;
							this.anIntArray59[this.anInt318] = local61.anInt466;
							this.anInt318++;
						}
						if (local61.anInt469 == 4 && arg4 >= local66 && arg1 >= local71 && arg4 < local66 + local61.anInt471 && arg1 < local71 + local61.anInt472) {
							this.aStringArray1[this.anInt318] = local61.aString23;
							this.anIntArray60[this.anInt318] = 465;
							this.anIntArray59[this.anInt318] = local61.anInt466;
							this.anInt318++;
						}
						if (local61.anInt469 == 5 && arg4 >= local66 && arg1 >= local71 && arg4 < local66 + local61.anInt471 && arg1 < local71 + local61.anInt472) {
							this.aStringArray1[this.anInt318] = local61.aString23;
							this.anIntArray60[this.anInt318] = 960;
							this.anIntArray59[this.anInt318] = local61.anInt466;
							this.anInt318++;
						}
						if (local61.anInt469 == 6 && !this.aBoolean80 && arg4 >= local66 && arg1 >= local71 && arg4 < local66 + local61.anInt471 && arg1 < local71 + local61.anInt472) {
							this.aStringArray1[this.anInt318] = local61.aString23;
							this.anIntArray60[this.anInt318] = 44;
							this.anIntArray59[this.anInt318] = local61.anInt466;
							this.anInt318++;
						}
						if (local61.anInt468 == 2) {
							@Pc(480) int local480 = 0;
							for (@Pc(482) int local482 = 0; local482 < local61.anInt472; local482++) {
								for (@Pc(486) int local486 = 0; local486 < local61.anInt471; local486++) {
									@Pc(497) int local497 = local66 + local486 * (local61.anInt479 + 32);
									@Pc(506) int local506 = local71 + local482 * (local61.anInt480 + 32);
									if (local480 < 20) {
										local497 += local61.anIntArray103[local480];
										local506 += local61.anIntArray104[local480];
									}
									if (arg4 >= local497 && arg1 >= local506 && arg4 < local497 + 32 && arg1 < local506 + 32) {
										this.anInt286 = local480;
										this.anInt287 = local61.anInt466;
										if (local61.anIntArray96[local480] > 0) {
											@Pc(559) Class15 local559 = Class15.method345(local61.anIntArray96[local480] - 1);
											if (this.anInt440 == 1 && local61.aBoolean96) {
												if (local61.anInt466 != this.anInt442 || local480 != this.anInt441) {
													this.aStringArray1[this.anInt318] = "Use " + this.aString17 + " with @lre@" + local559.aString26;
													this.anIntArray60[this.anInt318] = 881;
													this.anIntArray61[this.anInt318] = local559.anInt627;
													this.anIntArray58[this.anInt318] = local480;
													this.anIntArray59[this.anInt318] = local61.anInt466;
													this.anInt318++;
												}
											} else if (this.anInt315 != 1 || !local61.aBoolean96) {
												@Pc(696) int local696;
												if (local61.aBoolean96) {
													for (local696 = 4; local696 >= 3; local696--) {
														if (local559.aStringArray10 != null && local559.aStringArray10[local696] != null) {
															this.aStringArray1[this.anInt318] = local559.aStringArray10[local696] + " @lre@" + local559.aString26;
															if (local696 == 3) {
																this.anIntArray60[this.anInt318] = 478;
															}
															if (local696 == 4) {
																this.anIntArray60[this.anInt318] = 347;
															}
															this.anIntArray61[this.anInt318] = local559.anInt627;
															this.anIntArray58[this.anInt318] = local480;
															this.anIntArray59[this.anInt318] = local61.anInt466;
															this.anInt318++;
														} else if (local696 == 4) {
															this.aStringArray1[this.anInt318] = "Drop @lre@" + local559.aString26;
															this.anIntArray60[this.anInt318] = 347;
															this.anIntArray61[this.anInt318] = local559.anInt627;
															this.anIntArray58[this.anInt318] = local480;
															this.anIntArray59[this.anInt318] = local61.anInt466;
															this.anInt318++;
														}
													}
												}
												if (local61.aBoolean97) {
													this.aStringArray1[this.anInt318] = "Use @lre@" + local559.aString26;
													this.anIntArray60[this.anInt318] = 188;
													this.anIntArray61[this.anInt318] = local559.anInt627;
													this.anIntArray58[this.anInt318] = local480;
													this.anIntArray59[this.anInt318] = local61.anInt466;
													this.anInt318++;
												}
												if (local61.aBoolean96 && local559.aStringArray10 != null) {
													for (local696 = 2; local696 >= 0; local696--) {
														if (local559.aStringArray10[local696] != null) {
															this.aStringArray1[this.anInt318] = local559.aStringArray10[local696] + " @lre@" + local559.aString26;
															if (local696 == 0) {
																this.anIntArray60[this.anInt318] = 405;
															}
															if (local696 == 1) {
																this.anIntArray60[this.anInt318] = 38;
															}
															if (local696 == 2) {
																this.anIntArray60[this.anInt318] = 422;
															}
															this.anIntArray61[this.anInt318] = local559.anInt627;
															this.anIntArray58[this.anInt318] = local480;
															this.anIntArray59[this.anInt318] = local61.anInt466;
															this.anInt318++;
														}
													}
												}
												if (local61.aStringArray6 != null) {
													for (local696 = 4; local696 >= 0; local696--) {
														if (local61.aStringArray6[local696] != null) {
															this.aStringArray1[this.anInt318] = local61.aStringArray6[local696] + " @lre@" + local559.aString26;
															if (local696 == 0) {
																this.anIntArray60[this.anInt318] = 602;
															}
															if (local696 == 1) {
																this.anIntArray60[this.anInt318] = 596;
															}
															if (local696 == 2) {
																this.anIntArray60[this.anInt318] = 22;
															}
															if (local696 == 3) {
																this.anIntArray60[this.anInt318] = 892;
															}
															if (local696 == 4) {
																this.anIntArray60[this.anInt318] = 415;
															}
															this.anIntArray61[this.anInt318] = local559.anInt627;
															this.anIntArray58[this.anInt318] = local480;
															this.anIntArray59[this.anInt318] = local61.anInt466;
															this.anInt318++;
														}
													}
												}
												this.aStringArray1[this.anInt318] = "Examine @lre@" + local559.aString26;
												this.anIntArray60[this.anInt318] = 1773;
												this.anIntArray61[this.anInt318] = local559.anInt627;
												this.anIntArray58[this.anInt318] = local480;
												this.anIntArray59[this.anInt318] = local61.anInt466;
												this.anInt318++;
											} else if ((this.anInt317 & 0x10) == 16) {
												this.aStringArray1[this.anInt318] = this.aString8 + " @lre@" + local559.aString26;
												this.anIntArray60[this.anInt318] = 391;
												this.anIntArray61[this.anInt318] = local559.anInt627;
												this.anIntArray58[this.anInt318] = local480;
												this.anIntArray59[this.anInt318] = local61.anInt466;
												this.anInt318++;
											}
										}
									}
									local480++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1128) RuntimeException local1128) {
			signlink.reporterror("65717, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -381 + ", " + arg4 + ", " + arg5 + ", " + local1128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)I")
	private int method184() {
		try {
			@Pc(3) int local3 = 3;
			if (this.anInt306 < 310) {
				@Pc(18) int local18 = this.anInt303 >> 7;
				@Pc(23) int local23 = this.anInt305 >> 7;
				@Pc(28) int local28 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt134 >> 7;
				@Pc(33) int local33 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt135 >> 7;
				if ((this.aByteArrayArrayArray7[this.anInt279][local18][local23] & 0x4) != 0) {
					local3 = this.anInt279;
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
						if ((this.aByteArrayArrayArray7[this.anInt279][local18][local23] & 0x4) != 0) {
							local3 = this.anInt279;
						}
						local85 += local83;
						if (local85 >= 65536) {
							local85 -= 65536;
							if (local23 < local33) {
								local23++;
							} else if (local23 > local33) {
								local23--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt279][local18][local23] & 0x4) != 0) {
								local3 = this.anInt279;
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
						if ((this.aByteArrayArrayArray7[this.anInt279][local18][local23] & 0x4) != 0) {
							local3 = this.anInt279;
						}
						local85 += local83;
						if (local85 >= 65536) {
							local85 -= 65536;
							if (local18 < local28) {
								local18++;
							} else if (local18 > local28) {
								local18--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt279][local18][local23] & 0x4) != 0) {
								local3 = this.anInt279;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray7[this.anInt279][aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt134 >> 7][aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt135 >> 7] & 0x4) != 0) {
				local3 = this.anInt279;
			}
			return local3;
		} catch (@Pc(251) RuntimeException local251) {
			signlink.reporterror("8180, " + true + ", " + local251.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)I")
	private int method185() {
		try {
			this.anInt251 += 0;
			@Pc(15) int local15 = this.method168(this.anInt279, this.anInt303, this.anInt305, 54);
			return local15 - this.anInt304 >= 800 || (this.aByteArrayArrayArray7[this.anInt279][this.anInt303 >> 7][this.anInt305 >> 7] & 0x4) == 0 ? 3 : this.anInt279;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("6997, " + 0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)Ljava/net/Socket;")
	public Socket method186(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method187() {
		try {
			if (super.anInt245 == 1) {
				if (super.anInt246 >= 6 && super.anInt246 <= 106 && super.anInt247 >= 467 && super.anInt247 <= 499) {
					this.anInt358 = (this.anInt358 + 1) % 4;
					this.aBoolean85 = true;
					this.aBoolean65 = true;
					this.aClass1_Sub1_Sub3_3.method487(94, this.anInt378);
					this.aClass1_Sub1_Sub3_3.method488(this.anInt358);
					this.aClass1_Sub1_Sub3_3.method488(this.anInt387);
					this.aClass1_Sub1_Sub3_3.method488(this.anInt427);
				}
				if (super.anInt246 >= 135 && super.anInt246 <= 235 && super.anInt247 >= 467 && super.anInt247 <= 499) {
					this.anInt387 = (this.anInt387 + 1) % 3;
					this.aBoolean85 = true;
					this.aBoolean65 = true;
					this.aClass1_Sub1_Sub3_3.method487(94, this.anInt378);
					this.aClass1_Sub1_Sub3_3.method488(this.anInt358);
					this.aClass1_Sub1_Sub3_3.method488(this.anInt387);
					this.aClass1_Sub1_Sub3_3.method488(this.anInt427);
				}
				if (super.anInt246 >= 273 && super.anInt246 <= 373 && super.anInt247 >= 467 && super.anInt247 <= 499) {
					this.anInt427 = (this.anInt427 + 1) % 3;
					this.aBoolean85 = true;
					this.aBoolean65 = true;
					this.aClass1_Sub1_Sub3_3.method487(94, this.anInt378);
					this.aClass1_Sub1_Sub3_3.method488(this.anInt358);
					this.aClass1_Sub1_Sub3_3.method488(this.anInt387);
					this.aClass1_Sub1_Sub3_3.method488(this.anInt427);
				}
				if (super.anInt246 >= 412 && super.anInt246 <= 512 && super.anInt247 >= 467 && super.anInt247 <= 499) {
					this.method106();
					this.aString18 = "";
					this.aBoolean52 = false;
					for (@Pc(194) int local194 = 0; local194 < Class6.aClass6Array1.length; local194++) {
						if (Class6.aClass6Array1[local194] != null && Class6.aClass6Array1[local194].anInt470 == 600) {
							this.anInt416 = this.anInt379 = Class6.aClass6Array1[local194].anInt467;
							return;
						}
					}
					return;
				}
			}
		} catch (@Pc(223) RuntimeException local223) {
			signlink.reporterror("74374, " + -70 + ", " + local223.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method188(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			while (true) {
				@Pc(15) Class1_Sub1_Sub4 local15 = this.aClass45_Sub1_1.method659();
				if (local15 == null) {
					return;
				}
				if (local15.anInt826 == 0) {
					Class1_Sub1_Sub1_Sub5.method286(this.aByte14, local15.aByteArray10, local15.anInt827);
					if ((this.aClass45_Sub1_1.method655(local15.anInt827) & 0x62) != 0) {
						this.aBoolean45 = true;
						if (this.anInt312 != -1) {
							this.aBoolean65 = true;
						}
					}
				}
				if (local15.anInt826 == 1 && local15.aByteArray10 != null) {
					Class14.method325(local15.aByteArray10);
				}
				if (local15.anInt826 == 2 && local15.anInt827 == this.anInt343 && local15.aByteArray10 != null) {
					this.method137(local15.aByteArray10, this.anInt425, this.aBoolean60);
				}
				if (local15.anInt826 == 3 && this.anInt288 == 1) {
					for (@Pc(88) int local88 = 0; local88 < this.aByteArrayArray2.length; local88++) {
						if (this.anIntArray53[local88] == local15.anInt827) {
							this.aByteArrayArray2[local88] = local15.aByteArray10;
							if (local15.aByteArray10 == null) {
								this.anIntArray53[local88] = -1;
							}
							break;
						}
						if (this.anIntArray54[local88] == local15.anInt827) {
							this.aByteArrayArray1[local88] = local15.aByteArray10;
							if (local15.aByteArray10 == null) {
								this.anIntArray54[local88] = -1;
							}
							break;
						}
					}
				}
				if (local15.anInt826 == 93 && this.aClass45_Sub1_1.method654(local15.anInt827)) {
					Class4.method60(this.aClass45_Sub1_1, new Class1_Sub1_Sub3(45427, local15.aByteArray10));
				}
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("45538, " + arg0 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!jb;III)V")
	private void method189(@OriginalArg(0) Class1_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg1 * arg1 + arg2 * arg2;
			if (local7 > 4225 && local7 < 90000) {
				@Pc(34) int local34 = this.anInt340 + this.anInt374 & 0x7FF;
				@Pc(38) int local38 = Class1_Sub1_Sub1_Sub5.anIntArray158[local34];
				@Pc(42) int local42 = Class1_Sub1_Sub1_Sub5.anIntArray159[local34];
				@Pc(51) int local51 = local38 * 256 / (this.anInt354 + 256);
				@Pc(60) int local60 = local42 * 256 / (this.anInt354 + 256);
				@Pc(70) int local70 = arg2 * local51 + arg1 * local60 >> 16;
				@Pc(80) int local80 = arg2 * local60 - arg1 * local51 >> 16;
				@Pc(86) double local86 = Math.atan2((double) local70, (double) local80);
				@Pc(92) int local92 = (int) (Math.sin(local86) * 63.0D);
				@Pc(98) int local98 = (int) (Math.cos(local86) * 57.0D);
				this.aClass1_Sub1_Sub2_Sub2_13.method411(83 - local98 - 20, local92 + 94 + 4 - 10, local86);
			} else {
				this.method181(arg2, arg1, arg0);
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("34674, " + arg0 + ", " + arg1 + ", " + 8 + ", " + arg2 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method192() {
		try {
			this.aClass37_27.method538();
			Class1_Sub1_Sub2_Sub1.anIntArray185 = this.anIntArray42;
			this.aClass1_Sub1_Sub2_Sub3_20.method445(0, this.anInt327, 0);
			if (this.aBoolean69) {
				this.aClass1_Sub1_Sub2_Sub4_3.method465(0, this.aString7, 673, 40, 239);
				this.aClass1_Sub1_Sub2_Sub4_3.method465(128, this.aString14 + "*", 673, 60, 239);
			} else if (this.aBoolean51) {
				this.aClass1_Sub1_Sub2_Sub4_3.method465(0, "Enter amount:", 673, 40, 239);
				this.aClass1_Sub1_Sub2_Sub4_3.method465(128, this.aString15 + "*", 673, 60, 239);
			} else if (this.aString12 != null) {
				this.aClass1_Sub1_Sub2_Sub4_3.method465(0, this.aString12, 673, 40, 239);
				this.aClass1_Sub1_Sub2_Sub4_3.method465(128, "Click to continue", 673, 60, 239);
			} else if (this.anInt312 != -1) {
				this.method193(Class6.aClass6Array1[this.anInt312], 0, 0, 0);
			} else if (this.anInt384 == -1) {
				@Pc(131) Class1_Sub1_Sub2_Sub4 local131 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(133) int local133 = 0;
				Class1_Sub1_Sub2.method455(463, 0, 0, 77);
				for (@Pc(141) int local141 = 0; local141 < 100; local141++) {
					if (this.aStringArray5[local141] != null) {
						@Pc(153) int local153 = this.anIntArray90[local141];
						@Pc(162) int local162 = this.anInt370 + 70 - local133 * 14;
						@Pc(167) String local167 = this.aStringArray4[local141];
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
								local131.method468(4, this.aStringArray5[local141], local162, 0);
							}
							local133++;
						}
						@Pc(239) int local239;
						if ((local153 == 1 || local153 == 2) && (local153 == 1 || this.anInt358 == 0 || this.anInt358 == 1 && this.method147(local167))) {
							if (local162 > 0 && local162 < 110) {
								local239 = 4;
								if (local169 == 1) {
									this.aClass1_Sub1_Sub2_Sub3Array4[0].method445(local162 - 12, this.anInt327, 4);
									local239 += 14;
								}
								if (local169 == 2) {
									this.aClass1_Sub1_Sub2_Sub3Array4[1].method445(local162 - 12, this.anInt327, local239);
									local239 += 14;
								}
								local131.method468(local239, local167 + ":", local162, 0);
								local239 += local131.method467((byte) 7, local167) + 8;
								local131.method468(local239, this.aStringArray5[local141], local162, 255);
							}
							local133++;
						}
						if ((local153 == 3 || local153 == 7) && this.anInt349 == 0 && (local153 == 7 || this.anInt387 == 0 || this.anInt387 == 1 && this.method147(local167))) {
							if (local162 > 0 && local162 < 110) {
								local131.method468(4, "From", local162, 0);
								local239 = local131.method467((byte) 7, "From ") + 4;
								if (local169 == 1) {
									this.aClass1_Sub1_Sub2_Sub3Array4[0].method445(local162 - 12, this.anInt327, local239);
									local239 += 14;
								}
								if (local169 == 2) {
									this.aClass1_Sub1_Sub2_Sub3Array4[1].method445(local162 - 12, this.anInt327, local239);
									local239 += 14;
								}
								local131.method468(local239, local167 + ":", local162, 0);
								local239 += local131.method467((byte) 7, local167) + 8;
								local131.method468(local239, this.aStringArray5[local141], local162, 8388608);
							}
							local133++;
						}
						if (local153 == 4 && (this.anInt427 == 0 || this.anInt427 == 1 && this.method147(local167))) {
							if (local162 > 0 && local162 < 110) {
								local131.method468(4, local167 + " " + this.aStringArray5[local141], local162, 8388736);
							}
							local133++;
						}
						if (local153 == 5 && this.anInt349 == 0 && this.anInt387 < 2) {
							if (local162 > 0 && local162 < 110) {
								local131.method468(4, this.aStringArray5[local141], local162, 8388608);
							}
							local133++;
						}
						if (local153 == 6 && this.anInt349 == 0 && this.anInt387 < 2) {
							if (local162 > 0 && local162 < 110) {
								local131.method468(4, "To " + local167 + ":", local162, 0);
								local131.method468(local131.method467((byte) 7, "To " + local167) + 12, this.aStringArray5[local141], local162, 8388608);
							}
							local133++;
						}
						if (local153 == 8 && (this.anInt427 == 0 || this.anInt427 == 1 && this.method147(local167))) {
							if (local162 > 0 && local162 < 110) {
								local131.method468(4, local167 + " " + this.aStringArray5[local141], local162, 8270336);
							}
							local133++;
						}
					}
				}
				Class1_Sub1_Sub2.method454();
				this.anInt459 = local133 * 14 + 7;
				if (this.anInt459 < 78) {
					this.anInt459 = 78;
				}
				this.method225(0, 77, 463, this.anInt459 - this.anInt370 - 77, this.anInt459);
				@Pc(613) String local613;
				if (aClass1_Sub1_Sub1_Sub1_Sub2_1 == null || aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4 == null) {
					local613 = Class49.method683(this.aString5);
				} else {
					local613 = aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4;
				}
				local131.method468(4, local613 + ":", 90, 0);
				local131.method468(local131.method467((byte) 7, local613 + ": ") + 6, this.aString16 + "*", 90, 255);
				Class1_Sub1_Sub2.method461(this.aByte13, 0, 0, 479, 77);
			} else {
				this.method193(Class6.aClass6Array1[this.anInt384], 0, 0, 0);
			}
			if (this.aBoolean83 && this.anInt420 == 2) {
				this.method116();
			}
			this.aClass37_27.method539(17, super.aGraphics2, 357, this.anInt455);
			this.aClass37_26.method538();
			Class1_Sub1_Sub2_Sub1.anIntArray185 = this.anIntArray44;
		} catch (@Pc(703) RuntimeException local703) {
			signlink.reporterror("234, " + 4 + ", " + local703.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;IIII)V")
	private void method193(@OriginalArg(0) Class6 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0.anInt468 == 0 && arg0.anIntArray100 != null && (!arg0.aBoolean93 || this.anInt284 == arg0.anInt466 || this.anInt281 == arg0.anInt466 || this.anInt410 == arg0.anInt466)) {
				@Pc(29) int local29 = Class1_Sub1_Sub2.anInt760;
				@Pc(31) int local31 = Class1_Sub1_Sub2.anInt758;
				@Pc(33) int local33 = Class1_Sub1_Sub2.anInt761;
				@Pc(35) int local35 = Class1_Sub1_Sub2.anInt759;
				Class1_Sub1_Sub2.method455(arg1 + arg0.anInt471, arg1, arg3, arg3 + arg0.anInt472);
				@Pc(56) int local56 = arg0.anIntArray100.length;
				for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
					@Pc(67) int local67 = arg0.anIntArray101[local58] + arg1;
					@Pc(76) int local76 = arg0.anIntArray102[local58] + arg3 - arg2;
					@Pc(83) Class6 local83 = Class6.aClass6Array1[arg0.anIntArray100[local58]];
					@Pc(88) int local88 = local67 + local83.anInt473;
					@Pc(93) int local93 = local76 + local83.anInt474;
					if (local83.anInt470 > 0) {
						this.method153(local83);
					}
					if (local83.anInt468 == 0) {
						if (local83.anInt477 > local83.anInt476 - local83.anInt472) {
							local83.anInt477 = local83.anInt476 - local83.anInt472;
						}
						if (local83.anInt477 < 0) {
							local83.anInt477 = 0;
						}
						this.method193(local83, local88, local83.anInt477, local93);
						if (local83.anInt476 > local83.anInt472) {
							this.method225(local93, local83.anInt472, local88 + local83.anInt471, local83.anInt477, local83.anInt476);
						}
					} else if (local83.anInt468 != 1) {
						@Pc(165) int local165;
						@Pc(169) int local169;
						@Pc(180) int local180;
						@Pc(215) int local215;
						@Pc(222) int local222;
						@Pc(163) int local163;
						@Pc(213) int local213;
						if (local83.anInt468 == 2) {
							local163 = 0;
							for (local165 = 0; local165 < local83.anInt472; local165++) {
								for (local169 = 0; local169 < local83.anInt471; local169++) {
									local180 = local88 + local169 * (local83.anInt479 + 32);
									@Pc(189) int local189 = local93 + local165 * (local83.anInt480 + 32);
									if (local163 < 20) {
										local180 += local83.anIntArray103[local163];
										local189 += local83.anIntArray104[local163];
									}
									if (local83.anIntArray96[local163] > 0) {
										local213 = 0;
										local215 = 0;
										local222 = local83.anIntArray96[local163] - 1;
										if (local180 > Class1_Sub1_Sub2.anInt760 - 32 && local180 < Class1_Sub1_Sub2.anInt761 && local189 > Class1_Sub1_Sub2.anInt758 - 32 && local189 < Class1_Sub1_Sub2.anInt759 || this.anInt365 != 0 && this.anInt364 == local163) {
											@Pc(247) int local247 = 0;
											if (this.anInt440 == 1 && this.anInt441 == local163 && this.anInt442 == local83.anInt466) {
												local247 = 16777215;
											}
											@Pc(271) Class1_Sub1_Sub2_Sub2 local271 = Class15.method351(local247, local83.anIntArray97[local163], local222);
											if (local271 != null) {
												@Pc(350) int local350;
												if (this.anInt365 != 0 && this.anInt364 == local163 && this.anInt363 == local83.anInt466) {
													local213 = super.anInt240 - this.anInt366;
													local215 = super.anInt241 - this.anInt367;
													if (local213 < 5 && local213 > -5) {
														local213 = 0;
													}
													if (local215 < 5 && local215 > -5) {
														local215 = 0;
													}
													if (this.anInt415 < 5) {
														local213 = 0;
														local215 = 0;
													}
													local271.method408(local180 + local213, local189 + local215);
													if (local189 + local215 < Class1_Sub1_Sub2.anInt758 && arg0.anInt477 > 0) {
														local350 = this.anInt398 * (Class1_Sub1_Sub2.anInt758 - local189 - local215) / 3;
														if (local350 > this.anInt398 * 10) {
															local350 = this.anInt398 * 10;
														}
														if (local350 > arg0.anInt477) {
															local350 = arg0.anInt477;
														}
														arg0.anInt477 -= local350;
														this.anInt367 += local350;
													}
													if (local189 + local215 + 32 > Class1_Sub1_Sub2.anInt759 && arg0.anInt477 < arg0.anInt476 - arg0.anInt472) {
														local350 = this.anInt398 * (local189 + local215 + 32 - Class1_Sub1_Sub2.anInt759) / 3;
														if (local350 > this.anInt398 * 10) {
															local350 = this.anInt398 * 10;
														}
														if (local350 > arg0.anInt476 - arg0.anInt472 - arg0.anInt477) {
															local350 = arg0.anInt476 - arg0.anInt472 - arg0.anInt477;
														}
														arg0.anInt477 += local350;
														this.anInt367 -= local350;
													}
												} else if (this.anInt267 != 0 && this.anInt266 == local163 && this.anInt265 == local83.anInt466) {
													local271.method408(local180, local189);
												} else {
													local271.method406(local189, this.anInt327, local180);
												}
												if (local271.anInt703 == 33 || local83.anIntArray97[local163] != 1) {
													local350 = local83.anIntArray97[local163];
													this.aClass1_Sub1_Sub2_Sub4_1.method468(local180 + local213 + 1, method126(local350), local189 + local215 + 10, 0);
													this.aClass1_Sub1_Sub2_Sub4_1.method468(local180 + local213, method126(local350), local189 + local215 + 9, 16776960);
												}
											}
										}
									} else if (local83.aClass1_Sub1_Sub2_Sub2Array8 != null && local163 < 20) {
										@Pc(540) Class1_Sub1_Sub2_Sub2 local540 = local83.aClass1_Sub1_Sub2_Sub2Array8[local163];
										if (local540 != null) {
											local540.method406(local189, this.anInt327, local180);
										}
									}
									local163++;
								}
							}
						} else if (local83.anInt468 == 3) {
							@Pc(567) boolean local567 = false;
							if (this.anInt410 == local83.anInt466 || this.anInt281 == local83.anInt466 || this.anInt284 == local83.anInt466) {
								local567 = true;
							}
							if (this.method180(local83)) {
								local163 = local83.anInt482;
								if (local567 && local83.anInt484 != 0) {
									local163 = local83.anInt484;
								}
							} else {
								local163 = local83.anInt481;
								if (local567 && local83.anInt483 != 0) {
									local163 = local83.anInt483;
								}
							}
							if (local83.aByte28 == 0) {
								if (local83.aBoolean99) {
									Class1_Sub1_Sub2.method458(local93, local88, local163, local83.anInt471, local83.anInt472);
								} else {
									Class1_Sub1_Sub2.method459(local163, local93, local83.anInt471, local83.anInt472, local88);
								}
							} else if (local83.aBoolean99) {
								Class1_Sub1_Sub2.method457(256 - (local83.aByte28 & 0xFF), local83.anInt472, local83.anInt471, local93, local88, local163);
							} else {
								Class1_Sub1_Sub2.method460(local83.anInt472, local93, local83.anInt471, local163, 256 - (local83.aByte28 & 0xFF), local88);
							}
						} else {
							@Pc(685) Class1_Sub1_Sub2_Sub4 local685;
							if (local83.anInt468 == 4) {
								local685 = local83.aClass1_Sub1_Sub2_Sub4_5;
								@Pc(688) String local688 = local83.aString19;
								@Pc(690) boolean local690 = false;
								if (this.anInt410 == local83.anInt466 || this.anInt281 == local83.anInt466 || this.anInt284 == local83.anInt466) {
									local690 = true;
								}
								if (this.method180(local83)) {
									local165 = local83.anInt482;
									if (local690 && local83.anInt484 != 0) {
										local165 = local83.anInt484;
									}
									if (local83.aString20.length() > 0) {
										local688 = local83.aString20;
									}
								} else {
									local165 = local83.anInt481;
									if (local690 && local83.anInt483 != 0) {
										local165 = local83.anInt483;
									}
								}
								if (local83.anInt469 == 6 && this.aBoolean80) {
									local688 = "Please wait...";
									local165 = local83.anInt481;
								}
								if (Class1_Sub1_Sub2.anInt756 == 479) {
									if (local165 == 16776960) {
										local165 = 255;
									}
									if (local165 == 49152) {
										local165 = 16777215;
									}
								}
								local213 = local93 + local685.anInt769;
								while (local688.length() > 0) {
									if (local688.indexOf("%") != -1) {
										label348: while (true) {
											local215 = local688.indexOf("%1");
											if (local215 == -1) {
												while (true) {
													local215 = local688.indexOf("%2");
													if (local215 == -1) {
														while (true) {
															local215 = local688.indexOf("%3");
															if (local215 == -1) {
																while (true) {
																	local215 = local688.indexOf("%4");
																	if (local215 == -1) {
																		while (true) {
																			local215 = local688.indexOf("%5");
																			if (local215 == -1) {
																				break label348;
																			}
																			local688 = local688.substring(0, local215) + this.method213(this.method152(4, local83, (byte) 9)) + local688.substring(local215 + 2);
																		}
																	}
																	local688 = local688.substring(0, local215) + this.method213(this.method152(3, local83, (byte) 9)) + local688.substring(local215 + 2);
																}
															}
															local688 = local688.substring(0, local215) + this.method213(this.method152(2, local83, (byte) 9)) + local688.substring(local215 + 2);
														}
													}
													local688 = local688.substring(0, local215) + this.method213(this.method152(1, local83, (byte) 9)) + local688.substring(local215 + 2);
												}
											}
											local688 = local688.substring(0, local215) + this.method213(this.method152(0, local83, (byte) 9)) + local688.substring(local215 + 2);
										}
									}
									local215 = local688.indexOf("\\n");
									@Pc(962) String local962;
									if (local215 == -1) {
										local962 = local688;
										local688 = "";
									} else {
										local962 = local688.substring(0, local215);
										local688 = local688.substring(local215 + 2);
									}
									if (local83.aBoolean100) {
										local685.method466(local88 + local83.anInt471 / 2, local165, local83.aBoolean101, local213, local962);
									} else {
										local685.method470(local962, local213, local88, local165, local83.aBoolean101);
									}
									local213 += local685.anInt769;
								}
							} else if (local83.anInt468 == 5) {
								@Pc(1024) Class1_Sub1_Sub2_Sub2 local1024;
								if (this.method180(local83)) {
									local1024 = local83.aClass1_Sub1_Sub2_Sub2_15;
								} else {
									local1024 = local83.aClass1_Sub1_Sub2_Sub2_14;
								}
								if (local1024 != null) {
									local1024.method406(local93, this.anInt327, local88);
								}
							} else if (local83.anInt468 == 6) {
								local163 = Class1_Sub1_Sub2_Sub1.anInt674;
								local165 = Class1_Sub1_Sub2_Sub1.anInt675;
								Class1_Sub1_Sub2_Sub1.anInt674 = local88 + local83.anInt471 / 2;
								Class1_Sub1_Sub2_Sub1.anInt675 = local93 + local83.anInt472 / 2;
								local169 = Class1_Sub1_Sub2_Sub1.anIntArray183[local83.anInt492] * local83.anInt491 >> 16;
								local180 = Class1_Sub1_Sub2_Sub1.anIntArray184[local83.anInt492] * local83.anInt491 >> 16;
								@Pc(1086) boolean local1086 = this.method180(local83);
								if (local1086) {
									local213 = local83.anInt490;
								} else {
									local213 = local83.anInt489;
								}
								@Pc(1106) Class1_Sub1_Sub1_Sub5 local1106;
								if (local213 == -1) {
									local1106 = local83.method232(-1, -1, local1086);
								} else {
									@Pc(1112) Class27 local1112 = Class27.aClass27Array1[local213];
									local1106 = local83.method232(local1112.anIntArray227[local83.anInt464], local1112.anIntArray228[local83.anInt464], local1086);
								}
								if (local1106 != null) {
									local1106.method308(local83.anInt493, 0, local83.anInt492, 0, local169, local180);
								}
								Class1_Sub1_Sub2_Sub1.anInt674 = local163;
								Class1_Sub1_Sub2_Sub1.anInt675 = local165;
							} else if (local83.anInt468 == 7) {
								local685 = local83.aClass1_Sub1_Sub2_Sub4_5;
								local165 = 0;
								for (local169 = 0; local169 < local83.anInt472; local169++) {
									for (local180 = 0; local180 < local83.anInt471; local180++) {
										if (local83.anIntArray96[local165] > 0) {
											@Pc(1176) Class15 local1176 = Class15.method345(local83.anIntArray96[local165] - 1);
											@Pc(1179) String local1179 = local1176.aString26;
											if (local1176.aBoolean147 || local83.anIntArray97[local165] != 1) {
												local1179 = local1179 + " x" + method201(local83.anIntArray97[local165]);
											}
											local215 = local88 + local180 * (local83.anInt479 + 115);
											local222 = local93 + local169 * (local83.anInt480 + 12);
											if (local83.aBoolean100) {
												local685.method466(local215 + local83.anInt471 / 2, local83.anInt481, local83.aBoolean101, local222, local1179);
											} else {
												local685.method470(local1179, local222, local215, local83.anInt481, local83.aBoolean101);
											}
										}
										local165++;
									}
								}
							}
						}
					}
				}
				Class1_Sub1_Sub2.method455(local33, local29, local31, local35);
			}
		} catch (@Pc(1275) RuntimeException local1275) {
			signlink.reporterror("34858, " + arg0 + ", " + -640 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local1275.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class31 local9 = this.aClass31ArrayArrayArray1[this.anInt279][arg0][arg1];
		if (local9 == null) {
			this.aClass39_1.method565(this.anInt279, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub1_Sub1_Sub3 local23 = null;
		@Pc(27) Class1_Sub1_Sub1_Sub3 local27;
		for (local27 = (Class1_Sub1_Sub1_Sub3) local9.method523(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub3) local9.method525()) {
			@Pc(32) Class15 local32 = Class15.method345(local27.anInt497);
			@Pc(35) int local35 = local32.anInt636;
			if (local32.aBoolean147) {
				local35 *= local27.anInt498 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method521(local23);
		@Pc(65) Class1_Sub1_Sub1_Sub3 local65 = null;
		@Pc(67) Class1_Sub1_Sub1_Sub3 local67 = null;
		for (local27 = (Class1_Sub1_Sub1_Sub3) local9.method523(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub3) local9.method525()) {
			if (local27.anInt497 != local23.anInt497 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt497 != local23.anInt497 && local27.anInt497 != local65.anInt497 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass39_1.method551(this.anInt279, local110, local65, local23, arg0, local67, arg1, this.method168(this.anInt279, arg0 * 128 + 64, arg1 * 128 + 64, 54));
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method195(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt365 == 0) {
				@Pc(6) int local6 = super.anInt245;
				@Pc(10) boolean local10 = false;
				if (this.anInt315 == 1 && super.anInt246 >= 516 && super.anInt247 >= 160 && super.anInt246 <= 765 && super.anInt247 <= 205) {
					local6 = 0;
				}
				@Pc(41) int local41;
				@Pc(44) int local44;
				@Pc(120) int local120;
				if (this.aBoolean83) {
					if (local6 != 1) {
						local41 = super.anInt240;
						local44 = super.anInt241;
						if (this.anInt420 == 0) {
							local41 -= 4;
							local44 -= 4;
						}
						if (this.anInt420 == 1) {
							local41 -= 553;
							local44 -= 205;
						}
						if (this.anInt420 == 2) {
							local41 -= 17;
							local44 -= 357;
						}
						if (local41 < this.anInt421 - 10 || local41 > this.anInt421 + this.anInt423 + 10 || local44 < this.anInt422 - 10 || local44 > this.anInt422 + this.anInt424 + 10) {
							this.aBoolean83 = false;
							if (this.anInt420 == 1) {
								this.aBoolean45 = true;
							}
							if (this.anInt420 == 2) {
								this.aBoolean65 = true;
							}
						}
					}
					if (local6 == 1) {
						local41 = this.anInt421;
						local44 = this.anInt422;
						local120 = this.anInt423;
						@Pc(123) int local123 = super.anInt246;
						@Pc(126) int local126 = super.anInt247;
						if (this.anInt420 == 0) {
							local123 -= 4;
							local126 -= 4;
						}
						if (this.anInt420 == 1) {
							local123 -= 553;
							local126 -= 205;
						}
						if (this.anInt420 == 2) {
							local123 -= 17;
							local126 -= 357;
						}
						@Pc(145) int local145 = -1;
						for (@Pc(147) int local147 = 0; local147 < this.anInt318; local147++) {
							@Pc(162) int local162 = local44 + (this.anInt318 - 1 - local147) * 15 + 31;
							if (local123 > local41 && local123 < local41 + local120 && local126 > local162 - 13 && local126 < local162 + 3) {
								local145 = local147;
							}
						}
						if (local145 != -1) {
							this.method172(local145);
						}
						this.aBoolean83 = false;
						if (this.anInt420 == 1) {
							this.aBoolean45 = true;
						}
						if (this.anInt420 == 2) {
							this.aBoolean65 = true;
							return;
						}
					}
				} else {
					if (local6 == 1 && this.anInt318 > 0) {
						local41 = this.anIntArray60[this.anInt318 - 1];
						if (local41 == 602 || local41 == 596 || local41 == 22 || local41 == 892 || local41 == 415 || local41 == 405 || local41 == 38 || local41 == 422 || local41 == 478 || local41 == 347 || local41 == 188 || local41 == 1773) {
							local44 = this.anIntArray58[this.anInt318 - 1];
							local120 = this.anIntArray59[this.anInt318 - 1];
							@Pc(282) Class6 local282 = Class6.aClass6Array1[local120];
							if (local282.aBoolean95 || local282.aBoolean98) {
								this.aBoolean66 = false;
								this.anInt415 = 0;
								this.anInt363 = local120;
								this.anInt364 = local44;
								this.anInt365 = 2;
								this.anInt366 = super.anInt246;
								this.anInt367 = super.anInt247;
								if (Class6.aClass6Array1[local120].anInt467 == this.anInt379) {
									this.anInt365 = 1;
								}
								if (Class6.aClass6Array1[local120].anInt467 == this.anInt312) {
									this.anInt365 = 3;
								}
								return;
							}
						}
					}
					if (local6 == 1 && (this.anInt258 == 1 || this.method113(this.anInt318 - 1)) && this.anInt318 > 2) {
						local6 = 2;
					}
					if (local6 == 1 && this.anInt318 > 0) {
						this.method172(this.anInt318 - 1);
					}
					if (local6 != 2 || this.anInt318 <= 0) {
						return;
					}
					this.method211(this.aByte17);
				}
			}
		} catch (@Pc(378) RuntimeException local378) {
			signlink.reporterror("56703, " + arg0 + ", " + local378.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!mb;II)V")
	private void method196(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			arg0.method508(this.anInt414);
			@Pc(10) int local10 = arg0.method509(8);
			@Pc(16) int local16;
			if (local10 < this.anInt385) {
				for (local16 = local10; local16 < this.anInt385; local16++) {
					this.anIntArray37[this.anInt269++] = this.anIntArray62[local16];
				}
			}
			if (local10 > this.anInt385) {
				signlink.reporterror(this.aString5 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt385 = 0;
			for (local16 = 0; local16 < local10; local16++) {
				@Pc(68) int local68 = this.anIntArray62[local16];
				@Pc(73) Class1_Sub1_Sub1_Sub1_Sub1 local73 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local68];
				@Pc(78) int local78 = arg0.method509(1);
				if (local78 == 0) {
					this.anIntArray62[this.anInt385++] = local68;
					local73.anInt174 = anInt268;
				} else {
					@Pc(101) int local101 = arg0.method509(2);
					if (local101 == 0) {
						this.anIntArray62[this.anInt385++] = local68;
						local73.anInt174 = anInt268;
						this.anIntArray47[this.anInt323++] = local68;
					} else {
						@Pc(152) int local152;
						@Pc(162) int local162;
						if (local101 == 1) {
							this.anIntArray62[this.anInt385++] = local68;
							local73.anInt174 = anInt268;
							local152 = arg0.method509(3);
							local73.method47(local152, false);
							local162 = arg0.method509(1);
							if (local162 == 1) {
								this.anIntArray47[this.anInt323++] = local68;
							}
						} else if (local101 == 2) {
							this.anIntArray62[this.anInt385++] = local68;
							local73.anInt174 = anInt268;
							local152 = arg0.method509(3);
							local73.method47(local152, true);
							local162 = arg0.method509(3);
							local73.method47(local162, true);
							@Pc(220) int local220 = arg0.method509(1);
							if (local220 == 1) {
								this.anIntArray47[this.anInt323++] = local68;
							}
						} else if (local101 == 3) {
							this.anIntArray37[this.anInt269++] = local68;
						}
					}
				}
			}
		} catch (@Pc(262) RuntimeException local262) {
			signlink.reporterror("46589, " + arg0 + ", " + 291 + ", " + arg1 + ", " + local262.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt328 = Integer.parseInt(this.getParameter("nodeid"));
		anInt329 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method191();
		} else {
			method118((byte) 4);
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean56 = false;
		} else {
			aBoolean56 = true;
		}
		this.method86();
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method197(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(7) byte[] local7 = this.aClass48_1.method678("title.dat", null);
			@Pc(13) Class1_Sub1_Sub2_Sub2 local13 = new Class1_Sub1_Sub2_Sub2(local7, this);
			this.aClass37_6.method538();
			local13.method404(0, 0);
			this.aClass37_7.method538();
			local13.method404(0, -637);
			this.aClass37_3.method538();
			local13.method404(0, -128);
			this.aClass37_4.method538();
			local13.method404(-371, -202);
			this.aClass37_5.method538();
			local13.method404(-171, -202);
			this.aClass37_8.method538();
			local13.method404(-265, 0);
			this.aClass37_9.method538();
			local13.method404(-265, -562);
			this.aClass37_10.method538();
			local13.method404(-171, -128);
			this.aClass37_11.method538();
			local13.method404(-171, -562);
			@Pc(98) int[] local98 = new int[local13.anInt699];
			for (@Pc(100) int local100 = 0; local100 < local13.anInt700; local100++) {
				for (@Pc(104) int local104 = 0; local104 < local13.anInt699; local104++) {
					local98[local104] = local13.anIntArray210[local13.anInt699 + local13.anInt699 * local100 - local104 - 1];
				}
				for (@Pc(130) int local130 = 0; local130 < local13.anInt699; local130++) {
					local13.anIntArray210[local130 + local13.anInt699 * local100] = local98[local130];
				}
			}
			this.aClass37_6.method538();
			local13.method404(0, 382);
			this.aClass37_7.method538();
			this.aBoolean70 &= arg0;
			local13.method404(0, -255);
			this.aClass37_3.method538();
			local13.method404(0, 254);
			this.aClass37_4.method538();
			local13.method404(-371, 180);
			this.aClass37_5.method538();
			local13.method404(-171, 180);
			this.aClass37_8.method538();
			local13.method404(-265, 382);
			this.aClass37_9.method538();
			local13.method404(-265, -180);
			this.aClass37_10.method538();
			local13.method404(-171, 254);
			this.aClass37_11.method538();
			local13.method404(-171, -180);
			local13 = new Class1_Sub1_Sub2_Sub2(this.aClass48_1, "logo", 0);
			this.aClass37_3.method538();
			local13.method406(18, this.anInt327, 382 - local13.anInt699 / 2 - 128);
			System.gc();
		} catch (@Pc(275) RuntimeException local275) {
			signlink.reporterror("30905, " + arg0 + ", " + local275.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method198() {
		try {
			@Pc(18) int local18 = (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt134 >> 7) + this.anInt390;
			@Pc(26) int local26 = (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt135 >> 7) + this.anInt391;
			if (local18 >= 2944 && local18 < 3392 && local26 >= 3520 && local26 < 6400) {
				this.anInt383 = (local26 - 3520) / 8 + 1;
			} else if (local18 >= 2944 && local18 < 3392 && local26 >= 9920 && local26 < 12800) {
				this.anInt383 = (local26 - 9920) / 8 + 1;
			} else {
				this.anInt383 = 0;
			}
			this.anInt371 = 0;
			if (local18 >= 3328 && local18 < 3392 && local26 >= 3200 && local26 < 3264) {
				@Pc(94) int local94 = local18 & 0x3F;
				@Pc(98) int local98 = local26 & 0x3F;
				if (local94 >= 4 && local94 <= 29 && local98 >= 44 && local98 <= 58) {
					this.anInt371 = 1;
				}
				if (local94 >= 36 && local94 <= 61 && local98 >= 44 && local98 <= 58) {
					this.anInt371 = 1;
				}
				if (local94 >= 4 && local94 <= 29 && local98 >= 25 && local98 <= 39) {
					this.anInt371 = 1;
				}
				if (local94 >= 36 && local94 <= 61 && local98 >= 25 && local98 <= 39) {
					this.anInt371 = 1;
				}
				if (local94 >= 4 && local94 <= 29 && local98 >= 6 && local98 <= 20) {
					this.anInt371 = 1;
				}
				if (local94 >= 36 && local94 <= 61 && local98 >= 6 && local98 <= 20) {
					this.anInt371 = 1;
				}
			}
			if (this.anInt371 == 0 && local18 >= 3328 && local18 <= 3393 && local26 >= 3203 && local26 <= 3325) {
				this.anInt371 = 2;
			}
			this.anInt289 = 0;
			if (local18 >= 3053 && local18 <= 3156 && local26 >= 3056 && local26 <= 3136) {
				this.anInt289 = 1;
			}
			if (local18 >= 3072 && local18 <= 3118 && local26 >= 9492 && local26 <= 9535) {
				this.anInt289 = 1;
			}
			if (this.anInt289 == 1 && local18 >= 3139 && local18 <= 3199 && local26 >= 3008 && local26 <= 3062) {
				this.anInt289 = 0;
			}
		} catch (@Pc(260) RuntimeException local260) {
			signlink.reporterror("19423, " + -24083 + ", " + local260.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!bb;BLclient!mb;I)V")
	private void method199(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub1_Sub2 arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) Class1_Sub1_Sub3 arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(23) int local23;
			if ((arg4 & 0x1) == 1) {
				local23 = arg3.method498();
				@Pc(26) byte[] local26 = new byte[local23];
				@Pc(32) Class1_Sub1_Sub3 local32 = new Class1_Sub1_Sub3(45427, local26);
				arg3.method507(local26, local23);
				this.aClass1_Sub1_Sub3Array1[arg0] = local32;
				arg1.method51(local32);
			}
			@Pc(70) int local70;
			@Pc(82) int local82;
			if ((arg4 & 0x2) == 2) {
				local23 = arg3.method500();
				if (local23 == 65535) {
					local23 = -1;
				}
				if (local23 == arg1.anInt157) {
					arg1.anInt161 = 0;
				}
				local70 = arg3.method498();
				if (local23 == arg1.anInt157 && local23 != -1) {
					local82 = Class27.aClass27Array1[local23].anInt838;
					if (local82 == 1) {
						arg1.anInt158 = 0;
						arg1.anInt159 = 0;
						arg1.anInt160 = local70;
						arg1.anInt161 = 0;
					}
					if (local82 == 2) {
						arg1.anInt161 = 0;
					}
				} else if (local23 == -1 || arg1.anInt157 == -1 || Class27.aClass27Array1[local23].anInt832 >= Class27.aClass27Array1[arg1.anInt157].anInt832) {
					arg1.anInt157 = local23;
					arg1.anInt158 = 0;
					arg1.anInt159 = 0;
					arg1.anInt160 = local70;
					arg1.anInt161 = 0;
					arg1.anInt179 = arg1.anInt177;
				}
			}
			if ((arg4 & 0x4) == 4) {
				arg1.anInt151 = arg3.method500();
				if (arg1.anInt151 == 65535) {
					arg1.anInt151 = -1;
				}
			}
			if ((arg4 & 0x8) == 8) {
				arg1.aString3 = arg3.method505();
				arg1.anInt146 = 0;
				arg1.anInt147 = 0;
				arg1.anInt145 = 150;
				this.method121(2, arg1.aString3, arg1.aString4);
			}
			if ((arg4 & 0x10) == 16) {
				local23 = arg3.method498();
				local70 = arg3.method498();
				arg1.method50(local70, local23);
				arg1.anInt148 = anInt268 + 300;
				arg1.anInt149 = arg3.method498();
				arg1.anInt150 = arg3.method498();
			}
			if ((arg4 & 0x20) == 32) {
				arg1.anInt152 = arg3.method500();
				arg1.anInt153 = arg3.method500();
			}
			if ((arg4 & 0x40) == 64) {
				local23 = arg3.method500();
				local70 = arg3.method498();
				local82 = arg3.method498();
				@Pc(242) int local242 = arg3.anInt796;
				if (arg1.aString4 != null && arg1.aBoolean28) {
					@Pc(252) long local252 = Class49.method679(arg1.aString4);
					@Pc(254) boolean local254 = false;
					if (local70 <= 1) {
						for (@Pc(259) int local259 = 0; local259 < this.anInt428; local259++) {
							if (this.aLongArray3[local259] == local252) {
								local254 = true;
								break;
							}
						}
					}
					if (!local254 && this.anInt289 == 0) {
						try {
							@Pc(287) String local287 = Class2.method40(arg3, local82);
							@Pc(291) String local291 = Class41.method613(local287);
							arg1.aString3 = local291;
							arg1.anInt146 = local23 >> 8;
							arg1.anInt147 = local23 & 0xFF;
							arg1.anInt145 = 150;
							if (local70 == 2 || local70 == 3) {
								this.method121(1, local291, "@cr2@" + arg1.aString4);
							} else if (local70 == 1) {
								this.method121(1, local291, "@cr1@" + arg1.aString4);
							} else {
								this.method121(2, local291, arg1.aString4);
							}
						} catch (@Pc(355) Exception local355) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg3.anInt796 = local242 + local82;
			}
			if ((arg4 & 0x100) == 256) {
				arg1.anInt162 = arg3.method500();
				local23 = arg3.method503();
				arg1.anInt166 = local23 >> 16;
				arg1.anInt165 = anInt268 + (local23 & 0xFFFF);
				arg1.anInt163 = 0;
				arg1.anInt164 = 0;
				if (arg1.anInt165 > anInt268) {
					arg1.anInt163 = -1;
				}
				if (arg1.anInt162 == 65535) {
					arg1.anInt162 = -1;
				}
			}
			if ((arg4 & 0x200) == 512) {
				arg1.anInt167 = arg3.method498();
				arg1.anInt169 = arg3.method498();
				arg1.anInt168 = arg3.method498();
				arg1.anInt170 = arg3.method498();
				arg1.anInt171 = arg3.method500() + anInt268;
				arg1.anInt172 = arg3.method500() + anInt268;
				arg1.anInt173 = arg3.method498();
				arg1.method48();
			}
			if ((arg4 & 0x400) == 1024) {
				local23 = arg3.method498();
				local70 = arg3.method498();
				arg1.method50(local70, local23);
				arg1.anInt148 = anInt268 + 300;
				arg1.anInt149 = arg3.method498();
				arg1.anInt150 = arg3.method498();
			}
		} catch (@Pc(478) RuntimeException local478) {
			signlink.reporterror("56221, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local478.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIIILclient!d;III)V")
	private void method200(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class6 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (this.aBoolean44) {
				this.anInt326 = 32;
			} else {
				this.anInt326 = 0;
			}
			this.aBoolean44 = false;
			if (arg6 >= arg1 && arg6 < arg1 + 16 && arg5 >= arg2 && arg5 < arg2 + 16) {
				arg4.anInt477 -= this.anInt292 * 4;
				if (arg0) {
					this.aBoolean45 = true;
					return;
				}
			} else if (arg6 >= arg1 && arg6 < arg1 + 16 && arg5 >= arg2 + arg7 - 16 && arg5 < arg2 + arg7) {
				arg4.anInt477 += this.anInt292 * 4;
				if (arg0) {
					this.aBoolean45 = true;
					return;
				}
			} else if (arg6 >= arg1 - this.anInt326 && arg6 < arg1 + this.anInt326 + 16 && arg5 >= arg2 + 16 && arg5 < arg2 + arg7 - 16 && this.anInt292 > 0) {
				@Pc(120) int local120 = (arg7 - 32) * arg7 / arg3;
				if (local120 < 8) {
					local120 = 8;
				}
				@Pc(135) int local135 = arg5 - arg2 - local120 / 2 - 16;
				@Pc(141) int local141 = arg7 - local120 - 32;
				arg4.anInt477 = (arg3 - arg7) * local135 / local141;
				if (arg0) {
					this.aBoolean45 = true;
				}
				this.aBoolean44 = true;
			} else {
				return;
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("41780, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 25368 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method202(@OriginalArg(1) int arg0) {
		try {
			@Pc(3) Class6 local3 = Class6.aClass6Array1[arg0];
			for (@Pc(5) int local5 = 0; local5 < local3.anIntArray100.length && local3.anIntArray100[local5] != -1; local5++) {
				@Pc(20) Class6 local20 = Class6.aClass6Array1[local3.anIntArray100[local5]];
				if (local20.anInt468 == 1) {
					this.method202(local20.anInt466);
				}
				local20.anInt464 = 0;
				local20.anInt465 = 0;
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("44000, " + false + ", " + arg0 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!gc;IIII)V")
	private void method203(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (this.anInt257 != 9) {
				this.aBoolean61 = !this.aBoolean61;
			}
			if (this.anInt318 < 400) {
				@Pc(21) String local21 = arg0.aString25;
				if (arg0.anInt601 != 0) {
					local21 = local21 + method190(arg0.anInt601, this.aByte15, aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt183) + " (level-" + arg0.anInt601 + ")";
				}
				if (this.anInt440 == 1) {
					this.aStringArray1[this.anInt318] = "Use " + this.aString17 + " with @yel@" + local21;
					this.anIntArray60[this.anInt318] = 900;
					this.anIntArray61[this.anInt318] = arg1;
					this.anIntArray58[this.anInt318] = arg2;
					this.anIntArray59[this.anInt318] = arg3;
					this.anInt318++;
				} else if (this.anInt315 != 1) {
					@Pc(160) int local160;
					if (arg0.aStringArray8 != null) {
						for (local160 = 4; local160 >= 0; local160--) {
							if (arg0.aStringArray8[local160] != null && !arg0.aStringArray8[local160].equalsIgnoreCase("attack")) {
								this.aStringArray1[this.anInt318] = arg0.aStringArray8[local160] + " @yel@" + local21;
								if (local160 == 0) {
									this.anIntArray60[this.anInt318] = 728;
								}
								if (local160 == 1) {
									this.anIntArray60[this.anInt318] = 542;
								}
								if (local160 == 2) {
									this.anIntArray60[this.anInt318] = 6;
								}
								if (local160 == 3) {
									this.anIntArray60[this.anInt318] = 963;
								}
								if (local160 == 4) {
									this.anIntArray60[this.anInt318] = 245;
								}
								this.anIntArray61[this.anInt318] = arg1;
								this.anIntArray58[this.anInt318] = arg2;
								this.anIntArray59[this.anInt318] = arg3;
								this.anInt318++;
							}
						}
					}
					if (arg0.aStringArray8 != null) {
						for (local160 = 4; local160 >= 0; local160--) {
							if (arg0.aStringArray8[local160] != null && arg0.aStringArray8[local160].equalsIgnoreCase("attack")) {
								@Pc(284) short local284 = 0;
								if (arg0.anInt601 > aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt183) {
									local284 = 2000;
								}
								this.aStringArray1[this.anInt318] = arg0.aStringArray8[local160] + " @yel@" + local21;
								if (local160 == 0) {
									this.anIntArray60[this.anInt318] = local284 + 728;
								}
								if (local160 == 1) {
									this.anIntArray60[this.anInt318] = local284 + 542;
								}
								if (local160 == 2) {
									this.anIntArray60[this.anInt318] = local284 + 6;
								}
								if (local160 == 3) {
									this.anIntArray60[this.anInt318] = local284 + 963;
								}
								if (local160 == 4) {
									this.anIntArray60[this.anInt318] = local284 + 245;
								}
								this.anIntArray61[this.anInt318] = arg1;
								this.anIntArray58[this.anInt318] = arg2;
								this.anIntArray59[this.anInt318] = arg3;
								this.anInt318++;
							}
						}
					}
					this.aStringArray1[this.anInt318] = "Examine @yel@" + local21;
					this.anIntArray60[this.anInt318] = 1607;
					this.anIntArray61[this.anInt318] = arg1;
					this.anIntArray58[this.anInt318] = arg2;
					this.anIntArray59[this.anInt318] = arg3;
					this.anInt318++;
				} else if ((this.anInt317 & 0x2) == 2) {
					this.aStringArray1[this.anInt318] = this.aString8 + " @yel@" + local21;
					this.anIntArray60[this.anInt318] = 265;
					this.anIntArray61[this.anInt318] = arg1;
					this.anIntArray58[this.anInt318] = arg2;
					this.anIntArray59[this.anInt318] = arg3;
					this.anInt318++;
					return;
				}
			}
		} catch (@Pc(434) RuntimeException local434) {
			signlink.reporterror("57523, " + arg0 + ", " + arg1 + ", " + 9 + ", " + arg2 + ", " + arg3 + ", " + local434.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!d;)Z")
	private boolean method204(@OriginalArg(1) Class6 arg0) {
		try {
			@Pc(18) int local18 = arg0.anInt470;
			if (local18 >= 1 && local18 <= 200 || !(local18 < 701 || local18 > 900)) {
				if (local18 >= 801) {
					local18 -= 701;
				} else if (local18 >= 701) {
					local18 -= 601;
				} else if (local18 >= 101) {
					local18 -= 101;
				} else {
					local18--;
				}
				this.aStringArray1[this.anInt318] = "Remove @whi@" + this.aStringArray2[local18];
				this.anIntArray60[this.anInt318] = 557;
				this.anInt318++;
				this.aStringArray1[this.anInt318] = "Message @whi@" + this.aStringArray2[local18];
				this.anIntArray60[this.anInt318] = 679;
				this.anInt318++;
				return true;
			} else if (local18 >= 401 && local18 <= 500) {
				this.aStringArray1[this.anInt318] = "Remove @whi@" + arg0.aString19;
				this.anIntArray60[this.anInt318] = 556;
				this.anInt318++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("98732, " + 9 + ", " + arg0 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method205() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray34[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray34[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray35[local54] = (this.anIntArray34[local54 - 1] + this.anIntArray34[local54 + 1] + this.anIntArray34[local54 - 128] + this.anIntArray34[local54 + 128]) / 4;
				}
			}
			this.anInt411 += 128;
			if (this.anInt411 > this.anIntArray56.length) {
				this.anInt411 -= this.anIntArray56.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method220(this.aClass1_Sub1_Sub2_Sub3Array3[local48]);
			}
			@Pc(172) int local172;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local172 = local54 + (local48 << 7);
					@Pc(195) int local195 = this.anIntArray35[local172 + 128] - this.anIntArray56[local172 + this.anInt411 & this.anIntArray56.length - 1] / 5;
					if (local195 < 0) {
						local195 = 0;
					}
					this.anIntArray34[local172] = local195;
				}
			}
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray50[local54] = this.anIntArray50[local54 + 1];
			}
			this.anIntArray50[255] = (int) (Math.sin((double) anInt268 / 14.0D) * 16.0D + Math.sin((double) anInt268 / 15.0D) * 14.0D + Math.sin((double) anInt268 / 16.0D) * 12.0D);
			if (this.anInt403 > 0) {
				this.anInt403 -= 4;
			}
			if (this.anInt404 > 0) {
				this.anInt404 -= 4;
			}
			if (this.anInt403 == 0 && this.anInt404 == 0) {
				local172 = (int) (Math.random() * 2000.0D);
				if (local172 == 0) {
					this.anInt403 = 1024;
				}
				if (local172 == 1) {
					this.anInt404 = 1024;
					return;
				}
			}
		} catch (@Pc(306) RuntimeException local306) {
			signlink.reporterror("23212, " + -9756 + ", " + local306.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method206() {
		try {
			for (@Pc(11) Class1_Sub2 local11 = (Class1_Sub2) this.aClass31_1.method523(); local11 != null; local11 = (Class1_Sub2) this.aClass31_1.method525()) {
				if (local11.anInt854 == -1) {
					local11.anInt853 = 0;
					this.method170(local11);
				} else {
					local11.method669();
				}
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("50065, " + -102 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!mb;)V")
	private void method207(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(6) int local6 = arg1.method509(8);
			@Pc(12) int local12;
			if (local6 < this.anInt322) {
				for (local12 = local6; local12 < this.anInt322; local12++) {
					this.anIntArray37[this.anInt269++] = this.anIntArray46[local12];
				}
			}
			if (local6 > this.anInt322) {
				signlink.reporterror(this.aString5 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt322 = 0;
			for (local12 = 0; local12 < local6; local12++) {
				@Pc(64) int local64 = this.anIntArray46[local12];
				@Pc(69) Class1_Sub1_Sub1_Sub1_Sub2 local69 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local64];
				@Pc(74) int local74 = arg1.method509(1);
				if (local74 == 0) {
					this.anIntArray46[this.anInt322++] = local64;
					local69.anInt174 = anInt268;
				} else {
					@Pc(97) int local97 = arg1.method509(2);
					if (local97 == 0) {
						this.anIntArray46[this.anInt322++] = local64;
						local69.anInt174 = anInt268;
						this.anIntArray47[this.anInt323++] = local64;
					} else {
						@Pc(148) int local148;
						@Pc(158) int local158;
						if (local97 == 1) {
							this.anIntArray46[this.anInt322++] = local64;
							local69.anInt174 = anInt268;
							local148 = arg1.method509(3);
							local69.method47(local148, false);
							local158 = arg1.method509(1);
							if (local158 == 1) {
								this.anIntArray47[this.anInt323++] = local64;
							}
						} else if (local97 == 2) {
							this.anIntArray46[this.anInt322++] = local64;
							local69.anInt174 = anInt268;
							local148 = arg1.method509(3);
							local69.method47(local148, true);
							local158 = arg1.method509(3);
							local69.method47(local158, true);
							@Pc(216) int local216 = arg1.method509(1);
							if (local216 == 1) {
								this.anIntArray47[this.anInt323++] = local64;
							}
						} else if (local97 == 3) {
							this.anIntArray37[this.anInt269++] = local64;
						}
					}
				}
			}
		} catch (@Pc(260) RuntimeException local260) {
			signlink.reporterror("88894, " + 67 + ", " + arg0 + ", " + arg1 + ", " + local260.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method208(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = Class38.aClass38Array1[arg1].anInt906;
			this.aBoolean70 &= arg0;
			if (local4 != 0) {
				@Pc(18) int local18 = this.anIntArray38[arg1];
				if (local4 == 1) {
					if (local18 == 1) {
						Class1_Sub1_Sub2_Sub1.method379(0.9D);
					}
					if (local18 == 2) {
						Class1_Sub1_Sub2_Sub1.method379(0.8D);
					}
					if (local18 == 3) {
						Class1_Sub1_Sub2_Sub1.method379(0.7D);
					}
					if (local18 == 4) {
						Class1_Sub1_Sub2_Sub1.method379(0.6D);
					}
					Class15.aClass42_8.method643();
					this.aBoolean84 = true;
				}
				if (local4 == 3) {
					@Pc(56) boolean local56 = this.aBoolean73;
					if (local18 == 0) {
						this.method130(0, this.aBoolean73);
						this.aBoolean73 = true;
					}
					if (local18 == 1) {
						this.method130(-400, this.aBoolean73);
						this.aBoolean73 = true;
					}
					if (local18 == 2) {
						this.method130(-800, this.aBoolean73);
						this.aBoolean73 = true;
					}
					if (local18 == 3) {
						this.method130(-1200, this.aBoolean73);
						this.aBoolean73 = true;
					}
					if (local18 == 4) {
						this.aBoolean73 = false;
					}
					if (this.aBoolean73 != local56 && !aBoolean57) {
						if (this.aBoolean73) {
							this.anInt343 = this.anInt399;
							this.aBoolean60 = false;
							this.aClass45_Sub1_1.method657(2, this.anInt343);
						} else {
							this.method226();
						}
						this.anInt377 = 0;
					}
				}
				if (local4 == 4) {
					if (local18 == 0) {
						this.aBoolean59 = true;
						this.method209(742, 0);
					}
					if (local18 == 1) {
						this.aBoolean59 = true;
						this.method209(742, -400);
					}
					if (local18 == 2) {
						this.aBoolean59 = true;
						this.method209(742, -800);
					}
					if (local18 == 3) {
						this.aBoolean59 = true;
						this.method209(742, -1200);
					}
					if (local18 == 4) {
						this.aBoolean59 = false;
					}
				}
				if (local4 == 5) {
					this.anInt258 = local18;
				}
				if (local4 == 6) {
					this.anInt301 = local18;
				}
				if (local4 == 8) {
					this.anInt349 = local18;
					this.aBoolean65 = true;
				}
				if (local4 == 9) {
					this.anInt386 = local18;
				}
			}
		} catch (@Pc(216) RuntimeException local216) {
			signlink.reporterror("45317, " + arg0 + ", " + arg1 + ", " + local216.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)V")
	private void method209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			signlink.anInt962 = arg1;
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("71506, " + arg0 + ", " + arg1 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method210() {
		try {
			if (this.anInt293 > 1) {
				this.anInt293--;
			}
			if (this.anInt255 > 0) {
				this.anInt255--;
			}
			if (this.anInt361 > 0) {
				this.anInt361 -= 2;
			}
			for (@Pc(31) int local31 = 0; local31 < 5 && this.method114(this.aBoolean71); local31++) {
			}
			if (this.aBoolean70) {
				this.method101();
				this.method214();
				this.method155((byte) 2);
				@Pc(60) Class1_Sub1_Sub3 local60 = Class10.method268(this.anInt297);
				if (local60 != null) {
					this.aClass1_Sub1_Sub3_3.method487(253, this.anInt378);
					this.aClass1_Sub1_Sub3_3.method489(local60.anInt796);
					this.aClass1_Sub1_Sub3_3.method496(local60.aByteArray9, local60.anInt796);
					local60.method486();
				}
				this.anInt253++;
				if (this.anInt253 > 750) {
					this.method223();
				}
				this.method108();
				this.method159();
				this.method151();
				this.anInt398++;
				if (this.anInt311 != 0) {
					this.anInt310 += 20;
					if (this.anInt310 >= 400) {
						this.anInt311 = 0;
					}
				}
				if (this.anInt267 != 0) {
					this.anInt264++;
					if (this.anInt264 >= 15) {
						if (this.anInt267 == 2) {
							this.aBoolean45 = true;
						}
						if (this.anInt267 == 3) {
							this.aBoolean65 = true;
						}
						this.anInt267 = 0;
					}
				}
				if (this.anInt365 != 0) {
					this.anInt415++;
					if (super.anInt240 > this.anInt366 + 5 || super.anInt240 < this.anInt366 - 5 || super.anInt241 > this.anInt367 + 5 || super.anInt241 < this.anInt367 - 5) {
						this.aBoolean66 = true;
					}
					if (super.anInt239 == 0) {
						if (this.anInt365 == 2) {
							this.aBoolean45 = true;
						}
						if (this.anInt365 == 3) {
							this.aBoolean65 = true;
						}
						this.anInt365 = 0;
						if (this.aBoolean66 && this.anInt415 >= 5) {
							this.anInt287 = -1;
							this.method145();
							if (this.anInt287 == this.anInt363 && this.anInt286 != this.anInt364) {
								@Pc(247) Class6 local247 = Class6.aClass6Array1[this.anInt363];
								@Pc(249) byte local249 = 0;
								if (this.anInt386 == 1 && local247.anInt470 == 206) {
									local249 = 1;
								}
								if (local247.anIntArray96[this.anInt286] <= 0) {
									local249 = 0;
								}
								@Pc(273) int local273;
								@Pc(276) int local276;
								if (local247.aBoolean98) {
									local273 = this.anInt364;
									local276 = this.anInt286;
									local247.anIntArray96[local276] = local247.anIntArray96[local273];
									local247.anIntArray97[local276] = local247.anIntArray97[local273];
									local247.anIntArray96[local273] = -1;
									local247.anIntArray97[local273] = 0;
								} else if (local249 == 1) {
									local273 = this.anInt364;
									local276 = this.anInt286;
									while (local273 != local276) {
										if (local273 > local276) {
											local247.method231(local273 - 1, local273);
											local273--;
										} else if (local273 < local276) {
											local247.method231(local273 + 1, local273);
											local273++;
										}
									}
								} else {
									local247.method231(this.anInt286, this.anInt364);
								}
								this.aClass1_Sub1_Sub3_3.method487(199, this.anInt378);
								this.aClass1_Sub1_Sub3_3.method489(this.anInt363);
								this.aClass1_Sub1_Sub3_3.method489(this.anInt364);
								this.aClass1_Sub1_Sub3_3.method489(this.anInt286);
								this.aClass1_Sub1_Sub3_3.method488(local249);
							}
						} else if ((this.anInt258 == 1 || this.method113(this.anInt318 - 1)) && this.anInt318 > 2) {
							this.method211(this.aByte17);
						} else if (this.anInt318 > 0) {
							this.method172(this.anInt318 - 1);
						}
						this.anInt264 = 10;
						super.anInt245 = 0;
					}
				}
				anInt344++;
				if (anInt344 > 127) {
					anInt344 = 0;
					this.aClass1_Sub1_Sub3_3.method487(56, this.anInt378);
					this.aClass1_Sub1_Sub3_3.method491(4991788);
				}
				@Pc(440) int local440;
				@Pc(442) int local442;
				if (Class39.anInt937 != -1) {
					local440 = Class39.anInt937;
					local442 = Class39.anInt938;
					@Pc(463) boolean local463 = this.method120(local440, (byte) 5, 0, true, 0, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], local442, 0, 0);
					Class39.anInt937 = -1;
					if (local463) {
						this.anInt308 = super.anInt246;
						this.anInt309 = super.anInt247;
						this.anInt311 = 1;
						this.anInt310 = 0;
					}
				}
				if (super.anInt245 == 1 && this.aString12 != null) {
					this.aString12 = null;
					this.aBoolean65 = true;
					super.anInt245 = 0;
				}
				this.method195(471);
				this.method132();
				this.method218();
				this.method187();
				if (super.anInt239 == 1 || super.anInt245 == 1) {
					this.anInt292++;
				}
				if (this.anInt288 == 2) {
					this.method156();
				}
				if (this.anInt288 == 2 && this.aBoolean78) {
					this.method138();
				}
				for (local440 = 0; local440 < 5; local440++) {
					@Pc(549) int local549 = this.anIntArray85[local440]++;
				}
				this.method150();
				super.anInt238++;
				if (super.anInt238 > 4500) {
					this.anInt255 = 250;
					super.anInt238 -= 500;
					this.aClass1_Sub1_Sub3_3.method487(17, this.anInt378);
				}
				this.anInt418++;
				if (this.anInt418 > 500) {
					this.anInt418 = 0;
					local442 = (int) (Math.random() * 8.0D);
					if ((local442 & 0x1) == 1) {
						this.anInt401 += this.anInt402;
					}
					if ((local442 & 0x2) == 2) {
						this.anInt274 += this.anInt275;
					}
					if ((local442 & 0x4) == 4) {
						this.anInt447 += this.anInt448;
					}
				}
				if (this.anInt401 < -50) {
					this.anInt402 = 2;
				}
				if (this.anInt401 > 50) {
					this.anInt402 = -2;
				}
				if (this.anInt274 < -55) {
					this.anInt275 = 2;
				}
				if (this.anInt274 > 55) {
					this.anInt275 = -2;
				}
				if (this.anInt447 < -40) {
					this.anInt448 = 1;
				}
				if (this.anInt447 > 40) {
					this.anInt448 = -1;
				}
				this.anInt452++;
				if (this.anInt452 > 500) {
					this.anInt452 = 0;
					local442 = (int) (Math.random() * 8.0D);
					if ((local442 & 0x1) == 1) {
						this.anInt374 += this.anInt375;
					}
					if ((local442 & 0x2) == 2) {
						this.anInt354 += this.anInt355;
					}
				}
				if (this.anInt374 < -60) {
					this.anInt375 = 2;
				}
				if (this.anInt374 > 60) {
					this.anInt375 = -2;
				}
				if (this.anInt354 < -20) {
					this.anInt355 = 1;
				}
				if (this.anInt354 > 10) {
					this.anInt355 = -1;
				}
				anInt380++;
				if (anInt380 > 110) {
					anInt380 = 0;
					this.aClass1_Sub1_Sub3_3.method487(219, this.anInt378);
					this.aClass1_Sub1_Sub3_3.method492(0);
				}
				this.anInt254++;
				if (this.anInt254 > 50) {
					this.aClass1_Sub1_Sub3_3.method487(139, this.anInt378);
				}
				try {
					if (this.aClass8_1 != null && this.aClass1_Sub1_Sub3_3.anInt796 > 0) {
						this.aClass8_1.method248(this.aClass1_Sub1_Sub3_3.aByteArray9, this.aClass1_Sub1_Sub3_3.anInt796, 225);
						this.aClass1_Sub1_Sub3_3.anInt796 = 0;
						this.anInt254 = 0;
					}
				} catch (@Pc(820) IOException local820) {
					this.method223();
				} catch (@Pc(825) Exception local825) {
					this.method136();
				}
			}
		} catch (@Pc(830) RuntimeException local830) {
			signlink.reporterror("19763, " + 4 + ", " + local830.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
	private void method211(@OriginalArg(0) byte arg0) {
		try {
			@Pc(7) int local7 = this.aClass1_Sub1_Sub2_Sub4_3.method467((byte) 7, "Choose Option");
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt318; local9++) {
				local20 = this.aClass1_Sub1_Sub2_Sub4_3.method467((byte) 7, this.aStringArray1[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			local7 += 8;
			if (arg0 != -15) {
				this.method90();
			}
			local20 = this.anInt318 * 15 + 21;
			@Pc(68) int local68;
			@Pc(86) int local86;
			if (super.anInt246 > 4 && super.anInt247 > 4 && super.anInt246 < 516 && super.anInt247 < 338) {
				local68 = super.anInt246 - local7 / 2 - 4;
				if (local68 + local7 > 512) {
					local68 = 512 - local7;
				}
				if (local68 < 0) {
					local68 = 0;
				}
				local86 = super.anInt247 - 4;
				if (local86 + local20 > 334) {
					local86 = 334 - local20;
				}
				if (local86 < 0) {
					local86 = 0;
				}
				this.aBoolean83 = true;
				this.anInt420 = 0;
				this.anInt421 = local68;
				this.anInt422 = local86;
				this.anInt423 = local7;
				this.anInt424 = this.anInt318 * 15 + 22;
			}
			if (super.anInt246 > 553 && super.anInt247 > 205 && super.anInt246 < 743 && super.anInt247 < 466) {
				local68 = super.anInt246 - local7 / 2 - 553;
				if (local68 < 0) {
					local68 = 0;
				} else if (local68 + local7 > 190) {
					local68 = 190 - local7;
				}
				local86 = super.anInt247 - 205;
				if (local86 < 0) {
					local86 = 0;
				} else if (local86 + local20 > 261) {
					local86 = 261 - local20;
				}
				this.aBoolean83 = true;
				this.anInt420 = 1;
				this.anInt421 = local68;
				this.anInt422 = local86;
				this.anInt423 = local7;
				this.anInt424 = this.anInt318 * 15 + 22;
			}
			if (super.anInt246 > 17 && super.anInt247 > 357 && super.anInt246 < 496 && super.anInt247 < 453) {
				local68 = super.anInt246 - local7 / 2 - 17;
				if (local68 < 0) {
					local68 = 0;
				} else if (local68 + local7 > 479) {
					local68 = 479 - local7;
				}
				local86 = super.anInt247 - 357;
				if (local86 < 0) {
					local86 = 0;
				} else if (local86 + local20 > 96) {
					local86 = 96 - local20;
				}
				this.aBoolean83 = true;
				this.anInt420 = 2;
				this.anInt421 = local68;
				this.anInt422 = local86;
				this.anInt423 = local7;
				this.anInt424 = this.anInt318 * 15 + 22;
			}
		} catch (@Pc(290) RuntimeException local290) {
			signlink.reporterror("52672, " + arg0 + ", " + local290.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ZI)V")
	private void method212(@OriginalArg(0) boolean arg0) {
		try {
			this.method99();
			this.aClass37_5.method538();
			this.aClass1_Sub1_Sub2_Sub3_1.method445(0, this.anInt327, 0);
			@Pc(52) byte local52;
			@Pc(64) int local64;
			if (this.anInt400 == 0) {
				this.aClass1_Sub1_Sub2_Sub4_1.method466(180, 7711145, true, 180, this.aClass45_Sub1_1.aString31);
				local52 = 80;
				this.aClass1_Sub1_Sub2_Sub4_3.method466(180, 16776960, true, 80, "Welcome to RuneScape");
				local64 = local52 + 30;
				this.aClass1_Sub1_Sub2_Sub3_2.method445(100, this.anInt327, 27);
				this.aClass1_Sub1_Sub2_Sub4_3.method466(100, 16777215, true, 125, "New user");
				this.aClass1_Sub1_Sub2_Sub3_2.method445(100, this.anInt327, 187);
				this.aClass1_Sub1_Sub2_Sub4_3.method466(260, 16777215, true, 125, "Existing User");
			}
			if (this.anInt400 == 2) {
				local52 = 60;
				if (this.aString9.length() > 0) {
					this.aClass1_Sub1_Sub2_Sub4_3.method466(180, 16776960, true, 45, this.aString9);
					this.aClass1_Sub1_Sub2_Sub4_3.method466(180, 16776960, true, 60, this.aString10);
					local64 = local52 + 30;
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method466(180, 16776960, true, 53, this.aString10);
					local64 = local52 + 30;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method470("Username: " + this.aString5 + (this.anInt412 == 0 & anInt268 % 40 < 20 ? "@yel@|" : ""), 90, 90, 16777215, true);
				local64 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method470("Password: " + Class49.method685(this.aString6) + (this.anInt412 == 1 & anInt268 % 40 < 20 ? "@yel@|" : ""), 105, 92, 16777215, true);
				local64 += 15;
				if (!arg0) {
					this.aClass1_Sub1_Sub2_Sub3_2.method445(130, this.anInt327, 27);
					this.aClass1_Sub1_Sub2_Sub4_3.method466(100, 16777215, true, 155, "Login");
					this.aClass1_Sub1_Sub2_Sub3_2.method445(130, this.anInt327, 187);
					this.aClass1_Sub1_Sub2_Sub4_3.method466(260, 16777215, true, 155, "Cancel");
				}
			}
			if (this.anInt400 == 3) {
				this.aClass1_Sub1_Sub2_Sub4_3.method466(180, 16776960, true, 40, "Create a free account");
				local52 = 65;
				this.aClass1_Sub1_Sub2_Sub4_3.method466(180, 16777215, true, 65, "To create a new account you need to");
				local64 = local52 + 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method466(180, 16777215, true, 80, "go back to the main RuneScape webpage");
				local64 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method466(180, 16777215, true, 95, "and choose the red 'create account'");
				local64 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method466(180, 16777215, true, 110, "button at the top right of that page.");
				local64 += 15;
				this.aClass1_Sub1_Sub2_Sub3_2.method445(130, this.anInt327, 107);
				this.aClass1_Sub1_Sub2_Sub4_3.method466(180, 16777215, true, 155, "Cancel");
			}
			this.aClass37_5.method539(202, super.aGraphics2, 171, this.anInt455);
			if (this.aBoolean84) {
				this.aBoolean84 = false;
				this.aClass37_3.method539(128, super.aGraphics2, 0, this.anInt455);
				this.aClass37_4.method539(202, super.aGraphics2, 371, this.anInt455);
				this.aClass37_8.method539(0, super.aGraphics2, 265, this.anInt455);
				this.aClass37_9.method539(562, super.aGraphics2, 265, this.anInt455);
				this.aClass37_10.method539(128, super.aGraphics2, 171, this.anInt455);
				this.aClass37_11.method539(562, super.aGraphics2, 171, this.anInt455);
			}
		} catch (@Pc(509) RuntimeException local509) {
			signlink.reporterror("62013, " + arg0 + ", " + 0 + ", " + local509.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(II)Ljava/lang/String;")
	private String method213(@OriginalArg(0) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("22819, " + arg0 + ", " + 9 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method214() {
		try {
			if (this.anInt288 == 2) {
				for (@Pc(20) Class1_Sub2 local20 = (Class1_Sub2) this.aClass31_1.method523(); local20 != null; local20 = (Class1_Sub2) this.aClass31_1.method525()) {
					if (local20.anInt854 > 0) {
						local20.anInt854--;
					}
					if (local20.anInt854 != 0) {
						if (local20.anInt853 > 0) {
							local20.anInt853--;
						}
						if (local20.anInt853 == 0 && local20.anInt845 >= 1 && local20.anInt846 >= 1 && local20.anInt845 <= 102 && local20.anInt846 <= 102 && (local20.anInt850 < 0 || Class4.method73(local20.anInt850, local20.anInt852))) {
							this.method144(local20.anInt850, local20.anInt852, local20.anInt846, local20.anInt843, local20.anInt851, local20.anInt844, local20.anInt845);
							local20.anInt853 = -1;
							if (local20.anInt850 == local20.anInt847 && local20.anInt847 == -1) {
								local20.method669();
							} else if (local20.anInt850 == local20.anInt847 && local20.anInt851 == local20.anInt848 && local20.anInt852 == local20.anInt849) {
								local20.method669();
							}
						}
					} else if (local20.anInt847 < 0 || Class4.method73(local20.anInt847, local20.anInt849)) {
						this.method144(local20.anInt847, local20.anInt849, local20.anInt846, local20.anInt843, local20.anInt848, local20.anInt844, local20.anInt845);
						local20.method669();
					}
				}
				anInt376++;
				if (anInt376 > 85) {
					anInt376 = 0;
					this.aClass1_Sub1_Sub3_3.method487(211, this.anInt378);
					return;
				}
			}
		} catch (@Pc(178) RuntimeException local178) {
			signlink.reporterror("73459, " + -427 + ", " + local178.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
	private void method215(@OriginalArg(0) byte arg0) {
		try {
			this.aClass37_25.method538();
			@Pc(13) int local13 = this.anInt340 + this.anInt374 & 0x7FF;
			@Pc(20) int local20 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt134 / 32 + 48;
			if (arg0 == 6) {
				@Pc(25) boolean local25 = false;
			} else {
				this.anInt378 = 447;
			}
			@Pc(37) int local37 = 464 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt135 / 32;
			this.aClass1_Sub1_Sub2_Sub2_1.method410(5, local20, this.anIntArray51, this.aBoolean77, 151, 146, local37, local13, 25, this.anInt354 + 256, this.anIntArray86);
			this.aClass1_Sub1_Sub2_Sub2_2.method410(0, 25, this.anIntArray77, this.aBoolean77, 33, 33, 25, this.anInt340, 0, 256, this.anIntArray65);
			for (@Pc(77) int local77 = 0; local77 < this.anInt397; local77++) {
				local20 = this.anIntArray68[local77] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt134 / 32;
				local37 = this.anIntArray69[local77] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt135 / 32;
				this.method181(local37, local20, this.aClass1_Sub1_Sub2_Sub2Array6[local77]);
			}
			@Pc(127) int local127;
			for (@Pc(123) int local123 = 0; local123 < 104; local123++) {
				for (local127 = 0; local127 < 104; local127++) {
					@Pc(139) Class31 local139 = this.aClass31ArrayArrayArray1[this.anInt279][local123][local127];
					if (local139 != null) {
						local20 = local123 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt134 / 32;
						local37 = local127 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt135 / 32;
						this.method181(local37, local20, this.aClass1_Sub1_Sub2_Sub2_3);
					}
				}
			}
			for (local127 = 0; local127 < this.anInt385; local127++) {
				@Pc(190) Class1_Sub1_Sub1_Sub1_Sub1 local190 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray62[local127]];
				if (local190 != null && local190.method49() && local190.aClass13_1.aBoolean139) {
					local20 = local190.anInt134 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt134 / 32;
					local37 = local190.anInt135 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt135 / 32;
					this.method181(local37, local20, this.aClass1_Sub1_Sub2_Sub2_4);
				}
			}
			@Pc(244) Class1_Sub1_Sub1_Sub1_Sub2 local244;
			for (@Pc(234) int local234 = 0; local234 < this.anInt322; local234++) {
				local244 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray46[local234]];
				if (local244 != null && local244.method49()) {
					local20 = local244.anInt134 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt134 / 32;
					local37 = local244.anInt135 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt135 / 32;
					@Pc(272) boolean local272 = false;
					@Pc(276) long local276 = Class49.method679(local244.aString4);
					for (@Pc(278) int local278 = 0; local278 < this.anInt445; local278++) {
						if (local276 == this.aLongArray4[local278] && this.anIntArray55[local278] != 0) {
							local272 = true;
							break;
						}
					}
					if (local272) {
						this.method181(local37, local20, this.aClass1_Sub1_Sub2_Sub2_6);
					} else {
						this.method181(local37, local20, this.aClass1_Sub1_Sub2_Sub2_5);
					}
				}
			}
			if (this.anInt373 != 0 && anInt268 % 20 < 10) {
				if (this.anInt373 == 1 && this.anInt348 >= 0 && this.anInt348 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length) {
					@Pc(351) Class1_Sub1_Sub1_Sub1_Sub1 local351 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anInt348];
					if (local351 != null) {
						local20 = local351.anInt134 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt134 / 32;
						local37 = local351.anInt135 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt135 / 32;
						this.method189(this.aClass1_Sub1_Sub2_Sub2_12, local20, local37);
					}
				}
				if (this.anInt373 == 2) {
					local20 = (this.anInt332 - this.anInt390) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt134 / 32;
					local37 = (this.anInt333 - this.anInt391) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt135 / 32;
					this.method189(this.aClass1_Sub1_Sub2_Sub2_12, local20, local37);
				}
				if (this.anInt373 == 10 && this.anInt359 >= 0 && this.anInt359 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length) {
					local244 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anInt359];
					if (local244 != null) {
						local20 = local244.anInt134 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt134 / 32;
						local37 = local244.anInt135 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt135 / 32;
						this.method189(this.aClass1_Sub1_Sub2_Sub2_12, local20, local37);
					}
				}
			}
			if (this.anInt272 != 0) {
				local20 = this.anInt272 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt134 / 32;
				local37 = this.anInt273 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt135 / 32;
				this.method181(local37, local20, this.aClass1_Sub1_Sub2_Sub2_11);
			}
			Class1_Sub1_Sub2.method458(78, 97, 16777215, 3, 3);
			this.aClass37_26.method538();
		} catch (@Pc(516) RuntimeException local516) {
			signlink.reporterror("46624, " + arg0 + ", " + local516.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method216() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt434);
			if (this.aClass45_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass45_Sub1_1.anInt1009);
			}
			System.out.println("loop-cycle:" + anInt268);
			System.out.println("draw-cycle:" + anInt382);
			System.out.println("ptype:" + this.anInt252);
			if (this.anInt426 != 28009) {
				this.anInt252 = -1;
			}
			System.out.println("psize:" + this.anInt251);
			if (this.aClass8_1 != null) {
				this.aClass8_1.method249();
			}
			super.aBoolean41 = true;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("9302, " + 28009 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)Ljava/awt/Component;")
	@Override
	protected Component method95() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("62218, " + false + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method91() {
		try {
			if (!this.aBoolean79 && !this.aBoolean55 && !this.aBoolean88) {
				anInt268++;
				if (this.aBoolean70) {
					this.method210();
				} else {
					this.method125();
				}
				this.method188((byte) 2);
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("57645, " + false + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
	private void method217() {
		try {
			this.anInt405 = 0;
			@Pc(63) int local63;
			@Pc(84) int local84;
			for (@Pc(16) int local16 = -1; local16 < this.anInt322 + this.anInt385; local16++) {
				@Pc(23) Class1_Sub1_Sub1_Sub1 local23;
				if (local16 == -1) {
					local23 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
				} else if (local16 < this.anInt322) {
					local23 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray46[local16]];
				} else {
					local23 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray62[local16 - this.anInt322]];
				}
				if (local23 != null && local23.method49()) {
					if (local16 >= this.anInt322) {
						@Pc(160) Class13 local160 = ((Class1_Sub1_Sub1_Sub1_Sub1) local23).aClass13_1;
						if (local160.anInt606 >= 0 && local160.anInt606 < this.aClass1_Sub1_Sub2_Sub2Array3.length) {
							this.method142(local23.anInt175 + 15, this.anInt439, local23);
							if (this.anInt290 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array3[local160.anInt606].method406(this.anInt291 - 30, this.anInt327, this.anInt290 - 12);
							}
						}
						if (this.anInt373 == 1 && this.anInt348 == this.anIntArray62[local16 - this.anInt322] && anInt268 % 20 < 10) {
							this.method142(local23.anInt175 + 15, this.anInt439, local23);
							if (this.anInt290 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array3[2].method406(this.anInt291 - 28, this.anInt327, this.anInt290 - 12);
							}
						}
					} else {
						local63 = 30;
						@Pc(66) Class1_Sub1_Sub1_Sub1_Sub2 local66 = (Class1_Sub1_Sub1_Sub1_Sub2) local23;
						if (local66.anInt182 != 0) {
							this.method142(local23.anInt175 + 15, this.anInt439, local23);
							if (this.anInt290 > -1) {
								for (local84 = 0; local84 < 8; local84++) {
									if ((local66.anInt182 & 0x1 << local84) != 0) {
										this.aClass1_Sub1_Sub2_Sub2Array3[local84].method406(this.anInt291 - local63, this.anInt327, this.anInt290 - 12);
										local63 -= 25;
									}
								}
							}
						}
						if (local16 >= 0 && this.anInt373 == 10 && this.anInt359 == this.anIntArray46[local16]) {
							this.method142(local23.anInt175 + 15, this.anInt439, local23);
							if (this.anInt290 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array3[7].method406(this.anInt291 - local63, this.anInt327, this.anInt290 - 12);
							}
						}
					}
					if (local23.aString3 != null && (local16 >= this.anInt322 || this.anInt358 == 0 || this.anInt358 == 3 || this.anInt358 == 1 && this.method147(((Class1_Sub1_Sub1_Sub1_Sub2) local23).aString4))) {
						this.method142(local23.anInt175, this.anInt439, local23);
						if (this.anInt290 > -1 && this.anInt405 < this.anInt406) {
							this.anIntArray73[this.anInt405] = this.aClass1_Sub1_Sub2_Sub4_3.method467((byte) 7, local23.aString3) / 2;
							this.anIntArray72[this.anInt405] = this.aClass1_Sub1_Sub2_Sub4_3.anInt769;
							this.anIntArray70[this.anInt405] = this.anInt290;
							this.anIntArray71[this.anInt405] = this.anInt291;
							this.anIntArray74[this.anInt405] = local23.anInt146;
							this.anIntArray75[this.anInt405] = local23.anInt147;
							this.anIntArray76[this.anInt405] = local23.anInt145;
							this.aStringArray3[this.anInt405++] = local23.aString3;
							if (this.anInt301 == 0 && local23.anInt147 == 1) {
								this.anIntArray72[this.anInt405] += 10;
								this.anIntArray71[this.anInt405] += 5;
							}
							if (this.anInt301 == 0 && local23.anInt147 == 2) {
								this.anIntArray73[this.anInt405] = 60;
							}
						}
					}
					if (local23.anInt148 > anInt268) {
						this.method142(local23.anInt175 + 15, this.anInt439, local23);
						if (this.anInt290 > -1) {
							local63 = local23.anInt149 * 30 / local23.anInt150;
							if (local63 > 30) {
								local63 = 30;
							}
							Class1_Sub1_Sub2.method458(this.anInt291 - 3, this.anInt290 - 15, 65280, local63, 5);
							Class1_Sub1_Sub2.method458(this.anInt291 - 3, this.anInt290 - 15 + local63, 16711680, 30 - local63, 5);
						}
					}
					for (local63 = 0; local63 < 4; local63++) {
						if (local23.anIntArray15[local63] > anInt268) {
							this.method142(local23.anInt175 / 2, this.anInt439, local23);
							if (this.anInt290 > -1) {
								if (local63 == 1) {
									this.anInt291 -= 20;
								}
								if (local63 == 2) {
									this.anInt290 -= 15;
									this.anInt291 -= 10;
								}
								if (local63 == 3) {
									this.anInt290 += 15;
									this.anInt291 -= 10;
								}
								this.aClass1_Sub1_Sub2_Sub2Array4[local23.anIntArray14[local63]].method406(this.anInt291 - 12, this.anInt327, this.anInt290 - 12);
								this.aClass1_Sub1_Sub2_Sub4_1.method465(0, String.valueOf(local23.anIntArray13[local63]), 673, this.anInt291 + 4, this.anInt290);
								this.aClass1_Sub1_Sub2_Sub4_1.method465(16777215, String.valueOf(local23.anIntArray13[local63]), 673, this.anInt291 + 3, this.anInt290 - 1);
							}
						}
					}
				}
			}
			for (@Pc(580) int local580 = 0; local580 < this.anInt405; local580++) {
				local63 = this.anIntArray70[local580];
				@Pc(592) int local592 = this.anIntArray71[local580];
				local84 = this.anIntArray73[local580];
				@Pc(602) int local602 = this.anIntArray72[local580];
				@Pc(604) boolean local604 = true;
				while (local604) {
					local604 = false;
					for (@Pc(610) int local610 = 0; local610 < local580; local610++) {
						if (local592 + 2 > this.anIntArray71[local610] - this.anIntArray72[local610] && local592 - local602 < this.anIntArray71[local610] + 2 && local63 - local84 < this.anIntArray70[local610] + this.anIntArray73[local610] && local63 + local84 > this.anIntArray70[local610] - this.anIntArray73[local610] && this.anIntArray71[local610] - this.anIntArray72[local610] < local592) {
							local592 = this.anIntArray71[local610] - this.anIntArray72[local610];
							local604 = true;
						}
					}
				}
				this.anInt290 = this.anIntArray70[local580];
				this.anInt291 = this.anIntArray71[local580] = local592;
				@Pc(709) String local709 = this.aStringArray3[local580];
				if (this.anInt301 == 0) {
					@Pc(714) int local714 = 16776960;
					if (this.anIntArray74[local580] < 6) {
						local714 = this.anIntArray48[this.anIntArray74[local580]];
					}
					if (this.anIntArray74[local580] == 6) {
						local714 = this.anInt409 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray74[local580] == 7) {
						local714 = this.anInt409 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray74[local580] == 8) {
						local714 = this.anInt409 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(789) int local789;
					if (this.anIntArray74[local580] == 9) {
						local789 = 150 - this.anIntArray76[local580];
						if (local789 < 50) {
							local714 = local789 * 1280 + 16711680;
						} else if (local789 < 100) {
							local714 = 16776960 - (local789 - 50) * 327680;
						} else if (local789 < 150) {
							local714 = (local789 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray74[local580] == 10) {
						local789 = 150 - this.anIntArray76[local580];
						if (local789 < 50) {
							local714 = local789 * 5 + 16711680;
						} else if (local789 < 100) {
							local714 = 16711935 - (local789 - 50) * 327680;
						} else if (local789 < 150) {
							local714 = (local789 - 100) * 327680 + 255 - (local789 - 100) * 5;
						}
					}
					if (this.anIntArray74[local580] == 11) {
						local789 = 150 - this.anIntArray76[local580];
						if (local789 < 50) {
							local714 = 16777215 - local789 * 327685;
						} else if (local789 < 100) {
							local714 = (local789 - 50) * 327685 + 65280;
						} else if (local789 < 150) {
							local714 = 16777215 - (local789 - 100) * 327680;
						}
					}
					if (this.anIntArray75[local580] == 0) {
						this.aClass1_Sub1_Sub2_Sub4_3.method465(0, local709, 673, this.anInt291 + 1, this.anInt290);
						this.aClass1_Sub1_Sub2_Sub4_3.method465(local714, local709, 673, this.anInt291, this.anInt290);
					}
					if (this.anIntArray75[local580] == 1) {
						this.aClass1_Sub1_Sub2_Sub4_3.method469(this.anInt290, this.anInt291 + 1, 0, this.anInt409, local709);
						this.aClass1_Sub1_Sub2_Sub4_3.method469(this.anInt290, this.anInt291, local714, this.anInt409, local709);
					}
					if (this.anIntArray75[local580] == 2) {
						local789 = this.aClass1_Sub1_Sub2_Sub4_3.method467((byte) 7, local709);
						@Pc(1010) int local1010 = (150 - this.anIntArray76[local580]) * (local789 + 100) / 150;
						Class1_Sub1_Sub2.method455(this.anInt290 + 50, this.anInt290 - 50, 0, 334);
						this.aClass1_Sub1_Sub2_Sub4_3.method468(this.anInt290 + 50 - local1010, local709, this.anInt291 + 1, 0);
						this.aClass1_Sub1_Sub2_Sub4_3.method468(this.anInt290 + 50 - local1010, local709, this.anInt291, local714);
						Class1_Sub1_Sub2.method454();
					}
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method465(0, local709, 673, this.anInt291 + 1, this.anInt290);
					this.aClass1_Sub1_Sub2_Sub4_3.method465(16776960, local709, 673, this.anInt291, this.anInt290);
				}
			}
		} catch (@Pc(1085) RuntimeException local1085) {
			signlink.reporterror("82648, " + 2 + ", " + local1085.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method218() {
		try {
			if (this.anInt395 > 6 || this.anInt395 < 6) {
				for (@Pc(9) int local9 = 1; local9 > 0; local9++) {
				}
			}
			if (super.anInt245 == 1) {
				if (super.anInt246 >= 539 && super.anInt246 <= 573 && super.anInt247 >= 169 && super.anInt247 < 205 && this.anIntArray87[0] != -1) {
					this.aBoolean45 = true;
					this.anInt256 = 0;
					this.aBoolean72 = true;
				}
				if (super.anInt246 >= 569 && super.anInt246 <= 599 && super.anInt247 >= 168 && super.anInt247 < 205 && this.anIntArray87[1] != -1) {
					this.aBoolean45 = true;
					this.anInt256 = 1;
					this.aBoolean72 = true;
				}
				if (super.anInt246 >= 597 && super.anInt246 <= 627 && super.anInt247 >= 168 && super.anInt247 < 205 && this.anIntArray87[2] != -1) {
					this.aBoolean45 = true;
					this.anInt256 = 2;
					this.aBoolean72 = true;
				}
				if (super.anInt246 >= 625 && super.anInt246 <= 669 && super.anInt247 >= 168 && super.anInt247 < 203 && this.anIntArray87[3] != -1) {
					this.aBoolean45 = true;
					this.anInt256 = 3;
					this.aBoolean72 = true;
				}
				if (super.anInt246 >= 666 && super.anInt246 <= 696 && super.anInt247 >= 168 && super.anInt247 < 205 && this.anIntArray87[4] != -1) {
					this.aBoolean45 = true;
					this.anInt256 = 4;
					this.aBoolean72 = true;
				}
				if (super.anInt246 >= 694 && super.anInt246 <= 724 && super.anInt247 >= 168 && super.anInt247 < 205 && this.anIntArray87[5] != -1) {
					this.aBoolean45 = true;
					this.anInt256 = 5;
					this.aBoolean72 = true;
				}
				if (super.anInt246 >= 722 && super.anInt246 <= 756 && super.anInt247 >= 169 && super.anInt247 < 205 && this.anIntArray87[6] != -1) {
					this.aBoolean45 = true;
					this.anInt256 = 6;
					this.aBoolean72 = true;
				}
				if (super.anInt246 >= 540 && super.anInt246 <= 574 && super.anInt247 >= 466 && super.anInt247 < 502 && this.anIntArray87[7] != -1) {
					this.aBoolean45 = true;
					this.anInt256 = 7;
					this.aBoolean72 = true;
				}
				if (super.anInt246 >= 572 && super.anInt246 <= 602 && super.anInt247 >= 466 && super.anInt247 < 503 && this.anIntArray87[8] != -1) {
					this.aBoolean45 = true;
					this.anInt256 = 8;
					this.aBoolean72 = true;
				}
				if (super.anInt246 >= 599 && super.anInt246 <= 629 && super.anInt247 >= 466 && super.anInt247 < 503 && this.anIntArray87[9] != -1) {
					this.aBoolean45 = true;
					this.anInt256 = 9;
					this.aBoolean72 = true;
				}
				if (super.anInt246 >= 627 && super.anInt246 <= 671 && super.anInt247 >= 467 && super.anInt247 < 502 && this.anIntArray87[10] != -1) {
					this.aBoolean45 = true;
					this.anInt256 = 10;
					this.aBoolean72 = true;
				}
				if (super.anInt246 >= 669 && super.anInt246 <= 699 && super.anInt247 >= 466 && super.anInt247 < 503 && this.anIntArray87[11] != -1) {
					this.aBoolean45 = true;
					this.anInt256 = 11;
					this.aBoolean72 = true;
				}
				if (super.anInt246 >= 696 && super.anInt246 <= 726 && super.anInt247 >= 466 && super.anInt247 < 503 && this.anIntArray87[12] != -1) {
					this.aBoolean45 = true;
					this.anInt256 = 12;
					this.aBoolean72 = true;
				}
				if (super.anInt246 >= 724 && super.anInt246 <= 758 && super.anInt247 >= 466 && super.anInt247 < 502 && this.anIntArray87[13] != -1) {
					this.aBoolean45 = true;
					this.anInt256 = 13;
					this.aBoolean72 = true;
				}
				anInt302++;
				if (anInt302 > 150) {
					anInt302 = 0;
					this.aClass1_Sub1_Sub3_3.method487(16, this.anInt378);
					this.aClass1_Sub1_Sub3_3.method488(43);
					return;
				}
			}
		} catch (@Pc(473) RuntimeException local473) {
			signlink.reporterror("99296, " + 6 + ", " + local473.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(III)V")
	private void method219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = 0;
			for (@Pc(6) int local6 = 0; local6 < 100; local6++) {
				if (this.aStringArray5[local6] != null) {
					@Pc(18) int local18 = this.anIntArray90[local6];
					@Pc(29) int local29 = this.anInt370 + 70 + 4 - local4 * 14;
					if (local29 < -20) {
						break;
					}
					@Pc(37) String local37 = this.aStringArray4[local6];
					if (local37 != null && local37.startsWith("@cr1@")) {
						local37 = local37.substring(5);
					}
					if (local37 != null && local37.startsWith("@cr2@")) {
						local37 = local37.substring(5);
					}
					if (local18 == 0) {
						local4++;
					}
					if ((local18 == 1 || local18 == 2) && (local18 == 1 || this.anInt358 == 0 || this.anInt358 == 1 && this.method147(local37))) {
						if (arg1 > local29 - 14 && arg1 <= local29 && !local37.equals(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4)) {
							if (this.anInt313 >= 1) {
								this.aStringArray1[this.anInt318] = "Report abuse @whi@" + local37;
								this.anIntArray60[this.anInt318] = 34;
								this.anInt318++;
							}
							this.aStringArray1[this.anInt318] = "Add ignore @whi@" + local37;
							this.anIntArray60[this.anInt318] = 436;
							this.anInt318++;
							this.aStringArray1[this.anInt318] = "Add friend @whi@" + local37;
							this.anIntArray60[this.anInt318] = 406;
							this.anInt318++;
						}
						local4++;
					}
					if ((local18 == 3 || local18 == 7) && this.anInt349 == 0 && (local18 == 7 || this.anInt387 == 0 || this.anInt387 == 1 && this.method147(local37))) {
						if (arg1 > local29 - 14 && arg1 <= local29) {
							if (this.anInt313 >= 1) {
								this.aStringArray1[this.anInt318] = "Report abuse @whi@" + local37;
								this.anIntArray60[this.anInt318] = 34;
								this.anInt318++;
							}
							this.aStringArray1[this.anInt318] = "Add ignore @whi@" + local37;
							this.anIntArray60[this.anInt318] = 436;
							this.anInt318++;
							this.aStringArray1[this.anInt318] = "Add friend @whi@" + local37;
							this.anIntArray60[this.anInt318] = 406;
							this.anInt318++;
						}
						local4++;
					}
					if (local18 == 4 && (this.anInt427 == 0 || this.anInt427 == 1 && this.method147(local37))) {
						if (arg1 > local29 - 14 && arg1 <= local29) {
							this.aStringArray1[this.anInt318] = "Accept trade @whi@" + local37;
							this.anIntArray60[this.anInt318] = 903;
							this.anInt318++;
						}
						local4++;
					}
					if ((local18 == 5 || local18 == 6) && this.anInt349 == 0 && this.anInt387 < 2) {
						local4++;
					}
					if (local18 == 8 && (this.anInt427 == 0 || this.anInt427 == 1 && this.method147(local37))) {
						if (arg1 > local29 - 14 && arg1 <= local29) {
							this.aStringArray1[this.anInt318] = "Accept duel @whi@" + local37;
							this.anIntArray60[this.anInt318] = 363;
							this.anInt318++;
						}
						local4++;
					}
				}
			}
		} catch (@Pc(402) RuntimeException local402) {
			signlink.reporterror("66220, " + arg0 + ", " + arg1 + ", " + -530 + ", " + local402.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!kb;I)V")
	private void method220(@OriginalArg(0) Class1_Sub1_Sub2_Sub3 arg0) {
		try {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray56.length; local10++) {
				this.anIntArray56[local10] = 0;
			}
			@Pc(35) int local35;
			for (@Pc(25) int local25 = 0; local25 < 5000; local25++) {
				local35 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray56[local35] = (int) (Math.random() * 256.0D);
			}
			@Pc(53) int local53;
			@Pc(57) int local57;
			@Pc(65) int local65;
			for (local35 = 0; local35 < 20; local35++) {
				for (local53 = 1; local53 < 255; local53++) {
					for (local57 = 1; local57 < 127; local57++) {
						local65 = local57 + (local53 << 7);
						this.anIntArray57[local65] = (this.anIntArray56[local65 - 1] + this.anIntArray56[local65 + 1] + this.anIntArray56[local65 - 128] + this.anIntArray56[local65 + 128]) / 4;
					}
				}
				@Pc(111) int[] local111 = this.anIntArray56;
				this.anIntArray56 = this.anIntArray57;
				this.anIntArray57 = local111;
			}
			if (arg0 != null) {
				local53 = 0;
				for (local57 = 0; local57 < arg0.anInt735; local57++) {
					for (local65 = 0; local65 < arg0.anInt734; local65++) {
						if (arg0.aByteArray7[local53++] != 0) {
							@Pc(147) int local147 = local65 + arg0.anInt736 + 16;
							@Pc(154) int local154 = local57 + arg0.anInt737 + 16;
							@Pc(160) int local160 = local147 + (local154 << 7);
							this.anIntArray56[local160] = 0;
						}
					}
				}
			}
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("68272, " + arg0 + ", " + 0 + ", " + local177.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)Ljava/lang/String;")
	private String method221() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("72335, " + 46264 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!mb;BI)V")
	private void method222(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			while (true) {
				if (arg0.anInt797 + 10 < arg2 * 8) {
					@Pc(12) int local12 = arg0.method509(11);
					if (local12 != 2047) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12] = new Class1_Sub1_Sub1_Sub1_Sub2();
							if (this.aClass1_Sub1_Sub3Array1[local12] != null) {
								this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12].method51(this.aClass1_Sub1_Sub3Array1[local12]);
							}
						}
						this.anIntArray46[this.anInt322++] = local12;
						@Pc(58) Class1_Sub1_Sub1_Sub1_Sub2 local58 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12];
						local58.anInt174 = anInt268;
						@Pc(66) int local66 = arg0.method509(5);
						if (local66 > 15) {
							local66 -= 32;
						}
						@Pc(75) int local75 = arg0.method509(5);
						if (local75 > 15) {
							local75 -= 32;
						}
						@Pc(84) int local84 = arg0.method509(1);
						local58.method46(local84 == 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0] + local75, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0] + local66);
						@Pc(110) int local110 = arg0.method509(1);
						if (local110 == 1) {
							this.anIntArray47[this.anInt323++] = local12;
						}
						continue;
					}
				}
				arg0.method510();
				@Pc(134) boolean local134 = false;
				return;
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("40398, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method223() {
		try {
			if (this.anInt255 > 0) {
				this.method136();
			} else {
				this.aClass37_26.method538();
				this.aClass1_Sub1_Sub2_Sub4_2.method465(0, "Connection lost", 673, 144, 257);
				this.aClass1_Sub1_Sub2_Sub4_2.method465(16777215, "Connection lost", 673, 143, 256);
				this.aClass1_Sub1_Sub2_Sub4_2.method465(0, "Please wait - attempting to reestablish", 673, 159, 257);
				this.aClass1_Sub1_Sub2_Sub4_2.method465(16777215, "Please wait - attempting to reestablish", 673, 158, 256);
				this.aClass37_26.method539(4, super.aGraphics2, 4, this.anInt455);
				this.anInt272 = 0;
				@Pc(63) Class8 local63 = this.aClass8_1;
				this.aBoolean70 = false;
				this.method176(this.aString5, this.aString6, true);
				if (!this.aBoolean70) {
					this.method136();
				}
				try {
					local63.method244();
				} catch (@Pc(83) Exception local83) {
				}
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("91741, " + 19439 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI[B)Z")
	private boolean method224(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			return arg1 == null ? true : signlink.wavesave(arg1, arg0);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("93192, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIIII)V")
	private void method225(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass1_Sub1_Sub2_Sub3_13.method445(arg0, this.anInt327, arg2);
			this.aClass1_Sub1_Sub2_Sub3_14.method445(arg0 + arg1 - 16, this.anInt327, arg2);
			Class1_Sub1_Sub2.method458(arg0 + 16, arg2, this.anInt462, 16, arg1 - 32);
			@Pc(43) int local43 = (arg1 - 32) * arg1 / arg4;
			if (local43 < 8) {
				local43 = 8;
			}
			@Pc(60) int local60 = (arg1 - local43 - 32) * arg3 / (arg4 - arg1);
			Class1_Sub1_Sub2.method458(arg0 + local60 + 16, arg2, this.anInt408, 16, local43);
			Class1_Sub1_Sub2.method463(local43, this.anInt345, arg0 + local60 + 16, arg2);
			Class1_Sub1_Sub2.method463(local43, this.anInt345, arg0 + local60 + 16, arg2 + 1);
			Class1_Sub1_Sub2.method461(this.aByte13, this.anInt345, arg2, 16, arg0 + local60 + 16);
			Class1_Sub1_Sub2.method461(this.aByte13, this.anInt345, arg2, 16, arg0 + local60 + 17);
			Class1_Sub1_Sub2.method463(local43, this.anInt353, arg0 + local60 + 16, arg2 + 15);
			Class1_Sub1_Sub2.method463(local43 - 1, this.anInt353, arg0 + local60 + 17, arg2 + 14);
			Class1_Sub1_Sub2.method461(this.aByte13, this.anInt353, arg2, 16, arg0 + local60 + local43 + 15);
			Class1_Sub1_Sub2.method461(this.aByte13, this.anInt353, arg2 + 1, 15, arg0 + local60 + local43 + 14);
		} catch (@Pc(180) RuntimeException local180) {
			signlink.reporterror("18561, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method226() {
		try {
			signlink.anInt960 = 0;
			signlink.midi = "stop";
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("77271, " + false + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
	private void method227() {
		try {
			this.aClass1_Sub1_Sub2_Sub3_1 = new Class1_Sub1_Sub2_Sub3(this.aClass48_1, "titlebox", 0);
			this.aClass1_Sub1_Sub2_Sub3_2 = new Class1_Sub1_Sub2_Sub3(this.aClass48_1, "titlebutton", 0);
			this.aClass1_Sub1_Sub2_Sub3Array3 = new Class1_Sub1_Sub2_Sub3[12];
			for (@Pc(35) int local35 = 0; local35 < 12; local35++) {
				this.aClass1_Sub1_Sub2_Sub3Array3[local35] = new Class1_Sub1_Sub2_Sub3(this.aClass48_1, "runes", local35);
			}
			this.aClass1_Sub1_Sub2_Sub2_7 = new Class1_Sub1_Sub2_Sub2(128, 265);
			this.aClass1_Sub1_Sub2_Sub2_8 = new Class1_Sub1_Sub2_Sub2(128, 265);
			for (@Pc(68) int local68 = 0; local68 < 33920; local68++) {
				this.aClass1_Sub1_Sub2_Sub2_7.anIntArray210[local68] = this.aClass37_6.anIntArray233[local68];
			}
			for (@Pc(86) int local86 = 0; local86 < 33920; local86++) {
				this.aClass1_Sub1_Sub2_Sub2_8.anIntArray210[local86] = this.aClass37_7.anIntArray233[local86];
			}
			this.anIntArray93 = new int[256];
			for (@Pc(108) int local108 = 0; local108 < 64; local108++) {
				this.anIntArray93[local108] = local108 * 262144;
			}
			for (@Pc(123) int local123 = 0; local123 < 64; local123++) {
				this.anIntArray93[local123 + 64] = local123 * 1024 + 16711680;
			}
			for (@Pc(142) int local142 = 0; local142 < 64; local142++) {
				this.anIntArray93[local142 + 128] = local142 * 4 + 16776960;
			}
			for (@Pc(161) int local161 = 0; local161 < 64; local161++) {
				this.anIntArray93[local161 + 192] = 16777215;
			}
			this.anIntArray94 = new int[256];
			for (@Pc(180) int local180 = 0; local180 < 64; local180++) {
				this.anIntArray94[local180] = local180 * 1024;
			}
			for (@Pc(195) int local195 = 0; local195 < 64; local195++) {
				this.anIntArray94[local195 + 64] = local195 * 4 + 65280;
			}
			for (@Pc(214) int local214 = 0; local214 < 64; local214++) {
				this.anIntArray94[local214 + 128] = local214 * 262144 + 65535;
			}
			for (@Pc(233) int local233 = 0; local233 < 64; local233++) {
				this.anIntArray94[local233 + 192] = 16777215;
			}
			this.anIntArray95 = new int[256];
			for (@Pc(252) int local252 = 0; local252 < 64; local252++) {
				this.anIntArray95[local252] = local252 * 4;
			}
			for (@Pc(267) int local267 = 0; local267 < 64; local267++) {
				this.anIntArray95[local267 + 64] = local267 * 262144 + 255;
			}
			for (@Pc(286) int local286 = 0; local286 < 64; local286++) {
				this.anIntArray95[local286 + 128] = local286 * 1024 + 16711935;
			}
			for (@Pc(305) int local305 = 0; local305 < 64; local305++) {
				this.anIntArray95[local305 + 192] = 16777215;
			}
			this.anIntArray92 = new int[256];
			this.anIntArray56 = new int[32768];
			this.anIntArray57 = new int[32768];
			this.method220(null);
			this.anIntArray34 = new int[32768];
			this.anIntArray35 = new int[32768];
			this.method97("Connecting to fileserver", 10);
			if (!this.aBoolean46) {
				this.aBoolean62 = true;
				this.aBoolean46 = true;
				this.method96(this, 2);
			}
		} catch (@Pc(362) RuntimeException local362) {
			signlink.reporterror("57224, " + 202 + ", " + local362.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
	private void method228() {
		try {
			if (this.anInt373 == 2) {
				this.method143(this.anInt334 * 2, (this.anInt332 - this.anInt390 << 7) + this.anInt335, (this.anInt333 - this.anInt391 << 7) + this.anInt336);
				if (this.anInt290 > -1 && anInt268 % 20 < 10) {
					this.aClass1_Sub1_Sub2_Sub2Array3[2].method406(this.anInt291 - 28, this.anInt327, this.anInt290 - 12);
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("13463, " + 11220 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!mb;I)V")
	private void method229(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt323; local3++) {
				@Pc(10) int local10 = this.anIntArray47[local3];
				@Pc(15) Class1_Sub1_Sub1_Sub1_Sub1 local15 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local10];
				@Pc(18) int local18 = arg1.method498();
				@Pc(26) int local26;
				@Pc(29) int local29;
				if ((local18 & 0x1) == 1) {
					local26 = arg1.method498();
					local29 = arg1.method498();
					local15.method50(local29, local26);
					local15.anInt148 = anInt268 + 300;
					local15.anInt149 = arg1.method498();
					local15.anInt150 = arg1.method498();
				}
				if ((local18 & 0x2) == 2) {
					local26 = arg1.method500();
					if (local26 == 65535) {
						local26 = -1;
					}
					if (local26 == local15.anInt157) {
						local15.anInt161 = 0;
					}
					local29 = arg1.method498();
					if (local26 == local15.anInt157 && local26 != -1) {
						@Pc(82) int local82 = Class27.aClass27Array1[local26].anInt838;
						if (local82 == 1) {
							local15.anInt158 = 0;
							local15.anInt159 = 0;
							local15.anInt160 = local29;
							local15.anInt161 = 0;
						}
						if (local82 == 2) {
							local15.anInt161 = 0;
						}
					} else if (local26 == -1 || local15.anInt157 == -1 || Class27.aClass27Array1[local26].anInt832 >= Class27.aClass27Array1[local15.anInt157].anInt832) {
						local15.anInt157 = local26;
						local15.anInt158 = 0;
						local15.anInt159 = 0;
						local15.anInt160 = local29;
						local15.anInt161 = 0;
						local15.anInt179 = local15.anInt177;
					}
				}
				if ((local18 & 0x4) == 4) {
					local15.anInt151 = arg1.method500();
					if (local15.anInt151 == 65535) {
						local15.anInt151 = -1;
					}
				}
				if ((local18 & 0x8) == 8) {
					local15.aString3 = arg1.method505();
					local15.anInt145 = 100;
				}
				if ((local18 & 0x10) == 16) {
					local26 = arg1.method498();
					local29 = arg1.method498();
					local15.method50(local29, local26);
					local15.anInt148 = anInt268 + 300;
					local15.anInt149 = arg1.method498();
					local15.anInt150 = arg1.method498();
				}
				if ((local18 & 0x20) == 32) {
					local15.aClass13_1 = Class13.method320(arg1.method500());
					local15.anInt137 = local15.aClass13_1.aByte39;
					local15.anInt140 = local15.aClass13_1.anInt594;
					local15.anInt141 = local15.aClass13_1.anInt595;
					local15.anInt142 = local15.aClass13_1.anInt596;
					local15.anInt143 = local15.aClass13_1.anInt597;
					local15.anInt138 = local15.aClass13_1.anInt593;
				}
				if ((local18 & 0x40) == 64) {
					local15.anInt162 = arg1.method500();
					local26 = arg1.method503();
					local15.anInt166 = local26 >> 16;
					local15.anInt165 = anInt268 + (local26 & 0xFFFF);
					local15.anInt163 = 0;
					local15.anInt164 = 0;
					if (local15.anInt165 > anInt268) {
						local15.anInt163 = -1;
					}
					if (local15.anInt162 == 65535) {
						local15.anInt162 = -1;
					}
				}
				if ((local18 & 0x80) == 128) {
					local15.anInt152 = arg1.method500();
					local15.anInt153 = arg1.method500();
				}
			}
		} catch (@Pc(306) RuntimeException local306) {
			signlink.reporterror("29797, " + arg0 + ", " + arg1 + ", " + -410 + ", " + local306.toString());
			throw new RuntimeException();
		}
	}
}
