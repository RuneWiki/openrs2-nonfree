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

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	private static int anInt253;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private static int anInt260;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
	private static int anInt263;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
	private static int anInt269;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
	private static int anInt290;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
	public static int anInt292;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "Z")
	private static boolean aBoolean56;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
	private static int anInt301;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "I")
	private static int anInt315;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "I")
	private static int anInt316;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
	private static int anInt331;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "I")
	private static int anInt332;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "Z")
	private static boolean aBoolean70;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
	private static int anInt347;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "I")
	private static int anInt353;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "I")
	private static int anInt393;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "I")
	private static int anInt397;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "Z")
	private static boolean aBoolean83;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "I")
	private static int anInt408;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "Z")
	private static boolean aBoolean85;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
	private static int anInt427;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
	public static int anInt440;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "I")
	private static int anInt444;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "Lclient!bb;")
	public static Class1_Sub1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "I")
	private static int anInt286 = -258;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
	private static int anInt291 = 10;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "Z")
	private static boolean aBoolean55 = true;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "Ljava/lang/String;")
	private static String aString11 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@OriginalMember(owner = "client!client", name = "re", descriptor = "[[I")
	public static final int[][] anIntArrayArray3 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "[I")
	private static int[] anIntArray72 = new int[99];

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "[I")
	private static int[] anIntArray74;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
	private static int anInt417;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "[I")
	public static final int[] anIntArray93;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "I")
	private int anInt243;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
	private int anInt244;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "I")
	private int anInt245;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "I")
	private int anInt246;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "I")
	private int anInt247;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "Lclient!e;")
	private Class8 aClass8_1;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "I")
	private int anInt248;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "Lclient!vb;")
	private Class45_Sub1 aClass45_Sub1_1;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "I")
	private int anInt250;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	private int anInt251;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_1;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_2;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Lclient!s;")
	private Class39 aClass39_1;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	private int anInt252;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
	private int anInt254;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	private int anInt255;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
	private int anInt256;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
	private int anInt257;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
	private int anInt258;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "[Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array1;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "I")
	private int anInt262;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
	private int anInt264;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "I")
	private int anInt266;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
	private int anInt270;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
	private int anInt271;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
	private int anInt272;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "Ljava/lang/String;")
	private String aString8;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "Lclient!rb;")
	private Class37 aClass37_3;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "Lclient!rb;")
	private Class37 aClass37_4;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "Lclient!rb;")
	private Class37 aClass37_5;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "Lclient!rb;")
	private Class37 aClass37_6;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
	private int anInt276;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
	private int anInt277;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
	private int anInt278;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
	private int anInt279;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "I")
	private int anInt280;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
	private int anInt281;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
	private int anInt282;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
	private int anInt283;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
	private int anInt284;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "I")
	private int anInt285;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "Ljava/lang/String;")
	private String aString9;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "Lclient!rb;")
	private Class37 aClass37_7;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "Lclient!rb;")
	private Class37 aClass37_8;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "Lclient!rb;")
	private Class37 aClass37_9;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
	private int anInt287;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "I")
	private int anInt288;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
	private int anInt293;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_6;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_7;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_8;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
	private int anInt294;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
	private int anInt297;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "I")
	private int anInt298;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
	private int anInt299;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
	private int anInt300;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "I")
	private int anInt303;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "I")
	private int anInt304;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
	private int anInt305;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
	private int anInt307;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
	private int anInt308;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_9;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_10;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_11;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
	private int anInt309;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "Ljava/lang/String;")
	private String aString10;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "I")
	private int anInt310;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "I")
	private int anInt311;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "I")
	private int anInt312;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "Lclient!yb;")
	private Class48 aClass48_1;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "I")
	private int anInt314;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
	private int anInt318;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
	private int anInt319;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
	private int anInt320;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "I")
	private int anInt321;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
	private int anInt322;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "I")
	private int anInt323;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "I")
	private int anInt324;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "I")
	private int anInt326;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "I")
	private int anInt328;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "J")
	private long aLong16;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "I")
	private int anInt329;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "I")
	private int anInt333;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
	private int anInt334;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "[[B")
	private byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "I")
	private int anInt338;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
	private int anInt339;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
	private int anInt340;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "I")
	private int anInt341;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
	private int anInt342;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_1;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_2;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
	private int anInt344;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "[I")
	private int[] anIntArray54;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "[I")
	private int[] anIntArray55;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "Lclient!fc;")
	private Class11 aClass11_1;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
	private int anInt349;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private int anInt350;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private int anInt352;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "I")
	private int anInt354;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "I")
	private int anInt357;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
	private int anInt358;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "I")
	private int anInt359;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
	private int anInt360;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "J")
	private long aLong17;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
	private int anInt362;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "I")
	private int anInt364;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "I")
	private int anInt365;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_12;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_13;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_14;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_15;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_16;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "I")
	private int anInt368;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "[I")
	private int[] anIntArray65;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "[I")
	private int[] anIntArray66;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "[I")
	private int[] anIntArray67;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "[I")
	private int[] anIntArray68;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "[I")
	private int[] anIntArray69;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "[I")
	private int[] anIntArray70;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "[I")
	private int[] anIntArray71;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
	private int anInt369;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "I")
	private int anInt370;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
	private int anInt371;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "I")
	private int anInt372;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
	private int anInt373;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "I")
	private int anInt374;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
	private int anInt375;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
	private int anInt376;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
	private int anInt378;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "I")
	private int anInt379;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
	private int anInt380;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "I")
	private int anInt381;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "Ljava/lang/String;")
	private String aString13;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
	private int anInt382;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
	private int anInt384;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
	private int anInt385;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
	private int anInt386;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
	private int anInt387;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
	private int anInt388;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
	private int anInt389;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
	private int anInt390;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "I")
	private int anInt391;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
	private int anInt392;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "Lclient!xb;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "Lclient!rb;")
	private Class37 aClass37_10;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "Lclient!rb;")
	private Class37 aClass37_11;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "Lclient!rb;")
	private Class37 aClass37_12;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "Lclient!rb;")
	private Class37 aClass37_13;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "Lclient!rb;")
	private Class37 aClass37_14;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "Lclient!rb;")
	private Class37 aClass37_15;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "Lclient!rb;")
	private Class37 aClass37_16;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "Lclient!rb;")
	private Class37 aClass37_17;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "Lclient!rb;")
	private Class37 aClass37_18;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "I")
	private int anInt395;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "I")
	private int anInt396;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_6;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_7;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_8;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_9;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
	private int anInt399;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
	private int anInt401;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "I")
	private int anInt402;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
	private int anInt403;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "I")
	private int anInt404;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
	private int anInt405;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "I")
	private int anInt406;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "I")
	private int anInt407;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
	private int anInt410;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "I")
	private int anInt411;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
	private int anInt412;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
	private int anInt413;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_10;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_11;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "I")
	private int anInt414;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
	private int anInt415;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_17;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_18;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "[I")
	private int[] anIntArray88;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "[I")
	private int[] anIntArray89;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
	private int anInt416;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
	private int anInt418;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
	private int anInt419;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_12;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
	private int anInt420;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
	private int anInt421;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private int anInt422;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
	private int anInt423;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "I")
	private int anInt424;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
	private int anInt426;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_19;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_20;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "I")
	private int anInt431;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "I")
	private int anInt432;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "I")
	private int anInt433;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
	private int anInt434;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
	private int anInt435;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "I")
	private int anInt436;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
	private int anInt437;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
	private int anInt438;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
	private int anInt439;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "[I")
	private int[] anIntArray90;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "[I")
	private int[] anIntArray91;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "[I")
	private int[] anIntArray92;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "Lclient!rb;")
	private Class37 aClass37_19;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "Lclient!rb;")
	private Class37 aClass37_20;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "Lclient!rb;")
	private Class37 aClass37_21;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "Lclient!rb;")
	private Class37 aClass37_22;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "Lclient!rb;")
	private Class37 aClass37_23;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "Lclient!rb;")
	private Class37 aClass37_24;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "Lclient!rb;")
	private Class37 aClass37_25;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "Lclient!rb;")
	private Class37 aClass37_26;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "Lclient!rb;")
	private Class37 aClass37_27;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "I")
	private int anInt443;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "I")
	private int anInt445;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "I")
	private int anInt449;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "I")
	private int anInt450;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "I")
	private int anInt452;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "I")
	private int anInt453;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_13;

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "I")
	private int anInt454;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "Z")
	private boolean aBoolean45 = false;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "Z")
	private boolean aBoolean46 = true;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "[I")
	private int[] anIntArray34 = new int[5];

	@OriginalMember(owner = "client!client", name = "V", descriptor = "B")
	private byte aByte4 = 9;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "I")
	private int anInt249 = 2301979;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Ljava/lang/String;")
	private String aString5 = "";

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "[I")
	private int[] anIntArray35 = new int[Class29.anInt833];

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Ljava/lang/String;")
	private String aString6 = "";

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Ljava/lang/String;")
	private String aString7 = "";

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Z")
	private boolean aBoolean48 = true;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Z")
	private boolean aBoolean49 = false;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray1 = new String[200];

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "[I")
	private int[] anIntArray36 = new int[4000];

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "[I")
	private int[] anIntArray37 = new int[4000];

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "Z")
	private boolean aBoolean51 = false;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "Lclient!d;")
	private Class6 aClass6_1 = new Class6();

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
	private int anInt259 = 38729;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "B")
	private byte aByte5 = -81;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "Z")
	private boolean aBoolean52 = false;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "Z")
	private boolean aBoolean53 = false;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
	private int anInt261 = -1;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
	private int anInt265 = 50;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "[I")
	private int[] anIntArray38 = new int[this.anInt265];

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "[I")
	private int[] anIntArray39 = new int[this.anInt265];

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "[I")
	private int[] anIntArray40 = new int[this.anInt265];

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "[I")
	private int[] anIntArray41 = new int[this.anInt265];

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "[I")
	private int[] anIntArray42 = new int[this.anInt265];

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "[I")
	private int[] anIntArray43 = new int[this.anInt265];

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "[I")
	private int[] anIntArray44 = new int[this.anInt265];

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray2 = new String[this.anInt265];

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "Z")
	private boolean aBoolean54 = true;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
	private int anInt267 = -1;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
	private int anInt268 = -1;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
	private int anInt273 = 3891;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "I")
	private int anInt274 = -1;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "B")
	private byte aByte6 = 8;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "I")
	private int anInt275 = -1;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "[I")
	private int[] anIntArray45 = new int[100];

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray3 = new String[100];

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray4 = new String[100];

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "[I")
	private int[] anIntArray46 = new int[151];

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
	private int anInt289 = -171;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray5 = new String[5];

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "[Z")
	private boolean[] aBooleanArray4 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "[I")
	private int[] anIntArray47 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "Z")
	private boolean aBoolean57 = false;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
	private int anInt295 = -1;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "[I")
	private int[] anIntArray48 = new int[5];

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "Z")
	private boolean aBoolean58 = false;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "Z")
	private boolean aBoolean59 = true;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "I")
	private int anInt296 = 128;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "B")
	private byte aByte7 = 2;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
	private int anInt302 = -1;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "Z")
	private boolean aBoolean61 = true;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "Z")
	private boolean aBoolean62 = false;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
	private int anInt306 = -1;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array3 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "td", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "B")
	private byte aByte8 = -54;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "Lclient!pb;")
	private Class31 aClass31_1 = new Class31((byte) -118);

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "B")
	private byte aByte9 = -54;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "Z")
	private boolean aBoolean63 = false;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "Z")
	private boolean aBoolean64 = true;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array4 = new Class1_Sub1_Sub2_Sub2[50];

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "I")
	private int anInt313 = 8;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "[I")
	private int[] anIntArray49 = new int[151];

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "[Z")
	private boolean[] aBooleanArray5 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
	private int anInt317 = -642;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "[I")
	private int[] anIntArray50 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "Z")
	private boolean aBoolean65 = false;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "Lclient!mb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_2 = Class1_Sub1_Sub3.method485();

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "[I")
	private int[] anIntArray51 = new int[200];

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "[I")
	private int[] anIntArray52 = new int[50];

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "Z")
	private boolean aBoolean66 = false;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
	private int anInt325 = -8263;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "I")
	private int anInt327 = 2;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "Z")
	private boolean aBoolean68 = false;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "[[I")
	private int[][] anIntArrayArray2 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "[I")
	private final int[] anIntArray53 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "se", descriptor = "[J")
	private long[] aLongArray4 = new long[200];

	@OriginalMember(owner = "client!client", name = "te", descriptor = "I")
	private int anInt330 = 3;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "Z")
	private boolean aBoolean69 = true;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
	private int anInt335 = 3;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
	private int anInt336 = 2;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
	private int anInt337 = -1;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "[Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array2 = new Class1_Sub1_Sub2_Sub3[13];

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
	private int anInt343 = -1;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
	private int anInt345 = 3353893;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
	private int anInt346 = 1;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "Lclient!mb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_3 = Class1_Sub1_Sub3.method485();

	@OriginalMember(owner = "client!client", name = "af", descriptor = "[I")
	private int[] anIntArray56 = new int[5];

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "Z")
	private boolean aBoolean71 = false;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "I")
	private int anInt348 = -1;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
	private int anInt351 = 2;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "[Lclient!ab;")
	private Class1_Sub1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1_Sub1Array1 = new Class1_Sub1_Sub1_Sub1_Sub1[16384];

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "[I")
	private int[] anIntArray57 = new int[16384];

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "[I")
	private int[] anIntArray58 = new int[2000];

	@OriginalMember(owner = "client!client", name = "of", descriptor = "Z")
	private boolean aBoolean72 = false;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
	private int anInt355 = 2048;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
	private int anInt356 = 2047;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "[Lclient!bb;")
	private Class1_Sub1_Sub1_Sub1_Sub2[] aClass1_Sub1_Sub1_Sub1_Sub2Array1 = new Class1_Sub1_Sub1_Sub1_Sub2[this.anInt355];

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "[I")
	private int[] anIntArray59 = new int[this.anInt355];

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "[I")
	private int[] anIntArray60 = new int[this.anInt355];

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "[Lclient!mb;")
	private Class1_Sub1_Sub3[] aClass1_Sub1_Sub3Array1 = new Class1_Sub1_Sub3[this.anInt355];

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "Z")
	private boolean aBoolean73 = false;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "[Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array3 = new Class1_Sub1_Sub2_Sub3[2];

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "[I")
	private int[] anIntArray61 = new int[9];

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
	private int anInt361 = 1;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "Z")
	public boolean aBoolean74 = false;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "[[I")
	private int[][] anIntArrayArray4 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private final int anInt363 = 100;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "[I")
	private int[] anIntArray62 = new int[100];

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "[Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array4 = new Class1_Sub1_Sub2_Sub3[50];

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "[I")
	private int[] anIntArray63 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array5 = new Class1_Sub1_Sub2_Sub2[8];

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
	private int anInt366 = 548;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private int anInt367 = 2;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "Lclient!mb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_4 = Class1_Sub1_Sub3.method485();

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "[I")
	private int[] anIntArray64 = new int[5];

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "Z")
	private boolean aBoolean75 = false;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "[I")
	private int[] anIntArray73 = new int[Class29.anInt833];

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "Z")
	private boolean aBoolean76 = false;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "Z")
	private boolean aBoolean77 = true;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
	private int anInt377 = -1;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "[I")
	private int[] anIntArray75 = new int[256];

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "Z")
	private boolean aBoolean78 = false;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "Ljava/lang/String;")
	private String aString12 = "";

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "[I")
	private int[] anIntArray76 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "[I")
	private int[] anIntArray77 = new int[33];

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private int anInt383 = -79;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "[I")
	private int[] anIntArray78 = new int[50];

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "I")
	private int anInt394 = 78;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "[I")
	private int[] anIntArray79 = new int[Class29.anInt833];

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "Z")
	private boolean aBoolean79 = false;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "Z")
	private boolean aBoolean80 = true;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "Z")
	private boolean aBoolean81 = false;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "I")
	private int anInt398 = 7759444;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "Z")
	private boolean aBoolean82 = true;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "[I")
	private int[] anIntArray80 = new int[500];

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "[I")
	private int[] anIntArray81 = new int[500];

	@OriginalMember(owner = "client!client", name = "th", descriptor = "[I")
	private int[] anIntArray82 = new int[500];

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "[I")
	private int[] anIntArray83 = new int[500];

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "[I")
	private int[] anIntArray84 = new int[33];

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "I")
	private int anInt409 = 7;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "[Lclient!wb;")
	public Class46[] aClass46Array1 = new Class46[5];

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "B")
	private byte aByte10 = 4;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "[I")
	private int[] anIntArray85 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "[I")
	private int[] anIntArray86 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "[I")
	private int[] anIntArray87 = new int[7];

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "Lclient!pb;")
	private Class31 aClass31_2 = new Class31((byte) -118);

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "[B")
	private byte[] aByteArray2 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "Z")
	private boolean aBoolean84 = false;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array6 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "B")
	private byte aByte11 = 2;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "Ljava/lang/String;")
	private String aString14 = "";

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "Ljava/lang/String;")
	private String aString15 = "";

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "Lclient!pb;")
	private Class31 aClass31_3 = new Class31((byte) -118);

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "Ljava/lang/String;")
	private String aString16 = "";

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "Z")
	private boolean aBoolean86 = false;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
	private int anInt425 = -1;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "Z")
	private boolean aBoolean87 = false;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "B")
	private byte aByte12 = -74;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
	private int anInt428 = 5063219;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
	private int anInt429 = -171;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "I")
	private int anInt430 = 2;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "Z")
	private boolean aBoolean88 = false;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array7 = new Class1_Sub1_Sub2_Sub2[1000];

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "[[[Lclient!pb;")
	private Class31[][][] aClass31ArrayArrayArray1 = new Class31[4][104][104];

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
	private int anInt441 = -1;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "B")
	private byte aByte13 = 8;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
	private int anInt442 = 6;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "[Lclient!jc;")
	private Class19[] aClass19Array1 = new Class19[4];

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
	private int anInt446 = 2;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "Ljava/lang/String;")
	private String aString18 = "";

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "Z")
	private boolean aBoolean89 = false;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "I")
	private int anInt447 = -612;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "I")
	private int anInt448 = -589;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "I")
	private int anInt451 = 1;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "[[I")
	private int[][] anIntArrayArray5 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "Z")
	private boolean aBoolean90 = false;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray6 = new String[500];

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "[I")
	private int[] anIntArray94 = new int[5];

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "[I")
	private int[] anIntArray95 = new int[50];

	static {
		@Pc(277) int local277 = 0;
		@Pc(279) int local279;
		for (local279 = 0; local279 < 99; local279++) {
			@Pc(284) int local284 = local279 + 1;
			@Pc(297) int local297 = (int) ((double) local284 + Math.pow(2.0D, (double) local284 / 7.0D) * 300.0D);
			local277 += local297;
			anIntArray72[local279] = local277 / 4;
		}
		anIntArray74 = new int[32];
		local277 = 2;
		for (local279 = 0; local279 < 32; local279++) {
			anIntArray74[local279] = local277 - 1;
			local277 += local277;
		}
		aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		anInt417 = -838;
		anIntArray93 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Ljava/lang/String;")
	private static String method107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(9) int local9 = arg1 - arg0;
			if (local9 < -9) {
				return "@red@";
			} else if (local9 < -6) {
				return "@or3@";
			} else if (local9 < -3) {
				return "@or2@";
			} else if (local9 < 0) {
				return "@or1@";
			} else if (local9 > 9) {
				return "@gre@";
			} else if (local9 > 6) {
				return "@gr3@";
			} else if (local9 > 3) {
				return "@gr2@";
			} else if (local9 > 0) {
				return "@gr1@";
			} else {
				return "@yel@";
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("58276, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 253);
			if (arg0.length == 5) {
				anInt291 = Integer.parseInt(arg0[0]);
				anInt292 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method147(12);
				} else if (arg0[2].equals("highmem")) {
					method137();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean55 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean55 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt923 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method85();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private static void method137() {
		try {
			Class39.aBoolean242 = false;
			Class1_Sub1_Sub2_Sub1.aBoolean171 = false;
			aBoolean56 = false;
			Class4.aBoolean35 = false;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("88059, " + 0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Ljava/lang/String;")
	private static String method146(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("95819, " + arg0 + ", " + 385 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private static void method147(@OriginalArg(0) int arg0) {
		try {
			Class39.aBoolean242 = true;
			Class1_Sub1_Sub2_Sub1.aBoolean171 = true;
			aBoolean56 = true;
			@Pc(9) boolean local9 = true;
			Class4.aBoolean35 = true;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("5799, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)Ljava/lang/String;")
	private static String method184(@OriginalArg(1) int arg0) {
		try {
			@Pc(10) String local10 = String.valueOf(arg0);
			for (@Pc(15) int local15 = local10.length() - 3; local15 > 0; local15 -= 3) {
				local10 = local10.substring(0, local15) + "," + local10.substring(local15);
			}
			if (local10.length() > 8) {
				local10 = "@gre@" + local10.substring(0, local10.length() - 8) + " million @whi@(" + local10 + ")";
			} else if (local10.length() > 4) {
				local10 = "@cya@" + local10.substring(0, local10.length() - 4) + "K @whi@(" + local10 + ")";
			}
			return " " + local10;
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("60595, " + false + ", " + arg0 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!gc;IZI)V")
	private void method98(@OriginalArg(0) int arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (this.anInt407 < 400) {
				@Pc(9) String local9 = arg1.aString25;
				if (arg1.anInt590 != 0) {
					local9 = local9 + method107(arg1.anInt590, aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt178) + " (level-" + arg1.anInt590 + ")";
				}
				if (this.anInt282 == 1) {
					this.aStringArray6[this.anInt407] = "Use " + this.aString9 + " with @yel@" + local9;
					this.anIntArray82[this.anInt407] = 829;
					this.anIntArray83[this.anInt407] = arg3;
					this.anIntArray80[this.anInt407] = arg0;
					this.anIntArray81[this.anInt407] = arg2;
					this.anInt407++;
				} else if (this.anInt270 != 1) {
					@Pc(150) int local150;
					if (arg1.aStringArray9 != null) {
						for (local150 = 4; local150 >= 0; local150--) {
							if (arg1.aStringArray9[local150] != null && !arg1.aStringArray9[local150].equalsIgnoreCase("attack")) {
								this.aStringArray6[this.anInt407] = arg1.aStringArray9[local150] + " @yel@" + local9;
								if (local150 == 0) {
									this.anIntArray82[this.anInt407] = 242;
								}
								if (local150 == 1) {
									this.anIntArray82[this.anInt407] = 209;
								}
								if (local150 == 2) {
									this.anIntArray82[this.anInt407] = 309;
								}
								if (local150 == 3) {
									this.anIntArray82[this.anInt407] = 852;
								}
								if (local150 == 4) {
									this.anIntArray82[this.anInt407] = 793;
								}
								this.anIntArray83[this.anInt407] = arg3;
								this.anIntArray80[this.anInt407] = arg0;
								this.anIntArray81[this.anInt407] = arg2;
								this.anInt407++;
							}
						}
					}
					if (arg1.aStringArray9 != null) {
						for (local150 = 4; local150 >= 0; local150--) {
							if (arg1.aStringArray9[local150] != null && arg1.aStringArray9[local150].equalsIgnoreCase("attack")) {
								@Pc(274) short local274 = 0;
								if (arg1.anInt590 > aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt178) {
									local274 = 2000;
								}
								this.aStringArray6[this.anInt407] = arg1.aStringArray9[local150] + " @yel@" + local9;
								if (local150 == 0) {
									this.anIntArray82[this.anInt407] = local274 + 242;
								}
								if (local150 == 1) {
									this.anIntArray82[this.anInt407] = local274 + 209;
								}
								if (local150 == 2) {
									this.anIntArray82[this.anInt407] = local274 + 309;
								}
								if (local150 == 3) {
									this.anIntArray82[this.anInt407] = local274 + 852;
								}
								if (local150 == 4) {
									this.anIntArray82[this.anInt407] = local274 + 793;
								}
								this.anIntArray83[this.anInt407] = arg3;
								this.anIntArray80[this.anInt407] = arg0;
								this.anIntArray81[this.anInt407] = arg2;
								this.anInt407++;
							}
						}
					}
					this.aStringArray6[this.anInt407] = "Examine @yel@" + local9;
					this.anIntArray82[this.anInt407] = 1714;
					this.anIntArray83[this.anInt407] = arg3;
					this.anIntArray80[this.anInt407] = arg0;
					this.anIntArray81[this.anInt407] = arg2;
					this.anInt407++;
				} else if ((this.anInt272 & 0x2) == 2) {
					this.aStringArray6[this.anInt407] = this.aString8 + " @yel@" + local9;
					this.anIntArray82[this.anInt407] = 240;
					this.anIntArray83[this.anInt407] = arg3;
					this.anIntArray80[this.anInt407] = arg0;
					this.anIntArray81[this.anInt407] = arg2;
					this.anInt407++;
					return;
				}
			}
		} catch (@Pc(424) RuntimeException local424) {
			signlink.reporterror("80032, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + local424.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZ)V")
	private void method99(@OriginalArg(0) boolean arg0) {
		try {
			this.method153();
			this.aClass37_21.method538();
			this.aClass1_Sub1_Sub2_Sub3_19.method445(0, 0);
			@Pc(48) byte local48;
			@Pc(60) int local60;
			if (this.anInt449 == 0) {
				this.aClass1_Sub1_Sub2_Sub4_1.method466(this.aClass45_Sub1_1.aString31, 180, true, 7711145, 180);
				local48 = 80;
				this.aClass1_Sub1_Sub2_Sub4_3.method466("Welcome to RuneScape", 180, true, 16776960, 80);
				local60 = local48 + 30;
				this.aClass1_Sub1_Sub2_Sub3_20.method445(27, 100);
				this.aClass1_Sub1_Sub2_Sub4_3.method466("New user", 100, true, 16777215, 125);
				this.aClass1_Sub1_Sub2_Sub3_20.method445(187, 100);
				this.aClass1_Sub1_Sub2_Sub4_3.method466("Existing User", 260, true, 16777215, 125);
			}
			if (this.anInt449 == 2) {
				local48 = 60;
				if (this.aString6.length() > 0) {
					this.aClass1_Sub1_Sub2_Sub4_3.method466(this.aString6, 180, true, 16776960, 45);
					this.aClass1_Sub1_Sub2_Sub4_3.method466(this.aString7, 180, true, 16776960, 60);
					local60 = local48 + 30;
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method466(this.aString7, 180, true, 16776960, 53);
					local60 = local48 + 30;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method470(16777215, true, "Username: " + this.aString14 + (this.anInt344 == 0 & anInt440 % 40 < 20 ? "@yel@|" : ""), 90, 90);
				local60 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method470(16777215, true, "Password: " + Class49.method685(this.aString15) + (this.anInt344 == 1 & anInt440 % 40 < 20 ? "@yel@|" : ""), 105, 92);
				local60 += 15;
				if (!arg0) {
					this.aClass1_Sub1_Sub2_Sub3_20.method445(27, 130);
					this.aClass1_Sub1_Sub2_Sub4_3.method466("Login", 100, true, 16777215, 155);
					this.aClass1_Sub1_Sub2_Sub3_20.method445(187, 130);
					this.aClass1_Sub1_Sub2_Sub4_3.method466("Cancel", 260, true, 16777215, 155);
				}
			}
			if (this.anInt449 == 3) {
				this.aClass1_Sub1_Sub2_Sub4_3.method466("Create a free account", 180, true, 16776960, 40);
				local48 = 65;
				this.aClass1_Sub1_Sub2_Sub4_3.method466("To create a new account you need to", 180, true, 16777215, 65);
				local60 = local48 + 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method466("go back to the main RuneScape webpage", 180, true, 16777215, 80);
				local60 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method466("and choose the red 'create account'", 180, true, 16777215, 95);
				local60 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method466("button at the top right of that page.", 180, true, 16777215, 110);
				local60 += 15;
				this.aClass1_Sub1_Sub2_Sub3_20.method445(107, 130);
				this.aClass1_Sub1_Sub2_Sub4_3.method466("Cancel", 180, true, 16777215, 155);
			}
			this.aClass37_21.method539(super.aGraphics2, 171, 202);
			if (this.aBoolean68) {
				this.aBoolean68 = false;
				this.aClass37_19.method539(super.aGraphics2, 0, 128);
				this.aClass37_20.method539(super.aGraphics2, 371, 202);
				this.aClass37_24.method539(super.aGraphics2, 265, 0);
				this.aClass37_25.method539(super.aGraphics2, 265, 562);
				this.aClass37_26.method539(super.aGraphics2, 171, 128);
				this.aClass37_27.method539(super.aGraphics2, 171, 562);
			}
		} catch (@Pc(493) RuntimeException local493) {
			signlink.reporterror("53112, " + arg0 + ", " + false + ", " + local493.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method100() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt307);
			if (this.aClass45_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass45_Sub1_1.anInt977);
			}
			System.out.println("loop-cycle:" + anInt440);
			System.out.println("draw-cycle:" + anInt332);
			System.out.println("ptype:" + this.anInt339);
			this.anInt338 += 0;
			System.out.println("psize:" + this.anInt338);
			if (this.aClass8_1 != null) {
				this.aClass8_1.method249();
			}
			super.aBoolean42 = true;
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("3358, " + 0 + ", " + local82.toString());
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
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("45590, " + 982 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!d;IIII)V")
	private void method101(@OriginalArg(0) int arg0, @OriginalArg(2) Class6 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg1.anInt459 == 0 && arg1.anIntArray100 != null && !arg1.aBoolean94 && (arg5 >= arg0 && arg2 >= arg4 && arg5 <= arg0 + arg1.anInt462 && arg2 <= arg4 + arg1.anInt463)) {
				@Pc(34) int local34 = arg1.anIntArray100.length;
				for (@Pc(42) int local42 = 0; local42 < local34; local42++) {
					@Pc(51) int local51 = arg1.anIntArray101[local42] + arg0;
					@Pc(60) int local60 = arg1.anIntArray102[local42] + arg4 - arg3;
					@Pc(67) Class6 local67 = Class6.aClass6Array1[arg1.anIntArray100[local42]];
					@Pc(72) int local72 = local51 + local67.anInt464;
					@Pc(77) int local77 = local60 + local67.anInt465;
					if ((local67.anInt466 >= 0 || local67.anInt474 != 0) && arg5 >= local72 && arg2 >= local77 && arg5 < local72 + local67.anInt462 && arg2 < local77 + local67.anInt463) {
						if (local67.anInt466 >= 0) {
							this.anInt318 = local67.anInt466;
						} else {
							this.anInt318 = local67.anInt457;
						}
					}
					if (local67.anInt459 == 0) {
						this.method101(local72, local67, arg2, local67.anInt468, local77, arg5);
						if (local67.anInt467 > local67.anInt463) {
							this.method104(local67.anInt463, local67.anInt467, local77, arg2, true, local72 + local67.anInt462, local67, arg5);
						}
					} else {
						if (local67.anInt460 == 1 && arg5 >= local72 && arg2 >= local77 && arg5 < local72 + local67.anInt462 && arg2 < local77 + local67.anInt463) {
							@Pc(174) boolean local174 = false;
							if (local67.anInt461 != 0) {
								local174 = this.method138(local67);
							}
							if (!local174) {
								this.aStringArray6[this.anInt407] = local67.aString23;
								this.anIntArray82[this.anInt407] = 231;
								this.anIntArray81[this.anInt407] = local67.anInt457;
								this.anInt407++;
							}
						}
						if (local67.anInt460 == 2 && this.anInt270 == 0 && arg5 >= local72 && arg2 >= local77 && arg5 < local72 + local67.anInt462 && arg2 < local77 + local67.anInt463) {
							@Pc(238) String local238 = local67.aString21;
							if (local238.indexOf(" ") != -1) {
								local238 = local238.substring(0, local238.indexOf(" "));
							}
							this.aStringArray6[this.anInt407] = local238 + " @gre@" + local67.aString22;
							this.anIntArray82[this.anInt407] = 274;
							this.anIntArray81[this.anInt407] = local67.anInt457;
							this.anInt407++;
						}
						if (local67.anInt460 == 3 && arg5 >= local72 && arg2 >= local77 && arg5 < local72 + local67.anInt462 && arg2 < local77 + local67.anInt463) {
							this.aStringArray6[this.anInt407] = "Close";
							this.anIntArray82[this.anInt407] = 737;
							this.anIntArray81[this.anInt407] = local67.anInt457;
							this.anInt407++;
						}
						if (local67.anInt460 == 4 && arg5 >= local72 && arg2 >= local77 && arg5 < local72 + local67.anInt462 && arg2 < local77 + local67.anInt463) {
							this.aStringArray6[this.anInt407] = local67.aString23;
							this.anIntArray82[this.anInt407] = 435;
							this.anIntArray81[this.anInt407] = local67.anInt457;
							this.anInt407++;
						}
						if (local67.anInt460 == 5 && arg5 >= local72 && arg2 >= local77 && arg5 < local72 + local67.anInt462 && arg2 < local77 + local67.anInt463) {
							this.aStringArray6[this.anInt407] = local67.aString23;
							this.anIntArray82[this.anInt407] = 225;
							this.anIntArray81[this.anInt407] = local67.anInt457;
							this.anInt407++;
						}
						if (local67.anInt460 == 6 && !this.aBoolean50 && arg5 >= local72 && arg2 >= local77 && arg5 < local72 + local67.anInt462 && arg2 < local77 + local67.anInt463) {
							this.aStringArray6[this.anInt407] = local67.aString23;
							this.anIntArray82[this.anInt407] = 997;
							this.anIntArray81[this.anInt407] = local67.anInt457;
							this.anInt407++;
						}
						if (local67.anInt459 == 2) {
							@Pc(486) int local486 = 0;
							for (@Pc(488) int local488 = 0; local488 < local67.anInt463; local488++) {
								for (@Pc(492) int local492 = 0; local492 < local67.anInt462; local492++) {
									@Pc(503) int local503 = local72 + local492 * (local67.anInt470 + 32);
									@Pc(512) int local512 = local77 + local488 * (local67.anInt471 + 32);
									if (local486 < 20) {
										local503 += local67.anIntArray103[local486];
										local512 += local67.anIntArray104[local486];
									}
									if (arg5 >= local503 && arg2 >= local512 && arg5 < local503 + 32 && arg2 < local512 + 32) {
										this.anInt421 = local486;
										this.anInt422 = local67.anInt457;
										if (local67.anIntArray96[local486] > 0) {
											@Pc(565) Class15 local565 = Class15.method345(local67.anIntArray96[local486] - 1);
											if (this.anInt282 == 1 && local67.aBoolean97) {
												if (local67.anInt457 != this.anInt284 || local486 != this.anInt283) {
													this.aStringArray6[this.anInt407] = "Use " + this.aString9 + " with @lre@" + local565.aString26;
													this.anIntArray82[this.anInt407] = 398;
													this.anIntArray83[this.anInt407] = local565.anInt615;
													this.anIntArray80[this.anInt407] = local486;
													this.anIntArray81[this.anInt407] = local67.anInt457;
													this.anInt407++;
												}
											} else if (this.anInt270 != 1 || !local67.aBoolean97) {
												@Pc(702) int local702;
												if (local67.aBoolean97) {
													for (local702 = 4; local702 >= 3; local702--) {
														if (local565.aStringArray11 != null && local565.aStringArray11[local702] != null) {
															this.aStringArray6[this.anInt407] = local565.aStringArray11[local702] + " @lre@" + local565.aString26;
															if (local702 == 3) {
																this.anIntArray82[this.anInt407] = 681;
															}
															if (local702 == 4) {
																this.anIntArray82[this.anInt407] = 100;
															}
															this.anIntArray83[this.anInt407] = local565.anInt615;
															this.anIntArray80[this.anInt407] = local486;
															this.anIntArray81[this.anInt407] = local67.anInt457;
															this.anInt407++;
														} else if (local702 == 4) {
															this.aStringArray6[this.anInt407] = "Drop @lre@" + local565.aString26;
															this.anIntArray82[this.anInt407] = 100;
															this.anIntArray83[this.anInt407] = local565.anInt615;
															this.anIntArray80[this.anInt407] = local486;
															this.anIntArray81[this.anInt407] = local67.anInt457;
															this.anInt407++;
														}
													}
												}
												if (local67.aBoolean98) {
													this.aStringArray6[this.anInt407] = "Use @lre@" + local565.aString26;
													this.anIntArray82[this.anInt407] = 102;
													this.anIntArray83[this.anInt407] = local565.anInt615;
													this.anIntArray80[this.anInt407] = local486;
													this.anIntArray81[this.anInt407] = local67.anInt457;
													this.anInt407++;
												}
												if (local67.aBoolean97 && local565.aStringArray11 != null) {
													for (local702 = 2; local702 >= 0; local702--) {
														if (local565.aStringArray11[local702] != null) {
															this.aStringArray6[this.anInt407] = local565.aStringArray11[local702] + " @lre@" + local565.aString26;
															if (local702 == 0) {
																this.anIntArray82[this.anInt407] = 694;
															}
															if (local702 == 1) {
																this.anIntArray82[this.anInt407] = 962;
															}
															if (local702 == 2) {
																this.anIntArray82[this.anInt407] = 795;
															}
															this.anIntArray83[this.anInt407] = local565.anInt615;
															this.anIntArray80[this.anInt407] = local486;
															this.anIntArray81[this.anInt407] = local67.anInt457;
															this.anInt407++;
														}
													}
												}
												if (local67.aStringArray7 != null) {
													for (local702 = 4; local702 >= 0; local702--) {
														if (local67.aStringArray7[local702] != null) {
															this.aStringArray6[this.anInt407] = local67.aStringArray7[local702] + " @lre@" + local565.aString26;
															if (local702 == 0) {
																this.anIntArray82[this.anInt407] = 582;
															}
															if (local702 == 1) {
																this.anIntArray82[this.anInt407] = 113;
															}
															if (local702 == 2) {
																this.anIntArray82[this.anInt407] = 555;
															}
															if (local702 == 3) {
																this.anIntArray82[this.anInt407] = 331;
															}
															if (local702 == 4) {
																this.anIntArray82[this.anInt407] = 354;
															}
															this.anIntArray83[this.anInt407] = local565.anInt615;
															this.anIntArray80[this.anInt407] = local486;
															this.anIntArray81[this.anInt407] = local67.anInt457;
															this.anInt407++;
														}
													}
												}
												this.aStringArray6[this.anInt407] = "Examine @lre@" + local565.aString26;
												this.anIntArray82[this.anInt407] = 1328;
												this.anIntArray83[this.anInt407] = local565.anInt615;
												this.anIntArray80[this.anInt407] = local486;
												this.anIntArray81[this.anInt407] = local67.anInt457;
												this.anInt407++;
											} else if ((this.anInt272 & 0x10) == 16) {
												this.aStringArray6[this.anInt407] = this.aString8 + " @lre@" + local565.aString26;
												this.anIntArray82[this.anInt407] = 563;
												this.anIntArray83[this.anInt407] = local565.anInt615;
												this.anIntArray80[this.anInt407] = local486;
												this.anIntArray81[this.anInt407] = local67.anInt457;
												this.anInt407++;
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
			signlink.reporterror("19779, " + arg0 + ", " + -75 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local1132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean57) {
			this.method191();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method102() {
		try {
			if (this.anInt407 >= 2 || this.anInt282 != 0 || this.anInt270 != 0) {
				@Pc(34) String local34;
				if (this.anInt282 == 1 && this.anInt407 < 2) {
					local34 = "Use " + this.aString9 + " with...";
				} else if (this.anInt270 == 1 && this.anInt407 < 2) {
					local34 = this.aString8 + "...";
				} else {
					local34 = this.aStringArray6[this.anInt407 - 1];
				}
				if (this.anInt407 > 2) {
					local34 = local34 + "@whi@ / " + (this.anInt407 - 2) + " more options";
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method471(4, 16777215, 15, anInt440 / 1000, local34);
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("29108, " + -612 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BZI)Z")
	private boolean method103(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			return arg0 == null ? true : signlink.wavesave(arg0, arg1);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("2119, " + arg0 + ", " + false + ", " + arg1 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIBIZILclient!d;I)V")
	private void method104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class6 arg6, @OriginalArg(8) int arg7) {
		try {
			if (this.aBoolean81) {
				this.anInt310 = 32;
			} else {
				this.anInt310 = 0;
			}
			this.aBoolean81 = false;
			if (arg7 >= arg5 && arg7 < arg5 + 16 && arg3 >= arg2 && arg3 < arg2 + 16) {
				arg6.anInt468 -= this.anInt248 * 4;
				if (arg4) {
					this.aBoolean66 = true;
					return;
				}
			} else if (arg7 >= arg5 && arg7 < arg5 + 16 && arg3 >= arg2 + arg0 - 16 && arg3 < arg2 + arg0) {
				arg6.anInt468 += this.anInt248 * 4;
				if (arg4) {
					this.aBoolean66 = true;
					return;
				}
			} else if (arg7 >= arg5 - this.anInt310 && arg7 < arg5 + this.anInt310 + 16 && arg3 >= arg2 + 16 && arg3 < arg2 + arg0 - 16 && this.anInt248 > 0) {
				@Pc(120) int local120 = (arg0 - 32) * arg0 / arg1;
				if (local120 < 8) {
					local120 = 8;
				}
				@Pc(135) int local135 = arg3 - arg2 - local120 / 2 - 16;
				@Pc(141) int local141 = arg0 - local120 - 32;
				arg6.anInt468 = (arg1 - arg0) * local135 / local141;
				if (arg4) {
					this.aBoolean66 = true;
				}
				this.aBoolean81 = true;
			} else {
				return;
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("40657, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 15 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!jb;)V")
	private void method105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub1_Sub2_Sub2 arg3) {
		try {
			@Pc(7) int local7 = arg0 * arg0 + arg2 * arg2;
			if (arg1 != this.anInt429) {
				this.aClass31ArrayArrayArray1 = null;
			}
			if (local7 > 4225 && local7 < 90000) {
				@Pc(28) int local28 = this.anInt297 + this.anInt326 & 0x7FF;
				@Pc(32) int local32 = Class1_Sub1_Sub1_Sub5.anIntArray158[local28];
				@Pc(36) int local36 = Class1_Sub1_Sub1_Sub5.anIntArray159[local28];
				@Pc(45) int local45 = local32 * 256 / (this.anInt360 + 256);
				@Pc(54) int local54 = local36 * 256 / (this.anInt360 + 256);
				@Pc(64) int local64 = arg2 * local45 + arg0 * local54 >> 16;
				@Pc(74) int local74 = arg2 * local54 - arg0 * local45 >> 16;
				@Pc(80) double local80 = Math.atan2((double) local64, (double) local74);
				@Pc(86) int local86 = (int) (Math.sin(local80) * 63.0D);
				@Pc(92) int local92 = (int) (Math.cos(local80) * 57.0D);
				this.aClass1_Sub1_Sub2_Sub2_12.method411(local86 + 94 + 4 - 10, 83 - local92 - 20, local80);
			} else {
				this.method173(arg3, arg2, arg0);
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("4743, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method106(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString6 = "";
				this.aString7 = "Connecting to server...";
				this.method99(true);
			}
			this.aClass8_1 = new Class8((byte) 4, this, this.method167(anInt292 + 43594));
			@Pc(30) long local30 = Class49.method679(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass1_Sub1_Sub3_4.anInt776 = 0;
			this.aClass1_Sub1_Sub3_4.method488(14);
			this.aClass1_Sub1_Sub3_4.method488(local37);
			this.aClass8_1.method248(2, this.aClass1_Sub1_Sub3_4.aByteArray9);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass8_1.method245();
			}
			@Pc(74) int local74 = this.aClass8_1.method245();
			@Pc(217) int local217;
			@Pc(251) int local251;
			if (local74 == 0) {
				this.aClass8_1.method247(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 8);
				this.aClass1_Sub1_Sub3_3.anInt776 = 0;
				this.aLong17 = this.aClass1_Sub1_Sub3_3.method504();
				@Pc(97) int[] local97 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong17 >> 32), (int) this.aLong17 };
				this.aClass1_Sub1_Sub3_4.anInt776 = 0;
				this.aClass1_Sub1_Sub3_4.method488(10);
				this.aClass1_Sub1_Sub3_4.method492(local97[0]);
				this.aClass1_Sub1_Sub3_4.method492(local97[1]);
				this.aClass1_Sub1_Sub3_4.method492(local97[2]);
				this.aClass1_Sub1_Sub3_4.method492(local97[3]);
				this.aClass1_Sub1_Sub3_4.method492(signlink.anInt922);
				this.aClass1_Sub1_Sub3_4.method495(arg0);
				this.aClass1_Sub1_Sub3_4.method495(arg1);
				this.aClass1_Sub1_Sub3_4.method513(aBigInteger1, aBigInteger2, 913);
				this.aClass1_Sub1_Sub3_2.anInt776 = 0;
				if (arg2) {
					this.aClass1_Sub1_Sub3_2.method488(18);
				} else {
					this.aClass1_Sub1_Sub3_2.method488(16);
				}
				this.aClass1_Sub1_Sub3_2.method488(this.aClass1_Sub1_Sub3_4.anInt776 + 36 + 1 + 1);
				this.aClass1_Sub1_Sub3_2.method488(253);
				this.aClass1_Sub1_Sub3_2.method488(aBoolean56 ? 1 : 0);
				for (local217 = 0; local217 < 9; local217++) {
					this.aClass1_Sub1_Sub3_2.method492(this.anIntArray61[local217]);
				}
				this.aClass1_Sub1_Sub3_2.method496(this.aClass1_Sub1_Sub3_4.anInt776, this.aClass1_Sub1_Sub3_4.aByteArray9);
				this.aClass1_Sub1_Sub3_4.aClass47_2 = new Class47(local97, -44988);
				for (local251 = 0; local251 < 4; local251++) {
					local97[local251] += 50;
				}
				this.aClass47_1 = new Class47(local97, -44988);
				this.aClass8_1.method248(this.aClass1_Sub1_Sub3_2.anInt776, this.aClass1_Sub1_Sub3_2.aByteArray9);
				local74 = this.aClass8_1.method245();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(293) Exception local293) {
				}
				this.method106(arg0, arg1, arg2);
			} else {
				@Pc(383) int local383;
				if (local74 == 2) {
					this.anInt413 = this.aClass8_1.method245();
					aBoolean83 = this.aClass8_1.method245() == 1;
					Class10.method267();
					this.aLong18 = 0L;
					this.anInt454 = 0;
					this.aClass11_1.anInt567 = 0;
					super.aBoolean44 = true;
					this.aBoolean69 = true;
					this.aBoolean74 = true;
					this.aClass1_Sub1_Sub3_4.anInt776 = 0;
					this.aClass1_Sub1_Sub3_3.anInt776 = 0;
					this.anInt339 = -1;
					this.anInt374 = -1;
					this.anInt375 = -1;
					this.anInt376 = -1;
					this.anInt338 = 0;
					this.anInt340 = 0;
					this.anInt293 = 0;
					this.anInt342 = 0;
					this.anInt395 = 0;
					this.anInt407 = 0;
					this.aBoolean72 = false;
					super.anInt230 = 0;
					for (local383 = 0; local383 < 100; local383++) {
						this.aStringArray4[local383] = null;
					}
					this.anInt282 = 0;
					this.anInt270 = 0;
					this.anInt415 = 0;
					this.anInt424 = 0;
					this.anInt445 = (int) (Math.random() * 100.0D) - 50;
					this.anInt350 = (int) (Math.random() * 110.0D) - 55;
					this.anInt450 = (int) (Math.random() * 80.0D) - 40;
					this.anInt326 = (int) (Math.random() * 120.0D) - 60;
					this.anInt360 = (int) (Math.random() * 30.0D) - 20;
					this.anInt297 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt425 = -1;
					this.anInt452 = 0;
					this.anInt453 = 0;
					this.anInt357 = 0;
					this.anInt352 = 0;
					for (local217 = 0; local217 < this.anInt355; local217++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local217] = null;
						this.aClass1_Sub1_Sub3Array1[local217] = null;
					}
					for (local251 = 0; local251 < 16384; local251++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local251] = null;
					}
					aClass1_Sub1_Sub1_Sub1_Sub2_1 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anInt356] = new Class1_Sub1_Sub1_Sub1_Sub2();
					this.aClass31_3.method527();
					this.aClass31_1.method527();
					@Pc(525) int local525;
					@Pc(529) int local529;
					for (@Pc(521) int local521 = 0; local521 < 4; local521++) {
						for (local525 = 0; local525 < 104; local525++) {
							for (local529 = 0; local529 < 104; local529++) {
								this.aClass31ArrayArrayArray1[local521][local525][local529] = null;
							}
						}
					}
					this.aClass31_2 = new Class31((byte) -118);
					this.anInt379 = 0;
					this.anInt378 = 0;
					this.anInt302 = -1;
					this.anInt343 = -1;
					this.anInt348 = -1;
					this.anInt337 = -1;
					this.anInt274 = -1;
					this.aBoolean50 = false;
					this.anInt330 = 3;
					this.aBoolean86 = false;
					this.aBoolean72 = false;
					this.aBoolean90 = false;
					this.aString10 = null;
					this.anInt369 = 0;
					this.anInt275 = -1;
					this.aBoolean46 = true;
					this.method139();
					for (local525 = 0; local525 < 5; local525++) {
						this.anIntArray64[local525] = 0;
					}
					for (local529 = 0; local529 < 5; local529++) {
						this.aStringArray5[local529] = null;
						this.aBooleanArray4[local529] = false;
					}
					anInt347 = 0;
					anInt290 = 0;
					anInt408 = 0;
					anInt353 = 0;
					anInt427 = 0;
					anInt260 = 0;
					anInt315 = 0;
					anInt331 = 0;
					anInt269 = 0;
					this.method122();
				} else if (local74 == 3) {
					this.aString6 = "";
					this.aString7 = "Invalid username or password.";
				} else if (local74 == 4) {
					this.aString6 = "Your account has been disabled.";
					this.aString7 = "Please check your message-centre for details.";
				} else if (local74 == 5) {
					this.aString6 = "Your account is already logged in.";
					this.aString7 = "Try again in 60 secs...";
				} else if (local74 == 6) {
					this.aString6 = "RuneScape has been updated!";
					this.aString7 = "Please reload this page.";
				} else if (local74 == 7) {
					this.aString6 = "This world is full.";
					this.aString7 = "Please use a different world.";
				} else if (local74 == 8) {
					this.aString6 = "Unable to connect.";
					this.aString7 = "Login server offline.";
				} else if (local74 == 9) {
					this.aString6 = "Login limit exceeded.";
					this.aString7 = "Too many connections from your address.";
				} else if (local74 == 10) {
					this.aString6 = "Unable to connect.";
					this.aString7 = "Bad session id.";
				} else if (local74 == 11) {
					this.aString7 = "Login server rejected session.";
					this.aString7 = "Please try again.";
				} else if (local74 == 12) {
					this.aString6 = "You need a members account to login to this world.";
					this.aString7 = "Please subscribe, or use a different world.";
				} else if (local74 == 13) {
					this.aString6 = "Could not complete login.";
					this.aString7 = "Please try using a different world.";
				} else if (local74 == 14) {
					this.aString6 = "The server is being updated.";
					this.aString7 = "Please wait 1 minute and try again.";
				} else if (local74 == 15) {
					this.aBoolean74 = true;
					this.aClass1_Sub1_Sub3_4.anInt776 = 0;
					this.aClass1_Sub1_Sub3_3.anInt776 = 0;
					this.anInt339 = -1;
					this.anInt374 = -1;
					this.anInt375 = -1;
					this.anInt376 = -1;
					this.anInt338 = 0;
					this.anInt340 = 0;
					this.anInt293 = 0;
					this.anInt407 = 0;
					this.aBoolean72 = false;
					this.aLong16 = System.currentTimeMillis();
				} else if (local74 == 16) {
					this.aString6 = "Login attempts exceeded.";
					this.aString7 = "Please wait 1 minute and try again.";
				} else if (local74 == 17) {
					this.aString6 = "You are standing in a members-only area.";
					this.aString7 = "To play on this world move to a free area first";
				} else if (local74 == 20) {
					this.aString6 = "Invalid loginserver requested";
					this.aString7 = "Please try using a different world.";
				} else if (local74 == 21) {
					for (local383 = this.aClass8_1.method245(); local383 >= 0; local383--) {
						this.aString6 = "You have only just left another world";
						this.aString7 = "Your profile will be transfered in: " + local383 + " seconds";
						this.method99(true);
						try {
							Thread.sleep(1000L);
						} catch (@Pc(890) Exception local890) {
						}
					}
					this.method106(arg0, arg1, arg2);
				} else if (local74 == -1) {
					this.aString6 = "No response from server";
					this.aString7 = "Please try using a different world.";
				} else {
					System.out.println("response:" + local74);
					this.aString6 = "Unexpected server response";
					this.aString7 = "Please try using a different world.";
				}
			}
		} catch (@Pc(926) IOException local926) {
			this.aString6 = "";
			this.aString7 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method91() {
		try {
			if (!this.aBoolean63 && !this.aBoolean88 && !this.aBoolean84) {
				anInt440++;
				if (this.aBoolean74) {
					this.method174(this.anInt336);
				} else {
					this.method152();
				}
				this.method186();
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("6426, " + -585 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)V")
	private void method108(@OriginalArg(1) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass1_Sub1_Sub2_Sub2_13.anIntArray210;
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
			this.aClass1_Sub1_Sub2_Sub2_13.method401();
			@Pc(146) int local146;
			for (@Pc(142) int local142 = 1; local142 < 103; local142++) {
				for (local146 = 1; local146 < 103; local146++) {
					if ((this.aByteArrayArrayArray7[arg0][local146][local142] & 0x18) == 0) {
						this.method123(local34, this.aByte5, local36, local146, local142, arg0);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local146][local142] & 0x8) != 0) {
						this.method123(local34, this.aByte5, local36, local146, local142, arg0 + 1);
					}
				}
			}
			this.aClass37_5.method538();
			this.anInt412 = 0;
			for (local146 = 0; local146 < 104; local146++) {
				for (@Pc(216) int local216 = 0; local216 < 104; local216++) {
					@Pc(226) int local226 = this.aClass39_1.method573(this.anInt432, local146, local216);
					if (local226 != 0) {
						local226 = local226 >> 14 & 0x7FFF;
						@Pc(238) int local238 = Class9.method258(local226).anInt524;
						if (local238 >= 0) {
							@Pc(242) int local242 = local146;
							@Pc(244) int local244 = local216;
							if (local238 != 22 && local238 != 29 && local238 != 34 && local238 != 36 && local238 != 46 && local238 != 47 && local238 != 48) {
								@Pc(276) int[][] local276 = this.aClass19Array1[this.anInt432].anIntArrayArray17;
								for (@Pc(278) int local278 = 0; local278 < 10; local278++) {
									@Pc(285) int local285 = (int) (Math.random() * 4.0D);
									if (local285 == 0 && local242 > 0 && local242 > local146 - 3 && (local276[local242 - 1][local244] & 0x280108) == 0) {
										local242--;
									}
									if (local285 == 1 && local242 < 103 && local242 < local146 + 3 && (local276[local242 + 1][local244] & 0x280180) == 0) {
										local242++;
									}
									if (local285 == 2 && local244 > 0 && local244 > local216 - 3 && (local276[local242][local244 - 1] & 0x280102) == 0) {
										local244--;
									}
									if (local285 == 3 && local244 < 103 && local244 < local216 + 3 && (local276[local242][local244 + 1] & 0x280120) == 0) {
										local244++;
									}
								}
							}
							this.aClass1_Sub1_Sub2_Sub2Array7[this.anInt412] = this.aClass1_Sub1_Sub2_Sub2Array4[local238];
							this.anIntArray85[this.anInt412] = local242;
							this.anIntArray86[this.anInt412] = local244;
							this.anInt412++;
						}
					}
				}
			}
			anInt263++;
			if (anInt263 > 112) {
				anInt263 = 0;
				this.aClass1_Sub1_Sub3_4.method487(4);
				this.aClass1_Sub1_Sub3_4.method488(50);
			}
		} catch (@Pc(443) RuntimeException local443) {
			signlink.reporterror("29411, " + 8 + ", " + arg0 + ", " + local443.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIZIIIIII)Z")
	private boolean method109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray4[local7][local11] = 0;
					this.anIntArrayArray2[local7][local11] = 99999999;
				}
			}
			local11 = arg2;
			@Pc(39) int local39 = arg6;
			this.anIntArrayArray4[arg2][arg6] = 99;
			this.anIntArrayArray2[arg2][arg6] = 0;
			@Pc(61) byte local61 = 0;
			@Pc(63) int local63 = 0;
			this.anIntArray36[0] = arg2;
			@Pc(72) int local72 = local61 + 1;
			this.anIntArray37[0] = arg6;
			@Pc(76) boolean local76 = false;
			@Pc(80) int local80 = this.anIntArray36.length;
			@Pc(87) int[][] local87 = this.aClass19Array1[this.anInt432].anIntArrayArray17;
			@Pc(198) int local198;
			while (local63 != local72) {
				local11 = this.anIntArray36[local63];
				local39 = this.anIntArray37[local63];
				local63 = (local63 + 1) % local80;
				if (local11 == arg8 && local39 == arg4) {
					local76 = true;
					break;
				}
				if (arg7 != 0) {
					if ((arg7 < 5 || arg7 == 10) && this.aClass19Array1[this.anInt432].method423(arg7 - 1, local11, arg4, arg8, local39, arg3)) {
						local76 = true;
						break;
					}
					if (arg7 < 10 && this.aClass19Array1[this.anInt432].method424(arg3, arg8, arg4, local39, local11, arg7 - 1)) {
						local76 = true;
						break;
					}
				}
				if (arg10 != 0 && arg9 != 0 && this.aClass19Array1[this.anInt432].method425(arg10, arg4, arg1, local11, arg9, local39, arg8)) {
					local76 = true;
					break;
				}
				local198 = this.anIntArrayArray2[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray4[local11 - 1][local39] == 0 && (local87[local11 - 1][local39] & 0x280108) == 0) {
					this.anIntArray36[local72] = local11 - 1;
					this.anIntArray37[local72] = local39;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray4[local11 - 1][local39] = 2;
					this.anIntArrayArray2[local11 - 1][local39] = local198;
				}
				if (local11 < 103 && this.anIntArrayArray4[local11 + 1][local39] == 0 && (local87[local11 + 1][local39] & 0x280180) == 0) {
					this.anIntArray36[local72] = local11 + 1;
					this.anIntArray37[local72] = local39;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray4[local11 + 1][local39] = 8;
					this.anIntArrayArray2[local11 + 1][local39] = local198;
				}
				if (local39 > 0 && this.anIntArrayArray4[local11][local39 - 1] == 0 && (local87[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray36[local72] = local11;
					this.anIntArray37[local72] = local39 - 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray4[local11][local39 - 1] = 1;
					this.anIntArrayArray2[local11][local39 - 1] = local198;
				}
				if (local39 < 103 && this.anIntArrayArray4[local11][local39 + 1] == 0 && (local87[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray36[local72] = local11;
					this.anIntArray37[local72] = local39 + 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray4[local11][local39 + 1] = 4;
					this.anIntArrayArray2[local11][local39 + 1] = local198;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray4[local11 - 1][local39 - 1] == 0 && (local87[local11 - 1][local39 - 1] & 0x28010E) == 0 && (local87[local11 - 1][local39] & 0x280108) == 0 && (local87[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray36[local72] = local11 - 1;
					this.anIntArray37[local72] = local39 - 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray4[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray2[local11 - 1][local39 - 1] = local198;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray4[local11 + 1][local39 - 1] == 0 && (local87[local11 + 1][local39 - 1] & 0x280183) == 0 && (local87[local11 + 1][local39] & 0x280180) == 0 && (local87[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray36[local72] = local11 + 1;
					this.anIntArray37[local72] = local39 - 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray4[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray2[local11 + 1][local39 - 1] = local198;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray4[local11 - 1][local39 + 1] == 0 && (local87[local11 - 1][local39 + 1] & 0x280138) == 0 && (local87[local11 - 1][local39] & 0x280108) == 0 && (local87[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray36[local72] = local11 - 1;
					this.anIntArray37[local72] = local39 + 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray4[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray2[local11 - 1][local39 + 1] = local198;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray4[local11 + 1][local39 + 1] == 0 && (local87[local11 + 1][local39 + 1] & 0x2801E0) == 0 && (local87[local11 + 1][local39] & 0x280180) == 0 && (local87[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray36[local72] = local11 + 1;
					this.anIntArray37[local72] = local39 + 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray4[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray2[local11 + 1][local39 + 1] = local198;
				}
			}
			this.anInt416 = 0;
			@Pc(814) int local814;
			@Pc(820) int local820;
			@Pc(826) int local826;
			if (!local76) {
				if (arg5) {
					local198 = 100;
					for (local814 = 1; local814 < 2; local814++) {
						for (local820 = arg8 - local814; local820 <= arg8 + local814; local820++) {
							for (local826 = arg4 - local814; local826 <= arg4 + local814; local826++) {
								if (local820 >= 0 && local826 >= 0 && local820 < 104 && local826 < 104 && this.anIntArrayArray2[local820][local826] < local198) {
									local198 = this.anIntArrayArray2[local820][local826];
									local11 = local820;
									local39 = local826;
									this.anInt416 = 1;
									local76 = true;
								}
							}
						}
						if (local76) {
							break;
						}
					}
				}
				if (!local76) {
					return false;
				}
			}
			@Pc(887) byte local887 = 0;
			this.anIntArray36[0] = local11;
			local63 = local887 + 1;
			this.anIntArray37[0] = local39;
			local198 = local814 = this.anIntArrayArray4[local11][local39];
			while (local11 != arg2 || local39 != arg6) {
				if (local198 != local814) {
					local814 = local198;
					this.anIntArray36[local63] = local11;
					this.anIntArray37[local63++] = local39;
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
				local198 = this.anIntArrayArray4[local11][local39];
			}
			if (local63 > 0) {
				local80 = local63;
				if (local63 > 25) {
					local80 = 25;
				}
				local63--;
				local820 = this.anIntArray36[local63];
				local826 = this.anIntArray37[local63];
				if (arg0 == 0) {
					this.aClass1_Sub1_Sub3_4.method487(6);
					this.aClass1_Sub1_Sub3_4.method488(local80 + local80 + 3);
				}
				if (arg0 == 1) {
					this.aClass1_Sub1_Sub3_4.method487(220);
					this.aClass1_Sub1_Sub3_4.method488(local80 + local80 + 3 + 14);
				}
				if (arg0 == 2) {
					this.aClass1_Sub1_Sub3_4.method487(127);
					this.aClass1_Sub1_Sub3_4.method488(local80 + local80 + 3);
				}
				if (super.anIntArray32[5] == 1) {
					this.aClass1_Sub1_Sub3_4.method488(1);
				} else {
					this.aClass1_Sub1_Sub3_4.method488(0);
				}
				this.aClass1_Sub1_Sub3_4.method489(local820 + this.anInt384);
				this.aClass1_Sub1_Sub3_4.method489(local826 + this.anInt385);
				this.anInt452 = this.anIntArray36[0];
				this.anInt453 = this.anIntArray37[0];
				for (@Pc(1075) int local1075 = 1; local1075 < local80; local1075++) {
					local63--;
					this.aClass1_Sub1_Sub3_4.method488(this.anIntArray36[local63] - local820);
					this.aClass1_Sub1_Sub3_4.method488(this.anIntArray37[local63] - local826);
				}
				return true;
			} else if (arg0 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1110) RuntimeException local1110) {
			signlink.reporterror("60667, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 0 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	private void method110(@OriginalArg(0) byte arg0) {
		try {
			this.aClass1_Sub1_Sub2_Sub3_19 = new Class1_Sub1_Sub2_Sub3(this.aClass48_1, "titlebox", 0);
			this.aClass1_Sub1_Sub2_Sub3_20 = new Class1_Sub1_Sub2_Sub3(this.aClass48_1, "titlebutton", 0);
			@Pc(24) boolean local24 = false;
			this.aClass1_Sub1_Sub2_Sub3Array1 = new Class1_Sub1_Sub2_Sub3[12];
			for (@Pc(35) int local35 = 0; local35 < 12; local35++) {
				this.aClass1_Sub1_Sub2_Sub3Array1[local35] = new Class1_Sub1_Sub2_Sub3(this.aClass48_1, "runes", local35);
			}
			this.aClass1_Sub1_Sub2_Sub2_3 = new Class1_Sub1_Sub2_Sub2(128, 265);
			this.aClass1_Sub1_Sub2_Sub2_4 = new Class1_Sub1_Sub2_Sub2(128, 265);
			for (@Pc(68) int local68 = 0; local68 < 33920; local68++) {
				this.aClass1_Sub1_Sub2_Sub2_3.anIntArray210[local68] = this.aClass37_22.anIntArray233[local68];
			}
			for (@Pc(86) int local86 = 0; local86 < 33920; local86++) {
				this.aClass1_Sub1_Sub2_Sub2_4.anIntArray210[local86] = this.aClass37_23.anIntArray233[local86];
			}
			this.anIntArray66 = new int[256];
			for (@Pc(108) int local108 = 0; local108 < 64; local108++) {
				this.anIntArray66[local108] = local108 * 262144;
			}
			for (@Pc(123) int local123 = 0; local123 < 64; local123++) {
				this.anIntArray66[local123 + 64] = local123 * 1024 + 16711680;
			}
			for (@Pc(142) int local142 = 0; local142 < 64; local142++) {
				this.anIntArray66[local142 + 128] = local142 * 4 + 16776960;
			}
			for (@Pc(161) int local161 = 0; local161 < 64; local161++) {
				this.anIntArray66[local161 + 192] = 16777215;
			}
			this.anIntArray67 = new int[256];
			for (@Pc(180) int local180 = 0; local180 < 64; local180++) {
				this.anIntArray67[local180] = local180 * 1024;
			}
			for (@Pc(195) int local195 = 0; local195 < 64; local195++) {
				this.anIntArray67[local195 + 64] = local195 * 4 + 65280;
			}
			for (@Pc(214) int local214 = 0; local214 < 64; local214++) {
				this.anIntArray67[local214 + 128] = local214 * 262144 + 65535;
			}
			for (@Pc(233) int local233 = 0; local233 < 64; local233++) {
				this.anIntArray67[local233 + 192] = 16777215;
			}
			this.anIntArray68 = new int[256];
			for (@Pc(252) int local252 = 0; local252 < 64; local252++) {
				this.anIntArray68[local252] = local252 * 4;
			}
			for (@Pc(267) int local267 = 0; local267 < 64; local267++) {
				this.anIntArray68[local267 + 64] = local267 * 262144 + 255;
			}
			for (@Pc(286) int local286 = 0; local286 < 64; local286++) {
				this.anIntArray68[local286 + 128] = local286 * 1024 + 16711935;
			}
			for (@Pc(305) int local305 = 0; local305 < 64; local305++) {
				this.anIntArray68[local305 + 192] = 16777215;
			}
			this.anIntArray65 = new int[256];
			this.anIntArray88 = new int[32768];
			this.anIntArray89 = new int[32768];
			this.method136(null);
			this.anIntArray54 = new int[32768];
			this.anIntArray55 = new int[32768];
			this.method97(10, "Connecting to fileserver");
			if (!this.aBoolean47) {
				this.aBoolean57 = true;
				this.aBoolean47 = true;
				this.method96(this, 2);
			}
		} catch (@Pc(362) RuntimeException local362) {
			signlink.reporterror("47454, " + arg0 + ", " + local362.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method111() {
		try {
			if (this.anInt410 != 0) {
				@Pc(6) Class1_Sub1_Sub2_Sub4 local6 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(8) int local8 = 0;
				if (this.anInt293 != 0) {
					local8 = 1;
				}
				for (@Pc(25) int local25 = 0; local25 < 100; local25++) {
					if (this.aStringArray4[local25] != null) {
						@Pc(37) int local37 = this.anIntArray45[local25];
						@Pc(42) String local42 = this.aStringArray3[local25];
						@Pc(44) byte local44 = 0;
						if (local42 != null && local42.startsWith("@cr1@")) {
							local42 = local42.substring(5);
							local44 = 1;
						}
						if (local42 != null && local42.startsWith("@cr2@")) {
							local42 = local42.substring(5);
							local44 = 2;
						}
						@Pc(95) int local95;
						if ((local37 == 3 || local37 == 7) && (local37 == 7 || this.anInt381 == 0 || this.anInt381 == 1 && this.method151(local42, 809))) {
							local95 = 329 - local8 * 13;
							local6.method468(local95, 0, "From", 4);
							local6.method468(local95 - 1, 65535, "From", 4);
							@Pc(120) int local120 = local6.method467("From ") + 4;
							if (local44 == 1) {
								this.aClass1_Sub1_Sub2_Sub3Array3[0].method445(local120, local95 - 12);
								local120 += 14;
							}
							if (local44 == 2) {
								this.aClass1_Sub1_Sub2_Sub3Array3[1].method445(local120, local95 - 12);
								local120 += 14;
							}
							local6.method468(local95, 0, local42 + ": " + this.aStringArray4[local25], local120);
							local6.method468(local95 - 1, 65535, local42 + ": " + this.aStringArray4[local25], local120);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local37 == 5 && this.anInt381 < 2) {
							local95 = 329 - local8 * 13;
							local6.method468(local95, 0, this.aStringArray4[local25], 4);
							local6.method468(local95 - 1, 65535, this.aStringArray4[local25], 4);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local37 == 6 && this.anInt381 < 2) {
							local95 = 329 - local8 * 13;
							local6.method468(local95, 0, "To " + local42 + ": " + this.aStringArray4[local25], 4);
							local6.method468(local95 - 1, 65535, "To " + local42 + ": " + this.aStringArray4[local25], 4);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(299) RuntimeException local299) {
			signlink.reporterror("31487, " + -154 + ", " + local299.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLclient!mb;)V")
	private void method112(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(13) int local13;
			@Pc(22) int local22;
			@Pc(29) int local29;
			@Pc(32) int local32;
			@Pc(36) int local36;
			@Pc(40) int local40;
			@Pc(45) int local45;
			@Pc(50) int local50;
			if (arg0 == 70 || arg0 == 88) {
				local13 = arg1.method498();
				local22 = this.anInt364 + (local13 >> 4 & 0x7);
				local29 = this.anInt365 + (local13 & 0x7);
				local32 = arg1.method498();
				local36 = local32 >> 2;
				local40 = local32 & 0x3;
				local45 = this.anIntArray53[local36];
				if (arg0 == 88) {
					local50 = -1;
				} else {
					local50 = arg1.method500();
				}
				if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104) {
					this.method141(0, local45, this.anInt366, this.anInt432, local22, local36, -1, local40, local29, local50);
				}
			} else {
				@Pc(141) int local141;
				@Pc(153) int local153;
				@Pc(167) int local167;
				@Pc(179) int local179;
				if (arg0 == 30) {
					local13 = arg1.method498();
					local22 = this.anInt364 + (local13 >> 4 & 0x7);
					local29 = this.anInt365 + (local13 & 0x7);
					local32 = arg1.method498();
					local36 = local32 >> 2;
					local40 = local32 & 0x3;
					local45 = this.anIntArray53[local36];
					local50 = arg1.method500();
					if (local22 >= 0 && local29 >= 0 && local22 < 103 && local29 < 103) {
						local141 = this.anIntArrayArrayArray3[this.anInt432][local22][local29];
						local153 = this.anIntArrayArrayArray3[this.anInt432][local22 + 1][local29];
						local167 = this.anIntArrayArrayArray3[this.anInt432][local22 + 1][local29 + 1];
						local179 = this.anIntArrayArrayArray3[this.anInt432][local22][local29 + 1];
						if (local45 == 0) {
							@Pc(190) Class36 local190 = this.aClass39_1.method566(this.anInt432, local29, local22);
							if (local190 != null) {
								@Pc(199) int local199 = local190.anInt870 >> 14 & 0x7FFF;
								if (local36 == 2) {
									local190.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(1, local167, local141, local199, 2, local40 + 4, local179, local50, false, local153);
									local190.aClass1_Sub1_Sub1_8 = new Class1_Sub1_Sub1_Sub2(1, local167, local141, local199, 2, local40 + 1 & 0x3, local179, local50, false, local153);
								} else {
									local190.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(1, local167, local141, local199, local36, local40, local179, local50, false, local153);
								}
							}
						}
						if (local45 == 1) {
							@Pc(268) Class16 local268 = this.aClass39_1.method567(this.anInt443, local22, local29, this.anInt432);
							if (local268 != null) {
								local268.aClass1_Sub1_Sub1_1 = new Class1_Sub1_Sub1_Sub2(1, local167, local141, local268.anInt647 >> 14 & 0x7FFF, 4, 0, local179, local50, false, local153);
							}
						}
						if (local45 == 2) {
							@Pc(302) Class33 local302 = this.aClass39_1.method568(local22, this.anInt432, local29);
							if (local36 == 11) {
								local36 = 10;
							}
							if (local302 != null) {
								local302.aClass1_Sub1_Sub1_6 = new Class1_Sub1_Sub1_Sub2(1, local167, local141, local302.anInt860 >> 14 & 0x7FFF, local36, local40, local179, local50, false, local153);
							}
						}
						if (local45 == 3) {
							@Pc(341) Class20 local341 = this.aClass39_1.method569(local22, local29, this.anInt432);
							if (local341 != null) {
								local341.aClass1_Sub1_Sub1_2 = new Class1_Sub1_Sub1_Sub2(1, local167, local141, local341.anInt702 >> 14 & 0x7FFF, 22, local40, local179, local50, false, local153);
							}
						}
					}
				} else {
					@Pc(406) Class1_Sub1_Sub1_Sub3 local406;
					if (arg0 == 120) {
						local13 = arg1.method498();
						local22 = this.anInt364 + (local13 >> 4 & 0x7);
						local29 = this.anInt365 + (local13 & 0x7);
						local32 = arg1.method500();
						local36 = arg1.method500();
						if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104) {
							local406 = new Class1_Sub1_Sub1_Sub3();
							local406.anInt488 = local32;
							local406.anInt489 = local36;
							if (this.aClass31ArrayArrayArray1[this.anInt432][local22][local29] == null) {
								this.aClass31ArrayArrayArray1[this.anInt432][local22][local29] = new Class31((byte) -118);
							}
							this.aClass31ArrayArrayArray1[this.anInt432][local22][local29].method520(local406);
							this.method227(local22, local29);
						}
					} else if (arg0 == 115) {
						local13 = arg1.method498();
						local22 = this.anInt364 + (local13 >> 4 & 0x7);
						local29 = this.anInt365 + (local13 & 0x7);
						local32 = arg1.method500();
						if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104) {
							@Pc(496) Class31 local496 = this.aClass31ArrayArrayArray1[this.anInt432][local22][local29];
							if (local496 != null) {
								for (local406 = (Class1_Sub1_Sub1_Sub3) local496.method523(); local406 != null; local406 = (Class1_Sub1_Sub1_Sub3) local496.method525()) {
									if (local406.anInt488 == (local32 & 0x7FFF)) {
										local406.method669();
										break;
									}
								}
								if (local496.method523() == null) {
									this.aClass31ArrayArrayArray1[this.anInt432][local22][local29] = null;
								}
								this.method227(local22, local29);
							}
						}
					} else if (arg0 == 37) {
						local13 = arg1.method498();
						local22 = this.anInt364 + (local13 >> 4 & 0x7);
						local29 = this.anInt365 + (local13 & 0x7);
						local32 = local22 + arg1.method499();
						local36 = local29 + arg1.method499();
						local40 = arg1.method501();
						local45 = arg1.method500();
						local50 = arg1.method498() * 4;
						local141 = arg1.method498() * 4;
						local153 = arg1.method500();
						local167 = arg1.method500();
						local179 = arg1.method498();
						@Pc(599) int local599 = arg1.method498();
						if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104 && local32 >= 0 && local36 >= 0 && local32 < 104 && local36 < 104) {
							local22 = local22 * 128 + 64;
							local29 = local29 * 128 + 64;
							local32 = local32 * 128 + 64;
							local36 = local36 * 128 + 64;
							@Pc(673) Class1_Sub1_Sub1_Sub4 local673 = new Class1_Sub1_Sub1_Sub4(local40, local29, local22, local179, local153 + anInt440, local141, this.method209(this.aBoolean76, local22, local29, this.anInt432) - local50, local599, local45, this.anInt432, local167 + anInt440, true);
							local673.method254(local32, local153 + anInt440, this.method209(this.aBoolean76, local32, local36, this.anInt432) - local141, local36);
							this.aClass31_3.method520(local673);
						}
					} else if (arg0 == 114) {
						local13 = arg1.method498();
						local22 = this.anInt364 + (local13 >> 4 & 0x7);
						local29 = this.anInt365 + (local13 & 0x7);
						local32 = arg1.method500();
						local36 = arg1.method498();
						local40 = arg1.method500();
						if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104) {
							local22 = local22 * 128 + 64;
							local29 = local29 * 128 + 64;
							@Pc(771) Class1_Sub1_Sub1_Sub6 local771 = new Class1_Sub1_Sub1_Sub6(anInt440, local32, this.anInt432, this.method209(this.aBoolean76, local22, local29, this.anInt432) - local36, 535, local40, local22, local29);
							this.aClass31_1.method520(local771);
						}
					} else if (arg0 == 8) {
						local13 = arg1.method498();
						local22 = this.anInt364 + (local13 >> 4 & 0x7);
						local29 = this.anInt365 + (local13 & 0x7);
						local32 = arg1.method500();
						local36 = arg1.method500();
						local40 = arg1.method500();
						if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104 && local40 != this.anInt261) {
							@Pc(825) Class1_Sub1_Sub1_Sub3 local825 = new Class1_Sub1_Sub1_Sub3();
							local825.anInt488 = local32;
							local825.anInt489 = local36;
							if (this.aClass31ArrayArrayArray1[this.anInt432][local22][local29] == null) {
								this.aClass31ArrayArrayArray1[this.anInt432][local22][local29] = new Class31((byte) -118);
							}
							this.aClass31ArrayArrayArray1[this.anInt432][local22][local29].method520(local825);
							this.method227(local22, local29);
						}
					} else {
						if (arg0 == 218) {
							local13 = arg1.method498();
							local22 = this.anInt364 + (local13 >> 4 & 0x7);
							local29 = this.anInt365 + (local13 & 0x7);
							local32 = arg1.method498();
							local36 = local32 >> 2;
							local40 = local32 & 0x3;
							local45 = this.anIntArray53[local36];
							local50 = arg1.method500();
							local141 = arg1.method500();
							local153 = arg1.method500();
							local167 = arg1.method500();
							@Pc(923) byte local923 = arg1.method499();
							@Pc(926) byte local926 = arg1.method499();
							@Pc(929) byte local929 = arg1.method499();
							@Pc(932) byte local932 = arg1.method499();
							@Pc(938) Class1_Sub1_Sub1_Sub1_Sub2 local938;
							if (local167 == this.anInt261) {
								local938 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
							} else {
								local938 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local167];
							}
							if (local938 != null) {
								@Pc(950) Class9 local950 = Class9.method258(local50);
								@Pc(960) int local960 = this.anIntArrayArrayArray3[this.anInt432][local22][local29];
								@Pc(972) int local972 = this.anIntArrayArrayArray3[this.anInt432][local22 + 1][local29];
								@Pc(986) int local986 = this.anIntArrayArrayArray3[this.anInt432][local22 + 1][local29 + 1];
								@Pc(998) int local998 = this.anIntArrayArrayArray3[this.anInt432][local22][local29 + 1];
								@Pc(1008) Class1_Sub1_Sub1_Sub5 local1008 = local950.method264(local36, local40, local960, local972, local986, local998, -1);
								if (local1008 != null) {
									this.method141(local141 + 1, local45, this.anInt366, this.anInt432, local22, 0, local153 + 1, 0, local29, -1);
									local938.anInt180 = local141 + anInt440;
									local938.anInt181 = local153 + anInt440;
									local938.aClass1_Sub1_Sub1_Sub5_1 = local1008;
									@Pc(1044) int local1044 = local950.anInt520;
									@Pc(1047) int local1047 = local950.anInt521;
									if (local40 == 1 || local40 == 3) {
										local1044 = local950.anInt521;
										local1047 = local950.anInt520;
									}
									local938.anInt182 = local22 * 128 + local1044 * 64;
									local938.anInt184 = local29 * 128 + local1047 * 64;
									local938.anInt183 = this.method209(this.aBoolean76, local938.anInt182, local938.anInt184, this.anInt432);
									@Pc(1094) byte local1094;
									if (local923 > local929) {
										local1094 = local923;
										local923 = local929;
										local929 = local1094;
									}
									if (local926 > local932) {
										local1094 = local926;
										local926 = local932;
										local932 = local1094;
									}
									local938.anInt185 = local22 + local923;
									local938.anInt187 = local22 + local929;
									local938.anInt186 = local29 + local926;
									local938.anInt188 = local29 + local932;
								}
							}
						}
						if (arg0 == 98) {
							local13 = arg1.method498();
							local22 = this.anInt364 + (local13 >> 4 & 0x7);
							local29 = this.anInt365 + (local13 & 0x7);
							local32 = arg1.method500();
							local36 = arg1.method500();
							local40 = arg1.method500();
							if (local22 >= 0 && local29 >= 0 && local22 < 104 && local29 < 104) {
								@Pc(1178) Class31 local1178 = this.aClass31ArrayArrayArray1[this.anInt432][local22][local29];
								if (local1178 != null) {
									for (@Pc(1184) Class1_Sub1_Sub1_Sub3 local1184 = (Class1_Sub1_Sub1_Sub3) local1178.method523(); local1184 != null; local1184 = (Class1_Sub1_Sub1_Sub3) local1178.method525()) {
										if (local1184.anInt488 == (local32 & 0x7FFF) && local1184.anInt489 == local36) {
											local1184.anInt489 = local40;
											break;
										}
									}
									this.method227(local22, local29);
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1214) RuntimeException local1214) {
			signlink.reporterror("64020, " + arg0 + ", " + false + ", " + arg1 + ", " + local1214.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!ob;)V")
	private void method113(@OriginalArg(1) Class1_Sub2 arg0) {
		try {
			@Pc(10) int local10 = 0;
			@Pc(12) int local12 = -1;
			@Pc(14) int local14 = 0;
			@Pc(16) int local16 = 0;
			if (arg0.anInt822 == 0) {
				local10 = this.aClass39_1.method570(arg0.anInt821, arg0.anInt823, arg0.anInt824);
			}
			if (arg0.anInt822 == 1) {
				local10 = this.aClass39_1.method571(arg0.anInt821, arg0.anInt824, arg0.anInt823);
			}
			if (arg0.anInt822 == 2) {
				local10 = this.aClass39_1.method572(arg0.anInt821, arg0.anInt823, arg0.anInt824);
			}
			if (arg0.anInt822 == 3) {
				local10 = this.aClass39_1.method573(arg0.anInt821, arg0.anInt823, arg0.anInt824);
			}
			if (local10 != 0) {
				@Pc(85) int local85 = this.aClass39_1.method574(arg0.anInt821, arg0.anInt823, arg0.anInt824, local10);
				local12 = local10 >> 14 & 0x7FFF;
				local14 = local85 & 0x1F;
				local16 = local85 >> 6;
			}
			arg0.anInt825 = local12;
			arg0.anInt827 = local14;
			arg0.anInt826 = local16;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("12313, " + 550 + ", " + arg0 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)I")
	private int method114() {
		try {
			@Pc(3) int local3 = 3;
			if (this.anInt391 < 310) {
				@Pc(21) int local21 = this.anInt388 >> 7;
				@Pc(26) int local26 = this.anInt390 >> 7;
				@Pc(31) int local31 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 >> 7;
				@Pc(36) int local36 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 >> 7;
				if ((this.aByteArrayArrayArray7[this.anInt432][local21][local26] & 0x4) != 0) {
					local3 = this.anInt432;
				}
				@Pc(58) int local58;
				if (local31 > local21) {
					local58 = local31 - local21;
				} else {
					local58 = local21 - local31;
				}
				@Pc(71) int local71;
				if (local36 > local26) {
					local71 = local36 - local26;
				} else {
					local71 = local26 - local36;
				}
				@Pc(86) int local86;
				@Pc(88) int local88;
				if (local58 > local71) {
					local86 = local71 * 65536 / local58;
					local88 = 32768;
					while (local21 != local31) {
						if (local21 < local31) {
							local21++;
						} else if (local21 > local31) {
							local21--;
						}
						if ((this.aByteArrayArrayArray7[this.anInt432][local21][local26] & 0x4) != 0) {
							local3 = this.anInt432;
						}
						local88 += local86;
						if (local88 >= 65536) {
							local88 -= 65536;
							if (local26 < local36) {
								local26++;
							} else if (local26 > local36) {
								local26--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt432][local21][local26] & 0x4) != 0) {
								local3 = this.anInt432;
							}
						}
					}
				} else {
					local86 = local58 * 65536 / local71;
					local88 = 32768;
					while (local26 != local36) {
						if (local26 < local36) {
							local26++;
						} else if (local26 > local36) {
							local26--;
						}
						if ((this.aByteArrayArrayArray7[this.anInt432][local21][local26] & 0x4) != 0) {
							local3 = this.anInt432;
						}
						local88 += local86;
						if (local88 >= 65536) {
							local88 -= 65536;
							if (local21 < local31) {
								local21++;
							} else if (local21 > local31) {
								local21--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt432][local21][local26] & 0x4) != 0) {
								local3 = this.anInt432;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray7[this.anInt432][aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 >> 7][aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 >> 7] & 0x4) != 0) {
				local3 = this.anInt432;
			}
			return local3;
		} catch (@Pc(254) RuntimeException local254) {
			signlink.reporterror("55388, " + 5 + ", " + local254.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)I")
	private int method115() {
		try {
			@Pc(10) int local10 = this.method209(this.aBoolean76, this.anInt388, this.anInt390, this.anInt432);
			return local10 - this.anInt389 >= 800 || (this.aByteArrayArrayArray7[this.anInt432][this.anInt388 >> 7][this.anInt390 >> 7] & 0x4) == 0 ? 3 : this.anInt432;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("73417, " + 0 + ", " + local45.toString());
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZI)V")
	private void method116(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		try {
			signlink.anInt927 = arg2;
			if (arg0 < 3 || arg0 > 3) {
				this.anInt442 = 484;
			}
			if (arg1) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("8907, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method117() {
		try {
			if (this.anInt342 > 0) {
				this.method192();
			} else {
				this.aClass37_5.method538();
				this.aClass1_Sub1_Sub2_Sub4_2.method465(257, "Connection lost", 144, 0);
				this.aClass1_Sub1_Sub2_Sub4_2.method465(256, "Connection lost", 143, 16777215);
				this.aClass1_Sub1_Sub2_Sub4_2.method465(257, "Please wait - attempting to reestablish", 159, 0);
				this.aClass1_Sub1_Sub2_Sub4_2.method465(256, "Please wait - attempting to reestablish", 158, 16777215);
				this.aClass37_5.method539(super.aGraphics2, 4, 4);
				this.anInt452 = 0;
				@Pc(66) Class8 local66 = this.aClass8_1;
				this.aBoolean74 = false;
				this.method106(this.aString14, this.aString15, true);
				if (!this.aBoolean74) {
					this.method192();
				}
				try {
					local66.method244();
				} catch (@Pc(86) Exception local86) {
				}
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("36369, " + -889 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)Z")
	private boolean method118(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != this.aByte9) {
				this.aClass1_Sub1_Sub3_4.method488(44);
			}
			return signlink.wavereplay();
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("98194, " + arg0 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	private String method119(@OriginalArg(1) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("73328, " + false + ", " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!mb;B)V")
	private void method120(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) byte arg2) {
		try {
			while (true) {
				if (arg1.anInt777 + 10 < arg0 * 8) {
					@Pc(12) int local12 = arg1.method509(11);
					if (local12 != 2047) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12] = new Class1_Sub1_Sub1_Sub1_Sub2();
							if (this.aClass1_Sub1_Sub3Array1[local12] != null) {
								this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12].method51(this.aClass1_Sub1_Sub3Array1[local12]);
							}
						}
						this.anIntArray59[this.anInt357++] = local12;
						@Pc(58) Class1_Sub1_Sub1_Sub1_Sub2 local58 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12];
						local58.anInt168 = anInt440;
						@Pc(66) int local66 = arg1.method509(5);
						if (local66 > 15) {
							local66 -= 32;
						}
						@Pc(75) int local75 = arg1.method509(5);
						if (local75 > 15) {
							local75 -= 32;
						}
						@Pc(84) int local84 = arg1.method509(1);
						local58.method46(local84 == 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0] + local75, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0] + local66);
						@Pc(110) int local110 = arg1.method509(1);
						if (local110 == 1) {
							this.anIntArray60[this.anInt358++] = local12;
						}
						continue;
					}
				}
				arg1.method510();
				if (arg2 != 4) {
					this.anInt339 = -1;
					return;
				}
				return;
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("73177, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method121() {
		try {
			for (@Pc(6) Class1_Sub1_Sub1_Sub4 local6 = (Class1_Sub1_Sub1_Sub4) this.aClass31_3.method523(); local6 != null; local6 = (Class1_Sub1_Sub1_Sub4) this.aClass31_3.method525()) {
				if (local6.anInt502 != this.anInt432 || anInt440 > local6.anInt508) {
					local6.method669();
				} else if (anInt440 >= local6.anInt507) {
					if (local6.anInt511 > 0) {
						@Pc(43) Class1_Sub1_Sub1_Sub1_Sub1 local43 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local6.anInt511 - 1];
						if (local43 != null && local43.anInt128 >= 0 && local43.anInt128 < 13312 && local43.anInt129 >= 0 && local43.anInt129 < 13312) {
							local6.method254(local43.anInt128, anInt440, this.method209(this.aBoolean76, local43.anInt128, local43.anInt129, local6.anInt502) - local6.anInt506, local43.anInt129);
						}
					}
					if (local6.anInt511 < 0) {
						@Pc(89) int local89 = -local6.anInt511 - 1;
						@Pc(95) Class1_Sub1_Sub1_Sub1_Sub2 local95;
						if (local89 == this.anInt261) {
							local95 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
						} else {
							local95 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local89];
						}
						if (local95 != null && local95.anInt128 >= 0 && local95.anInt128 < 13312 && local95.anInt129 >= 0 && local95.anInt129 < 13312) {
							local6.method254(local95.anInt128, anInt440, this.method209(this.aBoolean76, local95.anInt128, local95.anInt129, local6.anInt502) - local6.anInt506, local95.anInt129);
						}
					}
					local6.method255(this.anInt266, (byte) 5);
					this.aClass39_1.method555(-1, (int) local6.aDouble1, (int) local6.aDouble3, local6, (int) local6.aDouble2, this.anInt432, 60, false, local6.anInt512);
				}
			}
			anInt444++;
			if (anInt444 > 1174) {
				anInt444 = 0;
				this.aClass1_Sub1_Sub3_4.method487(51);
				this.aClass1_Sub1_Sub3_4.method488(0);
				@Pc(196) int local196 = this.aClass1_Sub1_Sub3_4.anInt776;
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_4.method489(11499);
				}
				this.aClass1_Sub1_Sub3_4.method489(10548);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_4.method488(139);
				}
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_4.method488(94);
				}
				this.aClass1_Sub1_Sub3_4.method489(51693);
				this.aClass1_Sub1_Sub3_4.method488(16);
				this.aClass1_Sub1_Sub3_4.method489(15036);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_4.method488(65);
				}
				this.aClass1_Sub1_Sub3_4.method488((int) (Math.random() * 256.0D));
				this.aClass1_Sub1_Sub3_4.method489(22990);
				this.aClass1_Sub1_Sub3_4.method497(this.aClass1_Sub1_Sub3_4.anInt776 - local196, (byte) 7);
			}
		} catch (@Pc(270) RuntimeException local270) {
			signlink.reporterror("23634, " + false + ", " + local270.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method122() {
		try {
			if (this.aClass37_6 == null) {
				this.method206();
				super.aClass37_2 = null;
				this.aClass37_19 = null;
				this.aClass37_20 = null;
				this.aClass37_21 = null;
				this.aClass37_22 = null;
				this.aClass37_23 = null;
				this.aClass37_24 = null;
				this.aClass37_25 = null;
				this.aClass37_26 = null;
				this.aClass37_27 = null;
				this.aClass37_6 = new Class37(479, 96, 0, this.method95());
				this.aClass37_4 = new Class37(172, 156, 0, this.method95());
				Class1_Sub1_Sub2.method456(this.aBoolean52);
				this.aClass1_Sub1_Sub2_Sub3_10.method445(0, 0);
				this.aClass37_3 = new Class37(190, 261, 0, this.method95());
				this.aClass37_5 = new Class37(512, 334, 0, this.method95());
				Class1_Sub1_Sub2.method456(this.aBoolean52);
				this.aClass37_7 = new Class37(496, 50, 0, this.method95());
				this.aClass37_8 = new Class37(269, 37, 0, this.method95());
				this.aClass37_9 = new Class37(249, 45, 0, this.method95());
				this.aBoolean68 = true;
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("12118, " + true + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBIIII)V")
	private void method123(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(8) int local8 = this.aClass39_1.method570(arg5, arg3, arg4);
			if (arg1 == -81) {
				@Pc(22) int local22;
				@Pc(28) int local28;
				@Pc(32) int local32;
				@Pc(34) int local34;
				@Pc(56) int local56;
				@Pc(62) int local62;
				if (local8 != 0) {
					local22 = this.aClass39_1.method574(arg5, arg3, arg4, local8);
					local28 = local22 >> 6 & 0x3;
					local32 = local22 & 0x1F;
					local34 = arg0;
					if (local8 > 0) {
						local34 = arg2;
					}
					@Pc(42) int[] local42 = this.aClass1_Sub1_Sub2_Sub2_13.anIntArray210;
					local56 = arg3 * 4 + (103 - arg4) * 512 * 4 + 24624;
					local62 = local8 >> 14 & 0x7FFF;
					@Pc(65) Class9 local65 = Class9.method258(local62);
					if (local65.anInt525 == -1) {
						if (local32 == 0 || local32 == 2) {
							if (local28 == 0) {
								local42[local56] = local34;
								local42[local56 + 512] = local34;
								local42[local56 + 1024] = local34;
								local42[local56 + 1536] = local34;
							} else if (local28 == 1) {
								local42[local56] = local34;
								local42[local56 + 1] = local34;
								local42[local56 + 2] = local34;
								local42[local56 + 3] = local34;
							} else if (local28 == 2) {
								local42[local56 + 3] = local34;
								local42[local56 + 3 + 512] = local34;
								local42[local56 + 3 + 1024] = local34;
								local42[local56 + 3 + 1536] = local34;
							} else if (local28 == 3) {
								local42[local56 + 1536] = local34;
								local42[local56 + 1536 + 1] = local34;
								local42[local56 + 1536 + 2] = local34;
								local42[local56 + 1536 + 3] = local34;
							}
						}
						if (local32 == 3) {
							if (local28 == 0) {
								local42[local56] = local34;
							} else if (local28 == 1) {
								local42[local56 + 3] = local34;
							} else if (local28 == 2) {
								local42[local56 + 3 + 1536] = local34;
							} else if (local28 == 3) {
								local42[local56 + 1536] = local34;
							}
						}
						if (local32 == 2) {
							if (local28 == 3) {
								local42[local56] = local34;
								local42[local56 + 512] = local34;
								local42[local56 + 1024] = local34;
								local42[local56 + 1536] = local34;
							} else if (local28 == 0) {
								local42[local56] = local34;
								local42[local56 + 1] = local34;
								local42[local56 + 2] = local34;
								local42[local56 + 3] = local34;
							} else if (local28 == 1) {
								local42[local56 + 3] = local34;
								local42[local56 + 3 + 512] = local34;
								local42[local56 + 3 + 1024] = local34;
								local42[local56 + 3 + 1536] = local34;
							} else if (local28 == 2) {
								local42[local56 + 1536] = local34;
								local42[local56 + 1536 + 1] = local34;
								local42[local56 + 1536 + 2] = local34;
								local42[local56 + 1536 + 3] = local34;
							}
						}
					} else {
						@Pc(75) Class1_Sub1_Sub2_Sub3 local75 = this.aClass1_Sub1_Sub2_Sub3Array4[local65.anInt525];
						if (local75 != null) {
							@Pc(87) int local87 = (local65.anInt520 * 4 - local75.anInt718) / 2;
							@Pc(97) int local97 = (local65.anInt521 * 4 - local75.anInt719) / 2;
							local75.method445(arg3 * 4 + local87 + 48, (104 - arg4 - local65.anInt521) * 4 + 48 + local97);
						}
					}
				}
				local8 = this.aClass39_1.method572(arg5, arg3, arg4);
				if (local8 != 0) {
					local22 = this.aClass39_1.method574(arg5, arg3, arg4, local8);
					local28 = local22 >> 6 & 0x3;
					local32 = local22 & 0x1F;
					local34 = local8 >> 14 & 0x7FFF;
					@Pc(451) Class9 local451 = Class9.method258(local34);
					@Pc(483) int local483;
					if (local451.anInt525 != -1) {
						@Pc(461) Class1_Sub1_Sub2_Sub3 local461 = this.aClass1_Sub1_Sub2_Sub3Array4[local451.anInt525];
						if (local461 != null) {
							local62 = (local451.anInt520 * 4 - local461.anInt718) / 2;
							local483 = (local451.anInt521 * 4 - local461.anInt719) / 2;
							local461.method445(arg3 * 4 + local62 + 48, (104 - arg4 - local451.anInt521) * 4 + 48 + local483);
						}
					} else if (local32 == 9) {
						local56 = 15658734;
						if (local8 > 0) {
							local56 = 15597568;
						}
						@Pc(520) int[] local520 = this.aClass1_Sub1_Sub2_Sub2_13.anIntArray210;
						local483 = arg3 * 4 + (103 - arg4) * 512 * 4 + 24624;
						if (local28 == 0 || local28 == 2) {
							local520[local483 + 1536] = local56;
							local520[local483 + 1024 + 1] = local56;
							local520[local483 + 512 + 2] = local56;
							local520[local483 + 3] = local56;
						} else {
							local520[local483] = local56;
							local520[local483 + 512 + 1] = local56;
							local520[local483 + 1024 + 2] = local56;
							local520[local483 + 1536 + 3] = local56;
						}
					}
				}
				local8 = this.aClass39_1.method573(arg5, arg3, arg4);
				if (local8 != 0) {
					local22 = local8 >> 14 & 0x7FFF;
					@Pc(615) Class9 local615 = Class9.method258(local22);
					if (local615.anInt525 != -1) {
						@Pc(625) Class1_Sub1_Sub2_Sub3 local625 = this.aClass1_Sub1_Sub2_Sub3Array4[local615.anInt525];
						if (local625 != null) {
							local34 = (local615.anInt520 * 4 - local625.anInt718) / 2;
							@Pc(647) int local647 = (local615.anInt521 * 4 - local625.anInt719) / 2;
							local625.method445(arg3 * 4 + local34 + 48, (104 - arg4 - local615.anInt521) * 4 + 48 + local647);
							return;
						}
					}
				}
			}
		} catch (@Pc(671) RuntimeException local671) {
			signlink.reporterror("89308, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local671.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method124() {
		try {
			@Pc(2) int local2 = this.anInt278;
			@Pc(5) int local5 = this.anInt279;
			@Pc(8) int local8 = this.anInt280;
			@Pc(11) int local11 = this.anInt281;
			Class1_Sub1_Sub2.method458(6116423, local8, local5, local11, local2);
			Class1_Sub1_Sub2.method458(0, local8 - 2, local5 + 1, 16, local2 + 1);
			Class1_Sub1_Sub2.method459(local11 - 19, local5 + 18, local2 + 1, local8 - 2, this.anInt367, 0);
			this.aClass1_Sub1_Sub2_Sub4_3.method468(local5 + 14, 6116423, "Choose Option", local2 + 3);
			@Pc(69) int local69 = super.anInt232;
			@Pc(72) int local72 = super.anInt233;
			if (this.anInt277 == 0) {
				local69 -= 4;
				local72 -= 4;
			}
			if (this.anInt277 == 1) {
				local69 -= 553;
				local72 -= 205;
			}
			if (this.anInt277 == 2) {
				local69 -= 17;
				local72 -= 357;
			}
			for (@Pc(91) int local91 = 0; local91 < this.anInt407; local91++) {
				@Pc(106) int local106 = local5 + (this.anInt407 - 1 - local91) * 15 + 31;
				@Pc(108) int local108 = 16777215;
				if (local69 > local2 && local69 < local2 + local8 && local72 > local106 - 13 && local72 < local106 + 3) {
					local108 = 16776960;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method470(local108, true, this.aStringArray6[local91], local106, local2 + 3);
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("88064, " + -419 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method125() {
		try {
			if (super.anInt237 == 1) {
				if (super.anInt238 >= 6 && super.anInt238 <= 106 && super.anInt239 >= 467 && super.anInt239 <= 499) {
					this.anInt250 = (this.anInt250 + 1) % 4;
					this.aBoolean79 = true;
					this.aBoolean49 = true;
					this.aClass1_Sub1_Sub3_4.method487(129);
					this.aClass1_Sub1_Sub3_4.method488(this.anInt250);
					this.aClass1_Sub1_Sub3_4.method488(this.anInt381);
					this.aClass1_Sub1_Sub3_4.method488(this.anInt252);
				}
				if (super.anInt238 >= 135 && super.anInt238 <= 235 && super.anInt239 >= 467 && super.anInt239 <= 499) {
					this.anInt381 = (this.anInt381 + 1) % 3;
					this.aBoolean79 = true;
					this.aBoolean49 = true;
					this.aClass1_Sub1_Sub3_4.method487(129);
					this.aClass1_Sub1_Sub3_4.method488(this.anInt250);
					this.aClass1_Sub1_Sub3_4.method488(this.anInt381);
					this.aClass1_Sub1_Sub3_4.method488(this.anInt252);
				}
				if (super.anInt238 >= 273 && super.anInt238 <= 373 && super.anInt239 >= 467 && super.anInt239 <= 499) {
					this.anInt252 = (this.anInt252 + 1) % 3;
					this.aBoolean79 = true;
					this.aBoolean49 = true;
					this.aClass1_Sub1_Sub3_4.method487(129);
					this.aClass1_Sub1_Sub3_4.method488(this.anInt250);
					this.aClass1_Sub1_Sub3_4.method488(this.anInt381);
					this.aClass1_Sub1_Sub3_4.method488(this.anInt252);
				}
				if (super.anInt238 >= 412 && super.anInt238 <= 512 && super.anInt239 >= 467 && super.anInt239 <= 499) {
					this.method188();
					this.aString16 = "";
					this.aBoolean65 = false;
					for (@Pc(184) int local184 = 0; local184 < Class6.aClass6Array1.length; local184++) {
						if (Class6.aClass6Array1[local184] != null && Class6.aClass6Array1[local184].anInt461 == 600) {
							this.anInt306 = this.anInt348 = Class6.aClass6Array1[local184].anInt458;
							return;
						}
					}
					return;
				}
			}
		} catch (@Pc(213) RuntimeException local213) {
			signlink.reporterror("4649, " + false + ", " + local213.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method126() {
		try {
			if (this.anInt403 == 0) {
				@Pc(10) int local10 = super.anInt237;
				if (this.anInt270 == 1 && super.anInt238 >= 516 && super.anInt239 >= 160 && super.anInt238 <= 765 && super.anInt239 <= 205) {
					local10 = 0;
				}
				@Pc(41) int local41;
				@Pc(44) int local44;
				@Pc(120) int local120;
				if (this.aBoolean72) {
					if (local10 != 1) {
						local41 = super.anInt232;
						local44 = super.anInt233;
						if (this.anInt277 == 0) {
							local41 -= 4;
							local44 -= 4;
						}
						if (this.anInt277 == 1) {
							local41 -= 553;
							local44 -= 205;
						}
						if (this.anInt277 == 2) {
							local41 -= 17;
							local44 -= 357;
						}
						if (local41 < this.anInt278 - 10 || local41 > this.anInt278 + this.anInt280 + 10 || local44 < this.anInt279 - 10 || local44 > this.anInt279 + this.anInt281 + 10) {
							this.aBoolean72 = false;
							if (this.anInt277 == 1) {
								this.aBoolean66 = true;
							}
							if (this.anInt277 == 2) {
								this.aBoolean49 = true;
							}
						}
					}
					if (local10 == 1) {
						local41 = this.anInt278;
						local44 = this.anInt279;
						local120 = this.anInt280;
						@Pc(123) int local123 = super.anInt238;
						@Pc(126) int local126 = super.anInt239;
						if (this.anInt277 == 0) {
							local123 -= 4;
							local126 -= 4;
						}
						if (this.anInt277 == 1) {
							local123 -= 553;
							local126 -= 205;
						}
						if (this.anInt277 == 2) {
							local123 -= 17;
							local126 -= 357;
						}
						@Pc(145) int local145 = -1;
						for (@Pc(147) int local147 = 0; local147 < this.anInt407; local147++) {
							@Pc(162) int local162 = local44 + (this.anInt407 - 1 - local147) * 15 + 31;
							if (local123 > local41 && local123 < local41 + local120 && local126 > local162 - 13 && local126 < local162 + 3) {
								local145 = local147;
							}
						}
						if (local145 != -1) {
							this.method193(local145);
						}
						this.aBoolean72 = false;
						if (this.anInt277 == 1) {
							this.aBoolean66 = true;
						}
						if (this.anInt277 == 2) {
							this.aBoolean49 = true;
							return;
						}
					}
				} else {
					if (local10 == 1 && this.anInt407 > 0) {
						local41 = this.anIntArray82[this.anInt407 - 1];
						if (local41 == 582 || local41 == 113 || local41 == 555 || local41 == 331 || local41 == 354 || local41 == 694 || local41 == 962 || local41 == 795 || local41 == 681 || local41 == 100 || local41 == 102 || local41 == 1328) {
							local44 = this.anIntArray80[this.anInt407 - 1];
							local120 = this.anIntArray81[this.anInt407 - 1];
							@Pc(282) Class6 local282 = Class6.aClass6Array1[local120];
							if (local282.aBoolean96 || local282.aBoolean99) {
								this.aBoolean78 = false;
								this.anInt380 = 0;
								this.anInt401 = local120;
								this.anInt402 = local44;
								this.anInt403 = 2;
								this.anInt404 = super.anInt238;
								this.anInt405 = super.anInt239;
								if (Class6.aClass6Array1[local120].anInt458 == this.anInt348) {
									this.anInt403 = 1;
								}
								if (Class6.aClass6Array1[local120].anInt458 == this.anInt343) {
									this.anInt403 = 3;
								}
								return;
							}
						}
					}
					if (local10 == 1 && (this.anInt411 == 1 || this.method135(this.anInt407 - 1)) && this.anInt407 > 2) {
						local10 = 2;
					}
					if (local10 == 1 && this.anInt407 > 0) {
						this.method193(this.anInt407 - 1);
					}
					if (local10 != 2 || this.anInt407 <= 0) {
						return;
					}
					this.method142();
				}
			}
		} catch (@Pc(377) RuntimeException local377) {
			signlink.reporterror("59858, " + -19212 + ", " + local377.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method127(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(13) int local13 = 0; local13 < this.anInt396; local13++) {
					if (this.aLongArray3[local13] == arg0) {
						this.anInt396--;
						this.aBoolean66 = true;
						for (@Pc(33) int local33 = local13; local33 < this.anInt396; local33++) {
							this.aLongArray3[local33] = this.aLongArray3[local33 + 1];
						}
						this.aClass1_Sub1_Sub3_4.method487(193);
						this.aClass1_Sub1_Sub3_4.method494(arg0);
						return;
					}
				}
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("81667, " + arg0 + ", " + -27945 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIZI)V")
	private void method128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg4 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg1 & 0x7FF;
			@Pc(18) int local18 = 0;
			@Pc(20) int local20 = 0;
			@Pc(22) int local22 = arg2;
			@Pc(28) int local28;
			@Pc(32) int local32;
			@Pc(42) int local42;
			if (local5 != 0) {
				local28 = Class1_Sub1_Sub1_Sub5.anIntArray158[local5];
				local32 = Class1_Sub1_Sub1_Sub5.anIntArray159[local5];
				local42 = local32 * 0 - arg2 * local28 >> 16;
				local22 = local28 * 0 + arg2 * local32 >> 16;
				local20 = local42;
			}
			if (local11 != 0) {
				local28 = Class1_Sub1_Sub1_Sub5.anIntArray158[local11];
				local32 = Class1_Sub1_Sub1_Sub5.anIntArray159[local11];
				local42 = local22 * local28 + local32 * 0 >> 16;
				local22 = local22 * local32 - local28 * 0 >> 16;
				local18 = local42;
			}
			this.anInt388 = arg0 - local18;
			this.anInt389 = arg5 - local20;
			this.anInt390 = arg3 - local22;
			this.anInt391 = arg4;
			this.anInt392 = arg1;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("92698, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + false + ", " + arg5 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(III)V")
	private void method129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(5) int local5;
			if (arg2 != 0) {
				for (local5 = 1; local5 > 0; local5++) {
				}
			}
			local5 = 0;
			for (@Pc(14) int local14 = 0; local14 < 100; local14++) {
				if (this.aStringArray4[local14] != null) {
					@Pc(26) int local26 = this.anIntArray45[local14];
					@Pc(37) int local37 = this.anInt319 + 70 + 4 - local5 * 14;
					if (local37 < -20) {
						break;
					}
					@Pc(45) String local45 = this.aStringArray3[local14];
					if (local45 != null && local45.startsWith("@cr1@")) {
						local45 = local45.substring(5);
					}
					if (local45 != null && local45.startsWith("@cr2@")) {
						local45 = local45.substring(5);
					}
					if (local26 == 0) {
						local5++;
					}
					if ((local26 == 1 || local26 == 2) && (local26 == 1 || this.anInt250 == 0 || this.anInt250 == 1 && this.method151(local45, 809))) {
						if (arg0 > local37 - 14 && arg0 <= local37 && !local45.equals(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4)) {
							if (this.anInt413 >= 1) {
								this.aStringArray6[this.anInt407] = "Report abuse @whi@" + local45;
								this.anIntArray82[this.anInt407] = 524;
								this.anInt407++;
							}
							this.aStringArray6[this.anInt407] = "Add ignore @whi@" + local45;
							this.anIntArray82[this.anInt407] = 47;
							this.anInt407++;
							this.aStringArray6[this.anInt407] = "Add friend @whi@" + local45;
							this.anIntArray82[this.anInt407] = 605;
							this.anInt407++;
						}
						local5++;
					}
					if ((local26 == 3 || local26 == 7) && this.anInt410 == 0 && (local26 == 7 || this.anInt381 == 0 || this.anInt381 == 1 && this.method151(local45, 809))) {
						if (arg0 > local37 - 14 && arg0 <= local37) {
							if (this.anInt413 >= 1) {
								this.aStringArray6[this.anInt407] = "Report abuse @whi@" + local45;
								this.anIntArray82[this.anInt407] = 524;
								this.anInt407++;
							}
							this.aStringArray6[this.anInt407] = "Add ignore @whi@" + local45;
							this.anIntArray82[this.anInt407] = 47;
							this.anInt407++;
							this.aStringArray6[this.anInt407] = "Add friend @whi@" + local45;
							this.anIntArray82[this.anInt407] = 605;
							this.anInt407++;
						}
						local5++;
					}
					if (local26 == 4 && (this.anInt252 == 0 || this.anInt252 == 1 && this.method151(local45, 809))) {
						if (arg0 > local37 - 14 && arg0 <= local37) {
							this.aStringArray6[this.anInt407] = "Accept trade @whi@" + local45;
							this.anIntArray82[this.anInt407] = 507;
							this.anInt407++;
						}
						local5++;
					}
					if ((local26 == 5 || local26 == 6) && this.anInt410 == 0 && this.anInt381 < 2) {
						local5++;
					}
					if (local26 == 8 && (this.anInt252 == 0 || this.anInt252 == 1 && this.method151(local45, 809))) {
						if (arg0 > local37 - 14 && arg0 <= local37) {
							this.aStringArray6[this.anInt407] = "Accept duel @whi@" + local45;
							this.anIntArray82[this.anInt407] = 957;
							this.anInt407++;
						}
						local5++;
					}
				}
			}
		} catch (@Pc(410) RuntimeException local410) {
			signlink.reporterror("67294, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local410.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method130() {
		try {
			if (this.anInt395 == 2) {
				this.method161((this.anInt244 - this.anInt385 << 7) + this.anInt247, this.anInt245 * 2, (this.anInt243 - this.anInt384 << 7) + this.anInt246, aBoolean70);
				if (this.anInt267 > -1 && anInt440 % 20 < 10) {
					this.aClass1_Sub1_Sub2_Sub2Array6[2].method406(this.anInt267 - 12, this.anInt268 - 28);
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("47874, " + false + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method131(@OriginalArg(0) String arg0) throws IOException {
		return signlink.mainapp == null ? new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream()) : signlink.openurl(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
	private void method132(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0 && this.anInt302 != -1) {
				this.aString10 = arg1;
				super.anInt237 = 0;
			}
			if (this.anInt343 == -1) {
				this.aBoolean49 = true;
			}
			for (@Pc(22) int local22 = 99; local22 > 0; local22--) {
				this.anIntArray45[local22] = this.anIntArray45[local22 - 1];
				this.aStringArray3[local22] = this.aStringArray3[local22 - 1];
				this.aStringArray4[local22] = this.aStringArray4[local22 - 1];
			}
			this.anIntArray45[0] = arg2;
			this.aStringArray3[0] = arg0;
			this.aStringArray4[0] = arg1;
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("17216, " + -547 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/lang/String;)V")
	@Override
	protected void method97(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		try {
			this.anInt300 = arg0;
			this.aString13 = arg1;
			this.method153();
			if (this.aClass48_1 == null) {
				super.method97(arg0, arg1);
			} else {
				this.aClass37_21.method538();
				this.aClass1_Sub1_Sub2_Sub4_3.method465(180, "RuneScape is loading - please wait...", 54, 16777215);
				Class1_Sub1_Sub2.method459(34, 62, 28, 304, this.anInt367, 9179409);
				Class1_Sub1_Sub2.method459(32, 63, 29, 302, this.anInt367, 0);
				Class1_Sub1_Sub2.method458(9179409, arg0 * 3, 64, 30, 30);
				Class1_Sub1_Sub2.method458(0, 300 - arg0 * 3, 64, 30, arg0 * 3 + 30);
				this.aClass1_Sub1_Sub2_Sub4_3.method465(180, arg1, 85, 16777215);
				this.aClass37_21.method539(super.aGraphics2, 171, 202);
				if (this.aBoolean68) {
					this.aBoolean68 = false;
					if (!this.aBoolean47) {
						this.aClass37_22.method539(super.aGraphics2, 0, 0);
						this.aClass37_23.method539(super.aGraphics2, 0, 637);
					}
					this.aClass37_19.method539(super.aGraphics2, 0, 128);
					this.aClass37_20.method539(super.aGraphics2, 371, 202);
					this.aClass37_24.method539(super.aGraphics2, 265, 0);
					this.aClass37_25.method539(super.aGraphics2, 265, 562);
					this.aClass37_26.method539(super.aGraphics2, 171, 128);
					this.aClass37_27.method539(super.aGraphics2, 171, 562);
				}
			}
		} catch (@Pc(216) RuntimeException local216) {
			signlink.reporterror("63649, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local216.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIII)Z")
	private boolean method133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(7) int local7 = arg2 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass39_1.method574(this.anInt432, arg4, arg1, arg2);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			anInt301++;
			if (anInt301 > 1086) {
				anInt301 = 0;
				this.aClass1_Sub1_Sub3_4.method487(225);
				this.aClass1_Sub1_Sub3_4.method488(0);
				@Pc(53) int local53 = this.aClass1_Sub1_Sub3_4.anInt776;
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_4.method489(16791);
				}
				this.aClass1_Sub1_Sub3_4.method488(254);
				this.aClass1_Sub1_Sub3_4.method489((int) (Math.random() * 65536.0D));
				this.aClass1_Sub1_Sub3_4.method489(16128);
				this.aClass1_Sub1_Sub3_4.method489(52610);
				this.aClass1_Sub1_Sub3_4.method489((int) (Math.random() * 65536.0D));
				this.aClass1_Sub1_Sub3_4.method489(55420);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_4.method489(35025);
				}
				this.aClass1_Sub1_Sub3_4.method489(46628);
				this.aClass1_Sub1_Sub3_4.method488((int) (Math.random() * 256.0D));
				this.aClass1_Sub1_Sub3_4.method497(this.aClass1_Sub1_Sub3_4.anInt776 - local53, (byte) 7);
			}
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(133) Class9 local133 = Class9.method258(local7);
				@Pc(141) int local141;
				@Pc(144) int local144;
				if (local31 == 0 || local31 == 2) {
					local141 = local133.anInt520;
					local144 = local133.anInt521;
				} else {
					local141 = local133.anInt521;
					local144 = local133.anInt520;
				}
				@Pc(155) int local155 = local133.anInt532;
				if (local31 != 0) {
					local155 = (local155 << local31 & 0xF) + (local155 >> 4 - local31);
				}
				this.method109(2, local155, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], 0, arg1, false, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], 0, arg4, local144, local141);
			} else {
				this.method109(2, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], local31, arg1, false, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], local25 + 1, arg4, 0, 0);
			}
			this.anInt434 = super.anInt238;
			this.anInt435 = super.anInt239;
			this.anInt437 = 2;
			this.anInt436 = 0;
			this.aClass1_Sub1_Sub3_4.method487(arg0);
			this.anInt338 += arg3;
			this.aClass1_Sub1_Sub3_4.method489(arg4 + this.anInt384);
			this.aClass1_Sub1_Sub3_4.method489(arg1 + this.anInt385);
			this.aClass1_Sub1_Sub3_4.method489(local7);
			return true;
		} catch (@Pc(261) RuntimeException local261) {
			signlink.reporterror("77634, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local261.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method134() {
		try {
			this.anInt431++;
			this.method202(true);
			this.method222(true);
			this.method202(false);
			this.method222(false);
			this.method121();
			this.method204();
			@Pc(35) int local35;
			@Pc(74) int local74;
			if (!this.aBoolean73) {
				local35 = this.anInt296;
				if (this.anInt382 / 256 > local35) {
					local35 = this.anInt382 / 256;
				}
				if (this.aBooleanArray5[4] && this.anIntArray34[4] + 128 > local35) {
					local35 = this.anIntArray34[4] + 128;
				}
				local74 = this.anInt297 + this.anInt450 & 0x7FF;
				this.method128(this.anInt304, local74, local35 * 3 + 600, this.anInt305, local35, this.method209(this.aBoolean76, aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128, aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129, this.anInt432) - 50);
			}
			if (this.aBoolean73) {
				local35 = this.method115();
			} else {
				local35 = this.method114();
			}
			local74 = this.anInt388;
			@Pc(119) int local119 = this.anInt389;
			@Pc(122) int local122 = this.anInt390;
			@Pc(125) int local125 = this.anInt391;
			@Pc(128) int local128 = this.anInt392;
			@Pc(177) int local177;
			for (@Pc(130) int local130 = 0; local130 < 5; local130++) {
				if (this.aBooleanArray5[local130]) {
					local177 = (int) (Math.random() * (double) (this.anIntArray48[local130] * 2 + 1) - (double) this.anIntArray48[local130] + Math.sin((double) this.anIntArray94[local130] * ((double) this.anIntArray56[local130] / 100.0D)) * (double) this.anIntArray34[local130]);
					if (local130 == 0) {
						this.anInt388 += local177;
					}
					if (local130 == 1) {
						this.anInt389 += local177;
					}
					if (local130 == 2) {
						this.anInt390 += local177;
					}
					if (local130 == 3) {
						this.anInt392 = this.anInt392 + local177 & 0x7FF;
					}
					if (local130 == 4) {
						this.anInt391 += local177;
						if (this.anInt391 < 128) {
							this.anInt391 = 128;
						}
						if (this.anInt391 > 383) {
							this.anInt391 = 383;
						}
					}
				}
			}
			local177 = Class1_Sub1_Sub2_Sub1.anInt667;
			Class1_Sub1_Sub1_Sub5.aBoolean140 = true;
			Class1_Sub1_Sub1_Sub5.anInt566 = 0;
			Class1_Sub1_Sub1_Sub5.anInt564 = super.anInt232 - 4;
			Class1_Sub1_Sub1_Sub5.anInt565 = super.anInt233 - 4;
			Class1_Sub1_Sub2.method456(this.aBoolean52);
			this.aClass39_1.method583(this.anInt391, this.anInt388, this.anInt390, this.anInt392, this.anInt389, local35);
			this.aClass39_1.method558();
			this.method178();
			this.method130();
			this.method159(this.anInt313, local177);
			this.method170(621);
			this.aClass37_5.method539(super.aGraphics2, 4, 4);
			this.anInt388 = local74;
			this.anInt389 = local119;
			this.anInt390 = local122;
			this.anInt391 = local125;
			this.anInt392 = local128;
		} catch (@Pc(322) RuntimeException local322) {
			signlink.reporterror("5413, " + -500 + ", " + local322.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)Z")
	private boolean method135(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(8) int local8 = this.anIntArray82[arg0];
			this.anInt338 += 0;
			if (local8 >= 2000) {
				local8 -= 2000;
			}
			return local8 == 605;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("46153, " + arg0 + ", " + 0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!kb;)V")
	private void method136(@OriginalArg(1) Class1_Sub1_Sub2_Sub3 arg0) {
		try {
			for (@Pc(11) int local11 = 0; local11 < this.anIntArray88.length; local11++) {
				this.anIntArray88[local11] = 0;
			}
			@Pc(36) int local36;
			for (@Pc(26) int local26 = 0; local26 < 5000; local26++) {
				local36 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray88[local36] = (int) (Math.random() * 256.0D);
			}
			@Pc(54) int local54;
			@Pc(58) int local58;
			@Pc(66) int local66;
			for (local36 = 0; local36 < 20; local36++) {
				for (local54 = 1; local54 < 255; local54++) {
					for (local58 = 1; local58 < 127; local58++) {
						local66 = local58 + (local54 << 7);
						this.anIntArray89[local66] = (this.anIntArray88[local66 - 1] + this.anIntArray88[local66 + 1] + this.anIntArray88[local66 - 128] + this.anIntArray88[local66 + 128]) / 4;
					}
				}
				@Pc(112) int[] local112 = this.anIntArray88;
				this.anIntArray88 = this.anIntArray89;
				this.anIntArray89 = local112;
			}
			if (arg0 != null) {
				local54 = 0;
				for (local58 = 0; local58 < arg0.anInt719; local58++) {
					for (local66 = 0; local66 < arg0.anInt718; local66++) {
						if (arg0.aByteArray7[local54++] != 0) {
							@Pc(148) int local148 = local66 + arg0.anInt720 + 16;
							@Pc(155) int local155 = local58 + arg0.anInt721 + 16;
							@Pc(161) int local161 = local148 + (local155 << 7);
							this.anIntArray88[local161] = 0;
						}
					}
				}
			}
		} catch (@Pc(178) RuntimeException local178) {
			signlink.reporterror("92986, " + 2 + ", " + arg0 + ", " + local178.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method92() {
		try {
			signlink.reporterror = false;
			try {
				if (this.aClass8_1 != null) {
					this.aClass8_1.method244();
				}
			} catch (@Pc(11) Exception local11) {
			}
			this.aClass8_1 = null;
			this.method185();
			if (this.aClass11_1 != null) {
				this.aClass11_1.aBoolean141 = false;
			}
			this.aClass11_1 = null;
			this.aClass45_Sub1_1.method649();
			this.aClass45_Sub1_1 = null;
			this.aClass1_Sub1_Sub3_4 = null;
			this.aClass1_Sub1_Sub3_2 = null;
			this.aClass1_Sub1_Sub3_3 = null;
			this.anIntArray69 = null;
			this.aByteArrayArray2 = null;
			this.aByteArrayArray1 = null;
			this.anIntArray70 = null;
			this.anIntArray71 = null;
			this.anIntArrayArrayArray3 = null;
			this.aByteArrayArrayArray7 = null;
			this.aClass39_1 = null;
			this.aClass19Array1 = null;
			this.anIntArrayArray4 = null;
			this.anIntArrayArray2 = null;
			this.anIntArray36 = null;
			this.anIntArray37 = null;
			this.aByteArray2 = null;
			this.aClass37_3 = null;
			this.aClass37_4 = null;
			this.aClass37_5 = null;
			this.aClass37_6 = null;
			this.aClass37_7 = null;
			this.aClass37_8 = null;
			this.aClass37_9 = null;
			this.aClass37_10 = null;
			this.aClass37_11 = null;
			this.aClass37_12 = null;
			this.aClass37_13 = null;
			this.aClass37_14 = null;
			this.aClass37_15 = null;
			this.aClass37_16 = null;
			this.aClass37_17 = null;
			this.aClass37_18 = null;
			this.aClass1_Sub1_Sub2_Sub3_9 = null;
			this.aClass1_Sub1_Sub2_Sub3_10 = null;
			this.aClass1_Sub1_Sub2_Sub3_11 = null;
			this.aClass1_Sub1_Sub2_Sub3_1 = null;
			this.aClass1_Sub1_Sub2_Sub3_2 = null;
			this.aClass1_Sub1_Sub2_Sub3_3 = null;
			this.aClass1_Sub1_Sub2_Sub3Array2 = null;
			this.aClass1_Sub1_Sub2_Sub3_4 = null;
			this.aClass1_Sub1_Sub2_Sub3_5 = null;
			this.aClass1_Sub1_Sub2_Sub3_6 = null;
			this.aClass1_Sub1_Sub2_Sub3_7 = null;
			this.aClass1_Sub1_Sub2_Sub3_8 = null;
			this.aClass1_Sub1_Sub2_Sub3_12 = null;
			this.aClass1_Sub1_Sub2_Sub3_13 = null;
			this.aClass1_Sub1_Sub2_Sub3_14 = null;
			this.aClass1_Sub1_Sub2_Sub3_15 = null;
			this.aClass1_Sub1_Sub2_Sub3_16 = null;
			this.aClass1_Sub1_Sub2_Sub2_5 = null;
			this.aClass1_Sub1_Sub2_Sub2Array3 = null;
			this.aClass1_Sub1_Sub2_Sub2Array6 = null;
			this.aClass1_Sub1_Sub2_Sub2Array5 = null;
			this.aClass1_Sub1_Sub2_Sub2_6 = null;
			this.aClass1_Sub1_Sub2_Sub2_7 = null;
			this.aClass1_Sub1_Sub2_Sub2_8 = null;
			this.aClass1_Sub1_Sub2_Sub2_9 = null;
			this.aClass1_Sub1_Sub2_Sub3Array4 = null;
			this.aClass1_Sub1_Sub2_Sub2Array4 = null;
			this.anIntArrayArray5 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub2Array1 = null;
			this.anIntArray59 = null;
			this.anIntArray60 = null;
			this.aClass1_Sub1_Sub3Array1 = null;
			this.anIntArray47 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub1Array1 = null;
			this.anIntArray57 = null;
			this.aClass31ArrayArrayArray1 = null;
			this.aClass31_2 = null;
			this.aClass31_3 = null;
			this.aClass31_1 = null;
			this.anIntArray80 = null;
			this.anIntArray81 = null;
			this.anIntArray82 = null;
			this.anIntArray83 = null;
			this.aStringArray6 = null;
			this.anIntArray50 = null;
			this.anIntArray85 = null;
			this.anIntArray86 = null;
			this.aClass1_Sub1_Sub2_Sub2Array7 = null;
			this.aClass1_Sub1_Sub2_Sub2_13 = null;
			this.aStringArray1 = null;
			this.aLongArray4 = null;
			this.anIntArray51 = null;
			this.aClass37_22 = null;
			this.aClass37_23 = null;
			this.aClass37_19 = null;
			this.aClass37_20 = null;
			this.aClass37_21 = null;
			this.aClass37_24 = null;
			this.aClass37_25 = null;
			this.aClass37_26 = null;
			this.aClass37_27 = null;
			this.method206();
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
		} catch (@Pc(371) RuntimeException local371) {
			signlink.reporterror("29568, " + false + ", " + local371.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!d;)Z")
	private boolean method138(@OriginalArg(1) Class6 arg0) {
		try {
			@Pc(10) int local10 = arg0.anInt461;
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
				this.aStringArray6[this.anInt407] = "Remove @whi@" + this.aStringArray1[local10];
				this.anIntArray82[this.anInt407] = 513;
				this.anInt407++;
				this.aStringArray6[this.anInt407] = "Message @whi@" + this.aStringArray1[local10];
				this.anIntArray82[this.anInt407] = 902;
				this.anInt407++;
				return true;
			} else if (local10 >= 401 && local10 <= 500) {
				this.aStringArray6[this.anInt407] = "Remove @whi@" + arg0.aString19;
				this.anIntArray82[this.anInt407] = 884;
				this.anInt407++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("83486, " + 995 + ", " + arg0 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method139() {
		try {
			this.aBoolean60 = true;
			for (@Pc(18) int local18 = 0; local18 < 7; local18++) {
				this.anIntArray87[local18] = -1;
				for (@Pc(27) int local27 = 0; local27 < Class23.anInt753; local27++) {
					if (!Class23.aClass23Array1[local27].aBoolean205 && Class23.aClass23Array1[local27].anInt754 == local18 + (this.aBoolean46 ? 0 : 7)) {
						this.anIntArray87[local18] = local27;
						break;
					}
				}
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("77571, " + -367 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method140() {
		try {
			if (this.anInt410 != 0) {
				@Pc(5) int local5 = 0;
				if (this.anInt293 != 0) {
					local5 = 1;
				}
				for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
					if (this.aStringArray4[local12] != null) {
						@Pc(24) int local24 = this.anIntArray45[local12];
						@Pc(29) String local29 = this.aStringArray3[local12];
						if (local29 != null && local29.startsWith("@cr1@")) {
							local29 = local29.substring(5);
						}
						if (local29 != null && local29.startsWith("@cr2@")) {
							local29 = local29.substring(5);
						}
						if ((local24 == 3 || local24 == 7) && (local24 == 7 || this.anInt381 == 0 || this.anInt381 == 1 && this.method151(local29, 809))) {
							@Pc(82) int local82 = 329 - local5 * 13;
							if (super.anInt232 > 4 && super.anInt233 - 4 > local82 - 10 && super.anInt233 - 4 <= local82 + 3) {
								@Pc(121) int local121 = this.aClass1_Sub1_Sub2_Sub4_2.method467("From:  " + local29 + this.aStringArray4[local12]) + 25;
								if (local121 > 450) {
									local121 = 450;
								}
								if (super.anInt232 < local121 + 4) {
									if (this.anInt413 >= 1) {
										this.aStringArray6[this.anInt407] = "Report abuse @whi@" + local29;
										this.anIntArray82[this.anInt407] = 2524;
										this.anInt407++;
									}
									this.aStringArray6[this.anInt407] = "Add ignore @whi@" + local29;
									this.anIntArray82[this.anInt407] = 2047;
									this.anInt407++;
									this.aStringArray6[this.anInt407] = "Add friend @whi@" + local29;
									this.anIntArray82[this.anInt407] = 2605;
									this.anInt407++;
								}
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local24 == 5 || local24 == 6) && this.anInt381 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(236) RuntimeException local236) {
			signlink.reporterror("1484, " + -812 + ", " + local236.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	private void method141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			@Pc(1) Class1_Sub2 local1 = null;
			for (@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) this.aClass31_2.method523(); local6 != null; local6 = (Class1_Sub2) this.aClass31_2.method525()) {
				if (local6.anInt821 == arg3 && local6.anInt823 == arg4 && local6.anInt824 == arg8 && local6.anInt822 == arg1) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class1_Sub2();
				local1.anInt821 = arg3;
				local1.anInt822 = arg1;
				local1.anInt823 = arg4;
				local1.anInt824 = arg8;
				this.method113(local1);
				this.aClass31_2.method520(local1);
			}
			local1.anInt828 = arg9;
			local1.anInt830 = arg5;
			if (arg2 > 0) {
				local1.anInt829 = arg7;
				local1.anInt831 = arg0;
				local1.anInt832 = arg6;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("13215, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method142() {
		try {
			@Pc(7) int local7 = this.aClass1_Sub1_Sub2_Sub4_3.method467("Choose Option");
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt407; local9++) {
				local20 = this.aClass1_Sub1_Sub2_Sub4_3.method467(this.aStringArray6[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			local7 += 8;
			local20 = this.anInt407 * 15 + 21;
			@Pc(70) int local70;
			@Pc(88) int local88;
			if (super.anInt238 > 4 && super.anInt239 > 4 && super.anInt238 < 516 && super.anInt239 < 338) {
				local70 = super.anInt238 - local7 / 2 - 4;
				if (local70 + local7 > 512) {
					local70 = 512 - local7;
				}
				if (local70 < 0) {
					local70 = 0;
				}
				local88 = super.anInt239 - 4;
				if (local88 + local20 > 334) {
					local88 = 334 - local20;
				}
				if (local88 < 0) {
					local88 = 0;
				}
				this.aBoolean72 = true;
				this.anInt277 = 0;
				this.anInt278 = local70;
				this.anInt279 = local88;
				this.anInt280 = local7;
				this.anInt281 = this.anInt407 * 15 + 22;
			}
			if (super.anInt238 > 553 && super.anInt239 > 205 && super.anInt238 < 743 && super.anInt239 < 466) {
				local70 = super.anInt238 - local7 / 2 - 553;
				if (local70 < 0) {
					local70 = 0;
				} else if (local70 + local7 > 190) {
					local70 = 190 - local7;
				}
				local88 = super.anInt239 - 205;
				if (local88 < 0) {
					local88 = 0;
				} else if (local88 + local20 > 261) {
					local88 = 261 - local20;
				}
				this.aBoolean72 = true;
				this.anInt277 = 1;
				this.anInt278 = local70;
				this.anInt279 = local88;
				this.anInt280 = local7;
				this.anInt281 = this.anInt407 * 15 + 22;
			}
			if (super.anInt238 > 17 && super.anInt239 > 357 && super.anInt238 < 496 && super.anInt239 < 453) {
				local70 = super.anInt238 - local7 / 2 - 17;
				if (local70 < 0) {
					local70 = 0;
				} else if (local70 + local7 > 479) {
					local70 = 479 - local7;
				}
				local88 = super.anInt239 - 357;
				if (local88 < 0) {
					local88 = 0;
				} else if (local88 + local20 > 96) {
					local88 = 96 - local20;
				}
				this.aBoolean72 = true;
				this.anInt277 = 2;
				this.anInt278 = local70;
				this.anInt279 = local88;
				this.anInt280 = local7;
				this.anInt281 = this.anInt407 * 15 + 22;
			}
		} catch (@Pc(292) RuntimeException local292) {
			signlink.reporterror("37678, " + true + ", " + local292.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;BI)I")
	private int method143(@OriginalArg(0) Class6 arg0, @OriginalArg(2) int arg1) {
		try {
			if (arg0.anIntArrayArray6 == null || arg1 >= arg0.anIntArrayArray6.length) {
				return -2;
			}
			try {
				@Pc(21) int[] local21 = arg0.anIntArrayArray6[arg1];
				@Pc(23) int local23 = 0;
				@Pc(25) int local25 = 0;
				@Pc(27) byte local27 = 0;
				while (true) {
					@Pc(32) int local32 = local21[local25++];
					@Pc(34) int local34 = 0;
					@Pc(36) byte local36 = 0;
					if (local32 == 0) {
						return local23;
					}
					if (local32 == 1) {
						local34 = this.anIntArray79[local21[local25++]];
					}
					if (local32 == 2) {
						local34 = this.anIntArray73[local21[local25++]];
					}
					if (local32 == 3) {
						local34 = this.anIntArray35[local21[local25++]];
					}
					@Pc(83) Class6 local83;
					@Pc(88) int local88;
					@Pc(101) int local101;
					if (local32 == 4) {
						local83 = Class6.aClass6Array1[local21[local25++]];
						local88 = local21[local25++];
						if (local88 >= 0 && local88 < Class15.anInt613 && (!Class15.method345(local88).aBoolean164 || aBoolean55)) {
							for (local101 = 0; local101 < local83.anIntArray96.length; local101++) {
								if (local83.anIntArray96[local101] == local88 + 1) {
									local34 += local83.anIntArray97[local101];
								}
							}
						}
					}
					if (local32 == 5) {
						local34 = this.anIntArray50[local21[local25++]];
					}
					if (local32 == 6) {
						local34 = anIntArray72[this.anIntArray73[local21[local25++]] - 1];
					}
					if (local32 == 7) {
						local34 = this.anIntArray50[local21[local25++]] * 100 / 46875;
					}
					if (local32 == 8) {
						local34 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt178;
					}
					@Pc(176) int local176;
					if (local32 == 9) {
						for (local176 = 0; local176 < Class29.anInt833; local176++) {
							if (Class29.aBooleanArray10[local176]) {
								local34 += this.anIntArray73[local176];
							}
						}
					}
					if (local32 == 10) {
						local83 = Class6.aClass6Array1[local21[local25++]];
						local88 = local21[local25++] + 1;
						if (local88 >= 0 && local88 < Class15.anInt613 && (!Class15.method345(local88).aBoolean164 || aBoolean55)) {
							for (local101 = 0; local101 < local83.anIntArray96.length; local101++) {
								if (local83.anIntArray96[local101] == local88) {
									local34 = 999999999;
									break;
								}
							}
						}
					}
					if (local32 == 11) {
						local34 = this.anInt311;
					}
					if (local32 == 12) {
						local34 = this.anInt312;
					}
					if (local32 == 13) {
						local176 = this.anIntArray50[local21[local25++]];
						local88 = local21[local25++];
						local34 = (local176 & 0x1 << local88) == 0 ? 0 : 1;
					}
					if (local32 == 14) {
						local176 = local21[local25++];
						@Pc(291) Class35 local291 = Class35.aClass35Array1[local176];
						local101 = local291.anInt862;
						@Pc(297) int local297 = local291.anInt863;
						@Pc(300) int local300 = local291.anInt864;
						@Pc(306) int local306 = anIntArray74[local300 - local297];
						local34 = this.anIntArray50[local101] >> local297 & local306;
					}
					if (local32 == 15) {
						local36 = 1;
					}
					if (local32 == 16) {
						local36 = 2;
					}
					if (local32 == 17) {
						local36 = 3;
					}
					if (local32 == 18) {
						local34 = (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 >> 7) + this.anInt384;
					}
					if (local32 == 19) {
						local34 = (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 >> 7) + this.anInt385;
					}
					if (local32 == 20) {
						local34 = local21[local25++];
					}
					if (local36 == 0) {
						if (local27 == 0) {
							local23 += local34;
						}
						if (local27 == 1) {
							local23 -= local34;
						}
						if (local27 == 2 && local34 != 0) {
							local23 /= local34;
						}
						if (local27 == 3) {
							local23 *= local34;
						}
						local27 = 0;
					} else {
						local27 = local36;
					}
				}
			} catch (@Pc(399) Exception local399) {
				return -1;
			}
		} catch (@Pc(402) RuntimeException local402) {
			signlink.reporterror("6199, " + arg0 + ", " + 6 + ", " + arg1 + ", " + local402.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method144(@OriginalArg(0) int arg0) {
		try {
			signlink.anInt930 = arg0;
		} catch (@Pc(5) RuntimeException local5) {
			signlink.reporterror("74632, " + arg0 + ", " + false + ", " + local5.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!mb;Z)V")
	private void method145(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) boolean arg2) {
		try {
			this.anInt294 = 0;
			this.anInt358 = 0;
			if (arg2) {
				this.method90();
			}
			this.method187(arg0, arg1);
			this.method205(arg1, arg0);
			this.method120(arg0, arg1, this.aByte10);
			this.method199(arg0, arg1);
			@Pc(41) int local41;
			for (@Pc(34) int local34 = 0; local34 < this.anInt294; local34++) {
				local41 = this.anIntArray47[local34];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local41].anInt168 != anInt440) {
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local41] = null;
				}
			}
			if (arg1.anInt776 != arg0) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.anInt776 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local41 = 0; local41 < this.anInt357; local41++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray59[local41]] == null) {
					signlink.reporterror(this.aString14 + " null entry in pl list - pos:" + local41 + " size:" + this.anInt357);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("73527, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILclient!mb;)V")
	private void method148(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			arg1.method508();
			@Pc(9) int local9 = arg1.method509(8);
			@Pc(15) int local15;
			if (local9 < this.anInt352) {
				for (local15 = local9; local15 < this.anInt352; local15++) {
					this.anIntArray47[this.anInt294++] = this.anIntArray57[local15];
				}
			}
			if (local9 > this.anInt352) {
				signlink.reporterror(this.aString14 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt352 = 0;
			this.aBoolean74 &= true;
			for (local15 = 0; local15 < local9; local15++) {
				@Pc(73) int local73 = this.anIntArray57[local15];
				@Pc(78) Class1_Sub1_Sub1_Sub1_Sub1 local78 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local73];
				@Pc(83) int local83 = arg1.method509(1);
				if (local83 == 0) {
					this.anIntArray57[this.anInt352++] = local73;
					local78.anInt168 = anInt440;
				} else {
					@Pc(106) int local106 = arg1.method509(2);
					if (local106 == 0) {
						this.anIntArray57[this.anInt352++] = local73;
						local78.anInt168 = anInt440;
						this.anIntArray60[this.anInt358++] = local73;
					} else {
						@Pc(157) int local157;
						@Pc(168) int local168;
						if (local106 == 1) {
							this.anIntArray57[this.anInt352++] = local73;
							local78.anInt168 = anInt440;
							local157 = arg1.method509(3);
							local78.method47(this.anInt442, local157, false);
							local168 = arg1.method509(1);
							if (local168 == 1) {
								this.anIntArray60[this.anInt358++] = local73;
							}
						} else if (local106 == 2) {
							this.anIntArray57[this.anInt352++] = local73;
							local78.anInt168 = anInt440;
							local157 = arg1.method509(3);
							local78.method47(this.anInt442, local157, true);
							local168 = arg1.method509(3);
							local78.method47(this.anInt442, local168, true);
							@Pc(228) int local228 = arg1.method509(1);
							if (local228 == 1) {
								this.anIntArray60[this.anInt358++] = local73;
							}
						} else if (local106 == 3) {
							this.anIntArray47[this.anInt294++] = local73;
						}
					}
				}
			}
		} catch (@Pc(265) RuntimeException local265) {
			signlink.reporterror("88811, " + true + ", " + arg0 + ", " + arg1 + ", " + local265.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method149() {
		try {
			@Pc(19) int local19;
			for (@Pc(12) int local12 = 10; local12 < 117; local12++) {
				local19 = (int) (Math.random() * 100.0D);
				if (local19 < 50) {
					this.anIntArray54[local12 + 32512] = 255;
				}
			}
			@Pc(48) int local48;
			@Pc(55) int local55;
			@Pc(61) int local61;
			for (local19 = 0; local19 < 100; local19++) {
				local48 = (int) (Math.random() * 124.0D) + 2;
				local55 = (int) (Math.random() * 128.0D) + 128;
				local61 = local48 + (local55 << 7);
				this.anIntArray54[local61] = 192;
			}
			for (local48 = 1; local48 < 255; local48++) {
				for (local55 = 1; local55 < 127; local55++) {
					local61 = local55 + (local48 << 7);
					this.anIntArray55[local61] = (this.anIntArray54[local61 - 1] + this.anIntArray54[local61 + 1] + this.anIntArray54[local61 - 128] + this.anIntArray54[local61 + 128]) / 4;
				}
			}
			this.anInt433 += 128;
			if (this.anInt433 > this.anIntArray88.length) {
				this.anInt433 -= this.anIntArray88.length;
				local55 = (int) (Math.random() * 12.0D);
				this.method136(this.aClass1_Sub1_Sub2_Sub3Array1[local55]);
			}
			@Pc(173) int local173;
			for (local55 = 1; local55 < 255; local55++) {
				for (local61 = 1; local61 < 127; local61++) {
					local173 = local61 + (local55 << 7);
					@Pc(196) int local196 = this.anIntArray55[local173 + 128] - this.anIntArray88[local173 + this.anInt433 & this.anIntArray88.length - 1] / 5;
					if (local196 < 0) {
						local196 = 0;
					}
					this.anIntArray54[local173] = local196;
				}
			}
			for (local61 = 0; local61 < 255; local61++) {
				this.anIntArray75[local61] = this.anIntArray75[local61 + 1];
			}
			this.anIntArray75[255] = (int) (Math.sin((double) anInt440 / 14.0D) * 16.0D + Math.sin((double) anInt440 / 15.0D) * 14.0D + Math.sin((double) anInt440 / 16.0D) * 12.0D);
			if (this.anInt418 > 0) {
				this.anInt418 -= 4;
			}
			if (this.anInt419 > 0) {
				this.anInt419 -= 4;
			}
			if (this.anInt418 == 0 && this.anInt419 == 0) {
				local173 = (int) (Math.random() * 2000.0D);
				if (local173 == 0) {
					this.anInt418 = 1024;
				}
				if (local173 == 1) {
					this.anInt419 = 1024;
					return;
				}
			}
		} catch (@Pc(307) RuntimeException local307) {
			signlink.reporterror("34874, " + -79 + ", " + local307.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method150() {
		try {
			this.aBoolean74 &= true;
			if (this.anInt415 == 2) {
				for (@Pc(16) Class1_Sub2 local16 = (Class1_Sub2) this.aClass31_2.method523(); local16 != null; local16 = (Class1_Sub2) this.aClass31_2.method525()) {
					if (local16.anInt832 > 0) {
						local16.anInt832--;
					}
					if (local16.anInt832 != 0) {
						if (local16.anInt831 > 0) {
							local16.anInt831--;
						}
						if (local16.anInt831 == 0 && local16.anInt823 >= 1 && local16.anInt824 >= 1 && local16.anInt823 <= 102 && local16.anInt824 <= 102 && (local16.anInt828 < 0 || Class4.method73(local16.anInt830, local16.anInt828))) {
							this.method177(local16.anInt830, local16.anInt824, local16.anInt822, local16.anInt829, local16.anInt823, local16.anInt828, local16.anInt821);
							local16.anInt831 = -1;
							if (local16.anInt828 == local16.anInt825 && local16.anInt825 == -1) {
								local16.method669();
							} else if (local16.anInt828 == local16.anInt825 && local16.anInt829 == local16.anInt826 && local16.anInt830 == local16.anInt827) {
								local16.method669();
							}
						}
					} else if (local16.anInt825 < 0 || Class4.method73(local16.anInt827, local16.anInt825)) {
						this.method177(local16.anInt827, local16.anInt824, local16.anInt822, local16.anInt826, local16.anInt823, local16.anInt825, local16.anInt821);
						local16.method669();
					}
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("58982, " + true + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	private boolean method151(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg0 == null) {
				return false;
			}
			for (@Pc(9) int local9 = 0; local9 < this.anInt378; local9++) {
				if (arg0.equalsIgnoreCase(this.aStringArray1[local9])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("26737, " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method152() {
		try {
			@Pc(17) int local17;
			@Pc(24) int local24;
			if (this.anInt449 == 0) {
				local17 = super.anInt228 / 2 - 80;
				local24 = super.anInt229 / 2 + 20;
				local24 += 20;
				if (super.anInt237 == 1 && super.anInt238 >= local17 - 75 && super.anInt238 <= local17 + 75 && super.anInt239 >= local24 - 20 && super.anInt239 <= local24 + 20) {
					this.anInt449 = 3;
					this.anInt344 = 0;
				}
				local17 = super.anInt228 / 2 + 80;
				if (super.anInt237 == 1 && super.anInt238 >= local17 - 75 && super.anInt238 <= local17 + 75 && super.anInt239 >= local24 - 20 && super.anInt239 <= local24 + 20) {
					this.aString6 = "";
					this.aString7 = "Enter your username & password.";
					this.anInt449 = 2;
					this.anInt344 = 0;
				}
			} else if (this.anInt449 == 2) {
				local17 = super.anInt229 / 2 - 40;
				local17 += 30;
				local17 += 25;
				if (super.anInt237 == 1 && super.anInt239 >= local17 - 15 && super.anInt239 < local17) {
					this.anInt344 = 0;
				}
				local17 += 15;
				if (super.anInt237 == 1 && super.anInt239 >= local17 - 15 && super.anInt239 < local17) {
					this.anInt344 = 1;
				}
				local17 += 15;
				local24 = super.anInt228 / 2 - 80;
				@Pc(170) int local170 = super.anInt229 / 2 + 50;
				@Pc(171) int local171 = local170 + 20;
				if (super.anInt237 == 1 && super.anInt238 >= local24 - 75 && super.anInt238 <= local24 + 75 && super.anInt239 >= local171 - 20 && super.anInt239 <= local171 + 20) {
					this.method106(this.aString14, this.aString15, false);
					if (this.aBoolean74) {
						return;
					}
				}
				local24 = super.anInt228 / 2 + 80;
				if (super.anInt237 == 1 && super.anInt238 >= local24 - 75 && super.anInt238 <= local24 + 75 && super.anInt239 >= local171 - 20 && super.anInt239 <= local171 + 20) {
					this.anInt449 = 0;
					this.aString14 = "";
					this.aString15 = "";
				}
				while (true) {
					while (true) {
						@Pc(258) int local258 = this.method89(716);
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
						if (this.anInt344 == 0) {
							if (local258 == 8 && this.aString14.length() > 0) {
								this.aString14 = this.aString14.substring(0, this.aString14.length() - 1);
							}
							if (local258 == 9 || local258 == 10 || local258 == 13) {
								this.anInt344 = 1;
							}
							if (local263) {
								this.aString14 = this.aString14 + (char) local258;
							}
							if (this.aString14.length() > 12) {
								this.aString14 = this.aString14.substring(0, 12);
							}
						} else if (this.anInt344 == 1) {
							if (local258 == 8 && this.aString15.length() > 0) {
								this.aString15 = this.aString15.substring(0, this.aString15.length() - 1);
							}
							if (local258 == 9 || local258 == 10 || local258 == 13) {
								this.anInt344 = 0;
							}
							if (local263) {
								this.aString15 = this.aString15 + (char) local258;
							}
							if (this.aString15.length() > 20) {
								this.aString15 = this.aString15.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt449 == 3) {
				local17 = super.anInt228 / 2;
				local24 = super.anInt229 / 2 + 50;
				@Pc(422) int local422 = local24 + 20;
				if (super.anInt237 == 1 && super.anInt238 >= local17 - 75 && super.anInt238 <= local17 + 75 && super.anInt239 >= local422 - 20 && super.anInt239 <= local422 + 20) {
					this.anInt449 = 0;
					return;
				}
			}
		} catch (@Pc(455) RuntimeException local455) {
			signlink.reporterror("18422, " + 2 + ", " + local455.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method153() {
		try {
			if (this.aClass37_19 == null) {
				super.aClass37_2 = null;
				this.aClass37_6 = null;
				this.aClass37_4 = null;
				this.aClass37_3 = null;
				this.aClass37_5 = null;
				this.aClass37_7 = null;
				this.aClass37_8 = null;
				this.aClass37_9 = null;
				this.aClass37_22 = new Class37(128, 265, 0, this.method95());
				Class1_Sub1_Sub2.method456(this.aBoolean52);
				this.aClass37_23 = new Class37(128, 265, 0, this.method95());
				Class1_Sub1_Sub2.method456(this.aBoolean52);
				this.aClass37_19 = new Class37(509, 171, 0, this.method95());
				Class1_Sub1_Sub2.method456(this.aBoolean52);
				this.aClass37_20 = new Class37(360, 132, 0, this.method95());
				Class1_Sub1_Sub2.method456(this.aBoolean52);
				this.aClass37_21 = new Class37(360, 200, 0, this.method95());
				Class1_Sub1_Sub2.method456(this.aBoolean52);
				this.aClass37_24 = new Class37(202, 238, 0, this.method95());
				Class1_Sub1_Sub2.method456(this.aBoolean52);
				this.aClass37_25 = new Class37(203, 238, 0, this.method95());
				Class1_Sub1_Sub2.method456(this.aBoolean52);
				this.aClass37_26 = new Class37(74, 94, 0, this.method95());
				Class1_Sub1_Sub2.method456(this.aBoolean52);
				this.aClass37_27 = new Class37(75, 94, 0, this.method95());
				Class1_Sub1_Sub2.method456(this.aBoolean52);
				if (this.aClass48_1 != null) {
					this.method190();
					this.method110((byte) 5);
				}
				this.aBoolean68 = true;
			}
		} catch (@Pc(172) RuntimeException local172) {
			signlink.reporterror("4289, " + 0 + ", " + local172.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method154() {
		try {
			if (super.anInt237 == 1) {
				@Pc(21) int local21 = super.anInt238 - 25 - 550;
				@Pc(28) int local28 = super.anInt239 - 5 - 4;
				if (local21 >= 0 && local28 >= 0 && local21 < 146 && local28 < 151) {
					local21 -= 73;
					local28 -= 75;
					@Pc(48) int local48 = this.anInt297 + this.anInt326 & 0x7FF;
					@Pc(52) int local52 = Class1_Sub1_Sub2_Sub1.anIntArray183[local48];
					@Pc(56) int local56 = Class1_Sub1_Sub2_Sub1.anIntArray184[local48];
					@Pc(65) int local65 = local52 * (this.anInt360 + 256) >> 8;
					@Pc(74) int local74 = local56 * (this.anInt360 + 256) >> 8;
					@Pc(84) int local84 = local28 * local65 + local21 * local74 >> 11;
					@Pc(94) int local94 = local28 * local74 - local21 * local65 >> 11;
					@Pc(101) int local101 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 + local84 >> 7;
					@Pc(108) int local108 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 - local94 >> 7;
					@Pc(129) boolean local129 = this.method109(1, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], 0, local108, true, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], 0, local101, 0, 0);
					if (local129) {
						this.aClass1_Sub1_Sub3_4.method488(local21);
						this.aClass1_Sub1_Sub3_4.method488(local28);
						this.aClass1_Sub1_Sub3_4.method489(this.anInt297);
						this.aClass1_Sub1_Sub3_4.method488(57);
						this.aClass1_Sub1_Sub3_4.method488(this.anInt326);
						this.aClass1_Sub1_Sub3_4.method488(this.anInt360);
						this.aClass1_Sub1_Sub3_4.method488(89);
						this.aClass1_Sub1_Sub3_4.method489(aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128);
						this.aClass1_Sub1_Sub3_4.method489(aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129);
						this.aClass1_Sub1_Sub3_4.method488(this.anInt416);
						this.aClass1_Sub1_Sub3_4.method488(63);
						return;
					}
				}
			}
		} catch (@Pc(183) RuntimeException local183) {
			signlink.reporterror("15965, " + 13 + ", " + local183.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method90() {
		if (signlink.sunjava) {
			super.anInt226 = 5;
		}
		if (aBoolean85) {
			this.aBoolean63 = true;
			return;
		}
		aBoolean85 = true;
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
			this.aBoolean84 = true;
			return;
		}
		@Pc(84) int local84;
		if (signlink.aRandomAccessFile1 != null) {
			for (local84 = 0; local84 < 5; local84++) {
				this.aClass46Array1[local84] = new Class46((byte) 61, signlink.aRandomAccessFile1, signlink.aRandomAccessFileArray1[local84], 500000, local84 + 1);
			}
		}
		try {
			local84 = 5;
			this.anIntArray61[8] = 0;
			while (this.anIntArray61[8] == 0) {
				this.method97(20, "Connecting to web server");
				try {
					@Pc(133) DataInputStream local133 = this.method131("crc" + (int) (Math.random() * 9.9999999E7D));
					@Pc(140) Class1_Sub1_Sub3 local140 = new Class1_Sub1_Sub3(16, new byte[36]);
					local133.readFully(local140.aByteArray9, 0, 36);
					for (@Pc(148) int local148 = 0; local148 < 9; local148++) {
						this.anIntArray61[local148] = local140.method503();
					}
					local133.close();
				} catch (@Pc(164) IOException local164) {
					for (@Pc(166) int local166 = local84; local166 > 0; local166--) {
						this.method97(10, "Error loading - Will retry in " + local166 + " secs.");
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
			this.aClass48_1 = this.method180("title", "title screen", this.anIntArray61[1], 1, 25);
			this.aClass1_Sub1_Sub2_Sub4_1 = new Class1_Sub1_Sub2_Sub4(this.aClass48_1, "p11", (byte) 7);
			this.aClass1_Sub1_Sub2_Sub4_2 = new Class1_Sub1_Sub2_Sub4(this.aClass48_1, "p12", (byte) 7);
			this.aClass1_Sub1_Sub2_Sub4_3 = new Class1_Sub1_Sub2_Sub4(this.aClass48_1, "b12", (byte) 7);
			this.aClass1_Sub1_Sub2_Sub4_4 = new Class1_Sub1_Sub2_Sub4(this.aClass48_1, "q8", (byte) 7);
			this.method190();
			this.method110((byte) 5);
			@Pc(271) Class48 local271 = this.method180("config", "config", this.anIntArray61[2], 2, 30);
			@Pc(283) Class48 local283 = this.method180("interface", "interface", this.anIntArray61[3], 3, 35);
			@Pc(295) Class48 local295 = this.method180("media", "2d graphics", this.anIntArray61[4], 4, 40);
			@Pc(307) Class48 local307 = this.method180("textures", "textures", this.anIntArray61[6], 6, 45);
			@Pc(319) Class48 local319 = this.method180("wordenc", "chat system", this.anIntArray61[7], 7, 50);
			@Pc(331) Class48 local331 = this.method180("sounds", "sound effects", this.anIntArray61[8], 8, 55);
			this.aByteArrayArrayArray7 = new byte[4][104][104];
			this.anIntArrayArrayArray3 = new int[4][105][105];
			this.aClass39_1 = new Class39(104, (byte) 4, 4, this.anIntArrayArrayArray3, 104);
			for (@Pc(356) int local356 = 0; local356 < 4; local356++) {
				this.aClass19Array1[local356] = new Class19((byte) 1, 104, 104);
			}
			this.aClass1_Sub1_Sub2_Sub2_13 = new Class1_Sub1_Sub2_Sub2(512, 512);
			@Pc(391) Class48 local391 = this.method180("versionlist", "update list", this.anIntArray61[5], 5, 60);
			this.method97(60, "Connecting to update server");
			this.aClass45_Sub1_1 = new Class45_Sub1();
			this.aClass45_Sub1_1.method648(local391, this);
			Class14.method324(this.aClass45_Sub1_1.method651());
			Class1_Sub1_Sub1_Sub5.method285(this.aClass45_Sub1_1.method650(0), this.aClass45_Sub1_1);
			if (!aBoolean56) {
				this.anInt426 = 0;
				this.aBoolean87 = false;
				this.aClass45_Sub1_1.method657(2, this.anInt426);
				while (this.aClass45_Sub1_1.method658() > 0) {
					this.method186();
					try {
						Thread.sleep(100L);
					} catch (@Pc(442) Exception local442) {
					}
				}
			}
			this.method97(65, "Requesting animations");
			@Pc(458) int local458 = this.aClass45_Sub1_1.method650(1);
			for (@Pc(460) int local460 = 0; local460 < local458; local460++) {
				this.aClass45_Sub1_1.method657(1, local460);
			}
			@Pc(479) int local479;
			while (this.aClass45_Sub1_1.method658() > 0) {
				local479 = local458 - this.aClass45_Sub1_1.method658();
				if (local479 > 0) {
					this.method97(65, "Loading animations - " + local479 * 100 / local458 + "%");
				}
				this.method186();
				try {
					Thread.sleep(100L);
				} catch (@Pc(505) Exception local505) {
				}
			}
			this.method97(70, "Requesting models");
			local458 = this.aClass45_Sub1_1.method650(0);
			@Pc(531) int local531;
			for (local479 = 0; local479 < local458; local479++) {
				local531 = this.aClass45_Sub1_1.method655(local479, (byte) 1);
				if ((local531 & 0x1) != 0) {
					this.aClass45_Sub1_1.method657(0, local479);
				}
			}
			local458 = this.aClass45_Sub1_1.method658();
			while (this.aClass45_Sub1_1.method658() > 0) {
				local531 = local458 - this.aClass45_Sub1_1.method658();
				if (local531 > 0) {
					this.method97(70, "Loading models - " + local531 * 100 / local458 + "%");
				}
				this.method186();
				try {
					Thread.sleep(100L);
				} catch (@Pc(582) Exception local582) {
				}
			}
			if (this.aClass46Array1[0] != null) {
				this.method97(75, "Requesting maps");
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
						this.method97(75, "Loading maps - " + local531 * 100 / local458 + "%");
					}
					this.method186();
					try {
						Thread.sleep(100L);
					} catch (@Pc(767) Exception local767) {
					}
				}
			}
			local458 = this.aClass45_Sub1_1.method650(0);
			@Pc(788) int local788;
			for (local531 = 0; local531 < local458; local531++) {
				local788 = this.aClass45_Sub1_1.method655(local531, (byte) 1);
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
					this.aClass45_Sub1_1.method660(0, local531, local790);
				}
			}
			this.aClass45_Sub1_1.method653(aBoolean55);
			if (!aBoolean56) {
				local458 = this.aClass45_Sub1_1.method650(2);
				for (local788 = 1; local788 < local458; local788++) {
					if (this.aClass45_Sub1_1.method656(local788)) {
						this.aClass45_Sub1_1.method660(2, local788, (byte) 1);
					}
				}
			}
			this.method97(80, "Unpacking media");
			this.aClass1_Sub1_Sub2_Sub3_9 = new Class1_Sub1_Sub2_Sub3(local295, "invback", 0);
			this.aClass1_Sub1_Sub2_Sub3_11 = new Class1_Sub1_Sub2_Sub3(local295, "chatback", 0);
			this.aClass1_Sub1_Sub2_Sub3_10 = new Class1_Sub1_Sub2_Sub3(local295, "mapback", 0);
			this.aClass1_Sub1_Sub2_Sub3_1 = new Class1_Sub1_Sub2_Sub3(local295, "backbase1", 0);
			this.aClass1_Sub1_Sub2_Sub3_2 = new Class1_Sub1_Sub2_Sub3(local295, "backbase2", 0);
			this.aClass1_Sub1_Sub2_Sub3_3 = new Class1_Sub1_Sub2_Sub3(local295, "backhmid1", 0);
			for (local788 = 0; local788 < 13; local788++) {
				this.aClass1_Sub1_Sub2_Sub3Array2[local788] = new Class1_Sub1_Sub2_Sub3(local295, "sideicons", local788);
			}
			this.aClass1_Sub1_Sub2_Sub2_5 = new Class1_Sub1_Sub2_Sub2(local295, "compass", 0);
			this.aClass1_Sub1_Sub2_Sub2_12 = new Class1_Sub1_Sub2_Sub2(local295, "mapedge", 0);
			this.aClass1_Sub1_Sub2_Sub2_12.method403();
			@Pc(990) int local990;
			try {
				for (local990 = 0; local990 < 50; local990++) {
					this.aClass1_Sub1_Sub2_Sub3Array4[local990] = new Class1_Sub1_Sub2_Sub3(local295, "mapscene", local990);
				}
			} catch (@Pc(1008) Exception local1008) {
			}
			try {
				for (local990 = 0; local990 < 50; local990++) {
					this.aClass1_Sub1_Sub2_Sub2Array4[local990] = new Class1_Sub1_Sub2_Sub2(local295, "mapfunction", local990);
				}
			} catch (@Pc(1028) Exception local1028) {
			}
			try {
				for (local990 = 0; local990 < 20; local990++) {
					this.aClass1_Sub1_Sub2_Sub2Array3[local990] = new Class1_Sub1_Sub2_Sub2(local295, "hitmarks", local990);
				}
			} catch (@Pc(1048) Exception local1048) {
			}
			try {
				for (local990 = 0; local990 < 20; local990++) {
					this.aClass1_Sub1_Sub2_Sub2Array6[local990] = new Class1_Sub1_Sub2_Sub2(local295, "headicons", local990);
				}
			} catch (@Pc(1068) Exception local1068) {
			}
			this.aClass1_Sub1_Sub2_Sub2_1 = new Class1_Sub1_Sub2_Sub2(local295, "mapmarker", 0);
			this.aClass1_Sub1_Sub2_Sub2_2 = new Class1_Sub1_Sub2_Sub2(local295, "mapmarker", 1);
			for (local990 = 0; local990 < 8; local990++) {
				this.aClass1_Sub1_Sub2_Sub2Array5[local990] = new Class1_Sub1_Sub2_Sub2(local295, "cross", local990);
			}
			this.aClass1_Sub1_Sub2_Sub2_6 = new Class1_Sub1_Sub2_Sub2(local295, "mapdots", 0);
			this.aClass1_Sub1_Sub2_Sub2_7 = new Class1_Sub1_Sub2_Sub2(local295, "mapdots", 1);
			this.aClass1_Sub1_Sub2_Sub2_8 = new Class1_Sub1_Sub2_Sub2(local295, "mapdots", 2);
			this.aClass1_Sub1_Sub2_Sub2_9 = new Class1_Sub1_Sub2_Sub2(local295, "mapdots", 3);
			this.aClass1_Sub1_Sub2_Sub3_17 = new Class1_Sub1_Sub2_Sub3(local295, "scrollbar", 0);
			this.aClass1_Sub1_Sub2_Sub3_18 = new Class1_Sub1_Sub2_Sub3(local295, "scrollbar", 1);
			this.aClass1_Sub1_Sub2_Sub3_4 = new Class1_Sub1_Sub2_Sub3(local295, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_5 = new Class1_Sub1_Sub2_Sub3(local295, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_6 = new Class1_Sub1_Sub2_Sub3(local295, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_7 = new Class1_Sub1_Sub2_Sub3(local295, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_7.method442();
			this.aClass1_Sub1_Sub2_Sub3_8 = new Class1_Sub1_Sub2_Sub3(local295, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_8.method442();
			this.aClass1_Sub1_Sub2_Sub3_12 = new Class1_Sub1_Sub2_Sub3(local295, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_12.method443(551);
			this.aClass1_Sub1_Sub2_Sub3_13 = new Class1_Sub1_Sub2_Sub3(local295, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_13.method443(551);
			this.aClass1_Sub1_Sub2_Sub3_14 = new Class1_Sub1_Sub2_Sub3(local295, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_14.method443(551);
			this.aClass1_Sub1_Sub2_Sub3_15 = new Class1_Sub1_Sub2_Sub3(local295, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_15.method442();
			this.aClass1_Sub1_Sub2_Sub3_15.method443(551);
			this.aClass1_Sub1_Sub2_Sub3_16 = new Class1_Sub1_Sub2_Sub3(local295, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_16.method442();
			this.aClass1_Sub1_Sub2_Sub3_16.method443(551);
			for (@Pc(1268) int local1268 = 0; local1268 < 2; local1268++) {
				this.aClass1_Sub1_Sub2_Sub3Array3[local1268] = new Class1_Sub1_Sub2_Sub3(local295, "mod_icons", local1268);
			}
			@Pc(1291) Class1_Sub1_Sub2_Sub2 local1291 = new Class1_Sub1_Sub2_Sub2(local295, "backleft1", 0);
			this.aClass37_10 = new Class37(local1291.anInt686, local1291.anInt687, 0, this.method95());
			local1291.method404(0, 0);
			@Pc(1316) Class1_Sub1_Sub2_Sub2 local1316 = new Class1_Sub1_Sub2_Sub2(local295, "backleft2", 0);
			this.aClass37_11 = new Class37(local1316.anInt686, local1316.anInt687, 0, this.method95());
			local1316.method404(0, 0);
			@Pc(1341) Class1_Sub1_Sub2_Sub2 local1341 = new Class1_Sub1_Sub2_Sub2(local295, "backright1", 0);
			this.aClass37_12 = new Class37(local1341.anInt686, local1341.anInt687, 0, this.method95());
			local1341.method404(0, 0);
			@Pc(1366) Class1_Sub1_Sub2_Sub2 local1366 = new Class1_Sub1_Sub2_Sub2(local295, "backright2", 0);
			this.aClass37_13 = new Class37(local1366.anInt686, local1366.anInt687, 0, this.method95());
			local1366.method404(0, 0);
			@Pc(1391) Class1_Sub1_Sub2_Sub2 local1391 = new Class1_Sub1_Sub2_Sub2(local295, "backtop1", 0);
			this.aClass37_14 = new Class37(local1391.anInt686, local1391.anInt687, 0, this.method95());
			local1391.method404(0, 0);
			@Pc(1416) Class1_Sub1_Sub2_Sub2 local1416 = new Class1_Sub1_Sub2_Sub2(local295, "backvmid1", 0);
			this.aClass37_15 = new Class37(local1416.anInt686, local1416.anInt687, 0, this.method95());
			local1416.method404(0, 0);
			@Pc(1441) Class1_Sub1_Sub2_Sub2 local1441 = new Class1_Sub1_Sub2_Sub2(local295, "backvmid2", 0);
			this.aClass37_16 = new Class37(local1441.anInt686, local1441.anInt687, 0, this.method95());
			local1441.method404(0, 0);
			@Pc(1466) Class1_Sub1_Sub2_Sub2 local1466 = new Class1_Sub1_Sub2_Sub2(local295, "backvmid3", 0);
			this.aClass37_17 = new Class37(local1466.anInt686, local1466.anInt687, 0, this.method95());
			local1466.method404(0, 0);
			@Pc(1491) Class1_Sub1_Sub2_Sub2 local1491 = new Class1_Sub1_Sub2_Sub2(local295, "backhmid2", 0);
			this.aClass37_18 = new Class37(local1491.anInt686, local1491.anInt687, 0, this.method95());
			local1491.method404(0, 0);
			@Pc(1516) int local1516 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1523) int local1523 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1530) int local1530 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1537) int local1537 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1539) int local1539 = 0; local1539 < 50; local1539++) {
				if (this.aClass1_Sub1_Sub2_Sub2Array4[local1539] != null) {
					this.aClass1_Sub1_Sub2_Sub2Array4[local1539].method402(local1516 + local1537, local1523 + local1537, local1530 + local1537, 320);
				}
				if (this.aClass1_Sub1_Sub2_Sub3Array4[local1539] != null) {
					this.aClass1_Sub1_Sub2_Sub3Array4[local1539].method444(local1516 + local1537, local1523 + local1537, local1530 + local1537);
				}
			}
			this.method97(83, "Unpacking textures");
			Class1_Sub1_Sub2_Sub1.method375(local307);
			Class1_Sub1_Sub2_Sub1.method379(0.8D);
			Class1_Sub1_Sub2_Sub1.method374();
			this.method97(86, "Unpacking config");
			Class27.method516(local271);
			Class9.method256(local271);
			Class21.method447(local271);
			Class15.method343(local271);
			Class13.method318(local271);
			Class23.method477(local271);
			Class32.method528(local271);
			Class38.method541(local271);
			Class35.method536(local271);
			Class15.aBoolean162 = aBoolean55;
			if (!aBoolean56) {
				this.method97(90, "Unpacking sounds");
				@Pc(1642) byte[] local1642 = local331.method678("sounds.dat", null);
				@Pc(1648) Class1_Sub1_Sub3 local1648 = new Class1_Sub1_Sub3(16, local1642);
				Class5.method79(local1648);
			}
			this.method97(95, "Unpacking interfaces");
			@Pc(1679) Class1_Sub1_Sub2_Sub4[] local1679 = new Class1_Sub1_Sub2_Sub4[] { this.aClass1_Sub1_Sub2_Sub4_1, this.aClass1_Sub1_Sub2_Sub4_2, this.aClass1_Sub1_Sub2_Sub4_3, this.aClass1_Sub1_Sub2_Sub4_4 };
			Class6.method230(local283, local1679, local295);
			this.method97(100, "Preparing game engine");
			@Pc(1695) int local1695;
			@Pc(1697) int local1697;
			@Pc(1699) int local1699;
			for (@Pc(1691) int local1691 = 0; local1691 < 33; local1691++) {
				local1695 = 999;
				local1697 = 0;
				for (local1699 = 0; local1699 < 34; local1699++) {
					if (this.aClass1_Sub1_Sub2_Sub3_10.aByteArray7[local1699 + local1691 * this.aClass1_Sub1_Sub2_Sub3_10.anInt718] == 0) {
						if (local1695 == 999) {
							local1695 = local1699;
						}
					} else if (local1695 != 999) {
						local1697 = local1699;
						break;
					}
				}
				this.anIntArray84[local1691] = local1695;
				this.anIntArray77[local1691] = local1697 - local1695;
			}
			@Pc(1757) int local1757;
			for (local1695 = 5; local1695 < 156; local1695++) {
				local1697 = 999;
				local1699 = 0;
				for (local1757 = 25; local1757 < 172; local1757++) {
					if (this.aClass1_Sub1_Sub2_Sub3_10.aByteArray7[local1757 + local1695 * this.aClass1_Sub1_Sub2_Sub3_10.anInt718] == 0 && (local1757 > 34 || local1695 > 34)) {
						if (local1697 == 999) {
							local1697 = local1757;
						}
					} else if (local1697 != 999) {
						local1699 = local1757;
						break;
					}
				}
				this.anIntArray49[local1695 - 5] = local1697 - 25;
				this.anIntArray46[local1695 - 5] = local1699 - local1697;
			}
			Class1_Sub1_Sub2_Sub1.method372(96, 921, 479);
			this.anIntArray90 = Class1_Sub1_Sub2_Sub1.anIntArray185;
			Class1_Sub1_Sub2_Sub1.method372(261, 921, 190);
			this.anIntArray91 = Class1_Sub1_Sub2_Sub1.anIntArray185;
			Class1_Sub1_Sub2_Sub1.method372(334, 921, 512);
			this.anIntArray92 = Class1_Sub1_Sub2_Sub1.anIntArray185;
			@Pc(1841) int[] local1841 = new int[9];
			for (local1699 = 0; local1699 < 9; local1699++) {
				local1757 = local1699 * 32 + 128 + 15;
				@Pc(1859) int local1859 = local1757 * 3 + 600;
				@Pc(1863) int local1863 = Class1_Sub1_Sub2_Sub1.anIntArray183[local1757];
				local1841[local1699] = local1859 * local1863 >> 16;
			}
			Class39.method580(local1841);
			Class41.method603(local319);
			this.aClass11_1 = new Class11(anInt417, this);
		} catch (@Pc(1893) Exception local1893) {
			signlink.reporterror("loaderror " + this.aString13 + " " + this.anInt300);
			this.aBoolean88 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
	private int method155(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = 256 - arg1;
			return ((arg0 & 0xFF00FF) * local3 + (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg0 & 0xFF00) * local3 + (arg2 & 0xFF00) * arg1 & 0xFF0000) >> 8;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("7685, " + arg0 + ", " + 38951 + ", " + arg1 + ", " + arg2 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method156() {
		try {
			if (aBoolean56 && this.anInt415 == 2 && Class4.anInt201 != this.anInt432) {
				this.aClass37_5.method538();
				this.aClass1_Sub1_Sub2_Sub4_2.method465(257, "Loading - please wait.", 151, 0);
				this.aClass1_Sub1_Sub2_Sub4_2.method465(256, "Loading - please wait.", 150, 16777215);
				this.aClass37_5.method539(super.aGraphics2, 4, 4);
				this.anInt415 = 1;
				this.aLong16 = System.currentTimeMillis();
			}
			if (this.anInt415 == 1) {
				@Pc(64) int local64 = this.method157();
				if (local64 != 0 && System.currentTimeMillis() - this.aLong16 > 360000L) {
					signlink.reporterror(this.aString14 + " glcfb " + this.aLong17 + "," + local64 + "," + aBoolean56 + "," + this.aClass46Array1[0] + "," + this.aClass45_Sub1_1.method658() + "," + this.anInt432 + "," + this.anInt333 + "," + this.anInt334);
					this.aLong16 = System.currentTimeMillis();
				}
			}
			if (this.anInt415 == 2 && this.anInt432 != this.anInt425) {
				this.anInt425 = this.anInt432;
				this.method108(this.anInt432);
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("42294, " + 4 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)I")
	private int method157() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray2.length; local3++) {
				if (this.aByteArrayArray2[local3] == null && this.anIntArray70[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray1[local3] == null && this.anIntArray71[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(41) int local41 = 0; local41 < this.aByteArrayArray2.length; local41++) {
				@Pc(48) byte[] local48 = this.aByteArrayArray1[local41];
				if (local48 != null) {
					@Pc(62) int local62 = (this.anIntArray69[local41] >> 8) * 64 - this.anInt384;
					@Pc(74) int local74 = (this.anIntArray69[local41] & 0xFF) * 64 - this.anInt385;
					local39 &= Class4.method59(local48, local74, local62);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean53) {
				return -4;
			} else {
				this.anInt415 = 2;
				Class4.anInt201 = this.anInt432;
				this.method223();
				this.aClass1_Sub1_Sub3_4.method487(134);
				return 0;
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("17128, " + -15 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method158(@OriginalArg(0) byte arg0) {
		try {
			if (this.anInt403 == 0) {
				this.aStringArray6[0] = "Cancel";
				this.anIntArray82[0] = 1106;
				this.anInt407 = 1;
				this.method140();
				this.anInt318 = 0;
				if (super.anInt232 > 4 && super.anInt233 > 4 && super.anInt232 < 516 && super.anInt233 < 338) {
					if (this.anInt348 == -1) {
						this.method208();
					} else {
						this.method101(4, Class6.aClass6Array1[this.anInt348], super.anInt233, 0, 4, super.anInt232);
					}
				}
				if (this.anInt318 != this.anInt288) {
					this.anInt288 = this.anInt318;
				}
				this.anInt318 = 0;
				if (super.anInt232 > 553 && super.anInt233 > 205 && super.anInt232 < 743 && super.anInt233 < 466) {
					if (this.anInt337 != -1) {
						this.method101(553, Class6.aClass6Array1[this.anInt337], super.anInt233, 0, 205, super.anInt232);
					} else if (this.anIntArray76[this.anInt330] != -1) {
						this.method101(553, Class6.aClass6Array1[this.anIntArray76[this.anInt330]], super.anInt233, 0, 205, super.anInt232);
					}
				}
				if (this.anInt318 != this.anInt359) {
					this.aBoolean66 = true;
					this.anInt359 = this.anInt318;
				}
				this.anInt318 = 0;
				if (this.aByte6 == 8) {
					@Pc(156) boolean local156 = false;
				} else {
					this.anInt325 = 383;
				}
				if (super.anInt232 > 17 && super.anInt233 > 357 && super.anInt232 < 496 && super.anInt233 < 453) {
					if (this.anInt343 != -1) {
						this.method101(17, Class6.aClass6Array1[this.anInt343], super.anInt233, 0, 357, super.anInt232);
					} else if (super.anInt233 < 434 && super.anInt232 < 426) {
						this.method129(super.anInt233 - 357, super.anInt232 - 17, this.anInt262);
					}
				}
				if (this.anInt343 != -1 && this.anInt318 != this.anInt328) {
					this.aBoolean49 = true;
					this.anInt328 = this.anInt318;
				}
				@Pc(235) boolean local235 = false;
				while (!local235) {
					local235 = true;
					for (@Pc(241) int local241 = 0; local241 < this.anInt407 - 1; local241++) {
						if (this.anIntArray82[local241] < 1000 && this.anIntArray82[local241 + 1] > 1000) {
							@Pc(262) String local262 = this.aStringArray6[local241];
							this.aStringArray6[local241] = this.aStringArray6[local241 + 1];
							this.aStringArray6[local241 + 1] = local262;
							@Pc(284) int local284 = this.anIntArray82[local241];
							this.anIntArray82[local241] = this.anIntArray82[local241 + 1];
							this.anIntArray82[local241 + 1] = local284;
							@Pc(306) int local306 = this.anIntArray80[local241];
							this.anIntArray80[local241] = this.anIntArray80[local241 + 1];
							this.anIntArray80[local241 + 1] = local306;
							@Pc(328) int local328 = this.anIntArray81[local241];
							this.anIntArray81[local241] = this.anIntArray81[local241 + 1];
							this.anIntArray81[local241 + 1] = local328;
							@Pc(350) int local350 = this.anIntArray83[local241];
							this.anIntArray83[local241] = this.anIntArray83[local241 + 1];
							this.anIntArray83[local241 + 1] = local350;
							local235 = false;
						}
					}
				}
			}
		} catch (@Pc(380) RuntimeException local380) {
			signlink.reporterror("29460, " + arg0 + ", " + local380.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 < 8 || arg0 > 8) {
				this.aClass31ArrayArrayArray1 = null;
			}
			if (!aBoolean56) {
				@Pc(21) Class1_Sub1_Sub2_Sub3 local21;
				@Pc(29) int local29;
				@Pc(37) int local37;
				@Pc(40) byte[] local40;
				@Pc(43) byte[] local43;
				@Pc(45) int local45;
				if (Class1_Sub1_Sub2_Sub1.anIntArray187[17] >= arg1) {
					local21 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[17];
					local29 = local21.anInt718 * local21.anInt719 - 1;
					local37 = local21.anInt718 * this.anInt266 * 2;
					local40 = local21.aByteArray7;
					local43 = this.aByteArray2;
					for (local45 = 0; local45 <= local29; local45++) {
						local43[local45] = local40[local45 - local37 & local29];
					}
					local21.aByteArray7 = local43;
					this.aByteArray2 = local40;
					Class1_Sub1_Sub2_Sub1.method377(17);
				}
				if (Class1_Sub1_Sub2_Sub1.anIntArray187[24] >= arg1) {
					local21 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[24];
					local29 = local21.anInt718 * local21.anInt719 - 1;
					local37 = local21.anInt718 * this.anInt266 * 2;
					local40 = local21.aByteArray7;
					local43 = this.aByteArray2;
					for (local45 = 0; local45 <= local29; local45++) {
						local43[local45] = local40[local45 - local37 & local29];
					}
					local21.aByteArray7 = local43;
					this.aByteArray2 = local40;
					Class1_Sub1_Sub2_Sub1.method377(24);
					return;
				}
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("67520, " + arg0 + ", " + arg1 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!z;BI)V")
	private void method160(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) boolean local4 = false;
			this.method161(arg0.anInt129, arg2, arg0.anInt128, aBoolean70);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("98519, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIZ)V")
	private void method161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		try {
			if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
				@Pc(29) int local29 = this.method209(this.aBoolean76, arg2, arg0, this.anInt432) - arg1;
				@Pc(34) int local34 = arg2 - this.anInt388;
				@Pc(39) int local39 = local29 - this.anInt389;
				@Pc(44) int local44 = arg0 - this.anInt390;
				@Pc(49) int local49 = Class1_Sub1_Sub1_Sub5.anIntArray158[this.anInt391];
				@Pc(54) int local54 = Class1_Sub1_Sub1_Sub5.anIntArray159[this.anInt391];
				@Pc(59) int local59 = Class1_Sub1_Sub1_Sub5.anIntArray158[this.anInt392];
				@Pc(64) int local64 = Class1_Sub1_Sub1_Sub5.anIntArray159[this.anInt392];
				@Pc(74) int local74 = local44 * local59 + local34 * local64 >> 16;
				@Pc(84) int local84 = local44 * local64 - local34 * local59 >> 16;
				if (!arg3) {
					local34 = local74;
					local74 = local39 * local54 - local84 * local49 >> 16;
					local44 = local39 * local49 + local84 * local54 >> 16;
					if (local44 >= 50) {
						this.anInt267 = Class1_Sub1_Sub2_Sub1.anInt663 + (local34 << 9) / local44;
						this.anInt268 = Class1_Sub1_Sub2_Sub1.anInt664 + (local74 << 9) / local44;
					} else {
						this.anInt267 = -1;
						this.anInt268 = -1;
					}
				}
			} else {
				this.anInt267 = -1;
				this.anInt268 = -1;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("6289, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
	private void method162(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt378 >= 100 && this.anInt362 != 1) {
					this.method132("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
				} else if (this.anInt378 >= 200) {
					this.method132("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
				} else {
					@Pc(38) String local38 = Class49.method683(Class49.method680(arg0));
					for (@Pc(40) int local40 = 0; local40 < this.anInt378; local40++) {
						if (this.aLongArray4[local40] == arg0) {
							this.method132("", local38 + " is already on your friend list", 0);
							return;
						}
					}
					for (@Pc(70) int local70 = 0; local70 < this.anInt396; local70++) {
						if (this.aLongArray3[local70] == arg0) {
							this.method132("", "Please remove " + local38 + " from your ignore list first", 0);
							return;
						}
					}
					if (!local38.equals(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4)) {
						this.aStringArray1[this.anInt378] = local38;
						this.aLongArray4[this.anInt378] = arg0;
						this.anIntArray51[this.anInt378] = 0;
						this.anInt378++;
						this.aBoolean66 = true;
						this.aClass1_Sub1_Sub3_4.method487(9);
						this.aClass1_Sub1_Sub3_4.method494(arg0);
					}
				}
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("58721, " + true + ", " + arg0 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method163() {
		try {
			this.anInt438 = 0;
			@Pc(15) int local15 = (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 >> 7) + this.anInt384;
			@Pc(23) int local23 = (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 >> 7) + this.anInt385;
			if (local15 >= 3053 && local15 <= 3156 && local23 >= 3056 && local23 <= 3136) {
				this.anInt438 = 1;
			}
			if (local15 >= 3072 && local15 <= 3118 && local23 >= 9492 && local23 <= 9535) {
				this.anInt438 = 1;
			}
			if (this.anInt438 == 1 && local15 >= 3139 && local15 <= 3199 && local23 >= 3008 && local23 <= 3062) {
				this.anInt438 = 0;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("40930, " + -4 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method164(@OriginalArg(0) boolean arg0) {
		try {
			this.aClass37_6.method538();
			Class1_Sub1_Sub2_Sub1.anIntArray185 = this.anIntArray90;
			this.aClass1_Sub1_Sub2_Sub3_11.method445(0, 0);
			if (this.aBoolean90) {
				this.aClass1_Sub1_Sub2_Sub4_3.method465(239, this.aString12, 40, 0);
				this.aClass1_Sub1_Sub2_Sub4_3.method465(239, this.aString17 + "*", 60, 128);
			} else if (this.aBoolean86) {
				this.aClass1_Sub1_Sub2_Sub4_3.method465(239, "Enter amount:", 40, 0);
				this.aClass1_Sub1_Sub2_Sub4_3.method465(239, this.aString18 + "*", 60, 128);
			} else if (this.aString10 != null) {
				this.aClass1_Sub1_Sub2_Sub4_3.method465(239, this.aString10, 40, 0);
				this.aClass1_Sub1_Sub2_Sub4_3.method465(239, "Click to continue", 60, 128);
			} else if (this.anInt343 != -1) {
				this.method210(0, 0, Class6.aClass6Array1[this.anInt343], 0);
			} else if (this.anInt302 == -1) {
				@Pc(130) Class1_Sub1_Sub2_Sub4 local130 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(132) int local132 = 0;
				Class1_Sub1_Sub2.method455(0, 0, 77, 463);
				for (@Pc(140) int local140 = 0; local140 < 100; local140++) {
					if (this.aStringArray4[local140] != null) {
						@Pc(152) int local152 = this.anIntArray45[local140];
						@Pc(161) int local161 = this.anInt319 + 70 - local132 * 14;
						@Pc(166) String local166 = this.aStringArray3[local140];
						@Pc(168) byte local168 = 0;
						if (local166 != null && local166.startsWith("@cr1@")) {
							local166 = local166.substring(5);
							local168 = 1;
						}
						if (local166 != null && local166.startsWith("@cr2@")) {
							local166 = local166.substring(5);
							local168 = 2;
						}
						if (local152 == 0) {
							if (local161 > 0 && local161 < 110) {
								local130.method468(local161, 0, this.aStringArray4[local140], 4);
							}
							local132++;
						}
						@Pc(238) int local238;
						if ((local152 == 1 || local152 == 2) && (local152 == 1 || this.anInt250 == 0 || this.anInt250 == 1 && this.method151(local166, 809))) {
							if (local161 > 0 && local161 < 110) {
								local238 = 4;
								if (local168 == 1) {
									this.aClass1_Sub1_Sub2_Sub3Array3[0].method445(4, local161 - 12);
									local238 += 14;
								}
								if (local168 == 2) {
									this.aClass1_Sub1_Sub2_Sub3Array3[1].method445(local238, local161 - 12);
									local238 += 14;
								}
								local130.method468(local161, 0, local166 + ":", local238);
								local238 += local130.method467(local166) + 8;
								local130.method468(local161, 255, this.aStringArray4[local140], local238);
							}
							local132++;
						}
						if ((local152 == 3 || local152 == 7) && this.anInt410 == 0 && (local152 == 7 || this.anInt381 == 0 || this.anInt381 == 1 && this.method151(local166, 809))) {
							if (local161 > 0 && local161 < 110) {
								local130.method468(local161, 0, "From", 4);
								local238 = local130.method467("From ") + 4;
								if (local168 == 1) {
									this.aClass1_Sub1_Sub2_Sub3Array3[0].method445(local238, local161 - 12);
									local238 += 14;
								}
								if (local168 == 2) {
									this.aClass1_Sub1_Sub2_Sub3Array3[1].method445(local238, local161 - 12);
									local238 += 14;
								}
								local130.method468(local161, 0, local166 + ":", local238);
								local238 += local130.method467(local166) + 8;
								local130.method468(local161, 8388608, this.aStringArray4[local140], local238);
							}
							local132++;
						}
						if (local152 == 4 && (this.anInt252 == 0 || this.anInt252 == 1 && this.method151(local166, 809))) {
							if (local161 > 0 && local161 < 110) {
								local130.method468(local161, 8388736, local166 + " " + this.aStringArray4[local140], 4);
							}
							local132++;
						}
						if (local152 == 5 && this.anInt410 == 0 && this.anInt381 < 2) {
							if (local161 > 0 && local161 < 110) {
								local130.method468(local161, 8388608, this.aStringArray4[local140], 4);
							}
							local132++;
						}
						if (local152 == 6 && this.anInt410 == 0 && this.anInt381 < 2) {
							if (local161 > 0 && local161 < 110) {
								local130.method468(local161, 0, "To " + local166 + ":", 4);
								local130.method468(local161, 8388608, this.aStringArray4[local140], local130.method467("To " + local166) + 12);
							}
							local132++;
						}
						if (local152 == 8 && (this.anInt252 == 0 || this.anInt252 == 1 && this.method151(local166, 809))) {
							if (local161 > 0 && local161 < 110) {
								local130.method468(local161, 8270336, local166 + " " + this.aStringArray4[local140], 4);
							}
							local132++;
						}
					}
				}
				Class1_Sub1_Sub2.method454();
				this.anInt394 = local132 * 14 + 7;
				if (this.anInt394 < 78) {
					this.anInt394 = 78;
				}
				this.method175(this.anInt394 - this.anInt319 - 77, 0, 77, this.anInt394, 463);
				@Pc(608) String local608;
				if (aClass1_Sub1_Sub1_Sub1_Sub2_1 == null || aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4 == null) {
					local608 = Class49.method683(this.aString14);
				} else {
					local608 = aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4;
				}
				local130.method468(90, 0, local608 + ":", 4);
				local130.method468(90, 255, this.aString5 + "*", local130.method467(local608 + ": ") + 6);
				Class1_Sub1_Sub2.method461(0, 77, 479, 0);
			} else {
				this.method210(0, 0, Class6.aClass6Array1[this.anInt302], 0);
			}
			if (this.aBoolean72 && this.anInt277 == 2) {
				this.method124();
			}
			this.aClass37_6.method539(super.aGraphics2, 357, 17);
			this.aClass37_5.method538();
			Class1_Sub1_Sub2_Sub1.anIntArray185 = this.anIntArray92;
			if (!arg0) {
				this.aBoolean76 = !this.aBoolean76;
			}
		} catch (@Pc(699) RuntimeException local699) {
			signlink.reporterror("1471, " + arg0 + ", " + local699.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!bb;Lclient!mb;)V")
	private void method165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub1_Sub1_Sub1_Sub2 arg3, @OriginalArg(4) Class1_Sub1_Sub3 arg4) {
		try {
			if (arg0 == 1) {
				@Pc(13) int local13;
				if ((arg2 & 0x1) == 1) {
					local13 = arg4.method498();
					@Pc(16) byte[] local16 = new byte[local13];
					@Pc(22) Class1_Sub1_Sub3 local22 = new Class1_Sub1_Sub3(16, local16);
					arg4.method507(local13, local16);
					this.aClass1_Sub1_Sub3Array1[arg1] = local22;
					arg3.method51(local22);
				}
				@Pc(60) int local60;
				@Pc(72) int local72;
				if ((arg2 & 0x2) == 2) {
					local13 = arg4.method500();
					if (local13 == 65535) {
						local13 = -1;
					}
					if (local13 == arg3.anInt151) {
						arg3.anInt155 = 0;
					}
					local60 = arg4.method498();
					if (local13 == arg3.anInt151 && local13 != -1) {
						local72 = Class27.aClass27Array1[local13].anInt816;
						if (local72 == 1) {
							arg3.anInt152 = 0;
							arg3.anInt153 = 0;
							arg3.anInt154 = local60;
							arg3.anInt155 = 0;
						}
						if (local72 == 2) {
							arg3.anInt155 = 0;
						}
					} else if (local13 == -1 || arg3.anInt151 == -1 || Class27.aClass27Array1[local13].anInt810 >= Class27.aClass27Array1[arg3.anInt151].anInt810) {
						arg3.anInt151 = local13;
						arg3.anInt152 = 0;
						arg3.anInt153 = 0;
						arg3.anInt154 = local60;
						arg3.anInt155 = 0;
						arg3.anInt174 = arg3.anInt172;
					}
				}
				if ((arg2 & 0x4) == 4) {
					arg3.anInt145 = arg4.method500();
					if (arg3.anInt145 == 65535) {
						arg3.anInt145 = -1;
					}
				}
				if ((arg2 & 0x8) == 8) {
					arg3.aString3 = arg4.method505();
					arg3.anInt140 = 0;
					arg3.anInt141 = 0;
					arg3.anInt139 = 150;
					this.method132(arg3.aString4, arg3.aString3, 2);
				}
				if ((arg2 & 0x10) == 16) {
					local13 = arg4.method498();
					local60 = arg4.method498();
					arg3.method50(local60, local13);
					arg3.anInt142 = anInt440 + 300;
					arg3.anInt143 = arg4.method498();
					arg3.anInt144 = arg4.method498();
				}
				if ((arg2 & 0x20) == 32) {
					arg3.anInt146 = arg4.method500();
					arg3.anInt147 = arg4.method500();
				}
				if ((arg2 & 0x40) == 64) {
					local13 = arg4.method500();
					local60 = arg4.method498();
					local72 = arg4.method498();
					@Pc(232) int local232 = arg4.anInt776;
					if (arg3.aString4 != null && arg3.aBoolean31) {
						@Pc(242) long local242 = Class49.method679(arg3.aString4);
						@Pc(244) boolean local244 = false;
						if (local60 <= 1) {
							for (@Pc(249) int local249 = 0; local249 < this.anInt396; local249++) {
								if (this.aLongArray3[local249] == local242) {
									local244 = true;
									break;
								}
							}
						}
						if (!local244 && this.anInt438 == 0) {
							try {
								@Pc(278) String local278 = Class2.method40(local72, arg4, this.anInt430);
								@Pc(282) String local282 = Class41.method613(local278);
								arg3.aString3 = local282;
								arg3.anInt140 = local13 >> 8;
								arg3.anInt141 = local13 & 0xFF;
								arg3.anInt139 = 150;
								if (local60 == 2 || local60 == 3) {
									this.method132("@cr2@" + arg3.aString4, local282, 1);
								} else if (local60 == 1) {
									this.method132("@cr1@" + arg3.aString4, local282, 1);
								} else {
									this.method132(arg3.aString4, local282, 2);
								}
							} catch (@Pc(346) Exception local346) {
								signlink.reporterror("cde2");
							}
						}
					}
					arg4.anInt776 = local232 + local72;
				}
				if ((arg2 & 0x100) == 256) {
					arg3.anInt156 = arg4.method500();
					local13 = arg4.method503();
					arg3.anInt160 = local13 >> 16;
					arg3.anInt159 = anInt440 + (local13 & 0xFFFF);
					arg3.anInt157 = 0;
					arg3.anInt158 = 0;
					if (arg3.anInt159 > anInt440) {
						arg3.anInt157 = -1;
					}
					if (arg3.anInt156 == 65535) {
						arg3.anInt156 = -1;
					}
				}
				if ((arg2 & 0x200) == 512) {
					arg3.anInt161 = arg4.method498();
					arg3.anInt163 = arg4.method498();
					arg3.anInt162 = arg4.method498();
					arg3.anInt164 = arg4.method498();
					arg3.anInt165 = arg4.method500() + anInt440;
					arg3.anInt166 = arg4.method500() + anInt440;
					arg3.anInt167 = arg4.method498();
					arg3.method48();
				}
				if ((arg2 & 0x400) == 1024) {
					local13 = arg4.method498();
					local60 = arg4.method498();
					arg3.method50(local60, local13);
					arg3.anInt142 = anInt440 + 300;
					arg3.anInt143 = arg4.method498();
					arg3.anInt144 = arg4.method498();
				}
			}
		} catch (@Pc(469) RuntimeException local469) {
			signlink.reporterror("22618, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local469.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method93(@OriginalArg(0) int arg0) {
		try {
			if (this.aBoolean63 || this.aBoolean88 || this.aBoolean84) {
				this.method201();
			} else {
				anInt332++;
				if (this.aBoolean74) {
					this.method219(this.aByte12);
				} else {
					this.method99(false);
				}
				this.anInt248 = 0;
				@Pc(36) boolean local36 = false;
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("64025, " + arg0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method166() {
		try {
			this.aBoolean74 &= true;
			for (@Pc(9) int local9 = -1; local9 < this.anInt357; local9++) {
				@Pc(17) int local17;
				if (local9 == -1) {
					local17 = this.anInt356;
				} else {
					local17 = this.anIntArray59[local9];
				}
				@Pc(29) Class1_Sub1_Sub1_Sub1_Sub2 local29 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local17];
				if (local29 != null) {
					this.method213(local29, 1);
				}
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("77285, " + true + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)Ljava/net/Socket;")
	public Socket method167(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)Z")
	private boolean method168() {
		try {
			if (this.aClass8_1 == null) {
				return false;
			}
			@Pc(1096) String local1096;
			@Pc(409) int local409;
			try {
				@Pc(17) int local17 = this.aClass8_1.method246();
				if (local17 == 0) {
					return false;
				}
				if (this.anInt339 == -1) {
					this.aClass8_1.method247(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 1);
					this.anInt339 = this.aClass1_Sub1_Sub3_3.aByteArray9[0] & 0xFF;
					if (this.aClass47_1 != null) {
						this.anInt339 = this.anInt339 - this.aClass47_1.method674() & 0xFF;
					}
					this.anInt338 = Class17.anIntArray190[this.anInt339];
					local17--;
				}
				if (this.anInt338 == -1) {
					if (local17 <= 0) {
						return false;
					}
					this.aClass8_1.method247(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 1);
					this.anInt338 = this.aClass1_Sub1_Sub3_3.aByteArray9[0] & 0xFF;
					local17--;
				}
				if (this.anInt338 == -2) {
					if (local17 <= 1) {
						return false;
					}
					this.aClass8_1.method247(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 2);
					this.aClass1_Sub1_Sub3_3.anInt776 = 0;
					this.anInt338 = this.aClass1_Sub1_Sub3_3.method500();
					local17 -= 2;
				}
				if (local17 < this.anInt338) {
					return false;
				}
				this.aClass1_Sub1_Sub3_3.anInt776 = 0;
				this.aClass8_1.method247(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, this.anInt338);
				this.anInt340 = 0;
				this.anInt376 = this.anInt375;
				this.anInt375 = this.anInt374;
				this.anInt374 = this.anInt339;
				@Pc(161) int local161;
				if (this.anInt339 == 186) {
					local161 = this.aClass1_Sub1_Sub3_3.method500();
					@Pc(165) byte local165 = this.aClass1_Sub1_Sub3_3.method499();
					this.anIntArray58[local161] = local165;
					if (this.anIntArray50[local161] != local165) {
						this.anIntArray50[local161] = local165;
						this.method226(local161);
						this.aBoolean66 = true;
						if (this.anInt302 != -1) {
							this.aBoolean49 = true;
						}
					}
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 29) {
					@Pc(208) Class1_Sub1_Sub3 local208 = Class10.method269(this.anInt399);
					if (local208 != null) {
						this.aClass1_Sub1_Sub3_4.method487(142);
						this.aClass1_Sub1_Sub3_4.method489(local208.anInt776);
						this.aClass1_Sub1_Sub3_4.method496(local208.anInt776, local208.aByteArray9);
						local208.method486();
					}
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 64) {
					this.anInt395 = this.aClass1_Sub1_Sub3_3.method498();
					if (this.anInt395 == 1) {
						this.anInt439 = this.aClass1_Sub1_Sub3_3.method500();
					}
					if (this.anInt395 >= 2 && this.anInt395 <= 6) {
						if (this.anInt395 == 2) {
							this.anInt246 = 64;
							this.anInt247 = 64;
						}
						if (this.anInt395 == 3) {
							this.anInt246 = 0;
							this.anInt247 = 64;
						}
						if (this.anInt395 == 4) {
							this.anInt246 = 128;
							this.anInt247 = 64;
						}
						if (this.anInt395 == 5) {
							this.anInt246 = 64;
							this.anInt247 = 0;
						}
						if (this.anInt395 == 6) {
							this.anInt246 = 64;
							this.anInt247 = 128;
						}
						this.anInt395 = 2;
						this.anInt243 = this.aClass1_Sub1_Sub3_3.method500();
						this.anInt244 = this.aClass1_Sub1_Sub3_3.method500();
						this.anInt245 = this.aClass1_Sub1_Sub3_3.method498();
					}
					if (this.anInt395 == 10) {
						this.anInt308 = this.aClass1_Sub1_Sub3_3.method500();
					}
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 146) {
					this.anInt314 = this.aClass1_Sub1_Sub3_3.method503();
					this.anInt420 = this.aClass1_Sub1_Sub3_3.method500();
					this.anInt349 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt414 = this.aClass1_Sub1_Sub3_3.method500();
					this.anInt276 = this.aClass1_Sub1_Sub3_3.method498();
					if (this.anInt314 != 0 && this.anInt348 == -1) {
						signlink.dnslookup(Class49.method682(this.anInt314));
						this.method188();
						@Pc(391) short local391 = 650;
						if (this.anInt349 != 201 || this.anInt276 == 1) {
							local391 = 655;
						}
						this.aString16 = "";
						this.aBoolean65 = false;
						for (local409 = 0; local409 < Class6.aClass6Array1.length; local409++) {
							if (Class6.aClass6Array1[local409] != null && Class6.aClass6Array1[local409].anInt461 == local391) {
								this.anInt348 = Class6.aClass6Array1[local409].anInt458;
								break;
							}
						}
					}
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 227) {
					local161 = this.aClass1_Sub1_Sub3_3.method500();
					@Pc(456) boolean local456 = this.aClass1_Sub1_Sub3_3.method498() == 1;
					Class6.aClass6Array1[local161].aBoolean94 = local456;
					this.anInt339 = -1;
					return true;
				}
				@Pc(485) int local485;
				@Pc(502) int local502;
				if (this.anInt339 == 136) {
					this.aBoolean66 = true;
					local161 = this.aClass1_Sub1_Sub3_3.method498();
					local409 = this.aClass1_Sub1_Sub3_3.method503();
					local485 = this.aClass1_Sub1_Sub3_3.method498();
					this.anIntArray35[local161] = local409;
					this.anIntArray79[local161] = local485;
					this.anIntArray73[local161] = 1;
					for (local502 = 0; local502 < 98; local502++) {
						if (local409 >= anIntArray72[local502]) {
							this.anIntArray73[local161] = local502 + 2;
						}
					}
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 164) {
					if (this.anInt330 == 12) {
						this.aBoolean66 = true;
					}
					this.anInt312 = this.aClass1_Sub1_Sub3_3.method501();
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 140) {
					for (local161 = 0; local161 < this.anIntArray50.length; local161++) {
						if (this.anIntArray50[local161] != this.anIntArray58[local161]) {
							this.anIntArray50[local161] = this.anIntArray58[local161];
							this.method226(local161);
							this.aBoolean66 = true;
						}
					}
					this.anInt339 = -1;
					return true;
				}
				@Pc(605) Class6 local605;
				if (this.anInt339 == 14) {
					local161 = this.aClass1_Sub1_Sub3_3.method500();
					local409 = this.aClass1_Sub1_Sub3_3.method500();
					local605 = Class6.aClass6Array1[local161];
					if (local605 != null && local605.anInt459 == 0) {
						if (local409 < 0) {
							local409 = 0;
						}
						if (local409 > local605.anInt467 - local605.anInt463) {
							local409 = local605.anInt467 - local605.anInt463;
						}
						local605.anInt468 = local409;
					}
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 87) {
					this.method145(this.anInt338, this.aClass1_Sub1_Sub3_3, this.aBoolean45);
					this.aBoolean53 = false;
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 159) {
					this.anInt364 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt365 = this.aClass1_Sub1_Sub3_3.method498();
					for (local161 = this.anInt364; local161 < this.anInt364 + 8; local161++) {
						for (local409 = this.anInt365; local409 < this.anInt365 + 8; local409++) {
							if (this.aClass31ArrayArrayArray1[this.anInt432][local161][local409] != null) {
								this.aClass31ArrayArrayArray1[this.anInt432][local161][local409] = null;
								this.method227(local161, local409);
							}
						}
					}
					for (@Pc(722) Class1_Sub2 local722 = (Class1_Sub2) this.aClass31_2.method523(); local722 != null; local722 = (Class1_Sub2) this.aClass31_2.method525()) {
						if (local722.anInt823 >= this.anInt364 && local722.anInt823 < this.anInt364 + 8 && local722.anInt824 >= this.anInt365 && local722.anInt824 < this.anInt365 + 8 && local722.anInt821 == this.anInt432) {
							local722.anInt832 = 0;
						}
					}
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 251) {
					Class10.method266();
					this.anInt339 = -1;
					return true;
				}
				@Pc(801) int local801;
				@Pc(903) int local903;
				@Pc(936) int local936;
				@Pc(789) long local789;
				if (this.anInt339 == 111) {
					local789 = this.aClass1_Sub1_Sub3_3.method504();
					local485 = this.aClass1_Sub1_Sub3_3.method498();
					@Pc(799) String local799 = Class49.method683(Class49.method680(local789));
					for (local801 = 0; local801 < this.anInt378; local801++) {
						if (local789 == this.aLongArray4[local801]) {
							if (this.anIntArray51[local801] != local485) {
								this.anIntArray51[local801] = local485;
								this.aBoolean66 = true;
								if (local485 > 0) {
									this.method132("", local799 + " has logged in.", 5);
								}
								if (local485 == 0) {
									this.method132("", local799 + " has logged out.", 5);
								}
							}
							local799 = null;
							break;
						}
					}
					if (local799 != null && this.anInt378 < 200) {
						this.aLongArray4[this.anInt378] = local789;
						this.aStringArray1[this.anInt378] = local799;
						this.anIntArray51[this.anInt378] = local485;
						this.anInt378++;
						this.aBoolean66 = true;
					}
					@Pc(897) boolean local897 = false;
					while (!local897) {
						local897 = true;
						for (local903 = 0; local903 < this.anInt378 - 1; local903++) {
							if (this.anIntArray51[local903] != anInt291 && this.anIntArray51[local903 + 1] == anInt291 || this.anIntArray51[local903] == 0 && this.anIntArray51[local903 + 1] != 0) {
								local936 = this.anIntArray51[local903];
								this.anIntArray51[local903] = this.anIntArray51[local903 + 1];
								this.anIntArray51[local903 + 1] = local936;
								@Pc(958) String local958 = this.aStringArray1[local903];
								this.aStringArray1[local903] = this.aStringArray1[local903 + 1];
								this.aStringArray1[local903 + 1] = local958;
								@Pc(980) long local980 = this.aLongArray4[local903];
								this.aLongArray4[local903] = this.aLongArray4[local903 + 1];
								this.aLongArray4[local903 + 1] = local980;
								this.aBoolean66 = true;
								local897 = false;
							}
						}
					}
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 5) {
					this.aBoolean90 = false;
					this.aBoolean86 = true;
					this.aString18 = "";
					this.aBoolean49 = true;
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 203) {
					for (local161 = 0; local161 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length; local161++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local161] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local161].anInt151 = -1;
						}
					}
					for (local409 = 0; local409 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length; local409++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local409] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local409].anInt151 = -1;
						}
					}
					this.anInt339 = -1;
					return true;
				}
				@Pc(1114) int local1114;
				@Pc(1107) String local1107;
				@Pc(1112) boolean local1112;
				if (this.anInt339 == 73) {
					local1096 = this.aClass1_Sub1_Sub3_3.method505();
					@Pc(1110) long local1110;
					if (local1096.endsWith(":tradereq:")) {
						local1107 = local1096.substring(0, local1096.indexOf(":"));
						local1110 = Class49.method679(local1107);
						local1112 = false;
						for (local1114 = 0; local1114 < this.anInt396; local1114++) {
							if (this.aLongArray3[local1114] == local1110) {
								local1112 = true;
								break;
							}
						}
						if (!local1112 && this.anInt438 == 0) {
							this.method132(local1107, "wishes to trade with you.", 4);
						}
					} else if (local1096.endsWith(":duelreq:")) {
						local1107 = local1096.substring(0, local1096.indexOf(":"));
						local1110 = Class49.method679(local1107);
						local1112 = false;
						for (local1114 = 0; local1114 < this.anInt396; local1114++) {
							if (this.aLongArray3[local1114] == local1110) {
								local1112 = true;
								break;
							}
						}
						if (!local1112 && this.anInt438 == 0) {
							this.method132(local1107, "wishes to duel with you.", 8);
						}
					} else {
						this.method132("", local1096, 0);
					}
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 24) {
					this.anInt250 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt381 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt252 = this.aClass1_Sub1_Sub3_3.method498();
					this.aBoolean79 = true;
					this.aBoolean49 = true;
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 63) {
					this.anInt396 = this.anInt338 / 8;
					for (local161 = 0; local161 < this.anInt396; local161++) {
						this.aLongArray3[local161] = this.aClass1_Sub1_Sub3_3.method504();
					}
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 58) {
					this.anInt275 = this.aClass1_Sub1_Sub3_3.method498();
					if (this.anInt275 == this.anInt330) {
						if (this.anInt275 == 3) {
							this.anInt330 = 1;
						} else {
							this.anInt330 = 3;
						}
						this.aBoolean66 = true;
					}
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 95) {
					local161 = this.aClass1_Sub1_Sub3_3.method500();
					local409 = this.aClass1_Sub1_Sub3_3.method501();
					local605 = Class6.aClass6Array1[local161];
					local605.anInt480 = local409;
					if (local409 == -1) {
						local605.anInt455 = 0;
						local605.anInt456 = 0;
					}
					this.anInt339 = -1;
					return true;
				}
				@Pc(1349) Class6 local1349;
				if (this.anInt339 == 170) {
					this.aBoolean66 = true;
					local161 = this.aClass1_Sub1_Sub3_3.method500();
					local1349 = Class6.aClass6Array1[local161];
					while (this.aClass1_Sub1_Sub3_3.anInt776 < this.anInt338) {
						local485 = this.aClass1_Sub1_Sub3_3.method498();
						local502 = this.aClass1_Sub1_Sub3_3.method500();
						local801 = this.aClass1_Sub1_Sub3_3.method498();
						if (local801 == 255) {
							local801 = this.aClass1_Sub1_Sub3_3.method503();
						}
						if (local485 >= 0 && local485 < local1349.anIntArray96.length) {
							local1349.anIntArray96[local485] = local502;
							local1349.anIntArray97[local485] = local801;
						}
					}
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 108) {
					this.anInt452 = 0;
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 75) {
					this.anInt369 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 27) {
					local161 = this.aClass1_Sub1_Sub3_3.method500();
					local409 = this.aClass1_Sub1_Sub3_3.method501();
					local485 = this.aClass1_Sub1_Sub3_3.method501();
					@Pc(1444) Class6 local1444 = Class6.aClass6Array1[local161];
					local1444.anInt464 = local409;
					local1444.anInt465 = local485;
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 197) {
					local161 = this.aClass1_Sub1_Sub3_3.method500();
					this.method182(local161);
					if (this.anInt337 != -1) {
						this.anInt337 = -1;
						this.aBoolean66 = true;
						this.aBoolean71 = true;
					}
					if (this.anInt343 != -1) {
						this.anInt343 = -1;
						this.aBoolean49 = true;
					}
					if (this.aBoolean86) {
						this.aBoolean86 = false;
						this.aBoolean49 = true;
					}
					this.anInt348 = local161;
					this.aBoolean50 = false;
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 141) {
					local161 = this.aClass1_Sub1_Sub3_3.method500();
					this.method182(local161);
					if (this.anInt337 != -1) {
						this.anInt337 = -1;
						this.aBoolean66 = true;
						this.aBoolean71 = true;
					}
					this.anInt343 = local161;
					this.aBoolean49 = true;
					this.anInt348 = -1;
					this.aBoolean50 = false;
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 85) {
					local161 = this.aClass1_Sub1_Sub3_3.method501();
					if (local161 >= 0) {
						this.method182(local161);
					}
					this.anInt274 = local161;
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 94) {
					if (this.anInt330 == 12) {
						this.aBoolean66 = true;
					}
					this.anInt311 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 91) {
					local161 = this.aClass1_Sub1_Sub3_3.method500();
					local409 = this.aClass1_Sub1_Sub3_3.method498();
					if (local161 == 65535) {
						local161 = -1;
					}
					this.anIntArray76[local409] = local161;
					this.aBoolean66 = true;
					this.aBoolean71 = true;
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 55) {
					this.aBoolean73 = true;
					this.anInt254 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt255 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt256 = this.aClass1_Sub1_Sub3_3.method500();
					this.anInt257 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt258 = this.aClass1_Sub1_Sub3_3.method498();
					if (this.anInt258 >= 100) {
						this.anInt388 = this.anInt254 * 128 + 64;
						this.anInt390 = this.anInt255 * 128 + 64;
						this.anInt389 = this.method209(this.aBoolean76, this.anInt388, this.anInt390, this.anInt432) - this.anInt256;
					}
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 173) {
					this.anInt364 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt365 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 163) {
					local161 = this.aClass1_Sub1_Sub3_3.method500();
					if (local161 == 65535) {
						local161 = -1;
					}
					if (local161 != this.anInt295 && this.aBoolean77 && !aBoolean56 && this.anInt368 == 0) {
						this.anInt426 = local161;
						this.aBoolean87 = true;
						this.aClass45_Sub1_1.method657(2, this.anInt426);
					}
					this.anInt295 = local161;
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 242) {
					local161 = this.aClass1_Sub1_Sub3_3.method500();
					local409 = this.aClass1_Sub1_Sub3_3.method500();
					if (this.aBoolean77 && !aBoolean56) {
						this.anInt426 = local161;
						this.aBoolean87 = false;
						this.aClass45_Sub1_1.method657(2, this.anInt426);
						this.anInt368 = local409;
					}
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 60) {
					local789 = this.aClass1_Sub1_Sub3_3.method504();
					local485 = this.aClass1_Sub1_Sub3_3.method503();
					local502 = this.aClass1_Sub1_Sub3_3.method498();
					local1112 = false;
					for (local1114 = 0; local1114 < 100; local1114++) {
						if (this.anIntArray62[local1114] == local485) {
							local1112 = true;
							break;
						}
					}
					if (local502 <= 1) {
						for (local903 = 0; local903 < this.anInt396; local903++) {
							if (this.aLongArray3[local903] == local789) {
								local1112 = true;
								break;
							}
						}
					}
					if (!local1112 && this.anInt438 == 0) {
						try {
							this.anIntArray62[this.anInt406] = local485;
							this.anInt406 = (this.anInt406 + 1) % 100;
							@Pc(1890) String local1890 = Class2.method40(this.anInt338 - 13, this.aClass1_Sub1_Sub3_3, this.anInt430);
							@Pc(1894) String local1894 = Class41.method613(local1890);
							if (local502 == 2 || local502 == 3) {
								this.method132("@cr2@" + Class49.method683(Class49.method680(local789)), local1894, 7);
							} else if (local502 == 1) {
								this.method132("@cr1@" + Class49.method683(Class49.method680(local789)), local1894, 7);
							} else {
								this.method132(Class49.method683(Class49.method680(local789)), local1894, 3);
							}
						} catch (@Pc(1951) Exception local1951) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 3) {
					local161 = this.aClass1_Sub1_Sub3_3.method500();
					local409 = this.aClass1_Sub1_Sub3_3.method500();
					Class6.aClass6Array1[local161].anInt476 = 2;
					Class6.aClass6Array1[local161].anInt477 = local409;
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 213) {
					this.anInt261 = this.aClass1_Sub1_Sub3_3.method500();
					this.anInt362 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 143) {
					this.anInt293 = this.aClass1_Sub1_Sub3_3.method500() * 30;
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 168) {
					local161 = this.aClass1_Sub1_Sub3_3.method500();
					local1349 = Class6.aClass6Array1[local161];
					for (local485 = 0; local485 < local1349.anIntArray96.length; local485++) {
						local1349.anIntArray96[local485] = -1;
						local1349.anIntArray96[local485] = 0;
					}
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 21) {
					this.method192();
					this.anInt339 = -1;
					return false;
				}
				if (this.anInt339 == 98 || this.anInt339 == 218 || this.anInt339 == 8 || this.anInt339 == 114 || this.anInt339 == 37 || this.anInt339 == 115 || this.anInt339 == 120 || this.anInt339 == 30 || this.anInt339 == 88 || this.anInt339 == 70) {
					this.method112(this.anInt339, this.aClass1_Sub1_Sub3_3);
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 211) {
					local161 = this.aClass1_Sub1_Sub3_3.method500();
					local409 = this.aClass1_Sub1_Sub3_3.method500();
					Class6.aClass6Array1[local161].anInt476 = 1;
					Class6.aClass6Array1[local161].anInt477 = local409;
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 138) {
					this.anInt330 = this.aClass1_Sub1_Sub3_3.method498();
					this.aBoolean66 = true;
					this.aBoolean71 = true;
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 61) {
					this.anInt364 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt365 = this.aClass1_Sub1_Sub3_3.method498();
					while (this.aClass1_Sub1_Sub3_3.anInt776 < this.anInt338) {
						local161 = this.aClass1_Sub1_Sub3_3.method498();
						this.method112(local161, this.aClass1_Sub1_Sub3_3);
					}
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 41) {
					local161 = this.aClass1_Sub1_Sub3_3.method500();
					local1107 = this.aClass1_Sub1_Sub3_3.method505();
					Class6.aClass6Array1[local161].aString19 = local1107;
					if (Class6.aClass6Array1[local161].anInt458 == this.anIntArray76[this.anInt330]) {
						this.aBoolean66 = true;
					}
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 225) {
					local161 = this.aClass1_Sub1_Sub3_3.method498();
					local409 = this.aClass1_Sub1_Sub3_3.method498();
					local485 = this.aClass1_Sub1_Sub3_3.method498();
					local502 = this.aClass1_Sub1_Sub3_3.method498();
					this.aBooleanArray5[local161] = true;
					this.anIntArray48[local161] = local409;
					this.anIntArray34[local161] = local485;
					this.anIntArray56[local161] = local502;
					this.anIntArray94[local161] = 0;
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 0) {
					this.aBoolean73 = true;
					this.anInt320 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt321 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt322 = this.aClass1_Sub1_Sub3_3.method500();
					this.anInt323 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt324 = this.aClass1_Sub1_Sub3_3.method498();
					if (this.anInt324 >= 100) {
						local161 = this.anInt320 * 128 + 64;
						local409 = this.anInt321 * 128 + 64;
						local485 = this.method209(this.aBoolean76, local161, local409, this.anInt432) - this.anInt322;
						local502 = local161 - this.anInt388;
						local801 = local485 - this.anInt389;
						local1114 = local409 - this.anInt390;
						local903 = (int) Math.sqrt((double) (local502 * local502 + local1114 * local1114));
						this.anInt391 = (int) (Math.atan2((double) local801, (double) local903) * 325.949D) & 0x7FF;
						this.anInt392 = (int) (Math.atan2((double) local502, (double) local1114) * -325.949D) & 0x7FF;
						if (this.anInt391 < 128) {
							this.anInt391 = 128;
						}
						if (this.anInt391 > 383) {
							this.anInt391 = 383;
						}
					}
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 38) {
					local161 = this.aClass1_Sub1_Sub3_3.method500();
					local409 = this.aClass1_Sub1_Sub3_3.method500();
					local485 = local409 >> 10 & 0x1F;
					local502 = local409 >> 5 & 0x1F;
					local801 = local409 & 0x1F;
					Class6.aClass6Array1[local161].anInt472 = (local485 << 19) + (local502 << 11) + (local801 << 3);
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 204) {
					local161 = this.aClass1_Sub1_Sub3_3.method498();
					local409 = this.aClass1_Sub1_Sub3_3.method498();
					@Pc(2485) String local2485 = this.aClass1_Sub1_Sub3_3.method505();
					if (local161 >= 1 && local161 <= 5) {
						if (local2485.equalsIgnoreCase("null")) {
							local2485 = null;
						}
						this.aStringArray5[local161 - 1] = local2485;
						this.aBooleanArray4[local161 - 1] = local409 == 0;
					}
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 25) {
					local161 = this.aClass1_Sub1_Sub3_3.method500();
					local409 = this.aClass1_Sub1_Sub3_3.method498();
					local485 = this.aClass1_Sub1_Sub3_3.method500();
					if (this.aBoolean61 && !aBoolean56 && this.anInt424 < 50) {
						this.anIntArray52[this.anInt424] = local161;
						this.anIntArray78[this.anInt424] = local409;
						this.anIntArray95[this.anInt424] = local485 + Class5.anIntArray31[local161];
						this.anInt424++;
					}
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 174) {
					if (this.anInt337 != -1) {
						this.anInt337 = -1;
						this.aBoolean66 = true;
						this.aBoolean71 = true;
					}
					if (this.anInt343 != -1) {
						this.anInt343 = -1;
						this.aBoolean49 = true;
					}
					if (this.aBoolean86) {
						this.aBoolean86 = false;
						this.aBoolean49 = true;
					}
					this.anInt348 = -1;
					this.aBoolean50 = false;
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 222) {
					local161 = this.aClass1_Sub1_Sub3_3.method500();
					local409 = this.aClass1_Sub1_Sub3_3.method500();
					local485 = this.aClass1_Sub1_Sub3_3.method500();
					@Pc(2644) Class15 local2644 = Class15.method345(local409);
					Class6.aClass6Array1[local161].anInt476 = 4;
					Class6.aClass6Array1[local161].anInt477 = local409;
					Class6.aClass6Array1[local161].anInt483 = local2644.anInt618;
					Class6.aClass6Array1[local161].anInt484 = local2644.anInt619;
					Class6.aClass6Array1[local161].anInt482 = local2644.anInt617 * 100 / local485;
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 161) {
					local161 = this.aClass1_Sub1_Sub3_3.method500();
					Class6.aClass6Array1[local161].anInt476 = 3;
					Class6.aClass6Array1[local161].anInt477 = (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray19[0] << 24) + (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray19[4] << 18) + (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray18[0] << 12) + (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray18[8] << 6) + aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray18[11];
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 255) {
					this.anInt379 = this.aClass1_Sub1_Sub3_3.method498();
					this.aBoolean66 = true;
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 123) {
					this.method172(this.anInt338, this.aClass1_Sub1_Sub3_3);
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 187) {
					local161 = this.aClass1_Sub1_Sub3_3.method500();
					this.method182(local161);
					if (this.anInt343 != -1) {
						this.anInt343 = -1;
						this.aBoolean49 = true;
					}
					if (this.aBoolean86) {
						this.aBoolean86 = false;
						this.aBoolean49 = true;
					}
					this.anInt337 = local161;
					this.aBoolean66 = true;
					this.aBoolean71 = true;
					this.anInt348 = -1;
					this.aBoolean50 = false;
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 249) {
					local161 = this.aClass1_Sub1_Sub3_3.method500();
					local409 = this.aClass1_Sub1_Sub3_3.method500();
					if (this.anInt343 != -1) {
						this.anInt343 = -1;
						this.aBoolean49 = true;
					}
					if (this.aBoolean86) {
						this.aBoolean86 = false;
						this.aBoolean49 = true;
					}
					this.anInt348 = local161;
					this.anInt337 = local409;
					this.aBoolean66 = true;
					this.aBoolean71 = true;
					this.aBoolean50 = false;
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 196) {
					local161 = this.aClass1_Sub1_Sub3_3.method500();
					local409 = this.aClass1_Sub1_Sub3_3.method503();
					this.anIntArray58[local161] = local409;
					if (this.anIntArray50[local161] != local409) {
						this.anIntArray50[local161] = local409;
						this.method226(local161);
						this.aBoolean66 = true;
						if (this.anInt302 != -1) {
							this.aBoolean49 = true;
						}
					}
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 239) {
					local161 = this.aClass1_Sub1_Sub3_3.method501();
					this.anInt302 = local161;
					this.aBoolean49 = true;
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 167) {
					this.aBoolean73 = false;
					for (local161 = 0; local161 < 5; local161++) {
						this.aBooleanArray5[local161] = false;
					}
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 209) {
					local161 = this.aClass1_Sub1_Sub3_3.method500();
					local409 = this.aClass1_Sub1_Sub3_3.method500();
					if (this.anInt333 == local161 && this.anInt334 == local409 && this.anInt415 == 2) {
						this.anInt339 = -1;
						return true;
					}
					this.anInt333 = local161;
					this.anInt334 = local409;
					this.anInt384 = (this.anInt333 - 6) * 8;
					this.anInt385 = (this.anInt334 - 6) * 8;
					this.aBoolean89 = false;
					if ((this.anInt333 / 8 == 48 || this.anInt333 / 8 == 49) && this.anInt334 / 8 == 48) {
						this.aBoolean89 = true;
					}
					if (this.anInt333 / 8 == 48 && this.anInt334 / 8 == 148) {
						this.aBoolean89 = true;
					}
					this.anInt415 = 1;
					this.aLong16 = System.currentTimeMillis();
					this.aClass37_5.method538();
					this.aClass1_Sub1_Sub2_Sub4_2.method465(257, "Loading - please wait.", 151, 0);
					this.aClass1_Sub1_Sub2_Sub4_2.method465(256, "Loading - please wait.", 150, 16777215);
					this.aClass37_5.method539(super.aGraphics2, 4, 4);
					local485 = 0;
					for (local502 = (this.anInt333 - 6) / 8; local502 <= (this.anInt333 + 6) / 8; local502++) {
						for (local801 = (this.anInt334 - 6) / 8; local801 <= (this.anInt334 + 6) / 8; local801++) {
							local485++;
						}
					}
					this.aByteArrayArray2 = new byte[local485][];
					this.aByteArrayArray1 = new byte[local485][];
					this.anIntArray69 = new int[local485];
					this.anIntArray70 = new int[local485];
					this.anIntArray71 = new int[local485];
					local485 = 0;
					for (local801 = (this.anInt333 - 6) / 8; local801 <= (this.anInt333 + 6) / 8; local801++) {
						for (local1114 = (this.anInt334 - 6) / 8; local1114 <= (this.anInt334 + 6) / 8; local1114++) {
							this.anIntArray69[local485] = (local801 << 8) + local1114;
							if (this.aBoolean89 && (local1114 == 49 || local1114 == 149 || local1114 == 147 || local801 == 50 || local801 == 49 && local1114 == 47)) {
								this.anIntArray70[local485] = -1;
								this.anIntArray71[local485] = -1;
								local485++;
							} else {
								local903 = this.anIntArray70[local485] = this.aClass45_Sub1_1.method652(local801, local1114, 0);
								if (local903 != -1) {
									this.aClass45_Sub1_1.method657(3, local903);
								}
								local936 = this.anIntArray71[local485] = this.aClass45_Sub1_1.method652(local801, local1114, 1);
								if (local936 != -1) {
									this.aClass45_Sub1_1.method657(3, local936);
								}
								local485++;
							}
						}
					}
					local1114 = this.anInt384 - this.anInt386;
					local903 = this.anInt385 - this.anInt387;
					this.anInt386 = this.anInt384;
					this.anInt387 = this.anInt385;
					for (local936 = 0; local936 < 16384; local936++) {
						@Pc(3297) Class1_Sub1_Sub1_Sub1_Sub1 local3297 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local936];
						if (local3297 != null) {
							for (@Pc(3301) int local3301 = 0; local3301 < 10; local3301++) {
								local3297.anIntArray16[local3301] -= local1114;
								local3297.anIntArray17[local3301] -= local903;
							}
							local3297.anInt128 -= local1114 * 128;
							local3297.anInt129 -= local903 * 128;
						}
					}
					for (@Pc(3345) int local3345 = 0; local3345 < this.anInt355; local3345++) {
						@Pc(3352) Class1_Sub1_Sub1_Sub1_Sub2 local3352 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local3345];
						if (local3352 != null) {
							for (@Pc(3356) int local3356 = 0; local3356 < 10; local3356++) {
								local3352.anIntArray16[local3356] -= local1114;
								local3352.anIntArray17[local3356] -= local903;
							}
							local3352.anInt128 -= local1114 * 128;
							local3352.anInt129 -= local903 * 128;
						}
					}
					this.aBoolean53 = true;
					@Pc(3404) byte local3404 = 0;
					@Pc(3406) byte local3406 = 104;
					@Pc(3408) byte local3408 = 1;
					if (local1114 < 0) {
						local3404 = 103;
						local3406 = -1;
						local3408 = -1;
					}
					@Pc(3418) byte local3418 = 0;
					@Pc(3420) byte local3420 = 104;
					@Pc(3422) byte local3422 = 1;
					if (local903 < 0) {
						local3418 = 103;
						local3420 = -1;
						local3422 = -1;
					}
					for (@Pc(3432) int local3432 = local3404; local3432 != local3406; local3432 += local3408) {
						for (@Pc(3436) int local3436 = local3418; local3436 != local3420; local3436 += local3422) {
							@Pc(3442) int local3442 = local3432 + local1114;
							@Pc(3446) int local3446 = local3436 + local903;
							for (@Pc(3448) int local3448 = 0; local3448 < 4; local3448++) {
								if (local3442 >= 0 && local3446 >= 0 && local3442 < 104 && local3446 < 104) {
									this.aClass31ArrayArrayArray1[local3448][local3432][local3436] = this.aClass31ArrayArrayArray1[local3448][local3442][local3446];
								} else {
									this.aClass31ArrayArrayArray1[local3448][local3432][local3436] = null;
								}
							}
						}
					}
					for (@Pc(3510) Class1_Sub2 local3510 = (Class1_Sub2) this.aClass31_2.method523(); local3510 != null; local3510 = (Class1_Sub2) this.aClass31_2.method525()) {
						local3510.anInt823 -= local1114;
						local3510.anInt824 -= local903;
						if (local3510.anInt823 < 0 || local3510.anInt824 < 0 || local3510.anInt823 >= 104 || local3510.anInt824 >= 104) {
							local3510.method669();
						}
					}
					if (this.anInt452 != 0) {
						this.anInt452 -= local1114;
						this.anInt453 -= local903;
					}
					this.aBoolean73 = false;
					this.anInt339 = -1;
					return true;
				}
				if (this.anInt339 == 28) {
					this.aBoolean66 = true;
					local161 = this.aClass1_Sub1_Sub3_3.method500();
					local1349 = Class6.aClass6Array1[local161];
					local485 = this.aClass1_Sub1_Sub3_3.method498();
					for (local502 = 0; local502 < local485; local502++) {
						local1349.anIntArray96[local502] = this.aClass1_Sub1_Sub3_3.method500();
						local801 = this.aClass1_Sub1_Sub3_3.method498();
						if (local801 == 255) {
							local801 = this.aClass1_Sub1_Sub3_3.method503();
						}
						local1349.anIntArray97[local502] = local801;
					}
					for (local801 = local485; local801 < local1349.anIntArray96.length; local801++) {
						local1349.anIntArray96[local801] = 0;
						local1349.anIntArray97[local801] = 0;
					}
					this.anInt339 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt339 + "," + this.anInt338 + " - " + this.anInt375 + "," + this.anInt376);
				this.method192();
			} catch (@Pc(3675) IOException local3675) {
				this.method117();
			} catch (@Pc(3680) Exception local3680) {
				local1096 = "T2 - " + this.anInt339 + "," + this.anInt375 + "," + this.anInt376 + " - " + this.anInt338 + "," + (this.anInt384 + aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0]) + "," + (this.anInt385 + aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0]) + " - ";
				for (local409 = 0; local409 < this.anInt338 && local409 < 50; local409++) {
					local1096 = local1096 + this.aClass1_Sub1_Sub3_3.aByteArray9[local409] + ",";
				}
				signlink.reporterror(local1096);
				this.method192();
			}
			return true;
		} catch (@Pc(3761) RuntimeException local3761) {
			signlink.reporterror("51303, " + false + ", " + local3761.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;I)V")
	private void method169(@OriginalArg(0) Class6 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt461;
			@Pc(64) int local64;
			if ((local4 < 1 || local4 > 100) && (local4 < 701 || local4 > 800)) {
				if (local4 >= 101 && local4 <= 200 || local4 >= 801 && local4 <= 900) {
					local64 = this.anInt378;
					if (this.anInt379 != 2) {
						local64 = 0;
					}
					if (local4 > 800) {
						local4 -= 701;
					} else {
						local4 -= 101;
					}
					if (local4 >= local64) {
						arg0.aString19 = "";
						arg0.anInt460 = 0;
					} else {
						if (this.anIntArray51[local4] == 0) {
							arg0.aString19 = "@red@Offline";
						} else if (this.anIntArray51[local4] == anInt291) {
							arg0.aString19 = "@gre@World-" + (this.anIntArray51[local4] - 9);
						} else {
							arg0.aString19 = "@yel@World-" + (this.anIntArray51[local4] - 9);
						}
						arg0.anInt460 = 1;
					}
				} else if (local4 == 203) {
					local64 = this.anInt378;
					if (this.anInt379 != 2) {
						local64 = 0;
					}
					arg0.anInt467 = local64 * 15 + 20;
					if (arg0.anInt467 <= arg0.anInt463) {
						arg0.anInt467 = arg0.anInt463 + 1;
					}
				} else if (local4 >= 401 && local4 <= 500) {
					local4 -= 401;
					if (local4 >= this.anInt396) {
						arg0.aString19 = "";
						arg0.anInt460 = 0;
					} else {
						arg0.aString19 = Class49.method683(Class49.method680(this.aLongArray3[local4]));
						arg0.anInt460 = 1;
					}
				} else if (local4 == 503) {
					arg0.anInt467 = this.anInt396 * 15 + 20;
					if (arg0.anInt467 <= arg0.anInt463) {
						arg0.anInt467 = arg0.anInt463 + 1;
					}
				} else if (local4 == 327) {
					arg0.anInt483 = 150;
					arg0.anInt484 = (int) (Math.sin((double) anInt440 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean60) {
						for (local64 = 0; local64 < 7; local64++) {
							@Pc(301) int local301 = this.anIntArray87[local64];
							if (local301 >= 0 && !Class23.aClass23Array1[local301].method479((byte) 9)) {
								return;
							}
						}
						this.aBoolean60 = false;
						@Pc(320) Class1_Sub1_Sub1_Sub5[] local320 = new Class1_Sub1_Sub1_Sub5[7];
						@Pc(322) int local322 = 0;
						for (@Pc(324) int local324 = 0; local324 < 7; local324++) {
							@Pc(331) int local331 = this.anIntArray87[local324];
							if (local331 >= 0) {
								local320[local322++] = Class23.aClass23Array1[local331].method480();
							}
						}
						@Pc(353) Class1_Sub1_Sub1_Sub5 local353 = new Class1_Sub1_Sub1_Sub5(local320, local322, (byte) 2);
						for (@Pc(355) int local355 = 0; local355 < 5; local355++) {
							if (this.anIntArray64[local355] != 0) {
								local353.method302(anIntArrayArray3[local355][0], anIntArrayArray3[local355][this.anIntArray64[local355]]);
								if (local355 == 1) {
									local353.method302(anIntArray93[0], anIntArray93[this.anIntArray64[local355]]);
								}
							}
						}
						local353.method295();
						local353.method296(Class27.aClass27Array1[aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt132].anIntArray227[0]);
						local353.method305(64, 850, -30, -50, -30, true);
						arg0.anInt476 = 5;
						arg0.anInt477 = 0;
						Class6.method234(344, local353);
					}
				} else if (local4 == 324) {
					if (this.aClass1_Sub1_Sub2_Sub2_10 == null) {
						this.aClass1_Sub1_Sub2_Sub2_10 = arg0.aClass1_Sub1_Sub2_Sub2_14;
						this.aClass1_Sub1_Sub2_Sub2_11 = arg0.aClass1_Sub1_Sub2_Sub2_15;
					}
					if (this.aBoolean46) {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_11;
					} else {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_10;
					}
				} else if (local4 == 325) {
					if (this.aClass1_Sub1_Sub2_Sub2_10 == null) {
						this.aClass1_Sub1_Sub2_Sub2_10 = arg0.aClass1_Sub1_Sub2_Sub2_14;
						this.aClass1_Sub1_Sub2_Sub2_11 = arg0.aClass1_Sub1_Sub2_Sub2_15;
					}
					if (this.aBoolean46) {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_10;
					} else {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_11;
					}
				} else if (local4 == 600) {
					arg0.aString19 = this.aString16;
					if (anInt440 % 20 < 10) {
						arg0.aString19 = arg0.aString19 + "|";
					} else {
						arg0.aString19 = arg0.aString19 + " ";
					}
				} else {
					if (local4 == 613) {
						if (this.anInt413 < 1) {
							arg0.aString19 = "";
						} else if (this.aBoolean65) {
							arg0.anInt472 = 16711680;
							arg0.aString19 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt472 = 16777215;
							arg0.aString19 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(561) String local561;
					if (local4 == 650 || local4 == 655) {
						if (this.anInt314 == 0) {
							arg0.aString19 = "";
						} else {
							if (this.anInt420 == 0) {
								local561 = "earlier today";
							} else if (this.anInt420 == 1) {
								local561 = "yesterday";
							} else {
								local561 = this.anInt420 + " days ago";
							}
							arg0.aString19 = "You last logged in " + local561 + " from: " + signlink.dns;
						}
					}
					if (local4 == 651) {
						if (this.anInt414 == 0) {
							arg0.aString19 = "0 unread messages";
							arg0.anInt472 = 16776960;
						}
						if (this.anInt414 == 1) {
							arg0.aString19 = "1 unread message";
							arg0.anInt472 = 65280;
						}
						if (this.anInt414 > 1) {
							arg0.aString19 = this.anInt414 + " unread messages";
							arg0.anInt472 = 65280;
						}
					}
					if (local4 == 652) {
						if (this.anInt349 == 201) {
							if (this.anInt276 == 1) {
								arg0.aString19 = "@yel@This is a non-members world: @whi@Since you are a member we";
							} else {
								arg0.aString19 = "";
							}
						} else if (this.anInt349 == 200) {
							arg0.aString19 = "You have not yet set any password recovery questions.";
						} else {
							if (this.anInt349 == 0) {
								local561 = "Earlier today";
							} else if (this.anInt349 == 1) {
								local561 = "Yesterday";
							} else {
								local561 = this.anInt349 + " days ago";
							}
							arg0.aString19 = local561 + " you changed your recovery questions";
						}
					}
					if (local4 == 653) {
						if (this.anInt349 == 201) {
							if (this.anInt276 == 1) {
								arg0.aString19 = "@whi@recommend you use a members world instead. You may use";
							} else {
								arg0.aString19 = "";
							}
						} else if (this.anInt349 == 200) {
							arg0.aString19 = "We strongly recommend you do so now to secure your account.";
						} else {
							arg0.aString19 = "If you do not remember making this change then cancel it immediately";
						}
					}
					if (local4 == 654) {
						if (this.anInt349 == 201) {
							if (this.anInt276 == 1) {
								arg0.aString19 = "@whi@this world but member benefits are unavailabe whilst here.";
							} else {
								arg0.aString19 = "";
							}
						} else if (this.anInt349 == 200) {
							arg0.aString19 = "Do this from the 'account management' area on our front webpage";
						} else {
							arg0.aString19 = "Do this from the 'account management' area on our front webpage";
						}
					}
				}
			} else if (local4 == 1 && this.anInt379 == 0) {
				arg0.aString19 = "Loading friend list";
				arg0.anInt460 = 0;
			} else if (local4 == 1 && this.anInt379 == 1) {
				arg0.aString19 = "Connecting to friendserver";
				arg0.anInt460 = 0;
			} else if (local4 == 2 && this.anInt379 != 2) {
				arg0.aString19 = "Please wait...";
				arg0.anInt460 = 0;
			} else {
				local64 = this.anInt378;
				if (this.anInt379 != 2) {
					local64 = 0;
				}
				if (local4 > 700) {
					local4 -= 601;
				} else {
					local4--;
				}
				if (local4 >= local64) {
					arg0.aString19 = "";
					arg0.anInt460 = 0;
				} else {
					arg0.aString19 = this.aStringArray1[local4];
					arg0.anInt460 = 1;
				}
			}
		} catch (@Pc(769) RuntimeException local769) {
			signlink.reporterror("2762, " + arg0 + ", " + 11170 + ", " + local769.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method170(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			this.method111();
			if (this.anInt437 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array5[this.anInt436 / 100].method406(this.anInt434 - 8 - 4, this.anInt435 - 8 - 4);
			}
			if (this.anInt437 == 2) {
				this.aClass1_Sub1_Sub2_Sub2Array5[this.anInt436 / 100 + 4].method406(this.anInt434 - 8 - 4, this.anInt435 - 8 - 4);
				anInt253++;
				if (anInt253 > 57) {
					anInt253 = 0;
					this.aClass1_Sub1_Sub3_4.method487(100);
				}
			}
			if (this.anInt274 != -1) {
				this.method203(this.anInt274, this.anInt266);
				this.method210(0, 0, Class6.aClass6Array1[this.anInt274], 0);
			}
			if (this.anInt348 != -1) {
				this.method203(this.anInt348, this.anInt266);
				this.method210(0, 0, Class6.aClass6Array1[this.anInt348], 0);
			}
			this.method163();
			if (!this.aBoolean72) {
				this.method158((byte) 8);
				this.method102();
			} else if (this.anInt277 == 0) {
				this.method124();
			}
			if (this.anInt369 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array6[1].method406(472, 296);
			}
			if (this.anInt293 != 0) {
				@Pc(156) int local156 = this.anInt293 / 50;
				@Pc(160) int local160 = local156 / 60;
				@Pc(164) int local164 = local156 % 60;
				if (local164 < 10) {
					this.aClass1_Sub1_Sub2_Sub4_2.method468(329, 16776960, "System update in: " + local160 + ":0" + local164, 4);
				} else {
					this.aClass1_Sub1_Sub2_Sub4_2.method468(329, 16776960, "System update in: " + local160 + ":" + local164, 4);
				}
			}
		} catch (@Pc(206) RuntimeException local206) {
			signlink.reporterror("99671, " + arg0 + ", " + local206.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method171() {
		try {
			this.anInt338 += 0;
			@Pc(17) int local17;
			for (@Pc(9) int local9 = -1; local9 < this.anInt357; local9++) {
				if (local9 == -1) {
					local17 = this.anInt356;
				} else {
					local17 = this.anIntArray59[local9];
				}
				@Pc(29) Class1_Sub1_Sub1_Sub1_Sub2 local29 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local17];
				if (local29 != null && local29.anInt139 > 0) {
					local29.anInt139--;
					if (local29.anInt139 == 0) {
						local29.aString3 = null;
					}
				}
			}
			for (local17 = 0; local17 < this.anInt352; local17++) {
				@Pc(60) int local60 = this.anIntArray57[local17];
				@Pc(65) Class1_Sub1_Sub1_Sub1_Sub1 local65 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local60];
				if (local65 != null && local65.anInt139 > 0) {
					local65.anInt139--;
					if (local65.anInt139 == 0) {
						local65.aString3 = null;
					}
				}
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("17983, " + 0 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!mb;I)V")
	private void method172(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			this.anInt294 = 0;
			this.anInt358 = 0;
			this.method148(arg0, arg1);
			this.method194(arg0, arg1);
			this.method228(arg1, arg0, this.anInt259);
			if (this.anInt273 != 3891) {
				this.anInt339 = arg1.method498();
			}
			@Pc(40) int local40;
			for (@Pc(33) int local33 = 0; local33 < this.anInt294; local33++) {
				local40 = this.anIntArray47[local33];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local40].anInt168 != anInt440) {
					this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local40].aClass13_1 = null;
					this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local40] = null;
				}
			}
			if (arg1.anInt776 != arg0) {
				signlink.reporterror(this.aString14 + " size mismatch in getnpcpos - pos:" + arg1.anInt776 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local40 = 0; local40 < this.anInt352; local40++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray57[local40]] == null) {
					signlink.reporterror(this.aString14 + " null entry in npc list - pos:" + local40 + " size:" + this.anInt352);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("26765, " + arg0 + ", " + arg1 + ", " + 3891 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!jb;IBI)V")
	private void method173(@OriginalArg(0) Class1_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(5) int local5;
			if (this.aByte11 != 2) {
				for (local5 = 1; local5 > 0; local5++) {
				}
			}
			local5 = this.anInt297 + this.anInt326 & 0x7FF;
			@Pc(26) int local26 = arg2 * arg2 + arg1 * arg1;
			if (local26 <= 6400) {
				@Pc(34) int local34 = Class1_Sub1_Sub1_Sub5.anIntArray158[local5];
				@Pc(38) int local38 = Class1_Sub1_Sub1_Sub5.anIntArray159[local5];
				@Pc(47) int local47 = local34 * 256 / (this.anInt360 + 256);
				@Pc(56) int local56 = local38 * 256 / (this.anInt360 + 256);
				@Pc(66) int local66 = arg1 * local47 + arg2 * local56 >> 16;
				@Pc(76) int local76 = arg1 * local56 - arg2 * local47 >> 16;
				if (local26 > 2500) {
					arg0.method412(83 - local76 - arg0.anInt691 / 2 - 4, local66 + 94 - arg0.anInt690 / 2 + 4, this.aClass1_Sub1_Sub2_Sub3_10);
				} else {
					arg0.method406(local66 + 94 + 4 - arg0.anInt690 / 2, 83 - local76 - arg0.anInt691 / 2 - 4);
				}
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("60325, " + arg0 + ", " + arg1 + ", " + 2 + ", " + arg2 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method174(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 2) {
				this.anInt339 = this.aClass1_Sub1_Sub3_3.method498();
			}
			if (this.anInt293 > 1) {
				this.anInt293--;
			}
			if (this.anInt342 > 0) {
				this.anInt342--;
			}
			for (@Pc(30) int local30 = 0; local30 < 5 && this.method168(); local30++) {
			}
			if (this.aBoolean74) {
				this.method156();
				this.method150();
				this.method220();
				@Pc(57) Class1_Sub1_Sub3 local57 = Class10.method268();
				if (local57 != null) {
					this.aClass1_Sub1_Sub3_4.method487(142);
					this.aClass1_Sub1_Sub3_4.method489(local57.anInt776);
					this.aClass1_Sub1_Sub3_4.method496(local57.anInt776, local57.aByteArray9);
					local57.method486();
				}
				this.anInt340++;
				if (this.anInt340 > 750) {
					this.method117();
				}
				this.method166();
				this.method212(this.aBoolean54);
				this.method171();
				this.anInt266++;
				if (this.anInt437 != 0) {
					this.anInt436 += 20;
					if (this.anInt436 >= 400) {
						this.anInt437 = 0;
					}
				}
				if (this.anInt373 != 0) {
					this.anInt370++;
					if (this.anInt370 >= 15) {
						if (this.anInt373 == 2) {
							this.aBoolean66 = true;
						}
						if (this.anInt373 == 3) {
							this.aBoolean49 = true;
						}
						this.anInt373 = 0;
					}
				}
				if (this.anInt403 != 0) {
					this.anInt380++;
					if (super.anInt232 > this.anInt404 + 5 || super.anInt232 < this.anInt404 - 5 || super.anInt233 > this.anInt405 + 5 || super.anInt233 < this.anInt405 - 5) {
						this.aBoolean78 = true;
					}
					if (super.anInt231 == 0) {
						if (this.anInt403 == 2) {
							this.aBoolean66 = true;
						}
						if (this.anInt403 == 3) {
							this.aBoolean49 = true;
						}
						this.anInt403 = 0;
						if (this.aBoolean78 && this.anInt380 >= 5) {
							this.anInt422 = -1;
							this.method158((byte) 8);
							if (this.anInt422 == this.anInt401 && this.anInt421 != this.anInt402) {
								@Pc(244) Class6 local244 = Class6.aClass6Array1[this.anInt401];
								@Pc(246) byte local246 = 0;
								if (this.anInt251 == 1 && local244.anInt461 == 206) {
									local246 = 1;
								}
								if (local244.anIntArray96[this.anInt421] <= 0) {
									local246 = 0;
								}
								@Pc(270) int local270;
								@Pc(273) int local273;
								if (local244.aBoolean99) {
									local270 = this.anInt402;
									local273 = this.anInt421;
									local244.anIntArray96[local273] = local244.anIntArray96[local270];
									local244.anIntArray97[local273] = local244.anIntArray97[local270];
									local244.anIntArray96[local270] = -1;
									local244.anIntArray97[local270] = 0;
								} else if (local246 == 1) {
									local270 = this.anInt402;
									local273 = this.anInt421;
									while (local270 != local273) {
										if (local270 > local273) {
											local244.method231(local270, local270 - 1);
											local270--;
										} else if (local270 < local273) {
											local244.method231(local270, local270 + 1);
											local270++;
										}
									}
								} else {
									local244.method231(this.anInt402, this.anInt421);
								}
								this.aClass1_Sub1_Sub3_4.method487(176);
								this.aClass1_Sub1_Sub3_4.method489(this.anInt401);
								this.aClass1_Sub1_Sub3_4.method489(this.anInt402);
								this.aClass1_Sub1_Sub3_4.method489(this.anInt421);
								this.aClass1_Sub1_Sub3_4.method488(local246);
							}
						} else if ((this.anInt411 == 1 || this.method135(this.anInt407 - 1)) && this.anInt407 > 2) {
							this.method142();
						} else if (this.anInt407 > 0) {
							this.method193(this.anInt407 - 1);
						}
						this.anInt370 = 10;
						super.anInt237 = 0;
					}
				}
				anInt316++;
				if (anInt316 > 62) {
					anInt316 = 0;
					this.aClass1_Sub1_Sub3_4.method487(182);
				}
				@Pc(430) int local430;
				@Pc(432) int local432;
				if (Class39.anInt906 != -1) {
					local430 = Class39.anInt906;
					local432 = Class39.anInt907;
					@Pc(453) boolean local453 = this.method109(0, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], 0, local432, true, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], 0, local430, 0, 0);
					Class39.anInt906 = -1;
					if (local453) {
						this.anInt434 = super.anInt238;
						this.anInt435 = super.anInt239;
						this.anInt437 = 1;
						this.anInt436 = 0;
					}
				}
				if (super.anInt237 == 1 && this.aString10 != null) {
					this.aString10 = null;
					this.aBoolean49 = true;
					super.anInt237 = 0;
				}
				this.method126();
				this.method154();
				this.method183();
				this.method125();
				if (super.anInt231 == 1 || super.anInt237 == 1) {
					this.anInt248++;
				}
				if (this.anInt415 == 2) {
					this.method229();
				}
				if (this.anInt415 == 2 && this.aBoolean73) {
					this.method181();
				}
				for (local430 = 0; local430 < 5; local430++) {
					@Pc(539) int local539 = this.anIntArray94[local430]++;
				}
				this.method195();
				super.anInt230++;
				if (super.anInt230 > 4500) {
					this.anInt342 = 250;
					super.anInt230 -= 500;
					this.aClass1_Sub1_Sub3_4.method487(144);
				}
				this.anInt423++;
				if (this.anInt423 > 500) {
					this.anInt423 = 0;
					local432 = (int) (Math.random() * 8.0D);
					if ((local432 & 0x1) == 1) {
						this.anInt445 += this.anInt446;
					}
					if ((local432 & 0x2) == 2) {
						this.anInt350 += this.anInt351;
					}
					if ((local432 & 0x4) == 4) {
						this.anInt450 += this.anInt451;
					}
				}
				if (this.anInt445 < -50) {
					this.anInt446 = 2;
				}
				if (this.anInt445 > 50) {
					this.anInt446 = -2;
				}
				if (this.anInt350 < -55) {
					this.anInt351 = 2;
				}
				if (this.anInt350 > 55) {
					this.anInt351 = -2;
				}
				if (this.anInt450 < -40) {
					this.anInt451 = 1;
				}
				if (this.anInt450 > 40) {
					this.anInt451 = -1;
				}
				this.anInt329++;
				if (this.anInt329 > 500) {
					this.anInt329 = 0;
					local432 = (int) (Math.random() * 8.0D);
					if ((local432 & 0x1) == 1) {
						this.anInt326 += this.anInt327;
					}
					if ((local432 & 0x2) == 2) {
						this.anInt360 += this.anInt361;
					}
				}
				if (this.anInt326 < -60) {
					this.anInt327 = 2;
				}
				if (this.anInt326 > 60) {
					this.anInt327 = -2;
				}
				if (this.anInt360 < -20) {
					this.anInt361 = 1;
				}
				if (this.anInt360 > 10) {
					this.anInt361 = -1;
				}
				this.anInt341++;
				if (this.anInt341 > 50) {
					this.aClass1_Sub1_Sub3_4.method487(239);
				}
				try {
					if (this.aClass8_1 != null && this.aClass1_Sub1_Sub3_4.anInt776 > 0) {
						this.aClass8_1.method248(this.aClass1_Sub1_Sub3_4.anInt776, this.aClass1_Sub1_Sub3_4.aByteArray9);
						this.aClass1_Sub1_Sub3_4.anInt776 = 0;
						this.anInt341 = 0;
					}
				} catch (@Pc(781) IOException local781) {
					this.method117();
				} catch (@Pc(786) Exception local786) {
					this.method192();
				}
			}
		} catch (@Pc(791) RuntimeException local791) {
			signlink.reporterror("82573, " + arg0 + ", " + local791.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass1_Sub1_Sub2_Sub3_17.method445(arg4, arg1);
			this.aClass1_Sub1_Sub2_Sub3_18.method445(arg4, arg1 + arg2 - 16);
			Class1_Sub1_Sub2.method458(this.anInt249, 16, arg1 + 16, arg2 - 32, arg4);
			@Pc(45) int local45 = (arg2 - 32) * arg2 / arg3;
			if (local45 < 8) {
				local45 = 8;
			}
			@Pc(62) int local62 = (arg2 - local45 - 32) * arg0 / (arg3 - arg2);
			Class1_Sub1_Sub2.method458(this.anInt428, 16, arg1 + local62 + 16, local45, arg4);
			Class1_Sub1_Sub2.method463(this.anInt409, local45, arg4, arg1 + local62 + 16, this.anInt398);
			Class1_Sub1_Sub2.method463(this.anInt409, local45, arg4 + 1, arg1 + 16 + local62, this.anInt398);
			Class1_Sub1_Sub2.method461(this.anInt398, arg1 + local62 + 16, 16, arg4);
			Class1_Sub1_Sub2.method461(this.anInt398, arg1 + local62 + 17, 16, arg4);
			Class1_Sub1_Sub2.method463(this.anInt409, local45, arg4 + 15, arg1 + 16 + local62, this.anInt345);
			Class1_Sub1_Sub2.method463(this.anInt409, local45 - 1, arg4 + 14, arg1 + local62 + 17, this.anInt345);
			Class1_Sub1_Sub2.method461(this.anInt345, arg1 + local62 + local45 + 15, 16, arg4);
			Class1_Sub1_Sub2.method461(this.anInt345, arg1 + local62 + local45 + 14, 15, arg4 + 1);
		} catch (@Pc(182) RuntimeException local182) {
			signlink.reporterror("66838, " + arg0 + ", " + arg1 + ", " + -11192 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local182.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!d;)Z")
	private boolean method176(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class6 arg1) {
		try {
			@Pc(4) int local4 = arg1.anInt461;
			if (arg0) {
				this.aClass1_Sub1_Sub3_4.method488(67);
			}
			if (this.anInt379 == 2) {
				if (local4 == 201) {
					this.aBoolean49 = true;
					this.aBoolean86 = false;
					this.aBoolean90 = true;
					this.aString17 = "";
					this.anInt303 = 1;
					this.aString12 = "Enter name of friend to add to list";
				}
				if (local4 == 202) {
					this.aBoolean49 = true;
					this.aBoolean86 = false;
					this.aBoolean90 = true;
					this.aString17 = "";
					this.anInt303 = 2;
					this.aString12 = "Enter name of friend to delete from list";
				}
			}
			if (local4 == 205) {
				this.anInt342 = 250;
				return true;
			}
			if (local4 == 501) {
				this.aBoolean49 = true;
				this.aBoolean86 = false;
				this.aBoolean90 = true;
				this.aString17 = "";
				this.anInt303 = 4;
				this.aString12 = "Enter name of player to add to list";
			}
			if (local4 == 502) {
				this.aBoolean49 = true;
				this.aBoolean86 = false;
				this.aBoolean90 = true;
				this.aString17 = "";
				this.anInt303 = 5;
				this.aString12 = "Enter name of player to delete from list";
			}
			@Pc(118) int local118;
			@Pc(122) int local122;
			@Pc(127) int local127;
			if (local4 >= 300 && local4 <= 313) {
				local118 = (local4 - 300) / 2;
				local122 = local4 & 0x1;
				local127 = this.anIntArray87[local118];
				if (local127 != -1) {
					while (true) {
						if (local122 == 0) {
							local127--;
							if (local127 < 0) {
								local127 = Class23.anInt753 - 1;
							}
						}
						if (local122 == 1) {
							local127++;
							if (local127 >= Class23.anInt753) {
								local127 = 0;
							}
						}
						if (!Class23.aClass23Array1[local127].aBoolean205 && Class23.aClass23Array1[local127].anInt754 == local118 + (this.aBoolean46 ? 0 : 7)) {
							this.anIntArray87[local118] = local127;
							this.aBoolean60 = true;
							break;
						}
					}
				}
			}
			if (local4 >= 314 && local4 <= 323) {
				local118 = (local4 - 314) / 2;
				local122 = local4 & 0x1;
				local127 = this.anIntArray64[local118];
				if (local122 == 0) {
					local127--;
					if (local127 < 0) {
						local127 = anIntArrayArray3[local118].length - 1;
					}
				}
				if (local122 == 1) {
					local127++;
					if (local127 >= anIntArrayArray3[local118].length) {
						local127 = 0;
					}
				}
				this.anIntArray64[local118] = local127;
				this.aBoolean60 = true;
			}
			if (local4 == 324 && !this.aBoolean46) {
				this.aBoolean46 = true;
				this.method139();
			}
			if (local4 == 325 && this.aBoolean46) {
				this.aBoolean46 = false;
				this.method139();
			}
			if (local4 == 326) {
				this.aClass1_Sub1_Sub3_4.method487(13);
				this.aClass1_Sub1_Sub3_4.method488(this.aBoolean46 ? 0 : 1);
				for (local118 = 0; local118 < 7; local118++) {
					this.aClass1_Sub1_Sub3_4.method488(this.anIntArray87[local118]);
				}
				for (local122 = 0; local122 < 5; local122++) {
					this.aClass1_Sub1_Sub3_4.method488(this.anIntArray64[local122]);
				}
				return true;
			}
			if (local4 == 613) {
				this.aBoolean65 = !this.aBoolean65;
			}
			if (local4 >= 601 && local4 <= 612) {
				this.method188();
				if (this.aString16.length() > 0) {
					this.aClass1_Sub1_Sub3_4.method487(203);
					this.aClass1_Sub1_Sub3_4.method494(Class49.method679(this.aString16));
					this.aClass1_Sub1_Sub3_4.method488(local4 - 601);
					this.aClass1_Sub1_Sub3_4.method488(this.aBoolean65 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(355) RuntimeException local355) {
			signlink.reporterror("10291, " + arg0 + ", " + arg1 + ", " + local355.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	private void method177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg4 >= 1 && arg1 >= 1 && arg4 <= 102 && arg1 <= 102) {
				if (aBoolean56 && arg6 != this.anInt432) {
					return;
				}
				@Pc(25) int local25 = 0;
				if (arg2 == 0) {
					local25 = this.aClass39_1.method570(arg6, arg4, arg1);
				}
				if (arg2 == 1) {
					local25 = this.aClass39_1.method571(arg6, arg1, arg4);
				}
				if (arg2 == 2) {
					local25 = this.aClass39_1.method572(arg6, arg4, arg1);
				}
				if (arg2 == 3) {
					local25 = this.aClass39_1.method573(arg6, arg4, arg1);
				}
				@Pc(81) int local81;
				if (local25 != 0) {
					local81 = this.aClass39_1.method574(arg6, arg4, arg1, local25);
					@Pc(87) int local87 = local25 >> 14 & 0x7FFF;
					@Pc(91) int local91 = local81 & 0x1F;
					@Pc(95) int local95 = local81 >> 6;
					@Pc(107) Class9 local107;
					if (arg2 == 0) {
						this.aClass39_1.method561(arg1, arg4, arg6);
						local107 = Class9.method258(local87);
						if (local107.aBoolean118) {
							this.aClass19Array1[arg6].method419(local95, arg1, arg4, local91, local107.aBoolean119);
						}
					}
					if (arg2 == 1) {
						this.aClass39_1.method562(arg6, arg1, this.anInt325, arg4);
					}
					if (arg2 == 2) {
						this.aClass39_1.method563(arg6, arg1, arg4);
						local107 = Class9.method258(local87);
						if (arg4 + local107.anInt520 > 103 || arg1 + local107.anInt520 > 103 || arg4 + local107.anInt521 > 103 || arg1 + local107.anInt521 > 103) {
							return;
						}
						if (local107.aBoolean118) {
							this.aClass19Array1[arg6].method420(local95, local107.aBoolean119, local107.anInt520, local107.anInt521, arg4, arg1);
						}
					}
					if (arg2 == 3) {
						this.aClass39_1.method564(arg6, arg1, arg4);
						local107 = Class9.method258(local87);
						if (local107.aBoolean118 && local107.aBoolean120) {
							this.aClass19Array1[arg6].method422(arg1, arg4);
						}
					}
				}
				if (arg5 >= 0) {
					local81 = arg6;
					if (arg6 < 3 && (this.aByteArrayArrayArray7[1][arg4][arg1] & 0x2) == 2) {
						local81 = arg6 + 1;
					}
					Class4.method74(arg1, arg3, local81, this.aClass19Array1[arg6], arg5, arg0, this.aClass39_1, arg4, arg6, this.anIntArrayArrayArray3);
					return;
				}
			}
		} catch (@Pc(255) RuntimeException local255) {
			signlink.reporterror("45657, " + arg0 + ", " + arg1 + ", " + -642 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local255.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method178() {
		try {
			this.anInt264 = 0;
			@Pc(53) int local53;
			@Pc(73) int local73;
			for (@Pc(6) int local6 = -1; local6 < this.anInt357 + this.anInt352; local6++) {
				@Pc(13) Class1_Sub1_Sub1_Sub1 local13;
				if (local6 == -1) {
					local13 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
				} else if (local6 < this.anInt357) {
					local13 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray59[local6]];
				} else {
					local13 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray57[local6 - this.anInt357]];
				}
				if (local13 != null && local13.method49(509)) {
					if (local6 >= this.anInt357) {
						@Pc(146) Class13 local146 = ((Class1_Sub1_Sub1_Sub1_Sub1) local13).aClass13_1;
						if (local146.anInt595 >= 0 && local146.anInt595 < this.aClass1_Sub1_Sub2_Sub2Array6.length) {
							this.method160(local13, (byte) 8, local13.anInt169 + 15);
							if (this.anInt267 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array6[local146.anInt595].method406(this.anInt267 - 12, this.anInt268 - 30);
							}
						}
						if (this.anInt395 == 1 && this.anInt439 == this.anIntArray57[local6 - this.anInt357] && anInt440 % 20 < 10) {
							this.method160(local13, (byte) 8, local13.anInt169 + 15);
							if (this.anInt267 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array6[2].method406(this.anInt267 - 12, this.anInt268 - 28);
							}
						}
					} else {
						local53 = 30;
						@Pc(56) Class1_Sub1_Sub1_Sub1_Sub2 local56 = (Class1_Sub1_Sub1_Sub1_Sub2) local13;
						if (local56.anInt177 != 0) {
							this.method160(local13, (byte) 8, local13.anInt169 + 15);
							if (this.anInt267 > -1) {
								for (local73 = 0; local73 < 8; local73++) {
									if ((local56.anInt177 & 0x1 << local73) != 0) {
										this.aClass1_Sub1_Sub2_Sub2Array6[local73].method406(this.anInt267 - 12, this.anInt268 - local53);
										local53 -= 25;
									}
								}
							}
						}
						if (local6 >= 0 && this.anInt395 == 10 && this.anInt308 == this.anIntArray59[local6]) {
							this.method160(local13, (byte) 8, local13.anInt169 + 15);
							if (this.anInt267 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array6[7].method406(this.anInt267 - 12, this.anInt268 - local53);
							}
						}
					}
					if (local13.aString3 != null && (local6 >= this.anInt357 || this.anInt250 == 0 || this.anInt250 == 3 || this.anInt250 == 1 && this.method151(((Class1_Sub1_Sub1_Sub1_Sub2) local13).aString4, 809))) {
						this.method160(local13, (byte) 8, local13.anInt169);
						if (this.anInt267 > -1 && this.anInt264 < this.anInt265) {
							this.anIntArray41[this.anInt264] = this.aClass1_Sub1_Sub2_Sub4_3.method467(local13.aString3) / 2;
							this.anIntArray40[this.anInt264] = this.aClass1_Sub1_Sub2_Sub4_3.anInt752;
							this.anIntArray38[this.anInt264] = this.anInt267;
							this.anIntArray39[this.anInt264] = this.anInt268;
							this.anIntArray42[this.anInt264] = local13.anInt140;
							this.anIntArray43[this.anInt264] = local13.anInt141;
							this.anIntArray44[this.anInt264] = local13.anInt139;
							this.aStringArray2[this.anInt264++] = local13.aString3;
							if (this.anInt287 == 0 && local13.anInt141 == 1) {
								this.anIntArray40[this.anInt264] += 10;
								this.anIntArray39[this.anInt264] += 5;
							}
							if (this.anInt287 == 0 && local13.anInt141 == 2) {
								this.anIntArray41[this.anInt264] = 60;
							}
						}
					}
					if (local13.anInt142 > anInt440) {
						this.method160(local13, (byte) 8, local13.anInt169 + 15);
						if (this.anInt267 > -1) {
							local53 = local13.anInt143 * 30 / local13.anInt144;
							if (local53 > 30) {
								local53 = 30;
							}
							Class1_Sub1_Sub2.method458(65280, local53, this.anInt268 - 3, 5, this.anInt267 - 15);
							Class1_Sub1_Sub2.method458(16711680, 30 - local53, this.anInt268 - 3, 5, this.anInt267 + local53 - 15);
						}
					}
					for (local53 = 0; local53 < 4; local53++) {
						if (local13.anIntArray15[local53] > anInt440) {
							this.method160(local13, (byte) 8, local13.anInt169 / 2);
							if (this.anInt267 > -1) {
								if (local53 == 1) {
									this.anInt268 -= 20;
								}
								if (local53 == 2) {
									this.anInt267 -= 15;
									this.anInt268 -= 10;
								}
								if (local53 == 3) {
									this.anInt267 += 15;
									this.anInt268 -= 10;
								}
								this.aClass1_Sub1_Sub2_Sub2Array3[local13.anIntArray14[local53]].method406(this.anInt267 - 12, this.anInt268 - 12);
								this.aClass1_Sub1_Sub2_Sub4_1.method465(this.anInt267, String.valueOf(local13.anIntArray13[local53]), this.anInt268 + 4, 0);
								this.aClass1_Sub1_Sub2_Sub4_1.method465(this.anInt267 - 1, String.valueOf(local13.anIntArray13[local53]), this.anInt268 + 3, 16777215);
							}
						}
					}
				}
			}
			for (@Pc(568) int local568 = 0; local568 < this.anInt264; local568++) {
				local53 = this.anIntArray38[local568];
				@Pc(580) int local580 = this.anIntArray39[local568];
				local73 = this.anIntArray41[local568];
				@Pc(590) int local590 = this.anIntArray40[local568];
				@Pc(592) boolean local592 = true;
				while (local592) {
					local592 = false;
					for (@Pc(598) int local598 = 0; local598 < local568; local598++) {
						if (local580 + 2 > this.anIntArray39[local598] - this.anIntArray40[local598] && local580 - local590 < this.anIntArray39[local598] + 2 && local53 - local73 < this.anIntArray38[local598] + this.anIntArray41[local598] && local53 + local73 > this.anIntArray38[local598] - this.anIntArray41[local598] && this.anIntArray39[local598] - this.anIntArray40[local598] < local580) {
							local580 = this.anIntArray39[local598] - this.anIntArray40[local598];
							local592 = true;
						}
					}
				}
				this.anInt267 = this.anIntArray38[local568];
				this.anInt268 = this.anIntArray39[local568] = local580;
				@Pc(697) String local697 = this.aStringArray2[local568];
				if (this.anInt287 == 0) {
					@Pc(702) int local702 = 16776960;
					if (this.anIntArray42[local568] < 6) {
						local702 = this.anIntArray63[this.anIntArray42[local568]];
					}
					if (this.anIntArray42[local568] == 6) {
						local702 = this.anInt431 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray42[local568] == 7) {
						local702 = this.anInt431 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray42[local568] == 8) {
						local702 = this.anInt431 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(777) int local777;
					if (this.anIntArray42[local568] == 9) {
						local777 = 150 - this.anIntArray44[local568];
						if (local777 < 50) {
							local702 = local777 * 1280 + 16711680;
						} else if (local777 < 100) {
							local702 = 16776960 - (local777 - 50) * 327680;
						} else if (local777 < 150) {
							local702 = (local777 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray42[local568] == 10) {
						local777 = 150 - this.anIntArray44[local568];
						if (local777 < 50) {
							local702 = local777 * 5 + 16711680;
						} else if (local777 < 100) {
							local702 = 16711935 - (local777 - 50) * 327680;
						} else if (local777 < 150) {
							local702 = (local777 - 100) * 327680 + 255 - (local777 - 100) * 5;
						}
					}
					if (this.anIntArray42[local568] == 11) {
						local777 = 150 - this.anIntArray44[local568];
						if (local777 < 50) {
							local702 = 16777215 - local777 * 327685;
						} else if (local777 < 100) {
							local702 = (local777 - 50) * 327685 + 65280;
						} else if (local777 < 150) {
							local702 = 16777215 - (local777 - 100) * 327680;
						}
					}
					if (this.anIntArray43[local568] == 0) {
						this.aClass1_Sub1_Sub2_Sub4_3.method465(this.anInt267, local697, this.anInt268 + 1, 0);
						this.aClass1_Sub1_Sub2_Sub4_3.method465(this.anInt267, local697, this.anInt268, local702);
					}
					if (this.anIntArray43[local568] == 1) {
						this.aClass1_Sub1_Sub2_Sub4_3.method469(local697, this.anInt268 + 1, 0, this.anInt431, this.anInt267);
						this.aClass1_Sub1_Sub2_Sub4_3.method469(local697, this.anInt268, local702, this.anInt431, this.anInt267);
					}
					if (this.anIntArray43[local568] == 2) {
						local777 = this.aClass1_Sub1_Sub2_Sub4_3.method467(local697);
						@Pc(998) int local998 = (150 - this.anIntArray44[local568]) * (local777 + 100) / 150;
						Class1_Sub1_Sub2.method455(0, this.anInt267 - 50, 334, this.anInt267 + 50);
						this.aClass1_Sub1_Sub2_Sub4_3.method468(this.anInt268 + 1, 0, local697, this.anInt267 + 50 - local998);
						this.aClass1_Sub1_Sub2_Sub4_3.method468(this.anInt268, local702, local697, this.anInt267 + 50 - local998);
						Class1_Sub1_Sub2.method454();
					}
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method465(this.anInt267, local697, this.anInt268 + 1, 0);
					this.aClass1_Sub1_Sub2_Sub4_3.method465(this.anInt267, local697, this.anInt268, 16776960);
				}
			}
		} catch (@Pc(1073) RuntimeException local1073) {
			signlink.reporterror("26578, " + 0 + ", " + local1073.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method179() {
		try {
			this.aClass37_4.method538();
			@Pc(13) int local13 = this.anInt297 + this.anInt326 & 0x7FF;
			@Pc(20) int local20 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 / 32 + 48;
			@Pc(27) int local27 = 464 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 / 32;
			this.aClass1_Sub1_Sub2_Sub2_13.method410(this.anIntArray49, 5, 25, this.anIntArray46, local20, local27, this.anInt360 + 256, local13, 151, 146);
			this.aClass1_Sub1_Sub2_Sub2_5.method410(this.anIntArray84, 0, 0, this.anIntArray77, 25, 25, 256, this.anInt297, 33, 33);
			for (@Pc(65) int local65 = 0; local65 < this.anInt412; local65++) {
				local20 = this.anIntArray85[local65] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 / 32;
				local27 = this.anIntArray86[local65] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 / 32;
				this.method173(this.aClass1_Sub1_Sub2_Sub2Array7[local65], local27, local20);
			}
			@Pc(120) int local120;
			for (@Pc(116) int local116 = 0; local116 < 104; local116++) {
				for (local120 = 0; local120 < 104; local120++) {
					@Pc(132) Class31 local132 = this.aClass31ArrayArrayArray1[this.anInt432][local116][local120];
					if (local132 != null) {
						local20 = local116 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 / 32;
						local27 = local120 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 / 32;
						this.method173(this.aClass1_Sub1_Sub2_Sub2_6, local27, local20);
					}
				}
			}
			for (local120 = 0; local120 < this.anInt352; local120++) {
				@Pc(183) Class1_Sub1_Sub1_Sub1_Sub1 local183 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray57[local120]];
				if (local183 != null && local183.method49(509) && local183.aClass13_1.aBoolean151) {
					local20 = local183.anInt128 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 / 32;
					local27 = local183.anInt129 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 / 32;
					this.method173(this.aClass1_Sub1_Sub2_Sub2_7, local27, local20);
				}
			}
			@Pc(237) Class1_Sub1_Sub1_Sub1_Sub2 local237;
			for (@Pc(227) int local227 = 0; local227 < this.anInt357; local227++) {
				local237 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray59[local227]];
				if (local237 != null && local237.method49(509)) {
					local20 = local237.anInt128 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 / 32;
					local27 = local237.anInt129 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 / 32;
					@Pc(265) boolean local265 = false;
					@Pc(269) long local269 = Class49.method679(local237.aString4);
					for (@Pc(271) int local271 = 0; local271 < this.anInt378; local271++) {
						if (local269 == this.aLongArray4[local271] && this.anIntArray51[local271] != 0) {
							local265 = true;
							break;
						}
					}
					if (local265) {
						this.method173(this.aClass1_Sub1_Sub2_Sub2_9, local27, local20);
					} else {
						this.method173(this.aClass1_Sub1_Sub2_Sub2_8, local27, local20);
					}
				}
			}
			if (this.anInt395 != 0 && anInt440 % 20 < 10) {
				if (this.anInt395 == 1 && this.anInt439 >= 0 && this.anInt439 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length) {
					@Pc(344) Class1_Sub1_Sub1_Sub1_Sub1 local344 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anInt439];
					if (local344 != null) {
						local20 = local344.anInt128 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 / 32;
						local27 = local344.anInt129 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 / 32;
						this.method105(local20, this.anInt289, local27, this.aClass1_Sub1_Sub2_Sub2_2);
					}
				}
				if (this.anInt395 == 2) {
					local20 = (this.anInt243 - this.anInt384) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 / 32;
					local27 = (this.anInt244 - this.anInt385) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 / 32;
					this.method105(local20, this.anInt289, local27, this.aClass1_Sub1_Sub2_Sub2_2);
				}
				if (this.anInt395 == 10 && this.anInt308 >= 0 && this.anInt308 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length) {
					local237 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anInt308];
					if (local237 != null) {
						local20 = local237.anInt128 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 / 32;
						local27 = local237.anInt129 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 / 32;
						this.method105(local20, this.anInt289, local27, this.aClass1_Sub1_Sub2_Sub2_2);
					}
				}
			}
			if (this.anInt452 != 0) {
				local20 = this.anInt452 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 / 32;
				local27 = this.anInt453 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 / 32;
				this.method173(this.aClass1_Sub1_Sub2_Sub2_1, local27, local20);
			}
			Class1_Sub1_Sub2.method458(16777215, 3, 78, 3, 97);
			this.aClass37_5.method538();
		} catch (@Pc(512) RuntimeException local512) {
			signlink.reporterror("66249, " + -36 + ", " + local512.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIZI)Lclient!yb;")
	private Class48 method180(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(3) byte[] local3 = null;
			@Pc(10) int local10 = 5;
			try {
				if (this.aClass46Array1[0] != null) {
					local3 = this.aClass46Array1[0].method670(891, arg3);
				}
			} catch (@Pc(25) Exception local25) {
			}
			@Pc(39) int local39;
			if (local3 != null) {
				this.aCRC32_1.reset();
				this.aCRC32_1.update(local3);
				local39 = (int) this.aCRC32_1.getValue();
				if (local39 != arg2) {
					local3 = null;
				}
			}
			if (local3 != null) {
				return new Class48(local3, true);
			}
			local39 = 0;
			while (local3 == null) {
				@Pc(60) String local60 = "Unknown error";
				this.method97(arg4, "Requesting " + arg1);
				@Pc(75) int local75;
				try {
					local75 = 0;
					@Pc(86) DataInputStream local86 = this.method131(arg0 + arg2);
					@Pc(89) byte[] local89 = new byte[6];
					local86.readFully(local89, 0, 6);
					@Pc(100) Class1_Sub1_Sub3 local100 = new Class1_Sub1_Sub3(16, local89);
					local100.anInt776 = 3;
					@Pc(108) int local108 = local100.method502() + 6;
					@Pc(110) int local110 = 6;
					local3 = new byte[local108];
					for (@Pc(115) int local115 = 0; local115 < 6; local115++) {
						local3[local115] = local89[local115];
					}
					@Pc(133) int local133;
					while (local110 < local108) {
						local133 = local108 - local110;
						if (local133 > 1000) {
							local133 = 1000;
						}
						@Pc(144) int local144 = local86.read(local3, local110, local133);
						if (local144 < 0) {
							(new StringBuffer("Length error: ")).append(local110).append("/").append(local108).toString();
							throw new IOException("EOF");
						}
						local110 += local144;
						@Pc(173) int local173 = local110 * 100 / local108;
						if (local173 != local75) {
							this.method97(arg4, "Loading " + arg1 + " - " + local173 + "%");
						}
						local75 = local173;
					}
					local86.close();
					try {
						if (this.aClass46Array1[0] != null) {
							this.aClass46Array1[0].method671(arg3, local3, this.aByte13, local3.length);
						}
					} catch (@Pc(219) Exception local219) {
						this.aClass46Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_1.reset();
						this.aCRC32_1.update(local3);
						local133 = (int) this.aCRC32_1.getValue();
						if (local133 != arg2) {
							local3 = null;
							local39++;
							local60 = "Checksum error: " + local133;
						}
					}
				} catch (@Pc(254) IOException local254) {
					if (local60.equals("Unknown error")) {
						local60 = "Connection error";
					}
					local3 = null;
				} catch (@Pc(264) NullPointerException local264) {
					local60 = "Null error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(273) ArrayIndexOutOfBoundsException local273) {
					local60 = "Bounds error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(282) Exception local282) {
					local60 = "Unexpected error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local3 == null) {
					for (local75 = local10; local75 > 0; local75--) {
						if (local39 >= 3) {
							this.method97(arg4, "Game updated - please reload page");
							local75 = 10;
						} else {
							this.method97(arg4, local60 + " - Retrying in " + local75);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(326) Exception local326) {
						}
					}
					local10 *= 2;
					if (local10 > 60) {
						local10 = 60;
					}
				}
			}
			return new Class48(local3, true);
		} catch (@Pc(350) RuntimeException local350) {
			signlink.reporterror("64686, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + local350.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method181() {
		try {
			@Pc(6) int local6 = this.anInt254 * 128 + 64;
			@Pc(13) int local13 = this.anInt255 * 128 + 64;
			@Pc(25) int local25 = this.method209(this.aBoolean76, local6, local13, this.anInt432) - this.anInt256;
			@Pc(31) int local31;
			if (this.aByte4 != 9) {
				for (local31 = 1; local31 > 0; local31++) {
				}
			}
			if (this.anInt388 < local6) {
				this.anInt388 += this.anInt257 + (local6 - this.anInt388) * this.anInt258 / 1000;
				if (this.anInt388 > local6) {
					this.anInt388 = local6;
				}
			}
			if (this.anInt388 > local6) {
				this.anInt388 -= this.anInt257 + (this.anInt388 - local6) * this.anInt258 / 1000;
				if (this.anInt388 < local6) {
					this.anInt388 = local6;
				}
			}
			if (this.anInt389 < local25) {
				this.anInt389 += this.anInt257 + (local25 - this.anInt389) * this.anInt258 / 1000;
				if (this.anInt389 > local25) {
					this.anInt389 = local25;
				}
			}
			if (this.anInt389 > local25) {
				this.anInt389 -= this.anInt257 + (this.anInt389 - local25) * this.anInt258 / 1000;
				if (this.anInt389 < local25) {
					this.anInt389 = local25;
				}
			}
			if (this.anInt390 < local13) {
				this.anInt390 += this.anInt257 + (local13 - this.anInt390) * this.anInt258 / 1000;
				if (this.anInt390 > local13) {
					this.anInt390 = local13;
				}
			}
			if (this.anInt390 > local13) {
				this.anInt390 -= this.anInt257 + (this.anInt390 - local13) * this.anInt258 / 1000;
				if (this.anInt390 < local13) {
					this.anInt390 = local13;
				}
			}
			local6 = this.anInt320 * 128 + 64;
			local13 = this.anInt321 * 128 + 64;
			local25 = this.method209(this.aBoolean76, local6, local13, this.anInt432) - this.anInt322;
			local31 = local6 - this.anInt388;
			@Pc(240) int local240 = local25 - this.anInt389;
			@Pc(245) int local245 = local13 - this.anInt390;
			@Pc(256) int local256 = (int) Math.sqrt((double) (local31 * local31 + local245 * local245));
			@Pc(267) int local267 = (int) (Math.atan2((double) local240, (double) local256) * 325.949D) & 0x7FF;
			@Pc(278) int local278 = (int) (Math.atan2((double) local31, (double) local245) * -325.949D) & 0x7FF;
			if (local267 < 128) {
				local267 = 128;
			}
			if (local267 > 383) {
				local267 = 383;
			}
			if (this.anInt391 < local267) {
				this.anInt391 += this.anInt323 + (local267 - this.anInt391) * this.anInt324 / 1000;
				if (this.anInt391 > local267) {
					this.anInt391 = local267;
				}
			}
			if (this.anInt391 > local267) {
				this.anInt391 -= this.anInt323 + (this.anInt391 - local267) * this.anInt324 / 1000;
				if (this.anInt391 < local267) {
					this.anInt391 = local267;
				}
			}
			@Pc(349) int local349 = local278 - this.anInt392;
			if (local349 > 1024) {
				local349 -= 2048;
			}
			if (local349 < -1024) {
				local349 += 2048;
			}
			if (local349 > 0) {
				this.anInt392 += this.anInt323 + local349 * this.anInt324 / 1000;
				this.anInt392 &= 0x7FF;
			}
			if (local349 < 0) {
				this.anInt392 -= this.anInt323 + -local349 * this.anInt324 / 1000;
				this.anInt392 &= 0x7FF;
			}
			@Pc(407) int local407 = local278 - this.anInt392;
			if (local407 > 1024) {
				local407 -= 2048;
			}
			if (local407 < -1024) {
				local407 += 2048;
			}
			if (local407 < 0 && local349 > 0 || local407 > 0 && local349 < 0) {
				this.anInt392 = local278;
			}
		} catch (@Pc(428) RuntimeException local428) {
			signlink.reporterror("75265, " + 9 + ", " + local428.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method182(@OriginalArg(0) int arg0) {
		try {
			@Pc(9) Class6 local9 = Class6.aClass6Array1[arg0];
			for (@Pc(11) int local11 = 0; local11 < local9.anIntArray100.length && local9.anIntArray100[local11] != -1; local11++) {
				@Pc(26) Class6 local26 = Class6.aClass6Array1[local9.anIntArray100[local11]];
				if (local26.anInt459 == 1) {
					this.method182(local26.anInt457);
				}
				local26.anInt455 = 0;
				local26.anInt456 = 0;
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("31085, " + arg0 + ", " + 32215 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method183() {
		try {
			if (super.anInt237 == 1) {
				if (super.anInt238 >= 539 && super.anInt238 <= 573 && super.anInt239 >= 169 && super.anInt239 < 205 && this.anIntArray76[0] != -1) {
					this.aBoolean66 = true;
					this.anInt330 = 0;
					this.aBoolean71 = true;
				}
				if (super.anInt238 >= 569 && super.anInt238 <= 599 && super.anInt239 >= 168 && super.anInt239 < 205 && this.anIntArray76[1] != -1) {
					this.aBoolean66 = true;
					this.anInt330 = 1;
					this.aBoolean71 = true;
				}
				if (super.anInt238 >= 597 && super.anInt238 <= 627 && super.anInt239 >= 168 && super.anInt239 < 205 && this.anIntArray76[2] != -1) {
					this.aBoolean66 = true;
					this.anInt330 = 2;
					this.aBoolean71 = true;
				}
				if (super.anInt238 >= 625 && super.anInt238 <= 669 && super.anInt239 >= 168 && super.anInt239 < 203 && this.anIntArray76[3] != -1) {
					this.aBoolean66 = true;
					this.anInt330 = 3;
					this.aBoolean71 = true;
				}
				if (super.anInt238 >= 666 && super.anInt238 <= 696 && super.anInt239 >= 168 && super.anInt239 < 205 && this.anIntArray76[4] != -1) {
					this.aBoolean66 = true;
					this.anInt330 = 4;
					this.aBoolean71 = true;
				}
				if (super.anInt238 >= 694 && super.anInt238 <= 724 && super.anInt239 >= 168 && super.anInt239 < 205 && this.anIntArray76[5] != -1) {
					this.aBoolean66 = true;
					this.anInt330 = 5;
					this.aBoolean71 = true;
				}
				if (super.anInt238 >= 722 && super.anInt238 <= 756 && super.anInt239 >= 169 && super.anInt239 < 205 && this.anIntArray76[6] != -1) {
					this.aBoolean66 = true;
					this.anInt330 = 6;
					this.aBoolean71 = true;
				}
				if (super.anInt238 >= 540 && super.anInt238 <= 574 && super.anInt239 >= 466 && super.anInt239 < 502 && this.anIntArray76[7] != -1) {
					this.aBoolean66 = true;
					this.anInt330 = 7;
					this.aBoolean71 = true;
				}
				if (super.anInt238 >= 572 && super.anInt238 <= 602 && super.anInt239 >= 466 && super.anInt239 < 503 && this.anIntArray76[8] != -1) {
					this.aBoolean66 = true;
					this.anInt330 = 8;
					this.aBoolean71 = true;
				}
				if (super.anInt238 >= 599 && super.anInt238 <= 629 && super.anInt239 >= 466 && super.anInt239 < 503 && this.anIntArray76[9] != -1) {
					this.aBoolean66 = true;
					this.anInt330 = 9;
					this.aBoolean71 = true;
				}
				if (super.anInt238 >= 627 && super.anInt238 <= 671 && super.anInt239 >= 467 && super.anInt239 < 502 && this.anIntArray76[10] != -1) {
					this.aBoolean66 = true;
					this.anInt330 = 10;
					this.aBoolean71 = true;
				}
				if (super.anInt238 >= 669 && super.anInt238 <= 699 && super.anInt239 >= 466 && super.anInt239 < 503 && this.anIntArray76[11] != -1) {
					this.aBoolean66 = true;
					this.anInt330 = 11;
					this.aBoolean71 = true;
				}
				if (super.anInt238 >= 696 && super.anInt238 <= 726 && super.anInt239 >= 466 && super.anInt239 < 503 && this.anIntArray76[12] != -1) {
					this.aBoolean66 = true;
					this.anInt330 = 12;
					this.aBoolean71 = true;
				}
				if (super.anInt238 >= 724 && super.anInt238 <= 758 && super.anInt239 >= 466 && super.anInt239 < 502 && this.anIntArray76[13] != -1) {
					this.aBoolean66 = true;
					this.anInt330 = 13;
					this.aBoolean71 = true;
					return;
				}
			}
		} catch (@Pc(443) RuntimeException local443) {
			signlink.reporterror("51403, " + -19134 + ", " + local443.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method185() {
		try {
			signlink.anInt928 = 0;
			signlink.midi = "stop";
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("8059, " + 0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method186() {
		try {
			while (true) {
				@Pc(9) Class1_Sub1_Sub4 local9 = this.aClass45_Sub1_1.method659();
				if (local9 == null) {
					return;
				}
				if (local9.anInt804 == 0) {
					Class1_Sub1_Sub1_Sub5.method286(local9.aByteArray10, local9.anInt805);
					if ((this.aClass45_Sub1_1.method655(local9.anInt805, (byte) 1) & 0x62) != 0) {
						this.aBoolean66 = true;
						if (this.anInt343 != -1) {
							this.aBoolean49 = true;
						}
					}
				}
				if (local9.anInt804 == 1 && local9.aByteArray10 != null) {
					Class14.method325(local9.aByteArray10);
				}
				if (local9.anInt804 == 2 && local9.anInt805 == this.anInt426 && local9.aByteArray10 != null) {
					this.method207(this.aByte7, local9.aByteArray10, this.aBoolean87);
				}
				if (local9.anInt804 == 3 && this.anInt415 == 1) {
					for (@Pc(81) int local81 = 0; local81 < this.aByteArrayArray2.length; local81++) {
						if (this.anIntArray70[local81] == local9.anInt805) {
							this.aByteArrayArray2[local81] = local9.aByteArray10;
							if (local9.aByteArray10 == null) {
								this.anIntArray70[local81] = -1;
							}
							break;
						}
						if (this.anIntArray71[local81] == local9.anInt805) {
							this.aByteArrayArray1[local81] = local9.aByteArray10;
							if (local9.aByteArray10 == null) {
								this.anIntArray71[local81] = -1;
							}
							break;
						}
					}
				}
				if (local9.anInt804 == 93 && this.aClass45_Sub1_1.method654(local9.anInt805)) {
					Class4.method60(this.aClass45_Sub1_1, new Class1_Sub1_Sub3(16, local9.aByteArray10));
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("56720, " + 83 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!mb;)V")
	private void method187(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			arg1.method508();
			@Pc(7) int local7 = arg1.method509(1);
			if (local7 != 0) {
				@Pc(29) int local29 = arg1.method509(2);
				if (local29 == 0) {
					this.anIntArray60[this.anInt358++] = this.anInt356;
				} else {
					@Pc(52) int local52;
					@Pc(63) int local63;
					if (local29 == 1) {
						local52 = arg1.method509(3);
						aClass1_Sub1_Sub1_Sub1_Sub2_1.method47(this.anInt442, local52, false);
						local63 = arg1.method509(1);
						if (local63 == 1) {
							this.anIntArray60[this.anInt358++] = this.anInt356;
						}
					} else {
						@Pc(109) int local109;
						if (local29 == 2) {
							local52 = arg1.method509(3);
							aClass1_Sub1_Sub1_Sub1_Sub2_1.method47(this.anInt442, local52, true);
							local63 = arg1.method509(3);
							aClass1_Sub1_Sub1_Sub1_Sub2_1.method47(this.anInt442, local63, true);
							local109 = arg1.method509(1);
							if (local109 == 1) {
								this.anIntArray60[this.anInt358++] = this.anInt356;
							}
						} else if (local29 == 3) {
							this.anInt432 = arg1.method509(2);
							local52 = arg1.method509(7);
							local63 = arg1.method509(7);
							local109 = arg1.method509(1);
							aClass1_Sub1_Sub1_Sub1_Sub2_1.method46(local109 == 1, local63, local52);
							@Pc(165) int local165 = arg1.method509(1);
							if (local165 == 1) {
								this.anIntArray60[this.anInt358++] = this.anInt356;
							}
						}
					}
				}
			}
		} catch (@Pc(182) RuntimeException local182) {
			signlink.reporterror("60668, " + arg0 + ", " + 2 + ", " + arg1 + ", " + local182.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method188() {
		try {
			this.aClass1_Sub1_Sub3_4.method487(58);
			if (this.anInt337 != -1) {
				this.anInt337 = -1;
				this.aBoolean66 = true;
				this.aBoolean50 = false;
				this.aBoolean71 = true;
			}
			if (this.anInt343 != -1) {
				this.anInt343 = -1;
				this.aBoolean49 = true;
				this.aBoolean50 = false;
			}
			this.anInt348 = -1;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("8381, " + 1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method189() {
		try {
			this.aClass37_3.method538();
			Class1_Sub1_Sub2_Sub1.anIntArray185 = this.anIntArray91;
			this.aClass1_Sub1_Sub2_Sub3_9.method445(0, 0);
			if (this.anInt337 != -1) {
				this.method210(0, 0, Class6.aClass6Array1[this.anInt337], 0);
			} else if (this.anIntArray76[this.anInt330] != -1) {
				this.method210(0, 0, Class6.aClass6Array1[this.anIntArray76[this.anInt330]], 0);
			}
			if (this.aBoolean72 && this.anInt277 == 1) {
				this.method124();
			}
			this.aClass37_3.method539(super.aGraphics2, 205, 553);
			this.aClass37_5.method538();
			Class1_Sub1_Sub2_Sub1.anIntArray185 = this.anIntArray92;
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("76482, " + -576 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method190() {
		try {
			@Pc(7) byte[] local7 = this.aClass48_1.method678("title.dat", null);
			@Pc(13) Class1_Sub1_Sub2_Sub2 local13 = new Class1_Sub1_Sub2_Sub2(local7, this);
			this.aClass37_22.method538();
			local13.method404(0, 0);
			this.aClass37_23.method538();
			local13.method404(0, -637);
			this.aClass37_19.method538();
			local13.method404(0, -128);
			this.aClass37_20.method538();
			local13.method404(-371, -202);
			this.aClass37_21.method538();
			local13.method404(-171, -202);
			this.aClass37_24.method538();
			local13.method404(-265, 0);
			this.aClass37_25.method538();
			local13.method404(-265, -562);
			this.aClass37_26.method538();
			local13.method404(-171, -128);
			this.aClass37_27.method538();
			local13.method404(-171, -562);
			@Pc(98) int[] local98 = new int[local13.anInt686];
			for (@Pc(100) int local100 = 0; local100 < local13.anInt687; local100++) {
				for (@Pc(104) int local104 = 0; local104 < local13.anInt686; local104++) {
					local98[local104] = local13.anIntArray210[local13.anInt686 + local13.anInt686 * local100 - local104 - 1];
				}
				for (@Pc(130) int local130 = 0; local130 < local13.anInt686; local130++) {
					local13.anIntArray210[local130 + local13.anInt686 * local100] = local98[local130];
				}
			}
			this.aClass37_22.method538();
			local13.method404(0, 382);
			this.aClass37_23.method538();
			local13.method404(0, -255);
			this.aClass37_19.method538();
			local13.method404(0, 254);
			this.aClass37_20.method538();
			local13.method404(-371, 180);
			this.aClass37_21.method538();
			local13.method404(-171, 180);
			this.aClass37_24.method538();
			local13.method404(-265, 382);
			this.aClass37_25.method538();
			local13.method404(-265, -180);
			this.aClass37_26.method538();
			local13.method404(-171, 254);
			this.aClass37_27.method538();
			local13.method404(-171, -180);
			local13 = new Class1_Sub1_Sub2_Sub2(this.aClass48_1, "logo", 0);
			this.aClass37_19.method538();
			local13.method406(382 - local13.anInt686 / 2 - 128, 18);
			this.anInt338 += 0;
			System.gc();
		} catch (@Pc(274) RuntimeException local274) {
			signlink.reporterror("51579, " + 0 + ", " + local274.toString());
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
				return new URL("http://127.0.0.1:" + (anInt292 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method191() {
		try {
			this.aBoolean58 = true;
			try {
				@Pc(4) long local4 = System.currentTimeMillis();
				@Pc(6) int local6 = 0;
				@Pc(8) int local8 = 20;
				while (this.aBoolean47) {
					this.anInt307++;
					this.method149();
					this.method149();
					this.method211();
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
			this.aBoolean58 = false;
			this.aBoolean74 &= true;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("49772, " + true + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method192() {
		try {
			try {
				if (this.aClass8_1 != null) {
					this.aClass8_1.method244();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass8_1 = null;
			this.aBoolean74 = false;
			this.anInt449 = 0;
			this.aString14 = "";
			this.aString15 = "";
			Class10.method267();
			this.method196(208);
			this.aClass39_1.method544();
			for (@Pc(39) int local39 = 0; local39 < 4; local39++) {
				this.aClass19Array1[local39].method414();
			}
			System.gc();
			this.method185();
			this.anInt295 = -1;
			this.anInt426 = -1;
			this.anInt368 = 0;
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("19326, " + 0 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method193(@OriginalArg(1) int arg0) {
		try {
			if (arg0 >= 0) {
				if (this.aBoolean86) {
					this.aBoolean86 = false;
					this.aBoolean49 = true;
				}
				@Pc(24) int local24 = this.anIntArray80[arg0];
				@Pc(29) int local29 = this.anIntArray81[arg0];
				@Pc(34) int local34 = this.anIntArray82[arg0];
				@Pc(39) int local39 = this.anIntArray83[arg0];
				if (local34 >= 2000) {
					local34 -= 2000;
				}
				@Pc(50) Class6 local50;
				@Pc(84) String local84;
				@Pc(69) String local69;
				if (local34 == 274) {
					local50 = Class6.aClass6Array1[local29];
					this.anInt270 = 1;
					this.anInt271 = local29;
					this.anInt272 = local50.anInt485;
					this.anInt282 = 0;
					this.aBoolean66 = true;
					local69 = local50.aString21;
					if (local69.indexOf(" ") != -1) {
						local69 = local69.substring(0, local69.indexOf(" "));
					}
					local84 = local50.aString21;
					if (local84.indexOf(" ") != -1) {
						local84 = local84.substring(local84.indexOf(" ") + 1);
					}
					this.aString8 = local69 + " " + local50.aString22 + " " + local84;
					if (this.anInt272 == 16) {
						this.aBoolean66 = true;
						this.anInt330 = 3;
						this.aBoolean71 = true;
					}
				} else {
					if (local34 == 231) {
						local50 = Class6.aClass6Array1[local29];
						@Pc(137) boolean local137 = true;
						if (local50.anInt461 > 0) {
							local137 = this.method176(this.aBoolean51, local50);
						}
						if (local137) {
							this.aClass1_Sub1_Sub3_4.method487(244);
							this.aClass1_Sub1_Sub3_4.method489(local29);
						}
					}
					@Pc(165) Class1_Sub1_Sub1_Sub1_Sub1 local165;
					if (local34 == 240) {
						local165 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local39];
						if (local165 != null) {
							this.method109(2, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], 0, local165.anIntArray17[0], false, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], 0, local165.anIntArray16[0], 1, 1);
							this.anInt434 = super.anInt238;
							this.anInt435 = super.anInt239;
							this.anInt437 = 2;
							this.anInt436 = 0;
							this.aClass1_Sub1_Sub3_4.method487(231);
							this.aClass1_Sub1_Sub3_4.method489(local39);
							this.aClass1_Sub1_Sub3_4.method489(this.anInt271);
						}
					}
					@Pc(242) Class1_Sub1_Sub1_Sub1_Sub2 local242;
					if (local34 == 639 || local34 == 499 || local34 == 27 || local34 == 387 || local34 == 185) {
						local242 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local39];
						if (local242 != null) {
							this.method109(2, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], 0, local242.anIntArray17[0], false, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], 0, local242.anIntArray16[0], 1, 1);
							this.anInt434 = super.anInt238;
							this.anInt435 = super.anInt239;
							this.anInt437 = 2;
							this.anInt436 = 0;
							if (local34 == 387) {
								anInt427 += local39;
								if (anInt427 >= 66) {
									this.aClass1_Sub1_Sub3_4.method487(233);
									this.aClass1_Sub1_Sub3_4.method488(154);
								}
								this.aClass1_Sub1_Sub3_4.method487(72);
							}
							if (local34 == 499) {
								this.aClass1_Sub1_Sub3_4.method487(17);
							}
							if (local34 == 27) {
								this.aClass1_Sub1_Sub3_4.method487(18);
							}
							if (local34 == 185) {
								this.aClass1_Sub1_Sub3_4.method487(230);
							}
							if (local34 == 639) {
								anInt353++;
								if (anInt353 >= 52) {
									this.aClass1_Sub1_Sub3_4.method487(121);
									this.aClass1_Sub1_Sub3_4.method488(131);
								}
								this.aClass1_Sub1_Sub3_4.method487(192);
							}
							this.aClass1_Sub1_Sub3_4.method489(local39);
						}
					}
					@Pc(367) Class15 local367;
					if (local34 == 1152) {
						local367 = Class15.method345(local39);
						if (local367.aByteArray6 == null) {
							local69 = "It's a " + local367.aString26 + ".";
						} else {
							local69 = new String(local367.aByteArray6);
						}
						this.method132("", local69, 0);
					}
					if (local34 == 721) {
						anInt347 += local29;
						if (anInt347 >= 139) {
							this.aClass1_Sub1_Sub3_4.method487(28);
							this.aClass1_Sub1_Sub3_4.method492(0);
						}
						this.method133(213, local29, local39, this.anInt354, local24);
					}
					if (local34 == 357) {
						this.method133(87, local29, local39, this.anInt354, local24);
					}
					if (local34 == 563) {
						this.aClass1_Sub1_Sub3_4.method487(102);
						this.aClass1_Sub1_Sub3_4.method489(local39);
						this.aClass1_Sub1_Sub3_4.method489(local24);
						this.aClass1_Sub1_Sub3_4.method489(local29);
						this.aClass1_Sub1_Sub3_4.method489(this.anInt271);
						this.anInt370 = 0;
						this.anInt371 = local29;
						this.anInt372 = local24;
						this.anInt373 = 2;
						if (Class6.aClass6Array1[local29].anInt458 == this.anInt348) {
							this.anInt373 = 1;
						}
						if (Class6.aClass6Array1[local29].anInt458 == this.anInt343) {
							this.anInt373 = 3;
						}
					}
					if (local34 == 398) {
						this.aClass1_Sub1_Sub3_4.method487(200);
						this.aClass1_Sub1_Sub3_4.method489(local39);
						this.aClass1_Sub1_Sub3_4.method489(local24);
						this.aClass1_Sub1_Sub3_4.method489(local29);
						this.aClass1_Sub1_Sub3_4.method489(this.anInt285);
						this.aClass1_Sub1_Sub3_4.method489(this.anInt283);
						this.aClass1_Sub1_Sub3_4.method489(this.anInt284);
						this.anInt370 = 0;
						this.anInt371 = local29;
						this.anInt372 = local24;
						this.anInt373 = 2;
						if (Class6.aClass6Array1[local29].anInt458 == this.anInt348) {
							this.anInt373 = 1;
						}
						if (Class6.aClass6Array1[local29].anInt458 == this.anInt343) {
							this.anInt373 = 3;
						}
					}
					@Pc(595) int local595;
					@Pc(570) String local570;
					@Pc(574) int local574;
					if (local34 == 507 || local34 == 957) {
						local570 = this.aStringArray6[arg0];
						local574 = local570.indexOf("@whi@");
						if (local574 != -1) {
							local570 = local570.substring(local574 + 5).trim();
							local84 = Class49.method683(Class49.method680(Class49.method679(local570)));
							@Pc(593) boolean local593 = false;
							for (local595 = 0; local595 < this.anInt357; local595++) {
								@Pc(605) Class1_Sub1_Sub1_Sub1_Sub2 local605 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray59[local595]];
								if (local605 != null && local605.aString4 != null && local605.aString4.equalsIgnoreCase(local84)) {
									this.method109(2, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], 0, local605.anIntArray17[0], false, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], 0, local605.anIntArray16[0], 1, 1);
									if (local34 == 507) {
										anInt427 += local39;
										if (anInt427 >= 66) {
											this.aClass1_Sub1_Sub3_4.method487(233);
											this.aClass1_Sub1_Sub3_4.method488(154);
										}
										this.aClass1_Sub1_Sub3_4.method487(72);
									}
									if (local34 == 957) {
										anInt353++;
										if (anInt353 >= 52) {
											this.aClass1_Sub1_Sub3_4.method487(121);
											this.aClass1_Sub1_Sub3_4.method488(131);
										}
										this.aClass1_Sub1_Sub3_4.method487(192);
									}
									this.aClass1_Sub1_Sub3_4.method489(this.anIntArray59[local595]);
									local593 = true;
									break;
								}
							}
							if (!local593) {
								this.method132("", "Unable to find " + local84, 0);
							}
						}
					}
					if (local34 == 810 && this.method133(240, local29, local39, this.anInt354, local24)) {
						this.aClass1_Sub1_Sub3_4.method489(this.anInt285);
						this.aClass1_Sub1_Sub3_4.method489(this.anInt283);
						this.aClass1_Sub1_Sub3_4.method489(this.anInt284);
					}
					@Pc(770) long local770;
					if (local34 == 902) {
						local570 = this.aStringArray6[arg0];
						local574 = local570.indexOf("@whi@");
						if (local574 != -1) {
							local770 = Class49.method679(local570.substring(local574 + 5).trim());
							local595 = -1;
							for (@Pc(774) int local774 = 0; local774 < this.anInt378; local774++) {
								if (this.aLongArray4[local774] == local770) {
									local595 = local774;
									break;
								}
							}
							if (local595 != -1 && this.anIntArray51[local595] > 0) {
								this.aBoolean49 = true;
								this.aBoolean86 = false;
								this.aBoolean90 = true;
								this.aString17 = "";
								this.anInt303 = 3;
								this.aLong14 = this.aLongArray4[local595];
								this.aString12 = "Enter message to send to " + this.aStringArray1[local595];
							}
						}
					}
					if (local34 == 899 && this.method133(26, local29, local39, this.anInt354, local24)) {
						this.aClass1_Sub1_Sub3_4.method489(this.anInt271);
					}
					if (local34 == 1071) {
						this.method133(147, local29, local39, this.anInt354, local24);
					}
					if (local34 == 1328) {
						local367 = Class15.method345(local39);
						@Pc(872) Class6 local872 = Class6.aClass6Array1[local29];
						if (local872 != null && local872.anIntArray97[local24] >= 100000) {
							local69 = local872.anIntArray97[local24] + " x " + local367.aString26;
						} else if (local367.aByteArray6 == null) {
							local69 = "It's a " + local367.aString26 + ".";
						} else {
							local69 = new String(local367.aByteArray6);
						}
						this.method132("", local69, 0);
					}
					if (local34 == 829) {
						local165 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local39];
						if (local165 != null) {
							this.method109(2, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], 0, local165.anIntArray17[0], false, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], 0, local165.anIntArray16[0], 1, 1);
							this.anInt434 = super.anInt238;
							this.anInt435 = super.anInt239;
							this.anInt437 = 2;
							this.anInt436 = 0;
							this.aClass1_Sub1_Sub3_4.method487(119);
							this.aClass1_Sub1_Sub3_4.method489(local39);
							this.aClass1_Sub1_Sub3_4.method489(this.anInt285);
							this.aClass1_Sub1_Sub3_4.method489(this.anInt283);
							this.aClass1_Sub1_Sub3_4.method489(this.anInt284);
						}
					}
					if (local34 == 131) {
						local242 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local39];
						if (local242 != null) {
							this.method109(2, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], 0, local242.anIntArray17[0], false, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], 0, local242.anIntArray16[0], 1, 1);
							this.anInt434 = super.anInt238;
							this.anInt435 = super.anInt239;
							this.anInt437 = 2;
							this.anInt436 = 0;
							this.aClass1_Sub1_Sub3_4.method487(68);
							this.aClass1_Sub1_Sub3_4.method489(local39);
							this.aClass1_Sub1_Sub3_4.method489(this.anInt271);
						}
					}
					if (local34 == 524) {
						local570 = this.aStringArray6[arg0];
						local574 = local570.indexOf("@whi@");
						if (local574 != -1) {
							this.method188();
							this.aString16 = local570.substring(local574 + 5).trim();
							this.aBoolean65 = false;
							for (@Pc(1096) int local1096 = 0; local1096 < Class6.aClass6Array1.length; local1096++) {
								if (Class6.aClass6Array1[local1096] != null && Class6.aClass6Array1[local1096].anInt461 == 600) {
									this.anInt306 = this.anInt348 = Class6.aClass6Array1[local1096].anInt458;
									break;
								}
							}
						}
					}
					if (local34 == 743) {
						anInt290++;
						if (anInt290 >= 124) {
							this.aClass1_Sub1_Sub3_4.method487(77);
							this.aClass1_Sub1_Sub3_4.method489(37954);
						}
						this.method133(98, local29, local39, this.anInt354, local24);
					}
					if (local34 == 102) {
						this.anInt282 = 1;
						this.anInt283 = local24;
						this.anInt284 = local29;
						this.anInt285 = local39;
						this.aString9 = Class15.method345(local39).aString26;
						this.anInt270 = 0;
						this.aBoolean66 = true;
					} else {
						if (local34 == 225) {
							this.aClass1_Sub1_Sub3_4.method487(244);
							this.aClass1_Sub1_Sub3_4.method489(local29);
							local50 = Class6.aClass6Array1[local29];
							if (local50.anIntArrayArray6 != null && local50.anIntArrayArray6[0][0] == 5) {
								local574 = local50.anIntArrayArray6[0][1];
								if (this.anIntArray50[local574] != local50.anIntArray99[0]) {
									this.anIntArray50[local574] = local50.anIntArray99[0];
									this.method226(local574);
									this.aBoolean66 = true;
								}
							}
						}
						if (local34 == 625) {
							this.method133(33, local29, local39, this.anInt354, local24);
						}
						if (local34 == 435) {
							this.aClass1_Sub1_Sub3_4.method487(244);
							this.aClass1_Sub1_Sub3_4.method489(local29);
							local50 = Class6.aClass6Array1[local29];
							if (local50.anIntArrayArray6 != null && local50.anIntArrayArray6[0][0] == 5) {
								local574 = local50.anIntArrayArray6[0][1];
								this.anIntArray50[local574] = 1 - this.anIntArray50[local574];
								this.method226(local574);
								this.aBoolean66 = true;
							}
						}
						if (local34 == 605 || local34 == 47 || local34 == 513 || local34 == 884) {
							local570 = this.aStringArray6[arg0];
							local574 = local570.indexOf("@whi@");
							if (local574 != -1) {
								local770 = Class49.method679(local570.substring(local574 + 5).trim());
								if (local34 == 605) {
									this.method162(local770);
								}
								if (local34 == 47) {
									this.method224(local770);
								}
								if (local34 == 513) {
									this.method225(local770);
								}
								if (local34 == 884) {
									this.method127(local770);
								}
							}
						}
						if (local34 == 242 || local34 == 209 || local34 == 309 || local34 == 852 || local34 == 793) {
							local165 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local39];
							if (local165 != null) {
								this.method109(2, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], 0, local165.anIntArray17[0], false, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], 0, local165.anIntArray16[0], 1, 1);
								this.anInt434 = super.anInt238;
								this.anInt435 = super.anInt239;
								this.anInt437 = 2;
								this.anInt436 = 0;
								if (local34 == 309) {
									this.aClass1_Sub1_Sub3_4.method487(69);
								}
								if (local34 == 242) {
									this.aClass1_Sub1_Sub3_4.method487(143);
								}
								if (local34 == 793) {
									this.aClass1_Sub1_Sub3_4.method487(118);
								}
								if (local34 == 209) {
									this.aClass1_Sub1_Sub3_4.method487(195);
								}
								if (local34 == 852) {
									this.aClass1_Sub1_Sub3_4.method487(122);
								}
								this.aClass1_Sub1_Sub3_4.method489(local39);
							}
						}
						if (local34 == 582 || local34 == 113 || local34 == 555 || local34 == 331 || local34 == 354) {
							if (local34 == 555) {
								this.aClass1_Sub1_Sub3_4.method487(59);
							}
							if (local34 == 582) {
								if ((local39 & 0x3) == 0) {
									anInt260++;
								}
								if (anInt260 >= 133) {
									this.aClass1_Sub1_Sub3_4.method487(131);
									this.aClass1_Sub1_Sub3_4.method489(6118);
								}
								this.aClass1_Sub1_Sub3_4.method487(181);
							}
							if (local34 == 331) {
								this.aClass1_Sub1_Sub3_4.method487(160);
							}
							if (local34 == 354) {
								this.aClass1_Sub1_Sub3_4.method487(62);
							}
							if (local34 == 113) {
								this.aClass1_Sub1_Sub3_4.method487(70);
							}
							this.aClass1_Sub1_Sub3_4.method489(local39);
							this.aClass1_Sub1_Sub3_4.method489(local24);
							this.aClass1_Sub1_Sub3_4.method489(local29);
							this.anInt370 = 0;
							this.anInt371 = local29;
							this.anInt372 = local24;
							this.anInt373 = 2;
							if (Class6.aClass6Array1[local29].anInt458 == this.anInt348) {
								this.anInt373 = 1;
							}
							if (Class6.aClass6Array1[local29].anInt458 == this.anInt343) {
								this.anInt373 = 3;
							}
						}
						@Pc(1610) boolean local1610;
						if (local34 == 111) {
							local1610 = this.method109(2, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], 0, local29, false, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], 0, local24, 0, 0);
							if (!local1610) {
								this.method109(2, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], 0, local29, false, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], 0, local24, 1, 1);
							}
							this.anInt434 = super.anInt238;
							this.anInt435 = super.anInt239;
							this.anInt437 = 2;
							this.anInt436 = 0;
							this.aClass1_Sub1_Sub3_4.method487(245);
							this.aClass1_Sub1_Sub3_4.method489(local24 + this.anInt384);
							this.aClass1_Sub1_Sub3_4.method489(local29 + this.anInt385);
							this.aClass1_Sub1_Sub3_4.method489(local39);
							this.aClass1_Sub1_Sub3_4.method489(this.anInt285);
							this.aClass1_Sub1_Sub3_4.method489(this.anInt283);
							this.aClass1_Sub1_Sub3_4.method489(this.anInt284);
						}
						if (local34 == 1714) {
							local165 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local39];
							if (local165 != null) {
								if (local165.aClass13_1.aByteArray5 == null) {
									local69 = "It's a " + local165.aClass13_1.aString25 + ".";
								} else {
									local69 = new String(local165.aClass13_1.aByteArray5);
								}
								this.method132("", local69, 0);
							}
						}
						if (local34 == 718) {
							if (this.aBoolean72) {
								this.aClass39_1.method582(local24 - 4, local29 - 4);
							} else {
								this.aClass39_1.method582(super.anInt238 - 4, super.anInt239 - 4);
							}
						}
						if (local34 == 1381) {
							@Pc(1765) int local1765 = local39 >> 14 & 0x7FFF;
							@Pc(1768) Class9 local1768 = Class9.method258(local1765);
							if (local1768.aByteArray4 == null) {
								local84 = "It's a " + local1768.aString24 + ".";
							} else {
								local84 = new String(local1768.aByteArray4);
							}
							this.method132("", local84, 0);
						}
						if (local34 == 694 || local34 == 962 || local34 == 795 || local34 == 681 || local34 == 100) {
							if (local34 == 681) {
								anInt269++;
								if (anInt269 >= 116) {
									this.aClass1_Sub1_Sub3_4.method487(162);
									this.aClass1_Sub1_Sub3_4.method491(13018169);
								}
								this.aClass1_Sub1_Sub3_4.method487(163);
							}
							if (local34 == 694) {
								this.aClass1_Sub1_Sub3_4.method487(243);
							}
							if (local34 == 100) {
								this.aClass1_Sub1_Sub3_4.method487(74);
							}
							if (local34 == 962) {
								this.aClass1_Sub1_Sub3_4.method487(228);
							}
							if (local34 == 795) {
								this.aClass1_Sub1_Sub3_4.method487(80);
							}
							this.aClass1_Sub1_Sub3_4.method489(local39);
							this.aClass1_Sub1_Sub3_4.method489(local24);
							this.aClass1_Sub1_Sub3_4.method489(local29);
							this.anInt370 = 0;
							this.anInt371 = local29;
							this.anInt372 = local24;
							this.anInt373 = 2;
							if (Class6.aClass6Array1[local29].anInt458 == this.anInt348) {
								this.anInt373 = 1;
							}
							if (Class6.aClass6Array1[local29].anInt458 == this.anInt343) {
								this.anInt373 = 3;
							}
						}
						if (local34 == 997 && !this.aBoolean50) {
							this.aClass1_Sub1_Sub3_4.method487(146);
							this.aClass1_Sub1_Sub3_4.method489(local29);
							this.aBoolean50 = true;
						}
						if (local34 == 139 || local34 == 778 || local34 == 617 || local34 == 224 || local34 == 662) {
							local1610 = this.method109(2, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], 0, local29, false, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], 0, local24, 0, 0);
							if (!local1610) {
								this.method109(2, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], 0, local29, false, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], 0, local24, 1, 1);
							}
							this.anInt434 = super.anInt238;
							this.anInt435 = super.anInt239;
							this.anInt437 = 2;
							this.anInt436 = 0;
							if (local34 == 617) {
								this.aClass1_Sub1_Sub3_4.method487(178);
							}
							if (local34 == 139) {
								if ((local24 & 0x3) == 0) {
									anInt315++;
								}
								if (anInt315 >= 123) {
									this.aClass1_Sub1_Sub3_4.method487(187);
									this.aClass1_Sub1_Sub3_4.method492(0);
								}
								this.aClass1_Sub1_Sub3_4.method487(141);
							}
							if (local34 == 662) {
								anInt408 += this.anInt385;
								if (anInt408 >= 118) {
									this.aClass1_Sub1_Sub3_4.method487(56);
									this.aClass1_Sub1_Sub3_4.method492(0);
								}
								this.aClass1_Sub1_Sub3_4.method487(97);
							}
							if (local34 == 224) {
								anInt331 += local29;
								if (anInt331 >= 75) {
									this.aClass1_Sub1_Sub3_4.method487(206);
									this.aClass1_Sub1_Sub3_4.method488(19);
								}
								this.aClass1_Sub1_Sub3_4.method487(47);
							}
							if (local34 == 778) {
								this.aClass1_Sub1_Sub3_4.method487(67);
							}
							this.aClass1_Sub1_Sub3_4.method489(local24 + this.anInt384);
							this.aClass1_Sub1_Sub3_4.method489(local29 + this.anInt385);
							this.aClass1_Sub1_Sub3_4.method489(local39);
						}
						if (local34 == 737) {
							this.method188();
						}
						if (local34 == 275) {
							local242 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local39];
							if (local242 != null) {
								this.method109(2, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], 0, local242.anIntArray17[0], false, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], 0, local242.anIntArray16[0], 1, 1);
								this.anInt434 = super.anInt238;
								this.anInt435 = super.anInt239;
								this.anInt437 = 2;
								this.anInt436 = 0;
								this.aClass1_Sub1_Sub3_4.method487(113);
								this.aClass1_Sub1_Sub3_4.method489(local39);
								this.aClass1_Sub1_Sub3_4.method489(this.anInt285);
								this.aClass1_Sub1_Sub3_4.method489(this.anInt283);
								this.aClass1_Sub1_Sub3_4.method489(this.anInt284);
							}
						}
						if (local34 == 370) {
							local1610 = this.method109(2, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], 0, local29, false, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], 0, local24, 0, 0);
							if (!local1610) {
								this.method109(2, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], 0, local29, false, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], 0, local24, 1, 1);
							}
							this.anInt434 = super.anInt238;
							this.anInt435 = super.anInt239;
							this.anInt437 = 2;
							this.anInt436 = 0;
							this.aClass1_Sub1_Sub3_4.method487(202);
							this.aClass1_Sub1_Sub3_4.method489(local24 + this.anInt384);
							this.aClass1_Sub1_Sub3_4.method489(local29 + this.anInt385);
							this.aClass1_Sub1_Sub3_4.method489(local39);
							this.aClass1_Sub1_Sub3_4.method489(this.anInt271);
						}
						this.anInt282 = 0;
						this.anInt270 = 0;
						this.aBoolean66 = true;
					}
				}
			}
		} catch (@Pc(2294) RuntimeException local2294) {
			signlink.reporterror("87720, " + 8 + ", " + arg0 + ", " + local2294.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZLclient!mb;)V")
	private void method194(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt777 + 21 < arg0 * 8) {
					@Pc(12) int local12 = arg1.method509(14);
					if (local12 != 16383) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local12] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local12] = new Class1_Sub1_Sub1_Sub1_Sub1();
						}
						@Pc(32) Class1_Sub1_Sub1_Sub1_Sub1 local32 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local12];
						this.anIntArray57[this.anInt352++] = local12;
						local32.anInt168 = anInt440;
						local32.aClass13_1 = Class13.method320(arg1.method509(11));
						local32.anInt131 = local32.aClass13_1.aByte23;
						local32.anInt171 = local32.aClass13_1.anInt596;
						local32.anInt134 = local32.aClass13_1.anInt583;
						local32.anInt135 = local32.aClass13_1.anInt584;
						local32.anInt136 = local32.aClass13_1.anInt585;
						local32.anInt137 = local32.aClass13_1.anInt586;
						local32.anInt132 = local32.aClass13_1.anInt582;
						@Pc(93) int local93 = arg1.method509(5);
						if (local93 > 15) {
							local93 -= 32;
						}
						@Pc(102) int local102 = arg1.method509(5);
						if (local102 > 15) {
							local102 -= 32;
						}
						local32.method46(false, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0] + local102, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0] + local93);
						@Pc(127) int local127 = arg1.method509(1);
						if (local127 == 1) {
							this.anIntArray60[this.anInt358++] = local12;
						}
						continue;
					}
				}
				arg1.method510();
				return;
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("18806, " + arg0 + ", " + true + ", " + arg1 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method195() {
		try {
			anInt397++;
			if (anInt397 > 192) {
				anInt397 = 0;
				this.aClass1_Sub1_Sub3_4.method487(226);
				this.aClass1_Sub1_Sub3_4.method488(232);
			}
			while (true) {
				@Pc(29) int local29;
				do {
					while (true) {
						local29 = this.method89(716);
						if (local29 == -1) {
							return;
						}
						if (this.anInt348 != -1 && this.anInt348 == this.anInt306) {
							if (local29 == 8 && this.aString16.length() > 0) {
								this.aString16 = this.aString16.substring(0, this.aString16.length() - 1);
							}
							break;
						}
						@Pc(209) int local209;
						if (this.aBoolean90) {
							if (local29 >= 32 && local29 <= 122 && this.aString17.length() < 80) {
								this.aString17 = this.aString17 + (char) local29;
								this.aBoolean49 = true;
							}
							if (local29 == 8 && this.aString17.length() > 0) {
								this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
								this.aBoolean49 = true;
							}
							if (local29 == 13 || local29 == 10) {
								this.aBoolean90 = false;
								this.aBoolean49 = true;
								@Pc(169) long local169;
								if (this.anInt303 == 1) {
									local169 = Class49.method679(this.aString17);
									this.method162(local169);
								}
								if (this.anInt303 == 2 && this.anInt378 > 0) {
									local169 = Class49.method679(this.aString17);
									this.method225(local169);
								}
								if (this.anInt303 == 3 && this.aString17.length() > 0) {
									this.aClass1_Sub1_Sub3_4.method487(214);
									this.aClass1_Sub1_Sub3_4.method488(0);
									local209 = this.aClass1_Sub1_Sub3_4.anInt776;
									this.aClass1_Sub1_Sub3_4.method494(this.aLong14);
									Class2.method41(this.aString17, this.aClass1_Sub1_Sub3_4);
									this.aClass1_Sub1_Sub3_4.method497(this.aClass1_Sub1_Sub3_4.anInt776 - local209, (byte) 7);
									this.aString17 = Class49.method684(this.aString17);
									this.aString17 = Class41.method613(this.aString17);
									this.method132(Class49.method683(Class49.method680(this.aLong14)), this.aString17, 6);
									if (this.anInt381 == 2) {
										this.anInt381 = 1;
										this.aBoolean79 = true;
										this.aClass1_Sub1_Sub3_4.method487(129);
										this.aClass1_Sub1_Sub3_4.method488(this.anInt250);
										this.aClass1_Sub1_Sub3_4.method488(this.anInt381);
										this.aClass1_Sub1_Sub3_4.method488(this.anInt252);
									}
								}
								if (this.anInt303 == 4 && this.anInt396 < 100) {
									local169 = Class49.method679(this.aString17);
									this.method224(local169);
								}
								if (this.anInt303 == 5 && this.anInt396 > 0) {
									local169 = Class49.method679(this.aString17);
									this.method127(local169);
								}
							}
						} else if (this.aBoolean86) {
							if (local29 >= 48 && local29 <= 57 && this.aString18.length() < 10) {
								this.aString18 = this.aString18 + (char) local29;
								this.aBoolean49 = true;
							}
							if (local29 == 8 && this.aString18.length() > 0) {
								this.aString18 = this.aString18.substring(0, this.aString18.length() - 1);
								this.aBoolean49 = true;
							}
							if (local29 == 13 || local29 == 10) {
								if (this.aString18.length() > 0) {
									local209 = 0;
									try {
										local209 = Integer.parseInt(this.aString18);
									} catch (@Pc(385) Exception local385) {
									}
									this.aClass1_Sub1_Sub3_4.method487(161);
									this.aClass1_Sub1_Sub3_4.method492(local209);
								}
								this.aBoolean86 = false;
								this.aBoolean49 = true;
							}
						} else if (this.anInt343 == -1) {
							if (local29 >= 32 && local29 <= 122 && this.aString5.length() < 80) {
								this.aString5 = this.aString5 + (char) local29;
								this.aBoolean49 = true;
							}
							if (local29 == 8 && this.aString5.length() > 0) {
								this.aString5 = this.aString5.substring(0, this.aString5.length() - 1);
								this.aBoolean49 = true;
							}
							if ((local29 == 13 || local29 == 10) && this.aString5.length() > 0) {
								if (this.anInt413 == 2) {
									if (this.aString5.equals("::clientdrop")) {
										this.method117();
									}
									if (this.aString5.equals("::lag")) {
										this.method100();
									}
									if (this.aString5.equals("::prefetchmusic")) {
										for (local209 = 0; local209 < this.aClass45_Sub1_1.method650(2); local209++) {
											this.aClass45_Sub1_1.method660(2, local209, (byte) 1);
										}
									}
								}
								if (this.aString5.startsWith("::")) {
									this.aClass1_Sub1_Sub3_4.method487(86);
									this.aClass1_Sub1_Sub3_4.method488(this.aString5.length() - 1);
									this.aClass1_Sub1_Sub3_4.method495(this.aString5.substring(2));
								} else {
									@Pc(536) byte local536 = 0;
									if (this.aString5.startsWith("yellow:")) {
										local536 = 0;
										this.aString5 = this.aString5.substring(7);
									}
									if (this.aString5.startsWith("red:")) {
										local536 = 1;
										this.aString5 = this.aString5.substring(4);
									}
									if (this.aString5.startsWith("green:")) {
										local536 = 2;
										this.aString5 = this.aString5.substring(6);
									}
									if (this.aString5.startsWith("cyan:")) {
										local536 = 3;
										this.aString5 = this.aString5.substring(5);
									}
									if (this.aString5.startsWith("purple:")) {
										local536 = 4;
										this.aString5 = this.aString5.substring(7);
									}
									if (this.aString5.startsWith("white:")) {
										local536 = 5;
										this.aString5 = this.aString5.substring(6);
									}
									if (this.aString5.startsWith("flash1:")) {
										local536 = 6;
										this.aString5 = this.aString5.substring(7);
									}
									if (this.aString5.startsWith("flash2:")) {
										local536 = 7;
										this.aString5 = this.aString5.substring(7);
									}
									if (this.aString5.startsWith("flash3:")) {
										local536 = 8;
										this.aString5 = this.aString5.substring(7);
									}
									if (this.aString5.startsWith("glow1:")) {
										local536 = 9;
										this.aString5 = this.aString5.substring(6);
									}
									if (this.aString5.startsWith("glow2:")) {
										local536 = 10;
										this.aString5 = this.aString5.substring(6);
									}
									if (this.aString5.startsWith("glow3:")) {
										local536 = 11;
										this.aString5 = this.aString5.substring(6);
									}
									@Pc(694) byte local694 = 0;
									if (this.aString5.startsWith("wave:")) {
										local694 = 1;
										this.aString5 = this.aString5.substring(5);
									}
									if (this.aString5.startsWith("scroll:")) {
										local694 = 2;
										this.aString5 = this.aString5.substring(7);
									}
									this.aClass1_Sub1_Sub3_4.method487(83);
									this.aClass1_Sub1_Sub3_4.method488(0);
									@Pc(733) int local733 = this.aClass1_Sub1_Sub3_4.anInt776;
									this.aClass1_Sub1_Sub3_4.method488(local536);
									this.aClass1_Sub1_Sub3_4.method488(local694);
									Class2.method41(this.aString5, this.aClass1_Sub1_Sub3_4);
									this.aClass1_Sub1_Sub3_4.method497(this.aClass1_Sub1_Sub3_4.anInt776 - local733, (byte) 7);
									this.aString5 = Class49.method684(this.aString5);
									this.aString5 = Class41.method613(this.aString5);
									aClass1_Sub1_Sub1_Sub1_Sub2_1.aString3 = this.aString5;
									aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt140 = local536;
									aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt141 = local694;
									aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt139 = 150;
									if (this.anInt413 == 2) {
										this.method132("@cr2@" + aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4, aClass1_Sub1_Sub1_Sub1_Sub2_1.aString3, 2);
									} else if (this.anInt413 == 1) {
										this.method132("@cr1@" + aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4, aClass1_Sub1_Sub1_Sub1_Sub2_1.aString3, 2);
									} else {
										this.method132(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4, aClass1_Sub1_Sub1_Sub1_Sub2_1.aString3, 2);
									}
									if (this.anInt250 == 2) {
										this.anInt250 = 3;
										this.aBoolean79 = true;
										this.aClass1_Sub1_Sub3_4.method487(129);
										this.aClass1_Sub1_Sub3_4.method488(this.anInt250);
										this.aClass1_Sub1_Sub3_4.method488(this.anInt381);
										this.aClass1_Sub1_Sub3_4.method488(this.anInt252);
									}
								}
								this.aString5 = "";
								this.aBoolean49 = true;
							}
						}
					}
				} while ((local29 < 97 || local29 > 122) && (local29 < 65 || local29 > 90) && (local29 < 48 || local29 > 57) && local29 != 32);
				if (this.aString16.length() < 12) {
					this.aString16 = this.aString16 + (char) local29;
				}
			}
		} catch (@Pc(869) RuntimeException local869) {
			signlink.reporterror("96926, " + 8 + ", " + local869.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method196(@OriginalArg(0) int arg0) {
		try {
			Class9.aClass42_4.method643();
			Class9.aClass42_5.method643();
			Class13.aClass42_6.method643();
			@Pc(9) boolean local9 = false;
			Class15.aClass42_7.method643();
			Class15.aClass42_8.method643();
			Class1_Sub1_Sub1_Sub1_Sub2.aClass42_1.method643();
			Class32.aClass42_9.method643();
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("36910, " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!d;)Z")
	private boolean method197(@OriginalArg(1) Class6 arg0) {
		try {
			if (arg0.anIntArray98 == null) {
				return false;
			}
			for (@Pc(11) int local11 = 0; local11 < arg0.anIntArray98.length; local11++) {
				@Pc(19) int local19 = this.method143(arg0, local11);
				@Pc(24) int local24 = arg0.anIntArray99[local11];
				if (arg0.anIntArray98[local11] == 2) {
					if (local19 >= local24) {
						return false;
					}
				} else if (arg0.anIntArray98[local11] == 3) {
					if (local19 <= local24) {
						return false;
					}
				} else if (arg0.anIntArray98[local11] == 4) {
					if (local19 == local24) {
						return false;
					}
				} else if (local19 != local24) {
					return false;
				}
			}
			return true;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("83087, " + 11995 + ", " + arg0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILclient!bb;)V")
	private void method198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub1_Sub1_Sub1_Sub2 arg3) {
		try {
			if (arg3 != aClass1_Sub1_Sub1_Sub1_Sub2_1 && this.anInt407 < 400) {
				@Pc(32) String local32 = arg3.aString4 + method107(arg3.anInt178, aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt178) + " (level-" + arg3.anInt178 + ")";
				@Pc(145) int local145;
				if (this.anInt282 == 1) {
					this.aStringArray6[this.anInt407] = "Use " + this.aString9 + " with @whi@" + local32;
					this.anIntArray82[this.anInt407] = 275;
					this.anIntArray83[this.anInt407] = arg0;
					this.anIntArray80[this.anInt407] = arg2;
					this.anIntArray81[this.anInt407] = arg1;
					this.anInt407++;
				} else if (this.anInt270 != 1) {
					for (local145 = 4; local145 >= 0; local145--) {
						if (this.aStringArray5[local145] != null) {
							this.aStringArray6[this.anInt407] = this.aStringArray5[local145] + " @whi@" + local32;
							@Pc(172) short local172 = 0;
							if (this.aStringArray5[local145].equalsIgnoreCase("attack")) {
								if (arg3.anInt178 > aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt178) {
									local172 = 2000;
								}
							} else if (this.aBooleanArray4[local145]) {
								local172 = 2000;
							}
							if (local145 == 0) {
								this.anIntArray82[this.anInt407] = local172 + 639;
							}
							if (local145 == 1) {
								this.anIntArray82[this.anInt407] = local172 + 499;
							}
							if (local145 == 2) {
								this.anIntArray82[this.anInt407] = local172 + 27;
							}
							if (local145 == 3) {
								this.anIntArray82[this.anInt407] = local172 + 387;
							}
							if (local145 == 4) {
								this.anIntArray82[this.anInt407] = local172 + 185;
							}
							this.anIntArray83[this.anInt407] = arg0;
							this.anIntArray80[this.anInt407] = arg2;
							this.anIntArray81[this.anInt407] = arg1;
							this.anInt407++;
						}
					}
				} else if ((this.anInt272 & 0x8) == 8) {
					this.aStringArray6[this.anInt407] = this.aString8 + " @whi@" + local32;
					this.anIntArray82[this.anInt407] = 131;
					this.anIntArray83[this.anInt407] = arg0;
					this.anIntArray80[this.anInt407] = arg2;
					this.anIntArray81[this.anInt407] = arg1;
					this.anInt407++;
				}
				for (local145 = 0; local145 < this.anInt407; local145++) {
					if (this.anIntArray82[local145] == 718) {
						this.aStringArray6[local145] = "Walk here @whi@" + local32;
						break;
					}
				}
			}
		} catch (@Pc(313) RuntimeException local313) {
			signlink.reporterror("1028, " + arg0 + ", " + arg1 + ", " + -961 + ", " + arg2 + ", " + arg3 + ", " + local313.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IZLclient!mb;)V")
	private void method199(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt358; local1++) {
				@Pc(8) int local8 = this.anIntArray60[local1];
				@Pc(13) Class1_Sub1_Sub1_Sub1_Sub2 local13 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local8];
				@Pc(16) int local16 = arg1.method498();
				if ((local16 & 0x80) == 128) {
					local16 += arg1.method498() << 8;
				}
				this.method165(this.anInt346, local8, local16, local13, arg1);
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("38574, " + arg0 + ", " + true + ", " + arg1 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method200() {
		try {
			for (@Pc(11) Class1_Sub2 local11 = (Class1_Sub2) this.aClass31_2.method523(); local11 != null; local11 = (Class1_Sub2) this.aClass31_2.method525()) {
				if (local11.anInt832 == -1) {
					local11.anInt831 = 0;
					this.method113(local11);
				} else {
					local11.method669();
				}
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("38948, " + false + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method201() {
		try {
			@Pc(4) Graphics local4 = this.method95().getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			this.method88();
			@Pc(44) byte local44;
			@Pc(50) int local50;
			if (this.aBoolean88) {
				this.aBoolean47 = false;
				local4.setFont(new Font("Helvetica", 1, 16));
				local4.setColor(Color.yellow);
				local44 = 35;
				local4.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
				local50 = local44 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				@Pc(59) int local59 = local50 + 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				@Pc(76) int local76 = local59 + 30;
				local4.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
				@Pc(82) int local82 = local76 + 30;
				local4.drawString("3: Try using a different game-world", 30, 195);
				@Pc(88) int local88 = local82 + 30;
				local4.drawString("4: Try rebooting your computer", 30, 225);
				@Pc(94) int local94 = local88 + 30;
				local4.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
			}
			if (this.aBoolean84) {
				this.aBoolean47 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean63) {
				this.aBoolean47 = false;
				local4.setColor(Color.yellow);
				local44 = 35;
				local4.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
				local50 = local44 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				local50 += 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				local50 += 30;
				local4.drawString("2: Try rebooting your computer, and reloading", 30, 165);
				local50 += 30;
			}
		} catch (@Pc(182) RuntimeException local182) {
			signlink.reporterror("23771, " + -40 + ", " + local182.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZZ)V")
	private void method202(@OriginalArg(1) boolean arg0) {
		try {
			if (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 >> 7 == this.anInt452 && aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 >> 7 == this.anInt453) {
				this.anInt452 = 0;
				anInt393++;
				if (anInt393 > 122) {
					anInt393 = 0;
					this.aClass1_Sub1_Sub3_4.method487(36);
					this.aClass1_Sub1_Sub3_4.method488(62);
				}
			}
			@Pc(39) int local39 = this.anInt357;
			if (arg0) {
				local39 = 1;
			}
			for (@Pc(54) int local54 = 0; local54 < local39; local54++) {
				@Pc(60) Class1_Sub1_Sub1_Sub1_Sub2 local60;
				@Pc(65) int local65;
				if (arg0) {
					local60 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
					local65 = this.anInt356 << 14;
				} else {
					local60 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray59[local54]];
					local65 = this.anIntArray59[local54] << 14;
				}
				if (local60 != null && local60.method49(509)) {
					local60.aBoolean32 = false;
					if ((aBoolean56 && this.anInt357 > 50 || this.anInt357 > 200) && !arg0 && local60.anInt148 == local60.anInt132) {
						local60.aBoolean32 = true;
					}
					@Pc(116) int local116 = local60.anInt128 >> 7;
					@Pc(121) int local121 = local60.anInt129 >> 7;
					if (local116 >= 0 && local116 < 104 && local121 >= 0 && local121 < 104) {
						if (local60.aClass1_Sub1_Sub1_Sub5_1 == null || anInt440 < local60.anInt180 || anInt440 >= local60.anInt181) {
							if ((local60.anInt128 & 0x7F) == 64 && (local60.anInt129 & 0x7F) == 64) {
								if (this.anIntArrayArray5[local116][local121] == this.anInt431) {
									continue;
								}
								this.anIntArrayArray5[local116][local121] = this.anInt431;
							}
							local60.anInt179 = this.method209(this.aBoolean76, local60.anInt128, local60.anInt129, this.anInt432);
							this.aClass39_1.method555(local65, local60.anInt128, local60.anInt179, local60, local60.anInt129, this.anInt432, 60, local60.aBoolean29, local60.anInt130);
						} else {
							local60.aBoolean32 = false;
							local60.anInt179 = this.method209(this.aBoolean76, local60.anInt128, local60.anInt129, this.anInt432);
							this.aClass39_1.method556(local60.anInt129, this.anInt448, local60.anInt130, local65, local60.anInt187, local60.anInt188, this.anInt432, local60.anInt185, local60.anInt186, local60, local60.anInt179, local60.anInt128);
						}
					}
				}
			}
		} catch (@Pc(253) RuntimeException local253) {
			signlink.reporterror("5966, " + false + ", " + arg0 + ", " + local253.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIB)Z")
	private boolean method203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(7) Class6 local7 = Class6.aClass6Array1[arg0];
			for (@Pc(9) int local9 = 0; local9 < local7.anIntArray100.length && local7.anIntArray100[local9] != -1; local9++) {
				@Pc(24) Class6 local24 = Class6.aClass6Array1[local7.anIntArray100[local9]];
				if (local24.anInt459 == 1) {
					local3 |= this.method203(local24.anInt457, arg1);
				}
				if (local24.anInt459 == 6 && (local24.anInt480 != -1 || local24.anInt481 != -1)) {
					@Pc(54) boolean local54 = this.method197(local24);
					@Pc(59) int local59;
					if (local54) {
						local59 = local24.anInt481;
					} else {
						local59 = local24.anInt480;
					}
					if (local59 != -1) {
						@Pc(71) Class27 local71 = Class27.aClass27Array1[local59];
						local24.anInt456 += arg1;
						while (local24.anInt456 > local71.method517(local24.anInt455, (byte) 2)) {
							local24.anInt456 -= local71.method517(local24.anInt455, (byte) 2) + 1;
							local24.anInt455++;
							if (local24.anInt455 >= local71.anInt808) {
								local24.anInt455 -= local71.anInt809;
								if (local24.anInt455 < 0 || local24.anInt455 >= local71.anInt808) {
									local24.anInt455 = 0;
								}
							}
							local3 = true;
						}
					}
				}
			}
			return local3;
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("47839, " + arg0 + ", " + arg1 + ", " + -21 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method204() {
		try {
			for (@Pc(6) Class1_Sub1_Sub1_Sub6 local6 = (Class1_Sub1_Sub1_Sub6) this.aClass31_1.method523(); local6 != null; local6 = (Class1_Sub1_Sub1_Sub6) this.aClass31_1.method525()) {
				if (local6.anInt573 != this.anInt432 || local6.aBoolean148) {
					local6.method669();
				} else if (anInt440 >= local6.anInt572) {
					local6.method317(this.anInt266);
					if (local6.aBoolean148) {
						local6.method669();
					} else {
						this.aClass39_1.method555(-1, local6.anInt574, local6.anInt576, local6, local6.anInt575, local6.anInt573, 60, false, 0);
					}
				}
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("32960, " + 6 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!mb;II)V")
	private void method205(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(16) int local16 = arg0.method509(8);
			@Pc(22) int local22;
			if (local16 < this.anInt357) {
				for (local22 = local16; local22 < this.anInt357; local22++) {
					this.anIntArray47[this.anInt294++] = this.anIntArray59[local22];
				}
			}
			if (local16 > this.anInt357) {
				signlink.reporterror(this.aString14 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt357 = 0;
			for (local22 = 0; local22 < local16; local22++) {
				@Pc(74) int local74 = this.anIntArray59[local22];
				@Pc(79) Class1_Sub1_Sub1_Sub1_Sub2 local79 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local74];
				@Pc(84) int local84 = arg0.method509(1);
				if (local84 == 0) {
					this.anIntArray59[this.anInt357++] = local74;
					local79.anInt168 = anInt440;
				} else {
					@Pc(107) int local107 = arg0.method509(2);
					if (local107 == 0) {
						this.anIntArray59[this.anInt357++] = local74;
						local79.anInt168 = anInt440;
						this.anIntArray60[this.anInt358++] = local74;
					} else {
						@Pc(158) int local158;
						@Pc(169) int local169;
						if (local107 == 1) {
							this.anIntArray59[this.anInt357++] = local74;
							local79.anInt168 = anInt440;
							local158 = arg0.method509(3);
							local79.method47(this.anInt442, local158, false);
							local169 = arg0.method509(1);
							if (local169 == 1) {
								this.anIntArray60[this.anInt358++] = local74;
							}
						} else if (local107 == 2) {
							this.anIntArray59[this.anInt357++] = local74;
							local79.anInt168 = anInt440;
							local158 = arg0.method509(3);
							local79.method47(this.anInt442, local158, true);
							local169 = arg0.method509(3);
							local79.method47(this.anInt442, local169, true);
							@Pc(229) int local229 = arg0.method509(1);
							if (local229 == 1) {
								this.anIntArray60[this.anInt358++] = local74;
							}
						} else if (local107 == 3) {
							this.anIntArray47[this.anInt294++] = local74;
						}
					}
				}
			}
		} catch (@Pc(266) RuntimeException local266) {
			signlink.reporterror("96810, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local266.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
	private void method206() {
		try {
			this.aBoolean47 = false;
			while (this.aBoolean58) {
				this.aBoolean47 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass1_Sub1_Sub2_Sub3_19 = null;
			this.aClass1_Sub1_Sub2_Sub3_20 = null;
			this.aClass1_Sub1_Sub2_Sub3Array1 = null;
			this.anIntArray65 = null;
			this.anIntArray66 = null;
			this.anIntArray67 = null;
			this.anInt338 += 0;
			this.anIntArray68 = null;
			this.anIntArray88 = null;
			this.anIntArray89 = null;
			this.anIntArray54 = null;
			this.anIntArray55 = null;
			this.aClass1_Sub1_Sub2_Sub2_3 = null;
			this.aClass1_Sub1_Sub2_Sub2_4 = null;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("6295, " + 0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B[BZ)V")
	private void method207(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2) {
		try {
			if (arg0 == 2) {
				@Pc(4) boolean local4 = false;
			} else {
				this.anInt339 = -1;
			}
			signlink.anInt928 = arg2 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("44323, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
	private void method208() {
		try {
			if (this.anInt282 == 0 && this.anInt270 == 0) {
				this.aStringArray6[this.anInt407] = "Walk here";
				this.anIntArray82[this.anInt407] = 718;
				this.anIntArray80[this.anInt407] = super.anInt232;
				this.anIntArray81[this.anInt407] = super.anInt233;
				this.anInt407++;
			}
			@Pc(45) int local45 = -1;
			for (@Pc(47) int local47 = 0; local47 < Class1_Sub1_Sub1_Sub5.anInt566; local47++) {
				@Pc(53) int local53 = Class1_Sub1_Sub1_Sub5.anIntArray157[local47];
				@Pc(57) int local57 = local53 & 0x7F;
				@Pc(63) int local63 = local53 >> 7 & 0x7F;
				@Pc(69) int local69 = local53 >> 29 & 0x3;
				@Pc(75) int local75 = local53 >> 14 & 0x7FFF;
				if (local53 != local45) {
					local45 = local53;
					@Pc(213) int local213;
					if (local69 == 2 && this.aClass39_1.method574(this.anInt432, local57, local63, local53) >= 0) {
						@Pc(95) Class9 local95 = Class9.method258(local75);
						if (this.anInt282 == 1) {
							this.aStringArray6[this.anInt407] = "Use " + this.aString9 + " with @cya@" + local95.aString24;
							this.anIntArray82[this.anInt407] = 810;
							this.anIntArray83[this.anInt407] = local53;
							this.anIntArray80[this.anInt407] = local57;
							this.anIntArray81[this.anInt407] = local63;
							this.anInt407++;
						} else if (this.anInt270 != 1) {
							if (local95.aStringArray8 != null) {
								for (local213 = 4; local213 >= 0; local213--) {
									if (local95.aStringArray8[local213] != null) {
										this.aStringArray6[this.anInt407] = local95.aStringArray8[local213] + " @cya@" + local95.aString24;
										if (local213 == 0) {
											this.anIntArray82[this.anInt407] = 625;
										}
										if (local213 == 1) {
											this.anIntArray82[this.anInt407] = 721;
										}
										if (local213 == 2) {
											this.anIntArray82[this.anInt407] = 743;
										}
										if (local213 == 3) {
											this.anIntArray82[this.anInt407] = 357;
										}
										if (local213 == 4) {
											this.anIntArray82[this.anInt407] = 1071;
										}
										this.anIntArray83[this.anInt407] = local53;
										this.anIntArray80[this.anInt407] = local57;
										this.anIntArray81[this.anInt407] = local63;
										this.anInt407++;
									}
								}
							}
							this.aStringArray6[this.anInt407] = "Examine @cya@" + local95.aString24;
							this.anIntArray82[this.anInt407] = 1381;
							this.anIntArray83[this.anInt407] = local53;
							this.anIntArray80[this.anInt407] = local57;
							this.anIntArray81[this.anInt407] = local63;
							this.anInt407++;
						} else if ((this.anInt272 & 0x4) == 4) {
							this.aStringArray6[this.anInt407] = this.aString8 + " @cya@" + local95.aString24;
							this.anIntArray82[this.anInt407] = 899;
							this.anIntArray83[this.anInt407] = local53;
							this.anIntArray80[this.anInt407] = local57;
							this.anIntArray81[this.anInt407] = local63;
							this.anInt407++;
						}
					}
					@Pc(390) Class1_Sub1_Sub1_Sub1_Sub1 local390;
					if (local69 == 1) {
						@Pc(361) Class1_Sub1_Sub1_Sub1_Sub1 local361 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local75];
						if (local361.aClass13_1.aByte23 == 1 && (local361.anInt128 & 0x7F) == 64 && (local361.anInt129 & 0x7F) == 64) {
							for (local213 = 0; local213 < this.anInt352; local213++) {
								local390 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray57[local213]];
								if (local390 != null && local390 != local361 && local390.aClass13_1.aByte23 == 1 && local390.anInt128 == local361.anInt128 && local390.anInt129 == local361.anInt129) {
									this.method98(local57, local390.aClass13_1, local63, this.anIntArray57[local213]);
								}
							}
						}
						this.method98(local57, local361.aClass13_1, local63, local75);
					}
					if (local69 == 0) {
						@Pc(441) Class1_Sub1_Sub1_Sub1_Sub2 local441 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local75];
						if ((local441.anInt128 & 0x7F) == 64 && (local441.anInt129 & 0x7F) == 64) {
							for (local213 = 0; local213 < this.anInt352; local213++) {
								local390 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray57[local213]];
								if (local390 != null && local390.aClass13_1.aByte23 == 1 && local390.anInt128 == local441.anInt128 && local390.anInt129 == local441.anInt129) {
									this.method98(local57, local390.aClass13_1, local63, this.anIntArray57[local213]);
								}
							}
							for (@Pc(500) int local500 = 0; local500 < this.anInt357; local500++) {
								@Pc(510) Class1_Sub1_Sub1_Sub1_Sub2 local510 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray59[local500]];
								if (local510 != null && local510 != local441 && local510.anInt128 == local441.anInt128 && local510.anInt129 == local441.anInt129) {
									this.method198(this.anIntArray59[local500], local63, local57, local510);
								}
							}
						}
						this.method198(local75, local63, local57, local441);
					}
					if (local69 == 3) {
						@Pc(560) Class31 local560 = this.aClass31ArrayArrayArray1[this.anInt432][local57][local63];
						if (local560 != null) {
							for (@Pc(567) Class1_Sub1_Sub1_Sub3 local567 = (Class1_Sub1_Sub1_Sub3) local560.method524(); local567 != null; local567 = (Class1_Sub1_Sub1_Sub3) local560.method526()) {
								@Pc(573) Class15 local573 = Class15.method345(local567.anInt488);
								if (this.anInt282 == 1) {
									this.aStringArray6[this.anInt407] = "Use " + this.aString9 + " with @lre@" + local573.aString26;
									this.anIntArray82[this.anInt407] = 111;
									this.anIntArray83[this.anInt407] = local567.anInt488;
									this.anIntArray80[this.anInt407] = local57;
									this.anIntArray81[this.anInt407] = local63;
									this.anInt407++;
								} else if (this.anInt270 != 1) {
									for (@Pc(690) int local690 = 4; local690 >= 0; local690--) {
										if (local573.aStringArray10 != null && local573.aStringArray10[local690] != null) {
											this.aStringArray6[this.anInt407] = local573.aStringArray10[local690] + " @lre@" + local573.aString26;
											if (local690 == 0) {
												this.anIntArray82[this.anInt407] = 139;
											}
											if (local690 == 1) {
												this.anIntArray82[this.anInt407] = 778;
											}
											if (local690 == 2) {
												this.anIntArray82[this.anInt407] = 617;
											}
											if (local690 == 3) {
												this.anIntArray82[this.anInt407] = 224;
											}
											if (local690 == 4) {
												this.anIntArray82[this.anInt407] = 662;
											}
											this.anIntArray83[this.anInt407] = local567.anInt488;
											this.anIntArray80[this.anInt407] = local57;
											this.anIntArray81[this.anInt407] = local63;
											this.anInt407++;
										} else if (local690 == 2) {
											this.aStringArray6[this.anInt407] = "Take @lre@" + local573.aString26;
											this.anIntArray82[this.anInt407] = 617;
											this.anIntArray83[this.anInt407] = local567.anInt488;
											this.anIntArray80[this.anInt407] = local57;
											this.anIntArray81[this.anInt407] = local63;
											this.anInt407++;
										}
									}
									this.aStringArray6[this.anInt407] = "Examine @lre@" + local573.aString26;
									this.anIntArray82[this.anInt407] = 1152;
									this.anIntArray83[this.anInt407] = local567.anInt488;
									this.anIntArray80[this.anInt407] = local57;
									this.anIntArray81[this.anInt407] = local63;
									this.anInt407++;
								} else if ((this.anInt272 & 0x1) == 1) {
									this.aStringArray6[this.anInt407] = this.aString8 + " @lre@" + local573.aString26;
									this.anIntArray82[this.anInt407] = 370;
									this.anIntArray83[this.anInt407] = local567.anInt488;
									this.anIntArray80[this.anInt407] = local57;
									this.anIntArray81[this.anInt407] = local63;
									this.anInt407++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(897) RuntimeException local897) {
			signlink.reporterror("15339, " + 0 + ", " + local897.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method94() {
		try {
			this.aBoolean68 = true;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("4873, " + -114 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIII)I")
	private int method209(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) int local3 = arg1 >> 7;
			@Pc(7) int local7 = arg2 >> 7;
			if (local3 < 0 || local7 < 0 || local3 > 103 || local7 > 103) {
				return 0;
			}
			@Pc(21) int local21 = arg3;
			if (arg3 < 3 && (this.aByteArrayArrayArray7[1][local3][local7] & 0x2) == 2) {
				local21 = arg3 + 1;
			}
			@Pc(41) int local41 = arg1 & 0x7F;
			@Pc(45) int local45 = arg2 & 0x7F;
			if (arg0) {
				return 3;
			} else {
				@Pc(77) int local77 = this.anIntArrayArrayArray3[local21][local3][local7] * (128 - local41) + this.anIntArrayArrayArray3[local21][local3 + 1][local7] * local41 >> 7;
				@Pc(109) int local109 = this.anIntArrayArrayArray3[local21][local3][local7 + 1] * (128 - local41) + this.anIntArrayArrayArray3[local21][local3 + 1][local7 + 1] * local41 >> 7;
				return local77 * (128 - local45) + local109 * local45 >> 7;
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("77420, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIILclient!d;I)V")
	private void method210(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6 arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2.anInt459 == 0 && arg2.anIntArray100 != null && (!arg2.aBoolean94 || this.anInt288 == arg2.anInt457 || this.anInt359 == arg2.anInt457 || this.anInt328 == arg2.anInt457)) {
				@Pc(29) int local29 = Class1_Sub1_Sub2.anInt744;
				@Pc(31) int local31 = Class1_Sub1_Sub2.anInt742;
				@Pc(33) int local33 = Class1_Sub1_Sub2.anInt745;
				@Pc(35) int local35 = Class1_Sub1_Sub2.anInt743;
				Class1_Sub1_Sub2.method455(arg1, arg0, arg1 + arg2.anInt463, arg0 + arg2.anInt462);
				@Pc(56) int local56 = arg2.anIntArray100.length;
				for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
					@Pc(67) int local67 = arg2.anIntArray101[local58] + arg0;
					@Pc(76) int local76 = arg2.anIntArray102[local58] + arg1 - arg3;
					@Pc(83) Class6 local83 = Class6.aClass6Array1[arg2.anIntArray100[local58]];
					@Pc(88) int local88 = local67 + local83.anInt464;
					@Pc(93) int local93 = local76 + local83.anInt465;
					if (local83.anInt461 > 0) {
						this.method169(local83);
					}
					if (local83.anInt459 == 0) {
						if (local83.anInt468 > local83.anInt467 - local83.anInt463) {
							local83.anInt468 = local83.anInt467 - local83.anInt463;
						}
						if (local83.anInt468 < 0) {
							local83.anInt468 = 0;
						}
						this.method210(local88, local93, local83, local83.anInt468);
						if (local83.anInt467 > local83.anInt463) {
							this.method175(local83.anInt468, local93, local83.anInt463, local83.anInt467, local88 + local83.anInt462);
						}
					} else if (local83.anInt459 != 1) {
						@Pc(165) int local165;
						@Pc(169) int local169;
						@Pc(180) int local180;
						@Pc(215) int local215;
						@Pc(222) int local222;
						@Pc(163) int local163;
						@Pc(213) int local213;
						if (local83.anInt459 == 2) {
							local163 = 0;
							for (local165 = 0; local165 < local83.anInt463; local165++) {
								for (local169 = 0; local169 < local83.anInt462; local169++) {
									local180 = local88 + local169 * (local83.anInt470 + 32);
									@Pc(189) int local189 = local93 + local165 * (local83.anInt471 + 32);
									if (local163 < 20) {
										local180 += local83.anIntArray103[local163];
										local189 += local83.anIntArray104[local163];
									}
									if (local83.anIntArray96[local163] > 0) {
										local213 = 0;
										local215 = 0;
										local222 = local83.anIntArray96[local163] - 1;
										if (local180 > Class1_Sub1_Sub2.anInt744 - 32 && local180 < Class1_Sub1_Sub2.anInt745 && local189 > Class1_Sub1_Sub2.anInt742 - 32 && local189 < Class1_Sub1_Sub2.anInt743 || this.anInt403 != 0 && this.anInt402 == local163) {
											@Pc(247) int local247 = 0;
											if (this.anInt282 == 1 && this.anInt283 == local163 && this.anInt284 == local83.anInt457) {
												local247 = 16777215;
											}
											@Pc(271) Class1_Sub1_Sub2_Sub2 local271 = Class15.method351(local83.anIntArray97[local163], local222, local247);
											if (local271 != null) {
												@Pc(350) int local350;
												if (this.anInt403 != 0 && this.anInt402 == local163 && this.anInt401 == local83.anInt457) {
													local213 = super.anInt232 - this.anInt404;
													local215 = super.anInt233 - this.anInt405;
													if (local213 < 5 && local213 > -5) {
														local213 = 0;
													}
													if (local215 < 5 && local215 > -5) {
														local215 = 0;
													}
													if (this.anInt380 < 5) {
														local213 = 0;
														local215 = 0;
													}
													local271.method408(local180 + local213, local189 + local215);
													if (local189 + local215 < Class1_Sub1_Sub2.anInt742 && arg2.anInt468 > 0) {
														local350 = this.anInt266 * (Class1_Sub1_Sub2.anInt742 - local189 - local215) / 3;
														if (local350 > this.anInt266 * 10) {
															local350 = this.anInt266 * 10;
														}
														if (local350 > arg2.anInt468) {
															local350 = arg2.anInt468;
														}
														arg2.anInt468 -= local350;
														this.anInt405 += local350;
													}
													if (local189 + local215 + 32 > Class1_Sub1_Sub2.anInt743 && arg2.anInt468 < arg2.anInt467 - arg2.anInt463) {
														local350 = this.anInt266 * (local189 + local215 + 32 - Class1_Sub1_Sub2.anInt743) / 3;
														if (local350 > this.anInt266 * 10) {
															local350 = this.anInt266 * 10;
														}
														if (local350 > arg2.anInt467 - arg2.anInt463 - arg2.anInt468) {
															local350 = arg2.anInt467 - arg2.anInt463 - arg2.anInt468;
														}
														arg2.anInt468 += local350;
														this.anInt405 -= local350;
													}
												} else if (this.anInt373 != 0 && this.anInt372 == local163 && this.anInt371 == local83.anInt457) {
													local271.method408(local180, local189);
												} else {
													local271.method406(local180, local189);
												}
												if (local271.anInt690 == 33 || local83.anIntArray97[local163] != 1) {
													local350 = local83.anIntArray97[local163];
													this.aClass1_Sub1_Sub2_Sub4_1.method468(local189 + local215 + 10, 0, method146(local350), local180 + local213 + 1);
													this.aClass1_Sub1_Sub2_Sub4_1.method468(local189 + local215 + 9, 16776960, method146(local350), local180 + local213);
												}
											}
										}
									} else if (local83.aClass1_Sub1_Sub2_Sub2Array8 != null && local163 < 20) {
										@Pc(539) Class1_Sub1_Sub2_Sub2 local539 = local83.aClass1_Sub1_Sub2_Sub2Array8[local163];
										if (local539 != null) {
											local539.method406(local180, local189);
										}
									}
									local163++;
								}
							}
						} else if (local83.anInt459 == 3) {
							@Pc(565) boolean local565 = false;
							if (this.anInt328 == local83.anInt457 || this.anInt359 == local83.anInt457 || this.anInt288 == local83.anInt457) {
								local565 = true;
							}
							if (this.method197(local83)) {
								local163 = local83.anInt473;
								if (local565 && local83.anInt475 != 0) {
									local163 = local83.anInt475;
								}
							} else {
								local163 = local83.anInt472;
								if (local565 && local83.anInt474 != 0) {
									local163 = local83.anInt474;
								}
							}
							if (local83.aByte15 == 0) {
								if (local83.aBoolean100) {
									Class1_Sub1_Sub2.method458(local163, local83.anInt462, local93, local83.anInt463, local88);
								} else {
									Class1_Sub1_Sub2.method459(local83.anInt463, local93, local88, local83.anInt462, this.anInt367, local163);
								}
							} else if (local83.aBoolean100) {
								Class1_Sub1_Sub2.method457(256 - (local83.aByte15 & 0xFF), local88, local83.anInt463, local93, local163, local83.anInt462);
							} else {
								Class1_Sub1_Sub2.method460(local88, local83.anInt463, local163, local93, 256 - (local83.aByte15 & 0xFF), local83.anInt462);
							}
						} else {
							@Pc(684) Class1_Sub1_Sub2_Sub4 local684;
							if (local83.anInt459 == 4) {
								local684 = local83.aClass1_Sub1_Sub2_Sub4_5;
								@Pc(687) String local687 = local83.aString19;
								@Pc(689) boolean local689 = false;
								if (this.anInt328 == local83.anInt457 || this.anInt359 == local83.anInt457 || this.anInt288 == local83.anInt457) {
									local689 = true;
								}
								if (this.method197(local83)) {
									local165 = local83.anInt473;
									if (local689 && local83.anInt475 != 0) {
										local165 = local83.anInt475;
									}
									if (local83.aString20.length() > 0) {
										local687 = local83.aString20;
									}
								} else {
									local165 = local83.anInt472;
									if (local689 && local83.anInt474 != 0) {
										local165 = local83.anInt474;
									}
								}
								if (local83.anInt460 == 6 && this.aBoolean50) {
									local687 = "Please wait...";
									local165 = local83.anInt472;
								}
								if (Class1_Sub1_Sub2.anInt740 == 479) {
									if (local165 == 16776960) {
										local165 = 255;
									}
									if (local165 == 49152) {
										local165 = 16777215;
									}
								}
								local213 = local93 + local684.anInt752;
								while (local687.length() > 0) {
									if (local687.indexOf("%") != -1) {
										label348: while (true) {
											local215 = local687.indexOf("%1");
											if (local215 == -1) {
												while (true) {
													local215 = local687.indexOf("%2");
													if (local215 == -1) {
														while (true) {
															local215 = local687.indexOf("%3");
															if (local215 == -1) {
																while (true) {
																	local215 = local687.indexOf("%4");
																	if (local215 == -1) {
																		while (true) {
																			local215 = local687.indexOf("%5");
																			if (local215 == -1) {
																				break label348;
																			}
																			local687 = local687.substring(0, local215) + this.method119(this.method143(local83, 4)) + local687.substring(local215 + 2);
																		}
																	}
																	local687 = local687.substring(0, local215) + this.method119(this.method143(local83, 3)) + local687.substring(local215 + 2);
																}
															}
															local687 = local687.substring(0, local215) + this.method119(this.method143(local83, 2)) + local687.substring(local215 + 2);
														}
													}
													local687 = local687.substring(0, local215) + this.method119(this.method143(local83, 1)) + local687.substring(local215 + 2);
												}
											}
											local687 = local687.substring(0, local215) + this.method119(this.method143(local83, 0)) + local687.substring(local215 + 2);
										}
									}
									local215 = local687.indexOf("\\n");
									@Pc(961) String local961;
									if (local215 == -1) {
										local961 = local687;
										local687 = "";
									} else {
										local961 = local687.substring(0, local215);
										local687 = local687.substring(local215 + 2);
									}
									if (local83.aBoolean101) {
										local684.method466(local961, local88 + local83.anInt462 / 2, local83.aBoolean102, local165, local213);
									} else {
										local684.method470(local165, local83.aBoolean102, local961, local213, local88);
									}
									local213 += local684.anInt752;
								}
							} else if (local83.anInt459 == 5) {
								@Pc(1023) Class1_Sub1_Sub2_Sub2 local1023;
								if (this.method197(local83)) {
									local1023 = local83.aClass1_Sub1_Sub2_Sub2_15;
								} else {
									local1023 = local83.aClass1_Sub1_Sub2_Sub2_14;
								}
								if (local1023 != null) {
									local1023.method406(local88, local93);
								}
							} else if (local83.anInt459 == 6) {
								local163 = Class1_Sub1_Sub2_Sub1.anInt663;
								local165 = Class1_Sub1_Sub2_Sub1.anInt664;
								Class1_Sub1_Sub2_Sub1.anInt663 = local88 + local83.anInt462 / 2;
								Class1_Sub1_Sub2_Sub1.anInt664 = local93 + local83.anInt463 / 2;
								local169 = Class1_Sub1_Sub2_Sub1.anIntArray183[local83.anInt483] * local83.anInt482 >> 16;
								local180 = Class1_Sub1_Sub2_Sub1.anIntArray184[local83.anInt483] * local83.anInt482 >> 16;
								@Pc(1084) boolean local1084 = this.method197(local83);
								if (local1084) {
									local213 = local83.anInt481;
								} else {
									local213 = local83.anInt480;
								}
								@Pc(1104) Class1_Sub1_Sub1_Sub5 local1104;
								if (local213 == -1) {
									local1104 = local83.method232(-1, local1084, -1);
								} else {
									@Pc(1110) Class27 local1110 = Class27.aClass27Array1[local213];
									local1104 = local83.method232(local1110.anIntArray227[local83.anInt455], local1084, local1110.anIntArray228[local83.anInt455]);
								}
								if (local1104 != null) {
									local1104.method308(local83.anInt484, 0, local83.anInt483, 0, local169, local180);
								}
								Class1_Sub1_Sub2_Sub1.anInt663 = local163;
								Class1_Sub1_Sub2_Sub1.anInt664 = local165;
							} else if (local83.anInt459 == 7) {
								local684 = local83.aClass1_Sub1_Sub2_Sub4_5;
								local165 = 0;
								for (local169 = 0; local169 < local83.anInt463; local169++) {
									for (local180 = 0; local180 < local83.anInt462; local180++) {
										if (local83.anIntArray96[local165] > 0) {
											@Pc(1174) Class15 local1174 = Class15.method345(local83.anIntArray96[local165] - 1);
											@Pc(1177) String local1177 = local1174.aString26;
											if (local1174.aBoolean163 || local83.anIntArray97[local165] != 1) {
												local1177 = local1177 + " x" + method184(local83.anIntArray97[local165]);
											}
											local215 = local88 + local180 * (local83.anInt470 + 115);
											local222 = local93 + local169 * (local83.anInt471 + 12);
											if (local83.aBoolean101) {
												local684.method466(local1177, local215 + local83.anInt462 / 2, local83.aBoolean102, local83.anInt472, local222);
											} else {
												local684.method470(local83.anInt472, local83.aBoolean102, local1177, local222, local215);
											}
										}
										local165++;
									}
								}
							}
						}
					}
				}
				Class1_Sub1_Sub2.method455(local31, local29, local35, local33);
			}
		} catch (@Pc(1273) RuntimeException local1273) {
			signlink.reporterror("75568, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local1273.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
	private void method211() {
		try {
			@Pc(8) int local8;
			if (this.anInt418 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt418 > 768) {
						this.anIntArray65[local8] = this.method155(this.anIntArray66[local8], 1024 - this.anInt418, this.anIntArray67[local8]);
					} else if (this.anInt418 > 256) {
						this.anIntArray65[local8] = this.anIntArray67[local8];
					} else {
						this.anIntArray65[local8] = this.method155(this.anIntArray67[local8], 256 - this.anInt418, this.anIntArray66[local8]);
					}
				}
			} else if (this.anInt419 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt419 > 768) {
						this.anIntArray65[local8] = this.method155(this.anIntArray66[local8], 1024 - this.anInt419, this.anIntArray68[local8]);
					} else if (this.anInt419 > 256) {
						this.anIntArray65[local8] = this.anIntArray68[local8];
					} else {
						this.anIntArray65[local8] = this.method155(this.anIntArray68[local8], 256 - this.anInt419, this.anIntArray66[local8]);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray65[local8] = this.anIntArray66[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass37_22.anIntArray233[local8] = this.aClass1_Sub1_Sub2_Sub2_3.anIntArray210[local8];
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
				local198 = this.anIntArray75[local185] * (256 - local185) / 256;
				local202 = local198 + 22;
				if (local202 < 0) {
					local202 = 0;
				}
				local181 += local202;
				for (local212 = local202; local212 < 128; local212++) {
					local220 = this.anIntArray54[local181++];
					if (local220 == 0) {
						local183++;
					} else {
						local224 = local220;
						local228 = 256 - local220;
						local220 = this.anIntArray65[local220];
						local239 = this.aClass37_22.anIntArray233[local183];
						this.aClass37_22.anIntArray233[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			this.aClass37_22.method539(super.aGraphics2, 0, 0);
			for (local198 = 0; local198 < 33920; local198++) {
				this.aClass37_23.anIntArray233[local198] = this.aClass1_Sub1_Sub2_Sub2_4.anIntArray210[local198];
			}
			local181 = 0;
			local183 = 1176;
			for (local202 = 1; local202 < 255; local202++) {
				local212 = this.anIntArray75[local202] * (256 - local202) / 256;
				local220 = 103 - local212;
				local183 += local212;
				for (local224 = 0; local224 < local220; local224++) {
					local228 = this.anIntArray54[local181++];
					if (local228 == 0) {
						local183++;
					} else {
						local239 = local228;
						@Pc(369) int local369 = 256 - local228;
						local228 = this.anIntArray65[local228];
						@Pc(380) int local380 = this.aClass37_23.anIntArray233[local183];
						this.aClass37_23.anIntArray233[local183++] = ((local228 & 0xFF00FF) * local239 + (local380 & 0xFF00FF) * local369 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local380 & 0xFF00) * local369 & 0xFF0000) >> 8;
					}
				}
				local181 += 128 - local220;
				local183 += 128 - local220 - local212;
			}
			this.aClass37_23.method539(super.aGraphics2, 0, 637);
		} catch (@Pc(452) RuntimeException local452) {
			signlink.reporterror("3033, " + -593 + ", " + local452.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method212(@OriginalArg(0) boolean arg0) {
		try {
			this.aBoolean74 &= arg0;
			for (@Pc(7) int local7 = 0; local7 < this.anInt352; local7++) {
				@Pc(14) int local14 = this.anIntArray57[local7];
				@Pc(19) Class1_Sub1_Sub1_Sub1_Sub1 local19 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local14];
				if (local19 != null) {
					this.method213(local19, local19.aClass13_1.aByte23);
				}
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("28089, " + arg0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!z;II)V")
	private void method213(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		try {
			if (arg0.anInt128 < 128 || arg0.anInt129 < 128 || arg0.anInt128 >= 13184 || arg0.anInt129 >= 13184) {
				arg0.anInt151 = -1;
				arg0.anInt156 = -1;
				arg0.anInt165 = 0;
				arg0.anInt166 = 0;
				arg0.anInt128 = arg0.anIntArray16[0] * 128 + arg0.anInt131 * 64;
				arg0.anInt129 = arg0.anIntArray17[0] * 128 + arg0.anInt131 * 64;
				arg0.method48();
			}
			if (arg0 == aClass1_Sub1_Sub1_Sub1_Sub2_1 && (arg0.anInt128 < 1536 || arg0.anInt129 < 1536 || arg0.anInt128 >= 11776 || arg0.anInt129 >= 11776)) {
				arg0.anInt151 = -1;
				arg0.anInt156 = -1;
				arg0.anInt165 = 0;
				arg0.anInt166 = 0;
				arg0.anInt128 = arg0.anIntArray16[0] * 128 + arg0.anInt131 * 64;
				arg0.anInt129 = arg0.anIntArray17[0] * 128 + arg0.anInt131 * 64;
				arg0.method48();
			}
			if (arg0.anInt165 > anInt440) {
				this.method214(arg0);
			} else if (arg0.anInt166 >= anInt440) {
				this.method215(arg0);
			} else {
				this.method216(arg0);
			}
			this.method217(arg0);
			this.method218(arg0);
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("94911, " + arg0 + ", " + -101 + ", " + arg1 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!z;)V")
	private void method214(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt165 - anInt440;
			@Pc(14) int local14 = arg0.anInt161 * 128 + arg0.anInt131 * 64;
			@Pc(24) int local24 = arg0.anInt163 * 128 + arg0.anInt131 * 64;
			arg0.anInt128 += (local14 - arg0.anInt128) / local4;
			arg0.anInt129 += (local24 - arg0.anInt129) / local4;
			arg0.anInt173 = 0;
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
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("80839, " + -638 + ", " + arg0 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!z;I)V")
	private void method215(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt166 == anInt440 || arg0.anInt151 == -1 || arg0.anInt154 != 0 || arg0.anInt153 + 1 > Class27.aClass27Array1[arg0.anInt151].method517(arg0.anInt152, (byte) 2)) {
				@Pc(29) int local29 = arg0.anInt166 - arg0.anInt165;
				@Pc(34) int local34 = anInt440 - arg0.anInt165;
				@Pc(44) int local44 = arg0.anInt161 * 128 + arg0.anInt131 * 64;
				@Pc(54) int local54 = arg0.anInt163 * 128 + arg0.anInt131 * 64;
				@Pc(64) int local64 = arg0.anInt162 * 128 + arg0.anInt131 * 64;
				@Pc(74) int local74 = arg0.anInt164 * 128 + arg0.anInt131 * 64;
				arg0.anInt128 = (local44 * (local29 - local34) + local64 * local34) / local29;
				arg0.anInt129 = (local54 * (local29 - local34) + local74 * local34) / local29;
			}
			arg0.anInt173 = 0;
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
			signlink.reporterror("91363, " + arg0 + ", " + 44471 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!z;I)V")
	private void method216(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.anInt148 = arg0.anInt132;
			if (arg0.anInt172 == 0) {
				arg0.anInt173 = 0;
			} else {
				if (arg0.anInt151 != -1 && arg0.anInt154 == 0) {
					@Pc(31) Class27 local31 = Class27.aClass27Array1[arg0.anInt151];
					if (arg0.anInt174 > 0 && local31.anInt814 == 0) {
						arg0.anInt173++;
						return;
					}
					if (arg0.anInt174 <= 0 && local31.anInt815 == 0) {
						arg0.anInt173++;
						return;
					}
				}
				@Pc(60) int local60 = arg0.anInt128;
				@Pc(63) int local63 = arg0.anInt129;
				@Pc(78) int local78 = arg0.anIntArray16[arg0.anInt172 - 1] * 128 + arg0.anInt131 * 64;
				@Pc(93) int local93 = arg0.anIntArray17[arg0.anInt172 - 1] * 128 + arg0.anInt131 * 64;
				if (local78 - local60 <= 256 && local78 - local60 >= -256 && local93 - local63 <= 256 && local93 - local63 >= -256) {
					if (local60 < local78) {
						if (local63 < local93) {
							arg0.anInt170 = 1280;
						} else if (local63 > local93) {
							arg0.anInt170 = 1792;
						} else {
							arg0.anInt170 = 1536;
						}
					} else if (local60 > local78) {
						if (local63 < local93) {
							arg0.anInt170 = 768;
						} else if (local63 > local93) {
							arg0.anInt170 = 256;
						} else {
							arg0.anInt170 = 512;
						}
					} else if (local63 < local93) {
						arg0.anInt170 = 1024;
					} else {
						arg0.anInt170 = 0;
					}
					@Pc(187) int local187 = arg0.anInt170 - arg0.anInt130 & 0x7FF;
					if (local187 > 1024) {
						local187 -= 2048;
					}
					@Pc(194) int local194 = arg0.anInt135;
					if (local187 >= -256 && local187 <= 256) {
						local194 = arg0.anInt134;
					} else if (local187 >= 256 && local187 < 768) {
						local194 = arg0.anInt137;
					} else if (local187 >= -768 && local187 <= -256) {
						local194 = arg0.anInt136;
					}
					if (local194 == -1) {
						local194 = arg0.anInt134;
					}
					arg0.anInt148 = local194;
					@Pc(236) int local236 = 4;
					if (arg0.anInt130 != arg0.anInt170 && arg0.anInt145 == -1 && arg0.anInt171 != 0) {
						local236 = 2;
					}
					if (arg0.anInt172 > 2) {
						local236 = 6;
					}
					if (arg0.anInt172 > 3) {
						local236 = 8;
					}
					if (arg0.anInt173 > 0 && arg0.anInt172 > 1) {
						local236 = 8;
						arg0.anInt173--;
					}
					if (arg0.aBooleanArray3[arg0.anInt172 - 1]) {
						local236 <<= 0x1;
					}
					if (local236 >= 8 && arg0.anInt148 == arg0.anInt134 && arg0.anInt138 != -1) {
						arg0.anInt148 = arg0.anInt138;
					}
					if (local60 < local78) {
						arg0.anInt128 += local236;
						if (arg0.anInt128 > local78) {
							arg0.anInt128 = local78;
						}
					} else if (local60 > local78) {
						arg0.anInt128 -= local236;
						if (arg0.anInt128 < local78) {
							arg0.anInt128 = local78;
						}
					}
					if (local63 < local93) {
						arg0.anInt129 += local236;
						if (arg0.anInt129 > local93) {
							arg0.anInt129 = local93;
						}
					} else if (local63 > local93) {
						arg0.anInt129 -= local236;
						if (arg0.anInt129 < local93) {
							arg0.anInt129 = local93;
						}
					}
					if (arg0.anInt128 == local78 && arg0.anInt129 == local93) {
						arg0.anInt172--;
						if (arg0.anInt174 > 0) {
							arg0.anInt174--;
							return;
						}
					}
				} else {
					arg0.anInt128 = local78;
					arg0.anInt129 = local93;
				}
			}
		} catch (@Pc(398) RuntimeException local398) {
			signlink.reporterror("53881, " + arg0 + ", " + -156 + ", " + local398.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!z;Z)V")
	private void method217(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt171 != 0) {
				@Pc(34) int local34;
				@Pc(40) int local40;
				if (arg0.anInt145 != -1 && arg0.anInt145 < 32768) {
					@Pc(26) Class1_Sub1_Sub1_Sub1_Sub1 local26 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[arg0.anInt145];
					if (local26 != null) {
						local34 = arg0.anInt128 - local26.anInt128;
						local40 = arg0.anInt129 - local26.anInt129;
						if (local34 != 0 || local40 != 0) {
							arg0.anInt170 = (int) (Math.atan2((double) local34, (double) local40) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(65) int local65;
				if (arg0.anInt145 >= 32768) {
					local65 = arg0.anInt145 - 32768;
					if (local65 == this.anInt261) {
						local65 = this.anInt356;
					}
					@Pc(77) Class1_Sub1_Sub1_Sub1_Sub2 local77 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local65];
					if (local77 != null) {
						local40 = arg0.anInt128 - local77.anInt128;
						@Pc(91) int local91 = arg0.anInt129 - local77.anInt129;
						if (local40 != 0 || local91 != 0) {
							arg0.anInt170 = (int) (Math.atan2((double) local40, (double) local91) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt146 != 0 || arg0.anInt147 != 0) && (arg0.anInt172 == 0 || arg0.anInt173 > 0)) {
					local65 = arg0.anInt128 - (arg0.anInt146 - this.anInt384 - this.anInt384) * 64;
					local34 = arg0.anInt129 - (arg0.anInt147 - this.anInt385 - this.anInt385) * 64;
					if (local65 != 0 || local34 != 0) {
						arg0.anInt170 = (int) (Math.atan2((double) local65, (double) local34) * 325.949D) & 0x7FF;
					}
					arg0.anInt146 = 0;
					arg0.anInt147 = 0;
				}
				local65 = arg0.anInt170 - arg0.anInt130 & 0x7FF;
				if (local65 != 0) {
					if (local65 < arg0.anInt171 || local65 > 2048 - arg0.anInt171) {
						arg0.anInt130 = arg0.anInt170;
					} else if (local65 > 1024) {
						arg0.anInt130 -= arg0.anInt171;
					} else {
						arg0.anInt130 += arg0.anInt171;
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
			}
		} catch (@Pc(245) RuntimeException local245) {
			signlink.reporterror("82558, " + arg0 + ", " + false + ", " + local245.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!z;)V")
	private void method218(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.aBoolean29 = false;
			@Pc(17) Class27 local17;
			if (arg0.anInt148 != -1) {
				local17 = Class27.aClass27Array1[arg0.anInt148];
				arg0.anInt150++;
				if (arg0.anInt149 < local17.anInt808 && arg0.anInt150 > local17.method517(arg0.anInt149, (byte) 2)) {
					arg0.anInt150 = 0;
					arg0.anInt149++;
				}
				if (arg0.anInt149 >= local17.anInt808) {
					arg0.anInt150 = 0;
					arg0.anInt149 = 0;
				}
			}
			if (arg0.anInt156 != -1 && anInt440 >= arg0.anInt159) {
				if (arg0.anInt157 < 0) {
					arg0.anInt157 = 0;
				}
				local17 = Class32.aClass32Array1[arg0.anInt156].aClass27_2;
				arg0.anInt158++;
				while (arg0.anInt157 < local17.anInt808 && arg0.anInt158 > local17.method517(arg0.anInt157, (byte) 2)) {
					arg0.anInt158 -= local17.method517(arg0.anInt157, (byte) 2);
					arg0.anInt157++;
				}
				if (arg0.anInt157 >= local17.anInt808 && (arg0.anInt157 < 0 || arg0.anInt157 >= local17.anInt808)) {
					arg0.anInt156 = -1;
				}
			}
			if (arg0.anInt151 != -1 && arg0.anInt154 <= 1) {
				local17 = Class27.aClass27Array1[arg0.anInt151];
				if (local17.anInt814 == 1 && arg0.anInt174 > 0 && arg0.anInt165 <= anInt440 && arg0.anInt166 < anInt440) {
					arg0.anInt154 = 1;
					return;
				}
			}
			if (arg0.anInt151 != -1 && arg0.anInt154 == 0) {
				local17 = Class27.aClass27Array1[arg0.anInt151];
				arg0.anInt153++;
				while (arg0.anInt152 < local17.anInt808 && arg0.anInt153 > local17.method517(arg0.anInt152, (byte) 2)) {
					arg0.anInt153 -= local17.method517(arg0.anInt152, (byte) 2);
					arg0.anInt152++;
				}
				if (arg0.anInt152 >= local17.anInt808) {
					arg0.anInt152 -= local17.anInt809;
					arg0.anInt155++;
					if (arg0.anInt155 >= local17.anInt813) {
						arg0.anInt151 = -1;
					}
					if (arg0.anInt152 < 0 || arg0.anInt152 >= local17.anInt808) {
						arg0.anInt151 = -1;
					}
				}
				arg0.aBoolean29 = local17.aBoolean225;
			}
			if (arg0.anInt154 > 0) {
				arg0.anInt154--;
			}
		} catch (@Pc(262) RuntimeException local262) {
			signlink.reporterror("69053, " + false + ", " + arg0 + ", " + local262.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method219(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != -74) {
				this.aClass31ArrayArrayArray1 = null;
			}
			if (this.aBoolean68) {
				this.aBoolean68 = false;
				this.aClass37_10.method539(super.aGraphics2, 4, 0);
				this.aClass37_11.method539(super.aGraphics2, 357, 0);
				this.aClass37_12.method539(super.aGraphics2, 4, 722);
				this.aClass37_13.method539(super.aGraphics2, 205, 743);
				this.aClass37_14.method539(super.aGraphics2, 0, 0);
				this.aClass37_15.method539(super.aGraphics2, 4, 516);
				this.aClass37_16.method539(super.aGraphics2, 205, 516);
				this.aClass37_17.method539(super.aGraphics2, 357, 496);
				this.aClass37_18.method539(super.aGraphics2, 338, 0);
				this.aBoolean66 = true;
				this.aBoolean49 = true;
				this.aBoolean71 = true;
				this.aBoolean79 = true;
				if (this.anInt415 != 2) {
					this.aClass37_5.method539(super.aGraphics2, 4, 4);
					this.aClass37_4.method539(super.aGraphics2, 4, 550);
				}
			}
			if (this.anInt415 == 2) {
				this.method134();
			}
			if (this.aBoolean72 && this.anInt277 == 1) {
				this.aBoolean66 = true;
			}
			@Pc(144) boolean local144;
			if (this.anInt337 != -1) {
				local144 = this.method203(this.anInt337, this.anInt266);
				if (local144) {
					this.aBoolean66 = true;
				}
			}
			if (this.anInt373 == 2) {
				this.aBoolean66 = true;
			}
			if (this.anInt403 == 2) {
				this.aBoolean66 = true;
			}
			if (this.aBoolean66) {
				this.method189();
				this.aBoolean66 = false;
			}
			if (this.anInt343 == -1) {
				this.aClass6_1.anInt468 = this.anInt394 - this.anInt319 - 77;
				if (super.anInt232 > 448 && super.anInt232 < 560 && super.anInt233 > 332) {
					this.method104(77, this.anInt394, 0, super.anInt233 - 357, false, 463, this.aClass6_1, super.anInt232 - 17);
				}
				@Pc(226) int local226 = this.anInt394 - this.aClass6_1.anInt468 - 77;
				if (local226 < 0) {
					local226 = 0;
				}
				if (local226 > this.anInt394 - 77) {
					local226 = this.anInt394 - 77;
				}
				if (this.anInt319 != local226) {
					this.anInt319 = local226;
					this.aBoolean49 = true;
				}
			}
			if (this.anInt343 != -1) {
				local144 = this.method203(this.anInt343, this.anInt266);
				if (local144) {
					this.aBoolean49 = true;
				}
			}
			if (this.anInt373 == 3) {
				this.aBoolean49 = true;
			}
			if (this.anInt403 == 3) {
				this.aBoolean49 = true;
			}
			if (this.aString10 != null) {
				this.aBoolean49 = true;
			}
			if (this.aBoolean72 && this.anInt277 == 2) {
				this.aBoolean49 = true;
			}
			if (this.aBoolean49) {
				this.method164(this.aBoolean80);
				this.aBoolean49 = false;
			}
			if (this.anInt415 == 2) {
				this.method179();
				this.aClass37_4.method539(super.aGraphics2, 4, 550);
			}
			if (this.anInt275 != -1) {
				this.aBoolean71 = true;
			}
			if (this.aBoolean71) {
				if (this.anInt275 != -1 && this.anInt275 == this.anInt330) {
					this.anInt275 = -1;
					this.aClass1_Sub1_Sub3_4.method487(201);
					this.aClass1_Sub1_Sub3_4.method488(this.anInt330);
				}
				this.aBoolean71 = false;
				this.aClass37_9.method538();
				this.aClass1_Sub1_Sub2_Sub3_3.method445(0, 0);
				if (this.anInt337 == -1) {
					if (this.anIntArray76[this.anInt330] != -1) {
						if (this.anInt330 == 0) {
							this.aClass1_Sub1_Sub2_Sub3_4.method445(22, 10);
						}
						if (this.anInt330 == 1) {
							this.aClass1_Sub1_Sub2_Sub3_5.method445(54, 8);
						}
						if (this.anInt330 == 2) {
							this.aClass1_Sub1_Sub2_Sub3_5.method445(82, 8);
						}
						if (this.anInt330 == 3) {
							this.aClass1_Sub1_Sub2_Sub3_6.method445(110, 8);
						}
						if (this.anInt330 == 4) {
							this.aClass1_Sub1_Sub2_Sub3_8.method445(153, 8);
						}
						if (this.anInt330 == 5) {
							this.aClass1_Sub1_Sub2_Sub3_8.method445(181, 8);
						}
						if (this.anInt330 == 6) {
							this.aClass1_Sub1_Sub2_Sub3_7.method445(209, 9);
						}
					}
					if (this.anIntArray76[0] != -1 && (this.anInt275 != 0 || anInt440 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[0].method445(29, 13);
					}
					if (this.anIntArray76[1] != -1 && (this.anInt275 != 1 || anInt440 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[1].method445(53, 11);
					}
					if (this.anIntArray76[2] != -1 && (this.anInt275 != 2 || anInt440 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[2].method445(82, 11);
					}
					if (this.anIntArray76[3] != -1 && (this.anInt275 != 3 || anInt440 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[3].method445(115, 12);
					}
					if (this.anIntArray76[4] != -1 && (this.anInt275 != 4 || anInt440 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[4].method445(153, 13);
					}
					if (this.anIntArray76[5] != -1 && (this.anInt275 != 5 || anInt440 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[5].method445(180, 11);
					}
					if (this.anIntArray76[6] != -1 && (this.anInt275 != 6 || anInt440 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[6].method445(208, 13);
					}
				}
				this.aClass37_9.method539(super.aGraphics2, 160, 516);
				this.aClass37_8.method538();
				this.aClass1_Sub1_Sub2_Sub3_2.method445(0, 0);
				if (this.anInt337 == -1) {
					if (this.anIntArray76[this.anInt330] != -1) {
						if (this.anInt330 == 7) {
							this.aClass1_Sub1_Sub2_Sub3_12.method445(42, 0);
						}
						if (this.anInt330 == 8) {
							this.aClass1_Sub1_Sub2_Sub3_13.method445(74, 0);
						}
						if (this.anInt330 == 9) {
							this.aClass1_Sub1_Sub2_Sub3_13.method445(102, 0);
						}
						if (this.anInt330 == 10) {
							this.aClass1_Sub1_Sub2_Sub3_14.method445(130, 1);
						}
						if (this.anInt330 == 11) {
							this.aClass1_Sub1_Sub2_Sub3_16.method445(173, 0);
						}
						if (this.anInt330 == 12) {
							this.aClass1_Sub1_Sub2_Sub3_16.method445(201, 0);
						}
						if (this.anInt330 == 13) {
							this.aClass1_Sub1_Sub2_Sub3_15.method445(229, 0);
						}
					}
					if (this.anIntArray76[8] != -1 && (this.anInt275 != 8 || anInt440 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[7].method445(74, 2);
					}
					if (this.anIntArray76[9] != -1 && (this.anInt275 != 9 || anInt440 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[8].method445(102, 3);
					}
					if (this.anIntArray76[10] != -1 && (this.anInt275 != 10 || anInt440 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[9].method445(137, 4);
					}
					if (this.anIntArray76[11] != -1 && (this.anInt275 != 11 || anInt440 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[10].method445(174, 2);
					}
					if (this.anIntArray76[12] != -1 && (this.anInt275 != 12 || anInt440 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[11].method445(201, 2);
					}
					if (this.anIntArray76[13] != -1 && (this.anInt275 != 13 || anInt440 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[12].method445(226, 2);
					}
				}
				this.aClass37_8.method539(super.aGraphics2, 466, 496);
				this.aClass37_5.method538();
			}
			if (this.aBoolean79) {
				this.aBoolean79 = false;
				this.aClass37_7.method538();
				this.aClass1_Sub1_Sub2_Sub3_1.method445(0, 0);
				this.aClass1_Sub1_Sub2_Sub4_2.method466("Public chat", 55, true, 16777215, 28);
				if (this.anInt250 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466("On", 55, true, 65280, 41);
				}
				if (this.anInt250 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466("Friends", 55, true, 16776960, 41);
				}
				if (this.anInt250 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466("Off", 55, true, 16711680, 41);
				}
				if (this.anInt250 == 3) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466("Hide", 55, true, 65535, 41);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method466("Private chat", 184, true, 16777215, 28);
				if (this.anInt381 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466("On", 184, true, 65280, 41);
				}
				if (this.anInt381 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466("Friends", 184, true, 16776960, 41);
				}
				if (this.anInt381 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466("Off", 184, true, 16711680, 41);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method466("Trade/duel", 324, true, 16777215, 28);
				if (this.anInt252 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466("On", 324, true, 65280, 41);
				}
				if (this.anInt252 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466("Friends", 324, true, 16776960, 41);
				}
				if (this.anInt252 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466("Off", 324, true, 16711680, 41);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method466("Report abuse", 458, true, 16777215, 33);
				this.aClass37_7.method539(super.aGraphics2, 453, 0);
				this.aClass37_5.method538();
			}
			this.anInt266 = 0;
		} catch (@Pc(1053) RuntimeException local1053) {
			signlink.reporterror("74802, " + arg0 + ", " + local1053.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "N", descriptor = "(I)V")
	private void method220() {
		try {
			for (@Pc(10) int local10 = 0; local10 < this.anInt424; local10++) {
				if (this.anIntArray95[local10] <= 0) {
					@Pc(19) boolean local19 = false;
					try {
						if (this.anIntArray52[local10] != this.anInt441 || this.anIntArray78[local10] != this.anInt377) {
							@Pc(53) Class1_Sub1_Sub3 local53 = Class5.method80(this.anIntArray78[local10], this.anIntArray52[local10]);
							if (System.currentTimeMillis() + (long) (local53.anInt776 / 22) > this.aLong15 + (long) (this.anInt309 / 22)) {
								this.anInt309 = local53.anInt776;
								this.aLong15 = System.currentTimeMillis();
								if (this.method103(local53.aByteArray9, local53.anInt776)) {
									this.anInt441 = this.anIntArray52[local10];
									this.anInt377 = this.anIntArray78[local10];
								} else {
									local19 = true;
								}
							}
						} else if (!this.method118(this.aByte8)) {
							local19 = true;
						}
					} catch (@Pc(103) Exception local103) {
					}
					if (local19 && this.anIntArray95[local10] != -5) {
						this.anIntArray95[local10] = -5;
					} else {
						this.anInt424--;
						for (@Pc(119) int local119 = local10; local119 < this.anInt424; local119++) {
							this.anIntArray52[local119] = this.anIntArray52[local119 + 1];
							this.anIntArray78[local119] = this.anIntArray78[local119 + 1];
							this.anIntArray95[local119] = this.anIntArray95[local119 + 1];
						}
						local10--;
					}
				} else {
					@Pc(171) int local171 = this.anIntArray95[local10]--;
				}
			}
			if (this.anInt368 > 0) {
				this.anInt368 -= 20;
				if (this.anInt368 < 0) {
					this.anInt368 = 0;
				}
				if (this.anInt368 == 0 && this.aBoolean77 && !aBoolean56) {
					this.anInt426 = this.anInt295;
					this.aBoolean87 = false;
					this.aClass45_Sub1_1.method657(2, this.anInt426);
					return;
				}
			}
		} catch (@Pc(217) RuntimeException local217) {
			signlink.reporterror("6644, " + 0 + ", " + local217.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt291 = Integer.parseInt(this.getParameter("nodeid"));
		anInt292 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method147(12);
		} else {
			method137();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean55 = false;
		} else {
			aBoolean55 = true;
		}
		this.method86();
	}

	@OriginalMember(owner = "client!client", name = "O", descriptor = "(I)Ljava/lang/String;")
	private String method221() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("80694, " + -757 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ZZ)V")
	private void method222(@OriginalArg(0) boolean arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt352; local1++) {
				@Pc(11) Class1_Sub1_Sub1_Sub1_Sub1 local11 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray57[local1]];
				@Pc(20) int local20 = (this.anIntArray57[local1] << 14) + 536870912;
				if (local11 != null && local11.method49(509) && local11.aClass13_1.aBoolean152 == arg0) {
					@Pc(36) int local36 = local11.anInt128 >> 7;
					@Pc(41) int local41 = local11.anInt129 >> 7;
					if (local36 >= 0 && local36 < 104 && local41 >= 0 && local41 < 104) {
						if (local11.anInt131 == 1 && (local11.anInt128 & 0x7F) == 64 && (local11.anInt129 & 0x7F) == 64) {
							if (this.anIntArrayArray5[local36][local41] == this.anInt431) {
								continue;
							}
							this.anIntArrayArray5[local36][local41] = this.anInt431;
						}
						this.aClass39_1.method555(local20, local11.anInt128, this.method209(this.aBoolean76, local11.anInt128, local11.anInt129, this.anInt432), local11, local11.anInt129, this.anInt432, (local11.anInt131 - 1) * 64 + 60, local11.aBoolean29, local11.anInt130);
					}
				}
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("27355, " + arg0 + ", " + false + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method223() {
		try {
			@Pc(21) int local21;
			@Pc(49) int local49;
			@Pc(53) int local53;
			@Pc(62) int local62;
			@Pc(69) int local69;
			@Pc(132) int local132;
			@Pc(189) int local189;
			try {
				this.anInt425 = -1;
				this.aClass31_1.method527();
				this.aClass31_3.method527();
				Class1_Sub1_Sub2_Sub1.method373();
				this.method196(208);
				this.aClass39_1.method544();
				for (local21 = 0; local21 < 4; local21++) {
					this.aClass19Array1[local21].method414();
				}
				System.gc();
				@Pc(45) Class4 local45 = new Class4(this.anIntArrayArrayArray3, this.aByteArrayArrayArray7, 104, 49127, 104);
				local49 = this.aByteArrayArray2.length;
				Class4.aBoolean35 = Class39.aBoolean242;
				for (local53 = 0; local53 < local49; local53++) {
					local62 = this.anIntArray69[local53] >> 8;
					local69 = this.anIntArray69[local53] & 0xFF;
					if (local62 == 33 && local69 >= 71 && local69 <= 73) {
						Class4.aBoolean35 = false;
					}
				}
				if (Class4.aBoolean35) {
					this.aClass39_1.method545(this.anInt432);
				} else {
					this.aClass39_1.method545(0);
				}
				this.aClass1_Sub1_Sub3_4.method487(239);
				@Pc(137) byte[] local137;
				for (local62 = 0; local62 < local49; local62++) {
					local69 = (this.anIntArray69[local62] >> 8) * 64 - this.anInt384;
					local132 = (this.anIntArray69[local62] & 0xFF) * 64 - this.anInt385;
					local137 = this.aByteArrayArray2[local62];
					if (local137 != null) {
						local45.method58((this.anInt334 - 6) * 8, local132, (this.anInt333 - 6) * 8, local69, local137);
					}
				}
				for (local69 = 0; local69 < local49; local69++) {
					local132 = (this.anIntArray69[local69] >> 8) * 64 - this.anInt384;
					local189 = (this.anIntArray69[local69] & 0xFF) * 64 - this.anInt385;
					@Pc(194) byte[] local194 = this.aByteArrayArray2[local69];
					if (local194 == null && this.anInt334 < 800) {
						local45.method57(local189, local132);
					}
				}
				this.aClass1_Sub1_Sub3_4.method487(239);
				@Pc(239) int local239;
				for (local132 = 0; local132 < local49; local132++) {
					local137 = this.aByteArrayArray1[local132];
					if (local137 != null) {
						local239 = (this.anIntArray69[local132] >> 8) * 64 - this.anInt384;
						@Pc(251) int local251 = (this.anIntArray69[local132] & 0xFF) * 64 - this.anInt385;
						local45.method61(this.aClass39_1, local239, local251, local137, this.aClass19Array1);
					}
				}
				this.aClass1_Sub1_Sub3_4.method487(239);
				local45.method63(this.aClass39_1, this.aClass19Array1);
				this.aClass37_5.method538();
				this.aClass1_Sub1_Sub3_4.method487(239);
				for (local189 = 0; local189 < 104; local189++) {
					for (local239 = 0; local239 < 104; local239++) {
						this.method227(local189, local239);
					}
				}
				this.method200();
			} catch (@Pc(311) Exception local311) {
			}
			Class9.aClass42_4.method643();
			@Pc(325) int local325;
			if (aBoolean56 && signlink.aRandomAccessFile1 != null) {
				local21 = this.aClass45_Sub1_1.method650(0);
				for (local325 = 0; local325 < local21; local325++) {
					local49 = this.aClass45_Sub1_1.method655(local325, (byte) 1);
					if ((local49 & 0x79) == 0) {
						Class1_Sub1_Sub1_Sub5.method287(local325);
					}
				}
			}
			System.gc();
			Class1_Sub1_Sub2_Sub1.method374();
			this.aClass45_Sub1_1.method661();
			local21 = (this.anInt333 - 6) / 8 - 1;
			local325 = (this.anInt333 + 6) / 8 + 1;
			local49 = (this.anInt334 - 6) / 8 - 1;
			local53 = (this.anInt334 + 6) / 8 + 1;
			if (this.aBoolean89) {
				local21 = 49;
				local325 = 50;
				local49 = 49;
				local53 = 50;
			}
			for (local62 = local21; local62 <= local325; local62++) {
				for (local69 = local49; local69 <= local53; local69++) {
					if (local62 == local21 || local62 == local325 || local69 == local49 || local69 == local53) {
						local132 = this.aClass45_Sub1_1.method652(local62, local69, 0);
						if (local132 != -1) {
							this.aClass45_Sub1_1.method662(local132, 3);
						}
						local189 = this.aClass45_Sub1_1.method652(local62, local69, 1);
						if (local189 != -1) {
							this.aClass45_Sub1_1.method662(local189, 3);
						}
					}
				}
			}
		} catch (@Pc(466) RuntimeException local466) {
			signlink.reporterror("78676, " + false + ", " + local466.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZJ)V")
	private void method224(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt396 >= 100) {
					this.method132("", "Your ignore list is full. Max of 100 hit", 0);
				} else {
					@Pc(26) String local26 = Class49.method683(Class49.method680(arg0));
					for (@Pc(28) int local28 = 0; local28 < this.anInt396; local28++) {
						if (this.aLongArray3[local28] == arg0) {
							this.method132("", local26 + " is already on your ignore list", 0);
							return;
						}
					}
					for (@Pc(58) int local58 = 0; local58 < this.anInt378; local58++) {
						if (this.aLongArray4[local58] == arg0) {
							this.method132("", "Please remove " + local26 + " from your friend list first", 0);
							return;
						}
					}
					this.aLongArray3[this.anInt396++] = arg0;
					this.aBoolean66 = true;
					this.aClass1_Sub1_Sub3_4.method487(189);
					this.aClass1_Sub1_Sub3_4.method494(arg0);
				}
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("71010, " + false + ", " + arg0 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BJ)V")
	private void method225(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt378; local8++) {
					if (this.aLongArray4[local8] == arg0) {
						this.anInt378--;
						this.aBoolean66 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt378; local28++) {
							this.aStringArray1[local28] = this.aStringArray1[local28 + 1];
							this.anIntArray51[local28] = this.anIntArray51[local28 + 1];
							this.aLongArray4[local28] = this.aLongArray4[local28 + 1];
						}
						this.aClass1_Sub1_Sub3_4.method487(84);
						this.aClass1_Sub1_Sub3_4.method494(arg0);
						break;
					}
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("61526, " + 106 + ", " + arg0 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method226(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) int local4 = Class38.aClass38Array1[arg0].anInt878;
			if (local4 != 0) {
				@Pc(12) int local12 = this.anIntArray50[arg0];
				if (local4 == 1) {
					if (local12 == 1) {
						Class1_Sub1_Sub2_Sub1.method379(0.9D);
					}
					if (local12 == 2) {
						Class1_Sub1_Sub2_Sub1.method379(0.8D);
					}
					if (local12 == 3) {
						Class1_Sub1_Sub2_Sub1.method379(0.7D);
					}
					if (local12 == 4) {
						Class1_Sub1_Sub2_Sub1.method379(0.6D);
					}
					Class15.aClass42_8.method643();
					this.aBoolean68 = true;
				}
				if (local4 == 3) {
					@Pc(57) boolean local57 = this.aBoolean77;
					if (local12 == 0) {
						this.method116(this.anInt335, this.aBoolean77, 0);
						this.aBoolean77 = true;
					}
					if (local12 == 1) {
						this.method116(this.anInt335, this.aBoolean77, -400);
						this.aBoolean77 = true;
					}
					if (local12 == 2) {
						this.method116(this.anInt335, this.aBoolean77, -800);
						this.aBoolean77 = true;
					}
					if (local12 == 3) {
						this.method116(this.anInt335, this.aBoolean77, -1200);
						this.aBoolean77 = true;
					}
					if (local12 == 4) {
						this.aBoolean77 = false;
					}
					if (this.aBoolean77 != local57 && !aBoolean56) {
						if (this.aBoolean77) {
							this.anInt426 = this.anInt295;
							this.aBoolean87 = false;
							this.aClass45_Sub1_1.method657(2, this.anInt426);
						} else {
							this.method185();
						}
						this.anInt368 = 0;
					}
				}
				if (local4 == 4) {
					if (local12 == 0) {
						this.aBoolean61 = true;
						this.method144(0);
					}
					if (local12 == 1) {
						this.aBoolean61 = true;
						this.method144(-400);
					}
					if (local12 == 2) {
						this.aBoolean61 = true;
						this.method144(-800);
					}
					if (local12 == 3) {
						this.aBoolean61 = true;
						this.method144(-1200);
					}
					if (local12 == 4) {
						this.aBoolean61 = false;
					}
				}
				if (local4 == 5) {
					this.anInt411 = local12;
				}
				if (local4 == 6) {
					this.anInt287 = local12;
				}
				if (local4 == 8) {
					this.anInt410 = local12;
					this.aBoolean49 = true;
				}
				if (local4 == 9) {
					this.anInt251 = local12;
				}
			}
		} catch (@Pc(221) RuntimeException local221) {
			signlink.reporterror("43182, " + arg0 + ", " + 4363 + ", " + local221.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)V")
	private void method227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class31 local9 = this.aClass31ArrayArrayArray1[this.anInt432][arg0][arg1];
		if (local9 == null) {
			this.aClass39_1.method565(this.anInt432, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub1_Sub1_Sub3 local23 = null;
		@Pc(27) Class1_Sub1_Sub1_Sub3 local27;
		for (local27 = (Class1_Sub1_Sub1_Sub3) local9.method523(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub3) local9.method525()) {
			@Pc(32) Class15 local32 = Class15.method345(local27.anInt488);
			@Pc(35) int local35 = local32.anInt624;
			if (local32.aBoolean163) {
				local35 *= local27.anInt489 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method521(800, local23);
		@Pc(65) Class1_Sub1_Sub1_Sub3 local65 = null;
		@Pc(67) Class1_Sub1_Sub1_Sub3 local67 = null;
		for (local27 = (Class1_Sub1_Sub1_Sub3) local9.method523(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub3) local9.method525()) {
			if (local27.anInt488 != local23.anInt488 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt488 != local23.anInt488 && local27.anInt488 != local65.anInt488 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass39_1.method551(this.anInt432, arg1, this.method209(this.aBoolean76, arg0 * 128 + 64, arg1 * 128 + 64, this.anInt432), local110, local23, local67, local65, arg0);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!mb;II)V")
	private void method228(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 != this.anInt259) {
				this.aClass1_Sub1_Sub3_4.method488(102);
			}
			for (@Pc(11) int local11 = 0; local11 < this.anInt358; local11++) {
				@Pc(18) int local18 = this.anIntArray60[local11];
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub1 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local18];
				@Pc(26) int local26 = arg0.method498();
				@Pc(34) int local34;
				@Pc(37) int local37;
				if ((local26 & 0x1) == 1) {
					local34 = arg0.method498();
					local37 = arg0.method498();
					local23.method50(local37, local34);
					local23.anInt142 = anInt440 + 300;
					local23.anInt143 = arg0.method498();
					local23.anInt144 = arg0.method498();
				}
				if ((local26 & 0x2) == 2) {
					local34 = arg0.method500();
					if (local34 == 65535) {
						local34 = -1;
					}
					if (local34 == local23.anInt151) {
						local23.anInt155 = 0;
					}
					local37 = arg0.method498();
					if (local34 == local23.anInt151 && local34 != -1) {
						@Pc(90) int local90 = Class27.aClass27Array1[local34].anInt816;
						if (local90 == 1) {
							local23.anInt152 = 0;
							local23.anInt153 = 0;
							local23.anInt154 = local37;
							local23.anInt155 = 0;
						}
						if (local90 == 2) {
							local23.anInt155 = 0;
						}
					} else if (local34 == -1 || local23.anInt151 == -1 || Class27.aClass27Array1[local34].anInt810 >= Class27.aClass27Array1[local23.anInt151].anInt810) {
						local23.anInt151 = local34;
						local23.anInt152 = 0;
						local23.anInt153 = 0;
						local23.anInt154 = local37;
						local23.anInt155 = 0;
						local23.anInt174 = local23.anInt172;
					}
				}
				if ((local26 & 0x4) == 4) {
					local23.anInt145 = arg0.method500();
					if (local23.anInt145 == 65535) {
						local23.anInt145 = -1;
					}
				}
				if ((local26 & 0x8) == 8) {
					local23.aString3 = arg0.method505();
					local23.anInt139 = 100;
				}
				if ((local26 & 0x10) == 16) {
					local34 = arg0.method498();
					local37 = arg0.method498();
					local23.method50(local37, local34);
					local23.anInt142 = anInt440 + 300;
					local23.anInt143 = arg0.method498();
					local23.anInt144 = arg0.method498();
				}
				if ((local26 & 0x20) == 32) {
					local23.aClass13_1 = Class13.method320(arg0.method500());
					local23.anInt131 = local23.aClass13_1.aByte23;
					local23.anInt171 = local23.aClass13_1.anInt596;
					local23.anInt134 = local23.aClass13_1.anInt583;
					local23.anInt135 = local23.aClass13_1.anInt584;
					local23.anInt136 = local23.aClass13_1.anInt585;
					local23.anInt137 = local23.aClass13_1.anInt586;
					local23.anInt132 = local23.aClass13_1.anInt582;
				}
				if ((local26 & 0x40) == 64) {
					local23.anInt156 = arg0.method500();
					local34 = arg0.method503();
					local23.anInt160 = local34 >> 16;
					local23.anInt159 = anInt440 + (local34 & 0xFFFF);
					local23.anInt157 = 0;
					local23.anInt158 = 0;
					if (local23.anInt159 > anInt440) {
						local23.anInt157 = -1;
					}
					if (local23.anInt156 == 65535) {
						local23.anInt156 = -1;
					}
				}
				if ((local26 & 0x80) == 128) {
					local23.anInt146 = arg0.method500();
					local23.anInt147 = arg0.method500();
				}
			}
		} catch (@Pc(315) RuntimeException local315) {
			signlink.reporterror("75839, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local315.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "P", descriptor = "(I)V")
	private void method229() {
		try {
			try {
				@Pc(13) int local13 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 + this.anInt445;
				@Pc(19) int local19 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 + this.anInt350;
				if (this.anInt304 - local13 < -500 || this.anInt304 - local13 > 500 || this.anInt305 - local19 < -500 || this.anInt305 - local19 > 500) {
					this.anInt304 = local13;
					this.anInt305 = local19;
				}
				if (this.anInt304 != local13) {
					this.anInt304 += (local13 - this.anInt304) / 16;
				}
				if (this.anInt305 != local19) {
					this.anInt305 += (local19 - this.anInt305) / 16;
				}
				if (super.anIntArray32[1] == 1) {
					this.anInt298 += (-this.anInt298 - 24) / 2;
				} else if (super.anIntArray32[2] == 1) {
					this.anInt298 += (24 - this.anInt298) / 2;
				} else {
					this.anInt298 /= 2;
				}
				if (super.anIntArray32[3] == 1) {
					this.anInt299 += (12 - this.anInt299) / 2;
				} else if (super.anIntArray32[4] == 1) {
					this.anInt299 += (-this.anInt299 - 12) / 2;
				} else {
					this.anInt299 /= 2;
				}
				this.anInt297 = this.anInt297 + this.anInt298 / 2 & 0x7FF;
				this.anInt296 += this.anInt299 / 2;
				if (this.anInt296 < 128) {
					this.anInt296 = 128;
				}
				if (this.anInt296 > 383) {
					this.anInt296 = 383;
				}
				@Pc(206) int local206 = this.anInt304 >> 7;
				@Pc(211) int local211 = this.anInt305 >> 7;
				@Pc(222) int local222 = this.method209(this.aBoolean76, this.anInt304, this.anInt305, this.anInt432);
				@Pc(224) int local224 = 0;
				@Pc(240) int local240;
				if (local206 > 3 && local211 > 3 && local206 < 100 && local211 < 100) {
					for (local240 = local206 - 4; local240 <= local206 + 4; local240++) {
						for (@Pc(246) int local246 = local211 - 4; local246 <= local211 + 4; local246++) {
							@Pc(251) int local251 = this.anInt432;
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
				if (local240 > this.anInt382) {
					this.anInt382 += (local240 - this.anInt382) / 24;
				} else if (local240 < this.anInt382) {
					this.anInt382 += (local240 - this.anInt382) / 80;
				}
			} catch (@Pc(342) Exception local342) {
				signlink.reporterror("glfc_ex " + aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 + "," + aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt129 + "," + this.anInt304 + "," + this.anInt305 + "," + this.anInt333 + "," + this.anInt334 + "," + this.anInt384 + "," + this.anInt385);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(392) RuntimeException local392) {
			signlink.reporterror("63248, " + 18798 + ", " + local392.toString());
			throw new RuntimeException();
		}
	}
}
