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

	@OriginalMember(owner = "client!client", name = "H", descriptor = "I")
	private static int anInt242;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "I")
	private static int anInt243;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
	private static int anInt246;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "Z")
	private static boolean aBoolean37;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
	private static int anInt253;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private static int anInt263;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
	public static int anInt276;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "Z")
	private static boolean aBoolean47;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
	private static int anInt278;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "I")
	private static int anInt302;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "Lclient!bb;")
	public static Class1_Sub1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
	private static int anInt313;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "I")
	private static int anInt331;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
	private static int anInt358;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
	private static int anInt360;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
	public static int anInt363;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
	private static int anInt364;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private static int anInt375;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
	private static int anInt411;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "I")
	private static int anInt433;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
	private static int anInt446;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "B")
	private static byte aByte18 = 38;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "I")
	private static int anInt275 = 10;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "Z")
	private static boolean aBoolean46 = true;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "[[I")
	public static final int[][] anIntArrayArray3 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "Z")
	private static boolean aBoolean54 = true;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "[I")
	public static final int[] anIntArray58 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "Z")
	private static boolean aBoolean56 = true;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "B")
	private static byte aByte21 = 9;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "Ljava/lang/String;")
	private static String aString10 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
	private static int anInt409 = 6;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "[I")
	private static int[] anIntArray84 = new int[99];

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "J", descriptor = "Lclient!s;")
	private Class37 aClass37_1;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "I")
	private int anInt244;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "J")
	private long aLong10;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_1;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_2;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
	private int anInt247;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	private int anInt248;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
	private int anInt249;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	private int anInt250;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
	private int anInt251;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	private int anInt252;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "I")
	private int anInt258;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
	private int anInt259;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
	private int anInt260;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
	private int anInt261;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
	private int anInt262;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private int anInt265;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "I")
	private int anInt266;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
	private int anInt267;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "I")
	private int anInt268;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
	private int anInt269;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
	private int anInt270;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "I")
	private int anInt271;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "I")
	private int anInt272;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "I")
	private int anInt273;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
	private int anInt274;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "I")
	private int anInt277;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
	private int anInt279;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
	private int anInt280;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "J")
	private long aLong11;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
	private int anInt282;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "I")
	private int anInt283;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
	private int anInt284;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "Lclient!yb;")
	private Class45 aClass45_1;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
	private int anInt286;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
	private int anInt287;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "I")
	private int anInt288;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
	private int anInt289;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
	private int anInt290;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "I")
	private int anInt291;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "I")
	private int anInt292;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "I")
	private int anInt293;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
	private int anInt295;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "Lclient!xb;")
	private Class44 aClass44_1;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "Lclient!rb;")
	private Class36 aClass36_3;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "Lclient!rb;")
	private Class36 aClass36_4;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "Lclient!rb;")
	private Class36 aClass36_5;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_6;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_7;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
	private int anInt297;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "I")
	private int anInt298;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "I")
	private int anInt299;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
	private int anInt300;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
	private int anInt301;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "I")
	private int anInt303;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
	private int anInt304;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "I")
	private int anInt305;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
	private int anInt306;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
	private int anInt307;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
	private int anInt308;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "Lclient!rb;")
	private Class36 aClass36_6;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "Lclient!rb;")
	private Class36 aClass36_7;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "Lclient!rb;")
	private Class36 aClass36_8;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "Lclient!rb;")
	private Class36 aClass36_9;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "Lclient!rb;")
	private Class36 aClass36_10;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "Lclient!rb;")
	private Class36 aClass36_11;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "Lclient!rb;")
	private Class36 aClass36_12;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "Lclient!rb;")
	private Class36 aClass36_13;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "Lclient!rb;")
	private Class36 aClass36_14;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
	private int anInt310;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
	private int anInt311;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "[[B")
	private byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "I")
	private int anInt314;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
	private int anInt315;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "Lclient!rb;")
	private Class36 aClass36_15;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "Lclient!rb;")
	private Class36 aClass36_16;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "Lclient!rb;")
	private Class36 aClass36_17;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "Lclient!rb;")
	private Class36 aClass36_18;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "I")
	private int anInt316;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_8;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_9;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_10;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "I")
	private int anInt317;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
	private int anInt318;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
	private int anInt320;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
	private int anInt321;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "I")
	private int anInt322;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "I")
	private int anInt323;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "[I")
	private int[] anIntArray52;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "[I")
	private int[] anIntArray53;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "[I")
	private int[] anIntArray54;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "[I")
	private int[] anIntArray55;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "I")
	private int anInt324;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
	private int anInt325;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
	private int anInt326;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_6;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "I")
	private int anInt327;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "I")
	private int anInt328;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
	private int anInt329;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
	private int anInt332;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
	private int anInt335;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
	private int anInt336;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
	private int anInt338;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "I")
	private int anInt339;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
	private int anInt340;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private int anInt341;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private int anInt344;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private int anInt346;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private int anInt347;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "I")
	private int anInt348;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_11;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_12;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
	private int anInt350;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "[I")
	private int[] anIntArray62;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "[I")
	private int[] anIntArray63;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "Lclient!rb;")
	private Class36 aClass36_19;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "Lclient!rb;")
	private Class36 aClass36_20;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "Lclient!rb;")
	private Class36 aClass36_21;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "Lclient!rb;")
	private Class36 aClass36_22;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "Lclient!rb;")
	private Class36 aClass36_23;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "Lclient!rb;")
	private Class36 aClass36_24;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "Lclient!rb;")
	private Class36 aClass36_25;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "Lclient!rb;")
	private Class36 aClass36_26;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "Lclient!rb;")
	private Class36 aClass36_27;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "Lclient!rb;")
	private Class36 aClass36_28;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
	private int anInt353;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "Lclient!vb;")
	private Class42_Sub1 aClass42_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_7;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_8;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_9;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_10;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "I")
	private int anInt356;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "[I")
	private int[] anIntArray65;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "[I")
	private int[] anIntArray66;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "[I")
	private int[] anIntArray67;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
	private int anInt357;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_1;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_2;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
	private int anInt359;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "I")
	private int anInt361;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "[I")
	private int[] anIntArray68;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "[I")
	private int[] anIntArray69;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "[I")
	private int[] anIntArray70;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
	private int anInt365;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
	private int anInt367;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "I")
	private int anInt368;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
	private int anInt369;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "I")
	private int anInt370;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
	private int anInt372;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "J")
	private long aLong12;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
	private int anInt376;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
	private int anInt377;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
	private int anInt378;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
	private int anInt379;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "Ljava/lang/String;")
	private String aString11;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "Ljava/lang/String;")
	private String aString12;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "I")
	private int anInt381;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
	private int anInt383;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "I")
	private int anInt386;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "I")
	private int anInt387;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
	private int anInt388;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "I")
	private int anInt390;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "I")
	private int anInt391;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "I")
	private int anInt392;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "I")
	private int anInt393;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "Ljava/lang/String;")
	private String aString13;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
	private int anInt394;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "I")
	private int anInt395;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
	private int anInt396;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
	private int anInt397;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
	private int anInt398;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
	private int anInt399;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "I")
	private int anInt400;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
	private int anInt403;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "[I")
	private int[] anIntArray77;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "[I")
	private int[] anIntArray78;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "I")
	private int anInt404;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "I")
	private int anInt406;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
	private int anInt410;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_11;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_13;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_14;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_15;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_16;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_17;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
	private int anInt414;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
	private int anInt415;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
	private int anInt416;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
	private int anInt417;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
	private int anInt418;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
	private int anInt419;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
	private int anInt420;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "I")
	private int anInt421;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "I")
	private int anInt422;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
	private int anInt423;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
	private int anInt426;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
	private int anInt427;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "I")
	private int anInt428;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
	private int anInt429;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
	private int anInt430;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
	private int anInt431;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
	private int anInt432;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "Lclient!e;")
	private Class8 aClass8_1;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "J")
	private long aLong13;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "[Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array3;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "I")
	private int anInt434;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
	private int anInt435;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
	private int anInt436;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "I")
	private int anInt437;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
	private int anInt438;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
	private int anInt439;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
	private int anInt440;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private int anInt441;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "I")
	private int anInt443;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "I")
	private int anInt444;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
	private int anInt445;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_18;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_19;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_20;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "Ljava/lang/String;")
	private String aString18;

	@OriginalMember(owner = "client!client", name = "I", descriptor = "Z")
	private boolean aBoolean34 = false;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "[I")
	private int[] anIntArray25 = new int[9];

	@OriginalMember(owner = "client!client", name = "L", descriptor = "[B")
	private byte[] aByteArray2 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "M", descriptor = "[I")
	private int[] anIntArray26 = new int[256];

	@OriginalMember(owner = "client!client", name = "P", descriptor = "I")
	private int anInt245 = 50;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "[I")
	private int[] anIntArray27 = new int[this.anInt245];

	@OriginalMember(owner = "client!client", name = "R", descriptor = "[I")
	private int[] anIntArray28 = new int[this.anInt245];

	@OriginalMember(owner = "client!client", name = "S", descriptor = "[I")
	private int[] anIntArray29 = new int[this.anInt245];

	@OriginalMember(owner = "client!client", name = "T", descriptor = "[I")
	private int[] anIntArray30 = new int[this.anInt245];

	@OriginalMember(owner = "client!client", name = "U", descriptor = "[I")
	private int[] anIntArray31 = new int[this.anInt245];

	@OriginalMember(owner = "client!client", name = "V", descriptor = "[I")
	private int[] anIntArray32 = new int[this.anInt245];

	@OriginalMember(owner = "client!client", name = "W", descriptor = "[I")
	private int[] anIntArray33 = new int[this.anInt245];

	@OriginalMember(owner = "client!client", name = "X", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray1 = new String[this.anInt245];

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Z")
	private boolean aBoolean35 = false;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "[I")
	private int[] anIntArray34 = new int[1000];

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "[I")
	private int[] anIntArray35 = new int[1000];

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Z")
	private boolean aBoolean36 = false;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "B")
	private byte aByte15 = -43;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Lclient!pb;")
	private Class31 aClass31_1 = new Class31((byte) 115);

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "[I")
	private int[] anIntArray36 = new int[151];

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Z")
	private boolean aBoolean38 = false;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array3 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "[I")
	private int[] anIntArray37 = new int[4000];

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "[I")
	private int[] anIntArray38 = new int[4000];

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "Z")
	private boolean aBoolean39 = true;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "[Lclient!ic;")
	private Class17[] aClass17Array1 = new Class17[4];

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "[I")
	private int[] anIntArray39 = new int[50];

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
	private int anInt255 = -1;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
	private int anInt256 = -1;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "[I")
	private int[] anIntArray40 = new int[5];

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
	private int anInt257 = -797;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "[I")
	private int[] anIntArray41 = new int[33];

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "B")
	private byte aByte16 = -102;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "Z")
	private boolean aBoolean40 = true;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
	private int anInt264 = -1;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "[Z")
	private boolean[] aBooleanArray4 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "B")
	private byte aByte17 = 0;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "[I")
	private int[] anIntArray42 = new int[5];

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "[I")
	private int[] anIntArray43 = new int[5];

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "Z")
	private boolean aBoolean41 = false;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "Z")
	private boolean aBoolean42 = false;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "[I")
	private int[] anIntArray44 = new int[50];

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "[Lclient!wb;")
	public Class43[] aClass43Array1 = new Class43[5];

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "Z")
	private boolean aBoolean43 = false;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "Z")
	private boolean aBoolean44 = false;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "Z")
	private boolean aBoolean45 = false;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "B")
	private byte aByte19 = -107;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "[I")
	private int[] anIntArray45 = new int[5];

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "[I")
	private int[] anIntArray46 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "Ljava/lang/String;")
	private String aString5 = "";

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray2 = new String[500];

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "[Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array1 = new Class1_Sub1_Sub2_Sub3[13];

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "Lclient!mb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_2 = Class1_Sub1_Sub3.method455();

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "[[I")
	private int[][] anIntArrayArray2 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "Z")
	private boolean aBoolean48 = false;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "I")
	private int anInt281 = 7;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "Lclient!mb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_3 = Class1_Sub1_Sub3.method455();

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "[Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array2 = new Class1_Sub1_Sub2_Sub3[50];

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "[I")
	private int[] anIntArray47 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "I")
	private int anInt285 = 404;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "Z")
	private boolean aBoolean49 = false;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
	private int anInt294 = -1;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "[I")
	private final int[] anIntArray48 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "B")
	private byte aByte20 = 117;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "I")
	private int anInt296 = -1;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "Z")
	private boolean aBoolean51 = false;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "[I")
	private int[] anIntArray49 = new int[100];

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray3 = new String[100];

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray4 = new String[100];

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "[I")
	private int[] anIntArray50 = new int[50];

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "I")
	private int anInt309 = 1;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "[I")
	private int[] anIntArray51 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "Z")
	private boolean aBoolean52 = false;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
	private int anInt312 = 6;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "Z")
	private boolean aBoolean53 = false;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "Ljava/lang/String;")
	private String aString6 = "";

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private int anInt319 = 1;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "Z")
	private boolean aBoolean55 = false;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
	private int anInt330 = 2;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array4 = new Class1_Sub1_Sub2_Sub2[50];

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
	private int anInt333 = 3;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "[I")
	private int[] anIntArray56 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
	private int anInt334 = -1;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
	private int anInt337 = 933;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "[I")
	private int[] anIntArray57 = new int[50];

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "[[I")
	private int[][] anIntArrayArray4 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "Ljava/lang/String;")
	private String aString7 = "";

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
	private int anInt342 = -1;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "[I")
	private int[] anIntArray59 = new int[50];

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
	private int anInt343 = -1;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array5 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "df", descriptor = "[I")
	private int[] anIntArray60 = new int[50];

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array6 = new Class1_Sub1_Sub2_Sub2[8];

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
	private int anInt345 = 2;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "Z")
	private boolean aBoolean57 = false;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
	private int anInt349 = 3353893;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "Lclient!d;")
	private Class6 aClass6_1 = new Class6();

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "I")
	private int anInt351 = 226;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "[I")
	private int[] anIntArray61 = new int[7];

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "Lclient!pb;")
	private Class31 aClass31_2 = new Class31((byte) 115);

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
	private int anInt352 = 57;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray5 = new String[100];

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "[Lclient!ab;")
	private Class1_Sub1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1_Sub1Array1 = new Class1_Sub1_Sub1_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "[I")
	private int[] anIntArray64 = new int[8192];

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "Ljava/lang/String;")
	private String aString8 = "";

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "Ljava/lang/String;")
	private String aString9 = "";

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "I")
	private int anInt354 = -1;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
	private int anInt355 = -466;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "Z")
	private boolean aBoolean58 = false;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "B")
	private byte aByte22 = 0;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
	private int anInt362 = -1;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "Z")
	private boolean aBoolean59 = true;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "[I")
	private int[] anIntArray71 = new int[151];

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
	private int anInt366 = 1;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "[J")
	private long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "I")
	private int anInt371 = 2;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
	private int anInt373 = -1;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
	private int anInt374 = 2301979;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "B")
	private byte aByte23 = 68;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "B")
	private byte aByte24 = -81;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
	private int anInt380 = 40443;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "B")
	private byte aByte25 = 5;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "Z")
	private boolean aBoolean61 = false;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "Z")
	private boolean aBoolean62 = true;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
	private final int anInt382 = 100;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "[I")
	private int[] anIntArray72 = new int[100];

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "I")
	private int anInt384 = 2048;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "I")
	private int anInt385 = 2047;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "[Lclient!bb;")
	private Class1_Sub1_Sub1_Sub1_Sub2[] aClass1_Sub1_Sub1_Sub1_Sub2Array1 = new Class1_Sub1_Sub1_Sub1_Sub2[this.anInt384];

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "[I")
	private int[] anIntArray73 = new int[this.anInt384];

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "[I")
	private int[] anIntArray74 = new int[this.anInt384];

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "[Lclient!mb;")
	private Class1_Sub1_Sub3[] aClass1_Sub1_Sub3Array1 = new Class1_Sub1_Sub3[this.anInt384];

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "Z")
	private boolean aBoolean63 = false;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "I")
	private int anInt389 = -31190;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "Z")
	private boolean aBoolean64 = false;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "[I")
	private int[] anIntArray75 = new int[2000];

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "[I")
	private int[] anIntArray76 = new int[33];

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
	private int anInt401 = -1;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "I")
	private int anInt402 = -1;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "B")
	private byte aByte26 = -102;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "I")
	private int anInt405 = -688;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
	private int anInt407 = 7759444;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "I")
	private int anInt408 = 78;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "B")
	private byte aByte27 = 8;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "Z")
	private boolean aBoolean65 = false;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "[I")
	private int[] anIntArray79 = new int[100];

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "I")
	private int anInt412 = 414;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "Z")
	private boolean aBoolean66 = true;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "[I")
	private int[] anIntArray80 = new int[500];

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "[I")
	private int[] anIntArray81 = new int[500];

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "[I")
	private int[] anIntArray82 = new int[500];

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "[I")
	private int[] anIntArray83 = new int[500];

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "I")
	private int anInt413 = 761;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "Z")
	private boolean aBoolean68 = true;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "B")
	private byte aByte28 = -53;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private int anInt424 = 5063219;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "Ljava/lang/String;")
	private String aString14 = "";

	@OriginalMember(owner = "client!client", name = "si", descriptor = "Ljava/lang/String;")
	private String aString15 = "";

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
	private int anInt425 = -19361;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "[[[Lclient!pb;")
	private Class31[][][] aClass31ArrayArrayArray1 = new Class31[4][104][104];

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "Z")
	private boolean aBoolean69 = false;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "Z")
	private boolean aBoolean70 = true;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "Z")
	private boolean aBoolean71 = false;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "Ljava/lang/String;")
	private String aString16 = "";

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "I")
	private int anInt442 = 128;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "[I")
	private int[] anIntArray85 = new int[5];

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "Z")
	public boolean aBoolean72 = false;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "Z")
	private boolean aBoolean73 = false;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array7 = new Class1_Sub1_Sub2_Sub2[1000];

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "Lclient!mb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_4 = Class1_Sub1_Sub3.method455();

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "Lclient!pb;")
	private Class31 aClass31_3 = new Class31((byte) 115);

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "[[I")
	private int[][] anIntArrayArray5 = new int[104][104];

	static {
		@Pc(352) int local352 = 0;
		for (@Pc(354) int local354 = 0; local354 < 99; local354++) {
			@Pc(359) int local359 = local354 + 1;
			@Pc(372) int local372 = (int) ((double) local359 + Math.pow(2.0D, (double) local359 / 7.0D) * 300.0D);
			local352 += local372;
			anIntArray84[local354] = local352 / 4;
		}
		aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)Ljava/lang/String;")
	private static String method101(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("60012, " + arg0 + ", " + 0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)Ljava/lang/String;")
	private static String method119(@OriginalArg(1) int arg0) {
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
			signlink.reporterror("54075, " + true + ", " + arg0 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private static void method129() {
		try {
			Class37.aBoolean186 = true;
			Class1_Sub1_Sub2_Sub1.aBoolean132 = true;
			aBoolean47 = true;
			Class4.aBoolean26 = true;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("27970, " + -102 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Ljava/lang/String;")
	private static String method152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(7) int local7 = arg1 - arg2;
			if (local7 < -9) {
				return "@red@";
			} else if (local7 < -6) {
				return "@or3@";
			} else if (local7 < -3) {
				return "@or2@";
			} else if (local7 < 0) {
				return "@or1@";
			} else if (local7 > 9) {
				return "@gre@";
			} else if (local7 > 6) {
				return "@gr3@";
			} else if (local7 > 3) {
				return "@gr2@";
			} else if (local7 > 0) {
				return "@gr1@";
			} else {
				return "@yel@";
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("4454, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 237);
			if (arg0.length == 5) {
				anInt275 = Integer.parseInt(arg0[0]);
				anInt276 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method129();
				} else if (arg0[2].equals("highmem")) {
					method193();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean46 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean46 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt920 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method79();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private static void method193() {
		try {
			Class37.aBoolean186 = false;
			Class1_Sub1_Sub2_Sub1.aBoolean132 = false;
			aBoolean47 = false;
			Class4.aBoolean26 = false;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("25464, " + true + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method92(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString8 = "";
				this.aString9 = "Connecting to server...";
				this.method98();
			}
			this.aClass8_1 = new Class8(this.method215(anInt276 + 43594), false, this);
			this.aClass8_1.method239(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, 8);
			this.aClass1_Sub1_Sub3_4.anInt777 = 0;
			this.aLong11 = this.aClass1_Sub1_Sub3_4.method474(408);
			@Pc(47) int[] local47 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong11 >> 32), (int) this.aLong11 };
			this.aClass1_Sub1_Sub3_2.anInt777 = 0;
			this.aClass1_Sub1_Sub3_2.method458(10);
			this.aClass1_Sub1_Sub3_2.method462(local47[0]);
			this.aClass1_Sub1_Sub3_2.method462(local47[1]);
			this.aClass1_Sub1_Sub3_2.method462(local47[2]);
			this.aClass1_Sub1_Sub3_2.method462(local47[3]);
			this.aClass1_Sub1_Sub3_2.method462(signlink.anInt919);
			this.aClass1_Sub1_Sub3_2.method465(arg0);
			this.aClass1_Sub1_Sub3_2.method465(arg1);
			this.aClass1_Sub1_Sub3_2.method483(aBigInteger2, aBigInteger1);
			this.aClass1_Sub1_Sub3_3.anInt777 = 0;
			if (arg2) {
				this.aClass1_Sub1_Sub3_3.method458(18);
			} else {
				this.aClass1_Sub1_Sub3_3.method458(16);
			}
			this.aClass1_Sub1_Sub3_3.method458(this.aClass1_Sub1_Sub3_2.anInt777 + 36 + 1 + 1);
			this.aClass1_Sub1_Sub3_3.method458(237);
			this.aClass1_Sub1_Sub3_3.method458(aBoolean47 ? 1 : 0);
			for (@Pc(167) int local167 = 0; local167 < 9; local167++) {
				this.aClass1_Sub1_Sub3_3.method462(this.anIntArray25[local167]);
			}
			this.aClass1_Sub1_Sub3_3.method466(this.aClass1_Sub1_Sub3_2.aByteArray9, this.aClass1_Sub1_Sub3_2.anInt777);
			this.aClass1_Sub1_Sub3_2.aClass44_2 = new Class44(local47, this.aByte17);
			for (@Pc(202) int local202 = 0; local202 < 4; local202++) {
				local47[local202] += 50;
			}
			this.aClass44_1 = new Class44(local47, this.aByte17);
			this.aClass8_1.method240(this.aClass1_Sub1_Sub3_3.aByteArray9, this.aClass1_Sub1_Sub3_3.anInt777);
			@Pc(238) int local238 = this.aClass8_1.method237();
			if (local238 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(245) Exception local245) {
				}
				this.method92(arg0, arg1, arg2);
				return;
			}
			if (local238 == 2 || local238 == 18) {
				if (local238 == 18) {
					this.aBoolean58 = true;
				} else {
					this.aBoolean58 = false;
				}
				Class10.method258((byte) 3);
				this.aBoolean72 = true;
				this.aClass1_Sub1_Sub3_2.anInt777 = 0;
				this.aClass1_Sub1_Sub3_4.anInt777 = 0;
				this.anInt428 = -1;
				this.anInt415 = -1;
				this.anInt416 = -1;
				this.anInt417 = -1;
				this.anInt427 = 0;
				this.anInt429 = 0;
				this.anInt432 = 0;
				this.anInt431 = 0;
				this.anInt440 = 0;
				this.anInt388 = 0;
				this.aBoolean67 = false;
				super.anInt232 = 0;
				for (@Pc(319) int local319 = 0; local319 < 100; local319++) {
					this.aStringArray4[local319] = null;
				}
				this.anInt376 = 0;
				this.anInt391 = 0;
				this.anInt406 = 0;
				this.anInt346 = 0;
				this.anInt329 = (int) (Math.random() * 100.0D) - 50;
				this.anInt344 = (int) (Math.random() * 110.0D) - 55;
				this.anInt318 = (int) (Math.random() * 80.0D) - 40;
				this.anInt370 = (int) (Math.random() * 120.0D) - 60;
				this.anInt365 = (int) (Math.random() * 30.0D) - 20;
				this.anInt443 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				this.anInt342 = -1;
				this.anInt325 = 0;
				this.anInt326 = 0;
				this.anInt386 = 0;
				this.anInt353 = 0;
				for (@Pc(409) int local409 = 0; local409 < this.anInt384; local409++) {
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local409] = null;
					this.aClass1_Sub1_Sub3Array1[local409] = null;
				}
				for (@Pc(428) int local428 = 0; local428 < 8192; local428++) {
					this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local428] = null;
				}
				aClass1_Sub1_Sub1_Sub1_Sub2_1 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anInt385] = new Class1_Sub1_Sub1_Sub1_Sub2();
				this.aClass31_2.method502();
				this.aClass31_3.method502();
				@Pc(461) int local461;
				for (@Pc(457) int local457 = 0; local457 < 4; local457++) {
					for (local461 = 0; local461 < 104; local461++) {
						for (@Pc(465) int local465 = 0; local465 < 104; local465++) {
							this.aClass31ArrayArrayArray1[local457][local461][local465] = null;
						}
					}
				}
				this.aClass31_1 = new Class31((byte) 115);
				this.anInt339 = 0;
				this.anInt362 = -1;
				this.anInt354 = -1;
				this.anInt296 = -1;
				this.anInt264 = -1;
				this.aBoolean53 = false;
				this.anInt333 = 3;
				this.aBoolean48 = false;
				this.aBoolean67 = false;
				this.aBoolean34 = false;
				this.aString12 = null;
				this.anInt381 = 0;
				this.anInt373 = -1;
				this.aBoolean70 = true;
				this.method151();
				for (local461 = 0; local461 < 5; local461++) {
					this.anIntArray42[local461] = 0;
				}
				anInt242 = 0;
				anInt364 = 0;
				anInt358 = 0;
				anInt263 = 0;
				anInt278 = 0;
				anInt243 = 0;
				anInt331 = 0;
				anInt253 = 0;
				anInt375 = 0;
				this.method187(this.anInt425);
				return;
			}
			if (local238 == 3) {
				this.aString8 = "";
				this.aString9 = "Invalid username or password.";
				return;
			}
			if (local238 == 4) {
				this.aString8 = "Your account has been disabled.";
				this.aString9 = "Please check your message-centre for details.";
				return;
			}
			if (local238 == 5) {
				this.aString8 = "Your account is already logged in.";
				this.aString9 = "Try again in 60 secs...";
				return;
			}
			if (local238 == 6) {
				this.aString8 = "RuneScape has been updated!";
				this.aString9 = "Please reload this page.";
				return;
			}
			if (local238 == 7) {
				this.aString8 = "This world is full.";
				this.aString9 = "Please use a different world.";
				return;
			}
			if (local238 == 8) {
				this.aString8 = "Unable to connect.";
				this.aString9 = "Login server offline.";
				return;
			}
			if (local238 == 9) {
				this.aString8 = "Login limit exceeded.";
				this.aString9 = "Too many connections from your address.";
				return;
			}
			if (local238 == 10) {
				this.aString8 = "Unable to connect.";
				this.aString9 = "Bad session id.";
				return;
			}
			if (local238 == 11) {
				this.aString9 = "Login server rejected session.";
				this.aString9 = "Please try again.";
				return;
			}
			if (local238 == 12) {
				this.aString8 = "You need a members account to login to this world.";
				this.aString9 = "Please subscribe, or use a different world.";
				return;
			}
			if (local238 == 13) {
				this.aString8 = "Could not complete login.";
				this.aString9 = "Please try using a different world.";
				return;
			}
			if (local238 == 14) {
				this.aString8 = "The server is being updated.";
				this.aString9 = "Please wait 1 minute and try again.";
				return;
			}
			if (local238 == 15) {
				this.aBoolean72 = true;
				this.aClass1_Sub1_Sub3_2.anInt777 = 0;
				this.aClass1_Sub1_Sub3_4.anInt777 = 0;
				this.anInt428 = -1;
				this.anInt415 = -1;
				this.anInt416 = -1;
				this.anInt417 = -1;
				this.anInt427 = 0;
				this.anInt429 = 0;
				this.anInt432 = 0;
				this.anInt388 = 0;
				this.aBoolean67 = false;
				this.aLong12 = System.currentTimeMillis();
				return;
			}
			if (local238 == 16) {
				this.aString8 = "Login attempts exceeded.";
				this.aString9 = "Please wait 1 minute and try again.";
				return;
			}
			if (local238 == 17) {
				this.aString8 = "You are standing in a members-only area.";
				this.aString9 = "To play on this world move to a free area first";
				return;
			}
		} catch (@Pc(763) IOException local763) {
			this.aString8 = "";
			this.aString9 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI[B)Z")
	private boolean method93(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			return arg1 == null ? true : signlink.wavesave(arg1, arg0);
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("31300, " + true + ", " + arg0 + ", " + arg1 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZ)V")
	private void method94(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.anInt426 != 0) {
				@Pc(5) int local5 = 0;
				if (this.anInt432 != 0) {
					local5 = 1;
				}
				for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
					if (this.aStringArray4[local12] != null) {
						@Pc(24) int local24 = this.anIntArray49[local12];
						if ((local24 == 3 || local24 == 7) && (local24 == 7 || this.anInt390 == 0 || this.anInt390 == 1 && this.method154(this.aStringArray3[local12]))) {
							@Pc(54) int local54 = 329 - local5 * 13;
							if (super.anInt234 > 8 && super.anInt234 < 520 && arg0 - 11 > local54 - 10 && arg0 - 11 <= local54 + 3) {
								if (this.aBoolean58) {
									this.aStringArray2[this.anInt388] = "Report abuse @whi@" + this.aStringArray3[local12];
									this.anIntArray82[this.anInt388] = 2034;
									this.anInt388++;
								}
								this.aStringArray2[this.anInt388] = "Add ignore @whi@" + this.aStringArray3[local12];
								this.anIntArray82[this.anInt388] = 2436;
								this.anInt388++;
								this.aStringArray2[this.anInt388] = "Add friend @whi@" + this.aStringArray3[local12];
								this.anIntArray82[this.anInt388] = 2406;
								this.anInt388++;
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local24 == 5 || local24 == 6) && this.anInt390 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
				this.aBoolean72 &= true;
			}
		} catch (@Pc(192) RuntimeException local192) {
			signlink.reporterror("15267, " + arg0 + ", " + arg1 + ", " + true + ", " + local192.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	private void method95() {
		try {
			for (@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) this.aClass31_1.method498(); local6 != null; local6 = (Class1_Sub2) this.aClass31_1.method500()) {
				if (local6.anInt839 == -1) {
					local6.anInt838 = 0;
					this.method136(local6);
				} else {
					local6.method635();
				}
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("28256, " + 80 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIZIBLclient!d;)V")
	private void method96(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class6 arg7) {
		try {
			if (this.aBoolean64) {
				this.anInt372 = 32;
			} else {
				this.anInt372 = 0;
			}
			this.aBoolean64 = false;
			if (arg6 >= arg0 && arg6 < arg0 + 16 && arg3 >= arg4 && arg3 < arg4 + 16) {
				arg7.anInt462 -= this.anInt270 * 4;
				if (arg5) {
					this.aBoolean49 = true;
					return;
				}
			} else if (arg6 >= arg0 && arg6 < arg0 + 16 && arg3 >= arg4 + arg2 - 16 && arg3 < arg4 + arg2) {
				arg7.anInt462 += this.anInt270 * 4;
				if (arg5) {
					this.aBoolean49 = true;
					return;
				}
			} else if (arg6 >= arg0 - this.anInt372 && arg6 < arg0 + this.anInt372 + 16 && arg3 >= arg4 + 16 && arg3 < arg4 + arg2 - 16 && this.anInt270 > 0) {
				@Pc(120) int local120 = (arg2 - 32) * arg2 / arg1;
				if (local120 < 8) {
					local120 = 8;
				}
				@Pc(135) int local135 = arg3 - arg4 - local120 / 2 - 16;
				@Pc(141) int local141 = arg2 - local120 - 32;
				arg7.anInt462 = (arg1 - arg2) * local135 / local141;
				if (arg5) {
					this.aBoolean49 = true;
				}
				this.aBoolean64 = true;
			} else {
				return;
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("57278, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 10 + ", " + arg7 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method97() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt338);
			if (this.aClass42_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass42_Sub1_1.anInt975);
			}
			System.out.println("loop-cycle:" + anInt363);
			System.out.println("draw-cycle:" + anInt433);
			System.out.println("ptype:" + this.anInt428);
			System.out.println("psize:" + this.anInt427);
			if (this.aClass8_1 != null) {
				this.aClass8_1.method241();
			}
			super.aBoolean32 = true;
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("7491, " + 30 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)Ljava/awt/Component;")
	@Override
	protected Component method89(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != 9) {
				this.aClass1_Sub1_Sub3_2.method458(31);
			}
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("29451, " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	private void method98() {
		try {
			this.method202(595);
			this.aClass36_8.method546();
			this.aClass1_Sub1_Sub2_Sub3_11.method423(0, 217, 0);
			@Pc(51) byte local51;
			@Pc(63) int local63;
			if (this.anInt347 == 0) {
				this.aClass1_Sub1_Sub2_Sub4_1.method442(7711145, true, 180, 180, this.aClass42_Sub1_1.aString30);
				local51 = 80;
				this.aClass1_Sub1_Sub2_Sub4_3.method442(16776960, true, 180, 80, "Welcome to RuneScape");
				local63 = local51 + 30;
				this.aClass1_Sub1_Sub2_Sub3_12.method423(100, 217, 27);
				this.aClass1_Sub1_Sub2_Sub4_3.method442(16777215, true, 100, 125, "New user");
				this.aClass1_Sub1_Sub2_Sub3_12.method423(100, 217, 187);
				this.aClass1_Sub1_Sub2_Sub4_3.method442(16777215, true, 260, 125, "Existing User");
			}
			if (this.anInt347 == 2) {
				local51 = 60;
				if (this.aString8.length() > 0) {
					this.aClass1_Sub1_Sub2_Sub4_3.method442(16776960, true, 180, 45, this.aString8);
					this.aClass1_Sub1_Sub2_Sub4_3.method442(16776960, true, 180, 60, this.aString9);
					local63 = local51 + 30;
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method442(16776960, true, 180, 53, this.aString9);
					local63 = local51 + 30;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method446(16777215, 90, "Username: " + this.aString14 + (this.anInt251 == 0 & anInt363 % 40 < 20 ? "@yel@|" : ""), true, 90);
				local63 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method446(16777215, 105, "Password: " + Class46.method651(this.aString15) + (this.anInt251 == 1 & anInt363 % 40 < 20 ? "@yel@|" : ""), true, 92);
				local63 += 15;
				this.aClass1_Sub1_Sub2_Sub3_12.method423(130, 217, 27);
				this.aClass1_Sub1_Sub2_Sub4_3.method442(16777215, true, 100, 155, "Login");
				this.aClass1_Sub1_Sub2_Sub3_12.method423(130, 217, 187);
				this.aClass1_Sub1_Sub2_Sub4_3.method442(16777215, true, 260, 155, "Cancel");
			}
			if (this.anInt347 == 3) {
				this.aClass1_Sub1_Sub2_Sub4_3.method442(16776960, true, 180, 40, "Create a free account");
				local51 = 65;
				this.aClass1_Sub1_Sub2_Sub4_3.method442(16777215, true, 180, 65, "To create a new account you need to");
				local63 = local51 + 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method442(16777215, true, 180, 80, "go back to the main RuneScape webpage");
				local63 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method442(16777215, true, 180, 95, "and choose the red 'create account'");
				local63 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method442(16777215, true, 180, 110, "button at the top right of that page.");
				local63 += 15;
				this.aClass1_Sub1_Sub2_Sub3_12.method423(130, 217, 107);
				this.aClass1_Sub1_Sub2_Sub4_3.method442(16777215, true, 180, 155, "Cancel");
			}
			this.aClass36_8.method547(214, super.aGraphics2, 186);
			if (this.aBoolean57) {
				this.aBoolean57 = false;
				this.aClass36_6.method547(128, super.aGraphics2, 0);
				this.aClass36_7.method547(214, super.aGraphics2, 386);
				this.aClass36_11.method547(0, super.aGraphics2, 265);
				this.aClass36_12.method547(574, super.aGraphics2, 265);
				this.aClass36_13.method547(128, super.aGraphics2, 186);
				this.aClass36_14.method547(574, super.aGraphics2, 186);
			}
		} catch (@Pc(494) RuntimeException local494) {
			signlink.reporterror("87930, " + 0 + ", " + local494.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!mb;ZI)V")
	private void method99(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt311 = 0;
			this.anInt387 = 0;
			this.method130(arg1, arg0);
			this.method147(arg1, this.aByte16, arg0);
			this.method110(arg0, arg1);
			this.method178(arg0, arg1);
			@Pc(42) int local42;
			for (@Pc(35) int local35 = 0; local35 < this.anInt311; local35++) {
				local42 = this.anIntArray51[local35];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local42].anInt170 != anInt363) {
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local42] = null;
				}
			}
			if (arg0.anInt777 != arg1) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.anInt777 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local42 = 0; local42 < this.anInt386; local42++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray73[local42]] == null) {
					signlink.reporterror(this.aString14 + " null entry in pl list - pos:" + local42 + " size:" + this.anInt386);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("94335, " + arg0 + ", " + false + ", " + arg1 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method100() {
		try {
			@Pc(2) int local2 = this.anInt298;
			@Pc(5) int local5 = this.anInt299;
			@Pc(8) int local8 = this.anInt300;
			@Pc(11) int local11 = this.anInt301;
			Class1_Sub1_Sub2.method437(local11, local5, local8, local2, 6116423);
			Class1_Sub1_Sub2.method437(16, local5 + 1, local8 - 2, local2 + 1, 0);
			Class1_Sub1_Sub2.method438(local5 + 18, local2 + 1, local8 - 2, 0, local11 - 19);
			this.aClass1_Sub1_Sub2_Sub4_3.method444(6116423, local2 + 3, local5 + 14, "Choose Option");
			@Pc(63) int local63 = super.anInt234;
			@Pc(66) int local66 = super.anInt235;
			if (this.anInt297 == 0) {
				local63 -= 8;
				local66 -= 11;
			}
			if (this.anInt297 == 1) {
				local63 -= 562;
				local66 -= 231;
			}
			if (this.anInt297 == 2) {
				local63 -= 22;
				local66 -= 375;
			}
			for (@Pc(96) int local96 = 0; local96 < this.anInt388; local96++) {
				@Pc(111) int local111 = local5 + (this.anInt388 - 1 - local96) * 15 + 31;
				@Pc(113) int local113 = 16777215;
				if (local63 > local2 && local63 < local2 + local8 && local66 > local111 - 13 && local66 < local111 + 3) {
					local113 = 16776960;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method446(local113, local111, this.aStringArray2[local96], true, local2 + 3);
			}
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("91059, " + 7 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method87(@OriginalArg(0) int arg0) {
		try {
			if (this.aBoolean65 || this.aBoolean41 || this.aBoolean73) {
				this.method137();
			} else {
				anInt433++;
				if (this.aBoolean72) {
					this.method177();
				} else {
					this.method98();
				}
				this.anInt270 = 0;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("90599, " + 447 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Ljava/lang/String;")
	private String method102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("30403, " + arg0 + ", " + arg1 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method103() {
		try {
			if (this.aByte19 == -107) {
				this.anInt368++;
				this.method222();
				this.method143(this.anInt352);
				this.method212((byte) 5);
				this.method163();
				@Pc(31) int local31;
				@Pc(70) int local70;
				@Pc(117) int local117;
				if (!this.aBoolean52) {
					local31 = this.anInt442;
					if (this.anInt335 / 256 > local31) {
						local31 = this.anInt335 / 256;
					}
					if (this.aBooleanArray4[4] && this.anIntArray40[4] + 128 > local31) {
						local31 = this.anIntArray40[4] + 128;
					}
					local70 = this.anInt443 + this.anInt318 & 0x7FF;
					this.method159(this.anInt291, local31, local31 * 3 + 600, this.anInt290, local70, this.method194(this.anInt324, aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129, aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128) - 50, 445);
					anInt446++;
					if (anInt446 > 1802) {
						anInt446 = 0;
						this.aClass1_Sub1_Sub3_2.method457(15);
						this.aClass1_Sub1_Sub3_2.method458(0);
						local117 = this.aClass1_Sub1_Sub3_2.anInt777;
						this.aClass1_Sub1_Sub3_2.method459(29711);
						this.aClass1_Sub1_Sub3_2.method458(70);
						this.aClass1_Sub1_Sub3_2.method458((int) (Math.random() * 256.0D));
						this.aClass1_Sub1_Sub3_2.method458(242);
						this.aClass1_Sub1_Sub3_2.method458(186);
						this.aClass1_Sub1_Sub3_2.method458(39);
						this.aClass1_Sub1_Sub3_2.method458(61);
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass1_Sub1_Sub3_2.method458(13);
						}
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass1_Sub1_Sub3_2.method459(57856);
						}
						this.aClass1_Sub1_Sub3_2.method459((int) (Math.random() * 65536.0D));
						this.aClass1_Sub1_Sub3_2.method467(this.aClass1_Sub1_Sub3_2.anInt777 - local117, 316);
					}
				}
				if (this.aBoolean52) {
					local31 = this.method146();
				} else {
					local31 = this.method145();
				}
				local70 = this.anInt258;
				local117 = this.anInt259;
				@Pc(204) int local204 = this.anInt260;
				@Pc(207) int local207 = this.anInt261;
				@Pc(210) int local210 = this.anInt262;
				@Pc(259) int local259;
				for (@Pc(212) int local212 = 0; local212 < 5; local212++) {
					if (this.aBooleanArray4[local212]) {
						local259 = (int) (Math.random() * (double) (this.anIntArray43[local212] * 2 + 1) - (double) this.anIntArray43[local212] + Math.sin((double) this.anIntArray45[local212] * ((double) this.anIntArray85[local212] / 100.0D)) * (double) this.anIntArray40[local212]);
						if (local212 == 0) {
							this.anInt258 += local259;
						}
						if (local212 == 1) {
							this.anInt259 += local259;
						}
						if (local212 == 2) {
							this.anInt260 += local259;
						}
						if (local212 == 3) {
							this.anInt262 = this.anInt262 + local259 & 0x7FF;
						}
						if (local212 == 4) {
							this.anInt261 += local259;
							if (this.anInt261 < 128) {
								this.anInt261 = 128;
							}
							if (this.anInt261 > 383) {
								this.anInt261 = 383;
							}
						}
					}
				}
				local259 = Class1_Sub1_Sub2_Sub1.anInt657;
				Class1_Sub1_Sub1_Sub5.aBoolean112 = true;
				Class1_Sub1_Sub1_Sub5.anInt561 = 0;
				Class1_Sub1_Sub1_Sub5.anInt559 = super.anInt234 - 8;
				Class1_Sub1_Sub1_Sub5.anInt560 = super.anInt235 - 11;
				Class1_Sub1_Sub2.method436(296);
				this.aClass37_1.method589(this.anInt259, this.anInt258, this.anInt261, local31, this.anInt262, this.anInt260);
				this.aClass37_1.method564();
				this.method158();
				this.method115();
				this.method168(local259);
				this.method153();
				this.aClass36_17.method547(8, super.aGraphics2, 11);
				this.anInt258 = local70;
				this.anInt259 = local117;
				this.anInt260 = local204;
				this.anInt261 = local207;
				this.anInt262 = local210;
			}
		} catch (@Pc(398) RuntimeException local398) {
			signlink.reporterror("81431, " + -107 + ", " + local398.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method104(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass1_Sub1_Sub2_Sub2_6.anIntArray198;
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
						this.aClass37_1.method585(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass37_1.method585(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass1_Sub1_Sub2_Sub2_6.method391();
			@Pc(151) int local151;
			for (@Pc(147) int local147 = 1; local147 < 103; local147++) {
				for (local151 = 1; local151 < 103; local151++) {
					if ((this.aByteArrayArrayArray7[arg0][local151][local147] & 0x18) == 0) {
						this.method195(this.anInt380, local151, local147, local34, arg0, local36);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local151][local147] & 0x8) != 0) {
						this.method195(this.anInt380, local151, local147, local34, arg0 + 1, local36);
					}
				}
			}
			this.aClass36_17.method546();
			this.anInt248 = 0;
			for (local151 = 0; local151 < 104; local151++) {
				for (@Pc(221) int local221 = 0; local221 < 104; local221++) {
					@Pc(231) int local231 = this.aClass37_1.method579(this.anInt324, local151, local221);
					if (local231 != 0) {
						local231 = local231 >> 14 & 0x7FFF;
						@Pc(243) int local243 = Class9.method250(local231).anInt521;
						if (local243 >= 0) {
							@Pc(247) int local247 = local151;
							@Pc(249) int local249 = local221;
							if (local243 != 22 && local243 != 29 && local243 != 34 && local243 != 36 && local243 != 46 && local243 != 47 && local243 != 48) {
								@Pc(281) int[][] local281 = this.aClass17Array1[this.anInt324].anIntArrayArray15;
								for (@Pc(283) int local283 = 0; local283 < 10; local283++) {
									@Pc(290) int local290 = (int) (Math.random() * 4.0D);
									if (local290 == 0 && local247 > 0 && local247 > local151 - 3 && (local281[local247 - 1][local249] & 0x280108) == 0) {
										local247--;
									}
									if (local290 == 1 && local247 < 103 && local247 < local151 + 3 && (local281[local247 + 1][local249] & 0x280180) == 0) {
										local247++;
									}
									if (local290 == 2 && local249 > 0 && local249 > local221 - 3 && (local281[local247][local249 - 1] & 0x280102) == 0) {
										local249--;
									}
									if (local290 == 3 && local249 < 103 && local249 < local221 + 3 && (local281[local247][local249 + 1] & 0x280120) == 0) {
										local249++;
									}
								}
							}
							this.aClass1_Sub1_Sub2_Sub2Array7[this.anInt248] = this.aClass1_Sub1_Sub2_Sub2Array4[local243];
							this.anIntArray34[this.anInt248] = local247;
							this.anIntArray35[this.anInt248] = local249;
							this.anInt248++;
						}
					}
				}
			}
		} catch (@Pc(420) RuntimeException local420) {
			signlink.reporterror("52889, " + arg0 + ", " + 6 + ", " + local420.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!d;IIII)V")
	private void method105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg2.anInt453 == 0 && arg2.anIntArray90 != null && !arg2.aBoolean75 && (arg0 >= arg3 && arg5 >= arg4 && arg0 <= arg3 + arg2.anInt456 && arg5 <= arg4 + arg2.anInt457)) {
				@Pc(40) int local40 = arg2.anIntArray90.length;
				for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
					@Pc(51) int local51 = arg2.anIntArray91[local42] + arg3;
					@Pc(60) int local60 = arg2.anIntArray92[local42] + arg4 - arg1;
					@Pc(67) Class6 local67 = Class6.aClass6Array1[arg2.anIntArray90[local42]];
					@Pc(72) int local72 = local51 + local67.anInt458;
					@Pc(77) int local77 = local60 + local67.anInt459;
					if ((local67.anInt460 >= 0 || local67.anInt468 != 0) && arg0 >= local72 && arg5 >= local77 && arg0 < local72 + local67.anInt456 && arg5 < local77 + local67.anInt457) {
						if (local67.anInt460 >= 0) {
							this.anInt247 = local67.anInt460;
						} else {
							this.anInt247 = local67.anInt451;
						}
					}
					if (local67.anInt453 == 0) {
						this.method105(arg0, local67.anInt462, local67, local72, local77, arg5);
						if (local67.anInt461 > local67.anInt457) {
							this.method96(local72 + local67.anInt456, local67.anInt461, local67.anInt457, arg5, local77, true, arg0, local67);
						}
					} else {
						if (local67.anInt454 == 1 && arg0 >= local72 && arg5 >= local77 && arg0 < local72 + local67.anInt456 && arg5 < local77 + local67.anInt457) {
							@Pc(174) boolean local174 = false;
							if (local67.anInt455 != 0) {
								local174 = this.method182(local67, this.anInt405);
							}
							if (!local174) {
								this.aStringArray2[this.anInt388] = local67.aString23;
								this.anIntArray82[this.anInt388] = 951;
								this.anIntArray81[this.anInt388] = local67.anInt451;
								this.anInt388++;
							}
						}
						if (local67.anInt454 == 2 && this.anInt391 == 0 && arg0 >= local72 && arg5 >= local77 && arg0 < local72 + local67.anInt456 && arg5 < local77 + local67.anInt457) {
							@Pc(239) String local239 = local67.aString21;
							if (local239.indexOf(" ") != -1) {
								local239 = local239.substring(0, local239.indexOf(" "));
							}
							this.aStringArray2[this.anInt388] = local239 + " @gre@" + local67.aString22;
							this.anIntArray82[this.anInt388] = 930;
							this.anIntArray81[this.anInt388] = local67.anInt451;
							this.anInt388++;
						}
						if (local67.anInt454 == 3 && arg0 >= local72 && arg5 >= local77 && arg0 < local72 + local67.anInt456 && arg5 < local77 + local67.anInt457) {
							this.aStringArray2[this.anInt388] = "Close";
							this.anIntArray82[this.anInt388] = 947;
							this.anIntArray81[this.anInt388] = local67.anInt451;
							this.anInt388++;
						}
						if (local67.anInt454 == 4 && arg0 >= local72 && arg5 >= local77 && arg0 < local72 + local67.anInt456 && arg5 < local77 + local67.anInt457) {
							this.aStringArray2[this.anInt388] = local67.aString23;
							this.anIntArray82[this.anInt388] = 465;
							this.anIntArray81[this.anInt388] = local67.anInt451;
							this.anInt388++;
						}
						if (local67.anInt454 == 5 && arg0 >= local72 && arg5 >= local77 && arg0 < local72 + local67.anInt456 && arg5 < local77 + local67.anInt457) {
							this.aStringArray2[this.anInt388] = local67.aString23;
							this.anIntArray82[this.anInt388] = 960;
							this.anIntArray81[this.anInt388] = local67.anInt451;
							this.anInt388++;
						}
						if (local67.anInt454 == 6 && !this.aBoolean53 && arg0 >= local72 && arg5 >= local77 && arg0 < local72 + local67.anInt456 && arg5 < local77 + local67.anInt457) {
							this.aStringArray2[this.anInt388] = local67.aString23;
							this.anIntArray82[this.anInt388] = 44;
							this.anIntArray81[this.anInt388] = local67.anInt451;
							this.anInt388++;
						}
						if (local67.anInt453 == 2) {
							@Pc(487) int local487 = 0;
							for (@Pc(489) int local489 = 0; local489 < local67.anInt457; local489++) {
								for (@Pc(493) int local493 = 0; local493 < local67.anInt456; local493++) {
									@Pc(504) int local504 = local72 + local493 * (local67.anInt464 + 32);
									@Pc(513) int local513 = local77 + local489 * (local67.anInt465 + 32);
									if (local487 < 20) {
										local504 += local67.anIntArray93[local487];
										local513 += local67.anIntArray94[local487];
									}
									if (arg0 >= local504 && arg5 >= local513 && arg0 < local504 + 32 && arg5 < local513 + 32) {
										this.anInt279 = local487;
										this.anInt280 = local67.anInt451;
										if (local67.anIntArray86[local487] > 0) {
											@Pc(566) Class13 local566 = Class13.method317(local67.anIntArray86[local487] - 1);
											if (this.anInt376 == 1 && local67.aBoolean78) {
												if (local67.anInt451 != this.anInt378 || local487 != this.anInt377) {
													this.aStringArray2[this.anInt388] = "Use " + this.aString11 + " with @lre@" + local566.aString26;
													this.anIntArray82[this.anInt388] = 881;
													this.anIntArray83[this.anInt388] = local566.anInt594;
													this.anIntArray80[this.anInt388] = local487;
													this.anIntArray81[this.anInt388] = local67.anInt451;
													this.anInt388++;
												}
											} else if (this.anInt391 != 1 || !local67.aBoolean78) {
												@Pc(703) int local703;
												if (local67.aBoolean78) {
													for (local703 = 4; local703 >= 3; local703--) {
														if (local566.aStringArray10 != null && local566.aStringArray10[local703] != null) {
															this.aStringArray2[this.anInt388] = local566.aStringArray10[local703] + " @lre@" + local566.aString26;
															if (local703 == 3) {
																this.anIntArray82[this.anInt388] = 478;
															}
															if (local703 == 4) {
																this.anIntArray82[this.anInt388] = 347;
															}
															this.anIntArray83[this.anInt388] = local566.anInt594;
															this.anIntArray80[this.anInt388] = local487;
															this.anIntArray81[this.anInt388] = local67.anInt451;
															this.anInt388++;
														} else if (local703 == 4) {
															this.aStringArray2[this.anInt388] = "Drop @lre@" + local566.aString26;
															this.anIntArray82[this.anInt388] = 347;
															this.anIntArray83[this.anInt388] = local566.anInt594;
															this.anIntArray80[this.anInt388] = local487;
															this.anIntArray81[this.anInt388] = local67.anInt451;
															this.anInt388++;
														}
													}
												}
												if (local67.aBoolean79) {
													this.aStringArray2[this.anInt388] = "Use @lre@" + local566.aString26;
													this.anIntArray82[this.anInt388] = 188;
													this.anIntArray83[this.anInt388] = local566.anInt594;
													this.anIntArray80[this.anInt388] = local487;
													this.anIntArray81[this.anInt388] = local67.anInt451;
													this.anInt388++;
												}
												if (local67.aBoolean78 && local566.aStringArray10 != null) {
													for (local703 = 2; local703 >= 0; local703--) {
														if (local566.aStringArray10[local703] != null) {
															this.aStringArray2[this.anInt388] = local566.aStringArray10[local703] + " @lre@" + local566.aString26;
															if (local703 == 0) {
																this.anIntArray82[this.anInt388] = 405;
															}
															if (local703 == 1) {
																this.anIntArray82[this.anInt388] = 38;
															}
															if (local703 == 2) {
																this.anIntArray82[this.anInt388] = 422;
															}
															this.anIntArray83[this.anInt388] = local566.anInt594;
															this.anIntArray80[this.anInt388] = local487;
															this.anIntArray81[this.anInt388] = local67.anInt451;
															this.anInt388++;
														}
													}
												}
												if (local67.aStringArray6 != null) {
													for (local703 = 4; local703 >= 0; local703--) {
														if (local67.aStringArray6[local703] != null) {
															this.aStringArray2[this.anInt388] = local67.aStringArray6[local703] + " @lre@" + local566.aString26;
															if (local703 == 0) {
																this.anIntArray82[this.anInt388] = 602;
															}
															if (local703 == 1) {
																this.anIntArray82[this.anInt388] = 596;
															}
															if (local703 == 2) {
																this.anIntArray82[this.anInt388] = 22;
															}
															if (local703 == 3) {
																this.anIntArray82[this.anInt388] = 892;
															}
															if (local703 == 4) {
																this.anIntArray82[this.anInt388] = 415;
															}
															this.anIntArray83[this.anInt388] = local566.anInt594;
															this.anIntArray80[this.anInt388] = local487;
															this.anIntArray81[this.anInt388] = local67.anInt451;
															this.anInt388++;
														}
													}
												}
												this.aStringArray2[this.anInt388] = "Examine @lre@" + local566.aString26;
												this.anIntArray82[this.anInt388] = 1773;
												this.anIntArray83[this.anInt388] = local566.anInt594;
												this.anIntArray81[this.anInt388] = local67.anIntArray87[local487];
												this.anInt388++;
											} else if ((this.anInt393 & 0x10) == 16) {
												this.aStringArray2[this.anInt388] = this.aString13 + " @lre@" + local566.aString26;
												this.anIntArray82[this.anInt388] = 391;
												this.anIntArray83[this.anInt388] = local566.anInt594;
												this.anIntArray80[this.anInt388] = local487;
												this.anIntArray81[this.anInt388] = local67.anInt451;
												this.anInt388++;
											}
										}
									}
									local487++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1129) RuntimeException local1129) {
			signlink.reporterror("87593, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 11721 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local1129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method106() {
		try {
			this.aBoolean50 = true;
			try {
				@Pc(12) long local12 = System.currentTimeMillis();
				@Pc(14) int local14 = 0;
				@Pc(16) int local16 = 20;
				while (this.aBoolean55) {
					this.anInt338++;
					this.method189();
					this.method189();
					this.method201(this.anInt355);
					local14++;
					if (local14 > 10) {
						@Pc(40) long local40 = System.currentTimeMillis();
						@Pc(49) int local49 = (int) (local40 - local12) / 10 - local16;
						local16 = 40 - local49;
						if (local16 < 5) {
							local16 = 5;
						}
						local14 = 0;
						local12 = local40;
					}
					try {
						Thread.sleep((long) local16);
					} catch (@Pc(67) Exception local67) {
					}
				}
			} catch (@Pc(73) Exception local73) {
			}
			this.aBoolean50 = false;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("26973, " + 7 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[BZ)V")
	private void method107(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2) {
		try {
			@Pc(3) boolean local3 = false;
			signlink.anInt925 = arg2 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("14404, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BJ)V")
	private void method108(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt339; local14++) {
					if (this.aLongArray3[local14] == arg0) {
						this.anInt339--;
						this.aBoolean49 = true;
						for (@Pc(34) int local34 = local14; local34 < this.anInt339; local34++) {
							this.aStringArray5[local34] = this.aStringArray5[local34 + 1];
							this.anIntArray79[local34] = this.anIntArray79[local34 + 1];
							this.aLongArray3[local34] = this.aLongArray3[local34 + 1];
						}
						this.aClass1_Sub1_Sub3_2.method457(39);
						this.aClass1_Sub1_Sub3_2.method464(arg0);
						return;
					}
				}
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("60099, " + 9 + ", " + arg0 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method109() {
		try {
			this.aClass1_Sub1_Sub3_2.method457(224);
			if (this.anInt264 != -1) {
				this.anInt264 = -1;
				this.aBoolean49 = true;
				this.aBoolean53 = false;
				this.aBoolean60 = true;
			}
			if (this.anInt354 != -1) {
				this.anInt354 = -1;
				this.aBoolean61 = true;
				this.aBoolean53 = false;
			}
			this.anInt296 = -1;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("56915, " + 84 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!mb;II)V")
	private void method110(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.anInt281 > 7 || this.anInt281 < 7) {
				this.anInt428 = -1;
			}
			while (arg0.anInt778 + 10 < arg1 * 8) {
				@Pc(24) int local24 = arg0.method479(this.anInt312, 11);
				if (local24 == 2047) {
					break;
				}
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local24] == null) {
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local24] = new Class1_Sub1_Sub1_Sub1_Sub2();
					if (this.aClass1_Sub1_Sub3Array1[local24] != null) {
						this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local24].method45(this.aClass1_Sub1_Sub3Array1[local24]);
					}
				}
				this.anIntArray73[this.anInt386++] = local24;
				@Pc(70) Class1_Sub1_Sub1_Sub1_Sub2 local70 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local24];
				local70.anInt170 = anInt363;
				@Pc(79) int local79 = arg0.method479(this.anInt312, 5);
				if (local79 > 15) {
					local79 -= 32;
				}
				@Pc(89) int local89 = arg0.method479(this.anInt312, 5);
				if (local89 > 15) {
					local89 -= 32;
				}
				@Pc(99) int local99 = arg0.method479(this.anInt312, 1);
				local70.method42(aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0] + local79, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0] + local89, local99 == 1, (byte) 9);
				@Pc(126) int local126 = arg0.method479(this.anInt312, 1);
				if (local126 == 1) {
					this.anIntArray74[this.anInt387++] = local24;
				}
			}
			arg0.method480();
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("86453, " + arg0 + ", " + arg1 + ", " + 7 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	private void method111() {
		try {
			@Pc(7) int local7 = this.aClass1_Sub1_Sub2_Sub4_3.method443((byte) 2, "Choose Option");
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt388; local9++) {
				local20 = this.aClass1_Sub1_Sub2_Sub4_3.method443((byte) 2, this.aStringArray2[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			local7 += 8;
			local20 = this.anInt388 * 15 + 21;
			@Pc(68) int local68;
			@Pc(86) int local86;
			if (super.anInt237 > 8 && super.anInt238 > 11 && super.anInt237 < 520 && super.anInt238 < 345) {
				local68 = super.anInt237 - local7 / 2 - 8;
				if (local68 + local7 > 512) {
					local68 = 512 - local7;
				}
				if (local68 < 0) {
					local68 = 0;
				}
				local86 = super.anInt238 - 11;
				if (local86 + local20 > 334) {
					local86 = 334 - local20;
				}
				if (local86 < 0) {
					local86 = 0;
				}
				this.aBoolean67 = true;
				this.anInt297 = 0;
				this.anInt298 = local68;
				this.anInt299 = local86;
				this.anInt300 = local7;
				this.anInt301 = this.anInt388 * 15 + 22;
			}
			if (super.anInt237 > 562 && super.anInt238 > 231 && super.anInt237 < 752 && super.anInt238 < 492) {
				local68 = super.anInt237 - local7 / 2 - 562;
				if (local68 < 0) {
					local68 = 0;
				} else if (local68 + local7 > 190) {
					local68 = 190 - local7;
				}
				local86 = super.anInt238 - 231;
				if (local86 < 0) {
					local86 = 0;
				} else if (local86 + local20 > 261) {
					local86 = 261 - local20;
				}
				this.aBoolean67 = true;
				this.anInt297 = 1;
				this.anInt298 = local68;
				this.anInt299 = local86;
				this.anInt300 = local7;
				this.anInt301 = this.anInt388 * 15 + 22;
			}
			if (super.anInt237 > 22 && super.anInt238 > 375 && super.anInt237 < 501 && super.anInt238 < 471) {
				local68 = super.anInt237 - local7 / 2 - 22;
				if (local68 < 0) {
					local68 = 0;
				} else if (local68 + local7 > 479) {
					local68 = 479 - local7;
				}
				local86 = super.anInt238 - 375;
				if (local86 < 0) {
					local86 = 0;
				} else if (local86 + local20 > 96) {
					local86 = 96 - local20;
				}
				this.aBoolean67 = true;
				this.anInt297 = 2;
				this.anInt298 = local68;
				this.anInt299 = local86;
				this.anInt300 = local7;
				this.anInt301 = this.anInt388 * 15 + 22;
			}
		} catch (@Pc(290) RuntimeException local290) {
			signlink.reporterror("40812, " + -819 + ", " + local290.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method112() {
		try {
			@Pc(7) byte[] local7 = this.aClass45_1.method644("title.dat", null);
			@Pc(13) Class1_Sub1_Sub2_Sub2 local13 = new Class1_Sub1_Sub2_Sub2(local7, this);
			this.aClass36_9.method546();
			local13.method393(0, 0);
			this.aClass36_10.method546();
			local13.method393(0, -661);
			this.aClass36_6.method546();
			local13.method393(0, -128);
			this.aClass36_7.method546();
			local13.method393(-386, -214);
			this.aClass36_8.method546();
			local13.method393(-186, -214);
			this.aClass36_11.method546();
			local13.method393(-265, 0);
			this.aClass36_12.method546();
			local13.method393(-265, -574);
			this.aClass36_13.method546();
			local13.method393(-186, -128);
			this.aClass36_14.method546();
			local13.method393(-186, -574);
			@Pc(104) int[] local104 = new int[local13.anInt685];
			for (@Pc(106) int local106 = 0; local106 < local13.anInt686; local106++) {
				for (@Pc(110) int local110 = 0; local110 < local13.anInt685; local110++) {
					local104[local110] = local13.anIntArray198[local13.anInt685 + local13.anInt685 * local106 - local110 - 1];
				}
				for (@Pc(136) int local136 = 0; local136 < local13.anInt685; local136++) {
					local13.anIntArray198[local136 + local13.anInt685 * local106] = local104[local136];
				}
			}
			this.aClass36_9.method546();
			local13.method393(0, 394);
			this.aClass36_10.method546();
			local13.method393(0, -267);
			this.aClass36_6.method546();
			local13.method393(0, 266);
			this.aClass36_7.method546();
			local13.method393(-386, 180);
			this.aClass36_8.method546();
			local13.method393(-186, 180);
			this.aClass36_11.method546();
			local13.method393(-265, 394);
			this.aClass36_12.method546();
			local13.method393(-265, -180);
			this.aClass36_13.method546();
			local13.method393(-186, 212);
			this.aClass36_14.method546();
			local13.method393(-186, -180);
			local13 = new Class1_Sub1_Sub2_Sub2(this.aClass45_1, "logo", 0);
			this.aClass36_6.method546();
			local13.method395(18, 217, super.anInt230 / 2 - local13.anInt685 / 2 - 128);
			System.gc();
		} catch (@Pc(285) RuntimeException local285) {
			signlink.reporterror("56971, " + 0 + ", " + local285.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;I)Z")
	private boolean method113(@OriginalArg(0) Class6 arg0) {
		try {
			if (arg0.anIntArray88 == null) {
				return false;
			}
			for (@Pc(6) int local6 = 0; local6 < arg0.anIntArray88.length; local6++) {
				@Pc(14) int local14 = this.method205(local6, arg0);
				@Pc(19) int local19 = arg0.anIntArray89[local6];
				if (arg0.anIntArray88[local6] == 2) {
					if (local14 >= local19) {
						return false;
					}
				} else if (arg0.anIntArray88[local6] == 3) {
					if (local14 <= local19) {
						return false;
					}
				} else if (arg0.anIntArray88[local6] == 4) {
					if (local14 == local19) {
						return false;
					}
				} else if (local14 != local19) {
					return false;
				}
			}
			return true;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("74507, " + arg0 + ", " + 3 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIB)V")
	private void method114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte arg7) {
		try {
			@Pc(4) boolean local4 = false;
			if (arg2 >= 1 && arg1 >= 1 && arg2 <= 102 && arg1 <= 102) {
				if (aBoolean47 && arg5 != this.anInt324) {
					return;
				}
				@Pc(30) int local30 = 0;
				if (arg0 == 0) {
					local30 = this.aClass37_1.method576(arg5, arg2, arg1);
				}
				if (arg0 == 1) {
					local30 = this.aClass37_1.method577(arg2, this.aBoolean43, arg1, arg5);
				}
				if (arg0 == 2) {
					local30 = this.aClass37_1.method578(arg5, arg2, arg1);
				}
				if (arg0 == 3) {
					local30 = this.aClass37_1.method579(arg5, arg2, arg1);
				}
				@Pc(87) int local87;
				if (local30 != 0) {
					local87 = this.aClass37_1.method580(arg5, arg2, arg1, local30);
					@Pc(93) int local93 = local30 >> 14 & 0x7FFF;
					@Pc(97) int local97 = local87 & 0x1F;
					@Pc(101) int local101 = local87 >> 6;
					@Pc(113) Class9 local113;
					if (arg0 == 0) {
						this.aClass37_1.method567(arg5, arg1, arg2);
						local113 = Class9.method250(local93);
						if (local113.aBoolean94) {
							this.aClass17Array1[arg5].method374(local113.aBoolean95, local97, local101, arg2, arg1);
						}
					}
					if (arg0 == 1) {
						this.aClass37_1.method568(arg2, arg5, arg1);
					}
					if (arg0 == 2) {
						this.aClass37_1.method569(arg2, arg1, arg5);
						local113 = Class9.method250(local93);
						if (arg2 + local113.anInt517 > 103 || arg1 + local113.anInt517 > 103 || arg2 + local113.anInt518 > 103 || arg1 + local113.anInt518 > 103) {
							return;
						}
						if (local113.aBoolean94) {
							this.aClass17Array1[arg5].method375(local113.anInt517, (byte) 7, local101, local113.aBoolean95, arg2, local113.anInt518, arg1);
						}
					}
					if (arg0 == 3) {
						this.aClass37_1.method570(arg1, arg2, arg5);
						local113 = Class9.method250(local93);
						if (local113.aBoolean94 && local113.aBoolean96) {
							this.aClass17Array1[arg5].method377(this.anInt400, arg1, arg2);
						}
					}
				}
				if (arg4 >= 0) {
					local87 = arg5;
					if (arg5 < 3 && (this.aByteArrayArrayArray7[1][arg2][arg1] & 0x2) == 2) {
						local87 = arg5 + 1;
					}
					Class4.method68(arg4, arg6, arg1, arg5, this.anIntArrayArrayArray3, local87, this.aClass17Array1[arg5], arg3, this.aClass37_1, arg2);
					return;
				}
			}
		} catch (@Pc(261) RuntimeException local261) {
			signlink.reporterror("2393, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local261.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method115() {
		try {
			if (this.anInt440 == 2) {
				this.method191((this.anInt434 - this.anInt286 << 7) + this.anInt437, (this.anInt435 - this.anInt287 << 7) + this.anInt438, this.anInt436 * 2);
				this.aBoolean72 &= true;
				if (this.anInt401 > -1 && anInt363 % 20 < 10) {
					this.aClass1_Sub1_Sub2_Sub2Array3[2].method395(this.anInt402 - 28, 217, this.anInt401 - 12);
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("97593, " + true + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)Z")
	private boolean method116(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(17) int local17 = this.anIntArray82[arg0];
			if (local17 >= 2000) {
				local17 -= 2000;
			}
			return local17 == 406;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("30685, " + arg0 + ", " + false + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method117() {
		try {
			if (this.anInt305 == 0) {
				@Pc(13) int local13 = super.anInt236;
				if (this.anInt391 == 1 && super.anInt237 >= 520 && super.anInt238 >= 165 && super.anInt237 <= 788 && super.anInt238 <= 230) {
					local13 = 0;
				}
				@Pc(44) int local44;
				@Pc(47) int local47;
				@Pc(123) int local123;
				if (this.aBoolean67) {
					if (local13 != 1) {
						local44 = super.anInt234;
						local47 = super.anInt235;
						if (this.anInt297 == 0) {
							local44 -= 8;
							local47 -= 11;
						}
						if (this.anInt297 == 1) {
							local44 -= 562;
							local47 -= 231;
						}
						if (this.anInt297 == 2) {
							local44 -= 22;
							local47 -= 375;
						}
						if (local44 < this.anInt298 - 10 || local44 > this.anInt298 + this.anInt300 + 10 || local47 < this.anInt299 - 10 || local47 > this.anInt299 + this.anInt301 + 10) {
							this.aBoolean67 = false;
							if (this.anInt297 == 1) {
								this.aBoolean49 = true;
							}
							if (this.anInt297 == 2) {
								this.aBoolean61 = true;
							}
						}
					}
					if (local13 == 1) {
						local44 = this.anInt298;
						local47 = this.anInt299;
						local123 = this.anInt300;
						@Pc(126) int local126 = super.anInt237;
						@Pc(129) int local129 = super.anInt238;
						if (this.anInt297 == 0) {
							local126 -= 8;
							local129 -= 11;
						}
						if (this.anInt297 == 1) {
							local126 -= 562;
							local129 -= 231;
						}
						if (this.anInt297 == 2) {
							local126 -= 22;
							local129 -= 375;
						}
						@Pc(148) int local148 = -1;
						for (@Pc(150) int local150 = 0; local150 < this.anInt388; local150++) {
							@Pc(165) int local165 = local47 + (this.anInt388 - 1 - local150) * 15 + 31;
							if (local126 > local44 && local126 < local44 + local123 && local129 > local165 - 13 && local129 < local165 + 3) {
								local148 = local150;
							}
						}
						if (local148 != -1) {
							this.method160(local148);
						}
						this.aBoolean67 = false;
						if (this.anInt297 == 1) {
							this.aBoolean49 = true;
						}
						if (this.anInt297 == 2) {
							this.aBoolean61 = true;
							return;
						}
					}
				} else {
					if (local13 == 1 && this.anInt388 > 0) {
						local44 = this.anIntArray82[this.anInt388 - 1];
						if (local44 == 602 || local44 == 596 || local44 == 22 || local44 == 892 || local44 == 415 || local44 == 405 || local44 == 38 || local44 == 422 || local44 == 478 || local44 == 347 || local44 == 188) {
							local47 = this.anIntArray80[this.anInt388 - 1];
							local123 = this.anIntArray81[this.anInt388 - 1];
							@Pc(282) Class6 local282 = Class6.aClass6Array1[local123];
							if (local282.aBoolean77) {
								this.aBoolean51 = false;
								this.anInt441 = 0;
								this.anInt303 = local123;
								this.anInt304 = local47;
								this.anInt305 = 2;
								this.anInt306 = super.anInt237;
								this.anInt307 = super.anInt238;
								if (Class6.aClass6Array1[local123].anInt452 == this.anInt296) {
									this.anInt305 = 1;
								}
								if (Class6.aClass6Array1[local123].anInt452 == this.anInt354) {
									this.anInt305 = 3;
								}
								return;
							}
						}
					}
					if (local13 == 1 && (this.anInt249 == 1 || this.method116(this.anInt388 - 1)) && this.anInt388 > 2) {
						local13 = 2;
					}
					if (local13 == 1 && this.anInt388 > 0) {
						this.method160(this.anInt388 - 1);
					}
					if (local13 != 2 || this.anInt388 <= 0) {
						return;
					}
					this.method111();
				}
			}
		} catch (@Pc(374) RuntimeException local374) {
			signlink.reporterror("71611, " + 83 + ", " + local374.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method118(@OriginalArg(1) int arg0) {
		try {
			@Pc(7) int local7 = Class29.aClass29Array1[arg0].anInt844;
			if (local7 != 0) {
				@Pc(15) int local15 = this.anIntArray47[arg0];
				if (local7 == 1) {
					if (local15 == 1) {
						Class1_Sub1_Sub2_Sub1.method361((byte) 8, 0.9D);
					}
					if (local15 == 2) {
						Class1_Sub1_Sub2_Sub1.method361((byte) 8, 0.8D);
					}
					if (local15 == 3) {
						Class1_Sub1_Sub2_Sub1.method361((byte) 8, 0.7D);
					}
					if (local15 == 4) {
						Class1_Sub1_Sub2_Sub1.method361((byte) 8, 0.6D);
					}
					Class13.aClass39_8.method611();
					this.aBoolean57 = true;
				}
				if (local7 == 3) {
					@Pc(53) boolean local53 = this.aBoolean40;
					if (local15 == 0) {
						this.method122(this.aBoolean40, 0, this.anInt295);
						this.aBoolean40 = true;
					}
					if (local15 == 1) {
						this.method122(this.aBoolean40, -400, this.anInt295);
						this.aBoolean40 = true;
					}
					if (local15 == 2) {
						this.method122(this.aBoolean40, -800, this.anInt295);
						this.aBoolean40 = true;
					}
					if (local15 == 3) {
						this.method122(this.aBoolean40, -1200, this.anInt295);
						this.aBoolean40 = true;
					}
					if (local15 == 4) {
						this.aBoolean40 = false;
					}
					if (this.aBoolean40 != local53 && !aBoolean47) {
						if (this.aBoolean40) {
							this.anInt274 = this.anInt256;
							this.aBoolean45 = false;
							this.aClass42_Sub1_1.method623(2, this.anInt274);
						} else {
							this.method218();
						}
						this.anInt336 = 0;
					}
				}
				if (local7 == 4) {
					if (local15 == 0) {
						this.aBoolean39 = true;
						this.method181(0);
					}
					if (local15 == 1) {
						this.aBoolean39 = true;
						this.method181(-400);
					}
					if (local15 == 2) {
						this.aBoolean39 = true;
						this.method181(-800);
					}
					if (local15 == 3) {
						this.aBoolean39 = true;
						this.method181(-1200);
					}
					if (local15 == 4) {
						this.aBoolean39 = false;
					}
				}
				if (local7 == 5) {
					this.anInt249 = local15;
				}
				if (local7 == 6) {
					this.anInt414 = local15;
				}
				if (local7 == 8) {
					this.anInt426 = local15;
					this.aBoolean61 = true;
				}
			}
		} catch (@Pc(211) RuntimeException local211) {
			signlink.reporterror("55500, " + false + ", " + arg0 + ", " + local211.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method120() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt386; local3++) {
				if (local3 == -1) {
					local11 = this.anInt385;
				} else {
					local11 = this.anIntArray73[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub2 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local11];
				if (local23 != null && local23.anInt139 > 0) {
					local23.anInt139--;
					if (local23.anInt139 == 0) {
						local23.aString3 = null;
					}
				}
			}
			for (local11 = 0; local11 < this.anInt353; local11++) {
				@Pc(54) int local54 = this.anIntArray64[local11];
				@Pc(59) Class1_Sub1_Sub1_Sub1_Sub1 local59 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local54];
				if (local59 != null && local59.anInt139 > 0) {
					local59.anInt139--;
					if (local59.anInt139 == 0) {
						local59.aString3 = null;
					}
				}
			}
			this.anInt427 += 0;
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("1405, " + 0 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method121() {
		try {
			this.anInt427 += 0;
			if (super.anInt236 == 1) {
				if (super.anInt237 >= 549 && super.anInt237 <= 583 && super.anInt238 >= 195 && super.anInt238 < 231 && this.anIntArray56[0] != -1) {
					this.aBoolean49 = true;
					this.anInt333 = 0;
					this.aBoolean60 = true;
				}
				if (super.anInt237 >= 579 && super.anInt237 <= 609 && super.anInt238 >= 194 && super.anInt238 < 231 && this.anIntArray56[1] != -1) {
					this.aBoolean49 = true;
					this.anInt333 = 1;
					this.aBoolean60 = true;
				}
				if (super.anInt237 >= 607 && super.anInt237 <= 637 && super.anInt238 >= 194 && super.anInt238 < 231 && this.anIntArray56[2] != -1) {
					this.aBoolean49 = true;
					this.anInt333 = 2;
					this.aBoolean60 = true;
				}
				if (super.anInt237 >= 635 && super.anInt237 <= 679 && super.anInt238 >= 194 && super.anInt238 < 229 && this.anIntArray56[3] != -1) {
					this.aBoolean49 = true;
					this.anInt333 = 3;
					this.aBoolean60 = true;
				}
				if (super.anInt237 >= 676 && super.anInt237 <= 706 && super.anInt238 >= 194 && super.anInt238 < 231 && this.anIntArray56[4] != -1) {
					this.aBoolean49 = true;
					this.anInt333 = 4;
					this.aBoolean60 = true;
				}
				if (super.anInt237 >= 704 && super.anInt237 <= 734 && super.anInt238 >= 194 && super.anInt238 < 231 && this.anIntArray56[5] != -1) {
					this.aBoolean49 = true;
					this.anInt333 = 5;
					this.aBoolean60 = true;
				}
				if (super.anInt237 >= 732 && super.anInt237 <= 766 && super.anInt238 >= 195 && super.anInt238 < 231 && this.anIntArray56[6] != -1) {
					this.aBoolean49 = true;
					this.anInt333 = 6;
					this.aBoolean60 = true;
				}
				if (super.anInt237 >= 550 && super.anInt237 <= 584 && super.anInt238 >= 492 && super.anInt238 < 528 && this.anIntArray56[7] != -1) {
					this.aBoolean49 = true;
					this.anInt333 = 7;
					this.aBoolean60 = true;
				}
				if (super.anInt237 >= 582 && super.anInt237 <= 612 && super.anInt238 >= 492 && super.anInt238 < 529 && this.anIntArray56[8] != -1) {
					this.aBoolean49 = true;
					this.anInt333 = 8;
					this.aBoolean60 = true;
				}
				if (super.anInt237 >= 609 && super.anInt237 <= 639 && super.anInt238 >= 492 && super.anInt238 < 529 && this.anIntArray56[9] != -1) {
					this.aBoolean49 = true;
					this.anInt333 = 9;
					this.aBoolean60 = true;
				}
				if (super.anInt237 >= 637 && super.anInt237 <= 681 && super.anInt238 >= 493 && super.anInt238 < 528 && this.anIntArray56[10] != -1) {
					this.aBoolean49 = true;
					this.anInt333 = 10;
					this.aBoolean60 = true;
				}
				if (super.anInt237 >= 679 && super.anInt237 <= 709 && super.anInt238 >= 492 && super.anInt238 < 529 && this.anIntArray56[11] != -1) {
					this.aBoolean49 = true;
					this.anInt333 = 11;
					this.aBoolean60 = true;
				}
				if (super.anInt237 >= 706 && super.anInt237 <= 736 && super.anInt238 >= 492 && super.anInt238 < 529 && this.anIntArray56[12] != -1) {
					this.aBoolean49 = true;
					this.anInt333 = 12;
					this.aBoolean60 = true;
				}
				if (super.anInt237 >= 734 && super.anInt237 <= 768 && super.anInt238 >= 492 && super.anInt238 < 528 && this.anIntArray56[13] != -1) {
					this.aBoolean49 = true;
					this.anInt333 = 13;
					this.aBoolean60 = true;
				}
				anInt411++;
				if (anInt411 > 150) {
					anInt411 = 0;
					this.aClass1_Sub1_Sub3_2.method457(43);
					this.aClass1_Sub1_Sub3_2.method458(43);
					return;
				}
			}
		} catch (@Pc(463) RuntimeException local463) {
			signlink.reporterror("93675, " + 0 + ", " + local463.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZII)V")
	private void method122(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			signlink.anInt924 = arg1;
			this.anInt427 += arg2;
			if (arg0) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("13993, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLjava/lang/String;Ljava/lang/String;)V")
	private void method123(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		try {
			if (arg0 == 0 && this.anInt362 != -1) {
				this.aString12 = arg2;
				super.anInt236 = 0;
			}
			if (this.anInt354 == -1) {
				this.aBoolean61 = true;
			}
			for (@Pc(22) int local22 = 99; local22 > 0; local22--) {
				this.anIntArray49[local22] = this.anIntArray49[local22 - 1];
				this.aStringArray3[local22] = this.aStringArray3[local22 - 1];
				this.aStringArray4[local22] = this.aStringArray4[local22 - 1];
			}
			this.anIntArray49[0] = arg0;
			this.aStringArray3[0] = arg1;
			this.aStringArray4[0] = arg2;
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("73134, " + arg0 + ", " + 3 + ", " + arg1 + ", " + arg2 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method124() {
		try {
			while (true) {
				@Pc(13) Class1_Sub1_Sub4 local13 = this.aClass42_Sub1_1.method625();
				if (local13 == null) {
					return;
				}
				if (local13.anInt811 == 0) {
					Class1_Sub1_Sub1_Sub5.method277(local13.aByteArray10, local13.anInt812);
					if ((this.aClass42_Sub1_1.method622(local13.anInt812) & 0x62) != 0) {
						this.aBoolean49 = true;
						if (this.anInt354 != -1) {
							this.aBoolean61 = true;
						}
					}
				}
				if (local13.anInt811 == 1 && local13.aByteArray10 != null) {
					Class14.method329(local13.aByteArray10);
				}
				if (local13.anInt811 == 2 && local13.anInt812 == this.anInt274 && local13.aByteArray10 != null) {
					this.method107(678, local13.aByteArray10, this.aBoolean45);
				}
				if (local13.anInt811 == 3 && this.anInt406 == 1) {
					for (@Pc(84) int local84 = 0; local84 < this.aByteArrayArray2.length; local84++) {
						if (this.anIntArray69[local84] == local13.anInt812) {
							this.aByteArrayArray2[local84] = local13.aByteArray10;
							if (local13.aByteArray10 == null) {
								this.anIntArray69[local84] = -1;
							}
							break;
						}
						if (this.anIntArray70[local84] == local13.anInt812) {
							this.aByteArrayArray1[local84] = local13.aByteArray10;
							if (local13.aByteArray10 == null) {
								this.anIntArray70[local84] = -1;
							}
							break;
						}
					}
				}
				if (local13.anInt811 == 93 && this.aClass42_Sub1_1.method621(local13.anInt812)) {
					Class4.method54(new Class1_Sub1_Sub3(local13.aByteArray10, true), this.aClass42_Sub1_1);
				}
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("78624, " + -42794 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method125(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) int local3;
			if (arg0 != 0) {
				for (local3 = 1; local3 > 0; local3++) {
				}
			}
			if (aBoolean47 && this.anInt406 == 2 && Class4.anInt203 != this.anInt324) {
				this.aClass36_17.method546();
				this.aClass1_Sub1_Sub2_Sub4_2.method441(this.aByte28, "Loading - please wait.", 257, 151, 0);
				this.aClass1_Sub1_Sub2_Sub4_2.method441(this.aByte28, "Loading - please wait.", 256, 150, 16777215);
				this.aClass36_17.method547(8, super.aGraphics2, 11);
				this.anInt406 = 1;
				this.aLong12 = System.currentTimeMillis();
			}
			if (this.anInt406 == 1) {
				local3 = this.method126();
				if (local3 != 0 && System.currentTimeMillis() - this.aLong12 > 360000L) {
					signlink.reporterror(this.aString14 + " glcfb " + this.aLong11 + "," + local3 + "," + aBoolean47 + "," + this.aClass43Array1[0] + "," + this.aClass42_Sub1_1.method624() + "," + this.anInt324 + "," + this.anInt283 + "," + this.anInt284);
					this.aLong12 = System.currentTimeMillis();
				}
			}
			if (this.anInt406 == 2 && this.anInt324 != this.anInt342) {
				this.anInt342 = this.anInt324;
				this.method104(this.anInt324);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("83640, " + arg0 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)I")
	private int method126() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray2.length; local3++) {
				if (this.aByteArrayArray2[local3] == null && this.anIntArray69[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray1[local3] == null && this.anIntArray70[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(41) int local41 = 0; local41 < this.aByteArrayArray2.length; local41++) {
				@Pc(48) byte[] local48 = this.aByteArrayArray1[local41];
				if (local48 != null) {
					@Pc(62) int local62 = (this.anIntArray68[local41] >> 8) * 64 - this.anInt286;
					@Pc(74) int local74 = (this.anIntArray68[local41] & 0xFF) * 64 - this.anInt287;
					local39 &= Class4.method53(local74, local62, local48);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean71) {
				return -4;
			} else {
				this.anInt406 = 2;
				Class4.anInt203 = this.anInt324;
				this.method179(this.aBoolean42);
				return 0;
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("37084, " + -11 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILclient!mb;)V")
	private void method127(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt778 + 21 < arg0 * 8) {
					@Pc(16) int local16 = arg1.method479(this.anInt312, 13);
					if (local16 != 8191) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local16] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local16] = new Class1_Sub1_Sub1_Sub1_Sub1();
						}
						@Pc(36) Class1_Sub1_Sub1_Sub1_Sub1 local36 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local16];
						this.anIntArray64[this.anInt353++] = local16;
						local36.anInt170 = anInt363;
						local36.aClass11_1 = Class11.method306(arg1.method479(this.anInt312, 11));
						local36.anInt131 = local36.aClass11_1.aByte31;
						local36.anInt134 = local36.aClass11_1.anInt566;
						local36.anInt135 = local36.aClass11_1.anInt567;
						local36.anInt136 = local36.aClass11_1.anInt568;
						local36.anInt137 = local36.aClass11_1.anInt569;
						local36.anInt132 = local36.aClass11_1.anInt565;
						@Pc(94) int local94 = arg1.method479(this.anInt312, 5);
						if (local94 > 15) {
							local94 -= 32;
						}
						@Pc(104) int local104 = arg1.method479(this.anInt312, 5);
						if (local104 > 15) {
							local104 -= 32;
						}
						local36.method42(aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0] + local94, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0] + local104, false, (byte) 9);
						@Pc(130) int local130 = arg1.method479(this.anInt312, 1);
						if (local130 == 1) {
							this.anIntArray74[this.anInt387++] = local16;
						}
						continue;
					}
				}
				arg1.method480();
				return;
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("37396, " + false + ", " + arg0 + ", " + arg1 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;IIBILjava/lang/String;)Lclient!yb;")
	private Class45 method128(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5) {
		try {
			@Pc(3) byte[] local3 = null;
			@Pc(8) boolean local8 = false;
			@Pc(14) int local14 = 5;
			try {
				if (this.aClass43Array1[0] != null) {
					local3 = this.aClass43Array1[0].method636(arg4);
				}
			} catch (@Pc(29) Exception local29) {
			}
			@Pc(43) int local43;
			if (local3 != null) {
				this.aCRC32_1.reset();
				this.aCRC32_1.update(local3);
				local43 = (int) this.aCRC32_1.getValue();
				if (local43 != arg1) {
					local3 = null;
				}
			}
			if (local3 != null) {
				return new Class45(local3, true);
			}
			local43 = 0;
			while (local3 == null) {
				this.method91("Requesting " + arg5, arg2);
				@Pc(77) int local77;
				try {
					local77 = 0;
					@Pc(88) DataInputStream local88 = this.method167(arg0 + arg1);
					@Pc(91) byte[] local91 = new byte[6];
					local88.readFully(local91, 0, 6);
					@Pc(102) Class1_Sub1_Sub3 local102 = new Class1_Sub1_Sub3(local91, true);
					local102.anInt777 = 3;
					@Pc(110) int local110 = local102.method472() + 6;
					@Pc(112) int local112 = 6;
					local3 = new byte[local110];
					for (@Pc(117) int local117 = 0; local117 < 6; local117++) {
						local3[local117] = local91[local117];
					}
					@Pc(135) int local135;
					while (local112 < local110) {
						local135 = local110 - local112;
						if (local135 > 1000) {
							local135 = 1000;
						}
						@Pc(146) int local146 = local88.read(local3, local112, local135);
						if (local146 < 0) {
							throw new IOException("EOF");
						}
						local112 += local146;
						@Pc(163) int local163 = local112 * 100 / local110;
						if (local163 != local77) {
							this.method91("Loading " + arg5 + " - " + local163 + "%", arg2);
						}
						local77 = local163;
					}
					local88.close();
					try {
						if (this.aClass43Array1[0] != null) {
							this.aClass43Array1[0].method637(arg4, local3.length, local3);
						}
					} catch (@Pc(208) Exception local208) {
						this.aClass43Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_1.reset();
						this.aCRC32_1.update(local3);
						local135 = (int) this.aCRC32_1.getValue();
						if (local135 != arg1) {
							local3 = null;
							local43++;
						}
					}
				} catch (@Pc(235) IOException local235) {
					local3 = null;
				} catch (@Pc(239) Exception local239) {
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local3 == null) {
					for (local77 = local14; local77 > 0; local77--) {
						if (local43 >= 3) {
							this.method91("Game updated - please reload page", arg2);
							local77 = 10;
						} else {
							this.method91("Error loading - Will retry in " + local77 + " secs.", arg2);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(280) Exception local280) {
						}
					}
					local14 *= 2;
					if (local14 > 60) {
						local14 = 60;
					}
				}
			}
			return new Class45(local3, true);
		} catch (@Pc(304) RuntimeException local304) {
			signlink.reporterror("74093, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local304.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZILclient!mb;)V")
	private void method130(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			arg1.method478();
			@Pc(8) int local8 = arg1.method479(this.anInt312, 1);
			if (local8 != 0) {
				@Pc(17) int local17 = arg1.method479(this.anInt312, 2);
				if (local17 == 0) {
					this.anIntArray74[this.anInt387++] = this.anInt385;
				} else {
					@Pc(50) int local50;
					@Pc(61) int local61;
					if (local17 == 1) {
						local50 = arg1.method479(this.anInt312, 3);
						aClass1_Sub1_Sub1_Sub1_Sub2_1.method43(local50, false);
						local61 = arg1.method479(this.anInt312, 1);
						if (local61 == 1) {
							this.anIntArray74[this.anInt387++] = this.anInt385;
						}
					} else {
						@Pc(108) int local108;
						if (local17 == 2) {
							local50 = arg1.method479(this.anInt312, 3);
							aClass1_Sub1_Sub1_Sub1_Sub2_1.method43(local50, true);
							local61 = arg1.method479(this.anInt312, 3);
							aClass1_Sub1_Sub1_Sub1_Sub2_1.method43(local61, true);
							local108 = arg1.method479(this.anInt312, 1);
							if (local108 == 1) {
								this.anIntArray74[this.anInt387++] = this.anInt385;
							}
						} else if (local17 == 3) {
							this.anInt324 = arg1.method479(this.anInt312, 2);
							local50 = arg1.method479(this.anInt312, 7);
							local61 = arg1.method479(this.anInt312, 7);
							local108 = arg1.method479(this.anInt312, 1);
							aClass1_Sub1_Sub1_Sub1_Sub2_1.method42(local50, local61, local108 == 1, (byte) 9);
							@Pc(169) int local169 = arg1.method479(this.anInt312, 1);
							if (local169 == 1) {
								this.anIntArray74[this.anInt387++] = this.anInt385;
							}
						}
					}
				}
			}
		} catch (@Pc(186) RuntimeException local186) {
			signlink.reporterror("98091, " + false + ", " + arg0 + ", " + arg1 + ", " + local186.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
	private void method131(@OriginalArg(0) byte arg0) {
		try {
			this.aClass1_Sub1_Sub2_Sub3_11 = new Class1_Sub1_Sub2_Sub3(this.aClass45_1, "titlebox", 0);
			this.aClass1_Sub1_Sub2_Sub3_12 = new Class1_Sub1_Sub2_Sub3(this.aClass45_1, "titlebutton", 0);
			if (arg0 == 38) {
				this.aClass1_Sub1_Sub2_Sub3Array3 = new Class1_Sub1_Sub2_Sub3[12];
				for (@Pc(29) int local29 = 0; local29 < 12; local29++) {
					this.aClass1_Sub1_Sub2_Sub3Array3[local29] = new Class1_Sub1_Sub2_Sub3(this.aClass45_1, "runes", local29);
				}
				this.aClass1_Sub1_Sub2_Sub2_4 = new Class1_Sub1_Sub2_Sub2(128, 265);
				this.aClass1_Sub1_Sub2_Sub2_5 = new Class1_Sub1_Sub2_Sub2(128, 265);
				for (@Pc(62) int local62 = 0; local62 < 33920; local62++) {
					this.aClass1_Sub1_Sub2_Sub2_4.anIntArray198[local62] = this.aClass36_9.anIntArray224[local62];
				}
				for (@Pc(80) int local80 = 0; local80 < 33920; local80++) {
					this.aClass1_Sub1_Sub2_Sub2_5.anIntArray198[local80] = this.aClass36_10.anIntArray224[local80];
				}
				this.anIntArray53 = new int[256];
				for (@Pc(102) int local102 = 0; local102 < 64; local102++) {
					this.anIntArray53[local102] = local102 * 262144;
				}
				for (@Pc(117) int local117 = 0; local117 < 64; local117++) {
					this.anIntArray53[local117 + 64] = local117 * 1024 + 16711680;
				}
				for (@Pc(136) int local136 = 0; local136 < 64; local136++) {
					this.anIntArray53[local136 + 128] = local136 * 4 + 16776960;
				}
				for (@Pc(155) int local155 = 0; local155 < 64; local155++) {
					this.anIntArray53[local155 + 192] = 16777215;
				}
				this.anIntArray54 = new int[256];
				for (@Pc(174) int local174 = 0; local174 < 64; local174++) {
					this.anIntArray54[local174] = local174 * 1024;
				}
				for (@Pc(189) int local189 = 0; local189 < 64; local189++) {
					this.anIntArray54[local189 + 64] = local189 * 4 + 65280;
				}
				for (@Pc(208) int local208 = 0; local208 < 64; local208++) {
					this.anIntArray54[local208 + 128] = local208 * 262144 + 65535;
				}
				for (@Pc(227) int local227 = 0; local227 < 64; local227++) {
					this.anIntArray54[local227 + 192] = 16777215;
				}
				this.anIntArray55 = new int[256];
				for (@Pc(246) int local246 = 0; local246 < 64; local246++) {
					this.anIntArray55[local246] = local246 * 4;
				}
				for (@Pc(261) int local261 = 0; local261 < 64; local261++) {
					this.anIntArray55[local261 + 64] = local261 * 262144 + 255;
				}
				for (@Pc(280) int local280 = 0; local280 < 64; local280++) {
					this.anIntArray55[local280 + 128] = local280 * 1024 + 16711935;
				}
				for (@Pc(299) int local299 = 0; local299 < 64; local299++) {
					this.anIntArray55[local299 + 192] = 16777215;
				}
				this.anIntArray52 = new int[256];
				this.anIntArray62 = new int[32768];
				this.anIntArray63 = new int[32768];
				this.method162(null);
				this.anIntArray77 = new int[32768];
				this.anIntArray78 = new int[32768];
				this.method91("Connecting to fileserver", 10);
				if (!this.aBoolean55) {
					this.aBoolean63 = true;
					this.aBoolean55 = true;
					this.method90(this, 2);
				}
			}
		} catch (@Pc(356) RuntimeException local356) {
			signlink.reporterror("88732, " + arg0 + ", " + local356.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method132() {
		try {
			if (this.anInt310 != 0) {
				this.anInt428 = this.aClass1_Sub1_Sub3_4.method468();
			}
			try {
				@Pc(16) int local16 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 + this.anInt329;
				@Pc(22) int local22 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 + this.anInt344;
				if (this.anInt290 - local16 < -500 || this.anInt290 - local16 > 500 || this.anInt291 - local22 < -500 || this.anInt291 - local22 > 500) {
					this.anInt290 = local16;
					this.anInt291 = local22;
				}
				if (this.anInt290 != local16) {
					this.anInt290 += (local16 - this.anInt290) / 16;
				}
				if (this.anInt291 != local22) {
					this.anInt291 += (local22 - this.anInt291) / 16;
				}
				if (super.anIntArray23[1] == 1) {
					this.anInt444 += (-this.anInt444 - 24) / 2;
				} else if (super.anIntArray23[2] == 1) {
					this.anInt444 += (24 - this.anInt444) / 2;
				} else {
					this.anInt444 /= 2;
				}
				if (super.anIntArray23[3] == 1) {
					this.anInt445 += (12 - this.anInt445) / 2;
				} else if (super.anIntArray23[4] == 1) {
					this.anInt445 += (-this.anInt445 - 12) / 2;
				} else {
					this.anInt445 /= 2;
				}
				this.anInt443 = this.anInt443 + this.anInt444 / 2 & 0x7FF;
				this.anInt442 += this.anInt445 / 2;
				if (this.anInt442 < 128) {
					this.anInt442 = 128;
				}
				if (this.anInt442 > 383) {
					this.anInt442 = 383;
				}
				@Pc(209) int local209 = this.anInt290 >> 7;
				@Pc(214) int local214 = this.anInt291 >> 7;
				@Pc(224) int local224 = this.method194(this.anInt324, this.anInt291, this.anInt290);
				@Pc(226) int local226 = 0;
				@Pc(242) int local242;
				if (local209 > 3 && local214 > 3 && local209 < 100 && local214 < 100) {
					for (local242 = local209 - 4; local242 <= local209 + 4; local242++) {
						for (@Pc(248) int local248 = local214 - 4; local248 <= local214 + 4; local248++) {
							@Pc(253) int local253 = this.anInt324;
							if (local253 < 3 && (this.aByteArrayArrayArray7[1][local242][local248] & 0x2) == 2) {
								local253++;
							}
							@Pc(280) int local280 = local224 - this.anIntArrayArrayArray3[local253][local242][local248];
							if (local280 > local226) {
								local226 = local280;
							}
						}
					}
				}
				local242 = local226 * 192;
				if (local242 > 98048) {
					local242 = 98048;
				}
				if (local242 < 32768) {
					local242 = 32768;
				}
				if (local242 > this.anInt335) {
					this.anInt335 += (local242 - this.anInt335) / 24;
				} else if (local242 < this.anInt335) {
					this.anInt335 += (local242 - this.anInt335) / 80;
				}
			} catch (@Pc(344) Exception local344) {
				signlink.reporterror("glfc_ex " + aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 + "," + aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 + "," + this.anInt290 + "," + this.anInt291 + "," + this.anInt283 + "," + this.anInt284 + "," + this.anInt286 + "," + this.anInt287);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(394) RuntimeException local394) {
			signlink.reporterror("14876, " + 0 + ", " + local394.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
	private void method133(@OriginalArg(0) byte arg0) {
		try {
			try {
				if (this.aClass8_1 != null) {
					this.aClass8_1.method236();
				}
			} catch (@Pc(9) Exception local9) {
			}
			this.aClass8_1 = null;
			this.aBoolean72 = false;
			this.anInt347 = 0;
			this.aString14 = "";
			@Pc(26) boolean local26 = false;
			this.aString15 = "";
			Class10.method258((byte) 3);
			this.method155();
			this.aClass37_1.method550(this.aByte27);
			for (@Pc(46) int local46 = 0; local46 < 4; local46++) {
				this.aClass17Array1[local46].method369(this.anInt341);
			}
			System.gc();
			this.method218();
			this.anInt256 = -1;
			this.anInt274 = -1;
			this.anInt336 = 0;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("97236, " + arg0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZIZIIIIIIII)Z")
	private boolean method134(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray2[local7][local11] = 0;
					this.anIntArrayArray4[local7][local11] = 99999999;
				}
			}
			local11 = arg10;
			@Pc(39) int local39 = arg3;
			this.anIntArrayArray2[arg10][arg3] = 99;
			this.anIntArrayArray4[arg10][arg3] = 0;
			@Pc(60) byte local60 = 0;
			@Pc(62) int local62 = 0;
			this.anIntArray37[0] = arg10;
			@Pc(71) int local71 = local60 + 1;
			this.anIntArray38[0] = arg3;
			@Pc(75) boolean local75 = false;
			@Pc(79) int local79 = this.anIntArray37.length;
			@Pc(86) int[][] local86 = this.aClass17Array1[this.anInt324].anIntArrayArray15;
			@Pc(198) int local198;
			while (local62 != local71) {
				local11 = this.anIntArray37[local62];
				local39 = this.anIntArray38[local62];
				local62 = (local62 + 1) % local79;
				if (local11 == arg0 && local39 == arg5) {
					local75 = true;
					break;
				}
				if (arg8 != 0) {
					if ((arg8 < 5 || arg8 == 10) && this.aClass17Array1[this.anInt324].method378(arg5, arg8 - 1, arg4, local39, local11, arg0)) {
						local75 = true;
						break;
					}
					if (arg8 < 10 && this.aClass17Array1[this.anInt324].method379(local39, arg5, arg8 - 1, arg0, this.aBoolean68, arg4, local11)) {
						local75 = true;
						break;
					}
				}
				if (arg7 != 0 && arg9 != 0 && this.aClass17Array1[this.anInt324].method380(local11, arg1, arg0, arg5, local39, arg7, arg9)) {
					local75 = true;
					break;
				}
				local198 = this.anIntArrayArray4[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray2[local11 - 1][local39] == 0 && (local86[local11 - 1][local39] & 0x280108) == 0) {
					this.anIntArray37[local71] = local11 - 1;
					this.anIntArray38[local71] = local39;
					local71 = (local71 + 1) % local79;
					this.anIntArrayArray2[local11 - 1][local39] = 2;
					this.anIntArrayArray4[local11 - 1][local39] = local198;
				}
				if (local11 < 103 && this.anIntArrayArray2[local11 + 1][local39] == 0 && (local86[local11 + 1][local39] & 0x280180) == 0) {
					this.anIntArray37[local71] = local11 + 1;
					this.anIntArray38[local71] = local39;
					local71 = (local71 + 1) % local79;
					this.anIntArrayArray2[local11 + 1][local39] = 8;
					this.anIntArrayArray4[local11 + 1][local39] = local198;
				}
				if (local39 > 0 && this.anIntArrayArray2[local11][local39 - 1] == 0 && (local86[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray37[local71] = local11;
					this.anIntArray38[local71] = local39 - 1;
					local71 = (local71 + 1) % local79;
					this.anIntArrayArray2[local11][local39 - 1] = 1;
					this.anIntArrayArray4[local11][local39 - 1] = local198;
				}
				if (local39 < 103 && this.anIntArrayArray2[local11][local39 + 1] == 0 && (local86[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray37[local71] = local11;
					this.anIntArray38[local71] = local39 + 1;
					local71 = (local71 + 1) % local79;
					this.anIntArrayArray2[local11][local39 + 1] = 4;
					this.anIntArrayArray4[local11][local39 + 1] = local198;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray2[local11 - 1][local39 - 1] == 0 && (local86[local11 - 1][local39 - 1] & 0x28010E) == 0 && (local86[local11 - 1][local39] & 0x280108) == 0 && (local86[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray37[local71] = local11 - 1;
					this.anIntArray38[local71] = local39 - 1;
					local71 = (local71 + 1) % local79;
					this.anIntArrayArray2[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray4[local11 - 1][local39 - 1] = local198;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray2[local11 + 1][local39 - 1] == 0 && (local86[local11 + 1][local39 - 1] & 0x280183) == 0 && (local86[local11 + 1][local39] & 0x280180) == 0 && (local86[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray37[local71] = local11 + 1;
					this.anIntArray38[local71] = local39 - 1;
					local71 = (local71 + 1) % local79;
					this.anIntArrayArray2[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray4[local11 + 1][local39 - 1] = local198;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray2[local11 - 1][local39 + 1] == 0 && (local86[local11 - 1][local39 + 1] & 0x280138) == 0 && (local86[local11 - 1][local39] & 0x280108) == 0 && (local86[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray37[local71] = local11 - 1;
					this.anIntArray38[local71] = local39 + 1;
					local71 = (local71 + 1) % local79;
					this.anIntArrayArray2[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray4[local11 - 1][local39 + 1] = local198;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray2[local11 + 1][local39 + 1] == 0 && (local86[local11 + 1][local39 + 1] & 0x2801E0) == 0 && (local86[local11 + 1][local39] & 0x280180) == 0 && (local86[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray37[local71] = local11 + 1;
					this.anIntArray38[local71] = local39 + 1;
					local71 = (local71 + 1) % local79;
					this.anIntArrayArray2[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray4[local11 + 1][local39 + 1] = local198;
				}
			}
			this.anInt404 = 0;
			@Pc(814) int local814;
			@Pc(820) int local820;
			@Pc(826) int local826;
			if (!local75) {
				if (arg2) {
					local198 = 100;
					for (local814 = 1; local814 < 2; local814++) {
						for (local820 = arg0 - local814; local820 <= arg0 + local814; local820++) {
							for (local826 = arg5 - local814; local826 <= arg5 + local814; local826++) {
								if (local820 >= 0 && local826 >= 0 && local820 < 104 && local826 < 104 && this.anIntArrayArray4[local820][local826] < local198) {
									local198 = this.anIntArrayArray4[local820][local826];
									local11 = local820;
									local39 = local826;
									this.anInt404 = 1;
									local75 = true;
								}
							}
						}
						if (local75) {
							break;
						}
					}
				}
				if (!local75) {
					return false;
				}
			}
			@Pc(887) byte local887 = 0;
			this.anIntArray37[0] = local11;
			local62 = local887 + 1;
			this.anIntArray38[0] = local39;
			local198 = local814 = this.anIntArrayArray2[local11][local39];
			while (local11 != arg10 || local39 != arg3) {
				if (local198 != local814) {
					local814 = local198;
					this.anIntArray37[local62] = local11;
					this.anIntArray38[local62++] = local39;
				}
				if ((local198 & 0x2) != 0) {
					local11++;
				} else if ((local198 & 0x8) != 0) {
					local11--;
				}
				if ((local198 & 0x1) != 0) {
					local39++;
				} else if ((local198 & 0x4) != 0) {
					local39--;
				}
				local198 = this.anIntArrayArray2[local11][local39];
			}
			if (local62 > 0) {
				local79 = local62;
				if (local62 > 25) {
					local79 = 25;
				}
				local62--;
				local820 = this.anIntArray37[local62];
				local826 = this.anIntArray38[local62];
				if (arg6 == 0) {
					this.aClass1_Sub1_Sub3_2.method457(222);
					this.aClass1_Sub1_Sub3_2.method458(local79 + local79 + 3);
				}
				if (arg6 == 1) {
					this.aClass1_Sub1_Sub3_2.method457(201);
					this.aClass1_Sub1_Sub3_2.method458(local79 + local79 + 3 + 14);
				}
				if (arg6 == 2) {
					this.aClass1_Sub1_Sub3_2.method457(140);
					this.aClass1_Sub1_Sub3_2.method458(local79 + local79 + 3);
				}
				if (super.anIntArray23[5] == 1) {
					this.aClass1_Sub1_Sub3_2.method458(1);
				} else {
					this.aClass1_Sub1_Sub3_2.method458(0);
				}
				this.aClass1_Sub1_Sub3_2.method459(local820 + this.anInt286);
				this.aClass1_Sub1_Sub3_2.method459(local826 + this.anInt287);
				this.anInt325 = this.anIntArray37[0];
				this.anInt326 = this.anIntArray38[0];
				for (@Pc(1075) int local1075 = 1; local1075 < local79; local1075++) {
					local62--;
					this.aClass1_Sub1_Sub3_2.method458(this.anIntArray37[local62] - local820);
					this.aClass1_Sub1_Sub3_2.method458(this.anIntArray38[local62] - local826);
				}
				return true;
			} else if (arg6 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1110) RuntimeException local1110) {
			signlink.reporterror("24509, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZIII)V")
	private void method135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass1_Sub1_Sub2_Sub3_6.method423(arg1, 217, arg3);
			this.aClass1_Sub1_Sub2_Sub3_7.method423(arg1 + arg4 - 16, 217, arg3);
			Class1_Sub1_Sub2.method437(arg4 - 32, arg1 + 16, 16, arg3, this.anInt374);
			@Pc(35) int local35 = (arg4 - 32) * arg4 / arg2;
			if (local35 < 8) {
				local35 = 8;
			}
			@Pc(52) int local52 = (arg4 - local35 - 32) * arg0 / (arg2 - arg4);
			Class1_Sub1_Sub2.method437(local35, arg1 + local52 + 16, 16, arg3, this.anInt424);
			Class1_Sub1_Sub2.method440(this.anInt407, arg1 + local52 + 16, local35, arg3);
			Class1_Sub1_Sub2.method440(this.anInt407, arg1 + local52 + 16, local35, arg3 + 1);
			Class1_Sub1_Sub2.method439(arg3, arg1 + local52 + 16, 16, this.anInt309, this.anInt407);
			Class1_Sub1_Sub2.method439(arg3, arg1 + local52 + 17, 16, this.anInt309, this.anInt407);
			Class1_Sub1_Sub2.method440(this.anInt349, arg1 + local52 + 16, local35, arg3 + 15);
			Class1_Sub1_Sub2.method440(this.anInt349, arg1 + local52 + 17, local35 - 1, arg3 + 14);
			Class1_Sub1_Sub2.method439(arg3, arg1 + local52 + local35 + 15, 16, this.anInt309, this.anInt349);
			Class1_Sub1_Sub2.method439(arg3 + 1, arg1 + 14 + local52 + local35, 15, this.anInt309, this.anInt349);
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("6769, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local177.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method84() {
		if (signlink.sunjava) {
			super.anInt228 = 5;
		}
		if (aBoolean37) {
			this.aBoolean65 = true;
			return;
		}
		aBoolean37 = true;
		@Pc(16) boolean local16 = false;
		@Pc(20) String local20 = this.method150();
		if (local20.endsWith("jagex.com")) {
			local16 = true;
		}
		if (local20.endsWith("runescape.com")) {
			local16 = true;
		}
		if (local20.endsWith("192.168.1.2")) {
			local16 = true;
		}
		if (local20.endsWith("192.168.1.249")) {
			local16 = true;
		}
		if (local20.endsWith("192.168.1.252")) {
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
			this.aBoolean73 = true;
			return;
		}
		@Pc(78) int local78;
		if (signlink.aRandomAccessFile1 != null) {
			for (local78 = 0; local78 < 5; local78++) {
				this.aClass43Array1[local78] = new Class43(500000, signlink.aRandomAccessFile1, local78 + 1, signlink.aRandomAccessFileArray1[local78], (byte) 4);
			}
		}
		try {
			local78 = 5;
			this.anIntArray25[8] = 0;
			while (this.anIntArray25[8] == 0) {
				this.method91("Connecting to web server", 20);
				try {
					@Pc(127) DataInputStream local127 = this.method167("crc" + (int) (Math.random() * 9.9999999E7D));
					@Pc(134) Class1_Sub1_Sub3 local134 = new Class1_Sub1_Sub3(new byte[36], true);
					local127.readFully(local134.aByteArray9, 0, 36);
					for (@Pc(142) int local142 = 0; local142 < 9; local142++) {
						this.anIntArray25[local142] = local134.method473();
					}
					local127.close();
				} catch (@Pc(158) IOException local158) {
					for (@Pc(160) int local160 = local78; local160 > 0; local160--) {
						this.method91("Error loading - Will retry in " + local160 + " secs.", 10);
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
			this.aClass45_1 = this.method128("title", this.anIntArray25[1], 25, (byte) 7, 1, "title screen");
			this.aClass1_Sub1_Sub2_Sub4_1 = new Class1_Sub1_Sub2_Sub4((byte) 121, "p11", this.aClass45_1);
			this.aClass1_Sub1_Sub2_Sub4_2 = new Class1_Sub1_Sub2_Sub4((byte) 121, "p12", this.aClass45_1);
			this.aClass1_Sub1_Sub2_Sub4_3 = new Class1_Sub1_Sub2_Sub4((byte) 121, "b12", this.aClass45_1);
			this.aClass1_Sub1_Sub2_Sub4_4 = new Class1_Sub1_Sub2_Sub4((byte) 121, "q8", this.aClass45_1);
			this.method112();
			this.method131(aByte18);
			@Pc(265) Class45 local265 = this.method128("config", this.anIntArray25[2], 30, (byte) 7, 2, "config");
			@Pc(277) Class45 local277 = this.method128("interface", this.anIntArray25[3], 35, (byte) 7, 3, "interface");
			@Pc(289) Class45 local289 = this.method128("media", this.anIntArray25[4], 40, (byte) 7, 4, "2d graphics");
			@Pc(301) Class45 local301 = this.method128("textures", this.anIntArray25[6], 45, (byte) 7, 6, "textures");
			@Pc(313) Class45 local313 = this.method128("wordenc", this.anIntArray25[7], 50, (byte) 7, 7, "chat system");
			@Pc(325) Class45 local325 = this.method128("sounds", this.anIntArray25[8], 55, (byte) 7, 8, "sound effects");
			this.aByteArrayArrayArray7 = new byte[4][104][104];
			this.anIntArrayArrayArray3 = new int[4][105][105];
			this.aClass37_1 = new Class37(4, this.anIntArrayArrayArray3, 2, 104, 104);
			for (@Pc(350) int local350 = 0; local350 < 4; local350++) {
				this.aClass17Array1[local350] = new Class17(false, 104, 104);
			}
			this.aClass1_Sub1_Sub2_Sub2_6 = new Class1_Sub1_Sub2_Sub2(512, 512);
			@Pc(385) Class45 local385 = this.method128("versionlist", this.anIntArray25[5], 60, (byte) 7, 5, "update list");
			this.method91("Connecting to update server", 60);
			this.aClass42_Sub1_1 = new Class42_Sub1();
			this.aClass42_Sub1_1.method616(local385, this);
			Class14.method328(this.aClass42_Sub1_1.method619());
			Class1_Sub1_Sub1_Sub5.method276(this.aClass42_Sub1_1.method618(0), this.aClass42_Sub1_1);
			if (!aBoolean47) {
				this.anInt274 = 0;
				this.aBoolean45 = false;
				this.aClass42_Sub1_1.method623(2, this.anInt274);
				while (this.aClass42_Sub1_1.method624() > 0) {
					this.method124();
					try {
						Thread.sleep(100L);
					} catch (@Pc(436) Exception local436) {
					}
				}
			}
			this.method91("Requesting animations", 65);
			@Pc(452) int local452 = this.aClass42_Sub1_1.method618(1);
			for (@Pc(454) int local454 = 0; local454 < local452; local454++) {
				this.aClass42_Sub1_1.method623(1, local454);
			}
			@Pc(473) int local473;
			while (this.aClass42_Sub1_1.method624() > 0) {
				local473 = local452 - this.aClass42_Sub1_1.method624();
				if (local473 > 0) {
					this.method91("Loading animations - " + local473 * 100 / local452 + "%", 65);
				}
				this.method124();
				try {
					Thread.sleep(100L);
				} catch (@Pc(499) Exception local499) {
				}
			}
			this.method91("Requesting models", 70);
			local452 = this.aClass42_Sub1_1.method618(0);
			@Pc(525) int local525;
			for (local473 = 0; local473 < local452; local473++) {
				local525 = this.aClass42_Sub1_1.method622(local473);
				if ((local525 & 0x1) != 0) {
					this.aClass42_Sub1_1.method623(0, local473);
				}
			}
			local452 = this.aClass42_Sub1_1.method624();
			while (this.aClass42_Sub1_1.method624() > 0) {
				local525 = local452 - this.aClass42_Sub1_1.method624();
				if (local525 > 0) {
					this.method91("Loading models - " + local525 * 100 / local452 + "%", 70);
				}
				this.method124();
				try {
					Thread.sleep(100L);
				} catch (@Pc(576) Exception local576) {
				}
			}
			if (this.aClass43Array1[0] != null) {
				this.method91("Requesting maps", 75);
				this.aClass42_Sub1_1.method623(3, this.aClass42_Sub1_1.method620(48, 0, 47));
				this.aClass42_Sub1_1.method623(3, this.aClass42_Sub1_1.method620(48, 1, 47));
				this.aClass42_Sub1_1.method623(3, this.aClass42_Sub1_1.method620(48, 0, 48));
				this.aClass42_Sub1_1.method623(3, this.aClass42_Sub1_1.method620(48, 1, 48));
				this.aClass42_Sub1_1.method623(3, this.aClass42_Sub1_1.method620(48, 0, 49));
				this.aClass42_Sub1_1.method623(3, this.aClass42_Sub1_1.method620(48, 1, 49));
				this.aClass42_Sub1_1.method623(3, this.aClass42_Sub1_1.method620(47, 0, 47));
				this.aClass42_Sub1_1.method623(3, this.aClass42_Sub1_1.method620(47, 1, 47));
				this.aClass42_Sub1_1.method623(3, this.aClass42_Sub1_1.method620(47, 0, 48));
				this.aClass42_Sub1_1.method623(3, this.aClass42_Sub1_1.method620(47, 1, 48));
				this.aClass42_Sub1_1.method623(3, this.aClass42_Sub1_1.method620(148, 0, 48));
				this.aClass42_Sub1_1.method623(3, this.aClass42_Sub1_1.method620(148, 1, 48));
				local452 = this.aClass42_Sub1_1.method624();
				while (this.aClass42_Sub1_1.method624() > 0) {
					local525 = local452 - this.aClass42_Sub1_1.method624();
					if (local525 > 0) {
						this.method91("Loading maps - " + local525 * 100 / local452 + "%", 75);
					}
					this.method124();
					try {
						Thread.sleep(100L);
					} catch (@Pc(761) Exception local761) {
					}
				}
			}
			local452 = this.aClass42_Sub1_1.method618(0);
			@Pc(782) int local782;
			for (local525 = 0; local525 < local452; local525++) {
				local782 = this.aClass42_Sub1_1.method622(local525);
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
					this.aClass42_Sub1_1.method626(local525, 0, local784);
				}
			}
			local452 = this.aClass42_Sub1_1.method618(3);
			for (local782 = 0; local782 < local452; local782++) {
				this.aClass42_Sub1_1.method626(local782, 3, (byte) 2);
			}
			@Pc(888) int local888;
			if (!aBoolean47) {
				local452 = this.aClass42_Sub1_1.method618(2);
				for (local888 = 1; local888 < local452; local888++) {
					this.aClass42_Sub1_1.method626(local888, 2, (byte) 1);
				}
			}
			this.method91("Unpacking media", 80);
			this.aClass1_Sub1_Sub2_Sub3_8 = new Class1_Sub1_Sub2_Sub3(local289, "invback", 0);
			this.aClass1_Sub1_Sub2_Sub3_10 = new Class1_Sub1_Sub2_Sub3(local289, "chatback", 0);
			this.aClass1_Sub1_Sub2_Sub3_9 = new Class1_Sub1_Sub2_Sub3(local289, "mapback", 0);
			this.aClass1_Sub1_Sub2_Sub3_18 = new Class1_Sub1_Sub2_Sub3(local289, "backbase1", 0);
			this.aClass1_Sub1_Sub2_Sub3_19 = new Class1_Sub1_Sub2_Sub3(local289, "backbase2", 0);
			this.aClass1_Sub1_Sub2_Sub3_20 = new Class1_Sub1_Sub2_Sub3(local289, "backhmid1", 0);
			for (local888 = 0; local888 < 13; local888++) {
				this.aClass1_Sub1_Sub2_Sub3Array1[local888] = new Class1_Sub1_Sub2_Sub3(local289, "sideicons", local888);
			}
			this.aClass1_Sub1_Sub2_Sub2_11 = new Class1_Sub1_Sub2_Sub2(local289, "compass", 0);
			@Pc(982) int local982;
			try {
				for (local982 = 0; local982 < 50; local982++) {
					this.aClass1_Sub1_Sub2_Sub3Array2[local982] = new Class1_Sub1_Sub2_Sub3(local289, "mapscene", local982);
				}
			} catch (@Pc(1000) Exception local1000) {
			}
			try {
				for (local982 = 0; local982 < 50; local982++) {
					this.aClass1_Sub1_Sub2_Sub2Array4[local982] = new Class1_Sub1_Sub2_Sub2(local289, "mapfunction", local982);
				}
			} catch (@Pc(1020) Exception local1020) {
			}
			try {
				for (local982 = 0; local982 < 20; local982++) {
					this.aClass1_Sub1_Sub2_Sub2Array5[local982] = new Class1_Sub1_Sub2_Sub2(local289, "hitmarks", local982);
				}
			} catch (@Pc(1040) Exception local1040) {
			}
			try {
				for (local982 = 0; local982 < 20; local982++) {
					this.aClass1_Sub1_Sub2_Sub2Array3[local982] = new Class1_Sub1_Sub2_Sub2(local289, "headicons", local982);
				}
			} catch (@Pc(1060) Exception local1060) {
			}
			this.aClass1_Sub1_Sub2_Sub2_1 = new Class1_Sub1_Sub2_Sub2(local289, "mapflag", 0);
			for (local982 = 0; local982 < 8; local982++) {
				this.aClass1_Sub1_Sub2_Sub2Array6[local982] = new Class1_Sub1_Sub2_Sub2(local289, "cross", local982);
			}
			this.aClass1_Sub1_Sub2_Sub2_7 = new Class1_Sub1_Sub2_Sub2(local289, "mapdots", 0);
			this.aClass1_Sub1_Sub2_Sub2_8 = new Class1_Sub1_Sub2_Sub2(local289, "mapdots", 1);
			this.aClass1_Sub1_Sub2_Sub2_9 = new Class1_Sub1_Sub2_Sub2(local289, "mapdots", 2);
			this.aClass1_Sub1_Sub2_Sub2_10 = new Class1_Sub1_Sub2_Sub2(local289, "mapdots", 3);
			this.aClass1_Sub1_Sub2_Sub3_6 = new Class1_Sub1_Sub2_Sub3(local289, "scrollbar", 0);
			this.aClass1_Sub1_Sub2_Sub3_7 = new Class1_Sub1_Sub2_Sub3(local289, "scrollbar", 1);
			this.aClass1_Sub1_Sub2_Sub3_13 = new Class1_Sub1_Sub2_Sub3(local289, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_14 = new Class1_Sub1_Sub2_Sub3(local289, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_15 = new Class1_Sub1_Sub2_Sub3(local289, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_16 = new Class1_Sub1_Sub2_Sub3(local289, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_16.method420();
			this.aClass1_Sub1_Sub2_Sub3_17 = new Class1_Sub1_Sub2_Sub3(local289, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_17.method420();
			this.aClass1_Sub1_Sub2_Sub3_1 = new Class1_Sub1_Sub2_Sub3(local289, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_1.method421();
			this.aClass1_Sub1_Sub2_Sub3_2 = new Class1_Sub1_Sub2_Sub3(local289, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_2.method421();
			this.aClass1_Sub1_Sub2_Sub3_3 = new Class1_Sub1_Sub2_Sub3(local289, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_3.method421();
			this.aClass1_Sub1_Sub2_Sub3_4 = new Class1_Sub1_Sub2_Sub3(local289, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_4.method420();
			this.aClass1_Sub1_Sub2_Sub3_4.method421();
			this.aClass1_Sub1_Sub2_Sub3_5 = new Class1_Sub1_Sub2_Sub3(local289, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_5.method420();
			this.aClass1_Sub1_Sub2_Sub3_5.method421();
			@Pc(1257) Class1_Sub1_Sub2_Sub2 local1257 = new Class1_Sub1_Sub2_Sub2(local289, "backleft1", 0);
			this.aClass36_19 = new Class36((byte) 9, local1257.anInt686, local1257.anInt685, this.method89(aByte21));
			local1257.method393(0, 0);
			@Pc(1282) Class1_Sub1_Sub2_Sub2 local1282 = new Class1_Sub1_Sub2_Sub2(local289, "backleft2", 0);
			this.aClass36_20 = new Class36((byte) 9, local1282.anInt686, local1282.anInt685, this.method89(aByte21));
			local1282.method393(0, 0);
			@Pc(1307) Class1_Sub1_Sub2_Sub2 local1307 = new Class1_Sub1_Sub2_Sub2(local289, "backright1", 0);
			this.aClass36_21 = new Class36((byte) 9, local1307.anInt686, local1307.anInt685, this.method89(aByte21));
			local1307.method393(0, 0);
			@Pc(1332) Class1_Sub1_Sub2_Sub2 local1332 = new Class1_Sub1_Sub2_Sub2(local289, "backright2", 0);
			this.aClass36_22 = new Class36((byte) 9, local1332.anInt686, local1332.anInt685, this.method89(aByte21));
			local1332.method393(0, 0);
			@Pc(1357) Class1_Sub1_Sub2_Sub2 local1357 = new Class1_Sub1_Sub2_Sub2(local289, "backtop1", 0);
			this.aClass36_23 = new Class36((byte) 9, local1357.anInt686, local1357.anInt685, this.method89(aByte21));
			local1357.method393(0, 0);
			@Pc(1382) Class1_Sub1_Sub2_Sub2 local1382 = new Class1_Sub1_Sub2_Sub2(local289, "backtop2", 0);
			this.aClass36_24 = new Class36((byte) 9, local1382.anInt686, local1382.anInt685, this.method89(aByte21));
			local1382.method393(0, 0);
			@Pc(1407) Class1_Sub1_Sub2_Sub2 local1407 = new Class1_Sub1_Sub2_Sub2(local289, "backvmid1", 0);
			this.aClass36_25 = new Class36((byte) 9, local1407.anInt686, local1407.anInt685, this.method89(aByte21));
			local1407.method393(0, 0);
			@Pc(1432) Class1_Sub1_Sub2_Sub2 local1432 = new Class1_Sub1_Sub2_Sub2(local289, "backvmid2", 0);
			this.aClass36_26 = new Class36((byte) 9, local1432.anInt686, local1432.anInt685, this.method89(aByte21));
			local1432.method393(0, 0);
			@Pc(1457) Class1_Sub1_Sub2_Sub2 local1457 = new Class1_Sub1_Sub2_Sub2(local289, "backvmid3", 0);
			this.aClass36_27 = new Class36((byte) 9, local1457.anInt686, local1457.anInt685, this.method89(aByte21));
			local1457.method393(0, 0);
			@Pc(1482) Class1_Sub1_Sub2_Sub2 local1482 = new Class1_Sub1_Sub2_Sub2(local289, "backhmid2", 0);
			this.aClass36_28 = new Class36((byte) 9, local1482.anInt686, local1482.anInt685, this.method89(aByte21));
			local1482.method393(0, 0);
			@Pc(1507) int local1507 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1514) int local1514 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1521) int local1521 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1528) int local1528 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1530) int local1530 = 0; local1530 < 50; local1530++) {
				if (this.aClass1_Sub1_Sub2_Sub2Array4[local1530] != null) {
					this.aClass1_Sub1_Sub2_Sub2Array4[local1530].method392(local1507 + local1528, local1514 + local1528, local1521 + local1528);
				}
				if (this.aClass1_Sub1_Sub2_Sub3Array2[local1530] != null) {
					this.aClass1_Sub1_Sub2_Sub3Array2[local1530].method422(local1507 + local1528, (byte) 3, local1514 + local1528, local1521 + local1528);
				}
			}
			this.method91("Unpacking textures", 83);
			Class1_Sub1_Sub2_Sub1.method357(local301);
			Class1_Sub1_Sub2_Sub1.method361((byte) 8, 0.8D);
			Class1_Sub1_Sub2_Sub1.method356();
			this.method91("Unpacking config", 86);
			Class25.method484(local265, 439);
			Class9.method248(local265);
			Class19.method404(local265);
			Class13.method315(local265);
			Class11.method304(local265);
			Class21.method425(local265, 439);
			Class27.method489(local265, 439);
			Class29.method493(local265);
			Class13.aBoolean121 = aBoolean46;
			if (!aBoolean47) {
				this.method91("Unpacking sounds", 90);
				@Pc(1630) byte[] local1630 = local325.method644("sounds.dat", null);
				@Pc(1636) Class1_Sub1_Sub3 local1636 = new Class1_Sub1_Sub3(local1630, true);
				Class5.method73(local1636, 439);
			}
			this.method91("Unpacking interfaces", 95);
			@Pc(1667) Class1_Sub1_Sub2_Sub4[] local1667 = new Class1_Sub1_Sub2_Sub4[] { this.aClass1_Sub1_Sub2_Sub4_1, this.aClass1_Sub1_Sub2_Sub4_2, this.aClass1_Sub1_Sub2_Sub4_3, this.aClass1_Sub1_Sub2_Sub4_4 };
			Class6.method223(local1667, local289, local277);
			this.method91("Preparing game engine", 100);
			@Pc(1683) int local1683;
			@Pc(1685) int local1685;
			@Pc(1687) int local1687;
			for (@Pc(1679) int local1679 = 0; local1679 < 33; local1679++) {
				local1683 = 999;
				local1685 = 0;
				for (local1687 = 0; local1687 < 35; local1687++) {
					if (this.aClass1_Sub1_Sub2_Sub3_9.aByteArray7[local1687 + local1679 * this.aClass1_Sub1_Sub2_Sub3_9.anInt724] == 0) {
						if (local1683 == 999) {
							local1683 = local1687;
						}
					} else if (local1683 != 999) {
						local1685 = local1687;
						break;
					}
				}
				this.anIntArray76[local1679] = local1683;
				this.anIntArray41[local1679] = local1685 - local1683;
			}
			@Pc(1745) int local1745;
			for (local1683 = 9; local1683 < 160; local1683++) {
				local1685 = 999;
				local1687 = 0;
				for (local1745 = 10; local1745 < 168; local1745++) {
					if (this.aClass1_Sub1_Sub2_Sub3_9.aByteArray7[local1745 + local1683 * this.aClass1_Sub1_Sub2_Sub3_9.anInt724] == 0 && (local1745 > 34 || local1683 > 34)) {
						if (local1685 == 999) {
							local1685 = local1745;
						}
					} else if (local1685 != 999) {
						local1687 = local1745;
						break;
					}
				}
				this.anIntArray36[local1683 - 9] = local1685 - 21;
				this.anIntArray71[local1683 - 9] = local1687 - local1685;
			}
			Class1_Sub1_Sub2_Sub1.method354(479, 96);
			this.anIntArray65 = Class1_Sub1_Sub2_Sub1.anIntArray175;
			Class1_Sub1_Sub2_Sub1.method354(190, 261);
			this.anIntArray66 = Class1_Sub1_Sub2_Sub1.anIntArray175;
			Class1_Sub1_Sub2_Sub1.method354(512, 334);
			this.anIntArray67 = Class1_Sub1_Sub2_Sub1.anIntArray175;
			@Pc(1829) int[] local1829 = new int[9];
			for (local1687 = 0; local1687 < 9; local1687++) {
				local1745 = local1687 * 32 + 128 + 15;
				@Pc(1847) int local1847 = local1745 * 3 + 600;
				@Pc(1851) int local1851 = Class1_Sub1_Sub2_Sub1.anIntArray173[local1745];
				local1829[local1687] = local1847 * local1851 >> 16;
			}
			Class37.method586(458, local1829);
			Class32.method503(local313);
		} catch (@Pc(1874) Exception local1874) {
			signlink.reporterror("loaderror " + this.aString18 + " " + this.anInt277);
			this.aBoolean41 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!ob;)V")
	private void method136(@OriginalArg(1) Class1_Sub2 arg0) {
		try {
			@Pc(7) int local7 = 0;
			@Pc(9) int local9 = -1;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			if (arg0.anInt829 == 0) {
				local7 = this.aClass37_1.method576(arg0.anInt828, arg0.anInt830, arg0.anInt831);
			}
			if (arg0.anInt829 == 1) {
				local7 = this.aClass37_1.method577(arg0.anInt830, this.aBoolean43, arg0.anInt831, arg0.anInt828);
			}
			if (arg0.anInt829 == 2) {
				local7 = this.aClass37_1.method578(arg0.anInt828, arg0.anInt830, arg0.anInt831);
			}
			if (arg0.anInt829 == 3) {
				local7 = this.aClass37_1.method579(arg0.anInt828, arg0.anInt830, arg0.anInt831);
			}
			if (local7 != 0) {
				@Pc(83) int local83 = this.aClass37_1.method580(arg0.anInt828, arg0.anInt830, arg0.anInt831, local7);
				local9 = local7 >> 14 & 0x7FFF;
				local11 = local83 & 0x1F;
				local13 = local83 >> 6;
			}
			arg0.anInt832 = local9;
			arg0.anInt834 = local11;
			arg0.anInt833 = local13;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("30694, " + false + ", " + arg0 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method137() {
		try {
			@Pc(4) Graphics local4 = this.method89(aByte21).getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 789, 532);
			this.method82();
			@Pc(46) byte local46;
			@Pc(52) int local52;
			if (this.aBoolean41) {
				this.aBoolean55 = false;
				local4.setFont(new Font("Helvetica", 1, 16));
				local4.setColor(Color.yellow);
				local46 = 35;
				local4.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
				local52 = local46 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				@Pc(61) int local61 = local52 + 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				@Pc(78) int local78 = local61 + 30;
				local4.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
				@Pc(84) int local84 = local78 + 30;
				local4.drawString("3: Try using a different game-world", 30, 195);
				@Pc(90) int local90 = local84 + 30;
				local4.drawString("4: Try rebooting your computer", 30, 225);
				@Pc(96) int local96 = local90 + 30;
				local4.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
			}
			if (this.aBoolean73) {
				this.aBoolean55 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean65) {
				this.aBoolean55 = false;
				local4.setColor(Color.yellow);
				local46 = 35;
				local4.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
				local52 = local46 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				local52 += 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				local52 += 30;
				local4.drawString("2: Try rebooting your computer, and reloading", 30, 165);
				local52 += 30;
			}
		} catch (@Pc(184) RuntimeException local184) {
			signlink.reporterror("12920, " + -12973 + ", " + local184.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method138(@OriginalArg(0) int arg0) {
		try {
			@Pc(9) int local9 = (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 >> 7) + this.anInt286;
			@Pc(17) int local17 = (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 >> 7) + this.anInt287;
			if (local9 >= 2944 && local9 < 3392 && local17 >= 3520 && local17 < 6400) {
				this.anInt394 = (local17 - 3520) / 8 + 1;
			} else if (local9 >= 2944 && local9 < 3392 && local17 >= 9920 && local17 < 12800) {
				this.anInt394 = (local17 - 9920) / 8 + 1;
			} else {
				this.anInt394 = 0;
			}
			this.anInt367 = 0;
			if (local9 >= 3328 && local9 < 3392 && local17 >= 3200 && local17 < 3264) {
				@Pc(85) int local85 = local9 & 0x3F;
				@Pc(89) int local89 = local17 & 0x3F;
				if (local85 >= 4 && local85 <= 29 && local89 >= 44 && local89 <= 58) {
					this.anInt367 = 1;
				}
				if (local85 >= 36 && local85 <= 61 && local89 >= 44 && local89 <= 58) {
					this.anInt367 = 1;
				}
				if (local85 >= 4 && local85 <= 29 && local89 >= 25 && local89 <= 39) {
					this.anInt367 = 1;
				}
				if (local85 >= 36 && local85 <= 61 && local89 >= 25 && local89 <= 39) {
					this.anInt367 = 1;
				}
				if (local85 >= 4 && local85 <= 29 && local89 >= 6 && local89 <= 20) {
					this.anInt367 = 1;
				}
				if (local85 >= 36 && local85 <= 61 && local89 >= 6 && local89 <= 20) {
					this.anInt367 = 1;
				}
			}
			if (this.anInt367 == 0 && local9 >= 3328 && local9 <= 3393 && local17 >= 3203 && local17 <= 3325) {
				this.anInt367 = 2;
			}
			this.anInt383 = 0;
			@Pc(204) boolean local204 = false;
			if (local9 >= 3053 && local9 <= 3156 && local17 >= 3056 && local17 <= 3136) {
				this.anInt383 = 1;
			}
			if (local9 >= 3072 && local9 <= 3118 && local17 >= 9492 && local17 <= 9535) {
				this.anInt383 = 1;
			}
			if (this.anInt383 == 1 && local9 >= 3139 && local9 <= 3199 && local17 >= 3008 && local17 <= 3062) {
				this.anInt383 = 0;
			}
		} catch (@Pc(255) RuntimeException local255) {
			signlink.reporterror("55580, " + arg0 + ", " + local255.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;BI)V")
	@Override
	protected void method91(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt277 = arg1;
			this.aString18 = arg0;
			this.method202(595);
			if (this.aClass45_1 == null) {
				super.method91(arg0, arg1);
			} else {
				this.aClass36_8.method546();
				this.aClass1_Sub1_Sub2_Sub4_3.method441(this.aByte28, "RuneScape is loading - please wait...", 180, 54, 16777215);
				Class1_Sub1_Sub2.method438(62, 28, 304, 9179409, 34);
				Class1_Sub1_Sub2.method438(63, 29, 302, 0, 32);
				Class1_Sub1_Sub2.method437(30, 64, arg1 * 3, 30, 9179409);
				Class1_Sub1_Sub2.method437(30, 64, 300 - arg1 * 3, arg1 * 3 + 30, 0);
				this.aClass1_Sub1_Sub2_Sub4_3.method441(this.aByte28, arg0, 180, 85, 16777215);
				this.aClass36_8.method547(214, super.aGraphics2, 186);
				if (this.aBoolean57) {
					this.aBoolean57 = false;
					if (!this.aBoolean55) {
						this.aClass36_9.method547(0, super.aGraphics2, 0);
						this.aClass36_10.method547(661, super.aGraphics2, 0);
					}
					this.aClass36_6.method547(128, super.aGraphics2, 0);
					this.aClass36_7.method547(214, super.aGraphics2, 386);
					this.aClass36_11.method547(0, super.aGraphics2, 265);
					this.aClass36_12.method547(574, super.aGraphics2, 265);
					this.aClass36_13.method547(128, super.aGraphics2, 186);
					this.aClass36_14.method547(574, super.aGraphics2, 186);
				}
			}
		} catch (@Pc(216) RuntimeException local216) {
			signlink.reporterror("29726, " + arg0 + ", " + 4 + ", " + arg1 + ", " + local216.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIZII)V")
	private void method139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(1) Class1_Sub2 local1 = null;
			for (@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) this.aClass31_1.method498(); local6 != null; local6 = (Class1_Sub2) this.aClass31_1.method500()) {
				if (local6.anInt828 == arg7 && local6.anInt830 == arg8 && local6.anInt831 == arg6 && local6.anInt829 == arg4) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class1_Sub2();
				local1.anInt828 = arg7;
				local1.anInt829 = arg4;
				local1.anInt830 = arg8;
				local1.anInt831 = arg6;
				this.method136(local1);
				this.aClass31_1.method495(local1);
			}
			local1.anInt835 = arg5;
			local1.anInt837 = arg0;
			local1.anInt836 = arg1;
			local1.anInt838 = arg3;
			local1.anInt839 = arg2;
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("38744, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + true + ", " + arg7 + ", " + arg8 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIB)V")
	private void method140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) int local5 = 0;
			for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
				if (this.aStringArray4[local7] != null) {
					@Pc(19) int local19 = this.anIntArray49[local7];
					@Pc(30) int local30 = this.anInt423 + 70 + 4 - local5 * 14;
					if (local30 < -20) {
						break;
					}
					if (local19 == 0) {
						local5++;
					}
					if ((local19 == 1 || local19 == 2) && (local19 == 1 || this.anInt356 == 0 || this.anInt356 == 1 && this.method154(this.aStringArray3[local7]))) {
						if (arg1 > local30 - 14 && arg1 <= local30 && !this.aStringArray3[local7].equals(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4)) {
							if (this.aBoolean58) {
								this.aStringArray2[this.anInt388] = "Report abuse @whi@" + this.aStringArray3[local7];
								this.anIntArray82[this.anInt388] = 34;
								this.anInt388++;
							}
							this.aStringArray2[this.anInt388] = "Add ignore @whi@" + this.aStringArray3[local7];
							this.anIntArray82[this.anInt388] = 436;
							this.anInt388++;
							this.aStringArray2[this.anInt388] = "Add friend @whi@" + this.aStringArray3[local7];
							this.anIntArray82[this.anInt388] = 406;
							this.anInt388++;
						}
						local5++;
					}
					if ((local19 == 3 || local19 == 7) && this.anInt426 == 0 && (local19 == 7 || this.anInt390 == 0 || this.anInt390 == 1 && this.method154(this.aStringArray3[local7]))) {
						if (arg1 > local30 - 14 && arg1 <= local30) {
							if (this.aBoolean58) {
								this.aStringArray2[this.anInt388] = "Report abuse @whi@" + this.aStringArray3[local7];
								this.anIntArray82[this.anInt388] = 34;
								this.anInt388++;
							}
							this.aStringArray2[this.anInt388] = "Add ignore @whi@" + this.aStringArray3[local7];
							this.anIntArray82[this.anInt388] = 436;
							this.anInt388++;
							this.aStringArray2[this.anInt388] = "Add friend @whi@" + this.aStringArray3[local7];
							this.anIntArray82[this.anInt388] = 406;
							this.anInt388++;
						}
						local5++;
					}
					if (local19 == 4 && (this.anInt293 == 0 || this.anInt293 == 1 && this.method154(this.aStringArray3[local7]))) {
						if (arg1 > local30 - 14 && arg1 <= local30) {
							this.aStringArray2[this.anInt388] = "Accept trade @whi@" + this.aStringArray3[local7];
							this.anIntArray82[this.anInt388] = 903;
							this.anInt388++;
						}
						local5++;
					}
					if ((local19 == 5 || local19 == 6) && this.anInt426 == 0 && this.anInt390 < 2) {
						local5++;
					}
					if (local19 == 8 && (this.anInt293 == 0 || this.anInt293 == 1 && this.method154(this.aStringArray3[local7]))) {
						if (arg1 > local30 - 14 && arg1 <= local30) {
							this.aStringArray2[this.anInt388] = "Accept duel @whi@" + this.aStringArray3[local7];
							this.anIntArray82[this.anInt388] = 363;
							this.anInt388++;
						}
						local5++;
					}
				}
			}
		} catch (@Pc(409) RuntimeException local409) {
			signlink.reporterror("40547, " + arg0 + ", " + arg1 + ", " + -7 + ", " + local409.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!d;)V")
	private void method141(@OriginalArg(0) byte arg0, @OriginalArg(1) Class6 arg1) {
		try {
			if (arg0 != 5) {
				aBoolean54 = !aBoolean54;
			}
			@Pc(13) int local13 = arg1.anInt455;
			if (local13 >= 1 && local13 <= 100) {
				local13--;
				if (local13 >= this.anInt339) {
					arg1.aString19 = "";
					arg1.anInt454 = 0;
				} else {
					arg1.aString19 = this.aStringArray5[local13];
					arg1.anInt454 = 1;
				}
			} else if (local13 >= 101 && local13 <= 200) {
				local13 -= 101;
				if (local13 >= this.anInt339) {
					arg1.aString19 = "";
					arg1.anInt454 = 0;
				} else {
					if (this.anIntArray79[local13] == 0) {
						arg1.aString19 = "@red@Offline";
					} else if (this.anIntArray79[local13] == anInt275) {
						arg1.aString19 = "@gre@World-" + (this.anIntArray79[local13] - 9);
					} else {
						arg1.aString19 = "@yel@World-" + (this.anIntArray79[local13] - 9);
					}
					arg1.anInt454 = 1;
				}
			} else if (local13 == 203) {
				arg1.anInt461 = this.anInt339 * 15 + 20;
				if (arg1.anInt461 <= arg1.anInt457) {
					arg1.anInt461 = arg1.anInt457 + 1;
				}
			} else if (local13 >= 401 && local13 <= 500) {
				local13 -= 401;
				if (local13 >= this.anInt273) {
					arg1.aString19 = "";
					arg1.anInt454 = 0;
				} else {
					arg1.aString19 = Class46.method649(Class46.method646(this.aLongArray4[local13]));
					arg1.anInt454 = 1;
				}
			} else if (local13 == 503) {
				arg1.anInt461 = this.anInt273 * 15 + 20;
				if (arg1.anInt461 <= arg1.anInt457) {
					arg1.anInt461 = arg1.anInt457 + 1;
				}
			} else if (local13 == 327) {
				arg1.anInt476 = 150;
				arg1.anInt477 = (int) (Math.sin((double) anInt363 / 40.0D) * 256.0D) & 0x7FF;
				if (this.aBoolean69) {
					for (@Pc(210) int local210 = 0; local210 < 7; local210++) {
						@Pc(217) int local217 = this.anIntArray61[local210];
						if (local217 >= 0 && !Class21.aClass21Array1[local217].method427()) {
							return;
						}
					}
					this.aBoolean69 = false;
					@Pc(236) Class1_Sub1_Sub1_Sub5[] local236 = new Class1_Sub1_Sub1_Sub5[7];
					@Pc(238) int local238 = 0;
					for (@Pc(240) int local240 = 0; local240 < 7; local240++) {
						@Pc(247) int local247 = this.anIntArray61[local240];
						if (local247 >= 0) {
							local236[local238++] = Class21.aClass21Array1[local247].method428(208);
						}
					}
					@Pc(269) Class1_Sub1_Sub1_Sub5 local269 = new Class1_Sub1_Sub1_Sub5(local238, local236, (byte) 4);
					for (@Pc(271) int local271 = 0; local271 < 5; local271++) {
						if (this.anIntArray42[local271] != 0) {
							local269.method293(anIntArrayArray3[local271][0], anIntArrayArray3[local271][this.anIntArray42[local271]]);
							if (local271 == 1) {
								local269.method293(anIntArray58[0], anIntArray58[this.anIntArray42[local271]]);
							}
						}
					}
					local269.method286();
					local269.method287(Class25.aClass25Array1[aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt132].anIntArray215[0]);
					local269.method296(64, 850, -30, -50, -30, true);
					arg1.anInt469 = 5;
					arg1.anInt470 = 0;
					Class6.method226(local269);
				}
			} else if (local13 == 324) {
				if (this.aClass1_Sub1_Sub2_Sub2_2 == null) {
					this.aClass1_Sub1_Sub2_Sub2_2 = arg1.aClass1_Sub1_Sub2_Sub2_12;
					this.aClass1_Sub1_Sub2_Sub2_3 = arg1.aClass1_Sub1_Sub2_Sub2_13;
				}
				if (this.aBoolean70) {
					arg1.aClass1_Sub1_Sub2_Sub2_12 = this.aClass1_Sub1_Sub2_Sub2_3;
				} else {
					arg1.aClass1_Sub1_Sub2_Sub2_12 = this.aClass1_Sub1_Sub2_Sub2_2;
				}
			} else if (local13 == 325) {
				if (this.aClass1_Sub1_Sub2_Sub2_2 == null) {
					this.aClass1_Sub1_Sub2_Sub2_2 = arg1.aClass1_Sub1_Sub2_Sub2_12;
					this.aClass1_Sub1_Sub2_Sub2_3 = arg1.aClass1_Sub1_Sub2_Sub2_13;
				}
				if (this.aBoolean70) {
					arg1.aClass1_Sub1_Sub2_Sub2_12 = this.aClass1_Sub1_Sub2_Sub2_2;
				} else {
					arg1.aClass1_Sub1_Sub2_Sub2_12 = this.aClass1_Sub1_Sub2_Sub2_3;
				}
			} else if (local13 == 600) {
				arg1.aString19 = this.aString7;
				if (anInt363 % 20 < 10) {
					arg1.aString19 = arg1.aString19 + "|";
				} else {
					arg1.aString19 = arg1.aString19 + " ";
				}
			} else {
				if (local13 == 613) {
					if (!this.aBoolean58) {
						arg1.aString19 = "";
					} else if (this.aBoolean44) {
						arg1.anInt466 = 16711680;
						arg1.aString19 = "Moderator option: Mute player for 48 hours: <ON>";
					} else {
						arg1.anInt466 = 16777215;
						arg1.aString19 = "Moderator option: Mute player for 48 hours: <OFF>";
					}
				}
				@Pc(476) String local476;
				if (local13 == 650 || local13 == 655) {
					if (this.anInt340 == 0) {
						arg1.aString19 = "";
					} else {
						if (this.anInt265 == 0) {
							local476 = "earlier today";
						} else if (this.anInt265 == 1) {
							local476 = "yesterday";
						} else {
							local476 = this.anInt265 + " days ago";
						}
						arg1.aString19 = "You last logged in " + local476 + " from: " + signlink.dns;
					}
				}
				if (local13 == 651) {
					if (this.anInt332 == 0) {
						arg1.aString19 = "0 unread messages";
						arg1.anInt466 = 16776960;
					}
					if (this.anInt332 == 1) {
						arg1.aString19 = "1 unread message";
						arg1.anInt466 = 65280;
					}
					if (this.anInt332 > 1) {
						arg1.aString19 = this.anInt332 + " unread messages";
						arg1.anInt466 = 65280;
					}
				}
				if (local13 == 652) {
					if (this.anInt403 == 201) {
						arg1.aString19 = "";
					} else if (this.anInt403 == 200) {
						arg1.aString19 = "You have not yet set any password recovery questions.";
					} else {
						if (this.anInt403 == 0) {
							local476 = "Earlier today";
						} else if (this.anInt403 == 1) {
							local476 = "Yesterday";
						} else {
							local476 = this.anInt403 + " days ago";
						}
						arg1.aString19 = local476 + " you changed your recovery questions";
					}
				}
				if (local13 == 653) {
					if (this.anInt403 == 201) {
						arg1.aString19 = "";
					} else if (this.anInt403 == 200) {
						arg1.aString19 = "We strongly recommend you do so now to secure your account.";
					} else {
						arg1.aString19 = "If you do not remember making this change then cancel it immediately";
					}
				}
				if (local13 == 654) {
					if (this.anInt403 == 201) {
						arg1.aString19 = "";
					} else if (this.anInt403 == 200) {
						arg1.aString19 = "Do this from the 'account management' area on our front webpage";
					} else {
						arg1.aString19 = "Do this from the 'account management' area on our front webpage";
					}
				}
			}
		} catch (@Pc(658) RuntimeException local658) {
			signlink.reporterror("70533, " + arg0 + ", " + arg1 + ", " + local658.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)Z")
	private boolean method142(@OriginalArg(0) int arg0) {
		try {
			if (arg0 <= 0) {
				for (@Pc(3) int local3 = 1; local3 > 0; local3++) {
				}
			}
			return signlink.wavereplay();
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("5347, " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method143(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = 92 / arg0;
			for (@Pc(5) int local5 = 0; local5 < this.anInt353; local5++) {
				@Pc(15) Class1_Sub1_Sub1_Sub1_Sub1 local15 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray64[local5]];
				@Pc(24) int local24 = (this.anIntArray64[local5] << 14) + 536870912;
				if (local15 != null && local15.method44()) {
					@Pc(35) int local35 = local15.anInt128 >> 7;
					@Pc(40) int local40 = local15.anInt129 >> 7;
					if (local35 >= 0 && local35 < 104 && local40 >= 0 && local40 < 104) {
						if (local15.anInt131 == 1 && (local15.anInt128 & 0x7F) == 64 && (local15.anInt129 & 0x7F) == 64) {
							if (this.anIntArrayArray5[local35][local40] == this.anInt368) {
								continue;
							}
							this.anIntArrayArray5[local35][local40] = this.anInt368;
						}
						this.aClass37_1.method561(local15.aBoolean20, local24, this.method194(this.anInt324, local15.anInt129, local15.anInt128), (local15.anInt131 - 1) * 64 + 60, this.anInt324, local15.anInt130, local15, local15.anInt128, local15.anInt129);
					}
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("15397, " + arg0 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
	private void method144() {
		try {
			if (super.anInt236 == 1) {
				if (super.anInt237 >= 8 && super.anInt237 <= 108 && super.anInt238 >= 490 && super.anInt238 <= 522) {
					this.anInt356 = (this.anInt356 + 1) % 4;
					this.aBoolean35 = true;
					this.aBoolean61 = true;
					this.aClass1_Sub1_Sub3_2.method457(130);
					this.aClass1_Sub1_Sub3_2.method458(this.anInt356);
					this.aClass1_Sub1_Sub3_2.method458(this.anInt390);
					this.aClass1_Sub1_Sub3_2.method458(this.anInt293);
				}
				if (super.anInt237 >= 137 && super.anInt237 <= 237 && super.anInt238 >= 490 && super.anInt238 <= 522) {
					this.anInt390 = (this.anInt390 + 1) % 3;
					this.aBoolean35 = true;
					this.aBoolean61 = true;
					this.aClass1_Sub1_Sub3_2.method457(130);
					this.aClass1_Sub1_Sub3_2.method458(this.anInt356);
					this.aClass1_Sub1_Sub3_2.method458(this.anInt390);
					this.aClass1_Sub1_Sub3_2.method458(this.anInt293);
				}
				if (super.anInt237 >= 275 && super.anInt237 <= 375 && super.anInt238 >= 490 && super.anInt238 <= 522) {
					this.anInt293 = (this.anInt293 + 1) % 3;
					this.aBoolean35 = true;
					this.aBoolean61 = true;
					this.aClass1_Sub1_Sub3_2.method457(130);
					this.aClass1_Sub1_Sub3_2.method458(this.anInt356);
					this.aClass1_Sub1_Sub3_2.method458(this.anInt390);
					this.aClass1_Sub1_Sub3_2.method458(this.anInt293);
				}
				if (super.anInt237 >= 416 && super.anInt237 <= 516 && super.anInt238 >= 490 && super.anInt238 <= 522) {
					this.method109();
					this.aString7 = "";
					this.aBoolean44 = false;
					for (@Pc(185) int local185 = 0; local185 < Class6.aClass6Array1.length; local185++) {
						if (Class6.aClass6Array1[local185] != null && Class6.aClass6Array1[local185].anInt455 == 600) {
							this.anInt334 = this.anInt296 = Class6.aClass6Array1[local185].anInt452;
							return;
						}
					}
					return;
				}
			}
		} catch (@Pc(214) RuntimeException local214) {
			signlink.reporterror("31913, " + 7 + ", " + local214.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)I")
	private int method145() {
		try {
			@Pc(10) int local10 = 3;
			if (this.anInt261 < 310) {
				@Pc(19) int local19 = this.anInt258 >> 7;
				@Pc(24) int local24 = this.anInt260 >> 7;
				@Pc(29) int local29 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 >> 7;
				@Pc(34) int local34 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 >> 7;
				if ((this.aByteArrayArrayArray7[this.anInt324][local19][local24] & 0x4) != 0) {
					local10 = this.anInt324;
				}
				@Pc(56) int local56;
				if (local29 > local19) {
					local56 = local29 - local19;
				} else {
					local56 = local19 - local29;
				}
				@Pc(69) int local69;
				if (local34 > local24) {
					local69 = local34 - local24;
				} else {
					local69 = local24 - local34;
				}
				@Pc(84) int local84;
				@Pc(86) int local86;
				if (local56 > local69) {
					local84 = local69 * 65536 / local56;
					local86 = 32768;
					while (local19 != local29) {
						if (local19 < local29) {
							local19++;
						} else if (local19 > local29) {
							local19--;
						}
						if ((this.aByteArrayArrayArray7[this.anInt324][local19][local24] & 0x4) != 0) {
							local10 = this.anInt324;
						}
						local86 += local84;
						if (local86 >= 65536) {
							local86 -= 65536;
							if (local24 < local34) {
								local24++;
							} else if (local24 > local34) {
								local24--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt324][local19][local24] & 0x4) != 0) {
								local10 = this.anInt324;
							}
						}
					}
				} else {
					local84 = local56 * 65536 / local69;
					local86 = 32768;
					while (local24 != local34) {
						if (local24 < local34) {
							local24++;
						} else if (local24 > local34) {
							local24--;
						}
						if ((this.aByteArrayArrayArray7[this.anInt324][local19][local24] & 0x4) != 0) {
							local10 = this.anInt324;
						}
						local86 += local84;
						if (local86 >= 65536) {
							local86 -= 65536;
							if (local19 < local29) {
								local19++;
							} else if (local19 > local29) {
								local19--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt324][local19][local24] & 0x4) != 0) {
								local10 = this.anInt324;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray7[this.anInt324][aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 >> 7][aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 >> 7] & 0x4) != 0) {
				local10 = this.anInt324;
			}
			return local10;
		} catch (@Pc(252) RuntimeException local252) {
			signlink.reporterror("27307, " + false + ", " + local252.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)I")
	private int method146() {
		try {
			@Pc(9) int local9 = this.method194(this.anInt324, this.anInt260, this.anInt258);
			return local9 - this.anInt259 >= 800 || (this.aByteArrayArrayArray7[this.anInt324][this.anInt258 >> 7][this.anInt260 >> 7] & 0x4) == 0 ? 3 : this.anInt324;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("8017, " + true + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean63) {
			this.method106();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!mb;)V")
	private void method147(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2) {
		try {
			@Pc(7) int local7 = arg2.method479(this.anInt312, 8);
			@Pc(13) int local13;
			if (local7 < this.anInt386) {
				for (local13 = local7; local13 < this.anInt386; local13++) {
					this.anIntArray51[this.anInt311++] = this.anIntArray73[local13];
				}
			}
			if (local7 > this.anInt386) {
				signlink.reporterror(this.aString14 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt386 = 0;
			for (local13 = 0; local13 < local7; local13++) {
				@Pc(65) int local65 = this.anIntArray73[local13];
				@Pc(70) Class1_Sub1_Sub1_Sub1_Sub2 local70 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local65];
				@Pc(76) int local76 = arg2.method479(this.anInt312, 1);
				if (local76 == 0) {
					this.anIntArray73[this.anInt386++] = local65;
					local70.anInt170 = anInt363;
				} else {
					@Pc(100) int local100 = arg2.method479(this.anInt312, 2);
					if (local100 == 0) {
						this.anIntArray73[this.anInt386++] = local65;
						local70.anInt170 = anInt363;
						this.anIntArray74[this.anInt387++] = local65;
					} else {
						@Pc(152) int local152;
						@Pc(163) int local163;
						if (local100 == 1) {
							this.anIntArray73[this.anInt386++] = local65;
							local70.anInt170 = anInt363;
							local152 = arg2.method479(this.anInt312, 3);
							local70.method43(local152, false);
							local163 = arg2.method479(this.anInt312, 1);
							if (local163 == 1) {
								this.anIntArray74[this.anInt387++] = local65;
							}
						} else if (local100 == 2) {
							this.anIntArray73[this.anInt386++] = local65;
							local70.anInt170 = anInt363;
							local152 = arg2.method479(this.anInt312, 3);
							local70.method43(local152, true);
							local163 = arg2.method479(this.anInt312, 3);
							local70.method43(local163, true);
							@Pc(224) int local224 = arg2.method479(this.anInt312, 1);
							if (local224 == 1) {
								this.anIntArray74[this.anInt387++] = local65;
							}
						} else if (local100 == 3) {
							this.anIntArray51[this.anInt311++] = local65;
						}
					}
				}
			}
			if (arg1 == this.aByte26) {
				;
			}
		} catch (@Pc(265) RuntimeException local265) {
			signlink.reporterror("9229, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local265.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method148() {
		try {
			if (this.anInt426 != 0) {
				@Pc(6) Class1_Sub1_Sub2_Sub4 local6 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(8) int local8 = 0;
				this.aBoolean72 &= true;
				if (this.anInt432 != 0) {
					local8 = 1;
				}
				for (@Pc(21) int local21 = 0; local21 < 100; local21++) {
					if (this.aStringArray4[local21] != null) {
						@Pc(33) int local33 = this.anIntArray49[local21];
						@Pc(63) int local63;
						if ((local33 == 3 || local33 == 7) && (local33 == 7 || this.anInt390 == 0 || this.anInt390 == 1 && this.method154(this.aStringArray3[local21]))) {
							local63 = 329 - local8 * 13;
							local6.method444(0, 4, local63, "From " + this.aStringArray3[local21] + ": " + this.aStringArray4[local21]);
							local6.method444(65535, 4, local63 - 1, "From " + this.aStringArray3[local21] + ": " + this.aStringArray4[local21]);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local33 == 5 && this.anInt390 < 2) {
							local63 = 329 - local8 * 13;
							local6.method444(0, 4, local63, this.aStringArray4[local21]);
							local6.method444(65535, 4, local63 - 1, this.aStringArray4[local21]);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local33 == 6 && this.anInt390 < 2) {
							local63 = 329 - local8 * 13;
							local6.method444(0, 4, local63, "To " + this.aStringArray3[local21] + ": " + this.aStringArray4[local21]);
							local6.method444(65535, 4, local63 - 1, "To " + this.aStringArray3[local21] + ": " + this.aStringArray4[local21]);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(228) RuntimeException local228) {
			signlink.reporterror("32206, " + true + ", " + local228.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;IIII)V")
	private void method149(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg0.anInt453 == 0 && arg0.anIntArray90 != null && (!arg0.aBoolean75 || this.anInt350 == arg0.anInt451 || this.anInt250 == arg0.anInt451 || this.anInt282 == arg0.anInt451)) {
				@Pc(29) int local29 = Class1_Sub1_Sub2.anInt746;
				@Pc(31) int local31 = Class1_Sub1_Sub2.anInt744;
				@Pc(33) int local33 = Class1_Sub1_Sub2.anInt747;
				@Pc(35) int local35 = Class1_Sub1_Sub2.anInt745;
				Class1_Sub1_Sub2.method435(arg3 + arg0.anInt457, arg3, arg1, arg1 + arg0.anInt456);
				@Pc(56) int local56 = arg0.anIntArray90.length;
				for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
					@Pc(67) int local67 = arg0.anIntArray91[local58] + arg1;
					@Pc(76) int local76 = arg0.anIntArray92[local58] + arg3 - arg2;
					@Pc(83) Class6 local83 = Class6.aClass6Array1[arg0.anIntArray90[local58]];
					@Pc(88) int local88 = local67 + local83.anInt458;
					@Pc(93) int local93 = local76 + local83.anInt459;
					if (local83.anInt455 > 0) {
						this.method141(this.aByte25, local83);
					}
					if (local83.anInt453 == 0) {
						if (local83.anInt462 > local83.anInt461 - local83.anInt457) {
							local83.anInt462 = local83.anInt461 - local83.anInt457;
						}
						if (local83.anInt462 < 0) {
							local83.anInt462 = 0;
						}
						this.method149(local83, local88, local83.anInt462, local93);
						if (local83.anInt461 > local83.anInt457) {
							this.method135(local83.anInt462, local93, local83.anInt461, local88 + local83.anInt456, local83.anInt457);
						}
					} else if (local83.anInt453 != 1) {
						@Pc(166) int local166;
						@Pc(170) int local170;
						@Pc(181) int local181;
						@Pc(216) int local216;
						@Pc(223) int local223;
						@Pc(164) int local164;
						@Pc(190) int local190;
						@Pc(214) int local214;
						if (local83.anInt453 == 2) {
							local164 = 0;
							for (local166 = 0; local166 < local83.anInt457; local166++) {
								for (local170 = 0; local170 < local83.anInt456; local170++) {
									local181 = local88 + local170 * (local83.anInt464 + 32);
									local190 = local93 + local166 * (local83.anInt465 + 32);
									if (local164 < 20) {
										local181 += local83.anIntArray93[local164];
										local190 += local83.anIntArray94[local164];
									}
									if (local83.anIntArray86[local164] > 0) {
										local214 = 0;
										local216 = 0;
										local223 = local83.anIntArray86[local164] - 1;
										if (local181 > Class1_Sub1_Sub2.anInt746 - 32 && local181 < Class1_Sub1_Sub2.anInt747 && local190 > Class1_Sub1_Sub2.anInt744 - 32 && local190 < Class1_Sub1_Sub2.anInt745 || this.anInt305 != 0 && this.anInt304 == local164) {
											@Pc(254) Class1_Sub1_Sub2_Sub2 local254 = Class13.method323(local83.anIntArray87[local164], local223);
											if (local254 != null) {
												if (this.anInt305 != 0 && this.anInt304 == local164 && this.anInt303 == local83.anInt451) {
													local214 = super.anInt234 - this.anInt306;
													local216 = super.anInt235 - this.anInt307;
													if (local214 < 5 && local214 > -5) {
														local214 = 0;
													}
													if (local216 < 5 && local216 > -5) {
														local216 = 0;
													}
													if (this.anInt441 < 5) {
														local214 = 0;
														local216 = 0;
													}
													local254.method399(local181 + local214, local190 + local216);
												} else if (this.anInt269 != 0 && this.anInt268 == local164 && this.anInt267 == local83.anInt451) {
													local254.method399(local181, local190);
												} else {
													local254.method395(local190, 217, local181);
												}
												if (local254.anInt689 == 33 || local83.anIntArray87[local164] != 1) {
													@Pc(356) int local356 = local83.anIntArray87[local164];
													this.aClass1_Sub1_Sub2_Sub4_1.method444(0, local181 + local214 + 1, local190 + 10 + local216, method101(local356));
													this.aClass1_Sub1_Sub2_Sub4_1.method444(16776960, local181 + local214, local190 + 9 + local216, method101(local356));
												}
											}
										}
									} else if (local83.aClass1_Sub1_Sub2_Sub2Array8 != null && local164 < 20) {
										@Pc(403) Class1_Sub1_Sub2_Sub2 local403 = local83.aClass1_Sub1_Sub2_Sub2Array8[local164];
										if (local403 != null) {
											local403.method395(local190, 217, local181);
										}
									}
									local164++;
								}
							}
						} else if (local83.anInt453 != 3) {
							@Pc(461) Class1_Sub1_Sub2_Sub4 local461;
							if (local83.anInt453 == 4) {
								local461 = local83.aClass1_Sub1_Sub2_Sub4_5;
								local166 = local83.anInt466;
								@Pc(467) String local467 = local83.aString19;
								if ((this.anInt282 == local83.anInt451 || this.anInt250 == local83.anInt451 || this.anInt350 == local83.anInt451) && local83.anInt468 != 0) {
									local166 = local83.anInt468;
								}
								if (this.method113(local83)) {
									local166 = local83.anInt467;
									if (local83.aString20.length() > 0) {
										local467 = local83.aString20;
									}
								}
								if (local83.anInt454 == 6 && this.aBoolean53) {
									local467 = "Please wait...";
									local166 = local83.anInt466;
								}
								local190 = local93 + local461.anInt754;
								while (local467.length() > 0) {
									if (local467.indexOf("%") != -1) {
										label263: while (true) {
											local214 = local467.indexOf("%1");
											if (local214 == -1) {
												while (true) {
													local214 = local467.indexOf("%2");
													if (local214 == -1) {
														while (true) {
															local214 = local467.indexOf("%3");
															if (local214 == -1) {
																while (true) {
																	local214 = local467.indexOf("%4");
																	if (local214 == -1) {
																		while (true) {
																			local214 = local467.indexOf("%5");
																			if (local214 == -1) {
																				break label263;
																			}
																			local467 = local467.substring(0, local214) + this.method102(this.method205(4, local83), 226) + local467.substring(local214 + 2);
																		}
																	}
																	local467 = local467.substring(0, local214) + this.method102(this.method205(3, local83), 226) + local467.substring(local214 + 2);
																}
															}
															local467 = local467.substring(0, local214) + this.method102(this.method205(2, local83), 226) + local467.substring(local214 + 2);
														}
													}
													local467 = local467.substring(0, local214) + this.method102(this.method205(1, local83), 226) + local467.substring(local214 + 2);
												}
											}
											local467 = local467.substring(0, local214) + this.method102(this.method205(0, local83), 226) + local467.substring(local214 + 2);
										}
									}
									local214 = local467.indexOf("\\n");
									@Pc(709) String local709;
									if (local214 == -1) {
										local709 = local467;
										local467 = "";
									} else {
										local709 = local467.substring(0, local214);
										local467 = local467.substring(local214 + 2);
									}
									if (local83.aBoolean81) {
										local461.method442(local166, local83.aBoolean82, local88 + local83.anInt456 / 2, local190, local709);
									} else {
										local461.method446(local166, local190, local709, local83.aBoolean82, local88);
									}
									local190 += local461.anInt754;
								}
							} else if (local83.anInt453 == 5) {
								@Pc(771) Class1_Sub1_Sub2_Sub2 local771;
								if (this.method113(local83)) {
									local771 = local83.aClass1_Sub1_Sub2_Sub2_13;
								} else {
									local771 = local83.aClass1_Sub1_Sub2_Sub2_12;
								}
								if (local771 != null) {
									local771.method395(local93, 217, local88);
								}
							} else if (local83.anInt453 == 6) {
								local164 = Class1_Sub1_Sub2_Sub1.anInt653;
								local166 = Class1_Sub1_Sub2_Sub1.anInt654;
								Class1_Sub1_Sub2_Sub1.anInt653 = local88 + local83.anInt456 / 2;
								Class1_Sub1_Sub2_Sub1.anInt654 = local93 + local83.anInt457 / 2;
								local170 = Class1_Sub1_Sub2_Sub1.anIntArray173[local83.anInt476] * local83.anInt475 >> 16;
								local181 = Class1_Sub1_Sub2_Sub1.anIntArray174[local83.anInt476] * local83.anInt475 >> 16;
								@Pc(832) boolean local832 = this.method113(local83);
								if (local832) {
									local214 = local83.anInt474;
								} else {
									local214 = local83.anInt473;
								}
								@Pc(852) Class1_Sub1_Sub1_Sub5 local852;
								if (local214 == -1) {
									local852 = local83.method224(-1, -1, local832);
								} else {
									@Pc(858) Class25 local858 = Class25.aClass25Array1[local214];
									local852 = local83.method224(local858.anIntArray216[local83.anInt449], local858.anIntArray215[local83.anInt449], local832);
								}
								if (local852 != null) {
									local852.method299(local83.anInt477, 0, local83.anInt476, 0, local170, local181);
								}
								Class1_Sub1_Sub2_Sub1.anInt653 = local164;
								Class1_Sub1_Sub2_Sub1.anInt654 = local166;
							} else if (local83.anInt453 == 7) {
								local461 = local83.aClass1_Sub1_Sub2_Sub4_5;
								local166 = 0;
								for (local170 = 0; local170 < local83.anInt457; local170++) {
									for (local181 = 0; local181 < local83.anInt456; local181++) {
										if (local83.anIntArray86[local166] > 0) {
											@Pc(922) Class13 local922 = Class13.method317(local83.anIntArray86[local166] - 1);
											@Pc(925) String local925 = local922.aString26;
											if (local922.aBoolean123 || local83.anIntArray87[local166] != 1) {
												local925 = local925 + " x" + method119(local83.anIntArray87[local166]);
											}
											local216 = local88 + local181 * (local83.anInt464 + 115);
											local223 = local93 + local170 * (local83.anInt465 + 12);
											if (local83.aBoolean81) {
												local461.method442(local83.anInt466, local83.aBoolean82, local216 + local83.anInt456 / 2, local223, local925);
											} else {
												local461.method446(local83.anInt466, local223, local925, local83.aBoolean82, local216);
											}
										}
										local166++;
									}
								}
							}
						} else if (local83.aBoolean80) {
							Class1_Sub1_Sub2.method437(local83.anInt457, local93, local83.anInt456, local88, local83.anInt466);
						} else {
							Class1_Sub1_Sub2.method438(local93, local88, local83.anInt456, local83.anInt466, local83.anInt457);
						}
					}
				}
				Class1_Sub1_Sub2.method435(local35, local31, local29, local33);
			}
		} catch (@Pc(1021) RuntimeException local1021) {
			signlink.reporterror("73041, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -181 + ", " + local1021.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)Ljava/lang/String;")
	private String method150() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("96259, " + false + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method151() {
		try {
			this.aBoolean69 = true;
			for (@Pc(6) int local6 = 0; local6 < 7; local6++) {
				this.anIntArray61[local6] = -1;
				for (@Pc(15) int local15 = 0; local15 < Class21.anInt731; local15++) {
					if (!Class21.aClass21Array1[local15].aBoolean150 && Class21.aClass21Array1[local15].anInt732 == local6 + (this.aBoolean70 ? 0 : 7)) {
						this.anIntArray61[local6] = local15;
						break;
					}
				}
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("86680, " + 771 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method153() {
		try {
			this.method148();
			if (this.anInt323 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array6[this.anInt322 / 100].method395(this.anInt321 - 8 - 11, 217, this.anInt320 - 8 - 8);
			}
			if (this.anInt323 == 2) {
				this.aClass1_Sub1_Sub2_Sub2Array6[this.anInt322 / 100 + 4].method395(this.anInt321 - 8 - 11, 217, this.anInt320 - 8 - 8);
			}
			if (this.anInt296 != -1) {
				this.method188(this.anInt296, this.anInt316);
				this.method149(Class6.aClass6Array1[this.anInt296], 0, 0, 0);
			}
			this.method138(414);
			if (!this.aBoolean67) {
				this.method210(931);
				this.method183();
			} else if (this.anInt297 == 0) {
				this.method100();
			}
			if (this.anInt381 == 1) {
				if (this.anInt394 > 0 || this.anInt367 == 1) {
					this.aClass1_Sub1_Sub2_Sub2Array3[1].method395(258, 217, 472);
				} else {
					this.aClass1_Sub1_Sub2_Sub2Array3[1].method395(296, 217, 472);
				}
			}
			if (this.anInt394 > 0) {
				this.aClass1_Sub1_Sub2_Sub2Array3[0].method395(296, 217, 472);
				this.aClass1_Sub1_Sub2_Sub4_2.method441(this.aByte28, "Level: " + this.anInt394, 484, 329, 16776960);
			}
			if (this.anInt367 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array3[6].method395(296, 217, 472);
				this.aClass1_Sub1_Sub2_Sub4_2.method441(this.aByte28, "Arena", 484, 329, 16776960);
			}
			if (this.anInt432 != 0) {
				@Pc(186) int local186 = this.anInt432 / 50;
				@Pc(190) int local190 = local186 / 60;
				@Pc(194) int local194 = local186 % 60;
				if (local194 < 10) {
					this.aClass1_Sub1_Sub2_Sub4_2.method444(16776960, 4, 329, "System update in: " + local190 + ":0" + local194);
				} else {
					this.aClass1_Sub1_Sub2_Sub4_2.method444(16776960, 4, 329, "System update in: " + local190 + ":" + local194);
				}
			}
		} catch (@Pc(236) RuntimeException local236) {
			signlink.reporterror("46548, " + false + ", " + local236.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;)Z")
	private boolean method154(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(11) int local11 = 0; local11 < this.anInt339; local11++) {
				if (arg0.equalsIgnoreCase(this.aStringArray5[local11])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("64264, " + 790 + ", " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method155() {
		try {
			Class9.aClass39_4.method611();
			Class9.aClass39_5.method611();
			Class11.aClass39_6.method611();
			Class13.aClass39_7.method611();
			Class13.aClass39_8.method611();
			Class1_Sub1_Sub1_Sub1_Sub2.aClass39_1.method611();
			Class27.aClass39_9.method611();
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("74457, " + false + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method156() {
		try {
			this.anInt427 += 0;
			if (super.anInt236 == 1) {
				@Pc(16) int local16 = super.anInt237 - 21 - 561;
				@Pc(23) int local23 = super.anInt238 - 9 - 5;
				if (local16 >= 0 && local23 >= 0 && local16 < 146 && local23 < 151) {
					local16 -= 73;
					local23 -= 75;
					@Pc(43) int local43 = this.anInt443 + this.anInt370 & 0x7FF;
					@Pc(47) int local47 = Class1_Sub1_Sub2_Sub1.anIntArray173[local43];
					@Pc(51) int local51 = Class1_Sub1_Sub2_Sub1.anIntArray174[local43];
					@Pc(60) int local60 = local47 * (this.anInt365 + 256) >> 8;
					@Pc(69) int local69 = local51 * (this.anInt365 + 256) >> 8;
					@Pc(79) int local79 = local23 * local60 + local16 * local69 >> 11;
					@Pc(89) int local89 = local23 * local69 - local16 * local60 >> 11;
					@Pc(96) int local96 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 + local79 >> 7;
					@Pc(103) int local103 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 - local89 >> 7;
					@Pc(124) boolean local124 = this.method134(local96, 0, true, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0], 0, local103, 1, 0, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0]);
					if (local124) {
						this.aClass1_Sub1_Sub3_2.method458(local16);
						this.aClass1_Sub1_Sub3_2.method458(local23);
						this.aClass1_Sub1_Sub3_2.method459(this.anInt443);
						this.aClass1_Sub1_Sub3_2.method458(57);
						this.aClass1_Sub1_Sub3_2.method458(this.anInt370);
						this.aClass1_Sub1_Sub3_2.method458(this.anInt365);
						this.aClass1_Sub1_Sub3_2.method458(89);
						this.aClass1_Sub1_Sub3_2.method459(aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128);
						this.aClass1_Sub1_Sub3_2.method459(aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129);
						this.aClass1_Sub1_Sub3_2.method458(this.anInt404);
						this.aClass1_Sub1_Sub3_2.method458(63);
						return;
					}
				}
			}
		} catch (@Pc(178) RuntimeException local178) {
			signlink.reporterror("92429, " + 0 + ", " + local178.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JZ)V")
	private void method157(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt273 >= 100) {
					this.method123(0, "", "Your ignore list is full. Max of 100 hit");
				} else {
					@Pc(23) String local23 = Class46.method649(Class46.method646(arg0));
					for (@Pc(25) int local25 = 0; local25 < this.anInt273; local25++) {
						if (this.aLongArray4[local25] == arg0) {
							this.method123(0, "", local23 + " is already on your ignore list");
							return;
						}
					}
					this.aBoolean72 &= true;
					for (@Pc(61) int local61 = 0; local61 < this.anInt339; local61++) {
						if (this.aLongArray3[local61] == arg0) {
							this.method123(0, "", "Please remove " + local23 + " from your friend list first");
							return;
						}
					}
					this.aLongArray4[this.anInt273++] = arg0;
					this.aBoolean49 = true;
					this.aClass1_Sub1_Sub3_2.method457(84);
					this.aClass1_Sub1_Sub3_2.method464(arg0);
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("72110, " + arg0 + ", " + true + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(B)V")
	private void method158() {
		try {
			this.anInt244 = 0;
			@Pc(53) int local53;
			@Pc(73) int local73;
			for (@Pc(6) int local6 = -1; local6 < this.anInt386 + this.anInt353; local6++) {
				@Pc(13) Class1_Sub1_Sub1_Sub1 local13;
				if (local6 == -1) {
					local13 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
				} else if (local6 < this.anInt386) {
					local13 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray73[local6]];
				} else {
					local13 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray64[local6 - this.anInt386]];
				}
				if (local13 != null && local13.method44()) {
					if (local6 < this.anInt386) {
						local53 = 30;
						@Pc(56) Class1_Sub1_Sub1_Sub1_Sub2 local56 = (Class1_Sub1_Sub1_Sub1_Sub2) local13;
						if (local56.anInt179 != 0) {
							this.method190(local13.anInt171 + 15, local13);
							if (this.anInt401 > -1) {
								for (local73 = 0; local73 < 8; local73++) {
									if ((local56.anInt179 & 0x1 << local73) != 0) {
										this.aClass1_Sub1_Sub2_Sub2Array3[local73].method395(this.anInt402 - local53, 217, this.anInt401 - 12);
										local53 -= 25;
									}
								}
							}
						}
						if (local6 >= 0 && this.anInt440 == 10 && this.anInt369 == this.anIntArray73[local6]) {
							this.method190(local13.anInt171 + 15, local13);
							if (this.anInt401 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array3[7].method395(this.anInt402 - local53, 217, this.anInt401 - 12);
							}
						}
					} else if (this.anInt440 == 1 && this.anInt317 == this.anIntArray64[local6 - this.anInt386] && anInt363 % 20 < 10) {
						this.method190(local13.anInt171 + 15, local13);
						if (this.anInt401 > -1) {
							this.aClass1_Sub1_Sub2_Sub2Array3[2].method395(this.anInt402 - 28, 217, this.anInt401 - 12);
						}
					}
					if (local13.aString3 != null && (local6 >= this.anInt386 || this.anInt356 == 0 || this.anInt356 == 3 || this.anInt356 == 1 && this.method154(((Class1_Sub1_Sub1_Sub1_Sub2) local13).aString4))) {
						this.method190(local13.anInt171, local13);
						if (this.anInt401 > -1 && this.anInt244 < this.anInt245) {
							this.anIntArray30[this.anInt244] = this.aClass1_Sub1_Sub2_Sub4_3.method443((byte) 2, local13.aString3) / 2;
							this.anIntArray29[this.anInt244] = this.aClass1_Sub1_Sub2_Sub4_3.anInt754;
							this.anIntArray27[this.anInt244] = this.anInt401;
							this.anIntArray28[this.anInt244] = this.anInt402;
							this.anIntArray31[this.anInt244] = local13.anInt140;
							this.anIntArray32[this.anInt244] = local13.anInt141;
							this.anIntArray33[this.anInt244] = local13.anInt139;
							this.aStringArray1[this.anInt244++] = local13.aString3;
							if (this.anInt414 == 0 && local13.anInt141 == 1) {
								this.anIntArray29[this.anInt244] += 10;
								this.anIntArray28[this.anInt244] += 5;
							}
							if (this.anInt414 == 0 && local13.anInt141 == 2) {
								this.anIntArray30[this.anInt244] = 60;
							}
						}
					}
					if (local13.anInt144 > anInt363 + 100) {
						this.method190(local13.anInt171 + 15, local13);
						if (this.anInt401 > -1) {
							local53 = local13.anInt145 * 30 / local13.anInt146;
							if (local53 > 30) {
								local53 = 30;
							}
							Class1_Sub1_Sub2.method437(5, this.anInt402 - 3, local53, this.anInt401 - 15, 65280);
							Class1_Sub1_Sub2.method437(5, this.anInt402 - 3, 30 - local53, this.anInt401 + local53 - 15, 16711680);
						}
					}
					if (local13.anInt144 > anInt363 + 330) {
						this.method190(local13.anInt171 / 2, local13);
						if (this.anInt401 > -1) {
							this.aClass1_Sub1_Sub2_Sub2Array5[local13.anInt143].method395(this.anInt402 - 12, 217, this.anInt401 - 12);
							this.aClass1_Sub1_Sub2_Sub4_1.method441(this.aByte28, String.valueOf(local13.anInt142), this.anInt401, this.anInt402 + 4, 0);
							this.aClass1_Sub1_Sub2_Sub4_1.method441(this.aByte28, String.valueOf(local13.anInt142), this.anInt401 - 1, this.anInt402 + 3, 16777215);
						}
					}
				}
			}
			for (@Pc(477) int local477 = 0; local477 < this.anInt244; local477++) {
				local53 = this.anIntArray27[local477];
				@Pc(489) int local489 = this.anIntArray28[local477];
				local73 = this.anIntArray30[local477];
				@Pc(499) int local499 = this.anIntArray29[local477];
				@Pc(501) boolean local501 = true;
				while (local501) {
					local501 = false;
					for (@Pc(507) int local507 = 0; local507 < local477; local507++) {
						if (local489 + 2 > this.anIntArray28[local507] - this.anIntArray29[local507] && local489 - local499 < this.anIntArray28[local507] + 2 && local53 - local73 < this.anIntArray27[local507] + this.anIntArray30[local507] && local53 + local73 > this.anIntArray27[local507] - this.anIntArray30[local507] && this.anIntArray28[local507] - this.anIntArray29[local507] < local489) {
							local489 = this.anIntArray28[local507] - this.anIntArray29[local507];
							local501 = true;
						}
					}
				}
				this.anInt401 = this.anIntArray27[local477];
				this.anInt402 = this.anIntArray28[local477] = local489;
				@Pc(606) String local606 = this.aStringArray1[local477];
				if (this.anInt414 == 0) {
					@Pc(611) int local611 = 16776960;
					if (this.anIntArray31[local477] < 6) {
						local611 = this.anIntArray46[this.anIntArray31[local477]];
					}
					if (this.anIntArray31[local477] == 6) {
						local611 = this.anInt368 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray31[local477] == 7) {
						local611 = this.anInt368 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray31[local477] == 8) {
						local611 = this.anInt368 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(686) int local686;
					if (this.anIntArray31[local477] == 9) {
						local686 = 150 - this.anIntArray33[local477];
						if (local686 < 50) {
							local611 = local686 * 1280 + 16711680;
						} else if (local686 < 100) {
							local611 = 16776960 - (local686 - 50) * 327680;
						} else if (local686 < 150) {
							local611 = (local686 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray31[local477] == 10) {
						local686 = 150 - this.anIntArray33[local477];
						if (local686 < 50) {
							local611 = local686 * 5 + 16711680;
						} else if (local686 < 100) {
							local611 = 16711935 - (local686 - 50) * 327680;
						} else if (local686 < 150) {
							local611 = (local686 - 100) * 327680 + 255 - (local686 - 100) * 5;
						}
					}
					if (this.anIntArray31[local477] == 11) {
						local686 = 150 - this.anIntArray33[local477];
						if (local686 < 50) {
							local611 = 16777215 - local686 * 327685;
						} else if (local686 < 100) {
							local611 = (local686 - 50) * 327685 + 65280;
						} else if (local686 < 150) {
							local611 = 16777215 - (local686 - 100) * 327680;
						}
					}
					if (this.anIntArray32[local477] == 0) {
						this.aClass1_Sub1_Sub2_Sub4_3.method441(this.aByte28, local606, this.anInt401, this.anInt402 + 1, 0);
						this.aClass1_Sub1_Sub2_Sub4_3.method441(this.aByte28, local606, this.anInt401, this.anInt402, local611);
					}
					if (this.anIntArray32[local477] == 1) {
						this.aClass1_Sub1_Sub2_Sub4_3.method445(this.aByte20, local606, 0, this.anInt402 + 1, this.anInt368, this.anInt401);
						this.aClass1_Sub1_Sub2_Sub4_3.method445(this.aByte20, local606, local611, this.anInt402, this.anInt368, this.anInt401);
					}
					if (this.anIntArray32[local477] == 2) {
						local686 = this.aClass1_Sub1_Sub2_Sub4_3.method443((byte) 2, local606);
						@Pc(911) int local911 = (150 - this.anIntArray33[local477]) * (local686 + 100) / 150;
						Class1_Sub1_Sub2.method435(334, 0, this.anInt401 - 50, this.anInt401 + 50);
						this.aClass1_Sub1_Sub2_Sub4_3.method444(0, this.anInt401 + 50 - local911, this.anInt402 + 1, local606);
						this.aClass1_Sub1_Sub2_Sub4_3.method444(local611, this.anInt401 + 50 - local911, this.anInt402, local606);
						Class1_Sub1_Sub2.method434();
					}
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method441(this.aByte28, local606, this.anInt401, this.anInt402 + 1, 0);
					this.aClass1_Sub1_Sub2_Sub4_3.method441(this.aByte28, local606, this.anInt401, this.anInt402, 16776960);
				}
			}
		} catch (@Pc(988) RuntimeException local988) {
			signlink.reporterror("2682, " + -17 + ", " + local988.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(9) int local9 = 2048 - arg1 & 0x7FF;
			@Pc(15) int local15 = 2048 - arg4 & 0x7FF;
			@Pc(17) int local17 = 0;
			@Pc(19) int local19 = 0;
			@Pc(21) int local21 = arg2;
			@Pc(27) int local27;
			@Pc(31) int local31;
			@Pc(41) int local41;
			if (local9 != 0) {
				local27 = Class1_Sub1_Sub1_Sub5.anIntArray148[local9];
				local31 = Class1_Sub1_Sub1_Sub5.anIntArray149[local9];
				local41 = local31 * 0 - arg2 * local27 >> 16;
				local21 = local27 * 0 + arg2 * local31 >> 16;
				local19 = local41;
			}
			if (local15 != 0) {
				local27 = Class1_Sub1_Sub1_Sub5.anIntArray148[local15];
				local31 = Class1_Sub1_Sub1_Sub5.anIntArray149[local15];
				local41 = local21 * local27 + local31 * 0 >> 16;
				local21 = local21 * local31 - local27 * 0 >> 16;
				local17 = local41;
			}
			this.anInt258 = arg3 - local17;
			this.anInt259 = arg5 - local19;
			this.anInt260 = arg0 - local21;
			this.anInt261 = arg1;
			this.anInt262 = arg4;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("73881, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method160(@OriginalArg(1) int arg0) {
		try {
			if (arg0 >= 0) {
				if (this.aBoolean48) {
					this.aBoolean48 = false;
					this.aBoolean61 = true;
				}
				@Pc(18) int local18 = this.anIntArray80[arg0];
				@Pc(23) int local23 = this.anIntArray81[arg0];
				@Pc(28) int local28 = this.anIntArray82[arg0];
				@Pc(33) int local33 = this.anIntArray83[arg0];
				if (local28 >= 2000) {
					local28 -= 2000;
				}
				if (local28 == 55 && this.method164(local33, local23, 62, local18)) {
					this.aClass1_Sub1_Sub3_2.method459(this.anInt392);
				}
				@Pc(61) Class1_Sub1_Sub1_Sub1_Sub2 local61;
				if (local28 == 367) {
					local61 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
					if (local61 != null) {
						this.method134(local61.anIntArray7[0], 0, false, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0], 0, local61.anIntArray8[0], 2, 1, 0, 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0]);
						this.anInt320 = super.anInt237;
						this.anInt321 = super.anInt238;
						this.anInt323 = 2;
						this.anInt322 = 0;
						this.aClass1_Sub1_Sub3_2.method457(101);
						this.aClass1_Sub1_Sub3_2.method459(local33);
						this.aClass1_Sub1_Sub3_2.method459(this.anInt379);
						this.aClass1_Sub1_Sub3_2.method459(this.anInt377);
						this.aClass1_Sub1_Sub3_2.method459(this.anInt378);
					}
				}
				@Pc(140) int local140;
				@Pc(136) String local136;
				if (local28 == 34) {
					local136 = this.aStringArray2[arg0];
					local140 = local136.indexOf("@whi@");
					if (local140 != -1) {
						this.method109();
						this.aString7 = local136.substring(local140 + 5).trim();
						this.aBoolean44 = false;
						for (@Pc(159) int local159 = 0; local159 < Class6.aClass6Array1.length; local159++) {
							if (Class6.aClass6Array1[local159] != null && Class6.aClass6Array1[local159].anInt455 == 600) {
								this.anInt334 = this.anInt296 = Class6.aClass6Array1[local159].anInt452;
								break;
							}
						}
					}
				}
				@Pc(194) Class6 local194;
				@Pc(210) String local210;
				@Pc(225) String local225;
				if (local28 == 930) {
					local194 = Class6.aClass6Array1[local23];
					this.anInt391 = 1;
					this.anInt392 = local23;
					this.anInt393 = local194.anInt478;
					this.anInt376 = 0;
					local210 = local194.aString21;
					if (local210.indexOf(" ") != -1) {
						local210 = local210.substring(0, local210.indexOf(" "));
					}
					local225 = local194.aString21;
					if (local225.indexOf(" ") != -1) {
						local225 = local225.substring(local225.indexOf(" ") + 1);
					}
					this.aString13 = local210 + " " + local194.aString22 + " " + local225;
					if (this.anInt393 == 16) {
						this.aBoolean49 = true;
						this.anInt333 = 3;
						this.aBoolean60 = true;
					}
				} else {
					@Pc(293) boolean local293;
					if (local28 == 217) {
						local293 = this.method134(local18, 0, false, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0], 0, local23, 2, 0, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0]);
						if (!local293) {
							this.method134(local18, 0, false, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0], 0, local23, 2, 1, 0, 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0]);
						}
						this.anInt320 = super.anInt237;
						this.anInt321 = super.anInt238;
						this.anInt323 = 2;
						this.anInt322 = 0;
						this.aClass1_Sub1_Sub3_2.method457(76);
						this.aClass1_Sub1_Sub3_2.method459(local18 + this.anInt286);
						this.aClass1_Sub1_Sub3_2.method459(local23 + this.anInt287);
						this.aClass1_Sub1_Sub3_2.method459(local33);
						this.aClass1_Sub1_Sub3_2.method459(this.anInt379);
						this.aClass1_Sub1_Sub3_2.method459(this.anInt377);
						this.aClass1_Sub1_Sub3_2.method459(this.anInt378);
					}
					if (local28 == 660) {
						if (this.aBoolean67) {
							this.aClass37_1.method588(local18 - 8, local23 - 11);
						} else {
							this.aClass37_1.method588(super.anInt237 - 8, super.anInt238 - 11);
						}
					}
					if (local28 == 450 && this.method164(local33, local23, 160, local18)) {
						this.aClass1_Sub1_Sub3_2.method459(this.anInt379);
						this.aClass1_Sub1_Sub3_2.method459(this.anInt377);
						this.aClass1_Sub1_Sub3_2.method459(this.anInt378);
					}
					if (local28 == 391) {
						this.aClass1_Sub1_Sub3_2.method457(90);
						this.aClass1_Sub1_Sub3_2.method459(local33);
						this.aClass1_Sub1_Sub3_2.method459(local18);
						this.aClass1_Sub1_Sub3_2.method459(local23);
						this.aClass1_Sub1_Sub3_2.method459(this.anInt392);
						this.anInt266 = 0;
						this.anInt267 = local23;
						this.anInt268 = local18;
						this.anInt269 = 2;
						if (Class6.aClass6Array1[local23].anInt452 == this.anInt296) {
							this.anInt269 = 1;
						}
						if (Class6.aClass6Array1[local23].anInt452 == this.anInt354) {
							this.anInt269 = 3;
						}
					}
					if (local28 == 965) {
						local293 = this.method134(local18, 0, false, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0], 0, local23, 2, 0, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0]);
						if (!local293) {
							this.method134(local18, 0, false, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0], 0, local23, 2, 1, 0, 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0]);
						}
						this.anInt320 = super.anInt237;
						this.anInt321 = super.anInt238;
						this.anInt323 = 2;
						this.anInt322 = 0;
						this.aClass1_Sub1_Sub3_2.method457(78);
						this.aClass1_Sub1_Sub3_2.method459(local18 + this.anInt286);
						this.aClass1_Sub1_Sub3_2.method459(local23 + this.anInt287);
						this.aClass1_Sub1_Sub3_2.method459(local33);
						this.aClass1_Sub1_Sub3_2.method459(this.anInt392);
					}
					if (local28 == 465) {
						this.aClass1_Sub1_Sub3_2.method457(111);
						this.aClass1_Sub1_Sub3_2.method459(local23);
						local194 = Class6.aClass6Array1[local23];
						if (local194.anIntArrayArray6 != null && local194.anIntArrayArray6[0][0] == 5) {
							local140 = local194.anIntArrayArray6[0][1];
							this.anIntArray47[local140] = 1 - this.anIntArray47[local140];
							this.method118(local140);
							this.aBoolean49 = true;
						}
					}
					@Pc(629) Class1_Sub1_Sub1_Sub1_Sub1 local629;
					if (local28 == 900) {
						local629 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
						if (local629 != null) {
							this.method134(local629.anIntArray7[0], 0, false, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0], 0, local629.anIntArray8[0], 2, 1, 0, 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0]);
							this.anInt320 = super.anInt237;
							this.anInt321 = super.anInt238;
							this.anInt323 = 2;
							this.anInt322 = 0;
							this.aClass1_Sub1_Sub3_2.method457(21);
							this.aClass1_Sub1_Sub3_2.method459(local33);
							this.aClass1_Sub1_Sub3_2.method459(this.anInt379);
							this.aClass1_Sub1_Sub3_2.method459(this.anInt377);
							this.aClass1_Sub1_Sub3_2.method459(this.anInt378);
						}
					}
					if (local28 == 947) {
						this.method109();
					}
					if (local28 == 960) {
						this.aClass1_Sub1_Sub3_2.method457(111);
						this.aClass1_Sub1_Sub3_2.method459(local23);
						local194 = Class6.aClass6Array1[local23];
						if (local194.anIntArrayArray6 != null && local194.anIntArrayArray6[0][0] == 5) {
							local140 = local194.anIntArrayArray6[0][1];
							if (this.anIntArray47[local140] != local194.anIntArray89[0]) {
								this.anIntArray47[local140] = local194.anIntArray89[0];
								this.method118(local140);
								this.aBoolean49 = true;
							}
						}
					}
					@Pc(766) Class13 local766;
					if (local28 == 1773) {
						local766 = Class13.method317(local33);
						if (local23 >= 100000) {
							local210 = local23 + " x " + local766.aString26;
						} else if (local766.aByteArray6 == null) {
							local210 = "It's a " + local766.aString26 + ".";
						} else {
							local210 = new String(local766.aByteArray6);
						}
						this.method123(0, "", local210);
					}
					if (local28 == 881) {
						this.aClass1_Sub1_Sub3_2.method457(45);
						this.aClass1_Sub1_Sub3_2.method459(local33);
						this.aClass1_Sub1_Sub3_2.method459(local18);
						this.aClass1_Sub1_Sub3_2.method459(local23);
						this.aClass1_Sub1_Sub3_2.method459(this.anInt379);
						this.aClass1_Sub1_Sub3_2.method459(this.anInt377);
						this.aClass1_Sub1_Sub3_2.method459(this.anInt378);
						this.anInt266 = 0;
						this.anInt267 = local23;
						this.anInt268 = local18;
						this.anInt269 = 2;
						if (Class6.aClass6Array1[local23].anInt452 == this.anInt296) {
							this.anInt269 = 1;
						}
						if (Class6.aClass6Array1[local23].anInt452 == this.anInt354) {
							this.anInt269 = 3;
						}
					}
					if (local28 == 951) {
						local194 = Class6.aClass6Array1[local23];
						@Pc(887) boolean local887 = true;
						if (local194.anInt455 > 0) {
							local887 = this.method203(local194, (byte) 8);
						}
						if (local887) {
							this.aClass1_Sub1_Sub3_2.method457(111);
							this.aClass1_Sub1_Sub3_2.method459(local23);
						}
					}
					if (local28 == 265) {
						local629 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
						if (local629 != null) {
							this.method134(local629.anIntArray7[0], 0, false, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0], 0, local629.anIntArray8[0], 2, 1, 0, 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0]);
							this.anInt320 = super.anInt237;
							this.anInt321 = super.anInt238;
							this.anInt323 = 2;
							this.anInt322 = 0;
							this.aClass1_Sub1_Sub3_2.method457(114);
							this.aClass1_Sub1_Sub3_2.method459(local33);
							this.aClass1_Sub1_Sub3_2.method459(this.anInt392);
						}
					}
					if (local28 == 1175) {
						@Pc(980) int local980 = local33 >> 14 & 0x7FFF;
						@Pc(983) Class9 local983 = Class9.method250(local980);
						if (local983.aByteArray4 == null) {
							local225 = "It's a " + local983.aString24 + ".";
						} else {
							local225 = new String(local983.aByteArray4);
						}
						this.method123(0, "", local225);
					}
					if (local28 == 602 || local28 == 596 || local28 == 22 || local28 == 892 || local28 == 415) {
						if (local28 == 602) {
							this.aClass1_Sub1_Sub3_2.method457(22);
						}
						if (local28 == 892) {
							if ((local18 & 0x3) == 0) {
								anInt375++;
							}
							if (anInt375 >= 130) {
								this.aClass1_Sub1_Sub3_2.method457(36);
								this.aClass1_Sub1_Sub3_2.method458(177);
							}
							this.aClass1_Sub1_Sub3_2.method457(77);
						}
						if (local28 == 22) {
							this.aClass1_Sub1_Sub3_2.method457(239);
						}
						if (local28 == 596) {
							this.aClass1_Sub1_Sub3_2.method457(81);
						}
						if (local28 == 415) {
							if ((local23 & 0x3) == 0) {
								anInt331++;
							}
							if (anInt331 >= 55) {
								this.aClass1_Sub1_Sub3_2.method457(126);
								this.aClass1_Sub1_Sub3_2.method462(0);
							}
							this.aClass1_Sub1_Sub3_2.method457(154);
						}
						this.aClass1_Sub1_Sub3_2.method459(local33);
						this.aClass1_Sub1_Sub3_2.method459(local18);
						this.aClass1_Sub1_Sub3_2.method459(local23);
						this.anInt266 = 0;
						this.anInt267 = local23;
						this.anInt268 = local18;
						this.anInt269 = 2;
						if (Class6.aClass6Array1[local23].anInt452 == this.anInt296) {
							this.anInt269 = 1;
						}
						if (Class6.aClass6Array1[local23].anInt452 == this.anInt354) {
							this.anInt269 = 3;
						}
					}
					if (local28 == 1373 || local28 == 1544 || local28 == 151 || local28 == 1101) {
						local61 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local61 != null) {
							this.method134(local61.anIntArray7[0], 0, false, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0], 0, local61.anIntArray8[0], 2, 1, 0, 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0]);
							this.anInt320 = super.anInt237;
							this.anInt321 = super.anInt238;
							this.anInt323 = 2;
							this.anInt322 = 0;
							if (local28 == 1101) {
								this.aClass1_Sub1_Sub3_2.method457(223);
							}
							if (local28 == 151) {
								anInt253++;
								if (anInt253 >= 90) {
									this.aClass1_Sub1_Sub3_2.method457(65);
									this.aClass1_Sub1_Sub3_2.method459(31114);
								}
								this.aClass1_Sub1_Sub3_2.method457(94);
							}
							if (local28 == 1373) {
								this.aClass1_Sub1_Sub3_2.method457(192);
							}
							if (local28 == 1544) {
								this.aClass1_Sub1_Sub3_2.method457(66);
							}
							this.aClass1_Sub1_Sub3_2.method459(local33);
						}
					}
					if (local28 == 285) {
						this.method164(local33, local23, 47, local18);
					}
					if (local28 == 405 || local28 == 38 || local28 == 422 || local28 == 478 || local28 == 347) {
						if (local28 == 422) {
							this.aClass1_Sub1_Sub3_2.method457(176);
						}
						if (local28 == 478) {
							if ((local18 & 0x3) == 0) {
								anInt278++;
							}
							if (anInt278 >= 90) {
								this.aClass1_Sub1_Sub3_2.method457(52);
							}
							this.aClass1_Sub1_Sub3_2.method457(85);
						}
						if (local28 == 38) {
							this.aClass1_Sub1_Sub3_2.method457(203);
						}
						if (local28 == 405) {
							anInt358 += local33;
							if (anInt358 >= 97) {
								this.aClass1_Sub1_Sub3_2.method457(161);
								this.aClass1_Sub1_Sub3_2.method461(14953816);
							}
							this.aClass1_Sub1_Sub3_2.method457(93);
						}
						if (local28 == 347) {
							this.aClass1_Sub1_Sub3_2.method457(127);
						}
						this.aClass1_Sub1_Sub3_2.method459(local33);
						this.aClass1_Sub1_Sub3_2.method459(local18);
						this.aClass1_Sub1_Sub3_2.method459(local23);
						this.anInt266 = 0;
						this.anInt267 = local23;
						this.anInt268 = local18;
						this.anInt269 = 2;
						if (Class6.aClass6Array1[local23].anInt452 == this.anInt296) {
							this.anInt269 = 1;
						}
						if (Class6.aClass6Array1[local23].anInt452 == this.anInt354) {
							this.anInt269 = 3;
						}
					}
					if (local28 == 188) {
						this.anInt376 = 1;
						this.anInt377 = local18;
						this.anInt378 = local23;
						this.anInt379 = local33;
						this.aString11 = Class13.method317(local33).aString26;
						this.anInt391 = 0;
					} else {
						if (local28 == 1607) {
							local629 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
							if (local629 != null) {
								if (local629.aClass11_1.aByteArray5 == null) {
									local210 = "It's a " + local629.aClass11_1.aString25 + ".";
								} else {
									local210 = new String(local629.aClass11_1.aByteArray5);
								}
								this.method123(0, "", local210);
							}
						}
						if (local28 == 651) {
							local61 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
							if (local61 != null) {
								this.method134(local61.anIntArray7[0], 0, false, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0], 0, local61.anIntArray8[0], 2, 1, 0, 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0]);
								this.anInt320 = super.anInt237;
								this.anInt321 = super.anInt238;
								this.anInt323 = 2;
								this.anInt322 = 0;
								this.aClass1_Sub1_Sub3_2.method457(116);
								this.aClass1_Sub1_Sub3_2.method459(local33);
								this.aClass1_Sub1_Sub3_2.method459(this.anInt392);
							}
						}
						if (local28 == 504) {
							this.method164(local33, local23, 185, local18);
						}
						if (local28 == 224 || local28 == 993 || local28 == 99 || local28 == 746 || local28 == 877) {
							local293 = this.method134(local18, 0, false, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0], 0, local23, 2, 0, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0]);
							if (!local293) {
								this.method134(local18, 0, false, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0], 0, local23, 2, 1, 0, 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0]);
							}
							this.anInt320 = super.anInt237;
							this.anInt321 = super.anInt238;
							this.anInt323 = 2;
							this.anInt322 = 0;
							if (local28 == 746) {
								this.aClass1_Sub1_Sub3_2.method457(195);
							}
							if (local28 == 877) {
								this.aClass1_Sub1_Sub3_2.method457(139);
							}
							if (local28 == 224) {
								this.aClass1_Sub1_Sub3_2.method457(186);
							}
							if (local28 == 993) {
								this.aClass1_Sub1_Sub3_2.method457(46);
							}
							if (local28 == 99) {
								this.aClass1_Sub1_Sub3_2.method457(86);
							}
							this.aClass1_Sub1_Sub3_2.method459(local18 + this.anInt286);
							this.aClass1_Sub1_Sub3_2.method459(local23 + this.anInt287);
							this.aClass1_Sub1_Sub3_2.method459(local33);
						}
						if (local28 == 581) {
							if ((local33 & 0x3) == 0) {
								anInt242++;
							}
							if (anInt242 >= 99) {
								this.aClass1_Sub1_Sub3_2.method457(255);
								this.aClass1_Sub1_Sub3_2.method462(0);
							}
							this.method164(local33, local23, 83, local18);
						}
						if (local28 == 728 || local28 == 542 || local28 == 6 || local28 == 963 || local28 == 245) {
							local629 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
							if (local629 != null) {
								this.method134(local629.anIntArray7[0], 0, false, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0], 0, local629.anIntArray8[0], 2, 1, 0, 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0]);
								this.anInt320 = super.anInt237;
								this.anInt321 = super.anInt238;
								this.anInt323 = 2;
								this.anInt322 = 0;
								if (local28 == 542) {
									this.aClass1_Sub1_Sub3_2.method457(158);
								}
								if (local28 == 245) {
									if ((local33 & 0x3) == 0) {
										anInt263++;
									}
									if (anInt263 >= 85) {
										this.aClass1_Sub1_Sub3_2.method457(174);
										this.aClass1_Sub1_Sub3_2.method459(39596);
									}
									this.aClass1_Sub1_Sub3_2.method457(242);
								}
								if (local28 == 963) {
									this.aClass1_Sub1_Sub3_2.method457(99);
								}
								if (local28 == 728) {
									this.aClass1_Sub1_Sub3_2.method457(149);
								}
								if (local28 == 6) {
									if ((local33 & 0x3) == 0) {
										anInt364++;
									}
									if (anInt364 >= 124) {
										this.aClass1_Sub1_Sub3_2.method457(55);
										this.aClass1_Sub1_Sub3_2.method462(0);
									}
									this.aClass1_Sub1_Sub3_2.method457(237);
								}
								this.aClass1_Sub1_Sub3_2.method459(local33);
							}
						}
						if (local28 == 364) {
							this.method164(local33, local23, 75, local18);
						}
						@Pc(1897) long local1897;
						if (local28 == 406 || local28 == 436 || local28 == 557 || local28 == 556) {
							local136 = this.aStringArray2[arg0];
							local140 = local136.indexOf("@whi@");
							if (local140 != -1) {
								local1897 = Class46.method645(local136.substring(local140 + 5).trim());
								if (local28 == 406) {
									this.method192(local1897);
								}
								if (local28 == 436) {
									this.method157(local1897);
								}
								if (local28 == 557) {
									this.method108(local1897);
								}
								if (local28 == 556) {
									this.method197(local1897);
								}
							}
						}
						@Pc(1961) int local1961;
						if (local28 == 903 || local28 == 363) {
							local136 = this.aStringArray2[arg0];
							local140 = local136.indexOf("@whi@");
							if (local140 != -1) {
								local136 = local136.substring(local140 + 5).trim();
								local225 = Class46.method649(Class46.method646(Class46.method645(local136)));
								@Pc(1959) boolean local1959 = false;
								for (local1961 = 0; local1961 < this.anInt386; local1961++) {
									@Pc(1971) Class1_Sub1_Sub1_Sub1_Sub2 local1971 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray73[local1961]];
									if (local1971 != null && local1971.aString4 != null && local1971.aString4.equalsIgnoreCase(local225)) {
										this.method134(local1971.anIntArray7[0], 0, false, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0], 0, local1971.anIntArray8[0], 2, 1, 0, 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0]);
										if (local28 == 903) {
											this.aClass1_Sub1_Sub3_2.method457(192);
										}
										if (local28 == 363) {
											this.aClass1_Sub1_Sub3_2.method457(223);
										}
										this.aClass1_Sub1_Sub3_2.method459(this.anIntArray73[local1961]);
										local1959 = true;
										break;
									}
								}
								if (!local1959) {
									this.method123(0, "", "Unable to find " + local225);
								}
							}
						}
						if (local28 == 44 && !this.aBoolean53) {
							this.aClass1_Sub1_Sub3_2.method457(157);
							this.aClass1_Sub1_Sub3_2.method459(local23);
							this.aBoolean53 = true;
						}
						if (local28 == 1501) {
							anInt243 += this.anInt287;
							if (anInt243 >= 92) {
								this.aClass1_Sub1_Sub3_2.method457(220);
								this.aClass1_Sub1_Sub3_2.method462(0);
							}
							this.method164(local33, local23, 134, local18);
						}
						if (local28 == 679) {
							local136 = this.aStringArray2[arg0];
							local140 = local136.indexOf("@whi@");
							if (local140 != -1) {
								local1897 = Class46.method645(local136.substring(local140 + 5).trim());
								local1961 = -1;
								for (@Pc(2127) int local2127 = 0; local2127 < this.anInt339; local2127++) {
									if (this.aLongArray3[local2127] == local1897) {
										local1961 = local2127;
										break;
									}
								}
								if (local1961 != -1 && this.anIntArray79[local1961] > 0) {
									this.aBoolean61 = true;
									this.aBoolean48 = false;
									this.aBoolean34 = true;
									this.aString16 = "";
									this.anInt359 = 3;
									this.aLong10 = this.aLongArray3[local1961];
									this.aString17 = "Enter message to send to " + this.aStringArray5[local1961];
								}
							}
						}
						if (local28 == 1102) {
							local766 = Class13.method317(local33);
							if (local766.aByteArray6 == null) {
								local210 = "It's a " + local766.aString26 + ".";
							} else {
								local210 = new String(local766.aByteArray6);
							}
							this.method123(0, "", local210);
						}
						this.anInt376 = 0;
						this.anInt391 = 0;
					}
				}
			}
		} catch (@Pc(2237) RuntimeException local2237) {
			signlink.reporterror("74343, " + 7 + ", " + arg0 + ", " + local2237.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method161() {
		try {
			this.anInt427 += 0;
			while (true) {
				@Pc(11) int local11;
				do {
					while (true) {
						local11 = this.method83((byte) 7);
						if (local11 == -1) {
							return;
						}
						if (this.anInt296 != -1 && this.anInt296 == this.anInt334) {
							if (local11 == 8 && this.aString7.length() > 0) {
								this.aString7 = this.aString7.substring(0, this.aString7.length() - 1);
							}
							break;
						}
						@Pc(191) int local191;
						if (this.aBoolean34) {
							if (local11 >= 32 && local11 <= 122 && this.aString16.length() < 80) {
								this.aString16 = this.aString16 + (char) local11;
								this.aBoolean61 = true;
							}
							if (local11 == 8 && this.aString16.length() > 0) {
								this.aString16 = this.aString16.substring(0, this.aString16.length() - 1);
								this.aBoolean61 = true;
							}
							if (local11 == 13 || local11 == 10) {
								this.aBoolean34 = false;
								this.aBoolean61 = true;
								@Pc(151) long local151;
								if (this.anInt359 == 1) {
									local151 = Class46.method645(this.aString16);
									this.method192(local151);
								}
								if (this.anInt359 == 2 && this.anInt339 > 0) {
									local151 = Class46.method645(this.aString16);
									this.method108(local151);
								}
								if (this.anInt359 == 3 && this.aString16.length() > 0) {
									this.aClass1_Sub1_Sub3_2.method457(183);
									this.aClass1_Sub1_Sub3_2.method458(0);
									local191 = this.aClass1_Sub1_Sub3_2.anInt777;
									this.aClass1_Sub1_Sub3_2.method464(this.aLong10);
									Class2.method37(this.aString16, this.aClass1_Sub1_Sub3_2);
									this.aClass1_Sub1_Sub3_2.method467(this.aClass1_Sub1_Sub3_2.anInt777 - local191, 316);
									this.aString16 = Class46.method650(this.aString16);
									this.aString16 = Class32.method513(this.aString16);
									this.method123(6, Class46.method649(Class46.method646(this.aLong10)), this.aString16);
									if (this.anInt390 == 2) {
										this.anInt390 = 1;
										this.aBoolean35 = true;
										this.aClass1_Sub1_Sub3_2.method457(130);
										this.aClass1_Sub1_Sub3_2.method458(this.anInt356);
										this.aClass1_Sub1_Sub3_2.method458(this.anInt390);
										this.aClass1_Sub1_Sub3_2.method458(this.anInt293);
									}
								}
								if (this.anInt359 == 4 && this.anInt273 < 100) {
									local151 = Class46.method645(this.aString16);
									this.method157(local151);
								}
								if (this.anInt359 == 5 && this.anInt273 > 0) {
									local151 = Class46.method645(this.aString16);
									this.method197(local151);
								}
							}
						} else if (this.aBoolean48) {
							if (local11 >= 48 && local11 <= 57 && this.aString6.length() < 10) {
								this.aString6 = this.aString6 + (char) local11;
								this.aBoolean61 = true;
							}
							if (local11 == 8 && this.aString6.length() > 0) {
								this.aString6 = this.aString6.substring(0, this.aString6.length() - 1);
								this.aBoolean61 = true;
							}
							if (local11 == 13 || local11 == 10) {
								if (this.aString6.length() > 0) {
									local191 = 0;
									try {
										local191 = Integer.parseInt(this.aString6);
									} catch (@Pc(367) Exception local367) {
									}
									this.aClass1_Sub1_Sub3_2.method457(206);
									this.aClass1_Sub1_Sub3_2.method462(local191);
								}
								this.aBoolean48 = false;
								this.aBoolean61 = true;
							}
						} else if (this.anInt354 == -1) {
							if (local11 >= 32 && local11 <= 122 && this.aString5.length() < 80) {
								this.aString5 = this.aString5 + (char) local11;
								this.aBoolean61 = true;
							}
							if (local11 == 8 && this.aString5.length() > 0) {
								this.aString5 = this.aString5.substring(0, this.aString5.length() - 1);
								this.aBoolean61 = true;
							}
							if ((local11 == 13 || local11 == 10) && this.aString5.length() > 0) {
								if (this.aString5.equals("::clientdrop") && (super.aFrame_Sub1_2 != null || this.method150().indexOf("192.168.1.") != -1)) {
									this.method216();
								} else if (this.aString5.equals("::lag")) {
									this.method97();
								} else if (this.aString5.startsWith("::")) {
									this.aClass1_Sub1_Sub3_2.method457(91);
									this.aClass1_Sub1_Sub3_2.method458(this.aString5.length() - 1);
									this.aClass1_Sub1_Sub3_2.method465(this.aString5.substring(2));
								} else {
									@Pc(504) byte local504 = 0;
									if (this.aString5.startsWith("yellow:")) {
										local504 = 0;
										this.aString5 = this.aString5.substring(7);
									}
									if (this.aString5.startsWith("red:")) {
										local504 = 1;
										this.aString5 = this.aString5.substring(4);
									}
									if (this.aString5.startsWith("green:")) {
										local504 = 2;
										this.aString5 = this.aString5.substring(6);
									}
									if (this.aString5.startsWith("cyan:")) {
										local504 = 3;
										this.aString5 = this.aString5.substring(5);
									}
									if (this.aString5.startsWith("purple:")) {
										local504 = 4;
										this.aString5 = this.aString5.substring(7);
									}
									if (this.aString5.startsWith("white:")) {
										local504 = 5;
										this.aString5 = this.aString5.substring(6);
									}
									if (this.aString5.startsWith("flash1:")) {
										local504 = 6;
										this.aString5 = this.aString5.substring(7);
									}
									if (this.aString5.startsWith("flash2:")) {
										local504 = 7;
										this.aString5 = this.aString5.substring(7);
									}
									if (this.aString5.startsWith("flash3:")) {
										local504 = 8;
										this.aString5 = this.aString5.substring(7);
									}
									if (this.aString5.startsWith("glow1:")) {
										local504 = 9;
										this.aString5 = this.aString5.substring(6);
									}
									if (this.aString5.startsWith("glow2:")) {
										local504 = 10;
										this.aString5 = this.aString5.substring(6);
									}
									if (this.aString5.startsWith("glow3:")) {
										local504 = 11;
										this.aString5 = this.aString5.substring(6);
									}
									@Pc(662) byte local662 = 0;
									if (this.aString5.startsWith("wave:")) {
										local662 = 1;
										this.aString5 = this.aString5.substring(5);
									}
									if (this.aString5.startsWith("scroll:")) {
										local662 = 2;
										this.aString5 = this.aString5.substring(7);
									}
									this.aClass1_Sub1_Sub3_2.method457(89);
									this.aClass1_Sub1_Sub3_2.method458(0);
									@Pc(701) int local701 = this.aClass1_Sub1_Sub3_2.anInt777;
									this.aClass1_Sub1_Sub3_2.method458(local504);
									this.aClass1_Sub1_Sub3_2.method458(local662);
									Class2.method37(this.aString5, this.aClass1_Sub1_Sub3_2);
									this.aClass1_Sub1_Sub3_2.method467(this.aClass1_Sub1_Sub3_2.anInt777 - local701, 316);
									this.aString5 = Class46.method650(this.aString5);
									this.aString5 = Class32.method513(this.aString5);
									aClass1_Sub1_Sub1_Sub1_Sub2_1.aString3 = this.aString5;
									aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt140 = local504;
									aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt141 = local662;
									aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt139 = 150;
									this.method123(2, aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4, aClass1_Sub1_Sub1_Sub1_Sub2_1.aString3);
									if (this.anInt356 == 2) {
										this.anInt356 = 3;
										this.aBoolean35 = true;
										this.aClass1_Sub1_Sub3_2.method457(130);
										this.aClass1_Sub1_Sub3_2.method458(this.anInt356);
										this.aClass1_Sub1_Sub3_2.method458(this.anInt390);
										this.aClass1_Sub1_Sub3_2.method458(this.anInt293);
									}
								}
								this.aString5 = "";
								this.aBoolean61 = true;
							}
						}
					}
				} while ((local11 < 97 || local11 > 122) && (local11 < 65 || local11 > 90) && (local11 < 48 || local11 > 57) && local11 != 32);
				if (this.aString7.length() < 12) {
					this.aString7 = this.aString7 + (char) local11;
				}
			}
		} catch (@Pc(797) RuntimeException local797) {
			signlink.reporterror("64450, " + 0 + ", " + local797.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!kb;)V")
	private void method162(@OriginalArg(1) Class1_Sub1_Sub2_Sub3 arg0) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray62.length; local5++) {
				this.anIntArray62[local5] = 0;
			}
			@Pc(30) int local30;
			for (@Pc(20) int local20 = 0; local20 < 5000; local20++) {
				local30 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray62[local30] = (int) (Math.random() * 256.0D);
			}
			@Pc(48) int local48;
			@Pc(52) int local52;
			@Pc(60) int local60;
			for (local30 = 0; local30 < 20; local30++) {
				for (local48 = 1; local48 < 255; local48++) {
					for (local52 = 1; local52 < 127; local52++) {
						local60 = local52 + (local48 << 7);
						this.anIntArray63[local60] = (this.anIntArray62[local60 - 1] + this.anIntArray62[local60 + 1] + this.anIntArray62[local60 - 128] + this.anIntArray62[local60 + 128]) / 4;
					}
				}
				@Pc(106) int[] local106 = this.anIntArray62;
				this.anIntArray62 = this.anIntArray63;
				this.anIntArray63 = local106;
			}
			if (arg0 != null) {
				local48 = 0;
				for (local52 = 0; local52 < arg0.anInt725; local52++) {
					for (local60 = 0; local60 < arg0.anInt724; local60++) {
						if (arg0.aByteArray7[local48++] != 0) {
							@Pc(148) int local148 = local60 + arg0.anInt726 + 16;
							@Pc(155) int local155 = local52 + arg0.anInt727 + 16;
							@Pc(161) int local161 = local148 + (local155 << 7);
							this.anIntArray62[local161] = 0;
						}
					}
				}
			}
		} catch (@Pc(178) RuntimeException local178) {
			signlink.reporterror("93208, " + true + ", " + arg0 + ", " + local178.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method163() {
		try {
			for (@Pc(11) Class1_Sub1_Sub1_Sub6 local11 = (Class1_Sub1_Sub1_Sub6) this.aClass31_3.method498(); local11 != null; local11 = (Class1_Sub1_Sub1_Sub6) this.aClass31_3.method500()) {
				if (local11.anInt583 != this.anInt324 || local11.aBoolean118) {
					local11.method635();
				} else if (anInt363 >= local11.anInt582) {
					local11.method314(this.anInt316);
					if (local11.aBoolean118) {
						local11.method635();
					} else {
						this.aClass37_1.method561(false, -1, local11.anInt586, 60, local11.anInt583, 0, local11, local11.anInt584, local11.anInt585);
					}
				}
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("10953, " + -888 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIII)Z")
	private boolean method164(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(13) int local13 = arg0 >> 14 & 0x7FFF;
			@Pc(22) int local22 = this.aClass37_1.method580(this.anInt324, arg3, arg1, arg0);
			if (local22 == -1) {
				return false;
			}
			@Pc(31) int local31 = local22 & 0x1F;
			@Pc(37) int local37 = local22 >> 6 & 0x3;
			if (local31 == 10 || local31 == 11 || local31 == 22) {
				@Pc(49) Class9 local49 = Class9.method250(local13);
				@Pc(57) int local57;
				@Pc(60) int local60;
				if (local37 == 0 || local37 == 2) {
					local57 = local49.anInt517;
					local60 = local49.anInt518;
				} else {
					local57 = local49.anInt518;
					local60 = local49.anInt517;
				}
				@Pc(71) int local71 = local49.anInt529;
				if (local37 != 0) {
					local71 = (local71 << local37 & 0xF) + (local71 >> 4 - local37);
				}
				this.method134(arg3, local71, false, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0], 0, arg1, 2, local57, 0, local60, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0]);
			} else {
				this.method134(arg3, 0, false, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0], local37, arg1, 2, 0, local31 + 1, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0]);
			}
			this.anInt320 = super.anInt237;
			this.anInt321 = super.anInt238;
			this.anInt323 = 2;
			this.anInt322 = 0;
			this.aClass1_Sub1_Sub3_2.method457(arg2);
			this.aClass1_Sub1_Sub3_2.method459(arg3 + this.anInt286);
			this.aClass1_Sub1_Sub3_2.method459(arg1 + this.anInt287);
			this.aClass1_Sub1_Sub3_2.method459(local13);
			return true;
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("77252, " + arg0 + ", " + 143 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method165() {
		try {
			@Pc(20) int local20;
			@Pc(27) int local27;
			if (this.anInt347 == 0) {
				local20 = super.anInt230 / 2 - 80;
				local27 = super.anInt231 / 2 + 20;
				local27 += 20;
				if (super.anInt236 == 1 && super.anInt237 >= local20 - 75 && super.anInt237 <= local20 + 75 && super.anInt238 >= local27 - 20 && super.anInt238 <= local27 + 20) {
					this.anInt347 = 3;
					this.anInt251 = 0;
				}
				local20 = super.anInt230 / 2 + 80;
				if (super.anInt236 == 1 && super.anInt237 >= local20 - 75 && super.anInt237 <= local20 + 75 && super.anInt238 >= local27 - 20 && super.anInt238 <= local27 + 20) {
					this.aString8 = "";
					this.aString9 = "Enter your username & password.";
					this.anInt347 = 2;
					this.anInt251 = 0;
				}
			} else if (this.anInt347 == 2) {
				local20 = super.anInt231 / 2 - 40;
				local20 += 30;
				local20 += 25;
				if (super.anInt236 == 1 && super.anInt238 >= local20 - 15 && super.anInt238 < local20) {
					this.anInt251 = 0;
				}
				local20 += 15;
				if (super.anInt236 == 1 && super.anInt238 >= local20 - 15 && super.anInt238 < local20) {
					this.anInt251 = 1;
				}
				local20 += 15;
				local27 = super.anInt230 / 2 - 80;
				@Pc(173) int local173 = super.anInt231 / 2 + 50;
				@Pc(174) int local174 = local173 + 20;
				if (super.anInt236 == 1 && super.anInt237 >= local27 - 75 && super.anInt237 <= local27 + 75 && super.anInt238 >= local174 - 20 && super.anInt238 <= local174 + 20) {
					this.method92(this.aString14, this.aString15, false);
				}
				local27 = super.anInt230 / 2 + 80;
				if (super.anInt236 == 1 && super.anInt237 >= local27 - 75 && super.anInt237 <= local27 + 75 && super.anInt238 >= local174 - 20 && super.anInt238 <= local174 + 20) {
					this.anInt347 = 0;
					this.aString14 = "";
					this.aString15 = "";
				}
				while (true) {
					while (true) {
						@Pc(257) int local257 = this.method83((byte) 7);
						if (local257 == -1) {
							return;
						}
						@Pc(262) boolean local262 = false;
						for (@Pc(264) int local264 = 0; local264 < aString10.length(); local264++) {
							if (local257 == aString10.charAt(local264)) {
								local262 = true;
								break;
							}
						}
						if (this.anInt251 == 0) {
							if (local257 == 8 && this.aString14.length() > 0) {
								this.aString14 = this.aString14.substring(0, this.aString14.length() - 1);
							}
							if (local257 == 9 || local257 == 10 || local257 == 13) {
								this.anInt251 = 1;
							}
							if (local262) {
								this.aString14 = this.aString14 + (char) local257;
							}
							if (this.aString14.length() > 12) {
								this.aString14 = this.aString14.substring(0, 12);
							}
						} else if (this.anInt251 == 1) {
							if (local257 == 8 && this.aString15.length() > 0) {
								this.aString15 = this.aString15.substring(0, this.aString15.length() - 1);
							}
							if (local257 == 9 || local257 == 10 || local257 == 13) {
								this.anInt251 = 0;
							}
							if (local262) {
								this.aString15 = this.aString15 + (char) local257;
							}
							if (this.aString15.length() > 20) {
								this.aString15 = this.aString15.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt347 == 3) {
				local20 = super.anInt230 / 2;
				local27 = super.anInt231 / 2 + 50;
				@Pc(421) int local421 = local27 + 20;
				if (super.anInt236 == 1 && super.anInt237 >= local20 - 75 && super.anInt237 <= local20 + 75 && super.anInt238 >= local421 - 20 && super.anInt238 <= local421 + 20) {
					this.anInt347 = 0;
					return;
				}
			}
		} catch (@Pc(454) RuntimeException local454) {
			signlink.reporterror("31376, " + 17165 + ", " + local454.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(B)V")
	private void method166() {
		try {
			if (this.anInt432 > 1) {
				this.anInt432--;
			}
			if (this.anInt431 > 0) {
				this.anInt431--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method184(aBoolean54); local22++) {
			}
			if (this.aBoolean72) {
				this.method125(this.aByte22);
				this.method200();
				this.method211(283);
				@Pc(50) Class1_Sub1_Sub3 local50 = Class10.method259();
				if (local50 != null) {
					this.aClass1_Sub1_Sub3_2.method457(54);
					this.aClass1_Sub1_Sub3_2.method459(local50.anInt777);
					this.aClass1_Sub1_Sub3_2.method466(local50.aByteArray9, local50.anInt777);
					local50.method456();
				}
				this.anInt429++;
				if (this.anInt429 > 750) {
					this.method216();
				}
				this.method186();
				this.method170();
				this.method120();
				if ((super.anIntArray23[1] == 1 || super.anIntArray23[2] == 1 || super.anIntArray23[3] == 1 || super.anIntArray23[4] == 1) && this.anInt292++ > 5) {
					this.anInt292 = 0;
					this.aClass1_Sub1_Sub3_2.method457(152);
					this.aClass1_Sub1_Sub3_2.method459(this.anInt442);
					this.aClass1_Sub1_Sub3_2.method459(this.anInt443);
					this.aClass1_Sub1_Sub3_2.method458(this.anInt370);
					this.aClass1_Sub1_Sub3_2.method458(this.anInt365);
				}
				this.anInt316++;
				if (this.anInt323 != 0) {
					this.anInt322 += 20;
					if (this.anInt322 >= 400) {
						this.anInt323 = 0;
					}
				}
				if (this.anInt269 != 0) {
					this.anInt266++;
					if (this.anInt266 >= 15) {
						if (this.anInt269 == 2) {
							this.aBoolean49 = true;
						}
						if (this.anInt269 == 3) {
							this.aBoolean61 = true;
						}
						this.anInt269 = 0;
					}
				}
				@Pc(303) int local303;
				if (this.anInt305 != 0) {
					this.anInt441++;
					if (super.anInt234 > this.anInt306 + 5 || super.anInt234 < this.anInt306 - 5 || super.anInt235 > this.anInt307 + 5 || super.anInt235 < this.anInt307 - 5) {
						this.aBoolean51 = true;
					}
					if (super.anInt233 == 0) {
						if (this.anInt305 == 2) {
							this.aBoolean49 = true;
						}
						if (this.anInt305 == 3) {
							this.aBoolean61 = true;
						}
						this.anInt305 = 0;
						if (this.aBoolean51 && this.anInt441 >= 5) {
							this.anInt280 = -1;
							this.method210(931);
							if (this.anInt280 == this.anInt303 && this.anInt279 != this.anInt304) {
								@Pc(297) Class6 local297 = Class6.aClass6Array1[this.anInt303];
								local303 = local297.anIntArray86[this.anInt279];
								local297.anIntArray86[this.anInt279] = local297.anIntArray86[this.anInt304];
								local297.anIntArray86[this.anInt304] = local303;
								@Pc(325) int local325 = local297.anIntArray87[this.anInt279];
								local297.anIntArray87[this.anInt279] = local297.anIntArray87[this.anInt304];
								local297.anIntArray87[this.anInt304] = local325;
								this.aClass1_Sub1_Sub3_2.method457(128);
								this.aClass1_Sub1_Sub3_2.method459(this.anInt303);
								this.aClass1_Sub1_Sub3_2.method459(this.anInt304);
								this.aClass1_Sub1_Sub3_2.method459(this.anInt279);
							}
						} else if ((this.anInt249 == 1 || this.method116(this.anInt388 - 1)) && this.anInt388 > 2) {
							this.method111();
						} else if (this.anInt388 > 0) {
							this.method160(this.anInt388 - 1);
						}
						this.anInt266 = 10;
						super.anInt236 = 0;
					}
				}
				anInt360++;
				if (anInt360 > 127) {
					anInt360 = 0;
					this.aClass1_Sub1_Sub3_2.method457(225);
					this.aClass1_Sub1_Sub3_2.method461(4991788);
				}
				@Pc(428) int local428;
				if (Class37.anInt908 != -1) {
					local428 = Class37.anInt908;
					local303 = Class37.anInt909;
					@Pc(451) boolean local451 = this.method134(local428, 0, true, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0], 0, local303, 0, 0, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0]);
					Class37.anInt908 = -1;
					if (local451) {
						this.anInt320 = super.anInt237;
						this.anInt321 = super.anInt238;
						this.anInt323 = 1;
						this.anInt322 = 0;
					}
				}
				if (super.anInt236 == 1 && this.aString12 != null) {
					this.aString12 = null;
					this.aBoolean61 = true;
					super.anInt236 = 0;
				}
				this.method117();
				this.method156();
				this.method121();
				this.method144();
				if (super.anInt233 == 1 || super.anInt236 == 1) {
					this.anInt270++;
				}
				if (this.anInt406 == 2) {
					this.method132();
				}
				if (this.anInt406 == 2 && this.aBoolean52) {
					this.method207();
				}
				for (local428 = 0; local428 < 5; local428++) {
					@Pc(537) int local537 = this.anIntArray45[local428]++;
				}
				this.method161();
				super.anInt232++;
				if (super.anInt232 > 4500) {
					this.anInt431 = 250;
					super.anInt232 -= 500;
					this.aClass1_Sub1_Sub3_2.method457(113);
				}
				this.anInt439++;
				if (this.anInt439 > 500) {
					this.anInt439 = 0;
					local303 = (int) (Math.random() * 8.0D);
					if ((local303 & 0x1) == 1) {
						this.anInt329 += this.anInt330;
					}
					if ((local303 & 0x2) == 2) {
						this.anInt344 += this.anInt345;
					}
					if ((local303 & 0x4) == 4) {
						this.anInt318 += this.anInt319;
					}
				}
				if (this.anInt329 < -50) {
					this.anInt330 = 2;
				}
				if (this.anInt329 > 50) {
					this.anInt330 = -2;
				}
				if (this.anInt344 < -55) {
					this.anInt345 = 2;
				}
				if (this.anInt344 > 55) {
					this.anInt345 = -2;
				}
				if (this.anInt318 < -40) {
					this.anInt319 = 1;
				}
				if (this.anInt318 > 40) {
					this.anInt319 = -1;
				}
				this.anInt348++;
				if (this.anInt348 > 500) {
					this.anInt348 = 0;
					local303 = (int) (Math.random() * 8.0D);
					if ((local303 & 0x1) == 1) {
						this.anInt370 += this.anInt371;
					}
					if ((local303 & 0x2) == 2) {
						this.anInt365 += this.anInt366;
					}
				}
				if (this.anInt370 < -60) {
					this.anInt371 = 2;
				}
				if (this.anInt370 > 60) {
					this.anInt371 = -2;
				}
				if (this.anInt365 < -20) {
					this.anInt366 = 1;
				}
				if (this.anInt365 > 10) {
					this.anInt366 = -1;
				}
				anInt246++;
				if (anInt246 > 110) {
					anInt246 = 0;
					this.aClass1_Sub1_Sub3_2.method457(227);
					this.aClass1_Sub1_Sub3_2.method462(0);
				}
				this.anInt430++;
				if (this.anInt430 > 50) {
					this.aClass1_Sub1_Sub3_2.method457(251);
				}
				try {
					if (this.aClass8_1 != null && this.aClass1_Sub1_Sub3_2.anInt777 > 0) {
						this.aClass8_1.method240(this.aClass1_Sub1_Sub3_2.aByteArray9, this.aClass1_Sub1_Sub3_2.anInt777);
						this.aClass1_Sub1_Sub3_2.anInt777 = 0;
						this.anInt430 = 0;
					}
				} catch (@Pc(797) IOException local797) {
					this.method216();
				} catch (@Pc(802) Exception local802) {
					this.method133((byte) 5);
				}
			}
		} catch (@Pc(807) RuntimeException local807) {
			signlink.reporterror("6926, " + -47 + ", " + local807.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method167(@OriginalArg(0) String arg0) throws IOException {
		return signlink.mainapp == null ? new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream()) : signlink.openurl(arg0);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ZI)V")
	private void method168(@OriginalArg(1) int arg0) {
		try {
			if (!aBoolean47) {
				@Pc(15) Class1_Sub1_Sub2_Sub3 local15;
				@Pc(23) int local23;
				@Pc(31) int local31;
				@Pc(34) byte[] local34;
				@Pc(37) byte[] local37;
				@Pc(39) int local39;
				if (Class1_Sub1_Sub2_Sub1.anIntArray177[17] >= arg0) {
					local15 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array4[17];
					local23 = local15.anInt724 * local15.anInt725 - 1;
					local31 = local15.anInt724 * this.anInt316 * 2;
					local34 = local15.aByteArray7;
					local37 = this.aByteArray2;
					for (local39 = 0; local39 <= local23; local39++) {
						local37[local39] = local34[local39 - local31 & local23];
					}
					local15.aByteArray7 = local37;
					this.aByteArray2 = local34;
					Class1_Sub1_Sub2_Sub1.method359(17, (byte) 4);
				}
				if (Class1_Sub1_Sub2_Sub1.anIntArray177[24] >= arg0) {
					local15 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array4[24];
					local23 = local15.anInt724 * local15.anInt725 - 1;
					local31 = local15.anInt724 * this.anInt316 * 2;
					local34 = local15.aByteArray7;
					local37 = this.aByteArray2;
					for (local39 = 0; local39 <= local23; local39++) {
						local37[local39] = local34[local39 - local31 & local23];
					}
					local15.aByteArray7 = local37;
					this.aByteArray2 = local34;
					Class1_Sub1_Sub2_Sub1.method359(24, (byte) 4);
					return;
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("14255, " + false + ", " + arg0 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method169(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) Class6 local3 = Class6.aClass6Array1[arg0];
			for (@Pc(5) int local5 = 0; local5 < local3.anIntArray90.length && local3.anIntArray90[local5] != -1; local5++) {
				@Pc(20) Class6 local20 = Class6.aClass6Array1[local3.anIntArray90[local5]];
				if (local20.anInt453 == 1) {
					this.method169(local20.anInt451);
				}
				local20.anInt449 = 0;
				local20.anInt450 = 0;
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("78197, " + arg0 + ", " + -99 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(B)V")
	private void method170() {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt353; local1++) {
				@Pc(8) int local8 = this.anIntArray64[local1];
				@Pc(13) Class1_Sub1_Sub1_Sub1_Sub1 local13 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local8];
				if (local13 != null) {
					this.method171(local13, local13.aClass11_1.aByte31);
				}
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("43868, " + 8 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!z;ZI)V")
	private void method171(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		try {
			if (arg0.anInt128 < 128 || arg0.anInt129 < 128 || arg0.anInt128 >= 13184 || arg0.anInt129 >= 13184) {
				arg0.anInt153 = -1;
				arg0.anInt158 = -1;
				arg0.anInt167 = 0;
				arg0.anInt168 = 0;
				arg0.anInt128 = arg0.anIntArray7[0] * 128 + arg0.anInt131 * 64;
				arg0.anInt129 = arg0.anIntArray8[0] * 128 + arg0.anInt131 * 64;
				arg0.anInt173 = 0;
			}
			if (arg0 == aClass1_Sub1_Sub1_Sub1_Sub2_1 && (arg0.anInt128 < 1536 || arg0.anInt129 < 1536 || arg0.anInt128 >= 11776 || arg0.anInt129 >= 11776)) {
				arg0.anInt153 = -1;
				arg0.anInt158 = -1;
				arg0.anInt167 = 0;
				arg0.anInt168 = 0;
				arg0.anInt128 = arg0.anIntArray7[0] * 128 + arg0.anInt131 * 64;
				arg0.anInt129 = arg0.anIntArray8[0] * 128 + arg0.anInt131 * 64;
				arg0.anInt173 = 0;
			}
			if (arg0.anInt167 > anInt363) {
				this.method172(arg0);
			} else if (arg0.anInt168 >= anInt363) {
				this.method173(arg0);
			} else {
				this.method174(arg0);
			}
			this.method175(arg0);
			this.method176(arg0);
		} catch (@Pc(155) RuntimeException local155) {
			signlink.reporterror("57168, " + arg0 + ", " + false + ", " + arg1 + ", " + local155.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!z;I)V")
	private void method172(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt167 - anInt363;
			@Pc(14) int local14 = arg0.anInt163 * 128 + arg0.anInt131 * 64;
			@Pc(24) int local24 = arg0.anInt165 * 128 + arg0.anInt131 * 64;
			arg0.anInt128 += (local14 - arg0.anInt128) / local4;
			arg0.anInt129 += (local24 - arg0.anInt129) / local4;
			arg0.anInt174 = 0;
			if (arg0.anInt169 == 0) {
				arg0.anInt172 = 1024;
			}
			if (arg0.anInt169 == 1) {
				arg0.anInt172 = 1536;
			}
			if (arg0.anInt169 == 2) {
				arg0.anInt172 = 0;
			}
			if (arg0.anInt169 == 3) {
				arg0.anInt172 = 512;
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("24242, " + arg0 + ", " + 47 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!z;)V")
	private void method173(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt168 == anInt363 || arg0.anInt153 == -1 || arg0.anInt156 != 0 || arg0.anInt155 + 1 > Class25.aClass25Array1[arg0.anInt153].method485(arg0.anInt154)) {
				@Pc(29) int local29 = arg0.anInt168 - arg0.anInt167;
				@Pc(34) int local34 = anInt363 - arg0.anInt167;
				@Pc(44) int local44 = arg0.anInt163 * 128 + arg0.anInt131 * 64;
				@Pc(54) int local54 = arg0.anInt165 * 128 + arg0.anInt131 * 64;
				@Pc(64) int local64 = arg0.anInt164 * 128 + arg0.anInt131 * 64;
				@Pc(74) int local74 = arg0.anInt166 * 128 + arg0.anInt131 * 64;
				arg0.anInt128 = (local44 * (local29 - local34) + local64 * local34) / local29;
				arg0.anInt129 = (local54 * (local29 - local34) + local74 * local34) / local29;
			}
			arg0.anInt174 = 0;
			if (arg0.anInt169 == 0) {
				arg0.anInt172 = 1024;
			}
			if (arg0.anInt169 == 1) {
				arg0.anInt172 = 1536;
			}
			if (arg0.anInt169 == 2) {
				arg0.anInt172 = 0;
			}
			if (arg0.anInt169 == 3) {
				arg0.anInt172 = 512;
			}
			arg0.anInt130 = arg0.anInt172;
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("37281, " + false + ", " + arg0 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!z;)V")
	private void method174(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.anInt150 = arg0.anInt132;
			if (arg0.anInt173 == 0) {
				arg0.anInt174 = 0;
			} else {
				if (arg0.anInt153 != -1 && arg0.anInt156 == 0) {
					@Pc(24) Class25 local24 = Class25.aClass25Array1[arg0.anInt153];
					if (local24.anIntArray218 == null) {
						arg0.anInt174++;
						return;
					}
				}
				@Pc(37) int local37 = arg0.anInt128;
				@Pc(40) int local40 = arg0.anInt129;
				this.anInt427 += 0;
				@Pc(61) int local61 = arg0.anIntArray7[arg0.anInt173 - 1] * 128 + arg0.anInt131 * 64;
				@Pc(76) int local76 = arg0.anIntArray8[arg0.anInt173 - 1] * 128 + arg0.anInt131 * 64;
				if (local61 - local37 <= 256 && local61 - local37 >= -256 && local76 - local40 <= 256 && local76 - local40 >= -256) {
					if (local37 < local61) {
						if (local40 < local76) {
							arg0.anInt172 = 1280;
						} else if (local40 > local76) {
							arg0.anInt172 = 1792;
						} else {
							arg0.anInt172 = 1536;
						}
					} else if (local37 > local61) {
						if (local40 < local76) {
							arg0.anInt172 = 768;
						} else if (local40 > local76) {
							arg0.anInt172 = 256;
						} else {
							arg0.anInt172 = 512;
						}
					} else if (local40 < local76) {
						arg0.anInt172 = 1024;
					} else {
						arg0.anInt172 = 0;
					}
					@Pc(170) int local170 = arg0.anInt172 - arg0.anInt130 & 0x7FF;
					if (local170 > 1024) {
						local170 -= 2048;
					}
					@Pc(177) int local177 = arg0.anInt135;
					if (local170 >= -256 && local170 <= 256) {
						local177 = arg0.anInt134;
					} else if (local170 >= 256 && local170 < 768) {
						local177 = arg0.anInt137;
					} else if (local170 >= -768 && local170 <= -256) {
						local177 = arg0.anInt136;
					}
					if (local177 == -1) {
						local177 = arg0.anInt134;
					}
					arg0.anInt150 = local177;
					@Pc(219) int local219 = 4;
					if (arg0.anInt130 != arg0.anInt172 && arg0.anInt147 == -1) {
						local219 = 2;
					}
					if (arg0.anInt173 > 2) {
						local219 = 6;
					}
					if (arg0.anInt173 > 3) {
						local219 = 8;
					}
					if (arg0.anInt174 > 0 && arg0.anInt173 > 1) {
						local219 = 8;
						arg0.anInt174--;
					}
					if (arg0.aBooleanArray3[arg0.anInt173 - 1]) {
						local219 <<= 0x1;
					}
					if (local219 >= 8 && arg0.anInt150 == arg0.anInt134 && arg0.anInt138 != -1) {
						arg0.anInt150 = arg0.anInt138;
					}
					if (local37 < local61) {
						arg0.anInt128 += local219;
						if (arg0.anInt128 > local61) {
							arg0.anInt128 = local61;
						}
					} else if (local37 > local61) {
						arg0.anInt128 -= local219;
						if (arg0.anInt128 < local61) {
							arg0.anInt128 = local61;
						}
					}
					if (local40 < local76) {
						arg0.anInt129 += local219;
						if (arg0.anInt129 > local76) {
							arg0.anInt129 = local76;
						}
					} else if (local40 > local76) {
						arg0.anInt129 -= local219;
						if (arg0.anInt129 < local76) {
							arg0.anInt129 = local76;
						}
					}
					if (arg0.anInt128 == local61 && arg0.anInt129 == local76) {
						arg0.anInt173--;
					}
				} else {
					arg0.anInt128 = local61;
					arg0.anInt129 = local76;
				}
			}
		} catch (@Pc(369) RuntimeException local369) {
			signlink.reporterror("79177, " + 0 + ", " + arg0 + ", " + local369.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!z;I)V")
	private void method175(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			@Pc(26) int local26;
			@Pc(32) int local32;
			if (arg0.anInt147 != -1 && arg0.anInt147 < 32768) {
				@Pc(18) Class1_Sub1_Sub1_Sub1_Sub1 local18 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[arg0.anInt147];
				if (local18 != null) {
					local26 = arg0.anInt128 - local18.anInt128;
					local32 = arg0.anInt129 - local18.anInt129;
					if (local26 != 0 || local32 != 0) {
						arg0.anInt172 = (int) (Math.atan2((double) local26, (double) local32) * 325.949D) & 0x7FF;
					}
				}
			}
			@Pc(57) int local57;
			if (arg0.anInt147 >= 32768) {
				local57 = arg0.anInt147 - 32768;
				if (local57 == this.anInt255) {
					local57 = this.anInt385;
				}
				@Pc(69) Class1_Sub1_Sub1_Sub1_Sub2 local69 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local57];
				if (local69 != null) {
					local32 = arg0.anInt128 - local69.anInt128;
					@Pc(83) int local83 = arg0.anInt129 - local69.anInt129;
					if (local32 != 0 || local83 != 0) {
						arg0.anInt172 = (int) (Math.atan2((double) local32, (double) local83) * 325.949D) & 0x7FF;
					}
				}
			}
			if ((arg0.anInt148 != 0 || arg0.anInt149 != 0) && (arg0.anInt173 == 0 || arg0.anInt174 > 0)) {
				local57 = arg0.anInt128 - (arg0.anInt148 - this.anInt286 - this.anInt286) * 64;
				local26 = arg0.anInt129 - (arg0.anInt149 - this.anInt287 - this.anInt287) * 64;
				if (local57 != 0 || local26 != 0) {
					arg0.anInt172 = (int) (Math.atan2((double) local57, (double) local26) * 325.949D) & 0x7FF;
				}
				arg0.anInt148 = 0;
				arg0.anInt149 = 0;
			}
			local57 = arg0.anInt172 - arg0.anInt130 & 0x7FF;
			if (local57 != 0) {
				if (local57 < 32 || local57 > 2016) {
					arg0.anInt130 = arg0.anInt172;
				} else if (local57 > 1024) {
					arg0.anInt130 -= 32;
				} else {
					arg0.anInt130 += 32;
				}
				arg0.anInt130 &= 0x7FF;
				if (arg0.anInt150 == arg0.anInt132 && arg0.anInt130 != arg0.anInt172) {
					if (arg0.anInt133 != -1) {
						arg0.anInt150 = arg0.anInt133;
						return;
					}
					arg0.anInt150 = arg0.anInt134;
					return;
				}
			}
		} catch (@Pc(231) RuntimeException local231) {
			signlink.reporterror("17875, " + arg0 + ", " + -976 + ", " + local231.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!z;B)V")
	private void method176(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.aBoolean20 = false;
			@Pc(22) Class25 local22;
			if (arg0.anInt150 != -1) {
				local22 = Class25.aClass25Array1[arg0.anInt150];
				arg0.anInt152++;
				if (arg0.anInt151 < local22.anInt785 && arg0.anInt152 > local22.method485(arg0.anInt151)) {
					arg0.anInt152 = 0;
					arg0.anInt151++;
				}
				if (arg0.anInt151 >= local22.anInt785) {
					arg0.anInt152 = 0;
					arg0.anInt151 = 0;
				}
			}
			if (arg0.anInt153 != -1 && arg0.anInt156 == 0) {
				local22 = Class25.aClass25Array1[arg0.anInt153];
				arg0.anInt155++;
				while (arg0.anInt154 < local22.anInt785 && arg0.anInt155 > local22.method485(arg0.anInt154)) {
					arg0.anInt155 -= local22.method485(arg0.anInt154);
					arg0.anInt154++;
				}
				if (arg0.anInt154 >= local22.anInt785) {
					arg0.anInt154 -= local22.anInt786;
					arg0.anInt157++;
					if (arg0.anInt157 >= local22.anInt790) {
						arg0.anInt153 = -1;
					}
					if (arg0.anInt154 < 0 || arg0.anInt154 >= local22.anInt785) {
						arg0.anInt153 = -1;
					}
				}
				arg0.aBoolean20 = local22.aBoolean164;
			}
			if (arg0.anInt156 > 0) {
				arg0.anInt156--;
			}
			if (arg0.anInt158 != -1 && anInt363 >= arg0.anInt161) {
				if (arg0.anInt159 < 0) {
					arg0.anInt159 = 0;
				}
				local22 = Class27.aClass27Array1[arg0.anInt158].aClass25_2;
				arg0.anInt160++;
				while (arg0.anInt159 < local22.anInt785 && arg0.anInt160 > local22.method485(arg0.anInt159)) {
					arg0.anInt160 -= local22.method485(arg0.anInt159);
					arg0.anInt159++;
				}
				if (arg0.anInt159 >= local22.anInt785) {
					if (arg0.anInt159 < 0 || arg0.anInt159 >= local22.anInt785) {
						arg0.anInt158 = -1;
					}
					return;
				}
			}
		} catch (@Pc(235) RuntimeException local235) {
			signlink.reporterror("61178, " + arg0 + ", " + 2 + ", " + local235.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method177() {
		try {
			if (this.aBoolean57) {
				this.aBoolean57 = false;
				this.aClass36_19.method547(0, super.aGraphics2, 11);
				this.aClass36_20.method547(0, super.aGraphics2, 375);
				this.aClass36_21.method547(729, super.aGraphics2, 5);
				this.aClass36_22.method547(752, super.aGraphics2, 231);
				this.aClass36_23.method547(0, super.aGraphics2, 0);
				this.aClass36_24.method547(561, super.aGraphics2, 0);
				this.aClass36_25.method547(520, super.aGraphics2, 11);
				this.aClass36_26.method547(520, super.aGraphics2, 231);
				this.aClass36_27.method547(501, super.aGraphics2, 375);
				this.aClass36_28.method547(0, super.aGraphics2, 345);
				this.aBoolean49 = true;
				this.aBoolean61 = true;
				this.aBoolean60 = true;
				this.aBoolean35 = true;
				if (this.anInt406 != 2) {
					this.aClass36_17.method547(8, super.aGraphics2, 11);
					this.aClass36_16.method547(561, super.aGraphics2, 5);
				}
			}
			if (this.anInt406 == 2) {
				this.method103();
			}
			if (this.aBoolean67 && this.anInt297 == 1) {
				this.aBoolean49 = true;
			}
			@Pc(146) boolean local146;
			if (this.anInt264 != -1) {
				local146 = this.method188(this.anInt264, this.anInt316);
				if (local146) {
					this.aBoolean49 = true;
				}
			}
			if (this.anInt269 == 2) {
				this.aBoolean49 = true;
			}
			if (this.anInt305 == 2) {
				this.aBoolean49 = true;
			}
			if (this.aBoolean49) {
				this.method180();
				this.aBoolean49 = false;
			}
			if (this.anInt354 == -1) {
				this.aClass6_1.anInt462 = this.anInt408 - this.anInt423 - 77;
				if (super.anInt234 > 453 && super.anInt234 < 565 && super.anInt235 > 350) {
					this.method96(463, this.anInt408, 77, super.anInt235 - 375, 0, false, super.anInt234 - 22, this.aClass6_1);
				}
				@Pc(228) int local228 = this.anInt408 - this.aClass6_1.anInt462 - 77;
				if (local228 < 0) {
					local228 = 0;
				}
				if (local228 > this.anInt408 - 77) {
					local228 = this.anInt408 - 77;
				}
				if (this.anInt423 != local228) {
					this.anInt423 = local228;
					this.aBoolean61 = true;
				}
			}
			if (this.anInt354 != -1) {
				local146 = this.method188(this.anInt354, this.anInt316);
				if (local146) {
					this.aBoolean61 = true;
				}
			}
			if (this.anInt269 == 3) {
				this.aBoolean61 = true;
			}
			if (this.anInt305 == 3) {
				this.aBoolean61 = true;
			}
			if (this.aString12 != null) {
				this.aBoolean61 = true;
			}
			if (this.aBoolean67 && this.anInt297 == 2) {
				this.aBoolean61 = true;
			}
			if (this.aBoolean61) {
				this.method199();
				this.aBoolean61 = false;
			}
			if (this.anInt406 == 2) {
				this.method220();
				this.aClass36_16.method547(561, super.aGraphics2, 5);
			}
			if (this.anInt373 != -1) {
				this.aBoolean60 = true;
			}
			if (this.aBoolean60) {
				if (this.anInt373 != -1 && this.anInt373 == this.anInt333) {
					this.anInt373 = -1;
					this.aClass1_Sub1_Sub3_2.method457(48);
					this.aClass1_Sub1_Sub3_2.method458(this.anInt333);
				}
				this.aBoolean60 = false;
				this.aClass36_5.method546();
				this.aClass1_Sub1_Sub2_Sub3_20.method423(0, 217, 0);
				if (this.anInt264 == -1) {
					if (this.anIntArray56[this.anInt333] != -1) {
						if (this.anInt333 == 0) {
							this.aClass1_Sub1_Sub2_Sub3_13.method423(30, 217, 29);
						}
						if (this.anInt333 == 1) {
							this.aClass1_Sub1_Sub2_Sub3_14.method423(29, 217, 59);
						}
						if (this.anInt333 == 2) {
							this.aClass1_Sub1_Sub2_Sub3_14.method423(29, 217, 87);
						}
						if (this.anInt333 == 3) {
							this.aClass1_Sub1_Sub2_Sub3_15.method423(29, 217, 115);
						}
						if (this.anInt333 == 4) {
							this.aClass1_Sub1_Sub2_Sub3_17.method423(29, 217, 156);
						}
						if (this.anInt333 == 5) {
							this.aClass1_Sub1_Sub2_Sub3_17.method423(29, 217, 184);
						}
						if (this.anInt333 == 6) {
							this.aClass1_Sub1_Sub2_Sub3_16.method423(30, 217, 212);
						}
					}
					if (this.anIntArray56[0] != -1 && (this.anInt373 != 0 || anInt363 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[0].method423(34, 217, 35);
					}
					if (this.anIntArray56[1] != -1 && (this.anInt373 != 1 || anInt363 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[1].method423(32, 217, 59);
					}
					if (this.anIntArray56[2] != -1 && (this.anInt373 != 2 || anInt363 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[2].method423(32, 217, 86);
					}
					if (this.anIntArray56[3] != -1 && (this.anInt373 != 3 || anInt363 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[3].method423(33, 217, 121);
					}
					if (this.anIntArray56[4] != -1 && (this.anInt373 != 4 || anInt363 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[4].method423(34, 217, 157);
					}
					if (this.anIntArray56[5] != -1 && (this.anInt373 != 5 || anInt363 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[5].method423(32, 217, 185);
					}
					if (this.anIntArray56[6] != -1 && (this.anInt373 != 6 || anInt363 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[6].method423(34, 217, 212);
					}
				}
				this.aClass36_5.method547(520, super.aGraphics2, 165);
				this.aClass36_4.method546();
				this.aClass1_Sub1_Sub2_Sub3_19.method423(0, 217, 0);
				if (this.anInt264 == -1) {
					if (this.anIntArray56[this.anInt333] != -1) {
						if (this.anInt333 == 7) {
							this.aClass1_Sub1_Sub2_Sub3_1.method423(0, 217, 49);
						}
						if (this.anInt333 == 8) {
							this.aClass1_Sub1_Sub2_Sub3_2.method423(0, 217, 81);
						}
						if (this.anInt333 == 9) {
							this.aClass1_Sub1_Sub2_Sub3_2.method423(0, 217, 108);
						}
						if (this.anInt333 == 10) {
							this.aClass1_Sub1_Sub2_Sub3_3.method423(1, 217, 136);
						}
						if (this.anInt333 == 11) {
							this.aClass1_Sub1_Sub2_Sub3_5.method423(0, 217, 178);
						}
						if (this.anInt333 == 12) {
							this.aClass1_Sub1_Sub2_Sub3_5.method423(0, 217, 205);
						}
						if (this.anInt333 == 13) {
							this.aClass1_Sub1_Sub2_Sub3_4.method423(0, 217, 233);
						}
					}
					if (this.anIntArray56[8] != -1 && (this.anInt373 != 8 || anInt363 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[7].method423(2, 217, 80);
					}
					if (this.anIntArray56[9] != -1 && (this.anInt373 != 9 || anInt363 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[8].method423(3, 217, 107);
					}
					if (this.anIntArray56[10] != -1 && (this.anInt373 != 10 || anInt363 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[9].method423(4, 217, 142);
					}
					if (this.anIntArray56[11] != -1 && (this.anInt373 != 11 || anInt363 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[10].method423(2, 217, 179);
					}
					if (this.anIntArray56[12] != -1 && (this.anInt373 != 12 || anInt363 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[11].method423(2, 217, 206);
					}
					if (this.anIntArray56[13] != -1 && (this.anInt373 != 13 || anInt363 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[12].method423(2, 217, 230);
					}
				}
				this.aClass36_4.method547(501, super.aGraphics2, 492);
				this.aClass36_17.method546();
			}
			if (this.aBoolean35) {
				this.aBoolean35 = false;
				this.aClass36_3.method546();
				this.aClass1_Sub1_Sub2_Sub3_18.method423(0, 217, 0);
				this.aClass1_Sub1_Sub2_Sub4_2.method442(16777215, true, 57, 33, "Public chat");
				if (this.anInt356 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method442(65280, true, 57, 46, "On");
				}
				if (this.anInt356 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method442(16776960, true, 57, 46, "Friends");
				}
				if (this.anInt356 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method442(16711680, true, 57, 46, "Off");
				}
				if (this.anInt356 == 3) {
					this.aClass1_Sub1_Sub2_Sub4_2.method442(65535, true, 57, 46, "Hide");
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method442(16777215, true, 186, 33, "Private chat");
				if (this.anInt390 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method442(65280, true, 186, 46, "On");
				}
				if (this.anInt390 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method442(16776960, true, 186, 46, "Friends");
				}
				if (this.anInt390 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method442(16711680, true, 186, 46, "Off");
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method442(16777215, true, 326, 33, "Trade/duel");
				if (this.anInt293 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method442(65280, true, 326, 46, "On");
				}
				if (this.anInt293 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method442(16776960, true, 326, 46, "Friends");
				}
				if (this.anInt293 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method442(16711680, true, 326, 46, "Off");
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method442(16777215, true, 462, 38, "Report abuse");
				this.aClass36_3.method547(0, super.aGraphics2, 471);
				this.aClass36_17.method546();
			}
			this.anInt316 = 0;
			this.aBoolean72 &= true;
		} catch (@Pc(1060) RuntimeException local1060) {
			signlink.reporterror("30442, " + true + ", " + local1060.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!mb;I)V")
	private void method178(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt387; local3++) {
				@Pc(10) int local10 = this.anIntArray74[local3];
				@Pc(15) Class1_Sub1_Sub1_Sub1_Sub2 local15 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local10];
				@Pc(18) int local18 = arg0.method468();
				if ((local18 & 0x80) == 128) {
					local18 += arg0.method468() << 8;
				}
				this.method198(local10, arg0, local15, local18);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("28609, " + -716 + ", " + arg0 + ", " + arg1 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method179(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(22) int local22;
			@Pc(51) int local51;
			@Pc(55) int local55;
			@Pc(64) int local64;
			@Pc(71) int local71;
			@Pc(134) int local134;
			@Pc(204) int local204;
			try {
				this.anInt342 = -1;
				this.aClass31_3.method502();
				this.aClass31_2.method502();
				Class1_Sub1_Sub2_Sub1.method355();
				this.method155();
				this.aClass37_1.method550(this.aByte27);
				for (local22 = 0; local22 < 4; local22++) {
					this.aClass17Array1[local22].method369(this.anInt341);
				}
				System.gc();
				@Pc(47) Class4 local47 = new Class4(22035, 104, 104, this.anIntArrayArrayArray3, this.aByteArrayArrayArray7);
				local51 = this.aByteArrayArray2.length;
				Class4.aBoolean26 = Class37.aBoolean186;
				for (local55 = 0; local55 < local51; local55++) {
					local64 = this.anIntArray68[local55] >> 8;
					local71 = this.anIntArray68[local55] & 0xFF;
					if (local64 == 33 && local71 >= 71 && local71 <= 73) {
						Class4.aBoolean26 = false;
					}
				}
				if (Class4.aBoolean26) {
					this.aClass37_1.method551(this.anInt324);
				} else {
					this.aClass37_1.method551(0);
				}
				this.aClass1_Sub1_Sub3_2.method457(251);
				for (local64 = 0; local64 < local51; local64++) {
					local71 = (this.anIntArray68[local64] >> 8) * 64 - this.anInt286;
					local134 = (this.anIntArray68[local64] & 0xFF) * 64 - this.anInt287;
					@Pc(139) byte[] local139 = this.aByteArrayArray2[local64];
					if (local139 != null) {
						local47.method52(local139, (this.anInt284 - 6) * 8, local71, (this.anInt283 - 6) * 8, local134);
					} else if (this.anInt284 < 800) {
						local47.method51(local71, local134);
					}
				}
				this.aClass1_Sub1_Sub3_2.method457(251);
				for (local71 = 0; local71 < local51; local71++) {
					@Pc(190) byte[] local190 = this.aByteArrayArray1[local71];
					if (local190 != null) {
						local204 = (this.anIntArray68[local71] >> 8) * 64 - this.anInt286;
						@Pc(216) int local216 = (this.anIntArray68[local71] & 0xFF) * 64 - this.anInt287;
						local47.method55(local216, this.aClass17Array1, this.anInt357, local190, local204, this.aClass37_1);
					}
				}
				this.aClass1_Sub1_Sub3_2.method457(251);
				local47.method57(this.aClass37_1, this.aClass17Array1);
				this.aClass36_17.method546();
				this.aClass1_Sub1_Sub3_2.method457(251);
				for (local134 = 0; local134 < 104; local134++) {
					for (local204 = 0; local204 < 104; local204++) {
						this.method204(local134, local204);
					}
				}
				this.method95();
			} catch (@Pc(277) Exception local277) {
			}
			Class9.aClass39_4.method611();
			if (arg0) {
				this.aClass1_Sub1_Sub3_2.method458(42);
			}
			@Pc(297) int local297;
			if (aBoolean47 && signlink.aRandomAccessFile1 != null) {
				local22 = this.aClass42_Sub1_1.method618(0);
				for (local297 = 0; local297 < local22; local297++) {
					local51 = this.aClass42_Sub1_1.method622(local297);
					if ((local51 & 0x79) == 0) {
						Class1_Sub1_Sub1_Sub5.method278(local297);
					}
				}
			}
			System.gc();
			Class1_Sub1_Sub2_Sub1.method356();
			this.aClass42_Sub1_1.method627();
			local22 = (this.anInt283 - 6) / 8 - 1;
			local297 = (this.anInt283 + 6) / 8 + 1;
			local51 = (this.anInt284 - 6) / 8 - 1;
			local55 = (this.anInt284 + 6) / 8 + 1;
			if (this.aBoolean36) {
				local22 = 49;
				local297 = 50;
				local51 = 49;
				local55 = 50;
			}
			for (local64 = local22; local64 <= local297; local64++) {
				for (local71 = local51; local71 <= local55; local71++) {
					if (local64 == local22 || local64 == local297 || local71 == local51 || local71 == local55) {
						local134 = this.aClass42_Sub1_1.method620(local71, 0, local64);
						if (local134 != -1) {
							this.aClass42_Sub1_1.method628(3, local134);
						}
						local204 = this.aClass42_Sub1_1.method620(local71, 1, local64);
						if (local204 != -1) {
							this.aClass42_Sub1_1.method628(3, local204);
						}
					}
				}
			}
		} catch (@Pc(435) RuntimeException local435) {
			signlink.reporterror("26766, " + arg0 + ", " + local435.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method180() {
		try {
			this.aClass36_15.method546();
			Class1_Sub1_Sub2_Sub1.anIntArray175 = this.anIntArray66;
			this.aClass1_Sub1_Sub2_Sub3_8.method423(0, 217, 0);
			if (this.anInt264 != -1) {
				this.method149(Class6.aClass6Array1[this.anInt264], 0, 0, 0);
			} else if (this.anIntArray56[this.anInt333] != -1) {
				this.method149(Class6.aClass6Array1[this.anIntArray56[this.anInt333]], 0, 0, 0);
			}
			if (this.aBoolean67 && this.anInt297 == 1) {
				this.method100();
			}
			this.aClass36_15.method547(562, super.aGraphics2, 231);
			this.aClass36_17.method546();
			Class1_Sub1_Sub2_Sub1.anIntArray175 = this.anIntArray67;
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("20417, " + true + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method86() {
		try {
			signlink.reporterror = false;
			try {
				if (this.aClass8_1 != null) {
					this.aClass8_1.method236();
				}
			} catch (@Pc(9) Exception local9) {
			}
			this.aClass8_1 = null;
			this.method218();
			this.aClass42_Sub1_1.method617();
			this.aClass42_Sub1_1 = null;
			this.aClass1_Sub1_Sub3_2 = null;
			this.aClass1_Sub1_Sub3_3 = null;
			this.aClass1_Sub1_Sub3_4 = null;
			this.anIntArray68 = null;
			this.aByteArrayArray2 = null;
			this.aByteArrayArray1 = null;
			this.anIntArray69 = null;
			this.anIntArray70 = null;
			this.anIntArrayArrayArray3 = null;
			this.aByteArrayArrayArray7 = null;
			this.aClass37_1 = null;
			this.aClass17Array1 = null;
			this.anIntArrayArray2 = null;
			this.anIntArrayArray4 = null;
			this.anIntArray37 = null;
			this.anIntArray38 = null;
			this.aByteArray2 = null;
			this.aClass36_15 = null;
			this.aClass36_16 = null;
			this.aClass36_17 = null;
			this.aClass36_18 = null;
			this.aClass36_3 = null;
			this.aClass36_4 = null;
			this.aClass36_5 = null;
			this.aClass36_19 = null;
			this.aClass36_20 = null;
			this.aClass36_21 = null;
			this.aClass36_22 = null;
			this.aClass36_23 = null;
			if (this.aByte23 == 68) {
				this.aClass36_24 = null;
				this.aClass36_25 = null;
				this.aClass36_26 = null;
				this.aClass36_27 = null;
				this.aClass36_28 = null;
				this.aClass1_Sub1_Sub2_Sub3_8 = null;
				this.aClass1_Sub1_Sub2_Sub3_9 = null;
				this.aClass1_Sub1_Sub2_Sub3_10 = null;
				this.aClass1_Sub1_Sub2_Sub3_18 = null;
				this.aClass1_Sub1_Sub2_Sub3_19 = null;
				this.aClass1_Sub1_Sub2_Sub3_20 = null;
				this.aClass1_Sub1_Sub2_Sub3Array1 = null;
				this.aClass1_Sub1_Sub2_Sub3_13 = null;
				this.aClass1_Sub1_Sub2_Sub3_14 = null;
				this.aClass1_Sub1_Sub2_Sub3_15 = null;
				this.aClass1_Sub1_Sub2_Sub3_16 = null;
				this.aClass1_Sub1_Sub2_Sub3_17 = null;
				this.aClass1_Sub1_Sub2_Sub3_1 = null;
				this.aClass1_Sub1_Sub2_Sub3_2 = null;
				this.aClass1_Sub1_Sub2_Sub3_3 = null;
				this.aClass1_Sub1_Sub2_Sub3_4 = null;
				this.aClass1_Sub1_Sub2_Sub3_5 = null;
				this.aClass1_Sub1_Sub2_Sub2_11 = null;
				this.aClass1_Sub1_Sub2_Sub2Array5 = null;
				this.aClass1_Sub1_Sub2_Sub2Array3 = null;
				this.aClass1_Sub1_Sub2_Sub2Array6 = null;
				this.aClass1_Sub1_Sub2_Sub2_7 = null;
				this.aClass1_Sub1_Sub2_Sub2_8 = null;
				this.aClass1_Sub1_Sub2_Sub2_9 = null;
				this.aClass1_Sub1_Sub2_Sub2_10 = null;
				this.aClass1_Sub1_Sub2_Sub3Array2 = null;
				this.aClass1_Sub1_Sub2_Sub2Array4 = null;
				this.anIntArrayArray5 = null;
				this.aClass1_Sub1_Sub1_Sub1_Sub2Array1 = null;
				this.anIntArray73 = null;
				this.anIntArray74 = null;
				this.aClass1_Sub1_Sub3Array1 = null;
				this.anIntArray51 = null;
				this.aClass1_Sub1_Sub1_Sub1_Sub1Array1 = null;
				this.anIntArray64 = null;
				this.aClass31ArrayArrayArray1 = null;
				this.aClass31_1 = null;
				this.aClass31_2 = null;
				this.aClass31_3 = null;
				this.anIntArray80 = null;
				this.anIntArray81 = null;
				this.anIntArray82 = null;
				this.anIntArray83 = null;
				this.aStringArray2 = null;
				this.anIntArray47 = null;
				this.anIntArray34 = null;
				this.anIntArray35 = null;
				this.aClass1_Sub1_Sub2_Sub2Array7 = null;
				this.aClass1_Sub1_Sub2_Sub2_6 = null;
				this.aStringArray5 = null;
				this.aLongArray3 = null;
				this.anIntArray79 = null;
				this.aClass36_9 = null;
				this.aClass36_10 = null;
				this.aClass36_6 = null;
				this.aClass36_7 = null;
				this.aClass36_8 = null;
				this.aClass36_11 = null;
				this.aClass36_12 = null;
				this.aClass36_13 = null;
				this.aClass36_14 = null;
				this.method206();
				Class9.method249();
				Class11.method305();
				Class13.method316((byte) 7);
				Class19.aClass19Array1 = null;
				Class21.aClass21Array1 = null;
				Class6.aClass6Array1 = null;
				Class23.aClass23Array1 = null;
				Class25.aClass25Array1 = null;
				Class27.aClass27Array1 = null;
				Class27.aClass39_9 = null;
				Class29.aClass29Array1 = null;
				super.aClass36_2 = null;
				Class1_Sub1_Sub1_Sub1_Sub2.aClass39_1 = null;
				Class1_Sub1_Sub2_Sub1.method352((byte) 7);
				Class37.method549();
				Class1_Sub1_Sub1_Sub5.method275((byte) 7);
				Class14.method330();
				System.gc();
			}
		} catch (@Pc(352) RuntimeException local352) {
			signlink.reporterror("6088, " + 68 + ", " + local352.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method181(@OriginalArg(1) int arg0) {
		try {
			signlink.anInt927 = arg0;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("94281, " + -552 + ", " + arg0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!d;I)Z")
	private boolean method182(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1) {
		try {
			while (arg1 >= 0) {
				this.anInt428 = this.aClass1_Sub1_Sub3_4.method468();
			}
			@Pc(13) int local13 = arg0.anInt455;
			if (local13 >= 1 && local13 <= 200) {
				if (local13 >= 101) {
					local13 -= 101;
				} else {
					local13--;
				}
				this.aStringArray2[this.anInt388] = "Remove @whi@" + this.aStringArray5[local13];
				this.anIntArray82[this.anInt388] = 557;
				this.anInt388++;
				this.aStringArray2[this.anInt388] = "Message @whi@" + this.aStringArray5[local13];
				this.anIntArray82[this.anInt388] = 679;
				this.anInt388++;
				return true;
			} else if (local13 >= 401 && local13 <= 500) {
				this.aStringArray2[this.anInt388] = "Remove @whi@" + arg0.aString19;
				this.anIntArray82[this.anInt388] = 556;
				this.anInt388++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("7025, " + arg0 + ", " + arg1 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method183() {
		try {
			if (this.anInt388 >= 2 || this.anInt376 != 0 || this.anInt391 != 0) {
				@Pc(36) String local36;
				if (this.anInt376 == 1 && this.anInt388 < 2) {
					local36 = "Use " + this.aString11 + " with...";
				} else if (this.anInt391 == 1 && this.anInt388 < 2) {
					local36 = this.aString13 + "...";
				} else {
					local36 = this.aStringArray2[this.anInt388 - 1];
				}
				if (this.anInt388 > 2) {
					local36 = local36 + "@whi@ / " + (this.anInt388 - 2) + " more options";
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method447(15, anInt363 / 1000, local36, 4, 16777215);
			}
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("71138, " + 385 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)Z")
	private boolean method184(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0) {
				throw new NullPointerException();
			} else if (this.aClass8_1 == null) {
				return false;
			} else {
				@Pc(2098) String local2098;
				@Pc(273) int local273;
				try {
					@Pc(16) int local16 = this.aClass8_1.method238();
					if (local16 == 0) {
						return false;
					}
					if (this.anInt428 == -1) {
						this.aClass8_1.method239(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, 1);
						this.anInt428 = this.aClass1_Sub1_Sub3_4.aByteArray9[0] & 0xFF;
						if (this.aClass44_1 != null) {
							this.anInt428 = this.anInt428 - this.aClass44_1.method640() & 0xFF;
						}
						this.anInt427 = Class15.anIntArray169[this.anInt428];
						local16--;
					}
					if (this.anInt427 == -1) {
						if (local16 <= 0) {
							return false;
						}
						this.aClass8_1.method239(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, 1);
						this.anInt427 = this.aClass1_Sub1_Sub3_4.aByteArray9[0] & 0xFF;
						local16--;
					}
					if (this.anInt427 == -2) {
						if (local16 <= 1) {
							return false;
						}
						this.aClass8_1.method239(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, 2);
						this.aClass1_Sub1_Sub3_4.anInt777 = 0;
						this.anInt427 = this.aClass1_Sub1_Sub3_4.method470();
						local16 -= 2;
					}
					if (local16 < this.anInt427) {
						return false;
					}
					this.aClass1_Sub1_Sub3_4.anInt777 = 0;
					this.aClass8_1.method239(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, this.anInt427);
					this.anInt429 = 0;
					this.anInt417 = this.anInt416;
					this.anInt416 = this.anInt415;
					this.anInt415 = this.anInt428;
					if (this.anInt428 == 11) {
						this.anInt432 = this.aClass1_Sub1_Sub3_4.method470() * 30;
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 90) {
						this.anInt314 = this.aClass1_Sub1_Sub3_4.method468();
						this.anInt315 = this.aClass1_Sub1_Sub3_4.method468();
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 202) {
						this.aBoolean52 = true;
						this.anInt418 = this.aClass1_Sub1_Sub3_4.method468();
						this.anInt419 = this.aClass1_Sub1_Sub3_4.method468();
						this.anInt420 = this.aClass1_Sub1_Sub3_4.method470();
						this.anInt421 = this.aClass1_Sub1_Sub3_4.method468();
						this.anInt422 = this.aClass1_Sub1_Sub3_4.method468();
						if (this.anInt422 >= 100) {
							this.anInt258 = this.anInt418 * 128 + 64;
							this.anInt260 = this.anInt419 * 128 + 64;
							this.anInt259 = this.method194(this.anInt324, this.anInt419, this.anInt418) - this.anInt420;
						}
						this.anInt428 = -1;
						return true;
					}
					@Pc(277) int local277;
					@Pc(294) int local294;
					@Pc(269) int local269;
					if (this.anInt428 == 159) {
						this.aBoolean49 = true;
						local269 = this.aClass1_Sub1_Sub3_4.method468();
						local273 = this.aClass1_Sub1_Sub3_4.method473();
						local277 = this.aClass1_Sub1_Sub3_4.method468();
						this.anIntArray44[local269] = local273;
						this.anIntArray57[local269] = local277;
						this.anIntArray39[local269] = 1;
						for (local294 = 0; local294 < 98; local294++) {
							if (local273 >= anIntArray84[local294]) {
								this.anIntArray39[local269] = local294 + 2;
							}
						}
						this.anInt428 = -1;
						return true;
					}
					@Pc(461) int local461;
					@Pc(520) int local520;
					@Pc(578) int local578;
					@Pc(599) int local599;
					if (this.anInt428 == 3) {
						local269 = this.aClass1_Sub1_Sub3_4.method470();
						local273 = this.aClass1_Sub1_Sub3_4.method470();
						if (this.anInt283 == local269 && this.anInt284 == local273 && this.anInt406 == 2) {
							this.anInt428 = -1;
							return true;
						}
						this.anInt283 = local269;
						this.anInt284 = local273;
						this.anInt286 = (this.anInt283 - 6) * 8;
						this.anInt287 = (this.anInt284 - 6) * 8;
						this.aBoolean36 = false;
						if ((this.anInt283 / 8 == 48 || this.anInt283 / 8 == 49) && this.anInt284 / 8 == 48) {
							this.aBoolean36 = true;
						}
						if (this.anInt283 / 8 == 48 && this.anInt284 / 8 == 148) {
							this.aBoolean36 = true;
						}
						this.anInt406 = 1;
						this.aLong12 = System.currentTimeMillis();
						this.aClass36_17.method546();
						this.aClass1_Sub1_Sub2_Sub4_2.method441(this.aByte28, "Loading - please wait.", 257, 151, 0);
						this.aClass1_Sub1_Sub2_Sub4_2.method441(this.aByte28, "Loading - please wait.", 256, 150, 16777215);
						this.aClass36_17.method547(8, super.aGraphics2, 11);
						local277 = 0;
						for (local294 = (this.anInt283 - 6) / 8; local294 <= (this.anInt283 + 6) / 8; local294++) {
							for (local461 = (this.anInt284 - 6) / 8; local461 <= (this.anInt284 + 6) / 8; local461++) {
								local277++;
							}
						}
						this.aByteArrayArray2 = new byte[local277][];
						this.aByteArrayArray1 = new byte[local277][];
						this.anIntArray68 = new int[local277];
						this.anIntArray69 = new int[local277];
						this.anIntArray70 = new int[local277];
						local277 = 0;
						for (local461 = (this.anInt283 - 6) / 8; local461 <= (this.anInt283 + 6) / 8; local461++) {
							for (local520 = (this.anInt284 - 6) / 8; local520 <= (this.anInt284 + 6) / 8; local520++) {
								this.anIntArray68[local277] = (local461 << 8) + local520;
								if (this.aBoolean36 && (local520 == 49 || local520 == 149 || local520 == 147 || local461 == 50 || local461 == 49 && local520 == 47)) {
									this.anIntArray69[local277] = -1;
									this.anIntArray70[local277] = -1;
									local277++;
								} else {
									local578 = this.anIntArray69[local277] = this.aClass42_Sub1_1.method620(local520, 0, local461);
									if (local578 != -1) {
										this.aClass42_Sub1_1.method623(3, local578);
									}
									local599 = this.anIntArray70[local277] = this.aClass42_Sub1_1.method620(local520, 1, local461);
									if (local599 != -1) {
										this.aClass42_Sub1_1.method623(3, local599);
									}
									local277++;
								}
							}
						}
						local520 = this.anInt286 - this.anInt288;
						local578 = this.anInt287 - this.anInt289;
						this.anInt288 = this.anInt286;
						this.anInt289 = this.anInt287;
						for (local599 = 0; local599 < 8192; local599++) {
							@Pc(655) Class1_Sub1_Sub1_Sub1_Sub1 local655 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local599];
							if (local655 != null) {
								for (@Pc(659) int local659 = 0; local659 < 10; local659++) {
									local655.anIntArray7[local659] -= local520;
									local655.anIntArray8[local659] -= local578;
								}
								local655.anInt128 -= local520 * 128;
								local655.anInt129 -= local578 * 128;
							}
						}
						for (@Pc(703) int local703 = 0; local703 < this.anInt384; local703++) {
							@Pc(710) Class1_Sub1_Sub1_Sub1_Sub2 local710 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local703];
							if (local710 != null) {
								for (@Pc(714) int local714 = 0; local714 < 10; local714++) {
									local710.anIntArray7[local714] -= local520;
									local710.anIntArray8[local714] -= local578;
								}
								local710.anInt128 -= local520 * 128;
								local710.anInt129 -= local578 * 128;
							}
						}
						this.aBoolean71 = true;
						@Pc(762) byte local762 = 0;
						@Pc(764) byte local764 = 104;
						@Pc(766) byte local766 = 1;
						if (local520 < 0) {
							local762 = 103;
							local764 = -1;
							local766 = -1;
						}
						@Pc(776) byte local776 = 0;
						@Pc(778) byte local778 = 104;
						@Pc(780) byte local780 = 1;
						if (local578 < 0) {
							local776 = 103;
							local778 = -1;
							local780 = -1;
						}
						for (@Pc(790) int local790 = local762; local790 != local764; local790 += local766) {
							for (@Pc(794) int local794 = local776; local794 != local778; local794 += local780) {
								@Pc(800) int local800 = local790 + local520;
								@Pc(804) int local804 = local794 + local578;
								for (@Pc(806) int local806 = 0; local806 < 4; local806++) {
									if (local800 >= 0 && local804 >= 0 && local800 < 104 && local804 < 104) {
										this.aClass31ArrayArrayArray1[local806][local790][local794] = this.aClass31ArrayArrayArray1[local806][local800][local804];
									} else {
										this.aClass31ArrayArrayArray1[local806][local790][local794] = null;
									}
								}
							}
						}
						for (@Pc(868) Class1_Sub2 local868 = (Class1_Sub2) this.aClass31_1.method498(); local868 != null; local868 = (Class1_Sub2) this.aClass31_1.method500()) {
							local868.anInt830 -= local520;
							local868.anInt831 -= local578;
							if (local868.anInt830 < 0 || local868.anInt831 < 0 || local868.anInt830 >= 104 || local868.anInt831 >= 104) {
								local868.method635();
							}
						}
						if (this.anInt325 != 0) {
							this.anInt325 -= local520;
							this.anInt326 -= local578;
						}
						this.aBoolean52 = false;
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 110) {
						@Pc(936) Class1_Sub1_Sub3 local936 = Class10.method260();
						if (local936 != null) {
							this.aClass1_Sub1_Sub3_2.method457(54);
							this.aClass1_Sub1_Sub3_2.method459(local936.anInt777);
							this.aClass1_Sub1_Sub3_2.method466(local936.aByteArray9, local936.anInt777);
							local936.method456();
						}
						this.anInt428 = -1;
						return true;
					}
					@Pc(984) boolean local984;
					@Pc(974) long local974;
					if (this.anInt428 == 82) {
						local974 = this.aClass1_Sub1_Sub3_4.method474(408);
						local277 = this.aClass1_Sub1_Sub3_4.method473();
						local294 = this.aClass1_Sub1_Sub3_4.method468();
						local984 = false;
						for (local520 = 0; local520 < 100; local520++) {
							if (this.anIntArray72[local520] == local277) {
								local984 = true;
								break;
							}
						}
						if (local294 <= 1) {
							for (local578 = 0; local578 < this.anInt273; local578++) {
								if (this.aLongArray4[local578] == local974) {
									local984 = true;
									break;
								}
							}
						}
						if (!local984 && this.anInt383 == 0) {
							try {
								this.anIntArray72[this.anInt308] = local277;
								this.anInt308 = (this.anInt308 + 1) % 100;
								@Pc(1053) String local1053 = Class2.method36(this.anInt427 - 13, 113, this.aClass1_Sub1_Sub3_4);
								@Pc(1057) String local1057 = Class32.method513(local1053);
								if (local294 > 1) {
									this.method123(7, Class46.method649(Class46.method646(local974)), local1057);
								} else {
									this.method123(3, Class46.method649(Class46.method646(local974)), local1057);
								}
							} catch (@Pc(1084) Exception local1084) {
								signlink.reporterror("cde1");
							}
						}
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 64) {
						this.anInt273 = this.anInt427 / 8;
						for (local269 = 0; local269 < this.anInt273; local269++) {
							this.aLongArray4[local269] = this.aClass1_Sub1_Sub3_4.method474(408);
						}
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 15) {
						local269 = this.aClass1_Sub1_Sub3_4.method470();
						local273 = this.aClass1_Sub1_Sub3_4.method468();
						if (local269 == 65535) {
							local269 = -1;
						}
						this.anIntArray56[local273] = local269;
						this.aBoolean49 = true;
						this.aBoolean60 = true;
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 153) {
						for (local269 = 0; local269 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length; local269++) {
							if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local269] != null) {
								this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local269].anInt153 = -1;
							}
						}
						for (local273 = 0; local273 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length; local273++) {
							if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local273] != null) {
								this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local273].anInt153 = -1;
							}
						}
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 254) {
						this.method99(this.aClass1_Sub1_Sub3_4, this.anInt427);
						this.aBoolean71 = false;
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 228) {
						this.anInt440 = this.aClass1_Sub1_Sub3_4.method468();
						if (this.anInt440 == 1) {
							this.anInt317 = this.aClass1_Sub1_Sub3_4.method470();
						}
						if (this.anInt440 >= 2 && this.anInt440 <= 6) {
							if (this.anInt440 == 2) {
								this.anInt437 = 64;
								this.anInt438 = 64;
							}
							if (this.anInt440 == 3) {
								this.anInt437 = 0;
								this.anInt438 = 64;
							}
							if (this.anInt440 == 4) {
								this.anInt437 = 128;
								this.anInt438 = 64;
							}
							if (this.anInt440 == 5) {
								this.anInt437 = 64;
								this.anInt438 = 0;
							}
							if (this.anInt440 == 6) {
								this.anInt437 = 64;
								this.anInt438 = 128;
							}
							this.anInt440 = 2;
							this.anInt434 = this.aClass1_Sub1_Sub3_4.method470();
							this.anInt435 = this.aClass1_Sub1_Sub3_4.method470();
							this.anInt436 = this.aClass1_Sub1_Sub3_4.method468();
						}
						if (this.anInt440 == 10) {
							this.anInt369 = this.aClass1_Sub1_Sub3_4.method470();
						}
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 130) {
						this.method213(this.aClass1_Sub1_Sub3_4, this.anInt427);
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 200) {
						if (this.anInt333 == 12) {
							this.aBoolean49 = true;
						}
						this.anInt252 = this.aClass1_Sub1_Sub3_4.method471();
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 118) {
						local269 = this.aClass1_Sub1_Sub3_4.method468();
						local273 = this.aClass1_Sub1_Sub3_4.method468();
						local277 = this.aClass1_Sub1_Sub3_4.method468();
						local294 = this.aClass1_Sub1_Sub3_4.method468();
						this.aBooleanArray4[local269] = true;
						this.anIntArray43[local269] = local273;
						this.anIntArray40[local269] = local277;
						this.anIntArray85[local269] = local294;
						this.anIntArray45[local269] = 0;
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 27) {
						this.anInt255 = this.aClass1_Sub1_Sub3_4.method470();
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 35) {
						this.anInt356 = this.aClass1_Sub1_Sub3_4.method468();
						this.anInt390 = this.aClass1_Sub1_Sub3_4.method468();
						this.anInt293 = this.aClass1_Sub1_Sub3_4.method468();
						this.aBoolean35 = true;
						this.aBoolean61 = true;
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 115) {
						if (this.anInt264 != -1) {
							this.anInt264 = -1;
							this.aBoolean49 = true;
							this.aBoolean60 = true;
						}
						if (this.anInt354 != -1) {
							this.anInt354 = -1;
							this.aBoolean61 = true;
						}
						if (this.aBoolean48) {
							this.aBoolean48 = false;
							this.aBoolean61 = true;
						}
						this.anInt296 = -1;
						this.aBoolean53 = false;
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 2) {
						local974 = this.aClass1_Sub1_Sub3_4.method474(408);
						local277 = this.aClass1_Sub1_Sub3_4.method468();
						@Pc(1532) String local1532 = Class46.method649(Class46.method646(local974));
						for (local461 = 0; local461 < this.anInt339; local461++) {
							if (local974 == this.aLongArray3[local461]) {
								if (this.anIntArray79[local461] != local277) {
									this.anIntArray79[local461] = local277;
									this.aBoolean49 = true;
									if (local277 > 0) {
										this.method123(5, "", local1532 + " has logged in.");
									}
									if (local277 == 0) {
										this.method123(5, "", local1532 + " has logged out.");
									}
								}
								local1532 = null;
								break;
							}
						}
						if (local1532 != null && this.anInt339 < 100) {
							this.aLongArray3[this.anInt339] = local974;
							this.aStringArray5[this.anInt339] = local1532;
							this.anIntArray79[this.anInt339] = local277;
							this.anInt339++;
							this.aBoolean49 = true;
						}
						@Pc(1630) boolean local1630 = false;
						while (!local1630) {
							local1630 = true;
							for (local578 = 0; local578 < this.anInt339 - 1; local578++) {
								if (this.anIntArray79[local578] != anInt275 && this.anIntArray79[local578 + 1] == anInt275 || this.anIntArray79[local578] == 0 && this.anIntArray79[local578 + 1] != 0) {
									local599 = this.anIntArray79[local578];
									this.anIntArray79[local578] = this.anIntArray79[local578 + 1];
									this.anIntArray79[local578 + 1] = local599;
									@Pc(1691) String local1691 = this.aStringArray5[local578];
									this.aStringArray5[local578] = this.aStringArray5[local578 + 1];
									this.aStringArray5[local578 + 1] = local1691;
									@Pc(1713) long local1713 = this.aLongArray3[local578];
									this.aLongArray3[local578] = this.aLongArray3[local578 + 1];
									this.aLongArray3[local578 + 1] = local1713;
									this.aBoolean49 = true;
									local1630 = false;
								}
							}
						}
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 65) {
						this.anInt325 = 0;
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 8) {
						this.aBoolean52 = false;
						for (local269 = 0; local269 < 5; local269++) {
							this.aBooleanArray4[local269] = false;
						}
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 21) {
						local269 = this.aClass1_Sub1_Sub3_4.method470();
						Class6.aClass6Array1[local269].anInt469 = 3;
						Class6.aClass6Array1[local269].anInt470 = (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray10[0] << 24) + (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray10[4] << 18) + (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray9[0] << 12) + (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray9[8] << 6) + aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray9[11];
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 183) {
						local269 = this.aClass1_Sub1_Sub3_4.method470();
						local273 = this.aClass1_Sub1_Sub3_4.method470();
						Class6.aClass6Array1[local269].anInt473 = local273;
						this.anInt428 = -1;
						return true;
					}
					@Pc(1877) Class6 local1877;
					if (this.anInt428 == 182) {
						this.aBoolean49 = true;
						local269 = this.aClass1_Sub1_Sub3_4.method470();
						local1877 = Class6.aClass6Array1[local269];
						while (this.aClass1_Sub1_Sub3_4.anInt777 < this.anInt427) {
							local277 = this.aClass1_Sub1_Sub3_4.method468();
							local294 = this.aClass1_Sub1_Sub3_4.method470();
							local461 = this.aClass1_Sub1_Sub3_4.method468();
							if (local461 == 255) {
								local461 = this.aClass1_Sub1_Sub3_4.method473();
							}
							if (local277 >= 0 && local277 < local1877.anIntArray86.length) {
								local1877.anIntArray86[local277] = local294;
								local1877.anIntArray87[local277] = local461;
							}
						}
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 24) {
						this.anInt340 = this.aClass1_Sub1_Sub3_4.method473();
						this.anInt265 = this.aClass1_Sub1_Sub3_4.method470();
						this.anInt403 = this.aClass1_Sub1_Sub3_4.method468();
						this.anInt332 = this.aClass1_Sub1_Sub3_4.method470();
						if (this.anInt340 != 0 && this.anInt296 == -1) {
							signlink.dnslookup(Class46.method648(this.anInt340));
							this.method109();
							@Pc(1967) short local1967 = 650;
							if (this.anInt403 != 201) {
								local1967 = 655;
							}
							this.aString7 = "";
							this.aBoolean44 = false;
							for (local273 = 0; local273 < Class6.aClass6Array1.length; local273++) {
								if (Class6.aClass6Array1[local273] != null && Class6.aClass6Array1[local273].anInt455 == local1967) {
									this.anInt296 = Class6.aClass6Array1[local273].anInt452;
									break;
								}
							}
						}
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 186) {
						if (this.anInt333 == 12) {
							this.aBoolean49 = true;
						}
						this.anInt327 = this.aClass1_Sub1_Sub3_4.method468();
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 155) {
						local269 = this.aClass1_Sub1_Sub3_4.method470();
						local273 = this.aClass1_Sub1_Sub3_4.method471();
						local277 = this.aClass1_Sub1_Sub3_4.method471();
						@Pc(2052) Class6 local2052 = Class6.aClass6Array1[local269];
						local2052.anInt458 = local273;
						local2052.anInt459 = local277;
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 211) {
						local269 = this.aClass1_Sub1_Sub3_4.method470();
						local273 = this.aClass1_Sub1_Sub3_4.method470();
						Class6.aClass6Array1[local269].anInt469 = 1;
						Class6.aClass6Array1[local269].anInt470 = local273;
						this.anInt428 = -1;
						return true;
					}
					@Pc(2109) String local2109;
					if (this.anInt428 == 177) {
						local2098 = this.aClass1_Sub1_Sub3_4.method475();
						@Pc(2112) long local2112;
						if (local2098.endsWith(":tradereq:")) {
							local2109 = local2098.substring(0, local2098.indexOf(":"));
							local2112 = Class46.method645(local2109);
							local984 = false;
							for (local520 = 0; local520 < this.anInt273; local520++) {
								if (this.aLongArray4[local520] == local2112) {
									local984 = true;
									break;
								}
							}
							if (!local984 && this.anInt383 == 0) {
								this.method123(4, local2109, "wishes to trade with you.");
							}
						} else if (local2098.endsWith(":duelreq:")) {
							local2109 = local2098.substring(0, local2098.indexOf(":"));
							local2112 = Class46.method645(local2109);
							local984 = false;
							for (local520 = 0; local520 < this.anInt273; local520++) {
								if (this.aLongArray4[local520] == local2112) {
									local984 = true;
									break;
								}
							}
							if (!local984 && this.anInt383 == 0) {
								this.method123(8, local2109, "wishes to duel with you.");
							}
						} else {
							this.method123(0, "", local2098);
						}
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 178) {
						local269 = this.aClass1_Sub1_Sub3_4.method470();
						if (local269 == 65535) {
							local269 = -1;
						}
						if (local269 != this.anInt256 && this.aBoolean40 && !aBoolean47) {
							this.anInt274 = local269;
							this.aBoolean45 = true;
							this.aClass42_Sub1_1.method623(2, this.anInt274);
						}
						this.anInt256 = local269;
						this.anInt336 = 0;
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 75) {
						local269 = this.aClass1_Sub1_Sub3_4.method470();
						local273 = this.aClass1_Sub1_Sub3_4.method470();
						if (this.aBoolean40 && !aBoolean47) {
							this.anInt274 = local269;
							this.aBoolean45 = false;
							this.aClass42_Sub1_1.method623(2, this.anInt274);
							this.anInt336 = local273;
						}
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 157) {
						local269 = this.aClass1_Sub1_Sub3_4.method470();
						local1877 = Class6.aClass6Array1[local269];
						for (local277 = 0; local277 < local1877.anIntArray86.length; local277++) {
							local1877.anIntArray86[local277] = -1;
							local1877.anIntArray86[local277] = 0;
						}
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 144) {
						this.anInt314 = this.aClass1_Sub1_Sub3_4.method468();
						this.anInt315 = this.aClass1_Sub1_Sub3_4.method468();
						for (local269 = this.anInt314; local269 < this.anInt314 + 8; local269++) {
							for (local273 = this.anInt315; local273 < this.anInt315 + 8; local273++) {
								if (this.aClass31ArrayArrayArray1[this.anInt324][local269][local273] != null) {
									this.aClass31ArrayArrayArray1[this.anInt324][local269][local273] = null;
									this.method204(local269, local273);
								}
							}
						}
						for (@Pc(2393) Class1_Sub2 local2393 = (Class1_Sub2) this.aClass31_1.method498(); local2393 != null; local2393 = (Class1_Sub2) this.aClass31_1.method500()) {
							if (local2393.anInt830 >= this.anInt314 && local2393.anInt830 < this.anInt314 + 8 && local2393.anInt831 >= this.anInt315 && local2393.anInt831 < this.anInt315 + 8 && local2393.anInt828 == this.anInt324) {
								local2393.anInt839 = 0;
							}
						}
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 43) {
						for (local269 = 0; local269 < this.anIntArray47.length; local269++) {
							if (this.anIntArray47[local269] != this.anIntArray75[local269]) {
								this.anIntArray47[local269] = this.anIntArray75[local269];
								this.method118(local269);
								this.aBoolean49 = true;
							}
						}
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 22) {
						this.aBoolean34 = false;
						this.aBoolean48 = true;
						this.aString6 = "";
						this.aBoolean61 = true;
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 36) {
						local269 = this.aClass1_Sub1_Sub3_4.method470();
						this.method169(local269);
						if (this.anInt264 != -1) {
							this.anInt264 = -1;
							this.aBoolean49 = true;
							this.aBoolean60 = true;
						}
						if (this.anInt354 != -1) {
							this.anInt354 = -1;
							this.aBoolean61 = true;
						}
						if (this.aBoolean48) {
							this.aBoolean48 = false;
							this.aBoolean61 = true;
						}
						this.anInt296 = local269;
						this.aBoolean53 = false;
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 135) {
						local269 = this.aClass1_Sub1_Sub3_4.method470();
						@Pc(2571) byte local2571 = this.aClass1_Sub1_Sub3_4.method469();
						this.anIntArray75[local269] = local2571;
						if (this.anIntArray47[local269] != local2571) {
							this.anIntArray47[local269] = local2571;
							this.method118(local269);
							this.aBoolean49 = true;
							if (this.anInt362 != -1) {
								this.aBoolean61 = true;
							}
						}
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 246 || this.anInt428 == 248 || this.anInt428 == 131 || this.anInt428 == 215 || this.anInt428 == 67 || this.anInt428 == 247 || this.anInt428 == 167 || this.anInt428 == 230 || this.anInt428 == 31 || this.anInt428 == 112) {
						this.method221(this.aClass1_Sub1_Sub3_4, this.anInt428);
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 78) {
						local269 = this.aClass1_Sub1_Sub3_4.method470();
						local273 = this.aClass1_Sub1_Sub3_4.method470();
						local277 = this.aClass1_Sub1_Sub3_4.method470();
						@Pc(2677) Class13 local2677 = Class13.method317(local273);
						Class6.aClass6Array1[local269].anInt469 = 4;
						Class6.aClass6Array1[local269].anInt470 = local273;
						Class6.aClass6Array1[local269].anInt476 = local2677.anInt597;
						Class6.aClass6Array1[local269].anInt477 = local2677.anInt598;
						Class6.aClass6Array1[local269].anInt475 = local2677.anInt596 * 100 / local277;
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 120) {
						local269 = this.aClass1_Sub1_Sub3_4.method470();
						local273 = this.aClass1_Sub1_Sub3_4.method470();
						local277 = local273 >> 10 & 0x1F;
						local294 = local273 >> 5 & 0x1F;
						local461 = local273 & 0x1F;
						Class6.aClass6Array1[local269].anInt466 = (local277 << 19) + (local294 << 11) + (local461 << 3);
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 250) {
						this.anInt314 = this.aClass1_Sub1_Sub3_4.method468();
						this.anInt315 = this.aClass1_Sub1_Sub3_4.method468();
						while (this.aClass1_Sub1_Sub3_4.anInt777 < this.anInt427) {
							local269 = this.aClass1_Sub1_Sub3_4.method468();
							this.method221(this.aClass1_Sub1_Sub3_4, local269);
						}
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 13) {
						this.anInt333 = this.aClass1_Sub1_Sub3_4.method468();
						this.aBoolean49 = true;
						this.aBoolean60 = true;
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 199) {
						this.anInt381 = this.aClass1_Sub1_Sub3_4.method468();
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 46) {
						local269 = this.aClass1_Sub1_Sub3_4.method470();
						this.method169(local269);
						if (this.anInt264 != -1) {
							this.anInt264 = -1;
							this.aBoolean49 = true;
							this.aBoolean60 = true;
						}
						this.anInt354 = local269;
						this.aBoolean61 = true;
						this.anInt296 = -1;
						this.aBoolean53 = false;
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 168) {
						local269 = this.aClass1_Sub1_Sub3_4.method471();
						this.anInt362 = local269;
						this.aBoolean61 = true;
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 173) {
						local269 = this.aClass1_Sub1_Sub3_4.method470();
						@Pc(2911) boolean local2911 = this.aClass1_Sub1_Sub3_4.method468() == 1;
						Class6.aClass6Array1[local269].aBoolean75 = local2911;
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 18) {
						this.method133((byte) 5);
						this.anInt428 = -1;
						return false;
					}
					if (this.anInt428 == 181) {
						local269 = this.aClass1_Sub1_Sub3_4.method470();
						local273 = this.aClass1_Sub1_Sub3_4.method473();
						this.anIntArray75[local269] = local273;
						if (this.anIntArray47[local269] != local273) {
							this.anIntArray47[local269] = local273;
							this.method118(local269);
							this.aBoolean49 = true;
							if (this.anInt362 != -1) {
								this.aBoolean61 = true;
							}
						}
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 107) {
						local269 = this.aClass1_Sub1_Sub3_4.method470();
						this.method169(local269);
						if (this.anInt354 != -1) {
							this.anInt354 = -1;
							this.aBoolean61 = true;
						}
						if (this.aBoolean48) {
							this.aBoolean48 = false;
							this.aBoolean61 = true;
						}
						this.anInt264 = local269;
						this.aBoolean49 = true;
						this.aBoolean60 = true;
						this.anInt296 = -1;
						this.aBoolean53 = false;
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 96) {
						local269 = this.aClass1_Sub1_Sub3_4.method470();
						local273 = this.aClass1_Sub1_Sub3_4.method468();
						local277 = this.aClass1_Sub1_Sub3_4.method470();
						if (this.aBoolean39 && !aBoolean47 && this.anInt346 < 50) {
							this.anIntArray60[this.anInt346] = local269;
							this.anIntArray50[this.anInt346] = local273;
							this.anIntArray59[this.anInt346] = local277 + Class5.anIntArray22[local269];
							this.anInt346++;
						}
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 203) {
						this.aBoolean49 = true;
						local269 = this.aClass1_Sub1_Sub3_4.method470();
						local1877 = Class6.aClass6Array1[local269];
						local277 = this.aClass1_Sub1_Sub3_4.method468();
						for (local294 = 0; local294 < local277; local294++) {
							local1877.anIntArray86[local294] = this.aClass1_Sub1_Sub3_4.method470();
							local461 = this.aClass1_Sub1_Sub3_4.method468();
							if (local461 == 255) {
								local461 = this.aClass1_Sub1_Sub3_4.method473();
							}
							local1877.anIntArray87[local294] = local461;
						}
						for (local461 = local277; local461 < local1877.anIntArray86.length; local461++) {
							local1877.anIntArray86[local461] = 0;
							local1877.anIntArray87[local461] = 0;
						}
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 94) {
						this.anInt373 = this.aClass1_Sub1_Sub3_4.method468();
						if (this.anInt373 == this.anInt333) {
							if (this.anInt373 == 3) {
								this.anInt333 = 1;
							} else {
								this.anInt333 = 3;
							}
							this.aBoolean49 = true;
						}
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 0) {
						this.aBoolean52 = true;
						this.anInt395 = this.aClass1_Sub1_Sub3_4.method468();
						this.anInt396 = this.aClass1_Sub1_Sub3_4.method468();
						this.anInt397 = this.aClass1_Sub1_Sub3_4.method470();
						this.anInt398 = this.aClass1_Sub1_Sub3_4.method468();
						this.anInt399 = this.aClass1_Sub1_Sub3_4.method468();
						if (this.anInt399 >= 100) {
							local269 = this.anInt395 * 128 + 64;
							local273 = this.anInt396 * 128 + 64;
							local277 = this.method194(this.anInt324, this.anInt396, this.anInt395) - this.anInt397;
							local294 = local269 - this.anInt258;
							local461 = local277 - this.anInt259;
							local520 = local273 - this.anInt260;
							local578 = (int) Math.sqrt((double) (local294 * local294 + local520 * local520));
							this.anInt261 = (int) (Math.atan2((double) local461, (double) local578) * 325.949D) & 0x7FF;
							this.anInt262 = (int) (Math.atan2((double) local294, (double) local520) * -325.949D) & 0x7FF;
							if (this.anInt261 < 128) {
								this.anInt261 = 128;
							}
							if (this.anInt261 > 383) {
								this.anInt261 = 383;
							}
						}
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 146) {
						local269 = this.aClass1_Sub1_Sub3_4.method470();
						local273 = this.aClass1_Sub1_Sub3_4.method470();
						Class6.aClass6Array1[local269].anInt469 = 2;
						Class6.aClass6Array1[local269].anInt470 = local273;
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 25) {
						Class10.method257();
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 140) {
						local269 = this.aClass1_Sub1_Sub3_4.method470();
						local273 = this.aClass1_Sub1_Sub3_4.method470();
						if (this.anInt354 != -1) {
							this.anInt354 = -1;
							this.aBoolean61 = true;
						}
						if (this.aBoolean48) {
							this.aBoolean48 = false;
							this.aBoolean61 = true;
						}
						this.anInt296 = local269;
						this.anInt264 = local273;
						this.aBoolean49 = true;
						this.aBoolean60 = true;
						this.aBoolean53 = false;
						this.anInt428 = -1;
						return true;
					}
					if (this.anInt428 == 98) {
						local269 = this.aClass1_Sub1_Sub3_4.method470();
						local2109 = this.aClass1_Sub1_Sub3_4.method475();
						Class6.aClass6Array1[local269].aString19 = local2109;
						if (Class6.aClass6Array1[local269].anInt452 == this.anIntArray56[this.anInt333]) {
							this.aBoolean49 = true;
						}
						this.anInt428 = -1;
						return true;
					}
					signlink.reporterror("T1 - " + this.anInt428 + "," + this.anInt427 + " - " + this.anInt416 + "," + this.anInt417);
					this.method133((byte) 5);
				} catch (@Pc(3482) IOException local3482) {
					this.method216();
				} catch (@Pc(3487) Exception local3487) {
					local2098 = "T2 - " + this.anInt428 + "," + this.anInt416 + "," + this.anInt417 + " - " + this.anInt427 + "," + (this.anInt286 + aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0]) + "," + (this.anInt287 + aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0]) + " - ";
					for (local273 = 0; local273 < this.anInt427 && local273 < 50; local273++) {
						local2098 = local2098 + this.aClass1_Sub1_Sub3_4.aByteArray9[local273] + ",";
					}
					signlink.reporterror(local2098);
					this.method133((byte) 5);
				}
				return true;
			}
		} catch (@Pc(3568) RuntimeException local3568) {
			signlink.reporterror("56854, " + arg0 + ", " + local3568.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!mb;)V")
	private void method185(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			arg1.method478();
			@Pc(18) int local18 = arg1.method479(this.anInt312, 8);
			@Pc(24) int local24;
			if (local18 < this.anInt353) {
				for (local24 = local18; local24 < this.anInt353; local24++) {
					this.anIntArray51[this.anInt311++] = this.anIntArray64[local24];
				}
			}
			if (local18 > this.anInt353) {
				signlink.reporterror(this.aString14 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt353 = 0;
			for (local24 = 0; local24 < local18; local24++) {
				@Pc(76) int local76 = this.anIntArray64[local24];
				@Pc(81) Class1_Sub1_Sub1_Sub1_Sub1 local81 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local76];
				@Pc(87) int local87 = arg1.method479(this.anInt312, 1);
				if (local87 == 0) {
					this.anIntArray64[this.anInt353++] = local76;
					local81.anInt170 = anInt363;
				} else {
					@Pc(111) int local111 = arg1.method479(this.anInt312, 2);
					if (local111 == 0) {
						this.anIntArray64[this.anInt353++] = local76;
						local81.anInt170 = anInt363;
						this.anIntArray74[this.anInt387++] = local76;
					} else {
						@Pc(163) int local163;
						@Pc(174) int local174;
						if (local111 == 1) {
							this.anIntArray64[this.anInt353++] = local76;
							local81.anInt170 = anInt363;
							local163 = arg1.method479(this.anInt312, 3);
							local81.method43(local163, false);
							local174 = arg1.method479(this.anInt312, 1);
							if (local174 == 1) {
								this.anIntArray74[this.anInt387++] = local76;
							}
						} else if (local111 == 2) {
							this.anIntArray64[this.anInt353++] = local76;
							local81.anInt170 = anInt363;
							local163 = arg1.method479(this.anInt312, 3);
							local81.method43(local163, true);
							local174 = arg1.method479(this.anInt312, 3);
							local81.method43(local174, true);
							@Pc(235) int local235 = arg1.method479(this.anInt312, 1);
							if (local235 == 1) {
								this.anIntArray74[this.anInt387++] = local76;
							}
						} else if (local111 == 3) {
							this.anIntArray51[this.anInt311++] = local76;
						}
					}
				}
			}
		} catch (@Pc(272) RuntimeException local272) {
			signlink.reporterror("86439, " + arg0 + ", " + -48698 + ", " + arg1 + ", " + local272.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method186() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt386; local3++) {
				if (local3 == -1) {
					local11 = this.anInt385;
				} else {
					local11 = this.anIntArray73[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub2 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local11];
				if (local23 != null) {
					this.method171(local23, 1);
				}
			}
			anInt302++;
			if (anInt302 > 1406) {
				anInt302 = 0;
				this.aClass1_Sub1_Sub3_2.method457(124);
				this.aClass1_Sub1_Sub3_2.method458(0);
				local11 = this.aClass1_Sub1_Sub3_2.anInt777;
				this.aClass1_Sub1_Sub3_2.method458(162);
				this.aClass1_Sub1_Sub3_2.method458(22);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_2.method458(84);
				}
				this.aClass1_Sub1_Sub3_2.method459(31824);
				this.aClass1_Sub1_Sub3_2.method459(13490);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_2.method458(123);
				}
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_2.method458(134);
				}
				this.aClass1_Sub1_Sub3_2.method458(100);
				this.aClass1_Sub1_Sub3_2.method458(94);
				this.aClass1_Sub1_Sub3_2.method459(35521);
				this.aClass1_Sub1_Sub3_2.method467(this.aClass1_Sub1_Sub3_2.anInt777 - local11, 316);
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("67589, " + 3 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method187(@OriginalArg(0) int arg0) {
		try {
			if (this.aClass36_18 == null) {
				this.method206();
				super.aClass36_2 = null;
				this.aClass36_6 = null;
				this.aClass36_7 = null;
				this.aClass36_8 = null;
				this.aClass36_9 = null;
				this.aClass36_10 = null;
				this.aClass36_11 = null;
				this.aClass36_12 = null;
				this.aClass36_13 = null;
				this.aClass36_14 = null;
				this.aClass36_18 = new Class36((byte) 9, 96, 479, this.method89(aByte21));
				this.aClass36_16 = new Class36((byte) 9, 160, 168, this.method89(aByte21));
				Class1_Sub1_Sub2.method436(296);
				this.aClass1_Sub1_Sub2_Sub3_9.method423(0, 217, 0);
				if (arg0 != -19361) {
					this.anInt361 = 54;
				}
				this.aClass36_15 = new Class36((byte) 9, 261, 190, this.method89(aByte21));
				this.aClass36_17 = new Class36((byte) 9, 334, 512, this.method89(aByte21));
				Class1_Sub1_Sub2.method436(296);
				this.aClass36_3 = new Class36((byte) 9, 61, 501, this.method89(aByte21));
				this.aClass36_4 = new Class36((byte) 9, 40, 288, this.method89(aByte21));
				this.aClass36_5 = new Class36((byte) 9, 66, 269, this.method89(aByte21));
				this.aBoolean57 = true;
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("46736, " + arg0 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIZ)Z")
	private boolean method188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			this.aBoolean72 &= true;
			@Pc(13) Class6 local13 = Class6.aClass6Array1[arg0];
			for (@Pc(15) int local15 = 0; local15 < local13.anIntArray90.length && local13.anIntArray90[local15] != -1; local15++) {
				@Pc(30) Class6 local30 = Class6.aClass6Array1[local13.anIntArray90[local15]];
				if (local30.anInt453 == 1) {
					local3 |= this.method188(local30.anInt451, arg1);
				}
				if (local30.anInt453 == 6 && (local30.anInt473 != -1 || local30.anInt474 != -1)) {
					@Pc(60) boolean local60 = this.method113(local30);
					@Pc(65) int local65;
					if (local60) {
						local65 = local30.anInt474;
					} else {
						local65 = local30.anInt473;
					}
					if (local65 != -1) {
						@Pc(77) Class25 local77 = Class25.aClass25Array1[local65];
						local30.anInt450 += arg1;
						while (local30.anInt450 > local77.method485(local30.anInt449)) {
							local30.anInt450 -= local77.method485(local30.anInt449) + 1;
							local30.anInt449++;
							if (local30.anInt449 >= local77.anInt785) {
								local30.anInt449 -= local77.anInt786;
								if (local30.anInt449 < 0 || local30.anInt449 >= local77.anInt785) {
									local30.anInt449 = 0;
								}
							}
							local3 = true;
						}
					}
				}
			}
			return local3;
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("65536, " + arg0 + ", " + arg1 + ", " + true + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method189() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray77[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray77[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray78[local54] = (this.anIntArray77[local54 - 1] + this.anIntArray77[local54 + 1] + this.anIntArray77[local54 - 128] + this.anIntArray77[local54 + 128]) / 4;
				}
			}
			this.anInt410 += 128;
			if (this.anInt389 != -31190) {
				this.aClass1_Sub1_Sub3_2.method458(246);
			}
			if (this.anInt410 > this.anIntArray62.length) {
				this.anInt410 -= this.anIntArray62.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method162(this.aClass1_Sub1_Sub2_Sub3Array3[local48]);
			}
			@Pc(174) int local174;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local174 = local54 + (local48 << 7);
					@Pc(197) int local197 = this.anIntArray78[local174 + 128] - this.anIntArray62[local174 + this.anInt410 & this.anIntArray62.length - 1] / 5;
					if (local197 < 0) {
						local197 = 0;
					}
					this.anIntArray77[local174] = local197;
				}
			}
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray26[local54] = this.anIntArray26[local54 + 1];
			}
			this.anIntArray26[255] = (int) (Math.sin((double) anInt363 / 14.0D) * 16.0D + Math.sin((double) anInt363 / 15.0D) * 14.0D + Math.sin((double) anInt363 / 16.0D) * 12.0D);
			if (this.anInt271 > 0) {
				this.anInt271 -= 4;
			}
			if (this.anInt272 > 0) {
				this.anInt272 -= 4;
			}
			if (this.anInt271 == 0 && this.anInt272 == 0) {
				local174 = (int) (Math.random() * 2000.0D);
				if (local174 == 0) {
					this.anInt271 = 1024;
				}
				if (local174 == 1) {
					this.anInt272 = 1024;
					return;
				}
			}
		} catch (@Pc(308) RuntimeException local308) {
			signlink.reporterror("48169, " + -31190 + ", " + local308.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!z;I)V")
	private void method190(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg1) {
		try {
			this.method191(arg1.anInt128, arg1.anInt129, arg0);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("68901, " + arg0 + ", " + arg1 + ", " + 933 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIZ)V")
	private void method191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg0 >= 128 && arg1 >= 128 && arg0 <= 13056 && arg1 <= 13056) {
				@Pc(34) int local34 = this.method194(this.anInt324, arg1, arg0) - arg2;
				@Pc(39) int local39 = arg0 - this.anInt258;
				@Pc(44) int local44 = local34 - this.anInt259;
				@Pc(49) int local49 = arg1 - this.anInt260;
				@Pc(54) int local54 = Class1_Sub1_Sub1_Sub5.anIntArray148[this.anInt261];
				@Pc(59) int local59 = Class1_Sub1_Sub1_Sub5.anIntArray149[this.anInt261];
				@Pc(64) int local64 = Class1_Sub1_Sub1_Sub5.anIntArray148[this.anInt262];
				@Pc(69) int local69 = Class1_Sub1_Sub1_Sub5.anIntArray149[this.anInt262];
				@Pc(79) int local79 = local49 * local64 + local39 * local69 >> 16;
				@Pc(89) int local89 = local49 * local69 - local39 * local64 >> 16;
				@Pc(91) int local91 = local79;
				@Pc(101) int local101 = local44 * local59 - local89 * local54 >> 16;
				@Pc(111) int local111 = local44 * local54 + local89 * local59 >> 16;
				if (local111 >= 50) {
					this.anInt401 = Class1_Sub1_Sub2_Sub1.anInt653 + (local91 << 9) / local111;
					this.anInt402 = Class1_Sub1_Sub2_Sub1.anInt654 + (local101 << 9) / local111;
				} else {
					this.anInt401 = -1;
					this.anInt402 = -1;
				}
			} else {
				this.anInt401 = -1;
				this.anInt402 = -1;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("53356, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt275 = Integer.parseInt(this.getParameter("nodeid"));
		anInt276 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method129();
		} else {
			method193();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean46 = false;
		} else {
			aBoolean46 = true;
		}
		this.method80();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method192(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt339 >= 100) {
					this.method123(0, "", "Your friends list is full. Max of 100 hit");
				} else {
					@Pc(23) String local23 = Class46.method649(Class46.method646(arg0));
					for (@Pc(25) int local25 = 0; local25 < this.anInt339; local25++) {
						if (this.aLongArray3[local25] == arg0) {
							this.method123(0, "", local23 + " is already on your friend list");
							return;
						}
					}
					for (@Pc(62) int local62 = 0; local62 < this.anInt273; local62++) {
						if (this.aLongArray4[local62] == arg0) {
							this.method123(0, "", "Please remove " + local23 + " from your ignore list first");
							return;
						}
					}
					if (!local23.equals(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4)) {
						this.aStringArray5[this.anInt339] = local23;
						this.aLongArray3[this.anInt339] = arg0;
						this.anIntArray79[this.anInt339] = 0;
						this.anInt339++;
						this.aBoolean49 = true;
						this.aClass1_Sub1_Sub3_2.method457(8);
						this.aClass1_Sub1_Sub3_2.method464(arg0);
					}
				}
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("24102, " + arg0 + ", " + 0 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
	private int method194(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = arg2 >> 7;
			@Pc(7) int local7 = arg1 >> 7;
			@Pc(9) int local9 = arg0;
			this.anInt427 += 0;
			if (arg0 < 3 && (this.aByteArrayArrayArray7[1][local3][local7] & 0x2) == 2) {
				local9 = arg0 + 1;
			}
			@Pc(35) int local35 = arg2 & 0x7F;
			@Pc(39) int local39 = arg1 & 0x7F;
			@Pc(67) int local67 = this.anIntArrayArrayArray3[local9][local3][local7] * (128 - local35) + this.anIntArrayArrayArray3[local9][local3 + 1][local7] * local35 >> 7;
			@Pc(99) int local99 = this.anIntArrayArrayArray3[local9][local3][local7 + 1] * (128 - local35) + this.anIntArrayArrayArray3[local9][local3 + 1][local7 + 1] * local35 >> 7;
			return local67 * (128 - local39) + local99 * local39 >> 7;
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("57199, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg0 != 40443) {
				this.method84();
			}
			@Pc(13) int local13 = this.aClass37_1.method576(arg4, arg1, arg2);
			@Pc(23) int local23;
			@Pc(29) int local29;
			@Pc(33) int local33;
			@Pc(35) int local35;
			@Pc(57) int local57;
			@Pc(63) int local63;
			if (local13 != 0) {
				local23 = this.aClass37_1.method580(arg4, arg1, arg2, local13);
				local29 = local23 >> 6 & 0x3;
				local33 = local23 & 0x1F;
				local35 = arg3;
				if (local13 > 0) {
					local35 = arg5;
				}
				@Pc(43) int[] local43 = this.aClass1_Sub1_Sub2_Sub2_6.anIntArray198;
				local57 = arg1 * 4 + (103 - arg2) * 512 * 4 + 24624;
				local63 = local13 >> 14 & 0x7FFF;
				@Pc(66) Class9 local66 = Class9.method250(local63);
				if (local66.anInt522 == -1) {
					if (local33 == 0 || local33 == 2) {
						if (local29 == 0) {
							local43[local57] = local35;
							local43[local57 + 512] = local35;
							local43[local57 + 1024] = local35;
							local43[local57 + 1536] = local35;
						} else if (local29 == 1) {
							local43[local57] = local35;
							local43[local57 + 1] = local35;
							local43[local57 + 2] = local35;
							local43[local57 + 3] = local35;
						} else if (local29 == 2) {
							local43[local57 + 3] = local35;
							local43[local57 + 3 + 512] = local35;
							local43[local57 + 3 + 1024] = local35;
							local43[local57 + 3 + 1536] = local35;
						} else if (local29 == 3) {
							local43[local57 + 1536] = local35;
							local43[local57 + 1536 + 1] = local35;
							local43[local57 + 1536 + 2] = local35;
							local43[local57 + 1536 + 3] = local35;
						}
					}
					if (local33 == 3) {
						if (local29 == 0) {
							local43[local57] = local35;
						} else if (local29 == 1) {
							local43[local57 + 3] = local35;
						} else if (local29 == 2) {
							local43[local57 + 3 + 1536] = local35;
						} else if (local29 == 3) {
							local43[local57 + 1536] = local35;
						}
					}
					if (local33 == 2) {
						if (local29 == 3) {
							local43[local57] = local35;
							local43[local57 + 512] = local35;
							local43[local57 + 1024] = local35;
							local43[local57 + 1536] = local35;
						} else if (local29 == 0) {
							local43[local57] = local35;
							local43[local57 + 1] = local35;
							local43[local57 + 2] = local35;
							local43[local57 + 3] = local35;
						} else if (local29 == 1) {
							local43[local57 + 3] = local35;
							local43[local57 + 3 + 512] = local35;
							local43[local57 + 3 + 1024] = local35;
							local43[local57 + 3 + 1536] = local35;
						} else if (local29 == 2) {
							local43[local57 + 1536] = local35;
							local43[local57 + 1536 + 1] = local35;
							local43[local57 + 1536 + 2] = local35;
							local43[local57 + 1536 + 3] = local35;
						}
					}
				} else {
					@Pc(76) Class1_Sub1_Sub2_Sub3 local76 = this.aClass1_Sub1_Sub2_Sub3Array2[local66.anInt522];
					if (local76 != null) {
						@Pc(88) int local88 = (local66.anInt517 * 4 - local76.anInt724) / 2;
						@Pc(98) int local98 = (local66.anInt518 * 4 - local76.anInt725) / 2;
						local76.method423((104 - arg2 - local66.anInt518) * 4 + local98 + 48, 217, arg1 * 4 + local88 + 48);
					}
				}
			}
			local13 = this.aClass37_1.method578(arg4, arg1, arg2);
			if (local13 != 0) {
				local23 = this.aClass37_1.method580(arg4, arg1, arg2, local13);
				local29 = local23 >> 6 & 0x3;
				local33 = local23 & 0x1F;
				local35 = local13 >> 14 & 0x7FFF;
				@Pc(452) Class9 local452 = Class9.method250(local35);
				@Pc(484) int local484;
				if (local452.anInt522 != -1) {
					@Pc(462) Class1_Sub1_Sub2_Sub3 local462 = this.aClass1_Sub1_Sub2_Sub3Array2[local452.anInt522];
					if (local462 != null) {
						local63 = (local452.anInt517 * 4 - local462.anInt724) / 2;
						local484 = (local452.anInt518 * 4 - local462.anInt725) / 2;
						local462.method423((104 - arg2 - local452.anInt518) * 4 + local484 + 48, 217, arg1 * 4 + local63 + 48);
					}
				} else if (local33 == 9) {
					local57 = 15658734;
					if (local13 > 0) {
						local57 = 15597568;
					}
					@Pc(521) int[] local521 = this.aClass1_Sub1_Sub2_Sub2_6.anIntArray198;
					local484 = arg1 * 4 + (103 - arg2) * 512 * 4 + 24624;
					if (local29 == 0 || local29 == 2) {
						local521[local484 + 1536] = local57;
						local521[local484 + 1024 + 1] = local57;
						local521[local484 + 512 + 2] = local57;
						local521[local484 + 3] = local57;
					} else {
						local521[local484] = local57;
						local521[local484 + 512 + 1] = local57;
						local521[local484 + 1024 + 2] = local57;
						local521[local484 + 1536 + 3] = local57;
					}
				}
			}
			local13 = this.aClass37_1.method579(arg4, arg1, arg2);
			if (local13 != 0) {
				local23 = local13 >> 14 & 0x7FFF;
				@Pc(616) Class9 local616 = Class9.method250(local23);
				if (local616.anInt522 != -1) {
					@Pc(626) Class1_Sub1_Sub2_Sub3 local626 = this.aClass1_Sub1_Sub2_Sub3Array2[local616.anInt522];
					if (local626 != null) {
						local35 = (local616.anInt517 * 4 - local626.anInt724) / 2;
						@Pc(648) int local648 = (local616.anInt518 * 4 - local626.anInt725) / 2;
						local626.method423((104 - arg2 - local616.anInt518) * 4 + local648 + 48, 217, arg1 * 4 + local35 + 48);
						return;
					}
				}
			}
		} catch (@Pc(672) RuntimeException local672) {
			signlink.reporterror("76275, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local672.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!jb;II)V")
	private void method196(@OriginalArg(1) Class1_Sub1_Sub2_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = this.anInt443 + this.anInt370 & 0x7FF;
			@Pc(15) int local15 = arg1 * arg1 + arg2 * arg2;
			if (local15 <= 6400) {
				@Pc(23) int local23 = Class1_Sub1_Sub1_Sub5.anIntArray148[local7];
				@Pc(27) int local27 = Class1_Sub1_Sub1_Sub5.anIntArray149[local7];
				@Pc(41) int local41 = local23 * 256 / (this.anInt365 + 256);
				@Pc(50) int local50 = local27 * 256 / (this.anInt365 + 256);
				@Pc(60) int local60 = arg2 * local41 + arg1 * local50 >> 16;
				@Pc(70) int local70 = arg2 * local50 - arg1 * local41 >> 16;
				if (local15 > 2500) {
					arg0.method402(local60 + 94 - arg0.anInt689 / 2, 83 - local70 - arg0.anInt690 / 2, this.aClass1_Sub1_Sub2_Sub3_9);
				} else {
					arg0.method395(83 - local70 - arg0.anInt690 / 2, 217, local60 + 94 - arg0.anInt689 / 2);
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("62725, " + 404 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(JI)V")
	private void method197(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt273; local8++) {
					if (this.aLongArray4[local8] == arg0) {
						this.anInt273--;
						this.aBoolean49 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt273; local28++) {
							this.aLongArray4[local28] = this.aLongArray4[local28 + 1];
						}
						this.aClass1_Sub1_Sub3_2.method457(181);
						this.aClass1_Sub1_Sub3_2.method464(arg0);
						break;
					}
				}
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("1916, " + arg0 + ", " + 1 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!mb;Lclient!bb;BI)V")
	private void method198(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) Class1_Sub1_Sub1_Sub1_Sub2 arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(13) int local13;
			if ((arg3 & 0x1) == 1) {
				local13 = arg1.method468();
				@Pc(16) byte[] local16 = new byte[local13];
				@Pc(22) Class1_Sub1_Sub3 local22 = new Class1_Sub1_Sub3(local16, true);
				arg1.method477(local16, local13);
				this.aClass1_Sub1_Sub3Array1[arg0] = local22;
				arg2.method45(local22);
			}
			@Pc(60) int local60;
			if ((arg3 & 0x2) == 2) {
				local13 = arg1.method470();
				if (local13 == 65535) {
					local13 = -1;
				}
				if (local13 == arg2.anInt153) {
					arg2.anInt157 = 0;
				}
				local60 = arg1.method468();
				if (local13 == -1 || arg2.anInt153 == -1 || Class25.aClass25Array1[local13].anInt787 > Class25.aClass25Array1[arg2.anInt153].anInt787 || Class25.aClass25Array1[arg2.anInt153].anInt787 == 0) {
					arg2.anInt153 = local13;
					arg2.anInt154 = 0;
					arg2.anInt155 = 0;
					arg2.anInt156 = local60;
					arg2.anInt157 = 0;
				}
			}
			if ((arg3 & 0x4) == 4) {
				arg2.anInt147 = arg1.method470();
				if (arg2.anInt147 == 65535) {
					arg2.anInt147 = -1;
				}
			}
			if ((arg3 & 0x8) == 8) {
				arg2.aString3 = arg1.method475();
				arg2.anInt140 = 0;
				arg2.anInt141 = 0;
				arg2.anInt139 = 150;
				this.method123(2, arg2.aString4, arg2.aString3);
			}
			if ((arg3 & 0x10) == 16) {
				arg2.anInt142 = arg1.method468();
				arg2.anInt143 = arg1.method468();
				arg2.anInt144 = anInt363 + 400;
				arg2.anInt145 = arg1.method468();
				arg2.anInt146 = arg1.method468();
			}
			if ((arg3 & 0x20) == 32) {
				arg2.anInt148 = arg1.method470();
				arg2.anInt149 = arg1.method470();
			}
			if ((arg3 & 0x40) == 64) {
				local13 = arg1.method470();
				local60 = arg1.method468();
				@Pc(193) int local193 = arg1.method468();
				@Pc(196) int local196 = arg1.anInt777;
				if (arg2.aString4 != null) {
					@Pc(203) long local203 = Class46.method645(arg2.aString4);
					@Pc(205) boolean local205 = false;
					if (local60 <= 1) {
						for (@Pc(210) int local210 = 0; local210 < this.anInt273; local210++) {
							if (this.aLongArray4[local210] == local203) {
								local205 = true;
								break;
							}
						}
					}
					if (!local205 && this.anInt383 == 0) {
						try {
							@Pc(238) String local238 = Class2.method36(local193, 113, arg1);
							@Pc(242) String local242 = Class32.method513(local238);
							arg2.aString3 = local242;
							arg2.anInt140 = local13 >> 8;
							arg2.anInt141 = local13 & 0xFF;
							arg2.anInt139 = 150;
							if (local60 > 1) {
								this.method123(1, arg2.aString4, local242);
							} else {
								this.method123(2, arg2.aString4, local242);
							}
						} catch (@Pc(279) Exception local279) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg1.anInt777 = local196 + local193;
			}
			if ((arg3 & 0x100) == 256) {
				arg2.anInt158 = arg1.method470();
				local13 = arg1.method473();
				arg2.anInt162 = local13 >> 16;
				arg2.anInt161 = anInt363 + (local13 & 0xFFFF);
				arg2.anInt159 = 0;
				arg2.anInt160 = 0;
				if (arg2.anInt161 > anInt363) {
					arg2.anInt159 = -1;
				}
				if (arg2.anInt158 == 65535) {
					arg2.anInt158 = -1;
				}
			}
			if ((arg3 & 0x200) == 512) {
				arg2.anInt163 = arg1.method468();
				arg2.anInt165 = arg1.method468();
				arg2.anInt164 = arg1.method468();
				arg2.anInt166 = arg1.method468();
				arg2.anInt167 = arg1.method470() + anInt363;
				arg2.anInt168 = arg1.method470() + anInt363;
				arg2.anInt169 = arg1.method468();
				arg2.anInt173 = 0;
				arg2.anIntArray7[0] = arg2.anInt164;
				arg2.anIntArray8[0] = arg2.anInt166;
			}
		} catch (@Pc(385) RuntimeException local385) {
			signlink.reporterror("28749, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 1 + ", " + arg3 + ", " + local385.toString());
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
				return new URL("http://127.0.0.1:" + (anInt276 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method199() {
		try {
			this.anInt427 += 0;
			this.aClass36_18.method546();
			Class1_Sub1_Sub2_Sub1.anIntArray175 = this.anIntArray65;
			this.aClass1_Sub1_Sub2_Sub3_10.method423(0, 217, 0);
			if (this.aBoolean34) {
				this.aClass1_Sub1_Sub2_Sub4_3.method441(this.aByte28, this.aString17, 239, 40, 0);
				this.aClass1_Sub1_Sub2_Sub4_3.method441(this.aByte28, this.aString16 + "*", 239, 60, 128);
			} else if (this.aBoolean48) {
				this.aClass1_Sub1_Sub2_Sub4_3.method441(this.aByte28, "Enter amount:", 239, 40, 0);
				this.aClass1_Sub1_Sub2_Sub4_3.method441(this.aByte28, this.aString6 + "*", 239, 60, 128);
			} else if (this.aString12 != null) {
				this.aClass1_Sub1_Sub2_Sub4_3.method441(this.aByte28, this.aString12, 239, 40, 0);
				this.aClass1_Sub1_Sub2_Sub4_3.method441(this.aByte28, "Click to continue", 239, 60, 128);
			} else if (this.anInt354 != -1) {
				this.method149(Class6.aClass6Array1[this.anInt354], 0, 0, 0);
			} else if (this.anInt362 == -1) {
				@Pc(142) Class1_Sub1_Sub2_Sub4 local142 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(144) int local144 = 0;
				Class1_Sub1_Sub2.method435(77, 0, 0, 463);
				for (@Pc(152) int local152 = 0; local152 < 100; local152++) {
					if (this.aStringArray4[local152] != null) {
						@Pc(164) int local164 = this.anIntArray49[local152];
						@Pc(173) int local173 = this.anInt423 + 70 - local144 * 14;
						if (local164 == 0) {
							if (local173 > 0 && local173 < 110) {
								local142.method444(0, 4, local173, this.aStringArray4[local152]);
							}
							local144++;
						}
						if (local164 == 1) {
							if (local173 > 0 && local173 < 110) {
								local142.method444(16777215, 4, local173, this.aStringArray3[local152] + ":");
								local142.method444(255, local142.method443((byte) 2, this.aStringArray3[local152]) + 12, local173, this.aStringArray4[local152]);
							}
							local144++;
						}
						if (local164 == 2 && (this.anInt356 == 0 || this.anInt356 == 1 && this.method154(this.aStringArray3[local152]))) {
							if (local173 > 0 && local173 < 110) {
								local142.method444(0, 4, local173, this.aStringArray3[local152] + ":");
								local142.method444(255, local142.method443((byte) 2, this.aStringArray3[local152]) + 12, local173, this.aStringArray4[local152]);
							}
							local144++;
						}
						if ((local164 == 3 || local164 == 7) && this.anInt426 == 0 && (local164 == 7 || this.anInt390 == 0 || this.anInt390 == 1 && this.method154(this.aStringArray3[local152]))) {
							if (local173 > 0 && local173 < 110) {
								local142.method444(0, 4, local173, "From " + this.aStringArray3[local152] + ":");
								local142.method444(8388608, local142.method443((byte) 2, "From " + this.aStringArray3[local152]) + 12, local173, this.aStringArray4[local152]);
							}
							local144++;
						}
						if (local164 == 4 && (this.anInt293 == 0 || this.anInt293 == 1 && this.method154(this.aStringArray3[local152]))) {
							if (local173 > 0 && local173 < 110) {
								local142.method444(8388736, 4, local173, this.aStringArray3[local152] + " " + this.aStringArray4[local152]);
							}
							local144++;
						}
						if (local164 == 5 && this.anInt426 == 0 && this.anInt390 < 2) {
							if (local173 > 0 && local173 < 110) {
								local142.method444(8388608, 4, local173, this.aStringArray4[local152]);
							}
							local144++;
						}
						if (local164 == 6 && this.anInt426 == 0 && this.anInt390 < 2) {
							if (local173 > 0 && local173 < 110) {
								local142.method444(0, 4, local173, "To " + this.aStringArray3[local152] + ":");
								local142.method444(8388608, local142.method443((byte) 2, "To " + this.aStringArray3[local152]) + 12, local173, this.aStringArray4[local152]);
							}
							local144++;
						}
						if (local164 == 8 && (this.anInt293 == 0 || this.anInt293 == 1 && this.method154(this.aStringArray3[local152]))) {
							if (local173 > 0 && local173 < 110) {
								local142.method444(13350793, 4, local173, this.aStringArray3[local152] + " " + this.aStringArray4[local152]);
							}
							local144++;
						}
					}
				}
				Class1_Sub1_Sub2.method434();
				this.anInt408 = local144 * 14 + 7;
				if (this.anInt408 < 78) {
					this.anInt408 = 78;
				}
				this.method135(this.anInt408 - this.anInt423 - 77, 0, this.anInt408, 463, 77);
				local142.method444(0, 4, 90, Class46.method649(this.aString14) + ":");
				local142.method444(255, local142.method443((byte) 2, this.aString14 + ": ") + 6, 90, this.aString5 + "*");
				Class1_Sub1_Sub2.method439(0, 77, 479, this.anInt309, 0);
			} else {
				this.method149(Class6.aClass6Array1[this.anInt362], 0, 0, 0);
			}
			if (this.aBoolean67 && this.anInt297 == 2) {
				this.method100();
			}
			this.aClass36_18.method547(22, super.aGraphics2, 375);
			this.aClass36_17.method546();
			Class1_Sub1_Sub2_Sub1.anIntArray175 = this.anIntArray67;
		} catch (@Pc(659) RuntimeException local659) {
			signlink.reporterror("50854, " + 0 + ", " + local659.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method200() {
		try {
			this.aBoolean72 &= true;
			if (this.anInt406 == 2) {
				for (@Pc(16) Class1_Sub2 local16 = (Class1_Sub2) this.aClass31_1.method498(); local16 != null; local16 = (Class1_Sub2) this.aClass31_1.method500()) {
					if (local16.anInt839 > 0) {
						local16.anInt839--;
					}
					if (local16.anInt839 != 0) {
						if (local16.anInt838 > 0) {
							local16.anInt838--;
						}
						if (local16.anInt838 == 0 && (local16.anInt835 < 0 || Class4.method67(local16.anInt835, local16.anInt837, this.aByte24))) {
							this.method114(local16.anInt829, local16.anInt831, local16.anInt830, local16.anInt836, local16.anInt835, local16.anInt828, local16.anInt837, (byte) 9);
							local16.anInt838 = -1;
							if (local16.anInt835 == local16.anInt832 && local16.anInt832 == -1) {
								local16.method635();
							} else if (local16.anInt835 == local16.anInt832 && local16.anInt836 == local16.anInt833 && local16.anInt837 == local16.anInt834) {
								local16.method635();
							}
						}
					} else if (local16.anInt832 < 0 || Class4.method67(local16.anInt832, local16.anInt834, this.aByte24)) {
						this.method114(local16.anInt829, local16.anInt831, local16.anInt830, local16.anInt833, local16.anInt832, local16.anInt828, local16.anInt834, (byte) 9);
						local16.method635();
					}
				}
				anInt313++;
				if (anInt313 > 85) {
					anInt313 = 0;
					this.aClass1_Sub1_Sub3_2.method457(120);
					return;
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("55887, " + true + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method201(@OriginalArg(0) int arg0) {
		try {
			@Pc(8) int local8;
			if (this.anInt271 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt271 > 768) {
						this.anIntArray52[local8] = this.method208(this.anIntArray53[local8], 1024 - this.anInt271, this.anIntArray54[local8]);
					} else if (this.anInt271 > 256) {
						this.anIntArray52[local8] = this.anIntArray54[local8];
					} else {
						this.anIntArray52[local8] = this.method208(this.anIntArray54[local8], 256 - this.anInt271, this.anIntArray53[local8]);
					}
				}
			} else if (this.anInt272 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt272 > 768) {
						this.anIntArray52[local8] = this.method208(this.anIntArray53[local8], 1024 - this.anInt272, this.anIntArray55[local8]);
					} else if (this.anInt272 > 256) {
						this.anIntArray52[local8] = this.anIntArray55[local8];
					} else {
						this.anIntArray52[local8] = this.method208(this.anIntArray55[local8], 256 - this.anInt272, this.anIntArray53[local8]);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray52[local8] = this.anIntArray53[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass36_9.anIntArray224[local8] = this.aClass1_Sub1_Sub2_Sub2_4.anIntArray198[local8];
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
				local198 = this.anIntArray26[local185] * (256 - local185) / 256;
				local202 = local198 + 22;
				if (local202 < 0) {
					local202 = 0;
				}
				local181 += local202;
				for (local212 = local202; local212 < 128; local212++) {
					local220 = this.anIntArray77[local181++];
					if (local220 == 0) {
						local183++;
					} else {
						local224 = local220;
						local228 = 256 - local220;
						local220 = this.anIntArray52[local220];
						local239 = this.aClass36_9.anIntArray224[local183];
						this.aClass36_9.anIntArray224[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			this.aClass36_9.method547(0, super.aGraphics2, 0);
			if (arg0 < 0) {
				for (local198 = 0; local198 < 33920; local198++) {
					this.aClass36_10.anIntArray224[local198] = this.aClass1_Sub1_Sub2_Sub2_5.anIntArray198[local198];
				}
				local181 = 0;
				local183 = 1176;
				for (local202 = 1; local202 < 255; local202++) {
					local212 = this.anIntArray26[local202] * (256 - local202) / 256;
					local220 = 103 - local212;
					local183 += local212;
					for (local224 = 0; local224 < local220; local224++) {
						local228 = this.anIntArray77[local181++];
						if (local228 == 0) {
							local183++;
						} else {
							local239 = local228;
							@Pc(365) int local365 = 256 - local228;
							local228 = this.anIntArray52[local228];
							@Pc(376) int local376 = this.aClass36_10.anIntArray224[local183];
							this.aClass36_10.anIntArray224[local183++] = ((local228 & 0xFF00FF) * local239 + (local376 & 0xFF00FF) * local365 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local376 & 0xFF00) * local365 & 0xFF0000) >> 8;
						}
					}
					local181 += 128 - local220;
					local183 += 128 - local220 - local212;
				}
				this.aClass36_10.method547(661, super.aGraphics2, 0);
			}
		} catch (@Pc(448) RuntimeException local448) {
			signlink.reporterror("11904, " + arg0 + ", " + local448.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method202(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			if (this.aClass36_6 == null) {
				super.aClass36_2 = null;
				this.aClass36_18 = null;
				this.aClass36_16 = null;
				this.aClass36_15 = null;
				this.aClass36_17 = null;
				this.aClass36_3 = null;
				this.aClass36_4 = null;
				this.aClass36_5 = null;
				this.aClass36_9 = new Class36((byte) 9, 265, 128, this.method89(aByte21));
				Class1_Sub1_Sub2.method436(296);
				this.aClass36_10 = new Class36((byte) 9, 265, 128, this.method89(aByte21));
				Class1_Sub1_Sub2.method436(296);
				this.aClass36_6 = new Class36((byte) 9, 186, 533, this.method89(aByte21));
				Class1_Sub1_Sub2.method436(296);
				this.aClass36_7 = new Class36((byte) 9, 146, 360, this.method89(aByte21));
				Class1_Sub1_Sub2.method436(296);
				this.aClass36_8 = new Class36((byte) 9, 200, 360, this.method89(aByte21));
				Class1_Sub1_Sub2.method436(296);
				this.aClass36_11 = new Class36((byte) 9, 267, 214, this.method89(aByte21));
				Class1_Sub1_Sub2.method436(296);
				this.aClass36_12 = new Class36((byte) 9, 267, 215, this.method89(aByte21));
				Class1_Sub1_Sub2.method436(296);
				this.aClass36_13 = new Class36((byte) 9, 79, 86, this.method89(aByte21));
				Class1_Sub1_Sub2.method436(296);
				this.aClass36_14 = new Class36((byte) 9, 79, 87, this.method89(aByte21));
				Class1_Sub1_Sub2.method436(296);
				if (this.aClass45_1 != null) {
					this.method112();
					this.method131(aByte18);
				}
				this.aBoolean57 = true;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("34270, " + arg0 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;B)Z")
	private boolean method203(@OriginalArg(0) Class6 arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(15) int local15 = arg0.anInt455;
			if (local15 == 201) {
				this.aBoolean61 = true;
				this.aBoolean48 = false;
				this.aBoolean34 = true;
				this.aString16 = "";
				this.anInt359 = 1;
				this.aString17 = "Enter name of friend to add to list";
			}
			if (local15 == 202) {
				this.aBoolean61 = true;
				this.aBoolean48 = false;
				this.aBoolean34 = true;
				this.aString16 = "";
				this.anInt359 = 2;
				this.aString17 = "Enter name of friend to delete from list";
			}
			if (local15 == 205) {
				this.anInt431 = 250;
				return true;
			}
			if (local15 == 501) {
				this.aBoolean61 = true;
				this.aBoolean48 = false;
				this.aBoolean34 = true;
				this.aString16 = "";
				this.anInt359 = 4;
				this.aString17 = "Enter name of player to add to list";
			}
			if (local15 == 502) {
				this.aBoolean61 = true;
				this.aBoolean48 = false;
				this.aBoolean34 = true;
				this.aString16 = "";
				this.anInt359 = 5;
				this.aString17 = "Enter name of player to delete from list";
			}
			@Pc(119) int local119;
			@Pc(123) int local123;
			@Pc(128) int local128;
			if (local15 >= 300 && local15 <= 313) {
				local119 = (local15 - 300) / 2;
				local123 = local15 & 0x1;
				local128 = this.anIntArray61[local119];
				if (local128 != -1) {
					while (true) {
						if (local123 == 0) {
							local128--;
							if (local128 < 0) {
								local128 = Class21.anInt731 - 1;
							}
						}
						if (local123 == 1) {
							local128++;
							if (local128 >= Class21.anInt731) {
								local128 = 0;
							}
						}
						if (!Class21.aClass21Array1[local128].aBoolean150 && Class21.aClass21Array1[local128].anInt732 == local119 + (this.aBoolean70 ? 0 : 7)) {
							this.anIntArray61[local119] = local128;
							this.aBoolean69 = true;
							break;
						}
					}
				}
			}
			if (local15 >= 314 && local15 <= 323) {
				local119 = (local15 - 314) / 2;
				local123 = local15 & 0x1;
				local128 = this.anIntArray42[local119];
				if (local123 == 0) {
					local128--;
					if (local128 < 0) {
						local128 = anIntArrayArray3[local119].length - 1;
					}
				}
				if (local123 == 1) {
					local128++;
					if (local128 >= anIntArrayArray3[local119].length) {
						local128 = 0;
					}
				}
				this.anIntArray42[local119] = local128;
				this.aBoolean69 = true;
			}
			if (local15 == 324 && !this.aBoolean70) {
				this.aBoolean70 = true;
				this.method151();
			}
			if (local15 == 325 && this.aBoolean70) {
				this.aBoolean70 = false;
				this.method151();
			}
			if (local15 == 326) {
				this.aClass1_Sub1_Sub3_2.method457(188);
				this.aClass1_Sub1_Sub3_2.method458(this.aBoolean70 ? 0 : 1);
				for (local119 = 0; local119 < 7; local119++) {
					this.aClass1_Sub1_Sub3_2.method458(this.anIntArray61[local119]);
				}
				for (local123 = 0; local123 < 5; local123++) {
					this.aClass1_Sub1_Sub3_2.method458(this.anIntArray42[local123]);
				}
				return true;
			}
			if (local15 == 613) {
				this.aBoolean44 = !this.aBoolean44;
			}
			if (local15 >= 601 && local15 <= 612) {
				this.method109();
				if (this.aString7.length() > 0) {
					this.aClass1_Sub1_Sub3_2.method457(144);
					this.aClass1_Sub1_Sub3_2.method464(Class46.method645(this.aString7));
					this.aClass1_Sub1_Sub3_2.method458(local15 - 601);
					this.aClass1_Sub1_Sub3_2.method458(this.aBoolean44 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(356) RuntimeException local356) {
			signlink.reporterror("79106, " + arg0 + ", " + arg1 + ", " + local356.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)V")
	private void method204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class31 local9 = this.aClass31ArrayArrayArray1[this.anInt324][arg0][arg1];
		if (local9 == null) {
			this.aClass37_1.method571(this.anInt324, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub1_Sub1_Sub3 local23 = null;
		@Pc(27) Class1_Sub1_Sub1_Sub3 local27;
		for (local27 = (Class1_Sub1_Sub1_Sub3) local9.method498(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub3) local9.method500()) {
			@Pc(32) Class13 local32 = Class13.method317(local27.anInt483);
			@Pc(35) int local35 = local32.anInt603;
			if (local32.aBoolean123) {
				local35 *= local27.anInt484 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method496(local23);
		@Pc(65) Class1_Sub1_Sub1_Sub3 local65 = null;
		@Pc(67) Class1_Sub1_Sub1_Sub3 local67 = null;
		for (local27 = (Class1_Sub1_Sub1_Sub3) local9.method498(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub3) local9.method500()) {
			if (local27.anInt483 != local23.anInt483 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt483 != local23.anInt483 && local27.anInt483 != local65.anInt483 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass37_1.method557(local67, local110, local23, this.anInt324, local65, this.method194(this.anInt324, arg1 * 128 + 64, arg0 * 128 + 64), arg0, arg1);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLclient!d;)I")
	private int method205(@OriginalArg(0) int arg0, @OriginalArg(2) Class6 arg1) {
		try {
			if (arg1.anIntArrayArray6 == null || arg0 >= arg1.anIntArrayArray6.length) {
				return -2;
			}
			try {
				@Pc(21) int[] local21 = arg1.anIntArrayArray6[arg0];
				@Pc(23) int local23 = 0;
				@Pc(25) int local25 = 0;
				while (true) {
					@Pc(30) int local30 = local21[local25++];
					if (local30 == 0) {
						return local23;
					}
					if (local30 == 1) {
						local23 += this.anIntArray57[local21[local25++]];
					}
					if (local30 == 2) {
						local23 += this.anIntArray39[local21[local25++]];
					}
					if (local30 == 3) {
						local23 += this.anIntArray44[local21[local25++]];
					}
					@Pc(83) Class6 local83;
					@Pc(90) int local90;
					@Pc(92) int local92;
					if (local30 == 4) {
						local83 = Class6.aClass6Array1[local21[local25++]];
						local90 = local21[local25++] + 1;
						for (local92 = 0; local92 < local83.anIntArray86.length; local92++) {
							if (local83.anIntArray86[local92] == local90) {
								local23 += local83.anIntArray87[local92];
							}
						}
					}
					if (local30 == 5) {
						local23 += this.anIntArray47[local21[local25++]];
					}
					if (local30 == 6) {
						local23 += anIntArray84[this.anIntArray39[local21[local25++]] - 1];
					}
					if (local30 == 7) {
						local23 += this.anIntArray47[local21[local25++]] * 100 / 46875;
					}
					if (local30 == 8) {
						local23 += aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt180;
					}
					@Pc(173) int local173;
					if (local30 == 9) {
						for (local173 = 0; local173 < 19; local173++) {
							if (local173 == 18) {
								local173 = 20;
							}
							local23 += this.anIntArray39[local173];
						}
					}
					if (local30 == 10) {
						local83 = Class6.aClass6Array1[local21[local25++]];
						local90 = local21[local25++] + 1;
						for (local92 = 0; local92 < local83.anIntArray86.length; local92++) {
							if (local83.anIntArray86[local92] == local90) {
								local23 += 999999999;
								break;
							}
						}
					}
					if (local30 == 11) {
						local23 += this.anInt327;
					}
					if (local30 == 12) {
						local23 += this.anInt252;
					}
					if (local30 == 13) {
						local173 = this.anIntArray47[local21[local25++]];
						local90 = local21[local25++];
						local23 += (local173 & 0x1 << local90) == 0 ? 0 : 1;
					}
				}
			} catch (@Pc(276) Exception local276) {
				return -1;
			}
		} catch (@Pc(279) RuntimeException local279) {
			signlink.reporterror("77824, " + arg0 + ", " + true + ", " + arg1 + ", " + local279.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	@Override
	public void method90(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}
		if (signlink.mainapp == null) {
			super.method90(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(B)V")
	private void method206() {
		try {
			this.aBoolean55 = false;
			while (this.aBoolean50) {
				this.aBoolean55 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass1_Sub1_Sub2_Sub3_11 = null;
			this.aClass1_Sub1_Sub2_Sub3_12 = null;
			this.aClass1_Sub1_Sub2_Sub3Array3 = null;
			this.anIntArray52 = null;
			this.anIntArray53 = null;
			this.anIntArray54 = null;
			this.anIntArray55 = null;
			this.anIntArray62 = null;
			this.anIntArray63 = null;
			this.anIntArray77 = null;
			this.anIntArray78 = null;
			this.aClass1_Sub1_Sub2_Sub2_4 = null;
			this.aClass1_Sub1_Sub2_Sub2_5 = null;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("6717, " + 56 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method207() {
		try {
			@Pc(6) int local6 = this.anInt418 * 128 + 64;
			@Pc(13) int local13 = this.anInt419 * 128 + 64;
			@Pc(26) int local26 = this.method194(this.anInt324, this.anInt419, this.anInt418) - this.anInt420;
			if (this.anInt258 < local6) {
				this.anInt258 += this.anInt421 + (local6 - this.anInt258) * this.anInt422 / 1000;
				if (this.anInt258 > local6) {
					this.anInt258 = local6;
				}
			}
			if (this.anInt258 > local6) {
				this.anInt258 -= this.anInt421 + (this.anInt258 - local6) * this.anInt422 / 1000;
				if (this.anInt258 < local6) {
					this.anInt258 = local6;
				}
			}
			if (this.anInt259 < local26) {
				this.anInt259 += this.anInt421 + (local26 - this.anInt259) * this.anInt422 / 1000;
				if (this.anInt259 > local26) {
					this.anInt259 = local26;
				}
			}
			if (this.anInt259 > local26) {
				this.anInt259 -= this.anInt421 + (this.anInt259 - local26) * this.anInt422 / 1000;
				if (this.anInt259 < local26) {
					this.anInt259 = local26;
				}
			}
			if (this.anInt260 < local13) {
				this.anInt260 += this.anInt421 + (local13 - this.anInt260) * this.anInt422 / 1000;
				if (this.anInt260 > local13) {
					this.anInt260 = local13;
				}
			}
			if (this.anInt260 > local13) {
				this.anInt260 -= this.anInt421 + (this.anInt260 - local13) * this.anInt422 / 1000;
				if (this.anInt260 < local13) {
					this.anInt260 = local13;
				}
			}
			local6 = this.anInt395 * 128 + 64;
			local13 = this.anInt396 * 128 + 64;
			local26 = this.method194(this.anInt324, this.anInt396, this.anInt395) - this.anInt397;
			@Pc(229) int local229 = local6 - this.anInt258;
			@Pc(234) int local234 = local26 - this.anInt259;
			@Pc(239) int local239 = local13 - this.anInt260;
			@Pc(250) int local250 = (int) Math.sqrt((double) (local229 * local229 + local239 * local239));
			@Pc(261) int local261 = (int) (Math.atan2((double) local234, (double) local250) * 325.949D) & 0x7FF;
			@Pc(272) int local272 = (int) (Math.atan2((double) local229, (double) local239) * -325.949D) & 0x7FF;
			if (local261 < 128) {
				local261 = 128;
			}
			if (local261 > 383) {
				local261 = 383;
			}
			if (this.anInt261 < local261) {
				this.anInt261 += this.anInt398 + (local261 - this.anInt261) * this.anInt399 / 1000;
				if (this.anInt261 > local261) {
					this.anInt261 = local261;
				}
			}
			if (this.anInt261 > local261) {
				this.anInt261 -= this.anInt398 + (this.anInt261 - local261) * this.anInt399 / 1000;
				if (this.anInt261 < local261) {
					this.anInt261 = local261;
				}
			}
			@Pc(343) int local343 = local272 - this.anInt262;
			if (local343 > 1024) {
				local343 -= 2048;
			}
			if (local343 < -1024) {
				local343 += 2048;
			}
			if (local343 > 0) {
				this.anInt262 += this.anInt398 + local343 * this.anInt399 / 1000;
				this.anInt262 &= 0x7FF;
			}
			if (local343 < 0) {
				this.anInt262 -= this.anInt398 + -local343 * this.anInt399 / 1000;
				this.anInt262 &= 0x7FF;
			}
			@Pc(401) int local401 = local272 - this.anInt262;
			if (local401 > 1024) {
				local401 -= 2048;
			}
			if (local401 < -1024) {
				local401 += 2048;
			}
			if (local401 < 0 && local343 > 0 || local401 > 0 && local343 < 0) {
				this.anInt262 = local272;
			}
		} catch (@Pc(422) RuntimeException local422) {
			signlink.reporterror("7777, " + 0 + ", " + local422.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZI)I")
	private int method208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(8) int local8 = 256 - arg1;
			return ((arg0 & 0xFF00FF) * local8 + (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg0 & 0xFF00) * local8 + (arg2 & 0xFF00) * arg1 & 0xFF0000) >> 8;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("31599, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!fc;I)V")
	private void method209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class11 arg2, @OriginalArg(4) int arg3) {
		try {
			if (this.anInt388 < 400) {
				@Pc(14) String local14 = arg2.aString25;
				if (arg2.anInt573 != 0) {
					local14 = local14 + method152(886, aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt180, arg2.anInt573) + " (level-" + arg2.anInt573 + ")";
				}
				if (this.anInt376 == 1) {
					this.aStringArray2[this.anInt388] = "Use " + this.aString11 + " with @yel@" + local14;
					this.anIntArray82[this.anInt388] = 900;
					this.anIntArray83[this.anInt388] = arg1;
					this.anIntArray80[this.anInt388] = arg3;
					this.anIntArray81[this.anInt388] = arg0;
					this.anInt388++;
				} else if (this.anInt391 != 1) {
					@Pc(152) int local152;
					if (arg2.aStringArray8 != null) {
						for (local152 = 4; local152 >= 0; local152--) {
							if (arg2.aStringArray8[local152] != null && !arg2.aStringArray8[local152].equalsIgnoreCase("attack")) {
								this.aStringArray2[this.anInt388] = arg2.aStringArray8[local152] + " @yel@" + local14;
								if (local152 == 0) {
									this.anIntArray82[this.anInt388] = 728;
								}
								if (local152 == 1) {
									this.anIntArray82[this.anInt388] = 542;
								}
								if (local152 == 2) {
									this.anIntArray82[this.anInt388] = 6;
								}
								if (local152 == 3) {
									this.anIntArray82[this.anInt388] = 963;
								}
								if (local152 == 4) {
									this.anIntArray82[this.anInt388] = 245;
								}
								this.anIntArray83[this.anInt388] = arg1;
								this.anIntArray80[this.anInt388] = arg3;
								this.anIntArray81[this.anInt388] = arg0;
								this.anInt388++;
							}
						}
					}
					if (arg2.aStringArray8 != null) {
						for (local152 = 4; local152 >= 0; local152--) {
							if (arg2.aStringArray8[local152] != null && arg2.aStringArray8[local152].equalsIgnoreCase("attack")) {
								@Pc(276) short local276 = 0;
								if (arg2.anInt573 > aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt180) {
									local276 = 2000;
								}
								this.aStringArray2[this.anInt388] = arg2.aStringArray8[local152] + " @yel@" + local14;
								if (local152 == 0) {
									this.anIntArray82[this.anInt388] = local276 + 728;
								}
								if (local152 == 1) {
									this.anIntArray82[this.anInt388] = local276 + 542;
								}
								if (local152 == 2) {
									this.anIntArray82[this.anInt388] = local276 + 6;
								}
								if (local152 == 3) {
									this.anIntArray82[this.anInt388] = local276 + 963;
								}
								if (local152 == 4) {
									this.anIntArray82[this.anInt388] = local276 + 245;
								}
								this.anIntArray83[this.anInt388] = arg1;
								this.anIntArray80[this.anInt388] = arg3;
								this.anIntArray81[this.anInt388] = arg0;
								this.anInt388++;
							}
						}
					}
					this.aStringArray2[this.anInt388] = "Examine @yel@" + local14;
					this.anIntArray82[this.anInt388] = 1607;
					this.anIntArray83[this.anInt388] = arg1;
					this.anIntArray80[this.anInt388] = arg3;
					this.anIntArray81[this.anInt388] = arg0;
					this.anInt388++;
				} else if ((this.anInt393 & 0x2) == 2) {
					this.aStringArray2[this.anInt388] = this.aString13 + " @yel@" + local14;
					this.anIntArray82[this.anInt388] = 265;
					this.anIntArray83[this.anInt388] = arg1;
					this.anIntArray80[this.anInt388] = arg3;
					this.anIntArray81[this.anInt388] = arg0;
					this.anInt388++;
					return;
				}
			}
		} catch (@Pc(426) RuntimeException local426) {
			signlink.reporterror("52664, " + arg0 + ", " + arg1 + ", " + 2 + ", " + arg2 + ", " + arg3 + ", " + local426.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method210(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt305 == 0) {
				this.aStringArray2[0] = "Cancel";
				@Pc(14) boolean local14 = false;
				this.anIntArray82[0] = 1252;
				this.anInt388 = 1;
				this.method94(super.anInt235, super.anInt234);
				this.anInt247 = 0;
				if (super.anInt234 > 8 && super.anInt235 > 11 && super.anInt234 < 520 && super.anInt235 < 345) {
					if (this.anInt296 == -1) {
						this.method219();
					} else {
						this.method105(super.anInt234, 0, Class6.aClass6Array1[this.anInt296], 8, 11, super.anInt235);
					}
				}
				if (this.anInt247 != this.anInt350) {
					this.anInt350 = this.anInt247;
				}
				this.anInt247 = 0;
				if (super.anInt234 > 562 && super.anInt235 > 231 && super.anInt234 < 752 && super.anInt235 < 492) {
					if (this.anInt264 != -1) {
						this.method105(super.anInt234, 0, Class6.aClass6Array1[this.anInt264], 562, 231, super.anInt235);
					} else if (this.anIntArray56[this.anInt333] != -1) {
						this.method105(super.anInt234, 0, Class6.aClass6Array1[this.anIntArray56[this.anInt333]], 562, 231, super.anInt235);
					}
				}
				if (this.anInt247 != this.anInt250) {
					this.aBoolean49 = true;
					this.anInt250 = this.anInt247;
				}
				this.anInt247 = 0;
				if (super.anInt234 > 22 && super.anInt235 > 375 && super.anInt234 < 431 && super.anInt235 < 471) {
					if (this.anInt354 == -1) {
						this.method140(super.anInt234 - 22, super.anInt235 - 375);
					} else {
						this.method105(super.anInt234, 0, Class6.aClass6Array1[this.anInt354], 22, 375, super.anInt235);
					}
				}
				if (this.anInt354 != -1 && this.anInt247 != this.anInt282) {
					this.aBoolean61 = true;
					this.anInt282 = this.anInt247;
				}
				@Pc(223) boolean local223 = false;
				while (!local223) {
					local223 = true;
					for (@Pc(229) int local229 = 0; local229 < this.anInt388 - 1; local229++) {
						if (this.anIntArray82[local229] < 1000 && this.anIntArray82[local229 + 1] > 1000) {
							@Pc(250) String local250 = this.aStringArray2[local229];
							this.aStringArray2[local229] = this.aStringArray2[local229 + 1];
							this.aStringArray2[local229 + 1] = local250;
							@Pc(272) int local272 = this.anIntArray82[local229];
							this.anIntArray82[local229] = this.anIntArray82[local229 + 1];
							this.anIntArray82[local229 + 1] = local272;
							@Pc(294) int local294 = this.anIntArray80[local229];
							this.anIntArray80[local229] = this.anIntArray80[local229 + 1];
							this.anIntArray80[local229 + 1] = local294;
							@Pc(316) int local316 = this.anIntArray81[local229];
							this.anIntArray81[local229] = this.anIntArray81[local229 + 1];
							this.anIntArray81[local229 + 1] = local316;
							@Pc(338) int local338 = this.anIntArray83[local229];
							this.anIntArray83[local229] = this.anIntArray83[local229 + 1];
							this.anIntArray83[local229 + 1] = local338;
							local223 = false;
						}
					}
				}
			}
		} catch (@Pc(368) RuntimeException local368) {
			signlink.reporterror("49986, " + arg0 + ", " + local368.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method211(@OriginalArg(0) int arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt346; local3++) {
				if (this.anIntArray59[local3] <= 0) {
					@Pc(12) boolean local12 = false;
					try {
						if (this.anIntArray60[local3] != this.anInt343 || this.anIntArray50[local3] != this.anInt294) {
							@Pc(46) Class1_Sub1_Sub3 local46 = Class5.method74(this.anIntArray50[local3], this.anIntArray60[local3]);
							if (System.currentTimeMillis() + (long) (local46.anInt777 / 22) > this.aLong13 + (long) (this.anInt328 / 22)) {
								this.anInt328 = local46.anInt777;
								this.aLong13 = System.currentTimeMillis();
								if (this.method93(local46.anInt777, local46.aByteArray9)) {
									this.anInt343 = this.anIntArray60[local3];
									this.anInt294 = this.anIntArray50[local3];
								} else {
									local12 = true;
								}
							}
						} else if (!this.method142(this.anInt413)) {
							local12 = true;
						}
					} catch (@Pc(96) Exception local96) {
					}
					if (local12 && this.anIntArray59[local3] != -5) {
						this.anIntArray59[local3] = -5;
					} else {
						this.anInt346--;
						for (@Pc(112) int local112 = local3; local112 < this.anInt346; local112++) {
							this.anIntArray60[local112] = this.anIntArray60[local112 + 1];
							this.anIntArray50[local112] = this.anIntArray50[local112 + 1];
							this.anIntArray59[local112] = this.anIntArray59[local112 + 1];
						}
						local3--;
					}
				} else {
					@Pc(164) int local164 = this.anIntArray59[local3]--;
				}
			}
			@Pc(176) boolean local176 = false;
			if (this.anInt336 > 0) {
				this.anInt336 -= 20;
				if (this.anInt336 < 0) {
					this.anInt336 = 0;
				}
				if (this.anInt336 == 0 && this.aBoolean40 && !aBoolean47) {
					this.anInt274 = this.anInt256;
					this.aBoolean45 = false;
					this.aClass42_Sub1_1.method623(2, this.anInt274);
					return;
				}
			}
		} catch (@Pc(214) RuntimeException local214) {
			signlink.reporterror("52095, " + arg0 + ", " + local214.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(B)V")
	private void method212(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			for (@Pc(16) Class1_Sub1_Sub1_Sub4 local16 = (Class1_Sub1_Sub1_Sub4) this.aClass31_2.method498(); local16 != null; local16 = (Class1_Sub1_Sub1_Sub4) this.aClass31_2.method500()) {
				if (local16.anInt497 != this.anInt324 || anInt363 > local16.anInt503) {
					local16.method635();
				} else if (anInt363 >= local16.anInt502) {
					if (local16.anInt506 > 0) {
						@Pc(46) Class1_Sub1_Sub1_Sub1_Sub1 local46 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local16.anInt506 - 1];
						if (local46 != null) {
							local16.method246(this.method194(local16.anInt497, local46.anInt129, local46.anInt128) - local16.anInt501, (byte) 3, local46.anInt129, anInt363, local46.anInt128);
						}
					}
					if (local16.anInt506 < 0) {
						@Pc(77) int local77 = -local16.anInt506 - 1;
						@Pc(83) Class1_Sub1_Sub1_Sub1_Sub2 local83;
						if (local77 == this.anInt255) {
							local83 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
						} else {
							local83 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local77];
						}
						if (local83 != null) {
							local16.method246(this.method194(local16.anInt497, local83.anInt129, local83.anInt128) - local16.anInt501, (byte) 3, local83.anInt129, anInt363, local83.anInt128);
						}
					}
					local16.method247(this.anInt316);
					this.aClass37_1.method561(false, -1, (int) local16.aDouble3, 60, this.anInt324, local16.anInt507, local16, (int) local16.aDouble1, (int) local16.aDouble2);
				}
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("58807, " + arg0 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!mb;II)V")
	private void method213(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt311 = 0;
			this.anInt387 = 0;
			this.method185(arg1, arg0);
			this.method127(arg1, arg0);
			this.method217(arg1, arg0);
			@Pc(35) int local35;
			for (@Pc(28) int local28 = 0; local28 < this.anInt311; local28++) {
				local35 = this.anIntArray51[local28];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local35].anInt170 != anInt363) {
					this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local35].aClass11_1 = null;
					this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local35] = null;
				}
			}
			if (arg0.anInt777 != arg1) {
				signlink.reporterror(this.aString14 + " size mismatch in getnpcpos - pos:" + arg0.anInt777 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local35 = 0; local35 < this.anInt353; local35++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray64[local35]] == null) {
					signlink.reporterror(this.aString14 + " null entry in npc list - pos:" + local35 + " size:" + this.anInt353);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("60947, " + arg0 + ", " + arg1 + ", " + -134 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!bb;I)V")
	private void method214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub1_Sub1_Sub1_Sub2 arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(5) boolean local5 = false;
			if (arg3 != aClass1_Sub1_Sub1_Sub1_Sub2_1 && this.anInt388 < 400) {
				@Pc(36) String local36 = arg3.aString4 + method152(886, aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt180, arg3.anInt180) + " (level-" + arg3.anInt180 + ")";
				if (this.anInt376 == 1) {
					this.aStringArray2[this.anInt388] = "Use " + this.aString11 + " with @whi@" + local36;
					this.anIntArray82[this.anInt388] = 367;
					this.anIntArray83[this.anInt388] = arg2;
					this.anIntArray80[this.anInt388] = arg0;
					this.anIntArray81[this.anInt388] = arg1;
					this.anInt388++;
				} else if (this.anInt391 != 1) {
					this.aStringArray2[this.anInt388] = "Follow @whi@" + local36;
					this.anIntArray82[this.anInt388] = 1544;
					this.anIntArray83[this.anInt388] = arg2;
					this.anIntArray80[this.anInt388] = arg0;
					this.anIntArray81[this.anInt388] = arg1;
					this.anInt388++;
					if (this.anInt383 == 0) {
						this.aStringArray2[this.anInt388] = "Trade with @whi@" + local36;
						this.anIntArray82[this.anInt388] = 1373;
						this.anIntArray83[this.anInt388] = arg2;
						this.anIntArray80[this.anInt388] = arg0;
						this.anIntArray81[this.anInt388] = arg1;
						this.anInt388++;
					}
					if (this.anInt394 > 0) {
						this.aStringArray2[this.anInt388] = "Attack @whi@" + local36;
						if (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt180 >= arg3.anInt180) {
							this.anIntArray82[this.anInt388] = 151;
						} else {
							this.anIntArray82[this.anInt388] = 2151;
						}
						this.anIntArray83[this.anInt388] = arg2;
						this.anIntArray80[this.anInt388] = arg0;
						this.anIntArray81[this.anInt388] = arg1;
						this.anInt388++;
					}
					if (this.anInt367 == 1) {
						this.aStringArray2[this.anInt388] = "Fight @whi@" + local36;
						this.anIntArray82[this.anInt388] = 151;
						this.anIntArray83[this.anInt388] = arg2;
						this.anIntArray80[this.anInt388] = arg0;
						this.anIntArray81[this.anInt388] = arg1;
						this.anInt388++;
					}
					if (this.anInt367 == 2) {
						this.aStringArray2[this.anInt388] = "Duel-with @whi@" + local36;
						this.anIntArray82[this.anInt388] = 1101;
						this.anIntArray83[this.anInt388] = arg2;
						this.anIntArray80[this.anInt388] = arg0;
						this.anIntArray81[this.anInt388] = arg1;
						this.anInt388++;
					}
				} else if ((this.anInt393 & 0x8) == 8) {
					this.aStringArray2[this.anInt388] = this.aString13 + " @whi@" + local36;
					this.anIntArray82[this.anInt388] = 651;
					this.anIntArray83[this.anInt388] = arg2;
					this.anIntArray80[this.anInt388] = arg0;
					this.anIntArray81[this.anInt388] = arg1;
					this.anInt388++;
				}
				for (@Pc(386) int local386 = 0; local386 < this.anInt388; local386++) {
					if (this.anIntArray82[local386] == 660) {
						this.aStringArray2[local386] = "Walk here @whi@" + local36;
						return;
					}
				}
			}
		} catch (@Pc(413) RuntimeException local413) {
			signlink.reporterror("49445, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local413.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)Ljava/net/Socket;")
	public Socket method215(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method216() {
		try {
			if (this.anInt431 > 0) {
				this.method133((byte) 5);
			} else {
				this.aClass36_17.method546();
				this.aClass1_Sub1_Sub2_Sub4_2.method441(this.aByte28, "Connection lost", 257, 144, 0);
				this.aClass1_Sub1_Sub2_Sub4_2.method441(this.aByte28, "Connection lost", 256, 143, 16777215);
				this.aClass1_Sub1_Sub2_Sub4_2.method441(this.aByte28, "Please wait - attempting to reestablish", 257, 159, 0);
				this.aClass1_Sub1_Sub2_Sub4_2.method441(this.aByte28, "Please wait - attempting to reestablish", 256, 158, 16777215);
				this.aClass36_17.method547(8, super.aGraphics2, 11);
				this.anInt325 = 0;
				@Pc(60) Class8 local60 = this.aClass8_1;
				this.aBoolean72 = false;
				this.method92(this.aString14, this.aString15, true);
				if (!this.aBoolean72) {
					this.method133((byte) 5);
				}
				try {
					local60.method236();
				} catch (@Pc(89) Exception local89) {
				}
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("11821, " + 5 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!mb;Z)V")
	private void method217(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			for (@Pc(6) int local6 = 0; local6 < this.anInt387; local6++) {
				@Pc(13) int local13 = this.anIntArray74[local6];
				@Pc(18) Class1_Sub1_Sub1_Sub1_Sub1 local18 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local13];
				@Pc(21) int local21 = arg1.method468();
				@Pc(29) int local29;
				if ((local21 & 0x2) == 2) {
					local29 = arg1.method470();
					if (local29 == 65535) {
						local29 = -1;
					}
					if (local29 == local18.anInt153) {
						local18.anInt157 = 0;
					}
					@Pc(44) int local44 = arg1.method468();
					if (local29 == -1 || local18.anInt153 == -1 || Class25.aClass25Array1[local29].anInt787 > Class25.aClass25Array1[local18.anInt153].anInt787 || Class25.aClass25Array1[local18.anInt153].anInt787 == 0) {
						local18.anInt153 = local29;
						local18.anInt154 = 0;
						local18.anInt155 = 0;
						local18.anInt156 = local44;
						local18.anInt157 = 0;
					}
				}
				if ((local21 & 0x4) == 4) {
					local18.anInt147 = arg1.method470();
					if (local18.anInt147 == 65535) {
						local18.anInt147 = -1;
					}
				}
				if ((local21 & 0x8) == 8) {
					local18.aString3 = arg1.method475();
					local18.anInt139 = 100;
				}
				if ((local21 & 0x10) == 16) {
					local18.anInt142 = arg1.method468();
					local18.anInt143 = arg1.method468();
					local18.anInt144 = anInt363 + 400;
					local18.anInt145 = arg1.method468();
					local18.anInt146 = arg1.method468();
				}
				if ((local21 & 0x20) == 32) {
					local18.aClass11_1 = Class11.method306(arg1.method470());
					local18.anInt134 = local18.aClass11_1.anInt566;
					local18.anInt135 = local18.aClass11_1.anInt567;
					local18.anInt136 = local18.aClass11_1.anInt568;
					local18.anInt137 = local18.aClass11_1.anInt569;
					local18.anInt132 = local18.aClass11_1.anInt565;
				}
				if ((local21 & 0x40) == 64) {
					local18.anInt158 = arg1.method470();
					local29 = arg1.method473();
					local18.anInt162 = local29 >> 16;
					local18.anInt161 = anInt363 + (local29 & 0xFFFF);
					local18.anInt159 = 0;
					local18.anInt160 = 0;
					if (local18.anInt161 > anInt363) {
						local18.anInt159 = -1;
					}
					if (local18.anInt158 == 65535) {
						local18.anInt158 = -1;
					}
				}
				if ((local21 & 0x80) == 128) {
					local18.anInt148 = arg1.method470();
					local18.anInt149 = arg1.method470();
				}
			}
		} catch (@Pc(235) RuntimeException local235) {
			signlink.reporterror("9238, " + arg0 + ", " + arg1 + ", " + false + ", " + local235.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
	private void method218() {
		try {
			signlink.anInt925 = 0;
			signlink.midi = "stop";
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("45482, " + true + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method88() {
		try {
			this.aBoolean57 = true;
			if (this.aByte15 != -43) {
				for (@Pc(8) int local8 = 1; local8 > 0; local8++) {
				}
			}
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("78832, " + -43 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method219() {
		try {
			if (this.anInt376 == 0 && this.anInt391 == 0) {
				this.aStringArray2[this.anInt388] = "Walk here";
				this.anIntArray82[this.anInt388] = 660;
				this.anIntArray80[this.anInt388] = super.anInt234;
				this.anIntArray81[this.anInt388] = super.anInt235;
				this.anInt388++;
			}
			@Pc(41) int local41 = -1;
			for (@Pc(43) int local43 = 0; local43 < Class1_Sub1_Sub1_Sub5.anInt561; local43++) {
				@Pc(49) int local49 = Class1_Sub1_Sub1_Sub5.anIntArray147[local43];
				@Pc(53) int local53 = local49 & 0x7F;
				@Pc(59) int local59 = local49 >> 7 & 0x7F;
				@Pc(65) int local65 = local49 >> 29 & 0x3;
				@Pc(71) int local71 = local49 >> 14 & 0x7FFF;
				if (local49 != local41) {
					local41 = local49;
					@Pc(209) int local209;
					if (local65 == 2 && this.aClass37_1.method580(this.anInt324, local53, local59, local49) >= 0) {
						@Pc(91) Class9 local91 = Class9.method250(local71);
						if (this.anInt376 == 1) {
							this.aStringArray2[this.anInt388] = "Use " + this.aString11 + " with @cya@" + local91.aString24;
							this.anIntArray82[this.anInt388] = 450;
							this.anIntArray83[this.anInt388] = local49;
							this.anIntArray80[this.anInt388] = local53;
							this.anIntArray81[this.anInt388] = local59;
							this.anInt388++;
						} else if (this.anInt391 != 1) {
							if (local91.aStringArray7 != null) {
								for (local209 = 4; local209 >= 0; local209--) {
									if (local91.aStringArray7[local209] != null) {
										this.aStringArray2[this.anInt388] = local91.aStringArray7[local209] + " @cya@" + local91.aString24;
										if (local209 == 0) {
											this.anIntArray82[this.anInt388] = 285;
										}
										if (local209 == 1) {
											this.anIntArray82[this.anInt388] = 504;
										}
										if (local209 == 2) {
											this.anIntArray82[this.anInt388] = 364;
										}
										if (local209 == 3) {
											this.anIntArray82[this.anInt388] = 581;
										}
										if (local209 == 4) {
											this.anIntArray82[this.anInt388] = 1501;
										}
										this.anIntArray83[this.anInt388] = local49;
										this.anIntArray80[this.anInt388] = local53;
										this.anIntArray81[this.anInt388] = local59;
										this.anInt388++;
									}
								}
							}
							this.aStringArray2[this.anInt388] = "Examine @cya@" + local91.aString24;
							this.anIntArray82[this.anInt388] = 1175;
							this.anIntArray83[this.anInt388] = local49;
							this.anIntArray80[this.anInt388] = local53;
							this.anIntArray81[this.anInt388] = local59;
							this.anInt388++;
						} else if ((this.anInt393 & 0x4) == 4) {
							this.aStringArray2[this.anInt388] = this.aString13 + " @cya@" + local91.aString24;
							this.anIntArray82[this.anInt388] = 55;
							this.anIntArray83[this.anInt388] = local49;
							this.anIntArray80[this.anInt388] = local53;
							this.anIntArray81[this.anInt388] = local59;
							this.anInt388++;
						}
					}
					@Pc(386) Class1_Sub1_Sub1_Sub1_Sub1 local386;
					if (local65 == 1) {
						@Pc(357) Class1_Sub1_Sub1_Sub1_Sub1 local357 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local71];
						if (local357.aClass11_1.aByte31 == 1 && (local357.anInt128 & 0x7F) == 64 && (local357.anInt129 & 0x7F) == 64) {
							for (local209 = 0; local209 < this.anInt353; local209++) {
								local386 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray64[local209]];
								if (local386 != null && local386 != local357 && local386.aClass11_1.aByte31 == 1 && local386.anInt128 == local357.anInt128 && local386.anInt129 == local357.anInt129) {
									this.method209(local59, this.anIntArray64[local209], local386.aClass11_1, local53);
								}
							}
						}
						this.method209(local59, local71, local357.aClass11_1, local53);
					}
					if (local65 == 0) {
						@Pc(437) Class1_Sub1_Sub1_Sub1_Sub2 local437 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local71];
						if ((local437.anInt128 & 0x7F) == 64 && (local437.anInt129 & 0x7F) == 64) {
							for (local209 = 0; local209 < this.anInt353; local209++) {
								local386 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray64[local209]];
								if (local386 != null && local386.aClass11_1.aByte31 == 1 && local386.anInt128 == local437.anInt128 && local386.anInt129 == local437.anInt129) {
									this.method209(local59, this.anIntArray64[local209], local386.aClass11_1, local53);
								}
							}
							for (@Pc(496) int local496 = 0; local496 < this.anInt386; local496++) {
								@Pc(506) Class1_Sub1_Sub1_Sub1_Sub2 local506 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray73[local496]];
								if (local506 != null && local506 != local437 && local506.anInt128 == local437.anInt128 && local506.anInt129 == local437.anInt129) {
									this.method214(local53, local59, this.anIntArray73[local496], local506, 624);
								}
							}
						}
						this.method214(local53, local59, local71, local437, 624);
					}
					if (local65 == 3) {
						@Pc(556) Class31 local556 = this.aClass31ArrayArrayArray1[this.anInt324][local53][local59];
						if (local556 != null) {
							for (@Pc(563) Class1_Sub1_Sub1_Sub3 local563 = (Class1_Sub1_Sub1_Sub3) local556.method499(); local563 != null; local563 = (Class1_Sub1_Sub1_Sub3) local556.method501()) {
								@Pc(569) Class13 local569 = Class13.method317(local563.anInt483);
								if (this.anInt376 == 1) {
									this.aStringArray2[this.anInt388] = "Use " + this.aString11 + " with @lre@" + local569.aString26;
									this.anIntArray82[this.anInt388] = 217;
									this.anIntArray83[this.anInt388] = local563.anInt483;
									this.anIntArray80[this.anInt388] = local53;
									this.anIntArray81[this.anInt388] = local59;
									this.anInt388++;
								} else if (this.anInt391 != 1) {
									for (@Pc(686) int local686 = 4; local686 >= 0; local686--) {
										if (local569.aStringArray9 != null && local569.aStringArray9[local686] != null) {
											this.aStringArray2[this.anInt388] = local569.aStringArray9[local686] + " @lre@" + local569.aString26;
											if (local686 == 0) {
												this.anIntArray82[this.anInt388] = 224;
											}
											if (local686 == 1) {
												this.anIntArray82[this.anInt388] = 993;
											}
											if (local686 == 2) {
												this.anIntArray82[this.anInt388] = 99;
											}
											if (local686 == 3) {
												this.anIntArray82[this.anInt388] = 746;
											}
											if (local686 == 4) {
												this.anIntArray82[this.anInt388] = 877;
											}
											this.anIntArray83[this.anInt388] = local563.anInt483;
											this.anIntArray80[this.anInt388] = local53;
											this.anIntArray81[this.anInt388] = local59;
											this.anInt388++;
										} else if (local686 == 2) {
											this.aStringArray2[this.anInt388] = "Take @lre@" + local569.aString26;
											this.anIntArray82[this.anInt388] = 99;
											this.anIntArray83[this.anInt388] = local563.anInt483;
											this.anIntArray80[this.anInt388] = local53;
											this.anIntArray81[this.anInt388] = local59;
											this.anInt388++;
										}
									}
									this.aStringArray2[this.anInt388] = "Examine @lre@" + local569.aString26;
									this.anIntArray82[this.anInt388] = 1102;
									this.anIntArray83[this.anInt388] = local563.anInt483;
									this.anIntArray80[this.anInt388] = local53;
									this.anIntArray81[this.anInt388] = local59;
									this.anInt388++;
								} else if ((this.anInt393 & 0x1) == 1) {
									this.aStringArray2[this.anInt388] = this.aString13 + " @lre@" + local569.aString26;
									this.anIntArray82[this.anInt388] = 965;
									this.anIntArray83[this.anInt388] = local563.anInt483;
									this.anIntArray80[this.anInt388] = local53;
									this.anIntArray81[this.anInt388] = local59;
									this.anInt388++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(899) RuntimeException local899) {
			signlink.reporterror("24293, " + 0 + ", " + local899.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
	private void method220() {
		try {
			this.aClass36_16.method546();
			@Pc(13) int local13 = this.anInt443 + this.anInt370 & 0x7FF;
			@Pc(20) int local20 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 / 32 + 48;
			@Pc(27) int local27 = 464 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 / 32;
			this.aClass1_Sub1_Sub2_Sub2_6.method401(local27, local20, 146, 151, 9, this.anIntArray71, 21, this.anIntArray36, local13, this.anInt365 + 256);
			this.aClass1_Sub1_Sub2_Sub2_11.method401(25, 25, 33, 33, 0, this.anIntArray41, 0, this.anIntArray76, this.anInt443, 256);
			for (@Pc(65) int local65 = 0; local65 < this.anInt248; local65++) {
				local20 = this.anIntArray34[local65] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 / 32;
				local27 = this.anIntArray35[local65] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 / 32;
				this.method196(this.aClass1_Sub1_Sub2_Sub2Array7[local65], local20, local27);
			}
			@Pc(115) int local115;
			for (@Pc(111) int local111 = 0; local111 < 104; local111++) {
				for (local115 = 0; local115 < 104; local115++) {
					@Pc(127) Class31 local127 = this.aClass31ArrayArrayArray1[this.anInt324][local111][local115];
					if (local127 != null) {
						local20 = local111 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 / 32;
						local27 = local115 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 / 32;
						this.method196(this.aClass1_Sub1_Sub2_Sub2_7, local20, local27);
					}
				}
			}
			for (local115 = 0; local115 < this.anInt353; local115++) {
				@Pc(181) Class1_Sub1_Sub1_Sub1_Sub1 local181 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray64[local115]];
				if (local181 != null && local181.method44() && local181.aClass11_1.aBoolean115) {
					local20 = local181.anInt128 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 / 32;
					local27 = local181.anInt129 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 / 32;
					this.method196(this.aClass1_Sub1_Sub2_Sub2_8, local20, local27);
				}
			}
			for (@Pc(225) int local225 = 0; local225 < this.anInt386; local225++) {
				@Pc(235) Class1_Sub1_Sub1_Sub1_Sub2 local235 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray73[local225]];
				if (local235 != null && local235.method44()) {
					local20 = local235.anInt128 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 / 32;
					local27 = local235.anInt129 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 / 32;
					@Pc(263) boolean local263 = false;
					@Pc(267) long local267 = Class46.method645(local235.aString4);
					for (@Pc(269) int local269 = 0; local269 < this.anInt339; local269++) {
						if (local267 == this.aLongArray3[local269] && this.anIntArray79[local269] != 0) {
							local263 = true;
							break;
						}
					}
					if (local263) {
						this.method196(this.aClass1_Sub1_Sub2_Sub2_10, local20, local27);
					} else {
						this.method196(this.aClass1_Sub1_Sub2_Sub2_9, local20, local27);
					}
				}
			}
			if (this.anInt325 != 0) {
				local20 = this.anInt325 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 / 32;
				local27 = this.anInt326 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 / 32;
				this.method196(this.aClass1_Sub1_Sub2_Sub2_1, local20, local27);
			}
			Class1_Sub1_Sub2.method437(3, 82, 3, 93, 16777215);
			this.aClass36_17.method546();
		} catch (@Pc(362) RuntimeException local362) {
			signlink.reporterror("31918, " + false + ", " + local362.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!mb;II)V")
	private void method221(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(20) int local20;
			@Pc(29) int local29;
			@Pc(36) int local36;
			@Pc(39) int local39;
			@Pc(43) int local43;
			@Pc(47) int local47;
			@Pc(52) int local52;
			@Pc(57) int local57;
			if (arg1 == 112 || arg1 == 31) {
				local20 = arg0.method468();
				local29 = this.anInt314 + (local20 >> 4 & 0x7);
				local36 = this.anInt315 + (local20 & 0x7);
				local39 = arg0.method468();
				local43 = local39 >> 2;
				local47 = local39 & 0x3;
				local52 = this.anIntArray48[local43];
				if (arg1 == 31) {
					local57 = -1;
				} else {
					local57 = arg0.method470();
				}
				if (local29 >= 0 && local36 >= 0 && local29 < 104 && local36 < 104) {
					this.method139(local43, local47, -1, 0, local52, local57, local36, this.anInt324, local29);
				}
			} else {
				@Pc(147) int local147;
				@Pc(159) int local159;
				@Pc(173) int local173;
				@Pc(185) int local185;
				if (arg1 == 230) {
					local20 = arg0.method468();
					local29 = this.anInt314 + (local20 >> 4 & 0x7);
					local36 = this.anInt315 + (local20 & 0x7);
					local39 = arg0.method468();
					local43 = local39 >> 2;
					local47 = local39 & 0x3;
					local52 = this.anIntArray48[local43];
					local57 = arg0.method470();
					if (local29 >= 0 && local36 >= 0 && local29 < 103 && local36 < 103) {
						local147 = this.anIntArrayArrayArray3[this.anInt324][local29][local36];
						local159 = this.anIntArrayArrayArray3[this.anInt324][local29 + 1][local36];
						local173 = this.anIntArrayArrayArray3[this.anInt324][local29 + 1][local36 + 1];
						local185 = this.anIntArrayArrayArray3[this.anInt324][local29][local36 + 1];
						if (local52 == 0) {
							@Pc(196) Class35 local196 = this.aClass37_1.method572(local36, local29, this.anInt324);
							if (local196 != null) {
								@Pc(205) int local205 = local196.anInt878 >> 14 & 0x7FFF;
								if (local43 == 2) {
									local196.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(2, local205, local173, local57, local47 + 4, 0, false, local159, local185, local147);
									local196.aClass1_Sub1_Sub1_8 = new Class1_Sub1_Sub1_Sub2(2, local205, local173, local57, local47 + 1 & 0x3, 0, false, local159, local185, local147);
								} else {
									local196.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(local43, local205, local173, local57, local47, 0, false, local159, local185, local147);
								}
							}
						}
						if (local52 == 1) {
							@Pc(273) Class16 local273 = this.aClass37_1.method573(this.anInt324, local29, local36);
							if (local273 != null) {
								local273.aClass1_Sub1_Sub1_1 = new Class1_Sub1_Sub1_Sub2(4, local273.anInt637 >> 14 & 0x7FFF, local173, local57, 0, 0, false, local159, local185, local147);
							}
						}
						if (local52 == 2) {
							@Pc(307) Class33 local307 = this.aClass37_1.method574(local29, local36, this.anInt324);
							if (local43 == 11) {
								local43 = 10;
							}
							if (local307 != null) {
								local307.aClass1_Sub1_Sub1_6 = new Class1_Sub1_Sub1_Sub2(local43, local307.anInt872 >> 14 & 0x7FFF, local173, local57, local47, 0, false, local159, local185, local147);
							}
						}
						if (local52 == 3) {
							@Pc(346) Class20 local346 = this.aClass37_1.method575(local36, local29, this.anInt324);
							if (local346 != null) {
								local346.aClass1_Sub1_Sub1_2 = new Class1_Sub1_Sub1_Sub2(22, local346.anInt704 >> 14 & 0x7FFF, local173, local57, local47, 0, false, local159, local185, local147);
							}
						}
					}
				} else {
					@Pc(411) Class1_Sub1_Sub1_Sub3 local411;
					if (arg1 == 167) {
						local20 = arg0.method468();
						local29 = this.anInt314 + (local20 >> 4 & 0x7);
						local36 = this.anInt315 + (local20 & 0x7);
						local39 = arg0.method470();
						local43 = arg0.method470();
						if (local29 >= 0 && local36 >= 0 && local29 < 104 && local36 < 104) {
							local411 = new Class1_Sub1_Sub1_Sub3();
							local411.anInt483 = local39;
							local411.anInt484 = local43;
							if (this.aClass31ArrayArrayArray1[this.anInt324][local29][local36] == null) {
								this.aClass31ArrayArrayArray1[this.anInt324][local29][local36] = new Class31((byte) 115);
							}
							this.aClass31ArrayArrayArray1[this.anInt324][local29][local36].method495(local411);
							this.method204(local29, local36);
						}
					} else if (arg1 == 247) {
						local20 = arg0.method468();
						local29 = this.anInt314 + (local20 >> 4 & 0x7);
						local36 = this.anInt315 + (local20 & 0x7);
						local39 = arg0.method470();
						if (local29 >= 0 && local36 >= 0 && local29 < 104 && local36 < 104) {
							@Pc(501) Class31 local501 = this.aClass31ArrayArrayArray1[this.anInt324][local29][local36];
							if (local501 != null) {
								for (local411 = (Class1_Sub1_Sub1_Sub3) local501.method498(); local411 != null; local411 = (Class1_Sub1_Sub1_Sub3) local501.method500()) {
									if (local411.anInt483 == (local39 & 0x7FFF)) {
										local411.method635();
										break;
									}
								}
								if (local501.method498() == null) {
									this.aClass31ArrayArrayArray1[this.anInt324][local29][local36] = null;
								}
								this.method204(local29, local36);
							}
						}
					} else if (arg1 == 67) {
						local20 = arg0.method468();
						local29 = this.anInt314 + (local20 >> 4 & 0x7);
						local36 = this.anInt315 + (local20 & 0x7);
						local39 = local29 + arg0.method469();
						local43 = local36 + arg0.method469();
						local47 = arg0.method471();
						local52 = arg0.method470();
						local57 = arg0.method468();
						local147 = arg0.method468();
						local159 = arg0.method470();
						local173 = arg0.method470();
						local185 = arg0.method468();
						@Pc(600) int local600 = arg0.method468();
						if (local29 >= 0 && local36 >= 0 && local29 < 104 && local36 < 104 && local39 >= 0 && local43 >= 0 && local39 < 104 && local43 < 104) {
							local29 = local29 * 128 + 64;
							local36 = local36 * 128 + 64;
							local39 = local39 * 128 + 64;
							local43 = local43 * 128 + 64;
							@Pc(673) Class1_Sub1_Sub1_Sub4 local673 = new Class1_Sub1_Sub1_Sub4(local173 + anInt363, local147, local29, local52, local600, this.method194(this.anInt324, local36, local29) - local57, local36, local159 + anInt363, local185, this.anInt324, local47, 0);
							local673.method246(this.method194(this.anInt324, local43, local39) - local147, (byte) 3, local43, local159 + anInt363, local39);
							this.aClass31_2.method495(local673);
						}
					} else if (arg1 == 215) {
						local20 = arg0.method468();
						local29 = this.anInt314 + (local20 >> 4 & 0x7);
						local36 = this.anInt315 + (local20 & 0x7);
						local39 = arg0.method470();
						local43 = arg0.method468();
						local47 = arg0.method470();
						if (local29 >= 0 && local36 >= 0 && local29 < 104 && local36 < 104) {
							local29 = local29 * 128 + 64;
							local36 = local36 * 128 + 64;
							@Pc(769) Class1_Sub1_Sub1_Sub6 local769 = new Class1_Sub1_Sub1_Sub6(local36, local29, local39, anInt363, local47, this.method194(this.anInt324, local36, local29) - local43, this.anInt324, true);
							this.aClass31_3.method495(local769);
						}
					} else if (arg1 == 131) {
						local20 = arg0.method468();
						local29 = this.anInt314 + (local20 >> 4 & 0x7);
						local36 = this.anInt315 + (local20 & 0x7);
						local39 = arg0.method470();
						local43 = arg0.method470();
						local47 = arg0.method470();
						if (local29 >= 0 && local36 >= 0 && local29 < 104 && local36 < 104 && local47 != this.anInt255) {
							@Pc(823) Class1_Sub1_Sub1_Sub3 local823 = new Class1_Sub1_Sub1_Sub3();
							local823.anInt483 = local39;
							local823.anInt484 = local43;
							if (this.aClass31ArrayArrayArray1[this.anInt324][local29][local36] == null) {
								this.aClass31ArrayArrayArray1[this.anInt324][local29][local36] = new Class31((byte) 115);
							}
							this.aClass31ArrayArrayArray1[this.anInt324][local29][local36].method495(local823);
							this.method204(local29, local36);
						}
					} else {
						if (arg1 == 248) {
							local20 = arg0.method468();
							local29 = this.anInt314 + (local20 >> 4 & 0x7);
							local36 = this.anInt315 + (local20 & 0x7);
							local39 = arg0.method468();
							local43 = local39 >> 2;
							local47 = local39 & 0x3;
							local52 = this.anIntArray48[local43];
							local57 = arg0.method470();
							local147 = arg0.method470();
							local159 = arg0.method470();
							local173 = arg0.method470();
							@Pc(921) byte local921 = arg0.method469();
							@Pc(924) byte local924 = arg0.method469();
							@Pc(927) byte local927 = arg0.method469();
							@Pc(930) byte local930 = arg0.method469();
							@Pc(936) Class1_Sub1_Sub1_Sub1_Sub2 local936;
							if (local173 == this.anInt255) {
								local936 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
							} else {
								local936 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local173];
							}
							if (local936 != null) {
								@Pc(948) Class9 local948 = Class9.method250(local57);
								@Pc(958) int local958 = this.anIntArrayArrayArray3[this.anInt324][local29][local36];
								@Pc(970) int local970 = this.anIntArrayArrayArray3[this.anInt324][local29 + 1][local36];
								@Pc(984) int local984 = this.anIntArrayArrayArray3[this.anInt324][local29 + 1][local36 + 1];
								@Pc(996) int local996 = this.anIntArrayArrayArray3[this.anInt324][local29][local36 + 1];
								@Pc(1006) Class1_Sub1_Sub1_Sub5 local1006 = local948.method256(local43, local47, local958, local970, local984, local996, -1);
								if (local1006 != null) {
									this.method139(0, 0, local159 + 1, local147 + 1, local52, -1, local36, this.anInt324, local29);
									local936.anInt182 = local147 + anInt363;
									local936.anInt183 = local159 + anInt363;
									local936.aClass1_Sub1_Sub1_Sub5_1 = local1006;
									@Pc(1041) int local1041 = local948.anInt517;
									@Pc(1044) int local1044 = local948.anInt518;
									if (local47 == 1 || local47 == 3) {
										local1041 = local948.anInt518;
										local1044 = local948.anInt517;
									}
									local936.anInt184 = local29 * 128 + local1041 * 64;
									local936.anInt186 = local36 * 128 + local1044 * 64;
									local936.anInt185 = this.method194(this.anInt324, local936.anInt186, local936.anInt184);
									@Pc(1090) byte local1090;
									if (local921 > local927) {
										local1090 = local921;
										local921 = local927;
										local927 = local1090;
									}
									if (local924 > local930) {
										local1090 = local924;
										local924 = local930;
										local930 = local1090;
									}
									local936.anInt187 = local29 + local921;
									local936.anInt189 = local29 + local927;
									local936.anInt188 = local36 + local924;
									local936.anInt190 = local36 + local930;
								}
							}
						}
						if (arg1 == 246) {
							local20 = arg0.method468();
							local29 = this.anInt314 + (local20 >> 4 & 0x7);
							local36 = this.anInt315 + (local20 & 0x7);
							local39 = arg0.method470();
							local43 = arg0.method470();
							local47 = arg0.method470();
							if (local29 >= 0 && local36 >= 0 && local29 < 104 && local36 < 104) {
								@Pc(1174) Class31 local1174 = this.aClass31ArrayArrayArray1[this.anInt324][local29][local36];
								if (local1174 != null) {
									for (@Pc(1180) Class1_Sub1_Sub1_Sub3 local1180 = (Class1_Sub1_Sub1_Sub3) local1174.method498(); local1180 != null; local1180 = (Class1_Sub1_Sub1_Sub3) local1174.method500()) {
										if (local1180.anInt483 == (local39 & 0x7FFF) && local1180.anInt484 == local43) {
											local1180.anInt484 = local47;
											break;
										}
									}
									this.method204(local29, local36);
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1210) RuntimeException local1210) {
			signlink.reporterror("41038, " + arg0 + ", " + arg1 + ", " + 37157 + ", " + local1210.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method85() {
		try {
			if (!this.aBoolean65 && !this.aBoolean41 && !this.aBoolean73) {
				anInt363++;
				if (this.aBoolean72) {
					this.method166();
				} else {
					this.method165();
				}
				this.method124();
				this.aBoolean72 &= true;
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("66594, " + true + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(Z)V")
	private void method222() {
		try {
			if (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 >> 7 == this.anInt325 && aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 >> 7 == this.anInt326) {
				this.anInt325 = 0;
			}
			for (@Pc(20) int local20 = -1; local20 < this.anInt386; local20++) {
				@Pc(27) Class1_Sub1_Sub1_Sub1_Sub2 local27;
				@Pc(32) int local32;
				if (local20 == -1) {
					local27 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
					local32 = this.anInt385 << 14;
				} else {
					local27 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray73[local20]];
					local32 = this.anIntArray73[local20] << 14;
				}
				if (local27 != null && local27.method44()) {
					local27.aBoolean22 = false;
					if ((aBoolean47 && this.anInt386 > 50 || this.anInt386 > 200) && local20 != -1 && local27.anInt150 == local27.anInt132) {
						local27.aBoolean22 = true;
					}
					@Pc(84) int local84 = local27.anInt128 >> 7;
					@Pc(89) int local89 = local27.anInt129 >> 7;
					if (local84 >= 0 && local84 < 104 && local89 >= 0 && local89 < 104) {
						if (local27.aClass1_Sub1_Sub1_Sub5_1 == null || anInt363 < local27.anInt182 || anInt363 >= local27.anInt183) {
							if ((local27.anInt128 & 0x7F) == 64 && (local27.anInt129 & 0x7F) == 64) {
								if (this.anIntArrayArray5[local84][local89] == this.anInt368) {
									continue;
								}
								this.anIntArrayArray5[local84][local89] = this.anInt368;
							}
							local27.anInt181 = this.method194(this.anInt324, local27.anInt129, local27.anInt128);
							this.aClass37_1.method561(local27.aBoolean20, local32, local27.anInt181, 60, this.anInt324, local27.anInt130, local27, local27.anInt128, local27.anInt129);
						} else {
							local27.aBoolean22 = false;
							local27.anInt181 = this.method194(this.anInt324, local27.anInt129, local27.anInt128);
							this.aClass37_1.method562(this.anInt324, local27.anInt188, local32, local27.anInt130, local27.anInt128, local27.anInt187, local27.anInt189, local27.anInt190, local27, local27.anInt129, local27.anInt181);
						}
					}
				}
			}
			this.aBoolean72 &= true;
		} catch (@Pc(225) RuntimeException local225) {
			signlink.reporterror("23649, " + true + ", " + local225.toString());
			throw new RuntimeException();
		}
	}
}
