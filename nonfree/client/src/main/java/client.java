import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
	private static int anInt203;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Z")
	private static boolean aBoolean55;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "I")
	private static int anInt223;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
	private static int anInt225;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "Lclient!ab;")
	public static Class1_Sub1_Sub1_Sub1_Sub1 aClass1_Sub1_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "I")
	private static int anInt250;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
	private static int anInt251;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "I")
	private static int anInt253;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
	private static int anInt259;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
	private static int anInt266;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "Z")
	private static boolean aBoolean73;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "I")
	private static int anInt303;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
	private static int anInt312;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
	public static int anInt315;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "Z")
	private static boolean aBoolean77;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private static int anInt319;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
	private static int anInt320;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "I")
	private static int anInt334;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
	private static int anInt340;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
	private static int anInt351;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "I")
	private static int anInt370;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "Z")
	private static boolean aBoolean90;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
	public static int anInt375;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
	private static int anInt381;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "I")
	private static int anInt401;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "[I")
	public static final int[] anIntArray32 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
	private static int anInt244 = 946;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "Ljava/lang/String;")
	private static String aString9 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "[I")
	private static int[] anIntArray59 = new int[99];

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "I")
	private static int anInt314;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "Z")
	private static boolean aBoolean76;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "[I")
	private static int[] anIntArray75;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "[[I")
	public static final int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "I")
	private int anInt192;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "I")
	private int anInt194;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "I")
	private int anInt195;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_1;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_2;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "I")
	private int anInt196;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
	private int anInt198;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
	private int anInt199;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	private int anInt200;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
	private int anInt201;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Ljava/lang/String;")
	private String aString4;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "I")
	private int anInt202;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "[I")
	private int[] anIntArray34;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "[I")
	private int[] anIntArray35;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	private int anInt204;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	private int anInt205;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	private int anInt206;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
	private int anInt207;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	private int anInt208;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
	private int anInt209;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	private int anInt210;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	private int anInt212;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
	private int anInt213;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	private int anInt214;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private int anInt215;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
	private int anInt216;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
	private int anInt217;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
	private int anInt218;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "Ljava/lang/String;")
	private String aString5;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
	private int anInt219;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
	private int anInt220;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
	private int anInt221;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private int anInt222;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "[I")
	private int[] anIntArray40;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "[I")
	private int[] anIntArray41;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "[I")
	private int[] anIntArray42;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
	private int anInt224;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "I")
	private int anInt227;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "I")
	private int anInt228;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "I")
	private int anInt229;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "I")
	private int anInt230;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
	private int anInt231;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "I")
	private int anInt233;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
	private int anInt234;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
	private int anInt235;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_6;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_7;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_8;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
	private int anInt238;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "I")
	private int anInt240;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "Lclient!r;")
	private Class37 aClass37_1;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
	private int anInt241;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
	private int anInt242;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "I")
	private int anInt243;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
	private int anInt247;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
	private int anInt248;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
	private int anInt249;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "[I")
	private int[] anIntArray54;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "[I")
	private int[] anIntArray55;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "[I")
	private int[] anIntArray56;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "[I")
	private int[] anIntArray57;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
	private int anInt254;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "I")
	private int anInt255;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
	private int anInt256;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
	private int anInt257;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
	private int anInt258;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_9;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_10;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "Lclient!qb;")
	private Class35 aClass35_3;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "Lclient!qb;")
	private Class35 aClass35_4;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "Lclient!qb;")
	private Class35 aClass35_5;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "Lclient!qb;")
	private Class35 aClass35_6;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "I")
	private int anInt260;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "I")
	private int anInt261;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "I")
	private int anInt262;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "I")
	private int anInt263;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "I")
	private int anInt264;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
	private int anInt265;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "[I")
	private int[] anIntArray60;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "[I")
	private int[] anIntArray61;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
	private int anInt267;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
	private int anInt268;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
	private int anInt269;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "I")
	private int anInt270;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
	private int anInt271;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "I")
	private int anInt272;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
	private int anInt274;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "I")
	private int anInt276;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
	private int anInt277;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "I")
	private int anInt278;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "I")
	private int anInt279;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
	private int anInt280;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
	private int anInt282;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_1;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_2;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "I")
	private int anInt283;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
	private int anInt284;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
	private int anInt285;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
	private int anInt286;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
	private int anInt290;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "I")
	private int anInt291;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
	private int anInt292;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "Lclient!qb;")
	private Class35 aClass35_7;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "Lclient!qb;")
	private Class35 aClass35_8;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "Lclient!qb;")
	private Class35 aClass35_9;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "Lclient!qb;")
	private Class35 aClass35_10;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "Lclient!qb;")
	private Class35 aClass35_11;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "Lclient!qb;")
	private Class35 aClass35_12;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "Lclient!qb;")
	private Class35 aClass35_13;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "Lclient!qb;")
	private Class35 aClass35_14;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "Lclient!qb;")
	private Class35 aClass35_15;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
	private int anInt293;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "Lclient!fc;")
	private Class11 aClass11_1;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private int anInt294;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_6;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private int anInt298;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
	private int anInt299;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private int anInt300;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private int anInt301;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "I")
	private int anInt302;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "I")
	private int anInt305;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
	private int anInt306;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
	private int anInt307;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "I")
	private int anInt308;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "I")
	private int anInt309;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
	private int anInt310;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
	private int anInt311;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "I")
	private int anInt313;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
	private int anInt317;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "Lclient!wb;")
	private Class46 aClass46_1;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
	private int anInt321;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "I")
	private int anInt324;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
	private int anInt326;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
	private int anInt329;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
	private int anInt330;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
	private int anInt331;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
	private int anInt332;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
	private int anInt333;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
	private int anInt335;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "I")
	private int anInt336;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
	private int anInt337;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "I")
	private int anInt338;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
	private int anInt339;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "I")
	private int anInt341;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
	private int anInt342;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "I")
	private int anInt343;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
	private int anInt344;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
	private int anInt346;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
	private int anInt348;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
	private int anInt349;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_7;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_8;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
	private int anInt352;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "I")
	private int anInt353;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "[[B")
	private byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "I")
	private int anInt355;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "I")
	private int anInt356;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_9;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_10;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_11;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_12;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "I")
	private int anInt357;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "I")
	private int anInt358;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "I")
	private int anInt359;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_13;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "Lclient!qb;")
	private Class35 aClass35_16;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "Lclient!qb;")
	private Class35 aClass35_17;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "Lclient!qb;")
	private Class35 aClass35_18;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
	private int anInt360;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
	private int anInt361;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
	private int anInt362;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_11;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_12;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_13;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "Lclient!e;")
	private Class8 aClass8_1;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "Lclient!qb;")
	private Class35 aClass35_19;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "Lclient!qb;")
	private Class35 aClass35_20;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "Lclient!qb;")
	private Class35 aClass35_21;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "Lclient!qb;")
	private Class35 aClass35_22;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "Lclient!qb;")
	private Class35 aClass35_23;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "Lclient!qb;")
	private Class35 aClass35_24;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "Lclient!qb;")
	private Class35 aClass35_25;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "Lclient!qb;")
	private Class35 aClass35_26;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "Lclient!qb;")
	private Class35 aClass35_27;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "Lclient!ub;")
	private Class44_Sub1 aClass44_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "J")
	private long aLong16;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "I")
	private int anInt365;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "I")
	private int anInt366;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "I")
	private int anInt368;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_14;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_15;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_16;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_17;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_18;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
	private int anInt373;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private int anInt374;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "Ljava/lang/String;")
	private String aString16;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
	private int anInt376;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "I")
	private int anInt377;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "Ljava/lang/String;")
	private String aString17;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
	private int anInt378;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
	private int anInt379;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_19;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_20;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
	private int anInt382;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "I")
	private int anInt383;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
	private int anInt385;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "J")
	private long aLong17;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "Lclient!xb;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private int anInt386;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "[I")
	private int[] anIntArray86;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "[I")
	private int[] anIntArray87;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "[I")
	private int[] anIntArray88;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
	private int anInt390;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
	private int anInt391;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
	private int anInt392;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "I")
	private int anInt393;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "I")
	private int anInt394;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "I")
	private int anInt395;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "I")
	private int anInt396;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "I")
	private int anInt397;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
	private int anInt398;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array4;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "I")
	private int anInt399;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "I")
	private int anInt400;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "[I")
	private int[] anIntArray31 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "M", descriptor = "I")
	private int anInt193 = -1;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "[J")
	private long[] aLongArray3 = new long[200];

	@OriginalMember(owner = "client!client", name = "W", descriptor = "I")
	private int anInt197 = -1;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "[I")
	private final int[] anIntArray33 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "[[I")
	private int[][] anIntArrayArray3 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "B")
	private byte aByte8 = 2;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "Z")
	private boolean aBoolean54 = false;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
	private int anInt211 = 128;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "[I")
	private int[] anIntArray36 = new int[256];

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "Z")
	private boolean aBoolean56 = false;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "[I")
	private int[] anIntArray37 = new int[Class30.anInt785];

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "Z")
	private boolean aBoolean57 = false;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "Z")
	private boolean aBoolean58 = false;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "Lclient!ob;")
	private Class29 aClass29_1 = new Class29((byte) 5);

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "Z")
	private boolean aBoolean59 = false;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "[I")
	private int[] anIntArray38 = new int[100];

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray1 = new String[100];

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray2 = new String[100];

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "Z")
	private boolean aBoolean61 = false;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "[I")
	private int[] anIntArray39 = new int[33];

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "[Lclient!jc;")
	private Class19[] aClass19Array1 = new Class19[4];

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "Z")
	private boolean aBoolean62 = true;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt226 = 862;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "[I")
	private int[] anIntArray43 = new int[50];

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "Z")
	private boolean aBoolean63 = true;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray3 = new String[200];

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "[I")
	private int[] anIntArray44 = new int[Class30.anInt785];

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "Z")
	private boolean aBoolean64 = true;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
	private int anInt232 = 5;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "Ljava/lang/String;")
	private String aString6 = "";

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "Ljava/lang/String;")
	private String aString7 = "";

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "I")
	private int anInt236 = 3353893;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
	private int anInt237 = -217;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "[I")
	private int[] anIntArray45 = new int[151];

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "[I")
	private int[] anIntArray46 = new int[Class30.anInt785];

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "[I")
	private int[] anIntArray47 = new int[50];

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
	private int anInt239 = 797;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "Lclient!ob;")
	private Class29 aClass29_2 = new Class29((byte) 5);

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "Ljava/lang/String;")
	private String aString8 = "";

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
	private int anInt245 = 4697;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "Z")
	private boolean aBoolean65 = true;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "I")
	private int anInt246 = -1;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_2 = Class1_Sub1_Sub3.method460();

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "[I")
	private int[] anIntArray48 = new int[200];

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "Z")
	private boolean aBoolean66 = false;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "[I")
	private int[] anIntArray49 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "[I")
	private int[] anIntArray50 = new int[4000];

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "[I")
	private int[] anIntArray51 = new int[2000];

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "Z")
	private boolean aBoolean68 = false;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "[I")
	private int[] anIntArray52 = new int[151];

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "[I")
	private int[] anIntArray53 = new int[7];

	@OriginalMember(owner = "client!client", name = "id", descriptor = "B")
	private byte aByte9 = 5;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
	private int anInt252 = 1016;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "[[[Lclient!ob;")
	private Class29[][][] aClass29ArrayArrayArray1 = new Class29[4][104][104];

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "[I")
	private int[] anIntArray58 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "td", descriptor = "Z")
	private boolean aBoolean69 = false;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray4 = new String[5];

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "[Z")
	private boolean[] aBooleanArray3 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "[J")
	private long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array3 = new Class1_Sub1_Sub2_Sub2[1000];

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "Z")
	private boolean aBoolean70 = false;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "[[I")
	private int[][] anIntArrayArray4 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "Z")
	private boolean aBoolean71 = false;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "[Lclient!vb;")
	public Class45[] aClass45Array1 = new Class45[5];

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_3 = Class1_Sub1_Sub3.method460();

	@OriginalMember(owner = "client!client", name = "he", descriptor = "I")
	private int anInt275 = 2;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "[I")
	private int[] anIntArray62 = new int[5];

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private int anInt281 = 475;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "[I")
	private int[] anIntArray63 = new int[5];

	@OriginalMember(owner = "client!client", name = "re", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array4 = new Class1_Sub1_Sub2_Sub2[100];

	@OriginalMember(owner = "client!client", name = "se", descriptor = "B")
	private byte aByte10 = -25;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
	private int anInt287 = -1;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "I")
	private int anInt288 = -1;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "I")
	private final int anInt289 = 100;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "[I")
	private int[] anIntArray64 = new int[100];

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "Z")
	private boolean aBoolean72 = false;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "[I")
	private int[] anIntArray65 = new int[5];

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "Ljava/lang/String;")
	private String aString10 = "";

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
	private int anInt295 = 1;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
	private int anInt296 = -29945;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "I")
	private int anInt297 = 100;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "Z")
	private boolean aBoolean74 = false;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "[I")
	private int[] anIntArray66 = new int[33];

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "Ljava/lang/String;")
	private String aString11 = "";

	@OriginalMember(owner = "client!client", name = "of", descriptor = "I")
	private int anInt304 = 539;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "[I")
	private int[] anIntArray67 = new int[1000];

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "Z")
	private boolean aBoolean75 = false;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "I")
	private int anInt316 = -1;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "I")
	private int anInt318 = 50;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "[I")
	private int[] anIntArray68 = new int[this.anInt318];

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "[I")
	private int[] anIntArray69 = new int[this.anInt318];

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "[I")
	private int[] anIntArray70 = new int[this.anInt318];

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "[I")
	private int[] anIntArray71 = new int[this.anInt318];

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "[I")
	private int[] anIntArray72 = new int[this.anInt318];

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "[I")
	private int[] anIntArray73 = new int[this.anInt318];

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "[I")
	private int[] anIntArray74 = new int[this.anInt318];

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray5 = new String[this.anInt318];

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "Lclient!ob;")
	private Class29 aClass29_3 = new Class29((byte) 5);

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private int anInt322 = -1;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "I")
	private int anInt323 = 3;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "I")
	private int anInt325 = -1;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "B")
	private byte aByte11 = 6;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "[B")
	private byte[] aByteArray2 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
	private int anInt327 = -1;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
	private int anInt328 = -1;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "B")
	private byte aByte12 = -50;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray6 = new String[500];

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "Z")
	private boolean aBoolean78 = false;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "[I")
	private int[] anIntArray76 = new int[2000];

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "Z")
	private boolean aBoolean79 = false;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "Z")
	public boolean aBoolean80 = false;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "I")
	private int anInt345 = 604;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "Z")
	private boolean aBoolean81 = false;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "Ljava/lang/String;")
	private String aString12 = "";

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "Ljava/lang/String;")
	private String aString13 = "";

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private int anInt347 = 2301979;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "Z")
	private boolean aBoolean82 = false;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
	private int anInt350 = 78;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "Z")
	private boolean aBoolean83 = false;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array5 = new Class1_Sub1_Sub2_Sub2[8];

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "B")
	private byte aByte13 = -75;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array6 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "I")
	private int anInt354 = -1;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_4 = Class1_Sub1_Sub3.method460();

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "Z")
	private boolean aBoolean84 = true;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array7 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "Z")
	private boolean aBoolean86 = false;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "[Lclient!z;")
	private Class1_Sub1_Sub1_Sub1_Sub2[] aClass1_Sub1_Sub1_Sub1_Sub2Array1 = new Class1_Sub1_Sub1_Sub1_Sub2[16384];

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "[I")
	private int[] anIntArray77 = new int[16384];

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "Ljava/lang/String;")
	private String aString14 = "";

	@OriginalMember(owner = "client!client", name = "th", descriptor = "[I")
	private int[] anIntArray78 = new int[9];

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "Z")
	private boolean aBoolean87 = false;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "[I")
	private int[] anIntArray79 = new int[500];

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "[I")
	private int[] anIntArray80 = new int[500];

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "[I")
	private int[] anIntArray81 = new int[500];

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "[I")
	private int[] anIntArray82 = new int[500];

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "Z")
	private boolean aBoolean88 = true;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "I")
	private int anInt363 = 2;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "I")
	private int anInt364 = -1;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array1 = new Class1_Sub1_Sub2_Sub3[100];

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "[Z")
	private boolean[] aBooleanArray4 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
	private int anInt367 = 7759444;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
	private int anInt369 = 1;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "Z")
	private boolean aBoolean89 = false;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
	private int anInt371 = -1;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
	private int anInt372 = 5063219;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "Ljava/lang/String;")
	private String aString15 = "";

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "[I")
	private int[] anIntArray83 = new int[1000];

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "[I")
	private int[] anIntArray84 = new int[1000];

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "Lclient!d;")
	private Class6 aClass6_1 = new Class6();

	@OriginalMember(owner = "client!client", name = "si", descriptor = "Z")
	private boolean aBoolean91 = false;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "B")
	private byte aByte14 = 5;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "Z")
	private boolean aBoolean92 = true;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "[I")
	private int[] anIntArray85 = new int[5];

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array2 = new Class1_Sub1_Sub2_Sub3[13];

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "Z")
	private boolean aBoolean93 = false;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "[[I")
	private int[][] anIntArrayArray6 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "Z")
	private boolean aBoolean94 = false;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "I")
	private int anInt380 = 978;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
	private int anInt384 = 2;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array3 = new Class1_Sub1_Sub2_Sub3[2];

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
	private int anInt387 = -1;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
	private int anInt388 = 2048;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "I")
	private int anInt389 = 2047;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "[Lclient!ab;")
	private Class1_Sub1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1_Sub1Array1 = new Class1_Sub1_Sub1_Sub1_Sub1[this.anInt388];

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "[I")
	private int[] anIntArray89 = new int[this.anInt388];

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "[I")
	private int[] anIntArray90 = new int[this.anInt388];

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "[Lclient!lb;")
	private Class1_Sub1_Sub3[] aClass1_Sub1_Sub3Array1 = new Class1_Sub1_Sub3[this.anInt388];

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "[I")
	private int[] anIntArray91 = new int[5];

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "Z")
	private boolean aBoolean95 = false;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "Z")
	private boolean aBoolean96 = false;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "Z")
	private boolean aBoolean97 = false;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "[I")
	private int[] anIntArray92 = new int[50];

	static {
		@Pc(80) int local80 = 0;
		@Pc(82) int local82;
		for (local82 = 0; local82 < 99; local82++) {
			@Pc(87) int local87 = local82 + 1;
			@Pc(100) int local100 = (int) ((double) local87 + Math.pow(2.0D, (double) local87 / 7.0D) * 300.0D);
			local80 += local100;
			anIntArray59[local82] = local80 / 4;
		}
		anInt314 = 10;
		aBoolean76 = true;
		anIntArray75 = new int[32];
		local80 = 2;
		for (local82 = 0; local82 < 32; local82++) {
			anIntArray75[local82] = local80 - 1;
			local80 += local80;
		}
		anIntArrayArray5 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		aBoolean85 = true;
		aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private static void method106() {
		try {
			Class37.aBoolean230 = true;
			Class1_Sub1_Sub2_Sub1.aBoolean164 = true;
			aBoolean77 = true;
			Class4.aBoolean42 = true;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("85600, " + -794 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)Ljava/lang/String;")
	private static String method109(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) String local4 = String.valueOf(arg0);
			for (@Pc(22) int local22 = local4.length() - 3; local22 > 0; local22 -= 3) {
				local4 = local4.substring(0, local22) + "," + local4.substring(local22);
			}
			if (local4.length() > 8) {
				local4 = "@gre@" + local4.substring(0, local4.length() - 8) + " million @whi@(" + local4 + ")";
			} else if (local4.length() > 4) {
				local4 = "@cya@" + local4.substring(0, local4.length() - 4) + "K @whi@(" + local4 + ")";
			}
			return " " + local4;
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("88591, " + 1 + ", " + arg0 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private static void method133() {
		try {
			Class37.aBoolean230 = false;
			Class1_Sub1_Sub2_Sub1.aBoolean164 = false;
			aBoolean77 = false;
			Class4.aBoolean42 = false;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("36318, " + 215 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIB)Ljava/lang/String;")
	private static String method142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			if (arg2 != -75) {
				throw new NullPointerException();
			}
			@Pc(10) int local10 = arg1 - arg0;
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
			signlink.reporterror("46979, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(II)Ljava/lang/String;")
	private static String method168(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("24771, " + 3 + ", " + arg0 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 270);
			if (arg0.length == 5) {
				anInt314 = Integer.parseInt(arg0[0]);
				anInt315 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method106();
				} else if (arg0[2].equals("highmem")) {
					method133();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean76 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean76 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt913 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method83();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILclient!d;)V")
	private void method96(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class6 arg3) {
		try {
			if (arg3.anInt408 == 0 && arg3.anIntArray97 != null && (!arg3.aBoolean100 || this.anInt292 == arg3.anInt406 || this.anInt399 == arg3.anInt406 || this.anInt302 == arg3.anInt406)) {
				@Pc(29) int local29 = Class1_Sub1_Sub2.anInt674;
				@Pc(31) int local31 = Class1_Sub1_Sub2.anInt672;
				@Pc(33) int local33 = Class1_Sub1_Sub2.anInt675;
				@Pc(35) int local35 = Class1_Sub1_Sub2.anInt673;
				Class1_Sub1_Sub2.method432(arg1, arg1 + arg3.anInt411, arg2, arg2 + arg3.anInt412);
				@Pc(51) int local51 = arg3.anIntArray97.length;
				this.anInt204 += 0;
				for (@Pc(59) int local59 = 0; local59 < local51; local59++) {
					@Pc(68) int local68 = arg3.anIntArray98[local59] + arg1;
					@Pc(77) int local77 = arg3.anIntArray99[local59] + arg2 - arg0;
					@Pc(84) Class6 local84 = Class6.aClass6Array1[arg3.anIntArray97[local59]];
					@Pc(89) int local89 = local68 + local84.anInt413;
					@Pc(94) int local94 = local77 + local84.anInt414;
					if (local84.anInt410 > 0) {
						this.method171(aBoolean90, local84);
					}
					if (local84.anInt408 == 0) {
						if (local84.anInt417 > local84.anInt416 - local84.anInt412) {
							local84.anInt417 = local84.anInt416 - local84.anInt412;
						}
						if (local84.anInt417 < 0) {
							local84.anInt417 = 0;
						}
						this.method96(local84.anInt417, local89, local94, local84);
						if (local84.anInt416 > local84.anInt412) {
							this.method99(local84.anInt417, 161, local89 + local84.anInt411, local84.anInt412, local84.anInt416, local94);
						}
					} else if (local84.anInt408 != 1) {
						@Pc(166) int local166;
						@Pc(170) int local170;
						@Pc(181) int local181;
						@Pc(216) int local216;
						@Pc(223) int local223;
						@Pc(164) int local164;
						@Pc(214) int local214;
						if (local84.anInt408 == 2) {
							local164 = 0;
							for (local166 = 0; local166 < local84.anInt412; local166++) {
								for (local170 = 0; local170 < local84.anInt411; local170++) {
									local181 = local89 + local170 * (local84.anInt419 + 32);
									@Pc(190) int local190 = local94 + local166 * (local84.anInt420 + 32);
									if (local164 < 20) {
										local181 += local84.anIntArray100[local164];
										local190 += local84.anIntArray101[local164];
									}
									if (local84.anIntArray93[local164] > 0) {
										local214 = 0;
										local216 = 0;
										local223 = local84.anIntArray93[local164] - 1;
										if (local181 > Class1_Sub1_Sub2.anInt674 - 32 && local181 < Class1_Sub1_Sub2.anInt675 && local190 > Class1_Sub1_Sub2.anInt672 - 32 && local190 < Class1_Sub1_Sub2.anInt673 || this.anInt394 != 0 && this.anInt393 == local164) {
											@Pc(248) int local248 = 0;
											if (this.anInt215 == 1 && this.anInt216 == local164 && this.anInt217 == local84.anInt406) {
												local248 = 16777215;
											}
											@Pc(272) Class1_Sub1_Sub2_Sub2 local272 = Class15.method363(local223, local248, local84.anIntArray94[local164]);
											if (local272 != null) {
												@Pc(351) int local351;
												if (this.anInt394 != 0 && this.anInt393 == local164 && this.anInt392 == local84.anInt406) {
													local214 = super.anInt182 - this.anInt395;
													local216 = super.anInt183 - this.anInt396;
													if (local214 < 5 && local214 > -5) {
														local214 = 0;
													}
													if (local216 < 5 && local216 > -5) {
														local216 = 0;
													}
													if (this.anInt379 < 5) {
														local214 = 0;
														local216 = 0;
													}
													local272.method389(local181 + local214, local190 + local216);
													if (local190 + local216 < Class1_Sub1_Sub2.anInt672 && arg3.anInt417 > 0) {
														local351 = this.anInt196 * (Class1_Sub1_Sub2.anInt672 - local190 - local216) / 3;
														if (local351 > this.anInt196 * 10) {
															local351 = this.anInt196 * 10;
														}
														if (local351 > arg3.anInt417) {
															local351 = arg3.anInt417;
														}
														arg3.anInt417 -= local351;
														this.anInt396 += local351;
													}
													if (local190 + local216 + 32 > Class1_Sub1_Sub2.anInt673 && arg3.anInt417 < arg3.anInt416 - arg3.anInt412) {
														local351 = this.anInt196 * (local190 + local216 + 32 - Class1_Sub1_Sub2.anInt673) / 3;
														if (local351 > this.anInt196 * 10) {
															local351 = this.anInt196 * 10;
														}
														if (local351 > arg3.anInt416 - arg3.anInt412 - arg3.anInt417) {
															local351 = arg3.anInt416 - arg3.anInt412 - arg3.anInt417;
														}
														arg3.anInt417 += local351;
														this.anInt396 -= local351;
													}
												} else if (this.anInt344 != 0 && this.anInt343 == local164 && this.anInt342 == local84.anInt406) {
													local272.method389(local181, local190);
												} else {
													local272.method387(local190, local181);
												}
												if (local272.anInt629 == 33 || local84.anIntArray94[local164] != 1) {
													local351 = local84.anIntArray94[local164];
													this.aClass1_Sub1_Sub2_Sub4_1.method445(local181 + local214 + 1, 474, 0, method168(local351), local190 + local216 + 10);
													this.aClass1_Sub1_Sub2_Sub4_1.method445(local181 + local214, 474, 16776960, method168(local351), local190 + local216 + 9);
												}
											}
										}
									} else if (local84.aClass1_Sub1_Sub2_Sub2Array8 != null && local164 < 20) {
										@Pc(540) Class1_Sub1_Sub2_Sub2 local540 = local84.aClass1_Sub1_Sub2_Sub2Array8[local164];
										if (local540 != null) {
											local540.method387(local190, local181);
										}
									}
									local164++;
								}
							}
						} else if (local84.anInt408 == 3) {
							@Pc(566) boolean local566 = false;
							if (this.anInt302 == local84.anInt406 || this.anInt399 == local84.anInt406 || this.anInt292 == local84.anInt406) {
								local566 = true;
							}
							if (this.method112(local84)) {
								local164 = local84.anInt422;
								if (local566 && local84.anInt424 != 0) {
									local164 = local84.anInt424;
								}
							} else {
								local164 = local84.anInt421;
								if (local566 && local84.anInt423 != 0) {
									local164 = local84.anInt423;
								}
							}
							if (local84.aByte15 == 0) {
								if (local84.aBoolean106) {
									Class1_Sub1_Sub2.method435(local164, local84.anInt411, local94, local84.anInt412, local89);
								} else {
									Class1_Sub1_Sub2.method436(local84.anInt411, local84.anInt412, local89, local94, local164);
								}
							} else if (local84.aBoolean106) {
								Class1_Sub1_Sub2.method434(local84.anInt411, local164, 256 - (local84.aByte15 & 0xFF), local89, local94, local84.anInt412);
							} else {
								Class1_Sub1_Sub2.method437(256 - (local84.aByte15 & 0xFF), local89, local84.anInt412, local164, local94, local84.anInt411);
							}
						} else {
							@Pc(684) Class1_Sub1_Sub2_Sub4 local684;
							if (local84.anInt408 == 4) {
								local684 = local84.aClass1_Sub1_Sub2_Sub4_5;
								@Pc(687) String local687 = local84.aString18;
								@Pc(689) boolean local689 = false;
								if (this.anInt302 == local84.anInt406 || this.anInt399 == local84.anInt406 || this.anInt292 == local84.anInt406) {
									local689 = true;
								}
								if (this.method112(local84)) {
									local166 = local84.anInt422;
									if (local689 && local84.anInt424 != 0) {
										local166 = local84.anInt424;
									}
									if (local84.aString19.length() > 0) {
										local687 = local84.aString19;
									}
								} else {
									local166 = local84.anInt421;
									if (local689 && local84.anInt423 != 0) {
										local166 = local84.anInt423;
									}
								}
								if (local84.anInt409 == 6 && this.aBoolean57) {
									local687 = "Please wait...";
									local166 = local84.anInt421;
								}
								if (Class1_Sub1_Sub2.anInt670 == 479) {
									if (local166 == 16776960) {
										local166 = 255;
									}
									if (local166 == 49152) {
										local166 = 16777215;
									}
								}
								local214 = local94 + local684.anInt682;
								while (local687.length() > 0) {
									if (local687.indexOf("%") != -1) {
										label348: while (true) {
											local216 = local687.indexOf("%1");
											if (local216 == -1) {
												while (true) {
													local216 = local687.indexOf("%2");
													if (local216 == -1) {
														while (true) {
															local216 = local687.indexOf("%3");
															if (local216 == -1) {
																while (true) {
																	local216 = local687.indexOf("%4");
																	if (local216 == -1) {
																		while (true) {
																			local216 = local687.indexOf("%5");
																			if (local216 == -1) {
																				break label348;
																			}
																			local687 = local687.substring(0, local216) + this.method185(this.method149(local84, 4)) + local687.substring(local216 + 2);
																		}
																	}
																	local687 = local687.substring(0, local216) + this.method185(this.method149(local84, 3)) + local687.substring(local216 + 2);
																}
															}
															local687 = local687.substring(0, local216) + this.method185(this.method149(local84, 2)) + local687.substring(local216 + 2);
														}
													}
													local687 = local687.substring(0, local216) + this.method185(this.method149(local84, 1)) + local687.substring(local216 + 2);
												}
											}
											local687 = local687.substring(0, local216) + this.method185(this.method149(local84, 0)) + local687.substring(local216 + 2);
										}
									}
									local216 = local687.indexOf("\\n");
									@Pc(961) String local961;
									if (local216 == -1) {
										local961 = local687;
										local687 = "";
									} else {
										local961 = local687.substring(0, local216);
										local687 = local687.substring(local216 + 2);
									}
									if (local84.aBoolean107) {
										local684.method443(local961, local214, local166, local84.aBoolean108, local89 + local84.anInt411 / 2);
									} else {
										local684.method447(local961, local214, local166, local89, local84.aBoolean108);
									}
									local214 += local684.anInt682;
								}
							} else if (local84.anInt408 == 5) {
								@Pc(1023) Class1_Sub1_Sub2_Sub2 local1023;
								if (this.method112(local84)) {
									local1023 = local84.aClass1_Sub1_Sub2_Sub2_15;
								} else {
									local1023 = local84.aClass1_Sub1_Sub2_Sub2_14;
								}
								if (local1023 != null) {
									local1023.method387(local94, local89);
								}
							} else if (local84.anInt408 == 6) {
								local164 = Class1_Sub1_Sub2_Sub1.anInt570;
								local166 = Class1_Sub1_Sub2_Sub1.anInt571;
								Class1_Sub1_Sub2_Sub1.anInt570 = local89 + local84.anInt411 / 2;
								Class1_Sub1_Sub2_Sub1.anInt571 = local94 + local84.anInt412 / 2;
								local170 = Class1_Sub1_Sub2_Sub1.anIntArray175[local84.anInt432] * local84.anInt431 >> 16;
								local181 = Class1_Sub1_Sub2_Sub1.anIntArray176[local84.anInt432] * local84.anInt431 >> 16;
								@Pc(1084) boolean local1084 = this.method112(local84);
								if (local1084) {
									local214 = local84.anInt430;
								} else {
									local214 = local84.anInt429;
								}
								@Pc(1104) Class1_Sub1_Sub1_Sub5 local1104;
								if (local214 == -1) {
									local1104 = local84.method231(-1, local1084, -1);
								} else {
									@Pc(1110) Class27 local1110 = Class27.aClass27Array1[local214];
									local1104 = local84.method231(local1110.anIntArray222[local84.anInt404], local1084, local1110.anIntArray223[local84.anInt404]);
								}
								if (local1104 != null) {
									local1104.method279(local84.anInt433, 0, local84.anInt432, 0, local170, local181);
								}
								Class1_Sub1_Sub2_Sub1.anInt570 = local164;
								Class1_Sub1_Sub2_Sub1.anInt571 = local166;
							} else if (local84.anInt408 == 7) {
								local684 = local84.aClass1_Sub1_Sub2_Sub4_5;
								local166 = 0;
								for (local170 = 0; local170 < local84.anInt412; local170++) {
									for (local181 = 0; local181 < local84.anInt411; local181++) {
										if (local84.anIntArray93[local166] > 0) {
											@Pc(1174) Class15 local1174 = Class15.method357(local84.anIntArray93[local166] - 1);
											@Pc(1177) String local1177 = local1174.aString25;
											if (local1174.aBoolean171 || local84.anIntArray94[local166] != 1) {
												local1177 = local1177 + " x" + method109(local84.anIntArray94[local166]);
											}
											local216 = local89 + local181 * (local84.anInt419 + 115);
											local223 = local94 + local170 * (local84.anInt420 + 12);
											if (local84.aBoolean107) {
												local684.method443(local1177, local223, local84.anInt421, local84.aBoolean108, local216 + local84.anInt411 / 2);
											} else {
												local684.method447(local1177, local223, local84.anInt421, local216, local84.aBoolean108);
											}
										}
										local166++;
									}
								}
							}
						}
					}
				}
				Class1_Sub1_Sub2.method432(local29, local33, local31, local35);
			}
		} catch (@Pc(1273) RuntimeException local1273) {
			signlink.reporterror("8250, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local1273.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean78) {
			this.method126();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	private void method97(@OriginalArg(0) int arg0) {
		try {
			Class9.aClass40_4.method585();
			Class9.aClass40_5.method585();
			Class13.aClass40_6.method585();
			Class15.aClass40_7.method585();
			Class15.aClass40_8.method585();
			Class1_Sub1_Sub1_Sub1_Sub1.aClass40_1.method585();
			@Pc(15) boolean local15 = false;
			Class33.aClass40_9.method585();
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("29423, " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method98() {
		try {
			if (super.anInt187 == 1) {
				@Pc(20) int local20 = super.anInt188 - 25 - 550;
				@Pc(27) int local27 = super.anInt189 - 5 - 4;
				if (local20 >= 0 && local27 >= 0 && local20 < 146 && local27 < 151) {
					local20 -= 73;
					local27 -= 75;
					@Pc(47) int local47 = this.anInt212 + this.anInt383 & 0x7FF;
					@Pc(51) int local51 = Class1_Sub1_Sub2_Sub1.anIntArray175[local47];
					@Pc(55) int local55 = Class1_Sub1_Sub2_Sub1.anIntArray176[local47];
					@Pc(64) int local64 = local51 * (this.anInt294 + 256) >> 8;
					@Pc(73) int local73 = local55 * (this.anInt294 + 256) >> 8;
					@Pc(83) int local83 = local27 * local64 + local20 * local73 >> 11;
					@Pc(93) int local93 = local27 * local73 - local20 * local64 >> 11;
					@Pc(100) int local100 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt961 + local83 >> 7;
					@Pc(107) int local107 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962 - local93 >> 7;
					@Pc(128) boolean local128 = this.method103(local107, 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], 0, true, local100, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, 0, 0);
					if (local128) {
						this.aClass1_Sub1_Sub3_2.method462(local20);
						this.aClass1_Sub1_Sub3_2.method462(local27);
						this.aClass1_Sub1_Sub3_2.method463(this.anInt212);
						this.aClass1_Sub1_Sub3_2.method462(57);
						this.aClass1_Sub1_Sub3_2.method462(this.anInt383);
						this.aClass1_Sub1_Sub3_2.method462(this.anInt294);
						this.aClass1_Sub1_Sub3_2.method462(89);
						this.aClass1_Sub1_Sub3_2.method463(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt961);
						this.aClass1_Sub1_Sub3_2.method463(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962);
						this.aClass1_Sub1_Sub3_2.method462(this.anInt397);
						this.aClass1_Sub1_Sub3_2.method462(63);
						return;
					}
				}
			}
		} catch (@Pc(182) RuntimeException local182) {
			signlink.reporterror("49216, " + 47692 + ", " + local182.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method99(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			this.aClass1_Sub1_Sub2_Sub3_19.method414(arg5, arg2);
			this.aClass1_Sub1_Sub2_Sub3_20.method414(arg5 + arg3 - 16, arg2);
			Class1_Sub1_Sub2.method435(this.anInt347, 16, arg5 + 16, arg3 - 32, arg2);
			@Pc(35) int local35 = (arg3 - 32) * arg3 / arg4;
			if (local35 < 8) {
				local35 = 8;
			}
			@Pc(52) int local52 = (arg3 - local35 - 32) * arg0 / (arg4 - arg3);
			Class1_Sub1_Sub2.method435(this.anInt372, 16, arg5 + local52 + 16, local35, arg2);
			Class1_Sub1_Sub2.method440(local35, arg5 + local52 + 16, this.aByte8, arg2, this.anInt367);
			Class1_Sub1_Sub2.method440(local35, arg5 + local52 + 16, this.aByte8, arg2 + 1, this.anInt367);
			Class1_Sub1_Sub2.method438(arg2, this.anInt367, arg5 + local52 + 16, 16);
			Class1_Sub1_Sub2.method438(arg2, this.anInt367, arg5 + local52 + 17, 16);
			Class1_Sub1_Sub2.method440(local35, arg5 + local52 + 16, this.aByte8, arg2 + 15, this.anInt236);
			Class1_Sub1_Sub2.method440(local35 - 1, arg5 + 17 + local52, this.aByte8, arg2 + 14, this.anInt236);
			Class1_Sub1_Sub2.method438(arg2, this.anInt236, arg5 + local52 + local35 + 15, 16);
			@Pc(159) boolean local159 = false;
			Class1_Sub1_Sub2.method438(arg2 + 1, this.anInt236, arg5 + local52 + local35 + 14, 15);
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("88921, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIIIII)V")
	private void method100(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(8) int local8 = 2048 - arg3 & 0x7FF;
			@Pc(14) int local14 = 2048 - arg5 & 0x7FF;
			@Pc(16) int local16 = 0;
			@Pc(18) int local18 = 0;
			@Pc(20) int local20 = arg1;
			@Pc(26) int local26;
			@Pc(30) int local30;
			@Pc(40) int local40;
			if (local8 != 0) {
				local26 = Class1_Sub1_Sub1_Sub5.anIntArray150[local8];
				local30 = Class1_Sub1_Sub1_Sub5.anIntArray151[local8];
				local40 = local30 * 0 - arg1 * local26 >> 16;
				local20 = local26 * 0 + arg1 * local30 >> 16;
				local18 = local40;
			}
			if (local14 != 0) {
				local26 = Class1_Sub1_Sub1_Sub5.anIntArray150[local14];
				local30 = Class1_Sub1_Sub1_Sub5.anIntArray151[local14];
				local40 = local20 * local26 + local30 * 0 >> 16;
				local20 = local20 * local30 - local26 * 0 >> 16;
				local16 = local40;
			}
			this.anInt329 = arg0 - local16;
			this.anInt330 = arg4 - local18;
			this.anInt331 = arg2 - local20;
			this.anInt332 = arg3;
			this.anInt333 = arg5;
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("27933, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method101(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean61) {
			if (this.aSocket1 != null) {
				try {
					this.aSocket1.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket1 = null;
			}
			this.aSocket1 = this.method204(43595);
			this.aSocket1.setSoTimeout(10000);
			@Pc(42) InputStream local42 = this.aSocket1.getInputStream();
			@Pc(46) OutputStream local46 = this.aSocket1.getOutputStream();
			local46.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(local42);
		} else if (signlink.mainapp == null) {
			return new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
		} else {
			return signlink.openurl(arg0);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BIZ)Z")
	private boolean method102(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.aBoolean80 &= true;
			return arg0 == null ? true : signlink.wavesave(arg0, arg1);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("18854, " + arg0 + ", " + arg1 + ", " + true + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIZIIIIII)Z")
	private boolean method103(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray4[local7][local11] = 0;
					this.anIntArrayArray3[local7][local11] = 99999999;
				}
			}
			local11 = arg7;
			@Pc(39) int local39 = arg2;
			this.anIntArrayArray4[arg7][arg2] = 99;
			this.anIntArrayArray3[arg7][arg2] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray49[0] = arg7;
			@Pc(66) int local66 = local55 + 1;
			this.anIntArray50[0] = arg2;
			@Pc(70) boolean local70 = false;
			@Pc(74) int local74 = this.anIntArray49.length;
			@Pc(90) int[][] local90 = this.aClass19Array1[this.anInt386].anIntArrayArray18;
			@Pc(201) int local201;
			while (local57 != local66) {
				local11 = this.anIntArray49[local57];
				local39 = this.anIntArray50[local57];
				local57 = (local57 + 1) % local74;
				if (local11 == arg5 && local39 == arg0) {
					local70 = true;
					break;
				}
				if (arg9 != 0) {
					if ((arg9 < 5 || arg9 == 10) && this.aClass19Array1[this.anInt386].method425(local11, arg5, arg3, arg9 - 1, local39, arg0)) {
						local70 = true;
						break;
					}
					if (arg9 < 10 && this.aClass19Array1[this.anInt386].method426(local11, local39, arg3, arg0, arg9 - 1, arg5)) {
						local70 = true;
						break;
					}
				}
				if (arg6 != 0 && arg10 != 0 && this.aClass19Array1[this.anInt386].method427(arg6, local39, arg0, arg5, arg8, local11, arg10)) {
					local70 = true;
					break;
				}
				local201 = this.anIntArrayArray3[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray4[local11 - 1][local39] == 0 && (local90[local11 - 1][local39] & 0x280108) == 0) {
					this.anIntArray49[local66] = local11 - 1;
					this.anIntArray50[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 - 1][local39] = 2;
					this.anIntArrayArray3[local11 - 1][local39] = local201;
				}
				if (local11 < 103 && this.anIntArrayArray4[local11 + 1][local39] == 0 && (local90[local11 + 1][local39] & 0x280180) == 0) {
					this.anIntArray49[local66] = local11 + 1;
					this.anIntArray50[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 + 1][local39] = 8;
					this.anIntArrayArray3[local11 + 1][local39] = local201;
				}
				if (local39 > 0 && this.anIntArrayArray4[local11][local39 - 1] == 0 && (local90[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray49[local66] = local11;
					this.anIntArray50[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11][local39 - 1] = 1;
					this.anIntArrayArray3[local11][local39 - 1] = local201;
				}
				if (local39 < 103 && this.anIntArrayArray4[local11][local39 + 1] == 0 && (local90[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray49[local66] = local11;
					this.anIntArray50[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11][local39 + 1] = 4;
					this.anIntArrayArray3[local11][local39 + 1] = local201;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray4[local11 - 1][local39 - 1] == 0 && (local90[local11 - 1][local39 - 1] & 0x28010E) == 0 && (local90[local11 - 1][local39] & 0x280108) == 0 && (local90[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray49[local66] = local11 - 1;
					this.anIntArray50[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray3[local11 - 1][local39 - 1] = local201;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray4[local11 + 1][local39 - 1] == 0 && (local90[local11 + 1][local39 - 1] & 0x280183) == 0 && (local90[local11 + 1][local39] & 0x280180) == 0 && (local90[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray49[local66] = local11 + 1;
					this.anIntArray50[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray3[local11 + 1][local39 - 1] = local201;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray4[local11 - 1][local39 + 1] == 0 && (local90[local11 - 1][local39 + 1] & 0x280138) == 0 && (local90[local11 - 1][local39] & 0x280108) == 0 && (local90[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray49[local66] = local11 - 1;
					this.anIntArray50[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray3[local11 - 1][local39 + 1] = local201;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray4[local11 + 1][local39 + 1] == 0 && (local90[local11 + 1][local39 + 1] & 0x2801E0) == 0 && (local90[local11 + 1][local39] & 0x280180) == 0 && (local90[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray49[local66] = local11 + 1;
					this.anIntArray50[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray3[local11 + 1][local39 + 1] = local201;
				}
			}
			this.anInt397 = 0;
			@Pc(817) int local817;
			@Pc(823) int local823;
			@Pc(829) int local829;
			if (!local70) {
				if (arg4) {
					local201 = 100;
					for (local817 = 1; local817 < 2; local817++) {
						for (local823 = arg5 - local817; local823 <= arg5 + local817; local823++) {
							for (local829 = arg0 - local817; local829 <= arg0 + local817; local829++) {
								if (local823 >= 0 && local829 >= 0 && local823 < 104 && local829 < 104 && this.anIntArrayArray3[local823][local829] < local201) {
									local201 = this.anIntArrayArray3[local823][local829];
									local11 = local823;
									local39 = local829;
									this.anInt397 = 1;
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
			@Pc(890) byte local890 = 0;
			this.anIntArray49[0] = local11;
			local57 = local890 + 1;
			this.anIntArray50[0] = local39;
			local201 = local817 = this.anIntArrayArray4[local11][local39];
			while (local11 != arg7 || local39 != arg2) {
				if (local201 != local817) {
					local817 = local201;
					this.anIntArray49[local57] = local11;
					this.anIntArray50[local57++] = local39;
				}
				if ((local201 & 0x2) != 0) {
					local11++;
				} else if ((local201 & 0x8) != 0) {
					local11--;
				}
				if ((local201 & 0x1) != 0) {
					local39++;
				} else if ((local201 & 0x4) != 0) {
					local39--;
				}
				local201 = this.anIntArrayArray4[local11][local39];
			}
			if (local57 > 0) {
				local74 = local57;
				if (local57 > 25) {
					local74 = 25;
				}
				local57--;
				local823 = this.anIntArray49[local57];
				local829 = this.anIntArray50[local57];
				if (arg1 == 0) {
					this.aClass1_Sub1_Sub3_2.method461(6);
					this.aClass1_Sub1_Sub3_2.method462(local74 + local74 + 3);
				}
				if (arg1 == 1) {
					this.aClass1_Sub1_Sub3_2.method461(220);
					this.aClass1_Sub1_Sub3_2.method462(local74 + local74 + 3 + 14);
				}
				if (arg1 == 2) {
					this.aClass1_Sub1_Sub3_2.method461(127);
					this.aClass1_Sub1_Sub3_2.method462(local74 + local74 + 3);
				}
				if (super.anIntArray29[5] == 1) {
					this.aClass1_Sub1_Sub3_2.method462(1);
				} else {
					this.aClass1_Sub1_Sub3_2.method462(0);
				}
				this.aClass1_Sub1_Sub3_2.method463(local823 + this.anInt277);
				this.aClass1_Sub1_Sub3_2.method463(local829 + this.anInt278);
				this.anInt358 = this.anIntArray49[0];
				this.anInt359 = this.anIntArray50[0];
				for (@Pc(1078) int local1078 = 1; local1078 < local74; local1078++) {
					local57--;
					this.aClass1_Sub1_Sub3_2.method462(this.anIntArray49[local57] - local823);
					this.aClass1_Sub1_Sub3_2.method462(this.anIntArray50[local57] - local829);
				}
				return true;
			} else if (arg1 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1113) RuntimeException local1113) {
			signlink.reporterror("38671, " + arg0 + ", " + 1 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	private void method104(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 == 5) {
				@Pc(6) boolean local6 = false;
				try {
					if (this.aClass8_1 != null) {
						this.aClass8_1.method245();
					}
				} catch (@Pc(17) Exception local17) {
				}
				this.aClass8_1 = null;
				this.aBoolean80 = false;
				this.anInt258 = 0;
				this.aString6 = "";
				this.aString7 = "";
				this.method97(627);
				this.aClass37_1.method522();
				for (@Pc(41) int local41 = 0; local41 < 4; local41++) {
					this.aClass19Array1[local41].method416();
				}
				System.gc();
				this.method217();
				this.anInt325 = -1;
				this.anInt360 = -1;
				this.anInt335 = 0;
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("66307, " + arg0 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method105() {
		try {
			try {
				@Pc(16) int local16 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt961 + this.anInt362;
				@Pc(22) int local22 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962 + this.anInt274;
				if (this.anInt219 - local16 < -500 || this.anInt219 - local16 > 500 || this.anInt220 - local22 < -500 || this.anInt220 - local22 > 500) {
					this.anInt219 = local16;
					this.anInt220 = local22;
				}
				if (this.anInt219 != local16) {
					this.anInt219 += (local16 - this.anInt219) / 16;
				}
				if (this.anInt220 != local22) {
					this.anInt220 += (local22 - this.anInt220) / 16;
				}
				if (super.anIntArray29[1] == 1) {
					this.anInt213 += (-this.anInt213 - 24) / 2;
				} else if (super.anIntArray29[2] == 1) {
					this.anInt213 += (24 - this.anInt213) / 2;
				} else {
					this.anInt213 /= 2;
				}
				if (super.anIntArray29[3] == 1) {
					this.anInt214 += (12 - this.anInt214) / 2;
				} else if (super.anIntArray29[4] == 1) {
					this.anInt214 += (-this.anInt214 - 12) / 2;
				} else {
					this.anInt214 /= 2;
				}
				this.anInt212 = this.anInt212 + this.anInt213 / 2 & 0x7FF;
				this.anInt211 += this.anInt214 / 2;
				if (this.anInt211 < 128) {
					this.anInt211 = 128;
				}
				if (this.anInt211 > 383) {
					this.anInt211 = 383;
				}
				@Pc(209) int local209 = this.anInt219 >> 7;
				@Pc(214) int local214 = this.anInt220 >> 7;
				@Pc(224) int local224 = this.method199(this.anInt386, this.anInt219, this.anInt220);
				@Pc(226) int local226 = 0;
				@Pc(242) int local242;
				if (local209 > 3 && local214 > 3 && local209 < 100 && local214 < 100) {
					for (local242 = local209 - 4; local242 <= local209 + 4; local242++) {
						for (@Pc(248) int local248 = local214 - 4; local248 <= local214 + 4; local248++) {
							@Pc(253) int local253 = this.anInt386;
							if (local253 < 3 && (this.aByteArrayArrayArray7[1][local242][local248] & 0x2) == 2) {
								local253++;
							}
							@Pc(280) int local280 = local224 - this.anIntArrayArrayArray5[local253][local242][local248];
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
				if (local242 > this.anInt385) {
					this.anInt385 += (local242 - this.anInt385) / 24;
				} else if (local242 < this.anInt385) {
					this.anInt385 += (local242 - this.anInt385) / 80;
				}
			} catch (@Pc(344) Exception local344) {
				signlink.reporterror("glfc_ex " + aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt961 + "," + aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962 + "," + this.anInt219 + "," + this.anInt220 + "," + this.anInt194 + "," + this.anInt195 + "," + this.anInt277 + "," + this.anInt278);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(394) RuntimeException local394) {
			signlink.reporterror("77126, " + true + ", " + local394.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
	private void method107(@OriginalArg(1) boolean arg0) {
		try {
			if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt961 >> 7 == this.anInt358 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962 >> 7 == this.anInt359) {
				this.anInt358 = 0;
				anInt312++;
				if (anInt312 > 122) {
					anInt312 = 0;
					this.aClass1_Sub1_Sub3_2.method461(36);
					this.aClass1_Sub1_Sub3_2.method462(62);
				}
			}
			@Pc(39) int local39 = this.anInt390;
			if (arg0) {
				local39 = 1;
			}
			for (@Pc(45) int local45 = 0; local45 < local39; local45++) {
				@Pc(51) Class1_Sub1_Sub1_Sub1_Sub1 local51;
				@Pc(56) int local56;
				if (arg0) {
					local51 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
					local56 = this.anInt389 << 14;
				} else {
					local51 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray89[local45]];
					local56 = this.anIntArray89[local45] << 14;
				}
				if (local51 != null && local51.method673()) {
					local51.aBoolean31 = false;
					if ((aBoolean77 && this.anInt390 > 50 || this.anInt390 > 200) && !arg0 && local51.anInt981 == local51.anInt965) {
						local51.aBoolean31 = true;
					}
					@Pc(107) int local107 = local51.anInt961 >> 7;
					@Pc(112) int local112 = local51.anInt962 >> 7;
					if (local107 >= 0 && local107 < 104 && local112 >= 0 && local112 < 104) {
						if (local51.aClass1_Sub1_Sub1_Sub5_1 == null || anInt375 < local51.anInt127 || anInt375 >= local51.anInt128) {
							if ((local51.anInt961 & 0x7F) == 64 && (local51.anInt962 & 0x7F) == 64) {
								if (this.anIntArrayArray6[local107][local112] == this.anInt311) {
									continue;
								}
								this.anIntArrayArray6[local107][local112] = this.anInt311;
							}
							local51.anInt126 = this.method199(this.anInt386, local51.anInt961, local51.anInt962);
							this.aClass37_1.method533(local51.anInt963, local51.anInt962, local51.aBoolean260, local51.anInt961, local51.anInt126, local51, this.anInt386, 60, local56);
						} else {
							local51.aBoolean31 = false;
							local51.anInt126 = this.method199(this.anInt386, local51.anInt961, local51.anInt962);
							this.aClass37_1.method534(local51.anInt961, local51.anInt135, local51, local56, local51.anInt962, local51.anInt963, local51.anInt134, local51.anInt126, local51.anInt132, this.anInt386, local51.anInt133);
						}
					}
				}
			}
		} catch (@Pc(247) RuntimeException local247) {
			signlink.reporterror("69528, " + 92 + ", " + arg0 + ", " + local247.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method108() {
		try {
			this.aClass35_3.method516();
			Class1_Sub1_Sub2_Sub1.anIntArray177 = this.anIntArray87;
			this.aClass1_Sub1_Sub2_Sub3_1.method414(0, 0);
			if (this.anInt364 != -1) {
				this.method96(0, 0, 0, Class6.aClass6Array1[this.anInt364]);
			} else if (this.anIntArray58[this.anInt323] != -1) {
				this.method96(0, 0, 0, Class6.aClass6Array1[this.anIntArray58[this.anInt323]]);
			}
			if (this.aBoolean74 && this.anInt261 == 1) {
				this.method221();
			}
			this.aClass35_3.method517(553, 205, super.aGraphics2);
			this.aClass35_5.method516();
			Class1_Sub1_Sub2_Sub1.anIntArray177 = this.anIntArray88;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("63345, " + false + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!lb;II)V")
	private void method110(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			while (true) {
				if (arg0.anInt716 + 10 < arg2 * 8) {
					@Pc(12) int local12 = arg0.method483(11);
					if (local12 != 2047) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local12] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local12] = new Class1_Sub1_Sub1_Sub1_Sub1();
							if (this.aClass1_Sub1_Sub3Array1[local12] != null) {
								this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local12].method39((byte) 1, this.aClass1_Sub1_Sub3Array1[local12]);
							}
						}
						this.anIntArray89[this.anInt390++] = local12;
						@Pc(58) Class1_Sub1_Sub1_Sub1_Sub1 local58 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local12];
						local58.anInt1001 = anInt375;
						@Pc(66) int local66 = arg0.method483(5);
						if (local66 > 15) {
							local66 -= 32;
						}
						@Pc(75) int local75 = arg0.method483(5);
						if (local75 > 15) {
							local75 -= 32;
						}
						@Pc(84) int local84 = arg0.method483(1);
						local58.method670(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0] + local66, local84 == 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0] + local75);
						@Pc(110) int local110 = arg0.method483(1);
						if (local110 == 1) {
							this.anIntArray90[this.anInt391++] = local12;
						}
						continue;
					}
				}
				arg0.method484();
				@Pc(133) boolean local133 = false;
				return;
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("83793, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method111() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt247; local3++) {
				if (this.anIntArray47[local3] <= 0) {
					@Pc(12) boolean local12 = false;
					try {
						if (this.anIntArray92[local3] != this.anInt327 || this.anIntArray43[local3] != this.anInt197) {
							@Pc(45) Class1_Sub1_Sub3 local45 = Class5.method78(this.anIntArray92[local3], this.anIntArray43[local3]);
							if (System.currentTimeMillis() + (long) (local45.anInt715 / 22) > this.aLong17 + (long) (this.anInt374 / 22)) {
								this.anInt374 = local45.anInt715;
								this.aLong17 = System.currentTimeMillis();
								if (this.method102(local45.aByteArray9, local45.anInt715)) {
									this.anInt327 = this.anIntArray92[local3];
									this.anInt197 = this.anIntArray43[local3];
								} else {
									local12 = true;
								}
							}
						} else if (!this.method164()) {
							local12 = true;
						}
					} catch (@Pc(95) Exception local95) {
					}
					if (local12 && this.anIntArray47[local3] != -5) {
						this.anIntArray47[local3] = -5;
					} else {
						this.anInt247--;
						for (@Pc(111) int local111 = local3; local111 < this.anInt247; local111++) {
							this.anIntArray92[local111] = this.anIntArray92[local111 + 1];
							this.anIntArray43[local111] = this.anIntArray43[local111 + 1];
							this.anIntArray47[local111] = this.anIntArray47[local111 + 1];
						}
						local3--;
					}
				} else {
					@Pc(163) int local163 = this.anIntArray47[local3]--;
				}
			}
			if (this.anInt335 > 0) {
				this.anInt335 -= 20;
				if (this.anInt335 < 0) {
					this.anInt335 = 0;
				}
				if (this.anInt335 == 0 && this.aBoolean62 && !aBoolean77) {
					this.anInt360 = this.anInt325;
					this.aBoolean87 = false;
					this.aClass44_Sub1_1.method637(2, this.anInt360);
					return;
				}
			}
		} catch (@Pc(216) RuntimeException local216) {
			signlink.reporterror("17293, " + 107 + ", " + local216.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!d;)Z")
	private boolean method112(@OriginalArg(1) Class6 arg0) {
		try {
			if (arg0.anIntArray95 == null) {
				return false;
			}
			for (@Pc(6) int local6 = 0; local6 < arg0.anIntArray95.length; local6++) {
				@Pc(14) int local14 = this.method149(arg0, local6);
				@Pc(19) int local19 = arg0.anIntArray96[local6];
				if (arg0.anIntArray95[local6] == 2) {
					if (local14 >= local19) {
						return false;
					}
				} else if (arg0.anIntArray95[local6] == 3) {
					if (local14 <= local19) {
						return false;
					}
				} else if (arg0.anIntArray95[local6] == 4) {
					if (local14 == local19) {
						return false;
					}
				} else if (local14 != local19) {
					return false;
				}
			}
			return true;
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("63054, " + 110 + ", " + arg0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method113() {
		try {
			this.anInt254 = 0;
			@Pc(10) int local10 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt961 >> 7) + this.anInt277;
			@Pc(18) int local18 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962 >> 7) + this.anInt278;
			if (local10 >= 3053 && local10 <= 3156 && local18 >= 3056 && local18 <= 3136) {
				this.anInt254 = 1;
			}
			if (local10 >= 3072 && local10 <= 3118 && local18 >= 9492 && local18 <= 9535) {
				this.anInt254 = 1;
			}
			if (this.anInt254 == 1 && local10 >= 3139 && local10 <= 3199 && local18 >= 3008 && local18 <= 3062) {
				this.anInt254 = 0;
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("30837, " + 0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method114() {
		try {
			if (this.anInt210 != 0) {
				@Pc(5) int local5 = 0;
				if (this.anInt282 != 0) {
					local5 = 1;
				}
				for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
					if (this.aStringArray2[local12] != null) {
						@Pc(24) int local24 = this.anIntArray38[local12];
						@Pc(29) String local29 = this.aStringArray1[local12];
						if (local29 != null && local29.startsWith("@cr1@")) {
							local29 = local29.substring(5);
						}
						if (local29 != null && local29.startsWith("@cr2@")) {
							local29 = local29.substring(5);
						}
						if ((local24 == 3 || local24 == 7) && (local24 == 7 || this.anInt224 == 0 || this.anInt224 == 1 && this.method119(this.anInt400, local29))) {
							@Pc(83) int local83 = 329 - local5 * 13;
							if (super.anInt182 > 4 && super.anInt183 - 4 > local83 - 10 && super.anInt183 - 4 <= local83 + 3) {
								@Pc(122) int local122 = this.aClass1_Sub1_Sub2_Sub4_2.method444("From:  " + local29 + this.aStringArray2[local12]) + 25;
								if (local122 > 450) {
									local122 = 450;
								}
								if (super.anInt182 < local122 + 4) {
									if (this.anInt361 >= 1) {
										this.aStringArray6[this.anInt222] = "Report abuse @whi@" + local29;
										this.anIntArray81[this.anInt222] = 2524;
										this.anInt222++;
									}
									this.aStringArray6[this.anInt222] = "Add ignore @whi@" + local29;
									this.anIntArray81[this.anInt222] = 2047;
									this.anInt222++;
									this.aStringArray6[this.anInt222] = "Add friend @whi@" + local29;
									this.anIntArray81[this.anInt222] = 2605;
									this.anInt222++;
								}
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local24 == 5 || local24 == 6) && this.anInt224 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(242) RuntimeException local242) {
			signlink.reporterror("8208, " + 45332 + ", " + local242.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!lb;BI)V")
	private void method115(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				if (arg0.anInt716 + 21 < arg1 * 8) {
					@Pc(12) int local12 = arg0.method483(14);
					if (local12 != 16383) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12] = new Class1_Sub1_Sub1_Sub1_Sub2();
						}
						@Pc(32) Class1_Sub1_Sub1_Sub1_Sub2 local32 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12];
						this.anIntArray77[this.anInt357++] = local12;
						local32.anInt1001 = anInt375;
						local32.aClass13_2 = Class13.method320(arg0.method483(11));
						local32.anInt964 = local32.aClass13_2.aByte19;
						local32.anInt1004 = local32.aClass13_2.anInt547;
						local32.anInt967 = local32.aClass13_2.anInt534;
						local32.anInt968 = local32.aClass13_2.anInt535;
						local32.anInt969 = local32.aClass13_2.anInt536;
						local32.anInt970 = local32.aClass13_2.anInt537;
						local32.anInt965 = local32.aClass13_2.anInt533;
						@Pc(93) int local93 = arg0.method483(5);
						if (local93 > 15) {
							local93 -= 32;
						}
						@Pc(102) int local102 = arg0.method483(5);
						if (local102 > 15) {
							local102 -= 32;
						}
						local32.method670(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0] + local93, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0] + local102);
						@Pc(127) int local127 = arg0.method483(1);
						if (local127 == 1) {
							this.anIntArray90[this.anInt391++] = local12;
						}
						continue;
					}
				}
				arg0.method484();
				return;
			}
		} catch (@Pc(155) RuntimeException local155) {
			signlink.reporterror("82026, " + arg0 + ", " + 3 + ", " + arg1 + ", " + local155.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!lb;I)V")
	private void method116(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			arg0.method482(this.anInt380);
			@Pc(10) int local10 = arg0.method483(8);
			@Pc(16) int local16;
			if (local10 < this.anInt357) {
				for (local16 = local10; local16 < this.anInt357; local16++) {
					this.anIntArray67[this.anInt310++] = this.anIntArray77[local16];
				}
			}
			if (local10 > this.anInt357) {
				signlink.reporterror(this.aString6 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt357 = 0;
			for (local16 = 0; local16 < local10; local16++) {
				@Pc(68) int local68 = this.anIntArray77[local16];
				@Pc(73) Class1_Sub1_Sub1_Sub1_Sub2 local73 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local68];
				@Pc(78) int local78 = arg0.method483(1);
				if (local78 == 0) {
					this.anIntArray77[this.anInt357++] = local68;
					local73.anInt1001 = anInt375;
				} else {
					@Pc(101) int local101 = arg0.method483(2);
					if (local101 == 0) {
						this.anIntArray77[this.anInt357++] = local68;
						local73.anInt1001 = anInt375;
						this.anIntArray90[this.anInt391++] = local68;
					} else {
						@Pc(152) int local152;
						@Pc(162) int local162;
						if (local101 == 1) {
							this.anIntArray77[this.anInt357++] = local68;
							local73.anInt1001 = anInt375;
							local152 = arg0.method483(3);
							local73.method671(local152, false);
							local162 = arg0.method483(1);
							if (local162 == 1) {
								this.anIntArray90[this.anInt391++] = local68;
							}
						} else if (local101 == 2) {
							this.anIntArray77[this.anInt357++] = local68;
							local73.anInt1001 = anInt375;
							local152 = arg0.method483(3);
							local73.method671(local152, true);
							local162 = arg0.method483(3);
							local73.method671(local162, true);
							@Pc(220) int local220 = arg0.method483(1);
							if (local220 == 1) {
								this.anIntArray90[this.anInt391++] = local68;
							}
						} else if (local101 == 3) {
							this.anIntArray67[this.anInt310++] = local68;
						}
					}
				}
			}
		} catch (@Pc(270) RuntimeException local270) {
			signlink.reporterror("57812, " + 8 + ", " + arg0 + ", " + arg1 + ", " + local270.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method117(@OriginalArg(0) int arg0) {
		try {
			signlink.anInt920 = arg0;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("68906, " + arg0 + ", " + 261 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIILclient!d;)V")
	private void method118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class6 arg5) {
		try {
			if (arg5.anInt408 == 0 && arg5.anIntArray97 != null && !arg5.aBoolean100 && (arg4 >= arg3 && arg0 >= arg2 && arg4 <= arg3 + arg5.anInt411 && arg0 <= arg2 + arg5.anInt412)) {
				@Pc(40) int local40 = arg5.anIntArray97.length;
				for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
					@Pc(51) int local51 = arg5.anIntArray98[local42] + arg3;
					@Pc(60) int local60 = arg5.anIntArray99[local42] + arg2 - arg1;
					@Pc(67) Class6 local67 = Class6.aClass6Array1[arg5.anIntArray97[local42]];
					@Pc(72) int local72 = local51 + local67.anInt413;
					@Pc(77) int local77 = local60 + local67.anInt414;
					if ((local67.anInt415 >= 0 || local67.anInt423 != 0) && arg4 >= local72 && arg0 >= local77 && arg4 < local72 + local67.anInt411 && arg0 < local77 + local67.anInt412) {
						if (local67.anInt415 >= 0) {
							this.anInt240 = local67.anInt415;
						} else {
							this.anInt240 = local67.anInt406;
						}
					}
					if (local67.anInt408 == 0) {
						this.method118(arg0, local67.anInt417, local77, local72, arg4, local67);
						if (local67.anInt416 > local67.anInt412) {
							this.method147(local67, local72 + local67.anInt411, local67.anInt412, local77, local67.anInt416, true, arg4, arg0);
						}
					} else {
						if (local67.anInt409 == 1 && arg4 >= local72 && arg0 >= local77 && arg4 < local72 + local67.anInt411 && arg0 < local77 + local67.anInt412) {
							@Pc(174) boolean local174 = false;
							if (local67.anInt410 != 0) {
								local174 = this.method186(local67);
							}
							if (!local174) {
								this.aStringArray6[this.anInt222] = local67.aString22;
								this.anIntArray81[this.anInt222] = 231;
								this.anIntArray80[this.anInt222] = local67.anInt406;
								this.anInt222++;
							}
						}
						if (local67.anInt409 == 2 && this.anInt199 == 0 && arg4 >= local72 && arg0 >= local77 && arg4 < local72 + local67.anInt411 && arg0 < local77 + local67.anInt412) {
							@Pc(238) String local238 = local67.aString20;
							if (local238.indexOf(" ") != -1) {
								local238 = local238.substring(0, local238.indexOf(" "));
							}
							this.aStringArray6[this.anInt222] = local238 + " @gre@" + local67.aString21;
							this.anIntArray81[this.anInt222] = 274;
							this.anIntArray80[this.anInt222] = local67.anInt406;
							this.anInt222++;
						}
						if (local67.anInt409 == 3 && arg4 >= local72 && arg0 >= local77 && arg4 < local72 + local67.anInt411 && arg0 < local77 + local67.anInt412) {
							this.aStringArray6[this.anInt222] = "Close";
							this.anIntArray81[this.anInt222] = 737;
							this.anIntArray80[this.anInt222] = local67.anInt406;
							this.anInt222++;
						}
						if (local67.anInt409 == 4 && arg4 >= local72 && arg0 >= local77 && arg4 < local72 + local67.anInt411 && arg0 < local77 + local67.anInt412) {
							this.aStringArray6[this.anInt222] = local67.aString22;
							this.anIntArray81[this.anInt222] = 435;
							this.anIntArray80[this.anInt222] = local67.anInt406;
							this.anInt222++;
						}
						if (local67.anInt409 == 5 && arg4 >= local72 && arg0 >= local77 && arg4 < local72 + local67.anInt411 && arg0 < local77 + local67.anInt412) {
							this.aStringArray6[this.anInt222] = local67.aString22;
							this.anIntArray81[this.anInt222] = 225;
							this.anIntArray80[this.anInt222] = local67.anInt406;
							this.anInt222++;
						}
						if (local67.anInt409 == 6 && !this.aBoolean57 && arg4 >= local72 && arg0 >= local77 && arg4 < local72 + local67.anInt411 && arg0 < local77 + local67.anInt412) {
							this.aStringArray6[this.anInt222] = local67.aString22;
							this.anIntArray81[this.anInt222] = 997;
							this.anIntArray80[this.anInt222] = local67.anInt406;
							this.anInt222++;
						}
						if (local67.anInt408 == 2) {
							@Pc(486) int local486 = 0;
							for (@Pc(488) int local488 = 0; local488 < local67.anInt412; local488++) {
								for (@Pc(492) int local492 = 0; local492 < local67.anInt411; local492++) {
									@Pc(503) int local503 = local72 + local492 * (local67.anInt419 + 32);
									@Pc(512) int local512 = local77 + local488 * (local67.anInt420 + 32);
									if (local486 < 20) {
										local503 += local67.anIntArray100[local486];
										local512 += local67.anIntArray101[local486];
									}
									if (arg4 >= local503 && arg0 >= local512 && arg4 < local503 + 32 && arg0 < local512 + 32) {
										this.anInt233 = local486;
										this.anInt234 = local67.anInt406;
										if (local67.anIntArray93[local486] > 0) {
											@Pc(565) Class15 local565 = Class15.method357(local67.anIntArray93[local486] - 1);
											if (this.anInt215 == 1 && local67.aBoolean103) {
												if (local67.anInt406 != this.anInt217 || local486 != this.anInt216) {
													this.aStringArray6[this.anInt222] = "Use " + this.aString5 + " with @lre@" + local565.aString25;
													this.anIntArray81[this.anInt222] = 398;
													this.anIntArray82[this.anInt222] = local565.anInt579;
													this.anIntArray79[this.anInt222] = local486;
													this.anIntArray80[this.anInt222] = local67.anInt406;
													this.anInt222++;
												}
											} else if (this.anInt199 != 1 || !local67.aBoolean103) {
												@Pc(702) int local702;
												if (local67.aBoolean103) {
													for (local702 = 4; local702 >= 3; local702--) {
														if (local565.aStringArray11 != null && local565.aStringArray11[local702] != null) {
															this.aStringArray6[this.anInt222] = local565.aStringArray11[local702] + " @lre@" + local565.aString25;
															if (local702 == 3) {
																this.anIntArray81[this.anInt222] = 681;
															}
															if (local702 == 4) {
																this.anIntArray81[this.anInt222] = 100;
															}
															this.anIntArray82[this.anInt222] = local565.anInt579;
															this.anIntArray79[this.anInt222] = local486;
															this.anIntArray80[this.anInt222] = local67.anInt406;
															this.anInt222++;
														} else if (local702 == 4) {
															this.aStringArray6[this.anInt222] = "Drop @lre@" + local565.aString25;
															this.anIntArray81[this.anInt222] = 100;
															this.anIntArray82[this.anInt222] = local565.anInt579;
															this.anIntArray79[this.anInt222] = local486;
															this.anIntArray80[this.anInt222] = local67.anInt406;
															this.anInt222++;
														}
													}
												}
												if (local67.aBoolean104) {
													this.aStringArray6[this.anInt222] = "Use @lre@" + local565.aString25;
													this.anIntArray81[this.anInt222] = 102;
													this.anIntArray82[this.anInt222] = local565.anInt579;
													this.anIntArray79[this.anInt222] = local486;
													this.anIntArray80[this.anInt222] = local67.anInt406;
													this.anInt222++;
												}
												if (local67.aBoolean103 && local565.aStringArray11 != null) {
													for (local702 = 2; local702 >= 0; local702--) {
														if (local565.aStringArray11[local702] != null) {
															this.aStringArray6[this.anInt222] = local565.aStringArray11[local702] + " @lre@" + local565.aString25;
															if (local702 == 0) {
																this.anIntArray81[this.anInt222] = 694;
															}
															if (local702 == 1) {
																this.anIntArray81[this.anInt222] = 962;
															}
															if (local702 == 2) {
																this.anIntArray81[this.anInt222] = 795;
															}
															this.anIntArray82[this.anInt222] = local565.anInt579;
															this.anIntArray79[this.anInt222] = local486;
															this.anIntArray80[this.anInt222] = local67.anInt406;
															this.anInt222++;
														}
													}
												}
												if (local67.aStringArray7 != null) {
													for (local702 = 4; local702 >= 0; local702--) {
														if (local67.aStringArray7[local702] != null) {
															this.aStringArray6[this.anInt222] = local67.aStringArray7[local702] + " @lre@" + local565.aString25;
															if (local702 == 0) {
																this.anIntArray81[this.anInt222] = 582;
															}
															if (local702 == 1) {
																this.anIntArray81[this.anInt222] = 113;
															}
															if (local702 == 2) {
																this.anIntArray81[this.anInt222] = 555;
															}
															if (local702 == 3) {
																this.anIntArray81[this.anInt222] = 331;
															}
															if (local702 == 4) {
																this.anIntArray81[this.anInt222] = 354;
															}
															this.anIntArray82[this.anInt222] = local565.anInt579;
															this.anIntArray79[this.anInt222] = local486;
															this.anIntArray80[this.anInt222] = local67.anInt406;
															this.anInt222++;
														}
													}
												}
												this.aStringArray6[this.anInt222] = "Examine @lre@" + local565.aString25;
												this.anIntArray81[this.anInt222] = 1328;
												this.anIntArray82[this.anInt222] = local565.anInt579;
												this.anIntArray79[this.anInt222] = local486;
												this.anIntArray80[this.anInt222] = local67.anInt406;
												this.anInt222++;
											} else if ((this.anInt201 & 0x10) == 16) {
												this.aStringArray6[this.anInt222] = this.aString4 + " @lre@" + local565.aString25;
												this.anIntArray81[this.anInt222] = 563;
												this.anIntArray82[this.anInt222] = local565.anInt579;
												this.anIntArray79[this.anInt222] = local486;
												this.anIntArray80[this.anInt222] = local67.anInt406;
												this.anInt222++;
											}
										}
									}
									local486++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1132) RuntimeException local1132) {
			signlink.reporterror("17770, " + arg0 + ", " + arg1 + ", " + 33973 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local1132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;)Z")
	private boolean method119(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			for (@Pc(5) int local5 = 0; local5 < this.anInt290; local5++) {
				if (arg1.equalsIgnoreCase(this.aStringArray3[local5])) {
					return true;
				}
			}
			this.anInt204 += arg0;
			return arg1.equalsIgnoreCase(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("60015, " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!lb;II)V")
	private void method120(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(14) int local14;
			@Pc(23) int local23;
			@Pc(30) int local30;
			@Pc(33) int local33;
			@Pc(37) int local37;
			@Pc(41) int local41;
			@Pc(46) int local46;
			@Pc(51) int local51;
			if (arg2 == 70 || arg2 == 88) {
				local14 = arg0.method472();
				local23 = this.anInt241 + (local14 >> 4 & 0x7);
				local30 = this.anInt242 + (local14 & 0x7);
				local33 = arg0.method472();
				local37 = local33 >> 2;
				local41 = local33 & 0x3;
				local46 = this.anIntArray33[local37];
				if (arg2 == 88) {
					local51 = -1;
				} else {
					local51 = arg0.method474();
				}
				if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
					this.method198(-1, local37, 0, 776, local23, local41, local51, local30, local46, this.anInt386);
				}
			} else {
				@Pc(141) int local141;
				@Pc(153) int local153;
				@Pc(167) int local167;
				@Pc(179) int local179;
				if (arg2 == 30) {
					local14 = arg0.method472();
					local23 = this.anInt241 + (local14 >> 4 & 0x7);
					local30 = this.anInt242 + (local14 & 0x7);
					local33 = arg0.method472();
					local37 = local33 >> 2;
					local41 = local33 & 0x3;
					local46 = this.anIntArray33[local37];
					local51 = arg0.method474();
					if (local23 >= 0 && local30 >= 0 && local23 < 103 && local30 < 103) {
						local141 = this.anIntArrayArrayArray5[this.anInt386][local23][local30];
						local153 = this.anIntArrayArrayArray5[this.anInt386][local23 + 1][local30];
						local167 = this.anIntArrayArrayArray5[this.anInt386][local23 + 1][local30 + 1];
						local179 = this.anIntArrayArrayArray5[this.anInt386][local23][local30 + 1];
						if (local46 == 0) {
							@Pc(190) Class34 local190 = this.aClass37_1.method544(local30, local23, this.anInt386, 542);
							if (local190 != null) {
								@Pc(199) int local199 = local190.anInt814 >> 14 & 0x7FFF;
								if (local37 == 2) {
									local190.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(local199, 2, local153, (byte) 3, local51, local141, false, local41 + 4, local179, local167);
									local190.aClass1_Sub1_Sub1_8 = new Class1_Sub1_Sub1_Sub2(local199, 2, local153, (byte) 3, local51, local141, false, local41 + 1 & 0x3, local179, local167);
								} else {
									local190.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(local199, local37, local153, (byte) 3, local51, local141, false, local41, local179, local167);
								}
							}
						}
						if (local46 == 1) {
							@Pc(267) Class14 local267 = this.aClass37_1.method545(this.anInt386, local23, local30);
							if (local267 != null) {
								local267.aClass1_Sub1_Sub1_1 = new Class1_Sub1_Sub1_Sub2(local267.anInt553 >> 14 & 0x7FFF, 4, local153, (byte) 3, local51, local141, false, 0, local179, local167);
							}
						}
						if (local46 == 2) {
							@Pc(301) Class31 local301 = this.aClass37_1.method546(local23, local30, this.anInt386);
							if (local37 == 11) {
								local37 = 10;
							}
							if (local301 != null) {
								local301.aClass1_Sub1_Sub1_6 = new Class1_Sub1_Sub1_Sub2(local301.anInt797 >> 14 & 0x7FFF, local37, local153, (byte) 3, local51, local141, false, local41, local179, local167);
							}
						}
						if (local46 == 3) {
							@Pc(341) Class18 local341 = this.aClass37_1.method547(this.anInt386, local30, local23, this.anInt202);
							if (local341 != null) {
								local341.aClass1_Sub1_Sub1_2 = new Class1_Sub1_Sub1_Sub2(local341.anInt634 >> 14 & 0x7FFF, 22, local153, (byte) 3, local51, local141, false, local41, local179, local167);
							}
						}
					}
				} else {
					@Pc(406) Class1_Sub1_Sub1_Sub3 local406;
					if (arg2 == 120) {
						local14 = arg0.method472();
						local23 = this.anInt241 + (local14 >> 4 & 0x7);
						local30 = this.anInt242 + (local14 & 0x7);
						local33 = arg0.method474();
						local37 = arg0.method474();
						if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
							local406 = new Class1_Sub1_Sub1_Sub3();
							local406.anInt167 = local33;
							local406.anInt168 = local37;
							if (this.aClass29ArrayArrayArray1[this.anInt386][local23][local30] == null) {
								this.aClass29ArrayArrayArray1[this.anInt386][local23][local30] = new Class29((byte) 5);
							}
							this.aClass29ArrayArrayArray1[this.anInt386][local23][local30].method500(local406);
							this.method165(local23, local30);
						}
					} else if (arg2 == 115) {
						local14 = arg0.method472();
						local23 = this.anInt241 + (local14 >> 4 & 0x7);
						local30 = this.anInt242 + (local14 & 0x7);
						local33 = arg0.method474();
						if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
							@Pc(496) Class29 local496 = this.aClass29ArrayArrayArray1[this.anInt386][local23][local30];
							if (local496 != null) {
								for (local406 = (Class1_Sub1_Sub1_Sub3) local496.method503(); local406 != null; local406 = (Class1_Sub1_Sub1_Sub3) local496.method505()) {
									if (local406.anInt167 == (local33 & 0x7FFF)) {
										local406.method666();
										break;
									}
								}
								if (local496.method503() == null) {
									this.aClass29ArrayArrayArray1[this.anInt386][local23][local30] = null;
								}
								this.method165(local23, local30);
							}
						}
					} else if (arg2 == 37) {
						local14 = arg0.method472();
						local23 = this.anInt241 + (local14 >> 4 & 0x7);
						local30 = this.anInt242 + (local14 & 0x7);
						local33 = local23 + arg0.method473();
						local37 = local30 + arg0.method473();
						local41 = arg0.method475();
						local46 = arg0.method474();
						local51 = arg0.method472() * 4;
						local141 = arg0.method472() * 4;
						local153 = arg0.method474();
						local167 = arg0.method474();
						local179 = arg0.method472();
						@Pc(599) int local599 = arg0.method472();
						if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104 && local33 >= 0 && local37 >= 0 && local33 < 104 && local37 < 104) {
							local23 = local23 * 128 + 64;
							local30 = local30 * 128 + 64;
							local33 = local33 * 128 + 64;
							local37 = local37 * 128 + 64;
							@Pc(673) Class1_Sub1_Sub1_Sub4 local673 = new Class1_Sub1_Sub1_Sub4(local30, local179, local141, local41, this.method199(this.anInt386, local23, local30) - local51, local167 + anInt375, local46, local599, this.anInt376, local153 + anInt375, this.anInt386, local23);
							local673.method239(this.method199(this.anInt386, local33, local37) - local141, local153 + anInt375, local37, local33);
							this.aClass29_2.method500(local673);
						}
					} else if (arg2 == 114) {
						local14 = arg0.method472();
						local23 = this.anInt241 + (local14 >> 4 & 0x7);
						local30 = this.anInt242 + (local14 & 0x7);
						local33 = arg0.method474();
						local37 = arg0.method472();
						local41 = arg0.method474();
						if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
							local23 = local23 * 128 + 64;
							local30 = local30 * 128 + 64;
							@Pc(769) Class1_Sub1_Sub1_Sub6 local769 = new Class1_Sub1_Sub1_Sub6(local41, local23, this.method199(this.anInt386, local23, local30) - local37, this.anInt386, anInt375, local33, -954, local30);
							this.aClass29_3.method500(local769);
						}
					} else if (arg2 == 8) {
						local14 = arg0.method472();
						local23 = this.anInt241 + (local14 >> 4 & 0x7);
						local30 = this.anInt242 + (local14 & 0x7);
						local33 = arg0.method474();
						local37 = arg0.method474();
						local41 = arg0.method474();
						if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104 && local41 != this.anInt354) {
							@Pc(823) Class1_Sub1_Sub1_Sub3 local823 = new Class1_Sub1_Sub1_Sub3();
							local823.anInt167 = local33;
							local823.anInt168 = local37;
							if (this.aClass29ArrayArrayArray1[this.anInt386][local23][local30] == null) {
								this.aClass29ArrayArrayArray1[this.anInt386][local23][local30] = new Class29((byte) 5);
							}
							this.aClass29ArrayArrayArray1[this.anInt386][local23][local30].method500(local823);
							this.method165(local23, local30);
						}
					} else {
						if (arg2 == 218) {
							local14 = arg0.method472();
							local23 = this.anInt241 + (local14 >> 4 & 0x7);
							local30 = this.anInt242 + (local14 & 0x7);
							local33 = arg0.method472();
							local37 = local33 >> 2;
							local41 = local33 & 0x3;
							local46 = this.anIntArray33[local37];
							local51 = arg0.method474();
							local141 = arg0.method474();
							local153 = arg0.method474();
							local167 = arg0.method474();
							@Pc(921) byte local921 = arg0.method473();
							@Pc(924) byte local924 = arg0.method473();
							@Pc(927) byte local927 = arg0.method473();
							@Pc(930) byte local930 = arg0.method473();
							@Pc(936) Class1_Sub1_Sub1_Sub1_Sub1 local936;
							if (local167 == this.anInt354) {
								local936 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
							} else {
								local936 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local167];
							}
							if (local936 != null) {
								@Pc(948) Class9 local948 = Class9.method286(local51);
								@Pc(958) int local958 = this.anIntArrayArrayArray5[this.anInt386][local23][local30];
								@Pc(970) int local970 = this.anIntArrayArrayArray5[this.anInt386][local23 + 1][local30];
								@Pc(984) int local984 = this.anIntArrayArrayArray5[this.anInt386][local23 + 1][local30 + 1];
								@Pc(996) int local996 = this.anIntArrayArrayArray5[this.anInt386][local23][local30 + 1];
								@Pc(1006) Class1_Sub1_Sub1_Sub5 local1006 = local948.method292(local37, local41, local958, local970, local984, local996, -1);
								if (local1006 != null) {
									this.method198(local153 + 1, 0, local141 + 1, 776, local23, 0, -1, local30, local46, this.anInt386);
									local936.anInt127 = local141 + anInt375;
									local936.anInt128 = local153 + anInt375;
									local936.aClass1_Sub1_Sub1_Sub5_1 = local1006;
									@Pc(1041) int local1041 = local948.anInt489;
									@Pc(1044) int local1044 = local948.anInt490;
									if (local41 == 1 || local41 == 3) {
										local1041 = local948.anInt490;
										local1044 = local948.anInt489;
									}
									local936.anInt129 = local23 * 128 + local1041 * 64;
									local936.anInt131 = local30 * 128 + local1044 * 64;
									local936.anInt130 = this.method199(this.anInt386, local936.anInt129, local936.anInt131);
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
									local936.anInt132 = local23 + local921;
									local936.anInt134 = local23 + local927;
									local936.anInt133 = local30 + local924;
									local936.anInt135 = local30 + local930;
								}
							}
						}
						if (arg2 == 98) {
							local14 = arg0.method472();
							local23 = this.anInt241 + (local14 >> 4 & 0x7);
							local30 = this.anInt242 + (local14 & 0x7);
							local33 = arg0.method474();
							local37 = arg0.method474();
							local41 = arg0.method474();
							if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
								@Pc(1174) Class29 local1174 = this.aClass29ArrayArrayArray1[this.anInt386][local23][local30];
								if (local1174 != null) {
									for (@Pc(1180) Class1_Sub1_Sub1_Sub3 local1180 = (Class1_Sub1_Sub1_Sub3) local1174.method503(); local1180 != null; local1180 = (Class1_Sub1_Sub1_Sub3) local1174.method505()) {
										if (local1180.anInt167 == (local33 & 0x7FFF) && local1180.anInt168 == local37) {
											local1180.anInt168 = local41;
											break;
										}
									}
									this.method165(local23, local30);
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1210) RuntimeException local1210) {
			signlink.reporterror("8137, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local1210.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method121(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(11) int local11 = 0; local11 < this.anInt290; local11++) {
					if (this.aLongArray3[local11] == arg0) {
						this.anInt290--;
						this.aBoolean56 = true;
						for (@Pc(31) int local31 = local11; local31 < this.anInt290; local31++) {
							this.aStringArray3[local31] = this.aStringArray3[local31 + 1];
							this.anIntArray48[local31] = this.anIntArray48[local31 + 1];
							this.aLongArray3[local31] = this.aLongArray3[local31 + 1];
						}
						this.aClass1_Sub1_Sub3_2.method461(84);
						this.aClass1_Sub1_Sub3_2.method468(arg0);
						return;
					}
				}
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("68451, " + arg0 + ", " + -964 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!lb;ZI)V")
	private void method122(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt310 = 0;
			this.anInt391 = 0;
			this.method116(arg0, arg1);
			this.method115(arg0, arg1);
			this.method144(arg0, this.anInt226, arg1);
			@Pc(39) int local39;
			for (@Pc(32) int local32 = 0; local32 < this.anInt310; local32++) {
				local39 = this.anIntArray67[local32];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local39].anInt1001 != anInt375) {
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local39].aClass13_2 = null;
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local39] = null;
				}
			}
			if (arg0.anInt715 != arg1) {
				signlink.reporterror(this.aString6 + " size mismatch in getnpcpos - pos:" + arg0.anInt715 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local39 = 0; local39 < this.anInt357; local39++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray77[local39]] == null) {
					signlink.reporterror(this.aString6 + " null entry in npc list - pos:" + local39 + " size:" + this.anInt357);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("60862, " + arg0 + ", " + false + ", " + arg1 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method123() {
		try {
			if (this.anInt394 == 0) {
				@Pc(17) int local17 = super.anInt187;
				if (this.anInt199 == 1 && super.anInt188 >= 516 && super.anInt189 >= 160 && super.anInt188 <= 765 && super.anInt189 <= 205) {
					local17 = 0;
				}
				@Pc(48) int local48;
				@Pc(51) int local51;
				@Pc(127) int local127;
				if (this.aBoolean74) {
					if (local17 != 1) {
						local48 = super.anInt182;
						local51 = super.anInt183;
						if (this.anInt261 == 0) {
							local48 -= 4;
							local51 -= 4;
						}
						if (this.anInt261 == 1) {
							local48 -= 553;
							local51 -= 205;
						}
						if (this.anInt261 == 2) {
							local48 -= 17;
							local51 -= 357;
						}
						if (local48 < this.anInt262 - 10 || local48 > this.anInt262 + this.anInt264 + 10 || local51 < this.anInt263 - 10 || local51 > this.anInt263 + this.anInt265 + 10) {
							this.aBoolean74 = false;
							if (this.anInt261 == 1) {
								this.aBoolean56 = true;
							}
							if (this.anInt261 == 2) {
								this.aBoolean68 = true;
							}
						}
					}
					if (local17 == 1) {
						local48 = this.anInt262;
						local51 = this.anInt263;
						local127 = this.anInt264;
						@Pc(130) int local130 = super.anInt188;
						@Pc(133) int local133 = super.anInt189;
						if (this.anInt261 == 0) {
							local130 -= 4;
							local133 -= 4;
						}
						if (this.anInt261 == 1) {
							local130 -= 553;
							local133 -= 205;
						}
						if (this.anInt261 == 2) {
							local130 -= 17;
							local133 -= 357;
						}
						@Pc(152) int local152 = -1;
						for (@Pc(154) int local154 = 0; local154 < this.anInt222; local154++) {
							@Pc(169) int local169 = local51 + (this.anInt222 - 1 - local154) * 15 + 31;
							if (local130 > local48 && local130 < local48 + local127 && local133 > local169 - 13 && local133 < local169 + 3) {
								local152 = local154;
							}
						}
						if (local152 != -1) {
							this.method160(local152);
						}
						this.aBoolean74 = false;
						if (this.anInt261 == 1) {
							this.aBoolean56 = true;
						}
						if (this.anInt261 == 2) {
							this.aBoolean68 = true;
							return;
						}
					}
				} else {
					if (local17 == 1 && this.anInt222 > 0) {
						local48 = this.anIntArray81[this.anInt222 - 1];
						if (local48 == 582 || local48 == 113 || local48 == 555 || local48 == 331 || local48 == 354 || local48 == 694 || local48 == 962 || local48 == 795 || local48 == 681 || local48 == 100 || local48 == 102 || local48 == 1328) {
							local51 = this.anIntArray79[this.anInt222 - 1];
							local127 = this.anIntArray80[this.anInt222 - 1];
							@Pc(289) Class6 local289 = Class6.aClass6Array1[local127];
							if (local289.aBoolean102 || local289.aBoolean105) {
								this.aBoolean66 = false;
								this.anInt379 = 0;
								this.anInt392 = local127;
								this.anInt393 = local51;
								this.anInt394 = 2;
								this.anInt395 = super.anInt188;
								this.anInt396 = super.anInt189;
								if (Class6.aClass6Array1[local127].anInt407 == this.anInt322) {
									this.anInt394 = 1;
								}
								if (Class6.aClass6Array1[local127].anInt407 == this.anInt316) {
									this.anInt394 = 3;
								}
								return;
							}
						}
					}
					if (local17 == 1 && (this.anInt313 == 1 || this.method223(this.anInt222 - 1)) && this.anInt222 > 2) {
						local17 = 2;
					}
					if (local17 == 1 && this.anInt222 > 0) {
						this.method160(this.anInt222 - 1);
					}
					if (local17 != 2 || this.anInt222 <= 0) {
						return;
					}
					this.method212();
				}
			}
		} catch (@Pc(384) RuntimeException local384) {
			signlink.reporterror("76957, " + -22 + ", " + local384.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method124() {
		try {
			this.aClass1_Sub1_Sub3_2.method461(58);
			if (this.anInt364 != -1) {
				this.anInt364 = -1;
				this.aBoolean56 = true;
				this.aBoolean57 = false;
				this.aBoolean75 = true;
			}
			if (this.anInt316 != -1) {
				this.anInt316 = -1;
				this.aBoolean68 = true;
				this.aBoolean57 = false;
			}
			this.anInt322 = -1;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("45007, " + -48789 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method125(@OriginalArg(0) byte arg0) {
		try {
			this.aBoolean82 = true;
			@Pc(9) boolean local9 = false;
			for (@Pc(18) int local18 = 0; local18 < 7; local18++) {
				this.anIntArray53[local18] = -1;
				for (@Pc(27) int local27 = 0; local27 < Class23.anInt724; local27++) {
					if (!Class23.aClass23Array1[local27].aBoolean206 && Class23.aClass23Array1[local27].anInt725 == local18 + (this.aBoolean63 ? 0 : 7)) {
						this.anIntArray53[local18] = local27;
						break;
					}
				}
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("36624, " + arg0 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method126() {
		try {
			this.aBoolean79 = true;
			try {
				@Pc(4) long local4 = System.currentTimeMillis();
				@Pc(6) int local6 = 0;
				@Pc(8) int local8 = 20;
				while (this.aBoolean83) {
					this.anInt324++;
					this.method170();
					this.method170();
					this.method214();
					local6++;
					if (local6 > 10) {
						@Pc(31) long local31 = System.currentTimeMillis();
						@Pc(40) int local40 = (int) (local31 - local4) / 10 - local8;
						local8 = 40 - local40;
						if (local8 < 5) {
							local8 = 5;
						}
						local6 = 0;
						local4 = local31;
					}
					try {
						Thread.sleep((long) local8);
					} catch (@Pc(58) Exception local58) {
					}
				}
			} catch (@Pc(64) Exception local64) {
			}
			this.aBoolean79 = false;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("11445, " + 0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method127(@OriginalArg(0) int arg0) {
		try {
			if (!aBoolean77) {
				@Pc(17) Class1_Sub1_Sub2_Sub3 local17;
				@Pc(25) int local25;
				@Pc(33) int local33;
				@Pc(36) byte[] local36;
				@Pc(39) byte[] local39;
				@Pc(41) int local41;
				if (Class1_Sub1_Sub2_Sub1.anIntArray179[17] >= arg0) {
					local17 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[17];
					local25 = local17.anInt649 * local17.anInt650 - 1;
					local33 = local17.anInt649 * this.anInt196 * 2;
					local36 = local17.aByteArray7;
					local39 = this.aByteArray2;
					for (local41 = 0; local41 <= local25; local41++) {
						local39[local41] = local36[local41 - local33 & local25];
					}
					local17.aByteArray7 = local39;
					this.aByteArray2 = local36;
					Class1_Sub1_Sub2_Sub1.method345(17);
				}
				if (Class1_Sub1_Sub2_Sub1.anIntArray179[24] >= arg0) {
					local17 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[24];
					local25 = local17.anInt649 * local17.anInt650 - 1;
					local33 = local17.anInt649 * this.anInt196 * 2;
					local36 = local17.aByteArray7;
					local39 = this.aByteArray2;
					for (local41 = 0; local41 <= local25; local41++) {
						local39[local41] = local36[local41 - local33 & local25];
					}
					local17.aByteArray7 = local39;
					this.aByteArray2 = local36;
					Class1_Sub1_Sub2_Sub1.method345(24);
					return;
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("7032, " + arg0 + ", " + 0 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	@Override
	protected void method89() {
		try {
			if (!this.aBoolean71 && !this.aBoolean89 && !this.aBoolean69) {
				anInt375++;
				if (this.aBoolean80) {
					this.method129();
				} else {
					this.method222();
				}
				this.method131();
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("98279, " + true + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method128(@OriginalArg(0) int arg0) {
		try {
			@Pc(12) int[] local12 = this.aClass1_Sub1_Sub2_Sub2_13.anIntArray205;
			@Pc(15) int local15 = local12.length;
			for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
				local12[local17] = 0;
			}
			@Pc(41) int local41;
			@Pc(43) int local43;
			for (@Pc(29) int local29 = 1; local29 < 103; local29++) {
				local41 = (103 - local29) * 512 * 4 + 24628;
				for (local43 = 1; local43 < 103; local43++) {
					if ((this.aByteArrayArrayArray7[arg0][local43][local29] & 0x18) == 0) {
						this.aClass37_1.method557(local12, local41, arg0, local43, local29);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local43][local29] & 0x8) != 0) {
						this.aClass37_1.method557(local12, local41, arg0 + 1, local43, local29);
					}
					local41 += 4;
				}
			}
			local41 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local43 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass1_Sub1_Sub2_Sub2_13.method382();
			@Pc(153) int local153;
			for (@Pc(149) int local149 = 1; local149 < 103; local149++) {
				for (local153 = 1; local153 < 103; local153++) {
					if ((this.aByteArrayArrayArray7[arg0][local153][local149] & 0x18) == 0) {
						this.method172(local43, arg0, local153, local149, local41);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local153][local149] & 0x8) != 0) {
						this.method172(local43, arg0 + 1, local153, local149, local41);
					}
				}
			}
			this.aClass35_5.method516();
			this.anInt373 = 0;
			for (local153 = 0; local153 < 104; local153++) {
				for (@Pc(221) int local221 = 0; local221 < 104; local221++) {
					@Pc(231) int local231 = this.aClass37_1.method551(this.anInt386, local153, local221);
					if (local231 != 0) {
						local231 = local231 >> 14 & 0x7FFF;
						@Pc(243) int local243 = Class9.method286(local231).anInt493;
						if (local243 >= 0) {
							@Pc(247) int local247 = local153;
							@Pc(249) int local249 = local221;
							if (local243 != 22 && local243 != 29 && local243 != 34 && local243 != 36 && local243 != 46 && local243 != 47 && local243 != 48) {
								@Pc(281) int[][] local281 = this.aClass19Array1[this.anInt386].anIntArrayArray18;
								for (@Pc(283) int local283 = 0; local283 < 10; local283++) {
									@Pc(290) int local290 = (int) (Math.random() * 4.0D);
									if (local290 == 0 && local247 > 0 && local247 > local153 - 3 && (local281[local247 - 1][local249] & 0x280108) == 0) {
										local247--;
									}
									if (local290 == 1 && local247 < 103 && local247 < local153 + 3 && (local281[local247 + 1][local249] & 0x280180) == 0) {
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
							this.aClass1_Sub1_Sub2_Sub2Array3[this.anInt373] = this.aClass1_Sub1_Sub2_Sub2Array4[local243];
							this.anIntArray83[this.anInt373] = local247;
							this.anIntArray84[this.anInt373] = local249;
							this.anInt373++;
						}
					}
				}
			}
			anInt319++;
			if (anInt319 > 112) {
				anInt319 = 0;
				this.aClass1_Sub1_Sub3_2.method461(4);
				this.aClass1_Sub1_Sub3_2.method462(50);
			}
		} catch (@Pc(438) RuntimeException local438) {
			signlink.reporterror("59856, " + arg0 + ", " + 707 + ", " + local438.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method129() {
		try {
			if (this.anInt282 > 1) {
				this.anInt282--;
			}
			if (this.anInt208 > 0) {
				this.anInt208--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method195(this.aByte10); local22++) {
			}
			if (this.aBoolean80) {
				@Pc(42) Object local42 = this.aClass11_1.anObject1;
				@Pc(67) int local67;
				@Pc(69) int local69;
				@Pc(71) int local71;
				@Pc(104) int local104;
				synchronized (this.aClass11_1.anObject1) {
					if (!aBoolean55) {
						this.aClass11_1.anInt512 = 0;
					} else if (super.anInt187 != 0 || this.aClass11_1.anInt512 >= 40) {
						this.aClass1_Sub1_Sub3_2.method461(232);
						this.aClass1_Sub1_Sub3_2.method462(0);
						local67 = this.aClass1_Sub1_Sub3_2.anInt715;
						local69 = 0;
						@Pc(87) int local87;
						for (local71 = 0; local71 < this.aClass11_1.anInt512 && local67 - this.aClass1_Sub1_Sub3_2.anInt715 < 240; local71++) {
							local69++;
							local87 = this.aClass11_1.anIntArray161[local71];
							if (local87 < 0) {
								local87 = 0;
							} else if (local87 > 502) {
								local87 = 502;
							}
							local104 = this.aClass11_1.anIntArray160[local71];
							if (local104 < 0) {
								local104 = 0;
							} else if (local104 > 764) {
								local104 = 764;
							}
							@Pc(121) int local121 = local87 * 765 + local104;
							if (this.aClass11_1.anIntArray161[local71] == -1 && this.aClass11_1.anIntArray160[local71] == -1) {
								local104 = -1;
								local87 = -1;
								local121 = 524287;
							}
							if (local104 != this.anInt298 || local87 != this.anInt299) {
								@Pc(166) int local166 = local104 - this.anInt298;
								this.anInt298 = local104;
								@Pc(174) int local174 = local87 - this.anInt299;
								this.anInt299 = local87;
								if (this.anInt256 < 8 && local166 >= -32 && local166 <= 31 && local174 >= -32 && local174 <= 31) {
									local166 += 32;
									local174 += 32;
									this.aClass1_Sub1_Sub3_2.method463((this.anInt256 << 12) + (local166 << 6) + local174);
									this.anInt256 = 0;
								} else if (this.anInt256 < 8) {
									this.aClass1_Sub1_Sub3_2.method465((this.anInt256 << 19) + local121 + 8388608);
									this.anInt256 = 0;
								} else {
									this.aClass1_Sub1_Sub3_2.method466((this.anInt256 << 19) + local121 - 1073741824);
									this.anInt256 = 0;
								}
							} else if (this.anInt256 < 2047) {
								this.anInt256++;
							}
						}
						this.aClass1_Sub1_Sub3_2.method471(this.aClass1_Sub1_Sub3_2.anInt715 - local67);
						if (local69 >= this.aClass11_1.anInt512) {
							this.aClass11_1.anInt512 = 0;
						} else {
							this.aClass11_1.anInt512 -= local69;
							for (local87 = 0; local87 < this.aClass11_1.anInt512; local87++) {
								this.aClass11_1.anIntArray160[local87] = this.aClass11_1.anIntArray160[local87 + local69];
								this.aClass11_1.anIntArray161[local87] = this.aClass11_1.anIntArray161[local87 + local69];
							}
						}
					}
				}
				if (super.anInt187 != 0) {
					@Pc(337) long local337 = (super.aLong13 - this.aLong16) / 50L;
					if (local337 > 4095L) {
						local337 = 4095L;
					}
					this.aLong16 = super.aLong13;
					local67 = super.anInt189;
					if (local67 < 0) {
						local67 = 0;
					} else if (local67 > 502) {
						local67 = 502;
					}
					local69 = super.anInt188;
					if (local69 < 0) {
						local69 = 0;
					} else if (local69 > 764) {
						local69 = 764;
					}
					local71 = local67 * 765 + local69;
					@Pc(383) byte local383 = 0;
					if (super.anInt187 == 2) {
						local383 = 1;
					}
					local104 = (int) local337;
					this.aClass1_Sub1_Sub3_2.method461(234);
					this.aClass1_Sub1_Sub3_2.method466((local104 << 20) + (local383 << 19) + local71);
				}
				if (this.anInt221 > 0) {
					this.anInt221--;
				}
				if (super.anIntArray29[1] == 1 || super.anIntArray29[2] == 1 || super.anIntArray29[3] == 1 || super.anIntArray29[4] == 1) {
					this.aBoolean58 = true;
				}
				if (this.aBoolean58 && this.anInt221 <= 0) {
					this.anInt221 = 20;
					this.aBoolean58 = false;
					this.aClass1_Sub1_Sub3_2.method461(91);
					this.aClass1_Sub1_Sub3_2.method463(this.anInt211);
					this.aClass1_Sub1_Sub3_2.method463(this.anInt212);
				}
				if (super.aBoolean52 && !this.aBoolean92) {
					this.aBoolean92 = true;
					this.aClass1_Sub1_Sub3_2.method461(8);
					this.aClass1_Sub1_Sub3_2.method462(1);
				}
				if (!super.aBoolean52 && this.aBoolean92) {
					this.aBoolean92 = false;
					this.aClass1_Sub1_Sub3_2.method461(8);
					this.aClass1_Sub1_Sub3_2.method462(0);
				}
				this.method150(876);
				this.method143();
				this.method111();
				this.anInt206++;
				if (this.anInt206 > 750) {
					this.method166();
				}
				this.method213();
				this.method176();
				this.method155();
				this.anInt196++;
				if (this.anInt339 != 0) {
					this.anInt338 += 20;
					if (this.anInt338 >= 400) {
						this.anInt339 = 0;
					}
				}
				if (this.anInt344 != 0) {
					this.anInt341++;
					if (this.anInt341 >= 15) {
						if (this.anInt344 == 2) {
							this.aBoolean56 = true;
						}
						if (this.anInt344 == 3) {
							this.aBoolean68 = true;
						}
						this.anInt344 = 0;
					}
				}
				if (this.anInt394 != 0) {
					this.anInt379++;
					if (super.anInt182 > this.anInt395 + 5 || super.anInt182 < this.anInt395 - 5 || super.anInt183 > this.anInt396 + 5 || super.anInt183 < this.anInt396 - 5) {
						this.aBoolean66 = true;
					}
					if (super.anInt181 == 0) {
						if (this.anInt394 == 2) {
							this.aBoolean56 = true;
						}
						if (this.anInt394 == 3) {
							this.aBoolean68 = true;
						}
						this.anInt394 = 0;
						if (this.aBoolean66 && this.anInt379 >= 5) {
							this.anInt234 = -1;
							this.method188((byte) 9);
							if (this.anInt234 == this.anInt392 && this.anInt233 != this.anInt393) {
								@Pc(683) Class6 local683 = Class6.aClass6Array1[this.anInt392];
								@Pc(685) byte local685 = 0;
								if (this.anInt192 == 1 && local683.anInt410 == 206) {
									local685 = 1;
								}
								if (local683.anIntArray93[this.anInt233] <= 0) {
									local685 = 0;
								}
								if (local683.aBoolean105) {
									local67 = this.anInt393;
									local69 = this.anInt233;
									local683.anIntArray93[local69] = local683.anIntArray93[local67];
									local683.anIntArray94[local69] = local683.anIntArray94[local67];
									local683.anIntArray93[local67] = -1;
									local683.anIntArray94[local67] = 0;
								} else if (local685 == 1) {
									local67 = this.anInt393;
									local69 = this.anInt233;
									while (local67 != local69) {
										if (local67 > local69) {
											local683.method230(local67 - 1, local67);
											local67--;
										} else if (local67 < local69) {
											local683.method230(local67 + 1, local67);
											local67++;
										}
									}
								} else {
									local683.method230(this.anInt233, this.anInt393);
								}
								this.aClass1_Sub1_Sub3_2.method461(176);
								this.aClass1_Sub1_Sub3_2.method463(this.anInt392);
								this.aClass1_Sub1_Sub3_2.method463(this.anInt393);
								this.aClass1_Sub1_Sub3_2.method463(this.anInt233);
								this.aClass1_Sub1_Sub3_2.method462(local685);
							}
						} else if ((this.anInt313 == 1 || this.method223(this.anInt222 - 1)) && this.anInt222 > 2) {
							this.method212();
						} else if (this.anInt222 > 0) {
							this.method160(this.anInt222 - 1);
						}
						this.anInt341 = 10;
						super.anInt187 = 0;
					}
				}
				anInt203++;
				if (anInt203 > 62) {
					anInt203 = 0;
					this.aClass1_Sub1_Sub3_2.method461(182);
				}
				@Pc(869) int local869;
				@Pc(871) int local871;
				if (Class37.anInt850 != -1) {
					local869 = Class37.anInt850;
					local871 = Class37.anInt851;
					@Pc(892) boolean local892 = this.method103(local871, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], 0, true, local869, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, 0, 0);
					Class37.anInt850 = -1;
					if (local892) {
						this.anInt336 = super.anInt188;
						this.anInt337 = super.anInt189;
						this.anInt339 = 1;
						this.anInt338 = 0;
					}
				}
				if (super.anInt187 == 1 && this.aString16 != null) {
					this.aString16 = null;
					this.aBoolean68 = true;
					super.anInt187 = 0;
				}
				this.method123();
				this.anInt204 += 0;
				this.method98();
				this.method156(this.aBoolean59);
				this.method219();
				if (super.anInt181 == 1 || super.anInt187 == 1) {
					this.anInt276++;
				}
				if (this.anInt326 == 2) {
					this.method105();
				}
				if (this.anInt326 == 2 && this.aBoolean54) {
					this.method201(this.aBoolean95);
				}
				for (local869 = 0; local869 < 5; local869++) {
					@Pc(986) int local986 = this.anIntArray65[local869]++;
				}
				this.method167();
				super.anInt180++;
				if (super.anInt180 > 4500) {
					this.anInt208 = 250;
					super.anInt180 -= 500;
					this.aClass1_Sub1_Sub3_2.method461(144);
				}
				this.anInt293++;
				if (this.anInt293 > 500) {
					this.anInt293 = 0;
					local871 = (int) (Math.random() * 8.0D);
					if ((local871 & 0x1) == 1) {
						this.anInt362 += this.anInt363;
					}
					if ((local871 & 0x2) == 2) {
						this.anInt274 += this.anInt275;
					}
					if ((local871 & 0x4) == 4) {
						this.anInt368 += this.anInt369;
					}
				}
				if (this.anInt362 < -50) {
					this.anInt363 = 2;
				}
				if (this.anInt362 > 50) {
					this.anInt363 = -2;
				}
				if (this.anInt274 < -55) {
					this.anInt275 = 2;
				}
				if (this.anInt274 > 55) {
					this.anInt275 = -2;
				}
				if (this.anInt368 < -40) {
					this.anInt369 = 1;
				}
				if (this.anInt368 > 40) {
					this.anInt369 = -1;
				}
				this.anInt356++;
				if (this.anInt356 > 500) {
					this.anInt356 = 0;
					local871 = (int) (Math.random() * 8.0D);
					if ((local871 & 0x1) == 1) {
						this.anInt383 += this.anInt384;
					}
					if ((local871 & 0x2) == 2) {
						this.anInt294 += this.anInt295;
					}
				}
				if (this.anInt383 < -60) {
					this.anInt384 = 2;
				}
				if (this.anInt383 > 60) {
					this.anInt384 = -2;
				}
				if (this.anInt294 < -20) {
					this.anInt295 = 1;
				}
				if (this.anInt294 > 10) {
					this.anInt295 = -1;
				}
				this.anInt207++;
				if (this.anInt207 > 50) {
					this.aClass1_Sub1_Sub3_2.method461(239);
				}
				try {
					if (this.aClass8_1 != null && this.aClass1_Sub1_Sub3_2.anInt715 > 0) {
						this.aClass8_1.method249(this.aClass1_Sub1_Sub3_2.anInt715, this.aClass1_Sub1_Sub3_2.aByteArray9);
						this.aClass1_Sub1_Sub3_2.anInt715 = 0;
						this.anInt207 = 0;
					}
				} catch (@Pc(1228) IOException local1228) {
					this.method166();
				} catch (@Pc(1233) Exception local1233) {
					this.method104(this.aByte14);
				}
			}
		} catch (@Pc(1239) RuntimeException local1239) {
			signlink.reporterror("39076, " + 0 + ", " + local1239.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method130() {
		try {
			this.aBoolean80 &= true;
			if (this.anInt267 == 2) {
				this.method227(this.anInt270 * 2, (this.anInt269 - this.anInt278 << 7) + this.anInt272, (this.anInt268 - this.anInt277 << 7) + this.anInt271);
				if (this.anInt287 > -1 && anInt375 % 20 < 10) {
					this.aClass1_Sub1_Sub2_Sub2Array7[2].method387(this.anInt288 - 28, this.anInt287 - 12);
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("68083, " + true + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method131() {
		try {
			while (true) {
				@Pc(9) Class1_Sub1_Sub4 local9 = this.aClass44_Sub1_1.method639();
				if (local9 == null) {
					return;
				}
				if (local9.anInt744 == 0) {
					Class1_Sub1_Sub1_Sub5.method257(local9.aByteArray10, local9.anInt745);
					if ((this.aClass44_Sub1_1.method635(local9.anInt745) & 0x62) != 0) {
						this.aBoolean56 = true;
						if (this.anInt316 != -1) {
							this.aBoolean68 = true;
						}
					}
				}
				if (local9.anInt744 == 1 && local9.aByteArray10 != null) {
					Class12.method300(local9.aByteArray10, 384);
				}
				if (local9.anInt744 == 2 && local9.anInt745 == this.anInt360 && local9.aByteArray10 != null) {
					this.method197((byte) 2, local9.aByteArray10, this.aBoolean87);
				}
				if (local9.anInt744 == 3 && this.anInt326 == 1) {
					for (@Pc(80) int local80 = 0; local80 < this.aByteArrayArray1.length; local80++) {
						if (this.anIntArray41[local80] == local9.anInt745) {
							this.aByteArrayArray1[local80] = local9.aByteArray10;
							if (local9.aByteArray10 == null) {
								this.anIntArray41[local80] = -1;
							}
							break;
						}
						if (this.anIntArray42[local80] == local9.anInt745) {
							this.aByteArrayArray2[local80] = local9.aByteArray10;
							if (local9.aByteArray10 == null) {
								this.anIntArray42[local80] = -1;
							}
							break;
						}
					}
				}
				if (local9.anInt744 == 93 && this.aClass44_Sub1_1.method634(local9.anInt745)) {
					Class4.method58(new Class1_Sub1_Sub3((byte) 3, local9.aByteArray10), this.aClass44_Sub1_1);
				}
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("57651, " + 58 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(JI)V")
	private void method132(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt378; local8++) {
					if (this.aLongArray4[local8] == arg0) {
						this.anInt378--;
						this.aBoolean56 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt378; local28++) {
							this.aLongArray4[local28] = this.aLongArray4[local28 + 1];
						}
						this.aClass1_Sub1_Sub3_2.method461(193);
						this.aClass1_Sub1_Sub3_2.method468(arg0);
						break;
					}
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("62944, " + arg0 + ", " + 604 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBILclient!gc;I)V")
	private void method134(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13 arg2, @OriginalArg(4) int arg3) {
		try {
			if (this.anInt222 < 400) {
				@Pc(9) String local9 = arg2.aString24;
				if (arg2.anInt541 != 0) {
					local9 = local9 + method142(arg2.anInt541, aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt124, this.aByte13) + " (level-" + arg2.anInt541 + ")";
				}
				if (this.anInt215 == 1) {
					this.aStringArray6[this.anInt222] = "Use " + this.aString5 + " with @yel@" + local9;
					this.anIntArray81[this.anInt222] = 829;
					this.anIntArray82[this.anInt222] = arg3;
					this.anIntArray79[this.anInt222] = arg1;
					this.anIntArray80[this.anInt222] = arg0;
					this.anInt222++;
				} else if (this.anInt199 != 1) {
					@Pc(154) int local154;
					if (arg2.aStringArray9 != null) {
						for (local154 = 4; local154 >= 0; local154--) {
							if (arg2.aStringArray9[local154] != null && !arg2.aStringArray9[local154].equalsIgnoreCase("attack")) {
								this.aStringArray6[this.anInt222] = arg2.aStringArray9[local154] + " @yel@" + local9;
								if (local154 == 0) {
									this.anIntArray81[this.anInt222] = 242;
								}
								if (local154 == 1) {
									this.anIntArray81[this.anInt222] = 209;
								}
								if (local154 == 2) {
									this.anIntArray81[this.anInt222] = 309;
								}
								if (local154 == 3) {
									this.anIntArray81[this.anInt222] = 852;
								}
								if (local154 == 4) {
									this.anIntArray81[this.anInt222] = 793;
								}
								this.anIntArray82[this.anInt222] = arg3;
								this.anIntArray79[this.anInt222] = arg1;
								this.anIntArray80[this.anInt222] = arg0;
								this.anInt222++;
							}
						}
					}
					if (arg2.aStringArray9 != null) {
						for (local154 = 4; local154 >= 0; local154--) {
							if (arg2.aStringArray9[local154] != null && arg2.aStringArray9[local154].equalsIgnoreCase("attack")) {
								@Pc(278) short local278 = 0;
								if (arg2.anInt541 > aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt124) {
									local278 = 2000;
								}
								this.aStringArray6[this.anInt222] = arg2.aStringArray9[local154] + " @yel@" + local9;
								if (local154 == 0) {
									this.anIntArray81[this.anInt222] = local278 + 242;
								}
								if (local154 == 1) {
									this.anIntArray81[this.anInt222] = local278 + 209;
								}
								if (local154 == 2) {
									this.anIntArray81[this.anInt222] = local278 + 309;
								}
								if (local154 == 3) {
									this.anIntArray81[this.anInt222] = local278 + 852;
								}
								if (local154 == 4) {
									this.anIntArray81[this.anInt222] = local278 + 793;
								}
								this.anIntArray82[this.anInt222] = arg3;
								this.anIntArray79[this.anInt222] = arg1;
								this.anIntArray80[this.anInt222] = arg0;
								this.anInt222++;
							}
						}
					}
					this.aStringArray6[this.anInt222] = "Examine @yel@" + local9;
					this.anIntArray81[this.anInt222] = 1714;
					this.anIntArray82[this.anInt222] = arg3;
					this.anIntArray79[this.anInt222] = arg1;
					this.anIntArray80[this.anInt222] = arg0;
					this.anInt222++;
				} else if ((this.anInt201 & 0x2) == 2) {
					this.aStringArray6[this.anInt222] = this.aString4 + " @yel@" + local9;
					this.anIntArray81[this.anInt222] = 240;
					this.anIntArray82[this.anInt222] = arg3;
					this.anIntArray79[this.anInt222] = arg1;
					this.anIntArray80[this.anInt222] = arg0;
					this.anInt222++;
					return;
				}
			}
		} catch (@Pc(428) RuntimeException local428) {
			signlink.reporterror("99744, " + arg0 + ", " + 5 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local428.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method92(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean86 = true;
			@Pc(6) boolean local6 = false;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("50327, " + arg0 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	@Override
	public void method94(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}
		if (signlink.mainapp == null) {
			super.method94(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method135() {
		try {
			this.aClass35_4.method516();
			@Pc(23) int local23 = this.anInt212 + this.anInt383 & 0x7FF;
			@Pc(30) int local30 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt961 / 32 + 48;
			@Pc(37) int local37 = 464 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962 / 32;
			this.aClass1_Sub1_Sub2_Sub2_13.method391(local30, 151, 5, this.anIntArray45, this.anInt294 + 256, 25, local23, 146, local37, this.anIntArray52);
			this.aClass1_Sub1_Sub2_Sub2_4.method391(25, 33, 0, this.anIntArray66, 256, 0, this.anInt212, 33, 25, this.anIntArray39);
			for (@Pc(75) int local75 = 0; local75 < this.anInt373; local75++) {
				local30 = this.anIntArray83[local75] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt961 / 32;
				local37 = this.anIntArray84[local75] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962 / 32;
				this.method190(local37, local30, this.aClass1_Sub1_Sub2_Sub2Array3[local75]);
			}
			@Pc(125) int local125;
			for (@Pc(121) int local121 = 0; local121 < 104; local121++) {
				for (local125 = 0; local125 < 104; local125++) {
					@Pc(137) Class29 local137 = this.aClass29ArrayArrayArray1[this.anInt386][local121][local125];
					if (local137 != null) {
						local30 = local121 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt961 / 32;
						local37 = local125 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962 / 32;
						this.method190(local37, local30, this.aClass1_Sub1_Sub2_Sub2_9);
					}
				}
			}
			for (local125 = 0; local125 < this.anInt357; local125++) {
				@Pc(188) Class1_Sub1_Sub1_Sub1_Sub2 local188 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray77[local125]];
				if (local188 != null && local188.method673() && local188.aClass13_2.aBoolean156) {
					local30 = local188.anInt961 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt961 / 32;
					local37 = local188.anInt962 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962 / 32;
					this.method190(local37, local30, this.aClass1_Sub1_Sub2_Sub2_10);
				}
			}
			@Pc(242) Class1_Sub1_Sub1_Sub1_Sub1 local242;
			for (@Pc(232) int local232 = 0; local232 < this.anInt390; local232++) {
				local242 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray89[local232]];
				if (local242 != null && local242.method673()) {
					local30 = local242.anInt961 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt961 / 32;
					local37 = local242.anInt962 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962 / 32;
					@Pc(270) boolean local270 = false;
					@Pc(274) long local274 = Class48.method659(local242.aString3);
					for (@Pc(276) int local276 = 0; local276 < this.anInt290; local276++) {
						if (local274 == this.aLongArray3[local276] && this.anIntArray48[local276] != 0) {
							local270 = true;
							break;
						}
					}
					if (local270) {
						this.method190(local37, local30, this.aClass1_Sub1_Sub2_Sub2_12);
					} else {
						this.method190(local37, local30, this.aClass1_Sub1_Sub2_Sub2_11);
					}
				}
			}
			if (this.anInt267 != 0 && anInt375 % 20 < 10) {
				if (this.anInt267 == 1 && this.anInt235 >= 0 && this.anInt235 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length) {
					@Pc(349) Class1_Sub1_Sub1_Sub1_Sub2 local349 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anInt235];
					if (local349 != null) {
						local30 = local349.anInt961 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt961 / 32;
						local37 = local349.anInt962 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962 / 32;
						this.method202(this.aClass1_Sub1_Sub2_Sub2_6, local30, (byte) 6, local37);
					}
				}
				if (this.anInt267 == 2) {
					local30 = (this.anInt268 - this.anInt277) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt961 / 32;
					local37 = (this.anInt269 - this.anInt278) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962 / 32;
					this.method202(this.aClass1_Sub1_Sub2_Sub2_6, local30, (byte) 6, local37);
				}
				if (this.anInt267 == 10 && this.anInt398 >= 0 && this.anInt398 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length) {
					local242 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anInt398];
					if (local242 != null) {
						local30 = local242.anInt961 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt961 / 32;
						local37 = local242.anInt962 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962 / 32;
						this.method202(this.aClass1_Sub1_Sub2_Sub2_6, local30, (byte) 6, local37);
					}
				}
			}
			if (this.anInt358 != 0) {
				local30 = this.anInt358 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt961 / 32;
				local37 = this.anInt359 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962 / 32;
				this.method190(local37, local30, this.aClass1_Sub1_Sub2_Sub2_5);
			}
			Class1_Sub1_Sub2.method435(16777215, 3, 78, 3, 97);
			this.aClass35_5.method516();
		} catch (@Pc(514) RuntimeException local514) {
			signlink.reporterror("79471, " + 729 + ", " + local514.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method136() {
		try {
			this.anInt317 = 0;
			@Pc(53) int local53;
			@Pc(73) int local73;
			for (@Pc(6) int local6 = -1; local6 < this.anInt390 + this.anInt357; local6++) {
				@Pc(13) Class1_Sub1_Sub1_Sub1 local13;
				if (local6 == -1) {
					local13 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
				} else if (local6 < this.anInt390) {
					local13 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray89[local6]];
				} else {
					local13 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray77[local6 - this.anInt390]];
				}
				if (local13 != null && local13.method673()) {
					if (local6 >= this.anInt390) {
						@Pc(146) Class13 local146 = ((Class1_Sub1_Sub1_Sub1_Sub2) local13).aClass13_2;
						if (local146.anInt546 >= 0 && local146.anInt546 < this.aClass1_Sub1_Sub2_Sub2Array7.length) {
							this.method226(local13.anInt1002 + 15, local13);
							if (this.anInt287 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array7[local146.anInt546].method387(this.anInt288 - 30, this.anInt287 - 12);
							}
						}
						if (this.anInt267 == 1 && this.anInt235 == this.anIntArray77[local6 - this.anInt390] && anInt375 % 20 < 10) {
							this.method226(local13.anInt1002 + 15, local13);
							if (this.anInt287 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array7[2].method387(this.anInt288 - 28, this.anInt287 - 12);
							}
						}
					} else {
						local53 = 30;
						@Pc(56) Class1_Sub1_Sub1_Sub1_Sub1 local56 = (Class1_Sub1_Sub1_Sub1_Sub1) local13;
						if (local56.anInt123 != 0) {
							this.method226(local13.anInt1002 + 15, local13);
							if (this.anInt287 > -1) {
								for (local73 = 0; local73 < 8; local73++) {
									if ((local56.anInt123 & 0x1 << local73) != 0) {
										this.aClass1_Sub1_Sub2_Sub2Array7[local73].method387(this.anInt288 - local53, this.anInt287 - 12);
										local53 -= 25;
									}
								}
							}
						}
						if (local6 >= 0 && this.anInt267 == 10 && this.anInt398 == this.anIntArray89[local6]) {
							this.method226(local13.anInt1002 + 15, local13);
							if (this.anInt287 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array7[7].method387(this.anInt288 - local53, this.anInt287 - 12);
							}
						}
					}
					if (local13.aString31 != null && (local6 >= this.anInt390 || this.anInt260 == 0 || this.anInt260 == 3 || this.anInt260 == 1 && this.method119(this.anInt400, ((Class1_Sub1_Sub1_Sub1_Sub1) local13).aString3))) {
						this.method226(local13.anInt1002, local13);
						if (this.anInt287 > -1 && this.anInt317 < this.anInt318) {
							this.anIntArray71[this.anInt317] = this.aClass1_Sub1_Sub2_Sub4_3.method444(local13.aString31) / 2;
							this.anIntArray70[this.anInt317] = this.aClass1_Sub1_Sub2_Sub4_3.anInt682;
							this.anIntArray68[this.anInt317] = this.anInt287;
							this.anIntArray69[this.anInt317] = this.anInt288;
							this.anIntArray72[this.anInt317] = local13.anInt973;
							this.anIntArray73[this.anInt317] = local13.anInt974;
							this.anIntArray74[this.anInt317] = local13.anInt972;
							this.aStringArray5[this.anInt317++] = local13.aString31;
							if (this.anInt238 == 0 && local13.anInt974 == 1) {
								this.anIntArray70[this.anInt317] += 10;
								this.anIntArray69[this.anInt317] += 5;
							}
							if (this.anInt238 == 0 && local13.anInt974 == 2) {
								this.anIntArray71[this.anInt317] = 60;
							}
						}
					}
					if (local13.anInt975 > anInt375) {
						this.method226(local13.anInt1002 + 15, local13);
						if (this.anInt287 > -1) {
							local53 = local13.anInt976 * 30 / local13.anInt977;
							if (local53 > 30) {
								local53 = 30;
							}
							Class1_Sub1_Sub2.method435(65280, local53, this.anInt288 - 3, 5, this.anInt287 - 15);
							Class1_Sub1_Sub2.method435(16711680, 30 - local53, this.anInt288 - 3, 5, this.anInt287 + local53 - 15);
						}
					}
					for (local53 = 0; local53 < 4; local53++) {
						if (local13.anIntArray268[local53] > anInt375) {
							this.method226(local13.anInt1002 / 2, local13);
							if (this.anInt287 > -1) {
								if (local53 == 1) {
									this.anInt288 -= 20;
								}
								if (local53 == 2) {
									this.anInt287 -= 15;
									this.anInt288 -= 10;
								}
								if (local53 == 3) {
									this.anInt287 += 15;
									this.anInt288 -= 10;
								}
								this.aClass1_Sub1_Sub2_Sub2Array6[local13.anIntArray267[local53]].method387(this.anInt288 - 12, this.anInt287 - 12);
								this.aClass1_Sub1_Sub2_Sub4_1.method442(this.anInt287, this.anInt288 + 4, 0, String.valueOf(local13.anIntArray266[local53]));
								this.aClass1_Sub1_Sub2_Sub4_1.method442(this.anInt287 - 1, this.anInt288 + 3, 16777215, String.valueOf(local13.anIntArray266[local53]));
							}
						}
					}
				}
			}
			for (@Pc(565) int local565 = 0; local565 < this.anInt317; local565++) {
				local53 = this.anIntArray68[local565];
				@Pc(577) int local577 = this.anIntArray69[local565];
				local73 = this.anIntArray71[local565];
				@Pc(587) int local587 = this.anIntArray70[local565];
				@Pc(589) boolean local589 = true;
				while (local589) {
					local589 = false;
					for (@Pc(595) int local595 = 0; local595 < local565; local595++) {
						if (local577 + 2 > this.anIntArray69[local595] - this.anIntArray70[local595] && local577 - local587 < this.anIntArray69[local595] + 2 && local53 - local73 < this.anIntArray68[local595] + this.anIntArray71[local595] && local53 + local73 > this.anIntArray68[local595] - this.anIntArray71[local595] && this.anIntArray69[local595] - this.anIntArray70[local595] < local577) {
							local577 = this.anIntArray69[local595] - this.anIntArray70[local595];
							local589 = true;
						}
					}
				}
				this.anInt287 = this.anIntArray68[local565];
				this.anInt288 = this.anIntArray69[local565] = local577;
				@Pc(694) String local694 = this.aStringArray5[local565];
				if (this.anInt238 == 0) {
					@Pc(699) int local699 = 16776960;
					if (this.anIntArray72[local565] < 6) {
						local699 = this.anIntArray31[this.anIntArray72[local565]];
					}
					if (this.anIntArray72[local565] == 6) {
						local699 = this.anInt311 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray72[local565] == 7) {
						local699 = this.anInt311 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray72[local565] == 8) {
						local699 = this.anInt311 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(774) int local774;
					if (this.anIntArray72[local565] == 9) {
						local774 = 150 - this.anIntArray74[local565];
						if (local774 < 50) {
							local699 = local774 * 1280 + 16711680;
						} else if (local774 < 100) {
							local699 = 16776960 - (local774 - 50) * 327680;
						} else if (local774 < 150) {
							local699 = (local774 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray72[local565] == 10) {
						local774 = 150 - this.anIntArray74[local565];
						if (local774 < 50) {
							local699 = local774 * 5 + 16711680;
						} else if (local774 < 100) {
							local699 = 16711935 - (local774 - 50) * 327680;
						} else if (local774 < 150) {
							local699 = (local774 - 100) * 327680 + 255 - (local774 - 100) * 5;
						}
					}
					if (this.anIntArray72[local565] == 11) {
						local774 = 150 - this.anIntArray74[local565];
						if (local774 < 50) {
							local699 = 16777215 - local774 * 327685;
						} else if (local774 < 100) {
							local699 = (local774 - 50) * 327685 + 65280;
						} else if (local774 < 150) {
							local699 = 16777215 - (local774 - 100) * 327680;
						}
					}
					if (this.anIntArray73[local565] == 0) {
						this.aClass1_Sub1_Sub2_Sub4_3.method442(this.anInt287, this.anInt288 + 1, 0, local694);
						this.aClass1_Sub1_Sub2_Sub4_3.method442(this.anInt287, this.anInt288, local699, local694);
					}
					if (this.anIntArray73[local565] == 1) {
						this.aClass1_Sub1_Sub2_Sub4_3.method446(this.anInt311, 0, this.anInt287, local694, this.anInt288 + 1);
						this.aClass1_Sub1_Sub2_Sub4_3.method446(this.anInt311, local699, this.anInt287, local694, this.anInt288);
					}
					if (this.anIntArray73[local565] == 2) {
						local774 = this.aClass1_Sub1_Sub2_Sub4_3.method444(local694);
						@Pc(995) int local995 = (150 - this.anIntArray74[local565]) * (local774 + 100) / 150;
						Class1_Sub1_Sub2.method432(this.anInt287 - 50, this.anInt287 + 50, 0, 334);
						this.aClass1_Sub1_Sub2_Sub4_3.method445(this.anInt287 + 50 - local995, 474, 0, local694, this.anInt288 + 1);
						this.aClass1_Sub1_Sub2_Sub4_3.method445(this.anInt287 + 50 - local995, 474, local699, local694, this.anInt288);
						Class1_Sub1_Sub2.method431();
					}
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method442(this.anInt287, this.anInt288 + 1, 0, local694);
					this.aClass1_Sub1_Sub2_Sub4_3.method442(this.anInt287, this.anInt288, 16776960, local694);
				}
			}
		} catch (@Pc(1070) RuntimeException local1070) {
			signlink.reporterror("66863, " + 5 + ", " + local1070.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZII)V")
	private void method137(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(11) int local11 = 0;
			for (@Pc(13) int local13 = 0; local13 < 100; local13++) {
				if (this.aStringArray2[local13] != null) {
					@Pc(25) int local25 = this.anIntArray38[local13];
					@Pc(36) int local36 = this.anInt377 + 70 + 4 - local11 * 14;
					if (local36 < -20) {
						break;
					}
					@Pc(44) String local44 = this.aStringArray1[local13];
					if (local44 != null && local44.startsWith("@cr1@")) {
						local44 = local44.substring(5);
					}
					if (local44 != null && local44.startsWith("@cr2@")) {
						local44 = local44.substring(5);
					}
					if (local25 == 0) {
						local11++;
					}
					if ((local25 == 1 || local25 == 2) && (local25 == 1 || this.anInt260 == 0 || this.anInt260 == 1 && this.method119(this.anInt400, local44))) {
						if (arg1 > local36 - 14 && arg1 <= local36 && !local44.equals(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3)) {
							if (this.anInt361 >= 1) {
								this.aStringArray6[this.anInt222] = "Report abuse @whi@" + local44;
								this.anIntArray81[this.anInt222] = 524;
								this.anInt222++;
							}
							this.aStringArray6[this.anInt222] = "Add ignore @whi@" + local44;
							this.anIntArray81[this.anInt222] = 47;
							this.anInt222++;
							this.aStringArray6[this.anInt222] = "Add friend @whi@" + local44;
							this.anIntArray81[this.anInt222] = 605;
							this.anInt222++;
						}
						local11++;
					}
					if ((local25 == 3 || local25 == 7) && this.anInt210 == 0 && (local25 == 7 || this.anInt224 == 0 || this.anInt224 == 1 && this.method119(this.anInt400, local44))) {
						if (arg1 > local36 - 14 && arg1 <= local36) {
							if (this.anInt361 >= 1) {
								this.aStringArray6[this.anInt222] = "Report abuse @whi@" + local44;
								this.anIntArray81[this.anInt222] = 524;
								this.anInt222++;
							}
							this.aStringArray6[this.anInt222] = "Add ignore @whi@" + local44;
							this.anIntArray81[this.anInt222] = 47;
							this.anInt222++;
							this.aStringArray6[this.anInt222] = "Add friend @whi@" + local44;
							this.anIntArray81[this.anInt222] = 605;
							this.anInt222++;
						}
						local11++;
					}
					if (local25 == 4 && (this.anInt348 == 0 || this.anInt348 == 1 && this.method119(this.anInt400, local44))) {
						if (arg1 > local36 - 14 && arg1 <= local36) {
							this.aStringArray6[this.anInt222] = "Accept trade @whi@" + local44;
							this.anIntArray81[this.anInt222] = 507;
							this.anInt222++;
						}
						local11++;
					}
					if ((local25 == 5 || local25 == 6) && this.anInt210 == 0 && this.anInt224 < 2) {
						local11++;
					}
					if (local25 == 8 && (this.anInt348 == 0 || this.anInt348 == 1 && this.method119(this.anInt400, local44))) {
						if (arg1 > local36 - 14 && arg1 <= local36) {
							this.aStringArray6[this.anInt222] = "Accept duel @whi@" + local44;
							this.anIntArray81[this.anInt222] = 957;
							this.anInt222++;
						}
						local11++;
					}
				}
			}
		} catch (@Pc(413) RuntimeException local413) {
			signlink.reporterror("35666, " + false + ", " + arg0 + ", " + arg1 + ", " + local413.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method138(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			if (this.aClass35_19 == null) {
				super.aClass35_2 = null;
				this.aClass35_6 = null;
				this.aClass35_4 = null;
				this.aClass35_3 = null;
				this.aClass35_5 = null;
				this.aClass35_16 = null;
				this.aClass35_17 = null;
				this.aClass35_18 = null;
				this.aClass35_22 = new Class35(128, false, this.method93(), 265);
				Class1_Sub1_Sub2.method433();
				this.aClass35_23 = new Class35(128, false, this.method93(), 265);
				Class1_Sub1_Sub2.method433();
				this.aClass35_19 = new Class35(509, false, this.method93(), 171);
				Class1_Sub1_Sub2.method433();
				this.aClass35_20 = new Class35(360, false, this.method93(), 132);
				Class1_Sub1_Sub2.method433();
				this.aClass35_21 = new Class35(360, false, this.method93(), 200);
				Class1_Sub1_Sub2.method433();
				this.aClass35_24 = new Class35(202, false, this.method93(), 238);
				Class1_Sub1_Sub2.method433();
				this.aClass35_25 = new Class35(203, false, this.method93(), 238);
				Class1_Sub1_Sub2.method433();
				this.aClass35_26 = new Class35(74, false, this.method93(), 94);
				Class1_Sub1_Sub2.method433();
				this.aClass35_27 = new Class35(75, false, this.method93(), 94);
				Class1_Sub1_Sub2.method433();
				if (this.aClass47_1 != null) {
					this.method163();
					this.method140();
				}
				this.aBoolean86 = true;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("11792, " + arg0 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method139(@OriginalArg(1) boolean arg0) {
		try {
			this.method138(467);
			this.aClass35_21.method516();
			this.aClass1_Sub1_Sub2_Sub3_9.method414(0, 0);
			@Pc(52) byte local52;
			@Pc(64) int local64;
			if (this.anInt258 == 0) {
				this.aClass1_Sub1_Sub2_Sub4_1.method443(this.aClass44_Sub1_1.aString30, 180, 7711145, true, 180);
				local52 = 80;
				this.aClass1_Sub1_Sub2_Sub4_3.method443("Welcome to RuneScape", 80, 16776960, true, 180);
				local64 = local52 + 30;
				this.aClass1_Sub1_Sub2_Sub3_10.method414(100, 27);
				this.aClass1_Sub1_Sub2_Sub4_3.method443("New User", 125, 16777215, true, 100);
				this.aClass1_Sub1_Sub2_Sub3_10.method414(100, 187);
				this.aClass1_Sub1_Sub2_Sub4_3.method443("Existing User", 125, 16777215, true, 260);
			}
			if (this.anInt258 == 2) {
				local52 = 60;
				if (this.aString12.length() > 0) {
					this.aClass1_Sub1_Sub2_Sub4_3.method443(this.aString12, 45, 16776960, true, 180);
					this.aClass1_Sub1_Sub2_Sub4_3.method443(this.aString13, 60, 16776960, true, 180);
					local64 = local52 + 30;
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method443(this.aString13, 53, 16776960, true, 180);
					local64 = local52 + 30;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method447("Username: " + this.aString6 + (this.anInt321 == 0 & anInt375 % 40 < 20 ? "@yel@|" : ""), 90, 16777215, 90, true);
				local64 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method447("Password: " + Class48.method665(this.aString7, this.anInt353) + (this.anInt321 == 1 & anInt375 % 40 < 20 ? "@yel@|" : ""), 105, 16777215, 92, true);
				local64 += 15;
				if (!arg0) {
					this.aClass1_Sub1_Sub2_Sub3_10.method414(130, 27);
					this.aClass1_Sub1_Sub2_Sub4_3.method443("Login", 155, 16777215, true, 100);
					this.aClass1_Sub1_Sub2_Sub3_10.method414(130, 187);
					this.aClass1_Sub1_Sub2_Sub4_3.method443("Cancel", 155, 16777215, true, 260);
				}
			}
			if (this.anInt258 == 3) {
				this.aClass1_Sub1_Sub2_Sub4_3.method443("Create a free account", 40, 16776960, true, 180);
				local52 = 65;
				this.aClass1_Sub1_Sub2_Sub4_3.method443("To create a new account you need to", 65, 16777215, true, 180);
				local64 = local52 + 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method443("go back to the main RuneScape webpage", 80, 16777215, true, 180);
				local64 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method443("and choose the red 'create account'", 95, 16777215, true, 180);
				local64 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method443("button at the top right of that page.", 110, 16777215, true, 180);
				local64 += 15;
				this.aClass1_Sub1_Sub2_Sub3_10.method414(130, 107);
				this.aClass1_Sub1_Sub2_Sub4_3.method443("Cancel", 155, 16777215, true, 180);
			}
			this.aClass35_21.method517(202, 171, super.aGraphics2);
			if (this.aBoolean86) {
				this.aBoolean86 = false;
				this.aClass35_19.method517(128, 0, super.aGraphics2);
				this.aClass35_20.method517(202, 371, super.aGraphics2);
				this.aClass35_24.method517(0, 265, super.aGraphics2);
				this.aClass35_25.method517(562, 265, super.aGraphics2);
				this.aClass35_26.method517(128, 171, super.aGraphics2);
				this.aClass35_27.method517(562, 171, super.aGraphics2);
			}
		} catch (@Pc(498) RuntimeException local498) {
			signlink.reporterror("21091, " + -13247 + ", " + arg0 + ", " + local498.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method140() {
		try {
			this.aClass1_Sub1_Sub2_Sub3_9 = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "titlebox", 0);
			this.aClass1_Sub1_Sub2_Sub3_10 = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "titlebutton", 0);
			this.aClass1_Sub1_Sub2_Sub3Array4 = new Class1_Sub1_Sub2_Sub3[12];
			@Pc(32) int local32 = 0;
			try {
				local32 = Integer.parseInt(this.getParameter("fl_icon"));
			} catch (@Pc(39) Exception local39) {
			}
			@Pc(43) int local43;
			if (local32 == 0) {
				for (local43 = 0; local43 < 12; local43++) {
					this.aClass1_Sub1_Sub2_Sub3Array4[local43] = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "runes", local43);
				}
			} else {
				for (local43 = 0; local43 < 12; local43++) {
					this.aClass1_Sub1_Sub2_Sub3Array4[local43] = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "runes", (local43 & 0x3) + 12);
				}
			}
			this.aClass1_Sub1_Sub2_Sub2_7 = new Class1_Sub1_Sub2_Sub2(128, 265);
			this.aClass1_Sub1_Sub2_Sub2_8 = new Class1_Sub1_Sub2_Sub2(128, 265);
			for (local43 = 0; local43 < 33920; local43++) {
				this.aClass1_Sub1_Sub2_Sub2_7.anIntArray205[local43] = this.aClass35_22.anIntArray228[local43];
			}
			for (@Pc(119) int local119 = 0; local119 < 33920; local119++) {
				this.aClass1_Sub1_Sub2_Sub2_8.anIntArray205[local119] = this.aClass35_23.anIntArray228[local119];
			}
			this.anIntArray55 = new int[256];
			for (@Pc(141) int local141 = 0; local141 < 64; local141++) {
				this.anIntArray55[local141] = local141 * 262144;
			}
			for (@Pc(156) int local156 = 0; local156 < 64; local156++) {
				this.anIntArray55[local156 + 64] = local156 * 1024 + 16711680;
			}
			for (@Pc(175) int local175 = 0; local175 < 64; local175++) {
				this.anIntArray55[local175 + 128] = local175 * 4 + 16776960;
			}
			for (@Pc(194) int local194 = 0; local194 < 64; local194++) {
				this.anIntArray55[local194 + 192] = 16777215;
			}
			this.anIntArray56 = new int[256];
			for (@Pc(213) int local213 = 0; local213 < 64; local213++) {
				this.anIntArray56[local213] = local213 * 1024;
			}
			for (@Pc(228) int local228 = 0; local228 < 64; local228++) {
				this.anIntArray56[local228 + 64] = local228 * 4 + 65280;
			}
			for (@Pc(247) int local247 = 0; local247 < 64; local247++) {
				this.anIntArray56[local247 + 128] = local247 * 262144 + 65535;
			}
			for (@Pc(266) int local266 = 0; local266 < 64; local266++) {
				this.anIntArray56[local266 + 192] = 16777215;
			}
			this.anIntArray57 = new int[256];
			for (@Pc(285) int local285 = 0; local285 < 64; local285++) {
				this.anIntArray57[local285] = local285 * 4;
			}
			for (@Pc(300) int local300 = 0; local300 < 64; local300++) {
				this.anIntArray57[local300 + 64] = local300 * 262144 + 255;
			}
			for (@Pc(319) int local319 = 0; local319 < 64; local319++) {
				this.anIntArray57[local319 + 128] = local319 * 1024 + 16711935;
			}
			for (@Pc(338) int local338 = 0; local338 < 64; local338++) {
				this.anIntArray57[local338 + 192] = 16777215;
			}
			this.anIntArray54 = new int[256];
			this.anIntArray34 = new int[32768];
			this.anIntArray35 = new int[32768];
			this.method153(602, null);
			this.anIntArray60 = new int[32768];
			this.anIntArray61 = new int[32768];
			this.method95(10, "Connecting to fileserver");
			if (!this.aBoolean83) {
				this.aBoolean78 = true;
				this.aBoolean83 = true;
				this.method94(this, 2);
			}
		} catch (@Pc(395) RuntimeException local395) {
			signlink.reporterror("54059, " + 8 + ", " + local395.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZI)V")
	private void method141(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		try {
			this.aBoolean80 &= true;
			signlink.anInt917 = arg1;
			if (arg0) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("67490, " + arg0 + ", " + true + ", " + arg1 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/lang/String;)V")
	@Override
	protected void method95(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		try {
			this.anInt301 = arg0;
			this.aString17 = arg1;
			this.method138(467);
			if (this.aClass47_1 == null) {
				super.method95(arg0, arg1);
			} else {
				this.aClass35_21.method516();
				this.aClass1_Sub1_Sub2_Sub4_3.method442(180, 54, 16777215, "RuneScape is loading - please wait...");
				Class1_Sub1_Sub2.method436(304, 34, 28, 62, 9179409);
				Class1_Sub1_Sub2.method436(302, 32, 29, 63, 0);
				Class1_Sub1_Sub2.method435(9179409, arg0 * 3, 64, 30, 30);
				Class1_Sub1_Sub2.method435(0, 300 - arg0 * 3, 64, 30, arg0 * 3 + 30);
				this.aClass1_Sub1_Sub2_Sub4_3.method442(180, 85, 16777215, arg1);
				this.aClass35_21.method517(202, 171, super.aGraphics2);
				if (this.aBoolean86) {
					this.aBoolean86 = false;
					if (!this.aBoolean83) {
						this.aClass35_22.method517(0, 0, super.aGraphics2);
						this.aClass35_23.method517(637, 0, super.aGraphics2);
					}
					this.aClass35_19.method517(128, 0, super.aGraphics2);
					this.aClass35_20.method517(202, 371, super.aGraphics2);
					this.aClass35_24.method517(0, 265, super.aGraphics2);
					this.aClass35_25.method517(562, 265, super.aGraphics2);
					this.aClass35_26.method517(128, 171, super.aGraphics2);
					this.aClass35_27.method517(562, 171, super.aGraphics2);
				}
			}
		} catch (@Pc(217) RuntimeException local217) {
			signlink.reporterror("28844, " + 4 + ", " + arg0 + ", " + arg1 + ", " + local217.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method143() {
		try {
			if (this.anInt326 == 2) {
				for (@Pc(18) Class1_Sub2 local18 = (Class1_Sub2) this.aClass29_1.method503(); local18 != null; local18 = (Class1_Sub2) this.aClass29_1.method505()) {
					if (local18.anInt766 > 0) {
						local18.anInt766--;
					}
					if (local18.anInt766 != 0) {
						if (local18.anInt765 > 0) {
							local18.anInt765--;
						}
						if (local18.anInt765 == 0 && local18.anInt757 >= 1 && local18.anInt758 >= 1 && local18.anInt757 <= 102 && local18.anInt758 <= 102 && (local18.anInt762 < 0 || Class4.method71((byte) 4, local18.anInt764, local18.anInt762))) {
							this.method158(local18.anInt762, local18.anInt756, local18.anInt755, local18.anInt758, local18.anInt757, local18.anInt764, local18.anInt763);
							local18.anInt765 = -1;
							if (local18.anInt762 == local18.anInt759 && local18.anInt759 == -1) {
								local18.method666();
							} else if (local18.anInt762 == local18.anInt759 && local18.anInt763 == local18.anInt760 && local18.anInt764 == local18.anInt761) {
								local18.method666();
							}
						}
					} else if (local18.anInt759 < 0 || Class4.method71((byte) 4, local18.anInt761, local18.anInt759)) {
						this.method158(local18.anInt759, local18.anInt756, local18.anInt755, local18.anInt758, local18.anInt757, local18.anInt761, local18.anInt760);
						local18.method666();
					}
				}
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("96825, " + 61 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!lb;II)V")
	private void method144(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg1 <= 0) {
				this.anInt205 = -1;
			}
			for (@Pc(8) int local8 = 0; local8 < this.anInt391; local8++) {
				@Pc(15) int local15 = this.anIntArray90[local8];
				@Pc(20) Class1_Sub1_Sub1_Sub1_Sub2 local20 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local15];
				@Pc(23) int local23 = arg0.method472();
				@Pc(31) int local31;
				@Pc(34) int local34;
				if ((local23 & 0x1) == 1) {
					local31 = arg0.method472();
					local34 = arg0.method472();
					local20.method674(anInt375, local34, local31);
					local20.anInt975 = anInt375 + 300;
					local20.anInt976 = arg0.method472();
					local20.anInt977 = arg0.method472();
				}
				if ((local23 & 0x2) == 2) {
					local31 = arg0.method474();
					if (local31 == 65535) {
						local31 = -1;
					}
					if (local31 == local20.anInt984) {
						local20.anInt988 = 0;
					}
					local34 = arg0.method472();
					if (local31 == local20.anInt984 && local31 != -1) {
						@Pc(88) int local88 = Class27.aClass27Array1[local31].anInt776;
						if (local88 == 1) {
							local20.anInt985 = 0;
							local20.anInt986 = 0;
							local20.anInt987 = local34;
							local20.anInt988 = 0;
						}
						if (local88 == 2) {
							local20.anInt988 = 0;
						}
					} else if (local31 == -1 || local20.anInt984 == -1 || Class27.aClass27Array1[local31].anInt770 >= Class27.aClass27Array1[local20.anInt984].anInt770) {
						local20.anInt984 = local31;
						local20.anInt985 = 0;
						local20.anInt986 = 0;
						local20.anInt987 = local34;
						local20.anInt988 = 0;
						local20.anInt1007 = local20.anInt1005;
					}
				}
				if ((local23 & 0x4) == 4) {
					local20.anInt978 = arg0.method474();
					if (local20.anInt978 == 65535) {
						local20.anInt978 = -1;
					}
				}
				if ((local23 & 0x8) == 8) {
					local20.aString31 = arg0.method479();
					local20.anInt972 = 100;
				}
				if ((local23 & 0x10) == 16) {
					local31 = arg0.method472();
					local34 = arg0.method472();
					local20.method674(anInt375, local34, local31);
					local20.anInt975 = anInt375 + 300;
					local20.anInt976 = arg0.method472();
					local20.anInt977 = arg0.method472();
				}
				if ((local23 & 0x20) == 32) {
					local20.aClass13_2 = Class13.method320(arg0.method474());
					local20.anInt964 = local20.aClass13_2.aByte19;
					local20.anInt1004 = local20.aClass13_2.anInt547;
					local20.anInt967 = local20.aClass13_2.anInt534;
					local20.anInt968 = local20.aClass13_2.anInt535;
					local20.anInt969 = local20.aClass13_2.anInt536;
					local20.anInt970 = local20.aClass13_2.anInt537;
					local20.anInt965 = local20.aClass13_2.anInt533;
				}
				if ((local23 & 0x40) == 64) {
					local20.anInt989 = arg0.method474();
					local31 = arg0.method477();
					local20.anInt993 = local31 >> 16;
					local20.anInt992 = anInt375 + (local31 & 0xFFFF);
					local20.anInt990 = 0;
					local20.anInt991 = 0;
					if (local20.anInt992 > anInt375) {
						local20.anInt990 = -1;
					}
					if (local20.anInt989 == 65535) {
						local20.anInt989 = -1;
					}
				}
				if ((local23 & 0x80) == 128) {
					local20.anInt979 = arg0.method474();
					local20.anInt980 = arg0.method474();
				}
			}
		} catch (@Pc(314) RuntimeException local314) {
			signlink.reporterror("52153, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local314.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method145() {
		try {
			if (this.anInt222 >= 2 || this.anInt215 != 0 || this.anInt199 != 0) {
				@Pc(39) String local39;
				if (this.anInt215 == 1 && this.anInt222 < 2) {
					local39 = "Use " + this.aString5 + " with...";
				} else if (this.anInt199 == 1 && this.anInt222 < 2) {
					local39 = this.aString4 + "...";
				} else {
					local39 = this.aStringArray6[this.anInt222 - 1];
				}
				if (this.anInt222 > 2) {
					local39 = local39 + "@whi@ / " + (this.anInt222 - 2) + " more options";
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method448(anInt375 / 1000, local39, 16777215, 4, 15);
			}
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("15329, " + 2 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;I)Z")
	private boolean method146(@OriginalArg(0) Class6 arg0) {
		try {
			@Pc(9) int local9 = arg0.anInt410;
			if (this.anInt291 == 2) {
				if (local9 == 201) {
					this.aBoolean68 = true;
					this.aBoolean97 = false;
					this.aBoolean70 = true;
					this.aString11 = "";
					this.anInt198 = 1;
					this.aString10 = "Enter name of friend to add to list";
				}
				if (local9 == 202) {
					this.aBoolean68 = true;
					this.aBoolean97 = false;
					this.aBoolean70 = true;
					this.aString11 = "";
					this.anInt198 = 2;
					this.aString10 = "Enter name of friend to delete from list";
				}
			}
			if (local9 == 205) {
				this.anInt208 = 250;
				return true;
			}
			if (local9 == 501) {
				this.aBoolean68 = true;
				this.aBoolean97 = false;
				this.aBoolean70 = true;
				this.aString11 = "";
				this.anInt198 = 4;
				this.aString10 = "Enter name of player to add to list";
			}
			if (local9 == 502) {
				this.aBoolean68 = true;
				this.aBoolean97 = false;
				this.aBoolean70 = true;
				this.aString11 = "";
				this.anInt198 = 5;
				this.aString10 = "Enter name of player to delete from list";
			}
			@Pc(117) int local117;
			@Pc(121) int local121;
			@Pc(126) int local126;
			if (local9 >= 300 && local9 <= 313) {
				local117 = (local9 - 300) / 2;
				local121 = local9 & 0x1;
				local126 = this.anIntArray53[local117];
				if (local126 != -1) {
					while (true) {
						if (local121 == 0) {
							local126--;
							if (local126 < 0) {
								local126 = Class23.anInt724 - 1;
							}
						}
						if (local121 == 1) {
							local126++;
							if (local126 >= Class23.anInt724) {
								local126 = 0;
							}
						}
						if (!Class23.aClass23Array1[local126].aBoolean206 && Class23.aClass23Array1[local126].anInt725 == local117 + (this.aBoolean63 ? 0 : 7)) {
							this.anIntArray53[local117] = local126;
							this.aBoolean82 = true;
							break;
						}
					}
				}
			}
			if (local9 >= 314 && local9 <= 323) {
				local117 = (local9 - 314) / 2;
				local121 = local9 & 0x1;
				local126 = this.anIntArray85[local117];
				if (local121 == 0) {
					local126--;
					if (local126 < 0) {
						local126 = anIntArrayArray5[local117].length - 1;
					}
				}
				if (local121 == 1) {
					local126++;
					if (local126 >= anIntArrayArray5[local117].length) {
						local126 = 0;
					}
				}
				this.anIntArray85[local117] = local126;
				this.aBoolean82 = true;
			}
			if (local9 == 324 && !this.aBoolean63) {
				this.aBoolean63 = true;
				this.method125((byte) 3);
			}
			if (local9 == 325 && this.aBoolean63) {
				this.aBoolean63 = false;
				this.method125((byte) 3);
			}
			if (local9 == 326) {
				this.aClass1_Sub1_Sub3_2.method461(13);
				this.aClass1_Sub1_Sub3_2.method462(this.aBoolean63 ? 0 : 1);
				for (local117 = 0; local117 < 7; local117++) {
					this.aClass1_Sub1_Sub3_2.method462(this.anIntArray53[local117]);
				}
				for (local121 = 0; local121 < 5; local121++) {
					this.aClass1_Sub1_Sub3_2.method462(this.anIntArray85[local121]);
				}
				return true;
			}
			if (local9 == 613) {
				this.aBoolean60 = !this.aBoolean60;
			}
			if (local9 >= 601 && local9 <= 612) {
				this.method124();
				if (this.aString8.length() > 0) {
					this.aClass1_Sub1_Sub3_2.method461(203);
					this.aClass1_Sub1_Sub3_2.method468(Class48.method659(this.aString8));
					this.aClass1_Sub1_Sub3_2.method462(local9 - 601);
					this.aClass1_Sub1_Sub3_2.method462(this.aBoolean60 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(354) RuntimeException local354) {
			signlink.reporterror("13702, " + arg0 + ", " + -805 + ", " + local354.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;ZIIIIZII)V")
	private void method147(@OriginalArg(0) Class6 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (this.aBoolean96) {
				this.anInt248 = 32;
			} else {
				this.anInt248 = 0;
			}
			this.aBoolean96 = false;
			if (arg6 >= arg1 && arg6 < arg1 + 16 && arg7 >= arg3 && arg7 < arg3 + 16) {
				arg0.anInt417 -= this.anInt276 * 4;
				if (arg5) {
					this.aBoolean56 = true;
					return;
				}
			} else if (arg6 >= arg1 && arg6 < arg1 + 16 && arg7 >= arg3 + arg2 - 16 && arg7 < arg3 + arg2) {
				arg0.anInt417 += this.anInt276 * 4;
				if (arg5) {
					this.aBoolean56 = true;
					return;
				}
			} else if (arg6 >= arg1 - this.anInt248 && arg6 < arg1 + this.anInt248 + 16 && arg7 >= arg3 + 16 && arg7 < arg3 + arg2 - 16 && this.anInt276 > 0) {
				@Pc(123) int local123 = (arg2 - 32) * arg2 / arg4;
				if (local123 < 8) {
					local123 = 8;
				}
				@Pc(138) int local138 = arg7 - arg3 - local123 / 2 - 16;
				@Pc(144) int local144 = arg2 - local123 - 32;
				arg0.anInt417 = (arg4 - arg2) * local138 / local144;
				if (arg5) {
					this.aBoolean56 = true;
				}
				this.aBoolean96 = true;
			} else {
				return;
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("81381, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method91() {
		try {
			if (this.aBoolean71 || this.aBoolean89 || this.aBoolean69) {
				this.method215((byte) 5);
			} else {
				anInt253++;
				if (this.aBoolean80) {
					this.method183();
				} else {
					this.method139(false);
				}
				this.anInt276 = 0;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("76908, " + 81 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(7) Class6 local7 = Class6.aClass6Array1[arg0];
			for (@Pc(9) int local9 = 0; local9 < local7.anIntArray97.length && local7.anIntArray97[local9] != -1; local9++) {
				@Pc(24) Class6 local24 = Class6.aClass6Array1[local7.anIntArray97[local9]];
				if (local24.anInt408 == 1) {
					this.method148(local24.anInt406, 962);
				}
				local24.anInt404 = 0;
				local24.anInt405 = 0;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("32133, " + arg0 + ", " + arg1 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!d;I)I")
	private int method149(@OriginalArg(1) Class6 arg0, @OriginalArg(2) int arg1) {
		try {
			this.aBoolean80 &= true;
			if (arg0.anIntArrayArray7 == null || arg1 >= arg0.anIntArrayArray7.length) {
				return -2;
			}
			try {
				@Pc(22) int[] local22 = arg0.anIntArrayArray7[arg1];
				@Pc(24) int local24 = 0;
				@Pc(26) int local26 = 0;
				@Pc(28) byte local28 = 0;
				while (true) {
					@Pc(33) int local33 = local22[local26++];
					@Pc(35) int local35 = 0;
					@Pc(37) byte local37 = 0;
					if (local33 == 0) {
						return local24;
					}
					if (local33 == 1) {
						local35 = this.anIntArray46[local22[local26++]];
					}
					if (local33 == 2) {
						local35 = this.anIntArray44[local22[local26++]];
					}
					if (local33 == 3) {
						local35 = this.anIntArray37[local22[local26++]];
					}
					@Pc(84) Class6 local84;
					@Pc(89) int local89;
					@Pc(102) int local102;
					if (local33 == 4) {
						local84 = Class6.aClass6Array1[local22[local26++]];
						local89 = local22[local26++];
						if (local89 >= 0 && local89 < Class15.anInt577 && (!Class15.method357(local89).aBoolean172 || aBoolean76)) {
							for (local102 = 0; local102 < local84.anIntArray93.length; local102++) {
								if (local84.anIntArray93[local102] == local89 + 1) {
									local35 += local84.anIntArray94[local102];
								}
							}
						}
					}
					if (local33 == 5) {
						local35 = this.anIntArray51[local22[local26++]];
					}
					if (local33 == 6) {
						local35 = anIntArray59[this.anIntArray44[local22[local26++]] - 1];
					}
					if (local33 == 7) {
						local35 = this.anIntArray51[local22[local26++]] * 100 / 46875;
					}
					if (local33 == 8) {
						local35 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt124;
					}
					@Pc(177) int local177;
					if (local33 == 9) {
						for (local177 = 0; local177 < Class30.anInt785; local177++) {
							if (Class30.aBooleanArray9[local177]) {
								local35 += this.anIntArray44[local177];
							}
						}
					}
					if (local33 == 10) {
						local84 = Class6.aClass6Array1[local22[local26++]];
						local89 = local22[local26++] + 1;
						if (local89 >= 0 && local89 < Class15.anInt577 && (!Class15.method357(local89).aBoolean172 || aBoolean76)) {
							for (local102 = 0; local102 < local84.anIntArray93.length; local102++) {
								if (local84.anIntArray93[local102] == local89) {
									local35 = 999999999;
									break;
								}
							}
						}
					}
					if (local33 == 11) {
						local35 = this.anInt255;
					}
					if (local33 == 12) {
						local35 = this.anInt243;
					}
					if (local33 == 13) {
						local177 = this.anIntArray51[local22[local26++]];
						local89 = local22[local26++];
						local35 = (local177 & 0x1 << local89) == 0 ? 0 : 1;
					}
					if (local33 == 14) {
						local177 = local22[local26++];
						@Pc(292) Class36 local292 = Class36.aClass36Array1[local177];
						local102 = local292.anInt820;
						@Pc(298) int local298 = local292.anInt821;
						@Pc(301) int local301 = local292.anInt822;
						@Pc(307) int local307 = anIntArray75[local301 - local298];
						local35 = this.anIntArray51[local102] >> local298 & local307;
					}
					if (local33 == 15) {
						local37 = 1;
					}
					if (local33 == 16) {
						local37 = 2;
					}
					if (local33 == 17) {
						local37 = 3;
					}
					if (local33 == 18) {
						local35 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt961 >> 7) + this.anInt277;
					}
					if (local33 == 19) {
						local35 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962 >> 7) + this.anInt278;
					}
					if (local33 == 20) {
						local35 = local22[local26++];
					}
					if (local37 == 0) {
						if (local28 == 0) {
							local24 += local35;
						}
						if (local28 == 1) {
							local24 -= local35;
						}
						if (local28 == 2 && local35 != 0) {
							local24 /= local35;
						}
						if (local28 == 3) {
							local24 *= local35;
						}
						local28 = 0;
					} else {
						local28 = local37;
					}
				}
			} catch (@Pc(400) Exception local400) {
				return -1;
			}
		} catch (@Pc(403) RuntimeException local403) {
			signlink.reporterror("74633, " + true + ", " + arg0 + ", " + arg1 + ", " + local403.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method150(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			if (aBoolean77 && this.anInt326 == 2 && Class4.anInt161 != this.anInt386) {
				this.aClass35_5.method516();
				this.aClass1_Sub1_Sub2_Sub4_2.method442(257, 151, 0, "Loading - please wait.");
				this.aClass1_Sub1_Sub2_Sub4_2.method442(256, 150, 16777215, "Loading - please wait.");
				this.aClass35_5.method517(4, 4, super.aGraphics2);
				this.anInt326 = 1;
				this.aLong18 = System.currentTimeMillis();
			}
			if (this.anInt326 == 1) {
				@Pc(55) int local55 = this.method151(475);
				if (local55 != 0 && System.currentTimeMillis() - this.aLong18 > 360000L) {
					signlink.reporterror(this.aString6 + " glcfb " + this.aLong14 + "," + local55 + "," + aBoolean77 + "," + this.aClass45Array1[0] + "," + this.aClass44_Sub1_1.method638() + "," + this.anInt386 + "," + this.anInt194 + "," + this.anInt195);
					this.aLong18 = System.currentTimeMillis();
				}
			}
			if (this.anInt326 == 2 && this.anInt386 != this.anInt193) {
				this.anInt193 = this.anInt386;
				this.method128(this.anInt386);
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("75244, " + arg0 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)I")
	private int method151(@OriginalArg(0) int arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray1.length; local3++) {
				if (this.aByteArrayArray1[local3] == null && this.anIntArray41[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray2[local3] == null && this.anIntArray42[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(41) int local41 = 0; local41 < this.aByteArrayArray1.length; local41++) {
				@Pc(48) byte[] local48 = this.aByteArrayArray2[local41];
				if (local48 != null) {
					@Pc(62) int local62 = (this.anIntArray40[local41] >> 8) * 64 - this.anInt277;
					@Pc(74) int local74 = (this.anIntArray40[local41] & 0xFF) * 64 - this.anInt278;
					local39 &= Class4.method57(local74, local48, local62);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean94) {
				return -4;
			} else {
				this.anInt326 = 2;
				Class4.anInt161 = this.anInt386;
				this.method205();
				this.aClass1_Sub1_Sub3_2.method461(134);
				@Pc(115) boolean local115 = false;
				return 0;
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("36656, " + arg0 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method152(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt290 >= 100 && this.anInt209 != 1) {
					this.method200(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
				} else if (this.anInt290 >= 200) {
					this.method200(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
				} else {
					@Pc(38) String local38 = Class48.method663(584, Class48.method660(arg0));
					for (@Pc(40) int local40 = 0; local40 < this.anInt290; local40++) {
						if (this.aLongArray3[local40] == arg0) {
							this.method200(0, local38 + " is already on your friend list", "");
							return;
						}
					}
					for (@Pc(70) int local70 = 0; local70 < this.anInt378; local70++) {
						if (this.aLongArray4[local70] == arg0) {
							this.method200(0, "Please remove " + local38 + " from your ignore list first", "");
							return;
						}
					}
					if (!local38.equals(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3)) {
						this.aStringArray3[this.anInt290] = local38;
						this.aLongArray3[this.anInt290] = arg0;
						this.anIntArray48[this.anInt290] = 0;
						this.anInt290++;
						this.aBoolean56 = true;
						this.aClass1_Sub1_Sub3_2.method461(9);
						this.aClass1_Sub1_Sub3_2.method468(arg0);
					}
				}
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("54179, " + 18804 + ", " + arg0 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!jb;)V")
	private void method153(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub3 arg1) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray34.length; local5++) {
				this.anIntArray34[local5] = 0;
			}
			@Pc(30) int local30;
			for (@Pc(20) int local20 = 0; local20 < 5000; local20++) {
				local30 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray34[local30] = (int) (Math.random() * 256.0D);
			}
			@Pc(48) int local48;
			@Pc(52) int local52;
			@Pc(60) int local60;
			for (local30 = 0; local30 < 20; local30++) {
				for (local48 = 1; local48 < 255; local48++) {
					for (local52 = 1; local52 < 127; local52++) {
						local60 = local52 + (local48 << 7);
						this.anIntArray35[local60] = (this.anIntArray34[local60 - 1] + this.anIntArray34[local60 + 1] + this.anIntArray34[local60 - 128] + this.anIntArray34[local60 + 128]) / 4;
					}
				}
				@Pc(106) int[] local106 = this.anIntArray34;
				this.anIntArray34 = this.anIntArray35;
				this.anIntArray35 = local106;
			}
			@Pc(121) boolean local121 = false;
			if (arg1 != null) {
				local48 = 0;
				for (local52 = 0; local52 < arg1.anInt650; local52++) {
					for (local60 = 0; local60 < arg1.anInt649; local60++) {
						if (arg1.aByteArray7[local48++] != 0) {
							@Pc(146) int local146 = local60 + arg1.anInt651 + 16;
							@Pc(153) int local153 = local52 + arg1.anInt652 + 16;
							@Pc(159) int local159 = local146 + (local153 << 7);
							this.anIntArray34[local159] = 0;
						}
					}
				}
			}
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("87269, " + arg0 + ", " + arg1 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method154() {
		try {
			if (this.anInt215 == 0 && this.anInt199 == 0) {
				this.aStringArray6[this.anInt222] = "Walk here";
				this.anIntArray81[this.anInt222] = 718;
				this.anIntArray79[this.anInt222] = super.anInt182;
				this.anIntArray80[this.anInt222] = super.anInt183;
				this.anInt222++;
			}
			@Pc(44) int local44 = -1;
			for (@Pc(46) int local46 = 0; local46 < Class1_Sub1_Sub1_Sub5.anInt483; local46++) {
				@Pc(52) int local52 = Class1_Sub1_Sub1_Sub5.anIntArray149[local46];
				@Pc(56) int local56 = local52 & 0x7F;
				@Pc(62) int local62 = local52 >> 7 & 0x7F;
				@Pc(68) int local68 = local52 >> 29 & 0x3;
				@Pc(74) int local74 = local52 >> 14 & 0x7FFF;
				if (local52 != local44) {
					local44 = local52;
					@Pc(212) int local212;
					if (local68 == 2 && this.aClass37_1.method552(this.anInt386, local56, local62, local52) >= 0) {
						@Pc(94) Class9 local94 = Class9.method286(local74);
						if (this.anInt215 == 1) {
							this.aStringArray6[this.anInt222] = "Use " + this.aString5 + " with @cya@" + local94.aString23;
							this.anIntArray81[this.anInt222] = 810;
							this.anIntArray82[this.anInt222] = local52;
							this.anIntArray79[this.anInt222] = local56;
							this.anIntArray80[this.anInt222] = local62;
							this.anInt222++;
						} else if (this.anInt199 != 1) {
							if (local94.aStringArray8 != null) {
								for (local212 = 4; local212 >= 0; local212--) {
									if (local94.aStringArray8[local212] != null) {
										this.aStringArray6[this.anInt222] = local94.aStringArray8[local212] + " @cya@" + local94.aString23;
										if (local212 == 0) {
											this.anIntArray81[this.anInt222] = 625;
										}
										if (local212 == 1) {
											this.anIntArray81[this.anInt222] = 721;
										}
										if (local212 == 2) {
											this.anIntArray81[this.anInt222] = 743;
										}
										if (local212 == 3) {
											this.anIntArray81[this.anInt222] = 357;
										}
										if (local212 == 4) {
											this.anIntArray81[this.anInt222] = 1071;
										}
										this.anIntArray82[this.anInt222] = local52;
										this.anIntArray79[this.anInt222] = local56;
										this.anIntArray80[this.anInt222] = local62;
										this.anInt222++;
									}
								}
							}
							this.aStringArray6[this.anInt222] = "Examine @cya@" + local94.aString23;
							this.anIntArray81[this.anInt222] = 1381;
							this.anIntArray82[this.anInt222] = local52;
							this.anIntArray79[this.anInt222] = local56;
							this.anIntArray80[this.anInt222] = local62;
							this.anInt222++;
						} else if ((this.anInt201 & 0x4) == 4) {
							this.aStringArray6[this.anInt222] = this.aString4 + " @cya@" + local94.aString23;
							this.anIntArray81[this.anInt222] = 899;
							this.anIntArray82[this.anInt222] = local52;
							this.anIntArray79[this.anInt222] = local56;
							this.anIntArray80[this.anInt222] = local62;
							this.anInt222++;
						}
					}
					@Pc(389) Class1_Sub1_Sub1_Sub1_Sub2 local389;
					@Pc(437) Class1_Sub1_Sub1_Sub1_Sub1 local437;
					@Pc(427) int local427;
					if (local68 == 1) {
						@Pc(360) Class1_Sub1_Sub1_Sub1_Sub2 local360 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local74];
						if (local360.aClass13_2.aByte19 == 1 && (local360.anInt961 & 0x7F) == 64 && (local360.anInt962 & 0x7F) == 64) {
							for (local212 = 0; local212 < this.anInt357; local212++) {
								local389 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray77[local212]];
								if (local389 != null && local389 != local360 && local389.aClass13_2.aByte19 == 1 && local389.anInt961 == local360.anInt961 && local389.anInt962 == local360.anInt962) {
									this.method134(local62, local56, local389.aClass13_2, this.anIntArray77[local212]);
								}
							}
							for (local427 = 0; local427 < this.anInt390; local427++) {
								local437 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray89[local427]];
								if (local437 != null && local437.anInt961 == local360.anInt961 && local437.anInt962 == local360.anInt962) {
									this.method169(local437, this.anIntArray89[local427], (byte) 4, local62, local56);
								}
							}
						}
						this.method134(local62, local56, local360.aClass13_2, local74);
					}
					if (local68 == 0) {
						@Pc(479) Class1_Sub1_Sub1_Sub1_Sub1 local479 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local74];
						if ((local479.anInt961 & 0x7F) == 64 && (local479.anInt962 & 0x7F) == 64) {
							for (local212 = 0; local212 < this.anInt357; local212++) {
								local389 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray77[local212]];
								if (local389 != null && local389.aClass13_2.aByte19 == 1 && local389.anInt961 == local479.anInt961 && local389.anInt962 == local479.anInt962) {
									this.method134(local62, local56, local389.aClass13_2, this.anIntArray77[local212]);
								}
							}
							for (local427 = 0; local427 < this.anInt390; local427++) {
								local437 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray89[local427]];
								if (local437 != null && local437 != local479 && local437.anInt961 == local479.anInt961 && local437.anInt962 == local479.anInt962) {
									this.method169(local437, this.anIntArray89[local427], (byte) 4, local62, local56);
								}
							}
						}
						this.method169(local479, local74, (byte) 4, local62, local56);
					}
					if (local68 == 3) {
						@Pc(598) Class29 local598 = this.aClass29ArrayArrayArray1[this.anInt386][local56][local62];
						if (local598 != null) {
							for (@Pc(606) Class1_Sub1_Sub1_Sub3 local606 = (Class1_Sub1_Sub1_Sub3) local598.method504(this.aBoolean64); local606 != null; local606 = (Class1_Sub1_Sub1_Sub3) local598.method506((byte) 2)) {
								@Pc(612) Class15 local612 = Class15.method357(local606.anInt167);
								if (this.anInt215 == 1) {
									this.aStringArray6[this.anInt222] = "Use " + this.aString5 + " with @lre@" + local612.aString25;
									this.anIntArray81[this.anInt222] = 111;
									this.anIntArray82[this.anInt222] = local606.anInt167;
									this.anIntArray79[this.anInt222] = local56;
									this.anIntArray80[this.anInt222] = local62;
									this.anInt222++;
								} else if (this.anInt199 != 1) {
									for (@Pc(729) int local729 = 4; local729 >= 0; local729--) {
										if (local612.aStringArray10 != null && local612.aStringArray10[local729] != null) {
											this.aStringArray6[this.anInt222] = local612.aStringArray10[local729] + " @lre@" + local612.aString25;
											if (local729 == 0) {
												this.anIntArray81[this.anInt222] = 139;
											}
											if (local729 == 1) {
												this.anIntArray81[this.anInt222] = 778;
											}
											if (local729 == 2) {
												this.anIntArray81[this.anInt222] = 617;
											}
											if (local729 == 3) {
												this.anIntArray81[this.anInt222] = 224;
											}
											if (local729 == 4) {
												this.anIntArray81[this.anInt222] = 662;
											}
											this.anIntArray82[this.anInt222] = local606.anInt167;
											this.anIntArray79[this.anInt222] = local56;
											this.anIntArray80[this.anInt222] = local62;
											this.anInt222++;
										} else if (local729 == 2) {
											this.aStringArray6[this.anInt222] = "Take @lre@" + local612.aString25;
											this.anIntArray81[this.anInt222] = 617;
											this.anIntArray82[this.anInt222] = local606.anInt167;
											this.anIntArray79[this.anInt222] = local56;
											this.anIntArray80[this.anInt222] = local62;
											this.anInt222++;
										}
									}
									this.aStringArray6[this.anInt222] = "Examine @lre@" + local612.aString25;
									this.anIntArray81[this.anInt222] = 1152;
									this.anIntArray82[this.anInt222] = local606.anInt167;
									this.anIntArray79[this.anInt222] = local56;
									this.anIntArray80[this.anInt222] = local62;
									this.anInt222++;
								} else if ((this.anInt201 & 0x1) == 1) {
									this.aStringArray6[this.anInt222] = this.aString4 + " @lre@" + local612.aString25;
									this.anIntArray81[this.anInt222] = 370;
									this.anIntArray82[this.anInt222] = local606.anInt167;
									this.anIntArray79[this.anInt222] = local56;
									this.anIntArray80[this.anInt222] = local62;
									this.anInt222++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(936) RuntimeException local936) {
			signlink.reporterror("16027, " + -899 + ", " + local936.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method155() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt390; local3++) {
				if (local3 == -1) {
					local11 = this.anInt389;
				} else {
					local11 = this.anIntArray89[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub1 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local11];
				if (local23 != null && local23.anInt972 > 0) {
					local23.anInt972--;
					if (local23.anInt972 == 0) {
						local23.aString31 = null;
					}
				}
			}
			for (local11 = 0; local11 < this.anInt357; local11++) {
				@Pc(54) int local54 = this.anIntArray77[local11];
				@Pc(59) Class1_Sub1_Sub1_Sub1_Sub2 local59 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local54];
				if (local59 != null && local59.anInt972 > 0) {
					local59.anInt972--;
					if (local59.anInt972 == 0) {
						local59.aString31 = null;
					}
				}
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("3053, " + 105 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method156(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0 && super.anInt187 == 1) {
				if (super.anInt188 >= 539 && super.anInt188 <= 573 && super.anInt189 >= 169 && super.anInt189 < 205 && this.anIntArray58[0] != -1) {
					this.aBoolean56 = true;
					this.anInt323 = 0;
					this.aBoolean75 = true;
				}
				if (super.anInt188 >= 569 && super.anInt188 <= 599 && super.anInt189 >= 168 && super.anInt189 < 205 && this.anIntArray58[1] != -1) {
					this.aBoolean56 = true;
					this.anInt323 = 1;
					this.aBoolean75 = true;
				}
				if (super.anInt188 >= 597 && super.anInt188 <= 627 && super.anInt189 >= 168 && super.anInt189 < 205 && this.anIntArray58[2] != -1) {
					this.aBoolean56 = true;
					this.anInt323 = 2;
					this.aBoolean75 = true;
				}
				if (super.anInt188 >= 625 && super.anInt188 <= 669 && super.anInt189 >= 168 && super.anInt189 < 203 && this.anIntArray58[3] != -1) {
					this.aBoolean56 = true;
					this.anInt323 = 3;
					this.aBoolean75 = true;
				}
				if (super.anInt188 >= 666 && super.anInt188 <= 696 && super.anInt189 >= 168 && super.anInt189 < 205 && this.anIntArray58[4] != -1) {
					this.aBoolean56 = true;
					this.anInt323 = 4;
					this.aBoolean75 = true;
				}
				if (super.anInt188 >= 694 && super.anInt188 <= 724 && super.anInt189 >= 168 && super.anInt189 < 205 && this.anIntArray58[5] != -1) {
					this.aBoolean56 = true;
					this.anInt323 = 5;
					this.aBoolean75 = true;
				}
				if (super.anInt188 >= 722 && super.anInt188 <= 756 && super.anInt189 >= 169 && super.anInt189 < 205 && this.anIntArray58[6] != -1) {
					this.aBoolean56 = true;
					this.anInt323 = 6;
					this.aBoolean75 = true;
				}
				if (super.anInt188 >= 540 && super.anInt188 <= 574 && super.anInt189 >= 466 && super.anInt189 < 502 && this.anIntArray58[7] != -1) {
					this.aBoolean56 = true;
					this.anInt323 = 7;
					this.aBoolean75 = true;
				}
				if (super.anInt188 >= 572 && super.anInt188 <= 602 && super.anInt189 >= 466 && super.anInt189 < 503 && this.anIntArray58[8] != -1) {
					this.aBoolean56 = true;
					this.anInt323 = 8;
					this.aBoolean75 = true;
				}
				if (super.anInt188 >= 599 && super.anInt188 <= 629 && super.anInt189 >= 466 && super.anInt189 < 503 && this.anIntArray58[9] != -1) {
					this.aBoolean56 = true;
					this.anInt323 = 9;
					this.aBoolean75 = true;
				}
				if (super.anInt188 >= 627 && super.anInt188 <= 671 && super.anInt189 >= 467 && super.anInt189 < 502 && this.anIntArray58[10] != -1) {
					this.aBoolean56 = true;
					this.anInt323 = 10;
					this.aBoolean75 = true;
				}
				if (super.anInt188 >= 669 && super.anInt188 <= 699 && super.anInt189 >= 466 && super.anInt189 < 503 && this.anIntArray58[11] != -1) {
					this.aBoolean56 = true;
					this.anInt323 = 11;
					this.aBoolean75 = true;
				}
				if (super.anInt188 >= 696 && super.anInt188 <= 726 && super.anInt189 >= 466 && super.anInt189 < 503 && this.anIntArray58[12] != -1) {
					this.aBoolean56 = true;
					this.anInt323 = 12;
					this.aBoolean75 = true;
				}
				if (super.anInt188 >= 724 && super.anInt188 <= 758 && super.anInt189 >= 466 && super.anInt189 < 502 && this.anIntArray58[13] != -1) {
					this.aBoolean56 = true;
					this.anInt323 = 13;
					this.aBoolean75 = true;
					return;
				}
			}
		} catch (@Pc(442) RuntimeException local442) {
			signlink.reporterror("63534, " + arg0 + ", " + local442.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method157(@OriginalArg(0) int arg0) {
		try {
			for (@Pc(6) Class1_Sub1_Sub1_Sub4 local6 = (Class1_Sub1_Sub1_Sub4) this.aClass29_2.method503(); local6 != null; local6 = (Class1_Sub1_Sub1_Sub4) this.aClass29_2.method505()) {
				if (local6.anInt437 != this.anInt386 || anInt375 > local6.anInt443) {
					local6.method666();
				} else if (anInt375 >= local6.anInt442) {
					if (local6.anInt446 > 0) {
						@Pc(36) Class1_Sub1_Sub1_Sub1_Sub2 local36 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local6.anInt446 - 1];
						if (local36 != null && local36.anInt961 >= 0 && local36.anInt961 < 13312 && local36.anInt962 >= 0 && local36.anInt962 < 13312) {
							local6.method239(this.method199(local6.anInt437, local36.anInt961, local36.anInt962) - local6.anInt441, anInt375, local36.anInt962, local36.anInt961);
						}
					}
					if (local6.anInt446 < 0) {
						@Pc(81) int local81 = -local6.anInt446 - 1;
						@Pc(87) Class1_Sub1_Sub1_Sub1_Sub1 local87;
						if (local81 == this.anInt354) {
							local87 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
						} else {
							local87 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local81];
						}
						if (local87 != null && local87.anInt961 >= 0 && local87.anInt961 < 13312 && local87.anInt962 >= 0 && local87.anInt962 < 13312) {
							local6.method239(this.method199(local6.anInt437, local87.anInt961, local87.anInt962) - local6.anInt441, anInt375, local87.anInt962, local87.anInt961);
						}
					}
					local6.method240(this.anInt297, this.anInt196);
					this.aClass37_1.method533(local6.anInt447, (int) local6.aDouble2, false, (int) local6.aDouble1, (int) local6.aDouble3, local6, this.anInt386, 60, -1);
				}
			}
			anInt381++;
			@Pc(174) boolean local174 = false;
			if (anInt381 > 1174) {
				anInt381 = 0;
				this.aClass1_Sub1_Sub3_2.method461(51);
				this.aClass1_Sub1_Sub3_2.method462(0);
				@Pc(192) int local192 = this.aClass1_Sub1_Sub3_2.anInt715;
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_2.method463(11499);
				}
				this.aClass1_Sub1_Sub3_2.method463(10548);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_2.method462(139);
				}
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_2.method462(94);
				}
				this.aClass1_Sub1_Sub3_2.method463(51693);
				this.aClass1_Sub1_Sub3_2.method462(16);
				this.aClass1_Sub1_Sub3_2.method463(15036);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_2.method462(65);
				}
				this.aClass1_Sub1_Sub3_2.method462((int) (Math.random() * 256.0D));
				this.aClass1_Sub1_Sub3_2.method463(22990);
				this.aClass1_Sub1_Sub3_2.method471(this.aClass1_Sub1_Sub3_2.anInt715 - local192);
			}
		} catch (@Pc(266) RuntimeException local266) {
			signlink.reporterror("39780, " + arg0 + ", " + local266.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	private void method158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg4 >= 1 && arg3 >= 1 && arg4 <= 102 && arg3 <= 102) {
				if (aBoolean77 && arg2 != this.anInt386) {
					return;
				}
				@Pc(29) int local29 = 0;
				if (arg1 == 0) {
					local29 = this.aClass37_1.method548(arg2, arg4, arg3);
				}
				if (arg1 == 1) {
					local29 = this.aClass37_1.method549(arg2, arg4, arg3);
				}
				if (arg1 == 2) {
					local29 = this.aClass37_1.method550(arg2, arg4, arg3);
				}
				if (arg1 == 3) {
					local29 = this.aClass37_1.method551(arg2, arg4, arg3);
				}
				@Pc(85) int local85;
				if (local29 != 0) {
					local85 = this.aClass37_1.method552(arg2, arg4, arg3, local29);
					@Pc(91) int local91 = local29 >> 14 & 0x7FFF;
					@Pc(95) int local95 = local85 & 0x1F;
					@Pc(99) int local99 = local85 >> 6;
					@Pc(111) Class9 local111;
					if (arg1 == 0) {
						this.aClass37_1.method539((byte) 4, arg4, arg2, arg3);
						local111 = Class9.method286(local91);
						if (local111.aBoolean131) {
							this.aClass19Array1[arg2].method421(local95, arg4, local99, arg3, local111.aBoolean132);
						}
					}
					if (arg1 == 1) {
						this.aClass37_1.method540(arg2, arg4, arg3);
					}
					if (arg1 == 2) {
						this.aClass37_1.method541(arg2, arg4, arg3);
						local111 = Class9.method286(local91);
						if (arg4 + local111.anInt489 > 103 || arg3 + local111.anInt489 > 103 || arg4 + local111.anInt490 > 103 || arg3 + local111.anInt490 > 103) {
							return;
						}
						if (local111.aBoolean131) {
							this.aClass19Array1[arg2].method422(arg3, local111.anInt490, local99, arg4, local111.aBoolean132, local111.anInt489);
						}
					}
					if (arg1 == 3) {
						this.aClass37_1.method542(arg2, arg4, arg3);
						local111 = Class9.method286(local91);
						if (local111.aBoolean131 && local111.aBoolean133) {
							this.aClass19Array1[arg2].method424(arg3, arg4);
						}
					}
				}
				if (arg0 >= 0) {
					local85 = arg2;
					if (arg2 < 3 && (this.aByteArrayArrayArray7[1][arg4][arg3] & 0x2) == 2) {
						local85 = arg2 + 1;
					}
					Class4.method72(arg2, arg4, arg0, arg5, this.aClass37_1, this.aClass19Array1[arg2], local85, arg6, arg3, this.anIntArrayArrayArray5);
					return;
				}
			}
		} catch (@Pc(258) RuntimeException local258) {
			signlink.reporterror("6770, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 7 + ", " + arg6 + ", " + local258.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!lb;I)V")
	private void method159(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(6) int local6 = arg1.method483(8);
			@Pc(12) int local12;
			if (local6 < this.anInt390) {
				for (local12 = local6; local12 < this.anInt390; local12++) {
					this.anIntArray67[this.anInt310++] = this.anIntArray89[local12];
				}
			}
			if (local6 > this.anInt390) {
				signlink.reporterror(this.aString6 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt390 = 0;
			for (local12 = 0; local12 < local6; local12++) {
				@Pc(76) int local76 = this.anIntArray89[local12];
				@Pc(81) Class1_Sub1_Sub1_Sub1_Sub1 local81 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local76];
				@Pc(86) int local86 = arg1.method483(1);
				if (local86 == 0) {
					this.anIntArray89[this.anInt390++] = local76;
					local81.anInt1001 = anInt375;
				} else {
					@Pc(109) int local109 = arg1.method483(2);
					if (local109 == 0) {
						this.anIntArray89[this.anInt390++] = local76;
						local81.anInt1001 = anInt375;
						this.anIntArray90[this.anInt391++] = local76;
					} else {
						@Pc(160) int local160;
						@Pc(170) int local170;
						if (local109 == 1) {
							this.anIntArray89[this.anInt390++] = local76;
							local81.anInt1001 = anInt375;
							local160 = arg1.method483(3);
							local81.method671(local160, false);
							local170 = arg1.method483(1);
							if (local170 == 1) {
								this.anIntArray90[this.anInt391++] = local76;
							}
						} else if (local109 == 2) {
							this.anIntArray89[this.anInt390++] = local76;
							local81.anInt1001 = anInt375;
							local160 = arg1.method483(3);
							local81.method671(local160, true);
							local170 = arg1.method483(3);
							local81.method671(local170, true);
							@Pc(228) int local228 = arg1.method483(1);
							if (local228 == 1) {
								this.anIntArray90[this.anInt391++] = local76;
							}
						} else if (local109 == 3) {
							this.anIntArray67[this.anInt310++] = local76;
						}
					}
				}
			}
		} catch (@Pc(265) RuntimeException local265) {
			signlink.reporterror("73187, " + arg0 + ", " + arg1 + ", " + -839 + ", " + local265.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method160(@OriginalArg(1) int arg0) {
		try {
			if (arg0 >= 0) {
				if (this.aBoolean97) {
					this.aBoolean97 = false;
					this.aBoolean68 = true;
				}
				@Pc(18) int local18 = this.anIntArray79[arg0];
				@Pc(23) int local23 = this.anIntArray80[arg0];
				@Pc(28) int local28 = this.anIntArray81[arg0];
				@Pc(33) int local33 = this.anIntArray82[arg0];
				if (local28 >= 2000) {
					local28 -= 2000;
				}
				if (local28 == 737) {
					this.method124();
				}
				@Pc(70) boolean local70;
				if (local28 == 111) {
					local70 = this.method103(local23, 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], 0, false, local18, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, 0, 0);
					if (!local70) {
						this.method103(local23, 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], 0, false, local18, 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, 0, 1);
					}
					this.anInt336 = super.anInt188;
					this.anInt337 = super.anInt189;
					this.anInt339 = 2;
					this.anInt338 = 0;
					this.aClass1_Sub1_Sub3_2.method461(245);
					this.aClass1_Sub1_Sub3_2.method463(local18 + this.anInt277);
					this.aClass1_Sub1_Sub3_2.method463(local23 + this.anInt278);
					this.aClass1_Sub1_Sub3_2.method463(local33);
					this.aClass1_Sub1_Sub3_2.method463(this.anInt218);
					this.aClass1_Sub1_Sub3_2.method463(this.anInt216);
					this.aClass1_Sub1_Sub3_2.method463(this.anInt217);
				}
				if (local28 == 810 && this.method194(local23, local18, 240, local33)) {
					this.aClass1_Sub1_Sub3_2.method463(this.anInt218);
					this.aClass1_Sub1_Sub3_2.method463(this.anInt216);
					this.aClass1_Sub1_Sub3_2.method463(this.anInt217);
				}
				@Pc(204) String local204;
				@Pc(177) Class15 local177;
				if (local28 == 1328) {
					local177 = Class15.method357(local33);
					@Pc(181) Class6 local181 = Class6.aClass6Array1[local23];
					if (local181 != null && local181.anIntArray94[local18] >= 100000) {
						local204 = local181.anIntArray94[local18] + " x " + local177.aString25;
					} else if (local177.aByteArray6 == null) {
						local204 = "It's a " + local177.aString25 + ".";
					} else {
						local204 = new String(local177.aByteArray6);
					}
					this.method200(0, local204, "");
				}
				@Pc(241) Class6 local241;
				if (local28 == 231) {
					local241 = Class6.aClass6Array1[local23];
					@Pc(243) boolean local243 = true;
					if (local241.anInt410 > 0) {
						local243 = this.method146(local241);
					}
					if (local243) {
						this.aClass1_Sub1_Sub3_2.method461(244);
						this.aClass1_Sub1_Sub3_2.method463(local23);
					}
				}
				if (local28 == 563) {
					this.aClass1_Sub1_Sub3_2.method461(102);
					this.aClass1_Sub1_Sub3_2.method463(local33);
					this.aClass1_Sub1_Sub3_2.method463(local18);
					this.aClass1_Sub1_Sub3_2.method463(local23);
					this.aClass1_Sub1_Sub3_2.method463(this.anInt200);
					this.anInt341 = 0;
					this.anInt342 = local23;
					this.anInt343 = local18;
					this.anInt344 = 2;
					if (Class6.aClass6Array1[local23].anInt407 == this.anInt322) {
						this.anInt344 = 1;
					}
					if (Class6.aClass6Array1[local23].anInt407 == this.anInt316) {
						this.anInt344 = 3;
					}
				}
				if (local28 == 1152) {
					local177 = Class15.method357(local33);
					if (local177.aByteArray6 == null) {
						local204 = "It's a " + local177.aString25 + ".";
					} else {
						local204 = new String(local177.aByteArray6);
					}
					this.method200(0, local204, "");
				}
				if (local28 == 582 || local28 == 113 || local28 == 555 || local28 == 331 || local28 == 354) {
					if (local28 == 331) {
						this.aClass1_Sub1_Sub3_2.method461(160);
					}
					if (local28 == 113) {
						this.aClass1_Sub1_Sub3_2.method461(70);
					}
					if (local28 == 555) {
						this.aClass1_Sub1_Sub3_2.method461(59);
					}
					if (local28 == 582) {
						if ((local33 & 0x3) == 0) {
							anInt303++;
						}
						if (anInt303 >= 133) {
							this.aClass1_Sub1_Sub3_2.method461(131);
							this.aClass1_Sub1_Sub3_2.method463(6118);
						}
						this.aClass1_Sub1_Sub3_2.method461(181);
					}
					if (local28 == 354) {
						this.aClass1_Sub1_Sub3_2.method461(62);
					}
					this.aClass1_Sub1_Sub3_2.method463(local33);
					this.aClass1_Sub1_Sub3_2.method463(local18);
					this.aClass1_Sub1_Sub3_2.method463(local23);
					this.anInt341 = 0;
					this.anInt342 = local23;
					this.anInt343 = local18;
					this.anInt344 = 2;
					if (Class6.aClass6Array1[local23].anInt407 == this.anInt322) {
						this.anInt344 = 1;
					}
					if (Class6.aClass6Array1[local23].anInt407 == this.anInt316) {
						this.anInt344 = 3;
					}
				}
				@Pc(493) String local493;
				if (local28 == 1381) {
					@Pc(481) int local481 = local33 >> 14 & 0x7FFF;
					@Pc(484) Class9 local484 = Class9.method286(local481);
					if (local484.aByteArray4 == null) {
						local493 = "It's a " + local484.aString23 + ".";
					} else {
						local493 = new String(local484.aByteArray4);
					}
					this.method200(0, local493, "");
				}
				@Pc(532) Class1_Sub1_Sub1_Sub1_Sub2 local532;
				if (local28 == 242 || local28 == 209 || local28 == 309 || local28 == 852 || local28 == 793) {
					local532 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
					if (local532 != null) {
						this.method103(local532.anIntArray270[0], 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], 0, false, local532.anIntArray269[0], 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, 0, 1);
						this.anInt336 = super.anInt188;
						this.anInt337 = super.anInt189;
						this.anInt339 = 2;
						this.anInt338 = 0;
						if (local28 == 309) {
							this.aClass1_Sub1_Sub3_2.method461(69);
						}
						if (local28 == 242) {
							this.aClass1_Sub1_Sub3_2.method461(143);
						}
						if (local28 == 852) {
							this.aClass1_Sub1_Sub3_2.method461(122);
						}
						if (local28 == 209) {
							this.aClass1_Sub1_Sub3_2.method461(195);
						}
						if (local28 == 793) {
							this.aClass1_Sub1_Sub3_2.method461(118);
						}
						this.aClass1_Sub1_Sub3_2.method463(local33);
					}
				}
				if (local28 == 102) {
					this.anInt215 = 1;
					this.anInt216 = local18;
					this.anInt217 = local23;
					this.anInt218 = local33;
					this.aString5 = Class15.method357(local33).aString25;
					this.anInt199 = 0;
					this.aBoolean56 = true;
				} else {
					if (local28 == 694 || local28 == 962 || local28 == 795 || local28 == 681 || local28 == 100) {
						if (local28 == 100) {
							this.aClass1_Sub1_Sub3_2.method461(74);
						}
						if (local28 == 694) {
							this.aClass1_Sub1_Sub3_2.method461(243);
						}
						if (local28 == 681) {
							anInt401++;
							if (anInt401 >= 116) {
								this.aClass1_Sub1_Sub3_2.method461(162);
								this.aClass1_Sub1_Sub3_2.method465(13018169);
							}
							this.aClass1_Sub1_Sub3_2.method461(163);
						}
						if (local28 == 962) {
							this.aClass1_Sub1_Sub3_2.method461(228);
						}
						if (local28 == 795) {
							this.aClass1_Sub1_Sub3_2.method461(80);
						}
						this.aClass1_Sub1_Sub3_2.method463(local33);
						this.aClass1_Sub1_Sub3_2.method463(local18);
						this.aClass1_Sub1_Sub3_2.method463(local23);
						this.anInt341 = 0;
						this.anInt342 = local23;
						this.anInt343 = local18;
						this.anInt344 = 2;
						if (Class6.aClass6Array1[local23].anInt407 == this.anInt322) {
							this.anInt344 = 1;
						}
						if (Class6.aClass6Array1[local23].anInt407 == this.anInt316) {
							this.anInt344 = 3;
						}
					}
					if (local28 == 370) {
						local70 = this.method103(local23, 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], 0, false, local18, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, 0, 0);
						if (!local70) {
							this.method103(local23, 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], 0, false, local18, 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, 0, 1);
						}
						this.anInt336 = super.anInt188;
						this.anInt337 = super.anInt189;
						this.anInt339 = 2;
						this.anInt338 = 0;
						this.aClass1_Sub1_Sub3_2.method461(202);
						this.aClass1_Sub1_Sub3_2.method463(local18 + this.anInt277);
						this.aClass1_Sub1_Sub3_2.method463(local23 + this.anInt278);
						this.aClass1_Sub1_Sub3_2.method463(local33);
						this.aClass1_Sub1_Sub3_2.method463(this.anInt200);
					}
					@Pc(884) int local884;
					if (local28 == 225) {
						this.aClass1_Sub1_Sub3_2.method461(244);
						this.aClass1_Sub1_Sub3_2.method463(local23);
						local241 = Class6.aClass6Array1[local23];
						if (local241.anIntArrayArray7 != null && local241.anIntArrayArray7[0][0] == 5) {
							local884 = local241.anIntArrayArray7[0][1];
							if (this.anIntArray51[local884] != local241.anIntArray96[0]) {
								this.anIntArray51[local884] = local241.anIntArray96[0];
								this.method209(local884);
								this.aBoolean56 = true;
							}
						}
					}
					if (local28 == 625) {
						this.method194(local23, local18, 33, local33);
					}
					if (local28 == 718) {
						if (this.aBoolean74) {
							this.aClass37_1.method560(local23 - 4, local18 - 4);
						} else {
							this.aClass37_1.method560(super.anInt189 - 4, super.anInt188 - 4);
						}
					}
					@Pc(957) Class1_Sub1_Sub1_Sub1_Sub1 local957;
					if (local28 == 275) {
						local957 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
						if (local957 != null) {
							this.method103(local957.anIntArray270[0], 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], 0, false, local957.anIntArray269[0], 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, 0, 1);
							this.anInt336 = super.anInt188;
							this.anInt337 = super.anInt189;
							this.anInt339 = 2;
							this.anInt338 = 0;
							this.aClass1_Sub1_Sub3_2.method461(113);
							this.aClass1_Sub1_Sub3_2.method463(local33);
							this.aClass1_Sub1_Sub3_2.method463(this.anInt218);
							this.aClass1_Sub1_Sub3_2.method463(this.anInt216);
							this.aClass1_Sub1_Sub3_2.method463(this.anInt217);
						}
					}
					if (local28 == 721) {
						anInt250 += local23;
						if (anInt250 >= 139) {
							this.aClass1_Sub1_Sub3_2.method461(28);
							this.aClass1_Sub1_Sub3_2.method466(0);
						}
						this.method194(local23, local18, 213, local33);
					}
					if (local28 == 899 && this.method194(local23, local18, 26, local33)) {
						this.aClass1_Sub1_Sub3_2.method463(this.anInt200);
					}
					if (local28 == 743) {
						anInt259++;
						if (anInt259 >= 124) {
							this.aClass1_Sub1_Sub3_2.method461(77);
							this.aClass1_Sub1_Sub3_2.method463(37954);
						}
						this.method194(local23, local18, 98, local33);
					}
					if (local28 == 639 || local28 == 499 || local28 == 27 || local28 == 387 || local28 == 185) {
						local957 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
						if (local957 != null) {
							this.method103(local957.anIntArray270[0], 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], 0, false, local957.anIntArray269[0], 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, 0, 1);
							this.anInt336 = super.anInt188;
							this.anInt337 = super.anInt189;
							this.anInt339 = 2;
							this.anInt338 = 0;
							if (local28 == 499) {
								this.aClass1_Sub1_Sub3_2.method461(17);
							}
							if (local28 == 639) {
								anInt266++;
								if (anInt266 >= 52) {
									this.aClass1_Sub1_Sub3_2.method461(121);
									this.aClass1_Sub1_Sub3_2.method462(131);
								}
								this.aClass1_Sub1_Sub3_2.method461(192);
							}
							if (local28 == 27) {
								this.aClass1_Sub1_Sub3_2.method461(18);
							}
							if (local28 == 387) {
								anInt340 += local33;
								if (anInt340 >= 66) {
									this.aClass1_Sub1_Sub3_2.method461(233);
									this.aClass1_Sub1_Sub3_2.method462(154);
								}
								this.aClass1_Sub1_Sub3_2.method461(72);
							}
							if (local28 == 185) {
								this.aClass1_Sub1_Sub3_2.method461(230);
							}
							this.aClass1_Sub1_Sub3_2.method463(local33);
						}
					}
					@Pc(1250) String local1250;
					@Pc(1265) long local1265;
					if (local28 == 605 || local28 == 47 || local28 == 513 || local28 == 884) {
						local1250 = this.aStringArray6[arg0];
						local884 = local1250.indexOf("@whi@");
						if (local884 != -1) {
							local1265 = Class48.method659(local1250.substring(local884 + 5).trim());
							if (local28 == 605) {
								this.method152(local1265);
							}
							if (local28 == 47) {
								this.method161(local1265);
							}
							if (local28 == 513) {
								this.method121(local1265);
							}
							if (local28 == 884) {
								this.method132(local1265);
							}
						}
					}
					if (local28 == 435) {
						this.aClass1_Sub1_Sub3_2.method461(244);
						this.aClass1_Sub1_Sub3_2.method463(local23);
						local241 = Class6.aClass6Array1[local23];
						if (local241.anIntArrayArray7 != null && local241.anIntArrayArray7[0][0] == 5) {
							local884 = local241.anIntArrayArray7[0][1];
							this.anIntArray51[local884] = 1 - this.anIntArray51[local884];
							this.method209(local884);
							this.aBoolean56 = true;
						}
					}
					if (local28 == 131) {
						local957 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
						if (local957 != null) {
							this.method103(local957.anIntArray270[0], 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], 0, false, local957.anIntArray269[0], 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, 0, 1);
							this.anInt336 = super.anInt188;
							this.anInt337 = super.anInt189;
							this.anInt339 = 2;
							this.anInt338 = 0;
							this.aClass1_Sub1_Sub3_2.method461(68);
							this.aClass1_Sub1_Sub3_2.method463(local33);
							this.aClass1_Sub1_Sub3_2.method463(this.anInt200);
						}
					}
					if (local28 == 274) {
						local241 = Class6.aClass6Array1[local23];
						this.anInt199 = 1;
						this.anInt200 = local23;
						this.anInt201 = local241.anInt434;
						this.anInt215 = 0;
						this.aBoolean56 = true;
						local204 = local241.aString20;
						if (local204.indexOf(" ") != -1) {
							local204 = local204.substring(0, local204.indexOf(" "));
						}
						local493 = local241.aString20;
						if (local493.indexOf(" ") != -1) {
							local493 = local493.substring(local493.indexOf(" ") + 1);
						}
						this.aString4 = local204 + " " + local241.aString21 + " " + local493;
						if (this.anInt201 == 16) {
							this.aBoolean56 = true;
							this.anInt323 = 3;
							this.aBoolean75 = true;
						}
					} else {
						if (local28 == 524) {
							local1250 = this.aStringArray6[arg0];
							local884 = local1250.indexOf("@whi@");
							if (local884 != -1) {
								this.method124();
								this.aString8 = local1250.substring(local884 + 5).trim();
								this.aBoolean60 = false;
								for (@Pc(1525) int local1525 = 0; local1525 < Class6.aClass6Array1.length; local1525++) {
									if (Class6.aClass6Array1[local1525] != null && Class6.aClass6Array1[local1525].anInt410 == 600) {
										this.anInt371 = this.anInt322 = Class6.aClass6Array1[local1525].anInt407;
										break;
									}
								}
							}
						}
						if (local28 == 357) {
							this.method194(local23, local18, 87, local33);
						}
						if (local28 == 1071) {
							this.method194(local23, local18, 147, local33);
						}
						if (local28 == 240) {
							local532 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
							if (local532 != null) {
								this.method103(local532.anIntArray270[0], 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], 0, false, local532.anIntArray269[0], 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, 0, 1);
								this.anInt336 = super.anInt188;
								this.anInt337 = super.anInt189;
								this.anInt339 = 2;
								this.anInt338 = 0;
								this.aClass1_Sub1_Sub3_2.method461(231);
								this.aClass1_Sub1_Sub3_2.method463(local33);
								this.aClass1_Sub1_Sub3_2.method463(this.anInt200);
							}
						}
						if (local28 == 1714) {
							local532 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
							if (local532 != null) {
								if (local532.aClass13_2.aByteArray5 == null) {
									local204 = "It's a " + local532.aClass13_2.aString24 + ".";
								} else {
									local204 = new String(local532.aClass13_2.aByteArray5);
								}
								this.method200(0, local204, "");
							}
						}
						@Pc(1706) int local1706;
						if (local28 == 902) {
							local1250 = this.aStringArray6[arg0];
							local884 = local1250.indexOf("@whi@");
							if (local884 != -1) {
								local1265 = Class48.method659(local1250.substring(local884 + 5).trim());
								local1706 = -1;
								for (@Pc(1708) int local1708 = 0; local1708 < this.anInt290; local1708++) {
									if (this.aLongArray3[local1708] == local1265) {
										local1706 = local1708;
										break;
									}
								}
								if (local1706 != -1 && this.anIntArray48[local1706] > 0) {
									this.aBoolean68 = true;
									this.aBoolean97 = false;
									this.aBoolean70 = true;
									this.aString11 = "";
									this.anInt198 = 3;
									this.aLong15 = this.aLongArray3[local1706];
									this.aString10 = "Enter message to send to " + this.aStringArray3[local1706];
								}
							}
						}
						if (local28 == 507 || local28 == 957) {
							local1250 = this.aStringArray6[arg0];
							local884 = local1250.indexOf("@whi@");
							if (local884 != -1) {
								local1250 = local1250.substring(local884 + 5).trim();
								local493 = Class48.method663(584, Class48.method660(Class48.method659(local1250)));
								@Pc(1801) boolean local1801 = false;
								for (local1706 = 0; local1706 < this.anInt390; local1706++) {
									@Pc(1813) Class1_Sub1_Sub1_Sub1_Sub1 local1813 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray89[local1706]];
									if (local1813 != null && local1813.aString3 != null && local1813.aString3.equalsIgnoreCase(local493)) {
										this.method103(local1813.anIntArray270[0], 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], 0, false, local1813.anIntArray269[0], 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, 0, 1);
										if (local28 == 507) {
											anInt340 += local33;
											if (anInt340 >= 66) {
												this.aClass1_Sub1_Sub3_2.method461(233);
												this.aClass1_Sub1_Sub3_2.method462(154);
											}
											this.aClass1_Sub1_Sub3_2.method461(72);
										}
										if (local28 == 957) {
											anInt266++;
											if (anInt266 >= 52) {
												this.aClass1_Sub1_Sub3_2.method461(121);
												this.aClass1_Sub1_Sub3_2.method462(131);
											}
											this.aClass1_Sub1_Sub3_2.method461(192);
										}
										this.aClass1_Sub1_Sub3_2.method463(this.anIntArray89[local1706]);
										local1801 = true;
										break;
									}
								}
								if (!local1801) {
									this.method200(0, "Unable to find " + local493, "");
								}
							}
						}
						if (local28 == 997 && !this.aBoolean57) {
							this.aClass1_Sub1_Sub3_2.method461(146);
							this.aClass1_Sub1_Sub3_2.method463(local23);
							this.aBoolean57 = true;
						}
						if (local28 == 829) {
							local532 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
							if (local532 != null) {
								this.method103(local532.anIntArray270[0], 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], 0, false, local532.anIntArray269[0], 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, 0, 1);
								this.anInt336 = super.anInt188;
								this.anInt337 = super.anInt189;
								this.anInt339 = 2;
								this.anInt338 = 0;
								this.aClass1_Sub1_Sub3_2.method461(119);
								this.aClass1_Sub1_Sub3_2.method463(local33);
								this.aClass1_Sub1_Sub3_2.method463(this.anInt218);
								this.aClass1_Sub1_Sub3_2.method463(this.anInt216);
								this.aClass1_Sub1_Sub3_2.method463(this.anInt217);
							}
						}
						if (local28 == 139 || local28 == 778 || local28 == 617 || local28 == 224 || local28 == 662) {
							local70 = this.method103(local23, 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], 0, false, local18, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, 0, 0);
							if (!local70) {
								this.method103(local23, 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], 0, false, local18, 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, 0, 1);
							}
							this.anInt336 = super.anInt188;
							this.anInt337 = super.anInt189;
							this.anInt339 = 2;
							this.anInt338 = 0;
							if (local28 == 662) {
								anInt320 += this.anInt278;
								if (anInt320 >= 118) {
									this.aClass1_Sub1_Sub3_2.method461(56);
									this.aClass1_Sub1_Sub3_2.method466(0);
								}
								this.aClass1_Sub1_Sub3_2.method461(97);
							}
							if (local28 == 224) {
								anInt251 += local23;
								if (anInt251 >= 75) {
									this.aClass1_Sub1_Sub3_2.method461(206);
									this.aClass1_Sub1_Sub3_2.method462(19);
								}
								this.aClass1_Sub1_Sub3_2.method461(47);
							}
							if (local28 == 139) {
								if ((local18 & 0x3) == 0) {
									anInt351++;
								}
								if (anInt351 >= 123) {
									this.aClass1_Sub1_Sub3_2.method461(187);
									this.aClass1_Sub1_Sub3_2.method466(0);
								}
								this.aClass1_Sub1_Sub3_2.method461(141);
							}
							if (local28 == 778) {
								this.aClass1_Sub1_Sub3_2.method461(67);
							}
							if (local28 == 617) {
								this.aClass1_Sub1_Sub3_2.method461(178);
							}
							this.aClass1_Sub1_Sub3_2.method463(local18 + this.anInt277);
							this.aClass1_Sub1_Sub3_2.method463(local23 + this.anInt278);
							this.aClass1_Sub1_Sub3_2.method463(local33);
						}
						if (local28 == 398) {
							this.aClass1_Sub1_Sub3_2.method461(200);
							this.aClass1_Sub1_Sub3_2.method463(local33);
							this.aClass1_Sub1_Sub3_2.method463(local18);
							this.aClass1_Sub1_Sub3_2.method463(local23);
							this.aClass1_Sub1_Sub3_2.method463(this.anInt218);
							this.aClass1_Sub1_Sub3_2.method463(this.anInt216);
							this.aClass1_Sub1_Sub3_2.method463(this.anInt217);
							this.anInt341 = 0;
							this.anInt342 = local23;
							this.anInt343 = local18;
							this.anInt344 = 2;
							if (Class6.aClass6Array1[local23].anInt407 == this.anInt322) {
								this.anInt344 = 1;
							}
							if (Class6.aClass6Array1[local23].anInt407 == this.anInt316) {
								this.anInt344 = 3;
							}
						}
						this.anInt215 = 0;
						this.anInt199 = 0;
						this.aBoolean56 = true;
					}
				}
			}
		} catch (@Pc(2283) RuntimeException local2283) {
			signlink.reporterror("57271, " + 0 + ", " + arg0 + ", " + local2283.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IJ)V")
	private void method161(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt378 >= 100) {
					this.method200(0, "Your ignore list is full. Max of 100 hit", "");
				} else {
					@Pc(23) String local23 = Class48.method663(584, Class48.method660(arg0));
					for (@Pc(25) int local25 = 0; local25 < this.anInt378; local25++) {
						if (this.aLongArray4[local25] == arg0) {
							this.method200(0, local23 + " is already on your ignore list", "");
							return;
						}
					}
					for (@Pc(55) int local55 = 0; local55 < this.anInt290; local55++) {
						if (this.aLongArray3[local55] == arg0) {
							this.method200(0, "Please remove " + local23 + " from your friend list first", "");
							return;
						}
					}
					this.aLongArray4[this.anInt378++] = arg0;
					this.aBoolean56 = true;
					this.aClass1_Sub1_Sub3_2.method461(189);
					this.aClass1_Sub1_Sub3_2.method468(arg0);
					this.anInt204 += 0;
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("47478, " + 0 + ", " + arg0 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method162() {
		try {
			if (this.aClass35_6 == null) {
				this.method216(this.anInt237);
				super.aClass35_2 = null;
				this.aClass35_19 = null;
				this.aClass35_20 = null;
				this.aClass35_21 = null;
				this.aClass35_22 = null;
				this.aClass35_23 = null;
				this.aClass35_24 = null;
				this.aClass35_25 = null;
				this.aClass35_26 = null;
				this.aClass35_27 = null;
				this.aClass35_6 = new Class35(479, false, this.method93(), 96);
				this.aClass35_4 = new Class35(172, false, this.method93(), 156);
				Class1_Sub1_Sub2.method433();
				this.aClass1_Sub1_Sub2_Sub3_2.method414(0, 0);
				this.aClass35_3 = new Class35(190, false, this.method93(), 261);
				this.aClass35_5 = new Class35(512, false, this.method93(), 334);
				Class1_Sub1_Sub2.method433();
				this.aClass35_16 = new Class35(496, false, this.method93(), 50);
				this.aClass35_17 = new Class35(269, false, this.method93(), 37);
				this.aClass35_18 = new Class35(249, false, this.method93(), 45);
				this.aBoolean86 = true;
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("50340, " + 584 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt314 = Integer.parseInt(this.getParameter("nodeid"));
		anInt315 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method106();
		} else {
			method133();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean76 = false;
		} else {
			aBoolean76 = true;
		}
		this.method84();
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method163() {
		try {
			@Pc(7) byte[] local7 = this.aClass47_1.method658("title.dat", null);
			@Pc(13) Class1_Sub1_Sub2_Sub2 local13 = new Class1_Sub1_Sub2_Sub2(local7, this);
			this.aClass35_22.method516();
			local13.method385(0, 0);
			this.aClass35_23.method516();
			local13.method385(0, -637);
			this.aClass35_19.method516();
			local13.method385(0, -128);
			this.aClass35_20.method516();
			local13.method385(-371, -202);
			this.aClass35_21.method516();
			local13.method385(-171, -202);
			this.aClass35_24.method516();
			local13.method385(-265, 0);
			this.aClass35_25.method516();
			local13.method385(-265, -562);
			this.aClass35_26.method516();
			local13.method385(-171, -128);
			this.aClass35_27.method516();
			local13.method385(-171, -562);
			@Pc(104) int[] local104 = new int[local13.anInt625];
			for (@Pc(106) int local106 = 0; local106 < local13.anInt626; local106++) {
				for (@Pc(110) int local110 = 0; local110 < local13.anInt625; local110++) {
					local104[local110] = local13.anIntArray205[local13.anInt625 + local13.anInt625 * local106 - local110 - 1];
				}
				for (@Pc(136) int local136 = 0; local136 < local13.anInt625; local136++) {
					local13.anIntArray205[local136 + local13.anInt625 * local106] = local104[local136];
				}
			}
			this.aClass35_22.method516();
			local13.method385(0, 382);
			this.aClass35_23.method516();
			local13.method385(0, -255);
			this.aClass35_19.method516();
			local13.method385(0, 254);
			this.aClass35_20.method516();
			local13.method385(-371, 180);
			this.aClass35_21.method516();
			local13.method385(-171, 180);
			this.aClass35_24.method516();
			local13.method385(-265, 382);
			this.aClass35_25.method516();
			local13.method385(-265, -180);
			this.aClass35_26.method516();
			local13.method385(-171, 254);
			this.aClass35_27.method516();
			local13.method385(-171, -180);
			local13 = new Class1_Sub1_Sub2_Sub2(this.aClass47_1, "logo", 0);
			this.aClass35_19.method516();
			local13.method387(18, 382 - local13.anInt625 / 2 - 128);
			System.gc();
		} catch (@Pc(274) RuntimeException local274) {
			signlink.reporterror("29011, " + 12681 + ", " + local274.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)Z")
	private boolean method164() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("29818, " + 2 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)V")
	private void method165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class29 local9 = this.aClass29ArrayArrayArray1[this.anInt386][arg0][arg1];
		if (local9 == null) {
			this.aClass37_1.method543(this.anInt386, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub1_Sub1_Sub3 local23 = null;
		@Pc(27) Class1_Sub1_Sub1_Sub3 local27;
		for (local27 = (Class1_Sub1_Sub1_Sub3) local9.method503(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub3) local9.method505()) {
			@Pc(32) Class15 local32 = Class15.method357(local27.anInt167);
			@Pc(35) int local35 = local32.anInt588;
			if (local32.aBoolean171) {
				local35 *= local27.anInt168 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method501(local23);
		@Pc(65) Class1_Sub1_Sub1_Sub3 local65 = null;
		@Pc(67) Class1_Sub1_Sub1_Sub3 local67 = null;
		for (local27 = (Class1_Sub1_Sub1_Sub3) local9.method503(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub3) local9.method505()) {
			if (local27.anInt167 != local23.anInt167 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt167 != local23.anInt167 && local27.anInt167 != local65.anInt167 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass37_1.method529(local67, local110, this.anInt386, arg0, local65, local23, this.method199(this.anInt386, arg0 * 128 + 64, arg1 * 128 + 64), arg1);
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method166() {
		try {
			if (this.anInt208 > 0) {
				this.method104(this.aByte14);
			} else {
				this.aClass35_5.method516();
				this.aClass1_Sub1_Sub2_Sub4_2.method442(257, 144, 0, "Connection lost");
				this.aClass1_Sub1_Sub2_Sub4_2.method442(256, 143, 16777215, "Connection lost");
				this.aClass1_Sub1_Sub2_Sub4_2.method442(257, 159, 0, "Please wait - attempting to reestablish");
				this.aClass1_Sub1_Sub2_Sub4_2.method442(256, 158, 16777215, "Please wait - attempting to reestablish");
				this.aClass35_5.method517(4, 4, super.aGraphics2);
				this.anInt358 = 0;
				@Pc(65) Class8 local65 = this.aClass8_1;
				this.aBoolean80 = false;
				this.method220(this.aString6, this.aString7, true);
				if (!this.aBoolean80) {
					this.method104(this.aByte14);
				}
				try {
					local65.method245();
				} catch (@Pc(86) Exception local86) {
				}
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("79553, " + -35099 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method167() {
		try {
			anInt225++;
			if (anInt225 > 192) {
				anInt225 = 0;
				this.aClass1_Sub1_Sub3_2.method461(226);
				this.aClass1_Sub1_Sub3_2.method462(232);
			}
			while (true) {
				@Pc(26) int local26;
				do {
					while (true) {
						local26 = this.method87();
						if (local26 == -1) {
							return;
						}
						if (this.anInt322 != -1 && this.anInt322 == this.anInt371) {
							if (local26 == 8 && this.aString8.length() > 0) {
								this.aString8 = this.aString8.substring(0, this.aString8.length() - 1);
							}
							break;
						}
						@Pc(206) int local206;
						if (this.aBoolean70) {
							if (local26 >= 32 && local26 <= 122 && this.aString11.length() < 80) {
								this.aString11 = this.aString11 + (char) local26;
								this.aBoolean68 = true;
							}
							if (local26 == 8 && this.aString11.length() > 0) {
								this.aString11 = this.aString11.substring(0, this.aString11.length() - 1);
								this.aBoolean68 = true;
							}
							if (local26 == 13 || local26 == 10) {
								this.aBoolean70 = false;
								this.aBoolean68 = true;
								@Pc(166) long local166;
								if (this.anInt198 == 1) {
									local166 = Class48.method659(this.aString11);
									this.method152(local166);
								}
								if (this.anInt198 == 2 && this.anInt290 > 0) {
									local166 = Class48.method659(this.aString11);
									this.method121(local166);
								}
								if (this.anInt198 == 3 && this.aString11.length() > 0) {
									this.aClass1_Sub1_Sub3_2.method461(214);
									this.aClass1_Sub1_Sub3_2.method462(0);
									local206 = this.aClass1_Sub1_Sub3_2.anInt715;
									this.aClass1_Sub1_Sub3_2.method468(this.aLong15);
									Class49.method677(this.anInt239, this.aClass1_Sub1_Sub3_2, this.aString11);
									this.aClass1_Sub1_Sub3_2.method471(this.aClass1_Sub1_Sub3_2.anInt715 - local206);
									this.aString11 = Class48.method664(this.aString11);
									this.aString11 = Class42.method596(this.aString11, this.aByte12);
									this.method200(6, this.aString11, Class48.method663(584, Class48.method660(this.aLong15)));
									if (this.anInt224 == 2) {
										this.anInt224 = 1;
										this.aBoolean81 = true;
										this.aClass1_Sub1_Sub3_2.method461(129);
										this.aClass1_Sub1_Sub3_2.method462(this.anInt260);
										this.aClass1_Sub1_Sub3_2.method462(this.anInt224);
										this.aClass1_Sub1_Sub3_2.method462(this.anInt348);
									}
								}
								if (this.anInt198 == 4 && this.anInt378 < 100) {
									local166 = Class48.method659(this.aString11);
									this.method161(local166);
								}
								if (this.anInt198 == 5 && this.anInt378 > 0) {
									local166 = Class48.method659(this.aString11);
									this.method132(local166);
								}
							}
						} else if (this.aBoolean97) {
							if (local26 >= 48 && local26 <= 57 && this.aString14.length() < 10) {
								this.aString14 = this.aString14 + (char) local26;
								this.aBoolean68 = true;
							}
							if (local26 == 8 && this.aString14.length() > 0) {
								this.aString14 = this.aString14.substring(0, this.aString14.length() - 1);
								this.aBoolean68 = true;
							}
							if (local26 == 13 || local26 == 10) {
								if (this.aString14.length() > 0) {
									local206 = 0;
									try {
										local206 = Integer.parseInt(this.aString14);
									} catch (@Pc(384) Exception local384) {
									}
									this.aClass1_Sub1_Sub3_2.method461(161);
									this.aClass1_Sub1_Sub3_2.method466(local206);
								}
								this.aBoolean97 = false;
								this.aBoolean68 = true;
							}
						} else if (this.anInt316 == -1) {
							if (local26 >= 32 && local26 <= 122 && this.aString15.length() < 80) {
								this.aString15 = this.aString15 + (char) local26;
								this.aBoolean68 = true;
							}
							if (local26 == 8 && this.aString15.length() > 0) {
								this.aString15 = this.aString15.substring(0, this.aString15.length() - 1);
								this.aBoolean68 = true;
							}
							if ((local26 == 13 || local26 == 10) && this.aString15.length() > 0) {
								if (this.anInt361 == 2) {
									if (this.aString15.equals("::clientdrop")) {
										this.method166();
									}
									if (this.aString15.equals("::lag")) {
										this.method191();
									}
									if (this.aString15.equals("::prefetchmusic")) {
										for (local206 = 0; local206 < this.aClass44_Sub1_1.method630(2); local206++) {
											this.aClass44_Sub1_1.method640(2, local206, (byte) 1);
										}
									}
								}
								if (this.aString15.startsWith("::")) {
									this.aClass1_Sub1_Sub3_2.method461(86);
									this.aClass1_Sub1_Sub3_2.method462(this.aString15.length() - 1);
									this.aClass1_Sub1_Sub3_2.method469(this.aString15.substring(2));
								} else {
									@Pc(535) byte local535 = 0;
									if (this.aString15.startsWith("yellow:")) {
										local535 = 0;
										this.aString15 = this.aString15.substring(7);
									}
									if (this.aString15.startsWith("red:")) {
										local535 = 1;
										this.aString15 = this.aString15.substring(4);
									}
									if (this.aString15.startsWith("green:")) {
										local535 = 2;
										this.aString15 = this.aString15.substring(6);
									}
									if (this.aString15.startsWith("cyan:")) {
										local535 = 3;
										this.aString15 = this.aString15.substring(5);
									}
									if (this.aString15.startsWith("purple:")) {
										local535 = 4;
										this.aString15 = this.aString15.substring(7);
									}
									if (this.aString15.startsWith("white:")) {
										local535 = 5;
										this.aString15 = this.aString15.substring(6);
									}
									if (this.aString15.startsWith("flash1:")) {
										local535 = 6;
										this.aString15 = this.aString15.substring(7);
									}
									if (this.aString15.startsWith("flash2:")) {
										local535 = 7;
										this.aString15 = this.aString15.substring(7);
									}
									if (this.aString15.startsWith("flash3:")) {
										local535 = 8;
										this.aString15 = this.aString15.substring(7);
									}
									if (this.aString15.startsWith("glow1:")) {
										local535 = 9;
										this.aString15 = this.aString15.substring(6);
									}
									if (this.aString15.startsWith("glow2:")) {
										local535 = 10;
										this.aString15 = this.aString15.substring(6);
									}
									if (this.aString15.startsWith("glow3:")) {
										local535 = 11;
										this.aString15 = this.aString15.substring(6);
									}
									@Pc(693) byte local693 = 0;
									if (this.aString15.startsWith("wave:")) {
										local693 = 1;
										this.aString15 = this.aString15.substring(5);
									}
									if (this.aString15.startsWith("scroll:")) {
										local693 = 2;
										this.aString15 = this.aString15.substring(7);
									}
									this.aClass1_Sub1_Sub3_2.method461(83);
									this.aClass1_Sub1_Sub3_2.method462(0);
									@Pc(732) int local732 = this.aClass1_Sub1_Sub3_2.anInt715;
									this.aClass1_Sub1_Sub3_2.method462(local535);
									this.aClass1_Sub1_Sub3_2.method462(local693);
									Class49.method677(this.anInt239, this.aClass1_Sub1_Sub3_2, this.aString15);
									this.aClass1_Sub1_Sub3_2.method471(this.aClass1_Sub1_Sub3_2.anInt715 - local732);
									this.aString15 = Class48.method664(this.aString15);
									this.aString15 = Class42.method596(this.aString15, this.aByte12);
									aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31 = this.aString15;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt973 = local535;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt974 = local693;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt972 = 150;
									if (this.anInt361 == 2) {
										this.method200(2, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31, "@cr2@" + aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3);
									} else if (this.anInt361 == 1) {
										this.method200(2, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31, "@cr1@" + aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3);
									} else {
										this.method200(2, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3);
									}
									if (this.anInt260 == 2) {
										this.anInt260 = 3;
										this.aBoolean81 = true;
										this.aClass1_Sub1_Sub3_2.method461(129);
										this.aClass1_Sub1_Sub3_2.method462(this.anInt260);
										this.aClass1_Sub1_Sub3_2.method462(this.anInt224);
										this.aClass1_Sub1_Sub3_2.method462(this.anInt348);
									}
								}
								this.aString15 = "";
								this.aBoolean68 = true;
							}
						}
					}
				} while ((local26 < 97 || local26 > 122) && (local26 < 65 || local26 > 90) && (local26 < 48 || local26 > 57) && local26 != 32);
				if (this.aString8.length() < 12) {
					this.aString8 = this.aString8 + (char) local26;
				}
			}
		} catch (@Pc(870) RuntimeException local870) {
			signlink.reporterror("5787, " + false + ", " + local870.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ab;IBII)V")
	private void method169(@OriginalArg(0) Class1_Sub1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(6) boolean local6 = false;
			if (arg0 != aClass1_Sub1_Sub1_Sub1_Sub1_1 && this.anInt222 < 400) {
				@Pc(49) String local49;
				if (arg0.anInt125 == 0) {
					local49 = arg0.aString3 + method142(arg0.anInt124, aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt124, this.aByte13) + " (level-" + arg0.anInt124 + ")";
				} else {
					local49 = arg0.aString3 + " (skill-" + arg0.anInt125 + ")";
				}
				@Pc(179) int local179;
				if (this.anInt215 == 1) {
					this.aStringArray6[this.anInt222] = "Use " + this.aString5 + " with @whi@" + local49;
					this.anIntArray81[this.anInt222] = 275;
					this.anIntArray82[this.anInt222] = arg1;
					this.anIntArray79[this.anInt222] = arg4;
					this.anIntArray80[this.anInt222] = arg3;
					this.anInt222++;
				} else if (this.anInt199 != 1) {
					for (local179 = 4; local179 >= 0; local179--) {
						if (this.aStringArray4[local179] != null) {
							this.aStringArray6[this.anInt222] = this.aStringArray4[local179] + " @whi@" + local49;
							@Pc(206) short local206 = 0;
							if (this.aStringArray4[local179].equalsIgnoreCase("attack")) {
								if (arg0.anInt124 > aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt124) {
									local206 = 2000;
								}
							} else if (this.aBooleanArray3[local179]) {
								local206 = 2000;
							}
							if (local179 == 0) {
								this.anIntArray81[this.anInt222] = local206 + 639;
							}
							if (local179 == 1) {
								this.anIntArray81[this.anInt222] = local206 + 499;
							}
							if (local179 == 2) {
								this.anIntArray81[this.anInt222] = local206 + 27;
							}
							if (local179 == 3) {
								this.anIntArray81[this.anInt222] = local206 + 387;
							}
							if (local179 == 4) {
								this.anIntArray81[this.anInt222] = local206 + 185;
							}
							this.anIntArray82[this.anInt222] = arg1;
							this.anIntArray79[this.anInt222] = arg4;
							this.anIntArray80[this.anInt222] = arg3;
							this.anInt222++;
						}
					}
				} else if ((this.anInt201 & 0x8) == 8) {
					this.aStringArray6[this.anInt222] = this.aString4 + " @whi@" + local49;
					this.anIntArray81[this.anInt222] = 131;
					this.anIntArray82[this.anInt222] = arg1;
					this.anIntArray79[this.anInt222] = arg4;
					this.anIntArray80[this.anInt222] = arg3;
					this.anInt222++;
				}
				for (local179 = 0; local179 < this.anInt222; local179++) {
					if (this.anIntArray81[local179] == 718) {
						this.aStringArray6[local179] = "Walk here @whi@" + local49;
						return;
					}
				}
			}
		} catch (@Pc(339) RuntimeException local339) {
			signlink.reporterror("2165, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local339.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method170() {
		try {
			@Pc(16) int local16;
			for (@Pc(9) int local9 = 10; local9 < 117; local9++) {
				local16 = (int) (Math.random() * 100.0D);
				if (local16 < 50) {
					this.anIntArray60[local9 + 32512] = 255;
				}
			}
			@Pc(45) int local45;
			@Pc(52) int local52;
			@Pc(58) int local58;
			for (local16 = 0; local16 < 100; local16++) {
				local45 = (int) (Math.random() * 124.0D) + 2;
				local52 = (int) (Math.random() * 128.0D) + 128;
				local58 = local45 + (local52 << 7);
				this.anIntArray60[local58] = 192;
			}
			for (local45 = 1; local45 < 255; local45++) {
				for (local52 = 1; local52 < 127; local52++) {
					local58 = local52 + (local45 << 7);
					this.anIntArray61[local58] = (this.anIntArray60[local58 - 1] + this.anIntArray60[local58 + 1] + this.anIntArray60[local58 - 128] + this.anIntArray60[local58 + 128]) / 4;
				}
			}
			this.anInt257 += 128;
			if (this.anInt257 > this.anIntArray34.length) {
				this.anInt257 -= this.anIntArray34.length;
				local52 = (int) (Math.random() * 12.0D);
				this.method153(602, this.aClass1_Sub1_Sub2_Sub3Array4[local52]);
			}
			@Pc(170) int local170;
			for (local52 = 1; local52 < 255; local52++) {
				for (local58 = 1; local58 < 127; local58++) {
					local170 = local58 + (local52 << 7);
					@Pc(193) int local193 = this.anIntArray61[local170 + 128] - this.anIntArray34[local170 + this.anInt257 & this.anIntArray34.length - 1] / 5;
					if (local193 < 0) {
						local193 = 0;
					}
					this.anIntArray60[local170] = local193;
				}
			}
			for (local58 = 0; local58 < 255; local58++) {
				this.anIntArray36[local58] = this.anIntArray36[local58 + 1];
			}
			this.anIntArray36[255] = (int) (Math.sin((double) anInt375 / 14.0D) * 16.0D + Math.sin((double) anInt375 / 15.0D) * 14.0D + Math.sin((double) anInt375 / 16.0D) * 12.0D);
			if (this.anInt365 > 0) {
				this.anInt365 -= 4;
			}
			if (this.anInt366 > 0) {
				this.anInt366 -= 4;
			}
			if (this.anInt365 == 0 && this.anInt366 == 0) {
				local170 = (int) (Math.random() * 2000.0D);
				if (local170 == 0) {
					this.anInt365 = 1024;
				}
				if (local170 == 1) {
					this.anInt366 = 1024;
					return;
				}
			}
		} catch (@Pc(304) RuntimeException local304) {
			signlink.reporterror("46259, " + 7 + ", " + local304.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!d;)V")
	private void method171(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class6 arg1) {
		try {
			if (arg0) {
				this.anInt226 = this.aClass46_1.method654();
			}
			@Pc(11) int local11 = arg1.anInt410;
			@Pc(67) int local67;
			if (local11 >= 1 && local11 <= 100 || local11 >= 701 && local11 <= 800) {
				if (local11 == 1 && this.anInt291 == 0) {
					arg1.aString18 = "Loading friend list";
					arg1.anInt409 = 0;
				} else if (local11 == 1 && this.anInt291 == 1) {
					arg1.aString18 = "Connecting to friendserver";
					arg1.anInt409 = 0;
				} else if (local11 == 2 && this.anInt291 != 2) {
					arg1.aString18 = "Please wait...";
					arg1.anInt409 = 0;
				} else {
					local67 = this.anInt290;
					if (this.anInt291 != 2) {
						local67 = 0;
					}
					if (local11 > 700) {
						local11 -= 601;
					} else {
						local11--;
					}
					if (local11 >= local67) {
						arg1.aString18 = "";
						arg1.anInt409 = 0;
					} else {
						arg1.aString18 = this.aStringArray3[local11];
						arg1.anInt409 = 1;
					}
				}
			} else if (local11 >= 101 && local11 <= 200 || !(local11 < 801 || local11 > 900)) {
				local67 = this.anInt290;
				if (this.anInt291 != 2) {
					local67 = 0;
				}
				if (local11 > 800) {
					local11 -= 701;
				} else {
					local11 -= 101;
				}
				if (local11 >= local67) {
					arg1.aString18 = "";
					arg1.anInt409 = 0;
				} else {
					if (this.anIntArray48[local11] == 0) {
						arg1.aString18 = "@red@Offline";
					} else if (this.anIntArray48[local11] == anInt314) {
						arg1.aString18 = "@gre@World-" + (this.anIntArray48[local11] - 9);
					} else {
						arg1.aString18 = "@yel@World-" + (this.anIntArray48[local11] - 9);
					}
					arg1.anInt409 = 1;
				}
			} else if (local11 == 203) {
				local67 = this.anInt290;
				if (this.anInt291 != 2) {
					local67 = 0;
				}
				arg1.anInt416 = local67 * 15 + 20;
				if (arg1.anInt416 <= arg1.anInt412) {
					arg1.anInt416 = arg1.anInt412 + 1;
				}
			} else if (local11 >= 401 && local11 <= 500) {
				local11 -= 401;
				if (local11 >= this.anInt378) {
					arg1.aString18 = "";
					arg1.anInt409 = 0;
				} else {
					arg1.aString18 = Class48.method663(584, Class48.method660(this.aLongArray4[local11]));
					arg1.anInt409 = 1;
				}
			} else if (local11 == 503) {
				arg1.anInt416 = this.anInt378 * 15 + 20;
				if (arg1.anInt416 <= arg1.anInt412) {
					arg1.anInt416 = arg1.anInt412 + 1;
				}
			} else if (local11 == 327) {
				arg1.anInt432 = 150;
				arg1.anInt433 = (int) (Math.sin((double) anInt375 / 40.0D) * 256.0D) & 0x7FF;
				if (this.aBoolean82) {
					for (local67 = 0; local67 < 7; local67++) {
						@Pc(304) int local304 = this.anIntArray53[local67];
						if (local304 >= 0 && !Class23.aClass23Array1[local304].method490()) {
							return;
						}
					}
					this.aBoolean82 = false;
					@Pc(323) Class1_Sub1_Sub1_Sub5[] local323 = new Class1_Sub1_Sub1_Sub5[7];
					@Pc(325) int local325 = 0;
					for (@Pc(327) int local327 = 0; local327 < 7; local327++) {
						@Pc(334) int local334 = this.anIntArray53[local327];
						if (local334 >= 0) {
							local323[local325++] = Class23.aClass23Array1[local334].method491();
						}
					}
					@Pc(357) Class1_Sub1_Sub1_Sub5 local357 = new Class1_Sub1_Sub1_Sub5(local325, local323, this.anInt245);
					for (@Pc(359) int local359 = 0; local359 < 5; local359++) {
						if (this.anIntArray85[local359] != 0) {
							local357.method273(anIntArrayArray5[local359][0], anIntArrayArray5[local359][this.anIntArray85[local359]]);
							if (local359 == 1) {
								local357.method273(anIntArray32[0], anIntArray32[this.anIntArray85[local359]]);
							}
						}
					}
					local357.method266();
					local357.method267(Class27.aClass27Array1[aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt965].anIntArray222[0]);
					local357.method276(64, 850, -30, -50, -30, true);
					arg1.anInt425 = 5;
					arg1.anInt426 = 0;
					Class6.method233(local357);
				}
			} else if (local11 == 324) {
				if (this.aClass1_Sub1_Sub2_Sub2_2 == null) {
					this.aClass1_Sub1_Sub2_Sub2_2 = arg1.aClass1_Sub1_Sub2_Sub2_14;
					this.aClass1_Sub1_Sub2_Sub2_3 = arg1.aClass1_Sub1_Sub2_Sub2_15;
				}
				if (this.aBoolean63) {
					arg1.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_3;
				} else {
					arg1.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_2;
				}
			} else if (local11 == 325) {
				if (this.aClass1_Sub1_Sub2_Sub2_2 == null) {
					this.aClass1_Sub1_Sub2_Sub2_2 = arg1.aClass1_Sub1_Sub2_Sub2_14;
					this.aClass1_Sub1_Sub2_Sub2_3 = arg1.aClass1_Sub1_Sub2_Sub2_15;
				}
				if (this.aBoolean63) {
					arg1.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_2;
				} else {
					arg1.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_3;
				}
			} else if (local11 == 600) {
				arg1.aString18 = this.aString8;
				if (anInt375 % 20 < 10) {
					arg1.aString18 = arg1.aString18 + "|";
				} else {
					arg1.aString18 = arg1.aString18 + " ";
				}
			} else {
				if (local11 == 613) {
					if (this.anInt361 < 1) {
						arg1.aString18 = "";
					} else if (this.aBoolean60) {
						arg1.anInt421 = 16711680;
						arg1.aString18 = "Moderator option: Mute player for 48 hours: <ON>";
					} else {
						arg1.anInt421 = 16777215;
						arg1.aString18 = "Moderator option: Mute player for 48 hours: <OFF>";
					}
				}
				@Pc(565) String local565;
				if (local11 == 650 || local11 == 655) {
					if (this.anInt283 == 0) {
						arg1.aString18 = "";
					} else {
						if (this.anInt382 == 0) {
							local565 = "earlier today";
						} else if (this.anInt382 == 1) {
							local565 = "yesterday";
						} else {
							local565 = this.anInt382 + " days ago";
						}
						arg1.aString18 = "You last logged in " + local565 + " from: " + signlink.dns;
					}
				}
				if (local11 == 651) {
					if (this.anInt352 == 0) {
						arg1.aString18 = "0 unread messages";
						arg1.anInt421 = 16776960;
					}
					if (this.anInt352 == 1) {
						arg1.aString18 = "1 unread message";
						arg1.anInt421 = 65280;
					}
					if (this.anInt352 > 1) {
						arg1.aString18 = this.anInt352 + " unread messages";
						arg1.anInt421 = 65280;
					}
				}
				if (local11 == 652) {
					if (this.anInt249 == 201) {
						if (this.anInt349 == 1) {
							arg1.aString18 = "@yel@This is a non-members world: @whi@Since you are a member we";
						} else {
							arg1.aString18 = "";
						}
					} else if (this.anInt249 == 200) {
						arg1.aString18 = "You have not yet set any password recovery questions.";
					} else {
						if (this.anInt249 == 0) {
							local565 = "Earlier today";
						} else if (this.anInt249 == 1) {
							local565 = "Yesterday";
						} else {
							local565 = this.anInt249 + " days ago";
						}
						arg1.aString18 = local565 + " you changed your recovery questions";
					}
				}
				if (local11 == 653) {
					if (this.anInt249 == 201) {
						if (this.anInt349 == 1) {
							arg1.aString18 = "@whi@recommend you use a members world instead. You may use";
						} else {
							arg1.aString18 = "";
						}
					} else if (this.anInt249 == 200) {
						arg1.aString18 = "We strongly recommend you do so now to secure your account.";
					} else {
						arg1.aString18 = "If you do not remember making this change then cancel it immediately";
					}
				}
				if (local11 == 654) {
					if (this.anInt249 == 201) {
						if (this.anInt349 == 1) {
							arg1.aString18 = "@whi@this world but member benefits are unavailabe whilst here.";
						} else {
							arg1.aString18 = "";
						}
					} else if (this.anInt249 == 200) {
						arg1.aString18 = "Do this from the 'account management' area on our front webpage";
					} else {
						arg1.aString18 = "Do this from the 'account management' area on our front webpage";
					}
				}
			}
		} catch (@Pc(773) RuntimeException local773) {
			signlink.reporterror("86378, " + arg0 + ", " + arg1 + ", " + local773.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)V")
	private void method172(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(8) int local8 = this.aClass37_1.method548(arg1, arg2, arg3);
			@Pc(18) int local18;
			@Pc(24) int local24;
			@Pc(28) int local28;
			@Pc(30) int local30;
			@Pc(52) int local52;
			@Pc(58) int local58;
			if (local8 != 0) {
				local18 = this.aClass37_1.method552(arg1, arg2, arg3, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = arg4;
				if (local8 > 0) {
					local30 = arg0;
				}
				@Pc(38) int[] local38 = this.aClass1_Sub1_Sub2_Sub2_13.anIntArray205;
				local52 = arg2 * 4 + (103 - arg3) * 512 * 4 + 24624;
				local58 = local8 >> 14 & 0x7FFF;
				@Pc(61) Class9 local61 = Class9.method286(local58);
				if (local61.anInt494 == -1) {
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
					@Pc(71) Class1_Sub1_Sub2_Sub3 local71 = this.aClass1_Sub1_Sub2_Sub3Array1[local61.anInt494];
					if (local71 != null) {
						@Pc(83) int local83 = (local61.anInt489 * 4 - local71.anInt649) / 2;
						@Pc(93) int local93 = (local61.anInt490 * 4 - local71.anInt650) / 2;
						local71.method414((104 - arg3 - local61.anInt490) * 4 + local93 + 48, arg2 * 4 + 48 + local83);
					}
				}
			}
			local8 = this.aClass37_1.method550(arg1, arg2, arg3);
			if (local8 != 0) {
				local18 = this.aClass37_1.method552(arg1, arg2, arg3, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = local8 >> 14 & 0x7FFF;
				@Pc(447) Class9 local447 = Class9.method286(local30);
				@Pc(479) int local479;
				if (local447.anInt494 != -1) {
					@Pc(457) Class1_Sub1_Sub2_Sub3 local457 = this.aClass1_Sub1_Sub2_Sub3Array1[local447.anInt494];
					if (local457 != null) {
						local58 = (local447.anInt489 * 4 - local457.anInt649) / 2;
						local479 = (local447.anInt490 * 4 - local457.anInt650) / 2;
						local457.method414((104 - arg3 - local447.anInt490) * 4 + local479 + 48, arg2 * 4 + 48 + local58);
					}
				} else if (local28 == 9) {
					local52 = 15658734;
					if (local8 > 0) {
						local52 = 15597568;
					}
					@Pc(516) int[] local516 = this.aClass1_Sub1_Sub2_Sub2_13.anIntArray205;
					local479 = arg2 * 4 + (103 - arg3) * 512 * 4 + 24624;
					if (local24 == 0 || local24 == 2) {
						local516[local479 + 1536] = local52;
						local516[local479 + 1024 + 1] = local52;
						local516[local479 + 512 + 2] = local52;
						local516[local479 + 3] = local52;
					} else {
						local516[local479] = local52;
						local516[local479 + 512 + 1] = local52;
						local516[local479 + 1024 + 2] = local52;
						local516[local479 + 1536 + 3] = local52;
					}
				}
			}
			local8 = this.aClass37_1.method551(arg1, arg2, arg3);
			if (local8 != 0) {
				local18 = local8 >> 14 & 0x7FFF;
				@Pc(618) Class9 local618 = Class9.method286(local18);
				if (local618.anInt494 != -1) {
					@Pc(628) Class1_Sub1_Sub2_Sub3 local628 = this.aClass1_Sub1_Sub2_Sub3Array1[local618.anInt494];
					if (local628 != null) {
						local30 = (local618.anInt489 * 4 - local628.anInt649) / 2;
						@Pc(650) int local650 = (local618.anInt490 * 4 - local628.anInt650) / 2;
						local628.method414((104 - arg3 - local618.anInt490) * 4 + local650 + 48, arg2 * 4 + 48 + local30);
						return;
					}
				}
			}
		} catch (@Pc(674) RuntimeException local674) {
			signlink.reporterror("57351, " + arg0 + ", " + -414 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local674.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;IIILjava/lang/String;)Lclient!xb;")
	private Class47 method173(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			@Pc(3) byte[] local3 = null;
			@Pc(5) int local5 = 5;
			try {
				if (this.aClass45Array1[0] != null) {
					local3 = this.aClass45Array1[0].method650(arg2);
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
				return new Class47(local3, 451);
			}
			local34 = 0;
			while (local3 == null) {
				@Pc(66) String local66 = "Unknown error";
				this.method95(arg3, "Requesting " + arg0);
				@Pc(81) int local81;
				try {
					local81 = 0;
					@Pc(92) DataInputStream local92 = this.method101(arg4 + arg1);
					@Pc(95) byte[] local95 = new byte[6];
					local92.readFully(local95, 0, 6);
					@Pc(106) Class1_Sub1_Sub3 local106 = new Class1_Sub1_Sub3((byte) 3, local95);
					local106.anInt715 = 3;
					@Pc(114) int local114 = local106.method476() + 6;
					@Pc(116) int local116 = 6;
					local3 = new byte[local114];
					for (@Pc(121) int local121 = 0; local121 < 6; local121++) {
						local3[local121] = local95[local121];
					}
					@Pc(139) int local139;
					while (local116 < local114) {
						local139 = local114 - local116;
						if (local139 > 1000) {
							local139 = 1000;
						}
						@Pc(150) int local150 = local92.read(local3, local116, local139);
						if (local150 < 0) {
							(new StringBuffer("Length error: ")).append(local116).append("/").append(local114).toString();
							throw new IOException("EOF");
						}
						local116 += local150;
						@Pc(179) int local179 = local116 * 100 / local114;
						if (local179 != local81) {
							this.method95(arg3, "Loading " + arg0 + " - " + local179 + "%");
						}
						local81 = local179;
					}
					local92.close();
					try {
						if (this.aClass45Array1[0] != null) {
							this.aClass45Array1[0].method651(local3, arg2, local3.length, 870);
						}
					} catch (@Pc(224) Exception local224) {
						this.aClass45Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_1.reset();
						this.aCRC32_1.update(local3);
						local139 = (int) this.aCRC32_1.getValue();
						if (local139 != arg1) {
							local3 = null;
							local34++;
							local66 = "Checksum error: " + local139;
						}
					}
				} catch (@Pc(259) IOException local259) {
					if (local66.equals("Unknown error")) {
						local66 = "Connection error";
					}
					local3 = null;
				} catch (@Pc(269) NullPointerException local269) {
					local66 = "Null error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(278) ArrayIndexOutOfBoundsException local278) {
					local66 = "Bounds error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(287) Exception local287) {
					local66 = "Unexpected error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local3 == null) {
					for (local81 = local5; local81 > 0; local81--) {
						if (local34 >= 3) {
							this.method95(arg3, "Game updated - please reload page");
							local81 = 10;
						} else {
							this.method95(arg3, local66 + " - Retrying in " + local81);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(331) Exception local331) {
						}
					}
					local5 *= 2;
					if (local5 > 60) {
						local5 = 60;
					}
					this.aBoolean61 = !this.aBoolean61;
				}
			}
			return new Class47(local3, 451);
		} catch (@Pc(363) RuntimeException local363) {
			signlink.reporterror("15472, " + 5693 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local363.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!nb;B)V")
	private void method174(@OriginalArg(0) Class1_Sub2 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt756 == 0) {
				local1 = this.aClass37_1.method548(arg0.anInt755, arg0.anInt757, arg0.anInt758);
			}
			if (arg0.anInt756 == 1) {
				local1 = this.aClass37_1.method549(arg0.anInt755, arg0.anInt757, arg0.anInt758);
			}
			if (arg0.anInt756 == 2) {
				local1 = this.aClass37_1.method550(arg0.anInt755, arg0.anInt757, arg0.anInt758);
			}
			if (arg0.anInt756 == 3) {
				local1 = this.aClass37_1.method551(arg0.anInt755, arg0.anInt757, arg0.anInt758);
			}
			if (local1 != 0) {
				@Pc(82) int local82 = this.aClass37_1.method552(arg0.anInt755, arg0.anInt757, arg0.anInt758, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local82 & 0x1F;
				local7 = local82 >> 6;
			}
			arg0.anInt759 = local3;
			arg0.anInt761 = local5;
			arg0.anInt760 = local7;
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("40896, " + arg0 + ", " + 33 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method175(@OriginalArg(0) boolean arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt357; local1++) {
				@Pc(11) Class1_Sub1_Sub1_Sub1_Sub2 local11 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray77[local1]];
				@Pc(20) int local20 = (this.anIntArray77[local1] << 14) + 536870912;
				if (local11 != null && local11.method673() && local11.aClass13_2.aBoolean157 == arg0) {
					@Pc(36) int local36 = local11.anInt961 >> 7;
					@Pc(41) int local41 = local11.anInt962 >> 7;
					if (local36 >= 0 && local36 < 104 && local41 >= 0 && local41 < 104) {
						if (local11.anInt964 == 1 && (local11.anInt961 & 0x7F) == 64 && (local11.anInt962 & 0x7F) == 64) {
							if (this.anIntArrayArray6[local36][local41] == this.anInt311) {
								continue;
							}
							this.anIntArrayArray6[local36][local41] = this.anInt311;
						}
						this.aClass37_1.method533(local11.anInt963, local11.anInt962, local11.aBoolean260, local11.anInt961, this.method199(this.anInt386, local11.anInt961, local11.anInt962), local11, this.anInt386, (local11.anInt964 - 1) * 64 + 60, local20);
					}
				}
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("96021, " + arg0 + ", " + -868 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method176() {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt357; local1++) {
				@Pc(8) int local8 = this.anIntArray77[local1];
				@Pc(13) Class1_Sub1_Sub1_Sub1_Sub2 local13 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local8];
				if (local13 != null) {
					this.method177(local13.aClass13_2.aByte19, local13);
				}
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("33226, " + false + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILclient!y;)V")
	private void method177(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub1_Sub1 arg1) {
		try {
			if (arg1.anInt961 < 128 || arg1.anInt962 < 128 || arg1.anInt961 >= 13184 || arg1.anInt962 >= 13184) {
				arg1.anInt984 = -1;
				arg1.anInt989 = -1;
				arg1.anInt998 = 0;
				arg1.anInt999 = 0;
				arg1.anInt961 = arg1.anIntArray269[0] * 128 + arg1.anInt964 * 64;
				arg1.anInt962 = arg1.anIntArray270[0] * 128 + arg1.anInt964 * 64;
				arg1.method672();
			}
			if (arg1 == aClass1_Sub1_Sub1_Sub1_Sub1_1 && (arg1.anInt961 < 1536 || arg1.anInt962 < 1536 || arg1.anInt961 >= 11776 || arg1.anInt962 >= 11776)) {
				arg1.anInt984 = -1;
				arg1.anInt989 = -1;
				arg1.anInt998 = 0;
				arg1.anInt999 = 0;
				arg1.anInt961 = arg1.anIntArray269[0] * 128 + arg1.anInt964 * 64;
				arg1.anInt962 = arg1.anIntArray270[0] * 128 + arg1.anInt964 * 64;
				arg1.method672();
			}
			if (arg1.anInt998 > anInt375) {
				this.method178(arg1, this.anInt355);
			} else if (arg1.anInt999 >= anInt375) {
				this.method179(arg1);
			} else {
				this.method180(arg1);
			}
			this.method181(arg1);
			this.method182(572, arg1);
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("76214, " + true + ", " + arg0 + ", " + arg1 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!y;I)V")
	private void method178(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = arg0.anInt998 - anInt375;
			@Pc(14) int local14 = arg0.anInt994 * 128 + arg0.anInt964 * 64;
			@Pc(24) int local24 = arg0.anInt996 * 128 + arg0.anInt964 * 64;
			arg0.anInt961 += (local14 - arg0.anInt961) / local4;
			if (arg1 != 0) {
				this.method88();
			}
			arg0.anInt962 += (local24 - arg0.anInt962) / local4;
			arg0.anInt1006 = 0;
			if (arg0.anInt1000 == 0) {
				arg0.anInt1003 = 1024;
			}
			if (arg0.anInt1000 == 1) {
				arg0.anInt1003 = 1536;
			}
			if (arg0.anInt1000 == 2) {
				arg0.anInt1003 = 0;
			}
			if (arg0.anInt1000 == 3) {
				arg0.anInt1003 = 512;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("97081, " + arg0 + ", " + arg1 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!y;I)V")
	private void method179(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt999 == anInt375 || arg0.anInt984 == -1 || arg0.anInt987 != 0 || arg0.anInt986 + 1 > Class27.aClass27Array1[arg0.anInt984].method498(arg0.anInt985)) {
				@Pc(29) int local29 = arg0.anInt999 - arg0.anInt998;
				@Pc(34) int local34 = anInt375 - arg0.anInt998;
				@Pc(44) int local44 = arg0.anInt994 * 128 + arg0.anInt964 * 64;
				@Pc(54) int local54 = arg0.anInt996 * 128 + arg0.anInt964 * 64;
				@Pc(64) int local64 = arg0.anInt995 * 128 + arg0.anInt964 * 64;
				@Pc(74) int local74 = arg0.anInt997 * 128 + arg0.anInt964 * 64;
				arg0.anInt961 = (local44 * (local29 - local34) + local64 * local34) / local29;
				arg0.anInt962 = (local54 * (local29 - local34) + local74 * local34) / local29;
			}
			arg0.anInt1006 = 0;
			if (arg0.anInt1000 == 0) {
				arg0.anInt1003 = 1024;
			}
			if (arg0.anInt1000 == 1) {
				arg0.anInt1003 = 1536;
			}
			if (arg0.anInt1000 == 2) {
				arg0.anInt1003 = 0;
			}
			if (arg0.anInt1000 == 3) {
				arg0.anInt1003 = 512;
			}
			arg0.anInt963 = arg0.anInt1003;
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("67278, " + arg0 + ", " + -224 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!y;)V")
	private void method180(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.anInt981 = arg0.anInt965;
			if (arg0.anInt1005 == 0) {
				arg0.anInt1006 = 0;
			} else {
				if (arg0.anInt984 != -1 && arg0.anInt987 == 0) {
					@Pc(24) Class27 local24 = Class27.aClass27Array1[arg0.anInt984];
					if (arg0.anInt1007 > 0 && local24.anInt774 == 0) {
						arg0.anInt1006++;
						return;
					}
					if (arg0.anInt1007 <= 0 && local24.anInt775 == 0) {
						arg0.anInt1006++;
						return;
					}
				}
				@Pc(53) int local53 = arg0.anInt961;
				@Pc(56) int local56 = arg0.anInt962;
				@Pc(71) int local71 = arg0.anIntArray269[arg0.anInt1005 - 1] * 128 + arg0.anInt964 * 64;
				@Pc(86) int local86 = arg0.anIntArray270[arg0.anInt1005 - 1] * 128 + arg0.anInt964 * 64;
				if (local71 - local53 <= 256 && local71 - local53 >= -256 && local86 - local56 <= 256 && local86 - local56 >= -256) {
					if (local53 < local71) {
						if (local56 < local86) {
							arg0.anInt1003 = 1280;
						} else if (local56 > local86) {
							arg0.anInt1003 = 1792;
						} else {
							arg0.anInt1003 = 1536;
						}
					} else if (local53 > local71) {
						if (local56 < local86) {
							arg0.anInt1003 = 768;
						} else if (local56 > local86) {
							arg0.anInt1003 = 256;
						} else {
							arg0.anInt1003 = 512;
						}
					} else if (local56 < local86) {
						arg0.anInt1003 = 1024;
					} else {
						arg0.anInt1003 = 0;
					}
					@Pc(180) int local180 = arg0.anInt1003 - arg0.anInt963 & 0x7FF;
					if (local180 > 1024) {
						local180 -= 2048;
					}
					@Pc(187) int local187 = arg0.anInt968;
					if (local180 >= -256 && local180 <= 256) {
						local187 = arg0.anInt967;
					} else if (local180 >= 256 && local180 < 768) {
						local187 = arg0.anInt970;
					} else if (local180 >= -768 && local180 <= -256) {
						local187 = arg0.anInt969;
					}
					if (local187 == -1) {
						local187 = arg0.anInt967;
					}
					arg0.anInt981 = local187;
					@Pc(239) int local239 = 4;
					if (arg0.anInt963 != arg0.anInt1003 && arg0.anInt978 == -1 && arg0.anInt1004 != 0) {
						local239 = 2;
					}
					if (arg0.anInt1005 > 2) {
						local239 = 6;
					}
					if (arg0.anInt1005 > 3) {
						local239 = 8;
					}
					if (arg0.anInt1006 > 0 && arg0.anInt1005 > 1) {
						local239 = 8;
						arg0.anInt1006--;
					}
					if (arg0.aBooleanArray12[arg0.anInt1005 - 1]) {
						local239 <<= 0x1;
					}
					if (local239 >= 8 && arg0.anInt981 == arg0.anInt967 && arg0.anInt971 != -1) {
						arg0.anInt981 = arg0.anInt971;
					}
					if (local53 < local71) {
						arg0.anInt961 += local239;
						if (arg0.anInt961 > local71) {
							arg0.anInt961 = local71;
						}
					} else if (local53 > local71) {
						arg0.anInt961 -= local239;
						if (arg0.anInt961 < local71) {
							arg0.anInt961 = local71;
						}
					}
					if (local56 < local86) {
						arg0.anInt962 += local239;
						if (arg0.anInt962 > local86) {
							arg0.anInt962 = local86;
						}
					} else if (local56 > local86) {
						arg0.anInt962 -= local239;
						if (arg0.anInt962 < local86) {
							arg0.anInt962 = local86;
						}
					}
					if (arg0.anInt961 == local71 && arg0.anInt962 == local86) {
						arg0.anInt1005--;
						if (arg0.anInt1007 > 0) {
							arg0.anInt1007--;
							return;
						}
					}
				} else {
					arg0.anInt961 = local71;
					arg0.anInt962 = local86;
				}
			}
		} catch (@Pc(401) RuntimeException local401) {
			signlink.reporterror("88518, " + -116 + ", " + arg0 + ", " + local401.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!y;Z)V")
	private void method181(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt1004 != 0) {
				@Pc(32) int local32;
				@Pc(38) int local38;
				if (arg0.anInt978 != -1 && arg0.anInt978 < 32768) {
					@Pc(24) Class1_Sub1_Sub1_Sub1_Sub2 local24 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[arg0.anInt978];
					if (local24 != null) {
						local32 = arg0.anInt961 - local24.anInt961;
						local38 = arg0.anInt962 - local24.anInt962;
						if (local32 != 0 || local38 != 0) {
							arg0.anInt1003 = (int) (Math.atan2((double) local32, (double) local38) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(63) int local63;
				if (arg0.anInt978 >= 32768) {
					local63 = arg0.anInt978 - 32768;
					if (local63 == this.anInt354) {
						local63 = this.anInt389;
					}
					@Pc(75) Class1_Sub1_Sub1_Sub1_Sub1 local75 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local63];
					if (local75 != null) {
						local38 = arg0.anInt961 - local75.anInt961;
						@Pc(89) int local89 = arg0.anInt962 - local75.anInt962;
						if (local38 != 0 || local89 != 0) {
							arg0.anInt1003 = (int) (Math.atan2((double) local38, (double) local89) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt979 != 0 || arg0.anInt980 != 0) && (arg0.anInt1005 == 0 || arg0.anInt1006 > 0)) {
					local63 = arg0.anInt961 - (arg0.anInt979 - this.anInt277 - this.anInt277) * 64;
					local32 = arg0.anInt962 - (arg0.anInt980 - this.anInt278 - this.anInt278) * 64;
					if (local63 != 0 || local32 != 0) {
						arg0.anInt1003 = (int) (Math.atan2((double) local63, (double) local32) * 325.949D) & 0x7FF;
					}
					arg0.anInt979 = 0;
					arg0.anInt980 = 0;
				}
				local63 = arg0.anInt1003 - arg0.anInt963 & 0x7FF;
				if (local63 != 0) {
					if (local63 < arg0.anInt1004 || local63 > 2048 - arg0.anInt1004) {
						arg0.anInt963 = arg0.anInt1003;
					} else if (local63 > 1024) {
						arg0.anInt963 -= arg0.anInt1004;
					} else {
						arg0.anInt963 += arg0.anInt1004;
					}
					arg0.anInt963 &= 0x7FF;
					if (arg0.anInt981 == arg0.anInt965 && arg0.anInt963 != arg0.anInt1003) {
						if (arg0.anInt966 != -1) {
							arg0.anInt981 = arg0.anInt966;
							return;
						}
						arg0.anInt981 = arg0.anInt967;
						return;
					}
				}
			}
		} catch (@Pc(243) RuntimeException local243) {
			signlink.reporterror("76590, " + arg0 + ", " + false + ", " + local243.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!y;)V")
	private void method182(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg1) {
		try {
			@Pc(5) boolean local5 = false;
			arg1.aBoolean260 = false;
			@Pc(17) Class27 local17;
			if (arg1.anInt981 != -1) {
				local17 = Class27.aClass27Array1[arg1.anInt981];
				arg1.anInt983++;
				if (arg1.anInt982 < local17.anInt768 && arg1.anInt983 > local17.method498(arg1.anInt982)) {
					arg1.anInt983 = 0;
					arg1.anInt982++;
				}
				if (arg1.anInt982 >= local17.anInt768) {
					arg1.anInt983 = 0;
					arg1.anInt982 = 0;
				}
			}
			if (arg1.anInt989 != -1 && anInt375 >= arg1.anInt992) {
				if (arg1.anInt990 < 0) {
					arg1.anInt990 = 0;
				}
				local17 = Class33.aClass33Array1[arg1.anInt989].aClass27_2;
				arg1.anInt991++;
				while (arg1.anInt990 < local17.anInt768 && arg1.anInt991 > local17.method498(arg1.anInt990)) {
					arg1.anInt991 -= local17.method498(arg1.anInt990);
					arg1.anInt990++;
				}
				if (arg1.anInt990 >= local17.anInt768 && (arg1.anInt990 < 0 || arg1.anInt990 >= local17.anInt768)) {
					arg1.anInt989 = -1;
				}
			}
			if (arg1.anInt984 != -1 && arg1.anInt987 <= 1) {
				local17 = Class27.aClass27Array1[arg1.anInt984];
				if (local17.anInt774 == 1 && arg1.anInt1007 > 0 && arg1.anInt998 <= anInt375 && arg1.anInt999 < anInt375) {
					arg1.anInt987 = 1;
					return;
				}
			}
			if (arg1.anInt984 != -1 && arg1.anInt987 == 0) {
				local17 = Class27.aClass27Array1[arg1.anInt984];
				arg1.anInt986++;
				while (arg1.anInt985 < local17.anInt768 && arg1.anInt986 > local17.method498(arg1.anInt985)) {
					arg1.anInt986 -= local17.method498(arg1.anInt985);
					arg1.anInt985++;
				}
				if (arg1.anInt985 >= local17.anInt768) {
					arg1.anInt985 -= local17.anInt769;
					arg1.anInt988++;
					if (arg1.anInt988 >= local17.anInt773) {
						arg1.anInt984 = -1;
					}
					if (arg1.anInt985 < 0 || arg1.anInt985 >= local17.anInt768) {
						arg1.anInt984 = -1;
					}
				}
				arg1.aBoolean260 = local17.aBoolean220;
			}
			if (arg1.anInt987 > 0) {
				arg1.anInt987--;
			}
		} catch (@Pc(262) RuntimeException local262) {
			signlink.reporterror("5755, " + arg0 + ", " + arg1 + ", " + local262.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method183() {
		try {
			if (this.aBoolean86) {
				this.aBoolean86 = false;
				this.aClass35_7.method517(0, 4, super.aGraphics2);
				this.aClass35_8.method517(0, 357, super.aGraphics2);
				this.aClass35_9.method517(722, 4, super.aGraphics2);
				this.aClass35_10.method517(743, 205, super.aGraphics2);
				this.aClass35_11.method517(0, 0, super.aGraphics2);
				this.aClass35_12.method517(516, 4, super.aGraphics2);
				this.aClass35_13.method517(516, 205, super.aGraphics2);
				this.aClass35_14.method517(496, 357, super.aGraphics2);
				this.aClass35_15.method517(0, 338, super.aGraphics2);
				this.aBoolean56 = true;
				this.aBoolean68 = true;
				this.aBoolean75 = true;
				this.aBoolean81 = true;
				if (this.anInt326 != 2) {
					this.aClass35_5.method517(4, 4, super.aGraphics2);
					this.aClass35_4.method517(550, 4, super.aGraphics2);
				}
			}
			if (this.anInt326 == 2) {
				this.method211();
			}
			if (this.aBoolean74 && this.anInt261 == 1) {
				this.aBoolean56 = true;
			}
			@Pc(138) boolean local138;
			if (this.anInt364 != -1) {
				local138 = this.method187(this.anInt364, 68, this.anInt196);
				if (local138) {
					this.aBoolean56 = true;
				}
			}
			if (this.anInt344 == 2) {
				this.aBoolean56 = true;
			}
			if (this.anInt394 == 2) {
				this.aBoolean56 = true;
			}
			if (this.aBoolean56) {
				this.method108();
				this.aBoolean56 = false;
			}
			if (this.anInt316 == -1) {
				this.aClass6_1.anInt417 = this.anInt350 - this.anInt377 - 77;
				if (super.anInt182 > 448 && super.anInt182 < 560 && super.anInt183 > 332) {
					this.method147(this.aClass6_1, 463, 77, 0, this.anInt350, false, super.anInt182 - 17, super.anInt183 - 357);
				}
				@Pc(220) int local220 = this.anInt350 - this.aClass6_1.anInt417 - 77;
				if (local220 < 0) {
					local220 = 0;
				}
				if (local220 > this.anInt350 - 77) {
					local220 = this.anInt350 - 77;
				}
				if (this.anInt377 != local220) {
					this.anInt377 = local220;
					this.aBoolean68 = true;
				}
			}
			if (this.anInt316 != -1) {
				local138 = this.method187(this.anInt316, 68, this.anInt196);
				if (local138) {
					this.aBoolean68 = true;
				}
			}
			if (this.anInt344 == 3) {
				this.aBoolean68 = true;
			}
			if (this.anInt394 == 3) {
				this.aBoolean68 = true;
			}
			if (this.aString16 != null) {
				this.aBoolean68 = true;
			}
			if (this.aBoolean74 && this.anInt261 == 2) {
				this.aBoolean68 = true;
			}
			if (this.aBoolean68) {
				this.method184(703);
				this.aBoolean68 = false;
			}
			if (this.anInt326 == 2) {
				this.method135();
				this.aClass35_4.method517(550, 4, super.aGraphics2);
			}
			if (this.anInt246 != -1) {
				this.aBoolean75 = true;
			}
			if (this.aBoolean75) {
				if (this.anInt246 != -1 && this.anInt246 == this.anInt323) {
					this.anInt246 = -1;
					this.aClass1_Sub1_Sub3_2.method461(201);
					this.aClass1_Sub1_Sub3_2.method462(this.anInt323);
				}
				this.aBoolean75 = false;
				this.aClass35_18.method516();
				this.aClass1_Sub1_Sub2_Sub3_13.method414(0, 0);
				if (this.anInt364 == -1) {
					if (this.anIntArray58[this.anInt323] != -1) {
						if (this.anInt323 == 0) {
							this.aClass1_Sub1_Sub2_Sub3_4.method414(10, 22);
						}
						if (this.anInt323 == 1) {
							this.aClass1_Sub1_Sub2_Sub3_5.method414(8, 54);
						}
						if (this.anInt323 == 2) {
							this.aClass1_Sub1_Sub2_Sub3_5.method414(8, 82);
						}
						if (this.anInt323 == 3) {
							this.aClass1_Sub1_Sub2_Sub3_6.method414(8, 110);
						}
						if (this.anInt323 == 4) {
							this.aClass1_Sub1_Sub2_Sub3_8.method414(8, 153);
						}
						if (this.anInt323 == 5) {
							this.aClass1_Sub1_Sub2_Sub3_8.method414(8, 181);
						}
						if (this.anInt323 == 6) {
							this.aClass1_Sub1_Sub2_Sub3_7.method414(9, 209);
						}
					}
					if (this.anIntArray58[0] != -1 && (this.anInt246 != 0 || anInt375 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[0].method414(13, 29);
					}
					if (this.anIntArray58[1] != -1 && (this.anInt246 != 1 || anInt375 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[1].method414(11, 53);
					}
					if (this.anIntArray58[2] != -1 && (this.anInt246 != 2 || anInt375 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[2].method414(11, 82);
					}
					if (this.anIntArray58[3] != -1 && (this.anInt246 != 3 || anInt375 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[3].method414(12, 115);
					}
					if (this.anIntArray58[4] != -1 && (this.anInt246 != 4 || anInt375 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[4].method414(13, 153);
					}
					if (this.anIntArray58[5] != -1 && (this.anInt246 != 5 || anInt375 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[5].method414(11, 180);
					}
					if (this.anIntArray58[6] != -1 && (this.anInt246 != 6 || anInt375 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[6].method414(13, 208);
					}
				}
				this.aClass35_18.method517(516, 160, super.aGraphics2);
				this.aClass35_17.method516();
				this.aClass1_Sub1_Sub2_Sub3_12.method414(0, 0);
				if (this.anInt364 == -1) {
					if (this.anIntArray58[this.anInt323] != -1) {
						if (this.anInt323 == 7) {
							this.aClass1_Sub1_Sub2_Sub3_14.method414(0, 42);
						}
						if (this.anInt323 == 8) {
							this.aClass1_Sub1_Sub2_Sub3_15.method414(0, 74);
						}
						if (this.anInt323 == 9) {
							this.aClass1_Sub1_Sub2_Sub3_15.method414(0, 102);
						}
						if (this.anInt323 == 10) {
							this.aClass1_Sub1_Sub2_Sub3_16.method414(1, 130);
						}
						if (this.anInt323 == 11) {
							this.aClass1_Sub1_Sub2_Sub3_18.method414(0, 173);
						}
						if (this.anInt323 == 12) {
							this.aClass1_Sub1_Sub2_Sub3_18.method414(0, 201);
						}
						if (this.anInt323 == 13) {
							this.aClass1_Sub1_Sub2_Sub3_17.method414(0, 229);
						}
					}
					if (this.anIntArray58[8] != -1 && (this.anInt246 != 8 || anInt375 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[7].method414(2, 74);
					}
					if (this.anIntArray58[9] != -1 && (this.anInt246 != 9 || anInt375 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[8].method414(3, 102);
					}
					if (this.anIntArray58[10] != -1 && (this.anInt246 != 10 || anInt375 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[9].method414(4, 137);
					}
					if (this.anIntArray58[11] != -1 && (this.anInt246 != 11 || anInt375 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[10].method414(2, 174);
					}
					if (this.anIntArray58[12] != -1 && (this.anInt246 != 12 || anInt375 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[11].method414(2, 201);
					}
					if (this.anIntArray58[13] != -1 && (this.anInt246 != 13 || anInt375 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[12].method414(2, 226);
					}
				}
				this.aClass35_17.method517(496, 466, super.aGraphics2);
				this.aClass35_5.method516();
			}
			if (this.aBoolean81) {
				this.aBoolean81 = false;
				this.aClass35_16.method516();
				this.aClass1_Sub1_Sub2_Sub3_11.method414(0, 0);
				this.aClass1_Sub1_Sub2_Sub4_2.method443("Public chat", 28, 16777215, true, 55);
				if (this.anInt260 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method443("On", 41, 65280, true, 55);
				}
				if (this.anInt260 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method443("Friends", 41, 16776960, true, 55);
				}
				if (this.anInt260 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method443("Off", 41, 16711680, true, 55);
				}
				if (this.anInt260 == 3) {
					this.aClass1_Sub1_Sub2_Sub4_2.method443("Hide", 41, 65535, true, 55);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method443("Private chat", 28, 16777215, true, 184);
				if (this.anInt224 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method443("On", 41, 65280, true, 184);
				}
				if (this.anInt224 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method443("Friends", 41, 16776960, true, 184);
				}
				if (this.anInt224 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method443("Off", 41, 16711680, true, 184);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method443("Trade/duel", 28, 16777215, true, 324);
				if (this.anInt348 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method443("On", 41, 65280, true, 324);
				}
				if (this.anInt348 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method443("Friends", 41, 16776960, true, 324);
				}
				if (this.anInt348 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method443("Off", 41, 16711680, true, 324);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method443("Report abuse", 33, 16777215, true, 458);
				this.aClass35_16.method517(0, 453, super.aGraphics2);
				this.aClass35_5.method516();
			}
			this.anInt196 = 0;
		} catch (@Pc(1051) RuntimeException local1051) {
			signlink.reporterror("62216, " + -511 + ", " + local1051.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method184(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			this.aClass35_6.method516();
			Class1_Sub1_Sub2_Sub1.anIntArray177 = this.anIntArray86;
			this.aClass1_Sub1_Sub2_Sub3_3.method414(0, 0);
			if (this.aBoolean70) {
				this.aClass1_Sub1_Sub2_Sub4_3.method442(239, 40, 0, this.aString10);
				this.aClass1_Sub1_Sub2_Sub4_3.method442(239, 60, 128, this.aString11 + "*");
			} else if (this.aBoolean97) {
				this.aClass1_Sub1_Sub2_Sub4_3.method442(239, 40, 0, "Enter amount:");
				this.aClass1_Sub1_Sub2_Sub4_3.method442(239, 60, 128, this.aString14 + "*");
			} else if (this.aString16 != null) {
				this.aClass1_Sub1_Sub2_Sub4_3.method442(239, 40, 0, this.aString16);
				this.aClass1_Sub1_Sub2_Sub4_3.method442(239, 60, 128, "Click to continue");
			} else if (this.anInt316 != -1) {
				this.method96(0, 0, 0, Class6.aClass6Array1[this.anInt316]);
			} else if (this.anInt387 == -1) {
				@Pc(134) Class1_Sub1_Sub2_Sub4 local134 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(136) int local136 = 0;
				Class1_Sub1_Sub2.method432(0, 463, 0, 77);
				for (@Pc(144) int local144 = 0; local144 < 100; local144++) {
					if (this.aStringArray2[local144] != null) {
						@Pc(156) int local156 = this.anIntArray38[local144];
						@Pc(165) int local165 = this.anInt377 + 70 - local136 * 14;
						@Pc(170) String local170 = this.aStringArray1[local144];
						@Pc(172) byte local172 = 0;
						if (local170 != null && local170.startsWith("@cr1@")) {
							local170 = local170.substring(5);
							local172 = 1;
						}
						if (local170 != null && local170.startsWith("@cr2@")) {
							local170 = local170.substring(5);
							local172 = 2;
						}
						if (local156 == 0) {
							if (local165 > 0 && local165 < 110) {
								local134.method445(4, 474, 0, this.aStringArray2[local144], local165);
							}
							local136++;
						}
						@Pc(243) int local243;
						if ((local156 == 1 || local156 == 2) && (local156 == 1 || this.anInt260 == 0 || this.anInt260 == 1 && this.method119(this.anInt400, local170))) {
							if (local165 > 0 && local165 < 110) {
								local243 = 4;
								if (local172 == 1) {
									this.aClass1_Sub1_Sub2_Sub3Array3[0].method414(local165 - 12, 4);
									local243 += 14;
								}
								if (local172 == 2) {
									this.aClass1_Sub1_Sub2_Sub3Array3[1].method414(local165 - 12, local243);
									local243 += 14;
								}
								local134.method445(local243, 474, 0, local170 + ":", local165);
								local243 += local134.method444(local170) + 8;
								local134.method445(local243, 474, 255, this.aStringArray2[local144], local165);
							}
							local136++;
						}
						if ((local156 == 3 || local156 == 7) && this.anInt210 == 0 && (local156 == 7 || this.anInt224 == 0 || this.anInt224 == 1 && this.method119(this.anInt400, local170))) {
							if (local165 > 0 && local165 < 110) {
								local134.method445(4, 474, 0, "From", local165);
								local243 = local134.method444("From ") + 4;
								if (local172 == 1) {
									this.aClass1_Sub1_Sub2_Sub3Array3[0].method414(local165 - 12, local243);
									local243 += 14;
								}
								if (local172 == 2) {
									this.aClass1_Sub1_Sub2_Sub3Array3[1].method414(local165 - 12, local243);
									local243 += 14;
								}
								local134.method445(local243, 474, 0, local170 + ":", local165);
								local243 += local134.method444(local170) + 8;
								local134.method445(local243, 474, 8388608, this.aStringArray2[local144], local165);
							}
							local136++;
						}
						if (local156 == 4 && (this.anInt348 == 0 || this.anInt348 == 1 && this.method119(this.anInt400, local170))) {
							if (local165 > 0 && local165 < 110) {
								local134.method445(4, 474, 8388736, local170 + " " + this.aStringArray2[local144], local165);
							}
							local136++;
						}
						if (local156 == 5 && this.anInt210 == 0 && this.anInt224 < 2) {
							if (local165 > 0 && local165 < 110) {
								local134.method445(4, 474, 8388608, this.aStringArray2[local144], local165);
							}
							local136++;
						}
						if (local156 == 6 && this.anInt210 == 0 && this.anInt224 < 2) {
							if (local165 > 0 && local165 < 110) {
								local134.method445(4, 474, 0, "To " + local170 + ":", local165);
								local134.method445(local134.method444("To " + local170) + 12, 474, 8388608, this.aStringArray2[local144], local165);
							}
							local136++;
						}
						if (local156 == 8 && (this.anInt348 == 0 || this.anInt348 == 1 && this.method119(this.anInt400, local170))) {
							if (local165 > 0 && local165 < 110) {
								local134.method445(4, 474, 8270336, local170 + " " + this.aStringArray2[local144], local165);
							}
							local136++;
						}
					}
				}
				Class1_Sub1_Sub2.method431();
				this.anInt350 = local136 * 14 + 7;
				if (this.anInt350 < 78) {
					this.anInt350 = 78;
				}
				this.method99(this.anInt350 - this.anInt377 - 77, 161, 463, 77, this.anInt350, 0);
				@Pc(616) String local616;
				if (aClass1_Sub1_Sub1_Sub1_Sub1_1 == null || aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3 == null) {
					local616 = Class48.method663(584, this.aString6);
				} else {
					local616 = aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3;
				}
				local134.method445(4, 474, 0, local616 + ":", 90);
				local134.method445(local134.method444(local616 + ": ") + 6, 474, 255, this.aString15 + "*", 90);
				Class1_Sub1_Sub2.method438(0, 0, 77, 479);
			} else {
				this.method96(0, 0, 0, Class6.aClass6Array1[this.anInt387]);
			}
			if (this.aBoolean74 && this.anInt261 == 2) {
				this.method221();
			}
			this.aClass35_6.method517(17, 357, super.aGraphics2);
			this.aClass35_5.method516();
			Class1_Sub1_Sub2_Sub1.anIntArray177 = this.anIntArray88;
		} catch (@Pc(697) RuntimeException local697) {
			signlink.reporterror("69850, " + arg0 + ", " + local697.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(II)Ljava/lang/String;")
	private String method185(@OriginalArg(1) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("69503, " + 0 + ", " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;B)Z")
	private boolean method186(@OriginalArg(0) Class6 arg0) {
		try {
			@Pc(12) int local12 = arg0.anInt410;
			if (local12 >= 1 && local12 <= 200 || !(local12 < 701 || local12 > 900)) {
				if (local12 >= 801) {
					local12 -= 701;
				} else if (local12 >= 701) {
					local12 -= 601;
				} else if (local12 >= 101) {
					local12 -= 101;
				} else {
					local12--;
				}
				this.aStringArray6[this.anInt222] = "Remove @whi@" + this.aStringArray3[local12];
				this.anIntArray81[this.anInt222] = 513;
				this.anInt222++;
				this.aStringArray6[this.anInt222] = "Message @whi@" + this.aStringArray3[local12];
				this.anIntArray81[this.anInt222] = 902;
				this.anInt222++;
				return true;
			} else if (local12 >= 401 && local12 <= 500) {
				this.aStringArray6[this.anInt222] = "Remove @whi@" + arg0.aString18;
				this.anIntArray81[this.anInt222] = 884;
				this.anInt222++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("18150, " + arg0 + ", " + 78 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(III)Z")
	private boolean method187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(7) Class6 local7 = Class6.aClass6Array1[arg0];
			for (@Pc(9) int local9 = 0; local9 < local7.anIntArray97.length && local7.anIntArray97[local9] != -1; local9++) {
				@Pc(24) Class6 local24 = Class6.aClass6Array1[local7.anIntArray97[local9]];
				if (local24.anInt408 == 1) {
					local3 |= this.method187(local24.anInt406, 68, arg2);
				}
				if (local24.anInt408 == 6 && (local24.anInt429 != -1 || local24.anInt430 != -1)) {
					@Pc(54) boolean local54 = this.method112(local24);
					@Pc(59) int local59;
					if (local54) {
						local59 = local24.anInt430;
					} else {
						local59 = local24.anInt429;
					}
					if (local59 != -1) {
						@Pc(71) Class27 local71 = Class27.aClass27Array1[local59];
						local24.anInt405 += arg2;
						while (local24.anInt405 > local71.method498(local24.anInt404)) {
							local24.anInt405 -= local71.method498(local24.anInt404) + 1;
							local24.anInt404++;
							if (local24.anInt404 >= local71.anInt768) {
								local24.anInt404 -= local71.anInt769;
								if (local24.anInt404 < 0 || local24.anInt404 >= local71.anInt768) {
									local24.anInt404 = 0;
								}
							}
							local3 = true;
						}
					}
				}
			}
			@Pc(140) boolean local140 = true;
			return local3;
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("26390, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method188(@OriginalArg(0) byte arg0) {
		try {
			if (this.anInt394 == 0) {
				this.aStringArray6[0] = "Cancel";
				@Pc(15) boolean local15 = false;
				this.anIntArray81[0] = 1106;
				this.anInt222 = 1;
				this.method114();
				this.anInt240 = 0;
				if (super.anInt182 > 4 && super.anInt183 > 4 && super.anInt182 < 516 && super.anInt183 < 338) {
					if (this.anInt322 == -1) {
						this.method154();
					} else {
						this.method118(super.anInt183, 0, 4, 4, super.anInt182, Class6.aClass6Array1[this.anInt322]);
					}
				}
				if (this.anInt240 != this.anInt292) {
					this.anInt292 = this.anInt240;
				}
				this.anInt240 = 0;
				if (super.anInt182 > 553 && super.anInt183 > 205 && super.anInt182 < 743 && super.anInt183 < 466) {
					if (this.anInt364 != -1) {
						this.method118(super.anInt183, 0, 205, 553, super.anInt182, Class6.aClass6Array1[this.anInt364]);
					} else if (this.anIntArray58[this.anInt323] != -1) {
						this.method118(super.anInt183, 0, 205, 553, super.anInt182, Class6.aClass6Array1[this.anIntArray58[this.anInt323]]);
					}
				}
				if (this.anInt240 != this.anInt399) {
					this.aBoolean56 = true;
					this.anInt399 = this.anInt240;
				}
				this.anInt240 = 0;
				if (super.anInt182 > 17 && super.anInt183 > 357 && super.anInt182 < 496 && super.anInt183 < 453) {
					if (this.anInt316 != -1) {
						this.method118(super.anInt183, 0, 357, 17, super.anInt182, Class6.aClass6Array1[this.anInt316]);
					} else if (super.anInt183 < 434 && super.anInt182 < 426) {
						this.method137(super.anInt182 - 17, super.anInt183 - 357);
					}
				}
				if (this.anInt316 != -1 && this.anInt240 != this.anInt302) {
					this.aBoolean68 = true;
					this.anInt302 = this.anInt240;
				}
				@Pc(234) boolean local234 = false;
				while (!local234) {
					local234 = true;
					for (@Pc(240) int local240 = 0; local240 < this.anInt222 - 1; local240++) {
						if (this.anIntArray81[local240] < 1000 && this.anIntArray81[local240 + 1] > 1000) {
							@Pc(261) String local261 = this.aStringArray6[local240];
							this.aStringArray6[local240] = this.aStringArray6[local240 + 1];
							this.aStringArray6[local240 + 1] = local261;
							@Pc(283) int local283 = this.anIntArray81[local240];
							this.anIntArray81[local240] = this.anIntArray81[local240 + 1];
							this.anIntArray81[local240 + 1] = local283;
							@Pc(305) int local305 = this.anIntArray79[local240];
							this.anIntArray79[local240] = this.anIntArray79[local240 + 1];
							this.anIntArray79[local240 + 1] = local305;
							@Pc(327) int local327 = this.anIntArray80[local240];
							this.anIntArray80[local240] = this.anIntArray80[local240 + 1];
							this.anIntArray80[local240 + 1] = local327;
							@Pc(349) int local349 = this.anIntArray82[local240];
							this.anIntArray82[local240] = this.anIntArray82[local240 + 1];
							this.anIntArray82[local240 + 1] = local349;
							local234 = false;
						}
					}
				}
			}
		} catch (@Pc(379) RuntimeException local379) {
			signlink.reporterror("38687, " + arg0 + ", " + local379.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method189(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt210 != 0) {
				@Pc(6) Class1_Sub1_Sub2_Sub4 local6 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(8) int local8 = 0;
				if (arg0 == 1016) {
					if (this.anInt282 != 0) {
						local8 = 1;
					}
					for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
						if (this.aStringArray2[local19] != null) {
							@Pc(31) int local31 = this.anIntArray38[local19];
							@Pc(36) String local36 = this.aStringArray1[local19];
							@Pc(38) byte local38 = 0;
							if (local36 != null && local36.startsWith("@cr1@")) {
								local36 = local36.substring(5);
								local38 = 1;
							}
							if (local36 != null && local36.startsWith("@cr2@")) {
								local36 = local36.substring(5);
								local38 = 2;
							}
							@Pc(90) int local90;
							if ((local31 == 3 || local31 == 7) && (local31 == 7 || this.anInt224 == 0 || this.anInt224 == 1 && this.method119(this.anInt400, local36))) {
								local90 = 329 - local8 * 13;
								local6.method445(4, 474, 0, "From", local90);
								local6.method445(4, 474, 65535, "From", local90 - 1);
								@Pc(115) int local115 = local6.method444("From ") + 4;
								if (local38 == 1) {
									this.aClass1_Sub1_Sub2_Sub3Array3[0].method414(local90 - 12, local115);
									local115 += 14;
								}
								if (local38 == 2) {
									this.aClass1_Sub1_Sub2_Sub3Array3[1].method414(local90 - 12, local115);
									local115 += 14;
								}
								local6.method445(local115, 474, 0, local36 + ": " + this.aStringArray2[local19], local90);
								local6.method445(local115, 474, 65535, local36 + ": " + this.aStringArray2[local19], local90 - 1);
								local8++;
								if (local8 >= 5) {
									return;
								}
							}
							if (local31 == 5 && this.anInt224 < 2) {
								local90 = 329 - local8 * 13;
								local6.method445(4, 474, 0, this.aStringArray2[local19], local90);
								local6.method445(4, 474, 65535, this.aStringArray2[local19], local90 - 1);
								local8++;
								if (local8 >= 5) {
									return;
								}
							}
							if (local31 == 6 && this.anInt224 < 2) {
								local90 = 329 - local8 * 13;
								local6.method445(4, 474, 0, "To " + local36 + ": " + this.aStringArray2[local19], local90);
								local6.method445(4, 474, 65535, "To " + local36 + ": " + this.aStringArray2[local19], local90 - 1);
								local8++;
								if (local8 >= 5) {
									return;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(294) RuntimeException local294) {
			signlink.reporterror("73316, " + arg0 + ", " + local294.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!ib;)V")
	private void method190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub1_Sub2_Sub2 arg2) {
		try {
			@Pc(7) int local7 = this.anInt212 + this.anInt383 & 0x7FF;
			@Pc(15) int local15 = arg1 * arg1 + arg0 * arg0;
			if (local15 <= 6400) {
				@Pc(23) int local23 = Class1_Sub1_Sub1_Sub5.anIntArray150[local7];
				@Pc(27) int local27 = Class1_Sub1_Sub1_Sub5.anIntArray151[local7];
				@Pc(36) int local36 = local23 * 256 / (this.anInt294 + 256);
				@Pc(45) int local45 = local27 * 256 / (this.anInt294 + 256);
				@Pc(55) int local55 = arg0 * local36 + arg1 * local45 >> 16;
				@Pc(65) int local65 = arg0 * local45 - arg1 * local36 >> 16;
				if (local15 > 2500) {
					arg2.method393(83 - local65 - arg2.anInt630 / 2 - 4, local55 + 94 - arg2.anInt629 / 2 + 4, this.aClass1_Sub1_Sub2_Sub3_2);
				} else {
					arg2.method387(83 - local65 - arg2.anInt630 / 2 - 4, local55 + 94 - arg2.anInt629 / 2 + 4);
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("43940, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method191() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt324);
			if (this.aClass44_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass44_Sub1_1.anInt934);
			}
			System.out.println("loop-cycle:" + anInt375);
			System.out.println("draw-cycle:" + anInt253);
			System.out.println("ptype:" + this.anInt205);
			System.out.println("psize:" + this.anInt204);
			if (this.aClass8_1 != null) {
				this.aClass8_1.method250(740);
			}
			super.aBoolean50 = true;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("43899, " + 740 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)Ljava/awt/Component;")
	@Override
	protected Component method93() {
		try {
			this.anInt204 += 0;
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("12753, " + 0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)I")
	private int method192() {
		try {
			this.anInt204 += 0;
			@Pc(9) int local9 = 3;
			if (this.anInt332 < 310) {
				@Pc(18) int local18 = this.anInt329 >> 7;
				@Pc(23) int local23 = this.anInt331 >> 7;
				@Pc(28) int local28 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt961 >> 7;
				@Pc(33) int local33 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962 >> 7;
				if ((this.aByteArrayArrayArray7[this.anInt386][local18][local23] & 0x4) != 0) {
					local9 = this.anInt386;
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
						if ((this.aByteArrayArrayArray7[this.anInt386][local18][local23] & 0x4) != 0) {
							local9 = this.anInt386;
						}
						local85 += local83;
						if (local85 >= 65536) {
							local85 -= 65536;
							if (local23 < local33) {
								local23++;
							} else if (local23 > local33) {
								local23--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt386][local18][local23] & 0x4) != 0) {
								local9 = this.anInt386;
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
						if ((this.aByteArrayArrayArray7[this.anInt386][local18][local23] & 0x4) != 0) {
							local9 = this.anInt386;
						}
						local85 += local83;
						if (local85 >= 65536) {
							local85 -= 65536;
							if (local18 < local28) {
								local18++;
							} else if (local18 > local28) {
								local18--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt386][local18][local23] & 0x4) != 0) {
								local9 = this.anInt386;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray7[this.anInt386][aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt961 >> 7][aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962 >> 7] & 0x4) != 0) {
				local9 = this.anInt386;
			}
			return local9;
		} catch (@Pc(251) RuntimeException local251) {
			signlink.reporterror("3746, " + 0 + ", " + local251.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)I")
	private int method193() {
		try {
			@Pc(9) int local9 = this.method199(this.anInt386, this.anInt329, this.anInt331);
			return local9 - this.anInt330 >= 800 || (this.aByteArrayArrayArray7[this.anInt386][this.anInt329 >> 7][this.anInt331 >> 7] & 0x4) == 0 ? 3 : this.anInt386;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("33607, " + -693 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIII)Z")
	private boolean method194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(7) int local7 = arg3 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass37_1.method552(this.anInt386, arg1, arg0, arg3);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			anInt334++;
			if (anInt334 > 1086) {
				anInt334 = 0;
				this.aClass1_Sub1_Sub3_2.method461(225);
				this.aClass1_Sub1_Sub3_2.method462(0);
				@Pc(53) int local53 = this.aClass1_Sub1_Sub3_2.anInt715;
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_2.method463(16791);
				}
				this.aClass1_Sub1_Sub3_2.method462(254);
				this.aClass1_Sub1_Sub3_2.method463((int) (Math.random() * 65536.0D));
				this.aClass1_Sub1_Sub3_2.method463(16128);
				this.aClass1_Sub1_Sub3_2.method463(52610);
				this.aClass1_Sub1_Sub3_2.method463((int) (Math.random() * 65536.0D));
				this.aClass1_Sub1_Sub3_2.method463(55420);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_2.method463(35025);
				}
				this.aClass1_Sub1_Sub3_2.method463(46628);
				this.aClass1_Sub1_Sub3_2.method462((int) (Math.random() * 256.0D));
				this.aClass1_Sub1_Sub3_2.method471(this.aClass1_Sub1_Sub3_2.anInt715 - local53);
			}
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(133) Class9 local133 = Class9.method286(local7);
				@Pc(141) int local141;
				@Pc(144) int local144;
				if (local31 == 0 || local31 == 2) {
					local141 = local133.anInt489;
					local144 = local133.anInt490;
				} else {
					local141 = local133.anInt490;
					local144 = local133.anInt489;
				}
				@Pc(155) int local155 = local133.anInt501;
				if (local31 != 0) {
					local155 = (local155 << local31 & 0xF) + (local155 >> 4 - local31);
				}
				this.method103(arg0, 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], 0, false, arg1, local141, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], local155, 0, local144);
			} else {
				this.method103(arg0, 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], local31, false, arg1, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, local25 + 1, 0);
			}
			this.anInt336 = super.anInt188;
			this.anInt337 = super.anInt189;
			this.anInt339 = 2;
			this.anInt338 = 0;
			this.aClass1_Sub1_Sub3_2.method461(arg2);
			this.aClass1_Sub1_Sub3_2.method463(arg1 + this.anInt277);
			this.aClass1_Sub1_Sub3_2.method463(arg0 + this.anInt278);
			this.aClass1_Sub1_Sub3_2.method463(local7);
			return true;
		} catch (@Pc(263) RuntimeException local263) {
			signlink.reporterror("79586, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -21331 + ", " + local263.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)Z")
	private boolean method195(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != -25) {
				this.aBoolean72 = !this.aBoolean72;
			}
			if (this.aClass8_1 == null) {
				return false;
			}
			@Pc(2921) String local2921;
			@Pc(214) int local214;
			try {
				@Pc(21) int local21 = this.aClass8_1.method247();
				if (local21 == 0) {
					return false;
				}
				if (this.anInt205 == -1) {
					this.aClass8_1.method248(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 1);
					this.anInt205 = this.aClass1_Sub1_Sub3_3.aByteArray9[0] & 0xFF;
					if (this.aClass46_1 != null) {
						this.anInt205 = this.anInt205 - this.aClass46_1.method654() & 0xFF;
					}
					this.anInt204 = Class17.anIntArray207[this.anInt205];
					local21--;
				}
				if (this.anInt204 == -1) {
					if (local21 <= 0) {
						return false;
					}
					this.aClass8_1.method248(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 1);
					this.anInt204 = this.aClass1_Sub1_Sub3_3.aByteArray9[0] & 0xFF;
					local21--;
				}
				if (this.anInt204 == -2) {
					if (local21 <= 1) {
						return false;
					}
					this.aClass8_1.method248(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 2);
					this.aClass1_Sub1_Sub3_3.anInt715 = 0;
					this.anInt204 = this.aClass1_Sub1_Sub3_3.method474();
					local21 -= 2;
				}
				if (local21 < this.anInt204) {
					return false;
				}
				this.aClass1_Sub1_Sub3_3.anInt715 = 0;
				this.aClass8_1.method248(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, this.anInt204);
				this.anInt206 = 0;
				this.anInt286 = this.anInt285;
				this.anInt285 = this.anInt284;
				this.anInt284 = this.anInt205;
				@Pc(165) int local165;
				if (this.anInt205 == 163) {
					local165 = this.aClass1_Sub1_Sub3_3.method474();
					if (local165 == 65535) {
						local165 = -1;
					}
					if (local165 != this.anInt325 && this.aBoolean62 && !aBoolean77 && this.anInt335 == 0) {
						this.anInt360 = local165;
						this.aBoolean87 = true;
						this.aClass44_Sub1_1.method637(2, this.anInt360);
					}
					this.anInt325 = local165;
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 242) {
					local165 = this.aClass1_Sub1_Sub3_3.method474();
					local214 = this.aClass1_Sub1_Sub3_3.method474();
					if (this.aBoolean62 && !aBoolean77) {
						this.anInt360 = local165;
						this.aBoolean87 = false;
						this.aClass44_Sub1_1.method637(2, this.anInt360);
						this.anInt335 = local214;
					}
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 196) {
					local165 = this.aClass1_Sub1_Sub3_3.method474();
					local214 = this.aClass1_Sub1_Sub3_3.method477();
					this.anIntArray76[local165] = local214;
					if (this.anIntArray51[local165] != local214) {
						this.anIntArray51[local165] = local214;
						this.method209(local165);
						this.aBoolean56 = true;
						if (this.anInt387 != -1) {
							this.aBoolean68 = true;
						}
					}
					this.anInt205 = -1;
					return true;
				}
				@Pc(302) Class6 local302;
				if (this.anInt205 == 14) {
					local165 = this.aClass1_Sub1_Sub3_3.method474();
					local214 = this.aClass1_Sub1_Sub3_3.method474();
					local302 = Class6.aClass6Array1[local165];
					if (local302 != null && local302.anInt408 == 0) {
						if (local214 < 0) {
							local214 = 0;
						}
						if (local214 > local302.anInt416 - local302.anInt412) {
							local214 = local302.anInt416 - local302.anInt412;
						}
						local302.anInt417 = local214;
					}
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 87) {
					this.method206(this.anInt204, this.aClass1_Sub1_Sub3_3);
					this.aBoolean94 = false;
					this.anInt205 = -1;
					return true;
				}
				@Pc(364) int local364;
				@Pc(474) int local474;
				@Pc(507) int local507;
				@Pc(360) long local360;
				@Pc(372) int local372;
				if (this.anInt205 == 111) {
					local360 = this.aClass1_Sub1_Sub3_3.method478();
					local364 = this.aClass1_Sub1_Sub3_3.method472();
					@Pc(370) String local370 = Class48.method663(584, Class48.method660(local360));
					for (local372 = 0; local372 < this.anInt290; local372++) {
						if (local360 == this.aLongArray3[local372]) {
							if (this.anIntArray48[local372] != local364) {
								this.anIntArray48[local372] = local364;
								this.aBoolean56 = true;
								if (local364 > 0) {
									this.method200(5, local370 + " has logged in.", "");
								}
								if (local364 == 0) {
									this.method200(5, local370 + " has logged out.", "");
								}
							}
							local370 = null;
							break;
						}
					}
					if (local370 != null && this.anInt290 < 200) {
						this.aLongArray3[this.anInt290] = local360;
						this.aStringArray3[this.anInt290] = local370;
						this.anIntArray48[this.anInt290] = local364;
						this.anInt290++;
						this.aBoolean56 = true;
					}
					@Pc(468) boolean local468 = false;
					while (!local468) {
						local468 = true;
						for (local474 = 0; local474 < this.anInt290 - 1; local474++) {
							if (this.anIntArray48[local474] != anInt314 && this.anIntArray48[local474 + 1] == anInt314 || this.anIntArray48[local474] == 0 && this.anIntArray48[local474 + 1] != 0) {
								local507 = this.anIntArray48[local474];
								this.anIntArray48[local474] = this.anIntArray48[local474 + 1];
								this.anIntArray48[local474 + 1] = local507;
								@Pc(529) String local529 = this.aStringArray3[local474];
								this.aStringArray3[local474] = this.aStringArray3[local474 + 1];
								this.aStringArray3[local474 + 1] = local529;
								@Pc(551) long local551 = this.aLongArray3[local474];
								this.aLongArray3[local474] = this.aLongArray3[local474 + 1];
								this.aLongArray3[local474 + 1] = local551;
								this.aBoolean56 = true;
								local468 = false;
							}
						}
					}
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 91) {
					local165 = this.aClass1_Sub1_Sub3_3.method474();
					local214 = this.aClass1_Sub1_Sub3_3.method472();
					if (local165 == 65535) {
						local165 = -1;
					}
					this.anIntArray58[local214] = local165;
					this.aBoolean56 = true;
					this.aBoolean75 = true;
					this.anInt205 = -1;
					return true;
				}
				@Pc(641) int local641;
				@Pc(635) Class6 local635;
				if (this.anInt205 == 28) {
					this.aBoolean56 = true;
					local165 = this.aClass1_Sub1_Sub3_3.method474();
					local635 = Class6.aClass6Array1[local165];
					local364 = this.aClass1_Sub1_Sub3_3.method472();
					for (local641 = 0; local641 < local364; local641++) {
						local635.anIntArray93[local641] = this.aClass1_Sub1_Sub3_3.method474();
						local372 = this.aClass1_Sub1_Sub3_3.method472();
						if (local372 == 255) {
							local372 = this.aClass1_Sub1_Sub3_3.method477();
						}
						local635.anIntArray94[local641] = local372;
					}
					for (local372 = local364; local372 < local635.anIntArray93.length; local372++) {
						local635.anIntArray93[local372] = 0;
						local635.anIntArray94[local372] = 0;
					}
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 213) {
					this.anInt354 = this.aClass1_Sub1_Sub3_3.method474();
					this.anInt209 = this.aClass1_Sub1_Sub3_3.method472();
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 222) {
					local165 = this.aClass1_Sub1_Sub3_3.method474();
					local214 = this.aClass1_Sub1_Sub3_3.method474();
					local364 = this.aClass1_Sub1_Sub3_3.method474();
					@Pc(733) Class15 local733 = Class15.method357(local214);
					Class6.aClass6Array1[local165].anInt425 = 4;
					Class6.aClass6Array1[local165].anInt426 = local214;
					Class6.aClass6Array1[local165].anInt432 = local733.anInt582;
					Class6.aClass6Array1[local165].anInt433 = local733.anInt583;
					Class6.aClass6Array1[local165].anInt431 = local733.anInt581 * 100 / local364;
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 63) {
					this.anInt378 = this.anInt204 / 8;
					for (local165 = 0; local165 < this.anInt378; local165++) {
						this.aLongArray4[local165] = this.aClass1_Sub1_Sub3_3.method478();
					}
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 64) {
					this.anInt267 = this.aClass1_Sub1_Sub3_3.method472();
					if (this.anInt267 == 1) {
						this.anInt235 = this.aClass1_Sub1_Sub3_3.method474();
					}
					if (this.anInt267 >= 2 && this.anInt267 <= 6) {
						if (this.anInt267 == 2) {
							this.anInt271 = 64;
							this.anInt272 = 64;
						}
						if (this.anInt267 == 3) {
							this.anInt271 = 0;
							this.anInt272 = 64;
						}
						if (this.anInt267 == 4) {
							this.anInt271 = 128;
							this.anInt272 = 64;
						}
						if (this.anInt267 == 5) {
							this.anInt271 = 64;
							this.anInt272 = 0;
						}
						if (this.anInt267 == 6) {
							this.anInt271 = 64;
							this.anInt272 = 128;
						}
						this.anInt267 = 2;
						this.anInt268 = this.aClass1_Sub1_Sub3_3.method474();
						this.anInt269 = this.aClass1_Sub1_Sub3_3.method474();
						this.anInt270 = this.aClass1_Sub1_Sub3_3.method472();
					}
					if (this.anInt267 == 10) {
						this.anInt398 = this.aClass1_Sub1_Sub3_3.method474();
					}
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 197) {
					local165 = this.aClass1_Sub1_Sub3_3.method474();
					this.method148(local165, 962);
					if (this.anInt364 != -1) {
						this.anInt364 = -1;
						this.aBoolean56 = true;
						this.aBoolean75 = true;
					}
					if (this.anInt316 != -1) {
						this.anInt316 = -1;
						this.aBoolean68 = true;
					}
					if (this.aBoolean97) {
						this.aBoolean97 = false;
						this.aBoolean68 = true;
					}
					this.anInt322 = local165;
					this.aBoolean57 = false;
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 255) {
					this.anInt291 = this.aClass1_Sub1_Sub3_3.method472();
					this.aBoolean56 = true;
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 5) {
					this.aBoolean70 = false;
					this.aBoolean97 = true;
					this.aString14 = "";
					this.aBoolean68 = true;
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 187) {
					local165 = this.aClass1_Sub1_Sub3_3.method474();
					this.method148(local165, 962);
					if (this.anInt316 != -1) {
						this.anInt316 = -1;
						this.aBoolean68 = true;
					}
					if (this.aBoolean97) {
						this.aBoolean97 = false;
						this.aBoolean68 = true;
					}
					this.anInt364 = local165;
					this.aBoolean56 = true;
					this.aBoolean75 = true;
					this.anInt322 = -1;
					this.aBoolean57 = false;
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 161) {
					local165 = this.aClass1_Sub1_Sub3_3.method474();
					Class6.aClass6Array1[local165].anInt425 = 3;
					Class6.aClass6Array1[local165].anInt426 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray14[0] << 24) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray14[4] << 18) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[0] << 12) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[8] << 6) + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[11];
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 174) {
					if (this.anInt364 != -1) {
						this.anInt364 = -1;
						this.aBoolean56 = true;
						this.aBoolean75 = true;
					}
					if (this.anInt316 != -1) {
						this.anInt316 = -1;
						this.aBoolean68 = true;
					}
					if (this.aBoolean97) {
						this.aBoolean97 = false;
						this.aBoolean68 = true;
					}
					this.anInt322 = -1;
					this.aBoolean57 = false;
					this.anInt205 = -1;
					return true;
				}
				@Pc(1230) int local1230;
				if (this.anInt205 == 0) {
					this.aBoolean54 = true;
					this.anInt305 = this.aClass1_Sub1_Sub3_3.method472();
					this.anInt306 = this.aClass1_Sub1_Sub3_3.method472();
					this.anInt307 = this.aClass1_Sub1_Sub3_3.method474();
					this.anInt308 = this.aClass1_Sub1_Sub3_3.method472();
					this.anInt309 = this.aClass1_Sub1_Sub3_3.method472();
					if (this.anInt309 >= 100) {
						local165 = this.anInt305 * 128 + 64;
						local214 = this.anInt306 * 128 + 64;
						local364 = this.method199(this.anInt386, local165, local214) - this.anInt307;
						local641 = local165 - this.anInt329;
						local372 = local364 - this.anInt330;
						local1230 = local214 - this.anInt331;
						local474 = (int) Math.sqrt((double) (local641 * local641 + local1230 * local1230));
						this.anInt332 = (int) (Math.atan2((double) local372, (double) local474) * 325.949D) & 0x7FF;
						this.anInt333 = (int) (Math.atan2((double) local641, (double) local1230) * -325.949D) & 0x7FF;
						if (this.anInt332 < 128) {
							this.anInt332 = 128;
						}
						if (this.anInt332 > 383) {
							this.anInt332 = 383;
						}
					}
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 141) {
					local165 = this.aClass1_Sub1_Sub3_3.method474();
					this.method148(local165, 962);
					if (this.anInt364 != -1) {
						this.anInt364 = -1;
						this.aBoolean56 = true;
						this.aBoolean75 = true;
					}
					this.anInt316 = local165;
					this.aBoolean68 = true;
					this.anInt322 = -1;
					this.aBoolean57 = false;
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 173) {
					this.anInt241 = this.aClass1_Sub1_Sub3_3.method472();
					this.anInt242 = this.aClass1_Sub1_Sub3_3.method472();
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 209) {
					local165 = this.aClass1_Sub1_Sub3_3.method474();
					local214 = this.aClass1_Sub1_Sub3_3.method474();
					if (this.anInt194 == local165 && this.anInt195 == local214 && this.anInt326 == 2) {
						this.anInt205 = -1;
						return true;
					}
					this.anInt194 = local165;
					this.anInt195 = local214;
					this.anInt277 = (this.anInt194 - 6) * 8;
					this.anInt278 = (this.anInt195 - 6) * 8;
					this.aBoolean91 = false;
					if ((this.anInt194 / 8 == 48 || this.anInt194 / 8 == 49) && this.anInt195 / 8 == 48) {
						this.aBoolean91 = true;
					}
					if (this.anInt194 / 8 == 48 && this.anInt195 / 8 == 148) {
						this.aBoolean91 = true;
					}
					this.anInt326 = 1;
					this.aLong18 = System.currentTimeMillis();
					this.aClass35_5.method516();
					this.aClass1_Sub1_Sub2_Sub4_2.method442(257, 151, 0, "Loading - please wait.");
					this.aClass1_Sub1_Sub2_Sub4_2.method442(256, 150, 16777215, "Loading - please wait.");
					this.aClass35_5.method517(4, 4, super.aGraphics2);
					local364 = 0;
					for (local641 = (this.anInt194 - 6) / 8; local641 <= (this.anInt194 + 6) / 8; local641++) {
						for (local372 = (this.anInt195 - 6) / 8; local372 <= (this.anInt195 + 6) / 8; local372++) {
							local364++;
						}
					}
					this.aByteArrayArray1 = new byte[local364][];
					this.aByteArrayArray2 = new byte[local364][];
					this.anIntArray40 = new int[local364];
					this.anIntArray41 = new int[local364];
					this.anIntArray42 = new int[local364];
					local364 = 0;
					for (local372 = (this.anInt194 - 6) / 8; local372 <= (this.anInt194 + 6) / 8; local372++) {
						for (local1230 = (this.anInt195 - 6) / 8; local1230 <= (this.anInt195 + 6) / 8; local1230++) {
							this.anIntArray40[local364] = (local372 << 8) + local1230;
							if (this.aBoolean91 && (local1230 == 49 || local1230 == 149 || local1230 == 147 || local372 == 50 || local372 == 49 && local1230 == 47)) {
								this.anIntArray41[local364] = -1;
								this.anIntArray42[local364] = -1;
								local364++;
							} else {
								local474 = this.anIntArray41[local364] = this.aClass44_Sub1_1.method632(local1230, 0, local372);
								if (local474 != -1) {
									this.aClass44_Sub1_1.method637(3, local474);
								}
								local507 = this.anIntArray42[local364] = this.aClass44_Sub1_1.method632(local1230, 1, local372);
								if (local507 != -1) {
									this.aClass44_Sub1_1.method637(3, local507);
								}
								local364++;
							}
						}
					}
					local1230 = this.anInt277 - this.anInt279;
					local474 = this.anInt278 - this.anInt280;
					this.anInt279 = this.anInt277;
					this.anInt280 = this.anInt278;
					for (local507 = 0; local507 < 16384; local507++) {
						@Pc(1681) Class1_Sub1_Sub1_Sub1_Sub2 local1681 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local507];
						if (local1681 != null) {
							for (@Pc(1685) int local1685 = 0; local1685 < 10; local1685++) {
								local1681.anIntArray269[local1685] -= local1230;
								local1681.anIntArray270[local1685] -= local474;
							}
							local1681.anInt961 -= local1230 * 128;
							local1681.anInt962 -= local474 * 128;
						}
					}
					for (@Pc(1729) int local1729 = 0; local1729 < this.anInt388; local1729++) {
						@Pc(1736) Class1_Sub1_Sub1_Sub1_Sub1 local1736 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local1729];
						if (local1736 != null) {
							for (@Pc(1740) int local1740 = 0; local1740 < 10; local1740++) {
								local1736.anIntArray269[local1740] -= local1230;
								local1736.anIntArray270[local1740] -= local474;
							}
							local1736.anInt961 -= local1230 * 128;
							local1736.anInt962 -= local474 * 128;
						}
					}
					this.aBoolean94 = true;
					@Pc(1788) byte local1788 = 0;
					@Pc(1790) byte local1790 = 104;
					@Pc(1792) byte local1792 = 1;
					if (local1230 < 0) {
						local1788 = 103;
						local1790 = -1;
						local1792 = -1;
					}
					@Pc(1802) byte local1802 = 0;
					@Pc(1804) byte local1804 = 104;
					@Pc(1806) byte local1806 = 1;
					if (local474 < 0) {
						local1802 = 103;
						local1804 = -1;
						local1806 = -1;
					}
					for (@Pc(1816) int local1816 = local1788; local1816 != local1790; local1816 += local1792) {
						for (@Pc(1820) int local1820 = local1802; local1820 != local1804; local1820 += local1806) {
							@Pc(1826) int local1826 = local1816 + local1230;
							@Pc(1830) int local1830 = local1820 + local474;
							for (@Pc(1832) int local1832 = 0; local1832 < 4; local1832++) {
								if (local1826 >= 0 && local1830 >= 0 && local1826 < 104 && local1830 < 104) {
									this.aClass29ArrayArrayArray1[local1832][local1816][local1820] = this.aClass29ArrayArrayArray1[local1832][local1826][local1830];
								} else {
									this.aClass29ArrayArrayArray1[local1832][local1816][local1820] = null;
								}
							}
						}
					}
					for (@Pc(1894) Class1_Sub2 local1894 = (Class1_Sub2) this.aClass29_1.method503(); local1894 != null; local1894 = (Class1_Sub2) this.aClass29_1.method505()) {
						local1894.anInt757 -= local1230;
						local1894.anInt758 -= local474;
						if (local1894.anInt757 < 0 || local1894.anInt758 < 0 || local1894.anInt757 >= 104 || local1894.anInt758 >= 104) {
							local1894.method666();
						}
					}
					if (this.anInt358 != 0) {
						this.anInt358 -= local1230;
						this.anInt359 -= local474;
					}
					this.aBoolean54 = false;
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 146) {
					this.anInt283 = this.aClass1_Sub1_Sub3_3.method477();
					this.anInt382 = this.aClass1_Sub1_Sub3_3.method474();
					this.anInt249 = this.aClass1_Sub1_Sub3_3.method472();
					this.anInt352 = this.aClass1_Sub1_Sub3_3.method474();
					this.anInt349 = this.aClass1_Sub1_Sub3_3.method472();
					if (this.anInt283 != 0 && this.anInt322 == -1) {
						signlink.dnslookup(Class48.method662(939, this.anInt283));
						this.method124();
						@Pc(2001) short local2001 = 650;
						if (this.anInt249 != 201 || this.anInt349 == 1) {
							local2001 = 655;
						}
						this.aString8 = "";
						this.aBoolean60 = false;
						for (local214 = 0; local214 < Class6.aClass6Array1.length; local214++) {
							if (Class6.aClass6Array1[local214] != null && Class6.aClass6Array1[local214].anInt410 == local2001) {
								this.anInt322 = Class6.aClass6Array1[local214].anInt407;
								break;
							}
						}
					}
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 3) {
					local165 = this.aClass1_Sub1_Sub3_3.method474();
					local214 = this.aClass1_Sub1_Sub3_3.method474();
					Class6.aClass6Array1[local165].anInt425 = 2;
					Class6.aClass6Array1[local165].anInt426 = local214;
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 239) {
					local165 = this.aClass1_Sub1_Sub3_3.method475();
					this.anInt387 = local165;
					this.aBoolean68 = true;
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 85) {
					local165 = this.aClass1_Sub1_Sub3_3.method475();
					if (local165 >= 0) {
						this.method148(local165, 962);
					}
					this.anInt328 = local165;
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 95) {
					local165 = this.aClass1_Sub1_Sub3_3.method474();
					local214 = this.aClass1_Sub1_Sub3_3.method475();
					local302 = Class6.aClass6Array1[local165];
					local302.anInt429 = local214;
					if (local214 == -1) {
						local302.anInt404 = 0;
						local302.anInt405 = 0;
					}
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 21) {
					this.method104(this.aByte14);
					this.anInt205 = -1;
					return false;
				}
				if (this.anInt205 == 249) {
					local165 = this.aClass1_Sub1_Sub3_3.method474();
					local214 = this.aClass1_Sub1_Sub3_3.method474();
					if (this.anInt316 != -1) {
						this.anInt316 = -1;
						this.aBoolean68 = true;
					}
					if (this.aBoolean97) {
						this.aBoolean97 = false;
						this.aBoolean68 = true;
					}
					this.anInt322 = local165;
					this.anInt364 = local214;
					this.aBoolean56 = true;
					this.aBoolean75 = true;
					this.aBoolean57 = false;
					this.anInt205 = -1;
					return true;
				}
				@Pc(2226) String local2226;
				if (this.anInt205 == 41) {
					local165 = this.aClass1_Sub1_Sub3_3.method474();
					local2226 = this.aClass1_Sub1_Sub3_3.method479();
					Class6.aClass6Array1[local165].aString18 = local2226;
					if (Class6.aClass6Array1[local165].anInt407 == this.anIntArray58[this.anInt323]) {
						this.aBoolean56 = true;
					}
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 75) {
					this.anInt346 = this.aClass1_Sub1_Sub3_3.method472();
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 98 || this.anInt205 == 218 || this.anInt205 == 8 || this.anInt205 == 114 || this.anInt205 == 37 || this.anInt205 == 115 || this.anInt205 == 120 || this.anInt205 == 30 || this.anInt205 == 88 || this.anInt205 == 70) {
					this.method120(this.aClass1_Sub1_Sub3_3, 675, this.anInt205);
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 138) {
					this.anInt323 = this.aClass1_Sub1_Sub3_3.method472();
					this.aBoolean56 = true;
					this.aBoolean75 = true;
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 136) {
					this.aBoolean56 = true;
					local165 = this.aClass1_Sub1_Sub3_3.method472();
					local214 = this.aClass1_Sub1_Sub3_3.method477();
					local364 = this.aClass1_Sub1_Sub3_3.method472();
					this.anIntArray37[local165] = local214;
					this.anIntArray46[local165] = local364;
					this.anIntArray44[local165] = 1;
					for (local641 = 0; local641 < 98; local641++) {
						if (local214 >= anIntArray59[local641]) {
							this.anIntArray44[local165] = local641 + 2;
						}
					}
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 38) {
					local165 = this.aClass1_Sub1_Sub3_3.method474();
					local214 = this.aClass1_Sub1_Sub3_3.method474();
					local364 = local214 >> 10 & 0x1F;
					local641 = local214 >> 5 & 0x1F;
					local372 = local214 & 0x1F;
					Class6.aClass6Array1[local165].anInt421 = (local364 << 19) + (local641 << 11) + (local372 << 3);
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 25) {
					local165 = this.aClass1_Sub1_Sub3_3.method474();
					local214 = this.aClass1_Sub1_Sub3_3.method472();
					local364 = this.aClass1_Sub1_Sub3_3.method474();
					if (this.aBoolean65 && !aBoolean77 && this.anInt247 < 50) {
						this.anIntArray92[this.anInt247] = local165;
						this.anIntArray43[this.anInt247] = local214;
						this.anIntArray47[this.anInt247] = local364 + Class5.anIntArray28[local165];
						this.anInt247++;
					}
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 55) {
					this.aBoolean54 = true;
					this.anInt227 = this.aClass1_Sub1_Sub3_3.method472();
					this.anInt228 = this.aClass1_Sub1_Sub3_3.method472();
					this.anInt229 = this.aClass1_Sub1_Sub3_3.method474();
					this.anInt230 = this.aClass1_Sub1_Sub3_3.method472();
					this.anInt231 = this.aClass1_Sub1_Sub3_3.method472();
					if (this.anInt231 >= 100) {
						this.anInt329 = this.anInt227 * 128 + 64;
						this.anInt331 = this.anInt228 * 128 + 64;
						this.anInt330 = this.method199(this.anInt386, this.anInt329, this.anInt331) - this.anInt229;
					}
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 167) {
					this.aBoolean54 = false;
					for (local165 = 0; local165 < 5; local165++) {
						this.aBooleanArray4[local165] = false;
					}
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 227) {
					local165 = this.aClass1_Sub1_Sub3_3.method474();
					@Pc(2613) boolean local2613 = this.aClass1_Sub1_Sub3_3.method472() == 1;
					Class6.aClass6Array1[local165].aBoolean100 = local2613;
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 164) {
					if (this.anInt323 == 12) {
						this.aBoolean56 = true;
					}
					this.anInt243 = this.aClass1_Sub1_Sub3_3.method475();
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 140) {
					for (local165 = 0; local165 < this.anIntArray51.length; local165++) {
						if (this.anIntArray51[local165] != this.anIntArray76[local165]) {
							this.anIntArray51[local165] = this.anIntArray76[local165];
							this.method209(local165);
							this.aBoolean56 = true;
						}
					}
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 94) {
					if (this.anInt323 == 12) {
						this.aBoolean56 = true;
					}
					this.anInt255 = this.aClass1_Sub1_Sub3_3.method472();
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 143) {
					this.anInt282 = this.aClass1_Sub1_Sub3_3.method474() * 30;
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 168) {
					local165 = this.aClass1_Sub1_Sub3_3.method474();
					local635 = Class6.aClass6Array1[local165];
					for (local364 = 0; local364 < local635.anIntArray93.length; local364++) {
						local635.anIntArray93[local364] = -1;
						local635.anIntArray93[local364] = 0;
					}
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 61) {
					this.anInt241 = this.aClass1_Sub1_Sub3_3.method472();
					this.anInt242 = this.aClass1_Sub1_Sub3_3.method472();
					while (this.aClass1_Sub1_Sub3_3.anInt715 < this.anInt204) {
						local165 = this.aClass1_Sub1_Sub3_3.method472();
						this.method120(this.aClass1_Sub1_Sub3_3, 675, local165);
					}
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 58) {
					this.anInt246 = this.aClass1_Sub1_Sub3_3.method472();
					if (this.anInt246 == this.anInt323) {
						if (this.anInt246 == 3) {
							this.anInt323 = 1;
						} else {
							this.anInt323 = 3;
						}
						this.aBoolean56 = true;
					}
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 204) {
					local165 = this.aClass1_Sub1_Sub3_3.method472();
					local214 = this.aClass1_Sub1_Sub3_3.method472();
					@Pc(2848) String local2848 = this.aClass1_Sub1_Sub3_3.method479();
					if (local165 >= 1 && local165 <= 5) {
						if (local2848.equalsIgnoreCase("null")) {
							local2848 = null;
						}
						this.aStringArray4[local165 - 1] = local2848;
						this.aBooleanArray3[local165 - 1] = local214 == 0;
					}
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 24) {
					this.anInt260 = this.aClass1_Sub1_Sub3_3.method472();
					this.anInt224 = this.aClass1_Sub1_Sub3_3.method472();
					this.anInt348 = this.aClass1_Sub1_Sub3_3.method472();
					this.aBoolean81 = true;
					this.aBoolean68 = true;
					this.anInt205 = -1;
					return true;
				}
				@Pc(2937) boolean local2937;
				if (this.anInt205 == 73) {
					local2921 = this.aClass1_Sub1_Sub3_3.method479();
					@Pc(2935) long local2935;
					if (local2921.endsWith(":tradereq:")) {
						local2226 = local2921.substring(0, local2921.indexOf(":"));
						local2935 = Class48.method659(local2226);
						local2937 = false;
						for (local1230 = 0; local1230 < this.anInt378; local1230++) {
							if (this.aLongArray4[local1230] == local2935) {
								local2937 = true;
								break;
							}
						}
						if (!local2937 && this.anInt254 == 0) {
							this.method200(4, "wishes to trade with you.", local2226);
						}
					} else if (local2921.endsWith(":duelreq:")) {
						local2226 = local2921.substring(0, local2921.indexOf(":"));
						local2935 = Class48.method659(local2226);
						local2937 = false;
						for (local1230 = 0; local1230 < this.anInt378; local1230++) {
							if (this.aLongArray4[local1230] == local2935) {
								local2937 = true;
								break;
							}
						}
						if (!local2937 && this.anInt254 == 0) {
							this.method200(8, "wishes to duel with you.", local2226);
						}
					} else {
						this.method200(0, local2921, "");
					}
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 225) {
					local165 = this.aClass1_Sub1_Sub3_3.method472();
					local214 = this.aClass1_Sub1_Sub3_3.method472();
					local364 = this.aClass1_Sub1_Sub3_3.method472();
					local641 = this.aClass1_Sub1_Sub3_3.method472();
					this.aBooleanArray4[local165] = true;
					this.anIntArray62[local165] = local214;
					this.anIntArray91[local165] = local364;
					this.anIntArray63[local165] = local641;
					this.anIntArray65[local165] = 0;
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 170) {
					this.aBoolean56 = true;
					local165 = this.aClass1_Sub1_Sub3_3.method474();
					local635 = Class6.aClass6Array1[local165];
					while (this.aClass1_Sub1_Sub3_3.anInt715 < this.anInt204) {
						local364 = this.aClass1_Sub1_Sub3_3.method472();
						local641 = this.aClass1_Sub1_Sub3_3.method474();
						local372 = this.aClass1_Sub1_Sub3_3.method472();
						if (local372 == 255) {
							local372 = this.aClass1_Sub1_Sub3_3.method477();
						}
						if (local364 >= 0 && local364 < local635.anIntArray93.length) {
							local635.anIntArray93[local364] = local641;
							local635.anIntArray94[local364] = local372;
						}
					}
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 108) {
					this.anInt358 = 0;
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 60) {
					local360 = this.aClass1_Sub1_Sub3_3.method478();
					local364 = this.aClass1_Sub1_Sub3_3.method477();
					local641 = this.aClass1_Sub1_Sub3_3.method472();
					local2937 = false;
					for (local1230 = 0; local1230 < 100; local1230++) {
						if (this.anIntArray64[local1230] == local364) {
							local2937 = true;
							break;
						}
					}
					if (local641 <= 1) {
						for (local474 = 0; local474 < this.anInt378; local474++) {
							if (this.aLongArray4[local474] == local360) {
								local2937 = true;
								break;
							}
						}
					}
					if (!local2937 && this.anInt254 == 0) {
						try {
							this.anIntArray64[this.anInt300] = local364;
							this.anInt300 = (this.anInt300 + 1) % 100;
							@Pc(3245) String local3245 = Class49.method676(this.anInt204 - 13, this.aClass1_Sub1_Sub3_3, this.aByte11);
							@Pc(3250) String local3250 = Class42.method596(local3245, this.aByte12);
							if (local641 == 2 || local641 == 3) {
								this.method200(7, local3250, "@cr2@" + Class48.method663(584, Class48.method660(local360)));
							} else if (local641 == 1) {
								this.method200(7, local3250, "@cr1@" + Class48.method663(584, Class48.method660(local360)));
							} else {
								this.method200(3, local3250, Class48.method663(584, Class48.method660(local360)));
							}
						} catch (@Pc(3307) Exception local3307) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 186) {
					local165 = this.aClass1_Sub1_Sub3_3.method474();
					@Pc(3327) byte local3327 = this.aClass1_Sub1_Sub3_3.method473();
					this.anIntArray76[local165] = local3327;
					if (this.anIntArray51[local165] != local3327) {
						this.anIntArray51[local165] = local3327;
						this.method209(local165);
						this.aBoolean56 = true;
						if (this.anInt387 != -1) {
							this.aBoolean68 = true;
						}
					}
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 211) {
					local165 = this.aClass1_Sub1_Sub3_3.method474();
					local214 = this.aClass1_Sub1_Sub3_3.method474();
					Class6.aClass6Array1[local165].anInt425 = 1;
					Class6.aClass6Array1[local165].anInt426 = local214;
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 159) {
					this.anInt241 = this.aClass1_Sub1_Sub3_3.method472();
					this.anInt242 = this.aClass1_Sub1_Sub3_3.method472();
					for (local165 = this.anInt241; local165 < this.anInt241 + 8; local165++) {
						for (local214 = this.anInt242; local214 < this.anInt242 + 8; local214++) {
							if (this.aClass29ArrayArrayArray1[this.anInt386][local165][local214] != null) {
								this.aClass29ArrayArrayArray1[this.anInt386][local165][local214] = null;
								this.method165(local165, local214);
							}
						}
					}
					for (@Pc(3456) Class1_Sub2 local3456 = (Class1_Sub2) this.aClass29_1.method503(); local3456 != null; local3456 = (Class1_Sub2) this.aClass29_1.method505()) {
						if (local3456.anInt757 >= this.anInt241 && local3456.anInt757 < this.anInt241 + 8 && local3456.anInt758 >= this.anInt242 && local3456.anInt758 < this.anInt242 + 8 && local3456.anInt755 == this.anInt386) {
							local3456.anInt766 = 0;
						}
					}
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 123) {
					this.method122(this.aClass1_Sub1_Sub3_3, this.anInt204);
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 203) {
					for (local165 = 0; local165 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length; local165++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local165] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local165].anInt984 = -1;
						}
					}
					for (local214 = 0; local214 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length; local214++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local214] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local214].anInt984 = -1;
						}
					}
					this.anInt205 = -1;
					return true;
				}
				if (this.anInt205 == 27) {
					local165 = this.aClass1_Sub1_Sub3_3.method474();
					local214 = this.aClass1_Sub1_Sub3_3.method475();
					local364 = this.aClass1_Sub1_Sub3_3.method475();
					@Pc(3590) Class6 local3590 = Class6.aClass6Array1[local165];
					local3590.anInt413 = local214;
					local3590.anInt414 = local364;
					this.anInt205 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt205 + "," + this.anInt204 + " - " + this.anInt285 + "," + this.anInt286);
				this.method104(this.aByte14);
			} catch (@Pc(3631) IOException local3631) {
				this.method166();
			} catch (@Pc(3636) Exception local3636) {
				local2921 = "T2 - " + this.anInt205 + "," + this.anInt285 + "," + this.anInt286 + " - " + this.anInt204 + "," + (this.anInt277 + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0]) + "," + (this.anInt278 + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0]) + " - ";
				for (local214 = 0; local214 < this.anInt204 && local214 < 50; local214++) {
					local2921 = local2921 + this.aClass1_Sub1_Sub3_3.aByteArray9[local214] + ",";
				}
				signlink.reporterror(local2921);
				this.method104(this.aByte14);
			}
			return true;
		} catch (@Pc(3718) RuntimeException local3718) {
			signlink.reporterror("43823, " + arg0 + ", " + local3718.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method196() {
		try {
			for (@Pc(16) Class1_Sub2 local16 = (Class1_Sub2) this.aClass29_1.method503(); local16 != null; local16 = (Class1_Sub2) this.aClass29_1.method505()) {
				if (local16.anInt766 == -1) {
					local16.anInt765 = 0;
					this.method174(local16);
				} else {
					local16.method666();
				}
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("67842, " + 49343 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B[BZ)V")
	private void method197(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2) {
		try {
			signlink.anInt918 = arg2 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
			@Pc(14) boolean local14 = false;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("86174, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	private void method198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			@Pc(1) Class1_Sub2 local1 = null;
			for (@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) this.aClass29_1.method503(); local6 != null; local6 = (Class1_Sub2) this.aClass29_1.method505()) {
				if (local6.anInt755 == arg9 && local6.anInt757 == arg4 && local6.anInt758 == arg7 && local6.anInt756 == arg8) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class1_Sub2();
				local1.anInt755 = arg9;
				local1.anInt756 = arg8;
				local1.anInt757 = arg4;
				local1.anInt758 = arg7;
				this.method174(local1);
				this.aClass29_1.method500(local1);
			}
			local1.anInt762 = arg6;
			local1.anInt764 = arg1;
			local1.anInt763 = arg5;
			local1.anInt765 = arg2;
			local1.anInt766 = arg0;
			@Pc(80) boolean local80 = false;
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("89631, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBI)I")
	private int method199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = arg1 >> 7;
			@Pc(7) int local7 = arg2 >> 7;
			if (local3 < 0 || local7 < 0 || local3 > 103 || local7 > 103) {
				return 0;
			}
			@Pc(21) int local21 = arg0;
			if (arg0 < 3 && (this.aByteArrayArrayArray7[1][local3][local7] & 0x2) == 2) {
				local21 = arg0 + 1;
			}
			@Pc(41) int local41 = arg1 & 0x7F;
			@Pc(45) int local45 = arg2 & 0x7F;
			@Pc(73) int local73 = this.anIntArrayArrayArray5[local21][local3][local7] * (128 - local41) + this.anIntArrayArrayArray5[local21][local3 + 1][local7] * local41 >> 7;
			@Pc(113) int local113 = this.anIntArrayArrayArray5[local21][local3][local7 + 1] * (128 - local41) + this.anIntArrayArrayArray5[local21][local3 + 1][local7 + 1] * local41 >> 7;
			return local73 * (128 - local45) + local113 * local45 >> 7;
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("35442, " + arg0 + ", " + arg1 + ", " + -51 + ", " + arg2 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
	private void method200(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		try {
			if (arg0 == 0 && this.anInt387 != -1) {
				this.aString16 = arg1;
				super.anInt187 = 0;
			}
			if (this.anInt316 == -1) {
				this.aBoolean68 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray38[local20] = this.anIntArray38[local20 - 1];
				this.aStringArray1[local20] = this.aStringArray1[local20 - 1];
				this.aStringArray2[local20] = this.aStringArray2[local20 - 1];
			}
			this.anIntArray38[0] = arg0;
			this.aStringArray1[0] = arg2;
			this.aStringArray2[0] = arg1;
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("94966, " + -638 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method201(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(6) int local6 = this.anInt227 * 128 + 64;
			@Pc(13) int local13 = this.anInt228 * 128 + 64;
			@Pc(24) int local24 = this.method199(this.anInt386, local6, local13) - this.anInt229;
			if (this.anInt329 < local6) {
				this.anInt329 += this.anInt230 + (local6 - this.anInt329) * this.anInt231 / 1000;
				if (this.anInt329 > local6) {
					this.anInt329 = local6;
				}
			}
			if (this.anInt329 > local6) {
				this.anInt329 -= this.anInt230 + (this.anInt329 - local6) * this.anInt231 / 1000;
				if (this.anInt329 < local6) {
					this.anInt329 = local6;
				}
			}
			if (this.anInt330 < local24) {
				this.anInt330 += this.anInt230 + (local24 - this.anInt330) * this.anInt231 / 1000;
				if (this.anInt330 > local24) {
					this.anInt330 = local24;
				}
			}
			if (this.anInt330 > local24) {
				this.anInt330 -= this.anInt230 + (this.anInt330 - local24) * this.anInt231 / 1000;
				if (this.anInt330 < local24) {
					this.anInt330 = local24;
				}
			}
			if (this.anInt331 < local13) {
				this.anInt331 += this.anInt230 + (local13 - this.anInt331) * this.anInt231 / 1000;
				if (this.anInt331 > local13) {
					this.anInt331 = local13;
				}
			}
			if (this.anInt331 > local13) {
				this.anInt331 -= this.anInt230 + (this.anInt331 - local13) * this.anInt231 / 1000;
				if (this.anInt331 < local13) {
					this.anInt331 = local13;
				}
			}
			local6 = this.anInt305 * 128 + 64;
			local13 = this.anInt306 * 128 + 64;
			if (!arg0) {
				local24 = this.method199(this.anInt386, local6, local13) - this.anInt307;
				@Pc(225) int local225 = local6 - this.anInt329;
				@Pc(230) int local230 = local24 - this.anInt330;
				@Pc(235) int local235 = local13 - this.anInt331;
				@Pc(246) int local246 = (int) Math.sqrt((double) (local225 * local225 + local235 * local235));
				@Pc(257) int local257 = (int) (Math.atan2((double) local230, (double) local246) * 325.949D) & 0x7FF;
				@Pc(268) int local268 = (int) (Math.atan2((double) local225, (double) local235) * -325.949D) & 0x7FF;
				if (local257 < 128) {
					local257 = 128;
				}
				if (local257 > 383) {
					local257 = 383;
				}
				if (this.anInt332 < local257) {
					this.anInt332 += this.anInt308 + (local257 - this.anInt332) * this.anInt309 / 1000;
					if (this.anInt332 > local257) {
						this.anInt332 = local257;
					}
				}
				if (this.anInt332 > local257) {
					this.anInt332 -= this.anInt308 + (this.anInt332 - local257) * this.anInt309 / 1000;
					if (this.anInt332 < local257) {
						this.anInt332 = local257;
					}
				}
				@Pc(339) int local339 = local268 - this.anInt333;
				if (local339 > 1024) {
					local339 -= 2048;
				}
				if (local339 < -1024) {
					local339 += 2048;
				}
				if (local339 > 0) {
					this.anInt333 += this.anInt308 + local339 * this.anInt309 / 1000;
					this.anInt333 &= 0x7FF;
				}
				if (local339 < 0) {
					this.anInt333 -= this.anInt308 + -local339 * this.anInt309 / 1000;
					this.anInt333 &= 0x7FF;
				}
				@Pc(397) int local397 = local268 - this.anInt333;
				if (local397 > 1024) {
					local397 -= 2048;
				}
				if (local397 < -1024) {
					local397 += 2048;
				}
				if (local397 < 0 && local339 > 0 || local397 > 0 && local339 < 0) {
					this.anInt333 = local268;
				}
			}
		} catch (@Pc(418) RuntimeException local418) {
			signlink.reporterror("48625, " + arg0 + ", " + local418.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ib;IBI)V")
	private void method202(@OriginalArg(0) Class1_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(4) boolean local4 = false;
			@Pc(17) int local17 = arg1 * arg1 + arg3 * arg3;
			if (local17 > 4225 && local17 < 90000) {
				@Pc(31) int local31 = this.anInt212 + this.anInt383 & 0x7FF;
				@Pc(35) int local35 = Class1_Sub1_Sub1_Sub5.anIntArray150[local31];
				@Pc(39) int local39 = Class1_Sub1_Sub1_Sub5.anIntArray151[local31];
				@Pc(48) int local48 = local35 * 256 / (this.anInt294 + 256);
				@Pc(57) int local57 = local39 * 256 / (this.anInt294 + 256);
				@Pc(67) int local67 = arg3 * local48 + arg1 * local57 >> 16;
				@Pc(77) int local77 = arg3 * local57 - arg1 * local48 >> 16;
				@Pc(83) double local83 = Math.atan2((double) local67, (double) local77);
				@Pc(89) int local89 = (int) (Math.sin(local83) * 63.0D);
				@Pc(95) int local95 = (int) (Math.cos(local83) * 57.0D);
				this.aClass1_Sub1_Sub2_Sub2_1.method392(local89 + 94 + 4 - 10, 83 - local95 - 20, local83);
			} else {
				this.method190(arg3, arg1, arg0);
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("99217, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method203(@OriginalArg(0) int arg0) {
		try {
			if (arg0 == 5) {
				this.method189(this.anInt252);
				if (this.anInt339 == 1) {
					this.aClass1_Sub1_Sub2_Sub2Array5[this.anInt338 / 100].method387(this.anInt337 - 8 - 4, this.anInt336 - 8 - 4);
				}
				if (this.anInt339 == 2) {
					this.aClass1_Sub1_Sub2_Sub2Array5[this.anInt338 / 100 + 4].method387(this.anInt337 - 8 - 4, this.anInt336 - 8 - 4);
					anInt370++;
					if (anInt370 > 57) {
						anInt370 = 0;
						this.aClass1_Sub1_Sub3_2.method461(100);
					}
				}
				if (this.anInt328 != -1) {
					this.method187(this.anInt328, 68, this.anInt196);
					this.method96(0, 0, 0, Class6.aClass6Array1[this.anInt328]);
				}
				if (this.anInt322 != -1) {
					this.method187(this.anInt322, 68, this.anInt196);
					this.method96(0, 0, 0, Class6.aClass6Array1[this.anInt322]);
				}
				this.method113();
				if (!this.aBoolean74) {
					this.method188((byte) 9);
					this.method145();
				} else if (this.anInt261 == 0) {
					this.method221();
				}
				if (this.anInt346 == 1) {
					this.aClass1_Sub1_Sub2_Sub2Array7[1].method387(296, 472);
				}
				if (this.anInt282 != 0) {
					@Pc(157) int local157 = this.anInt282 / 50;
					@Pc(161) int local161 = local157 / 60;
					@Pc(165) int local165 = local157 % 60;
					if (local165 < 10) {
						this.aClass1_Sub1_Sub2_Sub4_2.method445(4, 474, 16776960, "System update in: " + local161 + ":0" + local165, 329);
					} else {
						this.aClass1_Sub1_Sub2_Sub4_2.method445(4, 474, 16776960, "System update in: " + local161 + ":" + local165, 329);
					}
				}
			}
		} catch (@Pc(207) RuntimeException local207) {
			signlink.reporterror("36307, " + arg0 + ", " + local207.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)Ljava/net/Socket;")
	public Socket method204(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method205() {
		try {
			this.anInt204 += 0;
			@Pc(27) int local27;
			@Pc(55) int local55;
			@Pc(59) int local59;
			@Pc(68) int local68;
			@Pc(75) int local75;
			@Pc(138) int local138;
			@Pc(196) int local196;
			try {
				this.anInt193 = -1;
				this.aClass29_3.method507();
				this.aClass29_2.method507();
				Class1_Sub1_Sub2_Sub1.method341();
				this.method97(627);
				this.aClass37_1.method522();
				for (local27 = 0; local27 < 4; local27++) {
					this.aClass19Array1[local27].method416();
				}
				System.gc();
				@Pc(51) Class4 local51 = new Class4((byte) 5, 104, this.aByteArrayArrayArray7, this.anIntArrayArrayArray5, 104);
				local55 = this.aByteArrayArray1.length;
				Class4.aBoolean42 = Class37.aBoolean230;
				for (local59 = 0; local59 < local55; local59++) {
					local68 = this.anIntArray40[local59] >> 8;
					local75 = this.anIntArray40[local59] & 0xFF;
					if (local68 == 33 && local75 >= 71 && local75 <= 73) {
						Class4.aBoolean42 = false;
					}
				}
				if (Class4.aBoolean42) {
					this.aClass37_1.method523(this.anInt386);
				} else {
					this.aClass37_1.method523(0);
				}
				this.aClass1_Sub1_Sub3_2.method461(239);
				@Pc(143) byte[] local143;
				for (local68 = 0; local68 < local55; local68++) {
					local75 = (this.anIntArray40[local68] >> 8) * 64 - this.anInt277;
					local138 = (this.anIntArray40[local68] & 0xFF) * 64 - this.anInt278;
					local143 = this.aByteArrayArray1[local68];
					if (local143 != null) {
						local51.method56(this.aBoolean88, local75, (this.anInt194 - 6) * 8, (this.anInt195 - 6) * 8, local143, local138);
					}
				}
				for (local75 = 0; local75 < local55; local75++) {
					local138 = (this.anIntArray40[local75] >> 8) * 64 - this.anInt277;
					local196 = (this.anIntArray40[local75] & 0xFF) * 64 - this.anInt278;
					@Pc(201) byte[] local201 = this.aByteArrayArray1[local75];
					if (local201 == null && this.anInt195 < 800) {
						local51.method55(local138, local196);
					}
				}
				this.aClass1_Sub1_Sub3_2.method461(239);
				@Pc(246) int local246;
				for (local138 = 0; local138 < local55; local138++) {
					local143 = this.aByteArrayArray2[local138];
					if (local143 != null) {
						local246 = (this.anIntArray40[local138] >> 8) * 64 - this.anInt277;
						@Pc(258) int local258 = (this.anIntArray40[local138] & 0xFF) * 64 - this.anInt278;
						local51.method59(local246, this.aClass37_1, (byte) 7, this.aClass19Array1, local143, local258);
					}
				}
				this.aClass1_Sub1_Sub3_2.method461(239);
				local51.method61(this.aClass37_1, this.aClass19Array1);
				this.aClass35_5.method516();
				this.aClass1_Sub1_Sub3_2.method461(239);
				for (local196 = 0; local196 < 104; local196++) {
					for (local246 = 0; local246 < 104; local246++) {
						this.method165(local196, local246);
					}
				}
				this.method196();
			} catch (@Pc(318) Exception local318) {
			}
			Class9.aClass40_4.method585();
			@Pc(332) int local332;
			if (aBoolean77 && signlink.aRandomAccessFile1 != null) {
				local27 = this.aClass44_Sub1_1.method630(0);
				for (local332 = 0; local332 < local27; local332++) {
					local55 = this.aClass44_Sub1_1.method635(local332);
					if ((local55 & 0x79) == 0) {
						Class1_Sub1_Sub1_Sub5.method258(local332);
					}
				}
			}
			System.gc();
			Class1_Sub1_Sub2_Sub1.method342();
			this.aClass44_Sub1_1.method641();
			local27 = (this.anInt194 - 6) / 8 - 1;
			local332 = (this.anInt194 + 6) / 8 + 1;
			local55 = (this.anInt195 - 6) / 8 - 1;
			local59 = (this.anInt195 + 6) / 8 + 1;
			if (this.aBoolean91) {
				local27 = 49;
				local332 = 50;
				local55 = 49;
				local59 = 50;
			}
			for (local68 = local27; local68 <= local332; local68++) {
				for (local75 = local55; local75 <= local59; local75++) {
					if (local68 == local27 || local68 == local332 || local75 == local55 || local75 == local59) {
						local138 = this.aClass44_Sub1_1.method632(local75, 0, local68);
						if (local138 != -1) {
							this.aClass44_Sub1_1.method642(3, local138);
						}
						local196 = this.aClass44_Sub1_1.method632(local75, 1, local68);
						if (local196 != -1) {
							this.aClass44_Sub1_1.method642(3, local196);
						}
					}
				}
			}
		} catch (@Pc(470) RuntimeException local470) {
			signlink.reporterror("91222, " + 0 + ", " + local470.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILclient!lb;)V")
	private void method206(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			this.anInt310 = 0;
			this.anInt391 = 0;
			this.method218(arg1, arg0);
			this.method159(arg0, arg1);
			this.method110(arg1, 823, arg0);
			this.method207(arg0, arg1);
			@Pc(39) int local39;
			for (@Pc(32) int local32 = 0; local32 < this.anInt310; local32++) {
				local39 = this.anIntArray67[local32];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local39].anInt1001 != anInt375) {
					this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local39] = null;
				}
			}
			if (arg1.anInt715 != arg0) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.anInt715 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local39 = 0; local39 < this.anInt390; local39++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray89[local39]] == null) {
					signlink.reporterror(this.aString6 + " null entry in pl list - pos:" + local39 + " size:" + this.anInt390);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("65487, " + false + ", " + arg0 + ", " + arg1 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLclient!lb;)V")
	private void method207(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < this.anInt391; local4++) {
				@Pc(11) int local11 = this.anIntArray90[local4];
				@Pc(16) Class1_Sub1_Sub1_Sub1_Sub1 local16 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local11];
				@Pc(19) int local19 = arg1.method472();
				if ((local19 & 0x80) == 128) {
					local19 += arg1.method472() << 8;
				}
				this.method210(local11, local16, arg1, local19);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("72605, " + arg0 + ", " + true + ", " + arg1 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method208() {
		try {
			@Pc(9) int local9 = 5;
			this.anIntArray78[8] = 0;
			@Pc(16) int local16 = 0;
			while (this.anIntArray78[8] == 0) {
				@Pc(20) String local20 = "Unknown problem";
				this.method95(20, "Connecting to web server");
				try {
					@Pc(42) DataInputStream local42 = this.method101("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 270);
					@Pc(49) Class1_Sub1_Sub3 local49 = new Class1_Sub1_Sub3((byte) 3, new byte[40]);
					local42.readFully(local49.aByteArray9, 0, 40);
					local42.close();
					for (@Pc(59) int local59 = 0; local59 < 9; local59++) {
						this.anIntArray78[local59] = local49.method477();
					}
					@Pc(74) int local74 = local49.method477();
					@Pc(76) int local76 = 1234;
					for (@Pc(78) int local78 = 0; local78 < 9; local78++) {
						local76 = (local76 << 1) + this.anIntArray78[local78];
					}
					if (local74 != local76) {
						local20 = "checksum problem";
						this.anIntArray78[8] = 0;
					}
				} catch (@Pc(105) EOFException local105) {
					local20 = "EOF problem";
					this.anIntArray78[8] = 0;
				} catch (@Pc(114) IOException local114) {
					local20 = "connection problem";
					this.anIntArray78[8] = 0;
				} catch (@Pc(123) Exception local123) {
					local20 = "logic problem";
					this.anIntArray78[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray78[8] == 0) {
					local16++;
					for (@Pc(141) int local141 = local9; local141 > 0; local141--) {
						if (local16 >= 10) {
							this.method95(10, "Game updated - please reload page");
							local141 = 10;
						} else {
							this.method95(10, local20 + " - Will retry in " + local141 + " secs.");
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(175) Exception local175) {
						}
					}
					local9 *= 2;
					if (local9 > 60) {
						local9 = 60;
					}
					this.aBoolean61 = !this.aBoolean61;
				}
			}
		} catch (@Pc(203) RuntimeException local203) {
			signlink.reporterror("17683, " + -4 + ", " + local203.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(II)V")
	private void method209(@OriginalArg(0) int arg0) {
		try {
			@Pc(6) int local6 = Class39.aClass39Array1[arg0].anInt865;
			if (local6 != 0) {
				@Pc(21) int local21 = this.anIntArray51[arg0];
				if (local6 == 1) {
					if (local21 == 1) {
						Class1_Sub1_Sub2_Sub1.method347(0.9D);
					}
					if (local21 == 2) {
						Class1_Sub1_Sub2_Sub1.method347(0.8D);
					}
					if (local21 == 3) {
						Class1_Sub1_Sub2_Sub1.method347(0.7D);
					}
					if (local21 == 4) {
						Class1_Sub1_Sub2_Sub1.method347(0.6D);
					}
					Class15.aClass40_8.method585();
					this.aBoolean86 = true;
				}
				if (local6 == 3) {
					@Pc(59) boolean local59 = this.aBoolean62;
					if (local21 == 0) {
						this.method141(this.aBoolean62, 0);
						this.aBoolean62 = true;
					}
					if (local21 == 1) {
						this.method141(this.aBoolean62, -400);
						this.aBoolean62 = true;
					}
					if (local21 == 2) {
						this.method141(this.aBoolean62, -800);
						this.aBoolean62 = true;
					}
					if (local21 == 3) {
						this.method141(this.aBoolean62, -1200);
						this.aBoolean62 = true;
					}
					if (local21 == 4) {
						this.aBoolean62 = false;
					}
					if (this.aBoolean62 != local59 && !aBoolean77) {
						if (this.aBoolean62) {
							this.anInt360 = this.anInt325;
							this.aBoolean87 = false;
							this.aClass44_Sub1_1.method637(2, this.anInt360);
						} else {
							this.method217();
						}
						this.anInt335 = 0;
					}
				}
				if (local6 == 4) {
					if (local21 == 0) {
						this.aBoolean65 = true;
						this.method117(0);
					}
					if (local21 == 1) {
						this.aBoolean65 = true;
						this.method117(-400);
					}
					if (local21 == 2) {
						this.aBoolean65 = true;
						this.method117(-800);
					}
					if (local21 == 3) {
						this.aBoolean65 = true;
						this.method117(-1200);
					}
					if (local21 == 4) {
						this.aBoolean65 = false;
					}
				}
				if (local6 == 5) {
					this.anInt313 = local21;
				}
				if (local6 == 6) {
					this.anInt238 = local21;
				}
				if (local6 == 8) {
					this.anInt210 = local21;
					this.aBoolean68 = true;
				}
				if (local6 == 9) {
					this.anInt192 = local21;
				}
			}
		} catch (@Pc(219) RuntimeException local219) {
			signlink.reporterror("26546, " + arg0 + ", " + -742 + ", " + local219.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!ab;Lclient!lb;I)V")
	private void method210(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub1_Sub1_Sub1 arg1, @OriginalArg(3) Class1_Sub1_Sub3 arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(18) int local18;
			if ((arg3 & 0x1) == 1) {
				local18 = arg2.method472();
				@Pc(21) byte[] local21 = new byte[local18];
				@Pc(27) Class1_Sub1_Sub3 local27 = new Class1_Sub1_Sub3((byte) 3, local21);
				arg2.method481(local18, local21);
				this.aClass1_Sub1_Sub3Array1[arg0] = local27;
				arg1.method39((byte) 1, local27);
			}
			@Pc(65) int local65;
			@Pc(77) int local77;
			if ((arg3 & 0x2) == 2) {
				local18 = arg2.method474();
				if (local18 == 65535) {
					local18 = -1;
				}
				if (local18 == arg1.anInt984) {
					arg1.anInt988 = 0;
				}
				local65 = arg2.method472();
				if (local18 == arg1.anInt984 && local18 != -1) {
					local77 = Class27.aClass27Array1[local18].anInt776;
					if (local77 == 1) {
						arg1.anInt985 = 0;
						arg1.anInt986 = 0;
						arg1.anInt987 = local65;
						arg1.anInt988 = 0;
					}
					if (local77 == 2) {
						arg1.anInt988 = 0;
					}
				} else if (local18 == -1 || arg1.anInt984 == -1 || Class27.aClass27Array1[local18].anInt770 >= Class27.aClass27Array1[arg1.anInt984].anInt770) {
					arg1.anInt984 = local18;
					arg1.anInt985 = 0;
					arg1.anInt986 = 0;
					arg1.anInt987 = local65;
					arg1.anInt988 = 0;
					arg1.anInt1007 = arg1.anInt1005;
				}
			}
			if ((arg3 & 0x4) == 4) {
				arg1.anInt978 = arg2.method474();
				if (arg1.anInt978 == 65535) {
					arg1.anInt978 = -1;
				}
			}
			if ((arg3 & 0x8) == 8) {
				arg1.aString31 = arg2.method479();
				arg1.anInt973 = 0;
				arg1.anInt974 = 0;
				arg1.anInt972 = 150;
				this.method200(2, arg1.aString31, arg1.aString3);
			}
			if ((arg3 & 0x10) == 16) {
				local18 = arg2.method472();
				local65 = arg2.method472();
				arg1.method674(anInt375, local65, local18);
				arg1.anInt975 = anInt375 + 300;
				arg1.anInt976 = arg2.method472();
				arg1.anInt977 = arg2.method472();
			}
			if ((arg3 & 0x20) == 32) {
				arg1.anInt979 = arg2.method474();
				arg1.anInt980 = arg2.method474();
			}
			if ((arg3 & 0x40) == 64) {
				local18 = arg2.method474();
				local65 = arg2.method472();
				local77 = arg2.method472();
				@Pc(238) int local238 = arg2.anInt715;
				if (arg1.aString3 != null && arg1.aBoolean30) {
					@Pc(248) long local248 = Class48.method659(arg1.aString3);
					@Pc(250) boolean local250 = false;
					if (local65 <= 1) {
						for (@Pc(255) int local255 = 0; local255 < this.anInt378; local255++) {
							if (this.aLongArray4[local255] == local248) {
								local250 = true;
								break;
							}
						}
					}
					if (!local250 && this.anInt254 == 0) {
						try {
							@Pc(284) String local284 = Class49.method676(local77, arg2, this.aByte11);
							@Pc(289) String local289 = Class42.method596(local284, this.aByte12);
							arg1.aString31 = local289;
							arg1.anInt973 = local18 >> 8;
							arg1.anInt974 = local18 & 0xFF;
							arg1.anInt972 = 150;
							if (local65 == 2 || local65 == 3) {
								this.method200(1, local289, "@cr2@" + arg1.aString3);
							} else if (local65 == 1) {
								this.method200(1, local289, "@cr1@" + arg1.aString3);
							} else {
								this.method200(2, local289, arg1.aString3);
							}
						} catch (@Pc(353) Exception local353) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg2.anInt715 = local238 + local77;
			}
			if ((arg3 & 0x100) == 256) {
				arg1.anInt989 = arg2.method474();
				local18 = arg2.method477();
				arg1.anInt993 = local18 >> 16;
				arg1.anInt992 = anInt375 + (local18 & 0xFFFF);
				arg1.anInt990 = 0;
				arg1.anInt991 = 0;
				if (arg1.anInt992 > anInt375) {
					arg1.anInt990 = -1;
				}
				if (arg1.anInt989 == 65535) {
					arg1.anInt989 = -1;
				}
			}
			if ((arg3 & 0x200) == 512) {
				arg1.anInt994 = arg2.method472();
				arg1.anInt996 = arg2.method472();
				arg1.anInt995 = arg2.method472();
				arg1.anInt997 = arg2.method472();
				arg1.anInt998 = arg2.method474() + anInt375;
				arg1.anInt999 = arg2.method474() + anInt375;
				arg1.anInt1000 = arg2.method472();
				arg1.method672();
			}
			if ((arg3 & 0x400) == 1024) {
				local18 = arg2.method472();
				local65 = arg2.method472();
				arg1.method674(anInt375, local65, local18);
				arg1.anInt975 = anInt375 + 300;
				arg1.anInt976 = arg2.method472();
				arg1.anInt977 = arg2.method472();
			}
		} catch (@Pc(477) RuntimeException local477) {
			signlink.reporterror("39962, " + arg0 + ", " + -639 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local477.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method211() {
		try {
			this.anInt311++;
			this.method107(true);
			this.aBoolean80 &= true;
			this.method175(true);
			this.method107(false);
			this.method175(false);
			this.method157(539);
			this.method225();
			@Pc(41) int local41;
			@Pc(80) int local80;
			if (!this.aBoolean54) {
				local41 = this.anInt211;
				if (this.anInt385 / 256 > local41) {
					local41 = this.anInt385 / 256;
				}
				if (this.aBooleanArray4[4] && this.anIntArray91[4] + 128 > local41) {
					local41 = this.anIntArray91[4] + 128;
				}
				local80 = this.anInt212 + this.anInt368 & 0x7FF;
				this.method100(this.anInt219, local41 * 3 + 600, this.anInt220, local41, this.method199(this.anInt386, aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt961, aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962) - 50, local80);
			}
			if (this.aBoolean54) {
				local41 = this.method193();
			} else {
				local41 = this.method192();
			}
			local80 = this.anInt329;
			@Pc(124) int local124 = this.anInt330;
			@Pc(127) int local127 = this.anInt331;
			@Pc(130) int local130 = this.anInt332;
			@Pc(133) int local133 = this.anInt333;
			@Pc(182) int local182;
			for (@Pc(135) int local135 = 0; local135 < 5; local135++) {
				if (this.aBooleanArray4[local135]) {
					local182 = (int) (Math.random() * (double) (this.anIntArray62[local135] * 2 + 1) - (double) this.anIntArray62[local135] + Math.sin((double) this.anIntArray65[local135] * ((double) this.anIntArray63[local135] / 100.0D)) * (double) this.anIntArray91[local135]);
					if (local135 == 0) {
						this.anInt329 += local182;
					}
					if (local135 == 1) {
						this.anInt330 += local182;
					}
					if (local135 == 2) {
						this.anInt331 += local182;
					}
					if (local135 == 3) {
						this.anInt333 = this.anInt333 + local182 & 0x7FF;
					}
					if (local135 == 4) {
						this.anInt332 += local182;
						if (this.anInt332 < 128) {
							this.anInt332 = 128;
						}
						if (this.anInt332 > 383) {
							this.anInt332 = 383;
						}
					}
				}
			}
			local182 = Class1_Sub1_Sub2_Sub1.anInt574;
			Class1_Sub1_Sub1_Sub5.aBoolean127 = true;
			Class1_Sub1_Sub1_Sub5.anInt483 = 0;
			Class1_Sub1_Sub1_Sub5.anInt481 = super.anInt182 - 4;
			Class1_Sub1_Sub1_Sub5.anInt482 = super.anInt183 - 4;
			Class1_Sub1_Sub2.method433();
			this.aClass37_1.method561(local41, this.anInt329, this.anInt332, this.anInt333, this.anInt330, this.anInt331);
			this.aClass37_1.method536(this.anInt296);
			this.method136();
			this.method130();
			this.method127(local182);
			this.method203(this.anInt232);
			this.aClass35_5.method517(4, 4, super.aGraphics2);
			this.anInt329 = local80;
			this.anInt330 = local124;
			this.anInt331 = local127;
			this.anInt332 = local130;
			this.anInt333 = local133;
		} catch (@Pc(323) RuntimeException local323) {
			signlink.reporterror("60168, " + true + ", " + local323.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method212() {
		try {
			@Pc(13) int local13 = this.aClass1_Sub1_Sub2_Sub4_3.method444("Choose Option");
			@Pc(26) int local26;
			for (@Pc(15) int local15 = 0; local15 < this.anInt222; local15++) {
				local26 = this.aClass1_Sub1_Sub2_Sub4_3.method444(this.aStringArray6[local15]);
				if (local26 > local13) {
					local13 = local26;
				}
			}
			local13 += 8;
			local26 = this.anInt222 * 15 + 21;
			@Pc(69) int local69;
			@Pc(87) int local87;
			if (super.anInt188 > 4 && super.anInt189 > 4 && super.anInt188 < 516 && super.anInt189 < 338) {
				local69 = super.anInt188 - local13 / 2 - 4;
				if (local69 + local13 > 512) {
					local69 = 512 - local13;
				}
				if (local69 < 0) {
					local69 = 0;
				}
				local87 = super.anInt189 - 4;
				if (local87 + local26 > 334) {
					local87 = 334 - local26;
				}
				if (local87 < 0) {
					local87 = 0;
				}
				this.aBoolean74 = true;
				this.anInt261 = 0;
				this.anInt262 = local69;
				this.anInt263 = local87;
				this.anInt264 = local13;
				this.anInt265 = this.anInt222 * 15 + 22;
			}
			if (super.anInt188 > 553 && super.anInt189 > 205 && super.anInt188 < 743 && super.anInt189 < 466) {
				local69 = super.anInt188 - local13 / 2 - 553;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 + local13 > 190) {
					local69 = 190 - local13;
				}
				local87 = super.anInt189 - 205;
				if (local87 < 0) {
					local87 = 0;
				} else if (local87 + local26 > 261) {
					local87 = 261 - local26;
				}
				this.aBoolean74 = true;
				this.anInt261 = 1;
				this.anInt262 = local69;
				this.anInt263 = local87;
				this.anInt264 = local13;
				this.anInt265 = this.anInt222 * 15 + 22;
			}
			if (super.anInt188 > 17 && super.anInt189 > 357 && super.anInt188 < 496 && super.anInt189 < 453) {
				local69 = super.anInt188 - local13 / 2 - 17;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 + local13 > 479) {
					local69 = 479 - local13;
				}
				local87 = super.anInt189 - 357;
				if (local87 < 0) {
					local87 = 0;
				} else if (local87 + local26 > 96) {
					local87 = 96 - local26;
				}
				this.aBoolean74 = true;
				this.anInt261 = 2;
				this.anInt262 = local69;
				this.anInt263 = local87;
				this.anInt264 = local13;
				this.anInt265 = this.anInt222 * 15 + 22;
			}
		} catch (@Pc(291) RuntimeException local291) {
			signlink.reporterror("91369, " + -26623 + ", " + local291.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
	private void method213() {
		try {
			for (@Pc(3) int local3 = -1; local3 < this.anInt390; local3++) {
				@Pc(11) int local11;
				if (local3 == -1) {
					local11 = this.anInt389;
				} else {
					local11 = this.anIntArray89[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub1 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local11];
				if (local23 != null) {
					this.method177(1, local23);
				}
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("42093, " + -529 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method214() {
		try {
			@Pc(18) int local18;
			if (this.anInt365 > 0) {
				for (local18 = 0; local18 < 256; local18++) {
					if (this.anInt365 > 768) {
						this.anIntArray54[local18] = this.method224(this.anIntArray55[local18], this.anIntArray56[local18], 1024 - this.anInt365);
					} else if (this.anInt365 > 256) {
						this.anIntArray54[local18] = this.anIntArray56[local18];
					} else {
						this.anIntArray54[local18] = this.method224(this.anIntArray56[local18], this.anIntArray55[local18], 256 - this.anInt365);
					}
				}
			} else if (this.anInt366 > 0) {
				for (local18 = 0; local18 < 256; local18++) {
					if (this.anInt366 > 768) {
						this.anIntArray54[local18] = this.method224(this.anIntArray55[local18], this.anIntArray57[local18], 1024 - this.anInt366);
					} else if (this.anInt366 > 256) {
						this.anIntArray54[local18] = this.anIntArray57[local18];
					} else {
						this.anIntArray54[local18] = this.method224(this.anIntArray57[local18], this.anIntArray55[local18], 256 - this.anInt366);
					}
				}
			} else {
				for (local18 = 0; local18 < 256; local18++) {
					this.anIntArray54[local18] = this.anIntArray55[local18];
				}
			}
			for (local18 = 0; local18 < 33920; local18++) {
				this.aClass35_22.anIntArray228[local18] = this.aClass1_Sub1_Sub2_Sub2_7.anIntArray205[local18];
			}
			@Pc(191) int local191 = 0;
			@Pc(193) int local193 = 1152;
			@Pc(208) int local208;
			@Pc(212) int local212;
			@Pc(222) int local222;
			@Pc(230) int local230;
			@Pc(234) int local234;
			@Pc(238) int local238;
			@Pc(249) int local249;
			for (@Pc(195) int local195 = 1; local195 < 255; local195++) {
				local208 = this.anIntArray36[local195] * (256 - local195) / 256;
				local212 = local208 + 22;
				if (local212 < 0) {
					local212 = 0;
				}
				local191 += local212;
				for (local222 = local212; local222 < 128; local222++) {
					local230 = this.anIntArray60[local191++];
					if (local230 == 0) {
						local193++;
					} else {
						local234 = local230;
						local238 = 256 - local230;
						local230 = this.anIntArray54[local230];
						local249 = this.aClass35_22.anIntArray228[local193];
						this.aClass35_22.anIntArray228[local193++] = ((local230 & 0xFF00FF) * local234 + (local249 & 0xFF00FF) * local238 & 0xFF00FF00) + ((local230 & 0xFF00) * local234 + (local249 & 0xFF00) * local238 & 0xFF0000) >> 8;
					}
				}
				local193 += local212;
			}
			this.aClass35_22.method517(0, 0, super.aGraphics2);
			for (local208 = 0; local208 < 33920; local208++) {
				this.aClass35_23.anIntArray228[local208] = this.aClass1_Sub1_Sub2_Sub2_8.anIntArray205[local208];
			}
			local191 = 0;
			local193 = 1176;
			for (local212 = 1; local212 < 255; local212++) {
				local222 = this.anIntArray36[local212] * (256 - local212) / 256;
				local230 = 103 - local222;
				local193 += local222;
				for (local234 = 0; local234 < local230; local234++) {
					local238 = this.anIntArray60[local191++];
					if (local238 == 0) {
						local193++;
					} else {
						local249 = local238;
						@Pc(372) int local372 = 256 - local238;
						local238 = this.anIntArray54[local238];
						@Pc(383) int local383 = this.aClass35_23.anIntArray228[local193];
						this.aClass35_23.anIntArray228[local193++] = ((local238 & 0xFF00FF) * local249 + (local383 & 0xFF00FF) * local372 & 0xFF00FF00) + ((local238 & 0xFF00) * local249 + (local383 & 0xFF00) * local372 & 0xFF0000) >> 8;
					}
				}
				local191 += 128 - local230;
				local193 += 128 - local230 - local222;
			}
			this.aClass35_23.method517(637, 0, super.aGraphics2);
		} catch (@Pc(455) RuntimeException local455) {
			signlink.reporterror("91549, " + false + ", " + local455.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method215(@OriginalArg(0) byte arg0) {
		try {
			if (this.aByte9 == 5) {
				@Pc(5) boolean local5 = false;
			} else {
				this.method88();
			}
			@Pc(14) Graphics local14 = this.method93().getGraphics();
			local14.setColor(Color.black);
			local14.fillRect(0, 0, 765, 503);
			this.method86();
			@Pc(46) byte local46;
			@Pc(52) int local52;
			if (this.aBoolean89) {
				this.aBoolean83 = false;
				local14.setFont(new Font("Helvetica", 1, 16));
				local14.setColor(Color.yellow);
				local46 = 35;
				local14.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
				local52 = local46 + 50;
				local14.setColor(Color.white);
				local14.drawString("To fix this try the following (in order):", 30, 85);
				@Pc(61) int local61 = local52 + 50;
				local14.setColor(Color.white);
				local14.setFont(new Font("Helvetica", 1, 12));
				local14.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				@Pc(78) int local78 = local61 + 30;
				local14.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
				@Pc(84) int local84 = local78 + 30;
				local14.drawString("3: Try using a different game-world", 30, 195);
				@Pc(90) int local90 = local84 + 30;
				local14.drawString("4: Try rebooting your computer", 30, 225);
				@Pc(96) int local96 = local90 + 30;
				local14.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
			}
			if (this.aBoolean69) {
				this.aBoolean83 = false;
				local14.setFont(new Font("Helvetica", 1, 20));
				local14.setColor(Color.white);
				local14.drawString("Error - unable to load game!", 50, 50);
				local14.drawString("To play RuneScape make sure you play from", 50, 100);
				local14.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean71) {
				this.aBoolean83 = false;
				local14.setColor(Color.yellow);
				local46 = 35;
				local14.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
				local52 = local46 + 50;
				local14.setColor(Color.white);
				local14.drawString("To fix this try the following (in order):", 30, 85);
				local52 += 50;
				local14.setColor(Color.white);
				local14.setFont(new Font("Helvetica", 1, 12));
				local14.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				local52 += 30;
				local14.drawString("2: Try rebooting your computer, and reloading", 30, 165);
				local52 += 30;
			}
		} catch (@Pc(184) RuntimeException local184) {
			signlink.reporterror("25415, " + arg0 + ", " + local184.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method88() {
		this.method95(20, "Starting up");
		if (signlink.sunjava) {
			super.anInt176 = 5;
		}
		if (aBoolean73) {
			this.aBoolean71 = true;
			return;
		}
		aBoolean73 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method228();
		if (local25.endsWith("jagex.com")) {
			local21 = true;
		}
		if (local25.endsWith("runescape.com")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.2")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.246")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.247")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.249")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.253")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.254")) {
			local21 = true;
		}
		if (local25.endsWith("127.0.0.1")) {
			local21 = true;
		}
		if (!local21) {
			this.aBoolean69 = true;
			return;
		}
		if (signlink.aRandomAccessFile1 != null) {
			for (@Pc(89) int local89 = 0; local89 < 5; local89++) {
				this.aClass45Array1[local89] = new Class45(500000, signlink.aRandomAccessFileArray1[local89], signlink.aRandomAccessFile1, local89 + 1, 0);
			}
		}
		try {
			this.method208();
			this.aClass47_1 = this.method173("title screen", this.anIntArray78[1], 1, 25, "title");
			this.aClass1_Sub1_Sub2_Sub4_1 = new Class1_Sub1_Sub2_Sub4(this.aClass47_1, anInt244, "p11_full", false);
			this.aClass1_Sub1_Sub2_Sub4_2 = new Class1_Sub1_Sub2_Sub4(this.aClass47_1, anInt244, "p12_full", false);
			this.aClass1_Sub1_Sub2_Sub4_3 = new Class1_Sub1_Sub2_Sub4(this.aClass47_1, anInt244, "b12_full", false);
			this.aClass1_Sub1_Sub2_Sub4_4 = new Class1_Sub1_Sub2_Sub4(this.aClass47_1, anInt244, "q8_full", true);
			this.method163();
			this.method140();
			@Pc(185) Class47 local185 = this.method173("config", this.anIntArray78[2], 2, 30, "config");
			@Pc(197) Class47 local197 = this.method173("interface", this.anIntArray78[3], 3, 35, "interface");
			@Pc(209) Class47 local209 = this.method173("2d graphics", this.anIntArray78[4], 4, 40, "media");
			@Pc(221) Class47 local221 = this.method173("textures", this.anIntArray78[6], 6, 45, "textures");
			@Pc(233) Class47 local233 = this.method173("chat system", this.anIntArray78[7], 7, 50, "wordenc");
			@Pc(245) Class47 local245 = this.method173("sound effects", this.anIntArray78[8], 8, 55, "sounds");
			this.aByteArrayArrayArray7 = new byte[4][104][104];
			this.anIntArrayArrayArray5 = new int[4][105][105];
			this.aClass37_1 = new Class37(4, this.anIntArrayArrayArray5, false, 104, 104);
			for (@Pc(270) int local270 = 0; local270 < 4; local270++) {
				this.aClass19Array1[local270] = new Class19(104, -340, 104);
			}
			this.aClass1_Sub1_Sub2_Sub2_13 = new Class1_Sub1_Sub2_Sub2(512, 512);
			@Pc(305) Class47 local305 = this.method173("update list", this.anIntArray78[5], 5, 60, "versionlist");
			this.method95(60, "Connecting to update server");
			this.aClass44_Sub1_1 = new Class44_Sub1();
			this.aClass44_Sub1_1.method628(local305, this);
			Class12.method299(this.aClass44_Sub1_1.method631());
			Class1_Sub1_Sub1_Sub5.method256(this.aClass44_Sub1_1.method630(0), this.aClass44_Sub1_1);
			if (!aBoolean77) {
				this.anInt360 = 0;
				try {
					this.anInt360 = Integer.parseInt(this.getParameter("music"));
				} catch (@Pc(346) Exception local346) {
				}
				this.aBoolean87 = false;
				this.aClass44_Sub1_1.method637(2, this.anInt360);
				while (this.aClass44_Sub1_1.method638() > 0) {
					this.method131();
					try {
						Thread.sleep(100L);
					} catch (@Pc(364) Exception local364) {
					}
				}
			}
			this.method95(65, "Requesting animations");
			@Pc(380) int local380 = this.aClass44_Sub1_1.method630(1);
			for (@Pc(382) int local382 = 0; local382 < local380; local382++) {
				this.aClass44_Sub1_1.method637(1, local382);
			}
			@Pc(401) int local401;
			while (this.aClass44_Sub1_1.method638() > 0) {
				local401 = local380 - this.aClass44_Sub1_1.method638();
				if (local401 > 0) {
					this.method95(65, "Loading animations - " + local401 * 100 / local380 + "%");
				}
				this.method131();
				try {
					Thread.sleep(100L);
				} catch (@Pc(427) Exception local427) {
				}
			}
			this.method95(70, "Requesting models");
			local380 = this.aClass44_Sub1_1.method630(0);
			@Pc(453) int local453;
			for (local401 = 0; local401 < local380; local401++) {
				local453 = this.aClass44_Sub1_1.method635(local401);
				if ((local453 & 0x1) != 0) {
					this.aClass44_Sub1_1.method637(0, local401);
				}
			}
			local380 = this.aClass44_Sub1_1.method638();
			while (this.aClass44_Sub1_1.method638() > 0) {
				local453 = local380 - this.aClass44_Sub1_1.method638();
				if (local453 > 0) {
					this.method95(70, "Loading models - " + local453 * 100 / local380 + "%");
				}
				this.method131();
				try {
					Thread.sleep(100L);
				} catch (@Pc(504) Exception local504) {
				}
			}
			if (this.aClass45Array1[0] != null) {
				this.method95(75, "Requesting maps");
				this.aClass44_Sub1_1.method637(3, this.aClass44_Sub1_1.method632(48, 0, 47));
				this.aClass44_Sub1_1.method637(3, this.aClass44_Sub1_1.method632(48, 1, 47));
				this.aClass44_Sub1_1.method637(3, this.aClass44_Sub1_1.method632(48, 0, 48));
				this.aClass44_Sub1_1.method637(3, this.aClass44_Sub1_1.method632(48, 1, 48));
				this.aClass44_Sub1_1.method637(3, this.aClass44_Sub1_1.method632(48, 0, 49));
				this.aClass44_Sub1_1.method637(3, this.aClass44_Sub1_1.method632(48, 1, 49));
				this.aClass44_Sub1_1.method637(3, this.aClass44_Sub1_1.method632(47, 0, 47));
				this.aClass44_Sub1_1.method637(3, this.aClass44_Sub1_1.method632(47, 1, 47));
				this.aClass44_Sub1_1.method637(3, this.aClass44_Sub1_1.method632(47, 0, 48));
				this.aClass44_Sub1_1.method637(3, this.aClass44_Sub1_1.method632(47, 1, 48));
				this.aClass44_Sub1_1.method637(3, this.aClass44_Sub1_1.method632(148, 0, 48));
				this.aClass44_Sub1_1.method637(3, this.aClass44_Sub1_1.method632(148, 1, 48));
				local380 = this.aClass44_Sub1_1.method638();
				while (this.aClass44_Sub1_1.method638() > 0) {
					local453 = local380 - this.aClass44_Sub1_1.method638();
					if (local453 > 0) {
						this.method95(75, "Loading maps - " + local453 * 100 / local380 + "%");
					}
					this.method131();
					try {
						Thread.sleep(100L);
					} catch (@Pc(689) Exception local689) {
					}
				}
			}
			local380 = this.aClass44_Sub1_1.method630(0);
			@Pc(710) int local710;
			for (local453 = 0; local453 < local380; local453++) {
				local710 = this.aClass44_Sub1_1.method635(local453);
				@Pc(712) byte local712 = 0;
				if ((local710 & 0x8) != 0) {
					local712 = 10;
				} else if ((local710 & 0x20) != 0) {
					local712 = 9;
				} else if ((local710 & 0x10) != 0) {
					local712 = 8;
				} else if ((local710 & 0x40) != 0) {
					local712 = 7;
				} else if ((local710 & 0x80) != 0) {
					local712 = 6;
				} else if ((local710 & 0x2) != 0) {
					local712 = 5;
				} else if ((local710 & 0x4) != 0) {
					local712 = 4;
				}
				if ((local710 & 0x1) != 0) {
					local712 = 3;
				}
				if (local712 != 0) {
					this.aClass44_Sub1_1.method640(0, local453, local712);
				}
			}
			this.aClass44_Sub1_1.method633(aBoolean76, 733);
			if (!aBoolean77) {
				local380 = this.aClass44_Sub1_1.method630(2);
				for (local710 = 1; local710 < local380; local710++) {
					if (this.aClass44_Sub1_1.method636(local710)) {
						this.aClass44_Sub1_1.method640(2, local710, (byte) 1);
					}
				}
			}
			this.method95(80, "Unpacking media");
			this.aClass1_Sub1_Sub2_Sub3_1 = new Class1_Sub1_Sub2_Sub3(local209, "invback", 0);
			this.aClass1_Sub1_Sub2_Sub3_3 = new Class1_Sub1_Sub2_Sub3(local209, "chatback", 0);
			this.aClass1_Sub1_Sub2_Sub3_2 = new Class1_Sub1_Sub2_Sub3(local209, "mapback", 0);
			this.aClass1_Sub1_Sub2_Sub3_11 = new Class1_Sub1_Sub2_Sub3(local209, "backbase1", 0);
			this.aClass1_Sub1_Sub2_Sub3_12 = new Class1_Sub1_Sub2_Sub3(local209, "backbase2", 0);
			this.aClass1_Sub1_Sub2_Sub3_13 = new Class1_Sub1_Sub2_Sub3(local209, "backhmid1", 0);
			for (local710 = 0; local710 < 13; local710++) {
				this.aClass1_Sub1_Sub2_Sub3Array2[local710] = new Class1_Sub1_Sub2_Sub3(local209, "sideicons", local710);
			}
			this.aClass1_Sub1_Sub2_Sub2_4 = new Class1_Sub1_Sub2_Sub2(local209, "compass", 0);
			this.aClass1_Sub1_Sub2_Sub2_1 = new Class1_Sub1_Sub2_Sub2(local209, "mapedge", 0);
			this.aClass1_Sub1_Sub2_Sub2_1.method384();
			@Pc(912) int local912;
			try {
				for (local912 = 0; local912 < 100; local912++) {
					this.aClass1_Sub1_Sub2_Sub3Array1[local912] = new Class1_Sub1_Sub2_Sub3(local209, "mapscene", local912);
				}
			} catch (@Pc(930) Exception local930) {
			}
			try {
				for (local912 = 0; local912 < 100; local912++) {
					this.aClass1_Sub1_Sub2_Sub2Array4[local912] = new Class1_Sub1_Sub2_Sub2(local209, "mapfunction", local912);
				}
			} catch (@Pc(950) Exception local950) {
			}
			try {
				for (local912 = 0; local912 < 20; local912++) {
					this.aClass1_Sub1_Sub2_Sub2Array6[local912] = new Class1_Sub1_Sub2_Sub2(local209, "hitmarks", local912);
				}
			} catch (@Pc(970) Exception local970) {
			}
			try {
				for (local912 = 0; local912 < 20; local912++) {
					this.aClass1_Sub1_Sub2_Sub2Array7[local912] = new Class1_Sub1_Sub2_Sub2(local209, "headicons", local912);
				}
			} catch (@Pc(990) Exception local990) {
			}
			this.aClass1_Sub1_Sub2_Sub2_5 = new Class1_Sub1_Sub2_Sub2(local209, "mapmarker", 0);
			this.aClass1_Sub1_Sub2_Sub2_6 = new Class1_Sub1_Sub2_Sub2(local209, "mapmarker", 1);
			for (local912 = 0; local912 < 8; local912++) {
				this.aClass1_Sub1_Sub2_Sub2Array5[local912] = new Class1_Sub1_Sub2_Sub2(local209, "cross", local912);
			}
			this.aClass1_Sub1_Sub2_Sub2_9 = new Class1_Sub1_Sub2_Sub2(local209, "mapdots", 0);
			this.aClass1_Sub1_Sub2_Sub2_10 = new Class1_Sub1_Sub2_Sub2(local209, "mapdots", 1);
			this.aClass1_Sub1_Sub2_Sub2_11 = new Class1_Sub1_Sub2_Sub2(local209, "mapdots", 2);
			this.aClass1_Sub1_Sub2_Sub2_12 = new Class1_Sub1_Sub2_Sub2(local209, "mapdots", 3);
			this.aClass1_Sub1_Sub2_Sub3_19 = new Class1_Sub1_Sub2_Sub3(local209, "scrollbar", 0);
			this.aClass1_Sub1_Sub2_Sub3_20 = new Class1_Sub1_Sub2_Sub3(local209, "scrollbar", 1);
			this.aClass1_Sub1_Sub2_Sub3_4 = new Class1_Sub1_Sub2_Sub3(local209, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_5 = new Class1_Sub1_Sub2_Sub3(local209, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_6 = new Class1_Sub1_Sub2_Sub3(local209, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_7 = new Class1_Sub1_Sub2_Sub3(local209, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_7.method411();
			this.aClass1_Sub1_Sub2_Sub3_8 = new Class1_Sub1_Sub2_Sub3(local209, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_8.method411();
			this.aClass1_Sub1_Sub2_Sub3_14 = new Class1_Sub1_Sub2_Sub3(local209, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_14.method412();
			this.aClass1_Sub1_Sub2_Sub3_15 = new Class1_Sub1_Sub2_Sub3(local209, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_15.method412();
			this.aClass1_Sub1_Sub2_Sub3_16 = new Class1_Sub1_Sub2_Sub3(local209, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_16.method412();
			this.aClass1_Sub1_Sub2_Sub3_17 = new Class1_Sub1_Sub2_Sub3(local209, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_17.method411();
			this.aClass1_Sub1_Sub2_Sub3_17.method412();
			this.aClass1_Sub1_Sub2_Sub3_18 = new Class1_Sub1_Sub2_Sub3(local209, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_18.method411();
			this.aClass1_Sub1_Sub2_Sub3_18.method412();
			for (@Pc(1190) int local1190 = 0; local1190 < 2; local1190++) {
				this.aClass1_Sub1_Sub2_Sub3Array3[local1190] = new Class1_Sub1_Sub2_Sub3(local209, "mod_icons", local1190);
			}
			@Pc(1213) Class1_Sub1_Sub2_Sub2 local1213 = new Class1_Sub1_Sub2_Sub2(local209, "backleft1", 0);
			this.aClass35_7 = new Class35(local1213.anInt625, false, this.method93(), local1213.anInt626);
			local1213.method385(0, 0);
			@Pc(1238) Class1_Sub1_Sub2_Sub2 local1238 = new Class1_Sub1_Sub2_Sub2(local209, "backleft2", 0);
			this.aClass35_8 = new Class35(local1238.anInt625, false, this.method93(), local1238.anInt626);
			local1238.method385(0, 0);
			@Pc(1263) Class1_Sub1_Sub2_Sub2 local1263 = new Class1_Sub1_Sub2_Sub2(local209, "backright1", 0);
			this.aClass35_9 = new Class35(local1263.anInt625, false, this.method93(), local1263.anInt626);
			local1263.method385(0, 0);
			@Pc(1288) Class1_Sub1_Sub2_Sub2 local1288 = new Class1_Sub1_Sub2_Sub2(local209, "backright2", 0);
			this.aClass35_10 = new Class35(local1288.anInt625, false, this.method93(), local1288.anInt626);
			local1288.method385(0, 0);
			@Pc(1313) Class1_Sub1_Sub2_Sub2 local1313 = new Class1_Sub1_Sub2_Sub2(local209, "backtop1", 0);
			this.aClass35_11 = new Class35(local1313.anInt625, false, this.method93(), local1313.anInt626);
			local1313.method385(0, 0);
			@Pc(1338) Class1_Sub1_Sub2_Sub2 local1338 = new Class1_Sub1_Sub2_Sub2(local209, "backvmid1", 0);
			this.aClass35_12 = new Class35(local1338.anInt625, false, this.method93(), local1338.anInt626);
			local1338.method385(0, 0);
			@Pc(1363) Class1_Sub1_Sub2_Sub2 local1363 = new Class1_Sub1_Sub2_Sub2(local209, "backvmid2", 0);
			this.aClass35_13 = new Class35(local1363.anInt625, false, this.method93(), local1363.anInt626);
			local1363.method385(0, 0);
			@Pc(1388) Class1_Sub1_Sub2_Sub2 local1388 = new Class1_Sub1_Sub2_Sub2(local209, "backvmid3", 0);
			this.aClass35_14 = new Class35(local1388.anInt625, false, this.method93(), local1388.anInt626);
			local1388.method385(0, 0);
			@Pc(1413) Class1_Sub1_Sub2_Sub2 local1413 = new Class1_Sub1_Sub2_Sub2(local209, "backhmid2", 0);
			this.aClass35_15 = new Class35(local1413.anInt625, false, this.method93(), local1413.anInt626);
			local1413.method385(0, 0);
			@Pc(1438) int local1438 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1445) int local1445 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1452) int local1452 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1459) int local1459 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1461) int local1461 = 0; local1461 < 100; local1461++) {
				if (this.aClass1_Sub1_Sub2_Sub2Array4[local1461] != null) {
					this.aClass1_Sub1_Sub2_Sub2Array4[local1461].method383(local1438 + local1459, local1445 + local1459, local1452 + local1459);
				}
				if (this.aClass1_Sub1_Sub2_Sub3Array1[local1461] != null) {
					this.aClass1_Sub1_Sub2_Sub3Array1[local1461].method413(local1438 + local1459, local1445 + local1459, local1452 + local1459);
				}
			}
			this.method95(83, "Unpacking textures");
			Class1_Sub1_Sub2_Sub1.method343(local221);
			Class1_Sub1_Sub2_Sub1.method347(0.8D);
			Class1_Sub1_Sub2_Sub1.method342();
			this.method95(86, "Unpacking config");
			Class27.method497(local185);
			Class9.method284(local185);
			Class21.method454(local185);
			Class15.method355(local185);
			Class13.method318(local185);
			Class23.method488(645, local185);
			Class33.method513(local185);
			Class39.method581(local185);
			Class36.method519(645, local185);
			Class15.aBoolean170 = aBoolean76;
			if (!aBoolean77) {
				this.method95(90, "Unpacking sounds");
				@Pc(1564) byte[] local1564 = local245.method658("sounds.dat", null);
				@Pc(1570) Class1_Sub1_Sub3 local1570 = new Class1_Sub1_Sub3((byte) 3, local1564);
				Class5.method77(645, local1570);
			}
			this.method95(95, "Unpacking interfaces");
			@Pc(1601) Class1_Sub1_Sub2_Sub4[] local1601 = new Class1_Sub1_Sub2_Sub4[] { this.aClass1_Sub1_Sub2_Sub4_1, this.aClass1_Sub1_Sub2_Sub4_2, this.aClass1_Sub1_Sub2_Sub4_3, this.aClass1_Sub1_Sub2_Sub4_4 };
			Class6.method229(local209, local197, local1601);
			this.method95(100, "Preparing game engine");
			@Pc(1617) int local1617;
			@Pc(1619) int local1619;
			@Pc(1621) int local1621;
			for (@Pc(1613) int local1613 = 0; local1613 < 33; local1613++) {
				local1617 = 999;
				local1619 = 0;
				for (local1621 = 0; local1621 < 34; local1621++) {
					if (this.aClass1_Sub1_Sub2_Sub3_2.aByteArray7[local1621 + local1613 * this.aClass1_Sub1_Sub2_Sub3_2.anInt649] == 0) {
						if (local1617 == 999) {
							local1617 = local1621;
						}
					} else if (local1617 != 999) {
						local1619 = local1621;
						break;
					}
				}
				this.anIntArray39[local1613] = local1617;
				this.anIntArray66[local1613] = local1619 - local1617;
			}
			@Pc(1679) int local1679;
			for (local1617 = 5; local1617 < 156; local1617++) {
				local1619 = 999;
				local1621 = 0;
				for (local1679 = 25; local1679 < 172; local1679++) {
					if (this.aClass1_Sub1_Sub2_Sub3_2.aByteArray7[local1679 + local1617 * this.aClass1_Sub1_Sub2_Sub3_2.anInt649] == 0 && (local1679 > 34 || local1617 > 34)) {
						if (local1619 == 999) {
							local1619 = local1679;
						}
					} else if (local1619 != 999) {
						local1621 = local1679;
						break;
					}
				}
				this.anIntArray52[local1617 - 5] = local1619 - 25;
				this.anIntArray45[local1617 - 5] = local1621 - local1619;
			}
			Class1_Sub1_Sub2_Sub1.method340(479, 96, 573);
			this.anIntArray86 = Class1_Sub1_Sub2_Sub1.anIntArray177;
			Class1_Sub1_Sub2_Sub1.method340(190, 261, 573);
			this.anIntArray87 = Class1_Sub1_Sub2_Sub1.anIntArray177;
			Class1_Sub1_Sub2_Sub1.method340(512, 334, 573);
			this.anIntArray88 = Class1_Sub1_Sub2_Sub1.anIntArray177;
			@Pc(1763) int[] local1763 = new int[9];
			for (local1621 = 0; local1621 < 9; local1621++) {
				local1679 = local1621 * 32 + 128 + 15;
				@Pc(1781) int local1781 = local1679 * 3 + 600;
				@Pc(1785) int local1785 = Class1_Sub1_Sub2_Sub1.anIntArray175[local1679];
				local1763[local1621] = local1781 * local1785 >> 16;
			}
			Class37.method558(local1763);
			Class42.method586(local233);
			this.aClass11_1 = new Class11(this, anInt223);
			this.method94(this.aClass11_1, 10);
		} catch (@Pc(1820) Exception local1820) {
			signlink.reporterror("loaderror " + this.aString17 + " " + this.anInt301);
			this.aBoolean89 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
	private void method216(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean83 = false;
			while (this.aBoolean79) {
				this.aBoolean83 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(13) Exception local13) {
				}
			}
			this.aClass1_Sub1_Sub2_Sub3_9 = null;
			this.aClass1_Sub1_Sub2_Sub3_10 = null;
			this.aClass1_Sub1_Sub2_Sub3Array4 = null;
			this.anIntArray54 = null;
			this.anIntArray55 = null;
			this.anIntArray56 = null;
			this.anIntArray57 = null;
			this.anIntArray34 = null;
			this.anIntArray35 = null;
			this.anIntArray60 = null;
			this.anIntArray61 = null;
			this.aClass1_Sub1_Sub2_Sub2_7 = null;
			while (arg0 >= 0) {
				this.aClass1_Sub1_Sub3_2.method462(241);
			}
			this.aClass1_Sub1_Sub2_Sub2_8 = null;
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("2708, " + arg0 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
	private void method217() {
		try {
			signlink.anInt918 = 0;
			signlink.midi = "stop";
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("74175, " + 0 + ", " + local14.toString());
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
				return new URL("http://127.0.0.1:" + (anInt315 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ILclient!lb;I)V")
	private void method218(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			arg0.method482(this.anInt380);
			@Pc(8) int local8 = arg0.method483(1);
			if (local8 != 0) {
				@Pc(25) int local25 = arg0.method483(2);
				if (local25 == 0) {
					this.anIntArray90[this.anInt391++] = this.anInt389;
				} else {
					@Pc(48) int local48;
					@Pc(58) int local58;
					if (local25 == 1) {
						local48 = arg0.method483(3);
						aClass1_Sub1_Sub1_Sub1_Sub1_1.method671(local48, false);
						local58 = arg0.method483(1);
						if (local58 == 1) {
							this.anIntArray90[this.anInt391++] = this.anInt389;
						}
					} else {
						@Pc(102) int local102;
						if (local25 == 2) {
							local48 = arg0.method483(3);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method671(local48, true);
							local58 = arg0.method483(3);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method671(local58, true);
							local102 = arg0.method483(1);
							if (local102 == 1) {
								this.anIntArray90[this.anInt391++] = this.anInt389;
							}
						} else if (local25 == 3) {
							this.anInt386 = arg0.method483(2);
							local48 = arg0.method483(7);
							local58 = arg0.method483(7);
							local102 = arg0.method483(1);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method670(local48, local102 == 1, local58);
							@Pc(158) int local158 = arg0.method483(1);
							if (local158 == 1) {
								this.anIntArray90[this.anInt391++] = this.anInt389;
							}
						}
					}
				}
			}
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("98696, " + 387 + ", " + arg0 + ", " + arg1 + ", " + local175.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
	private void method219() {
		try {
			if (super.anInt187 == 1) {
				if (super.anInt188 >= 6 && super.anInt188 <= 106 && super.anInt189 >= 467 && super.anInt189 <= 499) {
					this.anInt260 = (this.anInt260 + 1) % 4;
					this.aBoolean81 = true;
					this.aBoolean68 = true;
					this.aClass1_Sub1_Sub3_2.method461(129);
					this.aClass1_Sub1_Sub3_2.method462(this.anInt260);
					this.aClass1_Sub1_Sub3_2.method462(this.anInt224);
					this.aClass1_Sub1_Sub3_2.method462(this.anInt348);
				}
				if (super.anInt188 >= 135 && super.anInt188 <= 235 && super.anInt189 >= 467 && super.anInt189 <= 499) {
					this.anInt224 = (this.anInt224 + 1) % 3;
					this.aBoolean81 = true;
					this.aBoolean68 = true;
					this.aClass1_Sub1_Sub3_2.method461(129);
					this.aClass1_Sub1_Sub3_2.method462(this.anInt260);
					this.aClass1_Sub1_Sub3_2.method462(this.anInt224);
					this.aClass1_Sub1_Sub3_2.method462(this.anInt348);
				}
				if (super.anInt188 >= 273 && super.anInt188 <= 373 && super.anInt189 >= 467 && super.anInt189 <= 499) {
					this.anInt348 = (this.anInt348 + 1) % 3;
					this.aBoolean81 = true;
					this.aBoolean68 = true;
					this.aClass1_Sub1_Sub3_2.method461(129);
					this.aClass1_Sub1_Sub3_2.method462(this.anInt260);
					this.aClass1_Sub1_Sub3_2.method462(this.anInt224);
					this.aClass1_Sub1_Sub3_2.method462(this.anInt348);
				}
				if (super.anInt188 >= 412 && super.anInt188 <= 512 && super.anInt189 >= 467 && super.anInt189 <= 499) {
					this.method124();
					this.aString8 = "";
					this.aBoolean60 = false;
					for (@Pc(187) int local187 = 0; local187 < Class6.aClass6Array1.length; local187++) {
						if (Class6.aClass6Array1[local187] != null && Class6.aClass6Array1[local187].anInt410 == 600) {
							this.anInt371 = this.anInt322 = Class6.aClass6Array1[local187].anInt407;
							return;
						}
					}
					return;
				}
			}
		} catch (@Pc(216) RuntimeException local216) {
			signlink.reporterror("88324, " + -44 + ", " + local216.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method90() {
		try {
			signlink.reporterror = false;
			try {
				if (this.aClass8_1 != null) {
					this.aClass8_1.method245();
				}
			} catch (@Pc(11) Exception local11) {
			}
			this.aClass8_1 = null;
			this.method217();
			if (this.aClass11_1 != null) {
				this.aClass11_1.aBoolean147 = false;
			}
			this.aClass11_1 = null;
			this.aClass44_Sub1_1.method629();
			this.aClass44_Sub1_1 = null;
			this.aClass1_Sub1_Sub3_2 = null;
			this.aClass1_Sub1_Sub3_4 = null;
			this.aClass1_Sub1_Sub3_3 = null;
			this.anIntArray40 = null;
			this.aByteArrayArray1 = null;
			this.aByteArrayArray2 = null;
			this.anIntArray41 = null;
			this.anIntArray42 = null;
			this.anIntArrayArrayArray5 = null;
			this.aByteArrayArrayArray7 = null;
			this.aClass37_1 = null;
			this.aClass19Array1 = null;
			this.anIntArrayArray4 = null;
			this.anIntArrayArray3 = null;
			this.anIntArray49 = null;
			this.anIntArray50 = null;
			this.aByteArray2 = null;
			this.aClass35_3 = null;
			this.aClass35_4 = null;
			this.aClass35_5 = null;
			this.aClass35_6 = null;
			this.aClass35_16 = null;
			this.aClass35_17 = null;
			this.aClass35_18 = null;
			this.aClass35_7 = null;
			this.aClass35_8 = null;
			this.aClass35_9 = null;
			this.aClass35_10 = null;
			this.aClass35_11 = null;
			this.aClass35_12 = null;
			this.aClass35_13 = null;
			this.aClass35_14 = null;
			this.aClass35_15 = null;
			this.aClass1_Sub1_Sub2_Sub3_1 = null;
			this.aClass1_Sub1_Sub2_Sub3_2 = null;
			this.aClass1_Sub1_Sub2_Sub3_3 = null;
			this.aClass1_Sub1_Sub2_Sub3_11 = null;
			this.aClass1_Sub1_Sub2_Sub3_12 = null;
			this.aClass1_Sub1_Sub2_Sub3_13 = null;
			this.aClass1_Sub1_Sub2_Sub3Array2 = null;
			this.aClass1_Sub1_Sub2_Sub3_4 = null;
			this.aClass1_Sub1_Sub2_Sub3_5 = null;
			this.aClass1_Sub1_Sub2_Sub3_6 = null;
			this.aClass1_Sub1_Sub2_Sub3_7 = null;
			this.aClass1_Sub1_Sub2_Sub3_8 = null;
			this.aClass1_Sub1_Sub2_Sub3_14 = null;
			this.aClass1_Sub1_Sub2_Sub3_15 = null;
			this.aClass1_Sub1_Sub2_Sub3_16 = null;
			this.aClass1_Sub1_Sub2_Sub3_17 = null;
			this.aClass1_Sub1_Sub2_Sub3_18 = null;
			this.aClass1_Sub1_Sub2_Sub2_4 = null;
			this.aClass1_Sub1_Sub2_Sub2Array6 = null;
			this.aClass1_Sub1_Sub2_Sub2Array7 = null;
			this.aClass1_Sub1_Sub2_Sub2Array5 = null;
			this.aClass1_Sub1_Sub2_Sub2_9 = null;
			this.aClass1_Sub1_Sub2_Sub2_10 = null;
			this.aClass1_Sub1_Sub2_Sub2_11 = null;
			this.aClass1_Sub1_Sub2_Sub2_12 = null;
			this.aClass1_Sub1_Sub2_Sub3Array1 = null;
			this.aClass1_Sub1_Sub2_Sub2Array4 = null;
			this.anIntArrayArray6 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub1Array1 = null;
			this.anIntArray89 = null;
			this.anIntArray90 = null;
			this.aClass1_Sub1_Sub3Array1 = null;
			this.anIntArray67 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub2Array1 = null;
			this.anIntArray77 = null;
			this.aClass29ArrayArrayArray1 = null;
			this.aClass29_1 = null;
			this.aClass29_2 = null;
			this.aClass29_3 = null;
			this.anIntArray79 = null;
			this.anIntArray80 = null;
			this.anIntArray81 = null;
			this.anIntArray82 = null;
			this.aStringArray6 = null;
			this.anIntArray51 = null;
			this.anIntArray83 = null;
			this.anIntArray84 = null;
			this.aClass1_Sub1_Sub2_Sub2Array3 = null;
			this.aClass1_Sub1_Sub2_Sub2_13 = null;
			this.aStringArray3 = null;
			this.aLongArray3 = null;
			this.anIntArray48 = null;
			this.aClass35_22 = null;
			this.aClass35_23 = null;
			this.aClass35_19 = null;
			this.aClass35_20 = null;
			this.aClass35_21 = null;
			this.aClass35_24 = null;
			this.aClass35_25 = null;
			this.aClass35_26 = null;
			this.aClass35_27 = null;
			this.method216(this.anInt237);
			Class9.method285();
			Class13.method319();
			Class15.method356((byte) 5);
			Class21.aClass21Array1 = null;
			Class23.aClass23Array1 = null;
			Class6.aClass6Array1 = null;
			Class25.aClass25Array1 = null;
			Class27.aClass27Array1 = null;
			Class33.aClass33Array1 = null;
			Class33.aClass40_9 = null;
			Class39.aClass39Array1 = null;
			super.aClass35_2 = null;
			Class1_Sub1_Sub1_Sub1_Sub1.aClass40_1 = null;
			Class1_Sub1_Sub2_Sub1.method338();
			Class37.method521();
			Class1_Sub1_Sub1_Sub5.method255();
			Class12.method301((byte) 5);
			System.gc();
		} catch (@Pc(368) RuntimeException local368) {
			signlink.reporterror("92991, " + 0 + ", " + local368.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method220(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString12 = "";
				this.aString13 = "Connecting to server...";
				this.method139(true);
			}
			this.aClass8_1 = new Class8(this, 557, this.method204(anInt315 + 43594));
			@Pc(30) long local30 = Class48.method659(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass1_Sub1_Sub3_2.anInt715 = 0;
			this.aClass1_Sub1_Sub3_2.method462(14);
			this.aClass1_Sub1_Sub3_2.method462(local37);
			this.aClass8_1.method249(2, this.aClass1_Sub1_Sub3_2.aByteArray9);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass8_1.method246();
			}
			@Pc(74) int local74 = this.aClass8_1.method246();
			@Pc(223) int local223;
			@Pc(257) int local257;
			if (local74 == 0) {
				this.aClass8_1.method248(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 8);
				this.aClass1_Sub1_Sub3_3.anInt715 = 0;
				this.aLong14 = this.aClass1_Sub1_Sub3_3.method478();
				@Pc(97) int[] local97 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong14 >> 32), (int) this.aLong14 };
				this.aClass1_Sub1_Sub3_2.anInt715 = 0;
				this.aClass1_Sub1_Sub3_2.method462(10);
				this.aClass1_Sub1_Sub3_2.method466(local97[0]);
				this.aClass1_Sub1_Sub3_2.method466(local97[1]);
				this.aClass1_Sub1_Sub3_2.method466(local97[2]);
				this.aClass1_Sub1_Sub3_2.method466(local97[3]);
				this.aClass1_Sub1_Sub3_2.method466(signlink.anInt912);
				this.aClass1_Sub1_Sub3_2.method469(arg0);
				this.aClass1_Sub1_Sub3_2.method469(arg1);
				this.aClass1_Sub1_Sub3_2.method487(aBigInteger2, aBigInteger1);
				this.aClass1_Sub1_Sub3_4.anInt715 = 0;
				if (arg2) {
					this.aClass1_Sub1_Sub3_4.method462(18);
				} else {
					this.aClass1_Sub1_Sub3_4.method462(16);
				}
				this.aClass1_Sub1_Sub3_4.method462(this.aClass1_Sub1_Sub3_2.anInt715 + 36 + 1 + 1 + 2);
				this.aClass1_Sub1_Sub3_4.method462(255);
				this.aClass1_Sub1_Sub3_4.method463(270);
				this.aClass1_Sub1_Sub3_4.method462(aBoolean77 ? 1 : 0);
				for (local223 = 0; local223 < 9; local223++) {
					this.aClass1_Sub1_Sub3_4.method466(this.anIntArray78[local223]);
				}
				this.aClass1_Sub1_Sub3_4.method470(this.aClass1_Sub1_Sub3_2.aByteArray9, this.aClass1_Sub1_Sub3_2.anInt715);
				this.aClass1_Sub1_Sub3_2.aClass46_2 = new Class46(0, local97);
				for (local257 = 0; local257 < 4; local257++) {
					local97[local257] += 50;
				}
				this.aClass46_1 = new Class46(0, local97);
				this.aClass8_1.method249(this.aClass1_Sub1_Sub3_4.anInt715, this.aClass1_Sub1_Sub3_4.aByteArray9);
				local74 = this.aClass8_1.method246();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(299) Exception local299) {
				}
				this.method220(arg0, arg1, arg2);
			} else {
				@Pc(387) int local387;
				if (local74 == 2) {
					this.anInt361 = this.aClass8_1.method246();
					aBoolean55 = this.aClass8_1.method246() == 1;
					this.aLong16 = 0L;
					this.anInt256 = 0;
					this.aClass11_1.anInt512 = 0;
					super.aBoolean52 = true;
					this.aBoolean92 = true;
					this.aBoolean80 = true;
					this.aClass1_Sub1_Sub3_2.anInt715 = 0;
					this.aClass1_Sub1_Sub3_3.anInt715 = 0;
					this.anInt205 = -1;
					this.anInt284 = -1;
					this.anInt285 = -1;
					this.anInt286 = -1;
					this.anInt204 = 0;
					this.anInt206 = 0;
					this.anInt282 = 0;
					this.anInt208 = 0;
					this.anInt267 = 0;
					this.anInt222 = 0;
					this.aBoolean74 = false;
					super.anInt180 = 0;
					for (local387 = 0; local387 < 100; local387++) {
						this.aStringArray2[local387] = null;
					}
					this.anInt215 = 0;
					this.anInt199 = 0;
					this.anInt326 = 0;
					this.anInt247 = 0;
					this.anInt362 = (int) (Math.random() * 100.0D) - 50;
					this.anInt274 = (int) (Math.random() * 110.0D) - 55;
					this.anInt368 = (int) (Math.random() * 80.0D) - 40;
					this.anInt383 = (int) (Math.random() * 120.0D) - 60;
					this.anInt294 = (int) (Math.random() * 30.0D) - 20;
					this.anInt212 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt193 = -1;
					this.anInt358 = 0;
					this.anInt359 = 0;
					this.anInt390 = 0;
					this.anInt357 = 0;
					for (local223 = 0; local223 < this.anInt388; local223++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local223] = null;
						this.aClass1_Sub1_Sub3Array1[local223] = null;
					}
					for (local257 = 0; local257 < 16384; local257++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local257] = null;
					}
					aClass1_Sub1_Sub1_Sub1_Sub1_1 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anInt389] = new Class1_Sub1_Sub1_Sub1_Sub1();
					this.aClass29_2.method507();
					this.aClass29_3.method507();
					@Pc(529) int local529;
					@Pc(533) int local533;
					for (@Pc(525) int local525 = 0; local525 < 4; local525++) {
						for (local529 = 0; local529 < 104; local529++) {
							for (local533 = 0; local533 < 104; local533++) {
								this.aClass29ArrayArrayArray1[local525][local529][local533] = null;
							}
						}
					}
					this.aClass29_1 = new Class29((byte) 5);
					this.anInt291 = 0;
					this.anInt290 = 0;
					this.anInt387 = -1;
					this.anInt316 = -1;
					this.anInt322 = -1;
					this.anInt364 = -1;
					this.anInt328 = -1;
					this.aBoolean57 = false;
					this.anInt323 = 3;
					this.aBoolean97 = false;
					this.aBoolean74 = false;
					this.aBoolean70 = false;
					this.aString16 = null;
					this.anInt346 = 0;
					this.anInt246 = -1;
					this.aBoolean63 = true;
					this.method125((byte) 3);
					for (local529 = 0; local529 < 5; local529++) {
						this.anIntArray85[local529] = 0;
					}
					for (local533 = 0; local533 < 5; local533++) {
						this.aStringArray4[local533] = null;
						this.aBooleanArray3[local533] = false;
					}
					anInt250 = 0;
					anInt259 = 0;
					anInt320 = 0;
					anInt266 = 0;
					anInt340 = 0;
					anInt303 = 0;
					anInt351 = 0;
					anInt251 = 0;
					anInt401 = 0;
					this.method162();
				} else if (local74 == 3) {
					this.aString12 = "";
					this.aString13 = "Invalid username or password.";
				} else if (local74 == 4) {
					this.aString12 = "Your account has been disabled.";
					this.aString13 = "Please check your message-centre for details.";
				} else if (local74 == 5) {
					this.aString12 = "Your account is already logged in.";
					this.aString13 = "Try again in 60 secs...";
				} else if (local74 == 6) {
					this.aString12 = "RuneScape has been updated!";
					this.aString13 = "Please reload this page.";
				} else if (local74 == 7) {
					this.aString12 = "This world is full.";
					this.aString13 = "Please use a different world.";
				} else if (local74 == 8) {
					this.aString12 = "Unable to connect.";
					this.aString13 = "Login server offline.";
				} else if (local74 == 9) {
					this.aString12 = "Login limit exceeded.";
					this.aString13 = "Too many connections from your address.";
				} else if (local74 == 10) {
					this.aString12 = "Unable to connect.";
					this.aString13 = "Bad session id.";
				} else if (local74 == 11) {
					this.aString13 = "Login server rejected session.";
					this.aString13 = "Please try again.";
				} else if (local74 == 12) {
					this.aString12 = "You need a members account to login to this world.";
					this.aString13 = "Please subscribe, or use a different world.";
				} else if (local74 == 13) {
					this.aString12 = "Could not complete login.";
					this.aString13 = "Please try using a different world.";
				} else if (local74 == 14) {
					this.aString12 = "The server is being updated.";
					this.aString13 = "Please wait 1 minute and try again.";
				} else if (local74 == 15) {
					this.aBoolean80 = true;
					this.aClass1_Sub1_Sub3_2.anInt715 = 0;
					this.aClass1_Sub1_Sub3_3.anInt715 = 0;
					this.anInt205 = -1;
					this.anInt284 = -1;
					this.anInt285 = -1;
					this.anInt286 = -1;
					this.anInt204 = 0;
					this.anInt206 = 0;
					this.anInt282 = 0;
					this.anInt222 = 0;
					this.aBoolean74 = false;
					this.aLong18 = System.currentTimeMillis();
				} else if (local74 == 16) {
					this.aString12 = "Login attempts exceeded.";
					this.aString13 = "Please wait 1 minute and try again.";
				} else if (local74 == 17) {
					this.aString12 = "You are standing in a members-only area.";
					this.aString13 = "To play on this world move to a free area first";
				} else if (local74 == 20) {
					this.aString12 = "Invalid loginserver requested";
					this.aString13 = "Please try using a different world.";
				} else if (local74 == 21) {
					for (local387 = this.aClass8_1.method246(); local387 >= 0; local387--) {
						this.aString12 = "You have only just left another world";
						this.aString13 = "Your profile will be transferred in: " + local387 + " seconds";
						this.method139(true);
						try {
							Thread.sleep(1000L);
						} catch (@Pc(894) Exception local894) {
						}
					}
					this.method220(arg0, arg1, arg2);
				} else if (local74 == -1) {
					this.aString12 = "No response from server";
					this.aString13 = "Please try using a different world.";
				} else {
					System.out.println("response:" + local74);
					this.aString12 = "Unexpected server response";
					this.aString13 = "Please try using a different world.";
				}
			}
		} catch (@Pc(930) IOException local930) {
			this.aString12 = "";
			this.aString13 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method221() {
		try {
			@Pc(2) int local2 = this.anInt262;
			@Pc(5) int local5 = this.anInt263;
			@Pc(8) int local8 = this.anInt264;
			@Pc(11) int local11 = this.anInt265;
			Class1_Sub1_Sub2.method435(6116423, local8, local5, local11, local2);
			Class1_Sub1_Sub2.method435(0, local8 - 2, local5 + 1, 16, local2 + 1);
			Class1_Sub1_Sub2.method436(local8 - 2, local11 - 19, local2 + 1, local5 + 18, 0);
			this.aClass1_Sub1_Sub2_Sub4_3.method445(local2 + 3, 474, 6116423, "Choose Option", local5 + 14);
			@Pc(68) int local68 = super.anInt182;
			@Pc(71) int local71 = super.anInt183;
			if (this.anInt261 == 0) {
				local68 -= 4;
				local71 -= 4;
			}
			if (this.anInt261 == 1) {
				local68 -= 553;
				local71 -= 205;
			}
			if (this.anInt261 == 2) {
				local68 -= 17;
				local71 -= 357;
			}
			for (@Pc(90) int local90 = 0; local90 < this.anInt222; local90++) {
				@Pc(105) int local105 = local5 + (this.anInt222 - 1 - local90) * 15 + 31;
				@Pc(107) int local107 = 16777215;
				if (local68 > local2 && local68 < local2 + local8 && local71 > local105 - 13 && local71 < local105 + 3) {
					local107 = 16776960;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method447(this.aStringArray6[local90], local105, local107, local2 + 3, true);
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("21591, " + false + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
	private void method222() {
		try {
			@Pc(19) int local19;
			@Pc(26) int local26;
			if (this.anInt258 == 0) {
				local19 = super.anInt178 / 2 - 80;
				local26 = super.anInt179 / 2 + 20;
				local26 += 20;
				if (super.anInt187 == 1 && super.anInt188 >= local19 - 75 && super.anInt188 <= local19 + 75 && super.anInt189 >= local26 - 20 && super.anInt189 <= local26 + 20) {
					this.anInt258 = 3;
					this.anInt321 = 0;
				}
				local19 = super.anInt178 / 2 + 80;
				if (super.anInt187 == 1 && super.anInt188 >= local19 - 75 && super.anInt188 <= local19 + 75 && super.anInt189 >= local26 - 20 && super.anInt189 <= local26 + 20) {
					this.aString12 = "";
					this.aString13 = "Enter your username & password.";
					this.anInt258 = 2;
					this.anInt321 = 0;
				}
			} else if (this.anInt258 == 2) {
				local19 = super.anInt179 / 2 - 40;
				local19 += 30;
				local19 += 25;
				if (super.anInt187 == 1 && super.anInt189 >= local19 - 15 && super.anInt189 < local19) {
					this.anInt321 = 0;
				}
				local19 += 15;
				if (super.anInt187 == 1 && super.anInt189 >= local19 - 15 && super.anInt189 < local19) {
					this.anInt321 = 1;
				}
				local19 += 15;
				local26 = super.anInt178 / 2 - 80;
				@Pc(172) int local172 = super.anInt179 / 2 + 50;
				@Pc(173) int local173 = local172 + 20;
				if (super.anInt187 == 1 && super.anInt188 >= local26 - 75 && super.anInt188 <= local26 + 75 && super.anInt189 >= local173 - 20 && super.anInt189 <= local173 + 20) {
					this.method220(this.aString6, this.aString7, false);
					if (this.aBoolean80) {
						return;
					}
				}
				local26 = super.anInt178 / 2 + 80;
				if (super.anInt187 == 1 && super.anInt188 >= local26 - 75 && super.anInt188 <= local26 + 75 && super.anInt189 >= local173 - 20 && super.anInt189 <= local173 + 20) {
					this.anInt258 = 0;
					this.aString6 = "";
					this.aString7 = "";
				}
				while (true) {
					while (true) {
						@Pc(260) int local260 = this.method87();
						if (local260 == -1) {
							return;
						}
						@Pc(265) boolean local265 = false;
						for (@Pc(267) int local267 = 0; local267 < aString9.length(); local267++) {
							if (local260 == aString9.charAt(local267)) {
								local265 = true;
								break;
							}
						}
						if (this.anInt321 == 0) {
							if (local260 == 8 && this.aString6.length() > 0) {
								this.aString6 = this.aString6.substring(0, this.aString6.length() - 1);
							}
							if (local260 == 9 || local260 == 10 || local260 == 13) {
								this.anInt321 = 1;
							}
							if (local265) {
								this.aString6 = this.aString6 + (char) local260;
							}
							if (this.aString6.length() > 12) {
								this.aString6 = this.aString6.substring(0, 12);
							}
						} else if (this.anInt321 == 1) {
							if (local260 == 8 && this.aString7.length() > 0) {
								this.aString7 = this.aString7.substring(0, this.aString7.length() - 1);
							}
							if (local260 == 9 || local260 == 10 || local260 == 13) {
								this.anInt321 = 0;
							}
							if (local265) {
								this.aString7 = this.aString7 + (char) local260;
							}
							if (this.aString7.length() > 20) {
								this.aString7 = this.aString7.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt258 == 3) {
				local19 = super.anInt178 / 2;
				local26 = super.anInt179 / 2 + 50;
				@Pc(424) int local424 = local26 + 20;
				if (super.anInt187 == 1 && super.anInt188 >= local19 - 75 && super.anInt188 <= local19 + 75 && super.anInt189 >= local424 - 20 && super.anInt189 <= local424 + 20) {
					this.anInt258 = 0;
					return;
				}
			}
		} catch (@Pc(457) RuntimeException local457) {
			signlink.reporterror("79514, " + 39 + ", " + local457.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)Z")
	private boolean method223(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(8) int local8 = this.anIntArray81[arg0];
			if (local8 >= 2000) {
				local8 -= 2000;
			}
			return local8 == 605;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("71483, " + false + ", " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
	private int method224(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = 256 - arg2;
			return ((arg0 & 0xFF00FF) * local3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * local3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("26587, " + arg0 + ", " + -33251 + ", " + arg1 + ", " + arg2 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
	private void method225() {
		try {
			for (@Pc(6) Class1_Sub1_Sub1_Sub6 local6 = (Class1_Sub1_Sub1_Sub6) this.aClass29_3.method503(); local6 != null; local6 = (Class1_Sub1_Sub1_Sub6) this.aClass29_3.method505()) {
				if (local6.anInt506 != this.anInt386 || local6.aBoolean146) {
					local6.method666();
				} else if (anInt375 >= local6.anInt505) {
					local6.method298(this.anInt196);
					if (local6.aBoolean146) {
						local6.method666();
					} else {
						this.aClass37_1.method533(0, local6.anInt508, false, local6.anInt507, local6.anInt509, local6, local6.anInt506, 60, -1);
					}
				}
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("30621, " + 0 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!y;)V")
	private void method226(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub1_Sub1 arg1) {
		try {
			this.method227(arg0, arg1.anInt962, arg1.anInt961);
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("98838, " + -100 + ", " + arg0 + ", " + arg1 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)V")
	private void method227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 >= 128 && arg1 >= 128 && arg2 <= 13056 && arg1 <= 13056) {
				@Pc(28) int local28 = this.method199(this.anInt386, arg2, arg1) - arg0;
				@Pc(36) int local36 = arg2 - this.anInt329;
				@Pc(41) int local41 = local28 - this.anInt330;
				@Pc(46) int local46 = arg1 - this.anInt331;
				@Pc(51) int local51 = Class1_Sub1_Sub1_Sub5.anIntArray150[this.anInt332];
				@Pc(56) int local56 = Class1_Sub1_Sub1_Sub5.anIntArray151[this.anInt332];
				@Pc(61) int local61 = Class1_Sub1_Sub1_Sub5.anIntArray150[this.anInt333];
				@Pc(66) int local66 = Class1_Sub1_Sub1_Sub5.anIntArray151[this.anInt333];
				@Pc(76) int local76 = local46 * local61 + local36 * local66 >> 16;
				@Pc(86) int local86 = local46 * local66 - local36 * local61 >> 16;
				@Pc(88) int local88 = local76;
				@Pc(98) int local98 = local41 * local56 - local86 * local51 >> 16;
				@Pc(108) int local108 = local41 * local51 + local86 * local56 >> 16;
				if (local108 >= 50) {
					this.anInt287 = Class1_Sub1_Sub2_Sub1.anInt570 + (local88 << 9) / local108;
					this.anInt288 = Class1_Sub1_Sub2_Sub1.anInt571 + (local98 << 9) / local108;
				} else {
					this.anInt287 = -1;
					this.anInt288 = -1;
				}
			} else {
				this.anInt287 = -1;
				this.anInt288 = -1;
			}
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("89329, " + arg0 + ", " + arg1 + ", " + -604 + ", " + arg2 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "N", descriptor = "(I)Ljava/lang/String;")
	private String method228() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("59350, " + 7 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}
}
