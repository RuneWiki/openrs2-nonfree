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

	@OriginalMember(owner = "client!client", name = "C", descriptor = "I")
	private static int anInt249;

	@OriginalMember(owner = "client!client", name = "J", descriptor = "I")
	public static int anInt251;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "Z")
	private static boolean aBoolean31;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "I")
	private static int anInt254;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
	private static int anInt258;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
	private static int anInt259;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
	private static int anInt261;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
	private static int anInt269;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private static int anInt272;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
	private static int anInt305;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "Z")
	private static boolean aBoolean42;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
	public static int anInt320;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "Lclient!bb;")
	public static Class1_Sub1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "I")
	private static int anInt339;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private static int anInt361;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
	private static int anInt389;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
	private static int anInt391;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "I")
	private static int anInt394;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "I")
	private static int anInt395;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "I")
	private static int anInt406;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "Z")
	private static boolean aBoolean62;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "I")
	private static int anInt409;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
	private static int anInt429;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
	private static int anInt434;

	@OriginalMember(owner = "client!client", name = "I", descriptor = "I")
	private static int anInt250 = 10;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "Z")
	private static boolean aBoolean30 = true;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "[I")
	private static int[] anIntArray31 = new int[99];

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "[[I")
	public static final int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "I")
	private static int anInt309;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "[I")
	public static final int[] anIntArray42;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
	private static int anInt402;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "Ljava/lang/String;")
	private static String aString15;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
	private static int anInt432;

	@OriginalMember(owner = "client!client", name = "E", descriptor = "J")
	private long aLong10;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "I")
	private int anInt252;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "I")
	private int anInt253;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "[I")
	private int[] anIntArray26;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "[I")
	private int[] anIntArray27;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	private int anInt255;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "I")
	private int anInt257;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	private int anInt260;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
	private int anInt262;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	private int anInt265;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
	private int anInt266;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	private int anInt267;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
	private int anInt268;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "Ljava/lang/String;")
	private String aString5;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
	private int anInt270;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
	private int anInt276;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
	private int anInt277;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "I")
	private int anInt279;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
	private int anInt280;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private int anInt281;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private int anInt283;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "I")
	private int anInt285;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
	private int anInt286;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "I")
	private int anInt287;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
	private int anInt288;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "Ljava/lang/String;")
	private String aString6;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt291;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
	private int anInt292;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "I")
	private int anInt293;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
	private int anInt294;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
	private int anInt295;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
	private int anInt296;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
	private int anInt297;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
	private int anInt298;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
	private int anInt299;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
	private int anInt300;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "I")
	private int anInt301;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
	private int anInt302;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
	private int anInt303;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
	private int anInt304;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "Lclient!rb;")
	private Class36 aClass36_3;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "Lclient!rb;")
	private Class36 aClass36_4;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "Lclient!rb;")
	private Class36 aClass36_5;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "Lclient!rb;")
	private Class36 aClass36_6;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "Lclient!rb;")
	private Class36 aClass36_7;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "Lclient!rb;")
	private Class36 aClass36_8;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "Lclient!rb;")
	private Class36 aClass36_9;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "Lclient!rb;")
	private Class36 aClass36_10;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "Lclient!rb;")
	private Class36 aClass36_11;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "Lclient!rb;")
	private Class36 aClass36_12;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "I")
	private int anInt306;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
	private int anInt307;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
	private int anInt308;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "Lclient!rb;")
	private Class36 aClass36_13;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "Lclient!rb;")
	private Class36 aClass36_14;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "Lclient!rb;")
	private Class36 aClass36_15;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "Lclient!vb;")
	private Class42_Sub1 aClass42_Sub1_1;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_1;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_2;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "Lclient!e;")
	private Class8 aClass8_1;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
	private int anInt310;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
	private int anInt311;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
	private int anInt312;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "I")
	private int anInt313;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
	private int anInt314;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "I")
	private int anInt315;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "I")
	private int anInt316;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
	private int anInt317;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_6;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_7;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
	private int anInt318;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
	private int anInt321;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
	private int anInt322;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_8;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_9;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "I")
	private int anInt323;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "I")
	private int anInt325;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "I")
	private int anInt326;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "I")
	private int anInt327;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "I")
	private int anInt328;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "I")
	private int anInt329;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
	private int anInt331;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
	private int anInt332;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "[I")
	private int[] anIntArray45;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "[I")
	private int[] anIntArray46;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "[I")
	private int[] anIntArray47;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "[I")
	private int[] anIntArray48;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "[I")
	private int[] anIntArray49;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_10;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_11;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_12;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "I")
	private int anInt333;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_1;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_2;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "I")
	private int anInt335;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "I")
	private int anInt336;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
	private int anInt337;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_6;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_7;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
	private int anInt341;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "I")
	private int anInt342;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "I")
	private int anInt343;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
	private int anInt344;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
	private int anInt345;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_8;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
	private int anInt346;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
	private int anInt349;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_13;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_14;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_15;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
	private int anInt350;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "Lclient!rb;")
	private Class36 aClass36_16;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "Lclient!rb;")
	private Class36 aClass36_17;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "Lclient!rb;")
	private Class36 aClass36_18;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "Lclient!rb;")
	private Class36 aClass36_19;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "Lclient!rb;")
	private Class36 aClass36_20;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "Lclient!rb;")
	private Class36 aClass36_21;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "Lclient!rb;")
	private Class36 aClass36_22;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "Lclient!rb;")
	private Class36 aClass36_23;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "Lclient!rb;")
	private Class36 aClass36_24;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
	private int anInt351;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
	private int anInt352;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private int anInt353;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private int anInt354;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "I")
	private int anInt355;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_9;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "I")
	private int anInt356;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_16;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_17;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_18;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_19;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_20;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "[[B")
	private byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
	private int anInt359;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
	private int anInt362;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
	private int anInt363;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private int anInt364;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "I")
	private int anInt365;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "I")
	private int anInt366;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "I")
	private int anInt367;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
	private int anInt368;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
	private int anInt369;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "Ljava/lang/String;")
	private String aString12;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
	private int anInt371;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
	private int anInt372;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
	private int anInt373;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
	private int anInt374;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
	private int anInt375;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "Lclient!rb;")
	private Class36 aClass36_25;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "Lclient!rb;")
	private Class36 aClass36_26;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "Lclient!rb;")
	private Class36 aClass36_27;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "Lclient!rb;")
	private Class36 aClass36_28;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "I")
	private int anInt377;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "J")
	private long aLong11;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "I")
	private int anInt378;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
	private int anInt379;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "I")
	private int anInt380;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
	private int anInt381;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "I")
	private int anInt382;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "I")
	private int anInt383;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
	private int anInt384;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
	private int anInt385;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
	private int anInt386;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private int anInt387;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
	private int anInt388;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
	private int anInt390;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
	private int anInt393;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
	private int anInt396;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_10;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_11;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "I")
	private int anInt397;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "I")
	private int anInt398;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "I")
	private int anInt399;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "I")
	private int anInt400;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "I")
	private int anInt401;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "I")
	private int anInt403;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "I")
	private int anInt404;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "J")
	private long aLong12;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "I")
	private int anInt407;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
	private int anInt410;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
	private int anInt411;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
	private int anInt412;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
	private int anInt413;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "I")
	private int anInt414;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
	private int anInt417;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "I")
	private int anInt418;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
	private int anInt420;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "[I")
	private int[] anIntArray73;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "[I")
	private int[] anIntArray74;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "[I")
	private int[] anIntArray75;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "I")
	private int anInt422;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
	private int anInt423;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "I")
	private int anInt424;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
	private int anInt425;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "I")
	private int anInt426;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "Lclient!yb;")
	private Class45 aClass45_1;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "I")
	private int anInt427;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "Lclient!xb;")
	private Class44 aClass44_1;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "Lclient!s;")
	private Class37 aClass37_1;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
	private int anInt435;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "I")
	private int anInt437;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
	private int anInt439;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
	private int anInt440;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
	private int anInt441;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "[Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array3;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
	private int anInt442;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "I")
	private int anInt443;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "I")
	private int anInt444;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "I")
	private int anInt445;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "I")
	private int anInt446;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "I")
	private int anInt447;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "[I")
	private int[] anIntArray80;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "[I")
	private int[] anIntArray81;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "[I")
	private int[] anIntArray82;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "[I")
	private int[] anIntArray83;

	@OriginalMember(owner = "client!client", name = "D", descriptor = "Z")
	private boolean aBoolean29 = false;

	@OriginalMember(owner = "client!client", name = "F", descriptor = "[I")
	private int[] anIntArray25 = new int[100];

	@OriginalMember(owner = "client!client", name = "G", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray1 = new String[100];

	@OriginalMember(owner = "client!client", name = "H", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray2 = new String[100];

	@OriginalMember(owner = "client!client", name = "N", descriptor = "Z")
	private boolean aBoolean32 = false;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray3 = new String[100];

	@OriginalMember(owner = "client!client", name = "P", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array3 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "B")
	private byte aByte2 = 0;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "Z")
	private boolean aBoolean33 = true;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "B")
	private byte aByte3 = 114;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "[I")
	private int[] anIntArray28 = new int[50];

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "Z")
	private boolean aBoolean34 = true;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "[I")
	private int[] anIntArray29 = new int[50];

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Z")
	private boolean aBoolean35 = false;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
	private int anInt256 = 5063219;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Z")
	private boolean aBoolean36 = false;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Lclient!pb;")
	private Class31 aClass31_1 = new Class31(-740);

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "[[I")
	private int[][] anIntArrayArray2 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "[Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array1 = new Class1_Sub1_Sub2_Sub3[50];

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "[I")
	private int[] anIntArray30 = new int[50];

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Z")
	private boolean aBoolean37 = false;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
	private int anInt263 = -1;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
	private int anInt264 = -1;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
	private int anInt271 = 1;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
	private int anInt273 = -281;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "Z")
	private boolean aBoolean38 = false;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
	private int anInt274 = -1;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "I")
	private int anInt275 = 7;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "[Z")
	private boolean[] aBooleanArray4 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "Z")
	private boolean aBoolean39 = false;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
	private int anInt278 = 2;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "Z")
	private boolean aBoolean40 = true;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
	private int anInt282 = -491;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "I")
	private int anInt284 = 2;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "Z")
	private boolean aBoolean41 = false;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "[I")
	private int[] anIntArray32 = new int[5];

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
	private int anInt289 = -1;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
	private int anInt290 = -1;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array4 = new Class1_Sub1_Sub2_Sub2[1000];

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "[I")
	private final int[] anIntArray33 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "[I")
	private int[] anIntArray34 = new int[151];

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "[I")
	private int[] anIntArray35 = new int[1000];

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "[I")
	private int[] anIntArray36 = new int[1000];

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "Ljava/lang/String;")
	private String aString7 = "";

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "[Lclient!wb;")
	public Class43[] aClass43Array1 = new Class43[5];

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "[I")
	private int[] anIntArray37 = new int[256];

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "[Lclient!ab;")
	private Class1_Sub1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1_Sub1Array1 = new Class1_Sub1_Sub1_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "[I")
	private int[] anIntArray38 = new int[8192];

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "Lclient!pb;")
	private Class31 aClass31_2 = new Class31(-740);

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "B")
	private byte aByte4 = 7;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "[I")
	private int[] anIntArray39 = new int[33];

	@OriginalMember(owner = "client!client", name = "id", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array5 = new Class1_Sub1_Sub2_Sub2[8];

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "[I")
	private int[] anIntArray40 = new int[100];

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "[I")
	private int[] anIntArray41 = new int[2000];

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "[[I")
	private int[][] anIntArrayArray4 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "Lclient!d;")
	private Class6 aClass6_1 = new Class6();

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "[[I")
	private int[][] anIntArrayArray5 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
	private int anInt319 = 668;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "[I")
	private int[] anIntArray43 = new int[33];

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "I")
	private int anInt324 = 2;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "B")
	private byte aByte5 = 26;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "[I")
	private int[] anIntArray44 = new int[50];

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
	private int anInt330 = 7;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "Ljava/lang/String;")
	private String aString8 = "";

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
	private int anInt334 = 883;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "[I")
	private int[] anIntArray50 = new int[5];

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
	private int anInt338 = 7759444;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "Z")
	private boolean aBoolean43 = false;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "[I")
	private int[] anIntArray51 = new int[5];

	@OriginalMember(owner = "client!client", name = "se", descriptor = "[[[Lclient!pb;")
	private Class31[][][] aClass31ArrayArrayArray1 = new Class31[4][104][104];

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array6 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "we", descriptor = "[I")
	private int[] anIntArray52 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
	private int anInt340 = -75;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "Ljava/lang/String;")
	private String aString9 = "";

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "Z")
	private boolean aBoolean44 = false;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "Z")
	private boolean aBoolean45 = false;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "[J")
	private long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
	private int anInt347 = 1;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "Z")
	private boolean aBoolean46 = false;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
	private int anInt348 = -1;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "[I")
	private int[] anIntArray53 = new int[1000];

	@OriginalMember(owner = "client!client", name = "df", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "[I")
	private int[] anIntArray54 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "[I")
	private int[] anIntArray55 = new int[50];

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "Z")
	private boolean aBoolean48 = false;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array7 = new Class1_Sub1_Sub2_Sub2[50];

	@OriginalMember(owner = "client!client", name = "of", descriptor = "[I")
	private int[] anIntArray56 = new int[500];

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "[I")
	private int[] anIntArray57 = new int[500];

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "[I")
	private int[] anIntArray58 = new int[500];

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "[I")
	private int[] anIntArray59 = new int[500];

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "I")
	private int anInt357 = 50;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "[I")
	private int[] anIntArray60 = new int[this.anInt357];

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "[I")
	private int[] anIntArray61 = new int[this.anInt357];

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "[I")
	private int[] anIntArray62 = new int[this.anInt357];

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "[I")
	private int[] anIntArray63 = new int[this.anInt357];

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "[I")
	private int[] anIntArray64 = new int[this.anInt357];

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "[I")
	private int[] anIntArray65 = new int[this.anInt357];

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "[I")
	private int[] anIntArray66 = new int[this.anInt357];

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray4 = new String[this.anInt357];

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
	private int anInt358 = -1;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "B")
	private byte aByte6 = 6;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "Z")
	private boolean aBoolean49 = true;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "[I")
	private int[] anIntArray67 = new int[151];

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "Ljava/lang/String;")
	private String aString10 = "";

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "Ljava/lang/String;")
	private String aString11 = "";

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
	private int anInt360 = 13841;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "Lclient!mb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_2 = Class1_Sub1_Sub3.method454();

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
	private int anInt370 = -1;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "[B")
	private byte[] aByteArray2 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "Z")
	private boolean aBoolean51 = false;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "[I")
	private int[] anIntArray68 = new int[5];

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "Z")
	private boolean aBoolean52 = false;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "Lclient!mb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_3 = Class1_Sub1_Sub3.method454();

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
	private int anInt376 = -1;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "Z")
	private boolean aBoolean53 = false;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "Z")
	private boolean aBoolean54 = false;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray5 = new String[500];

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "Z")
	private boolean aBoolean55 = false;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "Z")
	private boolean aBoolean56 = false;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "Z")
	private boolean aBoolean57 = false;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "Ljava/lang/String;")
	private String aString13 = "";

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "Ljava/lang/String;")
	private String aString14 = "";

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "I")
	private int anInt392 = 78;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "Z")
	private boolean aBoolean58 = true;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "Z")
	private boolean aBoolean59 = false;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "Z")
	public boolean aBoolean60 = false;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "[Lclient!ic;")
	private Class17[] aClass17Array1 = new Class17[4];

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "[I")
	private int[] anIntArray69 = new int[50];

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "Z")
	private boolean aBoolean61 = false;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "I")
	private int anInt408 = 3353893;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "Z")
	private boolean aBoolean63 = false;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "[I")
	private int[] anIntArray70 = new int[5];

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "Lclient!mb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_4 = Class1_Sub1_Sub3.method454();

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "I")
	private int anInt415 = 2048;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
	private int anInt416 = 2047;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "[Lclient!bb;")
	private Class1_Sub1_Sub1_Sub1_Sub2[] aClass1_Sub1_Sub1_Sub1_Sub2Array1 = new Class1_Sub1_Sub1_Sub1_Sub2[this.anInt415];

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "[I")
	private int[] anIntArray71 = new int[this.anInt415];

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "[I")
	private int[] anIntArray72 = new int[this.anInt415];

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "[Lclient!mb;")
	private Class1_Sub1_Sub3[] aClass1_Sub1_Sub3Array1 = new Class1_Sub1_Sub3[this.anInt415];

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "I")
	private int anInt419 = -1;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "Ljava/lang/String;")
	private String aString16 = "";

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "I")
	private int anInt421 = 281;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "Z")
	private boolean aBoolean64 = true;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
	private final int anInt428 = 100;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "[I")
	private int[] anIntArray76 = new int[100];

	@OriginalMember(owner = "client!client", name = "di", descriptor = "I")
	private int anInt430 = -1;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "Lclient!pb;")
	private Class31 aClass31_3 = new Class31(-740);

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "[I")
	private int[] anIntArray77 = new int[9];

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "Z")
	private boolean aBoolean65 = false;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "[Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array2 = new Class1_Sub1_Sub2_Sub3[13];

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "I")
	private int anInt431 = -1;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "[I")
	private int[] anIntArray78 = new int[2000];

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
	private int anInt433 = 2301979;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "[I")
	private int[] anIntArray79 = new int[7];

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!client", name = "si", descriptor = "Z")
	private boolean aBoolean66 = false;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "B")
	private byte aByte7 = 8;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
	private int anInt436 = 3;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
	private int anInt438 = 128;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "I")
	private int anInt448 = -203;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "Z")
	private boolean aBoolean67 = true;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "[I")
	private int[] anIntArray84 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "[I")
	private int[] anIntArray85 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
	private int anInt449 = -1;

	static {
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 99; local10++) {
			@Pc(15) int local15 = local10 + 1;
			@Pc(28) int local28 = (int) ((double) local15 + Math.pow(2.0D, (double) local15 / 7.0D) * 300.0D);
			local8 += local28;
			anIntArray31[local10] = local8 / 4;
		}
		anIntArrayArray3 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		anInt309 = -930;
		anIntArray42 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		anInt402 = -31142;
		aString15 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		anInt432 = -796;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Ljava/lang/String;")
	private static String method117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) int local3 = 54 / arg2;
			@Pc(7) int local7 = arg0 - arg1;
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
			signlink.reporterror("76295, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private static void method125() {
		try {
			Class37.aBoolean179 = true;
			Class1_Sub1_Sub2_Sub1.aBoolean125 = true;
			aBoolean31 = true;
			Class4.aBoolean20 = true;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("23343, " + -147 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)Ljava/lang/String;")
	private static String method167(@OriginalArg(1) int arg0) {
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
			signlink.reporterror("77970, " + 0 + ", " + arg0 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 234);
			if (arg0.length == 5) {
				anInt250 = Integer.parseInt(arg0[0]);
				anInt251 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method125();
				} else if (arg0[2].equals("highmem")) {
					method179();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean30 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean30 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt917 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method79();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private static void method179() {
		try {
			Class37.aBoolean179 = false;
			Class1_Sub1_Sub2_Sub1.aBoolean125 = false;
			aBoolean31 = false;
			Class4.aBoolean20 = false;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("81608, " + false + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(II)Ljava/lang/String;")
	private static String method198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("51247, " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method87(@OriginalArg(0) byte arg0) {
		try {
			if (this.aBoolean43 || this.aBoolean56 || this.aBoolean45) {
				this.method165();
			} else {
				anInt259++;
				if (this.aBoolean60) {
					this.method206();
				} else {
					this.method144();
				}
				this.anInt252 = 0;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("52310, " + 4 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZII)V")
	private void method92(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			signlink.anInt921 = arg1;
			this.anInt442 += arg2;
			if (arg0) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("96015, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local13.toString());
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
				return new URL("http://127.0.0.1:" + (anInt251 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!mb;Z)V")
	private void method93(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			this.anInt349 = 0;
			this.anInt418 = 0;
			this.method168(arg1, arg0, (byte) 4);
			this.method104(arg1, arg0);
			this.method98(this.aBoolean34, arg0, arg1);
			@Pc(42) int local42;
			for (@Pc(35) int local35 = 0; local35 < this.anInt349; local35++) {
				local42 = this.anIntArray53[local35];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local42].anInt177 != anInt320) {
					this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local42].aClass11_1 = null;
					this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local42] = null;
				}
			}
			if (arg1.anInt771 != arg0) {
				signlink.reporterror(this.aString13 + " size mismatch in getnpcpos - pos:" + arg1.anInt771 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local42 = 0; local42 < this.anInt299; local42++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray38[local42]] == null) {
					signlink.reporterror(this.aString13 + " null entry in npc list - pos:" + local42 + " size:" + this.anInt299);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("83923, " + arg0 + ", " + arg1 + ", " + false + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIIIIIBIIII)Z")
	private boolean method94(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray5[local7][local11] = 0;
					this.anIntArrayArray4[local7][local11] = 99999999;
				}
			}
			local11 = arg2;
			@Pc(39) int local39 = arg3;
			this.anIntArrayArray5[arg2][arg3] = 99;
			this.anIntArrayArray4[arg2][arg3] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			@Pc(62) boolean local62 = false;
			this.anIntArray84[0] = arg2;
			@Pc(77) int local77 = local55 + 1;
			this.anIntArray85[0] = arg3;
			@Pc(81) boolean local81 = false;
			@Pc(85) int local85 = this.anIntArray84.length;
			@Pc(92) int[][] local92 = this.aClass17Array1[this.anInt253].anIntArrayArray15;
			@Pc(203) int local203;
			while (local57 != local77) {
				local11 = this.anIntArray84[local57];
				local39 = this.anIntArray85[local57];
				local57 = (local57 + 1) % local85;
				if (local11 == arg9 && local39 == arg1) {
					local81 = true;
					break;
				}
				if (arg10 != 0) {
					if ((arg10 < 5 || arg10 == 10) && this.aClass17Array1[this.anInt253].method377(arg10 - 1, arg9, local39, arg1, local11, arg4)) {
						local81 = true;
						break;
					}
					if (arg10 < 10 && this.aClass17Array1[this.anInt253].method378(arg4, local39, arg9, local11, arg1, arg10 - 1)) {
						local81 = true;
						break;
					}
				}
				if (arg11 != 0 && arg8 != 0 && this.aClass17Array1[this.anInt253].method379(arg8, arg1, arg11, arg9, local11, arg5, local39)) {
					local81 = true;
					break;
				}
				local203 = this.anIntArrayArray4[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray5[local11 - 1][local39] == 0 && (local92[local11 - 1][local39] & 0x280108) == 0) {
					this.anIntArray84[local77] = local11 - 1;
					this.anIntArray85[local77] = local39;
					local77 = (local77 + 1) % local85;
					this.anIntArrayArray5[local11 - 1][local39] = 2;
					this.anIntArrayArray4[local11 - 1][local39] = local203;
				}
				if (local11 < 103 && this.anIntArrayArray5[local11 + 1][local39] == 0 && (local92[local11 + 1][local39] & 0x280180) == 0) {
					this.anIntArray84[local77] = local11 + 1;
					this.anIntArray85[local77] = local39;
					local77 = (local77 + 1) % local85;
					this.anIntArrayArray5[local11 + 1][local39] = 8;
					this.anIntArrayArray4[local11 + 1][local39] = local203;
				}
				if (local39 > 0 && this.anIntArrayArray5[local11][local39 - 1] == 0 && (local92[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray84[local77] = local11;
					this.anIntArray85[local77] = local39 - 1;
					local77 = (local77 + 1) % local85;
					this.anIntArrayArray5[local11][local39 - 1] = 1;
					this.anIntArrayArray4[local11][local39 - 1] = local203;
				}
				if (local39 < 103 && this.anIntArrayArray5[local11][local39 + 1] == 0 && (local92[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray84[local77] = local11;
					this.anIntArray85[local77] = local39 + 1;
					local77 = (local77 + 1) % local85;
					this.anIntArrayArray5[local11][local39 + 1] = 4;
					this.anIntArrayArray4[local11][local39 + 1] = local203;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray5[local11 - 1][local39 - 1] == 0 && (local92[local11 - 1][local39 - 1] & 0x28010E) == 0 && (local92[local11 - 1][local39] & 0x280108) == 0 && (local92[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray84[local77] = local11 - 1;
					this.anIntArray85[local77] = local39 - 1;
					local77 = (local77 + 1) % local85;
					this.anIntArrayArray5[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray4[local11 - 1][local39 - 1] = local203;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray5[local11 + 1][local39 - 1] == 0 && (local92[local11 + 1][local39 - 1] & 0x280183) == 0 && (local92[local11 + 1][local39] & 0x280180) == 0 && (local92[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray84[local77] = local11 + 1;
					this.anIntArray85[local77] = local39 - 1;
					local77 = (local77 + 1) % local85;
					this.anIntArrayArray5[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray4[local11 + 1][local39 - 1] = local203;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray5[local11 - 1][local39 + 1] == 0 && (local92[local11 - 1][local39 + 1] & 0x280138) == 0 && (local92[local11 - 1][local39] & 0x280108) == 0 && (local92[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray84[local77] = local11 - 1;
					this.anIntArray85[local77] = local39 + 1;
					local77 = (local77 + 1) % local85;
					this.anIntArrayArray5[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray4[local11 - 1][local39 + 1] = local203;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray5[local11 + 1][local39 + 1] == 0 && (local92[local11 + 1][local39 + 1] & 0x2801E0) == 0 && (local92[local11 + 1][local39] & 0x280180) == 0 && (local92[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray84[local77] = local11 + 1;
					this.anIntArray85[local77] = local39 + 1;
					local77 = (local77 + 1) % local85;
					this.anIntArrayArray5[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray4[local11 + 1][local39 + 1] = local203;
				}
			}
			this.anInt317 = 0;
			@Pc(819) int local819;
			@Pc(825) int local825;
			@Pc(831) int local831;
			if (!local81) {
				if (arg0) {
					local203 = 100;
					for (local819 = 1; local819 < 2; local819++) {
						for (local825 = arg9 - local819; local825 <= arg9 + local819; local825++) {
							for (local831 = arg1 - local819; local831 <= arg1 + local819; local831++) {
								if (local825 >= 0 && local831 >= 0 && local825 < 104 && local831 < 104 && this.anIntArrayArray4[local825][local831] < local203) {
									local203 = this.anIntArrayArray4[local825][local831];
									local11 = local825;
									local39 = local831;
									this.anInt317 = 1;
									local81 = true;
								}
							}
						}
						if (local81) {
							break;
						}
					}
				}
				if (!local81) {
					return false;
				}
			}
			@Pc(892) byte local892 = 0;
			this.anIntArray84[0] = local11;
			local57 = local892 + 1;
			this.anIntArray85[0] = local39;
			local203 = local819 = this.anIntArrayArray5[local11][local39];
			while (local11 != arg2 || local39 != arg3) {
				if (local203 != local819) {
					local819 = local203;
					this.anIntArray84[local57] = local11;
					this.anIntArray85[local57++] = local39;
				}
				if ((local203 & 0x2) != 0) {
					local11++;
				} else if ((local203 & 0x8) != 0) {
					local11--;
				}
				if ((local203 & 0x1) != 0) {
					local39++;
				} else if ((local203 & 0x4) != 0) {
					local39--;
				}
				local203 = this.anIntArrayArray5[local11][local39];
			}
			if (local57 > 0) {
				local85 = local57;
				if (local57 > 25) {
					local85 = 25;
				}
				local57--;
				local825 = this.anIntArray84[local57];
				local831 = this.anIntArray85[local57];
				if (arg6 == 0) {
					this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 222);
					this.aClass1_Sub1_Sub3_4.method457(local85 + local85 + 3);
				}
				if (arg6 == 1) {
					this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 201);
					this.aClass1_Sub1_Sub3_4.method457(local85 + local85 + 3 + 14);
				}
				if (arg6 == 2) {
					this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 140);
					this.aClass1_Sub1_Sub3_4.method457(local85 + local85 + 3);
				}
				if (super.anIntArray23[5] == 1) {
					this.aClass1_Sub1_Sub3_4.method457(1);
				} else {
					this.aClass1_Sub1_Sub3_4.method457(0);
				}
				this.aClass1_Sub1_Sub3_4.method458(local825 + this.anInt411);
				this.aClass1_Sub1_Sub3_4.method458(local831 + this.anInt412);
				this.anInt354 = this.anIntArray84[0];
				this.anInt355 = this.anIntArray85[0];
				for (@Pc(1083) int local1083 = 1; local1083 < local85; local1083++) {
					local57--;
					this.aClass1_Sub1_Sub3_4.method457(this.anIntArray84[local57] - local825);
					this.aClass1_Sub1_Sub3_4.method457(this.anIntArray85[local57] - local831);
				}
				return true;
			} else if (arg6 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1118) RuntimeException local1118) {
			signlink.reporterror("72242, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local1118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	private void method95() {
		try {
			if (this.anInt322 != 0) {
				@Pc(8) Class1_Sub1_Sub2_Sub4 local8 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(10) int local10 = 0;
				if (this.anInt318 != 0) {
					local10 = 1;
				}
				for (@Pc(30) int local30 = 0; local30 < 100; local30++) {
					if (this.aStringArray2[local30] != null) {
						@Pc(42) int local42 = this.anIntArray25[local30];
						@Pc(72) int local72;
						if ((local42 == 3 || local42 == 7) && (local42 == 7 || this.anInt385 == 0 || this.anInt385 == 1 && this.method132(this.aStringArray1[local30]))) {
							local72 = 329 - local10 * 13;
							local8.method443(4, "From " + this.aStringArray1[local30] + ": " + this.aStringArray2[local30], this.aBoolean32, 0, local72);
							local8.method443(4, "From " + this.aStringArray1[local30] + ": " + this.aStringArray2[local30], this.aBoolean32, 65535, local72 - 1);
							local10++;
							if (local10 >= 5) {
								return;
							}
						}
						if (local42 == 5 && this.anInt385 < 2) {
							local72 = 329 - local10 * 13;
							local8.method443(4, this.aStringArray2[local30], this.aBoolean32, 0, local72);
							local8.method443(4, this.aStringArray2[local30], this.aBoolean32, 65535, local72 - 1);
							local10++;
							if (local10 >= 5) {
								return;
							}
						}
						if (local42 == 6 && this.anInt385 < 2) {
							local72 = 329 - local10 * 13;
							local8.method443(4, "To " + this.aStringArray1[local30] + ": " + this.aStringArray2[local30], this.aBoolean32, 0, local72);
							local8.method443(4, "To " + this.aStringArray1[local30] + ": " + this.aStringArray2[local30], this.aBoolean32, 65535, local72 - 1);
							local10++;
							if (local10 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(243) RuntimeException local243) {
			signlink.reporterror("99542, " + 6 + ", " + local243.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	private void method96() {
		try {
			try {
				if (this.aClass8_1 != null) {
					this.aClass8_1.method235();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass8_1 = null;
			this.aBoolean60 = false;
			this.anInt307 = 0;
			this.aString13 = "";
			this.aString14 = "";
			Class10.method257();
			this.method220();
			this.aClass37_1.method549(this.anInt360);
			for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
				this.aClass17Array1[local42].method368();
			}
			System.gc();
			this.method221();
			this.anInt274 = -1;
			this.anInt276 = -1;
			this.anInt435 = 0;
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("94074, " + 2 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)Z")
	private boolean method97(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 == this.aByte7) {
				@Pc(7) boolean local7 = false;
			} else {
				for (@Pc(11) int local11 = 1; local11 > 0; local11++) {
				}
			}
			return signlink.wavereplay();
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("17761, " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILclient!mb;)V")
	private void method98(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt418; local1++) {
				@Pc(8) int local8 = this.anIntArray72[local1];
				@Pc(13) Class1_Sub1_Sub1_Sub1_Sub1 local13 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local8];
				@Pc(16) int local16 = arg2.method467();
				@Pc(24) int local24;
				if ((local16 & 0x2) == 2) {
					local24 = arg2.method469();
					if (local24 == 65535) {
						local24 = -1;
					}
					if (local24 == local13.anInt160) {
						local13.anInt164 = 0;
					}
					@Pc(39) int local39 = arg2.method467();
					if (local24 == -1 || local13.anInt160 == -1 || Class25.aClass25Array1[local24].anInt780 > Class25.aClass25Array1[local13.anInt160].anInt780 || Class25.aClass25Array1[local13.anInt160].anInt780 == 0) {
						local13.anInt160 = local24;
						local13.anInt161 = 0;
						local13.anInt162 = 0;
						local13.anInt163 = local39;
						local13.anInt164 = 0;
					}
				}
				if ((local16 & 0x4) == 4) {
					local13.anInt154 = arg2.method469();
					if (local13.anInt154 == 65535) {
						local13.anInt154 = -1;
					}
				}
				if ((local16 & 0x8) == 8) {
					local13.aString3 = arg2.method474();
					local13.anInt146 = 100;
				}
				if ((local16 & 0x10) == 16) {
					local13.anInt149 = arg2.method467();
					local13.anInt150 = arg2.method467();
					local13.anInt151 = anInt320 + 400;
					local13.anInt152 = arg2.method467();
					local13.anInt153 = arg2.method467();
				}
				if ((local16 & 0x20) == 32) {
					local13.aClass11_1 = Class11.method305(arg2.method469());
					local13.anInt141 = local13.aClass11_1.anInt566;
					local13.anInt142 = local13.aClass11_1.anInt567;
					local13.anInt143 = local13.aClass11_1.anInt568;
					local13.anInt144 = local13.aClass11_1.anInt569;
					local13.anInt139 = local13.aClass11_1.anInt565;
				}
				if ((local16 & 0x40) == 64) {
					local13.anInt165 = arg2.method469();
					local24 = arg2.method472();
					local13.anInt169 = local24 >> 16;
					local13.anInt168 = anInt320 + (local24 & 0xFFFF);
					local13.anInt166 = 0;
					local13.anInt167 = 0;
					if (local13.anInt168 > anInt320) {
						local13.anInt166 = -1;
					}
					if (local13.anInt165 == 65535) {
						local13.anInt165 = -1;
					}
				}
				if ((local16 & 0x80) == 128) {
					local13.anInt155 = arg2.method469();
					local13.anInt156 = arg2.method469();
				}
			}
			if (!arg0) {
				this.anInt443 = -1;
			}
		} catch (@Pc(235) RuntimeException local235) {
			signlink.reporterror("12376, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local235.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method99() {
		try {
			@Pc(6) int local6 = this.anInt300 * 128 + 64;
			@Pc(13) int local13 = this.anInt301 * 128 + 64;
			@Pc(26) int local26 = this.method177(this.anInt301, this.anInt300, this.anInt253) - this.anInt302;
			if (this.anInt293 < local6) {
				this.anInt293 += this.anInt303 + (local6 - this.anInt293) * this.anInt304 / 1000;
				if (this.anInt293 > local6) {
					this.anInt293 = local6;
				}
			}
			if (this.anInt293 > local6) {
				this.anInt293 -= this.anInt303 + (this.anInt293 - local6) * this.anInt304 / 1000;
				if (this.anInt293 < local6) {
					this.anInt293 = local6;
				}
			}
			if (this.anInt294 < local26) {
				this.anInt294 += this.anInt303 + (local26 - this.anInt294) * this.anInt304 / 1000;
				if (this.anInt294 > local26) {
					this.anInt294 = local26;
				}
			}
			if (this.anInt294 > local26) {
				this.anInt294 -= this.anInt303 + (this.anInt294 - local26) * this.anInt304 / 1000;
				if (this.anInt294 < local26) {
					this.anInt294 = local26;
				}
			}
			if (this.anInt295 < local13) {
				this.anInt295 += this.anInt303 + (local13 - this.anInt295) * this.anInt304 / 1000;
				if (this.anInt295 > local13) {
					this.anInt295 = local13;
				}
			}
			if (this.anInt295 > local13) {
				this.anInt295 -= this.anInt303 + (this.anInt295 - local13) * this.anInt304 / 1000;
				if (this.anInt295 < local13) {
					this.anInt295 = local13;
				}
			}
			local6 = this.anInt312 * 128 + 64;
			local13 = this.anInt313 * 128 + 64;
			local26 = this.method177(this.anInt313, this.anInt312, this.anInt253) - this.anInt314;
			@Pc(226) int local226 = local6 - this.anInt293;
			@Pc(231) int local231 = local26 - this.anInt294;
			@Pc(236) int local236 = local13 - this.anInt295;
			@Pc(247) int local247 = (int) Math.sqrt((double) (local226 * local226 + local236 * local236));
			this.anInt442 += 0;
			@Pc(264) int local264 = (int) (Math.atan2((double) local231, (double) local247) * 325.949D) & 0x7FF;
			@Pc(275) int local275 = (int) (Math.atan2((double) local226, (double) local236) * -325.949D) & 0x7FF;
			if (local264 < 128) {
				local264 = 128;
			}
			if (local264 > 383) {
				local264 = 383;
			}
			if (this.anInt296 < local264) {
				this.anInt296 += this.anInt315 + (local264 - this.anInt296) * this.anInt316 / 1000;
				if (this.anInt296 > local264) {
					this.anInt296 = local264;
				}
			}
			if (this.anInt296 > local264) {
				this.anInt296 -= this.anInt315 + (this.anInt296 - local264) * this.anInt316 / 1000;
				if (this.anInt296 < local264) {
					this.anInt296 = local264;
				}
			}
			@Pc(346) int local346 = local275 - this.anInt297;
			if (local346 > 1024) {
				local346 -= 2048;
			}
			if (local346 < -1024) {
				local346 += 2048;
			}
			if (local346 > 0) {
				this.anInt297 += this.anInt315 + local346 * this.anInt316 / 1000;
				this.anInt297 &= 0x7FF;
			}
			if (local346 < 0) {
				this.anInt297 -= this.anInt315 + -local346 * this.anInt316 / 1000;
				this.anInt297 &= 0x7FF;
			}
			@Pc(404) int local404 = local275 - this.anInt297;
			if (local404 > 1024) {
				local404 -= 2048;
			}
			if (local404 < -1024) {
				local404 += 2048;
			}
			if (local404 < 0 && local346 > 0 || local404 > 0 && local346 < 0) {
				this.anInt297 = local275;
			}
		} catch (@Pc(425) RuntimeException local425) {
			signlink.reporterror("32556, " + 0 + ", " + local425.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;I)Z")
	private boolean method100(@OriginalArg(0) Class6 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt457;
			if (local4 >= 1 && local4 <= 200) {
				if (local4 >= 101) {
					local4 -= 101;
				} else {
					local4--;
				}
				this.aStringArray5[this.anInt420] = "Remove @whi@" + this.aStringArray3[local4];
				this.anIntArray58[this.anInt420] = 557;
				this.anInt420++;
				this.aStringArray5[this.anInt420] = "Message @whi@" + this.aStringArray3[local4];
				this.anIntArray58[this.anInt420] = 679;
				this.anInt420++;
				return true;
			} else if (local4 >= 401 && local4 <= 500) {
				this.aStringArray5[this.anInt420] = "Remove @whi@" + arg0.aString18;
				this.anIntArray58[this.anInt420] = 556;
				this.anInt420++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("98156, " + arg0 + ", " + -626 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBIIII)V")
	private void method101(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass1_Sub1_Sub2_Sub3_1.method422(arg2, arg3, 373);
			this.aClass1_Sub1_Sub2_Sub3_2.method422(arg2, arg3 + arg4 - 16, 373);
			Class1_Sub1_Sub2.method436(arg2, 16, this.anInt433, arg4 - 32, arg3 + 16);
			@Pc(35) int local35 = (arg4 - 32) * arg4 / arg1;
			if (local35 < 8) {
				local35 = 8;
			}
			@Pc(52) int local52 = (arg4 - local35 - 32) * arg0 / (arg1 - arg4);
			Class1_Sub1_Sub2.method436(arg2, 16, this.anInt256, local35, arg3 + local52 + 16);
			Class1_Sub1_Sub2.method439(arg3 + local52 + 16, this.anInt338, arg2, local35);
			Class1_Sub1_Sub2.method439(arg3 + local52 + 16, this.anInt338, arg2 + 1, local35);
			Class1_Sub1_Sub2.method438(arg2, this.anInt338, 16, arg3 + local52 + 16);
			Class1_Sub1_Sub2.method438(arg2, this.anInt338, 16, arg3 + local52 + 17);
			Class1_Sub1_Sub2.method439(arg3 + local52 + 16, this.anInt408, arg2 + 15, local35);
			Class1_Sub1_Sub2.method439(arg3 + local52 + 17, this.anInt408, arg2 + 14, local35 - 1);
			Class1_Sub1_Sub2.method438(arg2, this.anInt408, 16, arg3 + local52 + local35 + 15);
			Class1_Sub1_Sub2.method438(arg2 + 1, this.anInt408, 15, arg3 + local52 + local35 + 14);
		} catch (@Pc(178) RuntimeException local178) {
			signlink.reporterror("62554, " + arg0 + ", " + -34 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local178.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class31 local9 = this.aClass31ArrayArrayArray1[this.anInt253][arg0][arg1];
		if (local9 == null) {
			this.aClass37_1.method570(this.anInt253, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub1_Sub1_Sub3 local23 = null;
		@Pc(27) Class1_Sub1_Sub1_Sub3 local27;
		for (local27 = (Class1_Sub1_Sub1_Sub3) local9.method497(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub3) local9.method499()) {
			@Pc(32) Class13 local32 = Class13.method316(local27.anInt485);
			@Pc(35) int local35 = local32.anInt601;
			if (local32.aBoolean114) {
				local35 *= local27.anInt486 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method495(local23);
		@Pc(65) Class1_Sub1_Sub1_Sub3 local65 = null;
		@Pc(67) Class1_Sub1_Sub1_Sub3 local67 = null;
		for (local27 = (Class1_Sub1_Sub1_Sub3) local9.method497(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub3) local9.method499()) {
			if (local27.anInt485 != local23.anInt485 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt485 != local23.anInt485 && local27.anInt485 != local65.anInt485 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass37_1.method556(local110, local65, arg0, arg1, this.anInt253, local67, this.method177(arg1 * 128 + 64, arg0 * 128 + 64, this.anInt253), local23);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!bb;III)V")
	private void method103(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub1_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg1 != aClass1_Sub1_Sub1_Sub1_Sub2_1 && this.anInt420 < 400) {
				@Pc(33) String local33 = arg1.aString4 + method117(aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt185, arg1.anInt185, this.anInt319) + " (level-" + arg1.anInt185 + ")";
				if (this.anInt285 == 1) {
					this.aStringArray5[this.anInt420] = "Use " + this.aString6 + " with @whi@" + local33;
					this.anIntArray58[this.anInt420] = 367;
					this.anIntArray59[this.anInt420] = arg2;
					this.anIntArray56[this.anInt420] = arg0;
					this.anIntArray57[this.anInt420] = arg3;
					this.anInt420++;
				} else if (this.anInt266 != 1) {
					this.aStringArray5[this.anInt420] = "Follow @whi@" + local33;
					this.anIntArray58[this.anInt420] = 1544;
					this.anIntArray59[this.anInt420] = arg2;
					this.anIntArray56[this.anInt420] = arg0;
					this.anIntArray57[this.anInt420] = arg3;
					this.anInt420++;
					if (this.anInt427 == 0) {
						this.aStringArray5[this.anInt420] = "Trade with @whi@" + local33;
						this.anIntArray58[this.anInt420] = 1373;
						this.anIntArray59[this.anInt420] = arg2;
						this.anIntArray56[this.anInt420] = arg0;
						this.anIntArray57[this.anInt420] = arg3;
						this.anInt420++;
					}
					if (this.anInt298 > 0) {
						this.aStringArray5[this.anInt420] = "Attack @whi@" + local33;
						if (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt185 >= arg1.anInt185) {
							this.anIntArray58[this.anInt420] = 151;
						} else {
							this.anIntArray58[this.anInt420] = 2151;
						}
						this.anIntArray59[this.anInt420] = arg2;
						this.anIntArray56[this.anInt420] = arg0;
						this.anIntArray57[this.anInt420] = arg3;
						this.anInt420++;
					}
					if (this.anInt403 == 1) {
						this.aStringArray5[this.anInt420] = "Fight @whi@" + local33;
						this.anIntArray58[this.anInt420] = 151;
						this.anIntArray59[this.anInt420] = arg2;
						this.anIntArray56[this.anInt420] = arg0;
						this.anIntArray57[this.anInt420] = arg3;
						this.anInt420++;
					}
					if (this.anInt403 == 2) {
						this.aStringArray5[this.anInt420] = "Duel-with @whi@" + local33;
						this.anIntArray58[this.anInt420] = 1101;
						this.anIntArray59[this.anInt420] = arg2;
						this.anIntArray56[this.anInt420] = arg0;
						this.anIntArray57[this.anInt420] = arg3;
						this.anInt420++;
					}
				} else if ((this.anInt268 & 0x8) == 8) {
					this.aStringArray5[this.anInt420] = this.aString5 + " @whi@" + local33;
					this.anIntArray58[this.anInt420] = 651;
					this.anIntArray59[this.anInt420] = arg2;
					this.anIntArray56[this.anInt420] = arg0;
					this.anIntArray57[this.anInt420] = arg3;
					this.anInt420++;
				}
				for (@Pc(383) int local383 = 0; local383 < this.anInt420; local383++) {
					if (this.anIntArray58[local383] == 660) {
						this.aStringArray5[local383] = "Walk here @whi@" + local33;
						break;
					}
				}
			}
		} catch (@Pc(416) RuntimeException local416) {
			signlink.reporterror("69439, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -431 + ", " + local416.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!mb;II)V")
	private void method104(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				if (arg0.anInt772 + 21 < arg1 * 8) {
					@Pc(19) int local19 = arg0.method478(13);
					if (local19 != 8191) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local19] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local19] = new Class1_Sub1_Sub1_Sub1_Sub1();
						}
						@Pc(39) Class1_Sub1_Sub1_Sub1_Sub1 local39 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local19];
						this.anIntArray38[this.anInt299++] = local19;
						local39.anInt177 = anInt320;
						local39.aClass11_1 = Class11.method305(arg0.method478(11));
						local39.anInt138 = local39.aClass11_1.aByte10;
						local39.anInt141 = local39.aClass11_1.anInt566;
						local39.anInt142 = local39.aClass11_1.anInt567;
						local39.anInt143 = local39.aClass11_1.anInt568;
						local39.anInt144 = local39.aClass11_1.anInt569;
						local39.anInt139 = local39.aClass11_1.anInt565;
						@Pc(95) int local95 = arg0.method478(5);
						if (local95 > 15) {
							local95 -= 32;
						}
						@Pc(104) int local104 = arg0.method478(5);
						if (local104 > 15) {
							local104 -= 32;
						}
						local39.method42(false, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0] + local104, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0] + local95);
						@Pc(129) int local129 = arg0.method478(1);
						if (local129 == 1) {
							this.anIntArray72[this.anInt418++] = local19;
						}
						continue;
					}
				}
				arg0.method479(this.anInt334);
				return;
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("43338, " + arg0 + ", " + 10091 + ", " + arg1 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!mb;Z)V")
	private void method105(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			this.aBoolean60 &= true;
			@Pc(16) int local16;
			@Pc(25) int local25;
			@Pc(32) int local32;
			@Pc(35) int local35;
			@Pc(39) int local39;
			@Pc(43) int local43;
			@Pc(48) int local48;
			@Pc(53) int local53;
			if (arg0 == 112 || arg0 == 31) {
				local16 = arg1.method467();
				local25 = this.anInt378 + (local16 >> 4 & 0x7);
				local32 = this.anInt379 + (local16 & 0x7);
				local35 = arg1.method467();
				local39 = local35 >> 2;
				local43 = local35 & 0x3;
				local48 = this.anIntArray33[local39];
				if (arg0 == 31) {
					local53 = -1;
				} else {
					local53 = arg1.method469();
				}
				if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
					this.method158(local32, this.anInt253, -1, local39, 0, local43, local53, local48, local25);
				}
			} else {
				@Pc(143) int local143;
				@Pc(155) int local155;
				@Pc(169) int local169;
				@Pc(181) int local181;
				if (arg0 == 230) {
					local16 = arg1.method467();
					local25 = this.anInt378 + (local16 >> 4 & 0x7);
					local32 = this.anInt379 + (local16 & 0x7);
					local35 = arg1.method467();
					local39 = local35 >> 2;
					local43 = local35 & 0x3;
					local48 = this.anIntArray33[local39];
					local53 = arg1.method469();
					if (local25 >= 0 && local32 >= 0 && local25 < 103 && local32 < 103) {
						local143 = this.anIntArrayArrayArray3[this.anInt253][local25][local32];
						local155 = this.anIntArrayArrayArray3[this.anInt253][local25 + 1][local32];
						local169 = this.anIntArrayArrayArray3[this.anInt253][local25 + 1][local32 + 1];
						local181 = this.anIntArrayArrayArray3[this.anInt253][local25][local32 + 1];
						if (local48 == 0) {
							@Pc(192) Class35 local192 = this.aClass37_1.method571(local25, local32, this.anInt253);
							if (local192 != null) {
								@Pc(201) int local201 = local192.anInt871 >> 14 & 0x7FFF;
								if (local39 == 2) {
									local192.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(local143, local43 + 4, 214, local155, local201, local169, local53, false, 2, local181);
									local192.aClass1_Sub1_Sub1_8 = new Class1_Sub1_Sub1_Sub2(local143, local43 + 1 & 0x3, 214, local155, local201, local169, local53, false, 2, local181);
								} else {
									local192.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(local143, local43, 214, local155, local201, local169, local53, false, local39, local181);
								}
							}
						}
						if (local48 == 1) {
							@Pc(270) Class16 local270 = this.aClass37_1.method572(local25, local32, this.anInt253, this.anInt331);
							if (local270 != null) {
								local270.aClass1_Sub1_Sub1_1 = new Class1_Sub1_Sub1_Sub2(local143, 0, 214, local155, local270.anInt634 >> 14 & 0x7FFF, local169, local53, false, 4, local181);
							}
						}
						if (local48 == 2) {
							@Pc(304) Class33 local304 = this.aClass37_1.method573(local25, this.anInt253, local32);
							if (local39 == 11) {
								local39 = 10;
							}
							if (local304 != null) {
								local304.aClass1_Sub1_Sub1_6 = new Class1_Sub1_Sub1_Sub2(local143, local43, 214, local155, local304.anInt864 >> 14 & 0x7FFF, local169, local53, false, local39, local181);
							}
						}
						if (local48 == 3) {
							@Pc(344) Class20 local344 = this.aClass37_1.method574(local25, this.anInt253, local32, this.aBoolean40);
							if (local344 != null) {
								local344.aClass1_Sub1_Sub1_2 = new Class1_Sub1_Sub1_Sub2(local143, local43, 214, local155, local344.anInt702 >> 14 & 0x7FFF, local169, local53, false, 22, local181);
							}
						}
					}
				} else {
					@Pc(409) Class1_Sub1_Sub1_Sub3 local409;
					if (arg0 == 167) {
						local16 = arg1.method467();
						local25 = this.anInt378 + (local16 >> 4 & 0x7);
						local32 = this.anInt379 + (local16 & 0x7);
						local35 = arg1.method469();
						local39 = arg1.method469();
						if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
							local409 = new Class1_Sub1_Sub1_Sub3();
							local409.anInt485 = local35;
							local409.anInt486 = local39;
							if (this.aClass31ArrayArrayArray1[this.anInt253][local25][local32] == null) {
								this.aClass31ArrayArrayArray1[this.anInt253][local25][local32] = new Class31(-740);
							}
							this.aClass31ArrayArrayArray1[this.anInt253][local25][local32].method494(local409);
							this.method102(local25, local32);
						}
					} else if (arg0 == 247) {
						local16 = arg1.method467();
						local25 = this.anInt378 + (local16 >> 4 & 0x7);
						local32 = this.anInt379 + (local16 & 0x7);
						local35 = arg1.method469();
						if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
							@Pc(499) Class31 local499 = this.aClass31ArrayArrayArray1[this.anInt253][local25][local32];
							if (local499 != null) {
								for (local409 = (Class1_Sub1_Sub1_Sub3) local499.method497(); local409 != null; local409 = (Class1_Sub1_Sub1_Sub3) local499.method499()) {
									if (local409.anInt485 == (local35 & 0x7FFF)) {
										local409.method630();
										break;
									}
								}
								if (local499.method497() == null) {
									this.aClass31ArrayArrayArray1[this.anInt253][local25][local32] = null;
								}
								this.method102(local25, local32);
							}
						}
					} else if (arg0 == 67) {
						local16 = arg1.method467();
						local25 = this.anInt378 + (local16 >> 4 & 0x7);
						local32 = this.anInt379 + (local16 & 0x7);
						local35 = local25 + arg1.method468();
						local39 = local32 + arg1.method468();
						local43 = arg1.method470();
						local48 = arg1.method469();
						local53 = arg1.method467();
						local143 = arg1.method467();
						local155 = arg1.method469();
						local169 = arg1.method469();
						local181 = arg1.method467();
						@Pc(598) int local598 = arg1.method467();
						if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104 && local35 >= 0 && local39 >= 0 && local35 < 104 && local39 < 104) {
							local25 = local25 * 128 + 64;
							local32 = local32 * 128 + 64;
							local35 = local35 * 128 + 64;
							local39 = local39 * 128 + 64;
							@Pc(671) Class1_Sub1_Sub1_Sub4 local671 = new Class1_Sub1_Sub1_Sub4(local43, local598, local155 + anInt320, 9, local181, local32, local25, local169 + anInt320, this.anInt253, local48, this.method177(local32, local25, this.anInt253) - local53, local143);
							local671.method245(172, local35, local155 + anInt320, this.method177(local39, local35, this.anInt253) - local143, local39);
							this.aClass31_2.method494(local671);
						}
					} else if (arg0 == 215) {
						local16 = arg1.method467();
						local25 = this.anInt378 + (local16 >> 4 & 0x7);
						local32 = this.anInt379 + (local16 & 0x7);
						local35 = arg1.method469();
						local39 = arg1.method467();
						local43 = arg1.method469();
						if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
							local25 = local25 * 128 + 64;
							local32 = local32 * 128 + 64;
							@Pc(767) Class1_Sub1_Sub1_Sub6 local767 = new Class1_Sub1_Sub1_Sub6(local35, local43, this.method177(local32, local25, this.anInt253) - local39, local32, anInt320, local25, -533, this.anInt253);
							this.aClass31_3.method494(local767);
						}
					} else if (arg0 == 131) {
						local16 = arg1.method467();
						local25 = this.anInt378 + (local16 >> 4 & 0x7);
						local32 = this.anInt379 + (local16 & 0x7);
						local35 = arg1.method469();
						local39 = arg1.method469();
						local43 = arg1.method469();
						if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104 && local43 != this.anInt430) {
							@Pc(821) Class1_Sub1_Sub1_Sub3 local821 = new Class1_Sub1_Sub1_Sub3();
							local821.anInt485 = local35;
							local821.anInt486 = local39;
							if (this.aClass31ArrayArrayArray1[this.anInt253][local25][local32] == null) {
								this.aClass31ArrayArrayArray1[this.anInt253][local25][local32] = new Class31(-740);
							}
							this.aClass31ArrayArrayArray1[this.anInt253][local25][local32].method494(local821);
							this.method102(local25, local32);
						}
					} else {
						if (arg0 == 248) {
							local16 = arg1.method467();
							local25 = this.anInt378 + (local16 >> 4 & 0x7);
							local32 = this.anInt379 + (local16 & 0x7);
							local35 = arg1.method467();
							local39 = local35 >> 2;
							local43 = local35 & 0x3;
							local48 = this.anIntArray33[local39];
							local53 = arg1.method469();
							local143 = arg1.method469();
							local155 = arg1.method469();
							local169 = arg1.method469();
							@Pc(919) byte local919 = arg1.method468();
							@Pc(922) byte local922 = arg1.method468();
							@Pc(925) byte local925 = arg1.method468();
							@Pc(928) byte local928 = arg1.method468();
							@Pc(934) Class1_Sub1_Sub1_Sub1_Sub2 local934;
							if (local169 == this.anInt430) {
								local934 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
							} else {
								local934 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local169];
							}
							if (local934 != null) {
								@Pc(946) Class9 local946 = Class9.method249(local53);
								@Pc(956) int local956 = this.anIntArrayArrayArray3[this.anInt253][local25][local32];
								@Pc(968) int local968 = this.anIntArrayArrayArray3[this.anInt253][local25 + 1][local32];
								@Pc(982) int local982 = this.anIntArrayArrayArray3[this.anInt253][local25 + 1][local32 + 1];
								@Pc(994) int local994 = this.anIntArrayArrayArray3[this.anInt253][local25][local32 + 1];
								@Pc(1004) Class1_Sub1_Sub1_Sub5 local1004 = local946.method255(local39, local43, local956, local968, local982, local994, -1);
								if (local1004 != null) {
									this.method158(local32, this.anInt253, local155 + 1, 0, local143 + 1, 0, -1, local48, local25);
									local934.anInt187 = local143 + anInt320;
									local934.anInt188 = local155 + anInt320;
									local934.aClass1_Sub1_Sub1_Sub5_1 = local1004;
									@Pc(1039) int local1039 = local946.anInt520;
									@Pc(1042) int local1042 = local946.anInt521;
									if (local43 == 1 || local43 == 3) {
										local1039 = local946.anInt521;
										local1042 = local946.anInt520;
									}
									local934.anInt189 = local25 * 128 + local1039 * 64;
									local934.anInt191 = local32 * 128 + local1042 * 64;
									local934.anInt190 = this.method177(local934.anInt191, local934.anInt189, this.anInt253);
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
									local934.anInt192 = local25 + local919;
									local934.anInt194 = local25 + local925;
									local934.anInt193 = local32 + local922;
									local934.anInt195 = local32 + local928;
								}
							}
						}
						if (arg0 == 246) {
							local16 = arg1.method467();
							local25 = this.anInt378 + (local16 >> 4 & 0x7);
							local32 = this.anInt379 + (local16 & 0x7);
							local35 = arg1.method469();
							local39 = arg1.method469();
							local43 = arg1.method469();
							if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
								@Pc(1172) Class31 local1172 = this.aClass31ArrayArrayArray1[this.anInt253][local25][local32];
								if (local1172 != null) {
									for (@Pc(1178) Class1_Sub1_Sub1_Sub3 local1178 = (Class1_Sub1_Sub1_Sub3) local1172.method497(); local1178 != null; local1178 = (Class1_Sub1_Sub1_Sub3) local1172.method499()) {
										if (local1178.anInt485 == (local35 & 0x7FFF) && local1178.anInt486 == local39) {
											local1178.anInt486 = local43;
											break;
										}
									}
									this.method102(local25, local32);
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1208) RuntimeException local1208) {
			signlink.reporterror("46100, " + arg0 + ", " + arg1 + ", " + true + ", " + local1208.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method106() {
		try {
			@Pc(8) int local8;
			if (this.anInt382 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt382 > 768) {
						this.anIntArray80[local8] = this.method191(1024 - this.anInt382, anInt309, this.anIntArray81[local8], this.anIntArray82[local8]);
					} else if (this.anInt382 > 256) {
						this.anIntArray80[local8] = this.anIntArray82[local8];
					} else {
						this.anIntArray80[local8] = this.method191(256 - this.anInt382, anInt309, this.anIntArray82[local8], this.anIntArray81[local8]);
					}
				}
			} else if (this.anInt383 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt383 > 768) {
						this.anIntArray80[local8] = this.method191(1024 - this.anInt383, anInt309, this.anIntArray81[local8], this.anIntArray83[local8]);
					} else if (this.anInt383 > 256) {
						this.anIntArray80[local8] = this.anIntArray83[local8];
					} else {
						this.anIntArray80[local8] = this.method191(256 - this.anInt383, anInt309, this.anIntArray83[local8], this.anIntArray81[local8]);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray80[local8] = this.anIntArray81[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass36_19.anIntArray224[local8] = this.aClass1_Sub1_Sub2_Sub2_10.anIntArray198[local8];
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
				local198 = this.anIntArray37[local185] * (256 - local185) / 256;
				local202 = local198 + 22;
				if (local202 < 0) {
					local202 = 0;
				}
				local181 += local202;
				for (local212 = local202; local212 < 128; local212++) {
					local220 = this.anIntArray48[local181++];
					if (local220 == 0) {
						local183++;
					} else {
						local224 = local220;
						local228 = 256 - local220;
						local220 = this.anIntArray80[local220];
						local239 = this.aClass36_19.anIntArray224[local183];
						this.aClass36_19.anIntArray224[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			this.aClass36_19.method546(0, super.aGraphics2, 0);
			for (local198 = 0; local198 < 33920; local198++) {
				this.aClass36_20.anIntArray224[local198] = this.aClass1_Sub1_Sub2_Sub2_11.anIntArray198[local198];
			}
			local181 = 0;
			local183 = 1176;
			for (local202 = 1; local202 < 255; local202++) {
				local212 = this.anIntArray37[local202] * (256 - local202) / 256;
				local220 = 103 - local212;
				local183 += local212;
				for (local224 = 0; local224 < local220; local224++) {
					local228 = this.anIntArray48[local181++];
					if (local228 == 0) {
						local183++;
					} else {
						local239 = local228;
						@Pc(365) int local365 = 256 - local228;
						local228 = this.anIntArray80[local228];
						@Pc(376) int local376 = this.aClass36_20.anIntArray224[local183];
						this.aClass36_20.anIntArray224[local183++] = ((local228 & 0xFF00FF) * local239 + (local376 & 0xFF00FF) * local365 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local376 & 0xFF00) * local365 & 0xFF0000) >> 8;
					}
				}
				local181 += 128 - local220;
				local183 += 128 - local220 - local212;
			}
			this.aClass36_20.method546(661, super.aGraphics2, 0);
		} catch (@Pc(448) RuntimeException local448) {
			signlink.reporterror("83846, " + false + ", " + local448.toString());
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

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method107(@OriginalArg(1) int arg0) {
		try {
			if (!aBoolean31) {
				@Pc(25) Class1_Sub1_Sub2_Sub3 local25;
				@Pc(33) int local33;
				@Pc(41) int local41;
				@Pc(44) byte[] local44;
				@Pc(47) byte[] local47;
				@Pc(49) int local49;
				if (Class1_Sub1_Sub2_Sub1.anIntArray177[17] >= arg0) {
					local25 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array4[17];
					local33 = local25.anInt717 * local25.anInt718 - 1;
					local41 = local25.anInt717 * this.anInt341 * 2;
					local44 = local25.aByteArray7;
					local47 = this.aByteArray2;
					for (local49 = 0; local49 <= local33; local49++) {
						local47[local49] = local44[local49 - local41 & local33];
					}
					local25.aByteArray7 = local47;
					this.aByteArray2 = local44;
					Class1_Sub1_Sub2_Sub1.method358(17);
				}
				if (Class1_Sub1_Sub2_Sub1.anIntArray177[24] >= arg0) {
					local25 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array4[24];
					local33 = local25.anInt717 * local25.anInt718 - 1;
					local41 = local25.anInt717 * this.anInt341 * 2;
					local44 = local25.aByteArray7;
					local47 = this.aByteArray2;
					for (local49 = 0; local49 <= local33; local49++) {
						local47[local49] = local44[local49 - local41 & local33];
					}
					local25.aByteArray7 = local47;
					this.aByteArray2 = local44;
					Class1_Sub1_Sub2_Sub1.method358(24);
					return;
				}
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("7475, " + 3 + ", " + arg0 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method108(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString10 = "";
				this.aString11 = "Connecting to server...";
				this.method144();
			}
			this.aClass8_1 = new Class8(this.method114(anInt251 + 43594), this, 0);
			this.aClass8_1.method238(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 8);
			this.aClass1_Sub1_Sub3_3.anInt771 = 0;
			this.aLong10 = this.aClass1_Sub1_Sub3_3.method473();
			@Pc(47) int[] local47 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong10 >> 32), (int) this.aLong10 };
			this.aClass1_Sub1_Sub3_4.anInt771 = 0;
			this.aClass1_Sub1_Sub3_4.method457(10);
			this.aClass1_Sub1_Sub3_4.method461(local47[0]);
			this.aClass1_Sub1_Sub3_4.method461(local47[1]);
			this.aClass1_Sub1_Sub3_4.method461(local47[2]);
			this.aClass1_Sub1_Sub3_4.method461(local47[3]);
			this.aClass1_Sub1_Sub3_4.method461(signlink.anInt916);
			this.aClass1_Sub1_Sub3_4.method464(arg0);
			this.aClass1_Sub1_Sub3_4.method464(arg1);
			this.aClass1_Sub1_Sub3_4.method482(aBigInteger1, aBigInteger2);
			this.aClass1_Sub1_Sub3_2.anInt771 = 0;
			if (arg2) {
				this.aClass1_Sub1_Sub3_2.method457(18);
			} else {
				this.aClass1_Sub1_Sub3_2.method457(16);
			}
			this.aClass1_Sub1_Sub3_2.method457(this.aClass1_Sub1_Sub3_4.anInt771 + 36 + 1 + 1);
			this.aClass1_Sub1_Sub3_2.method457(234);
			this.aClass1_Sub1_Sub3_2.method457(aBoolean31 ? 1 : 0);
			for (@Pc(167) int local167 = 0; local167 < 9; local167++) {
				this.aClass1_Sub1_Sub3_2.method461(this.anIntArray77[local167]);
			}
			this.aClass1_Sub1_Sub3_2.method465(this.aClass1_Sub1_Sub3_4.aByteArray9, this.aClass1_Sub1_Sub3_4.anInt771);
			this.aClass1_Sub1_Sub3_4.aClass44_2 = new Class44(946, local47);
			for (@Pc(201) int local201 = 0; local201 < 4; local201++) {
				local47[local201] += 50;
			}
			this.aClass44_1 = new Class44(946, local47);
			this.aClass8_1.method239(this.aByte4, this.aClass1_Sub1_Sub3_2.anInt771, this.aClass1_Sub1_Sub3_2.aByteArray9);
			@Pc(237) int local237 = this.aClass8_1.method236();
			if (local237 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(244) Exception local244) {
				}
				this.method108(arg0, arg1, arg2);
				return;
			}
			if (local237 == 2 || local237 == 18) {
				if (local237 == 18) {
					this.aBoolean57 = true;
				} else {
					this.aBoolean57 = false;
				}
				Class10.method257();
				this.aBoolean60 = true;
				this.aClass1_Sub1_Sub3_4.anInt771 = 0;
				this.aClass1_Sub1_Sub3_3.anInt771 = 0;
				this.anInt443 = -1;
				this.anInt386 = -1;
				this.anInt387 = -1;
				this.anInt388 = -1;
				this.anInt442 = 0;
				this.anInt444 = 0;
				this.anInt318 = 0;
				this.anInt446 = 0;
				this.anInt371 = 0;
				this.anInt420 = 0;
				this.aBoolean54 = false;
				super.anInt239 = 0;
				for (@Pc(318) int local318 = 0; local318 < 100; local318++) {
					this.aStringArray2[local318] = null;
				}
				this.anInt285 = 0;
				this.anInt266 = 0;
				this.anInt281 = 0;
				this.anInt265 = 0;
				this.anInt277 = (int) (Math.random() * 100.0D) - 50;
				this.anInt323 = (int) (Math.random() * 110.0D) - 55;
				this.anInt270 = (int) (Math.random() * 80.0D) - 40;
				this.anInt283 = (int) (Math.random() * 120.0D) - 60;
				this.anInt346 = (int) (Math.random() * 30.0D) - 20;
				this.anInt439 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				this.anInt263 = -1;
				this.anInt354 = 0;
				this.anInt355 = 0;
				this.anInt417 = 0;
				this.anInt299 = 0;
				for (@Pc(408) int local408 = 0; local408 < this.anInt415; local408++) {
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local408] = null;
					this.aClass1_Sub1_Sub3Array1[local408] = null;
				}
				for (@Pc(427) int local427 = 0; local427 < 8192; local427++) {
					this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local427] = null;
				}
				aClass1_Sub1_Sub1_Sub1_Sub2_1 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anInt416] = new Class1_Sub1_Sub1_Sub1_Sub2();
				this.aClass31_2.method501();
				this.aClass31_3.method501();
				@Pc(460) int local460;
				for (@Pc(456) int local456 = 0; local456 < 4; local456++) {
					for (local460 = 0; local460 < 104; local460++) {
						for (@Pc(464) int local464 = 0; local464 < 104; local464++) {
							this.aClass31ArrayArrayArray1[local456][local460][local464] = null;
						}
					}
				}
				this.aClass31_1 = new Class31(-740);
				this.anInt306 = 0;
				this.anInt431 = -1;
				this.anInt419 = -1;
				this.anInt449 = -1;
				this.anInt358 = -1;
				this.aBoolean38 = false;
				this.anInt436 = 3;
				this.aBoolean63 = false;
				this.aBoolean54 = false;
				this.aBoolean46 = false;
				this.aString12 = null;
				this.anInt410 = 0;
				this.anInt370 = -1;
				this.aBoolean67 = true;
				this.method133((byte) 7);
				for (local460 = 0; local460 < 5; local460++) {
					this.anIntArray70[local460] = 0;
				}
				anInt434 = 0;
				anInt269 = 0;
				anInt361 = 0;
				anInt394 = 0;
				anInt254 = 0;
				anInt391 = 0;
				anInt261 = 0;
				anInt249 = 0;
				anInt406 = 0;
				this.method216();
				return;
			}
			if (local237 == 3) {
				this.aString10 = "";
				this.aString11 = "Invalid username or password.";
				return;
			}
			if (local237 == 4) {
				this.aString10 = "Your account has been disabled.";
				this.aString11 = "Please check your message-centre for details.";
				return;
			}
			if (local237 == 5) {
				this.aString10 = "Your account is already logged in.";
				this.aString11 = "Try again in 60 secs...";
				return;
			}
			if (local237 == 6) {
				this.aString10 = "RuneScape has been updated!";
				this.aString11 = "Please reload this page.";
				return;
			}
			if (local237 == 7) {
				this.aString10 = "This world is full.";
				this.aString11 = "Please use a different world.";
				return;
			}
			if (local237 == 8) {
				this.aString10 = "Unable to connect.";
				this.aString11 = "Login server offline.";
				return;
			}
			if (local237 == 9) {
				this.aString10 = "Login limit exceeded.";
				this.aString11 = "Too many connections from your address.";
				return;
			}
			if (local237 == 10) {
				this.aString10 = "Unable to connect.";
				this.aString11 = "Bad session id.";
				return;
			}
			if (local237 == 11) {
				this.aString11 = "Login server rejected session.";
				this.aString11 = "Please try again.";
				return;
			}
			if (local237 == 12) {
				this.aString10 = "You need a members account to login to this world.";
				this.aString11 = "Please subscribe, or use a different world.";
				return;
			}
			if (local237 == 13) {
				this.aString10 = "Could not complete login.";
				this.aString11 = "Please try using a different world.";
				return;
			}
			if (local237 == 14) {
				this.aString10 = "The server is being updated.";
				this.aString11 = "Please wait 1 minute and try again.";
				return;
			}
			if (local237 == 15) {
				this.aBoolean60 = true;
				this.aClass1_Sub1_Sub3_4.anInt771 = 0;
				this.aClass1_Sub1_Sub3_3.anInt771 = 0;
				this.anInt443 = -1;
				this.anInt386 = -1;
				this.anInt387 = -1;
				this.anInt388 = -1;
				this.anInt442 = 0;
				this.anInt444 = 0;
				this.anInt318 = 0;
				this.anInt420 = 0;
				this.aBoolean54 = false;
				return;
			}
			if (local237 == 16) {
				this.aString10 = "Login attempts exceeded.";
				this.aString11 = "Please wait 1 minute and try again.";
				return;
			}
			if (local237 == 17) {
				this.aString10 = "You are standing in a members-only area.";
				this.aString11 = "To play on this world move to a free area first";
				return;
			}
		} catch (@Pc(758) IOException local758) {
			this.aString10 = "";
			this.aString11 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!ob;)V")
	private void method109(@OriginalArg(1) Class1_Sub2 arg0) {
		try {
			@Pc(12) int local12 = 0;
			@Pc(14) int local14 = -1;
			@Pc(16) int local16 = 0;
			@Pc(18) int local18 = 0;
			if (arg0.anInt822 == 0) {
				local12 = this.aClass37_1.method575(arg0.anInt821, arg0.anInt823, arg0.anInt824);
			}
			if (arg0.anInt822 == 1) {
				local12 = this.aClass37_1.method576(arg0.anInt821, arg0.anInt824, arg0.anInt823);
			}
			if (arg0.anInt822 == 2) {
				local12 = this.aClass37_1.method577(arg0.anInt821, arg0.anInt823, arg0.anInt824);
			}
			if (arg0.anInt822 == 3) {
				local12 = this.aClass37_1.method578(arg0.anInt821, arg0.anInt823, arg0.anInt824);
			}
			if (local12 != 0) {
				@Pc(87) int local87 = this.aClass37_1.method579(arg0.anInt821, arg0.anInt823, arg0.anInt824, local12);
				local14 = local12 >> 14 & 0x7FFF;
				local16 = local87 & 0x1F;
				local18 = local87 >> 6;
			}
			arg0.anInt825 = local14;
			arg0.anInt827 = local16;
			arg0.anInt826 = local18;
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("10715, " + 3 + ", " + arg0 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIB)Z")
	private boolean method110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(7) Class6 local7 = Class6.aClass6Array1[arg1];
			for (@Pc(9) int local9 = 0; local9 < local7.anIntArray90.length && local7.anIntArray90[local9] != -1; local9++) {
				@Pc(24) Class6 local24 = Class6.aClass6Array1[local7.anIntArray90[local9]];
				if (local24.anInt455 == 1) {
					local3 |= this.method110(arg0, local24.anInt453);
				}
				if (local24.anInt455 == 6 && (local24.anInt475 != -1 || local24.anInt476 != -1)) {
					@Pc(54) boolean local54 = this.method176(local24);
					@Pc(59) int local59;
					if (local54) {
						local59 = local24.anInt476;
					} else {
						local59 = local24.anInt475;
					}
					if (local59 != -1) {
						@Pc(71) Class25 local71 = Class25.aClass25Array1[local59];
						local24.anInt452 += arg0;
						while (local24.anInt452 > local71.method484(local24.anInt451)) {
							local24.anInt452 -= local71.method484(local24.anInt451) + 1;
							local24.anInt451++;
							if (local24.anInt451 >= local71.anInt778) {
								local24.anInt451 -= local71.anInt779;
								if (local24.anInt451 < 0 || local24.anInt451 >= local71.anInt778) {
									local24.anInt451 = 0;
								}
							}
							local3 = true;
						}
					}
				}
			}
			return local3;
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("52710, " + arg0 + ", " + arg1 + ", " + -124 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method111(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt396 >= 100) {
					this.method136("Your ignore list is full. Max of 100 hit", 0, "");
				} else {
					@Pc(23) String local23 = Class46.method644(Class46.method641(arg0));
					for (@Pc(25) int local25 = 0; local25 < this.anInt396; local25++) {
						if (this.aLongArray3[local25] == arg0) {
							this.method136(local23 + " is already on your ignore list", 0, "");
							return;
						}
					}
					for (@Pc(55) int local55 = 0; local55 < this.anInt306; local55++) {
						if (this.aLongArray4[local55] == arg0) {
							this.method136("Please remove " + local23 + " from your friend list first", 0, "");
							return;
						}
					}
					this.aLongArray3[this.anInt396++] = arg0;
					this.aBoolean65 = true;
					this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 84);
					this.aClass1_Sub1_Sub3_4.method463(arg0);
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("28507, " + arg0 + ", " + -338 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method112() {
		try {
			@Pc(16) int local16;
			@Pc(23) int local23;
			if (this.anInt307 == 0) {
				local16 = super.anInt237 / 2 - 80;
				local23 = super.anInt238 / 2 + 20;
				local23 += 20;
				if (super.anInt243 == 1 && super.anInt244 >= local16 - 75 && super.anInt244 <= local16 + 75 && super.anInt245 >= local23 - 20 && super.anInt245 <= local23 + 20) {
					this.anInt307 = 3;
					this.anInt310 = 0;
				}
				local16 = super.anInt237 / 2 + 80;
				if (super.anInt243 == 1 && super.anInt244 >= local16 - 75 && super.anInt244 <= local16 + 75 && super.anInt245 >= local23 - 20 && super.anInt245 <= local23 + 20) {
					this.aString10 = "";
					this.aString11 = "Enter your username & password.";
					this.anInt307 = 2;
					this.anInt310 = 0;
				}
			} else if (this.anInt307 == 2) {
				local16 = super.anInt238 / 2 - 40;
				local16 += 30;
				local16 += 25;
				if (super.anInt243 == 1 && super.anInt245 >= local16 - 15 && super.anInt245 < local16) {
					this.anInt310 = 0;
				}
				local16 += 15;
				if (super.anInt243 == 1 && super.anInt245 >= local16 - 15 && super.anInt245 < local16) {
					this.anInt310 = 1;
				}
				local16 += 15;
				local23 = super.anInt237 / 2 - 80;
				@Pc(169) int local169 = super.anInt238 / 2 + 50;
				@Pc(170) int local170 = local169 + 20;
				if (super.anInt243 == 1 && super.anInt244 >= local23 - 75 && super.anInt244 <= local23 + 75 && super.anInt245 >= local170 - 20 && super.anInt245 <= local170 + 20) {
					this.method108(this.aString13, this.aString14, false);
				}
				local23 = super.anInt237 / 2 + 80;
				if (super.anInt243 == 1 && super.anInt244 >= local23 - 75 && super.anInt244 <= local23 + 75 && super.anInt245 >= local170 - 20 && super.anInt245 <= local170 + 20) {
					this.anInt307 = 0;
					this.aString13 = "";
					this.aString14 = "";
				}
				while (true) {
					while (true) {
						@Pc(253) int local253 = this.method83();
						if (local253 == -1) {
							return;
						}
						@Pc(258) boolean local258 = false;
						for (@Pc(260) int local260 = 0; local260 < aString15.length(); local260++) {
							if (local253 == aString15.charAt(local260)) {
								local258 = true;
								break;
							}
						}
						if (this.anInt310 == 0) {
							if (local253 == 8 && this.aString13.length() > 0) {
								this.aString13 = this.aString13.substring(0, this.aString13.length() - 1);
							}
							if (local253 == 9 || local253 == 10 || local253 == 13) {
								this.anInt310 = 1;
							}
							if (local258) {
								this.aString13 = this.aString13 + (char) local253;
							}
							if (this.aString13.length() > 12) {
								this.aString13 = this.aString13.substring(0, 12);
							}
						} else if (this.anInt310 == 1) {
							if (local253 == 8 && this.aString14.length() > 0) {
								this.aString14 = this.aString14.substring(0, this.aString14.length() - 1);
							}
							if (local253 == 9 || local253 == 10 || local253 == 13) {
								this.anInt310 = 0;
							}
							if (local258) {
								this.aString14 = this.aString14 + (char) local253;
							}
							if (this.aString14.length() > 20) {
								this.aString14 = this.aString14.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt307 == 3) {
				local16 = super.anInt237 / 2;
				local23 = super.anInt238 / 2 + 50;
				@Pc(417) int local417 = local23 + 20;
				if (super.anInt243 == 1 && super.anInt244 >= local16 - 75 && super.anInt244 <= local16 + 75 && super.anInt245 >= local417 - 20 && super.anInt245 <= local417 + 20) {
					this.anInt307 = 0;
					return;
				}
			}
		} catch (@Pc(450) RuntimeException local450) {
			signlink.reporterror("71555, " + 5 + ", " + local450.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!kb;)V")
	private void method113(@OriginalArg(1) Class1_Sub1_Sub2_Sub3 arg0) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray26.length; local5++) {
				this.anIntArray26[local5] = 0;
			}
			@Pc(30) int local30;
			for (@Pc(20) int local20 = 0; local20 < 5000; local20++) {
				local30 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray26[local30] = (int) (Math.random() * 256.0D);
			}
			@Pc(58) int local58;
			@Pc(62) int local62;
			@Pc(70) int local70;
			for (local30 = 0; local30 < 20; local30++) {
				for (local58 = 1; local58 < 255; local58++) {
					for (local62 = 1; local62 < 127; local62++) {
						local70 = local62 + (local58 << 7);
						this.anIntArray27[local70] = (this.anIntArray26[local70 - 1] + this.anIntArray26[local70 + 1] + this.anIntArray26[local70 - 128] + this.anIntArray26[local70 + 128]) / 4;
					}
				}
				@Pc(116) int[] local116 = this.anIntArray26;
				this.anIntArray26 = this.anIntArray27;
				this.anIntArray27 = local116;
			}
			if (arg0 != null) {
				local58 = 0;
				for (local62 = 0; local62 < arg0.anInt718; local62++) {
					for (local70 = 0; local70 < arg0.anInt717; local70++) {
						if (arg0.aByteArray7[local58++] != 0) {
							@Pc(152) int local152 = local70 + arg0.anInt719 + 16;
							@Pc(159) int local159 = local62 + arg0.anInt720 + 16;
							@Pc(165) int local165 = local152 + (local159 << 7);
							this.anIntArray26[local165] = 0;
						}
					}
				}
			}
		} catch (@Pc(182) RuntimeException local182) {
			signlink.reporterror("6032, " + 298 + ", " + arg0 + ", " + local182.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)Ljava/net/Socket;")
	public Socket method114(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method115() {
		try {
			for (@Pc(4) int local4 = 0; local4 < this.anInt299; local4++) {
				@Pc(14) Class1_Sub1_Sub1_Sub1_Sub1 local14 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray38[local4]];
				@Pc(23) int local23 = (this.anIntArray38[local4] << 14) + 536870912;
				if (local14 != null && local14.method44()) {
					@Pc(34) int local34 = local14.anInt135 >> 7;
					@Pc(39) int local39 = local14.anInt136 >> 7;
					if (local34 >= 0 && local34 < 104 && local39 >= 0 && local39 < 104) {
						if (local14.anInt138 == 1 && (local14.anInt135 & 0x7F) == 64 && (local14.anInt136 & 0x7F) == 64) {
							if (this.anIntArrayArray2[local34][local39] == this.anInt343) {
								continue;
							}
							this.anIntArrayArray2[local34][local39] = this.anInt343;
						}
						this.aClass37_1.method560(local14.anInt135, local14.anInt137, local23, this.anInt253, local14.anInt136, local14.aBoolean12, local14, (local14.anInt138 - 1) * 64 + 60, this.method177(local14.anInt136, local14.anInt135, this.anInt253));
					}
				}
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("10913, " + false + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method116(@OriginalArg(0) byte arg0) {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt417; local3++) {
				if (local3 == -1) {
					local11 = this.anInt416;
				} else {
					local11 = this.anIntArray71[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub2 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local11];
				if (local23 != null && local23.anInt146 > 0) {
					local23.anInt146--;
					if (local23.anInt146 == 0) {
						local23.aString3 = null;
					}
				}
			}
			for (local11 = 0; local11 < this.anInt299; local11++) {
				@Pc(54) int local54 = this.anIntArray38[local11];
				@Pc(59) Class1_Sub1_Sub1_Sub1_Sub1 local59 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local54];
				if (local59 != null && local59.anInt146 > 0) {
					local59.anInt146--;
					if (local59.anInt146 == 0) {
						local59.aString3 = null;
					}
				}
			}
			@Pc(86) boolean local86 = false;
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("14492, " + arg0 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBIII)V")
	private void method118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(8) int local8 = this.aClass37_1.method575(arg2, arg1, arg4);
			@Pc(18) int local18;
			@Pc(24) int local24;
			@Pc(28) int local28;
			@Pc(30) int local30;
			@Pc(52) int local52;
			@Pc(58) int local58;
			if (local8 != 0) {
				local18 = this.aClass37_1.method579(arg2, arg1, arg4, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = arg0;
				if (local8 > 0) {
					local30 = arg3;
				}
				@Pc(38) int[] local38 = this.aClass1_Sub1_Sub2_Sub2_9.anIntArray198;
				local52 = arg1 * 4 + (103 - arg4) * 512 * 4 + 24624;
				local58 = local8 >> 14 & 0x7FFF;
				@Pc(61) Class9 local61 = Class9.method249(local58);
				if (local61.anInt525 == -1) {
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
					@Pc(71) Class1_Sub1_Sub2_Sub3 local71 = this.aClass1_Sub1_Sub2_Sub3Array1[local61.anInt525];
					if (local71 != null) {
						@Pc(83) int local83 = (local61.anInt520 * 4 - local71.anInt717) / 2;
						@Pc(93) int local93 = (local61.anInt521 * 4 - local71.anInt718) / 2;
						local71.method422(arg1 * 4 + local83 + 48, (104 - arg4 - local61.anInt521) * 4 + 48 + local93, 373);
					}
				}
			}
			local8 = this.aClass37_1.method577(arg2, arg1, arg4);
			if (local8 != 0) {
				local18 = this.aClass37_1.method579(arg2, arg1, arg4, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = local8 >> 14 & 0x7FFF;
				@Pc(447) Class9 local447 = Class9.method249(local30);
				@Pc(479) int local479;
				if (local447.anInt525 != -1) {
					@Pc(457) Class1_Sub1_Sub2_Sub3 local457 = this.aClass1_Sub1_Sub2_Sub3Array1[local447.anInt525];
					if (local457 != null) {
						local58 = (local447.anInt520 * 4 - local457.anInt717) / 2;
						local479 = (local447.anInt521 * 4 - local457.anInt718) / 2;
						local457.method422(arg1 * 4 + local58 + 48, (104 - arg4 - local447.anInt521) * 4 + 48 + local479, 373);
					}
				} else if (local28 == 9) {
					local52 = 15658734;
					if (local8 > 0) {
						local52 = 15597568;
					}
					@Pc(516) int[] local516 = this.aClass1_Sub1_Sub2_Sub2_9.anIntArray198;
					local479 = arg1 * 4 + (103 - arg4) * 512 * 4 + 24624;
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
			local8 = this.aClass37_1.method578(arg2, arg1, arg4);
			if (local8 != 0) {
				local18 = local8 >> 14 & 0x7FFF;
				@Pc(617) Class9 local617 = Class9.method249(local18);
				if (local617.anInt525 != -1) {
					@Pc(627) Class1_Sub1_Sub2_Sub3 local627 = this.aClass1_Sub1_Sub2_Sub3Array1[local617.anInt525];
					if (local627 != null) {
						local30 = (local617.anInt520 * 4 - local627.anInt717) / 2;
						@Pc(649) int local649 = (local617.anInt521 * 4 - local627.anInt718) / 2;
						local627.method422(arg1 * 4 + local30 + 48, (104 - arg4 - local617.anInt521) * 4 + 48 + local649, 373);
						return;
					}
				}
			}
		} catch (@Pc(673) RuntimeException local673) {
			signlink.reporterror("89217, " + arg0 + ", " + arg1 + ", " + 72 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local673.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method119() {
		try {
			if (this.anInt446 > 0) {
				this.method96();
			} else {
				this.aClass36_27.method545();
				this.aClass1_Sub1_Sub2_Sub4_2.method440("Connection lost", 257, 144, 0);
				this.aClass1_Sub1_Sub2_Sub4_2.method440("Connection lost", 256, 143, 16777215);
				this.aClass1_Sub1_Sub2_Sub4_2.method440("Please wait - attempting to reestablish", 257, 159, 0);
				this.aClass1_Sub1_Sub2_Sub4_2.method440("Please wait - attempting to reestablish", 256, 158, 16777215);
				this.aClass36_27.method546(8, super.aGraphics2, 11);
				this.anInt354 = 0;
				@Pc(61) Class8 local61 = this.aClass8_1;
				this.aBoolean60 = false;
				this.method108(this.aString13, this.aString14, true);
				if (!this.aBoolean60) {
					this.method96();
				}
				try {
					local61.method235();
				} catch (@Pc(81) Exception local81) {
				}
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("55822, " + 66 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(III)V")
	private void method120(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.anInt322 != 0) {
				@Pc(12) int local12 = 0;
				if (this.anInt318 != 0) {
					local12 = 1;
				}
				for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
					if (this.aStringArray2[local19] != null) {
						@Pc(31) int local31 = this.anIntArray25[local19];
						if ((local31 == 3 || local31 == 7) && (local31 == 7 || this.anInt385 == 0 || this.anInt385 == 1 && this.method132(this.aStringArray1[local19]))) {
							@Pc(61) int local61 = 329 - local12 * 13;
							if (super.anInt241 > 8 && super.anInt241 < 520 && arg0 - 11 > local61 - 10 && arg0 - 11 <= local61 + 3) {
								if (this.aBoolean57) {
									this.aStringArray5[this.anInt420] = "Report abuse @whi@" + this.aStringArray1[local19];
									this.anIntArray58[this.anInt420] = 2034;
									this.anInt420++;
								}
								this.aStringArray5[this.anInt420] = "Add ignore @whi@" + this.aStringArray1[local19];
								this.anIntArray58[this.anInt420] = 2436;
								this.anInt420++;
								this.aStringArray5[this.anInt420] = "Add friend @whi@" + this.aStringArray1[local19];
								this.anIntArray58[this.anInt420] = 2406;
								this.anInt420++;
							}
							local12++;
							if (local12 >= 5) {
								return;
							}
						}
						if ((local31 == 5 || local31 == 6) && this.anInt385 < 2) {
							local12++;
							if (local12 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(193) RuntimeException local193) {
			signlink.reporterror("8144, " + arg0 + ", " + 5 + ", " + arg1 + ", " + local193.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method121(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) Class6 local5 = Class6.aClass6Array1[arg0];
			for (@Pc(7) int local7 = 0; local7 < local5.anIntArray90.length && local5.anIntArray90[local7] != -1; local7++) {
				@Pc(22) Class6 local22 = Class6.aClass6Array1[local5.anIntArray90[local7]];
				if (local22.anInt455 == 1) {
					this.method121(local22.anInt453);
				}
				local22.anInt451 = 0;
				local22.anInt452 = 0;
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("88668, " + arg0 + ", " + 47034 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method122() {
		try {
			if (aBoolean31 && this.anInt281 == 2 && Class4.anInt209 != this.anInt253) {
				this.aClass36_27.method545();
				this.aClass1_Sub1_Sub2_Sub4_2.method440("Loading - please wait.", 257, 151, 0);
				this.aClass1_Sub1_Sub2_Sub4_2.method440("Loading - please wait.", 256, 150, 16777215);
				this.aClass36_27.method546(8, super.aGraphics2, 11);
				this.anInt281 = 1;
			}
			if (this.anInt281 == 1) {
				for (@Pc(54) int local54 = 0; local54 < this.aByteArrayArray2.length; local54++) {
					if (this.aByteArrayArray2[local54] == null && this.anIntArray74[local54] != -1) {
						return;
					}
					if (this.aByteArrayArray1[local54] == null && this.anIntArray75[local54] != -1) {
						return;
					}
				}
				@Pc(88) boolean local88 = true;
				for (@Pc(90) int local90 = 0; local90 < this.aByteArrayArray2.length; local90++) {
					@Pc(97) byte[] local97 = this.aByteArrayArray1[local90];
					if (local97 != null) {
						@Pc(111) int local111 = (this.anIntArray73[local90] >> 8) * 64 - this.anInt411;
						@Pc(123) int local123 = (this.anIntArray73[local90] & 0xFF) * 64 - this.anInt412;
						local88 &= Class4.method53(local97, local111, local123);
					}
				}
				if (!local88) {
					return;
				}
				this.anInt281 = 2;
				Class4.anInt209 = this.anInt253;
				this.method148();
			}
			if (this.anInt281 == 2 && this.anInt253 != this.anInt263) {
				this.anInt263 = this.anInt253;
				this.method212(this.anInt253);
			}
		} catch (@Pc(169) RuntimeException local169) {
			signlink.reporterror("57020, " + 7 + ", " + local169.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!d;IBI)V")
	private void method123(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1.anInt455 == 0 && arg1.anIntArray90 != null && (!arg1.aBoolean69 || this.anInt257 == arg1.anInt453 || this.anInt280 == arg1.anInt453 || this.anInt279 == arg1.anInt453)) {
				@Pc(29) int local29 = Class1_Sub1_Sub2.anInt738;
				@Pc(31) int local31 = Class1_Sub1_Sub2.anInt736;
				@Pc(33) int local33 = Class1_Sub1_Sub2.anInt739;
				@Pc(35) int local35 = Class1_Sub1_Sub2.anInt737;
				Class1_Sub1_Sub2.method434(arg2, arg3, arg3 + arg1.anInt459, arg2 + arg1.anInt458);
				if (this.aByte2 != 0) {
					this.anInt443 = this.aClass1_Sub1_Sub3_3.method467();
				}
				@Pc(64) int local64 = arg1.anIntArray90.length;
				for (@Pc(66) int local66 = 0; local66 < local64; local66++) {
					@Pc(75) int local75 = arg1.anIntArray91[local66] + arg2;
					@Pc(84) int local84 = arg1.anIntArray92[local66] + arg3 - arg0;
					@Pc(91) Class6 local91 = Class6.aClass6Array1[arg1.anIntArray90[local66]];
					@Pc(96) int local96 = local75 + local91.anInt460;
					@Pc(101) int local101 = local84 + local91.anInt461;
					if (local91.anInt457 > 0) {
						this.method209(local91);
					}
					if (local91.anInt455 == 0) {
						if (local91.anInt464 > local91.anInt463 - local91.anInt459) {
							local91.anInt464 = local91.anInt463 - local91.anInt459;
						}
						if (local91.anInt464 < 0) {
							local91.anInt464 = 0;
						}
						this.method123(local91.anInt464, local91, local96, local101);
						if (local91.anInt463 > local91.anInt459) {
							this.method101(local91.anInt464, local91.anInt463, local96 + local91.anInt458, local101, local91.anInt459);
						}
					} else if (local91.anInt455 != 1) {
						@Pc(173) int local173;
						@Pc(177) int local177;
						@Pc(188) int local188;
						@Pc(223) int local223;
						@Pc(230) int local230;
						@Pc(171) int local171;
						@Pc(197) int local197;
						@Pc(221) int local221;
						if (local91.anInt455 == 2) {
							local171 = 0;
							for (local173 = 0; local173 < local91.anInt459; local173++) {
								for (local177 = 0; local177 < local91.anInt458; local177++) {
									local188 = local96 + local177 * (local91.anInt466 + 32);
									local197 = local101 + local173 * (local91.anInt467 + 32);
									if (local171 < 20) {
										local188 += local91.anIntArray93[local171];
										local197 += local91.anIntArray94[local171];
									}
									if (local91.anIntArray86[local171] > 0) {
										local221 = 0;
										local223 = 0;
										local230 = local91.anIntArray86[local171] - 1;
										if (local188 > Class1_Sub1_Sub2.anInt738 - 32 && local188 < Class1_Sub1_Sub2.anInt739 && local197 > Class1_Sub1_Sub2.anInt736 - 32 && local197 < Class1_Sub1_Sub2.anInt737 || this.anInt327 != 0 && this.anInt326 == local171) {
											@Pc(261) Class1_Sub1_Sub2_Sub2 local261 = Class13.method322(local91.anIntArray87[local171], local230);
											if (local261 != null) {
												if (this.anInt327 != 0 && this.anInt326 == local171 && this.anInt325 == local91.anInt453) {
													local221 = super.anInt241 - this.anInt328;
													local223 = super.anInt242 - this.anInt329;
													if (local221 < 5 && local221 > -5) {
														local221 = 0;
													}
													if (local223 < 5 && local223 > -5) {
														local223 = 0;
													}
													if (this.anInt342 < 5) {
														local221 = 0;
														local223 = 0;
													}
													local261.method398(local188 + local221, local197 + local223);
												} else if (this.anInt426 != 0 && this.anInt425 == local171 && this.anInt424 == local91.anInt453) {
													local261.method398(local188, local197);
												} else {
													local261.method394(local188, local197);
												}
												if (local261.anInt688 == 33 || local91.anIntArray87[local171] != 1) {
													@Pc(363) int local363 = local91.anIntArray87[local171];
													this.aClass1_Sub1_Sub2_Sub4_1.method443(local188 + local221 + 1, method198(local363, 640), this.aBoolean32, 0, local197 + local223 + 10);
													this.aClass1_Sub1_Sub2_Sub4_1.method443(local188 + local221, method198(local363, 640), this.aBoolean32, 16776960, local197 + local223 + 9);
												}
											}
										}
									} else if (local91.aClass1_Sub1_Sub2_Sub2Array8 != null && local171 < 20) {
										@Pc(412) Class1_Sub1_Sub2_Sub2 local412 = local91.aClass1_Sub1_Sub2_Sub2Array8[local171];
										if (local412 != null) {
											local412.method394(local188, local197);
										}
									}
									local171++;
								}
							}
						} else if (local91.anInt455 != 3) {
							@Pc(470) Class1_Sub1_Sub2_Sub4 local470;
							if (local91.anInt455 == 4) {
								local470 = local91.aClass1_Sub1_Sub2_Sub4_5;
								local173 = local91.anInt468;
								@Pc(476) String local476 = local91.aString18;
								if ((this.anInt279 == local91.anInt453 || this.anInt280 == local91.anInt453 || this.anInt257 == local91.anInt453) && local91.anInt470 != 0) {
									local173 = local91.anInt470;
								}
								if (this.method176(local91)) {
									local173 = local91.anInt469;
									if (local91.aString19.length() > 0) {
										local476 = local91.aString19;
									}
								}
								if (local91.anInt456 == 6 && this.aBoolean38) {
									local476 = "Please wait...";
									local173 = local91.anInt468;
								}
								local197 = local101 + local470.anInt744;
								while (local476.length() > 0) {
									if (local476.indexOf("%") != -1) {
										label268: while (true) {
											local221 = local476.indexOf("%1");
											if (local221 == -1) {
												while (true) {
													local221 = local476.indexOf("%2");
													if (local221 == -1) {
														while (true) {
															local221 = local476.indexOf("%3");
															if (local221 == -1) {
																while (true) {
																	local221 = local476.indexOf("%4");
																	if (local221 == -1) {
																		while (true) {
																			local221 = local476.indexOf("%5");
																			if (local221 == -1) {
																				break label268;
																			}
																			local476 = local476.substring(0, local221) + this.method151(this.method184(4, local91)) + local476.substring(local221 + 2);
																		}
																	}
																	local476 = local476.substring(0, local221) + this.method151(this.method184(3, local91)) + local476.substring(local221 + 2);
																}
															}
															local476 = local476.substring(0, local221) + this.method151(this.method184(2, local91)) + local476.substring(local221 + 2);
														}
													}
													local476 = local476.substring(0, local221) + this.method151(this.method184(1, local91)) + local476.substring(local221 + 2);
												}
											}
											local476 = local476.substring(0, local221) + this.method151(this.method184(0, local91)) + local476.substring(local221 + 2);
										}
									}
									local221 = local476.indexOf("\\n");
									@Pc(718) String local718;
									if (local221 == -1) {
										local718 = local476;
										local476 = "";
									} else {
										local718 = local476.substring(0, local221);
										local476 = local476.substring(local221 + 2);
									}
									if (local91.aBoolean75) {
										local470.method441((byte) 9, local91.aBoolean76, local197, local718, local173, local96 + local91.anInt458 / 2);
									} else {
										local470.method445(local91.aBoolean76, local718, local173, local197, local96);
									}
									local197 += local470.anInt744;
								}
							} else if (local91.anInt455 == 5) {
								@Pc(780) Class1_Sub1_Sub2_Sub2 local780;
								if (this.method176(local91)) {
									local780 = local91.aClass1_Sub1_Sub2_Sub2_13;
								} else {
									local780 = local91.aClass1_Sub1_Sub2_Sub2_12;
								}
								if (local780 != null) {
									local780.method394(local96, local101);
								}
							} else if (local91.anInt455 == 6) {
								local171 = Class1_Sub1_Sub2_Sub1.anInt651;
								local173 = Class1_Sub1_Sub2_Sub1.anInt652;
								Class1_Sub1_Sub2_Sub1.anInt651 = local96 + local91.anInt458 / 2;
								Class1_Sub1_Sub2_Sub1.anInt652 = local101 + local91.anInt459 / 2;
								local177 = Class1_Sub1_Sub2_Sub1.anIntArray173[local91.anInt478] * local91.anInt477 >> 16;
								local188 = Class1_Sub1_Sub2_Sub1.anIntArray174[local91.anInt478] * local91.anInt477 >> 16;
								@Pc(841) boolean local841 = this.method176(local91);
								if (local841) {
									local221 = local91.anInt476;
								} else {
									local221 = local91.anInt475;
								}
								@Pc(861) Class1_Sub1_Sub1_Sub5 local861;
								if (local221 == -1) {
									local861 = local91.method223(-1, -1, local841);
								} else {
									@Pc(867) Class25 local867 = Class25.aClass25Array1[local221];
									local861 = local91.method223(local867.anIntArray215[local91.anInt451], local867.anIntArray216[local91.anInt451], local841);
								}
								if (local861 != null) {
									local861.method298(local91.anInt479, 0, local91.anInt478, 0, local177, local188);
								}
								Class1_Sub1_Sub2_Sub1.anInt651 = local171;
								Class1_Sub1_Sub2_Sub1.anInt652 = local173;
							} else if (local91.anInt455 == 7) {
								local470 = local91.aClass1_Sub1_Sub2_Sub4_5;
								local173 = 0;
								for (local177 = 0; local177 < local91.anInt459; local177++) {
									for (local188 = 0; local188 < local91.anInt458; local188++) {
										if (local91.anIntArray86[local173] > 0) {
											@Pc(931) Class13 local931 = Class13.method316(local91.anIntArray86[local173] - 1);
											@Pc(934) String local934 = local931.aString25;
											if (local931.aBoolean114 || local91.anIntArray87[local173] != 1) {
												local934 = local934 + " x" + method167(local91.anIntArray87[local173]);
											}
											local223 = local96 + local188 * (local91.anInt466 + 115);
											local230 = local101 + local177 * (local91.anInt467 + 12);
											if (local91.aBoolean75) {
												local470.method441((byte) 9, local91.aBoolean76, local230, local934, local91.anInt468, local223 + local91.anInt458 / 2);
											} else {
												local470.method445(local91.aBoolean76, local934, local91.anInt468, local230, local223);
											}
										}
										local173++;
									}
								}
							}
						} else if (local91.aBoolean74) {
							Class1_Sub1_Sub2.method436(local96, local91.anInt458, local91.anInt468, local91.anInt459, local101);
						} else {
							Class1_Sub1_Sub2.method437(local101, local91.anInt459, local96, local91.anInt458, local91.anInt468);
						}
					}
				}
				Class1_Sub1_Sub2.method434(local29, local31, local35, local33);
			}
		} catch (@Pc(1030) RuntimeException local1030) {
			signlink.reporterror("71848, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + local1030.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method124() {
		try {
			if (this.anInt318 > 1) {
				this.anInt318--;
			}
			if (this.anInt446 > 0) {
				this.anInt446--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method190(); local22++) {
			}
			if (this.aBoolean60) {
				this.method122();
				this.method127();
				this.method128();
				@Pc(49) Class1_Sub1_Sub3 local49 = Class10.method258();
				if (local49 != null) {
					this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 54);
					this.aClass1_Sub1_Sub3_4.method458(local49.anInt771);
					this.aClass1_Sub1_Sub3_4.method465(local49.aByteArray9, local49.anInt771);
					local49.method455();
				}
				this.anInt444++;
				if (this.anInt444 > 750) {
					this.method119();
				}
				this.method137();
				this.method199();
				this.method116((byte) 1);
				if ((super.anIntArray23[1] == 1 || super.anIntArray23[2] == 1 || super.anIntArray23[3] == 1 || super.anIntArray23[4] == 1) && this.anInt337++ > 5) {
					this.anInt337 = 0;
					this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 152);
					this.aClass1_Sub1_Sub3_4.method458(this.anInt438);
					this.aClass1_Sub1_Sub3_4.method458(this.anInt439);
					this.aClass1_Sub1_Sub3_4.method457(this.anInt283);
					this.aClass1_Sub1_Sub3_4.method457(this.anInt346);
				}
				this.anInt341++;
				if (this.anInt375 != 0) {
					this.anInt374 += 20;
					if (this.anInt374 >= 400) {
						this.anInt375 = 0;
					}
				}
				if (this.anInt426 != 0) {
					this.anInt423++;
					if (this.anInt423 >= 15) {
						if (this.anInt426 == 2) {
							this.aBoolean65 = true;
						}
						if (this.anInt426 == 3) {
							this.aBoolean51 = true;
						}
						this.anInt426 = 0;
					}
				}
				@Pc(304) int local304;
				if (this.anInt327 != 0) {
					this.anInt342++;
					if (super.anInt241 > this.anInt328 + 5 || super.anInt241 < this.anInt328 - 5 || super.anInt242 > this.anInt329 + 5 || super.anInt242 < this.anInt329 - 5) {
						this.aBoolean29 = true;
					}
					if (super.anInt240 == 0) {
						if (this.anInt327 == 2) {
							this.aBoolean65 = true;
						}
						if (this.anInt327 == 3) {
							this.aBoolean51 = true;
						}
						this.anInt327 = 0;
						if (this.aBoolean29 && this.anInt342 >= 5) {
							this.anInt381 = -1;
							this.method154();
							if (this.anInt381 == this.anInt325 && this.anInt380 != this.anInt326) {
								@Pc(298) Class6 local298 = Class6.aClass6Array1[this.anInt325];
								local304 = local298.anIntArray86[this.anInt380];
								local298.anIntArray86[this.anInt380] = local298.anIntArray86[this.anInt326];
								local298.anIntArray86[this.anInt326] = local304;
								@Pc(326) int local326 = local298.anIntArray87[this.anInt380];
								local298.anIntArray87[this.anInt380] = local298.anIntArray87[this.anInt326];
								local298.anIntArray87[this.anInt326] = local326;
								this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 128);
								this.aClass1_Sub1_Sub3_4.method458(this.anInt325);
								this.aClass1_Sub1_Sub3_4.method458(this.anInt326);
								this.aClass1_Sub1_Sub3_4.method458(this.anInt380);
							}
						} else if ((this.anInt390 == 1 || this.method215(this.anInt420 - 1)) && this.anInt420 > 2) {
							this.method153();
						} else if (this.anInt420 > 0) {
							this.method142(this.anInt420 - 1);
						}
						this.anInt423 = 10;
						super.anInt243 = 0;
					}
				}
				anInt305++;
				if (anInt305 > 127) {
					anInt305 = 0;
					this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 225);
					this.aClass1_Sub1_Sub3_4.method460(4991788);
				}
				@Pc(426) int local426;
				if (Class37.anInt905 != -1) {
					local426 = Class37.anInt905;
					local304 = Class37.anInt906;
					@Pc(449) boolean local449 = this.method94(true, local304, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0], 0, 0, 0, (byte) 8, 0, local426, 0, 0);
					Class37.anInt905 = -1;
					if (local449) {
						this.anInt372 = super.anInt244;
						this.anInt373 = super.anInt245;
						this.anInt375 = 1;
						this.anInt374 = 0;
					}
				}
				if (super.anInt243 == 1 && this.aString12 != null) {
					this.aString12 = null;
					this.aBoolean51 = true;
					super.anInt243 = 0;
				}
				this.method185((byte) 5);
				this.method156((byte) 2);
				this.method155();
				this.method173();
				if (super.anInt240 == 1 || super.anInt243 == 1) {
					this.anInt252++;
				}
				if (this.anInt281 == 2) {
					this.method197();
				}
				if (this.anInt281 == 2 && this.aBoolean53) {
					this.method99();
				}
				for (local426 = 0; local426 < 5; local426++) {
					@Pc(535) int local535 = this.anIntArray51[local426]++;
				}
				this.method208();
				super.anInt239++;
				if (super.anInt239 > 4500) {
					this.anInt446 = 250;
					super.anInt239 -= 500;
					this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 113);
				}
				this.anInt345++;
				if (this.anInt345 > 500) {
					this.anInt345 = 0;
					local304 = (int) (Math.random() * 8.0D);
					if ((local304 & 0x1) == 1) {
						this.anInt277 += this.anInt278;
					}
					if ((local304 & 0x2) == 2) {
						this.anInt323 += this.anInt324;
					}
					if ((local304 & 0x4) == 4) {
						this.anInt270 += this.anInt271;
					}
				}
				if (this.anInt277 < -50) {
					this.anInt278 = 2;
				}
				if (this.anInt277 > 50) {
					this.anInt278 = -2;
				}
				if (this.anInt323 < -55) {
					this.anInt324 = 2;
				}
				if (this.anInt323 > 55) {
					this.anInt324 = -2;
				}
				if (this.anInt270 < -40) {
					this.anInt271 = 1;
				}
				if (this.anInt270 > 40) {
					this.anInt271 = -1;
				}
				this.anInt351++;
				if (this.anInt351 > 500) {
					this.anInt351 = 0;
					local304 = (int) (Math.random() * 8.0D);
					if ((local304 & 0x1) == 1) {
						this.anInt283 += this.anInt284;
					}
					if ((local304 & 0x2) == 2) {
						this.anInt346 += this.anInt347;
					}
				}
				if (this.anInt283 < -60) {
					this.anInt284 = 2;
				}
				if (this.anInt283 > 60) {
					this.anInt284 = -2;
				}
				if (this.anInt346 < -20) {
					this.anInt347 = 1;
				}
				if (this.anInt346 > 10) {
					this.anInt347 = -1;
				}
				anInt272++;
				if (anInt272 > 110) {
					anInt272 = 0;
					this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 227);
					this.aClass1_Sub1_Sub3_4.method461(0);
				}
				this.anInt445++;
				if (this.anInt445 > 50) {
					this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 251);
				}
				try {
					if (this.aClass8_1 != null && this.aClass1_Sub1_Sub3_4.anInt771 > 0) {
						this.aClass8_1.method239(this.aByte4, this.aClass1_Sub1_Sub3_4.anInt771, this.aClass1_Sub1_Sub3_4.aByteArray9);
						this.aClass1_Sub1_Sub3_4.anInt771 = 0;
						this.anInt445 = 0;
					}
				} catch (@Pc(804) IOException local804) {
					this.method119();
				} catch (@Pc(809) Exception local809) {
					this.method96();
				}
			}
		} catch (@Pc(814) RuntimeException local814) {
			signlink.reporterror("26978, " + false + ", " + local814.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!mb;I)V")
	private void method126(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(6) int local6 = arg0.method478(8);
			@Pc(12) int local12;
			if (local6 < this.anInt417) {
				for (local12 = local6; local12 < this.anInt417; local12++) {
					this.anIntArray53[this.anInt349++] = this.anIntArray71[local12];
				}
			}
			if (local6 > this.anInt417) {
				signlink.reporterror(this.aString13 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt417 = 0;
			for (local12 = 0; local12 < local6; local12++) {
				@Pc(64) int local64 = this.anIntArray71[local12];
				@Pc(69) Class1_Sub1_Sub1_Sub1_Sub2 local69 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local64];
				@Pc(74) int local74 = arg0.method478(1);
				if (local74 == 0) {
					this.anIntArray71[this.anInt417++] = local64;
					local69.anInt177 = anInt320;
				} else {
					@Pc(97) int local97 = arg0.method478(2);
					if (local97 == 0) {
						this.anIntArray71[this.anInt417++] = local64;
						local69.anInt177 = anInt320;
						this.anIntArray72[this.anInt418++] = local64;
					} else {
						@Pc(148) int local148;
						@Pc(158) int local158;
						if (local97 == 1) {
							this.anIntArray71[this.anInt417++] = local64;
							local69.anInt177 = anInt320;
							local148 = arg0.method478(3);
							local69.method43(false, local148);
							local158 = arg0.method478(1);
							if (local158 == 1) {
								this.anIntArray72[this.anInt418++] = local64;
							}
						} else if (local97 == 2) {
							this.anIntArray71[this.anInt417++] = local64;
							local69.anInt177 = anInt320;
							local148 = arg0.method478(3);
							local69.method43(true, local148);
							local158 = arg0.method478(3);
							local69.method43(true, local158);
							@Pc(216) int local216 = arg0.method478(1);
							if (local216 == 1) {
								this.anIntArray72[this.anInt418++] = local64;
							}
						} else if (local97 == 3) {
							this.anIntArray53[this.anInt349++] = local64;
						}
					}
				}
			}
		} catch (@Pc(265) RuntimeException local265) {
			signlink.reporterror("82, " + -356 + ", " + arg0 + ", " + arg1 + ", " + local265.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method127() {
		try {
			if (this.anInt281 == 2) {
				for (@Pc(16) Class1_Sub2 local16 = (Class1_Sub2) this.aClass31_1.method497(); local16 != null; local16 = (Class1_Sub2) this.aClass31_1.method499()) {
					if (local16.anInt832 > 0) {
						local16.anInt832--;
					}
					if (local16.anInt832 != 0) {
						if (local16.anInt831 > 0) {
							local16.anInt831--;
						}
						if (local16.anInt831 == 0 && (local16.anInt828 < 0 || Class4.method67(local16.anInt828, local16.anInt830))) {
							this.method140(local16.anInt829, local16.anInt828, local16.anInt824, local16.anInt821, local16.anInt822, local16.anInt830, local16.anInt823);
							local16.anInt831 = -1;
							if (local16.anInt828 == local16.anInt825 && local16.anInt825 == -1) {
								local16.method630();
							} else if (local16.anInt828 == local16.anInt825 && local16.anInt829 == local16.anInt826 && local16.anInt830 == local16.anInt827) {
								local16.method630();
							}
						}
					} else if (local16.anInt825 < 0 || Class4.method67(local16.anInt825, local16.anInt827)) {
						this.method140(local16.anInt826, local16.anInt825, local16.anInt824, local16.anInt821, local16.anInt822, local16.anInt827, local16.anInt823);
						local16.method630();
					}
				}
				anInt339++;
				if (anInt339 > 85) {
					anInt339 = 0;
					this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 120);
					return;
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("97783, " + 819 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method128() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt265; local3++) {
				if (this.anIntArray28[local3] <= 0) {
					@Pc(12) boolean local12 = false;
					try {
						if (this.anIntArray55[local3] != this.anInt376 || this.anIntArray69[local3] != this.anInt348) {
							@Pc(46) Class1_Sub1_Sub3 local46 = Class5.method74(this.anIntArray69[local3], this.anIntArray55[local3]);
							if (System.currentTimeMillis() + (long) (local46.anInt771 / 22) > this.aLong12 + (long) (this.anInt350 / 22)) {
								this.anInt350 = local46.anInt771;
								this.aLong12 = System.currentTimeMillis();
								if (this.method180(local46.anInt771, local46.aByteArray9)) {
									this.anInt376 = this.anIntArray55[local3];
									this.anInt348 = this.anIntArray69[local3];
								} else {
									local12 = true;
								}
							}
						} else if (!this.method97(this.aByte7)) {
							local12 = true;
						}
					} catch (@Pc(96) Exception local96) {
					}
					if (local12 && this.anIntArray28[local3] != -5) {
						this.anIntArray28[local3] = -5;
					} else {
						this.anInt265--;
						for (@Pc(112) int local112 = local3; local112 < this.anInt265; local112++) {
							this.anIntArray55[local112] = this.anIntArray55[local112 + 1];
							this.anIntArray69[local112] = this.anIntArray69[local112 + 1];
							this.anIntArray28[local112] = this.anIntArray28[local112 + 1];
						}
						local3--;
					}
				} else {
					@Pc(164) int local164 = this.anIntArray28[local3]--;
				}
			}
			if (this.anInt435 > 0) {
				this.anInt435 -= 20;
				if (this.anInt435 < 0) {
					this.anInt435 = 0;
				}
				if (this.anInt435 == 0 && this.aBoolean49 && !aBoolean31) {
					this.anInt276 = this.anInt274;
					this.aBoolean39 = false;
					this.aClass42_Sub1_1.method622(2, this.anInt276);
					return;
				}
			}
		} catch (@Pc(221) RuntimeException local221) {
			signlink.reporterror("99053, " + -402 + ", " + local221.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method129(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) int local4 = Class29.aClass29Array1[arg0].anInt837;
			if (local4 != 0) {
				@Pc(18) int local18 = this.anIntArray41[arg0];
				if (local4 == 1) {
					if (local18 == 1) {
						Class1_Sub1_Sub2_Sub1.method360(0.9D);
					}
					if (local18 == 2) {
						Class1_Sub1_Sub2_Sub1.method360(0.8D);
					}
					if (local18 == 3) {
						Class1_Sub1_Sub2_Sub1.method360(0.7D);
					}
					if (local18 == 4) {
						Class1_Sub1_Sub2_Sub1.method360(0.6D);
					}
					Class13.aClass39_8.method610();
					this.aBoolean47 = true;
				}
				if (local4 == 3) {
					@Pc(56) boolean local56 = this.aBoolean49;
					if (local18 == 0) {
						this.method92(this.aBoolean49, 0, this.anInt447);
						this.aBoolean49 = true;
					}
					if (local18 == 1) {
						this.method92(this.aBoolean49, -400, this.anInt447);
						this.aBoolean49 = true;
					}
					if (local18 == 2) {
						this.method92(this.aBoolean49, -800, this.anInt447);
						this.aBoolean49 = true;
					}
					if (local18 == 3) {
						this.method92(this.aBoolean49, -1200, this.anInt447);
						this.aBoolean49 = true;
					}
					if (local18 == 4) {
						this.aBoolean49 = false;
					}
					if (this.aBoolean49 != local56 && !aBoolean31) {
						if (this.aBoolean49) {
							this.anInt276 = this.anInt274;
							this.aBoolean39 = false;
							this.aClass42_Sub1_1.method622(2, this.anInt276);
						} else {
							this.method221();
						}
						this.anInt435 = 0;
					}
				}
				if (local4 == 4) {
					if (local18 == 0) {
						this.aBoolean58 = true;
						this.method174(0);
					}
					if (local18 == 1) {
						this.aBoolean58 = true;
						this.method174(-400);
					}
					if (local18 == 2) {
						this.aBoolean58 = true;
						this.method174(-800);
					}
					if (local18 == 3) {
						this.aBoolean58 = true;
						this.method174(-1200);
					}
					if (local18 == 4) {
						this.aBoolean58 = false;
					}
				}
				if (local4 == 5) {
					this.anInt390 = local18;
				}
				if (local4 == 6) {
					this.anInt437 = local18;
				}
				if (local4 == 8) {
					this.anInt322 = local18;
					this.aBoolean51 = true;
				}
			}
		} catch (@Pc(214) RuntimeException local214) {
			signlink.reporterror("57067, " + arg0 + ", " + 4 + ", " + local214.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method130() {
		try {
			if (this.anInt371 == 2) {
				this.method147((this.anInt362 - this.anInt411 << 7) + this.anInt365, this.anInt364 * 2, (this.anInt363 - this.anInt412 << 7) + this.anInt366);
				if (this.anInt289 > -1 && anInt320 % 20 < 10) {
					this.aClass1_Sub1_Sub2_Sub2Array3[2].method394(this.anInt289 - 12, this.anInt290 - 28);
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("12774, " + 281 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!d;)Z")
	private boolean method131(@OriginalArg(1) Class6 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt457;
			if (local4 == 201) {
				this.aBoolean51 = true;
				this.aBoolean63 = false;
				this.aBoolean46 = true;
				this.aString7 = "";
				this.anInt260 = 1;
				this.aString9 = "Enter name of friend to add to list";
			}
			if (local4 == 202) {
				this.aBoolean51 = true;
				this.aBoolean63 = false;
				this.aBoolean46 = true;
				this.aString7 = "";
				this.anInt260 = 2;
				this.aString9 = "Enter name of friend to delete from list";
			}
			if (local4 == 205) {
				this.anInt446 = 250;
				return true;
			}
			if (local4 == 501) {
				this.aBoolean51 = true;
				this.aBoolean63 = false;
				this.aBoolean46 = true;
				this.aString7 = "";
				this.anInt260 = 4;
				this.aString9 = "Enter name of player to add to list";
			}
			if (local4 == 502) {
				this.aBoolean51 = true;
				this.aBoolean63 = false;
				this.aBoolean46 = true;
				this.aString7 = "";
				this.anInt260 = 5;
				this.aString9 = "Enter name of player to delete from list";
			}
			@Pc(114) int local114;
			@Pc(118) int local118;
			@Pc(123) int local123;
			if (local4 >= 300 && local4 <= 313) {
				local114 = (local4 - 300) / 2;
				local118 = local4 & 0x1;
				local123 = this.anIntArray79[local114];
				if (local123 != -1) {
					while (true) {
						if (local118 == 0) {
							local123--;
							if (local123 < 0) {
								local123 = Class21.anInt723 - 1;
							}
						}
						if (local118 == 1) {
							local123++;
							if (local123 >= Class21.anInt723) {
								local123 = 0;
							}
						}
						if (!Class21.aClass21Array1[local123].aBoolean146 && Class21.aClass21Array1[local123].anInt724 == local114 + (this.aBoolean67 ? 0 : 7)) {
							this.anIntArray79[local114] = local123;
							this.aBoolean66 = true;
							break;
						}
					}
				}
			}
			if (local4 >= 314 && local4 <= 323) {
				local114 = (local4 - 314) / 2;
				local118 = local4 & 0x1;
				local123 = this.anIntArray70[local114];
				if (local118 == 0) {
					local123--;
					if (local123 < 0) {
						local123 = anIntArrayArray3[local114].length - 1;
					}
				}
				if (local118 == 1) {
					local123++;
					if (local123 >= anIntArrayArray3[local114].length) {
						local123 = 0;
					}
				}
				this.anIntArray70[local114] = local123;
				this.aBoolean66 = true;
			}
			if (local4 == 324 && !this.aBoolean67) {
				this.aBoolean67 = true;
				this.method133((byte) 7);
			}
			if (local4 == 325 && this.aBoolean67) {
				this.aBoolean67 = false;
				this.method133((byte) 7);
			}
			if (local4 == 326) {
				this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 188);
				this.aClass1_Sub1_Sub3_4.method457(this.aBoolean67 ? 0 : 1);
				for (local114 = 0; local114 < 7; local114++) {
					this.aClass1_Sub1_Sub3_4.method457(this.anIntArray79[local114]);
				}
				for (local118 = 0; local118 < 5; local118++) {
					this.aClass1_Sub1_Sub3_4.method457(this.anIntArray70[local118]);
				}
				return true;
			}
			if (local4 == 613) {
				this.aBoolean55 = !this.aBoolean55;
			}
			if (local4 >= 601 && local4 <= 612) {
				this.method143();
				if (this.aString16.length() > 0) {
					this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 144);
					this.aClass1_Sub1_Sub3_4.method463(Class46.method640(this.aString16));
					this.aClass1_Sub1_Sub3_4.method457(local4 - 601);
					this.aClass1_Sub1_Sub3_4.method457(this.aBoolean55 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(353) RuntimeException local353) {
			signlink.reporterror("9652, " + -29977 + ", " + arg0 + ", " + local353.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method88() {
		try {
			this.aBoolean47 = true;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("77280, " + -22285 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	private boolean method132(@OriginalArg(1) String arg0) {
		try {
			this.aBoolean60 &= true;
			if (arg0 == null) {
				return false;
			}
			for (@Pc(11) int local11 = 0; local11 < this.anInt306; local11++) {
				if (arg0.equalsIgnoreCase(this.aStringArray3[local11])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("53832, " + true + ", " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method133(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			this.aBoolean66 = true;
			for (@Pc(18) int local18 = 0; local18 < 7; local18++) {
				this.anIntArray79[local18] = -1;
				for (@Pc(27) int local27 = 0; local27 < Class21.anInt723; local27++) {
					if (!Class21.aClass21Array1[local27].aBoolean146 && Class21.aClass21Array1[local27].anInt724 == local18 + (this.aBoolean67 ? 0 : 7)) {
						this.anIntArray79[local18] = local27;
						break;
					}
				}
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("71077, " + arg0 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(JI)V")
	private void method134(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt306 >= 100) {
					this.method136("Your friends list is full. Max of 100 hit", 0, "");
				} else {
					@Pc(23) String local23 = Class46.method644(Class46.method641(arg0));
					for (@Pc(25) int local25 = 0; local25 < this.anInt306; local25++) {
						if (this.aLongArray4[local25] == arg0) {
							this.method136(local23 + " is already on your friend list", 0, "");
							return;
						}
					}
					for (@Pc(55) int local55 = 0; local55 < this.anInt396; local55++) {
						if (this.aLongArray3[local55] == arg0) {
							this.method136("Please remove " + local23 + " from your ignore list first", 0, "");
							return;
						}
					}
					if (!local23.equals(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4)) {
						this.aStringArray3[this.anInt306] = local23;
						this.aLongArray4[this.anInt306] = arg0;
						this.anInt442 += 0;
						this.anIntArray40[this.anInt306] = 0;
						this.anInt306++;
						this.aBoolean65 = true;
						this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 8);
						this.aClass1_Sub1_Sub3_4.method463(arg0);
					}
				}
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("45243, " + arg0 + ", " + 0 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!mb;II)V")
	private void method135(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			arg0.method477();
			@Pc(7) int local7 = arg0.method478(1);
			if (local7 != 0) {
				@Pc(21) int local21 = arg0.method478(2);
				if (local21 == 0) {
					this.anIntArray72[this.anInt418++] = this.anInt416;
				} else {
					@Pc(44) int local44;
					@Pc(54) int local54;
					if (local21 == 1) {
						local44 = arg0.method478(3);
						aClass1_Sub1_Sub1_Sub1_Sub2_1.method43(false, local44);
						local54 = arg0.method478(1);
						if (local54 == 1) {
							this.anIntArray72[this.anInt418++] = this.anInt416;
						}
					} else {
						@Pc(98) int local98;
						if (local21 == 2) {
							local44 = arg0.method478(3);
							aClass1_Sub1_Sub1_Sub1_Sub2_1.method43(true, local44);
							local54 = arg0.method478(3);
							aClass1_Sub1_Sub1_Sub1_Sub2_1.method43(true, local54);
							local98 = arg0.method478(1);
							if (local98 == 1) {
								this.anIntArray72[this.anInt418++] = this.anInt416;
							}
						} else if (local21 == 3) {
							this.anInt253 = arg0.method478(2);
							local44 = arg0.method478(7);
							local54 = arg0.method478(7);
							local98 = arg0.method478(1);
							aClass1_Sub1_Sub1_Sub1_Sub2_1.method42(local98 == 1, local54, local44);
							@Pc(154) int local154 = arg0.method478(1);
							if (local154 == 1) {
								this.anIntArray72[this.anInt418++] = this.anInt416;
							}
						}
					}
				}
			}
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("8916, " + arg0 + ", " + arg1 + ", " + -33779 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Z)V")
	private void method136(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		try {
			if (arg1 == 0 && this.anInt431 != -1) {
				this.aString12 = arg0;
				super.anInt243 = 0;
			}
			if (this.anInt419 == -1) {
				this.aBoolean51 = true;
			}
			for (@Pc(26) int local26 = 99; local26 > 0; local26--) {
				this.anIntArray25[local26] = this.anIntArray25[local26 - 1];
				this.aStringArray1[local26] = this.aStringArray1[local26 - 1];
				this.aStringArray2[local26] = this.aStringArray2[local26 - 1];
			}
			this.anIntArray25[0] = arg1;
			this.aStringArray1[0] = arg2;
			this.aStringArray2[0] = arg0;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("10874, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method137() {
		try {
			this.aBoolean60 &= true;
			@Pc(17) int local17;
			for (@Pc(9) int local9 = -1; local9 < this.anInt417; local9++) {
				if (local9 == -1) {
					local17 = this.anInt416;
				} else {
					local17 = this.anIntArray71[local9];
				}
				@Pc(29) Class1_Sub1_Sub1_Sub1_Sub2 local29 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local17];
				if (local29 != null) {
					this.method200(local29, 1);
				}
			}
			anInt429++;
			if (anInt429 > 1406) {
				anInt429 = 0;
				this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 124);
				this.aClass1_Sub1_Sub3_4.method457(0);
				local17 = this.aClass1_Sub1_Sub3_4.anInt771;
				this.aClass1_Sub1_Sub3_4.method457(162);
				this.aClass1_Sub1_Sub3_4.method457(22);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_4.method457(84);
				}
				this.aClass1_Sub1_Sub3_4.method458(31824);
				this.aClass1_Sub1_Sub3_4.method458(13490);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_4.method457(123);
				}
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_4.method457(134);
				}
				this.aClass1_Sub1_Sub3_4.method457(100);
				this.aClass1_Sub1_Sub3_4.method457(94);
				this.aClass1_Sub1_Sub3_4.method458(35521);
				this.aClass1_Sub1_Sub3_4.method466(this.aClass1_Sub1_Sub3_4.anInt771 - local17);
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("10374, " + true + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method138() {
		try {
			while (true) {
				@Pc(10) Class1_Sub1_Sub4 local10 = this.aClass42_Sub1_1.method624();
				if (local10 == null) {
					return;
				}
				if (local10.anInt804 == 0) {
					Class1_Sub1_Sub1_Sub5.method276(local10.aByteArray10, local10.anInt805);
					if ((this.aClass42_Sub1_1.method621(local10.anInt805, 547) & 0x62) != 0) {
						this.aBoolean65 = true;
						if (this.anInt419 != -1) {
							this.aBoolean51 = true;
						}
					}
				}
				if (local10.anInt804 == 1 && local10.aByteArray10 != null) {
					Class14.method328(local10.aByteArray10);
				}
				if (local10.anInt804 == 2 && local10.anInt805 == this.anInt276 && local10.aByteArray10 != null) {
					this.method186(local10.aByteArray10, this.aBoolean39);
				}
				if (local10.anInt804 == 3 && this.anInt281 == 1) {
					for (@Pc(81) int local81 = 0; local81 < this.aByteArrayArray2.length; local81++) {
						if (this.anIntArray74[local81] == local10.anInt805) {
							this.aByteArrayArray2[local81] = local10.aByteArray10;
							if (local10.aByteArray10 == null) {
								this.anIntArray74[local81] = -1;
							}
							break;
						}
						if (this.anIntArray75[local81] == local10.anInt805) {
							this.aByteArrayArray1[local81] = local10.aByteArray10;
							if (local10.aByteArray10 == null) {
								this.anIntArray75[local81] = -1;
							}
							break;
						}
					}
				}
				if (local10.anInt804 == 93 && this.aClass42_Sub1_1.method620(local10.anInt805)) {
					Class4.method54(new Class1_Sub1_Sub3(699, local10.aByteArray10), this.aClass42_Sub1_1);
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("38806, " + -125 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method139() {
		try {
			this.aBoolean41 = false;
			while (this.aBoolean48) {
				this.aBoolean41 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(13) Exception local13) {
				}
			}
			this.aClass1_Sub1_Sub2_Sub3_8 = null;
			this.aClass1_Sub1_Sub2_Sub3_9 = null;
			this.aClass1_Sub1_Sub2_Sub3Array3 = null;
			this.anIntArray80 = null;
			this.anIntArray81 = null;
			this.anIntArray82 = null;
			this.anIntArray83 = null;
			this.anIntArray26 = null;
			this.anIntArray27 = null;
			this.anIntArray48 = null;
			this.anIntArray49 = null;
			this.aClass1_Sub1_Sub2_Sub2_10 = null;
			this.aClass1_Sub1_Sub2_Sub2_11 = null;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("97711, " + 715 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method85() {
		try {
			if (!this.aBoolean43 && !this.aBoolean56 && !this.aBoolean45) {
				anInt320++;
				if (this.aBoolean60) {
					this.method124();
				} else {
					this.method112();
				}
				this.method138();
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("51534, " + 2 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZIIIII)V")
	private void method140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			this.aBoolean60 &= true;
			if (arg6 >= 1 && arg2 >= 1 && arg6 <= 102 && arg2 <= 102) {
				if (aBoolean31 && arg3 != this.anInt253) {
					return;
				}
				@Pc(26) int local26 = 0;
				if (arg4 == 0) {
					local26 = this.aClass37_1.method575(arg3, arg6, arg2);
				}
				if (arg4 == 1) {
					local26 = this.aClass37_1.method576(arg3, arg2, arg6);
				}
				if (arg4 == 2) {
					local26 = this.aClass37_1.method577(arg3, arg6, arg2);
				}
				if (arg4 == 3) {
					local26 = this.aClass37_1.method578(arg3, arg6, arg2);
				}
				@Pc(82) int local82;
				if (local26 != 0) {
					local82 = this.aClass37_1.method579(arg3, arg6, arg2, local26);
					@Pc(88) int local88 = local26 >> 14 & 0x7FFF;
					@Pc(92) int local92 = local82 & 0x1F;
					@Pc(96) int local96 = local82 >> 6;
					@Pc(108) Class9 local108;
					if (arg4 == 0) {
						this.aClass37_1.method566(arg2, arg3, arg6);
						local108 = Class9.method249(local88);
						if (local108.aBoolean88) {
							this.aClass17Array1[arg3].method373(local108.aBoolean89, local96, local92, arg6, arg2);
						}
					}
					if (arg4 == 1) {
						this.aClass37_1.method567(arg3, arg6, arg2);
					}
					if (arg4 == 2) {
						this.aClass37_1.method568(arg6, arg2, arg3);
						local108 = Class9.method249(local88);
						if (arg6 + local108.anInt520 > 103 || arg2 + local108.anInt520 > 103 || arg6 + local108.anInt521 > 103 || arg2 + local108.anInt521 > 103) {
							return;
						}
						if (local108.aBoolean88) {
							this.aClass17Array1[arg3].method374(local108.aBoolean89, arg6, arg2, local108.anInt520, local108.anInt521, local96);
						}
					}
					if (arg4 == 3) {
						this.aClass37_1.method569(arg2, arg6, arg3);
						local108 = Class9.method249(local88);
						if (local108.aBoolean88 && local108.aBoolean90) {
							this.aClass17Array1[arg3].method376(arg2, arg6, 695);
						}
					}
				}
				if (arg1 >= 0) {
					local82 = arg3;
					if (arg3 < 3 && (this.aByteArrayArrayArray7[1][arg6][arg2] & 0x2) == 2) {
						local82 = arg3 + 1;
					}
					Class4.method68(this.aClass17Array1[arg3], arg2, arg1, this.anIntArrayArrayArray3, local82, arg0, this.aClass37_1, arg3, arg5, arg6);
					return;
				}
			}
		} catch (@Pc(255) RuntimeException local255) {
			signlink.reporterror("38173, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local255.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!jb;B)V")
	private void method141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub2_Sub2 arg2) {
		try {
			@Pc(7) int local7 = this.anInt439 + this.anInt283 & 0x7FF;
			@Pc(18) int local18 = arg1 * arg1 + arg0 * arg0;
			if (local18 <= 6400) {
				@Pc(26) int local26 = Class1_Sub1_Sub1_Sub5.anIntArray148[local7];
				@Pc(30) int local30 = Class1_Sub1_Sub1_Sub5.anIntArray149[local7];
				@Pc(39) int local39 = local26 * 256 / (this.anInt346 + 256);
				@Pc(48) int local48 = local30 * 256 / (this.anInt346 + 256);
				@Pc(58) int local58 = arg0 * local39 + arg1 * local48 >> 16;
				@Pc(68) int local68 = arg0 * local48 - arg1 * local39 >> 16;
				if (local18 > 2500) {
					arg2.method401(this.aClass1_Sub1_Sub2_Sub3_14, local58 + 94 - arg2.anInt688 / 2, 83 - local68 - arg2.anInt689 / 2);
				} else {
					arg2.method394(local58 + 94 - arg2.anInt688 / 2, 83 - local68 - arg2.anInt689 / 2);
				}
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("93439, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method142(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				if (this.aBoolean63) {
					this.aBoolean63 = false;
					this.aBoolean51 = true;
				}
				@Pc(18) int local18 = this.anIntArray56[arg0];
				@Pc(23) int local23 = this.anIntArray57[arg0];
				@Pc(28) int local28 = this.anIntArray58[arg0];
				@Pc(33) int local33 = this.anIntArray59[arg0];
				if (local28 >= 2000) {
					local28 -= 2000;
				}
				@Pc(87) boolean local87;
				if (local28 == 224 || local28 == 993 || local28 == 99 || local28 == 746 || local28 == 877) {
					local87 = this.method94(false, local23, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0], 0, 0, 2, (byte) 8, 0, local18, 0, 0);
					if (!local87) {
						this.method94(false, local23, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0], 0, 0, 2, (byte) 8, 1, local18, 0, 1);
					}
					this.anInt372 = super.anInt244;
					this.anInt373 = super.anInt245;
					this.anInt375 = 2;
					this.anInt374 = 0;
					if (local28 == 993) {
						this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 46);
					}
					if (local28 == 224) {
						this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 186);
					}
					if (local28 == 877) {
						this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 139);
					}
					if (local28 == 99) {
						this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 86);
					}
					if (local28 == 746) {
						this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 195);
					}
					this.aClass1_Sub1_Sub3_4.method458(local18 + this.anInt411);
					this.aClass1_Sub1_Sub3_4.method458(local23 + this.anInt412);
					this.aClass1_Sub1_Sub3_4.method458(local33);
				}
				@Pc(202) int local202;
				@Pc(219) String local219;
				@Pc(223) int local223;
				@Pc(198) String local198;
				if (local28 == 903 || local28 == 363) {
					local198 = this.aStringArray5[arg0];
					local202 = local198.indexOf("@whi@");
					if (local202 != -1) {
						local198 = local198.substring(local202 + 5).trim();
						local219 = Class46.method644(Class46.method641(Class46.method640(local198)));
						@Pc(221) boolean local221 = false;
						for (local223 = 0; local223 < this.anInt417; local223++) {
							@Pc(233) Class1_Sub1_Sub1_Sub1_Sub2 local233 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray71[local223]];
							if (local233 != null && local233.aString4 != null && local233.aString4.equalsIgnoreCase(local219)) {
								this.method94(false, local233.anIntArray8[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0], 0, 0, 2, (byte) 8, 1, local233.anIntArray7[0], 0, 1);
								if (local28 == 903) {
									this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 192);
								}
								if (local28 == 363) {
									this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 223);
								}
								this.aClass1_Sub1_Sub3_4.method458(this.anIntArray71[local223]);
								local221 = true;
								break;
							}
						}
						if (!local221) {
							this.method136("Unable to find " + local219, 0, "");
						}
					}
				}
				@Pc(338) Class1_Sub1_Sub1_Sub1_Sub1 local338;
				if (local28 == 728 || local28 == 542 || local28 == 6 || local28 == 963 || local28 == 245) {
					local338 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
					if (local338 != null) {
						this.method94(false, local338.anIntArray8[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0], 0, 0, 2, (byte) 8, 1, local338.anIntArray7[0], 0, 1);
						this.anInt372 = super.anInt244;
						this.anInt373 = super.anInt245;
						this.anInt375 = 2;
						this.anInt374 = 0;
						if (local28 == 963) {
							this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 99);
						}
						if (local28 == 6) {
							if ((local33 & 0x3) == 0) {
								anInt269++;
							}
							if (anInt269 >= 124) {
								this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 55);
								this.aClass1_Sub1_Sub3_4.method461(0);
							}
							this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 237);
						}
						if (local28 == 542) {
							this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 158);
						}
						if (local28 == 728) {
							this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 149);
						}
						if (local28 == 245) {
							if ((local33 & 0x3) == 0) {
								anInt394++;
							}
							if (anInt394 >= 85) {
								this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 174);
								this.aClass1_Sub1_Sub3_4.method458(39596);
							}
							this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 242);
						}
						this.aClass1_Sub1_Sub3_4.method458(local33);
					}
				}
				@Pc(480) Class1_Sub1_Sub1_Sub1_Sub2 local480;
				if (local28 == 651) {
					local480 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
					if (local480 != null) {
						this.method94(false, local480.anIntArray8[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0], 0, 0, 2, (byte) 8, 1, local480.anIntArray7[0], 0, 1);
						this.anInt372 = super.anInt244;
						this.anInt373 = super.anInt245;
						this.anInt375 = 2;
						this.anInt374 = 0;
						this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 116);
						this.aClass1_Sub1_Sub3_4.method458(local33);
						this.aClass1_Sub1_Sub3_4.method458(this.anInt267);
					}
				}
				@Pc(561) String local561;
				@Pc(545) Class6 local545;
				if (local28 == 930) {
					local545 = Class6.aClass6Array1[local23];
					this.anInt266 = 1;
					this.anInt267 = local23;
					this.anInt268 = local545.anInt480;
					this.anInt285 = 0;
					local561 = local545.aString20;
					if (local561.indexOf(" ") != -1) {
						local561 = local561.substring(0, local561.indexOf(" "));
					}
					local219 = local545.aString20;
					if (local219.indexOf(" ") != -1) {
						local219 = local219.substring(local219.indexOf(" ") + 1);
					}
					this.aString5 = local561 + " " + local545.aString21 + " " + local219;
					if (this.anInt268 == 16) {
						this.aBoolean65 = true;
						this.anInt436 = 3;
						this.aBoolean36 = true;
					}
				} else {
					@Pc(626) Class13 local626;
					if (local28 == 1102) {
						local626 = Class13.method316(local33);
						if (local626.aByteArray6 == null) {
							local561 = "It's a " + local626.aString25 + ".";
						} else {
							local561 = new String(local626.aByteArray6);
						}
						this.method136(local561, 0, "");
					}
					if (local28 == 265) {
						local338 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
						if (local338 != null) {
							this.method94(false, local338.anIntArray8[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0], 0, 0, 2, (byte) 8, 1, local338.anIntArray7[0], 0, 1);
							this.anInt372 = super.anInt244;
							this.anInt373 = super.anInt245;
							this.anInt375 = 2;
							this.anInt374 = 0;
							this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 114);
							this.aClass1_Sub1_Sub3_4.method458(local33);
							this.aClass1_Sub1_Sub3_4.method458(this.anInt267);
						}
					}
					if (local28 == 1607) {
						local338 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
						if (local338 != null) {
							if (local338.aClass11_1.aByteArray5 == null) {
								local561 = "It's a " + local338.aClass11_1.aString24 + ".";
							} else {
								local561 = new String(local338.aClass11_1.aByteArray5);
							}
							this.method136(local561, 0, "");
						}
					}
					if (local28 == 217) {
						local87 = this.method94(false, local23, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0], 0, 0, 2, (byte) 8, 0, local18, 0, 0);
						if (!local87) {
							this.method94(false, local23, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0], 0, 0, 2, (byte) 8, 1, local18, 0, 1);
						}
						this.anInt372 = super.anInt244;
						this.anInt373 = super.anInt245;
						this.anInt375 = 2;
						this.anInt374 = 0;
						this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 76);
						this.aClass1_Sub1_Sub3_4.method458(local18 + this.anInt411);
						this.aClass1_Sub1_Sub3_4.method458(local23 + this.anInt412);
						this.aClass1_Sub1_Sub3_4.method458(local33);
						this.aClass1_Sub1_Sub3_4.method458(this.anInt288);
						this.aClass1_Sub1_Sub3_4.method458(this.anInt286);
						this.aClass1_Sub1_Sub3_4.method458(this.anInt287);
					}
					if (local28 == 1175) {
						@Pc(870) int local870 = local33 >> 14 & 0x7FFF;
						@Pc(873) Class9 local873 = Class9.method249(local870);
						if (local873.aByteArray4 == null) {
							local219 = "It's a " + local873.aString23 + ".";
						} else {
							local219 = new String(local873.aByteArray4);
						}
						this.method136(local219, 0, "");
					}
					if (local28 == 947) {
						this.method143();
					}
					if (local28 == 602 || local28 == 596 || local28 == 22 || local28 == 892 || local28 == 415) {
						if (local28 == 596) {
							this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 81);
						}
						if (local28 == 415) {
							if ((local23 & 0x3) == 0) {
								anInt261++;
							}
							if (anInt261 >= 55) {
								this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 126);
								this.aClass1_Sub1_Sub3_4.method461(0);
							}
							this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 154);
						}
						if (local28 == 22) {
							this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 239);
						}
						if (local28 == 602) {
							this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 22);
						}
						if (local28 == 892) {
							if ((local18 & 0x3) == 0) {
								anInt406++;
							}
							if (anInt406 >= 130) {
								this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 36);
								this.aClass1_Sub1_Sub3_4.method457(177);
							}
							this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 77);
						}
						this.aClass1_Sub1_Sub3_4.method458(local33);
						this.aClass1_Sub1_Sub3_4.method458(local18);
						this.aClass1_Sub1_Sub3_4.method458(local23);
						this.anInt423 = 0;
						this.anInt424 = local23;
						this.anInt425 = local18;
						this.anInt426 = 2;
						if (Class6.aClass6Array1[local23].anInt454 == this.anInt449) {
							this.anInt426 = 1;
						}
						if (Class6.aClass6Array1[local23].anInt454 == this.anInt419) {
							this.anInt426 = 3;
						}
					}
					if (local28 == 285) {
						this.method181(47, local33, local23, local18);
					}
					if (local28 == 951) {
						local545 = Class6.aClass6Array1[local23];
						@Pc(1073) boolean local1073 = true;
						if (local545.anInt457 > 0) {
							local1073 = this.method131(local545);
						}
						if (local1073) {
							this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 111);
							this.aClass1_Sub1_Sub3_4.method458(local23);
						}
					}
					if (local28 == 504) {
						this.method181(185, local33, local23, local18);
					}
					if (local28 == 1501) {
						anInt391 += this.anInt412;
						if (anInt391 >= 92) {
							this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 220);
							this.aClass1_Sub1_Sub3_4.method461(0);
						}
						this.method181(134, local33, local23, local18);
					}
					if (local28 == 188) {
						this.anInt285 = 1;
						this.anInt286 = local18;
						this.anInt287 = local23;
						this.anInt288 = local33;
						this.aString6 = Class13.method316(local33).aString25;
						this.anInt266 = 0;
					} else {
						if (local28 == 960) {
							this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 111);
							this.aClass1_Sub1_Sub3_4.method458(local23);
							local545 = Class6.aClass6Array1[local23];
							if (local545.anIntArrayArray6 != null && local545.anIntArrayArray6[0][0] == 5) {
								local202 = local545.anIntArrayArray6[0][1];
								if (this.anIntArray41[local202] != local545.anIntArray89[0]) {
									this.anIntArray41[local202] = local545.anIntArray89[0];
									this.method129(local202);
									this.aBoolean65 = true;
								}
							}
						}
						if (local28 == 367) {
							local480 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
							if (local480 != null) {
								this.method94(false, local480.anIntArray8[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0], 0, 0, 2, (byte) 8, 1, local480.anIntArray7[0], 0, 1);
								this.anInt372 = super.anInt244;
								this.anInt373 = super.anInt245;
								this.anInt375 = 2;
								this.anInt374 = 0;
								this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 101);
								this.aClass1_Sub1_Sub3_4.method458(local33);
								this.aClass1_Sub1_Sub3_4.method458(this.anInt288);
								this.aClass1_Sub1_Sub3_4.method458(this.anInt286);
								this.aClass1_Sub1_Sub3_4.method458(this.anInt287);
							}
						}
						@Pc(1315) long local1315;
						if (local28 == 679) {
							local198 = this.aStringArray5[arg0];
							local202 = local198.indexOf("@whi@");
							if (local202 != -1) {
								local1315 = Class46.method640(local198.substring(local202 + 5).trim());
								local223 = -1;
								for (@Pc(1319) int local1319 = 0; local1319 < this.anInt306; local1319++) {
									if (this.aLongArray4[local1319] == local1315) {
										local223 = local1319;
										break;
									}
								}
								if (local223 != -1 && this.anIntArray40[local223] > 0) {
									this.aBoolean51 = true;
									this.aBoolean63 = false;
									this.aBoolean46 = true;
									this.aString7 = "";
									this.anInt260 = 3;
									this.aLong11 = this.aLongArray4[local223];
									this.aString9 = "Enter message to send to " + this.aStringArray3[local223];
								}
							}
						}
						if (local28 == 660) {
							if (this.aBoolean54) {
								this.aClass37_1.method587(local23 - 11, local18 - 8);
							} else {
								this.aClass37_1.method587(super.anInt245 - 11, super.anInt244 - 8);
							}
						}
						if (local28 == 965) {
							local87 = this.method94(false, local23, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0], 0, 0, 2, (byte) 8, 0, local18, 0, 0);
							if (!local87) {
								this.method94(false, local23, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0], 0, 0, 2, (byte) 8, 1, local18, 0, 1);
							}
							this.anInt372 = super.anInt244;
							this.anInt373 = super.anInt245;
							this.anInt375 = 2;
							this.anInt374 = 0;
							this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 78);
							this.aClass1_Sub1_Sub3_4.method458(local18 + this.anInt411);
							this.aClass1_Sub1_Sub3_4.method458(local23 + this.anInt412);
							this.aClass1_Sub1_Sub3_4.method458(local33);
							this.aClass1_Sub1_Sub3_4.method458(this.anInt267);
						}
						if (local28 == 465) {
							this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 111);
							this.aClass1_Sub1_Sub3_4.method458(local23);
							local545 = Class6.aClass6Array1[local23];
							if (local545.anIntArrayArray6 != null && local545.anIntArrayArray6[0][0] == 5) {
								local202 = local545.anIntArrayArray6[0][1];
								this.anIntArray41[local202] = 1 - this.anIntArray41[local202];
								this.method129(local202);
								this.aBoolean65 = true;
							}
						}
						if (local28 == 405 || local28 == 38 || local28 == 422 || local28 == 478 || local28 == 347) {
							if (local28 == 347) {
								this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 127);
							}
							if (local28 == 422) {
								this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 176);
							}
							if (local28 == 478) {
								if ((local18 & 0x3) == 0) {
									anInt254++;
								}
								if (anInt254 >= 90) {
									this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 52);
								}
								this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 85);
							}
							if (local28 == 405) {
								anInt361 += local33;
								if (anInt361 >= 97) {
									this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 161);
									this.aClass1_Sub1_Sub3_4.method460(14953816);
								}
								this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 93);
							}
							if (local28 == 38) {
								this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 203);
							}
							this.aClass1_Sub1_Sub3_4.method458(local33);
							this.aClass1_Sub1_Sub3_4.method458(local18);
							this.aClass1_Sub1_Sub3_4.method458(local23);
							this.anInt423 = 0;
							this.anInt424 = local23;
							this.anInt425 = local18;
							this.anInt426 = 2;
							if (Class6.aClass6Array1[local23].anInt454 == this.anInt449) {
								this.anInt426 = 1;
							}
							if (Class6.aClass6Array1[local23].anInt454 == this.anInt419) {
								this.anInt426 = 3;
							}
						}
						if (local28 == 44 && !this.aBoolean38) {
							this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 157);
							this.aClass1_Sub1_Sub3_4.method458(local23);
							this.aBoolean38 = true;
						}
						if (local28 == 881) {
							this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 45);
							this.aClass1_Sub1_Sub3_4.method458(local33);
							this.aClass1_Sub1_Sub3_4.method458(local18);
							this.aClass1_Sub1_Sub3_4.method458(local23);
							this.aClass1_Sub1_Sub3_4.method458(this.anInt288);
							this.aClass1_Sub1_Sub3_4.method458(this.anInt286);
							this.aClass1_Sub1_Sub3_4.method458(this.anInt287);
							this.anInt423 = 0;
							this.anInt424 = local23;
							this.anInt425 = local18;
							this.anInt426 = 2;
							if (Class6.aClass6Array1[local23].anInt454 == this.anInt449) {
								this.anInt426 = 1;
							}
							if (Class6.aClass6Array1[local23].anInt454 == this.anInt419) {
								this.anInt426 = 3;
							}
						}
						if (local28 == 406 || local28 == 436 || local28 == 557 || local28 == 556) {
							local198 = this.aStringArray5[arg0];
							local202 = local198.indexOf("@whi@");
							if (local202 != -1) {
								local1315 = Class46.method640(local198.substring(local202 + 5).trim());
								if (local28 == 406) {
									this.method134(local1315);
								}
								if (local28 == 436) {
									this.method111(local1315);
								}
								if (local28 == 557) {
									this.method145(local1315);
								}
								if (local28 == 556) {
									this.method195(local1315);
								}
							}
						}
						if (local28 == 581) {
							if ((local33 & 0x3) == 0) {
								anInt434++;
							}
							if (anInt434 >= 99) {
								this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 255);
								this.aClass1_Sub1_Sub3_4.method461(0);
							}
							this.method181(83, local33, local23, local18);
						}
						if (local28 == 1773) {
							local626 = Class13.method316(local33);
							if (local23 >= 100000) {
								local561 = local23 + " x " + local626.aString25;
							} else if (local626.aByteArray6 == null) {
								local561 = "It's a " + local626.aString25 + ".";
							} else {
								local561 = new String(local626.aByteArray6);
							}
							this.method136(local561, 0, "");
						}
						if (local28 == 391) {
							this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 90);
							this.aClass1_Sub1_Sub3_4.method458(local33);
							this.aClass1_Sub1_Sub3_4.method458(local18);
							this.aClass1_Sub1_Sub3_4.method458(local23);
							this.aClass1_Sub1_Sub3_4.method458(this.anInt267);
							this.anInt423 = 0;
							this.anInt424 = local23;
							this.anInt425 = local18;
							this.anInt426 = 2;
							if (Class6.aClass6Array1[local23].anInt454 == this.anInt449) {
								this.anInt426 = 1;
							}
							if (Class6.aClass6Array1[local23].anInt454 == this.anInt419) {
								this.anInt426 = 3;
							}
						}
						if (local28 == 364) {
							this.method181(75, local33, local23, local18);
						}
						if (local28 == 1373 || local28 == 1544 || local28 == 151 || local28 == 1101) {
							local480 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
							if (local480 != null) {
								this.method94(false, local480.anIntArray8[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0], 0, 0, 2, (byte) 8, 1, local480.anIntArray7[0], 0, 1);
								this.anInt372 = super.anInt244;
								this.anInt373 = super.anInt245;
								this.anInt375 = 2;
								this.anInt374 = 0;
								if (local28 == 151) {
									anInt249++;
									if (anInt249 >= 90) {
										this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 65);
										this.aClass1_Sub1_Sub3_4.method458(31114);
									}
									this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 94);
								}
								if (local28 == 1544) {
									this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 66);
								}
								if (local28 == 1101) {
									this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 223);
								}
								if (local28 == 1373) {
									this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 192);
								}
								this.aClass1_Sub1_Sub3_4.method458(local33);
							}
						}
						if (local28 == 450 && this.method181(160, local33, local23, local18)) {
							this.aClass1_Sub1_Sub3_4.method458(this.anInt288);
							this.aClass1_Sub1_Sub3_4.method458(this.anInt286);
							this.aClass1_Sub1_Sub3_4.method458(this.anInt287);
						}
						if (local28 == 34) {
							local198 = this.aStringArray5[arg0];
							local202 = local198.indexOf("@whi@");
							if (local202 != -1) {
								this.method143();
								this.aString16 = local198.substring(local202 + 5).trim();
								this.aBoolean55 = false;
								for (@Pc(2161) int local2161 = 0; local2161 < Class6.aClass6Array1.length; local2161++) {
									if (Class6.aClass6Array1[local2161] != null && Class6.aClass6Array1[local2161].anInt457 == 600) {
										this.anInt264 = this.anInt449 = Class6.aClass6Array1[local2161].anInt454;
										break;
									}
								}
							}
						}
						if (local28 == 900) {
							local338 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
							if (local338 != null) {
								this.method94(false, local338.anIntArray8[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0], 0, 0, 2, (byte) 8, 1, local338.anIntArray7[0], 0, 1);
								this.anInt372 = super.anInt244;
								this.anInt373 = super.anInt245;
								this.anInt375 = 2;
								this.anInt374 = 0;
								this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 21);
								this.aClass1_Sub1_Sub3_4.method458(local33);
								this.aClass1_Sub1_Sub3_4.method458(this.anInt288);
								this.aClass1_Sub1_Sub3_4.method458(this.anInt286);
								this.aClass1_Sub1_Sub3_4.method458(this.anInt287);
							}
						}
						if (local28 == 55 && this.method181(62, local33, local23, local18)) {
							this.aClass1_Sub1_Sub3_4.method458(this.anInt267);
						}
						this.anInt285 = 0;
						this.anInt266 = 0;
					}
				}
			}
		} catch (@Pc(2289) RuntimeException local2289) {
			signlink.reporterror("85189, " + arg0 + ", " + 2 + ", " + local2289.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method143() {
		try {
			this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 224);
			if (this.anInt358 != -1) {
				this.anInt358 = -1;
				this.aBoolean65 = true;
				this.aBoolean38 = false;
				this.aBoolean36 = true;
			}
			if (this.anInt419 != -1) {
				this.anInt419 = -1;
				this.aBoolean51 = true;
				this.aBoolean38 = false;
			}
			this.anInt449 = -1;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("42312, " + -968 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method144() {
		try {
			this.method171();
			this.aClass36_18.method545();
			this.aClass1_Sub1_Sub2_Sub3_8.method422(0, 0, 373);
			@Pc(47) byte local47;
			@Pc(59) int local59;
			if (this.anInt307 == 0) {
				this.aClass1_Sub1_Sub2_Sub4_1.method441((byte) 9, true, 180, this.aClass42_Sub1_1.aString29, 7711145, 180);
				local47 = 80;
				this.aClass1_Sub1_Sub2_Sub4_3.method441((byte) 9, true, 80, "Welcome to RuneScape", 16776960, 180);
				local59 = local47 + 30;
				this.aClass1_Sub1_Sub2_Sub3_9.method422(27, 100, 373);
				this.aClass1_Sub1_Sub2_Sub4_3.method441((byte) 9, true, 125, "New user", 16777215, 100);
				this.aClass1_Sub1_Sub2_Sub3_9.method422(187, 100, 373);
				this.aClass1_Sub1_Sub2_Sub4_3.method441((byte) 9, true, 125, "Existing User", 16777215, 260);
			}
			if (this.anInt307 == 2) {
				local47 = 60;
				if (this.aString10.length() > 0) {
					this.aClass1_Sub1_Sub2_Sub4_3.method441((byte) 9, true, 45, this.aString10, 16776960, 180);
					this.aClass1_Sub1_Sub2_Sub4_3.method441((byte) 9, true, 60, this.aString11, 16776960, 180);
					local59 = local47 + 30;
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method441((byte) 9, true, 53, this.aString11, 16776960, 180);
					local59 = local47 + 30;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method445(true, "Username: " + this.aString13 + (this.anInt310 == 0 & anInt320 % 40 < 20 ? "@yel@|" : ""), 16777215, 90, 90);
				local59 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method445(true, "Password: " + Class46.method646(this.aString14) + (this.anInt310 == 1 & anInt320 % 40 < 20 ? "@yel@|" : ""), 16777215, 105, 92);
				local59 += 15;
				this.aClass1_Sub1_Sub2_Sub3_9.method422(27, 130, 373);
				this.aClass1_Sub1_Sub2_Sub4_3.method441((byte) 9, true, 155, "Login", 16777215, 100);
				this.aClass1_Sub1_Sub2_Sub3_9.method422(187, 130, 373);
				this.aClass1_Sub1_Sub2_Sub4_3.method441((byte) 9, true, 155, "Cancel", 16777215, 260);
			}
			if (this.anInt307 == 3) {
				this.aClass1_Sub1_Sub2_Sub4_3.method441((byte) 9, true, 40, "Create a free account", 16776960, 180);
				local47 = 65;
				this.aClass1_Sub1_Sub2_Sub4_3.method441((byte) 9, true, 65, "To create a new account you need to", 16777215, 180);
				local59 = local47 + 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method441((byte) 9, true, 80, "go back to the main RuneScape webpage", 16777215, 180);
				local59 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method441((byte) 9, true, 95, "and choose the red 'create account'", 16777215, 180);
				local59 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method441((byte) 9, true, 110, "button at the top right of that page.", 16777215, 180);
				local59 += 15;
				this.aClass1_Sub1_Sub2_Sub3_9.method422(107, 130, 373);
				this.aClass1_Sub1_Sub2_Sub4_3.method441((byte) 9, true, 155, "Cancel", 16777215, 180);
			}
			this.aClass36_18.method546(214, super.aGraphics2, 186);
			if (this.aBoolean47) {
				this.aBoolean47 = false;
				this.aClass36_16.method546(128, super.aGraphics2, 0);
				this.aClass36_17.method546(214, super.aGraphics2, 386);
				this.aClass36_21.method546(0, super.aGraphics2, 265);
				this.aClass36_22.method546(574, super.aGraphics2, 265);
				this.aClass36_23.method546(128, super.aGraphics2, 186);
				this.aClass36_24.method546(574, super.aGraphics2, 186);
			}
		} catch (@Pc(490) RuntimeException local490) {
			signlink.reporterror("31349, " + false + ", " + local490.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt250 = Integer.parseInt(this.getParameter("nodeid"));
		anInt251 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method125();
		} else {
			method179();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean30 = false;
		} else {
			aBoolean30 = true;
		}
		this.method80();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BJ)V")
	private void method145(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(19) int local19 = 0; local19 < this.anInt306; local19++) {
					if (this.aLongArray4[local19] == arg0) {
						this.anInt306--;
						this.aBoolean65 = true;
						for (@Pc(39) int local39 = local19; local39 < this.anInt306; local39++) {
							this.aStringArray3[local39] = this.aStringArray3[local39 + 1];
							this.anIntArray40[local39] = this.anIntArray40[local39 + 1];
							this.aLongArray4[local39] = this.aLongArray4[local39 + 1];
						}
						this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 39);
						this.aClass1_Sub1_Sub3_4.method463(arg0);
						return;
					}
				}
			}
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("32901, " + 8 + ", " + arg0 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!z;II)V")
	private void method146(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		try {
			this.method147(arg0.anInt135, arg1, arg0.anInt136);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("22188, " + arg0 + ", " + -109 + ", " + arg1 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZI)V")
	private void method147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 >= 128 && arg2 >= 128 && arg0 <= 13056 && arg2 <= 13056) {
				@Pc(28) int local28 = this.method177(arg2, arg0, this.anInt253) - arg1;
				@Pc(38) int local38 = arg0 - this.anInt293;
				@Pc(43) int local43 = local28 - this.anInt294;
				@Pc(48) int local48 = arg2 - this.anInt295;
				@Pc(53) int local53 = Class1_Sub1_Sub1_Sub5.anIntArray148[this.anInt296];
				@Pc(58) int local58 = Class1_Sub1_Sub1_Sub5.anIntArray149[this.anInt296];
				@Pc(63) int local63 = Class1_Sub1_Sub1_Sub5.anIntArray148[this.anInt297];
				@Pc(68) int local68 = Class1_Sub1_Sub1_Sub5.anIntArray149[this.anInt297];
				@Pc(78) int local78 = local48 * local63 + local38 * local68 >> 16;
				@Pc(88) int local88 = local48 * local68 - local38 * local63 >> 16;
				@Pc(90) int local90 = local78;
				@Pc(100) int local100 = local43 * local58 - local88 * local53 >> 16;
				@Pc(110) int local110 = local43 * local53 + local88 * local58 >> 16;
				if (local110 >= 50) {
					this.anInt289 = Class1_Sub1_Sub2_Sub1.anInt651 + (local90 << 9) / local110;
					this.anInt290 = Class1_Sub1_Sub2_Sub1.anInt652 + (local100 << 9) / local110;
				} else {
					this.anInt289 = -1;
					this.anInt290 = -1;
				}
			} else {
				this.anInt289 = -1;
				this.anInt290 = -1;
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("63657, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method148() {
		try {
			@Pc(22) int local22;
			@Pc(50) int local50;
			@Pc(54) int local54;
			@Pc(63) int local63;
			@Pc(70) int local70;
			@Pc(134) int local134;
			@Pc(205) int local205;
			try {
				this.anInt263 = -1;
				this.aClass31_3.method501();
				this.aClass31_2.method501();
				Class1_Sub1_Sub2_Sub1.method354();
				this.method220();
				this.aClass37_1.method549(this.anInt360);
				for (local22 = 0; local22 < 4; local22++) {
					this.aClass17Array1[local22].method368();
				}
				System.gc();
				@Pc(46) Class4 local46 = new Class4(104, this.anIntArrayArrayArray3, this.aByteArrayArrayArray7, 0, 104);
				local50 = this.aByteArrayArray2.length;
				Class4.aBoolean20 = Class37.aBoolean179;
				for (local54 = 0; local54 < local50; local54++) {
					local63 = this.anIntArray73[local54] >> 8;
					local70 = this.anIntArray73[local54] & 0xFF;
					if (local63 == 33 && local70 >= 71 && local70 <= 73) {
						Class4.aBoolean20 = false;
					}
				}
				if (Class4.aBoolean20) {
					this.aClass37_1.method550(this.anInt253);
				} else {
					this.aClass37_1.method550(0);
				}
				this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 251);
				for (local63 = 0; local63 < local50; local63++) {
					local70 = (this.anIntArray73[local63] >> 8) * 64 - this.anInt411;
					local134 = (this.anIntArray73[local63] & 0xFF) * 64 - this.anInt412;
					@Pc(139) byte[] local139 = this.aByteArrayArray2[local63];
					if (local139 != null) {
						local46.method52(local139, (this.anInt369 - 6) * 8, local134, local70, (this.anInt368 - 6) * 8);
					} else if (this.anInt369 < 800) {
						local46.method51(local134, (byte) 3, local70);
					}
				}
				this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 251);
				for (local70 = 0; local70 < local50; local70++) {
					@Pc(191) byte[] local191 = this.aByteArrayArray1[local70];
					if (local191 != null) {
						local205 = (this.anIntArray73[local70] >> 8) * 64 - this.anInt411;
						@Pc(217) int local217 = (this.anIntArray73[local70] & 0xFF) * 64 - this.anInt412;
						local46.method55(this.aClass17Array1, this.aClass37_1, local217, local205, local191);
					}
				}
				this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 251);
				local46.method57(this.aClass37_1, this.aClass17Array1);
				this.aClass36_27.method545();
				this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 251);
				for (local134 = 0; local134 < 104; local134++) {
					for (local205 = 0; local205 < 104; local205++) {
						this.method102(local134, local205);
					}
				}
				this.method160();
			} catch (@Pc(279) Exception local279) {
			}
			Class9.aClass39_4.method610();
			@Pc(293) int local293;
			if (aBoolean31 && signlink.aRandomAccessFile1 != null) {
				local22 = this.aClass42_Sub1_1.method617(0);
				for (local293 = 0; local293 < local22; local293++) {
					local50 = this.aClass42_Sub1_1.method621(local293, 547);
					if ((local50 & 0x79) == 0) {
						Class1_Sub1_Sub1_Sub5.method277(local293);
					}
				}
			}
			System.gc();
			Class1_Sub1_Sub2_Sub1.method355(anInt432);
			this.aClass42_Sub1_1.method626();
			local22 = (this.anInt368 - 6) / 8 - 1;
			local293 = (this.anInt368 + 6) / 8 + 1;
			local50 = (this.anInt369 - 6) / 8 - 1;
			local54 = (this.anInt369 + 6) / 8 + 1;
			if (this.aBoolean59) {
				local22 = 49;
				local293 = 50;
				local50 = 49;
				local54 = 50;
			}
			for (local63 = local22; local63 <= local293; local63++) {
				for (local70 = local50; local70 <= local54; local70++) {
					if (local63 == local22 || local63 == local293 || local70 == local50 || local70 == local54) {
						local134 = this.aClass42_Sub1_1.method619(local63, local70, 0);
						if (local134 != -1) {
							this.aClass42_Sub1_1.method627(3, local134);
						}
						local205 = this.aClass42_Sub1_1.method619(local63, local70, 1);
						if (local205 != -1) {
							this.aClass42_Sub1_1.method627(3, local205);
						}
					}
				}
			}
		} catch (@Pc(437) RuntimeException local437) {
			signlink.reporterror("38738, " + -209 + ", " + local437.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)Ljava/lang/String;")
	private String method149() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("70188, " + 0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLclient!d;IIIIIZ)V")
	private void method150(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			if (this.aBoolean50) {
				this.anInt333 = 32;
			} else {
				this.anInt333 = 0;
			}
			this.aBoolean50 = false;
			if (arg7 >= arg3 && arg7 < arg3 + 16 && arg4 >= arg6 && arg4 < arg6 + 16) {
				arg2.anInt464 -= this.anInt252 * 4;
				if (arg1) {
					this.aBoolean65 = true;
					return;
				}
			} else if (arg7 >= arg3 && arg7 < arg3 + 16 && arg4 >= arg6 + arg0 - 16 && arg4 < arg6 + arg0) {
				arg2.anInt464 += this.anInt252 * 4;
				if (arg1) {
					this.aBoolean65 = true;
					return;
				}
			} else if (arg7 >= arg3 - this.anInt333 && arg7 < arg3 + this.anInt333 + 16 && arg4 >= arg6 + 16 && arg4 < arg6 + arg0 - 16 && this.anInt252 > 0) {
				@Pc(123) int local123 = (arg0 - 32) * arg0 / arg5;
				if (local123 < 8) {
					local123 = 8;
				}
				@Pc(138) int local138 = arg4 - arg6 - local123 / 2 - 16;
				@Pc(144) int local144 = arg0 - local123 - 32;
				arg2.anInt464 = (arg5 - arg0) * local138 / local144;
				if (arg1) {
					this.aBoolean65 = true;
				}
				this.aBoolean50 = true;
			} else {
				return;
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("45626, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + true + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean61) {
			this.method162();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	private String method151(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean60 &= true;
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("57259, " + arg0 + ", " + true + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method152() {
		try {
			this.aClass36_26.method545();
			@Pc(13) int local13 = this.anInt439 + this.anInt283 & 0x7FF;
			@Pc(20) int local20 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt135 / 32 + 48;
			@Pc(34) int local34 = 464 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt136 / 32;
			this.aClass1_Sub1_Sub2_Sub2_9.method400(this.anInt346 + 256, this.anIntArray67, local20, local34, 21, 151, this.anIntArray34, local13, 146, 9);
			this.aClass1_Sub1_Sub2_Sub2_1.method400(256, this.anIntArray39, 25, 25, 0, 33, this.anIntArray43, this.anInt439, 33, 0);
			for (@Pc(72) int local72 = 0; local72 < this.anInt292; local72++) {
				local20 = this.anIntArray35[local72] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt135 / 32;
				local34 = this.anIntArray36[local72] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt136 / 32;
				this.method141(local34, local20, this.aClass1_Sub1_Sub2_Sub2Array4[local72]);
			}
			@Pc(122) int local122;
			for (@Pc(118) int local118 = 0; local118 < 104; local118++) {
				for (local122 = 0; local122 < 104; local122++) {
					@Pc(134) Class31 local134 = this.aClass31ArrayArrayArray1[this.anInt253][local118][local122];
					if (local134 != null) {
						local20 = local118 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt135 / 32;
						local34 = local122 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt136 / 32;
						this.method141(local34, local20, this.aClass1_Sub1_Sub2_Sub2_2);
					}
				}
			}
			for (local122 = 0; local122 < this.anInt299; local122++) {
				@Pc(185) Class1_Sub1_Sub1_Sub1_Sub1 local185 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray38[local122]];
				if (local185 != null && local185.method44() && local185.aClass11_1.aBoolean106) {
					local20 = local185.anInt135 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt135 / 32;
					local34 = local185.anInt136 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt136 / 32;
					this.method141(local34, local20, this.aClass1_Sub1_Sub2_Sub2_3);
				}
			}
			for (@Pc(229) int local229 = 0; local229 < this.anInt417; local229++) {
				@Pc(239) Class1_Sub1_Sub1_Sub1_Sub2 local239 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray71[local229]];
				if (local239 != null && local239.method44()) {
					local20 = local239.anInt135 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt135 / 32;
					local34 = local239.anInt136 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt136 / 32;
					@Pc(267) boolean local267 = false;
					@Pc(271) long local271 = Class46.method640(local239.aString4);
					for (@Pc(273) int local273 = 0; local273 < this.anInt306; local273++) {
						if (local271 == this.aLongArray4[local273] && this.anIntArray40[local273] != 0) {
							local267 = true;
							break;
						}
					}
					if (local267) {
						this.method141(local34, local20, this.aClass1_Sub1_Sub2_Sub2_5);
					} else {
						this.method141(local34, local20, this.aClass1_Sub1_Sub2_Sub2_4);
					}
				}
			}
			if (this.anInt354 != 0) {
				local20 = this.anInt354 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt135 / 32;
				local34 = this.anInt355 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt136 / 32;
				this.method141(local34, local20, this.aClass1_Sub1_Sub2_Sub2_8);
			}
			Class1_Sub1_Sub2.method436(93, 3, 16777215, 3, 82);
			this.aClass36_27.method545();
		} catch (@Pc(366) RuntimeException local366) {
			signlink.reporterror("4705, " + false + ", " + local366.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method153() {
		try {
			@Pc(7) int local7 = this.aClass1_Sub1_Sub2_Sub4_3.method442("Choose Option");
			@Pc(28) int local28;
			for (@Pc(17) int local17 = 0; local17 < this.anInt420; local17++) {
				local28 = this.aClass1_Sub1_Sub2_Sub4_3.method442(this.aStringArray5[local17]);
				if (local28 > local7) {
					local7 = local28;
				}
			}
			local7 += 8;
			local28 = this.anInt420 * 15 + 21;
			@Pc(71) int local71;
			@Pc(89) int local89;
			if (super.anInt244 > 8 && super.anInt245 > 11 && super.anInt244 < 520 && super.anInt245 < 345) {
				local71 = super.anInt244 - local7 / 2 - 8;
				if (local71 + local7 > 512) {
					local71 = 512 - local7;
				}
				if (local71 < 0) {
					local71 = 0;
				}
				local89 = super.anInt245 - 11;
				if (local89 + local28 > 334) {
					local89 = 334 - local28;
				}
				if (local89 < 0) {
					local89 = 0;
				}
				this.aBoolean54 = true;
				this.anInt397 = 0;
				this.anInt398 = local71;
				this.anInt399 = local89;
				this.anInt400 = local7;
				this.anInt401 = this.anInt420 * 15 + 22;
			}
			if (super.anInt244 > 562 && super.anInt245 > 231 && super.anInt244 < 752 && super.anInt245 < 492) {
				local71 = super.anInt244 - local7 / 2 - 562;
				if (local71 < 0) {
					local71 = 0;
				} else if (local71 + local7 > 190) {
					local71 = 190 - local7;
				}
				local89 = super.anInt245 - 231;
				if (local89 < 0) {
					local89 = 0;
				} else if (local89 + local28 > 261) {
					local89 = 261 - local28;
				}
				this.aBoolean54 = true;
				this.anInt397 = 1;
				this.anInt398 = local71;
				this.anInt399 = local89;
				this.anInt400 = local7;
				this.anInt401 = this.anInt420 * 15 + 22;
			}
			if (super.anInt244 > 22 && super.anInt245 > 375 && super.anInt244 < 501 && super.anInt245 < 471) {
				local71 = super.anInt244 - local7 / 2 - 22;
				if (local71 < 0) {
					local71 = 0;
				} else if (local71 + local7 > 479) {
					local71 = 479 - local7;
				}
				local89 = super.anInt245 - 375;
				if (local89 < 0) {
					local89 = 0;
				} else if (local89 + local28 > 96) {
					local89 = 96 - local28;
				}
				this.aBoolean54 = true;
				this.anInt397 = 2;
				this.anInt398 = local71;
				this.anInt399 = local89;
				this.anInt400 = local7;
				this.anInt401 = this.anInt420 * 15 + 22;
			}
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("95302, " + false + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method154() {
		try {
			if (this.anInt327 == 0) {
				this.aStringArray5[0] = "Cancel";
				this.anIntArray58[0] = 1252;
				this.anInt420 = 1;
				this.method120(super.anInt242, super.anInt241);
				this.anInt332 = 0;
				if (super.anInt241 > 8 && super.anInt242 > 11 && super.anInt241 < 520 && super.anInt242 < 345) {
					if (this.anInt449 == -1) {
						this.method210();
					} else {
						this.method194(8, 11, super.anInt241, super.anInt242, 972, 0, Class6.aClass6Array1[this.anInt449]);
					}
				}
				if (this.anInt332 != this.anInt257) {
					this.anInt257 = this.anInt332;
				}
				this.anInt332 = 0;
				if (super.anInt241 > 562 && super.anInt242 > 231 && super.anInt241 < 752 && super.anInt242 < 492) {
					if (this.anInt358 != -1) {
						this.method194(562, 231, super.anInt241, super.anInt242, 972, 0, Class6.aClass6Array1[this.anInt358]);
					} else if (this.anIntArray54[this.anInt436] != -1) {
						this.method194(562, 231, super.anInt241, super.anInt242, 972, 0, Class6.aClass6Array1[this.anIntArray54[this.anInt436]]);
					}
				}
				if (this.anInt332 != this.anInt280) {
					this.aBoolean65 = true;
					this.anInt280 = this.anInt332;
				}
				this.anInt332 = 0;
				if (super.anInt241 > 22 && super.anInt242 > 375 && super.anInt241 < 431 && super.anInt242 < 471) {
					if (this.anInt419 == -1) {
						this.method188(super.anInt241 - 22, super.anInt242 - 375);
					} else {
						this.method194(22, 375, super.anInt241, super.anInt242, 972, 0, Class6.aClass6Array1[this.anInt419]);
					}
				}
				if (this.anInt419 != -1 && this.anInt332 != this.anInt279) {
					this.aBoolean51 = true;
					this.anInt279 = this.anInt332;
				}
				@Pc(224) boolean local224 = false;
				while (!local224) {
					local224 = true;
					for (@Pc(230) int local230 = 0; local230 < this.anInt420 - 1; local230++) {
						if (this.anIntArray58[local230] < 1000 && this.anIntArray58[local230 + 1] > 1000) {
							@Pc(251) String local251 = this.aStringArray5[local230];
							this.aStringArray5[local230] = this.aStringArray5[local230 + 1];
							this.aStringArray5[local230 + 1] = local251;
							@Pc(273) int local273 = this.anIntArray58[local230];
							this.anIntArray58[local230] = this.anIntArray58[local230 + 1];
							this.anIntArray58[local230 + 1] = local273;
							@Pc(295) int local295 = this.anIntArray56[local230];
							this.anIntArray56[local230] = this.anIntArray56[local230 + 1];
							this.anIntArray56[local230 + 1] = local295;
							@Pc(317) int local317 = this.anIntArray57[local230];
							this.anIntArray57[local230] = this.anIntArray57[local230 + 1];
							this.anIntArray57[local230 + 1] = local317;
							@Pc(339) int local339 = this.anIntArray59[local230];
							this.anIntArray59[local230] = this.anIntArray59[local230 + 1];
							this.anIntArray59[local230 + 1] = local339;
							local224 = false;
						}
					}
				}
			}
		} catch (@Pc(369) RuntimeException local369) {
			signlink.reporterror("25415, " + 633 + ", " + local369.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method155() {
		try {
			if (this.anInt330 != 7) {
				this.aClass1_Sub1_Sub3_4.method457(221);
			}
			if (super.anInt243 == 1) {
				if (super.anInt244 >= 549 && super.anInt244 <= 583 && super.anInt245 >= 195 && super.anInt245 < 231 && this.anIntArray54[0] != -1) {
					this.aBoolean65 = true;
					this.anInt436 = 0;
					this.aBoolean36 = true;
				}
				if (super.anInt244 >= 579 && super.anInt244 <= 609 && super.anInt245 >= 194 && super.anInt245 < 231 && this.anIntArray54[1] != -1) {
					this.aBoolean65 = true;
					this.anInt436 = 1;
					this.aBoolean36 = true;
				}
				if (super.anInt244 >= 607 && super.anInt244 <= 637 && super.anInt245 >= 194 && super.anInt245 < 231 && this.anIntArray54[2] != -1) {
					this.aBoolean65 = true;
					this.anInt436 = 2;
					this.aBoolean36 = true;
				}
				if (super.anInt244 >= 635 && super.anInt244 <= 679 && super.anInt245 >= 194 && super.anInt245 < 229 && this.anIntArray54[3] != -1) {
					this.aBoolean65 = true;
					this.anInt436 = 3;
					this.aBoolean36 = true;
				}
				if (super.anInt244 >= 676 && super.anInt244 <= 706 && super.anInt245 >= 194 && super.anInt245 < 231 && this.anIntArray54[4] != -1) {
					this.aBoolean65 = true;
					this.anInt436 = 4;
					this.aBoolean36 = true;
				}
				if (super.anInt244 >= 704 && super.anInt244 <= 734 && super.anInt245 >= 194 && super.anInt245 < 231 && this.anIntArray54[5] != -1) {
					this.aBoolean65 = true;
					this.anInt436 = 5;
					this.aBoolean36 = true;
				}
				if (super.anInt244 >= 732 && super.anInt244 <= 766 && super.anInt245 >= 195 && super.anInt245 < 231 && this.anIntArray54[6] != -1) {
					this.aBoolean65 = true;
					this.anInt436 = 6;
					this.aBoolean36 = true;
				}
				if (super.anInt244 >= 550 && super.anInt244 <= 584 && super.anInt245 >= 492 && super.anInt245 < 528 && this.anIntArray54[7] != -1) {
					this.aBoolean65 = true;
					this.anInt436 = 7;
					this.aBoolean36 = true;
				}
				if (super.anInt244 >= 582 && super.anInt244 <= 612 && super.anInt245 >= 492 && super.anInt245 < 529 && this.anIntArray54[8] != -1) {
					this.aBoolean65 = true;
					this.anInt436 = 8;
					this.aBoolean36 = true;
				}
				if (super.anInt244 >= 609 && super.anInt244 <= 639 && super.anInt245 >= 492 && super.anInt245 < 529 && this.anIntArray54[9] != -1) {
					this.aBoolean65 = true;
					this.anInt436 = 9;
					this.aBoolean36 = true;
				}
				if (super.anInt244 >= 637 && super.anInt244 <= 681 && super.anInt245 >= 493 && super.anInt245 < 528 && this.anIntArray54[10] != -1) {
					this.aBoolean65 = true;
					this.anInt436 = 10;
					this.aBoolean36 = true;
				}
				if (super.anInt244 >= 679 && super.anInt244 <= 709 && super.anInt245 >= 492 && super.anInt245 < 529 && this.anIntArray54[11] != -1) {
					this.aBoolean65 = true;
					this.anInt436 = 11;
					this.aBoolean36 = true;
				}
				if (super.anInt244 >= 706 && super.anInt244 <= 736 && super.anInt245 >= 492 && super.anInt245 < 529 && this.anIntArray54[12] != -1) {
					this.aBoolean65 = true;
					this.anInt436 = 12;
					this.aBoolean36 = true;
				}
				if (super.anInt244 >= 734 && super.anInt244 <= 768 && super.anInt245 >= 492 && super.anInt245 < 528 && this.anIntArray54[13] != -1) {
					this.aBoolean65 = true;
					this.anInt436 = 13;
					this.aBoolean36 = true;
				}
				anInt409++;
				if (anInt409 > 150) {
					anInt409 = 0;
					this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 43);
					this.aClass1_Sub1_Sub3_4.method457(43);
					return;
				}
			}
		} catch (@Pc(466) RuntimeException local466) {
			signlink.reporterror("44563, " + 7 + ", " + local466.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method156(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			if (super.anInt243 == 1) {
				@Pc(22) int local22 = super.anInt244 - 21 - 561;
				@Pc(29) int local29 = super.anInt245 - 9 - 5;
				if (local22 >= 0 && local29 >= 0 && local22 < 146 && local29 < 151) {
					local22 -= 73;
					local29 -= 75;
					@Pc(49) int local49 = this.anInt439 + this.anInt283 & 0x7FF;
					@Pc(53) int local53 = Class1_Sub1_Sub2_Sub1.anIntArray173[local49];
					@Pc(57) int local57 = Class1_Sub1_Sub2_Sub1.anIntArray174[local49];
					@Pc(66) int local66 = local53 * (this.anInt346 + 256) >> 8;
					@Pc(75) int local75 = local57 * (this.anInt346 + 256) >> 8;
					@Pc(85) int local85 = local29 * local66 + local22 * local75 >> 11;
					@Pc(95) int local95 = local29 * local75 - local22 * local66 >> 11;
					@Pc(102) int local102 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt135 + local85 >> 7;
					@Pc(109) int local109 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt136 - local95 >> 7;
					@Pc(130) boolean local130 = this.method94(true, local109, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0], 0, 0, 1, (byte) 8, 0, local102, 0, 0);
					if (local130) {
						this.aClass1_Sub1_Sub3_4.method457(local22);
						this.aClass1_Sub1_Sub3_4.method457(local29);
						this.aClass1_Sub1_Sub3_4.method458(this.anInt439);
						this.aClass1_Sub1_Sub3_4.method457(57);
						this.aClass1_Sub1_Sub3_4.method457(this.anInt283);
						this.aClass1_Sub1_Sub3_4.method457(this.anInt346);
						this.aClass1_Sub1_Sub3_4.method457(89);
						this.aClass1_Sub1_Sub3_4.method458(aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt135);
						this.aClass1_Sub1_Sub3_4.method458(aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt136);
						this.aClass1_Sub1_Sub3_4.method457(this.anInt317);
						this.aClass1_Sub1_Sub3_4.method457(63);
						return;
					}
				}
			}
		} catch (@Pc(184) RuntimeException local184) {
			signlink.reporterror("51236, " + arg0 + ", " + local184.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBIILclient!fc;)V")
	private void method157(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class11 arg3) {
		try {
			if (this.anInt420 < 400) {
				@Pc(9) String local9 = arg3.aString24;
				if (arg3.anInt573 != 0) {
					local9 = local9 + method117(aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt185, arg3.anInt573, this.anInt319) + " (level-" + arg3.anInt573 + ")";
				}
				if (this.anInt285 == 1) {
					this.aStringArray5[this.anInt420] = "Use " + this.aString6 + " with @yel@" + local9;
					this.anIntArray58[this.anInt420] = 900;
					this.anIntArray59[this.anInt420] = arg1;
					this.anIntArray56[this.anInt420] = arg0;
					this.anIntArray57[this.anInt420] = arg2;
					this.anInt420++;
				} else if (this.anInt266 != 1) {
					@Pc(155) int local155;
					if (arg3.aStringArray8 != null) {
						for (local155 = 4; local155 >= 0; local155--) {
							if (arg3.aStringArray8[local155] != null && !arg3.aStringArray8[local155].equalsIgnoreCase("attack")) {
								this.aStringArray5[this.anInt420] = arg3.aStringArray8[local155] + " @yel@" + local9;
								if (local155 == 0) {
									this.anIntArray58[this.anInt420] = 728;
								}
								if (local155 == 1) {
									this.anIntArray58[this.anInt420] = 542;
								}
								if (local155 == 2) {
									this.anIntArray58[this.anInt420] = 6;
								}
								if (local155 == 3) {
									this.anIntArray58[this.anInt420] = 963;
								}
								if (local155 == 4) {
									this.anIntArray58[this.anInt420] = 245;
								}
								this.anIntArray59[this.anInt420] = arg1;
								this.anIntArray56[this.anInt420] = arg0;
								this.anIntArray57[this.anInt420] = arg2;
								this.anInt420++;
							}
						}
					}
					if (arg3.aStringArray8 != null) {
						for (local155 = 4; local155 >= 0; local155--) {
							if (arg3.aStringArray8[local155] != null && arg3.aStringArray8[local155].equalsIgnoreCase("attack")) {
								@Pc(279) short local279 = 0;
								if (arg3.anInt573 > aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt185) {
									local279 = 2000;
								}
								this.aStringArray5[this.anInt420] = arg3.aStringArray8[local155] + " @yel@" + local9;
								if (local155 == 0) {
									this.anIntArray58[this.anInt420] = local279 + 728;
								}
								if (local155 == 1) {
									this.anIntArray58[this.anInt420] = local279 + 542;
								}
								if (local155 == 2) {
									this.anIntArray58[this.anInt420] = local279 + 6;
								}
								if (local155 == 3) {
									this.anIntArray58[this.anInt420] = local279 + 963;
								}
								if (local155 == 4) {
									this.anIntArray58[this.anInt420] = local279 + 245;
								}
								this.anIntArray59[this.anInt420] = arg1;
								this.anIntArray56[this.anInt420] = arg0;
								this.anIntArray57[this.anInt420] = arg2;
								this.anInt420++;
							}
						}
					}
					this.aStringArray5[this.anInt420] = "Examine @yel@" + local9;
					this.anIntArray58[this.anInt420] = 1607;
					this.anIntArray59[this.anInt420] = arg1;
					this.anIntArray56[this.anInt420] = arg0;
					this.anIntArray57[this.anInt420] = arg2;
					this.anInt420++;
				} else if ((this.anInt268 & 0x2) == 2) {
					this.aStringArray5[this.anInt420] = this.aString5 + " @yel@" + local9;
					this.anIntArray58[this.anInt420] = 265;
					this.anIntArray59[this.anInt420] = arg1;
					this.anIntArray56[this.anInt420] = arg0;
					this.anIntArray57[this.anInt420] = arg2;
					this.anInt420++;
					return;
				}
			}
		} catch (@Pc(429) RuntimeException local429) {
			signlink.reporterror("44995, " + arg0 + ", " + -50 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local429.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	private void method158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(1) Class1_Sub2 local1 = null;
			for (@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) this.aClass31_1.method497(); local6 != null; local6 = (Class1_Sub2) this.aClass31_1.method499()) {
				if (local6.anInt821 == arg1 && local6.anInt823 == arg8 && local6.anInt824 == arg0 && local6.anInt822 == arg7) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class1_Sub2();
				local1.anInt821 = arg1;
				local1.anInt822 = arg7;
				local1.anInt823 = arg8;
				local1.anInt824 = arg0;
				this.method109(local1);
				this.aClass31_1.method494(local1);
			}
			local1.anInt828 = arg6;
			local1.anInt830 = arg3;
			local1.anInt829 = arg5;
			local1.anInt831 = arg4;
			local1.anInt832 = arg2;
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("65998, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + -491 + ", " + arg7 + ", " + arg8 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method159() {
		try {
			this.aClass36_25.method545();
			Class1_Sub1_Sub2_Sub1.anIntArray175 = this.anIntArray46;
			this.aClass1_Sub1_Sub2_Sub3_13.method422(0, 0, 373);
			if (this.anInt358 != -1) {
				this.method123(0, Class6.aClass6Array1[this.anInt358], 0, 0);
			} else if (this.anIntArray54[this.anInt436] != -1) {
				this.method123(0, Class6.aClass6Array1[this.anIntArray54[this.anInt436]], 0, 0);
			}
			if (this.aBoolean54 && this.anInt397 == 1) {
				this.method170();
			}
			this.aClass36_25.method546(562, super.aGraphics2, 231);
			this.aClass36_27.method545();
			Class1_Sub1_Sub2_Sub1.anIntArray175 = this.anIntArray47;
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("4786, " + 49 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method160() {
		try {
			@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) this.aClass31_1.method497();
			this.aBoolean60 &= true;
			while (local6 != null) {
				if (local6.anInt832 == -1) {
					local6.anInt831 = 0;
					this.method109(local6);
				} else {
					local6.method630();
				}
				local6 = (Class1_Sub2) this.aClass31_1.method499();
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("84234, " + true + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg1 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg3 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg5;
			@Pc(23) int local23;
			@Pc(27) int local27;
			@Pc(37) int local37;
			if (local5 != 0) {
				local23 = Class1_Sub1_Sub1_Sub5.anIntArray148[local5];
				local27 = Class1_Sub1_Sub1_Sub5.anIntArray149[local5];
				local37 = local27 * 0 - arg5 * local23 >> 16;
				local17 = local23 * 0 + arg5 * local27 >> 16;
				local15 = local37;
			}
			if (local11 != 0) {
				local23 = Class1_Sub1_Sub1_Sub5.anIntArray148[local11];
				local27 = Class1_Sub1_Sub1_Sub5.anIntArray149[local11];
				local37 = local17 * local23 + local27 * 0 >> 16;
				local17 = local17 * local27 - local23 * 0 >> 16;
				local13 = local37;
			}
			this.anInt293 = arg2 - local13;
			this.anInt294 = arg0 - local15;
			this.anInt295 = arg4 - local17;
			this.anInt296 = arg1;
			this.anInt297 = arg3;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("40475, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -12945 + ", " + arg5 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method162() {
		try {
			this.aBoolean48 = true;
			try {
				@Pc(10) long local10 = System.currentTimeMillis();
				@Pc(12) int local12 = 0;
				@Pc(14) int local14 = 20;
				while (this.aBoolean41) {
					this.anInt255++;
					this.method207();
					this.method207();
					this.method106();
					local12++;
					if (local12 > 10) {
						@Pc(37) long local37 = System.currentTimeMillis();
						@Pc(46) int local46 = (int) (local37 - local10) / 10 - local14;
						local14 = 40 - local46;
						if (local14 < 5) {
							local14 = 5;
						}
						local12 = 0;
						local10 = local37;
					}
					try {
						Thread.sleep((long) local14);
					} catch (@Pc(64) Exception local64) {
					}
				}
			} catch (@Pc(70) Exception local70) {
			}
			this.aBoolean48 = false;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("16841, " + 5 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!mb;)V")
	private void method163(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			this.anInt349 = 0;
			this.anInt418 = 0;
			this.method135(arg1, arg0);
			this.method126(arg1, arg0);
			this.method189(arg0, arg1);
			this.method193(arg0, arg1);
			@Pc(40) int local40;
			for (@Pc(33) int local33 = 0; local33 < this.anInt349; local33++) {
				local40 = this.anIntArray53[local33];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local40].anInt177 != anInt320) {
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local40] = null;
				}
			}
			if (arg1.anInt771 != arg0) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.anInt771 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local40 = 0; local40 < this.anInt417; local40++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray71[local40]] == null) {
					signlink.reporterror(this.aString13 + " null entry in pl list - pos:" + local40 + " size:" + this.anInt417);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("91735, " + arg0 + ", " + 9 + ", " + arg1 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method164() {
		try {
			this.anInt343++;
			this.method187((byte) 2);
			this.method115();
			this.method214();
			this.method182();
			@Pc(31) int local31;
			@Pc(70) int local70;
			@Pc(118) int local118;
			if (!this.aBoolean53) {
				local31 = this.anInt438;
				if (this.anInt344 / 256 > local31) {
					local31 = this.anInt344 / 256;
				}
				if (this.aBooleanArray4[4] && this.anIntArray68[4] + 128 > local31) {
					local31 = this.anIntArray68[4] + 128;
				}
				local70 = this.anInt439 + this.anInt270 & 0x7FF;
				this.method161(this.method177(aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt136, aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt135, this.anInt253) - 50, local31, this.anInt335, local70, this.anInt336, local31 * 3 + 600);
				anInt395++;
				if (anInt395 > 1802) {
					anInt395 = 0;
					this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 15);
					this.aClass1_Sub1_Sub3_4.method457(0);
					local118 = this.aClass1_Sub1_Sub3_4.anInt771;
					this.aClass1_Sub1_Sub3_4.method458(29711);
					this.aClass1_Sub1_Sub3_4.method457(70);
					this.aClass1_Sub1_Sub3_4.method457((int) (Math.random() * 256.0D));
					this.aClass1_Sub1_Sub3_4.method457(242);
					this.aClass1_Sub1_Sub3_4.method457(186);
					this.aClass1_Sub1_Sub3_4.method457(39);
					this.aClass1_Sub1_Sub3_4.method457(61);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub3_4.method457(13);
					}
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub3_4.method458(57856);
					}
					this.aClass1_Sub1_Sub3_4.method458((int) (Math.random() * 65536.0D));
					this.aClass1_Sub1_Sub3_4.method466(this.aClass1_Sub1_Sub3_4.anInt771 - local118);
				}
			}
			if (this.aBoolean53) {
				local31 = this.method218();
			} else {
				local31 = this.method217();
			}
			local70 = this.anInt293;
			local118 = this.anInt294;
			@Pc(205) int local205 = this.anInt295;
			@Pc(208) int local208 = this.anInt296;
			@Pc(211) int local211 = this.anInt297;
			@Pc(260) int local260;
			for (@Pc(213) int local213 = 0; local213 < 5; local213++) {
				if (this.aBooleanArray4[local213]) {
					local260 = (int) (Math.random() * (double) (this.anIntArray50[local213] * 2 + 1) - (double) this.anIntArray50[local213] + Math.sin((double) this.anIntArray51[local213] * ((double) this.anIntArray32[local213] / 100.0D)) * (double) this.anIntArray68[local213]);
					if (local213 == 0) {
						this.anInt293 += local260;
					}
					if (local213 == 1) {
						this.anInt294 += local260;
					}
					if (local213 == 2) {
						this.anInt295 += local260;
					}
					if (local213 == 3) {
						this.anInt297 = this.anInt297 + local260 & 0x7FF;
					}
					if (local213 == 4) {
						this.anInt296 += local260;
						if (this.anInt296 < 128) {
							this.anInt296 = 128;
						}
						if (this.anInt296 > 383) {
							this.anInt296 = 383;
						}
					}
				}
			}
			local260 = Class1_Sub1_Sub2_Sub1.anInt655;
			Class1_Sub1_Sub1_Sub5.aBoolean104 = true;
			Class1_Sub1_Sub1_Sub5.anInt562 = 0;
			Class1_Sub1_Sub1_Sub5.anInt560 = super.anInt241 - 8;
			Class1_Sub1_Sub1_Sub5.anInt561 = super.anInt242 - 11;
			Class1_Sub1_Sub2.method435(this.anInt273);
			this.aClass37_1.method588(this.anInt295, this.anInt296, this.anInt294, this.anInt293, this.anInt384, local31, this.anInt297);
			this.aClass37_1.method563();
			this.method166();
			this.method130();
			this.method107(local260);
			this.method196();
			this.aClass36_27.method546(8, super.aGraphics2, 11);
			this.anInt293 = local70;
			this.anInt294 = local118;
			this.anInt295 = local205;
			this.anInt296 = local208;
			this.anInt297 = local211;
		} catch (@Pc(401) RuntimeException local401) {
			signlink.reporterror("91899, " + -389 + ", " + local401.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method165() {
		try {
			@Pc(4) Graphics local4 = this.method89().getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 789, 532);
			this.method82();
			@Pc(41) byte local41;
			@Pc(47) int local47;
			if (this.aBoolean56) {
				this.aBoolean41 = false;
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
			if (this.aBoolean45) {
				this.aBoolean41 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean43) {
				this.aBoolean41 = false;
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
			signlink.reporterror("34218, " + -171 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method84() {
		if (signlink.sunjava) {
			super.anInt235 = 5;
		}
		if (aBoolean62) {
			this.aBoolean43 = true;
			return;
		}
		aBoolean62 = true;
		@Pc(16) boolean local16 = false;
		@Pc(20) String local20 = this.method149();
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
			this.aBoolean45 = true;
			return;
		}
		@Pc(78) int local78;
		if (signlink.aRandomAccessFile1 != null) {
			for (local78 = 0; local78 < 5; local78++) {
				this.aClass43Array1[local78] = new Class43(anInt402, local78 + 1, 500000, signlink.aRandomAccessFileArray1[local78], signlink.aRandomAccessFile1);
			}
		}
		try {
			local78 = 5;
			this.anIntArray77[8] = 0;
			while (this.anIntArray77[8] == 0) {
				this.method91(anInt389, 20, "Connecting to web server");
				try {
					@Pc(127) DataInputStream local127 = this.method211("crc" + (int) (Math.random() * 9.9999999E7D));
					@Pc(134) Class1_Sub1_Sub3 local134 = new Class1_Sub1_Sub3(699, new byte[36]);
					local127.readFully(local134.aByteArray9, 0, 36);
					for (@Pc(142) int local142 = 0; local142 < 9; local142++) {
						this.anIntArray77[local142] = local134.method472();
					}
					local127.close();
				} catch (@Pc(158) IOException local158) {
					for (@Pc(160) int local160 = local78; local160 > 0; local160--) {
						this.method91(anInt389, 10, "Error loading - Will retry in " + local160 + " secs.");
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
			this.aClass45_1 = this.method219("title", 25, this.anIntArray77[1], "title screen", 1);
			this.aClass1_Sub1_Sub2_Sub4_1 = new Class1_Sub1_Sub2_Sub4((byte) 9, this.aClass45_1, "p11");
			this.aClass1_Sub1_Sub2_Sub4_2 = new Class1_Sub1_Sub2_Sub4((byte) 9, this.aClass45_1, "p12");
			this.aClass1_Sub1_Sub2_Sub4_3 = new Class1_Sub1_Sub2_Sub4((byte) 9, this.aClass45_1, "b12");
			this.aClass1_Sub1_Sub2_Sub4_4 = new Class1_Sub1_Sub2_Sub4((byte) 9, this.aClass45_1, "q8");
			this.method213();
			this.method172();
			@Pc(265) Class45 local265 = this.method219("config", 30, this.anIntArray77[2], "config", 2);
			@Pc(277) Class45 local277 = this.method219("interface", 35, this.anIntArray77[3], "interface", 3);
			@Pc(289) Class45 local289 = this.method219("media", 40, this.anIntArray77[4], "2d graphics", 4);
			@Pc(301) Class45 local301 = this.method219("textures", 45, this.anIntArray77[6], "textures", 6);
			@Pc(313) Class45 local313 = this.method219("wordenc", 50, this.anIntArray77[7], "chat system", 7);
			@Pc(325) Class45 local325 = this.method219("sounds", 55, this.anIntArray77[8], "sound effects", 8);
			this.aByteArrayArrayArray7 = new byte[4][104][104];
			this.anIntArrayArrayArray3 = new int[4][105][105];
			this.aClass37_1 = new Class37(692, 4, 104, this.anIntArrayArrayArray3, 104);
			for (@Pc(350) int local350 = 0; local350 < 4; local350++) {
				this.aClass17Array1[local350] = new Class17(846, 104, 104);
			}
			this.aClass1_Sub1_Sub2_Sub2_9 = new Class1_Sub1_Sub2_Sub2(512, 512);
			@Pc(385) Class45 local385 = this.method219("versionlist", 60, this.anIntArray77[5], "update list", 5);
			this.method91(anInt389, 60, "Connecting to update server");
			this.aClass42_Sub1_1 = new Class42_Sub1();
			this.aClass42_Sub1_1.method615(local385, this);
			Class14.method327(this.aClass42_Sub1_1.method618());
			Class1_Sub1_Sub1_Sub5.method275(this.aClass42_Sub1_1.method617(0), this.aClass42_Sub1_1);
			if (!aBoolean31) {
				this.anInt276 = 0;
				this.aBoolean39 = false;
				this.aClass42_Sub1_1.method622(2, this.anInt276);
				while (this.aClass42_Sub1_1.method623() > 0) {
					this.method138();
					try {
						Thread.sleep(100L);
					} catch (@Pc(436) Exception local436) {
					}
				}
			}
			this.method91(anInt389, 65, "Requesting animations");
			@Pc(452) int local452 = this.aClass42_Sub1_1.method617(1);
			for (@Pc(454) int local454 = 0; local454 < local452; local454++) {
				this.aClass42_Sub1_1.method622(1, local454);
			}
			@Pc(473) int local473;
			while (this.aClass42_Sub1_1.method623() > 0) {
				local473 = local452 - this.aClass42_Sub1_1.method623();
				if (local473 > 0) {
					this.method91(anInt389, 65, "Loading animations - " + local473 * 100 / local452 + "%");
				}
				this.method138();
				try {
					Thread.sleep(100L);
				} catch (@Pc(499) Exception local499) {
				}
			}
			this.method91(anInt389, 70, "Requesting models");
			local452 = this.aClass42_Sub1_1.method617(0);
			@Pc(525) int local525;
			for (local473 = 0; local473 < local452; local473++) {
				local525 = this.aClass42_Sub1_1.method621(local473, 547);
				if ((local525 & 0x1) != 0) {
					this.aClass42_Sub1_1.method622(0, local473);
				}
			}
			local452 = this.aClass42_Sub1_1.method623();
			while (this.aClass42_Sub1_1.method623() > 0) {
				local525 = local452 - this.aClass42_Sub1_1.method623();
				if (local525 > 0) {
					this.method91(anInt389, 70, "Loading models - " + local525 * 100 / local452 + "%");
				}
				this.method138();
				try {
					Thread.sleep(100L);
				} catch (@Pc(576) Exception local576) {
				}
			}
			if (this.aClass43Array1[0] != null) {
				this.method91(anInt389, 75, "Requesting maps");
				this.aClass42_Sub1_1.method622(3, this.aClass42_Sub1_1.method619(47, 48, 0));
				this.aClass42_Sub1_1.method622(3, this.aClass42_Sub1_1.method619(47, 48, 1));
				this.aClass42_Sub1_1.method622(3, this.aClass42_Sub1_1.method619(48, 48, 0));
				this.aClass42_Sub1_1.method622(3, this.aClass42_Sub1_1.method619(48, 48, 1));
				this.aClass42_Sub1_1.method622(3, this.aClass42_Sub1_1.method619(49, 48, 0));
				this.aClass42_Sub1_1.method622(3, this.aClass42_Sub1_1.method619(49, 48, 1));
				this.aClass42_Sub1_1.method622(3, this.aClass42_Sub1_1.method619(47, 47, 0));
				this.aClass42_Sub1_1.method622(3, this.aClass42_Sub1_1.method619(47, 47, 1));
				this.aClass42_Sub1_1.method622(3, this.aClass42_Sub1_1.method619(48, 47, 0));
				this.aClass42_Sub1_1.method622(3, this.aClass42_Sub1_1.method619(48, 47, 1));
				this.aClass42_Sub1_1.method622(3, this.aClass42_Sub1_1.method619(48, 148, 0));
				this.aClass42_Sub1_1.method622(3, this.aClass42_Sub1_1.method619(48, 148, 1));
				local452 = this.aClass42_Sub1_1.method623();
				while (this.aClass42_Sub1_1.method623() > 0) {
					local525 = local452 - this.aClass42_Sub1_1.method623();
					if (local525 > 0) {
						this.method91(anInt389, 75, "Loading maps - " + local525 * 100 / local452 + "%");
					}
					this.method138();
					try {
						Thread.sleep(100L);
					} catch (@Pc(761) Exception local761) {
					}
				}
			}
			local452 = this.aClass42_Sub1_1.method617(0);
			@Pc(782) int local782;
			for (local525 = 0; local525 < local452; local525++) {
				local782 = this.aClass42_Sub1_1.method621(local525, 547);
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
					this.aClass42_Sub1_1.method625(0, local784, local525);
				}
			}
			local452 = this.aClass42_Sub1_1.method617(3);
			for (local782 = 0; local782 < local452; local782++) {
				this.aClass42_Sub1_1.method625(3, (byte) 2, local782);
			}
			@Pc(888) int local888;
			if (!aBoolean31) {
				local452 = this.aClass42_Sub1_1.method617(2);
				for (local888 = 1; local888 < local452; local888++) {
					this.aClass42_Sub1_1.method625(2, (byte) 1, local888);
				}
			}
			this.method91(anInt389, 80, "Unpacking media");
			this.aClass1_Sub1_Sub2_Sub3_13 = new Class1_Sub1_Sub2_Sub3(local289, "invback", 0);
			this.aClass1_Sub1_Sub2_Sub3_15 = new Class1_Sub1_Sub2_Sub3(local289, "chatback", 0);
			this.aClass1_Sub1_Sub2_Sub3_14 = new Class1_Sub1_Sub2_Sub3(local289, "mapback", 0);
			this.aClass1_Sub1_Sub2_Sub3_10 = new Class1_Sub1_Sub2_Sub3(local289, "backbase1", 0);
			this.aClass1_Sub1_Sub2_Sub3_11 = new Class1_Sub1_Sub2_Sub3(local289, "backbase2", 0);
			this.aClass1_Sub1_Sub2_Sub3_12 = new Class1_Sub1_Sub2_Sub3(local289, "backhmid1", 0);
			for (local888 = 0; local888 < 13; local888++) {
				this.aClass1_Sub1_Sub2_Sub3Array2[local888] = new Class1_Sub1_Sub2_Sub3(local289, "sideicons", local888);
			}
			this.aClass1_Sub1_Sub2_Sub2_1 = new Class1_Sub1_Sub2_Sub2(local289, "compass", 0);
			@Pc(982) int local982;
			try {
				for (local982 = 0; local982 < 50; local982++) {
					this.aClass1_Sub1_Sub2_Sub3Array1[local982] = new Class1_Sub1_Sub2_Sub3(local289, "mapscene", local982);
				}
			} catch (@Pc(1000) Exception local1000) {
			}
			try {
				for (local982 = 0; local982 < 50; local982++) {
					this.aClass1_Sub1_Sub2_Sub2Array7[local982] = new Class1_Sub1_Sub2_Sub2(local289, "mapfunction", local982);
				}
			} catch (@Pc(1020) Exception local1020) {
			}
			try {
				for (local982 = 0; local982 < 20; local982++) {
					this.aClass1_Sub1_Sub2_Sub2Array6[local982] = new Class1_Sub1_Sub2_Sub2(local289, "hitmarks", local982);
				}
			} catch (@Pc(1040) Exception local1040) {
			}
			try {
				for (local982 = 0; local982 < 20; local982++) {
					this.aClass1_Sub1_Sub2_Sub2Array3[local982] = new Class1_Sub1_Sub2_Sub2(local289, "headicons", local982);
				}
			} catch (@Pc(1060) Exception local1060) {
			}
			this.aClass1_Sub1_Sub2_Sub2_8 = new Class1_Sub1_Sub2_Sub2(local289, "mapflag", 0);
			for (local982 = 0; local982 < 8; local982++) {
				this.aClass1_Sub1_Sub2_Sub2Array5[local982] = new Class1_Sub1_Sub2_Sub2(local289, "cross", local982);
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
			this.aClass1_Sub1_Sub2_Sub3_6.method419();
			this.aClass1_Sub1_Sub2_Sub3_7 = new Class1_Sub1_Sub2_Sub3(local289, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_7.method419();
			this.aClass1_Sub1_Sub2_Sub3_16 = new Class1_Sub1_Sub2_Sub3(local289, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_16.method420();
			this.aClass1_Sub1_Sub2_Sub3_17 = new Class1_Sub1_Sub2_Sub3(local289, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_17.method420();
			this.aClass1_Sub1_Sub2_Sub3_18 = new Class1_Sub1_Sub2_Sub3(local289, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_18.method420();
			this.aClass1_Sub1_Sub2_Sub3_19 = new Class1_Sub1_Sub2_Sub3(local289, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_19.method419();
			this.aClass1_Sub1_Sub2_Sub3_19.method420();
			this.aClass1_Sub1_Sub2_Sub3_20 = new Class1_Sub1_Sub2_Sub3(local289, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_20.method419();
			this.aClass1_Sub1_Sub2_Sub3_20.method420();
			@Pc(1257) Class1_Sub1_Sub2_Sub2 local1257 = new Class1_Sub1_Sub2_Sub2(local289, "backleft1", 0);
			this.aClass36_3 = new Class36(this.method89(), local1257.anInt684, true, local1257.anInt685);
			local1257.method392(0, 0);
			@Pc(1282) Class1_Sub1_Sub2_Sub2 local1282 = new Class1_Sub1_Sub2_Sub2(local289, "backleft2", 0);
			this.aClass36_4 = new Class36(this.method89(), local1282.anInt684, true, local1282.anInt685);
			local1282.method392(0, 0);
			@Pc(1307) Class1_Sub1_Sub2_Sub2 local1307 = new Class1_Sub1_Sub2_Sub2(local289, "backright1", 0);
			this.aClass36_5 = new Class36(this.method89(), local1307.anInt684, true, local1307.anInt685);
			local1307.method392(0, 0);
			@Pc(1332) Class1_Sub1_Sub2_Sub2 local1332 = new Class1_Sub1_Sub2_Sub2(local289, "backright2", 0);
			this.aClass36_6 = new Class36(this.method89(), local1332.anInt684, true, local1332.anInt685);
			local1332.method392(0, 0);
			@Pc(1357) Class1_Sub1_Sub2_Sub2 local1357 = new Class1_Sub1_Sub2_Sub2(local289, "backtop1", 0);
			this.aClass36_7 = new Class36(this.method89(), local1357.anInt684, true, local1357.anInt685);
			local1357.method392(0, 0);
			@Pc(1382) Class1_Sub1_Sub2_Sub2 local1382 = new Class1_Sub1_Sub2_Sub2(local289, "backtop2", 0);
			this.aClass36_8 = new Class36(this.method89(), local1382.anInt684, true, local1382.anInt685);
			local1382.method392(0, 0);
			@Pc(1407) Class1_Sub1_Sub2_Sub2 local1407 = new Class1_Sub1_Sub2_Sub2(local289, "backvmid1", 0);
			this.aClass36_9 = new Class36(this.method89(), local1407.anInt684, true, local1407.anInt685);
			local1407.method392(0, 0);
			@Pc(1432) Class1_Sub1_Sub2_Sub2 local1432 = new Class1_Sub1_Sub2_Sub2(local289, "backvmid2", 0);
			this.aClass36_10 = new Class36(this.method89(), local1432.anInt684, true, local1432.anInt685);
			local1432.method392(0, 0);
			@Pc(1457) Class1_Sub1_Sub2_Sub2 local1457 = new Class1_Sub1_Sub2_Sub2(local289, "backvmid3", 0);
			this.aClass36_11 = new Class36(this.method89(), local1457.anInt684, true, local1457.anInt685);
			local1457.method392(0, 0);
			@Pc(1482) Class1_Sub1_Sub2_Sub2 local1482 = new Class1_Sub1_Sub2_Sub2(local289, "backhmid2", 0);
			this.aClass36_12 = new Class36(this.method89(), local1482.anInt684, true, local1482.anInt685);
			local1482.method392(0, 0);
			@Pc(1507) int local1507 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1514) int local1514 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1521) int local1521 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1528) int local1528 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1530) int local1530 = 0; local1530 < 50; local1530++) {
				if (this.aClass1_Sub1_Sub2_Sub2Array7[local1530] != null) {
					this.aClass1_Sub1_Sub2_Sub2Array7[local1530].method391(local1507 + local1528, local1514 + local1528, local1521 + local1528);
				}
				if (this.aClass1_Sub1_Sub2_Sub3Array1[local1530] != null) {
					this.aClass1_Sub1_Sub2_Sub3Array1[local1530].method421(local1507 + local1528, local1514 + local1528, local1521 + local1528);
				}
			}
			this.method91(anInt389, 83, "Unpacking textures");
			Class1_Sub1_Sub2_Sub1.method356(local301, 567);
			Class1_Sub1_Sub2_Sub1.method360(0.8D);
			Class1_Sub1_Sub2_Sub1.method355(anInt432);
			this.method91(anInt389, 86, "Unpacking config");
			Class25.method483(local265);
			Class9.method247(local265);
			Class19.method403(local265);
			Class13.method314(local265);
			Class11.method303(local265);
			Class21.method424(local265, (byte) 7);
			Class27.method488(local265, (byte) 7);
			Class29.method492(local265, (byte) 7);
			Class13.aBoolean112 = aBoolean30;
			if (!aBoolean31) {
				this.method91(anInt389, 90, "Unpacking sounds");
				@Pc(1630) byte[] local1630 = local325.method639("sounds.dat", null);
				@Pc(1636) Class1_Sub1_Sub3 local1636 = new Class1_Sub1_Sub3(699, local1630);
				Class5.method73(local1636, (byte) 7);
			}
			this.method91(anInt389, 95, "Unpacking interfaces");
			@Pc(1667) Class1_Sub1_Sub2_Sub4[] local1667 = new Class1_Sub1_Sub2_Sub4[] { this.aClass1_Sub1_Sub2_Sub4_1, this.aClass1_Sub1_Sub2_Sub4_2, this.aClass1_Sub1_Sub2_Sub4_3, this.aClass1_Sub1_Sub2_Sub4_4 };
			Class6.method222(local277, local1667, local289);
			this.method91(anInt389, 100, "Preparing game engine");
			@Pc(1683) int local1683;
			@Pc(1685) int local1685;
			@Pc(1687) int local1687;
			for (@Pc(1679) int local1679 = 0; local1679 < 33; local1679++) {
				local1683 = 999;
				local1685 = 0;
				for (local1687 = 0; local1687 < 35; local1687++) {
					if (this.aClass1_Sub1_Sub2_Sub3_14.aByteArray7[local1687 + local1679 * this.aClass1_Sub1_Sub2_Sub3_14.anInt717] == 0) {
						if (local1683 == 999) {
							local1683 = local1687;
						}
					} else if (local1683 != 999) {
						local1685 = local1687;
						break;
					}
				}
				this.anIntArray43[local1679] = local1683;
				this.anIntArray39[local1679] = local1685 - local1683;
			}
			@Pc(1745) int local1745;
			for (local1683 = 9; local1683 < 160; local1683++) {
				local1685 = 999;
				local1687 = 0;
				for (local1745 = 10; local1745 < 168; local1745++) {
					if (this.aClass1_Sub1_Sub2_Sub3_14.aByteArray7[local1745 + local1683 * this.aClass1_Sub1_Sub2_Sub3_14.anInt717] == 0 && (local1745 > 34 || local1683 > 34)) {
						if (local1685 == 999) {
							local1685 = local1745;
						}
					} else if (local1685 != 999) {
						local1687 = local1745;
						break;
					}
				}
				this.anIntArray34[local1683 - 9] = local1685 - 21;
				this.anIntArray67[local1683 - 9] = local1687 - local1685;
			}
			Class1_Sub1_Sub2_Sub1.method353(479, 96);
			this.anIntArray45 = Class1_Sub1_Sub2_Sub1.anIntArray175;
			Class1_Sub1_Sub2_Sub1.method353(190, 261);
			this.anIntArray46 = Class1_Sub1_Sub2_Sub1.anIntArray175;
			Class1_Sub1_Sub2_Sub1.method353(512, 334);
			this.anIntArray47 = Class1_Sub1_Sub2_Sub1.anIntArray175;
			@Pc(1829) int[] local1829 = new int[9];
			for (local1687 = 0; local1687 < 9; local1687++) {
				local1745 = local1687 * 32 + 128 + 15;
				@Pc(1847) int local1847 = local1745 * 3 + 600;
				@Pc(1851) int local1851 = Class1_Sub1_Sub2_Sub1.anIntArray173[local1745];
				local1829[local1687] = local1847 * local1851 >> 16;
			}
			Class37.method585(local1829);
			Class32.method502(local313);
		} catch (@Pc(1874) Exception local1874) {
			signlink.reporterror("loaderror - " + local1874.getMessage());
			this.aBoolean56 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method166() {
		try {
			this.anInt356 = 0;
			@Pc(53) int local53;
			@Pc(73) int local73;
			for (@Pc(6) int local6 = -1; local6 < this.anInt417 + this.anInt299; local6++) {
				@Pc(13) Class1_Sub1_Sub1_Sub1 local13;
				if (local6 == -1) {
					local13 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
				} else if (local6 < this.anInt417) {
					local13 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray71[local6]];
				} else {
					local13 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray38[local6 - this.anInt417]];
				}
				if (local13 != null && local13.method44()) {
					if (local6 < this.anInt417) {
						local53 = 30;
						@Pc(56) Class1_Sub1_Sub1_Sub1_Sub2 local56 = (Class1_Sub1_Sub1_Sub1_Sub2) local13;
						if (local56.anInt184 != 0) {
							this.method146(local13, local13.anInt178 + 15);
							if (this.anInt289 > -1) {
								for (local73 = 0; local73 < 8; local73++) {
									if ((local56.anInt184 & 0x1 << local73) != 0) {
										this.aClass1_Sub1_Sub2_Sub2Array3[local73].method394(this.anInt289 - 12, this.anInt290 - local53);
										local53 -= 25;
									}
								}
							}
						}
						if (local6 >= 0 && this.anInt371 == 10 && this.anInt262 == this.anIntArray71[local6]) {
							this.method146(local13, local13.anInt178 + 15);
							if (this.anInt289 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array3[7].method394(this.anInt289 - 12, this.anInt290 - local53);
							}
						}
					} else if (this.anInt371 == 1 && this.anInt321 == this.anIntArray38[local6 - this.anInt417] && anInt320 % 20 < 10) {
						this.method146(local13, local13.anInt178 + 15);
						if (this.anInt289 > -1) {
							this.aClass1_Sub1_Sub2_Sub2Array3[2].method394(this.anInt289 - 12, this.anInt290 - 28);
						}
					}
					if (local13.aString3 != null && (local6 >= this.anInt417 || this.anInt393 == 0 || this.anInt393 == 3 || this.anInt393 == 1 && this.method132(((Class1_Sub1_Sub1_Sub1_Sub2) local13).aString4))) {
						this.method146(local13, local13.anInt178);
						if (this.anInt289 > -1 && this.anInt356 < this.anInt357) {
							this.anIntArray63[this.anInt356] = this.aClass1_Sub1_Sub2_Sub4_3.method442(local13.aString3) / 2;
							this.anIntArray62[this.anInt356] = this.aClass1_Sub1_Sub2_Sub4_3.anInt744;
							this.anIntArray60[this.anInt356] = this.anInt289;
							this.anIntArray61[this.anInt356] = this.anInt290;
							this.anIntArray64[this.anInt356] = local13.anInt147;
							this.anIntArray65[this.anInt356] = local13.anInt148;
							this.anIntArray66[this.anInt356] = local13.anInt146;
							this.aStringArray4[this.anInt356++] = local13.aString3;
							if (this.anInt437 == 0 && local13.anInt148 == 1) {
								this.anIntArray62[this.anInt356] += 10;
								this.anIntArray61[this.anInt356] += 5;
							}
							if (this.anInt437 == 0 && local13.anInt148 == 2) {
								this.anIntArray63[this.anInt356] = 60;
							}
						}
					}
					if (local13.anInt151 > anInt320 + 100) {
						this.method146(local13, local13.anInt178 + 15);
						if (this.anInt289 > -1) {
							local53 = local13.anInt152 * 30 / local13.anInt153;
							if (local53 > 30) {
								local53 = 30;
							}
							Class1_Sub1_Sub2.method436(this.anInt289 - 15, local53, 65280, 5, this.anInt290 - 3);
							Class1_Sub1_Sub2.method436(this.anInt289 + local53 - 15, 30 - local53, 16711680, 5, this.anInt290 - 3);
						}
					}
					if (local13.anInt151 > anInt320 + 330) {
						this.method146(local13, local13.anInt178 / 2);
						if (this.anInt289 > -1) {
							this.aClass1_Sub1_Sub2_Sub2Array6[local13.anInt150].method394(this.anInt289 - 12, this.anInt290 - 12);
							this.aClass1_Sub1_Sub2_Sub4_1.method440(String.valueOf(local13.anInt149), this.anInt289, this.anInt290 + 4, 0);
							this.aClass1_Sub1_Sub2_Sub4_1.method440(String.valueOf(local13.anInt149), this.anInt289 - 1, this.anInt290 + 3, 16777215);
						}
					}
				}
			}
			for (@Pc(467) int local467 = 0; local467 < this.anInt356; local467++) {
				local53 = this.anIntArray60[local467];
				@Pc(479) int local479 = this.anIntArray61[local467];
				local73 = this.anIntArray63[local467];
				@Pc(489) int local489 = this.anIntArray62[local467];
				@Pc(491) boolean local491 = true;
				while (local491) {
					local491 = false;
					for (@Pc(497) int local497 = 0; local497 < local467; local497++) {
						if (local479 + 2 > this.anIntArray61[local497] - this.anIntArray62[local497] && local479 - local489 < this.anIntArray61[local497] + 2 && local53 - local73 < this.anIntArray60[local497] + this.anIntArray63[local497] && local53 + local73 > this.anIntArray60[local497] - this.anIntArray63[local497] && this.anIntArray61[local497] - this.anIntArray62[local497] < local479) {
							local479 = this.anIntArray61[local497] - this.anIntArray62[local497];
							local491 = true;
						}
					}
				}
				this.anInt289 = this.anIntArray60[local467];
				this.anInt290 = this.anIntArray61[local467] = local479;
				@Pc(596) String local596 = this.aStringArray4[local467];
				if (this.anInt437 == 0) {
					@Pc(601) int local601 = 16776960;
					if (this.anIntArray64[local467] < 6) {
						local601 = this.anIntArray52[this.anIntArray64[local467]];
					}
					if (this.anIntArray64[local467] == 6) {
						local601 = this.anInt343 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray64[local467] == 7) {
						local601 = this.anInt343 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray64[local467] == 8) {
						local601 = this.anInt343 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(676) int local676;
					if (this.anIntArray64[local467] == 9) {
						local676 = 150 - this.anIntArray66[local467];
						if (local676 < 50) {
							local601 = local676 * 1280 + 16711680;
						} else if (local676 < 100) {
							local601 = 16776960 - (local676 - 50) * 327680;
						} else if (local676 < 150) {
							local601 = (local676 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray64[local467] == 10) {
						local676 = 150 - this.anIntArray66[local467];
						if (local676 < 50) {
							local601 = local676 * 5 + 16711680;
						} else if (local676 < 100) {
							local601 = 16711935 - (local676 - 50) * 327680;
						} else if (local676 < 150) {
							local601 = (local676 - 100) * 327680 + 255 - (local676 - 100) * 5;
						}
					}
					if (this.anIntArray64[local467] == 11) {
						local676 = 150 - this.anIntArray66[local467];
						if (local676 < 50) {
							local601 = 16777215 - local676 * 327685;
						} else if (local676 < 100) {
							local601 = (local676 - 50) * 327685 + 65280;
						} else if (local676 < 150) {
							local601 = 16777215 - (local676 - 100) * 327680;
						}
					}
					if (this.anIntArray65[local467] == 0) {
						this.aClass1_Sub1_Sub2_Sub4_3.method440(local596, this.anInt289, this.anInt290 + 1, 0);
						this.aClass1_Sub1_Sub2_Sub4_3.method440(local596, this.anInt289, this.anInt290, local601);
					}
					if (this.anIntArray65[local467] == 1) {
						this.aClass1_Sub1_Sub2_Sub4_3.method444(this.anInt343, this.anInt290 + 1, 0, this.anInt289, local596);
						this.aClass1_Sub1_Sub2_Sub4_3.method444(this.anInt343, this.anInt290, local601, this.anInt289, local596);
					}
					if (this.anIntArray65[local467] == 2) {
						local676 = this.aClass1_Sub1_Sub2_Sub4_3.method442(local596);
						@Pc(897) int local897 = (150 - this.anIntArray66[local467]) * (local676 + 100) / 150;
						Class1_Sub1_Sub2.method434(this.anInt289 - 50, 0, 334, this.anInt289 + 50);
						this.aClass1_Sub1_Sub2_Sub4_3.method443(this.anInt289 + 50 - local897, local596, this.aBoolean32, 0, this.anInt290 + 1);
						this.aClass1_Sub1_Sub2_Sub4_3.method443(this.anInt289 + 50 - local897, local596, this.aBoolean32, local601, this.anInt290);
						Class1_Sub1_Sub2.method433(705);
					}
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method440(local596, this.anInt289, this.anInt290 + 1, 0);
					this.aClass1_Sub1_Sub2_Sub4_3.method440(local596, this.anInt289, this.anInt290, 16776960);
				}
			}
			this.anInt442 += 0;
		} catch (@Pc(980) RuntimeException local980) {
			signlink.reporterror("91589, " + 0 + ", " + local980.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!mb;IB)V")
	private void method168(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(6) boolean local6 = false;
			arg0.method477();
			@Pc(23) int local23 = arg0.method478(8);
			@Pc(29) int local29;
			if (local23 < this.anInt299) {
				for (local29 = local23; local29 < this.anInt299; local29++) {
					this.anIntArray53[this.anInt349++] = this.anIntArray38[local29];
				}
			}
			if (local23 > this.anInt299) {
				signlink.reporterror(this.aString13 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt299 = 0;
			for (local29 = 0; local29 < local23; local29++) {
				@Pc(81) int local81 = this.anIntArray38[local29];
				@Pc(86) Class1_Sub1_Sub1_Sub1_Sub1 local86 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local81];
				@Pc(91) int local91 = arg0.method478(1);
				if (local91 == 0) {
					this.anIntArray38[this.anInt299++] = local81;
					local86.anInt177 = anInt320;
				} else {
					@Pc(114) int local114 = arg0.method478(2);
					if (local114 == 0) {
						this.anIntArray38[this.anInt299++] = local81;
						local86.anInt177 = anInt320;
						this.anIntArray72[this.anInt418++] = local81;
					} else {
						@Pc(165) int local165;
						@Pc(175) int local175;
						if (local114 == 1) {
							this.anIntArray38[this.anInt299++] = local81;
							local86.anInt177 = anInt320;
							local165 = arg0.method478(3);
							local86.method43(false, local165);
							local175 = arg0.method478(1);
							if (local175 == 1) {
								this.anIntArray72[this.anInt418++] = local81;
							}
						} else if (local114 == 2) {
							this.anIntArray38[this.anInt299++] = local81;
							local86.anInt177 = anInt320;
							local165 = arg0.method478(3);
							local86.method43(true, local165);
							local175 = arg0.method478(3);
							local86.method43(true, local175);
							@Pc(233) int local233 = arg0.method478(1);
							if (local233 == 1) {
								this.anIntArray72[this.anInt418++] = local81;
							}
						} else if (local114 == 3) {
							this.anIntArray53[this.anInt349++] = local81;
						}
					}
				}
			}
		} catch (@Pc(270) RuntimeException local270) {
			signlink.reporterror("59685, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local270.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!bb;ILclient!mb;I)V")
	private void method169(@OriginalArg(1) Class1_Sub1_Sub1_Sub1_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub3 arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(15) int local15;
			if ((arg3 & 0x1) == 1) {
				local15 = arg2.method467();
				@Pc(18) byte[] local18 = new byte[local15];
				@Pc(24) Class1_Sub1_Sub3 local24 = new Class1_Sub1_Sub3(699, local18);
				arg2.method476(local15, local18);
				this.aClass1_Sub1_Sub3Array1[arg1] = local24;
				arg0.method45(local24);
			}
			@Pc(62) int local62;
			if ((arg3 & 0x2) == 2) {
				local15 = arg2.method469();
				if (local15 == 65535) {
					local15 = -1;
				}
				if (local15 == arg0.anInt160) {
					arg0.anInt164 = 0;
				}
				local62 = arg2.method467();
				if (local15 == -1 || arg0.anInt160 == -1 || Class25.aClass25Array1[local15].anInt780 > Class25.aClass25Array1[arg0.anInt160].anInt780 || Class25.aClass25Array1[arg0.anInt160].anInt780 == 0) {
					arg0.anInt160 = local15;
					arg0.anInt161 = 0;
					arg0.anInt162 = 0;
					arg0.anInt163 = local62;
					arg0.anInt164 = 0;
				}
			}
			if ((arg3 & 0x4) == 4) {
				arg0.anInt154 = arg2.method469();
				if (arg0.anInt154 == 65535) {
					arg0.anInt154 = -1;
				}
			}
			if ((arg3 & 0x8) == 8) {
				arg0.aString3 = arg2.method474();
				arg0.anInt147 = 0;
				arg0.anInt148 = 0;
				arg0.anInt146 = 150;
				this.method136(arg0.aString3, 2, arg0.aString4);
			}
			if ((arg3 & 0x10) == 16) {
				arg0.anInt149 = arg2.method467();
				arg0.anInt150 = arg2.method467();
				arg0.anInt151 = anInt320 + 400;
				arg0.anInt152 = arg2.method467();
				arg0.anInt153 = arg2.method467();
			}
			if ((arg3 & 0x20) == 32) {
				arg0.anInt155 = arg2.method469();
				arg0.anInt156 = arg2.method469();
			}
			if ((arg3 & 0x40) == 64) {
				local15 = arg2.method469();
				local62 = arg2.method467();
				@Pc(195) int local195 = arg2.method467();
				@Pc(198) int local198 = arg2.anInt771;
				if (arg0.aString4 != null) {
					@Pc(205) long local205 = Class46.method640(arg0.aString4);
					@Pc(207) boolean local207 = false;
					if (local62 <= 1) {
						for (@Pc(212) int local212 = 0; local212 < this.anInt396; local212++) {
							if (this.aLongArray3[local212] == local205) {
								local207 = true;
								break;
							}
						}
					}
					if (!local207 && this.anInt427 == 0) {
						try {
							@Pc(240) String local240 = Class2.method36(local195, arg2);
							@Pc(244) String local244 = Class32.method512(local240, 713);
							arg0.aString3 = local244;
							arg0.anInt147 = local15 >> 8;
							arg0.anInt148 = local15 & 0xFF;
							arg0.anInt146 = 150;
							if (local62 > 1) {
								this.method136(local244, 1, arg0.aString4);
							} else {
								this.method136(local244, 2, arg0.aString4);
							}
						} catch (@Pc(281) Exception local281) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg2.anInt771 = local198 + local195;
			}
			if ((arg3 & 0x100) == 256) {
				arg0.anInt165 = arg2.method469();
				local15 = arg2.method472();
				arg0.anInt169 = local15 >> 16;
				arg0.anInt168 = anInt320 + (local15 & 0xFFFF);
				arg0.anInt166 = 0;
				arg0.anInt167 = 0;
				if (arg0.anInt168 > anInt320) {
					arg0.anInt166 = -1;
				}
				if (arg0.anInt165 == 65535) {
					arg0.anInt165 = -1;
				}
			}
			if ((arg3 & 0x200) == 512) {
				arg0.anInt170 = arg2.method467();
				arg0.anInt172 = arg2.method467();
				arg0.anInt171 = arg2.method467();
				arg0.anInt173 = arg2.method467();
				arg0.anInt174 = arg2.method469() + anInt320;
				arg0.anInt175 = arg2.method469() + anInt320;
				arg0.anInt176 = arg2.method467();
				arg0.anInt180 = 0;
				arg0.anIntArray7[0] = arg0.anInt171;
				arg0.anIntArray8[0] = arg0.anInt173;
			}
		} catch (@Pc(387) RuntimeException local387) {
			signlink.reporterror("92095, " + -64 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local387.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method170() {
		try {
			@Pc(6) int local6 = this.anInt398;
			@Pc(9) int local9 = this.anInt399;
			@Pc(12) int local12 = this.anInt400;
			@Pc(15) int local15 = this.anInt401;
			Class1_Sub1_Sub2.method436(local6, local12, 6116423, local15, local9);
			Class1_Sub1_Sub2.method436(local6 + 1, local12 - 2, 0, 16, local9 + 1);
			Class1_Sub1_Sub2.method437(local9 + 18, local15 - 19, local6 + 1, local12 - 2, 0);
			this.aClass1_Sub1_Sub2_Sub4_3.method443(local6 + 3, "Choose Option", this.aBoolean32, 6116423, local9 + 14);
			@Pc(68) int local68 = super.anInt241;
			@Pc(71) int local71 = super.anInt242;
			if (this.anInt397 == 0) {
				local68 -= 8;
				local71 -= 11;
			}
			if (this.anInt397 == 1) {
				local68 -= 562;
				local71 -= 231;
			}
			if (this.anInt397 == 2) {
				local68 -= 22;
				local71 -= 375;
			}
			for (@Pc(90) int local90 = 0; local90 < this.anInt420; local90++) {
				@Pc(105) int local105 = local9 + (this.anInt420 - 1 - local90) * 15 + 31;
				@Pc(107) int local107 = 16777215;
				if (local68 > local6 && local68 < local6 + local12 && local71 > local105 - 13 && local71 < local105 + 3) {
					local107 = 16776960;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method445(true, this.aStringArray5[local90], local107, local105, local6 + 3);
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("1058, " + -45712 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
	private void method171() {
		try {
			if (this.aClass36_16 == null) {
				super.aClass36_2 = null;
				this.aClass36_28 = null;
				this.aClass36_26 = null;
				this.aClass36_25 = null;
				this.aClass36_27 = null;
				this.aClass36_13 = null;
				this.aClass36_14 = null;
				this.aClass36_15 = null;
				this.aClass36_19 = new Class36(this.method89(), 128, true, 265);
				Class1_Sub1_Sub2.method435(this.anInt273);
				this.aClass36_20 = new Class36(this.method89(), 128, true, 265);
				Class1_Sub1_Sub2.method435(this.anInt273);
				this.aClass36_16 = new Class36(this.method89(), 533, true, 186);
				Class1_Sub1_Sub2.method435(this.anInt273);
				this.aClass36_17 = new Class36(this.method89(), 360, true, 146);
				Class1_Sub1_Sub2.method435(this.anInt273);
				this.aClass36_18 = new Class36(this.method89(), 360, true, 200);
				Class1_Sub1_Sub2.method435(this.anInt273);
				this.aClass36_21 = new Class36(this.method89(), 214, true, 267);
				Class1_Sub1_Sub2.method435(this.anInt273);
				this.aClass36_22 = new Class36(this.method89(), 215, true, 267);
				Class1_Sub1_Sub2.method435(this.anInt273);
				this.aClass36_23 = new Class36(this.method89(), 86, true, 79);
				Class1_Sub1_Sub2.method435(this.anInt273);
				this.aClass36_24 = new Class36(this.method89(), 87, true, 79);
				Class1_Sub1_Sub2.method435(this.anInt273);
				if (this.aClass45_1 != null) {
					this.method213();
					this.method172();
				}
				this.aBoolean47 = true;
			}
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("84791, " + 82 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method172() {
		try {
			this.aClass1_Sub1_Sub2_Sub3_8 = new Class1_Sub1_Sub2_Sub3(this.aClass45_1, "titlebox", 0);
			this.aClass1_Sub1_Sub2_Sub3_9 = new Class1_Sub1_Sub2_Sub3(this.aClass45_1, "titlebutton", 0);
			this.aClass1_Sub1_Sub2_Sub3Array3 = new Class1_Sub1_Sub2_Sub3[12];
			for (@Pc(30) int local30 = 0; local30 < 12; local30++) {
				this.aClass1_Sub1_Sub2_Sub3Array3[local30] = new Class1_Sub1_Sub2_Sub3(this.aClass45_1, "runes", local30);
			}
			this.aClass1_Sub1_Sub2_Sub2_10 = new Class1_Sub1_Sub2_Sub2(128, 265);
			this.aClass1_Sub1_Sub2_Sub2_11 = new Class1_Sub1_Sub2_Sub2(128, 265);
			for (@Pc(63) int local63 = 0; local63 < 33920; local63++) {
				this.aClass1_Sub1_Sub2_Sub2_10.anIntArray198[local63] = this.aClass36_19.anIntArray224[local63];
			}
			for (@Pc(81) int local81 = 0; local81 < 33920; local81++) {
				this.aClass1_Sub1_Sub2_Sub2_11.anIntArray198[local81] = this.aClass36_20.anIntArray224[local81];
			}
			this.anIntArray81 = new int[256];
			for (@Pc(103) int local103 = 0; local103 < 64; local103++) {
				this.anIntArray81[local103] = local103 * 262144;
			}
			for (@Pc(118) int local118 = 0; local118 < 64; local118++) {
				this.anIntArray81[local118 + 64] = local118 * 1024 + 16711680;
			}
			for (@Pc(137) int local137 = 0; local137 < 64; local137++) {
				this.anIntArray81[local137 + 128] = local137 * 4 + 16776960;
			}
			for (@Pc(156) int local156 = 0; local156 < 64; local156++) {
				this.anIntArray81[local156 + 192] = 16777215;
			}
			this.anIntArray82 = new int[256];
			for (@Pc(175) int local175 = 0; local175 < 64; local175++) {
				this.anIntArray82[local175] = local175 * 1024;
			}
			for (@Pc(190) int local190 = 0; local190 < 64; local190++) {
				this.anIntArray82[local190 + 64] = local190 * 4 + 65280;
			}
			for (@Pc(209) int local209 = 0; local209 < 64; local209++) {
				this.anIntArray82[local209 + 128] = local209 * 262144 + 65535;
			}
			for (@Pc(228) int local228 = 0; local228 < 64; local228++) {
				this.anIntArray82[local228 + 192] = 16777215;
			}
			this.anIntArray83 = new int[256];
			for (@Pc(247) int local247 = 0; local247 < 64; local247++) {
				this.anIntArray83[local247] = local247 * 4;
			}
			for (@Pc(262) int local262 = 0; local262 < 64; local262++) {
				this.anIntArray83[local262 + 64] = local262 * 262144 + 255;
			}
			for (@Pc(281) int local281 = 0; local281 < 64; local281++) {
				this.anIntArray83[local281 + 128] = local281 * 1024 + 16711935;
			}
			for (@Pc(300) int local300 = 0; local300 < 64; local300++) {
				this.anIntArray83[local300 + 192] = 16777215;
			}
			this.anIntArray80 = new int[256];
			this.anIntArray26 = new int[32768];
			this.anIntArray27 = new int[32768];
			this.method113(null);
			this.anIntArray48 = new int[32768];
			this.anIntArray49 = new int[32768];
			this.method91(anInt389, 10, "Connecting to fileserver");
			if (!this.aBoolean41) {
				this.aBoolean61 = true;
				this.aBoolean41 = true;
				this.method90(this, 2);
			}
		} catch (@Pc(357) RuntimeException local357) {
			signlink.reporterror("30562, " + 19297 + ", " + local357.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method173() {
		try {
			if (super.anInt243 == 1) {
				if (super.anInt244 >= 8 && super.anInt244 <= 108 && super.anInt245 >= 490 && super.anInt245 <= 522) {
					this.anInt393 = (this.anInt393 + 1) % 4;
					this.aBoolean44 = true;
					this.aBoolean51 = true;
					this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 130);
					this.aClass1_Sub1_Sub3_4.method457(this.anInt393);
					this.aClass1_Sub1_Sub3_4.method457(this.anInt385);
					this.aClass1_Sub1_Sub3_4.method457(this.anInt291);
				}
				if (super.anInt244 >= 137 && super.anInt244 <= 237 && super.anInt245 >= 490 && super.anInt245 <= 522) {
					this.anInt385 = (this.anInt385 + 1) % 3;
					this.aBoolean44 = true;
					this.aBoolean51 = true;
					this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 130);
					this.aClass1_Sub1_Sub3_4.method457(this.anInt393);
					this.aClass1_Sub1_Sub3_4.method457(this.anInt385);
					this.aClass1_Sub1_Sub3_4.method457(this.anInt291);
				}
				if (super.anInt244 >= 275 && super.anInt244 <= 375 && super.anInt245 >= 490 && super.anInt245 <= 522) {
					this.anInt291 = (this.anInt291 + 1) % 3;
					this.aBoolean44 = true;
					this.aBoolean51 = true;
					this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 130);
					this.aClass1_Sub1_Sub3_4.method457(this.anInt393);
					this.aClass1_Sub1_Sub3_4.method457(this.anInt385);
					this.aClass1_Sub1_Sub3_4.method457(this.anInt291);
				}
				if (super.anInt244 >= 416 && super.anInt244 <= 516 && super.anInt245 >= 490 && super.anInt245 <= 522) {
					this.method143();
					this.aString16 = "";
					this.aBoolean55 = false;
					for (@Pc(194) int local194 = 0; local194 < Class6.aClass6Array1.length; local194++) {
						if (Class6.aClass6Array1[local194] != null && Class6.aClass6Array1[local194].anInt457 == 600) {
							this.anInt264 = this.anInt449 = Class6.aClass6Array1[local194].anInt454;
							return;
						}
					}
					return;
				}
			}
		} catch (@Pc(223) RuntimeException local223) {
			signlink.reporterror("3669, " + -75 + ", " + local223.toString());
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
					this.aClass8_1.method235();
				}
			} catch (@Pc(9) Exception local9) {
			}
			this.aClass8_1 = null;
			this.method221();
			this.aClass42_Sub1_1.method616();
			this.aClass42_Sub1_1 = null;
			this.aClass1_Sub1_Sub3_4 = null;
			this.aClass1_Sub1_Sub3_2 = null;
			this.aClass1_Sub1_Sub3_3 = null;
			this.anIntArray73 = null;
			this.aByteArrayArray2 = null;
			this.aByteArrayArray1 = null;
			this.anIntArray74 = null;
			this.anIntArray75 = null;
			this.anIntArrayArrayArray3 = null;
			this.aByteArrayArrayArray7 = null;
			this.aClass37_1 = null;
			this.aClass17Array1 = null;
			this.anIntArrayArray5 = null;
			this.anIntArrayArray4 = null;
			this.anIntArray84 = null;
			this.anIntArray85 = null;
			this.aByteArray2 = null;
			this.aClass36_25 = null;
			this.aClass36_26 = null;
			this.aClass36_27 = null;
			this.aClass36_28 = null;
			this.aClass36_13 = null;
			this.aClass36_14 = null;
			this.aClass36_15 = null;
			this.aClass36_3 = null;
			this.aClass36_4 = null;
			this.aClass36_5 = null;
			this.aClass36_6 = null;
			this.aClass36_7 = null;
			this.aClass36_8 = null;
			this.aClass36_9 = null;
			this.aClass36_10 = null;
			this.aClass36_11 = null;
			this.aClass36_12 = null;
			this.aClass1_Sub1_Sub2_Sub3_13 = null;
			this.aClass1_Sub1_Sub2_Sub3_14 = null;
			this.aClass1_Sub1_Sub2_Sub3_15 = null;
			this.aClass1_Sub1_Sub2_Sub3_10 = null;
			this.aClass1_Sub1_Sub2_Sub3_11 = null;
			this.aClass1_Sub1_Sub2_Sub3_12 = null;
			this.aClass1_Sub1_Sub2_Sub3Array2 = null;
			this.aClass1_Sub1_Sub2_Sub3_3 = null;
			this.aClass1_Sub1_Sub2_Sub3_4 = null;
			this.aClass1_Sub1_Sub2_Sub3_5 = null;
			this.aClass1_Sub1_Sub2_Sub3_6 = null;
			this.aClass1_Sub1_Sub2_Sub3_7 = null;
			this.aClass1_Sub1_Sub2_Sub3_16 = null;
			this.aClass1_Sub1_Sub2_Sub3_17 = null;
			this.aClass1_Sub1_Sub2_Sub3_18 = null;
			this.aClass1_Sub1_Sub2_Sub3_19 = null;
			this.aClass1_Sub1_Sub2_Sub3_20 = null;
			this.aClass1_Sub1_Sub2_Sub2_1 = null;
			this.aClass1_Sub1_Sub2_Sub2Array6 = null;
			this.aClass1_Sub1_Sub2_Sub2Array3 = null;
			this.aClass1_Sub1_Sub2_Sub2Array5 = null;
			this.aClass1_Sub1_Sub2_Sub2_2 = null;
			this.aClass1_Sub1_Sub2_Sub2_3 = null;
			this.aClass1_Sub1_Sub2_Sub2_4 = null;
			this.aClass1_Sub1_Sub2_Sub2_5 = null;
			this.aClass1_Sub1_Sub2_Sub3Array1 = null;
			this.aClass1_Sub1_Sub2_Sub2Array7 = null;
			this.anIntArrayArray2 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub2Array1 = null;
			this.anIntArray71 = null;
			this.anIntArray72 = null;
			this.aClass1_Sub1_Sub3Array1 = null;
			this.anIntArray53 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub1Array1 = null;
			this.anIntArray38 = null;
			this.aClass31ArrayArrayArray1 = null;
			this.aClass31_1 = null;
			this.aClass31_2 = null;
			this.aClass31_3 = null;
			this.anIntArray56 = null;
			this.anIntArray57 = null;
			this.anIntArray58 = null;
			this.anIntArray59 = null;
			this.aStringArray5 = null;
			this.anIntArray41 = null;
			this.anIntArray35 = null;
			this.anIntArray36 = null;
			this.aClass1_Sub1_Sub2_Sub2Array4 = null;
			this.aClass1_Sub1_Sub2_Sub2_9 = null;
			this.aStringArray3 = null;
			this.aLongArray4 = null;
			this.anIntArray40 = null;
			this.aClass36_19 = null;
			this.aClass36_20 = null;
			this.aClass36_16 = null;
			this.aClass36_17 = null;
			this.aClass36_18 = null;
			this.aClass36_21 = null;
			this.aClass36_22 = null;
			this.aClass36_23 = null;
			this.aClass36_24 = null;
			this.method139();
			Class9.method248();
			Class11.method304();
			Class13.method315();
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
			Class1_Sub1_Sub2_Sub1.method351();
			Class37.method548();
			Class1_Sub1_Sub1_Sub5.method274();
			Class14.method329();
			System.gc();
		} catch (@Pc(351) RuntimeException local351) {
			signlink.reporterror("40840, " + -83 + ", " + local351.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)V")
	private void method174(@OriginalArg(1) int arg0) {
		try {
			signlink.anInt924 = arg0;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("54804, " + -3 + ", " + arg0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method175() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt255);
			if (this.aClass42_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass42_Sub1_1.anInt968);
			}
			System.out.println("loop-cycle:" + anInt320);
			this.anInt442 += 0;
			System.out.println("draw-cycle:" + anInt259);
			System.out.println("ptype:" + this.anInt443);
			System.out.println("psize:" + this.anInt442);
			if (this.aClass8_1 != null) {
				this.aClass8_1.method240();
			}
			super.aBoolean27 = true;
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("34501, " + 0 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)Ljava/awt/Component;")
	@Override
	protected Component method89() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("36395, " + true + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!d;)Z")
	private boolean method176(@OriginalArg(1) Class6 arg0) {
		try {
			if (arg0.anIntArray88 == null) {
				return false;
			}
			for (@Pc(6) int local6 = 0; local6 < arg0.anIntArray88.length; local6++) {
				@Pc(14) int local14 = this.method184(local6, arg0);
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
			this.aBoolean60 &= true;
			return true;
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("90967, " + true + ", " + arg0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIB)I")
	private int method177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) int local3 = arg1 >> 7;
			@Pc(7) int local7 = arg0 >> 7;
			@Pc(9) int local9 = arg2;
			if (arg2 < 3 && (this.aByteArrayArrayArray7[1][local3][local7] & 0x2) == 2) {
				local9 = arg2 + 1;
			}
			@Pc(29) int local29 = arg1 & 0x7F;
			@Pc(33) int local33 = arg0 & 0x7F;
			@Pc(61) int local61 = this.anIntArrayArrayArray3[local9][local3][local7] * (128 - local29) + this.anIntArrayArrayArray3[local9][local3 + 1][local7] * local29 >> 7;
			@Pc(93) int local93 = this.anIntArrayArrayArray3[local9][local3][local7 + 1] * (128 - local29) + this.anIntArrayArrayArray3[local9][local3 + 1][local7 + 1] * local29 >> 7;
			return local61 * (128 - local33) + local93 * local33 >> 7;
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("79667, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 67 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
	private void method178() {
		try {
			@Pc(9) int local9 = (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt135 >> 7) + this.anInt411;
			@Pc(17) int local17 = (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt136 >> 7) + this.anInt412;
			if (local9 >= 2944 && local9 < 3392 && local17 >= 3520 && local17 < 6400) {
				this.anInt298 = (local17 - 3520) / 8 + 1;
			} else if (local9 >= 2944 && local9 < 3392 && local17 >= 9920 && local17 < 12800) {
				this.anInt298 = (local17 - 9920) / 8 + 1;
			} else {
				this.anInt298 = 0;
			}
			this.anInt403 = 0;
			if (local9 >= 3328 && local9 < 3392 && local17 >= 3200 && local17 < 3264) {
				@Pc(85) int local85 = local9 & 0x3F;
				@Pc(89) int local89 = local17 & 0x3F;
				if (local85 >= 4 && local85 <= 29 && local89 >= 44 && local89 <= 58) {
					this.anInt403 = 1;
				}
				if (local85 >= 36 && local85 <= 61 && local89 >= 44 && local89 <= 58) {
					this.anInt403 = 1;
				}
				if (local85 >= 4 && local85 <= 29 && local89 >= 25 && local89 <= 39) {
					this.anInt403 = 1;
				}
				if (local85 >= 36 && local85 <= 61 && local89 >= 25 && local89 <= 39) {
					this.anInt403 = 1;
				}
				if (local85 >= 4 && local85 <= 29 && local89 >= 6 && local89 <= 20) {
					this.anInt403 = 1;
				}
				if (local85 >= 36 && local85 <= 61 && local89 >= 6 && local89 <= 20) {
					this.anInt403 = 1;
				}
			}
			if (this.anInt403 == 0 && local9 >= 3328 && local9 <= 3393 && local17 >= 3203 && local17 <= 3325) {
				this.anInt403 = 2;
			}
			this.anInt427 = 0;
			if (local9 >= 3053 && local9 <= 3156 && local17 >= 3056 && local17 <= 3136) {
				this.anInt427 = 1;
			}
			if (local9 >= 3072 && local9 <= 3118 && local17 >= 9492 && local17 <= 9535) {
				this.anInt427 = 1;
			}
			if (this.anInt427 == 1 && local9 >= 3139 && local9 <= 3199 && local17 >= 3008 && local17 <= 3062) {
				this.anInt427 = 0;
			}
		} catch (@Pc(262) RuntimeException local262) {
			signlink.reporterror("56271, " + 106 + ", " + local262.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II[B)Z")
	private boolean method180(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			return arg1 == null ? true : signlink.wavesave(arg1, arg0);
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("88087, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIII)Z")
	private boolean method181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(7) int local7 = arg1 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass37_1.method579(this.anInt253, arg3, arg2, arg1);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(43) Class9 local43 = Class9.method249(local7);
				@Pc(51) int local51;
				@Pc(54) int local54;
				if (local31 == 0 || local31 == 2) {
					local51 = local43.anInt520;
					local54 = local43.anInt521;
				} else {
					local51 = local43.anInt521;
					local54 = local43.anInt520;
				}
				@Pc(65) int local65 = local43.anInt532;
				if (local31 != 0) {
					local65 = (local65 << local31 & 0xF) + (local65 >> 4 - local31);
				}
				this.method94(false, arg2, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0], 0, local65, 2, (byte) 8, local54, arg3, 0, local51);
			} else {
				this.method94(false, arg2, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0], local31, 0, 2, (byte) 8, 0, arg3, local25 + 1, 0);
			}
			this.anInt372 = super.anInt244;
			this.anInt373 = super.anInt245;
			this.anInt375 = 2;
			this.anInt374 = 0;
			this.aClass1_Sub1_Sub3_4.method456(this.anInt448, arg0);
			this.aClass1_Sub1_Sub3_4.method458(arg3 + this.anInt411);
			this.aClass1_Sub1_Sub3_4.method458(arg2 + this.anInt412);
			this.aClass1_Sub1_Sub3_4.method458(local7);
			return true;
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("83328, " + arg0 + ", " + arg1 + ", " + 6 + ", " + arg2 + ", " + arg3 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method182() {
		try {
			this.aBoolean60 &= true;
			for (@Pc(12) Class1_Sub1_Sub1_Sub6 local12 = (Class1_Sub1_Sub1_Sub6) this.aClass31_3.method497(); local12 != null; local12 = (Class1_Sub1_Sub1_Sub6) this.aClass31_3.method499()) {
				if (local12.anInt583 != this.anInt253 || local12.aBoolean110) {
					local12.method630();
				} else if (anInt320 >= local12.anInt582) {
					local12.method313(this.anInt341);
					if (local12.aBoolean110) {
						local12.method630();
					} else {
						this.aClass37_1.method560(local12.anInt584, 0, -1, local12.anInt583, local12.anInt585, false, local12, 60, local12.anInt586);
					}
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("12034, " + true + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method183() {
		try {
			this.aClass36_28.method545();
			Class1_Sub1_Sub2_Sub1.anIntArray175 = this.anIntArray45;
			this.aClass1_Sub1_Sub2_Sub3_15.method422(0, 0, 373);
			if (this.aBoolean46) {
				this.aClass1_Sub1_Sub2_Sub4_3.method440(this.aString9, 239, 40, 0);
				this.aClass1_Sub1_Sub2_Sub4_3.method440(this.aString7 + "*", 239, 60, 128);
			} else if (this.aBoolean63) {
				this.aClass1_Sub1_Sub2_Sub4_3.method440("Enter amount:", 239, 40, 0);
				this.aClass1_Sub1_Sub2_Sub4_3.method440(this.aString8 + "*", 239, 60, 128);
			} else if (this.aString12 != null) {
				this.aClass1_Sub1_Sub2_Sub4_3.method440(this.aString12, 239, 40, 0);
				this.aClass1_Sub1_Sub2_Sub4_3.method440("Click to continue", 239, 60, 128);
			} else if (this.anInt419 != -1) {
				this.method123(0, Class6.aClass6Array1[this.anInt419], 0, 0);
			} else if (this.anInt431 == -1) {
				@Pc(133) Class1_Sub1_Sub2_Sub4 local133 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(135) int local135 = 0;
				Class1_Sub1_Sub2.method434(0, 0, 77, 463);
				for (@Pc(143) int local143 = 0; local143 < 100; local143++) {
					if (this.aStringArray2[local143] != null) {
						@Pc(155) int local155 = this.anIntArray25[local143];
						@Pc(164) int local164 = this.anInt367 + 70 - local135 * 14;
						if (local155 == 0) {
							if (local164 > 0 && local164 < 110) {
								local133.method443(4, this.aStringArray2[local143], this.aBoolean32, 0, local164);
							}
							local135++;
						}
						if (local155 == 1) {
							if (local164 > 0 && local164 < 110) {
								local133.method443(4, this.aStringArray1[local143] + ":", this.aBoolean32, 16777215, local164);
								local133.method443(local133.method442(this.aStringArray1[local143]) + 12, this.aStringArray2[local143], this.aBoolean32, 255, local164);
							}
							local135++;
						}
						if (local155 == 2 && (this.anInt393 == 0 || this.anInt393 == 1 && this.method132(this.aStringArray1[local143]))) {
							if (local164 > 0 && local164 < 110) {
								local133.method443(4, this.aStringArray1[local143] + ":", this.aBoolean32, 0, local164);
								local133.method443(local133.method442(this.aStringArray1[local143]) + 12, this.aStringArray2[local143], this.aBoolean32, 255, local164);
							}
							local135++;
						}
						if ((local155 == 3 || local155 == 7) && this.anInt322 == 0 && (local155 == 7 || this.anInt385 == 0 || this.anInt385 == 1 && this.method132(this.aStringArray1[local143]))) {
							if (local164 > 0 && local164 < 110) {
								local133.method443(4, "From " + this.aStringArray1[local143] + ":", this.aBoolean32, 0, local164);
								local133.method443(local133.method442("From " + this.aStringArray1[local143]) + 12, this.aStringArray2[local143], this.aBoolean32, 8388608, local164);
							}
							local135++;
						}
						if (local155 == 4 && (this.anInt291 == 0 || this.anInt291 == 1 && this.method132(this.aStringArray1[local143]))) {
							if (local164 > 0 && local164 < 110) {
								local133.method443(4, this.aStringArray1[local143] + " " + this.aStringArray2[local143], this.aBoolean32, 8388736, local164);
							}
							local135++;
						}
						if (local155 == 5 && this.anInt322 == 0 && this.anInt385 < 2) {
							if (local164 > 0 && local164 < 110) {
								local133.method443(4, this.aStringArray2[local143], this.aBoolean32, 8388608, local164);
							}
							local135++;
						}
						if (local155 == 6 && this.anInt322 == 0 && this.anInt385 < 2) {
							if (local164 > 0 && local164 < 110) {
								local133.method443(4, "To " + this.aStringArray1[local143] + ":", this.aBoolean32, 0, local164);
								local133.method443(local133.method442("To " + this.aStringArray1[local143]) + 12, this.aStringArray2[local143], this.aBoolean32, 8388608, local164);
							}
							local135++;
						}
						if (local155 == 8 && (this.anInt291 == 0 || this.anInt291 == 1 && this.method132(this.aStringArray1[local143]))) {
							if (local164 > 0 && local164 < 110) {
								local133.method443(4, this.aStringArray1[local143] + " " + this.aStringArray2[local143], this.aBoolean32, 13350793, local164);
							}
							local135++;
						}
					}
				}
				Class1_Sub1_Sub2.method433(705);
				this.anInt392 = local135 * 14 + 7;
				if (this.anInt392 < 78) {
					this.anInt392 = 78;
				}
				this.method101(this.anInt392 - this.anInt367 - 77, this.anInt392, 463, 0, 77);
				local133.method443(4, Class46.method644(this.aString13) + ":", this.aBoolean32, 0, 90);
				local133.method443(local133.method442(this.aString13 + ": ") + 6, this.aString17 + "*", this.aBoolean32, 255, 90);
				Class1_Sub1_Sub2.method438(0, 0, 479, 77);
			} else {
				this.method123(0, Class6.aClass6Array1[this.anInt431], 0, 0);
			}
			if (this.aBoolean54 && this.anInt397 == 2) {
				this.method170();
			}
			this.aClass36_28.method546(22, super.aGraphics2, 375);
			this.aClass36_27.method545();
			Class1_Sub1_Sub2_Sub1.anIntArray175 = this.anIntArray47;
		} catch (@Pc(663) RuntimeException local663) {
			signlink.reporterror("35394, " + false + ", " + local663.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!d;)I")
	private int method184(@OriginalArg(1) int arg0, @OriginalArg(2) Class6 arg1) {
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
						local23 += this.anIntArray30[local21[local25++]];
					}
					if (local30 == 2) {
						local23 += this.anIntArray29[local21[local25++]];
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
						local23 += this.anIntArray41[local21[local25++]];
					}
					if (local30 == 6) {
						local23 += anIntArray31[this.anIntArray29[local21[local25++]] - 1];
					}
					if (local30 == 7) {
						local23 += this.anIntArray41[local21[local25++]] * 100 / 46875;
					}
					if (local30 == 8) {
						local23 += aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt185;
					}
					@Pc(173) int local173;
					if (local30 == 9) {
						for (local173 = 0; local173 < 19; local173++) {
							if (local173 == 18) {
								local173 = 20;
							}
							local23 += this.anIntArray29[local173];
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
						local23 += this.anInt311;
					}
					if (local30 == 12) {
						local23 += this.anInt377;
					}
					if (local30 == 13) {
						local173 = this.anIntArray41[local21[local25++]];
						local90 = local21[local25++];
						local23 += (local173 & 0x1 << local90) == 0 ? 0 : 1;
					}
				}
			} catch (@Pc(276) Exception local276) {
				return -1;
			}
		} catch (@Pc(279) RuntimeException local279) {
			signlink.reporterror("83736, " + 568 + ", " + arg0 + ", " + arg1 + ", " + local279.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
	private void method185(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			if (this.anInt327 == 0) {
				@Pc(16) int local16 = super.anInt243;
				if (this.anInt266 == 1 && super.anInt244 >= 520 && super.anInt245 >= 165 && super.anInt244 <= 788 && super.anInt245 <= 230) {
					local16 = 0;
				}
				@Pc(47) int local47;
				@Pc(50) int local50;
				@Pc(126) int local126;
				if (this.aBoolean54) {
					if (local16 != 1) {
						local47 = super.anInt241;
						local50 = super.anInt242;
						if (this.anInt397 == 0) {
							local47 -= 8;
							local50 -= 11;
						}
						if (this.anInt397 == 1) {
							local47 -= 562;
							local50 -= 231;
						}
						if (this.anInt397 == 2) {
							local47 -= 22;
							local50 -= 375;
						}
						if (local47 < this.anInt398 - 10 || local47 > this.anInt398 + this.anInt400 + 10 || local50 < this.anInt399 - 10 || local50 > this.anInt399 + this.anInt401 + 10) {
							this.aBoolean54 = false;
							if (this.anInt397 == 1) {
								this.aBoolean65 = true;
							}
							if (this.anInt397 == 2) {
								this.aBoolean51 = true;
							}
						}
					}
					if (local16 == 1) {
						local47 = this.anInt398;
						local50 = this.anInt399;
						local126 = this.anInt400;
						@Pc(129) int local129 = super.anInt244;
						@Pc(132) int local132 = super.anInt245;
						if (this.anInt397 == 0) {
							local129 -= 8;
							local132 -= 11;
						}
						if (this.anInt397 == 1) {
							local129 -= 562;
							local132 -= 231;
						}
						if (this.anInt397 == 2) {
							local129 -= 22;
							local132 -= 375;
						}
						@Pc(151) int local151 = -1;
						for (@Pc(153) int local153 = 0; local153 < this.anInt420; local153++) {
							@Pc(168) int local168 = local50 + (this.anInt420 - 1 - local153) * 15 + 31;
							if (local129 > local47 && local129 < local47 + local126 && local132 > local168 - 13 && local132 < local168 + 3) {
								local151 = local153;
							}
						}
						if (local151 != -1) {
							this.method142(local151);
						}
						this.aBoolean54 = false;
						if (this.anInt397 == 1) {
							this.aBoolean65 = true;
						}
						if (this.anInt397 == 2) {
							this.aBoolean51 = true;
							return;
						}
					}
				} else {
					if (local16 == 1 && this.anInt420 > 0) {
						local47 = this.anIntArray58[this.anInt420 - 1];
						if (local47 == 602 || local47 == 596 || local47 == 22 || local47 == 892 || local47 == 415 || local47 == 405 || local47 == 38 || local47 == 422 || local47 == 478 || local47 == 347 || local47 == 188) {
							local50 = this.anIntArray56[this.anInt420 - 1];
							local126 = this.anIntArray57[this.anInt420 - 1];
							@Pc(285) Class6 local285 = Class6.aClass6Array1[local126];
							if (local285.aBoolean71) {
								this.aBoolean29 = false;
								this.anInt342 = 0;
								this.anInt325 = local126;
								this.anInt326 = local50;
								this.anInt327 = 2;
								this.anInt328 = super.anInt244;
								this.anInt329 = super.anInt245;
								if (Class6.aClass6Array1[local126].anInt454 == this.anInt449) {
									this.anInt327 = 1;
								}
								if (Class6.aClass6Array1[local126].anInt454 == this.anInt419) {
									this.anInt327 = 3;
								}
								return;
							}
						}
					}
					if (local16 == 1 && (this.anInt390 == 1 || this.method215(this.anInt420 - 1)) && this.anInt420 > 2) {
						local16 = 2;
					}
					if (local16 == 1 && this.anInt420 > 0) {
						this.method142(this.anInt420 - 1);
					}
					if (local16 != 2 || this.anInt420 <= 0) {
						return;
					}
					this.method153();
				}
			}
		} catch (@Pc(377) RuntimeException local377) {
			signlink.reporterror("91886, " + arg0 + ", " + local377.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[BZ)V")
	private void method186(@OriginalArg(1) byte[] arg0, @OriginalArg(2) boolean arg1) {
		try {
			if (this.anInt275 != 7) {
				this.aBoolean33 = !this.aBoolean33;
			}
			signlink.anInt922 = arg1 ? 1 : 0;
			signlink.midisave(arg0, arg0.length);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("36007, " + 7 + ", " + arg0 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(B)V")
	private void method187(@OriginalArg(0) byte arg0) {
		try {
			if (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt135 >> 7 == this.anInt354 && aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt136 >> 7 == this.anInt355) {
				this.anInt354 = 0;
			}
			for (@Pc(20) int local20 = -1; local20 < this.anInt417; local20++) {
				@Pc(27) Class1_Sub1_Sub1_Sub1_Sub2 local27;
				@Pc(32) int local32;
				if (local20 == -1) {
					local27 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
					local32 = this.anInt416 << 14;
				} else {
					local27 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray71[local20]];
					local32 = this.anIntArray71[local20] << 14;
				}
				if (local27 != null && local27.method44()) {
					local27.aBoolean15 = false;
					if ((aBoolean31 && this.anInt417 > 50 || this.anInt417 > 200) && local20 != -1 && local27.anInt157 == local27.anInt139) {
						local27.aBoolean15 = true;
					}
					@Pc(84) int local84 = local27.anInt135 >> 7;
					@Pc(89) int local89 = local27.anInt136 >> 7;
					if (local84 >= 0 && local84 < 104 && local89 >= 0 && local89 < 104) {
						if (local27.aClass1_Sub1_Sub1_Sub5_1 == null || anInt320 < local27.anInt187 || anInt320 >= local27.anInt188) {
							if ((local27.anInt135 & 0x7F) == 64 && (local27.anInt136 & 0x7F) == 64) {
								if (this.anIntArrayArray2[local84][local89] == this.anInt343) {
									continue;
								}
								this.anIntArrayArray2[local84][local89] = this.anInt343;
							}
							local27.anInt186 = this.method177(local27.anInt136, local27.anInt135, this.anInt253);
							this.aClass37_1.method560(local27.anInt135, local27.anInt137, local32, this.anInt253, local27.anInt136, local27.aBoolean12, local27, 60, local27.anInt186);
						} else {
							local27.aBoolean15 = false;
							local27.anInt186 = this.method177(local27.anInt136, local27.anInt135, this.anInt253);
							this.aClass37_1.method561(local27, local27.anInt136, local27.anInt194, local27.anInt192, local27.anInt195, this.anInt253, local27.anInt135, local27.anInt186, local32, local27.anInt137, local27.anInt193);
						}
					}
				}
			}
			@Pc(222) boolean local222 = false;
		} catch (@Pc(225) RuntimeException local225) {
			signlink.reporterror("95676, " + arg0 + ", " + local225.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZI)V")
	private void method188(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(1) int local1 = 0;
			for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
				if (this.aStringArray2[local3] != null) {
					@Pc(15) int local15 = this.anIntArray25[local3];
					@Pc(26) int local26 = this.anInt367 + 70 + 4 - local1 * 14;
					if (local26 < -20) {
						break;
					}
					if (local15 == 0) {
						local1++;
					}
					if ((local15 == 1 || local15 == 2) && (local15 == 1 || this.anInt393 == 0 || this.anInt393 == 1 && this.method132(this.aStringArray1[local3]))) {
						if (arg1 > local26 - 14 && arg1 <= local26 && !this.aStringArray1[local3].equals(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4)) {
							if (this.aBoolean57) {
								this.aStringArray5[this.anInt420] = "Report abuse @whi@" + this.aStringArray1[local3];
								this.anIntArray58[this.anInt420] = 34;
								this.anInt420++;
							}
							this.aStringArray5[this.anInt420] = "Add ignore @whi@" + this.aStringArray1[local3];
							this.anIntArray58[this.anInt420] = 436;
							this.anInt420++;
							this.aStringArray5[this.anInt420] = "Add friend @whi@" + this.aStringArray1[local3];
							this.anIntArray58[this.anInt420] = 406;
							this.anInt420++;
						}
						local1++;
					}
					if ((local15 == 3 || local15 == 7) && this.anInt322 == 0 && (local15 == 7 || this.anInt385 == 0 || this.anInt385 == 1 && this.method132(this.aStringArray1[local3]))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							if (this.aBoolean57) {
								this.aStringArray5[this.anInt420] = "Report abuse @whi@" + this.aStringArray1[local3];
								this.anIntArray58[this.anInt420] = 34;
								this.anInt420++;
							}
							this.aStringArray5[this.anInt420] = "Add ignore @whi@" + this.aStringArray1[local3];
							this.anIntArray58[this.anInt420] = 436;
							this.anInt420++;
							this.aStringArray5[this.anInt420] = "Add friend @whi@" + this.aStringArray1[local3];
							this.anIntArray58[this.anInt420] = 406;
							this.anInt420++;
						}
						local1++;
					}
					if (local15 == 4 && (this.anInt291 == 0 || this.anInt291 == 1 && this.method132(this.aStringArray1[local3]))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							this.aStringArray5[this.anInt420] = "Accept trade @whi@" + this.aStringArray1[local3];
							this.anIntArray58[this.anInt420] = 903;
							this.anInt420++;
						}
						local1++;
					}
					if ((local15 == 5 || local15 == 6) && this.anInt322 == 0 && this.anInt385 < 2) {
						local1++;
					}
					if (local15 == 8 && (this.anInt291 == 0 || this.anInt291 == 1 && this.method132(this.aStringArray1[local3]))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							this.aStringArray5[this.anInt420] = "Accept duel @whi@" + this.aStringArray1[local3];
							this.anIntArray58[this.anInt420] = 363;
							this.anInt420++;
						}
						local1++;
					}
				}
			}
		} catch (@Pc(409) RuntimeException local409) {
			signlink.reporterror("57963, " + arg0 + ", " + true + ", " + arg1 + ", " + local409.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZILclient!mb;)V")
	private void method189(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt772 + 10 < arg0 * 8) {
					@Pc(12) int local12 = arg1.method478(11);
					if (local12 != 2047) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12] = new Class1_Sub1_Sub1_Sub1_Sub2();
							if (this.aClass1_Sub1_Sub3Array1[local12] != null) {
								this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12].method45(this.aClass1_Sub1_Sub3Array1[local12]);
							}
						}
						this.anIntArray71[this.anInt417++] = local12;
						@Pc(58) Class1_Sub1_Sub1_Sub1_Sub2 local58 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12];
						local58.anInt177 = anInt320;
						@Pc(66) int local66 = arg1.method478(5);
						if (local66 > 15) {
							local66 -= 32;
						}
						@Pc(75) int local75 = arg1.method478(5);
						if (local75 > 15) {
							local75 -= 32;
						}
						@Pc(84) int local84 = arg1.method478(1);
						local58.method42(local84 == 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0] + local75, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0] + local66);
						@Pc(110) int local110 = arg1.method478(1);
						if (local110 == 1) {
							this.anIntArray72[this.anInt418++] = local12;
						}
						continue;
					}
				}
				arg1.method479(this.anInt334);
				return;
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("59904, " + false + ", " + arg0 + ", " + arg1 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)Z")
	private boolean method190() {
		try {
			if (this.aClass8_1 == null) {
				return false;
			}
			@Pc(3168) String local3168;
			@Pc(223) int local223;
			try {
				@Pc(15) int local15 = this.aClass8_1.method237();
				if (local15 == 0) {
					return false;
				}
				if (this.anInt443 == -1) {
					this.aClass8_1.method238(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 1);
					this.anInt443 = this.aClass1_Sub1_Sub3_3.aByteArray9[0] & 0xFF;
					if (this.aClass44_1 != null) {
						this.anInt443 = this.anInt443 - this.aClass44_1.method635() & 0xFF;
					}
					this.anInt442 = Class15.anIntArray169[this.anInt443];
					local15--;
				}
				if (this.anInt442 == -1) {
					if (local15 <= 0) {
						return false;
					}
					this.aClass8_1.method238(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 1);
					this.anInt442 = this.aClass1_Sub1_Sub3_3.aByteArray9[0] & 0xFF;
					local15--;
				}
				if (this.anInt442 == -2) {
					if (local15 <= 1) {
						return false;
					}
					this.aClass8_1.method238(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 2);
					this.aClass1_Sub1_Sub3_3.anInt771 = 0;
					this.anInt442 = this.aClass1_Sub1_Sub3_3.method469();
					local15 -= 2;
				}
				if (local15 < this.anInt442) {
					return false;
				}
				this.aClass1_Sub1_Sub3_3.anInt771 = 0;
				this.aClass8_1.method238(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, this.anInt442);
				this.anInt444 = 0;
				this.anInt388 = this.anInt387;
				this.anInt387 = this.anInt386;
				this.anInt386 = this.anInt443;
				if (this.anInt443 == 11) {
					this.anInt318 = this.aClass1_Sub1_Sub3_3.method469() * 30;
					this.anInt443 = -1;
					return true;
				}
				@Pc(179) int local179;
				if (this.anInt443 == 64) {
					this.anInt396 = this.anInt442 / 8;
					for (local179 = 0; local179 < this.anInt396; local179++) {
						this.aLongArray3[local179] = this.aClass1_Sub1_Sub3_3.method473();
					}
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 18) {
					this.method96();
					this.anInt443 = -1;
					return false;
				}
				@Pc(235) int local235;
				@Pc(229) int local229;
				@Pc(239) int local239;
				if (this.anInt443 == 120) {
					local179 = this.aClass1_Sub1_Sub3_3.method469();
					local223 = this.aClass1_Sub1_Sub3_3.method469();
					local229 = local223 >> 10 & 0x1F;
					local235 = local223 >> 5 & 0x1F;
					local239 = local223 & 0x1F;
					Class6.aClass6Array1[local179].anInt468 = (local229 << 19) + (local235 << 11) + (local239 << 3);
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 115) {
					if (this.anInt358 != -1) {
						this.anInt358 = -1;
						this.aBoolean65 = true;
						this.aBoolean36 = true;
					}
					if (this.anInt419 != -1) {
						this.anInt419 = -1;
						this.aBoolean51 = true;
					}
					if (this.aBoolean63) {
						this.aBoolean63 = false;
						this.aBoolean51 = true;
					}
					this.anInt449 = -1;
					this.aBoolean38 = false;
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 135) {
					local179 = this.aClass1_Sub1_Sub3_3.method469();
					@Pc(318) byte local318 = this.aClass1_Sub1_Sub3_3.method468();
					this.anIntArray78[local179] = local318;
					if (this.anIntArray41[local179] != local318) {
						this.anIntArray41[local179] = local318;
						this.method129(local179);
						this.aBoolean65 = true;
						if (this.anInt431 != -1) {
							this.aBoolean51 = true;
						}
					}
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 211) {
					local179 = this.aClass1_Sub1_Sub3_3.method469();
					local223 = this.aClass1_Sub1_Sub3_3.method469();
					Class6.aClass6Array1[local179].anInt471 = 1;
					Class6.aClass6Array1[local179].anInt472 = local223;
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 78) {
					local179 = this.aClass1_Sub1_Sub3_3.method469();
					local223 = this.aClass1_Sub1_Sub3_3.method469();
					local229 = this.aClass1_Sub1_Sub3_3.method469();
					@Pc(399) Class13 local399 = Class13.method316(local223);
					Class6.aClass6Array1[local179].anInt471 = 4;
					Class6.aClass6Array1[local179].anInt472 = local223;
					Class6.aClass6Array1[local179].anInt478 = local399.anInt595;
					Class6.aClass6Array1[local179].anInt479 = local399.anInt596;
					Class6.aClass6Array1[local179].anInt477 = local399.anInt594 * 100 / local229;
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 46) {
					local179 = this.aClass1_Sub1_Sub3_3.method469();
					this.method121(local179);
					if (this.anInt358 != -1) {
						this.anInt358 = -1;
						this.aBoolean65 = true;
						this.aBoolean36 = true;
					}
					this.anInt419 = local179;
					this.aBoolean51 = true;
					this.anInt449 = -1;
					this.aBoolean38 = false;
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 8) {
					this.aBoolean53 = false;
					for (local179 = 0; local179 < 5; local179++) {
						this.aBooleanArray4[local179] = false;
					}
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 35) {
					this.anInt393 = this.aClass1_Sub1_Sub3_3.method467();
					this.anInt385 = this.aClass1_Sub1_Sub3_3.method467();
					this.anInt291 = this.aClass1_Sub1_Sub3_3.method467();
					this.aBoolean44 = true;
					this.aBoolean51 = true;
					this.anInt443 = -1;
					return true;
				}
				@Pc(731) int local731;
				@Pc(789) int local789;
				@Pc(810) int local810;
				if (this.anInt443 == 3) {
					local179 = this.aClass1_Sub1_Sub3_3.method469();
					local223 = this.aClass1_Sub1_Sub3_3.method469();
					if (this.anInt368 == local179 && this.anInt369 == local223 && this.anInt281 == 2) {
						this.anInt443 = -1;
						return true;
					}
					this.anInt368 = local179;
					this.anInt369 = local223;
					this.anInt411 = (this.anInt368 - 6) * 8;
					this.anInt412 = (this.anInt369 - 6) * 8;
					this.aBoolean59 = false;
					if ((this.anInt368 / 8 == 48 || this.anInt368 / 8 == 49) && this.anInt369 / 8 == 48) {
						this.aBoolean59 = true;
					}
					if (this.anInt368 / 8 == 48 && this.anInt369 / 8 == 148) {
						this.aBoolean59 = true;
					}
					this.anInt281 = 1;
					this.aClass36_27.method545();
					this.aClass1_Sub1_Sub2_Sub4_2.method440("Loading - please wait.", 257, 151, 0);
					this.aClass1_Sub1_Sub2_Sub4_2.method440("Loading - please wait.", 256, 150, 16777215);
					this.aClass36_27.method546(8, super.aGraphics2, 11);
					local229 = 0;
					for (local235 = (this.anInt368 - 6) / 8; local235 <= (this.anInt368 + 6) / 8; local235++) {
						for (local239 = (this.anInt369 - 6) / 8; local239 <= (this.anInt369 + 6) / 8; local239++) {
							local229++;
						}
					}
					this.aByteArrayArray2 = new byte[local229][];
					this.aByteArrayArray1 = new byte[local229][];
					this.anIntArray73 = new int[local229];
					this.anIntArray74 = new int[local229];
					this.anIntArray75 = new int[local229];
					local229 = 0;
					for (local239 = (this.anInt368 - 6) / 8; local239 <= (this.anInt368 + 6) / 8; local239++) {
						for (local731 = (this.anInt369 - 6) / 8; local731 <= (this.anInt369 + 6) / 8; local731++) {
							this.anIntArray73[local229] = (local239 << 8) + local731;
							if (this.aBoolean59 && (local731 == 49 || local731 == 149 || local731 == 147 || local239 == 50 || local239 == 49 && local731 == 47)) {
								this.anIntArray74[local229] = -1;
								this.anIntArray75[local229] = -1;
								local229++;
							} else {
								local789 = this.anIntArray74[local229] = this.aClass42_Sub1_1.method619(local239, local731, 0);
								if (local789 != -1) {
									this.aClass42_Sub1_1.method622(3, local789);
								}
								local810 = this.anIntArray75[local229] = this.aClass42_Sub1_1.method619(local239, local731, 1);
								if (local810 != -1) {
									this.aClass42_Sub1_1.method622(3, local810);
								}
								local229++;
							}
						}
					}
					local731 = this.anInt411 - this.anInt413;
					local789 = this.anInt412 - this.anInt414;
					this.anInt413 = this.anInt411;
					this.anInt414 = this.anInt412;
					for (local810 = 0; local810 < 8192; local810++) {
						@Pc(866) Class1_Sub1_Sub1_Sub1_Sub1 local866 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local810];
						if (local866 != null) {
							for (@Pc(870) int local870 = 0; local870 < 10; local870++) {
								local866.anIntArray7[local870] -= local731;
								local866.anIntArray8[local870] -= local789;
							}
							local866.anInt135 -= local731 * 128;
							local866.anInt136 -= local789 * 128;
						}
					}
					for (@Pc(914) int local914 = 0; local914 < this.anInt415; local914++) {
						@Pc(921) Class1_Sub1_Sub1_Sub1_Sub2 local921 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local914];
						if (local921 != null) {
							for (@Pc(925) int local925 = 0; local925 < 10; local925++) {
								local921.anIntArray7[local925] -= local731;
								local921.anIntArray8[local925] -= local789;
							}
							local921.anInt135 -= local731 * 128;
							local921.anInt136 -= local789 * 128;
						}
					}
					@Pc(970) byte local970 = 0;
					@Pc(972) byte local972 = 104;
					@Pc(974) byte local974 = 1;
					if (local731 < 0) {
						local970 = 103;
						local972 = -1;
						local974 = -1;
					}
					@Pc(984) byte local984 = 0;
					@Pc(986) byte local986 = 104;
					@Pc(988) byte local988 = 1;
					if (local789 < 0) {
						local984 = 103;
						local986 = -1;
						local988 = -1;
					}
					for (@Pc(998) int local998 = local970; local998 != local972; local998 += local974) {
						for (@Pc(1002) int local1002 = local984; local1002 != local986; local1002 += local988) {
							@Pc(1008) int local1008 = local998 + local731;
							@Pc(1012) int local1012 = local1002 + local789;
							for (@Pc(1014) int local1014 = 0; local1014 < 4; local1014++) {
								if (local1008 >= 0 && local1012 >= 0 && local1008 < 104 && local1012 < 104) {
									this.aClass31ArrayArrayArray1[local1014][local998][local1002] = this.aClass31ArrayArrayArray1[local1014][local1008][local1012];
								} else {
									this.aClass31ArrayArrayArray1[local1014][local998][local1002] = null;
								}
							}
						}
					}
					for (@Pc(1076) Class1_Sub2 local1076 = (Class1_Sub2) this.aClass31_1.method497(); local1076 != null; local1076 = (Class1_Sub2) this.aClass31_1.method499()) {
						local1076.anInt823 -= local731;
						local1076.anInt824 -= local789;
						if (local1076.anInt823 < 0 || local1076.anInt824 < 0 || local1076.anInt823 >= 104 || local1076.anInt824 >= 104) {
							local1076.method630();
						}
					}
					if (this.anInt354 != 0) {
						this.anInt354 -= local731;
						this.anInt355 -= local789;
					}
					this.aBoolean53 = false;
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 25) {
					Class10.method256();
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 94) {
					this.anInt370 = this.aClass1_Sub1_Sub3_3.method467();
					if (this.anInt370 == this.anInt436) {
						if (this.anInt370 == 3) {
							this.anInt436 = 1;
						} else {
							this.anInt436 = 3;
						}
						this.aBoolean65 = true;
					}
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 246 || this.anInt443 == 248 || this.anInt443 == 131 || this.anInt443 == 215 || this.anInt443 == 67 || this.anInt443 == 247 || this.anInt443 == 167 || this.anInt443 == 230 || this.anInt443 == 31 || this.anInt443 == 112) {
					this.method105(this.anInt443, this.aClass1_Sub1_Sub3_3);
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 146) {
					local179 = this.aClass1_Sub1_Sub3_3.method469();
					local223 = this.aClass1_Sub1_Sub3_3.method469();
					Class6.aClass6Array1[local179].anInt471 = 2;
					Class6.aClass6Array1[local179].anInt472 = local223;
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 159) {
					this.aBoolean65 = true;
					local179 = this.aClass1_Sub1_Sub3_3.method467();
					local223 = this.aClass1_Sub1_Sub3_3.method472();
					local229 = this.aClass1_Sub1_Sub3_3.method467();
					this.anIntArray44[local179] = local223;
					this.anIntArray30[local179] = local229;
					this.anIntArray29[local179] = 1;
					for (local235 = 0; local235 < 98; local235++) {
						if (local223 >= anIntArray31[local235]) {
							this.anIntArray29[local179] = local235 + 2;
						}
					}
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 15) {
					local179 = this.aClass1_Sub1_Sub3_3.method469();
					local223 = this.aClass1_Sub1_Sub3_3.method467();
					if (local179 == 65535) {
						local179 = -1;
					}
					this.anIntArray54[local223] = local179;
					this.aBoolean65 = true;
					this.aBoolean36 = true;
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 202) {
					this.aBoolean53 = true;
					this.anInt300 = this.aClass1_Sub1_Sub3_3.method467();
					this.anInt301 = this.aClass1_Sub1_Sub3_3.method467();
					this.anInt302 = this.aClass1_Sub1_Sub3_3.method469();
					this.anInt303 = this.aClass1_Sub1_Sub3_3.method467();
					this.anInt304 = this.aClass1_Sub1_Sub3_3.method467();
					if (this.anInt304 >= 100) {
						this.anInt293 = this.anInt300 * 128 + 64;
						this.anInt295 = this.anInt301 * 128 + 64;
						this.anInt294 = this.method177(this.anInt301, this.anInt300, this.anInt253) - this.anInt302;
					}
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 107) {
					local179 = this.aClass1_Sub1_Sub3_3.method469();
					this.method121(local179);
					if (this.anInt419 != -1) {
						this.anInt419 = -1;
						this.aBoolean51 = true;
					}
					if (this.aBoolean63) {
						this.aBoolean63 = false;
						this.aBoolean51 = true;
					}
					this.anInt358 = local179;
					this.aBoolean65 = true;
					this.aBoolean36 = true;
					this.anInt449 = -1;
					this.aBoolean38 = false;
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 250) {
					this.anInt378 = this.aClass1_Sub1_Sub3_3.method467();
					this.anInt379 = this.aClass1_Sub1_Sub3_3.method467();
					while (this.aClass1_Sub1_Sub3_3.anInt771 < this.anInt442) {
						local179 = this.aClass1_Sub1_Sub3_3.method467();
						this.method105(local179, this.aClass1_Sub1_Sub3_3);
					}
					this.anInt443 = -1;
					return true;
				}
				@Pc(1521) long local1521;
				if (this.anInt443 == 2) {
					local1521 = this.aClass1_Sub1_Sub3_3.method473();
					local229 = this.aClass1_Sub1_Sub3_3.method467();
					@Pc(1531) String local1531 = Class46.method644(Class46.method641(local1521));
					for (local239 = 0; local239 < this.anInt306; local239++) {
						if (local1521 == this.aLongArray4[local239]) {
							if (this.anIntArray40[local239] != local229) {
								this.anIntArray40[local239] = local229;
								this.aBoolean65 = true;
								if (local229 > 0) {
									this.method136(local1531 + " has logged in.", 5, "");
								}
								if (local229 == 0) {
									this.method136(local1531 + " has logged out.", 5, "");
								}
							}
							local1531 = null;
							break;
						}
					}
					if (local1531 != null && this.anInt306 < 100) {
						this.aLongArray4[this.anInt306] = local1521;
						this.aStringArray3[this.anInt306] = local1531;
						this.anIntArray40[this.anInt306] = local229;
						this.anInt306++;
						this.aBoolean65 = true;
					}
					@Pc(1629) boolean local1629 = false;
					while (!local1629) {
						local1629 = true;
						for (local789 = 0; local789 < this.anInt306 - 1; local789++) {
							if (this.anIntArray40[local789] != anInt250 && this.anIntArray40[local789 + 1] == anInt250 || this.anIntArray40[local789] == 0 && this.anIntArray40[local789 + 1] != 0) {
								local810 = this.anIntArray40[local789];
								this.anIntArray40[local789] = this.anIntArray40[local789 + 1];
								this.anIntArray40[local789 + 1] = local810;
								@Pc(1690) String local1690 = this.aStringArray3[local789];
								this.aStringArray3[local789] = this.aStringArray3[local789 + 1];
								this.aStringArray3[local789 + 1] = local1690;
								@Pc(1712) long local1712 = this.aLongArray4[local789];
								this.aLongArray4[local789] = this.aLongArray4[local789 + 1];
								this.aLongArray4[local789 + 1] = local1712;
								this.aBoolean65 = true;
								local1629 = false;
							}
						}
					}
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 130) {
					this.method93(this.anInt442, this.aClass1_Sub1_Sub3_3);
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 13) {
					this.anInt436 = this.aClass1_Sub1_Sub3_3.method467();
					this.aBoolean65 = true;
					this.aBoolean36 = true;
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 173) {
					local179 = this.aClass1_Sub1_Sub3_3.method469();
					@Pc(1801) boolean local1801 = this.aClass1_Sub1_Sub3_3.method467() == 1;
					Class6.aClass6Array1[local179].aBoolean69 = local1801;
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 65) {
					this.anInt354 = 0;
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 153) {
					for (local179 = 0; local179 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length; local179++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local179] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local179].anInt160 = -1;
						}
					}
					for (local223 = 0; local223 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length; local223++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local223] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local223].anInt160 = -1;
						}
					}
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 22) {
					this.aBoolean46 = false;
					this.aBoolean63 = true;
					this.aString8 = "";
					this.aBoolean51 = true;
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 186) {
					if (this.anInt436 == 12) {
						this.aBoolean65 = true;
					}
					this.anInt311 = this.aClass1_Sub1_Sub3_3.method467();
					this.anInt443 = -1;
					return true;
				}
				@Pc(1931) Class6 local1931;
				if (this.anInt443 == 182) {
					this.aBoolean65 = true;
					local179 = this.aClass1_Sub1_Sub3_3.method469();
					local1931 = Class6.aClass6Array1[local179];
					while (this.aClass1_Sub1_Sub3_3.anInt771 < this.anInt442) {
						local229 = this.aClass1_Sub1_Sub3_3.method467();
						local235 = this.aClass1_Sub1_Sub3_3.method469();
						local239 = this.aClass1_Sub1_Sub3_3.method467();
						if (local239 == 255) {
							local239 = this.aClass1_Sub1_Sub3_3.method472();
						}
						if (local229 >= 0 && local229 < local1931.anIntArray86.length) {
							local1931.anIntArray86[local229] = local235;
							local1931.anIntArray87[local229] = local239;
						}
					}
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 200) {
					if (this.anInt436 == 12) {
						this.aBoolean65 = true;
					}
					this.anInt377 = this.aClass1_Sub1_Sub3_3.method470();
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 21) {
					local179 = this.aClass1_Sub1_Sub3_3.method469();
					Class6.aClass6Array1[local179].anInt471 = 3;
					Class6.aClass6Array1[local179].anInt472 = (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray10[0] << 24) + (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray10[4] << 18) + (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray9[0] << 12) + (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray9[8] << 6) + aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray9[11];
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 183) {
					local179 = this.aClass1_Sub1_Sub3_3.method469();
					local223 = this.aClass1_Sub1_Sub3_3.method469();
					Class6.aClass6Array1[local179].anInt475 = local223;
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 140) {
					local179 = this.aClass1_Sub1_Sub3_3.method469();
					local223 = this.aClass1_Sub1_Sub3_3.method469();
					if (this.anInt419 != -1) {
						this.anInt419 = -1;
						this.aBoolean51 = true;
					}
					if (this.aBoolean63) {
						this.aBoolean63 = false;
						this.aBoolean51 = true;
					}
					this.anInt449 = local179;
					this.anInt358 = local223;
					this.aBoolean65 = true;
					this.aBoolean36 = true;
					this.aBoolean38 = false;
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 178) {
					local179 = this.aClass1_Sub1_Sub3_3.method469();
					if (local179 == 65535) {
						local179 = -1;
					}
					if (local179 != this.anInt274 && this.aBoolean49 && !aBoolean31) {
						this.anInt276 = local179;
						this.aBoolean39 = true;
						this.aClass42_Sub1_1.method622(2, this.anInt276);
					}
					this.anInt274 = local179;
					this.anInt435 = 0;
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 75) {
					local179 = this.aClass1_Sub1_Sub3_3.method469();
					local223 = this.aClass1_Sub1_Sub3_3.method469();
					if (this.aBoolean49 && !aBoolean31) {
						this.anInt276 = local179;
						this.aBoolean39 = false;
						this.aClass42_Sub1_1.method622(2, this.anInt276);
						this.anInt435 = local223;
					}
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 157) {
					local179 = this.aClass1_Sub1_Sub3_3.method469();
					local1931 = Class6.aClass6Array1[local179];
					for (local229 = 0; local229 < local1931.anIntArray86.length; local229++) {
						local1931.anIntArray86[local229] = -1;
						local1931.anIntArray86[local229] = 0;
					}
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 155) {
					local179 = this.aClass1_Sub1_Sub3_3.method469();
					local223 = this.aClass1_Sub1_Sub3_3.method470();
					local229 = this.aClass1_Sub1_Sub3_3.method470();
					@Pc(2267) Class6 local2267 = Class6.aClass6Array1[local179];
					local2267.anInt460 = local223;
					local2267.anInt461 = local229;
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 24) {
					this.anInt352 = this.aClass1_Sub1_Sub3_3.method472();
					this.anInt422 = this.aClass1_Sub1_Sub3_3.method469();
					this.anInt353 = this.aClass1_Sub1_Sub3_3.method467();
					this.anInt404 = this.aClass1_Sub1_Sub3_3.method469();
					if (this.anInt352 != 0 && this.anInt449 == -1) {
						signlink.dnslookup(Class46.method643(this.anInt352));
						this.method143();
						@Pc(2319) short local2319 = 650;
						if (this.anInt353 != 201) {
							local2319 = 655;
						}
						this.aString16 = "";
						this.aBoolean55 = false;
						for (local223 = 0; local223 < Class6.aClass6Array1.length; local223++) {
							if (Class6.aClass6Array1[local223] != null && Class6.aClass6Array1[local223].anInt457 == local2319) {
								this.anInt449 = Class6.aClass6Array1[local223].anInt454;
								break;
							}
						}
					}
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 203) {
					this.aBoolean65 = true;
					local179 = this.aClass1_Sub1_Sub3_3.method469();
					local1931 = Class6.aClass6Array1[local179];
					local229 = this.aClass1_Sub1_Sub3_3.method467();
					for (local235 = 0; local235 < local229; local235++) {
						local1931.anIntArray86[local235] = this.aClass1_Sub1_Sub3_3.method469();
						local239 = this.aClass1_Sub1_Sub3_3.method467();
						if (local239 == 255) {
							local239 = this.aClass1_Sub1_Sub3_3.method472();
						}
						local1931.anIntArray87[local235] = local239;
					}
					for (local239 = local229; local239 < local1931.anIntArray86.length; local239++) {
						local1931.anIntArray86[local239] = 0;
						local1931.anIntArray87[local239] = 0;
					}
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 181) {
					local179 = this.aClass1_Sub1_Sub3_3.method469();
					local223 = this.aClass1_Sub1_Sub3_3.method472();
					this.anIntArray78[local179] = local223;
					if (this.anIntArray41[local179] != local223) {
						this.anIntArray41[local179] = local223;
						this.method129(local179);
						this.aBoolean65 = true;
						if (this.anInt431 != -1) {
							this.aBoolean51 = true;
						}
					}
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 110) {
					@Pc(2492) Class1_Sub1_Sub3 local2492 = Class10.method259();
					if (local2492 != null) {
						this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 54);
						this.aClass1_Sub1_Sub3_4.method458(local2492.anInt771);
						this.aClass1_Sub1_Sub3_4.method465(local2492.aByteArray9, local2492.anInt771);
						local2492.method455();
					}
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 0) {
					this.aBoolean53 = true;
					this.anInt312 = this.aClass1_Sub1_Sub3_3.method467();
					this.anInt313 = this.aClass1_Sub1_Sub3_3.method467();
					this.anInt314 = this.aClass1_Sub1_Sub3_3.method469();
					this.anInt315 = this.aClass1_Sub1_Sub3_3.method467();
					this.anInt316 = this.aClass1_Sub1_Sub3_3.method467();
					if (this.anInt316 >= 100) {
						local179 = this.anInt312 * 128 + 64;
						local223 = this.anInt313 * 128 + 64;
						local229 = this.method177(this.anInt313, this.anInt312, this.anInt253) - this.anInt314;
						local235 = local179 - this.anInt293;
						local239 = local229 - this.anInt294;
						local731 = local223 - this.anInt295;
						local789 = (int) Math.sqrt((double) (local235 * local235 + local731 * local731));
						this.anInt296 = (int) (Math.atan2((double) local239, (double) local789) * 325.949D) & 0x7FF;
						this.anInt297 = (int) (Math.atan2((double) local235, (double) local731) * -325.949D) & 0x7FF;
						if (this.anInt296 < 128) {
							this.anInt296 = 128;
						}
						if (this.anInt296 > 383) {
							this.anInt296 = 383;
						}
					}
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 168) {
					local179 = this.aClass1_Sub1_Sub3_3.method470();
					this.anInt431 = local179;
					this.aBoolean51 = true;
					this.anInt443 = -1;
					return true;
				}
				@Pc(2684) String local2684;
				if (this.anInt443 == 98) {
					local179 = this.aClass1_Sub1_Sub3_3.method469();
					local2684 = this.aClass1_Sub1_Sub3_3.method474();
					Class6.aClass6Array1[local179].aString18 = local2684;
					if (Class6.aClass6Array1[local179].anInt454 == this.anIntArray54[this.anInt436]) {
						this.aBoolean65 = true;
					}
					this.anInt443 = -1;
					return true;
				}
				@Pc(2726) boolean local2726;
				if (this.anInt443 == 82) {
					local1521 = this.aClass1_Sub1_Sub3_3.method473();
					local229 = this.aClass1_Sub1_Sub3_3.method472();
					local235 = this.aClass1_Sub1_Sub3_3.method467();
					local2726 = false;
					for (local731 = 0; local731 < 100; local731++) {
						if (this.anIntArray76[local731] == local229) {
							local2726 = true;
							break;
						}
					}
					if (local235 <= 1) {
						for (local789 = 0; local789 < this.anInt396; local789++) {
							if (this.aLongArray3[local789] == local1521) {
								local2726 = true;
								break;
							}
						}
					}
					if (!local2726 && this.anInt427 == 0) {
						try {
							this.anIntArray76[this.anInt407] = local229;
							this.anInt407 = (this.anInt407 + 1) % 100;
							@Pc(2795) String local2795 = Class2.method36(this.anInt442 - 13, this.aClass1_Sub1_Sub3_3);
							@Pc(2799) String local2799 = Class32.method512(local2795, 713);
							if (local235 > 1) {
								this.method136(local2799, 7, Class46.method644(Class46.method641(local1521)));
							} else {
								this.method136(local2799, 3, Class46.method644(Class46.method641(local1521)));
							}
						} catch (@Pc(2826) Exception local2826) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 144) {
					this.anInt378 = this.aClass1_Sub1_Sub3_3.method467();
					this.anInt379 = this.aClass1_Sub1_Sub3_3.method467();
					for (local179 = this.anInt378; local179 < this.anInt378 + 8; local179++) {
						for (local223 = this.anInt379; local223 < this.anInt379 + 8; local223++) {
							if (this.aClass31ArrayArrayArray1[this.anInt253][local179][local223] != null) {
								this.aClass31ArrayArrayArray1[this.anInt253][local179][local223] = null;
								this.method102(local179, local223);
							}
						}
					}
					for (@Pc(2901) Class1_Sub2 local2901 = (Class1_Sub2) this.aClass31_1.method497(); local2901 != null; local2901 = (Class1_Sub2) this.aClass31_1.method499()) {
						if (local2901.anInt823 >= this.anInt378 && local2901.anInt823 < this.anInt378 + 8 && local2901.anInt824 >= this.anInt379 && local2901.anInt824 < this.anInt379 + 8 && local2901.anInt821 == this.anInt253) {
							local2901.anInt832 = 0;
						}
					}
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 254) {
					this.method163(this.anInt442, this.aClass1_Sub1_Sub3_3);
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 90) {
					this.anInt378 = this.aClass1_Sub1_Sub3_3.method467();
					this.anInt379 = this.aClass1_Sub1_Sub3_3.method467();
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 96) {
					local179 = this.aClass1_Sub1_Sub3_3.method469();
					local223 = this.aClass1_Sub1_Sub3_3.method467();
					local229 = this.aClass1_Sub1_Sub3_3.method469();
					if (this.aBoolean58 && !aBoolean31 && this.anInt265 < 50) {
						this.anIntArray55[this.anInt265] = local179;
						this.anIntArray69[this.anInt265] = local223;
						this.anIntArray28[this.anInt265] = local229 + Class5.anIntArray22[local179];
						this.anInt265++;
					}
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 36) {
					local179 = this.aClass1_Sub1_Sub3_3.method469();
					this.method121(local179);
					if (this.anInt358 != -1) {
						this.anInt358 = -1;
						this.aBoolean65 = true;
						this.aBoolean36 = true;
					}
					if (this.anInt419 != -1) {
						this.anInt419 = -1;
						this.aBoolean51 = true;
					}
					if (this.aBoolean63) {
						this.aBoolean63 = false;
						this.aBoolean51 = true;
					}
					this.anInt449 = local179;
					this.aBoolean38 = false;
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 199) {
					this.anInt410 = this.aClass1_Sub1_Sub3_3.method467();
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 118) {
					local179 = this.aClass1_Sub1_Sub3_3.method467();
					local223 = this.aClass1_Sub1_Sub3_3.method467();
					local229 = this.aClass1_Sub1_Sub3_3.method467();
					local235 = this.aClass1_Sub1_Sub3_3.method467();
					this.aBooleanArray4[local179] = true;
					this.anIntArray50[local179] = local223;
					this.anIntArray68[local179] = local229;
					this.anIntArray32[local179] = local235;
					this.anIntArray51[local179] = 0;
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 177) {
					local3168 = this.aClass1_Sub1_Sub3_3.method474();
					@Pc(3182) long local3182;
					if (local3168.endsWith(":tradereq:")) {
						local2684 = local3168.substring(0, local3168.indexOf(":"));
						local3182 = Class46.method640(local2684);
						local2726 = false;
						for (local731 = 0; local731 < this.anInt396; local731++) {
							if (this.aLongArray3[local731] == local3182) {
								local2726 = true;
								break;
							}
						}
						if (!local2726 && this.anInt427 == 0) {
							this.method136("wishes to trade with you.", 4, local2684);
						}
					} else if (local3168.endsWith(":duelreq:")) {
						local2684 = local3168.substring(0, local3168.indexOf(":"));
						local3182 = Class46.method640(local2684);
						local2726 = false;
						for (local731 = 0; local731 < this.anInt396; local731++) {
							if (this.aLongArray3[local731] == local3182) {
								local2726 = true;
								break;
							}
						}
						if (!local2726 && this.anInt427 == 0) {
							this.method136("wishes to duel with you.", 8, local2684);
						}
					} else {
						this.method136(local3168, 0, "");
					}
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 228) {
					this.anInt371 = this.aClass1_Sub1_Sub3_3.method467();
					if (this.anInt371 == 1) {
						this.anInt321 = this.aClass1_Sub1_Sub3_3.method469();
					}
					if (this.anInt371 >= 2 && this.anInt371 <= 6) {
						if (this.anInt371 == 2) {
							this.anInt365 = 64;
							this.anInt366 = 64;
						}
						if (this.anInt371 == 3) {
							this.anInt365 = 0;
							this.anInt366 = 64;
						}
						if (this.anInt371 == 4) {
							this.anInt365 = 128;
							this.anInt366 = 64;
						}
						if (this.anInt371 == 5) {
							this.anInt365 = 64;
							this.anInt366 = 0;
						}
						if (this.anInt371 == 6) {
							this.anInt365 = 64;
							this.anInt366 = 128;
						}
						this.anInt371 = 2;
						this.anInt362 = this.aClass1_Sub1_Sub3_3.method469();
						this.anInt363 = this.aClass1_Sub1_Sub3_3.method469();
						this.anInt364 = this.aClass1_Sub1_Sub3_3.method467();
					}
					if (this.anInt371 == 10) {
						this.anInt262 = this.aClass1_Sub1_Sub3_3.method469();
					}
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 43) {
					for (local179 = 0; local179 < this.anIntArray41.length; local179++) {
						if (this.anIntArray41[local179] != this.anIntArray78[local179]) {
							this.anIntArray41[local179] = this.anIntArray78[local179];
							this.method129(local179);
							this.aBoolean65 = true;
						}
					}
					this.anInt443 = -1;
					return true;
				}
				if (this.anInt443 == 27) {
					this.anInt430 = this.aClass1_Sub1_Sub3_3.method469();
					this.anInt443 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt443 + "," + this.anInt442 + " - " + this.anInt387 + "," + this.anInt388);
				this.method96();
			} catch (@Pc(3471) IOException local3471) {
				this.method119();
			} catch (@Pc(3476) Exception local3476) {
				local3168 = "T2 - " + this.anInt443 + "," + this.anInt387 + "," + this.anInt388 + " - " + this.anInt442 + "," + (this.anInt411 + aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray7[0]) + "," + (this.anInt412 + aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray8[0]) + " - ";
				for (local223 = 0; local223 < this.anInt442 && local223 < 50; local223++) {
					local3168 = local3168 + this.aClass1_Sub1_Sub3_3.aByteArray9[local223] + ",";
				}
				signlink.reporterror(local3168);
				this.method96();
			}
			return true;
		} catch (@Pc(3557) RuntimeException local3557) {
			signlink.reporterror("9364, " + 0 + ", " + local3557.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
	private int method191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) int local3 = 256 - arg0;
			return arg1 < 0 ? ((arg2 & 0xFF00FF) * local3 + (arg3 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg2 & 0xFF00) * local3 + (arg3 & 0xFF00) * arg0 & 0xFF0000) >> 8 : this.anInt273;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("37356, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method192() {
		try {
			if (this.anInt420 >= 2 || this.anInt285 != 0 || this.anInt266 != 0) {
				@Pc(37) String local37;
				if (this.anInt285 == 1 && this.anInt420 < 2) {
					local37 = "Use " + this.aString6 + " with...";
				} else if (this.anInt266 == 1 && this.anInt420 < 2) {
					local37 = this.aString5 + "...";
				} else {
					local37 = this.aStringArray5[this.anInt420 - 1];
				}
				if (this.anInt420 > 2) {
					local37 = local37 + "@whi@ / " + (this.anInt420 - 2) + " more options";
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method446(16777215, local37, anInt320 / 1000, 4, 15);
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("97309, " + false + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!mb;I)V")
	private void method193(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt418; local1++) {
				@Pc(8) int local8 = this.anIntArray72[local1];
				@Pc(13) Class1_Sub1_Sub1_Sub1_Sub2 local13 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local8];
				@Pc(16) int local16 = arg1.method467();
				if ((local16 & 0x80) == 128) {
					local16 += arg1.method467() << 8;
				}
				this.method169(local13, local8, arg1, local16);
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("60824, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIILclient!d;)V")
	private void method194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class6 arg6) {
		try {
			if (arg6.anInt455 == 0 && arg6.anIntArray90 != null && !arg6.aBoolean69 && (arg2 >= arg0 && arg3 >= arg1 && arg2 <= arg0 + arg6.anInt458 && arg3 <= arg1 + arg6.anInt459)) {
				@Pc(34) int local34 = arg6.anIntArray90.length;
				@Pc(38) boolean local38 = false;
				for (@Pc(40) int local40 = 0; local40 < local34; local40++) {
					@Pc(49) int local49 = arg6.anIntArray91[local40] + arg0;
					@Pc(58) int local58 = arg6.anIntArray92[local40] + arg1 - arg5;
					@Pc(65) Class6 local65 = Class6.aClass6Array1[arg6.anIntArray90[local40]];
					@Pc(70) int local70 = local49 + local65.anInt460;
					@Pc(75) int local75 = local58 + local65.anInt461;
					if ((local65.anInt462 >= 0 || local65.anInt470 != 0) && arg2 >= local70 && arg3 >= local75 && arg2 < local70 + local65.anInt458 && arg3 < local75 + local65.anInt459) {
						if (local65.anInt462 >= 0) {
							this.anInt332 = local65.anInt462;
						} else {
							this.anInt332 = local65.anInt453;
						}
					}
					if (local65.anInt455 == 0) {
						this.method194(local70, local75, arg2, arg3, 972, local65.anInt464, local65);
						if (local65.anInt463 > local65.anInt459) {
							this.method150(local65.anInt459, true, local65, local70 + local65.anInt458, arg3, local65.anInt463, local75, arg2);
						}
					} else {
						if (local65.anInt456 == 1 && arg2 >= local70 && arg3 >= local75 && arg2 < local70 + local65.anInt458 && arg3 < local75 + local65.anInt459) {
							@Pc(172) boolean local172 = false;
							if (local65.anInt457 != 0) {
								local172 = this.method100(local65);
							}
							if (!local172) {
								this.aStringArray5[this.anInt420] = local65.aString22;
								this.anIntArray58[this.anInt420] = 951;
								this.anIntArray57[this.anInt420] = local65.anInt453;
								this.anInt420++;
							}
						}
						if (local65.anInt456 == 2 && this.anInt266 == 0 && arg2 >= local70 && arg3 >= local75 && arg2 < local70 + local65.anInt458 && arg3 < local75 + local65.anInt459) {
							@Pc(236) String local236 = local65.aString20;
							if (local236.indexOf(" ") != -1) {
								local236 = local236.substring(0, local236.indexOf(" "));
							}
							this.aStringArray5[this.anInt420] = local236 + " @gre@" + local65.aString21;
							this.anIntArray58[this.anInt420] = 930;
							this.anIntArray57[this.anInt420] = local65.anInt453;
							this.anInt420++;
						}
						if (local65.anInt456 == 3 && arg2 >= local70 && arg3 >= local75 && arg2 < local70 + local65.anInt458 && arg3 < local75 + local65.anInt459) {
							this.aStringArray5[this.anInt420] = "Close";
							this.anIntArray58[this.anInt420] = 947;
							this.anIntArray57[this.anInt420] = local65.anInt453;
							this.anInt420++;
						}
						if (local65.anInt456 == 4 && arg2 >= local70 && arg3 >= local75 && arg2 < local70 + local65.anInt458 && arg3 < local75 + local65.anInt459) {
							this.aStringArray5[this.anInt420] = local65.aString22;
							this.anIntArray58[this.anInt420] = 465;
							this.anIntArray57[this.anInt420] = local65.anInt453;
							this.anInt420++;
						}
						if (local65.anInt456 == 5 && arg2 >= local70 && arg3 >= local75 && arg2 < local70 + local65.anInt458 && arg3 < local75 + local65.anInt459) {
							this.aStringArray5[this.anInt420] = local65.aString22;
							this.anIntArray58[this.anInt420] = 960;
							this.anIntArray57[this.anInt420] = local65.anInt453;
							this.anInt420++;
						}
						if (local65.anInt456 == 6 && !this.aBoolean38 && arg2 >= local70 && arg3 >= local75 && arg2 < local70 + local65.anInt458 && arg3 < local75 + local65.anInt459) {
							this.aStringArray5[this.anInt420] = local65.aString22;
							this.anIntArray58[this.anInt420] = 44;
							this.anIntArray57[this.anInt420] = local65.anInt453;
							this.anInt420++;
						}
						if (local65.anInt455 == 2) {
							@Pc(484) int local484 = 0;
							for (@Pc(486) int local486 = 0; local486 < local65.anInt459; local486++) {
								for (@Pc(490) int local490 = 0; local490 < local65.anInt458; local490++) {
									@Pc(501) int local501 = local70 + local490 * (local65.anInt466 + 32);
									@Pc(510) int local510 = local75 + local486 * (local65.anInt467 + 32);
									if (local484 < 20) {
										local501 += local65.anIntArray93[local484];
										local510 += local65.anIntArray94[local484];
									}
									if (arg2 >= local501 && arg3 >= local510 && arg2 < local501 + 32 && arg3 < local510 + 32) {
										this.anInt380 = local484;
										this.anInt381 = local65.anInt453;
										if (local65.anIntArray86[local484] > 0) {
											@Pc(563) Class13 local563 = Class13.method316(local65.anIntArray86[local484] - 1);
											if (this.anInt285 == 1 && local65.aBoolean72) {
												if (local65.anInt453 != this.anInt287 || local484 != this.anInt286) {
													this.aStringArray5[this.anInt420] = "Use " + this.aString6 + " with @lre@" + local563.aString25;
													this.anIntArray58[this.anInt420] = 881;
													this.anIntArray59[this.anInt420] = local563.anInt592;
													this.anIntArray56[this.anInt420] = local484;
													this.anIntArray57[this.anInt420] = local65.anInt453;
													this.anInt420++;
												}
											} else if (this.anInt266 != 1 || !local65.aBoolean72) {
												@Pc(700) int local700;
												if (local65.aBoolean72) {
													for (local700 = 4; local700 >= 3; local700--) {
														if (local563.aStringArray10 != null && local563.aStringArray10[local700] != null) {
															this.aStringArray5[this.anInt420] = local563.aStringArray10[local700] + " @lre@" + local563.aString25;
															if (local700 == 3) {
																this.anIntArray58[this.anInt420] = 478;
															}
															if (local700 == 4) {
																this.anIntArray58[this.anInt420] = 347;
															}
															this.anIntArray59[this.anInt420] = local563.anInt592;
															this.anIntArray56[this.anInt420] = local484;
															this.anIntArray57[this.anInt420] = local65.anInt453;
															this.anInt420++;
														} else if (local700 == 4) {
															this.aStringArray5[this.anInt420] = "Drop @lre@" + local563.aString25;
															this.anIntArray58[this.anInt420] = 347;
															this.anIntArray59[this.anInt420] = local563.anInt592;
															this.anIntArray56[this.anInt420] = local484;
															this.anIntArray57[this.anInt420] = local65.anInt453;
															this.anInt420++;
														}
													}
												}
												if (local65.aBoolean73) {
													this.aStringArray5[this.anInt420] = "Use @lre@" + local563.aString25;
													this.anIntArray58[this.anInt420] = 188;
													this.anIntArray59[this.anInt420] = local563.anInt592;
													this.anIntArray56[this.anInt420] = local484;
													this.anIntArray57[this.anInt420] = local65.anInt453;
													this.anInt420++;
												}
												if (local65.aBoolean72 && local563.aStringArray10 != null) {
													for (local700 = 2; local700 >= 0; local700--) {
														if (local563.aStringArray10[local700] != null) {
															this.aStringArray5[this.anInt420] = local563.aStringArray10[local700] + " @lre@" + local563.aString25;
															if (local700 == 0) {
																this.anIntArray58[this.anInt420] = 405;
															}
															if (local700 == 1) {
																this.anIntArray58[this.anInt420] = 38;
															}
															if (local700 == 2) {
																this.anIntArray58[this.anInt420] = 422;
															}
															this.anIntArray59[this.anInt420] = local563.anInt592;
															this.anIntArray56[this.anInt420] = local484;
															this.anIntArray57[this.anInt420] = local65.anInt453;
															this.anInt420++;
														}
													}
												}
												if (local65.aStringArray6 != null) {
													for (local700 = 4; local700 >= 0; local700--) {
														if (local65.aStringArray6[local700] != null) {
															this.aStringArray5[this.anInt420] = local65.aStringArray6[local700] + " @lre@" + local563.aString25;
															if (local700 == 0) {
																this.anIntArray58[this.anInt420] = 602;
															}
															if (local700 == 1) {
																this.anIntArray58[this.anInt420] = 596;
															}
															if (local700 == 2) {
																this.anIntArray58[this.anInt420] = 22;
															}
															if (local700 == 3) {
																this.anIntArray58[this.anInt420] = 892;
															}
															if (local700 == 4) {
																this.anIntArray58[this.anInt420] = 415;
															}
															this.anIntArray59[this.anInt420] = local563.anInt592;
															this.anIntArray56[this.anInt420] = local484;
															this.anIntArray57[this.anInt420] = local65.anInt453;
															this.anInt420++;
														}
													}
												}
												this.aStringArray5[this.anInt420] = "Examine @lre@" + local563.aString25;
												this.anIntArray58[this.anInt420] = 1773;
												this.anIntArray59[this.anInt420] = local563.anInt592;
												this.anIntArray57[this.anInt420] = local65.anIntArray87[local484];
												this.anInt420++;
											} else if ((this.anInt268 & 0x10) == 16) {
												this.aStringArray5[this.anInt420] = this.aString5 + " @lre@" + local563.aString25;
												this.anIntArray58[this.anInt420] = 391;
												this.anIntArray59[this.anInt420] = local563.anInt592;
												this.anIntArray56[this.anInt420] = local484;
												this.anIntArray57[this.anInt420] = local65.anInt453;
												this.anInt420++;
											}
										}
									}
									local484++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1126) RuntimeException local1126) {
			signlink.reporterror("57321, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local1126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(JI)V")
	private void method195(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt396; local8++) {
					if (this.aLongArray3[local8] == arg0) {
						this.anInt396--;
						this.aBoolean65 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt396; local28++) {
							this.aLongArray3[local28] = this.aLongArray3[local28 + 1];
						}
						this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 181);
						this.aClass1_Sub1_Sub3_4.method463(arg0);
						break;
					}
				}
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("95287, " + arg0 + ", " + 3 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method196() {
		try {
			this.method95();
			this.aBoolean60 &= true;
			if (this.anInt375 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array5[this.anInt374 / 100].method394(this.anInt372 - 8 - 8, this.anInt373 - 8 - 11);
			}
			if (this.anInt375 == 2) {
				this.aClass1_Sub1_Sub2_Sub2Array5[this.anInt374 / 100 + 4].method394(this.anInt372 - 8 - 8, this.anInt373 - 8 - 11);
			}
			if (this.anInt449 != -1) {
				this.method110(this.anInt341, this.anInt449);
				this.method123(0, Class6.aClass6Array1[this.anInt449], 0, 0);
			}
			this.method178();
			if (!this.aBoolean54) {
				this.method154();
				this.method192();
			} else if (this.anInt397 == 0) {
				this.method170();
			}
			if (this.anInt410 == 1) {
				if (this.anInt298 > 0 || this.anInt403 == 1) {
					this.aClass1_Sub1_Sub2_Sub2Array3[1].method394(472, 258);
				} else {
					this.aClass1_Sub1_Sub2_Sub2Array3[1].method394(472, 296);
				}
			}
			if (this.anInt298 > 0) {
				this.aClass1_Sub1_Sub2_Sub2Array3[0].method394(472, 296);
				this.aClass1_Sub1_Sub2_Sub4_2.method440("Level: " + this.anInt298, 484, 329, 16776960);
			}
			if (this.anInt403 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array3[6].method394(472, 296);
				this.aClass1_Sub1_Sub2_Sub4_2.method440("Arena", 484, 329, 16776960);
			}
			if (this.anInt318 != 0) {
				@Pc(187) int local187 = this.anInt318 / 50;
				@Pc(191) int local191 = local187 / 60;
				@Pc(195) int local195 = local187 % 60;
				if (local195 < 10) {
					this.aClass1_Sub1_Sub2_Sub4_2.method443(4, "System update in: " + local191 + ":0" + local195, this.aBoolean32, 16776960, 329);
				} else {
					this.aClass1_Sub1_Sub2_Sub4_2.method443(4, "System update in: " + local191 + ":" + local195, this.aBoolean32, 16776960, 329);
				}
			}
		} catch (@Pc(239) RuntimeException local239) {
			signlink.reporterror("71573, " + true + ", " + local239.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(B)V")
	private void method197() {
		try {
			@Pc(7) int local7 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt135 + this.anInt277;
			@Pc(13) int local13 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt136 + this.anInt323;
			if (this.anInt335 - local7 < -500 || this.anInt335 - local7 > 500 || this.anInt336 - local13 < -500 || this.anInt336 - local13 > 500) {
				this.anInt335 = local7;
				this.anInt336 = local13;
			}
			if (this.anInt335 != local7) {
				this.anInt335 += (local7 - this.anInt335) / 16;
			}
			if (this.anInt336 != local13) {
				this.anInt336 += (local13 - this.anInt336) / 16;
			}
			if (super.anIntArray23[1] == 1) {
				this.anInt440 += (-this.anInt440 - 24) / 2;
			} else if (super.anIntArray23[2] == 1) {
				this.anInt440 += (24 - this.anInt440) / 2;
			} else {
				this.anInt440 /= 2;
			}
			if (super.anIntArray23[3] == 1) {
				this.anInt441 += (12 - this.anInt441) / 2;
			} else if (super.anIntArray23[4] == 1) {
				this.anInt441 += (-this.anInt441 - 12) / 2;
			} else {
				this.anInt441 /= 2;
			}
			this.anInt439 = this.anInt439 + this.anInt440 / 2 & 0x7FF;
			this.anInt438 += this.anInt441 / 2;
			if (this.anInt438 < 128) {
				this.anInt438 = 128;
			}
			if (this.anInt438 > 383) {
				this.anInt438 = 383;
			}
			@Pc(209) int local209 = this.anInt335 >> 7;
			@Pc(214) int local214 = this.anInt336 >> 7;
			@Pc(224) int local224 = this.method177(this.anInt336, this.anInt335, this.anInt253);
			@Pc(226) int local226 = 0;
			@Pc(242) int local242;
			if (local209 > 3 && local214 > 3 && local209 < 100 && local214 < 100) {
				for (local242 = local209 - 4; local242 <= local209 + 4; local242++) {
					for (@Pc(248) int local248 = local214 - 4; local248 <= local214 + 4; local248++) {
						@Pc(253) int local253 = this.anInt253;
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
			if (local242 > this.anInt344) {
				this.anInt344 += (local242 - this.anInt344) / 24;
			} else if (local242 < this.anInt344) {
				this.anInt344 += (local242 - this.anInt344) / 80;
			}
		} catch (@Pc(344) RuntimeException local344) {
			signlink.reporterror("36217, " + -81 + ", " + local344.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method199() {
		try {
			this.anInt442 += 0;
			for (@Pc(7) int local7 = 0; local7 < this.anInt299; local7++) {
				@Pc(14) int local14 = this.anIntArray38[local7];
				@Pc(19) Class1_Sub1_Sub1_Sub1_Sub1 local19 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local14];
				if (local19 != null) {
					this.method200(local19, local19.aClass11_1.aByte10);
				}
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("22791, " + 0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!z;IB)V")
	private void method200(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0.anInt135 < 128 || arg0.anInt136 < 128 || arg0.anInt135 >= 13184 || arg0.anInt136 >= 13184) {
				arg0.anInt160 = -1;
				arg0.anInt165 = -1;
				arg0.anInt174 = 0;
				arg0.anInt175 = 0;
				arg0.anInt135 = arg0.anIntArray7[0] * 128 + arg0.anInt138 * 64;
				arg0.anInt136 = arg0.anIntArray8[0] * 128 + arg0.anInt138 * 64;
				arg0.anInt180 = 0;
			}
			if (arg0 == aClass1_Sub1_Sub1_Sub1_Sub2_1 && (arg0.anInt135 < 1536 || arg0.anInt136 < 1536 || arg0.anInt135 >= 11776 || arg0.anInt136 >= 11776)) {
				arg0.anInt160 = -1;
				arg0.anInt165 = -1;
				arg0.anInt174 = 0;
				arg0.anInt175 = 0;
				arg0.anInt135 = arg0.anIntArray7[0] * 128 + arg0.anInt138 * 64;
				arg0.anInt136 = arg0.anIntArray8[0] * 128 + arg0.anInt138 * 64;
				arg0.anInt180 = 0;
			}
			if (arg0.anInt174 > anInt320) {
				this.method201(arg0);
			} else if (arg0.anInt175 >= anInt320) {
				this.method202(arg0);
			} else {
				this.method203(this.aByte6, arg0);
			}
			this.method204(arg0, this.anInt359);
			if (this.aByte3 != 114) {
				this.anInt340 = this.aClass44_1.method635();
			}
			this.method205(arg0, (byte) 6);
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("50047, " + arg0 + ", " + arg1 + ", " + 114 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!z;)V")
	private void method201(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt174 - anInt320;
			@Pc(14) int local14 = arg0.anInt170 * 128 + arg0.anInt138 * 64;
			@Pc(24) int local24 = arg0.anInt172 * 128 + arg0.anInt138 * 64;
			if (this.aByte5 == 26) {
				arg0.anInt135 += (local14 - arg0.anInt135) / local4;
				arg0.anInt136 += (local24 - arg0.anInt136) / local4;
				arg0.anInt181 = 0;
				if (arg0.anInt176 == 0) {
					arg0.anInt179 = 1024;
				}
				if (arg0.anInt176 == 1) {
					arg0.anInt179 = 1536;
				}
				if (arg0.anInt176 == 2) {
					arg0.anInt179 = 0;
				}
				if (arg0.anInt176 == 3) {
					arg0.anInt179 = 512;
				}
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("37839, " + 26 + ", " + arg0 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!z;B)V")
	private void method202(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt175 == anInt320 || arg0.anInt160 == -1 || arg0.anInt163 != 0 || arg0.anInt162 + 1 > Class25.aClass25Array1[arg0.anInt160].method484(arg0.anInt161)) {
				@Pc(34) int local34 = arg0.anInt175 - arg0.anInt174;
				@Pc(39) int local39 = anInt320 - arg0.anInt174;
				@Pc(49) int local49 = arg0.anInt170 * 128 + arg0.anInt138 * 64;
				@Pc(59) int local59 = arg0.anInt172 * 128 + arg0.anInt138 * 64;
				@Pc(69) int local69 = arg0.anInt171 * 128 + arg0.anInt138 * 64;
				@Pc(79) int local79 = arg0.anInt173 * 128 + arg0.anInt138 * 64;
				arg0.anInt135 = (local49 * (local34 - local39) + local69 * local39) / local34;
				arg0.anInt136 = (local59 * (local34 - local39) + local79 * local39) / local34;
			}
			arg0.anInt181 = 0;
			if (arg0.anInt176 == 0) {
				arg0.anInt179 = 1024;
			}
			if (arg0.anInt176 == 1) {
				arg0.anInt179 = 1536;
			}
			if (arg0.anInt176 == 2) {
				arg0.anInt179 = 0;
			}
			if (arg0.anInt176 == 3) {
				arg0.anInt179 = 512;
			}
			arg0.anInt137 = arg0.anInt179;
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("89066, " + arg0 + ", " + -26 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BLclient!z;)V")
	private void method203(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg1) {
		try {
			arg1.anInt157 = arg1.anInt139;
			if (arg1.anInt180 == 0) {
				arg1.anInt181 = 0;
			} else {
				if (arg1.anInt160 != -1 && arg1.anInt163 == 0) {
					@Pc(24) Class25 local24 = Class25.aClass25Array1[arg1.anInt160];
					if (local24.anIntArray218 == null) {
						arg1.anInt181++;
						return;
					}
				}
				@Pc(37) int local37 = arg1.anInt135;
				@Pc(40) int local40 = arg1.anInt136;
				@Pc(55) int local55 = arg1.anIntArray7[arg1.anInt180 - 1] * 128 + arg1.anInt138 * 64;
				@Pc(70) int local70 = arg1.anIntArray8[arg1.anInt180 - 1] * 128 + arg1.anInt138 * 64;
				if (arg0 != 6) {
					this.anInt443 = -1;
				}
				if (local55 - local37 <= 256 && local55 - local37 >= -256 && local70 - local40 <= 256 && local70 - local40 >= -256) {
					if (local37 < local55) {
						if (local40 < local70) {
							arg1.anInt179 = 1280;
						} else if (local40 > local70) {
							arg1.anInt179 = 1792;
						} else {
							arg1.anInt179 = 1536;
						}
					} else if (local37 > local55) {
						if (local40 < local70) {
							arg1.anInt179 = 768;
						} else if (local40 > local70) {
							arg1.anInt179 = 256;
						} else {
							arg1.anInt179 = 512;
						}
					} else if (local40 < local70) {
						arg1.anInt179 = 1024;
					} else {
						arg1.anInt179 = 0;
					}
					@Pc(170) int local170 = arg1.anInt179 - arg1.anInt137 & 0x7FF;
					if (local170 > 1024) {
						local170 -= 2048;
					}
					@Pc(177) int local177 = arg1.anInt142;
					if (local170 >= -256 && local170 <= 256) {
						local177 = arg1.anInt141;
					} else if (local170 >= 256 && local170 < 768) {
						local177 = arg1.anInt144;
					} else if (local170 >= -768 && local170 <= -256) {
						local177 = arg1.anInt143;
					}
					if (local177 == -1) {
						local177 = arg1.anInt141;
					}
					arg1.anInt157 = local177;
					@Pc(219) int local219 = 4;
					if (arg1.anInt137 != arg1.anInt179 && arg1.anInt154 == -1) {
						local219 = 2;
					}
					if (arg1.anInt180 > 2) {
						local219 = 6;
					}
					if (arg1.anInt180 > 3) {
						local219 = 8;
					}
					if (arg1.anInt181 > 0 && arg1.anInt180 > 1) {
						local219 = 8;
						arg1.anInt181--;
					}
					if (arg1.aBooleanArray3[arg1.anInt180 - 1]) {
						local219 <<= 0x1;
					}
					if (local219 >= 8 && arg1.anInt157 == arg1.anInt141 && arg1.anInt145 != -1) {
						arg1.anInt157 = arg1.anInt145;
					}
					if (local37 < local55) {
						arg1.anInt135 += local219;
						if (arg1.anInt135 > local55) {
							arg1.anInt135 = local55;
						}
					} else if (local37 > local55) {
						arg1.anInt135 -= local219;
						if (arg1.anInt135 < local55) {
							arg1.anInt135 = local55;
						}
					}
					if (local40 < local70) {
						arg1.anInt136 += local219;
						if (arg1.anInt136 > local70) {
							arg1.anInt136 = local70;
						}
					} else if (local40 > local70) {
						arg1.anInt136 -= local219;
						if (arg1.anInt136 < local70) {
							arg1.anInt136 = local70;
						}
					}
					if (arg1.anInt135 == local55 && arg1.anInt136 == local70) {
						arg1.anInt180--;
					}
				} else {
					arg1.anInt135 = local55;
					arg1.anInt136 = local70;
				}
			}
		} catch (@Pc(369) RuntimeException local369) {
			signlink.reporterror("32493, " + arg0 + ", " + arg1 + ", " + local369.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!z;I)V")
	private void method204(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt442 += arg1;
			@Pc(29) int local29;
			@Pc(35) int local35;
			if (arg0.anInt154 != -1 && arg0.anInt154 < 32768) {
				@Pc(21) Class1_Sub1_Sub1_Sub1_Sub1 local21 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[arg0.anInt154];
				if (local21 != null) {
					local29 = arg0.anInt135 - local21.anInt135;
					local35 = arg0.anInt136 - local21.anInt136;
					if (local29 != 0 || local35 != 0) {
						arg0.anInt179 = (int) (Math.atan2((double) local29, (double) local35) * 325.949D) & 0x7FF;
					}
				}
			}
			@Pc(60) int local60;
			if (arg0.anInt154 >= 32768) {
				local60 = arg0.anInt154 - 32768;
				if (local60 == this.anInt430) {
					local60 = this.anInt416;
				}
				@Pc(72) Class1_Sub1_Sub1_Sub1_Sub2 local72 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local60];
				if (local72 != null) {
					local35 = arg0.anInt135 - local72.anInt135;
					@Pc(86) int local86 = arg0.anInt136 - local72.anInt136;
					if (local35 != 0 || local86 != 0) {
						arg0.anInt179 = (int) (Math.atan2((double) local35, (double) local86) * 325.949D) & 0x7FF;
					}
				}
			}
			if ((arg0.anInt155 != 0 || arg0.anInt156 != 0) && (arg0.anInt180 == 0 || arg0.anInt181 > 0)) {
				local60 = arg0.anInt135 - (arg0.anInt155 - this.anInt411 - this.anInt411) * 64;
				local29 = arg0.anInt136 - (arg0.anInt156 - this.anInt412 - this.anInt412) * 64;
				if (local60 != 0 || local29 != 0) {
					arg0.anInt179 = (int) (Math.atan2((double) local60, (double) local29) * 325.949D) & 0x7FF;
				}
				arg0.anInt155 = 0;
				arg0.anInt156 = 0;
			}
			local60 = arg0.anInt179 - arg0.anInt137 & 0x7FF;
			if (local60 != 0) {
				if (local60 < 32 || local60 > 2016) {
					arg0.anInt137 = arg0.anInt179;
				} else if (local60 > 1024) {
					arg0.anInt137 -= 32;
				} else {
					arg0.anInt137 += 32;
				}
				arg0.anInt137 &= 0x7FF;
				if (arg0.anInt157 == arg0.anInt139 && arg0.anInt137 != arg0.anInt179) {
					if (arg0.anInt140 != -1) {
						arg0.anInt157 = arg0.anInt140;
						return;
					}
					arg0.anInt157 = arg0.anInt141;
					return;
				}
			}
		} catch (@Pc(234) RuntimeException local234) {
			signlink.reporterror("67633, " + arg0 + ", " + arg1 + ", " + local234.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!z;B)V")
	private void method205(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(6) boolean local6 = false;
			arg0.aBoolean12 = false;
			@Pc(28) Class25 local28;
			if (arg0.anInt157 != -1) {
				local28 = Class25.aClass25Array1[arg0.anInt157];
				arg0.anInt159++;
				if (arg0.anInt158 < local28.anInt778 && arg0.anInt159 > local28.method484(arg0.anInt158)) {
					arg0.anInt159 = 0;
					arg0.anInt158++;
				}
				if (arg0.anInt158 >= local28.anInt778) {
					arg0.anInt159 = 0;
					arg0.anInt158 = 0;
				}
			}
			if (arg0.anInt160 != -1 && arg0.anInt163 == 0) {
				local28 = Class25.aClass25Array1[arg0.anInt160];
				arg0.anInt162++;
				while (arg0.anInt161 < local28.anInt778 && arg0.anInt162 > local28.method484(arg0.anInt161)) {
					arg0.anInt162 -= local28.method484(arg0.anInt161);
					arg0.anInt161++;
				}
				if (arg0.anInt161 >= local28.anInt778) {
					arg0.anInt161 -= local28.anInt779;
					arg0.anInt164++;
					if (arg0.anInt164 >= local28.anInt783) {
						arg0.anInt160 = -1;
					}
					if (arg0.anInt161 < 0 || arg0.anInt161 >= local28.anInt778) {
						arg0.anInt160 = -1;
					}
				}
				arg0.aBoolean12 = local28.aBoolean163;
			}
			if (arg0.anInt163 > 0) {
				arg0.anInt163--;
			}
			if (arg0.anInt165 != -1 && anInt320 >= arg0.anInt168) {
				if (arg0.anInt166 < 0) {
					arg0.anInt166 = 0;
				}
				local28 = Class27.aClass27Array1[arg0.anInt165].aClass25_2;
				arg0.anInt167++;
				while (arg0.anInt166 < local28.anInt778 && arg0.anInt167 > local28.method484(arg0.anInt166)) {
					arg0.anInt167 -= local28.method484(arg0.anInt166);
					arg0.anInt166++;
				}
				if (arg0.anInt166 >= local28.anInt778) {
					if (arg0.anInt166 < 0 || arg0.anInt166 >= local28.anInt778) {
						arg0.anInt165 = -1;
					}
					return;
				}
			}
		} catch (@Pc(241) RuntimeException local241) {
			signlink.reporterror("51235, " + arg0 + ", " + arg1 + ", " + local241.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method206() {
		try {
			if (this.aBoolean47) {
				this.aBoolean47 = false;
				this.aClass36_3.method546(0, super.aGraphics2, 11);
				this.aClass36_4.method546(0, super.aGraphics2, 375);
				this.aClass36_5.method546(729, super.aGraphics2, 5);
				this.aClass36_6.method546(752, super.aGraphics2, 231);
				this.aClass36_7.method546(0, super.aGraphics2, 0);
				this.aClass36_8.method546(561, super.aGraphics2, 0);
				this.aClass36_9.method546(520, super.aGraphics2, 11);
				this.aClass36_10.method546(520, super.aGraphics2, 231);
				this.aClass36_11.method546(501, super.aGraphics2, 375);
				this.aClass36_12.method546(0, super.aGraphics2, 345);
				this.aBoolean65 = true;
				this.aBoolean51 = true;
				this.aBoolean36 = true;
				this.aBoolean44 = true;
				if (this.anInt281 != 2) {
					this.aClass36_27.method546(8, super.aGraphics2, 11);
					this.aClass36_26.method546(561, super.aGraphics2, 5);
				}
			}
			if (this.anInt281 == 2) {
				this.method164();
			}
			if (this.aBoolean54 && this.anInt397 == 1) {
				this.aBoolean65 = true;
			}
			@Pc(155) boolean local155;
			if (this.anInt358 != -1) {
				local155 = this.method110(this.anInt341, this.anInt358);
				if (local155) {
					this.aBoolean65 = true;
				}
			}
			if (this.anInt426 == 2) {
				this.aBoolean65 = true;
			}
			if (this.anInt327 == 2) {
				this.aBoolean65 = true;
			}
			if (this.aBoolean65) {
				this.method159();
				this.aBoolean65 = false;
			}
			if (this.anInt419 == -1) {
				this.aClass6_1.anInt464 = this.anInt392 - this.anInt367 - 77;
				if (super.anInt241 > 453 && super.anInt241 < 565 && super.anInt242 > 350) {
					this.method150(77, false, this.aClass6_1, 463, super.anInt242 - 375, this.anInt392, 0, super.anInt241 - 22);
				}
				@Pc(237) int local237 = this.anInt392 - this.aClass6_1.anInt464 - 77;
				if (local237 < 0) {
					local237 = 0;
				}
				if (local237 > this.anInt392 - 77) {
					local237 = this.anInt392 - 77;
				}
				if (this.anInt367 != local237) {
					this.anInt367 = local237;
					this.aBoolean51 = true;
				}
			}
			if (this.anInt419 != -1) {
				local155 = this.method110(this.anInt341, this.anInt419);
				if (local155) {
					this.aBoolean51 = true;
				}
			}
			if (this.anInt426 == 3) {
				this.aBoolean51 = true;
			}
			if (this.anInt327 == 3) {
				this.aBoolean51 = true;
			}
			if (this.aString12 != null) {
				this.aBoolean51 = true;
			}
			if (this.aBoolean54 && this.anInt397 == 2) {
				this.aBoolean51 = true;
			}
			if (this.aBoolean51) {
				this.method183();
				this.aBoolean51 = false;
			}
			if (this.anInt281 == 2) {
				this.method152();
				this.aClass36_26.method546(561, super.aGraphics2, 5);
			}
			if (this.anInt370 != -1) {
				this.aBoolean36 = true;
			}
			if (this.aBoolean36) {
				if (this.anInt370 != -1 && this.anInt370 == this.anInt436) {
					this.anInt370 = -1;
					this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 48);
					this.aClass1_Sub1_Sub3_4.method457(this.anInt436);
				}
				this.aBoolean36 = false;
				this.aClass36_15.method545();
				this.aClass1_Sub1_Sub2_Sub3_12.method422(0, 0, 373);
				if (this.anInt358 == -1) {
					if (this.anIntArray54[this.anInt436] != -1) {
						if (this.anInt436 == 0) {
							this.aClass1_Sub1_Sub2_Sub3_3.method422(29, 30, 373);
						}
						if (this.anInt436 == 1) {
							this.aClass1_Sub1_Sub2_Sub3_4.method422(59, 29, 373);
						}
						if (this.anInt436 == 2) {
							this.aClass1_Sub1_Sub2_Sub3_4.method422(87, 29, 373);
						}
						if (this.anInt436 == 3) {
							this.aClass1_Sub1_Sub2_Sub3_5.method422(115, 29, 373);
						}
						if (this.anInt436 == 4) {
							this.aClass1_Sub1_Sub2_Sub3_7.method422(156, 29, 373);
						}
						if (this.anInt436 == 5) {
							this.aClass1_Sub1_Sub2_Sub3_7.method422(184, 29, 373);
						}
						if (this.anInt436 == 6) {
							this.aClass1_Sub1_Sub2_Sub3_6.method422(212, 30, 373);
						}
					}
					if (this.anIntArray54[0] != -1 && (this.anInt370 != 0 || anInt320 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[0].method422(35, 34, 373);
					}
					if (this.anIntArray54[1] != -1 && (this.anInt370 != 1 || anInt320 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[1].method422(59, 32, 373);
					}
					if (this.anIntArray54[2] != -1 && (this.anInt370 != 2 || anInt320 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[2].method422(86, 32, 373);
					}
					if (this.anIntArray54[3] != -1 && (this.anInt370 != 3 || anInt320 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[3].method422(121, 33, 373);
					}
					if (this.anIntArray54[4] != -1 && (this.anInt370 != 4 || anInt320 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[4].method422(157, 34, 373);
					}
					if (this.anIntArray54[5] != -1 && (this.anInt370 != 5 || anInt320 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[5].method422(185, 32, 373);
					}
					if (this.anIntArray54[6] != -1 && (this.anInt370 != 6 || anInt320 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[6].method422(212, 34, 373);
					}
				}
				this.aClass36_15.method546(520, super.aGraphics2, 165);
				this.aClass36_14.method545();
				this.aClass1_Sub1_Sub2_Sub3_11.method422(0, 0, 373);
				if (this.anInt358 == -1) {
					if (this.anIntArray54[this.anInt436] != -1) {
						if (this.anInt436 == 7) {
							this.aClass1_Sub1_Sub2_Sub3_16.method422(49, 0, 373);
						}
						if (this.anInt436 == 8) {
							this.aClass1_Sub1_Sub2_Sub3_17.method422(81, 0, 373);
						}
						if (this.anInt436 == 9) {
							this.aClass1_Sub1_Sub2_Sub3_17.method422(108, 0, 373);
						}
						if (this.anInt436 == 10) {
							this.aClass1_Sub1_Sub2_Sub3_18.method422(136, 1, 373);
						}
						if (this.anInt436 == 11) {
							this.aClass1_Sub1_Sub2_Sub3_20.method422(178, 0, 373);
						}
						if (this.anInt436 == 12) {
							this.aClass1_Sub1_Sub2_Sub3_20.method422(205, 0, 373);
						}
						if (this.anInt436 == 13) {
							this.aClass1_Sub1_Sub2_Sub3_19.method422(233, 0, 373);
						}
					}
					if (this.anIntArray54[8] != -1 && (this.anInt370 != 8 || anInt320 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[7].method422(80, 2, 373);
					}
					if (this.anIntArray54[9] != -1 && (this.anInt370 != 9 || anInt320 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[8].method422(107, 3, 373);
					}
					if (this.anIntArray54[10] != -1 && (this.anInt370 != 10 || anInt320 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[9].method422(142, 4, 373);
					}
					if (this.anIntArray54[11] != -1 && (this.anInt370 != 11 || anInt320 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[10].method422(179, 2, 373);
					}
					if (this.anIntArray54[12] != -1 && (this.anInt370 != 12 || anInt320 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[11].method422(206, 2, 373);
					}
					if (this.anIntArray54[13] != -1 && (this.anInt370 != 13 || anInt320 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[12].method422(230, 2, 373);
					}
				}
				this.aClass36_14.method546(501, super.aGraphics2, 492);
				this.aClass36_27.method545();
			}
			if (this.aBoolean44) {
				this.aBoolean44 = false;
				this.aClass36_13.method545();
				this.aClass1_Sub1_Sub2_Sub3_10.method422(0, 0, 373);
				this.aClass1_Sub1_Sub2_Sub4_2.method441((byte) 9, true, 33, "Public chat", 16777215, 57);
				if (this.anInt393 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method441((byte) 9, true, 46, "On", 65280, 57);
				}
				if (this.anInt393 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method441((byte) 9, true, 46, "Friends", 16776960, 57);
				}
				if (this.anInt393 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method441((byte) 9, true, 46, "Off", 16711680, 57);
				}
				if (this.anInt393 == 3) {
					this.aClass1_Sub1_Sub2_Sub4_2.method441((byte) 9, true, 46, "Hide", 65535, 57);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method441((byte) 9, true, 33, "Private chat", 16777215, 186);
				if (this.anInt385 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method441((byte) 9, true, 46, "On", 65280, 186);
				}
				if (this.anInt385 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method441((byte) 9, true, 46, "Friends", 16776960, 186);
				}
				if (this.anInt385 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method441((byte) 9, true, 46, "Off", 16711680, 186);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method441((byte) 9, true, 33, "Trade/duel", 16777215, 326);
				if (this.anInt291 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method441((byte) 9, true, 46, "On", 65280, 326);
				}
				if (this.anInt291 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method441((byte) 9, true, 46, "Friends", 16776960, 326);
				}
				if (this.anInt291 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method441((byte) 9, true, 46, "Off", 16711680, 326);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method441((byte) 9, true, 38, "Report abuse", 16777215, 462);
				this.aClass36_13.method546(0, super.aGraphics2, 471);
				this.aClass36_27.method545();
			}
			this.anInt341 = 0;
		} catch (@Pc(1064) RuntimeException local1064) {
			signlink.reporterror("6118, " + 72 + ", " + local1064.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method207() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray48[local5 + 32512] = 255;
				}
			}
			@Pc(46) int local46;
			@Pc(53) int local53;
			@Pc(59) int local59;
			for (local12 = 0; local12 < 100; local12++) {
				local46 = (int) (Math.random() * 124.0D) + 2;
				local53 = (int) (Math.random() * 128.0D) + 128;
				local59 = local46 + (local53 << 7);
				this.anIntArray48[local59] = 192;
			}
			for (local46 = 1; local46 < 255; local46++) {
				for (local53 = 1; local53 < 127; local53++) {
					local59 = local53 + (local46 << 7);
					this.anIntArray49[local59] = (this.anIntArray48[local59 - 1] + this.anIntArray48[local59 + 1] + this.anIntArray48[local59 - 128] + this.anIntArray48[local59 + 128]) / 4;
				}
			}
			this.anInt308 += 128;
			if (this.anInt308 > this.anIntArray26.length) {
				this.anInt308 -= this.anIntArray26.length;
				local53 = (int) (Math.random() * 12.0D);
				this.method113(this.aClass1_Sub1_Sub2_Sub3Array3[local53]);
			}
			@Pc(171) int local171;
			for (local53 = 1; local53 < 255; local53++) {
				for (local59 = 1; local59 < 127; local59++) {
					local171 = local59 + (local53 << 7);
					@Pc(194) int local194 = this.anIntArray49[local171 + 128] - this.anIntArray26[local171 + this.anInt308 & this.anIntArray26.length - 1] / 5;
					if (local194 < 0) {
						local194 = 0;
					}
					this.anIntArray48[local171] = local194;
				}
			}
			for (local59 = 0; local59 < 255; local59++) {
				this.anIntArray37[local59] = this.anIntArray37[local59 + 1];
			}
			this.anIntArray37[255] = (int) (Math.sin((double) anInt320 / 14.0D) * 16.0D + Math.sin((double) anInt320 / 15.0D) * 14.0D + Math.sin((double) anInt320 / 16.0D) * 12.0D);
			if (this.anInt382 > 0) {
				this.anInt382 -= 4;
			}
			if (this.anInt383 > 0) {
				this.anInt383 -= 4;
			}
			if (this.anInt382 == 0 && this.anInt383 == 0) {
				local171 = (int) (Math.random() * 2000.0D);
				if (local171 == 0) {
					this.anInt382 = 1024;
				}
				if (local171 == 1) {
					this.anInt383 = 1024;
					return;
				}
			}
		} catch (@Pc(305) RuntimeException local305) {
			signlink.reporterror("33716, " + 205 + ", " + local305.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(B)V")
	private void method208() {
		try {
			while (true) {
				@Pc(12) int local12 = this.method83();
				if (local12 == -1) {
					return;
				}
				if (this.anInt449 != -1 && this.anInt449 == this.anInt264) {
					if (local12 == 8 && this.aString16.length() > 0) {
						this.aString16 = this.aString16.substring(0, this.aString16.length() - 1);
					}
					if ((local12 >= 97 && local12 <= 122 || local12 >= 65 && local12 <= 90 || local12 >= 48 && local12 <= 57 || local12 == 32) && this.aString16.length() < 12) {
						this.aString16 = this.aString16 + (char) local12;
					}
				} else {
					@Pc(193) int local193;
					if (this.aBoolean46) {
						if (local12 >= 32 && local12 <= 122 && this.aString7.length() < 80) {
							this.aString7 = this.aString7 + (char) local12;
							this.aBoolean51 = true;
						}
						if (local12 == 8 && this.aString7.length() > 0) {
							this.aString7 = this.aString7.substring(0, this.aString7.length() - 1);
							this.aBoolean51 = true;
						}
						if (local12 == 13 || local12 == 10) {
							this.aBoolean46 = false;
							this.aBoolean51 = true;
							@Pc(152) long local152;
							if (this.anInt260 == 1) {
								local152 = Class46.method640(this.aString7);
								this.method134(local152);
							}
							if (this.anInt260 == 2 && this.anInt306 > 0) {
								local152 = Class46.method640(this.aString7);
								this.method145(local152);
							}
							if (this.anInt260 == 3 && this.aString7.length() > 0) {
								this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 183);
								this.aClass1_Sub1_Sub3_4.method457(0);
								local193 = this.aClass1_Sub1_Sub3_4.anInt771;
								this.aClass1_Sub1_Sub3_4.method463(this.aLong11);
								Class2.method37(this.aString7, this.aClass1_Sub1_Sub3_4);
								this.aClass1_Sub1_Sub3_4.method466(this.aClass1_Sub1_Sub3_4.anInt771 - local193);
								this.aString7 = Class46.method645(this.aString7);
								this.aString7 = Class32.method512(this.aString7, 713);
								this.method136(this.aString7, 6, Class46.method644(Class46.method641(this.aLong11)));
								if (this.anInt385 == 2) {
									this.anInt385 = 1;
									this.aBoolean44 = true;
									this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 130);
									this.aClass1_Sub1_Sub3_4.method457(this.anInt393);
									this.aClass1_Sub1_Sub3_4.method457(this.anInt385);
									this.aClass1_Sub1_Sub3_4.method457(this.anInt291);
								}
							}
							if (this.anInt260 == 4 && this.anInt396 < 100) {
								local152 = Class46.method640(this.aString7);
								this.method111(local152);
							}
							if (this.anInt260 == 5 && this.anInt396 > 0) {
								local152 = Class46.method640(this.aString7);
								this.method195(local152);
							}
						}
					} else if (this.aBoolean63) {
						if (local12 >= 48 && local12 <= 57 && this.aString8.length() < 10) {
							this.aString8 = this.aString8 + (char) local12;
							this.aBoolean51 = true;
						}
						if (local12 == 8 && this.aString8.length() > 0) {
							this.aString8 = this.aString8.substring(0, this.aString8.length() - 1);
							this.aBoolean51 = true;
						}
						if (local12 == 13 || local12 == 10) {
							if (this.aString8.length() > 0) {
								local193 = 0;
								try {
									local193 = Integer.parseInt(this.aString8);
								} catch (@Pc(370) Exception local370) {
								}
								this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 206);
								this.aClass1_Sub1_Sub3_4.method461(local193);
							}
							this.aBoolean63 = false;
							this.aBoolean51 = true;
						}
					} else if (this.anInt419 == -1) {
						if (local12 >= 32 && local12 <= 122 && this.aString17.length() < 80) {
							this.aString17 = this.aString17 + (char) local12;
							this.aBoolean51 = true;
						}
						if (local12 == 8 && this.aString17.length() > 0) {
							this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
							this.aBoolean51 = true;
						}
						if ((local12 == 13 || local12 == 10) && this.aString17.length() > 0) {
							if (this.aString17.equals("::clientdrop") && (super.aFrame_Sub1_2 != null || this.method149().indexOf("192.168.1.") != -1)) {
								this.method119();
							} else if (this.aString17.equals("::lag")) {
								this.method175();
							} else if (this.aString17.startsWith("::")) {
								this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 91);
								this.aClass1_Sub1_Sub3_4.method457(this.aString17.length() - 1);
								this.aClass1_Sub1_Sub3_4.method464(this.aString17.substring(2));
							} else {
								@Pc(509) byte local509 = 0;
								if (this.aString17.startsWith("yellow:")) {
									local509 = 0;
									this.aString17 = this.aString17.substring(7);
								}
								if (this.aString17.startsWith("red:")) {
									local509 = 1;
									this.aString17 = this.aString17.substring(4);
								}
								if (this.aString17.startsWith("green:")) {
									local509 = 2;
									this.aString17 = this.aString17.substring(6);
								}
								if (this.aString17.startsWith("cyan:")) {
									local509 = 3;
									this.aString17 = this.aString17.substring(5);
								}
								if (this.aString17.startsWith("purple:")) {
									local509 = 4;
									this.aString17 = this.aString17.substring(7);
								}
								if (this.aString17.startsWith("white:")) {
									local509 = 5;
									this.aString17 = this.aString17.substring(6);
								}
								if (this.aString17.startsWith("flash1:")) {
									local509 = 6;
									this.aString17 = this.aString17.substring(7);
								}
								if (this.aString17.startsWith("flash2:")) {
									local509 = 7;
									this.aString17 = this.aString17.substring(7);
								}
								if (this.aString17.startsWith("flash3:")) {
									local509 = 8;
									this.aString17 = this.aString17.substring(7);
								}
								if (this.aString17.startsWith("glow1:")) {
									local509 = 9;
									this.aString17 = this.aString17.substring(6);
								}
								if (this.aString17.startsWith("glow2:")) {
									local509 = 10;
									this.aString17 = this.aString17.substring(6);
								}
								if (this.aString17.startsWith("glow3:")) {
									local509 = 11;
									this.aString17 = this.aString17.substring(6);
								}
								@Pc(667) byte local667 = 0;
								if (this.aString17.startsWith("wave:")) {
									local667 = 1;
									this.aString17 = this.aString17.substring(5);
								}
								if (this.aString17.startsWith("scroll:")) {
									local667 = 2;
									this.aString17 = this.aString17.substring(7);
								}
								this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 89);
								this.aClass1_Sub1_Sub3_4.method457(0);
								@Pc(707) int local707 = this.aClass1_Sub1_Sub3_4.anInt771;
								this.aClass1_Sub1_Sub3_4.method457(local509);
								this.aClass1_Sub1_Sub3_4.method457(local667);
								Class2.method37(this.aString17, this.aClass1_Sub1_Sub3_4);
								this.aClass1_Sub1_Sub3_4.method466(this.aClass1_Sub1_Sub3_4.anInt771 - local707);
								this.aString17 = Class46.method645(this.aString17);
								this.aString17 = Class32.method512(this.aString17, 713);
								aClass1_Sub1_Sub1_Sub1_Sub2_1.aString3 = this.aString17;
								aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt147 = local509;
								aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt148 = local667;
								aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt146 = 150;
								this.method136(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString3, 2, aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4);
								if (this.anInt393 == 2) {
									this.anInt393 = 3;
									this.aBoolean44 = true;
									this.aClass1_Sub1_Sub3_4.method456(this.anInt448, 130);
									this.aClass1_Sub1_Sub3_4.method457(this.anInt393);
									this.aClass1_Sub1_Sub3_4.method457(this.anInt385);
									this.aClass1_Sub1_Sub3_4.method457(this.anInt291);
								}
							}
							this.aString17 = "";
							this.aBoolean51 = true;
						}
					}
				}
			}
		} catch (@Pc(804) RuntimeException local804) {
			signlink.reporterror("97597, " + 4 + ", " + local804.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;Z)V")
	private void method209(@OriginalArg(0) Class6 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt457;
			if (local4 >= 1 && local4 <= 100) {
				local4--;
				if (local4 >= this.anInt306) {
					arg0.aString18 = "";
					arg0.anInt456 = 0;
				} else {
					arg0.aString18 = this.aStringArray3[local4];
					arg0.anInt456 = 1;
				}
			} else if (local4 >= 101 && local4 <= 200) {
				local4 -= 101;
				if (local4 >= this.anInt306) {
					arg0.aString18 = "";
					arg0.anInt456 = 0;
				} else {
					if (this.anIntArray40[local4] == 0) {
						arg0.aString18 = "@red@Offline";
					} else if (this.anIntArray40[local4] == anInt250) {
						arg0.aString18 = "@gre@World-" + (this.anIntArray40[local4] - 9);
					} else {
						arg0.aString18 = "@yel@World-" + (this.anIntArray40[local4] - 9);
					}
					arg0.anInt456 = 1;
				}
			} else if (local4 == 203) {
				arg0.anInt463 = this.anInt306 * 15 + 20;
				if (arg0.anInt463 <= arg0.anInt459) {
					arg0.anInt463 = arg0.anInt459 + 1;
				}
			} else if (local4 >= 401 && local4 <= 500) {
				local4 -= 401;
				if (local4 >= this.anInt396) {
					arg0.aString18 = "";
					arg0.anInt456 = 0;
				} else {
					arg0.aString18 = Class46.method644(Class46.method641(this.aLongArray3[local4]));
					arg0.anInt456 = 1;
				}
			} else if (local4 == 503) {
				arg0.anInt463 = this.anInt396 * 15 + 20;
				if (arg0.anInt463 <= arg0.anInt459) {
					arg0.anInt463 = arg0.anInt459 + 1;
				}
			} else if (local4 == 327) {
				arg0.anInt478 = 150;
				arg0.anInt479 = (int) (Math.sin((double) anInt320 / 40.0D) * 256.0D) & 0x7FF;
				if (this.aBoolean66) {
					for (@Pc(207) int local207 = 0; local207 < 7; local207++) {
						@Pc(214) int local214 = this.anIntArray79[local207];
						if (local214 >= 0 && !Class21.aClass21Array1[local214].method426()) {
							return;
						}
					}
					this.aBoolean66 = false;
					@Pc(233) Class1_Sub1_Sub1_Sub5[] local233 = new Class1_Sub1_Sub1_Sub5[7];
					@Pc(235) int local235 = 0;
					for (@Pc(237) int local237 = 0; local237 < 7; local237++) {
						@Pc(244) int local244 = this.anIntArray79[local237];
						if (local244 >= 0) {
							local233[local235++] = Class21.aClass21Array1[local244].method427();
						}
					}
					@Pc(266) Class1_Sub1_Sub1_Sub5 local266 = new Class1_Sub1_Sub1_Sub5(local235, false, local233);
					for (@Pc(268) int local268 = 0; local268 < 5; local268++) {
						if (this.anIntArray70[local268] != 0) {
							local266.method292(anIntArrayArray3[local268][0], anIntArrayArray3[local268][this.anIntArray70[local268]]);
							if (local268 == 1) {
								local266.method292(anIntArray42[0], anIntArray42[this.anIntArray70[local268]]);
							}
						}
					}
					local266.method285();
					local266.method286(Class25.aClass25Array1[aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt139].anIntArray215[0]);
					local266.method295(64, 850, -30, -50, -30, true);
					arg0.anInt471 = 5;
					arg0.anInt472 = 0;
					Class6.method225(local266);
				}
			} else if (local4 == 324) {
				if (this.aClass1_Sub1_Sub2_Sub2_6 == null) {
					this.aClass1_Sub1_Sub2_Sub2_6 = arg0.aClass1_Sub1_Sub2_Sub2_12;
					this.aClass1_Sub1_Sub2_Sub2_7 = arg0.aClass1_Sub1_Sub2_Sub2_13;
				}
				if (this.aBoolean67) {
					arg0.aClass1_Sub1_Sub2_Sub2_12 = this.aClass1_Sub1_Sub2_Sub2_7;
				} else {
					arg0.aClass1_Sub1_Sub2_Sub2_12 = this.aClass1_Sub1_Sub2_Sub2_6;
				}
			} else if (local4 == 325) {
				if (this.aClass1_Sub1_Sub2_Sub2_6 == null) {
					this.aClass1_Sub1_Sub2_Sub2_6 = arg0.aClass1_Sub1_Sub2_Sub2_12;
					this.aClass1_Sub1_Sub2_Sub2_7 = arg0.aClass1_Sub1_Sub2_Sub2_13;
				}
				if (this.aBoolean67) {
					arg0.aClass1_Sub1_Sub2_Sub2_12 = this.aClass1_Sub1_Sub2_Sub2_6;
				} else {
					arg0.aClass1_Sub1_Sub2_Sub2_12 = this.aClass1_Sub1_Sub2_Sub2_7;
				}
			} else if (local4 == 600) {
				arg0.aString18 = this.aString16;
				if (anInt320 % 20 < 10) {
					arg0.aString18 = arg0.aString18 + "|";
				} else {
					arg0.aString18 = arg0.aString18 + " ";
				}
			} else {
				if (local4 == 613) {
					if (!this.aBoolean57) {
						arg0.aString18 = "";
					} else if (this.aBoolean55) {
						arg0.anInt468 = 16711680;
						arg0.aString18 = "Moderator option: Mute player for 48 hours: <ON>";
					} else {
						arg0.anInt468 = 16777215;
						arg0.aString18 = "Moderator option: Mute player for 48 hours: <OFF>";
					}
				}
				@Pc(473) String local473;
				if (local4 == 650 || local4 == 655) {
					if (this.anInt352 == 0) {
						arg0.aString18 = "";
					} else {
						if (this.anInt422 == 0) {
							local473 = "earlier today";
						} else if (this.anInt422 == 1) {
							local473 = "yesterday";
						} else {
							local473 = this.anInt422 + " days ago";
						}
						arg0.aString18 = "You last logged in " + local473 + " from: " + signlink.dns;
					}
				}
				if (local4 == 651) {
					if (this.anInt404 == 0) {
						arg0.aString18 = "0 unread messages";
						arg0.anInt468 = 16776960;
					}
					if (this.anInt404 == 1) {
						arg0.aString18 = "1 unread message";
						arg0.anInt468 = 65280;
					}
					if (this.anInt404 > 1) {
						arg0.aString18 = this.anInt404 + " unread messages";
						arg0.anInt468 = 65280;
					}
				}
				if (local4 == 652) {
					if (this.anInt353 == 201) {
						arg0.aString18 = "";
					} else if (this.anInt353 == 200) {
						arg0.aString18 = "You have not yet set any password recovery questions.";
					} else {
						if (this.anInt353 == 0) {
							local473 = "Earlier today";
						} else if (this.anInt353 == 1) {
							local473 = "Yesterday";
						} else {
							local473 = this.anInt353 + " days ago";
						}
						arg0.aString18 = local473 + " you changed your recovery questions";
					}
				}
				if (local4 == 653) {
					if (this.anInt353 == 201) {
						arg0.aString18 = "";
					} else if (this.anInt353 == 200) {
						arg0.aString18 = "We strongly recommend you do so now to secure your account.";
					} else {
						arg0.aString18 = "If you do not remember making this change then cancel it immediately";
					}
				}
				if (local4 == 654) {
					if (this.anInt353 == 201) {
						arg0.aString18 = "";
					} else if (this.anInt353 == 200) {
						arg0.aString18 = "Do this from the 'account management' area on our front webpage";
					} else {
						arg0.aString18 = "Do this from the 'account management' area on our front webpage";
					}
				}
			}
		} catch (@Pc(655) RuntimeException local655) {
			signlink.reporterror("73137, " + arg0 + ", " + true + ", " + local655.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(B)V")
	private void method210() {
		try {
			if (this.anInt285 == 0 && this.anInt266 == 0) {
				this.aStringArray5[this.anInt420] = "Walk here";
				this.anIntArray58[this.anInt420] = 660;
				this.anIntArray56[this.anInt420] = super.anInt241;
				this.anIntArray57[this.anInt420] = super.anInt242;
				this.anInt420++;
			}
			@Pc(41) int local41 = -1;
			for (@Pc(51) int local51 = 0; local51 < Class1_Sub1_Sub1_Sub5.anInt562; local51++) {
				@Pc(57) int local57 = Class1_Sub1_Sub1_Sub5.anIntArray147[local51];
				@Pc(61) int local61 = local57 & 0x7F;
				@Pc(67) int local67 = local57 >> 7 & 0x7F;
				@Pc(73) int local73 = local57 >> 29 & 0x3;
				@Pc(79) int local79 = local57 >> 14 & 0x7FFF;
				if (local57 != local41) {
					local41 = local57;
					@Pc(217) int local217;
					if (local73 == 2 && this.aClass37_1.method579(this.anInt253, local61, local67, local57) >= 0) {
						@Pc(99) Class9 local99 = Class9.method249(local79);
						if (this.anInt285 == 1) {
							this.aStringArray5[this.anInt420] = "Use " + this.aString6 + " with @cya@" + local99.aString23;
							this.anIntArray58[this.anInt420] = 450;
							this.anIntArray59[this.anInt420] = local57;
							this.anIntArray56[this.anInt420] = local61;
							this.anIntArray57[this.anInt420] = local67;
							this.anInt420++;
						} else if (this.anInt266 != 1) {
							if (local99.aStringArray7 != null) {
								for (local217 = 4; local217 >= 0; local217--) {
									if (local99.aStringArray7[local217] != null) {
										this.aStringArray5[this.anInt420] = local99.aStringArray7[local217] + " @cya@" + local99.aString23;
										if (local217 == 0) {
											this.anIntArray58[this.anInt420] = 285;
										}
										if (local217 == 1) {
											this.anIntArray58[this.anInt420] = 504;
										}
										if (local217 == 2) {
											this.anIntArray58[this.anInt420] = 364;
										}
										if (local217 == 3) {
											this.anIntArray58[this.anInt420] = 581;
										}
										if (local217 == 4) {
											this.anIntArray58[this.anInt420] = 1501;
										}
										this.anIntArray59[this.anInt420] = local57;
										this.anIntArray56[this.anInt420] = local61;
										this.anIntArray57[this.anInt420] = local67;
										this.anInt420++;
									}
								}
							}
							this.aStringArray5[this.anInt420] = "Examine @cya@" + local99.aString23;
							this.anIntArray58[this.anInt420] = 1175;
							this.anIntArray59[this.anInt420] = local57;
							this.anIntArray56[this.anInt420] = local61;
							this.anIntArray57[this.anInt420] = local67;
							this.anInt420++;
						} else if ((this.anInt268 & 0x4) == 4) {
							this.aStringArray5[this.anInt420] = this.aString5 + " @cya@" + local99.aString23;
							this.anIntArray58[this.anInt420] = 55;
							this.anIntArray59[this.anInt420] = local57;
							this.anIntArray56[this.anInt420] = local61;
							this.anIntArray57[this.anInt420] = local67;
							this.anInt420++;
						}
					}
					@Pc(394) Class1_Sub1_Sub1_Sub1_Sub1 local394;
					if (local73 == 1) {
						@Pc(365) Class1_Sub1_Sub1_Sub1_Sub1 local365 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local79];
						if (local365.aClass11_1.aByte10 == 1 && (local365.anInt135 & 0x7F) == 64 && (local365.anInt136 & 0x7F) == 64) {
							for (local217 = 0; local217 < this.anInt299; local217++) {
								local394 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray38[local217]];
								if (local394 != null && local394 != local365 && local394.aClass11_1.aByte10 == 1 && local394.anInt135 == local365.anInt135 && local394.anInt136 == local365.anInt136) {
									this.method157(local61, this.anIntArray38[local217], local67, local394.aClass11_1);
								}
							}
						}
						this.method157(local61, local79, local67, local365.aClass11_1);
					}
					if (local73 == 0) {
						@Pc(445) Class1_Sub1_Sub1_Sub1_Sub2 local445 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local79];
						if ((local445.anInt135 & 0x7F) == 64 && (local445.anInt136 & 0x7F) == 64) {
							for (local217 = 0; local217 < this.anInt299; local217++) {
								local394 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray38[local217]];
								if (local394 != null && local394.aClass11_1.aByte10 == 1 && local394.anInt135 == local445.anInt135 && local394.anInt136 == local445.anInt136) {
									this.method157(local61, this.anIntArray38[local217], local67, local394.aClass11_1);
								}
							}
							for (@Pc(504) int local504 = 0; local504 < this.anInt417; local504++) {
								@Pc(514) Class1_Sub1_Sub1_Sub1_Sub2 local514 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray71[local504]];
								if (local514 != null && local514 != local445 && local514.anInt135 == local445.anInt135 && local514.anInt136 == local445.anInt136) {
									this.method103(local61, local514, this.anIntArray71[local504], local67);
								}
							}
						}
						this.method103(local61, local445, local79, local67);
					}
					if (local73 == 3) {
						@Pc(564) Class31 local564 = this.aClass31ArrayArrayArray1[this.anInt253][local61][local67];
						if (local564 != null) {
							for (@Pc(571) Class1_Sub1_Sub1_Sub3 local571 = (Class1_Sub1_Sub1_Sub3) local564.method498(); local571 != null; local571 = (Class1_Sub1_Sub1_Sub3) local564.method500()) {
								@Pc(577) Class13 local577 = Class13.method316(local571.anInt485);
								if (this.anInt285 == 1) {
									this.aStringArray5[this.anInt420] = "Use " + this.aString6 + " with @lre@" + local577.aString25;
									this.anIntArray58[this.anInt420] = 217;
									this.anIntArray59[this.anInt420] = local571.anInt485;
									this.anIntArray56[this.anInt420] = local61;
									this.anIntArray57[this.anInt420] = local67;
									this.anInt420++;
								} else if (this.anInt266 != 1) {
									for (@Pc(694) int local694 = 4; local694 >= 0; local694--) {
										if (local577.aStringArray9 != null && local577.aStringArray9[local694] != null) {
											this.aStringArray5[this.anInt420] = local577.aStringArray9[local694] + " @lre@" + local577.aString25;
											if (local694 == 0) {
												this.anIntArray58[this.anInt420] = 224;
											}
											if (local694 == 1) {
												this.anIntArray58[this.anInt420] = 993;
											}
											if (local694 == 2) {
												this.anIntArray58[this.anInt420] = 99;
											}
											if (local694 == 3) {
												this.anIntArray58[this.anInt420] = 746;
											}
											if (local694 == 4) {
												this.anIntArray58[this.anInt420] = 877;
											}
											this.anIntArray59[this.anInt420] = local571.anInt485;
											this.anIntArray56[this.anInt420] = local61;
											this.anIntArray57[this.anInt420] = local67;
											this.anInt420++;
										} else if (local694 == 2) {
											this.aStringArray5[this.anInt420] = "Take @lre@" + local577.aString25;
											this.anIntArray58[this.anInt420] = 99;
											this.anIntArray59[this.anInt420] = local571.anInt485;
											this.anIntArray56[this.anInt420] = local61;
											this.anIntArray57[this.anInt420] = local67;
											this.anInt420++;
										}
									}
									this.aStringArray5[this.anInt420] = "Examine @lre@" + local577.aString25;
									this.anIntArray58[this.anInt420] = 1102;
									this.anIntArray59[this.anInt420] = local571.anInt485;
									this.anIntArray56[this.anInt420] = local61;
									this.anIntArray57[this.anInt420] = local67;
									this.anInt420++;
								} else if ((this.anInt268 & 0x1) == 1) {
									this.aStringArray5[this.anInt420] = this.aString5 + " @lre@" + local577.aString25;
									this.anIntArray58[this.anInt420] = 965;
									this.anIntArray59[this.anInt420] = local571.anInt485;
									this.anIntArray56[this.anInt420] = local61;
									this.anIntArray57[this.anInt420] = local67;
									this.anInt420++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(901) RuntimeException local901) {
			signlink.reporterror("96966, " + 40 + ", " + local901.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method211(@OriginalArg(0) String arg0) throws IOException {
		return signlink.mainapp == null ? new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream()) : signlink.openurl(arg0);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
	private void method212(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass1_Sub1_Sub2_Sub2_9.anIntArray198;
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
						this.aClass37_1.method584(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass37_1.method584(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass1_Sub1_Sub2_Sub2_9.method390();
			@Pc(153) int local153;
			for (@Pc(149) int local149 = 1; local149 < 103; local149++) {
				for (local153 = 1; local153 < 103; local153++) {
					if ((this.aByteArrayArrayArray7[arg0][local153][local149] & 0x18) == 0) {
						this.method118(local34, local153, arg0, local36, local149);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local153][local149] & 0x8) != 0) {
						this.method118(local34, local153, arg0 + 1, local36, local149);
					}
				}
			}
			this.aClass36_27.method545();
			this.anInt292 = 0;
			for (local153 = 0; local153 < 104; local153++) {
				for (@Pc(221) int local221 = 0; local221 < 104; local221++) {
					@Pc(231) int local231 = this.aClass37_1.method578(this.anInt253, local153, local221);
					if (local231 != 0) {
						local231 = local231 >> 14 & 0x7FFF;
						@Pc(243) int local243 = Class9.method249(local231).anInt524;
						if (local243 >= 0) {
							@Pc(247) int local247 = local153;
							@Pc(249) int local249 = local221;
							if (local243 != 22 && local243 != 29 && local243 != 34 && local243 != 36 && local243 != 46 && local243 != 47 && local243 != 48) {
								@Pc(281) int[][] local281 = this.aClass17Array1[this.anInt253].anIntArrayArray15;
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
							this.aClass1_Sub1_Sub2_Sub2Array4[this.anInt292] = this.aClass1_Sub1_Sub2_Sub2Array7[local243];
							this.anIntArray35[this.anInt292] = local247;
							this.anIntArray36[this.anInt292] = local249;
							this.anInt292++;
						}
					}
				}
			}
		} catch (@Pc(420) RuntimeException local420) {
			signlink.reporterror("64735, " + arg0 + ", " + true + ", " + local420.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method213() {
		try {
			@Pc(7) byte[] local7 = this.aClass45_1.method639("title.dat", null);
			@Pc(13) Class1_Sub1_Sub2_Sub2 local13 = new Class1_Sub1_Sub2_Sub2(local7, this);
			this.aClass36_19.method545();
			local13.method392(0, 0);
			this.aClass36_20.method545();
			local13.method392(-661, 0);
			this.aClass36_16.method545();
			local13.method392(-128, 0);
			this.aClass36_17.method545();
			local13.method392(-214, -386);
			this.aClass36_18.method545();
			local13.method392(-214, -186);
			this.aClass36_21.method545();
			local13.method392(0, -265);
			this.aClass36_22.method545();
			local13.method392(-574, -265);
			this.aClass36_23.method545();
			local13.method392(-128, -186);
			this.aClass36_24.method545();
			local13.method392(-574, -186);
			@Pc(105) int[] local105 = new int[local13.anInt684];
			for (@Pc(107) int local107 = 0; local107 < local13.anInt685; local107++) {
				for (@Pc(111) int local111 = 0; local111 < local13.anInt684; local111++) {
					local105[local111] = local13.anIntArray198[local13.anInt684 + local13.anInt684 * local107 - local111 - 1];
				}
				for (@Pc(137) int local137 = 0; local137 < local13.anInt684; local137++) {
					local13.anIntArray198[local137 + local13.anInt684 * local107] = local105[local137];
				}
			}
			this.aClass36_19.method545();
			local13.method392(394, 0);
			this.aClass36_20.method545();
			local13.method392(-267, 0);
			this.aClass36_16.method545();
			local13.method392(266, 0);
			this.aClass36_17.method545();
			local13.method392(180, -386);
			this.aClass36_18.method545();
			local13.method392(180, -186);
			this.aClass36_21.method545();
			local13.method392(394, -265);
			this.aClass36_22.method545();
			local13.method392(-180, -265);
			this.aClass36_23.method545();
			local13.method392(212, -186);
			this.aClass36_24.method545();
			local13.method392(-180, -186);
			local13 = new Class1_Sub1_Sub2_Sub2(this.aClass45_1, "logo", 0);
			this.aClass36_16.method545();
			local13.method394(super.anInt237 / 2 - local13.anInt684 / 2 - 128, 18);
			System.gc();
		} catch (@Pc(278) RuntimeException local278) {
			signlink.reporterror("74975, " + 3 + ", " + local278.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method214() {
		try {
			for (@Pc(6) Class1_Sub1_Sub1_Sub4 local6 = (Class1_Sub1_Sub1_Sub4) this.aClass31_2.method497(); local6 != null; local6 = (Class1_Sub1_Sub1_Sub4) this.aClass31_2.method499()) {
				if (local6.anInt502 != this.anInt253 || anInt320 > local6.anInt508) {
					local6.method630();
				} else if (anInt320 >= local6.anInt507) {
					if (local6.anInt511 > 0) {
						@Pc(42) Class1_Sub1_Sub1_Sub1_Sub1 local42 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local6.anInt511 - 1];
						if (local42 != null) {
							local6.method245(172, local42.anInt135, anInt320, this.method177(local42.anInt136, local42.anInt135, local6.anInt502) - local6.anInt506, local42.anInt136);
						}
					}
					if (local6.anInt511 < 0) {
						@Pc(73) int local73 = -local6.anInt511 - 1;
						@Pc(79) Class1_Sub1_Sub1_Sub1_Sub2 local79;
						if (local73 == this.anInt430) {
							local79 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
						} else {
							local79 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local73];
						}
						if (local79 != null) {
							local6.method245(172, local79.anInt135, anInt320, this.method177(local79.anInt136, local79.anInt135, local6.anInt502) - local6.anInt506, local79.anInt136);
						}
					}
					local6.method246(this.anInt341);
					this.aClass37_1.method560((int) local6.aDouble1, local6.anInt512, -1, this.anInt253, (int) local6.aDouble2, false, local6, 60, (int) local6.aDouble3);
				}
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("99130, " + 0 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)Z")
	private boolean method215(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(13) int local13 = this.anIntArray58[arg0];
			if (local13 >= 2000) {
				local13 -= 2000;
			}
			return local13 == 406;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("32817, " + 78 + ", " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method216() {
		try {
			if (this.aClass36_28 == null) {
				this.method139();
				super.aClass36_2 = null;
				this.aClass36_16 = null;
				this.aClass36_17 = null;
				this.aClass36_18 = null;
				this.aClass36_19 = null;
				this.aClass36_20 = null;
				this.aClass36_21 = null;
				this.aClass36_22 = null;
				this.aClass36_23 = null;
				this.aClass36_24 = null;
				this.aClass36_28 = new Class36(this.method89(), 479, true, 96);
				this.aClass36_26 = new Class36(this.method89(), 168, true, 160);
				Class1_Sub1_Sub2.method435(this.anInt273);
				this.aClass1_Sub1_Sub2_Sub3_14.method422(0, 0, 373);
				this.aClass36_25 = new Class36(this.method89(), 190, true, 261);
				this.aClass36_27 = new Class36(this.method89(), 512, true, 334);
				Class1_Sub1_Sub2.method435(this.anInt273);
				this.aClass36_13 = new Class36(this.method89(), 501, true, 61);
				this.aClass36_14 = new Class36(this.method89(), 288, true, 40);
				this.aClass36_15 = new Class36(this.method89(), 269, true, 66);
				this.aBoolean47 = true;
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("21240, " + -279 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(B)I")
	private int method217() {
		try {
			@Pc(3) int local3 = 3;
			if (this.anInt296 < 310) {
				@Pc(18) int local18 = this.anInt293 >> 7;
				@Pc(23) int local23 = this.anInt295 >> 7;
				@Pc(28) int local28 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt135 >> 7;
				@Pc(33) int local33 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt136 >> 7;
				if ((this.aByteArrayArrayArray7[this.anInt253][local18][local23] & 0x4) != 0) {
					local3 = this.anInt253;
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
						if ((this.aByteArrayArrayArray7[this.anInt253][local18][local23] & 0x4) != 0) {
							local3 = this.anInt253;
						}
						local85 += local83;
						if (local85 >= 65536) {
							local85 -= 65536;
							if (local23 < local33) {
								local23++;
							} else if (local23 > local33) {
								local23--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt253][local18][local23] & 0x4) != 0) {
								local3 = this.anInt253;
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
						if ((this.aByteArrayArrayArray7[this.anInt253][local18][local23] & 0x4) != 0) {
							local3 = this.anInt253;
						}
						local85 += local83;
						if (local85 >= 65536) {
							local85 -= 65536;
							if (local18 < local28) {
								local18++;
							} else if (local18 > local28) {
								local18--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt253][local18][local23] & 0x4) != 0) {
								local3 = this.anInt253;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray7[this.anInt253][aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt135 >> 7][aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt136 >> 7] & 0x4) != 0) {
				local3 = this.anInt253;
			}
			return local3;
		} catch (@Pc(251) RuntimeException local251) {
			signlink.reporterror("35407, " + 3 + ", " + local251.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)I")
	private int method218() {
		try {
			@Pc(9) int local9 = this.method177(this.anInt295, this.anInt293, this.anInt253);
			return local9 - this.anInt294 >= 800 || (this.aByteArrayArrayArray7[this.anInt253][this.anInt293 >> 7][this.anInt295 >> 7] & 0x4) == 0 ? 3 : this.anInt253;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("26957, " + 6 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/lang/String;)V")
	@Override
	protected void method91(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		try {
			this.method171();
			if (this.aClass45_1 == null) {
				super.method91(anInt389, arg1, arg2);
			} else {
				this.aClass36_18.method545();
				this.aClass1_Sub1_Sub2_Sub4_3.method440("RuneScape is loading - please wait...", 180, 54, 16777215);
				Class1_Sub1_Sub2.method437(62, 34, 28, 304, 9179409);
				Class1_Sub1_Sub2.method437(63, 32, 29, 302, 0);
				Class1_Sub1_Sub2.method436(30, arg1 * 3, 9179409, 30, 64);
				this.anInt442 += arg0;
				Class1_Sub1_Sub2.method436(arg1 * 3 + 30, 300 - arg1 * 3, 0, 30, 64);
				this.aClass1_Sub1_Sub2_Sub4_3.method440(arg2, 180, 85, 16777215);
				this.aClass36_18.method546(214, super.aGraphics2, 186);
				if (this.aBoolean47) {
					this.aBoolean47 = false;
					if (!this.aBoolean41) {
						this.aClass36_19.method546(0, super.aGraphics2, 0);
						this.aClass36_20.method546(661, super.aGraphics2, 0);
					}
					this.aClass36_16.method546(128, super.aGraphics2, 0);
					this.aClass36_17.method546(214, super.aGraphics2, 386);
					this.aClass36_21.method546(0, super.aGraphics2, 265);
					this.aClass36_22.method546(574, super.aGraphics2, 265);
					this.aClass36_23.method546(128, super.aGraphics2, 186);
					this.aClass36_24.method546(574, super.aGraphics2, 186);
				}
			}
		} catch (@Pc(210) RuntimeException local210) {
			signlink.reporterror("92112, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local210.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;IILjava/lang/String;I)Lclient!yb;")
	private Class45 method219(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(3) byte[] local3 = null;
			@Pc(13) int local13 = 5;
			try {
				if (this.aClass43Array1[0] != null) {
					local3 = this.aClass43Array1[0].method631(arg4);
				}
			} catch (@Pc(28) Exception local28) {
				signlink.reporterror("loaderror: lj1 " + arg0);
			}
			@Pc(50) int local50;
			if (local3 != null) {
				this.aCRC32_1.reset();
				this.aCRC32_1.update(local3);
				local50 = (int) this.aCRC32_1.getValue();
				if (local50 != arg2) {
					local3 = null;
				}
			}
			if (local3 != null) {
				return new Class45(local3, (byte) 49);
			}
			while (local3 == null) {
				this.method91(anInt389, arg1, "Requesting " + arg3);
				try {
					local50 = 0;
					@Pc(89) DataInputStream local89 = this.method211(arg0 + arg2);
					@Pc(92) byte[] local92 = new byte[6];
					local89.readFully(local92, 0, 6);
					@Pc(103) Class1_Sub1_Sub3 local103 = new Class1_Sub1_Sub3(699, local92);
					local103.anInt771 = 3;
					@Pc(111) int local111 = local103.method471() + 6;
					@Pc(113) int local113 = 6;
					local3 = new byte[local111];
					for (@Pc(118) int local118 = 0; local118 < 6; local118++) {
						local3[local118] = local92[local118];
					}
					@Pc(136) int local136;
					while (local113 < local111) {
						local136 = local111 - local113;
						if (local136 > 1000) {
							local136 = 1000;
						}
						local113 += local89.read(local3, local113, local136);
						@Pc(155) int local155 = local113 * 100 / local111;
						if (local155 != local50) {
							this.method91(anInt389, arg1, "Loading " + arg3 + " - " + local155 + "%");
						}
						local50 = local155;
					}
					local89.close();
					try {
						if (this.aClass43Array1[0] != null) {
							this.aClass43Array1[0].method632(local3.length, local3, arg4);
						}
					} catch (@Pc(200) Exception local200) {
						signlink.reporterror("loaderror: lj3 " + arg0);
					}
					this.aCRC32_1.reset();
					this.aCRC32_1.update(local3);
					local136 = (int) this.aCRC32_1.getValue();
					if (local136 != arg2) {
						signlink.reporterror("loaderror: lj2 " + arg0 + " crc:" + arg2 + " crc2:" + local136);
					}
				} catch (@Pc(241) IOException local241) {
					local3 = null;
					for (local50 = local13; local50 > 0; local50--) {
						this.method91(anInt389, arg1, "Error loading - Will retry in " + local50 + " secs.");
						try {
							Thread.sleep(1000L);
						} catch (@Pc(264) Exception local264) {
						}
					}
					local13 *= 2;
					if (local13 > 60) {
						local13 = 60;
					}
				} catch (@Pc(279) Exception local279) {
					signlink.reporterror("loaderror: lj4 " + arg0);
				}
			}
			return new Class45(local3, (byte) 49);
		} catch (@Pc(299) RuntimeException local299) {
			signlink.reporterror("47798, " + 2 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local299.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
	private void method220() {
		try {
			Class9.aClass39_4.method610();
			Class9.aClass39_5.method610();
			Class11.aClass39_6.method610();
			Class13.aClass39_7.method610();
			Class13.aClass39_8.method610();
			Class1_Sub1_Sub1_Sub1_Sub2.aClass39_1.method610();
			Class27.aClass39_9.method610();
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("53592, " + true + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method221() {
		try {
			signlink.anInt922 = 0;
			signlink.midi = "stop";
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("27582, " + 3 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}
}
