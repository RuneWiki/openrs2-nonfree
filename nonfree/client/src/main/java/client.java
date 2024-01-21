import java.applet.AppletContext;
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

	@OriginalMember(owner = "client!client", name = "L", descriptor = "I")
	private static int anInt217;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
	private static int anInt230;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "Z")
	private static boolean aBoolean54;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
	private static int anInt246;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
	private static int anInt247;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "I")
	public static int anInt248;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
	private static int anInt254;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "I")
	public static int anInt256;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "Z")
	private static boolean aBoolean56;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
	private static int anInt257;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
	private static int anInt274;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "I")
	private static int anInt285;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
	private static int anInt289;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "I")
	private static int anInt297;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
	private static int anInt308;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
	private static int anInt310;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
	private static int anInt322;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "Z")
	private static boolean aBoolean71;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "I")
	private static int anInt344;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "Lclient!ab;")
	public static Class1_Sub1_Sub1_Sub1_Sub1 aClass1_Sub1_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "I")
	private static int anInt375;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "I")
	private static int anInt376;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
	private static int anInt395;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "Z")
	private static boolean aBoolean87;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "I")
	private static int anInt415;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "I")
	private static int anInt426;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "Ljava/lang/String;")
	private static String aString4 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
	private static int anInt235 = 738;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "B")
	private static byte aByte3 = -90;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "I")
	private static int anInt255 = 10;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "Z")
	private static boolean aBoolean55 = true;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "[I")
	public static final int[] anIntArray40 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@OriginalMember(owner = "client!client", name = "od", descriptor = "[I")
	public static int[] anIntArray42 = new int[32];

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "[[I")
	public static final int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "Z")
	private static boolean aBoolean74;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "[I")
	private static int[] anIntArray69;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private static int anInt417;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "I")
	private int anInt216;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "I")
	private int anInt219;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "I")
	private int anInt220;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "I")
	private int anInt221;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "I")
	private int anInt222;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "I")
	private int anInt223;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "I")
	private int anInt224;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "I")
	private int anInt225;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
	private int anInt226;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	private int anInt228;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
	private int anInt229;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	private int anInt231;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
	private int anInt232;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	private int anInt236;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
	private int anInt237;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
	private int anInt238;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
	private int anInt239;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
	private int anInt240;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "Lclient!xb;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "[[B")
	private byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "Lclient!e;")
	private Class8 aClass8_1;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "I")
	private int anInt243;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
	private int anInt244;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
	private int anInt245;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "Lclient!qb;")
	private Class35 aClass35_3;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "Lclient!qb;")
	private Class35 aClass35_4;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "Lclient!qb;")
	private Class35 aClass35_5;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "Lclient!qb;")
	private Class35 aClass35_6;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "Lclient!qb;")
	private Class35 aClass35_7;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "Lclient!qb;")
	private Class35 aClass35_8;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "Lclient!qb;")
	private Class35 aClass35_9;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "Lclient!qb;")
	private Class35 aClass35_10;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "Lclient!qb;")
	private Class35 aClass35_11;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
	private int anInt250;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
	private int anInt251;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
	private int anInt252;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
	private int anInt253;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
	private int anInt259;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "I")
	private int anInt260;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
	private int anInt262;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
	private int anInt263;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
	private int anInt264;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "I")
	private int anInt265;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
	private int anInt266;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "I")
	private int anInt267;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
	private int anInt269;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
	private int anInt270;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
	private int anInt271;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "Ljava/lang/String;")
	private String aString5;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_1;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_2;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "Lclient!qb;")
	private Class35 aClass35_12;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "Lclient!qb;")
	private Class35 aClass35_13;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "Lclient!qb;")
	private Class35 aClass35_14;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "Lclient!qb;")
	private Class35 aClass35_15;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "Lclient!qb;")
	private Class35 aClass35_16;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "Lclient!qb;")
	private Class35 aClass35_17;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "Lclient!qb;")
	private Class35 aClass35_18;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "Lclient!qb;")
	private Class35 aClass35_19;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "Lclient!qb;")
	private Class35 aClass35_20;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
	private int anInt272;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
	private int anInt273;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_6;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
	private int anInt275;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
	private int anInt276;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "I")
	private int anInt277;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "I")
	private int anInt280;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
	private int anInt281;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
	private int anInt282;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
	private int anInt283;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "Ljava/lang/String;")
	private String aString9;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "I")
	private int anInt284;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "I")
	private int anInt286;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "I")
	private int anInt288;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
	private int anInt290;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
	private int anInt291;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
	private int anInt292;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
	private int anInt293;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "I")
	private int anInt294;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
	private int anInt295;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "I")
	private int anInt296;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
	private int anInt298;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "[I")
	private int[] anIntArray51;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "[I")
	private int[] anIntArray52;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "[I")
	private int[] anIntArray53;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
	private int anInt299;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "[I")
	private int[] anIntArray54;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "[I")
	private int[] anIntArray55;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_6;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "Lclient!wb;")
	private Class46 aClass46_1;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "I")
	private int anInt301;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "I")
	private int anInt302;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
	private int anInt303;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
	private int anInt304;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
	private int anInt305;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
	private int anInt306;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array4;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
	private int anInt309;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_7;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_8;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_9;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_10;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_11;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
	private int anInt311;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
	private int anInt312;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
	private int anInt313;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
	private int anInt314;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "I")
	private int anInt315;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "I")
	private int anInt317;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_1;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_2;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
	private int anInt319;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
	private int anInt320;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
	private int anInt323;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
	private int anInt324;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
	private int anInt325;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
	private int anInt327;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "I")
	private int anInt328;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "I")
	private int anInt329;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
	private int anInt330;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "I")
	private int anInt332;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private int anInt334;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
	private int anInt336;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "I")
	private int anInt337;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "I")
	private int anInt338;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
	private int anInt339;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private int anInt340;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
	private int anInt341;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
	private int anInt342;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
	private int anInt343;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_7;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
	private int anInt345;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
	private int anInt346;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
	private int anInt347;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
	private int anInt348;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
	private int anInt352;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "I")
	private int anInt353;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
	private int anInt356;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
	private int anInt357;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "I")
	private int anInt358;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
	private int anInt359;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "I")
	private int anInt360;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
	private int anInt361;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
	private int anInt363;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
	private int anInt364;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "Ljava/lang/String;")
	private String aString13;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
	private int anInt366;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
	private int anInt367;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
	private int anInt368;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
	private int anInt369;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
	private int anInt370;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
	private int anInt373;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "J")
	private long aLong16;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "[I")
	private int[] anIntArray73;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "[I")
	private int[] anIntArray74;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
	private int anInt378;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "Lclient!ub;")
	private Class44_Sub1 aClass44_Sub1_1;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "I")
	private int anInt379;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "I")
	private int anInt380;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "I")
	private int anInt382;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "I")
	private int anInt383;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "I")
	private int anInt384;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
	private int anInt385;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "I")
	private int anInt386;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
	private int anInt387;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
	private int anInt389;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
	private int anInt390;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "I")
	private int anInt391;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "I")
	private int anInt392;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_8;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
	private int anInt394;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "I")
	private int anInt396;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "Lclient!qb;")
	private Class35 aClass35_21;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "Lclient!qb;")
	private Class35 aClass35_22;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "Lclient!qb;")
	private Class35 aClass35_23;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "J")
	private long aLong17;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "Lclient!r;")
	private Class37 aClass37_1;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
	private int anInt399;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "I")
	private int anInt400;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
	private int anInt401;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "I")
	private int anInt402;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
	private int anInt404;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "[I")
	private int[] anIntArray79;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "[I")
	private int[] anIntArray80;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "[I")
	private int[] anIntArray81;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
	private int anInt405;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
	private int anInt406;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
	private int anInt407;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "I")
	private int anInt408;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
	private int anInt409;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
	private int anInt410;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
	private int anInt411;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
	private int anInt412;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "Ljava/lang/String;")
	private String aString16;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "Lclient!qb;")
	private Class35 aClass35_24;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "Lclient!qb;")
	private Class35 aClass35_25;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "Lclient!qb;")
	private Class35 aClass35_26;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "Lclient!qb;")
	private Class35 aClass35_27;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
	private int anInt413;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_9;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_10;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_11;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_12;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_12;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_13;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
	private int anInt416;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "Lclient!fc;")
	private Class11 aClass11_1;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_13;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "I")
	private int anInt418;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "[I")
	private int[] anIntArray86;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "[I")
	private int[] anIntArray87;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "[I")
	private int[] anIntArray88;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "[I")
	private int[] anIntArray89;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
	private int anInt420;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
	private int anInt421;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "I")
	private int anInt423;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "I")
	private int anInt424;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_14;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_15;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_16;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_17;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_18;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_19;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_20;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "[I")
	private int[] anIntArray32 = new int[100];

	@OriginalMember(owner = "client!client", name = "O", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray1 = new String[100];

	@OriginalMember(owner = "client!client", name = "P", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray2 = new String[100];

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
	private int anInt218 = -1;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
	private int anInt227 = 2;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "[Lclient!vb;")
	public Class45[] aClass45Array1 = new Class45[5];

	@OriginalMember(owner = "client!client", name = "db", descriptor = "[I")
	private int[] anIntArray33 = new int[9];

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "[I")
	private int[] anIntArray34 = new int[151];

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "B")
	private byte aByte1 = 2;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "Lclient!d;")
	private Class6 aClass6_1 = new Class6();

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Z")
	private boolean aBoolean51 = true;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
	private int anInt233 = 4;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
	private int anInt234 = -44650;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "[I")
	private int[] anIntArray35 = new int[500];

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "[I")
	private int[] anIntArray36 = new int[500];

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "[I")
	private int[] anIntArray37 = new int[500];

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "[I")
	private int[] anIntArray38 = new int[500];

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "Z")
	private boolean aBoolean52 = false;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "B")
	private byte aByte2 = 9;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "Z")
	private boolean aBoolean53 = false;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
	private int anInt241 = -1;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
	private int anInt242 = -810;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray3 = new String[500];

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
	private int anInt249 = 128;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "[[[Lclient!ob;")
	private Class29[][][] aClass29ArrayArrayArray1 = new Class29[4][104][104];

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "[I")
	private int[] anIntArray39 = new int[5];

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array1 = new Class1_Sub1_Sub2_Sub3[2];

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "B")
	private byte aByte4 = 4;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "B")
	private byte aByte5 = -49;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
	private int anInt258 = 7759444;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "I")
	private int anInt261 = 2;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
	private int anInt268 = 1;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "[I")
	private int[] anIntArray41 = new int[50];

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "Lclient!ob;")
	private Class29 aClass29_1 = new Class29(18783);

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "Ljava/lang/String;")
	private String aString6 = "";

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "Ljava/lang/String;")
	private String aString7 = "";

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "Z")
	private boolean aBoolean57 = false;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "Z")
	private boolean aBoolean58 = false;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "Z")
	public boolean aBoolean59 = false;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "B")
	private byte aByte6 = -42;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "B")
	private byte aByte7 = 5;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "I")
	private int anInt278 = -1;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
	private int anInt279 = -1;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "[I")
	private int[] anIntArray43 = new int[50];

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "[Z")
	private boolean[] aBooleanArray3 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array2 = new Class1_Sub1_Sub2_Sub3[13];

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "[B")
	private byte[] aByteArray2 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "[I")
	private int[] anIntArray44 = new int[Class30.anInt825];

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "[I")
	public int[] anIntArray45 = new int[2000];

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "[I")
	private int[] anIntArray46 = new int[256];

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "Ljava/lang/String;")
	private String aString8 = "";

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array3 = new Class1_Sub1_Sub2_Sub2[1000];

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "[I")
	private int[] anIntArray47 = new int[Class30.anInt825];

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "[Lclient!z;")
	private Class1_Sub1_Sub1_Sub1_Sub2[] aClass1_Sub1_Sub1_Sub1_Sub2Array1 = new Class1_Sub1_Sub1_Sub1_Sub2[16384];

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "[I")
	private int[] anIntArray48 = new int[16384];

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "[I")
	private int[] anIntArray49 = new int[50];

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "Z")
	private boolean aBoolean61 = true;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "Z")
	private boolean aBoolean62 = false;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "[I")
	private int[] anIntArray50 = new int[Class30.anInt825];

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array4 = new Class1_Sub1_Sub2_Sub2[100];

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "I")
	private int anInt287 = -567;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "Z")
	private boolean aBoolean63 = false;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_2 = Class1_Sub1_Sub3.method468();

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "Z")
	private boolean aBoolean64 = false;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array3 = new Class1_Sub1_Sub2_Sub3[100];

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "[[I")
	private int[][] anIntArrayArray3 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "Z")
	private boolean aBoolean65 = false;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "Ljava/lang/String;")
	private String aString10 = "";

	@OriginalMember(owner = "client!client", name = "me", descriptor = "Ljava/lang/String;")
	private String aString11 = "";

	@OriginalMember(owner = "client!client", name = "re", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array5 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "I")
	private int anInt300 = 6;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "Ljava/lang/String;")
	private String aString12 = "";

	@OriginalMember(owner = "client!client", name = "De", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_3 = Class1_Sub1_Sub3.method468();

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "Z")
	private boolean aBoolean66 = false;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "Z")
	private boolean aBoolean67 = true;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array6 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "[I")
	private int[] anIntArray56 = new int[5];

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "Z")
	private boolean aBoolean68 = false;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private int anInt316 = -1;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
	private int anInt318 = 50;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "[I")
	private int[] anIntArray57 = new int[this.anInt318];

	@OriginalMember(owner = "client!client", name = "df", descriptor = "[I")
	private int[] anIntArray58 = new int[this.anInt318];

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "[I")
	private int[] anIntArray59 = new int[this.anInt318];

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "[I")
	private int[] anIntArray60 = new int[this.anInt318];

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "[I")
	private int[] anIntArray61 = new int[this.anInt318];

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "[I")
	private int[] anIntArray62 = new int[this.anInt318];

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "[I")
	private int[] anIntArray63 = new int[this.anInt318];

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray4 = new String[this.anInt318];

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "[I")
	private int[] anIntArray64 = new int[5];

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "I")
	private int anInt321 = 3;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "I")
	private int anInt326 = -1;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "I")
	private int anInt331 = -1;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "Z")
	private boolean aBoolean69 = false;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "I")
	private int anInt333 = 625;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "[I")
	private int[] anIntArray65 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
	private int anInt335 = -5;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "Z")
	private boolean aBoolean70 = false;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "Z")
	private boolean aBoolean72 = false;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "Z")
	private boolean aBoolean73 = false;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
	private int anInt349 = -1;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
	private int anInt350 = 2048;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
	private int anInt351 = 2047;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "[Lclient!ab;")
	private Class1_Sub1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1_Sub1Array1 = new Class1_Sub1_Sub1_Sub1_Sub1[this.anInt350];

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "[I")
	private int[] anIntArray66 = new int[this.anInt350];

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "[I")
	private int[] anIntArray67 = new int[this.anInt350];

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "[Lclient!lb;")
	private Class1_Sub1_Sub3[] aClass1_Sub1_Sub3Array1 = new Class1_Sub1_Sub3[this.anInt350];

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "[I")
	private final int[] anIntArray68 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "Lclient!ob;")
	private Class29 aClass29_2 = new Class29(18783);

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "I")
	private int anInt354 = -1;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
	private int anInt355 = -1;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "[[I")
	private int[][] anIntArrayArray5 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "[I")
	private int[] anIntArray70 = new int[200];

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "Z")
	private boolean aBoolean75 = true;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "I")
	private int anInt362 = 78;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "Z")
	private boolean aBoolean76 = false;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "Z")
	private boolean aBoolean77 = true;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray5 = new String[5];

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "[Z")
	private boolean[] aBooleanArray4 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
	private int anInt365 = -674;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "[I")
	private int[] anIntArray71 = new int[33];

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
	private int anInt371 = -1;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "Ljava/lang/String;")
	private String aString14 = "";

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "[I")
	private int[] anIntArray72 = new int[5];

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "I")
	private int anInt372 = -947;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "I")
	private int anInt374 = -1;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "Z")
	private boolean aBoolean78 = false;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "I")
	private int anInt377 = 3353893;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "[[I")
	private int[][] anIntArrayArray6 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "Z")
	private boolean aBoolean79 = false;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "I")
	private int anInt381 = 2;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "[I")
	private int[] anIntArray75 = new int[151];

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
	private int anInt388 = -294;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "Ljava/lang/String;")
	private String aString15 = "";

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "[I")
	private int[] anIntArray76 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "[I")
	private int[] anIntArray77 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "Z")
	private boolean aBoolean81 = false;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "Z")
	private boolean aBoolean82 = false;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "I")
	private int anInt393 = -405;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "Z")
	private boolean aBoolean84 = false;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "I")
	private int anInt397 = 5063219;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "Z")
	private boolean aBoolean85 = false;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
	private int anInt398 = -1;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "Z")
	private boolean aBoolean86 = false;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "[I")
	private int[] anIntArray78 = new int[33];

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array7 = new Class1_Sub1_Sub2_Sub2[8];

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "[Lclient!jc;")
	private Class19[] aClass19Array1 = new Class19[4];

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
	private int anInt403 = 2301979;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "[J")
	private long[] aLongArray4 = new long[200];

	@OriginalMember(owner = "client!client", name = "li", descriptor = "Z")
	private boolean aBoolean88 = false;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "Lclient!ob;")
	private Class29 aClass29_3 = new Class29(18783);

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "Z")
	private boolean aBoolean89 = false;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "I")
	private final int anInt414 = 100;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "[I")
	private int[] anIntArray82 = new int[100];

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_4 = Class1_Sub1_Sub3.method468();

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "[I")
	private int[] anIntArray83 = new int[7];

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "[I")
	private int[] anIntArray84 = new int[5];

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray6 = new String[200];

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "[I")
	private int[] anIntArray85 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "I")
	private int anInt419 = 31696;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "[I")
	private int[] anIntArray90 = new int[4000];

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "[I")
	private int[] anIntArray91 = new int[4000];

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "I")
	private int anInt422 = 1;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "[I")
	private int[] anIntArray92 = new int[2000];

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "Z")
	private boolean aBoolean91 = false;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
	private int anInt425 = -1;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "Z")
	private boolean aBoolean92 = false;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "B")
	private byte aByte8 = 3;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "[I")
	private int[] anIntArray93 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "Z")
	private boolean aBoolean93 = true;

	static {
		@Pc(81) int local81 = 2;
		@Pc(83) int local83;
		for (local83 = 0; local83 < 32; local83++) {
			anIntArray42[local83] = local81 - 1;
			local81 += local81;
		}
		aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		anIntArrayArray4 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		aBoolean74 = true;
		anIntArray69 = new int[99];
		local81 = 0;
		for (local83 = 0; local83 < 99; local83++) {
			@Pc(377) int local377 = local83 + 1;
			@Pc(390) int local390 = (int) ((double) local377 + Math.pow(2.0D, (double) local377 / 7.0D) * 300.0D);
			local81 += local390;
			anIntArray69[local83] = local81 / 4;
		}
		aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		aBoolean90 = true;
		anInt417 = 1000;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIB)Ljava/lang/String;")
	private static String method119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(10) int local10 = arg0 - arg1;
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
			signlink.reporterror("48079, " + arg0 + ", " + arg1 + ", " + 4 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private static void method129() {
		try {
			Class37.aBoolean221 = true;
			Class1_Sub1_Sub2_Sub1.aBoolean156 = true;
			aBoolean56 = true;
			Class4.aBoolean38 = true;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("22129, " + -12 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 294);
			if (arg0.length == 5) {
				anInt255 = Integer.parseInt(arg0[0]);
				anInt256 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method129();
				} else if (arg0[2].equals("highmem")) {
					method167();
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
				signlink.anInt952 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method84();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private static void method167() {
		try {
			Class37.aBoolean221 = false;
			Class1_Sub1_Sub2_Sub1.aBoolean156 = false;
			aBoolean56 = false;
			Class4.aBoolean38 = false;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("85817, " + true + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)Ljava/lang/String;")
	private static String method196(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(4) boolean local4 = false;
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("91702, " + arg0 + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(II)Ljava/lang/String;")
	private static String method214(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) String local4 = String.valueOf(arg0);
			for (@Pc(18) int local18 = local4.length() - 3; local18 > 0; local18 -= 3) {
				local4 = local4.substring(0, local18) + "," + local4.substring(local18);
			}
			if (local4.length() > 8) {
				local4 = "@gre@" + local4.substring(0, local4.length() - 8) + " million @whi@(" + local4 + ")";
			} else if (local4.length() > 4) {
				local4 = "@cya@" + local4.substring(0, local4.length() - 4) + "K @whi@(" + local4 + ")";
			}
			return " " + local4;
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("18362, " + 30488 + ", " + arg0 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	private void method97() {
		try {
			if (this.anInt280 != 0) {
				@Pc(12) Class1_Sub1_Sub2_Sub4 local12 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(14) int local14 = 0;
				if (this.anInt406 != 0) {
					local14 = 1;
				}
				for (@Pc(21) int local21 = 0; local21 < 100; local21++) {
					if (this.aStringArray2[local21] != null) {
						@Pc(33) int local33 = this.anIntArray32[local21];
						@Pc(38) String local38 = this.aStringArray1[local21];
						@Pc(40) byte local40 = 0;
						if (local38 != null && local38.startsWith("@cr1@")) {
							local38 = local38.substring(5);
							local40 = 1;
						}
						if (local38 != null && local38.startsWith("@cr2@")) {
							local38 = local38.substring(5);
							local40 = 2;
						}
						@Pc(91) int local91;
						if ((local33 == 3 || local33 == 7) && (local33 == 7 || this.anInt408 == 0 || this.anInt408 == 1 && this.method105(local38))) {
							local91 = 329 - local14 * 13;
							local12.method451("From", 0, 4, local91);
							local12.method451("From", 65535, 4, local91 - 1);
							@Pc(117) int local117 = local12.method449("From ", this.aByte6) + 4;
							if (local40 == 1) {
								this.aClass1_Sub1_Sub2_Sub3Array1[0].method418(local117, local91 - 12);
								local117 += 14;
							}
							if (local40 == 2) {
								this.aClass1_Sub1_Sub2_Sub3Array1[1].method418(local117, local91 - 12);
								local117 += 14;
							}
							local12.method451(local38 + ": " + this.aStringArray2[local21], 0, local117, local91);
							local12.method451(local38 + ": " + this.aStringArray2[local21], 65535, local117, local91 - 1);
							local14++;
							if (local14 >= 5) {
								return;
							}
						}
						if (local33 == 5 && this.anInt408 < 2) {
							local91 = 329 - local14 * 13;
							local12.method451(this.aStringArray2[local21], 0, 4, local91);
							local12.method451(this.aStringArray2[local21], 65535, 4, local91 - 1);
							local14++;
							if (local14 >= 5) {
								return;
							}
						}
						if (local33 == 6 && this.anInt408 < 2) {
							local91 = 329 - local14 * 13;
							local12.method451("To " + local38 + ": " + this.aStringArray2[local21], 0, 4, local91);
							local12.method451("To " + local38 + ": " + this.aStringArray2[local21], 65535, 4, local91 - 1);
							local14++;
							if (local14 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(296) RuntimeException local296) {
			signlink.reporterror("90848, " + 4 + ", " + local296.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method98() {
		try {
			this.aClass1_Sub1_Sub2_Sub3_12 = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "titlebox", 0);
			this.aClass1_Sub1_Sub2_Sub3_13 = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "titlebutton", 0);
			this.aClass1_Sub1_Sub2_Sub3Array4 = new Class1_Sub1_Sub2_Sub3[12];
			@Pc(25) int local25 = 0;
			try {
				local25 = Integer.parseInt(this.getParameter("fl_icon"));
			} catch (@Pc(36) Exception local36) {
			}
			@Pc(40) int local40;
			if (local25 == 0) {
				for (local40 = 0; local40 < 12; local40++) {
					this.aClass1_Sub1_Sub2_Sub3Array4[local40] = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "runes", local40);
				}
			} else {
				for (local40 = 0; local40 < 12; local40++) {
					this.aClass1_Sub1_Sub2_Sub3Array4[local40] = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "runes", (local40 & 0x3) + 12);
				}
			}
			this.aClass1_Sub1_Sub2_Sub2_1 = new Class1_Sub1_Sub2_Sub2(128, 265);
			this.aClass1_Sub1_Sub2_Sub2_2 = new Class1_Sub1_Sub2_Sub2(128, 265);
			for (local40 = 0; local40 < 33920; local40++) {
				this.aClass1_Sub1_Sub2_Sub2_1.anIntArray208[local40] = this.aClass35_6.anIntArray231[local40];
			}
			for (@Pc(116) int local116 = 0; local116 < 33920; local116++) {
				this.aClass1_Sub1_Sub2_Sub2_2.anIntArray208[local116] = this.aClass35_7.anIntArray231[local116];
			}
			this.anIntArray87 = new int[256];
			for (@Pc(138) int local138 = 0; local138 < 64; local138++) {
				this.anIntArray87[local138] = local138 * 262144;
			}
			for (@Pc(153) int local153 = 0; local153 < 64; local153++) {
				this.anIntArray87[local153 + 64] = local153 * 1024 + 16711680;
			}
			for (@Pc(172) int local172 = 0; local172 < 64; local172++) {
				this.anIntArray87[local172 + 128] = local172 * 4 + 16776960;
			}
			for (@Pc(191) int local191 = 0; local191 < 64; local191++) {
				this.anIntArray87[local191 + 192] = 16777215;
			}
			this.anIntArray88 = new int[256];
			for (@Pc(210) int local210 = 0; local210 < 64; local210++) {
				this.anIntArray88[local210] = local210 * 1024;
			}
			for (@Pc(225) int local225 = 0; local225 < 64; local225++) {
				this.anIntArray88[local225 + 64] = local225 * 4 + 65280;
			}
			for (@Pc(244) int local244 = 0; local244 < 64; local244++) {
				this.anIntArray88[local244 + 128] = local244 * 262144 + 65535;
			}
			for (@Pc(263) int local263 = 0; local263 < 64; local263++) {
				this.anIntArray88[local263 + 192] = 16777215;
			}
			this.anIntArray89 = new int[256];
			for (@Pc(282) int local282 = 0; local282 < 64; local282++) {
				this.anIntArray89[local282] = local282 * 4;
			}
			for (@Pc(297) int local297 = 0; local297 < 64; local297++) {
				this.anIntArray89[local297 + 64] = local297 * 262144 + 255;
			}
			for (@Pc(316) int local316 = 0; local316 < 64; local316++) {
				this.anIntArray89[local316 + 128] = local316 * 1024 + 16711935;
			}
			for (@Pc(335) int local335 = 0; local335 < 64; local335++) {
				this.anIntArray89[local335 + 192] = 16777215;
			}
			this.anIntArray86 = new int[256];
			this.anIntArray73 = new int[32768];
			this.anIntArray74 = new int[32768];
			this.method173(null);
			this.anIntArray54 = new int[32768];
			this.anIntArray55 = new int[32768];
			this.method96("Connecting to fileserver", 10);
			if (!this.aBoolean79) {
				this.aBoolean91 = true;
				this.aBoolean79 = true;
				this.method95(this, 2);
			}
		} catch (@Pc(392) RuntimeException local392) {
			signlink.reporterror("36579, " + 0 + ", " + local392.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method99() {
		try {
			if (super.anInt210 == 1) {
				if (super.anInt211 >= 6 && super.anInt211 <= 106 && super.anInt212 >= 467 && super.anInt212 <= 499) {
					this.anInt273 = (this.anInt273 + 1) % 4;
					this.aBoolean78 = true;
					this.aBoolean80 = true;
					this.aClass1_Sub1_Sub3_3.method469(158);
					this.aClass1_Sub1_Sub3_3.method470(this.anInt273);
					this.aClass1_Sub1_Sub3_3.method470(this.anInt408);
					this.aClass1_Sub1_Sub3_3.method470(this.anInt324);
				}
				if (super.anInt211 >= 135 && super.anInt211 <= 235 && super.anInt212 >= 467 && super.anInt212 <= 499) {
					this.anInt408 = (this.anInt408 + 1) % 3;
					this.aBoolean78 = true;
					this.aBoolean80 = true;
					this.aClass1_Sub1_Sub3_3.method469(158);
					this.aClass1_Sub1_Sub3_3.method470(this.anInt273);
					this.aClass1_Sub1_Sub3_3.method470(this.anInt408);
					this.aClass1_Sub1_Sub3_3.method470(this.anInt324);
				}
				if (super.anInt211 >= 273 && super.anInt211 <= 373 && super.anInt212 >= 467 && super.anInt212 <= 499) {
					this.anInt324 = (this.anInt324 + 1) % 3;
					this.aBoolean78 = true;
					this.aBoolean80 = true;
					this.aClass1_Sub1_Sub3_3.method469(158);
					this.aClass1_Sub1_Sub3_3.method470(this.anInt273);
					this.aClass1_Sub1_Sub3_3.method470(this.anInt408);
					this.aClass1_Sub1_Sub3_3.method470(this.anInt324);
				}
				if (super.anInt211 >= 412 && super.anInt211 <= 512 && super.anInt212 >= 467 && super.anInt212 <= 499) {
					if (this.anInt218 == -1) {
						this.method210();
						this.aString14 = "";
						this.aBoolean73 = false;
						for (@Pc(195) int local195 = 0; local195 < Class6.aClass6Array1.length; local195++) {
							if (Class6.aClass6Array1[local195] != null && Class6.aClass6Array1[local195].anInt435 == 600) {
								this.anInt241 = this.anInt218 = Class6.aClass6Array1[local195].anInt432;
								return;
							}
						}
						return;
					}
					this.method204("", 0, "Please close the interface you have open before using 'report abuse'");
					return;
				}
			}
		} catch (@Pc(231) RuntimeException local231) {
			signlink.reporterror("11751, " + 423 + ", " + local231.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method100(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			if (this.anInt368 == 0) {
				@Pc(10) int local10 = super.anInt210;
				if (this.anInt269 == 1 && super.anInt211 >= 516 && super.anInt212 >= 160 && super.anInt211 <= 765 && super.anInt212 <= 205) {
					local10 = 0;
				}
				@Pc(41) int local41;
				@Pc(44) int local44;
				@Pc(120) int local120;
				if (this.aBoolean81) {
					if (local10 != 1) {
						local41 = super.anInt205;
						local44 = super.anInt206;
						if (this.anInt236 == 0) {
							local41 -= 4;
							local44 -= 4;
						}
						if (this.anInt236 == 1) {
							local41 -= 553;
							local44 -= 205;
						}
						if (this.anInt236 == 2) {
							local41 -= 17;
							local44 -= 357;
						}
						if (local41 < this.anInt237 - 10 || local41 > this.anInt237 + this.anInt239 + 10 || local44 < this.anInt238 - 10 || local44 > this.anInt238 + this.anInt240 + 10) {
							this.aBoolean81 = false;
							if (this.anInt236 == 1) {
								this.aBoolean85 = true;
							}
							if (this.anInt236 == 2) {
								this.aBoolean80 = true;
							}
						}
					}
					if (local10 == 1) {
						local41 = this.anInt237;
						local44 = this.anInt238;
						local120 = this.anInt239;
						@Pc(123) int local123 = super.anInt211;
						@Pc(126) int local126 = super.anInt212;
						if (this.anInt236 == 0) {
							local123 -= 4;
							local126 -= 4;
						}
						if (this.anInt236 == 1) {
							local123 -= 553;
							local126 -= 205;
						}
						if (this.anInt236 == 2) {
							local123 -= 17;
							local126 -= 357;
						}
						@Pc(145) int local145 = -1;
						for (@Pc(147) int local147 = 0; local147 < this.anInt290; local147++) {
							@Pc(162) int local162 = local44 + (this.anInt290 - 1 - local147) * 15 + 31;
							if (local123 > local41 && local123 < local41 + local120 && local126 > local162 - 13 && local126 < local162 + 3) {
								local145 = local147;
							}
						}
						if (local145 != -1) {
							this.method125(local145);
						}
						this.aBoolean81 = false;
						if (this.anInt236 == 1) {
							this.aBoolean85 = true;
						}
						if (this.anInt236 == 2) {
							this.aBoolean80 = true;
							return;
						}
					}
				} else {
					if (local10 == 1 && this.anInt290 > 0) {
						local41 = this.anIntArray37[this.anInt290 - 1];
						if (local41 == 582 || local41 == 113 || local41 == 555 || local41 == 331 || local41 == 354 || local41 == 694 || local41 == 962 || local41 == 795 || local41 == 681 || local41 == 100 || local41 == 102 || local41 == 1328) {
							local44 = this.anIntArray35[this.anInt290 - 1];
							local120 = this.anIntArray36[this.anInt290 - 1];
							@Pc(282) Class6 local282 = Class6.aClass6Array1[local120];
							if (local282.aBoolean99 || local282.aBoolean102) {
								this.aBoolean66 = false;
								this.anInt299 = 0;
								this.anInt366 = local120;
								this.anInt367 = local44;
								this.anInt368 = 2;
								this.anInt369 = super.anInt211;
								this.anInt370 = super.anInt212;
								if (Class6.aClass6Array1[local120].anInt432 == this.anInt218) {
									this.anInt368 = 1;
								}
								if (Class6.aClass6Array1[local120].anInt432 == this.anInt278) {
									this.anInt368 = 3;
								}
								return;
							}
						}
					}
					if (local10 == 1 && (this.anInt225 == 1 || this.method193(this.anInt290 - 1)) && this.anInt290 > 2) {
						local10 = 2;
					}
					if (local10 == 1 && this.anInt290 > 0) {
						this.method125(this.anInt290 - 1);
					}
					if (local10 != 2 || this.anInt290 <= 0) {
						return;
					}
					this.method219();
				}
			}
		} catch (@Pc(377) RuntimeException local377) {
			signlink.reporterror("23267, " + arg0 + ", " + local377.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method101() {
		try {
			for (@Pc(6) Class1_Sub1_Sub1_Sub4 local6 = (Class1_Sub1_Sub1_Sub4) this.aClass29_2.method511(); local6 != null; local6 = (Class1_Sub1_Sub1_Sub4) this.aClass29_2.method513()) {
				if (local6.anInt464 != this.anInt325 || anInt248 > local6.anInt470) {
					local6.method673();
				} else if (anInt248 >= local6.anInt469) {
					if (local6.anInt473 > 0) {
						@Pc(36) Class1_Sub1_Sub1_Sub1_Sub2 local36 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local6.anInt473 - 1];
						if (local36 != null && local36.anInt1005 >= 0 && local36.anInt1005 < 13312 && local36.anInt1006 >= 0 && local36.anInt1006 < 13312) {
							local6.method241(local36.anInt1006, anInt248, local36.anInt1005, this.method218(local36.anInt1005, local36.anInt1006, local6.anInt464) - local6.anInt468);
						}
					}
					if (local6.anInt473 < 0) {
						@Pc(81) int local81 = -local6.anInt473 - 1;
						@Pc(87) Class1_Sub1_Sub1_Sub1_Sub1 local87;
						if (local81 == this.anInt326) {
							local87 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
						} else {
							local87 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local81];
						}
						if (local87 != null && local87.anInt1005 >= 0 && local87.anInt1005 < 13312 && local87.anInt1006 >= 0 && local87.anInt1006 < 13312) {
							local6.method241(local87.anInt1006, anInt248, local87.anInt1005, this.method218(local87.anInt1005, local87.anInt1006, local6.anInt464) - local6.anInt468);
						}
					}
					local6.method242(this.anInt216);
					this.aClass37_1.method541(60, this.anInt325, (int) local6.aDouble2, -1, local6, (int) local6.aDouble3, (int) local6.aDouble1, local6.anInt474, false);
				}
			}
			anInt376++;
			this.anInt382 += 0;
			if (anInt376 > 1174) {
				anInt376 = 0;
				this.aClass1_Sub1_Sub3_3.method469(63);
				this.aClass1_Sub1_Sub3_3.method470(0);
				@Pc(193) int local193 = this.aClass1_Sub1_Sub3_3.anInt751;
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_3.method471(11499);
				}
				this.aClass1_Sub1_Sub3_3.method471(10548);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_3.method470(139);
				}
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_3.method470(94);
				}
				this.aClass1_Sub1_Sub3_3.method471(51693);
				this.aClass1_Sub1_Sub3_3.method470(16);
				this.aClass1_Sub1_Sub3_3.method471(15036);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_3.method470(65);
				}
				this.aClass1_Sub1_Sub3_3.method470((int) (Math.random() * 256.0D));
				this.aClass1_Sub1_Sub3_3.method471(22990);
				this.aClass1_Sub1_Sub3_3.method479(this.aClass1_Sub1_Sub3_3.anInt751 - local193);
			}
		} catch (@Pc(267) RuntimeException local267) {
			signlink.reporterror("74738, " + 0 + ", " + local267.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method102(@OriginalArg(0) int arg0) {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray54[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray54[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray55[local54] = (this.anIntArray54[local54 - 1] + this.anIntArray54[local54 + 1] + this.anIntArray54[local54 - 128] + this.anIntArray54[local54 + 128]) / 4;
				}
			}
			this.anInt311 += 128;
			@Pc(130) boolean local130 = false;
			if (this.anInt311 > this.anIntArray73.length) {
				this.anInt311 -= this.anIntArray73.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method173(this.aClass1_Sub1_Sub2_Sub3Array4[local48]);
			}
			@Pc(170) int local170;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local170 = local54 + (local48 << 7);
					@Pc(193) int local193 = this.anIntArray55[local170 + 128] - this.anIntArray73[local170 + this.anInt311 & this.anIntArray73.length - 1] / 5;
					if (local193 < 0) {
						local193 = 0;
					}
					this.anIntArray54[local170] = local193;
				}
			}
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray46[local54] = this.anIntArray46[local54 + 1];
			}
			this.anIntArray46[255] = (int) (Math.sin((double) anInt248 / 14.0D) * 16.0D + Math.sin((double) anInt248 / 15.0D) * 14.0D + Math.sin((double) anInt248 / 16.0D) * 12.0D);
			if (this.anInt339 > 0) {
				this.anInt339 -= 4;
			}
			if (this.anInt340 > 0) {
				this.anInt340 -= 4;
			}
			if (this.anInt339 == 0 && this.anInt340 == 0) {
				local170 = (int) (Math.random() * 2000.0D);
				if (local170 == 0) {
					this.anInt339 = 1024;
				}
				if (local170 == 1) {
					this.anInt340 = 1024;
					return;
				}
			}
		} catch (@Pc(304) RuntimeException local304) {
			signlink.reporterror("43640, " + arg0 + ", " + local304.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method103() {
		try {
			if (this.anInt280 != 0) {
				@Pc(5) int local5 = 0;
				if (this.anInt406 != 0) {
					local5 = 1;
				}
				for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
					if (this.aStringArray2[local12] != null) {
						@Pc(24) int local24 = this.anIntArray32[local12];
						@Pc(29) String local29 = this.aStringArray1[local12];
						if (local29 != null && local29.startsWith("@cr1@")) {
							local29 = local29.substring(5);
						}
						if (local29 != null && local29.startsWith("@cr2@")) {
							local29 = local29.substring(5);
						}
						if ((local24 == 3 || local24 == 7) && (local24 == 7 || this.anInt408 == 0 || this.anInt408 == 1 && this.method105(local29))) {
							@Pc(82) int local82 = 329 - local5 * 13;
							if (super.anInt205 > 4 && super.anInt206 - 4 > local82 - 10 && super.anInt206 - 4 <= local82 + 3) {
								@Pc(122) int local122 = this.aClass1_Sub1_Sub2_Sub4_2.method449("From:  " + local29 + this.aStringArray2[local12], this.aByte6) + 25;
								if (local122 > 450) {
									local122 = 450;
								}
								if (super.anInt205 < local122 + 4) {
									if (this.anInt272 >= 1) {
										this.aStringArray3[this.anInt290] = "Report abuse @whi@" + local29;
										this.anIntArray37[this.anInt290] = 2524;
										this.anInt290++;
									}
									this.aStringArray3[this.anInt290] = "Add ignore @whi@" + local29;
									this.anIntArray37[this.anInt290] = 2047;
									this.anInt290++;
									this.aStringArray3[this.anInt290] = "Add friend @whi@" + local29;
									this.anIntArray37[this.anInt290] = 2605;
									this.anInt290++;
								}
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local24 == 5 || local24 == 6) && this.anInt408 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
				this.anInt382 += 0;
			}
		} catch (@Pc(241) RuntimeException local241) {
			signlink.reporterror("1518, " + 0 + ", " + local241.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!lb;II)V")
	private void method104(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(16) int local16;
			@Pc(25) int local25;
			@Pc(32) int local32;
			@Pc(35) int local35;
			@Pc(39) int local39;
			@Pc(43) int local43;
			@Pc(48) int local48;
			@Pc(53) int local53;
			if (arg1 == 99 || arg1 == 131) {
				local16 = arg0.method480();
				local25 = this.anInt319 + (local16 >> 4 & 0x7);
				local32 = this.anInt320 + (local16 & 0x7);
				local35 = arg0.method480();
				local39 = local35 >> 2;
				local43 = local35 & 0x3;
				local48 = this.anIntArray68[local39];
				if (arg1 == 131) {
					local53 = -1;
				} else {
					local53 = arg0.method482();
				}
				if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
					this.method151(local48, 0, local39, this.anInt325, local32, local53, -1, local43, local25);
				}
			} else {
				@Pc(143) int local143;
				@Pc(155) int local155;
				@Pc(169) int local169;
				@Pc(181) int local181;
				if (arg1 == 82) {
					local16 = arg0.method480();
					local25 = this.anInt319 + (local16 >> 4 & 0x7);
					local32 = this.anInt320 + (local16 & 0x7);
					local35 = arg0.method480();
					local39 = local35 >> 2;
					local43 = local35 & 0x3;
					local48 = this.anIntArray68[local39];
					local53 = arg0.method482();
					if (local25 >= 0 && local32 >= 0 && local25 < 103 && local32 < 103) {
						local143 = this.anIntArrayArrayArray5[this.anInt325][local25][local32];
						local155 = this.anIntArrayArrayArray5[this.anInt325][local25 + 1][local32];
						local169 = this.anIntArrayArrayArray5[this.anInt325][local25 + 1][local32 + 1];
						local181 = this.anIntArrayArrayArray5[this.anInt325][local25][local32 + 1];
						if (local48 == 0) {
							@Pc(192) Class34 local192 = this.aClass37_1.method552((byte) 4, local32, local25, this.anInt325);
							if (local192 != null) {
								@Pc(201) int local201 = local192.anInt854 >> 14 & 0x7FFF;
								if (local39 == 2) {
									local192.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(local201, false, local181, local143, 2, local53, local169, local155, -966, local43 + 4);
									local192.aClass1_Sub1_Sub1_8 = new Class1_Sub1_Sub1_Sub2(local201, false, local181, local143, 2, local53, local169, local155, -966, local43 + 1 & 0x3);
								} else {
									local192.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(local201, false, local181, local143, local39, local53, local169, local155, -966, local43);
								}
							}
						}
						if (local48 == 1) {
							@Pc(269) Class14 local269 = this.aClass37_1.method553(this.anInt325, local32, local25);
							if (local269 != null) {
								local269.aClass1_Sub1_Sub1_1 = new Class1_Sub1_Sub1_Sub2(local269.anInt591 >> 14 & 0x7FFF, false, local181, local143, 4, local53, local169, local155, -966, 0);
							}
						}
						if (local48 == 2) {
							@Pc(303) Class31 local303 = this.aClass37_1.method554(local25, this.anInt325, local32);
							if (local39 == 11) {
								local39 = 10;
							}
							if (local303 != null) {
								local303.aClass1_Sub1_Sub1_6 = new Class1_Sub1_Sub1_Sub2(local303.anInt837 >> 14 & 0x7FFF, false, local181, local143, local39, local53, local169, local155, -966, local43);
							}
						}
						if (local48 == 3) {
							@Pc(342) Class18 local342 = this.aClass37_1.method555(local25, local32, this.anInt325);
							if (local342 != null) {
								local342.aClass1_Sub1_Sub1_2 = new Class1_Sub1_Sub1_Sub2(local342.anInt673 >> 14 & 0x7FFF, false, local181, local143, 22, local53, local169, local155, -966, local43);
							}
						}
					}
				} else {
					@Pc(407) Class1_Sub1_Sub1_Sub3 local407;
					if (arg1 == 42) {
						local16 = arg0.method480();
						local25 = this.anInt319 + (local16 >> 4 & 0x7);
						local32 = this.anInt320 + (local16 & 0x7);
						local35 = arg0.method482();
						local39 = arg0.method482();
						if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
							local407 = new Class1_Sub1_Sub1_Sub3();
							local407.anInt189 = local35;
							local407.anInt190 = local39;
							if (this.aClass29ArrayArrayArray1[this.anInt325][local25][local32] == null) {
								this.aClass29ArrayArrayArray1[this.anInt325][local25][local32] = new Class29(18783);
							}
							this.aClass29ArrayArrayArray1[this.anInt325][local25][local32].method508(local407);
							this.method206(local25, local32);
						}
					} else if (arg1 == 139) {
						local16 = arg0.method480();
						local25 = this.anInt319 + (local16 >> 4 & 0x7);
						local32 = this.anInt320 + (local16 & 0x7);
						local35 = arg0.method482();
						if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
							@Pc(497) Class29 local497 = this.aClass29ArrayArrayArray1[this.anInt325][local25][local32];
							if (local497 != null) {
								for (local407 = (Class1_Sub1_Sub1_Sub3) local497.method511(); local407 != null; local407 = (Class1_Sub1_Sub1_Sub3) local497.method513()) {
									if (local407.anInt189 == (local35 & 0x7FFF)) {
										local407.method673();
										break;
									}
								}
								if (local497.method511() == null) {
									this.aClass29ArrayArrayArray1[this.anInt325][local25][local32] = null;
								}
								this.method206(local25, local32);
							}
						}
					} else if (arg1 == 164) {
						local16 = arg0.method480();
						local25 = this.anInt319 + (local16 >> 4 & 0x7);
						local32 = this.anInt320 + (local16 & 0x7);
						local35 = local25 + arg0.method481();
						local39 = local32 + arg0.method481();
						local43 = arg0.method483();
						local48 = arg0.method482();
						local53 = arg0.method480() * 4;
						local143 = arg0.method480() * 4;
						local155 = arg0.method482();
						local169 = arg0.method482();
						local181 = arg0.method480();
						@Pc(600) int local600 = arg0.method480();
						if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104 && local35 >= 0 && local39 >= 0 && local35 < 104 && local39 < 104 && local48 != 65535) {
							local25 = local25 * 128 + 64;
							local32 = local32 * 128 + 64;
							local35 = local35 * 128 + 64;
							local39 = local39 * 128 + 64;
							@Pc(676) Class1_Sub1_Sub1_Sub4 local676 = new Class1_Sub1_Sub1_Sub4(local155 + anInt248, this.anInt325, local25, local32, local169 + anInt248, local48, this.method218(local25, local32, this.anInt325) - local53, local600, local181, 0, local143, local43);
							local676.method241(local39, local155 + anInt248, local35, this.method218(local35, local39, this.anInt325) - local143);
							this.aClass29_2.method508(local676);
						}
					} else if (arg1 == 127) {
						local16 = arg0.method480();
						local25 = this.anInt319 + (local16 >> 4 & 0x7);
						local32 = this.anInt320 + (local16 & 0x7);
						local35 = arg0.method482();
						local39 = arg0.method480();
						local43 = arg0.method482();
						if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
							local25 = local25 * 128 + 64;
							local32 = local32 * 128 + 64;
							@Pc(772) Class1_Sub1_Sub1_Sub6 local772 = new Class1_Sub1_Sub1_Sub6(anInt248, local35, local43, local25, local32, this.method218(local25, local32, this.anInt325) - local39, this.anInt325, true);
							this.aClass29_3.method508(local772);
						}
					} else if (arg1 == 138) {
						local16 = arg0.method480();
						local25 = this.anInt319 + (local16 >> 4 & 0x7);
						local32 = this.anInt320 + (local16 & 0x7);
						local35 = arg0.method482();
						local39 = arg0.method482();
						local43 = arg0.method482();
						if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104 && local43 != this.anInt326) {
							@Pc(826) Class1_Sub1_Sub1_Sub3 local826 = new Class1_Sub1_Sub1_Sub3();
							local826.anInt189 = local35;
							local826.anInt190 = local39;
							if (this.aClass29ArrayArrayArray1[this.anInt325][local25][local32] == null) {
								this.aClass29ArrayArrayArray1[this.anInt325][local25][local32] = new Class29(18783);
							}
							this.aClass29ArrayArrayArray1[this.anInt325][local25][local32].method508(local826);
							this.method206(local25, local32);
						}
					} else {
						if (arg1 == 91) {
							local16 = arg0.method480();
							local25 = this.anInt319 + (local16 >> 4 & 0x7);
							local32 = this.anInt320 + (local16 & 0x7);
							local35 = arg0.method480();
							local39 = local35 >> 2;
							local43 = local35 & 0x3;
							local48 = this.anIntArray68[local39];
							local53 = arg0.method482();
							local143 = arg0.method482();
							local155 = arg0.method482();
							local169 = arg0.method482();
							@Pc(924) byte local924 = arg0.method481();
							@Pc(927) byte local927 = arg0.method481();
							@Pc(930) byte local930 = arg0.method481();
							@Pc(933) byte local933 = arg0.method481();
							@Pc(939) Class1_Sub1_Sub1_Sub1_Sub1 local939;
							if (local169 == this.anInt326) {
								local939 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
							} else {
								local939 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local169];
							}
							if (local939 != null) {
								@Pc(951) Class9 local951 = Class9.method288(local53);
								@Pc(961) int local961 = this.anIntArrayArrayArray5[this.anInt325][local25][local32];
								@Pc(973) int local973 = this.anIntArrayArrayArray5[this.anInt325][local25 + 1][local32];
								@Pc(987) int local987 = this.anIntArrayArrayArray5[this.anInt325][local25 + 1][local32 + 1];
								@Pc(999) int local999 = this.anIntArrayArrayArray5[this.anInt325][local25][local32 + 1];
								@Pc(1009) Class1_Sub1_Sub1_Sub5 local1009 = local951.method294(local39, local43, local961, local973, local987, local999, -1);
								if (local1009 != null) {
									this.method151(local48, local143 + 1, 0, this.anInt325, local32, -1, local155 + 1, 0, local25);
									local939.anInt139 = local143 + anInt248;
									local939.anInt140 = local155 + anInt248;
									local939.aClass1_Sub1_Sub1_Sub5_1 = local1009;
									@Pc(1044) int local1044 = local951.anInt517;
									@Pc(1047) int local1047 = local951.anInt518;
									if (local43 == 1 || local43 == 3) {
										local1044 = local951.anInt518;
										local1047 = local951.anInt517;
									}
									local939.anInt141 = local25 * 128 + local1044 * 64;
									local939.anInt143 = local32 * 128 + local1047 * 64;
									local939.anInt142 = this.method218(local939.anInt141, local939.anInt143, this.anInt325);
									@Pc(1093) byte local1093;
									if (local924 > local930) {
										local1093 = local924;
										local924 = local930;
										local930 = local1093;
									}
									if (local927 > local933) {
										local1093 = local927;
										local927 = local933;
										local933 = local1093;
									}
									local939.anInt144 = local25 + local924;
									local939.anInt146 = local25 + local930;
									local939.anInt145 = local32 + local927;
									local939.anInt147 = local32 + local933;
								}
							}
						}
						if (arg1 == 193) {
							local16 = arg0.method480();
							local25 = this.anInt319 + (local16 >> 4 & 0x7);
							local32 = this.anInt320 + (local16 & 0x7);
							local35 = arg0.method482();
							local39 = arg0.method482();
							local43 = arg0.method482();
							if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
								@Pc(1177) Class29 local1177 = this.aClass29ArrayArrayArray1[this.anInt325][local25][local32];
								if (local1177 != null) {
									for (@Pc(1183) Class1_Sub1_Sub1_Sub3 local1183 = (Class1_Sub1_Sub1_Sub3) local1177.method511(); local1183 != null; local1183 = (Class1_Sub1_Sub1_Sub3) local1177.method513()) {
										if (local1183.anInt189 == (local35 & 0x7FFF) && local1183.anInt190 == local39) {
											local1183.anInt190 = local43;
											break;
										}
									}
									this.method206(local25, local32);
								}
							}
						} else if (arg1 == 196) {
							local16 = arg0.method480();
							local25 = this.anInt319 + (local16 >> 4 & 0x7);
							local32 = this.anInt320 + (local16 & 0x7);
							local35 = arg0.method482();
							local39 = arg0.method480();
							local43 = local39 >> 4 & 0xF;
							local48 = local39 & 0x7;
							if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0] >= local25 - local43 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0] <= local25 + local43 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0] >= local32 - local43 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0] <= local32 + local43 && this.aBoolean93 && !aBoolean56 && this.anInt336 < 50) {
								this.anIntArray49[this.anInt336] = local35;
								this.anIntArray43[this.anInt336] = local48;
								this.anIntArray41[this.anInt336] = Class5.anIntArray29[local35];
								this.anInt336++;
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(1319) RuntimeException local1319) {
			signlink.reporterror("24789, " + arg0 + ", " + arg1 + ", " + -103 + ", " + local1319.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;)Z")
	private boolean method105(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(5) int local5 = 0; local5 < this.anInt231; local5++) {
				if (arg0.equalsIgnoreCase(this.aStringArray6[local5])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("86019, " + 1657 + ", " + arg0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method106() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt394);
			if (this.aClass44_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass44_Sub1_1.anInt977);
			}
			System.out.println("loop-cycle:" + anInt248);
			System.out.println("draw-cycle:" + anInt344);
			System.out.println("ptype:" + this.anInt383);
			System.out.println("psize:" + this.anInt382);
			if (this.aClass8_1 != null) {
				this.aClass8_1.method252();
			}
			super.aBoolean48 = true;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("53001, " + 6 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)Ljava/awt/Component;")
	@Override
	protected Component method94() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("50861, " + 7 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method107() {
		try {
			this.aClass35_27.method524();
			Class1_Sub1_Sub2_Sub1.anIntArray180 = this.anIntArray79;
			this.aClass1_Sub1_Sub2_Sub3_3.method418(0, 0);
			if (this.aBoolean82) {
				this.aClass1_Sub1_Sub2_Sub4_3.method447(0, 40, 239, this.aString8);
				this.aClass1_Sub1_Sub2_Sub4_3.method447(128, 60, 239, this.aString12 + "*");
			} else if (this.aBoolean60) {
				this.aClass1_Sub1_Sub2_Sub4_3.method447(0, 40, 239, "Enter amount:");
				this.aClass1_Sub1_Sub2_Sub4_3.method447(128, 60, 239, this.aString17 + "*");
			} else if (this.aString9 != null) {
				this.aClass1_Sub1_Sub2_Sub4_3.method447(0, 40, 239, this.aString9);
				this.aClass1_Sub1_Sub2_Sub4_3.method447(128, 60, 239, "Click to continue");
			} else if (this.anInt278 != -1) {
				this.method203(0, 0, Class6.aClass6Array1[this.anInt278], 0);
			} else if (this.anInt349 == -1) {
				@Pc(133) Class1_Sub1_Sub2_Sub4 local133 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(135) int local135 = 0;
				Class1_Sub1_Sub2.method436(0, 0, 463, 77);
				for (@Pc(143) int local143 = 0; local143 < 100; local143++) {
					if (this.aStringArray2[local143] != null) {
						@Pc(155) int local155 = this.anIntArray32[local143];
						@Pc(164) int local164 = this.anInt420 + 70 - local135 * 14;
						@Pc(169) String local169 = this.aStringArray1[local143];
						@Pc(171) byte local171 = 0;
						if (local169 != null && local169.startsWith("@cr1@")) {
							local169 = local169.substring(5);
							local171 = 1;
						}
						if (local169 != null && local169.startsWith("@cr2@")) {
							local169 = local169.substring(5);
							local171 = 2;
						}
						if (local155 == 0) {
							if (local164 > 0 && local164 < 110) {
								local133.method451(this.aStringArray2[local143], 0, 4, local164);
							}
							local135++;
						}
						@Pc(241) int local241;
						if ((local155 == 1 || local155 == 2) && (local155 == 1 || this.anInt273 == 0 || this.anInt273 == 1 && this.method105(local169))) {
							if (local164 > 0 && local164 < 110) {
								local241 = 4;
								if (local171 == 1) {
									this.aClass1_Sub1_Sub2_Sub3Array1[0].method418(4, local164 - 12);
									local241 += 14;
								}
								if (local171 == 2) {
									this.aClass1_Sub1_Sub2_Sub3Array1[1].method418(local241, local164 - 12);
									local241 += 14;
								}
								local133.method451(local169 + ":", 0, local241, local164);
								local241 += local133.method449(local169, this.aByte6) + 8;
								local133.method451(this.aStringArray2[local143], 255, local241, local164);
							}
							local135++;
						}
						if ((local155 == 3 || local155 == 7) && this.anInt280 == 0 && (local155 == 7 || this.anInt408 == 0 || this.anInt408 == 1 && this.method105(local169))) {
							if (local164 > 0 && local164 < 110) {
								local133.method451("From", 0, 4, local164);
								local241 = local133.method449("From ", this.aByte6) + 4;
								if (local171 == 1) {
									this.aClass1_Sub1_Sub2_Sub3Array1[0].method418(local241, local164 - 12);
									local241 += 14;
								}
								if (local171 == 2) {
									this.aClass1_Sub1_Sub2_Sub3Array1[1].method418(local241, local164 - 12);
									local241 += 14;
								}
								local133.method451(local169 + ":", 0, local241, local164);
								local241 += local133.method449(local169, this.aByte6) + 8;
								local133.method451(this.aStringArray2[local143], 8388608, local241, local164);
							}
							local135++;
						}
						if (local155 == 4 && (this.anInt324 == 0 || this.anInt324 == 1 && this.method105(local169))) {
							if (local164 > 0 && local164 < 110) {
								local133.method451(local169 + " " + this.aStringArray2[local143], 8388736, 4, local164);
							}
							local135++;
						}
						if (local155 == 5 && this.anInt280 == 0 && this.anInt408 < 2) {
							if (local164 > 0 && local164 < 110) {
								local133.method451(this.aStringArray2[local143], 8388608, 4, local164);
							}
							local135++;
						}
						if (local155 == 6 && this.anInt280 == 0 && this.anInt408 < 2) {
							if (local164 > 0 && local164 < 110) {
								local133.method451("To " + local169 + ":", 0, 4, local164);
								local133.method451(this.aStringArray2[local143], 8388608, local133.method449("To " + local169, this.aByte6) + 12, local164);
							}
							local135++;
						}
						if (local155 == 8 && (this.anInt324 == 0 || this.anInt324 == 1 && this.method105(local169))) {
							if (local164 > 0 && local164 < 110) {
								local133.method451(local169 + " " + this.aStringArray2[local143], 8270336, 4, local164);
							}
							local135++;
						}
					}
				}
				Class1_Sub1_Sub2.method435();
				this.anInt362 = local135 * 14 + 7;
				if (this.anInt362 < 78) {
					this.anInt362 = 78;
				}
				this.method122(77, 463, this.anInt362, this.anInt362 - this.anInt420 - 77, 0);
				@Pc(615) String local615;
				if (aClass1_Sub1_Sub1_Sub1_Sub1_1 == null || aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3 == null) {
					local615 = Class48.method671(this.aString10);
				} else {
					local615 = aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3;
				}
				local133.method451(local615 + ":", 0, 4, 90);
				local133.method451(this.aString15 + "*", 255, local133.method449(local615 + ": ", this.aByte6) + 6, 90);
				Class1_Sub1_Sub2.method442(77, 0, 479, (byte) 6, 0);
			} else {
				this.method203(0, 0, Class6.aClass6Array1[this.anInt349], 0);
			}
			if (this.aBoolean81 && this.anInt236 == 2) {
				this.method230(711);
			}
			this.aClass35_27.method525(17, 357, (byte) 3, super.aGraphics2);
			this.aClass35_26.method524();
			Class1_Sub1_Sub2_Sub1.anIntArray180 = this.anIntArray81;
		} catch (@Pc(697) RuntimeException local697) {
			signlink.reporterror("64899, " + true + ", " + local697.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) boolean local5 = false;
			if (!aBoolean56) {
				@Pc(16) Class1_Sub1_Sub2_Sub3 local16;
				@Pc(24) int local24;
				@Pc(32) int local32;
				@Pc(35) byte[] local35;
				@Pc(38) byte[] local38;
				@Pc(40) int local40;
				if (Class1_Sub1_Sub2_Sub1.anIntArray182[17] >= arg0) {
					local16 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[17];
					local24 = local16.anInt688 * local16.anInt689 - 1;
					local32 = local16.anInt688 * this.anInt216 * 2;
					local35 = local16.aByteArray7;
					local38 = this.aByteArray2;
					for (local40 = 0; local40 <= local24; local40++) {
						local38[local40] = local35[local40 - local32 & local24];
					}
					local16.aByteArray7 = local38;
					this.aByteArray2 = local35;
					Class1_Sub1_Sub2_Sub1.method349(17);
				}
				if (Class1_Sub1_Sub2_Sub1.anIntArray182[24] >= arg0) {
					local16 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[24];
					local24 = local16.anInt688 * local16.anInt689 - 1;
					local32 = local16.anInt688 * this.anInt216 * 2;
					local35 = local16.aByteArray7;
					local38 = this.aByteArray2;
					for (local40 = 0; local40 <= local24; local40++) {
						local38[local40] = local35[local40 - local32 & local24];
					}
					local16.aByteArray7 = local38;
					this.aByteArray2 = local35;
					Class1_Sub1_Sub2_Sub1.method349(24);
					return;
				}
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("92106, " + arg0 + ", " + arg1 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method109() {
		try {
			if (this.aClass35_27 == null) {
				this.method147();
				super.aClass35_2 = null;
				this.aClass35_3 = null;
				this.aClass35_4 = null;
				this.aClass35_5 = null;
				this.aClass35_6 = null;
				this.aClass35_7 = null;
				this.aClass35_8 = null;
				this.aClass35_9 = null;
				this.aClass35_10 = null;
				this.aClass35_11 = null;
				this.aClass35_27 = new Class35(false, this.method94(), 479, 96);
				this.aClass35_25 = new Class35(false, this.method94(), 172, 156);
				Class1_Sub1_Sub2.method437();
				this.aClass1_Sub1_Sub2_Sub3_2.method418(0, 0);
				this.aClass35_24 = new Class35(false, this.method94(), 190, 261);
				this.aClass35_26 = new Class35(false, this.method94(), 512, 334);
				Class1_Sub1_Sub2.method437();
				this.aClass35_21 = new Class35(false, this.method94(), 496, 50);
				this.aClass35_22 = new Class35(false, this.method94(), 269, 37);
				this.aClass35_23 = new Class35(false, this.method94(), 249, 45);
				this.aBoolean69 = true;
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("57447, " + 1 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method110() {
		try {
			if (super.anInt210 == 1) {
				if (super.anInt211 >= 539 && super.anInt211 <= 573 && super.anInt212 >= 169 && super.anInt212 < 205 && this.anIntArray85[0] != -1) {
					this.aBoolean85 = true;
					this.anInt321 = 0;
					this.aBoolean62 = true;
				}
				if (super.anInt211 >= 569 && super.anInt211 <= 599 && super.anInt212 >= 168 && super.anInt212 < 205 && this.anIntArray85[1] != -1) {
					this.aBoolean85 = true;
					this.anInt321 = 1;
					this.aBoolean62 = true;
				}
				if (super.anInt211 >= 597 && super.anInt211 <= 627 && super.anInt212 >= 168 && super.anInt212 < 205 && this.anIntArray85[2] != -1) {
					this.aBoolean85 = true;
					this.anInt321 = 2;
					this.aBoolean62 = true;
				}
				if (super.anInt211 >= 625 && super.anInt211 <= 669 && super.anInt212 >= 168 && super.anInt212 < 203 && this.anIntArray85[3] != -1) {
					this.aBoolean85 = true;
					this.anInt321 = 3;
					this.aBoolean62 = true;
				}
				if (super.anInt211 >= 666 && super.anInt211 <= 696 && super.anInt212 >= 168 && super.anInt212 < 205 && this.anIntArray85[4] != -1) {
					this.aBoolean85 = true;
					this.anInt321 = 4;
					this.aBoolean62 = true;
				}
				if (super.anInt211 >= 694 && super.anInt211 <= 724 && super.anInt212 >= 168 && super.anInt212 < 205 && this.anIntArray85[5] != -1) {
					this.aBoolean85 = true;
					this.anInt321 = 5;
					this.aBoolean62 = true;
				}
				if (super.anInt211 >= 722 && super.anInt211 <= 756 && super.anInt212 >= 169 && super.anInt212 < 205 && this.anIntArray85[6] != -1) {
					this.aBoolean85 = true;
					this.anInt321 = 6;
					this.aBoolean62 = true;
				}
				if (super.anInt211 >= 540 && super.anInt211 <= 574 && super.anInt212 >= 466 && super.anInt212 < 502 && this.anIntArray85[7] != -1) {
					this.aBoolean85 = true;
					this.anInt321 = 7;
					this.aBoolean62 = true;
				}
				if (super.anInt211 >= 572 && super.anInt211 <= 602 && super.anInt212 >= 466 && super.anInt212 < 503 && this.anIntArray85[8] != -1) {
					this.aBoolean85 = true;
					this.anInt321 = 8;
					this.aBoolean62 = true;
				}
				if (super.anInt211 >= 599 && super.anInt211 <= 629 && super.anInt212 >= 466 && super.anInt212 < 503 && this.anIntArray85[9] != -1) {
					this.aBoolean85 = true;
					this.anInt321 = 9;
					this.aBoolean62 = true;
				}
				if (super.anInt211 >= 627 && super.anInt211 <= 671 && super.anInt212 >= 467 && super.anInt212 < 502 && this.anIntArray85[10] != -1) {
					this.aBoolean85 = true;
					this.anInt321 = 10;
					this.aBoolean62 = true;
				}
				if (super.anInt211 >= 669 && super.anInt211 <= 699 && super.anInt212 >= 466 && super.anInt212 < 503 && this.anIntArray85[11] != -1) {
					this.aBoolean85 = true;
					this.anInt321 = 11;
					this.aBoolean62 = true;
				}
				if (super.anInt211 >= 696 && super.anInt211 <= 726 && super.anInt212 >= 466 && super.anInt212 < 503 && this.anIntArray85[12] != -1) {
					this.aBoolean85 = true;
					this.anInt321 = 12;
					this.aBoolean62 = true;
				}
				if (super.anInt211 >= 724 && super.anInt211 <= 758 && super.anInt212 >= 466 && super.anInt212 < 502 && this.anIntArray85[13] != -1) {
					this.aBoolean85 = true;
					this.anInt321 = 13;
					this.aBoolean62 = true;
					return;
				}
			}
		} catch (@Pc(445) RuntimeException local445) {
			signlink.reporterror("17247, " + -100 + ", " + local445.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method111() {
		try {
			@Pc(7) byte[] local7 = this.aClass47_1.method666("title.dat", null);
			@Pc(13) Class1_Sub1_Sub2_Sub2 local13 = new Class1_Sub1_Sub2_Sub2(local7, this);
			this.aClass35_6.method524();
			local13.method389(0, 0);
			this.aClass35_7.method524();
			local13.method389(0, -637);
			this.aClass35_3.method524();
			local13.method389(0, -128);
			this.aClass35_4.method524();
			local13.method389(-371, -202);
			this.aClass35_5.method524();
			local13.method389(-171, -202);
			this.aClass35_8.method524();
			local13.method389(-265, 0);
			this.aClass35_9.method524();
			local13.method389(-265, -562);
			this.aClass35_10.method524();
			local13.method389(-171, -128);
			this.aClass35_11.method524();
			local13.method389(-171, -562);
			@Pc(98) int[] local98 = new int[local13.anInt664];
			for (@Pc(100) int local100 = 0; local100 < local13.anInt665; local100++) {
				for (@Pc(104) int local104 = 0; local104 < local13.anInt664; local104++) {
					local98[local104] = local13.anIntArray208[local13.anInt664 + local13.anInt664 * local100 - local104 - 1];
				}
				for (@Pc(130) int local130 = 0; local130 < local13.anInt664; local130++) {
					local13.anIntArray208[local130 + local13.anInt664 * local100] = local98[local130];
				}
			}
			this.aClass35_6.method524();
			local13.method389(0, 382);
			this.aClass35_7.method524();
			local13.method389(0, -255);
			this.aClass35_3.method524();
			local13.method389(0, 254);
			this.aClass35_4.method524();
			local13.method389(-371, 180);
			this.aClass35_5.method524();
			local13.method389(-171, 180);
			this.aClass35_8.method524();
			local13.method389(-265, 382);
			this.aClass35_9.method524();
			local13.method389(-265, -180);
			this.aClass35_10.method524();
			local13.method389(-171, 254);
			this.aClass35_11.method524();
			local13.method389(-171, -180);
			local13 = new Class1_Sub1_Sub2_Sub2(this.aClass47_1, "logo", 0);
			this.anInt382 += 0;
			this.aClass35_3.method524();
			local13.method391(382 - local13.anInt664 / 2 - 128, 18);
			System.gc();
		} catch (@Pc(274) RuntimeException local274) {
			signlink.reporterror("45937, " + 0 + ", " + local274.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)Z")
	private boolean method112() {
		try {
			if (this.aClass8_1 == null) {
				return false;
			}
			@Pc(2676) String local2676;
			@Pc(205) int local205;
			try {
				@Pc(19) int local19 = this.aClass8_1.method249();
				if (local19 == 0) {
					return false;
				}
				if (this.anInt383 == -1) {
					this.aClass8_1.method250(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, 1);
					this.anInt383 = this.aClass1_Sub1_Sub3_4.aByteArray9[0] & 0xFF;
					if (this.aClass46_1 != null) {
						this.anInt383 = this.anInt383 - this.aClass46_1.method662() & 0xFF;
					}
					this.anInt382 = Class17.anIntArray210[this.anInt383];
					local19--;
				}
				if (this.anInt382 == -1) {
					if (local19 <= 0) {
						return false;
					}
					this.aClass8_1.method250(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, 1);
					this.anInt382 = this.aClass1_Sub1_Sub3_4.aByteArray9[0] & 0xFF;
					local19--;
				}
				if (this.anInt382 == -2) {
					if (local19 <= 1) {
						return false;
					}
					this.aClass8_1.method250(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, 2);
					this.aClass1_Sub1_Sub3_4.anInt751 = 0;
					this.anInt382 = this.aClass1_Sub1_Sub3_4.method482();
					local19 -= 2;
				}
				if (local19 < this.anInt382) {
					return false;
				}
				this.aClass1_Sub1_Sub3_4.anInt751 = 0;
				this.aClass8_1.method250(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, this.anInt382);
				this.anInt384 = 0;
				this.anInt277 = this.anInt276;
				this.anInt276 = this.anInt275;
				this.anInt275 = this.anInt383;
				@Pc(163) int local163;
				if (this.anInt383 == 29) {
					local163 = this.aClass1_Sub1_Sub3_4.method483();
					this.anInt349 = local163;
					this.aBoolean80 = true;
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 65) {
					this.anInt319 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt320 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 247) {
					local163 = this.aClass1_Sub1_Sub3_4.method482();
					local205 = this.aClass1_Sub1_Sub3_4.method480();
					if (local163 == 65535) {
						local163 = -1;
					}
					this.anIntArray85[local205] = local163;
					this.aBoolean85 = true;
					this.aBoolean62 = true;
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 171) {
					this.anInt425 = this.aClass1_Sub1_Sub3_4.method480();
					if (this.anInt425 == this.anInt321) {
						if (this.anInt425 == 3) {
							this.anInt321 = 1;
						} else {
							this.anInt321 = 3;
						}
						this.aBoolean85 = true;
					}
					this.anInt383 = -1;
					return true;
				}
				@Pc(276) int local276;
				@Pc(280) int local280;
				if (this.anInt383 == 246) {
					local163 = this.aClass1_Sub1_Sub3_4.method480();
					local205 = this.aClass1_Sub1_Sub3_4.method480();
					local276 = this.aClass1_Sub1_Sub3_4.method480();
					local280 = this.aClass1_Sub1_Sub3_4.method480();
					this.aBooleanArray3[local163] = true;
					this.anIntArray84[local163] = local205;
					this.anIntArray39[local163] = local276;
					this.anIntArray56[local163] = local280;
					this.anIntArray64[local163] = 0;
					this.anInt383 = -1;
					return true;
				}
				@Pc(322) String local322;
				if (this.anInt383 == 13) {
					local163 = this.aClass1_Sub1_Sub3_4.method482();
					local322 = this.aClass1_Sub1_Sub3_4.method487();
					Class6.aClass6Array1[local163].aString18 = local322;
					if (Class6.aClass6Array1[local163].anInt432 == this.anIntArray85[this.anInt321]) {
						this.aBoolean85 = true;
					}
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 213) {
					this.anInt323 = this.aClass1_Sub1_Sub3_4.method480();
					if (this.anInt323 == 1) {
						this.anInt413 = this.aClass1_Sub1_Sub3_4.method482();
					}
					if (this.anInt323 >= 2 && this.anInt323 <= 6) {
						if (this.anInt323 == 2) {
							this.anInt305 = 64;
							this.anInt306 = 64;
						}
						if (this.anInt323 == 3) {
							this.anInt305 = 0;
							this.anInt306 = 64;
						}
						if (this.anInt323 == 4) {
							this.anInt305 = 128;
							this.anInt306 = 64;
						}
						if (this.anInt323 == 5) {
							this.anInt305 = 64;
							this.anInt306 = 0;
						}
						if (this.anInt323 == 6) {
							this.anInt305 = 64;
							this.anInt306 = 128;
						}
						this.anInt323 = 2;
						this.anInt302 = this.aClass1_Sub1_Sub3_4.method482();
						this.anInt303 = this.aClass1_Sub1_Sub3_4.method482();
						this.anInt304 = this.aClass1_Sub1_Sub3_4.method480();
					}
					if (this.anInt323 == 10) {
						this.anInt253 = this.aClass1_Sub1_Sub3_4.method482();
					}
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 7) {
					this.aBoolean82 = false;
					this.aBoolean60 = true;
					this.aString17 = "";
					this.aBoolean80 = true;
					this.anInt383 = -1;
					return true;
				}
				@Pc(495) int local495;
				@Pc(516) int local516;
				@Pc(493) boolean local493;
				@Pc(562) String local562;
				@Pc(483) long local483;
				if (this.anInt383 == 74) {
					local483 = this.aClass1_Sub1_Sub3_4.method486();
					local276 = this.aClass1_Sub1_Sub3_4.method485();
					local280 = this.aClass1_Sub1_Sub3_4.method480();
					local493 = false;
					for (local495 = 0; local495 < 100; local495++) {
						if (this.anIntArray82[local495] == local276) {
							local493 = true;
							break;
						}
					}
					if (local280 <= 1) {
						for (local516 = 0; local516 < this.anInt407; local516++) {
							if (this.aLongArray3[local516] == local483) {
								local493 = true;
								break;
							}
						}
					}
					if (!local493 && this.anInt396 == 0) {
						try {
							this.anIntArray82[this.anInt356] = local276;
							this.anInt356 = (this.anInt356 + 1) % 100;
							local562 = Class49.method683(this.anInt382 - 13, this.aClass1_Sub1_Sub3_4);
							local562 = Class42.method604((byte) 1, local562);
							if (local280 == 2 || local280 == 3) {
								this.method204("@cr2@" + Class48.method671(Class48.method668(this.anInt419, local483)), 7, local562);
							} else if (local280 == 1) {
								this.method204("@cr1@" + Class48.method671(Class48.method668(this.anInt419, local483)), 7, local562);
							} else {
								this.method204(Class48.method671(Class48.method668(this.anInt419, local483)), 3, local562);
							}
						} catch (@Pc(626) Exception local626) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 22) {
					local163 = this.aClass1_Sub1_Sub3_4.method482();
					local205 = this.aClass1_Sub1_Sub3_4.method483();
					local276 = this.aClass1_Sub1_Sub3_4.method483();
					@Pc(654) Class6 local654 = Class6.aClass6Array1[local163];
					local654.anInt438 = local205;
					local654.anInt439 = local276;
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 79) {
					this.anInt232 = this.aClass1_Sub1_Sub3_4.method480();
					this.aBoolean85 = true;
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 182) {
					local163 = this.aClass1_Sub1_Sub3_4.method482();
					@Pc(694) byte local694 = this.aClass1_Sub1_Sub3_4.method481();
					this.anIntArray92[local163] = local694;
					if (this.anIntArray45[local163] != local694) {
						this.anIntArray45[local163] = local694;
						this.method130(local163);
						this.aBoolean85 = true;
						if (this.anInt349 != -1) {
							this.aBoolean80 = true;
						}
					}
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 87) {
					local163 = this.aClass1_Sub1_Sub3_4.method482();
					this.method207(local163, (byte) 5);
					if (this.anInt278 != -1) {
						this.anInt278 = -1;
						this.aBoolean80 = true;
					}
					if (this.aBoolean60) {
						this.aBoolean60 = false;
						this.aBoolean80 = true;
					}
					this.anInt279 = local163;
					this.aBoolean85 = true;
					this.aBoolean62 = true;
					this.anInt218 = -1;
					this.aBoolean63 = false;
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 140) {
					this.method143(this.aClass1_Sub1_Sub3_4, this.anInt382, (byte) 2);
					this.aBoolean58 = false;
					this.anInt383 = -1;
					return true;
				}
				@Pc(828) int local828;
				@Pc(814) Class6 local814;
				if (this.anInt383 == 81) {
					this.aBoolean85 = true;
					local163 = this.aClass1_Sub1_Sub3_4.method482();
					local814 = Class6.aClass6Array1[local163];
					while (this.aClass1_Sub1_Sub3_4.anInt751 < this.anInt382) {
						local276 = this.aClass1_Sub1_Sub3_4.method494();
						local280 = this.aClass1_Sub1_Sub3_4.method482();
						local828 = this.aClass1_Sub1_Sub3_4.method480();
						if (local828 == 255) {
							local828 = this.aClass1_Sub1_Sub3_4.method485();
						}
						if (local276 >= 0 && local276 < local814.anIntArray94.length) {
							local814.anIntArray94[local276] = local280;
							local814.anIntArray95[local276] = local828;
						}
					}
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 1) {
					this.anInt406 = this.aClass1_Sub1_Sub3_4.method482() * 30;
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 195) {
					this.anInt391 = 0;
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 90) {
					local163 = this.aClass1_Sub1_Sub3_4.method482();
					if (local163 == 65535) {
						local163 = -1;
					}
					if (local163 != this.anInt398 && this.aBoolean61 && !aBoolean56 && this.anInt228 == 0) {
						this.anInt361 = local163;
						this.aBoolean75 = true;
						this.aClass44_Sub1_1.method645(2, this.anInt361);
					}
					this.anInt398 = local163;
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 84) {
					local163 = this.aClass1_Sub1_Sub3_4.method482();
					local205 = this.aClass1_Sub1_Sub3_4.method482();
					if (this.aBoolean61 && !aBoolean56) {
						this.anInt361 = local163;
						this.aBoolean75 = false;
						this.aClass44_Sub1_1.method645(2, this.anInt361);
						this.anInt228 = local205;
					}
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 154) {
					local163 = this.aClass1_Sub1_Sub3_4.method482();
					local205 = this.aClass1_Sub1_Sub3_4.method480();
					local276 = this.aClass1_Sub1_Sub3_4.method482();
					if (this.aBoolean93 && !aBoolean56 && this.anInt336 < 50) {
						this.anIntArray49[this.anInt336] = local163;
						this.anIntArray43[this.anInt336] = local205;
						this.anIntArray41[this.anInt336] = local276 + Class5.anIntArray29[local163];
						this.anInt336++;
					}
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 214) {
					local163 = this.aClass1_Sub1_Sub3_4.method482();
					local205 = this.aClass1_Sub1_Sub3_4.method485();
					this.anIntArray92[local163] = local205;
					if (this.anIntArray45[local163] != local205) {
						this.anIntArray45[local163] = local205;
						this.method130(local163);
						this.aBoolean85 = true;
						if (this.anInt349 != -1) {
							this.aBoolean80 = true;
						}
					}
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 219) {
					this.aBoolean76 = false;
					for (local163 = 0; local163 < 5; local163++) {
						this.aBooleanArray3[local163] = false;
					}
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 153) {
					this.anInt402 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 220) {
					local163 = this.aClass1_Sub1_Sub3_4.method482();
					local205 = this.aClass1_Sub1_Sub3_4.method482();
					Class6.aClass6Array1[local163].anInt450 = 2;
					Class6.aClass6Array1[local163].anInt451 = local205;
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 23) {
					local163 = this.aClass1_Sub1_Sub3_4.method482();
					@Pc(1161) boolean local1161 = this.aClass1_Sub1_Sub3_4.method480() == 1;
					Class6.aClass6Array1[local163].aBoolean97 = local1161;
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 108) {
					local163 = this.aClass1_Sub1_Sub3_4.method482();
					Class6.aClass6Array1[local163].anInt450 = 3;
					if (aClass1_Sub1_Sub1_Sub1_Sub1_1.aClass13_1 == null) {
						Class6.aClass6Array1[local163].anInt451 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray14[0] << 25) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray14[4] << 20) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[0] << 15) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[8] << 10) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[11] << 5) + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[1];
					} else {
						Class6.aClass6Array1[local163].anInt451 = (int) (aClass1_Sub1_Sub1_Sub1_Sub1_1.aClass13_1.aLong23 + 305419896L);
					}
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 77) {
					this.anInt407 = this.anInt382 / 8;
					for (local163 = 0; local163 < this.anInt407; local163++) {
						this.aLongArray3[local163] = this.aClass1_Sub1_Sub3_4.method486();
					}
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 85) {
					this.anInt326 = this.aClass1_Sub1_Sub3_4.method482();
					this.anInt423 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 142) {
					this.anInt319 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt320 = this.aClass1_Sub1_Sub3_4.method480();
					while (this.aClass1_Sub1_Sub3_4.anInt751 < this.anInt382) {
						local163 = this.aClass1_Sub1_Sub3_4.method480();
						this.method104(this.aClass1_Sub1_Sub3_4, local163);
					}
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 111) {
					local163 = this.aClass1_Sub1_Sub3_4.method482();
					local205 = this.aClass1_Sub1_Sub3_4.method482();
					if (this.anInt278 != -1) {
						this.anInt278 = -1;
						this.aBoolean80 = true;
					}
					if (this.aBoolean60) {
						this.aBoolean60 = false;
						this.aBoolean80 = true;
					}
					this.anInt218 = local163;
					this.anInt279 = local205;
					this.aBoolean85 = true;
					this.aBoolean62 = true;
					this.aBoolean63 = false;
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 191) {
					local163 = this.aClass1_Sub1_Sub3_4.method482();
					this.method207(local163, (byte) 5);
					if (this.anInt279 != -1) {
						this.anInt279 = -1;
						this.aBoolean85 = true;
						this.aBoolean62 = true;
					}
					if (this.anInt278 != -1) {
						this.anInt278 = -1;
						this.aBoolean80 = true;
					}
					if (this.aBoolean60) {
						this.aBoolean60 = false;
						this.aBoolean80 = true;
					}
					this.anInt218 = local163;
					this.aBoolean63 = false;
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 165) {
					if (this.anInt279 != -1) {
						this.anInt279 = -1;
						this.aBoolean85 = true;
						this.aBoolean62 = true;
					}
					if (this.anInt278 != -1) {
						this.anInt278 = -1;
						this.aBoolean80 = true;
					}
					if (this.aBoolean60) {
						this.aBoolean60 = false;
						this.aBoolean80 = true;
					}
					this.anInt218 = -1;
					this.aBoolean63 = false;
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 24) {
					if (this.anInt321 == 12) {
						this.aBoolean85 = true;
					}
					this.anInt291 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt383 = -1;
					return true;
				}
				@Pc(1666) int local1666;
				if (this.anInt383 == 106) {
					local483 = this.aClass1_Sub1_Sub3_4.method486();
					local276 = this.aClass1_Sub1_Sub3_4.method480();
					@Pc(1529) String local1529 = Class48.method671(Class48.method668(this.anInt419, local483));
					for (local828 = 0; local828 < this.anInt231; local828++) {
						if (local483 == this.aLongArray4[local828]) {
							if (this.anIntArray70[local828] != local276) {
								this.anIntArray70[local828] = local276;
								this.aBoolean85 = true;
								if (local276 > 0) {
									this.method204("", 5, local1529 + " has logged in.");
								}
								if (local276 == 0) {
									this.method204("", 5, local1529 + " has logged out.");
								}
							}
							local1529 = null;
							break;
						}
					}
					if (local1529 != null && this.anInt231 < 200) {
						this.aLongArray4[this.anInt231] = local483;
						this.aStringArray6[this.anInt231] = local1529;
						this.anIntArray70[this.anInt231] = local276;
						this.anInt231++;
						this.aBoolean85 = true;
					}
					@Pc(1627) boolean local1627 = false;
					while (!local1627) {
						local1627 = true;
						for (local516 = 0; local516 < this.anInt231 - 1; local516++) {
							if (this.anIntArray70[local516] != anInt255 && this.anIntArray70[local516 + 1] == anInt255 || this.anIntArray70[local516] == 0 && this.anIntArray70[local516 + 1] != 0) {
								local1666 = this.anIntArray70[local516];
								this.anIntArray70[local516] = this.anIntArray70[local516 + 1];
								this.anIntArray70[local516 + 1] = local1666;
								@Pc(1688) String local1688 = this.aStringArray6[local516];
								this.aStringArray6[local516] = this.aStringArray6[local516 + 1];
								this.aStringArray6[local516 + 1] = local1688;
								@Pc(1710) long local1710 = this.aLongArray4[local516];
								this.aLongArray4[local516] = this.aLongArray4[local516 + 1];
								this.aLongArray4[local516 + 1] = local1710;
								this.aBoolean85 = true;
								local1627 = false;
							}
						}
					}
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 68) {
					this.anInt342 = this.aClass1_Sub1_Sub3_4.method485();
					this.anInt343 = this.aClass1_Sub1_Sub3_4.method482();
					this.anInt378 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt338 = this.aClass1_Sub1_Sub3_4.method482();
					this.anInt379 = this.aClass1_Sub1_Sub3_4.method480();
					if (this.anInt342 != 0 && this.anInt218 == -1) {
						signlink.dnslookup(Class48.method670(this.anInt342));
						this.method210();
						@Pc(1792) short local1792 = 650;
						if (this.anInt378 != 201 || this.anInt379 == 1) {
							local1792 = 655;
						}
						this.aString14 = "";
						this.aBoolean73 = false;
						for (local205 = 0; local205 < Class6.aClass6Array1.length; local205++) {
							if (Class6.aClass6Array1[local205] != null && Class6.aClass6Array1[local205].anInt435 == local1792) {
								this.anInt218 = Class6.aClass6Array1[local205].anInt432;
								break;
							}
						}
					}
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 20) {
					this.anInt273 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt408 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt324 = this.aClass1_Sub1_Sub3_4.method480();
					this.aBoolean78 = true;
					this.aBoolean80 = true;
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 224) {
					this.method113(543);
					this.anInt383 = -1;
					return false;
				}
				if (this.anInt383 == 126) {
					local163 = this.aClass1_Sub1_Sub3_4.method482();
					local814 = Class6.aClass6Array1[local163];
					for (local276 = 0; local276 < local814.anIntArray94.length; local276++) {
						local814.anIntArray94[local276] = -1;
						local814.anIntArray94[local276] = 0;
					}
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 159) {
					for (local163 = 0; local163 < this.anIntArray45.length; local163++) {
						if (this.anIntArray45[local163] != this.anIntArray92[local163]) {
							this.anIntArray45[local163] = this.anIntArray92[local163];
							this.method130(local163);
							this.aBoolean85 = true;
						}
					}
					this.anInt383 = -1;
					return true;
				}
				@Pc(1978) Class6 local1978;
				if (this.anInt383 == 133) {
					local163 = this.aClass1_Sub1_Sub3_4.method482();
					local205 = this.aClass1_Sub1_Sub3_4.method483();
					local1978 = Class6.aClass6Array1[local163];
					local1978.anInt454 = local205;
					if (local205 == -1) {
						local1978.anInt429 = 0;
						local1978.anInt430 = 0;
					}
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 10) {
					this.aBoolean76 = true;
					this.anInt219 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt220 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt221 = this.aClass1_Sub1_Sub3_4.method482();
					this.anInt222 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt223 = this.aClass1_Sub1_Sub3_4.method480();
					if (this.anInt223 >= 100) {
						local163 = this.anInt219 * 128 + 64;
						local205 = this.anInt220 * 128 + 64;
						local276 = this.method218(local163, local205, this.anInt325) - this.anInt221;
						local280 = local163 - this.anInt262;
						local828 = local276 - this.anInt263;
						local495 = local205 - this.anInt264;
						local516 = (int) Math.sqrt((double) (local280 * local280 + local495 * local495));
						this.anInt265 = (int) (Math.atan2((double) local828, (double) local516) * 325.949D) & 0x7FF;
						this.anInt266 = (int) (Math.atan2((double) local280, (double) local495) * -325.949D) & 0x7FF;
						if (this.anInt265 < 128) {
							this.anInt265 = 128;
						}
						if (this.anInt265 > 383) {
							this.anInt265 = 383;
						}
					}
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 151) {
					for (local163 = 0; local163 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length; local163++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local163] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local163].anInt1028 = -1;
						}
					}
					for (local205 = 0; local205 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length; local205++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local205] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local205].anInt1028 = -1;
						}
					}
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 163) {
					local163 = this.aClass1_Sub1_Sub3_4.method482();
					local205 = this.aClass1_Sub1_Sub3_4.method482();
					local1978 = Class6.aClass6Array1[local163];
					if (local1978 != null && local1978.anInt433 == 0) {
						if (local205 < 0) {
							local205 = 0;
						}
						if (local205 > local1978.anInt441 - local1978.anInt437) {
							local205 = local1978.anInt441 - local1978.anInt437;
						}
						local1978.anInt442 = local205;
					}
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 110) {
					local163 = this.aClass1_Sub1_Sub3_4.method482();
					this.method207(local163, (byte) 5);
					if (this.anInt279 != -1) {
						this.anInt279 = -1;
						this.aBoolean85 = true;
						this.aBoolean62 = true;
					}
					this.anInt278 = local163;
					this.aBoolean80 = true;
					this.anInt218 = -1;
					this.aBoolean63 = false;
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 232) {
					this.aBoolean85 = true;
					local163 = this.aClass1_Sub1_Sub3_4.method482();
					local814 = Class6.aClass6Array1[local163];
					local276 = this.aClass1_Sub1_Sub3_4.method482();
					for (local280 = 0; local280 < local276; local280++) {
						local814.anIntArray94[local280] = this.aClass1_Sub1_Sub3_4.method482();
						local828 = this.aClass1_Sub1_Sub3_4.method480();
						if (local828 == 255) {
							local828 = this.aClass1_Sub1_Sub3_4.method485();
						}
						local814.anIntArray95[local280] = local828;
					}
					for (local828 = local276; local828 < local814.anIntArray94.length; local828++) {
						local814.anIntArray94[local828] = 0;
						local814.anIntArray95[local828] = 0;
					}
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 38) {
					local163 = this.aClass1_Sub1_Sub3_4.method482();
					local205 = this.aClass1_Sub1_Sub3_4.method482();
					Class6.aClass6Array1[local163].anInt450 = 1;
					Class6.aClass6Array1[local163].anInt451 = local205;
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 103) {
					local163 = this.aClass1_Sub1_Sub3_4.method483();
					if (local163 >= 0) {
						this.method207(local163, (byte) 5);
					}
					this.anInt331 = local163;
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 125) {
					this.anInt319 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt320 = this.aClass1_Sub1_Sub3_4.method480();
					for (local163 = this.anInt319; local163 < this.anInt319 + 8; local163++) {
						for (local205 = this.anInt320; local205 < this.anInt320 + 8; local205++) {
							if (this.aClass29ArrayArrayArray1[this.anInt325][local163][local205] != null) {
								this.aClass29ArrayArrayArray1[this.anInt325][local163][local205] = null;
								this.method206(local163, local205);
							}
						}
					}
					for (@Pc(2455) Class1_Sub2 local2455 = (Class1_Sub2) this.aClass29_1.method511(); local2455 != null; local2455 = (Class1_Sub2) this.aClass29_1.method513()) {
						if (local2455.anInt794 >= this.anInt319 && local2455.anInt794 < this.anInt319 + 8 && local2455.anInt795 >= this.anInt320 && local2455.anInt795 < this.anInt320 + 8 && local2455.anInt792 == this.anInt325) {
							local2455.anInt803 = 0;
						}
					}
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 53) {
					local163 = this.aClass1_Sub1_Sub3_4.method480();
					local205 = this.aClass1_Sub1_Sub3_4.method480();
					@Pc(2518) String local2518 = this.aClass1_Sub1_Sub3_4.method487();
					if (local163 >= 1 && local163 <= 5) {
						if (local2518.equalsIgnoreCase("null")) {
							local2518 = null;
						}
						this.aStringArray5[local163 - 1] = local2518;
						this.aBooleanArray4[local163 - 1] = local205 == 0;
					}
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 3) {
					this.aBoolean85 = true;
					local163 = this.aClass1_Sub1_Sub3_4.method480();
					local205 = this.aClass1_Sub1_Sub3_4.method485();
					local276 = this.aClass1_Sub1_Sub3_4.method480();
					this.anIntArray50[local163] = local205;
					this.anIntArray47[local163] = local276;
					this.anIntArray44[local163] = 1;
					for (local280 = 0; local280 < 98; local280++) {
						if (local205 >= anIntArray69[local280]) {
							this.anIntArray44[local163] = local280 + 2;
						}
					}
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 196 || this.anInt383 == 193 || this.anInt383 == 91 || this.anInt383 == 138 || this.anInt383 == 127 || this.anInt383 == 164 || this.anInt383 == 139 || this.anInt383 == 42 || this.anInt383 == 82 || this.anInt383 == 131 || this.anInt383 == 99) {
					this.method104(this.aClass1_Sub1_Sub3_4, this.anInt383);
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 59) {
					local2676 = this.aClass1_Sub1_Sub3_4.method487();
					@Pc(2690) long local2690;
					if (local2676.endsWith(":tradereq:")) {
						local322 = local2676.substring(0, local2676.indexOf(":"));
						local2690 = Class48.method667(local322);
						local493 = false;
						for (local495 = 0; local495 < this.anInt407; local495++) {
							if (this.aLongArray3[local495] == local2690) {
								local493 = true;
								break;
							}
						}
						if (!local493 && this.anInt396 == 0) {
							this.method204(local322, 4, "wishes to trade with you.");
						}
					} else if (local2676.endsWith(":duelreq:")) {
						local322 = local2676.substring(0, local2676.indexOf(":"));
						local2690 = Class48.method667(local322);
						local493 = false;
						for (local495 = 0; local495 < this.anInt407; local495++) {
							if (this.aLongArray3[local495] == local2690) {
								local493 = true;
								break;
							}
						}
						if (!local493 && this.anInt396 == 0) {
							this.method204(local322, 8, "wishes to duel with you.");
						}
					} else if (local2676.endsWith(":chalreq:")) {
						local322 = local2676.substring(0, local2676.indexOf(":"));
						local2690 = Class48.method667(local322);
						local493 = false;
						for (local495 = 0; local495 < this.anInt407; local495++) {
							if (this.aLongArray3[local495] == local2690) {
								local493 = true;
								break;
							}
						}
						if (!local493 && this.anInt396 == 0) {
							local562 = local2676.substring(local2676.indexOf(":") + 1, local2676.length() - 9);
							this.method204(local322, 8, local562);
						}
					} else {
						this.method204("", 0, local2676);
					}
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 40) {
					local163 = this.aClass1_Sub1_Sub3_4.method482();
					local205 = this.aClass1_Sub1_Sub3_4.method482();
					if (this.anInt244 == local163 && this.anInt245 == local205 && this.anInt404 == 2) {
						this.anInt383 = -1;
						return true;
					}
					this.anInt244 = local163;
					this.anInt245 = local205;
					this.anInt357 = (this.anInt244 - 6) * 8;
					this.anInt358 = (this.anInt245 - 6) * 8;
					this.aBoolean70 = false;
					if ((this.anInt244 / 8 == 48 || this.anInt244 / 8 == 49) && this.anInt245 / 8 == 48) {
						this.aBoolean70 = true;
					}
					if (this.anInt244 / 8 == 48 && this.anInt245 / 8 == 148) {
						this.aBoolean70 = true;
					}
					this.anInt404 = 1;
					this.aLong18 = System.currentTimeMillis();
					this.aClass35_26.method524();
					this.aClass1_Sub1_Sub2_Sub4_2.method447(0, 151, 257, "Loading - please wait.");
					this.aClass1_Sub1_Sub2_Sub4_2.method447(16777215, 150, 256, "Loading - please wait.");
					this.aClass35_26.method525(4, 4, (byte) 3, super.aGraphics2);
					local276 = 0;
					for (local280 = (this.anInt244 - 6) / 8; local280 <= (this.anInt244 + 6) / 8; local280++) {
						for (local828 = (this.anInt245 - 6) / 8; local828 <= (this.anInt245 + 6) / 8; local828++) {
							local276++;
						}
					}
					this.aByteArrayArray2 = new byte[local276][];
					this.aByteArrayArray1 = new byte[local276][];
					this.anIntArray51 = new int[local276];
					this.anIntArray52 = new int[local276];
					this.anIntArray53 = new int[local276];
					local276 = 0;
					for (local828 = (this.anInt244 - 6) / 8; local828 <= (this.anInt244 + 6) / 8; local828++) {
						for (local495 = (this.anInt245 - 6) / 8; local495 <= (this.anInt245 + 6) / 8; local495++) {
							this.anIntArray51[local276] = (local828 << 8) + local495;
							if (this.aBoolean70 && (local495 == 49 || local495 == 149 || local495 == 147 || local828 == 50 || local828 == 49 && local495 == 47)) {
								this.anIntArray52[local276] = -1;
								this.anIntArray53[local276] = -1;
								local276++;
							} else {
								local516 = this.anIntArray52[local276] = this.aClass44_Sub1_1.method640(local828, 0, local495);
								if (local516 != -1) {
									this.aClass44_Sub1_1.method645(3, local516);
								}
								local1666 = this.anIntArray53[local276] = this.aClass44_Sub1_1.method640(local828, 1, local495);
								if (local1666 != -1) {
									this.aClass44_Sub1_1.method645(3, local1666);
								}
								local276++;
							}
						}
					}
					local495 = this.anInt357 - this.anInt359;
					local516 = this.anInt358 - this.anInt360;
					this.anInt359 = this.anInt357;
					this.anInt360 = this.anInt358;
					for (local1666 = 0; local1666 < 16384; local1666++) {
						@Pc(3182) Class1_Sub1_Sub1_Sub1_Sub2 local3182 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local1666];
						if (local3182 != null) {
							for (@Pc(3186) int local3186 = 0; local3186 < 10; local3186++) {
								local3182.anIntArray272[local3186] -= local495;
								local3182.anIntArray273[local3186] -= local516;
							}
							local3182.anInt1005 -= local495 * 128;
							local3182.anInt1006 -= local516 * 128;
						}
					}
					for (@Pc(3230) int local3230 = 0; local3230 < this.anInt350; local3230++) {
						@Pc(3237) Class1_Sub1_Sub1_Sub1_Sub1 local3237 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local3230];
						if (local3237 != null) {
							for (@Pc(3241) int local3241 = 0; local3241 < 10; local3241++) {
								local3237.anIntArray272[local3241] -= local495;
								local3237.anIntArray273[local3241] -= local516;
							}
							local3237.anInt1005 -= local495 * 128;
							local3237.anInt1006 -= local516 * 128;
						}
					}
					this.aBoolean58 = true;
					@Pc(3289) byte local3289 = 0;
					@Pc(3291) byte local3291 = 104;
					@Pc(3293) byte local3293 = 1;
					if (local495 < 0) {
						local3289 = 103;
						local3291 = -1;
						local3293 = -1;
					}
					@Pc(3303) byte local3303 = 0;
					@Pc(3305) byte local3305 = 104;
					@Pc(3307) byte local3307 = 1;
					if (local516 < 0) {
						local3303 = 103;
						local3305 = -1;
						local3307 = -1;
					}
					for (@Pc(3317) int local3317 = local3289; local3317 != local3291; local3317 += local3293) {
						for (@Pc(3321) int local3321 = local3303; local3321 != local3305; local3321 += local3307) {
							@Pc(3327) int local3327 = local3317 + local495;
							@Pc(3331) int local3331 = local3321 + local516;
							for (@Pc(3333) int local3333 = 0; local3333 < 4; local3333++) {
								if (local3327 >= 0 && local3331 >= 0 && local3327 < 104 && local3331 < 104) {
									this.aClass29ArrayArrayArray1[local3333][local3317][local3321] = this.aClass29ArrayArrayArray1[local3333][local3327][local3331];
								} else {
									this.aClass29ArrayArrayArray1[local3333][local3317][local3321] = null;
								}
							}
						}
					}
					for (@Pc(3395) Class1_Sub2 local3395 = (Class1_Sub2) this.aClass29_1.method511(); local3395 != null; local3395 = (Class1_Sub2) this.aClass29_1.method513()) {
						local3395.anInt794 -= local495;
						local3395.anInt795 -= local516;
						if (local3395.anInt794 < 0 || local3395.anInt795 < 0 || local3395.anInt794 >= 104 || local3395.anInt795 >= 104) {
							local3395.method673();
						}
					}
					if (this.anInt391 != 0) {
						this.anInt391 -= local495;
						this.anInt392 -= local516;
					}
					this.aBoolean76 = false;
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 237) {
					local163 = this.aClass1_Sub1_Sub3_4.method482();
					local205 = this.aClass1_Sub1_Sub3_4.method482();
					local276 = local205 >> 10 & 0x1F;
					local280 = local205 >> 5 & 0x1F;
					local828 = local205 & 0x1F;
					Class6.aClass6Array1[local163].anInt446 = (local276 << 19) + (local280 << 11) + (local828 << 3);
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 89) {
					this.aBoolean76 = true;
					this.anInt292 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt293 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt294 = this.aClass1_Sub1_Sub3_4.method482();
					this.anInt295 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt296 = this.aClass1_Sub1_Sub3_4.method480();
					if (this.anInt296 >= 100) {
						this.anInt262 = this.anInt292 * 128 + 64;
						this.anInt264 = this.anInt293 * 128 + 64;
						this.anInt263 = this.method218(this.anInt262, this.anInt264, this.anInt325) - this.anInt294;
					}
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 194) {
					this.anInt387 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 50) {
					this.anInt321 = this.aClass1_Sub1_Sub3_4.method480();
					this.aBoolean85 = true;
					this.aBoolean62 = true;
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 115) {
					local163 = this.aClass1_Sub1_Sub3_4.method482();
					local205 = this.aClass1_Sub1_Sub3_4.method482();
					local276 = this.aClass1_Sub1_Sub3_4.method482();
					if (local205 == 65535) {
						Class6.aClass6Array1[local163].anInt450 = 0;
						this.anInt383 = -1;
						return true;
					}
					@Pc(3641) Class15 local3641 = Class15.method361(local205);
					Class6.aClass6Array1[local163].anInt450 = 4;
					Class6.aClass6Array1[local163].anInt451 = local205;
					Class6.aClass6Array1[local163].anInt457 = local3641.anInt620;
					Class6.aClass6Array1[local163].anInt458 = local3641.anInt621;
					Class6.aClass6Array1[local163].anInt456 = local3641.anInt619 * 100 / local276;
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 14) {
					if (this.anInt321 == 12) {
						this.aBoolean85 = true;
					}
					this.anInt418 = this.aClass1_Sub1_Sub3_4.method483();
					this.anInt383 = -1;
					return true;
				}
				if (this.anInt383 == 67) {
					this.method208(this.aClass1_Sub1_Sub3_4, this.anInt382);
					this.anInt383 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt383 + "," + this.anInt382 + " - " + this.anInt276 + "," + this.anInt277);
				this.method113(543);
			} catch (@Pc(3744) IOException local3744) {
				this.method170();
			} catch (@Pc(3749) Exception local3749) {
				local2676 = "T2 - " + this.anInt383 + "," + this.anInt276 + "," + this.anInt277 + " - " + this.anInt382 + "," + (this.anInt357 + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0]) + "," + (this.anInt358 + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]) + " - ";
				for (local205 = 0; local205 < this.anInt382 && local205 < 50; local205++) {
					local2676 = local2676 + this.aClass1_Sub1_Sub3_4.aByteArray9[local205] + ",";
				}
				signlink.reporterror(local2676);
				this.method113(543);
			}
			return true;
		} catch (@Pc(3830) RuntimeException local3830) {
			signlink.reporterror("26635, " + -547 + ", " + local3830.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method113(@OriginalArg(0) int arg0) {
		try {
			try {
				if (this.aClass8_1 != null) {
					this.aClass8_1.method247();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass8_1 = null;
			this.aBoolean59 = false;
			this.anInt405 = 0;
			this.aString10 = "";
			this.aString11 = "";
			this.method197();
			@Pc(29) boolean local29 = false;
			this.aClass37_1.method530();
			for (@Pc(35) int local35 = 0; local35 < 4; local35++) {
				this.aClass19Array1[local35].method420();
			}
			System.gc();
			this.method135(this.anInt393);
			this.anInt398 = -1;
			this.anInt361 = -1;
			this.anInt228 = 0;
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("41008, " + arg0 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZ)V")
	private void method114(@OriginalArg(1) boolean arg0) {
		try {
			this.method154();
			this.aClass35_5.method524();
			this.aClass1_Sub1_Sub2_Sub3_12.method418(0, 0);
			this.aBoolean59 &= true;
			@Pc(50) byte local50;
			@Pc(62) int local62;
			if (this.anInt405 == 0) {
				this.aClass1_Sub1_Sub2_Sub4_1.method448(180, true, 180, 7711145, this.aClass44_Sub1_1.aString30);
				local50 = 80;
				this.aClass1_Sub1_Sub2_Sub4_3.method448(180, true, 80, 16776960, "Welcome to RuneScape");
				local62 = local50 + 30;
				this.aClass1_Sub1_Sub2_Sub3_13.method418(27, 100);
				this.aClass1_Sub1_Sub2_Sub4_3.method448(100, true, 125, 16777215, "New User");
				this.aClass1_Sub1_Sub2_Sub3_13.method418(187, 100);
				this.aClass1_Sub1_Sub2_Sub4_3.method448(260, true, 125, 16777215, "Existing User");
			}
			if (this.anInt405 == 2) {
				local50 = 60;
				if (this.aString6.length() > 0) {
					this.aClass1_Sub1_Sub2_Sub4_3.method448(180, true, 45, 16776960, this.aString6);
					this.aClass1_Sub1_Sub2_Sub4_3.method448(180, true, 60, 16776960, this.aString7);
					local62 = local50 + 30;
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method448(180, true, 53, 16776960, this.aString7);
					local62 = local50 + 30;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method455(90, true, 90, 16777215, "Username: " + this.aString10 + (this.anInt259 == 0 & anInt248 % 40 < 20 ? "@yel@|" : ""));
				local62 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method455(105, true, 92, 16777215, "Password: " + Class48.method672(this.aString11) + (this.anInt259 == 1 & anInt248 % 40 < 20 ? "@yel@|" : ""));
				local62 += 15;
				if (!arg0) {
					this.aClass1_Sub1_Sub2_Sub3_13.method418(27, 130);
					this.aClass1_Sub1_Sub2_Sub4_3.method448(100, true, 155, 16777215, "Login");
					this.aClass1_Sub1_Sub2_Sub3_13.method418(187, 130);
					this.aClass1_Sub1_Sub2_Sub4_3.method448(260, true, 155, 16777215, "Cancel");
				}
			}
			if (this.anInt405 == 3) {
				this.aClass1_Sub1_Sub2_Sub4_3.method448(180, true, 40, 16776960, "Create a free account");
				local50 = 65;
				this.aClass1_Sub1_Sub2_Sub4_3.method448(180, true, 65, 16777215, "To create a new account you need to");
				local62 = local50 + 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method448(180, true, 80, 16777215, "go back to the main RuneScape webpage");
				local62 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method448(180, true, 95, 16777215, "and choose the red 'create account'");
				local62 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method448(180, true, 110, 16777215, "button at the top right of that page.");
				local62 += 15;
				this.aClass1_Sub1_Sub2_Sub3_13.method418(107, 130);
				this.aClass1_Sub1_Sub2_Sub4_3.method448(180, true, 155, 16777215, "Cancel");
			}
			this.aClass35_5.method525(202, 171, (byte) 3, super.aGraphics2);
			if (this.aBoolean69) {
				this.aBoolean69 = false;
				this.aClass35_3.method525(128, 0, (byte) 3, super.aGraphics2);
				this.aClass35_4.method525(202, 371, (byte) 3, super.aGraphics2);
				this.aClass35_8.method525(0, 265, (byte) 3, super.aGraphics2);
				this.aClass35_9.method525(562, 265, (byte) 3, super.aGraphics2);
				this.aClass35_10.method525(128, 171, (byte) 3, super.aGraphics2);
				this.aClass35_11.method525(562, 171, (byte) 3, super.aGraphics2);
			}
		} catch (@Pc(495) RuntimeException local495) {
			signlink.reporterror("4565, " + true + ", " + arg0 + ", " + local495.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIII)Z")
	private boolean method115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(7) int local7 = arg3 >> 14 & 0x7FFF;
			@Pc(22) int local22 = this.aClass37_1.method560(this.anInt325, arg0, arg1, arg3);
			if (local22 == -1) {
				return false;
			}
			@Pc(31) int local31 = local22 & 0x1F;
			@Pc(37) int local37 = local22 >> 6 & 0x3;
			anInt310++;
			if (anInt310 > 1086) {
				anInt310 = 0;
				this.aClass1_Sub1_Sub3_3.method469(162);
				this.aClass1_Sub1_Sub3_3.method470(0);
				@Pc(59) int local59 = this.aClass1_Sub1_Sub3_3.anInt751;
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_3.method471(16791);
				}
				this.aClass1_Sub1_Sub3_3.method470(254);
				this.aClass1_Sub1_Sub3_3.method471((int) (Math.random() * 65536.0D));
				this.aClass1_Sub1_Sub3_3.method471(16128);
				this.aClass1_Sub1_Sub3_3.method471(52610);
				this.aClass1_Sub1_Sub3_3.method471((int) (Math.random() * 65536.0D));
				this.aClass1_Sub1_Sub3_3.method471(55420);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_3.method471(35025);
				}
				this.aClass1_Sub1_Sub3_3.method471(46628);
				this.aClass1_Sub1_Sub3_3.method470((int) (Math.random() * 256.0D));
				this.aClass1_Sub1_Sub3_3.method479(this.aClass1_Sub1_Sub3_3.anInt751 - local59);
			}
			if (local31 == 10 || local31 == 11 || local31 == 22) {
				@Pc(139) Class9 local139 = Class9.method288(local7);
				@Pc(147) int local147;
				@Pc(150) int local150;
				if (local37 == 0 || local37 == 2) {
					local147 = local139.anInt517;
					local150 = local139.anInt518;
				} else {
					local147 = local139.anInt518;
					local150 = local139.anInt517;
				}
				@Pc(161) int local161 = local139.anInt529;
				if (local37 != 0) {
					local161 = (local161 << local37 & 0xF) + (local161 >> 4 - local37);
				}
				this.method150(2, local161, 0, local147, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], arg0, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], local150, arg1);
			} else {
				this.method150(2, 0, local31 + 1, 0, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], arg0, local37, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, arg1);
			}
			this.anInt327 = super.anInt211;
			this.anInt328 = super.anInt212;
			this.anInt330 = 2;
			this.anInt329 = 0;
			this.aClass1_Sub1_Sub3_3.method469(arg2);
			this.aClass1_Sub1_Sub3_3.method471(arg0 + this.anInt357);
			this.aClass1_Sub1_Sub3_3.method471(arg1 + this.anInt358);
			this.aClass1_Sub1_Sub3_3.method471(local7);
			return true;
		} catch (@Pc(261) RuntimeException local261) {
			signlink.reporterror("1143, " + arg0 + ", " + arg1 + ", " + 6216 + ", " + arg2 + ", " + arg3 + ", " + local261.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!lb;IIILclient!ab;)V")
	private void method116(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub1_Sub1_Sub1 arg4) {
		try {
			if (arg3 >= 0) {
				this.anInt383 = -1;
			}
			@Pc(14) int local14;
			if ((arg1 & 0x1) == 1) {
				local14 = arg0.method480();
				@Pc(17) byte[] local17 = new byte[local14];
				@Pc(23) Class1_Sub1_Sub3 local23 = new Class1_Sub1_Sub3(anInt417, local17);
				arg0.method489(local17, local14);
				this.aClass1_Sub1_Sub3Array1[arg2] = local23;
				arg4.method39(local23);
			}
			@Pc(61) int local61;
			@Pc(73) int local73;
			if ((arg1 & 0x2) == 2) {
				local14 = arg0.method482();
				if (local14 == 65535) {
					local14 = -1;
				}
				if (local14 == arg4.anInt1028) {
					arg4.anInt1032 = 0;
				}
				local61 = arg0.method480();
				if (local14 == arg4.anInt1028 && local14 != -1) {
					local73 = Class27.aClass27Array1[local14].anInt815;
					if (local73 == 1) {
						arg4.anInt1029 = 0;
						arg4.anInt1030 = 0;
						arg4.anInt1031 = local61;
						arg4.anInt1032 = 0;
					}
					if (local73 == 2) {
						arg4.anInt1032 = 0;
					}
				} else if (local14 == -1 || arg4.anInt1028 == -1 || Class27.aClass27Array1[local14].anInt809 >= Class27.aClass27Array1[arg4.anInt1028].anInt809) {
					arg4.anInt1028 = local14;
					arg4.anInt1029 = 0;
					arg4.anInt1030 = 0;
					arg4.anInt1031 = local61;
					arg4.anInt1032 = 0;
					arg4.anInt1051 = arg4.anInt1049;
				}
			}
			if ((arg1 & 0x4) == 4) {
				arg4.anInt1022 = arg0.method482();
				if (arg4.anInt1022 == 65535) {
					arg4.anInt1022 = -1;
				}
			}
			if ((arg1 & 0x8) == 8) {
				arg4.aString31 = arg0.method487();
				if (arg4.aString31.charAt(0) == '~') {
					arg4.aString31 = arg4.aString31.substring(1);
					this.method204(arg4.aString3, 2, arg4.aString31);
				} else if (arg4 == aClass1_Sub1_Sub1_Sub1_Sub1_1) {
					this.method204(arg4.aString3, 2, arg4.aString31);
				}
				arg4.anInt1017 = 0;
				arg4.anInt1018 = 0;
				arg4.anInt1016 = 150;
			}
			if ((arg1 & 0x10) == 16) {
				local14 = arg0.method480();
				local61 = arg0.method480();
				arg4.method681(local14, local61, anInt248);
				arg4.anInt1019 = anInt248 + 300;
				arg4.anInt1020 = arg0.method480();
				arg4.anInt1021 = arg0.method480();
			}
			if ((arg1 & 0x20) == 32) {
				arg4.anInt1023 = arg0.method482();
				arg4.anInt1024 = arg0.method482();
			}
			if ((arg1 & 0x40) == 64) {
				local14 = arg0.method482();
				local61 = arg0.method480();
				local73 = arg0.method480();
				@Pc(259) int local259 = arg0.anInt751;
				if (arg4.aString3 != null && arg4.aBoolean29) {
					@Pc(269) long local269 = Class48.method667(arg4.aString3);
					@Pc(271) boolean local271 = false;
					if (local61 <= 1) {
						for (@Pc(276) int local276 = 0; local276 < this.anInt407; local276++) {
							if (this.aLongArray3[local276] == local269) {
								local271 = true;
								break;
							}
						}
					}
					if (!local271 && this.anInt396 == 0) {
						try {
							@Pc(304) String local304 = Class49.method683(local73, arg0);
							@Pc(308) String local308 = Class42.method604((byte) 1, local304);
							arg4.aString31 = local308;
							arg4.anInt1017 = local14 >> 8;
							arg4.anInt1018 = local14 & 0xFF;
							arg4.anInt1016 = 150;
							if (local61 == 2 || local61 == 3) {
								this.method204("@cr2@" + arg4.aString3, 1, local308);
							} else if (local61 == 1) {
								this.method204("@cr1@" + arg4.aString3, 1, local308);
							} else {
								this.method204(arg4.aString3, 2, local308);
							}
						} catch (@Pc(372) Exception local372) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg0.anInt751 = local259 + local73;
			}
			if ((arg1 & 0x100) == 256) {
				arg4.anInt1033 = arg0.method482();
				local14 = arg0.method485();
				arg4.anInt1037 = local14 >> 16;
				arg4.anInt1036 = anInt248 + (local14 & 0xFFFF);
				arg4.anInt1034 = 0;
				arg4.anInt1035 = 0;
				if (arg4.anInt1036 > anInt248) {
					arg4.anInt1034 = -1;
				}
				if (arg4.anInt1033 == 65535) {
					arg4.anInt1033 = -1;
				}
			}
			if ((arg1 & 0x200) == 512) {
				arg4.anInt1038 = arg0.method480();
				arg4.anInt1040 = arg0.method480();
				arg4.anInt1039 = arg0.method480();
				arg4.anInt1041 = arg0.method480();
				arg4.anInt1042 = arg0.method482() + anInt248;
				arg4.anInt1043 = arg0.method482() + anInt248;
				arg4.anInt1044 = arg0.method480();
				arg4.method679();
			}
			if ((arg1 & 0x400) == 1024) {
				local14 = arg0.method480();
				local61 = arg0.method480();
				arg4.method681(local14, local61, anInt248);
				arg4.anInt1019 = anInt248 + 300;
				arg4.anInt1020 = arg0.method480();
				arg4.anInt1021 = arg0.method480();
			}
		} catch (@Pc(496) RuntimeException local496) {
			signlink.reporterror("35965, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local496.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BBI)Z")
	private boolean method117(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			return arg0 == null ? true : signlink.wavesave(arg0, arg1);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("92879, " + arg0 + ", " + 1 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ib;IBI)V")
	private void method118(@OriginalArg(0) Class1_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg2 * arg2 + arg1 * arg1;
			if (this.aByte1 != 2) {
				this.aClass29ArrayArrayArray1 = null;
			}
			if (local7 > 4225 && local7 < 90000) {
				@Pc(28) int local28 = this.anInt250 + this.anInt260 & 0x7FF;
				@Pc(32) int local32 = Class1_Sub1_Sub1_Sub5.anIntArray151[local28];
				@Pc(36) int local36 = Class1_Sub1_Sub1_Sub5.anIntArray152[local28];
				@Pc(45) int local45 = local32 * 256 / (this.anInt267 + 256);
				@Pc(54) int local54 = local36 * 256 / (this.anInt267 + 256);
				@Pc(64) int local64 = arg1 * local45 + arg2 * local54 >> 16;
				@Pc(74) int local74 = arg1 * local54 - arg2 * local45 >> 16;
				@Pc(80) double local80 = Math.atan2((double) local64, (double) local74);
				@Pc(86) int local86 = (int) (Math.sin(local80) * 63.0D);
				@Pc(92) int local92 = (int) (Math.cos(local80) * 57.0D);
				this.aClass1_Sub1_Sub2_Sub2_13.method396(local80, local86 + 94 + 4 - 10, 83 - local92 - 20);
			} else {
				this.method211(this.aBoolean92, arg1, arg0, arg2);
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("15340, " + arg0 + ", " + arg1 + ", " + 2 + ", " + arg2 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method120() {
		try {
			@Pc(3) int local3 = 5;
			this.anIntArray33[8] = 0;
			@Pc(20) int local20 = 0;
			while (this.anIntArray33[8] == 0) {
				@Pc(24) String local24 = "Unknown problem";
				this.method96("Connecting to web server", 20);
				try {
					@Pc(46) DataInputStream local46 = this.method200("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 294);
					@Pc(53) Class1_Sub1_Sub3 local53 = new Class1_Sub1_Sub3(anInt417, new byte[40]);
					local46.readFully(local53.aByteArray9, 0, 40);
					local46.close();
					for (@Pc(63) int local63 = 0; local63 < 9; local63++) {
						this.anIntArray33[local63] = local53.method485();
					}
					@Pc(78) int local78 = local53.method485();
					@Pc(80) int local80 = 1234;
					for (@Pc(82) int local82 = 0; local82 < 9; local82++) {
						local80 = (local80 << 1) + this.anIntArray33[local82];
					}
					if (local78 != local80) {
						local24 = "checksum problem";
						this.anIntArray33[8] = 0;
					}
				} catch (@Pc(109) EOFException local109) {
					local24 = "EOF problem";
					this.anIntArray33[8] = 0;
				} catch (@Pc(118) IOException local118) {
					local24 = "connection problem";
					this.anIntArray33[8] = 0;
				} catch (@Pc(127) Exception local127) {
					local24 = "logic problem";
					this.anIntArray33[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray33[8] == 0) {
					local20++;
					for (@Pc(145) int local145 = local3; local145 > 0; local145--) {
						if (local20 >= 10) {
							this.method96("Game updated - please reload page", 10);
							local145 = 10;
						} else {
							this.method96(local24 + " - Will retry in " + local145 + " secs.", 10);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(179) Exception local179) {
						}
					}
					local3 *= 2;
					if (local3 > 60) {
						local3 = 60;
					}
					this.aBoolean65 = !this.aBoolean65;
				}
			}
		} catch (@Pc(207) RuntimeException local207) {
			signlink.reporterror("11437, " + 1764 + ", " + local207.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method121() {
		try {
			@Pc(21) int local21;
			@Pc(28) int local28;
			if (this.anInt405 == 0) {
				local21 = super.anInt201 / 2 - 80;
				local28 = super.anInt202 / 2 + 20;
				local28 += 20;
				if (super.anInt210 == 1 && super.anInt211 >= local21 - 75 && super.anInt211 <= local21 + 75 && super.anInt212 >= local28 - 20 && super.anInt212 <= local28 + 20) {
					this.anInt405 = 3;
					this.anInt259 = 0;
				}
				local21 = super.anInt201 / 2 + 80;
				if (super.anInt210 == 1 && super.anInt211 >= local21 - 75 && super.anInt211 <= local21 + 75 && super.anInt212 >= local28 - 20 && super.anInt212 <= local28 + 20) {
					this.aString6 = "";
					this.aString7 = "Enter your username & password.";
					this.anInt405 = 2;
					this.anInt259 = 0;
				}
			} else if (this.anInt405 == 2) {
				local21 = super.anInt202 / 2 - 40;
				local21 += 30;
				local21 += 25;
				if (super.anInt210 == 1 && super.anInt212 >= local21 - 15 && super.anInt212 < local21) {
					this.anInt259 = 0;
				}
				local21 += 15;
				if (super.anInt210 == 1 && super.anInt212 >= local21 - 15 && super.anInt212 < local21) {
					this.anInt259 = 1;
				}
				local21 += 15;
				local28 = super.anInt201 / 2 - 80;
				@Pc(174) int local174 = super.anInt202 / 2 + 50;
				@Pc(175) int local175 = local174 + 20;
				if (super.anInt210 == 1 && super.anInt211 >= local28 - 75 && super.anInt211 <= local28 + 75 && super.anInt212 >= local175 - 20 && super.anInt212 <= local175 + 20) {
					this.method168(this.aString10, this.aString11, false);
					if (this.aBoolean59) {
						return;
					}
				}
				local28 = super.anInt201 / 2 + 80;
				if (super.anInt210 == 1 && super.anInt211 >= local28 - 75 && super.anInt211 <= local28 + 75 && super.anInt212 >= local175 - 20 && super.anInt212 <= local175 + 20) {
					this.anInt405 = 0;
					this.aString10 = "";
					this.aString11 = "";
				}
				while (true) {
					while (true) {
						@Pc(262) int local262 = this.method88();
						if (local262 == -1) {
							return;
						}
						@Pc(267) boolean local267 = false;
						for (@Pc(269) int local269 = 0; local269 < aString4.length(); local269++) {
							if (local262 == aString4.charAt(local269)) {
								local267 = true;
								break;
							}
						}
						if (this.anInt259 == 0) {
							if (local262 == 8 && this.aString10.length() > 0) {
								this.aString10 = this.aString10.substring(0, this.aString10.length() - 1);
							}
							if (local262 == 9 || local262 == 10 || local262 == 13) {
								this.anInt259 = 1;
							}
							if (local267) {
								this.aString10 = this.aString10 + (char) local262;
							}
							if (this.aString10.length() > 12) {
								this.aString10 = this.aString10.substring(0, 12);
							}
						} else if (this.anInt259 == 1) {
							if (local262 == 8 && this.aString11.length() > 0) {
								this.aString11 = this.aString11.substring(0, this.aString11.length() - 1);
							}
							if (local262 == 9 || local262 == 10 || local262 == 13) {
								this.anInt259 = 0;
							}
							if (local267) {
								this.aString11 = this.aString11 + (char) local262;
							}
							if (this.aString11.length() > 20) {
								this.aString11 = this.aString11.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt405 == 3) {
				local21 = super.anInt201 / 2;
				local28 = super.anInt202 / 2 + 50;
				@Pc(426) int local426 = local28 + 20;
				if (super.anInt210 == 1 && super.anInt211 >= local21 - 75 && super.anInt211 <= local21 + 75 && super.anInt212 >= local426 - 20 && super.anInt212 <= local426 + 20) {
					this.anInt405 = 0;
					return;
				}
			}
		} catch (@Pc(459) RuntimeException local459) {
			signlink.reporterror("55685, " + 7 + ", " + local459.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass1_Sub1_Sub2_Sub3_19.method418(arg1, arg4);
			this.aClass1_Sub1_Sub2_Sub3_20.method418(arg1, arg4 + arg0 - 16);
			Class1_Sub1_Sub2.method439(arg1, 16, this.anInt403, arg0 - 32, arg4 + 16);
			@Pc(45) int local45 = (arg0 - 32) * arg0 / arg2;
			if (local45 < 8) {
				local45 = 8;
			}
			@Pc(62) int local62 = (arg0 - local45 - 32) * arg3 / (arg2 - arg0);
			Class1_Sub1_Sub2.method439(arg1, 16, this.anInt397, local45, arg4 + local62 + 16);
			Class1_Sub1_Sub2.method444(this.anInt258, arg4 + local62 + 16, 617, local45, arg1);
			Class1_Sub1_Sub2.method444(this.anInt258, arg4 + local62 + 16, 617, local45, arg1 + 1);
			Class1_Sub1_Sub2.method442(arg4 + local62 + 16, arg1, 16, (byte) 6, this.anInt258);
			Class1_Sub1_Sub2.method442(arg4 + local62 + 17, arg1, 16, (byte) 6, this.anInt258);
			Class1_Sub1_Sub2.method444(this.anInt377, arg4 + local62 + 16, 617, local45, arg1 + 15);
			Class1_Sub1_Sub2.method444(this.anInt377, arg4 + local62 + 17, 617, local45 - 1, arg1 + 14);
			Class1_Sub1_Sub2.method442(arg4 + local62 + local45 + 15, arg1, 16, (byte) 6, this.anInt377);
			Class1_Sub1_Sub2.method442(arg4 + local62 + local45 + 14, arg1 + 1, 15, (byte) 6, this.anInt377);
		} catch (@Pc(178) RuntimeException local178) {
			signlink.reporterror("15759, " + arg0 + ", " + arg1 + ", " + 854 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local178.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method123(@OriginalArg(1) boolean arg0) {
		try {
			for (@Pc(7) int local7 = 0; local7 < this.anInt283; local7++) {
				@Pc(17) Class1_Sub1_Sub1_Sub1_Sub2 local17 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray48[local7]];
				@Pc(26) int local26 = (this.anIntArray48[local7] << 14) + 536870912;
				if (local17 != null && local17.method680() && local17.aClass13_2.aBoolean148 == arg0) {
					@Pc(42) int local42 = local17.anInt1005 >> 7;
					@Pc(47) int local47 = local17.anInt1006 >> 7;
					if (local42 >= 0 && local42 < 104 && local47 >= 0 && local47 < 104) {
						if (local17.anInt1008 == 1 && (local17.anInt1005 & 0x7F) == 64 && (local17.anInt1006 & 0x7F) == 64) {
							if (this.anIntArrayArray6[local42][local47] == this.anInt281) {
								continue;
							}
							this.anIntArrayArray6[local42][local47] = this.anInt281;
						}
						this.aClass37_1.method541((local17.anInt1008 - 1) * 64 + 60, this.anInt325, local17.anInt1006, local26, local17, this.method218(local17.anInt1005, local17.anInt1006, this.anInt325), local17.anInt1005, local17.anInt1007, local17.aBoolean253);
					}
				}
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("53458, " + 910 + ", " + arg0 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method124() {
		try {
			for (@Pc(10) int local10 = 0; local10 < this.anInt336; local10++) {
				if (this.anIntArray41[local10] <= 0) {
					@Pc(19) boolean local19 = false;
					try {
						if (this.anIntArray49[local10] != this.anInt371 || this.anIntArray43[local10] != this.anInt374) {
							@Pc(52) Class1_Sub1_Sub3 local52 = Class5.method79(this.anIntArray49[local10], (byte) 6, this.anIntArray43[local10]);
							if (System.currentTimeMillis() + (long) (local52.anInt751 / 22) > this.aLong15 + (long) (this.anInt312 / 22)) {
								this.anInt312 = local52.anInt751;
								this.aLong15 = System.currentTimeMillis();
								if (this.method117(local52.aByteArray9, local52.anInt751)) {
									this.anInt371 = this.anIntArray49[local10];
									this.anInt374 = this.anIntArray43[local10];
								} else {
									local19 = true;
								}
							}
						} else if (!this.method140()) {
							local19 = true;
						}
					} catch (@Pc(102) Exception local102) {
					}
					if (local19 && this.anIntArray41[local10] != -5) {
						this.anIntArray41[local10] = -5;
					} else {
						this.anInt336--;
						for (@Pc(118) int local118 = local10; local118 < this.anInt336; local118++) {
							this.anIntArray49[local118] = this.anIntArray49[local118 + 1];
							this.anIntArray43[local118] = this.anIntArray43[local118 + 1];
							this.anIntArray41[local118] = this.anIntArray41[local118 + 1];
						}
						local10--;
					}
				} else {
					@Pc(170) int local170 = this.anIntArray41[local10]--;
				}
			}
			if (this.anInt228 > 0) {
				this.anInt228 -= 20;
				if (this.anInt228 < 0) {
					this.anInt228 = 0;
				}
				if (this.anInt228 == 0 && this.aBoolean61 && !aBoolean56) {
					this.anInt361 = this.anInt398;
					this.aBoolean75 = true;
					this.aClass44_Sub1_1.method645(2, this.anInt361);
					return;
				}
			}
		} catch (@Pc(216) RuntimeException local216) {
			signlink.reporterror("23075, " + -674 + ", " + local216.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	@Override
	public void method95(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}
		if (signlink.mainapp == null) {
			super.method95(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method92() {
		try {
			if (this.aBoolean88 || this.aBoolean57 || this.aBoolean86) {
				this.method176();
			} else {
				anInt344++;
				if (this.aBoolean59) {
					this.method190();
				} else {
					this.method114(false);
				}
				this.anInt389 = 0;
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("75307, " + -117 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
	private void method125(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				if (this.aBoolean60) {
					this.aBoolean60 = false;
					this.aBoolean80 = true;
				}
				@Pc(25) int local25 = this.anIntArray35[arg0];
				@Pc(30) int local30 = this.anIntArray36[arg0];
				@Pc(35) int local35 = this.anIntArray37[arg0];
				@Pc(40) int local40 = this.anIntArray38[arg0];
				if (local35 >= 2000) {
					local35 -= 2000;
				}
				@Pc(52) Class1_Sub1_Sub1_Sub1_Sub2 local52;
				@Pc(75) String local75;
				if (local35 == 1714) {
					local52 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local40];
					if (local52 != null) {
						@Pc(57) Class13 local57 = local52.aClass13_2;
						if (local57.anIntArray174 != null) {
							local57 = local57.method327();
						}
						if (local57 != null) {
							if (local57.aByteArray5 == null) {
								local75 = "It's a " + local57.aString24 + ".";
							} else {
								local75 = new String(local57.aByteArray5);
							}
							this.method204("", 0, local75);
						}
					}
				}
				@Pc(102) Class1_Sub1_Sub1_Sub1_Sub1 local102;
				if (local35 == 275) {
					local102 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local40];
					if (local102 != null) {
						this.method150(2, 0, 0, 1, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], local102.anIntArray272[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 1, local102.anIntArray273[0]);
						this.anInt327 = super.anInt211;
						this.anInt328 = super.anInt212;
						this.anInt330 = 2;
						this.anInt329 = 0;
						this.aClass1_Sub1_Sub3_3.method469(15);
						this.aClass1_Sub1_Sub3_3.method471(local40);
						this.aClass1_Sub1_Sub3_3.method471(this.anInt412);
						this.aClass1_Sub1_Sub3_3.method471(this.anInt410);
						this.aClass1_Sub1_Sub3_3.method471(this.anInt411);
					}
				}
				if (local35 == 563) {
					this.aClass1_Sub1_Sub3_3.method469(47);
					this.aClass1_Sub1_Sub3_3.method471(local40);
					this.aClass1_Sub1_Sub3_3.method471(local25);
					this.aClass1_Sub1_Sub3_3.method471(local30);
					this.aClass1_Sub1_Sub3_3.method471(this.anInt270);
					this.anInt345 = 0;
					this.anInt346 = local30;
					this.anInt347 = local25;
					this.anInt348 = 2;
					if (Class6.aClass6Array1[local30].anInt432 == this.anInt218) {
						this.anInt348 = 1;
					}
					if (Class6.aClass6Array1[local30].anInt432 == this.anInt278) {
						this.anInt348 = 3;
					}
				}
				if (local35 == 357) {
					this.method115(local25, local30, 172, local40);
				}
				@Pc(273) boolean local273;
				if (local35 == 139 || local35 == 778 || local35 == 617 || local35 == 224 || local35 == 662) {
					local273 = this.method150(2, 0, 0, 0, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], local25, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, local30);
					if (!local273) {
						this.method150(2, 0, 0, 1, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], local25, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 1, local30);
					}
					this.anInt327 = super.anInt211;
					this.anInt328 = super.anInt212;
					this.anInt330 = 2;
					this.anInt329 = 0;
					if (local35 == 617) {
						this.aClass1_Sub1_Sub3_3.method469(170);
					}
					if (local35 == 662) {
						anInt285 += this.anInt358;
						if (anInt285 >= 118) {
							this.aClass1_Sub1_Sub3_3.method469(100);
							this.aClass1_Sub1_Sub3_3.method474(0);
						}
						this.aClass1_Sub1_Sub3_3.method469(222);
					}
					if (local35 == 778) {
						this.aClass1_Sub1_Sub3_3.method469(52);
					}
					if (local35 == 224) {
						anInt322 += local30;
						if (anInt322 >= 75) {
							this.aClass1_Sub1_Sub3_3.method469(198);
							this.aClass1_Sub1_Sub3_3.method470(19);
						}
						this.aClass1_Sub1_Sub3_3.method469(251);
					}
					if (local35 == 139) {
						if ((local25 & 0x3) == 0) {
							anInt230++;
						}
						if (anInt230 >= 123) {
							this.aClass1_Sub1_Sub3_3.method469(20);
							this.aClass1_Sub1_Sub3_3.method474(0);
						}
						this.aClass1_Sub1_Sub3_3.method469(122);
					}
					this.aClass1_Sub1_Sub3_3.method471(local25 + this.anInt357);
					this.aClass1_Sub1_Sub3_3.method471(local30 + this.anInt358);
					this.aClass1_Sub1_Sub3_3.method471(local40);
				}
				@Pc(427) Class15 local427;
				@Pc(454) String local454;
				if (local35 == 1328) {
					local427 = Class15.method361(local40);
					@Pc(431) Class6 local431 = Class6.aClass6Array1[local30];
					if (local431 != null && local431.anIntArray95[local25] >= 100000) {
						local454 = local431.anIntArray95[local25] + " x " + local427.aString25;
					} else if (local427.aByteArray6 == null) {
						local454 = "It's a " + local427.aString25 + ".";
					} else {
						local454 = new String(local427.aByteArray6);
					}
					this.method204("", 0, local454);
				}
				if (local35 == 240) {
					local52 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local40];
					if (local52 != null) {
						this.method150(2, 0, 0, 1, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], local52.anIntArray272[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 1, local52.anIntArray273[0]);
						this.anInt327 = super.anInt211;
						this.anInt328 = super.anInt212;
						this.anInt330 = 2;
						this.anInt329 = 0;
						this.aClass1_Sub1_Sub3_3.method469(58);
						this.aClass1_Sub1_Sub3_3.method471(local40);
						this.aClass1_Sub1_Sub3_3.method471(this.anInt270);
					}
				}
				if (local35 == 1152) {
					local427 = Class15.method361(local40);
					if (local427.aByteArray6 == null) {
						local454 = "It's a " + local427.aString25 + ".";
					} else {
						local454 = new String(local427.aByteArray6);
					}
					this.method204("", 0, local454);
				}
				if (local35 == 111) {
					local273 = this.method150(2, 0, 0, 0, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], local25, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, local30);
					if (!local273) {
						this.method150(2, 0, 0, 1, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], local25, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 1, local30);
					}
					this.anInt327 = super.anInt211;
					this.anInt328 = super.anInt212;
					this.anInt330 = 2;
					this.anInt329 = 0;
					this.aClass1_Sub1_Sub3_3.method469(59);
					this.aClass1_Sub1_Sub3_3.method471(local25 + this.anInt357);
					this.aClass1_Sub1_Sub3_3.method471(local30 + this.anInt358);
					this.aClass1_Sub1_Sub3_3.method471(local40);
					this.aClass1_Sub1_Sub3_3.method471(this.anInt412);
					this.aClass1_Sub1_Sub3_3.method471(this.anInt410);
					this.aClass1_Sub1_Sub3_3.method471(this.anInt411);
				}
				if (local35 == 1071) {
					this.method115(local25, local30, 165, local40);
				}
				if (local35 == 718) {
					if (this.aBoolean81) {
						this.aClass37_1.method568(local25 - 4, local30 - 4);
					} else {
						this.aClass37_1.method568(super.anInt211 - 4, super.anInt212 - 4);
					}
				}
				if (local35 == 370) {
					local273 = this.method150(2, 0, 0, 0, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], local25, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, local30);
					if (!local273) {
						this.method150(2, 0, 0, 1, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], local25, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 1, local30);
					}
					this.anInt327 = super.anInt211;
					this.anInt328 = super.anInt212;
					this.anInt330 = 2;
					this.anInt329 = 0;
					this.aClass1_Sub1_Sub3_3.method469(46);
					this.aClass1_Sub1_Sub3_3.method471(local25 + this.anInt357);
					this.aClass1_Sub1_Sub3_3.method471(local30 + this.anInt358);
					this.aClass1_Sub1_Sub3_3.method471(local40);
					this.aClass1_Sub1_Sub3_3.method471(this.anInt270);
				}
				if (local35 == 737) {
					this.method210();
				}
				if (local35 == 131) {
					local102 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local40];
					if (local102 != null) {
						this.method150(2, 0, 0, 1, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], local102.anIntArray272[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 1, local102.anIntArray273[0]);
						this.anInt327 = super.anInt211;
						this.anInt328 = super.anInt212;
						this.anInt330 = 2;
						this.anInt329 = 0;
						this.aClass1_Sub1_Sub3_3.method469(189);
						this.aClass1_Sub1_Sub3_3.method471(local40);
						this.aClass1_Sub1_Sub3_3.method471(this.anInt270);
					}
				}
				@Pc(899) Class6 local899;
				@Pc(917) int local917;
				if (local35 == 435) {
					this.aClass1_Sub1_Sub3_3.method469(107);
					this.aClass1_Sub1_Sub3_3.method471(local30);
					local899 = Class6.aClass6Array1[local30];
					if (local899.anIntArrayArray7 != null && local899.anIntArrayArray7[0][0] == 5) {
						local917 = local899.anIntArrayArray7[0][1];
						this.anIntArray45[local917] = 1 - this.anIntArray45[local917];
						this.method130(local917);
						this.aBoolean85 = true;
					}
				}
				if (local35 == 721) {
					anInt375 += local30;
					if (anInt375 >= 139) {
						this.aClass1_Sub1_Sub3_3.method469(73);
						this.aClass1_Sub1_Sub3_3.method474(0);
					}
					this.method115(local25, local30, 187, local40);
				}
				if (local35 == 899 && this.method115(local25, local30, 156, local40)) {
					this.aClass1_Sub1_Sub3_3.method471(this.anInt270);
				}
				if (local35 == 810 && this.method115(local25, local30, 111, local40)) {
					this.aClass1_Sub1_Sub3_3.method471(this.anInt412);
					this.aClass1_Sub1_Sub3_3.method471(this.anInt410);
					this.aClass1_Sub1_Sub3_3.method471(this.anInt411);
				}
				if (local35 == 1381) {
					@Pc(1012) int local1012 = local40 >> 14 & 0x7FFF;
					@Pc(1015) Class9 local1015 = Class9.method288(local1012);
					if (local1015.aByteArray4 == null) {
						local75 = "It's a " + local1015.aString23 + ".";
					} else {
						local75 = new String(local1015.aByteArray4);
					}
					this.method204("", 0, local75);
				}
				if (local35 == 625) {
					this.method115(local25, local30, 85, local40);
				}
				if (local35 == 582 || local35 == 113 || local35 == 555 || local35 == 331 || local35 == 354) {
					if (local35 == 331) {
						this.aClass1_Sub1_Sub3_3.method469(112);
					}
					if (local35 == 555) {
						this.aClass1_Sub1_Sub3_3.method469(86);
					}
					if (local35 == 582) {
						if ((local40 & 0x3) == 0) {
							anInt247++;
						}
						if (anInt247 >= 133) {
							this.aClass1_Sub1_Sub3_3.method469(134);
							this.aClass1_Sub1_Sub3_3.method471(6118);
						}
						this.aClass1_Sub1_Sub3_3.method469(202);
					}
					if (local35 == 113) {
						this.aClass1_Sub1_Sub3_3.method469(105);
					}
					if (local35 == 354) {
						this.aClass1_Sub1_Sub3_3.method469(255);
					}
					this.aClass1_Sub1_Sub3_3.method471(local40);
					this.aClass1_Sub1_Sub3_3.method471(local25);
					this.aClass1_Sub1_Sub3_3.method471(local30);
					this.anInt345 = 0;
					this.anInt346 = local30;
					this.anInt347 = local25;
					this.anInt348 = 2;
					if (Class6.aClass6Array1[local30].anInt432 == this.anInt218) {
						this.anInt348 = 1;
					}
					if (Class6.aClass6Array1[local30].anInt432 == this.anInt278) {
						this.anInt348 = 3;
					}
				}
				@Pc(1190) String local1190;
				@Pc(1205) long local1205;
				if (local35 == 605 || local35 == 47 || local35 == 513 || local35 == 884) {
					local1190 = this.aStringArray3[arg0];
					local917 = local1190.indexOf("@whi@");
					if (local917 != -1) {
						local1205 = Class48.method667(local1190.substring(local917 + 5).trim());
						if (local35 == 605) {
							this.method144(local1205);
						}
						if (local35 == 47) {
							this.method229(local1205, this.aBoolean84);
						}
						if (local35 == 513) {
							this.method205(local1205, 545);
						}
						if (local35 == 884) {
							this.method179(local1205);
						}
					}
				}
				@Pc(1271) int local1271;
				if (local35 == 507 || local35 == 957) {
					local1190 = this.aStringArray3[arg0];
					local917 = local1190.indexOf("@whi@");
					if (local917 != -1) {
						local1190 = local1190.substring(local917 + 5).trim();
						local75 = Class48.method671(Class48.method668(this.anInt419, Class48.method667(local1190)));
						@Pc(1269) boolean local1269 = false;
						for (local1271 = 0; local1271 < this.anInt352; local1271++) {
							@Pc(1281) Class1_Sub1_Sub1_Sub1_Sub1 local1281 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray66[local1271]];
							if (local1281 != null && local1281.aString3 != null && local1281.aString3.equalsIgnoreCase(local75)) {
								this.method150(2, 0, 0, 1, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], local1281.anIntArray272[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 1, local1281.anIntArray273[0]);
								if (local35 == 507) {
									anInt426 += local40;
									if (anInt426 >= 66) {
										this.aClass1_Sub1_Sub3_3.method469(246);
										this.aClass1_Sub1_Sub3_3.method470(154);
									}
									this.aClass1_Sub1_Sub3_3.method469(171);
								}
								if (local35 == 957) {
									anInt308++;
									if (anInt308 >= 52) {
										this.aClass1_Sub1_Sub3_3.method469(210);
										this.aClass1_Sub1_Sub3_3.method470(131);
									}
									this.aClass1_Sub1_Sub3_3.method469(38);
								}
								this.aClass1_Sub1_Sub3_3.method471(this.anIntArray66[local1271]);
								local1269 = true;
								break;
							}
						}
						if (!local1269) {
							this.method204("", 0, "Unable to find " + local75);
						}
					}
				}
				if (local35 == 694 || local35 == 962 || local35 == 795 || local35 == 681 || local35 == 100) {
					if (local35 == 681) {
						anInt254++;
						if (anInt254 >= 116) {
							this.aClass1_Sub1_Sub3_3.method469(252);
							this.aClass1_Sub1_Sub3_3.method473(13018169);
						}
						this.aClass1_Sub1_Sub3_3.method469(76);
					}
					if (local35 == 962) {
						this.aClass1_Sub1_Sub3_3.method469(149);
					}
					if (local35 == 795) {
						this.aClass1_Sub1_Sub3_3.method469(219);
					}
					if (local35 == 100) {
						this.aClass1_Sub1_Sub3_3.method469(215);
					}
					if (local35 == 694) {
						this.aClass1_Sub1_Sub3_3.method469(88);
					}
					this.aClass1_Sub1_Sub3_3.method471(local40);
					this.aClass1_Sub1_Sub3_3.method471(local25);
					this.aClass1_Sub1_Sub3_3.method471(local30);
					this.anInt345 = 0;
					this.anInt346 = local30;
					this.anInt347 = local25;
					this.anInt348 = 2;
					if (Class6.aClass6Array1[local30].anInt432 == this.anInt218) {
						this.anInt348 = 1;
					}
					if (Class6.aClass6Array1[local30].anInt432 == this.anInt278) {
						this.anInt348 = 3;
					}
				}
				if (local35 == 902) {
					local1190 = this.aStringArray3[arg0];
					local917 = local1190.indexOf("@whi@");
					if (local917 != -1) {
						local1205 = Class48.method667(local1190.substring(local917 + 5).trim());
						local1271 = -1;
						for (@Pc(1538) int local1538 = 0; local1538 < this.anInt231; local1538++) {
							if (this.aLongArray4[local1538] == local1205) {
								local1271 = local1538;
								break;
							}
						}
						if (local1271 != -1 && this.anIntArray70[local1271] > 0) {
							this.aBoolean80 = true;
							this.aBoolean60 = false;
							this.aBoolean82 = true;
							this.aString12 = "";
							this.anInt229 = 3;
							this.aLong16 = this.aLongArray4[local1271];
							this.aString8 = "Enter message to send to " + this.aStringArray6[local1271];
						}
					}
				}
				if (local35 == 398) {
					this.aClass1_Sub1_Sub3_3.method469(93);
					this.aClass1_Sub1_Sub3_3.method471(local40);
					this.aClass1_Sub1_Sub3_3.method471(local25);
					this.aClass1_Sub1_Sub3_3.method471(local30);
					this.aClass1_Sub1_Sub3_3.method471(this.anInt412);
					this.aClass1_Sub1_Sub3_3.method471(this.anInt410);
					this.aClass1_Sub1_Sub3_3.method471(this.anInt411);
					this.anInt345 = 0;
					this.anInt346 = local30;
					this.anInt347 = local25;
					this.anInt348 = 2;
					if (Class6.aClass6Array1[local30].anInt432 == this.anInt218) {
						this.anInt348 = 1;
					}
					if (Class6.aClass6Array1[local30].anInt432 == this.anInt278) {
						this.anInt348 = 3;
					}
				}
				if (local35 == 225) {
					this.aClass1_Sub1_Sub3_3.method469(107);
					this.aClass1_Sub1_Sub3_3.method471(local30);
					local899 = Class6.aClass6Array1[local30];
					if (local899.anIntArrayArray7 != null && local899.anIntArrayArray7[0][0] == 5) {
						local917 = local899.anIntArrayArray7[0][1];
						if (this.anIntArray45[local917] != local899.anIntArray97[0]) {
							this.anIntArray45[local917] = local899.anIntArray97[0];
							this.method130(local917);
							this.aBoolean85 = true;
						}
					}
				}
				if (local35 == 829) {
					local52 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local40];
					if (local52 != null) {
						this.method150(2, 0, 0, 1, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], local52.anIntArray272[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 1, local52.anIntArray273[0]);
						this.anInt327 = super.anInt211;
						this.anInt328 = super.anInt212;
						this.anInt330 = 2;
						this.anInt329 = 0;
						this.aClass1_Sub1_Sub3_3.method469(120);
						this.aClass1_Sub1_Sub3_3.method471(local40);
						this.aClass1_Sub1_Sub3_3.method471(this.anInt412);
						this.aClass1_Sub1_Sub3_3.method471(this.anInt410);
						this.aClass1_Sub1_Sub3_3.method471(this.anInt411);
					}
				}
				if (local35 == 524) {
					local1190 = this.aStringArray3[arg0];
					local917 = local1190.indexOf("@whi@");
					if (local917 != -1) {
						if (this.anInt218 == -1) {
							this.method210();
							this.aString14 = local1190.substring(local917 + 5).trim();
							this.aBoolean73 = false;
							for (@Pc(1832) int local1832 = 0; local1832 < Class6.aClass6Array1.length; local1832++) {
								if (Class6.aClass6Array1[local1832] != null && Class6.aClass6Array1[local1832].anInt435 == 600) {
									this.anInt241 = this.anInt218 = Class6.aClass6Array1[local1832].anInt432;
									break;
								}
							}
						} else {
							this.method204("", 0, "Please close the interface you have open before using 'report abuse'");
						}
					}
				}
				if (local35 == 274) {
					local899 = Class6.aClass6Array1[local30];
					this.anInt269 = 1;
					this.anInt270 = local30;
					this.anInt271 = local899.anInt459;
					this.anInt409 = 0;
					this.aBoolean85 = true;
					local454 = local899.aString20;
					if (local454.indexOf(" ") != -1) {
						local454 = local454.substring(0, local454.indexOf(" "));
					}
					local75 = local899.aString20;
					if (local75.indexOf(" ") != -1) {
						local75 = local75.substring(local75.indexOf(" ") + 1);
					}
					this.aString5 = local454 + " " + local899.aString21 + " " + local75;
					if (this.anInt271 == 16) {
						this.aBoolean85 = true;
						this.anInt321 = 3;
						this.aBoolean62 = true;
					}
				} else {
					if (local35 == 242 || local35 == 209 || local35 == 309 || local35 == 852 || local35 == 793) {
						local52 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local40];
						if (local52 != null) {
							this.method150(2, 0, 0, 1, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], local52.anIntArray272[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 1, local52.anIntArray273[0]);
							this.anInt327 = super.anInt211;
							this.anInt328 = super.anInt212;
							this.anInt330 = 2;
							this.anInt329 = 0;
							if (local35 == 852) {
								this.aClass1_Sub1_Sub3_3.method469(50);
							}
							if (local35 == 209) {
								this.aClass1_Sub1_Sub3_3.method469(64);
							}
							if (local35 == 242) {
								this.aClass1_Sub1_Sub3_3.method469(138);
							}
							if (local35 == 793) {
								this.aClass1_Sub1_Sub3_3.method469(196);
							}
							if (local35 == 309) {
								this.aClass1_Sub1_Sub3_3.method469(99);
							}
							this.aClass1_Sub1_Sub3_3.method471(local40);
						}
					}
					if (local35 == 231) {
						local899 = Class6.aClass6Array1[local30];
						@Pc(2069) boolean local2069 = true;
						if (local899.anInt435 > 0) {
							local2069 = this.method153(local899);
						}
						if (local2069) {
							this.aClass1_Sub1_Sub3_3.method469(107);
							this.aClass1_Sub1_Sub3_3.method471(local30);
						}
					}
					if (local35 == 997 && !this.aBoolean63) {
						this.aClass1_Sub1_Sub3_3.method469(27);
						this.aClass1_Sub1_Sub3_3.method471(local30);
						this.aBoolean63 = true;
					}
					if (local35 == 639 || local35 == 499 || local35 == 27 || local35 == 387 || local35 == 185) {
						local102 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local40];
						if (local102 != null) {
							this.method150(2, 0, 0, 1, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], local102.anIntArray272[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 1, local102.anIntArray273[0]);
							this.anInt327 = super.anInt211;
							this.anInt328 = super.anInt212;
							this.anInt330 = 2;
							this.anInt329 = 0;
							if (local35 == 499) {
								this.aClass1_Sub1_Sub3_3.method469(124);
							}
							if (local35 == 639) {
								anInt308++;
								if (anInt308 >= 52) {
									this.aClass1_Sub1_Sub3_3.method469(210);
									this.aClass1_Sub1_Sub3_3.method470(131);
								}
								this.aClass1_Sub1_Sub3_3.method469(38);
							}
							if (local35 == 27) {
								this.aClass1_Sub1_Sub3_3.method469(123);
							}
							if (local35 == 387) {
								anInt426 += local40;
								if (anInt426 >= 66) {
									this.aClass1_Sub1_Sub3_3.method469(246);
									this.aClass1_Sub1_Sub3_3.method470(154);
								}
								this.aClass1_Sub1_Sub3_3.method469(171);
							}
							if (local35 == 185) {
								this.aClass1_Sub1_Sub3_3.method469(89);
							}
							this.aClass1_Sub1_Sub3_3.method471(local40);
						}
					}
					if (local35 == 102) {
						this.anInt409 = 1;
						this.anInt410 = local25;
						this.anInt411 = local30;
						this.anInt412 = local40;
						this.aString16 = Class15.method361(local40).aString25;
						this.anInt269 = 0;
						this.aBoolean85 = true;
					} else {
						if (local35 == 743) {
							anInt274++;
							if (anInt274 >= 124) {
								this.aClass1_Sub1_Sub3_3.method469(129);
								this.aClass1_Sub1_Sub3_3.method471(37954);
							}
							this.method115(local25, local30, 250, local40);
						}
						this.anInt409 = 0;
						this.anInt269 = 0;
						this.aBoolean85 = true;
					}
				}
			}
		} catch (@Pc(2310) RuntimeException local2310) {
			signlink.reporterror("97010, " + arg0 + ", " + false + ", " + local2310.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!lb;B)V")
	private void method126(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			arg1.method490();
			@Pc(16) int local16 = arg1.method491(8);
			@Pc(22) int local22;
			if (local16 < this.anInt283) {
				for (local22 = local16; local22 < this.anInt283; local22++) {
					this.anIntArray65[this.anInt334++] = this.anIntArray48[local22];
				}
			}
			if (local16 > this.anInt283) {
				signlink.reporterror(this.aString10 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt283 = 0;
			for (local22 = 0; local22 < local16; local22++) {
				@Pc(74) int local74 = this.anIntArray48[local22];
				@Pc(79) Class1_Sub1_Sub1_Sub1_Sub2 local79 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local74];
				@Pc(84) int local84 = arg1.method491(1);
				if (local84 == 0) {
					this.anIntArray48[this.anInt283++] = local74;
					local79.anInt1045 = anInt248;
				} else {
					@Pc(107) int local107 = arg1.method491(2);
					if (local107 == 0) {
						this.anIntArray48[this.anInt283++] = local74;
						local79.anInt1045 = anInt248;
						this.anIntArray67[this.anInt353++] = local74;
					} else {
						@Pc(158) int local158;
						@Pc(168) int local168;
						if (local107 == 1) {
							this.anIntArray48[this.anInt283++] = local74;
							local79.anInt1045 = anInt248;
							local158 = arg1.method491(3);
							local79.method678(local158, false);
							local168 = arg1.method491(1);
							if (local168 == 1) {
								this.anIntArray67[this.anInt353++] = local74;
							}
						} else if (local107 == 2) {
							this.anIntArray48[this.anInt283++] = local74;
							local79.anInt1045 = anInt248;
							local158 = arg1.method491(3);
							local79.method678(local158, true);
							local168 = arg1.method491(3);
							local79.method678(local168, true);
							@Pc(226) int local226 = arg1.method491(1);
							if (local226 == 1) {
								this.anIntArray67[this.anInt353++] = local74;
							}
						} else if (local107 == 3) {
							this.anIntArray65[this.anInt334++] = local74;
						}
					}
				}
			}
		} catch (@Pc(263) RuntimeException local263) {
			signlink.reporterror("92637, " + arg0 + ", " + arg1 + ", " + 5 + ", " + local263.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method127() {
		try {
			this.aBoolean64 = true;
			for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
				this.anIntArray83[local12] = -1;
				for (@Pc(21) int local21 = 0; local21 < Class23.anInt760; local21++) {
					if (!Class23.aClass23Array1[local21].aBoolean198 && Class23.aClass23Array1[local21].anInt761 == local12 + (this.aBoolean51 ? 0 : 7)) {
						this.anIntArray83[local12] = local21;
						break;
					}
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("37633, " + -35064 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;II)V")
	@Override
	protected void method96(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt301 = arg1;
			this.aString13 = arg0;
			this.method154();
			if (this.aClass47_1 == null) {
				super.method96(arg0, arg1);
			} else {
				this.aClass35_5.method524();
				this.aClass1_Sub1_Sub2_Sub4_3.method447(16777215, 54, 180, "RuneScape is loading - please wait...");
				Class1_Sub1_Sub2.method440(304, 34, 28, 62, 9179409);
				Class1_Sub1_Sub2.method440(302, 32, 29, 63, 0);
				Class1_Sub1_Sub2.method439(30, arg1 * 3, 9179409, 30, 64);
				Class1_Sub1_Sub2.method439(arg1 * 3 + 30, 300 - arg1 * 3, 0, 30, 64);
				this.aClass1_Sub1_Sub2_Sub4_3.method447(16777215, 85, 180, arg0);
				this.aClass35_5.method525(202, 171, (byte) 3, super.aGraphics2);
				if (this.aBoolean69) {
					this.aBoolean69 = false;
					if (!this.aBoolean79) {
						this.aClass35_6.method525(0, 0, (byte) 3, super.aGraphics2);
						this.aClass35_7.method525(637, 0, (byte) 3, super.aGraphics2);
					}
					this.aClass35_3.method525(128, 0, (byte) 3, super.aGraphics2);
					this.aClass35_4.method525(202, 371, (byte) 3, super.aGraphics2);
					this.aClass35_8.method525(0, 265, (byte) 3, super.aGraphics2);
					this.aClass35_9.method525(562, 265, (byte) 3, super.aGraphics2);
					this.aClass35_10.method525(128, 171, (byte) 3, super.aGraphics2);
					this.aClass35_11.method525(562, 171, (byte) 3, super.aGraphics2);
				}
			}
		} catch (@Pc(216) RuntimeException local216) {
			signlink.reporterror("32830, " + arg0 + ", " + arg1 + ", " + -427 + ", " + local216.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method128() {
		try {
			@Pc(8) int local8;
			if (this.anInt339 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt339 > 768) {
						this.anIntArray86[local8] = this.method225(this.anIntArray87[local8], this.anIntArray88[local8], 1024 - this.anInt339);
					} else if (this.anInt339 > 256) {
						this.anIntArray86[local8] = this.anIntArray88[local8];
					} else {
						this.anIntArray86[local8] = this.method225(this.anIntArray88[local8], this.anIntArray87[local8], 256 - this.anInt339);
					}
				}
			} else if (this.anInt340 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt340 > 768) {
						this.anIntArray86[local8] = this.method225(this.anIntArray87[local8], this.anIntArray89[local8], 1024 - this.anInt340);
					} else if (this.anInt340 > 256) {
						this.anIntArray86[local8] = this.anIntArray89[local8];
					} else {
						this.anIntArray86[local8] = this.method225(this.anIntArray89[local8], this.anIntArray87[local8], 256 - this.anInt340);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray86[local8] = this.anIntArray87[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass35_6.anIntArray231[local8] = this.aClass1_Sub1_Sub2_Sub2_1.anIntArray208[local8];
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
				local198 = this.anIntArray46[local185] * (256 - local185) / 256;
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
						local220 = this.anIntArray86[local220];
						local239 = this.aClass35_6.anIntArray231[local183];
						this.aClass35_6.anIntArray231[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			this.aBoolean59 &= true;
			this.aClass35_6.method525(0, 0, (byte) 3, super.aGraphics2);
			for (local198 = 0; local198 < 33920; local198++) {
				this.aClass35_7.anIntArray231[local198] = this.aClass1_Sub1_Sub2_Sub2_2.anIntArray208[local198];
			}
			local181 = 0;
			local183 = 1176;
			for (local202 = 1; local202 < 255; local202++) {
				local212 = this.anIntArray46[local202] * (256 - local202) / 256;
				local220 = 103 - local212;
				local183 += local212;
				for (local224 = 0; local224 < local220; local224++) {
					local228 = this.anIntArray54[local181++];
					if (local228 == 0) {
						local183++;
					} else {
						local239 = local228;
						@Pc(368) int local368 = 256 - local228;
						local228 = this.anIntArray86[local228];
						@Pc(379) int local379 = this.aClass35_7.anIntArray231[local183];
						this.aClass35_7.anIntArray231[local183++] = ((local228 & 0xFF00FF) * local239 + (local379 & 0xFF00FF) * local368 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local379 & 0xFF00) * local368 & 0xFF0000) >> 8;
					}
				}
				local181 += 128 - local220;
				local183 += 128 - local220 - local212;
			}
			this.aClass35_7.method525(637, 0, (byte) 3, super.aGraphics2);
		} catch (@Pc(451) RuntimeException local451) {
			signlink.reporterror("16594, " + true + ", " + local451.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt255 = Integer.parseInt(this.getParameter("nodeid"));
		anInt256 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method129();
		} else {
			method167();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean55 = false;
		} else {
			aBoolean55 = true;
		}
		this.method85();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method130(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) int local4 = Class39.aClass39Array1[arg0].anInt909;
			if (local4 != 0) {
				@Pc(12) int local12 = this.anIntArray45[arg0];
				if (local4 == 1) {
					if (local12 == 1) {
						Class1_Sub1_Sub2_Sub1.method351(0.9D);
					}
					if (local12 == 2) {
						Class1_Sub1_Sub2_Sub1.method351(0.8D);
					}
					if (local12 == 3) {
						Class1_Sub1_Sub2_Sub1.method351(0.7D);
					}
					if (local12 == 4) {
						Class1_Sub1_Sub2_Sub1.method351(0.6D);
					}
					Class15.aClass40_8.method593();
					this.aBoolean69 = true;
				}
				if (local4 == 3) {
					@Pc(56) boolean local56 = this.aBoolean61;
					if (local12 == 0) {
						this.method142(0, this.aBoolean61);
						this.aBoolean61 = true;
					}
					if (local12 == 1) {
						this.method142(-400, this.aBoolean61);
						this.aBoolean61 = true;
					}
					if (local12 == 2) {
						this.method142(-800, this.aBoolean61);
						this.aBoolean61 = true;
					}
					if (local12 == 3) {
						this.method142(-1200, this.aBoolean61);
						this.aBoolean61 = true;
					}
					if (local12 == 4) {
						this.aBoolean61 = false;
					}
					if (this.aBoolean61 != local56 && !aBoolean56) {
						if (this.aBoolean61) {
							this.anInt361 = this.anInt398;
							this.aBoolean75 = true;
							this.aClass44_Sub1_1.method645(2, this.anInt361);
						} else {
							this.method135(this.anInt393);
						}
						this.anInt228 = 0;
					}
				}
				if (local4 == 4) {
					if (local12 == 0) {
						this.aBoolean93 = true;
						this.method162(0);
					}
					if (local12 == 1) {
						this.aBoolean93 = true;
						this.method162(-400);
					}
					if (local12 == 2) {
						this.aBoolean93 = true;
						this.method162(-800);
					}
					if (local12 == 3) {
						this.aBoolean93 = true;
						this.method162(-1200);
					}
					if (local12 == 4) {
						this.aBoolean93 = false;
					}
				}
				if (local4 == 5) {
					this.anInt225 = local12;
				}
				if (local4 == 6) {
					this.anInt401 = local12;
				}
				if (local4 == 8) {
					this.anInt280 = local12;
					this.aBoolean80 = true;
				}
				if (local4 == 9) {
					this.anInt309 = local12;
				}
			}
		} catch (@Pc(217) RuntimeException local217) {
			signlink.reporterror("95285, " + arg0 + ", " + 35227 + ", " + local217.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)V")
	private void method131(@OriginalArg(0) String arg0) {
		System.out.println(arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "loaderror_" + arg0 + ".html"));
		} catch (@Pc(21) Exception local21) {
			local21.printStackTrace();
		}
		while (true) {
			while (true) {
				try {
					Thread.sleep(1000L);
				} catch (@Pc(28) Exception local28) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method132() {
		try {
			@Pc(6) int local6 = this.anInt292 * 128 + 64;
			@Pc(13) int local13 = this.anInt293 * 128 + 64;
			@Pc(24) int local24 = this.method218(local6, local13, this.anInt325) - this.anInt294;
			if (this.anInt262 < local6) {
				this.anInt262 += this.anInt295 + (local6 - this.anInt262) * this.anInt296 / 1000;
				if (this.anInt262 > local6) {
					this.anInt262 = local6;
				}
			}
			if (this.anInt262 > local6) {
				this.anInt262 -= this.anInt295 + (this.anInt262 - local6) * this.anInt296 / 1000;
				if (this.anInt262 < local6) {
					this.anInt262 = local6;
				}
			}
			if (this.anInt263 < local24) {
				this.anInt263 += this.anInt295 + (local24 - this.anInt263) * this.anInt296 / 1000;
				if (this.anInt263 > local24) {
					this.anInt263 = local24;
				}
			}
			if (this.anInt263 > local24) {
				this.anInt263 -= this.anInt295 + (this.anInt263 - local24) * this.anInt296 / 1000;
				if (this.anInt263 < local24) {
					this.anInt263 = local24;
				}
			}
			if (this.anInt264 < local13) {
				this.anInt264 += this.anInt295 + (local13 - this.anInt264) * this.anInt296 / 1000;
				if (this.anInt264 > local13) {
					this.anInt264 = local13;
				}
			}
			if (this.anInt264 > local13) {
				this.anInt264 -= this.anInt295 + (this.anInt264 - local13) * this.anInt296 / 1000;
				if (this.anInt264 < local13) {
					this.anInt264 = local13;
				}
			}
			local6 = this.anInt219 * 128 + 64;
			local13 = this.anInt220 * 128 + 64;
			local24 = this.method218(local6, local13, this.anInt325) - this.anInt221;
			@Pc(222) int local222 = local6 - this.anInt262;
			@Pc(227) int local227 = local24 - this.anInt263;
			@Pc(232) int local232 = local13 - this.anInt264;
			@Pc(243) int local243 = (int) Math.sqrt((double) (local222 * local222 + local232 * local232));
			@Pc(254) int local254 = (int) (Math.atan2((double) local227, (double) local243) * 325.949D) & 0x7FF;
			@Pc(273) int local273 = (int) (Math.atan2((double) local222, (double) local232) * -325.949D) & 0x7FF;
			if (local254 < 128) {
				local254 = 128;
			}
			if (local254 > 383) {
				local254 = 383;
			}
			if (this.anInt265 < local254) {
				this.anInt265 += this.anInt222 + (local254 - this.anInt265) * this.anInt223 / 1000;
				if (this.anInt265 > local254) {
					this.anInt265 = local254;
				}
			}
			if (this.anInt265 > local254) {
				this.anInt265 -= this.anInt222 + (this.anInt265 - local254) * this.anInt223 / 1000;
				if (this.anInt265 < local254) {
					this.anInt265 = local254;
				}
			}
			@Pc(344) int local344 = local273 - this.anInt266;
			if (local344 > 1024) {
				local344 -= 2048;
			}
			if (local344 < -1024) {
				local344 += 2048;
			}
			if (local344 > 0) {
				this.anInt266 += this.anInt222 + local344 * this.anInt223 / 1000;
				this.anInt266 &= 0x7FF;
			}
			if (local344 < 0) {
				this.anInt266 -= this.anInt222 + -local344 * this.anInt223 / 1000;
				this.anInt266 &= 0x7FF;
			}
			@Pc(402) int local402 = local273 - this.anInt266;
			if (local402 > 1024) {
				local402 -= 2048;
			}
			if (local402 < -1024) {
				local402 += 2048;
			}
			if (local402 < 0 && local344 > 0 || local402 > 0 && local344 < 0) {
				this.anInt266 = local273;
			}
		} catch (@Pc(423) RuntimeException local423) {
			signlink.reporterror("88944, " + 3 + ", " + local423.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BIZ)V")
	private void method133(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		try {
			if (arg1 >= 0) {
				this.anInt383 = -1;
			}
			signlink.anInt957 = arg2 ? 1 : 0;
			signlink.midisave(arg0, arg0.length);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("39094, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method134() {
		try {
			this.anInt396 = 0;
			@Pc(24) int local24 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1005 >> 7) + this.anInt357;
			@Pc(32) int local32 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1006 >> 7) + this.anInt358;
			if (local24 >= 3053 && local24 <= 3156 && local32 >= 3056 && local32 <= 3136) {
				this.anInt396 = 1;
			}
			if (local24 >= 3072 && local24 <= 3118 && local32 >= 9492 && local32 <= 9535) {
				this.anInt396 = 1;
			}
			if (this.anInt396 == 1 && local24 >= 3139 && local24 <= 3199 && local32 >= 3008 && local32 <= 3062) {
				this.anInt396 = 0;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("67554, " + 4 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method135(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 0) {
				signlink.anInt957 = 0;
				signlink.midi = "stop";
			}
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("22148, " + arg0 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method136(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			while (true) {
				@Pc(9) Class1_Sub1_Sub4 local9 = this.aClass44_Sub1_1.method647();
				if (local9 == null) {
					return;
				}
				if (local9.anInt781 == 0) {
					Class1_Sub1_Sub1_Sub5.method259(local9.anInt782, (byte) 3, local9.aByteArray10);
					if ((this.aClass44_Sub1_1.method643(local9.anInt782, (byte) 6) & 0x62) != 0) {
						this.aBoolean85 = true;
						if (this.anInt278 != -1) {
							this.aBoolean80 = true;
						}
					}
				}
				if (local9.anInt781 == 1 && local9.aByteArray10 != null) {
					Class12.method303(local9.aByteArray10);
				}
				if (local9.anInt781 == 2 && local9.anInt782 == this.anInt361 && local9.aByteArray10 != null) {
					this.method133(local9.aByteArray10, this.anInt287, this.aBoolean75);
				}
				if (local9.anInt781 == 3 && this.anInt404 == 1) {
					for (@Pc(81) int local81 = 0; local81 < this.aByteArrayArray2.length; local81++) {
						if (this.anIntArray52[local81] == local9.anInt782) {
							this.aByteArrayArray2[local81] = local9.aByteArray10;
							if (local9.aByteArray10 == null) {
								this.anIntArray52[local81] = -1;
							}
							break;
						}
						if (this.anIntArray53[local81] == local9.anInt782) {
							this.aByteArrayArray1[local81] = local9.aByteArray10;
							if (local9.aByteArray10 == null) {
								this.anIntArray53[local81] = -1;
							}
							break;
						}
					}
				}
				if (local9.anInt781 == 93 && this.aClass44_Sub1_1.method642(local9.anInt782)) {
					Class4.method59(new Class1_Sub1_Sub3(anInt417, local9.aByteArray10), this.aClass44_Sub1_1);
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("24144, " + arg0 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!d;)Z")
	private boolean method137(@OriginalArg(1) Class6 arg0) {
		try {
			if (arg0.anIntArray96 == null) {
				return false;
			}
			for (@Pc(18) int local18 = 0; local18 < arg0.anIntArray96.length; local18++) {
				@Pc(26) int local26 = this.method146(local18, arg0);
				@Pc(31) int local31 = arg0.anIntArray97[local18];
				if (arg0.anIntArray96[local18] == 2) {
					if (local26 >= local31) {
						return false;
					}
				} else if (arg0.anIntArray96[local18] == 3) {
					if (local26 <= local31) {
						return false;
					}
				} else if (arg0.anIntArray96[local18] == 4) {
					if (local26 == local31) {
						return false;
					}
				} else if (local26 != local31) {
					return false;
				}
			}
			return true;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("71636, " + -76 + ", " + arg0 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method138() {
		try {
			if (this.anInt404 == 2) {
				for (@Pc(18) Class1_Sub2 local18 = (Class1_Sub2) this.aClass29_1.method511(); local18 != null; local18 = (Class1_Sub2) this.aClass29_1.method513()) {
					if (local18.anInt803 > 0) {
						local18.anInt803--;
					}
					if (local18.anInt803 != 0) {
						if (local18.anInt802 > 0) {
							local18.anInt802--;
						}
						if (local18.anInt802 == 0 && local18.anInt794 >= 1 && local18.anInt795 >= 1 && local18.anInt794 <= 102 && local18.anInt795 <= 102 && (local18.anInt799 < 0 || Class4.method72(local18.anInt801, local18.anInt799))) {
							this.method180(local18.anInt795, local18.anInt794, local18.anInt793, local18.anInt800, local18.anInt792, local18.anInt801, local18.anInt799);
							local18.anInt802 = -1;
							if (local18.anInt799 == local18.anInt796 && local18.anInt796 == -1) {
								local18.method673();
							} else if (local18.anInt799 == local18.anInt796 && local18.anInt800 == local18.anInt797 && local18.anInt801 == local18.anInt798) {
								local18.method673();
							}
						}
					} else if (local18.anInt796 < 0 || Class4.method72(local18.anInt798, local18.anInt796)) {
						this.method180(local18.anInt795, local18.anInt794, local18.anInt793, local18.anInt797, local18.anInt792, local18.anInt798, local18.anInt796);
						local18.method673();
					}
				}
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("79558, " + 0 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method90() {
		try {
			if (!this.aBoolean88 && !this.aBoolean57 && !this.aBoolean86) {
				anInt248++;
				if (this.aBoolean59) {
					this.method201();
				} else {
					this.method121();
				}
				this.method136(414);
				this.anInt382 += 0;
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("90381, " + 0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method139(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass1_Sub1_Sub2_Sub2_8.anIntArray208;
			this.anInt382 += 0;
			@Pc(14) int local14 = local5.length;
			for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
				local5[local16] = 0;
			}
			@Pc(40) int local40;
			@Pc(42) int local42;
			for (@Pc(28) int local28 = 1; local28 < 103; local28++) {
				local40 = (103 - local28) * 512 * 4 + 24628;
				for (local42 = 1; local42 < 103; local42++) {
					if ((this.aByteArrayArrayArray7[arg0][local42][local28] & 0x18) == 0) {
						this.aClass37_1.method565(local5, local40, arg0, local42, local28);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local42][local28] & 0x8) != 0) {
						this.aClass37_1.method565(local5, local40, arg0 + 1, local42, local28);
					}
					local40 += 4;
				}
			}
			local40 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local42 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass1_Sub1_Sub2_Sub2_8.method386();
			@Pc(152) int local152;
			for (@Pc(148) int local148 = 1; local148 < 103; local148++) {
				for (local152 = 1; local152 < 103; local152++) {
					if ((this.aByteArrayArrayArray7[arg0][local152][local148] & 0x18) == 0) {
						this.method202(local42, local148, arg0, local152, local40);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local152][local148] & 0x8) != 0) {
						this.method202(local42, local148, arg0 + 1, local152, local40);
					}
				}
			}
			this.aClass35_26.method524();
			this.anInt390 = 0;
			for (local152 = 0; local152 < 104; local152++) {
				for (@Pc(220) int local220 = 0; local220 < 104; local220++) {
					@Pc(230) int local230 = this.aClass37_1.method559(this.anInt325, local152, local220);
					if (local230 != 0) {
						local230 = local230 >> 14 & 0x7FFF;
						@Pc(242) int local242 = Class9.method288(local230).anInt521;
						if (local242 >= 0) {
							@Pc(246) int local246 = local152;
							@Pc(248) int local248 = local220;
							if (local242 != 22 && local242 != 29 && local242 != 34 && local242 != 36 && local242 != 46 && local242 != 47 && local242 != 48) {
								@Pc(280) int[][] local280 = this.aClass19Array1[this.anInt325].anIntArrayArray18;
								for (@Pc(282) int local282 = 0; local282 < 10; local282++) {
									@Pc(289) int local289 = (int) (Math.random() * 4.0D);
									if (local289 == 0 && local246 > 0 && local246 > local152 - 3 && (local280[local246 - 1][local248] & 0x280108) == 0) {
										local246--;
									}
									if (local289 == 1 && local246 < 103 && local246 < local152 + 3 && (local280[local246 + 1][local248] & 0x280180) == 0) {
										local246++;
									}
									if (local289 == 2 && local248 > 0 && local248 > local220 - 3 && (local280[local246][local248 - 1] & 0x280102) == 0) {
										local248--;
									}
									if (local289 == 3 && local248 < 103 && local248 < local220 + 3 && (local280[local246][local248 + 1] & 0x280120) == 0) {
										local248++;
									}
								}
							}
							this.aClass1_Sub1_Sub2_Sub2Array3[this.anInt390] = this.aClass1_Sub1_Sub2_Sub2Array4[local242];
							this.anIntArray76[this.anInt390] = local246;
							this.anIntArray77[this.anInt390] = local248;
							this.anInt390++;
						}
					}
				}
			}
			anInt217++;
			if (anInt217 > 112) {
				anInt217 = 0;
				this.aClass1_Sub1_Sub3_3.method469(39);
				this.aClass1_Sub1_Sub3_3.method470(50);
			}
		} catch (@Pc(437) RuntimeException local437) {
			signlink.reporterror("29400, " + arg0 + ", " + 0 + ", " + local437.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)Z")
	private boolean method140() {
		try {
			this.aBoolean59 &= true;
			return signlink.wavereplay();
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("51814, " + true + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)Ljava/lang/String;")
	private String method141() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("45424, " + -182 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZ)V")
	private void method142(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		try {
			signlink.anInt956 = arg0;
			this.anInt382 += 0;
			if (arg1) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("75650, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!lb;IB)V")
	private void method143(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			this.anInt334 = 0;
			this.anInt353 = 0;
			this.method195(arg1, arg0);
			this.method182(arg1, arg0, 137);
			this.method177(arg1, arg0);
			this.method217(arg0, arg1);
			@Pc(36) int local36;
			for (@Pc(29) int local29 = 0; local29 < this.anInt334; local29++) {
				local36 = this.anIntArray65[local29];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local36].anInt1045 != anInt248) {
					this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local36] = null;
				}
			}
			@Pc(58) boolean local58 = false;
			if (arg0.anInt751 != arg1) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.anInt751 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local36 = 0; local36 < this.anInt352; local36++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray66[local36]] == null) {
					signlink.reporterror(this.aString10 + " null entry in pl list - pos:" + local36 + " size:" + this.anInt352);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("24592, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method144(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt231 >= 100 && this.anInt423 != 1) {
					this.method204("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
				} else if (this.anInt231 >= 200) {
					this.method204("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
				} else {
					@Pc(39) String local39 = Class48.method671(Class48.method668(this.anInt419, arg0));
					for (@Pc(41) int local41 = 0; local41 < this.anInt231; local41++) {
						if (this.aLongArray4[local41] == arg0) {
							this.method204("", 0, local39 + " is already on your friend list");
							return;
						}
					}
					for (@Pc(71) int local71 = 0; local71 < this.anInt407; local71++) {
						if (this.aLongArray3[local71] == arg0) {
							this.method204("", 0, "Please remove " + local39 + " from your ignore list first");
							return;
						}
					}
					if (!local39.equals(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3)) {
						this.aStringArray6[this.anInt231] = local39;
						this.aLongArray4[this.anInt231] = arg0;
						this.anIntArray70[this.anInt231] = 0;
						this.anInt231++;
						this.aBoolean85 = true;
						this.aClass1_Sub1_Sub3_3.method469(176);
						this.aClass1_Sub1_Sub3_3.method476(arg0, aBoolean90);
					}
				}
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("93861, " + 0 + ", " + arg0 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method145(@OriginalArg(0) byte arg0) {
		try {
			if (this.anInt409 == 0 && this.anInt269 == 0) {
				this.aStringArray3[this.anInt290] = "Walk here";
				this.anIntArray37[this.anInt290] = 718;
				this.anIntArray35[this.anInt290] = super.anInt205;
				this.anIntArray36[this.anInt290] = super.anInt206;
				this.anInt290++;
			}
			@Pc(41) int local41 = -1;
			if (this.aByte2 == 9) {
				@Pc(47) boolean local47 = false;
			} else {
				this.anInt365 = -409;
			}
			for (@Pc(54) int local54 = 0; local54 < Class1_Sub1_Sub1_Sub5.anInt511; local54++) {
				@Pc(60) int local60 = Class1_Sub1_Sub1_Sub5.anIntArray150[local54];
				@Pc(64) int local64 = local60 & 0x7F;
				@Pc(70) int local70 = local60 >> 7 & 0x7F;
				@Pc(76) int local76 = local60 >> 29 & 0x3;
				@Pc(82) int local82 = local60 >> 14 & 0x7FFF;
				if (local60 != local41) {
					local41 = local60;
					@Pc(229) int local229;
					if (local76 == 2 && this.aClass37_1.method560(this.anInt325, local64, local70, local60) >= 0) {
						@Pc(102) Class9 local102 = Class9.method288(local82);
						if (local102.anIntArray160 != null) {
							local102 = local102.method296();
						}
						if (local102 == null) {
							continue;
						}
						if (this.anInt409 == 1) {
							this.aStringArray3[this.anInt290] = "Use " + this.aString16 + " with @cya@" + local102.aString23;
							this.anIntArray37[this.anInt290] = 810;
							this.anIntArray38[this.anInt290] = local60;
							this.anIntArray35[this.anInt290] = local64;
							this.anIntArray36[this.anInt290] = local70;
							this.anInt290++;
						} else if (this.anInt269 != 1) {
							if (local102.aStringArray8 != null) {
								for (local229 = 4; local229 >= 0; local229--) {
									if (local102.aStringArray8[local229] != null) {
										this.aStringArray3[this.anInt290] = local102.aStringArray8[local229] + " @cya@" + local102.aString23;
										if (local229 == 0) {
											this.anIntArray37[this.anInt290] = 625;
										}
										if (local229 == 1) {
											this.anIntArray37[this.anInt290] = 721;
										}
										if (local229 == 2) {
											this.anIntArray37[this.anInt290] = 743;
										}
										if (local229 == 3) {
											this.anIntArray37[this.anInt290] = 357;
										}
										if (local229 == 4) {
											this.anIntArray37[this.anInt290] = 1071;
										}
										this.anIntArray38[this.anInt290] = local60;
										this.anIntArray35[this.anInt290] = local64;
										this.anIntArray36[this.anInt290] = local70;
										this.anInt290++;
									}
								}
							}
							this.aStringArray3[this.anInt290] = "Examine @cya@" + local102.aString23;
							this.anIntArray37[this.anInt290] = 1381;
							this.anIntArray38[this.anInt290] = local102.anInt516 << 14;
							this.anIntArray35[this.anInt290] = local64;
							this.anIntArray36[this.anInt290] = local70;
							this.anInt290++;
						} else if ((this.anInt271 & 0x4) == 4) {
							this.aStringArray3[this.anInt290] = this.aString5 + " @cya@" + local102.aString23;
							this.anIntArray37[this.anInt290] = 899;
							this.anIntArray38[this.anInt290] = local60;
							this.anIntArray35[this.anInt290] = local64;
							this.anIntArray36[this.anInt290] = local70;
							this.anInt290++;
						}
					}
					@Pc(409) Class1_Sub1_Sub1_Sub1_Sub2 local409;
					@Pc(458) Class1_Sub1_Sub1_Sub1_Sub1 local458;
					@Pc(448) int local448;
					if (local76 == 1) {
						@Pc(380) Class1_Sub1_Sub1_Sub1_Sub2 local380 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local82];
						if (local380.aClass13_2.aByte16 == 1 && (local380.anInt1005 & 0x7F) == 64 && (local380.anInt1006 & 0x7F) == 64) {
							for (local229 = 0; local229 < this.anInt283; local229++) {
								local409 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray48[local229]];
								if (local409 != null && local409 != local380 && local409.aClass13_2.aByte16 == 1 && local409.anInt1005 == local380.anInt1005 && local409.anInt1006 == local380.anInt1006) {
									this.method227(this.anInt234, local70, local409.aClass13_2, local64, this.anIntArray48[local229]);
								}
							}
							for (local448 = 0; local448 < this.anInt352; local448++) {
								local458 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray66[local448]];
								if (local458 != null && local458.anInt1005 == local380.anInt1005 && local458.anInt1006 == local380.anInt1006) {
									this.method172((byte) 4, local458, local64, local70, this.anIntArray66[local448]);
								}
							}
						}
						this.method227(this.anInt234, local70, local380.aClass13_2, local64, local82);
					}
					if (local76 == 0) {
						@Pc(501) Class1_Sub1_Sub1_Sub1_Sub1 local501 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local82];
						if ((local501.anInt1005 & 0x7F) == 64 && (local501.anInt1006 & 0x7F) == 64) {
							for (local229 = 0; local229 < this.anInt283; local229++) {
								local409 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray48[local229]];
								if (local409 != null && local409.aClass13_2.aByte16 == 1 && local409.anInt1005 == local501.anInt1005 && local409.anInt1006 == local501.anInt1006) {
									this.method227(this.anInt234, local70, local409.aClass13_2, local64, this.anIntArray48[local229]);
								}
							}
							for (local448 = 0; local448 < this.anInt352; local448++) {
								local458 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray66[local448]];
								if (local458 != null && local458 != local501 && local458.anInt1005 == local501.anInt1005 && local458.anInt1006 == local501.anInt1006) {
									this.method172((byte) 4, local458, local64, local70, this.anIntArray66[local448]);
								}
							}
						}
						this.method172((byte) 4, local501, local64, local70, local82);
					}
					if (local76 == 3) {
						@Pc(621) Class29 local621 = this.aClass29ArrayArrayArray1[this.anInt325][local64][local70];
						if (local621 != null) {
							for (@Pc(628) Class1_Sub1_Sub1_Sub3 local628 = (Class1_Sub1_Sub1_Sub3) local621.method512((byte) 7); local628 != null; local628 = (Class1_Sub1_Sub1_Sub3) local621.method514()) {
								@Pc(634) Class15 local634 = Class15.method361(local628.anInt189);
								if (this.anInt409 == 1) {
									this.aStringArray3[this.anInt290] = "Use " + this.aString16 + " with @lre@" + local634.aString25;
									this.anIntArray37[this.anInt290] = 111;
									this.anIntArray38[this.anInt290] = local628.anInt189;
									this.anIntArray35[this.anInt290] = local64;
									this.anIntArray36[this.anInt290] = local70;
									this.anInt290++;
								} else if (this.anInt269 != 1) {
									for (@Pc(751) int local751 = 4; local751 >= 0; local751--) {
										if (local634.aStringArray10 != null && local634.aStringArray10[local751] != null) {
											this.aStringArray3[this.anInt290] = local634.aStringArray10[local751] + " @lre@" + local634.aString25;
											if (local751 == 0) {
												this.anIntArray37[this.anInt290] = 139;
											}
											if (local751 == 1) {
												this.anIntArray37[this.anInt290] = 778;
											}
											if (local751 == 2) {
												this.anIntArray37[this.anInt290] = 617;
											}
											if (local751 == 3) {
												this.anIntArray37[this.anInt290] = 224;
											}
											if (local751 == 4) {
												this.anIntArray37[this.anInt290] = 662;
											}
											this.anIntArray38[this.anInt290] = local628.anInt189;
											this.anIntArray35[this.anInt290] = local64;
											this.anIntArray36[this.anInt290] = local70;
											this.anInt290++;
										} else if (local751 == 2) {
											this.aStringArray3[this.anInt290] = "Take @lre@" + local634.aString25;
											this.anIntArray37[this.anInt290] = 617;
											this.anIntArray38[this.anInt290] = local628.anInt189;
											this.anIntArray35[this.anInt290] = local64;
											this.anIntArray36[this.anInt290] = local70;
											this.anInt290++;
										}
									}
									this.aStringArray3[this.anInt290] = "Examine @lre@" + local634.aString25;
									this.anIntArray37[this.anInt290] = 1152;
									this.anIntArray38[this.anInt290] = local628.anInt189;
									this.anIntArray35[this.anInt290] = local64;
									this.anIntArray36[this.anInt290] = local70;
									this.anInt290++;
								} else if ((this.anInt271 & 0x1) == 1) {
									this.aStringArray3[this.anInt290] = this.aString5 + " @lre@" + local634.aString25;
									this.anIntArray37[this.anInt290] = 370;
									this.anIntArray38[this.anInt290] = local628.anInt189;
									this.anIntArray35[this.anInt290] = local64;
									this.anIntArray36[this.anInt290] = local70;
									this.anInt290++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(958) RuntimeException local958) {
			signlink.reporterror("37364, " + arg0 + ", " + local958.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!d;)I")
	private int method146(@OriginalArg(1) int arg0, @OriginalArg(2) Class6 arg1) {
		try {
			if (arg1.anIntArrayArray7 == null || arg0 >= arg1.anIntArrayArray7.length) {
				return -2;
			}
			try {
				@Pc(22) int[] local22 = arg1.anIntArrayArray7[arg0];
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
						local35 = this.anIntArray47[local22[local26++]];
					}
					if (local33 == 2) {
						local35 = this.anIntArray44[local22[local26++]];
					}
					if (local33 == 3) {
						local35 = this.anIntArray50[local22[local26++]];
					}
					@Pc(84) Class6 local84;
					@Pc(89) int local89;
					@Pc(102) int local102;
					if (local33 == 4) {
						local84 = Class6.aClass6Array1[local22[local26++]];
						local89 = local22[local26++];
						if (local89 >= 0 && local89 < Class15.anInt615 && (!Class15.method361(local89).aBoolean162 || aBoolean55)) {
							for (local102 = 0; local102 < local84.anIntArray94.length; local102++) {
								if (local84.anIntArray94[local102] == local89 + 1) {
									local35 += local84.anIntArray95[local102];
								}
							}
						}
					}
					if (local33 == 5) {
						local35 = this.anIntArray45[local22[local26++]];
					}
					if (local33 == 6) {
						local35 = anIntArray69[this.anIntArray44[local22[local26++]] - 1];
					}
					if (local33 == 7) {
						local35 = this.anIntArray45[local22[local26++]] * 100 / 46875;
					}
					if (local33 == 8) {
						local35 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt136;
					}
					@Pc(177) int local177;
					if (local33 == 9) {
						for (local177 = 0; local177 < Class30.anInt825; local177++) {
							if (Class30.aBooleanArray9[local177]) {
								local35 += this.anIntArray44[local177];
							}
						}
					}
					if (local33 == 10) {
						local84 = Class6.aClass6Array1[local22[local26++]];
						local89 = local22[local26++] + 1;
						if (local89 >= 0 && local89 < Class15.anInt615 && (!Class15.method361(local89).aBoolean162 || aBoolean55)) {
							for (local102 = 0; local102 < local84.anIntArray94.length; local102++) {
								if (local84.anIntArray94[local102] == local89) {
									local35 = 999999999;
									break;
								}
							}
						}
					}
					if (local33 == 11) {
						local35 = this.anInt291;
					}
					if (local33 == 12) {
						local35 = this.anInt418;
					}
					if (local33 == 13) {
						local177 = this.anIntArray45[local22[local26++]];
						local89 = local22[local26++];
						local35 = (local177 & 0x1 << local89) == 0 ? 0 : 1;
					}
					if (local33 == 14) {
						local177 = local22[local26++];
						@Pc(292) Class36 local292 = Class36.aClass36Array1[local177];
						local102 = local292.anInt859;
						@Pc(298) int local298 = local292.anInt860;
						@Pc(301) int local301 = local292.anInt861;
						@Pc(307) int local307 = anIntArray42[local301 - local298];
						local35 = this.anIntArray45[local102] >> local298 & local307;
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
						local35 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1005 >> 7) + this.anInt357;
					}
					if (local33 == 19) {
						local35 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1006 >> 7) + this.anInt358;
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
			signlink.reporterror("81175, " + -95 + ", " + arg0 + ", " + arg1 + ", " + local403.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method147() {
		try {
			this.aBoolean79 = false;
			while (this.aBoolean72) {
				this.aBoolean79 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass1_Sub1_Sub2_Sub3_12 = null;
			this.aClass1_Sub1_Sub2_Sub3_13 = null;
			this.aClass1_Sub1_Sub2_Sub3Array4 = null;
			this.anIntArray86 = null;
			this.anIntArray87 = null;
			this.anIntArray88 = null;
			this.anIntArray89 = null;
			this.anIntArray73 = null;
			this.anIntArray74 = null;
			this.anIntArray54 = null;
			this.anIntArray55 = null;
			this.aClass1_Sub1_Sub2_Sub2_1 = null;
			this.aClass1_Sub1_Sub2_Sub2_2 = null;
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("39654, " + 7 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method148() {
		try {
			for (@Pc(13) Class1_Sub2 local13 = (Class1_Sub2) this.aClass29_1.method511(); local13 != null; local13 = (Class1_Sub2) this.aClass29_1.method513()) {
				if (local13.anInt803 == -1) {
					local13.anInt802 = 0;
					this.method194(local13);
				} else {
					local13.method673();
				}
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("67354, " + -614 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method149() {
		try {
			anInt289++;
			this.anInt382 += 0;
			if (anInt289 > 192) {
				anInt289 = 0;
				this.aClass1_Sub1_Sub3_3.method469(57);
				this.aClass1_Sub1_Sub3_3.method470(232);
			}
			while (true) {
				@Pc(29) int local29;
				do {
					while (true) {
						local29 = this.method88();
						if (local29 == -1) {
							return;
						}
						if (this.anInt218 != -1 && this.anInt218 == this.anInt241) {
							if (local29 == 8 && this.aString14.length() > 0) {
								this.aString14 = this.aString14.substring(0, this.aString14.length() - 1);
							}
							break;
						}
						@Pc(209) int local209;
						if (this.aBoolean82) {
							if (local29 >= 32 && local29 <= 122 && this.aString12.length() < 80) {
								this.aString12 = this.aString12 + (char) local29;
								this.aBoolean80 = true;
							}
							if (local29 == 8 && this.aString12.length() > 0) {
								this.aString12 = this.aString12.substring(0, this.aString12.length() - 1);
								this.aBoolean80 = true;
							}
							if (local29 == 13 || local29 == 10) {
								this.aBoolean82 = false;
								this.aBoolean80 = true;
								@Pc(169) long local169;
								if (this.anInt229 == 1) {
									local169 = Class48.method667(this.aString12);
									this.method144(local169);
								}
								if (this.anInt229 == 2 && this.anInt231 > 0) {
									local169 = Class48.method667(this.aString12);
									this.method205(local169, 545);
								}
								if (this.anInt229 == 3 && this.aString12.length() > 0) {
									this.aClass1_Sub1_Sub3_3.method469(236);
									this.aClass1_Sub1_Sub3_3.method470(0);
									local209 = this.aClass1_Sub1_Sub3_3.anInt751;
									this.aClass1_Sub1_Sub3_3.method476(this.aLong16, aBoolean90);
									Class49.method684(this.aClass1_Sub1_Sub3_3, this.aString12);
									this.aClass1_Sub1_Sub3_3.method479(this.aClass1_Sub1_Sub3_3.anInt751 - local209);
									this.aString12 = Class49.method685((byte) 1, this.aString12);
									this.aString12 = Class42.method604((byte) 1, this.aString12);
									this.method204(Class48.method671(Class48.method668(this.anInt419, this.aLong16)), 6, this.aString12);
									if (this.anInt408 == 2) {
										this.anInt408 = 1;
										this.aBoolean78 = true;
										this.aClass1_Sub1_Sub3_3.method469(158);
										this.aClass1_Sub1_Sub3_3.method470(this.anInt273);
										this.aClass1_Sub1_Sub3_3.method470(this.anInt408);
										this.aClass1_Sub1_Sub3_3.method470(this.anInt324);
									}
								}
								if (this.anInt229 == 4 && this.anInt407 < 100) {
									local169 = Class48.method667(this.aString12);
									this.method229(local169, this.aBoolean84);
								}
								if (this.anInt229 == 5 && this.anInt407 > 0) {
									local169 = Class48.method667(this.aString12);
									this.method179(local169);
								}
							}
						} else if (this.aBoolean60) {
							if (local29 >= 48 && local29 <= 57 && this.aString17.length() < 10) {
								this.aString17 = this.aString17 + (char) local29;
								this.aBoolean80 = true;
							}
							if (local29 == 8 && this.aString17.length() > 0) {
								this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
								this.aBoolean80 = true;
							}
							if (local29 == 13 || local29 == 10) {
								if (this.aString17.length() > 0) {
									local209 = 0;
									try {
										local209 = Integer.parseInt(this.aString17);
									} catch (@Pc(387) Exception local387) {
									}
									this.aClass1_Sub1_Sub3_3.method469(12);
									this.aClass1_Sub1_Sub3_3.method474(local209);
								}
								this.aBoolean60 = false;
								this.aBoolean80 = true;
							}
						} else if (this.anInt278 == -1) {
							if (local29 >= 32 && local29 <= 122 && this.aString15.length() < 80) {
								this.aString15 = this.aString15 + (char) local29;
								this.aBoolean80 = true;
							}
							if (local29 == 8 && this.aString15.length() > 0) {
								this.aString15 = this.aString15.substring(0, this.aString15.length() - 1);
								this.aBoolean80 = true;
							}
							if ((local29 == 13 || local29 == 10) && this.aString15.length() > 0) {
								if (this.anInt272 == 2) {
									if (this.aString15.equals("::clientdrop")) {
										this.method170();
									}
									if (this.aString15.equals("::lag")) {
										this.method106();
									}
									if (this.aString15.equals("::prefetchmusic")) {
										for (local209 = 0; local209 < this.aClass44_Sub1_1.method638(2); local209++) {
											this.aClass44_Sub1_1.method648(anInt297, 2, (byte) 1, local209);
										}
									}
									if (this.aString15.equals("::fpson")) {
										aBoolean54 = true;
									}
									if (this.aString15.equals("::fpsoff")) {
										aBoolean54 = false;
									}
								}
								if (this.aString15.startsWith("::")) {
									this.aClass1_Sub1_Sub3_3.method469(95);
									this.aClass1_Sub1_Sub3_3.method470(this.aString15.length() - 1);
									this.aClass1_Sub1_Sub3_3.method477(this.aString15.substring(2));
								} else {
									@Pc(554) String local554 = this.aString15.toLowerCase();
									@Pc(556) byte local556 = 0;
									if (local554.startsWith("yellow:")) {
										local556 = 0;
										this.aString15 = this.aString15.substring(7);
									} else if (local554.startsWith("red:")) {
										local556 = 1;
										this.aString15 = this.aString15.substring(4);
									} else if (local554.startsWith("green:")) {
										local556 = 2;
										this.aString15 = this.aString15.substring(6);
									} else if (local554.startsWith("cyan:")) {
										local556 = 3;
										this.aString15 = this.aString15.substring(5);
									} else if (local554.startsWith("purple:")) {
										local556 = 4;
										this.aString15 = this.aString15.substring(7);
									} else if (local554.startsWith("white:")) {
										local556 = 5;
										this.aString15 = this.aString15.substring(6);
									} else if (local554.startsWith("flash1:")) {
										local556 = 6;
										this.aString15 = this.aString15.substring(7);
									} else if (local554.startsWith("flash2:")) {
										local556 = 7;
										this.aString15 = this.aString15.substring(7);
									} else if (local554.startsWith("flash3:")) {
										local556 = 8;
										this.aString15 = this.aString15.substring(7);
									} else if (local554.startsWith("glow1:")) {
										local556 = 9;
										this.aString15 = this.aString15.substring(6);
									} else if (local554.startsWith("glow2:")) {
										local556 = 10;
										this.aString15 = this.aString15.substring(6);
									} else if (local554.startsWith("glow3:")) {
										local556 = 11;
										this.aString15 = this.aString15.substring(6);
									}
									local554 = this.aString15.toLowerCase();
									@Pc(728) byte local728 = 0;
									if (local554.startsWith("wave:")) {
										local728 = 1;
										this.aString15 = this.aString15.substring(5);
									} else if (local554.startsWith("wave2:")) {
										local728 = 2;
										this.aString15 = this.aString15.substring(6);
									} else if (local554.startsWith("shake:")) {
										local728 = 3;
										this.aString15 = this.aString15.substring(6);
									} else if (local554.startsWith("scroll:")) {
										local728 = 4;
										this.aString15 = this.aString15.substring(7);
									} else if (local554.startsWith("slide:")) {
										local728 = 5;
										this.aString15 = this.aString15.substring(6);
									}
									this.aClass1_Sub1_Sub3_3.method469(29);
									this.aClass1_Sub1_Sub3_3.method470(0);
									@Pc(809) int local809 = this.aClass1_Sub1_Sub3_3.anInt751;
									this.aClass1_Sub1_Sub3_3.method470(local556);
									this.aClass1_Sub1_Sub3_3.method470(local728);
									Class49.method684(this.aClass1_Sub1_Sub3_3, this.aString15);
									this.aClass1_Sub1_Sub3_3.method479(this.aClass1_Sub1_Sub3_3.anInt751 - local809);
									this.aString15 = Class49.method685((byte) 1, this.aString15);
									this.aString15 = Class42.method604((byte) 1, this.aString15);
									aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31 = this.aString15;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1017 = local556;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1018 = local728;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1016 = 150;
									if (this.anInt272 == 2) {
										this.method204("@cr2@" + aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3, 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31);
									} else if (this.anInt272 == 1) {
										this.method204("@cr1@" + aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3, 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31);
									} else {
										this.method204(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3, 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31);
									}
									if (this.anInt273 == 2) {
										this.anInt273 = 3;
										this.aBoolean78 = true;
										this.aClass1_Sub1_Sub3_3.method469(158);
										this.aClass1_Sub1_Sub3_3.method470(this.anInt273);
										this.aClass1_Sub1_Sub3_3.method470(this.anInt408);
										this.aClass1_Sub1_Sub3_3.method470(this.anInt324);
									}
								}
								this.aString15 = "";
								this.aBoolean80 = true;
							}
						}
					}
				} while ((local29 < 97 || local29 > 122) && (local29 < 65 || local29 > 90) && (local29 < 48 || local29 > 57) && local29 != 32);
				if (this.aString14.length() < 12) {
					this.aString14 = this.aString14 + (char) local29;
				}
			}
		} catch (@Pc(945) RuntimeException local945) {
			signlink.reporterror("44441, " + 0 + ", " + local945.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIBZIIIIII)Z")
	private boolean method150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray5[local7][local11] = 0;
					this.anIntArrayArray3[local7][local11] = 99999999;
				}
			}
			local11 = arg5;
			@Pc(39) int local39 = arg8;
			this.anIntArrayArray5[arg5][arg8] = 99;
			this.anIntArrayArray3[arg5][arg8] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray90[0] = arg5;
			@Pc(66) int local66 = local55 + 1;
			this.anIntArray91[0] = arg8;
			@Pc(70) boolean local70 = false;
			@Pc(79) int local79 = this.anIntArray90.length;
			@Pc(86) int[][] local86 = this.aClass19Array1[this.anInt325].anIntArrayArray18;
			@Pc(197) int local197;
			while (local57 != local66) {
				local11 = this.anIntArray90[local57];
				local39 = this.anIntArray91[local57];
				local57 = (local57 + 1) % local79;
				if (local11 == arg6 && local39 == arg10) {
					local70 = true;
					break;
				}
				if (arg2 != 0) {
					if ((arg2 < 5 || arg2 == 10) && this.aClass19Array1[this.anInt325].method429(arg7, local11, arg10, local39, arg6, aBoolean83, arg2 - 1)) {
						local70 = true;
						break;
					}
					if (arg2 < 10 && this.aClass19Array1[this.anInt325].method430(arg7, local39, arg10, arg6, arg2 - 1, local11)) {
						local70 = true;
						break;
					}
				}
				if (arg3 != 0 && arg9 != 0 && this.aClass19Array1[this.anInt325].method431(arg3, arg6, local39, arg9, arg1, arg10, local11)) {
					local70 = true;
					break;
				}
				local197 = this.anIntArrayArray3[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray5[local11 - 1][local39] == 0 && (local86[local11 - 1][local39] & 0x280108) == 0) {
					this.anIntArray90[local66] = local11 - 1;
					this.anIntArray91[local66] = local39;
					local66 = (local66 + 1) % local79;
					this.anIntArrayArray5[local11 - 1][local39] = 2;
					this.anIntArrayArray3[local11 - 1][local39] = local197;
				}
				if (local11 < 103 && this.anIntArrayArray5[local11 + 1][local39] == 0 && (local86[local11 + 1][local39] & 0x280180) == 0) {
					this.anIntArray90[local66] = local11 + 1;
					this.anIntArray91[local66] = local39;
					local66 = (local66 + 1) % local79;
					this.anIntArrayArray5[local11 + 1][local39] = 8;
					this.anIntArrayArray3[local11 + 1][local39] = local197;
				}
				if (local39 > 0 && this.anIntArrayArray5[local11][local39 - 1] == 0 && (local86[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray90[local66] = local11;
					this.anIntArray91[local66] = local39 - 1;
					local66 = (local66 + 1) % local79;
					this.anIntArrayArray5[local11][local39 - 1] = 1;
					this.anIntArrayArray3[local11][local39 - 1] = local197;
				}
				if (local39 < 103 && this.anIntArrayArray5[local11][local39 + 1] == 0 && (local86[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray90[local66] = local11;
					this.anIntArray91[local66] = local39 + 1;
					local66 = (local66 + 1) % local79;
					this.anIntArrayArray5[local11][local39 + 1] = 4;
					this.anIntArrayArray3[local11][local39 + 1] = local197;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray5[local11 - 1][local39 - 1] == 0 && (local86[local11 - 1][local39 - 1] & 0x28010E) == 0 && (local86[local11 - 1][local39] & 0x280108) == 0 && (local86[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray90[local66] = local11 - 1;
					this.anIntArray91[local66] = local39 - 1;
					local66 = (local66 + 1) % local79;
					this.anIntArrayArray5[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray3[local11 - 1][local39 - 1] = local197;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray5[local11 + 1][local39 - 1] == 0 && (local86[local11 + 1][local39 - 1] & 0x280183) == 0 && (local86[local11 + 1][local39] & 0x280180) == 0 && (local86[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray90[local66] = local11 + 1;
					this.anIntArray91[local66] = local39 - 1;
					local66 = (local66 + 1) % local79;
					this.anIntArrayArray5[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray3[local11 + 1][local39 - 1] = local197;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray5[local11 - 1][local39 + 1] == 0 && (local86[local11 - 1][local39 + 1] & 0x280138) == 0 && (local86[local11 - 1][local39] & 0x280108) == 0 && (local86[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray90[local66] = local11 - 1;
					this.anIntArray91[local66] = local39 + 1;
					local66 = (local66 + 1) % local79;
					this.anIntArrayArray5[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray3[local11 - 1][local39 + 1] = local197;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray5[local11 + 1][local39 + 1] == 0 && (local86[local11 + 1][local39 + 1] & 0x2801E0) == 0 && (local86[local11 + 1][local39] & 0x280180) == 0 && (local86[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray90[local66] = local11 + 1;
					this.anIntArray91[local66] = local39 + 1;
					local66 = (local66 + 1) % local79;
					this.anIntArrayArray5[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray3[local11 + 1][local39 + 1] = local197;
				}
			}
			this.anInt224 = 0;
			@Pc(813) int local813;
			@Pc(819) int local819;
			@Pc(825) int local825;
			if (!local70) {
				if (arg4) {
					local197 = 100;
					for (local813 = 1; local813 < 2; local813++) {
						for (local819 = arg6 - local813; local819 <= arg6 + local813; local819++) {
							for (local825 = arg10 - local813; local825 <= arg10 + local813; local825++) {
								if (local819 >= 0 && local825 >= 0 && local819 < 104 && local825 < 104 && this.anIntArrayArray3[local819][local825] < local197) {
									local197 = this.anIntArrayArray3[local819][local825];
									local11 = local819;
									local39 = local825;
									this.anInt224 = 1;
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
			@Pc(886) byte local886 = 0;
			this.anIntArray90[0] = local11;
			local57 = local886 + 1;
			this.anIntArray91[0] = local39;
			local197 = local813 = this.anIntArrayArray5[local11][local39];
			while (local11 != arg5 || local39 != arg8) {
				if (local197 != local813) {
					local813 = local197;
					this.anIntArray90[local57] = local11;
					this.anIntArray91[local57++] = local39;
				}
				if ((local197 & 0x2) != 0) {
					local11++;
				} else if ((local197 & 0x8) != 0) {
					local11--;
				}
				if ((local197 & 0x1) != 0) {
					local39++;
				} else if ((local197 & 0x4) != 0) {
					local39--;
				}
				local197 = this.anIntArrayArray5[local11][local39];
			}
			if (local57 > 0) {
				local79 = local57;
				if (local57 > 25) {
					local79 = 25;
				}
				local57--;
				local819 = this.anIntArray90[local57];
				local825 = this.anIntArray91[local57];
				if (arg0 == 0) {
					this.aClass1_Sub1_Sub3_3.method469(201);
					this.aClass1_Sub1_Sub3_3.method470(local79 + local79 + 3);
				}
				if (arg0 == 1) {
					this.aClass1_Sub1_Sub3_3.method469(77);
					this.aClass1_Sub1_Sub3_3.method470(local79 + local79 + 3 + 14);
				}
				if (arg0 == 2) {
					this.aClass1_Sub1_Sub3_3.method469(41);
					this.aClass1_Sub1_Sub3_3.method470(local79 + local79 + 3);
				}
				if (super.anIntArray30[5] == 1) {
					this.aClass1_Sub1_Sub3_3.method470(1);
				} else {
					this.aClass1_Sub1_Sub3_3.method470(0);
				}
				this.aClass1_Sub1_Sub3_3.method471(local819 + this.anInt357);
				this.aClass1_Sub1_Sub3_3.method471(local825 + this.anInt358);
				this.anInt391 = this.anIntArray90[0];
				this.anInt392 = this.anIntArray91[0];
				for (@Pc(1074) int local1074 = 1; local1074 < local79; local1074++) {
					local57--;
					this.aClass1_Sub1_Sub3_3.method470(this.anIntArray90[local57] - local819);
					this.aClass1_Sub1_Sub3_3.method470(this.anIntArray91[local57] - local825);
				}
				return true;
			} else if (arg0 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1109) RuntimeException local1109) {
			signlink.reporterror("9465, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -114 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	private void method151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(1) Class1_Sub2 local1 = null;
			for (@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) this.aClass29_1.method511(); local6 != null; local6 = (Class1_Sub2) this.aClass29_1.method513()) {
				if (local6.anInt792 == arg3 && local6.anInt794 == arg8 && local6.anInt795 == arg4 && local6.anInt793 == arg0) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class1_Sub2();
				local1.anInt792 = arg3;
				local1.anInt793 = arg0;
				local1.anInt794 = arg8;
				local1.anInt795 = arg4;
				this.method194(local1);
				this.aClass29_1.method508(local1);
			}
			local1.anInt799 = arg5;
			local1.anInt801 = arg2;
			local1.anInt800 = arg7;
			local1.anInt802 = arg1;
			local1.anInt803 = arg6;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("70047, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 588 + ", " + arg8 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method152() {
		try {
			for (@Pc(11) Class1_Sub1_Sub1_Sub6 local11 = (Class1_Sub1_Sub1_Sub6) this.aClass29_3.method511(); local11 != null; local11 = (Class1_Sub1_Sub1_Sub6) this.aClass29_3.method513()) {
				if (local11.anInt541 != this.anInt325 || local11.aBoolean139) {
					local11.method673();
				} else if (anInt248 >= local11.anInt540) {
					local11.method301(this.anInt216);
					if (local11.aBoolean139) {
						local11.method673();
					} else {
						this.aClass37_1.method541(60, local11.anInt541, local11.anInt543, -1, local11, local11.anInt544, local11.anInt542, 0, false);
					}
				}
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("7401, " + 928 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;Z)Z")
	private boolean method153(@OriginalArg(0) Class6 arg0) {
		try {
			this.aBoolean59 &= true;
			@Pc(10) int local10 = arg0.anInt435;
			if (this.anInt232 == 2) {
				if (local10 == 201) {
					this.aBoolean80 = true;
					this.aBoolean60 = false;
					this.aBoolean82 = true;
					this.aString12 = "";
					this.anInt229 = 1;
					this.aString8 = "Enter name of friend to add to list";
				}
				if (local10 == 202) {
					this.aBoolean80 = true;
					this.aBoolean60 = false;
					this.aBoolean82 = true;
					this.aString12 = "";
					this.anInt229 = 2;
					this.aString8 = "Enter name of friend to delete from list";
				}
			}
			if (local10 == 205) {
				this.anInt386 = 250;
				return true;
			}
			if (local10 == 501) {
				this.aBoolean80 = true;
				this.aBoolean60 = false;
				this.aBoolean82 = true;
				this.aString12 = "";
				this.anInt229 = 4;
				this.aString8 = "Enter name of player to add to list";
			}
			if (local10 == 502) {
				this.aBoolean80 = true;
				this.aBoolean60 = false;
				this.aBoolean82 = true;
				this.aString12 = "";
				this.anInt229 = 5;
				this.aString8 = "Enter name of player to delete from list";
			}
			@Pc(118) int local118;
			@Pc(122) int local122;
			@Pc(127) int local127;
			if (local10 >= 300 && local10 <= 313) {
				local118 = (local10 - 300) / 2;
				local122 = local10 & 0x1;
				local127 = this.anIntArray83[local118];
				if (local127 != -1) {
					while (true) {
						if (local122 == 0) {
							local127--;
							if (local127 < 0) {
								local127 = Class23.anInt760 - 1;
							}
						}
						if (local122 == 1) {
							local127++;
							if (local127 >= Class23.anInt760) {
								local127 = 0;
							}
						}
						if (!Class23.aClass23Array1[local127].aBoolean198 && Class23.aClass23Array1[local127].anInt761 == local118 + (this.aBoolean51 ? 0 : 7)) {
							this.anIntArray83[local118] = local127;
							this.aBoolean64 = true;
							break;
						}
					}
				}
			}
			if (local10 >= 314 && local10 <= 323) {
				local118 = (local10 - 314) / 2;
				local122 = local10 & 0x1;
				local127 = this.anIntArray72[local118];
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
				this.anIntArray72[local118] = local127;
				this.aBoolean64 = true;
			}
			if (local10 == 324 && !this.aBoolean51) {
				this.aBoolean51 = true;
				this.method127();
			}
			if (local10 == 325 && this.aBoolean51) {
				this.aBoolean51 = false;
				this.method127();
			}
			if (local10 == 326) {
				this.aClass1_Sub1_Sub3_3.method469(169);
				this.aClass1_Sub1_Sub3_3.method470(this.aBoolean51 ? 0 : 1);
				for (local118 = 0; local118 < 7; local118++) {
					this.aClass1_Sub1_Sub3_3.method470(this.anIntArray83[local118]);
				}
				for (local122 = 0; local122 < 5; local122++) {
					this.aClass1_Sub1_Sub3_3.method470(this.anIntArray72[local122]);
				}
				return true;
			}
			if (local10 == 613) {
				this.aBoolean73 = !this.aBoolean73;
			}
			if (local10 >= 601 && local10 <= 612) {
				this.method210();
				if (this.aString14.length() > 0) {
					this.aClass1_Sub1_Sub3_3.method469(91);
					this.aClass1_Sub1_Sub3_3.method476(Class48.method667(this.aString14), aBoolean90);
					this.aClass1_Sub1_Sub3_3.method470(local10 - 601);
					this.aClass1_Sub1_Sub3_3.method470(this.aBoolean73 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(355) RuntimeException local355) {
			signlink.reporterror("82247, " + arg0 + ", " + true + ", " + local355.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method154() {
		try {
			if (this.aClass35_3 == null) {
				super.aClass35_2 = null;
				this.aClass35_27 = null;
				this.aClass35_25 = null;
				this.aClass35_24 = null;
				this.aClass35_26 = null;
				this.aClass35_21 = null;
				this.aClass35_22 = null;
				this.aClass35_23 = null;
				this.aClass35_6 = new Class35(false, this.method94(), 128, 265);
				Class1_Sub1_Sub2.method437();
				this.aClass35_7 = new Class35(false, this.method94(), 128, 265);
				Class1_Sub1_Sub2.method437();
				this.aClass35_3 = new Class35(false, this.method94(), 509, 171);
				Class1_Sub1_Sub2.method437();
				this.aClass35_4 = new Class35(false, this.method94(), 360, 132);
				Class1_Sub1_Sub2.method437();
				this.aClass35_5 = new Class35(false, this.method94(), 360, 200);
				Class1_Sub1_Sub2.method437();
				this.aClass35_8 = new Class35(false, this.method94(), 202, 238);
				Class1_Sub1_Sub2.method437();
				this.aClass35_9 = new Class35(false, this.method94(), 203, 238);
				Class1_Sub1_Sub2.method437();
				this.aClass35_10 = new Class35(false, this.method94(), 74, 94);
				Class1_Sub1_Sub2.method437();
				this.aClass35_11 = new Class35(false, this.method94(), 75, 94);
				Class1_Sub1_Sub2.method437();
				if (this.aClass47_1 != null) {
					this.method111();
					this.method98();
				}
				this.aBoolean69 = true;
			}
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("6591, " + -294 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg0 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg2 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg4;
			@Pc(23) int local23;
			@Pc(27) int local27;
			@Pc(37) int local37;
			if (local5 != 0) {
				local23 = Class1_Sub1_Sub1_Sub5.anIntArray151[local5];
				local27 = Class1_Sub1_Sub1_Sub5.anIntArray152[local5];
				local37 = local27 * 0 - arg4 * local23 >> 16;
				local17 = local23 * 0 + arg4 * local27 >> 16;
				local15 = local37;
			}
			if (local11 != 0) {
				local23 = Class1_Sub1_Sub1_Sub5.anIntArray151[local11];
				local27 = Class1_Sub1_Sub1_Sub5.anIntArray152[local11];
				local37 = local17 * local23 + local27 * 0 >> 16;
				local17 = local17 * local27 - local23 * 0 >> 16;
				local13 = local37;
			}
			this.anInt262 = arg1 - local13;
			this.anInt263 = arg3 - local15;
			this.anInt264 = arg5 - local17;
			this.anInt265 = arg0;
			this.anInt266 = arg2;
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("32806, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 3 + ", " + arg4 + ", " + arg5 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method156() {
		try {
			this.anInt317 = 0;
			@Pc(60) int local60;
			@Pc(80) int local80;
			for (@Pc(13) int local13 = -1; local13 < this.anInt352 + this.anInt283; local13++) {
				@Pc(20) Class1_Sub1_Sub1_Sub1 local20;
				if (local13 == -1) {
					local20 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
				} else if (local13 < this.anInt352) {
					local20 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray66[local13]];
				} else {
					local20 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray48[local13 - this.anInt352]];
				}
				if (local20 != null && local20.method680()) {
					if (local13 >= this.anInt352) {
						@Pc(153) Class13 local153 = ((Class1_Sub1_Sub1_Sub1_Sub2) local20).aClass13_2;
						if (local153.anInt582 >= 0 && local153.anInt582 < this.aClass1_Sub1_Sub2_Sub2Array5.length) {
							this.method158(local20, local20.anInt1046 + 15);
							if (this.anInt354 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array5[local153.anInt582].method391(this.anInt354 - 12, this.anInt355 - 30);
							}
						}
						if (this.anInt323 == 1 && this.anInt413 == this.anIntArray48[local13 - this.anInt352] && anInt248 % 20 < 10) {
							this.method158(local20, local20.anInt1046 + 15);
							if (this.anInt354 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array5[2].method391(this.anInt354 - 12, this.anInt355 - 28);
							}
						}
					} else {
						local60 = 30;
						@Pc(63) Class1_Sub1_Sub1_Sub1_Sub1 local63 = (Class1_Sub1_Sub1_Sub1_Sub1) local20;
						if (local63.anInt135 != 0) {
							this.method158(local20, local20.anInt1046 + 15);
							if (this.anInt354 > -1) {
								for (local80 = 0; local80 < 8; local80++) {
									if ((local63.anInt135 & 0x1 << local80) != 0) {
										this.aClass1_Sub1_Sub2_Sub2Array5[local80].method391(this.anInt354 - 12, this.anInt355 - local60);
										local60 -= 25;
									}
								}
							}
						}
						if (local13 >= 0 && this.anInt323 == 10 && this.anInt253 == this.anIntArray66[local13]) {
							this.method158(local20, local20.anInt1046 + 15);
							if (this.anInt354 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array5[7].method391(this.anInt354 - 12, this.anInt355 - local60);
							}
						}
					}
					if (local20.aString31 != null && (local13 >= this.anInt352 || this.anInt273 == 0 || this.anInt273 == 3 || this.anInt273 == 1 && this.method105(((Class1_Sub1_Sub1_Sub1_Sub1) local20).aString3))) {
						this.method158(local20, local20.anInt1046);
						if (this.anInt354 > -1 && this.anInt317 < this.anInt318) {
							this.anIntArray60[this.anInt317] = this.aClass1_Sub1_Sub2_Sub4_3.method450(local20.aString31) / 2;
							this.anIntArray59[this.anInt317] = this.aClass1_Sub1_Sub2_Sub4_3.anInt719;
							this.anIntArray57[this.anInt317] = this.anInt354;
							this.anIntArray58[this.anInt317] = this.anInt355;
							this.anIntArray61[this.anInt317] = local20.anInt1017;
							this.anIntArray62[this.anInt317] = local20.anInt1018;
							this.anIntArray63[this.anInt317] = local20.anInt1016;
							this.aStringArray4[this.anInt317++] = local20.aString31;
							if (this.anInt401 == 0 && local20.anInt1018 >= 1 && local20.anInt1018 <= 3) {
								this.anIntArray59[this.anInt317] += 10;
								this.anIntArray58[this.anInt317] += 5;
							}
							if (this.anInt401 == 0 && local20.anInt1018 == 4) {
								this.anIntArray60[this.anInt317] = 60;
							}
							if (this.anInt401 == 0 && local20.anInt1018 == 5) {
								this.anIntArray59[this.anInt317] += 5;
							}
						}
					}
					if (local20.anInt1019 > anInt248) {
						this.method158(local20, local20.anInt1046 + 15);
						if (this.anInt354 > -1) {
							local60 = local20.anInt1020 * 30 / local20.anInt1021;
							if (local60 > 30) {
								local60 = 30;
							}
							Class1_Sub1_Sub2.method439(this.anInt354 - 15, local60, 65280, 5, this.anInt355 - 3);
							Class1_Sub1_Sub2.method439(this.anInt354 + local60 - 15, 30 - local60, 16711680, 5, this.anInt355 - 3);
						}
					}
					for (local60 = 0; local60 < 4; local60++) {
						if (local20.anIntArray271[local60] > anInt248) {
							this.method158(local20, local20.anInt1046 / 2);
							if (this.anInt354 > -1) {
								if (local60 == 1) {
									this.anInt355 -= 20;
								}
								if (local60 == 2) {
									this.anInt354 -= 15;
									this.anInt355 -= 10;
								}
								if (local60 == 3) {
									this.anInt354 += 15;
									this.anInt355 -= 10;
								}
								this.aClass1_Sub1_Sub2_Sub2Array6[local20.anIntArray270[local60]].method391(this.anInt354 - 12, this.anInt355 - 12);
								this.aClass1_Sub1_Sub2_Sub4_1.method447(0, this.anInt355 + 4, this.anInt354, String.valueOf(local20.anIntArray269[local60]));
								this.aClass1_Sub1_Sub2_Sub4_1.method447(16777215, this.anInt355 + 3, this.anInt354 - 1, String.valueOf(local20.anIntArray269[local60]));
							}
						}
					}
				}
			}
			for (@Pc(585) int local585 = 0; local585 < this.anInt317; local585++) {
				local60 = this.anIntArray57[local585];
				@Pc(597) int local597 = this.anIntArray58[local585];
				local80 = this.anIntArray60[local585];
				@Pc(607) int local607 = this.anIntArray59[local585];
				@Pc(609) boolean local609 = true;
				while (local609) {
					local609 = false;
					for (@Pc(615) int local615 = 0; local615 < local585; local615++) {
						if (local597 + 2 > this.anIntArray58[local615] - this.anIntArray59[local615] && local597 - local607 < this.anIntArray58[local615] + 2 && local60 - local80 < this.anIntArray57[local615] + this.anIntArray60[local615] && local60 + local80 > this.anIntArray57[local615] - this.anIntArray60[local615] && this.anIntArray58[local615] - this.anIntArray59[local615] < local597) {
							local597 = this.anIntArray58[local615] - this.anIntArray59[local615];
							local609 = true;
						}
					}
				}
				this.anInt354 = this.anIntArray57[local585];
				this.anInt355 = this.anIntArray58[local585] = local597;
				@Pc(714) String local714 = this.aStringArray4[local585];
				if (this.anInt401 == 0) {
					@Pc(719) int local719 = 16776960;
					if (this.anIntArray61[local585] < 6) {
						local719 = this.anIntArray93[this.anIntArray61[local585]];
					}
					if (this.anIntArray61[local585] == 6) {
						local719 = this.anInt281 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray61[local585] == 7) {
						local719 = this.anInt281 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray61[local585] == 8) {
						local719 = this.anInt281 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(794) int local794;
					if (this.anIntArray61[local585] == 9) {
						local794 = 150 - this.anIntArray63[local585];
						if (local794 < 50) {
							local719 = local794 * 1280 + 16711680;
						} else if (local794 < 100) {
							local719 = 16776960 - (local794 - 50) * 327680;
						} else if (local794 < 150) {
							local719 = (local794 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray61[local585] == 10) {
						local794 = 150 - this.anIntArray63[local585];
						if (local794 < 50) {
							local719 = local794 * 5 + 16711680;
						} else if (local794 < 100) {
							local719 = 16711935 - (local794 - 50) * 327680;
						} else if (local794 < 150) {
							local719 = (local794 - 100) * 327680 + 255 - (local794 - 100) * 5;
						}
					}
					if (this.anIntArray61[local585] == 11) {
						local794 = 150 - this.anIntArray63[local585];
						if (local794 < 50) {
							local719 = 16777215 - local794 * 327685;
						} else if (local794 < 100) {
							local719 = (local794 - 50) * 327685 + 65280;
						} else if (local794 < 150) {
							local719 = 16777215 - (local794 - 100) * 327680;
						}
					}
					if (this.anIntArray62[local585] == 0) {
						this.aClass1_Sub1_Sub2_Sub4_3.method447(0, this.anInt355 + 1, this.anInt354, local714);
						this.aClass1_Sub1_Sub2_Sub4_3.method447(local719, this.anInt355, this.anInt354, local714);
					}
					if (this.anIntArray62[local585] == 1) {
						this.aClass1_Sub1_Sub2_Sub4_3.method452(0, this.anInt355 + 1, this.anInt354, this.anInt281, local714);
						this.aClass1_Sub1_Sub2_Sub4_3.method452(local719, this.anInt355, this.anInt354, this.anInt281, local714);
					}
					if (this.anIntArray62[local585] == 2) {
						this.aClass1_Sub1_Sub2_Sub4_3.method453(this.anInt354, 0, this.anInt355 + 1, local714, this.anInt281);
						this.aClass1_Sub1_Sub2_Sub4_3.method453(this.anInt354, local719, this.anInt355, local714, this.anInt281);
					}
					if (this.anIntArray62[local585] == 3) {
						this.aClass1_Sub1_Sub2_Sub4_3.method454(this.anInt355 + 1, local714, this.anInt354, 150 - this.anIntArray63[local585], this.anInt281, 0, this.anInt233);
						this.aClass1_Sub1_Sub2_Sub4_3.method454(this.anInt355, local714, this.anInt354, 150 - this.anIntArray63[local585], this.anInt281, local719, this.anInt233);
					}
					@Pc(1093) int local1093;
					if (this.anIntArray62[local585] == 4) {
						local794 = this.aClass1_Sub1_Sub2_Sub4_3.method450(local714);
						local1093 = (150 - this.anIntArray63[local585]) * (local794 + 100) / 150;
						Class1_Sub1_Sub2.method436(0, this.anInt354 - 50, this.anInt354 + 50, 334);
						this.aClass1_Sub1_Sub2_Sub4_3.method451(local714, 0, this.anInt354 + 50 - local1093, this.anInt355 + 1);
						this.aClass1_Sub1_Sub2_Sub4_3.method451(local714, local719, this.anInt354 + 50 - local1093, this.anInt355);
						Class1_Sub1_Sub2.method435();
					}
					if (this.anIntArray62[local585] == 5) {
						local794 = 150 - this.anIntArray63[local585];
						local1093 = 0;
						if (local794 < 25) {
							local1093 = local794 - 25;
						} else if (local794 > 125) {
							local1093 = local794 - 125;
						}
						Class1_Sub1_Sub2.method436(this.anInt355 - this.aClass1_Sub1_Sub2_Sub4_3.anInt719 - 1, 0, 512, this.anInt355 + 5);
						this.aClass1_Sub1_Sub2_Sub4_3.method447(0, this.anInt355 + local1093 + 1, this.anInt354, local714);
						this.aClass1_Sub1_Sub2_Sub4_3.method447(local719, this.anInt355 + local1093, this.anInt354, local714);
						Class1_Sub1_Sub2.method435();
					}
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method447(0, this.anInt355 + 1, this.anInt354, local714);
					this.aClass1_Sub1_Sub2_Sub4_3.method447(16776960, this.anInt355, this.anInt354, local714);
				}
			}
		} catch (@Pc(1243) RuntimeException local1243) {
			signlink.reporterror("44740, " + true + ", " + local1243.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!lb;I)V")
	private void method157(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(7) int local7 = 0; local7 < this.anInt353; local7++) {
				@Pc(14) int local14 = this.anIntArray67[local7];
				@Pc(19) Class1_Sub1_Sub1_Sub1_Sub2 local19 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local14];
				@Pc(22) int local22 = arg0.method480();
				@Pc(30) int local30;
				@Pc(33) int local33;
				if ((local22 & 0x1) == 1) {
					local30 = arg0.method480();
					local33 = arg0.method480();
					local19.method681(local30, local33, anInt248);
					local19.anInt1019 = anInt248 + 300;
					local19.anInt1020 = arg0.method480();
					local19.anInt1021 = arg0.method480();
				}
				if ((local22 & 0x2) == 2) {
					local30 = arg0.method482();
					if (local30 == 65535) {
						local30 = -1;
					}
					if (local30 == local19.anInt1028) {
						local19.anInt1032 = 0;
					}
					local33 = arg0.method480();
					if (local30 == local19.anInt1028 && local30 != -1) {
						@Pc(87) int local87 = Class27.aClass27Array1[local30].anInt815;
						if (local87 == 1) {
							local19.anInt1029 = 0;
							local19.anInt1030 = 0;
							local19.anInt1031 = local33;
							local19.anInt1032 = 0;
						}
						if (local87 == 2) {
							local19.anInt1032 = 0;
						}
					} else if (local30 == -1 || local19.anInt1028 == -1 || Class27.aClass27Array1[local30].anInt809 >= Class27.aClass27Array1[local19.anInt1028].anInt809) {
						local19.anInt1028 = local30;
						local19.anInt1029 = 0;
						local19.anInt1030 = 0;
						local19.anInt1031 = local33;
						local19.anInt1032 = 0;
						local19.anInt1051 = local19.anInt1049;
					}
				}
				if ((local22 & 0x4) == 4) {
					local19.anInt1022 = arg0.method482();
					if (local19.anInt1022 == 65535) {
						local19.anInt1022 = -1;
					}
				}
				if ((local22 & 0x8) == 8) {
					local19.aString31 = arg0.method487();
					local19.anInt1016 = 100;
				}
				if ((local22 & 0x10) == 16) {
					local30 = arg0.method480();
					local33 = arg0.method480();
					local19.method681(local30, local33, anInt248);
					local19.anInt1019 = anInt248 + 300;
					local19.anInt1020 = arg0.method480();
					local19.anInt1021 = arg0.method480();
				}
				if ((local22 & 0x20) == 32) {
					local19.aClass13_2 = Class13.method323(arg0.method482());
					local19.anInt1008 = local19.aClass13_2.aByte16;
					local19.anInt1048 = local19.aClass13_2.anInt583;
					local19.anInt1011 = local19.aClass13_2.anInt570;
					local19.anInt1012 = local19.aClass13_2.anInt571;
					local19.anInt1013 = local19.aClass13_2.anInt572;
					local19.anInt1014 = local19.aClass13_2.anInt573;
					local19.anInt1009 = local19.aClass13_2.anInt569;
				}
				if ((local22 & 0x40) == 64) {
					local19.anInt1033 = arg0.method482();
					local30 = arg0.method485();
					local19.anInt1037 = local30 >> 16;
					local19.anInt1036 = anInt248 + (local30 & 0xFFFF);
					local19.anInt1034 = 0;
					local19.anInt1035 = 0;
					if (local19.anInt1036 > anInt248) {
						local19.anInt1034 = -1;
					}
					if (local19.anInt1033 == 65535) {
						local19.anInt1033 = -1;
					}
				}
				if ((local22 & 0x80) == 128) {
					local19.anInt1023 = arg0.method482();
					local19.anInt1024 = arg0.method482();
				}
			}
		} catch (@Pc(313) RuntimeException local313) {
			signlink.reporterror("72709, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local313.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!y;I)V")
	private void method158(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		try {
			this.method159(arg0.anInt1006, arg0.anInt1005, arg1);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("98943, " + -884 + ", " + arg0 + ", " + arg1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V")
	private void method159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg1 >= 128 && arg0 >= 128 && arg1 <= 13056 && arg0 <= 13056) {
				@Pc(32) int local32 = this.method218(arg1, arg0, this.anInt325) - arg2;
				@Pc(37) int local37 = arg1 - this.anInt262;
				@Pc(42) int local42 = local32 - this.anInt263;
				@Pc(47) int local47 = arg0 - this.anInt264;
				@Pc(52) int local52 = Class1_Sub1_Sub1_Sub5.anIntArray151[this.anInt265];
				@Pc(57) int local57 = Class1_Sub1_Sub1_Sub5.anIntArray152[this.anInt265];
				@Pc(62) int local62 = Class1_Sub1_Sub1_Sub5.anIntArray151[this.anInt266];
				@Pc(67) int local67 = Class1_Sub1_Sub1_Sub5.anIntArray152[this.anInt266];
				@Pc(77) int local77 = local47 * local62 + local37 * local67 >> 16;
				@Pc(87) int local87 = local47 * local67 - local37 * local62 >> 16;
				@Pc(89) int local89 = local77;
				@Pc(99) int local99 = local42 * local57 - local87 * local52 >> 16;
				@Pc(109) int local109 = local42 * local52 + local87 * local57 >> 16;
				if (local109 >= 50) {
					this.anInt354 = Class1_Sub1_Sub2_Sub1.anInt606 + (local89 << 9) / local109;
					this.anInt355 = Class1_Sub1_Sub2_Sub1.anInt607 + (local99 << 9) / local109;
				} else {
					this.anInt354 = -1;
					this.anInt355 = -1;
				}
			} else {
				this.anInt354 = -1;
				this.anInt355 = -1;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("21789, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method160() {
		try {
			if (aBoolean56 && this.anInt404 == 2 && Class4.anInt180 != this.anInt325) {
				this.aClass35_26.method524();
				this.aClass1_Sub1_Sub2_Sub4_2.method447(0, 151, 257, "Loading - please wait.");
				this.aClass1_Sub1_Sub2_Sub4_2.method447(16777215, 150, 256, "Loading - please wait.");
				this.aClass35_26.method525(4, 4, (byte) 3, super.aGraphics2);
				this.anInt404 = 1;
				this.aLong18 = System.currentTimeMillis();
			}
			if (this.anInt404 == 1) {
				@Pc(55) int local55 = this.method161();
				if (local55 != 0 && System.currentTimeMillis() - this.aLong18 > 360000L) {
					signlink.reporterror(this.aString10 + " glcfb " + this.aLong17 + "," + local55 + "," + aBoolean56 + "," + this.aClass45Array1[0] + "," + this.aClass44_Sub1_1.method646() + "," + this.anInt325 + "," + this.anInt244 + "," + this.anInt245);
					this.aLong18 = System.currentTimeMillis();
				}
			}
			if (this.anInt404 == 2 && this.anInt325 != this.anInt316) {
				this.anInt316 = this.anInt325;
				this.method139(this.anInt325);
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("66884, " + 94 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)I")
	private int method161() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray2.length; local3++) {
				if (this.aByteArrayArray2[local3] == null && this.anIntArray52[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray1[local3] == null && this.anIntArray53[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(41) int local41 = 0; local41 < this.aByteArrayArray2.length; local41++) {
				@Pc(48) byte[] local48 = this.aByteArrayArray1[local41];
				if (local48 != null) {
					@Pc(62) int local62 = (this.anIntArray51[local41] >> 8) * 64 - this.anInt357;
					@Pc(74) int local74 = (this.anIntArray51[local41] & 0xFF) * 64 - this.anInt358;
					local39 &= Class4.method58(local74, 715, local48, local62);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean58) {
				return -4;
			} else {
				this.anInt404 = 2;
				Class4.anInt180 = this.anInt325;
				this.method164();
				this.aClass1_Sub1_Sub3_3.method469(218);
				return 0;
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("63073, " + 0 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method162(@OriginalArg(1) int arg0) {
		try {
			signlink.anInt959 = arg0;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("59801, " + 11841 + ", " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)Ljava/net/Socket;")
	public Socket method163(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method164() {
		try {
			@Pc(21) int local21;
			@Pc(49) int local49;
			@Pc(53) int local53;
			@Pc(62) int local62;
			@Pc(69) int local69;
			@Pc(132) int local132;
			@Pc(189) int local189;
			try {
				this.anInt316 = -1;
				this.aClass29_3.method515();
				this.aClass29_2.method515();
				Class1_Sub1_Sub2_Sub1.method345();
				this.method197();
				this.aClass37_1.method530();
				for (local21 = 0; local21 < 4; local21++) {
					this.aClass19Array1[local21].method420();
				}
				System.gc();
				@Pc(45) Class4 local45 = new Class4(this.aByteArrayArrayArray7, 104, 104, this.anIntArrayArrayArray5, -507);
				local49 = this.aByteArrayArray2.length;
				Class4.aBoolean38 = Class37.aBoolean221;
				for (local53 = 0; local53 < local49; local53++) {
					local62 = this.anIntArray51[local53] >> 8;
					local69 = this.anIntArray51[local53] & 0xFF;
					if (local62 == 33 && local69 >= 71 && local69 <= 73) {
						Class4.aBoolean38 = false;
					}
				}
				if (Class4.aBoolean38) {
					this.aClass37_1.method531(this.anInt325);
				} else {
					this.aClass37_1.method531(0);
				}
				this.aClass1_Sub1_Sub3_3.method469(146);
				@Pc(137) byte[] local137;
				for (local62 = 0; local62 < local49; local62++) {
					local69 = (this.anIntArray51[local62] >> 8) * 64 - this.anInt357;
					local132 = (this.anIntArray51[local62] & 0xFF) * 64 - this.anInt358;
					local137 = this.aByteArrayArray2[local62];
					if (local137 != null) {
						local45.method57((this.anInt245 - 6) * 8, 302, local137, (this.anInt244 - 6) * 8, local69, local132);
					}
				}
				for (local69 = 0; local69 < local49; local69++) {
					local132 = (this.anIntArray51[local69] >> 8) * 64 - this.anInt357;
					local189 = (this.anIntArray51[local69] & 0xFF) * 64 - this.anInt358;
					@Pc(194) byte[] local194 = this.aByteArrayArray2[local69];
					if (local194 == null && this.anInt245 < 800) {
						local45.method56(local132, local189);
					}
				}
				this.aClass1_Sub1_Sub3_3.method469(146);
				@Pc(239) int local239;
				for (local132 = 0; local132 < local49; local132++) {
					local137 = this.aByteArrayArray1[local132];
					if (local137 != null) {
						local239 = (this.anIntArray51[local132] >> 8) * 64 - this.anInt357;
						@Pc(251) int local251 = (this.anIntArray51[local132] & 0xFF) * 64 - this.anInt358;
						local45.method60(this.aClass19Array1, local239, local137, this.aClass37_1, local251);
					}
				}
				this.aClass1_Sub1_Sub3_3.method469(146);
				local45.method62(this.aClass37_1, this.aClass19Array1);
				this.aClass35_26.method524();
				this.aClass1_Sub1_Sub3_3.method469(146);
				for (local189 = 0; local189 < 104; local189++) {
					for (local239 = 0; local239 < 104; local239++) {
						this.method206(local189, local239);
					}
				}
				this.method148();
			} catch (@Pc(311) Exception local311) {
			}
			Class9.aClass40_4.method593();
			@Pc(325) int local325;
			if (aBoolean56 && signlink.aRandomAccessFile1 != null) {
				local21 = this.aClass44_Sub1_1.method638(0);
				for (local325 = 0; local325 < local21; local325++) {
					local49 = this.aClass44_Sub1_1.method643(local325, (byte) 6);
					if ((local49 & 0x79) == 0) {
						Class1_Sub1_Sub1_Sub5.method260(local325);
					}
				}
			}
			System.gc();
			Class1_Sub1_Sub2_Sub1.method346();
			this.aClass44_Sub1_1.method649(487);
			local21 = (this.anInt244 - 6) / 8 - 1;
			local325 = (this.anInt244 + 6) / 8 + 1;
			local49 = (this.anInt245 - 6) / 8 - 1;
			local53 = (this.anInt245 + 6) / 8 + 1;
			this.aBoolean59 &= true;
			if (this.aBoolean70) {
				local21 = 49;
				local325 = 50;
				local49 = 49;
				local53 = 50;
			}
			for (local62 = local21; local62 <= local325; local62++) {
				for (local69 = local49; local69 <= local53; local69++) {
					if (local62 == local21 || local62 == local325 || local69 == local49 || local69 == local53) {
						local132 = this.aClass44_Sub1_1.method640(local62, 0, local69);
						if (local132 != -1) {
							this.aClass44_Sub1_1.method650(3, this.aByte8, local132);
						}
						local189 = this.aClass44_Sub1_1.method640(local62, 1, local69);
						if (local189 != -1) {
							this.aClass44_Sub1_1.method650(3, this.aByte8, local189);
						}
					}
				}
			}
		} catch (@Pc(471) RuntimeException local471) {
			signlink.reporterror("95098, " + true + ", " + local471.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method165() {
		try {
			if (this.anInt402 == 0 && super.anInt210 == 1) {
				@Pc(21) int local21 = super.anInt211 - 25 - 550;
				@Pc(28) int local28 = super.anInt212 - 5 - 4;
				if (local21 >= 0 && local28 >= 0 && local21 < 146 && local28 < 151) {
					local21 -= 73;
					local28 -= 75;
					@Pc(48) int local48 = this.anInt250 + this.anInt260 & 0x7FF;
					@Pc(52) int local52 = Class1_Sub1_Sub2_Sub1.anIntArray178[local48];
					@Pc(56) int local56 = Class1_Sub1_Sub2_Sub1.anIntArray179[local48];
					@Pc(65) int local65 = local52 * (this.anInt267 + 256) >> 8;
					@Pc(74) int local74 = local56 * (this.anInt267 + 256) >> 8;
					@Pc(84) int local84 = local28 * local65 + local21 * local74 >> 11;
					@Pc(94) int local94 = local28 * local74 - local21 * local65 >> 11;
					@Pc(101) int local101 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1005 + local84 >> 7;
					@Pc(108) int local108 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1006 - local94 >> 7;
					@Pc(129) boolean local129 = this.method150(1, 0, 0, 0, true, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], local101, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, local108);
					if (local129) {
						this.aClass1_Sub1_Sub3_3.method470(local21);
						this.aClass1_Sub1_Sub3_3.method470(local28);
						this.aClass1_Sub1_Sub3_3.method471(this.anInt250);
						this.aClass1_Sub1_Sub3_3.method470(57);
						this.aClass1_Sub1_Sub3_3.method470(this.anInt260);
						this.aClass1_Sub1_Sub3_3.method470(this.anInt267);
						this.aClass1_Sub1_Sub3_3.method470(89);
						this.aClass1_Sub1_Sub3_3.method471(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1005);
						this.aClass1_Sub1_Sub3_3.method471(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1006);
						this.aClass1_Sub1_Sub3_3.method470(this.anInt224);
						this.aClass1_Sub1_Sub3_3.method470(63);
						return;
					}
				}
			}
		} catch (@Pc(183) RuntimeException local183) {
			signlink.reporterror("51140, " + -16 + ", " + local183.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!d;)V")
	private void method166(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1) {
		try {
			@Pc(4) int local4 = arg1.anInt435;
			@Pc(8) boolean local8 = false;
			@Pc(64) int local64;
			if ((local4 < 1 || local4 > 100) && (local4 < 701 || local4 > 800)) {
				if (local4 >= 101 && local4 <= 200 || local4 >= 801 && local4 <= 900) {
					local64 = this.anInt231;
					if (this.anInt232 != 2) {
						local64 = 0;
					}
					if (local4 > 800) {
						local4 -= 701;
					} else {
						local4 -= 101;
					}
					if (local4 >= local64) {
						arg1.aString18 = "";
						arg1.anInt434 = 0;
					} else {
						if (this.anIntArray70[local4] == 0) {
							arg1.aString18 = "@red@Offline";
						} else if (this.anIntArray70[local4] == anInt255) {
							arg1.aString18 = "@gre@World-" + (this.anIntArray70[local4] - 9);
						} else {
							arg1.aString18 = "@yel@World-" + (this.anIntArray70[local4] - 9);
						}
						arg1.anInt434 = 1;
					}
				} else if (local4 == 203) {
					local64 = this.anInt231;
					if (this.anInt232 != 2) {
						local64 = 0;
					}
					arg1.anInt441 = local64 * 15 + 20;
					if (arg1.anInt441 <= arg1.anInt437) {
						arg1.anInt441 = arg1.anInt437 + 1;
					}
				} else if (local4 >= 401 && local4 <= 500) {
					local4 -= 401;
					if (local4 == 0 && this.anInt232 == 0) {
						arg1.aString18 = "Loading ignore list";
						arg1.anInt434 = 0;
					} else if (local4 == 1 && this.anInt232 == 0) {
						arg1.aString18 = "Please wait...";
						arg1.anInt434 = 0;
					} else {
						local64 = this.anInt407;
						if (this.anInt232 == 0) {
							local64 = 0;
						}
						if (local4 >= local64) {
							arg1.aString18 = "";
							arg1.anInt434 = 0;
						} else {
							arg1.aString18 = Class48.method671(Class48.method668(this.anInt419, this.aLongArray3[local4]));
							arg1.anInt434 = 1;
						}
					}
				} else if (local4 == 503) {
					arg1.anInt441 = this.anInt407 * 15 + 20;
					if (arg1.anInt441 <= arg1.anInt437) {
						arg1.anInt441 = arg1.anInt437 + 1;
					}
				} else if (local4 == 327) {
					arg1.anInt457 = 150;
					arg1.anInt458 = (int) (Math.sin((double) anInt248 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean64) {
						for (local64 = 0; local64 < 7; local64++) {
							@Pc(334) int local334 = this.anIntArray83[local64];
							if (local334 >= 0 && !Class23.aClass23Array1[local334].method498()) {
								return;
							}
						}
						this.aBoolean64 = false;
						@Pc(353) Class1_Sub1_Sub1_Sub5[] local353 = new Class1_Sub1_Sub1_Sub5[7];
						@Pc(355) int local355 = 0;
						for (@Pc(357) int local357 = 0; local357 < 7; local357++) {
							@Pc(364) int local364 = this.anIntArray83[local357];
							if (local364 >= 0) {
								local353[local355++] = Class23.aClass23Array1[local364].method499();
							}
						}
						@Pc(386) Class1_Sub1_Sub1_Sub5 local386 = new Class1_Sub1_Sub1_Sub5(local355, -550, local353);
						for (@Pc(388) int local388 = 0; local388 < 5; local388++) {
							if (this.anIntArray72[local388] != 0) {
								local386.method275(anIntArrayArray4[local388][0], anIntArrayArray4[local388][this.anIntArray72[local388]]);
								if (local388 == 1) {
									local386.method275(anIntArray40[0], anIntArray40[this.anIntArray72[local388]]);
								}
							}
						}
						local386.method268();
						local386.method269(428, Class27.aClass27Array1[aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1009].anIntArray225[0]);
						local386.method278(64, 850, -30, -50, -30, true);
						arg1.anInt450 = 5;
						arg1.anInt451 = 0;
						Class6.method235(local386);
					}
				} else if (local4 == 324) {
					if (this.aClass1_Sub1_Sub2_Sub2_5 == null) {
						this.aClass1_Sub1_Sub2_Sub2_5 = arg1.aClass1_Sub1_Sub2_Sub2_14;
						this.aClass1_Sub1_Sub2_Sub2_6 = arg1.aClass1_Sub1_Sub2_Sub2_15;
					}
					if (this.aBoolean51) {
						arg1.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_6;
					} else {
						arg1.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_5;
					}
				} else if (local4 == 325) {
					if (this.aClass1_Sub1_Sub2_Sub2_5 == null) {
						this.aClass1_Sub1_Sub2_Sub2_5 = arg1.aClass1_Sub1_Sub2_Sub2_14;
						this.aClass1_Sub1_Sub2_Sub2_6 = arg1.aClass1_Sub1_Sub2_Sub2_15;
					}
					if (this.aBoolean51) {
						arg1.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_5;
					} else {
						arg1.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_6;
					}
				} else if (local4 == 600) {
					arg1.aString18 = this.aString14;
					if (anInt248 % 20 < 10) {
						arg1.aString18 = arg1.aString18 + "|";
					} else {
						arg1.aString18 = arg1.aString18 + " ";
					}
				} else {
					if (local4 == 613) {
						if (this.anInt272 < 1) {
							arg1.aString18 = "";
						} else if (this.aBoolean73) {
							arg1.anInt446 = 16711680;
							arg1.aString18 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg1.anInt446 = 16777215;
							arg1.aString18 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(594) String local594;
					if (local4 == 650 || local4 == 655) {
						if (this.anInt342 == 0) {
							arg1.aString18 = "";
						} else {
							if (this.anInt343 == 0) {
								local594 = "earlier today";
							} else if (this.anInt343 == 1) {
								local594 = "yesterday";
							} else {
								local594 = this.anInt343 + " days ago";
							}
							arg1.aString18 = "You last logged in " + local594 + " from: " + signlink.dns;
						}
					}
					if (local4 == 651) {
						if (this.anInt338 == 0) {
							arg1.aString18 = "0 unread messages";
							arg1.anInt446 = 16776960;
						}
						if (this.anInt338 == 1) {
							arg1.aString18 = "1 unread message";
							arg1.anInt446 = 65280;
						}
						if (this.anInt338 > 1) {
							arg1.aString18 = this.anInt338 + " unread messages";
							arg1.anInt446 = 65280;
						}
					}
					if (local4 == 652) {
						if (this.anInt378 == 201) {
							if (this.anInt379 == 1) {
								arg1.aString18 = "@yel@This is a non-members world: @whi@Since you are a member we";
							} else {
								arg1.aString18 = "";
							}
						} else if (this.anInt378 == 200) {
							arg1.aString18 = "You have not yet set any password recovery questions.";
						} else {
							if (this.anInt378 == 0) {
								local594 = "Earlier today";
							} else if (this.anInt378 == 1) {
								local594 = "Yesterday";
							} else {
								local594 = this.anInt378 + " days ago";
							}
							arg1.aString18 = local594 + " you changed your recovery questions";
						}
					}
					if (local4 == 653) {
						if (this.anInt378 == 201) {
							if (this.anInt379 == 1) {
								arg1.aString18 = "@whi@recommend you use a members world instead. You may use";
							} else {
								arg1.aString18 = "";
							}
						} else if (this.anInt378 == 200) {
							arg1.aString18 = "We strongly recommend you do so now to secure your account.";
						} else {
							arg1.aString18 = "If you do not remember making this change then cancel it immediately";
						}
					}
					if (local4 == 654) {
						if (this.anInt378 == 201) {
							if (this.anInt379 == 1) {
								arg1.aString18 = "@whi@this world but member benefits are unavailable whilst here.";
							} else {
								arg1.aString18 = "";
							}
						} else if (this.anInt378 == 200) {
							arg1.aString18 = "Do this from the 'account management' area on our front webpage";
						} else {
							arg1.aString18 = "Do this from the 'account management' area on our front webpage";
						}
					}
				}
			} else if (local4 == 1 && this.anInt232 == 0) {
				arg1.aString18 = "Loading friend list";
				arg1.anInt434 = 0;
			} else if (local4 == 1 && this.anInt232 == 1) {
				arg1.aString18 = "Connecting to friendserver";
				arg1.anInt434 = 0;
			} else if (local4 == 2 && this.anInt232 != 2) {
				arg1.aString18 = "Please wait...";
				arg1.anInt434 = 0;
			} else {
				local64 = this.anInt231;
				if (this.anInt232 != 2) {
					local64 = 0;
				}
				if (local4 > 700) {
					local4 -= 601;
				} else {
					local4--;
				}
				if (local4 >= local64) {
					arg1.aString18 = "";
					arg1.anInt434 = 0;
				} else {
					arg1.aString18 = this.aStringArray6[local4];
					arg1.anInt434 = 1;
				}
			}
		} catch (@Pc(802) RuntimeException local802) {
			signlink.reporterror("90413, " + arg0 + ", " + arg1 + ", " + local802.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method168(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString6 = "";
				this.aString7 = "Connecting to server...";
				this.method114(true);
			}
			this.aClass8_1 = new Class8(this.method163(anInt256 + 43594), this, 564);
			@Pc(30) long local30 = Class48.method667(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass1_Sub1_Sub3_3.anInt751 = 0;
			this.aClass1_Sub1_Sub3_3.method470(14);
			this.aClass1_Sub1_Sub3_3.method470(local37);
			this.aClass8_1.method251(813, 2, this.aClass1_Sub1_Sub3_3.aByteArray9);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass8_1.method248();
			}
			@Pc(74) int local74 = this.aClass8_1.method248();
			@Pc(223) int local223;
			@Pc(258) int local258;
			if (local74 == 0) {
				this.aClass8_1.method250(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, 8);
				this.aClass1_Sub1_Sub3_4.anInt751 = 0;
				this.aLong17 = this.aClass1_Sub1_Sub3_4.method486();
				@Pc(97) int[] local97 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong17 >> 32), (int) this.aLong17 };
				this.aClass1_Sub1_Sub3_3.anInt751 = 0;
				this.aClass1_Sub1_Sub3_3.method470(10);
				this.aClass1_Sub1_Sub3_3.method474(local97[0]);
				this.aClass1_Sub1_Sub3_3.method474(local97[1]);
				this.aClass1_Sub1_Sub3_3.method474(local97[2]);
				this.aClass1_Sub1_Sub3_3.method474(local97[3]);
				this.aClass1_Sub1_Sub3_3.method474(signlink.anInt951);
				this.aClass1_Sub1_Sub3_3.method477(arg0);
				this.aClass1_Sub1_Sub3_3.method477(arg1);
				this.aClass1_Sub1_Sub3_3.method495(aBigInteger2, aBigInteger1);
				this.aClass1_Sub1_Sub3_2.anInt751 = 0;
				if (arg2) {
					this.aClass1_Sub1_Sub3_2.method470(18);
				} else {
					this.aClass1_Sub1_Sub3_2.method470(16);
				}
				this.aClass1_Sub1_Sub3_2.method470(this.aClass1_Sub1_Sub3_3.anInt751 + 36 + 1 + 1 + 2);
				this.aClass1_Sub1_Sub3_2.method470(255);
				this.aClass1_Sub1_Sub3_2.method471(294);
				this.aClass1_Sub1_Sub3_2.method470(aBoolean56 ? 1 : 0);
				for (local223 = 0; local223 < 9; local223++) {
					this.aClass1_Sub1_Sub3_2.method474(this.anIntArray33[local223]);
				}
				this.aClass1_Sub1_Sub3_2.method478(this.aClass1_Sub1_Sub3_3.aByteArray9, this.aByte5, this.aClass1_Sub1_Sub3_3.anInt751);
				this.aClass1_Sub1_Sub3_3.aClass46_2 = new Class46(8, local97);
				for (local258 = 0; local258 < 4; local258++) {
					local97[local258] += 50;
				}
				this.aClass46_1 = new Class46(8, local97);
				this.aClass8_1.method251(813, this.aClass1_Sub1_Sub3_2.anInt751, this.aClass1_Sub1_Sub3_2.aByteArray9);
				local74 = this.aClass8_1.method248();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(300) Exception local300) {
				}
				this.method168(arg0, arg1, arg2);
			} else {
				@Pc(388) int local388;
				if (local74 == 2) {
					this.anInt272 = this.aClass8_1.method248();
					aBoolean71 = this.aClass8_1.method248() == 1;
					this.aLong14 = 0L;
					this.anInt243 = 0;
					this.aClass11_1.anInt548 = 0;
					super.aBoolean50 = true;
					this.aBoolean67 = true;
					this.aBoolean59 = true;
					this.aClass1_Sub1_Sub3_3.anInt751 = 0;
					this.aClass1_Sub1_Sub3_4.anInt751 = 0;
					this.anInt383 = -1;
					this.anInt275 = -1;
					this.anInt276 = -1;
					this.anInt277 = -1;
					this.anInt382 = 0;
					this.anInt384 = 0;
					this.anInt406 = 0;
					this.anInt386 = 0;
					this.anInt323 = 0;
					this.anInt290 = 0;
					this.aBoolean81 = false;
					super.anInt203 = 0;
					for (local388 = 0; local388 < 100; local388++) {
						this.aStringArray2[local388] = null;
					}
					this.anInt409 = 0;
					this.anInt269 = 0;
					this.anInt404 = 0;
					this.anInt336 = 0;
					this.anInt226 = (int) (Math.random() * 100.0D) - 50;
					this.anInt380 = (int) (Math.random() * 110.0D) - 55;
					this.anInt421 = (int) (Math.random() * 80.0D) - 40;
					this.anInt260 = (int) (Math.random() * 120.0D) - 60;
					this.anInt267 = (int) (Math.random() * 30.0D) - 20;
					this.anInt250 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt402 = 0;
					this.anInt316 = -1;
					this.anInt391 = 0;
					this.anInt392 = 0;
					this.anInt352 = 0;
					this.anInt283 = 0;
					for (local223 = 0; local223 < this.anInt350; local223++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local223] = null;
						this.aClass1_Sub1_Sub3Array1[local223] = null;
					}
					for (local258 = 0; local258 < 16384; local258++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local258] = null;
					}
					aClass1_Sub1_Sub1_Sub1_Sub1_1 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anInt351] = new Class1_Sub1_Sub1_Sub1_Sub1();
					this.aClass29_2.method515();
					this.aClass29_3.method515();
					@Pc(533) int local533;
					@Pc(537) int local537;
					for (@Pc(529) int local529 = 0; local529 < 4; local529++) {
						for (local533 = 0; local533 < 104; local533++) {
							for (local537 = 0; local537 < 104; local537++) {
								this.aClass29ArrayArrayArray1[local529][local533][local537] = null;
							}
						}
					}
					this.aClass29_1 = new Class29(18783);
					this.anInt232 = 0;
					this.anInt231 = 0;
					this.anInt349 = -1;
					this.anInt278 = -1;
					this.anInt218 = -1;
					this.anInt279 = -1;
					this.anInt331 = -1;
					this.aBoolean63 = false;
					this.anInt321 = 3;
					this.aBoolean60 = false;
					this.aBoolean81 = false;
					this.aBoolean82 = false;
					this.aString9 = null;
					this.anInt387 = 0;
					this.anInt425 = -1;
					this.aBoolean51 = true;
					this.method127();
					for (local533 = 0; local533 < 5; local533++) {
						this.anIntArray72[local533] = 0;
					}
					for (local537 = 0; local537 < 5; local537++) {
						this.aStringArray5[local537] = null;
						this.aBooleanArray4[local537] = false;
					}
					anInt375 = 0;
					anInt274 = 0;
					anInt285 = 0;
					anInt308 = 0;
					anInt426 = 0;
					anInt247 = 0;
					anInt230 = 0;
					anInt322 = 0;
					anInt254 = 0;
					this.method109();
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
					this.aBoolean59 = true;
					this.aClass1_Sub1_Sub3_3.anInt751 = 0;
					this.aClass1_Sub1_Sub3_4.anInt751 = 0;
					this.anInt383 = -1;
					this.anInt275 = -1;
					this.anInt276 = -1;
					this.anInt277 = -1;
					this.anInt382 = 0;
					this.anInt384 = 0;
					this.anInt406 = 0;
					this.anInt290 = 0;
					this.aBoolean81 = false;
					this.aLong18 = System.currentTimeMillis();
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
					for (local388 = this.aClass8_1.method248(); local388 >= 0; local388--) {
						this.aString6 = "You have only just left another world";
						this.aString7 = "Your profile will be transferred in: " + local388 + " seconds";
						this.method114(true);
						try {
							Thread.sleep(1000L);
						} catch (@Pc(898) Exception local898) {
						}
					}
					this.method168(arg0, arg1, arg2);
				} else if (local74 == -1) {
					this.aString6 = "No response from server";
					this.aString7 = "Please try using a different world.";
				} else {
					System.out.println("response:" + local74);
					this.aString6 = "Unexpected server response";
					this.aString7 = "Please try using a different world.";
				}
			}
		} catch (@Pc(934) IOException local934) {
			this.aString6 = "";
			this.aString7 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;IIIIIIIZ)V")
	private void method169(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		try {
			@Pc(3) boolean local3 = false;
			if (this.aBoolean89) {
				this.anInt373 = 32;
			} else {
				this.anInt373 = 0;
			}
			this.aBoolean89 = false;
			if (arg7 >= arg6 && arg7 < arg6 + 16 && arg1 >= arg5 && arg1 < arg5 + 16) {
				arg0.anInt442 -= this.anInt389 * 4;
				if (arg8) {
					this.aBoolean85 = true;
					return;
				}
			} else if (arg7 >= arg6 && arg7 < arg6 + 16 && arg1 >= arg5 + arg2 - 16 && arg1 < arg5 + arg2) {
				arg0.anInt442 += this.anInt389 * 4;
				if (arg8) {
					this.aBoolean85 = true;
					return;
				}
			} else if (arg7 >= arg6 - this.anInt373 && arg7 < arg6 + this.anInt373 + 16 && arg1 >= arg5 + 16 && arg1 < arg5 + arg2 - 16 && this.anInt389 > 0) {
				@Pc(120) int local120 = (arg2 - 32) * arg2 / arg3;
				if (local120 < 8) {
					local120 = 8;
				}
				@Pc(135) int local135 = arg1 - arg5 - local120 / 2 - 16;
				@Pc(141) int local141 = arg2 - local120 - 32;
				arg0.anInt442 = (arg3 - arg2) * local135 / local141;
				if (arg8) {
					this.aBoolean85 = true;
				}
				this.aBoolean89 = true;
			} else {
				return;
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("91567, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method170() {
		try {
			if (this.anInt386 > 0) {
				this.method113(543);
			} else {
				this.aClass35_26.method524();
				this.aClass1_Sub1_Sub2_Sub4_2.method447(0, 144, 257, "Connection lost");
				this.aClass1_Sub1_Sub2_Sub4_2.method447(16777215, 143, 256, "Connection lost");
				this.aClass1_Sub1_Sub2_Sub4_2.method447(0, 159, 257, "Please wait - attempting to reestablish");
				this.aClass1_Sub1_Sub2_Sub4_2.method447(16777215, 158, 256, "Please wait - attempting to reestablish");
				this.aClass35_26.method525(4, 4, (byte) 3, super.aGraphics2);
				this.anInt402 = 0;
				this.anInt391 = 0;
				@Pc(65) Class8 local65 = this.aClass8_1;
				this.aBoolean59 = false;
				this.method168(this.aString10, this.aString11, true);
				if (!this.aBoolean59) {
					this.method113(543);
				}
				try {
					local65.method247();
				} catch (@Pc(85) Exception local85) {
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("19075, " + true + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;I)Z")
	private boolean method171(@OriginalArg(0) Class6 arg0) {
		try {
			@Pc(9) int local9 = arg0.anInt435;
			if (local9 >= 1 && local9 <= 200 || !(local9 < 701 || local9 > 900)) {
				if (local9 >= 801) {
					local9 -= 701;
				} else if (local9 >= 701) {
					local9 -= 601;
				} else if (local9 >= 101) {
					local9 -= 101;
				} else {
					local9--;
				}
				this.aStringArray3[this.anInt290] = "Remove @whi@" + this.aStringArray6[local9];
				this.anIntArray37[this.anInt290] = 513;
				this.anInt290++;
				this.aStringArray3[this.anInt290] = "Message @whi@" + this.aStringArray6[local9];
				this.anIntArray37[this.anInt290] = 902;
				this.anInt290++;
				return true;
			} else if (local9 >= 401 && local9 <= 500) {
				this.aStringArray3[this.anInt290] = "Remove @whi@" + arg0.aString18;
				this.anIntArray37[this.anInt290] = 884;
				this.anInt290++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("53843, " + arg0 + ", " + 567 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!ab;III)V")
	private void method172(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub1_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg1 != aClass1_Sub1_Sub1_Sub1_Sub1_1 && this.anInt290 < 400) {
				@Pc(35) String local35;
				if (arg1.anInt137 == 0) {
					local35 = arg1.aString3 + method119(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt136, arg1.anInt136) + " (level-" + arg1.anInt136 + ")";
				} else {
					local35 = arg1.aString3 + " (skill-" + arg1.anInt137 + ")";
				}
				@Pc(165) int local165;
				if (this.anInt409 == 1) {
					this.aStringArray3[this.anInt290] = "Use " + this.aString16 + " with @whi@" + local35;
					this.anIntArray37[this.anInt290] = 275;
					this.anIntArray38[this.anInt290] = arg4;
					this.anIntArray35[this.anInt290] = arg2;
					this.anIntArray36[this.anInt290] = arg3;
					this.anInt290++;
				} else if (this.anInt269 != 1) {
					for (local165 = 4; local165 >= 0; local165--) {
						if (this.aStringArray5[local165] != null) {
							this.aStringArray3[this.anInt290] = this.aStringArray5[local165] + " @whi@" + local35;
							@Pc(192) short local192 = 0;
							if (this.aStringArray5[local165].equalsIgnoreCase("attack")) {
								if (arg1.anInt136 > aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt136) {
									local192 = 2000;
								}
								if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt148 != 0 && arg1.anInt148 != 0) {
									if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt148 == arg1.anInt148) {
										local192 = 2000;
									} else {
										local192 = 0;
									}
								}
							} else if (this.aBooleanArray4[local165]) {
								local192 = 2000;
							}
							if (local165 == 0) {
								this.anIntArray37[this.anInt290] = local192 + 639;
							}
							if (local165 == 1) {
								this.anIntArray37[this.anInt290] = local192 + 499;
							}
							if (local165 == 2) {
								this.anIntArray37[this.anInt290] = local192 + 27;
							}
							if (local165 == 3) {
								this.anIntArray37[this.anInt290] = local192 + 387;
							}
							if (local165 == 4) {
								this.anIntArray37[this.anInt290] = local192 + 185;
							}
							this.anIntArray38[this.anInt290] = arg4;
							this.anIntArray35[this.anInt290] = arg2;
							this.anIntArray36[this.anInt290] = arg3;
							this.anInt290++;
						}
					}
				} else if ((this.anInt271 & 0x8) == 8) {
					this.aStringArray3[this.anInt290] = this.aString5 + " @whi@" + local35;
					this.anIntArray37[this.anInt290] = 131;
					this.anIntArray38[this.anInt290] = arg4;
					this.anIntArray35[this.anInt290] = arg2;
					this.anIntArray36[this.anInt290] = arg3;
					this.anInt290++;
				}
				for (local165 = 0; local165 < this.anInt290; local165++) {
					if (this.anIntArray37[local165] == 718) {
						this.aStringArray3[local165] = "Walk here @whi@" + local35;
						break;
					}
				}
				@Pc(346) boolean local346 = false;
			}
		} catch (@Pc(352) RuntimeException local352) {
			signlink.reporterror("30261, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local352.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!jb;Z)V")
	private void method173(@OriginalArg(0) Class1_Sub1_Sub2_Sub3 arg0) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray73.length; local5++) {
				this.anIntArray73[local5] = 0;
			}
			@Pc(30) int local30;
			for (@Pc(20) int local20 = 0; local20 < 5000; local20++) {
				local30 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray73[local30] = (int) (Math.random() * 256.0D);
			}
			@Pc(56) int local56;
			@Pc(60) int local60;
			@Pc(68) int local68;
			for (local30 = 0; local30 < 20; local30++) {
				for (local56 = 1; local56 < 255; local56++) {
					for (local60 = 1; local60 < 127; local60++) {
						local68 = local60 + (local56 << 7);
						this.anIntArray74[local68] = (this.anIntArray73[local68 - 1] + this.anIntArray73[local68 + 1] + this.anIntArray73[local68 - 128] + this.anIntArray73[local68 + 128]) / 4;
					}
				}
				@Pc(114) int[] local114 = this.anIntArray73;
				this.anIntArray73 = this.anIntArray74;
				this.anIntArray74 = local114;
			}
			if (arg0 != null) {
				local56 = 0;
				for (local60 = 0; local60 < arg0.anInt689; local60++) {
					for (local68 = 0; local68 < arg0.anInt688; local68++) {
						if (arg0.aByteArray7[local56++] != 0) {
							@Pc(150) int local150 = local68 + arg0.anInt690 + 16;
							@Pc(157) int local157 = local60 + arg0.anInt691 + 16;
							@Pc(163) int local163 = local150 + (local157 << 7);
							this.anIntArray73[local163] = 0;
						}
					}
				}
			}
		} catch (@Pc(180) RuntimeException local180) {
			signlink.reporterror("66687, " + arg0 + ", " + false + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method174() {
		try {
			this.method97();
			if (this.anInt330 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array7[this.anInt329 / 100].method391(this.anInt327 - 8 - 4, this.anInt328 - 8 - 4);
			}
			if (this.anInt330 == 2) {
				this.aClass1_Sub1_Sub2_Sub2Array7[this.anInt329 / 100 + 4].method391(this.anInt327 - 8 - 4, this.anInt328 - 8 - 4);
				anInt395++;
				if (anInt395 > 57) {
					anInt395 = 0;
					this.aClass1_Sub1_Sub3_3.method469(254);
				}
			}
			if (this.anInt331 != -1) {
				this.method213(this.anInt216, this.anInt331, this.anInt372);
				this.method203(0, 0, Class6.aClass6Array1[this.anInt331], 0);
			}
			if (this.anInt218 != -1) {
				this.method213(this.anInt216, this.anInt218, this.anInt372);
				this.method203(0, 0, Class6.aClass6Array1[this.anInt218], 0);
			}
			this.method134();
			if (!this.aBoolean81) {
				this.method178();
				this.method226((byte) 1);
			} else if (this.anInt236 == 0) {
				this.method230(711);
			}
			if (this.anInt387 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array5[1].method391(472, 296);
			}
			@Pc(191) int local191;
			if (aBoolean54) {
				@Pc(167) byte local167 = 20;
				@Pc(169) int local169 = 16776960;
				if (super.anInt200 < 15) {
					local169 = 16711680;
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method446(local169, "Fps:" + super.anInt200, 20);
				local191 = local167 + 15;
				@Pc(193) Runtime local193 = Runtime.getRuntime();
				@Pc(202) int local202 = (int) ((local193.totalMemory() - local193.freeMemory()) / 1024L);
				if (local202 > 33554432 && aBoolean56) {
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method446(16776960, "Mem:" + local202 + "k", 35);
				local191 += 15;
			}
			if (this.anInt406 != 0) {
				@Pc(236) int local236 = this.anInt406 / 50;
				local191 = local236 / 60;
				@Pc(244) int local244 = local236 % 60;
				if (local244 < 10) {
					this.aClass1_Sub1_Sub2_Sub4_2.method451("System update in: " + local191 + ":0" + local244, 16776960, 4, 329);
				} else {
					this.aClass1_Sub1_Sub2_Sub4_2.method451("System update in: " + local191 + ":" + local244, 16776960, 4, 329);
				}
			}
		} catch (@Pc(286) RuntimeException local286) {
			signlink.reporterror("15617, " + 3 + ", " + local286.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IZ)V")
	private void method175(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1005 >> 7 == this.anInt391 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1006 >> 7 == this.anInt392) {
				this.anInt391 = 0;
				anInt257++;
				if (anInt257 > 122) {
					anInt257 = 0;
					this.aClass1_Sub1_Sub3_3.method469(174);
					this.aClass1_Sub1_Sub3_3.method470(62);
				}
			}
			@Pc(39) int local39 = this.anInt352;
			@Pc(43) boolean local43 = false;
			if (arg1) {
				local39 = 1;
			}
			for (@Pc(49) int local49 = 0; local49 < local39; local49++) {
				@Pc(55) Class1_Sub1_Sub1_Sub1_Sub1 local55;
				@Pc(60) int local60;
				if (arg1) {
					local55 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
					local60 = this.anInt351 << 14;
				} else {
					local55 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray66[local49]];
					local60 = this.anIntArray66[local49] << 14;
				}
				if (local55 != null && local55.method680()) {
					local55.aBoolean30 = false;
					if ((aBoolean56 && this.anInt352 > 50 || this.anInt352 > 200) && !arg1 && local55.anInt1025 == local55.anInt1009) {
						local55.aBoolean30 = true;
					}
					@Pc(111) int local111 = local55.anInt1005 >> 7;
					@Pc(116) int local116 = local55.anInt1006 >> 7;
					if (local111 >= 0 && local111 < 104 && local116 >= 0 && local116 < 104) {
						if (local55.aClass1_Sub1_Sub1_Sub5_1 == null || anInt248 < local55.anInt139 || anInt248 >= local55.anInt140) {
							if ((local55.anInt1005 & 0x7F) == 64 && (local55.anInt1006 & 0x7F) == 64) {
								if (this.anIntArrayArray6[local111][local116] == this.anInt281) {
									continue;
								}
								this.anIntArrayArray6[local111][local116] = this.anInt281;
							}
							local55.anInt138 = this.method218(local55.anInt1005, local55.anInt1006, this.anInt325);
							this.aClass37_1.method541(60, this.anInt325, local55.anInt1006, local60, local55, local55.anInt138, local55.anInt1005, local55.anInt1007, local55.aBoolean253);
						} else {
							local55.aBoolean30 = false;
							local55.anInt138 = this.method218(local55.anInt1005, local55.anInt1006, this.anInt325);
							this.aClass37_1.method542(local55.anInt138, local55.anInt1005, local55.anInt147, local55.anInt144, local60, this.anInt325, local55.anInt1006, local55, local55.anInt1007, local55.anInt145, local55.anInt146, this.anInt242);
						}
					}
				}
			}
		} catch (@Pc(246) RuntimeException local246) {
			signlink.reporterror("63657, " + arg0 + ", " + arg1 + ", " + local246.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method176() {
		try {
			@Pc(4) Graphics local4 = this.method94().getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			this.method87();
			@Pc(42) byte local42;
			@Pc(48) int local48;
			if (this.aBoolean57) {
				this.aBoolean79 = false;
				local4.setFont(new Font("Helvetica", 1, 16));
				local4.setColor(Color.yellow);
				local42 = 35;
				local4.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
				local48 = local42 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				@Pc(57) int local57 = local48 + 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				@Pc(74) int local74 = local57 + 30;
				local4.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
				@Pc(80) int local80 = local74 + 30;
				local4.drawString("3: Try using a different game-world", 30, 195);
				@Pc(86) int local86 = local80 + 30;
				local4.drawString("4: Try rebooting your computer", 30, 225);
				@Pc(92) int local92 = local86 + 30;
				local4.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
			}
			if (this.aBoolean86) {
				this.aBoolean79 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean88) {
				this.aBoolean79 = false;
				local4.setColor(Color.yellow);
				local42 = 35;
				local4.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
				local48 = local42 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				local48 += 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				local48 += 30;
				local4.drawString("2: Try rebooting your computer, and reloading", 30, 165);
				local48 += 30;
			}
		} catch (@Pc(180) RuntimeException local180) {
			signlink.reporterror("9439, " + false + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!lb;)V")
	private void method177(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt752 + 10 < arg0 * 8) {
					@Pc(15) int local15 = arg1.method491(11);
					if (local15 != 2047) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local15] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local15] = new Class1_Sub1_Sub1_Sub1_Sub1();
							if (this.aClass1_Sub1_Sub3Array1[local15] != null) {
								this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local15].method39(this.aClass1_Sub1_Sub3Array1[local15]);
							}
						}
						this.anIntArray66[this.anInt352++] = local15;
						@Pc(61) Class1_Sub1_Sub1_Sub1_Sub1 local61 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local15];
						local61.anInt1045 = anInt248;
						@Pc(69) int local69 = arg1.method491(5);
						if (local69 > 15) {
							local69 -= 32;
						}
						@Pc(78) int local78 = arg1.method491(5);
						if (local78 > 15) {
							local78 -= 32;
						}
						@Pc(87) int local87 = arg1.method491(1);
						local61.method677(local87 == 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0] + local69, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0] + local78, aBoolean74);
						@Pc(113) int local113 = arg1.method491(1);
						if (local113 == 1) {
							this.anIntArray67[this.anInt353++] = local15;
						}
						continue;
					}
				}
				arg1.method492();
				return;
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("17784, " + 912 + ", " + arg0 + ", " + arg1 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method178() {
		try {
			if (this.anInt368 == 0) {
				this.aStringArray3[0] = "Cancel";
				this.anIntArray37[0] = 1106;
				this.anInt290 = 1;
				this.method103();
				this.anInt341 = 0;
				if (super.anInt205 > 4 && super.anInt206 > 4 && super.anInt205 < 516 && super.anInt206 < 338) {
					if (this.anInt218 == -1) {
						this.method145((byte) 9);
					} else {
						this.method198(4, 4, Class6.aClass6Array1[this.anInt218], super.anInt206, 0, super.anInt205);
					}
				}
				if (this.anInt341 != this.anInt298) {
					this.anInt298 = this.anInt341;
				}
				this.anInt341 = 0;
				if (super.anInt205 > 553 && super.anInt206 > 205 && super.anInt205 < 743 && super.anInt206 < 466) {
					if (this.anInt279 != -1) {
						this.method198(553, 205, Class6.aClass6Array1[this.anInt279], super.anInt206, 0, super.anInt205);
					} else if (this.anIntArray85[this.anInt321] != -1) {
						this.method198(553, 205, Class6.aClass6Array1[this.anIntArray85[this.anInt321]], super.anInt206, 0, super.anInt205);
					}
				}
				if (this.anInt341 != this.anInt288) {
					this.aBoolean85 = true;
					this.anInt288 = this.anInt341;
				}
				this.anInt341 = 0;
				if (super.anInt205 > 17 && super.anInt206 > 357 && super.anInt205 < 496 && super.anInt206 < 453) {
					if (this.anInt278 != -1) {
						this.method198(17, 357, Class6.aClass6Array1[this.anInt278], super.anInt206, 0, super.anInt205);
					} else if (super.anInt206 < 434 && super.anInt205 < 426) {
						this.method215(super.anInt206 - 357, super.anInt205 - 17);
					}
				}
				if (this.anInt278 != -1 && this.anInt341 != this.anInt424) {
					this.aBoolean80 = true;
					this.anInt424 = this.anInt341;
				}
				@Pc(229) boolean local229 = false;
				while (!local229) {
					local229 = true;
					for (@Pc(235) int local235 = 0; local235 < this.anInt290 - 1; local235++) {
						if (this.anIntArray37[local235] < 1000 && this.anIntArray37[local235 + 1] > 1000) {
							@Pc(256) String local256 = this.aStringArray3[local235];
							this.aStringArray3[local235] = this.aStringArray3[local235 + 1];
							this.aStringArray3[local235 + 1] = local256;
							@Pc(278) int local278 = this.anIntArray37[local235];
							this.anIntArray37[local235] = this.anIntArray37[local235 + 1];
							this.anIntArray37[local235 + 1] = local278;
							@Pc(300) int local300 = this.anIntArray35[local235];
							this.anIntArray35[local235] = this.anIntArray35[local235 + 1];
							this.anIntArray35[local235 + 1] = local300;
							@Pc(322) int local322 = this.anIntArray36[local235];
							this.anIntArray36[local235] = this.anIntArray36[local235 + 1];
							this.anIntArray36[local235 + 1] = local322;
							@Pc(344) int local344 = this.anIntArray38[local235];
							this.anIntArray38[local235] = this.anIntArray38[local235 + 1];
							this.anIntArray38[local235 + 1] = local344;
							local229 = false;
						}
					}
				}
			}
		} catch (@Pc(374) RuntimeException local374) {
			signlink.reporterror("87456, " + -19355 + ", " + local374.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JZ)V")
	private void method179(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(15) int local15 = 0; local15 < this.anInt407; local15++) {
					if (this.aLongArray3[local15] == arg0) {
						this.anInt407--;
						this.aBoolean85 = true;
						for (@Pc(35) int local35 = local15; local35 < this.anInt407; local35++) {
							this.aLongArray3[local35] = this.aLongArray3[local35 + 1];
						}
						this.aClass1_Sub1_Sub3_3.method469(228);
						this.aClass1_Sub1_Sub3_3.method476(arg0, aBoolean90);
						return;
					}
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("30787, " + arg0 + ", " + false + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	private void method180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg1 >= 1 && arg0 >= 1 && arg1 <= 102 && arg0 <= 102) {
				if (aBoolean56 && arg4 != this.anInt325) {
					return;
				}
				@Pc(33) int local33 = 0;
				if (arg2 == 0) {
					local33 = this.aClass37_1.method556(arg4, arg1, arg0);
				}
				if (arg2 == 1) {
					local33 = this.aClass37_1.method557(arg1, arg0, arg4);
				}
				if (arg2 == 2) {
					local33 = this.aClass37_1.method558(arg4, arg1, arg0);
				}
				if (arg2 == 3) {
					local33 = this.aClass37_1.method559(arg4, arg1, arg0);
				}
				@Pc(89) int local89;
				if (local33 != 0) {
					local89 = this.aClass37_1.method560(arg4, arg1, arg0, local33);
					@Pc(95) int local95 = local33 >> 14 & 0x7FFF;
					@Pc(99) int local99 = local89 & 0x1F;
					@Pc(103) int local103 = local89 >> 6;
					@Pc(115) Class9 local115;
					if (arg2 == 0) {
						this.aClass37_1.method547(arg1, arg0, (byte) 3, arg4);
						local115 = Class9.method288(local95);
						if (local115.aBoolean125) {
							this.aClass19Array1[arg4].method425(local115.aBoolean126, local103, arg0, (byte) 9, arg1, local99);
						}
					}
					if (arg2 == 1) {
						this.aClass37_1.method548(arg4, arg1, arg0);
					}
					if (arg2 == 2) {
						this.aClass37_1.method549(arg1, 203, arg4, arg0);
						local115 = Class9.method288(local95);
						if (arg1 + local115.anInt517 > 103 || arg0 + local115.anInt517 > 103 || arg1 + local115.anInt518 > 103 || arg0 + local115.anInt518 > 103) {
							return;
						}
						if (local115.aBoolean125) {
							this.aClass19Array1[arg4].method426(local115.aBoolean126, arg1, local115.anInt517, local103, local115.anInt518, arg0);
						}
					}
					if (arg2 == 3) {
						this.aClass37_1.method550(arg4, arg0, arg1);
						local115 = Class9.method288(local95);
						if (local115.aBoolean125 && local115.aBoolean127) {
							this.aClass19Array1[arg4].method428(arg0, arg1);
						}
					}
				}
				if (arg6 >= 0) {
					local89 = arg4;
					if (arg4 < 3 && (this.aByteArrayArrayArray7[1][arg1][arg0] & 0x2) == 2) {
						local89 = arg4 + 1;
					}
					Class4.method73(arg0, arg3, arg4, this.aClass37_1, local89, this.aClass19Array1[arg4], this.anIntArrayArrayArray5, arg5, arg6, arg1);
					return;
				}
			}
		} catch (@Pc(262) RuntimeException local262) {
			signlink.reporterror("94246, " + arg0 + ", " + arg1 + ", " + 9 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local262.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method181() {
		try {
			@Pc(16) int local16;
			for (@Pc(8) int local8 = -1; local8 < this.anInt352; local8++) {
				if (local8 == -1) {
					local16 = this.anInt351;
				} else {
					local16 = this.anIntArray66[local8];
				}
				@Pc(28) Class1_Sub1_Sub1_Sub1_Sub1 local28 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local16];
				if (local28 != null && local28.anInt1016 > 0) {
					local28.anInt1016--;
					if (local28.anInt1016 == 0) {
						local28.aString31 = null;
					}
				}
			}
			for (local16 = 0; local16 < this.anInt283; local16++) {
				@Pc(59) int local59 = this.anIntArray48[local16];
				@Pc(64) Class1_Sub1_Sub1_Sub1_Sub2 local64 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local59];
				if (local64 != null && local64.anInt1016 > 0) {
					local64.anInt1016--;
					if (local64.anInt1016 == 0) {
						local64.aString31 = null;
					}
				}
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("75852, " + 8 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!lb;I)V")
	private void method182(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(6) int local6 = arg1.method491(8);
			@Pc(10) boolean local10 = false;
			@Pc(16) int local16;
			if (local6 < this.anInt352) {
				for (local16 = local6; local16 < this.anInt352; local16++) {
					this.anIntArray65[this.anInt334++] = this.anIntArray66[local16];
				}
			}
			if (local6 > this.anInt352) {
				signlink.reporterror(this.aString10 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt352 = 0;
			for (local16 = 0; local16 < local6; local16++) {
				@Pc(68) int local68 = this.anIntArray66[local16];
				@Pc(73) Class1_Sub1_Sub1_Sub1_Sub1 local73 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local68];
				@Pc(78) int local78 = arg1.method491(1);
				if (local78 == 0) {
					this.anIntArray66[this.anInt352++] = local68;
					local73.anInt1045 = anInt248;
				} else {
					@Pc(101) int local101 = arg1.method491(2);
					if (local101 == 0) {
						this.anIntArray66[this.anInt352++] = local68;
						local73.anInt1045 = anInt248;
						this.anIntArray67[this.anInt353++] = local68;
					} else {
						@Pc(152) int local152;
						@Pc(162) int local162;
						if (local101 == 1) {
							this.anIntArray66[this.anInt352++] = local68;
							local73.anInt1045 = anInt248;
							local152 = arg1.method491(3);
							local73.method678(local152, false);
							local162 = arg1.method491(1);
							if (local162 == 1) {
								this.anIntArray67[this.anInt353++] = local68;
							}
						} else if (local101 == 2) {
							this.anIntArray66[this.anInt352++] = local68;
							local73.anInt1045 = anInt248;
							local152 = arg1.method491(3);
							local73.method678(local152, true);
							local162 = arg1.method491(3);
							local73.method678(local162, true);
							@Pc(220) int local220 = arg1.method491(1);
							if (local220 == 1) {
								this.anIntArray67[this.anInt353++] = local68;
							}
						} else if (local101 == 3) {
							this.anIntArray65[this.anInt334++] = local68;
						}
					}
				}
			}
		} catch (@Pc(257) RuntimeException local257) {
			signlink.reporterror("50195, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local257.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method183() {
		try {
			for (@Pc(12) int local12 = 0; local12 < this.anInt283; local12++) {
				@Pc(19) int local19 = this.anIntArray48[local12];
				@Pc(24) Class1_Sub1_Sub1_Sub1_Sub2 local24 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local19];
				if (local24 != null) {
					this.method184(local24.aClass13_2.aByte16, local24);
				}
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("63411, " + false + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!y;)V")
	private void method184(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub1_Sub1 arg1) {
		try {
			if (arg1.anInt1005 < 128 || arg1.anInt1006 < 128 || arg1.anInt1005 >= 13184 || arg1.anInt1006 >= 13184) {
				arg1.anInt1028 = -1;
				arg1.anInt1033 = -1;
				arg1.anInt1042 = 0;
				arg1.anInt1043 = 0;
				arg1.anInt1005 = arg1.anIntArray272[0] * 128 + arg1.anInt1008 * 64;
				arg1.anInt1006 = arg1.anIntArray273[0] * 128 + arg1.anInt1008 * 64;
				arg1.method679();
			}
			if (arg1 == aClass1_Sub1_Sub1_Sub1_Sub1_1 && (arg1.anInt1005 < 1536 || arg1.anInt1006 < 1536 || arg1.anInt1005 >= 11776 || arg1.anInt1006 >= 11776)) {
				arg1.anInt1028 = -1;
				arg1.anInt1033 = -1;
				arg1.anInt1042 = 0;
				arg1.anInt1043 = 0;
				arg1.anInt1005 = arg1.anIntArray272[0] * 128 + arg1.anInt1008 * 64;
				arg1.anInt1006 = arg1.anIntArray273[0] * 128 + arg1.anInt1008 * 64;
				arg1.method679();
			}
			if (arg1.anInt1042 > anInt248) {
				this.method185(arg1);
			} else if (arg1.anInt1043 >= anInt248) {
				this.method186(arg1);
			} else {
				this.method187(arg1);
			}
			this.method188(arg1);
			this.method189(arg1);
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("66090, " + arg0 + ", " + -286 + ", " + arg1 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!y;Z)V")
	private void method185(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt1042 - anInt248;
			@Pc(14) int local14 = arg0.anInt1038 * 128 + arg0.anInt1008 * 64;
			@Pc(24) int local24 = arg0.anInt1040 * 128 + arg0.anInt1008 * 64;
			arg0.anInt1005 += (local14 - arg0.anInt1005) / local4;
			arg0.anInt1006 += (local24 - arg0.anInt1006) / local4;
			arg0.anInt1050 = 0;
			if (arg0.anInt1044 == 0) {
				arg0.anInt1047 = 1024;
			}
			if (arg0.anInt1044 == 1) {
				arg0.anInt1047 = 1536;
			}
			if (arg0.anInt1044 == 2) {
				arg0.anInt1047 = 0;
			}
			if (arg0.anInt1044 == 3) {
				arg0.anInt1047 = 512;
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("17456, " + arg0 + ", " + true + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!y;B)V")
	private void method186(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt1043 == anInt248 || arg0.anInt1028 == -1 || arg0.anInt1031 != 0 || arg0.anInt1030 + 1 > Class27.aClass27Array1[arg0.anInt1028].method506(arg0.anInt1029)) {
				@Pc(37) int local37 = arg0.anInt1043 - arg0.anInt1042;
				@Pc(42) int local42 = anInt248 - arg0.anInt1042;
				@Pc(52) int local52 = arg0.anInt1038 * 128 + arg0.anInt1008 * 64;
				@Pc(62) int local62 = arg0.anInt1040 * 128 + arg0.anInt1008 * 64;
				@Pc(72) int local72 = arg0.anInt1039 * 128 + arg0.anInt1008 * 64;
				@Pc(82) int local82 = arg0.anInt1041 * 128 + arg0.anInt1008 * 64;
				arg0.anInt1005 = (local52 * (local37 - local42) + local72 * local42) / local37;
				arg0.anInt1006 = (local62 * (local37 - local42) + local82 * local42) / local37;
			}
			arg0.anInt1050 = 0;
			if (arg0.anInt1044 == 0) {
				arg0.anInt1047 = 1024;
			}
			if (arg0.anInt1044 == 1) {
				arg0.anInt1047 = 1536;
			}
			if (arg0.anInt1044 == 2) {
				arg0.anInt1047 = 0;
			}
			if (arg0.anInt1044 == 3) {
				arg0.anInt1047 = 512;
			}
			arg0.anInt1007 = arg0.anInt1047;
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("51173, " + arg0 + ", " + -39 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!y;)V")
	private void method187(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.anInt1025 = arg0.anInt1009;
			if (arg0.anInt1049 == 0) {
				arg0.anInt1050 = 0;
			} else {
				if (arg0.anInt1028 != -1 && arg0.anInt1031 == 0) {
					@Pc(24) Class27 local24 = Class27.aClass27Array1[arg0.anInt1028];
					if (arg0.anInt1051 > 0 && local24.anInt813 == 0) {
						arg0.anInt1050++;
						return;
					}
					if (arg0.anInt1051 <= 0 && local24.anInt814 == 0) {
						arg0.anInt1050++;
						return;
					}
				}
				@Pc(53) int local53 = arg0.anInt1005;
				@Pc(56) int local56 = arg0.anInt1006;
				@Pc(71) int local71 = arg0.anIntArray272[arg0.anInt1049 - 1] * 128 + arg0.anInt1008 * 64;
				@Pc(86) int local86 = arg0.anIntArray273[arg0.anInt1049 - 1] * 128 + arg0.anInt1008 * 64;
				if (local71 - local53 <= 256 && local71 - local53 >= -256 && local86 - local56 <= 256 && local86 - local56 >= -256) {
					if (local53 < local71) {
						if (local56 < local86) {
							arg0.anInt1047 = 1280;
						} else if (local56 > local86) {
							arg0.anInt1047 = 1792;
						} else {
							arg0.anInt1047 = 1536;
						}
					} else if (local53 > local71) {
						if (local56 < local86) {
							arg0.anInt1047 = 768;
						} else if (local56 > local86) {
							arg0.anInt1047 = 256;
						} else {
							arg0.anInt1047 = 512;
						}
					} else if (local56 < local86) {
						arg0.anInt1047 = 1024;
					} else {
						arg0.anInt1047 = 0;
					}
					@Pc(185) int local185 = arg0.anInt1047 - arg0.anInt1007 & 0x7FF;
					if (local185 > 1024) {
						local185 -= 2048;
					}
					@Pc(192) int local192 = arg0.anInt1012;
					if (local185 >= -256 && local185 <= 256) {
						local192 = arg0.anInt1011;
					} else if (local185 >= 256 && local185 < 768) {
						local192 = arg0.anInt1014;
					} else if (local185 >= -768 && local185 <= -256) {
						local192 = arg0.anInt1013;
					}
					if (local192 == -1) {
						local192 = arg0.anInt1011;
					}
					arg0.anInt1025 = local192;
					@Pc(234) int local234 = 4;
					if (arg0.anInt1007 != arg0.anInt1047 && arg0.anInt1022 == -1 && arg0.anInt1048 != 0) {
						local234 = 2;
					}
					if (arg0.anInt1049 > 2) {
						local234 = 6;
					}
					if (arg0.anInt1049 > 3) {
						local234 = 8;
					}
					if (arg0.anInt1050 > 0 && arg0.anInt1049 > 1) {
						local234 = 8;
						arg0.anInt1050--;
					}
					if (arg0.aBooleanArray12[arg0.anInt1049 - 1]) {
						local234 <<= 0x1;
					}
					if (local234 >= 8 && arg0.anInt1025 == arg0.anInt1011 && arg0.anInt1015 != -1) {
						arg0.anInt1025 = arg0.anInt1015;
					}
					if (local53 < local71) {
						arg0.anInt1005 += local234;
						if (arg0.anInt1005 > local71) {
							arg0.anInt1005 = local71;
						}
					} else if (local53 > local71) {
						arg0.anInt1005 -= local234;
						if (arg0.anInt1005 < local71) {
							arg0.anInt1005 = local71;
						}
					}
					if (local56 < local86) {
						arg0.anInt1006 += local234;
						if (arg0.anInt1006 > local86) {
							arg0.anInt1006 = local86;
						}
					} else if (local56 > local86) {
						arg0.anInt1006 -= local234;
						if (arg0.anInt1006 < local86) {
							arg0.anInt1006 = local86;
						}
					}
					if (arg0.anInt1005 == local71 && arg0.anInt1006 == local86) {
						arg0.anInt1049--;
						if (arg0.anInt1051 > 0) {
							arg0.anInt1051--;
							return;
						}
					}
				} else {
					arg0.anInt1005 = local71;
					arg0.anInt1006 = local86;
				}
			}
		} catch (@Pc(396) RuntimeException local396) {
			signlink.reporterror("50518, " + false + ", " + arg0 + ", " + local396.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZLclient!y;)V")
	private void method188(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt1048 != 0) {
				@Pc(34) int local34;
				@Pc(40) int local40;
				if (arg0.anInt1022 != -1 && arg0.anInt1022 < 32768) {
					@Pc(26) Class1_Sub1_Sub1_Sub1_Sub2 local26 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[arg0.anInt1022];
					if (local26 != null) {
						local34 = arg0.anInt1005 - local26.anInt1005;
						local40 = arg0.anInt1006 - local26.anInt1006;
						if (local34 != 0 || local40 != 0) {
							arg0.anInt1047 = (int) (Math.atan2((double) local34, (double) local40) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(65) int local65;
				if (arg0.anInt1022 >= 32768) {
					local65 = arg0.anInt1022 - 32768;
					if (local65 == this.anInt326) {
						local65 = this.anInt351;
					}
					@Pc(77) Class1_Sub1_Sub1_Sub1_Sub1 local77 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local65];
					if (local77 != null) {
						local40 = arg0.anInt1005 - local77.anInt1005;
						@Pc(91) int local91 = arg0.anInt1006 - local77.anInt1006;
						if (local40 != 0 || local91 != 0) {
							arg0.anInt1047 = (int) (Math.atan2((double) local40, (double) local91) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt1023 != 0 || arg0.anInt1024 != 0) && (arg0.anInt1049 == 0 || arg0.anInt1050 > 0)) {
					local65 = arg0.anInt1005 - (arg0.anInt1023 - this.anInt357 - this.anInt357) * 64;
					local34 = arg0.anInt1006 - (arg0.anInt1024 - this.anInt358 - this.anInt358) * 64;
					if (local65 != 0 || local34 != 0) {
						arg0.anInt1047 = (int) (Math.atan2((double) local65, (double) local34) * 325.949D) & 0x7FF;
					}
					arg0.anInt1023 = 0;
					arg0.anInt1024 = 0;
				}
				local65 = arg0.anInt1047 - arg0.anInt1007 & 0x7FF;
				if (local65 != 0) {
					if (local65 < arg0.anInt1048 || local65 > 2048 - arg0.anInt1048) {
						arg0.anInt1007 = arg0.anInt1047;
					} else if (local65 > 1024) {
						arg0.anInt1007 -= arg0.anInt1048;
					} else {
						arg0.anInt1007 += arg0.anInt1048;
					}
					arg0.anInt1007 &= 0x7FF;
					if (arg0.anInt1025 == arg0.anInt1009 && arg0.anInt1007 != arg0.anInt1047) {
						if (arg0.anInt1010 != -1) {
							arg0.anInt1025 = arg0.anInt1010;
							return;
						}
						arg0.anInt1025 = arg0.anInt1011;
						return;
					}
				}
			}
		} catch (@Pc(245) RuntimeException local245) {
			signlink.reporterror("39554, " + false + ", " + arg0 + ", " + local245.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!y;Z)V")
	private void method189(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.aBoolean253 = false;
			@Pc(16) Class27 local16;
			if (arg0.anInt1025 != -1) {
				local16 = Class27.aClass27Array1[arg0.anInt1025];
				arg0.anInt1027++;
				if (arg0.anInt1026 < local16.anInt807 && arg0.anInt1027 > local16.method506(arg0.anInt1026)) {
					arg0.anInt1027 = 0;
					arg0.anInt1026++;
				}
				if (arg0.anInt1026 >= local16.anInt807) {
					arg0.anInt1027 = 0;
					arg0.anInt1026 = 0;
				}
			}
			if (arg0.anInt1033 != -1 && anInt248 >= arg0.anInt1036) {
				if (arg0.anInt1034 < 0) {
					arg0.anInt1034 = 0;
				}
				local16 = Class33.aClass33Array1[arg0.anInt1033].aClass27_2;
				arg0.anInt1035++;
				while (arg0.anInt1034 < local16.anInt807 && arg0.anInt1035 > local16.method506(arg0.anInt1034)) {
					arg0.anInt1035 -= local16.method506(arg0.anInt1034);
					arg0.anInt1034++;
				}
				if (arg0.anInt1034 >= local16.anInt807 && (arg0.anInt1034 < 0 || arg0.anInt1034 >= local16.anInt807)) {
					arg0.anInt1033 = -1;
				}
			}
			if (arg0.anInt1028 != -1 && arg0.anInt1031 <= 1) {
				local16 = Class27.aClass27Array1[arg0.anInt1028];
				if (local16.anInt813 == 1 && arg0.anInt1051 > 0 && arg0.anInt1042 <= anInt248 && arg0.anInt1043 < anInt248) {
					arg0.anInt1031 = 1;
					return;
				}
			}
			if (arg0.anInt1028 != -1 && arg0.anInt1031 == 0) {
				local16 = Class27.aClass27Array1[arg0.anInt1028];
				arg0.anInt1030++;
				while (arg0.anInt1029 < local16.anInt807 && arg0.anInt1030 > local16.method506(arg0.anInt1029)) {
					arg0.anInt1030 -= local16.method506(arg0.anInt1029);
					arg0.anInt1029++;
				}
				if (arg0.anInt1029 >= local16.anInt807) {
					arg0.anInt1029 -= local16.anInt808;
					arg0.anInt1032++;
					if (arg0.anInt1032 >= local16.anInt812) {
						arg0.anInt1028 = -1;
					}
					if (arg0.anInt1029 < 0 || arg0.anInt1029 >= local16.anInt807) {
						arg0.anInt1028 = -1;
					}
				}
				arg0.aBoolean253 = local16.aBoolean214;
			}
			if (arg0.anInt1031 > 0) {
				arg0.anInt1031--;
			}
		} catch (@Pc(261) RuntimeException local261) {
			signlink.reporterror("31579, " + arg0 + ", " + false + ", " + local261.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
	private void method190() {
		try {
			if (this.aBoolean69) {
				this.aBoolean69 = false;
				this.aClass35_12.method525(0, 4, (byte) 3, super.aGraphics2);
				this.aClass35_13.method525(0, 357, (byte) 3, super.aGraphics2);
				this.aClass35_14.method525(722, 4, (byte) 3, super.aGraphics2);
				this.aClass35_15.method525(743, 205, (byte) 3, super.aGraphics2);
				this.aClass35_16.method525(0, 0, (byte) 3, super.aGraphics2);
				this.aClass35_17.method525(516, 4, (byte) 3, super.aGraphics2);
				this.aClass35_18.method525(516, 205, (byte) 3, super.aGraphics2);
				this.aClass35_19.method525(496, 357, (byte) 3, super.aGraphics2);
				this.aClass35_20.method525(0, 338, (byte) 3, super.aGraphics2);
				this.aBoolean85 = true;
				this.aBoolean80 = true;
				this.aBoolean62 = true;
				this.aBoolean78 = true;
				if (this.anInt404 != 2) {
					this.aClass35_26.method525(4, 4, (byte) 3, super.aGraphics2);
					this.aClass35_25.method525(550, 4, (byte) 3, super.aGraphics2);
				}
			}
			if (this.anInt404 == 2) {
				this.method212();
			}
			if (this.aBoolean81 && this.anInt236 == 1) {
				this.aBoolean85 = true;
			}
			@Pc(139) boolean local139;
			if (this.anInt279 != -1) {
				local139 = this.method213(this.anInt216, this.anInt279, this.anInt372);
				if (local139) {
					this.aBoolean85 = true;
				}
			}
			if (this.anInt348 == 2) {
				this.aBoolean85 = true;
			}
			if (this.anInt368 == 2) {
				this.aBoolean85 = true;
			}
			if (this.aBoolean85) {
				this.method221();
				this.aBoolean85 = false;
			}
			if (this.anInt278 == -1) {
				this.aClass6_1.anInt442 = this.anInt362 - this.anInt420 - 77;
				if (super.anInt205 > 448 && super.anInt205 < 560 && super.anInt206 > 332) {
					this.method169(this.aClass6_1, super.anInt206 - 357, 77, this.anInt362, 285, 0, 463, super.anInt205 - 17, false);
				}
				@Pc(221) int local221 = this.anInt362 - this.aClass6_1.anInt442 - 77;
				if (local221 < 0) {
					local221 = 0;
				}
				if (local221 > this.anInt362 - 77) {
					local221 = this.anInt362 - 77;
				}
				if (this.anInt420 != local221) {
					this.anInt420 = local221;
					this.aBoolean80 = true;
				}
			}
			if (this.anInt278 != -1) {
				local139 = this.method213(this.anInt216, this.anInt278, this.anInt372);
				if (local139) {
					this.aBoolean80 = true;
				}
			}
			if (this.anInt348 == 3) {
				this.aBoolean80 = true;
			}
			if (this.anInt368 == 3) {
				this.aBoolean80 = true;
			}
			if (this.aString9 != null) {
				this.aBoolean80 = true;
			}
			if (this.aBoolean81 && this.anInt236 == 2) {
				this.aBoolean80 = true;
			}
			if (this.aBoolean80) {
				this.method107();
				this.aBoolean80 = false;
			}
			if (this.anInt404 == 2) {
				this.method191(this.aByte4);
				this.aClass35_25.method525(550, 4, (byte) 3, super.aGraphics2);
			}
			if (this.anInt425 != -1) {
				this.aBoolean62 = true;
			}
			if (this.aBoolean62) {
				if (this.anInt425 != -1 && this.anInt425 == this.anInt321) {
					this.anInt425 = -1;
					this.aClass1_Sub1_Sub3_3.method469(53);
					this.aClass1_Sub1_Sub3_3.method470(this.anInt321);
				}
				this.aBoolean62 = false;
				this.aClass35_23.method524();
				this.aClass1_Sub1_Sub2_Sub3_6.method418(0, 0);
				if (this.anInt279 == -1) {
					if (this.anIntArray85[this.anInt321] != -1) {
						if (this.anInt321 == 0) {
							this.aClass1_Sub1_Sub2_Sub3_7.method418(22, 10);
						}
						if (this.anInt321 == 1) {
							this.aClass1_Sub1_Sub2_Sub3_8.method418(54, 8);
						}
						if (this.anInt321 == 2) {
							this.aClass1_Sub1_Sub2_Sub3_8.method418(82, 8);
						}
						if (this.anInt321 == 3) {
							this.aClass1_Sub1_Sub2_Sub3_9.method418(110, 8);
						}
						if (this.anInt321 == 4) {
							this.aClass1_Sub1_Sub2_Sub3_11.method418(153, 8);
						}
						if (this.anInt321 == 5) {
							this.aClass1_Sub1_Sub2_Sub3_11.method418(181, 8);
						}
						if (this.anInt321 == 6) {
							this.aClass1_Sub1_Sub2_Sub3_10.method418(209, 9);
						}
					}
					if (this.anIntArray85[0] != -1 && (this.anInt425 != 0 || anInt248 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[0].method418(29, 13);
					}
					if (this.anIntArray85[1] != -1 && (this.anInt425 != 1 || anInt248 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[1].method418(53, 11);
					}
					if (this.anIntArray85[2] != -1 && (this.anInt425 != 2 || anInt248 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[2].method418(82, 11);
					}
					if (this.anIntArray85[3] != -1 && (this.anInt425 != 3 || anInt248 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[3].method418(115, 12);
					}
					if (this.anIntArray85[4] != -1 && (this.anInt425 != 4 || anInt248 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[4].method418(153, 13);
					}
					if (this.anIntArray85[5] != -1 && (this.anInt425 != 5 || anInt248 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[5].method418(180, 11);
					}
					if (this.anIntArray85[6] != -1 && (this.anInt425 != 6 || anInt248 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[6].method418(208, 13);
					}
				}
				this.aClass35_23.method525(516, 160, (byte) 3, super.aGraphics2);
				this.aClass35_22.method524();
				this.aClass1_Sub1_Sub2_Sub3_5.method418(0, 0);
				if (this.anInt279 == -1) {
					if (this.anIntArray85[this.anInt321] != -1) {
						if (this.anInt321 == 7) {
							this.aClass1_Sub1_Sub2_Sub3_14.method418(42, 0);
						}
						if (this.anInt321 == 8) {
							this.aClass1_Sub1_Sub2_Sub3_15.method418(74, 0);
						}
						if (this.anInt321 == 9) {
							this.aClass1_Sub1_Sub2_Sub3_15.method418(102, 0);
						}
						if (this.anInt321 == 10) {
							this.aClass1_Sub1_Sub2_Sub3_16.method418(130, 1);
						}
						if (this.anInt321 == 11) {
							this.aClass1_Sub1_Sub2_Sub3_18.method418(173, 0);
						}
						if (this.anInt321 == 12) {
							this.aClass1_Sub1_Sub2_Sub3_18.method418(201, 0);
						}
						if (this.anInt321 == 13) {
							this.aClass1_Sub1_Sub2_Sub3_17.method418(229, 0);
						}
					}
					if (this.anIntArray85[8] != -1 && (this.anInt425 != 8 || anInt248 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[7].method418(74, 2);
					}
					if (this.anIntArray85[9] != -1 && (this.anInt425 != 9 || anInt248 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[8].method418(102, 3);
					}
					if (this.anIntArray85[10] != -1 && (this.anInt425 != 10 || anInt248 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[9].method418(137, 4);
					}
					if (this.anIntArray85[11] != -1 && (this.anInt425 != 11 || anInt248 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[10].method418(174, 2);
					}
					if (this.anIntArray85[12] != -1 && (this.anInt425 != 12 || anInt248 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[11].method418(201, 2);
					}
					if (this.anIntArray85[13] != -1 && (this.anInt425 != 13 || anInt248 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[12].method418(226, 2);
					}
				}
				this.aClass35_22.method525(496, 466, (byte) 3, super.aGraphics2);
				this.aClass35_26.method524();
			}
			if (this.aBoolean78) {
				this.aBoolean78 = false;
				this.aClass35_21.method524();
				this.aClass1_Sub1_Sub2_Sub3_4.method418(0, 0);
				this.aClass1_Sub1_Sub2_Sub4_2.method448(55, true, 28, 16777215, "Public chat");
				if (this.anInt273 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(55, true, 41, 65280, "On");
				}
				if (this.anInt273 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(55, true, 41, 16776960, "Friends");
				}
				if (this.anInt273 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(55, true, 41, 16711680, "Off");
				}
				if (this.anInt273 == 3) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(55, true, 41, 65535, "Hide");
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method448(184, true, 28, 16777215, "Private chat");
				if (this.anInt408 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(184, true, 41, 65280, "On");
				}
				if (this.anInt408 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(184, true, 41, 16776960, "Friends");
				}
				if (this.anInt408 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(184, true, 41, 16711680, "Off");
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method448(324, true, 28, 16777215, "Trade/compete");
				if (this.anInt324 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(324, true, 41, 65280, "On");
				}
				if (this.anInt324 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(324, true, 41, 16776960, "Friends");
				}
				if (this.anInt324 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(324, true, 41, 16711680, "Off");
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method448(458, true, 33, 16777215, "Report abuse");
				this.aClass35_21.method525(0, 453, (byte) 3, super.aGraphics2);
				this.aClass35_26.method524();
			}
			this.anInt216 = 0;
		} catch (@Pc(1052) RuntimeException local1052) {
			signlink.reporterror("82443, " + 14998 + ", " + local1052.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method93() {
		try {
			this.aBoolean69 = true;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("35264, " + true + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method191(@OriginalArg(0) byte arg0) {
		try {
			this.aClass35_25.method524();
			@Pc(18) int local18;
			@Pc(20) int local20;
			if (this.anInt402 == 2) {
				@Pc(13) byte[] local13 = this.aClass1_Sub1_Sub2_Sub3_2.aByteArray7;
				@Pc(15) int[] local15 = Class1_Sub1_Sub2.anIntArray213;
				local18 = local13.length;
				for (local20 = 0; local20 < local18; local20++) {
					if (local13[local20] == 0) {
						local15[local20] = 0;
					}
				}
				this.aClass1_Sub1_Sub2_Sub2_7.method395(this.anIntArray78, this.anIntArray71, this.anInt250, 0, 256, 33, 0, 25, 25, 33);
				this.aClass35_26.method524();
			} else {
				@Pc(64) int local64 = this.anInt250 + this.anInt260 & 0x7FF;
				@Pc(71) int local71 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1005 / 32 + 48;
				local18 = 464 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1006 / 32;
				this.aClass1_Sub1_Sub2_Sub2_8.method395(this.anIntArray34, this.anIntArray75, local64, 5, this.anInt267 + 256, 146, 25, local71, local18, 151);
				if (arg0 == 4) {
					@Pc(102) boolean local102 = false;
				} else {
					this.anInt393 = this.aClass46_1.method662();
				}
				this.aClass1_Sub1_Sub2_Sub2_7.method395(this.anIntArray78, this.anIntArray71, this.anInt250, 0, 256, 33, 0, 25, 25, 33);
				for (local20 = 0; local20 < this.anInt390; local20++) {
					local71 = this.anIntArray76[local20] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1005 / 32;
					local18 = this.anIntArray77[local20] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1006 / 32;
					this.method211(this.aBoolean92, local18, this.aClass1_Sub1_Sub2_Sub2Array3[local20], local71);
				}
				@Pc(179) int local179;
				for (@Pc(175) int local175 = 0; local175 < 104; local175++) {
					for (local179 = 0; local179 < 104; local179++) {
						@Pc(191) Class29 local191 = this.aClass29ArrayArrayArray1[this.anInt325][local175][local179];
						if (local191 != null) {
							local71 = local175 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1005 / 32;
							local18 = local179 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1006 / 32;
							this.method211(this.aBoolean92, local18, this.aClass1_Sub1_Sub2_Sub2_9, local71);
						}
					}
				}
				for (local179 = 0; local179 < this.anInt283; local179++) {
					@Pc(243) Class1_Sub1_Sub1_Sub1_Sub2 local243 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray48[local179]];
					if (local243 != null && local243.method680()) {
						@Pc(252) Class13 local252 = local243.aClass13_2;
						if (local252.anIntArray174 != null) {
							local252 = local252.method327();
						}
						if (local252 != null && local252.aBoolean147) {
							local71 = local243.anInt1005 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1005 / 32;
							local18 = local243.anInt1006 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1006 / 32;
							this.method211(this.aBoolean92, local18, this.aClass1_Sub1_Sub2_Sub2_10, local71);
						}
					}
				}
				@Pc(309) Class1_Sub1_Sub1_Sub1_Sub1 local309;
				for (@Pc(299) int local299 = 0; local299 < this.anInt352; local299++) {
					local309 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray66[local299]];
					if (local309 != null && local309.method680()) {
						local71 = local309.anInt1005 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1005 / 32;
						local18 = local309.anInt1006 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1006 / 32;
						@Pc(337) boolean local337 = false;
						@Pc(341) long local341 = Class48.method667(local309.aString3);
						for (@Pc(343) int local343 = 0; local343 < this.anInt231; local343++) {
							if (local341 == this.aLongArray4[local343] && this.anIntArray70[local343] != 0) {
								local337 = true;
								break;
							}
						}
						if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt148 != 0 && local309.anInt148 != 0) {
							if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt148 == local309.anInt148) {
								local337 = true;
							} else {
								local337 = false;
							}
						}
						if (local337) {
							this.method211(this.aBoolean92, local18, this.aClass1_Sub1_Sub2_Sub2_12, local71);
						} else {
							this.method211(this.aBoolean92, local18, this.aClass1_Sub1_Sub2_Sub2_11, local71);
						}
					}
				}
				if (this.anInt323 != 0 && anInt248 % 20 < 10) {
					if (this.anInt323 == 1 && this.anInt413 >= 0 && this.anInt413 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length) {
						@Pc(435) Class1_Sub1_Sub1_Sub1_Sub2 local435 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anInt413];
						if (local435 != null) {
							local71 = local435.anInt1005 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1005 / 32;
							local18 = local435.anInt1006 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1006 / 32;
							this.method118(this.aClass1_Sub1_Sub2_Sub2_4, local18, local71);
						}
					}
					if (this.anInt323 == 2) {
						local71 = (this.anInt302 - this.anInt357) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1005 / 32;
						local18 = (this.anInt303 - this.anInt358) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1006 / 32;
						this.method118(this.aClass1_Sub1_Sub2_Sub2_4, local18, local71);
					}
					if (this.anInt323 == 10 && this.anInt253 >= 0 && this.anInt253 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length) {
						local309 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anInt253];
						if (local309 != null) {
							local71 = local309.anInt1005 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1005 / 32;
							local18 = local309.anInt1006 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1006 / 32;
							this.method118(this.aClass1_Sub1_Sub2_Sub2_4, local18, local71);
						}
					}
				}
				if (this.anInt391 != 0) {
					local71 = this.anInt391 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1005 / 32;
					local18 = this.anInt392 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1006 / 32;
					this.method211(this.aBoolean92, local18, this.aClass1_Sub1_Sub2_Sub2_3, local71);
				}
				Class1_Sub1_Sub2.method439(97, 3, 16777215, 3, 78);
				this.aClass35_26.method524();
			}
		} catch (@Pc(601) RuntimeException local601) {
			signlink.reporterror("16512, " + arg0 + ", " + local601.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method192() {
		try {
			for (@Pc(3) int local3 = -1; local3 < this.anInt352; local3++) {
				@Pc(11) int local11;
				if (local3 == -1) {
					local11 = this.anInt351;
				} else {
					local11 = this.anIntArray66[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub1 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local11];
				if (local23 != null) {
					this.method184(1, local23);
				}
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("3184, " + 123 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)Z")
	private boolean method193(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(8) int local8 = this.anIntArray37[arg0];
			if (local8 >= 2000) {
				local8 -= 2000;
			}
			return local8 == 605;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("22692, " + -172 + ", " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!nb;)V")
	private void method194(@OriginalArg(1) Class1_Sub2 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt793 == 0) {
				local1 = this.aClass37_1.method556(arg0.anInt792, arg0.anInt794, arg0.anInt795);
			}
			if (arg0.anInt793 == 1) {
				local1 = this.aClass37_1.method557(arg0.anInt794, arg0.anInt795, arg0.anInt792);
			}
			if (arg0.anInt793 == 2) {
				local1 = this.aClass37_1.method558(arg0.anInt792, arg0.anInt794, arg0.anInt795);
			}
			if (arg0.anInt793 == 3) {
				local1 = this.aClass37_1.method559(arg0.anInt792, arg0.anInt794, arg0.anInt795);
			}
			if (local1 != 0) {
				@Pc(76) int local76 = this.aClass37_1.method560(arg0.anInt792, arg0.anInt794, arg0.anInt795, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local76 & 0x1F;
				local7 = local76 >> 6;
			}
			arg0.anInt796 = local3;
			arg0.anInt798 = local5;
			arg0.anInt797 = local7;
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("26516, " + 6 + ", " + arg0 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!lb;Z)V")
	private void method195(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			arg1.method490();
			this.aBoolean59 &= true;
			@Pc(13) int local13 = arg1.method491(1);
			if (local13 != 0) {
				@Pc(21) int local21 = arg1.method491(2);
				if (local21 == 0) {
					this.anIntArray67[this.anInt353++] = this.anInt351;
				} else {
					@Pc(44) int local44;
					@Pc(54) int local54;
					if (local21 == 1) {
						local44 = arg1.method491(3);
						aClass1_Sub1_Sub1_Sub1_Sub1_1.method678(local44, false);
						local54 = arg1.method491(1);
						if (local54 == 1) {
							this.anIntArray67[this.anInt353++] = this.anInt351;
						}
					} else {
						@Pc(98) int local98;
						if (local21 == 2) {
							local44 = arg1.method491(3);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method678(local44, true);
							local54 = arg1.method491(3);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method678(local54, true);
							local98 = arg1.method491(1);
							if (local98 == 1) {
								this.anIntArray67[this.anInt353++] = this.anInt351;
							}
						} else if (local21 == 3) {
							this.anInt325 = arg1.method491(2);
							local44 = arg1.method491(7);
							local54 = arg1.method491(7);
							local98 = arg1.method491(1);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method677(local98 == 1, local44, local54, aBoolean74);
							@Pc(154) int local154 = arg1.method491(1);
							if (local154 == 1) {
								this.anIntArray67[this.anInt353++] = this.anInt351;
							}
						}
					}
				}
			}
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("14503, " + arg0 + ", " + arg1 + ", " + true + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
	private void method197() {
		try {
			Class9.aClass40_4.method593();
			Class9.aClass40_5.method593();
			Class13.aClass40_6.method593();
			Class15.aClass40_7.method593();
			Class15.aClass40_8.method593();
			Class1_Sub1_Sub1_Sub1_Sub1.aClass40_1.method593();
			Class33.aClass40_9.method593();
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("63986, " + -492 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!d;IIII)V")
	private void method198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg2.anInt433 == 0 && arg2.anIntArray98 != null && !arg2.aBoolean97 && (arg5 >= arg0 && arg3 >= arg1 && arg5 <= arg0 + arg2.anInt436 && arg3 <= arg1 + arg2.anInt437)) {
				@Pc(34) int local34 = arg2.anIntArray98.length;
				this.anInt382 += 0;
				for (@Pc(42) int local42 = 0; local42 < local34; local42++) {
					@Pc(51) int local51 = arg2.anIntArray99[local42] + arg0;
					@Pc(60) int local60 = arg2.anIntArray100[local42] + arg1 - arg4;
					@Pc(67) Class6 local67 = Class6.aClass6Array1[arg2.anIntArray98[local42]];
					@Pc(72) int local72 = local51 + local67.anInt438;
					@Pc(77) int local77 = local60 + local67.anInt439;
					if ((local67.anInt440 >= 0 || local67.anInt448 != 0) && arg5 >= local72 && arg3 >= local77 && arg5 < local72 + local67.anInt436 && arg3 < local77 + local67.anInt437) {
						if (local67.anInt440 >= 0) {
							this.anInt341 = local67.anInt440;
						} else {
							this.anInt341 = local67.anInt431;
						}
					}
					if (local67.anInt433 == 0) {
						this.method198(local72, local77, local67, arg3, local67.anInt442, arg5);
						if (local67.anInt441 > local67.anInt437) {
							this.method169(local67, arg3, local67.anInt437, local67.anInt441, 285, local77, local72 + local67.anInt436, arg5, true);
						}
					} else {
						if (local67.anInt434 == 1 && arg5 >= local72 && arg3 >= local77 && arg5 < local72 + local67.anInt436 && arg3 < local77 + local67.anInt437) {
							@Pc(174) boolean local174 = false;
							if (local67.anInt435 != 0) {
								local174 = this.method171(local67);
							}
							if (!local174) {
								this.aStringArray3[this.anInt290] = local67.aString22;
								this.anIntArray37[this.anInt290] = 231;
								this.anIntArray36[this.anInt290] = local67.anInt431;
								this.anInt290++;
							}
						}
						if (local67.anInt434 == 2 && this.anInt269 == 0 && arg5 >= local72 && arg3 >= local77 && arg5 < local72 + local67.anInt436 && arg3 < local77 + local67.anInt437) {
							@Pc(238) String local238 = local67.aString20;
							if (local238.indexOf(" ") != -1) {
								local238 = local238.substring(0, local238.indexOf(" "));
							}
							this.aStringArray3[this.anInt290] = local238 + " @gre@" + local67.aString21;
							this.anIntArray37[this.anInt290] = 274;
							this.anIntArray36[this.anInt290] = local67.anInt431;
							this.anInt290++;
						}
						if (local67.anInt434 == 3 && arg5 >= local72 && arg3 >= local77 && arg5 < local72 + local67.anInt436 && arg3 < local77 + local67.anInt437) {
							this.aStringArray3[this.anInt290] = "Close";
							this.anIntArray37[this.anInt290] = 737;
							this.anIntArray36[this.anInt290] = local67.anInt431;
							this.anInt290++;
						}
						if (local67.anInt434 == 4 && arg5 >= local72 && arg3 >= local77 && arg5 < local72 + local67.anInt436 && arg3 < local77 + local67.anInt437) {
							this.aStringArray3[this.anInt290] = local67.aString22;
							this.anIntArray37[this.anInt290] = 435;
							this.anIntArray36[this.anInt290] = local67.anInt431;
							this.anInt290++;
						}
						if (local67.anInt434 == 5 && arg5 >= local72 && arg3 >= local77 && arg5 < local72 + local67.anInt436 && arg3 < local77 + local67.anInt437) {
							this.aStringArray3[this.anInt290] = local67.aString22;
							this.anIntArray37[this.anInt290] = 225;
							this.anIntArray36[this.anInt290] = local67.anInt431;
							this.anInt290++;
						}
						if (local67.anInt434 == 6 && !this.aBoolean63 && arg5 >= local72 && arg3 >= local77 && arg5 < local72 + local67.anInt436 && arg3 < local77 + local67.anInt437) {
							this.aStringArray3[this.anInt290] = local67.aString22;
							this.anIntArray37[this.anInt290] = 997;
							this.anIntArray36[this.anInt290] = local67.anInt431;
							this.anInt290++;
						}
						if (local67.anInt433 == 2) {
							@Pc(486) int local486 = 0;
							for (@Pc(488) int local488 = 0; local488 < local67.anInt437; local488++) {
								for (@Pc(492) int local492 = 0; local492 < local67.anInt436; local492++) {
									@Pc(503) int local503 = local72 + local492 * (local67.anInt444 + 32);
									@Pc(512) int local512 = local77 + local488 * (local67.anInt445 + 32);
									if (local486 < 20) {
										local503 += local67.anIntArray101[local486];
										local512 += local67.anIntArray102[local486];
									}
									if (arg5 >= local503 && arg3 >= local512 && arg5 < local503 + 32 && arg3 < local512 + 32) {
										this.anInt363 = local486;
										this.anInt364 = local67.anInt431;
										if (local67.anIntArray94[local486] > 0) {
											@Pc(565) Class15 local565 = Class15.method361(local67.anIntArray94[local486] - 1);
											if (this.anInt409 == 1 && local67.aBoolean100) {
												if (local67.anInt431 != this.anInt411 || local486 != this.anInt410) {
													this.aStringArray3[this.anInt290] = "Use " + this.aString16 + " with @lre@" + local565.aString25;
													this.anIntArray37[this.anInt290] = 398;
													this.anIntArray38[this.anInt290] = local565.anInt617;
													this.anIntArray35[this.anInt290] = local486;
													this.anIntArray36[this.anInt290] = local67.anInt431;
													this.anInt290++;
												}
											} else if (this.anInt269 != 1 || !local67.aBoolean100) {
												@Pc(702) int local702;
												if (local67.aBoolean100) {
													for (local702 = 4; local702 >= 3; local702--) {
														if (local565.aStringArray11 != null && local565.aStringArray11[local702] != null) {
															this.aStringArray3[this.anInt290] = local565.aStringArray11[local702] + " @lre@" + local565.aString25;
															if (local702 == 3) {
																this.anIntArray37[this.anInt290] = 681;
															}
															if (local702 == 4) {
																this.anIntArray37[this.anInt290] = 100;
															}
															this.anIntArray38[this.anInt290] = local565.anInt617;
															this.anIntArray35[this.anInt290] = local486;
															this.anIntArray36[this.anInt290] = local67.anInt431;
															this.anInt290++;
														} else if (local702 == 4) {
															this.aStringArray3[this.anInt290] = "Drop @lre@" + local565.aString25;
															this.anIntArray37[this.anInt290] = 100;
															this.anIntArray38[this.anInt290] = local565.anInt617;
															this.anIntArray35[this.anInt290] = local486;
															this.anIntArray36[this.anInt290] = local67.anInt431;
															this.anInt290++;
														}
													}
												}
												if (local67.aBoolean101) {
													this.aStringArray3[this.anInt290] = "Use @lre@" + local565.aString25;
													this.anIntArray37[this.anInt290] = 102;
													this.anIntArray38[this.anInt290] = local565.anInt617;
													this.anIntArray35[this.anInt290] = local486;
													this.anIntArray36[this.anInt290] = local67.anInt431;
													this.anInt290++;
												}
												if (local67.aBoolean100 && local565.aStringArray11 != null) {
													for (local702 = 2; local702 >= 0; local702--) {
														if (local565.aStringArray11[local702] != null) {
															this.aStringArray3[this.anInt290] = local565.aStringArray11[local702] + " @lre@" + local565.aString25;
															if (local702 == 0) {
																this.anIntArray37[this.anInt290] = 694;
															}
															if (local702 == 1) {
																this.anIntArray37[this.anInt290] = 962;
															}
															if (local702 == 2) {
																this.anIntArray37[this.anInt290] = 795;
															}
															this.anIntArray38[this.anInt290] = local565.anInt617;
															this.anIntArray35[this.anInt290] = local486;
															this.anIntArray36[this.anInt290] = local67.anInt431;
															this.anInt290++;
														}
													}
												}
												if (local67.aStringArray7 != null) {
													for (local702 = 4; local702 >= 0; local702--) {
														if (local67.aStringArray7[local702] != null) {
															this.aStringArray3[this.anInt290] = local67.aStringArray7[local702] + " @lre@" + local565.aString25;
															if (local702 == 0) {
																this.anIntArray37[this.anInt290] = 582;
															}
															if (local702 == 1) {
																this.anIntArray37[this.anInt290] = 113;
															}
															if (local702 == 2) {
																this.anIntArray37[this.anInt290] = 555;
															}
															if (local702 == 3) {
																this.anIntArray37[this.anInt290] = 331;
															}
															if (local702 == 4) {
																this.anIntArray37[this.anInt290] = 354;
															}
															this.anIntArray38[this.anInt290] = local565.anInt617;
															this.anIntArray35[this.anInt290] = local486;
															this.anIntArray36[this.anInt290] = local67.anInt431;
															this.anInt290++;
														}
													}
												}
												this.aStringArray3[this.anInt290] = "Examine @lre@" + local565.aString25;
												this.anIntArray37[this.anInt290] = 1328;
												this.anIntArray38[this.anInt290] = local565.anInt617;
												this.anIntArray35[this.anInt290] = local486;
												this.anIntArray36[this.anInt290] = local67.anInt431;
												this.anInt290++;
											} else if ((this.anInt271 & 0x10) == 16) {
												this.aStringArray3[this.anInt290] = this.aString5 + " @lre@" + local565.aString25;
												this.anIntArray37[this.anInt290] = 563;
												this.anIntArray38[this.anInt290] = local565.anInt617;
												this.anIntArray35[this.anInt290] = local486;
												this.anIntArray36[this.anInt290] = local67.anInt431;
												this.anInt290++;
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
			signlink.reporterror("51606, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + arg5 + ", " + local1132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean91) {
			this.method228(aByte3);
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method199() {
		try {
			try {
				@Pc(17) int local17 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1005 + this.anInt226;
				@Pc(23) int local23 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1006 + this.anInt380;
				if (this.anInt313 - local17 < -500 || this.anInt313 - local17 > 500 || this.anInt314 - local23 < -500 || this.anInt314 - local23 > 500) {
					this.anInt313 = local17;
					this.anInt314 = local23;
				}
				if (this.anInt313 != local17) {
					this.anInt313 += (local17 - this.anInt313) / 16;
				}
				if (this.anInt314 != local23) {
					this.anInt314 += (local23 - this.anInt314) / 16;
				}
				if (super.anIntArray30[1] == 1) {
					this.anInt251 += (-this.anInt251 - 24) / 2;
				} else if (super.anIntArray30[2] == 1) {
					this.anInt251 += (24 - this.anInt251) / 2;
				} else {
					this.anInt251 /= 2;
				}
				if (super.anIntArray30[3] == 1) {
					this.anInt252 += (12 - this.anInt252) / 2;
				} else if (super.anIntArray30[4] == 1) {
					this.anInt252 += (-this.anInt252 - 12) / 2;
				} else {
					this.anInt252 /= 2;
				}
				this.anInt250 = this.anInt250 + this.anInt251 / 2 & 0x7FF;
				this.anInt249 += this.anInt252 / 2;
				if (this.anInt249 < 128) {
					this.anInt249 = 128;
				}
				if (this.anInt249 > 383) {
					this.anInt249 = 383;
				}
				@Pc(210) int local210 = this.anInt313 >> 7;
				@Pc(215) int local215 = this.anInt314 >> 7;
				@Pc(225) int local225 = this.method218(this.anInt313, this.anInt314, this.anInt325);
				@Pc(227) int local227 = 0;
				@Pc(243) int local243;
				if (local210 > 3 && local215 > 3 && local210 < 100 && local215 < 100) {
					for (local243 = local210 - 4; local243 <= local210 + 4; local243++) {
						for (@Pc(249) int local249 = local215 - 4; local249 <= local215 + 4; local249++) {
							@Pc(254) int local254 = this.anInt325;
							if (local254 < 3 && (this.aByteArrayArrayArray7[1][local243][local249] & 0x2) == 2) {
								local254++;
							}
							@Pc(281) int local281 = local225 - this.anIntArrayArrayArray5[local254][local243][local249];
							if (local281 > local227) {
								local227 = local281;
							}
						}
					}
				}
				local243 = local227 * 192;
				if (local243 > 98048) {
					local243 = 98048;
				}
				if (local243 < 32768) {
					local243 = 32768;
				}
				if (local243 > this.anInt282) {
					this.anInt282 += (local243 - this.anInt282) / 24;
				} else if (local243 < this.anInt282) {
					this.anInt282 += (local243 - this.anInt282) / 80;
				}
			} catch (@Pc(345) Exception local345) {
				signlink.reporterror("glfc_ex " + aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1005 + "," + aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1006 + "," + this.anInt313 + "," + this.anInt314 + "," + this.anInt244 + "," + this.anInt245 + "," + this.anInt357 + "," + this.anInt358);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(395) RuntimeException local395) {
			signlink.reporterror("83898, " + 35 + ", " + local395.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method200(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean65) {
			if (this.aSocket1 != null) {
				try {
					this.aSocket1.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket1 = null;
			}
			this.aSocket1 = this.method163(43595);
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

	@OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
	private void method201() {
		try {
			if (this.anInt406 > 1) {
				this.anInt406--;
			}
			if (this.anInt386 > 0) {
				this.anInt386--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method112(); local22++) {
			}
			if (this.aBoolean59) {
				@Pc(41) Object local41 = this.aClass11_1.anObject1;
				@Pc(66) int local66;
				@Pc(68) int local68;
				@Pc(70) int local70;
				@Pc(103) int local103;
				synchronized (this.aClass11_1.anObject1) {
					if (!aBoolean71) {
						this.aClass11_1.anInt548 = 0;
					} else if (super.anInt210 != 0 || this.aClass11_1.anInt548 >= 40) {
						this.aClass1_Sub1_Sub3_3.method469(1);
						this.aClass1_Sub1_Sub3_3.method470(0);
						local66 = this.aClass1_Sub1_Sub3_3.anInt751;
						local68 = 0;
						@Pc(86) int local86;
						for (local70 = 0; local70 < this.aClass11_1.anInt548 && local66 - this.aClass1_Sub1_Sub3_3.anInt751 < 240; local70++) {
							local68++;
							local86 = this.aClass11_1.anIntArray163[local70];
							if (local86 < 0) {
								local86 = 0;
							} else if (local86 > 502) {
								local86 = 502;
							}
							local103 = this.aClass11_1.anIntArray162[local70];
							if (local103 < 0) {
								local103 = 0;
							} else if (local103 > 764) {
								local103 = 764;
							}
							@Pc(120) int local120 = local86 * 765 + local103;
							if (this.aClass11_1.anIntArray163[local70] == -1 && this.aClass11_1.anIntArray162[local70] == -1) {
								local103 = -1;
								local86 = -1;
								local120 = 524287;
							}
							if (local103 != this.anInt399 || local86 != this.anInt400) {
								@Pc(165) int local165 = local103 - this.anInt399;
								this.anInt399 = local103;
								@Pc(173) int local173 = local86 - this.anInt400;
								this.anInt400 = local86;
								if (this.anInt243 < 8 && local165 >= -32 && local165 <= 31 && local173 >= -32 && local173 <= 31) {
									local165 += 32;
									local173 += 32;
									this.aClass1_Sub1_Sub3_3.method471((this.anInt243 << 12) + (local165 << 6) + local173);
									this.anInt243 = 0;
								} else if (this.anInt243 < 8) {
									this.aClass1_Sub1_Sub3_3.method473((this.anInt243 << 19) + local120 + 8388608);
									this.anInt243 = 0;
								} else {
									this.aClass1_Sub1_Sub3_3.method474((this.anInt243 << 19) + local120 - 1073741824);
									this.anInt243 = 0;
								}
							} else if (this.anInt243 < 2047) {
								this.anInt243++;
							}
						}
						this.aClass1_Sub1_Sub3_3.method479(this.aClass1_Sub1_Sub3_3.anInt751 - local66);
						if (local68 >= this.aClass11_1.anInt548) {
							this.aClass11_1.anInt548 = 0;
						} else {
							this.aClass11_1.anInt548 -= local68;
							for (local86 = 0; local86 < this.aClass11_1.anInt548; local86++) {
								this.aClass11_1.anIntArray162[local86] = this.aClass11_1.anIntArray162[local86 + local68];
								this.aClass11_1.anIntArray163[local86] = this.aClass11_1.anIntArray163[local86 + local68];
							}
						}
					}
				}
				if (super.anInt210 != 0) {
					@Pc(336) long local336 = (super.aLong13 - this.aLong14) / 50L;
					if (local336 > 4095L) {
						local336 = 4095L;
					}
					this.aLong14 = super.aLong13;
					local66 = super.anInt212;
					if (local66 < 0) {
						local66 = 0;
					} else if (local66 > 502) {
						local66 = 502;
					}
					local68 = super.anInt211;
					if (local68 < 0) {
						local68 = 0;
					} else if (local68 > 764) {
						local68 = 764;
					}
					local70 = local66 * 765 + local68;
					@Pc(382) byte local382 = 0;
					if (super.anInt210 == 2) {
						local382 = 1;
					}
					local103 = (int) local336;
					this.aClass1_Sub1_Sub3_3.method469(131);
					this.aClass1_Sub1_Sub3_3.method474((local103 << 20) + (local382 << 19) + local70);
				}
				if (this.anInt315 > 0) {
					this.anInt315--;
				}
				if (super.anIntArray30[1] == 1 || super.anIntArray30[2] == 1 || super.anIntArray30[3] == 1 || super.anIntArray30[4] == 1) {
					this.aBoolean68 = true;
				}
				if (this.aBoolean68 && this.anInt315 <= 0) {
					this.anInt315 = 20;
					this.aBoolean68 = false;
					this.aClass1_Sub1_Sub3_3.method469(65);
					this.aClass1_Sub1_Sub3_3.method471(this.anInt249);
					this.aClass1_Sub1_Sub3_3.method471(this.anInt250);
				}
				if (super.aBoolean50 && !this.aBoolean67) {
					this.aBoolean67 = true;
					this.aClass1_Sub1_Sub3_3.method469(60);
					this.aClass1_Sub1_Sub3_3.method470(1);
				}
				if (!super.aBoolean50 && this.aBoolean67) {
					this.aBoolean67 = false;
					this.aClass1_Sub1_Sub3_3.method469(60);
					this.aClass1_Sub1_Sub3_3.method470(0);
				}
				this.method160();
				this.method138();
				this.method124();
				this.anInt384++;
				if (this.anInt384 > 750) {
					this.method170();
				}
				this.method192();
				this.method183();
				this.method181();
				this.anInt216++;
				if (this.anInt330 != 0) {
					this.anInt329 += 20;
					if (this.anInt329 >= 400) {
						this.anInt330 = 0;
					}
				}
				if (this.anInt348 != 0) {
					this.anInt345++;
					if (this.anInt345 >= 15) {
						if (this.anInt348 == 2) {
							this.aBoolean85 = true;
						}
						if (this.anInt348 == 3) {
							this.aBoolean80 = true;
						}
						this.anInt348 = 0;
					}
				}
				if (this.anInt368 != 0) {
					this.anInt299++;
					if (super.anInt205 > this.anInt369 + 5 || super.anInt205 < this.anInt369 - 5 || super.anInt206 > this.anInt370 + 5 || super.anInt206 < this.anInt370 - 5) {
						this.aBoolean66 = true;
					}
					if (super.anInt204 == 0) {
						if (this.anInt368 == 2) {
							this.aBoolean85 = true;
						}
						if (this.anInt368 == 3) {
							this.aBoolean80 = true;
						}
						this.anInt368 = 0;
						if (this.aBoolean66 && this.anInt299 >= 5) {
							this.anInt364 = -1;
							this.method178();
							if (this.anInt364 == this.anInt366 && this.anInt363 != this.anInt367) {
								@Pc(682) Class6 local682 = Class6.aClass6Array1[this.anInt366];
								@Pc(684) byte local684 = 0;
								if (this.anInt309 == 1 && local682.anInt435 == 206) {
									local684 = 1;
								}
								if (local682.anIntArray94[this.anInt363] <= 0) {
									local684 = 0;
								}
								if (local682.aBoolean102) {
									local66 = this.anInt367;
									local68 = this.anInt363;
									local682.anIntArray94[local68] = local682.anIntArray94[local66];
									local682.anIntArray95[local68] = local682.anIntArray95[local66];
									local682.anIntArray94[local66] = -1;
									local682.anIntArray95[local66] = 0;
								} else if (local684 == 1) {
									local66 = this.anInt367;
									local68 = this.anInt363;
									while (local66 != local68) {
										if (local66 > local68) {
											local682.method232(local66 - 1, local66);
											local66--;
										} else if (local66 < local68) {
											local682.method232(local66 + 1, local66);
											local66++;
										}
									}
								} else {
									local682.method232(this.anInt363, this.anInt367);
								}
								this.aClass1_Sub1_Sub3_3.method469(28);
								this.aClass1_Sub1_Sub3_3.method471(this.anInt366);
								this.aClass1_Sub1_Sub3_3.method471(this.anInt367);
								this.aClass1_Sub1_Sub3_3.method471(this.anInt363);
								this.aClass1_Sub1_Sub3_3.method470(local684);
							}
						} else if ((this.anInt225 == 1 || this.method193(this.anInt290 - 1)) && this.anInt290 > 2) {
							this.method219();
						} else if (this.anInt290 > 0) {
							this.method125(this.anInt290 - 1);
						}
						this.anInt345 = 10;
						super.anInt210 = 0;
					}
				}
				anInt415++;
				if (anInt415 > 62) {
					anInt415 = 0;
					this.aClass1_Sub1_Sub3_3.method469(153);
				}
				@Pc(868) int local868;
				@Pc(870) int local870;
				if (Class37.anInt892 != -1) {
					local868 = Class37.anInt892;
					local870 = Class37.anInt893;
					@Pc(891) boolean local891 = this.method150(0, 0, 0, 0, true, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], local868, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, local870);
					Class37.anInt892 = -1;
					if (local891) {
						this.anInt327 = super.anInt211;
						this.anInt328 = super.anInt212;
						this.anInt330 = 1;
						this.anInt329 = 0;
					}
				}
				if (super.anInt210 == 1 && this.aString9 != null) {
					this.aString9 = null;
					this.aBoolean80 = true;
					super.anInt210 = 0;
				}
				this.method100(519);
				this.method165();
				this.method110();
				this.method99();
				if (super.anInt204 == 1 || super.anInt210 == 1) {
					this.anInt389++;
				}
				if (this.anInt404 == 2) {
					this.method199();
				}
				if (this.anInt404 == 2 && this.aBoolean76) {
					this.method132();
				}
				for (local868 = 0; local868 < 5; local868++) {
					@Pc(982) int local982 = this.anIntArray64[local868]++;
				}
				this.method149();
				super.anInt203++;
				if (super.anInt203 > 4500) {
					this.anInt386 = 250;
					super.anInt203 -= 500;
					this.aClass1_Sub1_Sub3_3.method469(36);
				}
				this.anInt416++;
				if (this.anInt416 > 500) {
					this.anInt416 = 0;
					local870 = (int) (Math.random() * 8.0D);
					if ((local870 & 0x1) == 1) {
						this.anInt226 += this.anInt227;
					}
					if ((local870 & 0x2) == 2) {
						this.anInt380 += this.anInt381;
					}
					if ((local870 & 0x4) == 4) {
						this.anInt421 += this.anInt422;
					}
				}
				if (this.anInt226 < -50) {
					this.anInt227 = 2;
				}
				if (this.anInt226 > 50) {
					this.anInt227 = -2;
				}
				if (this.anInt380 < -55) {
					this.anInt381 = 2;
				}
				if (this.anInt380 > 55) {
					this.anInt381 = -2;
				}
				if (this.anInt421 < -40) {
					this.anInt422 = 1;
				}
				if (this.anInt421 > 40) {
					this.anInt422 = -1;
				}
				this.anInt332++;
				if (this.anInt332 > 500) {
					this.anInt332 = 0;
					local870 = (int) (Math.random() * 8.0D);
					if ((local870 & 0x1) == 1) {
						this.anInt260 += this.anInt261;
					}
					if ((local870 & 0x2) == 2) {
						this.anInt267 += this.anInt268;
					}
				}
				if (this.anInt260 < -60) {
					this.anInt261 = 2;
				}
				if (this.anInt260 > 60) {
					this.anInt261 = -2;
				}
				if (this.anInt267 < -20) {
					this.anInt268 = 1;
				}
				if (this.anInt267 > 10) {
					this.anInt268 = -1;
				}
				this.anInt385++;
				if (this.anInt385 > 50) {
					this.aClass1_Sub1_Sub3_3.method469(146);
				}
				try {
					if (this.aClass8_1 != null && this.aClass1_Sub1_Sub3_3.anInt751 > 0) {
						this.aClass8_1.method251(813, this.aClass1_Sub1_Sub3_3.anInt751, this.aClass1_Sub1_Sub3_3.aByteArray9);
						this.aClass1_Sub1_Sub3_3.anInt751 = 0;
						this.anInt385 = 0;
					}
				} catch (@Pc(1224) IOException local1224) {
					this.method170();
				} catch (@Pc(1229) Exception local1229) {
					this.method113(543);
				}
			}
		} catch (@Pc(1234) RuntimeException local1234) {
			signlink.reporterror("89843, " + -347 + ", " + local1234.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIZII)V")
	private void method202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(15) int local15 = this.aClass37_1.method556(arg2, arg3, arg1);
			@Pc(25) int local25;
			@Pc(31) int local31;
			@Pc(35) int local35;
			@Pc(37) int local37;
			@Pc(59) int local59;
			@Pc(65) int local65;
			if (local15 != 0) {
				local25 = this.aClass37_1.method560(arg2, arg3, arg1, local15);
				local31 = local25 >> 6 & 0x3;
				local35 = local25 & 0x1F;
				local37 = arg4;
				if (local15 > 0) {
					local37 = arg0;
				}
				@Pc(45) int[] local45 = this.aClass1_Sub1_Sub2_Sub2_8.anIntArray208;
				local59 = arg3 * 4 + (103 - arg1) * 512 * 4 + 24624;
				local65 = local15 >> 14 & 0x7FFF;
				@Pc(68) Class9 local68 = Class9.method288(local65);
				if (local68.anInt522 == -1) {
					if (local35 == 0 || local35 == 2) {
						if (local31 == 0) {
							local45[local59] = local37;
							local45[local59 + 512] = local37;
							local45[local59 + 1024] = local37;
							local45[local59 + 1536] = local37;
						} else if (local31 == 1) {
							local45[local59] = local37;
							local45[local59 + 1] = local37;
							local45[local59 + 2] = local37;
							local45[local59 + 3] = local37;
						} else if (local31 == 2) {
							local45[local59 + 3] = local37;
							local45[local59 + 3 + 512] = local37;
							local45[local59 + 3 + 1024] = local37;
							local45[local59 + 3 + 1536] = local37;
						} else if (local31 == 3) {
							local45[local59 + 1536] = local37;
							local45[local59 + 1536 + 1] = local37;
							local45[local59 + 1536 + 2] = local37;
							local45[local59 + 1536 + 3] = local37;
						}
					}
					if (local35 == 3) {
						if (local31 == 0) {
							local45[local59] = local37;
						} else if (local31 == 1) {
							local45[local59 + 3] = local37;
						} else if (local31 == 2) {
							local45[local59 + 3 + 1536] = local37;
						} else if (local31 == 3) {
							local45[local59 + 1536] = local37;
						}
					}
					if (local35 == 2) {
						if (local31 == 3) {
							local45[local59] = local37;
							local45[local59 + 512] = local37;
							local45[local59 + 1024] = local37;
							local45[local59 + 1536] = local37;
						} else if (local31 == 0) {
							local45[local59] = local37;
							local45[local59 + 1] = local37;
							local45[local59 + 2] = local37;
							local45[local59 + 3] = local37;
						} else if (local31 == 1) {
							local45[local59 + 3] = local37;
							local45[local59 + 3 + 512] = local37;
							local45[local59 + 3 + 1024] = local37;
							local45[local59 + 3 + 1536] = local37;
						} else if (local31 == 2) {
							local45[local59 + 1536] = local37;
							local45[local59 + 1536 + 1] = local37;
							local45[local59 + 1536 + 2] = local37;
							local45[local59 + 1536 + 3] = local37;
						}
					}
				} else {
					@Pc(78) Class1_Sub1_Sub2_Sub3 local78 = this.aClass1_Sub1_Sub2_Sub3Array3[local68.anInt522];
					if (local78 != null) {
						@Pc(90) int local90 = (local68.anInt517 * 4 - local78.anInt688) / 2;
						@Pc(100) int local100 = (local68.anInt518 * 4 - local78.anInt689) / 2;
						local78.method418(arg3 * 4 + local90 + 48, (104 - arg1 - local68.anInt518) * 4 + 48 + local100);
					}
				}
			}
			local15 = this.aClass37_1.method558(arg2, arg3, arg1);
			if (local15 != 0) {
				local25 = this.aClass37_1.method560(arg2, arg3, arg1, local15);
				local31 = local25 >> 6 & 0x3;
				local35 = local25 & 0x1F;
				local37 = local15 >> 14 & 0x7FFF;
				@Pc(454) Class9 local454 = Class9.method288(local37);
				@Pc(486) int local486;
				if (local454.anInt522 != -1) {
					@Pc(464) Class1_Sub1_Sub2_Sub3 local464 = this.aClass1_Sub1_Sub2_Sub3Array3[local454.anInt522];
					if (local464 != null) {
						local65 = (local454.anInt517 * 4 - local464.anInt688) / 2;
						local486 = (local454.anInt518 * 4 - local464.anInt689) / 2;
						local464.method418(arg3 * 4 + local65 + 48, (104 - arg1 - local454.anInt518) * 4 + 48 + local486);
					}
				} else if (local35 == 9) {
					local59 = 15658734;
					if (local15 > 0) {
						local59 = 15597568;
					}
					@Pc(523) int[] local523 = this.aClass1_Sub1_Sub2_Sub2_8.anIntArray208;
					local486 = arg3 * 4 + (103 - arg1) * 512 * 4 + 24624;
					if (local31 == 0 || local31 == 2) {
						local523[local486 + 1536] = local59;
						local523[local486 + 1024 + 1] = local59;
						local523[local486 + 512 + 2] = local59;
						local523[local486 + 3] = local59;
					} else {
						local523[local486] = local59;
						local523[local486 + 512 + 1] = local59;
						local523[local486 + 1024 + 2] = local59;
						local523[local486 + 1536 + 3] = local59;
					}
				}
			}
			local15 = this.aClass37_1.method559(arg2, arg3, arg1);
			if (local15 != 0) {
				local25 = local15 >> 14 & 0x7FFF;
				@Pc(618) Class9 local618 = Class9.method288(local25);
				if (local618.anInt522 != -1) {
					@Pc(628) Class1_Sub1_Sub2_Sub3 local628 = this.aClass1_Sub1_Sub2_Sub3Array3[local618.anInt522];
					if (local628 != null) {
						local37 = (local618.anInt517 * 4 - local628.anInt688) / 2;
						@Pc(650) int local650 = (local618.anInt518 * 4 - local628.anInt689) / 2;
						local628.method418(arg3 * 4 + local37 + 48, (104 - arg1 - local618.anInt518) * 4 + 48 + local650);
						return;
					}
				}
			}
		} catch (@Pc(674) RuntimeException local674) {
			signlink.reporterror("25182, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + local674.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!d;IB)V")
	private void method203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg2.anInt433 == 0 && arg2.anIntArray98 != null && (!arg2.aBoolean97 || this.anInt298 == arg2.anInt431 || this.anInt288 == arg2.anInt431 || this.anInt424 == arg2.anInt431)) {
				@Pc(29) int local29 = Class1_Sub1_Sub2.anInt711;
				@Pc(31) int local31 = Class1_Sub1_Sub2.anInt709;
				@Pc(33) int local33 = Class1_Sub1_Sub2.anInt712;
				@Pc(35) int local35 = Class1_Sub1_Sub2.anInt710;
				Class1_Sub1_Sub2.method436(arg3, arg0, arg0 + arg2.anInt436, arg3 + arg2.anInt437);
				@Pc(51) int local51 = arg2.anIntArray98.length;
				for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
					@Pc(62) int local62 = arg2.anIntArray99[local53] + arg0;
					@Pc(71) int local71 = arg2.anIntArray100[local53] + arg3 - arg1;
					@Pc(78) Class6 local78 = Class6.aClass6Array1[arg2.anIntArray98[local53]];
					@Pc(83) int local83 = local62 + local78.anInt438;
					@Pc(88) int local88 = local71 + local78.anInt439;
					if (local78.anInt435 > 0) {
						this.method166(512, local78);
					}
					if (local78.anInt433 == 0) {
						if (local78.anInt442 > local78.anInt441 - local78.anInt437) {
							local78.anInt442 = local78.anInt441 - local78.anInt437;
						}
						if (local78.anInt442 < 0) {
							local78.anInt442 = 0;
						}
						this.method203(local83, local78.anInt442, local78, local88);
						if (local78.anInt441 > local78.anInt437) {
							this.method122(local78.anInt437, local83 + local78.anInt436, local78.anInt441, local78.anInt442, local88);
						}
					} else if (local78.anInt433 != 1) {
						@Pc(160) int local160;
						@Pc(164) int local164;
						@Pc(175) int local175;
						@Pc(210) int local210;
						@Pc(217) int local217;
						@Pc(158) int local158;
						@Pc(208) int local208;
						if (local78.anInt433 == 2) {
							local158 = 0;
							for (local160 = 0; local160 < local78.anInt437; local160++) {
								for (local164 = 0; local164 < local78.anInt436; local164++) {
									local175 = local83 + local164 * (local78.anInt444 + 32);
									@Pc(184) int local184 = local88 + local160 * (local78.anInt445 + 32);
									if (local158 < 20) {
										local175 += local78.anIntArray101[local158];
										local184 += local78.anIntArray102[local158];
									}
									if (local78.anIntArray94[local158] > 0) {
										local208 = 0;
										local210 = 0;
										local217 = local78.anIntArray94[local158] - 1;
										if (local175 > Class1_Sub1_Sub2.anInt711 - 32 && local175 < Class1_Sub1_Sub2.anInt712 && local184 > Class1_Sub1_Sub2.anInt709 - 32 && local184 < Class1_Sub1_Sub2.anInt710 || this.anInt368 != 0 && this.anInt367 == local158) {
											@Pc(242) int local242 = 0;
											if (this.anInt409 == 1 && this.anInt410 == local158 && this.anInt411 == local78.anInt431) {
												local242 = 16777215;
											}
											@Pc(267) Class1_Sub1_Sub2_Sub2 local267 = Class15.method367(this.anInt284, local217, local242, local78.anIntArray95[local158]);
											if (local267 != null) {
												@Pc(346) int local346;
												if (this.anInt368 != 0 && this.anInt367 == local158 && this.anInt366 == local78.anInt431) {
													local208 = super.anInt205 - this.anInt369;
													local210 = super.anInt206 - this.anInt370;
													if (local208 < 5 && local208 > -5) {
														local208 = 0;
													}
													if (local210 < 5 && local210 > -5) {
														local210 = 0;
													}
													if (this.anInt299 < 5) {
														local208 = 0;
														local210 = 0;
													}
													local267.method393(local184 + local210, local175 + local208);
													if (local184 + local210 < Class1_Sub1_Sub2.anInt709 && arg2.anInt442 > 0) {
														local346 = this.anInt216 * (Class1_Sub1_Sub2.anInt709 - local184 - local210) / 3;
														if (local346 > this.anInt216 * 10) {
															local346 = this.anInt216 * 10;
														}
														if (local346 > arg2.anInt442) {
															local346 = arg2.anInt442;
														}
														arg2.anInt442 -= local346;
														this.anInt370 += local346;
													}
													if (local184 + local210 + 32 > Class1_Sub1_Sub2.anInt710 && arg2.anInt442 < arg2.anInt441 - arg2.anInt437) {
														local346 = this.anInt216 * (local184 + local210 + 32 - Class1_Sub1_Sub2.anInt710) / 3;
														if (local346 > this.anInt216 * 10) {
															local346 = this.anInt216 * 10;
														}
														if (local346 > arg2.anInt441 - arg2.anInt437 - arg2.anInt442) {
															local346 = arg2.anInt441 - arg2.anInt437 - arg2.anInt442;
														}
														arg2.anInt442 += local346;
														this.anInt370 -= local346;
													}
												} else if (this.anInt348 != 0 && this.anInt347 == local158 && this.anInt346 == local78.anInt431) {
													local267.method393(local184, local175);
												} else {
													local267.method391(local175, local184);
												}
												if (local267.anInt668 == 33 || local78.anIntArray95[local158] != 1) {
													local346 = local78.anIntArray95[local158];
													this.aClass1_Sub1_Sub2_Sub4_1.method451(method196(local346, (byte) 9), 0, local175 + local208 + 1, local184 + 10 + local210);
													this.aClass1_Sub1_Sub2_Sub4_1.method451(method196(local346, (byte) 9), 16776960, local175 + local208, local184 + 9 + local210);
												}
											}
										}
									} else if (local78.aClass1_Sub1_Sub2_Sub2Array8 != null && local158 < 20) {
										@Pc(535) Class1_Sub1_Sub2_Sub2 local535 = local78.aClass1_Sub1_Sub2_Sub2Array8[local158];
										if (local535 != null) {
											local535.method391(local175, local184);
										}
									}
									local158++;
								}
							}
						} else if (local78.anInt433 == 3) {
							@Pc(561) boolean local561 = false;
							if (this.anInt424 == local78.anInt431 || this.anInt288 == local78.anInt431 || this.anInt298 == local78.anInt431) {
								local561 = true;
							}
							if (this.method137(local78)) {
								local158 = local78.anInt447;
								if (local561 && local78.anInt449 != 0) {
									local158 = local78.anInt449;
								}
							} else {
								local158 = local78.anInt446;
								if (local561 && local78.anInt448 != 0) {
									local158 = local78.anInt448;
								}
							}
							if (local78.aByte10 == 0) {
								if (local78.aBoolean103) {
									Class1_Sub1_Sub2.method439(local83, local78.anInt436, local158, local78.anInt437, local88);
								} else {
									Class1_Sub1_Sub2.method440(local78.anInt436, local78.anInt437, local83, local88, local158);
								}
							} else if (local78.aBoolean103) {
								Class1_Sub1_Sub2.method438(256 - (local78.aByte10 & 0xFF), local158, local88, local78.anInt436, local83, local78.anInt437);
							} else {
								Class1_Sub1_Sub2.method441(local78.anInt436, local78.anInt437, local158, local88, 256 - (local78.aByte10 & 0xFF), local83);
							}
						} else {
							@Pc(679) Class1_Sub1_Sub2_Sub4 local679;
							if (local78.anInt433 == 4) {
								local679 = local78.aClass1_Sub1_Sub2_Sub4_5;
								@Pc(682) String local682 = local78.aString18;
								@Pc(684) boolean local684 = false;
								if (this.anInt424 == local78.anInt431 || this.anInt288 == local78.anInt431 || this.anInt298 == local78.anInt431) {
									local684 = true;
								}
								if (this.method137(local78)) {
									local160 = local78.anInt447;
									if (local684 && local78.anInt449 != 0) {
										local160 = local78.anInt449;
									}
									if (local78.aString19.length() > 0) {
										local682 = local78.aString19;
									}
								} else {
									local160 = local78.anInt446;
									if (local684 && local78.anInt448 != 0) {
										local160 = local78.anInt448;
									}
								}
								if (local78.anInt434 == 6 && this.aBoolean63) {
									local682 = "Please wait...";
									local160 = local78.anInt446;
								}
								if (Class1_Sub1_Sub2.anInt707 == 479) {
									if (local160 == 16776960) {
										local160 = 255;
									}
									if (local160 == 49152) {
										local160 = 16777215;
									}
								}
								local208 = local88 + local679.anInt719;
								while (local682.length() > 0) {
									if (local682.indexOf("%") != -1) {
										label347: while (true) {
											local210 = local682.indexOf("%1");
											if (local210 == -1) {
												while (true) {
													local210 = local682.indexOf("%2");
													if (local210 == -1) {
														while (true) {
															local210 = local682.indexOf("%3");
															if (local210 == -1) {
																while (true) {
																	local210 = local682.indexOf("%4");
																	if (local210 == -1) {
																		while (true) {
																			local210 = local682.indexOf("%5");
																			if (local210 == -1) {
																				break label347;
																			}
																			local682 = local682.substring(0, local210) + this.method209(this.method146(4, local78)) + local682.substring(local210 + 2);
																		}
																	}
																	local682 = local682.substring(0, local210) + this.method209(this.method146(3, local78)) + local682.substring(local210 + 2);
																}
															}
															local682 = local682.substring(0, local210) + this.method209(this.method146(2, local78)) + local682.substring(local210 + 2);
														}
													}
													local682 = local682.substring(0, local210) + this.method209(this.method146(1, local78)) + local682.substring(local210 + 2);
												}
											}
											local682 = local682.substring(0, local210) + this.method209(this.method146(0, local78)) + local682.substring(local210 + 2);
										}
									}
									local210 = local682.indexOf("\\n");
									@Pc(956) String local956;
									if (local210 == -1) {
										local956 = local682;
										local682 = "";
									} else {
										local956 = local682.substring(0, local210);
										local682 = local682.substring(local210 + 2);
									}
									if (local78.aBoolean104) {
										local679.method448(local83 + local78.anInt436 / 2, local78.aBoolean105, local208, local160, local956);
									} else {
										local679.method455(local208, local78.aBoolean105, local83, local160, local956);
									}
									local208 += local679.anInt719;
								}
							} else if (local78.anInt433 == 5) {
								@Pc(1018) Class1_Sub1_Sub2_Sub2 local1018;
								if (this.method137(local78)) {
									local1018 = local78.aClass1_Sub1_Sub2_Sub2_15;
								} else {
									local1018 = local78.aClass1_Sub1_Sub2_Sub2_14;
								}
								if (local1018 != null) {
									local1018.method391(local83, local88);
								}
							} else if (local78.anInt433 == 6) {
								local158 = Class1_Sub1_Sub2_Sub1.anInt606;
								local160 = Class1_Sub1_Sub2_Sub1.anInt607;
								Class1_Sub1_Sub2_Sub1.anInt606 = local83 + local78.anInt436 / 2;
								Class1_Sub1_Sub2_Sub1.anInt607 = local88 + local78.anInt437 / 2;
								local164 = Class1_Sub1_Sub2_Sub1.anIntArray178[local78.anInt457] * local78.anInt456 >> 16;
								local175 = Class1_Sub1_Sub2_Sub1.anIntArray179[local78.anInt457] * local78.anInt456 >> 16;
								@Pc(1079) boolean local1079 = this.method137(local78);
								if (local1079) {
									local208 = local78.anInt455;
								} else {
									local208 = local78.anInt454;
								}
								@Pc(1099) Class1_Sub1_Sub1_Sub5 local1099;
								if (local208 == -1) {
									local1099 = local78.method233(-1, 175, -1, local1079);
								} else {
									@Pc(1105) Class27 local1105 = Class27.aClass27Array1[local208];
									local1099 = local78.method233(local1105.anIntArray225[local78.anInt429], 175, local1105.anIntArray226[local78.anInt429], local1079);
								}
								if (local1099 != null) {
									local1099.method281(local78.anInt458, 0, local78.anInt457, 0, local164, local175);
								}
								Class1_Sub1_Sub2_Sub1.anInt606 = local158;
								Class1_Sub1_Sub2_Sub1.anInt607 = local160;
							} else if (local78.anInt433 == 7) {
								local679 = local78.aClass1_Sub1_Sub2_Sub4_5;
								local160 = 0;
								for (local164 = 0; local164 < local78.anInt437; local164++) {
									for (local175 = 0; local175 < local78.anInt436; local175++) {
										if (local78.anIntArray94[local160] > 0) {
											@Pc(1169) Class15 local1169 = Class15.method361(local78.anIntArray94[local160] - 1);
											@Pc(1172) String local1172 = local1169.aString25;
											if (local1169.aBoolean161 || local78.anIntArray95[local160] != 1) {
												local1172 = local1172 + " x" + method214(local78.anIntArray95[local160]);
											}
											local210 = local83 + local175 * (local78.anInt444 + 115);
											local217 = local88 + local164 * (local78.anInt445 + 12);
											if (local78.aBoolean104) {
												local679.method448(local210 + local78.anInt436 / 2, local78.aBoolean105, local217, local78.anInt446, local1172);
											} else {
												local679.method455(local217, local78.aBoolean105, local210, local78.anInt446, local1172);
											}
										}
										local160++;
									}
								}
							}
						}
					}
				}
				Class1_Sub1_Sub2.method436(local31, local29, local33, local35);
			}
		} catch (@Pc(1276) RuntimeException local1276) {
			signlink.reporterror("8754, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + local1276.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V")
	private void method204(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		try {
			if (arg1 == 0 && this.anInt349 != -1) {
				this.aString9 = arg2;
				super.anInt210 = 0;
			}
			if (this.anInt278 == -1) {
				this.aBoolean80 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray32[local20] = this.anIntArray32[local20 - 1];
				this.aStringArray1[local20] = this.aStringArray1[local20 - 1];
				this.aStringArray2[local20] = this.aStringArray2[local20 - 1];
			}
			this.anIntArray32[0] = arg1;
			this.aStringArray1[0] = arg0;
			this.aStringArray2[0] = arg2;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("86710, " + 1 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method205(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt231; local8++) {
					if (this.aLongArray4[local8] == arg0) {
						this.anInt231--;
						this.aBoolean85 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt231; local28++) {
							this.aStringArray6[local28] = this.aStringArray6[local28 + 1];
							this.anIntArray70[local28] = this.anIntArray70[local28 + 1];
							this.aLongArray4[local28] = this.aLongArray4[local28 + 1];
						}
						this.aClass1_Sub1_Sub3_3.method469(214);
						this.aClass1_Sub1_Sub3_3.method476(arg0, aBoolean90);
						break;
					}
				}
				@Pc(86) boolean local86 = false;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("73907, " + arg0 + ", " + arg1 + ", " + local88.toString());
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
				return new URL("http://127.0.0.1:" + (anInt256 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class29 local9 = this.aClass29ArrayArrayArray1[this.anInt325][arg0][arg1];
		if (local9 == null) {
			this.aClass37_1.method551(this.anInt325, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub1_Sub1_Sub3 local23 = null;
		@Pc(27) Class1_Sub1_Sub1_Sub3 local27;
		for (local27 = (Class1_Sub1_Sub1_Sub3) local9.method511(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub3) local9.method513()) {
			@Pc(32) Class15 local32 = Class15.method361(local27.anInt189);
			@Pc(35) int local35 = local32.anInt626;
			if (local32.aBoolean161) {
				local35 *= local27.anInt190 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method509(local23);
		@Pc(65) Class1_Sub1_Sub1_Sub3 local65 = null;
		@Pc(67) Class1_Sub1_Sub1_Sub3 local67 = null;
		for (local27 = (Class1_Sub1_Sub1_Sub3) local9.method511(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub3) local9.method513()) {
			if (local27.anInt189 != local23.anInt189 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt189 != local23.anInt189 && local27.anInt189 != local65.anInt189 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass37_1.method537(arg1, local65, local110, local23, this.anInt325, local67, this.method218(arg0 * 128 + 64, arg1 * 128 + 64, this.anInt325), arg0);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IB)V")
	private void method207(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(3) Class6 local3 = Class6.aClass6Array1[arg0];
			for (@Pc(5) int local5 = 0; local5 < local3.anIntArray98.length && local3.anIntArray98[local5] != -1; local5++) {
				@Pc(20) Class6 local20 = Class6.aClass6Array1[local3.anIntArray98[local5]];
				if (local20.anInt433 == 1) {
					this.method207(local20.anInt431, (byte) 5);
				}
				local20.anInt429 = 0;
				local20.anInt430 = 0;
			}
			if (this.aByte7 == 5) {
				@Pc(47) boolean local47 = false;
			} else {
				this.aClass1_Sub1_Sub3_3.method470(127);
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("43957, " + arg0 + ", " + arg1 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ILclient!lb;I)V")
	private void method208(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt334 = 0;
			this.anInt353 = 0;
			this.method126(arg1, arg0);
			this.method220(arg0, arg1);
			this.method157(arg0, arg1);
			@Pc(37) int local37;
			for (@Pc(30) int local30 = 0; local30 < this.anInt334; local30++) {
				local37 = this.anIntArray65[local30];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local37].anInt1045 != anInt248) {
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local37].aClass13_2 = null;
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local37] = null;
				}
			}
			if (arg0.anInt751 != arg1) {
				signlink.reporterror(this.aString10 + " size mismatch in getnpcpos - pos:" + arg0.anInt751 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local37 = 0; local37 < this.anInt283; local37++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray48[local37]] == null) {
					signlink.reporterror(this.aString10 + " null entry in npc list - pos:" + local37 + " size:" + this.anInt283);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("46799, " + -207 + ", " + arg0 + ", " + arg1 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)Ljava/lang/String;")
	private String method209(@OriginalArg(1) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("20659, " + -466 + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method210() {
		try {
			this.aClass1_Sub1_Sub3_3.method469(84);
			if (this.anInt279 != -1) {
				this.anInt279 = -1;
				this.aBoolean85 = true;
				this.aBoolean63 = false;
				this.aBoolean62 = true;
			}
			if (this.anInt278 != -1) {
				this.anInt278 = -1;
				this.aBoolean80 = true;
				this.aBoolean63 = false;
			}
			this.anInt218 = -1;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("1177, " + 1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILclient!ib;I)V")
	private void method211(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub2_Sub2 arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(7) int local7 = this.anInt250 + this.anInt260 & 0x7FF;
			@Pc(15) int local15 = arg3 * arg3 + arg1 * arg1;
			if (arg0) {
				this.aClass29ArrayArrayArray1 = null;
			}
			if (local15 <= 6400) {
				@Pc(28) int local28 = Class1_Sub1_Sub1_Sub5.anIntArray151[local7];
				@Pc(32) int local32 = Class1_Sub1_Sub1_Sub5.anIntArray152[local7];
				@Pc(41) int local41 = local28 * 256 / (this.anInt267 + 256);
				@Pc(50) int local50 = local32 * 256 / (this.anInt267 + 256);
				@Pc(60) int local60 = arg1 * local41 + arg3 * local50 >> 16;
				@Pc(70) int local70 = arg1 * local50 - arg3 * local41 >> 16;
				if (local15 > 2500) {
					arg2.method397(local60 + 94 + 4 - arg2.anInt668 / 2, this.aClass1_Sub1_Sub2_Sub3_2, 83 - local70 - arg2.anInt669 / 2 - 4);
				} else {
					arg2.method391(local60 + 94 + 4 - arg2.anInt668 / 2, 83 - local70 - arg2.anInt669 / 2 - 4);
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("15656, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "N", descriptor = "(I)V")
	private void method212() {
		try {
			this.anInt281++;
			this.method175(898, true);
			this.method123(true);
			this.method175(898, false);
			this.method123(false);
			this.method101();
			this.method152();
			@Pc(35) int local35;
			@Pc(74) int local74;
			if (!this.aBoolean76) {
				local35 = this.anInt249;
				if (this.anInt282 / 256 > local35) {
					local35 = this.anInt282 / 256;
				}
				if (this.aBooleanArray3[4] && this.anIntArray39[4] + 128 > local35) {
					local35 = this.anIntArray39[4] + 128;
				}
				local74 = this.anInt250 + this.anInt421 & 0x7FF;
				this.method155(local35, this.anInt313, local74, this.method218(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1005, aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1006, this.anInt325) - 50, local35 * 3 + 600, this.anInt314);
			}
			if (this.aBoolean76) {
				local35 = this.method224();
			} else {
				local35 = this.method223();
			}
			local74 = this.anInt262;
			@Pc(118) int local118 = this.anInt263;
			@Pc(121) int local121 = this.anInt264;
			@Pc(124) int local124 = this.anInt265;
			@Pc(127) int local127 = this.anInt266;
			@Pc(176) int local176;
			for (@Pc(129) int local129 = 0; local129 < 5; local129++) {
				if (this.aBooleanArray3[local129]) {
					local176 = (int) (Math.random() * (double) (this.anIntArray84[local129] * 2 + 1) - (double) this.anIntArray84[local129] + Math.sin((double) this.anIntArray64[local129] * ((double) this.anIntArray56[local129] / 100.0D)) * (double) this.anIntArray39[local129]);
					if (local129 == 0) {
						this.anInt262 += local176;
					}
					if (local129 == 1) {
						this.anInt263 += local176;
					}
					if (local129 == 2) {
						this.anInt264 += local176;
					}
					if (local129 == 3) {
						this.anInt266 = this.anInt266 + local176 & 0x7FF;
					}
					if (local129 == 4) {
						this.anInt265 += local176;
						if (this.anInt265 < 128) {
							this.anInt265 = 128;
						}
						if (this.anInt265 > 383) {
							this.anInt265 = 383;
						}
					}
				}
			}
			local176 = Class1_Sub1_Sub2_Sub1.anInt610;
			Class1_Sub1_Sub1_Sub5.aBoolean123 = true;
			Class1_Sub1_Sub1_Sub5.anInt511 = 0;
			Class1_Sub1_Sub1_Sub5.anInt509 = super.anInt205 - 4;
			Class1_Sub1_Sub1_Sub5.anInt510 = super.anInt206 - 4;
			Class1_Sub1_Sub2.method437();
			this.aClass37_1.method569(this.anInt262, this.anInt264, local35, this.anInt265, this.anInt263, this.anInt266);
			this.aClass37_1.method544();
			this.method156();
			this.method222();
			this.method108(local176, 535);
			this.anInt382 += 0;
			this.method174();
			this.aClass35_26.method525(4, 4, (byte) 3, super.aGraphics2);
			this.anInt262 = local74;
			this.anInt263 = local118;
			this.anInt264 = local121;
			this.anInt265 = local124;
			this.anInt266 = local127;
		} catch (@Pc(321) RuntimeException local321) {
			signlink.reporterror("53726, " + 0 + ", " + local321.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method91(@OriginalArg(0) byte arg0) {
		try {
			signlink.reporterror = false;
			try {
				if (this.aClass8_1 != null) {
					this.aClass8_1.method247();
				}
			} catch (@Pc(11) Exception local11) {
			}
			this.aClass8_1 = null;
			this.method135(this.anInt393);
			if (this.aClass11_1 != null) {
				this.aClass11_1.aBoolean140 = false;
			}
			this.aClass11_1 = null;
			this.aClass44_Sub1_1.method637();
			this.aClass44_Sub1_1 = null;
			this.aClass1_Sub1_Sub3_3 = null;
			this.aClass1_Sub1_Sub3_2 = null;
			this.aClass1_Sub1_Sub3_4 = null;
			this.anIntArray51 = null;
			this.aByteArrayArray2 = null;
			this.aByteArrayArray1 = null;
			this.anIntArray52 = null;
			this.anIntArray53 = null;
			this.anIntArrayArrayArray5 = null;
			this.aByteArrayArrayArray7 = null;
			this.aClass37_1 = null;
			this.aClass19Array1 = null;
			this.anIntArrayArray5 = null;
			this.anIntArrayArray3 = null;
			@Pc(81) boolean local81 = false;
			this.anIntArray90 = null;
			this.anIntArray91 = null;
			this.aByteArray2 = null;
			this.aClass35_24 = null;
			this.aClass35_25 = null;
			this.aClass35_26 = null;
			this.aClass35_27 = null;
			this.aClass35_21 = null;
			this.aClass35_22 = null;
			this.aClass35_23 = null;
			this.aClass35_12 = null;
			this.aClass35_13 = null;
			this.aClass35_14 = null;
			this.aClass35_15 = null;
			this.aClass35_16 = null;
			this.aClass35_17 = null;
			this.aClass35_18 = null;
			this.aClass35_19 = null;
			this.aClass35_20 = null;
			this.aClass1_Sub1_Sub2_Sub3_1 = null;
			this.aClass1_Sub1_Sub2_Sub3_2 = null;
			this.aClass1_Sub1_Sub2_Sub3_3 = null;
			this.aClass1_Sub1_Sub2_Sub3_4 = null;
			this.aClass1_Sub1_Sub2_Sub3_5 = null;
			this.aClass1_Sub1_Sub2_Sub3_6 = null;
			this.aClass1_Sub1_Sub2_Sub3Array2 = null;
			this.aClass1_Sub1_Sub2_Sub3_7 = null;
			this.aClass1_Sub1_Sub2_Sub3_8 = null;
			this.aClass1_Sub1_Sub2_Sub3_9 = null;
			this.aClass1_Sub1_Sub2_Sub3_10 = null;
			this.aClass1_Sub1_Sub2_Sub3_11 = null;
			this.aClass1_Sub1_Sub2_Sub3_14 = null;
			this.aClass1_Sub1_Sub2_Sub3_15 = null;
			this.aClass1_Sub1_Sub2_Sub3_16 = null;
			this.aClass1_Sub1_Sub2_Sub3_17 = null;
			this.aClass1_Sub1_Sub2_Sub3_18 = null;
			this.aClass1_Sub1_Sub2_Sub2_7 = null;
			this.aClass1_Sub1_Sub2_Sub2Array6 = null;
			this.aClass1_Sub1_Sub2_Sub2Array5 = null;
			this.aClass1_Sub1_Sub2_Sub2Array7 = null;
			this.aClass1_Sub1_Sub2_Sub2_9 = null;
			this.aClass1_Sub1_Sub2_Sub2_10 = null;
			this.aClass1_Sub1_Sub2_Sub2_11 = null;
			this.aClass1_Sub1_Sub2_Sub2_12 = null;
			this.aClass1_Sub1_Sub2_Sub3Array3 = null;
			this.aClass1_Sub1_Sub2_Sub2Array4 = null;
			this.anIntArrayArray6 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub1Array1 = null;
			this.anIntArray66 = null;
			this.anIntArray67 = null;
			this.aClass1_Sub1_Sub3Array1 = null;
			this.anIntArray65 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub2Array1 = null;
			this.anIntArray48 = null;
			this.aClass29ArrayArrayArray1 = null;
			this.aClass29_1 = null;
			this.aClass29_2 = null;
			this.aClass29_3 = null;
			this.anIntArray35 = null;
			this.anIntArray36 = null;
			this.anIntArray37 = null;
			this.anIntArray38 = null;
			this.aStringArray3 = null;
			this.anIntArray45 = null;
			this.anIntArray76 = null;
			this.anIntArray77 = null;
			this.aClass1_Sub1_Sub2_Sub2Array3 = null;
			this.aClass1_Sub1_Sub2_Sub2_8 = null;
			this.aStringArray6 = null;
			this.aLongArray4 = null;
			this.anIntArray70 = null;
			this.aClass35_6 = null;
			this.aClass35_7 = null;
			this.aClass35_3 = null;
			this.aClass35_4 = null;
			this.aClass35_5 = null;
			this.aClass35_8 = null;
			this.aClass35_9 = null;
			this.aClass35_10 = null;
			this.aClass35_11 = null;
			this.method147();
			Class9.method287();
			Class13.method322();
			Class15.method360();
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
			Class1_Sub1_Sub2_Sub1.method342();
			Class37.method529();
			Class1_Sub1_Sub1_Sub5.method257();
			Class12.method304();
			System.gc();
		} catch (@Pc(375) RuntimeException local375) {
			signlink.reporterror("78219, " + arg0 + ", " + local375.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(III)Z")
	private boolean method213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(7) Class6 local7 = Class6.aClass6Array1[arg1];
			for (@Pc(9) int local9 = 0; local9 < local7.anIntArray98.length && local7.anIntArray98[local9] != -1; local9++) {
				@Pc(24) Class6 local24 = Class6.aClass6Array1[local7.anIntArray98[local9]];
				if (local24.anInt433 == 1) {
					local3 |= this.method213(arg0, local24.anInt431, this.anInt372);
				}
				if (local24.anInt433 == 6 && (local24.anInt454 != -1 || local24.anInt455 != -1)) {
					@Pc(55) boolean local55 = this.method137(local24);
					@Pc(60) int local60;
					if (local55) {
						local60 = local24.anInt455;
					} else {
						local60 = local24.anInt454;
					}
					if (local60 != -1) {
						@Pc(72) Class27 local72 = Class27.aClass27Array1[local60];
						local24.anInt430 += arg0;
						while (local24.anInt430 > local72.method506(local24.anInt429)) {
							local24.anInt430 -= local72.method506(local24.anInt429) + 1;
							local24.anInt429++;
							if (local24.anInt429 >= local72.anInt807) {
								local24.anInt429 -= local72.anInt808;
								if (local24.anInt429 < 0 || local24.anInt429 >= local72.anInt807) {
									local24.anInt429 = 0;
								}
							}
							local3 = true;
						}
					}
				}
			}
			if (arg2 >= 0) {
				throw new NullPointerException();
			}
			return local3;
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("95747, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)V")
	private void method215(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.anInt300 != 6) {
				anInt417 = 138;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(9) int local9 = 0; local9 < 100; local9++) {
				if (this.aStringArray2[local9] != null) {
					@Pc(21) int local21 = this.anIntArray32[local9];
					@Pc(32) int local32 = this.anInt420 + 70 + 4 - local7 * 14;
					if (local32 < -20) {
						break;
					}
					@Pc(40) String local40 = this.aStringArray1[local9];
					if (local40 != null && local40.startsWith("@cr1@")) {
						local40 = local40.substring(5);
					}
					if (local40 != null && local40.startsWith("@cr2@")) {
						local40 = local40.substring(5);
					}
					if (local21 == 0) {
						local7++;
					}
					if ((local21 == 1 || local21 == 2) && (local21 == 1 || this.anInt273 == 0 || this.anInt273 == 1 && this.method105(local40))) {
						if (arg0 > local32 - 14 && arg0 <= local32 && !local40.equals(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3)) {
							if (this.anInt272 >= 1) {
								this.aStringArray3[this.anInt290] = "Report abuse @whi@" + local40;
								this.anIntArray37[this.anInt290] = 524;
								this.anInt290++;
							}
							this.aStringArray3[this.anInt290] = "Add ignore @whi@" + local40;
							this.anIntArray37[this.anInt290] = 47;
							this.anInt290++;
							this.aStringArray3[this.anInt290] = "Add friend @whi@" + local40;
							this.anIntArray37[this.anInt290] = 605;
							this.anInt290++;
						}
						local7++;
					}
					if ((local21 == 3 || local21 == 7) && this.anInt280 == 0 && (local21 == 7 || this.anInt408 == 0 || this.anInt408 == 1 && this.method105(local40))) {
						if (arg0 > local32 - 14 && arg0 <= local32) {
							if (this.anInt272 >= 1) {
								this.aStringArray3[this.anInt290] = "Report abuse @whi@" + local40;
								this.anIntArray37[this.anInt290] = 524;
								this.anInt290++;
							}
							this.aStringArray3[this.anInt290] = "Add ignore @whi@" + local40;
							this.anIntArray37[this.anInt290] = 47;
							this.anInt290++;
							this.aStringArray3[this.anInt290] = "Add friend @whi@" + local40;
							this.anIntArray37[this.anInt290] = 605;
							this.anInt290++;
						}
						local7++;
					}
					if (local21 == 4 && (this.anInt324 == 0 || this.anInt324 == 1 && this.method105(local40))) {
						if (arg0 > local32 - 14 && arg0 <= local32) {
							this.aStringArray3[this.anInt290] = "Accept trade @whi@" + local40;
							this.anIntArray37[this.anInt290] = 507;
							this.anInt290++;
						}
						local7++;
					}
					if ((local21 == 5 || local21 == 6) && this.anInt280 == 0 && this.anInt408 < 2) {
						local7++;
					}
					if (local21 == 8 && (this.anInt324 == 0 || this.anInt324 == 1 && this.method105(local40))) {
						if (arg0 > local32 - 14 && arg0 <= local32) {
							this.aStringArray3[this.anInt290] = "Accept challenge @whi@" + local40;
							this.anIntArray37[this.anInt290] = 957;
							this.anInt290++;
						}
						local7++;
					}
				}
			}
		} catch (@Pc(405) RuntimeException local405) {
			signlink.reporterror("11801, " + arg0 + ", " + 6 + ", " + arg1 + ", " + local405.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILjava/lang/String;Ljava/lang/String;)Lclient!xb;")
	private Class47 method216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4) {
		try {
			@Pc(3) byte[] local3 = null;
			@Pc(5) int local5 = 5;
			try {
				if (this.aClass45Array1[0] != null) {
					local3 = this.aClass45Array1[0].method658(arg0);
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
				return new Class47(local3, -41647);
			}
			local34 = 0;
			while (local3 == null) {
				@Pc(55) String local55 = "Unknown error";
				this.method96("Requesting " + arg4, arg2);
				@Pc(70) int local70;
				try {
					local70 = 0;
					@Pc(81) DataInputStream local81 = this.method200(arg3 + arg1);
					@Pc(84) byte[] local84 = new byte[6];
					local81.readFully(local84, 0, 6);
					@Pc(95) Class1_Sub1_Sub3 local95 = new Class1_Sub1_Sub3(anInt417, local84);
					local95.anInt751 = 3;
					@Pc(103) int local103 = local95.method484() + 6;
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
							this.method96("Loading " + arg4 + " - " + local168 + "%", arg2);
						}
						local70 = local168;
					}
					local81.close();
					try {
						if (this.aClass45Array1[0] != null) {
							this.aClass45Array1[0].method659(arg0, this.anInt333, local3, local3.length);
						}
					} catch (@Pc(214) Exception local214) {
						this.aClass45Array1[0] = null;
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
				} catch (@Pc(249) IOException local249) {
					if (local55.equals("Unknown error")) {
						local55 = "Connection error";
					}
					local3 = null;
				} catch (@Pc(259) NullPointerException local259) {
					local55 = "Null error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(268) ArrayIndexOutOfBoundsException local268) {
					local55 = "Bounds error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(277) Exception local277) {
					local55 = "Unexpected error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local3 == null) {
					for (local70 = local5; local70 > 0; local70--) {
						if (local34 >= 3) {
							this.method96("Game updated - please reload page", arg2);
							local70 = 10;
						} else {
							this.method96(local55 + " - Retrying in " + local70, arg2);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(321) Exception local321) {
						}
					}
					local5 *= 2;
					if (local5 > 60) {
						local5 = 60;
					}
					this.aBoolean65 = !this.aBoolean65;
				}
			}
			@Pc(350) Class47 local350 = new Class47(local3, -41647);
			this.anInt382 += 0;
			return local350;
		} catch (@Pc(359) RuntimeException local359) {
			signlink.reporterror("69171, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local359.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!lb;ZI)V")
	private void method217(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < this.anInt353; local4++) {
				@Pc(11) int local11 = this.anIntArray67[local4];
				@Pc(16) Class1_Sub1_Sub1_Sub1_Sub1 local16 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local11];
				@Pc(19) int local19 = arg0.method480();
				if ((local19 & 0x80) == 128) {
					local19 += arg0.method480() << 8;
				}
				this.method116(arg0, local19, local11, this.anInt335, local16);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("10458, " + arg0 + ", " + false + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIZ)I")
	private int method218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) int local3 = arg0 >> 7;
			@Pc(7) int local7 = arg1 >> 7;
			if (local3 < 0 || local7 < 0 || local3 > 103 || local7 > 103) {
				return 0;
			}
			@Pc(21) int local21 = arg2;
			if (arg2 < 3 && (this.aByteArrayArrayArray7[1][local3][local7] & 0x2) == 2) {
				local21 = arg2 + 1;
			}
			@Pc(41) int local41 = arg0 & 0x7F;
			@Pc(45) int local45 = arg1 & 0x7F;
			@Pc(73) int local73 = this.anIntArrayArrayArray5[local21][local3][local7] * (128 - local41) + this.anIntArrayArrayArray5[local21][local3 + 1][local7] * local41 >> 7;
			this.aBoolean59 &= true;
			@Pc(111) int local111 = this.anIntArrayArrayArray5[local21][local3][local7 + 1] * (128 - local41) + this.anIntArrayArrayArray5[local21][local3 + 1][local7 + 1] * local41 >> 7;
			return local73 * (128 - local45) + local111 * local45 >> 7;
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("12035, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "O", descriptor = "(I)V")
	private void method219() {
		try {
			@Pc(17) int local17 = this.aClass1_Sub1_Sub2_Sub4_3.method449("Choose Option", this.aByte6);
			@Pc(31) int local31;
			for (@Pc(19) int local19 = 0; local19 < this.anInt290; local19++) {
				local31 = this.aClass1_Sub1_Sub2_Sub4_3.method449(this.aStringArray3[local19], this.aByte6);
				if (local31 > local17) {
					local17 = local31;
				}
			}
			local17 += 8;
			local31 = this.anInt290 * 15 + 21;
			@Pc(74) int local74;
			@Pc(92) int local92;
			if (super.anInt211 > 4 && super.anInt212 > 4 && super.anInt211 < 516 && super.anInt212 < 338) {
				local74 = super.anInt211 - local17 / 2 - 4;
				if (local74 + local17 > 512) {
					local74 = 512 - local17;
				}
				if (local74 < 0) {
					local74 = 0;
				}
				local92 = super.anInt212 - 4;
				if (local92 + local31 > 334) {
					local92 = 334 - local31;
				}
				if (local92 < 0) {
					local92 = 0;
				}
				this.aBoolean81 = true;
				this.anInt236 = 0;
				this.anInt237 = local74;
				this.anInt238 = local92;
				this.anInt239 = local17;
				this.anInt240 = this.anInt290 * 15 + 22;
			}
			if (super.anInt211 > 553 && super.anInt212 > 205 && super.anInt211 < 743 && super.anInt212 < 466) {
				local74 = super.anInt211 - local17 / 2 - 553;
				if (local74 < 0) {
					local74 = 0;
				} else if (local74 + local17 > 190) {
					local74 = 190 - local17;
				}
				local92 = super.anInt212 - 205;
				if (local92 < 0) {
					local92 = 0;
				} else if (local92 + local31 > 261) {
					local92 = 261 - local31;
				}
				this.aBoolean81 = true;
				this.anInt236 = 1;
				this.anInt237 = local74;
				this.anInt238 = local92;
				this.anInt239 = local17;
				this.anInt240 = this.anInt290 * 15 + 22;
			}
			if (super.anInt211 > 17 && super.anInt212 > 357 && super.anInt211 < 496 && super.anInt212 < 453) {
				local74 = super.anInt211 - local17 / 2 - 17;
				if (local74 < 0) {
					local74 = 0;
				} else if (local74 + local17 > 479) {
					local74 = 479 - local17;
				}
				local92 = super.anInt212 - 357;
				if (local92 < 0) {
					local92 = 0;
				} else if (local92 + local31 > 96) {
					local92 = 96 - local31;
				}
				this.aBoolean81 = true;
				this.anInt236 = 2;
				this.anInt237 = local74;
				this.anInt238 = local92;
				this.anInt239 = local17;
				this.anInt240 = this.anInt290 * 15 + 22;
			}
		} catch (@Pc(296) RuntimeException local296) {
			signlink.reporterror("81837, " + 9 + ", " + local296.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!lb;IB)V")
	private void method220(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			while (true) {
				if (arg0.anInt752 + 21 < arg1 * 8) {
					@Pc(12) int local12 = arg0.method491(14);
					if (local12 != 16383) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12] = new Class1_Sub1_Sub1_Sub1_Sub2();
						}
						@Pc(32) Class1_Sub1_Sub1_Sub1_Sub2 local32 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12];
						this.anIntArray48[this.anInt283++] = local12;
						local32.anInt1045 = anInt248;
						local32.aClass13_2 = Class13.method323(arg0.method491(12));
						local32.anInt1008 = local32.aClass13_2.aByte16;
						local32.anInt1048 = local32.aClass13_2.anInt583;
						local32.anInt1011 = local32.aClass13_2.anInt570;
						local32.anInt1012 = local32.aClass13_2.anInt571;
						local32.anInt1013 = local32.aClass13_2.anInt572;
						local32.anInt1014 = local32.aClass13_2.anInt573;
						local32.anInt1009 = local32.aClass13_2.anInt569;
						@Pc(93) int local93 = arg0.method491(5);
						if (local93 > 15) {
							local93 -= 32;
						}
						@Pc(102) int local102 = arg0.method491(5);
						if (local102 > 15) {
							local102 -= 32;
						}
						@Pc(111) int local111 = arg0.method491(1);
						local32.method677(local111 == 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0] + local93, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0] + local102, aBoolean74);
						@Pc(137) int local137 = arg0.method491(1);
						if (local137 == 1) {
							this.anIntArray67[this.anInt353++] = local12;
						}
						continue;
					}
				}
				arg0.method492();
				return;
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("21943, " + arg0 + ", " + arg1 + ", " + 46 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method221() {
		try {
			this.aClass35_24.method524();
			Class1_Sub1_Sub2_Sub1.anIntArray180 = this.anIntArray80;
			this.aClass1_Sub1_Sub2_Sub3_1.method418(0, 0);
			if (this.anInt279 != -1) {
				this.method203(0, 0, Class6.aClass6Array1[this.anInt279], 0);
			} else if (this.anIntArray85[this.anInt321] != -1) {
				this.method203(0, 0, Class6.aClass6Array1[this.anIntArray85[this.anInt321]], 0);
			}
			if (this.aBoolean81 && this.anInt236 == 1) {
				this.method230(711);
			}
			this.aClass35_24.method525(553, 205, (byte) 3, super.aGraphics2);
			this.aClass35_26.method524();
			Class1_Sub1_Sub2_Sub1.anIntArray180 = this.anIntArray81;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("41259, " + false + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "P", descriptor = "(I)V")
	private void method222() {
		try {
			if (this.anInt323 == 2) {
				this.method159((this.anInt303 - this.anInt358 << 7) + this.anInt306, (this.anInt302 - this.anInt357 << 7) + this.anInt305, this.anInt304 * 2);
				if (this.anInt354 > -1 && anInt248 % 20 < 10) {
					this.aClass1_Sub1_Sub2_Sub2Array5[2].method391(this.anInt354 - 12, this.anInt355 - 28);
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("34498, " + 8 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)I")
	private int method223() {
		try {
			@Pc(8) int local8 = 3;
			if (this.anInt265 < 310) {
				@Pc(17) int local17 = this.anInt262 >> 7;
				@Pc(22) int local22 = this.anInt264 >> 7;
				@Pc(27) int local27 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1005 >> 7;
				@Pc(32) int local32 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1006 >> 7;
				if ((this.aByteArrayArrayArray7[this.anInt325][local17][local22] & 0x4) != 0) {
					local8 = this.anInt325;
				}
				@Pc(54) int local54;
				if (local27 > local17) {
					local54 = local27 - local17;
				} else {
					local54 = local17 - local27;
				}
				@Pc(67) int local67;
				if (local32 > local22) {
					local67 = local32 - local22;
				} else {
					local67 = local22 - local32;
				}
				@Pc(82) int local82;
				@Pc(84) int local84;
				if (local54 > local67) {
					local82 = local67 * 65536 / local54;
					local84 = 32768;
					while (local17 != local27) {
						if (local17 < local27) {
							local17++;
						} else if (local17 > local27) {
							local17--;
						}
						if ((this.aByteArrayArrayArray7[this.anInt325][local17][local22] & 0x4) != 0) {
							local8 = this.anInt325;
						}
						local84 += local82;
						if (local84 >= 65536) {
							local84 -= 65536;
							if (local22 < local32) {
								local22++;
							} else if (local22 > local32) {
								local22--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt325][local17][local22] & 0x4) != 0) {
								local8 = this.anInt325;
							}
						}
					}
				} else {
					local82 = local54 * 65536 / local67;
					local84 = 32768;
					while (local22 != local32) {
						if (local22 < local32) {
							local22++;
						} else if (local22 > local32) {
							local22--;
						}
						if ((this.aByteArrayArrayArray7[this.anInt325][local17][local22] & 0x4) != 0) {
							local8 = this.anInt325;
						}
						local84 += local82;
						if (local84 >= 65536) {
							local84 -= 65536;
							if (local17 < local27) {
								local17++;
							} else if (local17 > local27) {
								local17--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt325][local17][local22] & 0x4) != 0) {
								local8 = this.anInt325;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray7[this.anInt325][aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1005 >> 7][aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1006 >> 7] & 0x4) != 0) {
				local8 = this.anInt325;
			}
			return local8;
		} catch (@Pc(249) RuntimeException local249) {
			signlink.reporterror("68460, " + false + ", " + local249.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "(I)I")
	private int method224() {
		try {
			@Pc(9) int local9 = this.method218(this.anInt262, this.anInt264, this.anInt325);
			this.anInt382 += 0;
			return local9 - this.anInt263 >= 800 || (this.aByteArrayArrayArray7[this.anInt325][this.anInt262 >> 7][this.anInt264 >> 7] & 0x4) == 0 ? 3 : this.anInt325;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("81351, " + 0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)I")
	private int method225(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = 256 - arg2;
			return ((arg0 & 0xFF00FF) * local3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * local3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("71301, " + -8050 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method89() {
		this.method96("Starting up", 20);
		if (signlink.sunjava) {
			super.anInt199 = 5;
		}
		if (aBoolean87) {
			this.aBoolean88 = true;
			return;
		}
		aBoolean87 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method141();
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
		if (local25.endsWith("192.168.1.242")) {
			local21 = true;
		}
		if (local25.endsWith("127.0.0.1")) {
			local21 = true;
		}
		if (!local21) {
			this.aBoolean86 = true;
			return;
		}
		if (signlink.aRandomAccessFile1 != null) {
			for (@Pc(95) int local95 = 0; local95 < 5; local95++) {
				this.aClass45Array1[local95] = new Class45(605, local95 + 1, 500000, signlink.aRandomAccessFileArray1[local95], signlink.aRandomAccessFile1);
			}
		}
		try {
			this.method120();
			this.aClass47_1 = this.method216(1, this.anIntArray33[1], 25, "title", "title screen");
			this.aClass1_Sub1_Sub2_Sub4_1 = new Class1_Sub1_Sub2_Sub4(false, this.aClass47_1, 45801, "p11_full");
			this.aClass1_Sub1_Sub2_Sub4_2 = new Class1_Sub1_Sub2_Sub4(false, this.aClass47_1, 45801, "p12_full");
			this.aClass1_Sub1_Sub2_Sub4_3 = new Class1_Sub1_Sub2_Sub4(false, this.aClass47_1, 45801, "b12_full");
			this.aClass1_Sub1_Sub2_Sub4_4 = new Class1_Sub1_Sub2_Sub4(true, this.aClass47_1, 45801, "q8_full");
			this.method111();
			this.method98();
			@Pc(191) Class47 local191 = this.method216(2, this.anIntArray33[2], 30, "config", "config");
			@Pc(203) Class47 local203 = this.method216(3, this.anIntArray33[3], 35, "interface", "interface");
			@Pc(215) Class47 local215 = this.method216(4, this.anIntArray33[4], 40, "media", "2d graphics");
			@Pc(227) Class47 local227 = this.method216(6, this.anIntArray33[6], 45, "textures", "textures");
			@Pc(239) Class47 local239 = this.method216(7, this.anIntArray33[7], 50, "wordenc", "chat system");
			@Pc(251) Class47 local251 = this.method216(8, this.anIntArray33[8], 55, "sounds", "sound effects");
			this.aByteArrayArrayArray7 = new byte[4][104][104];
			this.anIntArrayArrayArray5 = new int[4][105][105];
			this.aClass37_1 = new Class37(4, this.anIntArrayArrayArray5, 104, true, 104);
			for (@Pc(276) int local276 = 0; local276 < 4; local276++) {
				this.aClass19Array1[local276] = new Class19(anInt235, 104, 104);
			}
			this.aClass1_Sub1_Sub2_Sub2_8 = new Class1_Sub1_Sub2_Sub2(512, 512);
			@Pc(311) Class47 local311 = this.method216(5, this.anIntArray33[5], 60, "versionlist", "update list");
			this.method96("Connecting to update server", 60);
			this.aClass44_Sub1_1 = new Class44_Sub1();
			this.aClass44_Sub1_1.method636(local311, this);
			Class12.method302(this.aClass44_Sub1_1.method639());
			Class1_Sub1_Sub1_Sub5.method258(this.aClass44_Sub1_1.method638(0), this.aClass44_Sub1_1);
			if (!aBoolean56) {
				this.anInt361 = 0;
				try {
					this.anInt361 = Integer.parseInt(this.getParameter("music"));
				} catch (@Pc(352) Exception local352) {
				}
				this.aBoolean75 = true;
				this.aClass44_Sub1_1.method645(2, this.anInt361);
				while (this.aClass44_Sub1_1.method646() > 0) {
					this.method136(414);
					try {
						Thread.sleep(100L);
					} catch (@Pc(370) Exception local370) {
					}
					if (this.aClass44_Sub1_1.anInt972 > 3) {
						this.method131("ondemand");
						return;
					}
				}
			}
			this.method96("Requesting animations", 65);
			@Pc(394) int local394 = this.aClass44_Sub1_1.method638(1);
			for (@Pc(396) int local396 = 0; local396 < local394; local396++) {
				this.aClass44_Sub1_1.method645(1, local396);
			}
			@Pc(414) int local414;
			while (this.aClass44_Sub1_1.method646() > 0) {
				local414 = local394 - this.aClass44_Sub1_1.method646();
				if (local414 > 0) {
					this.method96("Loading animations - " + local414 * 100 / local394 + "%", 65);
				}
				this.method136(414);
				try {
					Thread.sleep(100L);
				} catch (@Pc(440) Exception local440) {
				}
				if (this.aClass44_Sub1_1.anInt972 > 3) {
					this.method131("ondemand");
					return;
				}
			}
			this.method96("Requesting models", 70);
			local394 = this.aClass44_Sub1_1.method638(0);
			@Pc(474) int local474;
			for (local414 = 0; local414 < local394; local414++) {
				local474 = this.aClass44_Sub1_1.method643(local414, (byte) 6);
				if ((local474 & 0x1) != 0) {
					this.aClass44_Sub1_1.method645(0, local414);
				}
			}
			local394 = this.aClass44_Sub1_1.method646();
			while (this.aClass44_Sub1_1.method646() > 0) {
				local474 = local394 - this.aClass44_Sub1_1.method646();
				if (local474 > 0) {
					this.method96("Loading models - " + local474 * 100 / local394 + "%", 70);
				}
				this.method136(414);
				try {
					Thread.sleep(100L);
				} catch (@Pc(525) Exception local525) {
				}
			}
			if (this.aClass45Array1[0] != null) {
				this.method96("Requesting maps", 75);
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(47, 0, 48));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(47, 1, 48));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(48, 0, 48));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(48, 1, 48));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(49, 0, 48));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(49, 1, 48));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(47, 0, 47));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(47, 1, 47));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(48, 0, 47));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(48, 1, 47));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(48, 0, 148));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(48, 1, 148));
				local394 = this.aClass44_Sub1_1.method646();
				while (this.aClass44_Sub1_1.method646() > 0) {
					local474 = local394 - this.aClass44_Sub1_1.method646();
					if (local474 > 0) {
						this.method96("Loading maps - " + local474 * 100 / local394 + "%", 75);
					}
					this.method136(414);
					try {
						Thread.sleep(100L);
					} catch (@Pc(710) Exception local710) {
					}
				}
			}
			local394 = this.aClass44_Sub1_1.method638(0);
			@Pc(731) int local731;
			for (local474 = 0; local474 < local394; local474++) {
				local731 = this.aClass44_Sub1_1.method643(local474, (byte) 6);
				@Pc(733) byte local733 = 0;
				if ((local731 & 0x8) != 0) {
					local733 = 10;
				} else if ((local731 & 0x20) != 0) {
					local733 = 9;
				} else if ((local731 & 0x10) != 0) {
					local733 = 8;
				} else if ((local731 & 0x40) != 0) {
					local733 = 7;
				} else if ((local731 & 0x80) != 0) {
					local733 = 6;
				} else if ((local731 & 0x2) != 0) {
					local733 = 5;
				} else if ((local731 & 0x4) != 0) {
					local733 = 4;
				}
				if ((local731 & 0x1) != 0) {
					local733 = 3;
				}
				if (local733 != 0) {
					this.aClass44_Sub1_1.method648(anInt297, 0, local733, local474);
				}
			}
			this.aClass44_Sub1_1.method641(aBoolean55);
			if (!aBoolean56) {
				local394 = this.aClass44_Sub1_1.method638(2);
				for (local731 = 1; local731 < local394; local731++) {
					if (this.aClass44_Sub1_1.method644(local731)) {
						this.aClass44_Sub1_1.method648(anInt297, 2, (byte) 1, local731);
					}
				}
			}
			this.method96("Unpacking media", 80);
			this.aClass1_Sub1_Sub2_Sub3_1 = new Class1_Sub1_Sub2_Sub3(local215, "invback", 0);
			this.aClass1_Sub1_Sub2_Sub3_3 = new Class1_Sub1_Sub2_Sub3(local215, "chatback", 0);
			this.aClass1_Sub1_Sub2_Sub3_2 = new Class1_Sub1_Sub2_Sub3(local215, "mapback", 0);
			this.aClass1_Sub1_Sub2_Sub3_4 = new Class1_Sub1_Sub2_Sub3(local215, "backbase1", 0);
			this.aClass1_Sub1_Sub2_Sub3_5 = new Class1_Sub1_Sub2_Sub3(local215, "backbase2", 0);
			this.aClass1_Sub1_Sub2_Sub3_6 = new Class1_Sub1_Sub2_Sub3(local215, "backhmid1", 0);
			for (local731 = 0; local731 < 13; local731++) {
				this.aClass1_Sub1_Sub2_Sub3Array2[local731] = new Class1_Sub1_Sub2_Sub3(local215, "sideicons", local731);
			}
			this.aClass1_Sub1_Sub2_Sub2_7 = new Class1_Sub1_Sub2_Sub2(local215, "compass", 0);
			this.aClass1_Sub1_Sub2_Sub2_13 = new Class1_Sub1_Sub2_Sub2(local215, "mapedge", 0);
			this.aClass1_Sub1_Sub2_Sub2_13.method388(anInt246);
			@Pc(933) int local933;
			try {
				for (local933 = 0; local933 < 100; local933++) {
					this.aClass1_Sub1_Sub2_Sub3Array3[local933] = new Class1_Sub1_Sub2_Sub3(local215, "mapscene", local933);
				}
			} catch (@Pc(951) Exception local951) {
			}
			try {
				for (local933 = 0; local933 < 100; local933++) {
					this.aClass1_Sub1_Sub2_Sub2Array4[local933] = new Class1_Sub1_Sub2_Sub2(local215, "mapfunction", local933);
				}
			} catch (@Pc(971) Exception local971) {
			}
			try {
				for (local933 = 0; local933 < 20; local933++) {
					this.aClass1_Sub1_Sub2_Sub2Array6[local933] = new Class1_Sub1_Sub2_Sub2(local215, "hitmarks", local933);
				}
			} catch (@Pc(991) Exception local991) {
			}
			try {
				for (local933 = 0; local933 < 20; local933++) {
					this.aClass1_Sub1_Sub2_Sub2Array5[local933] = new Class1_Sub1_Sub2_Sub2(local215, "headicons", local933);
				}
			} catch (@Pc(1011) Exception local1011) {
			}
			this.aClass1_Sub1_Sub2_Sub2_3 = new Class1_Sub1_Sub2_Sub2(local215, "mapmarker", 0);
			this.aClass1_Sub1_Sub2_Sub2_4 = new Class1_Sub1_Sub2_Sub2(local215, "mapmarker", 1);
			for (local933 = 0; local933 < 8; local933++) {
				this.aClass1_Sub1_Sub2_Sub2Array7[local933] = new Class1_Sub1_Sub2_Sub2(local215, "cross", local933);
			}
			this.aClass1_Sub1_Sub2_Sub2_9 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 0);
			this.aClass1_Sub1_Sub2_Sub2_10 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 1);
			this.aClass1_Sub1_Sub2_Sub2_11 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 2);
			this.aClass1_Sub1_Sub2_Sub2_12 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 3);
			this.aClass1_Sub1_Sub2_Sub3_19 = new Class1_Sub1_Sub2_Sub3(local215, "scrollbar", 0);
			this.aClass1_Sub1_Sub2_Sub3_20 = new Class1_Sub1_Sub2_Sub3(local215, "scrollbar", 1);
			this.aClass1_Sub1_Sub2_Sub3_7 = new Class1_Sub1_Sub2_Sub3(local215, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_8 = new Class1_Sub1_Sub2_Sub3(local215, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_9 = new Class1_Sub1_Sub2_Sub3(local215, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_10 = new Class1_Sub1_Sub2_Sub3(local215, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_10.method415(498);
			this.aClass1_Sub1_Sub2_Sub3_11 = new Class1_Sub1_Sub2_Sub3(local215, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_11.method415(498);
			this.aClass1_Sub1_Sub2_Sub3_14 = new Class1_Sub1_Sub2_Sub3(local215, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_14.method416();
			this.aClass1_Sub1_Sub2_Sub3_15 = new Class1_Sub1_Sub2_Sub3(local215, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_15.method416();
			this.aClass1_Sub1_Sub2_Sub3_16 = new Class1_Sub1_Sub2_Sub3(local215, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_16.method416();
			this.aClass1_Sub1_Sub2_Sub3_17 = new Class1_Sub1_Sub2_Sub3(local215, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_17.method415(498);
			this.aClass1_Sub1_Sub2_Sub3_17.method416();
			this.aClass1_Sub1_Sub2_Sub3_18 = new Class1_Sub1_Sub2_Sub3(local215, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_18.method415(498);
			this.aClass1_Sub1_Sub2_Sub3_18.method416();
			for (@Pc(1211) int local1211 = 0; local1211 < 2; local1211++) {
				this.aClass1_Sub1_Sub2_Sub3Array1[local1211] = new Class1_Sub1_Sub2_Sub3(local215, "mod_icons", local1211);
			}
			@Pc(1234) Class1_Sub1_Sub2_Sub2 local1234 = new Class1_Sub1_Sub2_Sub2(local215, "backleft1", 0);
			this.aClass35_12 = new Class35(false, this.method94(), local1234.anInt664, local1234.anInt665);
			local1234.method389(0, 0);
			@Pc(1259) Class1_Sub1_Sub2_Sub2 local1259 = new Class1_Sub1_Sub2_Sub2(local215, "backleft2", 0);
			this.aClass35_13 = new Class35(false, this.method94(), local1259.anInt664, local1259.anInt665);
			local1259.method389(0, 0);
			@Pc(1284) Class1_Sub1_Sub2_Sub2 local1284 = new Class1_Sub1_Sub2_Sub2(local215, "backright1", 0);
			this.aClass35_14 = new Class35(false, this.method94(), local1284.anInt664, local1284.anInt665);
			local1284.method389(0, 0);
			@Pc(1309) Class1_Sub1_Sub2_Sub2 local1309 = new Class1_Sub1_Sub2_Sub2(local215, "backright2", 0);
			this.aClass35_15 = new Class35(false, this.method94(), local1309.anInt664, local1309.anInt665);
			local1309.method389(0, 0);
			@Pc(1334) Class1_Sub1_Sub2_Sub2 local1334 = new Class1_Sub1_Sub2_Sub2(local215, "backtop1", 0);
			this.aClass35_16 = new Class35(false, this.method94(), local1334.anInt664, local1334.anInt665);
			local1334.method389(0, 0);
			@Pc(1359) Class1_Sub1_Sub2_Sub2 local1359 = new Class1_Sub1_Sub2_Sub2(local215, "backvmid1", 0);
			this.aClass35_17 = new Class35(false, this.method94(), local1359.anInt664, local1359.anInt665);
			local1359.method389(0, 0);
			@Pc(1384) Class1_Sub1_Sub2_Sub2 local1384 = new Class1_Sub1_Sub2_Sub2(local215, "backvmid2", 0);
			this.aClass35_18 = new Class35(false, this.method94(), local1384.anInt664, local1384.anInt665);
			local1384.method389(0, 0);
			@Pc(1409) Class1_Sub1_Sub2_Sub2 local1409 = new Class1_Sub1_Sub2_Sub2(local215, "backvmid3", 0);
			this.aClass35_19 = new Class35(false, this.method94(), local1409.anInt664, local1409.anInt665);
			local1409.method389(0, 0);
			@Pc(1434) Class1_Sub1_Sub2_Sub2 local1434 = new Class1_Sub1_Sub2_Sub2(local215, "backhmid2", 0);
			this.aClass35_20 = new Class35(false, this.method94(), local1434.anInt664, local1434.anInt665);
			local1434.method389(0, 0);
			@Pc(1459) int local1459 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1466) int local1466 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1473) int local1473 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1480) int local1480 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1482) int local1482 = 0; local1482 < 100; local1482++) {
				if (this.aClass1_Sub1_Sub2_Sub2Array4[local1482] != null) {
					this.aClass1_Sub1_Sub2_Sub2Array4[local1482].method387(local1466 + local1480, local1459 + local1480, local1473 + local1480);
				}
				if (this.aClass1_Sub1_Sub2_Sub3Array3[local1482] != null) {
					this.aClass1_Sub1_Sub2_Sub3Array3[local1482].method417(local1466 + local1480, local1459 + local1480, local1473 + local1480);
				}
			}
			this.method96("Unpacking textures", 83);
			Class1_Sub1_Sub2_Sub1.method347(local227);
			Class1_Sub1_Sub2_Sub1.method351(0.8D);
			Class1_Sub1_Sub2_Sub1.method346();
			this.method96("Unpacking config", 86);
			Class27.method505(local191);
			Class9.method286(local191);
			Class21.method462(local191);
			Class15.method359(local191);
			Class13.method321(local191);
			Class23.method496(local191);
			Class33.method521(local191);
			Class39.method589(local191);
			Class36.method527(local191);
			Class15.aBoolean160 = aBoolean55;
			if (!aBoolean56) {
				this.method96("Unpacking sounds", 90);
				@Pc(1585) byte[] local1585 = local251.method666("sounds.dat", null);
				@Pc(1591) Class1_Sub1_Sub3 local1591 = new Class1_Sub1_Sub3(anInt417, local1585);
				Class5.method78(local1591);
			}
			this.method96("Unpacking interfaces", 95);
			@Pc(1622) Class1_Sub1_Sub2_Sub4[] local1622 = new Class1_Sub1_Sub2_Sub4[] { this.aClass1_Sub1_Sub2_Sub4_1, this.aClass1_Sub1_Sub2_Sub4_2, this.aClass1_Sub1_Sub2_Sub4_3, this.aClass1_Sub1_Sub2_Sub4_4 };
			Class6.method231(local215, local1622, local203);
			this.method96("Preparing game engine", 100);
			@Pc(1638) int local1638;
			@Pc(1640) int local1640;
			@Pc(1642) int local1642;
			for (@Pc(1634) int local1634 = 0; local1634 < 33; local1634++) {
				local1638 = 999;
				local1640 = 0;
				for (local1642 = 0; local1642 < 34; local1642++) {
					if (this.aClass1_Sub1_Sub2_Sub3_2.aByteArray7[local1642 + local1634 * this.aClass1_Sub1_Sub2_Sub3_2.anInt688] == 0) {
						if (local1638 == 999) {
							local1638 = local1642;
						}
					} else if (local1638 != 999) {
						local1640 = local1642;
						break;
					}
				}
				this.anIntArray78[local1634] = local1638;
				this.anIntArray71[local1634] = local1640 - local1638;
			}
			@Pc(1700) int local1700;
			for (local1638 = 5; local1638 < 156; local1638++) {
				local1640 = 999;
				local1642 = 0;
				for (local1700 = 25; local1700 < 172; local1700++) {
					if (this.aClass1_Sub1_Sub2_Sub3_2.aByteArray7[local1700 + local1638 * this.aClass1_Sub1_Sub2_Sub3_2.anInt688] == 0 && (local1700 > 34 || local1638 > 34)) {
						if (local1640 == 999) {
							local1640 = local1700;
						}
					} else if (local1640 != 999) {
						local1642 = local1700;
						break;
					}
				}
				this.anIntArray34[local1638 - 5] = local1640 - 25;
				this.anIntArray75[local1638 - 5] = local1642 - local1640;
			}
			Class1_Sub1_Sub2_Sub1.method344(96, (byte) 7, 479);
			this.anIntArray79 = Class1_Sub1_Sub2_Sub1.anIntArray180;
			Class1_Sub1_Sub2_Sub1.method344(261, (byte) 7, 190);
			this.anIntArray80 = Class1_Sub1_Sub2_Sub1.anIntArray180;
			Class1_Sub1_Sub2_Sub1.method344(334, (byte) 7, 512);
			this.anIntArray81 = Class1_Sub1_Sub2_Sub1.anIntArray180;
			@Pc(1784) int[] local1784 = new int[9];
			for (local1642 = 0; local1642 < 9; local1642++) {
				local1700 = local1642 * 32 + 128 + 15;
				@Pc(1802) int local1802 = local1700 * 3 + 600;
				@Pc(1806) int local1806 = Class1_Sub1_Sub2_Sub1.anIntArray178[local1700];
				local1784[local1642] = local1802 * local1806 >> 16;
			}
			Class37.method566(local1784);
			Class42.method594(local239);
			this.aClass11_1 = new Class11(0, this);
			this.method95(this.aClass11_1, 10);
			Class1_Sub1_Sub1_Sub2.aClient1 = this;
			Class9.aClient2 = this;
			Class13.aClient4 = this;
		} catch (@Pc(1847) Exception local1847) {
			signlink.reporterror("loaderror " + this.aString13 + " " + this.anInt301);
			this.aBoolean57 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method226(@OriginalArg(0) byte arg0) {
		try {
			if (this.anInt290 >= 2 || this.anInt409 != 0 || this.anInt269 != 0) {
				@Pc(31) String local31;
				if (this.anInt409 == 1 && this.anInt290 < 2) {
					local31 = "Use " + this.aString16 + " with...";
				} else if (this.anInt269 == 1 && this.anInt290 < 2) {
					local31 = this.aString5 + "...";
				} else {
					local31 = this.aStringArray3[this.anInt290 - 1];
				}
				if (this.anInt290 > 2) {
					local31 = local31 + "@whi@ / " + (this.anInt290 - 2) + " more options";
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method456(anInt248 / 1000, 82, 15, 16777215, local31, 4);
				@Pc(98) boolean local98 = false;
			}
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("91506, " + arg0 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!gc;II)V")
	private void method227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class13 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (this.anInt290 < 400) {
				if (arg2.anIntArray174 != null) {
					arg2 = arg2.method327();
				}
				if (arg2 != null) {
					@Pc(19) String local19 = arg2.aString24;
					if (arg0 != -44650) {
						this.aClass1_Sub1_Sub3_3.method470(210);
					}
					if (arg2.anInt577 != 0) {
						local19 = local19 + method119(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt136, arg2.anInt577) + " (level-" + arg2.anInt577 + ")";
					}
					if (this.anInt409 == 1) {
						this.aStringArray3[this.anInt290] = "Use " + this.aString16 + " with @yel@" + local19;
						this.anIntArray37[this.anInt290] = 829;
						this.anIntArray38[this.anInt290] = arg4;
						this.anIntArray35[this.anInt290] = arg3;
						this.anIntArray36[this.anInt290] = arg1;
						this.anInt290++;
					} else if (this.anInt269 != 1) {
						@Pc(164) int local164;
						if (arg2.aStringArray9 != null) {
							for (local164 = 4; local164 >= 0; local164--) {
								if (arg2.aStringArray9[local164] != null && !arg2.aStringArray9[local164].equalsIgnoreCase("attack")) {
									this.aStringArray3[this.anInt290] = arg2.aStringArray9[local164] + " @yel@" + local19;
									if (local164 == 0) {
										this.anIntArray37[this.anInt290] = 242;
									}
									if (local164 == 1) {
										this.anIntArray37[this.anInt290] = 209;
									}
									if (local164 == 2) {
										this.anIntArray37[this.anInt290] = 309;
									}
									if (local164 == 3) {
										this.anIntArray37[this.anInt290] = 852;
									}
									if (local164 == 4) {
										this.anIntArray37[this.anInt290] = 793;
									}
									this.anIntArray38[this.anInt290] = arg4;
									this.anIntArray35[this.anInt290] = arg3;
									this.anIntArray36[this.anInt290] = arg1;
									this.anInt290++;
								}
							}
						}
						if (arg2.aStringArray9 != null) {
							for (local164 = 4; local164 >= 0; local164--) {
								if (arg2.aStringArray9[local164] != null && arg2.aStringArray9[local164].equalsIgnoreCase("attack")) {
									@Pc(288) short local288 = 0;
									if (arg2.anInt577 > aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt136) {
										local288 = 2000;
									}
									this.aStringArray3[this.anInt290] = arg2.aStringArray9[local164] + " @yel@" + local19;
									if (local164 == 0) {
										this.anIntArray37[this.anInt290] = local288 + 242;
									}
									if (local164 == 1) {
										this.anIntArray37[this.anInt290] = local288 + 209;
									}
									if (local164 == 2) {
										this.anIntArray37[this.anInt290] = local288 + 309;
									}
									if (local164 == 3) {
										this.anIntArray37[this.anInt290] = local288 + 852;
									}
									if (local164 == 4) {
										this.anIntArray37[this.anInt290] = local288 + 793;
									}
									this.anIntArray38[this.anInt290] = arg4;
									this.anIntArray35[this.anInt290] = arg3;
									this.anIntArray36[this.anInt290] = arg1;
									this.anInt290++;
								}
							}
						}
						this.aStringArray3[this.anInt290] = "Examine @yel@" + local19;
						this.anIntArray37[this.anInt290] = 1714;
						this.anIntArray38[this.anInt290] = arg4;
						this.anIntArray35[this.anInt290] = arg3;
						this.anIntArray36[this.anInt290] = arg1;
						this.anInt290++;
					} else if ((this.anInt271 & 0x2) == 2) {
						this.aStringArray3[this.anInt290] = this.aString5 + " @yel@" + local19;
						this.anIntArray37[this.anInt290] = 240;
						this.anIntArray38[this.anInt290] = arg4;
						this.anIntArray35[this.anInt290] = arg3;
						this.anIntArray36[this.anInt290] = arg1;
						this.anInt290++;
						return;
					}
				}
			}
		} catch (@Pc(438) RuntimeException local438) {
			signlink.reporterror("44384, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local438.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method228(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != -90) {
				this.aClass1_Sub1_Sub3_3.method470(222);
			}
			this.aBoolean72 = true;
			try {
				@Pc(11) long local11 = System.currentTimeMillis();
				@Pc(13) int local13 = 0;
				@Pc(15) int local15 = 20;
				while (this.aBoolean79) {
					this.anInt394++;
					this.method102(75);
					this.method102(75);
					this.method128();
					local13++;
					if (local13 > 10) {
						@Pc(38) long local38 = System.currentTimeMillis();
						@Pc(47) int local47 = (int) (local38 - local11) / 10 - local15;
						local15 = 40 - local47;
						if (local15 < 5) {
							local15 = 5;
						}
						local13 = 0;
						local11 = local38;
					}
					try {
						Thread.sleep((long) local15);
					} catch (@Pc(65) Exception local65) {
					}
				}
			} catch (@Pc(71) Exception local71) {
			}
			this.aBoolean72 = false;
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("86382, " + arg0 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(JZ)V")
	private void method229(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (arg0 != 0L) {
				if (this.anInt407 >= 100) {
					this.method204("", 0, "Your ignore list is full. Max of 100 hit");
				} else {
					@Pc(24) String local24 = Class48.method671(Class48.method668(this.anInt419, arg0));
					for (@Pc(26) int local26 = 0; local26 < this.anInt407; local26++) {
						if (this.aLongArray3[local26] == arg0) {
							this.method204("", 0, local24 + " is already on your ignore list");
							return;
						}
					}
					for (@Pc(56) int local56 = 0; local56 < this.anInt231; local56++) {
						if (this.aLongArray4[local56] == arg0) {
							this.method204("", 0, "Please remove " + local24 + " from your friend list first");
							return;
						}
					}
					this.aLongArray3[this.anInt407++] = arg0;
					this.aBoolean85 = true;
					this.aClass1_Sub1_Sub3_3.method469(32);
					if (arg1) {
						anInt246 = this.aClass46_1.method662();
					}
					this.aClass1_Sub1_Sub3_3.method476(arg0, aBoolean90);
				}
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("3631, " + arg0 + ", " + arg1 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "R", descriptor = "(I)V")
	private void method230(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) int local2 = this.anInt237;
			@Pc(5) int local5 = this.anInt238;
			@Pc(8) int local8 = this.anInt239;
			@Pc(11) int local11 = this.anInt240;
			Class1_Sub1_Sub2.method439(local2, local8, 6116423, local11, local5);
			Class1_Sub1_Sub2.method439(local2 + 1, local8 - 2, 0, 16, local5 + 1);
			Class1_Sub1_Sub2.method440(local8 - 2, local11 - 19, local2 + 1, local5 + 18, 0);
			this.aClass1_Sub1_Sub2_Sub4_3.method451("Choose Option", 6116423, local2 + 3, local5 + 14);
			@Pc(64) boolean local64 = false;
			@Pc(67) int local67 = super.anInt205;
			@Pc(70) int local70 = super.anInt206;
			if (this.anInt236 == 0) {
				local67 -= 4;
				local70 -= 4;
			}
			if (this.anInt236 == 1) {
				local67 -= 553;
				local70 -= 205;
			}
			if (this.anInt236 == 2) {
				local67 -= 17;
				local70 -= 357;
			}
			for (@Pc(89) int local89 = 0; local89 < this.anInt290; local89++) {
				@Pc(104) int local104 = local5 + (this.anInt290 - 1 - local89) * 15 + 31;
				@Pc(106) int local106 = 16777215;
				if (local67 > local2 && local67 < local2 + local8 && local70 > local104 - 13 && local70 < local104 + 3) {
					local106 = 16776960;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method455(local104, true, local2 + 3, local106, this.aStringArray3[local89]);
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("30822, " + arg0 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}
}
