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

	@OriginalMember(owner = "client!client", name = "L", descriptor = "I")
	private static int anInt139;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "I")
	private static int anInt141;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
	private static int anInt162;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
	private static int anInt174;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
	private static int anInt189;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
	private static int anInt205;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "I")
	private static int anInt212;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "Z")
	private static boolean aBoolean53;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
	private static int anInt229;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
	private static int anInt233;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
	private static int anInt252;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "Z")
	private static boolean aBoolean60;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "I")
	private static int anInt254;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
	private static int anInt262;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "I")
	private static int anInt278;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "I")
	private static int anInt292;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "I")
	private static int anInt301;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
	private static int anInt302;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "I")
	public static int anInt332;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
	private static int anInt338;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "I")
	private static int anInt144 = -4165;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "[[I")
	public static final int[][] anIntArrayArray4 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!client", name = "he", descriptor = "[I")
	public static final int[] anIntArray62 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "B")
	private static byte aByte22 = 4;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
	private static int anInt251 = 10;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "Z")
	private static boolean aBoolean59 = true;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "B")
	private static byte aByte24 = 8;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "[I")
	private static int[] anIntArray82 = new int[99];

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "Ljava/lang/String;")
	private static String aString18;

	@OriginalMember(owner = "client!client", name = "D", descriptor = "I")
	private int anInt134;

	@OriginalMember(owner = "client!client", name = "F", descriptor = "I")
	private int anInt135;

	@OriginalMember(owner = "client!client", name = "I", descriptor = "I")
	private int anInt136;

	@OriginalMember(owner = "client!client", name = "J", descriptor = "I")
	private int anInt137;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "I")
	private int anInt138;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
	private int anInt142;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "Lclient!tb;")
	private Class38 aClass38_1;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "I")
	private int anInt145;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "I")
	private int anInt146;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "I")
	private int anInt149;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
	private int anInt150;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
	private int anInt152;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	private int anInt153;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_1;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_2;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "[[B")
	private byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	private int anInt154;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
	private int anInt156;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	private int anInt157;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
	private int anInt158;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
	private int anInt159;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
	private int anInt160;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "[I")
	private int[] anIntArray37;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "[I")
	private int[] anIntArray38;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "[I")
	private int[] anIntArray39;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
	private int anInt164;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
	private int anInt165;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private int anInt167;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_6;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_7;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_8;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_9;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_10;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
	private int anInt170;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_11;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_12;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "Lclient!r;")
	private Class33 aClass33_1;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
	private int anInt172;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
	private int anInt173;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
	private int anInt175;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
	private int anInt177;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "[I")
	private int[] anIntArray42;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "[I")
	private int[] anIntArray43;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
	private int anInt179;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
	private int anInt180;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "[I")
	private int[] anIntArray46;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
	private int anInt181;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
	private int anInt182;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_13;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_14;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_15;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
	private int anInt185;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
	private int anInt186;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
	private int anInt190;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
	private int anInt193;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
	private int anInt194;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
	private int anInt195;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "I")
	private int anInt196;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "Ljava/lang/String;")
	private String aString5;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
	private int anInt198;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "I")
	private int anInt199;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
	private int anInt202;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_2;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
	private int anInt206;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
	private int anInt207;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
	private int anInt208;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "I")
	private int anInt209;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "I")
	private int anInt210;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "I")
	private int anInt211;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
	private int anInt214;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
	private int anInt216;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
	private int anInt218;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "Ljava/lang/String;")
	private String aString7;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
	private int anInt221;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "Lclient!qb;")
	private Class32 aClass32_3;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "Lclient!qb;")
	private Class32 aClass32_4;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "Lclient!qb;")
	private Class32 aClass32_5;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "Lclient!qb;")
	private Class32 aClass32_6;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "Lclient!qb;")
	private Class32 aClass32_7;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "Lclient!qb;")
	private Class32 aClass32_8;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "Lclient!qb;")
	private Class32 aClass32_9;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "Lclient!qb;")
	private Class32 aClass32_10;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "Lclient!qb;")
	private Class32 aClass32_11;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "Lclient!qb;")
	private Class32 aClass32_12;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "I")
	private int anInt223;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
	private int anInt225;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
	private int anInt226;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
	private int anInt227;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "I")
	private int anInt228;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "I")
	private int anInt230;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
	private int anInt231;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "J")
	private long aLong7;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
	private int anInt232;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
	private int anInt234;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "[I")
	private int[] anIntArray63;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "[I")
	private int[] anIntArray64;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
	private int anInt236;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
	private int anInt237;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
	private int anInt238;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "I")
	private int anInt239;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
	private int anInt240;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
	private int anInt242;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "I")
	private int anInt243;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
	private int anInt244;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private int anInt245;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
	private int anInt246;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private int anInt247;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "I")
	private int anInt250;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "Lclient!ub;")
	private Class39 aClass39_1;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
	private int anInt253;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "[I")
	private int[] anIntArray66;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "[I")
	private int[] anIntArray67;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "[I")
	private int[] anIntArray68;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "[I")
	private int[] anIntArray69;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "I")
	private int anInt255;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
	private int anInt256;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "I")
	private int anInt257;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private int anInt258;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "Lclient!qb;")
	private Class32 aClass32_13;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "Lclient!qb;")
	private Class32 aClass32_14;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "Lclient!qb;")
	private Class32 aClass32_15;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
	private int anInt261;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "I")
	private int anInt264;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
	private int anInt265;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
	private int anInt266;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
	private int anInt267;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "Lclient!d;")
	private Class6 aClass6_1;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
	private int anInt268;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
	private int anInt269;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
	private int anInt270;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "I")
	private int anInt271;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
	private int anInt272;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "I")
	private int anInt273;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
	private int anInt274;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_6;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_7;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_8;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_9;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
	private int anInt279;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
	private int anInt280;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_10;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private int anInt281;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "J")
	private long aLong8;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
	private int anInt282;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
	private int anInt283;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
	private int anInt284;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
	private int anInt286;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
	private int anInt287;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "I")
	private int anInt288;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
	private int anInt289;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
	private int anInt290;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "I")
	private int anInt291;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "I")
	private int anInt293;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "I")
	private int anInt294;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "I")
	private int anInt295;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "I")
	private int anInt296;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
	private int anInt297;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "I")
	private int anInt298;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "J")
	private long aLong9;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "Lclient!jb;")
	private Class1_Sub3_Sub2_Sub4 aClass1_Sub3_Sub2_Sub4_1;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "Lclient!jb;")
	private Class1_Sub3_Sub2_Sub4 aClass1_Sub3_Sub2_Sub4_2;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "Lclient!jb;")
	private Class1_Sub3_Sub2_Sub4 aClass1_Sub3_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "Lclient!jb;")
	private Class1_Sub3_Sub2_Sub4 aClass1_Sub3_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
	private int anInt303;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
	private int anInt304;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "I")
	private int anInt305;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
	private int anInt306;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "I")
	private int anInt307;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "[Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3[] aClass1_Sub3_Sub2_Sub3Array3;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_16;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_17;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_18;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_19;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_20;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
	private int anInt308;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "I")
	private int anInt309;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
	private int anInt310;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
	private int anInt311;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
	private int anInt312;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "Lclient!qb;")
	private Class32 aClass32_16;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "Lclient!qb;")
	private Class32 aClass32_17;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "Lclient!qb;")
	private Class32 aClass32_18;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "Lclient!qb;")
	private Class32 aClass32_19;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "Lclient!z;")
	private Class1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub3_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "I")
	private int anInt313;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "I")
	private int anInt315;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
	private int anInt316;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "I")
	private int anInt317;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
	private int anInt319;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
	private int anInt320;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
	private int anInt321;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "Ljava/lang/String;")
	private String aString15;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "Ljava/lang/String;")
	private String aString16;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "I")
	private int anInt322;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "Lclient!qb;")
	private Class32 aClass32_20;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "Lclient!qb;")
	private Class32 aClass32_21;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "Lclient!qb;")
	private Class32 aClass32_22;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "Lclient!qb;")
	private Class32 aClass32_23;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "Lclient!qb;")
	private Class32 aClass32_24;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "Lclient!qb;")
	private Class32 aClass32_25;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "Lclient!qb;")
	private Class32 aClass32_26;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "Lclient!qb;")
	private Class32 aClass32_27;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "Lclient!qb;")
	private Class32 aClass32_28;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
	private int anInt323;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "I")
	private int anInt324;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "Ljava/lang/String;")
	private String aString17;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
	private int anInt326;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "I")
	private int anInt327;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
	private int anInt328;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "I")
	private int anInt329;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "I")
	private int anInt330;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "I")
	private int anInt331;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_11;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
	private int anInt334;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
	private int anInt335;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
	private int anInt336;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "I")
	private int anInt337;

	@OriginalMember(owner = "client!client", name = "C", descriptor = "I")
	private int anInt133 = -579;

	@OriginalMember(owner = "client!client", name = "E", descriptor = "Lclient!ob;")
	private Class28 aClass28_1 = new Class28((byte) -47);

	@OriginalMember(owner = "client!client", name = "G", descriptor = "Lclient!ob;")
	private Class28 aClass28_2 = new Class28((byte) -47);

	@OriginalMember(owner = "client!client", name = "H", descriptor = "[I")
	private int[] anIntArray30 = new int[151];

	@OriginalMember(owner = "client!client", name = "M", descriptor = "I")
	private int anInt140 = -1;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "B")
	private byte aByte17 = 8;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "[Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array3 = new Class1_Sub3_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "W", descriptor = "[I")
	private int[] anIntArray31 = new int[100];

	@OriginalMember(owner = "client!client", name = "X", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray5 = new String[100];

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray6 = new String[100];

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Z")
	private boolean aBoolean40 = false;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	private int anInt147 = 2048;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
	private int anInt148 = 2047;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "[Lclient!z;")
	private Class1_Sub1_Sub3_Sub2[] aClass1_Sub1_Sub3_Sub2Array1 = new Class1_Sub1_Sub3_Sub2[this.anInt147];

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "[I")
	private int[] anIntArray32 = new int[this.anInt147];

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "[I")
	private int[] anIntArray33 = new int[this.anInt147];

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "[Lclient!kb;")
	private Class1_Sub3_Sub3[] aClass1_Sub3_Sub3Array1 = new Class1_Sub3_Sub3[this.anInt147];

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "[I")
	private int[] anIntArray34 = new int[5];

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	private int anInt151 = -1;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Z")
	private boolean aBoolean41 = false;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "[[I")
	private int[][] anIntArrayArray2 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "[Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array4 = new Class1_Sub3_Sub2_Sub2[8];

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "Z")
	private boolean aBoolean42 = false;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	private int anInt155 = -526;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "[I")
	private int[] anIntArray35 = new int[1000];

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "[I")
	private int[] anIntArray36 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "Z")
	private boolean aBoolean43 = false;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
	private int anInt161 = -29953;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
	private int anInt163 = -46854;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "Lclient!ob;")
	private Class28 aClass28_3 = new Class28((byte) -47);

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "I")
	private int anInt166 = 7759444;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "Ljava/lang/Object;")
	private Object anObject1 = new Object();

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
	private int anInt168 = 2;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
	private int anInt169 = 972;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "[I")
	private int[] anIntArray40 = new int[50];

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "Lclient!kb;")
	private Class1_Sub3_Sub3 aClass1_Sub3_Sub3_4 = Class1_Sub3_Sub3.method370();

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt171 = 1;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "Ljava/lang/String;")
	private String aString4 = "";

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "B")
	private byte aByte18 = 8;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "[Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array5 = new Class1_Sub3_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "Lclient!kb;")
	private Class1_Sub3_Sub3 aClass1_Sub3_Sub3_5 = Class1_Sub3_Sub3.method370();

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "[I")
	private int[] anIntArray41 = new int[2000];

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "Z")
	private boolean aBoolean44 = false;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "I")
	private int anInt176 = -1;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "I")
	private int anInt178 = -1;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "[Lclient!y;")
	private Class1_Sub1_Sub3_Sub1[] aClass1_Sub1_Sub3_Sub1Array1 = new Class1_Sub1_Sub3_Sub1[8192];

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "[I")
	private int[] anIntArray44 = new int[8192];

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "[I")
	private int[] anIntArray45 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "Z")
	private boolean aBoolean45 = true;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "Z")
	private boolean aBoolean46 = false;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "[[I")
	private int[][] anIntArrayArray3 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "Z")
	private boolean aBoolean47 = true;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
	private int anInt183 = -37106;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "B")
	private byte aByte19 = -60;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
	private int anInt184 = 923;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
	private int anInt187 = -1;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "I")
	private int anInt188 = -1;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "B")
	private byte aByte20 = 5;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "Z")
	private boolean aBoolean48 = false;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
	private int anInt191 = 50;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "[I")
	private int[] anIntArray47 = new int[this.anInt191];

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "[I")
	private int[] anIntArray48 = new int[this.anInt191];

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "[I")
	private int[] anIntArray49 = new int[this.anInt191];

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "[I")
	private int[] anIntArray50 = new int[this.anInt191];

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "[I")
	private int[] anIntArray51 = new int[this.anInt191];

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "[I")
	private int[] anIntArray52 = new int[this.anInt191];

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "[I")
	private int[] anIntArray53 = new int[this.anInt191];

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray7 = new String[this.anInt191];

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
	private final int anInt192 = 100;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "[I")
	private int[] anIntArray54 = new int[100];

	@OriginalMember(owner = "client!client", name = "id", descriptor = "[I")
	private int[] anIntArray55 = new int[50];

	@OriginalMember(owner = "client!client", name = "od", descriptor = "I")
	private int anInt197 = 3;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
	private int anInt200 = 8;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "Z")
	private boolean aBoolean49 = false;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "I")
	private int anInt201 = 9;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "Z")
	private boolean aBoolean51 = false;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
	private int anInt203 = -514;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "[I")
	private int[] anIntArray56 = new int[256];

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "[[I")
	private int[][] anIntArrayArray5 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
	private int anInt204 = -1;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "Ljava/lang/String;")
	private String aString6 = "";

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "Z")
	private boolean aBoolean52 = false;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "[Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3[] aClass1_Sub3_Sub2_Sub3Array1 = new Class1_Sub3_Sub2_Sub3[13];

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "[I")
	private int[] anIntArray57 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "I")
	private int anInt213 = 2301979;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "B")
	private byte aByte21 = -58;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
	private int anInt215 = 1;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[100];

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
	private int anInt217 = 27394;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
	private int anInt219 = 2;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "I")
	private int anInt220 = -1;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "[I")
	private int[] anIntArray58 = new int[500];

	@OriginalMember(owner = "client!client", name = "de", descriptor = "[I")
	private int[] anIntArray59 = new int[500];

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "[I")
	private int[] anIntArray60 = new int[500];

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "[I")
	private int[] anIntArray61 = new int[500];

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "Z")
	private boolean aBoolean54 = false;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "Z")
	private boolean aBoolean55 = true;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "I")
	private int anInt222 = 3353893;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
	private int anInt224 = 3;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "B")
	private byte aByte23 = 4;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
	private int anInt235 = -1;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[500];

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "Z")
	private boolean aBoolean56 = false;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private int anInt241 = -1;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "Z")
	private boolean aBoolean57 = false;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "[Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array6 = new Class1_Sub3_Sub2_Sub2[50];

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "[I")
	private int[] anIntArray65 = new int[5];

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private int anInt248 = -1;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "I")
	private int anInt249 = 742;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "Z")
	private boolean aBoolean58 = true;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "Ljava/lang/String;")
	private String aString8 = "";

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "Ljava/lang/String;")
	private String aString9 = "";

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "Z")
	private boolean aBoolean61 = false;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "Lclient!kb;")
	private Class1_Sub3_Sub3 aClass1_Sub3_Sub3_6 = Class1_Sub3_Sub3.method370();

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "Ljava/lang/String;")
	private String aString10 = "";

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "Ljava/lang/String;")
	private String aString11 = "";

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "Z")
	private boolean aBoolean62 = false;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "[I")
	private int[] anIntArray70 = new int[7];

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
	private int anInt259 = -46854;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "Z")
	private boolean aBoolean63 = false;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "[Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3[] aClass1_Sub3_Sub2_Sub3Array2 = new Class1_Sub3_Sub2_Sub3[50];

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
	private int anInt260 = -750;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "[I")
	private int[] anIntArray71 = new int[50];

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "I")
	private int anInt263 = -3154;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "[I")
	private int[] anIntArray72 = new int[100];

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "[I")
	private int[] anIntArray73 = new int[50];

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "Z")
	private boolean aBoolean64 = true;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "B")
	private byte aByte25 = 3;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "Z")
	private boolean aBoolean65 = false;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "[I")
	private final int[] anIntArray74 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "Ljava/lang/String;")
	private String aString12 = "";

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "Ljava/lang/String;")
	private String aString13 = "";

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "Z")
	private boolean aBoolean66 = false;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
	private int anInt275 = 5063219;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "I")
	private int anInt276 = 813;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
	private int anInt277 = 43166;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "[I")
	private int[] anIntArray75 = new int[33];

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "[Z")
	private boolean[] aBooleanArray1 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "[I")
	private int[] anIntArray76 = new int[50];

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "Lclient!ob;")
	private Class28 aClass28_4 = new Class28((byte) -47);

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
	private int anInt285 = 2;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "[I")
	private int[] anIntArray77 = new int[151];

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "[I")
	private int[] anIntArray78 = new int[33];

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "[I")
	private int[] anIntArray79 = new int[50];

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "Ljava/lang/String;")
	private String aString14 = "";

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "Z")
	private boolean aBoolean68 = true;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "[Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array7 = new Class1_Sub3_Sub2_Sub2[1000];

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "[[[Lclient!ob;")
	private Class28[][][] aClass28ArrayArrayArray1 = new Class28[4][104][104];

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "Z")
	private boolean aBoolean69 = true;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "I")
	private int anInt299 = -1;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "[I")
	private int[] anIntArray80 = new int[5];

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "I")
	private int anInt300 = 78;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "[I")
	private int[] anIntArray81 = new int[5];

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "Z")
	private boolean aBoolean70 = false;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "Z")
	private boolean aBoolean71 = false;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "Z")
	private boolean aBoolean72 = false;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "[B")
	private byte[] aByteArray4 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "[I")
	private int[] anIntArray83 = new int[5];

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
	private int anInt314 = 128;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "I")
	private int anInt318 = 485;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "Z")
	private boolean aBoolean73 = false;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "[Lclient!ec;")
	private Class9[] aClass9Array1 = new Class9[4];

	@OriginalMember(owner = "client!client", name = "li", descriptor = "Z")
	private boolean aBoolean74 = false;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "[I")
	private int[] anIntArray84 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
	private int anInt325 = -19523;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "I")
	private int anInt333 = -715;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "Z")
	private boolean aBoolean75 = false;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "Z")
	private boolean aBoolean76 = false;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "Lclient!ob;")
	private Class28 aClass28_5 = new Class28((byte) -47);

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "[J")
	private long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "[I")
	private int[] anIntArray85 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "[I")
	private int[] anIntArray86 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "[I")
	private int[] anIntArray87 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "Lclient!hc;")
	private Class15 aClass15_1 = new Class15();

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "Z")
	private boolean aBoolean77 = false;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "[I")
	private int[] anIntArray88 = new int[9];

	static {
		@Pc(351) int local351 = 0;
		for (@Pc(353) int local353 = 0; local353 < 99; local353++) {
			@Pc(358) int local358 = local353 + 1;
			@Pc(371) int local371 = (int) ((double) local358 + Math.pow(2.0D, (double) local358 / 7.0D) * 300.0D);
			local351 += local371;
			anIntArray82[local353] = local351 / 4;
		}
		aString18 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private static void method105(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				anInt141 = 417;
			}
			Class33.aBoolean164 = true;
			Class1_Sub3_Sub2_Sub1.aBoolean101 = true;
			aBoolean60 = true;
			Class4.aBoolean28 = true;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("38128, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(III)Ljava/lang/String;")
	private static String method130(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(12) int local12 = arg1 - arg0;
			if (local12 < -9) {
				return "@red@";
			} else if (local12 < -6) {
				return "@or3@";
			} else if (local12 < -3) {
				return "@or2@";
			} else if (local12 < 0) {
				return "@or1@";
			} else if (local12 > 9) {
				return "@gre@";
			} else if (local12 > 6) {
				return "@gr3@";
			} else if (local12 > 3) {
				return "@gr2@";
			} else if (local12 > 0) {
				return "@gr1@";
			} else {
				return "@yel@";
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("37459, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Ljava/lang/String;")
	private static String method134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(8) String local8 = String.valueOf(arg0);
			for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
				local8 = local8.substring(0, local13) + "," + local8.substring(local13);
			}
			if (local8.length() > 8) {
				local8 = "@gre@" + local8.substring(0, local8.length() - 8) + " million @whi@(" + local8 + ")";
			} else if (local8.length() > 4) {
				local8 = "@cya@" + local8.substring(0, local8.length() - 4) + "K @whi@(" + local8 + ")";
			}
			return " " + local8;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("90039, " + arg0 + ", " + arg1 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)Ljava/lang/String;")
	private static String method151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 < 8 || arg0 > 8) {
				for (@Pc(7) int local7 = 1; local7 > 0; local7++) {
				}
			}
			if (arg1 < 100000) {
				return String.valueOf(arg1);
			} else if (arg1 < 10000000) {
				return arg1 / 1000 + "K";
			} else {
				return arg1 / 1000000 + "M";
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("88941, " + arg0 + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 217);
			if (arg0.length == 4) {
				anInt251 = Integer.parseInt(arg0[0]);
				anInt252 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method105(anInt141);
				} else if (arg0[2].equals("highmem")) {
					method169();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean59 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean59 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
					return;
				}
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(82) client local82 = new client();
				local82.method62();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
			}
		} catch (@Pc(89) Exception local89) {
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private static void method169() {
		try {
			if (anInt144 == -4165) {
				Class33.aBoolean164 = false;
				Class1_Sub3_Sub2_Sub1.aBoolean101 = false;
				aBoolean60 = false;
				Class4.aBoolean28 = false;
			}
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("83535, " + -4165 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!hb;)V")
	private void method75(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub3_Sub2_Sub2 arg2) {
		try {
			@Pc(7) int local7 = this.anInt315 + this.anInt218 & 0x7FF;
			@Pc(15) int local15 = arg1 * arg1 + arg0 * arg0;
			if (local15 <= 6400) {
				@Pc(23) int local23 = Class1_Sub3_Sub1.anIntArray124[local7];
				@Pc(27) int local27 = Class1_Sub3_Sub1.anIntArray125[local7];
				@Pc(36) int local36 = local23 * 256 / (this.anInt170 + 256);
				@Pc(45) int local45 = local27 * 256 / (this.anInt170 + 256);
				@Pc(61) int local61 = arg0 * local36 + arg1 * local45 >> 16;
				@Pc(71) int local71 = arg0 * local45 - arg1 * local36 >> 16;
				if (local15 > 2500) {
					arg2.method326(this.aClass1_Sub3_Sub2_Sub3_14, 83 - local71 - arg2.anInt456 / 2, local61 + 94 - arg2.anInt455 / 2);
				} else {
					arg2.method319(83 - local71 - arg2.anInt456 / 2, local61 + 94 - arg2.anInt455 / 2);
				}
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("44072, " + 44453 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	private void method76() {
		try {
			if (this.anInt198 == 2) {
				this.method83((this.anInt328 - this.anInt296 << 7) + this.anInt331, this.anInt329 * 2, (this.anInt327 - this.anInt295 << 7) + this.anInt330);
				if (this.anInt187 > -1 && anInt332 % 20 < 10) {
					this.aClass1_Sub3_Sub2_Sub2Array5[2].method319(this.anInt188 - 28, this.anInt187 - 12);
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("96812, " + -95 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method77(@OriginalArg(0) byte arg0) {
		try {
			this.aBoolean51 = false;
			while (this.aBoolean77) {
				this.aBoolean51 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(13) Exception local13) {
				}
			}
			this.aClass1_Sub3_Sub2_Sub3_1 = null;
			this.aClass1_Sub3_Sub2_Sub3_2 = null;
			this.aClass1_Sub3_Sub2_Sub3Array3 = null;
			this.anIntArray66 = null;
			this.anIntArray67 = null;
			this.anIntArray68 = null;
			this.anIntArray69 = null;
			this.anIntArray42 = null;
			@Pc(46) boolean local46 = false;
			this.anIntArray43 = null;
			this.anIntArray63 = null;
			this.anIntArray64 = null;
			this.aClass1_Sub3_Sub2_Sub2_4 = null;
			this.aClass1_Sub3_Sub2_Sub2_5 = null;
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("14172, " + arg0 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	@Override
	public void method73(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		if (signlink.mainapp == null) {
			super.method73(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II[BZ)V")
	private void method78(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) boolean arg2) {
		try {
			signlink.anInt747 = arg2 ? 1 : 0;
			signlink.midisave(arg1, arg0);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("57801, " + arg0 + ", " + 1 + ", " + arg1 + ", " + arg2 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method79() {
		try {
			this.anInt182++;
			this.method164(4);
			this.method113();
			this.method109();
			this.method92();
			this.method87();
			@Pc(28) int local28;
			@Pc(67) int local67;
			if (!this.aBoolean61) {
				local28 = this.anInt314;
				if (this.anInt145 / 256 > local28) {
					local28 = this.anInt145 / 256;
				}
				if (this.aBooleanArray1[4] && this.anIntArray80[4] + 128 > local28) {
					local28 = this.anIntArray80[4] + 128;
				}
				local67 = this.anInt315 + this.anInt214 & 0x7FF;
				this.method180(this.anInt158, this.method132(this.aClass1_Sub1_Sub3_Sub2_1.anInt881, this.aByte19, this.aClass1_Sub1_Sub3_Sub2_1.anInt882, this.anInt337) - 50, local67, local28 * 3 + 600, local28, this.anInt159);
			}
			if (this.aBoolean61) {
				local28 = this.method115();
			} else {
				local28 = this.method114();
			}
			local67 = this.anInt242;
			@Pc(114) int local114 = this.anInt243;
			@Pc(117) int local117 = this.anInt244;
			@Pc(120) int local120 = this.anInt245;
			@Pc(123) int local123 = this.anInt246;
			@Pc(172) int local172;
			for (@Pc(125) int local125 = 0; local125 < 5; local125++) {
				if (this.aBooleanArray1[local125]) {
					local172 = (int) (Math.random() * (double) (this.anIntArray65[local125] * 2 + 1) - (double) this.anIntArray65[local125] + Math.sin((double) this.anIntArray83[local125] * ((double) this.anIntArray81[local125] / 100.0D)) * (double) this.anIntArray80[local125]);
					if (local125 == 0) {
						this.anInt242 += local172;
					}
					if (local125 == 1) {
						this.anInt243 += local172;
					}
					if (local125 == 2) {
						this.anInt244 += local172;
					}
					if (local125 == 3) {
						this.anInt246 = this.anInt246 + local172 & 0x7FF;
					}
					if (local125 == 4) {
						this.anInt245 += local172;
						if (this.anInt245 < 128) {
							this.anInt245 = 128;
						}
						if (this.anInt245 > 383) {
							this.anInt245 = 383;
						}
					}
				}
			}
			local172 = Class1_Sub3_Sub2_Sub1.anInt426;
			Class1_Sub3_Sub1.aBoolean89 = true;
			Class1_Sub3_Sub1.anInt372 = 0;
			Class1_Sub3_Sub1.anInt370 = super.anInt125 - 8;
			Class1_Sub3_Sub1.anInt371 = super.anInt126 - 11;
			Class1_Sub3_Sub2.method353();
			this.aClass33_1.method499(local28, this.anInt243, this.anInt244, this.anInt242, this.anInt246, this.anInt245);
			this.aClass33_1.method473(110);
			this.method89();
			this.method76();
			this.method95(local172);
			this.method108();
			this.aClass32_18.method456(11, 8, super.aGraphics2);
			this.anInt242 = local67;
			this.anInt243 = local114;
			this.anInt244 = local117;
			this.anInt245 = local120;
			this.anInt246 = local123;
		} catch (@Pc(317) RuntimeException local317) {
			signlink.reporterror("99396, " + 122 + ", " + local317.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method70() {
		try {
			if (this.aBoolean56 || this.aBoolean50 || this.aBoolean73) {
				this.method142();
			} else {
				if (this.aBoolean72) {
					this.method191();
				} else {
					this.method128();
				}
				this.anInt266 = 0;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("86148, " + 7 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;I)V")
	@Override
	protected void method74(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		try {
			this.method160();
			if (this.aClass39_1 == null) {
				super.method74(arg0, arg1);
			} else {
				this.aClass32_22.method455();
				this.aClass1_Sub3_Sub2_Sub4_3.method358(54, "RuneScape is loading - please wait...", 180, 16777215);
				Class1_Sub3_Sub2.method355(304, 9179409, 28, 62, 34);
				Class1_Sub3_Sub2.method355(302, 0, 29, 63, 32);
				Class1_Sub3_Sub2.method354(30, arg1 * 3, 9179409, 64, 30);
				Class1_Sub3_Sub2.method354(arg1 * 3 + 30, 300 - arg1 * 3, 0, 64, 30);
				this.aClass1_Sub3_Sub2_Sub4_3.method358(85, arg0, 180, 16777215);
				this.aClass32_22.method456(186, 214, super.aGraphics2);
				if (this.aBoolean71) {
					this.aBoolean71 = false;
					if (!this.aBoolean51) {
						this.aClass32_23.method456(0, 0, super.aGraphics2);
						this.aClass32_24.method456(0, 661, super.aGraphics2);
					}
					this.aClass32_20.method456(0, 128, super.aGraphics2);
					this.aClass32_21.method456(386, 214, super.aGraphics2);
					this.aClass32_25.method456(265, 0, super.aGraphics2);
					this.aClass32_26.method456(265, 574, super.aGraphics2);
					this.aClass32_27.method456(186, 128, super.aGraphics2);
					this.aClass32_28.method456(186, 574, super.aGraphics2);
				}
			}
		} catch (@Pc(211) RuntimeException local211) {
			signlink.reporterror("99972, " + 72 + ", " + arg0 + ", " + arg1 + ", " + local211.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method80(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			if (this.anInt193 == 0 && this.anInt319 == 0) {
				this.aStringArray9[this.anInt153] = "Walk here";
				this.anIntArray60[this.anInt153] = 981;
				this.anIntArray58[this.anInt153] = super.anInt125;
				this.anIntArray59[this.anInt153] = super.anInt126;
				this.anInt153++;
			}
			@Pc(45) int local45 = -1;
			for (@Pc(47) int local47 = 0; local47 < Class1_Sub3_Sub1.anInt372; local47++) {
				@Pc(53) int local53 = Class1_Sub3_Sub1.anIntArray123[local47];
				@Pc(57) int local57 = local53 & 0x7F;
				@Pc(63) int local63 = local53 >> 7 & 0x7F;
				@Pc(69) int local69 = local53 >> 29 & 0x3;
				@Pc(75) int local75 = local53 >> 14 & 0x7FFF;
				if (local53 != local45) {
					local45 = local53;
					@Pc(213) int local213;
					if (local69 == 2 && this.aClass33_1.method490(this.anInt337, local57, local63, local53) >= 0) {
						@Pc(95) Class2 local95 = Class2.method23(local75);
						if (this.anInt193 == 1) {
							this.aStringArray9[this.anInt153] = "Use " + this.aString5 + " with @cya@" + local95.aString1;
							this.anIntArray60[this.anInt153] = 505;
							this.anIntArray61[this.anInt153] = local53;
							this.anIntArray58[this.anInt153] = local57;
							this.anIntArray59[this.anInt153] = local63;
							this.anInt153++;
						} else if (this.anInt319 != 1) {
							if (local95.aStringArray1 != null) {
								for (local213 = 4; local213 >= 0; local213--) {
									if (local95.aStringArray1[local213] != null) {
										this.aStringArray9[this.anInt153] = local95.aStringArray1[local213] + " @cya@" + local95.aString1;
										if (local213 == 0) {
											this.anIntArray60[this.anInt153] = 798;
										}
										if (local213 == 1) {
											this.anIntArray60[this.anInt153] = 829;
										}
										if (local213 == 2) {
											this.anIntArray60[this.anInt153] = 873;
										}
										if (local213 == 3) {
											this.anIntArray60[this.anInt153] = 104;
										}
										if (local213 == 4) {
											this.anIntArray60[this.anInt153] = 1659;
										}
										this.anIntArray61[this.anInt153] = local53;
										this.anIntArray58[this.anInt153] = local57;
										this.anIntArray59[this.anInt153] = local63;
										this.anInt153++;
									}
								}
							}
							this.aStringArray9[this.anInt153] = "Examine @cya@" + local95.aString1;
							this.anIntArray60[this.anInt153] = 1418;
							this.anIntArray61[this.anInt153] = local53;
							this.anIntArray58[this.anInt153] = local57;
							this.anIntArray59[this.anInt153] = local63;
							this.anInt153++;
						} else if ((this.anInt321 & 0x4) == 4) {
							this.aStringArray9[this.anInt153] = this.aString15 + " @cya@" + local95.aString1;
							this.anIntArray60[this.anInt153] = 737;
							this.anIntArray61[this.anInt153] = local53;
							this.anIntArray58[this.anInt153] = local57;
							this.anIntArray59[this.anInt153] = local63;
							this.anInt153++;
						}
					}
					@Pc(390) Class1_Sub1_Sub3_Sub1 local390;
					if (local69 == 1) {
						@Pc(361) Class1_Sub1_Sub3_Sub1 local361 = this.aClass1_Sub1_Sub3_Sub1Array1[local75];
						if (local361.aClass3_1.aByte10 == 1 && (local361.anInt881 & 0x7F) == 64 && (local361.anInt882 & 0x7F) == 64) {
							for (local213 = 0; local213 < this.anInt180; local213++) {
								local390 = this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray44[local213]];
								if (local390 != null && local390 != local361 && local390.aClass3_1.aByte10 == 1 && local390.anInt881 == local361.anInt881 && local390.anInt882 == local361.anInt882) {
									this.method158(this.anIntArray44[local213], this.anInt133, local63, local57, local390.aClass3_1);
								}
							}
						}
						this.method158(local75, this.anInt133, local63, local57, local361.aClass3_1);
					}
					if (local69 == 0) {
						@Pc(443) Class1_Sub1_Sub3_Sub2 local443 = this.aClass1_Sub1_Sub3_Sub2Array1[local75];
						if ((local443.anInt881 & 0x7F) == 64 && (local443.anInt882 & 0x7F) == 64) {
							for (local213 = 0; local213 < this.anInt180; local213++) {
								local390 = this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray44[local213]];
								if (local390 != null && local390.aClass3_1.aByte10 == 1 && local390.anInt881 == local443.anInt881 && local390.anInt882 == local443.anInt882) {
									this.method158(this.anIntArray44[local213], this.anInt133, local63, local57, local390.aClass3_1);
								}
							}
							for (@Pc(503) int local503 = 0; local503 < this.anInt149; local503++) {
								@Pc(513) Class1_Sub1_Sub3_Sub2 local513 = this.aClass1_Sub1_Sub3_Sub2Array1[this.anIntArray32[local503]];
								if (local513 != null && local513 != local443 && local513.anInt881 == local443.anInt881 && local513.anInt882 == local443.anInt882) {
									this.method152(local57, 517, this.anIntArray32[local503], local63, local513);
								}
							}
						}
						this.method152(local57, 517, local75, local63, local443);
					}
					if (local69 == 3) {
						@Pc(563) Class28 local563 = this.aClass28ArrayArrayArray1[this.anInt337][local57][local63];
						if (local563 != null) {
							for (@Pc(570) Class1_Sub7 local570 = (Class1_Sub7) local563.method449(); local570 != null; local570 = (Class1_Sub7) local563.method451()) {
								@Pc(576) Class5 local576 = Class5.method54(local570.anInt760);
								if (this.anInt193 == 1) {
									this.aStringArray9[this.anInt153] = "Use " + this.aString5 + " with @lre@" + local576.aString3;
									this.anIntArray60[this.anInt153] = 203;
									this.anIntArray61[this.anInt153] = local570.anInt760;
									this.anIntArray58[this.anInt153] = local57;
									this.anIntArray59[this.anInt153] = local63;
									this.anInt153++;
								} else if (this.anInt319 != 1) {
									for (@Pc(693) int local693 = 4; local693 >= 0; local693--) {
										if (local576.aStringArray3 != null && local576.aStringArray3[local693] != null) {
											this.aStringArray9[this.anInt153] = local576.aStringArray3[local693] + " @lre@" + local576.aString3;
											if (local693 == 0) {
												this.anIntArray60[this.anInt153] = 56;
											}
											if (local693 == 1) {
												this.anIntArray60[this.anInt153] = 321;
											}
											if (local693 == 2) {
												this.anIntArray60[this.anInt153] = 552;
											}
											if (local693 == 3) {
												this.anIntArray60[this.anInt153] = 43;
											}
											if (local693 == 4) {
												this.anIntArray60[this.anInt153] = 687;
											}
											this.anIntArray61[this.anInt153] = local570.anInt760;
											this.anIntArray58[this.anInt153] = local57;
											this.anIntArray59[this.anInt153] = local63;
											this.anInt153++;
										} else if (local693 == 2) {
											this.aStringArray9[this.anInt153] = "Take @lre@" + local576.aString3;
											this.anIntArray60[this.anInt153] = 552;
											this.anIntArray61[this.anInt153] = local570.anInt760;
											this.anIntArray58[this.anInt153] = local57;
											this.anIntArray59[this.anInt153] = local63;
											this.anInt153++;
										}
									}
									this.aStringArray9[this.anInt153] = "Examine @lre@" + local576.aString3;
									this.anIntArray60[this.anInt153] = 1308;
									this.anIntArray61[this.anInt153] = local570.anInt760;
									this.anIntArray58[this.anInt153] = local57;
									this.anIntArray59[this.anInt153] = local63;
									this.anInt153++;
								} else if ((this.anInt321 & 0x1) == 1) {
									this.aStringArray9[this.anInt153] = this.aString15 + " @lre@" + local576.aString3;
									this.anIntArray60[this.anInt153] = 543;
									this.anIntArray61[this.anInt153] = local570.anInt760;
									this.anIntArray58[this.anInt153] = local57;
									this.anIntArray59[this.anInt153] = local63;
									this.anInt153++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(900) RuntimeException local900) {
			signlink.reporterror("88689, " + arg0 + ", " + local900.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method81() {
		try {
			if (this.anInt272 == 0) {
				this.aStringArray9[0] = "Cancel";
				this.anIntArray60[0] = 1333;
				this.anInt153 = 1;
				this.method159(super.anInt126, super.anInt125);
				this.anInt326 = 0;
				if (super.anInt125 > 8 && super.anInt126 > 11 && super.anInt125 < 520 && super.anInt126 < 345) {
					if (this.anInt220 == -1) {
						this.method80(322);
					} else {
						this.method133(Class15.aClass15Array1[this.anInt220], 11, super.anInt126, 0, 8, super.anInt125);
					}
				}
				if (this.anInt326 != this.anInt264) {
					this.anInt264 = this.anInt326;
				}
				this.anInt326 = 0;
				if (super.anInt125 > 562 && super.anInt126 > 231 && super.anInt125 < 752 && super.anInt126 < 492) {
					if (this.anInt241 != -1) {
						this.method133(Class15.aClass15Array1[this.anInt241], 231, super.anInt126, 0, 562, super.anInt125);
					} else if (this.anIntArray57[this.anInt197] != -1) {
						this.method133(Class15.aClass15Array1[this.anIntArray57[this.anInt197]], 231, super.anInt126, 0, 562, super.anInt125);
					}
				}
				if (this.anInt326 != this.anInt138) {
					this.aBoolean44 = true;
					this.anInt138 = this.anInt326;
				}
				this.anInt326 = 0;
				if (super.anInt125 > 22 && super.anInt126 > 375 && super.anInt125 < 431 && super.anInt126 < 471) {
					if (this.anInt299 == -1) {
						this.method196(super.anInt126 - 375, super.anInt125 - 22);
					} else {
						this.method133(Class15.aClass15Array1[this.anInt299], 375, super.anInt126, 0, 22, super.anInt125);
					}
				}
				if (this.anInt299 != -1 && this.anInt326 != this.anInt286) {
					this.aBoolean43 = true;
					this.anInt286 = this.anInt326;
				}
				@Pc(228) boolean local228 = false;
				while (!local228) {
					local228 = true;
					for (@Pc(234) int local234 = 0; local234 < this.anInt153 - 1; local234++) {
						if (this.anIntArray60[local234] < 1000 && this.anIntArray60[local234 + 1] > 1000) {
							@Pc(255) String local255 = this.aStringArray9[local234];
							this.aStringArray9[local234] = this.aStringArray9[local234 + 1];
							this.aStringArray9[local234 + 1] = local255;
							@Pc(277) int local277 = this.anIntArray60[local234];
							this.anIntArray60[local234] = this.anIntArray60[local234 + 1];
							this.anIntArray60[local234 + 1] = local277;
							@Pc(299) int local299 = this.anIntArray58[local234];
							this.anIntArray58[local234] = this.anIntArray58[local234 + 1];
							this.anIntArray58[local234 + 1] = local299;
							@Pc(321) int local321 = this.anIntArray59[local234];
							this.anIntArray59[local234] = this.anIntArray59[local234 + 1];
							this.anIntArray59[local234 + 1] = local321;
							@Pc(343) int local343 = this.anIntArray61[local234];
							this.anIntArray61[local234] = this.anIntArray61[local234 + 1];
							this.anIntArray61[local234 + 1] = local343;
							local228 = false;
						}
					}
				}
			}
		} catch (@Pc(373) RuntimeException local373) {
			signlink.reporterror("72887, " + 9 + ", " + local373.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!x;II)V")
	private void method82(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			this.method83(arg0.anInt882, arg1, arg0.anInt881);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("74873, " + arg0 + ", " + arg1 + ", " + 333 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V")
	private void method83(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
				@Pc(29) int local29 = this.method132(arg2, this.aByte19, arg0, this.anInt337) - arg1;
				@Pc(34) int local34 = arg2 - this.anInt242;
				@Pc(48) int local48 = local29 - this.anInt243;
				@Pc(53) int local53 = arg0 - this.anInt244;
				@Pc(58) int local58 = Class1_Sub3_Sub1.anIntArray124[this.anInt245];
				@Pc(63) int local63 = Class1_Sub3_Sub1.anIntArray125[this.anInt245];
				@Pc(68) int local68 = Class1_Sub3_Sub1.anIntArray124[this.anInt246];
				@Pc(73) int local73 = Class1_Sub3_Sub1.anIntArray125[this.anInt246];
				@Pc(83) int local83 = local53 * local68 + local34 * local73 >> 16;
				@Pc(93) int local93 = local53 * local73 - local34 * local68 >> 16;
				@Pc(95) int local95 = local83;
				@Pc(105) int local105 = local48 * local63 - local93 * local58 >> 16;
				@Pc(115) int local115 = local48 * local58 + local93 * local63 >> 16;
				if (local115 >= 50) {
					this.anInt187 = Class1_Sub3_Sub2_Sub1.anInt422 + (local95 << 9) / local115;
					this.anInt188 = Class1_Sub3_Sub2_Sub1.anInt423 + (local105 << 9) / local115;
				} else {
					this.anInt187 = -1;
					this.anInt188 = -1;
				}
			} else {
				this.anInt187 = -1;
				this.anInt188 = -1;
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("11870, " + arg0 + ", " + arg1 + ", " + 5 + ", " + arg2 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIZ)V")
	private void method84(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		try {
			@Pc(4) boolean local4 = false;
			signlink.anInt746 = arg1;
			if (arg2) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("64249, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!kb;I)V")
	private void method85(@OriginalArg(1) Class1_Sub3_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aByte18 != 8) {
				this.aClass28ArrayArrayArray1 = null;
			}
			while (arg0.anInt549 + 21 < arg1 * 8) {
				@Pc(19) int local19 = arg0.method394(13);
				if (local19 == 8191) {
					break;
				}
				if (this.aClass1_Sub1_Sub3_Sub1Array1[local19] == null) {
					this.aClass1_Sub1_Sub3_Sub1Array1[local19] = new Class1_Sub1_Sub3_Sub1();
				}
				@Pc(39) Class1_Sub1_Sub3_Sub1 local39 = this.aClass1_Sub1_Sub3_Sub1Array1[local19];
				this.anIntArray44[this.anInt180++] = local19;
				local39.anInt923 = anInt332;
				local39.aClass3_1 = Class3.method32(arg0.method394(11));
				local39.anInt884 = local39.aClass3_1.aByte10;
				local39.anInt887 = local39.aClass3_1.anInt64;
				local39.anInt888 = local39.aClass3_1.anInt65;
				local39.anInt889 = local39.aClass3_1.anInt66;
				local39.anInt890 = local39.aClass3_1.anInt67;
				local39.anInt885 = local39.aClass3_1.anInt63;
				@Pc(95) int local95 = arg0.method394(5);
				if (local95 > 15) {
					local95 -= 32;
				}
				@Pc(104) int local104 = arg0.method394(5);
				if (local104 > 15) {
					local104 -= 32;
				}
				local39.method561(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0] + local104, false, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0] + local95);
				@Pc(131) int local131 = arg0.method394(1);
				if (local131 == 1) {
					this.anIntArray33[this.anInt150++] = local19;
				}
			}
			arg0.method395(this.anInt183);
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("610, " + 8 + ", " + arg0 + ", " + arg1 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!hc;I)Z")
	private boolean method86(@OriginalArg(0) Class15 arg0) {
		try {
			@Pc(11) int local11 = arg0.anInt463;
			if (local11 == 201) {
				this.aBoolean43 = true;
				this.aBoolean46 = false;
				this.aBoolean65 = true;
				this.aString11 = "";
				this.anInt142 = 1;
				this.aString10 = "Enter name of friend to add to list";
			}
			if (local11 == 202) {
				this.aBoolean43 = true;
				this.aBoolean46 = false;
				this.aBoolean65 = true;
				this.aString11 = "";
				this.anInt142 = 2;
				this.aString10 = "Enter name of friend to delete from list";
			}
			if (local11 == 205) {
				this.anInt211 = 250;
				return true;
			}
			if (local11 == 501) {
				this.aBoolean43 = true;
				this.aBoolean46 = false;
				this.aBoolean65 = true;
				this.aString11 = "";
				this.anInt142 = 4;
				this.aString10 = "Enter name of player to add to list";
			}
			if (local11 == 502) {
				this.aBoolean43 = true;
				this.aBoolean46 = false;
				this.aBoolean65 = true;
				this.aString11 = "";
				this.anInt142 = 5;
				this.aString10 = "Enter name of player to delete from list";
			}
			@Pc(115) int local115;
			@Pc(119) int local119;
			@Pc(124) int local124;
			if (local11 >= 300 && local11 <= 313) {
				local115 = (local11 - 300) / 2;
				local119 = local11 & 0x1;
				local124 = this.anIntArray70[local115];
				if (local124 != -1) {
					while (true) {
						if (local119 == 0) {
							local124--;
							if (local124 < 0) {
								local124 = Class13.anInt427 - 1;
							}
						}
						if (local119 == 1) {
							local124++;
							if (local124 >= Class13.anInt427) {
								local124 = 0;
							}
						}
						if (!Class13.aClass13Array1[local124].aBoolean106 && Class13.aClass13Array1[local124].anInt428 == local115 + (this.aBoolean47 ? 0 : 7)) {
							this.anIntArray70[local115] = local124;
							this.aBoolean70 = true;
							break;
						}
					}
				}
			}
			if (local11 >= 314 && local11 <= 323) {
				local115 = (local11 - 314) / 2;
				local119 = local11 & 0x1;
				local124 = this.anIntArray34[local115];
				if (local119 == 0) {
					local124--;
					if (local124 < 0) {
						local124 = anIntArrayArray4[local115].length - 1;
					}
				}
				if (local119 == 1) {
					local124++;
					if (local124 >= anIntArrayArray4[local115].length) {
						local124 = 0;
					}
				}
				this.anIntArray34[local115] = local124;
				this.aBoolean70 = true;
			}
			if (local11 == 324 && !this.aBoolean47) {
				this.aBoolean47 = true;
				this.method175();
			}
			if (local11 == 325 && this.aBoolean47) {
				this.aBoolean47 = false;
				this.method175();
			}
			if (local11 == 326) {
				this.aClass1_Sub3_Sub3_5.method372(239);
				this.aClass1_Sub3_Sub3_5.method373(this.aBoolean47 ? 0 : 1);
				for (local115 = 0; local115 < 7; local115++) {
					this.aClass1_Sub3_Sub3_5.method373(this.anIntArray70[local115]);
				}
				for (local119 = 0; local119 < 5; local119++) {
					this.aClass1_Sub3_Sub3_5.method373(this.anIntArray34[local119]);
				}
				return true;
			}
			if (local11 == 613) {
				this.aBoolean40 = !this.aBoolean40;
			}
			if (local11 >= 601 && local11 <= 612) {
				this.method165();
				if (this.aString14.length() > 0) {
					this.aClass1_Sub3_Sub3_5.method372(252);
					this.aClass1_Sub3_Sub3_5.method379(Class40.method530(this.aString14));
					this.aClass1_Sub3_Sub3_5.method373(local11 - 601);
					this.aClass1_Sub3_Sub3_5.method373(this.aBoolean40 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(352) RuntimeException local352) {
			signlink.reporterror("66186, " + arg0 + ", " + 0 + ", " + local352.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method87() {
		try {
			for (@Pc(10) Class1_Sub6 local10 = (Class1_Sub6) this.aClass28_5.method448(); local10 != null; local10 = (Class1_Sub6) this.aClass28_5.method450(this.anInt161)) {
				@Pc(14) boolean local14 = false;
				local10.anInt640 += this.anInt294;
				if (local10.anInt639 == -1) {
					local10.anInt639 = 0;
					local14 = true;
				}
				label70: {
					do {
						do {
							if (local10.anInt640 <= local10.aClass19_2.anIntArray188[local10.anInt639]) {
								break label70;
							}
							local10.anInt640 -= local10.aClass19_2.anIntArray188[local10.anInt639] + 1;
							local10.anInt639++;
							local14 = true;
						} while (local10.anInt639 < local10.aClass19_2.anInt530);
						local10.anInt639 -= local10.aClass19_2.anInt531;
					} while (local10.anInt639 >= 0 && local10.anInt639 < local10.aClass19_2.anInt530);
					local10.method559();
					local14 = false;
				}
				if (local14) {
					@Pc(96) int local96 = local10.anInt634;
					@Pc(99) int local99 = local10.anInt636;
					@Pc(102) int local102 = local10.anInt637;
					@Pc(104) int local104 = 0;
					if (local10.anInt635 == 0) {
						local104 = this.aClass33_1.method486(local96, local99, local102);
					}
					if (local10.anInt635 == 1) {
						local104 = this.aClass33_1.method487(local102, local96, local99);
					}
					if (local10.anInt635 == 2) {
						local104 = this.aClass33_1.method488(local96, local99, local102);
					}
					if (local10.anInt635 == 3) {
						local104 = this.aClass33_1.method489(local96, local99, local102);
					}
					if (local104 != 0 && (local104 >> 14 & 0x7FFF) == local10.anInt638) {
						@Pc(171) int local171 = this.anIntArrayArrayArray3[local96][local99][local102];
						@Pc(182) int local182 = this.anIntArrayArrayArray3[local96][local99 + 1][local102];
						@Pc(195) int local195 = this.anIntArrayArrayArray3[local96][local99 + 1][local102 + 1];
						@Pc(206) int local206 = this.anIntArrayArrayArray3[local96][local99][local102 + 1];
						@Pc(210) Class2 local210 = Class2.method23(local10.anInt638);
						@Pc(212) int local212 = -1;
						if (local10.anInt639 != -1) {
							local212 = local10.aClass19_2.anIntArray186[local10.anInt639];
						}
						@Pc(235) int local235;
						@Pc(239) int local239;
						@Pc(243) int local243;
						@Pc(258) Class1_Sub3_Sub1 local258;
						if (local10.anInt635 == 2) {
							local235 = this.aClass33_1.method490(local96, local99, local102, local104);
							local239 = local235 & 0x1F;
							local243 = local235 >> 6;
							if (local239 == 11) {
								local239 = 10;
							}
							local258 = local210.method26(local239, local243, local171, local182, local195, local206, local212);
							this.aClass33_1.method475(local99, local258, local96, local102);
						} else if (local10.anInt635 == 1) {
							@Pc(282) Class1_Sub3_Sub1 local282 = local210.method26(4, 0, local171, local182, local195, local206, local212);
							this.aClass33_1.method477(local282, local99, local102, local96);
						} else if (local10.anInt635 == 0) {
							local235 = this.aClass33_1.method490(local96, local99, local102, local104);
							local239 = local235 & 0x1F;
							local243 = local235 >> 6;
							if (local239 == 2) {
								@Pc(320) int local320 = local243 + 1 & 0x3;
								@Pc(332) Class1_Sub3_Sub1 local332 = local210.method26(2, local243 + 4, local171, local182, local195, local206, local212);
								@Pc(342) Class1_Sub3_Sub1 local342 = local210.method26(2, local320, local171, local182, local195, local206, local212);
								this.aClass33_1.method480(local342, local332, local102, local96, local99);
							} else {
								local258 = local210.method26(local239, local243, local171, local182, local195, local206, local212);
								this.aClass33_1.method479(local96, local258, local99, local102);
							}
						} else if (local10.anInt635 == 3) {
							local235 = this.aClass33_1.method490(local96, local99, local102, local104);
							local239 = local235 >> 6;
							@Pc(399) Class1_Sub3_Sub1 local399 = local210.method26(22, local239, local171, local182, local195, local206, local212);
							this.aClass33_1.method478(local399, local96, local99, local102);
						}
					} else {
						local10.method559();
					}
				}
			}
		} catch (@Pc(418) RuntimeException local418) {
			signlink.reporterror("23716, " + 6 + ", " + local418.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	private void method88(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			this.anInt207 += 0;
			if (arg1 >= 1 && arg2 >= 1 && arg1 <= 102 && arg2 <= 102) {
				if (aBoolean60 && arg4 != this.anInt337) {
					return;
				}
				@Pc(26) int local26 = 0;
				if (arg6 == 0) {
					local26 = this.aClass33_1.method486(arg4, arg1, arg2);
				}
				if (arg6 == 1) {
					local26 = this.aClass33_1.method487(arg2, arg4, arg1);
				}
				if (arg6 == 2) {
					local26 = this.aClass33_1.method488(arg4, arg1, arg2);
				}
				if (arg6 == 3) {
					local26 = this.aClass33_1.method489(arg4, arg1, arg2);
				}
				@Pc(82) int local82;
				if (local26 != 0) {
					local82 = this.aClass33_1.method490(arg4, arg1, arg2, local26);
					@Pc(88) int local88 = local26 >> 14 & 0x7FFF;
					@Pc(92) int local92 = local82 & 0x1F;
					@Pc(96) int local96 = local82 >> 6;
					@Pc(108) Class2 local108;
					if (arg6 == 0) {
						this.aClass33_1.method481(arg4, arg2, arg1);
						local108 = Class2.method23(local88);
						if (local108.aBoolean9) {
							this.aClass9Array1[arg4].method253(local108.aBoolean10, arg2, local92, arg1, local96);
						}
					}
					if (arg6 == 1) {
						this.aClass33_1.method482(arg2, arg1, arg4);
					}
					if (arg6 == 2) {
						this.aClass33_1.method483(arg4, arg1, arg2);
						local108 = Class2.method23(local88);
						if (arg1 + local108.anInt39 > 103 || arg2 + local108.anInt39 > 103 || arg1 + local108.anInt40 > 103 || arg2 + local108.anInt40 > 103) {
							return;
						}
						if (local108.aBoolean9) {
							this.aClass9Array1[arg4].method254(local96, local108.anInt39, arg1, arg2, local108.aBoolean10, local108.anInt40);
						}
					}
					if (arg6 == 3) {
						this.aClass33_1.method484(arg1, arg2, arg4);
						local108 = Class2.method23(local88);
						if (local108.aBoolean9 && local108.aBoolean11) {
							this.aClass9Array1[arg4].method256(arg2, arg1);
						}
					}
				}
				if (arg3 >= 0) {
					local82 = arg4;
					if (arg4 < 3 && (this.aByteArrayArrayArray7[1][arg1][arg2] & 0x2) == 2) {
						local82 = arg4 + 1;
					}
					Class4.method50(this.aClass9Array1[arg4], this.aClass28_5, arg2, arg3, this.aClass33_1, this.anIntArrayArrayArray3, arg5, arg4, arg0, local82, arg1);
					return;
				}
			}
		} catch (@Pc(257) RuntimeException local257) {
			signlink.reporterror("48560, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local257.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method89() {
		try {
			this.anInt190 = 0;
			@Pc(55) int local55;
			@Pc(75) int local75;
			for (@Pc(6) int local6 = -1; local6 < this.anInt149 + this.anInt180; local6++) {
				@Pc(14) Class1_Sub1_Sub3 local14;
				if (local6 == -1) {
					local14 = this.aClass1_Sub1_Sub3_Sub2_1;
				} else if (local6 < this.anInt149) {
					local14 = this.aClass1_Sub1_Sub3_Sub2Array1[this.anIntArray32[local6]];
				} else {
					local14 = this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray44[local6 - this.anInt149]];
				}
				if (local14 != null && local14.method563(this.anInt155)) {
					if (local6 < this.anInt149) {
						local55 = 30;
						@Pc(58) Class1_Sub1_Sub3_Sub2 local58 = (Class1_Sub1_Sub3_Sub2) local14;
						if (local58.anInt932 != 0) {
							this.method82(local14, local14.anInt924 + 15);
							if (this.anInt187 > -1) {
								for (local75 = 0; local75 < 8; local75++) {
									if ((local58.anInt932 & 0x1 << local75) != 0) {
										this.aClass1_Sub3_Sub2_Sub2Array5[local75].method319(this.anInt188 - local55, this.anInt187 - 12);
										local55 -= 25;
									}
								}
							}
						}
						if (local6 >= 0 && this.anInt198 == 10 && this.anInt293 == this.anIntArray32[local6]) {
							this.method82(local14, local14.anInt924 + 15);
							if (this.anInt187 > -1) {
								this.aClass1_Sub3_Sub2_Sub2Array5[7].method319(this.anInt188 - local55, this.anInt187 - 12);
							}
						}
					} else if (this.anInt198 == 1 && this.anInt311 == this.anIntArray44[local6 - this.anInt149] && anInt332 % 20 < 10) {
						this.method82(local14, local14.anInt924 + 15);
						if (this.anInt187 > -1) {
							this.aClass1_Sub3_Sub2_Sub2Array5[2].method319(this.anInt188 - 28, this.anInt187 - 12);
						}
					}
					if (local14.aString29 != null && (local6 >= this.anInt149 || this.anInt164 == 0 || this.anInt164 == 3 || this.anInt164 == 1 && this.method156(((Class1_Sub1_Sub3_Sub2) local14).aString30))) {
						this.method82(local14, local14.anInt924);
						if (this.anInt187 > -1 && this.anInt190 < this.anInt191) {
							this.anIntArray50[this.anInt190] = this.aClass1_Sub3_Sub2_Sub4_3.method360(local14.aString29) / 2;
							this.anIntArray49[this.anInt190] = this.aClass1_Sub3_Sub2_Sub4_3.anInt528;
							this.anIntArray47[this.anInt190] = this.anInt187;
							this.anIntArray48[this.anInt190] = this.anInt188;
							this.anIntArray51[this.anInt190] = local14.anInt893;
							this.anIntArray52[this.anInt190] = local14.anInt894;
							this.anIntArray53[this.anInt190] = local14.anInt892;
							this.aStringArray7[this.anInt190++] = local14.aString29;
							if (this.anInt152 == 0 && local14.anInt894 == 1) {
								this.anIntArray49[this.anInt190] += 10;
								this.anIntArray48[this.anInt190] += 5;
							}
							if (this.anInt152 == 0 && local14.anInt894 == 2) {
								this.anIntArray50[this.anInt190] = 60;
							}
						}
					}
					if (local14.anInt897 > anInt332 + 100) {
						this.method82(local14, local14.anInt924 + 15);
						if (this.anInt187 > -1) {
							local55 = local14.anInt898 * 30 / local14.anInt899;
							if (local55 > 30) {
								local55 = 30;
							}
							Class1_Sub3_Sub2.method354(this.anInt187 - 15, local55, 65280, this.anInt188 - 3, 5);
							Class1_Sub3_Sub2.method354(this.anInt187 + local55 - 15, 30 - local55, 16711680, this.anInt188 - 3, 5);
						}
					}
					if (local14.anInt897 > anInt332 + 330) {
						this.method82(local14, local14.anInt924 / 2);
						if (this.anInt187 > -1) {
							this.aClass1_Sub3_Sub2_Sub2Array3[local14.anInt896].method319(this.anInt188 - 12, this.anInt187 - 12);
							this.aClass1_Sub3_Sub2_Sub4_1.method358(this.anInt188 + 4, String.valueOf(local14.anInt895), this.anInt187, 0);
							this.aClass1_Sub3_Sub2_Sub4_1.method358(this.anInt188 + 3, String.valueOf(local14.anInt895), this.anInt187 - 1, 16777215);
						}
					}
				}
			}
			for (@Pc(469) int local469 = 0; local469 < this.anInt190; local469++) {
				local55 = this.anIntArray47[local469];
				@Pc(481) int local481 = this.anIntArray48[local469];
				local75 = this.anIntArray50[local469];
				@Pc(491) int local491 = this.anIntArray49[local469];
				@Pc(493) boolean local493 = true;
				while (local493) {
					local493 = false;
					for (@Pc(499) int local499 = 0; local499 < local469; local499++) {
						if (local481 + 2 > this.anIntArray48[local499] - this.anIntArray49[local499] && local481 - local491 < this.anIntArray48[local499] + 2 && local55 - local75 < this.anIntArray47[local499] + this.anIntArray50[local499] && local55 + local75 > this.anIntArray47[local499] - this.anIntArray50[local499] && this.anIntArray48[local499] - this.anIntArray49[local499] < local481) {
							local481 = this.anIntArray48[local499] - this.anIntArray49[local499];
							local493 = true;
						}
					}
				}
				this.anInt187 = this.anIntArray47[local469];
				this.anInt188 = this.anIntArray48[local469] = local481;
				@Pc(598) String local598 = this.aStringArray7[local469];
				if (this.anInt152 == 0) {
					@Pc(603) int local603 = 16776960;
					if (this.anIntArray51[local469] < 6) {
						local603 = this.anIntArray45[this.anIntArray51[local469]];
					}
					if (this.anIntArray51[local469] == 6) {
						local603 = this.anInt182 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray51[local469] == 7) {
						local603 = this.anInt182 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray51[local469] == 8) {
						local603 = this.anInt182 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(678) int local678;
					if (this.anIntArray51[local469] == 9) {
						local678 = 150 - this.anIntArray53[local469];
						if (local678 < 50) {
							local603 = local678 * 1280 + 16711680;
						} else if (local678 < 100) {
							local603 = 16776960 - (local678 - 50) * 327680;
						} else if (local678 < 150) {
							local603 = (local678 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray51[local469] == 10) {
						local678 = 150 - this.anIntArray53[local469];
						if (local678 < 50) {
							local603 = local678 * 5 + 16711680;
						} else if (local678 < 100) {
							local603 = 16711935 - (local678 - 50) * 327680;
						} else if (local678 < 150) {
							local603 = (local678 - 100) * 327680 + 255 - (local678 - 100) * 5;
						}
					}
					if (this.anIntArray51[local469] == 11) {
						local678 = 150 - this.anIntArray53[local469];
						if (local678 < 50) {
							local603 = 16777215 - local678 * 327685;
						} else if (local678 < 100) {
							local603 = (local678 - 50) * 327685 + 65280;
						} else if (local678 < 150) {
							local603 = 16777215 - (local678 - 100) * 327680;
						}
					}
					if (this.anIntArray52[local469] == 0) {
						this.aClass1_Sub3_Sub2_Sub4_3.method358(this.anInt188 + 1, local598, this.anInt187, 0);
						this.aClass1_Sub3_Sub2_Sub4_3.method358(this.anInt188, local598, this.anInt187, local603);
					}
					if (this.anIntArray52[local469] == 1) {
						this.aClass1_Sub3_Sub2_Sub4_3.method362(0, this.anInt182, this.anInt187, this.anInt188 + 1, local598);
						this.aClass1_Sub3_Sub2_Sub4_3.method362(local603, this.anInt182, this.anInt187, this.anInt188, local598);
					}
					if (this.anIntArray52[local469] == 2) {
						local678 = this.aClass1_Sub3_Sub2_Sub4_3.method360(local598);
						@Pc(899) int local899 = (150 - this.anIntArray53[local469]) * (local678 + 100) / 150;
						Class1_Sub3_Sub2.method352(this.anInt187 - 50, 0, this.anInt187 + 50, 334);
						this.aClass1_Sub3_Sub2_Sub4_3.method361(476, this.anInt188 + 1, local598, this.anInt187 + 50 - local899, 0);
						this.aClass1_Sub3_Sub2_Sub4_3.method361(476, this.anInt188, local598, this.anInt187 + 50 - local899, local603);
						Class1_Sub3_Sub2.method351();
					}
				} else {
					this.aClass1_Sub3_Sub2_Sub4_3.method358(this.anInt188 + 1, local598, this.anInt187, 0);
					this.aClass1_Sub3_Sub2_Sub4_3.method358(this.anInt188, local598, this.anInt187, 16776960);
				}
			}
		} catch (@Pc(982) RuntimeException local982) {
			signlink.reporterror("71193, " + 22 + ", " + local982.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBIII)Z")
	private boolean method90(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(7) int local7 = arg3 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass33_1.method490(this.anInt337, arg0, arg2, arg3);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(43) Class2 local43 = Class2.method23(local7);
				@Pc(51) int local51;
				@Pc(54) int local54;
				if (local31 == 0 || local31 == 2) {
					local51 = local43.anInt39;
					local54 = local43.anInt40;
				} else {
					local51 = local43.anInt40;
					local54 = local43.anInt39;
				}
				@Pc(65) int local65 = local43.anInt51;
				if (local31 != 0) {
					local65 = (local65 << local31 & 0xF) + (local65 >> 4 - local31);
				}
				this.method198(0, false, 2, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], arg2, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 107, local65, 0, arg0, local54, local51);
			} else {
				this.method198(local25 + 1, false, 2, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], arg2, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 107, 0, local31, arg0, 0, 0);
			}
			this.anInt225 = super.anInt128;
			this.anInt226 = super.anInt129;
			this.anInt228 = 2;
			this.anInt227 = 0;
			this.aClass1_Sub3_Sub3_5.method372(arg1);
			this.aClass1_Sub3_Sub3_5.method374(arg0 + this.anInt295);
			this.aClass1_Sub3_Sub3_5.method374(arg2 + this.anInt296);
			this.aClass1_Sub3_Sub3_5.method374(local7);
			return true;
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("17014, " + arg0 + ", " + 96 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method91() {
		try {
			@Pc(2) int local2 = this.anInt288;
			@Pc(5) int local5 = this.anInt289;
			@Pc(8) int local8 = this.anInt290;
			@Pc(11) int local11 = this.anInt291;
			Class1_Sub3_Sub2.method354(local2, local8, 6116423, local5, local11);
			Class1_Sub3_Sub2.method354(local2 + 1, local8 - 2, 0, local5 + 1, 16);
			Class1_Sub3_Sub2.method355(local8 - 2, 0, local2 + 1, local5 + 18, local11 - 19);
			this.aClass1_Sub3_Sub2_Sub4_3.method361(476, local5 + 14, "Choose Option", local2 + 3, 6116423);
			@Pc(71) int local71 = super.anInt125;
			@Pc(74) int local74 = super.anInt126;
			if (this.anInt287 == 0) {
				local71 -= 8;
				local74 -= 11;
			}
			if (this.anInt287 == 1) {
				local71 -= 562;
				local74 -= 231;
			}
			if (this.anInt287 == 2) {
				local71 -= 22;
				local74 -= 375;
			}
			for (@Pc(93) int local93 = 0; local93 < this.anInt153; local93++) {
				@Pc(108) int local108 = local5 + (this.anInt153 - 1 - local93) * 15 + 31;
				@Pc(110) int local110 = 16777215;
				if (local71 > local2 && local71 < local2 + local8 && local74 > local108 - 13 && local74 < local108 + 3) {
					local110 = 16776960;
				}
				this.aClass1_Sub3_Sub2_Sub4_3.method363(this.aStringArray9[local93], local110, local2 + 3, true, local108);
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("50842, " + 5 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method92() {
		try {
			@Pc(6) Class1_Sub1_Sub2 local6 = (Class1_Sub1_Sub2) this.aClass28_1.method448();
			this.anInt207 += 0;
			while (local6 != null) {
				if (local6.anInt55 != this.anInt337 || local6.aBoolean21) {
					local6.method559();
				} else if (anInt332 >= local6.anInt54) {
					local6.method29(this.anInt294);
					if (local6.aBoolean21) {
						local6.method559();
					} else {
						this.aClass33_1.method470(null, local6.anInt58, -1, local6.anInt57, 0, 60, false, local6.anInt56, local6, local6.anInt55);
					}
				}
				local6 = (Class1_Sub1_Sub2) this.aClass28_1.method450(this.anInt161);
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("86208, " + 0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method93() {
		try {
			this.aBoolean72 &= true;
			if (super.anInt127 == 1) {
				if (super.anInt128 >= 8 && super.anInt128 <= 108 && super.anInt129 >= 490 && super.anInt129 <= 522) {
					this.anInt164 = (this.anInt164 + 1) % 4;
					this.aBoolean54 = true;
					this.aBoolean43 = true;
					this.aClass1_Sub3_Sub3_5.method372(197);
					this.aClass1_Sub3_Sub3_5.method373(this.anInt164);
					this.aClass1_Sub3_Sub3_5.method373(this.anInt199);
					this.aClass1_Sub3_Sub3_5.method373(this.anInt250);
				}
				if (super.anInt128 >= 137 && super.anInt128 <= 237 && super.anInt129 >= 490 && super.anInt129 <= 522) {
					this.anInt199 = (this.anInt199 + 1) % 3;
					this.aBoolean54 = true;
					this.aBoolean43 = true;
					this.aClass1_Sub3_Sub3_5.method372(197);
					this.aClass1_Sub3_Sub3_5.method373(this.anInt164);
					this.aClass1_Sub3_Sub3_5.method373(this.anInt199);
					this.aClass1_Sub3_Sub3_5.method373(this.anInt250);
				}
				if (super.anInt128 >= 275 && super.anInt128 <= 375 && super.anInt129 >= 490 && super.anInt129 <= 522) {
					this.anInt250 = (this.anInt250 + 1) % 3;
					this.aBoolean54 = true;
					this.aBoolean43 = true;
					this.aClass1_Sub3_Sub3_5.method372(197);
					this.aClass1_Sub3_Sub3_5.method373(this.anInt164);
					this.aClass1_Sub3_Sub3_5.method373(this.anInt199);
					this.aClass1_Sub3_Sub3_5.method373(this.anInt250);
				}
				if (super.anInt128 >= 416 && super.anInt128 <= 516 && super.anInt129 >= 490 && super.anInt129 <= 522) {
					this.method165();
					this.aString14 = "";
					this.aBoolean40 = false;
					for (@Pc(188) int local188 = 0; local188 < Class15.aClass15Array1.length; local188++) {
						if (Class15.aClass15Array1[local188] != null && Class15.aClass15Array1[local188].anInt463 == 600) {
							this.anInt235 = this.anInt220 = Class15.aClass15Array1[local188].anInt460;
							break;
						}
					}
				}
				anInt254++;
				if (anInt254 > 195) {
					anInt254 = 0;
					this.aClass1_Sub3_Sub3_5.method372(24);
					this.aClass1_Sub3_Sub3_5.method373(239);
					return;
				}
			}
		} catch (@Pc(236) RuntimeException local236) {
			signlink.reporterror("89791, " + true + ", " + local236.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
	private void method94(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		try {
			if (arg0 == 0 && this.anInt176 != -1) {
				this.aString7 = arg2;
				super.anInt127 = 0;
			}
			if (this.anInt299 == -1) {
				this.aBoolean43 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray31[local20] = this.anIntArray31[local20 - 1];
				this.aStringArray5[local20] = this.aStringArray5[local20 - 1];
				this.aStringArray6[local20] = this.aStringArray6[local20 - 1];
			}
			this.anIntArray31[0] = arg0;
			this.anInt207 += 0;
			this.aStringArray5[0] = arg1;
			this.aStringArray6[0] = arg2;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("17289, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method95(@OriginalArg(0) int arg0) {
		try {
			if (!aBoolean60) {
				@Pc(17) Class1_Sub3_Sub2_Sub3 local17;
				@Pc(25) int local25;
				@Pc(33) int local33;
				@Pc(36) byte[] local36;
				@Pc(39) byte[] local39;
				@Pc(41) int local41;
				if (Class1_Sub3_Sub2_Sub1.anIntArray141[17] >= arg0) {
					local17 = Class1_Sub3_Sub2_Sub1.aClass1_Sub3_Sub2_Sub3Array4[17];
					local25 = local17.anInt502 * local17.anInt503 - 1;
					local33 = local17.anInt502 * this.anInt294 * 2;
					local36 = local17.aByteArray6;
					local39 = this.aByteArray4;
					for (local41 = 0; local41 <= local25; local41++) {
						local39[local41] = local36[local41 - local33 & local25];
					}
					local17.aByteArray6 = local39;
					this.aByteArray4 = local36;
					Class1_Sub3_Sub2_Sub1.method292(17);
				}
				if (Class1_Sub3_Sub2_Sub1.anIntArray141[24] >= arg0) {
					local17 = Class1_Sub3_Sub2_Sub1.aClass1_Sub3_Sub2_Sub3Array4[24];
					local25 = local17.anInt502 * local17.anInt503 - 1;
					local33 = local17.anInt502 * this.anInt294 * 2;
					local36 = local17.aByteArray6;
					local39 = this.aByteArray4;
					for (local41 = 0; local41 <= local25; local41++) {
						local39[local41] = local36[local41 - local33 & local25];
					}
					local17.aByteArray6 = local39;
					this.aByteArray4 = local36;
					Class1_Sub3_Sub2_Sub1.method292(24);
					return;
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("83065, " + arg0 + ", " + false + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!kb;II)V")
	private void method96(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			while (true) {
				if (arg0.anInt549 + 10 < arg1 * 8) {
					@Pc(14) int local14 = arg0.method394(11);
					if (local14 != 2047) {
						if (this.aClass1_Sub1_Sub3_Sub2Array1[local14] == null) {
							this.aClass1_Sub1_Sub3_Sub2Array1[local14] = new Class1_Sub1_Sub3_Sub2();
							if (this.aClass1_Sub3_Sub3Array1[local14] != null) {
								this.aClass1_Sub1_Sub3_Sub2Array1[local14].method564(this.aClass1_Sub3_Sub3Array1[local14]);
							}
						}
						this.anIntArray32[this.anInt149++] = local14;
						@Pc(60) Class1_Sub1_Sub3_Sub2 local60 = this.aClass1_Sub1_Sub3_Sub2Array1[local14];
						local60.anInt923 = anInt332;
						@Pc(68) int local68 = arg0.method394(5);
						if (local68 > 15) {
							local68 -= 32;
						}
						@Pc(77) int local77 = arg0.method394(5);
						if (local77 > 15) {
							local77 -= 32;
						}
						@Pc(86) int local86 = arg0.method394(1);
						local60.method561(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0] + local77, local86 == 1, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0] + local68);
						@Pc(114) int local114 = arg0.method394(1);
						if (local114 == 1) {
							this.anIntArray33[this.anInt150++] = local14;
						}
						continue;
					}
				}
				arg0.method395(this.anInt183);
				return;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("96116, " + arg0 + ", " + arg1 + ", " + -782 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!kb;I)V")
	private void method97(@OriginalArg(1) Class1_Sub3_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt324 = 0;
			this.anInt150 = 0;
			this.method136(arg0, arg1, (byte) 2);
			this.method110(arg0, arg1);
			this.method96(arg0, arg1);
			this.method143(arg0, arg1, this.aBoolean45);
			@Pc(43) int local43;
			for (@Pc(36) int local36 = 0; local36 < this.anInt324; local36++) {
				local43 = this.anIntArray84[local36];
				if (this.aClass1_Sub1_Sub3_Sub2Array1[local43].anInt923 != anInt332) {
					this.aClass1_Sub1_Sub3_Sub2Array1[local43] = null;
				}
			}
			if (arg0.anInt548 != arg1) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.anInt548 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local43 = 0; local43 < this.anInt149; local43++) {
				if (this.aClass1_Sub1_Sub3_Sub2Array1[this.anIntArray32[local43]] == null) {
					signlink.reporterror(this.aString12 + " null entry in pl list - pos:" + local43 + " size:" + this.anInt149);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("49057, " + false + ", " + arg0 + ", " + arg1 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method98(@OriginalArg(1) int arg0) {
		try {
			if (arg0 >= 0) {
				if (this.aBoolean46) {
					this.aBoolean46 = false;
					this.aBoolean43 = true;
				}
				@Pc(21) int local21 = this.anIntArray58[arg0];
				@Pc(26) int local26 = this.anIntArray59[arg0];
				@Pc(31) int local31 = this.anIntArray60[arg0];
				@Pc(36) int local36 = this.anIntArray61[arg0];
				if (local31 >= 2000) {
					local31 -= 2000;
				}
				@Pc(48) String local48;
				@Pc(52) int local52;
				if (local31 == 316) {
					local48 = this.aStringArray9[arg0];
					local52 = local48.indexOf("@whi@");
					if (local52 != -1) {
						this.method165();
						this.aString14 = local48.substring(local52 + 5).trim();
						this.aBoolean40 = false;
						for (@Pc(71) int local71 = 0; local71 < Class15.aClass15Array1.length; local71++) {
							if (Class15.aClass15Array1[local71] != null && Class15.aClass15Array1[local71].anInt463 == 600) {
								this.anInt235 = this.anInt220 = Class15.aClass15Array1[local71].anInt460;
								break;
							}
						}
					}
				}
				@Pc(107) Class1_Sub1_Sub3_Sub2 local107;
				if (local31 == 48) {
					local107 = this.aClass1_Sub1_Sub3_Sub2Array1[local36];
					if (local107 != null) {
						this.method198(0, false, 2, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], local107.anIntArray233[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 107, 0, 0, local107.anIntArray232[0], 1, 1);
						this.anInt225 = super.anInt128;
						this.anInt226 = super.anInt129;
						this.anInt228 = 2;
						this.anInt227 = 0;
						this.aClass1_Sub3_Sub3_5.method372(39);
						this.aClass1_Sub3_Sub3_5.method374(local36);
						this.aClass1_Sub3_Sub3_5.method374(this.anInt320);
					}
				}
				@Pc(172) Class5 local172;
				@Pc(181) String local181;
				if (local31 == 1308) {
					local172 = Class5.method54(local36);
					if (local172.aByteArray3 == null) {
						local181 = "It's a " + local172.aString3 + ".";
					} else {
						local181 = new String(local172.aByteArray3);
					}
					this.method94(0, "", local181);
				}
				if (local31 == 63) {
					this.aClass1_Sub3_Sub3_5.method372(158);
					this.aClass1_Sub3_Sub3_5.method374(local36);
					this.aClass1_Sub3_Sub3_5.method374(local21);
					this.aClass1_Sub3_Sub3_5.method374(local26);
					this.aClass1_Sub3_Sub3_5.method374(this.anInt320);
					this.anInt255 = 0;
					this.anInt256 = local26;
					this.anInt257 = local21;
					this.anInt258 = 2;
					if (Class15.aClass15Array1[local26].anInt460 == this.anInt220) {
						this.anInt258 = 1;
					}
					if (Class15.aClass15Array1[local26].anInt460 == this.anInt299) {
						this.anInt258 = 3;
					}
				}
				@Pc(265) Class1_Sub1_Sub3_Sub1 local265;
				if (local31 == 1814) {
					local265 = this.aClass1_Sub1_Sub3_Sub1Array1[local36];
					if (local265 != null) {
						if (local265.aClass3_1.aByteArray2 == null) {
							local181 = "It's a " + local265.aClass3_1.aString2 + ".";
						} else {
							local181 = new String(local265.aClass3_1.aByteArray2);
						}
						this.method94(0, "", local181);
					}
				}
				@Pc(305) Class15 local305;
				if (local31 == 706) {
					local305 = Class15.aClass15Array1[local26];
					@Pc(307) boolean local307 = true;
					if (local305.anInt463 > 0) {
						local307 = this.method86(local305);
					}
					if (local307) {
						this.aClass1_Sub3_Sub3_5.method372(222);
						this.aClass1_Sub3_Sub3_5.method374(local26);
					}
				}
				if (local31 == 1659) {
					this.method90(local21, 181, local26, local36);
				}
				if (local31 == 104) {
					this.method90(local21, 168, local26, local36);
				}
				if (local31 == 73 && !this.aBoolean62) {
					this.aClass1_Sub3_Sub3_5.method372(218);
					this.aClass1_Sub3_Sub3_5.method374(local26);
					this.aBoolean62 = true;
				}
				if (local31 == 988 || local31 == 345 || local31 == 249 || local31 == 960 || local31 == 40) {
					local265 = this.aClass1_Sub1_Sub3_Sub1Array1[local36];
					if (local265 != null) {
						this.method198(0, false, 2, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], local265.anIntArray233[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 107, 0, 0, local265.anIntArray232[0], 1, 1);
						this.anInt225 = super.anInt128;
						this.anInt226 = super.anInt129;
						this.anInt228 = 2;
						this.anInt227 = 0;
						if (local31 == 960) {
							this.aClass1_Sub3_Sub3_5.method372(114);
						}
						if (local31 == 345) {
							anInt205 += local36;
							if (anInt205 >= 116) {
								this.aClass1_Sub3_Sub3_5.method372(217);
							}
							this.aClass1_Sub3_Sub3_5.method372(191);
						}
						if (local31 == 249) {
							this.aClass1_Sub3_Sub3_5.method372(89);
						}
						if (local31 == 40) {
							this.aClass1_Sub3_Sub3_5.method372(198);
						}
						if (local31 == 988) {
							this.aClass1_Sub3_Sub3_5.method372(236);
						}
						this.aClass1_Sub3_Sub3_5.method374(local36);
					}
				}
				@Pc(508) String local508;
				if (local31 == 1418) {
					@Pc(496) int local496 = local36 >> 14 & 0x7FFF;
					@Pc(499) Class2 local499 = Class2.method23(local496);
					if (local499.aByteArray1 == null) {
						local508 = "It's a " + local499.aString1 + ".";
					} else {
						local508 = new String(local499.aByteArray1);
					}
					this.method94(0, "", local508);
				}
				if (local31 == 500) {
					local265 = this.aClass1_Sub1_Sub3_Sub1Array1[local36];
					if (local265 != null) {
						this.method198(0, false, 2, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], local265.anIntArray233[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 107, 0, 0, local265.anIntArray232[0], 1, 1);
						this.anInt225 = super.anInt128;
						this.anInt226 = super.anInt129;
						this.anInt228 = 2;
						this.anInt227 = 0;
						this.aClass1_Sub3_Sub3_5.method372(244);
						this.aClass1_Sub3_Sub3_5.method374(local36);
						this.aClass1_Sub3_Sub3_5.method374(this.anInt320);
					}
				}
				if (local31 == 967) {
					this.aClass1_Sub3_Sub3_5.method372(222);
					this.aClass1_Sub3_Sub3_5.method374(local26);
					local305 = Class15.aClass15Array1[local26];
					if (local305.anIntArrayArray15 != null && local305.anIntArrayArray15[0][0] == 5) {
						local52 = local305.anIntArrayArray15[0][1];
						this.anIntArray41[local52] = 1 - this.anIntArray41[local52];
						this.method199(local52);
						this.aBoolean44 = true;
					}
				}
				if (local31 == 941) {
					local305 = Class15.aClass15Array1[local26];
					this.anInt319 = 1;
					this.anInt320 = local26;
					this.anInt321 = local305.anInt482;
					this.anInt193 = 0;
					local181 = local305.aString22;
					if (local181.indexOf(" ") != -1) {
						local181 = local181.substring(0, local181.indexOf(" "));
					}
					local508 = local305.aString22;
					if (local508.indexOf(" ") != -1) {
						local508 = local508.substring(local508.indexOf(" ") + 1);
					}
					this.aString15 = local181 + " " + local305.aString23 + " " + local508;
					if (this.anInt321 == 16) {
						this.aBoolean44 = true;
						this.anInt197 = 3;
						this.aBoolean42 = true;
					}
				} else {
					@Pc(753) boolean local753;
					if (local31 == 543) {
						local753 = this.method198(0, false, 2, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], local26, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 107, 0, 0, local21, 0, 0);
						if (!local753) {
							this.method198(0, false, 2, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], local26, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 107, 0, 0, local21, 1, 1);
						}
						this.anInt225 = super.anInt128;
						this.anInt226 = super.anInt129;
						this.anInt228 = 2;
						this.anInt227 = 0;
						this.aClass1_Sub3_Sub3_5.method372(241);
						this.aClass1_Sub3_Sub3_5.method374(local21 + this.anInt295);
						this.aClass1_Sub3_Sub3_5.method374(local26 + this.anInt296);
						this.aClass1_Sub3_Sub3_5.method374(local36);
						this.aClass1_Sub3_Sub3_5.method374(this.anInt320);
					}
					if (local31 == 1974) {
						local172 = Class5.method54(local36);
						if (local26 >= 100000) {
							local181 = local26 + " x " + local172.aString3;
						} else if (local172.aByteArray3 == null) {
							local181 = "It's a " + local172.aString3 + ".";
						} else {
							local181 = new String(local172.aByteArray3);
						}
						this.method94(0, "", local181);
					}
					if (local31 == 829) {
						anInt212 += local26;
						if (anInt212 >= 132) {
							this.aClass1_Sub3_Sub3_5.method372(27);
							this.aClass1_Sub3_Sub3_5.method374(17379);
						}
						this.method90(local21, 223, local26, local36);
					}
					if (local31 == 103) {
						local107 = this.aClass1_Sub1_Sub3_Sub2Array1[local36];
						if (local107 != null) {
							this.method198(0, false, 2, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], local107.anIntArray233[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 107, 0, 0, local107.anIntArray232[0], 1, 1);
							this.anInt225 = super.anInt128;
							this.anInt226 = super.anInt129;
							this.anInt228 = 2;
							this.anInt227 = 0;
							this.aClass1_Sub3_Sub3_5.method372(184);
							this.aClass1_Sub3_Sub3_5.method374(local36);
							this.aClass1_Sub3_Sub3_5.method374(this.anInt196);
							this.aClass1_Sub3_Sub3_5.method374(this.anInt194);
							this.aClass1_Sub3_Sub3_5.method374(this.anInt195);
						}
					}
					if (local31 == 672) {
						this.aClass1_Sub3_Sub3_5.method372(222);
						this.aClass1_Sub3_Sub3_5.method374(local26);
						local305 = Class15.aClass15Array1[local26];
						if (local305.anIntArrayArray15 != null && local305.anIntArrayArray15[0][0] == 5) {
							local52 = local305.anIntArrayArray15[0][1];
							if (this.anIntArray41[local52] != local305.anIntArray152[0]) {
								this.anIntArray41[local52] = local305.anIntArray152[0];
								this.method199(local52);
								this.aBoolean44 = true;
							}
						}
					}
					if (local31 == 357) {
						this.anInt193 = 1;
						this.anInt194 = local21;
						this.anInt195 = local26;
						this.anInt196 = local36;
						this.aString5 = Class5.method54(local36).aString3;
						this.anInt319 = 0;
					} else {
						if (local31 == 237) {
							this.aClass1_Sub3_Sub3_5.method372(106);
							this.aClass1_Sub3_Sub3_5.method374(local36);
							this.aClass1_Sub3_Sub3_5.method374(local21);
							this.aClass1_Sub3_Sub3_5.method374(local26);
							this.aClass1_Sub3_Sub3_5.method374(this.anInt196);
							this.aClass1_Sub3_Sub3_5.method374(this.anInt194);
							this.aClass1_Sub3_Sub3_5.method374(this.anInt195);
							this.anInt255 = 0;
							this.anInt256 = local26;
							this.anInt257 = local21;
							this.anInt258 = 2;
							if (Class15.aClass15Array1[local26].anInt460 == this.anInt220) {
								this.anInt258 = 1;
							}
							if (Class15.aClass15Array1[local26].anInt460 == this.anInt299) {
								this.anInt258 = 3;
							}
						}
						if (local31 == 871 || local31 == 526 || local31 == 156 || local31 == 120 || local31 == 796) {
							if (local31 == 796) {
								if ((local36 & 0x3) == 0) {
									anInt302++;
								}
								if (anInt302 >= 124) {
									this.aClass1_Sub3_Sub3_5.method372(167);
									this.aClass1_Sub3_Sub3_5.method377(0);
								}
								this.aClass1_Sub3_Sub3_5.method372(122);
							}
							if (local31 == 526) {
								this.aClass1_Sub3_Sub3_5.method372(0);
							}
							if (local31 == 120) {
								this.aClass1_Sub3_Sub3_5.method372(112);
							}
							if (local31 == 871) {
								anInt139 += local36;
								if (anInt139 >= 76) {
									this.aClass1_Sub3_Sub3_5.method372(214);
									this.aClass1_Sub3_Sub3_5.method373(171);
								}
								this.aClass1_Sub3_Sub3_5.method372(140);
							}
							if (local31 == 156) {
								anInt338++;
								if (anInt338 >= 62) {
									this.aClass1_Sub3_Sub3_5.method372(82);
									this.aClass1_Sub3_Sub3_5.method373(142);
								}
								this.aClass1_Sub3_Sub3_5.method372(155);
							}
							this.aClass1_Sub3_Sub3_5.method374(local36);
							this.aClass1_Sub3_Sub3_5.method374(local21);
							this.aClass1_Sub3_Sub3_5.method374(local26);
							this.anInt255 = 0;
							this.anInt256 = local26;
							this.anInt257 = local21;
							this.anInt258 = 2;
							if (Class15.aClass15Array1[local26].anInt460 == this.anInt220) {
								this.anInt258 = 1;
							}
							if (Class15.aClass15Array1[local26].anInt460 == this.anInt299) {
								this.anInt258 = 3;
							}
						}
						@Pc(1311) int local1311;
						if (local31 == 595 || local31 == 835) {
							local48 = this.aStringArray9[arg0];
							local52 = local48.indexOf("@whi@");
							if (local52 != -1) {
								local48 = local48.substring(local52 + 5).trim();
								local508 = Class40.method534(Class40.method531(Class40.method530(local48)));
								@Pc(1309) boolean local1309 = false;
								for (local1311 = 0; local1311 < this.anInt149; local1311++) {
									@Pc(1321) Class1_Sub1_Sub3_Sub2 local1321 = this.aClass1_Sub1_Sub3_Sub2Array1[this.anIntArray32[local1311]];
									if (local1321 != null && local1321.aString30 != null && local1321.aString30.equalsIgnoreCase(local508)) {
										this.method198(0, false, 2, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], local1321.anIntArray233[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 107, 0, 0, local1321.anIntArray232[0], 1, 1);
										if (local31 == 595) {
											this.aClass1_Sub3_Sub3_5.method372(245);
										}
										if (local31 == 835) {
											this.aClass1_Sub3_Sub3_5.method372(173);
										}
										this.aClass1_Sub3_Sub3_5.method374(this.anIntArray32[local1311]);
										local1309 = true;
										break;
									}
								}
								if (!local1309) {
									this.method94(0, "", "Unable to find " + local508);
								}
							}
						}
						if (local31 == 309) {
							this.method165();
						}
						@Pc(1444) long local1444;
						if (local31 == 447 || local31 == 158 || local31 == 804 || local31 == 521) {
							local48 = this.aStringArray9[arg0];
							local52 = local48.indexOf("@whi@");
							if (local52 != -1) {
								local1444 = Class40.method530(local48.substring(local52 + 5).trim());
								if (local31 == 447) {
									this.method124(local1444);
								}
								if (local31 == 158) {
									this.method168(local1444);
								}
								if (local31 == 804) {
									this.method129(local1444);
								}
								if (local31 == 521) {
									this.method173(local1444, this.aBoolean69);
								}
							}
						}
						if (local31 == 737 && this.method90(local21, 9, local26, local36)) {
							this.aClass1_Sub3_Sub3_5.method374(this.anInt320);
						}
						if (local31 == 798) {
							anInt162++;
							if (anInt162 >= 135) {
								this.aClass1_Sub3_Sub3_5.method372(253);
								this.aClass1_Sub3_Sub3_5.method374(10151);
							}
							this.method90(local21, 207, local26, local36);
						}
						if (local31 == 493) {
							local265 = this.aClass1_Sub1_Sub3_Sub1Array1[local36];
							if (local265 != null) {
								this.method198(0, false, 2, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], local265.anIntArray233[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 107, 0, 0, local265.anIntArray232[0], 1, 1);
								this.anInt225 = super.anInt128;
								this.anInt226 = super.anInt129;
								this.anInt228 = 2;
								this.anInt227 = 0;
								this.aClass1_Sub3_Sub3_5.method372(36);
								this.aClass1_Sub3_Sub3_5.method374(local36);
								this.aClass1_Sub3_Sub3_5.method374(this.anInt196);
								this.aClass1_Sub3_Sub3_5.method374(this.anInt194);
								this.aClass1_Sub3_Sub3_5.method374(this.anInt195);
							}
						}
						if (local31 == 203) {
							local753 = this.method198(0, false, 2, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], local26, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 107, 0, 0, local21, 0, 0);
							if (!local753) {
								this.method198(0, false, 2, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], local26, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 107, 0, 0, local21, 1, 1);
							}
							this.anInt225 = super.anInt128;
							this.anInt226 = super.anInt129;
							this.anInt228 = 2;
							this.anInt227 = 0;
							this.aClass1_Sub3_Sub3_5.method372(183);
							this.aClass1_Sub3_Sub3_5.method374(local21 + this.anInt295);
							this.aClass1_Sub3_Sub3_5.method374(local26 + this.anInt296);
							this.aClass1_Sub3_Sub3_5.method374(local36);
							this.aClass1_Sub3_Sub3_5.method374(this.anInt196);
							this.aClass1_Sub3_Sub3_5.method374(this.anInt194);
							this.aClass1_Sub3_Sub3_5.method374(this.anInt195);
						}
						if (local31 == 873) {
							this.method90(local21, 196, local26, local36);
						}
						if (local31 == 981) {
							if (this.aBoolean63) {
								this.aClass33_1.method498(local21 - 8, local26 - 11);
							} else {
								this.aClass33_1.method498(super.anInt128 - 8, super.anInt129 - 11);
							}
						}
						if (local31 == 1528 || local31 == 1741 || local31 == 593 || local31 == 1596) {
							local107 = this.aClass1_Sub1_Sub3_Sub2Array1[local36];
							if (local107 != null) {
								this.method198(0, false, 2, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], local107.anIntArray233[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 107, 0, 0, local107.anIntArray232[0], 1, 1);
								this.anInt225 = super.anInt128;
								this.anInt226 = super.anInt129;
								this.anInt228 = 2;
								this.anInt227 = 0;
								if (local31 == 1596) {
									this.aClass1_Sub3_Sub3_5.method372(173);
								}
								if (local31 == 1741) {
									if ((local36 & 0x3) == 0) {
										anInt262++;
									}
									if (anInt262 >= 139) {
										this.aClass1_Sub3_Sub3_5.method372(84);
										this.aClass1_Sub3_Sub3_5.method377(0);
									}
									this.aClass1_Sub3_Sub3_5.method372(63);
								}
								if (local31 == 1528) {
									this.aClass1_Sub3_Sub3_5.method372(245);
								}
								if (local31 == 593) {
									this.aClass1_Sub3_Sub3_5.method372(28);
								}
								this.aClass1_Sub3_Sub3_5.method374(local36);
							}
						}
						if (local31 == 134 || local31 == 701 || local31 == 570 || local31 == 719 || local31 == 440) {
							if (local31 == 134) {
								this.aClass1_Sub3_Sub3_5.method372(90);
							}
							if (local31 == 701) {
								this.aClass1_Sub3_Sub3_5.method372(47);
							}
							if (local31 == 719) {
								this.aClass1_Sub3_Sub3_5.method372(186);
							}
							if (local31 == 570) {
								this.aClass1_Sub3_Sub3_5.method372(121);
							}
							if (local31 == 440) {
								this.aClass1_Sub3_Sub3_5.method372(31);
							}
							this.aClass1_Sub3_Sub3_5.method374(local36);
							this.aClass1_Sub3_Sub3_5.method374(local21);
							this.aClass1_Sub3_Sub3_5.method374(local26);
							this.anInt255 = 0;
							this.anInt256 = local26;
							this.anInt257 = local21;
							this.anInt258 = 2;
							if (Class15.aClass15Array1[local26].anInt460 == this.anInt220) {
								this.anInt258 = 1;
							}
							if (Class15.aClass15Array1[local26].anInt460 == this.anInt299) {
								this.anInt258 = 3;
							}
						}
						if (local31 == 125) {
							local48 = this.aStringArray9[arg0];
							local52 = local48.indexOf("@whi@");
							if (local52 != -1) {
								local1444 = Class40.method530(local48.substring(local52 + 5).trim());
								local1311 = -1;
								for (@Pc(1981) int local1981 = 0; local1981 < this.anInt267; local1981++) {
									if (this.aLongArray4[local1981] == local1444) {
										local1311 = local1981;
										break;
									}
								}
								if (local1311 != -1 && this.anIntArray72[local1311] > 0) {
									this.aBoolean43 = true;
									this.aBoolean46 = false;
									this.aBoolean65 = true;
									this.aString11 = "";
									this.anInt142 = 3;
									this.aLong9 = this.aLongArray4[local1311];
									this.aString10 = "Enter message to send to " + this.aStringArray8[local1311];
								}
							}
						}
						if (local31 == 505 && this.method90(local21, 139, local26, local36)) {
							this.aClass1_Sub3_Sub3_5.method374(this.anInt196);
							this.aClass1_Sub3_Sub3_5.method374(this.anInt194);
							this.aClass1_Sub3_Sub3_5.method374(this.anInt195);
						}
						if (local31 == 56 || local31 == 321 || local31 == 552 || local31 == 43 || local31 == 687) {
							local753 = this.method198(0, false, 2, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], local26, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 107, 0, 0, local21, 0, 0);
							if (!local753) {
								this.method198(0, false, 2, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], local26, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 107, 0, 0, local21, 1, 1);
							}
							this.anInt225 = super.anInt128;
							this.anInt226 = super.anInt129;
							this.anInt228 = 2;
							this.anInt227 = 0;
							if (local31 == 43) {
								this.aClass1_Sub3_Sub3_5.method372(143);
							}
							if (local31 == 552) {
								this.aClass1_Sub3_Sub3_5.method372(226);
							}
							if (local31 == 687) {
								anInt278++;
								if (anInt278 >= 121) {
									this.aClass1_Sub3_Sub3_5.method372(13);
									this.aClass1_Sub3_Sub3_5.method373(128);
								}
								this.aClass1_Sub3_Sub3_5.method372(192);
							}
							if (local31 == 321) {
								this.aClass1_Sub3_Sub3_5.method372(48);
							}
							if (local31 == 56) {
								this.aClass1_Sub3_Sub3_5.method372(91);
							}
							this.aClass1_Sub3_Sub3_5.method374(local21 + this.anInt295);
							this.aClass1_Sub3_Sub3_5.method374(local26 + this.anInt296);
							this.aClass1_Sub3_Sub3_5.method374(local36);
						}
						this.anInt193 = 0;
						this.anInt319 = 0;
					}
				}
			}
		} catch (@Pc(2225) RuntimeException local2225) {
			signlink.reporterror("2860, " + 0 + ", " + arg0 + ", " + local2225.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method99() {
		try {
			this.aBoolean57 = false;
			while (this.aBoolean68) {
				try {
					Thread.sleep(50L);
				} catch (@Pc(14) Exception local14) {
				}
				@Pc(17) Object local17 = this.anObject1;
				@Pc(22) String local22;
				@Pc(25) int local25;
				@Pc(28) int local28;
				synchronized (this.anObject1) {
					local22 = this.aString16;
					local25 = this.anInt206;
					local28 = this.anInt234;
					this.aString16 = null;
					this.anInt206 = 0;
					this.anInt234 = 0;
				}
				if (local22 != null) {
					@Pc(55) byte[] local55 = signlink.cacheload(local22 + ".mid");
					@Pc(72) int local72;
					if (local55 != null && local25 != 12345678) {
						this.aCRC32_1.reset();
						this.aCRC32_1.update(local55);
						local72 = (int) this.aCRC32_1.getValue();
						if (local72 != local25) {
							local55 = null;
						}
					}
					if (local55 == null) {
						try {
							@Pc(94) DataInputStream local94 = this.method181(local22 + "_" + local25 + ".mid");
							local55 = new byte[local28];
							@Pc(109) int local109;
							for (@Pc(99) int local99 = 0; local99 < local28; local99 += local109) {
								local109 = local94.read(local55, local99, local28 - local99);
								if (local109 == -1) {
									@Pc(115) byte[] local115 = new byte[local99];
									for (@Pc(117) int local117 = 0; local117 < local99; local117++) {
										local115[local117] = local55[local117];
									}
									local55 = local115;
									local28 = local99;
									break;
								}
							}
							local94.close();
							signlink.cachesave(local22 + ".mid", local55);
						} catch (@Pc(156) Exception local156) {
						}
					}
					if (local55 == null) {
						return;
					}
					local72 = (new Class1_Sub3_Sub3(local55, 0)).method388();
					@Pc(170) byte[] local170 = new byte[local72];
					Class34.method511(local170, local72, local55, local28, 4);
					this.method78(local72, local170, true);
				}
			}
		} catch (@Pc(188) RuntimeException local188) {
			signlink.reporterror("12122, " + 1 + ", " + local188.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method100() {
		try {
			@Pc(8) int local8 = this.aClass1_Sub1_Sub3_Sub2_1.anInt881 + this.anInt167;
			@Pc(15) int local15 = this.aClass1_Sub1_Sub3_Sub2_1.anInt882 + this.anInt284;
			if (this.anInt158 - local8 < -500 || this.anInt158 - local8 > 500 || this.anInt159 - local15 < -500 || this.anInt159 - local15 > 500) {
				this.anInt158 = local8;
				this.anInt159 = local15;
			}
			if (this.anInt158 != local8) {
				this.anInt158 += (local8 - this.anInt158) / 16;
			}
			if (this.anInt159 != local15) {
				this.anInt159 += (local15 - this.anInt159) / 16;
			}
			if (super.anIntArray28[1] == 1) {
				this.anInt316 += (-this.anInt316 - 24) / 2;
			} else if (super.anIntArray28[2] == 1) {
				this.anInt316 += (24 - this.anInt316) / 2;
			} else {
				this.anInt316 /= 2;
			}
			if (super.anIntArray28[3] == 1) {
				this.anInt317 += (12 - this.anInt317) / 2;
			} else if (super.anIntArray28[4] == 1) {
				this.anInt317 += (-this.anInt317 - 12) / 2;
			} else {
				this.anInt317 /= 2;
			}
			this.anInt315 = this.anInt315 + this.anInt316 / 2 & 0x7FF;
			this.anInt314 += this.anInt317 / 2;
			if (this.anInt314 < 128) {
				this.anInt314 = 128;
			}
			if (this.anInt314 > 383) {
				this.anInt314 = 383;
			}
			@Pc(202) int local202 = this.anInt158 >> 7;
			@Pc(207) int local207 = this.anInt159 >> 7;
			@Pc(225) int local225 = this.method132(this.anInt158, this.aByte19, this.anInt159, this.anInt337);
			@Pc(227) int local227 = 0;
			@Pc(243) int local243;
			if (local202 > 3 && local207 > 3 && local202 < 100 && local207 < 100) {
				for (local243 = local202 - 4; local243 <= local202 + 4; local243++) {
					for (@Pc(249) int local249 = local207 - 4; local249 <= local207 + 4; local249++) {
						@Pc(254) int local254 = this.anInt337;
						if (local254 < 3 && (this.aByteArrayArrayArray7[1][local243][local249] & 0x2) == 2) {
							local254++;
						}
						@Pc(281) int local281 = local225 - this.anIntArrayArrayArray3[local254][local243][local249];
						if (local281 > local227) {
							local227 = local281;
						}
					}
				}
			}
			anInt189++;
			if (anInt189 > 77) {
				anInt189 = 0;
				this.aClass1_Sub3_Sub3_5.method372(57);
			}
			local243 = local227 * 192;
			if (local243 > 98048) {
				local243 = 98048;
			}
			if (local243 < 32768) {
				local243 = 32768;
			}
			if (local243 > this.anInt145) {
				this.anInt145 += (local243 - this.anInt145) / 24;
			} else if (local243 < this.anInt145) {
				this.anInt145 += (local243 - this.anInt145) / 80;
			}
		} catch (@Pc(359) RuntimeException local359) {
			signlink.reporterror("54842, " + true + ", " + local359.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)Ljava/net/Socket;")
	private Socket method101(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method69() {
		try {
			signlink.reporterror = false;
			try {
				if (this.aClass6_1 != null) {
					this.aClass6_1.method201();
				}
			} catch (@Pc(11) Exception local11) {
			}
			this.aClass6_1 = null;
			this.method182();
			this.aBoolean68 = false;
			this.aClass1_Sub3_Sub3_5 = null;
			this.aClass1_Sub3_Sub3_6 = null;
			this.aClass1_Sub3_Sub3_4 = null;
			this.anIntArray46 = null;
			this.aByteArrayArray1 = null;
			this.aByteArrayArray2 = null;
			this.anIntArrayArrayArray3 = null;
			this.aByteArrayArrayArray7 = null;
			this.aClass33_1 = null;
			this.aClass9Array1 = null;
			this.anIntArrayArray5 = null;
			this.anIntArrayArray2 = null;
			this.anIntArray86 = null;
			this.anIntArray87 = null;
			this.aByteArray4 = null;
			this.aClass32_16 = null;
			this.aClass32_17 = null;
			this.aClass32_18 = null;
			this.aClass32_19 = null;
			this.aClass32_13 = null;
			this.aClass32_14 = null;
			this.aClass32_15 = null;
			this.aClass32_3 = null;
			this.aClass32_4 = null;
			this.aClass32_5 = null;
			this.aClass32_6 = null;
			this.aClass32_7 = null;
			this.aClass32_8 = null;
			this.aClass32_9 = null;
			this.aClass32_10 = null;
			this.aClass32_11 = null;
			this.aClass32_12 = null;
			this.aClass1_Sub3_Sub2_Sub3_13 = null;
			this.aClass1_Sub3_Sub2_Sub3_14 = null;
			this.aClass1_Sub3_Sub2_Sub3_15 = null;
			this.aClass1_Sub3_Sub2_Sub3_3 = null;
			this.aClass1_Sub3_Sub2_Sub3_4 = null;
			this.aClass1_Sub3_Sub2_Sub3_5 = null;
			this.aClass1_Sub3_Sub2_Sub3Array1 = null;
			this.aClass1_Sub3_Sub2_Sub3_16 = null;
			this.aClass1_Sub3_Sub2_Sub3_17 = null;
			this.aClass1_Sub3_Sub2_Sub3_18 = null;
			this.aClass1_Sub3_Sub2_Sub3_19 = null;
			this.aClass1_Sub3_Sub2_Sub3_20 = null;
			this.aClass1_Sub3_Sub2_Sub3_6 = null;
			this.aClass1_Sub3_Sub2_Sub3_7 = null;
			this.aClass1_Sub3_Sub2_Sub3_8 = null;
			this.aClass1_Sub3_Sub2_Sub3_9 = null;
			this.aClass1_Sub3_Sub2_Sub3_10 = null;
			this.aClass1_Sub3_Sub2_Sub2_3 = null;
			this.aClass1_Sub3_Sub2_Sub2Array3 = null;
			this.aClass1_Sub3_Sub2_Sub2Array5 = null;
			this.aClass1_Sub3_Sub2_Sub2Array4 = null;
			this.aClass1_Sub3_Sub2_Sub2_6 = null;
			this.aClass1_Sub3_Sub2_Sub2_7 = null;
			this.aClass1_Sub3_Sub2_Sub2_8 = null;
			this.aClass1_Sub3_Sub2_Sub2_9 = null;
			this.aClass1_Sub3_Sub2_Sub3Array2 = null;
			this.aClass1_Sub3_Sub2_Sub2Array6 = null;
			this.anIntArrayArray3 = null;
			this.aClass1_Sub1_Sub3_Sub2Array1 = null;
			this.anIntArray32 = null;
			this.anIntArray33 = null;
			this.aClass1_Sub3_Sub3Array1 = null;
			this.anIntArray84 = null;
			this.aClass1_Sub1_Sub3_Sub1Array1 = null;
			this.anIntArray44 = null;
			this.aClass28ArrayArrayArray1 = null;
			this.aClass28_2 = null;
			this.aClass28_3 = null;
			this.aClass28_4 = null;
			this.aClass28_1 = null;
			this.aClass28_5 = null;
			this.anIntArray58 = null;
			this.anIntArray59 = null;
			this.anIntArray60 = null;
			this.anIntArray61 = null;
			this.aStringArray9 = null;
			this.anIntArray41 = null;
			this.anIntArray35 = null;
			this.anIntArray36 = null;
			this.aClass1_Sub3_Sub2_Sub2Array7 = null;
			this.aClass1_Sub3_Sub2_Sub2_10 = null;
			this.anInt207 += 0;
			this.aStringArray8 = null;
			this.aLongArray4 = null;
			this.anIntArray72 = null;
			this.aClass32_23 = null;
			this.aClass32_24 = null;
			this.aClass32_20 = null;
			this.aClass32_21 = null;
			this.aClass32_22 = null;
			this.aClass32_25 = null;
			this.aClass32_26 = null;
			this.aClass32_27 = null;
			this.aClass32_28 = null;
			this.method77((byte) 9);
			Class2.method22(this.aBoolean49);
			Class3.method31(this.aBoolean49);
			Class5.method53(this.aBoolean49);
			Class11.aClass11Array1 = null;
			Class13.aClass13Array1 = null;
			Class15.aClass15Array1 = null;
			Class17.aClass17Array1 = null;
			Class19.aClass19Array1 = null;
			Class21.aClass21Array1 = null;
			Class21.aClass35_8 = null;
			Class23.aClass23Array1 = null;
			super.aClass32_2 = null;
			Class1_Sub1_Sub3_Sub2.aClass35_9 = null;
			Class1_Sub3_Sub2_Sub1.method285(this.aBoolean49);
			Class33.method458(this.aBoolean49);
			Class1_Sub3_Sub1.method223(this.aBoolean49);
			Class10.aClass10Array1 = null;
			Class12.aClass12Array1 = null;
			System.gc();
		} catch (@Pc(368) RuntimeException local368) {
			signlink.reporterror("55541, " + 0 + ", " + local368.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method102() {
		try {
			if (this.anInt179 > 1) {
				this.anInt179--;
			}
			if (this.anInt211 > 0) {
				this.anInt211--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method135(); local22++) {
			}
			if (this.aBoolean72) {
				@Pc(200) int local200;
				@Pc(148) int local148;
				for (@Pc(39) int local39 = 0; local39 < this.anInt175; local39++) {
					if (this.anIntArray73[local39] <= 0) {
						@Pc(48) boolean local48 = false;
						try {
							if (this.anIntArray79[local39] != this.anInt204 || this.anIntArray55[local39] != this.anInt151) {
								@Pc(82) Class1_Sub3_Sub3 local82 = Class43.method554(this.anIntArray79[local39], this.anIntArray55[local39]);
								if (System.currentTimeMillis() + (long) (local82.anInt548 / 22) > this.aLong7 + (long) (this.anInt186 / 22)) {
									this.anInt186 = local82.anInt548;
									this.aLong7 = System.currentTimeMillis();
									if (this.method117(local82.aByteArray7, local82.anInt548)) {
										this.anInt204 = this.anIntArray79[local39];
										this.anInt151 = this.anIntArray55[local39];
									} else {
										local48 = true;
									}
								}
							} else if (!this.method118(this.aByte25)) {
								local48 = true;
							}
						} catch (@Pc(132) Exception local132) {
						}
						if (local48 && this.anIntArray73[local39] != -5) {
							this.anIntArray73[local39] = -5;
						} else {
							this.anInt175--;
							for (local148 = local39; local148 < this.anInt175; local148++) {
								this.anIntArray79[local148] = this.anIntArray79[local148 + 1];
								this.anIntArray55[local148] = this.anIntArray55[local148 + 1];
								this.anIntArray73[local148] = this.anIntArray73[local148 + 1];
							}
							local39--;
						}
					} else {
						local200 = this.anIntArray73[local39]--;
					}
				}
				if (this.anInt253 > 0) {
					this.anInt253 -= 20;
					if (this.anInt253 < 0) {
						this.anInt253 = 0;
					}
					if (this.anInt253 == 0 && this.aBoolean58 && !aBoolean60) {
						this.method171(this.anInt216, this.aString17, this.anInt281);
					}
				}
				if (Class8.aBoolean84) {
					@Pc(245) Class1_Sub3_Sub3 local245 = Class8.method210();
					if (local245 != null) {
						this.aClass1_Sub3_Sub3_5.method372(53);
						this.aClass1_Sub3_Sub3_5.method374(local245.anInt548);
						this.aClass1_Sub3_Sub3_5.method381(local245.aByteArray7, local245.anInt548);
						local245.method371();
					}
				}
				this.anInt209++;
				if (this.anInt209 > 750) {
					this.method122(366);
				}
				this.method144();
				this.method184();
				this.method141();
				this.method172();
				if ((super.anIntArray28[1] == 1 || super.anIntArray28[2] == 1 || super.anIntArray28[3] == 1 || super.anIntArray28[4] == 1) && this.anInt160++ > 5) {
					this.anInt160 = 0;
					this.aClass1_Sub3_Sub3_5.method372(109);
					this.aClass1_Sub3_Sub3_5.method374(this.anInt314);
					this.aClass1_Sub3_Sub3_5.method374(this.anInt315);
					this.aClass1_Sub3_Sub3_5.method373(this.anInt218);
					this.aClass1_Sub3_Sub3_5.method373(this.anInt170);
				}
				this.anInt294++;
				if (this.anInt228 != 0) {
					this.anInt227 += 20;
					if (this.anInt227 >= 400) {
						this.anInt228 = 0;
					}
				}
				if (this.anInt258 != 0) {
					this.anInt255++;
					if (this.anInt255 >= 15) {
						if (this.anInt258 == 2) {
							this.aBoolean44 = true;
						}
						if (this.anInt258 == 3) {
							this.aBoolean43 = true;
						}
						this.anInt258 = 0;
					}
				}
				if (this.anInt272 != 0) {
					this.anInt247++;
					if (super.anInt125 > this.anInt273 + 5 || super.anInt125 < this.anInt273 - 5 || super.anInt126 > this.anInt274 + 5 || super.anInt126 < this.anInt274 - 5) {
						this.aBoolean66 = true;
					}
					if (super.anInt124 == 0) {
						if (this.anInt272 == 2) {
							this.aBoolean44 = true;
						}
						if (this.anInt272 == 3) {
							this.aBoolean43 = true;
						}
						this.anInt272 = 0;
						if (this.aBoolean66 && this.anInt247 >= 5) {
							this.anInt137 = -1;
							this.method81();
							if (this.anInt137 == this.anInt270 && this.anInt136 != this.anInt271) {
								@Pc(499) Class15 local499 = Class15.aClass15Array1[this.anInt270];
								local148 = local499.anIntArray149[this.anInt136];
								local499.anIntArray149[this.anInt136] = local499.anIntArray149[this.anInt271];
								local499.anIntArray149[this.anInt271] = local148;
								local148 = local499.anIntArray150[this.anInt136];
								local499.anIntArray150[this.anInt136] = local499.anIntArray150[this.anInt271];
								local499.anIntArray150[this.anInt271] = local148;
								this.aClass1_Sub3_Sub3_5.method372(80);
								this.aClass1_Sub3_Sub3_5.method374(this.anInt270);
								this.aClass1_Sub3_Sub3_5.method374(this.anInt271);
								this.aClass1_Sub3_Sub3_5.method374(this.anInt136);
							}
						} else if ((this.anInt221 == 1 || this.method137(this.anInt153 - 1)) && this.anInt153 > 2) {
							this.method193();
						} else if (this.anInt153 > 0) {
							this.method98(this.anInt153 - 1);
						}
						this.anInt255 = 10;
						super.anInt127 = 0;
					}
				}
				@Pc(607) int local607;
				if (Class33.anInt699 != -1) {
					local607 = Class33.anInt699;
					local148 = Class33.anInt700;
					@Pc(632) boolean local632 = this.method198(0, true, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], local148, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 107, 0, 0, local607, 0, 0);
					Class33.anInt699 = -1;
					if (local632) {
						this.anInt225 = super.anInt128;
						this.anInt226 = super.anInt129;
						this.anInt228 = 1;
						this.anInt227 = 0;
					}
				}
				if (super.anInt127 == 1 && this.aString7 != null) {
					this.aString7 = null;
					this.aBoolean43 = true;
					super.anInt127 = 0;
				}
				this.method138();
				this.method126();
				this.method155();
				this.method93();
				if (super.anInt124 == 1 || super.anInt127 == 1) {
					this.anInt266++;
				}
				if (this.anInt185 == 2) {
					this.method100();
				}
				if (this.anInt185 == 2 && this.aBoolean61) {
					this.method153();
				}
				for (local607 = 0; local607 < 5; local607++) {
					local200 = this.anIntArray83[local607]++;
				}
				this.method200();
				anInt301++;
				if (anInt301 > 54) {
					anInt301 = 0;
					this.aClass1_Sub3_Sub3_5.method372(180);
				}
				super.anInt123++;
				if (super.anInt123 > 4500) {
					this.anInt211 = 250;
					super.anInt123 -= 500;
					this.aClass1_Sub3_Sub3_5.method372(161);
				}
				this.anInt181++;
				if (this.anInt181 > 500) {
					this.anInt181 = 0;
					local148 = (int) (Math.random() * 8.0D);
					if ((local148 & 0x1) == 1) {
						this.anInt167 += this.anInt168;
					}
					if ((local148 & 0x2) == 2) {
						this.anInt284 += this.anInt285;
					}
					if ((local148 & 0x4) == 4) {
						this.anInt214 += this.anInt215;
					}
				}
				if (this.anInt167 < -50) {
					this.anInt168 = 2;
				}
				if (this.anInt167 > 50) {
					this.anInt168 = -2;
				}
				if (this.anInt284 < -55) {
					this.anInt285 = 2;
				}
				if (this.anInt284 > 55) {
					this.anInt285 = -2;
				}
				if (this.anInt214 < -40) {
					this.anInt215 = 1;
				}
				if (this.anInt214 > 40) {
					this.anInt215 = -1;
				}
				this.anInt312++;
				if (this.anInt312 > 500) {
					this.anInt312 = 0;
					local148 = (int) (Math.random() * 8.0D);
					if ((local148 & 0x1) == 1) {
						this.anInt218 += this.anInt219;
					}
					if ((local148 & 0x2) == 2) {
						this.anInt170 += this.anInt171;
					}
				}
				if (this.anInt218 < -60) {
					this.anInt219 = 2;
				}
				if (this.anInt218 > 60) {
					this.anInt219 = -2;
				}
				if (this.anInt170 < -20) {
					this.anInt171 = 1;
				}
				if (this.anInt170 > 10) {
					this.anInt171 = -1;
				}
				this.anInt210++;
				if (this.anInt210 > 50) {
					this.aClass1_Sub3_Sub3_5.method372(126);
				}
				try {
					if (this.aClass6_1 != null && this.aClass1_Sub3_Sub3_5.anInt548 > 0) {
						this.aClass6_1.method205(this.aClass1_Sub3_Sub3_5.aByteArray7, this.aClass1_Sub3_Sub3_5.anInt548, this.anInt325);
						this.aClass1_Sub3_Sub3_5.anInt548 = 0;
						this.anInt210 = 0;
					}
				} catch (@Pc(975) IOException local975) {
					this.method122(366);
				} catch (@Pc(980) Exception local980) {
					this.method177();
				}
			}
		} catch (@Pc(985) RuntimeException local985) {
			signlink.reporterror("49112, " + -30820 + ", " + local985.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method103(@OriginalArg(0) int arg0) {
		try {
			this.aClass32_16.method455();
			Class1_Sub3_Sub2_Sub1.anIntArray139 = this.anIntArray38;
			@Pc(10) boolean local10 = false;
			this.aClass1_Sub3_Sub2_Sub3_13.method346(0, 0);
			if (this.anInt241 != -1) {
				this.method146(Class15.aClass15Array1[this.anInt241], 0, 0, 0);
			} else if (this.anIntArray57[this.anInt197] != -1) {
				this.method146(Class15.aClass15Array1[this.anIntArray57[this.anInt197]], 0, 0, 0);
			}
			if (this.aBoolean63 && this.anInt287 == 1) {
				this.method91();
			}
			this.aClass32_16.method456(231, 562, super.aGraphics2);
			this.aClass32_18.method455();
			Class1_Sub3_Sub2_Sub1.anIntArray139 = this.anIntArray39;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("95780, " + arg0 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIB)V")
	private void method104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			this.aClass1_Sub3_Sub2_Sub3_11.method346(arg3, arg4);
			this.aClass1_Sub3_Sub2_Sub3_12.method346(arg3 + arg1 - 16, arg4);
			Class1_Sub3_Sub2.method354(arg4, 16, this.anInt213, arg3 + 16, arg1 - 32);
			@Pc(35) int local35 = (arg1 - 32) * arg1 / arg0;
			if (local35 < 8) {
				local35 = 8;
			}
			@Pc(52) int local52 = (arg1 - local35 - 32) * arg2 / (arg0 - arg1);
			Class1_Sub3_Sub2.method354(arg4, 16, this.anInt275, arg3 + local52 + 16, local35);
			Class1_Sub3_Sub2.method357(this.anInt166, arg3 + local52 + 16, local35, arg4);
			Class1_Sub3_Sub2.method357(this.anInt166, arg3 + local52 + 16, local35, arg4 + 1);
			Class1_Sub3_Sub2.method356(16, arg3 + local52 + 16, this.anInt249, arg4, this.anInt166);
			Class1_Sub3_Sub2.method356(16, arg3 + local52 + 17, this.anInt249, arg4, this.anInt166);
			Class1_Sub3_Sub2.method357(this.anInt222, arg3 + local52 + 16, local35, arg4 + 15);
			Class1_Sub3_Sub2.method357(this.anInt222, arg3 + local52 + 17, local35 - 1, arg4 + 14);
			Class1_Sub3_Sub2.method356(16, arg3 + local52 + local35 + 15, this.anInt249, arg4, this.anInt222);
			Class1_Sub3_Sub2.method356(15, arg3 + local52 + local35 + 14, this.anInt249, arg4 + 1, this.anInt222);
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("71167, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -99 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method106() {
		try {
			this.aClass32_17.method455();
			@Pc(13) int local13 = this.anInt315 + this.anInt218 & 0x7FF;
			@Pc(21) int local21 = this.aClass1_Sub1_Sub3_Sub2_1.anInt881 / 32 + 48;
			@Pc(29) int local29 = 464 - this.aClass1_Sub1_Sub3_Sub2_1.anInt882 / 32;
			this.aClass1_Sub3_Sub2_Sub2_10.method325(this.anIntArray77, 151, this.anInt170 + 256, local29, 9, local21, 21, this.anIntArray30, local13, 146);
			this.aClass1_Sub3_Sub2_Sub2_3.method325(this.anIntArray75, 33, 256, 25, 0, 25, 0, this.anIntArray78, this.anInt315, 33);
			for (@Pc(78) int local78 = 0; local78 < this.anInt157; local78++) {
				local21 = this.anIntArray35[local78] * 4 + 2 - this.aClass1_Sub1_Sub3_Sub2_1.anInt881 / 32;
				local29 = this.anIntArray36[local78] * 4 + 2 - this.aClass1_Sub1_Sub3_Sub2_1.anInt882 / 32;
				this.method75(local29, local21, this.aClass1_Sub3_Sub2_Sub2Array7[local78]);
			}
			@Pc(130) int local130;
			for (@Pc(126) int local126 = 0; local126 < 104; local126++) {
				for (local130 = 0; local130 < 104; local130++) {
					@Pc(142) Class28 local142 = this.aClass28ArrayArrayArray1[this.anInt337][local126][local130];
					if (local142 != null) {
						local21 = local126 * 4 + 2 - this.aClass1_Sub1_Sub3_Sub2_1.anInt881 / 32;
						local29 = local130 * 4 + 2 - this.aClass1_Sub1_Sub3_Sub2_1.anInt882 / 32;
						this.method75(local29, local21, this.aClass1_Sub3_Sub2_Sub2_6);
					}
				}
			}
			for (local130 = 0; local130 < this.anInt180; local130++) {
				@Pc(195) Class1_Sub1_Sub3_Sub1 local195 = this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray44[local130]];
				if (local195 != null && local195.method563(this.anInt155) && local195.aClass3_1.aBoolean26) {
					local21 = local195.anInt881 / 32 - this.aClass1_Sub1_Sub3_Sub2_1.anInt881 / 32;
					local29 = local195.anInt882 / 32 - this.aClass1_Sub1_Sub3_Sub2_1.anInt882 / 32;
					this.method75(local29, local21, this.aClass1_Sub3_Sub2_Sub2_7);
				}
			}
			for (@Pc(242) int local242 = 0; local242 < this.anInt149; local242++) {
				@Pc(252) Class1_Sub1_Sub3_Sub2 local252 = this.aClass1_Sub1_Sub3_Sub2Array1[this.anIntArray32[local242]];
				if (local252 != null && local252.method563(this.anInt155)) {
					local21 = local252.anInt881 / 32 - this.aClass1_Sub1_Sub3_Sub2_1.anInt881 / 32;
					local29 = local252.anInt882 / 32 - this.aClass1_Sub1_Sub3_Sub2_1.anInt882 / 32;
					@Pc(283) boolean local283 = false;
					@Pc(287) long local287 = Class40.method530(local252.aString30);
					for (@Pc(289) int local289 = 0; local289 < this.anInt267; local289++) {
						if (local287 == this.aLongArray4[local289] && this.anIntArray72[local289] != 0) {
							local283 = true;
							break;
						}
					}
					if (local283) {
						this.method75(local29, local21, this.aClass1_Sub3_Sub2_Sub2_9);
					} else {
						this.method75(local29, local21, this.aClass1_Sub3_Sub2_Sub2_8);
					}
				}
			}
			if (this.anInt279 != 0) {
				local21 = this.anInt279 * 4 + 2 - this.aClass1_Sub1_Sub3_Sub2_1.anInt881 / 32;
				local29 = this.anInt280 * 4 + 2 - this.aClass1_Sub1_Sub3_Sub2_1.anInt882 / 32;
				this.method75(local29, local21, this.aClass1_Sub3_Sub2_Sub2_11);
			}
			Class1_Sub3_Sub2.method354(93, 3, 16777215, 82, 3);
			this.aClass32_18.method455();
		} catch (@Pc(384) RuntimeException local384) {
			signlink.reporterror("34476, " + 7 + ", " + local384.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method107(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString8 = "";
				this.aString9 = "Connecting to server...";
				this.method128();
			}
			this.aClass6_1 = new Class6(this.method101(anInt252 + 43594), this, this.anInt263);
			this.aClass6_1.method204(this.aClass1_Sub3_Sub3_4.aByteArray7, 0, 8);
			this.aClass1_Sub3_Sub3_4.anInt548 = 0;
			this.aLong8 = this.aClass1_Sub3_Sub3_4.method389();
			@Pc(48) int[] local48 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong8 >> 32), (int) this.aLong8 };
			this.aClass1_Sub3_Sub3_5.anInt548 = 0;
			this.aClass1_Sub3_Sub3_5.method373(10);
			this.aClass1_Sub3_Sub3_5.method377(local48[0]);
			this.aClass1_Sub3_Sub3_5.method377(local48[1]);
			this.aClass1_Sub3_Sub3_5.method377(local48[2]);
			this.aClass1_Sub3_Sub3_5.method377(local48[3]);
			this.aClass1_Sub3_Sub3_5.method377(signlink.anInt742);
			this.aClass1_Sub3_Sub3_5.method380(arg0);
			this.aClass1_Sub3_Sub3_5.method380(arg1);
			this.aClass1_Sub3_Sub3_5.method398(aBigInteger2, aBigInteger1, 105);
			this.aClass1_Sub3_Sub3_6.anInt548 = 0;
			if (arg2) {
				this.aClass1_Sub3_Sub3_6.method373(18);
			} else {
				this.aClass1_Sub3_Sub3_6.method373(16);
			}
			this.aClass1_Sub3_Sub3_6.method373(this.aClass1_Sub3_Sub3_5.anInt548 + 36 + 1 + 1);
			this.aClass1_Sub3_Sub3_6.method373(217);
			this.aClass1_Sub3_Sub3_6.method373(aBoolean60 ? 1 : 0);
			for (@Pc(168) int local168 = 0; local168 < 9; local168++) {
				this.aClass1_Sub3_Sub3_6.method377(this.anIntArray88[local168]);
			}
			this.aClass1_Sub3_Sub3_6.method381(this.aClass1_Sub3_Sub3_5.aByteArray7, this.aClass1_Sub3_Sub3_5.anInt548);
			this.aClass1_Sub3_Sub3_5.aClass38_2 = new Class38(local48, 1);
			for (@Pc(202) int local202 = 0; local202 < 4; local202++) {
				local48[local202] += 50;
			}
			this.aClass38_1 = new Class38(local48, 1);
			this.aClass6_1.method205(this.aClass1_Sub3_Sub3_6.aByteArray7, this.aClass1_Sub3_Sub3_6.anInt548, this.anInt325);
			@Pc(238) int local238 = this.aClass6_1.method202();
			if (local238 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(245) Exception local245) {
				}
				this.method107(arg0, arg1, arg2);
				return;
			}
			if (local238 == 2 || local238 == 18) {
				if (local238 == 18) {
					this.aBoolean75 = true;
				} else {
					this.aBoolean75 = false;
				}
				Class8.method209(false);
				this.aBoolean72 = true;
				this.aClass1_Sub3_Sub3_5.anInt548 = 0;
				this.aClass1_Sub3_Sub3_4.anInt548 = 0;
				this.anInt208 = -1;
				this.anInt308 = -1;
				this.anInt309 = -1;
				this.anInt310 = -1;
				this.anInt207 = 0;
				this.anInt209 = 0;
				this.anInt179 = 0;
				this.anInt211 = 0;
				this.anInt198 = 0;
				this.anInt153 = 0;
				this.aBoolean63 = false;
				super.anInt123 = 0;
				for (@Pc(320) int local320 = 0; local320 < 100; local320++) {
					this.aStringArray6[local320] = null;
				}
				this.anInt193 = 0;
				this.anInt319 = 0;
				this.anInt185 = 0;
				this.anInt175 = 0;
				this.anInt167 = (int) (Math.random() * 100.0D) - 50;
				this.anInt284 = (int) (Math.random() * 110.0D) - 55;
				this.anInt214 = (int) (Math.random() * 80.0D) - 40;
				this.anInt218 = (int) (Math.random() * 120.0D) - 60;
				this.anInt170 = (int) (Math.random() * 30.0D) - 20;
				this.anInt315 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				this.anInt248 = -1;
				this.anInt279 = 0;
				this.anInt280 = 0;
				this.anInt149 = 0;
				this.anInt180 = 0;
				for (@Pc(410) int local410 = 0; local410 < this.anInt147; local410++) {
					this.aClass1_Sub1_Sub3_Sub2Array1[local410] = null;
					this.aClass1_Sub3_Sub3Array1[local410] = null;
				}
				for (@Pc(429) int local429 = 0; local429 < 8192; local429++) {
					this.aClass1_Sub1_Sub3_Sub1Array1[local429] = null;
				}
				this.aClass1_Sub1_Sub3_Sub2_1 = this.aClass1_Sub1_Sub3_Sub2Array1[this.anInt148] = new Class1_Sub1_Sub3_Sub2();
				this.aClass28_4.method452();
				this.aClass28_1.method452();
				this.aClass28_3.method452();
				@Pc(466) int local466;
				for (@Pc(462) int local462 = 0; local462 < 4; local462++) {
					for (local466 = 0; local466 < 104; local466++) {
						for (@Pc(470) int local470 = 0; local470 < 104; local470++) {
							this.aClass28ArrayArrayArray1[local462][local466][local470] = null;
						}
					}
				}
				this.aClass28_2 = new Class28((byte) -47);
				this.anInt267 = 0;
				this.anInt176 = -1;
				this.anInt299 = -1;
				this.anInt220 = -1;
				this.anInt241 = -1;
				this.aBoolean62 = false;
				this.anInt197 = 3;
				this.aBoolean46 = false;
				this.aBoolean63 = false;
				this.aBoolean65 = false;
				this.aString7 = null;
				this.anInt269 = 0;
				this.anInt140 = -1;
				this.aBoolean47 = true;
				this.method175();
				for (local466 = 0; local466 < 5; local466++) {
					this.anIntArray34[local466] = 0;
				}
				anInt338 = 0;
				anInt278 = 0;
				anInt212 = 0;
				anInt174 = 0;
				anInt302 = 0;
				anInt262 = 0;
				anInt205 = 0;
				anInt139 = 0;
				anInt162 = 0;
				this.method147();
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
				this.aClass1_Sub3_Sub3_5.anInt548 = 0;
				this.aClass1_Sub3_Sub3_4.anInt548 = 0;
				this.anInt208 = -1;
				this.anInt308 = -1;
				this.anInt309 = -1;
				this.anInt310 = -1;
				this.anInt207 = 0;
				this.anInt209 = 0;
				this.anInt179 = 0;
				this.anInt153 = 0;
				this.aBoolean63 = false;
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
		} catch (@Pc(764) IOException local764) {
			this.aString8 = "";
			this.aString9 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method108() {
		try {
			this.aBoolean72 &= true;
			this.method183();
			if (this.anInt228 == 1) {
				this.aClass1_Sub3_Sub2_Sub2Array4[this.anInt227 / 100].method319(this.anInt226 - 8 - 11, this.anInt225 - 8 - 8);
			}
			if (this.anInt228 == 2) {
				this.aClass1_Sub3_Sub2_Sub2Array4[this.anInt227 / 100 + 4].method319(this.anInt226 - 8 - 11, this.anInt225 - 8 - 8);
				anInt292++;
				if (anInt292 > 161) {
					anInt292 = 0;
					this.aClass1_Sub3_Sub3_5.method372(128);
					this.aClass1_Sub3_Sub3_5.method374(9331);
				}
			}
			if (this.anInt220 != -1) {
				this.method176(this.anInt220, this.anInt294);
				this.method146(Class15.aClass15Array1[this.anInt220], 0, 0, 0);
			}
			this.method121();
			if (!this.aBoolean63) {
				this.method81();
				this.method194(45);
			} else if (this.anInt287 == 0) {
				this.method91();
			}
			if (this.anInt269 == 1) {
				if (this.anInt231 > 0 || this.anInt223 == 1) {
					this.aClass1_Sub3_Sub2_Sub2Array5[1].method319(258, 472);
				} else {
					this.aClass1_Sub3_Sub2_Sub2Array5[1].method319(296, 472);
				}
			}
			if (this.anInt231 > 0) {
				this.aClass1_Sub3_Sub2_Sub2Array5[0].method319(296, 472);
				this.aClass1_Sub3_Sub2_Sub4_2.method358(329, "Level: " + this.anInt231, 484, 16776960);
			}
			if (this.anInt223 == 1) {
				this.aClass1_Sub3_Sub2_Sub2Array5[6].method319(296, 472);
				this.aClass1_Sub3_Sub2_Sub4_2.method358(329, "Arena", 484, 16776960);
			}
			if (this.anInt179 != 0) {
				@Pc(205) int local205 = this.anInt179 / 50;
				@Pc(209) int local209 = local205 / 60;
				@Pc(213) int local213 = local205 % 60;
				if (local213 < 10) {
					this.aClass1_Sub3_Sub2_Sub4_2.method361(476, 329, "System update in: " + local209 + ":0" + local213, 4, 16776960);
				} else {
					this.aClass1_Sub3_Sub2_Sub4_2.method361(476, 329, "System update in: " + local209 + ":" + local213, 4, 16776960);
				}
			}
		} catch (@Pc(255) RuntimeException local255) {
			signlink.reporterror("80148, " + true + ", " + local255.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method109() {
		try {
			for (@Pc(13) Class1_Sub1_Sub1 local13 = (Class1_Sub1_Sub1) this.aClass28_4.method448(); local13 != null; local13 = (Class1_Sub1_Sub1) this.aClass28_4.method450(this.anInt161)) {
				if (local13.anInt21 != this.anInt337 || anInt332 > local13.anInt27) {
					local13.method559();
				} else if (anInt332 >= local13.anInt26) {
					if (local13.anInt30 > 0) {
						@Pc(43) Class1_Sub1_Sub3_Sub1 local43 = this.aClass1_Sub1_Sub3_Sub1Array1[local13.anInt30 - 1];
						if (local43 != null) {
							local13.method19(this.method132(local43.anInt881, this.aByte19, local43.anInt882, local13.anInt21) - local13.anInt25, local43.anInt881, local43.anInt882, anInt332);
						}
					}
					if (local13.anInt30 < 0) {
						@Pc(75) int local75 = -local13.anInt30 - 1;
						@Pc(82) Class1_Sub1_Sub3_Sub2 local82;
						if (local75 == this.anInt178) {
							local82 = this.aClass1_Sub1_Sub3_Sub2_1;
						} else {
							local82 = this.aClass1_Sub1_Sub3_Sub2Array1[local75];
						}
						if (local82 != null) {
							local13.method19(this.method132(local82.anInt881, this.aByte19, local82.anInt882, local13.anInt21) - local13.anInt25, local82.anInt881, local82.anInt882, anInt332);
						}
					}
					local13.method20(this.anInt294);
					this.aClass33_1.method470(null, (int) local13.aDouble3, -1, (int) local13.aDouble2, local13.anInt31, 60, false, (int) local13.aDouble1, local13, this.anInt337);
				}
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("99453, " + 4 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZLclient!kb;I)V")
	private void method110(@OriginalArg(1) Class1_Sub3_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(6) int local6 = arg0.method394(8);
			@Pc(15) int local15;
			if (local6 < this.anInt149) {
				for (local15 = local6; local15 < this.anInt149; local15++) {
					this.anIntArray84[this.anInt324++] = this.anIntArray32[local15];
				}
			}
			if (local6 > this.anInt149) {
				signlink.reporterror(this.aString12 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt149 = 0;
			for (local15 = 0; local15 < local6; local15++) {
				@Pc(67) int local67 = this.anIntArray32[local15];
				@Pc(72) Class1_Sub1_Sub3_Sub2 local72 = this.aClass1_Sub1_Sub3_Sub2Array1[local67];
				@Pc(77) int local77 = arg0.method394(1);
				if (local77 == 0) {
					this.anIntArray32[this.anInt149++] = local67;
					local72.anInt923 = anInt332;
				} else {
					@Pc(100) int local100 = arg0.method394(2);
					if (local100 == 0) {
						this.anIntArray32[this.anInt149++] = local67;
						local72.anInt923 = anInt332;
						this.anIntArray33[this.anInt150++] = local67;
					} else {
						@Pc(151) int local151;
						@Pc(161) int local161;
						if (local100 == 1) {
							this.anIntArray32[this.anInt149++] = local67;
							local72.anInt923 = anInt332;
							local151 = arg0.method394(3);
							local72.method562(false, local151);
							local161 = arg0.method394(1);
							if (local161 == 1) {
								this.anIntArray33[this.anInt150++] = local67;
							}
						} else if (local100 == 2) {
							this.anIntArray32[this.anInt149++] = local67;
							local72.anInt923 = anInt332;
							local151 = arg0.method394(3);
							local72.method562(true, local151);
							local161 = arg0.method394(3);
							local72.method562(true, local161);
							@Pc(219) int local219 = arg0.method394(1);
							if (local219 == 1) {
								this.anIntArray33[this.anInt150++] = local67;
							}
						} else if (local100 == 3) {
							this.anIntArray84[this.anInt324++] = local67;
						}
					}
				}
			}
		} catch (@Pc(256) RuntimeException local256) {
			signlink.reporterror("31442, " + false + ", " + arg0 + ", " + arg1 + ", " + local256.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!hc;)V")
	private void method111(@OriginalArg(1) Class15 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt463;
			if (local4 >= 1 && local4 <= 100) {
				local4--;
				if (local4 >= this.anInt267) {
					arg0.aString20 = "";
					arg0.anInt462 = 0;
				} else {
					arg0.aString20 = this.aStringArray8[local4];
					arg0.anInt462 = 1;
				}
			} else if (local4 >= 101 && local4 <= 200) {
				local4 -= 101;
				if (local4 >= this.anInt267) {
					arg0.aString20 = "";
					arg0.anInt462 = 0;
				} else {
					if (this.anIntArray72[local4] == 0) {
						arg0.aString20 = "@red@Offline";
					} else if (this.anIntArray72[local4] == anInt251) {
						arg0.aString20 = "@gre@World-" + (this.anIntArray72[local4] - 9);
					} else {
						arg0.aString20 = "@yel@World-" + (this.anIntArray72[local4] - 9);
					}
					arg0.anInt462 = 1;
				}
			} else if (local4 == 203) {
				arg0.anInt469 = this.anInt267 * 15 + 20;
				if (arg0.anInt469 <= arg0.anInt465) {
					arg0.anInt469 = arg0.anInt465 + 1;
				}
			} else if (local4 >= 401 && local4 <= 500) {
				local4 -= 401;
				if (local4 >= this.anInt202) {
					arg0.aString20 = "";
					arg0.anInt462 = 0;
				} else {
					arg0.aString20 = Class40.method534(Class40.method531(this.aLongArray3[local4]));
					arg0.anInt462 = 1;
				}
			} else if (local4 == 503) {
				arg0.anInt469 = this.anInt202 * 15 + 20;
				if (arg0.anInt469 <= arg0.anInt465) {
					arg0.anInt469 = arg0.anInt465 + 1;
				}
			} else if (local4 == 327) {
				arg0.anInt480 = 150;
				arg0.anInt481 = (int) (Math.sin((double) anInt332 / 40.0D) * 256.0D) & 0x7FF;
				if (this.aBoolean70) {
					this.aBoolean70 = false;
					@Pc(219) Class1_Sub3_Sub1[] local219 = new Class1_Sub3_Sub1[7];
					@Pc(221) int local221 = 0;
					for (@Pc(223) int local223 = 0; local223 < 7; local223++) {
						@Pc(230) int local230 = this.anIntArray70[local223];
						if (local230 >= 0) {
							local219[local221++] = Class13.aClass13Array1[local230].method304();
						}
					}
					@Pc(251) Class1_Sub3_Sub1 local251 = new Class1_Sub3_Sub1(20363, local219, local221);
					for (@Pc(253) int local253 = 0; local253 < 5; local253++) {
						if (this.anIntArray34[local253] != 0) {
							local251.method236(anIntArrayArray4[local253][0], anIntArrayArray4[local253][this.anIntArray34[local253]]);
							if (local253 == 1) {
								local251.method236(anIntArray62[0], anIntArray62[this.anIntArray34[local253]]);
							}
						}
					}
					local251.method229(797);
					local251.method230(Class19.aClass19Array1[this.aClass1_Sub1_Sub3_Sub2_1.anInt885].anIntArray186[0]);
					local251.method239(64, 850, -30, -50, -30, true);
					arg0.aClass1_Sub3_Sub1_2 = local251;
				}
			} else if (local4 == 324) {
				if (this.aClass1_Sub3_Sub2_Sub2_1 == null) {
					this.aClass1_Sub3_Sub2_Sub2_1 = arg0.aClass1_Sub3_Sub2_Sub2_12;
					this.aClass1_Sub3_Sub2_Sub2_2 = arg0.aClass1_Sub3_Sub2_Sub2_13;
				}
				if (this.aBoolean47) {
					arg0.aClass1_Sub3_Sub2_Sub2_12 = this.aClass1_Sub3_Sub2_Sub2_2;
				} else {
					arg0.aClass1_Sub3_Sub2_Sub2_12 = this.aClass1_Sub3_Sub2_Sub2_1;
				}
			} else if (local4 == 325) {
				if (this.aClass1_Sub3_Sub2_Sub2_1 == null) {
					this.aClass1_Sub3_Sub2_Sub2_1 = arg0.aClass1_Sub3_Sub2_Sub2_12;
					this.aClass1_Sub3_Sub2_Sub2_2 = arg0.aClass1_Sub3_Sub2_Sub2_13;
				}
				if (this.aBoolean47) {
					arg0.aClass1_Sub3_Sub2_Sub2_12 = this.aClass1_Sub3_Sub2_Sub2_1;
				} else {
					arg0.aClass1_Sub3_Sub2_Sub2_12 = this.aClass1_Sub3_Sub2_Sub2_2;
				}
			} else if (local4 == 600) {
				arg0.aString20 = this.aString14;
				if (anInt332 % 20 < 10) {
					arg0.aString20 = arg0.aString20 + "|";
				} else {
					arg0.aString20 = arg0.aString20 + " ";
				}
			} else {
				if (local4 == 613) {
					if (!this.aBoolean75) {
						arg0.aString20 = "";
					} else if (this.aBoolean40) {
						arg0.anInt474 = 16711680;
						arg0.aString20 = "Moderator option: Mute player for 48 hours: <ON>";
					} else {
						arg0.anInt474 = 16777215;
						arg0.aString20 = "Moderator option: Mute player for 48 hours: <OFF>";
					}
				}
				@Pc(451) String local451;
				if (local4 == 650 || local4 == 655) {
					if (this.anInt134 == 0) {
						arg0.aString20 = "";
					} else {
						if (this.anInt322 == 0) {
							local451 = "earlier today";
						} else if (this.anInt322 == 1) {
							local451 = "yesterday";
						} else {
							local451 = this.anInt322 + " days ago";
						}
						arg0.aString20 = "You last logged in " + local451 + " from: " + signlink.dns;
					}
				}
				if (local4 == 651) {
					if (this.anInt177 == 0) {
						arg0.aString20 = "0 unread messages";
						arg0.anInt474 = 16776960;
					}
					if (this.anInt177 == 1) {
						arg0.aString20 = "1 unread message";
						arg0.anInt474 = 65280;
					}
					if (this.anInt177 > 1) {
						arg0.aString20 = this.anInt177 + " unread messages";
						arg0.anInt474 = 65280;
					}
				}
				if (local4 == 652) {
					if (this.anInt156 == 201) {
						arg0.aString20 = "";
					} else if (this.anInt156 == 200) {
						arg0.aString20 = "You have not yet set any password recovery questions.";
					} else {
						if (this.anInt156 == 0) {
							local451 = "Earlier today";
						} else if (this.anInt156 == 1) {
							local451 = "Yesterday";
						} else {
							local451 = this.anInt156 + " days ago";
						}
						arg0.aString20 = local451 + " you changed your recovery questions";
					}
				}
				if (local4 == 653) {
					if (this.anInt156 == 201) {
						arg0.aString20 = "";
					} else if (this.anInt156 == 200) {
						arg0.aString20 = "We strongly recommend you do so now to secure your account.";
					} else {
						arg0.aString20 = "If you do not remember making this change then cancel it immediately";
					}
				}
				if (local4 == 654) {
					if (this.anInt156 == 201) {
						arg0.aString20 = "";
					} else if (this.anInt156 == 200) {
						arg0.aString20 = "Do this from the 'account management' area on our front webpage";
					} else {
						arg0.aString20 = "Do this from the 'account management' area on our front webpage";
					}
				}
			}
		} catch (@Pc(633) RuntimeException local633) {
			signlink.reporterror("88894, " + 7 + ", " + arg0 + ", " + local633.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILclient!hc;IIIZ)V")
	private void method112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class15 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		try {
			if (this.aBoolean74) {
				this.anInt261 = 32;
			} else {
				this.anInt261 = 0;
			}
			this.aBoolean74 = false;
			@Pc(17) int local17 = 75 / arg0;
			if (arg3 >= arg7 && arg3 < arg7 + 16 && arg5 >= arg1 && arg5 < arg1 + 16) {
				arg4.anInt470 -= this.anInt266 * 4;
				if (arg8) {
					this.aBoolean44 = true;
					return;
				}
			} else if (arg3 >= arg7 && arg3 < arg7 + 16 && arg5 >= arg1 + arg6 - 16 && arg5 < arg1 + arg6) {
				arg4.anInt470 += this.anInt266 * 4;
				if (arg8) {
					this.aBoolean44 = true;
					return;
				}
			} else if (arg3 >= arg7 - this.anInt261 && arg3 < arg7 + this.anInt261 + 16 && arg5 >= arg1 + 16 && arg5 < arg1 + arg6 - 16 && this.anInt266 > 0) {
				@Pc(120) int local120 = (arg6 - 32) * arg6 / arg2;
				if (local120 < 8) {
					local120 = 8;
				}
				@Pc(135) int local135 = arg5 - arg1 - local120 / 2 - 16;
				@Pc(141) int local141 = arg6 - local120 - 32;
				arg4.anInt470 = (arg2 - arg6) * local135 / local141;
				if (arg8) {
					this.aBoolean44 = true;
				}
				this.aBoolean74 = true;
			} else {
				return;
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("96225, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method113() {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anInt180; local5++) {
				@Pc(15) Class1_Sub1_Sub3_Sub1 local15 = this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray44[local5]];
				@Pc(24) int local24 = (this.anIntArray44[local5] << 14) + 536870912;
				if (local15 != null && local15.method563(this.anInt155)) {
					@Pc(36) int local36 = local15.anInt881 >> 7;
					@Pc(41) int local41 = local15.anInt882 >> 7;
					if (local36 >= 0 && local36 < 104 && local41 >= 0 && local41 < 104) {
						if (local15.anInt884 == 1 && (local15.anInt881 & 0x7F) == 64 && (local15.anInt882 & 0x7F) == 64) {
							if (this.anIntArrayArray3[local36][local41] == this.anInt182) {
								continue;
							}
							this.anIntArrayArray3[local36][local41] = this.anInt182;
						}
						this.aClass33_1.method470(null, this.method132(local15.anInt881, this.aByte19, local15.anInt882, this.anInt337), local24, local15.anInt882, local15.anInt883, (local15.anInt884 - 1) * 64 + 60, local15.aBoolean186, local15.anInt881, local15, this.anInt337);
					}
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("19814, " + 453 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)I")
	private int method114() {
		try {
			@Pc(7) int local7 = 3;
			if (this.anInt245 < 310) {
				@Pc(16) int local16 = this.anInt242 >> 7;
				@Pc(21) int local21 = this.anInt244 >> 7;
				@Pc(27) int local27 = this.aClass1_Sub1_Sub3_Sub2_1.anInt881 >> 7;
				@Pc(33) int local33 = this.aClass1_Sub1_Sub3_Sub2_1.anInt882 >> 7;
				if ((this.aByteArrayArrayArray7[this.anInt337][local16][local21] & 0x4) != 0) {
					local7 = this.anInt337;
				}
				@Pc(55) int local55;
				if (local27 > local16) {
					local55 = local27 - local16;
				} else {
					local55 = local16 - local27;
				}
				@Pc(68) int local68;
				if (local33 > local21) {
					local68 = local33 - local21;
				} else {
					local68 = local21 - local33;
				}
				@Pc(83) int local83;
				@Pc(85) int local85;
				if (local55 > local68) {
					local83 = local68 * 65536 / local55;
					local85 = 32768;
					while (local16 != local27) {
						if (local16 < local27) {
							local16++;
						} else if (local16 > local27) {
							local16--;
						}
						if ((this.aByteArrayArrayArray7[this.anInt337][local16][local21] & 0x4) != 0) {
							local7 = this.anInt337;
						}
						local85 += local83;
						if (local85 >= 65536) {
							local85 -= 65536;
							if (local21 < local33) {
								local21++;
							} else if (local21 > local33) {
								local21--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt337][local16][local21] & 0x4) != 0) {
								local7 = this.anInt337;
							}
						}
					}
				} else {
					local83 = local55 * 65536 / local68;
					local85 = 32768;
					while (local21 != local33) {
						if (local21 < local33) {
							local21++;
						} else if (local21 > local33) {
							local21--;
						}
						if ((this.aByteArrayArrayArray7[this.anInt337][local16][local21] & 0x4) != 0) {
							local7 = this.anInt337;
						}
						local85 += local83;
						if (local85 >= 65536) {
							local85 -= 65536;
							if (local16 < local27) {
								local16++;
							} else if (local16 > local27) {
								local16--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt337][local16][local21] & 0x4) != 0) {
								local7 = this.anInt337;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray7[this.anInt337][this.aClass1_Sub1_Sub3_Sub2_1.anInt881 >> 7][this.aClass1_Sub1_Sub3_Sub2_1.anInt882 >> 7] & 0x4) != 0) {
				local7 = this.anInt337;
			}
			return local7;
		} catch (@Pc(253) RuntimeException local253) {
			signlink.reporterror("93119, " + true + ", " + local253.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)I")
	private int method115() {
		try {
			@Pc(14) int local14 = this.method132(this.anInt242, this.aByte19, this.anInt244, this.anInt337);
			return local14 - this.anInt243 >= 800 || (this.aByteArrayArrayArray7[this.anInt337][this.anInt242 >> 7][this.anInt244 >> 7] & 0x4) == 0 ? 3 : this.anInt337;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("6577, " + true + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!hc;I)Z")
	private boolean method116(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 >= 0) {
				this.method67();
			}
			if (arg0.anIntArray151 == null) {
				return false;
			}
			for (@Pc(10) int local10 = 0; local10 < arg0.anIntArray151.length; local10++) {
				@Pc(19) int local19 = this.method148(local10, arg0, this.anInt163);
				@Pc(24) int local24 = arg0.anIntArray152[local10];
				if (arg0.anIntArray151[local10] == 2) {
					if (local19 >= local24) {
						return false;
					}
				} else if (arg0.anIntArray151[local10] == 3) {
					if (local19 <= local24) {
						return false;
					}
				} else if (arg0.anIntArray151[local10] == 4) {
					if (local19 == local24) {
						return false;
					}
				} else if (local19 != local24) {
					return false;
				}
			}
			return true;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("84938, " + arg0 + ", " + arg1 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[BI)Z")
	private boolean method117(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			return arg0 == null ? true : signlink.wavesave(arg0, arg1);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("74043, " + 2 + ", " + arg0 + ", " + arg1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)Z")
	private boolean method118(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != 3) {
				throw new NullPointerException();
			}
			return signlink.wavereplay();
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("27521, " + arg0 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method119(@OriginalArg(0) int arg0) {
		try {
			signlink.anInt749 = arg0;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("93373, " + arg0 + ", " + -79 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method120() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray63[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray63[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray64[local54] = (this.anIntArray63[local54 - 1] + this.anIntArray63[local54 + 1] + this.anIntArray63[local54 - 128] + this.anIntArray63[local54 + 128]) / 4;
				}
			}
			this.anInt313 += 128;
			if (this.anInt313 > this.anIntArray42.length) {
				this.anInt313 -= this.anIntArray42.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method154((byte) 3, this.aClass1_Sub3_Sub2_Sub3Array3[local48]);
			}
			@Pc(166) int local166;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local166 = local54 + (local48 << 7);
					@Pc(189) int local189 = this.anIntArray64[local166 + 128] - this.anIntArray42[local166 + this.anInt313 & this.anIntArray42.length - 1] / 5;
					if (local189 < 0) {
						local189 = 0;
					}
					this.anIntArray63[local166] = local189;
				}
			}
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray56[local54] = this.anIntArray56[local54 + 1];
			}
			this.anIntArray56[255] = (int) (Math.sin((double) anInt332 / 14.0D) * 16.0D + Math.sin((double) anInt332 / 15.0D) * 14.0D + Math.sin((double) anInt332 / 16.0D) * 12.0D);
			if (this.anInt335 > 0) {
				this.anInt335 -= 4;
			}
			if (this.anInt336 > 0) {
				this.anInt336 -= 4;
			}
			if (this.anInt335 == 0 && this.anInt336 == 0) {
				local166 = (int) (Math.random() * 2000.0D);
				if (local166 == 0) {
					this.anInt335 = 1024;
				}
				if (local166 == 1) {
					this.anInt336 = 1024;
					return;
				}
			}
		} catch (@Pc(307) RuntimeException local307) {
			signlink.reporterror("24730, " + false + ", " + local307.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method121() {
		try {
			@Pc(15) int local15 = (this.aClass1_Sub1_Sub3_Sub2_1.anInt881 >> 7) + this.anInt295;
			@Pc(24) int local24 = (this.aClass1_Sub1_Sub3_Sub2_1.anInt882 >> 7) + this.anInt296;
			if (local15 >= 2944 && local15 < 3392 && local24 >= 3520 && local24 < 6400) {
				this.anInt231 = (local24 - 3520) / 8 + 1;
			} else if (local15 >= 2944 && local15 < 3392 && local24 >= 9920 && local24 < 12800) {
				this.anInt231 = (local24 - 9920) / 8 + 1;
			} else {
				this.anInt231 = 0;
			}
			this.anInt223 = 0;
			if (local15 >= 3328 && local15 < 3392 && local24 >= 3200 && local24 < 3264) {
				@Pc(92) int local92 = local15 & 0x3F;
				@Pc(96) int local96 = local24 & 0x3F;
				if (local92 >= 4 && local92 <= 29 && local96 >= 44 && local96 <= 58) {
					this.anInt223 = 1;
				}
				if (local92 >= 36 && local92 <= 61 && local96 >= 44 && local96 <= 58) {
					this.anInt223 = 1;
				}
				if (local92 >= 4 && local92 <= 29 && local96 >= 25 && local96 <= 39) {
					this.anInt223 = 1;
				}
				if (local92 >= 36 && local92 <= 61 && local96 >= 25 && local96 <= 39) {
					this.anInt223 = 1;
				}
				if (local92 >= 4 && local92 <= 29 && local96 >= 6 && local96 <= 20) {
					this.anInt223 = 1;
				}
				if (local92 >= 36 && local92 <= 61 && local96 >= 6 && local96 <= 20) {
					this.anInt223 = 1;
				}
			}
			if (this.anInt223 == 0 && local15 >= 3328 && local15 <= 3393 && local24 >= 3203 && local24 <= 3325) {
				this.anInt223 = 2;
			}
			this.anInt334 = 0;
			if (local15 >= 3053 && local15 <= 3156 && local24 >= 3056 && local24 <= 3136) {
				this.anInt334 = 1;
			}
			if (local15 >= 3072 && local15 <= 3118 && local24 >= 9492 && local24 <= 9535) {
				this.anInt334 = 1;
			}
			if (this.anInt334 == 1 && local15 >= 3139 && local15 <= 3199 && local24 >= 3008 && local24 <= 3062) {
				this.anInt334 = 0;
			}
		} catch (@Pc(258) RuntimeException local258) {
			signlink.reporterror("8948, " + true + ", " + local258.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method122(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			if (this.anInt211 > 0) {
				this.method177();
			} else {
				this.aClass32_18.method455();
				this.aClass1_Sub3_Sub2_Sub4_2.method358(144, "Connection lost", 257, 0);
				this.aClass1_Sub3_Sub2_Sub4_2.method358(143, "Connection lost", 256, 16777215);
				this.aClass1_Sub3_Sub2_Sub4_2.method358(159, "Please wait - attempting to reestablish", 257, 0);
				this.aClass1_Sub3_Sub2_Sub4_2.method358(158, "Please wait - attempting to reestablish", 256, 16777215);
				this.aClass32_18.method456(11, 8, super.aGraphics2);
				this.anInt279 = 0;
				@Pc(60) Class6 local60 = this.aClass6_1;
				this.aBoolean72 = false;
				this.method107(this.aString12, this.aString13, true);
				if (!this.aBoolean72) {
					this.method177();
				}
				try {
					local60.method201();
				} catch (@Pc(80) Exception local80) {
				}
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("32555, " + arg0 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method123() {
		try {
			if (this.anInt224 != 3) {
				this.anInt208 = -1;
			}
			@Pc(18) int local18;
			@Pc(25) int local25;
			if (this.anInt154 == 0) {
				local18 = super.anInt121 / 2 - 80;
				local25 = super.anInt122 / 2 + 20;
				local25 += 20;
				if (super.anInt127 == 1 && super.anInt128 >= local18 - 75 && super.anInt128 <= local18 + 75 && super.anInt129 >= local25 - 20 && super.anInt129 <= local25 + 20) {
					this.anInt154 = 3;
					this.anInt146 = 0;
				}
				local18 = super.anInt121 / 2 + 80;
				if (super.anInt127 == 1 && super.anInt128 >= local18 - 75 && super.anInt128 <= local18 + 75 && super.anInt129 >= local25 - 20 && super.anInt129 <= local25 + 20) {
					this.aString8 = "";
					this.aString9 = "Enter your username & password.";
					this.anInt154 = 2;
					this.anInt146 = 0;
				}
			} else if (this.anInt154 == 2) {
				local18 = super.anInt122 / 2 - 40;
				local18 += 30;
				local18 += 25;
				if (super.anInt127 == 1 && super.anInt129 >= local18 - 15 && super.anInt129 < local18) {
					this.anInt146 = 0;
				}
				local18 += 15;
				if (super.anInt127 == 1 && super.anInt129 >= local18 - 15 && super.anInt129 < local18) {
					this.anInt146 = 1;
				}
				local18 += 15;
				local25 = super.anInt121 / 2 - 80;
				@Pc(171) int local171 = super.anInt122 / 2 + 50;
				@Pc(172) int local172 = local171 + 20;
				if (super.anInt127 == 1 && super.anInt128 >= local25 - 75 && super.anInt128 <= local25 + 75 && super.anInt129 >= local172 - 20 && super.anInt129 <= local172 + 20) {
					this.method107(this.aString12, this.aString13, false);
				}
				local25 = super.anInt121 / 2 + 80;
				if (super.anInt127 == 1 && super.anInt128 >= local25 - 75 && super.anInt128 <= local25 + 75 && super.anInt129 >= local172 - 20 && super.anInt129 <= local172 + 20) {
					this.anInt154 = 0;
					this.aString12 = "";
					this.aString13 = "";
				}
				while (true) {
					while (true) {
						@Pc(255) int local255 = this.method66();
						if (local255 == -1) {
							return;
						}
						@Pc(260) boolean local260 = false;
						for (@Pc(262) int local262 = 0; local262 < aString18.length(); local262++) {
							if (local255 == aString18.charAt(local262)) {
								local260 = true;
								break;
							}
						}
						if (this.anInt146 == 0) {
							if (local255 == 8 && this.aString12.length() > 0) {
								this.aString12 = this.aString12.substring(0, this.aString12.length() - 1);
							}
							if (local255 == 9 || local255 == 10 || local255 == 13) {
								this.anInt146 = 1;
							}
							if (local260) {
								this.aString12 = this.aString12 + (char) local255;
							}
							if (this.aString12.length() > 12) {
								this.aString12 = this.aString12.substring(0, 12);
							}
						} else if (this.anInt146 == 1) {
							if (local255 == 8 && this.aString13.length() > 0) {
								this.aString13 = this.aString13.substring(0, this.aString13.length() - 1);
							}
							if (local255 == 9 || local255 == 10 || local255 == 13) {
								this.anInt146 = 0;
							}
							if (local260) {
								this.aString13 = this.aString13 + (char) local255;
							}
							if (this.aString13.length() > 20) {
								this.aString13 = this.aString13.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt154 == 3) {
				local18 = super.anInt121 / 2;
				local25 = super.anInt122 / 2 + 50;
				@Pc(419) int local419 = local25 + 20;
				if (super.anInt127 == 1 && super.anInt128 >= local18 - 75 && super.anInt128 <= local18 + 75 && super.anInt129 >= local419 - 20 && super.anInt129 <= local419 + 20) {
					this.anInt154 = 0;
					return;
				}
			}
		} catch (@Pc(452) RuntimeException local452) {
			signlink.reporterror("47131, " + 3 + ", " + local452.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method124(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt267 >= 100) {
					this.method94(0, "", "Your friends list is full. Max of 100 hit");
				} else {
					@Pc(23) String local23 = Class40.method534(Class40.method531(arg0));
					for (@Pc(25) int local25 = 0; local25 < this.anInt267; local25++) {
						if (this.aLongArray4[local25] == arg0) {
							this.method94(0, "", local23 + " is already on your friend list");
							return;
						}
					}
					for (@Pc(55) int local55 = 0; local55 < this.anInt202; local55++) {
						if (this.aLongArray3[local55] == arg0) {
							this.method94(0, "", "Please remove " + local23 + " from your ignore list first");
							return;
						}
					}
					if (!local23.equals(this.aClass1_Sub1_Sub3_Sub2_1.aString30)) {
						this.aStringArray8[this.anInt267] = local23;
						this.aLongArray4[this.anInt267] = arg0;
						this.anIntArray72[this.anInt267] = 0;
						this.anInt267++;
						this.aBoolean44 = true;
						this.aClass1_Sub3_Sub3_5.method372(66);
						this.aClass1_Sub3_Sub3_5.method379(arg0);
					}
				}
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("51112, " + -980 + ", " + arg0 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!kb;II)V")
	private void method125(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			arg0.method393();
			@Pc(15) int local15 = arg0.method394(8);
			@Pc(21) int local21;
			if (local15 < this.anInt180) {
				for (local21 = local15; local21 < this.anInt180; local21++) {
					this.anIntArray84[this.anInt324++] = this.anIntArray44[local21];
				}
			}
			if (local15 > this.anInt180) {
				signlink.reporterror(this.aString12 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt180 = 0;
			for (local21 = 0; local21 < local15; local21++) {
				@Pc(73) int local73 = this.anIntArray44[local21];
				@Pc(78) Class1_Sub1_Sub3_Sub1 local78 = this.aClass1_Sub1_Sub3_Sub1Array1[local73];
				@Pc(83) int local83 = arg0.method394(1);
				if (local83 == 0) {
					this.anIntArray44[this.anInt180++] = local73;
					local78.anInt923 = anInt332;
				} else {
					@Pc(106) int local106 = arg0.method394(2);
					if (local106 == 0) {
						this.anIntArray44[this.anInt180++] = local73;
						local78.anInt923 = anInt332;
						this.anIntArray33[this.anInt150++] = local73;
					} else {
						@Pc(157) int local157;
						@Pc(167) int local167;
						if (local106 == 1) {
							this.anIntArray44[this.anInt180++] = local73;
							local78.anInt923 = anInt332;
							local157 = arg0.method394(3);
							local78.method562(false, local157);
							local167 = arg0.method394(1);
							if (local167 == 1) {
								this.anIntArray33[this.anInt150++] = local73;
							}
						} else if (local106 == 2) {
							this.anIntArray44[this.anInt180++] = local73;
							local78.anInt923 = anInt332;
							local157 = arg0.method394(3);
							local78.method562(true, local157);
							local167 = arg0.method394(3);
							local78.method562(true, local167);
							@Pc(225) int local225 = arg0.method394(1);
							if (local225 == 1) {
								this.anIntArray33[this.anInt150++] = local73;
							}
						} else if (local106 == 3) {
							this.anIntArray84[this.anInt324++] = local73;
						}
					}
				}
			}
		} catch (@Pc(262) RuntimeException local262) {
			signlink.reporterror("94006, " + arg0 + ", " + -266 + ", " + arg1 + ", " + local262.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method126() {
		try {
			if (super.anInt127 == 1) {
				@Pc(17) int local17 = super.anInt128 - 21 - 561;
				@Pc(24) int local24 = super.anInt129 - 9 - 5;
				if (local17 >= 0 && local24 >= 0 && local17 < 146 && local24 < 151) {
					local17 -= 73;
					local24 -= 75;
					@Pc(44) int local44 = this.anInt315 + this.anInt218 & 0x7FF;
					@Pc(48) int local48 = Class1_Sub3_Sub2_Sub1.anIntArray137[local44];
					@Pc(52) int local52 = Class1_Sub3_Sub2_Sub1.anIntArray138[local44];
					@Pc(61) int local61 = local48 * (this.anInt170 + 256) >> 8;
					@Pc(70) int local70 = local52 * (this.anInt170 + 256) >> 8;
					@Pc(80) int local80 = local24 * local61 + local17 * local70 >> 11;
					@Pc(90) int local90 = local24 * local70 - local17 * local61 >> 11;
					@Pc(98) int local98 = this.aClass1_Sub1_Sub3_Sub2_1.anInt881 + local80 >> 7;
					@Pc(106) int local106 = this.aClass1_Sub1_Sub3_Sub2_1.anInt882 - local90 >> 7;
					@Pc(129) boolean local129 = this.method198(0, true, 1, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0], local106, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0], 107, 0, 0, local98, 0, 0);
					if (local129) {
						this.aClass1_Sub3_Sub3_5.method373(local17);
						this.aClass1_Sub3_Sub3_5.method373(local24);
						this.aClass1_Sub3_Sub3_5.method374(this.anInt315);
						this.aClass1_Sub3_Sub3_5.method373(57);
						this.aClass1_Sub3_Sub3_5.method373(this.anInt218);
						this.aClass1_Sub3_Sub3_5.method373(this.anInt170);
						this.aClass1_Sub3_Sub3_5.method373(89);
						this.aClass1_Sub3_Sub3_5.method374(this.aClass1_Sub1_Sub3_Sub2_1.anInt881);
						this.aClass1_Sub3_Sub3_5.method374(this.aClass1_Sub1_Sub3_Sub2_1.anInt882);
						this.aClass1_Sub3_Sub3_5.method373(this.anInt135);
						this.aClass1_Sub3_Sub3_5.method373(63);
						return;
					}
				}
			}
		} catch (@Pc(185) RuntimeException local185) {
			signlink.reporterror("41441, " + false + ", " + local185.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!kb;IZ)V")
	private void method127(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt324 = 0;
			this.anInt150 = 0;
			this.method125(arg0, arg1);
			this.method85(arg0, arg1);
			this.method150(arg0, arg1);
			@Pc(31) int local31;
			for (@Pc(24) int local24 = 0; local24 < this.anInt324; local24++) {
				local31 = this.anIntArray84[local24];
				if (this.aClass1_Sub1_Sub3_Sub1Array1[local31].anInt923 != anInt332) {
					this.aClass1_Sub1_Sub3_Sub1Array1[local31].aClass3_1 = null;
					this.aClass1_Sub1_Sub3_Sub1Array1[local31] = null;
				}
			}
			if (arg0.anInt548 != arg1) {
				signlink.reporterror(this.aString12 + " size mismatch in getnpcpos - pos:" + arg0.anInt548 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local31 = 0; local31 < this.anInt180; local31++) {
				if (this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray44[local31]] == null) {
					signlink.reporterror(this.aString12 + " null entry in npc list - pos:" + local31 + " size:" + this.anInt180);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("79517, " + arg0 + ", " + arg1 + ", " + false + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method67() {
		if (signlink.sunjava) {
			super.anInt119 = 5;
		}
		if (!aBoolean60) {
			this.aBoolean57 = true;
			this.aBoolean68 = true;
			this.method73(this, 2);
			this.method171(12345678, "scape_main", 40000);
		}
		if (aBoolean53) {
			this.aBoolean56 = true;
			return;
		}
		aBoolean53 = true;
		@Pc(34) boolean local34 = false;
		@Pc(38) String local38 = this.method157((byte) 7);
		if (local38.endsWith("jagex.com")) {
			local34 = true;
		}
		if (local38.endsWith("runescape.com")) {
			local34 = true;
		}
		if (local38.endsWith("192.168.1.2")) {
			local34 = true;
		}
		if (local38.endsWith("192.168.1.249")) {
			local34 = true;
		}
		if (local38.endsWith("192.168.1.252")) {
			local34 = true;
		}
		if (local38.endsWith("192.168.1.253")) {
			local34 = true;
		}
		if (local38.endsWith("192.168.1.254")) {
			local34 = true;
		}
		if (local38.endsWith("127.0.0.1")) {
			local34 = true;
		}
		if (!local34) {
			this.aBoolean73 = true;
			return;
		}
		try {
			@Pc(94) int local94 = 5;
			this.anIntArray88[8] = 0;
			while (this.anIntArray88[8] == 0) {
				this.method74("Connecting to fileserver", 10);
				try {
					@Pc(119) DataInputStream local119 = this.method181("crc" + (int) (Math.random() * 9.9999999E7D));
					@Pc(126) Class1_Sub3_Sub3 local126 = new Class1_Sub3_Sub3(new byte[36], 0);
					local119.readFully(local126.aByteArray7, 0, 36);
					for (@Pc(134) int local134 = 0; local134 < 9; local134++) {
						this.anIntArray88[local134] = local126.method388();
					}
					local119.close();
				} catch (@Pc(150) IOException local150) {
					for (@Pc(152) int local152 = local94; local152 > 0; local152--) {
						this.method74("Error loading - Will retry in " + local152 + " secs.", 10);
						try {
							Thread.sleep(1000L);
						} catch (@Pc(171) Exception local171) {
						}
					}
					local94 *= 2;
					if (local94 > 60) {
						local94 = 60;
					}
				}
			}
			this.aClass39_1 = this.method163(10, "title screen", this.anIntArray88[1], "title");
			this.aClass1_Sub3_Sub2_Sub4_1 = new Class1_Sub3_Sub2_Sub4("p11", 2, this.aClass39_1);
			this.aClass1_Sub3_Sub2_Sub4_2 = new Class1_Sub3_Sub2_Sub4("p12", 2, this.aClass39_1);
			this.aClass1_Sub3_Sub2_Sub4_3 = new Class1_Sub3_Sub2_Sub4("b12", 2, this.aClass39_1);
			this.aClass1_Sub3_Sub2_Sub4_4 = new Class1_Sub3_Sub2_Sub4("q8", 2, this.aClass39_1);
			this.method192();
			this.method140();
			@Pc(255) Class39 local255 = this.method163(15, "config", this.anIntArray88[2], "config");
			@Pc(266) Class39 local266 = this.method163(20, "interface", this.anIntArray88[3], "interface");
			@Pc(277) Class39 local277 = this.method163(30, "2d graphics", this.anIntArray88[4], "media");
			@Pc(288) Class39 local288 = this.method163(40, "3d graphics", this.anIntArray88[5], "models");
			@Pc(299) Class39 local299 = this.method163(60, "textures", this.anIntArray88[6], "textures");
			@Pc(310) Class39 local310 = this.method163(65, "chat system", this.anIntArray88[7], "wordenc");
			@Pc(321) Class39 local321 = this.method163(70, "sound effects", this.anIntArray88[8], "sounds");
			this.aByteArrayArrayArray7 = new byte[4][104][104];
			this.anIntArrayArrayArray3 = new int[4][105][105];
			this.aClass33_1 = new Class33(104, 4, 104, 6, this.anIntArrayArrayArray3);
			for (@Pc(346) int local346 = 0; local346 < 4; local346++) {
				this.aClass9Array1[local346] = new Class9(104, 104, false);
			}
			this.aClass1_Sub3_Sub2_Sub2_10 = new Class1_Sub3_Sub2_Sub2(512, 512);
			this.method74("Unpacking media", 75);
			this.aClass1_Sub3_Sub2_Sub3_13 = new Class1_Sub3_Sub2_Sub3(local277, "invback", 0);
			this.aClass1_Sub3_Sub2_Sub3_15 = new Class1_Sub3_Sub2_Sub3(local277, "chatback", 0);
			this.aClass1_Sub3_Sub2_Sub3_14 = new Class1_Sub3_Sub2_Sub3(local277, "mapback", 0);
			this.aClass1_Sub3_Sub2_Sub3_3 = new Class1_Sub3_Sub2_Sub3(local277, "backbase1", 0);
			this.aClass1_Sub3_Sub2_Sub3_4 = new Class1_Sub3_Sub2_Sub3(local277, "backbase2", 0);
			this.aClass1_Sub3_Sub2_Sub3_5 = new Class1_Sub3_Sub2_Sub3(local277, "backhmid1", 0);
			for (@Pc(424) int local424 = 0; local424 < 13; local424++) {
				this.aClass1_Sub3_Sub2_Sub3Array1[local424] = new Class1_Sub3_Sub2_Sub3(local277, "sideicons", local424);
			}
			this.aClass1_Sub3_Sub2_Sub2_3 = new Class1_Sub3_Sub2_Sub2(local277, "compass", 0);
			@Pc(450) int local450;
			try {
				for (local450 = 0; local450 < 50; local450++) {
					this.aClass1_Sub3_Sub2_Sub3Array2[local450] = new Class1_Sub3_Sub2_Sub3(local277, "mapscene", local450);
				}
			} catch (@Pc(468) Exception local468) {
			}
			try {
				for (local450 = 0; local450 < 50; local450++) {
					this.aClass1_Sub3_Sub2_Sub2Array6[local450] = new Class1_Sub3_Sub2_Sub2(local277, "mapfunction", local450);
				}
			} catch (@Pc(488) Exception local488) {
			}
			try {
				for (local450 = 0; local450 < 20; local450++) {
					this.aClass1_Sub3_Sub2_Sub2Array3[local450] = new Class1_Sub3_Sub2_Sub2(local277, "hitmarks", local450);
				}
			} catch (@Pc(508) Exception local508) {
			}
			try {
				for (local450 = 0; local450 < 20; local450++) {
					this.aClass1_Sub3_Sub2_Sub2Array5[local450] = new Class1_Sub3_Sub2_Sub2(local277, "headicons", local450);
				}
			} catch (@Pc(528) Exception local528) {
			}
			this.aClass1_Sub3_Sub2_Sub2_11 = new Class1_Sub3_Sub2_Sub2(local277, "mapflag", 0);
			for (local450 = 0; local450 < 8; local450++) {
				this.aClass1_Sub3_Sub2_Sub2Array4[local450] = new Class1_Sub3_Sub2_Sub2(local277, "cross", local450);
			}
			this.aClass1_Sub3_Sub2_Sub2_6 = new Class1_Sub3_Sub2_Sub2(local277, "mapdots", 0);
			this.aClass1_Sub3_Sub2_Sub2_7 = new Class1_Sub3_Sub2_Sub2(local277, "mapdots", 1);
			this.aClass1_Sub3_Sub2_Sub2_8 = new Class1_Sub3_Sub2_Sub2(local277, "mapdots", 2);
			this.aClass1_Sub3_Sub2_Sub2_9 = new Class1_Sub3_Sub2_Sub2(local277, "mapdots", 3);
			this.aClass1_Sub3_Sub2_Sub3_11 = new Class1_Sub3_Sub2_Sub3(local277, "scrollbar", 0);
			this.aClass1_Sub3_Sub2_Sub3_12 = new Class1_Sub3_Sub2_Sub3(local277, "scrollbar", 1);
			this.aClass1_Sub3_Sub2_Sub3_16 = new Class1_Sub3_Sub2_Sub3(local277, "redstone1", 0);
			this.aClass1_Sub3_Sub2_Sub3_17 = new Class1_Sub3_Sub2_Sub3(local277, "redstone2", 0);
			this.aClass1_Sub3_Sub2_Sub3_18 = new Class1_Sub3_Sub2_Sub3(local277, "redstone3", 0);
			this.aClass1_Sub3_Sub2_Sub3_19 = new Class1_Sub3_Sub2_Sub3(local277, "redstone1", 0);
			this.aClass1_Sub3_Sub2_Sub3_19.method344();
			this.aClass1_Sub3_Sub2_Sub3_20 = new Class1_Sub3_Sub2_Sub3(local277, "redstone2", 0);
			this.aClass1_Sub3_Sub2_Sub3_20.method344();
			this.aClass1_Sub3_Sub2_Sub3_6 = new Class1_Sub3_Sub2_Sub3(local277, "redstone1", 0);
			this.aClass1_Sub3_Sub2_Sub3_6.method345();
			this.aClass1_Sub3_Sub2_Sub3_7 = new Class1_Sub3_Sub2_Sub3(local277, "redstone2", 0);
			this.aClass1_Sub3_Sub2_Sub3_7.method345();
			this.aClass1_Sub3_Sub2_Sub3_8 = new Class1_Sub3_Sub2_Sub3(local277, "redstone3", 0);
			this.aClass1_Sub3_Sub2_Sub3_8.method345();
			this.aClass1_Sub3_Sub2_Sub3_9 = new Class1_Sub3_Sub2_Sub3(local277, "redstone1", 0);
			this.aClass1_Sub3_Sub2_Sub3_9.method344();
			this.aClass1_Sub3_Sub2_Sub3_9.method345();
			this.aClass1_Sub3_Sub2_Sub3_10 = new Class1_Sub3_Sub2_Sub3(local277, "redstone2", 0);
			this.aClass1_Sub3_Sub2_Sub3_10.method344();
			this.aClass1_Sub3_Sub2_Sub3_10.method345();
			@Pc(725) Class1_Sub3_Sub2_Sub2 local725 = new Class1_Sub3_Sub2_Sub2(local277, "backleft1", 0);
			this.aClass32_3 = new Class32(local725.anInt451, this.method72(), local725.anInt452, 947);
			local725.method317(0, 0);
			@Pc(750) Class1_Sub3_Sub2_Sub2 local750 = new Class1_Sub3_Sub2_Sub2(local277, "backleft2", 0);
			this.aClass32_4 = new Class32(local750.anInt451, this.method72(), local750.anInt452, 947);
			local750.method317(0, 0);
			@Pc(775) Class1_Sub3_Sub2_Sub2 local775 = new Class1_Sub3_Sub2_Sub2(local277, "backright1", 0);
			this.aClass32_5 = new Class32(local775.anInt451, this.method72(), local775.anInt452, 947);
			local775.method317(0, 0);
			@Pc(800) Class1_Sub3_Sub2_Sub2 local800 = new Class1_Sub3_Sub2_Sub2(local277, "backright2", 0);
			this.aClass32_6 = new Class32(local800.anInt451, this.method72(), local800.anInt452, 947);
			local800.method317(0, 0);
			@Pc(825) Class1_Sub3_Sub2_Sub2 local825 = new Class1_Sub3_Sub2_Sub2(local277, "backtop1", 0);
			this.aClass32_7 = new Class32(local825.anInt451, this.method72(), local825.anInt452, 947);
			local825.method317(0, 0);
			@Pc(850) Class1_Sub3_Sub2_Sub2 local850 = new Class1_Sub3_Sub2_Sub2(local277, "backtop2", 0);
			this.aClass32_8 = new Class32(local850.anInt451, this.method72(), local850.anInt452, 947);
			local850.method317(0, 0);
			@Pc(875) Class1_Sub3_Sub2_Sub2 local875 = new Class1_Sub3_Sub2_Sub2(local277, "backvmid1", 0);
			this.aClass32_9 = new Class32(local875.anInt451, this.method72(), local875.anInt452, 947);
			local875.method317(0, 0);
			@Pc(900) Class1_Sub3_Sub2_Sub2 local900 = new Class1_Sub3_Sub2_Sub2(local277, "backvmid2", 0);
			this.aClass32_10 = new Class32(local900.anInt451, this.method72(), local900.anInt452, 947);
			local900.method317(0, 0);
			@Pc(925) Class1_Sub3_Sub2_Sub2 local925 = new Class1_Sub3_Sub2_Sub2(local277, "backvmid3", 0);
			this.aClass32_11 = new Class32(local925.anInt451, this.method72(), local925.anInt452, 947);
			local925.method317(0, 0);
			@Pc(950) Class1_Sub3_Sub2_Sub2 local950 = new Class1_Sub3_Sub2_Sub2(local277, "backhmid2", 0);
			this.aClass32_12 = new Class32(local950.anInt451, this.method72(), local950.anInt452, 947);
			local950.method317(0, 0);
			this.method74("Unpacking textures", 80);
			Class1_Sub3_Sub2_Sub1.method290(local299);
			Class1_Sub3_Sub2_Sub1.method294(0.8D);
			Class1_Sub3_Sub2_Sub1.method289();
			this.method74("Unpacking models", 83);
			Class1_Sub3_Sub1.method224(local288);
			Class10.method260(aByte24, local288);
			Class12.method274(aByte24, local288);
			this.method74("Unpacking config", 86);
			Class19.method366(local255);
			Class2.method21(local255);
			Class11.method271(local255);
			Class5.method52(local255);
			Class3.method30(local255);
			Class13.method302(local255);
			Class21.method399(local255);
			Class23.method403(local255);
			Class5.aBoolean34 = aBoolean59;
			if (!aBoolean60) {
				this.method74("Unpacking sounds", 90);
				@Pc(1037) byte[] local1037 = local321.method528(aByte22, "sounds.dat", null);
				@Pc(1043) Class1_Sub3_Sub3 local1043 = new Class1_Sub3_Sub3(local1037, 0);
				Class43.method553(local1043);
			}
			this.method74("Unpacking interfaces", 92);
			@Pc(1074) Class1_Sub3_Sub2_Sub4[] local1074 = new Class1_Sub3_Sub2_Sub4[] { this.aClass1_Sub3_Sub2_Sub4_1, this.aClass1_Sub3_Sub2_Sub4_2, this.aClass1_Sub3_Sub2_Sub4_3, this.aClass1_Sub3_Sub2_Sub4_4 };
			Class15.method328(local277, local1074, local266);
			this.method74("Preparing game engine", 97);
			@Pc(1090) int local1090;
			@Pc(1092) int local1092;
			@Pc(1094) int local1094;
			for (@Pc(1086) int local1086 = 0; local1086 < 33; local1086++) {
				local1090 = 999;
				local1092 = 0;
				for (local1094 = 0; local1094 < 35; local1094++) {
					if (this.aClass1_Sub3_Sub2_Sub3_14.aByteArray6[local1094 + local1086 * this.aClass1_Sub3_Sub2_Sub3_14.anInt502] == 0) {
						if (local1090 == 999) {
							local1090 = local1094;
						}
					} else if (local1090 != 999) {
						local1092 = local1094;
						break;
					}
				}
				this.anIntArray78[local1086] = local1090;
				this.anIntArray75[local1086] = local1092 - local1090;
			}
			@Pc(1152) int local1152;
			for (local1090 = 9; local1090 < 160; local1090++) {
				local1092 = 999;
				local1094 = 0;
				for (local1152 = 10; local1152 < 168; local1152++) {
					if (this.aClass1_Sub3_Sub2_Sub3_14.aByteArray6[local1152 + local1090 * this.aClass1_Sub3_Sub2_Sub3_14.anInt502] == 0 && (local1152 > 34 || local1090 > 34)) {
						if (local1092 == 999) {
							local1092 = local1152;
						}
					} else if (local1092 != 999) {
						local1094 = local1152;
						break;
					}
				}
				this.anIntArray30[local1090 - 9] = local1092 - 21;
				this.anIntArray77[local1090 - 9] = local1094 - local1092;
			}
			Class1_Sub3_Sub2_Sub1.method287(96, 479);
			this.anIntArray37 = Class1_Sub3_Sub2_Sub1.anIntArray139;
			Class1_Sub3_Sub2_Sub1.method287(261, 190);
			this.anIntArray38 = Class1_Sub3_Sub2_Sub1.anIntArray139;
			Class1_Sub3_Sub2_Sub1.method287(334, 512);
			this.anIntArray39 = Class1_Sub3_Sub2_Sub1.anIntArray139;
			@Pc(1236) int[] local1236 = new int[9];
			for (local1094 = 0; local1094 < 9; local1094++) {
				local1152 = local1094 * 32 + 128 + 15;
				@Pc(1254) int local1254 = local1152 * 3 + 600;
				@Pc(1258) int local1258 = Class1_Sub3_Sub2_Sub1.anIntArray137[local1152];
				local1236[local1094] = local1254 * local1258 >> 16;
			}
			Class33.method496(local1236);
			Class25.method406(local310);
		} catch (@Pc(1281) Exception local1281) {
			this.aBoolean50 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method128() {
		try {
			this.method160();
			this.aClass32_22.method455();
			this.aClass1_Sub3_Sub2_Sub3_1.method346(0, 0);
			@Pc(29) byte local29;
			@Pc(41) int local41;
			if (this.anInt154 == 0) {
				local29 = 80;
				this.aClass1_Sub3_Sub2_Sub4_3.method359("Welcome to RuneScape", 80, 16776960, true, 180);
				local41 = local29 + 30;
				this.aClass1_Sub3_Sub2_Sub3_2.method346(100, 27);
				this.aClass1_Sub3_Sub2_Sub4_3.method359("New user", 125, 16777215, true, 100);
				this.aClass1_Sub3_Sub2_Sub3_2.method346(100, 187);
				this.aClass1_Sub3_Sub2_Sub4_3.method359("Existing User", 125, 16777215, true, 260);
			}
			if (this.anInt154 == 2) {
				local29 = 60;
				if (this.aString8.length() > 0) {
					this.aClass1_Sub3_Sub2_Sub4_3.method359(this.aString8, 45, 16776960, true, 180);
					this.aClass1_Sub3_Sub2_Sub4_3.method359(this.aString9, 60, 16776960, true, 180);
					local41 = local29 + 30;
				} else {
					this.aClass1_Sub3_Sub2_Sub4_3.method359(this.aString9, 53, 16776960, true, 180);
					local41 = local29 + 30;
				}
				this.aClass1_Sub3_Sub2_Sub4_3.method363("Username: " + this.aString12 + (this.anInt146 == 0 & anInt332 % 40 < 20 ? "@yel@|" : ""), 16777215, 90, true, 90);
				local41 += 15;
				this.aClass1_Sub3_Sub2_Sub4_3.method363("Password: " + Class40.method536(this.aString13) + (this.anInt146 == 1 & anInt332 % 40 < 20 ? "@yel@|" : ""), 16777215, 92, true, 105);
				local41 += 15;
				this.aClass1_Sub3_Sub2_Sub3_2.method346(130, 27);
				this.aClass1_Sub3_Sub2_Sub4_3.method359("Login", 155, 16777215, true, 100);
				this.aClass1_Sub3_Sub2_Sub3_2.method346(130, 187);
				this.aClass1_Sub3_Sub2_Sub4_3.method359("Cancel", 155, 16777215, true, 260);
			}
			if (this.anInt154 == 3) {
				this.aClass1_Sub3_Sub2_Sub4_3.method359("Create a free account", 40, 16776960, true, 180);
				local29 = 65;
				this.aClass1_Sub3_Sub2_Sub4_3.method359("To create a new account you need to", 65, 16777215, true, 180);
				local41 = local29 + 15;
				this.aClass1_Sub3_Sub2_Sub4_3.method359("go back to the main RuneScape webpage", 80, 16777215, true, 180);
				local41 += 15;
				this.aClass1_Sub3_Sub2_Sub4_3.method359("and choose the red 'create account'", 95, 16777215, true, 180);
				local41 += 15;
				this.aClass1_Sub3_Sub2_Sub4_3.method359("button at the top right of that page.", 110, 16777215, true, 180);
				local41 += 15;
				this.aClass1_Sub3_Sub2_Sub3_2.method346(130, 107);
				this.aClass1_Sub3_Sub2_Sub4_3.method359("Cancel", 155, 16777215, true, 180);
			}
			this.aClass32_22.method456(186, 214, super.aGraphics2);
			if (this.aBoolean71) {
				this.aBoolean71 = false;
				this.aClass32_20.method456(0, 128, super.aGraphics2);
				this.aClass32_21.method456(386, 214, super.aGraphics2);
				this.aClass32_25.method456(265, 0, super.aGraphics2);
				this.aClass32_26.method456(265, 574, super.aGraphics2);
				this.aClass32_27.method456(186, 128, super.aGraphics2);
				this.aClass32_28.method456(186, 574, super.aGraphics2);
			}
		} catch (@Pc(472) RuntimeException local472) {
			signlink.reporterror("62078, " + 4 + ", " + local472.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IJ)V")
	private void method129(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt267; local8++) {
					if (this.aLongArray4[local8] == arg0) {
						this.anInt267--;
						this.aBoolean44 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt267; local28++) {
							this.aStringArray8[local28] = this.aStringArray8[local28 + 1];
							this.anIntArray72[local28] = this.anIntArray72[local28 + 1];
							this.aLongArray4[local28] = this.aLongArray4[local28 + 1];
						}
						this.aClass1_Sub3_Sub3_5.method372(210);
						this.aClass1_Sub3_Sub3_5.method379(arg0);
						break;
					}
				}
				this.anInt207 += 0;
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("68708, " + 0 + ", " + arg0 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method131() {
		try {
			this.aClass32_19.method455();
			Class1_Sub3_Sub2_Sub1.anIntArray139 = this.anIntArray37;
			this.aClass1_Sub3_Sub2_Sub3_15.method346(0, 0);
			if (this.aBoolean65) {
				this.aClass1_Sub3_Sub2_Sub4_3.method358(40, this.aString10, 239, 0);
				this.aClass1_Sub3_Sub2_Sub4_3.method358(60, this.aString11 + "*", 239, 128);
			} else if (this.aBoolean46) {
				this.aClass1_Sub3_Sub2_Sub4_3.method358(40, "Enter amount to transfer:", 239, 0);
				this.aClass1_Sub3_Sub2_Sub4_3.method358(60, this.aString6 + "*", 239, 128);
			} else if (this.aString7 != null) {
				this.aClass1_Sub3_Sub2_Sub4_3.method358(40, this.aString7, 239, 0);
				this.aClass1_Sub3_Sub2_Sub4_3.method358(60, "Click to continue", 239, 128);
			} else if (this.anInt299 != -1) {
				this.method146(Class15.aClass15Array1[this.anInt299], 0, 0, 0);
			} else if (this.anInt176 == -1) {
				@Pc(130) Class1_Sub3_Sub2_Sub4 local130 = this.aClass1_Sub3_Sub2_Sub4_2;
				@Pc(132) int local132 = 0;
				Class1_Sub3_Sub2.method352(0, 0, 463, 77);
				for (@Pc(140) int local140 = 0; local140 < 100; local140++) {
					if (this.aStringArray6[local140] != null) {
						@Pc(152) int local152 = this.anIntArray31[local140];
						@Pc(161) int local161 = this.anInt230 + 70 - local132 * 14;
						if (local152 == 0) {
							if (local161 > 0 && local161 < 110) {
								local130.method361(476, local161, this.aStringArray6[local140], 4, 0);
							}
							local132++;
						}
						if (local152 == 1) {
							if (local161 > 0 && local161 < 110) {
								local130.method361(476, local161, this.aStringArray5[local140] + ":", 4, 16777215);
								local130.method361(476, local161, this.aStringArray6[local140], local130.method360(this.aStringArray5[local140]) + 12, 255);
							}
							local132++;
						}
						if (local152 == 2 && (this.anInt164 == 0 || this.anInt164 == 1 && this.method156(this.aStringArray5[local140]))) {
							if (local161 > 0 && local161 < 110) {
								local130.method361(476, local161, this.aStringArray5[local140] + ":", 4, 0);
								local130.method361(476, local161, this.aStringArray6[local140], local130.method360(this.aStringArray5[local140]) + 12, 255);
							}
							local132++;
						}
						if ((local152 == 3 || local152 == 7) && this.anInt268 == 0 && (local152 == 7 || this.anInt199 == 0 || this.anInt199 == 1 && this.method156(this.aStringArray5[local140]))) {
							if (local161 > 0 && local161 < 110) {
								local130.method361(476, local161, "From " + this.aStringArray5[local140] + ":", 4, 0);
								local130.method361(476, local161, this.aStringArray6[local140], local130.method360("From " + this.aStringArray5[local140]) + 12, 8388608);
							}
							local132++;
						}
						if (local152 == 4 && (this.anInt250 == 0 || this.anInt250 == 1 && this.method156(this.aStringArray5[local140]))) {
							if (local161 > 0 && local161 < 110) {
								local130.method361(476, local161, this.aStringArray5[local140] + " " + this.aStringArray6[local140], 4, 8388736);
							}
							local132++;
						}
						if (local152 == 5 && this.anInt268 == 0 && this.anInt199 < 2) {
							if (local161 > 0 && local161 < 110) {
								local130.method361(476, local161, this.aStringArray6[local140], 4, 8388608);
							}
							local132++;
						}
						if (local152 == 6 && this.anInt268 == 0 && this.anInt199 < 2) {
							if (local161 > 0 && local161 < 110) {
								local130.method361(476, local161, "To " + this.aStringArray5[local140] + ":", 4, 0);
								local130.method361(476, local161, this.aStringArray6[local140], local130.method360("To " + this.aStringArray5[local140]) + 12, 8388608);
							}
							local132++;
						}
						if (local152 == 8 && (this.anInt250 == 0 || this.anInt250 == 1 && this.method156(this.aStringArray5[local140]))) {
							if (local161 > 0 && local161 < 110) {
								local130.method361(476, local161, this.aStringArray5[local140] + " " + this.aStringArray6[local140], 4, 13350793);
							}
							local132++;
						}
					}
				}
				Class1_Sub3_Sub2.method351();
				this.anInt300 = local132 * 14 + 7;
				if (this.anInt300 < 78) {
					this.anInt300 = 78;
				}
				this.method104(this.anInt300, 77, this.anInt300 - this.anInt230 - 77, 0, 463);
				local130.method361(476, 90, Class40.method534(this.aString12) + ":", 4, 0);
				local130.method361(476, 90, this.aString4 + "*", local130.method360(this.aString12 + ": ") + 6, 255);
				Class1_Sub3_Sub2.method356(479, 77, this.anInt249, 0, 0);
			} else {
				this.method146(Class15.aClass15Array1[this.anInt176], 0, 0, 0);
			}
			if (this.aBoolean63 && this.anInt287 == 2) {
				this.method91();
			}
			this.aClass32_19.method456(375, 22, super.aGraphics2);
			this.aClass32_18.method455();
			Class1_Sub3_Sub2_Sub1.anIntArray139 = this.anIntArray39;
		} catch (@Pc(649) RuntimeException local649) {
			signlink.reporterror("56186, " + false + ", " + local649.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBII)I")
	private int method132(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) int local3 = arg0 >> 7;
			@Pc(7) int local7 = arg2 >> 7;
			if (arg1 != -60) {
				return 2;
			}
			@Pc(14) int local14 = arg3;
			if (arg3 < 3 && (this.aByteArrayArrayArray7[1][local3][local7] & 0x2) == 2) {
				local14 = arg3 + 1;
			}
			@Pc(34) int local34 = arg0 & 0x7F;
			@Pc(38) int local38 = arg2 & 0x7F;
			@Pc(66) int local66 = this.anIntArrayArrayArray3[local14][local3][local7] * (128 - local34) + this.anIntArrayArrayArray3[local14][local3 + 1][local7] * local34 >> 7;
			@Pc(98) int local98 = this.anIntArrayArrayArray3[local14][local3][local7 + 1] * (128 - local34) + this.anIntArrayArrayArray3[local14][local3 + 1][local7 + 1] * local34 >> 7;
			return local66 * (128 - local38) + local98 * local38 >> 7;
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("43132, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!hc;IIIZII)V")
	private void method133(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg0.anInt461 == 0 && arg0.anIntArray153 != null && !arg0.aBoolean113 && (arg5 >= arg4 && arg2 >= arg1 && arg5 <= arg4 + arg0.anInt464 && arg2 <= arg1 + arg0.anInt465)) {
				@Pc(34) int local34 = arg0.anIntArray153.length;
				for (@Pc(43) int local43 = 0; local43 < local34; local43++) {
					@Pc(52) int local52 = arg0.anIntArray154[local43] + arg4;
					@Pc(61) int local61 = arg0.anIntArray155[local43] + arg1 - arg3;
					@Pc(68) Class15 local68 = Class15.aClass15Array1[arg0.anIntArray153[local43]];
					@Pc(73) int local73 = local52 + local68.anInt466;
					@Pc(78) int local78 = local61 + local68.anInt467;
					if ((local68.anInt468 >= 0 || local68.anInt476 != 0) && arg5 >= local73 && arg2 >= local78 && arg5 < local73 + local68.anInt464 && arg2 < local78 + local68.anInt465) {
						if (local68.anInt468 >= 0) {
							this.anInt326 = local68.anInt468;
						} else {
							this.anInt326 = local68.anInt459;
						}
					}
					if (local68.anInt461 == 0) {
						this.method133(local68, local78, arg2, local68.anInt470, local73, arg5);
						if (local68.anInt469 > local68.anInt465) {
							this.method112(this.anInt318, local78, local68.anInt469, arg5, local68, arg2, local68.anInt465, local73 + local68.anInt464, true);
						}
					} else {
						if (local68.anInt462 == 1 && arg5 >= local73 && arg2 >= local78 && arg5 < local73 + local68.anInt464 && arg2 < local78 + local68.anInt465) {
							@Pc(176) boolean local176 = false;
							if (local68.anInt463 != 0) {
								local176 = this.method167(local68);
							}
							if (!local176) {
								this.aStringArray9[this.anInt153] = local68.aString24;
								this.anIntArray60[this.anInt153] = 706;
								this.anIntArray59[this.anInt153] = local68.anInt459;
								this.anInt153++;
							}
						}
						if (local68.anInt462 == 2 && this.anInt319 == 0 && arg5 >= local73 && arg2 >= local78 && arg5 < local73 + local68.anInt464 && arg2 < local78 + local68.anInt465) {
							@Pc(240) String local240 = local68.aString22;
							if (local240.indexOf(" ") != -1) {
								local240 = local240.substring(0, local240.indexOf(" "));
							}
							this.aStringArray9[this.anInt153] = local240 + " @gre@" + local68.aString23;
							this.anIntArray60[this.anInt153] = 941;
							this.anIntArray59[this.anInt153] = local68.anInt459;
							this.anInt153++;
						}
						if (local68.anInt462 == 3 && arg5 >= local73 && arg2 >= local78 && arg5 < local73 + local68.anInt464 && arg2 < local78 + local68.anInt465) {
							this.aStringArray9[this.anInt153] = "Close";
							this.anIntArray60[this.anInt153] = 309;
							this.anIntArray59[this.anInt153] = local68.anInt459;
							this.anInt153++;
						}
						if (local68.anInt462 == 4 && arg5 >= local73 && arg2 >= local78 && arg5 < local73 + local68.anInt464 && arg2 < local78 + local68.anInt465) {
							this.aStringArray9[this.anInt153] = local68.aString24;
							this.anIntArray60[this.anInt153] = 967;
							this.anIntArray59[this.anInt153] = local68.anInt459;
							this.anInt153++;
						}
						if (local68.anInt462 == 5 && arg5 >= local73 && arg2 >= local78 && arg5 < local73 + local68.anInt464 && arg2 < local78 + local68.anInt465) {
							this.aStringArray9[this.anInt153] = local68.aString24;
							this.anIntArray60[this.anInt153] = 672;
							this.anIntArray59[this.anInt153] = local68.anInt459;
							this.anInt153++;
						}
						if (local68.anInt462 == 6 && !this.aBoolean62 && arg5 >= local73 && arg2 >= local78 && arg5 < local73 + local68.anInt464 && arg2 < local78 + local68.anInt465) {
							this.aStringArray9[this.anInt153] = local68.aString24;
							this.anIntArray60[this.anInt153] = 73;
							this.anIntArray59[this.anInt153] = local68.anInt459;
							this.anInt153++;
						}
						if (local68.anInt461 == 2) {
							@Pc(488) int local488 = 0;
							for (@Pc(490) int local490 = 0; local490 < local68.anInt465; local490++) {
								for (@Pc(494) int local494 = 0; local494 < local68.anInt464; local494++) {
									@Pc(505) int local505 = local73 + local494 * (local68.anInt472 + 32);
									@Pc(514) int local514 = local78 + local490 * (local68.anInt473 + 32);
									if (local488 < 20) {
										local505 += local68.anIntArray156[local488];
										local514 += local68.anIntArray157[local488];
									}
									if (arg5 >= local505 && arg2 >= local514 && arg5 < local505 + 32 && arg2 < local514 + 32) {
										this.anInt136 = local488;
										this.anInt137 = local68.anInt459;
										if (local68.anIntArray149[local488] > 0) {
											@Pc(567) Class5 local567 = Class5.method54(local68.anIntArray149[local488] - 1);
											if (this.anInt193 == 1 && local68.aBoolean116) {
												if (local68.anInt459 != this.anInt195 || local488 != this.anInt194) {
													this.aStringArray9[this.anInt153] = "Use " + this.aString5 + " with @lre@" + local567.aString3;
													this.anIntArray60[this.anInt153] = 237;
													this.anIntArray61[this.anInt153] = local567.anInt96;
													this.anIntArray58[this.anInt153] = local488;
													this.anIntArray59[this.anInt153] = local68.anInt459;
													this.anInt153++;
												}
											} else if (this.anInt319 != 1 || !local68.aBoolean116) {
												@Pc(704) int local704;
												if (local68.aBoolean116) {
													for (local704 = 4; local704 >= 3; local704--) {
														if (local567.aStringArray4 != null && local567.aStringArray4[local704] != null) {
															this.aStringArray9[this.anInt153] = local567.aStringArray4[local704] + " @lre@" + local567.aString3;
															if (local704 == 3) {
																this.anIntArray60[this.anInt153] = 120;
															}
															if (local704 == 4) {
																this.anIntArray60[this.anInt153] = 796;
															}
															this.anIntArray61[this.anInt153] = local567.anInt96;
															this.anIntArray58[this.anInt153] = local488;
															this.anIntArray59[this.anInt153] = local68.anInt459;
															this.anInt153++;
														} else if (local704 == 4) {
															this.aStringArray9[this.anInt153] = "Drop @lre@" + local567.aString3;
															this.anIntArray60[this.anInt153] = 796;
															this.anIntArray61[this.anInt153] = local567.anInt96;
															this.anIntArray58[this.anInt153] = local488;
															this.anIntArray59[this.anInt153] = local68.anInt459;
															this.anInt153++;
														}
													}
												}
												if (local68.aBoolean117) {
													this.aStringArray9[this.anInt153] = "Use @lre@" + local567.aString3;
													this.anIntArray60[this.anInt153] = 357;
													this.anIntArray61[this.anInt153] = local567.anInt96;
													this.anIntArray58[this.anInt153] = local488;
													this.anIntArray59[this.anInt153] = local68.anInt459;
													this.anInt153++;
												}
												if (local68.aBoolean116 && local567.aStringArray4 != null) {
													for (local704 = 2; local704 >= 0; local704--) {
														if (local567.aStringArray4[local704] != null) {
															this.aStringArray9[this.anInt153] = local567.aStringArray4[local704] + " @lre@" + local567.aString3;
															if (local704 == 0) {
																this.anIntArray60[this.anInt153] = 871;
															}
															if (local704 == 1) {
																this.anIntArray60[this.anInt153] = 526;
															}
															if (local704 == 2) {
																this.anIntArray60[this.anInt153] = 156;
															}
															this.anIntArray61[this.anInt153] = local567.anInt96;
															this.anIntArray58[this.anInt153] = local488;
															this.anIntArray59[this.anInt153] = local68.anInt459;
															this.anInt153++;
														}
													}
												}
												if (local68.aStringArray10 != null) {
													for (local704 = 4; local704 >= 0; local704--) {
														if (local68.aStringArray10[local704] != null) {
															this.aStringArray9[this.anInt153] = local68.aStringArray10[local704] + " @lre@" + local567.aString3;
															if (local704 == 0) {
																this.anIntArray60[this.anInt153] = 134;
															}
															if (local704 == 1) {
																this.anIntArray60[this.anInt153] = 701;
															}
															if (local704 == 2) {
																this.anIntArray60[this.anInt153] = 570;
															}
															if (local704 == 3) {
																this.anIntArray60[this.anInt153] = 719;
															}
															if (local704 == 4) {
																this.anIntArray60[this.anInt153] = 440;
															}
															this.anIntArray61[this.anInt153] = local567.anInt96;
															this.anIntArray58[this.anInt153] = local488;
															this.anIntArray59[this.anInt153] = local68.anInt459;
															this.anInt153++;
														}
													}
												}
												this.aStringArray9[this.anInt153] = "Examine @lre@" + local567.aString3;
												this.anIntArray60[this.anInt153] = 1974;
												this.anIntArray61[this.anInt153] = local567.anInt96;
												this.anIntArray59[this.anInt153] = local68.anIntArray150[local488];
												this.anInt153++;
											} else if ((this.anInt321 & 0x10) == 16) {
												this.aStringArray9[this.anInt153] = this.aString15 + " @lre@" + local567.aString3;
												this.anIntArray60[this.anInt153] = 63;
												this.anIntArray61[this.anInt153] = local567.anInt96;
												this.anIntArray58[this.anInt153] = local488;
												this.anIntArray59[this.anInt153] = local68.anInt459;
												this.anInt153++;
											}
										}
									}
									local488++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1130) RuntimeException local1130) {
			signlink.reporterror("88492, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + arg5 + ", " + local1130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)Z")
	private boolean method135() {
		try {
			if (this.aClass6_1 == null) {
				return false;
			}
			@Pc(2898) String local2898;
			@Pc(203) int local203;
			try {
				@Pc(21) int local21 = this.aClass6_1.method203();
				if (local21 == 0) {
					return false;
				}
				if (this.anInt208 == -1) {
					this.aClass6_1.method204(this.aClass1_Sub3_Sub3_4.aByteArray7, 0, 1);
					this.anInt208 = this.aClass1_Sub3_Sub3_4.aByteArray7[0] & 0xFF;
					if (this.aClass38_1 != null) {
						this.anInt208 = this.anInt208 - this.aClass38_1.method524() & 0xFF;
					}
					this.anInt207 = Class7.anIntArray90[this.anInt208];
					local21--;
				}
				if (this.anInt207 == -1) {
					if (local21 <= 0) {
						return false;
					}
					this.aClass6_1.method204(this.aClass1_Sub3_Sub3_4.aByteArray7, 0, 1);
					this.anInt207 = this.aClass1_Sub3_Sub3_4.aByteArray7[0] & 0xFF;
					local21--;
				}
				if (this.anInt207 == -2) {
					if (local21 <= 1) {
						return false;
					}
					this.aClass6_1.method204(this.aClass1_Sub3_Sub3_4.aByteArray7, 0, 2);
					this.aClass1_Sub3_Sub3_4.anInt548 = 0;
					this.anInt207 = this.aClass1_Sub3_Sub3_4.method385();
					local21 -= 2;
				}
				if (local21 < this.anInt207) {
					return false;
				}
				this.aClass1_Sub3_Sub3_4.anInt548 = 0;
				this.aClass6_1.method204(this.aClass1_Sub3_Sub3_4.aByteArray7, 0, this.anInt207);
				this.anInt209 = 0;
				this.anInt310 = this.anInt309;
				this.anInt309 = this.anInt308;
				this.anInt308 = this.anInt208;
				if (this.anInt208 == 98) {
					this.anInt140 = this.aClass1_Sub3_Sub3_4.method383();
					if (this.anInt140 == this.anInt197) {
						if (this.anInt140 == 3) {
							this.anInt197 = 1;
						} else {
							this.anInt197 = 3;
						}
						this.aBoolean44 = true;
					}
					this.anInt208 = -1;
					return true;
				}
				@Pc(209) int local209;
				@Pc(215) int local215;
				@Pc(219) int local219;
				@Pc(199) int local199;
				if (this.anInt208 == 212) {
					local199 = this.aClass1_Sub3_Sub3_4.method385();
					local203 = this.aClass1_Sub3_Sub3_4.method385();
					local209 = local203 >> 10 & 0x1F;
					local215 = local203 >> 5 & 0x1F;
					local219 = local203 & 0x1F;
					Class15.aClass15Array1[local199].anInt474 = (local209 << 19) + (local215 << 11) + (local219 << 3);
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 213) {
					this.anInt164 = this.aClass1_Sub3_Sub3_4.method383();
					this.anInt199 = this.aClass1_Sub3_Sub3_4.method383();
					this.anInt250 = this.aClass1_Sub3_Sub3_4.method383();
					this.aBoolean54 = true;
					this.aBoolean43 = true;
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 106) {
					local199 = this.aClass1_Sub3_Sub3_4.method385();
					this.method195(local199);
					if (this.anInt241 != -1) {
						this.anInt241 = -1;
						this.aBoolean44 = true;
						this.aBoolean42 = true;
					}
					this.anInt299 = local199;
					this.aBoolean43 = true;
					this.anInt220 = -1;
					this.aBoolean62 = false;
					this.anInt208 = -1;
					return true;
				}
				@Pc(331) Class15 local331;
				if (this.anInt208 == 191) {
					local199 = this.aClass1_Sub3_Sub3_4.method385();
					local203 = this.aClass1_Sub3_Sub3_4.method386();
					local209 = this.aClass1_Sub3_Sub3_4.method386();
					local331 = Class15.aClass15Array1[local199];
					local331.anInt466 = local203;
					local331.anInt467 = local209;
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 71) {
					local199 = this.aClass1_Sub3_Sub3_4.method383();
					local203 = this.aClass1_Sub3_Sub3_4.method383();
					local209 = this.aClass1_Sub3_Sub3_4.method383();
					local215 = this.aClass1_Sub3_Sub3_4.method383();
					this.aBooleanArray1[local199] = true;
					this.anIntArray65[local199] = local203;
					this.anIntArray80[local199] = local209;
					this.anIntArray81[local199] = local215;
					this.anIntArray83[local199] = 0;
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 12) {
					local199 = this.aClass1_Sub3_Sub3_4.method383();
					local203 = this.aClass1_Sub3_Sub3_4.method383();
					local209 = -1;
					for (local215 = 0; local215 < this.anIntArray46.length; local215++) {
						if (this.anIntArray46[local215] == (local199 << 8) + local203) {
							local209 = local215;
						}
					}
					if (local209 != -1) {
						signlink.cachesave("m" + local199 + "_" + local203, this.aByteArrayArray1[local209]);
						this.anInt185 = 1;
					}
					this.anInt208 = -1;
					return true;
				}
				@Pc(479) int local479;
				if (this.anInt208 == 35) {
					local199 = this.aClass1_Sub3_Sub3_4.method383();
					local203 = this.aClass1_Sub3_Sub3_4.method383();
					local209 = this.aClass1_Sub3_Sub3_4.method385();
					local215 = this.aClass1_Sub3_Sub3_4.method385();
					local219 = -1;
					for (local479 = 0; local479 < this.anIntArray46.length; local479++) {
						if (this.anIntArray46[local479] == (local199 << 8) + local203) {
							local219 = local479;
						}
					}
					if (local219 != -1) {
						if (this.aByteArrayArray2[local219] == null || this.aByteArrayArray2[local219].length != local215) {
							this.aByteArrayArray2[local219] = new byte[local215];
						}
						this.aClass1_Sub3_Sub3_4.method392(local209, this.anInt207 - 6, this.aByteArrayArray2[local219], this.aBoolean52);
					}
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 250) {
					this.anInt172 = this.aClass1_Sub3_Sub3_4.method383();
					this.anInt173 = this.aClass1_Sub3_Sub3_4.method383();
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 253) {
					local199 = this.aClass1_Sub3_Sub3_4.method385();
					local203 = this.aClass1_Sub3_Sub3_4.method385();
					local209 = this.aClass1_Sub3_Sub3_4.method385();
					local331 = Class15.aClass15Array1[local199];
					@Pc(581) Class1_Sub3_Sub1 local581 = local331.aClass1_Sub3_Sub1_2;
					if (local581 != null) {
						local581.method236(local203, local209);
					}
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 248) {
					local199 = this.aClass1_Sub3_Sub3_4.method385();
					local203 = this.aClass1_Sub3_Sub3_4.method385();
					Class15.aClass15Array1[local199].aClass1_Sub3_Sub1_2 = new Class1_Sub3_Sub1(local203, 6);
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 230) {
					if (this.aBoolean58 && !aBoolean60) {
						local199 = this.aClass1_Sub3_Sub3_4.method385();
						local203 = this.aClass1_Sub3_Sub3_4.method388();
						local209 = this.anInt207 - 6;
						@Pc(643) byte[] local643 = new byte[local203];
						Class34.method511(local643, local203, this.aClass1_Sub3_Sub3_4.aByteArray7, local209, this.aClass1_Sub3_Sub3_4.anInt548);
						this.method78(local203, local643, false);
						this.anInt253 = local199;
					}
					this.anInt208 = -1;
					return true;
				}
				@Pc(791) int local791;
				@Pc(824) int local824;
				@Pc(677) long local677;
				if (this.anInt208 == 140) {
					local677 = this.aClass1_Sub3_Sub3_4.method389();
					local209 = this.aClass1_Sub3_Sub3_4.method383();
					@Pc(687) String local687 = Class40.method534(Class40.method531(local677));
					for (local219 = 0; local219 < this.anInt267; local219++) {
						if (local677 == this.aLongArray4[local219]) {
							if (this.anIntArray72[local219] != local209) {
								this.anIntArray72[local219] = local209;
								this.aBoolean44 = true;
								if (local209 > 0) {
									this.method94(5, "", local687 + " has logged in.");
								}
								if (local209 == 0) {
									this.method94(5, "", local687 + " has logged out.");
								}
							}
							local687 = null;
							break;
						}
					}
					if (local687 != null && this.anInt267 < 100) {
						this.aLongArray4[this.anInt267] = local677;
						this.aStringArray8[this.anInt267] = local687;
						this.anIntArray72[this.anInt267] = local209;
						this.anInt267++;
						this.aBoolean44 = true;
					}
					@Pc(785) boolean local785 = false;
					while (!local785) {
						local785 = true;
						for (local791 = 0; local791 < this.anInt267 - 1; local791++) {
							if (this.anIntArray72[local791] != anInt251 && this.anIntArray72[local791 + 1] == anInt251 || this.anIntArray72[local791] == 0 && this.anIntArray72[local791 + 1] != 0) {
								local824 = this.anIntArray72[local791];
								this.anIntArray72[local791] = this.anIntArray72[local791 + 1];
								this.anIntArray72[local791 + 1] = local824;
								@Pc(846) String local846 = this.aStringArray8[local791];
								this.aStringArray8[local791] = this.aStringArray8[local791 + 1];
								this.aStringArray8[local791 + 1] = local846;
								@Pc(868) long local868 = this.aLongArray4[local791];
								this.aLongArray4[local791] = this.aLongArray4[local791 + 1];
								this.aLongArray4[local791 + 1] = local868;
								this.aBoolean44 = true;
								local785 = false;
							}
						}
					}
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 132) {
					Class8.method209(true);
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 55) {
					for (local199 = 0; local199 < this.aClass1_Sub1_Sub3_Sub2Array1.length; local199++) {
						if (this.aClass1_Sub1_Sub3_Sub2Array1[local199] != null) {
							this.aClass1_Sub1_Sub3_Sub2Array1[local199].anInt906 = -1;
						}
					}
					for (local203 = 0; local203 < this.aClass1_Sub1_Sub3_Sub1Array1.length; local203++) {
						if (this.aClass1_Sub1_Sub3_Sub1Array1[local203] != null) {
							this.aClass1_Sub1_Sub3_Sub1Array1[local203].anInt906 = -1;
						}
					}
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 218) {
					local199 = this.aClass1_Sub3_Sub3_4.method385();
					@Pc(984) boolean local984 = this.aClass1_Sub3_Sub3_4.method383() == 1;
					Class15.aClass15Array1[local199].aBoolean113 = local984;
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 113) {
					this.anInt202 = this.anInt207 / 8;
					for (local199 = 0; local199 < this.anInt202; local199++) {
						this.aLongArray3[local199] = this.aClass1_Sub3_Sub3_4.method389();
					}
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 125) {
					this.anInt279 = 0;
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 235) {
					local199 = this.aClass1_Sub3_Sub3_4.method385();
					local203 = this.aClass1_Sub3_Sub3_4.method388();
					this.anIntArray85[local199] = local203;
					if (this.anIntArray41[local199] != local203) {
						this.anIntArray41[local199] = local203;
						this.method199(local199);
						this.aBoolean44 = true;
						if (this.anInt176 != -1) {
							this.aBoolean43 = true;
						}
					}
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 174) {
					this.aBoolean61 = true;
					this.anInt236 = this.aClass1_Sub3_Sub3_4.method383();
					this.anInt237 = this.aClass1_Sub3_Sub3_4.method383();
					this.anInt238 = this.aClass1_Sub3_Sub3_4.method385();
					this.anInt239 = this.aClass1_Sub3_Sub3_4.method383();
					this.anInt240 = this.aClass1_Sub3_Sub3_4.method383();
					if (this.anInt240 >= 100) {
						this.anInt242 = this.anInt236 * 128 + 64;
						this.anInt244 = this.anInt237 * 128 + 64;
						this.anInt243 = this.method132(this.anInt236, this.aByte19, this.anInt237, this.anInt337) - this.anInt238;
					}
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 47) {
					this.aBoolean61 = false;
					for (local199 = 0; local199 < 5; local199++) {
						this.aBooleanArray1[local199] = false;
					}
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 48) {
					local199 = this.aClass1_Sub3_Sub3_4.method385();
					local203 = this.aClass1_Sub3_Sub3_4.method385();
					@Pc(1197) Class3 local1197 = Class3.method32(local203);
					Class15.aClass15Array1[local199].aClass1_Sub3_Sub1_2 = local1197.method35();
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 240) {
					this.aBoolean61 = true;
					this.anInt303 = this.aClass1_Sub3_Sub3_4.method383();
					this.anInt304 = this.aClass1_Sub3_Sub3_4.method383();
					this.anInt305 = this.aClass1_Sub3_Sub3_4.method385();
					this.anInt306 = this.aClass1_Sub3_Sub3_4.method383();
					this.anInt307 = this.aClass1_Sub3_Sub3_4.method383();
					if (this.anInt307 >= 100) {
						local199 = this.anInt303 * 128 + 64;
						local203 = this.anInt304 * 128 + 64;
						local209 = this.method132(this.anInt303, this.aByte19, this.anInt304, this.anInt337) - this.anInt305;
						local215 = local199 - this.anInt242;
						local219 = local209 - this.anInt243;
						local479 = local203 - this.anInt244;
						local791 = (int) Math.sqrt((double) (local215 * local215 + local479 * local479));
						this.anInt245 = (int) (Math.atan2((double) local219, (double) local791) * 325.949D) & 0x7FF;
						this.anInt246 = (int) (Math.atan2((double) local215, (double) local479) * -325.949D) & 0x7FF;
						if (this.anInt245 < 128) {
							this.anInt245 = 128;
						}
						if (this.anInt245 > 383) {
							this.anInt245 = 383;
						}
					}
					this.anInt208 = -1;
					return true;
				}
				@Pc(1361) boolean local1361;
				if (this.anInt208 == 201) {
					local677 = this.aClass1_Sub3_Sub3_4.method389();
					local209 = this.aClass1_Sub3_Sub3_4.method388();
					local215 = this.aClass1_Sub3_Sub3_4.method383();
					local1361 = false;
					for (local479 = 0; local479 < 100; local479++) {
						if (this.anIntArray54[local479] == local209) {
							local1361 = true;
							break;
						}
					}
					if (local215 <= 1) {
						for (local791 = 0; local791 < this.anInt202; local791++) {
							if (this.aLongArray3[local791] == local677) {
								local1361 = true;
								break;
							}
						}
					}
					if (!local1361 && this.anInt334 == 0) {
						try {
							this.anIntArray54[this.anInt323] = local209;
							this.anInt323 = (this.anInt323 + 1) % 100;
							@Pc(1430) String local1430 = Class41.method537(this.anInt207 - 13, this.aClass1_Sub3_Sub3_4);
							@Pc(1434) String local1434 = Class25.method416(local1430);
							if (local215 > 1) {
								this.method94(7, Class40.method534(Class40.method531(local677)), local1434);
							} else {
								this.method94(3, Class40.method534(Class40.method531(local677)), local1434);
							}
						} catch (@Pc(1461) Exception local1461) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt208 = -1;
					return true;
				}
				@Pc(1481) Class15 local1481;
				if (this.anInt208 == 186) {
					local199 = this.aClass1_Sub3_Sub3_4.method385();
					local1481 = Class15.aClass15Array1[local199];
					for (local209 = 0; local209 < local1481.anIntArray149.length; local209++) {
						local1481.anIntArray149[local209] = -1;
						local1481.anIntArray149[local209] = 0;
					}
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 231) {
					local199 = this.aClass1_Sub3_Sub3_4.method385();
					local203 = this.aClass1_Sub3_Sub3_4.method385();
					if (this.anInt299 != -1) {
						this.anInt299 = -1;
						this.aBoolean43 = true;
					}
					if (this.aBoolean46) {
						this.aBoolean46 = false;
						this.aBoolean43 = true;
					}
					this.anInt220 = local199;
					this.anInt241 = local203;
					this.aBoolean44 = true;
					this.aBoolean42 = true;
					this.aBoolean62 = false;
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 255) {
					if (this.anInt241 != -1) {
						this.anInt241 = -1;
						this.aBoolean44 = true;
						this.aBoolean42 = true;
					}
					if (this.anInt299 != -1) {
						this.anInt299 = -1;
						this.aBoolean43 = true;
					}
					if (this.aBoolean46) {
						this.aBoolean46 = false;
						this.aBoolean43 = true;
					}
					this.anInt220 = -1;
					this.aBoolean62 = false;
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 202) {
					local199 = this.aClass1_Sub3_Sub3_4.method385();
					local203 = this.aClass1_Sub3_Sub3_4.method383();
					local209 = this.aClass1_Sub3_Sub3_4.method385();
					if (this.aBoolean64 && !aBoolean60 && this.anInt175 < 50) {
						this.anIntArray79[this.anInt175] = local199;
						this.anIntArray55[this.anInt175] = local203;
						this.anIntArray73[this.anInt175] = local209 + Class43.anIntArray231[local199];
						this.anInt175++;
					}
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 216) {
					for (local199 = 0; local199 < this.anIntArray41.length; local199++) {
						if (this.anIntArray41[local199] != this.anIntArray85[local199]) {
							this.anIntArray41[local199] = this.anIntArray85[local199];
							this.method199(local199);
							this.aBoolean44 = true;
						}
					}
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 33) {
					local199 = this.aClass1_Sub3_Sub3_4.method385();
					local203 = this.aClass1_Sub3_Sub3_4.method385();
					local209 = this.aClass1_Sub3_Sub3_4.method385();
					@Pc(1724) Class5 local1724 = Class5.method54(local203);
					Class15.aClass15Array1[local199].aClass1_Sub3_Sub1_2 = local1724.method58(50);
					Class15.aClass15Array1[local199].anInt480 = local1724.anInt99;
					Class15.aClass15Array1[local199].anInt481 = local1724.anInt100;
					Class15.aClass15Array1[local199].anInt479 = local1724.anInt98 * 100 / local209;
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 39) {
					this.method177();
					this.anInt208 = -1;
					return false;
				}
				if (this.anInt208 == 169) {
					local199 = this.aClass1_Sub3_Sub3_4.method385();
					Class15.aClass15Array1[local199].aClass1_Sub3_Sub1_2 = this.aClass1_Sub1_Sub3_Sub2_1.method566();
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 57) {
					if (this.anInt197 == 12) {
						this.aBoolean44 = true;
					}
					this.anInt165 = this.aClass1_Sub3_Sub3_4.method386();
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 153) {
					local199 = this.aClass1_Sub3_Sub3_4.method385();
					this.method195(local199);
					if (this.anInt299 != -1) {
						this.anInt299 = -1;
						this.aBoolean43 = true;
					}
					if (this.aBoolean46) {
						this.aBoolean46 = false;
						this.aBoolean43 = true;
					}
					this.anInt241 = local199;
					this.aBoolean44 = true;
					this.aBoolean42 = true;
					this.anInt220 = -1;
					this.aBoolean62 = false;
					this.anInt208 = -1;
					return true;
				}
				@Pc(1875) String local1875;
				if (this.anInt208 == 176) {
					local199 = this.aClass1_Sub3_Sub3_4.method385();
					local1875 = this.aClass1_Sub3_Sub3_4.method390();
					Class15.aClass15Array1[local199].aString20 = local1875;
					if (Class15.aClass15Array1[local199].anInt460 == this.anIntArray57[this.anInt197]) {
						this.aBoolean44 = true;
					}
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 3) {
					local199 = this.aClass1_Sub3_Sub3_4.method385();
					local203 = this.aClass1_Sub3_Sub3_4.method385();
					if (this.anInt282 == local199 && this.anInt283 == local203 && this.anInt185 != 0) {
						this.anInt208 = -1;
						return true;
					}
					this.anInt282 = local199;
					this.anInt283 = local203;
					this.anInt295 = (this.anInt282 - 6) * 8;
					this.anInt296 = (this.anInt283 - 6) * 8;
					this.anInt185 = 1;
					this.aClass32_18.method455();
					this.aClass1_Sub3_Sub2_Sub4_2.method358(151, "Loading - please wait.", 257, 0);
					this.aClass1_Sub3_Sub2_Sub4_2.method358(150, "Loading - please wait.", 256, 16777215);
					this.aClass32_18.method456(11, 8, super.aGraphics2);
					signlink.looprate(5);
					local209 = (this.anInt207 - 2) / 10;
					this.aByteArrayArray1 = new byte[local209][];
					this.aByteArrayArray2 = new byte[local209][];
					this.anIntArray46 = new int[local209];
					this.aClass1_Sub3_Sub3_5.method372(131);
					this.aClass1_Sub3_Sub3_5.method373(0);
					local215 = 0;
					@Pc(2031) int local2031;
					for (local219 = 0; local219 < local209; local219++) {
						local479 = this.aClass1_Sub3_Sub3_4.method383();
						local791 = this.aClass1_Sub3_Sub3_4.method383();
						local824 = this.aClass1_Sub3_Sub3_4.method388();
						local2031 = this.aClass1_Sub3_Sub3_4.method388();
						this.anIntArray46[local219] = (local479 << 8) + local791;
						@Pc(2055) byte[] local2055;
						if (local824 != 0) {
							local2055 = signlink.cacheload("m" + local479 + "_" + local791);
							if (local2055 != null) {
								this.aCRC32_1.reset();
								this.aCRC32_1.update(local2055);
								if ((int) this.aCRC32_1.getValue() != local824) {
									local2055 = null;
								}
							}
							if (local2055 == null) {
								this.anInt185 = 0;
								this.aClass1_Sub3_Sub3_5.method373(0);
								this.aClass1_Sub3_Sub3_5.method373(local479);
								this.aClass1_Sub3_Sub3_5.method373(local791);
								local215 += 3;
							} else {
								this.aByteArrayArray1[local219] = local2055;
							}
						}
						if (local2031 != 0) {
							local2055 = signlink.cacheload("l" + local479 + "_" + local791);
							if (local2055 != null) {
								this.aCRC32_1.reset();
								this.aCRC32_1.update(local2055);
								if ((int) this.aCRC32_1.getValue() != local2031) {
									local2055 = null;
								}
							}
							if (local2055 == null) {
								this.anInt185 = 0;
								this.aClass1_Sub3_Sub3_5.method373(1);
								this.aClass1_Sub3_Sub3_5.method373(local479);
								this.aClass1_Sub3_Sub3_5.method373(local791);
								local215 += 3;
							} else {
								this.aByteArrayArray2[local219] = local2055;
							}
						}
					}
					this.aClass1_Sub3_Sub3_5.method382(local215);
					signlink.looprate(50);
					this.aClass32_18.method455();
					if (this.anInt185 == 0) {
						this.aClass1_Sub3_Sub2_Sub4_2.method358(166, "Map area updated since last visit, so load will take longer this time only", 257, 0);
						this.aClass1_Sub3_Sub2_Sub4_2.method358(165, "Map area updated since last visit, so load will take longer this time only", 256, 16777215);
					}
					this.aClass32_18.method456(11, 8, super.aGraphics2);
					local479 = this.anInt295 - this.anInt297;
					local791 = this.anInt296 - this.anInt298;
					this.anInt297 = this.anInt295;
					this.anInt298 = this.anInt296;
					for (local824 = 0; local824 < 8192; local824++) {
						@Pc(2225) Class1_Sub1_Sub3_Sub1 local2225 = this.aClass1_Sub1_Sub3_Sub1Array1[local824];
						if (local2225 != null) {
							for (@Pc(2229) int local2229 = 0; local2229 < 10; local2229++) {
								local2225.anIntArray232[local2229] -= local479;
								local2225.anIntArray233[local2229] -= local791;
							}
							local2225.anInt881 -= local479 * 128;
							local2225.anInt882 -= local791 * 128;
						}
					}
					for (local2031 = 0; local2031 < this.anInt147; local2031++) {
						@Pc(2280) Class1_Sub1_Sub3_Sub2 local2280 = this.aClass1_Sub1_Sub3_Sub2Array1[local2031];
						if (local2280 != null) {
							for (@Pc(2284) int local2284 = 0; local2284 < 10; local2284++) {
								local2280.anIntArray232[local2284] -= local479;
								local2280.anIntArray233[local2284] -= local791;
							}
							local2280.anInt881 -= local479 * 128;
							local2280.anInt882 -= local791 * 128;
						}
					}
					@Pc(2329) byte local2329 = 0;
					@Pc(2331) byte local2331 = 104;
					@Pc(2333) byte local2333 = 1;
					if (local479 < 0) {
						local2329 = 103;
						local2331 = -1;
						local2333 = -1;
					}
					@Pc(2343) byte local2343 = 0;
					@Pc(2345) byte local2345 = 104;
					@Pc(2347) byte local2347 = 1;
					if (local791 < 0) {
						local2343 = 103;
						local2345 = -1;
						local2347 = -1;
					}
					for (@Pc(2357) int local2357 = local2329; local2357 != local2331; local2357 += local2333) {
						for (@Pc(2361) int local2361 = local2343; local2361 != local2345; local2361 += local2347) {
							@Pc(2367) int local2367 = local2357 + local479;
							@Pc(2371) int local2371 = local2361 + local791;
							for (@Pc(2373) int local2373 = 0; local2373 < 4; local2373++) {
								if (local2367 >= 0 && local2371 >= 0 && local2367 < 104 && local2371 < 104) {
									this.aClass28ArrayArrayArray1[local2373][local2357][local2361] = this.aClass28ArrayArrayArray1[local2373][local2367][local2371];
								} else {
									this.aClass28ArrayArrayArray1[local2373][local2357][local2361] = null;
								}
							}
						}
					}
					for (@Pc(2435) Class1_Sub4 local2435 = (Class1_Sub4) this.aClass28_2.method448(); local2435 != null; local2435 = (Class1_Sub4) this.aClass28_2.method450(this.anInt161)) {
						local2435.anInt581 -= local479;
						local2435.anInt582 -= local791;
						if (local2435.anInt581 < 0 || local2435.anInt582 < 0 || local2435.anInt581 >= 104 || local2435.anInt582 >= 104) {
							local2435.method559();
						}
					}
					if (this.anInt279 != 0) {
						this.anInt279 -= local479;
						this.anInt280 -= local791;
					}
					this.aBoolean61 = false;
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 165) {
					local199 = this.aClass1_Sub3_Sub3_4.method386();
					this.anInt176 = local199;
					this.aBoolean43 = true;
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 147) {
					this.anInt172 = this.aClass1_Sub3_Sub3_4.method383();
					this.anInt173 = this.aClass1_Sub3_Sub3_4.method383();
					for (local199 = this.anInt172; local199 < this.anInt172 + 8; local199++) {
						for (local203 = this.anInt173; local203 < this.anInt173 + 8; local203++) {
							if (this.aClass28ArrayArrayArray1[this.anInt337][local199][local203] != null) {
								this.aClass28ArrayArrayArray1[this.anInt337][local199][local203] = null;
								this.method149(local199, local203);
							}
						}
					}
					for (@Pc(2583) Class1_Sub4 local2583 = (Class1_Sub4) this.aClass28_2.method448(); local2583 != null; local2583 = (Class1_Sub4) this.aClass28_2.method450(this.anInt161)) {
						if (local2583.anInt581 >= this.anInt172 && local2583.anInt581 < this.anInt172 + 8 && local2583.anInt582 >= this.anInt173 && local2583.anInt582 < this.anInt173 + 8 && local2583.anInt579 == this.anInt337) {
							this.method88(local2583.anInt587, local2583.anInt581, local2583.anInt582, local2583.anInt586, local2583.anInt579, local2583.anInt588, local2583.anInt580);
							local2583.method559();
						}
					}
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 85) {
					this.anInt197 = this.aClass1_Sub3_Sub3_4.method383();
					this.aBoolean44 = true;
					this.aBoolean42 = true;
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 107) {
					if (this.anInt197 == 12) {
						this.aBoolean44 = true;
					}
					this.anInt265 = this.aClass1_Sub3_Sub3_4.method383();
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 192) {
					this.anInt172 = this.aClass1_Sub3_Sub3_4.method383();
					this.anInt173 = this.aClass1_Sub3_Sub3_4.method383();
					while (this.aClass1_Sub3_Sub3_4.anInt548 < this.anInt207) {
						local199 = this.aClass1_Sub3_Sub3_4.method383();
						this.method145(local199, this.aClass1_Sub3_Sub3_4);
					}
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 38) {
					this.aBoolean44 = true;
					local199 = this.aClass1_Sub3_Sub3_4.method385();
					local1481 = Class15.aClass15Array1[local199];
					while (this.aClass1_Sub3_Sub3_4.anInt548 < this.anInt207) {
						local209 = this.aClass1_Sub3_Sub3_4.method383();
						local215 = this.aClass1_Sub3_Sub3_4.method385();
						local219 = this.aClass1_Sub3_Sub3_4.method383();
						if (local219 == 255) {
							local219 = this.aClass1_Sub3_Sub3_4.method388();
						}
						if (local209 >= 0 && local209 < local1481.anIntArray149.length) {
							local1481.anIntArray149[local209] = local215;
							local1481.anIntArray150[local209] = local219;
						}
					}
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 80) {
					local199 = this.aClass1_Sub3_Sub3_4.method385();
					local203 = this.aClass1_Sub3_Sub3_4.method385();
					Class15.aClass15Array1[local199].anInt477 = local203;
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 100) {
					local199 = this.aClass1_Sub3_Sub3_4.method385();
					local203 = this.aClass1_Sub3_Sub3_4.method383();
					if (local199 == 65535) {
						local199 = -1;
					}
					this.anIntArray57[local203] = local199;
					this.aBoolean44 = true;
					this.aBoolean42 = true;
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 128) {
					this.method127(this.aClass1_Sub3_Sub3_4, this.anInt207);
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 242) {
					this.anInt179 = this.aClass1_Sub3_Sub3_4.method385() * 30;
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 177) {
					this.anInt178 = this.aClass1_Sub3_Sub3_4.method385();
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 112) {
					local2898 = this.aClass1_Sub3_Sub3_4.method390();
					@Pc(2912) long local2912;
					if (local2898.endsWith(":tradereq:")) {
						local1875 = local2898.substring(0, local2898.indexOf(":"));
						local2912 = Class40.method530(local1875);
						local1361 = false;
						for (local479 = 0; local479 < this.anInt202; local479++) {
							if (this.aLongArray3[local479] == local2912) {
								local1361 = true;
								break;
							}
						}
						if (!local1361 && this.anInt334 == 0) {
							this.method94(4, local1875, "wishes to trade with you.");
						}
					} else if (local2898.endsWith(":duelreq:")) {
						local1875 = local2898.substring(0, local2898.indexOf(":"));
						local2912 = Class40.method530(local1875);
						local1361 = false;
						for (local479 = 0; local479 < this.anInt202; local479++) {
							if (this.aLongArray3[local479] == local2912) {
								local1361 = true;
								break;
							}
						}
						if (!local1361 && this.anInt334 == 0) {
							this.method94(8, local1875, "wishes to duel with you.");
						}
					} else {
						this.method94(0, "", local2898);
					}
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 42) {
					this.anInt198 = this.aClass1_Sub3_Sub3_4.method383();
					if (this.anInt198 == 1) {
						this.anInt311 = this.aClass1_Sub3_Sub3_4.method385();
					}
					if (this.anInt198 >= 2 && this.anInt198 <= 6) {
						if (this.anInt198 == 2) {
							this.anInt330 = 64;
							this.anInt331 = 64;
						}
						if (this.anInt198 == 3) {
							this.anInt330 = 0;
							this.anInt331 = 64;
						}
						if (this.anInt198 == 4) {
							this.anInt330 = 128;
							this.anInt331 = 64;
						}
						if (this.anInt198 == 5) {
							this.anInt330 = 64;
							this.anInt331 = 0;
						}
						if (this.anInt198 == 6) {
							this.anInt330 = 64;
							this.anInt331 = 128;
						}
						this.anInt198 = 2;
						this.anInt327 = this.aClass1_Sub3_Sub3_4.method385();
						this.anInt328 = this.aClass1_Sub3_Sub3_4.method385();
						this.anInt329 = this.aClass1_Sub3_Sub3_4.method383();
					}
					if (this.anInt198 == 10) {
						this.anInt293 = this.aClass1_Sub3_Sub3_4.method385();
					}
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 180) {
					local199 = this.aClass1_Sub3_Sub3_4.method385();
					this.method195(local199);
					if (this.anInt241 != -1) {
						this.anInt241 = -1;
						this.aBoolean44 = true;
						this.aBoolean42 = true;
					}
					if (this.anInt299 != -1) {
						this.anInt299 = -1;
						this.aBoolean43 = true;
					}
					if (this.aBoolean46) {
						this.aBoolean46 = false;
						this.aBoolean43 = true;
					}
					this.anInt220 = local199;
					this.aBoolean62 = false;
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 66) {
					local199 = this.aClass1_Sub3_Sub3_4.method383();
					local203 = this.aClass1_Sub3_Sub3_4.method383();
					local209 = this.aClass1_Sub3_Sub3_4.method385();
					local215 = this.aClass1_Sub3_Sub3_4.method385();
					local219 = -1;
					for (local479 = 0; local479 < this.anIntArray46.length; local479++) {
						if (this.anIntArray46[local479] == (local199 << 8) + local203) {
							local219 = local479;
						}
					}
					if (local219 != -1) {
						if (this.aByteArrayArray1[local219] == null || this.aByteArrayArray1[local219].length != local215) {
							this.aByteArrayArray1[local219] = new byte[local215];
						}
						this.aClass1_Sub3_Sub3_4.method392(local209, this.anInt207 - 6, this.aByteArrayArray1[local219], this.aBoolean52);
					}
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 72) {
					this.anInt269 = this.aClass1_Sub3_Sub3_4.method383();
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 117 || this.anInt208 == 25 || this.anInt208 == 127 || this.anInt208 == 195 || this.anInt208 == 1 || this.anInt208 == 61 || this.anInt208 == 246 || this.anInt208 == 78 || this.anInt208 == 214 || this.anInt208 == 220) {
					this.method145(this.anInt208, this.aClass1_Sub3_Sub3_4);
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 60) {
					local199 = this.aClass1_Sub3_Sub3_4.method383();
					local203 = this.aClass1_Sub3_Sub3_4.method383();
					local209 = -1;
					for (local215 = 0; local215 < this.anIntArray46.length; local215++) {
						if (this.anIntArray46[local215] == (local199 << 8) + local203) {
							local209 = local215;
						}
					}
					if (local209 != -1) {
						signlink.cachesave("l" + local199 + "_" + local203, this.aByteArrayArray2[local209]);
						this.anInt185 = 1;
					}
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 171) {
					this.anInt134 = this.aClass1_Sub3_Sub3_4.method388();
					this.anInt322 = this.aClass1_Sub3_Sub3_4.method385();
					this.anInt156 = this.aClass1_Sub3_Sub3_4.method383();
					this.anInt177 = this.aClass1_Sub3_Sub3_4.method385();
					if (this.anInt134 != 0 && this.anInt220 == -1) {
						signlink.dnslookup(Class40.method533(this.anInt134));
						this.method165();
						@Pc(3424) short local3424 = 650;
						if (this.anInt156 != 201) {
							local3424 = 655;
						}
						this.aString14 = "";
						this.aBoolean40 = false;
						for (local203 = 0; local203 < Class15.aClass15Array1.length; local203++) {
							if (Class15.aClass15Array1[local203] != null && Class15.aClass15Array1[local203].anInt463 == local3424) {
								this.anInt220 = Class15.aClass15Array1[local203].anInt460;
								break;
							}
						}
					}
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 68) {
					Class8.method208();
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 92) {
					local2898 = this.aClass1_Sub3_Sub3_4.method390();
					local203 = this.aClass1_Sub3_Sub3_4.method388();
					local209 = this.aClass1_Sub3_Sub3_4.method388();
					if (!local2898.equals(this.aString17) && this.aBoolean58 && !aBoolean60) {
						this.method171(local203, local2898, local209);
					}
					this.aString17 = local2898;
					this.anInt216 = local203;
					this.anInt281 = local209;
					this.anInt253 = 0;
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 133) {
					local199 = this.aClass1_Sub3_Sub3_4.method385();
					@Pc(3540) byte local3540 = this.aClass1_Sub3_Sub3_4.method384();
					this.anIntArray85[local199] = local3540;
					if (this.anIntArray41[local199] != local3540) {
						this.anIntArray41[local199] = local3540;
						this.method199(local199);
						this.aBoolean44 = true;
						if (this.anInt176 != -1) {
							this.aBoolean43 = true;
						}
					}
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 49) {
					this.method97(this.aClass1_Sub3_Sub3_4, this.anInt207);
					if (this.anInt185 == 1) {
						this.anInt185 = 2;
						Class4.anInt77 = this.anInt337;
						this.method139();
					}
					if (aBoolean60 && this.anInt185 == 2 && Class4.anInt77 != this.anInt337) {
						this.aClass32_18.method455();
						this.aClass1_Sub3_Sub2_Sub4_2.method358(151, "Loading - please wait.", 257, 0);
						this.aClass1_Sub3_Sub2_Sub4_2.method358(150, "Loading - please wait.", 256, 16777215);
						this.aClass32_18.method456(11, 8, super.aGraphics2);
						Class4.anInt77 = this.anInt337;
						this.method139();
					}
					if (this.anInt337 != this.anInt248 && this.anInt185 == 2) {
						this.anInt248 = this.anInt337;
						this.method161(this.anInt337);
					}
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 94) {
					this.aBoolean44 = true;
					local199 = this.aClass1_Sub3_Sub3_4.method383();
					local203 = this.aClass1_Sub3_Sub3_4.method388();
					local209 = this.aClass1_Sub3_Sub3_4.method383();
					this.anIntArray40[local199] = local203;
					this.anIntArray71[local199] = local209;
					this.anIntArray76[local199] = 1;
					for (local215 = 0; local215 < 98; local215++) {
						if (local203 >= anIntArray82[local215]) {
							this.anIntArray76[local199] = local215 + 2;
						}
					}
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 254) {
					this.aBoolean65 = false;
					this.aBoolean46 = true;
					this.aString6 = "";
					this.aBoolean43 = true;
					this.anInt208 = -1;
					return true;
				}
				if (this.anInt208 == 123) {
					this.aBoolean44 = true;
					local199 = this.aClass1_Sub3_Sub3_4.method385();
					local1481 = Class15.aClass15Array1[local199];
					local209 = this.aClass1_Sub3_Sub3_4.method383();
					for (local215 = 0; local215 < local209; local215++) {
						local1481.anIntArray149[local215] = this.aClass1_Sub3_Sub3_4.method385();
						local219 = this.aClass1_Sub3_Sub3_4.method383();
						if (local219 == 255) {
							local219 = this.aClass1_Sub3_Sub3_4.method388();
						}
						local1481.anIntArray150[local215] = local219;
					}
					for (local219 = local209; local219 < local1481.anIntArray149.length; local219++) {
						local1481.anIntArray149[local219] = 0;
						local1481.anIntArray150[local219] = 0;
					}
					this.anInt208 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt208 + "," + this.anInt207 + " - " + this.anInt309 + "," + this.anInt310);
				this.method177();
			} catch (@Pc(3850) IOException local3850) {
				this.method122(366);
			} catch (@Pc(3855) Exception local3855) {
				local2898 = "T2 - " + this.anInt208 + "," + this.anInt309 + "," + this.anInt310 + " - " + this.anInt207 + "," + (this.anInt295 + this.aClass1_Sub1_Sub3_Sub2_1.anIntArray232[0]) + "," + (this.anInt296 + this.aClass1_Sub1_Sub3_Sub2_1.anIntArray233[0]) + " - ";
				for (local203 = 0; local203 < this.anInt207 && local203 < 50; local203++) {
					local2898 = local2898 + this.aClass1_Sub3_Sub3_4.aByteArray7[local203] + ",";
				}
				signlink.reporterror(local2898);
				this.method177();
			}
			return true;
		} catch (@Pc(3938) RuntimeException local3938) {
			signlink.reporterror("95314, " + -50 + ", " + local3938.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!kb;IB)V")
	private void method136(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			arg0.method393();
			@Pc(7) int local7 = arg0.method394(1);
			@Pc(12) boolean local12 = false;
			if (local7 != 0) {
				@Pc(27) int local27 = arg0.method394(2);
				if (local27 == 0) {
					this.anIntArray33[this.anInt150++] = this.anInt148;
				} else {
					@Pc(50) int local50;
					@Pc(61) int local61;
					if (local27 == 1) {
						local50 = arg0.method394(3);
						this.aClass1_Sub1_Sub3_Sub2_1.method562(false, local50);
						local61 = arg0.method394(1);
						if (local61 == 1) {
							this.anIntArray33[this.anInt150++] = this.anInt148;
						}
					} else {
						@Pc(107) int local107;
						if (local27 == 2) {
							local50 = arg0.method394(3);
							this.aClass1_Sub1_Sub3_Sub2_1.method562(true, local50);
							local61 = arg0.method394(3);
							this.aClass1_Sub1_Sub3_Sub2_1.method562(true, local61);
							local107 = arg0.method394(1);
							if (local107 == 1) {
								this.anIntArray33[this.anInt150++] = this.anInt148;
							}
						} else if (local27 == 3) {
							this.anInt337 = arg0.method394(2);
							local50 = arg0.method394(7);
							local61 = arg0.method394(7);
							local107 = arg0.method394(1);
							this.aClass1_Sub1_Sub3_Sub2_1.method561(local61, local107 == 1, local50);
							@Pc(164) int local164 = arg0.method394(1);
							if (local164 == 1) {
								this.anIntArray33[this.anInt150++] = this.anInt148;
							}
						}
					}
				}
			}
		} catch (@Pc(181) RuntimeException local181) {
			signlink.reporterror("97021, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local181.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)Z")
	private boolean method137(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(8) int local8 = this.anIntArray60[arg0];
			if (local8 >= 2000) {
				local8 -= 2000;
			}
			return local8 == 447;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("7621, " + true + ", " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method138() {
		try {
			if (this.anInt272 == 0) {
				@Pc(16) int local16 = super.anInt127;
				if (this.anInt319 == 1 && super.anInt128 >= 520 && super.anInt129 >= 165 && super.anInt128 <= 788 && super.anInt129 <= 230) {
					local16 = 0;
				}
				@Pc(47) int local47;
				@Pc(50) int local50;
				@Pc(126) int local126;
				if (this.aBoolean63) {
					if (local16 != 1) {
						local47 = super.anInt125;
						local50 = super.anInt126;
						if (this.anInt287 == 0) {
							local47 -= 8;
							local50 -= 11;
						}
						if (this.anInt287 == 1) {
							local47 -= 562;
							local50 -= 231;
						}
						if (this.anInt287 == 2) {
							local47 -= 22;
							local50 -= 375;
						}
						if (local47 < this.anInt288 - 10 || local47 > this.anInt288 + this.anInt290 + 10 || local50 < this.anInt289 - 10 || local50 > this.anInt289 + this.anInt291 + 10) {
							this.aBoolean63 = false;
							if (this.anInt287 == 1) {
								this.aBoolean44 = true;
							}
							if (this.anInt287 == 2) {
								this.aBoolean43 = true;
							}
						}
					}
					if (local16 == 1) {
						local47 = this.anInt288;
						local50 = this.anInt289;
						local126 = this.anInt290;
						@Pc(129) int local129 = super.anInt128;
						@Pc(132) int local132 = super.anInt129;
						if (this.anInt287 == 0) {
							local129 -= 8;
							local132 -= 11;
						}
						if (this.anInt287 == 1) {
							local129 -= 562;
							local132 -= 231;
						}
						if (this.anInt287 == 2) {
							local129 -= 22;
							local132 -= 375;
						}
						@Pc(151) int local151 = -1;
						for (@Pc(153) int local153 = 0; local153 < this.anInt153; local153++) {
							@Pc(168) int local168 = local50 + (this.anInt153 - 1 - local153) * 15 + 31;
							if (local129 > local47 && local129 < local47 + local126 && local132 > local168 - 13 && local132 < local168 + 3) {
								local151 = local153;
							}
						}
						if (local151 != -1) {
							this.method98(local151);
						}
						this.aBoolean63 = false;
						if (this.anInt287 == 1) {
							this.aBoolean44 = true;
						}
						if (this.anInt287 == 2) {
							this.aBoolean43 = true;
							return;
						}
					}
				} else {
					if (local16 == 1 && this.anInt153 > 0) {
						local47 = this.anIntArray60[this.anInt153 - 1];
						if (local47 == 134 || local47 == 701 || local47 == 570 || local47 == 719 || local47 == 440 || local47 == 871 || local47 == 526 || local47 == 156 || local47 == 120 || local47 == 796 || local47 == 357) {
							local50 = this.anIntArray58[this.anInt153 - 1];
							local126 = this.anIntArray59[this.anInt153 - 1];
							@Pc(285) Class15 local285 = Class15.aClass15Array1[local126];
							if (local285.aBoolean115) {
								this.aBoolean66 = false;
								this.anInt247 = 0;
								this.anInt270 = local126;
								this.anInt271 = local50;
								this.anInt272 = 2;
								this.anInt273 = super.anInt128;
								this.anInt274 = super.anInt129;
								if (Class15.aClass15Array1[local126].anInt460 == this.anInt220) {
									this.anInt272 = 1;
								}
								if (Class15.aClass15Array1[local126].anInt460 == this.anInt299) {
									this.anInt272 = 3;
								}
								return;
							}
						}
					}
					if (local16 == 1 && (this.anInt221 == 1 || this.method137(this.anInt153 - 1)) && this.anInt153 > 2) {
						local16 = 2;
					}
					if (local16 == 1 && this.anInt153 > 0) {
						this.method98(this.anInt153 - 1);
					}
					if (local16 != 2 || this.anInt153 <= 0) {
						return;
					}
					this.method193();
				}
			}
		} catch (@Pc(377) RuntimeException local377) {
			signlink.reporterror("92965, " + -715 + ", " + local377.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method139() {
		try {
			try {
				this.anInt248 = -1;
				this.aClass28_3.method452();
				this.aClass28_5.method452();
				this.aClass28_1.method452();
				this.aClass28_4.method452();
				Class1_Sub3_Sub2_Sub1.method288();
				this.method178();
				this.aClass33_1.method459();
				for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
					this.aClass9Array1[local27].method248();
				}
				System.gc();
				@Pc(52) Class4 local52 = new Class4(this.aByteArrayArrayArray7, this.anIntArrayArrayArray3, 104, 104, this.anInt184);
				@Pc(55) byte[] local55 = new byte[100000];
				@Pc(59) int local59 = this.aByteArrayArray1.length;
				Class4.aBoolean28 = Class33.aBoolean164;
				@Pc(72) int local72;
				@Pc(79) int local79;
				for (@Pc(63) int local63 = 0; local63 < local59; local63++) {
					local72 = this.anIntArray46[local63] >> 8;
					local79 = this.anIntArray46[local63] & 0xFF;
					if (local72 == 33 && local79 >= 71 && local79 <= 73) {
						Class4.aBoolean28 = false;
					}
				}
				if (Class4.aBoolean28) {
					this.aClass33_1.method460(this.anInt337);
				} else {
					this.aClass33_1.method460(0);
				}
				this.aClass1_Sub3_Sub3_5.method372(126);
				@Pc(156) int local156;
				for (local72 = 0; local72 < local59; local72++) {
					local79 = (this.anIntArray46[local72] >> 8) * 64 - this.anInt295;
					@Pc(142) int local142 = (this.anIntArray46[local72] & 0xFF) * 64 - this.anInt296;
					@Pc(147) byte[] local147 = this.aByteArrayArray1[local72];
					if (local147 != null) {
						local156 = (new Class1_Sub3_Sub3(local147, 0)).method388();
						Class34.method511(local55, local156, local147, local147.length - 4, 4);
						local52.method37((this.anInt283 - 6) * 8, local79, local142, local55, (this.anInt282 - 6) * 8);
					} else if (this.anInt283 < 800) {
						local52.method36(local79, local142, 626);
					}
				}
				this.aClass1_Sub3_Sub3_5.method372(126);
				@Pc(224) int local224;
				for (local79 = 0; local79 < local59; local79++) {
					@Pc(215) byte[] local215 = this.aByteArrayArray2[local79];
					if (local215 != null) {
						local224 = (new Class1_Sub3_Sub3(local215, 0)).method388();
						Class34.method511(local55, local224, local215, local215.length - 4, 4);
						local156 = (this.anIntArray46[local79] >> 8) * 64 - this.anInt295;
						@Pc(258) int local258 = (this.anIntArray46[local79] & 0xFF) * 64 - this.anInt296;
						local52.method38(this.aClass33_1, this.aClass28_5, local55, this.aClass9Array1, local156, local258);
					}
				}
				this.aClass1_Sub3_Sub3_5.method372(126);
				local52.method40(this.aClass33_1, this.anInt217, this.aClass9Array1);
				this.aClass32_18.method455();
				this.aClass1_Sub3_Sub3_5.method372(126);
				for (@Pc(301) Class1_Sub6 local301 = (Class1_Sub6) this.aClass28_5.method448(); local301 != null; local301 = (Class1_Sub6) this.aClass28_5.method450(this.anInt161)) {
					if ((this.aByteArrayArrayArray7[1][local301.anInt636][local301.anInt637] & 0x2) == 2) {
						local301.anInt634--;
						if (local301.anInt634 < 0) {
							local301.method559();
						}
					}
				}
				for (local224 = 0; local224 < 104; local224++) {
					for (local156 = 0; local156 < 104; local156++) {
						this.method149(local224, local156);
					}
				}
				for (@Pc(362) Class1_Sub4 local362 = (Class1_Sub4) this.aClass28_2.method448(); local362 != null; local362 = (Class1_Sub4) this.aClass28_2.method450(this.anInt161)) {
					this.method88(local362.anInt584, local362.anInt581, local362.anInt582, local362.anInt583, local362.anInt579, local362.anInt585, local362.anInt580);
				}
			} catch (@Pc(392) Exception local392) {
			}
			Class2.aClass35_1.method521();
			System.gc();
			Class1_Sub3_Sub2_Sub1.method289();
		} catch (@Pc(406) RuntimeException local406) {
			signlink.reporterror("59436, " + 0 + ", " + local406.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method140() {
		try {
			this.aBoolean72 &= true;
			this.aClass1_Sub3_Sub2_Sub3_1 = new Class1_Sub3_Sub2_Sub3(this.aClass39_1, "titlebox", 0);
			this.aClass1_Sub3_Sub2_Sub3_2 = new Class1_Sub3_Sub2_Sub3(this.aClass39_1, "titlebutton", 0);
			this.aClass1_Sub3_Sub2_Sub3Array3 = new Class1_Sub3_Sub2_Sub3[12];
			for (@Pc(31) int local31 = 0; local31 < 12; local31++) {
				this.aClass1_Sub3_Sub2_Sub3Array3[local31] = new Class1_Sub3_Sub2_Sub3(this.aClass39_1, "runes", local31);
			}
			this.aClass1_Sub3_Sub2_Sub2_4 = new Class1_Sub3_Sub2_Sub2(128, 265);
			this.aClass1_Sub3_Sub2_Sub2_5 = new Class1_Sub3_Sub2_Sub2(128, 265);
			for (@Pc(64) int local64 = 0; local64 < 33920; local64++) {
				this.aClass1_Sub3_Sub2_Sub2_4.anIntArray148[local64] = this.aClass32_23.anIntArray197[local64];
			}
			for (@Pc(82) int local82 = 0; local82 < 33920; local82++) {
				this.aClass1_Sub3_Sub2_Sub2_5.anIntArray148[local82] = this.aClass32_24.anIntArray197[local82];
			}
			this.anIntArray67 = new int[256];
			for (@Pc(104) int local104 = 0; local104 < 64; local104++) {
				this.anIntArray67[local104] = local104 * 262144;
			}
			for (@Pc(119) int local119 = 0; local119 < 64; local119++) {
				this.anIntArray67[local119 + 64] = local119 * 1024 + 16711680;
			}
			for (@Pc(138) int local138 = 0; local138 < 64; local138++) {
				this.anIntArray67[local138 + 128] = local138 * 4 + 16776960;
			}
			for (@Pc(157) int local157 = 0; local157 < 64; local157++) {
				this.anIntArray67[local157 + 192] = 16777215;
			}
			this.anIntArray68 = new int[256];
			for (@Pc(176) int local176 = 0; local176 < 64; local176++) {
				this.anIntArray68[local176] = local176 * 1024;
			}
			for (@Pc(191) int local191 = 0; local191 < 64; local191++) {
				this.anIntArray68[local191 + 64] = local191 * 4 + 65280;
			}
			for (@Pc(210) int local210 = 0; local210 < 64; local210++) {
				this.anIntArray68[local210 + 128] = local210 * 262144 + 65535;
			}
			for (@Pc(229) int local229 = 0; local229 < 64; local229++) {
				this.anIntArray68[local229 + 192] = 16777215;
			}
			this.anIntArray69 = new int[256];
			for (@Pc(248) int local248 = 0; local248 < 64; local248++) {
				this.anIntArray69[local248] = local248 * 4;
			}
			for (@Pc(263) int local263 = 0; local263 < 64; local263++) {
				this.anIntArray69[local263 + 64] = local263 * 262144 + 255;
			}
			for (@Pc(282) int local282 = 0; local282 < 64; local282++) {
				this.anIntArray69[local282 + 128] = local282 * 1024 + 16711935;
			}
			for (@Pc(301) int local301 = 0; local301 < 64; local301++) {
				this.anIntArray69[local301 + 192] = 16777215;
			}
			this.anIntArray66 = new int[256];
			this.anIntArray42 = new int[32768];
			this.anIntArray43 = new int[32768];
			this.method154((byte) 3, null);
			this.anIntArray63 = new int[32768];
			this.anIntArray64 = new int[32768];
			this.method74("Connecting to fileserver", 10);
			if (!this.aBoolean51) {
				this.aBoolean67 = true;
				this.aBoolean51 = true;
				this.method73(this, 2);
			}
		} catch (@Pc(358) RuntimeException local358) {
			signlink.reporterror("7580, " + true + ", " + local358.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method141() {
		try {
			if (this.aByte20 != 5) {
				this.aClass1_Sub3_Sub3_5.method373(22);
			}
			@Pc(19) int local19;
			for (@Pc(11) int local11 = -1; local11 < this.anInt149; local11++) {
				if (local11 == -1) {
					local19 = this.anInt148;
				} else {
					local19 = this.anIntArray32[local11];
				}
				@Pc(31) Class1_Sub1_Sub3_Sub2 local31 = this.aClass1_Sub1_Sub3_Sub2Array1[local19];
				if (local31 != null && local31.anInt892 > 0) {
					local31.anInt892--;
					if (local31.anInt892 == 0) {
						local31.aString29 = null;
					}
				}
			}
			for (local19 = 0; local19 < this.anInt180; local19++) {
				@Pc(62) int local62 = this.anIntArray44[local19];
				@Pc(67) Class1_Sub1_Sub3_Sub1 local67 = this.aClass1_Sub1_Sub3_Sub1Array1[local62];
				if (local67 != null && local67.anInt892 > 0) {
					local67.anInt892--;
					if (local67.anInt892 == 0) {
						local67.aString29 = null;
					}
				}
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("46410, " + 5 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method142() {
		try {
			@Pc(4) Graphics local4 = this.method72().getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 789, 532);
			this.method65();
			@Pc(41) byte local41;
			@Pc(47) int local47;
			if (this.aBoolean50) {
				this.aBoolean51 = false;
				local4.setFont(new Font("Helvetica", 1, 16));
				local4.setColor(Color.yellow);
				local41 = 35;
				local4.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
				local47 = local41 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				@Pc(56) int local56 = local47 + 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				@Pc(73) int local73 = local56 + 30;
				local4.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
				@Pc(79) int local79 = local73 + 30;
				local4.drawString("3: Try using a different game-world", 30, 195);
				@Pc(85) int local85 = local79 + 30;
				local4.drawString("4: Try rebooting your computer", 30, 225);
				@Pc(91) int local91 = local85 + 30;
				local4.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
			}
			if (this.aBoolean73) {
				this.aBoolean51 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean56) {
				this.aBoolean51 = false;
				local4.setColor(Color.yellow);
				local41 = 35;
				local4.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
				local47 = local41 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				local47 += 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				local47 += 30;
				local4.drawString("2: Try rebooting your computer, and reloading", 30, 165);
				local47 += 30;
			}
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("8418, " + 0 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!kb;IZ)V")
	private void method143(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt150; local1++) {
				@Pc(8) int local8 = this.anIntArray33[local1];
				@Pc(13) Class1_Sub1_Sub3_Sub2 local13 = this.aClass1_Sub1_Sub3_Sub2Array1[local8];
				@Pc(16) int local16 = arg0.method383();
				if ((local16 & 0x80) == 128) {
					local16 += arg0.method383() << 8;
				}
				this.method179(arg0, local16, local8, local13);
			}
			this.aBoolean72 &= arg2;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("89389, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method144() {
		try {
			for (@Pc(3) int local3 = -1; local3 < this.anInt149; local3++) {
				@Pc(11) int local11;
				if (local3 == -1) {
					local11 = this.anInt148;
				} else {
					local11 = this.anIntArray32[local3];
				}
				@Pc(23) Class1_Sub1_Sub3_Sub2 local23 = this.aClass1_Sub1_Sub3_Sub2Array1[local11];
				if (local23 != null) {
					this.method185(this.aBoolean55, local23, 1);
				}
			}
			this.aBoolean72 &= true;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("68811, " + true + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLclient!kb;)V")
	private void method145(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub3_Sub3 arg1) {
		try {
			@Pc(14) int local14;
			@Pc(23) int local23;
			@Pc(30) int local30;
			@Pc(33) int local33;
			@Pc(37) int local37;
			@Pc(41) int local41;
			@Pc(46) int local46;
			@Pc(51) int local51;
			@Pc(108) int local108;
			@Pc(110) int local110;
			@Pc(112) int local112;
			if (arg0 == 220 || arg0 == 214) {
				local14 = arg1.method383();
				local23 = this.anInt172 + (local14 >> 4 & 0x7);
				local30 = this.anInt173 + (local14 & 0x7);
				local33 = arg1.method383();
				local37 = local33 >> 2;
				local41 = local33 & 0x3;
				local46 = this.anIntArray74[local37];
				if (arg0 == 214) {
					local51 = -1;
				} else {
					local51 = arg1.method385();
				}
				if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
					@Pc(68) Class1_Sub4 local68 = null;
					for (@Pc(73) Class1_Sub4 local73 = (Class1_Sub4) this.aClass28_2.method448(); local73 != null; local73 = (Class1_Sub4) this.aClass28_2.method450(this.anInt161)) {
						if (local73.anInt579 == this.anInt337 && local73.anInt581 == local23 && local73.anInt582 == local30 && local73.anInt580 == local46) {
							local68 = local73;
							break;
						}
					}
					if (local68 == null) {
						local108 = 0;
						local110 = -1;
						local112 = 0;
						@Pc(114) int local114 = 0;
						if (local46 == 0) {
							local108 = this.aClass33_1.method486(this.anInt337, local23, local30);
						}
						if (local46 == 1) {
							local108 = this.aClass33_1.method487(local30, this.anInt337, local23);
						}
						if (local46 == 2) {
							local108 = this.aClass33_1.method488(this.anInt337, local23, local30);
						}
						if (local46 == 3) {
							local108 = this.aClass33_1.method489(this.anInt337, local23, local30);
						}
						if (local108 != 0) {
							@Pc(169) int local169 = this.aClass33_1.method490(this.anInt337, local23, local30, local108);
							local110 = local108 >> 14 & 0x7FFF;
							local112 = local169 & 0x1F;
							local114 = local169 >> 6;
						}
						local68 = new Class1_Sub4();
						local68.anInt579 = this.anInt337;
						local68.anInt580 = local46;
						local68.anInt581 = local23;
						local68.anInt582 = local30;
						local68.anInt586 = local110;
						local68.anInt588 = local112;
						local68.anInt587 = local114;
						this.aClass28_2.method445(local68);
					}
					local68.anInt583 = local51;
					local68.anInt585 = local37;
					local68.anInt584 = local41;
					this.method88(local41, local23, local30, local51, this.anInt337, local37, local46);
				}
			} else if (arg0 == 78) {
				local14 = arg1.method383();
				local23 = this.anInt172 + (local14 >> 4 & 0x7);
				local30 = this.anInt173 + (local14 & 0x7);
				local33 = arg1.method383();
				local37 = local33 >> 2;
				local41 = this.anIntArray74[local37];
				local46 = arg1.method385();
				if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
					local51 = 0;
					if (local41 == 0) {
						local51 = this.aClass33_1.method486(this.anInt337, local23, local30);
					}
					if (local41 == 1) {
						local51 = this.aClass33_1.method487(local30, this.anInt337, local23);
					}
					if (local41 == 2) {
						local51 = this.aClass33_1.method488(this.anInt337, local23, local30);
					}
					if (local41 == 3) {
						local51 = this.aClass33_1.method489(this.anInt337, local23, local30);
					}
					if (local51 != 0) {
						@Pc(348) Class1_Sub6 local348 = new Class1_Sub6(false, local51 >> 14 & 0x7FFF, (byte) 9, local23, local30, Class19.aClass19Array1[local46], this.anInt337, local41);
						this.aClass28_5.method445(local348);
					}
				}
			} else {
				@Pc(395) Class1_Sub7 local395;
				if (arg0 == 246) {
					local14 = arg1.method383();
					local23 = this.anInt172 + (local14 >> 4 & 0x7);
					local30 = this.anInt173 + (local14 & 0x7);
					local33 = arg1.method385();
					local37 = arg1.method385();
					if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
						local395 = new Class1_Sub7();
						local395.anInt760 = local33;
						local395.anInt761 = local37;
						if (this.aClass28ArrayArrayArray1[this.anInt337][local23][local30] == null) {
							this.aClass28ArrayArrayArray1[this.anInt337][local23][local30] = new Class28((byte) -47);
						}
						this.aClass28ArrayArrayArray1[this.anInt337][local23][local30].method445(local395);
						this.method149(local23, local30);
					}
				} else if (arg0 == 61) {
					local14 = arg1.method383();
					local23 = this.anInt172 + (local14 >> 4 & 0x7);
					local30 = this.anInt173 + (local14 & 0x7);
					local33 = arg1.method385();
					if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
						@Pc(485) Class28 local485 = this.aClass28ArrayArrayArray1[this.anInt337][local23][local30];
						if (local485 != null) {
							for (local395 = (Class1_Sub7) local485.method448(); local395 != null; local395 = (Class1_Sub7) local485.method450(this.anInt161)) {
								if (local395.anInt760 == (local33 & 0x7FFF)) {
									local395.method559();
									break;
								}
							}
							if (local485.method448() == null) {
								this.aClass28ArrayArrayArray1[this.anInt337][local23][local30] = null;
							}
							this.method149(local23, local30);
						}
					}
				} else {
					@Pc(573) int local573;
					@Pc(576) int local576;
					if (arg0 == 1) {
						local14 = arg1.method383();
						local23 = this.anInt172 + (local14 >> 4 & 0x7);
						local30 = this.anInt173 + (local14 & 0x7);
						local33 = local23 + arg1.method384();
						local37 = local30 + arg1.method384();
						local41 = arg1.method386();
						local46 = arg1.method385();
						local51 = arg1.method383();
						local573 = arg1.method383();
						local576 = arg1.method385();
						local108 = arg1.method385();
						local110 = arg1.method383();
						local112 = arg1.method383();
						if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104 && local33 >= 0 && local37 >= 0 && local33 < 104 && local37 < 104) {
							local23 = local23 * 128 + 64;
							local30 = local30 * 128 + 64;
							local33 = local33 * 128 + 64;
							local37 = local37 * 128 + 64;
							@Pc(660) Class1_Sub1_Sub1 local660 = new Class1_Sub1_Sub1(local110, this.anInt337, local576 + anInt332, local30, local573, local41, local112, this.aBoolean48, this.method132(local23, this.aByte19, local30, this.anInt337) - local51, local46, local23, local108 + anInt332);
							local660.method19(this.method132(local33, this.aByte19, local37, this.anInt337) - local573, local33, local37, local576 + anInt332);
							this.aClass28_4.method445(local660);
						}
					} else if (arg0 == 195) {
						local14 = arg1.method383();
						local23 = this.anInt172 + (local14 >> 4 & 0x7);
						local30 = this.anInt173 + (local14 & 0x7);
						local33 = arg1.method385();
						local37 = arg1.method383();
						local41 = arg1.method385();
						if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
							local23 = local23 * 128 + 64;
							local30 = local30 * 128 + 64;
							@Pc(758) Class1_Sub1_Sub2 local758 = new Class1_Sub1_Sub2(5, local30, this.anInt337, this.method132(local23, this.aByte19, local30, this.anInt337) - local37, local33, local23, local41, anInt332);
							this.aClass28_1.method445(local758);
						}
					} else if (arg0 == 127) {
						local14 = arg1.method383();
						local23 = this.anInt172 + (local14 >> 4 & 0x7);
						local30 = this.anInt173 + (local14 & 0x7);
						local33 = arg1.method385();
						local37 = arg1.method385();
						local41 = arg1.method385();
						if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104 && local41 != this.anInt178) {
							@Pc(812) Class1_Sub7 local812 = new Class1_Sub7();
							local812.anInt760 = local33;
							local812.anInt761 = local37;
							if (this.aClass28ArrayArrayArray1[this.anInt337][local23][local30] == null) {
								this.aClass28ArrayArrayArray1[this.anInt337][local23][local30] = new Class28((byte) -47);
							}
							this.aClass28ArrayArrayArray1[this.anInt337][local23][local30].method445(local812);
							this.method149(local23, local30);
						}
					} else {
						if (arg0 == 25) {
							local14 = arg1.method383();
							local23 = this.anInt172 + (local14 >> 4 & 0x7);
							local30 = this.anInt173 + (local14 & 0x7);
							local33 = arg1.method383();
							local37 = local33 >> 2;
							local41 = local33 & 0x3;
							local46 = this.anIntArray74[local37];
							local51 = arg1.method385();
							local573 = arg1.method385();
							local576 = arg1.method385();
							local108 = arg1.method385();
							@Pc(910) byte local910 = arg1.method384();
							@Pc(913) byte local913 = arg1.method384();
							@Pc(916) byte local916 = arg1.method384();
							@Pc(919) byte local919 = arg1.method384();
							@Pc(926) Class1_Sub1_Sub3_Sub2 local926;
							if (local108 == this.anInt178) {
								local926 = this.aClass1_Sub1_Sub3_Sub2_1;
							} else {
								local926 = this.aClass1_Sub1_Sub3_Sub2Array1[local108];
							}
							if (local926 != null) {
								@Pc(951) Class1_Sub5 local951 = new Class1_Sub5(local573 + anInt332, local41, (byte) 9, local37, local23, local46, -1, local30, this.anInt337);
								this.aClass28_3.method445(local951);
								@Pc(971) Class1_Sub5 local971 = new Class1_Sub5(local576 + anInt332, local41, (byte) 9, local37, local23, local46, local51, local30, this.anInt337);
								this.aClass28_3.method445(local971);
								@Pc(985) int local985 = this.anIntArrayArrayArray3[this.anInt337][local23][local30];
								@Pc(997) int local997 = this.anIntArrayArrayArray3[this.anInt337][local23 + 1][local30];
								@Pc(1011) int local1011 = this.anIntArrayArrayArray3[this.anInt337][local23 + 1][local30 + 1];
								@Pc(1023) int local1023 = this.anIntArrayArrayArray3[this.anInt337][local23][local30 + 1];
								@Pc(1026) Class2 local1026 = Class2.method23(local51);
								local926.anInt935 = local573 + anInt332;
								local926.anInt936 = local576 + anInt332;
								local926.aClass1_Sub3_Sub1_11 = local1026.method26(local37, local41, local985, local997, local1011, local1023, -1);
								@Pc(1050) int local1050 = local1026.anInt39;
								@Pc(1053) int local1053 = local1026.anInt40;
								if (local41 == 1 || local41 == 3) {
									local1050 = local1026.anInt40;
									local1053 = local1026.anInt39;
								}
								local926.anInt937 = local23 * 128 + local1050 * 64;
								local926.anInt939 = local30 * 128 + local1053 * 64;
								local926.anInt938 = this.method132(local926.anInt937, this.aByte19, local926.anInt939, this.anInt337);
								@Pc(1100) byte local1100;
								if (local910 > local916) {
									local1100 = local910;
									local910 = local916;
									local916 = local1100;
								}
								if (local913 > local919) {
									local1100 = local913;
									local913 = local919;
									local919 = local1100;
								}
								local926.anInt940 = local23 + local910;
								local926.anInt942 = local23 + local916;
								local926.anInt941 = local30 + local913;
								local926.anInt943 = local30 + local919;
							}
						}
						if (arg0 == 117) {
							local14 = arg1.method383();
							local23 = this.anInt172 + (local14 >> 4 & 0x7);
							local30 = this.anInt173 + (local14 & 0x7);
							local33 = arg1.method385();
							local37 = arg1.method385();
							local41 = arg1.method385();
							if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
								@Pc(1184) Class28 local1184 = this.aClass28ArrayArrayArray1[this.anInt337][local23][local30];
								if (local1184 != null) {
									for (@Pc(1190) Class1_Sub7 local1190 = (Class1_Sub7) local1184.method448(); local1190 != null; local1190 = (Class1_Sub7) local1184.method450(this.anInt161)) {
										if (local1190.anInt760 == (local33 & 0x7FFF) && local1190.anInt761 == local37) {
											local1190.anInt761 = local41;
											break;
										}
									}
									this.method149(local23, local30);
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1221) RuntimeException local1221) {
			signlink.reporterror("78279, " + arg0 + ", " + true + ", " + arg1 + ", " + local1221.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!hc;IIII)V")
	private void method146(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg0.anInt461 == 0 && arg0.anIntArray153 != null && (!arg0.aBoolean113 || this.anInt264 == arg0.anInt459 || this.anInt138 == arg0.anInt459 || this.anInt286 == arg0.anInt459)) {
				@Pc(29) int local29 = Class1_Sub3_Sub2.anInt520;
				@Pc(31) int local31 = Class1_Sub3_Sub2.anInt518;
				@Pc(33) int local33 = Class1_Sub3_Sub2.anInt521;
				@Pc(35) int local35 = Class1_Sub3_Sub2.anInt519;
				Class1_Sub3_Sub2.method352(arg3, arg1, arg3 + arg0.anInt464, arg1 + arg0.anInt465);
				@Pc(51) int local51 = arg0.anIntArray153.length;
				this.anInt207 += 0;
				for (@Pc(59) int local59 = 0; local59 < local51; local59++) {
					@Pc(68) int local68 = arg0.anIntArray154[local59] + arg3;
					@Pc(77) int local77 = arg0.anIntArray155[local59] + arg1 - arg2;
					@Pc(84) Class15 local84 = Class15.aClass15Array1[arg0.anIntArray153[local59]];
					@Pc(89) int local89 = local68 + local84.anInt466;
					@Pc(94) int local94 = local77 + local84.anInt467;
					if (local84.anInt463 > 0) {
						this.method111(local84);
					}
					if (local84.anInt461 == 0) {
						if (local84.anInt470 > local84.anInt469 - local84.anInt465) {
							local84.anInt470 = local84.anInt469 - local84.anInt465;
						}
						if (local84.anInt470 < 0) {
							local84.anInt470 = 0;
						}
						this.method146(local84, local94, local84.anInt470, local89);
						if (local84.anInt469 > local84.anInt465) {
							this.method104(local84.anInt469, local84.anInt465, local84.anInt470, local94, local89 + local84.anInt464);
						}
					} else if (local84.anInt461 != 1) {
						@Pc(166) int local166;
						@Pc(170) int local170;
						@Pc(181) int local181;
						@Pc(216) int local216;
						@Pc(223) int local223;
						@Pc(164) int local164;
						@Pc(190) int local190;
						@Pc(214) int local214;
						if (local84.anInt461 == 2) {
							local164 = 0;
							for (local166 = 0; local166 < local84.anInt465; local166++) {
								for (local170 = 0; local170 < local84.anInt464; local170++) {
									local181 = local89 + local170 * (local84.anInt472 + 32);
									local190 = local94 + local166 * (local84.anInt473 + 32);
									if (local164 < 20) {
										local181 += local84.anIntArray156[local164];
										local190 += local84.anIntArray157[local164];
									}
									if (local84.anIntArray149[local164] > 0) {
										local214 = 0;
										local216 = 0;
										local223 = local84.anIntArray149[local164] - 1;
										@Pc(231) Class1_Sub3_Sub2_Sub2 local231 = Class5.method59(local84.anIntArray150[local164], local223);
										if (this.anInt272 != 0 && this.anInt271 == local164 && this.anInt270 == local84.anInt459) {
											local214 = super.anInt125 - this.anInt273;
											local216 = super.anInt126 - this.anInt274;
											if (local214 < 5 && local214 > -5) {
												local214 = 0;
											}
											if (local216 < 5 && local216 > -5) {
												local216 = 0;
											}
											if (this.anInt247 < 5) {
												local214 = 0;
												local216 = 0;
											}
											local231.method323(local181 + local214, local190 + local216);
										} else if (this.anInt258 != 0 && this.anInt257 == local164 && this.anInt256 == local84.anInt459) {
											local231.method323(local181, local190);
										} else {
											local231.method319(local190, local181);
										}
										if (local231.anInt455 == 33 || local84.anIntArray150[local164] != 1) {
											@Pc(331) int local331 = local84.anIntArray150[local164];
											this.aClass1_Sub3_Sub2_Sub4_1.method361(476, local190 + local216 + 10, method151(this.anInt200, local331), local181 + local214 + 1, 0);
											this.aClass1_Sub3_Sub2_Sub4_1.method361(476, local190 + local216 + 9, method151(this.anInt200, local331), local181 + local214, 16776960);
										}
									} else if (local84.aClass1_Sub3_Sub2_Sub2Array8 != null && local164 < 20) {
										@Pc(380) Class1_Sub3_Sub2_Sub2 local380 = local84.aClass1_Sub3_Sub2_Sub2Array8[local164];
										if (local380 != null) {
											local380.method319(local190, local181);
										}
									}
									local164++;
								}
							}
						} else if (local84.anInt461 != 3) {
							@Pc(438) Class1_Sub3_Sub2_Sub4 local438;
							if (local84.anInt461 == 4) {
								local438 = local84.aClass1_Sub3_Sub2_Sub4_5;
								local166 = local84.anInt474;
								@Pc(444) String local444 = local84.aString20;
								if ((this.anInt286 == local84.anInt459 || this.anInt138 == local84.anInt459 || this.anInt264 == local84.anInt459) && local84.anInt476 != 0) {
									local166 = local84.anInt476;
								}
								if (this.method116(local84, this.anInt260)) {
									local166 = local84.anInt475;
									if (local84.aString21.length() > 0) {
										local444 = local84.aString21;
									}
								}
								if (local84.anInt462 == 6 && this.aBoolean62) {
									local444 = "Please wait...";
									local166 = local84.anInt474;
								}
								local190 = local94 + local438.anInt528;
								while (local444.length() > 0) {
									if (local444.indexOf("%") != -1) {
										label244: while (true) {
											local214 = local444.indexOf("%1");
											if (local214 == -1) {
												while (true) {
													local214 = local444.indexOf("%2");
													if (local214 == -1) {
														while (true) {
															local214 = local444.indexOf("%3");
															if (local214 == -1) {
																while (true) {
																	local214 = local444.indexOf("%4");
																	if (local214 == -1) {
																		while (true) {
																			local214 = local444.indexOf("%5");
																			if (local214 == -1) {
																				break label244;
																			}
																			local444 = local444.substring(0, local214) + this.method197(this.method148(4, local84, this.anInt163)) + local444.substring(local214 + 2);
																		}
																	}
																	local444 = local444.substring(0, local214) + this.method197(this.method148(3, local84, this.anInt163)) + local444.substring(local214 + 2);
																}
															}
															local444 = local444.substring(0, local214) + this.method197(this.method148(2, local84, this.anInt163)) + local444.substring(local214 + 2);
														}
													}
													local444 = local444.substring(0, local214) + this.method197(this.method148(1, local84, this.anInt163)) + local444.substring(local214 + 2);
												}
											}
											local444 = local444.substring(0, local214) + this.method197(this.method148(0, local84, this.anInt163)) + local444.substring(local214 + 2);
										}
									}
									local214 = local444.indexOf("\\n");
									@Pc(692) String local692;
									if (local214 == -1) {
										local692 = local444;
										local444 = "";
									} else {
										local692 = local444.substring(0, local214);
										local444 = local444.substring(local214 + 2);
									}
									if (local84.aBoolean119) {
										local438.method359(local692, local190, local166, local84.aBoolean120, local89 + local84.anInt464 / 2);
									} else {
										local438.method363(local692, local166, local89, local84.aBoolean120, local190);
									}
									local190 += local438.anInt528;
								}
							} else if (local84.anInt461 == 5) {
								@Pc(755) Class1_Sub3_Sub2_Sub2 local755;
								if (this.method116(local84, this.anInt260)) {
									local755 = local84.aClass1_Sub3_Sub2_Sub2_13;
								} else {
									local755 = local84.aClass1_Sub3_Sub2_Sub2_12;
								}
								if (local755 != null) {
									local755.method319(local94, local89);
								}
							} else if (local84.anInt461 == 6) {
								local164 = Class1_Sub3_Sub2_Sub1.anInt422;
								local166 = Class1_Sub3_Sub2_Sub1.anInt423;
								Class1_Sub3_Sub2_Sub1.anInt422 = local89 + local84.anInt464 / 2;
								Class1_Sub3_Sub2_Sub1.anInt423 = local94 + local84.anInt465 / 2;
								local170 = Class1_Sub3_Sub2_Sub1.anIntArray137[local84.anInt480] * local84.anInt479 >> 16;
								local181 = Class1_Sub3_Sub2_Sub1.anIntArray138[local84.anInt480] * local84.anInt479 >> 16;
								@Pc(817) boolean local817 = this.method116(local84, this.anInt260);
								if (local817) {
									local214 = local84.anInt478;
								} else {
									local214 = local84.anInt477;
								}
								@Pc(836) Class1_Sub3_Sub1 local836;
								if (local214 == -1) {
									local836 = local84.method329(-1, -1, local817);
								} else {
									@Pc(842) Class19 local842 = Class19.aClass19Array1[local214];
									local836 = local84.method329(local842.anIntArray186[local84.anInt457], local842.anIntArray187[local84.anInt457], local817);
								}
								if (local836 != null) {
									local836.method242(local84.anInt481, 0, local84.anInt480, 0, local170, local181);
								}
								Class1_Sub3_Sub2_Sub1.anInt422 = local164;
								Class1_Sub3_Sub2_Sub1.anInt423 = local166;
							} else if (local84.anInt461 == 7) {
								local438 = local84.aClass1_Sub3_Sub2_Sub4_5;
								local166 = 0;
								for (local170 = 0; local170 < local84.anInt465; local170++) {
									for (local181 = 0; local181 < local84.anInt464; local181++) {
										if (local84.anIntArray149[local166] > 0) {
											@Pc(905) Class5 local905 = Class5.method54(local84.anIntArray149[local166] - 1);
											@Pc(908) String local908 = local905.aString3;
											if (local905.aBoolean36 || local84.anIntArray150[local166] != 1) {
												local908 = local908 + " x" + method134(local84.anIntArray150[local166], 929);
											}
											local216 = local89 + local181 * (local84.anInt472 + 115);
											local223 = local94 + local170 * (local84.anInt473 + 12);
											if (local84.aBoolean119) {
												local438.method359(local908, local223, local84.anInt474, local84.aBoolean120, local216 + local84.anInt464 / 2);
											} else {
												local438.method363(local908, local84.anInt474, local216, local84.aBoolean120, local223);
											}
										}
										local166++;
									}
								}
							}
						} else if (local84.aBoolean118) {
							Class1_Sub3_Sub2.method354(local89, local84.anInt464, local84.anInt474, local94, local84.anInt465);
						} else {
							Class1_Sub3_Sub2.method355(local84.anInt464, local84.anInt474, local89, local94, local84.anInt465);
						}
					}
				}
				Class1_Sub3_Sub2.method352(local29, local31, local33, local35);
			}
		} catch (@Pc(1004) RuntimeException local1004) {
			signlink.reporterror("71857, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + local1004.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method147() {
		try {
			if (this.aClass32_19 == null) {
				this.method77((byte) 9);
				super.aClass32_2 = null;
				this.aClass32_20 = null;
				this.aClass32_21 = null;
				this.aClass32_22 = null;
				this.aClass32_23 = null;
				this.aClass32_24 = null;
				this.aClass32_25 = null;
				this.aClass32_26 = null;
				this.aClass32_27 = null;
				this.aClass32_28 = null;
				this.aClass32_19 = new Class32(479, this.method72(), 96, 947);
				this.aClass32_17 = new Class32(168, this.method72(), 160, 947);
				Class1_Sub3_Sub2.method353();
				this.aClass1_Sub3_Sub2_Sub3_14.method346(0, 0);
				this.aClass32_16 = new Class32(190, this.method72(), 261, 947);
				this.aClass32_18 = new Class32(512, this.method72(), 334, 947);
				Class1_Sub3_Sub2.method353();
				this.aClass32_13 = new Class32(501, this.method72(), 61, 947);
				this.aClass32_14 = new Class32(288, this.method72(), 40, 947);
				this.aClass32_15 = new Class32(269, this.method72(), 66, 947);
				this.aBoolean71 = true;
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("72819, " + false + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!hc;I)I")
	private int method148(@OriginalArg(0) int arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 != this.anInt259) {
				this.anInt224 = -446;
			}
			if (arg1.anIntArrayArray15 == null || arg0 >= arg1.anIntArrayArray15.length) {
				return -2;
			}
			try {
				@Pc(23) int[] local23 = arg1.anIntArrayArray15[arg0];
				@Pc(25) int local25 = 0;
				@Pc(27) int local27 = 0;
				while (true) {
					@Pc(32) int local32 = local23[local27++];
					if (local32 == 0) {
						return local25;
					}
					if (local32 == 1) {
						local25 += this.anIntArray71[local23[local27++]];
					}
					if (local32 == 2) {
						local25 += this.anIntArray76[local23[local27++]];
					}
					if (local32 == 3) {
						local25 += this.anIntArray40[local23[local27++]];
					}
					@Pc(85) Class15 local85;
					@Pc(92) int local92;
					@Pc(94) int local94;
					if (local32 == 4) {
						local85 = Class15.aClass15Array1[local23[local27++]];
						local92 = local23[local27++] + 1;
						for (local94 = 0; local94 < local85.anIntArray149.length; local94++) {
							if (local85.anIntArray149[local94] == local92) {
								local25 += local85.anIntArray150[local94];
							}
						}
					}
					if (local32 == 5) {
						local25 += this.anIntArray41[local23[local27++]];
					}
					if (local32 == 6) {
						local25 += anIntArray82[this.anIntArray76[local23[local27++]] - 1];
					}
					if (local32 == 7) {
						local25 += this.anIntArray41[local23[local27++]] * 100 / 46875;
					}
					if (local32 == 8) {
						local25 += this.aClass1_Sub1_Sub3_Sub2_1.anInt933;
					}
					@Pc(176) int local176;
					if (local32 == 9) {
						for (local176 = 0; local176 < 19; local176++) {
							if (local176 == 18) {
								local176 = 20;
							}
							local25 += this.anIntArray76[local176];
						}
					}
					if (local32 == 10) {
						local85 = Class15.aClass15Array1[local23[local27++]];
						local92 = local23[local27++] + 1;
						for (local94 = 0; local94 < local85.anIntArray149.length; local94++) {
							if (local85.anIntArray149[local94] == local92) {
								local25 += 999999999;
								break;
							}
						}
					}
					if (local32 == 11) {
						local25 += this.anInt265;
					}
					if (local32 == 12) {
						local25 += this.anInt165;
					}
					if (local32 == 13) {
						local176 = this.anIntArray41[local23[local27++]];
						local92 = local23[local27++];
						local25 += (local176 & 0x1 << local92) == 0 ? 0 : 1;
					}
				}
			} catch (@Pc(279) Exception local279) {
				return -1;
			}
		} catch (@Pc(282) RuntimeException local282) {
			signlink.reporterror("30090, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local282.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt251 = Integer.parseInt(this.getParameter("nodeid"));
		anInt252 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method105(anInt141);
		} else {
			method169();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean59 = false;
		} else {
			aBoolean59 = true;
		}
		this.method63();
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean67) {
			this.method162(anInt229);
		} else if (this.aBoolean57) {
			this.method99();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method71() {
		try {
			this.aBoolean71 = true;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("6175, " + false + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class28 local9 = this.aClass28ArrayArrayArray1[this.anInt337][arg0][arg1];
		if (local9 == null) {
			this.aClass33_1.method485(this.anInt337, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub7 local23 = null;
		@Pc(27) Class1_Sub7 local27;
		@Pc(35) int local35;
		for (local27 = (Class1_Sub7) local9.method448(); local27 != null; local27 = (Class1_Sub7) local9.method450(this.anInt161)) {
			@Pc(32) Class5 local32 = Class5.method54(local27.anInt760);
			local35 = local32.anInt105;
			if (local32.aBoolean36) {
				local35 *= local27.anInt761 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method446(local23);
		@Pc(66) int local66 = -1;
		local35 = -1;
		@Pc(70) int local70 = 0;
		@Pc(72) int local72 = 0;
		for (local27 = (Class1_Sub7) local9.method448(); local27 != null; local27 = (Class1_Sub7) local9.method450(this.anInt161)) {
			if (local27.anInt760 != local23.anInt760 && local66 == -1) {
				local66 = local27.anInt760;
				local70 = local27.anInt761;
			}
			if (local27.anInt760 != local23.anInt760 && local27.anInt760 != local66 && local35 == -1) {
				local35 = local27.anInt760;
				local72 = local27.anInt761;
			}
		}
		@Pc(120) Class1_Sub3_Sub1 local120 = null;
		if (local66 != -1) {
			local120 = Class5.method54(local66).method58(local70);
		}
		@Pc(130) Class1_Sub3_Sub1 local130 = null;
		if (local35 != -1) {
			local130 = Class5.method54(local35).method58(local72);
		}
		@Pc(146) int local146 = arg0 + (arg1 << 7) + 1610612736;
		@Pc(150) Class5 local150 = Class5.method54(local23.anInt760);
		this.aClass33_1.method466(local120, this.method132(arg0 * 128 + 64, this.aByte19, arg1 * 128 + 64, this.anInt337), local130, this.anInt337, arg1, arg0, local150.method58(local23.anInt761), local146);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BLclient!kb;I)V")
	private void method150(@OriginalArg(1) Class1_Sub3_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(13) int local13 = 0; local13 < this.anInt150; local13++) {
				@Pc(20) int local20 = this.anIntArray33[local13];
				@Pc(25) Class1_Sub1_Sub3_Sub1 local25 = this.aClass1_Sub1_Sub3_Sub1Array1[local20];
				@Pc(28) int local28 = arg0.method383();
				@Pc(36) int local36;
				if ((local28 & 0x2) == 2) {
					local36 = arg0.method385();
					if (local36 == 65535) {
						local36 = -1;
					}
					if (local36 == local25.anInt906) {
						local25.anInt910 = 0;
					}
					@Pc(51) int local51 = arg0.method383();
					if (local36 == -1 || local25.anInt906 == -1 || Class19.aClass19Array1[local36].anInt532 > Class19.aClass19Array1[local25.anInt906].anInt532 || Class19.aClass19Array1[local25.anInt906].anInt532 == 0) {
						local25.anInt906 = local36;
						local25.anInt907 = 0;
						local25.anInt908 = 0;
						local25.anInt909 = local51;
						local25.anInt910 = 0;
					}
				}
				if ((local28 & 0x4) == 4) {
					local25.anInt900 = arg0.method385();
					if (local25.anInt900 == 65535) {
						local25.anInt900 = -1;
					}
				}
				if ((local28 & 0x8) == 8) {
					local25.aString29 = arg0.method390();
					local25.anInt892 = 100;
				}
				if ((local28 & 0x10) == 16) {
					local25.anInt895 = arg0.method383();
					local25.anInt896 = arg0.method383();
					local25.anInt897 = anInt332 + 400;
					local25.anInt898 = arg0.method383();
					local25.anInt899 = arg0.method383();
				}
				if ((local28 & 0x20) == 32) {
					local25.aClass3_1 = Class3.method32(arg0.method385());
					local25.anInt887 = local25.aClass3_1.anInt64;
					local25.anInt888 = local25.aClass3_1.anInt65;
					local25.anInt889 = local25.aClass3_1.anInt66;
					local25.anInt890 = local25.aClass3_1.anInt67;
					local25.anInt885 = local25.aClass3_1.anInt63;
				}
				if ((local28 & 0x40) == 64) {
					local25.anInt911 = arg0.method385();
					local36 = arg0.method388();
					local25.anInt915 = local36 >> 16;
					local25.anInt914 = anInt332 + (local36 & 0xFFFF);
					local25.anInt912 = 0;
					local25.anInt913 = 0;
					if (local25.anInt914 > anInt332) {
						local25.anInt912 = -1;
					}
					if (local25.anInt911 == 65535) {
						local25.anInt911 = -1;
					}
				}
				if ((local28 & 0x80) == 128) {
					local25.anInt901 = arg0.method385();
					local25.anInt902 = arg0.method385();
				}
			}
		} catch (@Pc(242) RuntimeException local242) {
			signlink.reporterror("40311, " + 95 + ", " + arg0 + ", " + arg1 + ", " + local242.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILclient!z;)V")
	private void method152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub3_Sub2 arg4) {
		try {
			if (arg4 != this.aClass1_Sub1_Sub3_Sub2_1 && this.anInt153 < 400) {
				@Pc(34) String local34 = arg4.aString30 + method130(arg4.anInt933, this.aClass1_Sub1_Sub3_Sub2_1.anInt933) + " (level-" + arg4.anInt933 + ")";
				@Pc(38) boolean local38 = false;
				if (this.anInt193 == 1) {
					this.aStringArray9[this.anInt153] = "Use " + this.aString5 + " with @whi@" + local34;
					this.anIntArray60[this.anInt153] = 103;
					this.anIntArray61[this.anInt153] = arg2;
					this.anIntArray58[this.anInt153] = arg0;
					this.anIntArray59[this.anInt153] = arg3;
					this.anInt153++;
				} else if (this.anInt319 != 1) {
					this.aStringArray9[this.anInt153] = "Follow @whi@" + local34;
					this.anIntArray60[this.anInt153] = 1741;
					this.anIntArray61[this.anInt153] = arg2;
					this.anIntArray58[this.anInt153] = arg0;
					this.anIntArray59[this.anInt153] = arg3;
					this.anInt153++;
					if (this.anInt334 == 0) {
						this.aStringArray9[this.anInt153] = "Trade with @whi@" + local34;
						this.anIntArray60[this.anInt153] = 1528;
						this.anIntArray61[this.anInt153] = arg2;
						this.anIntArray58[this.anInt153] = arg0;
						this.anIntArray59[this.anInt153] = arg3;
						this.anInt153++;
					}
					if (this.anInt231 > 0) {
						this.aStringArray9[this.anInt153] = "Attack @whi@" + local34;
						if (this.aClass1_Sub1_Sub3_Sub2_1.anInt933 >= arg4.anInt933) {
							this.anIntArray60[this.anInt153] = 593;
						} else {
							this.anIntArray60[this.anInt153] = 2593;
						}
						this.anIntArray61[this.anInt153] = arg2;
						this.anIntArray58[this.anInt153] = arg0;
						this.anIntArray59[this.anInt153] = arg3;
						this.anInt153++;
					}
					if (this.anInt223 == 1) {
						this.aStringArray9[this.anInt153] = "Fight @whi@" + local34;
						this.anIntArray60[this.anInt153] = 593;
						this.anIntArray61[this.anInt153] = arg2;
						this.anIntArray58[this.anInt153] = arg0;
						this.anIntArray59[this.anInt153] = arg3;
						this.anInt153++;
					}
					if (this.anInt223 == 2) {
						this.aStringArray9[this.anInt153] = "Duel-with @whi@" + local34;
						this.anIntArray60[this.anInt153] = 1596;
						this.anIntArray61[this.anInt153] = arg2;
						this.anIntArray58[this.anInt153] = arg0;
						this.anIntArray59[this.anInt153] = arg3;
						this.anInt153++;
					}
				} else if ((this.anInt321 & 0x8) == 8) {
					this.aStringArray9[this.anInt153] = this.aString15 + " @whi@" + local34;
					this.anIntArray60[this.anInt153] = 48;
					this.anIntArray61[this.anInt153] = arg2;
					this.anIntArray58[this.anInt153] = arg0;
					this.anIntArray59[this.anInt153] = arg3;
					this.anInt153++;
				}
				for (@Pc(389) int local389 = 0; local389 < this.anInt153; local389++) {
					if (this.anIntArray60[local389] == 981) {
						this.aStringArray9[local389] = "Walk here @whi@" + local34;
						return;
					}
				}
			}
		} catch (@Pc(416) RuntimeException local416) {
			signlink.reporterror("82903, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local416.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method153() {
		try {
			@Pc(6) int local6 = this.anInt236 * 128 + 64;
			@Pc(13) int local13 = this.anInt237 * 128 + 64;
			@Pc(27) int local27 = this.method132(this.anInt236, this.aByte19, this.anInt237, this.anInt337) - this.anInt238;
			if (this.anInt242 < local6) {
				this.anInt242 += this.anInt239 + (local6 - this.anInt242) * this.anInt240 / 1000;
				if (this.anInt242 > local6) {
					this.anInt242 = local6;
				}
			}
			if (this.anInt242 > local6) {
				this.anInt242 -= this.anInt239 + (this.anInt242 - local6) * this.anInt240 / 1000;
				if (this.anInt242 < local6) {
					this.anInt242 = local6;
				}
			}
			if (this.anInt243 < local27) {
				this.anInt243 += this.anInt239 + (local27 - this.anInt243) * this.anInt240 / 1000;
				if (this.anInt243 > local27) {
					this.anInt243 = local27;
				}
			}
			if (this.anInt243 > local27) {
				this.anInt243 -= this.anInt239 + (this.anInt243 - local27) * this.anInt240 / 1000;
				if (this.anInt243 < local27) {
					this.anInt243 = local27;
				}
			}
			if (this.anInt244 < local13) {
				this.anInt244 += this.anInt239 + (local13 - this.anInt244) * this.anInt240 / 1000;
				if (this.anInt244 > local13) {
					this.anInt244 = local13;
				}
			}
			if (this.anInt244 > local13) {
				this.anInt244 -= this.anInt239 + (this.anInt244 - local13) * this.anInt240 / 1000;
				if (this.anInt244 < local13) {
					this.anInt244 = local13;
				}
			}
			local6 = this.anInt303 * 128 + 64;
			local13 = this.anInt304 * 128 + 64;
			local27 = this.method132(this.anInt303, this.aByte19, this.anInt304, this.anInt337) - this.anInt305;
			@Pc(228) int local228 = local6 - this.anInt242;
			@Pc(233) int local233 = local27 - this.anInt243;
			@Pc(238) int local238 = local13 - this.anInt244;
			@Pc(255) int local255 = (int) Math.sqrt((double) (local228 * local228 + local238 * local238));
			@Pc(266) int local266 = (int) (Math.atan2((double) local233, (double) local255) * 325.949D) & 0x7FF;
			@Pc(277) int local277 = (int) (Math.atan2((double) local228, (double) local238) * -325.949D) & 0x7FF;
			if (local266 < 128) {
				local266 = 128;
			}
			if (local266 > 383) {
				local266 = 383;
			}
			if (this.anInt245 < local266) {
				this.anInt245 += this.anInt306 + (local266 - this.anInt245) * this.anInt307 / 1000;
				if (this.anInt245 > local266) {
					this.anInt245 = local266;
				}
			}
			if (this.anInt245 > local266) {
				this.anInt245 -= this.anInt306 + (this.anInt245 - local266) * this.anInt307 / 1000;
				if (this.anInt245 < local266) {
					this.anInt245 = local266;
				}
			}
			@Pc(348) int local348 = local277 - this.anInt246;
			if (local348 > 1024) {
				local348 -= 2048;
			}
			if (local348 < -1024) {
				local348 += 2048;
			}
			if (local348 > 0) {
				this.anInt246 += this.anInt306 + local348 * this.anInt307 / 1000;
				this.anInt246 &= 0x7FF;
			}
			if (local348 < 0) {
				this.anInt246 -= this.anInt306 + -local348 * this.anInt307 / 1000;
				this.anInt246 &= 0x7FF;
			}
			@Pc(406) int local406 = local277 - this.anInt246;
			if (local406 > 1024) {
				local406 -= 2048;
			}
			if (local406 < -1024) {
				local406 += 2048;
			}
			if (local406 < 0 && local348 > 0 || local406 > 0 && local348 < 0) {
				this.anInt246 = local277;
			}
		} catch (@Pc(427) RuntimeException local427) {
			signlink.reporterror("71529, " + 15537 + ", " + local427.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!ib;)V")
	private void method154(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub3_Sub2_Sub3 arg1) {
		try {
			@Pc(6) boolean local6 = false;
			for (@Pc(17) int local17 = 0; local17 < this.anIntArray42.length; local17++) {
				this.anIntArray42[local17] = 0;
			}
			@Pc(42) int local42;
			for (@Pc(32) int local32 = 0; local32 < 5000; local32++) {
				local42 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray42[local42] = (int) (Math.random() * 256.0D);
			}
			@Pc(60) int local60;
			@Pc(64) int local64;
			@Pc(72) int local72;
			for (local42 = 0; local42 < 20; local42++) {
				for (local60 = 1; local60 < 255; local60++) {
					for (local64 = 1; local64 < 127; local64++) {
						local72 = local64 + (local60 << 7);
						this.anIntArray43[local72] = (this.anIntArray42[local72 - 1] + this.anIntArray42[local72 + 1] + this.anIntArray42[local72 - 128] + this.anIntArray42[local72 + 128]) / 4;
					}
				}
				@Pc(118) int[] local118 = this.anIntArray42;
				this.anIntArray42 = this.anIntArray43;
				this.anIntArray43 = local118;
			}
			if (arg1 != null) {
				local60 = 0;
				for (local64 = 0; local64 < arg1.anInt503; local64++) {
					for (local72 = 0; local72 < arg1.anInt502; local72++) {
						if (arg1.aByteArray6[local60++] != 0) {
							@Pc(154) int local154 = local72 + arg1.anInt504 + 16;
							@Pc(161) int local161 = local64 + arg1.anInt505 + 16;
							@Pc(167) int local167 = local154 + (local161 << 7);
							this.anIntArray42[local167] = 0;
						}
					}
				}
			}
		} catch (@Pc(184) RuntimeException local184) {
			signlink.reporterror("88030, " + arg0 + ", " + arg1 + ", " + local184.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method155() {
		try {
			this.anInt207 += 0;
			if (super.anInt127 == 1) {
				if (super.anInt128 >= 549 && super.anInt128 <= 583 && super.anInt129 >= 195 && super.anInt129 < 231 && this.anIntArray57[0] != -1) {
					this.aBoolean44 = true;
					this.anInt197 = 0;
					this.aBoolean42 = true;
				}
				if (super.anInt128 >= 579 && super.anInt128 <= 609 && super.anInt129 >= 194 && super.anInt129 < 231 && this.anIntArray57[1] != -1) {
					this.aBoolean44 = true;
					this.anInt197 = 1;
					this.aBoolean42 = true;
				}
				if (super.anInt128 >= 607 && super.anInt128 <= 637 && super.anInt129 >= 194 && super.anInt129 < 231 && this.anIntArray57[2] != -1) {
					this.aBoolean44 = true;
					this.anInt197 = 2;
					this.aBoolean42 = true;
				}
				if (super.anInt128 >= 635 && super.anInt128 <= 679 && super.anInt129 >= 194 && super.anInt129 < 229 && this.anIntArray57[3] != -1) {
					this.aBoolean44 = true;
					this.anInt197 = 3;
					this.aBoolean42 = true;
				}
				if (super.anInt128 >= 676 && super.anInt128 <= 706 && super.anInt129 >= 194 && super.anInt129 < 231 && this.anIntArray57[4] != -1) {
					this.aBoolean44 = true;
					this.anInt197 = 4;
					this.aBoolean42 = true;
				}
				if (super.anInt128 >= 704 && super.anInt128 <= 734 && super.anInt129 >= 194 && super.anInt129 < 231 && this.anIntArray57[5] != -1) {
					this.aBoolean44 = true;
					this.anInt197 = 5;
					this.aBoolean42 = true;
				}
				if (super.anInt128 >= 732 && super.anInt128 <= 766 && super.anInt129 >= 195 && super.anInt129 < 231 && this.anIntArray57[6] != -1) {
					this.aBoolean44 = true;
					this.anInt197 = 6;
					this.aBoolean42 = true;
				}
				if (super.anInt128 >= 550 && super.anInt128 <= 584 && super.anInt129 >= 492 && super.anInt129 < 528 && this.anIntArray57[7] != -1) {
					this.aBoolean44 = true;
					this.anInt197 = 7;
					this.aBoolean42 = true;
				}
				if (super.anInt128 >= 582 && super.anInt128 <= 612 && super.anInt129 >= 492 && super.anInt129 < 529 && this.anIntArray57[8] != -1) {
					this.aBoolean44 = true;
					this.anInt197 = 8;
					this.aBoolean42 = true;
				}
				if (super.anInt128 >= 609 && super.anInt128 <= 639 && super.anInt129 >= 492 && super.anInt129 < 529 && this.anIntArray57[9] != -1) {
					this.aBoolean44 = true;
					this.anInt197 = 9;
					this.aBoolean42 = true;
				}
				if (super.anInt128 >= 637 && super.anInt128 <= 681 && super.anInt129 >= 493 && super.anInt129 < 528 && this.anIntArray57[10] != -1) {
					this.aBoolean44 = true;
					this.anInt197 = 10;
					this.aBoolean42 = true;
				}
				if (super.anInt128 >= 679 && super.anInt128 <= 709 && super.anInt129 >= 492 && super.anInt129 < 529 && this.anIntArray57[11] != -1) {
					this.aBoolean44 = true;
					this.anInt197 = 11;
					this.aBoolean42 = true;
				}
				if (super.anInt128 >= 706 && super.anInt128 <= 736 && super.anInt129 >= 492 && super.anInt129 < 529 && this.anIntArray57[12] != -1) {
					this.aBoolean44 = true;
					this.anInt197 = 12;
					this.aBoolean42 = true;
				}
				if (super.anInt128 >= 734 && super.anInt128 <= 768 && super.anInt129 >= 492 && super.anInt129 < 528 && this.anIntArray57[13] != -1) {
					this.aBoolean44 = true;
					this.anInt197 = 13;
					this.aBoolean42 = true;
					return;
				}
			}
		} catch (@Pc(445) RuntimeException local445) {
			signlink.reporterror("91155, " + 0 + ", " + local445.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	private boolean method156(@OriginalArg(0) String arg0) {
		try {
			this.aBoolean72 &= true;
			if (arg0 == null) {
				return false;
			}
			for (@Pc(11) int local11 = 0; local11 < this.anInt267; local11++) {
				if (arg0.equalsIgnoreCase(this.aStringArray8[local11])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(this.aClass1_Sub1_Sub3_Sub2_1.aString30);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("14751, " + arg0 + ", " + true + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)Ljava/lang/String;")
	private String method157(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("1599, " + arg0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILclient!bc;)V")
	private void method158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3 arg4) {
		try {
			if (arg1 >= 0) {
				this.method67();
			}
			if (this.anInt153 < 400) {
				@Pc(13) String local13 = arg4.aString2;
				if (arg4.anInt71 != 0) {
					local13 = local13 + method130(arg4.anInt71, this.aClass1_Sub1_Sub3_Sub2_1.anInt933) + " (level-" + arg4.anInt71 + ")";
				}
				if (this.anInt193 == 1) {
					this.aStringArray9[this.anInt153] = "Use " + this.aString5 + " with @yel@" + local13;
					this.anIntArray60[this.anInt153] = 493;
					this.anIntArray61[this.anInt153] = arg0;
					this.anIntArray58[this.anInt153] = arg3;
					this.anIntArray59[this.anInt153] = arg2;
					this.anInt153++;
				} else if (this.anInt319 != 1) {
					@Pc(152) int local152;
					if (arg4.aStringArray2 != null) {
						for (local152 = 4; local152 >= 0; local152--) {
							if (arg4.aStringArray2[local152] != null && !arg4.aStringArray2[local152].equalsIgnoreCase("attack")) {
								this.aStringArray9[this.anInt153] = arg4.aStringArray2[local152] + " @yel@" + local13;
								if (local152 == 0) {
									this.anIntArray60[this.anInt153] = 988;
								}
								if (local152 == 1) {
									this.anIntArray60[this.anInt153] = 345;
								}
								if (local152 == 2) {
									this.anIntArray60[this.anInt153] = 249;
								}
								if (local152 == 3) {
									this.anIntArray60[this.anInt153] = 960;
								}
								if (local152 == 4) {
									this.anIntArray60[this.anInt153] = 40;
								}
								this.anIntArray61[this.anInt153] = arg0;
								this.anIntArray58[this.anInt153] = arg3;
								this.anIntArray59[this.anInt153] = arg2;
								this.anInt153++;
							}
						}
					}
					if (arg4.aStringArray2 != null) {
						for (local152 = 4; local152 >= 0; local152--) {
							if (arg4.aStringArray2[local152] != null && arg4.aStringArray2[local152].equalsIgnoreCase("attack")) {
								@Pc(276) short local276 = 0;
								if (arg4.anInt71 > this.aClass1_Sub1_Sub3_Sub2_1.anInt933) {
									local276 = 2000;
								}
								this.aStringArray9[this.anInt153] = arg4.aStringArray2[local152] + " @yel@" + local13;
								if (local152 == 0) {
									this.anIntArray60[this.anInt153] = local276 + 988;
								}
								if (local152 == 1) {
									this.anIntArray60[this.anInt153] = local276 + 345;
								}
								if (local152 == 2) {
									this.anIntArray60[this.anInt153] = local276 + 249;
								}
								if (local152 == 3) {
									this.anIntArray60[this.anInt153] = local276 + 960;
								}
								if (local152 == 4) {
									this.anIntArray60[this.anInt153] = local276 + 40;
								}
								this.anIntArray61[this.anInt153] = arg0;
								this.anIntArray58[this.anInt153] = arg3;
								this.anIntArray59[this.anInt153] = arg2;
								this.anInt153++;
							}
						}
					}
					this.aStringArray9[this.anInt153] = "Examine @yel@" + local13;
					this.anIntArray60[this.anInt153] = 1814;
					this.anIntArray61[this.anInt153] = arg0;
					this.anIntArray58[this.anInt153] = arg3;
					this.anIntArray59[this.anInt153] = arg2;
					this.anInt153++;
				} else if ((this.anInt321 & 0x2) == 2) {
					this.aStringArray9[this.anInt153] = this.aString15 + " @yel@" + local13;
					this.anIntArray60[this.anInt153] = 500;
					this.anIntArray61[this.anInt153] = arg0;
					this.anIntArray58[this.anInt153] = arg3;
					this.anIntArray59[this.anInt153] = arg2;
					this.anInt153++;
					return;
				}
			}
		} catch (@Pc(427) RuntimeException local427) {
			signlink.reporterror("89091, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local427.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(III)V")
	private void method159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.anInt268 != 0) {
				@Pc(5) int local5 = 0;
				if (this.anInt179 != 0) {
					local5 = 1;
				}
				for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
					if (this.aStringArray6[local15] != null) {
						@Pc(27) int local27 = this.anIntArray31[local15];
						if ((local27 == 3 || local27 == 7) && (local27 == 7 || this.anInt199 == 0 || this.anInt199 == 1 && this.method156(this.aStringArray5[local15]))) {
							@Pc(57) int local57 = 329 - local5 * 13;
							if (super.anInt125 > 8 && super.anInt125 < 520 && arg0 - 11 > local57 - 10 && arg0 - 11 <= local57 + 3) {
								if (this.aBoolean75) {
									this.aStringArray9[this.anInt153] = "Report abuse @whi@" + this.aStringArray5[local15];
									this.anIntArray60[this.anInt153] = 2316;
									this.anInt153++;
								}
								this.aStringArray9[this.anInt153] = "Add ignore @whi@" + this.aStringArray5[local15];
								this.anIntArray60[this.anInt153] = 2158;
								this.anInt153++;
								this.aStringArray9[this.anInt153] = "Add friend @whi@" + this.aStringArray5[local15];
								this.anIntArray60[this.anInt153] = 2447;
								this.anInt153++;
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local27 == 5 || local27 == 6) && this.anInt199 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(189) RuntimeException local189) {
			signlink.reporterror("47652, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local189.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method160() {
		try {
			if (this.aClass32_20 == null) {
				super.aClass32_2 = null;
				this.aClass32_19 = null;
				this.aClass32_17 = null;
				this.aClass32_16 = null;
				this.aClass32_18 = null;
				this.aClass32_13 = null;
				this.aClass32_14 = null;
				this.aClass32_15 = null;
				this.aClass32_23 = new Class32(128, this.method72(), 265, 947);
				Class1_Sub3_Sub2.method353();
				this.aClass32_24 = new Class32(128, this.method72(), 265, 947);
				Class1_Sub3_Sub2.method353();
				this.aClass32_20 = new Class32(533, this.method72(), 186, 947);
				Class1_Sub3_Sub2.method353();
				this.aClass32_21 = new Class32(360, this.method72(), 146, 947);
				Class1_Sub3_Sub2.method353();
				this.aClass32_22 = new Class32(360, this.method72(), 200, 947);
				Class1_Sub3_Sub2.method353();
				this.aClass32_25 = new Class32(214, this.method72(), 267, 947);
				Class1_Sub3_Sub2.method353();
				this.aClass32_26 = new Class32(215, this.method72(), 267, 947);
				Class1_Sub3_Sub2.method353();
				this.aClass32_27 = new Class32(86, this.method72(), 79, 947);
				Class1_Sub3_Sub2.method353();
				this.aClass32_28 = new Class32(87, this.method72(), 79, 947);
				Class1_Sub3_Sub2.method353();
				if (this.aClass39_1 != null) {
					this.method192();
					this.method140();
				}
				this.aBoolean71 = true;
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("95253, " + 0 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method161(@OriginalArg(1) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass1_Sub3_Sub2_Sub2_10.anIntArray148;
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
						this.aClass33_1.method495(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass33_1.method495(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			this.aClass1_Sub3_Sub2_Sub2_10.method316();
			for (local34 = 1; local34 < 103; local34++) {
				for (local36 = 1; local36 < 103; local36++) {
					if ((this.aByteArrayArrayArray7[arg0][local36][local34] & 0x18) == 0) {
						this.method166(local36, arg0, local34);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local36][local34] & 0x8) != 0) {
						this.method166(local36, arg0 + 1, local34);
					}
				}
			}
			this.aClass32_18.method455();
			this.anInt157 = 0;
			for (local36 = 0; local36 < 104; local36++) {
				for (@Pc(171) int local171 = 0; local171 < 104; local171++) {
					@Pc(181) int local181 = this.aClass33_1.method489(this.anInt337, local36, local171);
					if (local181 != 0) {
						local181 = local181 >> 14 & 0x7FFF;
						@Pc(193) int local193 = Class2.method23(local181).anInt43;
						if (local193 >= 0) {
							this.aClass1_Sub3_Sub2_Sub2Array7[this.anInt157] = this.aClass1_Sub3_Sub2_Sub2Array6[local193];
							this.anIntArray35[this.anInt157] = local36;
							this.anIntArray36[this.anInt157] = local171;
							this.anInt157++;
						}
					}
				}
			}
		} catch (@Pc(232) RuntimeException local232) {
			signlink.reporterror("56987, " + -88 + ", " + arg0 + ", " + local232.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method162(@OriginalArg(0) int arg0) {
		try {
			this.anInt207 += arg0;
			this.aBoolean77 = true;
			try {
				@Pc(10) long local10 = System.currentTimeMillis();
				@Pc(12) int local12 = 0;
				@Pc(14) int local14 = 20;
				while (this.aBoolean51) {
					this.method120();
					this.method120();
					this.method174();
					local12++;
					if (local12 > 10) {
						@Pc(31) long local31 = System.currentTimeMillis();
						@Pc(40) int local40 = (int) (local31 - local10) / 10 - local14;
						local14 = 40 - local40;
						if (local14 < 5) {
							local14 = 5;
						}
						local12 = 0;
						local10 = local31;
					}
					try {
						Thread.sleep((long) local14);
					} catch (@Pc(58) Exception local58) {
					}
				}
			} catch (@Pc(64) Exception local64) {
			}
			this.aBoolean77 = false;
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("35537, " + arg0 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;ZILjava/lang/String;)Lclient!ub;")
	private Class39 method163(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		try {
			@Pc(3) int local3 = 5;
			@Pc(6) byte[] local6 = signlink.cacheload(arg3);
			@Pc(26) int local26;
			if (local6 != null) {
				this.aCRC32_1.reset();
				this.aCRC32_1.update(local6);
				local26 = (int) this.aCRC32_1.getValue();
				if (local26 != arg2) {
					local6 = null;
				}
			}
			if (local6 != null) {
				return new Class39(true, local6);
			}
			while (local6 == null) {
				this.method74("Requesting " + arg1, arg0);
				try {
					local26 = 0;
					@Pc(65) DataInputStream local65 = this.method181(arg3 + arg2);
					@Pc(68) byte[] local68 = new byte[6];
					local65.readFully(local68, 0, 6);
					@Pc(79) Class1_Sub3_Sub3 local79 = new Class1_Sub3_Sub3(local68, 0);
					local79.anInt548 = 3;
					@Pc(87) int local87 = local79.method387() + 6;
					@Pc(89) int local89 = 6;
					local6 = new byte[local87];
					for (@Pc(94) int local94 = 0; local94 < 6; local94++) {
						local6[local94] = local68[local94];
					}
					while (local89 < local87) {
						@Pc(112) int local112 = local87 - local89;
						if (local112 > 1000) {
							local112 = 1000;
						}
						local89 += local65.read(local6, local89, local112);
						@Pc(131) int local131 = local89 * 100 / local87;
						if (local131 != local26) {
							this.method74("Loading " + arg1 + " - " + local131 + "%", arg0);
						}
						local26 = local131;
					}
					local65.close();
				} catch (@Pc(160) IOException local160) {
					local6 = null;
					for (local26 = local3; local26 > 0; local26--) {
						this.method74("Error loading - Will retry in " + local26 + " secs.", arg0);
						try {
							Thread.sleep(1000L);
						} catch (@Pc(183) Exception local183) {
						}
					}
					local3 *= 2;
					if (local3 > 60) {
						local3 = 60;
					}
				}
			}
			signlink.cachesave(arg3, local6);
			return new Class39(true, local6);
		} catch (@Pc(211) RuntimeException local211) {
			signlink.reporterror("28777, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + local211.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method164(@OriginalArg(0) int arg0) {
		try {
			if (this.aClass1_Sub1_Sub3_Sub2_1.anInt881 >> 7 == this.anInt279 && this.aClass1_Sub1_Sub3_Sub2_1.anInt882 >> 7 == this.anInt280) {
				this.anInt279 = 0;
			}
			for (@Pc(22) int local22 = -1; local22 < this.anInt149; local22++) {
				@Pc(30) Class1_Sub1_Sub3_Sub2 local30;
				@Pc(35) int local35;
				if (local22 == -1) {
					local30 = this.aClass1_Sub1_Sub3_Sub2_1;
					local35 = this.anInt148 << 14;
				} else {
					local30 = this.aClass1_Sub1_Sub3_Sub2Array1[this.anIntArray32[local22]];
					local35 = this.anIntArray32[local22] << 14;
				}
				if (local30 != null && local30.method563(this.anInt155)) {
					local30.aBoolean190 = false;
					if ((aBoolean60 && this.anInt149 > 50 || this.anInt149 > 200) && local22 != -1 && local30.anInt903 == local30.anInt885) {
						local30.aBoolean190 = true;
					}
					@Pc(88) int local88 = local30.anInt881 >> 7;
					@Pc(93) int local93 = local30.anInt882 >> 7;
					if (local88 >= 0 && local88 < 104 && local93 >= 0 && local93 < 104) {
						if (local30.aClass1_Sub3_Sub1_11 == null || anInt332 < local30.anInt935 || anInt332 >= local30.anInt936) {
							if ((local30.anInt881 & 0x7F) == 64 && (local30.anInt882 & 0x7F) == 64) {
								if (this.anIntArrayArray3[local88][local93] == this.anInt182) {
									continue;
								}
								this.anIntArrayArray3[local88][local93] = this.anInt182;
							}
							local30.anInt934 = this.method132(local30.anInt881, this.aByte19, local30.anInt882, this.anInt337);
							this.aClass33_1.method470(null, local30.anInt934, local35, local30.anInt882, local30.anInt883, 60, local30.aBoolean186, local30.anInt881, local30, this.anInt337);
						} else {
							local30.aBoolean190 = false;
							local30.anInt934 = this.method132(local30.anInt881, this.aByte19, local30.anInt882, this.anInt337);
							this.aClass33_1.method471(local30.anInt883, local30.anInt943, this.anInt337, local30.anInt940, local30.anInt942, null, local30.anInt881, local30, local30.anInt941, local30.anInt934, local35, local30.anInt882);
						}
					}
				}
			}
			@Pc(229) boolean local229 = true;
		} catch (@Pc(231) RuntimeException local231) {
			signlink.reporterror("2921, " + arg0 + ", " + local231.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method165() {
		try {
			this.aClass1_Sub3_Sub3_5.method372(153);
			if (this.anInt241 != -1) {
				this.anInt241 = -1;
				this.aBoolean44 = true;
				this.aBoolean62 = false;
				this.aBoolean42 = true;
			}
			if (this.anInt299 != -1) {
				this.anInt299 = -1;
				this.aBoolean43 = true;
				this.aBoolean62 = false;
			}
			this.anInt220 = -1;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("35384, " + -24081 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIB)V")
	private void method166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(16) int local16 = this.aClass33_1.method486(arg1, arg0, arg2);
			@Pc(26) int local26;
			@Pc(32) int local32;
			@Pc(36) int local36;
			@Pc(38) int local38;
			@Pc(60) int local60;
			@Pc(66) int local66;
			if (local16 != 0) {
				local26 = this.aClass33_1.method490(arg1, arg0, arg2, local16);
				local32 = local26 >> 6 & 0x3;
				local36 = local26 & 0x1F;
				local38 = 15658734;
				if (local16 > 0) {
					local38 = 15597568;
				}
				@Pc(46) int[] local46 = this.aClass1_Sub3_Sub2_Sub2_10.anIntArray148;
				local60 = arg0 * 4 + (103 - arg2) * 512 * 4 + 24624;
				local66 = local16 >> 14 & 0x7FFF;
				@Pc(69) Class2 local69 = Class2.method23(local66);
				if (local69.anInt44 == -1) {
					if (local36 == 0 || local36 == 2) {
						if (local32 == 0) {
							local46[local60] = local38;
							local46[local60 + 512] = local38;
							local46[local60 + 1024] = local38;
							local46[local60 + 1536] = local38;
						} else if (local32 == 1) {
							local46[local60] = local38;
							local46[local60 + 1] = local38;
							local46[local60 + 2] = local38;
							local46[local60 + 3] = local38;
						} else if (local32 == 2) {
							local46[local60 + 3] = local38;
							local46[local60 + 3 + 512] = local38;
							local46[local60 + 3 + 1024] = local38;
							local46[local60 + 3 + 1536] = local38;
						} else if (local32 == 3) {
							local46[local60 + 1536] = local38;
							local46[local60 + 1536 + 1] = local38;
							local46[local60 + 1536 + 2] = local38;
							local46[local60 + 1536 + 3] = local38;
						}
					}
					if (local36 == 3) {
						if (local32 == 0) {
							local46[local60] = local38;
						} else if (local32 == 1) {
							local46[local60 + 3] = local38;
						} else if (local32 == 2) {
							local46[local60 + 3 + 1536] = local38;
						} else if (local32 == 3) {
							local46[local60 + 1536] = local38;
						}
					}
					if (local36 == 2) {
						if (local32 == 3) {
							local46[local60] = local38;
							local46[local60 + 512] = local38;
							local46[local60 + 1024] = local38;
							local46[local60 + 1536] = local38;
						} else if (local32 == 0) {
							local46[local60] = local38;
							local46[local60 + 1] = local38;
							local46[local60 + 2] = local38;
							local46[local60 + 3] = local38;
						} else if (local32 == 1) {
							local46[local60 + 3] = local38;
							local46[local60 + 3 + 512] = local38;
							local46[local60 + 3 + 1024] = local38;
							local46[local60 + 3 + 1536] = local38;
						} else if (local32 == 2) {
							local46[local60 + 1536] = local38;
							local46[local60 + 1536 + 1] = local38;
							local46[local60 + 1536 + 2] = local38;
							local46[local60 + 1536 + 3] = local38;
						}
					}
				} else {
					@Pc(79) Class1_Sub3_Sub2_Sub3 local79 = this.aClass1_Sub3_Sub2_Sub3Array2[local69.anInt44];
					if (local79 != null) {
						@Pc(91) int local91 = (local69.anInt39 * 4 - local79.anInt502) / 2;
						@Pc(101) int local101 = (local69.anInt40 * 4 - local79.anInt503) / 2;
						local79.method346((104 - arg2 - local69.anInt40) * 4 + local101 + 48, arg0 * 4 + 48 + local91);
					}
				}
			}
			local16 = this.aClass33_1.method488(arg1, arg0, arg2);
			if (local16 != 0) {
				local26 = this.aClass33_1.method490(arg1, arg0, arg2, local16);
				local32 = local26 >> 6 & 0x3;
				local36 = local26 & 0x1F;
				local38 = local16 >> 14 & 0x7FFF;
				@Pc(455) Class2 local455 = Class2.method23(local38);
				@Pc(487) int local487;
				if (local455.anInt44 != -1) {
					@Pc(465) Class1_Sub3_Sub2_Sub3 local465 = this.aClass1_Sub3_Sub2_Sub3Array2[local455.anInt44];
					if (local465 != null) {
						local66 = (local455.anInt39 * 4 - local465.anInt502) / 2;
						local487 = (local455.anInt40 * 4 - local465.anInt503) / 2;
						local465.method346((104 - arg2 - local455.anInt40) * 4 + local487 + 48, arg0 * 4 + 48 + local66);
					}
				} else if (local36 == 9) {
					local60 = 15658734;
					if (local16 > 0) {
						local60 = 15597568;
					}
					@Pc(524) int[] local524 = this.aClass1_Sub3_Sub2_Sub2_10.anIntArray148;
					local487 = arg0 * 4 + (103 - arg2) * 512 * 4 + 24624;
					if (local32 == 0 || local32 == 2) {
						local524[local487 + 1536] = local60;
						local524[local487 + 1024 + 1] = local60;
						local524[local487 + 512 + 2] = local60;
						local524[local487 + 3] = local60;
					} else {
						local524[local487] = local60;
						local524[local487 + 512 + 1] = local60;
						local524[local487 + 1024 + 2] = local60;
						local524[local487 + 1536 + 3] = local60;
					}
				}
			}
			local16 = this.aClass33_1.method489(arg1, arg0, arg2);
			if (local16 != 0) {
				local26 = local16 >> 14 & 0x7FFF;
				@Pc(619) Class2 local619 = Class2.method23(local26);
				if (local619.anInt44 != -1) {
					@Pc(629) Class1_Sub3_Sub2_Sub3 local629 = this.aClass1_Sub3_Sub2_Sub3Array2[local619.anInt44];
					if (local629 != null) {
						local38 = (local619.anInt39 * 4 - local629.anInt502) / 2;
						@Pc(651) int local651 = (local619.anInt40 * 4 - local629.anInt503) / 2;
						local629.method346((104 - arg2 - local619.anInt40) * 4 + local651 + 48, arg0 * 4 + 48 + local38);
						return;
					}
				}
			}
		} catch (@Pc(675) RuntimeException local675) {
			signlink.reporterror("1560, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -96 + ", " + local675.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!hc;)Z")
	private boolean method167(@OriginalArg(1) Class15 arg0) {
		try {
			@Pc(2) int local2 = arg0.anInt463;
			if (local2 >= 1 && local2 <= 200) {
				if (local2 >= 101) {
					local2 -= 101;
				} else {
					local2--;
				}
				this.aStringArray9[this.anInt153] = "Remove @whi@" + this.aStringArray8[local2];
				this.anIntArray60[this.anInt153] = 804;
				this.anInt153++;
				this.aStringArray9[this.anInt153] = "Message @whi@" + this.aStringArray8[local2];
				this.anIntArray60[this.anInt153] = 125;
				this.anInt153++;
				return true;
			} else if (local2 >= 401 && local2 <= 500) {
				this.aStringArray9[this.anInt153] = "Remove @whi@" + arg0.aString20;
				this.anIntArray60[this.anInt153] = 521;
				this.anInt153++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("98, " + false + ", " + arg0 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IJ)V")
	private void method168(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt202 >= 100) {
					this.method94(0, "", "Your ignore list is full. Max of 100 hit");
				} else {
					@Pc(23) String local23 = Class40.method534(Class40.method531(arg0));
					for (@Pc(25) int local25 = 0; local25 < this.anInt202; local25++) {
						if (this.aLongArray3[local25] == arg0) {
							this.method94(0, "", local23 + " is already on your ignore list");
							return;
						}
					}
					for (@Pc(55) int local55 = 0; local55 < this.anInt267; local55++) {
						if (this.aLongArray4[local55] == arg0) {
							this.method94(0, "", "Please remove " + local23 + " from your friend list first");
							return;
						}
					}
					this.aLongArray3[this.anInt202++] = arg0;
					this.aBoolean44 = true;
					this.aClass1_Sub3_Sub3_5.method372(175);
					this.aClass1_Sub3_Sub3_5.method379(arg0);
				}
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("81882, " + 0 + ", " + arg0 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)I")
	private int method170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = 256 - arg0;
			return ((arg2 & 0xFF00FF) * local3 + (arg1 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg2 & 0xFF00) * local3 + (arg1 & 0xFF00) * arg0 & 0xFF0000) >> 8;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("17652, " + arg0 + ", " + arg1 + ", " + -514 + ", " + arg2 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;II)V")
	private void method171(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.anInt277 != 43166) {
				this.aClass28ArrayArrayArray1 = null;
			}
			if (arg1 != null) {
				@Pc(12) Object local12 = this.anObject1;
				synchronized (this.anObject1) {
					this.aString16 = arg1;
					this.anInt206 = arg0;
					this.anInt234 = arg2;
				}
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("7361, " + arg0 + ", " + arg1 + ", " + 43166 + ", " + arg2 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method172() {
		try {
			if (this.anInt185 == 2) {
				for (@Pc(12) Class1_Sub5 local12 = (Class1_Sub5) this.aClass28_3.method448(); local12 != null; local12 = (Class1_Sub5) this.aClass28_3.method450(this.anInt161)) {
					if (anInt332 >= local12.anInt621) {
						this.method88(local12.anInt619, local12.anInt616, local12.anInt617, local12.anInt618, local12.anInt614, local12.anInt620, local12.anInt615);
						local12.method559();
					}
				}
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("92793, " + -96 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JZ)V")
	private void method173(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.aBoolean72 &= arg1;
			if (arg0 != 0L) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt202; local14++) {
					if (this.aLongArray3[local14] == arg0) {
						this.anInt202--;
						this.aBoolean44 = true;
						for (@Pc(34) int local34 = local14; local34 < this.anInt202; local34++) {
							this.aLongArray3[local34] = this.aLongArray3[local34 + 1];
						}
						this.aClass1_Sub3_Sub3_5.method372(68);
						this.aClass1_Sub3_Sub3_5.method379(arg0);
						return;
					}
				}
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("91859, " + arg0 + ", " + arg1 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
	private void method174() {
		try {
			@Pc(8) int local8;
			if (this.anInt335 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt335 > 768) {
						this.anIntArray66[local8] = this.method170(1024 - this.anInt335, this.anIntArray68[local8], this.anIntArray67[local8]);
					} else if (this.anInt335 > 256) {
						this.anIntArray66[local8] = this.anIntArray68[local8];
					} else {
						this.anIntArray66[local8] = this.method170(256 - this.anInt335, this.anIntArray67[local8], this.anIntArray68[local8]);
					}
				}
			} else if (this.anInt336 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt336 > 768) {
						this.anIntArray66[local8] = this.method170(1024 - this.anInt336, this.anIntArray69[local8], this.anIntArray67[local8]);
					} else if (this.anInt336 > 256) {
						this.anIntArray66[local8] = this.anIntArray69[local8];
					} else {
						this.anIntArray66[local8] = this.method170(256 - this.anInt336, this.anIntArray67[local8], this.anIntArray69[local8]);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray66[local8] = this.anIntArray67[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass32_23.anIntArray197[local8] = this.aClass1_Sub3_Sub2_Sub2_4.anIntArray148[local8];
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
				local198 = this.anIntArray56[local185] * (256 - local185) / 256;
				local202 = local198 + 22;
				if (local202 < 0) {
					local202 = 0;
				}
				local181 += local202;
				for (local212 = local202; local212 < 128; local212++) {
					local220 = this.anIntArray63[local181++];
					if (local220 == 0) {
						local183++;
					} else {
						local224 = local220;
						local228 = 256 - local220;
						local220 = this.anIntArray66[local220];
						local239 = this.aClass32_23.anIntArray197[local183];
						this.aClass32_23.anIntArray197[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			this.aClass32_23.method456(0, 0, super.aGraphics2);
			for (local198 = 0; local198 < 33920; local198++) {
				this.aClass32_24.anIntArray197[local198] = this.aClass1_Sub3_Sub2_Sub2_5.anIntArray148[local198];
			}
			local181 = 0;
			local183 = 1176;
			for (local202 = 1; local202 < 255; local202++) {
				local212 = this.anIntArray56[local202] * (256 - local202) / 256;
				local220 = 103 - local212;
				local183 += local212;
				for (local224 = 0; local224 < local220; local224++) {
					local228 = this.anIntArray63[local181++];
					if (local228 == 0) {
						local183++;
					} else {
						local239 = local228;
						@Pc(362) int local362 = 256 - local228;
						local228 = this.anIntArray66[local228];
						@Pc(373) int local373 = this.aClass32_24.anIntArray197[local183];
						this.aClass32_24.anIntArray197[local183++] = ((local228 & 0xFF00FF) * local239 + (local373 & 0xFF00FF) * local362 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local373 & 0xFF00) * local362 & 0xFF0000) >> 8;
					}
				}
				local181 += 128 - local220;
				local183 += 128 - local220 - local212;
			}
			this.aClass32_24.method456(0, 661, super.aGraphics2);
		} catch (@Pc(455) RuntimeException local455) {
			signlink.reporterror("476, " + true + ", " + local455.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method175() {
		try {
			this.aBoolean70 = true;
			for (@Pc(13) int local13 = 0; local13 < 7; local13++) {
				this.anIntArray70[local13] = -1;
				for (@Pc(22) int local22 = 0; local22 < Class13.anInt427; local22++) {
					if (!Class13.aClass13Array1[local22].aBoolean106 && Class13.aClass13Array1[local22].anInt428 == local13 + (this.aBoolean47 ? 0 : 7)) {
						this.anIntArray70[local13] = local22;
						break;
					}
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("70556, " + -6645 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Z")
	private boolean method176(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(13) Class15 local13 = Class15.aClass15Array1[arg0];
			for (@Pc(15) int local15 = 0; local15 < local13.anIntArray153.length && local13.anIntArray153[local15] != -1; local15++) {
				@Pc(30) Class15 local30 = Class15.aClass15Array1[local13.anIntArray153[local15]];
				if (local30.anInt461 == 1) {
					local3 |= this.method176(local30.anInt459, arg1);
				}
				if (local30.anInt461 == 6 && (local30.anInt477 != -1 || local30.anInt478 != -1)) {
					@Pc(61) boolean local61 = this.method116(local30, this.anInt260);
					@Pc(66) int local66;
					if (local61) {
						local66 = local30.anInt478;
					} else {
						local66 = local30.anInt477;
					}
					if (local66 != -1) {
						@Pc(78) Class19 local78 = Class19.aClass19Array1[local66];
						local30.anInt458 += arg1;
						while (local30.anInt458 > local78.anIntArray188[local30.anInt457]) {
							local30.anInt458 -= local78.anIntArray188[local30.anInt457] + 1;
							local30.anInt457++;
							if (local30.anInt457 >= local78.anInt530) {
								local30.anInt457 -= local78.anInt531;
								if (local30.anInt457 < 0 || local30.anInt457 >= local78.anInt530) {
									local30.anInt457 = 0;
								}
							}
							local3 = true;
						}
					}
				}
			}
			return local3;
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("89651, " + 27708 + ", " + arg0 + ", " + arg1 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
	private void method177() {
		try {
			try {
				if (this.aClass6_1 != null) {
					this.aClass6_1.method201();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass6_1 = null;
			this.aBoolean72 = false;
			this.anInt154 = 0;
			this.aString12 = "";
			this.aString13 = "";
			Class8.method209(false);
			this.method178();
			this.aClass33_1.method459();
			for (@Pc(41) int local41 = 0; local41 < 4; local41++) {
				this.aClass9Array1[local41].method248();
			}
			System.gc();
			this.method182();
			this.aString17 = null;
			this.anInt253 = 0;
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("67769, " + 117 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)Ljava/awt/Component;")
	@Override
	protected Component method72() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("46695, " + 16374 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method178() {
		try {
			Class2.aClass35_1.method521();
			Class2.aClass35_2.method521();
			Class3.aClass35_3.method521();
			Class5.aClass35_4.method521();
			Class5.aClass35_5.method521();
			Class1_Sub1_Sub3_Sub2.aClass35_9.method521();
			Class21.aClass35_8.method521();
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("97345, " + -39187 + ", " + local23.toString());
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
				return new URL("http://127.0.0.1:" + (anInt252 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!kb;IILclient!z;)V")
	private void method179(@OriginalArg(1) Class1_Sub3_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub1_Sub3_Sub2 arg3) {
		try {
			@Pc(7) int local7;
			if (this.aByte21 != -58) {
				for (local7 = 1; local7 > 0; local7++) {
				}
			}
			if ((arg1 & 0x1) == 1) {
				local7 = arg0.method383();
				@Pc(23) byte[] local23 = new byte[local7];
				@Pc(29) Class1_Sub3_Sub3 local29 = new Class1_Sub3_Sub3(local23, 0);
				arg0.method392(0, local7, local23, this.aBoolean52);
				this.aClass1_Sub3_Sub3Array1[arg2] = local29;
				arg3.method564(local29);
			}
			@Pc(68) int local68;
			if ((arg1 & 0x2) == 2) {
				local7 = arg0.method385();
				if (local7 == 65535) {
					local7 = -1;
				}
				if (local7 == arg3.anInt906) {
					arg3.anInt910 = 0;
				}
				local68 = arg0.method383();
				if (local7 == -1 || arg3.anInt906 == -1 || Class19.aClass19Array1[local7].anInt532 > Class19.aClass19Array1[arg3.anInt906].anInt532 || Class19.aClass19Array1[arg3.anInt906].anInt532 == 0) {
					arg3.anInt906 = local7;
					arg3.anInt907 = 0;
					arg3.anInt908 = 0;
					arg3.anInt909 = local68;
					arg3.anInt910 = 0;
				}
			}
			if ((arg1 & 0x4) == 4) {
				arg3.anInt900 = arg0.method385();
				if (arg3.anInt900 == 65535) {
					arg3.anInt900 = -1;
				}
			}
			if ((arg1 & 0x8) == 8) {
				arg3.aString29 = arg0.method390();
				arg3.anInt893 = 0;
				arg3.anInt894 = 0;
				arg3.anInt892 = 150;
				this.method94(2, arg3.aString30, arg3.aString29);
			}
			if ((arg1 & 0x10) == 16) {
				arg3.anInt895 = arg0.method383();
				arg3.anInt896 = arg0.method383();
				arg3.anInt897 = anInt332 + 400;
				arg3.anInt898 = arg0.method383();
				arg3.anInt899 = arg0.method383();
			}
			if ((arg1 & 0x20) == 32) {
				arg3.anInt901 = arg0.method385();
				arg3.anInt902 = arg0.method385();
			}
			if ((arg1 & 0x40) == 64) {
				local7 = arg0.method385();
				local68 = arg0.method383();
				@Pc(201) int local201 = arg0.method383();
				@Pc(204) int local204 = arg0.anInt548;
				if (arg3.aString30 != null) {
					@Pc(211) long local211 = Class40.method530(arg3.aString30);
					@Pc(213) boolean local213 = false;
					if (local68 <= 1) {
						for (@Pc(218) int local218 = 0; local218 < this.anInt202; local218++) {
							if (this.aLongArray3[local218] == local211) {
								local213 = true;
								break;
							}
						}
					}
					if (!local213 && this.anInt334 == 0) {
						try {
							@Pc(246) String local246 = Class41.method537(local201, arg0);
							@Pc(250) String local250 = Class25.method416(local246);
							arg3.aString29 = local250;
							arg3.anInt893 = local7 >> 8;
							arg3.anInt894 = local7 & 0xFF;
							arg3.anInt892 = 150;
							if (local68 > 1) {
								this.method94(1, arg3.aString30, local250);
							} else {
								this.method94(2, arg3.aString30, local250);
							}
						} catch (@Pc(287) Exception local287) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg0.anInt548 = local204 + local201;
			}
			if ((arg1 & 0x100) == 256) {
				arg3.anInt911 = arg0.method385();
				local7 = arg0.method388();
				arg3.anInt915 = local7 >> 16;
				arg3.anInt914 = anInt332 + (local7 & 0xFFFF);
				arg3.anInt912 = 0;
				arg3.anInt913 = 0;
				if (arg3.anInt914 > anInt332) {
					arg3.anInt912 = -1;
				}
				if (arg3.anInt911 == 65535) {
					arg3.anInt911 = -1;
				}
			}
			if ((arg1 & 0x200) == 512) {
				arg3.anInt916 = arg0.method383();
				arg3.anInt918 = arg0.method383();
				arg3.anInt917 = arg0.method383();
				arg3.anInt919 = arg0.method383();
				arg3.anInt920 = arg0.method385() + anInt332;
				arg3.anInt921 = arg0.method385() + anInt332;
				arg3.anInt922 = arg0.method383();
				arg3.anInt926 = 0;
				arg3.anIntArray232[0] = arg3.anInt917;
				arg3.anIntArray233[0] = arg3.anInt919;
			}
		} catch (@Pc(393) RuntimeException local393) {
			signlink.reporterror("92564, " + -58 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local393.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg4 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg2 & 0x7FF;
			this.anInt207 += 0;
			@Pc(19) int local19 = 0;
			@Pc(21) int local21 = 0;
			@Pc(23) int local23 = arg3;
			@Pc(29) int local29;
			@Pc(33) int local33;
			@Pc(43) int local43;
			if (local5 != 0) {
				local29 = Class1_Sub3_Sub1.anIntArray124[local5];
				local33 = Class1_Sub3_Sub1.anIntArray125[local5];
				local43 = local33 * 0 - arg3 * local29 >> 16;
				local23 = local29 * 0 + arg3 * local33 >> 16;
				local21 = local43;
			}
			if (local11 != 0) {
				local29 = Class1_Sub3_Sub1.anIntArray124[local11];
				local33 = Class1_Sub3_Sub1.anIntArray125[local11];
				local43 = local23 * local29 + local33 * 0 >> 16;
				local23 = local23 * local33 - local29 * 0 >> 16;
				local19 = local43;
			}
			this.anInt242 = arg0 - local19;
			this.anInt243 = arg1 - local21;
			this.anInt244 = arg5 - local23;
			this.anInt245 = arg4;
			this.anInt246 = arg2;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("99228, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method181(@OriginalArg(0) String arg0) throws IOException {
		return signlink.mainapp == null ? new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream()) : signlink.openurl(arg0);
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
	private void method182() {
		try {
			signlink.anInt747 = 0;
			signlink.midi = "stop";
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("2486, " + -57 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
	private void method183() {
		try {
			if (this.anInt268 != 0) {
				@Pc(6) Class1_Sub3_Sub2_Sub4 local6 = this.aClass1_Sub3_Sub2_Sub4_2;
				@Pc(8) int local8 = 0;
				if (this.anInt179 != 0) {
					local8 = 1;
				}
				for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
					if (this.aStringArray6[local15] != null) {
						@Pc(27) int local27 = this.anIntArray31[local15];
						@Pc(57) int local57;
						if ((local27 == 3 || local27 == 7) && (local27 == 7 || this.anInt199 == 0 || this.anInt199 == 1 && this.method156(this.aStringArray5[local15]))) {
							local57 = 329 - local8 * 13;
							local6.method361(476, local57, "From " + this.aStringArray5[local15] + ": " + this.aStringArray6[local15], 4, 0);
							local6.method361(476, local57 - 1, "From " + this.aStringArray5[local15] + ": " + this.aStringArray6[local15], 4, 65535);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local27 == 5 && this.anInt199 < 2) {
							local57 = 329 - local8 * 13;
							local6.method361(476, local57, this.aStringArray6[local15], 4, 0);
							local6.method361(476, local57 - 1, this.aStringArray6[local15], 4, 65535);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local27 == 6 && this.anInt199 < 2) {
							local57 = 329 - local8 * 13;
							local6.method361(476, local57, "To " + this.aStringArray5[local15] + ": " + this.aStringArray6[local15], 4, 0);
							local6.method361(476, local57 - 1, "To " + this.aStringArray5[local15] + ": " + this.aStringArray6[local15], 4, 65535);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(233) RuntimeException local233) {
			signlink.reporterror("11316, " + 7 + ", " + local233.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method184() {
		try {
			for (@Pc(6) int local6 = 0; local6 < this.anInt180; local6++) {
				@Pc(13) int local13 = this.anIntArray44[local6];
				@Pc(18) Class1_Sub1_Sub3_Sub1 local18 = this.aClass1_Sub1_Sub3_Sub1Array1[local13];
				if (local18 != null) {
					this.method185(this.aBoolean55, local18, local18.aClass3_1.aByte10);
				}
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("94837, " + -45891 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!x;I)V")
	private void method185(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) int arg2) {
		try {
			if (!arg0) {
				this.aBoolean49 = !this.aBoolean49;
			}
			if (arg1.anInt881 < 128 || arg1.anInt882 < 128 || arg1.anInt881 >= 13184 || arg1.anInt882 >= 13184) {
				arg1.anInt906 = -1;
				arg1.anInt911 = -1;
				arg1.anInt920 = 0;
				arg1.anInt921 = 0;
				arg1.anInt881 = arg1.anIntArray232[0] * 128 + arg1.anInt884 * 64;
				arg1.anInt882 = arg1.anIntArray233[0] * 128 + arg1.anInt884 * 64;
				arg1.anInt926 = 0;
			}
			if (arg1 == this.aClass1_Sub1_Sub3_Sub2_1 && (arg1.anInt881 < 1536 || arg1.anInt882 < 1536 || arg1.anInt881 >= 11776 || arg1.anInt882 >= 11776)) {
				arg1.anInt906 = -1;
				arg1.anInt911 = -1;
				arg1.anInt920 = 0;
				arg1.anInt921 = 0;
				arg1.anInt881 = arg1.anIntArray232[0] * 128 + arg1.anInt884 * 64;
				arg1.anInt882 = arg1.anIntArray233[0] * 128 + arg1.anInt884 * 64;
				arg1.anInt926 = 0;
			}
			if (arg1.anInt920 > anInt332) {
				this.method186(arg1, 71);
			} else if (arg1.anInt921 >= anInt332) {
				this.method187(arg1);
			} else {
				this.method188(arg1);
			}
			this.method189(arg1);
			this.method190(arg1, this.aByte17);
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("97524, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!x;I)V")
	private void method186(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(8) int local8 = arg0.anInt920 - anInt332;
			@Pc(18) int local18 = arg0.anInt916 * 128 + arg0.anInt884 * 64;
			@Pc(28) int local28 = arg0.anInt918 * 128 + arg0.anInt884 * 64;
			arg0.anInt881 += (local18 - arg0.anInt881) / local8;
			arg0.anInt882 += (local28 - arg0.anInt882) / local8;
			arg0.anInt927 = 0;
			if (arg0.anInt922 == 0) {
				arg0.anInt925 = 1024;
			}
			if (arg0.anInt922 == 1) {
				arg0.anInt925 = 1536;
			}
			if (arg0.anInt922 == 2) {
				arg0.anInt925 = 0;
			}
			if (arg0.anInt922 == 3) {
				arg0.anInt925 = 512;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("78018, " + arg0 + ", " + arg1 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!x;)V")
	private void method187(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			if (arg0.anInt921 == anInt332 || arg0.anInt906 == -1 || arg0.anInt909 != 0 || arg0.anInt908 + 1 > Class19.aClass19Array1[arg0.anInt906].anIntArray188[arg0.anInt907]) {
				@Pc(29) int local29 = arg0.anInt921 - arg0.anInt920;
				@Pc(34) int local34 = anInt332 - arg0.anInt920;
				@Pc(44) int local44 = arg0.anInt916 * 128 + arg0.anInt884 * 64;
				@Pc(54) int local54 = arg0.anInt918 * 128 + arg0.anInt884 * 64;
				@Pc(64) int local64 = arg0.anInt917 * 128 + arg0.anInt884 * 64;
				@Pc(74) int local74 = arg0.anInt919 * 128 + arg0.anInt884 * 64;
				arg0.anInt881 = (local44 * (local29 - local34) + local64 * local34) / local29;
				arg0.anInt882 = (local54 * (local29 - local34) + local74 * local34) / local29;
			}
			arg0.anInt927 = 0;
			if (arg0.anInt922 == 0) {
				arg0.anInt925 = 1024;
			}
			if (arg0.anInt922 == 1) {
				arg0.anInt925 = 1536;
			}
			if (arg0.anInt922 == 2) {
				arg0.anInt925 = 0;
			}
			if (arg0.anInt922 == 3) {
				arg0.anInt925 = 512;
			}
			arg0.anInt883 = arg0.anInt925;
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("98613, " + -33935 + ", " + arg0 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!x;I)V")
	private void method188(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			arg0.anInt903 = arg0.anInt885;
			if (arg0.anInt926 == 0) {
				arg0.anInt927 = 0;
			} else {
				if (arg0.anInt906 != -1 && arg0.anInt909 == 0) {
					@Pc(24) Class19 local24 = Class19.aClass19Array1[arg0.anInt906];
					if (local24.anIntArray189 == null) {
						arg0.anInt927++;
						return;
					}
				}
				@Pc(37) int local37 = arg0.anInt881;
				@Pc(40) int local40 = arg0.anInt882;
				@Pc(55) int local55 = arg0.anIntArray232[arg0.anInt926 - 1] * 128 + arg0.anInt884 * 64;
				@Pc(70) int local70 = arg0.anIntArray233[arg0.anInt926 - 1] * 128 + arg0.anInt884 * 64;
				if (local55 - local37 <= 256 && local55 - local37 >= -256 && local70 - local40 <= 256 && local70 - local40 >= -256) {
					if (local37 < local55) {
						if (local40 < local70) {
							arg0.anInt925 = 1280;
						} else if (local40 > local70) {
							arg0.anInt925 = 1792;
						} else {
							arg0.anInt925 = 1536;
						}
					} else if (local37 > local55) {
						if (local40 < local70) {
							arg0.anInt925 = 768;
						} else if (local40 > local70) {
							arg0.anInt925 = 256;
						} else {
							arg0.anInt925 = 512;
						}
					} else if (local40 < local70) {
						arg0.anInt925 = 1024;
					} else {
						arg0.anInt925 = 0;
					}
					@Pc(164) int local164 = arg0.anInt925 - arg0.anInt883 & 0x7FF;
					if (local164 > 1024) {
						local164 -= 2048;
					}
					@Pc(171) int local171 = arg0.anInt888;
					if (local164 >= -256 && local164 <= 256) {
						local171 = arg0.anInt887;
					} else if (local164 >= 256 && local164 < 768) {
						local171 = arg0.anInt890;
					} else if (local164 >= -768 && local164 <= -256) {
						local171 = arg0.anInt889;
					}
					if (local171 == -1) {
						local171 = arg0.anInt887;
					}
					arg0.anInt903 = local171;
					@Pc(213) int local213 = 4;
					if (arg0.anInt883 != arg0.anInt925 && arg0.anInt900 == -1) {
						local213 = 2;
					}
					if (arg0.anInt926 > 2) {
						local213 = 6;
					}
					if (arg0.anInt926 > 3) {
						local213 = 8;
					}
					if (arg0.anInt927 > 0 && arg0.anInt926 > 1) {
						local213 = 8;
						arg0.anInt927--;
					}
					if (arg0.aBooleanArray9[arg0.anInt926 - 1]) {
						local213 <<= 0x1;
					}
					if (local213 >= 8 && arg0.anInt903 == arg0.anInt887 && arg0.anInt891 != -1) {
						arg0.anInt903 = arg0.anInt891;
					}
					if (local37 < local55) {
						arg0.anInt881 += local213;
						if (arg0.anInt881 > local55) {
							arg0.anInt881 = local55;
						}
					} else if (local37 > local55) {
						arg0.anInt881 -= local213;
						if (arg0.anInt881 < local55) {
							arg0.anInt881 = local55;
						}
					}
					if (local40 < local70) {
						arg0.anInt882 += local213;
						if (arg0.anInt882 > local70) {
							arg0.anInt882 = local70;
						}
					} else if (local40 > local70) {
						arg0.anInt882 -= local213;
						if (arg0.anInt882 < local70) {
							arg0.anInt882 = local70;
						}
					}
					if (arg0.anInt881 == local55 && arg0.anInt882 == local70) {
						arg0.anInt926--;
					}
				} else {
					arg0.anInt881 = local55;
					arg0.anInt882 = local70;
				}
			}
		} catch (@Pc(367) RuntimeException local367) {
			signlink.reporterror("62122, " + arg0 + ", " + 45927 + ", " + local367.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!x;I)V")
	private void method189(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(28) int local28;
			@Pc(34) int local34;
			if (arg0.anInt900 != -1 && arg0.anInt900 < 32768) {
				@Pc(20) Class1_Sub1_Sub3_Sub1 local20 = this.aClass1_Sub1_Sub3_Sub1Array1[arg0.anInt900];
				if (local20 != null) {
					local28 = arg0.anInt881 - local20.anInt881;
					local34 = arg0.anInt882 - local20.anInt882;
					if (local28 != 0 || local34 != 0) {
						arg0.anInt925 = (int) (Math.atan2((double) local28, (double) local34) * 325.949D) & 0x7FF;
					}
				}
			}
			@Pc(59) int local59;
			if (arg0.anInt900 >= 32768) {
				local59 = arg0.anInt900 - 32768;
				if (local59 == this.anInt178) {
					local59 = this.anInt148;
				}
				@Pc(71) Class1_Sub1_Sub3_Sub2 local71 = this.aClass1_Sub1_Sub3_Sub2Array1[local59];
				if (local71 != null) {
					local34 = arg0.anInt881 - local71.anInt881;
					@Pc(85) int local85 = arg0.anInt882 - local71.anInt882;
					if (local34 != 0 || local85 != 0) {
						arg0.anInt925 = (int) (Math.atan2((double) local34, (double) local85) * 325.949D) & 0x7FF;
					}
				}
			}
			if ((arg0.anInt901 != 0 || arg0.anInt902 != 0) && (arg0.anInt926 == 0 || arg0.anInt927 > 0)) {
				local59 = arg0.anInt881 - (arg0.anInt901 - this.anInt295 - this.anInt295) * 64;
				local28 = arg0.anInt882 - (arg0.anInt902 - this.anInt296 - this.anInt296) * 64;
				if (local59 != 0 || local28 != 0) {
					arg0.anInt925 = (int) (Math.atan2((double) local59, (double) local28) * 325.949D) & 0x7FF;
				}
				arg0.anInt901 = 0;
				arg0.anInt902 = 0;
			}
			local59 = arg0.anInt925 - arg0.anInt883 & 0x7FF;
			if (local59 != 0) {
				if (local59 < 32 || local59 > 2016) {
					arg0.anInt883 = arg0.anInt925;
				} else if (local59 > 1024) {
					arg0.anInt883 -= 32;
				} else {
					arg0.anInt883 += 32;
				}
				arg0.anInt883 &= 0x7FF;
				if (arg0.anInt903 == arg0.anInt885 && arg0.anInt883 != arg0.anInt925) {
					if (arg0.anInt886 != -1) {
						arg0.anInt903 = arg0.anInt886;
						return;
					}
					arg0.anInt903 = arg0.anInt887;
					return;
				}
			}
		} catch (@Pc(233) RuntimeException local233) {
			signlink.reporterror("87541, " + arg0 + ", " + -485 + ", " + local233.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!x;B)V")
	private void method190(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg1 != 8) {
				for (@Pc(6) int local6 = 1; local6 > 0; local6++) {
				}
			}
			arg0.aBoolean186 = false;
			@Pc(23) Class19 local23;
			if (arg0.anInt903 != -1) {
				local23 = Class19.aClass19Array1[arg0.anInt903];
				arg0.anInt905++;
				if (arg0.anInt904 < local23.anInt530 && arg0.anInt905 > local23.anIntArray188[arg0.anInt904]) {
					arg0.anInt905 = 0;
					arg0.anInt904++;
				}
				if (arg0.anInt904 >= local23.anInt530) {
					arg0.anInt905 = 0;
					arg0.anInt904 = 0;
				}
			}
			if (arg0.anInt906 != -1 && arg0.anInt909 == 0) {
				local23 = Class19.aClass19Array1[arg0.anInt906];
				arg0.anInt908++;
				while (arg0.anInt907 < local23.anInt530 && arg0.anInt908 > local23.anIntArray188[arg0.anInt907]) {
					arg0.anInt908 -= local23.anIntArray188[arg0.anInt907];
					arg0.anInt907++;
				}
				if (arg0.anInt907 >= local23.anInt530) {
					arg0.anInt907 -= local23.anInt531;
					arg0.anInt910++;
					if (arg0.anInt910 >= local23.anInt535) {
						arg0.anInt906 = -1;
					}
					if (arg0.anInt907 < 0 || arg0.anInt907 >= local23.anInt530) {
						arg0.anInt906 = -1;
					}
				}
				arg0.aBoolean186 = local23.aBoolean133;
			}
			if (arg0.anInt909 > 0) {
				arg0.anInt909--;
			}
			if (arg0.anInt911 != -1 && anInt332 >= arg0.anInt914) {
				if (arg0.anInt912 < 0) {
					arg0.anInt912 = 0;
				}
				local23 = Class21.aClass21Array1[arg0.anInt911].aClass19_1;
				arg0.anInt913++;
				while (arg0.anInt912 < local23.anInt530 && arg0.anInt913 > local23.anIntArray188[arg0.anInt912]) {
					arg0.anInt913 -= local23.anIntArray188[arg0.anInt912];
					arg0.anInt912++;
				}
				if (arg0.anInt912 >= local23.anInt530) {
					if (arg0.anInt912 < 0 || arg0.anInt912 >= local23.anInt530) {
						arg0.anInt911 = -1;
					}
					return;
				}
			}
		} catch (@Pc(236) RuntimeException local236) {
			signlink.reporterror("48625, " + arg0 + ", " + arg1 + ", " + local236.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method191() {
		try {
			if (this.aBoolean71) {
				this.aBoolean71 = false;
				this.aClass32_3.method456(11, 0, super.aGraphics2);
				this.aClass32_4.method456(375, 0, super.aGraphics2);
				this.aClass32_5.method456(5, 729, super.aGraphics2);
				this.aClass32_6.method456(231, 752, super.aGraphics2);
				this.aClass32_7.method456(0, 0, super.aGraphics2);
				this.aClass32_8.method456(0, 561, super.aGraphics2);
				this.aClass32_9.method456(11, 520, super.aGraphics2);
				this.aClass32_10.method456(231, 520, super.aGraphics2);
				this.aClass32_11.method456(375, 501, super.aGraphics2);
				this.aClass32_12.method456(345, 0, super.aGraphics2);
				this.aBoolean44 = true;
				this.aBoolean43 = true;
				this.aBoolean42 = true;
				this.aBoolean54 = true;
				if (this.anInt185 != 2) {
					this.aClass32_18.method456(11, 8, super.aGraphics2);
					this.aClass32_17.method456(5, 561, super.aGraphics2);
				}
			}
			if (this.anInt185 == 2) {
				this.method79();
			}
			if (this.aBoolean63 && this.anInt287 == 1) {
				this.aBoolean44 = true;
			}
			@Pc(156) boolean local156;
			if (this.anInt241 != -1) {
				local156 = this.method176(this.anInt241, this.anInt294);
				if (local156) {
					this.aBoolean44 = true;
				}
			}
			if (this.anInt258 == 2) {
				this.aBoolean44 = true;
			}
			if (this.anInt272 == 2) {
				this.aBoolean44 = true;
			}
			if (this.aBoolean44) {
				this.method103(818);
				this.aBoolean44 = false;
			}
			if (this.anInt299 == -1) {
				this.aClass15_1.anInt470 = this.anInt300 - this.anInt230 - 77;
				if (super.anInt125 > 453 && super.anInt125 < 565 && super.anInt126 > 350) {
					this.method112(this.anInt318, 0, this.anInt300, super.anInt125 - 22, this.aClass15_1, super.anInt126 - 375, 77, 463, false);
				}
				@Pc(239) int local239 = this.anInt300 - this.aClass15_1.anInt470 - 77;
				if (local239 < 0) {
					local239 = 0;
				}
				if (local239 > this.anInt300 - 77) {
					local239 = this.anInt300 - 77;
				}
				if (this.anInt230 != local239) {
					this.anInt230 = local239;
					this.aBoolean43 = true;
				}
				anInt233++;
				if (anInt233 > 87) {
					anInt233 = 0;
					this.aClass1_Sub3_Sub3_5.method372(225);
				}
			}
			if (this.anInt299 != -1) {
				local156 = this.method176(this.anInt299, this.anInt294);
				if (local156) {
					this.aBoolean43 = true;
				}
			}
			if (this.anInt258 == 3) {
				this.aBoolean43 = true;
			}
			if (this.anInt272 == 3) {
				this.aBoolean43 = true;
			}
			if (this.aString7 != null) {
				this.aBoolean43 = true;
			}
			if (this.aBoolean63 && this.anInt287 == 2) {
				this.aBoolean43 = true;
			}
			if (this.aBoolean43) {
				this.method131();
				this.aBoolean43 = false;
			}
			if (this.anInt185 == 2) {
				this.method106();
				this.aClass32_17.method456(5, 561, super.aGraphics2);
			}
			if (this.anInt140 != -1) {
				this.aBoolean42 = true;
			}
			if (this.aBoolean42) {
				if (this.anInt140 != -1 && this.anInt140 == this.anInt197) {
					this.anInt140 = -1;
					this.aClass1_Sub3_Sub3_5.method372(50);
					this.aClass1_Sub3_Sub3_5.method373(this.anInt197);
				}
				this.aBoolean42 = false;
				this.aClass32_15.method455();
				this.aClass1_Sub3_Sub2_Sub3_5.method346(0, 0);
				if (this.anInt241 == -1) {
					if (this.anIntArray57[this.anInt197] != -1) {
						if (this.anInt197 == 0) {
							this.aClass1_Sub3_Sub2_Sub3_16.method346(30, 29);
						}
						if (this.anInt197 == 1) {
							this.aClass1_Sub3_Sub2_Sub3_17.method346(29, 59);
						}
						if (this.anInt197 == 2) {
							this.aClass1_Sub3_Sub2_Sub3_17.method346(29, 87);
						}
						if (this.anInt197 == 3) {
							this.aClass1_Sub3_Sub2_Sub3_18.method346(29, 115);
						}
						if (this.anInt197 == 4) {
							this.aClass1_Sub3_Sub2_Sub3_20.method346(29, 156);
						}
						if (this.anInt197 == 5) {
							this.aClass1_Sub3_Sub2_Sub3_20.method346(29, 184);
						}
						if (this.anInt197 == 6) {
							this.aClass1_Sub3_Sub2_Sub3_19.method346(30, 212);
						}
					}
					if (this.anIntArray57[0] != -1 && (this.anInt140 != 0 || anInt332 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array1[0].method346(34, 35);
					}
					if (this.anIntArray57[1] != -1 && (this.anInt140 != 1 || anInt332 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array1[1].method346(32, 59);
					}
					if (this.anIntArray57[2] != -1 && (this.anInt140 != 2 || anInt332 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array1[2].method346(32, 86);
					}
					if (this.anIntArray57[3] != -1 && (this.anInt140 != 3 || anInt332 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array1[3].method346(33, 121);
					}
					if (this.anIntArray57[4] != -1 && (this.anInt140 != 4 || anInt332 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array1[4].method346(34, 157);
					}
					if (this.anIntArray57[5] != -1 && (this.anInt140 != 5 || anInt332 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array1[5].method346(32, 185);
					}
					if (this.anIntArray57[6] != -1 && (this.anInt140 != 6 || anInt332 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array1[6].method346(34, 212);
					}
				}
				this.aClass32_15.method456(165, 520, super.aGraphics2);
				this.aClass32_14.method455();
				this.aClass1_Sub3_Sub2_Sub3_4.method346(0, 0);
				if (this.anInt241 == -1) {
					if (this.anIntArray57[this.anInt197] != -1) {
						if (this.anInt197 == 7) {
							this.aClass1_Sub3_Sub2_Sub3_6.method346(0, 49);
						}
						if (this.anInt197 == 8) {
							this.aClass1_Sub3_Sub2_Sub3_7.method346(0, 81);
						}
						if (this.anInt197 == 9) {
							this.aClass1_Sub3_Sub2_Sub3_7.method346(0, 108);
						}
						if (this.anInt197 == 10) {
							this.aClass1_Sub3_Sub2_Sub3_8.method346(1, 136);
						}
						if (this.anInt197 == 11) {
							this.aClass1_Sub3_Sub2_Sub3_10.method346(0, 178);
						}
						if (this.anInt197 == 12) {
							this.aClass1_Sub3_Sub2_Sub3_10.method346(0, 205);
						}
						if (this.anInt197 == 13) {
							this.aClass1_Sub3_Sub2_Sub3_9.method346(0, 233);
						}
					}
					if (this.anIntArray57[8] != -1 && (this.anInt140 != 8 || anInt332 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array1[7].method346(2, 80);
					}
					if (this.anIntArray57[9] != -1 && (this.anInt140 != 9 || anInt332 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array1[8].method346(3, 107);
					}
					if (this.anIntArray57[10] != -1 && (this.anInt140 != 10 || anInt332 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array1[9].method346(4, 142);
					}
					if (this.anIntArray57[11] != -1 && (this.anInt140 != 11 || anInt332 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array1[10].method346(2, 179);
					}
					if (this.anIntArray57[12] != -1 && (this.anInt140 != 12 || anInt332 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array1[11].method346(2, 206);
					}
					if (this.anIntArray57[13] != -1 && (this.anInt140 != 13 || anInt332 % 20 < 10)) {
						this.aClass1_Sub3_Sub2_Sub3Array1[12].method346(2, 230);
					}
				}
				this.aClass32_14.method456(492, 501, super.aGraphics2);
				this.aClass32_18.method455();
			}
			if (this.aBoolean54) {
				this.aBoolean54 = false;
				this.aClass32_13.method455();
				this.aClass1_Sub3_Sub2_Sub3_3.method346(0, 0);
				this.aClass1_Sub3_Sub2_Sub4_2.method359("Public chat", 33, 16777215, true, 57);
				if (this.anInt164 == 0) {
					this.aClass1_Sub3_Sub2_Sub4_2.method359("On", 46, 65280, true, 57);
				}
				if (this.anInt164 == 1) {
					this.aClass1_Sub3_Sub2_Sub4_2.method359("Friends", 46, 16776960, true, 57);
				}
				if (this.anInt164 == 2) {
					this.aClass1_Sub3_Sub2_Sub4_2.method359("Off", 46, 16711680, true, 57);
				}
				if (this.anInt164 == 3) {
					this.aClass1_Sub3_Sub2_Sub4_2.method359("Hide", 46, 65535, true, 57);
				}
				this.aClass1_Sub3_Sub2_Sub4_2.method359("Private chat", 33, 16777215, true, 186);
				if (this.anInt199 == 0) {
					this.aClass1_Sub3_Sub2_Sub4_2.method359("On", 46, 65280, true, 186);
				}
				if (this.anInt199 == 1) {
					this.aClass1_Sub3_Sub2_Sub4_2.method359("Friends", 46, 16776960, true, 186);
				}
				if (this.anInt199 == 2) {
					this.aClass1_Sub3_Sub2_Sub4_2.method359("Off", 46, 16711680, true, 186);
				}
				this.aClass1_Sub3_Sub2_Sub4_2.method359("Trade/duel", 33, 16777215, true, 326);
				if (this.anInt250 == 0) {
					this.aClass1_Sub3_Sub2_Sub4_2.method359("On", 46, 65280, true, 326);
				}
				if (this.anInt250 == 1) {
					this.aClass1_Sub3_Sub2_Sub4_2.method359("Friends", 46, 16776960, true, 326);
				}
				if (this.anInt250 == 2) {
					this.aClass1_Sub3_Sub2_Sub4_2.method359("Off", 46, 16711680, true, 326);
				}
				this.aClass1_Sub3_Sub2_Sub4_2.method359("Report abuse", 38, 16777215, true, 462);
				this.aClass32_13.method456(471, 0, super.aGraphics2);
				this.aClass32_18.method455();
			}
			this.anInt294 = 0;
		} catch (@Pc(1079) RuntimeException local1079) {
			signlink.reporterror("99573, " + 0 + ", " + local1079.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
	private void method192() {
		try {
			@Pc(8) byte[] local8 = this.aClass39_1.method528(aByte22, "title.dat", null);
			@Pc(14) Class1_Sub3_Sub2_Sub2 local14 = new Class1_Sub3_Sub2_Sub2(local8, this);
			this.aClass32_23.method455();
			local14.method317(0, 0);
			this.aClass32_24.method455();
			local14.method317(0, -661);
			this.aClass32_20.method455();
			local14.method317(0, -128);
			this.aClass32_21.method455();
			local14.method317(-386, -214);
			this.aClass32_22.method455();
			local14.method317(-186, -214);
			this.aClass32_25.method455();
			local14.method317(-265, 0);
			this.aClass32_26.method455();
			local14.method317(-265, -574);
			this.aClass32_27.method455();
			local14.method317(-186, -128);
			this.aClass32_28.method455();
			local14.method317(-186, -574);
			@Pc(99) int[] local99 = new int[local14.anInt451];
			for (@Pc(101) int local101 = 0; local101 < local14.anInt452; local101++) {
				for (@Pc(105) int local105 = 0; local105 < local14.anInt451; local105++) {
					local99[local105] = local14.anIntArray148[local14.anInt451 + local14.anInt451 * local101 - local105 - 1];
				}
				for (@Pc(131) int local131 = 0; local131 < local14.anInt451; local131++) {
					local14.anIntArray148[local131 + local14.anInt451 * local101] = local99[local131];
				}
			}
			this.aClass32_23.method455();
			local14.method317(0, 394);
			this.aClass32_24.method455();
			local14.method317(0, -267);
			this.aClass32_20.method455();
			local14.method317(0, 266);
			this.aClass32_21.method455();
			local14.method317(-386, 180);
			this.aClass32_22.method455();
			local14.method317(-186, 180);
			this.aClass32_25.method455();
			local14.method317(-265, 394);
			this.aClass32_26.method455();
			local14.method317(-265, -180);
			this.aClass32_27.method455();
			local14.method317(-186, 212);
			this.aClass32_28.method455();
			local14.method317(-186, -180);
			local14 = new Class1_Sub3_Sub2_Sub2(this.aClass39_1, "logo", 0);
			this.aClass32_20.method455();
			local14.method319(18, super.anInt121 / 2 - local14.anInt451 / 2 - 128);
			System.gc();
		} catch (@Pc(277) RuntimeException local277) {
			signlink.reporterror("71162, " + false + ", " + local277.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method68() {
		try {
			if (!this.aBoolean56 && !this.aBoolean50 && !this.aBoolean73) {
				anInt332++;
				if (this.aBoolean72) {
					this.method102();
				} else {
					this.method123();
				}
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("605, " + true + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method193() {
		try {
			@Pc(7) int local7 = this.aClass1_Sub3_Sub2_Sub4_3.method360("Choose Option");
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt153; local9++) {
				local20 = this.aClass1_Sub3_Sub2_Sub4_3.method360(this.aStringArray9[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			if (this.anInt201 > 9 || this.anInt201 < 9) {
				this.aClass1_Sub3_Sub3_5.method373(215);
			}
			local7 += 8;
			local20 = this.anInt153 * 15 + 21;
			@Pc(75) int local75;
			@Pc(93) int local93;
			if (super.anInt128 > 8 && super.anInt129 > 11 && super.anInt128 < 520 && super.anInt129 < 345) {
				local75 = super.anInt128 - local7 / 2 - 8;
				if (local75 + local7 > 512) {
					local75 = 512 - local7;
				}
				if (local75 < 0) {
					local75 = 0;
				}
				local93 = super.anInt129 - 11;
				if (local93 + local20 > 334) {
					local93 = 334 - local20;
				}
				if (local93 < 0) {
					local93 = 0;
				}
				this.aBoolean63 = true;
				this.anInt287 = 0;
				this.anInt288 = local75;
				this.anInt289 = local93;
				this.anInt290 = local7;
				this.anInt291 = this.anInt153 * 15 + 22;
			}
			if (super.anInt128 > 562 && super.anInt129 > 231 && super.anInt128 < 752 && super.anInt129 < 492) {
				local75 = super.anInt128 - local7 / 2 - 562;
				if (local75 < 0) {
					local75 = 0;
				} else if (local75 + local7 > 190) {
					local75 = 190 - local7;
				}
				local93 = super.anInt129 - 231;
				if (local93 < 0) {
					local93 = 0;
				} else if (local93 + local20 > 261) {
					local93 = 261 - local20;
				}
				this.aBoolean63 = true;
				this.anInt287 = 1;
				this.anInt288 = local75;
				this.anInt289 = local93;
				this.anInt290 = local7;
				this.anInt291 = this.anInt153 * 15 + 22;
			}
			if (super.anInt128 > 22 && super.anInt129 > 375 && super.anInt128 < 501 && super.anInt129 < 471) {
				local75 = super.anInt128 - local7 / 2 - 22;
				if (local75 < 0) {
					local75 = 0;
				} else if (local75 + local7 > 479) {
					local75 = 479 - local7;
				}
				local93 = super.anInt129 - 375;
				if (local93 < 0) {
					local93 = 0;
				} else if (local93 + local20 > 96) {
					local93 = 96 - local20;
				}
				this.aBoolean63 = true;
				this.anInt287 = 2;
				this.anInt288 = local75;
				this.anInt289 = local93;
				this.anInt290 = local7;
				this.anInt291 = this.anInt153 * 15 + 22;
			}
		} catch (@Pc(297) RuntimeException local297) {
			signlink.reporterror("56569, " + 9 + ", " + local297.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method194(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = true;
			if (this.anInt153 >= 2 || this.anInt193 != 0 || this.anInt319 != 0) {
				@Pc(35) String local35;
				if (this.anInt193 == 1 && this.anInt153 < 2) {
					local35 = "Use " + this.aString5 + " with...";
				} else if (this.anInt319 == 1 && this.anInt153 < 2) {
					local35 = this.aString15 + "...";
				} else {
					local35 = this.aStringArray9[this.anInt153 - 1];
				}
				if (this.anInt153 > 2) {
					local35 = local35 + "@whi@ / " + (this.anInt153 - 2) + " more options";
				}
				this.aClass1_Sub3_Sub2_Sub4_3.method363(local35, 16777215, 4, true, 15);
			}
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("74315, " + arg0 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method195(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) Class15 local3 = Class15.aClass15Array1[arg0];
			for (@Pc(5) int local5 = 0; local5 < local3.anIntArray153.length && local3.anIntArray153[local5] != -1; local5++) {
				@Pc(20) Class15 local20 = Class15.aClass15Array1[local3.anIntArray153[local5]];
				if (local20.anInt461 == 1) {
					this.method195(local20.anInt459);
				}
				local20.anInt457 = 0;
				local20.anInt458 = 0;
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("47463, " + arg0 + ", " + 972 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZII)V")
	private void method196(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(1) int local1 = 0;
			this.aBoolean72 &= true;
			for (@Pc(9) int local9 = 0; local9 < 100; local9++) {
				if (this.aStringArray6[local9] != null) {
					@Pc(21) int local21 = this.anIntArray31[local9];
					@Pc(32) int local32 = this.anInt230 + 70 + 4 - local1 * 14;
					if (local32 < -20) {
						break;
					}
					if (local21 == 0) {
						local1++;
					}
					if ((local21 == 1 || local21 == 2) && (local21 == 1 || this.anInt164 == 0 || this.anInt164 == 1 && this.method156(this.aStringArray5[local9]))) {
						if (arg0 > local32 - 14 && arg0 <= local32 && !this.aStringArray5[local9].equals(this.aClass1_Sub1_Sub3_Sub2_1.aString30)) {
							if (this.aBoolean75) {
								this.aStringArray9[this.anInt153] = "Report abuse @whi@" + this.aStringArray5[local9];
								this.anIntArray60[this.anInt153] = 316;
								this.anInt153++;
							}
							this.aStringArray9[this.anInt153] = "Add ignore @whi@" + this.aStringArray5[local9];
							this.anIntArray60[this.anInt153] = 158;
							this.anInt153++;
							this.aStringArray9[this.anInt153] = "Add friend @whi@" + this.aStringArray5[local9];
							this.anIntArray60[this.anInt153] = 447;
							this.anInt153++;
						}
						local1++;
					}
					if ((local21 == 3 || local21 == 7) && this.anInt268 == 0 && (local21 == 7 || this.anInt199 == 0 || this.anInt199 == 1 && this.method156(this.aStringArray5[local9]))) {
						if (arg0 > local32 - 14 && arg0 <= local32) {
							if (this.aBoolean75) {
								this.aStringArray9[this.anInt153] = "Report abuse @whi@" + this.aStringArray5[local9];
								this.anIntArray60[this.anInt153] = 316;
								this.anInt153++;
							}
							this.aStringArray9[this.anInt153] = "Add ignore @whi@" + this.aStringArray5[local9];
							this.anIntArray60[this.anInt153] = 158;
							this.anInt153++;
							this.aStringArray9[this.anInt153] = "Add friend @whi@" + this.aStringArray5[local9];
							this.anIntArray60[this.anInt153] = 447;
							this.anInt153++;
						}
						local1++;
					}
					if (local21 == 4 && (this.anInt250 == 0 || this.anInt250 == 1 && this.method156(this.aStringArray5[local9]))) {
						if (arg0 > local32 - 14 && arg0 <= local32) {
							this.aStringArray9[this.anInt153] = "Accept trade @whi@" + this.aStringArray5[local9];
							this.anIntArray60[this.anInt153] = 595;
							this.anInt153++;
						}
						local1++;
					}
					if ((local21 == 5 || local21 == 6) && this.anInt268 == 0 && this.anInt199 < 2) {
						local1++;
					}
					if (local21 == 8 && (this.anInt250 == 0 || this.anInt250 == 1 && this.method156(this.aStringArray5[local9]))) {
						if (arg0 > local32 - 14 && arg0 <= local32) {
							this.aStringArray9[this.anInt153] = "Accept duel @whi@" + this.aStringArray5[local9];
							this.anIntArray60[this.anInt153] = 835;
							this.anInt153++;
						}
						local1++;
					}
				}
			}
		} catch (@Pc(412) RuntimeException local412) {
			signlink.reporterror("41966, " + true + ", " + arg0 + ", " + arg1 + ", " + local412.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)Ljava/lang/String;")
	private String method197(@OriginalArg(0) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("18547, " + arg0 + ", " + 21690 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZIIIIIIIIII)Z")
	private boolean method198(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray5[local7][local11] = 0;
					this.anIntArrayArray2[local7][local11] = 99999999;
				}
			}
			@Pc(39) boolean local39 = false;
			local11 = arg3;
			@Pc(43) int local43 = arg5;
			this.anIntArrayArray5[arg3][arg5] = 99;
			this.anIntArrayArray2[arg3][arg5] = 0;
			@Pc(59) byte local59 = 0;
			@Pc(61) int local61 = 0;
			this.anIntArray86[0] = arg3;
			@Pc(70) int local70 = local59 + 1;
			this.anIntArray87[0] = arg5;
			@Pc(74) boolean local74 = false;
			@Pc(78) int local78 = this.anIntArray86.length;
			@Pc(85) int[][] local85 = this.aClass9Array1[this.anInt337].anIntArrayArray10;
			@Pc(197) int local197;
			while (local61 != local70) {
				local11 = this.anIntArray86[local61];
				local43 = this.anIntArray87[local61];
				local61 = (local61 + 1) % local78;
				if (local11 == arg9 && local43 == arg4) {
					local74 = true;
					break;
				}
				if (arg0 != 0) {
					if ((arg0 < 5 || arg0 == 10) && this.aClass9Array1[this.anInt337].method257(arg4, arg9, local43, 928, arg8, local11, arg0 - 1)) {
						local74 = true;
						break;
					}
					if (arg0 < 10 && this.aClass9Array1[this.anInt337].method258(arg9, local43, this.aByte23, arg8, arg4, local11, arg0 - 1)) {
						local74 = true;
						break;
					}
				}
				if (arg11 != 0 && arg10 != 0 && this.aClass9Array1[this.anInt337].method259(local11, local43, arg4, arg9, arg7, arg10, arg11)) {
					local74 = true;
					break;
				}
				local197 = this.anIntArrayArray2[local11][local43] + 1;
				if (local11 > 0 && this.anIntArrayArray5[local11 - 1][local43] == 0 && (local85[local11 - 1][local43] & 0x280108) == 0) {
					this.anIntArray86[local70] = local11 - 1;
					this.anIntArray87[local70] = local43;
					local70 = (local70 + 1) % local78;
					this.anIntArrayArray5[local11 - 1][local43] = 2;
					this.anIntArrayArray2[local11 - 1][local43] = local197;
				}
				if (local11 < 103 && this.anIntArrayArray5[local11 + 1][local43] == 0 && (local85[local11 + 1][local43] & 0x280180) == 0) {
					this.anIntArray86[local70] = local11 + 1;
					this.anIntArray87[local70] = local43;
					local70 = (local70 + 1) % local78;
					this.anIntArrayArray5[local11 + 1][local43] = 8;
					this.anIntArrayArray2[local11 + 1][local43] = local197;
				}
				if (local43 > 0 && this.anIntArrayArray5[local11][local43 - 1] == 0 && (local85[local11][local43 - 1] & 0x280102) == 0) {
					this.anIntArray86[local70] = local11;
					this.anIntArray87[local70] = local43 - 1;
					local70 = (local70 + 1) % local78;
					this.anIntArrayArray5[local11][local43 - 1] = 1;
					this.anIntArrayArray2[local11][local43 - 1] = local197;
				}
				if (local43 < 103 && this.anIntArrayArray5[local11][local43 + 1] == 0 && (local85[local11][local43 + 1] & 0x280120) == 0) {
					this.anIntArray86[local70] = local11;
					this.anIntArray87[local70] = local43 + 1;
					local70 = (local70 + 1) % local78;
					this.anIntArrayArray5[local11][local43 + 1] = 4;
					this.anIntArrayArray2[local11][local43 + 1] = local197;
				}
				if (local11 > 0 && local43 > 0 && this.anIntArrayArray5[local11 - 1][local43 - 1] == 0 && (local85[local11 - 1][local43 - 1] & 0x28010E) == 0 && (local85[local11 - 1][local43] & 0x280108) == 0 && (local85[local11][local43 - 1] & 0x280102) == 0) {
					this.anIntArray86[local70] = local11 - 1;
					this.anIntArray87[local70] = local43 - 1;
					local70 = (local70 + 1) % local78;
					this.anIntArrayArray5[local11 - 1][local43 - 1] = 3;
					this.anIntArrayArray2[local11 - 1][local43 - 1] = local197;
				}
				if (local11 < 103 && local43 > 0 && this.anIntArrayArray5[local11 + 1][local43 - 1] == 0 && (local85[local11 + 1][local43 - 1] & 0x280183) == 0 && (local85[local11 + 1][local43] & 0x280180) == 0 && (local85[local11][local43 - 1] & 0x280102) == 0) {
					this.anIntArray86[local70] = local11 + 1;
					this.anIntArray87[local70] = local43 - 1;
					local70 = (local70 + 1) % local78;
					this.anIntArrayArray5[local11 + 1][local43 - 1] = 9;
					this.anIntArrayArray2[local11 + 1][local43 - 1] = local197;
				}
				if (local11 > 0 && local43 < 103 && this.anIntArrayArray5[local11 - 1][local43 + 1] == 0 && (local85[local11 - 1][local43 + 1] & 0x280138) == 0 && (local85[local11 - 1][local43] & 0x280108) == 0 && (local85[local11][local43 + 1] & 0x280120) == 0) {
					this.anIntArray86[local70] = local11 - 1;
					this.anIntArray87[local70] = local43 + 1;
					local70 = (local70 + 1) % local78;
					this.anIntArrayArray5[local11 - 1][local43 + 1] = 6;
					this.anIntArrayArray2[local11 - 1][local43 + 1] = local197;
				}
				if (local11 < 103 && local43 < 103 && this.anIntArrayArray5[local11 + 1][local43 + 1] == 0 && (local85[local11 + 1][local43 + 1] & 0x2801E0) == 0 && (local85[local11 + 1][local43] & 0x280180) == 0 && (local85[local11][local43 + 1] & 0x280120) == 0) {
					this.anIntArray86[local70] = local11 + 1;
					this.anIntArray87[local70] = local43 + 1;
					local70 = (local70 + 1) % local78;
					this.anIntArrayArray5[local11 + 1][local43 + 1] = 12;
					this.anIntArrayArray2[local11 + 1][local43 + 1] = local197;
				}
			}
			this.anInt135 = 0;
			@Pc(813) int local813;
			@Pc(819) int local819;
			@Pc(825) int local825;
			if (!local74) {
				if (arg1) {
					local197 = 100;
					for (local813 = 1; local813 < 2; local813++) {
						for (local819 = arg9 - local813; local819 <= arg9 + local813; local819++) {
							for (local825 = arg4 - local813; local825 <= arg4 + local813; local825++) {
								if (local819 >= 0 && local825 >= 0 && local819 < 104 && local825 < 104 && this.anIntArrayArray2[local819][local825] < local197) {
									local197 = this.anIntArrayArray2[local819][local825];
									local11 = local819;
									local43 = local825;
									this.anInt135 = 1;
									local74 = true;
								}
							}
						}
						if (local74) {
							break;
						}
					}
				}
				if (!local74) {
					return false;
				}
			}
			@Pc(886) byte local886 = 0;
			this.anIntArray86[0] = local11;
			local61 = local886 + 1;
			this.anIntArray87[0] = local43;
			local197 = local813 = this.anIntArrayArray5[local11][local43];
			while (local11 != arg3 || local43 != arg5) {
				if (local197 != local813) {
					local813 = local197;
					this.anIntArray86[local61] = local11;
					this.anIntArray87[local61++] = local43;
				}
				if ((local197 & 0x2) != 0) {
					local11++;
				} else if ((local197 & 0x8) != 0) {
					local11--;
				}
				if ((local197 & 0x1) != 0) {
					local43++;
				} else if ((local197 & 0x4) != 0) {
					local43--;
				}
				local197 = this.anIntArrayArray5[local11][local43];
			}
			if (local61 > 0) {
				local78 = local61;
				if (local61 > 25) {
					local78 = 25;
				}
				local61--;
				local819 = this.anIntArray86[local61];
				local825 = this.anIntArray87[local61];
				anInt174 += local78;
				if (anInt174 >= 121) {
					this.aClass1_Sub3_Sub3_5.method372(215);
					this.aClass1_Sub3_Sub3_5.method374(19217);
				}
				if (arg2 == 0) {
					this.aClass1_Sub3_Sub3_5.method372(74);
					this.aClass1_Sub3_Sub3_5.method373(local78 + local78 + 3);
				}
				if (arg2 == 1) {
					this.aClass1_Sub3_Sub3_5.method372(37);
					this.aClass1_Sub3_Sub3_5.method373(local78 + local78 + 3 + 14);
				}
				if (arg2 == 2) {
					this.aClass1_Sub3_Sub3_5.method372(73);
					this.aClass1_Sub3_Sub3_5.method373(local78 + local78 + 3);
				}
				if (super.anIntArray28[5] == 1) {
					this.aClass1_Sub3_Sub3_5.method373(1);
				} else {
					this.aClass1_Sub3_Sub3_5.method373(0);
				}
				this.aClass1_Sub3_Sub3_5.method374(local819 + this.anInt295);
				this.aClass1_Sub3_Sub3_5.method374(local825 + this.anInt296);
				this.anInt279 = this.anIntArray86[0];
				this.anInt280 = this.anIntArray87[0];
				for (@Pc(1090) int local1090 = 1; local1090 < local78; local1090++) {
					local61--;
					this.aClass1_Sub3_Sub3_5.method373(this.anIntArray86[local61] - local819);
					this.aClass1_Sub3_Sub3_5.method373(this.anIntArray87[local61] - local825);
				}
				return true;
			} else if (arg2 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1125) RuntimeException local1125) {
			signlink.reporterror("29718, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local1125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(II)V")
	private void method199(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) int local4 = Class23.aClass23Array1[arg0].anInt593;
			if (local4 != 0) {
				@Pc(12) int local12 = this.anIntArray41[arg0];
				if (local4 == 1) {
					if (local12 == 1) {
						Class1_Sub3_Sub2_Sub1.method294(0.9D);
					}
					if (local12 == 2) {
						Class1_Sub3_Sub2_Sub1.method294(0.8D);
					}
					if (local12 == 3) {
						Class1_Sub3_Sub2_Sub1.method294(0.7D);
					}
					if (local12 == 4) {
						Class1_Sub3_Sub2_Sub1.method294(0.6D);
					}
					Class5.aClass35_5.method521();
					this.aBoolean71 = true;
				}
				if (local4 == 3) {
					@Pc(54) boolean local54 = this.aBoolean58;
					if (local12 == 0) {
						this.method84((byte) 6, 0, this.aBoolean58);
						this.aBoolean58 = true;
					}
					if (local12 == 1) {
						this.method84((byte) 6, -400, this.aBoolean58);
						this.aBoolean58 = true;
					}
					if (local12 == 2) {
						this.method84((byte) 6, -800, this.aBoolean58);
						this.aBoolean58 = true;
					}
					if (local12 == 3) {
						this.method84((byte) 6, -1200, this.aBoolean58);
						this.aBoolean58 = true;
					}
					if (local12 == 4) {
						this.aBoolean58 = false;
					}
					if (this.aBoolean58 != local54) {
						if (this.aBoolean58) {
							this.method171(this.anInt216, this.aString17, this.anInt281);
						} else {
							this.method182();
						}
						this.anInt253 = 0;
					}
				}
				if (local4 == 4) {
					if (local12 == 0) {
						this.aBoolean64 = true;
						this.method119(0);
					}
					if (local12 == 1) {
						this.aBoolean64 = true;
						this.method119(-400);
					}
					if (local12 == 2) {
						this.aBoolean64 = true;
						this.method119(-800);
					}
					if (local12 == 3) {
						this.aBoolean64 = true;
						this.method119(-1200);
					}
					if (local12 == 4) {
						this.aBoolean64 = false;
					}
				}
				if (local4 == 5) {
					this.anInt221 = local12;
				}
				if (local4 == 6) {
					this.anInt152 = local12;
				}
				if (local4 == 8) {
					this.anInt268 = local12;
					this.aBoolean43 = true;
				}
			}
		} catch (@Pc(202) RuntimeException local202) {
			signlink.reporterror("98659, " + 0 + ", " + arg0 + ", " + local202.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method200() {
		try {
			while (true) {
				@Pc(15) int local15 = this.method66();
				if (local15 == -1) {
					return;
				}
				if (this.anInt220 != -1 && this.anInt220 == this.anInt235) {
					if (local15 == 8 && this.aString14.length() > 0) {
						this.aString14 = this.aString14.substring(0, this.aString14.length() - 1);
					}
					if ((local15 >= 97 && local15 <= 122 || local15 >= 65 && local15 <= 90 || local15 >= 48 && local15 <= 57 || local15 == 32) && this.aString14.length() < 12) {
						this.aString14 = this.aString14 + (char) local15;
					}
				} else {
					@Pc(195) int local195;
					if (this.aBoolean65) {
						if (local15 >= 32 && local15 <= 122 && this.aString11.length() < 80) {
							this.aString11 = this.aString11 + (char) local15;
							this.aBoolean43 = true;
						}
						if (local15 == 8 && this.aString11.length() > 0) {
							this.aString11 = this.aString11.substring(0, this.aString11.length() - 1);
							this.aBoolean43 = true;
						}
						if (local15 == 13 || local15 == 10) {
							this.aBoolean65 = false;
							this.aBoolean43 = true;
							@Pc(155) long local155;
							if (this.anInt142 == 1) {
								local155 = Class40.method530(this.aString11);
								this.method124(local155);
							}
							if (this.anInt142 == 2 && this.anInt267 > 0) {
								local155 = Class40.method530(this.aString11);
								this.method129(local155);
							}
							if (this.anInt142 == 3 && this.aString11.length() > 0) {
								this.aClass1_Sub3_Sub3_5.method372(6);
								this.aClass1_Sub3_Sub3_5.method373(0);
								local195 = this.aClass1_Sub3_Sub3_5.anInt548;
								this.aClass1_Sub3_Sub3_5.method379(this.aLong9);
								Class41.method538(this.aClass1_Sub3_Sub3_5, this.aString11);
								this.aClass1_Sub3_Sub3_5.method382(this.aClass1_Sub3_Sub3_5.anInt548 - local195);
								this.aString11 = Class40.method535(this.aString11);
								this.aString11 = Class25.method416(this.aString11);
								this.method94(6, Class40.method534(Class40.method531(this.aLong9)), this.aString11);
								if (this.anInt199 == 2) {
									this.anInt199 = 1;
									this.aBoolean54 = true;
									this.aClass1_Sub3_Sub3_5.method372(197);
									this.aClass1_Sub3_Sub3_5.method373(this.anInt164);
									this.aClass1_Sub3_Sub3_5.method373(this.anInt199);
									this.aClass1_Sub3_Sub3_5.method373(this.anInt250);
								}
							}
							if (this.anInt142 == 4 && this.anInt202 < 100) {
								local155 = Class40.method530(this.aString11);
								this.method168(local155);
							}
							if (this.anInt142 == 5 && this.anInt202 > 0) {
								local155 = Class40.method530(this.aString11);
								this.method173(local155, this.aBoolean69);
							}
						}
					} else if (this.aBoolean46) {
						if (local15 >= 48 && local15 <= 57 && this.aString6.length() < 10) {
							this.aString6 = this.aString6 + (char) local15;
							this.aBoolean43 = true;
						}
						if (local15 == 8 && this.aString6.length() > 0) {
							this.aString6 = this.aString6.substring(0, this.aString6.length() - 1);
							this.aBoolean43 = true;
						}
						if (local15 == 13 || local15 == 10) {
							if (this.aString6.length() > 0) {
								local195 = 0;
								try {
									local195 = Integer.parseInt(this.aString6);
								} catch (@Pc(372) Exception local372) {
								}
								this.aClass1_Sub3_Sub3_5.method372(147);
								this.aClass1_Sub3_Sub3_5.method377(local195);
							}
							this.aBoolean46 = false;
							this.aBoolean43 = true;
						}
					} else if (this.anInt299 == -1) {
						if (local15 >= 32 && local15 <= 122 && this.aString4.length() < 80) {
							this.aString4 = this.aString4 + (char) local15;
							this.aBoolean43 = true;
						}
						if (local15 == 8 && this.aString4.length() > 0) {
							this.aString4 = this.aString4.substring(0, this.aString4.length() - 1);
							this.aBoolean43 = true;
						}
						if ((local15 == 13 || local15 == 10) && this.aString4.length() > 0) {
							if (this.aString4.equals("::clientdrop") && (super.aFrame_Sub1_2 != null || this.method157((byte) 7).indexOf("192.168.1.") != -1)) {
								this.method122(366);
							} else if (this.aString4.startsWith("::")) {
								this.aClass1_Sub3_Sub3_5.method372(251);
								this.aClass1_Sub3_Sub3_5.method373(this.aString4.length() - 1);
								this.aClass1_Sub3_Sub3_5.method380(this.aString4.substring(2));
							} else {
								@Pc(499) byte local499 = 0;
								if (this.aString4.startsWith("yellow:")) {
									local499 = 0;
									this.aString4 = this.aString4.substring(7);
								}
								if (this.aString4.startsWith("red:")) {
									local499 = 1;
									this.aString4 = this.aString4.substring(4);
								}
								if (this.aString4.startsWith("green:")) {
									local499 = 2;
									this.aString4 = this.aString4.substring(6);
								}
								if (this.aString4.startsWith("cyan:")) {
									local499 = 3;
									this.aString4 = this.aString4.substring(5);
								}
								if (this.aString4.startsWith("purple:")) {
									local499 = 4;
									this.aString4 = this.aString4.substring(7);
								}
								if (this.aString4.startsWith("white:")) {
									local499 = 5;
									this.aString4 = this.aString4.substring(6);
								}
								if (this.aString4.startsWith("flash1:")) {
									local499 = 6;
									this.aString4 = this.aString4.substring(7);
								}
								if (this.aString4.startsWith("flash2:")) {
									local499 = 7;
									this.aString4 = this.aString4.substring(7);
								}
								if (this.aString4.startsWith("flash3:")) {
									local499 = 8;
									this.aString4 = this.aString4.substring(7);
								}
								if (this.aString4.startsWith("glow1:")) {
									local499 = 9;
									this.aString4 = this.aString4.substring(6);
								}
								if (this.aString4.startsWith("glow2:")) {
									local499 = 10;
									this.aString4 = this.aString4.substring(6);
								}
								if (this.aString4.startsWith("glow3:")) {
									local499 = 11;
									this.aString4 = this.aString4.substring(6);
								}
								@Pc(657) byte local657 = 0;
								if (this.aString4.startsWith("wave:")) {
									local657 = 1;
									this.aString4 = this.aString4.substring(5);
								}
								if (this.aString4.startsWith("scroll:")) {
									local657 = 2;
									this.aString4 = this.aString4.substring(7);
								}
								this.aClass1_Sub3_Sub3_5.method372(42);
								this.aClass1_Sub3_Sub3_5.method373(0);
								@Pc(696) int local696 = this.aClass1_Sub3_Sub3_5.anInt548;
								this.aClass1_Sub3_Sub3_5.method373(local499);
								this.aClass1_Sub3_Sub3_5.method373(local657);
								Class41.method538(this.aClass1_Sub3_Sub3_5, this.aString4);
								this.aClass1_Sub3_Sub3_5.method382(this.aClass1_Sub3_Sub3_5.anInt548 - local696);
								this.aString4 = Class40.method535(this.aString4);
								this.aString4 = Class25.method416(this.aString4);
								this.aClass1_Sub1_Sub3_Sub2_1.aString29 = this.aString4;
								this.aClass1_Sub1_Sub3_Sub2_1.anInt893 = local499;
								this.aClass1_Sub1_Sub3_Sub2_1.anInt894 = local657;
								this.aClass1_Sub1_Sub3_Sub2_1.anInt892 = 150;
								this.method94(2, this.aClass1_Sub1_Sub3_Sub2_1.aString30, this.aClass1_Sub1_Sub3_Sub2_1.aString29);
								if (this.anInt164 == 2) {
									this.anInt164 = 3;
									this.aBoolean54 = true;
									this.aClass1_Sub3_Sub3_5.method372(197);
									this.aClass1_Sub3_Sub3_5.method373(this.anInt164);
									this.aClass1_Sub3_Sub3_5.method373(this.anInt199);
									this.aClass1_Sub3_Sub3_5.method373(this.anInt250);
								}
							}
							this.aString4 = "";
							this.aBoolean43 = true;
						}
					}
				}
			}
		} catch (@Pc(798) RuntimeException local798) {
			signlink.reporterror("11792, " + 1 + ", " + local798.toString());
			throw new RuntimeException();
		}
	}
}
