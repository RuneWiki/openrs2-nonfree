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

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "Lclient!bb;")
	public static Class1_Sub1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private static int anInt260;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "I")
	public static int anInt262;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "Z")
	private static boolean aBoolean48;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "I")
	private static int anInt281;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
	private static int anInt282;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
	private static int anInt287;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
	private static int anInt310;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
	private static int anInt311;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "I")
	private static int anInt318;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "Z")
	private static boolean aBoolean66;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
	private static int anInt342;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
	private static int anInt343;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
	private static int anInt373;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
	private static int anInt388;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "I")
	private static int anInt395;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
	private static int anInt424;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
	public static int anInt426;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
	private static int anInt430;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
	private static int anInt431;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "I")
	private static int anInt442;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "Z")
	private static boolean aBoolean84;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "I")
	private static int anInt452;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
	private static int anInt261 = 10;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "Z")
	private static boolean aBoolean47 = true;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "Ljava/lang/String;")
	private static String aString6 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "[I")
	public static final int[] anIntArray49 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "Z")
	private static boolean aBoolean56 = true;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
	private static int anInt312 = -62;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
	private static int anInt347 = 678;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "[I")
	private static int[] anIntArray72 = new int[32];

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "[I")
	private static int[] anIntArray73;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "[[I")
	public static final int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "I")
	private static int anInt428;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "I")
	private int anInt242;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "I")
	private int anInt243;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
	private int anInt244;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "I")
	private int anInt245;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "Ljava/lang/String;")
	private String aString5;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "I")
	private int anInt246;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	private int anInt247;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	private int anInt249;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	private int anInt250;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	private int anInt251;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
	private int anInt252;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	private int anInt253;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
	private int anInt254;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
	private int anInt255;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
	private int anInt256;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
	private int anInt257;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	private int anInt258;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_1;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_2;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
	private int anInt259;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private int anInt265;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "I")
	private int anInt267;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
	private int anInt268;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "I")
	private int anInt269;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "[I")
	private int[] anIntArray47;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "[I")
	private int[] anIntArray48;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
	private int anInt271;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "I")
	private int anInt272;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "I")
	private int anInt273;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "I")
	private int anInt274;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "I")
	private int anInt275;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
	private int anInt276;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
	private int anInt278;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
	private int anInt279;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_6;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_7;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_8;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
	private int anInt284;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
	private int anInt285;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
	private int anInt286;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_9;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_10;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_11;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
	private int anInt290;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
	private int anInt291;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
	private int anInt292;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
	private int anInt293;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
	private int anInt294;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
	private int anInt295;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "I")
	private int anInt296;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
	private int anInt297;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "I")
	private int anInt298;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "I")
	private int anInt299;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "I")
	private int anInt300;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
	private int anInt301;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
	private int anInt303;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
	private int anInt304;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "I")
	private int anInt306;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "Lclient!s;")
	private Class39 aClass39_1;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
	private int anInt307;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
	private int anInt308;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
	private int anInt313;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
	private int anInt314;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_1;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_2;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "I")
	private int anInt315;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "I")
	private int anInt317;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_12;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_13;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
	private int anInt319;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
	private int anInt320;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
	private int anInt321;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
	private int anInt322;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "I")
	private int anInt323;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
	private int anInt324;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "I")
	private int anInt325;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "I")
	private int anInt326;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
	private int anInt327;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "Lclient!yb;")
	private Class48 aClass48_1;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "I")
	private int anInt328;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
	private int anInt329;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "I")
	private int anInt330;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
	private int anInt333;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "I")
	private int anInt334;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "I")
	private int anInt335;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
	private int anInt336;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
	private int anInt337;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
	private int anInt338;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "Ljava/lang/String;")
	private String aString7;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_14;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_15;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
	private int anInt339;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_16;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_17;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_18;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_19;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_20;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
	private int anInt340;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "J")
	private long aLong16;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
	private int anInt345;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "Lclient!vb;")
	private Class45_Sub1 aClass45_Sub1_1;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private int anInt348;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "I")
	private int anInt349;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "I")
	private int anInt350;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
	private int anInt351;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
	private int anInt352;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "I")
	private int anInt353;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "[[B")
	private byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
	private int anInt355;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_6;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "I")
	private int anInt358;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "I")
	private int anInt360;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
	private int anInt362;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
	private int anInt363;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "I")
	private int anInt364;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private int anInt366;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
	private int anInt368;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "Lclient!xb;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "I")
	private int anInt370;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "I")
	private int anInt371;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "I")
	private int anInt372;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "[I")
	private int[] anIntArray68;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "[I")
	private int[] anIntArray69;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "Ljava/lang/String;")
	private String aString13;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
	private int anInt374;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "I")
	private int anInt375;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
	private int anInt376;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "I")
	private int anInt377;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
	private int anInt378;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "I")
	private int anInt379;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
	private int anInt380;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "Lclient!rb;")
	private Class37 aClass37_3;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "Lclient!rb;")
	private Class37 aClass37_4;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "Lclient!rb;")
	private Class37 aClass37_5;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "Lclient!rb;")
	private Class37 aClass37_6;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
	private int anInt381;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "I")
	private int anInt382;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
	private int anInt383;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "I")
	private int anInt384;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "I")
	private int anInt385;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "I")
	private int anInt386;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
	private int anInt387;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private int anInt389;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
	private int anInt390;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
	private int anInt391;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
	private int anInt392;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "[I")
	private int[] anIntArray77;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "[I")
	private int[] anIntArray78;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "[I")
	private int[] anIntArray79;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
	private int anInt394;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "J")
	private long aLong17;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_7;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_8;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "I")
	private int anInt398;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
	private int anInt400;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "I")
	private int anInt401;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "I")
	private int anInt402;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "Lclient!rb;")
	private Class37 aClass37_7;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "Lclient!rb;")
	private Class37 aClass37_8;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "Lclient!rb;")
	private Class37 aClass37_9;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
	private int anInt406;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
	private int anInt407;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
	private int anInt408;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "Lclient!rb;")
	private Class37 aClass37_10;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "Lclient!rb;")
	private Class37 aClass37_11;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "Lclient!rb;")
	private Class37 aClass37_12;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "Lclient!rb;")
	private Class37 aClass37_13;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "Lclient!rb;")
	private Class37 aClass37_14;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "Lclient!rb;")
	private Class37 aClass37_15;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "Lclient!rb;")
	private Class37 aClass37_16;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "Lclient!rb;")
	private Class37 aClass37_17;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "Lclient!rb;")
	private Class37 aClass37_18;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
	private int anInt410;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
	private int anInt411;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "Lclient!rb;")
	private Class37 aClass37_19;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "Lclient!rb;")
	private Class37 aClass37_20;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "Lclient!rb;")
	private Class37 aClass37_21;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "Lclient!rb;")
	private Class37 aClass37_22;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "Lclient!rb;")
	private Class37 aClass37_23;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "Lclient!rb;")
	private Class37 aClass37_24;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "Lclient!rb;")
	private Class37 aClass37_25;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "Lclient!rb;")
	private Class37 aClass37_26;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "Lclient!rb;")
	private Class37 aClass37_27;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
	private int anInt414;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_9;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_10;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_11;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_12;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
	private int anInt416;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
	private int anInt417;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
	private int anInt418;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
	private int anInt419;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "I")
	private int anInt420;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "I")
	private int anInt421;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
	private int anInt422;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
	private int anInt425;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_13;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "I")
	private int anInt434;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "I")
	private int anInt435;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "I")
	private int anInt436;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "I")
	private int anInt437;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "Lclient!e;")
	private Class8 aClass8_1;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "I")
	private int anInt438;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
	private int anInt439;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
	private int anInt440;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "[I")
	private int[] anIntArray87;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "[I")
	private int[] anIntArray88;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "[I")
	private int[] anIntArray89;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private int anInt441;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "I")
	private int anInt443;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "I")
	private int anInt444;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "[Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array3;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
	private int anInt445;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "I")
	private int anInt446;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "Ljava/lang/String;")
	private String aString18;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "[I")
	private int[] anIntArray91;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "[I")
	private int[] anIntArray92;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "[I")
	private int[] anIntArray93;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "[I")
	private int[] anIntArray94;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "Lclient!fc;")
	private Class11 aClass11_1;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "I")
	private int anInt451;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "[I")
	private int[] anIntArray34 = new int[50];

	@OriginalMember(owner = "client!client", name = "M", descriptor = "I")
	private int anInt241 = -36217;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "Z")
	private boolean aBoolean43 = false;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "Z")
	private boolean aBoolean44 = false;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array3 = new Class1_Sub1_Sub2_Sub2[1000];

	@OriginalMember(owner = "client!client", name = "W", descriptor = "[I")
	private int[] anIntArray35 = new int[500];

	@OriginalMember(owner = "client!client", name = "X", descriptor = "[I")
	private int[] anIntArray36 = new int[500];

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "[I")
	private int[] anIntArray37 = new int[500];

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "[I")
	private int[] anIntArray38 = new int[500];

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "[I")
	private int[] anIntArray39 = new int[1000];

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "[I")
	private int[] anIntArray40 = new int[1000];

	@OriginalMember(owner = "client!client", name = "db", descriptor = "B")
	private byte aByte11 = 4;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "[I")
	private int[] anIntArray41 = new int[2000];

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
	private int anInt248 = 256;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Z")
	private boolean aBoolean45 = false;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "[Lclient!ab;")
	private Class1_Sub1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1_Sub1Array1 = new Class1_Sub1_Sub1_Sub1_Sub1[16384];

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "[I")
	private int[] anIntArray42 = new int[16384];

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "[Lclient!wb;")
	public Class46[] aClass46Array1 = new Class46[5];

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "[Lclient!jc;")
	private Class19[] aClass19Array1 = new Class19[4];

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "B")
	private byte aByte12 = -65;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "Z")
	public boolean aBoolean46 = false;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "Z")
	private boolean aBoolean49 = false;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "[I")
	private int[] anIntArray43 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "[I")
	private int[] anIntArray44 = new int[100];

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray1 = new String[100];

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray2 = new String[100];

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private int anInt263 = 3;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
	private final int anInt264 = 100;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "[I")
	private int[] anIntArray45 = new int[100];

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "I")
	private int anInt266 = 128;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray3 = new String[200];

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "Z")
	private boolean aBoolean50 = true;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "Lclient!mb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_2 = Class1_Sub1_Sub3.method485();

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "[I")
	private int[] anIntArray46 = new int[5];

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
	private int anInt277 = 2;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "Z")
	private boolean aBoolean51 = false;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "I")
	private int anInt280 = 2;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "Z")
	private boolean aBoolean52 = false;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "Z")
	private boolean aBoolean53 = true;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "[I")
	private int[] anIntArray50 = new int[256];

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "Z")
	private boolean aBoolean54 = true;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
	private int anInt283 = -1;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray4 = new String[500];

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "I")
	private int anInt288 = -1;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
	private int anInt289 = -1;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "[I")
	private int[] anIntArray51 = new int[50];

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "[I")
	private int[] anIntArray52 = new int[5];

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "B")
	private byte aByte13 = 7;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "Z")
	private boolean aBoolean55 = true;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
	private int anInt302 = 110;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "Lclient!mb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_3 = Class1_Sub1_Sub3.method485();

	@OriginalMember(owner = "client!client", name = "md", descriptor = "I")
	private int anInt305 = 2;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "[I")
	private int[] anIntArray53 = new int[7];

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "I")
	private int anInt309 = 50;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "[I")
	private int[] anIntArray54 = new int[this.anInt309];

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "[I")
	private int[] anIntArray55 = new int[this.anInt309];

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "[I")
	private int[] anIntArray56 = new int[this.anInt309];

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "[I")
	private int[] anIntArray57 = new int[this.anInt309];

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "[I")
	private int[] anIntArray58 = new int[this.anInt309];

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "[I")
	private int[] anIntArray59 = new int[this.anInt309];

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "[I")
	private int[] anIntArray60 = new int[this.anInt309];

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray5 = new String[this.anInt309];

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "[I")
	private int[] anIntArray61 = new int[50];

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "I")
	private int anInt316 = 1;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "Z")
	private boolean aBoolean57 = true;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "Z")
	private boolean aBoolean58 = false;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array4 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "[[I")
	private int[][] anIntArrayArray2 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "Z")
	private boolean aBoolean59 = false;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "Z")
	private boolean aBoolean61 = false;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "Z")
	private boolean aBoolean62 = false;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
	private int anInt331 = 2048;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private int anInt332 = 2047;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "[Lclient!bb;")
	private Class1_Sub1_Sub1_Sub1_Sub2[] aClass1_Sub1_Sub1_Sub1_Sub2Array1 = new Class1_Sub1_Sub1_Sub1_Sub2[this.anInt331];

	@OriginalMember(owner = "client!client", name = "re", descriptor = "[I")
	private int[] anIntArray62 = new int[this.anInt331];

	@OriginalMember(owner = "client!client", name = "te", descriptor = "[I")
	private int[] anIntArray63 = new int[this.anInt331];

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "[Lclient!mb;")
	private Class1_Sub1_Sub3[] aClass1_Sub1_Sub3Array1 = new Class1_Sub1_Sub3[this.anInt331];

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "Z")
	private boolean aBoolean63 = false;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "Z")
	private boolean aBoolean64 = false;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "B")
	private byte aByte14 = 7;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "Z")
	private boolean aBoolean65 = false;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "[[I")
	private int[][] anIntArrayArray3 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
	private int anInt341 = 2;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "[[[Lclient!pb;")
	private Class31[][][] aClass31ArrayArrayArray1 = new Class31[4][104][104];

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "Z")
	private boolean aBoolean68 = false;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "Z")
	private boolean aBoolean69 = false;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "I")
	private int anInt344 = -1;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "[I")
	private int[] anIntArray64 = new int[5];

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
	private int anInt346 = 8;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "Ljava/lang/String;")
	private String aString8 = "";

	@OriginalMember(owner = "client!client", name = "df", descriptor = "Ljava/lang/String;")
	private String aString9 = "";

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "[I")
	private int[] anIntArray65 = new int[Class29.anInt834];

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "Z")
	private boolean aBoolean70 = false;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "Lclient!pb;")
	private Class31 aClass31_1 = new Class31(false);

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "[I")
	private int[] anIntArray66 = new int[33];

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "Z")
	private boolean aBoolean71 = false;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "Ljava/lang/String;")
	private String aString10 = "";

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "Ljava/lang/String;")
	private String aString11 = "";

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "Z")
	private boolean aBoolean72 = false;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
	private int anInt354 = -102;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "Z")
	private boolean aBoolean73 = false;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "Z")
	private boolean aBoolean74 = false;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "I")
	private int anInt356 = -1;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "I")
	private int anInt357 = 256;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "Ljava/lang/String;")
	private String aString12 = "";

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
	private int anInt359 = 1;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "Z")
	private boolean aBoolean75 = false;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
	private int anInt361 = 9;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "Lclient!pb;")
	private Class31 aClass31_2 = new Class31(false);

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "[I")
	private int[] anIntArray67 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
	private int anInt365 = 2301979;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
	private int anInt367 = 3353893;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
	private int anInt369 = -21513;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "[Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array1 = new Class1_Sub1_Sub2_Sub3[13];

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "[I")
	private int[] anIntArray70 = new int[Class29.anInt834];

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "[I")
	private int[] anIntArray71 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "[Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array2 = new Class1_Sub1_Sub2_Sub3[50];

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "Lclient!d;")
	private Class6 aClass6_1 = new Class6();

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "Z")
	private boolean aBoolean76 = false;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "Z")
	private boolean aBoolean77 = true;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "[I")
	private int[] anIntArray74 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "[I")
	private int[] anIntArray75 = new int[151];

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "[I")
	private final int[] anIntArray76 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "Z")
	private boolean aBoolean78 = false;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
	private int anInt393 = 78;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
	private int anInt396 = 7759444;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "[I")
	private int[] anIntArray80 = new int[5];

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "I")
	private int anInt397 = 581;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "[I")
	private int[] anIntArray81 = new int[5];

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "[J")
	private long[] aLongArray4 = new long[200];

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "I")
	private int anInt399 = -1;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "Z")
	private boolean aBoolean79 = false;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "[I")
	private int[] anIntArray82 = new int[4000];

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "[I")
	private int[] anIntArray83 = new int[4000];

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "I")
	private int anInt403 = 2;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "I")
	private int anInt404 = -13;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "I")
	private int anInt405 = 3;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "I")
	private int anInt409 = -1;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "Lclient!mb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_4 = Class1_Sub1_Sub3.method485();

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "[I")
	private int[] anIntArray84 = new int[200];

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "Ljava/lang/String;")
	private String aString14 = "";

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "I")
	private int anInt412 = 2;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
	private int anInt413 = -1;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array5 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
	private int anInt415 = -1;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "[I")
	private int[] anIntArray85 = new int[Class29.anInt834];

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "Ljava/lang/String;")
	private String aString15 = "";

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "Ljava/lang/String;")
	private String aString16 = "";

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
	private int anInt423 = 5063219;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "[[I")
	private int[][] anIntArrayArray5 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "si", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
	private int anInt427 = -523;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
	private int anInt429 = -1;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "[I")
	private int[] anIntArray86 = new int[33];

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "I")
	private int anInt432 = -1;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
	private int anInt433 = -22996;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array6 = new Class1_Sub1_Sub2_Sub2[50];

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray6 = new String[5];

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "[Z")
	private boolean[] aBooleanArray4 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "Z")
	private boolean aBoolean81 = false;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "Z")
	private boolean aBoolean82 = true;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "Z")
	private boolean aBoolean83 = false;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "Z")
	private boolean aBoolean85 = false;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array7 = new Class1_Sub1_Sub2_Sub2[8];

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "Z")
	private boolean aBoolean86 = false;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "Z")
	private boolean aBoolean87 = false;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "Z")
	private boolean aBoolean88 = false;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "B")
	private byte aByte15 = -59;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "[Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array4 = new Class1_Sub1_Sub2_Sub3[2];

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "I")
	private int anInt447 = -1;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "I")
	private int anInt448 = -1;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "[B")
	private byte[] aByteArray2 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "Lclient!pb;")
	private Class31 aClass31_3 = new Class31(false);

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "[I")
	private int[] anIntArray90 = new int[9];

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
	private int anInt449 = -1;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "Z")
	private boolean aBoolean89 = false;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "I")
	private int anInt450 = -32176;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "[I")
	private int[] anIntArray95 = new int[151];

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "[Z")
	private boolean[] aBooleanArray5 = new boolean[5];

	static {
		@Pc(88) int local88 = 2;
		@Pc(90) int local90;
		for (local90 = 0; local90 < 32; local90++) {
			anIntArray72[local90] = local88 - 1;
			local88 += local88;
		}
		anIntArray73 = new int[99];
		local88 = 0;
		for (local90 = 0; local90 < 99; local90++) {
			@Pc(117) int local117 = local90 + 1;
			@Pc(130) int local130 = (int) ((double) local117 + Math.pow(2.0D, (double) local117 / 7.0D) * 300.0D);
			local88 += local130;
			anIntArray73[local90] = local88 / 4;
		}
		aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		anIntArrayArray4 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		anInt428 = 623;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(III)Ljava/lang/String;")
	private static String method117(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(16) int local16 = arg1 - arg0;
			if (local16 < -9) {
				return "@red@";
			} else if (local16 < -6) {
				return "@or3@";
			} else if (local16 < -3) {
				return "@or2@";
			} else if (local16 < 0) {
				return "@or1@";
			} else if (local16 > 9) {
				return "@gre@";
			} else if (local16 > 6) {
				return "@gr3@";
			} else if (local16 > 3) {
				return "@gr2@";
			} else if (local16 > 0) {
				return "@gr1@";
			} else {
				return "@yel@";
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("10567, " + -283 + ", " + arg0 + ", " + arg1 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Ljava/lang/String;")
	private static String method135(@OriginalArg(0) int arg0) {
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
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("127, " + arg0 + ", " + 2 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 254);
			if (arg0.length == 5) {
				anInt261 = Integer.parseInt(arg0[0]);
				anInt262 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method227();
				} else if (arg0[2].equals("highmem")) {
					method210();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean47 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean47 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt930 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method85();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private static void method210() {
		try {
			Class39.aBoolean224 = false;
			Class1_Sub1_Sub2_Sub1.aBoolean158 = false;
			aBoolean48 = false;
			Class4.aBoolean33 = false;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("36030, " + -22 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)Ljava/lang/String;")
	private static String method211(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("7277, " + 0 + ", " + arg0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
	private static void method227() {
		try {
			Class39.aBoolean224 = true;
			Class1_Sub1_Sub2_Sub1.aBoolean158 = true;
			aBoolean48 = true;
			Class4.aBoolean33 = true;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("93008, " + -106 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)Z")
	private boolean method98(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			return signlink.wavereplay();
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("29149, " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	private String method99(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean46 &= true;
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("98385, " + arg0 + ", " + true + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method100(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 >= 0) {
				if (this.aBoolean85) {
					this.aBoolean85 = false;
					this.aBoolean79 = true;
				}
				@Pc(18) int local18 = this.anIntArray35[arg1];
				@Pc(23) int local23 = this.anIntArray36[arg1];
				@Pc(28) int local28 = this.anIntArray37[arg1];
				@Pc(33) int local33 = this.anIntArray38[arg1];
				if (this.aByte14 == 7) {
					@Pc(39) boolean local39 = false;
				} else {
					this.aBoolean74 = !this.aBoolean74;
				}
				if (local28 >= 2000) {
					local28 -= 2000;
				}
				if (local28 == 737) {
					this.method109();
				}
				if (local28 == 563) {
					this.aClass1_Sub1_Sub3_4.method487(102);
					this.aClass1_Sub1_Sub3_4.method489(local33);
					this.aClass1_Sub1_Sub3_4.method489(local18);
					this.aClass1_Sub1_Sub3_4.method489(local23);
					this.aClass1_Sub1_Sub3_4.method489(this.anInt337);
					this.anInt255 = 0;
					this.anInt256 = local23;
					this.anInt257 = local18;
					this.anInt258 = 2;
					if (Class6.aClass6Array1[local23].anInt457 == this.anInt399) {
						this.anInt258 = 1;
					}
					if (Class6.aClass6Array1[local23].anInt457 == this.anInt413) {
						this.anInt258 = 3;
					}
				}
				if (local28 == 694 || local28 == 962 || local28 == 795 || local28 == 681 || local28 == 100) {
					if (local28 == 681) {
						anInt442++;
						if (anInt442 >= 116) {
							this.aClass1_Sub1_Sub3_4.method487(162);
							this.aClass1_Sub1_Sub3_4.method491(13018169);
						}
						this.aClass1_Sub1_Sub3_4.method487(163);
					}
					if (local28 == 962) {
						this.aClass1_Sub1_Sub3_4.method487(228);
					}
					if (local28 == 694) {
						this.aClass1_Sub1_Sub3_4.method487(243);
					}
					if (local28 == 100) {
						this.aClass1_Sub1_Sub3_4.method487(74);
					}
					if (local28 == 795) {
						this.aClass1_Sub1_Sub3_4.method487(80);
					}
					this.aClass1_Sub1_Sub3_4.method489(local33);
					this.aClass1_Sub1_Sub3_4.method489(local18);
					this.aClass1_Sub1_Sub3_4.method489(local23);
					this.anInt255 = 0;
					this.anInt256 = local23;
					this.anInt257 = local18;
					this.anInt258 = 2;
					if (Class6.aClass6Array1[local23].anInt457 == this.anInt399) {
						this.anInt258 = 1;
					}
					if (Class6.aClass6Array1[local23].anInt457 == this.anInt413) {
						this.anInt258 = 3;
					}
				}
				if (local28 == 398) {
					this.aClass1_Sub1_Sub3_4.method487(200);
					this.aClass1_Sub1_Sub3_4.method489(local33);
					this.aClass1_Sub1_Sub3_4.method489(local18);
					this.aClass1_Sub1_Sub3_4.method489(local23);
					this.aClass1_Sub1_Sub3_4.method489(this.anInt245);
					this.aClass1_Sub1_Sub3_4.method489(this.anInt243);
					this.aClass1_Sub1_Sub3_4.method489(this.anInt244);
					this.anInt255 = 0;
					this.anInt256 = local23;
					this.anInt257 = local18;
					this.anInt258 = 2;
					if (Class6.aClass6Array1[local23].anInt457 == this.anInt399) {
						this.anInt258 = 1;
					}
					if (Class6.aClass6Array1[local23].anInt457 == this.anInt413) {
						this.anInt258 = 3;
					}
				}
				@Pc(305) Class6 local305;
				if (local28 == 231) {
					local305 = Class6.aClass6Array1[local23];
					@Pc(307) boolean local307 = true;
					if (local305.anInt460 > 0) {
						local307 = this.method107(local305);
					}
					if (local307) {
						this.aClass1_Sub1_Sub3_4.method487(244);
						this.aClass1_Sub1_Sub3_4.method489(local23);
					}
				}
				@Pc(334) Class1_Sub1_Sub1_Sub1_Sub1 local334;
				@Pc(347) String local347;
				if (local28 == 1714) {
					local334 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
					if (local334 != null) {
						if (local334.aClass13_1.aByteArray5 == null) {
							local347 = "It's a " + local334.aClass13_1.aString25 + ".";
						} else {
							local347 = new String(local334.aClass13_1.aByteArray5);
						}
						this.method182("", 0, this.anInt433, local347);
					}
				}
				@Pc(376) String local376;
				@Pc(380) int local380;
				if (local28 == 524) {
					local376 = this.aStringArray4[arg1];
					local380 = local376.indexOf("@whi@");
					if (local380 != -1) {
						this.method109();
						this.aString12 = local376.substring(local380 + 5).trim();
						this.aBoolean86 = false;
						for (@Pc(399) int local399 = 0; local399 < Class6.aClass6Array1.length; local399++) {
							if (Class6.aClass6Array1[local399] != null && Class6.aClass6Array1[local399].anInt460 == 600) {
								this.anInt448 = this.anInt399 = Class6.aClass6Array1[local399].anInt457;
								break;
							}
						}
					}
				}
				if (local28 == 721) {
					anInt342 += local23;
					if (anInt342 >= 139) {
						this.aClass1_Sub1_Sub3_4.method487(28);
						this.aClass1_Sub1_Sub3_4.method492(0);
					}
					this.method198(local18, this.anInt450, local23, local33, 213);
				}
				if (local28 == 242 || local28 == 209 || local28 == 309 || local28 == 852 || local28 == 793) {
					local334 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
					if (local334 != null) {
						this.method155(0, 1, 0, local334.anIntArray16[0], 2, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], local334.anIntArray17[0], false, 1, 0);
						this.anInt389 = super.anInt236;
						this.anInt390 = super.anInt237;
						this.anInt392 = 2;
						this.anInt391 = 0;
						if (local28 == 309) {
							this.aClass1_Sub1_Sub3_4.method487(69);
						}
						if (local28 == 852) {
							this.aClass1_Sub1_Sub3_4.method487(122);
						}
						if (local28 == 209) {
							this.aClass1_Sub1_Sub3_4.method487(195);
						}
						if (local28 == 793) {
							this.aClass1_Sub1_Sub3_4.method487(118);
						}
						if (local28 == 242) {
							this.aClass1_Sub1_Sub3_4.method487(143);
						}
						this.aClass1_Sub1_Sub3_4.method489(local33);
					}
				}
				if (local28 == 899 && this.method198(local18, this.anInt450, local23, local33, 26)) {
					this.aClass1_Sub1_Sub3_4.method489(this.anInt337);
				}
				if (local28 == 225) {
					this.aClass1_Sub1_Sub3_4.method487(244);
					this.aClass1_Sub1_Sub3_4.method489(local23);
					local305 = Class6.aClass6Array1[local23];
					if (local305.anIntArrayArray6 != null && local305.anIntArrayArray6[0][0] == 5) {
						local380 = local305.anIntArrayArray6[0][1];
						if (this.anIntArray41[local380] != local305.anIntArray99[0]) {
							this.anIntArray41[local380] = local305.anIntArray99[0];
							this.method142(local380);
							this.aBoolean44 = true;
						}
					}
				}
				@Pc(643) Class15 local643;
				if (local28 == 1328) {
					local643 = Class15.method345(local33);
					@Pc(647) Class6 local647 = Class6.aClass6Array1[local23];
					if (local647 != null && local647.anIntArray97[local18] >= 100000) {
						local347 = local647.anIntArray97[local18] + " x " + local643.aString26;
					} else if (local643.aByteArray6 == null) {
						local347 = "It's a " + local643.aString26 + ".";
					} else {
						local347 = new String(local643.aByteArray6);
					}
					this.method182("", 0, this.anInt433, local347);
				}
				@Pc(726) int local726;
				@Pc(724) long local724;
				if (local28 == 902) {
					local376 = this.aStringArray4[arg1];
					local380 = local376.indexOf("@whi@");
					if (local380 != -1) {
						local724 = Class49.method679(local376.substring(local380 + 5).trim());
						local726 = -1;
						for (@Pc(728) int local728 = 0; local728 < this.anInt439; local728++) {
							if (this.aLongArray4[local728] == local724) {
								local726 = local728;
								break;
							}
						}
						if (local726 != -1 && this.anIntArray84[local726] > 0) {
							this.aBoolean79 = true;
							this.aBoolean85 = false;
							this.aBoolean81 = true;
							this.aString17 = "";
							this.anInt443 = 3;
							this.aLong16 = this.aLongArray4[local726];
							this.aString15 = "Enter message to send to " + this.aStringArray3[local726];
						}
					}
				}
				if (local28 == 357) {
					this.method198(local18, this.anInt450, local23, local33, 87);
				}
				@Pc(823) boolean local823;
				if (local28 == 370) {
					local823 = this.method155(0, 0, 0, local18, 2, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], local23, false, 0, 0);
					if (!local823) {
						this.method155(0, 1, 0, local18, 2, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], local23, false, 1, 0);
					}
					this.anInt389 = super.anInt236;
					this.anInt390 = super.anInt237;
					this.anInt392 = 2;
					this.anInt391 = 0;
					this.aClass1_Sub1_Sub3_4.method487(202);
					this.aClass1_Sub1_Sub3_4.method489(local18 + this.anInt381);
					this.aClass1_Sub1_Sub3_4.method489(local23 + this.anInt382);
					this.aClass1_Sub1_Sub3_4.method489(local33);
					this.aClass1_Sub1_Sub3_4.method489(this.anInt337);
				}
				if (local28 == 139 || local28 == 778 || local28 == 617 || local28 == 224 || local28 == 662) {
					local823 = this.method155(0, 0, 0, local18, 2, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], local23, false, 0, 0);
					if (!local823) {
						this.method155(0, 1, 0, local18, 2, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], local23, false, 1, 0);
					}
					this.anInt389 = super.anInt236;
					this.anInt390 = super.anInt237;
					this.anInt392 = 2;
					this.anInt391 = 0;
					if (local28 == 617) {
						this.aClass1_Sub1_Sub3_4.method487(178);
					}
					if (local28 == 662) {
						anInt388 += this.anInt382;
						if (anInt388 >= 118) {
							this.aClass1_Sub1_Sub3_4.method487(56);
							this.aClass1_Sub1_Sub3_4.method492(0);
						}
						this.aClass1_Sub1_Sub3_4.method487(97);
					}
					if (local28 == 778) {
						this.aClass1_Sub1_Sub3_4.method487(67);
					}
					if (local28 == 139) {
						if ((local18 & 0x3) == 0) {
							anInt260++;
						}
						if (anInt260 >= 123) {
							this.aClass1_Sub1_Sub3_4.method487(187);
							this.aClass1_Sub1_Sub3_4.method492(0);
						}
						this.aClass1_Sub1_Sub3_4.method487(141);
					}
					if (local28 == 224) {
						anInt431 += local23;
						if (anInt431 >= 75) {
							this.aClass1_Sub1_Sub3_4.method487(206);
							this.aClass1_Sub1_Sub3_4.method488(19);
						}
						this.aClass1_Sub1_Sub3_4.method487(47);
					}
					this.aClass1_Sub1_Sub3_4.method489(local18 + this.anInt381);
					this.aClass1_Sub1_Sub3_4.method489(local23 + this.anInt382);
					this.aClass1_Sub1_Sub3_4.method489(local33);
				}
				@Pc(1104) String local1104;
				if (local28 == 507 || local28 == 957) {
					local376 = this.aStringArray4[arg1];
					local380 = local376.indexOf("@whi@");
					if (local380 != -1) {
						local376 = local376.substring(local380 + 5).trim();
						local1104 = Class49.method683(Class49.method680(Class49.method679(local376)));
						@Pc(1106) boolean local1106 = false;
						for (local726 = 0; local726 < this.anInt333; local726++) {
							@Pc(1118) Class1_Sub1_Sub1_Sub1_Sub2 local1118 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray62[local726]];
							if (local1118 != null && local1118.aString4 != null && local1118.aString4.equalsIgnoreCase(local1104)) {
								this.method155(0, 1, 0, local1118.anIntArray16[0], 2, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], local1118.anIntArray17[0], false, 1, 0);
								if (local28 == 507) {
									anInt310 += local33;
									if (anInt310 >= 66) {
										this.aClass1_Sub1_Sub3_4.method487(233);
										this.aClass1_Sub1_Sub3_4.method488(154);
									}
									this.aClass1_Sub1_Sub3_4.method487(72);
								}
								if (local28 == 957) {
									anInt452++;
									if (anInt452 >= 52) {
										this.aClass1_Sub1_Sub3_4.method487(121);
										this.aClass1_Sub1_Sub3_4.method488(131);
									}
									this.aClass1_Sub1_Sub3_4.method487(192);
								}
								this.aClass1_Sub1_Sub3_4.method489(this.anIntArray62[local726]);
								local1106 = true;
								break;
							}
						}
						if (!local1106) {
							this.method182("", 0, this.anInt433, "Unable to find " + local1104);
						}
					}
				}
				if (local28 == 810 && this.method198(local18, this.anInt450, local23, local33, 240)) {
					this.aClass1_Sub1_Sub3_4.method489(this.anInt245);
					this.aClass1_Sub1_Sub3_4.method489(this.anInt243);
					this.aClass1_Sub1_Sub3_4.method489(this.anInt244);
				}
				if (local28 == 1381) {
					@Pc(1270) int local1270 = local33 >> 14 & 0x7FFF;
					@Pc(1273) Class9 local1273 = Class9.method258(local1270);
					if (local1273.aByteArray4 == null) {
						local1104 = "It's a " + local1273.aString24 + ".";
					} else {
						local1104 = new String(local1273.aByteArray4);
					}
					this.method182("", 0, this.anInt433, local1104);
				}
				if (local28 == 274) {
					local305 = Class6.aClass6Array1[local23];
					this.anInt336 = 1;
					this.anInt337 = local23;
					this.anInt338 = local305.anInt484;
					this.anInt242 = 0;
					this.aBoolean44 = true;
					local347 = local305.aString21;
					if (local347.indexOf(" ") != -1) {
						local347 = local347.substring(0, local347.indexOf(" "));
					}
					local1104 = local305.aString21;
					if (local1104.indexOf(" ") != -1) {
						local1104 = local1104.substring(local1104.indexOf(" ") + 1);
					}
					this.aString7 = local347 + " " + local305.aString22 + " " + local1104;
					if (this.anInt338 == 16) {
						this.aBoolean44 = true;
						this.anInt263 = 3;
						this.aBoolean58 = true;
					}
				} else {
					if (local28 == 582 || local28 == 113 || local28 == 555 || local28 == 331 || local28 == 354) {
						if (local28 == 331) {
							this.aClass1_Sub1_Sub3_4.method487(160);
						}
						if (local28 == 582) {
							if ((local33 & 0x3) == 0) {
								anInt343++;
							}
							if (anInt343 >= 133) {
								this.aClass1_Sub1_Sub3_4.method487(131);
								this.aClass1_Sub1_Sub3_4.method489(6118);
							}
							this.aClass1_Sub1_Sub3_4.method487(181);
						}
						if (local28 == 113) {
							this.aClass1_Sub1_Sub3_4.method487(70);
						}
						if (local28 == 555) {
							this.aClass1_Sub1_Sub3_4.method487(59);
						}
						if (local28 == 354) {
							this.aClass1_Sub1_Sub3_4.method487(62);
						}
						this.aClass1_Sub1_Sub3_4.method489(local33);
						this.aClass1_Sub1_Sub3_4.method489(local18);
						this.aClass1_Sub1_Sub3_4.method489(local23);
						this.anInt255 = 0;
						this.anInt256 = local23;
						this.anInt257 = local18;
						this.anInt258 = 2;
						if (Class6.aClass6Array1[local23].anInt457 == this.anInt399) {
							this.anInt258 = 1;
						}
						if (Class6.aClass6Array1[local23].anInt457 == this.anInt413) {
							this.anInt258 = 3;
						}
					}
					if (local28 == 111) {
						local823 = this.method155(0, 0, 0, local18, 2, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], local23, false, 0, 0);
						if (!local823) {
							this.method155(0, 1, 0, local18, 2, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], local23, false, 1, 0);
						}
						this.anInt389 = super.anInt236;
						this.anInt390 = super.anInt237;
						this.anInt392 = 2;
						this.anInt391 = 0;
						this.aClass1_Sub1_Sub3_4.method487(245);
						this.aClass1_Sub1_Sub3_4.method489(local18 + this.anInt381);
						this.aClass1_Sub1_Sub3_4.method489(local23 + this.anInt382);
						this.aClass1_Sub1_Sub3_4.method489(local33);
						this.aClass1_Sub1_Sub3_4.method489(this.anInt245);
						this.aClass1_Sub1_Sub3_4.method489(this.anInt243);
						this.aClass1_Sub1_Sub3_4.method489(this.anInt244);
					}
					if (local28 == 829) {
						local334 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
						if (local334 != null) {
							this.method155(0, 1, 0, local334.anIntArray16[0], 2, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], local334.anIntArray17[0], false, 1, 0);
							this.anInt389 = super.anInt236;
							this.anInt390 = super.anInt237;
							this.anInt392 = 2;
							this.anInt391 = 0;
							this.aClass1_Sub1_Sub3_4.method487(119);
							this.aClass1_Sub1_Sub3_4.method489(local33);
							this.aClass1_Sub1_Sub3_4.method489(this.anInt245);
							this.aClass1_Sub1_Sub3_4.method489(this.anInt243);
							this.aClass1_Sub1_Sub3_4.method489(this.anInt244);
						}
					}
					if (local28 == 718) {
						if (this.aBoolean63) {
							this.aClass39_1.method582(local23 - 4, local18 - 4);
						} else {
							this.aClass39_1.method582(super.anInt237 - 4, super.anInt236 - 4);
						}
					}
					if (local28 == 997 && !this.aBoolean70) {
						this.aClass1_Sub1_Sub3_4.method487(146);
						this.aClass1_Sub1_Sub3_4.method489(local23);
						this.aBoolean70 = true;
					}
					@Pc(1748) Class1_Sub1_Sub1_Sub1_Sub2 local1748;
					if (local28 == 639 || local28 == 499 || local28 == 27 || local28 == 387 || local28 == 185) {
						local1748 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local1748 != null) {
							this.method155(0, 1, 0, local1748.anIntArray16[0], 2, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], local1748.anIntArray17[0], false, 1, 0);
							this.anInt389 = super.anInt236;
							this.anInt390 = super.anInt237;
							this.anInt392 = 2;
							this.anInt391 = 0;
							if (local28 == 387) {
								anInt310 += local33;
								if (anInt310 >= 66) {
									this.aClass1_Sub1_Sub3_4.method487(233);
									this.aClass1_Sub1_Sub3_4.method488(154);
								}
								this.aClass1_Sub1_Sub3_4.method487(72);
							}
							if (local28 == 27) {
								this.aClass1_Sub1_Sub3_4.method487(18);
							}
							if (local28 == 639) {
								anInt452++;
								if (anInt452 >= 52) {
									this.aClass1_Sub1_Sub3_4.method487(121);
									this.aClass1_Sub1_Sub3_4.method488(131);
								}
								this.aClass1_Sub1_Sub3_4.method487(192);
							}
							if (local28 == 185) {
								this.aClass1_Sub1_Sub3_4.method487(230);
							}
							if (local28 == 499) {
								this.aClass1_Sub1_Sub3_4.method487(17);
							}
							this.aClass1_Sub1_Sub3_4.method489(local33);
						}
					}
					if (local28 == 435) {
						this.aClass1_Sub1_Sub3_4.method487(244);
						this.aClass1_Sub1_Sub3_4.method489(local23);
						local305 = Class6.aClass6Array1[local23];
						if (local305.anIntArrayArray6 != null && local305.anIntArrayArray6[0][0] == 5) {
							local380 = local305.anIntArrayArray6[0][1];
							this.anIntArray41[local380] = 1 - this.anIntArray41[local380];
							this.method142(local380);
							this.aBoolean44 = true;
						}
					}
					if (local28 == 625) {
						this.method198(local18, this.anInt450, local23, local33, 33);
					}
					if (local28 == 131) {
						local1748 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local1748 != null) {
							this.method155(0, 1, 0, local1748.anIntArray16[0], 2, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], local1748.anIntArray17[0], false, 1, 0);
							this.anInt389 = super.anInt236;
							this.anInt390 = super.anInt237;
							this.anInt392 = 2;
							this.anInt391 = 0;
							this.aClass1_Sub1_Sub3_4.method487(68);
							this.aClass1_Sub1_Sub3_4.method489(local33);
							this.aClass1_Sub1_Sub3_4.method489(this.anInt337);
						}
					}
					if (local28 == 1152) {
						local643 = Class15.method345(local33);
						if (local643.aByteArray6 == null) {
							local347 = "It's a " + local643.aString26 + ".";
						} else {
							local347 = new String(local643.aByteArray6);
						}
						this.method182("", 0, this.anInt433, local347);
					}
					if (local28 == 1071) {
						this.method198(local18, this.anInt450, local23, local33, 147);
					}
					if (local28 == 605 || local28 == 47 || local28 == 513 || local28 == 884) {
						local376 = this.aStringArray4[arg1];
						local380 = local376.indexOf("@whi@");
						if (local380 != -1) {
							local724 = Class49.method679(local376.substring(local380 + 5).trim());
							if (local28 == 605) {
								this.method171(local724);
							}
							if (local28 == 47) {
								this.method151(local724);
							}
							if (local28 == 513) {
								this.method139(local724);
							}
							if (local28 == 884) {
								this.method114(local724);
							}
						}
					}
					if (local28 == 240) {
						local334 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
						if (local334 != null) {
							this.method155(0, 1, 0, local334.anIntArray16[0], 2, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], local334.anIntArray17[0], false, 1, 0);
							this.anInt389 = super.anInt236;
							this.anInt390 = super.anInt237;
							this.anInt392 = 2;
							this.anInt391 = 0;
							this.aClass1_Sub1_Sub3_4.method487(231);
							this.aClass1_Sub1_Sub3_4.method489(local33);
							this.aClass1_Sub1_Sub3_4.method489(this.anInt337);
						}
					}
					if (local28 == 275) {
						local1748 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local1748 != null) {
							this.method155(0, 1, 0, local1748.anIntArray16[0], 2, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], local1748.anIntArray17[0], false, 1, 0);
							this.anInt389 = super.anInt236;
							this.anInt390 = super.anInt237;
							this.anInt392 = 2;
							this.anInt391 = 0;
							this.aClass1_Sub1_Sub3_4.method487(113);
							this.aClass1_Sub1_Sub3_4.method489(local33);
							this.aClass1_Sub1_Sub3_4.method489(this.anInt245);
							this.aClass1_Sub1_Sub3_4.method489(this.anInt243);
							this.aClass1_Sub1_Sub3_4.method489(this.anInt244);
						}
					}
					if (local28 == 743) {
						anInt281++;
						if (anInt281 >= 124) {
							this.aClass1_Sub1_Sub3_4.method487(77);
							this.aClass1_Sub1_Sub3_4.method489(37954);
						}
						this.method198(local18, this.anInt450, local23, local33, 98);
					}
					if (local28 == 102) {
						this.anInt242 = 1;
						this.anInt243 = local18;
						this.anInt244 = local23;
						this.anInt245 = local33;
						this.aString5 = Class15.method345(local33).aString26;
						this.anInt336 = 0;
						this.aBoolean44 = true;
					} else {
						this.anInt242 = 0;
						this.anInt336 = 0;
						this.aBoolean44 = true;
					}
				}
			}
		} catch (@Pc(2308) RuntimeException local2308) {
			signlink.reporterror("76477, " + arg0 + ", " + arg1 + ", " + local2308.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	private void method101() {
		try {
			if (this.anInt301 == 2) {
				for (@Pc(14) Class1_Sub2 local14 = (Class1_Sub2) this.aClass31_3.method523(); local14 != null; local14 = (Class1_Sub2) this.aClass31_3.method525()) {
					if (local14.anInt833 > 0) {
						local14.anInt833--;
					}
					if (local14.anInt833 != 0) {
						if (local14.anInt832 > 0) {
							local14.anInt832--;
						}
						if (local14.anInt832 == 0 && local14.anInt824 >= 1 && local14.anInt825 >= 1 && local14.anInt824 <= 102 && local14.anInt825 <= 102 && (local14.anInt829 < 0 || Class4.method73(local14.anInt829, local14.anInt831))) {
							this.method214(local14.anInt822, local14.anInt830, local14.anInt829, local14.anInt825, local14.anInt823, local14.anInt831, local14.anInt824);
							local14.anInt832 = -1;
							if (local14.anInt829 == local14.anInt826 && local14.anInt826 == -1) {
								local14.method669();
							} else if (local14.anInt829 == local14.anInt826 && local14.anInt830 == local14.anInt827 && local14.anInt831 == local14.anInt828) {
								local14.method669();
							}
						}
					} else if (local14.anInt826 < 0 || Class4.method73(local14.anInt826, local14.anInt828)) {
						this.method214(local14.anInt822, local14.anInt827, local14.anInt826, local14.anInt825, local14.anInt823, local14.anInt828, local14.anInt824);
						local14.method669();
					}
				}
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("6008, " + 0 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method91(@OriginalArg(0) byte arg0) {
		try {
			if (!this.aBoolean69 && !this.aBoolean78 && !this.aBoolean43) {
				anInt426++;
				if (this.aBoolean46) {
					this.method203();
				} else {
					this.method219();
				}
				this.method132();
				if (arg0 != 68) {
					this.aClass1_Sub1_Sub3_4.method488(205);
				}
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("44883, " + arg0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method102() {
		try {
			if (aBoolean48 && this.anInt301 == 2 && Class4.anInt201 != this.anInt278) {
				this.aClass37_5.method538((byte) 9);
				this.aClass1_Sub1_Sub2_Sub4_2.method465(151, "Loading - please wait.", 257, 0);
				this.aClass1_Sub1_Sub2_Sub4_2.method465(150, "Loading - please wait.", 256, 16777215);
				this.aClass37_5.method539(4, 4, super.aGraphics2);
				this.anInt301 = 1;
				this.aLong18 = System.currentTimeMillis();
			}
			if (this.anInt301 == 1) {
				@Pc(54) int local54 = this.method103((byte) 8);
				if (local54 != 0 && System.currentTimeMillis() - this.aLong18 > 360000L) {
					signlink.reporterror(this.aString10 + " glcfb " + this.aLong17 + "," + local54 + "," + aBoolean48 + "," + this.aClass46Array1[0] + "," + this.aClass45_Sub1_1.method658() + "," + this.anInt278 + "," + this.anInt379 + "," + this.anInt380);
					this.aLong18 = System.currentTimeMillis();
				}
			}
			if (this.anInt301 == 2 && this.anInt278 != this.anInt449) {
				this.anInt449 = this.anInt278;
				this.method194(this.anInt278);
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("16490, " + 292 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)I")
	private int method103(@OriginalArg(0) byte arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray2.length; local3++) {
				if (this.aByteArrayArray2[local3] == null && this.anIntArray78[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray1[local3] == null && this.anIntArray79[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(41) int local41 = 0; local41 < this.aByteArrayArray2.length; local41++) {
				@Pc(48) byte[] local48 = this.aByteArrayArray1[local41];
				if (local48 != null) {
					@Pc(62) int local62 = (this.anIntArray77[local41] >> 8) * 64 - this.anInt381;
					@Pc(74) int local74 = (this.anIntArray77[local41] & 0xFF) * 64 - this.anInt382;
					local39 &= Class4.method59(local74, local62, local48);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean67) {
				return -4;
			} else {
				this.anInt301 = 2;
				@Pc(105) boolean local105 = false;
				Class4.anInt201 = this.anInt278;
				this.method220();
				this.aClass1_Sub1_Sub3_4.method487(134);
				return 0;
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("943, " + arg0 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZB)V")
	private void method104(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(6) boolean local6 = false;
			this.method201();
			this.aClass37_12.method538((byte) 9);
			this.aClass1_Sub1_Sub2_Sub3_14.method445(0, 0);
			@Pc(55) byte local55;
			@Pc(67) int local67;
			if (this.anInt386 == 0) {
				this.aClass1_Sub1_Sub2_Sub4_1.method466(7711145, 180, this.aClass45_Sub1_1.aString31, 180, true);
				local55 = 80;
				this.aClass1_Sub1_Sub2_Sub4_3.method466(16776960, 180, "Welcome to RuneScape", 80, true);
				local67 = local55 + 30;
				this.aClass1_Sub1_Sub2_Sub3_15.method445(27, 100);
				this.aClass1_Sub1_Sub2_Sub4_3.method466(16777215, 100, "New user", 125, true);
				this.aClass1_Sub1_Sub2_Sub3_15.method445(187, 100);
				this.aClass1_Sub1_Sub2_Sub4_3.method466(16777215, 260, "Existing User", 125, true);
			}
			if (this.anInt386 == 2) {
				local55 = 60;
				if (this.aString8.length() > 0) {
					this.aClass1_Sub1_Sub2_Sub4_3.method466(16776960, 180, this.aString8, 45, true);
					this.aClass1_Sub1_Sub2_Sub4_3.method466(16776960, 180, this.aString9, 60, true);
					local67 = local55 + 30;
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method466(16776960, 180, this.aString9, 53, true);
					local67 = local55 + 30;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method470(true, "Username: " + this.aString10 + (this.anInt348 == 0 & anInt426 % 40 < 20 ? "@yel@|" : ""), 90, 16777215, 90);
				local67 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method470(true, "Password: " + Class49.method685(this.aByte12, this.aString11) + (this.anInt348 == 1 & anInt426 % 40 < 20 ? "@yel@|" : ""), 105, 16777215, 92);
				local67 += 15;
				if (!arg0) {
					this.aClass1_Sub1_Sub2_Sub3_15.method445(27, 130);
					this.aClass1_Sub1_Sub2_Sub4_3.method466(16777215, 100, "Login", 155, true);
					this.aClass1_Sub1_Sub2_Sub3_15.method445(187, 130);
					this.aClass1_Sub1_Sub2_Sub4_3.method466(16777215, 260, "Cancel", 155, true);
				}
			}
			if (this.anInt386 == 3) {
				this.aClass1_Sub1_Sub2_Sub4_3.method466(16776960, 180, "Create a free account", 40, true);
				local55 = 65;
				this.aClass1_Sub1_Sub2_Sub4_3.method466(16777215, 180, "To create a new account you need to", 65, true);
				local67 = local55 + 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method466(16777215, 180, "go back to the main RuneScape webpage", 80, true);
				local67 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method466(16777215, 180, "and choose the red 'create account'", 95, true);
				local67 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method466(16777215, 180, "button at the top right of that page.", 110, true);
				local67 += 15;
				this.aClass1_Sub1_Sub2_Sub3_15.method445(107, 130);
				this.aClass1_Sub1_Sub2_Sub4_3.method466(16777215, 180, "Cancel", 155, true);
			}
			this.aClass37_12.method539(171, 202, super.aGraphics2);
			if (this.aBoolean75) {
				this.aBoolean75 = false;
				this.aClass37_10.method539(0, 128, super.aGraphics2);
				this.aClass37_11.method539(371, 202, super.aGraphics2);
				this.aClass37_15.method539(265, 0, super.aGraphics2);
				this.aClass37_16.method539(265, 562, super.aGraphics2);
				this.aClass37_17.method539(171, 128, super.aGraphics2);
				this.aClass37_18.method539(171, 562, super.aGraphics2);
			}
		} catch (@Pc(501) RuntimeException local501) {
			signlink.reporterror("90222, " + arg0 + ", " + arg1 + ", " + local501.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method105() {
		try {
			if (this.anInt325 == 0) {
				this.aStringArray4[0] = "Cancel";
				this.anIntArray37[0] = 1106;
				this.anInt299 = 1;
				this.method152();
				this.anInt366 = 0;
				if (super.anInt230 > 4 && super.anInt231 > 4 && super.anInt230 < 516 && super.anInt231 < 338) {
					if (this.anInt399 == -1) {
						this.method163();
					} else {
						this.method127(super.anInt231, 4, Class6.aClass6Array1[this.anInt399], 4, super.anInt230, 0);
					}
				}
				if (this.anInt366 != this.anInt421) {
					this.anInt421 = this.anInt366;
				}
				this.anInt366 = 0;
				if (super.anInt230 > 553 && super.anInt231 > 205 && super.anInt230 < 743 && super.anInt231 < 466) {
					if (this.anInt429 != -1) {
						this.method127(super.anInt231, 205, Class6.aClass6Array1[this.anInt429], 553, super.anInt230, 0);
					} else if (this.anIntArray71[this.anInt263] != -1) {
						this.method127(super.anInt231, 205, Class6.aClass6Array1[this.anIntArray71[this.anInt263]], 553, super.anInt230, 0);
					}
				}
				if (this.anInt366 != this.anInt445) {
					this.aBoolean44 = true;
					this.anInt445 = this.anInt366;
				}
				this.anInt366 = 0;
				if (super.anInt230 > 17 && super.anInt231 > 357 && super.anInt230 < 496 && super.anInt231 < 453) {
					if (this.anInt413 != -1) {
						this.method127(super.anInt231, 357, Class6.aClass6Array1[this.anInt413], 17, super.anInt230, 0);
					} else if (super.anInt231 < 434 && super.anInt230 < 426) {
						this.method199(super.anInt231 - 357, super.anInt230 - 17);
					}
				}
				if (this.anInt413 != -1 && this.anInt366 != this.anInt438) {
					this.aBoolean79 = true;
					this.anInt438 = this.anInt366;
				}
				@Pc(223) boolean local223 = false;
				while (!local223) {
					local223 = true;
					for (@Pc(230) int local230 = 0; local230 < this.anInt299 - 1; local230++) {
						if (this.anIntArray37[local230] < 1000 && this.anIntArray37[local230 + 1] > 1000) {
							@Pc(251) String local251 = this.aStringArray4[local230];
							this.aStringArray4[local230] = this.aStringArray4[local230 + 1];
							this.aStringArray4[local230 + 1] = local251;
							@Pc(273) int local273 = this.anIntArray37[local230];
							this.anIntArray37[local230] = this.anIntArray37[local230 + 1];
							this.anIntArray37[local230 + 1] = local273;
							@Pc(295) int local295 = this.anIntArray35[local230];
							this.anIntArray35[local230] = this.anIntArray35[local230 + 1];
							this.anIntArray35[local230 + 1] = local295;
							@Pc(317) int local317 = this.anIntArray36[local230];
							this.anIntArray36[local230] = this.anIntArray36[local230 + 1];
							this.anIntArray36[local230 + 1] = local317;
							@Pc(339) int local339 = this.anIntArray38[local230];
							this.anIntArray38[local230] = this.anIntArray38[local230 + 1];
							this.anIntArray38[local230 + 1] = local339;
							local223 = false;
						}
					}
				}
			}
		} catch (@Pc(369) RuntimeException local369) {
			signlink.reporterror("42235, " + true + ", " + local369.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIILclient!bb;)V")
	private void method106(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub1_Sub1_Sub1_Sub2 arg3) {
		try {
			if (arg3 != aClass1_Sub1_Sub1_Sub1_Sub2_1 && this.anInt299 < 400) {
				@Pc(32) String local32 = arg3.aString4 + method117(arg3.anInt176, aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt176) + " (level-" + arg3.anInt176 + ")";
				@Pc(145) int local145;
				if (this.anInt242 == 1) {
					this.aStringArray4[this.anInt299] = "Use " + this.aString5 + " with @whi@" + local32;
					this.anIntArray37[this.anInt299] = 275;
					this.anIntArray38[this.anInt299] = arg1;
					this.anIntArray35[this.anInt299] = arg2;
					this.anIntArray36[this.anInt299] = arg0;
					this.anInt299++;
				} else if (this.anInt336 != 1) {
					for (local145 = 4; local145 >= 0; local145--) {
						if (this.aStringArray6[local145] != null) {
							this.aStringArray4[this.anInt299] = this.aStringArray6[local145] + " @whi@" + local32;
							@Pc(172) short local172 = 0;
							if (this.aStringArray6[local145].equalsIgnoreCase("attack")) {
								if (arg3.anInt176 > aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt176) {
									local172 = 2000;
								}
							} else if (this.aBooleanArray4[local145]) {
								local172 = 2000;
							}
							if (local145 == 0) {
								this.anIntArray37[this.anInt299] = local172 + 639;
							}
							if (local145 == 1) {
								this.anIntArray37[this.anInt299] = local172 + 499;
							}
							if (local145 == 2) {
								this.anIntArray37[this.anInt299] = local172 + 27;
							}
							if (local145 == 3) {
								this.anIntArray37[this.anInt299] = local172 + 387;
							}
							if (local145 == 4) {
								this.anIntArray37[this.anInt299] = local172 + 185;
							}
							this.anIntArray38[this.anInt299] = arg1;
							this.anIntArray35[this.anInt299] = arg2;
							this.anIntArray36[this.anInt299] = arg0;
							this.anInt299++;
						}
					}
				} else if ((this.anInt338 & 0x8) == 8) {
					this.aStringArray4[this.anInt299] = this.aString7 + " @whi@" + local32;
					this.anIntArray37[this.anInt299] = 131;
					this.anIntArray38[this.anInt299] = arg1;
					this.anIntArray35[this.anInt299] = arg2;
					this.anIntArray36[this.anInt299] = arg0;
					this.anInt299++;
				}
				for (local145 = 0; local145 < this.anInt299; local145++) {
					if (this.anIntArray37[local145] == 718) {
						this.aStringArray4[local145] = "Walk here @whi@" + local32;
						break;
					}
				}
			}
		} catch (@Pc(308) RuntimeException local308) {
			signlink.reporterror("89301, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local308.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;I)Z")
	private boolean method107(@OriginalArg(0) Class6 arg0) {
		try {
			this.anInt349 += 0;
			@Pc(10) int local10 = arg0.anInt460;
			if (this.anInt440 == 2) {
				if (local10 == 201) {
					this.aBoolean79 = true;
					this.aBoolean85 = false;
					this.aBoolean81 = true;
					this.aString17 = "";
					this.anInt443 = 1;
					this.aString15 = "Enter name of friend to add to list";
				}
				if (local10 == 202) {
					this.aBoolean79 = true;
					this.aBoolean85 = false;
					this.aBoolean81 = true;
					this.aString17 = "";
					this.anInt443 = 2;
					this.aString15 = "Enter name of friend to delete from list";
				}
			}
			if (local10 == 205) {
				this.anInt353 = 250;
				return true;
			}
			if (local10 == 501) {
				this.aBoolean79 = true;
				this.aBoolean85 = false;
				this.aBoolean81 = true;
				this.aString17 = "";
				this.anInt443 = 4;
				this.aString15 = "Enter name of player to add to list";
			}
			if (local10 == 502) {
				this.aBoolean79 = true;
				this.aBoolean85 = false;
				this.aBoolean81 = true;
				this.aString17 = "";
				this.anInt443 = 5;
				this.aString15 = "Enter name of player to delete from list";
			}
			@Pc(118) int local118;
			@Pc(122) int local122;
			@Pc(127) int local127;
			if (local10 >= 300 && local10 <= 313) {
				local118 = (local10 - 300) / 2;
				local122 = local10 & 0x1;
				local127 = this.anIntArray53[local118];
				if (local127 != -1) {
					while (true) {
						if (local122 == 0) {
							local127--;
							if (local127 < 0) {
								local127 = Class23.anInt752 - 1;
							}
						}
						if (local122 == 1) {
							local127++;
							if (local127 >= Class23.anInt752) {
								local127 = 0;
							}
						}
						if (!Class23.aClass23Array1[local127].aBoolean190 && Class23.aClass23Array1[local127].anInt753 == local118 + (this.aBoolean77 ? 0 : 7)) {
							this.anIntArray53[local118] = local127;
							this.aBoolean73 = true;
							break;
						}
					}
				}
			}
			if (local10 >= 314 && local10 <= 323) {
				local118 = (local10 - 314) / 2;
				local122 = local10 & 0x1;
				local127 = this.anIntArray80[local118];
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
				this.anIntArray80[local118] = local127;
				this.aBoolean73 = true;
			}
			if (local10 == 324 && !this.aBoolean77) {
				this.aBoolean77 = true;
				this.method119();
			}
			if (local10 == 325 && this.aBoolean77) {
				this.aBoolean77 = false;
				this.method119();
			}
			if (local10 == 326) {
				this.aClass1_Sub1_Sub3_4.method487(13);
				this.aClass1_Sub1_Sub3_4.method488(this.aBoolean77 ? 0 : 1);
				for (local118 = 0; local118 < 7; local118++) {
					this.aClass1_Sub1_Sub3_4.method488(this.anIntArray53[local118]);
				}
				for (local122 = 0; local122 < 5; local122++) {
					this.aClass1_Sub1_Sub3_4.method488(this.anIntArray80[local122]);
				}
				return true;
			}
			if (local10 == 613) {
				this.aBoolean86 = !this.aBoolean86;
			}
			if (local10 >= 601 && local10 <= 612) {
				this.method109();
				if (this.aString12.length() > 0) {
					this.aClass1_Sub1_Sub3_4.method487(203);
					this.aClass1_Sub1_Sub3_4.method494(Class49.method679(this.aString12));
					this.aClass1_Sub1_Sub3_4.method488(local10 - 601);
					this.aClass1_Sub1_Sub3_4.method488(this.aBoolean86 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(355) RuntimeException local355) {
			signlink.reporterror("38844, " + arg0 + ", " + 0 + ", " + local355.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method108() {
		try {
			try {
				@Pc(13) int local13 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt127 + this.anInt411;
				@Pc(19) int local19 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 + this.anInt276;
				if (this.anInt328 - local13 < -500 || this.anInt328 - local13 > 500 || this.anInt329 - local19 < -500 || this.anInt329 - local19 > 500) {
					this.anInt328 = local13;
					this.anInt329 = local19;
				}
				if (this.anInt328 != local13) {
					this.anInt328 += (local13 - this.anInt328) / 16;
				}
				if (this.anInt329 != local19) {
					this.anInt329 += (local19 - this.anInt329) / 16;
				}
				if (super.anIntArray32[1] == 1) {
					this.anInt268 += (-this.anInt268 - 24) / 2;
				} else if (super.anIntArray32[2] == 1) {
					this.anInt268 += (24 - this.anInt268) / 2;
				} else {
					this.anInt268 /= 2;
				}
				if (super.anIntArray32[3] == 1) {
					this.anInt269 += (12 - this.anInt269) / 2;
				} else if (super.anIntArray32[4] == 1) {
					this.anInt269 += (-this.anInt269 - 12) / 2;
				} else {
					this.anInt269 /= 2;
				}
				this.anInt267 = this.anInt267 + this.anInt268 / 2 & 0x7FF;
				this.anInt266 += this.anInt269 / 2;
				if (this.anInt266 < 128) {
					this.anInt266 = 128;
				}
				if (this.anInt266 > 383) {
					this.anInt266 = 383;
				}
				@Pc(206) int local206 = this.anInt328 >> 7;
				@Pc(211) int local211 = this.anInt329 >> 7;
				@Pc(221) int local221 = this.method137(this.anInt329, this.anInt278, this.anInt328);
				@Pc(223) int local223 = 0;
				@Pc(239) int local239;
				if (local206 > 3 && local211 > 3 && local206 < 100 && local211 < 100) {
					for (local239 = local206 - 4; local239 <= local206 + 4; local239++) {
						for (@Pc(245) int local245 = local211 - 4; local245 <= local211 + 4; local245++) {
							@Pc(250) int local250 = this.anInt278;
							if (local250 < 3 && (this.aByteArrayArrayArray7[1][local239][local245] & 0x2) == 2) {
								local250++;
							}
							@Pc(277) int local277 = local221 - this.anIntArrayArrayArray3[local250][local239][local245];
							if (local277 > local223) {
								local223 = local277;
							}
						}
					}
				}
				local239 = local223 * 192;
				if (local239 > 98048) {
					local239 = 98048;
				}
				if (local239 < 32768) {
					local239 = 32768;
				}
				if (local239 > this.anInt339) {
					this.anInt339 += (local239 - this.anInt339) / 24;
				} else if (local239 < this.anInt339) {
					this.anInt339 += (local239 - this.anInt339) / 80;
				}
			} catch (@Pc(341) Exception local341) {
				signlink.reporterror("glfc_ex " + aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt127 + "," + aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 + "," + this.anInt328 + "," + this.anInt329 + "," + this.anInt379 + "," + this.anInt380 + "," + this.anInt381 + "," + this.anInt382);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(391) RuntimeException local391) {
			signlink.reporterror("42175, " + -7692 + ", " + local391.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method109() {
		try {
			this.aClass1_Sub1_Sub3_4.method487(58);
			if (this.anInt429 != -1) {
				this.anInt429 = -1;
				this.aBoolean44 = true;
				this.aBoolean70 = false;
				this.aBoolean58 = true;
			}
			if (this.anInt413 != -1) {
				this.anInt413 = -1;
				this.aBoolean79 = true;
				this.aBoolean70 = false;
			}
			this.anInt399 = -1;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("84036, " + 889 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZ)V")
	private void method110(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		try {
			signlink.anInt934 = arg0;
			this.anInt349 += 0;
			if (arg1) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("2545, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)Ljava/net/Socket;")
	public Socket method111(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method112() {
		try {
			if (this.anInt313 != 0) {
				@Pc(17) Class1_Sub1_Sub2_Sub4 local17 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(19) int local19 = 0;
				if (this.anInt363 != 0) {
					local19 = 1;
				}
				for (@Pc(26) int local26 = 0; local26 < 100; local26++) {
					if (this.aStringArray2[local26] != null) {
						@Pc(38) int local38 = this.anIntArray44[local26];
						@Pc(43) String local43 = this.aStringArray1[local26];
						@Pc(45) byte local45 = 0;
						if (local43 != null && local43.startsWith("@cr1@")) {
							local43 = local43.substring(5);
							local45 = 1;
						}
						if (local43 != null && local43.startsWith("@cr2@")) {
							local43 = local43.substring(5);
							local45 = 2;
						}
						@Pc(96) int local96;
						if ((local38 == 3 || local38 == 7) && (local38 == 7 || this.anInt444 == 0 || this.anInt444 == 1 && this.method115(local43))) {
							local96 = 329 - local19 * 13;
							local17.method468(0, 4, local96, this.anInt405, "From");
							local17.method468(65535, 4, local96 - 1, this.anInt405, "From");
							@Pc(123) int local123 = local17.method467("From ") + 4;
							if (local45 == 1) {
								this.aClass1_Sub1_Sub2_Sub3Array4[0].method445(local123, local96 - 12);
								local123 += 14;
							}
							if (local45 == 2) {
								this.aClass1_Sub1_Sub2_Sub3Array4[1].method445(local123, local96 - 12);
								local123 += 14;
							}
							local17.method468(0, local123, local96, this.anInt405, local43 + ": " + this.aStringArray2[local26]);
							local17.method468(65535, local123, local96 - 1, this.anInt405, local43 + ": " + this.aStringArray2[local26]);
							local19++;
							if (local19 >= 5) {
								return;
							}
						}
						if (local38 == 5 && this.anInt444 < 2) {
							local96 = 329 - local19 * 13;
							local17.method468(0, 4, local96, this.anInt405, this.aStringArray2[local26]);
							local17.method468(65535, 4, local96 - 1, this.anInt405, this.aStringArray2[local26]);
							local19++;
							if (local19 >= 5) {
								return;
							}
						}
						if (local38 == 6 && this.anInt444 < 2) {
							local96 = 329 - local19 * 13;
							local17.method468(0, 4, local96, this.anInt405, "To " + local43 + ": " + this.aStringArray2[local26]);
							local17.method468(65535, 4, local96 - 1, this.anInt405, "To " + local43 + ": " + this.aStringArray2[local26]);
							local19++;
							if (local19 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(308) RuntimeException local308) {
			signlink.reporterror("13474, " + true + ", " + local308.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!d;II)V")
	private void method113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg2.anInt458 == 0 && arg2.anIntArray100 != null && (!arg2.aBoolean92 || this.anInt421 == arg2.anInt456 || this.anInt445 == arg2.anInt456 || this.anInt438 == arg2.anInt456)) {
				@Pc(29) int local29 = Class1_Sub1_Sub2.anInt742;
				@Pc(31) int local31 = Class1_Sub1_Sub2.anInt740;
				@Pc(33) int local33 = Class1_Sub1_Sub2.anInt743;
				@Pc(35) int local35 = Class1_Sub1_Sub2.anInt741;
				Class1_Sub1_Sub2.method455(arg3 + arg2.anInt461, arg3, arg1 + arg2.anInt462, arg1);
				@Pc(51) int local51 = arg2.anIntArray100.length;
				for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
					@Pc(62) int local62 = arg2.anIntArray101[local53] + arg3;
					@Pc(71) int local71 = arg2.anIntArray102[local53] + arg1 - arg4;
					@Pc(78) Class6 local78 = Class6.aClass6Array1[arg2.anIntArray100[local53]];
					@Pc(83) int local83 = local62 + local78.anInt463;
					@Pc(88) int local88 = local71 + local78.anInt464;
					if (local78.anInt460 > 0) {
						this.method167(local78, this.aBoolean50);
					}
					if (local78.anInt458 == 0) {
						if (local78.anInt467 > local78.anInt466 - local78.anInt462) {
							local78.anInt467 = local78.anInt466 - local78.anInt462;
						}
						if (local78.anInt467 < 0) {
							local78.anInt467 = 0;
						}
						this.method113(anInt347, local88, local78, local83, local78.anInt467);
						if (local78.anInt466 > local78.anInt462) {
							this.method145(this.anInt427, local78.anInt462, local78.anInt466, local83 + local78.anInt461, local78.anInt467, local88);
						}
					} else if (local78.anInt458 != 1) {
						@Pc(162) int local162;
						@Pc(166) int local166;
						@Pc(177) int local177;
						@Pc(212) int local212;
						@Pc(219) int local219;
						@Pc(160) int local160;
						@Pc(210) int local210;
						if (local78.anInt458 == 2) {
							local160 = 0;
							for (local162 = 0; local162 < local78.anInt462; local162++) {
								for (local166 = 0; local166 < local78.anInt461; local166++) {
									local177 = local83 + local166 * (local78.anInt469 + 32);
									@Pc(186) int local186 = local88 + local162 * (local78.anInt470 + 32);
									if (local160 < 20) {
										local177 += local78.anIntArray103[local160];
										local186 += local78.anIntArray104[local160];
									}
									if (local78.anIntArray96[local160] > 0) {
										local210 = 0;
										local212 = 0;
										local219 = local78.anIntArray96[local160] - 1;
										if (local177 > Class1_Sub1_Sub2.anInt742 - 32 && local177 < Class1_Sub1_Sub2.anInt743 && local186 > Class1_Sub1_Sub2.anInt740 - 32 && local186 < Class1_Sub1_Sub2.anInt741 || this.anInt325 != 0 && this.anInt324 == local160) {
											@Pc(244) int local244 = 0;
											if (this.anInt242 == 1 && this.anInt243 == local160 && this.anInt244 == local78.anInt456) {
												local244 = 16777215;
											}
											@Pc(268) Class1_Sub1_Sub2_Sub2 local268 = Class15.method351(local244, local78.anIntArray97[local160], local219);
											if (local268 != null) {
												@Pc(347) int local347;
												if (this.anInt325 != 0 && this.anInt324 == local160 && this.anInt323 == local78.anInt456) {
													local210 = super.anInt230 - this.anInt326;
													local212 = super.anInt231 - this.anInt327;
													if (local210 < 5 && local210 > -5) {
														local210 = 0;
													}
													if (local212 < 5 && local212 > -5) {
														local212 = 0;
													}
													if (this.anInt265 < 5) {
														local210 = 0;
														local212 = 0;
													}
													local268.method408(local177 + local210, 609, local186 + local212);
													if (local186 + local212 < Class1_Sub1_Sub2.anInt740 && arg2.anInt467 > 0) {
														local347 = this.anInt372 * (Class1_Sub1_Sub2.anInt740 - local186 - local212) / 3;
														if (local347 > this.anInt372 * 10) {
															local347 = this.anInt372 * 10;
														}
														if (local347 > arg2.anInt467) {
															local347 = arg2.anInt467;
														}
														arg2.anInt467 -= local347;
														this.anInt327 += local347;
													}
													if (local186 + local212 + 32 > Class1_Sub1_Sub2.anInt741 && arg2.anInt467 < arg2.anInt466 - arg2.anInt462) {
														local347 = this.anInt372 * (local186 + local212 + 32 - Class1_Sub1_Sub2.anInt741) / 3;
														if (local347 > this.anInt372 * 10) {
															local347 = this.anInt372 * 10;
														}
														if (local347 > arg2.anInt466 - arg2.anInt462 - arg2.anInt467) {
															local347 = arg2.anInt466 - arg2.anInt462 - arg2.anInt467;
														}
														arg2.anInt467 += local347;
														this.anInt327 -= local347;
													}
												} else if (this.anInt258 != 0 && this.anInt257 == local160 && this.anInt256 == local78.anInt456) {
													local268.method408(local177, 609, local186);
												} else {
													local268.method406(local177, local186);
												}
												if (local268.anInt690 == 33 || local78.anIntArray97[local160] != 1) {
													local347 = local78.anIntArray97[local160];
													this.aClass1_Sub1_Sub2_Sub4_1.method468(0, local177 + local210 + 1, local186 + 10 + local212, this.anInt405, method211(local347));
													this.aClass1_Sub1_Sub2_Sub4_1.method468(16776960, local177 + local210, local186 + 9 + local212, this.anInt405, method211(local347));
												}
											}
										}
									} else if (local78.aClass1_Sub1_Sub2_Sub2Array8 != null && local160 < 20) {
										@Pc(538) Class1_Sub1_Sub2_Sub2 local538 = local78.aClass1_Sub1_Sub2_Sub2Array8[local160];
										if (local538 != null) {
											local538.method406(local177, local186);
										}
									}
									local160++;
								}
							}
						} else if (local78.anInt458 == 3) {
							@Pc(564) boolean local564 = false;
							if (this.anInt438 == local78.anInt456 || this.anInt445 == local78.anInt456 || this.anInt421 == local78.anInt456) {
								local564 = true;
							}
							if (this.method125(this.aBoolean59, local78)) {
								local160 = local78.anInt472;
								if (local564 && local78.anInt474 != 0) {
									local160 = local78.anInt474;
								}
							} else {
								local160 = local78.anInt471;
								if (local564 && local78.anInt473 != 0) {
									local160 = local78.anInt473;
								}
							}
							if (local78.aByte16 == 0) {
								if (local78.aBoolean98) {
									Class1_Sub1_Sub2.method458(local78.anInt462, local78.anInt461, local83, local88, (byte) 3, local160);
								} else {
									Class1_Sub1_Sub2.method459(local160, local78.anInt461, local88, local83, local78.anInt462);
								}
							} else if (local78.aBoolean98) {
								Class1_Sub1_Sub2.method457(local88, 256 - (local78.aByte16 & 0xFF), local83, local78.anInt462, local78.anInt461, local160);
							} else {
								Class1_Sub1_Sub2.method460(256 - (local78.aByte16 & 0xFF), (byte) 9, local160, local78.anInt461, local83, local78.anInt462, local88);
							}
						} else {
							@Pc(683) Class1_Sub1_Sub2_Sub4 local683;
							if (local78.anInt458 == 4) {
								local683 = local78.aClass1_Sub1_Sub2_Sub4_5;
								@Pc(686) String local686 = local78.aString19;
								@Pc(688) boolean local688 = false;
								if (this.anInt438 == local78.anInt456 || this.anInt445 == local78.anInt456 || this.anInt421 == local78.anInt456) {
									local688 = true;
								}
								if (this.method125(this.aBoolean59, local78)) {
									local162 = local78.anInt472;
									if (local688 && local78.anInt474 != 0) {
										local162 = local78.anInt474;
									}
									if (local78.aString20.length() > 0) {
										local686 = local78.aString20;
									}
								} else {
									local162 = local78.anInt471;
									if (local688 && local78.anInt473 != 0) {
										local162 = local78.anInt473;
									}
								}
								if (local78.anInt459 == 6 && this.aBoolean70) {
									local686 = "Please wait...";
									local162 = local78.anInt471;
								}
								if (Class1_Sub1_Sub2.anInt738 == 479) {
									if (local162 == 16776960) {
										local162 = 255;
									}
									if (local162 == 49152) {
										local162 = 16777215;
									}
								}
								local210 = local88 + local683.anInt751;
								while (local686.length() > 0) {
									if (local686.indexOf("%") != -1) {
										label351: while (true) {
											local212 = local686.indexOf("%1");
											if (local212 == -1) {
												while (true) {
													local212 = local686.indexOf("%2");
													if (local212 == -1) {
														while (true) {
															local212 = local686.indexOf("%3");
															if (local212 == -1) {
																while (true) {
																	local212 = local686.indexOf("%4");
																	if (local212 == -1) {
																		while (true) {
																			local212 = local686.indexOf("%5");
																			if (local212 == -1) {
																				break label351;
																			}
																			local686 = local686.substring(0, local212) + this.method99(this.method213(4, local78)) + local686.substring(local212 + 2);
																		}
																	}
																	local686 = local686.substring(0, local212) + this.method99(this.method213(3, local78)) + local686.substring(local212 + 2);
																}
															}
															local686 = local686.substring(0, local212) + this.method99(this.method213(2, local78)) + local686.substring(local212 + 2);
														}
													}
													local686 = local686.substring(0, local212) + this.method99(this.method213(1, local78)) + local686.substring(local212 + 2);
												}
											}
											local686 = local686.substring(0, local212) + this.method99(this.method213(0, local78)) + local686.substring(local212 + 2);
										}
									}
									local212 = local686.indexOf("\\n");
									@Pc(961) String local961;
									if (local212 == -1) {
										local961 = local686;
										local686 = "";
									} else {
										local961 = local686.substring(0, local212);
										local686 = local686.substring(local212 + 2);
									}
									if (local78.aBoolean99) {
										local683.method466(local162, local83 + local78.anInt461 / 2, local961, local210, local78.aBoolean100);
									} else {
										local683.method470(local78.aBoolean100, local961, local210, local162, local83);
									}
									local210 += local683.anInt751;
								}
							} else if (local78.anInt458 == 5) {
								@Pc(1024) Class1_Sub1_Sub2_Sub2 local1024;
								if (this.method125(this.aBoolean59, local78)) {
									local1024 = local78.aClass1_Sub1_Sub2_Sub2_15;
								} else {
									local1024 = local78.aClass1_Sub1_Sub2_Sub2_14;
								}
								if (local1024 != null) {
									local1024.method406(local83, local88);
								}
							} else if (local78.anInt458 == 6) {
								local160 = Class1_Sub1_Sub2_Sub1.anInt661;
								local162 = Class1_Sub1_Sub2_Sub1.anInt662;
								Class1_Sub1_Sub2_Sub1.anInt661 = local83 + local78.anInt461 / 2;
								Class1_Sub1_Sub2_Sub1.anInt662 = local88 + local78.anInt462 / 2;
								local166 = Class1_Sub1_Sub2_Sub1.anIntArray183[local78.anInt482] * local78.anInt481 >> 16;
								local177 = Class1_Sub1_Sub2_Sub1.anIntArray184[local78.anInt482] * local78.anInt481 >> 16;
								@Pc(1086) boolean local1086 = this.method125(this.aBoolean59, local78);
								if (local1086) {
									local210 = local78.anInt480;
								} else {
									local210 = local78.anInt479;
								}
								@Pc(1106) Class1_Sub1_Sub1_Sub5 local1106;
								if (local210 == -1) {
									local1106 = local78.method232(-1, local1086, -1);
								} else {
									@Pc(1112) Class27 local1112 = Class27.aClass27Array1[local210];
									local1106 = local78.method232(local1112.anIntArray227[local78.anInt454], local1086, local1112.anIntArray228[local78.anInt454]);
								}
								if (local1106 != null) {
									local1106.method308(local78.anInt483, 0, local78.anInt482, 0, local166, local177);
								}
								Class1_Sub1_Sub2_Sub1.anInt661 = local160;
								Class1_Sub1_Sub2_Sub1.anInt662 = local162;
							} else if (local78.anInt458 == 7) {
								local683 = local78.aClass1_Sub1_Sub2_Sub4_5;
								local162 = 0;
								for (local166 = 0; local166 < local78.anInt462; local166++) {
									for (local177 = 0; local177 < local78.anInt461; local177++) {
										if (local78.anIntArray96[local162] > 0) {
											@Pc(1176) Class15 local1176 = Class15.method345(local78.anIntArray96[local162] - 1);
											@Pc(1179) String local1179 = local1176.aString26;
											if (local1176.aBoolean152 || local78.anIntArray97[local162] != 1) {
												local1179 = local1179 + " x" + method135(local78.anIntArray97[local162]);
											}
											local212 = local83 + local177 * (local78.anInt469 + 115);
											local219 = local88 + local166 * (local78.anInt470 + 12);
											if (local78.aBoolean99) {
												local683.method466(local78.anInt471, local212 + local78.anInt461 / 2, local1179, local219, local78.aBoolean100);
											} else {
												local683.method470(local78.aBoolean100, local1179, local219, local78.anInt471, local212);
											}
										}
										local162++;
									}
								}
							}
						}
					}
				}
				Class1_Sub1_Sub2.method455(local33, local29, local35, local31);
				if (arg0 > 0) {
					;
				}
			}
		} catch (@Pc(1277) RuntimeException local1277) {
			signlink.reporterror("15333, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local1277.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method114(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt451; local8++) {
					if (this.aLongArray3[local8] == arg0) {
						this.anInt451--;
						this.aBoolean44 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt451; local28++) {
							this.aLongArray3[local28] = this.aLongArray3[local28 + 1];
						}
						this.aClass1_Sub1_Sub3_4.method487(193);
						this.aClass1_Sub1_Sub3_4.method494(arg0);
						break;
					}
				}
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("91840, " + arg0 + ", " + -608 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	private boolean method115(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(7) int local7 = 0; local7 < this.anInt439; local7++) {
				if (arg0.equalsIgnoreCase(this.aStringArray3[local7])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4);
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("25784, " + arg0 + ", " + -97 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method116() {
		try {
			@Pc(8) int local8;
			if (this.anInt319 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt319 > 768) {
						this.anIntArray91[local8] = this.method147(this.anIntArray92[local8], 1024 - this.anInt319, this.anIntArray93[local8]);
					} else if (this.anInt319 > 256) {
						this.anIntArray91[local8] = this.anIntArray93[local8];
					} else {
						this.anIntArray91[local8] = this.method147(this.anIntArray93[local8], 256 - this.anInt319, this.anIntArray92[local8]);
					}
				}
			} else if (this.anInt320 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt320 > 768) {
						this.anIntArray91[local8] = this.method147(this.anIntArray92[local8], 1024 - this.anInt320, this.anIntArray94[local8]);
					} else if (this.anInt320 > 256) {
						this.anIntArray91[local8] = this.anIntArray94[local8];
					} else {
						this.anIntArray91[local8] = this.method147(this.anIntArray94[local8], 256 - this.anInt320, this.anIntArray92[local8]);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray91[local8] = this.anIntArray92[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass37_13.anIntArray233[local8] = this.aClass1_Sub1_Sub2_Sub2_7.anIntArray210[local8];
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
				local198 = this.anIntArray50[local185] * (256 - local185) / 256;
				local202 = local198 + 22;
				if (local202 < 0) {
					local202 = 0;
				}
				local181 += local202;
				for (local212 = local202; local212 < 128; local212++) {
					local220 = this.anIntArray68[local181++];
					if (local220 == 0) {
						local183++;
					} else {
						local224 = local220;
						local228 = 256 - local220;
						local220 = this.anIntArray91[local220];
						local239 = this.aClass37_13.anIntArray233[local183];
						this.aClass37_13.anIntArray233[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			this.aClass37_13.method539(0, 0, super.aGraphics2);
			for (local198 = 0; local198 < 33920; local198++) {
				this.aClass37_14.anIntArray233[local198] = this.aClass1_Sub1_Sub2_Sub2_8.anIntArray210[local198];
			}
			local181 = 0;
			local183 = 1176;
			for (local202 = 1; local202 < 255; local202++) {
				local212 = this.anIntArray50[local202] * (256 - local202) / 256;
				local220 = 103 - local212;
				local183 += local212;
				for (local224 = 0; local224 < local220; local224++) {
					local228 = this.anIntArray68[local181++];
					if (local228 == 0) {
						local183++;
					} else {
						local239 = local228;
						@Pc(365) int local365 = 256 - local228;
						local228 = this.anIntArray91[local228];
						@Pc(376) int local376 = this.aClass37_14.anIntArray233[local183];
						this.aClass37_14.anIntArray233[local183++] = ((local228 & 0xFF00FF) * local239 + (local376 & 0xFF00FF) * local365 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local376 & 0xFF00) * local365 & 0xFF0000) >> 8;
					}
				}
				local181 += 128 - local220;
				local183 += 128 - local220 - local212;
			}
			this.aClass37_14.method539(0, 637, super.aGraphics2);
		} catch (@Pc(448) RuntimeException local448) {
			signlink.reporterror("71014, " + 0 + ", " + local448.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method118() {
		try {
			if (this.aClass37_6 == null) {
				this.method212();
				super.aClass37_2 = null;
				this.aClass37_10 = null;
				this.aClass37_11 = null;
				this.aClass37_12 = null;
				this.aClass37_13 = null;
				this.aClass37_14 = null;
				this.aClass37_15 = null;
				this.aClass37_16 = null;
				this.aClass37_17 = null;
				this.aClass37_18 = null;
				this.aClass37_6 = new Class37(true, this.method95(), 479, 96);
				this.aClass37_4 = new Class37(true, this.method95(), 172, 156);
				Class1_Sub1_Sub2.method456();
				this.aClass1_Sub1_Sub2_Sub3_10.method445(0, 0);
				this.aClass37_3 = new Class37(true, this.method95(), 190, 261);
				this.aClass37_5 = new Class37(true, this.method95(), 512, 334);
				Class1_Sub1_Sub2.method456();
				this.aClass37_7 = new Class37(true, this.method95(), 496, 50);
				this.aClass37_8 = new Class37(true, this.method95(), 269, 37);
				this.aClass37_9 = new Class37(true, this.method95(), 249, 45);
				this.aBoolean75 = true;
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("13237, " + 15583 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method94() {
		try {
			this.aBoolean75 = true;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("8462, " + 0 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt261 = Integer.parseInt(this.getParameter("nodeid"));
		anInt262 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method227();
		} else {
			method210();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean47 = false;
		} else {
			aBoolean47 = true;
		}
		this.method86();
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method119() {
		try {
			this.aBoolean73 = true;
			for (@Pc(6) int local6 = 0; local6 < 7; local6++) {
				this.anIntArray53[local6] = -1;
				for (@Pc(15) int local15 = 0; local15 < Class23.anInt752; local15++) {
					if (!Class23.aClass23Array1[local15].aBoolean190 && Class23.aClass23Array1[local15].anInt753 == local6 + (this.aBoolean77 ? 0 : 7)) {
						this.anIntArray53[local6] = local15;
						break;
					}
				}
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("66136, " + false + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method120() {
		try {
			this.aBoolean46 &= true;
			signlink.anInt935 = 0;
			signlink.midi = "stop";
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("20192, " + true + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!ob;)V")
	private void method121(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2 arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = -1;
			@Pc(9) int local9 = 0;
			@Pc(11) int local11 = 0;
			if (arg1.anInt823 == 0) {
				local5 = this.aClass39_1.method570(arg1.anInt822, arg1.anInt824, arg1.anInt825);
			}
			if (arg1.anInt823 == 1) {
				local5 = this.aClass39_1.method571(arg1.anInt824, arg1.anInt822, arg1.anInt825);
			}
			if (arg1.anInt823 == 2) {
				local5 = this.aClass39_1.method572(arg1.anInt822, arg1.anInt824, arg1.anInt825);
			}
			if (arg1.anInt823 == 3) {
				local5 = this.aClass39_1.method573(arg1.anInt822, arg1.anInt824, arg1.anInt825);
			}
			if (local5 != 0) {
				@Pc(80) int local80 = this.aClass39_1.method574(arg1.anInt822, arg1.anInt824, arg1.anInt825, local5);
				local7 = local5 >> 14 & 0x7FFF;
				local9 = local80 & 0x1F;
				local11 = local80 >> 6;
			}
			arg1.anInt826 = local7;
			arg1.anInt828 = local9;
			arg1.anInt827 = local11;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("1065, " + arg0 + ", " + arg1 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method122() {
		try {
			this.aClass37_3.method538((byte) 9);
			Class1_Sub1_Sub2_Sub1.anIntArray185 = this.anIntArray88;
			this.aClass1_Sub1_Sub2_Sub3_9.method445(0, 0);
			if (this.anInt429 != -1) {
				this.method113(anInt347, 0, Class6.aClass6Array1[this.anInt429], 0, 0);
			} else if (this.anIntArray71[this.anInt263] != -1) {
				this.method113(anInt347, 0, Class6.aClass6Array1[this.anIntArray71[this.anInt263]], 0, 0);
			}
			if (this.aBoolean63 && this.anInt249 == 1) {
				this.method215();
			}
			this.aClass37_3.method539(205, 553, super.aGraphics2);
			this.aClass37_5.method538((byte) 9);
			Class1_Sub1_Sub2_Sub1.anIntArray185 = this.anIntArray89;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("95300, " + 874 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)Z")
	private boolean method123() {
		try {
			this.aBoolean46 &= true;
			if (this.aClass8_1 == null) {
				return false;
			}
			@Pc(2740) String local2740;
			@Pc(286) int local286;
			try {
				@Pc(16) int local16 = this.aClass8_1.method246();
				if (local16 == 0) {
					return false;
				}
				if (this.anInt350 == -1) {
					this.aClass8_1.method247(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 1);
					this.anInt350 = this.aClass1_Sub1_Sub3_3.aByteArray9[0] & 0xFF;
					if (this.aClass47_1 != null) {
						this.anInt350 = this.anInt350 - this.aClass47_1.method674() & 0xFF;
					}
					this.anInt349 = Class17.anIntArray190[this.anInt350];
					local16--;
				}
				if (this.anInt349 == -1) {
					if (local16 <= 0) {
						return false;
					}
					this.aClass8_1.method247(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 1);
					this.anInt349 = this.aClass1_Sub1_Sub3_3.aByteArray9[0] & 0xFF;
					local16--;
				}
				if (this.anInt349 == -2) {
					if (local16 <= 1) {
						return false;
					}
					this.aClass8_1.method247(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 2);
					this.aClass1_Sub1_Sub3_3.anInt777 = 0;
					this.anInt349 = this.aClass1_Sub1_Sub3_3.method500();
					local16 -= 2;
				}
				if (local16 < this.anInt349) {
					return false;
				}
				this.aClass1_Sub1_Sub3_3.anInt777 = 0;
				this.aClass8_1.method247(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, this.anInt349);
				this.anInt351 = 0;
				this.anInt408 = this.anInt407;
				this.anInt407 = this.anInt406;
				this.anInt406 = this.anInt350;
				@Pc(160) int local160;
				if (this.anInt350 == 141) {
					local160 = this.aClass1_Sub1_Sub3_3.method500();
					this.method188(local160);
					if (this.anInt429 != -1) {
						this.anInt429 = -1;
						this.aBoolean44 = true;
						this.aBoolean58 = true;
					}
					this.anInt413 = local160;
					this.aBoolean79 = true;
					this.anInt399 = -1;
					this.aBoolean70 = false;
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 197) {
					local160 = this.aClass1_Sub1_Sub3_3.method500();
					this.method188(local160);
					if (this.anInt429 != -1) {
						this.anInt429 = -1;
						this.aBoolean44 = true;
						this.aBoolean58 = true;
					}
					if (this.anInt413 != -1) {
						this.anInt413 = -1;
						this.aBoolean79 = true;
					}
					if (this.aBoolean85) {
						this.aBoolean85 = false;
						this.aBoolean79 = true;
					}
					this.anInt399 = local160;
					this.aBoolean70 = false;
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 167) {
					this.aBoolean60 = false;
					for (local160 = 0; local160 < 5; local160++) {
						this.aBooleanArray5[local160] = false;
					}
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 204) {
					local160 = this.aClass1_Sub1_Sub3_3.method498();
					local286 = this.aClass1_Sub1_Sub3_3.method498();
					@Pc(290) String local290 = this.aClass1_Sub1_Sub3_3.method505();
					if (local160 >= 1 && local160 <= 5) {
						if (local290.equalsIgnoreCase("null")) {
							local290 = null;
						}
						this.aStringArray6[local160 - 1] = local290;
						this.aBooleanArray4[local160 - 1] = local286 == 0;
					}
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 146) {
					this.anInt292 = this.aClass1_Sub1_Sub3_3.method503();
					this.anInt298 = this.aClass1_Sub1_Sub3_3.method500();
					this.anInt446 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt306 = this.aClass1_Sub1_Sub3_3.method500();
					this.anInt402 = this.aClass1_Sub1_Sub3_3.method498();
					if (this.anInt292 != 0 && this.anInt399 == -1) {
						signlink.dnslookup(Class49.method682(this.anInt292));
						this.method109();
						@Pc(371) short local371 = 650;
						if (this.anInt446 != 201 || this.anInt402 == 1) {
							local371 = 655;
						}
						this.aString12 = "";
						this.aBoolean86 = false;
						for (local286 = 0; local286 < Class6.aClass6Array1.length; local286++) {
							if (Class6.aClass6Array1[local286] != null && Class6.aClass6Array1[local286].anInt460 == local371) {
								this.anInt399 = Class6.aClass6Array1[local286].anInt457;
								break;
							}
						}
					}
					this.anInt350 = -1;
					return true;
				}
				@Pc(435) int local435;
				if (this.anInt350 == 222) {
					local160 = this.aClass1_Sub1_Sub3_3.method500();
					local286 = this.aClass1_Sub1_Sub3_3.method500();
					local435 = this.aClass1_Sub1_Sub3_3.method500();
					@Pc(438) Class15 local438 = Class15.method345(local286);
					Class6.aClass6Array1[local160].anInt475 = 4;
					Class6.aClass6Array1[local160].anInt476 = local286;
					Class6.aClass6Array1[local160].anInt482 = local438.anInt615;
					Class6.aClass6Array1[local160].anInt483 = local438.anInt616;
					Class6.aClass6Array1[local160].anInt481 = local438.anInt614 * 100 / local435;
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 63) {
					this.anInt451 = this.anInt349 / 8;
					for (local160 = 0; local160 < this.anInt451; local160++) {
						this.aLongArray3[local160] = this.aClass1_Sub1_Sub3_3.method504();
					}
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 27) {
					local160 = this.aClass1_Sub1_Sub3_3.method500();
					local286 = this.aClass1_Sub1_Sub3_3.method501();
					local435 = this.aClass1_Sub1_Sub3_3.method501();
					@Pc(527) Class6 local527 = Class6.aClass6Array1[local160];
					local527.anInt463 = local286;
					local527.anInt464 = local435;
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 196) {
					local160 = this.aClass1_Sub1_Sub3_3.method500();
					local286 = this.aClass1_Sub1_Sub3_3.method503();
					this.anIntArray74[local160] = local286;
					if (this.anIntArray41[local160] != local286) {
						this.anIntArray41[local160] = local286;
						this.method142(local160);
						this.aBoolean44 = true;
						if (this.anInt283 != -1) {
							this.aBoolean79 = true;
						}
					}
					this.anInt350 = -1;
					return true;
				}
				@Pc(606) int local606;
				@Pc(619) int local619;
				@Pc(600) Class6 local600;
				if (this.anInt350 == 28) {
					this.aBoolean44 = true;
					local160 = this.aClass1_Sub1_Sub3_3.method500();
					local600 = Class6.aClass6Array1[local160];
					local435 = this.aClass1_Sub1_Sub3_3.method498();
					for (local606 = 0; local606 < local435; local606++) {
						local600.anIntArray96[local606] = this.aClass1_Sub1_Sub3_3.method500();
						local619 = this.aClass1_Sub1_Sub3_3.method498();
						if (local619 == 255) {
							local619 = this.aClass1_Sub1_Sub3_3.method503();
						}
						local600.anIntArray97[local606] = local619;
					}
					for (local619 = local435; local619 < local600.anIntArray96.length; local619++) {
						local600.anIntArray96[local619] = 0;
						local600.anIntArray97[local619] = 0;
					}
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 136) {
					this.aBoolean44 = true;
					local160 = this.aClass1_Sub1_Sub3_3.method498();
					local286 = this.aClass1_Sub1_Sub3_3.method503();
					local435 = this.aClass1_Sub1_Sub3_3.method498();
					this.anIntArray85[local160] = local286;
					this.anIntArray65[local160] = local435;
					this.anIntArray70[local160] = 1;
					for (local606 = 0; local606 < 98; local606++) {
						if (local286 >= anIntArray73[local606]) {
							this.anIntArray70[local160] = local606 + 2;
						}
					}
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 187) {
					local160 = this.aClass1_Sub1_Sub3_3.method500();
					this.method188(local160);
					if (this.anInt413 != -1) {
						this.anInt413 = -1;
						this.aBoolean79 = true;
					}
					if (this.aBoolean85) {
						this.aBoolean85 = false;
						this.aBoolean79 = true;
					}
					this.anInt429 = local160;
					this.aBoolean44 = true;
					this.aBoolean58 = true;
					this.anInt399 = -1;
					this.aBoolean70 = false;
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 249) {
					local160 = this.aClass1_Sub1_Sub3_3.method500();
					local286 = this.aClass1_Sub1_Sub3_3.method500();
					if (this.anInt413 != -1) {
						this.anInt413 = -1;
						this.aBoolean79 = true;
					}
					if (this.aBoolean85) {
						this.aBoolean85 = false;
						this.aBoolean79 = true;
					}
					this.anInt399 = local160;
					this.anInt429 = local286;
					this.aBoolean44 = true;
					this.aBoolean58 = true;
					this.aBoolean70 = false;
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 5) {
					this.aBoolean81 = false;
					this.aBoolean85 = true;
					this.aString16 = "";
					this.aBoolean79 = true;
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 239) {
					local160 = this.aClass1_Sub1_Sub3_3.method501();
					this.anInt283 = local160;
					this.aBoolean79 = true;
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 38) {
					local160 = this.aClass1_Sub1_Sub3_3.method500();
					local286 = this.aClass1_Sub1_Sub3_3.method500();
					local435 = local286 >> 10 & 0x1F;
					local606 = local286 >> 5 & 0x1F;
					local619 = local286 & 0x1F;
					Class6.aClass6Array1[local160].anInt471 = (local435 << 19) + (local606 << 11) + (local619 << 3);
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 64) {
					this.anInt368 = this.aClass1_Sub1_Sub3_3.method498();
					if (this.anInt368 == 1) {
						this.anInt259 = this.aClass1_Sub1_Sub3_3.method500();
					}
					if (this.anInt368 >= 2 && this.anInt368 <= 6) {
						if (this.anInt368 == 2) {
							this.anInt377 = 64;
							this.anInt378 = 64;
						}
						if (this.anInt368 == 3) {
							this.anInt377 = 0;
							this.anInt378 = 64;
						}
						if (this.anInt368 == 4) {
							this.anInt377 = 128;
							this.anInt378 = 64;
						}
						if (this.anInt368 == 5) {
							this.anInt377 = 64;
							this.anInt378 = 0;
						}
						if (this.anInt368 == 6) {
							this.anInt377 = 64;
							this.anInt378 = 128;
						}
						this.anInt368 = 2;
						this.anInt374 = this.aClass1_Sub1_Sub3_3.method500();
						this.anInt375 = this.aClass1_Sub1_Sub3_3.method500();
						this.anInt376 = this.aClass1_Sub1_Sub3_3.method498();
					}
					if (this.anInt368 == 10) {
						this.anInt355 = this.aClass1_Sub1_Sub3_3.method500();
					}
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 159) {
					this.anInt436 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt437 = this.aClass1_Sub1_Sub3_3.method498();
					for (local160 = this.anInt436; local160 < this.anInt436 + 8; local160++) {
						for (local286 = this.anInt437; local286 < this.anInt437 + 8; local286++) {
							if (this.aClass31ArrayArrayArray1[this.anInt278][local160][local286] != null) {
								this.aClass31ArrayArrayArray1[this.anInt278][local160][local286] = null;
								this.method196(local160, local286);
							}
						}
					}
					for (@Pc(1084) Class1_Sub2 local1084 = (Class1_Sub2) this.aClass31_3.method523(); local1084 != null; local1084 = (Class1_Sub2) this.aClass31_3.method525()) {
						if (local1084.anInt824 >= this.anInt436 && local1084.anInt824 < this.anInt436 + 8 && local1084.anInt825 >= this.anInt437 && local1084.anInt825 < this.anInt437 + 8 && local1084.anInt822 == this.anInt278) {
							local1084.anInt833 = 0;
						}
					}
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 161) {
					local160 = this.aClass1_Sub1_Sub3_3.method500();
					Class6.aClass6Array1[local160].anInt475 = 3;
					Class6.aClass6Array1[local160].anInt476 = (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray19[0] << 24) + (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray19[4] << 18) + (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray18[0] << 12) + (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray18[8] << 6) + aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray18[11];
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 225) {
					local160 = this.aClass1_Sub1_Sub3_3.method498();
					local286 = this.aClass1_Sub1_Sub3_3.method498();
					local435 = this.aClass1_Sub1_Sub3_3.method498();
					local606 = this.aClass1_Sub1_Sub3_3.method498();
					this.aBooleanArray5[local160] = true;
					this.anIntArray46[local160] = local286;
					this.anIntArray81[local160] = local435;
					this.anIntArray52[local160] = local606;
					this.anIntArray64[local160] = 0;
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 213) {
					this.anInt409 = this.aClass1_Sub1_Sub3_3.method500();
					this.anInt385 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 170) {
					this.aBoolean44 = true;
					local160 = this.aClass1_Sub1_Sub3_3.method500();
					local600 = Class6.aClass6Array1[local160];
					while (this.aClass1_Sub1_Sub3_3.anInt777 < this.anInt349) {
						local435 = this.aClass1_Sub1_Sub3_3.method498();
						local606 = this.aClass1_Sub1_Sub3_3.method500();
						local619 = this.aClass1_Sub1_Sub3_3.method498();
						if (local619 == 255) {
							local619 = this.aClass1_Sub1_Sub3_3.method503();
						}
						if (local435 >= 0 && local435 < local600.anIntArray96.length) {
							local600.anIntArray96[local435] = local606;
							local600.anIntArray97[local435] = local619;
						}
					}
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 138) {
					this.anInt263 = this.aClass1_Sub1_Sub3_3.method498();
					this.aBoolean44 = true;
					this.aBoolean58 = true;
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 255) {
					this.anInt440 = this.aClass1_Sub1_Sub3_3.method498();
					this.aBoolean44 = true;
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 61) {
					this.anInt436 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt437 = this.aClass1_Sub1_Sub3_3.method498();
					while (this.aClass1_Sub1_Sub3_3.anInt777 < this.anInt349) {
						local160 = this.aClass1_Sub1_Sub3_3.method498();
						this.method168(local160, this.aClass1_Sub1_Sub3_3, this.anInt397);
					}
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 75) {
					this.anInt317 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 55) {
					this.aBoolean60 = true;
					this.anInt293 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt294 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt295 = this.aClass1_Sub1_Sub3_3.method500();
					this.anInt296 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt297 = this.aClass1_Sub1_Sub3_3.method498();
					if (this.anInt297 >= 100) {
						this.anInt271 = this.anInt293 * 128 + 64;
						this.anInt273 = this.anInt294 * 128 + 64;
						this.anInt272 = this.method137(this.anInt273, this.anInt278, this.anInt271) - this.anInt295;
					}
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 173) {
					this.anInt436 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt437 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 29) {
					@Pc(1504) Class1_Sub1_Sub3 local1504 = Class10.method269();
					if (local1504 != null) {
						this.aClass1_Sub1_Sub3_4.method487(142);
						this.aClass1_Sub1_Sub3_4.method489(local1504.anInt777);
						this.aClass1_Sub1_Sub3_4.method496(local1504.aByteArray9, local1504.anInt777);
						local1504.method486();
					}
					this.anInt350 = -1;
					return true;
				}
				@Pc(1608) int local1608;
				@Pc(1619) int local1619;
				if (this.anInt350 == 0) {
					this.aBoolean60 = true;
					this.anInt416 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt417 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt418 = this.aClass1_Sub1_Sub3_3.method500();
					this.anInt419 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt420 = this.aClass1_Sub1_Sub3_3.method498();
					if (this.anInt420 >= 100) {
						local160 = this.anInt416 * 128 + 64;
						local286 = this.anInt417 * 128 + 64;
						local435 = this.method137(local286, this.anInt278, local160) - this.anInt418;
						local606 = local160 - this.anInt271;
						local619 = local435 - this.anInt272;
						local1608 = local286 - this.anInt273;
						local1619 = (int) Math.sqrt((double) (local606 * local606 + local1608 * local1608));
						this.anInt274 = (int) (Math.atan2((double) local619, (double) local1619) * 325.949D) & 0x7FF;
						this.anInt275 = (int) (Math.atan2((double) local606, (double) local1608) * -325.949D) & 0x7FF;
						if (this.anInt274 < 128) {
							this.anInt274 = 128;
						}
						if (this.anInt274 > 383) {
							this.anInt274 = 383;
						}
					}
					this.anInt350 = -1;
					return true;
				}
				@Pc(1678) Class6 local1678;
				if (this.anInt350 == 95) {
					local160 = this.aClass1_Sub1_Sub3_3.method500();
					local286 = this.aClass1_Sub1_Sub3_3.method501();
					local1678 = Class6.aClass6Array1[local160];
					local1678.anInt479 = local286;
					if (local286 == -1) {
						local1678.anInt454 = 0;
						local1678.anInt455 = 0;
					}
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 94) {
					if (this.anInt263 == 12) {
						this.aBoolean44 = true;
					}
					this.anInt307 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 58) {
					this.anInt447 = this.aClass1_Sub1_Sub3_3.method498();
					if (this.anInt447 == this.anInt263) {
						if (this.anInt447 == 3) {
							this.anInt263 = 1;
						} else {
							this.anInt263 = 3;
						}
						this.aBoolean44 = true;
					}
					this.anInt350 = -1;
					return true;
				}
				@Pc(1759) long local1759;
				@Pc(1769) boolean local1769;
				if (this.anInt350 == 60) {
					local1759 = this.aClass1_Sub1_Sub3_3.method504();
					local435 = this.aClass1_Sub1_Sub3_3.method503();
					local606 = this.aClass1_Sub1_Sub3_3.method498();
					local1769 = false;
					for (local1608 = 0; local1608 < 100; local1608++) {
						if (this.anIntArray45[local1608] == local435) {
							local1769 = true;
							break;
						}
					}
					if (local606 <= 1) {
						for (local1619 = 0; local1619 < this.anInt451; local1619++) {
							if (this.aLongArray3[local1619] == local1759) {
								local1769 = true;
								break;
							}
						}
					}
					if (!local1769 && this.anInt362 == 0) {
						try {
							this.anIntArray45[this.anInt434] = local435;
							this.anInt434 = (this.anInt434 + 1) % 100;
							@Pc(1838) String local1838 = Class2.method40(this.aClass1_Sub1_Sub3_3, this.anInt349 - 13);
							@Pc(1842) String local1842 = Class41.method613(local1838);
							if (local606 == 2 || local606 == 3) {
								this.method182("@cr2@" + Class49.method683(Class49.method680(local1759)), 7, this.anInt433, local1842);
							} else if (local606 == 1) {
								this.method182("@cr1@" + Class49.method683(Class49.method680(local1759)), 7, this.anInt433, local1842);
							} else {
								this.method182(Class49.method683(Class49.method680(local1759)), 3, this.anInt433, local1842);
							}
						} catch (@Pc(1902) Exception local1902) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 143) {
					this.anInt363 = this.aClass1_Sub1_Sub3_3.method500() * 30;
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 14) {
					local160 = this.aClass1_Sub1_Sub3_3.method500();
					local286 = this.aClass1_Sub1_Sub3_3.method500();
					local1678 = Class6.aClass6Array1[local160];
					if (local1678 != null && local1678.anInt458 == 0) {
						if (local286 < 0) {
							local286 = 0;
						}
						if (local286 > local1678.anInt466 - local1678.anInt462) {
							local286 = local1678.anInt466 - local1678.anInt462;
						}
						local1678.anInt467 = local286;
					}
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 3) {
					local160 = this.aClass1_Sub1_Sub3_3.method500();
					local286 = this.aClass1_Sub1_Sub3_3.method500();
					Class6.aClass6Array1[local160].anInt475 = 2;
					Class6.aClass6Array1[local160].anInt476 = local286;
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 164) {
					if (this.anInt263 == 12) {
						this.aBoolean44 = true;
					}
					this.anInt340 = this.aClass1_Sub1_Sub3_3.method501();
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 168) {
					local160 = this.aClass1_Sub1_Sub3_3.method500();
					local600 = Class6.aClass6Array1[local160];
					for (local435 = 0; local435 < local600.anIntArray96.length; local435++) {
						local600.anIntArray96[local435] = -1;
						local600.anIntArray96[local435] = 0;
					}
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 123) {
					this.method170(this.aClass1_Sub1_Sub3_3, this.anInt349);
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 211) {
					local160 = this.aClass1_Sub1_Sub3_3.method500();
					local286 = this.aClass1_Sub1_Sub3_3.method500();
					Class6.aClass6Array1[local160].anInt475 = 1;
					Class6.aClass6Array1[local160].anInt476 = local286;
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 140) {
					for (local160 = 0; local160 < this.anIntArray41.length; local160++) {
						if (this.anIntArray41[local160] != this.anIntArray74[local160]) {
							this.anIntArray41[local160] = this.anIntArray74[local160];
							this.method142(local160);
							this.aBoolean44 = true;
						}
					}
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 91) {
					local160 = this.aClass1_Sub1_Sub3_3.method500();
					local286 = this.aClass1_Sub1_Sub3_3.method498();
					if (local160 == 65535) {
						local160 = -1;
					}
					this.anIntArray71[local286] = local160;
					this.aBoolean44 = true;
					this.aBoolean58 = true;
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 21) {
					this.method146();
					this.anInt350 = -1;
					return false;
				}
				if (this.anInt350 == 163) {
					local160 = this.aClass1_Sub1_Sub3_3.method500();
					if (local160 == 65535) {
						local160 = -1;
					}
					if (local160 != this.anInt432 && this.aBoolean55 && !aBoolean48 && this.anInt414 == 0) {
						this.anInt441 = local160;
						this.aBoolean83 = true;
						this.aClass45_Sub1_1.method657(2, this.anInt441);
					}
					this.anInt432 = local160;
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 242) {
					local160 = this.aClass1_Sub1_Sub3_3.method500();
					local286 = this.aClass1_Sub1_Sub3_3.method500();
					if (this.aBoolean55 && !aBoolean48) {
						this.anInt441 = local160;
						this.aBoolean83 = false;
						this.aClass45_Sub1_1.method657(2, this.anInt441);
						this.anInt414 = local286;
					}
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 174) {
					if (this.anInt429 != -1) {
						this.anInt429 = -1;
						this.aBoolean44 = true;
						this.aBoolean58 = true;
					}
					if (this.anInt413 != -1) {
						this.anInt413 = -1;
						this.aBoolean79 = true;
					}
					if (this.aBoolean85) {
						this.aBoolean85 = false;
						this.aBoolean79 = true;
					}
					this.anInt399 = -1;
					this.aBoolean70 = false;
					this.anInt350 = -1;
					return true;
				}
				@Pc(2475) int local2475;
				if (this.anInt350 == 111) {
					local1759 = this.aClass1_Sub1_Sub3_3.method504();
					local435 = this.aClass1_Sub1_Sub3_3.method498();
					@Pc(2336) String local2336 = Class49.method683(Class49.method680(local1759));
					for (local619 = 0; local619 < this.anInt439; local619++) {
						if (local1759 == this.aLongArray4[local619]) {
							if (this.anIntArray84[local619] != local435) {
								this.anIntArray84[local619] = local435;
								this.aBoolean44 = true;
								if (local435 > 0) {
									this.method182("", 5, this.anInt433, local2336 + " has logged in.");
								}
								if (local435 == 0) {
									this.method182("", 5, this.anInt433, local2336 + " has logged out.");
								}
							}
							local2336 = null;
							break;
						}
					}
					if (local2336 != null && this.anInt439 < 200) {
						this.aLongArray4[this.anInt439] = local1759;
						this.aStringArray3[this.anInt439] = local2336;
						this.anIntArray84[this.anInt439] = local435;
						this.anInt439++;
						this.aBoolean44 = true;
					}
					@Pc(2436) boolean local2436 = false;
					while (!local2436) {
						local2436 = true;
						for (local1619 = 0; local1619 < this.anInt439 - 1; local1619++) {
							if (this.anIntArray84[local1619] != anInt261 && this.anIntArray84[local1619 + 1] == anInt261 || this.anIntArray84[local1619] == 0 && this.anIntArray84[local1619 + 1] != 0) {
								local2475 = this.anIntArray84[local1619];
								this.anIntArray84[local1619] = this.anIntArray84[local1619 + 1];
								this.anIntArray84[local1619 + 1] = local2475;
								@Pc(2497) String local2497 = this.aStringArray3[local1619];
								this.aStringArray3[local1619] = this.aStringArray3[local1619 + 1];
								this.aStringArray3[local1619 + 1] = local2497;
								@Pc(2519) long local2519 = this.aLongArray4[local1619];
								this.aLongArray4[local1619] = this.aLongArray4[local1619 + 1];
								this.aLongArray4[local1619 + 1] = local2519;
								this.aBoolean44 = true;
								local2436 = false;
							}
						}
					}
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 85) {
					local160 = this.aClass1_Sub1_Sub3_3.method501();
					if (local160 >= 0) {
						this.method188(local160);
					}
					this.anInt415 = local160;
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 87) {
					this.method216(this.aClass1_Sub1_Sub3_3, this.anInt349);
					this.aBoolean67 = false;
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 203) {
					for (local160 = 0; local160 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length; local160++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local160] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local160].anInt150 = -1;
						}
					}
					for (local286 = 0; local286 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length; local286++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local286] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local286].anInt150 = -1;
						}
					}
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 227) {
					local160 = this.aClass1_Sub1_Sub3_3.method500();
					@Pc(2664) boolean local2664 = this.aClass1_Sub1_Sub3_3.method498() == 1;
					Class6.aClass6Array1[local160].aBoolean92 = local2664;
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 25) {
					local160 = this.aClass1_Sub1_Sub3_3.method500();
					local286 = this.aClass1_Sub1_Sub3_3.method498();
					local435 = this.aClass1_Sub1_Sub3_3.method500();
					if (this.aBoolean57 && !aBoolean48 && this.anInt304 < 50) {
						this.anIntArray34[this.anInt304] = local160;
						this.anIntArray61[this.anInt304] = local286;
						this.anIntArray51[this.anInt304] = local435 + Class5.anIntArray31[local160];
						this.anInt304++;
					}
					this.anInt350 = -1;
					return true;
				}
				@Pc(2751) String local2751;
				if (this.anInt350 == 73) {
					local2740 = this.aClass1_Sub1_Sub3_3.method505();
					@Pc(2754) long local2754;
					if (local2740.endsWith(":tradereq:")) {
						local2751 = local2740.substring(0, local2740.indexOf(":"));
						local2754 = Class49.method679(local2751);
						local1769 = false;
						for (local1608 = 0; local1608 < this.anInt451; local1608++) {
							if (this.aLongArray3[local1608] == local2754) {
								local1769 = true;
								break;
							}
						}
						if (!local1769 && this.anInt362 == 0) {
							this.method182(local2751, 4, this.anInt433, "wishes to trade with you.");
						}
					} else if (local2740.endsWith(":duelreq:")) {
						local2751 = local2740.substring(0, local2740.indexOf(":"));
						local2754 = Class49.method679(local2751);
						local1769 = false;
						for (local1608 = 0; local1608 < this.anInt451; local1608++) {
							if (this.aLongArray3[local1608] == local2754) {
								local1769 = true;
								break;
							}
						}
						if (!local1769 && this.anInt362 == 0) {
							this.method182(local2751, 8, this.anInt433, "wishes to duel with you.");
						}
					} else {
						this.method182("", 0, this.anInt433, local2740);
					}
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 41) {
					local160 = this.aClass1_Sub1_Sub3_3.method500();
					local2751 = this.aClass1_Sub1_Sub3_3.method505();
					Class6.aClass6Array1[local160].aString19 = local2751;
					if (Class6.aClass6Array1[local160].anInt457 == this.anIntArray71[this.anInt263]) {
						this.aBoolean44 = true;
					}
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 24) {
					this.anInt422 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt444 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt410 = this.aClass1_Sub1_Sub3_3.method498();
					this.aBoolean49 = true;
					this.aBoolean79 = true;
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 108) {
					this.anInt290 = 0;
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 209) {
					local160 = this.aClass1_Sub1_Sub3_3.method500();
					local286 = this.aClass1_Sub1_Sub3_3.method500();
					if (this.anInt379 == local160 && this.anInt380 == local286 && this.anInt301 == 2) {
						this.anInt350 = -1;
						return true;
					}
					this.anInt379 = local160;
					this.anInt380 = local286;
					this.anInt381 = (this.anInt379 - 6) * 8;
					this.anInt382 = (this.anInt380 - 6) * 8;
					this.aBoolean51 = false;
					if ((this.anInt379 / 8 == 48 || this.anInt379 / 8 == 49) && this.anInt380 / 8 == 48) {
						this.aBoolean51 = true;
					}
					if (this.anInt379 / 8 == 48 && this.anInt380 / 8 == 148) {
						this.aBoolean51 = true;
					}
					this.anInt301 = 1;
					this.aLong18 = System.currentTimeMillis();
					this.aClass37_5.method538((byte) 9);
					this.aClass1_Sub1_Sub2_Sub4_2.method465(151, "Loading - please wait.", 257, 0);
					this.aClass1_Sub1_Sub2_Sub4_2.method465(150, "Loading - please wait.", 256, 16777215);
					this.aClass37_5.method539(4, 4, super.aGraphics2);
					local435 = 0;
					for (local606 = (this.anInt379 - 6) / 8; local606 <= (this.anInt379 + 6) / 8; local606++) {
						for (local619 = (this.anInt380 - 6) / 8; local619 <= (this.anInt380 + 6) / 8; local619++) {
							local435++;
						}
					}
					this.aByteArrayArray2 = new byte[local435][];
					this.aByteArrayArray1 = new byte[local435][];
					this.anIntArray77 = new int[local435];
					this.anIntArray78 = new int[local435];
					this.anIntArray79 = new int[local435];
					local435 = 0;
					for (local619 = (this.anInt379 - 6) / 8; local619 <= (this.anInt379 + 6) / 8; local619++) {
						for (local1608 = (this.anInt380 - 6) / 8; local1608 <= (this.anInt380 + 6) / 8; local1608++) {
							this.anIntArray77[local435] = (local619 << 8) + local1608;
							if (this.aBoolean51 && (local1608 == 49 || local1608 == 149 || local1608 == 147 || local619 == 50 || local619 == 49 && local1608 == 47)) {
								this.anIntArray78[local435] = -1;
								this.anIntArray79[local435] = -1;
								local435++;
							} else {
								local1619 = this.anIntArray78[local435] = this.aClass45_Sub1_1.method652(local619, local1608, 0, anInt312);
								if (local1619 != -1) {
									this.aClass45_Sub1_1.method657(3, local1619);
								}
								local2475 = this.anIntArray79[local435] = this.aClass45_Sub1_1.method652(local619, local1608, 1, anInt312);
								if (local2475 != -1) {
									this.aClass45_Sub1_1.method657(3, local2475);
								}
								local435++;
							}
						}
					}
					local1608 = this.anInt381 - this.anInt383;
					local1619 = this.anInt382 - this.anInt384;
					this.anInt383 = this.anInt381;
					this.anInt384 = this.anInt382;
					for (local2475 = 0; local2475 < 16384; local2475++) {
						@Pc(3265) Class1_Sub1_Sub1_Sub1_Sub1 local3265 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local2475];
						if (local3265 != null) {
							for (@Pc(3269) int local3269 = 0; local3269 < 10; local3269++) {
								local3265.anIntArray16[local3269] -= local1608;
								local3265.anIntArray17[local3269] -= local1619;
							}
							local3265.anInt127 -= local1608 * 128;
							local3265.anInt128 -= local1619 * 128;
						}
					}
					for (@Pc(3313) int local3313 = 0; local3313 < this.anInt331; local3313++) {
						@Pc(3320) Class1_Sub1_Sub1_Sub1_Sub2 local3320 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local3313];
						if (local3320 != null) {
							for (@Pc(3324) int local3324 = 0; local3324 < 10; local3324++) {
								local3320.anIntArray16[local3324] -= local1608;
								local3320.anIntArray17[local3324] -= local1619;
							}
							local3320.anInt127 -= local1608 * 128;
							local3320.anInt128 -= local1619 * 128;
						}
					}
					this.aBoolean67 = true;
					@Pc(3372) byte local3372 = 0;
					@Pc(3374) byte local3374 = 104;
					@Pc(3376) byte local3376 = 1;
					if (local1608 < 0) {
						local3372 = 103;
						local3374 = -1;
						local3376 = -1;
					}
					@Pc(3386) byte local3386 = 0;
					@Pc(3388) byte local3388 = 104;
					@Pc(3390) byte local3390 = 1;
					if (local1619 < 0) {
						local3386 = 103;
						local3388 = -1;
						local3390 = -1;
					}
					for (@Pc(3400) int local3400 = local3372; local3400 != local3374; local3400 += local3376) {
						for (@Pc(3404) int local3404 = local3386; local3404 != local3388; local3404 += local3390) {
							@Pc(3410) int local3410 = local3400 + local1608;
							@Pc(3414) int local3414 = local3404 + local1619;
							for (@Pc(3416) int local3416 = 0; local3416 < 4; local3416++) {
								if (local3410 >= 0 && local3414 >= 0 && local3410 < 104 && local3414 < 104) {
									this.aClass31ArrayArrayArray1[local3416][local3400][local3404] = this.aClass31ArrayArrayArray1[local3416][local3410][local3414];
								} else {
									this.aClass31ArrayArrayArray1[local3416][local3400][local3404] = null;
								}
							}
						}
					}
					for (@Pc(3478) Class1_Sub2 local3478 = (Class1_Sub2) this.aClass31_3.method523(); local3478 != null; local3478 = (Class1_Sub2) this.aClass31_3.method525()) {
						local3478.anInt824 -= local1608;
						local3478.anInt825 -= local1619;
						if (local3478.anInt824 < 0 || local3478.anInt825 < 0 || local3478.anInt824 >= 104 || local3478.anInt825 >= 104) {
							local3478.method669();
						}
					}
					if (this.anInt290 != 0) {
						this.anInt290 -= local1608;
						this.anInt291 -= local1619;
					}
					this.aBoolean60 = false;
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 251) {
					Class10.method266();
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 186) {
					local160 = this.aClass1_Sub1_Sub3_3.method500();
					@Pc(3562) byte local3562 = this.aClass1_Sub1_Sub3_3.method499();
					this.anIntArray74[local160] = local3562;
					if (this.anIntArray41[local160] != local3562) {
						this.anIntArray41[local160] = local3562;
						this.method142(local160);
						this.aBoolean44 = true;
						if (this.anInt283 != -1) {
							this.aBoolean79 = true;
						}
					}
					this.anInt350 = -1;
					return true;
				}
				if (this.anInt350 == 98 || this.anInt350 == 218 || this.anInt350 == 8 || this.anInt350 == 114 || this.anInt350 == 37 || this.anInt350 == 115 || this.anInt350 == 120 || this.anInt350 == 30 || this.anInt350 == 88 || this.anInt350 == 70) {
					this.method168(this.anInt350, this.aClass1_Sub1_Sub3_3, this.anInt397);
					this.anInt350 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt350 + "," + this.anInt349 + " - " + this.anInt407 + "," + this.anInt408);
				this.method146();
			} catch (@Pc(3679) IOException local3679) {
				this.method228(this.anInt341);
			} catch (@Pc(3685) Exception local3685) {
				local2740 = "T2 - " + this.anInt350 + "," + this.anInt407 + "," + this.anInt408 + " - " + this.anInt349 + "," + (this.anInt381 + aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0]) + "," + (this.anInt382 + aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0]) + " - ";
				for (local286 = 0; local286 < this.anInt349 && local286 < 50; local286++) {
					local2740 = local2740 + this.aClass1_Sub1_Sub3_3.aByteArray9[local286] + ",";
				}
				signlink.reporterror(local2740);
				this.method146();
			}
			return true;
		} catch (@Pc(3766) RuntimeException local3766) {
			signlink.reporterror("21268, " + true + ", " + local3766.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method124() {
		try {
			Class9.aClass42_4.method643();
			Class9.aClass42_5.method643();
			this.anInt349 += 0;
			Class13.aClass42_6.method643();
			Class15.aClass42_7.method643();
			Class15.aClass42_8.method643();
			Class1_Sub1_Sub1_Sub1_Sub2.aClass42_1.method643();
			Class32.aClass42_9.method643();
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("95545, " + 0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!d;)Z")
	private boolean method125(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class6 arg1) {
		try {
			if (arg0) {
				this.aClass31ArrayArrayArray1 = null;
			}
			if (arg1.anIntArray98 == null) {
				return false;
			}
			for (@Pc(11) int local11 = 0; local11 < arg1.anIntArray98.length; local11++) {
				@Pc(19) int local19 = this.method213(local11, arg1);
				@Pc(24) int local24 = arg1.anIntArray99[local11];
				if (arg1.anIntArray98[local11] == 2) {
					if (local19 >= local24) {
						return false;
					}
				} else if (arg1.anIntArray98[local11] == 3) {
					if (local19 <= local24) {
						return false;
					}
				} else if (arg1.anIntArray98[local11] == 4) {
					if (local19 == local24) {
						return false;
					}
				} else if (local19 != local24) {
					return false;
				}
			}
			return true;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("18280, " + arg0 + ", " + arg1 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method126(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString8 = "";
				this.aString9 = "Connecting to server...";
				this.method104(true, (byte) 4);
			}
			this.aClass8_1 = new Class8(this, this.method111(anInt262 + 43594), 6);
			@Pc(30) long local30 = Class49.method679(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass1_Sub1_Sub3_4.anInt777 = 0;
			this.aClass1_Sub1_Sub3_4.method488(14);
			this.aClass1_Sub1_Sub3_4.method488(local37);
			this.aClass8_1.method248(this.aClass1_Sub1_Sub3_4.aByteArray9, 2);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass8_1.method245();
			}
			@Pc(74) int local74 = this.aClass8_1.method245();
			@Pc(217) int local217;
			@Pc(251) int local251;
			if (local74 == 0) {
				this.aClass8_1.method247(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 8);
				this.aClass1_Sub1_Sub3_3.anInt777 = 0;
				this.aLong17 = this.aClass1_Sub1_Sub3_3.method504();
				@Pc(97) int[] local97 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong17 >> 32), (int) this.aLong17 };
				this.aClass1_Sub1_Sub3_4.anInt777 = 0;
				this.aClass1_Sub1_Sub3_4.method488(10);
				this.aClass1_Sub1_Sub3_4.method492(local97[0]);
				this.aClass1_Sub1_Sub3_4.method492(local97[1]);
				this.aClass1_Sub1_Sub3_4.method492(local97[2]);
				this.aClass1_Sub1_Sub3_4.method492(local97[3]);
				this.aClass1_Sub1_Sub3_4.method492(signlink.anInt929);
				this.aClass1_Sub1_Sub3_4.method495(arg0);
				this.aClass1_Sub1_Sub3_4.method495(arg1);
				this.aClass1_Sub1_Sub3_4.method513(aBigInteger2, aBigInteger1);
				this.aClass1_Sub1_Sub3_2.anInt777 = 0;
				if (arg2) {
					this.aClass1_Sub1_Sub3_2.method488(18);
				} else {
					this.aClass1_Sub1_Sub3_2.method488(16);
				}
				this.aClass1_Sub1_Sub3_2.method488(this.aClass1_Sub1_Sub3_4.anInt777 + 36 + 1 + 1);
				this.aClass1_Sub1_Sub3_2.method488(254);
				this.aClass1_Sub1_Sub3_2.method488(aBoolean48 ? 1 : 0);
				for (local217 = 0; local217 < 9; local217++) {
					this.aClass1_Sub1_Sub3_2.method492(this.anIntArray90[local217]);
				}
				this.aClass1_Sub1_Sub3_2.method496(this.aClass1_Sub1_Sub3_4.aByteArray9, this.aClass1_Sub1_Sub3_4.anInt777);
				this.aClass1_Sub1_Sub3_4.aClass47_2 = new Class47((byte) 4, local97);
				for (local251 = 0; local251 < 4; local251++) {
					local97[local251] += 50;
				}
				this.aClass47_1 = new Class47((byte) 4, local97);
				this.aClass8_1.method248(this.aClass1_Sub1_Sub3_2.aByteArray9, this.aClass1_Sub1_Sub3_2.anInt777);
				local74 = this.aClass8_1.method245();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(293) Exception local293) {
				}
				this.method126(arg0, arg1, arg2);
			} else {
				@Pc(383) int local383;
				if (local74 == 2) {
					this.anInt394 = this.aClass8_1.method245();
					aBoolean66 = this.aClass8_1.method245() == 1;
					Class10.method267();
					this.aLong15 = 0L;
					this.anInt425 = 0;
					this.aClass11_1.anInt563 = 0;
					super.aBoolean42 = true;
					this.aBoolean82 = true;
					this.aBoolean46 = true;
					this.aClass1_Sub1_Sub3_4.anInt777 = 0;
					this.aClass1_Sub1_Sub3_3.anInt777 = 0;
					this.anInt350 = -1;
					this.anInt406 = -1;
					this.anInt407 = -1;
					this.anInt408 = -1;
					this.anInt349 = 0;
					this.anInt351 = 0;
					this.anInt363 = 0;
					this.anInt353 = 0;
					this.anInt368 = 0;
					this.anInt299 = 0;
					this.aBoolean63 = false;
					super.anInt228 = 0;
					for (local383 = 0; local383 < 100; local383++) {
						this.aStringArray2[local383] = null;
					}
					this.anInt242 = 0;
					this.anInt336 = 0;
					this.anInt301 = 0;
					this.anInt304 = 0;
					this.anInt411 = (int) (Math.random() * 100.0D) - 50;
					this.anInt276 = (int) (Math.random() * 110.0D) - 55;
					this.anInt358 = (int) (Math.random() * 80.0D) - 40;
					this.anInt279 = (int) (Math.random() * 120.0D) - 60;
					this.anInt315 = (int) (Math.random() * 30.0D) - 20;
					this.anInt267 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt449 = -1;
					this.anInt290 = 0;
					this.anInt291 = 0;
					this.anInt333 = 0;
					this.anInt254 = 0;
					for (local217 = 0; local217 < this.anInt331; local217++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local217] = null;
						this.aClass1_Sub1_Sub3Array1[local217] = null;
					}
					for (local251 = 0; local251 < 16384; local251++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local251] = null;
					}
					aClass1_Sub1_Sub1_Sub1_Sub2_1 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anInt332] = new Class1_Sub1_Sub1_Sub1_Sub2();
					this.aClass31_2.method527();
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
					this.aClass31_3 = new Class31(false);
					this.anInt440 = 0;
					this.anInt439 = 0;
					this.anInt283 = -1;
					this.anInt413 = -1;
					this.anInt399 = -1;
					this.anInt429 = -1;
					this.anInt415 = -1;
					this.aBoolean70 = false;
					this.anInt263 = 3;
					this.aBoolean85 = false;
					this.aBoolean63 = false;
					this.aBoolean81 = false;
					this.aString18 = null;
					this.anInt317 = 0;
					this.anInt447 = -1;
					this.aBoolean77 = true;
					this.method119();
					for (local525 = 0; local525 < 5; local525++) {
						this.anIntArray80[local525] = 0;
					}
					for (local529 = 0; local529 < 5; local529++) {
						this.aStringArray6[local529] = null;
						this.aBooleanArray4[local529] = false;
					}
					anInt342 = 0;
					anInt281 = 0;
					anInt388 = 0;
					anInt452 = 0;
					anInt310 = 0;
					anInt343 = 0;
					anInt260 = 0;
					anInt431 = 0;
					anInt442 = 0;
					this.method118();
				} else if (local74 == 3) {
					this.aString8 = "";
					this.aString9 = "Invalid username or password.";
				} else if (local74 == 4) {
					this.aString8 = "Your account has been disabled.";
					this.aString9 = "Please check your message-centre for details.";
				} else if (local74 == 5) {
					this.aString8 = "Your account is already logged in.";
					this.aString9 = "Try again in 60 secs...";
				} else if (local74 == 6) {
					this.aString8 = "RuneScape has been updated!";
					this.aString9 = "Please reload this page.";
				} else if (local74 == 7) {
					this.aString8 = "This world is full.";
					this.aString9 = "Please use a different world.";
				} else if (local74 == 8) {
					this.aString8 = "Unable to connect.";
					this.aString9 = "Login server offline.";
				} else if (local74 == 9) {
					this.aString8 = "Login limit exceeded.";
					this.aString9 = "Too many connections from your address.";
				} else if (local74 == 10) {
					this.aString8 = "Unable to connect.";
					this.aString9 = "Bad session id.";
				} else if (local74 == 11) {
					this.aString9 = "Login server rejected session.";
					this.aString9 = "Please try again.";
				} else if (local74 == 12) {
					this.aString8 = "You need a members account to login to this world.";
					this.aString9 = "Please subscribe, or use a different world.";
				} else if (local74 == 13) {
					this.aString8 = "Could not complete login.";
					this.aString9 = "Please try using a different world.";
				} else if (local74 == 14) {
					this.aString8 = "The server is being updated.";
					this.aString9 = "Please wait 1 minute and try again.";
				} else if (local74 == 15) {
					this.aBoolean46 = true;
					this.aClass1_Sub1_Sub3_4.anInt777 = 0;
					this.aClass1_Sub1_Sub3_3.anInt777 = 0;
					this.anInt350 = -1;
					this.anInt406 = -1;
					this.anInt407 = -1;
					this.anInt408 = -1;
					this.anInt349 = 0;
					this.anInt351 = 0;
					this.anInt363 = 0;
					this.anInt299 = 0;
					this.aBoolean63 = false;
					this.aLong18 = System.currentTimeMillis();
				} else if (local74 == 16) {
					this.aString8 = "Login attempts exceeded.";
					this.aString9 = "Please wait 1 minute and try again.";
				} else if (local74 == 17) {
					this.aString8 = "You are standing in a members-only area.";
					this.aString9 = "To play on this world move to a free area first";
				} else if (local74 == 20) {
					this.aString8 = "Invalid loginserver requested";
					this.aString9 = "Please try using a different world.";
				} else if (local74 == 21) {
					for (local383 = this.aClass8_1.method245(); local383 >= 0; local383--) {
						this.aString8 = "You have only just left another world";
						this.aString9 = "Your profile will be transfered in: " + local383 + " seconds";
						this.method104(true, (byte) 4);
						try {
							Thread.sleep(1000L);
						} catch (@Pc(890) Exception local890) {
						}
					}
					this.method126(arg0, arg1, arg2);
				} else if (local74 == -1) {
					this.aString8 = "No response from server";
					this.aString9 = "Please try using a different world.";
				} else {
					System.out.println("response:" + local74);
					this.aString8 = "Unexpected server response";
					this.aString9 = "Please try using a different world.";
				}
			}
		} catch (@Pc(926) IOException local926) {
			this.aString8 = "";
			this.aString9 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!d;III)V")
	private void method127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class6 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg2.anInt458 == 0 && arg2.anIntArray100 != null && !arg2.aBoolean92 && (arg4 >= arg3 && arg0 >= arg1 && arg4 <= arg3 + arg2.anInt461 && arg0 <= arg1 + arg2.anInt462)) {
				@Pc(34) int local34 = arg2.anIntArray100.length;
				for (@Pc(43) int local43 = 0; local43 < local34; local43++) {
					@Pc(52) int local52 = arg2.anIntArray101[local43] + arg3;
					@Pc(61) int local61 = arg2.anIntArray102[local43] + arg1 - arg5;
					@Pc(68) Class6 local68 = Class6.aClass6Array1[arg2.anIntArray100[local43]];
					@Pc(73) int local73 = local52 + local68.anInt463;
					@Pc(78) int local78 = local61 + local68.anInt464;
					if ((local68.anInt465 >= 0 || local68.anInt473 != 0) && arg4 >= local73 && arg0 >= local78 && arg4 < local73 + local68.anInt461 && arg0 < local78 + local68.anInt462) {
						if (local68.anInt465 >= 0) {
							this.anInt366 = local68.anInt465;
						} else {
							this.anInt366 = local68.anInt456;
						}
					}
					if (local68.anInt458 == 0) {
						this.method127(arg0, local78, local68, local73, arg4, local68.anInt467);
						if (local68.anInt466 > local68.anInt462) {
							this.method136(local73 + local68.anInt461, local68.anInt466, true, arg4, local68, arg0, local68.anInt462, local78);
						}
					} else {
						if (local68.anInt459 == 1 && arg4 >= local73 && arg0 >= local78 && arg4 < local73 + local68.anInt461 && arg0 < local78 + local68.anInt462) {
							@Pc(175) boolean local175 = false;
							if (local68.anInt460 != 0) {
								local175 = this.method197(local68);
							}
							if (!local175) {
								this.aStringArray4[this.anInt299] = local68.aString23;
								this.anIntArray37[this.anInt299] = 231;
								this.anIntArray36[this.anInt299] = local68.anInt456;
								this.anInt299++;
							}
						}
						if (local68.anInt459 == 2 && this.anInt336 == 0 && arg4 >= local73 && arg0 >= local78 && arg4 < local73 + local68.anInt461 && arg0 < local78 + local68.anInt462) {
							@Pc(239) String local239 = local68.aString21;
							if (local239.indexOf(" ") != -1) {
								local239 = local239.substring(0, local239.indexOf(" "));
							}
							this.aStringArray4[this.anInt299] = local239 + " @gre@" + local68.aString22;
							this.anIntArray37[this.anInt299] = 274;
							this.anIntArray36[this.anInt299] = local68.anInt456;
							this.anInt299++;
						}
						if (local68.anInt459 == 3 && arg4 >= local73 && arg0 >= local78 && arg4 < local73 + local68.anInt461 && arg0 < local78 + local68.anInt462) {
							this.aStringArray4[this.anInt299] = "Close";
							this.anIntArray37[this.anInt299] = 737;
							this.anIntArray36[this.anInt299] = local68.anInt456;
							this.anInt299++;
						}
						if (local68.anInt459 == 4 && arg4 >= local73 && arg0 >= local78 && arg4 < local73 + local68.anInt461 && arg0 < local78 + local68.anInt462) {
							this.aStringArray4[this.anInt299] = local68.aString23;
							this.anIntArray37[this.anInt299] = 435;
							this.anIntArray36[this.anInt299] = local68.anInt456;
							this.anInt299++;
						}
						if (local68.anInt459 == 5 && arg4 >= local73 && arg0 >= local78 && arg4 < local73 + local68.anInt461 && arg0 < local78 + local68.anInt462) {
							this.aStringArray4[this.anInt299] = local68.aString23;
							this.anIntArray37[this.anInt299] = 225;
							this.anIntArray36[this.anInt299] = local68.anInt456;
							this.anInt299++;
						}
						if (local68.anInt459 == 6 && !this.aBoolean70 && arg4 >= local73 && arg0 >= local78 && arg4 < local73 + local68.anInt461 && arg0 < local78 + local68.anInt462) {
							this.aStringArray4[this.anInt299] = local68.aString23;
							this.anIntArray37[this.anInt299] = 997;
							this.anIntArray36[this.anInt299] = local68.anInt456;
							this.anInt299++;
						}
						if (local68.anInt458 == 2) {
							@Pc(487) int local487 = 0;
							for (@Pc(489) int local489 = 0; local489 < local68.anInt462; local489++) {
								for (@Pc(493) int local493 = 0; local493 < local68.anInt461; local493++) {
									@Pc(504) int local504 = local73 + local493 * (local68.anInt469 + 32);
									@Pc(513) int local513 = local78 + local489 * (local68.anInt470 + 32);
									if (local487 < 20) {
										local504 += local68.anIntArray103[local487];
										local513 += local68.anIntArray104[local487];
									}
									if (arg4 >= local504 && arg0 >= local513 && arg4 < local504 + 32 && arg0 < local513 + 32) {
										this.anInt400 = local487;
										this.anInt401 = local68.anInt456;
										if (local68.anIntArray96[local487] > 0) {
											@Pc(566) Class15 local566 = Class15.method345(local68.anIntArray96[local487] - 1);
											if (this.anInt242 == 1 && local68.aBoolean95) {
												if (local68.anInt456 != this.anInt244 || local487 != this.anInt243) {
													this.aStringArray4[this.anInt299] = "Use " + this.aString5 + " with @lre@" + local566.aString26;
													this.anIntArray37[this.anInt299] = 398;
													this.anIntArray38[this.anInt299] = local566.anInt612;
													this.anIntArray35[this.anInt299] = local487;
													this.anIntArray36[this.anInt299] = local68.anInt456;
													this.anInt299++;
												}
											} else if (this.anInt336 != 1 || !local68.aBoolean95) {
												@Pc(703) int local703;
												if (local68.aBoolean95) {
													for (local703 = 4; local703 >= 3; local703--) {
														if (local566.aStringArray11 != null && local566.aStringArray11[local703] != null) {
															this.aStringArray4[this.anInt299] = local566.aStringArray11[local703] + " @lre@" + local566.aString26;
															if (local703 == 3) {
																this.anIntArray37[this.anInt299] = 681;
															}
															if (local703 == 4) {
																this.anIntArray37[this.anInt299] = 100;
															}
															this.anIntArray38[this.anInt299] = local566.anInt612;
															this.anIntArray35[this.anInt299] = local487;
															this.anIntArray36[this.anInt299] = local68.anInt456;
															this.anInt299++;
														} else if (local703 == 4) {
															this.aStringArray4[this.anInt299] = "Drop @lre@" + local566.aString26;
															this.anIntArray37[this.anInt299] = 100;
															this.anIntArray38[this.anInt299] = local566.anInt612;
															this.anIntArray35[this.anInt299] = local487;
															this.anIntArray36[this.anInt299] = local68.anInt456;
															this.anInt299++;
														}
													}
												}
												if (local68.aBoolean96) {
													this.aStringArray4[this.anInt299] = "Use @lre@" + local566.aString26;
													this.anIntArray37[this.anInt299] = 102;
													this.anIntArray38[this.anInt299] = local566.anInt612;
													this.anIntArray35[this.anInt299] = local487;
													this.anIntArray36[this.anInt299] = local68.anInt456;
													this.anInt299++;
												}
												if (local68.aBoolean95 && local566.aStringArray11 != null) {
													for (local703 = 2; local703 >= 0; local703--) {
														if (local566.aStringArray11[local703] != null) {
															this.aStringArray4[this.anInt299] = local566.aStringArray11[local703] + " @lre@" + local566.aString26;
															if (local703 == 0) {
																this.anIntArray37[this.anInt299] = 694;
															}
															if (local703 == 1) {
																this.anIntArray37[this.anInt299] = 962;
															}
															if (local703 == 2) {
																this.anIntArray37[this.anInt299] = 795;
															}
															this.anIntArray38[this.anInt299] = local566.anInt612;
															this.anIntArray35[this.anInt299] = local487;
															this.anIntArray36[this.anInt299] = local68.anInt456;
															this.anInt299++;
														}
													}
												}
												if (local68.aStringArray7 != null) {
													for (local703 = 4; local703 >= 0; local703--) {
														if (local68.aStringArray7[local703] != null) {
															this.aStringArray4[this.anInt299] = local68.aStringArray7[local703] + " @lre@" + local566.aString26;
															if (local703 == 0) {
																this.anIntArray37[this.anInt299] = 582;
															}
															if (local703 == 1) {
																this.anIntArray37[this.anInt299] = 113;
															}
															if (local703 == 2) {
																this.anIntArray37[this.anInt299] = 555;
															}
															if (local703 == 3) {
																this.anIntArray37[this.anInt299] = 331;
															}
															if (local703 == 4) {
																this.anIntArray37[this.anInt299] = 354;
															}
															this.anIntArray38[this.anInt299] = local566.anInt612;
															this.anIntArray35[this.anInt299] = local487;
															this.anIntArray36[this.anInt299] = local68.anInt456;
															this.anInt299++;
														}
													}
												}
												this.aStringArray4[this.anInt299] = "Examine @lre@" + local566.aString26;
												this.anIntArray37[this.anInt299] = 1328;
												this.anIntArray38[this.anInt299] = local566.anInt612;
												this.anIntArray35[this.anInt299] = local487;
												this.anIntArray36[this.anInt299] = local68.anInt456;
												this.anInt299++;
											} else if ((this.anInt338 & 0x10) == 16) {
												this.aStringArray4[this.anInt299] = this.aString7 + " @lre@" + local566.aString26;
												this.anIntArray37[this.anInt299] = 563;
												this.anIntArray38[this.anInt299] = local566.anInt612;
												this.anIntArray35[this.anInt299] = local487;
												this.anIntArray36[this.anInt299] = local68.anInt456;
												this.anInt299++;
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
		} catch (@Pc(1133) RuntimeException local1133) {
			signlink.reporterror("50554, " + arg0 + ", " + arg1 + ", " + -653 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local1133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method128() {
		try {
			@Pc(18) int local18;
			for (@Pc(10) int local10 = -1; local10 < this.anInt333; local10++) {
				if (local10 == -1) {
					local18 = this.anInt332;
				} else {
					local18 = this.anIntArray62[local10];
				}
				@Pc(30) Class1_Sub1_Sub1_Sub1_Sub2 local30 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local18];
				if (local30 != null && local30.anInt138 > 0) {
					local30.anInt138--;
					if (local30.anInt138 == 0) {
						local30.aString3 = null;
					}
				}
			}
			for (local18 = 0; local18 < this.anInt254; local18++) {
				@Pc(61) int local61 = this.anIntArray42[local18];
				@Pc(66) Class1_Sub1_Sub1_Sub1_Sub1 local66 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local61];
				if (local66 != null && local66.anInt138 > 0) {
					local66.anInt138--;
					if (local66.anInt138 == 0) {
						local66.aString3 = null;
					}
				}
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("18386, " + 0 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method129() {
		try {
			if (this.anInt299 >= 2 || this.anInt242 != 0 || this.anInt336 != 0) {
				@Pc(31) String local31;
				if (this.anInt242 == 1 && this.anInt299 < 2) {
					local31 = "Use " + this.aString5 + " with...";
				} else if (this.anInt336 == 1 && this.anInt299 < 2) {
					local31 = this.aString7 + "...";
				} else {
					local31 = this.aStringArray4[this.anInt299 - 1];
				}
				if (this.anInt299 > 2) {
					local31 = local31 + "@whi@ / " + (this.anInt299 - 2) + " more options";
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method471(15, local31, 16777215, anInt426 / 1000, 4);
			}
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("96489, " + -812 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(8) int local8 = this.aClass39_1.method570(arg1, arg2, arg4);
			@Pc(23) int local23;
			@Pc(29) int local29;
			@Pc(33) int local33;
			@Pc(35) int local35;
			@Pc(57) int local57;
			@Pc(63) int local63;
			if (local8 != 0) {
				local23 = this.aClass39_1.method574(arg1, arg2, arg4, local8);
				local29 = local23 >> 6 & 0x3;
				local33 = local23 & 0x1F;
				local35 = arg0;
				if (local8 > 0) {
					local35 = arg3;
				}
				@Pc(43) int[] local43 = this.aClass1_Sub1_Sub2_Sub2_4.anIntArray210;
				local57 = arg2 * 4 + (103 - arg4) * 512 * 4 + 24624;
				local63 = local8 >> 14 & 0x7FFF;
				@Pc(66) Class9 local66 = Class9.method258(local63);
				if (local66.anInt524 == -1) {
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
					@Pc(76) Class1_Sub1_Sub2_Sub3 local76 = this.aClass1_Sub1_Sub2_Sub3Array2[local66.anInt524];
					if (local76 != null) {
						@Pc(88) int local88 = (local66.anInt519 * 4 - local76.anInt715) / 2;
						@Pc(98) int local98 = (local66.anInt520 * 4 - local76.anInt716) / 2;
						local76.method445(arg2 * 4 + local88 + 48, (104 - arg4 - local66.anInt520) * 4 + 48 + local98);
					}
				}
			}
			local8 = this.aClass39_1.method572(arg1, arg2, arg4);
			if (local8 != 0) {
				local23 = this.aClass39_1.method574(arg1, arg2, arg4, local8);
				local29 = local23 >> 6 & 0x3;
				local33 = local23 & 0x1F;
				local35 = local8 >> 14 & 0x7FFF;
				@Pc(452) Class9 local452 = Class9.method258(local35);
				@Pc(484) int local484;
				if (local452.anInt524 != -1) {
					@Pc(462) Class1_Sub1_Sub2_Sub3 local462 = this.aClass1_Sub1_Sub2_Sub3Array2[local452.anInt524];
					if (local462 != null) {
						local63 = (local452.anInt519 * 4 - local462.anInt715) / 2;
						local484 = (local452.anInt520 * 4 - local462.anInt716) / 2;
						local462.method445(arg2 * 4 + local63 + 48, (104 - arg4 - local452.anInt520) * 4 + 48 + local484);
					}
				} else if (local33 == 9) {
					local57 = 15658734;
					if (local8 > 0) {
						local57 = 15597568;
					}
					@Pc(521) int[] local521 = this.aClass1_Sub1_Sub2_Sub2_4.anIntArray210;
					local484 = arg2 * 4 + (103 - arg4) * 512 * 4 + 24624;
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
			local8 = this.aClass39_1.method573(arg1, arg2, arg4);
			if (local8 != 0) {
				local23 = local8 >> 14 & 0x7FFF;
				@Pc(616) Class9 local616 = Class9.method258(local23);
				if (local616.anInt524 != -1) {
					@Pc(626) Class1_Sub1_Sub2_Sub3 local626 = this.aClass1_Sub1_Sub2_Sub3Array2[local616.anInt524];
					if (local626 != null) {
						local35 = (local616.anInt519 * 4 - local626.anInt715) / 2;
						@Pc(648) int local648 = (local616.anInt520 * 4 - local626.anInt716) / 2;
						local626.method445(arg2 * 4 + local35 + 48, (104 - arg4 - local616.anInt520) * 4 + 48 + local648);
						return;
					}
				}
			}
		} catch (@Pc(672) RuntimeException local672) {
			signlink.reporterror("17413, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 1 + ", " + arg3 + ", " + arg4 + ", " + local672.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method131() {
		try {
			anInt311++;
			if (anInt311 > 192) {
				anInt311 = 0;
				this.aClass1_Sub1_Sub3_4.method487(226);
				this.aClass1_Sub1_Sub3_4.method488(232);
			}
			while (true) {
				@Pc(28) int local28;
				do {
					while (true) {
						local28 = this.method89(this.aByte13);
						if (local28 == -1) {
							return;
						}
						if (this.anInt399 != -1 && this.anInt399 == this.anInt448) {
							if (local28 == 8 && this.aString12.length() > 0) {
								this.aString12 = this.aString12.substring(0, this.aString12.length() - 1);
							}
							break;
						}
						@Pc(208) int local208;
						if (this.aBoolean81) {
							if (local28 >= 32 && local28 <= 122 && this.aString17.length() < 80) {
								this.aString17 = this.aString17 + (char) local28;
								this.aBoolean79 = true;
							}
							if (local28 == 8 && this.aString17.length() > 0) {
								this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
								this.aBoolean79 = true;
							}
							if (local28 == 13 || local28 == 10) {
								this.aBoolean81 = false;
								this.aBoolean79 = true;
								@Pc(168) long local168;
								if (this.anInt443 == 1) {
									local168 = Class49.method679(this.aString17);
									this.method171(local168);
								}
								if (this.anInt443 == 2 && this.anInt439 > 0) {
									local168 = Class49.method679(this.aString17);
									this.method139(local168);
								}
								if (this.anInt443 == 3 && this.aString17.length() > 0) {
									this.aClass1_Sub1_Sub3_4.method487(214);
									this.aClass1_Sub1_Sub3_4.method488(0);
									local208 = this.aClass1_Sub1_Sub3_4.anInt777;
									this.aClass1_Sub1_Sub3_4.method494(this.aLong16);
									Class2.method41(this.aClass1_Sub1_Sub3_4, this.aString17);
									this.aClass1_Sub1_Sub3_4.method497(this.aClass1_Sub1_Sub3_4.anInt777 - local208);
									this.aString17 = Class49.method684(this.aString17);
									this.aString17 = Class41.method613(this.aString17);
									this.method182(Class49.method683(Class49.method680(this.aLong16)), 6, this.anInt433, this.aString17);
									if (this.anInt444 == 2) {
										this.anInt444 = 1;
										this.aBoolean49 = true;
										this.aClass1_Sub1_Sub3_4.method487(129);
										this.aClass1_Sub1_Sub3_4.method488(this.anInt422);
										this.aClass1_Sub1_Sub3_4.method488(this.anInt444);
										this.aClass1_Sub1_Sub3_4.method488(this.anInt410);
									}
								}
								if (this.anInt443 == 4 && this.anInt451 < 100) {
									local168 = Class49.method679(this.aString17);
									this.method151(local168);
								}
								if (this.anInt443 == 5 && this.anInt451 > 0) {
									local168 = Class49.method679(this.aString17);
									this.method114(local168);
								}
							}
						} else if (this.aBoolean85) {
							if (local28 >= 48 && local28 <= 57 && this.aString16.length() < 10) {
								this.aString16 = this.aString16 + (char) local28;
								this.aBoolean79 = true;
							}
							if (local28 == 8 && this.aString16.length() > 0) {
								this.aString16 = this.aString16.substring(0, this.aString16.length() - 1);
								this.aBoolean79 = true;
							}
							if (local28 == 13 || local28 == 10) {
								if (this.aString16.length() > 0) {
									local208 = 0;
									try {
										local208 = Integer.parseInt(this.aString16);
									} catch (@Pc(385) Exception local385) {
									}
									this.aClass1_Sub1_Sub3_4.method487(161);
									this.aClass1_Sub1_Sub3_4.method492(local208);
								}
								this.aBoolean85 = false;
								this.aBoolean79 = true;
							}
						} else if (this.anInt413 == -1) {
							if (local28 >= 32 && local28 <= 122 && this.aString14.length() < 80) {
								this.aString14 = this.aString14 + (char) local28;
								this.aBoolean79 = true;
							}
							if (local28 == 8 && this.aString14.length() > 0) {
								this.aString14 = this.aString14.substring(0, this.aString14.length() - 1);
								this.aBoolean79 = true;
							}
							if ((local28 == 13 || local28 == 10) && this.aString14.length() > 0) {
								if (this.anInt394 == 2) {
									if (this.aString14.equals("::clientdrop")) {
										this.method228(this.anInt341);
									}
									if (this.aString14.equals("::lag")) {
										this.method158();
									}
									if (this.aString14.equals("::prefetchmusic")) {
										for (local208 = 0; local208 < this.aClass45_Sub1_1.method650(2); local208++) {
											this.aClass45_Sub1_1.method660(2, (byte) 1, local208);
										}
									}
								}
								if (this.aString14.startsWith("::")) {
									this.aClass1_Sub1_Sub3_4.method487(86);
									this.aClass1_Sub1_Sub3_4.method488(this.aString14.length() - 1);
									this.aClass1_Sub1_Sub3_4.method495(this.aString14.substring(2));
								} else {
									@Pc(537) byte local537 = 0;
									if (this.aString14.startsWith("yellow:")) {
										local537 = 0;
										this.aString14 = this.aString14.substring(7);
									}
									if (this.aString14.startsWith("red:")) {
										local537 = 1;
										this.aString14 = this.aString14.substring(4);
									}
									if (this.aString14.startsWith("green:")) {
										local537 = 2;
										this.aString14 = this.aString14.substring(6);
									}
									if (this.aString14.startsWith("cyan:")) {
										local537 = 3;
										this.aString14 = this.aString14.substring(5);
									}
									if (this.aString14.startsWith("purple:")) {
										local537 = 4;
										this.aString14 = this.aString14.substring(7);
									}
									if (this.aString14.startsWith("white:")) {
										local537 = 5;
										this.aString14 = this.aString14.substring(6);
									}
									if (this.aString14.startsWith("flash1:")) {
										local537 = 6;
										this.aString14 = this.aString14.substring(7);
									}
									if (this.aString14.startsWith("flash2:")) {
										local537 = 7;
										this.aString14 = this.aString14.substring(7);
									}
									if (this.aString14.startsWith("flash3:")) {
										local537 = 8;
										this.aString14 = this.aString14.substring(7);
									}
									if (this.aString14.startsWith("glow1:")) {
										local537 = 9;
										this.aString14 = this.aString14.substring(6);
									}
									if (this.aString14.startsWith("glow2:")) {
										local537 = 10;
										this.aString14 = this.aString14.substring(6);
									}
									if (this.aString14.startsWith("glow3:")) {
										local537 = 11;
										this.aString14 = this.aString14.substring(6);
									}
									@Pc(695) byte local695 = 0;
									if (this.aString14.startsWith("wave:")) {
										local695 = 1;
										this.aString14 = this.aString14.substring(5);
									}
									if (this.aString14.startsWith("scroll:")) {
										local695 = 2;
										this.aString14 = this.aString14.substring(7);
									}
									this.aClass1_Sub1_Sub3_4.method487(83);
									this.aClass1_Sub1_Sub3_4.method488(0);
									@Pc(734) int local734 = this.aClass1_Sub1_Sub3_4.anInt777;
									this.aClass1_Sub1_Sub3_4.method488(local537);
									this.aClass1_Sub1_Sub3_4.method488(local695);
									Class2.method41(this.aClass1_Sub1_Sub3_4, this.aString14);
									this.aClass1_Sub1_Sub3_4.method497(this.aClass1_Sub1_Sub3_4.anInt777 - local734);
									this.aString14 = Class49.method684(this.aString14);
									this.aString14 = Class41.method613(this.aString14);
									aClass1_Sub1_Sub1_Sub1_Sub2_1.aString3 = this.aString14;
									aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt139 = local537;
									aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt140 = local695;
									aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt138 = 150;
									if (this.anInt394 == 2) {
										this.method182("@cr2@" + aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4, 2, this.anInt433, aClass1_Sub1_Sub1_Sub1_Sub2_1.aString3);
									} else if (this.anInt394 == 1) {
										this.method182("@cr1@" + aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4, 2, this.anInt433, aClass1_Sub1_Sub1_Sub1_Sub2_1.aString3);
									} else {
										this.method182(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4, 2, this.anInt433, aClass1_Sub1_Sub1_Sub1_Sub2_1.aString3);
									}
									if (this.anInt422 == 2) {
										this.anInt422 = 3;
										this.aBoolean49 = true;
										this.aClass1_Sub1_Sub3_4.method487(129);
										this.aClass1_Sub1_Sub3_4.method488(this.anInt422);
										this.aClass1_Sub1_Sub3_4.method488(this.anInt444);
										this.aClass1_Sub1_Sub3_4.method488(this.anInt410);
									}
								}
								this.aString14 = "";
								this.aBoolean79 = true;
							}
						}
					}
				} while ((local28 < 97 || local28 > 122) && (local28 < 65 || local28 > 90) && (local28 < 48 || local28 > 57) && local28 != 32);
				if (this.aString12.length() < 12) {
					this.aString12 = this.aString12 + (char) local28;
				}
			}
		} catch (@Pc(873) RuntimeException local873) {
			signlink.reporterror("6645, " + -43726 + ", " + local873.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method132() {
		try {
			this.anInt349 += 0;
			while (true) {
				@Pc(11) Class1_Sub1_Sub4 local11 = this.aClass45_Sub1_1.method659();
				if (local11 == null) {
					return;
				}
				if (local11.anInt805 == 0) {
					Class1_Sub1_Sub1_Sub5.method286(local11.aByteArray10, local11.anInt806);
					if ((this.aClass45_Sub1_1.method655(local11.anInt806) & 0x62) != 0) {
						this.aBoolean44 = true;
						if (this.anInt413 != -1) {
							this.aBoolean79 = true;
						}
					}
				}
				if (local11.anInt805 == 1 && local11.aByteArray10 != null) {
					Class14.method325(this.anInt403, local11.aByteArray10);
				}
				if (local11.anInt805 == 2 && local11.anInt806 == this.anInt441 && local11.aByteArray10 != null) {
					this.method208(this.aBoolean83, local11.aByteArray10);
				}
				if (local11.anInt805 == 3 && this.anInt301 == 1) {
					for (@Pc(83) int local83 = 0; local83 < this.aByteArrayArray2.length; local83++) {
						if (this.anIntArray78[local83] == local11.anInt806) {
							this.aByteArrayArray2[local83] = local11.aByteArray10;
							if (local11.aByteArray10 == null) {
								this.anIntArray78[local83] = -1;
							}
							break;
						}
						if (this.anIntArray79[local83] == local11.anInt806) {
							this.aByteArrayArray1[local83] = local11.aByteArray10;
							if (local11.aByteArray10 == null) {
								this.anIntArray79[local83] = -1;
							}
							break;
						}
					}
				}
				if (local11.anInt805 == 93 && this.aClass45_Sub1_1.method654(local11.anInt806, (byte) 1)) {
					Class4.method60(new Class1_Sub1_Sub3(local11.aByteArray10, (byte) 3), this.aClass45_Sub1_1);
				}
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("74661, " + 0 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILclient!mb;)V")
	private void method133(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			arg1.method508();
			@Pc(7) int local7 = arg1.method509(1);
			if (local7 != 0) {
				@Pc(15) int local15 = arg1.method509(2);
				if (local15 == 0) {
					this.anIntArray63[this.anInt334++] = this.anInt332;
				} else {
					@Pc(44) int local44;
					@Pc(54) int local54;
					if (local15 == 1) {
						local44 = arg1.method509(3);
						aClass1_Sub1_Sub1_Sub1_Sub2_1.method47(false, local44);
						local54 = arg1.method509(1);
						if (local54 == 1) {
							this.anIntArray63[this.anInt334++] = this.anInt332;
						}
					} else {
						@Pc(98) int local98;
						if (local15 == 2) {
							local44 = arg1.method509(3);
							aClass1_Sub1_Sub1_Sub1_Sub2_1.method47(true, local44);
							local54 = arg1.method509(3);
							aClass1_Sub1_Sub1_Sub1_Sub2_1.method47(true, local54);
							local98 = arg1.method509(1);
							if (local98 == 1) {
								this.anIntArray63[this.anInt334++] = this.anInt332;
							}
						} else if (local15 == 3) {
							this.anInt278 = arg1.method509(2);
							local44 = arg1.method509(7);
							local54 = arg1.method509(7);
							local98 = arg1.method509(1);
							aClass1_Sub1_Sub1_Sub1_Sub2_1.method46(local54, local44, local98 == 1);
							@Pc(154) int local154 = arg1.method509(1);
							if (local154 == 1) {
								this.anIntArray63[this.anInt334++] = this.anInt332;
							}
						}
					}
				}
			}
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("3724, " + false + ", " + arg0 + ", " + arg1 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method134() {
		try {
			if (super.anInt235 == 1) {
				if (super.anInt236 >= 539 && super.anInt236 <= 573 && super.anInt237 >= 169 && super.anInt237 < 205 && this.anIntArray71[0] != -1) {
					this.aBoolean44 = true;
					this.anInt263 = 0;
					this.aBoolean58 = true;
				}
				if (super.anInt236 >= 569 && super.anInt236 <= 599 && super.anInt237 >= 168 && super.anInt237 < 205 && this.anIntArray71[1] != -1) {
					this.aBoolean44 = true;
					this.anInt263 = 1;
					this.aBoolean58 = true;
				}
				if (super.anInt236 >= 597 && super.anInt236 <= 627 && super.anInt237 >= 168 && super.anInt237 < 205 && this.anIntArray71[2] != -1) {
					this.aBoolean44 = true;
					this.anInt263 = 2;
					this.aBoolean58 = true;
				}
				if (super.anInt236 >= 625 && super.anInt236 <= 669 && super.anInt237 >= 168 && super.anInt237 < 203 && this.anIntArray71[3] != -1) {
					this.aBoolean44 = true;
					this.anInt263 = 3;
					this.aBoolean58 = true;
				}
				if (super.anInt236 >= 666 && super.anInt236 <= 696 && super.anInt237 >= 168 && super.anInt237 < 205 && this.anIntArray71[4] != -1) {
					this.aBoolean44 = true;
					this.anInt263 = 4;
					this.aBoolean58 = true;
				}
				if (super.anInt236 >= 694 && super.anInt236 <= 724 && super.anInt237 >= 168 && super.anInt237 < 205 && this.anIntArray71[5] != -1) {
					this.aBoolean44 = true;
					this.anInt263 = 5;
					this.aBoolean58 = true;
				}
				if (super.anInt236 >= 722 && super.anInt236 <= 756 && super.anInt237 >= 169 && super.anInt237 < 205 && this.anIntArray71[6] != -1) {
					this.aBoolean44 = true;
					this.anInt263 = 6;
					this.aBoolean58 = true;
				}
				if (super.anInt236 >= 540 && super.anInt236 <= 574 && super.anInt237 >= 466 && super.anInt237 < 502 && this.anIntArray71[7] != -1) {
					this.aBoolean44 = true;
					this.anInt263 = 7;
					this.aBoolean58 = true;
				}
				if (super.anInt236 >= 572 && super.anInt236 <= 602 && super.anInt237 >= 466 && super.anInt237 < 503 && this.anIntArray71[8] != -1) {
					this.aBoolean44 = true;
					this.anInt263 = 8;
					this.aBoolean58 = true;
				}
				if (super.anInt236 >= 599 && super.anInt236 <= 629 && super.anInt237 >= 466 && super.anInt237 < 503 && this.anIntArray71[9] != -1) {
					this.aBoolean44 = true;
					this.anInt263 = 9;
					this.aBoolean58 = true;
				}
				if (super.anInt236 >= 627 && super.anInt236 <= 671 && super.anInt237 >= 467 && super.anInt237 < 502 && this.anIntArray71[10] != -1) {
					this.aBoolean44 = true;
					this.anInt263 = 10;
					this.aBoolean58 = true;
				}
				if (super.anInt236 >= 669 && super.anInt236 <= 699 && super.anInt237 >= 466 && super.anInt237 < 503 && this.anIntArray71[11] != -1) {
					this.aBoolean44 = true;
					this.anInt263 = 11;
					this.aBoolean58 = true;
				}
				if (super.anInt236 >= 696 && super.anInt236 <= 726 && super.anInt237 >= 466 && super.anInt237 < 503 && this.anIntArray71[12] != -1) {
					this.aBoolean44 = true;
					this.anInt263 = 12;
					this.aBoolean58 = true;
				}
				if (super.anInt236 >= 724 && super.anInt236 <= 758 && super.anInt237 >= 466 && super.anInt237 < 502 && this.anIntArray71[13] != -1) {
					this.aBoolean44 = true;
					this.anInt263 = 13;
					this.aBoolean58 = true;
					return;
				}
			}
		} catch (@Pc(445) RuntimeException local445) {
			signlink.reporterror("5888, " + -20582 + ", " + local445.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZBILclient!d;III)V")
	private void method136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class6 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (this.aBoolean87) {
				this.anInt284 = 32;
			} else {
				this.anInt284 = 0;
			}
			this.aBoolean87 = false;
			if (arg3 >= arg0 && arg3 < arg0 + 16 && arg5 >= arg7 && arg5 < arg7 + 16) {
				arg4.anInt467 -= this.anInt321 * 4;
				if (arg2) {
					this.aBoolean44 = true;
					return;
				}
			} else if (arg3 >= arg0 && arg3 < arg0 + 16 && arg5 >= arg7 + arg6 - 16 && arg5 < arg7 + arg6) {
				arg4.anInt467 += this.anInt321 * 4;
				if (arg2) {
					this.aBoolean44 = true;
					return;
				}
			} else if (arg3 >= arg0 - this.anInt284 && arg3 < arg0 + this.anInt284 + 16 && arg5 >= arg7 + 16 && arg5 < arg7 + arg6 - 16 && this.anInt321 > 0) {
				@Pc(123) int local123 = (arg6 - 32) * arg6 / arg1;
				if (local123 < 8) {
					local123 = 8;
				}
				@Pc(138) int local138 = arg5 - arg7 - local123 / 2 - 16;
				@Pc(144) int local144 = arg6 - local123 - 32;
				arg4.anInt467 = (arg1 - arg6) * local138 / local144;
				if (arg2) {
					this.aBoolean44 = true;
				}
				this.aBoolean87 = true;
			} else {
				return;
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("79415, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 116 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
	private int method137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) int local3 = arg2 >> 7;
			@Pc(7) int local7 = arg0 >> 7;
			if (local3 < 0 || local7 < 0 || local3 > 103 || local7 > 103) {
				return 0;
			}
			@Pc(27) int local27 = arg1;
			if (arg1 < 3 && (this.aByteArrayArrayArray7[1][local3][local7] & 0x2) == 2) {
				local27 = arg1 + 1;
			}
			@Pc(47) int local47 = arg2 & 0x7F;
			@Pc(51) int local51 = arg0 & 0x7F;
			@Pc(79) int local79 = this.anIntArrayArrayArray3[local27][local3][local7] * (128 - local47) + this.anIntArrayArrayArray3[local27][local3 + 1][local7] * local47 >> 7;
			@Pc(111) int local111 = this.anIntArrayArrayArray3[local27][local3][local7 + 1] * (128 - local47) + this.anIntArrayArrayArray3[local27][local3 + 1][local7 + 1] * local47 >> 7;
			return local79 * (128 - local51) + local111 * local51 >> 7;
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("99609, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 9803 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Z")
	private boolean method138(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(12) boolean local12 = false;
			@Pc(16) Class6 local16 = Class6.aClass6Array1[arg1];
			for (@Pc(18) int local18 = 0; local18 < local16.anIntArray100.length && local16.anIntArray100[local18] != -1; local18++) {
				@Pc(33) Class6 local33 = Class6.aClass6Array1[local16.anIntArray100[local18]];
				if (local33.anInt458 == 1) {
					local12 |= this.method138(arg0, local33.anInt456);
				}
				if (local33.anInt458 == 6 && (local33.anInt479 != -1 || local33.anInt480 != -1)) {
					@Pc(64) boolean local64 = this.method125(this.aBoolean59, local33);
					@Pc(69) int local69;
					if (local64) {
						local69 = local33.anInt480;
					} else {
						local69 = local33.anInt479;
					}
					if (local69 != -1) {
						@Pc(81) Class27 local81 = Class27.aClass27Array1[local69];
						local33.anInt455 += arg0;
						while (local33.anInt455 > local81.method517(local33.anInt454)) {
							local33.anInt455 -= local81.method517(local33.anInt454) + 1;
							local33.anInt454++;
							if (local33.anInt454 >= local81.anInt809) {
								local33.anInt454 -= local81.anInt810;
								if (local33.anInt454 < 0 || local33.anInt454 >= local81.anInt809) {
									local33.anInt454 = 0;
								}
							}
							local12 = true;
						}
					}
				}
			}
			return local12;
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("97297, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JZ)V")
	private void method139(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt439; local8++) {
					if (this.aLongArray4[local8] == arg0) {
						this.anInt439--;
						this.aBoolean44 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt439; local28++) {
							this.aStringArray3[local28] = this.aStringArray3[local28 + 1];
							this.anIntArray84[local28] = this.anIntArray84[local28 + 1];
							this.aLongArray4[local28] = this.aLongArray4[local28 + 1];
						}
						this.aClass1_Sub1_Sub3_4.method487(84);
						this.aClass1_Sub1_Sub3_4.method494(arg0);
						break;
					}
				}
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("60320, " + arg0 + ", " + false + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!jb;III)V")
	private void method140(@OriginalArg(0) Class1_Sub1_Sub2_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = this.anInt267 + this.anInt279 & 0x7FF;
			@Pc(15) int local15 = arg2 * arg2 + arg1 * arg1;
			if (local15 <= 6400) {
				@Pc(28) int local28 = Class1_Sub1_Sub1_Sub5.anIntArray158[local7];
				@Pc(32) int local32 = Class1_Sub1_Sub1_Sub5.anIntArray159[local7];
				@Pc(41) int local41 = local28 * 256 / (this.anInt315 + 256);
				@Pc(50) int local50 = local32 * 256 / (this.anInt315 + 256);
				@Pc(60) int local60 = arg1 * local41 + arg2 * local50 >> 16;
				@Pc(70) int local70 = arg1 * local50 - arg2 * local41 >> 16;
				if (local15 > 2500) {
					arg0.method412(this.aClass1_Sub1_Sub2_Sub3_10, 83 - local70 - arg0.anInt691 / 2 - 4, local60 + 94 - arg0.anInt690 / 2 + 4);
				} else {
					arg0.method406(local60 + 94 + 4 - arg0.anInt690 / 2, 83 - local70 - arg0.anInt691 / 2 - 4);
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("37840, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method141() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt304; local3++) {
				if (this.anIntArray51[local3] <= 0) {
					@Pc(12) boolean local12 = false;
					try {
						if (this.anIntArray34[local3] != this.anInt344 || this.anIntArray61[local3] != this.anInt356) {
							@Pc(45) Class1_Sub1_Sub3 local45 = Class5.method80(this.anIntArray61[local3], this.anIntArray34[local3]);
							if (System.currentTimeMillis() + (long) (local45.anInt777 / 22) > this.aLong14 + (long) (this.anInt435 / 22)) {
								this.anInt435 = local45.anInt777;
								this.aLong14 = System.currentTimeMillis();
								if (this.method172(local45.aByteArray9, local45.anInt777)) {
									this.anInt344 = this.anIntArray34[local3];
									this.anInt356 = this.anIntArray61[local3];
								} else {
									local12 = true;
								}
							}
						} else if (!this.method98((byte) 6)) {
							local12 = true;
						}
					} catch (@Pc(95) Exception local95) {
					}
					if (local12 && this.anIntArray51[local3] != -5) {
						this.anIntArray51[local3] = -5;
					} else {
						this.anInt304--;
						for (@Pc(111) int local111 = local3; local111 < this.anInt304; local111++) {
							this.anIntArray34[local111] = this.anIntArray34[local111 + 1];
							this.anIntArray61[local111] = this.anIntArray61[local111 + 1];
							this.anIntArray51[local111] = this.anIntArray51[local111 + 1];
						}
						local3--;
					}
				} else {
					@Pc(163) int local163 = this.anIntArray51[local3]--;
				}
			}
			if (this.anInt414 > 0) {
				this.anInt414 -= 20;
				if (this.anInt414 < 0) {
					this.anInt414 = 0;
				}
				if (this.anInt414 == 0 && this.aBoolean55 && !aBoolean48) {
					this.anInt441 = this.anInt432;
					this.aBoolean83 = false;
					this.aClass45_Sub1_1.method657(2, this.anInt441);
					return;
				}
			}
		} catch (@Pc(214) RuntimeException local214) {
			signlink.reporterror("47261, " + false + ", " + local214.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method142(@OriginalArg(1) int arg0) {
		try {
			@Pc(7) int local7 = Class38.aClass38Array1[arg0].anInt879;
			if (local7 != 0) {
				@Pc(15) int local15 = this.anIntArray41[arg0];
				if (local7 == 1) {
					if (local15 == 1) {
						Class1_Sub1_Sub2_Sub1.method379(241, 0.9D);
					}
					if (local15 == 2) {
						Class1_Sub1_Sub2_Sub1.method379(241, 0.8D);
					}
					if (local15 == 3) {
						Class1_Sub1_Sub2_Sub1.method379(241, 0.7D);
					}
					if (local15 == 4) {
						Class1_Sub1_Sub2_Sub1.method379(241, 0.6D);
					}
					Class15.aClass42_8.method643();
					this.aBoolean75 = true;
				}
				if (local7 == 3) {
					@Pc(53) boolean local53 = this.aBoolean55;
					if (local15 == 0) {
						this.method110(0, this.aBoolean55);
						this.aBoolean55 = true;
					}
					if (local15 == 1) {
						this.method110(-400, this.aBoolean55);
						this.aBoolean55 = true;
					}
					if (local15 == 2) {
						this.method110(-800, this.aBoolean55);
						this.aBoolean55 = true;
					}
					if (local15 == 3) {
						this.method110(-1200, this.aBoolean55);
						this.aBoolean55 = true;
					}
					if (local15 == 4) {
						this.aBoolean55 = false;
					}
					if (this.aBoolean55 != local53 && !aBoolean48) {
						if (this.aBoolean55) {
							this.anInt441 = this.anInt432;
							this.aBoolean83 = false;
							this.aClass45_Sub1_1.method657(2, this.anInt441);
						} else {
							this.method120();
						}
						this.anInt414 = 0;
					}
				}
				if (local7 == 4) {
					if (local15 == 0) {
						this.aBoolean57 = true;
						this.method189(this.anInt248, 0);
					}
					if (local15 == 1) {
						this.aBoolean57 = true;
						this.method189(this.anInt248, -400);
					}
					if (local15 == 2) {
						this.aBoolean57 = true;
						this.method189(this.anInt248, -800);
					}
					if (local15 == 3) {
						this.aBoolean57 = true;
						this.method189(this.anInt248, -1200);
					}
					if (local15 == 4) {
						this.aBoolean57 = false;
					}
				}
				if (local7 == 5) {
					this.anInt387 = local15;
				}
				if (local7 == 6) {
					this.anInt335 = local15;
				}
				if (local7 == 8) {
					this.anInt313 = local15;
					this.aBoolean79 = true;
				}
				if (local7 == 9) {
					this.anInt398 = local15;
				}
			}
		} catch (@Pc(217) RuntimeException local217) {
			signlink.reporterror("59345, " + false + ", " + arg0 + ", " + local217.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!mb;)V")
	private void method143(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt334; local3++) {
				@Pc(10) int local10 = this.anIntArray63[local3];
				@Pc(15) Class1_Sub1_Sub1_Sub1_Sub1 local15 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local10];
				@Pc(18) int local18 = arg2.method498();
				@Pc(26) int local26;
				@Pc(29) int local29;
				if ((local18 & 0x1) == 1) {
					local26 = arg2.method498();
					local29 = arg2.method498();
					local15.method50(local29, local26);
					local15.anInt141 = anInt426 + 300;
					local15.anInt142 = arg2.method498();
					local15.anInt143 = arg2.method498();
				}
				if ((local18 & 0x2) == 2) {
					local26 = arg2.method500();
					if (local26 == 65535) {
						local26 = -1;
					}
					if (local26 == local15.anInt150) {
						local15.anInt154 = 0;
					}
					local29 = arg2.method498();
					if (local26 == local15.anInt150 && local26 != -1) {
						@Pc(82) int local82 = Class27.aClass27Array1[local26].anInt817;
						if (local82 == 1) {
							local15.anInt151 = 0;
							local15.anInt152 = 0;
							local15.anInt153 = local29;
							local15.anInt154 = 0;
						}
						if (local82 == 2) {
							local15.anInt154 = 0;
						}
					} else if (local26 == -1 || local15.anInt150 == -1 || Class27.aClass27Array1[local26].anInt811 >= Class27.aClass27Array1[local15.anInt150].anInt811) {
						local15.anInt150 = local26;
						local15.anInt151 = 0;
						local15.anInt152 = 0;
						local15.anInt153 = local29;
						local15.anInt154 = 0;
						local15.anInt173 = local15.anInt171;
					}
				}
				if ((local18 & 0x4) == 4) {
					local15.anInt144 = arg2.method500();
					if (local15.anInt144 == 65535) {
						local15.anInt144 = -1;
					}
				}
				if ((local18 & 0x8) == 8) {
					local15.aString3 = arg2.method505();
					local15.anInt138 = 100;
				}
				if ((local18 & 0x10) == 16) {
					local26 = arg2.method498();
					local29 = arg2.method498();
					local15.method50(local29, local26);
					local15.anInt141 = anInt426 + 300;
					local15.anInt142 = arg2.method498();
					local15.anInt143 = arg2.method498();
				}
				if ((local18 & 0x20) == 32) {
					local15.aClass13_1 = Class13.method320(arg2.method500());
					local15.anInt130 = local15.aClass13_1.aByte25;
					local15.anInt170 = local15.aClass13_1.anInt592;
					local15.anInt133 = local15.aClass13_1.anInt579;
					local15.anInt134 = local15.aClass13_1.anInt580;
					local15.anInt135 = local15.aClass13_1.anInt581;
					local15.anInt136 = local15.aClass13_1.anInt582;
					local15.anInt131 = local15.aClass13_1.anInt578;
				}
				if ((local18 & 0x40) == 64) {
					local15.anInt155 = arg2.method500();
					local26 = arg2.method503();
					local15.anInt159 = local26 >> 16;
					local15.anInt158 = anInt426 + (local26 & 0xFFFF);
					local15.anInt156 = 0;
					local15.anInt157 = 0;
					if (local15.anInt158 > anInt426) {
						local15.anInt156 = -1;
					}
					if (local15.anInt155 == 65535) {
						local15.anInt155 = -1;
					}
				}
				if ((local18 & 0x80) == 128) {
					local15.anInt145 = arg2.method500();
					local15.anInt146 = arg2.method500();
				}
			}
			if (arg1 != -59) {
				this.aClass31ArrayArrayArray1 = null;
			}
		} catch (@Pc(313) RuntimeException local313) {
			signlink.reporterror("64505, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local313.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method90() {
		if (signlink.sunjava) {
			super.anInt224 = 5;
		}
		if (aBoolean84) {
			this.aBoolean69 = true;
			return;
		}
		aBoolean84 = true;
		@Pc(16) boolean local16 = false;
		@Pc(20) String local20 = this.method217();
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
			this.aBoolean43 = true;
			return;
		}
		@Pc(84) int local84;
		if (signlink.aRandomAccessFile1 != null) {
			for (local84 = 0; local84 < 5; local84++) {
				this.aClass46Array1[local84] = new Class46(signlink.aRandomAccessFileArray1[local84], 0, 500000, local84 + 1, signlink.aRandomAccessFile1);
			}
		}
		try {
			local84 = 5;
			this.anIntArray90[8] = 0;
			while (this.anIntArray90[8] == 0) {
				this.method97((byte) 6, "Connecting to web server", 20);
				try {
					@Pc(133) DataInputStream local133 = this.method165("crc" + (int) (Math.random() * 9.9999999E7D));
					@Pc(140) Class1_Sub1_Sub3 local140 = new Class1_Sub1_Sub3(new byte[36], (byte) 3);
					local133.readFully(local140.aByteArray9, 0, 36);
					for (@Pc(148) int local148 = 0; local148 < 9; local148++) {
						this.anIntArray90[local148] = local140.method503();
					}
					local133.close();
				} catch (@Pc(164) IOException local164) {
					for (@Pc(166) int local166 = local84; local166 > 0; local166--) {
						this.method97((byte) 6, "Error loading - Will retry in " + local166 + " secs.", 10);
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
			this.aClass48_1 = this.method200("title screen", this.anIntArray90[1], 25, "title", 1);
			this.aClass1_Sub1_Sub2_Sub4_1 = new Class1_Sub1_Sub2_Sub4("p11", this.aClass48_1, true);
			this.aClass1_Sub1_Sub2_Sub4_2 = new Class1_Sub1_Sub2_Sub4("p12", this.aClass48_1, true);
			this.aClass1_Sub1_Sub2_Sub4_3 = new Class1_Sub1_Sub2_Sub4("b12", this.aClass48_1, true);
			this.aClass1_Sub1_Sub2_Sub4_4 = new Class1_Sub1_Sub2_Sub4("q8", this.aClass48_1, true);
			this.method193();
			this.method225();
			@Pc(271) Class48 local271 = this.method200("config", this.anIntArray90[2], 30, "config", 2);
			@Pc(283) Class48 local283 = this.method200("interface", this.anIntArray90[3], 35, "interface", 3);
			@Pc(295) Class48 local295 = this.method200("2d graphics", this.anIntArray90[4], 40, "media", 4);
			@Pc(307) Class48 local307 = this.method200("textures", this.anIntArray90[6], 45, "textures", 6);
			@Pc(319) Class48 local319 = this.method200("chat system", this.anIntArray90[7], 50, "wordenc", 7);
			@Pc(331) Class48 local331 = this.method200("sound effects", this.anIntArray90[8], 55, "sounds", 8);
			this.aByteArrayArrayArray7 = new byte[4][104][104];
			this.anIntArrayArrayArray3 = new int[4][105][105];
			this.aClass39_1 = new Class39(104, 104, this.anIntArrayArrayArray3, (byte) 56, 4);
			for (@Pc(356) int local356 = 0; local356 < 4; local356++) {
				this.aClass19Array1[local356] = new Class19(3, 104, 104);
			}
			this.aClass1_Sub1_Sub2_Sub2_4 = new Class1_Sub1_Sub2_Sub2(512, 512);
			@Pc(391) Class48 local391 = this.method200("update list", this.anIntArray90[5], 60, "versionlist", 5);
			this.method97((byte) 6, "Connecting to update server", 60);
			this.aClass45_Sub1_1 = new Class45_Sub1();
			this.aClass45_Sub1_1.method648(local391, this);
			Class14.method324(this.aClass45_Sub1_1.method651());
			Class1_Sub1_Sub1_Sub5.method285(this.aClass45_Sub1_1.method650(0), this.aClass45_Sub1_1);
			if (!aBoolean48) {
				this.anInt441 = 0;
				this.aBoolean83 = false;
				this.aClass45_Sub1_1.method657(2, this.anInt441);
				while (this.aClass45_Sub1_1.method658() > 0) {
					this.method132();
					try {
						Thread.sleep(100L);
					} catch (@Pc(442) Exception local442) {
					}
				}
			}
			this.method97((byte) 6, "Requesting animations", 65);
			@Pc(458) int local458 = this.aClass45_Sub1_1.method650(1);
			for (@Pc(460) int local460 = 0; local460 < local458; local460++) {
				this.aClass45_Sub1_1.method657(1, local460);
			}
			@Pc(479) int local479;
			while (this.aClass45_Sub1_1.method658() > 0) {
				local479 = local458 - this.aClass45_Sub1_1.method658();
				if (local479 > 0) {
					this.method97((byte) 6, "Loading animations - " + local479 * 100 / local458 + "%", 65);
				}
				this.method132();
				try {
					Thread.sleep(100L);
				} catch (@Pc(505) Exception local505) {
				}
			}
			this.method97((byte) 6, "Requesting models", 70);
			local458 = this.aClass45_Sub1_1.method650(0);
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
					this.method97((byte) 6, "Loading models - " + local531 * 100 / local458 + "%", 70);
				}
				this.method132();
				try {
					Thread.sleep(100L);
				} catch (@Pc(582) Exception local582) {
				}
			}
			if (this.aClass46Array1[0] != null) {
				this.method97((byte) 6, "Requesting maps", 75);
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(47, 48, 0, anInt312));
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(47, 48, 1, anInt312));
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(48, 48, 0, anInt312));
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(48, 48, 1, anInt312));
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(49, 48, 0, anInt312));
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(49, 48, 1, anInt312));
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(47, 47, 0, anInt312));
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(47, 47, 1, anInt312));
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(48, 47, 0, anInt312));
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(48, 47, 1, anInt312));
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(48, 148, 0, anInt312));
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(48, 148, 1, anInt312));
				local458 = this.aClass45_Sub1_1.method658();
				while (this.aClass45_Sub1_1.method658() > 0) {
					local531 = local458 - this.aClass45_Sub1_1.method658();
					if (local531 > 0) {
						this.method97((byte) 6, "Loading maps - " + local531 * 100 / local458 + "%", 75);
					}
					this.method132();
					try {
						Thread.sleep(100L);
					} catch (@Pc(767) Exception local767) {
					}
				}
			}
			local458 = this.aClass45_Sub1_1.method650(0);
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
					this.aClass45_Sub1_1.method660(0, local790, local531);
				}
			}
			this.aClass45_Sub1_1.method653(aBoolean47);
			if (!aBoolean48) {
				local458 = this.aClass45_Sub1_1.method650(2);
				for (local788 = 1; local788 < local458; local788++) {
					if (this.aClass45_Sub1_1.method656(local788)) {
						this.aClass45_Sub1_1.method660(2, (byte) 1, local788);
					}
				}
			}
			this.method97((byte) 6, "Unpacking media", 80);
			this.aClass1_Sub1_Sub2_Sub3_9 = new Class1_Sub1_Sub2_Sub3(local295, "invback", 0);
			this.aClass1_Sub1_Sub2_Sub3_11 = new Class1_Sub1_Sub2_Sub3(local295, "chatback", 0);
			this.aClass1_Sub1_Sub2_Sub3_10 = new Class1_Sub1_Sub2_Sub3(local295, "mapback", 0);
			this.aClass1_Sub1_Sub2_Sub3_6 = new Class1_Sub1_Sub2_Sub3(local295, "backbase1", 0);
			this.aClass1_Sub1_Sub2_Sub3_7 = new Class1_Sub1_Sub2_Sub3(local295, "backbase2", 0);
			this.aClass1_Sub1_Sub2_Sub3_8 = new Class1_Sub1_Sub2_Sub3(local295, "backhmid1", 0);
			for (local788 = 0; local788 < 13; local788++) {
				this.aClass1_Sub1_Sub2_Sub3Array1[local788] = new Class1_Sub1_Sub2_Sub3(local295, "sideicons", local788);
			}
			this.aClass1_Sub1_Sub2_Sub2_3 = new Class1_Sub1_Sub2_Sub2(local295, "compass", 0);
			this.aClass1_Sub1_Sub2_Sub2_13 = new Class1_Sub1_Sub2_Sub2(local295, "mapedge", 0);
			this.aClass1_Sub1_Sub2_Sub2_13.method403();
			@Pc(990) int local990;
			try {
				for (local990 = 0; local990 < 50; local990++) {
					this.aClass1_Sub1_Sub2_Sub3Array2[local990] = new Class1_Sub1_Sub2_Sub3(local295, "mapscene", local990);
				}
			} catch (@Pc(1008) Exception local1008) {
			}
			try {
				for (local990 = 0; local990 < 50; local990++) {
					this.aClass1_Sub1_Sub2_Sub2Array6[local990] = new Class1_Sub1_Sub2_Sub2(local295, "mapfunction", local990);
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
					this.aClass1_Sub1_Sub2_Sub2Array5[local990] = new Class1_Sub1_Sub2_Sub2(local295, "headicons", local990);
				}
			} catch (@Pc(1068) Exception local1068) {
			}
			this.aClass1_Sub1_Sub2_Sub2_5 = new Class1_Sub1_Sub2_Sub2(local295, "mapmarker", 0);
			this.aClass1_Sub1_Sub2_Sub2_6 = new Class1_Sub1_Sub2_Sub2(local295, "mapmarker", 1);
			for (local990 = 0; local990 < 8; local990++) {
				this.aClass1_Sub1_Sub2_Sub2Array7[local990] = new Class1_Sub1_Sub2_Sub2(local295, "cross", local990);
			}
			this.aClass1_Sub1_Sub2_Sub2_9 = new Class1_Sub1_Sub2_Sub2(local295, "mapdots", 0);
			this.aClass1_Sub1_Sub2_Sub2_10 = new Class1_Sub1_Sub2_Sub2(local295, "mapdots", 1);
			this.aClass1_Sub1_Sub2_Sub2_11 = new Class1_Sub1_Sub2_Sub2(local295, "mapdots", 2);
			this.aClass1_Sub1_Sub2_Sub2_12 = new Class1_Sub1_Sub2_Sub2(local295, "mapdots", 3);
			this.aClass1_Sub1_Sub2_Sub3_12 = new Class1_Sub1_Sub2_Sub3(local295, "scrollbar", 0);
			this.aClass1_Sub1_Sub2_Sub3_13 = new Class1_Sub1_Sub2_Sub3(local295, "scrollbar", 1);
			this.aClass1_Sub1_Sub2_Sub3_16 = new Class1_Sub1_Sub2_Sub3(local295, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_17 = new Class1_Sub1_Sub2_Sub3(local295, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_18 = new Class1_Sub1_Sub2_Sub3(local295, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_19 = new Class1_Sub1_Sub2_Sub3(local295, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_19.method442();
			this.aClass1_Sub1_Sub2_Sub3_20 = new Class1_Sub1_Sub2_Sub3(local295, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_20.method442();
			this.aClass1_Sub1_Sub2_Sub3_1 = new Class1_Sub1_Sub2_Sub3(local295, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_1.method443();
			this.aClass1_Sub1_Sub2_Sub3_2 = new Class1_Sub1_Sub2_Sub3(local295, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_2.method443();
			this.aClass1_Sub1_Sub2_Sub3_3 = new Class1_Sub1_Sub2_Sub3(local295, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_3.method443();
			this.aClass1_Sub1_Sub2_Sub3_4 = new Class1_Sub1_Sub2_Sub3(local295, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_4.method442();
			this.aClass1_Sub1_Sub2_Sub3_4.method443();
			this.aClass1_Sub1_Sub2_Sub3_5 = new Class1_Sub1_Sub2_Sub3(local295, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_5.method442();
			this.aClass1_Sub1_Sub2_Sub3_5.method443();
			for (@Pc(1268) int local1268 = 0; local1268 < 2; local1268++) {
				this.aClass1_Sub1_Sub2_Sub3Array4[local1268] = new Class1_Sub1_Sub2_Sub3(local295, "mod_icons", local1268);
			}
			@Pc(1291) Class1_Sub1_Sub2_Sub2 local1291 = new Class1_Sub1_Sub2_Sub2(local295, "backleft1", 0);
			this.aClass37_19 = new Class37(true, this.method95(), local1291.anInt686, local1291.anInt687);
			local1291.method404(0, 0);
			@Pc(1316) Class1_Sub1_Sub2_Sub2 local1316 = new Class1_Sub1_Sub2_Sub2(local295, "backleft2", 0);
			this.aClass37_20 = new Class37(true, this.method95(), local1316.anInt686, local1316.anInt687);
			local1316.method404(0, 0);
			@Pc(1341) Class1_Sub1_Sub2_Sub2 local1341 = new Class1_Sub1_Sub2_Sub2(local295, "backright1", 0);
			this.aClass37_21 = new Class37(true, this.method95(), local1341.anInt686, local1341.anInt687);
			local1341.method404(0, 0);
			@Pc(1366) Class1_Sub1_Sub2_Sub2 local1366 = new Class1_Sub1_Sub2_Sub2(local295, "backright2", 0);
			this.aClass37_22 = new Class37(true, this.method95(), local1366.anInt686, local1366.anInt687);
			local1366.method404(0, 0);
			@Pc(1391) Class1_Sub1_Sub2_Sub2 local1391 = new Class1_Sub1_Sub2_Sub2(local295, "backtop1", 0);
			this.aClass37_23 = new Class37(true, this.method95(), local1391.anInt686, local1391.anInt687);
			local1391.method404(0, 0);
			@Pc(1416) Class1_Sub1_Sub2_Sub2 local1416 = new Class1_Sub1_Sub2_Sub2(local295, "backvmid1", 0);
			this.aClass37_24 = new Class37(true, this.method95(), local1416.anInt686, local1416.anInt687);
			local1416.method404(0, 0);
			@Pc(1441) Class1_Sub1_Sub2_Sub2 local1441 = new Class1_Sub1_Sub2_Sub2(local295, "backvmid2", 0);
			this.aClass37_25 = new Class37(true, this.method95(), local1441.anInt686, local1441.anInt687);
			local1441.method404(0, 0);
			@Pc(1466) Class1_Sub1_Sub2_Sub2 local1466 = new Class1_Sub1_Sub2_Sub2(local295, "backvmid3", 0);
			this.aClass37_26 = new Class37(true, this.method95(), local1466.anInt686, local1466.anInt687);
			local1466.method404(0, 0);
			@Pc(1491) Class1_Sub1_Sub2_Sub2 local1491 = new Class1_Sub1_Sub2_Sub2(local295, "backhmid2", 0);
			this.aClass37_27 = new Class37(true, this.method95(), local1491.anInt686, local1491.anInt687);
			local1491.method404(0, 0);
			@Pc(1516) int local1516 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1523) int local1523 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1530) int local1530 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1537) int local1537 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1539) int local1539 = 0; local1539 < 50; local1539++) {
				if (this.aClass1_Sub1_Sub2_Sub2Array6[local1539] != null) {
					this.aClass1_Sub1_Sub2_Sub2Array6[local1539].method402(local1523 + local1537, local1516 + local1537, local1530 + local1537);
				}
				if (this.aClass1_Sub1_Sub2_Sub3Array2[local1539] != null) {
					this.aClass1_Sub1_Sub2_Sub3Array2[local1539].method444(local1523 + local1537, local1516 + local1537, local1530 + local1537);
				}
			}
			this.method97((byte) 6, "Unpacking textures", 83);
			Class1_Sub1_Sub2_Sub1.method375(local307);
			Class1_Sub1_Sub2_Sub1.method379(241, 0.8D);
			Class1_Sub1_Sub2_Sub1.method374();
			this.method97((byte) 6, "Unpacking config", 86);
			Class27.method516(local271);
			Class9.method256(local271);
			Class21.method447(local271);
			Class15.method343(local271);
			Class13.method318(local271);
			Class23.method477(local271);
			Class32.method528(local271);
			Class38.method541(local271);
			Class35.method536(local271);
			Class15.aBoolean151 = aBoolean47;
			if (!aBoolean48) {
				this.method97((byte) 6, "Unpacking sounds", 90);
				@Pc(1642) byte[] local1642 = local331.method678("sounds.dat", null);
				@Pc(1648) Class1_Sub1_Sub3 local1648 = new Class1_Sub1_Sub3(local1642, (byte) 3);
				Class5.method79(local1648);
			}
			this.method97((byte) 6, "Unpacking interfaces", 95);
			@Pc(1679) Class1_Sub1_Sub2_Sub4[] local1679 = new Class1_Sub1_Sub2_Sub4[] { this.aClass1_Sub1_Sub2_Sub4_1, this.aClass1_Sub1_Sub2_Sub4_2, this.aClass1_Sub1_Sub2_Sub4_3, this.aClass1_Sub1_Sub2_Sub4_4 };
			Class6.method230(local295, local1679, local283);
			this.method97((byte) 6, "Preparing game engine", 100);
			@Pc(1695) int local1695;
			@Pc(1697) int local1697;
			@Pc(1699) int local1699;
			for (@Pc(1691) int local1691 = 0; local1691 < 33; local1691++) {
				local1695 = 999;
				local1697 = 0;
				for (local1699 = 0; local1699 < 34; local1699++) {
					if (this.aClass1_Sub1_Sub2_Sub3_10.aByteArray7[local1699 + local1691 * this.aClass1_Sub1_Sub2_Sub3_10.anInt715] == 0) {
						if (local1695 == 999) {
							local1695 = local1699;
						}
					} else if (local1695 != 999) {
						local1697 = local1699;
						break;
					}
				}
				this.anIntArray86[local1691] = local1695;
				this.anIntArray66[local1691] = local1697 - local1695;
			}
			@Pc(1757) int local1757;
			for (local1695 = 5; local1695 < 156; local1695++) {
				local1697 = 999;
				local1699 = 0;
				for (local1757 = 25; local1757 < 172; local1757++) {
					if (this.aClass1_Sub1_Sub2_Sub3_10.aByteArray7[local1757 + local1695 * this.aClass1_Sub1_Sub2_Sub3_10.anInt715] == 0 && (local1757 > 34 || local1695 > 34)) {
						if (local1697 == 999) {
							local1697 = local1757;
						}
					} else if (local1697 != 999) {
						local1699 = local1757;
						break;
					}
				}
				this.anIntArray75[local1695 - 5] = local1697 - 25;
				this.anIntArray95[local1695 - 5] = local1699 - local1697;
			}
			Class1_Sub1_Sub2_Sub1.method372(479, 96);
			this.anIntArray87 = Class1_Sub1_Sub2_Sub1.anIntArray185;
			Class1_Sub1_Sub2_Sub1.method372(190, 261);
			this.anIntArray88 = Class1_Sub1_Sub2_Sub1.anIntArray185;
			Class1_Sub1_Sub2_Sub1.method372(512, 334);
			this.anIntArray89 = Class1_Sub1_Sub2_Sub1.anIntArray185;
			@Pc(1841) int[] local1841 = new int[9];
			for (local1699 = 0; local1699 < 9; local1699++) {
				local1757 = local1699 * 32 + 128 + 15;
				@Pc(1859) int local1859 = local1757 * 3 + 600;
				@Pc(1863) int local1863 = Class1_Sub1_Sub2_Sub1.anIntArray183[local1757];
				local1841[local1699] = local1859 * local1863 >> 16;
			}
			Class39.method580(local1841, aBoolean56);
			Class41.method603(local319);
			this.aClass11_1 = new Class11(0, this);
			this.method96(this.aClass11_1, 10);
		} catch (@Pc(1898) Exception local1898) {
			signlink.reporterror("loaderror " + this.aString13 + " " + this.anInt246);
			this.aBoolean78 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method144(@OriginalArg(0) boolean arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt254; local1++) {
				@Pc(11) Class1_Sub1_Sub1_Sub1_Sub1 local11 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray42[local1]];
				@Pc(20) int local20 = (this.anIntArray42[local1] << 14) + 536870912;
				if (local11 != null && local11.method49() && local11.aClass13_1.aBoolean142 == arg0) {
					@Pc(36) int local36 = local11.anInt127 >> 7;
					@Pc(41) int local41 = local11.anInt128 >> 7;
					if (local36 >= 0 && local36 < 104 && local41 >= 0 && local41 < 104) {
						if (local11.anInt130 == 1 && (local11.anInt127 & 0x7F) == 64 && (local11.anInt128 & 0x7F) == 64) {
							if (this.anIntArrayArray5[local36][local41] == this.anInt303) {
								continue;
							}
							this.anIntArrayArray5[local36][local41] = this.anInt303;
						}
						this.aClass39_1.method555(local11.anInt129, local20, (local11.anInt130 - 1) * 64 + 60, local11.anInt127, local11, this.method137(local11.anInt128, this.anInt278, local11.anInt127), this.anInt278, local11.aBoolean27, local11.anInt128);
					}
				}
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("29138, " + arg0 + ", " + 47055 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)V")
	private void method145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			this.aClass1_Sub1_Sub2_Sub3_12.method445(arg3, arg5);
			this.aClass1_Sub1_Sub2_Sub3_13.method445(arg3, arg5 + arg1 - 16);
			Class1_Sub1_Sub2.method458(arg1 - 32, 16, arg3, arg5 + 16, (byte) 3, this.anInt365);
			@Pc(35) int local35 = (arg1 - 32) * arg1 / arg2;
			if (local35 < 8) {
				local35 = 8;
			}
			@Pc(52) int local52 = (arg1 - local35 - 32) * arg4 / (arg2 - arg1);
			Class1_Sub1_Sub2.method458(local35, 16, arg3, arg5 + local52 + 16, (byte) 3, this.anInt423);
			Class1_Sub1_Sub2.method463(arg5 + local52 + 16, local35, this.anInt396, arg3);
			Class1_Sub1_Sub2.method463(arg5 + local52 + 16, local35, this.anInt396, arg3 + 1);
			Class1_Sub1_Sub2.method461(arg3, arg5 + local52 + 16, this.anInt396, 16);
			Class1_Sub1_Sub2.method461(arg3, arg5 + local52 + 17, this.anInt396, 16);
			Class1_Sub1_Sub2.method463(arg5 + local52 + 16, local35, this.anInt367, arg3 + 15);
			if (arg0 >= 0) {
				for (@Pc(127) int local127 = 1; local127 > 0; local127++) {
				}
			}
			Class1_Sub1_Sub2.method463(arg5 + local52 + 17, local35 - 1, this.anInt367, arg3 + 14);
			Class1_Sub1_Sub2.method461(arg3, arg5 + local52 + local35 + 15, this.anInt367, 16);
			Class1_Sub1_Sub2.method461(arg3 + 1, arg5 + 14 + local52 + local35, this.anInt367, 15);
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("77186, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local177.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method146() {
		try {
			try {
				if (this.aClass8_1 != null) {
					this.aClass8_1.method244();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass8_1 = null;
			this.anInt349 += 0;
			this.aBoolean46 = false;
			this.anInt386 = 0;
			this.aString10 = "";
			this.aString11 = "";
			Class10.method267();
			this.method124();
			this.aClass39_1.method544();
			for (@Pc(39) int local39 = 0; local39 < 4; local39++) {
				this.aClass19Array1[local39].method414();
			}
			System.gc();
			this.method120();
			this.anInt432 = -1;
			this.anInt441 = -1;
			this.anInt414 = 0;
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("94058, " + 0 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZII)I")
	private int method147(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = 256 - arg1;
			return ((arg0 & 0xFF00FF) * local3 + (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg0 & 0xFF00) * local3 + (arg2 & 0xFF00) * arg1 & 0xFF0000) >> 8;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("84796, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)I")
	private int method148() {
		try {
			@Pc(3) int local3 = 3;
			if (this.anInt274 < 310) {
				@Pc(18) int local18 = this.anInt271 >> 7;
				@Pc(23) int local23 = this.anInt273 >> 7;
				@Pc(28) int local28 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt127 >> 7;
				@Pc(33) int local33 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 >> 7;
				if ((this.aByteArrayArrayArray7[this.anInt278][local18][local23] & 0x4) != 0) {
					local3 = this.anInt278;
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
						if ((this.aByteArrayArrayArray7[this.anInt278][local18][local23] & 0x4) != 0) {
							local3 = this.anInt278;
						}
						local85 += local83;
						if (local85 >= 65536) {
							local85 -= 65536;
							if (local23 < local33) {
								local23++;
							} else if (local23 > local33) {
								local23--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt278][local18][local23] & 0x4) != 0) {
								local3 = this.anInt278;
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
						if ((this.aByteArrayArrayArray7[this.anInt278][local18][local23] & 0x4) != 0) {
							local3 = this.anInt278;
						}
						local85 += local83;
						if (local85 >= 65536) {
							local85 -= 65536;
							if (local18 < local28) {
								local18++;
							} else if (local18 > local28) {
								local18--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt278][local18][local23] & 0x4) != 0) {
								local3 = this.anInt278;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray7[this.anInt278][aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt127 >> 7][aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 >> 7] & 0x4) != 0) {
				local3 = this.anInt278;
			}
			return local3;
		} catch (@Pc(251) RuntimeException local251) {
			signlink.reporterror("82225, " + 34 + ", " + local251.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)I")
	private int method149(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(9) int local9 = this.method137(this.anInt273, this.anInt278, this.anInt271);
			if (arg0) {
				this.aClass31ArrayArrayArray1 = null;
			}
			return local9 - this.anInt272 >= 800 || (this.aByteArrayArrayArray7[this.anInt278][this.anInt271 >> 7][this.anInt273 >> 7] & 0x4) == 0 ? 3 : this.anInt278;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("88564, " + arg0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILclient!gc;II)V")
	private void method150(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (this.anInt299 < 400) {
				@Pc(9) String local9 = arg1.aString25;
				this.aBoolean46 &= true;
				if (arg1.anInt586 != 0) {
					local9 = local9 + method117(arg1.anInt586, aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt176) + " (level-" + arg1.anInt586 + ")";
				}
				if (this.anInt242 == 1) {
					this.aStringArray4[this.anInt299] = "Use " + this.aString5 + " with @yel@" + local9;
					this.anIntArray37[this.anInt299] = 829;
					this.anIntArray38[this.anInt299] = arg2;
					this.anIntArray35[this.anInt299] = arg0;
					this.anIntArray36[this.anInt299] = arg3;
					this.anInt299++;
				} else if (this.anInt336 != 1) {
					@Pc(153) int local153;
					if (arg1.aStringArray9 != null) {
						for (local153 = 4; local153 >= 0; local153--) {
							if (arg1.aStringArray9[local153] != null && !arg1.aStringArray9[local153].equalsIgnoreCase("attack")) {
								this.aStringArray4[this.anInt299] = arg1.aStringArray9[local153] + " @yel@" + local9;
								if (local153 == 0) {
									this.anIntArray37[this.anInt299] = 242;
								}
								if (local153 == 1) {
									this.anIntArray37[this.anInt299] = 209;
								}
								if (local153 == 2) {
									this.anIntArray37[this.anInt299] = 309;
								}
								if (local153 == 3) {
									this.anIntArray37[this.anInt299] = 852;
								}
								if (local153 == 4) {
									this.anIntArray37[this.anInt299] = 793;
								}
								this.anIntArray38[this.anInt299] = arg2;
								this.anIntArray35[this.anInt299] = arg0;
								this.anIntArray36[this.anInt299] = arg3;
								this.anInt299++;
							}
						}
					}
					if (arg1.aStringArray9 != null) {
						for (local153 = 4; local153 >= 0; local153--) {
							if (arg1.aStringArray9[local153] != null && arg1.aStringArray9[local153].equalsIgnoreCase("attack")) {
								@Pc(277) short local277 = 0;
								if (arg1.anInt586 > aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt176) {
									local277 = 2000;
								}
								this.aStringArray4[this.anInt299] = arg1.aStringArray9[local153] + " @yel@" + local9;
								if (local153 == 0) {
									this.anIntArray37[this.anInt299] = local277 + 242;
								}
								if (local153 == 1) {
									this.anIntArray37[this.anInt299] = local277 + 209;
								}
								if (local153 == 2) {
									this.anIntArray37[this.anInt299] = local277 + 309;
								}
								if (local153 == 3) {
									this.anIntArray37[this.anInt299] = local277 + 852;
								}
								if (local153 == 4) {
									this.anIntArray37[this.anInt299] = local277 + 793;
								}
								this.anIntArray38[this.anInt299] = arg2;
								this.anIntArray35[this.anInt299] = arg0;
								this.anIntArray36[this.anInt299] = arg3;
								this.anInt299++;
							}
						}
					}
					this.aStringArray4[this.anInt299] = "Examine @yel@" + local9;
					this.anIntArray37[this.anInt299] = 1714;
					this.anIntArray38[this.anInt299] = arg2;
					this.anIntArray35[this.anInt299] = arg0;
					this.anIntArray36[this.anInt299] = arg3;
					this.anInt299++;
				} else if ((this.anInt338 & 0x2) == 2) {
					this.aStringArray4[this.anInt299] = this.aString7 + " @yel@" + local9;
					this.anIntArray37[this.anInt299] = 240;
					this.anIntArray38[this.anInt299] = arg2;
					this.anIntArray35[this.anInt299] = arg0;
					this.anIntArray36[this.anInt299] = arg3;
					this.anInt299++;
					return;
				}
			}
		} catch (@Pc(427) RuntimeException local427) {
			signlink.reporterror("54304, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local427.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(JI)V")
	private void method151(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt451 >= 100) {
					this.method182("", 0, this.anInt433, "Your ignore list is full. Max of 100 hit");
				} else {
					@Pc(24) String local24 = Class49.method683(Class49.method680(arg0));
					for (@Pc(26) int local26 = 0; local26 < this.anInt451; local26++) {
						if (this.aLongArray3[local26] == arg0) {
							this.method182("", 0, this.anInt433, local24 + " is already on your ignore list");
							return;
						}
					}
					for (@Pc(57) int local57 = 0; local57 < this.anInt439; local57++) {
						if (this.aLongArray4[local57] == arg0) {
							this.method182("", 0, this.anInt433, "Please remove " + local24 + " from your friend list first");
							return;
						}
					}
					this.aLongArray3[this.anInt451++] = arg0;
					this.aBoolean44 = true;
					this.aClass1_Sub1_Sub3_4.method487(189);
					this.aClass1_Sub1_Sub3_4.method494(arg0);
				}
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("60558, " + arg0 + ", " + 35615 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method152() {
		try {
			if (this.anInt313 != 0) {
				@Pc(5) int local5 = 0;
				if (this.anInt363 != 0) {
					local5 = 1;
				}
				for (@Pc(17) int local17 = 0; local17 < 100; local17++) {
					if (this.aStringArray2[local17] != null) {
						@Pc(29) int local29 = this.anIntArray44[local17];
						@Pc(34) String local34 = this.aStringArray1[local17];
						if (local34 != null && local34.startsWith("@cr1@")) {
							local34 = local34.substring(5);
						}
						if (local34 != null && local34.startsWith("@cr2@")) {
							local34 = local34.substring(5);
						}
						if ((local29 == 3 || local29 == 7) && (local29 == 7 || this.anInt444 == 0 || this.anInt444 == 1 && this.method115(local34))) {
							@Pc(87) int local87 = 329 - local5 * 13;
							if (super.anInt230 > 4 && super.anInt231 - 4 > local87 - 10 && super.anInt231 - 4 <= local87 + 3) {
								@Pc(126) int local126 = this.aClass1_Sub1_Sub2_Sub4_2.method467("From:  " + local34 + this.aStringArray2[local17]) + 25;
								if (local126 > 450) {
									local126 = 450;
								}
								if (super.anInt230 < local126 + 4) {
									if (this.anInt394 >= 1) {
										this.aStringArray4[this.anInt299] = "Report abuse @whi@" + local34;
										this.anIntArray37[this.anInt299] = 2524;
										this.anInt299++;
									}
									this.aStringArray4[this.anInt299] = "Add ignore @whi@" + local34;
									this.anIntArray37[this.anInt299] = 2047;
									this.anInt299++;
									this.aStringArray4[this.anInt299] = "Add friend @whi@" + local34;
									this.anIntArray37[this.anInt299] = 2605;
									this.anInt299++;
								}
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local29 == 5 || local29 == 6) && this.anInt444 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(239) RuntimeException local239) {
			signlink.reporterror("43533, " + 0 + ", " + local239.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!z;)V")
	private void method153(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub1_Sub1 arg1) {
		try {
			this.method154(arg1.anInt128, arg1.anInt127, arg0);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("11410, " + arg0 + ", " + 99 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZII)V")
	private void method154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg1 >= 128 && arg0 >= 128 && arg1 <= 13056 && arg0 <= 13056) {
				@Pc(28) int local28 = this.method137(arg0, this.anInt278, arg1) - arg2;
				@Pc(33) int local33 = arg1 - this.anInt271;
				@Pc(38) int local38 = local28 - this.anInt272;
				@Pc(48) int local48 = arg0 - this.anInt273;
				@Pc(53) int local53 = Class1_Sub1_Sub1_Sub5.anIntArray158[this.anInt274];
				@Pc(58) int local58 = Class1_Sub1_Sub1_Sub5.anIntArray159[this.anInt274];
				@Pc(63) int local63 = Class1_Sub1_Sub1_Sub5.anIntArray158[this.anInt275];
				@Pc(68) int local68 = Class1_Sub1_Sub1_Sub5.anIntArray159[this.anInt275];
				@Pc(78) int local78 = local48 * local63 + local33 * local68 >> 16;
				@Pc(88) int local88 = local48 * local68 - local33 * local63 >> 16;
				@Pc(90) int local90 = local78;
				@Pc(100) int local100 = local38 * local58 - local88 * local53 >> 16;
				@Pc(110) int local110 = local38 * local53 + local88 * local58 >> 16;
				if (local110 >= 50) {
					this.anInt288 = Class1_Sub1_Sub2_Sub1.anInt661 + (local90 << 9) / local110;
					this.anInt289 = Class1_Sub1_Sub2_Sub1.anInt662 + (local100 << 9) / local110;
				} else {
					this.anInt288 = -1;
					this.anInt289 = -1;
				}
			} else {
				this.anInt288 = -1;
				this.anInt289 = -1;
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("54561, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIIZII)Z")
	private boolean method155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray3[local7][local11] = 0;
					this.anIntArrayArray2[local7][local11] = 99999999;
				}
			}
			local11 = arg6;
			@Pc(39) int local39 = arg5;
			this.anIntArrayArray3[arg6][arg5] = 99;
			this.anIntArrayArray2[arg6][arg5] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray82[0] = arg6;
			@Pc(66) int local66 = local55 + 1;
			this.anIntArray83[0] = arg5;
			@Pc(70) boolean local70 = false;
			@Pc(74) int local74 = this.anIntArray82.length;
			@Pc(81) int[][] local81 = this.aClass19Array1[this.anInt278].anIntArrayArray17;
			@Pc(193) int local193;
			while (local57 != local66) {
				local11 = this.anIntArray82[local57];
				local39 = this.anIntArray83[local57];
				local57 = (local57 + 1) % local74;
				if (local11 == arg3 && local39 == arg7) {
					local70 = true;
					break;
				}
				if (arg10 != 0) {
					if ((arg10 < 5 || arg10 == 10) && this.aClass19Array1[this.anInt278].method423(arg2, arg3, local39, arg7, arg10 - 1, local11)) {
						local70 = true;
						break;
					}
					if (arg10 < 10 && this.aClass19Array1[this.anInt278].method424(this.aBoolean53, arg3, local39, arg10 - 1, arg2, local11, arg7)) {
						local70 = true;
						break;
					}
				}
				if (arg9 != 0 && arg1 != 0 && this.aClass19Array1[this.anInt278].method425(arg9, local11, arg0, arg3, local39, arg1, arg7)) {
					local70 = true;
					break;
				}
				local193 = this.anIntArrayArray2[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray3[local11 - 1][local39] == 0 && (local81[local11 - 1][local39] & 0x280108) == 0) {
					this.anIntArray82[local66] = local11 - 1;
					this.anIntArray83[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray3[local11 - 1][local39] = 2;
					this.anIntArrayArray2[local11 - 1][local39] = local193;
				}
				if (local11 < 103 && this.anIntArrayArray3[local11 + 1][local39] == 0 && (local81[local11 + 1][local39] & 0x280180) == 0) {
					this.anIntArray82[local66] = local11 + 1;
					this.anIntArray83[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray3[local11 + 1][local39] = 8;
					this.anIntArrayArray2[local11 + 1][local39] = local193;
				}
				if (local39 > 0 && this.anIntArrayArray3[local11][local39 - 1] == 0 && (local81[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray82[local66] = local11;
					this.anIntArray83[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray3[local11][local39 - 1] = 1;
					this.anIntArrayArray2[local11][local39 - 1] = local193;
				}
				if (local39 < 103 && this.anIntArrayArray3[local11][local39 + 1] == 0 && (local81[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray82[local66] = local11;
					this.anIntArray83[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray3[local11][local39 + 1] = 4;
					this.anIntArrayArray2[local11][local39 + 1] = local193;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray3[local11 - 1][local39 - 1] == 0 && (local81[local11 - 1][local39 - 1] & 0x28010E) == 0 && (local81[local11 - 1][local39] & 0x280108) == 0 && (local81[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray82[local66] = local11 - 1;
					this.anIntArray83[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray3[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray2[local11 - 1][local39 - 1] = local193;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray3[local11 + 1][local39 - 1] == 0 && (local81[local11 + 1][local39 - 1] & 0x280183) == 0 && (local81[local11 + 1][local39] & 0x280180) == 0 && (local81[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray82[local66] = local11 + 1;
					this.anIntArray83[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray3[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray2[local11 + 1][local39 - 1] = local193;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray3[local11 - 1][local39 + 1] == 0 && (local81[local11 - 1][local39 + 1] & 0x280138) == 0 && (local81[local11 - 1][local39] & 0x280108) == 0 && (local81[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray82[local66] = local11 - 1;
					this.anIntArray83[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray3[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray2[local11 - 1][local39 + 1] = local193;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray3[local11 + 1][local39 + 1] == 0 && (local81[local11 + 1][local39 + 1] & 0x2801E0) == 0 && (local81[local11 + 1][local39] & 0x280180) == 0 && (local81[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray82[local66] = local11 + 1;
					this.anIntArray83[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray3[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray2[local11 + 1][local39 + 1] = local193;
				}
			}
			this.anInt285 = 0;
			@Pc(809) int local809;
			@Pc(815) int local815;
			@Pc(821) int local821;
			if (!local70) {
				if (arg8) {
					local193 = 100;
					for (local809 = 1; local809 < 2; local809++) {
						for (local815 = arg3 - local809; local815 <= arg3 + local809; local815++) {
							for (local821 = arg7 - local809; local821 <= arg7 + local809; local821++) {
								if (local815 >= 0 && local821 >= 0 && local815 < 104 && local821 < 104 && this.anIntArrayArray2[local815][local821] < local193) {
									local193 = this.anIntArrayArray2[local815][local821];
									local11 = local815;
									local39 = local821;
									this.anInt285 = 1;
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
			@Pc(882) byte local882 = 0;
			this.anIntArray82[0] = local11;
			local57 = local882 + 1;
			this.anIntArray83[0] = local39;
			local193 = local809 = this.anIntArrayArray3[local11][local39];
			while (local11 != arg6 || local39 != arg5) {
				if (local193 != local809) {
					local809 = local193;
					this.anIntArray82[local57] = local11;
					this.anIntArray83[local57++] = local39;
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
				local193 = this.anIntArrayArray3[local11][local39];
			}
			if (local57 > 0) {
				local74 = local57;
				if (local57 > 25) {
					local74 = 25;
				}
				local57--;
				local815 = this.anIntArray82[local57];
				local821 = this.anIntArray83[local57];
				if (arg4 == 0) {
					this.aClass1_Sub1_Sub3_4.method487(6);
					this.aClass1_Sub1_Sub3_4.method488(local74 + local74 + 3);
				}
				if (arg4 == 1) {
					this.aClass1_Sub1_Sub3_4.method487(220);
					this.aClass1_Sub1_Sub3_4.method488(local74 + local74 + 3 + 14);
				}
				if (arg4 == 2) {
					this.aClass1_Sub1_Sub3_4.method487(127);
					this.aClass1_Sub1_Sub3_4.method488(local74 + local74 + 3);
				}
				if (super.anIntArray32[5] == 1) {
					this.aClass1_Sub1_Sub3_4.method488(1);
				} else {
					this.aClass1_Sub1_Sub3_4.method488(0);
				}
				this.aClass1_Sub1_Sub3_4.method489(local815 + this.anInt381);
				this.aClass1_Sub1_Sub3_4.method489(local821 + this.anInt382);
				this.anInt290 = this.anIntArray82[0];
				this.anInt291 = this.anIntArray83[0];
				for (@Pc(1079) int local1079 = 1; local1079 < local74; local1079++) {
					local57--;
					this.aClass1_Sub1_Sub3_4.method488(this.anIntArray82[local57] - local815);
					this.aClass1_Sub1_Sub3_4.method488(this.anIntArray83[local57] - local821);
				}
				return true;
			} else if (arg4 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1114) RuntimeException local1114) {
			signlink.reporterror("21704, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 9 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method156(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) Graphics local4 = this.method95().getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			this.method88(this.anInt300);
			if (arg0 != -36217) {
				this.aClass31ArrayArrayArray1 = null;
			}
			@Pc(43) byte local43;
			@Pc(49) int local49;
			if (this.aBoolean78) {
				this.aBoolean88 = false;
				local4.setFont(new Font("Helvetica", 1, 16));
				local4.setColor(Color.yellow);
				local43 = 35;
				local4.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
				local49 = local43 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				@Pc(58) int local58 = local49 + 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				@Pc(75) int local75 = local58 + 30;
				local4.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
				@Pc(81) int local81 = local75 + 30;
				local4.drawString("3: Try using a different game-world", 30, 195);
				@Pc(87) int local87 = local81 + 30;
				local4.drawString("4: Try rebooting your computer", 30, 225);
				@Pc(93) int local93 = local87 + 30;
				local4.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
			}
			if (this.aBoolean43) {
				this.aBoolean88 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean69) {
				this.aBoolean88 = false;
				local4.setColor(Color.yellow);
				local43 = 35;
				local4.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
				local49 = local43 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				local49 += 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				local49 += 30;
				local4.drawString("2: Try rebooting your computer, and reloading", 30, 165);
				local49 += 30;
			}
		} catch (@Pc(181) RuntimeException local181) {
			signlink.reporterror("5044, " + arg0 + ", " + local181.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!mb;II)V")
	private void method157(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			arg0.method508();
			@Pc(12) int local12 = arg0.method509(8);
			@Pc(18) int local18;
			if (local12 < this.anInt254) {
				for (local18 = local12; local18 < this.anInt254; local18++) {
					this.anIntArray67[this.anInt364++] = this.anIntArray42[local18];
				}
			}
			if (local12 > this.anInt254) {
				signlink.reporterror(this.aString10 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt254 = 0;
			for (local18 = 0; local18 < local12; local18++) {
				@Pc(70) int local70 = this.anIntArray42[local18];
				@Pc(75) Class1_Sub1_Sub1_Sub1_Sub1 local75 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local70];
				@Pc(80) int local80 = arg0.method509(1);
				if (local80 == 0) {
					this.anIntArray42[this.anInt254++] = local70;
					local75.anInt167 = anInt426;
				} else {
					@Pc(103) int local103 = arg0.method509(2);
					if (local103 == 0) {
						this.anIntArray42[this.anInt254++] = local70;
						local75.anInt167 = anInt426;
						this.anIntArray63[this.anInt334++] = local70;
					} else {
						@Pc(154) int local154;
						@Pc(164) int local164;
						if (local103 == 1) {
							this.anIntArray42[this.anInt254++] = local70;
							local75.anInt167 = anInt426;
							local154 = arg0.method509(3);
							local75.method47(false, local154);
							local164 = arg0.method509(1);
							if (local164 == 1) {
								this.anIntArray63[this.anInt334++] = local70;
							}
						} else if (local103 == 2) {
							this.anIntArray42[this.anInt254++] = local70;
							local75.anInt167 = anInt426;
							local154 = arg0.method509(3);
							local75.method47(true, local154);
							local164 = arg0.method509(3);
							local75.method47(true, local164);
							@Pc(222) int local222 = arg0.method509(1);
							if (local222 == 1) {
								this.anIntArray63[this.anInt334++] = local70;
							}
						} else if (local103 == 3) {
							this.anIntArray67[this.anInt364++] = local70;
						}
					}
				}
			}
		} catch (@Pc(259) RuntimeException local259) {
			signlink.reporterror("7535, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local259.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method158() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt322);
			if (this.aClass45_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass45_Sub1_1.anInt985);
			}
			System.out.println("loop-cycle:" + anInt426);
			System.out.println("draw-cycle:" + anInt373);
			System.out.println("ptype:" + this.anInt350);
			System.out.println("psize:" + this.anInt349);
			if (this.aClass8_1 != null) {
				this.aClass8_1.method249();
			}
			super.aBoolean40 = true;
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("61978, " + -610 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)Ljava/awt/Component;")
	@Override
	protected Component method95() {
		try {
			this.anInt349 += 0;
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("2665, " + 0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!mb;ZI)V")
	private void method159(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.aBoolean46 &= true;
			while (arg0.anInt778 + 21 < arg1 * 8) {
				@Pc(18) int local18 = arg0.method509(14);
				if (local18 == 16383) {
					break;
				}
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local18] == null) {
					this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local18] = new Class1_Sub1_Sub1_Sub1_Sub1();
				}
				@Pc(38) Class1_Sub1_Sub1_Sub1_Sub1 local38 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local18];
				this.anIntArray42[this.anInt254++] = local18;
				local38.anInt167 = anInt426;
				local38.aClass13_1 = Class13.method320(arg0.method509(11));
				local38.anInt130 = local38.aClass13_1.aByte25;
				local38.anInt170 = local38.aClass13_1.anInt592;
				local38.anInt133 = local38.aClass13_1.anInt579;
				local38.anInt134 = local38.aClass13_1.anInt580;
				local38.anInt135 = local38.aClass13_1.anInt581;
				local38.anInt136 = local38.aClass13_1.anInt582;
				local38.anInt131 = local38.aClass13_1.anInt578;
				@Pc(99) int local99 = arg0.method509(5);
				if (local99 > 15) {
					local99 -= 32;
				}
				@Pc(108) int local108 = arg0.method509(5);
				if (local108 > 15) {
					local108 -= 32;
				}
				local38.method46(aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0] + local108, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0] + local99, false);
				@Pc(133) int local133 = arg0.method509(1);
				if (local133 == 1) {
					this.anIntArray63[this.anInt334++] = local18;
				}
			}
			arg0.method510();
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("84953, " + arg0 + ", " + true + ", " + arg1 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method160() {
		try {
			@Pc(13) int local13 = this.aClass1_Sub1_Sub2_Sub4_3.method467("Choose Option");
			@Pc(26) int local26;
			for (@Pc(15) int local15 = 0; local15 < this.anInt299; local15++) {
				local26 = this.aClass1_Sub1_Sub2_Sub4_3.method467(this.aStringArray4[local15]);
				if (local26 > local13) {
					local13 = local26;
				}
			}
			local13 += 8;
			local26 = this.anInt299 * 15 + 21;
			@Pc(69) int local69;
			@Pc(87) int local87;
			if (super.anInt236 > 4 && super.anInt237 > 4 && super.anInt236 < 516 && super.anInt237 < 338) {
				local69 = super.anInt236 - local13 / 2 - 4;
				if (local69 + local13 > 512) {
					local69 = 512 - local13;
				}
				if (local69 < 0) {
					local69 = 0;
				}
				local87 = super.anInt237 - 4;
				if (local87 + local26 > 334) {
					local87 = 334 - local26;
				}
				if (local87 < 0) {
					local87 = 0;
				}
				this.aBoolean63 = true;
				this.anInt249 = 0;
				this.anInt250 = local69;
				this.anInt251 = local87;
				this.anInt252 = local13;
				this.anInt253 = this.anInt299 * 15 + 22;
			}
			if (super.anInt236 > 553 && super.anInt237 > 205 && super.anInt236 < 743 && super.anInt237 < 466) {
				local69 = super.anInt236 - local13 / 2 - 553;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 + local13 > 190) {
					local69 = 190 - local13;
				}
				local87 = super.anInt237 - 205;
				if (local87 < 0) {
					local87 = 0;
				} else if (local87 + local26 > 261) {
					local87 = 261 - local26;
				}
				this.aBoolean63 = true;
				this.anInt249 = 1;
				this.anInt250 = local69;
				this.anInt251 = local87;
				this.anInt252 = local13;
				this.anInt253 = this.anInt299 * 15 + 22;
			}
			if (super.anInt236 > 17 && super.anInt237 > 357 && super.anInt236 < 496 && super.anInt237 < 453) {
				local69 = super.anInt236 - local13 / 2 - 17;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 + local13 > 479) {
					local69 = 479 - local13;
				}
				local87 = super.anInt237 - 357;
				if (local87 < 0) {
					local87 = 0;
				} else if (local87 + local26 > 96) {
					local87 = 96 - local26;
				}
				this.aBoolean63 = true;
				this.anInt249 = 2;
				this.anInt250 = local69;
				this.anInt251 = local87;
				this.anInt252 = local13;
				this.anInt253 = this.anInt299 * 15 + 22;
			}
		} catch (@Pc(291) RuntimeException local291) {
			signlink.reporterror("69075, " + -2068 + ", " + local291.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
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
			this.method120();
			if (this.aClass11_1 != null) {
				this.aClass11_1.aBoolean135 = false;
			}
			this.aClass11_1 = null;
			this.aClass45_Sub1_1.method649();
			this.aClass45_Sub1_1 = null;
			this.aClass1_Sub1_Sub3_4 = null;
			this.aClass1_Sub1_Sub3_2 = null;
			this.aClass1_Sub1_Sub3_3 = null;
			this.anIntArray77 = null;
			this.aByteArrayArray2 = null;
			this.aByteArrayArray1 = null;
			this.anIntArray78 = null;
			this.anIntArray79 = null;
			this.anIntArrayArrayArray3 = null;
			this.aByteArrayArrayArray7 = null;
			this.aClass39_1 = null;
			this.aClass19Array1 = null;
			this.anIntArrayArray3 = null;
			this.anIntArrayArray2 = null;
			this.anIntArray82 = null;
			this.anIntArray83 = null;
			this.aByteArray2 = null;
			this.aClass37_3 = null;
			this.aClass37_4 = null;
			this.aClass37_5 = null;
			this.aClass37_6 = null;
			this.aClass37_7 = null;
			this.aClass37_8 = null;
			this.aClass37_9 = null;
			this.aClass37_19 = null;
			this.aClass37_20 = null;
			this.aClass37_21 = null;
			this.aClass37_22 = null;
			this.aClass37_23 = null;
			this.aClass37_24 = null;
			this.aClass37_25 = null;
			this.aClass37_26 = null;
			this.aClass37_27 = null;
			this.aClass1_Sub1_Sub2_Sub3_9 = null;
			this.aClass1_Sub1_Sub2_Sub3_10 = null;
			this.aClass1_Sub1_Sub2_Sub3_11 = null;
			this.aClass1_Sub1_Sub2_Sub3_6 = null;
			this.aClass1_Sub1_Sub2_Sub3_7 = null;
			this.aClass1_Sub1_Sub2_Sub3_8 = null;
			this.aClass1_Sub1_Sub2_Sub3Array1 = null;
			this.aClass1_Sub1_Sub2_Sub3_16 = null;
			this.aClass1_Sub1_Sub2_Sub3_17 = null;
			this.aClass1_Sub1_Sub2_Sub3_18 = null;
			this.aClass1_Sub1_Sub2_Sub3_19 = null;
			this.aClass1_Sub1_Sub2_Sub3_20 = null;
			this.aClass1_Sub1_Sub2_Sub3_1 = null;
			this.aClass1_Sub1_Sub2_Sub3_2 = null;
			this.aClass1_Sub1_Sub2_Sub3_3 = null;
			this.aClass1_Sub1_Sub2_Sub3_4 = null;
			this.aClass1_Sub1_Sub2_Sub3_5 = null;
			this.aClass1_Sub1_Sub2_Sub2_3 = null;
			this.aClass1_Sub1_Sub2_Sub2Array4 = null;
			this.aClass1_Sub1_Sub2_Sub2Array5 = null;
			this.aClass1_Sub1_Sub2_Sub2Array7 = null;
			this.aClass1_Sub1_Sub2_Sub2_9 = null;
			this.aClass1_Sub1_Sub2_Sub2_10 = null;
			this.aClass1_Sub1_Sub2_Sub2_11 = null;
			this.aClass1_Sub1_Sub2_Sub2_12 = null;
			this.aClass1_Sub1_Sub2_Sub3Array2 = null;
			this.aClass1_Sub1_Sub2_Sub2Array6 = null;
			this.anIntArrayArray5 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub2Array1 = null;
			this.anIntArray62 = null;
			this.anIntArray63 = null;
			this.aClass1_Sub1_Sub3Array1 = null;
			this.anIntArray67 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub1Array1 = null;
			this.anIntArray42 = null;
			this.aClass31ArrayArrayArray1 = null;
			this.aClass31_3 = null;
			this.aClass31_2 = null;
			this.aClass31_1 = null;
			this.anIntArray35 = null;
			this.anIntArray36 = null;
			this.anIntArray37 = null;
			this.anIntArray38 = null;
			this.aStringArray4 = null;
			this.anIntArray41 = null;
			this.anIntArray39 = null;
			this.anIntArray40 = null;
			this.aClass1_Sub1_Sub2_Sub2Array3 = null;
			this.aClass1_Sub1_Sub2_Sub2_4 = null;
			this.aStringArray3 = null;
			this.aLongArray4 = null;
			this.anIntArray84 = null;
			this.aClass37_13 = null;
			this.aClass37_14 = null;
			this.aClass37_10 = null;
			this.aClass37_11 = null;
			this.aClass37_12 = null;
			this.aClass37_15 = null;
			this.aClass37_16 = null;
			this.aClass37_17 = null;
			this.aClass37_18 = null;
			this.method212();
			Class9.method257(927);
			Class13.method319();
			Class15.method344(927);
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
			Class1_Sub1_Sub2_Sub1.method370(927);
			Class39.method543(927);
			Class1_Sub1_Sub1_Sub5.method284();
			Class14.method326(927);
			System.gc();
		} catch (@Pc(368) RuntimeException local368) {
			signlink.reporterror("71804, " + false + ", " + local368.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method161(@OriginalArg(0) int arg0) {
		try {
			if (!aBoolean48) {
				@Pc(16) Class1_Sub1_Sub2_Sub3 local16;
				@Pc(24) int local24;
				@Pc(32) int local32;
				@Pc(35) byte[] local35;
				@Pc(38) byte[] local38;
				@Pc(40) int local40;
				if (Class1_Sub1_Sub2_Sub1.anIntArray187[17] >= arg0) {
					local16 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[17];
					local24 = local16.anInt715 * local16.anInt716 - 1;
					local32 = local16.anInt715 * this.anInt372 * 2;
					local35 = local16.aByteArray7;
					local38 = this.aByteArray2;
					for (local40 = 0; local40 <= local24; local40++) {
						local38[local40] = local35[local40 - local32 & local24];
					}
					local16.aByteArray7 = local38;
					this.aByteArray2 = local35;
					Class1_Sub1_Sub2_Sub1.method377(17);
				}
				if (Class1_Sub1_Sub2_Sub1.anIntArray187[24] >= arg0) {
					local16 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[24];
					local24 = local16.anInt715 * local16.anInt716 - 1;
					local32 = local16.anInt715 * this.anInt372 * 2;
					local35 = local16.aByteArray7;
					local38 = this.aByteArray2;
					for (local40 = 0; local40 <= local24; local40++) {
						local38[local40] = local35[local40 - local32 & local24];
					}
					local16.aByteArray7 = local38;
					this.aByteArray2 = local35;
					Class1_Sub1_Sub2_Sub1.method377(24);
					return;
				}
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("12255, " + arg0 + ", " + -40822 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method162(@OriginalArg(0) int arg0) {
		try {
			@Pc(6) int local6 = this.anInt293 * 128 + 64;
			@Pc(13) int local13 = this.anInt294 * 128 + 64;
			@Pc(24) int local24 = this.method137(local13, this.anInt278, local6) - this.anInt295;
			if (this.anInt271 < local6) {
				this.anInt271 += this.anInt296 + (local6 - this.anInt271) * this.anInt297 / 1000;
				if (this.anInt271 > local6) {
					this.anInt271 = local6;
				}
			}
			if (this.anInt271 > local6) {
				this.anInt271 -= this.anInt296 + (this.anInt271 - local6) * this.anInt297 / 1000;
				if (this.anInt271 < local6) {
					this.anInt271 = local6;
				}
			}
			if (this.anInt272 < local24) {
				this.anInt272 += this.anInt296 + (local24 - this.anInt272) * this.anInt297 / 1000;
				if (this.anInt272 > local24) {
					this.anInt272 = local24;
				}
			}
			if (this.anInt272 > local24) {
				this.anInt272 -= this.anInt296 + (this.anInt272 - local24) * this.anInt297 / 1000;
				if (this.anInt272 < local24) {
					this.anInt272 = local24;
				}
			}
			if (this.anInt273 < local13) {
				this.anInt273 += this.anInt296 + (local13 - this.anInt273) * this.anInt297 / 1000;
				if (this.anInt273 > local13) {
					this.anInt273 = local13;
				}
			}
			if (this.anInt273 > local13) {
				this.anInt273 -= this.anInt296 + (this.anInt273 - local13) * this.anInt297 / 1000;
				if (this.anInt273 < local13) {
					this.anInt273 = local13;
				}
			}
			local6 = this.anInt416 * 128 + 64;
			local13 = this.anInt417 * 128 + 64;
			local24 = this.method137(local13, this.anInt278, local6) - this.anInt418;
			if (arg0 == -21513) {
				@Pc(226) int local226 = local6 - this.anInt271;
				@Pc(231) int local231 = local24 - this.anInt272;
				@Pc(236) int local236 = local13 - this.anInt273;
				@Pc(247) int local247 = (int) Math.sqrt((double) (local226 * local226 + local236 * local236));
				@Pc(258) int local258 = (int) (Math.atan2((double) local231, (double) local247) * 325.949D) & 0x7FF;
				@Pc(269) int local269 = (int) (Math.atan2((double) local226, (double) local236) * -325.949D) & 0x7FF;
				if (local258 < 128) {
					local258 = 128;
				}
				if (local258 > 383) {
					local258 = 383;
				}
				if (this.anInt274 < local258) {
					this.anInt274 += this.anInt419 + (local258 - this.anInt274) * this.anInt420 / 1000;
					if (this.anInt274 > local258) {
						this.anInt274 = local258;
					}
				}
				if (this.anInt274 > local258) {
					this.anInt274 -= this.anInt419 + (this.anInt274 - local258) * this.anInt420 / 1000;
					if (this.anInt274 < local258) {
						this.anInt274 = local258;
					}
				}
				@Pc(340) int local340 = local269 - this.anInt275;
				if (local340 > 1024) {
					local340 -= 2048;
				}
				if (local340 < -1024) {
					local340 += 2048;
				}
				if (local340 > 0) {
					this.anInt275 += this.anInt419 + local340 * this.anInt420 / 1000;
					this.anInt275 &= 0x7FF;
				}
				if (local340 < 0) {
					this.anInt275 -= this.anInt419 + -local340 * this.anInt420 / 1000;
					this.anInt275 &= 0x7FF;
				}
				@Pc(398) int local398 = local269 - this.anInt275;
				if (local398 > 1024) {
					local398 -= 2048;
				}
				if (local398 < -1024) {
					local398 += 2048;
				}
				if (local398 < 0 && local340 > 0 || local398 > 0 && local340 < 0) {
					this.anInt275 = local269;
				}
			}
		} catch (@Pc(419) RuntimeException local419) {
			signlink.reporterror("16134, " + arg0 + ", " + local419.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method163() {
		try {
			if (this.anInt242 == 0 && this.anInt336 == 0) {
				this.aStringArray4[this.anInt299] = "Walk here";
				this.anIntArray37[this.anInt299] = 718;
				this.anIntArray35[this.anInt299] = super.anInt230;
				this.anIntArray36[this.anInt299] = super.anInt231;
				this.anInt299++;
			}
			@Pc(41) int local41 = -1;
			for (@Pc(51) int local51 = 0; local51 < Class1_Sub1_Sub1_Sub5.anInt561; local51++) {
				@Pc(57) int local57 = Class1_Sub1_Sub1_Sub5.anIntArray157[local51];
				@Pc(61) int local61 = local57 & 0x7F;
				@Pc(67) int local67 = local57 >> 7 & 0x7F;
				@Pc(73) int local73 = local57 >> 29 & 0x3;
				@Pc(79) int local79 = local57 >> 14 & 0x7FFF;
				if (local57 != local41) {
					local41 = local57;
					@Pc(217) int local217;
					if (local73 == 2 && this.aClass39_1.method574(this.anInt278, local61, local67, local57) >= 0) {
						@Pc(99) Class9 local99 = Class9.method258(local79);
						if (this.anInt242 == 1) {
							this.aStringArray4[this.anInt299] = "Use " + this.aString5 + " with @cya@" + local99.aString24;
							this.anIntArray37[this.anInt299] = 810;
							this.anIntArray38[this.anInt299] = local57;
							this.anIntArray35[this.anInt299] = local61;
							this.anIntArray36[this.anInt299] = local67;
							this.anInt299++;
						} else if (this.anInt336 != 1) {
							if (local99.aStringArray8 != null) {
								for (local217 = 4; local217 >= 0; local217--) {
									if (local99.aStringArray8[local217] != null) {
										this.aStringArray4[this.anInt299] = local99.aStringArray8[local217] + " @cya@" + local99.aString24;
										if (local217 == 0) {
											this.anIntArray37[this.anInt299] = 625;
										}
										if (local217 == 1) {
											this.anIntArray37[this.anInt299] = 721;
										}
										if (local217 == 2) {
											this.anIntArray37[this.anInt299] = 743;
										}
										if (local217 == 3) {
											this.anIntArray37[this.anInt299] = 357;
										}
										if (local217 == 4) {
											this.anIntArray37[this.anInt299] = 1071;
										}
										this.anIntArray38[this.anInt299] = local57;
										this.anIntArray35[this.anInt299] = local61;
										this.anIntArray36[this.anInt299] = local67;
										this.anInt299++;
									}
								}
							}
							this.aStringArray4[this.anInt299] = "Examine @cya@" + local99.aString24;
							this.anIntArray37[this.anInt299] = 1381;
							this.anIntArray38[this.anInt299] = local57;
							this.anIntArray35[this.anInt299] = local61;
							this.anIntArray36[this.anInt299] = local67;
							this.anInt299++;
						} else if ((this.anInt338 & 0x4) == 4) {
							this.aStringArray4[this.anInt299] = this.aString7 + " @cya@" + local99.aString24;
							this.anIntArray37[this.anInt299] = 899;
							this.anIntArray38[this.anInt299] = local57;
							this.anIntArray35[this.anInt299] = local61;
							this.anIntArray36[this.anInt299] = local67;
							this.anInt299++;
						}
					}
					@Pc(394) Class1_Sub1_Sub1_Sub1_Sub1 local394;
					if (local73 == 1) {
						@Pc(365) Class1_Sub1_Sub1_Sub1_Sub1 local365 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local79];
						if (local365.aClass13_1.aByte25 == 1 && (local365.anInt127 & 0x7F) == 64 && (local365.anInt128 & 0x7F) == 64) {
							for (local217 = 0; local217 < this.anInt254; local217++) {
								local394 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray42[local217]];
								if (local394 != null && local394 != local365 && local394.aClass13_1.aByte25 == 1 && local394.anInt127 == local365.anInt127 && local394.anInt128 == local365.anInt128) {
									this.method150(local61, local394.aClass13_1, this.anIntArray42[local217], local67);
								}
							}
						}
						this.method150(local61, local365.aClass13_1, local79, local67);
					}
					if (local73 == 0) {
						@Pc(445) Class1_Sub1_Sub1_Sub1_Sub2 local445 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local79];
						if ((local445.anInt127 & 0x7F) == 64 && (local445.anInt128 & 0x7F) == 64) {
							for (local217 = 0; local217 < this.anInt254; local217++) {
								local394 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray42[local217]];
								if (local394 != null && local394.aClass13_1.aByte25 == 1 && local394.anInt127 == local445.anInt127 && local394.anInt128 == local445.anInt128) {
									this.method150(local61, local394.aClass13_1, this.anIntArray42[local217], local67);
								}
							}
							for (@Pc(504) int local504 = 0; local504 < this.anInt333; local504++) {
								@Pc(514) Class1_Sub1_Sub1_Sub1_Sub2 local514 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray62[local504]];
								if (local514 != null && local514 != local445 && local514.anInt127 == local445.anInt127 && local514.anInt128 == local445.anInt128) {
									this.method106(local67, this.anIntArray62[local504], local61, local514);
								}
							}
						}
						this.method106(local67, local79, local61, local445);
					}
					if (local73 == 3) {
						@Pc(564) Class31 local564 = this.aClass31ArrayArrayArray1[this.anInt278][local61][local67];
						if (local564 != null) {
							for (@Pc(571) Class1_Sub1_Sub1_Sub3 local571 = (Class1_Sub1_Sub1_Sub3) local564.method524(); local571 != null; local571 = (Class1_Sub1_Sub1_Sub3) local564.method526()) {
								@Pc(577) Class15 local577 = Class15.method345(local571.anInt487);
								if (this.anInt242 == 1) {
									this.aStringArray4[this.anInt299] = "Use " + this.aString5 + " with @lre@" + local577.aString26;
									this.anIntArray37[this.anInt299] = 111;
									this.anIntArray38[this.anInt299] = local571.anInt487;
									this.anIntArray35[this.anInt299] = local61;
									this.anIntArray36[this.anInt299] = local67;
									this.anInt299++;
								} else if (this.anInt336 != 1) {
									for (@Pc(694) int local694 = 4; local694 >= 0; local694--) {
										if (local577.aStringArray10 != null && local577.aStringArray10[local694] != null) {
											this.aStringArray4[this.anInt299] = local577.aStringArray10[local694] + " @lre@" + local577.aString26;
											if (local694 == 0) {
												this.anIntArray37[this.anInt299] = 139;
											}
											if (local694 == 1) {
												this.anIntArray37[this.anInt299] = 778;
											}
											if (local694 == 2) {
												this.anIntArray37[this.anInt299] = 617;
											}
											if (local694 == 3) {
												this.anIntArray37[this.anInt299] = 224;
											}
											if (local694 == 4) {
												this.anIntArray37[this.anInt299] = 662;
											}
											this.anIntArray38[this.anInt299] = local571.anInt487;
											this.anIntArray35[this.anInt299] = local61;
											this.anIntArray36[this.anInt299] = local67;
											this.anInt299++;
										} else if (local694 == 2) {
											this.aStringArray4[this.anInt299] = "Take @lre@" + local577.aString26;
											this.anIntArray37[this.anInt299] = 617;
											this.anIntArray38[this.anInt299] = local571.anInt487;
											this.anIntArray35[this.anInt299] = local61;
											this.anIntArray36[this.anInt299] = local67;
											this.anInt299++;
										}
									}
									this.aStringArray4[this.anInt299] = "Examine @lre@" + local577.aString26;
									this.anIntArray37[this.anInt299] = 1152;
									this.anIntArray38[this.anInt299] = local571.anInt487;
									this.anIntArray35[this.anInt299] = local61;
									this.anIntArray36[this.anInt299] = local67;
									this.anInt299++;
								} else if ((this.anInt338 & 0x1) == 1) {
									this.aStringArray4[this.anInt299] = this.aString7 + " @lre@" + local577.aString26;
									this.anIntArray37[this.anInt299] = 370;
									this.anIntArray38[this.anInt299] = local571.anInt487;
									this.anIntArray35[this.anInt299] = local61;
									this.anIntArray36[this.anInt299] = local67;
									this.anInt299++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(901) RuntimeException local901) {
			signlink.reporterror("35586, " + 1 + ", " + local901.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!mb;I)V")
	private void method164(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt334; local1++) {
				@Pc(8) int local8 = this.anIntArray63[local1];
				@Pc(13) Class1_Sub1_Sub1_Sub1_Sub2 local13 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local8];
				@Pc(16) int local16 = arg0.method498();
				if ((local16 & 0x80) == 128) {
					local16 += arg0.method498() << 8;
				}
				this.method184(local16, arg0, local8, local13);
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("48612, " + true + ", " + arg0 + ", " + arg1 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method165(@OriginalArg(0) String arg0) throws IOException {
		return signlink.mainapp == null ? new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream()) : signlink.openurl(arg0);
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method166(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			if (this.anInt368 == 2) {
				this.method154((this.anInt375 - this.anInt382 << 7) + this.anInt378, (this.anInt374 - this.anInt381 << 7) + this.anInt377, this.anInt376 * 2);
				if (this.anInt288 > -1 && anInt426 % 20 < 10) {
					this.aClass1_Sub1_Sub2_Sub2Array5[2].method406(this.anInt288 - 12, this.anInt289 - 28);
				}
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("25820, " + arg0 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;Z)V")
	private void method167(@OriginalArg(0) Class6 arg0, @OriginalArg(1) boolean arg1) {
		try {
			@Pc(4) int local4 = arg0.anInt460;
			this.aBoolean46 &= arg1;
			@Pc(66) int local66;
			if ((local4 < 1 || local4 > 100) && (local4 < 701 || local4 > 800)) {
				if (local4 >= 101 && local4 <= 200 || local4 >= 801 && local4 <= 900) {
					local66 = this.anInt439;
					if (this.anInt440 != 2) {
						local66 = 0;
					}
					if (local4 > 800) {
						local4 -= 701;
					} else {
						local4 -= 101;
					}
					if (local4 >= local66) {
						arg0.aString19 = "";
						arg0.anInt459 = 0;
					} else {
						if (this.anIntArray84[local4] == 0) {
							arg0.aString19 = "@red@Offline";
						} else if (this.anIntArray84[local4] == anInt261) {
							arg0.aString19 = "@gre@World-" + (this.anIntArray84[local4] - 9);
						} else {
							arg0.aString19 = "@yel@World-" + (this.anIntArray84[local4] - 9);
						}
						arg0.anInt459 = 1;
					}
				} else if (local4 == 203) {
					local66 = this.anInt439;
					if (this.anInt440 != 2) {
						local66 = 0;
					}
					arg0.anInt466 = local66 * 15 + 20;
					if (arg0.anInt466 <= arg0.anInt462) {
						arg0.anInt466 = arg0.anInt462 + 1;
					}
				} else if (local4 >= 401 && local4 <= 500) {
					local4 -= 401;
					if (local4 >= this.anInt451) {
						arg0.aString19 = "";
						arg0.anInt459 = 0;
					} else {
						arg0.aString19 = Class49.method683(Class49.method680(this.aLongArray3[local4]));
						arg0.anInt459 = 1;
					}
				} else if (local4 == 503) {
					arg0.anInt466 = this.anInt451 * 15 + 20;
					if (arg0.anInt466 <= arg0.anInt462) {
						arg0.anInt466 = arg0.anInt462 + 1;
					}
				} else if (local4 == 327) {
					arg0.anInt482 = 150;
					arg0.anInt483 = (int) (Math.sin((double) anInt426 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean73) {
						for (local66 = 0; local66 < 7; local66++) {
							@Pc(303) int local303 = this.anIntArray53[local66];
							if (local303 >= 0 && !Class23.aClass23Array1[local303].method479()) {
								return;
							}
						}
						this.aBoolean73 = false;
						@Pc(322) Class1_Sub1_Sub1_Sub5[] local322 = new Class1_Sub1_Sub1_Sub5[7];
						@Pc(324) int local324 = 0;
						for (@Pc(326) int local326 = 0; local326 < 7; local326++) {
							@Pc(333) int local333 = this.anIntArray53[local326];
							if (local333 >= 0) {
								local322[local324++] = Class23.aClass23Array1[local333].method480();
							}
						}
						@Pc(355) Class1_Sub1_Sub1_Sub5 local355 = new Class1_Sub1_Sub1_Sub5(local322, local324, -928);
						for (@Pc(357) int local357 = 0; local357 < 5; local357++) {
							if (this.anIntArray80[local357] != 0) {
								local355.method302(anIntArrayArray4[local357][0], anIntArrayArray4[local357][this.anIntArray80[local357]]);
								if (local357 == 1) {
									local355.method302(anIntArray49[0], anIntArray49[this.anIntArray80[local357]]);
								}
							}
						}
						local355.method295();
						local355.method296(Class27.aClass27Array1[aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt131].anIntArray227[0]);
						local355.method305(64, 850, -30, -50, -30, true);
						arg0.anInt475 = 5;
						arg0.anInt476 = 0;
						Class6.method234(this.aBoolean54, local355);
					}
				} else if (local4 == 324) {
					if (this.aClass1_Sub1_Sub2_Sub2_1 == null) {
						this.aClass1_Sub1_Sub2_Sub2_1 = arg0.aClass1_Sub1_Sub2_Sub2_14;
						this.aClass1_Sub1_Sub2_Sub2_2 = arg0.aClass1_Sub1_Sub2_Sub2_15;
					}
					if (this.aBoolean77) {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_2;
					} else {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_1;
					}
				} else if (local4 == 325) {
					if (this.aClass1_Sub1_Sub2_Sub2_1 == null) {
						this.aClass1_Sub1_Sub2_Sub2_1 = arg0.aClass1_Sub1_Sub2_Sub2_14;
						this.aClass1_Sub1_Sub2_Sub2_2 = arg0.aClass1_Sub1_Sub2_Sub2_15;
					}
					if (this.aBoolean77) {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_1;
					} else {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_2;
					}
				} else if (local4 == 600) {
					arg0.aString19 = this.aString12;
					if (anInt426 % 20 < 10) {
						arg0.aString19 = arg0.aString19 + "|";
					} else {
						arg0.aString19 = arg0.aString19 + " ";
					}
				} else {
					if (local4 == 613) {
						if (this.anInt394 < 1) {
							arg0.aString19 = "";
						} else if (this.aBoolean86) {
							arg0.anInt471 = 16711680;
							arg0.aString19 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt471 = 16777215;
							arg0.aString19 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(564) String local564;
					if (local4 == 650 || local4 == 655) {
						if (this.anInt292 == 0) {
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
						if (this.anInt306 == 0) {
							arg0.aString19 = "0 unread messages";
							arg0.anInt471 = 16776960;
						}
						if (this.anInt306 == 1) {
							arg0.aString19 = "1 unread message";
							arg0.anInt471 = 65280;
						}
						if (this.anInt306 > 1) {
							arg0.aString19 = this.anInt306 + " unread messages";
							arg0.anInt471 = 65280;
						}
					}
					if (local4 == 652) {
						if (this.anInt446 == 201) {
							if (this.anInt402 == 1) {
								arg0.aString19 = "@yel@This is a non-members world: @whi@Since you are a member we";
							} else {
								arg0.aString19 = "";
							}
						} else if (this.anInt446 == 200) {
							arg0.aString19 = "You have not yet set any password recovery questions.";
						} else {
							if (this.anInt446 == 0) {
								local564 = "Earlier today";
							} else if (this.anInt446 == 1) {
								local564 = "Yesterday";
							} else {
								local564 = this.anInt446 + " days ago";
							}
							arg0.aString19 = local564 + " you changed your recovery questions";
						}
					}
					if (local4 == 653) {
						if (this.anInt446 == 201) {
							if (this.anInt402 == 1) {
								arg0.aString19 = "@whi@recommend you use a members world instead. You may use";
							} else {
								arg0.aString19 = "";
							}
						} else if (this.anInt446 == 200) {
							arg0.aString19 = "We strongly recommend you do so now to secure your account.";
						} else {
							arg0.aString19 = "If you do not remember making this change then cancel it immediately";
						}
					}
					if (local4 == 654) {
						if (this.anInt446 == 201) {
							if (this.anInt402 == 1) {
								arg0.aString19 = "@whi@this world but member benefits are unavailabe whilst here.";
							} else {
								arg0.aString19 = "";
							}
						} else if (this.anInt446 == 200) {
							arg0.aString19 = "Do this from the 'account management' area on our front webpage";
						} else {
							arg0.aString19 = "Do this from the 'account management' area on our front webpage";
						}
					}
				}
			} else if (local4 == 1 && this.anInt440 == 0) {
				arg0.aString19 = "Loading friend list";
				arg0.anInt459 = 0;
			} else if (local4 == 1 && this.anInt440 == 1) {
				arg0.aString19 = "Connecting to friendserver";
				arg0.anInt459 = 0;
			} else if (local4 == 2 && this.anInt440 != 2) {
				arg0.aString19 = "Please wait...";
				arg0.anInt459 = 0;
			} else {
				local66 = this.anInt439;
				if (this.anInt440 != 2) {
					local66 = 0;
				}
				if (local4 > 700) {
					local4 -= 601;
				} else {
					local4--;
				}
				if (local4 >= local66) {
					arg0.aString19 = "";
					arg0.anInt459 = 0;
				} else {
					arg0.aString19 = this.aStringArray3[local4];
					arg0.anInt459 = 1;
				}
			}
		} catch (@Pc(772) RuntimeException local772) {
			signlink.reporterror("63407, " + arg0 + ", " + arg1 + ", " + local772.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!mb;I)V")
	private void method168(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 <= 0) {
				arg0 = arg1.method498();
			}
			@Pc(15) int local15;
			@Pc(24) int local24;
			@Pc(31) int local31;
			@Pc(34) int local34;
			@Pc(38) int local38;
			@Pc(42) int local42;
			@Pc(47) int local47;
			@Pc(52) int local52;
			if (arg0 == 70 || arg0 == 88) {
				local15 = arg1.method498();
				local24 = this.anInt436 + (local15 >> 4 & 0x7);
				local31 = this.anInt437 + (local15 & 0x7);
				local34 = arg1.method498();
				local38 = local34 >> 2;
				local42 = local34 & 0x3;
				local47 = this.anIntArray76[local38];
				if (arg0 == 88) {
					local52 = -1;
				} else {
					local52 = arg1.method500();
				}
				if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104) {
					this.method209(this.anInt278, local24, 0, (byte) 8, local52, local38, local47, -1, local31, local42);
				}
			} else {
				@Pc(142) int local142;
				@Pc(154) int local154;
				@Pc(168) int local168;
				@Pc(180) int local180;
				if (arg0 == 30) {
					local15 = arg1.method498();
					local24 = this.anInt436 + (local15 >> 4 & 0x7);
					local31 = this.anInt437 + (local15 & 0x7);
					local34 = arg1.method498();
					local38 = local34 >> 2;
					local42 = local34 & 0x3;
					local47 = this.anIntArray76[local38];
					local52 = arg1.method500();
					if (local24 >= 0 && local31 >= 0 && local24 < 103 && local31 < 103) {
						local142 = this.anIntArrayArrayArray3[this.anInt278][local24][local31];
						local154 = this.anIntArrayArrayArray3[this.anInt278][local24 + 1][local31];
						local168 = this.anIntArrayArrayArray3[this.anInt278][local24 + 1][local31 + 1];
						local180 = this.anIntArrayArrayArray3[this.anInt278][local24][local31 + 1];
						if (local47 == 0) {
							@Pc(191) Class36 local191 = this.aClass39_1.method566(this.anInt278, local24, local31);
							if (local191 != null) {
								@Pc(200) int local200 = local191.anInt872 >> 14 & 0x7FFF;
								if (local38 == 2) {
									local191.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(2, local42 + 4, local142, local200, 10550, local168, local180, false, local52, local154);
									local191.aClass1_Sub1_Sub1_8 = new Class1_Sub1_Sub1_Sub2(2, local42 + 1 & 0x3, local142, local200, 10550, local168, local180, false, local52, local154);
								} else {
									local191.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(local38, local42, local142, local200, 10550, local168, local180, false, local52, local154);
								}
							}
						}
						if (local47 == 1) {
							@Pc(268) Class16 local268 = this.aClass39_1.method567(local24, local31, this.anInt278);
							if (local268 != null) {
								local268.aClass1_Sub1_Sub1_1 = new Class1_Sub1_Sub1_Sub2(4, 0, local142, local268.anInt644 >> 14 & 0x7FFF, 10550, local168, local180, false, local52, local154);
							}
						}
						if (local47 == 2) {
							@Pc(302) Class33 local302 = this.aClass39_1.method568(local24, local31, this.anInt278);
							if (local38 == 11) {
								local38 = 10;
							}
							if (local302 != null) {
								local302.aClass1_Sub1_Sub1_6 = new Class1_Sub1_Sub1_Sub2(local38, local42, local142, local302.anInt862 >> 14 & 0x7FFF, 10550, local168, local180, false, local52, local154);
							}
						}
						if (local47 == 3) {
							@Pc(341) Class20 local341 = this.aClass39_1.method569(this.anInt278, local24, local31);
							if (local341 != null) {
								local341.aClass1_Sub1_Sub1_2 = new Class1_Sub1_Sub1_Sub2(22, local42, local142, local341.anInt701 >> 14 & 0x7FFF, 10550, local168, local180, false, local52, local154);
							}
						}
					}
				} else {
					@Pc(406) Class1_Sub1_Sub1_Sub3 local406;
					if (arg0 == 120) {
						local15 = arg1.method498();
						local24 = this.anInt436 + (local15 >> 4 & 0x7);
						local31 = this.anInt437 + (local15 & 0x7);
						local34 = arg1.method500();
						local38 = arg1.method500();
						if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104) {
							local406 = new Class1_Sub1_Sub1_Sub3();
							local406.anInt487 = local34;
							local406.anInt488 = local38;
							if (this.aClass31ArrayArrayArray1[this.anInt278][local24][local31] == null) {
								this.aClass31ArrayArrayArray1[this.anInt278][local24][local31] = new Class31(false);
							}
							this.aClass31ArrayArrayArray1[this.anInt278][local24][local31].method520(local406);
							this.method196(local24, local31);
						}
					} else if (arg0 == 115) {
						local15 = arg1.method498();
						local24 = this.anInt436 + (local15 >> 4 & 0x7);
						local31 = this.anInt437 + (local15 & 0x7);
						local34 = arg1.method500();
						if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104) {
							@Pc(496) Class31 local496 = this.aClass31ArrayArrayArray1[this.anInt278][local24][local31];
							if (local496 != null) {
								for (local406 = (Class1_Sub1_Sub1_Sub3) local496.method523(); local406 != null; local406 = (Class1_Sub1_Sub1_Sub3) local496.method525()) {
									if (local406.anInt487 == (local34 & 0x7FFF)) {
										local406.method669();
										break;
									}
								}
								if (local496.method523() == null) {
									this.aClass31ArrayArrayArray1[this.anInt278][local24][local31] = null;
								}
								this.method196(local24, local31);
							}
						}
					} else if (arg0 == 37) {
						local15 = arg1.method498();
						local24 = this.anInt436 + (local15 >> 4 & 0x7);
						local31 = this.anInt437 + (local15 & 0x7);
						local34 = local24 + arg1.method499();
						local38 = local31 + arg1.method499();
						local42 = arg1.method501();
						local47 = arg1.method500();
						local52 = arg1.method498() * 4;
						local142 = arg1.method498() * 4;
						local154 = arg1.method500();
						local168 = arg1.method500();
						local180 = arg1.method498();
						@Pc(599) int local599 = arg1.method498();
						if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104 && local34 >= 0 && local38 >= 0 && local34 < 104 && local38 < 104) {
							local24 = local24 * 128 + 64;
							local31 = local31 * 128 + 64;
							local34 = local34 * 128 + 64;
							local38 = local38 * 128 + 64;
							@Pc(672) Class1_Sub1_Sub1_Sub4 local672 = new Class1_Sub1_Sub1_Sub4(this.anInt278, local47, local154 + anInt426, local168 + anInt426, this.method137(local31, this.anInt278, local24) - local52, local142, local24, local180, local42, 0, local31, local599);
							local672.method254(local38, this.method137(local38, this.anInt278, local34) - local142, local34, local154 + anInt426);
							this.aClass31_2.method520(local672);
						}
					} else if (arg0 == 114) {
						local15 = arg1.method498();
						local24 = this.anInt436 + (local15 >> 4 & 0x7);
						local31 = this.anInt437 + (local15 & 0x7);
						local34 = arg1.method500();
						local38 = arg1.method498();
						local42 = arg1.method500();
						if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104) {
							local24 = local24 * 128 + 64;
							local31 = local31 * 128 + 64;
							@Pc(768) Class1_Sub1_Sub1_Sub6 local768 = new Class1_Sub1_Sub1_Sub6(this.method137(local31, this.anInt278, local24) - local38, anInt426, local31, this.anInt278, local24, local34, 169, local42);
							this.aClass31_1.method520(local768);
						}
					} else if (arg0 == 8) {
						local15 = arg1.method498();
						local24 = this.anInt436 + (local15 >> 4 & 0x7);
						local31 = this.anInt437 + (local15 & 0x7);
						local34 = arg1.method500();
						local38 = arg1.method500();
						local42 = arg1.method500();
						if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104 && local42 != this.anInt409) {
							@Pc(822) Class1_Sub1_Sub1_Sub3 local822 = new Class1_Sub1_Sub1_Sub3();
							local822.anInt487 = local34;
							local822.anInt488 = local38;
							if (this.aClass31ArrayArrayArray1[this.anInt278][local24][local31] == null) {
								this.aClass31ArrayArrayArray1[this.anInt278][local24][local31] = new Class31(false);
							}
							this.aClass31ArrayArrayArray1[this.anInt278][local24][local31].method520(local822);
							this.method196(local24, local31);
						}
					} else {
						if (arg0 == 218) {
							local15 = arg1.method498();
							local24 = this.anInt436 + (local15 >> 4 & 0x7);
							local31 = this.anInt437 + (local15 & 0x7);
							local34 = arg1.method498();
							local38 = local34 >> 2;
							local42 = local34 & 0x3;
							local47 = this.anIntArray76[local38];
							local52 = arg1.method500();
							local142 = arg1.method500();
							local154 = arg1.method500();
							local168 = arg1.method500();
							@Pc(920) byte local920 = arg1.method499();
							@Pc(923) byte local923 = arg1.method499();
							@Pc(926) byte local926 = arg1.method499();
							@Pc(929) byte local929 = arg1.method499();
							@Pc(935) Class1_Sub1_Sub1_Sub1_Sub2 local935;
							if (local168 == this.anInt409) {
								local935 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
							} else {
								local935 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local168];
							}
							if (local935 != null) {
								@Pc(947) Class9 local947 = Class9.method258(local52);
								@Pc(957) int local957 = this.anIntArrayArrayArray3[this.anInt278][local24][local31];
								@Pc(969) int local969 = this.anIntArrayArrayArray3[this.anInt278][local24 + 1][local31];
								@Pc(983) int local983 = this.anIntArrayArrayArray3[this.anInt278][local24 + 1][local31 + 1];
								@Pc(995) int local995 = this.anIntArrayArrayArray3[this.anInt278][local24][local31 + 1];
								@Pc(1005) Class1_Sub1_Sub1_Sub5 local1005 = local947.method264(local38, local42, local957, local969, local983, local995, -1);
								if (local1005 != null) {
									this.method209(this.anInt278, local24, local142 + 1, (byte) 8, -1, 0, local47, local154 + 1, local31, 0);
									local935.anInt178 = local142 + anInt426;
									local935.anInt179 = local154 + anInt426;
									local935.aClass1_Sub1_Sub1_Sub5_1 = local1005;
									@Pc(1040) int local1040 = local947.anInt519;
									@Pc(1043) int local1043 = local947.anInt520;
									if (local42 == 1 || local42 == 3) {
										local1040 = local947.anInt520;
										local1043 = local947.anInt519;
									}
									local935.anInt180 = local24 * 128 + local1040 * 64;
									local935.anInt182 = local31 * 128 + local1043 * 64;
									local935.anInt181 = this.method137(local935.anInt182, this.anInt278, local935.anInt180);
									@Pc(1089) byte local1089;
									if (local920 > local926) {
										local1089 = local920;
										local920 = local926;
										local926 = local1089;
									}
									if (local923 > local929) {
										local1089 = local923;
										local923 = local929;
										local929 = local1089;
									}
									local935.anInt183 = local24 + local920;
									local935.anInt185 = local24 + local926;
									local935.anInt184 = local31 + local923;
									local935.anInt186 = local31 + local929;
								}
							}
						}
						if (arg0 == 98) {
							local15 = arg1.method498();
							local24 = this.anInt436 + (local15 >> 4 & 0x7);
							local31 = this.anInt437 + (local15 & 0x7);
							local34 = arg1.method500();
							local38 = arg1.method500();
							local42 = arg1.method500();
							if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104) {
								@Pc(1173) Class31 local1173 = this.aClass31ArrayArrayArray1[this.anInt278][local24][local31];
								if (local1173 != null) {
									for (@Pc(1179) Class1_Sub1_Sub1_Sub3 local1179 = (Class1_Sub1_Sub1_Sub3) local1173.method523(); local1179 != null; local1179 = (Class1_Sub1_Sub1_Sub3) local1173.method525()) {
										if (local1179.anInt487 == (local34 & 0x7FFF) && local1179.anInt488 == local38) {
											local1179.anInt488 = local42;
											break;
										}
									}
									this.method196(local24, local31);
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1209) RuntimeException local1209) {
			signlink.reporterror("12053, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local1209.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method169(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			if (super.anInt235 == 1) {
				@Pc(25) int local25 = super.anInt236 - 25 - 550;
				@Pc(32) int local32 = super.anInt237 - 5 - 4;
				if (local25 >= 0 && local32 >= 0 && local25 < 146 && local32 < 151) {
					local25 -= 73;
					local32 -= 75;
					@Pc(52) int local52 = this.anInt267 + this.anInt279 & 0x7FF;
					@Pc(56) int local56 = Class1_Sub1_Sub2_Sub1.anIntArray183[local52];
					@Pc(60) int local60 = Class1_Sub1_Sub2_Sub1.anIntArray184[local52];
					@Pc(69) int local69 = local56 * (this.anInt315 + 256) >> 8;
					@Pc(78) int local78 = local60 * (this.anInt315 + 256) >> 8;
					@Pc(88) int local88 = local32 * local69 + local25 * local78 >> 11;
					@Pc(98) int local98 = local32 * local78 - local25 * local69 >> 11;
					@Pc(105) int local105 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt127 + local88 >> 7;
					@Pc(112) int local112 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 - local98 >> 7;
					@Pc(133) boolean local133 = this.method155(0, 0, 0, local105, 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], local112, true, 0, 0);
					if (local133) {
						this.aClass1_Sub1_Sub3_4.method488(local25);
						this.aClass1_Sub1_Sub3_4.method488(local32);
						this.aClass1_Sub1_Sub3_4.method489(this.anInt267);
						this.aClass1_Sub1_Sub3_4.method488(57);
						this.aClass1_Sub1_Sub3_4.method488(this.anInt279);
						this.aClass1_Sub1_Sub3_4.method488(this.anInt315);
						this.aClass1_Sub1_Sub3_4.method488(89);
						this.aClass1_Sub1_Sub3_4.method489(aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt127);
						this.aClass1_Sub1_Sub3_4.method489(aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128);
						this.aClass1_Sub1_Sub3_4.method488(this.anInt285);
						this.aClass1_Sub1_Sub3_4.method488(63);
						return;
					}
				}
			}
		} catch (@Pc(187) RuntimeException local187) {
			signlink.reporterror("91885, " + arg0 + ", " + local187.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!mb;I)V")
	private void method170(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt364 = 0;
			this.anInt334 = 0;
			this.method157(arg0, arg1);
			this.method159(arg0, arg1);
			this.method143(arg1, this.aByte15, arg0);
			@Pc(32) int local32;
			for (@Pc(25) int local25 = 0; local25 < this.anInt364; local25++) {
				local32 = this.anIntArray67[local25];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local32].anInt167 != anInt426) {
					this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local32].aClass13_1 = null;
					this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local32] = null;
				}
			}
			if (arg0.anInt777 != arg1) {
				signlink.reporterror(this.aString10 + " size mismatch in getnpcpos - pos:" + arg0.anInt777 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local32 = 0; local32 < this.anInt254; local32++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray42[local32]] == null) {
					signlink.reporterror(this.aString10 + " null entry in npc list - pos:" + local32 + " size:" + this.anInt254);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("15904, " + 41268 + ", " + arg0 + ", " + arg1 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JB)V")
	private void method171(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt439 >= 100 && this.anInt385 != 1) {
					this.method182("", 0, this.anInt433, "Your friendlist is full. Max of 100 for free users, and 200 for members");
				} else if (this.anInt439 >= 200) {
					this.method182("", 0, this.anInt433, "Your friendlist is full. Max of 100 for free users, and 200 for members");
				} else {
					@Pc(40) String local40 = Class49.method683(Class49.method680(arg0));
					for (@Pc(42) int local42 = 0; local42 < this.anInt439; local42++) {
						if (this.aLongArray4[local42] == arg0) {
							this.method182("", 0, this.anInt433, local40 + " is already on your friend list");
							return;
						}
					}
					for (@Pc(73) int local73 = 0; local73 < this.anInt451; local73++) {
						if (this.aLongArray3[local73] == arg0) {
							this.method182("", 0, this.anInt433, "Please remove " + local40 + " from your ignore list first");
							return;
						}
					}
					if (!local40.equals(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4)) {
						this.aStringArray3[this.anInt439] = local40;
						this.aLongArray4[this.anInt439] = arg0;
						this.anIntArray84[this.anInt439] = 0;
						this.anInt439++;
						this.aBoolean44 = true;
						this.aClass1_Sub1_Sub3_4.method487(9);
						this.aClass1_Sub1_Sub3_4.method494(arg0);
					}
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("84040, " + arg0 + ", " + -71 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BII)Z")
	private boolean method172(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt349 += 0;
			return arg0 == null ? true : signlink.wavesave(arg0, arg1);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("87901, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method173() {
		try {
			for (@Pc(6) int local6 = 0; local6 < this.anInt254; local6++) {
				@Pc(13) int local13 = this.anIntArray42[local6];
				@Pc(18) Class1_Sub1_Sub1_Sub1_Sub1 local18 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local13];
				if (local18 != null) {
					this.method174(local18, local18.aClass13_1.aByte25);
				}
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("12530, " + -856 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!z;I)V")
	private void method174(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		try {
			if (arg0.anInt127 < 128 || arg0.anInt128 < 128 || arg0.anInt127 >= 13184 || arg0.anInt128 >= 13184) {
				arg0.anInt150 = -1;
				arg0.anInt155 = -1;
				arg0.anInt164 = 0;
				arg0.anInt165 = 0;
				arg0.anInt127 = arg0.anIntArray16[0] * 128 + arg0.anInt130 * 64;
				arg0.anInt128 = arg0.anIntArray17[0] * 128 + arg0.anInt130 * 64;
				arg0.method48();
			}
			if (arg0 == aClass1_Sub1_Sub1_Sub1_Sub2_1 && (arg0.anInt127 < 1536 || arg0.anInt128 < 1536 || arg0.anInt127 >= 11776 || arg0.anInt128 >= 11776)) {
				arg0.anInt150 = -1;
				arg0.anInt155 = -1;
				arg0.anInt164 = 0;
				arg0.anInt165 = 0;
				arg0.anInt127 = arg0.anIntArray16[0] * 128 + arg0.anInt130 * 64;
				arg0.anInt128 = arg0.anIntArray17[0] * 128 + arg0.anInt130 * 64;
				arg0.method48();
			}
			if (arg0.anInt164 > anInt426) {
				this.method175(arg0, (byte) 6);
			} else if (arg0.anInt165 >= anInt426) {
				this.method176(arg0);
			} else {
				this.method177(arg0);
			}
			this.method178(arg0);
			this.method179(arg0);
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("11549, " + 1 + ", " + arg0 + ", " + arg1 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!z;B)V")
	private void method175(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(4) boolean local4 = false;
			@Pc(13) int local13 = arg0.anInt164 - anInt426;
			@Pc(23) int local23 = arg0.anInt160 * 128 + arg0.anInt130 * 64;
			@Pc(33) int local33 = arg0.anInt162 * 128 + arg0.anInt130 * 64;
			arg0.anInt127 += (local23 - arg0.anInt127) / local13;
			arg0.anInt128 += (local33 - arg0.anInt128) / local13;
			arg0.anInt172 = 0;
			if (arg0.anInt166 == 0) {
				arg0.anInt169 = 1024;
			}
			if (arg0.anInt166 == 1) {
				arg0.anInt169 = 1536;
			}
			if (arg0.anInt166 == 2) {
				arg0.anInt169 = 0;
			}
			if (arg0.anInt166 == 3) {
				arg0.anInt169 = 512;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("7861, " + arg0 + ", " + arg1 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!z;)V")
	private void method176(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt165 == anInt426 || arg0.anInt150 == -1 || arg0.anInt153 != 0 || arg0.anInt152 + 1 > Class27.aClass27Array1[arg0.anInt150].method517(arg0.anInt151)) {
				@Pc(29) int local29 = arg0.anInt165 - arg0.anInt164;
				@Pc(34) int local34 = anInt426 - arg0.anInt164;
				@Pc(44) int local44 = arg0.anInt160 * 128 + arg0.anInt130 * 64;
				@Pc(54) int local54 = arg0.anInt162 * 128 + arg0.anInt130 * 64;
				@Pc(64) int local64 = arg0.anInt161 * 128 + arg0.anInt130 * 64;
				@Pc(74) int local74 = arg0.anInt163 * 128 + arg0.anInt130 * 64;
				arg0.anInt127 = (local44 * (local29 - local34) + local64 * local34) / local29;
				arg0.anInt128 = (local54 * (local29 - local34) + local74 * local34) / local29;
			}
			arg0.anInt172 = 0;
			if (arg0.anInt166 == 0) {
				arg0.anInt169 = 1024;
			}
			if (arg0.anInt166 == 1) {
				arg0.anInt169 = 1536;
			}
			if (arg0.anInt166 == 2) {
				arg0.anInt169 = 0;
			}
			if (arg0.anInt166 == 3) {
				arg0.anInt169 = 512;
			}
			arg0.anInt129 = arg0.anInt169;
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("12845, " + 5 + ", " + arg0 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!z;I)V")
	private void method177(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.anInt147 = arg0.anInt131;
			if (arg0.anInt171 == 0) {
				arg0.anInt172 = 0;
			} else {
				if (arg0.anInt150 != -1 && arg0.anInt153 == 0) {
					@Pc(34) Class27 local34 = Class27.aClass27Array1[arg0.anInt150];
					if (arg0.anInt173 > 0 && local34.anInt815 == 0) {
						arg0.anInt172++;
						return;
					}
					if (arg0.anInt173 <= 0 && local34.anInt816 == 0) {
						arg0.anInt172++;
						return;
					}
				}
				@Pc(63) int local63 = arg0.anInt127;
				@Pc(66) int local66 = arg0.anInt128;
				@Pc(81) int local81 = arg0.anIntArray16[arg0.anInt171 - 1] * 128 + arg0.anInt130 * 64;
				@Pc(96) int local96 = arg0.anIntArray17[arg0.anInt171 - 1] * 128 + arg0.anInt130 * 64;
				if (local81 - local63 <= 256 && local81 - local63 >= -256 && local96 - local66 <= 256 && local96 - local66 >= -256) {
					if (local63 < local81) {
						if (local66 < local96) {
							arg0.anInt169 = 1280;
						} else if (local66 > local96) {
							arg0.anInt169 = 1792;
						} else {
							arg0.anInt169 = 1536;
						}
					} else if (local63 > local81) {
						if (local66 < local96) {
							arg0.anInt169 = 768;
						} else if (local66 > local96) {
							arg0.anInt169 = 256;
						} else {
							arg0.anInt169 = 512;
						}
					} else if (local66 < local96) {
						arg0.anInt169 = 1024;
					} else {
						arg0.anInt169 = 0;
					}
					@Pc(190) int local190 = arg0.anInt169 - arg0.anInt129 & 0x7FF;
					if (local190 > 1024) {
						local190 -= 2048;
					}
					@Pc(197) int local197 = arg0.anInt134;
					if (local190 >= -256 && local190 <= 256) {
						local197 = arg0.anInt133;
					} else if (local190 >= 256 && local190 < 768) {
						local197 = arg0.anInt136;
					} else if (local190 >= -768 && local190 <= -256) {
						local197 = arg0.anInt135;
					}
					if (local197 == -1) {
						local197 = arg0.anInt133;
					}
					arg0.anInt147 = local197;
					@Pc(239) int local239 = 4;
					if (arg0.anInt129 != arg0.anInt169 && arg0.anInt144 == -1 && arg0.anInt170 != 0) {
						local239 = 2;
					}
					if (arg0.anInt171 > 2) {
						local239 = 6;
					}
					if (arg0.anInt171 > 3) {
						local239 = 8;
					}
					if (arg0.anInt172 > 0 && arg0.anInt171 > 1) {
						local239 = 8;
						arg0.anInt172--;
					}
					if (arg0.aBooleanArray3[arg0.anInt171 - 1]) {
						local239 <<= 0x1;
					}
					if (local239 >= 8 && arg0.anInt147 == arg0.anInt133 && arg0.anInt137 != -1) {
						arg0.anInt147 = arg0.anInt137;
					}
					if (local63 < local81) {
						arg0.anInt127 += local239;
						if (arg0.anInt127 > local81) {
							arg0.anInt127 = local81;
						}
					} else if (local63 > local81) {
						arg0.anInt127 -= local239;
						if (arg0.anInt127 < local81) {
							arg0.anInt127 = local81;
						}
					}
					if (local66 < local96) {
						arg0.anInt128 += local239;
						if (arg0.anInt128 > local96) {
							arg0.anInt128 = local96;
						}
					} else if (local66 > local96) {
						arg0.anInt128 -= local239;
						if (arg0.anInt128 < local96) {
							arg0.anInt128 = local96;
						}
					}
					if (arg0.anInt127 == local81 && arg0.anInt128 == local96) {
						arg0.anInt171--;
						if (arg0.anInt173 > 0) {
							arg0.anInt173--;
							return;
						}
					}
				} else {
					arg0.anInt127 = local81;
					arg0.anInt128 = local96;
				}
			}
		} catch (@Pc(401) RuntimeException local401) {
			signlink.reporterror("5359, " + arg0 + ", " + 523 + ", " + local401.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!z;I)V")
	private void method178(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			this.anInt349 += 0;
			if (arg0.anInt170 != 0) {
				@Pc(33) int local33;
				@Pc(39) int local39;
				if (arg0.anInt144 != -1 && arg0.anInt144 < 32768) {
					@Pc(25) Class1_Sub1_Sub1_Sub1_Sub1 local25 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[arg0.anInt144];
					if (local25 != null) {
						local33 = arg0.anInt127 - local25.anInt127;
						local39 = arg0.anInt128 - local25.anInt128;
						if (local33 != 0 || local39 != 0) {
							arg0.anInt169 = (int) (Math.atan2((double) local33, (double) local39) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(64) int local64;
				if (arg0.anInt144 >= 32768) {
					local64 = arg0.anInt144 - 32768;
					if (local64 == this.anInt409) {
						local64 = this.anInt332;
					}
					@Pc(76) Class1_Sub1_Sub1_Sub1_Sub2 local76 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local64];
					if (local76 != null) {
						local39 = arg0.anInt127 - local76.anInt127;
						@Pc(90) int local90 = arg0.anInt128 - local76.anInt128;
						if (local39 != 0 || local90 != 0) {
							arg0.anInt169 = (int) (Math.atan2((double) local39, (double) local90) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt145 != 0 || arg0.anInt146 != 0) && (arg0.anInt171 == 0 || arg0.anInt172 > 0)) {
					local64 = arg0.anInt127 - (arg0.anInt145 - this.anInt381 - this.anInt381) * 64;
					local33 = arg0.anInt128 - (arg0.anInt146 - this.anInt382 - this.anInt382) * 64;
					if (local64 != 0 || local33 != 0) {
						arg0.anInt169 = (int) (Math.atan2((double) local64, (double) local33) * 325.949D) & 0x7FF;
					}
					arg0.anInt145 = 0;
					arg0.anInt146 = 0;
				}
				local64 = arg0.anInt169 - arg0.anInt129 & 0x7FF;
				if (local64 != 0) {
					if (local64 < arg0.anInt170 || local64 > 2048 - arg0.anInt170) {
						arg0.anInt129 = arg0.anInt169;
					} else if (local64 > 1024) {
						arg0.anInt129 -= arg0.anInt170;
					} else {
						arg0.anInt129 += arg0.anInt170;
					}
					arg0.anInt129 &= 0x7FF;
					if (arg0.anInt147 == arg0.anInt131 && arg0.anInt129 != arg0.anInt169) {
						if (arg0.anInt132 != -1) {
							arg0.anInt147 = arg0.anInt132;
							return;
						}
						arg0.anInt147 = arg0.anInt133;
						return;
					}
				}
			}
		} catch (@Pc(244) RuntimeException local244) {
			signlink.reporterror("71399, " + arg0 + ", " + 0 + ", " + local244.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!z;)V")
	private void method179(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.aBoolean27 = false;
			@Pc(18) Class27 local18;
			if (arg0.anInt147 != -1) {
				local18 = Class27.aClass27Array1[arg0.anInt147];
				arg0.anInt149++;
				if (arg0.anInt148 < local18.anInt809 && arg0.anInt149 > local18.method517(arg0.anInt148)) {
					arg0.anInt149 = 0;
					arg0.anInt148++;
				}
				if (arg0.anInt148 >= local18.anInt809) {
					arg0.anInt149 = 0;
					arg0.anInt148 = 0;
				}
			}
			if (arg0.anInt155 != -1 && anInt426 >= arg0.anInt158) {
				if (arg0.anInt156 < 0) {
					arg0.anInt156 = 0;
				}
				local18 = Class32.aClass32Array1[arg0.anInt155].aClass27_2;
				arg0.anInt157++;
				while (arg0.anInt156 < local18.anInt809 && arg0.anInt157 > local18.method517(arg0.anInt156)) {
					arg0.anInt157 -= local18.method517(arg0.anInt156);
					arg0.anInt156++;
				}
				if (arg0.anInt156 >= local18.anInt809 && (arg0.anInt156 < 0 || arg0.anInt156 >= local18.anInt809)) {
					arg0.anInt155 = -1;
				}
			}
			if (arg0.anInt150 != -1 && arg0.anInt153 <= 1) {
				local18 = Class27.aClass27Array1[arg0.anInt150];
				if (local18.anInt815 == 1 && arg0.anInt173 > 0 && arg0.anInt164 <= anInt426 && arg0.anInt165 < anInt426) {
					arg0.anInt153 = 1;
					return;
				}
			}
			if (arg0.anInt150 != -1 && arg0.anInt153 == 0) {
				local18 = Class27.aClass27Array1[arg0.anInt150];
				arg0.anInt152++;
				while (arg0.anInt151 < local18.anInt809 && arg0.anInt152 > local18.method517(arg0.anInt151)) {
					arg0.anInt152 -= local18.method517(arg0.anInt151);
					arg0.anInt151++;
				}
				if (arg0.anInt151 >= local18.anInt809) {
					arg0.anInt151 -= local18.anInt810;
					arg0.anInt154++;
					if (arg0.anInt154 >= local18.anInt814) {
						arg0.anInt150 = -1;
					}
					if (arg0.anInt151 < 0 || arg0.anInt151 >= local18.anInt809) {
						arg0.anInt150 = -1;
					}
				}
				arg0.aBoolean27 = local18.aBoolean207;
			}
			if (arg0.anInt153 > 0) {
				arg0.anInt153--;
			}
		} catch (@Pc(263) RuntimeException local263) {
			signlink.reporterror("68597, " + false + ", " + arg0 + ", " + local263.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method180(@OriginalArg(0) boolean arg0) {
		try {
			if (arg0) {
				this.aBoolean80 = !this.aBoolean80;
			}
			if (this.aBoolean75) {
				this.aBoolean75 = false;
				this.aClass37_19.method539(4, 0, super.aGraphics2);
				this.aClass37_20.method539(357, 0, super.aGraphics2);
				this.aClass37_21.method539(4, 722, super.aGraphics2);
				this.aClass37_22.method539(205, 743, super.aGraphics2);
				this.aClass37_23.method539(0, 0, super.aGraphics2);
				this.aClass37_24.method539(4, 516, super.aGraphics2);
				this.aClass37_25.method539(205, 516, super.aGraphics2);
				this.aClass37_26.method539(357, 496, super.aGraphics2);
				this.aClass37_27.method539(338, 0, super.aGraphics2);
				this.aBoolean44 = true;
				this.aBoolean79 = true;
				this.aBoolean58 = true;
				this.aBoolean49 = true;
				if (this.anInt301 != 2) {
					this.aClass37_5.method539(4, 4, super.aGraphics2);
					this.aClass37_4.method539(4, 550, super.aGraphics2);
				}
			}
			if (this.anInt301 == 2) {
				this.method207();
			}
			if (this.aBoolean63 && this.anInt249 == 1) {
				this.aBoolean44 = true;
			}
			@Pc(148) boolean local148;
			if (this.anInt429 != -1) {
				local148 = this.method138(this.anInt372, this.anInt429);
				if (local148) {
					this.aBoolean44 = true;
				}
			}
			if (this.anInt258 == 2) {
				this.aBoolean44 = true;
			}
			if (this.anInt325 == 2) {
				this.aBoolean44 = true;
			}
			if (this.aBoolean44) {
				this.method122();
				this.aBoolean44 = false;
			}
			if (this.anInt413 == -1) {
				this.aClass6_1.anInt467 = this.anInt393 - this.anInt314 - 77;
				if (super.anInt230 > 448 && super.anInt230 < 560 && super.anInt231 > 332) {
					this.method136(463, this.anInt393, false, super.anInt230 - 17, this.aClass6_1, super.anInt231 - 357, 77, 0);
				}
				@Pc(230) int local230 = this.anInt393 - this.aClass6_1.anInt467 - 77;
				if (local230 < 0) {
					local230 = 0;
				}
				if (local230 > this.anInt393 - 77) {
					local230 = this.anInt393 - 77;
				}
				if (this.anInt314 != local230) {
					this.anInt314 = local230;
					this.aBoolean79 = true;
				}
			}
			if (this.anInt413 != -1) {
				local148 = this.method138(this.anInt372, this.anInt413);
				if (local148) {
					this.aBoolean79 = true;
				}
			}
			if (this.anInt258 == 3) {
				this.aBoolean79 = true;
			}
			if (this.anInt325 == 3) {
				this.aBoolean79 = true;
			}
			if (this.aString18 != null) {
				this.aBoolean79 = true;
			}
			if (this.aBoolean63 && this.anInt249 == 2) {
				this.aBoolean79 = true;
			}
			if (this.aBoolean79) {
				this.method205();
				this.aBoolean79 = false;
			}
			if (this.anInt301 == 2) {
				this.method183((byte) 3);
				this.aClass37_4.method539(4, 550, super.aGraphics2);
			}
			if (this.anInt447 != -1) {
				this.aBoolean58 = true;
			}
			if (this.aBoolean58) {
				if (this.anInt447 != -1 && this.anInt447 == this.anInt263) {
					this.anInt447 = -1;
					this.aClass1_Sub1_Sub3_4.method487(201);
					this.aClass1_Sub1_Sub3_4.method488(this.anInt263);
				}
				this.aBoolean58 = false;
				this.aClass37_9.method538((byte) 9);
				this.aClass1_Sub1_Sub2_Sub3_8.method445(0, 0);
				if (this.anInt429 == -1) {
					if (this.anIntArray71[this.anInt263] != -1) {
						if (this.anInt263 == 0) {
							this.aClass1_Sub1_Sub2_Sub3_16.method445(22, 10);
						}
						if (this.anInt263 == 1) {
							this.aClass1_Sub1_Sub2_Sub3_17.method445(54, 8);
						}
						if (this.anInt263 == 2) {
							this.aClass1_Sub1_Sub2_Sub3_17.method445(82, 8);
						}
						if (this.anInt263 == 3) {
							this.aClass1_Sub1_Sub2_Sub3_18.method445(110, 8);
						}
						if (this.anInt263 == 4) {
							this.aClass1_Sub1_Sub2_Sub3_20.method445(153, 8);
						}
						if (this.anInt263 == 5) {
							this.aClass1_Sub1_Sub2_Sub3_20.method445(181, 8);
						}
						if (this.anInt263 == 6) {
							this.aClass1_Sub1_Sub2_Sub3_19.method445(209, 9);
						}
					}
					if (this.anIntArray71[0] != -1 && (this.anInt447 != 0 || anInt426 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[0].method445(29, 13);
					}
					if (this.anIntArray71[1] != -1 && (this.anInt447 != 1 || anInt426 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[1].method445(53, 11);
					}
					if (this.anIntArray71[2] != -1 && (this.anInt447 != 2 || anInt426 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[2].method445(82, 11);
					}
					if (this.anIntArray71[3] != -1 && (this.anInt447 != 3 || anInt426 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[3].method445(115, 12);
					}
					if (this.anIntArray71[4] != -1 && (this.anInt447 != 4 || anInt426 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[4].method445(153, 13);
					}
					if (this.anIntArray71[5] != -1 && (this.anInt447 != 5 || anInt426 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[5].method445(180, 11);
					}
					if (this.anIntArray71[6] != -1 && (this.anInt447 != 6 || anInt426 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[6].method445(208, 13);
					}
				}
				this.aClass37_9.method539(160, 516, super.aGraphics2);
				this.aClass37_8.method538((byte) 9);
				this.aClass1_Sub1_Sub2_Sub3_7.method445(0, 0);
				if (this.anInt429 == -1) {
					if (this.anIntArray71[this.anInt263] != -1) {
						if (this.anInt263 == 7) {
							this.aClass1_Sub1_Sub2_Sub3_1.method445(42, 0);
						}
						if (this.anInt263 == 8) {
							this.aClass1_Sub1_Sub2_Sub3_2.method445(74, 0);
						}
						if (this.anInt263 == 9) {
							this.aClass1_Sub1_Sub2_Sub3_2.method445(102, 0);
						}
						if (this.anInt263 == 10) {
							this.aClass1_Sub1_Sub2_Sub3_3.method445(130, 1);
						}
						if (this.anInt263 == 11) {
							this.aClass1_Sub1_Sub2_Sub3_5.method445(173, 0);
						}
						if (this.anInt263 == 12) {
							this.aClass1_Sub1_Sub2_Sub3_5.method445(201, 0);
						}
						if (this.anInt263 == 13) {
							this.aClass1_Sub1_Sub2_Sub3_4.method445(229, 0);
						}
					}
					if (this.anIntArray71[8] != -1 && (this.anInt447 != 8 || anInt426 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[7].method445(74, 2);
					}
					if (this.anIntArray71[9] != -1 && (this.anInt447 != 9 || anInt426 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[8].method445(102, 3);
					}
					if (this.anIntArray71[10] != -1 && (this.anInt447 != 10 || anInt426 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[9].method445(137, 4);
					}
					if (this.anIntArray71[11] != -1 && (this.anInt447 != 11 || anInt426 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[10].method445(174, 2);
					}
					if (this.anIntArray71[12] != -1 && (this.anInt447 != 12 || anInt426 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[11].method445(201, 2);
					}
					if (this.anIntArray71[13] != -1 && (this.anInt447 != 13 || anInt426 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[12].method445(226, 2);
					}
				}
				this.aClass37_8.method539(466, 496, super.aGraphics2);
				this.aClass37_5.method538((byte) 9);
			}
			if (this.aBoolean49) {
				this.aBoolean49 = false;
				this.aClass37_7.method538((byte) 9);
				this.aClass1_Sub1_Sub2_Sub3_6.method445(0, 0);
				this.aClass1_Sub1_Sub2_Sub4_2.method466(16777215, 55, "Public chat", 28, true);
				if (this.anInt422 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466(65280, 55, "On", 41, true);
				}
				if (this.anInt422 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466(16776960, 55, "Friends", 41, true);
				}
				if (this.anInt422 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466(16711680, 55, "Off", 41, true);
				}
				if (this.anInt422 == 3) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466(65535, 55, "Hide", 41, true);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method466(16777215, 184, "Private chat", 28, true);
				if (this.anInt444 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466(65280, 184, "On", 41, true);
				}
				if (this.anInt444 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466(16776960, 184, "Friends", 41, true);
				}
				if (this.anInt444 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466(16711680, 184, "Off", 41, true);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method466(16777215, 324, "Trade/duel", 28, true);
				if (this.anInt410 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466(65280, 324, "On", 41, true);
				}
				if (this.anInt410 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466(16776960, 324, "Friends", 41, true);
				}
				if (this.anInt410 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466(16711680, 324, "Off", 41, true);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method466(16777215, 458, "Report abuse", 33, true);
				this.aClass37_7.method539(453, 0, super.aGraphics2);
				this.aClass37_5.method538((byte) 9);
			}
			this.anInt372 = 0;
		} catch (@Pc(1056) RuntimeException local1056) {
			signlink.reporterror("31295, " + arg0 + ", " + local1056.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method181() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray68[local5 + 32512] = 255;
				}
			}
			this.anInt349 += 0;
			@Pc(47) int local47;
			@Pc(54) int local54;
			@Pc(60) int local60;
			for (local12 = 0; local12 < 100; local12++) {
				local47 = (int) (Math.random() * 124.0D) + 2;
				local54 = (int) (Math.random() * 128.0D) + 128;
				local60 = local47 + (local54 << 7);
				this.anIntArray68[local60] = 192;
			}
			for (local47 = 1; local47 < 255; local47++) {
				for (local54 = 1; local54 < 127; local54++) {
					local60 = local54 + (local47 << 7);
					this.anIntArray69[local60] = (this.anIntArray68[local60 - 1] + this.anIntArray68[local60 + 1] + this.anIntArray68[local60 - 128] + this.anIntArray68[local60 + 128]) / 4;
				}
			}
			this.anInt345 += 128;
			if (this.anInt345 > this.anIntArray47.length) {
				this.anInt345 -= this.anIntArray47.length;
				local54 = (int) (Math.random() * 12.0D);
				this.method221(this.aClass1_Sub1_Sub2_Sub3Array3[local54], (byte) 1);
			}
			@Pc(172) int local172;
			for (local54 = 1; local54 < 255; local54++) {
				for (local60 = 1; local60 < 127; local60++) {
					local172 = local60 + (local54 << 7);
					@Pc(195) int local195 = this.anIntArray69[local172 + 128] - this.anIntArray47[local172 + this.anInt345 & this.anIntArray47.length - 1] / 5;
					if (local195 < 0) {
						local195 = 0;
					}
					this.anIntArray68[local172] = local195;
				}
			}
			for (local60 = 0; local60 < 255; local60++) {
				this.anIntArray50[local60] = this.anIntArray50[local60 + 1];
			}
			this.anIntArray50[255] = (int) (Math.sin((double) anInt426 / 14.0D) * 16.0D + Math.sin((double) anInt426 / 15.0D) * 14.0D + Math.sin((double) anInt426 / 16.0D) * 12.0D);
			if (this.anInt319 > 0) {
				this.anInt319 -= 4;
			}
			if (this.anInt320 > 0) {
				this.anInt320 -= 4;
			}
			if (this.anInt319 == 0 && this.anInt320 == 0) {
				local172 = (int) (Math.random() * 2000.0D);
				if (local172 == 0) {
					this.anInt319 = 1024;
				}
				if (local172 == 1) {
					this.anInt320 = 1024;
					return;
				}
			}
		} catch (@Pc(306) RuntimeException local306) {
			signlink.reporterror("70300, " + 0 + ", " + local306.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)V")
	private void method182(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		try {
			if (arg1 == 0 && this.anInt283 != -1) {
				this.aString18 = arg3;
				super.anInt235 = 0;
			}
			if (this.anInt413 == -1) {
				this.aBoolean79 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray44[local20] = this.anIntArray44[local20 - 1];
				this.aStringArray1[local20] = this.aStringArray1[local20 - 1];
				this.aStringArray2[local20] = this.aStringArray2[local20 - 1];
			}
			this.anIntArray44[0] = arg1;
			this.aStringArray1[0] = arg0;
			this.aStringArray2[0] = arg3;
			if (arg2 != -22996) {
				this.anInt346 = this.aClass47_1.method674();
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("92758, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method183(@OriginalArg(0) byte arg0) {
		try {
			this.aClass37_4.method538((byte) 9);
			@Pc(13) int local13 = this.anInt267 + this.anInt279 & 0x7FF;
			@Pc(20) int local20 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt127 / 32 + 48;
			@Pc(25) boolean local25 = false;
			@Pc(35) int local35 = 464 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 / 32;
			this.aClass1_Sub1_Sub2_Sub2_4.method410(146, this.anIntArray75, this.anInt315 + 256, this.anIntArray95, 25, local20, 151, 5, local35, local13);
			this.aClass1_Sub1_Sub2_Sub2_3.method410(33, this.anIntArray86, 256, this.anIntArray66, 0, 25, 33, 0, 25, this.anInt267);
			for (@Pc(73) int local73 = 0; local73 < this.anInt247; local73++) {
				local20 = this.anIntArray39[local73] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt127 / 32;
				local35 = this.anIntArray40[local73] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 / 32;
				this.method140(this.aClass1_Sub1_Sub2_Sub2Array3[local73], local35, local20);
			}
			@Pc(123) int local123;
			for (@Pc(119) int local119 = 0; local119 < 104; local119++) {
				for (local123 = 0; local123 < 104; local123++) {
					@Pc(135) Class31 local135 = this.aClass31ArrayArrayArray1[this.anInt278][local119][local123];
					if (local135 != null) {
						local20 = local119 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt127 / 32;
						local35 = local123 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 / 32;
						this.method140(this.aClass1_Sub1_Sub2_Sub2_9, local35, local20);
					}
				}
			}
			for (local123 = 0; local123 < this.anInt254; local123++) {
				@Pc(186) Class1_Sub1_Sub1_Sub1_Sub1 local186 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray42[local123]];
				if (local186 != null && local186.method49() && local186.aClass13_1.aBoolean141) {
					local20 = local186.anInt127 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt127 / 32;
					local35 = local186.anInt128 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 / 32;
					this.method140(this.aClass1_Sub1_Sub2_Sub2_10, local35, local20);
				}
			}
			@Pc(240) Class1_Sub1_Sub1_Sub1_Sub2 local240;
			for (@Pc(230) int local230 = 0; local230 < this.anInt333; local230++) {
				local240 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray62[local230]];
				if (local240 != null && local240.method49()) {
					local20 = local240.anInt127 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt127 / 32;
					local35 = local240.anInt128 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 / 32;
					@Pc(268) boolean local268 = false;
					@Pc(272) long local272 = Class49.method679(local240.aString4);
					for (@Pc(274) int local274 = 0; local274 < this.anInt439; local274++) {
						if (local272 == this.aLongArray4[local274] && this.anIntArray84[local274] != 0) {
							local268 = true;
							break;
						}
					}
					if (local268) {
						this.method140(this.aClass1_Sub1_Sub2_Sub2_12, local35, local20);
					} else {
						this.method140(this.aClass1_Sub1_Sub2_Sub2_11, local35, local20);
					}
				}
			}
			if (this.anInt368 != 0 && anInt426 % 20 < 10) {
				if (this.anInt368 == 1 && this.anInt259 >= 0 && this.anInt259 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length) {
					@Pc(347) Class1_Sub1_Sub1_Sub1_Sub1 local347 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anInt259];
					if (local347 != null) {
						local20 = local347.anInt127 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt127 / 32;
						local35 = local347.anInt128 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 / 32;
						this.method223(this.aClass1_Sub1_Sub2_Sub2_6, local20, local35, 375);
					}
				}
				if (this.anInt368 == 2) {
					local20 = (this.anInt374 - this.anInt381) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt127 / 32;
					local35 = (this.anInt375 - this.anInt382) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 / 32;
					this.method223(this.aClass1_Sub1_Sub2_Sub2_6, local20, local35, 375);
				}
				if (this.anInt368 == 10 && this.anInt355 >= 0 && this.anInt355 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length) {
					local240 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anInt355];
					if (local240 != null) {
						local20 = local240.anInt127 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt127 / 32;
						local35 = local240.anInt128 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 / 32;
						this.method223(this.aClass1_Sub1_Sub2_Sub2_6, local20, local35, 375);
					}
				}
			}
			if (this.anInt290 != 0) {
				local20 = this.anInt290 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt127 / 32;
				local35 = this.anInt291 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 / 32;
				this.method140(this.aClass1_Sub1_Sub2_Sub2_5, local35, local20);
			}
			Class1_Sub1_Sub2.method458(3, 3, 97, 78, (byte) 3, 16777215);
			this.aClass37_5.method538((byte) 9);
		} catch (@Pc(512) RuntimeException local512) {
			signlink.reporterror("78419, " + arg0 + ", " + local512.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!mb;IILclient!bb;)V")
	private void method184(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class1_Sub1_Sub1_Sub1_Sub2 arg3) {
		try {
			@Pc(15) int local15;
			if ((arg0 & 0x1) == 1) {
				local15 = arg1.method498();
				@Pc(18) byte[] local18 = new byte[local15];
				@Pc(24) Class1_Sub1_Sub3 local24 = new Class1_Sub1_Sub3(local18, (byte) 3);
				arg1.method507(this.anInt404, local18, local15);
				this.aClass1_Sub1_Sub3Array1[arg2] = local24;
				arg3.method51(local24);
			}
			@Pc(63) int local63;
			@Pc(75) int local75;
			if ((arg0 & 0x2) == 2) {
				local15 = arg1.method500();
				if (local15 == 65535) {
					local15 = -1;
				}
				if (local15 == arg3.anInt150) {
					arg3.anInt154 = 0;
				}
				local63 = arg1.method498();
				if (local15 == arg3.anInt150 && local15 != -1) {
					local75 = Class27.aClass27Array1[local15].anInt817;
					if (local75 == 1) {
						arg3.anInt151 = 0;
						arg3.anInt152 = 0;
						arg3.anInt153 = local63;
						arg3.anInt154 = 0;
					}
					if (local75 == 2) {
						arg3.anInt154 = 0;
					}
				} else if (local15 == -1 || arg3.anInt150 == -1 || Class27.aClass27Array1[local15].anInt811 >= Class27.aClass27Array1[arg3.anInt150].anInt811) {
					arg3.anInt150 = local15;
					arg3.anInt151 = 0;
					arg3.anInt152 = 0;
					arg3.anInt153 = local63;
					arg3.anInt154 = 0;
					arg3.anInt173 = arg3.anInt171;
				}
			}
			if ((arg0 & 0x4) == 4) {
				arg3.anInt144 = arg1.method500();
				if (arg3.anInt144 == 65535) {
					arg3.anInt144 = -1;
				}
			}
			if ((arg0 & 0x8) == 8) {
				arg3.aString3 = arg1.method505();
				arg3.anInt139 = 0;
				arg3.anInt140 = 0;
				arg3.anInt138 = 150;
				this.method182(arg3.aString4, 2, this.anInt433, arg3.aString3);
			}
			if ((arg0 & 0x10) == 16) {
				local15 = arg1.method498();
				local63 = arg1.method498();
				arg3.method50(local63, local15);
				arg3.anInt141 = anInt426 + 300;
				arg3.anInt142 = arg1.method498();
				arg3.anInt143 = arg1.method498();
			}
			if ((arg0 & 0x20) == 32) {
				arg3.anInt145 = arg1.method500();
				arg3.anInt146 = arg1.method500();
			}
			if ((arg0 & 0x40) == 64) {
				local15 = arg1.method500();
				local63 = arg1.method498();
				local75 = arg1.method498();
				@Pc(236) int local236 = arg1.anInt777;
				if (arg3.aString4 != null && arg3.aBoolean29) {
					@Pc(246) long local246 = Class49.method679(arg3.aString4);
					@Pc(248) boolean local248 = false;
					if (local63 <= 1) {
						for (@Pc(253) int local253 = 0; local253 < this.anInt451; local253++) {
							if (this.aLongArray3[local253] == local246) {
								local248 = true;
								break;
							}
						}
					}
					if (!local248 && this.anInt362 == 0) {
						try {
							@Pc(281) String local281 = Class2.method40(arg1, local75);
							@Pc(285) String local285 = Class41.method613(local281);
							arg3.aString3 = local285;
							arg3.anInt139 = local15 >> 8;
							arg3.anInt140 = local15 & 0xFF;
							arg3.anInt138 = 150;
							if (local63 == 2 || local63 == 3) {
								this.method182("@cr2@" + arg3.aString4, 1, this.anInt433, local285);
							} else if (local63 == 1) {
								this.method182("@cr1@" + arg3.aString4, 1, this.anInt433, local285);
							} else {
								this.method182(arg3.aString4, 2, this.anInt433, local285);
							}
						} catch (@Pc(352) Exception local352) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg1.anInt777 = local236 + local75;
			}
			if ((arg0 & 0x100) == 256) {
				arg3.anInt155 = arg1.method500();
				local15 = arg1.method503();
				arg3.anInt159 = local15 >> 16;
				arg3.anInt158 = anInt426 + (local15 & 0xFFFF);
				arg3.anInt156 = 0;
				arg3.anInt157 = 0;
				if (arg3.anInt158 > anInt426) {
					arg3.anInt156 = -1;
				}
				if (arg3.anInt155 == 65535) {
					arg3.anInt155 = -1;
				}
			}
			if ((arg0 & 0x200) == 512) {
				arg3.anInt160 = arg1.method498();
				arg3.anInt162 = arg1.method498();
				arg3.anInt161 = arg1.method498();
				arg3.anInt163 = arg1.method498();
				arg3.anInt164 = arg1.method500() + anInt426;
				arg3.anInt165 = arg1.method500() + anInt426;
				arg3.anInt166 = arg1.method498();
				arg3.method48();
			}
			if ((arg0 & 0x400) == 1024) {
				local15 = arg1.method498();
				local63 = arg1.method498();
				arg3.method50(local63, local15);
				arg3.anInt141 = anInt426 + 300;
				arg3.anInt142 = arg1.method498();
				arg3.anInt143 = arg1.method498();
			}
		} catch (@Pc(475) RuntimeException local475) {
			signlink.reporterror("97724, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -98 + ", " + arg3 + ", " + local475.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method185(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				aBoolean56 = !aBoolean56;
			}
			if (this.anInt325 == 0) {
				@Pc(14) int local14 = super.anInt235;
				if (this.anInt336 == 1 && super.anInt236 >= 516 && super.anInt237 >= 160 && super.anInt236 <= 765 && super.anInt237 <= 205) {
					local14 = 0;
				}
				@Pc(45) int local45;
				@Pc(48) int local48;
				@Pc(124) int local124;
				if (this.aBoolean63) {
					if (local14 != 1) {
						local45 = super.anInt230;
						local48 = super.anInt231;
						if (this.anInt249 == 0) {
							local45 -= 4;
							local48 -= 4;
						}
						if (this.anInt249 == 1) {
							local45 -= 553;
							local48 -= 205;
						}
						if (this.anInt249 == 2) {
							local45 -= 17;
							local48 -= 357;
						}
						if (local45 < this.anInt250 - 10 || local45 > this.anInt250 + this.anInt252 + 10 || local48 < this.anInt251 - 10 || local48 > this.anInt251 + this.anInt253 + 10) {
							this.aBoolean63 = false;
							if (this.anInt249 == 1) {
								this.aBoolean44 = true;
							}
							if (this.anInt249 == 2) {
								this.aBoolean79 = true;
							}
						}
					}
					if (local14 == 1) {
						local45 = this.anInt250;
						local48 = this.anInt251;
						local124 = this.anInt252;
						@Pc(127) int local127 = super.anInt236;
						@Pc(130) int local130 = super.anInt237;
						if (this.anInt249 == 0) {
							local127 -= 4;
							local130 -= 4;
						}
						if (this.anInt249 == 1) {
							local127 -= 553;
							local130 -= 205;
						}
						if (this.anInt249 == 2) {
							local127 -= 17;
							local130 -= 357;
						}
						@Pc(149) int local149 = -1;
						for (@Pc(151) int local151 = 0; local151 < this.anInt299; local151++) {
							@Pc(166) int local166 = local48 + (this.anInt299 - 1 - local151) * 15 + 31;
							if (local127 > local45 && local127 < local45 + local124 && local130 > local166 - 13 && local130 < local166 + 3) {
								local149 = local151;
							}
						}
						if (local149 != -1) {
							this.method100((byte) 7, local149);
						}
						this.aBoolean63 = false;
						if (this.anInt249 == 1) {
							this.aBoolean44 = true;
						}
						if (this.anInt249 == 2) {
							this.aBoolean79 = true;
							return;
						}
					}
				} else {
					if (local14 == 1 && this.anInt299 > 0) {
						local45 = this.anIntArray37[this.anInt299 - 1];
						if (local45 == 582 || local45 == 113 || local45 == 555 || local45 == 331 || local45 == 354 || local45 == 694 || local45 == 962 || local45 == 795 || local45 == 681 || local45 == 100 || local45 == 102 || local45 == 1328) {
							local48 = this.anIntArray35[this.anInt299 - 1];
							local124 = this.anIntArray36[this.anInt299 - 1];
							@Pc(286) Class6 local286 = Class6.aClass6Array1[local124];
							if (local286.aBoolean94 || local286.aBoolean97) {
								this.aBoolean64 = false;
								this.anInt265 = 0;
								this.anInt323 = local124;
								this.anInt324 = local48;
								this.anInt325 = 2;
								this.anInt326 = super.anInt236;
								this.anInt327 = super.anInt237;
								if (Class6.aClass6Array1[local124].anInt457 == this.anInt399) {
									this.anInt325 = 1;
								}
								if (Class6.aClass6Array1[local124].anInt457 == this.anInt413) {
									this.anInt325 = 3;
								}
								return;
							}
						}
					}
					if (local14 == 1 && (this.anInt387 == 1 || this.method191(this.anInt299 - 1)) && this.anInt299 > 2) {
						local14 = 2;
					}
					if (local14 == 1 && this.anInt299 > 0) {
						this.method100((byte) 7, this.anInt299 - 1);
					}
					if (local14 != 2 || this.anInt299 <= 0) {
						return;
					}
					this.method160();
				}
			}
		} catch (@Pc(381) RuntimeException local381) {
			signlink.reporterror("19209, " + arg0 + ", " + local381.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!mb;II)V")
	private void method186(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(6) int local6 = arg0.method509(8);
			@Pc(10) boolean local10 = false;
			@Pc(16) int local16;
			if (local6 < this.anInt333) {
				for (local16 = local6; local16 < this.anInt333; local16++) {
					this.anIntArray67[this.anInt364++] = this.anIntArray62[local16];
				}
			}
			if (local6 > this.anInt333) {
				signlink.reporterror(this.aString10 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt333 = 0;
			for (local16 = 0; local16 < local6; local16++) {
				@Pc(68) int local68 = this.anIntArray62[local16];
				@Pc(73) Class1_Sub1_Sub1_Sub1_Sub2 local73 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local68];
				@Pc(78) int local78 = arg0.method509(1);
				if (local78 == 0) {
					this.anIntArray62[this.anInt333++] = local68;
					local73.anInt167 = anInt426;
				} else {
					@Pc(101) int local101 = arg0.method509(2);
					if (local101 == 0) {
						this.anIntArray62[this.anInt333++] = local68;
						local73.anInt167 = anInt426;
						this.anIntArray63[this.anInt334++] = local68;
					} else {
						@Pc(152) int local152;
						@Pc(162) int local162;
						if (local101 == 1) {
							this.anIntArray62[this.anInt333++] = local68;
							local73.anInt167 = anInt426;
							local152 = arg0.method509(3);
							local73.method47(false, local152);
							local162 = arg0.method509(1);
							if (local162 == 1) {
								this.anIntArray63[this.anInt334++] = local68;
							}
						} else if (local101 == 2) {
							this.anIntArray62[this.anInt333++] = local68;
							local73.anInt167 = anInt426;
							local152 = arg0.method509(3);
							local73.method47(true, local152);
							local162 = arg0.method509(3);
							local73.method47(true, local162);
							@Pc(220) int local220 = arg0.method509(1);
							if (local220 == 1) {
								this.anIntArray63[this.anInt334++] = local68;
							}
						} else if (local101 == 3) {
							this.anIntArray67[this.anInt364++] = local68;
						}
					}
				}
			}
		} catch (@Pc(257) RuntimeException local257) {
			signlink.reporterror("91382, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local257.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method187() {
		try {
			for (@Pc(3) int local3 = -1; local3 < this.anInt333; local3++) {
				@Pc(11) int local11;
				if (local3 == -1) {
					local11 = this.anInt332;
				} else {
					local11 = this.anIntArray62[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub2 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local11];
				if (local23 != null) {
					this.method174(local23, 1);
				}
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("44115, " + 312 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method188(@OriginalArg(1) int arg0) {
		try {
			@Pc(7) Class6 local7 = Class6.aClass6Array1[arg0];
			for (@Pc(9) int local9 = 0; local9 < local7.anIntArray100.length && local7.anIntArray100[local9] != -1; local9++) {
				@Pc(24) Class6 local24 = Class6.aClass6Array1[local7.anIntArray100[local9]];
				if (local24.anInt458 == 1) {
					this.method188(local24.anInt456);
				}
				local24.anInt454 = 0;
				local24.anInt455 = 0;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("38036, " + 0 + ", " + arg0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			signlink.anInt937 = arg1;
			@Pc(5) int local5 = 9 / arg0;
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("48700, " + arg0 + ", " + arg1 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method190() {
		try {
			this.aBoolean65 = true;
			try {
				@Pc(4) long local4 = System.currentTimeMillis();
				@Pc(6) int local6 = 0;
				@Pc(8) int local8 = 20;
				while (this.aBoolean88) {
					this.anInt322++;
					this.method181();
					this.method181();
					this.method116();
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
			this.aBoolean65 = false;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("86639, " + 38950 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)Z")
	private boolean method191(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(15) int local15 = this.anIntArray37[arg0];
			if (local15 >= 2000) {
				local15 -= 2000;
			}
			return local15 == 605;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("10660, " + arg0 + ", " + 0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg0 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg5 & 0x7FF;
			@Pc(17) int local17 = 0;
			@Pc(19) int local19 = 0;
			@Pc(21) int local21 = arg4;
			@Pc(27) int local27;
			@Pc(31) int local31;
			@Pc(41) int local41;
			if (local5 != 0) {
				local27 = Class1_Sub1_Sub1_Sub5.anIntArray158[local5];
				local31 = Class1_Sub1_Sub1_Sub5.anIntArray159[local5];
				local41 = local31 * 0 - arg4 * local27 >> 16;
				local21 = local27 * 0 + arg4 * local31 >> 16;
				local19 = local41;
			}
			if (local11 != 0) {
				local27 = Class1_Sub1_Sub1_Sub5.anIntArray158[local11];
				local31 = Class1_Sub1_Sub1_Sub5.anIntArray159[local11];
				local41 = local21 * local27 + local31 * 0 >> 16;
				local21 = local21 * local31 - local27 * 0 >> 16;
				local17 = local41;
			}
			this.anInt271 = arg1 - local17;
			this.anInt272 = arg2 - local19;
			this.anInt273 = arg3 - local21;
			this.anInt274 = arg0;
			this.anInt275 = arg5;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("88631, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 7 + ", " + arg4 + ", " + arg5 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method93(@OriginalArg(0) int arg0) {
		try {
			if (this.aBoolean69 || this.aBoolean78 || this.aBoolean43) {
				this.method156(this.anInt241);
			} else {
				anInt373++;
				if (this.aBoolean46) {
					this.method180(this.aBoolean80);
				} else {
					this.method104(false, (byte) 4);
				}
				this.anInt321 = 0;
				if (arg0 != 0) {
					this.anInt350 = -1;
				}
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("15449, " + arg0 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method193() {
		try {
			@Pc(7) byte[] local7 = this.aClass48_1.method678("title.dat", null);
			@Pc(13) Class1_Sub1_Sub2_Sub2 local13 = new Class1_Sub1_Sub2_Sub2(local7, this);
			this.aClass37_13.method538((byte) 9);
			local13.method404(0, 0);
			this.aClass37_14.method538((byte) 9);
			local13.method404(0, -637);
			this.aClass37_10.method538((byte) 9);
			local13.method404(0, -128);
			this.aClass37_11.method538((byte) 9);
			local13.method404(-371, -202);
			this.aClass37_12.method538((byte) 9);
			local13.method404(-171, -202);
			this.aClass37_15.method538((byte) 9);
			local13.method404(-265, 0);
			this.aClass37_16.method538((byte) 9);
			local13.method404(-265, -562);
			this.aClass37_17.method538((byte) 9);
			local13.method404(-171, -128);
			this.aClass37_18.method538((byte) 9);
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
			this.aClass37_13.method538((byte) 9);
			local13.method404(0, 382);
			this.aClass37_14.method538((byte) 9);
			local13.method404(0, -255);
			this.aClass37_10.method538((byte) 9);
			local13.method404(0, 254);
			this.aClass37_11.method538((byte) 9);
			local13.method404(-371, 180);
			this.aClass37_12.method538((byte) 9);
			local13.method404(-171, 180);
			this.aClass37_15.method538((byte) 9);
			local13.method404(-265, 382);
			this.aClass37_16.method538((byte) 9);
			local13.method404(-265, -180);
			this.aClass37_17.method538((byte) 9);
			local13.method404(-171, 254);
			this.aClass37_18.method538((byte) 9);
			local13.method404(-171, -180);
			local13 = new Class1_Sub1_Sub2_Sub2(this.aClass48_1, "logo", 0);
			this.aClass37_10.method538((byte) 9);
			local13.method406(382 - local13.anInt686 / 2 - 128, 18);
			System.gc();
		} catch (@Pc(274) RuntimeException local274) {
			signlink.reporterror("66885, " + 8 + ", " + local274.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method194(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass1_Sub1_Sub2_Sub2_4.anIntArray210;
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
			this.aClass1_Sub1_Sub2_Sub2_4.method401();
			@Pc(152) int local152;
			for (@Pc(148) int local148 = 1; local148 < 103; local148++) {
				for (local152 = 1; local152 < 103; local152++) {
					if ((this.aByteArrayArrayArray7[arg0][local152][local148] & 0x18) == 0) {
						this.method130(local34, arg0, local152, local36, local148);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local152][local148] & 0x8) != 0) {
						this.method130(local34, arg0 + 1, local152, local36, local148);
					}
				}
			}
			this.aClass37_5.method538((byte) 9);
			this.anInt247 = 0;
			for (local152 = 0; local152 < 104; local152++) {
				for (@Pc(220) int local220 = 0; local220 < 104; local220++) {
					@Pc(230) int local230 = this.aClass39_1.method573(this.anInt278, local152, local220);
					if (local230 != 0) {
						local230 = local230 >> 14 & 0x7FFF;
						@Pc(242) int local242 = Class9.method258(local230).anInt523;
						if (local242 >= 0) {
							@Pc(246) int local246 = local152;
							@Pc(248) int local248 = local220;
							if (local242 != 22 && local242 != 29 && local242 != 34 && local242 != 36 && local242 != 46 && local242 != 47 && local242 != 48) {
								@Pc(280) int[][] local280 = this.aClass19Array1[this.anInt278].anIntArrayArray17;
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
							this.aClass1_Sub1_Sub2_Sub2Array3[this.anInt247] = this.aClass1_Sub1_Sub2_Sub2Array6[local242];
							this.anIntArray39[this.anInt247] = local246;
							this.anIntArray40[this.anInt247] = local248;
							this.anInt247++;
						}
					}
				}
			}
			anInt318++;
			if (anInt318 > 112) {
				anInt318 = 0;
				this.aClass1_Sub1_Sub3_4.method487(4);
				this.aClass1_Sub1_Sub3_4.method488(50);
			}
		} catch (@Pc(437) RuntimeException local437) {
			signlink.reporterror("62200, " + arg0 + ", " + -60 + ", " + local437.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ZI)V")
	private void method195(@OriginalArg(0) boolean arg0) {
		try {
			if (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt127 >> 7 == this.anInt290 && aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 >> 7 == this.anInt291) {
				this.anInt290 = 0;
				anInt424++;
				if (anInt424 > 122) {
					anInt424 = 0;
					this.aClass1_Sub1_Sub3_4.method487(36);
					this.aClass1_Sub1_Sub3_4.method488(62);
				}
			}
			@Pc(39) int local39 = this.anInt333;
			if (arg0) {
				local39 = 1;
			}
			for (@Pc(45) int local45 = 0; local45 < local39; local45++) {
				@Pc(51) Class1_Sub1_Sub1_Sub1_Sub2 local51;
				@Pc(56) int local56;
				if (arg0) {
					local51 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
					local56 = this.anInt332 << 14;
				} else {
					local51 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray62[local45]];
					local56 = this.anIntArray62[local45] << 14;
				}
				if (local51 != null && local51.method49()) {
					local51.aBoolean30 = false;
					if ((aBoolean48 && this.anInt333 > 50 || this.anInt333 > 200) && !arg0 && local51.anInt147 == local51.anInt131) {
						local51.aBoolean30 = true;
					}
					@Pc(107) int local107 = local51.anInt127 >> 7;
					@Pc(112) int local112 = local51.anInt128 >> 7;
					if (local107 >= 0 && local107 < 104 && local112 >= 0 && local112 < 104) {
						if (local51.aClass1_Sub1_Sub1_Sub5_1 == null || anInt426 < local51.anInt178 || anInt426 >= local51.anInt179) {
							if ((local51.anInt127 & 0x7F) == 64 && (local51.anInt128 & 0x7F) == 64) {
								if (this.anIntArrayArray5[local107][local112] == this.anInt303) {
									continue;
								}
								this.anIntArrayArray5[local107][local112] = this.anInt303;
							}
							local51.anInt177 = this.method137(local51.anInt128, this.anInt278, local51.anInt127);
							this.aClass39_1.method555(local51.anInt129, local56, 60, local51.anInt127, local51, local51.anInt177, this.anInt278, local51.aBoolean27, local51.anInt128);
						} else {
							local51.aBoolean30 = false;
							local51.anInt177 = this.method137(local51.anInt128, this.anInt278, local51.anInt127);
							this.aClass39_1.method556(local51.anInt177, local51.anInt129, local51.anInt184, local51.anInt186, local51.anInt128, local51, local51.anInt183, local51.anInt127, local56, this.anInt278, local51.anInt185);
						}
					}
				}
			}
		} catch (@Pc(248) RuntimeException local248) {
			signlink.reporterror("46706, " + arg0 + ", " + 39 + ", " + local248.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)V")
	private void method196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class31 local9 = this.aClass31ArrayArrayArray1[this.anInt278][arg0][arg1];
		if (local9 == null) {
			this.aClass39_1.method565(this.anInt278, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub1_Sub1_Sub3 local23 = null;
		@Pc(27) Class1_Sub1_Sub1_Sub3 local27;
		for (local27 = (Class1_Sub1_Sub1_Sub3) local9.method523(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub3) local9.method525()) {
			@Pc(32) Class15 local32 = Class15.method345(local27.anInt487);
			@Pc(35) int local35 = local32.anInt621;
			if (local32.aBoolean152) {
				local35 *= local27.anInt488 + 1;
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
			if (local27.anInt487 != local23.anInt487 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt487 != local23.anInt487 && local27.anInt487 != local65.anInt487 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass39_1.method551(local23, local110, this.method137(arg1 * 128 + 64, this.anInt278, arg0 * 128 + 64), local67, this.anInt278, arg0, arg1, local65);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!d;)Z")
	private boolean method197(@OriginalArg(1) Class6 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt460;
			if (local4 >= 1 && local4 <= 200 || !(local4 < 701 || local4 > 900)) {
				if (local4 >= 801) {
					local4 -= 701;
				} else if (local4 >= 701) {
					local4 -= 601;
				} else if (local4 >= 101) {
					local4 -= 101;
				} else {
					local4--;
				}
				this.aStringArray4[this.anInt299] = "Remove @whi@" + this.aStringArray3[local4];
				this.anIntArray37[this.anInt299] = 513;
				this.anInt299++;
				this.aStringArray4[this.anInt299] = "Message @whi@" + this.aStringArray3[local4];
				this.anIntArray37[this.anInt299] = 902;
				this.anInt299++;
				return true;
			} else if (local4 >= 401 && local4 <= 500) {
				this.aStringArray4[this.anInt299] = "Remove @whi@" + arg0.aString19;
				this.anIntArray37[this.anInt299] = 884;
				this.anInt299++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("80341, " + 3 + ", " + arg0 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIII)Z")
	private boolean method198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(7) int local7 = arg3 >> 14 & 0x7FFF;
			if (arg1 != this.anInt450) {
				throw new NullPointerException();
			}
			@Pc(24) int local24 = this.aClass39_1.method574(this.anInt278, arg0, arg2, arg3);
			if (local24 == -1) {
				return false;
			}
			@Pc(33) int local33 = local24 & 0x1F;
			@Pc(39) int local39 = local24 >> 6 & 0x3;
			anInt282++;
			if (anInt282 > 1086) {
				anInt282 = 0;
				this.aClass1_Sub1_Sub3_4.method487(225);
				this.aClass1_Sub1_Sub3_4.method488(0);
				@Pc(61) int local61 = this.aClass1_Sub1_Sub3_4.anInt777;
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
				this.aClass1_Sub1_Sub3_4.method497(this.aClass1_Sub1_Sub3_4.anInt777 - local61);
			}
			if (local33 == 10 || local33 == 11 || local33 == 22) {
				@Pc(141) Class9 local141 = Class9.method258(local7);
				@Pc(149) int local149;
				@Pc(152) int local152;
				if (local39 == 0 || local39 == 2) {
					local149 = local141.anInt519;
					local152 = local141.anInt520;
				} else {
					local149 = local141.anInt520;
					local152 = local141.anInt519;
				}
				@Pc(163) int local163 = local141.anInt531;
				if (local39 != 0) {
					local163 = (local163 << local39 & 0xF) + (local163 >> 4 - local39);
				}
				this.method155(local163, local152, 0, arg0, 2, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], arg2, false, local149, 0);
			} else {
				this.method155(0, 0, local39, arg0, 2, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], arg2, false, 0, local33 + 1);
			}
			this.anInt389 = super.anInt236;
			this.anInt390 = super.anInt237;
			this.anInt392 = 2;
			this.anInt391 = 0;
			this.aClass1_Sub1_Sub3_4.method487(arg4);
			this.aClass1_Sub1_Sub3_4.method489(arg0 + this.anInt381);
			this.aClass1_Sub1_Sub3_4.method489(arg2 + this.anInt382);
			this.aClass1_Sub1_Sub3_4.method489(local7);
			return true;
		} catch (@Pc(263) RuntimeException local263) {
			signlink.reporterror("62999, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local263.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(III)V")
	private void method199(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = 0;
			for (@Pc(6) int local6 = 0; local6 < 100; local6++) {
				if (this.aStringArray2[local6] != null) {
					@Pc(18) int local18 = this.anIntArray44[local6];
					@Pc(29) int local29 = this.anInt314 + 70 + 4 - local4 * 14;
					if (local29 < -20) {
						break;
					}
					@Pc(37) String local37 = this.aStringArray1[local6];
					if (local37 != null && local37.startsWith("@cr1@")) {
						local37 = local37.substring(5);
					}
					if (local37 != null && local37.startsWith("@cr2@")) {
						local37 = local37.substring(5);
					}
					if (local18 == 0) {
						local4++;
					}
					if ((local18 == 1 || local18 == 2) && (local18 == 1 || this.anInt422 == 0 || this.anInt422 == 1 && this.method115(local37))) {
						if (arg0 > local29 - 14 && arg0 <= local29 && !local37.equals(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4)) {
							if (this.anInt394 >= 1) {
								this.aStringArray4[this.anInt299] = "Report abuse @whi@" + local37;
								this.anIntArray37[this.anInt299] = 524;
								this.anInt299++;
							}
							this.aStringArray4[this.anInt299] = "Add ignore @whi@" + local37;
							this.anIntArray37[this.anInt299] = 47;
							this.anInt299++;
							this.aStringArray4[this.anInt299] = "Add friend @whi@" + local37;
							this.anIntArray37[this.anInt299] = 605;
							this.anInt299++;
						}
						local4++;
					}
					if ((local18 == 3 || local18 == 7) && this.anInt313 == 0 && (local18 == 7 || this.anInt444 == 0 || this.anInt444 == 1 && this.method115(local37))) {
						if (arg0 > local29 - 14 && arg0 <= local29) {
							if (this.anInt394 >= 1) {
								this.aStringArray4[this.anInt299] = "Report abuse @whi@" + local37;
								this.anIntArray37[this.anInt299] = 524;
								this.anInt299++;
							}
							this.aStringArray4[this.anInt299] = "Add ignore @whi@" + local37;
							this.anIntArray37[this.anInt299] = 47;
							this.anInt299++;
							this.aStringArray4[this.anInt299] = "Add friend @whi@" + local37;
							this.anIntArray37[this.anInt299] = 605;
							this.anInt299++;
						}
						local4++;
					}
					if (local18 == 4 && (this.anInt410 == 0 || this.anInt410 == 1 && this.method115(local37))) {
						if (arg0 > local29 - 14 && arg0 <= local29) {
							this.aStringArray4[this.anInt299] = "Accept trade @whi@" + local37;
							this.anIntArray37[this.anInt299] = 507;
							this.anInt299++;
						}
						local4++;
					}
					if ((local18 == 5 || local18 == 6) && this.anInt313 == 0 && this.anInt444 < 2) {
						local4++;
					}
					if (local18 == 8 && (this.anInt410 == 0 || this.anInt410 == 1 && this.method115(local37))) {
						if (arg0 > local29 - 14 && arg0 <= local29) {
							this.aStringArray4[this.anInt299] = "Accept duel @whi@" + local37;
							this.anIntArray37[this.anInt299] = 957;
							this.anInt299++;
						}
						local4++;
					}
				}
			}
		} catch (@Pc(402) RuntimeException local402) {
			signlink.reporterror("18612, " + arg0 + ", " + 616 + ", " + arg1 + ", " + local402.toString());
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
				return new URL("http://127.0.0.1:" + (anInt262 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;I)V")
	@Override
	protected void method97(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) boolean local4 = false;
			this.anInt246 = arg2;
			this.aString13 = arg1;
			this.method201();
			if (this.aClass48_1 == null) {
				super.method97((byte) 6, arg1, arg2);
			} else {
				this.aClass37_12.method538((byte) 9);
				this.aClass1_Sub1_Sub2_Sub4_3.method465(54, "RuneScape is loading - please wait...", 180, 16777215);
				Class1_Sub1_Sub2.method459(9179409, 304, 62, 28, 34);
				Class1_Sub1_Sub2.method459(0, 302, 63, 29, 32);
				Class1_Sub1_Sub2.method458(30, arg2 * 3, 30, 64, (byte) 3, 9179409);
				Class1_Sub1_Sub2.method458(30, 300 - arg2 * 3, arg2 * 3 + 30, 64, (byte) 3, 0);
				this.aClass1_Sub1_Sub2_Sub4_3.method465(85, arg1, 180, 16777215);
				this.aClass37_12.method539(171, 202, super.aGraphics2);
				if (this.aBoolean75) {
					this.aBoolean75 = false;
					if (!this.aBoolean88) {
						this.aClass37_13.method539(0, 0, super.aGraphics2);
						this.aClass37_14.method539(0, 637, super.aGraphics2);
					}
					this.aClass37_10.method539(0, 128, super.aGraphics2);
					this.aClass37_11.method539(371, 202, super.aGraphics2);
					this.aClass37_15.method539(265, 0, super.aGraphics2);
					this.aClass37_16.method539(265, 562, super.aGraphics2);
					this.aClass37_17.method539(171, 128, super.aGraphics2);
					this.aClass37_18.method539(171, 562, super.aGraphics2);
				}
			}
		} catch (@Pc(218) RuntimeException local218) {
			signlink.reporterror("1153, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local218.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;IIZLjava/lang/String;I)Lclient!yb;")
	private Class48 method200(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(3) byte[] local3 = null;
			@Pc(5) int local5 = 5;
			try {
				if (this.aClass46Array1[0] != null) {
					local3 = this.aClass46Array1[0].method670(arg4);
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
				return new Class48(local3, this.anInt346);
			}
			local34 = 0;
			while (local3 == null) {
				@Pc(60) String local60 = "Unknown error";
				this.method97((byte) 6, "Requesting " + arg0, arg2);
				@Pc(75) int local75;
				try {
					local75 = 0;
					@Pc(86) DataInputStream local86 = this.method165(arg3 + arg1);
					@Pc(89) byte[] local89 = new byte[6];
					local86.readFully(local89, 0, 6);
					@Pc(100) Class1_Sub1_Sub3 local100 = new Class1_Sub1_Sub3(local89, (byte) 3);
					local100.anInt777 = 3;
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
							this.method97((byte) 6, "Loading " + arg0 + " - " + local173 + "%", arg2);
						}
						local75 = local173;
					}
					local86.close();
					try {
						if (this.aClass46Array1[0] != null) {
							this.aClass46Array1[0].method671(local3.length, arg4, local3, this.aBoolean68);
						}
					} catch (@Pc(219) Exception local219) {
						this.aClass46Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_1.reset();
						this.aCRC32_1.update(local3);
						local133 = (int) this.aCRC32_1.getValue();
						if (local133 != arg1) {
							local3 = null;
							local34++;
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
					for (local75 = local5; local75 > 0; local75--) {
						if (local34 >= 3) {
							this.method97((byte) 6, "Game updated - please reload page", arg2);
							local75 = 10;
						} else {
							this.method97((byte) 6, local60 + " - Retrying in " + local75, arg2);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(326) Exception local326) {
						}
					}
					local5 *= 2;
					if (local5 > 60) {
						local5 = 60;
					}
				}
			}
			return new Class48(local3, this.anInt346);
		} catch (@Pc(351) RuntimeException local351) {
			signlink.reporterror("47310, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + arg4 + ", " + local351.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method201() {
		try {
			if (this.aClass37_10 == null) {
				super.aClass37_2 = null;
				this.aClass37_6 = null;
				this.aClass37_4 = null;
				this.aClass37_3 = null;
				this.aClass37_5 = null;
				this.aClass37_7 = null;
				this.aClass37_8 = null;
				this.aClass37_9 = null;
				this.aClass37_13 = new Class37(true, this.method95(), 128, 265);
				Class1_Sub1_Sub2.method456();
				this.aClass37_14 = new Class37(true, this.method95(), 128, 265);
				Class1_Sub1_Sub2.method456();
				this.aClass37_10 = new Class37(true, this.method95(), 509, 171);
				Class1_Sub1_Sub2.method456();
				this.aClass37_11 = new Class37(true, this.method95(), 360, 132);
				Class1_Sub1_Sub2.method456();
				this.aClass37_12 = new Class37(true, this.method95(), 360, 200);
				Class1_Sub1_Sub2.method456();
				this.aClass37_15 = new Class37(true, this.method95(), 202, 238);
				Class1_Sub1_Sub2.method456();
				this.aClass37_16 = new Class37(true, this.method95(), 203, 238);
				Class1_Sub1_Sub2.method456();
				this.aClass37_17 = new Class37(true, this.method95(), 74, 94);
				Class1_Sub1_Sub2.method456();
				this.aClass37_18 = new Class37(true, this.method95(), 75, 94);
				Class1_Sub1_Sub2.method456();
				if (this.aClass48_1 != null) {
					this.method193();
					this.method225();
				}
				this.aBoolean75 = true;
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("80041, " + 269 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method202() {
		try {
			this.method112();
			if (this.anInt392 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array7[this.anInt391 / 100].method406(this.anInt389 - 8 - 4, this.anInt390 - 8 - 4);
			}
			if (this.anInt392 == 2) {
				this.aClass1_Sub1_Sub2_Sub2Array7[this.anInt391 / 100 + 4].method406(this.anInt389 - 8 - 4, this.anInt390 - 8 - 4);
				anInt395++;
				if (anInt395 > 57) {
					anInt395 = 0;
					this.aClass1_Sub1_Sub3_4.method487(100);
				}
			}
			if (this.anInt415 != -1) {
				this.method138(this.anInt372, this.anInt415);
				this.method113(anInt347, 0, Class6.aClass6Array1[this.anInt415], 0, 0);
			}
			if (this.anInt399 != -1) {
				this.method138(this.anInt372, this.anInt399);
				this.method113(anInt347, 0, Class6.aClass6Array1[this.anInt399], 0, 0);
			}
			this.method204();
			if (!this.aBoolean63) {
				this.method105();
				this.method129();
			} else if (this.anInt249 == 0) {
				this.method215();
			}
			if (this.anInt317 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array5[1].method406(472, 296);
			}
			if (this.anInt363 != 0) {
				@Pc(157) int local157 = this.anInt363 / 50;
				@Pc(161) int local161 = local157 / 60;
				@Pc(165) int local165 = local157 % 60;
				if (local165 < 10) {
					this.aClass1_Sub1_Sub2_Sub4_2.method468(16776960, 4, 329, this.anInt405, "System update in: " + local161 + ":0" + local165);
				} else {
					this.aClass1_Sub1_Sub2_Sub4_2.method468(16776960, 4, 329, this.anInt405, "System update in: " + local161 + ":" + local165);
				}
			}
		} catch (@Pc(209) RuntimeException local209) {
			signlink.reporterror("77944, " + 864 + ", " + local209.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method203() {
		try {
			if (this.anInt363 > 1) {
				this.anInt363--;
			}
			if (this.anInt353 > 0) {
				this.anInt353--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method123(); local22++) {
			}
			if (this.aBoolean46) {
				@Pc(41) Object local41 = this.aClass11_1.anObject1;
				@Pc(66) int local66;
				@Pc(68) int local68;
				@Pc(70) int local70;
				@Pc(103) int local103;
				synchronized (this.aClass11_1.anObject1) {
					if (!aBoolean66) {
						this.aClass11_1.anInt563 = 0;
					} else if (super.anInt235 != 0 || this.aClass11_1.anInt563 >= 40) {
						this.aClass1_Sub1_Sub3_4.method487(232);
						this.aClass1_Sub1_Sub3_4.method488(0);
						local66 = this.aClass1_Sub1_Sub3_4.anInt777;
						local68 = 0;
						@Pc(86) int local86;
						for (local70 = 0; local70 < this.aClass11_1.anInt563 && local66 - this.aClass1_Sub1_Sub3_4.anInt777 < 240; local70++) {
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
							if (local103 != this.anInt370 || local86 != this.anInt371) {
								@Pc(165) int local165 = local103 - this.anInt370;
								this.anInt370 = local103;
								@Pc(173) int local173 = local86 - this.anInt371;
								this.anInt371 = local86;
								if (this.anInt425 < 8 && local165 >= -32 && local165 <= 31 && local173 >= -32 && local173 <= 31) {
									local165 += 32;
									local173 += 32;
									this.aClass1_Sub1_Sub3_4.method489((this.anInt425 << 12) + (local165 << 6) + local173);
									this.anInt425 = 0;
								} else if (this.anInt425 < 8) {
									this.aClass1_Sub1_Sub3_4.method491((this.anInt425 << 19) + local120 + 8388608);
									this.anInt425 = 0;
								} else {
									this.aClass1_Sub1_Sub3_4.method492((this.anInt425 << 19) + local120 - 1073741824);
									this.anInt425 = 0;
								}
							} else if (this.anInt425 < 2047) {
								this.anInt425++;
							}
						}
						this.aClass1_Sub1_Sub3_4.method497(this.aClass1_Sub1_Sub3_4.anInt777 - local66);
						if (local68 >= this.aClass11_1.anInt563) {
							this.aClass11_1.anInt563 = 0;
						} else {
							this.aClass11_1.anInt563 -= local68;
							for (local86 = 0; local86 < this.aClass11_1.anInt563; local86++) {
								this.aClass11_1.anIntArray162[local86] = this.aClass11_1.anIntArray162[local86 + local68];
								this.aClass11_1.anIntArray163[local86] = this.aClass11_1.anIntArray163[local86 + local68];
							}
						}
					}
				}
				if (super.anInt235 != 0) {
					@Pc(336) long local336 = (super.aLong13 - this.aLong15) / 50L;
					if (local336 > 4095L) {
						local336 = 4095L;
					}
					this.aLong15 = super.aLong13;
					local66 = super.anInt237;
					if (local66 < 0) {
						local66 = 0;
					} else if (local66 > 502) {
						local66 = 502;
					}
					local68 = super.anInt236;
					if (local68 < 0) {
						local68 = 0;
					} else if (local68 > 764) {
						local68 = 764;
					}
					local70 = local66 * 765 + local68;
					@Pc(382) byte local382 = 0;
					if (super.anInt235 == 2) {
						local382 = 1;
					}
					local103 = (int) local336;
					this.aClass1_Sub1_Sub3_4.method487(234);
					this.aClass1_Sub1_Sub3_4.method492((local103 << 20) + (local382 << 19) + local70);
				}
				if (this.anInt330 > 0) {
					this.anInt330--;
				}
				if (super.anIntArray32[1] == 1 || super.anIntArray32[2] == 1 || super.anIntArray32[3] == 1 || super.anIntArray32[4] == 1) {
					this.aBoolean62 = true;
				}
				if (this.aBoolean62 && this.anInt330 <= 0) {
					this.anInt330 = 20;
					this.aBoolean62 = false;
					this.aClass1_Sub1_Sub3_4.method487(91);
					this.aClass1_Sub1_Sub3_4.method489(this.anInt266);
					this.aClass1_Sub1_Sub3_4.method489(this.anInt267);
				}
				if (super.aBoolean42 && !this.aBoolean82) {
					this.aBoolean82 = true;
					this.aClass1_Sub1_Sub3_4.method487(8);
					this.aClass1_Sub1_Sub3_4.method488(1);
				}
				if (!super.aBoolean42 && this.aBoolean82) {
					this.aBoolean82 = false;
					this.aClass1_Sub1_Sub3_4.method487(8);
					this.aClass1_Sub1_Sub3_4.method488(0);
				}
				this.method102();
				this.method101();
				this.method141();
				@Pc(523) Class1_Sub1_Sub3 local523 = Class10.method268();
				if (local523 != null) {
					this.aClass1_Sub1_Sub3_4.method487(142);
					this.aClass1_Sub1_Sub3_4.method489(local523.anInt777);
					this.aClass1_Sub1_Sub3_4.method496(local523.aByteArray9, local523.anInt777);
					local523.method486();
				}
				this.anInt351++;
				if (this.anInt351 > 750) {
					this.method228(this.anInt341);
				}
				this.method187();
				this.method173();
				this.method128();
				this.anInt372++;
				this.anInt349 += 0;
				if (this.anInt392 != 0) {
					this.anInt391 += 20;
					if (this.anInt391 >= 400) {
						this.anInt392 = 0;
					}
				}
				if (this.anInt258 != 0) {
					this.anInt255++;
					if (this.anInt255 >= 15) {
						if (this.anInt258 == 2) {
							this.aBoolean44 = true;
						}
						if (this.anInt258 == 3) {
							this.aBoolean79 = true;
						}
						this.anInt258 = 0;
					}
				}
				if (this.anInt325 != 0) {
					this.anInt265++;
					if (super.anInt230 > this.anInt326 + 5 || super.anInt230 < this.anInt326 - 5 || super.anInt231 > this.anInt327 + 5 || super.anInt231 < this.anInt327 - 5) {
						this.aBoolean64 = true;
					}
					if (super.anInt229 == 0) {
						if (this.anInt325 == 2) {
							this.aBoolean44 = true;
						}
						if (this.anInt325 == 3) {
							this.aBoolean79 = true;
						}
						this.anInt325 = 0;
						if (this.aBoolean64 && this.anInt265 >= 5) {
							this.anInt401 = -1;
							this.method105();
							if (this.anInt401 == this.anInt323 && this.anInt400 != this.anInt324) {
								@Pc(716) Class6 local716 = Class6.aClass6Array1[this.anInt323];
								@Pc(718) byte local718 = 0;
								if (this.anInt398 == 1 && local716.anInt460 == 206) {
									local718 = 1;
								}
								if (local716.anIntArray96[this.anInt400] <= 0) {
									local718 = 0;
								}
								if (local716.aBoolean97) {
									local68 = this.anInt324;
									local70 = this.anInt400;
									local716.anIntArray96[local70] = local716.anIntArray96[local68];
									local716.anIntArray97[local70] = local716.anIntArray97[local68];
									local716.anIntArray96[local68] = -1;
									local716.anIntArray97[local68] = 0;
								} else if (local718 == 1) {
									local68 = this.anInt324;
									local70 = this.anInt400;
									while (local68 != local70) {
										if (local68 > local70) {
											local716.method231(local68 - 1, local68);
											local68--;
										} else if (local68 < local70) {
											local716.method231(local68 + 1, local68);
											local68++;
										}
									}
								} else {
									local716.method231(this.anInt400, this.anInt324);
								}
								this.aClass1_Sub1_Sub3_4.method487(176);
								this.aClass1_Sub1_Sub3_4.method489(this.anInt323);
								this.aClass1_Sub1_Sub3_4.method489(this.anInt324);
								this.aClass1_Sub1_Sub3_4.method489(this.anInt400);
								this.aClass1_Sub1_Sub3_4.method488(local718);
							}
						} else if ((this.anInt387 == 1 || this.method191(this.anInt299 - 1)) && this.anInt299 > 2) {
							this.method160();
						} else if (this.anInt299 > 0) {
							this.method100((byte) 7, this.anInt299 - 1);
						}
						this.anInt255 = 10;
						super.anInt235 = 0;
					}
				}
				anInt430++;
				if (anInt430 > 62) {
					anInt430 = 0;
					this.aClass1_Sub1_Sub3_4.method487(182);
				}
				@Pc(902) int local902;
				if (Class39.anInt907 != -1) {
					local902 = Class39.anInt907;
					local66 = Class39.anInt908;
					@Pc(925) boolean local925 = this.method155(0, 0, 0, local902, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], local66, true, 0, 0);
					Class39.anInt907 = -1;
					if (local925) {
						this.anInt389 = super.anInt236;
						this.anInt390 = super.anInt237;
						this.anInt392 = 1;
						this.anInt391 = 0;
					}
				}
				if (super.anInt235 == 1 && this.aString18 != null) {
					this.aString18 = null;
					this.aBoolean79 = true;
					super.anInt235 = 0;
				}
				this.method185(this.anInt354);
				this.method169((byte) 8);
				this.method134();
				this.method229();
				if (super.anInt229 == 1 || super.anInt235 == 1) {
					this.anInt321++;
				}
				if (this.anInt301 == 2) {
					this.method108();
				}
				if (this.anInt301 == 2 && this.aBoolean60) {
					this.method162(this.anInt369);
				}
				for (local902 = 0; local902 < 5; local902++) {
					@Pc(1013) int local1013 = this.anIntArray64[local902]++;
				}
				this.method131();
				super.anInt228++;
				if (super.anInt228 > 4500) {
					this.anInt353 = 250;
					super.anInt228 -= 500;
					this.aClass1_Sub1_Sub3_4.method487(144);
				}
				this.anInt286++;
				if (this.anInt286 > 500) {
					this.anInt286 = 0;
					local66 = (int) (Math.random() * 8.0D);
					if ((local66 & 0x1) == 1) {
						this.anInt411 += this.anInt412;
					}
					if ((local66 & 0x2) == 2) {
						this.anInt276 += this.anInt277;
					}
					if ((local66 & 0x4) == 4) {
						this.anInt358 += this.anInt359;
					}
				}
				if (this.anInt411 < -50) {
					this.anInt412 = 2;
				}
				if (this.anInt411 > 50) {
					this.anInt412 = -2;
				}
				if (this.anInt276 < -55) {
					this.anInt277 = 2;
				}
				if (this.anInt276 > 55) {
					this.anInt277 = -2;
				}
				if (this.anInt358 < -40) {
					this.anInt359 = 1;
				}
				if (this.anInt358 > 40) {
					this.anInt359 = -1;
				}
				this.anInt360++;
				if (this.anInt360 > 500) {
					this.anInt360 = 0;
					local66 = (int) (Math.random() * 8.0D);
					if ((local66 & 0x1) == 1) {
						this.anInt279 += this.anInt280;
					}
					if ((local66 & 0x2) == 2) {
						this.anInt315 += this.anInt316;
					}
				}
				if (this.anInt279 < -60) {
					this.anInt280 = 2;
				}
				if (this.anInt279 > 60) {
					this.anInt280 = -2;
				}
				if (this.anInt315 < -20) {
					this.anInt316 = 1;
				}
				if (this.anInt315 > 10) {
					this.anInt316 = -1;
				}
				this.anInt352++;
				if (this.anInt352 > 50) {
					this.aClass1_Sub1_Sub3_4.method487(239);
				}
				try {
					if (this.aClass8_1 != null && this.aClass1_Sub1_Sub3_4.anInt777 > 0) {
						this.aClass8_1.method248(this.aClass1_Sub1_Sub3_4.aByteArray9, this.aClass1_Sub1_Sub3_4.anInt777);
						this.aClass1_Sub1_Sub3_4.anInt777 = 0;
						this.anInt352 = 0;
					}
				} catch (@Pc(1255) IOException local1255) {
					this.method228(this.anInt341);
				} catch (@Pc(1261) Exception local1261) {
					this.method146();
				}
			}
		} catch (@Pc(1266) RuntimeException local1266) {
			signlink.reporterror("30356, " + 0 + ", " + local1266.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method204() {
		try {
			this.anInt362 = 0;
			@Pc(15) int local15 = (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt127 >> 7) + this.anInt381;
			@Pc(23) int local23 = (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 >> 7) + this.anInt382;
			if (local15 >= 3053 && local15 <= 3156 && local23 >= 3056 && local23 <= 3136) {
				this.anInt362 = 1;
			}
			if (local15 >= 3072 && local15 <= 3118 && local23 >= 9492 && local23 <= 9535) {
				this.anInt362 = 1;
			}
			if (this.anInt362 == 1 && local15 >= 3139 && local15 <= 3199 && local23 >= 3008 && local23 <= 3062) {
				this.anInt362 = 0;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("79655, " + 0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method205() {
		try {
			this.aClass37_6.method538((byte) 9);
			Class1_Sub1_Sub2_Sub1.anIntArray185 = this.anIntArray87;
			this.aClass1_Sub1_Sub2_Sub3_11.method445(0, 0);
			if (this.aBoolean81) {
				this.aClass1_Sub1_Sub2_Sub4_3.method465(40, this.aString15, 239, 0);
				this.aClass1_Sub1_Sub2_Sub4_3.method465(60, this.aString17 + "*", 239, 128);
			} else if (this.aBoolean85) {
				this.aClass1_Sub1_Sub2_Sub4_3.method465(40, "Enter amount:", 239, 0);
				this.aClass1_Sub1_Sub2_Sub4_3.method465(60, this.aString16 + "*", 239, 128);
			} else if (this.aString18 != null) {
				this.aClass1_Sub1_Sub2_Sub4_3.method465(40, this.aString18, 239, 0);
				this.aClass1_Sub1_Sub2_Sub4_3.method465(60, "Click to continue", 239, 128);
			} else if (this.anInt413 != -1) {
				this.method113(anInt347, 0, Class6.aClass6Array1[this.anInt413], 0, 0);
			} else if (this.anInt283 == -1) {
				@Pc(130) Class1_Sub1_Sub2_Sub4 local130 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(132) int local132 = 0;
				Class1_Sub1_Sub2.method455(463, 0, 77, 0);
				for (@Pc(140) int local140 = 0; local140 < 100; local140++) {
					if (this.aStringArray2[local140] != null) {
						@Pc(152) int local152 = this.anIntArray44[local140];
						@Pc(161) int local161 = this.anInt314 + 70 - local132 * 14;
						@Pc(166) String local166 = this.aStringArray1[local140];
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
								local130.method468(0, 4, local161, this.anInt405, this.aStringArray2[local140]);
							}
							local132++;
						}
						@Pc(239) int local239;
						if ((local152 == 1 || local152 == 2) && (local152 == 1 || this.anInt422 == 0 || this.anInt422 == 1 && this.method115(local166))) {
							if (local161 > 0 && local161 < 110) {
								local239 = 4;
								if (local168 == 1) {
									this.aClass1_Sub1_Sub2_Sub3Array4[0].method445(4, local161 - 12);
									local239 += 14;
								}
								if (local168 == 2) {
									this.aClass1_Sub1_Sub2_Sub3Array4[1].method445(local239, local161 - 12);
									local239 += 14;
								}
								local130.method468(0, local239, local161, this.anInt405, local166 + ":");
								local239 += local130.method467(local166) + 8;
								local130.method468(255, local239, local161, this.anInt405, this.aStringArray2[local140]);
							}
							local132++;
						}
						if ((local152 == 3 || local152 == 7) && this.anInt313 == 0 && (local152 == 7 || this.anInt444 == 0 || this.anInt444 == 1 && this.method115(local166))) {
							if (local161 > 0 && local161 < 110) {
								local130.method468(0, 4, local161, this.anInt405, "From");
								local239 = local130.method467("From ") + 4;
								if (local168 == 1) {
									this.aClass1_Sub1_Sub2_Sub3Array4[0].method445(local239, local161 - 12);
									local239 += 14;
								}
								if (local168 == 2) {
									this.aClass1_Sub1_Sub2_Sub3Array4[1].method445(local239, local161 - 12);
									local239 += 14;
								}
								local130.method468(0, local239, local161, this.anInt405, local166 + ":");
								local239 += local130.method467(local166) + 8;
								local130.method468(8388608, local239, local161, this.anInt405, this.aStringArray2[local140]);
							}
							local132++;
						}
						if (local152 == 4 && (this.anInt410 == 0 || this.anInt410 == 1 && this.method115(local166))) {
							if (local161 > 0 && local161 < 110) {
								local130.method468(8388736, 4, local161, this.anInt405, local166 + " " + this.aStringArray2[local140]);
							}
							local132++;
						}
						if (local152 == 5 && this.anInt313 == 0 && this.anInt444 < 2) {
							if (local161 > 0 && local161 < 110) {
								local130.method468(8388608, 4, local161, this.anInt405, this.aStringArray2[local140]);
							}
							local132++;
						}
						if (local152 == 6 && this.anInt313 == 0 && this.anInt444 < 2) {
							if (local161 > 0 && local161 < 110) {
								local130.method468(0, 4, local161, this.anInt405, "To " + local166 + ":");
								local130.method468(8388608, local130.method467("To " + local166) + 12, local161, this.anInt405, this.aStringArray2[local140]);
							}
							local132++;
						}
						if (local152 == 8 && (this.anInt410 == 0 || this.anInt410 == 1 && this.method115(local166))) {
							if (local161 > 0 && local161 < 110) {
								local130.method468(8270336, 4, local161, this.anInt405, local166 + " " + this.aStringArray2[local140]);
							}
							local132++;
						}
					}
				}
				Class1_Sub1_Sub2.method454();
				this.anInt393 = local132 * 14 + 7;
				if (this.anInt393 < 78) {
					this.anInt393 = 78;
				}
				this.method145(this.anInt427, 77, this.anInt393, 463, this.anInt393 - this.anInt314 - 77, 0);
				@Pc(620) String local620;
				if (aClass1_Sub1_Sub1_Sub1_Sub2_1 == null || aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4 == null) {
					local620 = Class49.method683(this.aString10);
				} else {
					local620 = aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4;
				}
				local130.method468(0, 4, 90, this.anInt405, local620 + ":");
				local130.method468(255, local130.method467(local620 + ": ") + 6, 90, this.anInt405, this.aString14 + "*");
				Class1_Sub1_Sub2.method461(0, 77, 0, 479);
			} else {
				this.method113(anInt347, 0, Class6.aClass6Array1[this.anInt283], 0, 0);
			}
			if (this.aBoolean63 && this.anInt249 == 2) {
				this.method215();
			}
			this.aClass37_6.method539(357, 17, super.aGraphics2);
			this.aClass37_5.method538((byte) 9);
			Class1_Sub1_Sub2_Sub1.anIntArray185 = this.anIntArray89;
		} catch (@Pc(706) RuntimeException local706) {
			signlink.reporterror("93410, " + 0 + ", " + local706.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method206() {
		try {
			@Pc(6) Class1_Sub1_Sub1_Sub6 local6 = (Class1_Sub1_Sub1_Sub6) this.aClass31_1.method523();
			if (this.anInt361 != 9) {
				this.anInt403 = -452;
			}
			while (local6 != null) {
				if (local6.anInt568 != this.anInt278 || local6.aBoolean140) {
					local6.method669();
				} else if (anInt426 >= local6.anInt567) {
					local6.method317(this.anInt372);
					if (local6.aBoolean140) {
						local6.method669();
					} else {
						this.aClass39_1.method555(0, -1, 60, local6.anInt569, local6, local6.anInt571, local6.anInt568, false, local6.anInt570);
					}
				}
				local6 = (Class1_Sub1_Sub1_Sub6) this.aClass31_1.method525();
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("27163, " + 9 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method207() {
		try {
			this.anInt303++;
			this.method195(true);
			this.method144(true);
			this.method195(false);
			this.method144(false);
			this.method226(112);
			this.method206();
			@Pc(35) int local35;
			@Pc(74) int local74;
			if (!this.aBoolean60) {
				local35 = this.anInt266;
				if (this.anInt339 / 256 > local35) {
					local35 = this.anInt339 / 256;
				}
				if (this.aBooleanArray5[4] && this.anIntArray81[4] + 128 > local35) {
					local35 = this.anIntArray81[4] + 128;
				}
				local74 = this.anInt267 + this.anInt358 & 0x7FF;
				this.method192(local35, this.anInt328, this.method137(aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128, this.anInt278, aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt127) - 50, this.anInt329, local35 * 3 + 600, local74);
			}
			if (this.aBoolean60) {
				local35 = this.method149(this.aBoolean72);
			} else {
				local35 = this.method148();
			}
			local74 = this.anInt271;
			@Pc(119) int local119 = this.anInt272;
			@Pc(122) int local122 = this.anInt273;
			@Pc(125) int local125 = this.anInt274;
			@Pc(128) int local128 = this.anInt275;
			@Pc(177) int local177;
			for (@Pc(130) int local130 = 0; local130 < 5; local130++) {
				if (this.aBooleanArray5[local130]) {
					local177 = (int) (Math.random() * (double) (this.anIntArray46[local130] * 2 + 1) - (double) this.anIntArray46[local130] + Math.sin((double) this.anIntArray64[local130] * ((double) this.anIntArray52[local130] / 100.0D)) * (double) this.anIntArray81[local130]);
					if (local130 == 0) {
						this.anInt271 += local177;
					}
					if (local130 == 1) {
						this.anInt272 += local177;
					}
					if (local130 == 2) {
						this.anInt273 += local177;
					}
					if (local130 == 3) {
						this.anInt275 = this.anInt275 + local177 & 0x7FF;
					}
					if (local130 == 4) {
						this.anInt274 += local177;
						if (this.anInt274 < 128) {
							this.anInt274 = 128;
						}
						if (this.anInt274 > 383) {
							this.anInt274 = 383;
						}
					}
				}
			}
			local177 = Class1_Sub1_Sub2_Sub1.anInt665;
			Class1_Sub1_Sub1_Sub5.aBoolean134 = true;
			Class1_Sub1_Sub1_Sub5.anInt561 = 0;
			Class1_Sub1_Sub1_Sub5.anInt559 = super.anInt230 - 4;
			Class1_Sub1_Sub1_Sub5.anInt560 = super.anInt231 - 4;
			Class1_Sub1_Sub2.method456();
			this.aClass39_1.method583(this.anInt271, this.anInt273, this.anInt274, this.anInt272, local35, this.anInt275);
			this.aClass39_1.method558();
			this.method224();
			this.method166(336);
			this.method161(local177);
			this.method202();
			this.aClass37_5.method539(4, 4, super.aGraphics2);
			this.anInt271 = local74;
			this.anInt272 = local119;
			this.anInt273 = local122;
			this.anInt274 = local125;
			this.anInt275 = local128;
		} catch (@Pc(318) RuntimeException local318) {
			signlink.reporterror("17289, " + 0 + ", " + local318.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ[B)V")
	private void method208(@OriginalArg(1) boolean arg0, @OriginalArg(2) byte[] arg1) {
		try {
			signlink.anInt935 = arg0 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("22302, " + -434 + ", " + arg0 + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIBIIIIII)V")
	private void method209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			@Pc(3) Class1_Sub2 local3 = null;
			for (@Pc(8) Class1_Sub2 local8 = (Class1_Sub2) this.aClass31_3.method523(); local8 != null; local8 = (Class1_Sub2) this.aClass31_3.method525()) {
				if (local8.anInt822 == arg0 && local8.anInt824 == arg1 && local8.anInt825 == arg8 && local8.anInt823 == arg6) {
					local3 = local8;
					break;
				}
			}
			if (local3 == null) {
				local3 = new Class1_Sub2();
				local3.anInt822 = arg0;
				local3.anInt823 = arg6;
				local3.anInt824 = arg1;
				local3.anInt825 = arg8;
				this.method121(341, local3);
				this.aClass31_3.method520(local3);
			}
			local3.anInt829 = arg4;
			local3.anInt831 = arg5;
			@Pc(74) boolean local74 = false;
			local3.anInt830 = arg9;
			local3.anInt832 = arg2;
			local3.anInt833 = arg7;
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("84325, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean61) {
			this.method190();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
	private void method212() {
		try {
			this.aBoolean88 = false;
			while (this.aBoolean65) {
				this.aBoolean88 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass1_Sub1_Sub2_Sub3_14 = null;
			this.aClass1_Sub1_Sub2_Sub3_15 = null;
			this.aClass1_Sub1_Sub2_Sub3Array3 = null;
			this.anIntArray91 = null;
			this.anIntArray92 = null;
			this.anIntArray93 = null;
			this.anIntArray94 = null;
			this.anIntArray47 = null;
			this.anIntArray48 = null;
			this.anIntArray68 = null;
			this.anIntArray69 = null;
			this.aClass1_Sub1_Sub2_Sub2_7 = null;
			this.aClass1_Sub1_Sub2_Sub2_8 = null;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("40560, " + 9 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!d;)I")
	private int method213(@OriginalArg(0) int arg0, @OriginalArg(2) Class6 arg1) {
		try {
			if (arg1.anIntArrayArray6 == null || arg0 >= arg1.anIntArrayArray6.length) {
				return -2;
			}
			try {
				@Pc(22) int[] local22 = arg1.anIntArrayArray6[arg0];
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
						local35 = this.anIntArray65[local22[local26++]];
					}
					if (local33 == 2) {
						local35 = this.anIntArray70[local22[local26++]];
					}
					if (local33 == 3) {
						local35 = this.anIntArray85[local22[local26++]];
					}
					@Pc(84) Class6 local84;
					@Pc(89) int local89;
					@Pc(102) int local102;
					if (local33 == 4) {
						local84 = Class6.aClass6Array1[local22[local26++]];
						local89 = local22[local26++];
						if (local89 >= 0 && local89 < Class15.anInt610 && (!Class15.method345(local89).aBoolean153 || aBoolean47)) {
							for (local102 = 0; local102 < local84.anIntArray96.length; local102++) {
								if (local84.anIntArray96[local102] == local89 + 1) {
									local35 += local84.anIntArray97[local102];
								}
							}
						}
					}
					if (local33 == 5) {
						local35 = this.anIntArray41[local22[local26++]];
					}
					if (local33 == 6) {
						local35 = anIntArray73[this.anIntArray70[local22[local26++]] - 1];
					}
					if (local33 == 7) {
						local35 = this.anIntArray41[local22[local26++]] * 100 / 46875;
					}
					if (local33 == 8) {
						local35 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt176;
					}
					@Pc(177) int local177;
					if (local33 == 9) {
						for (local177 = 0; local177 < Class29.anInt834; local177++) {
							if (Class29.aBooleanArray10[local177]) {
								local35 += this.anIntArray70[local177];
							}
						}
					}
					if (local33 == 10) {
						local84 = Class6.aClass6Array1[local22[local26++]];
						local89 = local22[local26++] + 1;
						if (local89 >= 0 && local89 < Class15.anInt610 && (!Class15.method345(local89).aBoolean153 || aBoolean47)) {
							for (local102 = 0; local102 < local84.anIntArray96.length; local102++) {
								if (local84.anIntArray96[local102] == local89) {
									local35 = 999999999;
									break;
								}
							}
						}
					}
					if (local33 == 11) {
						local35 = this.anInt307;
					}
					if (local33 == 12) {
						local35 = this.anInt340;
					}
					if (local33 == 13) {
						local177 = this.anIntArray41[local22[local26++]];
						local89 = local22[local26++];
						local35 = (local177 & 0x1 << local89) == 0 ? 0 : 1;
					}
					if (local33 == 14) {
						local177 = local22[local26++];
						@Pc(292) Class35 local292 = Class35.aClass35Array1[local177];
						local102 = local292.anInt864;
						@Pc(298) int local298 = local292.anInt865;
						@Pc(301) int local301 = local292.anInt866;
						@Pc(307) int local307 = anIntArray72[local301 - local298];
						local35 = this.anIntArray41[local102] >> local298 & local307;
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
						local35 = (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt127 >> 7) + this.anInt381;
					}
					if (local33 == 19) {
						local35 = (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt128 >> 7) + this.anInt382;
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
			signlink.reporterror("32775, " + arg0 + ", " + -10666 + ", " + arg1 + ", " + local403.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIZI)V")
	private void method214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg6 >= 1 && arg3 >= 1 && arg6 <= 102 && arg3 <= 102) {
				if (aBoolean48 && arg0 != this.anInt278) {
					return;
				}
				@Pc(25) int local25 = 0;
				if (arg4 == 0) {
					local25 = this.aClass39_1.method570(arg0, arg6, arg3);
				}
				if (arg4 == 1) {
					local25 = this.aClass39_1.method571(arg6, arg0, arg3);
				}
				if (arg4 == 2) {
					local25 = this.aClass39_1.method572(arg0, arg6, arg3);
				}
				if (arg4 == 3) {
					local25 = this.aClass39_1.method573(arg0, arg6, arg3);
				}
				@Pc(81) int local81;
				if (local25 != 0) {
					local81 = this.aClass39_1.method574(arg0, arg6, arg3, local25);
					@Pc(87) int local87 = local25 >> 14 & 0x7FFF;
					@Pc(91) int local91 = local81 & 0x1F;
					@Pc(95) int local95 = local81 >> 6;
					@Pc(107) Class9 local107;
					if (arg4 == 0) {
						this.aClass39_1.method561(arg6, arg0, arg3);
						local107 = Class9.method258(local87);
						if (local107.aBoolean115) {
							this.aClass19Array1[arg0].method419(local91, this.aByte11, arg6, local95, arg3, local107.aBoolean116);
						}
					}
					if (arg4 == 1) {
						this.aClass39_1.method562(arg6, arg3, arg0);
					}
					if (arg4 == 2) {
						this.aClass39_1.method563(arg3, arg6, arg0);
						local107 = Class9.method258(local87);
						if (arg6 + local107.anInt519 > 103 || arg3 + local107.anInt519 > 103 || arg6 + local107.anInt520 > 103 || arg3 + local107.anInt520 > 103) {
							return;
						}
						if (local107.aBoolean115) {
							this.aClass19Array1[arg0].method420(local107.aBoolean116, local107.anInt519, arg3, local107.anInt520, local95, arg6);
						}
					}
					if (arg4 == 3) {
						this.aClass39_1.method564(arg0, arg3, arg6);
						local107 = Class9.method258(local87);
						if (local107.aBoolean115 && local107.aBoolean117) {
							this.aClass19Array1[arg0].method422(arg3, arg6);
						}
					}
				}
				if (arg2 >= 0) {
					local81 = arg0;
					if (arg0 < 3 && (this.aByteArrayArrayArray7[1][arg6][arg3] & 0x2) == 2) {
						local81 = arg0 + 1;
					}
					Class4.method74(arg1, arg6, this.aClass19Array1[arg0], arg3, arg5, arg2, this.aClass39_1, this.anIntArrayArrayArray3, local81, arg0);
					return;
				}
			}
		} catch (@Pc(255) RuntimeException local255) {
			signlink.reporterror("22987, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + false + ", " + arg6 + ", " + local255.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method215() {
		try {
			@Pc(4) int local4 = this.anInt250;
			@Pc(7) int local7 = this.anInt251;
			@Pc(10) int local10 = this.anInt252;
			@Pc(13) int local13 = this.anInt253;
			Class1_Sub1_Sub2.method458(local13, local10, local4, local7, (byte) 3, 6116423);
			Class1_Sub1_Sub2.method458(16, local10 - 2, local4 + 1, local7 + 1, (byte) 3, 0);
			Class1_Sub1_Sub2.method459(0, local10 - 2, local7 + 18, local4 + 1, local13 - 19);
			this.aClass1_Sub1_Sub2_Sub4_3.method468(6116423, local4 + 3, local7 + 14, this.anInt405, "Choose Option");
			@Pc(66) int local66 = super.anInt230;
			@Pc(69) int local69 = super.anInt231;
			if (this.anInt249 == 0) {
				local66 -= 4;
				local69 -= 4;
			}
			if (this.anInt249 == 1) {
				local66 -= 553;
				local69 -= 205;
			}
			if (this.anInt249 == 2) {
				local66 -= 17;
				local69 -= 357;
			}
			for (@Pc(98) int local98 = 0; local98 < this.anInt299; local98++) {
				@Pc(113) int local113 = local7 + (this.anInt299 - 1 - local98) * 15 + 31;
				@Pc(115) int local115 = 16777215;
				if (local66 > local4 && local66 < local4 + local10 && local69 > local113 - 13 && local69 < local113 + 3) {
					local115 = 16776960;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method470(true, this.aStringArray4[local98], local113, local115, local4 + 3);
			}
		} catch (@Pc(156) RuntimeException local156) {
			signlink.reporterror("18218, " + -122 + ", " + local156.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!mb;II)V")
	private void method216(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt364 = 0;
			this.anInt334 = 0;
			this.method133(arg1, arg0);
			this.method186(arg0, arg1, 832);
			this.method218(arg1, arg0);
			this.method164(arg0, arg1);
			@Pc(36) int local36;
			for (@Pc(29) int local29 = 0; local29 < this.anInt364; local29++) {
				local36 = this.anIntArray67[local29];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local36].anInt167 != anInt426) {
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local36] = null;
				}
			}
			if (arg0.anInt777 != arg1) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.anInt777 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local36 = 0; local36 < this.anInt333; local36++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray62[local36]] == null) {
					signlink.reporterror(this.aString10 + " null entry in pl list - pos:" + local36 + " size:" + this.anInt333);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("92924, " + arg0 + ", " + 493 + ", " + arg1 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)Ljava/lang/String;")
	private String method217() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("45084, " + -785 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!mb;)V")
	private void method218(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt778 + 10 < arg0 * 8) {
					@Pc(12) int local12 = arg1.method509(11);
					if (local12 != 2047) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12] = new Class1_Sub1_Sub1_Sub1_Sub2();
							if (this.aClass1_Sub1_Sub3Array1[local12] != null) {
								this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12].method51(this.aClass1_Sub1_Sub3Array1[local12]);
							}
						}
						this.anIntArray62[this.anInt333++] = local12;
						@Pc(58) Class1_Sub1_Sub1_Sub1_Sub2 local58 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12];
						local58.anInt167 = anInt426;
						@Pc(66) int local66 = arg1.method509(5);
						if (local66 > 15) {
							local66 -= 32;
						}
						@Pc(75) int local75 = arg1.method509(5);
						if (local75 > 15) {
							local75 -= 32;
						}
						@Pc(84) int local84 = arg1.method509(1);
						local58.method46(aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0] + local75, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0] + local66, local84 == 1);
						@Pc(110) int local110 = arg1.method509(1);
						if (local110 == 1) {
							this.anIntArray63[this.anInt334++] = local12;
						}
						continue;
					}
				}
				arg1.method510();
				return;
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("7766, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method219() {
		try {
			@Pc(18) int local18;
			@Pc(25) int local25;
			if (this.anInt386 == 0) {
				local18 = super.anInt226 / 2 - 80;
				local25 = super.anInt227 / 2 + 20;
				local25 += 20;
				if (super.anInt235 == 1 && super.anInt236 >= local18 - 75 && super.anInt236 <= local18 + 75 && super.anInt237 >= local25 - 20 && super.anInt237 <= local25 + 20) {
					this.anInt386 = 3;
					this.anInt348 = 0;
				}
				local18 = super.anInt226 / 2 + 80;
				if (super.anInt235 == 1 && super.anInt236 >= local18 - 75 && super.anInt236 <= local18 + 75 && super.anInt237 >= local25 - 20 && super.anInt237 <= local25 + 20) {
					this.aString8 = "";
					this.aString9 = "Enter your username & password.";
					this.anInt386 = 2;
					this.anInt348 = 0;
				}
			} else if (this.anInt386 == 2) {
				local18 = super.anInt227 / 2 - 40;
				local18 += 30;
				local18 += 25;
				if (super.anInt235 == 1 && super.anInt237 >= local18 - 15 && super.anInt237 < local18) {
					this.anInt348 = 0;
				}
				local18 += 15;
				if (super.anInt235 == 1 && super.anInt237 >= local18 - 15 && super.anInt237 < local18) {
					this.anInt348 = 1;
				}
				local18 += 15;
				local25 = super.anInt226 / 2 - 80;
				@Pc(171) int local171 = super.anInt227 / 2 + 50;
				@Pc(172) int local172 = local171 + 20;
				if (super.anInt235 == 1 && super.anInt236 >= local25 - 75 && super.anInt236 <= local25 + 75 && super.anInt237 >= local172 - 20 && super.anInt237 <= local172 + 20) {
					this.method126(this.aString10, this.aString11, false);
					if (this.aBoolean46) {
						return;
					}
				}
				local25 = super.anInt226 / 2 + 80;
				if (super.anInt235 == 1 && super.anInt236 >= local25 - 75 && super.anInt236 <= local25 + 75 && super.anInt237 >= local172 - 20 && super.anInt237 <= local172 + 20) {
					this.anInt386 = 0;
					this.aString10 = "";
					this.aString11 = "";
				}
				while (true) {
					while (true) {
						@Pc(260) int local260 = this.method89(this.aByte13);
						if (local260 == -1) {
							return;
						}
						@Pc(265) boolean local265 = false;
						for (@Pc(267) int local267 = 0; local267 < aString6.length(); local267++) {
							if (local260 == aString6.charAt(local267)) {
								local265 = true;
								break;
							}
						}
						if (this.anInt348 == 0) {
							if (local260 == 8 && this.aString10.length() > 0) {
								this.aString10 = this.aString10.substring(0, this.aString10.length() - 1);
							}
							if (local260 == 9 || local260 == 10 || local260 == 13) {
								this.anInt348 = 1;
							}
							if (local265) {
								this.aString10 = this.aString10 + (char) local260;
							}
							if (this.aString10.length() > 12) {
								this.aString10 = this.aString10.substring(0, 12);
							}
						} else if (this.anInt348 == 1) {
							if (local260 == 8 && this.aString11.length() > 0) {
								this.aString11 = this.aString11.substring(0, this.aString11.length() - 1);
							}
							if (local260 == 9 || local260 == 10 || local260 == 13) {
								this.anInt348 = 0;
							}
							if (local265) {
								this.aString11 = this.aString11 + (char) local260;
							}
							if (this.aString11.length() > 20) {
								this.aString11 = this.aString11.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt386 == 3) {
				local18 = super.anInt226 / 2;
				local25 = super.anInt227 / 2 + 50;
				@Pc(424) int local424 = local25 + 20;
				if (super.anInt235 == 1 && super.anInt236 >= local18 - 75 && super.anInt236 <= local18 + 75 && super.anInt237 >= local424 - 20 && super.anInt237 <= local424 + 20) {
					this.anInt386 = 0;
					return;
				}
			}
		} catch (@Pc(457) RuntimeException local457) {
			signlink.reporterror("42713, " + 6 + ", " + local457.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method220() {
		try {
			@Pc(27) int local27;
			@Pc(55) int local55;
			@Pc(59) int local59;
			@Pc(68) int local68;
			@Pc(75) int local75;
			@Pc(138) int local138;
			@Pc(195) int local195;
			try {
				this.anInt449 = -1;
				this.aClass31_1.method527();
				this.aClass31_2.method527();
				Class1_Sub1_Sub2_Sub1.method373();
				this.method124();
				this.aClass39_1.method544();
				for (local27 = 0; local27 < 4; local27++) {
					this.aClass19Array1[local27].method414();
				}
				System.gc();
				@Pc(51) Class4 local51 = new Class4(this.aByteArrayArrayArray7, this.anIntArrayArrayArray3, 104, 2, 104);
				local55 = this.aByteArrayArray2.length;
				Class4.aBoolean33 = Class39.aBoolean224;
				for (local59 = 0; local59 < local55; local59++) {
					local68 = this.anIntArray77[local59] >> 8;
					local75 = this.anIntArray77[local59] & 0xFF;
					if (local68 == 33 && local75 >= 71 && local75 <= 73) {
						Class4.aBoolean33 = false;
					}
				}
				if (Class4.aBoolean33) {
					this.aClass39_1.method545(this.anInt278);
				} else {
					this.aClass39_1.method545(0);
				}
				this.aClass1_Sub1_Sub3_4.method487(239);
				@Pc(143) byte[] local143;
				for (local68 = 0; local68 < local55; local68++) {
					local75 = (this.anIntArray77[local68] >> 8) * 64 - this.anInt381;
					local138 = (this.anIntArray77[local68] & 0xFF) * 64 - this.anInt382;
					local143 = this.aByteArrayArray2[local68];
					if (local143 != null) {
						local51.method58(local75, (this.anInt379 - 6) * 8, local143, (this.anInt380 - 6) * 8, local138);
					}
				}
				for (local75 = 0; local75 < local55; local75++) {
					local138 = (this.anIntArray77[local75] >> 8) * 64 - this.anInt381;
					local195 = (this.anIntArray77[local75] & 0xFF) * 64 - this.anInt382;
					@Pc(200) byte[] local200 = this.aByteArrayArray2[local75];
					if (local200 == null && this.anInt380 < 800) {
						local51.method57(local138, local195);
					}
				}
				this.aClass1_Sub1_Sub3_4.method487(239);
				@Pc(245) int local245;
				for (local138 = 0; local138 < local55; local138++) {
					local143 = this.aByteArrayArray1[local138];
					if (local143 != null) {
						local245 = (this.anIntArray77[local138] >> 8) * 64 - this.anInt381;
						@Pc(257) int local257 = (this.anIntArray77[local138] & 0xFF) * 64 - this.anInt382;
						local51.method61(local257, this.aClass39_1, local245, local143, this.aClass19Array1, (byte) 2);
					}
				}
				this.aClass1_Sub1_Sub3_4.method487(239);
				local51.method63(this.aClass39_1, this.aClass19Array1);
				this.aClass37_5.method538((byte) 9);
				this.aClass1_Sub1_Sub3_4.method487(239);
				for (local195 = 0; local195 < 104; local195++) {
					for (local245 = 0; local245 < 104; local245++) {
						this.method196(local195, local245);
					}
				}
				this.method222(this.anInt302);
			} catch (@Pc(318) Exception local318) {
			}
			Class9.aClass42_4.method643();
			@Pc(332) int local332;
			if (aBoolean48 && signlink.aRandomAccessFile1 != null) {
				local27 = this.aClass45_Sub1_1.method650(0);
				for (local332 = 0; local332 < local27; local332++) {
					local55 = this.aClass45_Sub1_1.method655(local332);
					if ((local55 & 0x79) == 0) {
						Class1_Sub1_Sub1_Sub5.method287(local332);
					}
				}
			}
			System.gc();
			Class1_Sub1_Sub2_Sub1.method374();
			this.aClass45_Sub1_1.method661();
			local27 = (this.anInt379 - 6) / 8 - 1;
			local332 = (this.anInt379 + 6) / 8 + 1;
			local55 = (this.anInt380 - 6) / 8 - 1;
			local59 = (this.anInt380 + 6) / 8 + 1;
			if (this.aBoolean51) {
				local27 = 49;
				local332 = 50;
				local55 = 49;
				local59 = 50;
			}
			for (local68 = local27; local68 <= local332; local68++) {
				for (local75 = local55; local75 <= local59; local75++) {
					if (local68 == local27 || local68 == local332 || local75 == local55 || local75 == local59) {
						local138 = this.aClass45_Sub1_1.method652(local68, local75, 0, anInt312);
						if (local138 != -1) {
							this.aClass45_Sub1_1.method662(3, local138);
						}
						local195 = this.aClass45_Sub1_1.method652(local68, local75, 1, anInt312);
						if (local195 != -1) {
							this.aClass45_Sub1_1.method662(3, local195);
						}
					}
				}
			}
		} catch (@Pc(470) RuntimeException local470) {
			signlink.reporterror("2252, " + 6 + ", " + local470.toString());
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!kb;B)V")
	private void method221(@OriginalArg(0) Class1_Sub1_Sub2_Sub3 arg0, @OriginalArg(1) byte arg1) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray47.length; local5++) {
				this.anIntArray47[local5] = 0;
			}
			@Pc(30) int local30;
			for (@Pc(20) int local20 = 0; local20 < 5000; local20++) {
				local30 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray47[local30] = (int) (Math.random() * 256.0D);
			}
			@Pc(48) int local48;
			@Pc(52) int local52;
			@Pc(60) int local60;
			for (local30 = 0; local30 < 20; local30++) {
				for (local48 = 1; local48 < 255; local48++) {
					for (local52 = 1; local52 < 127; local52++) {
						local60 = local52 + (local48 << 7);
						this.anIntArray48[local60] = (this.anIntArray47[local60 - 1] + this.anIntArray47[local60 + 1] + this.anIntArray47[local60 - 128] + this.anIntArray47[local60 + 128]) / 4;
					}
				}
				@Pc(106) int[] local106 = this.anIntArray47;
				this.anIntArray47 = this.anIntArray48;
				this.anIntArray48 = local106;
			}
			@Pc(122) boolean local122 = false;
			if (arg0 != null) {
				local48 = 0;
				for (local52 = 0; local52 < arg0.anInt716; local52++) {
					for (local60 = 0; local60 < arg0.anInt715; local60++) {
						if (arg0.aByteArray7[local48++] != 0) {
							@Pc(156) int local156 = local60 + arg0.anInt717 + 16;
							@Pc(163) int local163 = local52 + arg0.anInt718 + 16;
							@Pc(169) int local169 = local156 + (local163 << 7);
							this.anIntArray47[local169] = 0;
						}
					}
				}
			}
		} catch (@Pc(186) RuntimeException local186) {
			signlink.reporterror("10757, " + arg0 + ", " + arg1 + ", " + local186.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
	private void method222(@OriginalArg(0) int arg0) {
		try {
			if (arg0 <= 0) {
				this.aClass31ArrayArrayArray1 = null;
			}
			for (@Pc(11) Class1_Sub2 local11 = (Class1_Sub2) this.aClass31_3.method523(); local11 != null; local11 = (Class1_Sub2) this.aClass31_3.method525()) {
				if (local11.anInt833 == -1) {
					local11.anInt832 = 0;
					this.method121(341, local11);
				} else {
					local11.method669();
				}
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("14420, " + arg0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!jb;III)V")
	private void method223(@OriginalArg(0) Class1_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(11) int local11 = arg1 * arg1 + arg2 * arg2;
			if (local11 > 4225 && local11 < 90000) {
				@Pc(25) int local25 = this.anInt267 + this.anInt279 & 0x7FF;
				@Pc(29) int local29 = Class1_Sub1_Sub1_Sub5.anIntArray158[local25];
				@Pc(33) int local33 = Class1_Sub1_Sub1_Sub5.anIntArray159[local25];
				@Pc(42) int local42 = local29 * 256 / (this.anInt315 + 256);
				@Pc(51) int local51 = local33 * 256 / (this.anInt315 + 256);
				@Pc(61) int local61 = arg2 * local42 + arg1 * local51 >> 16;
				@Pc(71) int local71 = arg2 * local51 - arg1 * local42 >> 16;
				@Pc(77) double local77 = Math.atan2((double) local61, (double) local71);
				@Pc(83) int local83 = (int) (Math.sin(local77) * 63.0D);
				@Pc(89) int local89 = (int) (Math.cos(local77) * 57.0D);
				this.aClass1_Sub1_Sub2_Sub2_13.method411(83 - local89 - 20, local83 + 94 + 4 - 10, local77);
			} else {
				this.method140(arg0, arg2, arg1);
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("26082, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "N", descriptor = "(I)V")
	private void method224() {
		try {
			this.anInt308 = 0;
			@Pc(53) int local53;
			@Pc(73) int local73;
			for (@Pc(6) int local6 = -1; local6 < this.anInt333 + this.anInt254; local6++) {
				@Pc(13) Class1_Sub1_Sub1_Sub1 local13;
				if (local6 == -1) {
					local13 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
				} else if (local6 < this.anInt333) {
					local13 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray62[local6]];
				} else {
					local13 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray42[local6 - this.anInt333]];
				}
				if (local13 != null && local13.method49()) {
					if (local6 >= this.anInt333) {
						@Pc(146) Class13 local146 = ((Class1_Sub1_Sub1_Sub1_Sub1) local13).aClass13_1;
						if (local146.anInt591 >= 0 && local146.anInt591 < this.aClass1_Sub1_Sub2_Sub2Array5.length) {
							this.method153(local13.anInt168 + 15, local13);
							if (this.anInt288 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array5[local146.anInt591].method406(this.anInt288 - 12, this.anInt289 - 30);
							}
						}
						if (this.anInt368 == 1 && this.anInt259 == this.anIntArray42[local6 - this.anInt333] && anInt426 % 20 < 10) {
							this.method153(local13.anInt168 + 15, local13);
							if (this.anInt288 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array5[2].method406(this.anInt288 - 12, this.anInt289 - 28);
							}
						}
					} else {
						local53 = 30;
						@Pc(56) Class1_Sub1_Sub1_Sub1_Sub2 local56 = (Class1_Sub1_Sub1_Sub1_Sub2) local13;
						if (local56.anInt175 != 0) {
							this.method153(local13.anInt168 + 15, local13);
							if (this.anInt288 > -1) {
								for (local73 = 0; local73 < 8; local73++) {
									if ((local56.anInt175 & 0x1 << local73) != 0) {
										this.aClass1_Sub1_Sub2_Sub2Array5[local73].method406(this.anInt288 - 12, this.anInt289 - local53);
										local53 -= 25;
									}
								}
							}
						}
						if (local6 >= 0 && this.anInt368 == 10 && this.anInt355 == this.anIntArray62[local6]) {
							this.method153(local13.anInt168 + 15, local13);
							if (this.anInt288 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array5[7].method406(this.anInt288 - 12, this.anInt289 - local53);
							}
						}
					}
					if (local13.aString3 != null && (local6 >= this.anInt333 || this.anInt422 == 0 || this.anInt422 == 3 || this.anInt422 == 1 && this.method115(((Class1_Sub1_Sub1_Sub1_Sub2) local13).aString4))) {
						this.method153(local13.anInt168, local13);
						if (this.anInt288 > -1 && this.anInt308 < this.anInt309) {
							this.anIntArray57[this.anInt308] = this.aClass1_Sub1_Sub2_Sub4_3.method467(local13.aString3) / 2;
							this.anIntArray56[this.anInt308] = this.aClass1_Sub1_Sub2_Sub4_3.anInt751;
							this.anIntArray54[this.anInt308] = this.anInt288;
							this.anIntArray55[this.anInt308] = this.anInt289;
							this.anIntArray58[this.anInt308] = local13.anInt139;
							this.anIntArray59[this.anInt308] = local13.anInt140;
							this.anIntArray60[this.anInt308] = local13.anInt138;
							this.aStringArray5[this.anInt308++] = local13.aString3;
							if (this.anInt335 == 0 && local13.anInt140 == 1) {
								this.anIntArray56[this.anInt308] += 10;
								this.anIntArray55[this.anInt308] += 5;
							}
							if (this.anInt335 == 0 && local13.anInt140 == 2) {
								this.anIntArray57[this.anInt308] = 60;
							}
						}
					}
					if (local13.anInt141 > anInt426) {
						this.method153(local13.anInt168 + 15, local13);
						if (this.anInt288 > -1) {
							local53 = local13.anInt142 * 30 / local13.anInt143;
							if (local53 > 30) {
								local53 = 30;
							}
							Class1_Sub1_Sub2.method458(5, local53, this.anInt288 - 15, this.anInt289 - 3, (byte) 3, 65280);
							Class1_Sub1_Sub2.method458(5, 30 - local53, this.anInt288 - 15 + local53, this.anInt289 - 3, (byte) 3, 16711680);
						}
					}
					for (local53 = 0; local53 < 4; local53++) {
						if (local13.anIntArray15[local53] > anInt426) {
							this.method153(local13.anInt168 / 2, local13);
							if (this.anInt288 > -1) {
								if (local53 == 1) {
									this.anInt289 -= 20;
								}
								if (local53 == 2) {
									this.anInt288 -= 15;
									this.anInt289 -= 10;
								}
								if (local53 == 3) {
									this.anInt288 += 15;
									this.anInt289 -= 10;
								}
								this.aClass1_Sub1_Sub2_Sub2Array4[local13.anIntArray14[local53]].method406(this.anInt288 - 12, this.anInt289 - 12);
								this.aClass1_Sub1_Sub2_Sub4_1.method465(this.anInt289 + 4, String.valueOf(local13.anIntArray13[local53]), this.anInt288, 0);
								this.aClass1_Sub1_Sub2_Sub4_1.method465(this.anInt289 + 3, String.valueOf(local13.anIntArray13[local53]), this.anInt288 - 1, 16777215);
							}
						}
					}
				}
			}
			this.anInt349 += 0;
			for (@Pc(564) int local564 = 0; local564 < this.anInt308; local564++) {
				local53 = this.anIntArray54[local564];
				@Pc(576) int local576 = this.anIntArray55[local564];
				local73 = this.anIntArray57[local564];
				@Pc(586) int local586 = this.anIntArray56[local564];
				@Pc(588) boolean local588 = true;
				while (local588) {
					local588 = false;
					for (@Pc(594) int local594 = 0; local594 < local564; local594++) {
						if (local576 + 2 > this.anIntArray55[local594] - this.anIntArray56[local594] && local576 - local586 < this.anIntArray55[local594] + 2 && local53 - local73 < this.anIntArray54[local594] + this.anIntArray57[local594] && local53 + local73 > this.anIntArray54[local594] - this.anIntArray57[local594] && this.anIntArray55[local594] - this.anIntArray56[local594] < local576) {
							local576 = this.anIntArray55[local594] - this.anIntArray56[local594];
							local588 = true;
						}
					}
				}
				this.anInt288 = this.anIntArray54[local564];
				this.anInt289 = this.anIntArray55[local564] = local576;
				@Pc(693) String local693 = this.aStringArray5[local564];
				if (this.anInt335 == 0) {
					@Pc(698) int local698 = 16776960;
					if (this.anIntArray58[local564] < 6) {
						local698 = this.anIntArray43[this.anIntArray58[local564]];
					}
					if (this.anIntArray58[local564] == 6) {
						local698 = this.anInt303 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray58[local564] == 7) {
						local698 = this.anInt303 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray58[local564] == 8) {
						local698 = this.anInt303 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(773) int local773;
					if (this.anIntArray58[local564] == 9) {
						local773 = 150 - this.anIntArray60[local564];
						if (local773 < 50) {
							local698 = local773 * 1280 + 16711680;
						} else if (local773 < 100) {
							local698 = 16776960 - (local773 - 50) * 327680;
						} else if (local773 < 150) {
							local698 = (local773 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray58[local564] == 10) {
						local773 = 150 - this.anIntArray60[local564];
						if (local773 < 50) {
							local698 = local773 * 5 + 16711680;
						} else if (local773 < 100) {
							local698 = 16711935 - (local773 - 50) * 327680;
						} else if (local773 < 150) {
							local698 = (local773 - 100) * 327680 + 255 - (local773 - 100) * 5;
						}
					}
					if (this.anIntArray58[local564] == 11) {
						local773 = 150 - this.anIntArray60[local564];
						if (local773 < 50) {
							local698 = 16777215 - local773 * 327685;
						} else if (local773 < 100) {
							local698 = (local773 - 50) * 327685 + 65280;
						} else if (local773 < 150) {
							local698 = 16777215 - (local773 - 100) * 327680;
						}
					}
					if (this.anIntArray59[local564] == 0) {
						this.aClass1_Sub1_Sub2_Sub4_3.method465(this.anInt289 + 1, local693, this.anInt288, 0);
						this.aClass1_Sub1_Sub2_Sub4_3.method465(this.anInt289, local693, this.anInt288, local698);
					}
					if (this.anIntArray59[local564] == 1) {
						this.aClass1_Sub1_Sub2_Sub4_3.method469(this.anInt303, 0, this.anInt288, local693, this.anInt289 + 1);
						this.aClass1_Sub1_Sub2_Sub4_3.method469(this.anInt303, local698, this.anInt288, local693, this.anInt289);
					}
					if (this.anIntArray59[local564] == 2) {
						local773 = this.aClass1_Sub1_Sub2_Sub4_3.method467(local693);
						@Pc(994) int local994 = (150 - this.anIntArray60[local564]) * (local773 + 100) / 150;
						Class1_Sub1_Sub2.method455(this.anInt288 + 50, this.anInt288 - 50, 334, 0);
						this.aClass1_Sub1_Sub2_Sub4_3.method468(0, this.anInt288 + 50 - local994, this.anInt289 + 1, this.anInt405, local693);
						this.aClass1_Sub1_Sub2_Sub4_3.method468(local698, this.anInt288 + 50 - local994, this.anInt289, this.anInt405, local693);
						Class1_Sub1_Sub2.method454();
					}
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method465(this.anInt289 + 1, local693, this.anInt288, 0);
					this.aClass1_Sub1_Sub2_Sub4_3.method465(this.anInt289, local693, this.anInt288, 16776960);
				}
			}
		} catch (@Pc(1071) RuntimeException local1071) {
			signlink.reporterror("24327, " + 0 + ", " + local1071.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "O", descriptor = "(I)V")
	private void method225() {
		try {
			this.aClass1_Sub1_Sub2_Sub3_14 = new Class1_Sub1_Sub2_Sub3(this.aClass48_1, "titlebox", 0);
			this.aClass1_Sub1_Sub2_Sub3_15 = new Class1_Sub1_Sub2_Sub3(this.aClass48_1, "titlebutton", 0);
			this.aClass1_Sub1_Sub2_Sub3Array3 = new Class1_Sub1_Sub2_Sub3[12];
			for (@Pc(30) int local30 = 0; local30 < 12; local30++) {
				this.aClass1_Sub1_Sub2_Sub3Array3[local30] = new Class1_Sub1_Sub2_Sub3(this.aClass48_1, "runes", local30);
			}
			this.aClass1_Sub1_Sub2_Sub2_7 = new Class1_Sub1_Sub2_Sub2(128, 265);
			this.aClass1_Sub1_Sub2_Sub2_8 = new Class1_Sub1_Sub2_Sub2(128, 265);
			for (@Pc(63) int local63 = 0; local63 < 33920; local63++) {
				this.aClass1_Sub1_Sub2_Sub2_7.anIntArray210[local63] = this.aClass37_13.anIntArray233[local63];
			}
			for (@Pc(81) int local81 = 0; local81 < 33920; local81++) {
				this.aClass1_Sub1_Sub2_Sub2_8.anIntArray210[local81] = this.aClass37_14.anIntArray233[local81];
			}
			this.anIntArray92 = new int[256];
			for (@Pc(103) int local103 = 0; local103 < 64; local103++) {
				this.anIntArray92[local103] = local103 * 262144;
			}
			for (@Pc(118) int local118 = 0; local118 < 64; local118++) {
				this.anIntArray92[local118 + 64] = local118 * 1024 + 16711680;
			}
			for (@Pc(137) int local137 = 0; local137 < 64; local137++) {
				this.anIntArray92[local137 + 128] = local137 * 4 + 16776960;
			}
			for (@Pc(156) int local156 = 0; local156 < 64; local156++) {
				this.anIntArray92[local156 + 192] = 16777215;
			}
			this.anIntArray93 = new int[256];
			for (@Pc(175) int local175 = 0; local175 < 64; local175++) {
				this.anIntArray93[local175] = local175 * 1024;
			}
			for (@Pc(190) int local190 = 0; local190 < 64; local190++) {
				this.anIntArray93[local190 + 64] = local190 * 4 + 65280;
			}
			for (@Pc(209) int local209 = 0; local209 < 64; local209++) {
				this.anIntArray93[local209 + 128] = local209 * 262144 + 65535;
			}
			for (@Pc(228) int local228 = 0; local228 < 64; local228++) {
				this.anIntArray93[local228 + 192] = 16777215;
			}
			this.anIntArray94 = new int[256];
			for (@Pc(247) int local247 = 0; local247 < 64; local247++) {
				this.anIntArray94[local247] = local247 * 4;
			}
			for (@Pc(262) int local262 = 0; local262 < 64; local262++) {
				this.anIntArray94[local262 + 64] = local262 * 262144 + 255;
			}
			for (@Pc(281) int local281 = 0; local281 < 64; local281++) {
				this.anIntArray94[local281 + 128] = local281 * 1024 + 16711935;
			}
			for (@Pc(300) int local300 = 0; local300 < 64; local300++) {
				this.anIntArray94[local300 + 192] = 16777215;
			}
			this.anIntArray91 = new int[256];
			this.anIntArray47 = new int[32768];
			this.anIntArray48 = new int[32768];
			this.method221(null, (byte) 1);
			this.anIntArray68 = new int[32768];
			this.anIntArray69 = new int[32768];
			this.method97((byte) 6, "Connecting to fileserver", 10);
			if (!this.aBoolean88) {
				this.aBoolean61 = true;
				this.aBoolean88 = true;
				this.method96(this, 2);
			}
		} catch (@Pc(357) RuntimeException local357) {
			signlink.reporterror("76167, " + -111 + ", " + local357.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "P", descriptor = "(I)V")
	private void method226(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			for (@Pc(10) Class1_Sub1_Sub1_Sub4 local10 = (Class1_Sub1_Sub1_Sub4) this.aClass31_2.method523(); local10 != null; local10 = (Class1_Sub1_Sub1_Sub4) this.aClass31_2.method525()) {
				if (local10.anInt502 != this.anInt278 || anInt426 > local10.anInt508) {
					local10.method669();
				} else if (anInt426 >= local10.anInt507) {
					if (local10.anInt511 > 0) {
						@Pc(40) Class1_Sub1_Sub1_Sub1_Sub1 local40 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local10.anInt511 - 1];
						if (local40 != null && local40.anInt127 >= 0 && local40.anInt127 < 13312 && local40.anInt128 >= 0 && local40.anInt128 < 13312) {
							local10.method254(local40.anInt128, this.method137(local40.anInt128, local10.anInt502, local40.anInt127) - local10.anInt506, local40.anInt127, anInt426);
						}
					}
					if (local10.anInt511 < 0) {
						@Pc(85) int local85 = -local10.anInt511 - 1;
						@Pc(91) Class1_Sub1_Sub1_Sub1_Sub2 local91;
						if (local85 == this.anInt409) {
							local91 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
						} else {
							local91 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local85];
						}
						if (local91 != null && local91.anInt127 >= 0 && local91.anInt127 < 13312 && local91.anInt128 >= 0 && local91.anInt128 < 13312) {
							local10.method254(local91.anInt128, this.method137(local91.anInt128, local10.anInt502, local91.anInt127) - local10.anInt506, local91.anInt127, anInt426);
						}
					}
					local10.method255(this.anInt372);
					this.aClass39_1.method555(local10.anInt512, -1, 60, (int) local10.aDouble1, local10, (int) local10.aDouble3, this.anInt278, false, (int) local10.aDouble2);
				}
			}
			anInt287++;
			if (anInt287 > 1174) {
				anInt287 = 0;
				this.aClass1_Sub1_Sub3_4.method487(51);
				this.aClass1_Sub1_Sub3_4.method488(0);
				@Pc(191) int local191 = this.aClass1_Sub1_Sub3_4.anInt777;
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
				this.aClass1_Sub1_Sub3_4.method497(this.aClass1_Sub1_Sub3_4.anInt777 - local191);
			}
		} catch (@Pc(265) RuntimeException local265) {
			signlink.reporterror("5276, " + arg0 + ", " + local265.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "(I)V")
	private void method228(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt353 > 0) {
				this.method146();
			} else {
				this.aClass37_5.method538((byte) 9);
				this.aClass1_Sub1_Sub2_Sub4_2.method465(144, "Connection lost", 257, 0);
				this.aClass1_Sub1_Sub2_Sub4_2.method465(143, "Connection lost", 256, 16777215);
				this.aClass1_Sub1_Sub2_Sub4_2.method465(159, "Please wait - attempting to reestablish", 257, 0);
				this.aClass1_Sub1_Sub2_Sub4_2.method465(158, "Please wait - attempting to reestablish", 256, 16777215);
				this.aClass37_5.method539(4, 4, super.aGraphics2);
				this.anInt290 = 0;
				if (arg0 != this.anInt305) {
					this.anInt350 = this.aClass1_Sub1_Sub3_3.method498();
				}
				@Pc(65) Class8 local65 = this.aClass8_1;
				this.aBoolean46 = false;
				this.method126(this.aString10, this.aString11, true);
				if (!this.aBoolean46) {
					this.method146();
				}
				try {
					local65.method244();
				} catch (@Pc(85) Exception local85) {
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("41544, " + arg0 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
	private void method229() {
		try {
			if (super.anInt235 == 1) {
				if (super.anInt236 >= 6 && super.anInt236 <= 106 && super.anInt237 >= 467 && super.anInt237 <= 499) {
					this.anInt422 = (this.anInt422 + 1) % 4;
					this.aBoolean49 = true;
					this.aBoolean79 = true;
					this.aClass1_Sub1_Sub3_4.method487(129);
					this.aClass1_Sub1_Sub3_4.method488(this.anInt422);
					this.aClass1_Sub1_Sub3_4.method488(this.anInt444);
					this.aClass1_Sub1_Sub3_4.method488(this.anInt410);
				}
				if (super.anInt236 >= 135 && super.anInt236 <= 235 && super.anInt237 >= 467 && super.anInt237 <= 499) {
					this.anInt444 = (this.anInt444 + 1) % 3;
					this.aBoolean49 = true;
					this.aBoolean79 = true;
					this.aClass1_Sub1_Sub3_4.method487(129);
					this.aClass1_Sub1_Sub3_4.method488(this.anInt422);
					this.aClass1_Sub1_Sub3_4.method488(this.anInt444);
					this.aClass1_Sub1_Sub3_4.method488(this.anInt410);
				}
				if (super.anInt236 >= 273 && super.anInt236 <= 373 && super.anInt237 >= 467 && super.anInt237 <= 499) {
					this.anInt410 = (this.anInt410 + 1) % 3;
					this.aBoolean49 = true;
					this.aBoolean79 = true;
					this.aClass1_Sub1_Sub3_4.method487(129);
					this.aClass1_Sub1_Sub3_4.method488(this.anInt422);
					this.aClass1_Sub1_Sub3_4.method488(this.anInt444);
					this.aClass1_Sub1_Sub3_4.method488(this.anInt410);
				}
				if (super.anInt236 >= 412 && super.anInt236 <= 512 && super.anInt237 >= 467 && super.anInt237 <= 499) {
					this.method109();
					this.aString12 = "";
					this.aBoolean86 = false;
					for (@Pc(184) int local184 = 0; local184 < Class6.aClass6Array1.length; local184++) {
						if (Class6.aClass6Array1[local184] != null && Class6.aClass6Array1[local184].anInt460 == 600) {
							this.anInt448 = this.anInt399 = Class6.aClass6Array1[local184].anInt457;
							return;
						}
					}
					return;
				}
			}
		} catch (@Pc(213) RuntimeException local213) {
			signlink.reporterror("69820, " + 66 + ", " + local213.toString());
			throw new RuntimeException();
		}
	}
}
