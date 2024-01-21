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

@OriginalClass("client!client")
public final class client extends Applet_Sub1 {

	@OriginalMember(owner = "client!client", name = "T", descriptor = "I")
	public static int anInt85;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Z")
	private static boolean aBoolean22;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
	private static int anInt96;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
	private static int anInt182;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "[I")
	public static final int[] anIntArray23 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@OriginalMember(owner = "client!client", name = "O", descriptor = "Ljava/lang/String;")
	private static String aString2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Z")
	private static boolean aBoolean23 = true;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "Z")
	private static boolean aBoolean31 = true;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!client", name = "je", descriptor = "[I")
	private static int[] anIntArray48 = new int[99];

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "[[I")
	public static final int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!client", name = "G", descriptor = "[I")
	private int[] anIntArray19;

	@OriginalMember(owner = "client!client", name = "H", descriptor = "[I")
	private int[] anIntArray20;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_1;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_2;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "I")
	private int anInt86;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "I")
	private int anInt88;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub4 aClass1_Sub3_Sub2_Sub4_1;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub4 aClass1_Sub3_Sub2_Sub4_2;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub4 aClass1_Sub3_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub4 aClass1_Sub3_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "I")
	private int anInt89;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	private int anInt93;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_6;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_7;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_8;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "[I")
	private int[] anIntArray27;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "Lclient!sb;")
	private Class33 aClass33_1;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "Lclient!gb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "Lclient!gb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_2;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
	private int anInt94;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private int anInt95;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
	private int anInt97;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "[Lclient!hb;")
	private Class1_Sub3_Sub2_Sub3[] aClass1_Sub3_Sub2_Sub3Array1;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "Lclient!pb;")
	private Class27 aClass27_3;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "Lclient!pb;")
	private Class27 aClass27_4;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "Lclient!pb;")
	private Class27 aClass27_5;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "Lclient!pb;")
	private Class27 aClass27_6;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "Lclient!pb;")
	private Class27 aClass27_7;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "Lclient!pb;")
	private Class27 aClass27_8;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "Lclient!pb;")
	private Class27 aClass27_9;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "Lclient!pb;")
	private Class27 aClass27_10;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "Lclient!pb;")
	private Class27 aClass27_11;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "[I")
	private int[] anIntArray28;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "[I")
	private int[] anIntArray29;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "[I")
	private int[] anIntArray30;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "I")
	private int anInt99;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "I")
	private int anInt103;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
	private int anInt105;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "I")
	private int anInt106;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "I")
	private int anInt107;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "I")
	private int anInt108;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "I")
	private int anInt109;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
	private int anInt110;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
	private int anInt111;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
	private int anInt112;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
	private int anInt113;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "Ljava/lang/String;")
	private String aString3;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "I")
	private int anInt114;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "I")
	private int anInt115;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
	private int anInt116;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "Lclient!d;")
	private Class6 aClass6_1;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "I")
	private int anInt117;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
	private int anInt118;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
	private int anInt121;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
	private int anInt122;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "I")
	private int anInt123;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
	private int anInt124;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
	private int anInt127;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "I")
	private int anInt128;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
	private int anInt129;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
	private int anInt130;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
	private int anInt131;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
	private int anInt132;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
	private int anInt133;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_9;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_10;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "I")
	private int anInt134;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "[I")
	private int[] anIntArray34;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "[I")
	private int[] anIntArray35;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "[[B")
	private byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
	private int anInt135;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "I")
	private int anInt137;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
	private int anInt138;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "Lclient!pb;")
	private Class27 aClass27_12;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "Lclient!pb;")
	private Class27 aClass27_13;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "Lclient!pb;")
	private Class27 aClass27_14;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "Lclient!pb;")
	private Class27 aClass27_15;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "Lclient!y;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "I")
	private int anInt141;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
	private int anInt143;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
	private int anInt144;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "Lclient!q;")
	private Class28 aClass28_1;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
	private int anInt146;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "Lclient!gb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "Lclient!gb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "Lclient!gb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
	private int anInt148;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "I")
	private int anInt149;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "I")
	private int anInt150;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
	private int anInt151;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
	private int anInt152;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "I")
	private int anInt153;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
	private int anInt154;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private int anInt155;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
	private int anInt156;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "I")
	private int anInt157;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "I")
	private int anInt158;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "I")
	private int anInt159;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
	private int anInt160;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
	private int anInt161;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
	private int anInt162;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
	private int anInt163;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "I")
	private int anInt164;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "I")
	private int anInt165;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "I")
	private int anInt166;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
	private int anInt167;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
	private int anInt169;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
	private int anInt170;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
	private int anInt171;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "Ljava/lang/String;")
	private String aString9;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "Lclient!gb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_6;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "Lclient!gb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_7;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "I")
	private int anInt173;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private int anInt174;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "Ljava/lang/String;")
	private String aString10;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
	private int anInt176;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "I")
	private int anInt177;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
	private int anInt178;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "Lclient!gb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_8;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_11;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_12;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_13;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_14;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_15;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "Lclient!pb;")
	private Class27 aClass27_16;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "Lclient!pb;")
	private Class27 aClass27_17;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "Lclient!pb;")
	private Class27 aClass27_18;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "Lclient!pb;")
	private Class27 aClass27_19;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "Lclient!pb;")
	private Class27 aClass27_20;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "Lclient!pb;")
	private Class27 aClass27_21;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "Lclient!pb;")
	private Class27 aClass27_22;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "Lclient!pb;")
	private Class27 aClass27_23;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "Lclient!pb;")
	private Class27 aClass27_24;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "Lclient!pb;")
	private Class27 aClass27_25;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "Lclient!pb;")
	private Class27 aClass27_26;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "Lclient!pb;")
	private Class27 aClass27_27;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "Lclient!pb;")
	private Class27 aClass27_28;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
	private int anInt183;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
	private int anInt184;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
	private int anInt185;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
	private int anInt186;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private int anInt187;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "[I")
	private int[] anIntArray56;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "[I")
	private int[] anIntArray57;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "[I")
	private int[] anIntArray58;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "[I")
	private int[] anIntArray59;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
	private int anInt191;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
	private int anInt192;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "Lclient!tb;")
	private Class34 aClass34_1;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
	private int anInt193;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
	private int anInt194;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "I")
	private int anInt195;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
	private int anInt196;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "I")
	private int anInt197;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
	private int anInt198;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "I")
	private int anInt199;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
	private int anInt200;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_16;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_17;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "Lclient!gb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_9;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "I")
	private int anInt201;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "J")
	private long aLong6;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_18;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_19;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_20;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_21;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_22;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private int anInt202;

	@OriginalMember(owner = "client!client", name = "D", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray1 = new String[500];

	@OriginalMember(owner = "client!client", name = "E", descriptor = "[Lclient!gb;")
	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array3 = new Class1_Sub3_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "F", descriptor = "Z")
	private boolean aBoolean20 = false;

	@OriginalMember(owner = "client!client", name = "I", descriptor = "[I")
	private int[] anIntArray21 = new int[151];

	@OriginalMember(owner = "client!client", name = "J", descriptor = "[I")
	private int[] anIntArray22 = new int[50];

	@OriginalMember(owner = "client!client", name = "K", descriptor = "[Lclient!ac;")
	private Class2[] aClass2Array1 = new Class2[4];

	@OriginalMember(owner = "client!client", name = "S", descriptor = "Z")
	private boolean aBoolean21 = false;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "I")
	private int anInt87 = 90;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "[Lclient!gb;")
	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array4 = new Class1_Sub3_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "[I")
	private int[] anIntArray24 = new int[8];

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
	private int anInt90 = -1;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
	private int anInt91 = -1;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	private int anInt92 = 383;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "[I")
	private int[] anIntArray25 = new int[1000];

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "[I")
	private int[] anIntArray26 = new int[1000];

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Z")
	private boolean aBoolean24 = false;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "Z")
	private boolean aBoolean25 = false;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "Z")
	private boolean aBoolean26 = false;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "[[I")
	private int[][] anIntArrayArray3 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "Lclient!nb;")
	private Class23 aClass23_1 = new Class23(845);

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "Z")
	private boolean aBoolean27 = false;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "Lclient!dc;")
	private Class7 aClass7_1 = new Class7();

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "Z")
	private boolean aBoolean28 = false;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "Lclient!jb;")
	private Class1_Sub3_Sub3 aClass1_Sub3_Sub3_1 = Class1_Sub3_Sub3.method322();

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "Lclient!nb;")
	private Class23 aClass23_2 = new Class23(845);

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private int anInt98 = -1;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "B")
	private byte aByte6 = 103;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
	private int anInt100 = -1;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "B")
	private byte aByte7 = 5;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "Z")
	private boolean aBoolean29 = false;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "Z")
	private boolean aBoolean30 = false;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "Lclient!jb;")
	private Class1_Sub3_Sub3 aClass1_Sub3_Sub3_2 = Class1_Sub3_Sub3.method322();

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt101 = -1;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
	private int anInt102 = 2301979;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "I")
	private int anInt104 = 3;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "Z")
	private boolean aBoolean32 = false;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "Z")
	private boolean aBoolean33 = true;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "Z")
	private boolean aBoolean34 = false;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
	private int anInt119 = 2048;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
	private int anInt120 = 2047;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "[Lclient!y;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array1 = new Class1_Sub1_Sub2_Sub2[this.anInt119];

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "[I")
	private int[] anIntArray31 = new int[this.anInt119];

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "[I")
	private int[] anIntArray32 = new int[this.anInt119];

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "[Lclient!jb;")
	private Class1_Sub3_Sub3[] aClass1_Sub3_Sub3Array1 = new Class1_Sub3_Sub3[this.anInt119];

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray2 = new String[100];

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "[I")
	private int[] anIntArray33 = new int[7];

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
	private int anInt125 = 4;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
	private int anInt126 = 128;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "Z")
	private boolean aBoolean35 = true;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "Z")
	private boolean aBoolean36 = false;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "I")
	private final int anInt136 = 100;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "[I")
	private int[] anIntArray36 = new int[100];

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "[I")
	private final int[] anIntArray37 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "[I")
	private int[] anIntArray38 = new int[500];

	@OriginalMember(owner = "client!client", name = "md", descriptor = "[I")
	private int[] anIntArray39 = new int[500];

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "[I")
	private int[] anIntArray40 = new int[500];

	@OriginalMember(owner = "client!client", name = "od", descriptor = "[I")
	private int[] anIntArray41 = new int[500];

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "B")
	private byte aByte8 = 5;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "[I")
	private int[] anIntArray42 = new int[33];

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "[[I")
	private int[][] anIntArrayArray4 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "td", descriptor = "[Lclient!gb;")
	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array5 = new Class1_Sub3_Sub2_Sub2[50];

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "Ljava/lang/String;")
	private String aString4 = "";

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "Ljava/lang/String;")
	private String aString5 = "";

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "Ljava/lang/String;")
	private String aString6 = "";

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "I")
	private int anInt139 = 2;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "[I")
	private int[] anIntArray43 = new int[33];

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "Z")
	private boolean aBoolean37 = false;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "[I")
	private int[] anIntArray44 = new int[50];

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "[B")
	private byte[] aByteArray1 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
	private int anInt140 = 3353893;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "Z")
	private boolean aBoolean38 = false;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "Z")
	private boolean aBoolean39 = true;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "[I")
	private int[] anIntArray45 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "[Lclient!gb;")
	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array6 = new Class1_Sub3_Sub2_Sub2[1000];

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "[I")
	private int[] anIntArray46 = new int[256];

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "[I")
	private int[] anIntArray47 = new int[50];

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "I")
	private int anInt142 = -958;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
	private int anInt145 = 2;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "[[[Lclient!nb;")
	private Class23[][][] aClass23ArrayArrayArray1 = new Class23[4][104][104];

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
	private int anInt147 = 1;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "Ljava/lang/String;")
	private String aString7 = "";

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "Ljava/lang/String;")
	private String aString8 = "";

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "Z")
	private boolean aBoolean40 = true;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "[I")
	private int[] anIntArray49 = new int[5];

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "Z")
	private boolean aBoolean41 = false;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "[I")
	private int[] anIntArray50 = new int[100];

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "Lclient!jb;")
	private Class1_Sub3_Sub3 aClass1_Sub3_Sub3_3 = Class1_Sub3_Sub3.method322();

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "[I")
	private int[] anIntArray51 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "Z")
	private boolean aBoolean42 = false;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "I")
	private int anInt168 = 268;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "Z")
	private boolean aBoolean43 = false;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "[I")
	private int[] anIntArray52 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "[I")
	private int[] anIntArray53 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
	private int anInt172 = 10;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray3 = new String[100];

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "[I")
	private int[] anIntArray54 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "[I")
	private int[] anIntArray55 = new int[151];

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "B")
	private byte aByte9 = -21;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
	private int anInt175 = -449;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "Lclient!nb;")
	private Class23 aClass23_3 = new Class23(845);

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "Lclient!nb;")
	private Class23 aClass23_4 = new Class23(845);

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "[Lclient!gb;")
	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array7 = new Class1_Sub3_Sub2_Sub2[8];

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private int anInt179 = -1;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "Z")
	private boolean aBoolean44 = false;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "Ljava/lang/String;")
	private String aString11 = "127.0.0.1";

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "Z")
	private boolean aBoolean45 = false;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
	private int anInt180 = -36905;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "[[I")
	private int[][] anIntArrayArray6 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "Z")
	private boolean aBoolean46 = false;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private int anInt181 = 7759444;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "[Lclient!hb;")
	private Class1_Sub3_Sub2_Sub3[] aClass1_Sub3_Sub2_Sub3Array2 = new Class1_Sub3_Sub2_Sub3[50];

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "Lclient!nb;")
	private Class23 aClass23_5 = new Class23(845);

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "Ljava/lang/String;")
	private String aString12 = "";

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "Ljava/lang/String;")
	private String aString13 = "";

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "Ljava/lang/String;")
	private String aString14 = "";

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "I")
	private int anInt188 = 5063219;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
	private int anInt189 = 78;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "Ljava/lang/String;")
	private String aString15 = "";

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "Z")
	private boolean aBoolean48 = false;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
	private int anInt190 = -1;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray4 = new String[100];

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "Z")
	private boolean aBoolean49 = false;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "[Lclient!x;")
	private Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array1 = new Class1_Sub1_Sub2_Sub1[8192];

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "[I")
	private int[] anIntArray60 = new int[8192];

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "[I")
	private int[] anIntArray61 = new int[2000];

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "[I")
	private int[] anIntArray62 = new int[100];

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
	private int anInt203 = -12807;

	static {
		@Pc(87) int local87 = 0;
		for (@Pc(89) int local89 = 0; local89 < 99; local89++) {
			@Pc(94) int local94 = local89 + 1;
			@Pc(107) int local107 = (int) ((double) local94 + Math.pow(2.0D, (double) local94 / 7.0D) * 300.0D);
			local87 += local107;
			anIntArray48[local89] = local87 / 4;
		}
		anIntArrayArray5 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			signlink.startpriv(InetAddress.getLocalHost());
			@Pc(5) client local5 = new client();
			if (arg0.length > 0) {
				local5.anInt172 = Integer.parseInt(arg0[0]);
			}
			if (arg0.length > 1) {
				local5.anInt166 = Integer.parseInt(arg0[1]);
			}
			if (arg0.length > 2 && arg0[2].equalsIgnoreCase("lowmem")) {
				method69();
			} else {
				method70();
			}
			local5.method56();
		} catch (@Pc(47) Exception local47) {
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	private static void method69() {
		Class28.aBoolean104 = true;
		Class1_Sub3_Sub2_Sub1.aBoolean74 = true;
		aBoolean23 = true;
		Class4.aBoolean14 = true;
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private static void method70() {
		Class28.aBoolean104 = false;
		Class1_Sub3_Sub2_Sub1.aBoolean74 = false;
		aBoolean23 = false;
		Class4.aBoolean14 = false;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIB)Ljava/lang/String;")
	private static String method120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		this.anInt166 = Integer.parseInt(this.getParameter("portoff"));
		this.anInt172 = Integer.parseInt(this.getParameter("nodeid"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method69();
		} else {
			method70();
		}
		this.method57();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method61() {
		if (signlink.sunjava) {
			super.anInt72 = 5;
		}
		signlink.midi = "scape_main";
		if (aBoolean22) {
			this.aBoolean29 = true;
			return;
		}
		aBoolean22 = true;
		@Pc(18) boolean local18 = false;
		@Pc(22) String local22 = this.method141();
		if (local22.endsWith("jagex.com")) {
			local18 = true;
		}
		if (local22.endsWith("runescape.com")) {
			local18 = true;
		}
		if (local22.endsWith("192.168.1.252")) {
			local18 = true;
		}
		if (local22.endsWith("192.168.1.2")) {
			local18 = true;
		}
		if (local22.endsWith("69.1.68.43")) {
			local18 = true;
		}
		if (local22.endsWith("127.0.0.1")) {
			local18 = true;
		}
		if (!local18) {
			this.aBoolean49 = true;
			return;
		}
		try {
			@Pc(66) int local66 = 5;
			this.anIntArray24[7] = 0;
			while (this.anIntArray24[7] == 0) {
				this.method68("Connecting to fileserver", 10);
				try {
					@Pc(91) DataInputStream local91 = this.method142("crc" + (int) (Math.random() * 9.9999999E7D));
					@Pc(98) Class1_Sub3_Sub3 local98 = new Class1_Sub3_Sub3(new byte[32], (byte) 63);
					local91.readFully(local98.aByteArray4, 0, 32);
					for (@Pc(106) int local106 = 0; local106 < 8; local106++) {
						this.anIntArray24[local106] = local98.method336();
					}
					local91.close();
				} catch (@Pc(122) IOException local122) {
					for (@Pc(124) int local124 = local66; local124 > 0; local124--) {
						this.method68("Error loading - Will retry in " + local124 + " secs.", 10);
						try {
							Thread.sleep(1000L);
						} catch (@Pc(143) Exception local143) {
						}
					}
					local66 *= 2;
					if (local66 > 60) {
						local66 = 60;
					}
				}
			}
			this.aClass34_1 = this.method71("title", "title screen", 10, this.anIntArray24[1]);
			this.aClass1_Sub3_Sub2_Sub4_1 = new Class1_Sub3_Sub2_Sub4("p11", this.aClass34_1, false);
			this.aClass1_Sub3_Sub2_Sub4_2 = new Class1_Sub3_Sub2_Sub4("p12", this.aClass34_1, false);
			this.aClass1_Sub3_Sub2_Sub4_3 = new Class1_Sub3_Sub2_Sub4("b12", this.aClass34_1, false);
			this.aClass1_Sub3_Sub2_Sub4_4 = new Class1_Sub3_Sub2_Sub4("q8", this.aClass34_1, false);
			this.method72();
			this.method77(aBoolean31);
			@Pc(227) Class34 local227 = this.method71("config", "config", 20, this.anIntArray24[2]);
			@Pc(238) Class34 local238 = this.method71("interface", "interface", 30, this.anIntArray24[3]);
			@Pc(249) Class34 local249 = this.method71("media", "2d graphics", 40, this.anIntArray24[4]);
			@Pc(260) Class34 local260 = this.method71("models", "3d graphics", 50, this.anIntArray24[5]);
			@Pc(271) Class34 local271 = this.method71("textures", "textures", 60, this.anIntArray24[6]);
			@Pc(282) Class34 local282 = this.method71("wordenc", "chat system", 70, this.anIntArray24[7]);
			this.aByteArrayArrayArray7 = new byte[4][104][104];
			this.anIntArrayArrayArray3 = new int[4][105][105];
			this.aClass28_1 = new Class28(4, this.anIntArrayArrayArray3, 104, (byte) 4, 104);
			for (@Pc(307) int local307 = 0; local307 < 4; local307++) {
				this.aClass2Array1[local307] = new Class2(104, -242, 104);
			}
			this.aClass1_Sub3_Sub2_Sub2_9 = new Class1_Sub3_Sub2_Sub2(512, 512, 0);
			this.method68("Unpacking media", 80);
			this.aClass1_Sub3_Sub2_Sub3_3 = new Class1_Sub3_Sub2_Sub3(0, local249, "invback", 0);
			this.aClass1_Sub3_Sub2_Sub3_5 = new Class1_Sub3_Sub2_Sub3(0, local249, "chatback", 0);
			this.aClass1_Sub3_Sub2_Sub3_4 = new Class1_Sub3_Sub2_Sub3(0, local249, "mapback", 0);
			this.aClass1_Sub3_Sub2_Sub3_6 = new Class1_Sub3_Sub2_Sub3(0, local249, "backbase1", 0);
			this.aClass1_Sub3_Sub2_Sub3_7 = new Class1_Sub3_Sub2_Sub3(0, local249, "backbase2", 0);
			this.aClass1_Sub3_Sub2_Sub3_8 = new Class1_Sub3_Sub2_Sub3(0, local249, "backhmid1", 0);
			this.aClass1_Sub3_Sub2_Sub3_16 = new Class1_Sub3_Sub2_Sub3(0, local249, "sideicons1", 0);
			this.aClass1_Sub3_Sub2_Sub3_17 = new Class1_Sub3_Sub2_Sub3(0, local249, "sideicons2", 0);
			this.aClass1_Sub3_Sub2_Sub2_8 = new Class1_Sub3_Sub2_Sub2("compass", 154, 0, local249);
			@Pc(419) int local419;
			try {
				for (local419 = 0; local419 < 50; local419++) {
					this.aClass1_Sub3_Sub2_Sub3Array2[local419] = new Class1_Sub3_Sub2_Sub3(0, local249, "mapscene", local419);
				}
			} catch (@Pc(438) Exception local438) {
			}
			try {
				for (local419 = 0; local419 < 50; local419++) {
					this.aClass1_Sub3_Sub2_Sub2Array5[local419] = new Class1_Sub3_Sub2_Sub2("mapfunction", 154, local419, local249);
				}
			} catch (@Pc(459) Exception local459) {
			}
			try {
				for (local419 = 0; local419 < 20; local419++) {
					this.aClass1_Sub3_Sub2_Sub2Array4[local419] = new Class1_Sub3_Sub2_Sub2("hitmarks", 154, local419, local249);
				}
			} catch (@Pc(480) Exception local480) {
			}
			try {
				for (local419 = 0; local419 < 20; local419++) {
					this.aClass1_Sub3_Sub2_Sub2Array3[local419] = new Class1_Sub3_Sub2_Sub2("headicons", 154, local419, local249);
				}
			} catch (@Pc(501) Exception local501) {
			}
			for (local419 = 0; local419 < 8; local419++) {
				this.aClass1_Sub3_Sub2_Sub2Array7[local419] = new Class1_Sub3_Sub2_Sub2("cross", 154, local419, local249);
			}
			this.aClass1_Sub3_Sub2_Sub2_3 = new Class1_Sub3_Sub2_Sub2("mapdots", 154, 0, local249);
			this.aClass1_Sub3_Sub2_Sub2_4 = new Class1_Sub3_Sub2_Sub2("mapdots", 154, 1, local249);
			this.aClass1_Sub3_Sub2_Sub2_5 = new Class1_Sub3_Sub2_Sub2("mapdots", 154, 2, local249);
			this.aClass1_Sub3_Sub2_Sub3_1 = new Class1_Sub3_Sub2_Sub3(0, local249, "scrollbar", 0);
			this.aClass1_Sub3_Sub2_Sub3_2 = new Class1_Sub3_Sub2_Sub3(0, local249, "scrollbar", 1);
			this.aClass1_Sub3_Sub2_Sub3_18 = new Class1_Sub3_Sub2_Sub3(0, local249, "redstone1", 0);
			this.aClass1_Sub3_Sub2_Sub3_19 = new Class1_Sub3_Sub2_Sub3(0, local249, "redstone2", 0);
			this.aClass1_Sub3_Sub2_Sub3_20 = new Class1_Sub3_Sub2_Sub3(0, local249, "redstone3", 0);
			this.aClass1_Sub3_Sub2_Sub3_21 = new Class1_Sub3_Sub2_Sub3(0, local249, "redstone1", 0);
			this.aClass1_Sub3_Sub2_Sub3_21.method258();
			this.aClass1_Sub3_Sub2_Sub3_22 = new Class1_Sub3_Sub2_Sub3(0, local249, "redstone2", 0);
			this.aClass1_Sub3_Sub2_Sub3_22.method258();
			this.aClass1_Sub3_Sub2_Sub3_11 = new Class1_Sub3_Sub2_Sub3(0, local249, "redstone1", 0);
			this.aClass1_Sub3_Sub2_Sub3_11.method259();
			this.aClass1_Sub3_Sub2_Sub3_12 = new Class1_Sub3_Sub2_Sub3(0, local249, "redstone2", 0);
			this.aClass1_Sub3_Sub2_Sub3_12.method259();
			this.aClass1_Sub3_Sub2_Sub3_13 = new Class1_Sub3_Sub2_Sub3(0, local249, "redstone3", 0);
			this.aClass1_Sub3_Sub2_Sub3_13.method259();
			this.aClass1_Sub3_Sub2_Sub3_14 = new Class1_Sub3_Sub2_Sub3(0, local249, "redstone1", 0);
			this.aClass1_Sub3_Sub2_Sub3_14.method258();
			this.aClass1_Sub3_Sub2_Sub3_14.method259();
			this.aClass1_Sub3_Sub2_Sub3_15 = new Class1_Sub3_Sub2_Sub3(0, local249, "redstone2", 0);
			this.aClass1_Sub3_Sub2_Sub3_15.method258();
			this.aClass1_Sub3_Sub2_Sub3_15.method259();
			@Pc(699) Class1_Sub3_Sub2_Sub2 local699 = new Class1_Sub3_Sub2_Sub2("backleft1", 154, 0, local249);
			this.aClass27_19 = new Class27(local699.anInt323, 604, local699.anInt322, this.method66());
			local699.method234(0, 0);
			@Pc(725) Class1_Sub3_Sub2_Sub2 local725 = new Class1_Sub3_Sub2_Sub2("backleft2", 154, 0, local249);
			this.aClass27_20 = new Class27(local725.anInt323, 604, local725.anInt322, this.method66());
			local725.method234(0, 0);
			@Pc(751) Class1_Sub3_Sub2_Sub2 local751 = new Class1_Sub3_Sub2_Sub2("backright1", 154, 0, local249);
			this.aClass27_21 = new Class27(local751.anInt323, 604, local751.anInt322, this.method66());
			local751.method234(0, 0);
			@Pc(777) Class1_Sub3_Sub2_Sub2 local777 = new Class1_Sub3_Sub2_Sub2("backright2", 154, 0, local249);
			this.aClass27_22 = new Class27(local777.anInt323, 604, local777.anInt322, this.method66());
			local777.method234(0, 0);
			@Pc(803) Class1_Sub3_Sub2_Sub2 local803 = new Class1_Sub3_Sub2_Sub2("backtop1", 154, 0, local249);
			this.aClass27_23 = new Class27(local803.anInt323, 604, local803.anInt322, this.method66());
			local803.method234(0, 0);
			@Pc(829) Class1_Sub3_Sub2_Sub2 local829 = new Class1_Sub3_Sub2_Sub2("backtop2", 154, 0, local249);
			this.aClass27_24 = new Class27(local829.anInt323, 604, local829.anInt322, this.method66());
			local829.method234(0, 0);
			@Pc(855) Class1_Sub3_Sub2_Sub2 local855 = new Class1_Sub3_Sub2_Sub2("backvmid1", 154, 0, local249);
			this.aClass27_25 = new Class27(local855.anInt323, 604, local855.anInt322, this.method66());
			local855.method234(0, 0);
			@Pc(881) Class1_Sub3_Sub2_Sub2 local881 = new Class1_Sub3_Sub2_Sub2("backvmid2", 154, 0, local249);
			this.aClass27_26 = new Class27(local881.anInt323, 604, local881.anInt322, this.method66());
			local881.method234(0, 0);
			@Pc(907) Class1_Sub3_Sub2_Sub2 local907 = new Class1_Sub3_Sub2_Sub2("backvmid3", 154, 0, local249);
			this.aClass27_27 = new Class27(local907.anInt323, 604, local907.anInt322, this.method66());
			local907.method234(0, 0);
			@Pc(933) Class1_Sub3_Sub2_Sub2 local933 = new Class1_Sub3_Sub2_Sub2("backhmid2", 154, 0, local249);
			this.aClass27_28 = new Class27(local933.anInt323, 604, local933.anInt322, this.method66());
			local933.method234(0, 0);
			this.method68("Unpacking textures", 85);
			Class1_Sub3_Sub2_Sub1.method209(local271);
			Class1_Sub3_Sub2_Sub1.method213(0.8D);
			Class1_Sub3_Sub2_Sub1.method208();
			this.method68("Unpacking models", 85);
			Class1_Sub3_Sub1.method155(local260);
			Class8.method182(local260);
			Class10.method193(local260);
			this.method68("Unpacking config", 85);
			Class11.method221(local227);
			Class37.method443(local227);
			Class3.method33(local227);
			Class39.method469(local227);
			Class38.method455(local227);
			Class5.method52(local227);
			Class13.method243(local227);
			Class15.method262(local227);
			this.method68("Unpacking interfaces", 90);
			@Pc(1033) Class1_Sub3_Sub2_Sub4[] local1033 = new Class1_Sub3_Sub2_Sub4[] { this.aClass1_Sub3_Sub2_Sub4_1, this.aClass1_Sub3_Sub2_Sub4_2, this.aClass1_Sub3_Sub2_Sub4_3, this.aClass1_Sub3_Sub2_Sub4_4 };
			Class7.method178(local1033, local249, local238);
			this.method68("Preparing game engine", 95);
			@Pc(1049) int local1049;
			@Pc(1051) int local1051;
			@Pc(1053) int local1053;
			for (@Pc(1045) int local1045 = 0; local1045 < 33; local1045++) {
				local1049 = 999;
				local1051 = 0;
				for (local1053 = 0; local1053 < 35; local1053++) {
					if (this.aClass1_Sub3_Sub2_Sub3_4.aByteArray3[local1053 + local1045 * this.aClass1_Sub3_Sub2_Sub3_4.anInt349] == 0) {
						if (local1049 == 999) {
							local1049 = local1053;
						}
					} else if (local1049 != 999) {
						local1051 = local1053;
						break;
					}
				}
				this.anIntArray42[local1045] = local1049;
				this.anIntArray43[local1045] = local1051 - local1049;
			}
			@Pc(1111) int local1111;
			for (local1049 = 9; local1049 < 160; local1049++) {
				local1051 = 999;
				local1053 = 0;
				for (local1111 = 10; local1111 < 168; local1111++) {
					if (this.aClass1_Sub3_Sub2_Sub3_4.aByteArray3[local1111 + local1049 * this.aClass1_Sub3_Sub2_Sub3_4.anInt349] == 0 && (local1111 > 34 || local1049 > 34)) {
						if (local1051 == 999) {
							local1051 = local1111;
						}
					} else if (local1051 != 999) {
						local1053 = local1111;
						break;
					}
				}
				this.anIntArray55[local1049 - 9] = local1051 - 21;
				this.anIntArray21[local1049 - 9] = local1053 - local1051;
			}
			Class1_Sub3_Sub2_Sub1.method206(479, 96);
			this.anIntArray28 = Class1_Sub3_Sub2_Sub1.anIntArray120;
			Class1_Sub3_Sub2_Sub1.method206(190, 261);
			this.anIntArray29 = Class1_Sub3_Sub2_Sub1.anIntArray120;
			Class1_Sub3_Sub2_Sub1.method206(512, 334);
			this.anIntArray30 = Class1_Sub3_Sub2_Sub1.anIntArray120;
			@Pc(1195) int[] local1195 = new int[9];
			for (local1053 = 0; local1053 < 9; local1053++) {
				local1111 = local1053 * 32 + 128 + 15;
				@Pc(1213) int local1213 = local1111 * 3 + 600;
				@Pc(1217) int local1217 = Class1_Sub3_Sub2_Sub1.anIntArray118[local1111];
				local1195[local1053] = local1213 * local1217 >> 16;
			}
			Class28.method396(local1195);
			Class17.method282(local282);
		} catch (@Pc(1240) Exception local1240) {
			this.aBoolean47 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;II)Lclient!tb;")
	private Class34 method71(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) int local3 = 5;
		@Pc(6) byte[] local6 = signlink.cacheload(arg0);
		@Pc(33) int local33;
		if (local6 != null) {
			this.aCRC32_1.reset();
			this.aCRC32_1.update(local6);
			local33 = (int) this.aCRC32_1.getValue();
			if (local33 != arg3) {
				local6 = null;
			}
		}
		if (local6 != null) {
			return new Class34(local6, 969);
		}
		while (local6 == null) {
			this.method68("Requesting " + arg1, arg2);
			try {
				local33 = 0;
				@Pc(72) DataInputStream local72 = this.method142(arg0 + arg3);
				@Pc(75) byte[] local75 = new byte[6];
				local72.readFully(local75, 0, 6);
				@Pc(86) Class1_Sub3_Sub3 local86 = new Class1_Sub3_Sub3(local75, (byte) 63);
				local86.anInt394 = 3;
				@Pc(94) int local94 = local86.method335() + 6;
				@Pc(96) int local96 = 6;
				local6 = new byte[local94];
				for (@Pc(101) int local101 = 0; local101 < 6; local101++) {
					local6[local101] = local75[local101];
				}
				while (local96 < local94) {
					@Pc(119) int local119 = local94 - local96;
					if (local119 > 1000) {
						local119 = 1000;
					}
					local96 += local72.read(local6, local96, local119);
					@Pc(138) int local138 = local96 * 100 / local94;
					if (local138 != local33) {
						this.method68("Loading " + arg1 + " - " + local138 + "%", arg2);
					}
					local33 = local138;
				}
				local72.close();
			} catch (@Pc(167) IOException local167) {
				local6 = null;
				for (local33 = local3; local33 > 0; local33--) {
					this.method68("Error loading - Will retry in " + local33 + " secs.", arg2);
					try {
						Thread.sleep(1000L);
					} catch (@Pc(190) Exception local190) {
					}
				}
				local3 *= 2;
				if (local3 > 60) {
					local3 = 60;
				}
			}
		}
		signlink.cachesave(arg0, local6);
		return new Class34(local6, 969);
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method72() {
		@Pc(8) byte[] local8 = this.aClass34_1.method428(null, "title.dat");
		@Pc(15) Class1_Sub3_Sub2_Sub2 local15 = new Class1_Sub3_Sub2_Sub2(local8, this, 0);
		this.aClass27_6.method359();
		local15.method234(0, 0);
		this.aClass27_7.method359();
		local15.method234(0, -661);
		this.aClass27_3.method359();
		local15.method234(0, -128);
		this.aClass27_4.method359();
		local15.method234(-386, -214);
		this.aClass27_5.method359();
		local15.method234(-186, -214);
		this.aClass27_8.method359();
		local15.method234(-265, 0);
		this.aClass27_9.method359();
		local15.method234(-265, -574);
		this.aClass27_10.method359();
		local15.method234(-186, -128);
		this.aClass27_11.method359();
		local15.method234(-186, -574);
		@Pc(105) int[] local105 = new int[local15.anInt322];
		for (@Pc(107) int local107 = 0; local107 < local15.anInt323; local107++) {
			for (@Pc(111) int local111 = 0; local111 < local15.anInt322; local111++) {
				local105[local111] = local15.anIntArray129[local15.anInt322 + local15.anInt322 * local107 - local111 - 1];
			}
			for (@Pc(137) int local137 = 0; local137 < local15.anInt322; local137++) {
				local15.anIntArray129[local137 + local15.anInt322 * local107] = local105[local137];
			}
		}
		this.aClass27_6.method359();
		local15.method234(0, 394);
		this.aClass27_7.method359();
		local15.method234(0, -267);
		this.aClass27_3.method359();
		local15.method234(0, 266);
		this.aClass27_4.method359();
		local15.method234(-386, 180);
		this.aClass27_5.method359();
		local15.method234(-186, 180);
		this.aClass27_8.method359();
		local15.method234(-265, 394);
		this.aClass27_9.method359();
		local15.method234(-265, -180);
		this.aClass27_10.method359();
		local15.method234(-186, 212);
		this.aClass27_11.method359();
		local15.method234(-186, -180);
		local15 = new Class1_Sub3_Sub2_Sub2("logo", 154, 0, this.aClass34_1);
		this.aClass27_3.method359();
		local15.method236(super.anInt74 / 2 - local15.anInt322 / 2 - 128, 18);
		System.gc();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	@Override
	protected void method68(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.method75();
		if (this.aClass34_1 == null) {
			super.method68(arg0, arg1);
			return;
		}
		this.aClass27_5.method359();
		this.aClass1_Sub3_Sub2_Sub4_3.method274(54, this.aBoolean44, 180, 16777215, "RuneScape is loading - please wait...");
		Class1_Sub3_Sub2.method271(304, 34, 28, 62, 9179409);
		Class1_Sub3_Sub2.method271(302, 32, 29, 63, 0);
		Class1_Sub3_Sub2.method270(9179409, arg1 * 3, 64, 30, 30);
		Class1_Sub3_Sub2.method270(0, 300 - arg1 * 3, 64, 30, arg1 * 3 + 30);
		this.aClass1_Sub3_Sub2_Sub4_3.method274(85, this.aBoolean44, 180, 16777215, arg0);
		this.aClass27_5.method360(super.aGraphics2, 214, 186);
		if (!this.aBoolean43) {
			return;
		}
		this.aBoolean43 = false;
		if (!this.aBoolean32) {
			this.aClass27_6.method360(super.aGraphics2, 0, 0);
			this.aClass27_7.method360(super.aGraphics2, 661, 0);
		}
		this.aClass27_3.method360(super.aGraphics2, 128, 0);
		this.aClass27_4.method360(super.aGraphics2, 214, 386);
		this.aClass27_8.method360(super.aGraphics2, 0, 265);
		this.aClass27_9.method360(super.aGraphics2, 574, 265);
		this.aClass27_10.method360(super.aGraphics2, 128, 186);
		this.aClass27_11.method360(super.aGraphics2, 574, 186);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method62() {
		if (this.aBoolean29 || this.aBoolean47 || this.aBoolean49) {
			return;
		}
		anInt85++;
		if (this.aBoolean41) {
			this.method89();
		} else {
			this.method76();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method64() {
		if (this.aBoolean29 || this.aBoolean47 || this.aBoolean49) {
			this.method73(this.aByte6);
			return;
		}
		if (this.aBoolean41) {
			this.method91(this.anInt141);
		} else {
			this.method83();
		}
		this.anInt183 = 0;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method73(@OriginalArg(0) byte arg0) {
		@Pc(4) Graphics local4 = this.method66().getGraphics();
		local4.setColor(Color.black);
		@Pc(12) int local12;
		if (arg0 != 103) {
			for (local12 = 1; local12 > 0; local12++) {
			}
		}
		local4.fillRect(0, 0, 789, 532);
		this.method59();
		@Pc(46) byte local46;
		if (this.aBoolean47) {
			this.aBoolean32 = false;
			local4.setFont(new Font("Helvetica", 1, 16));
			local4.setColor(Color.yellow);
			local46 = 35;
			local4.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
			local12 = local46 + 50;
			local4.setColor(Color.white);
			local4.drawString("To fix this try the following (in order):", 30, 85);
			local12 += 50;
			local4.setColor(Color.white);
			local4.setFont(new Font("Helvetica", 1, 12));
			local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
			local12 += 30;
			local4.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
			local12 += 30;
			local4.drawString("3: Try using a different game-world", 30, 195);
			local12 += 30;
			local4.drawString("4: Try rebooting your computer", 30, 225);
			local12 += 30;
			local4.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
		}
		if (this.aBoolean49) {
			this.aBoolean32 = false;
			local4.setFont(new Font("Helvetica", 1, 20));
			local4.setColor(Color.white);
			local4.drawString("Error - unable to load game!", 50, 50);
			local4.drawString("To play RuneScape make sure you play from", 50, 100);
			local4.drawString("http://www.runescape.com", 50, 150);
		}
		if (!this.aBoolean29) {
			return;
		}
		this.aBoolean32 = false;
		local4.setColor(Color.yellow);
		local46 = 35;
		local4.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
		local12 = local46 + 50;
		local4.setColor(Color.white);
		local4.drawString("To fix this try the following (in order):", 30, 85);
		local12 += 50;
		local4.setColor(Color.white);
		local4.setFont(new Font("Helvetica", 1, 12));
		local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
		local12 += 30;
		local4.drawString("2: Try rebooting your computer, and reloading", 30, 165);
		local12 += 30;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method65() {
		this.aBoolean43 = true;
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method74() {
		if (this.aClass27_15 != null) {
			return;
		}
		this.method78();
		super.aClass27_2 = null;
		this.aClass27_3 = null;
		this.aClass27_4 = null;
		this.aClass27_5 = null;
		this.aClass27_6 = null;
		this.aClass27_7 = null;
		this.aClass27_8 = null;
		this.aClass27_9 = null;
		this.aClass27_10 = null;
		this.aClass27_11 = null;
		this.aClass27_15 = new Class27(96, 604, 479, this.method66());
		this.aClass27_13 = new Class27(160, 604, 168, this.method66());
		Class1_Sub3_Sub2.method269();
		this.aClass1_Sub3_Sub2_Sub3_4.method260(0, 0);
		this.aClass27_12 = new Class27(261, 604, 190, this.method66());
		this.aClass27_14 = new Class27(334, 604, 512, this.method66());
		Class1_Sub3_Sub2.method269();
		this.aClass27_16 = new Class27(61, 604, 501, this.method66());
		this.aClass27_17 = new Class27(40, 604, 288, this.method66());
		this.aClass27_18 = new Class27(66, 604, 269, this.method66());
		this.aBoolean43 = true;
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method75() {
		if (this.aClass27_3 != null) {
			return;
		}
		super.aClass27_2 = null;
		this.aClass27_15 = null;
		this.aClass27_13 = null;
		this.aClass27_12 = null;
		this.aClass27_14 = null;
		this.aClass27_16 = null;
		this.aClass27_17 = null;
		this.aClass27_18 = null;
		this.aClass27_6 = new Class27(265, 604, 128, this.method66());
		Class1_Sub3_Sub2.method269();
		this.aClass27_7 = new Class27(265, 604, 128, this.method66());
		Class1_Sub3_Sub2.method269();
		this.aClass27_3 = new Class27(186, 604, 533, this.method66());
		Class1_Sub3_Sub2.method269();
		this.aClass27_4 = new Class27(146, 604, 360, this.method66());
		Class1_Sub3_Sub2.method269();
		this.aClass27_5 = new Class27(200, 604, 360, this.method66());
		Class1_Sub3_Sub2.method269();
		this.aClass27_8 = new Class27(267, 604, 214, this.method66());
		Class1_Sub3_Sub2.method269();
		this.aClass27_9 = new Class27(267, 604, 215, this.method66());
		Class1_Sub3_Sub2.method269();
		this.aClass27_10 = new Class27(79, 604, 86, this.method66());
		Class1_Sub3_Sub2.method269();
		this.aClass27_11 = new Class27(79, 604, 87, this.method66());
		Class1_Sub3_Sub2.method269();
		if (this.aClass34_1 != null) {
			this.method72();
			this.method77(aBoolean31);
		}
		this.aBoolean43 = true;
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method76() {
		@Pc(15) int local15;
		@Pc(22) int local22;
		if (this.anInt97 == 0) {
			local15 = super.anInt74 / 2;
			local22 = super.anInt75 / 2 + 90;
			if (super.anInt80 == 1 && super.anInt81 >= local15 - 75 && super.anInt81 <= local15 + 75 && super.anInt82 >= local22 - 20 && super.anInt82 <= local22 + 20) {
				this.aString12 = "";
				this.aString13 = "Enter your username & password.";
				this.anInt97 = 2;
				this.anInt174 = 0;
				return;
			}
		} else if (this.anInt97 == 1 || this.anInt97 == 2) {
			local15 = super.anInt75 / 2 - 30;
			local15 += 30;
			if (super.anInt80 == 1 && super.anInt82 >= local15 - 15 && super.anInt82 < local15) {
				this.anInt174 = 0;
			}
			local15 += 15;
			if (super.anInt80 == 1 && super.anInt82 >= local15 - 15 && super.anInt82 < local15) {
				this.anInt174 = 1;
			}
			local15 += 15;
			if (super.anInt80 == 1 && super.anInt82 >= local15 - 15 && super.anInt82 < local15 && this.anInt97 == 1) {
				this.anInt174 = 2;
			}
			local22 = super.anInt74 / 2 - 80;
			@Pc(150) int local150 = super.anInt75 / 2 + 60;
			if (super.anInt80 == 1 && super.anInt81 >= local22 - 75 && super.anInt81 <= local22 + 75 && super.anInt82 >= local150 - 20 && super.anInt82 <= local150 + 20) {
				if (this.anInt97 == 1) {
					this.method85(this.method140(), this.aString4, this.aString5);
				} else {
					this.method84(this.aString4, this.aString5, this.method140(), false);
				}
			}
			local22 = super.anInt74 / 2 + 80;
			if (super.anInt80 == 1 && super.anInt81 >= local22 - 75 && super.anInt81 <= local22 + 75 && super.anInt82 >= local150 - 20 && super.anInt82 <= local150 + 20) {
				this.anInt97 = 0;
			}
			while (true) {
				while (true) {
					@Pc(247) int local247 = this.method60();
					if (local247 == -1) {
						return;
					}
					@Pc(252) boolean local252 = false;
					for (@Pc(254) int local254 = 0; local254 < aString2.length(); local254++) {
						if (local247 == aString2.charAt(local254)) {
							local252 = true;
							break;
						}
					}
					if (this.anInt174 == 0) {
						if (local247 == 8 && this.aString4.length() > 0) {
							this.aString4 = this.aString4.substring(0, this.aString4.length() - 1);
						}
						if (local247 == 9 || local247 == 10 || local247 == 13) {
							this.anInt174 = 1;
						}
						if (local252) {
							this.aString4 = this.aString4 + (char) local247;
						}
						if (this.aString4.length() > 12) {
							this.aString4 = this.aString4.substring(0, 12);
						}
					} else if (this.anInt174 == 1) {
						if (local247 == 8 && this.aString5.length() > 0) {
							this.aString5 = this.aString5.substring(0, this.aString5.length() - 1);
						}
						if (local247 == 9 || local247 == 10 || local247 == 13) {
							if (this.anInt97 == 1) {
								this.anInt174 = 2;
							} else {
								this.anInt174 = 0;
							}
						}
						if (local252) {
							this.aString5 = this.aString5 + (char) local247;
						}
						if (this.aString5.length() > 20) {
							this.aString5 = this.aString5.substring(0, 20);
						}
					} else if (this.anInt174 == 2) {
						if (local247 == 8 && this.aString6.length() > 0) {
							this.aString6 = this.aString6.substring(0, this.aString6.length() - 1);
						}
						if (local247 == 9 || local247 == 10 || local247 == 13) {
							this.anInt174 = 0;
						}
						if (local252) {
							this.aString6 = this.aString6 + (char) local247;
						}
						if (this.aString6.length() > 20) {
							this.aString6 = this.aString6.substring(0, 20);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method77(@OriginalArg(0) boolean arg0) {
		this.aClass1_Sub3_Sub2_Sub3_9 = new Class1_Sub3_Sub2_Sub3(0, this.aClass34_1, "titlebox", 0);
		this.aClass1_Sub3_Sub2_Sub3_10 = new Class1_Sub3_Sub2_Sub3(0, this.aClass34_1, "titlebutton", 0);
		this.aClass1_Sub3_Sub2_Sub3Array1 = new Class1_Sub3_Sub2_Sub3[12];
		this.aBoolean41 &= arg0;
		for (@Pc(33) int local33 = 0; local33 < 12; local33++) {
			this.aClass1_Sub3_Sub2_Sub3Array1[local33] = new Class1_Sub3_Sub2_Sub3(0, this.aClass34_1, "runes", local33);
		}
		this.aClass1_Sub3_Sub2_Sub2_1 = new Class1_Sub3_Sub2_Sub2(128, 265, 0);
		this.aClass1_Sub3_Sub2_Sub2_2 = new Class1_Sub3_Sub2_Sub2(128, 265, 0);
		for (@Pc(69) int local69 = 0; local69 < 33920; local69++) {
			this.aClass1_Sub3_Sub2_Sub2_1.anIntArray129[local69] = this.aClass27_6.anIntArray165[local69];
		}
		for (@Pc(87) int local87 = 0; local87 < 33920; local87++) {
			this.aClass1_Sub3_Sub2_Sub2_2.anIntArray129[local87] = this.aClass27_7.anIntArray165[local87];
		}
		this.anIntArray57 = new int[256];
		for (@Pc(109) int local109 = 0; local109 < 64; local109++) {
			this.anIntArray57[local109] = local109 * 262144;
		}
		for (@Pc(124) int local124 = 0; local124 < 64; local124++) {
			this.anIntArray57[local124 + 64] = local124 * 1024 + 16711680;
		}
		for (@Pc(143) int local143 = 0; local143 < 64; local143++) {
			this.anIntArray57[local143 + 128] = local143 * 4 + 16776960;
		}
		for (@Pc(162) int local162 = 0; local162 < 64; local162++) {
			this.anIntArray57[local162 + 192] = 16777215;
		}
		this.anIntArray58 = new int[256];
		for (@Pc(181) int local181 = 0; local181 < 64; local181++) {
			this.anIntArray58[local181] = local181 * 1024;
		}
		for (@Pc(196) int local196 = 0; local196 < 64; local196++) {
			this.anIntArray58[local196 + 64] = local196 * 4 + 65280;
		}
		for (@Pc(215) int local215 = 0; local215 < 64; local215++) {
			this.anIntArray58[local215 + 128] = local215 * 262144 + 65535;
		}
		for (@Pc(234) int local234 = 0; local234 < 64; local234++) {
			this.anIntArray58[local234 + 192] = 16777215;
		}
		this.anIntArray59 = new int[256];
		for (@Pc(253) int local253 = 0; local253 < 64; local253++) {
			this.anIntArray59[local253] = local253 * 4;
		}
		for (@Pc(268) int local268 = 0; local268 < 64; local268++) {
			this.anIntArray59[local268 + 64] = local268 * 262144 + 255;
		}
		for (@Pc(287) int local287 = 0; local287 < 64; local287++) {
			this.anIntArray59[local287 + 128] = local287 * 1024 + 16711935;
		}
		for (@Pc(306) int local306 = 0; local306 < 64; local306++) {
			this.anIntArray59[local306 + 192] = 16777215;
		}
		this.anIntArray56 = new int[256];
		this.anIntArray34 = new int[32768];
		this.anIntArray35 = new int[32768];
		this.method79(null);
		this.anIntArray19 = new int[32768];
		this.anIntArray20 = new int[32768];
		this.method68("Connecting to fileserver", 10);
		if (!this.aBoolean32) {
			this.aBoolean48 = true;
			this.aBoolean32 = true;
			this.method67(this, 2);
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (!this.aBoolean48) {
			super.run();
			return;
		}
		this.aBoolean37 = true;
		try {
			@Pc(10) long local10 = System.currentTimeMillis();
			@Pc(12) int local12 = 0;
			@Pc(14) int local14 = 20;
			while (this.aBoolean32) {
				this.method80();
				this.method80();
				this.method82();
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
		this.aBoolean37 = false;
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method78() {
		this.aBoolean32 = false;
		while (this.aBoolean37) {
			this.aBoolean32 = false;
			try {
				Thread.sleep(50L);
			} catch (@Pc(11) Exception local11) {
			}
		}
		this.aClass1_Sub3_Sub2_Sub3_9 = null;
		this.aClass1_Sub3_Sub2_Sub3_10 = null;
		this.aClass1_Sub3_Sub2_Sub3Array1 = null;
		this.anIntArray56 = null;
		this.anIntArray57 = null;
		this.anIntArray58 = null;
		this.anIntArray59 = null;
		this.anIntArray34 = null;
		this.anIntArray35 = null;
		this.anIntArray19 = null;
		this.anIntArray20 = null;
		this.aClass1_Sub3_Sub2_Sub2_1 = null;
		this.aClass1_Sub3_Sub2_Sub2_2 = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!hb;)V")
	private void method79(@OriginalArg(1) Class1_Sub3_Sub2_Sub3 arg0) {
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
		if (arg0 == null) {
			return;
		}
		local48 = 0;
		for (local52 = 0; local52 < arg0.anInt350; local52++) {
			for (local60 = 0; local60 < arg0.anInt349; local60++) {
				if (arg0.aByteArray3[local48++] != 0) {
					@Pc(148) int local148 = local60 + arg0.anInt351 + 16;
					@Pc(155) int local155 = local52 + arg0.anInt352 + 16;
					@Pc(161) int local161 = local148 + (local155 << 7);
					this.anIntArray34[local161] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method80() {
		@Pc(12) int local12;
		for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
			local12 = (int) (Math.random() * 100.0D);
			if (local12 < 50) {
				this.anIntArray19[local5 + 32512] = 255;
			}
		}
		@Pc(41) int local41;
		@Pc(48) int local48;
		@Pc(54) int local54;
		for (local12 = 0; local12 < 100; local12++) {
			local41 = (int) (Math.random() * 124.0D) + 2;
			local48 = (int) (Math.random() * 128.0D) + 128;
			local54 = local41 + (local48 << 7);
			this.anIntArray19[local54] = 192;
		}
		for (local41 = 1; local41 < 255; local41++) {
			for (local48 = 1; local48 < 127; local48++) {
				local54 = local48 + (local41 << 7);
				this.anIntArray20[local54] = (this.anIntArray19[local54 - 1] + this.anIntArray19[local54 + 1] + this.anIntArray19[local54 - 128] + this.anIntArray19[local54 + 128]) / 4;
			}
		}
		this.anInt176 += 128;
		if (this.anInt176 > this.anIntArray34.length) {
			this.anInt176 -= this.anIntArray34.length;
			local48 = (int) (Math.random() * 12.0D);
			this.method79(this.aClass1_Sub3_Sub2_Sub3Array1[local48]);
		}
		@Pc(171) int local171;
		for (local48 = 1; local48 < 255; local48++) {
			for (local54 = 1; local54 < 127; local54++) {
				local171 = local54 + (local48 << 7);
				@Pc(194) int local194 = this.anIntArray20[local171 + 128] - this.anIntArray34[local171 + this.anInt176 & this.anIntArray34.length - 1] / 5;
				if (local194 < 0) {
					local194 = 0;
				}
				this.anIntArray19[local171] = local194;
			}
		}
		for (local54 = 0; local54 < 255; local54++) {
			this.anIntArray46[local54] = this.anIntArray46[local54 + 1];
		}
		this.anIntArray46[255] = (int) (Math.sin((double) anInt85 / 14.0D) * 16.0D + Math.sin((double) anInt85 / 15.0D) * 14.0D + Math.sin((double) anInt85 / 16.0D) * 12.0D);
		if (this.anInt160 > 0) {
			this.anInt160 -= 4;
		}
		if (this.anInt161 > 0) {
			this.anInt161 -= 4;
		}
		if (this.anInt160 != 0 || this.anInt161 != 0) {
			return;
		}
		local171 = (int) (Math.random() * 2000.0D);
		if (local171 == 0) {
			this.anInt160 = 1024;
		}
		if (local171 == 1) {
			this.anInt161 = 1024;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
	private int method81(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = 256 - arg2;
		return ((arg1 & 0xFF00FF) * local3 + (arg0 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg1 & 0xFF00) * local3 + (arg0 & 0xFF00) * arg2 & 0xFF0000) >> 8;
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method82() {
		@Pc(8) int local8;
		if (this.anInt160 > 0) {
			for (local8 = 0; local8 < 256; local8++) {
				if (this.anInt160 > 768) {
					this.anIntArray56[local8] = this.method81(this.anIntArray58[local8], this.anIntArray57[local8], 1024 - this.anInt160);
				} else if (this.anInt160 > 256) {
					this.anIntArray56[local8] = this.anIntArray58[local8];
				} else {
					this.anIntArray56[local8] = this.method81(this.anIntArray57[local8], this.anIntArray58[local8], 256 - this.anInt160);
				}
			}
		} else if (this.anInt161 > 0) {
			for (local8 = 0; local8 < 256; local8++) {
				if (this.anInt161 > 768) {
					this.anIntArray56[local8] = this.method81(this.anIntArray59[local8], this.anIntArray57[local8], 1024 - this.anInt161);
				} else if (this.anInt161 > 256) {
					this.anIntArray56[local8] = this.anIntArray59[local8];
				} else {
					this.anIntArray56[local8] = this.method81(this.anIntArray57[local8], this.anIntArray59[local8], 256 - this.anInt161);
				}
			}
		} else {
			for (local8 = 0; local8 < 256; local8++) {
				this.anIntArray56[local8] = this.anIntArray57[local8];
			}
		}
		for (local8 = 0; local8 < 33920; local8++) {
			this.aClass27_6.anIntArray165[local8] = this.aClass1_Sub3_Sub2_Sub2_1.anIntArray129[local8];
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
				local220 = this.anIntArray19[local181++];
				if (local220 == 0) {
					local183++;
				} else {
					local224 = local220;
					local228 = 256 - local220;
					local220 = this.anIntArray56[local220];
					local239 = this.aClass27_6.anIntArray165[local183];
					this.aClass27_6.anIntArray165[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
				}
			}
			local183 += local202;
		}
		this.aClass27_6.method360(super.aGraphics2, 0, 0);
		for (local198 = 0; local198 < 33920; local198++) {
			this.aClass27_7.anIntArray165[local198] = this.aClass1_Sub3_Sub2_Sub2_2.anIntArray129[local198];
		}
		local181 = 0;
		local183 = 1176;
		for (local202 = 1; local202 < 255; local202++) {
			local212 = this.anIntArray46[local202] * (256 - local202) / 256;
			local220 = 103 - local212;
			local183 += local212;
			for (local224 = 0; local224 < local220; local224++) {
				local228 = this.anIntArray19[local181++];
				if (local228 == 0) {
					local183++;
				} else {
					local239 = local228;
					@Pc(364) int local364 = 256 - local228;
					local228 = this.anIntArray56[local228];
					@Pc(375) int local375 = this.aClass27_7.anIntArray165[local183];
					this.aClass27_7.anIntArray165[local183++] = ((local228 & 0xFF00FF) * local239 + (local375 & 0xFF00FF) * local364 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local375 & 0xFF00) * local364 & 0xFF0000) >> 8;
				}
			}
			local181 += 128 - local220;
			local183 += 128 - local220 - local212;
		}
		this.aClass27_7.method360(super.aGraphics2, 661, 0);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method83() {
		this.method75();
		this.aClass27_5.method359();
		this.aBoolean41 &= true;
		this.aClass1_Sub3_Sub2_Sub3_9.method260(0, 0);
		@Pc(33) byte local33;
		@Pc(46) int local46;
		if (this.anInt97 == 0) {
			local33 = 20;
			this.aClass1_Sub3_Sub2_Sub4_3.method275(180, "Welcome to the RuneScape-2 BETA test.", 20, this.anInt175, 16776960, true);
			local46 = local33 + 15;
			@Pc(47) int local47 = local46 + 15;
			this.aClass1_Sub3_Sub2_Sub4_1.method275(180, "Please note this test version of the game is provided for ", 50, this.anInt175, 16777215, true);
			@Pc(60) int local60 = local47 + 15;
			this.aClass1_Sub3_Sub2_Sub4_1.method275(180, "testing/preview purposes only. As such please bear in mind that:", 65, this.anInt175, 16777215, true);
			@Pc(73) int local73 = local60 + 15;
			@Pc(74) int local74 = local73 + 10;
			this.aClass1_Sub3_Sub2_Sub4_1.method275(180, "a) Everything you do/gain here will be forgotten when the beta ends.", 90, this.anInt175, 16777215, true);
			@Pc(87) int local87 = local74 + 15;
			this.aClass1_Sub3_Sub2_Sub4_1.method275(180, "b) No customer support is available for the beta.", 105, this.anInt175, 16777215, true);
			@Pc(100) int local100 = local87 + 15;
			this.aClass1_Sub3_Sub2_Sub4_1.method275(180, "c) The beta may be incomplete/buggy, we're still working on it.", 120, this.anInt175, 16777215, true);
			@Pc(113) int local113 = local100 + 15;
			this.aClass1_Sub3_Sub2_Sub4_1.method275(180, "d) The beta may be totally unavailable at times.", 135, this.anInt175, 16777215, true);
			@Pc(126) int local126 = local113 + 15;
			this.aClass1_Sub3_Sub2_Sub3_10.method260(107, 145);
			this.aClass1_Sub3_Sub2_Sub4_3.method275(180, "Click here to login.", 170, this.anInt175, 16777215, true);
		}
		if (this.anInt97 == 1 || this.anInt97 == 2) {
			local33 = 50;
			if (this.aString12.length() > 0) {
				this.aClass1_Sub3_Sub2_Sub4_3.method275(180, this.aString12, 35, this.anInt175, 16776960, true);
				this.aClass1_Sub3_Sub2_Sub4_3.method275(180, this.aString13, 50, this.anInt175, 16776960, true);
				local46 = local33 + 30;
			} else {
				this.aClass1_Sub3_Sub2_Sub4_3.method275(180, this.aString13, 43, this.anInt175, 16776960, true);
				local46 = local33 + 30;
			}
			this.aClass1_Sub3_Sub2_Sub4_3.method279(true, 90, 80, 16777215, "Username: " + this.aString4 + (this.anInt174 == 0 & anInt85 % 40 < 20 ? "@yel@|" : ""));
			local46 += 15;
			this.aClass1_Sub3_Sub2_Sub4_3.method279(true, 92, 95, 16777215, "Password: " + Class35.method436(this.aString5) + (this.anInt174 == 1 & anInt85 % 40 < 20 ? "@yel@|" : ""));
			local46 += 15;
			if (this.anInt97 == 1) {
				this.aClass1_Sub3_Sub2_Sub4_3.method279(true, 37, 110, 16777215, "Confirm Password: " + Class35.method436(this.aString6) + (this.anInt174 == 2 & anInt85 % 40 < 20 ? "@yel@|" : ""));
			}
			this.aClass1_Sub3_Sub2_Sub3_10.method260(27, 120);
			if (this.anInt97 == 1) {
				this.aClass1_Sub3_Sub2_Sub4_3.method275(100, "Create", 145, this.anInt175, 16777215, true);
			} else {
				this.aClass1_Sub3_Sub2_Sub4_3.method275(100, "Login", 145, this.anInt175, 16777215, true);
			}
			this.aClass1_Sub3_Sub2_Sub3_10.method260(187, 120);
			this.aClass1_Sub3_Sub2_Sub4_3.method275(260, "Cancel", 145, this.anInt175, 16777215, true);
		}
		this.aClass27_5.method360(super.aGraphics2, 214, 186);
		if (!this.aBoolean43) {
			return;
		}
		this.aBoolean43 = false;
		this.aClass27_3.method360(super.aGraphics2, 128, 0);
		this.aClass27_4.method360(super.aGraphics2, 214, 386);
		this.aClass27_8.method360(super.aGraphics2, 0, 265);
		this.aClass27_9.method360(super.aGraphics2, 574, 265);
		this.aClass27_10.method360(super.aGraphics2, 128, 186);
		this.aClass27_11.method360(super.aGraphics2, 574, 186);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BIZ)V")
	private void method84(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		try {
			if (!arg3) {
				this.aString12 = "";
				this.aString13 = "Connecting to server...";
				this.method83();
			}
			this.aClass6_1 = new Class6(-407, this.method143(this.anInt166 + 43594), this);
			this.aClass6_1.method150(this.aClass1_Sub3_Sub3_2.aByteArray4, 0, 8);
			this.aClass1_Sub3_Sub3_2.anInt394 = 0;
			this.aLong6 = this.aClass1_Sub3_Sub3_2.method337();
			@Pc(50) int[] local50 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong6 >> 32), (int) this.aLong6 };
			this.aClass1_Sub3_Sub3_1.anInt394 = 0;
			this.aClass1_Sub3_Sub3_1.method324(10);
			this.aClass1_Sub3_Sub3_1.method326(local50[0]);
			this.aClass1_Sub3_Sub3_1.method326(local50[1]);
			this.aClass1_Sub3_Sub3_1.method326(local50[2]);
			this.aClass1_Sub3_Sub3_1.method326(local50[3]);
			this.aClass1_Sub3_Sub3_1.method326(arg2);
			this.aClass1_Sub3_Sub3_1.method328(arg0);
			this.aClass1_Sub3_Sub3_1.method328(arg1);
			this.aClass1_Sub3_Sub3_1.method346(aBigInteger1, aBigInteger2);
			this.aClass1_Sub3_Sub3_3.anInt394 = 0;
			if (arg3) {
				this.aClass1_Sub3_Sub3_3.method324(18);
			} else {
				this.aClass1_Sub3_Sub3_3.method324(16);
			}
			this.aClass1_Sub3_Sub3_3.method324(this.aClass1_Sub3_Sub3_1.anInt394 + 32);
			for (@Pc(154) int local154 = 0; local154 < 8; local154++) {
				this.aClass1_Sub3_Sub3_3.method326(this.anIntArray24[local154]);
			}
			this.aClass1_Sub3_Sub3_3.method329(this.aClass1_Sub3_Sub3_1.anInt394, this.aClass1_Sub3_Sub3_1.aByteArray4);
			this.aClass1_Sub3_Sub3_1.aClass33_2 = new Class33((byte) -73, local50);
			for (@Pc(188) int local188 = 0; local188 < 4; local188++) {
				local50[local188] += 50;
			}
			this.aClass33_1 = new Class33((byte) -73, local50);
			this.aClass6_1.method151(this.aClass1_Sub3_Sub3_3.aByteArray4, this.aClass1_Sub3_Sub3_3.anInt394);
			@Pc(223) int local223 = this.aClass6_1.method148();
			if (local223 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(230) Exception local230) {
				}
				this.method84(arg0, arg1, arg2, arg3);
				return;
			}
			if (local223 == 2) {
				this.aBoolean41 = true;
				this.aClass1_Sub3_Sub3_1.anInt394 = 0;
				this.aClass1_Sub3_Sub3_2.anInt394 = 0;
				this.anInt106 = -1;
				this.anInt105 = 0;
				this.anInt107 = 0;
				this.anInt118 = 0;
				if (!arg3) {
					super.anInt76 = 0;
					for (@Pc(271) int local271 = 0; local271 < 100; local271++) {
						this.aStringArray4[local271] = null;
					}
					this.anInt110 = 0;
					this.anInt169 = 0;
					this.anInt86 = 0;
					this.anInt179 = -1;
					this.anInt121 = 0;
					this.anInt201 = 0;
					for (@Pc(302) int local302 = 0; local302 < this.anInt119; local302++) {
						this.aClass1_Sub1_Sub2_Sub2Array1[local302] = null;
						this.aClass1_Sub3_Sub3Array1[local302] = null;
					}
					for (@Pc(321) int local321 = 0; local321 < 8192; local321++) {
						this.aClass1_Sub1_Sub2_Sub1Array1[local321] = null;
					}
					this.aClass1_Sub1_Sub2_Sub2_1 = this.aClass1_Sub1_Sub2_Sub2Array1[this.anInt120] = new Class1_Sub1_Sub2_Sub2();
					this.aClass23_5.method356();
					this.aClass23_1.method356();
					this.aClass23_4.method356();
					@Pc(354) int local354 = 0;
					while (true) {
						@Pc(358) int local358;
						if (local354 >= 4) {
							this.aClass23_2 = new Class23(845);
							this.anInt167 = 0;
							this.anInt190 = -1;
							this.anInt101 = -1;
							this.anInt100 = -1;
							this.aBoolean28 = false;
							this.anInt104 = 3;
							this.aBoolean30 = false;
							this.aBoolean45 = false;
							this.aBoolean20 = false;
							this.anInt123 = 0;
							this.aBoolean33 = true;
							this.method133();
							for (local358 = 0; local358 < 5; local358++) {
								this.anIntArray49[local358] = 0;
							}
							this.method74();
							break;
						}
						for (local358 = 0; local358 < 104; local358++) {
							for (@Pc(362) int local362 = 0; local362 < 104; local362++) {
								this.aClass23ArrayArrayArray1[local354][local358][local362] = null;
							}
						}
						local354++;
					}
				}
				return;
			}
			if (local223 == 3) {
				this.aString12 = "";
				this.aString13 = "Invalid username or password.";
				return;
			}
			if (local223 == 4) {
				this.aString12 = "Your account has been disabled.";
				this.aString13 = "Please check your message-centre for details.";
				return;
			}
			if (local223 == 5) {
				this.aString12 = "Your account is already logged in.";
				this.aString13 = "Try again in 60 secs...";
				return;
			}
			if (local223 == 6) {
				this.aString12 = "RuneScape has been updated!";
				this.aString13 = "Please reload this page.";
				return;
			}
			if (local223 == 7) {
				this.aString12 = "This world is full.";
				this.aString13 = "Please use a different world.";
				return;
			}
			if (local223 == 8) {
				this.aString12 = "Unable to connect.";
				this.aString13 = "Login server offline.";
				return;
			}
			if (local223 == 9) {
				this.aString12 = "Login limit exceeded.";
				this.aString13 = "Too many connections from your address.";
				return;
			}
			if (local223 == 10) {
				this.aString12 = "Unable to connect.";
				this.aString13 = "Bad session id.";
				return;
			}
			if (local223 == 11) {
				this.aString12 = "Unable to connect.";
				this.aString13 = "Login server rejected session.";
				return;
			}
			if (local223 == 12) {
				this.aString12 = "You need a members account to beta-test";
				this.aString13 = "Please subscribe, or play RS1 instead";
				return;
			}
			if (local223 == 13) {
				this.aString12 = "Could not complete login";
				this.aString13 = "Please try using a different world";
				return;
			}
			if (local223 == 14) {
				this.aString12 = "The server is being updated";
				this.aString13 = "Please wait 1 minute and try again";
				return;
			}
		} catch (@Pc(565) IOException local565) {
			this.aString12 = "";
			this.aString13 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
	private void method85(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		try {
			this.aString12 = "";
			this.aString13 = "Connecting to server...";
			this.method83();
			this.aClass6_1 = new Class6(-407, this.method143(this.anInt166 + 43594), this);
			this.aClass6_1.method150(this.aClass1_Sub3_Sub3_2.aByteArray4, 0, 8);
			this.aClass1_Sub3_Sub3_2.anInt394 = 0;
			this.aLong6 = this.aClass1_Sub3_Sub3_2.method337();
			this.aClass1_Sub3_Sub3_1.anInt394 = 0;
			this.aClass1_Sub3_Sub3_1.method324(10);
			this.aClass1_Sub3_Sub3_1.method326((int) Math.random() * 99999999);
			this.aClass1_Sub3_Sub3_1.method326((int) Math.random() * 99999999);
			this.aClass1_Sub3_Sub3_1.method327(this.aLong6);
			this.aClass1_Sub3_Sub3_1.method326(arg0);
			this.aClass1_Sub3_Sub3_1.method328(arg1);
			this.aClass1_Sub3_Sub3_1.method328(arg2);
			this.aClass1_Sub3_Sub3_1.method346(aBigInteger1, aBigInteger2);
			this.aClass1_Sub3_Sub3_3.anInt394 = 0;
			this.aClass1_Sub3_Sub3_3.method324(17);
			this.aClass1_Sub3_Sub3_3.method324(this.aClass1_Sub3_Sub3_1.anInt394);
			this.aClass1_Sub3_Sub3_3.method329(this.aClass1_Sub3_Sub3_1.anInt394, this.aClass1_Sub3_Sub3_1.aByteArray4);
			this.aClass6_1.method151(this.aClass1_Sub3_Sub3_3.aByteArray4, this.aClass1_Sub3_Sub3_3.anInt394);
			@Pc(132) int local132 = this.aClass6_1.method148();
			if (local132 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(139) Exception local139) {
				}
				this.method85(arg0, arg1, arg2);
				return;
			}
			if (local132 == 2) {
				this.aString12 = "Username already taken.";
				this.aString13 = "Please choose a different name.";
				return;
			}
			if (local132 == 3) {
				this.anInt97 = 2;
				this.method84(this.aString4, this.aString5, arg0, false);
				return;
			}
		} catch (@Pc(173) IOException local173) {
			this.aString12 = "";
			this.aString13 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method63(@OriginalArg(0) byte arg0) {
		try {
			if (this.aClass6_1 != null) {
				this.aClass6_1.method147();
			}
		} catch (@Pc(9) Exception local9) {
		}
		this.aClass6_1 = null;
		signlink.midi = "null";
		this.aClass1_Sub3_Sub3_1 = null;
		this.aClass1_Sub3_Sub3_3 = null;
		this.aClass1_Sub3_Sub3_2 = null;
		this.anIntArray27 = null;
		this.aByteArrayArray1 = null;
		this.aByteArrayArray2 = null;
		this.anIntArrayArrayArray3 = null;
		this.aByteArrayArrayArray7 = null;
		this.aClass28_1 = null;
		this.aClass2Array1 = null;
		this.anIntArrayArray3 = null;
		this.anIntArrayArray4 = null;
		this.anIntArray52 = null;
		this.anIntArray53 = null;
		this.aByteArray1 = null;
		this.aClass27_12 = null;
		this.aClass27_13 = null;
		this.aClass27_14 = null;
		this.aClass27_15 = null;
		this.aClass27_16 = null;
		this.aClass27_17 = null;
		this.aClass27_18 = null;
		this.aClass27_19 = null;
		this.aClass27_20 = null;
		this.aClass27_21 = null;
		this.aClass27_22 = null;
		this.aClass27_23 = null;
		this.aClass27_24 = null;
		this.aClass27_25 = null;
		this.aClass27_26 = null;
		this.aClass27_27 = null;
		this.aClass27_28 = null;
		this.aClass1_Sub3_Sub2_Sub3_3 = null;
		this.aClass1_Sub3_Sub2_Sub3_4 = null;
		this.aClass1_Sub3_Sub2_Sub3_5 = null;
		this.aClass1_Sub3_Sub2_Sub3_6 = null;
		this.aClass1_Sub3_Sub2_Sub3_7 = null;
		this.aClass1_Sub3_Sub2_Sub3_8 = null;
		this.aClass1_Sub3_Sub2_Sub3_16 = null;
		this.aClass1_Sub3_Sub2_Sub3_17 = null;
		this.aClass1_Sub3_Sub2_Sub3_18 = null;
		this.aClass1_Sub3_Sub2_Sub3_19 = null;
		this.aClass1_Sub3_Sub2_Sub3_20 = null;
		this.aClass1_Sub3_Sub2_Sub3_21 = null;
		this.aClass1_Sub3_Sub2_Sub3_22 = null;
		this.aClass1_Sub3_Sub2_Sub3_11 = null;
		this.aClass1_Sub3_Sub2_Sub3_12 = null;
		this.aClass1_Sub3_Sub2_Sub3_13 = null;
		this.aClass1_Sub3_Sub2_Sub3_14 = null;
		this.aClass1_Sub3_Sub2_Sub3_15 = null;
		this.aClass1_Sub3_Sub2_Sub2_8 = null;
		this.aClass1_Sub3_Sub2_Sub2Array4 = null;
		this.aClass1_Sub3_Sub2_Sub2Array3 = null;
		this.aClass1_Sub3_Sub2_Sub2Array7 = null;
		this.aClass1_Sub3_Sub2_Sub2_3 = null;
		this.aClass1_Sub3_Sub2_Sub2_4 = null;
		this.aClass1_Sub3_Sub2_Sub2_5 = null;
		this.aClass1_Sub3_Sub2_Sub3Array2 = null;
		this.aClass1_Sub3_Sub2_Sub2Array5 = null;
		this.anIntArrayArray6 = null;
		this.aClass1_Sub1_Sub2_Sub2Array1 = null;
		this.anIntArray31 = null;
		this.anIntArray32 = null;
		this.aClass1_Sub3_Sub3Array1 = null;
		this.anIntArray51 = null;
		this.aClass1_Sub1_Sub2_Sub1Array1 = null;
		this.anIntArray60 = null;
		this.aClass23ArrayArrayArray1 = null;
		this.aClass23_2 = null;
		this.aClass23_4 = null;
		this.aClass23_5 = null;
		this.aClass23_1 = null;
		this.aClass23_3 = null;
		this.anIntArray38 = null;
		this.anIntArray39 = null;
		this.anIntArray40 = null;
		this.anIntArray41 = null;
		this.aStringArray1 = null;
		this.anIntArray61 = null;
		this.anIntArray25 = null;
		this.anIntArray26 = null;
		this.aClass1_Sub3_Sub2_Sub2Array6 = null;
		this.aClass1_Sub3_Sub2_Sub2_9 = null;
		this.aStringArray3 = null;
		if (arg0 != -64) {
			anInt96 = 60;
		}
		this.anIntArray62 = null;
		this.aClass27_6 = null;
		this.aClass27_7 = null;
		this.aClass27_3 = null;
		this.aClass27_4 = null;
		this.aClass27_5 = null;
		this.aClass27_8 = null;
		this.aClass27_9 = null;
		this.aClass27_10 = null;
		this.aClass27_11 = null;
		this.method78();
		Class37.method444();
		Class38.method456();
		Class39.method470();
		Class3.aClass3Array1 = null;
		Class5.aClass5Array1 = null;
		Class7.aClass7Array1 = null;
		Class9.aClass9Array1 = null;
		Class11.aClass11Array1 = null;
		Class13.aClass13Array1 = null;
		Class13.aClass30_3 = null;
		Class15.aClass15Array1 = null;
		super.aClass27_2 = null;
		Class1_Sub1_Sub2_Sub2.aClass30_7 = null;
		Class1_Sub3_Sub2_Sub1.method204();
		Class28.method362();
		Class1_Sub3_Sub1.method154();
		Class8.aClass8Array1 = null;
		Class10.aClass10Array1 = null;
		System.gc();
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method86() {
		Class37.aClass30_4.method421();
		Class37.aClass30_5.method421();
		Class38.aClass30_6.method421();
		Class39.aClass30_8.method421();
		Class39.aClass30_9.method421();
		Class1_Sub1_Sub2_Sub2.aClass30_7.method421();
		Class13.aClass30_3.method421();
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method87() {
		if (this.anInt180 != -36905) {
			this.anInt175 = this.aClass33_1.method424();
		}
		try {
			if (this.aClass6_1 != null) {
				this.aClass6_1.method147();
			}
		} catch (@Pc(16) Exception local16) {
		}
		this.aClass6_1 = null;
		this.aBoolean41 = false;
		this.anInt97 = 0;
		this.aString4 = "";
		this.aString5 = "";
		this.aString6 = "";
		this.method86();
		this.aClass28_1.method363();
		for (@Pc(43) int local43 = 0; local43 < 4; local43++) {
			this.aClass2Array1[local43].method20();
		}
		System.gc();
		if (this.aBoolean35) {
			signlink.midi = "null";
		}
		this.aString10 = null;
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method88() {
		this.aClass27_14.method359();
		this.aClass1_Sub3_Sub2_Sub4_2.method274(144, this.aBoolean44, 257, 0, "Connection lost");
		this.aClass1_Sub3_Sub2_Sub4_2.method274(143, this.aBoolean44, 256, 16777215, "Connection lost");
		this.aClass1_Sub3_Sub2_Sub4_2.method274(159, this.aBoolean44, 257, 0, "Please wait - attempting to reestablish");
		this.aClass1_Sub3_Sub2_Sub4_2.method274(158, this.aBoolean44, 256, 16777215, "Please wait - attempting to reestablish");
		this.aClass27_14.method360(super.aGraphics2, 8, 11);
		this.aBoolean41 = false;
		this.method84(this.aString4, this.aString5, this.method140(), true);
		if (!this.aBoolean41) {
			this.method87();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method89() {
		if (this.anInt118 > 1) {
			this.anInt118--;
		}
		for (@Pc(13) int local13 = 0; local13 < 5 && this.method106(); local13++) {
		}
		this.anInt107++;
		if (this.anInt107 > 750) {
			this.method88();
		}
		this.method100();
		this.method102();
		@Pc(53) int local53;
		for (@Pc(45) int local45 = -1; local45 < this.anInt121; local45++) {
			if (local45 == -1) {
				local53 = this.anInt120;
			} else {
				local53 = this.anIntArray31[local45];
			}
			@Pc(65) Class1_Sub1_Sub2_Sub2 local65 = this.aClass1_Sub1_Sub2_Sub2Array1[local53];
			if (local65.anInt712 > 0) {
				local65.anInt712--;
				if (local65.anInt712 == 0) {
					local65.aString26 = null;
				}
			}
		}
		@Pc(94) int local94;
		for (local53 = 0; local53 < this.anInt201; local53++) {
			local94 = this.anIntArray60[local53];
			@Pc(99) Class1_Sub1_Sub2_Sub1 local99 = this.aClass1_Sub1_Sub2_Sub1Array1[local94];
			if (local99.anInt712 > 0) {
				local99.anInt712--;
				if (local99.anInt712 == 0) {
					local99.aString26 = null;
				}
			}
		}
		if (this.anInt86 == 2) {
			for (@Pc(128) Class1_Sub5 local128 = (Class1_Sub5) this.aClass23_4.method352(); local128 != null; local128 = (Class1_Sub5) this.aClass23_4.method354()) {
				if (anInt85 >= local128.anInt452) {
					this.method107(local128.anInt445, local128.anInt451, local128.anInt448, local128.anInt447, local128.anInt446, local128.anInt450, local128.anInt449);
					local128.method478();
				}
			}
		}
		this.anInt134++;
		if (this.anInt125 > 4 || this.anInt125 < 4) {
			this.aClass23ArrayArrayArray1 = null;
		}
		if (this.anInt165 != 0) {
			this.anInt164 += 20;
			if (this.anInt164 >= 400) {
				this.anInt165 = 0;
			}
		}
		if (this.anInt187 != 0) {
			this.anInt184++;
			if (this.anInt184 >= 15) {
				if (this.anInt187 == 2) {
					this.aBoolean21 = true;
				}
				if (this.anInt187 == 3) {
					this.aBoolean36 = true;
				}
				this.anInt187 = 0;
			}
		}
		@Pc(231) int local231;
		if (Class28.anInt519 != -1) {
			local94 = Class28.anInt519;
			local231 = Class28.anInt520;
			@Pc(253) boolean local253 = this.method105(local231, 0, true, 0, local94, this.aClass1_Sub1_Sub2_Sub2_1.anIntArray207[0], 0, 0, 0, this.aClass1_Sub1_Sub2_Sub2_1.anIntArray208[0]);
			Class28.anInt519 = -1;
			if (local253) {
				this.anInt162 = super.anInt81;
				this.anInt163 = super.anInt82;
				this.anInt165 = 1;
				this.anInt164 = 0;
			}
		}
		this.method114();
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(309) int local309;
		if (super.anInt80 == 1) {
			local94 = super.anInt81 - 21 - 561;
			local231 = super.anInt82 - 9 - 5;
			if (local94 >= 0 && local231 >= 0 && local94 < 146 && local231 < 151) {
				local94 -= 73;
				local231 -= 75;
				local309 = Class1_Sub3_Sub2_Sub1.anIntArray118[this.anInt127];
				local314 = Class1_Sub3_Sub2_Sub1.anIntArray119[this.anInt127];
				local324 = local231 * local309 + local94 * local314 >> 11;
				@Pc(334) int local334 = local231 * local314 - local94 * local309 >> 11;
				@Pc(342) int local342 = this.aClass1_Sub1_Sub2_Sub2_1.anInt701 + local324 >> 7;
				@Pc(350) int local350 = this.aClass1_Sub1_Sub2_Sub2_1.anInt702 - local334 >> 7;
				this.method105(local350, 0, true, 0, local342, this.aClass1_Sub1_Sub2_Sub2_1.anIntArray207[0], 0, 0, 0, this.aClass1_Sub1_Sub2_Sub2_1.anIntArray208[0]);
			}
		}
		if (super.anInt80 == 1) {
			if (super.anInt81 >= 549 && super.anInt81 <= 583 && super.anInt82 >= 195 && super.anInt82 < 231) {
				this.aBoolean21 = true;
				this.anInt104 = 0;
				this.aBoolean34 = true;
			}
			if (super.anInt81 >= 579 && super.anInt81 <= 609 && super.anInt82 >= 194 && super.anInt82 < 231) {
				this.aBoolean21 = true;
				this.anInt104 = 1;
				this.aBoolean34 = true;
			}
			if (super.anInt81 >= 607 && super.anInt81 <= 637 && super.anInt82 >= 194 && super.anInt82 < 231) {
				this.aBoolean21 = true;
				this.anInt104 = 2;
				this.aBoolean34 = true;
			}
			if (super.anInt81 >= 635 && super.anInt81 <= 679 && super.anInt82 >= 194 && super.anInt82 < 229) {
				this.aBoolean21 = true;
				this.anInt104 = 3;
				this.aBoolean34 = true;
			}
			if (super.anInt81 >= 676 && super.anInt81 <= 706 && super.anInt82 >= 194 && super.anInt82 < 231) {
				this.aBoolean21 = true;
				this.anInt104 = 4;
				this.aBoolean34 = true;
			}
			if (super.anInt81 >= 704 && super.anInt81 <= 734 && super.anInt82 >= 194 && super.anInt82 < 231) {
				this.aBoolean21 = true;
				this.anInt104 = 5;
				this.aBoolean34 = true;
			}
			if (super.anInt81 >= 732 && super.anInt81 <= 766 && super.anInt82 >= 195 && super.anInt82 < 231) {
				this.aBoolean21 = true;
				this.anInt104 = 6;
				this.aBoolean34 = true;
			}
			if (super.anInt81 >= 582 && super.anInt81 <= 612 && super.anInt82 >= 492 && super.anInt82 < 529) {
				this.aBoolean21 = true;
				this.anInt104 = 8;
				this.aBoolean34 = true;
			}
			if (super.anInt81 >= 609 && super.anInt81 <= 639 && super.anInt82 >= 492 && super.anInt82 < 529) {
				this.aBoolean21 = true;
				this.anInt104 = 9;
				this.aBoolean34 = true;
			}
			if (super.anInt81 >= 637 && super.anInt81 <= 681 && super.anInt82 >= 493 && super.anInt82 < 528) {
				this.aBoolean21 = true;
				this.anInt104 = 10;
				this.aBoolean34 = true;
			}
			if (super.anInt81 >= 679 && super.anInt81 <= 709 && super.anInt82 >= 492 && super.anInt82 < 529) {
				this.aBoolean21 = true;
				this.anInt104 = 11;
				this.aBoolean34 = true;
			}
		}
		if (super.anInt80 == 1) {
			if (super.anInt81 >= 8 && super.anInt81 <= 108 && super.anInt82 >= 490 && super.anInt82 <= 522) {
				this.anInt143 = (this.anInt143 + 1) % 3;
				this.aBoolean46 = true;
				this.aBoolean36 = true;
				this.aClass1_Sub3_Sub3_1.method323(173);
				this.aClass1_Sub3_Sub3_1.method324(this.anInt143);
				this.aClass1_Sub3_Sub3_1.method324(this.anInt135);
				this.aClass1_Sub3_Sub3_1.method324(this.anInt122);
			}
			if (super.anInt81 >= 137 && super.anInt81 <= 237 && super.anInt82 >= 490 && super.anInt82 <= 522) {
				this.anInt135 = (this.anInt135 + 1) % 3;
				this.aBoolean46 = true;
				this.aBoolean36 = true;
				this.aClass1_Sub3_Sub3_1.method323(173);
				this.aClass1_Sub3_Sub3_1.method324(this.anInt143);
				this.aClass1_Sub3_Sub3_1.method324(this.anInt135);
				this.aClass1_Sub3_Sub3_1.method324(this.anInt122);
			}
			if (super.anInt81 >= 275 && super.anInt81 <= 375 && super.anInt82 >= 490 && super.anInt82 <= 522) {
				this.anInt122 = (this.anInt122 + 1) % 3;
				this.aBoolean46 = true;
				this.aBoolean36 = true;
				this.aClass1_Sub3_Sub3_1.method323(173);
				this.aClass1_Sub3_Sub3_1.method324(this.anInt143);
				this.aClass1_Sub3_Sub3_1.method324(this.anInt135);
				this.aClass1_Sub3_Sub3_1.method324(this.anInt122);
			}
			@Pc(822) boolean local822;
			if (super.anInt81 >= 416 && super.anInt81 <= 516 && super.anInt82 >= 490 && super.anInt82 <= 522) {
				local822 = true;
			} else {
				local822 = false;
			}
		}
		if (super.anInt77 == 1 || super.anInt80 == 1) {
			this.anInt183++;
		}
		if (this.anInt86 == 2) {
			this.method90(this.aBoolean26);
		}
		while (true) {
			while (true) {
				@Pc(1216) long local1216;
				do {
					do {
						do {
							do {
								while (true) {
									local94 = this.method60();
									if (local94 == -1) {
										super.anInt76++;
										if (super.anInt76 > 4500) {
											super.anInt76 -= 500;
											this.aClass1_Sub3_Sub3_1.method323(135);
										}
										this.anInt178++;
										if (this.anInt178 > 500) {
											this.anInt178 = 0;
											local94 = (int) (Math.random() * 8.0D);
											if ((local94 & 0x1) == 1) {
												this.anInt138 += this.anInt139;
											}
											if ((local94 & 0x2) == 2) {
												this.anInt144 += this.anInt145;
											}
											if ((local94 & 0x4) == 4) {
												this.anInt146 += this.anInt147;
											}
										}
										if (this.anInt138 < -50) {
											this.anInt139 = 2;
										}
										if (this.anInt138 > 50) {
											this.anInt139 = -2;
										}
										if (this.anInt144 < -55) {
											this.anInt145 = 2;
										}
										if (this.anInt144 > 55) {
											this.anInt145 = -2;
										}
										if (this.anInt146 < -40) {
											this.anInt147 = 1;
										}
										if (this.anInt146 > 40) {
											this.anInt147 = -1;
										}
										this.anInt108++;
										if (this.anInt108 > 50) {
											this.aClass1_Sub3_Sub3_1.method323(223);
										}
										try {
											if (this.aClass6_1 != null && this.aClass1_Sub3_Sub3_1.anInt394 > 0) {
												this.aClass6_1.method151(this.aClass1_Sub3_Sub3_1.aByteArray4, this.aClass1_Sub3_Sub3_1.anInt394);
												this.aClass1_Sub3_Sub3_1.anInt394 = 0;
												this.anInt108 = 0;
												return;
											}
										} catch (@Pc(1982) IOException local1982) {
											this.method88();
											return;
										} catch (@Pc(1987) Exception local1987) {
											this.method87();
										}
										return;
									}
									if (this.aBoolean20) {
										if (local94 >= 32 && local94 <= 122 && this.aString15.length() < 80) {
											this.aString15 = this.aString15 + (char) local94;
											this.aBoolean36 = true;
										}
										if (local94 == 8 && this.aString15.length() > 0) {
											this.aString15 = this.aString15.substring(0, this.aString15.length() - 1);
											this.aBoolean36 = true;
										}
										break;
									}
									if (this.aBoolean30) {
										if (local94 >= 48 && local94 <= 57 && this.aString8.length() < 10) {
											this.aString8 = this.aString8 + (char) local94;
											this.aBoolean36 = true;
										}
										if (local94 == 8 && this.aString8.length() > 0) {
											this.aString8 = this.aString8.substring(0, this.aString8.length() - 1);
											this.aBoolean36 = true;
										}
										if (local94 == 13 || local94 == 10) {
											if (this.aString8.length() > 0) {
												local231 = 0;
												try {
													local231 = Integer.parseInt(this.aString8);
												} catch (@Pc(1405) Exception local1405) {
												}
												this.aClass1_Sub3_Sub3_1.method323(217);
												this.aClass1_Sub3_Sub3_1.method326(local231);
											}
											this.aBoolean30 = false;
											this.aBoolean36 = true;
										}
									} else if (this.anInt190 == -1) {
										if (local94 >= 32 && local94 <= 122 && this.aString7.length() < 80) {
											this.aString7 = this.aString7 + (char) local94;
											this.aBoolean36 = true;
										}
										if (local94 == 8 && this.aString7.length() > 0) {
											this.aString7 = this.aString7.substring(0, this.aString7.length() - 1);
											this.aBoolean36 = true;
										}
										if ((local94 == 13 || local94 == 10) && this.aString7.length() > 0) {
											if (this.aString7.equals("::clientdrop") && super.aFrame_Sub1_2 != null) {
												this.method88();
											} else if (this.aString7.startsWith("::")) {
												this.aClass1_Sub3_Sub3_1.method323(37);
												this.aClass1_Sub3_Sub3_1.method324(this.aString7.length() - 1);
												this.aClass1_Sub3_Sub3_1.method328(this.aString7.substring(2));
											} else {
												@Pc(1525) byte local1525 = 0;
												if (this.aString7.startsWith("yellow:")) {
													local1525 = 0;
													this.aString7 = this.aString7.substring(7);
												}
												if (this.aString7.startsWith("red:")) {
													local1525 = 1;
													this.aString7 = this.aString7.substring(4);
												}
												if (this.aString7.startsWith("green:")) {
													local1525 = 2;
													this.aString7 = this.aString7.substring(6);
												}
												if (this.aString7.startsWith("cyan:")) {
													local1525 = 3;
													this.aString7 = this.aString7.substring(5);
												}
												if (this.aString7.startsWith("purple:")) {
													local1525 = 4;
													this.aString7 = this.aString7.substring(7);
												}
												if (this.aString7.startsWith("white:")) {
													local1525 = 5;
													this.aString7 = this.aString7.substring(6);
												}
												if (this.aString7.startsWith("flash1:")) {
													local1525 = 6;
													this.aString7 = this.aString7.substring(7);
												}
												if (this.aString7.startsWith("flash2:")) {
													local1525 = 7;
													this.aString7 = this.aString7.substring(7);
												}
												if (this.aString7.startsWith("flash3:")) {
													local1525 = 8;
													this.aString7 = this.aString7.substring(7);
												}
												if (this.aString7.startsWith("glow1:")) {
													local1525 = 9;
													this.aString7 = this.aString7.substring(6);
												}
												if (this.aString7.startsWith("glow2:")) {
													local1525 = 10;
													this.aString7 = this.aString7.substring(6);
												}
												if (this.aString7.startsWith("glow3:")) {
													local1525 = 11;
													this.aString7 = this.aString7.substring(6);
												}
												@Pc(1683) byte local1683 = 0;
												if (this.aString7.startsWith("wave:")) {
													local1683 = 1;
													this.aString7 = this.aString7.substring(5);
												}
												if (this.aString7.startsWith("scroll:")) {
													local1683 = 2;
													this.aString7 = this.aString7.substring(7);
												}
												this.aClass1_Sub3_Sub3_1.method323(18);
												this.aClass1_Sub3_Sub3_1.method324(0);
												local314 = this.aClass1_Sub3_Sub3_1.anInt394;
												this.aClass1_Sub3_Sub3_1.method324(local1525);
												this.aClass1_Sub3_Sub3_1.method324(local1683);
												Class36.method438(this.aClass1_Sub3_Sub3_1, this.aString7);
												this.aClass1_Sub3_Sub3_1.method330(this.aClass1_Sub3_Sub3_1.anInt394 - local314);
												this.aString7 = Class35.method435(this.aString7);
												this.aString7 = Class17.method292(this.anInt203, this.aString7);
												this.aClass1_Sub1_Sub2_Sub2_1.aString26 = this.aString7;
												this.aClass1_Sub1_Sub2_Sub2_1.anInt713 = local1525;
												this.aClass1_Sub1_Sub2_Sub2_1.anInt714 = local1683;
												this.aClass1_Sub1_Sub2_Sub2_1.anInt712 = 150;
												this.method136(2, this.aClass1_Sub1_Sub2_Sub2_1.aString27, this.aClass1_Sub1_Sub2_Sub2_1.aString26);
												if (this.anInt143 == 2) {
													this.anInt143 = 1;
													this.aBoolean46 = true;
													this.aClass1_Sub3_Sub3_1.method323(173);
													this.aClass1_Sub3_Sub3_1.method324(this.anInt143);
													this.aClass1_Sub3_Sub3_1.method324(this.anInt135);
													this.aClass1_Sub3_Sub3_1.method324(this.anInt122);
												}
											}
											this.aString7 = "";
											this.aBoolean36 = true;
										}
									}
								}
							} while (local94 != 13 && local94 != 10);
							this.aBoolean20 = false;
							this.aBoolean36 = true;
							if (this.anInt103 == 1 && this.anInt167 < 100) {
								this.aString15 = Class35.method434(Class35.method433(this.aString15));
								if (this.aString15.length() > 0) {
									@Pc(938) boolean local938 = false;
									for (local309 = 0; local309 < this.anInt167; local309++) {
										if (this.aStringArray3[local309].equals(this.aString15)) {
											local938 = true;
											break;
										}
									}
									if (this.aString15.equals(this.aClass1_Sub1_Sub2_Sub2_1.aString27)) {
										local938 = true;
									}
									if (!local938) {
										this.aStringArray3[this.anInt167] = this.aString15;
										this.anIntArray62[this.anInt167] = 0;
										this.anInt167++;
										this.aBoolean21 = true;
										this.aClass1_Sub3_Sub3_1.method323(150);
										this.aClass1_Sub3_Sub3_1.method327(Class35.method430(this.aString15));
									}
								}
							}
							if (this.anInt103 == 2 && this.anInt167 > 0) {
								this.aString15 = Class35.method434(Class35.method433(this.aString15));
								if (this.aString15.length() > 0) {
									for (local231 = 0; local231 < this.anInt167; local231++) {
										if (this.aStringArray3[local231].equals(this.aString15)) {
											this.anInt167--;
											this.aBoolean21 = true;
											for (local309 = local231; local309 < this.anInt167; local309++) {
												this.aStringArray3[local309] = this.aStringArray3[local309 + 1];
												this.anIntArray62[local309] = this.anIntArray62[local309 + 1];
											}
											this.aClass1_Sub3_Sub3_1.method323(234);
											this.aClass1_Sub3_Sub3_1.method327(Class35.method430(this.aString15));
											break;
										}
									}
								}
							}
							if (this.anInt103 == 3 && this.aString15.length() > 0 && this.anInt117 >= 0 && this.anInt117 < this.anInt167) {
								this.aClass1_Sub3_Sub3_1.method323(12);
								this.aClass1_Sub3_Sub3_1.method324(0);
								local231 = this.aClass1_Sub3_Sub3_1.anInt394;
								this.aClass1_Sub3_Sub3_1.method327(Class35.method430(this.aStringArray3[this.anInt117]));
								Class36.method438(this.aClass1_Sub3_Sub3_1, this.aString15);
								this.aClass1_Sub3_Sub3_1.method330(this.aClass1_Sub3_Sub3_1.anInt394 - local231);
								this.aString15 = Class35.method435(this.aString15);
								this.aString15 = Class17.method292(this.anInt203, this.aString15);
								this.method136(6, this.aStringArray3[this.anInt117], this.aString15);
								if (this.anInt135 == 2) {
									this.anInt135 = 1;
									this.aBoolean46 = true;
									this.aClass1_Sub3_Sub3_1.method323(173);
									this.aClass1_Sub3_Sub3_1.method324(this.anInt143);
									this.aClass1_Sub3_Sub3_1.method324(this.anInt135);
									this.aClass1_Sub3_Sub3_1.method324(this.anInt122);
								}
							}
							if (this.anInt103 == 4 && this.anInt153 < 100 && this.aString15.length() > 0) {
								local1216 = Class35.method430(this.aString15);
								@Pc(1218) boolean local1218 = false;
								for (local324 = 0; local324 < this.anInt153; local324++) {
									if (this.aLongArray3[local324] == local1216) {
										local1218 = true;
										break;
									}
								}
								if (!local1218) {
									this.aLongArray3[this.anInt153++] = local1216;
									this.aBoolean21 = true;
									this.aClass1_Sub3_Sub3_1.method323(105);
									this.aClass1_Sub3_Sub3_1.method327(local1216);
								}
							}
						} while (this.anInt103 != 5);
					} while (this.anInt153 <= 0);
				} while (this.aString15.length() <= 0);
				local1216 = Class35.method430(this.aString15);
				for (local314 = 0; local314 < this.anInt153; local314++) {
					if (this.aLongArray3[local314] == local1216) {
						this.anInt153--;
						this.aBoolean21 = true;
						for (local324 = local314; local324 < this.anInt153; local324++) {
							this.aLongArray3[local324] = this.aLongArray3[local324 + 1];
						}
						this.aClass1_Sub3_Sub3_1.method323(92);
						this.aClass1_Sub3_Sub3_1.method327(local1216);
						break;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method90(@OriginalArg(0) boolean arg0) {
		@Pc(8) int local8 = this.aClass1_Sub1_Sub2_Sub2_1.anInt701 + this.anInt138;
		@Pc(15) int local15 = this.aClass1_Sub1_Sub2_Sub2_1.anInt702 + this.anInt144;
		if (this.anInt193 - local8 < -500 || this.anInt193 - local8 > 500 || this.anInt194 - local15 < -500 || this.anInt194 - local15 > 500) {
			this.anInt193 = local8;
			this.anInt194 = local15;
		}
		if (this.anInt193 != local8) {
			this.anInt193 += (local8 - this.anInt193) / 16;
		}
		if (this.anInt194 != local15) {
			this.anInt194 += (local15 - this.anInt194) / 16;
		}
		if (super.anIntArray17[1] == 1) {
			this.anInt195 += (-this.anInt195 - 24) / 2;
		} else if (super.anIntArray17[2] == 1) {
			this.anInt195 += (24 - this.anInt195) / 2;
		} else {
			this.anInt195 /= 2;
		}
		if (super.anIntArray17[3] == 1) {
			this.anInt196 += (12 - this.anInt196) / 2;
		} else if (super.anIntArray17[4] == 1) {
			this.anInt196 += (-this.anInt196 - 12) / 2;
		} else {
			this.anInt196 /= 2;
		}
		this.anInt128 = this.anInt128 + this.anInt195 / 2 & 0x7FF;
		if (arg0) {
			this.anInt106 = -1;
		}
		this.anInt126 += this.anInt196 / 2;
		this.anInt127 = this.anInt128 + this.anInt146 & 0x7FF;
		if (this.anInt126 < 128) {
			this.anInt126 = 128;
		}
		if (this.anInt126 > 383) {
			this.anInt126 = 383;
		}
		@Pc(216) int local216 = this.anInt193 >> 7;
		@Pc(221) int local221 = this.anInt194 >> 7;
		@Pc(231) int local231 = this.method94(this.anInt193, this.anInt194, this.anInt173);
		@Pc(233) int local233 = 0;
		@Pc(249) int local249;
		if (local216 > 3 && local221 > 3 && local216 < 100 && local221 < 100) {
			for (local249 = local216 - 4; local249 <= local216 + 4; local249++) {
				for (@Pc(255) int local255 = local221 - 4; local255 <= local221 + 4; local255++) {
					@Pc(260) int local260 = this.anInt173;
					if (local260 < 3 && (this.aByteArrayArrayArray7[1][local249][local255] & 0x2) == 2) {
						local260++;
					}
					@Pc(287) int local287 = local231 - this.anIntArrayArrayArray3[local260][local249][local255];
					if (local287 > local233) {
						local233 = local287;
					}
				}
			}
		}
		local249 = local233 * 192;
		if (local249 > 98048) {
			local249 = 98048;
		}
		if (local249 < 32768) {
			local249 = 32768;
		}
		if (local249 > this.anInt133) {
			this.anInt133 += (local249 - this.anInt133) / 24;
		} else if (local249 < this.anInt133) {
			this.anInt133 += (local249 - this.anInt133) / 80;
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method91(@OriginalArg(0) int arg0) {
		this.anInt105 += arg0;
		if (this.aBoolean43) {
			this.aBoolean43 = false;
			this.aClass27_19.method360(super.aGraphics2, 0, 11);
			this.aClass27_20.method360(super.aGraphics2, 0, 375);
			this.aClass27_21.method360(super.aGraphics2, 729, 5);
			this.aClass27_22.method360(super.aGraphics2, 752, 231);
			this.aClass27_23.method360(super.aGraphics2, 0, 0);
			this.aClass27_24.method360(super.aGraphics2, 561, 0);
			this.aClass27_25.method360(super.aGraphics2, 520, 11);
			this.aClass27_26.method360(super.aGraphics2, 520, 231);
			this.aClass27_27.method360(super.aGraphics2, 501, 375);
			this.aClass27_28.method360(super.aGraphics2, 0, 345);
			this.aBoolean21 = true;
			this.aBoolean36 = true;
			this.aBoolean34 = true;
			this.aBoolean46 = true;
			if (this.anInt86 != 2) {
				this.aClass27_14.method360(super.aGraphics2, 8, 11);
				this.aClass27_13.method360(super.aGraphics2, 561, 5);
			}
		}
		if (this.anInt86 == 2) {
			this.method92();
		}
		if (this.aBoolean45 && this.anInt148 == 1) {
			this.aBoolean21 = true;
		}
		@Pc(140) boolean local140;
		if (this.anInt100 != -1) {
			local140 = this.method129(this.anInt134, this.anInt100);
			if (local140) {
				this.aBoolean21 = true;
			}
		}
		if (this.anInt187 == 2) {
			this.aBoolean21 = true;
		}
		if (this.aBoolean21) {
			this.method139();
			this.aBoolean21 = false;
		}
		if (this.anInt190 == -1) {
			this.aClass7_1.anInt242 = this.anInt189 - this.anInt177 - 77;
			if (super.anInt78 > 453 && super.anInt78 < 565 && super.anInt79 > 350) {
				this.method122(0, 463, super.anInt78 - 22, 77, super.anInt79 - 375, this.aClass7_1, false, this.anInt189);
			}
			@Pc(215) int local215 = this.anInt189 - this.aClass7_1.anInt242 - 77;
			if (local215 < 0) {
				local215 = 0;
			}
			if (local215 > this.anInt189 - 77) {
				local215 = this.anInt189 - 77;
			}
			if (this.anInt177 != local215) {
				this.anInt177 = local215;
				this.aBoolean36 = true;
			}
		}
		if (this.anInt190 != -1) {
			local140 = this.method129(this.anInt134, this.anInt190);
			if (local140) {
				this.aBoolean36 = true;
			}
		}
		if (this.anInt187 == 3) {
			this.aBoolean36 = true;
		}
		if (this.aBoolean36) {
			this.method137(this.anInt124);
			this.aBoolean36 = false;
		}
		if (this.anInt86 == 2) {
			if (aBoolean23 && this.anInt195 == 0 && anInt85 - this.anInt192 > 25) {
				this.anInt192 = anInt85;
				this.anInt191 = 1 - this.anInt191;
				if (this.anInt191 == 0) {
					this.method134();
				} else {
					this.aClass27_13.method360(super.aGraphics2, 561, 5);
				}
			}
			if (!aBoolean23) {
				this.method134();
				this.aClass27_13.method360(super.aGraphics2, 561, 5);
			}
		}
		if (this.aBoolean34) {
			this.aBoolean34 = false;
			this.aClass27_18.method359();
			this.aClass1_Sub3_Sub2_Sub3_8.method260(0, 0);
			if (this.anInt100 == -1) {
				if (this.anInt104 == 0) {
					this.aClass1_Sub3_Sub2_Sub3_18.method260(29, 30);
				}
				if (this.anInt104 == 1) {
					this.aClass1_Sub3_Sub2_Sub3_19.method260(59, 29);
				}
				if (this.anInt104 == 2) {
					this.aClass1_Sub3_Sub2_Sub3_19.method260(87, 29);
				}
				if (this.anInt104 == 3) {
					this.aClass1_Sub3_Sub2_Sub3_20.method260(115, 29);
				}
				if (this.anInt104 == 4) {
					this.aClass1_Sub3_Sub2_Sub3_22.method260(156, 29);
				}
				if (this.anInt104 == 5) {
					this.aClass1_Sub3_Sub2_Sub3_22.method260(184, 29);
				}
				if (this.anInt104 == 6) {
					this.aClass1_Sub3_Sub2_Sub3_21.method260(212, 30);
				}
				this.aClass1_Sub3_Sub2_Sub3_16.method260(39, 33);
			}
			this.aClass27_18.method360(super.aGraphics2, 520, 165);
			this.aClass27_17.method359();
			this.aClass1_Sub3_Sub2_Sub3_7.method260(0, 0);
			if (this.anInt100 == -1) {
				if (this.anInt104 == 7) {
					this.aClass1_Sub3_Sub2_Sub3_11.method260(49, 0);
				}
				if (this.anInt104 == 8) {
					this.aClass1_Sub3_Sub2_Sub3_12.method260(81, 0);
				}
				if (this.anInt104 == 9) {
					this.aClass1_Sub3_Sub2_Sub3_12.method260(108, 0);
				}
				if (this.anInt104 == 10) {
					this.aClass1_Sub3_Sub2_Sub3_13.method260(136, 1);
				}
				if (this.anInt104 == 11) {
					this.aClass1_Sub3_Sub2_Sub3_15.method260(178, 0);
				}
				if (this.anInt104 == 12) {
					this.aClass1_Sub3_Sub2_Sub3_15.method260(205, 0);
				}
				if (this.anInt104 == 13) {
					this.aClass1_Sub3_Sub2_Sub3_14.method260(233, 0);
				}
				this.aClass1_Sub3_Sub2_Sub3_17.method260(83, 4);
			}
			this.aClass27_17.method360(super.aGraphics2, 501, 492);
			this.aClass27_14.method359();
		}
		if (this.aBoolean46) {
			this.aBoolean46 = false;
			this.aClass27_16.method359();
			this.aClass1_Sub3_Sub2_Sub3_6.method260(0, 0);
			this.aClass1_Sub3_Sub2_Sub4_2.method275(57, "Public chat", 33, this.anInt175, 16777215, true);
			if (this.anInt143 == 0) {
				this.aClass1_Sub3_Sub2_Sub4_2.method275(57, "On", 46, this.anInt175, 65280, true);
			}
			if (this.anInt143 == 1) {
				this.aClass1_Sub3_Sub2_Sub4_2.method275(57, "Friends", 46, this.anInt175, 16776960, true);
			}
			if (this.anInt143 == 2) {
				this.aClass1_Sub3_Sub2_Sub4_2.method275(57, "Off", 46, this.anInt175, 16711680, true);
			}
			this.aClass1_Sub3_Sub2_Sub4_2.method275(186, "Private chat", 33, this.anInt175, 16777215, true);
			if (this.anInt135 == 0) {
				this.aClass1_Sub3_Sub2_Sub4_2.method275(186, "On", 46, this.anInt175, 65280, true);
			}
			if (this.anInt135 == 1) {
				this.aClass1_Sub3_Sub2_Sub4_2.method275(186, "Friends", 46, this.anInt175, 16776960, true);
			}
			if (this.anInt135 == 2) {
				this.aClass1_Sub3_Sub2_Sub4_2.method275(186, "Off", 46, this.anInt175, 16711680, true);
			}
			this.aClass1_Sub3_Sub2_Sub4_2.method275(326, "Trade/duel", 33, this.anInt175, 16777215, true);
			if (this.anInt122 == 0) {
				this.aClass1_Sub3_Sub2_Sub4_2.method275(326, "On", 46, this.anInt175, 65280, true);
			}
			if (this.anInt122 == 1) {
				this.aClass1_Sub3_Sub2_Sub4_2.method275(326, "Friends", 46, this.anInt175, 16776960, true);
			}
			if (this.anInt122 == 2) {
				this.aClass1_Sub3_Sub2_Sub4_2.method275(326, "Off", 46, this.anInt175, 16711680, true);
			}
			this.aClass27_16.method360(super.aGraphics2, 0, 471);
			this.aClass27_14.method359();
		}
		this.anInt134 = 0;
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method92() {
		this.anInt202++;
		@Pc(72) int local72;
		@Pc(77) int local77;
		for (@Pc(9) int local9 = -1; local9 < this.anInt121; local9++) {
			@Pc(17) Class1_Sub1_Sub2_Sub2 local17;
			@Pc(22) int local22;
			if (local9 == -1) {
				local17 = this.aClass1_Sub1_Sub2_Sub2_1;
				local22 = this.anInt120 << 14;
			} else {
				local17 = this.aClass1_Sub1_Sub2_Sub2Array1[this.anIntArray31[local9]];
				local22 = this.anIntArray31[local9] << 14;
			}
			local17.aBoolean130 = false;
			if ((aBoolean23 && this.anInt121 > 50 || this.anInt121 > 200) && local9 != -1 && local17.anInt723 == local17.anInt710) {
				local17.aBoolean130 = true;
			}
			if (local17.method468()) {
				local72 = local17.anInt701 >> 7;
				local77 = local17.anInt702 >> 7;
				if (local72 >= 0 && local72 < 104 && local77 >= 0 && local77 < 104) {
					if (local17.aClass1_Sub3_Sub1_9 == null || anInt85 < local17.anInt754 || anInt85 >= local17.anInt755) {
						if ((local17.anInt701 & 0x7F) == 64 && (local17.anInt702 & 0x7F) == 64) {
							if (this.anIntArrayArray6[local72][local77] == this.anInt202) {
								continue;
							}
							this.anIntArrayArray6[local72][local77] = this.anInt202;
						}
						local17.anInt753 = this.method94(local17.anInt701, local17.anInt702, this.anInt173);
						this.aClass28_1.method374(local17.anInt703, local17, local22, local17.anInt753, local17.anInt701, this.anInt173, local17.anInt704, 60, local17.anInt702, null);
					} else {
						local17.aBoolean130 = false;
						local17.anInt753 = this.method94(local17.anInt701, local17.anInt702, this.anInt173);
						this.aClass28_1.method375(local17.anInt759, local17.anInt760, local17.anInt753, local17.anInt762, this.anInt173, local17.anInt701, null, local17.anInt702, local17.anInt703, local17.anInt761, local22, local17);
					}
				}
			}
		}
		@Pc(242) int local242;
		for (@Pc(209) int local209 = 0; local209 < this.anInt201; local209++) {
			@Pc(219) Class1_Sub1_Sub2_Sub1 local219 = this.aClass1_Sub1_Sub2_Sub1Array1[this.anIntArray60[local209]];
			local72 = (this.anIntArray60[local209] << 14) + 536870912;
			if (local219.method454()) {
				local77 = local219.anInt701 >> 7;
				local242 = local219.anInt702 >> 7;
				if (local77 >= 0 && local77 < 104 && local242 >= 0 && local242 < 104) {
					if (local219.anInt705 == 1 && (local219.anInt701 & 0x7F) == 64 && (local219.anInt702 & 0x7F) == 64) {
						if (this.anIntArrayArray6[local77][local242] == this.anInt202) {
							continue;
						}
						this.anIntArrayArray6[local77][local242] = this.anInt202;
					}
					this.aClass28_1.method374(local219.anInt703, local219, local72, this.method94(local219.anInt701, local219.anInt702, this.anInt173), local219.anInt701, this.anInt173, local219.anInt704, (local219.anInt705 - 1) * 64 + 60, local219.anInt702, null);
				}
			}
		}
		for (@Pc(330) Class1_Sub1_Sub3 local330 = (Class1_Sub1_Sub3) this.aClass23_5.method352(); local330 != null; local330 = (Class1_Sub1_Sub3) this.aClass23_5.method354()) {
			if (local330.anInt786 != this.anInt173 || anInt85 > local330.anInt792) {
				local330.method478();
			} else if (anInt85 >= local330.anInt791) {
				if (local330.anInt795 > 0) {
					@Pc(360) Class1_Sub1_Sub2_Sub1 local360 = this.aClass1_Sub1_Sub2_Sub1Array1[local330.anInt795 - 1];
					if (local360 != null) {
						local330.method480(local360.anInt702, this.method94(local360.anInt701, local360.anInt702, local330.anInt786) - local330.anInt790, local360.anInt701, this.anInt92, anInt85);
					}
				}
				if (local330.anInt795 < 0) {
					local77 = -local330.anInt795 - 1;
					@Pc(399) Class1_Sub1_Sub2_Sub2 local399;
					if (local77 == this.anInt98) {
						local399 = this.aClass1_Sub1_Sub2_Sub2_1;
					} else {
						local399 = this.aClass1_Sub1_Sub2_Sub2Array1[local77];
					}
					if (local399 != null) {
						local330.method480(local399.anInt702, this.method94(local399.anInt701, local399.anInt702, local330.anInt786) - local330.anInt790, local399.anInt701, this.anInt92, anInt85);
					}
				}
				local330.method481(this.anInt134);
				this.aClass28_1.method374(local330.anInt796, local330, -1, (int) local330.aDouble3, (int) local330.aDouble1, this.anInt173, 0, 60, (int) local330.aDouble2, null);
			}
		}
		for (@Pc(470) Class1_Sub1_Sub1 local470 = (Class1_Sub1_Sub1) this.aClass23_1.method352(); local470 != null; local470 = (Class1_Sub1_Sub1) this.aClass23_1.method354()) {
			if (local470.anInt25 != this.anInt173 || local470.aBoolean4) {
				local470.method478();
			} else if (anInt85 >= local470.anInt24) {
				local470.method19(this.anInt134);
				if (local470.aBoolean4) {
					local470.method478();
				} else {
					this.aClass28_1.method374(0, local470, -1, local470.anInt28, local470.anInt26, local470.anInt25, 0, 60, local470.anInt27, null);
				}
			}
		}
		@Pc(617) int local617;
		@Pc(666) int local666;
		@Pc(694) int local694;
		for (@Pc(532) Class1_Sub6 local532 = (Class1_Sub6) this.aClass23_3.method352(); local532 != null; local532 = (Class1_Sub6) this.aClass23_3.method354()) {
			@Pc(536) boolean local536 = false;
			local532.anInt464 += this.anInt134;
			if (local532.anInt463 == -1) {
				local532.anInt463 = 0;
				local536 = true;
			}
			label438: {
				do {
					do {
						if (local532.anInt464 <= local532.aClass11_2.anIntArray126[local532.anInt463]) {
							break label438;
						}
						local532.anInt464 -= local532.aClass11_2.anIntArray126[local532.anInt463] + 1;
						local532.anInt463++;
						local536 = true;
					} while (local532.anInt463 < local532.aClass11_2.anInt294);
					local532.anInt463 -= local532.aClass11_2.anInt295;
				} while (local532.anInt463 >= 0 && local532.anInt463 < local532.aClass11_2.anInt294);
				local532.method478();
				local536 = false;
			}
			if (local536) {
				local617 = 0;
				if (local532.anInt459 == 1) {
					local617 = this.aClass28_1.method387(local532.anInt458, local532.anInt461, local532.anInt460);
				}
				if (local532.anInt459 == 2) {
					local617 = this.aClass28_1.method388(local532.anInt458, local532.anInt460, local532.anInt461);
				}
				if (local617 != 0 && (local617 >> 14 & 0x7FFF) == local532.anInt462) {
					@Pc(664) Class37 local664 = Class37.method445(local532.anInt462);
					local666 = -1;
					if (local532.anInt463 != -1) {
						local666 = local532.aClass11_2.anIntArray124[local532.anInt463];
					}
					if (local532.anInt459 == 2) {
						local694 = this.aClass28_1.method390(local532.anInt458, local532.anInt460, local532.anInt461, local617) >> 6;
						@Pc(704) Class1_Sub3_Sub1 local704 = local664.method448(10, local694, 0, 0, 0, 0, local666);
						this.aClass28_1.method379(local532.anInt458, local532.anInt460, local532.anInt461, local704);
					} else if (local532.anInt459 == 1) {
						@Pc(731) Class1_Sub3_Sub1 local731 = local664.method448(4, 0, 0, 0, 0, 0, local666);
						this.aClass28_1.method380(local731, local532.anInt460, local532.anInt458, local532.anInt461);
					}
				} else {
					local532.method478();
				}
			}
		}
		local242 = this.method94(this.anInt193, this.anInt194, this.anInt173);
		this.anInt132 = this.anInt126;
		if (this.anInt133 / 256 > this.anInt132) {
			this.anInt132 = this.anInt133 / 256;
		}
		this.method95(this.anInt194, this.anInt193, this.anInt127, local242 - 50, this.anInt132, this.anInt132 * 3 + 600);
		local617 = 3;
		@Pc(847) int local847;
		@Pc(860) int local860;
		@Pc(875) int local875;
		@Pc(808) int local808;
		@Pc(825) int local825;
		if (this.anInt132 < 310) {
			local808 = this.anInt129 >> 7;
			local666 = this.anInt131 >> 7;
			local694 = this.aClass1_Sub1_Sub2_Sub2_1.anInt701 >> 7;
			local825 = this.aClass1_Sub1_Sub2_Sub2_1.anInt702 >> 7;
			if ((this.aByteArrayArrayArray7[this.anInt173][local808][local666] & 0x4) != 0) {
				local617 = this.anInt173;
			}
			if (local694 > local808) {
				local847 = local694 - local808;
			} else {
				local847 = local808 - local694;
			}
			if (local825 > local666) {
				local860 = local825 - local666;
			} else {
				local860 = local666 - local825;
			}
			@Pc(877) int local877;
			if (local847 > local860) {
				local875 = local860 * 65536 / local847;
				local877 = 32768;
				while (local808 != local694) {
					if (local808 < local694) {
						local808++;
					} else if (local808 > local694) {
						local808--;
					}
					if ((this.aByteArrayArrayArray7[this.anInt173][local808][local666] & 0x4) != 0) {
						local617 = this.anInt173;
					}
					local877 += local875;
					if (local877 >= 65536) {
						local877 -= 65536;
						if (local666 < local825) {
							local666++;
						} else if (local666 > local825) {
							local666--;
						}
						if ((this.aByteArrayArrayArray7[this.anInt173][local808][local666] & 0x4) != 0) {
							local617 = this.anInt173;
						}
					}
				}
			} else {
				local875 = local847 * 65536 / local860;
				local877 = 32768;
				while (local666 != local825) {
					if (local666 < local825) {
						local666++;
					} else if (local666 > local825) {
						local666--;
					}
					if ((this.aByteArrayArrayArray7[this.anInt173][local808][local666] & 0x4) != 0) {
						local617 = this.anInt173;
					}
					local877 += local875;
					if (local877 >= 65536) {
						local877 -= 65536;
						if (local808 < local694) {
							local808++;
						} else if (local808 > local694) {
							local808--;
						}
						if ((this.aByteArrayArrayArray7[this.anInt173][local808][local666] & 0x4) != 0) {
							local617 = this.anInt173;
						}
					}
				}
			}
		}
		if ((this.aByteArrayArrayArray7[this.anInt173][this.aClass1_Sub1_Sub2_Sub2_1.anInt701 >> 7][this.aClass1_Sub1_Sub2_Sub2_1.anInt702 >> 7] & 0x4) != 0) {
			local617 = this.anInt173;
		}
		local808 = Class1_Sub3_Sub2_Sub1.anInt291;
		Class1_Sub3_Sub1.aBoolean55 = true;
		Class1_Sub3_Sub1.anInt230 = 0;
		Class1_Sub3_Sub1.anInt228 = super.anInt78 - 8;
		Class1_Sub3_Sub1.anInt229 = super.anInt79 - 11;
		Class1_Sub3_Sub2.method269();
		this.aClass28_1.method399(this.anInt129, this.anInt130, this.anInt131, this.anInt132, this.anInt127, local617);
		this.aClass28_1.method377();
		for (local666 = -1; local666 < this.anInt121 + this.anInt201; local666++) {
			@Pc(1092) Class1_Sub1_Sub2 local1092;
			if (local666 == -1) {
				local1092 = this.aClass1_Sub1_Sub2_Sub2_1;
			} else if (local666 < this.anInt121) {
				local1092 = this.aClass1_Sub1_Sub2_Sub2Array1[this.anIntArray31[local666]];
			} else {
				local1092 = this.aClass1_Sub1_Sub2_Sub1Array1[this.anIntArray60[local666 - this.anInt121]];
			}
			if (local666 < this.anInt121) {
				@Pc(1126) Class1_Sub1_Sub2_Sub2 local1126 = (Class1_Sub1_Sub2_Sub2) local1092;
				if (local1126.anInt751 != 0) {
					this.method93(local1092.anInt743 + 15, local1092);
					if (this.anInt90 > -1) {
						local847 = 28;
						for (local860 = 0; local860 < 8; local860++) {
							if ((local1126.anInt751 & 0x1 << local860) != 0) {
								this.aClass1_Sub3_Sub2_Sub2Array3[local860].method236(this.anInt90 - 12, this.anInt91 - local847);
								local847 -= 25;
							}
						}
					}
				}
			}
			if (local1092.aString26 != null && (local666 >= this.anInt121 || this.anInt143 == 0 || this.anInt143 == 1 && this.method138(((Class1_Sub1_Sub2_Sub2) local1092).aString27))) {
				this.method93(local1092.anInt743, local1092);
				if (this.anInt90 > -1) {
					if (this.anInt109 == 0) {
						local825 = 16776960;
						if (local1092.anInt713 < 6) {
							local825 = this.anIntArray45[local1092.anInt713];
						}
						if (local1092.anInt713 == 6) {
							local825 = this.anInt202 % 20 < 10 ? 16711680 : 16776960;
						}
						if (local1092.anInt713 == 7) {
							local825 = this.anInt202 % 20 < 10 ? 255 : 65535;
						}
						if (local1092.anInt713 == 8) {
							local825 = this.anInt202 % 20 < 10 ? 45056 : 8454016;
						}
						if (local1092.anInt713 == 9) {
							local847 = 150 - local1092.anInt712;
							if (local847 < 50) {
								local825 = local847 * 1280 + 16711680;
							} else if (local847 < 100) {
								local825 = 16776960 - (local847 - 50) * 327680;
							} else if (local847 < 150) {
								local825 = (local847 - 100) * 5 + 65280;
							}
						}
						if (local1092.anInt713 == 10) {
							local847 = 150 - local1092.anInt712;
							if (local847 < 50) {
								local825 = local847 * 5 + 16711680;
							} else if (local847 < 100) {
								local825 = 16711935 - (local847 - 50) * 327680;
							} else if (local847 < 150) {
								local825 = (local847 - 100) * 327680 + 255 - (local847 - 100) * 5;
							}
						}
						if (local1092.anInt713 == 11) {
							local847 = 150 - local1092.anInt712;
							if (local847 < 50) {
								local825 = 16777215 - local847 * 327685;
							} else if (local847 < 100) {
								local825 = (local847 - 50) * 327685 + 65280;
							} else if (local847 < 150) {
								local825 = 16777215 - (local847 - 100) * 327680;
							}
						}
						if (local1092.anInt714 == 0) {
							this.aClass1_Sub3_Sub2_Sub4_3.method274(this.anInt91 + 1, this.aBoolean44, this.anInt90, 0, local1092.aString26);
							this.aClass1_Sub3_Sub2_Sub4_3.method274(this.anInt91, this.aBoolean44, this.anInt90, local825, local1092.aString26);
						}
						if (local1092.anInt714 == 1) {
							this.aClass1_Sub3_Sub2_Sub4_3.method278(this.anInt90, 0, this.anInt202, this.anInt91 + 1, local1092.aString26);
							this.aClass1_Sub3_Sub2_Sub4_3.method278(this.anInt90, local825, this.anInt202, this.anInt91, local1092.aString26);
						}
						if (local1092.anInt714 == 2) {
							local847 = this.aClass1_Sub3_Sub2_Sub4_3.method276(local1092.aString26);
							local860 = (150 - local1092.anInt712) * (local847 + 100) / 150;
							Class1_Sub3_Sub2.method268(this.anInt90 + 50, this.aByte8, this.anInt90 - 50, 0, 334);
							this.aClass1_Sub3_Sub2_Sub4_3.method277(local1092.aString26, this.anInt90 + 50 - local860, this.anInt91 + 1, 0);
							this.aClass1_Sub3_Sub2_Sub4_3.method277(local1092.aString26, this.anInt90 + 50 - local860, this.anInt91, local825);
							Class1_Sub3_Sub2.method267();
						}
					} else {
						this.aClass1_Sub3_Sub2_Sub4_3.method274(this.anInt91 + 1, this.aBoolean44, this.anInt90, 0, local1092.aString26);
						this.aClass1_Sub3_Sub2_Sub4_3.method274(this.anInt91, this.aBoolean44, this.anInt90, 16776960, local1092.aString26);
					}
				}
			}
			if (local1092.anInt717 > anInt85 + 100) {
				this.method93(local1092.anInt743 + 15, local1092);
				if (this.anInt90 > -1) {
					local825 = local1092.anInt718 * 30 / local1092.anInt719;
					if (local825 > 30) {
						local825 = 30;
					}
					Class1_Sub3_Sub2.method270(65280, local825, this.anInt91 - 3, 5, this.anInt90 - 15);
					Class1_Sub3_Sub2.method270(16711680, 30 - local825, this.anInt91 - 3, 5, this.anInt90 + local825 - 15);
				}
			}
			if (local1092.anInt717 > anInt85 + 330) {
				this.method93(local1092.anInt743 / 2, local1092);
				if (this.anInt90 > -1) {
					this.aClass1_Sub3_Sub2_Sub2Array4[local1092.anInt716].method236(this.anInt90 - 12, this.anInt91 - 12);
					this.aClass1_Sub3_Sub2_Sub4_1.method274(this.anInt91 + 4, this.aBoolean44, this.anInt90, 0, String.valueOf(local1092.anInt715));
					this.aClass1_Sub3_Sub2_Sub4_1.method274(this.anInt91 + 3, this.aBoolean44, this.anInt90 - 1, 16777215, String.valueOf(local1092.anInt715));
				}
			}
		}
		if (this.anInt165 == 1) {
			this.aClass1_Sub3_Sub2_Sub2Array7[this.anInt164 / 100].method236(this.anInt162 - 8 - 8, this.anInt163 - 8 - 11);
		}
		if (this.anInt165 == 2) {
			this.aClass1_Sub3_Sub2_Sub2Array7[this.anInt164 / 100 + 4].method236(this.anInt162 - 8 - 8, this.anInt163 - 8 - 11);
		}
		if (this.anInt101 != -1) {
			this.method121(0, Class7.aClass7Array1[this.anInt101], 0, 0);
		}
		local694 = (this.aClass1_Sub1_Sub2_Sub2_1.anInt701 >> 7) + this.anInt197;
		local825 = (this.aClass1_Sub1_Sub2_Sub2_1.anInt702 >> 7) + this.anInt198;
		if (local694 >= 2944 && local694 < 3392 && local825 >= 3520 && local825 < 6400) {
			this.anInt116 = (local825 - 3520) / 8 + 1;
		} else {
			this.anInt116 = 0;
		}
		if (!this.aBoolean45) {
			this.method116();
			this.method112();
		} else if (this.anInt148 == 0) {
			this.method113();
		}
		if (!aBoolean23 && Class1_Sub3_Sub2_Sub1.anIntArray122[17] >= local808) {
			@Pc(1829) Class1_Sub3_Sub2_Sub3 local1829 = Class1_Sub3_Sub2_Sub1.aClass1_Sub3_Sub2_Sub3Array3[17];
			local860 = local1829.anInt349 * local1829.anInt350 - 1;
			local875 = local1829.anInt349 * this.anInt134 * 2;
			@Pc(1848) byte[] local1848 = local1829.aByteArray3;
			@Pc(1851) byte[] local1851 = this.aByteArray1;
			for (@Pc(1853) int local1853 = 0; local1853 <= local860; local1853++) {
				local1851[local1853] = local1848[local1853 - local875 & local860];
			}
			local1829.aByteArray3 = local1851;
			this.aByteArray1 = local1848;
			Class1_Sub3_Sub2_Sub1.method211(17);
		}
		if (this.anInt123 == 1) {
			this.aClass1_Sub3_Sub2_Sub2Array3[1].method236(5, 296);
		}
		if (this.anInt116 > 0) {
			this.aClass1_Sub3_Sub2_Sub2Array3[0].method236(472, 296);
			this.aClass1_Sub3_Sub2_Sub4_2.method274(329, this.aBoolean44, 484, 16776960, "Level: " + this.anInt116);
		} else if (aBoolean23) {
			@Pc(1925) Runtime local1925 = Runtime.getRuntime();
			@Pc(1928) long local1928 = local1925.totalMemory();
			@Pc(1931) long local1931 = local1925.freeMemory();
			if (!signlink.sunjava && local1928 - local1931 > 33554432L && anInt85 > anInt182 + 500) {
				this.method86();
				local1925.gc();
				anInt182 = anInt85;
			}
		}
		if (this.anInt118 != 0) {
			local847 = this.anInt118 / 50;
			local860 = local847 / 60;
			local847 %= 60;
			if (local847 < 10) {
				this.aClass1_Sub3_Sub2_Sub4_2.method274(329, this.aBoolean44, 256, 16776960, "System update in: " + local860 + ":0" + local847);
			} else {
				this.aClass1_Sub3_Sub2_Sub4_2.method274(329, this.aBoolean44, 256, 16776960, "System update in: " + local860 + ":" + local847);
			}
		}
		this.aClass27_14.method360(super.aGraphics2, 8, 11);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!w;)V")
	private void method93(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub2 arg1) {
		@Pc(2) int local2 = arg1.anInt701;
		@Pc(5) int local5 = arg1.anInt702;
		@Pc(17) int local17 = this.method94(arg1.anInt701, arg1.anInt702, this.anInt173) - arg0;
		this.anInt132 = this.anInt126;
		if (this.anInt133 / 256 > this.anInt132) {
			this.anInt132 = this.anInt133 / 256;
		}
		local2 -= this.anInt129;
		local17 -= this.anInt130;
		local5 -= this.anInt131;
		@Pc(60) int local60 = Class1_Sub3_Sub1.anIntArray96[this.anInt132];
		@Pc(65) int local65 = Class1_Sub3_Sub1.anIntArray97[this.anInt132];
		@Pc(70) int local70 = Class1_Sub3_Sub1.anIntArray96[this.anInt127];
		@Pc(75) int local75 = Class1_Sub3_Sub1.anIntArray97[this.anInt127];
		@Pc(85) int local85 = local5 * local70 + local2 * local75 >> 16;
		local5 = local5 * local75 - local2 * local70 >> 16;
		local2 = local85;
		@Pc(107) int local107 = local17 * local65 - local5 * local60 >> 16;
		local5 = local17 * local60 + local5 * local65 >> 16;
		if (local5 >= 50) {
			this.anInt90 = Class1_Sub3_Sub2_Sub1.anInt287 + (local2 << 9) / local5;
			this.anInt91 = Class1_Sub3_Sub2_Sub1.anInt288 + (local107 << 9) / local5;
		} else {
			this.anInt90 = -1;
			this.anInt91 = -1;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBII)I")
	private int method94(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 >> 7;
		@Pc(7) int local7 = arg1 >> 7;
		@Pc(9) int local9 = arg2;
		if (arg2 < 3 && (this.aByteArrayArrayArray7[1][local3][local7] & 0x2) == 2) {
			local9 = arg2 + 1;
		}
		@Pc(29) int local29 = arg0 & 0x7F;
		@Pc(33) int local33 = arg1 & 0x7F;
		@Pc(61) int local61 = this.anIntArrayArrayArray3[local9][local3][local7] * (128 - local29) + this.anIntArrayArrayArray3[local9][local3 + 1][local7] * local29 >> 7;
		@Pc(93) int local93 = this.anIntArrayArrayArray3[local9][local3][local7 + 1] * (128 - local29) + this.anIntArrayArrayArray3[local9][local3 + 1][local7 + 1] * local29 >> 7;
		return local61 * (128 - local33) + local93 * local33 >> 7;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method95(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) int local5 = 2048 - arg4 & 0x7FF;
		@Pc(11) int local11 = 2048 - arg2 & 0x7FF;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg5;
		@Pc(23) int local23;
		@Pc(27) int local27;
		@Pc(37) int local37;
		if (local5 != 0) {
			local23 = Class1_Sub3_Sub1.anIntArray96[local5];
			local27 = Class1_Sub3_Sub1.anIntArray97[local5];
			local37 = local27 * 0 - arg5 * local23 >> 16;
			local17 = local23 * 0 + arg5 * local27 >> 16;
			local15 = local37;
		}
		if (local11 != 0) {
			local23 = Class1_Sub3_Sub1.anIntArray96[local11];
			local27 = Class1_Sub3_Sub1.anIntArray97[local11];
			local37 = local17 * local23 + local27 * 0 >> 16;
			local17 = local17 * local27 - local23 * 0 >> 16;
			local13 = local37;
		}
		this.anInt129 = arg1 - local13;
		this.anInt130 = arg3 - local15;
		this.anInt131 = arg0 - local17;
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method96(@OriginalArg(0) byte arg0) {
		try {
			this.anInt179 = -1;
			this.aClass23_4.method356();
			this.aClass23_3.method356();
			this.aClass23_1.method356();
			this.aClass23_5.method356();
			Class1_Sub3_Sub2_Sub1.method207();
			this.method86();
			this.aClass28_1.method363();
			for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
				this.aClass2Array1[local27].method20();
			}
			System.gc();
			@Pc(51) Class4 local51 = new Class4(this.aByteArrayArrayArray7, this.anIntArrayArrayArray3, 104, 104, 8);
			@Pc(54) byte[] local54 = new byte[100000];
			@Pc(58) int local58 = this.aByteArrayArray1.length;
			if (aBoolean23) {
				this.aClass28_1.method364(this.anInt173);
			} else {
				this.aClass28_1.method364(0);
			}
			@Pc(89) int local89;
			@Pc(101) int local101;
			@Pc(115) int local115;
			for (@Pc(75) int local75 = 0; local75 < local58; local75++) {
				local89 = (this.anIntArray27[local75] >> 8) * 64 - this.anInt197;
				local101 = (this.anIntArray27[local75] & 0xFF) * 64 - this.anInt198;
				@Pc(106) byte[] local106 = this.aByteArrayArray1[local75];
				if (local106 != null) {
					local115 = (new Class1_Sub3_Sub3(local106, (byte) 63)).method336();
					Class29.method411(local54, local115, local106, local106.length - 4, 4);
					local51.method37(local54, (this.anInt94 - 6) * 8, local101, local89, (this.anInt95 - 6) * 8);
				} else if (this.anInt95 < 800) {
					local51.method36(local101, local89);
				}
			}
			@Pc(178) int local178;
			for (local89 = 0; local89 < local58; local89++) {
				@Pc(169) byte[] local169 = this.aByteArrayArray2[local89];
				if (local169 != null) {
					local178 = (new Class1_Sub3_Sub3(local169, (byte) 63)).method336();
					Class29.method411(local54, local178, local169, local169.length - 4, 4);
					local115 = (this.anIntArray27[local89] >> 8) * 64 - this.anInt197;
					@Pc(212) int local212 = (this.anIntArray27[local89] & 0xFF) * 64 - this.anInt198;
					local51.method38(local54, this.aClass23_3, this.aClass2Array1, this.aClass28_1, local212, local115);
				}
			}
			local51.method40(this.aClass2Array1, this.aClass28_1);
			this.aClass27_14.method359();
			for (local101 = 0; local101 < 104; local101++) {
				for (local178 = 0; local178 < 104; local178++) {
					this.method109(local101, local178);
				}
			}
			for (@Pc(264) Class1_Sub4 local264 = (Class1_Sub4) this.aClass23_2.method352(); local264 != null; local264 = (Class1_Sub4) this.aClass23_2.method354()) {
				this.method107(local264.anInt416, local264.anInt422, local264.anInt419, local264.anInt418, local264.anInt417, local264.anInt421, local264.anInt420);
			}
		} catch (@Pc(293) Exception local293) {
		}
		Class37.aClass30_4.method421();
		System.gc();
		Class1_Sub3_Sub2_Sub1.method208();
		if (arg0 != 5) {
			this.anInt106 = -1;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method97(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int[] local5 = this.aClass1_Sub3_Sub2_Sub2_9.anIntArray129;
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
					this.aClass28_1.method395(local5, local34, arg0, local36, local22);
				}
				if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local36][local22] & 0x8) != 0) {
					this.aClass28_1.method395(local5, local34, arg0 + 1, local36, local22);
				}
				local34 += 4;
			}
		}
		this.aClass1_Sub3_Sub2_Sub2_9.method233();
		for (local34 = 1; local34 < 103; local34++) {
			for (local36 = 1; local36 < 103; local36++) {
				if ((this.aByteArrayArrayArray7[arg0][local36][local34] & 0x18) == 0) {
					this.method98(local36, local34, arg0);
				}
				if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local36][local34] & 0x8) != 0) {
					this.method98(local36, local34, arg0 + 1);
				}
			}
		}
		this.aClass27_14.method359();
		if (arg1 >= 0) {
			this.aBoolean26 = !this.aBoolean26;
		}
		this.anInt93 = 0;
		for (local36 = 0; local36 < 104; local36++) {
			for (@Pc(178) int local178 = 0; local178 < 104; local178++) {
				@Pc(188) int local188 = this.aClass28_1.method389(this.anInt173, local36, local178);
				if (local188 != 0) {
					local188 = local188 >> 14 & 0x7FFF;
					@Pc(200) int local200 = Class37.method445(local188).anInt628;
					if (local200 >= 0) {
						this.aClass1_Sub3_Sub2_Sub2Array6[this.anInt93] = this.aClass1_Sub3_Sub2_Sub2Array5[local200];
						this.anIntArray25[this.anInt93] = local36;
						this.anIntArray26[this.anInt93] = local178;
						this.anInt93++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIII)V")
	private void method98(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.aClass28_1.method386(arg2, arg0, arg1);
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(30) int local30;
		@Pc(38) int[] local38;
		@Pc(52) int local52;
		if (local8 != 0) {
			local18 = this.aClass28_1.method390(arg2, arg0, arg1, local8);
			local24 = local18 >> 6 & 0x3;
			local28 = local18 & 0x1F;
			local30 = 15658734;
			if (local8 > 0) {
				local30 = 15597568;
			}
			local38 = this.aClass1_Sub3_Sub2_Sub2_9.anIntArray129;
			local52 = arg0 * 4 + (103 - arg1) * 512 * 4 + 24624;
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
		}
		local8 = this.aClass28_1.method388(arg2, arg0, arg1);
		if (local8 == 0) {
			return;
		}
		local18 = this.aClass28_1.method390(arg2, arg0, arg1, local8);
		local24 = local18 >> 6 & 0x3;
		local28 = local18 & 0x1F;
		if (local28 == 9) {
			local30 = 15658734;
			if (local8 > 0) {
				local30 = 15597568;
			}
			local38 = this.aClass1_Sub3_Sub2_Sub2_9.anIntArray129;
			local52 = arg0 * 4 + (103 - arg1) * 512 * 4 + 24624;
			if (local24 == 0 || local24 == 2) {
				local38[local52 + 1536] = local30;
				local38[local52 + 1024 + 1] = local30;
				local38[local52 + 512 + 2] = local30;
				local38[local52 + 3] = local30;
			} else {
				local38[local52] = local30;
				local38[local52 + 512 + 1] = local30;
				local38[local52 + 1024 + 2] = local30;
				local38[local52 + 1536 + 3] = local30;
			}
		}
		if (local28 != 10 && local28 != 11) {
			return;
		}
		local30 = local8 >> 14 & 0x7FFF;
		@Pc(481) Class37 local481 = Class37.method445(local30);
		if (local481.anInt629 != -1) {
			@Pc(491) Class1_Sub3_Sub2_Sub3 local491 = this.aClass1_Sub3_Sub2_Sub3Array2[local481.anInt629];
			@Pc(501) int local501 = (local481.anInt624 * 4 - local491.anInt349) / 2;
			@Pc(511) int local511 = (local481.anInt625 * 4 - local491.anInt350) / 2;
			local491.method260(arg0 * 4 + local501 + 48, (104 - arg1 - local481.anInt625) * 4 + 48 + local511);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!w;I)V")
	private void method99(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null) {
			System.out.println("null entity");
			return;
		}
		if (arg1.anInt701 < 0 || arg1.anInt702 < 0 || arg1.anInt701 >= 13312 || arg1.anInt702 >= 13312) {
			arg1.anInt726 = -1;
			arg1.anInt731 = -1;
			arg1.anInt740 = 0;
			arg1.anInt741 = 0;
			arg1.anInt701 = arg1.anIntArray207[0] * 128 + arg1.anInt705 * 64;
			arg1.anInt702 = arg1.anIntArray208[0] * 128 + arg1.anInt705 * 64;
			arg1.anInt745 = 0;
		}
		@Pc(69) boolean local69 = false;
		if (arg1.anInt726 != -1 && arg1.anInt729 == 0) {
			try {
				@Pc(81) Class11 local81 = Class11.aClass11Array1[arg1.anInt726];
				if (local81.anIntArray127 == null) {
					local69 = true;
					arg1.anInt746++;
				}
			} catch (@Pc(94) Exception local94) {
				System.out.println("e2: " + arg1.anInt726);
			}
		}
		@Pc(124) int local124;
		@Pc(134) int local134;
		@Pc(242) int local242;
		@Pc(114) int local114;
		if (arg1.anInt740 > anInt85) {
			local114 = arg1.anInt740 - anInt85;
			local124 = arg1.anInt736 * 128 + arg1.anInt705 * 64;
			local134 = arg1.anInt738 * 128 + arg1.anInt705 * 64;
			arg1.anInt701 += (local124 - arg1.anInt701) / local114;
			arg1.anInt702 += (local134 - arg1.anInt702) / local114;
			arg1.anInt746 = 0;
			if (arg1.anInt742 == 0) {
				arg1.anInt744 = 1024;
			}
			if (arg1.anInt742 == 1) {
				arg1.anInt744 = 1536;
			}
			if (arg1.anInt742 == 2) {
				arg1.anInt744 = 0;
			}
			if (arg1.anInt742 == 3) {
				arg1.anInt744 = 512;
			}
		} else {
			@Pc(252) int local252;
			@Pc(262) int local262;
			if (arg1.anInt741 >= anInt85) {
				try {
					if (arg1.anInt741 == anInt85 || !local69 || arg1.anInt728 + 1 > Class11.aClass11Array1[arg1.anInt726].anIntArray126[arg1.anInt727]) {
						local114 = arg1.anInt741 - arg1.anInt740;
						local124 = anInt85 - arg1.anInt740;
						local134 = arg1.anInt736 * 128 + arg1.anInt705 * 64;
						local242 = arg1.anInt738 * 128 + arg1.anInt705 * 64;
						local252 = arg1.anInt737 * 128 + arg1.anInt705 * 64;
						local262 = arg1.anInt739 * 128 + arg1.anInt705 * 64;
						arg1.anInt701 = (local134 * (local114 - local124) + local252 * local124) / local114;
						arg1.anInt702 = (local242 * (local114 - local124) + local262 * local124) / local114;
					}
					arg1.anInt746 = 0;
					if (arg1.anInt742 == 0) {
						arg1.anInt744 = 1024;
					}
					if (arg1.anInt742 == 1) {
						arg1.anInt744 = 1536;
					}
					if (arg1.anInt742 == 2) {
						arg1.anInt744 = 0;
					}
					if (arg1.anInt742 == 3) {
						arg1.anInt744 = 512;
					}
					arg1.anInt703 = arg1.anInt744;
				} catch (@Pc(324) Exception local324) {
					System.out.println("e4: " + arg1.anInt726);
				}
			} else {
				try {
					if (arg1.anInt745 == 0) {
						arg1.anInt746 = 0;
					}
					if (arg1.anInt745 <= 0 || local69) {
						arg1.anInt723 = arg1.anInt710;
					} else {
						local114 = arg1.anInt701;
						local124 = arg1.anInt702;
						local134 = arg1.anIntArray207[arg1.anInt745 - 1] * 128 + arg1.anInt705 * 64;
						local242 = arg1.anIntArray208[arg1.anInt745 - 1] * 128 + arg1.anInt705 * 64;
						if (local134 - local114 <= 256 && local134 - local114 >= -256 && local242 - local124 <= 256 && local242 - local124 >= -256) {
							if (local114 < local134) {
								if (local124 < local242) {
									arg1.anInt744 = 1280;
								} else if (local124 > local242) {
									arg1.anInt744 = 1792;
								} else {
									arg1.anInt744 = 1536;
								}
							} else if (local114 > local134) {
								if (local124 < local242) {
									arg1.anInt744 = 768;
								} else if (local124 > local242) {
									arg1.anInt744 = 256;
								} else {
									arg1.anInt744 = 512;
								}
							} else if (local124 < local242) {
								arg1.anInt744 = 1024;
							} else {
								arg1.anInt744 = 0;
							}
							local252 = arg1.anInt744 - arg1.anInt703 & 0x7FF;
							if (local252 > 1024) {
								local252 -= 2048;
							}
							local262 = arg1.anInt707;
							if (local252 >= -256 && local252 <= 256) {
								local262 = arg1.anInt706;
							} else if (local252 >= 256 && local252 < 768) {
								local262 = arg1.anInt709;
							} else if (local252 >= -768 && local252 <= -256) {
								local262 = arg1.anInt708;
							}
							if (local262 == -1) {
								local262 = arg1.anInt706;
							}
							if (local262 != arg1.anInt723) {
								arg1.anInt723 = local262;
								arg1.anInt724 = 0;
								arg1.anInt725 = 0;
							}
							@Pc(537) byte local537 = 4;
							if (arg1.anInt703 != arg1.anInt744 && arg1.anInt720 == -1) {
								local537 = 2;
							}
							if (arg1.anInt745 > 2) {
								local537 = 6;
							}
							if (arg1.anInt745 > 3) {
								local537 = 8;
							}
							if (arg1.anInt746 > 0 && arg1.anInt745 > 1) {
								local537 = 8;
								arg1.anInt746--;
							}
							if (local114 < local134) {
								arg1.anInt701 += local537;
								if (arg1.anInt701 > local134) {
									arg1.anInt701 = local134;
								}
							} else if (local114 > local134) {
								arg1.anInt701 -= local537;
								if (arg1.anInt701 < local134) {
									arg1.anInt701 = local134;
								}
							}
							if (local124 < local242) {
								arg1.anInt702 += local537;
								if (arg1.anInt702 > local242) {
									arg1.anInt702 = local242;
								}
							} else if (local124 > local242) {
								arg1.anInt702 -= local537;
								if (arg1.anInt702 < local242) {
									arg1.anInt702 = local242;
								}
							}
							if (arg1.anInt701 == local134 && arg1.anInt702 == local242) {
								arg1.anInt745--;
							}
						} else {
							arg1.anInt701 = local134;
							arg1.anInt702 = local242;
						}
					}
				} catch (@Pc(665) Exception local665) {
					System.out.println("e5: " + arg1.anInt745);
				}
			}
		}
		if (arg1.anInt720 != -1 && arg1.anInt720 < 32768) {
			try {
				@Pc(690) Class1_Sub1_Sub2_Sub1 local690 = this.aClass1_Sub1_Sub2_Sub1Array1[arg1.anInt720];
				if (local690 != null) {
					local124 = arg1.anInt701 - local690.anInt701;
					local134 = arg1.anInt702 - local690.anInt702;
					if (local124 != 0 || local134 != 0) {
						arg1.anInt744 = (int) (Math.atan2((double) local124, (double) local134) * 325.949D) & 0x7FF;
					}
				}
			} catch (@Pc(722) Exception local722) {
				System.out.println("e6: " + arg1.anInt720);
			}
		}
		if (arg1.anInt720 >= 32768) {
			try {
				local114 = arg1.anInt720 - 32768;
				if (local114 == this.anInt98) {
					local114 = this.anInt120;
				}
				@Pc(754) Class1_Sub1_Sub2_Sub2 local754 = this.aClass1_Sub1_Sub2_Sub2Array1[local114];
				if (local754 != null) {
					local134 = arg1.anInt701 - local754.anInt701;
					local242 = arg1.anInt702 - local754.anInt702;
					if (local134 != 0 || local242 != 0) {
						arg1.anInt744 = (int) (Math.atan2((double) local134, (double) local242) * 325.949D) & 0x7FF;
					}
				}
			} catch (@Pc(786) Exception local786) {
				System.out.println("e7: " + arg1.anInt720);
			}
		}
		if ((arg1.anInt721 != 0 || arg1.anInt722 != 0) && (arg1.anInt745 == 0 || arg1.anInt746 > 0)) {
			local114 = arg1.anInt701 - (arg1.anInt721 - this.anInt197 - this.anInt197) * 64;
			local124 = arg1.anInt702 - (arg1.anInt722 - this.anInt198 - this.anInt198) * 64;
			if (local114 != 0 || local124 != 0) {
				arg1.anInt744 = (int) (Math.atan2((double) local114, (double) local124) * 325.949D) & 0x7FF;
			}
			arg1.anInt721 = 0;
			arg1.anInt722 = 0;
		}
		local114 = arg1.anInt744 - arg1.anInt703 & 0x7FF;
		if (local114 != 0) {
			if (local114 < 32 || local114 > 2016) {
				arg1.anInt703 = arg1.anInt744;
			} else if (local114 > 1024) {
				arg1.anInt703 -= 32;
			} else {
				arg1.anInt703 += 32;
			}
			arg1.anInt703 &= 0x7FF;
			if (arg1.anInt723 == arg1.anInt710) {
				if (arg1.anInt711 == -1) {
					arg1.anInt723 = arg1.anInt706;
				} else {
					arg1.anInt723 = arg1.anInt711;
				}
			}
		}
		arg1.anInt704 = 0;
		@Pc(935) Class11 local935;
		if (arg1.anInt723 != -1) {
			try {
				local935 = Class11.aClass11Array1[arg1.anInt723];
				arg1.anInt725++;
				if (arg1.anInt724 < local935.anInt294 && arg1.anInt725 > local935.anIntArray126[arg1.anInt724]) {
					arg1.anInt725 = 0;
					arg1.anInt724++;
				}
				if (arg1.anInt724 >= local935.anInt294) {
					arg1.anInt725 = 0;
					arg1.anInt724 = 0;
				}
			} catch (@Pc(976) Exception local976) {
				System.out.println("e8: " + arg1.anInt723);
			}
		}
		if (arg1.anInt726 != -1 && arg1.anInt729 == 0) {
			try {
				local935 = Class11.aClass11Array1[arg1.anInt726];
				arg1.anInt728++;
				while (arg1.anInt727 < local935.anInt294 && arg1.anInt728 > local935.anIntArray126[arg1.anInt727]) {
					arg1.anInt728 -= local935.anIntArray126[arg1.anInt727];
					arg1.anInt727++;
				}
				if (arg1.anInt727 >= local935.anInt294) {
					arg1.anInt727 -= local935.anInt295;
					arg1.anInt730++;
					if (arg1.anInt730 >= local935.anInt300) {
						arg1.anInt726 = -1;
					}
					if (arg1.anInt727 < 0 || arg1.anInt727 >= local935.anInt294) {
						arg1.anInt726 = -1;
					}
				}
				arg1.anInt704 = local935.anInt296;
			} catch (@Pc(1079) Exception local1079) {
				System.out.println("e9: " + arg1.anInt726);
			}
		}
		if (arg1.anInt729 > 0) {
			arg1.anInt729--;
		}
		if (arg1.anInt731 == -1 || anInt85 < arg1.anInt734) {
			return;
		}
		try {
			if (arg1.anInt732 < 0) {
				arg1.anInt732 = 0;
			}
			local935 = Class13.aClass13Array1[arg1.anInt731].aClass11_1;
			arg1.anInt733++;
			while (arg1.anInt732 < local935.anInt294 && arg1.anInt733 > local935.anIntArray126[arg1.anInt732]) {
				arg1.anInt733 -= local935.anIntArray126[arg1.anInt732];
				arg1.anInt732++;
			}
			if (arg1.anInt732 >= local935.anInt294) {
				arg1.anInt731 = -1;
				return;
			}
		} catch (@Pc(1166) Exception local1166) {
			System.out.println("e10: " + arg1.anInt731);
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method100() {
		for (@Pc(3) int local3 = -1; local3 < this.anInt121; local3++) {
			@Pc(11) int local11;
			if (local3 == -1) {
				local11 = this.anInt120;
			} else {
				local11 = this.anIntArray31[local3];
			}
			@Pc(23) Class1_Sub1_Sub2_Sub2 local23 = this.aClass1_Sub1_Sub2_Sub2Array1[local11];
			this.method99(1, local23, local11 + 32768);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method101(@OriginalArg(1) int arg0) {
		this.aClass1_Sub1_Sub2_Sub2Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method102() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt201; local7++) {
			@Pc(14) int local14 = this.anIntArray60[local7];
			@Pc(19) Class1_Sub1_Sub2_Sub1 local19 = this.aClass1_Sub1_Sub2_Sub1Array1[local14];
			this.method99(local19.aClass38_1.aByte34, local19, local14);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method103(@OriginalArg(0) int arg0) {
		this.aBoolean41 &= true;
		if (this.aClass1_Sub1_Sub2_Sub1Array1[arg0] != null) {
			this.aClass1_Sub1_Sub2_Sub1Array1[arg0].aClass38_1 = null;
		}
		this.aClass1_Sub1_Sub2_Sub1Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIII)V")
	private void method104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) int local13 = arg0 >> 14 & 0x7FFF;
		@Pc(22) int local22 = this.aClass28_1.method390(this.anInt173, arg1, arg2, arg0);
		if (local22 == -1) {
			return;
		}
		@Pc(30) int local30 = local22 & 0x1F;
		@Pc(36) int local36 = local22 >> 6 & 0x3;
		if (local30 == 10 || local30 == 11 || local30 == 22) {
			@Pc(48) Class37 local48 = Class37.method445(local13);
			@Pc(56) int local56;
			@Pc(59) int local59;
			if (local36 == 0 || local36 == 2) {
				local56 = local48.anInt624;
				local59 = local48.anInt625;
			} else {
				local56 = local48.anInt625;
				local59 = local48.anInt624;
			}
			@Pc(70) int local70 = local48.anInt633;
			if (local36 != 0) {
				local70 = (local70 << local36 & 0xF) + (local70 >> 4 - local36);
			}
			this.method105(arg2, 0, false, local56, arg1, this.aClass1_Sub1_Sub2_Sub2_1.anIntArray207[0], local70, local59, 0, this.aClass1_Sub1_Sub2_Sub2_1.anIntArray208[0]);
		} else {
			this.method105(arg2, local30 + 1, false, 0, arg1, this.aClass1_Sub1_Sub2_Sub2_1.anIntArray207[0], 0, 0, local36, this.aClass1_Sub1_Sub2_Sub2_1.anIntArray208[0]);
		}
		this.anInt162 = super.anInt81;
		this.anInt163 = super.anInt82;
		this.anInt165 = 2;
		this.anInt164 = 0;
		this.aClass1_Sub3_Sub3_1.method323(arg3);
		this.aClass1_Sub3_Sub3_1.method325(arg1 + this.anInt197);
		this.aClass1_Sub3_Sub3_1.method325(arg2 + this.anInt198);
		this.aClass1_Sub3_Sub3_1.method325(local13);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZIZIIIIIII)Z")
	private boolean method105(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				this.anIntArrayArray3[local7][local11] = 0;
				this.anIntArrayArray4[local7][local11] = 99999999;
			}
		}
		local11 = arg5;
		@Pc(39) int local39 = arg9;
		this.anIntArrayArray3[arg5][arg9] = 99;
		this.aBoolean41 &= true;
		this.anIntArrayArray4[arg5][arg9] = 0;
		@Pc(61) byte local61 = 0;
		@Pc(63) int local63 = 0;
		this.anIntArray52[0] = arg5;
		@Pc(72) int local72 = local61 + 1;
		this.anIntArray53[0] = arg9;
		@Pc(76) boolean local76 = false;
		@Pc(80) int local80 = this.anIntArray52.length;
		@Pc(87) int[][] local87 = this.aClass2Array1[this.anInt173].anIntArrayArray1;
		@Pc(200) int local200;
		while (local63 != local72) {
			local11 = this.anIntArray52[local63];
			local39 = this.anIntArray53[local63];
			local63 = (local63 + 1) % local80;
			if (local11 == arg4 && local39 == arg0) {
				local76 = true;
				break;
			}
			if (arg1 != 0) {
				if ((arg1 < 5 || arg1 == 10) && this.aClass2Array1[this.anInt173].method29(local11, arg8, this.aBoolean38, local39, arg0, arg1 - 1, arg4)) {
					local76 = true;
					break;
				}
				if (arg1 < 10 && this.aClass2Array1[this.anInt173].method30(arg0, local39, arg1 - 1, arg4, local11, arg8)) {
					local76 = true;
					break;
				}
			}
			if (arg3 != 0 && arg7 != 0 && this.aClass2Array1[this.anInt173].method31(arg7, local39, arg6, this.anInt87, local11, arg4, arg3, arg0)) {
				local76 = true;
				break;
			}
			local200 = this.anIntArrayArray4[local11][local39] + 1;
			if (local11 > 0 && this.anIntArrayArray3[local11 - 1][local39] == 0 && (local87[local11 - 1][local39] & 0x280108) == 0) {
				this.anIntArray52[local72] = local11 - 1;
				this.anIntArray53[local72] = local39;
				local72 = (local72 + 1) % local80;
				this.anIntArrayArray3[local11 - 1][local39] = 2;
				this.anIntArrayArray4[local11 - 1][local39] = local200;
			}
			if (local11 < 103 && this.anIntArrayArray3[local11 + 1][local39] == 0 && (local87[local11 + 1][local39] & 0x280180) == 0) {
				this.anIntArray52[local72] = local11 + 1;
				this.anIntArray53[local72] = local39;
				local72 = (local72 + 1) % local80;
				this.anIntArrayArray3[local11 + 1][local39] = 8;
				this.anIntArrayArray4[local11 + 1][local39] = local200;
			}
			if (local39 > 0 && this.anIntArrayArray3[local11][local39 - 1] == 0 && (local87[local11][local39 - 1] & 0x280102) == 0) {
				this.anIntArray52[local72] = local11;
				this.anIntArray53[local72] = local39 - 1;
				local72 = (local72 + 1) % local80;
				this.anIntArrayArray3[local11][local39 - 1] = 1;
				this.anIntArrayArray4[local11][local39 - 1] = local200;
			}
			if (local39 < 103 && this.anIntArrayArray3[local11][local39 + 1] == 0 && (local87[local11][local39 + 1] & 0x280120) == 0) {
				this.anIntArray52[local72] = local11;
				this.anIntArray53[local72] = local39 + 1;
				local72 = (local72 + 1) % local80;
				this.anIntArrayArray3[local11][local39 + 1] = 4;
				this.anIntArrayArray4[local11][local39 + 1] = local200;
			}
			if (local11 > 0 && local39 > 0 && this.anIntArrayArray3[local11 - 1][local39 - 1] == 0 && (local87[local11 - 1][local39 - 1] & 0x28010E) == 0 && (local87[local11 - 1][local39] & 0x280108) == 0 && (local87[local11][local39 - 1] & 0x280102) == 0) {
				this.anIntArray52[local72] = local11 - 1;
				this.anIntArray53[local72] = local39 - 1;
				local72 = (local72 + 1) % local80;
				this.anIntArrayArray3[local11 - 1][local39 - 1] = 3;
				this.anIntArrayArray4[local11 - 1][local39 - 1] = local200;
			}
			if (local11 < 103 && local39 > 0 && this.anIntArrayArray3[local11 + 1][local39 - 1] == 0 && (local87[local11 + 1][local39 - 1] & 0x280183) == 0 && (local87[local11 + 1][local39] & 0x280180) == 0 && (local87[local11][local39 - 1] & 0x280102) == 0) {
				this.anIntArray52[local72] = local11 + 1;
				this.anIntArray53[local72] = local39 - 1;
				local72 = (local72 + 1) % local80;
				this.anIntArrayArray3[local11 + 1][local39 - 1] = 9;
				this.anIntArrayArray4[local11 + 1][local39 - 1] = local200;
			}
			if (local11 > 0 && local39 < 103 && this.anIntArrayArray3[local11 - 1][local39 + 1] == 0 && (local87[local11 - 1][local39 + 1] & 0x280138) == 0 && (local87[local11 - 1][local39] & 0x280108) == 0 && (local87[local11][local39 + 1] & 0x280120) == 0) {
				this.anIntArray52[local72] = local11 - 1;
				this.anIntArray53[local72] = local39 + 1;
				local72 = (local72 + 1) % local80;
				this.anIntArrayArray3[local11 - 1][local39 + 1] = 6;
				this.anIntArrayArray4[local11 - 1][local39 + 1] = local200;
			}
			if (local11 < 103 && local39 < 103 && this.anIntArrayArray3[local11 + 1][local39 + 1] == 0 && (local87[local11 + 1][local39 + 1] & 0x2801E0) == 0 && (local87[local11 + 1][local39] & 0x280180) == 0 && (local87[local11][local39 + 1] & 0x280120) == 0) {
				this.anIntArray52[local72] = local11 + 1;
				this.anIntArray53[local72] = local39 + 1;
				local72 = (local72 + 1) % local80;
				this.anIntArrayArray3[local11 + 1][local39 + 1] = 12;
				this.anIntArrayArray4[local11 + 1][local39 + 1] = local200;
			}
		}
		@Pc(813) int local813;
		@Pc(819) int local819;
		@Pc(825) int local825;
		if (!local76) {
			if (arg2) {
				local200 = 100;
				for (local813 = 1; local813 < 2; local813++) {
					for (local819 = arg4 - local813; local819 <= arg4 + local813; local819++) {
						for (local825 = arg0 - local813; local825 <= arg0 + local813; local825++) {
							if (local819 >= 0 && local825 >= 0 && local819 < 104 && local825 < 104 && this.anIntArrayArray4[local819][local825] < local200) {
								local200 = this.anIntArrayArray4[local819][local825];
								local11 = local819;
								local39 = local825;
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
		@Pc(883) byte local883 = 0;
		this.anIntArray52[0] = local11;
		local63 = local883 + 1;
		this.anIntArray53[0] = local39;
		local200 = local813 = this.anIntArrayArray3[local11][local39];
		while (local11 != arg5 || local39 != arg9) {
			if (local200 != local813) {
				local813 = local200;
				this.anIntArray52[local63] = local11;
				this.anIntArray53[local63++] = local39;
			}
			if ((local200 & 0x2) != 0) {
				local11++;
			} else if ((local200 & 0x8) != 0) {
				local11--;
			}
			if ((local200 & 0x1) != 0) {
				local39++;
			} else if ((local200 & 0x4) != 0) {
				local39--;
			}
			local200 = this.anIntArrayArray3[local11][local39];
		}
		if (local63 > 0) {
			local80 = local63;
			if (local63 > 25) {
				local80 = 25;
			}
			local63--;
			local819 = this.anIntArray52[local63];
			local825 = this.anIntArray53[local63];
			this.aClass1_Sub3_Sub3_1.method323(147);
			this.aClass1_Sub3_Sub3_1.method324(local80 + local80 + 2);
			this.aClass1_Sub3_Sub3_1.method325(local819 + this.anInt197);
			this.aClass1_Sub3_Sub3_1.method325(local825 + this.anInt198);
			for (@Pc(1007) int local1007 = 1; local1007 < local80; local1007++) {
				local63--;
				this.aClass1_Sub3_Sub3_1.method324(this.anIntArray52[local63] - local819);
				this.aClass1_Sub3_Sub3_1.method324(this.anIntArray53[local63] - local825);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)Z")
	private boolean method106() {
		if (this.aClass6_1 == null) {
			return false;
		}
		try {
			@Pc(19) int local19 = this.aClass6_1.method149();
			if (local19 == 0) {
				return false;
			}
			if (this.anInt106 == -1) {
				this.aClass6_1.method150(this.aClass1_Sub3_Sub3_2.aByteArray4, 0, 1);
				this.anInt106 = this.aClass1_Sub3_Sub3_2.aByteArray4[0] & 0xFF;
				if (this.aClass33_1 != null) {
					this.anInt106 = this.anInt106 - this.aClass33_1.method424() & 0xFF;
				}
				this.anInt105 = Class40.anIntArray215[this.anInt106];
				local19--;
			}
			if (this.anInt105 == -1) {
				if (local19 <= 0) {
					return false;
				}
				this.aClass6_1.method150(this.aClass1_Sub3_Sub3_2.aByteArray4, 0, 1);
				this.anInt105 = this.aClass1_Sub3_Sub3_2.aByteArray4[0] & 0xFF;
				local19--;
			}
			if (this.anInt105 == -2) {
				if (local19 <= 1) {
					return false;
				}
				this.aClass6_1.method150(this.aClass1_Sub3_Sub3_2.aByteArray4, 0, 2);
				this.aClass1_Sub3_Sub3_2.anInt394 = 0;
				this.anInt105 = this.aClass1_Sub3_Sub3_2.method333();
				local19 -= 2;
			}
			if (local19 < this.anInt105) {
				return false;
			}
			this.aClass1_Sub3_Sub3_2.anInt394 = 0;
			this.aClass6_1.method150(this.aClass1_Sub3_Sub3_2.aByteArray4, 0, this.anInt105);
			this.anInt107 = 0;
			@Pc(237) int local237;
			@Pc(239) int local239;
			@Pc(249) int local249;
			@Pc(253) int local253;
			@Pc(424) int local424;
			@Pc(214) int local214;
			@Pc(245) int local245;
			@Pc(257) int local257;
			if (this.anInt106 == 232) {
				this.aClass27_14.method359();
				this.aClass1_Sub3_Sub2_Sub4_2.method274(151, this.aBoolean44, 257, 0, "Loading - please wait.");
				this.aClass1_Sub3_Sub2_Sub4_2.method274(150, this.aBoolean44, 256, 16777215, "Loading - please wait.");
				this.aClass27_14.method360(super.aGraphics2, 8, 11);
				this.anInt86 = 1;
				this.anInt94 = this.aClass1_Sub3_Sub3_2.method333();
				this.anInt95 = this.aClass1_Sub3_Sub3_2.method333();
				this.anInt197 = (this.anInt94 - 6) * 8;
				this.anInt198 = (this.anInt95 - 6) * 8;
				signlink.looprate(5);
				local214 = (this.anInt105 - 2) / 10;
				this.aByteArrayArray1 = new byte[local214][];
				this.aByteArrayArray2 = new byte[local214][];
				this.anIntArray27 = new int[local214];
				this.aClass1_Sub3_Sub3_1.method323(117);
				this.aClass1_Sub3_Sub3_1.method324(0);
				local237 = 0;
				for (local239 = 0; local239 < local214; local239++) {
					local245 = this.aClass1_Sub3_Sub3_2.method331();
					local249 = this.aClass1_Sub3_Sub3_2.method331();
					local253 = this.aClass1_Sub3_Sub3_2.method336();
					local257 = this.aClass1_Sub3_Sub3_2.method336();
					this.anIntArray27[local239] = (local245 << 8) + local249;
					@Pc(281) byte[] local281;
					if (local253 != 0) {
						local281 = signlink.cacheload("m" + local245 + "_" + local249);
						if (local281 != null) {
							this.aCRC32_1.reset();
							this.aCRC32_1.update(local281);
							if ((int) this.aCRC32_1.getValue() != local253) {
								local281 = null;
							}
						}
						if (local281 == null) {
							this.anInt86 = 0;
							this.aClass1_Sub3_Sub3_1.method324(0);
							this.aClass1_Sub3_Sub3_1.method324(local245);
							this.aClass1_Sub3_Sub3_1.method324(local249);
							local237 += 3;
						} else {
							this.aByteArrayArray1[local239] = local281;
						}
					}
					if (local257 != 0) {
						local281 = signlink.cacheload("l" + local245 + "_" + local249);
						if (local281 != null) {
							this.aCRC32_1.reset();
							this.aCRC32_1.update(local281);
							if ((int) this.aCRC32_1.getValue() != local257) {
								local281 = null;
							}
						}
						if (local281 == null) {
							this.anInt86 = 0;
							this.aClass1_Sub3_Sub3_1.method324(1);
							this.aClass1_Sub3_Sub3_1.method324(local245);
							this.aClass1_Sub3_Sub3_1.method324(local249);
							local237 += 3;
						} else {
							this.aByteArrayArray2[local239] = local281;
						}
					}
				}
				this.aClass1_Sub3_Sub3_1.method330(local237);
				signlink.looprate(100);
				local245 = this.anInt197 - this.anInt199;
				local249 = this.anInt198 - this.anInt200;
				this.anInt199 = this.anInt197;
				this.anInt200 = this.anInt198;
				local253 = 0;
				label584: while (true) {
					if (local253 >= 8192) {
						for (local257 = 0; local257 < this.anInt119; local257++) {
							@Pc(475) Class1_Sub1_Sub2_Sub2 local475 = this.aClass1_Sub1_Sub2_Sub2Array1[local257];
							if (local475 != null) {
								for (@Pc(479) int local479 = 0; local479 < 10; local479++) {
									local475.anIntArray207[local479] -= local245;
									local475.anIntArray208[local479] -= local249;
								}
								local475.anInt701 -= local245 * 128;
								local475.anInt702 -= local249 * 128;
							}
						}
						@Pc(524) byte local524 = 0;
						@Pc(526) byte local526 = 104;
						@Pc(528) byte local528 = 1;
						if (local245 < 0) {
							local524 = 103;
							local526 = -1;
							local528 = -1;
						}
						@Pc(538) byte local538 = 0;
						@Pc(540) byte local540 = 104;
						@Pc(542) byte local542 = 1;
						if (local249 < 0) {
							local538 = 103;
							local540 = -1;
							local542 = -1;
						}
						for (@Pc(552) int local552 = local524; local552 != local526; local552 += local528) {
							for (@Pc(556) int local556 = local538; local556 != local540; local556 += local542) {
								@Pc(562) int local562 = local552 + local245;
								@Pc(566) int local566 = local556 + local249;
								for (@Pc(568) int local568 = 0; local568 < 4; local568++) {
									if (local562 >= 0 && local566 >= 0 && local562 < 104 && local566 < 104) {
										this.aClass23ArrayArrayArray1[local568][local552][local556] = this.aClass23ArrayArrayArray1[local568][local562][local566];
									} else {
										this.aClass23ArrayArrayArray1[local568][local552][local556] = null;
									}
								}
							}
						}
						@Pc(630) Class1_Sub4 local630 = (Class1_Sub4) this.aClass23_2.method352();
						while (true) {
							if (local630 == null) {
								break label584;
							}
							local630.anInt418 -= local245;
							local630.anInt419 -= local249;
							if (local630.anInt418 < 0 || local630.anInt419 < 0 || local630.anInt418 >= 104 || local630.anInt419 >= 104) {
								local630.method478();
							}
							local630 = (Class1_Sub4) this.aClass23_2.method354();
						}
					}
					@Pc(420) Class1_Sub1_Sub2_Sub1 local420 = this.aClass1_Sub1_Sub2_Sub1Array1[local253];
					if (local420 != null) {
						for (local424 = 0; local424 < 10; local424++) {
							local420.anIntArray207[local424] -= local245;
							local420.anIntArray208[local424] -= local249;
						}
						local420.anInt701 -= local245 * 128;
						local420.anInt702 -= local249 * 128;
					}
					local253++;
				}
			} else if (this.anInt106 == 217) {
				this.anInt123 = this.aClass1_Sub3_Sub3_2.method331();
			} else if (this.anInt106 == 248) {
				local214 = this.aClass1_Sub3_Sub3_2.method333();
				local237 = this.aClass1_Sub3_Sub3_2.method333();
				local239 = local237 >> 10 & 0x1F;
				local245 = local237 >> 5 & 0x1F;
				local249 = local237 & 0x1F;
				Class7.aClass7Array1[local214].anInt246 = (local239 << 19) + (local245 << 11) + (local249 << 3);
			} else if (this.anInt106 == 98) {
				this.aBoolean21 = true;
				local214 = this.aClass1_Sub3_Sub3_2.method331();
				local237 = this.aClass1_Sub3_Sub3_2.method336();
				local239 = this.aClass1_Sub3_Sub3_2.method331();
				this.anIntArray22[local214] = local237;
				this.anIntArray47[local214] = local239;
				this.anIntArray44[local214] = 1;
				for (local245 = 0; local245 < 98; local245++) {
					if (local237 >= anIntArray48[local245]) {
						this.anIntArray44[local214] = local245 + 2;
					}
				}
			} else if (this.anInt106 == 5) {
				for (local214 = 0; local214 < this.aClass1_Sub1_Sub2_Sub2Array1.length; local214++) {
					if (this.aClass1_Sub1_Sub2_Sub2Array1[local214] != null) {
						this.aClass1_Sub1_Sub2_Sub2Array1[local214].anInt726 = -1;
					}
				}
				for (local237 = 0; local237 < this.aClass1_Sub1_Sub2_Sub1Array1.length; local237++) {
					if (this.aClass1_Sub1_Sub2_Sub1Array1[local237] != null) {
						this.aClass1_Sub1_Sub2_Sub1Array1[local237].anInt726 = -1;
					}
				}
			} else if (this.anInt106 == 47) {
				this.method110(this.anInt105, this.aClass1_Sub3_Sub3_2);
				if (this.anInt86 == 1) {
					this.anInt86 = 2;
					Class4.anInt61 = this.anInt173;
					this.method96(this.aByte7);
				}
				if (aBoolean23 && this.anInt86 == 2 && Class4.anInt61 != this.anInt173) {
					this.aClass27_14.method359();
					this.aClass1_Sub3_Sub2_Sub4_2.method274(151, this.aBoolean44, 257, 0, "Loading - please wait.");
					this.aClass1_Sub3_Sub2_Sub4_2.method274(150, this.aBoolean44, 256, 16777215, "Loading - please wait.");
					this.aClass27_14.method360(super.aGraphics2, 8, 11);
					Class4.anInt61 = this.anInt173;
					this.method96(this.aByte7);
				}
				if (this.anInt173 != this.anInt179 && this.anInt86 == 2) {
					this.anInt179 = this.anInt173;
					this.method97(this.anInt173, this.anInt142);
				}
			} else if (this.anInt106 == 234) {
				local214 = this.aClass1_Sub3_Sub3_2.method333();
				local237 = this.aClass1_Sub3_Sub3_2.method331();
				this.anIntArray54[local237] = local214;
				this.aBoolean21 = true;
			} else {
				@Pc(963) String local963;
				@Pc(952) String local952;
				if (this.anInt106 == 156) {
					local952 = this.aClass1_Sub3_Sub3_2.method338();
					if (local952.endsWith(":tradereq:")) {
						local963 = local952.substring(0, local952.indexOf(":"));
						@Pc(966) long local966 = Class35.method430(local963);
						@Pc(968) boolean local968 = false;
						for (local253 = 0; local253 < this.anInt153; local253++) {
							if (this.aLongArray3[local253] == local966) {
								local968 = true;
								break;
							}
						}
						if (!local968) {
							this.method136(4, local963, "wishes to trade with you.");
						}
					} else {
						this.method136(0, "", local952);
					}
				} else if (this.anInt106 == 220) {
					this.anInt143 = this.aClass1_Sub3_Sub3_2.method331();
					this.anInt135 = this.aClass1_Sub3_Sub3_2.method331();
					this.anInt122 = this.aClass1_Sub3_Sub3_2.method331();
					this.aBoolean46 = true;
					this.aBoolean36 = true;
				} else if (this.anInt106 == 149) {
					local214 = this.aClass1_Sub3_Sub3_2.method333();
					local237 = this.aClass1_Sub3_Sub3_2.method333();
					Class7.aClass7Array1[local214].anInt249 = local237;
				} else if (this.anInt106 == 95) {
					this.anInt114 = this.aClass1_Sub3_Sub3_2.method331();
					this.anInt115 = this.aClass1_Sub3_Sub3_2.method331();
				} else if (this.anInt106 == 235) {
					this.aBoolean21 = true;
					local214 = this.aClass1_Sub3_Sub3_2.method333();
					@Pc(1083) byte local1083 = this.aClass1_Sub3_Sub3_2.method332();
					if (this.anIntArray61[local214] != local1083) {
						this.anIntArray61[local214] = local1083;
						this.method130(local214);
					}
				} else if (this.anInt106 == 123) {
					local214 = this.aClass1_Sub3_Sub3_2.method333();
					Class7.aClass7Array1[local214].aClass1_Sub3_Sub1_1 = this.aClass1_Sub1_Sub2_Sub2_1.method467();
				} else if (this.anInt106 == 44) {
					local214 = this.aClass1_Sub3_Sub3_2.method331();
					local237 = this.aClass1_Sub3_Sub3_2.method331();
					local239 = -1;
					for (local245 = 0; local245 < this.anIntArray27.length; local245++) {
						if (this.anIntArray27[local245] == (local214 << 8) + local237) {
							local239 = local245;
						}
					}
					if (local239 != -1) {
						signlink.cachesave("l" + local214 + "_" + local237, this.aByteArrayArray2[local239]);
						this.anInt86 = 1;
					}
				} else if (this.anInt106 == 171) {
					local214 = this.aClass1_Sub3_Sub3_2.method333();
					this.method128(local214);
					if (this.anInt100 != -1) {
						this.anInt100 = -1;
						this.aBoolean21 = true;
						this.aBoolean34 = true;
					}
					if (this.anInt190 != -1) {
						this.anInt190 = -1;
						this.aBoolean36 = true;
					}
					if (this.aBoolean30) {
						this.aBoolean30 = false;
						this.aBoolean36 = true;
					}
					this.anInt101 = local214;
					this.aBoolean28 = false;
				} else if (this.anInt106 == 197) {
					local214 = this.aClass1_Sub3_Sub3_2.method331();
					local237 = this.aClass1_Sub3_Sub3_2.method331();
					local239 = this.aClass1_Sub3_Sub3_2.method333();
					local245 = this.aClass1_Sub3_Sub3_2.method333();
					local249 = -1;
					for (local253 = 0; local253 < this.anIntArray27.length; local253++) {
						if (this.anIntArray27[local253] == (local214 << 8) + local237) {
							local249 = local253;
						}
					}
					if (local249 != -1) {
						if (this.aByteArrayArray1[local249] == null || this.aByteArrayArray1[local249].length != local245) {
							this.aByteArrayArray1[local249] = new byte[local245];
						}
						this.aClass1_Sub3_Sub3_2.method340(local239, this.anInt105 - 6, this.aByteArrayArray1[local249]);
					}
				} else if (this.anInt106 == 181) {
					local214 = this.aClass1_Sub3_Sub3_2.method333();
					local237 = this.aClass1_Sub3_Sub3_2.method333();
					@Pc(1325) Class38 local1325 = Class38.method457(local237);
					Class7.aClass7Array1[local214].aClass1_Sub3_Sub1_1 = local1325.method460();
				} else {
					@Pc(1349) Class7 local1349;
					if (this.anInt106 == 68) {
						this.aBoolean21 = true;
						local214 = this.aClass1_Sub3_Sub3_2.method333();
						local1349 = Class7.aClass7Array1[local214];
						while (this.aClass1_Sub3_Sub3_2.anInt394 < this.anInt105) {
							local239 = this.aClass1_Sub3_Sub3_2.method331();
							local245 = this.aClass1_Sub3_Sub3_2.method333();
							local249 = this.aClass1_Sub3_Sub3_2.method331();
							if (local249 == 255) {
								local249 = this.aClass1_Sub3_Sub3_2.method336();
							}
							if (local239 >= 0 && local239 < local1349.anIntArray100.length) {
								local1349.anIntArray100[local239] = local245;
								local1349.anIntArray101[local239] = local249;
							}
						}
					} else if (this.anInt106 == 153 || this.anInt106 == 90 || this.anInt106 == 59 || this.anInt106 == 60 || this.anInt106 == 250 || this.anInt106 == 127 || this.anInt106 == 175 || this.anInt106 == 35 || this.anInt106 == 22) {
						this.method108(this.aClass1_Sub3_Sub3_2, this.anInt106);
					} else if (this.anInt106 == 61) {
						local214 = this.aClass1_Sub3_Sub3_2.method333();
						@Pc(1457) boolean local1457 = this.aClass1_Sub3_Sub3_2.method331() == 1;
						Class7.aClass7Array1[local214].aBoolean59 = local1457;
					} else if (this.anInt106 == 80) {
						if (this.anInt100 != -1) {
							this.anInt100 = -1;
							this.aBoolean21 = true;
							this.aBoolean34 = true;
						}
						if (this.anInt190 != -1) {
							this.anInt190 = -1;
							this.aBoolean36 = true;
						}
						if (this.aBoolean30) {
							this.aBoolean30 = false;
							this.aBoolean36 = true;
						}
						this.anInt101 = -1;
						this.aBoolean28 = false;
					} else if (this.anInt106 == 225) {
						local214 = this.aClass1_Sub3_Sub3_2.method331();
						local237 = this.aClass1_Sub3_Sub3_2.method331();
						local239 = this.aClass1_Sub3_Sub3_2.method333();
						local245 = this.aClass1_Sub3_Sub3_2.method333();
						local249 = -1;
						for (local253 = 0; local253 < this.anIntArray27.length; local253++) {
							if (this.anIntArray27[local253] == (local214 << 8) + local237) {
								local249 = local253;
							}
						}
						if (local249 != -1) {
							if (this.aByteArrayArray2[local249] == null || this.aByteArrayArray2[local249].length != local245) {
								this.aByteArrayArray2[local249] = new byte[local245];
							}
							this.aClass1_Sub3_Sub3_2.method340(local239, this.anInt105 - 6, this.aByteArrayArray2[local249]);
						}
					} else if (this.anInt106 == 51) {
						local214 = this.aClass1_Sub3_Sub3_2.method331();
						local237 = this.aClass1_Sub3_Sub3_2.method331();
						local239 = -1;
						for (local245 = 0; local245 < this.anIntArray27.length; local245++) {
							if (this.anIntArray27[local245] == (local214 << 8) + local237) {
								local239 = local245;
							}
						}
						if (local239 != -1) {
							signlink.cachesave("m" + local214 + "_" + local237, this.aByteArrayArray1[local239]);
							this.anInt86 = 1;
						}
					} else if (this.anInt106 == 100) {
						this.method111(this.aClass1_Sub3_Sub3_2, this.anInt105);
					} else if (this.anInt106 == 210) {
						local214 = this.aClass1_Sub3_Sub3_2.method333();
						local1349 = Class7.aClass7Array1[local214];
						for (local239 = 0; local239 < local1349.anIntArray100.length; local239++) {
							local1349.anIntArray100[local239] = -1;
							local1349.anIntArray100[local239] = 0;
						}
					} else if (this.anInt106 == 42) {
						local214 = this.aClass1_Sub3_Sub3_2.method333();
						local237 = this.aClass1_Sub3_Sub3_2.method333();
						Class7.aClass7Array1[local214].aClass1_Sub3_Sub1_1 = new Class1_Sub3_Sub1(local237, this.aBoolean24);
					} else if (this.anInt106 == 254) {
						this.anInt104 = this.aClass1_Sub3_Sub3_2.method331();
						this.aBoolean21 = true;
						this.aBoolean34 = true;
					} else {
						@Pc(1745) long local1745;
						if (this.anInt106 == 114) {
							local1745 = this.aClass1_Sub3_Sub3_2.method337();
							local239 = this.aClass1_Sub3_Sub3_2.method331();
							@Pc(1755) String local1755 = Class35.method434(Class35.method431(local1745));
							for (local249 = 0; local249 < this.anInt167; local249++) {
								if (local1755.equals(this.aStringArray3[local249])) {
									if (this.anIntArray62[local249] != local239) {
										this.anIntArray62[local249] = local239;
										this.aBoolean21 = true;
										if (local239 > 0) {
											this.method136(5, "", local1755 + " has logged in.");
										}
										if (local239 == 0) {
											this.method136(5, "", local1755 + " has logged out.");
										}
									}
									local1755 = null;
									break;
								}
							}
							if (local1755 != null && this.anInt167 < 100) {
								this.aStringArray3[this.anInt167] = local1755;
								this.anIntArray62[this.anInt167] = local239;
								this.anInt167++;
								this.aBoolean21 = true;
							}
							@Pc(1847) boolean local1847 = false;
							while (!local1847) {
								local1847 = true;
								for (local257 = 0; local257 < this.anInt167 - 1; local257++) {
									if (this.anIntArray62[local257] != this.anInt172 && this.anIntArray62[local257 + 1] == this.anInt172 || this.anIntArray62[local257] == 0 && this.anIntArray62[local257 + 1] != 0) {
										local424 = this.anIntArray62[local257];
										this.anIntArray62[local257] = this.anIntArray62[local257 + 1];
										this.anIntArray62[local257 + 1] = local424;
										@Pc(1910) String local1910 = this.aStringArray3[local257];
										this.aStringArray3[local257] = this.aStringArray3[local257 + 1];
										this.aStringArray3[local257 + 1] = local1910;
										this.aBoolean21 = true;
										local1847 = false;
									}
								}
							}
						} else if (this.anInt106 == 159) {
							local952 = this.aClass1_Sub3_Sub3_2.method338();
							if (!local952.equals(this.aString10)) {
								this.aString10 = local952;
								if (this.aBoolean35) {
									signlink.midi = local952;
								}
							}
						} else if (this.anInt106 == 119) {
							this.aBoolean21 = true;
							local214 = this.aClass1_Sub3_Sub3_2.method333();
							local237 = this.aClass1_Sub3_Sub3_2.method336();
							if (this.anIntArray61[local214] != local237) {
								this.anIntArray61[local214] = local237;
								this.method130(local214);
							}
						} else if (this.anInt106 == 138) {
							local214 = this.aClass1_Sub3_Sub3_2.method333();
							local237 = this.aClass1_Sub3_Sub3_2.method333();
							if (this.anInt190 != -1) {
								this.anInt190 = -1;
								this.aBoolean36 = true;
							}
							if (this.aBoolean30) {
								this.aBoolean30 = false;
								this.aBoolean36 = true;
							}
							this.anInt101 = local214;
							this.anInt100 = local237;
							this.aBoolean21 = true;
							this.aBoolean34 = true;
							this.aBoolean28 = false;
						} else if (this.anInt106 == 48) {
							this.anInt114 = this.aClass1_Sub3_Sub3_2.method331();
							this.anInt115 = this.aClass1_Sub3_Sub3_2.method331();
							while (this.aClass1_Sub3_Sub3_2.anInt394 < this.anInt105) {
								local214 = this.aClass1_Sub3_Sub3_2.method331();
								this.method108(this.aClass1_Sub3_Sub3_2, local214);
							}
						} else if (this.anInt106 == 27) {
							this.anInt98 = this.aClass1_Sub3_Sub3_2.method333();
						} else if (this.anInt106 == 85) {
							if (this.aBoolean35) {
								signlink.jingle = this.aClass1_Sub3_Sub3_2.method338();
								signlink.jinglelen = this.aClass1_Sub3_Sub3_2.method333();
							}
						} else if (this.anInt106 == 227) {
							this.aBoolean21 = true;
							local214 = this.aClass1_Sub3_Sub3_2.method333();
							local1349 = Class7.aClass7Array1[local214];
							local239 = this.aClass1_Sub3_Sub3_2.method331();
							for (local245 = 0; local245 < local239; local245++) {
								local1349.anIntArray100[local245] = this.aClass1_Sub3_Sub3_2.method333();
								local249 = this.aClass1_Sub3_Sub3_2.method331();
								if (local249 == 255) {
									local249 = this.aClass1_Sub3_Sub3_2.method336();
								}
								local1349.anIntArray101[local245] = local249;
							}
							for (local249 = local239; local249 < local1349.anIntArray100.length; local249++) {
								local1349.anIntArray100[local249] = 0;
								local1349.anIntArray101[local249] = 0;
							}
						} else if (this.anInt106 == 188) {
							this.anInt114 = this.aClass1_Sub3_Sub3_2.method331();
							this.anInt115 = this.aClass1_Sub3_Sub3_2.method331();
							local214 = this.anInt114;
							label691: while (true) {
								if (local214 >= this.anInt114 + 8) {
									@Pc(2247) Class1_Sub4 local2247 = (Class1_Sub4) this.aClass23_2.method352();
									while (true) {
										if (local2247 == null) {
											break label691;
										}
										if (local2247.anInt418 >= this.anInt114 && local2247.anInt418 < this.anInt114 + 8 && local2247.anInt419 >= this.anInt115 && local2247.anInt419 < this.anInt115 + 8 && local2247.anInt416 == this.anInt173) {
											this.method107(local2247.anInt416, local2247.anInt425, local2247.anInt419, local2247.anInt418, local2247.anInt417, local2247.anInt424, local2247.anInt423);
											local2247.method478();
										}
										local2247 = (Class1_Sub4) this.aClass23_2.method354();
									}
								}
								for (local237 = this.anInt115; local237 < this.anInt115 + 8; local237++) {
									if (this.aClass23ArrayArrayArray1[this.anInt173][local214][local237] != null) {
										this.aClass23ArrayArrayArray1[this.anInt173][local214][local237] = null;
										this.method109(local214, local237);
									}
								}
								local214++;
							}
						} else if (this.anInt106 == 9) {
							local214 = this.aClass1_Sub3_Sub3_2.method333();
							local963 = this.aClass1_Sub3_Sub3_2.method338();
							Class7.aClass7Array1[local214].aString16 = local963;
						} else if (this.anInt106 == 126) {
							this.method87();
							return false;
						} else if (this.anInt106 == 229) {
							local1745 = this.aClass1_Sub3_Sub3_2.method337();
							local239 = this.aClass1_Sub3_Sub3_2.method336();
							@Pc(2350) boolean local2350 = false;
							for (local249 = 0; local249 < 100; local249++) {
								if (this.anIntArray36[local249] == local239) {
									local2350 = true;
									break;
								}
							}
							for (local253 = 0; local253 < this.anInt153; local253++) {
								if (this.aLongArray3[local253] == local1745) {
									local2350 = true;
									break;
								}
							}
							if (!local2350) {
								this.anIntArray36[this.anInt89] = local239;
								this.anInt89 = (this.anInt89 + 1) % 100;
								@Pc(2413) String local2413 = Class36.method437(this.aClass1_Sub3_Sub3_2, this.anInt105 - 12);
								@Pc(2418) String local2418 = Class17.method292(this.anInt203, local2413);
								this.method136(3, Class35.method434(Class35.method431(local1745)), local2418);
							}
						} else if (this.anInt106 == 6) {
							this.anInt153 = this.anInt105 / 8;
							for (local214 = 0; local214 < this.anInt153; local214++) {
								this.aLongArray3[local214] = this.aClass1_Sub3_Sub3_2.method337();
							}
						} else if (this.anInt106 == 53) {
							this.anInt118 = this.aClass1_Sub3_Sub3_2.method333() * 30;
						} else if (this.anInt106 == 116) {
							local214 = this.aClass1_Sub3_Sub3_2.method333();
							this.method128(local214);
							if (this.anInt100 != -1) {
								this.anInt100 = -1;
								this.aBoolean21 = true;
								this.aBoolean34 = true;
							}
							this.anInt190 = local214;
							this.aBoolean36 = true;
							this.anInt101 = -1;
							this.aBoolean28 = false;
						} else if (this.anInt106 == 107) {
							local214 = this.aClass1_Sub3_Sub3_2.method333();
							local237 = this.aClass1_Sub3_Sub3_2.method333();
							local239 = this.aClass1_Sub3_Sub3_2.method333();
							@Pc(2530) Class39 local2530 = Class39.method471(local237);
							Class7.aClass7Array1[local214].aClass1_Sub3_Sub1_1 = local2530.method474();
							Class7.aClass7Array1[local214].anInt252 = local2530.anInt769;
							Class7.aClass7Array1[local214].anInt253 = local2530.anInt770;
							Class7.aClass7Array1[local214].anInt251 = local2530.anInt768 * 100 / local239;
						} else if (this.anInt106 == 75) {
							this.aBoolean20 = false;
							this.aBoolean30 = true;
							this.aString8 = "";
							this.aBoolean36 = true;
						} else if (this.anInt106 == 124) {
							local214 = this.aClass1_Sub3_Sub3_2.method333();
							this.method128(local214);
							if (this.anInt190 != -1) {
								this.anInt190 = -1;
								this.aBoolean36 = true;
							}
							if (this.aBoolean30) {
								this.aBoolean30 = false;
								this.aBoolean36 = true;
							}
							this.anInt100 = local214;
							this.aBoolean21 = true;
							this.aBoolean34 = true;
							this.anInt101 = -1;
							this.aBoolean28 = false;
						}
					}
				}
			}
			this.anInt106 = -1;
		} catch (@Pc(2629) IOException local2629) {
			this.method88();
		} catch (@Pc(2634) Exception local2634) {
			this.method87();
		}
		return true;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIBIIII)V")
	private void method107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (aBoolean23 && arg0 != this.anInt173) {
			return;
		}
		@Pc(14) int local14 = 0;
		if (arg4 == 0) {
			local14 = this.aClass28_1.method386(arg0, arg3, arg2);
		}
		if (arg4 == 1) {
			local14 = this.aClass28_1.method387(arg0, arg2, arg3);
		}
		if (arg4 == 2) {
			local14 = this.aClass28_1.method388(arg0, arg3, arg2);
		}
		if (arg4 == 3) {
			local14 = this.aClass28_1.method389(arg0, arg3, arg2);
		}
		@Pc(70) int local70;
		if (local14 != 0) {
			local70 = this.aClass28_1.method390(arg0, arg3, arg2, local14);
			@Pc(76) int local76 = local14 >> 14 & 0x7FFF;
			@Pc(80) int local80 = local70 & 0x1F;
			@Pc(84) int local84 = local70 >> 6;
			@Pc(96) Class37 local96;
			if (arg4 == 0) {
				this.aClass28_1.method381(arg0, arg3, arg2);
				local96 = Class37.method445(local76);
				if (local96.aBoolean115) {
					this.aClass2Array1[arg0].method25(local96.aBoolean116, local84, arg3, local80, arg2);
				}
			}
			if (arg4 == 1) {
				this.aClass28_1.method382(arg0, arg3, arg2);
			}
			if (arg4 == 2) {
				this.aClass28_1.method383(arg0, arg2, arg3);
				local96 = Class37.method445(local76);
				if (local96.aBoolean115) {
					this.aClass2Array1[arg0].method26(arg3, local96.aBoolean116, local96.anInt624, local96.anInt625, local84, arg2);
				}
			}
			if (arg4 == 3) {
				this.aClass28_1.method384(arg0, arg2, arg3);
				local96 = Class37.method445(local76);
				if (local96.aBoolean115 && local96.aBoolean117) {
					this.aClass2Array1[arg0].method28(this.aBoolean40, arg2, arg3);
				}
			}
		}
		if (arg6 < 0) {
			return;
		}
		local70 = arg0;
		if (arg0 < 3 && (this.aByteArrayArrayArray7[1][arg3][arg2] & 0x2) == 2) {
			local70 = arg0 + 1;
		}
		Class4.method49(local70, this.aClass23_3, arg2, arg0, arg5, this.aClass2Array1[arg0], this.anIntArrayArrayArray3, arg6, this.aClass28_1, arg3, arg1);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!jb;I)V")
	private void method108(@OriginalArg(1) Class1_Sub3_Sub3 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16;
		@Pc(25) int local25;
		@Pc(32) int local32;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(43) int local43;
		@Pc(48) int local48;
		@Pc(53) int local53;
		@Pc(109) int local109;
		@Pc(111) int local111;
		@Pc(113) int local113;
		if (arg1 == 22 || arg1 == 35) {
			local16 = arg0.method331();
			local25 = this.anInt114 + (local16 >> 4 & 0x7);
			local32 = this.anInt115 + (local16 & 0x7);
			local35 = arg0.method331();
			local39 = local35 >> 2;
			local43 = local35 & 0x3;
			local48 = this.anIntArray37[local39];
			if (arg1 == 35) {
				local53 = -1;
			} else {
				local53 = arg0.method333();
			}
			if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
				@Pc(70) Class1_Sub4 local70 = null;
				for (@Pc(75) Class1_Sub4 local75 = (Class1_Sub4) this.aClass23_2.method352(); local75 != null; local75 = (Class1_Sub4) this.aClass23_2.method354()) {
					if (local75.anInt416 == this.anInt173 && local75.anInt418 == local25 && local75.anInt419 == local32 && local75.anInt417 == local48) {
						local70 = local75;
						break;
					}
				}
				if (local70 == null) {
					local109 = 0;
					local111 = -1;
					local113 = 0;
					@Pc(115) int local115 = 0;
					if (local48 == 0) {
						local109 = this.aClass28_1.method386(this.anInt173, local25, local32);
					}
					if (local48 == 1) {
						local109 = this.aClass28_1.method387(this.anInt173, local32, local25);
					}
					if (local48 == 2) {
						local109 = this.aClass28_1.method388(this.anInt173, local25, local32);
					}
					if (local48 == 3) {
						local109 = this.aClass28_1.method389(this.anInt173, local25, local32);
					}
					if (local109 != 0) {
						@Pc(170) int local170 = this.aClass28_1.method390(this.anInt173, local25, local32, local109);
						local111 = local109 >> 14 & 0x7FFF;
						local113 = local170 & 0x1F;
						local115 = local170 >> 6;
					}
					local70 = new Class1_Sub4();
					local70.anInt416 = this.anInt173;
					local70.anInt417 = local48;
					local70.anInt418 = local25;
					local70.anInt419 = local32;
					local70.anInt423 = local111;
					local70.anInt425 = local113;
					local70.anInt424 = local115;
					this.aClass23_2.method350(local70);
				}
				local70.anInt420 = local53;
				local70.anInt422 = local39;
				local70.anInt421 = local43;
				this.method107(this.anInt173, local39, local32, local25, local48, local43, local53);
			}
		} else if (arg1 == 175) {
			local16 = arg0.method331();
			local25 = this.anInt114 + (local16 >> 4 & 0x7);
			local32 = this.anInt115 + (local16 & 0x7);
			local35 = arg0.method331();
			local39 = local35 >> 2;
			local43 = this.anIntArray37[local39];
			local48 = arg0.method333();
			if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
				local53 = 0;
				if (local43 == 1) {
					local53 = this.aClass28_1.method387(this.anInt173, local32, local25);
				}
				if (local43 == 2) {
					local53 = this.aClass28_1.method388(this.anInt173, local25, local32);
				}
				if (local53 != 0) {
					@Pc(327) Class1_Sub6 local327 = new Class1_Sub6(local43, this.anInt173, local53 >> 14 & 0x7FFF, 5858, Class11.aClass11Array1[local48], local25, local32);
					this.aClass23_3.method350(local327);
				}
			}
		} else if (arg1 == 127) {
			local16 = arg0.method331();
			local25 = this.anInt114 + (local16 >> 4 & 0x7);
			local32 = this.anInt115 + (local16 & 0x7);
			local35 = arg0.method333();
			if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
				@Pc(371) Class1_Sub7 local371 = new Class1_Sub7();
				local371.anInt569 = local35;
				if (this.aClass23ArrayArrayArray1[this.anInt173][local25][local32] == null) {
					this.aClass23ArrayArrayArray1[this.anInt173][local25][local32] = new Class23(845);
				}
				this.aClass23ArrayArrayArray1[this.anInt173][local25][local32].method350(local371);
				this.method109(local25, local32);
			}
		} else {
			@Pc(464) Class1_Sub7 local464;
			if (arg1 == 250) {
				local16 = arg0.method331();
				local25 = this.anInt114 + (local16 >> 4 & 0x7);
				local32 = this.anInt115 + (local16 & 0x7);
				local35 = arg0.method333();
				if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
					@Pc(458) Class23 local458 = this.aClass23ArrayArrayArray1[this.anInt173][local25][local32];
					if (local458 != null) {
						for (local464 = (Class1_Sub7) local458.method352(); local464 != null; local464 = (Class1_Sub7) local458.method354()) {
							if (local464.anInt569 == (local35 & 0x7FFF)) {
								local464.method478();
								break;
							}
						}
						if (local458.method352() == null) {
							this.aClass23ArrayArrayArray1[this.anInt173][local25][local32] = null;
						}
						this.method109(local25, local32);
					}
				}
			} else {
				@Pc(545) int local545;
				@Pc(548) int local548;
				if (arg1 == 60) {
					local16 = arg0.method331();
					local25 = this.anInt114 + (local16 >> 4 & 0x7);
					local32 = this.anInt115 + (local16 & 0x7);
					local35 = local25 + arg0.method332();
					local39 = local32 + arg0.method332();
					local43 = arg0.method334();
					local48 = arg0.method333();
					local53 = arg0.method331();
					local545 = arg0.method331();
					local548 = arg0.method333();
					local109 = arg0.method333();
					local111 = arg0.method331();
					local113 = arg0.method331();
					if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104 && local35 >= 0 && local39 >= 0 && local35 < 104 && local39 < 104) {
						local25 = local25 * 128 + 64;
						local32 = local32 * 128 + 64;
						local35 = local35 * 128 + 64;
						local39 = local39 * 128 + 64;
						@Pc(631) Class1_Sub1_Sub3 local631 = new Class1_Sub1_Sub3(this.anInt173, local113, local25, this.aBoolean39, local111, this.method94(local25, local32, this.anInt173) - local53, local48, local548 + anInt85, local545, local32, local109 + anInt85, local43);
						local631.method480(local39, this.method94(local35, local39, this.anInt173) - local545, local35, this.anInt92, local548 + anInt85);
						this.aClass23_5.method350(local631);
					}
				} else if (arg1 == 59) {
					local16 = arg0.method331();
					local25 = this.anInt114 + (local16 >> 4 & 0x7);
					local32 = this.anInt115 + (local16 & 0x7);
					local35 = arg0.method333();
					local39 = arg0.method331();
					local43 = arg0.method333();
					if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
						local25 = local25 * 128 + 64;
						local32 = local32 * 128 + 64;
						@Pc(728) Class1_Sub1_Sub1 local728 = new Class1_Sub1_Sub1(this.method94(local25, local32, this.anInt173) - local39, 0, local43, local35, this.anInt173, local25, local32, anInt85);
						this.aClass23_1.method350(local728);
					}
				} else if (arg1 == 90) {
					local16 = arg0.method331();
					local25 = this.anInt114 + (local16 >> 4 & 0x7);
					local32 = this.anInt115 + (local16 & 0x7);
					local35 = arg0.method333();
					local39 = arg0.method333();
					if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104 && local39 != this.anInt98) {
						local464 = new Class1_Sub7();
						local464.anInt569 = local35;
						if (this.aClass23ArrayArrayArray1[this.anInt173][local25][local32] == null) {
							this.aClass23ArrayArrayArray1[this.anInt173][local25][local32] = new Class23(845);
						}
						this.aClass23ArrayArrayArray1[this.anInt173][local25][local32].method350(local464);
						this.method109(local25, local32);
					}
				} else if (arg1 == 153) {
					local16 = arg0.method331();
					local25 = this.anInt114 + (local16 >> 4 & 0x7);
					local32 = this.anInt115 + (local16 & 0x7);
					local35 = arg0.method331();
					local39 = local35 >> 2;
					local43 = local35 & 0x3;
					local48 = this.anIntArray37[local39];
					local53 = arg0.method333();
					local545 = arg0.method333();
					local548 = arg0.method333();
					local109 = arg0.method333();
					@Pc(874) byte local874 = arg0.method332();
					@Pc(877) byte local877 = arg0.method332();
					@Pc(880) byte local880 = arg0.method332();
					@Pc(883) byte local883 = arg0.method332();
					@Pc(890) Class1_Sub1_Sub2_Sub2 local890;
					if (local109 == this.anInt98) {
						local890 = this.aClass1_Sub1_Sub2_Sub2_1;
					} else {
						local890 = this.aClass1_Sub1_Sub2_Sub2Array1[local109];
					}
					if (local890 != null) {
						@Pc(915) Class1_Sub5 local915 = new Class1_Sub5(local39, (byte) 4, local545 + anInt85, this.anInt173, local32, local43, -1, local48, local25);
						this.aClass23_4.method350(local915);
						@Pc(935) Class1_Sub5 local935 = new Class1_Sub5(local39, (byte) 4, local548 + anInt85, this.anInt173, local32, local43, local53, local48, local25);
						this.aClass23_4.method350(local935);
						@Pc(949) int local949 = this.anIntArrayArrayArray3[this.anInt173][local25][local32];
						@Pc(961) int local961 = this.anIntArrayArrayArray3[this.anInt173][local25 + 1][local32];
						@Pc(975) int local975 = this.anIntArrayArrayArray3[this.anInt173][local25 + 1][local32 + 1];
						@Pc(987) int local987 = this.anIntArrayArrayArray3[this.anInt173][local25][local32 + 1];
						@Pc(990) Class37 local990 = Class37.method445(local53);
						local890.anInt754 = local545 + anInt85;
						local890.anInt755 = local548 + anInt85;
						local890.aClass1_Sub3_Sub1_9 = local990.method448(local39, local43, local949, local961, local975, local987, -1);
						@Pc(1014) int local1014 = local990.anInt624;
						@Pc(1017) int local1017 = local990.anInt625;
						if (local43 == 1 || local43 == 3) {
							local1014 = local990.anInt625;
							local1017 = local990.anInt624;
						}
						local890.anInt756 = local25 * 128 + local1014 * 64;
						local890.anInt758 = local32 * 128 + local1017 * 64;
						local890.anInt757 = this.method94(local890.anInt756, local890.anInt758, this.anInt173);
						@Pc(1063) byte local1063;
						if (local874 > local880) {
							local1063 = local874;
							local874 = local880;
							local880 = local1063;
						}
						if (local877 > local883) {
							local1063 = local877;
							local877 = local883;
							local883 = local1063;
						}
						local890.anInt759 = local25 + local874;
						local890.anInt761 = local25 + local880;
						local890.anInt760 = local32 + local877;
						local890.anInt762 = local32 + local883;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class23 local9 = this.aClass23ArrayArrayArray1[this.anInt173][arg0][arg1];
		if (local9 == null) {
			this.aClass28_1.method385(this.anInt173, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class39 local23 = null;
		for (@Pc(27) Class1_Sub7 local27 = (Class1_Sub7) local9.method352(); local27 != null; local27 = (Class1_Sub7) local9.method354()) {
			@Pc(32) Class39 local32 = Class39.method471(local27.anInt569);
			if (local32.anInt775 > local21) {
				local21 = local32.anInt775;
				local23 = local32;
			}
		}
		@Pc(56) int local56 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass28_1.method370(this.method94(arg0 * 128 + 64, arg1 * 128 + 64, this.anInt173), this.anInt173, local56, local23.method474(), arg0, arg1);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!jb;)V")
	private void method110(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub3_Sub3 arg1) {
		@Pc(7) int local7 = 0;
		arg1.method341();
		this.anInt173 = arg1.method342(2);
		@Pc(21) int local21 = arg1.method342(7);
		@Pc(26) int local26 = arg1.method342(7);
		@Pc(31) int local31 = arg1.method342(1);
		if (local31 == 1) {
			local7++;
			this.anIntArray32[0] = this.anInt120;
		}
		this.aClass1_Sub1_Sub2_Sub2_1.method463(this.anInt168, local21, local26);
		this.anInt159 = 0;
		@Pc(56) int local56 = arg1.method342(8);
		@Pc(62) int local62;
		if (local56 < this.anInt201) {
			for (local62 = local56; local62 < this.anInt121; local62++) {
				this.anIntArray51[this.anInt159++] = this.anIntArray31[local62];
				this.aClass1_Sub1_Sub2_Sub2Array1[this.anIntArray31[local62]].aBoolean128 = true;
			}
		}
		this.anInt121 = 0;
		@Pc(104) int local104;
		@Pc(109) Class1_Sub1_Sub2_Sub2 local109;
		@Pc(114) int local114;
		@Pc(134) int local134;
		@Pc(188) int local188;
		for (local62 = 0; local62 < local56; local62++) {
			local104 = this.anIntArray31[local62];
			local109 = this.aClass1_Sub1_Sub2_Sub2Array1[local104];
			local114 = arg1.method342(1);
			if (local114 == 0) {
				this.anIntArray31[this.anInt121++] = local104;
			} else {
				local134 = arg1.method342(2);
				if (local134 == 3) {
					this.anIntArray51[this.anInt159++] = local104;
					local109.aBoolean128 = true;
				} else {
					this.anIntArray31[this.anInt121++] = local104;
					if (local134 == 0) {
						this.anIntArray32[local7++] = local104;
					} else {
						if (local134 == 2) {
							this.anIntArray32[local7++] = local104;
						}
						local188 = arg1.method342(3);
						if (local188 == 0) {
							local109.method464(1, -1);
						}
						if (local188 == 1) {
							local109.method464(1, 0);
						}
						if (local188 == 2) {
							local109.method464(1, 1);
						}
						if (local188 == 3) {
							local109.method464(0, -1);
						}
						if (local188 == 4) {
							local109.method464(0, 1);
						}
						if (local188 == 5) {
							local109.method464(-1, -1);
						}
						if (local188 == 6) {
							local109.method464(-1, 0);
						}
						if (local188 == 7) {
							local109.method464(-1, 1);
						}
					}
				}
			}
		}
		while (true) {
			local104 = arg1.method342(11);
			if (local104 == 2047 || arg1.anInt395 + 10 >= arg0 * 8) {
				arg1.method343();
				@Pc(374) int local374;
				for (local104 = 0; local104 < local7; local104++) {
					local374 = this.anIntArray32[local104];
					@Pc(379) Class1_Sub1_Sub2_Sub2 local379 = this.aClass1_Sub1_Sub2_Sub2Array1[local374];
					local134 = arg1.method331();
					if ((local134 & 0x80) == 128) {
						local134 += arg1.method331() << 8;
					}
					if ((local134 & 0x1) == 1) {
						local188 = arg1.method331();
						@Pc(405) byte[] local405 = new byte[local188];
						@Pc(411) Class1_Sub3_Sub3 local411 = new Class1_Sub3_Sub3(local405, (byte) 63);
						arg1.method340(0, local188, local405);
						this.aClass1_Sub3_Sub3Array1[local374] = local411;
						local379.method465(local411);
					}
					@Pc(449) int local449;
					if ((local134 & 0x2) == 2) {
						local188 = arg1.method333();
						if (local188 == 65535) {
							local188 = -1;
						}
						if (local188 == local379.anInt726) {
							local379.anInt730 = 0;
						}
						local449 = arg1.method331();
						if (local188 == -1 || local379.anInt726 == -1 || Class11.aClass11Array1[local188].anInt297 > Class11.aClass11Array1[local379.anInt726].anInt297) {
							local379.anInt726 = local188;
							local379.anInt727 = 0;
							local379.anInt728 = 0;
							local379.anInt729 = local449;
							local379.anInt730 = 0;
						}
					}
					if ((local134 & 0x4) == 4) {
						local379.anInt720 = arg1.method333();
						if (local379.anInt720 == 65535) {
							local379.anInt720 = -1;
						}
					}
					if ((local134 & 0x8) == 8) {
						local379.aString26 = arg1.method338();
						local379.anInt713 = 0;
						local379.anInt714 = 0;
						local379.anInt712 = 150;
						this.method136(2, local379.aString27, local379.aString26);
					}
					if ((local134 & 0x10) == 16) {
						local379.anInt715 = arg1.method331();
						local379.anInt716 = arg1.method331();
						local379.anInt717 = anInt85 + 400;
						local379.anInt718 = arg1.method331();
						local379.anInt719 = arg1.method331();
					}
					if ((local134 & 0x20) == 32) {
						local379.anInt721 = arg1.method333();
						local379.anInt722 = arg1.method333();
					}
					if ((local134 & 0x40) == 64) {
						local188 = arg1.method333();
						local449 = arg1.method331();
						@Pc(577) long local577 = Class35.method430(local379.aString27);
						@Pc(579) boolean local579 = false;
						for (@Pc(581) int local581 = 0; local581 < this.anInt153; local581++) {
							if (this.aLongArray3[local581] == local577) {
								local579 = true;
								break;
							}
						}
						if (!local579) {
							@Pc(606) String local606 = Class36.method437(arg1, local449);
							@Pc(611) String local611 = Class17.method292(this.anInt203, local606);
							local379.aString26 = local611;
							local379.anInt713 = local188 >> 8;
							local379.anInt714 = local188 & 0xFF;
							local379.anInt712 = 150;
							this.method136(2, local379.aString27, local611);
						}
					}
					if ((local134 & 0x100) == 256) {
						local379.anInt731 = arg1.method333();
						local188 = arg1.method336();
						local379.anInt735 = local188 >> 16;
						local379.anInt734 = anInt85 + (local188 & 0xFFFF);
						local379.anInt732 = 0;
						local379.anInt733 = 0;
						if (local379.anInt734 > anInt85) {
							local379.anInt732 = -1;
						}
						if (local379.anInt731 == 65535) {
							local379.anInt731 = -1;
						}
					}
					if ((local134 & 0x200) == 512) {
						local379.anInt736 = arg1.method331();
						local379.anInt738 = arg1.method331();
						local379.anInt737 = arg1.method331();
						local379.anInt739 = arg1.method331();
						local379.anInt740 = arg1.method333() + anInt85;
						local379.anInt741 = arg1.method333() + anInt85;
						local379.anInt742 = arg1.method331();
						local379.anInt745 = 0;
						local379.anIntArray207[0] = local379.anInt737;
						local379.anIntArray208[0] = local379.anInt739;
					}
				}
				for (local374 = 0; local374 < this.anInt159; local374++) {
					local114 = this.anIntArray51[local374];
					if (this.aClass1_Sub1_Sub2_Sub2Array1[local114].aBoolean128) {
						this.method101(local114);
					}
				}
				return;
			}
			if (this.aClass1_Sub1_Sub2_Sub2Array1[local104] == null) {
				this.aClass1_Sub1_Sub2_Sub2Array1[local104] = new Class1_Sub1_Sub2_Sub2();
				if (this.aClass1_Sub3_Sub3Array1[local104] != null) {
					this.aClass1_Sub1_Sub2_Sub2Array1[local104].method465(this.aClass1_Sub3_Sub3Array1[local104]);
				}
			}
			this.anIntArray31[this.anInt121++] = local104;
			local109 = this.aClass1_Sub1_Sub2_Sub2Array1[local104];
			local109.aBoolean128 = false;
			local114 = arg1.method342(5);
			if (local114 > 15) {
				local114 -= 32;
			}
			local134 = arg1.method342(5);
			if (local134 > 15) {
				local134 -= 32;
			}
			local109.method463(this.anInt168, this.aClass1_Sub1_Sub2_Sub2_1.anIntArray207[0] + local114, this.aClass1_Sub1_Sub2_Sub2_1.anIntArray208[0] + local134);
			this.anIntArray32[local7++] = local104;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!jb;ZI)V")
	private void method111(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(2) int arg1) {
		this.anInt159 = 0;
		this.aBoolean41 &= true;
		arg0.method341();
		@Pc(18) int local18 = arg0.method342(8);
		@Pc(24) int local24;
		if (local18 < this.anInt201) {
			for (local24 = local18; local24 < this.anInt201; local24++) {
				this.anIntArray51[this.anInt159++] = this.anIntArray60[local24];
				this.aClass1_Sub1_Sub2_Sub1Array1[this.anIntArray60[local24]].aBoolean128 = true;
			}
		}
		local24 = 0;
		this.anInt201 = 0;
		@Pc(68) int local68;
		@Pc(73) Class1_Sub1_Sub2_Sub1 local73;
		@Pc(78) int local78;
		@Pc(98) int local98;
		@Pc(152) int local152;
		for (@Pc(61) int local61 = 0; local61 < local18; local61++) {
			local68 = this.anIntArray60[local61];
			local73 = this.aClass1_Sub1_Sub2_Sub1Array1[local68];
			local78 = arg0.method342(1);
			if (local78 == 0) {
				this.anIntArray60[this.anInt201++] = local68;
			} else {
				local98 = arg0.method342(2);
				if (local98 == 3) {
					this.anIntArray51[this.anInt159++] = local68;
					local73.aBoolean128 = true;
				} else {
					this.anIntArray60[this.anInt201++] = local68;
					if (local98 == 0) {
						this.anIntArray32[local24++] = local68;
					} else {
						if (local98 == 2) {
							this.anIntArray32[local24++] = local68;
						}
						local152 = arg0.method342(3);
						if (local152 == 0) {
							local73.method464(1, -1);
						}
						if (local152 == 1) {
							local73.method464(1, 0);
						}
						if (local152 == 2) {
							local73.method464(1, 1);
						}
						if (local152 == 3) {
							local73.method464(0, -1);
						}
						if (local152 == 4) {
							local73.method464(0, 1);
						}
						if (local152 == 5) {
							local73.method464(-1, -1);
						}
						if (local152 == 6) {
							local73.method464(-1, 0);
						}
						if (local152 == 7) {
							local73.method464(-1, 1);
						}
					}
				}
			}
		}
		while (true) {
			local68 = arg0.method342(13);
			if (local68 == 8191 || arg0.anInt395 + 21 >= arg1 * 8) {
				arg0.method343();
				@Pc(368) int local368;
				for (local68 = 0; local68 < local24; local68++) {
					local368 = this.anIntArray32[local68];
					@Pc(373) Class1_Sub1_Sub2_Sub1 local373 = this.aClass1_Sub1_Sub2_Sub1Array1[local368];
					local98 = arg0.method331();
					if ((local98 & 0x2) == 2) {
						local152 = arg0.method333();
						if (local152 == 65535) {
							local152 = -1;
						}
						if (local152 == local373.anInt726) {
							local373.anInt730 = 0;
						}
						@Pc(399) int local399 = arg0.method331();
						if (local152 == -1 || local373.anInt726 == -1 || Class11.aClass11Array1[local152].anInt297 > Class11.aClass11Array1[local373.anInt726].anInt297) {
							local373.anInt726 = local152;
							local373.anInt727 = 0;
							local373.anInt728 = 0;
							local373.anInt729 = local399;
							local373.anInt730 = 0;
						}
					}
					if ((local98 & 0x4) == 4) {
						local373.anInt720 = arg0.method333();
						if (local373.anInt720 == 65535) {
							local373.anInt720 = -1;
						}
					}
					if ((local98 & 0x8) == 8) {
						local373.aString26 = arg0.method338();
						local373.anInt712 = 100;
					}
					if ((local98 & 0x10) == 16) {
						local373.anInt715 = arg0.method331();
						local373.anInt716 = arg0.method331();
						local373.anInt717 = anInt85 + 400;
						local373.anInt718 = arg0.method331();
						local373.anInt719 = arg0.method331();
					}
					if ((local98 & 0x20) == 32) {
						local373.aClass38_1 = Class38.method457(arg0.method333());
						local373.anInt706 = local373.aClass38_1.anInt688;
						local373.anInt707 = local373.aClass38_1.anInt689;
						local373.anInt708 = local373.aClass38_1.anInt690;
						local373.anInt709 = local373.aClass38_1.anInt691;
						local373.anInt710 = local373.aClass38_1.anInt687;
					}
					if ((local98 & 0x40) == 64) {
						local373.anInt731 = arg0.method333();
						local152 = arg0.method336();
						local373.anInt735 = local152 >> 16;
						local373.anInt734 = anInt85 + (local152 & 0xFFFF);
						local373.anInt732 = 0;
						local373.anInt733 = 0;
						if (local373.anInt734 > anInt85) {
							local373.anInt732 = -1;
						}
						if (local373.anInt731 == 65535) {
							local373.anInt731 = -1;
						}
					}
				}
				for (local368 = 0; local368 < this.anInt159; local368++) {
					local78 = this.anIntArray51[local368];
					if (this.aClass1_Sub1_Sub2_Sub1Array1[local78].aBoolean128) {
						this.method103(local78);
					}
				}
				return;
			}
			this.anIntArray60[this.anInt201++] = local68;
			if (this.aClass1_Sub1_Sub2_Sub1Array1[local68] == null) {
				this.aClass1_Sub1_Sub2_Sub1Array1[local68] = new Class1_Sub1_Sub2_Sub1();
			}
			local73 = this.aClass1_Sub1_Sub2_Sub1Array1[local68];
			local73.aBoolean128 = false;
			local73.aClass38_1 = Class38.method457(arg0.method342(11));
			local73.anInt705 = local73.aClass38_1.aByte34;
			local73.anInt706 = local73.aClass38_1.anInt688;
			local73.anInt707 = local73.aClass38_1.anInt689;
			local73.anInt708 = local73.aClass38_1.anInt690;
			local73.anInt709 = local73.aClass38_1.anInt691;
			local73.anInt710 = local73.aClass38_1.anInt687;
			local78 = arg0.method342(5);
			if (local78 > 15) {
				local78 -= 32;
			}
			local98 = arg0.method342(5);
			if (local98 > 15) {
				local98 -= 32;
			}
			local73.method463(this.anInt168, this.aClass1_Sub1_Sub2_Sub2_1.anIntArray207[0] + local78, this.aClass1_Sub1_Sub2_Sub2_1.anIntArray208[0] + local98);
			local152 = arg0.method342(1);
			if (local152 == 1) {
				this.anIntArray32[local24++] = local68;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method112() {
		this.aBoolean41 &= true;
		if (this.anInt158 < 2 && this.anInt110 == 0 && this.anInt169 == 0) {
			return;
		}
		@Pc(37) String local37;
		if (this.anInt110 == 1 && this.anInt158 < 2) {
			local37 = "Use " + this.aString3 + " with...";
		} else if (this.anInt169 == 1 && this.anInt158 < 2) {
			local37 = this.aString9 + "...";
		} else {
			local37 = this.aStringArray1[this.anInt158 - 1];
		}
		if (this.anInt158 > 2) {
			local37 = local37 + "@whi@ / " + (this.anInt158 - 2) + " more options";
		}
		this.aClass1_Sub3_Sub2_Sub4_3.method279(true, 4, 15, 16777215, local37);
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method113() {
		@Pc(2) int local2 = this.anInt149;
		@Pc(5) int local5 = this.anInt150;
		@Pc(8) int local8 = this.anInt151;
		@Pc(11) int local11 = this.anInt152;
		Class1_Sub3_Sub2.method270(6116423, local8, local5, local11, local2);
		Class1_Sub3_Sub2.method270(0, local8 - 2, local5 + 1, 16, local2 + 1);
		Class1_Sub3_Sub2.method271(local8 - 2, local11 - 19, local2 + 1, local5 + 18, 0);
		this.aClass1_Sub3_Sub2_Sub4_3.method277("Choose Option", local2 + 3, local5 + 14, 6116423);
		@Pc(67) int local67 = super.anInt78;
		@Pc(70) int local70 = super.anInt79;
		if (this.anInt148 == 0) {
			local67 -= 8;
			local70 -= 11;
		}
		if (this.anInt148 == 1) {
			local67 -= 562;
			local70 -= 231;
		}
		for (@Pc(83) int local83 = 0; local83 < this.anInt158; local83++) {
			@Pc(98) int local98 = local5 + (this.anInt158 - 1 - local83) * 15 + 31;
			@Pc(100) int local100 = 16777215;
			if (local67 > local2 && local67 < local2 + local8 && local70 > local98 - 13 && local70 < local98 + 3) {
				local100 = 16776960;
			}
			this.aClass1_Sub3_Sub2_Sub4_3.method279(true, local2 + 3, local98, local100, this.aStringArray1[local83]);
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method114() {
		@Pc(9) int local9 = super.anInt80;
		if (this.anInt169 == 1 && super.anInt81 >= 520 && super.anInt82 >= 165 && super.anInt81 <= 788 && super.anInt82 <= 230) {
			local9 = 0;
		}
		@Pc(40) int local40;
		@Pc(43) int local43;
		@Pc(106) int local106;
		@Pc(109) int local109;
		@Pc(112) int local112;
		if (this.aBoolean45) {
			if (local9 != 1) {
				local40 = super.anInt78;
				local43 = super.anInt79;
				if (this.anInt148 == 0) {
					local40 -= 8;
					local43 -= 11;
				}
				if (this.anInt148 == 1) {
					local40 -= 562;
					local43 -= 231;
				}
				if (local40 < this.anInt149 - 10 || local40 > this.anInt149 + this.anInt151 + 10 || local43 < this.anInt150 - 10 || local43 > this.anInt150 + this.anInt152 + 10) {
					this.aBoolean45 = false;
					if (this.anInt148 == 1) {
						this.aBoolean21 = true;
					}
				}
			}
			if (local9 == 1) {
				local40 = this.anInt149;
				local43 = this.anInt150;
				local106 = this.anInt151;
				local109 = super.anInt81;
				local112 = super.anInt82;
				if (this.anInt148 == 0) {
					local109 -= 8;
					local112 -= 11;
				}
				if (this.anInt148 == 1) {
					local109 -= 562;
					local112 -= 231;
				}
				@Pc(125) int local125 = -1;
				for (@Pc(127) int local127 = 0; local127 < this.anInt158; local127++) {
					@Pc(142) int local142 = local43 + (this.anInt158 - 1 - local127) * 15 + 31;
					if (local109 > local40 && local109 < local40 + local106 && local112 > local142 - 13 && local112 < local142 + 3) {
						local125 = local127;
					}
				}
				if (local125 != -1) {
					this.method115(local125);
				}
				this.aBoolean45 = false;
				if (this.anInt148 == 1) {
					this.aBoolean21 = true;
					return;
				}
			}
			return;
		}
		if (local9 == 1 && this.anInt155 == 1 && this.anInt158 > 2) {
			local9 = 2;
		}
		if (local9 == 1 && this.anInt158 > 0) {
			this.method115(this.anInt158 - 1);
		}
		if (local9 != 2 || this.anInt158 <= 0) {
			return;
		}
		local40 = this.aClass1_Sub3_Sub2_Sub4_3.method276("Choose Option");
		for (local43 = 0; local43 < this.anInt158; local43++) {
			local106 = this.aClass1_Sub3_Sub2_Sub4_3.method276(this.aStringArray1[local43]);
			if (local106 > local40) {
				local40 = local106;
			}
		}
		local40 += 8;
		local106 = this.anInt158 * 15 + 21;
		if (super.anInt81 > 8 && super.anInt82 > 11 && super.anInt81 < 520 && super.anInt82 < 345) {
			local109 = super.anInt81 - local40 / 2 - 8;
			if (local109 + local40 > 512) {
				local109 = 512 - local40;
			}
			if (local109 < 0) {
				local109 = 0;
			}
			local112 = super.anInt82 - 11;
			if (local112 + local106 > 334) {
				local112 = 334 - local106;
			}
			if (local112 < 0) {
				local112 = 0;
			}
			this.aBoolean45 = true;
			this.anInt148 = 0;
			this.anInt149 = local109;
			this.anInt150 = local112;
			this.anInt151 = local40;
			this.anInt152 = this.anInt158 * 15 + 22;
		}
		if (super.anInt81 <= 562 || super.anInt82 <= 231 || super.anInt81 >= 752 || super.anInt82 >= 492) {
			return;
		}
		local109 = super.anInt81 - local40 / 2 - 562;
		if (local109 < 0) {
			local109 = 0;
		} else if (local109 + local40 > 190) {
			local109 = 190 - local40;
		}
		local112 = super.anInt82 - 231;
		if (local112 < 0) {
			local112 = 0;
		} else if (local112 + local106 > 261) {
			local112 = 261 - local106;
		}
		this.aBoolean45 = true;
		this.anInt148 = 1;
		this.anInt149 = local109;
		this.anInt150 = local112;
		this.anInt151 = local40;
		this.anInt152 = this.anInt158 * 15 + 22;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method115(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return;
		}
		if (this.aBoolean30) {
			this.aBoolean30 = false;
			this.aBoolean36 = true;
		}
		@Pc(18) int local18 = this.anIntArray38[arg0];
		@Pc(23) int local23 = this.anIntArray39[arg0];
		@Pc(28) int local28 = this.anIntArray40[arg0];
		@Pc(33) int local33 = this.anIntArray41[arg0];
		@Pc(50) Class1_Sub1_Sub2_Sub2 local50;
		if (local28 == 636) {
			local50 = this.aClass1_Sub1_Sub2_Sub2Array1[local33];
			if (local50 != null) {
				this.method105(local50.anIntArray208[0], 0, false, 1, local50.anIntArray207[0], this.aClass1_Sub1_Sub2_Sub2_1.anIntArray207[0], 0, 1, 0, this.aClass1_Sub1_Sub2_Sub2_1.anIntArray208[0]);
				this.anInt162 = super.anInt81;
				this.anInt163 = super.anInt82;
				this.anInt165 = 2;
				this.anInt164 = 0;
				this.aClass1_Sub3_Sub3_1.method323(185);
				this.aClass1_Sub3_Sub3_1.method325(local33);
				this.aClass1_Sub3_Sub3_1.method325(this.anInt113);
				this.aClass1_Sub3_Sub3_1.method325(this.anInt111);
				this.aClass1_Sub3_Sub3_1.method325(this.anInt112);
			}
		}
		@Pc(139) String local139;
		if (local28 == 1294) {
			@Pc(127) int local127 = local33 >> 14 & 0x7FFF;
			@Pc(130) Class37 local130 = Class37.method445(local127);
			if (local130.aByteArray12 == null) {
				local139 = "It's a " + local130.aString23 + ".";
			} else {
				local139 = new String(local130.aByteArray12);
			}
			this.method136(0, "", local139);
		}
		@Pc(174) Class7 local174;
		@Pc(192) int local192;
		if (local28 == 700) {
			this.aClass1_Sub3_Sub3_1.method323(101);
			this.aClass1_Sub3_Sub3_1.method325(local23);
			local174 = Class7.aClass7Array1[local23];
			if (local174.anIntArrayArray11 != null && local174.anIntArrayArray11[0][0] == 5) {
				local192 = local174.anIntArrayArray11[0][1];
				if (this.anIntArray61[local192] != local174.anIntArray103[0]) {
					this.anIntArray61[local192] = local174.anIntArray103[0];
					this.method130(local192);
					this.aBoolean21 = true;
				}
			}
		}
		if (local28 == 54) {
			this.method104(local33, local18, local23, 249);
		}
		@Pc(234) Class1_Sub1_Sub2_Sub1 local234;
		if (local28 == 806) {
			local234 = this.aClass1_Sub1_Sub2_Sub1Array1[local33];
			if (local234 != null) {
				this.method105(local234.anIntArray208[0], 0, false, 1, local234.anIntArray207[0], this.aClass1_Sub1_Sub2_Sub2_1.anIntArray207[0], 0, 1, 0, this.aClass1_Sub1_Sub2_Sub2_1.anIntArray208[0]);
				this.anInt162 = super.anInt81;
				this.anInt163 = super.anInt82;
				this.anInt165 = 2;
				this.anInt164 = 0;
				this.aClass1_Sub3_Sub3_1.method323(28);
				this.aClass1_Sub3_Sub3_1.method325(local33);
				this.aClass1_Sub3_Sub3_1.method325(this.anInt113);
				this.aClass1_Sub3_Sub3_1.method325(this.anInt111);
				this.aClass1_Sub3_Sub3_1.method325(this.anInt112);
			}
		}
		if (local28 == 243) {
			this.method104(local33, local18, local23, 10);
			this.aClass1_Sub3_Sub3_1.method325(this.anInt170);
		}
		@Pc(340) String local340;
		if (local28 == 17) {
			local174 = Class7.aClass7Array1[local23];
			this.anInt169 = 1;
			this.anInt170 = local23;
			this.anInt171 = local174.anInt254;
			this.anInt110 = 0;
			local340 = local174.aString18;
			if (local340.indexOf(" ") != -1) {
				local340 = local340.substring(0, local340.indexOf(" "));
			}
			local139 = local174.aString18;
			if (local139.indexOf(" ") != -1) {
				local139 = local139.substring(local139.indexOf(" ") + 1);
			}
			this.aString9 = local340 + " " + local174.aString19 + " " + local139;
			if (this.anInt171 == 16) {
				this.aBoolean21 = true;
				this.anInt104 = 3;
				this.aBoolean34 = true;
			}
			return;
		}
		if (local28 == 284) {
			if (this.aBoolean45) {
				this.aClass28_1.method398(local23 - 11, local18 - 8);
			} else {
				this.aClass28_1.method398(super.anInt82 - 11, super.anInt81 - 8);
			}
		}
		if (local28 == 669) {
			this.anInt110 = 1;
			this.anInt111 = local18;
			this.anInt112 = local23;
			this.anInt113 = local33;
			this.aString3 = Class39.method471(local33).aString28;
			this.anInt169 = 0;
			return;
		}
		if (local28 == 146) {
			this.method104(local33, local18, local23, 65);
		}
		if (local28 == 237) {
			this.method104(local33, local18, local23, 205);
			this.aClass1_Sub3_Sub3_1.method325(this.anInt113);
			this.aClass1_Sub3_Sub3_1.method325(this.anInt111);
			this.aClass1_Sub3_Sub3_1.method325(this.anInt112);
		}
		if (local28 == 739) {
			this.aClass1_Sub3_Sub3_1.method323(101);
			this.aClass1_Sub3_Sub3_1.method325(local23);
			local174 = Class7.aClass7Array1[local23];
			if (local174.anIntArrayArray11 != null && local174.anIntArrayArray11[0][0] == 5) {
				local192 = local174.anIntArrayArray11[0][1];
				this.anIntArray61[local192] = 1 - this.anIntArray61[local192];
				this.method130(local192);
				this.aBoolean21 = true;
			}
		}
		if (local28 == 710 || local28 == 301 || local28 == 328 || local28 == 498 || local28 == 74) {
			local234 = this.aClass1_Sub1_Sub2_Sub1Array1[local33];
			if (local234 != null) {
				this.method105(local234.anIntArray208[0], 0, false, 1, local234.anIntArray207[0], this.aClass1_Sub1_Sub2_Sub2_1.anIntArray207[0], 0, 1, 0, this.aClass1_Sub1_Sub2_Sub2_1.anIntArray208[0]);
				this.anInt162 = super.anInt81;
				this.anInt163 = super.anInt82;
				this.anInt165 = 2;
				this.anInt164 = 0;
				if (local28 == 328) {
					this.aClass1_Sub3_Sub3_1.method323(107);
				}
				if (local28 == 301) {
					this.aClass1_Sub3_Sub3_1.method323(152);
				}
				if (local28 == 498) {
					this.aClass1_Sub3_Sub3_1.method323(119);
				}
				if (local28 == 74) {
					this.aClass1_Sub3_Sub3_1.method323(8);
				}
				if (local28 == 710) {
					this.aClass1_Sub3_Sub3_1.method323(41);
				}
				this.aClass1_Sub3_Sub3_1.method325(local33);
			}
		}
		if (local28 == 1682 || local28 == 1930 || local28 == 1754 || local28 == 1484) {
			local50 = this.aClass1_Sub1_Sub2_Sub2Array1[local33];
			if (local50 != null) {
				this.method105(local50.anIntArray208[0], 0, false, 1, local50.anIntArray207[0], this.aClass1_Sub1_Sub2_Sub2_1.anIntArray207[0], 0, 1, 0, this.aClass1_Sub1_Sub2_Sub2_1.anIntArray208[0]);
				this.anInt162 = super.anInt81;
				this.anInt163 = super.anInt82;
				this.anInt165 = 2;
				this.anInt164 = 0;
				if (local28 == 1930) {
					this.aClass1_Sub3_Sub3_1.method323(212);
				}
				if (local28 == 1682) {
					this.aClass1_Sub3_Sub3_1.method323(192);
				}
				if (local28 == 1484) {
					this.aClass1_Sub3_Sub3_1.method323(172);
				}
				if (local28 == 1754) {
					this.aClass1_Sub3_Sub3_1.method323(251);
				}
				this.aClass1_Sub3_Sub3_1.method325(local33);
			}
		}
		if (local28 == 462) {
			this.method104(local33, local18, local23, 233);
		}
		if (local28 == 1971 || local28 == 1258) {
			@Pc(763) Class39 local763 = Class39.method471(local33);
			if (local763.aByteArray14 == null) {
				local340 = "It's a " + local763.aString28 + ".";
			} else {
				local340 = new String(local763.aByteArray14);
			}
			this.method136(0, "", local340);
		}
		if (local28 == 730) {
			local50 = this.aClass1_Sub1_Sub2_Sub2Array1[local33];
			if (local50 != null) {
				this.method105(local50.anIntArray208[0], 0, false, 1, local50.anIntArray207[0], this.aClass1_Sub1_Sub2_Sub2_1.anIntArray207[0], 0, 1, 0, this.aClass1_Sub1_Sub2_Sub2_1.anIntArray208[0]);
				this.anInt162 = super.anInt81;
				this.anInt163 = super.anInt82;
				this.anInt165 = 2;
				this.anInt164 = 0;
				this.aClass1_Sub3_Sub3_1.method323(252);
				this.aClass1_Sub3_Sub3_1.method325(local33);
				this.aClass1_Sub3_Sub3_1.method325(this.anInt170);
			}
		}
		@Pc(894) boolean local894;
		if (local28 == 917 || local28 == 14 || local28 == 401 || local28 == 514 || local28 == 164) {
			local894 = this.method105(local23, 0, false, 0, local18, this.aClass1_Sub1_Sub2_Sub2_1.anIntArray207[0], 0, 0, 0, this.aClass1_Sub1_Sub2_Sub2_1.anIntArray208[0]);
			if (!local894) {
				this.method105(local23, 0, false, 1, local18, this.aClass1_Sub1_Sub2_Sub2_1.anIntArray207[0], 0, 1, 0, this.aClass1_Sub1_Sub2_Sub2_1.anIntArray208[0]);
			}
			this.anInt162 = super.anInt81;
			this.anInt163 = super.anInt82;
			this.anInt165 = 2;
			this.anInt164 = 0;
			if (local28 == 164) {
				this.aClass1_Sub3_Sub3_1.method323(140);
			}
			if (local28 == 514) {
				this.aClass1_Sub3_Sub3_1.method323(235);
			}
			if (local28 == 401) {
				this.aClass1_Sub3_Sub3_1.method323(113);
			}
			if (local28 == 14) {
				this.aClass1_Sub3_Sub3_1.method323(61);
			}
			if (local28 == 917) {
				this.aClass1_Sub3_Sub3_1.method323(186);
			}
			this.aClass1_Sub3_Sub3_1.method325(local18 + this.anInt197);
			this.aClass1_Sub3_Sub3_1.method325(local23 + this.anInt198);
			this.aClass1_Sub3_Sub3_1.method325(local33);
		}
		if (local28 == 677 || local28 == 522 || local28 == 249 || local28 == 247 || local28 == 296) {
			if (local28 == 296) {
				this.aClass1_Sub3_Sub3_1.method323(38);
			}
			if (local28 == 247) {
				this.aClass1_Sub3_Sub3_1.method323(155);
			}
			if (local28 == 249) {
				this.aClass1_Sub3_Sub3_1.method323(146);
			}
			if (local28 == 522) {
				this.aClass1_Sub3_Sub3_1.method323(240);
			}
			if (local28 == 677) {
				this.aClass1_Sub3_Sub3_1.method323(121);
			}
			this.aClass1_Sub3_Sub3_1.method325(local33);
			this.aClass1_Sub3_Sub3_1.method325(local18);
			this.aClass1_Sub3_Sub3_1.method325(local23);
			this.anInt184 = 0;
			this.anInt185 = local23;
			this.anInt186 = local18;
			this.anInt187 = 2;
			if (Class7.aClass7Array1[local23].anInt234 == this.anInt101) {
				this.anInt187 = 1;
			}
			if (Class7.aClass7Array1[local23].anInt234 == this.anInt190) {
				this.anInt187 = 3;
			}
		}
		if (local28 == 883 && !this.aBoolean28) {
			this.aClass1_Sub3_Sub3_1.method323(167);
			this.aClass1_Sub3_Sub3_1.method325(local23);
			this.aBoolean28 = true;
		}
		if (local28 == 754) {
			this.method104(local33, local18, local23, 216);
		}
		if (local28 == 39) {
			this.aClass1_Sub3_Sub3_1.method323(168);
			this.aClass1_Sub3_Sub3_1.method325(local33);
			this.aClass1_Sub3_Sub3_1.method325(local18);
			this.aClass1_Sub3_Sub3_1.method325(local23);
			this.aClass1_Sub3_Sub3_1.method325(this.anInt113);
			this.aClass1_Sub3_Sub3_1.method325(this.anInt111);
			this.aClass1_Sub3_Sub3_1.method325(this.anInt112);
			this.anInt184 = 0;
			this.anInt185 = local23;
			this.anInt186 = local18;
			this.anInt187 = 2;
			if (Class7.aClass7Array1[local23].anInt234 == this.anInt101) {
				this.anInt187 = 1;
			}
			if (Class7.aClass7Array1[local23].anInt234 == this.anInt190) {
				this.anInt187 = 3;
			}
		}
		if (local28 == 981) {
			this.method104(local33, local18, local23, 221);
		}
		if (local28 == 454) {
			this.aClass1_Sub3_Sub3_1.method323(213);
			if (this.anInt100 != -1) {
				this.anInt100 = -1;
				this.aBoolean21 = true;
				this.aBoolean28 = false;
				this.aBoolean34 = true;
			}
			if (this.anInt190 != -1) {
				this.anInt190 = -1;
				this.aBoolean36 = true;
				this.aBoolean28 = false;
			}
			this.anInt101 = -1;
		}
		if (local28 == 759) {
			local174 = Class7.aClass7Array1[local23];
			@Pc(1243) boolean local1243 = true;
			if (local174.anInt237 > 0) {
				local1243 = this.method132(local174);
			}
			if (local1243) {
				this.aClass1_Sub3_Sub3_1.method323(101);
				this.aClass1_Sub3_Sub3_1.method325(local23);
			}
		}
		if (local28 == 160) {
			local894 = this.method105(local23, 0, false, 0, local18, this.aClass1_Sub1_Sub2_Sub2_1.anIntArray207[0], 0, 0, 0, this.aClass1_Sub1_Sub2_Sub2_1.anIntArray208[0]);
			if (!local894) {
				this.method105(local23, 0, false, 1, local18, this.aClass1_Sub1_Sub2_Sub2_1.anIntArray207[0], 0, 1, 0, this.aClass1_Sub1_Sub2_Sub2_1.anIntArray208[0]);
			}
			this.anInt162 = super.anInt81;
			this.anInt163 = super.anInt82;
			this.anInt165 = 2;
			this.anInt164 = 0;
			this.aClass1_Sub3_Sub3_1.method323(42);
			this.aClass1_Sub3_Sub3_1.method325(local18 + this.anInt197);
			this.aClass1_Sub3_Sub3_1.method325(local23 + this.anInt198);
			this.aClass1_Sub3_Sub3_1.method325(local33);
			this.aClass1_Sub3_Sub3_1.method325(this.anInt113);
			this.aClass1_Sub3_Sub3_1.method325(this.anInt111);
			this.aClass1_Sub3_Sub3_1.method325(this.anInt112);
		}
		if (local28 == 678 || local28 == 523 || local28 == 836 || local28 == 548 || local28 == 62) {
			if (local28 == 548) {
				this.aClass1_Sub3_Sub3_1.method323(21);
			}
			if (local28 == 523) {
				this.aClass1_Sub3_Sub3_1.method323(181);
			}
			if (local28 == 836) {
				this.aClass1_Sub3_Sub3_1.method323(145);
			}
			if (local28 == 678) {
				this.aClass1_Sub3_Sub3_1.method323(175);
			}
			if (local28 == 62) {
				this.aClass1_Sub3_Sub3_1.method323(47);
			}
			this.aClass1_Sub3_Sub3_1.method325(local33);
			this.aClass1_Sub3_Sub3_1.method325(local18);
			this.aClass1_Sub3_Sub3_1.method325(local23);
			this.anInt184 = 0;
			this.anInt185 = local23;
			this.anInt186 = local18;
			this.anInt187 = 2;
			if (Class7.aClass7Array1[local23].anInt234 == this.anInt101) {
				this.anInt187 = 1;
			}
			if (Class7.aClass7Array1[local23].anInt234 == this.anInt190) {
				this.anInt187 = 3;
			}
		}
		if (local28 == 130) {
			local234 = this.aClass1_Sub1_Sub2_Sub1Array1[local33];
			if (local234 != null) {
				this.method105(local234.anIntArray208[0], 0, false, 1, local234.anIntArray207[0], this.aClass1_Sub1_Sub2_Sub2_1.anIntArray207[0], 0, 1, 0, this.aClass1_Sub1_Sub2_Sub2_1.anIntArray208[0]);
				this.anInt162 = super.anInt81;
				this.anInt163 = super.anInt82;
				this.anInt165 = 2;
				this.anInt164 = 0;
				this.aClass1_Sub3_Sub3_1.method323(189);
				this.aClass1_Sub3_Sub3_1.method325(local33);
				this.aClass1_Sub3_Sub3_1.method325(this.anInt170);
			}
		}
		if (local28 == 1725) {
			local234 = this.aClass1_Sub1_Sub2_Sub1Array1[local33];
			if (local234 != null) {
				if (local234.aClass38_1.aByteArray13 == null) {
					local340 = "It's a " + local234.aClass38_1.aString25 + ".";
				} else {
					local340 = new String(local234.aClass38_1.aByteArray13);
				}
				this.method136(0, "", local340);
			}
		}
		if (local28 == 449) {
			this.aClass1_Sub3_Sub3_1.method323(247);
			this.aClass1_Sub3_Sub3_1.method325(local33);
			this.aClass1_Sub3_Sub3_1.method325(local18);
			this.aClass1_Sub3_Sub3_1.method325(local23);
			this.aClass1_Sub3_Sub3_1.method325(this.anInt170);
			this.anInt184 = 0;
			this.anInt185 = local23;
			this.anInt186 = local18;
			this.anInt187 = 2;
			if (Class7.aClass7Array1[local23].anInt234 == this.anInt101) {
				this.anInt187 = 1;
			}
			if (Class7.aClass7Array1[local23].anInt234 == this.anInt190) {
				this.anInt187 = 3;
			}
		}
		if (local28 == 504) {
			local894 = this.method105(local23, 0, false, 0, local18, this.aClass1_Sub1_Sub2_Sub2_1.anIntArray207[0], 0, 0, 0, this.aClass1_Sub1_Sub2_Sub2_1.anIntArray208[0]);
			if (!local894) {
				this.method105(local23, 0, false, 1, local18, this.aClass1_Sub1_Sub2_Sub2_1.anIntArray207[0], 0, 1, 0, this.aClass1_Sub1_Sub2_Sub2_1.anIntArray208[0]);
			}
			this.anInt162 = super.anInt81;
			this.anInt163 = super.anInt82;
			this.anInt165 = 2;
			this.anInt164 = 0;
			this.aClass1_Sub3_Sub3_1.method323(244);
			this.aClass1_Sub3_Sub3_1.method325(local18 + this.anInt197);
			this.aClass1_Sub3_Sub3_1.method325(local23 + this.anInt198);
			this.aClass1_Sub3_Sub3_1.method325(local33);
			this.aClass1_Sub3_Sub3_1.method325(this.anInt170);
		}
		this.anInt110 = 0;
		this.anInt169 = 0;
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method116() {
		this.aStringArray1[0] = "Cancel";
		this.anIntArray40[0] = 1264;
		this.anInt158 = 1;
		if (super.anInt78 > 8 && super.anInt79 > 11 && super.anInt78 < 520 && super.anInt79 < 345) {
			if (this.anInt101 == -1) {
				this.method117();
			} else {
				this.method127(Class7.aClass7Array1[this.anInt101], 8, super.anInt78, 0, super.anInt79, 11);
			}
		}
		if (this.anInt154 != this.anInt99) {
			this.anInt99 = this.anInt154;
		}
		this.anInt154 = 0;
		if (super.anInt78 > 562 && super.anInt79 > 231 && super.anInt78 < 752 && super.anInt79 < 492) {
			if (this.anInt100 != -1) {
				this.method127(Class7.aClass7Array1[this.anInt100], 562, super.anInt78, 0, super.anInt79, 231);
			} else if (this.anIntArray54[this.anInt104] != -1) {
				this.method127(Class7.aClass7Array1[this.anIntArray54[this.anInt104]], 562, super.anInt78, 0, super.anInt79, 231);
			}
		}
		if (this.anInt154 != this.anInt156) {
			this.aBoolean21 = true;
			this.anInt156 = this.anInt154;
		}
		this.anInt154 = 0;
		if (super.anInt78 > 22 && super.anInt79 > 375 && super.anInt78 < 501 && super.anInt79 < 471 && this.anInt190 != -1) {
			this.method127(Class7.aClass7Array1[this.anInt190], 22, super.anInt78, 0, super.anInt79, 375);
		}
		if (this.anInt190 != -1 && this.anInt154 != this.anInt88) {
			this.aBoolean36 = true;
			this.anInt88 = this.anInt154;
		}
		@Pc(202) boolean local202 = false;
		while (!local202) {
			local202 = true;
			for (@Pc(208) int local208 = 0; local208 < this.anInt158 - 1; local208++) {
				if (this.anIntArray40[local208] < 1000 && this.anIntArray40[local208 + 1] > 1000) {
					@Pc(229) String local229 = this.aStringArray1[local208];
					this.aStringArray1[local208] = this.aStringArray1[local208 + 1];
					this.aStringArray1[local208 + 1] = local229;
					@Pc(251) int local251 = this.anIntArray40[local208];
					this.anIntArray40[local208] = this.anIntArray40[local208 + 1];
					this.anIntArray40[local208 + 1] = local251;
					@Pc(273) int local273 = this.anIntArray38[local208];
					this.anIntArray38[local208] = this.anIntArray38[local208 + 1];
					this.anIntArray38[local208 + 1] = local273;
					@Pc(295) int local295 = this.anIntArray39[local208];
					this.anIntArray39[local208] = this.anIntArray39[local208 + 1];
					this.anIntArray39[local208 + 1] = local295;
					@Pc(317) int local317 = this.anIntArray41[local208];
					this.anIntArray41[local208] = this.anIntArray41[local208 + 1];
					this.anIntArray41[local208 + 1] = local317;
					local202 = false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method117() {
		if (this.anInt110 == 0 && this.anInt169 == 0) {
			this.aStringArray1[this.anInt158] = "Walk here";
			this.anIntArray40[this.anInt158] = 284;
			this.anIntArray38[this.anInt158] = super.anInt78;
			this.anIntArray39[this.anInt158] = super.anInt79;
			this.anInt158++;
		}
		for (@Pc(41) int local41 = 0; local41 < Class1_Sub3_Sub1.anInt230; local41++) {
			@Pc(47) int local47 = Class1_Sub3_Sub1.anIntArray95[local41];
			@Pc(51) int local51 = local47 & 0x7F;
			@Pc(57) int local57 = local47 >> 7 & 0x7F;
			@Pc(63) int local63 = local47 >> 29 & 0x3;
			@Pc(69) int local69 = local47 >> 14 & 0x7FFF;
			@Pc(202) int local202;
			if (local63 == 2 && this.aClass28_1.method390(this.anInt173, local51, local57, local47) >= 0) {
				@Pc(84) Class37 local84 = Class37.method445(local69);
				if (this.anInt110 == 1) {
					this.aStringArray1[this.anInt158] = "Use " + this.aString3 + " with @cya@" + local84.aString23;
					this.anIntArray40[this.anInt158] = 237;
					this.anIntArray41[this.anInt158] = local47;
					this.anIntArray38[this.anInt158] = local51;
					this.anIntArray39[this.anInt158] = local57;
					this.anInt158++;
				} else if (this.anInt169 != 1) {
					if (local84.aStringArray7 != null) {
						for (local202 = 4; local202 >= 0; local202--) {
							if (local84.aStringArray7[local202] != null) {
								this.aStringArray1[this.anInt158] = local84.aStringArray7[local202] + " @cya@" + local84.aString23;
								if (local202 == 0) {
									this.anIntArray40[this.anInt158] = 981;
								}
								if (local202 == 1) {
									this.anIntArray40[this.anInt158] = 462;
								}
								if (local202 == 2) {
									this.anIntArray40[this.anInt158] = 54;
								}
								if (local202 == 3) {
									this.anIntArray40[this.anInt158] = 146;
								}
								if (local202 == 4) {
									this.anIntArray40[this.anInt158] = 754;
								}
								this.anIntArray41[this.anInt158] = local47;
								this.anIntArray38[this.anInt158] = local51;
								this.anIntArray39[this.anInt158] = local57;
								this.anInt158++;
							}
						}
					}
					this.aStringArray1[this.anInt158] = "Examine @cya@" + local84.aString23;
					this.anIntArray40[this.anInt158] = 1294;
					this.anIntArray41[this.anInt158] = local47;
					this.anIntArray38[this.anInt158] = local51;
					this.anIntArray39[this.anInt158] = local57;
					this.anInt158++;
				} else if ((this.anInt171 & 0x4) == 4) {
					this.aStringArray1[this.anInt158] = this.aString9 + " @cya@" + local84.aString23;
					this.anIntArray40[this.anInt158] = 243;
					this.anIntArray41[this.anInt158] = local47;
					this.anIntArray38[this.anInt158] = local51;
					this.anIntArray39[this.anInt158] = local57;
					this.anInt158++;
				}
			}
			@Pc(379) Class1_Sub1_Sub2_Sub1 local379;
			if (local63 == 1) {
				@Pc(350) Class1_Sub1_Sub2_Sub1 local350 = this.aClass1_Sub1_Sub2_Sub1Array1[local69];
				if (local350.aClass38_1.aByte34 == 1 && (local350.anInt701 & 0x7F) == 64 && (local350.anInt702 & 0x7F) == 64) {
					for (local202 = 0; local202 < this.anInt201; local202++) {
						local379 = this.aClass1_Sub1_Sub2_Sub1Array1[this.anIntArray60[local202]];
						if (local379 != null && local379 != local350 && local379.aClass38_1.aByte34 == 1 && local379.anInt701 == local350.anInt701 && local379.anInt702 == local350.anInt702) {
							this.method118(local51, this.anInt157, local379.aClass38_1, local57, this.anIntArray60[local202]);
						}
					}
				}
				this.method118(local51, this.anInt157, local350.aClass38_1, local57, local69);
			}
			if (local63 == 0) {
				@Pc(432) Class1_Sub1_Sub2_Sub2 local432 = this.aClass1_Sub1_Sub2_Sub2Array1[local69];
				if ((local432.anInt701 & 0x7F) == 64 && (local432.anInt702 & 0x7F) == 64) {
					for (local202 = 0; local202 < this.anInt201; local202++) {
						local379 = this.aClass1_Sub1_Sub2_Sub1Array1[this.anIntArray60[local202]];
						if (local379 != null && local379.aClass38_1.aByte34 == 1 && local379.anInt701 == local432.anInt701 && local379.anInt702 == local432.anInt702) {
							this.method118(local51, this.anInt157, local379.aClass38_1, local57, this.anIntArray60[local202]);
						}
					}
					for (@Pc(492) int local492 = 0; local492 < this.anInt121; local492++) {
						@Pc(502) Class1_Sub1_Sub2_Sub2 local502 = this.aClass1_Sub1_Sub2_Sub2Array1[this.anIntArray31[local492]];
						if (local502 != null && local502 != local432 && local502.anInt701 == local432.anInt701 && local502.anInt702 == local432.anInt702) {
							this.method119(local57, local51, local502, this.anIntArray31[local492]);
						}
					}
				}
				this.method119(local57, local51, local432, local69);
			}
			if (local63 == 3) {
				@Pc(552) Class23 local552 = this.aClass23ArrayArrayArray1[this.anInt173][local51][local57];
				if (local552 != null) {
					for (@Pc(559) Class1_Sub7 local559 = (Class1_Sub7) local552.method353(); local559 != null; local559 = (Class1_Sub7) local552.method355()) {
						@Pc(565) Class39 local565 = Class39.method471(local559.anInt569);
						if (this.anInt110 == 1) {
							this.aStringArray1[this.anInt158] = "Use " + this.aString3 + " with @lre@" + local565.aString28;
							this.anIntArray40[this.anInt158] = 160;
							this.anIntArray41[this.anInt158] = local559.anInt569;
							this.anIntArray38[this.anInt158] = local51;
							this.anIntArray39[this.anInt158] = local57;
							this.anInt158++;
						} else if (this.anInt169 != 1) {
							for (@Pc(682) int local682 = 4; local682 >= 0; local682--) {
								if (local565.aStringArray9 != null && local565.aStringArray9[local682] != null) {
									this.aStringArray1[this.anInt158] = local565.aStringArray9[local682] + " @lre@" + local565.aString28;
									if (local682 == 0) {
										this.anIntArray40[this.anInt158] = 917;
									}
									if (local682 == 1) {
										this.anIntArray40[this.anInt158] = 14;
									}
									if (local682 == 2) {
										this.anIntArray40[this.anInt158] = 401;
									}
									if (local682 == 3) {
										this.anIntArray40[this.anInt158] = 514;
									}
									if (local682 == 4) {
										this.anIntArray40[this.anInt158] = 164;
									}
									this.anIntArray41[this.anInt158] = local559.anInt569;
									this.anIntArray38[this.anInt158] = local51;
									this.anIntArray39[this.anInt158] = local57;
									this.anInt158++;
								} else if (local682 == 2) {
									this.aStringArray1[this.anInt158] = "Take @lre@" + local565.aString28;
									this.anIntArray40[this.anInt158] = 401;
									this.anIntArray41[this.anInt158] = local559.anInt569;
									this.anIntArray38[this.anInt158] = local51;
									this.anIntArray39[this.anInt158] = local57;
									this.anInt158++;
								}
							}
							this.aStringArray1[this.anInt158] = "Examine @lre@" + local565.aString28;
							this.anIntArray40[this.anInt158] = 1971;
							this.anIntArray41[this.anInt158] = local559.anInt569;
							this.anIntArray38[this.anInt158] = local51;
							this.anIntArray39[this.anInt158] = local57;
							this.anInt158++;
						} else if ((this.anInt171 & 0x1) == 1) {
							this.aStringArray1[this.anInt158] = this.aString9 + " @lre@" + local565.aString28;
							this.anIntArray40[this.anInt158] = 504;
							this.anIntArray41[this.anInt158] = local559.anInt569;
							this.anIntArray38[this.anInt158] = local51;
							this.anIntArray39[this.anInt158] = local57;
							this.anInt158++;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!xb;II)V")
	private void method118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class38 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt158 >= 400) {
			return;
		}
		@Pc(7) String local7 = arg2.aString25;
		this.anInt105 += arg1;
		if (arg2.anInt695 != 0) {
			local7 = local7 + method120(arg2.anInt695, this.aClass1_Sub1_Sub2_Sub2_1.anInt752) + " (level-" + arg2.anInt695 + ")";
		}
		if (this.anInt110 == 1) {
			this.aStringArray1[this.anInt158] = "Use " + this.aString3 + " with @yel@" + local7;
			this.anIntArray40[this.anInt158] = 806;
			this.anIntArray41[this.anInt158] = arg4;
			this.anIntArray38[this.anInt158] = arg0;
			this.anIntArray39[this.anInt158] = arg3;
			this.anInt158++;
		} else if (this.anInt169 != 1) {
			if (arg2.aStringArray8 != null) {
				for (@Pc(152) int local152 = 4; local152 >= 0; local152--) {
					if (arg2.aStringArray8[local152] != null) {
						this.aStringArray1[this.anInt158] = arg2.aStringArray8[local152] + " @yel@" + local7;
						if (local152 == 0) {
							this.anIntArray40[this.anInt158] = 710;
						}
						if (local152 == 1) {
							this.anIntArray40[this.anInt158] = 301;
						}
						if (local152 == 2) {
							this.anIntArray40[this.anInt158] = 328;
						}
						if (local152 == 3) {
							this.anIntArray40[this.anInt158] = 498;
						}
						if (local152 == 4) {
							this.anIntArray40[this.anInt158] = 74;
						}
						this.anIntArray41[this.anInt158] = arg4;
						this.anIntArray38[this.anInt158] = arg0;
						this.anIntArray39[this.anInt158] = arg3;
						this.anInt158++;
					}
				}
			}
			this.aStringArray1[this.anInt158] = "Examine @yel@" + local7;
			this.anIntArray40[this.anInt158] = 1725;
			this.anIntArray41[this.anInt158] = arg4;
			this.anIntArray38[this.anInt158] = arg0;
			this.anIntArray39[this.anInt158] = arg3;
			this.anInt158++;
		} else if ((this.anInt171 & 0x2) == 2) {
			this.aStringArray1[this.anInt158] = this.aString9 + " @yel@" + local7;
			this.anIntArray40[this.anInt158] = 130;
			this.anIntArray41[this.anInt158] = arg4;
			this.anIntArray38[this.anInt158] = arg0;
			this.anIntArray39[this.anInt158] = arg3;
			this.anInt158++;
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!y;II)V")
	private void method119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub2_Sub2 arg2, @OriginalArg(4) int arg3) {
		if (arg2 == this.aClass1_Sub1_Sub2_Sub2_1 || this.anInt158 >= 400) {
			return;
		}
		@Pc(35) String local35 = arg2.aString27 + method120(arg2.anInt752, this.aClass1_Sub1_Sub2_Sub2_1.anInt752) + " (level-" + arg2.anInt752 + ")";
		if (this.anInt110 == 1) {
			this.aStringArray1[this.anInt158] = "Use " + this.aString3 + " with @whi@" + local35;
			this.anIntArray40[this.anInt158] = 636;
			this.anIntArray41[this.anInt158] = arg3;
			this.anIntArray38[this.anInt158] = arg1;
			this.anIntArray39[this.anInt158] = arg0;
			this.anInt158++;
		} else if (this.anInt169 != 1) {
			this.aStringArray1[this.anInt158] = "Trade with @whi@" + local35;
			this.anIntArray40[this.anInt158] = 1682;
			this.anIntArray41[this.anInt158] = arg3;
			this.anIntArray38[this.anInt158] = arg1;
			this.anIntArray39[this.anInt158] = arg0;
			this.anInt158++;
			this.aStringArray1[this.anInt158] = "Follow @whi@" + local35;
			this.anIntArray40[this.anInt158] = 1930;
			this.anIntArray41[this.anInt158] = arg3;
			this.anIntArray38[this.anInt158] = arg1;
			this.anIntArray39[this.anInt158] = arg0;
			this.anInt158++;
			if (this.anInt116 > 0) {
				this.aStringArray1[this.anInt158] = "Attack @whi@" + local35;
				this.anIntArray40[this.anInt158] = 1754;
				this.anIntArray41[this.anInt158] = arg3;
				this.anIntArray38[this.anInt158] = arg1;
				this.anIntArray39[this.anInt158] = arg0;
				this.anInt158++;
			}
		} else if ((this.anInt171 & 0x8) == 8) {
			this.aStringArray1[this.anInt158] = this.aString9 + " @whi@" + local35;
			this.anIntArray40[this.anInt158] = 730;
			this.anIntArray41[this.anInt158] = arg3;
			this.anIntArray38[this.anInt158] = arg1;
			this.anIntArray39[this.anInt158] = arg0;
			this.anInt158++;
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!dc;III)V")
	private void method121(@OriginalArg(0) int arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1.anInt235 != 0 || arg1.anIntArray104 == null || arg1.aBoolean59 && this.anInt99 != arg1.anInt233 && this.anInt156 != arg1.anInt233 && this.anInt88 != arg1.anInt233) {
			return;
		}
		@Pc(37) int local37 = Class1_Sub3_Sub2.anInt371;
		@Pc(39) int local39 = Class1_Sub3_Sub2.anInt369;
		@Pc(41) int local41 = Class1_Sub3_Sub2.anInt372;
		@Pc(43) int local43 = Class1_Sub3_Sub2.anInt370;
		Class1_Sub3_Sub2.method268(arg3 + arg1.anInt238, this.aByte8, arg3, arg2, arg2 + arg1.anInt239);
		@Pc(60) int local60 = arg1.anIntArray104.length;
		for (@Pc(62) int local62 = 0; local62 < local60; local62++) {
			@Pc(71) int local71 = arg1.anIntArray105[local62] + arg3;
			@Pc(80) int local80 = arg1.anIntArray106[local62] + arg2 - arg0;
			@Pc(87) Class7 local87 = Class7.aClass7Array1[arg1.anIntArray104[local62]];
			if (local87.anInt237 > 0) {
				this.method131(local87);
			}
			if (local87.anInt235 == 0) {
				if (local87.anInt242 > local87.anInt241 - local87.anInt239) {
					local87.anInt242 = local87.anInt241 - local87.anInt239;
				}
				if (local87.anInt242 < 0) {
					local87.anInt242 = 0;
				}
				this.method121(local87.anInt242, local87, local80, local71);
				if (local87.anInt241 > local87.anInt239) {
					this.method123(local80, local71 + local87.anInt238, local87.anInt242, local87.anInt239, local87.anInt241);
				}
			} else if (local87.anInt235 != 1) {
				@Pc(159) int local159;
				@Pc(163) int local163;
				@Pc(174) int local174;
				@Pc(256) int local256;
				@Pc(157) int local157;
				@Pc(183) int local183;
				@Pc(212) int local212;
				if (local87.anInt235 == 2) {
					local157 = 0;
					for (local159 = 0; local159 < local87.anInt239; local159++) {
						for (local163 = 0; local163 < local87.anInt238; local163++) {
							local174 = local71 + local163 * (local87.anInt244 + 32);
							local183 = local80 + local159 * (local87.anInt245 + 32);
							if (local157 < 20) {
								local174 += local87.anIntArray107[local157];
								local183 += local87.anIntArray108[local157];
							}
							if (local87.anIntArray100[local157] > 0) {
								local212 = local87.anIntArray100[local157] - 1;
								@Pc(216) Class1_Sub3_Sub2_Sub2 local216 = Class39.method475(local212);
								if (this.anInt187 != 0 && this.anInt186 == local157 && this.anInt185 == local87.anInt233) {
									local216.method238(local174, local183);
								} else {
									local216.method236(local174, local183);
								}
								if (local216.anInt326 == 33 || local87.anIntArray101[local157] != 1) {
									local256 = local87.anIntArray101[local157];
									this.aClass1_Sub3_Sub2_Sub4_1.method277(String.valueOf(local256), local174 + 1, local183 + 10, 0);
									this.aClass1_Sub3_Sub2_Sub4_1.method277(String.valueOf(local256), local174, local183 + 9, 16776960);
								}
							} else if (local87.aClass1_Sub3_Sub2_Sub2Array8 != null && local157 < 20) {
								@Pc(293) Class1_Sub3_Sub2_Sub2 local293 = local87.aClass1_Sub3_Sub2_Sub2Array8[local157];
								if (local293 != null) {
									local293.method236(local174, local183);
								}
							}
							local157++;
						}
					}
				} else if (local87.anInt235 != 3) {
					@Pc(351) Class1_Sub3_Sub2_Sub4 local351;
					if (local87.anInt235 == 4) {
						local351 = local87.aClass1_Sub3_Sub2_Sub4_5;
						local159 = local87.anInt246;
						@Pc(357) String local357 = local87.aString16;
						if ((this.anInt88 == local87.anInt233 || this.anInt156 == local87.anInt233 || this.anInt99 == local87.anInt233) && local87.anInt248 != 0) {
							local159 = local87.anInt248;
						}
						if (this.method125(local87)) {
							local159 = local87.anInt247;
							if (local87.aString17.length() > 0) {
								local357 = local87.aString17;
							}
						}
						if (local87.anInt236 == 6 && this.aBoolean28) {
							local357 = "Please wait...";
							local159 = local87.anInt246;
						}
						local183 = local80 + local351.anInt379;
						while (local357.length() > 0) {
							if (local357.indexOf("%") != -1) {
								label218: while (true) {
									local212 = local357.indexOf("%1");
									if (local212 == -1) {
										while (true) {
											local212 = local357.indexOf("%2");
											if (local212 == -1) {
												while (true) {
													local212 = local357.indexOf("%3");
													if (local212 == -1) {
														while (true) {
															local212 = local357.indexOf("%4");
															if (local212 == -1) {
																while (true) {
																	local212 = local357.indexOf("%5");
																	if (local212 == -1) {
																		break label218;
																	}
																	local357 = local357.substring(0, local212) + this.method124(this.method126(4, local87)) + local357.substring(local212 + 2);
																}
															}
															local357 = local357.substring(0, local212) + this.method124(this.method126(3, local87)) + local357.substring(local212 + 2);
														}
													}
													local357 = local357.substring(0, local212) + this.method124(this.method126(2, local87)) + local357.substring(local212 + 2);
												}
											}
											local357 = local357.substring(0, local212) + this.method124(this.method126(1, local87)) + local357.substring(local212 + 2);
										}
									}
									local357 = local357.substring(0, local212) + this.method124(this.method126(0, local87)) + local357.substring(local212 + 2);
								}
							}
							local212 = local357.indexOf("\\n");
							@Pc(599) String local599;
							if (local212 == -1) {
								local599 = local357;
								local357 = "";
							} else {
								local599 = local357.substring(0, local212);
								local357 = local357.substring(local212 + 2);
							}
							if (local87.aBoolean65) {
								local351.method275(local71 + local87.anInt238 / 2, local599, local183, this.anInt175, local159, local87.aBoolean66);
							} else {
								local351.method279(local87.aBoolean66, local71, local183, local159, local599);
							}
							local183 += local351.anInt379;
						}
					} else if (local87.anInt235 == 5) {
						@Pc(662) Class1_Sub3_Sub2_Sub2 local662;
						if (this.method125(local87)) {
							local662 = local87.aClass1_Sub3_Sub2_Sub2_11;
						} else {
							local662 = local87.aClass1_Sub3_Sub2_Sub2_10;
						}
						if (local662 != null) {
							local662.method236(local71, local80);
						}
					} else if (local87.anInt235 == 6) {
						local157 = Class1_Sub3_Sub2_Sub1.anInt287;
						local159 = Class1_Sub3_Sub2_Sub1.anInt288;
						Class1_Sub3_Sub2_Sub1.anInt287 = local71 + local87.anInt238 / 2;
						Class1_Sub3_Sub2_Sub1.anInt288 = local80 + local87.anInt239 / 2;
						local163 = Class1_Sub3_Sub2_Sub1.anIntArray118[local87.anInt252] * local87.anInt251 >> 16;
						local174 = Class1_Sub3_Sub2_Sub1.anIntArray119[local87.anInt252] * local87.anInt251 >> 16;
						@Pc(731) Class1_Sub3_Sub1 local731;
						if (local87.anInt249 == -1) {
							local731 = local87.method179(-1, -1, this.method125(local87));
						} else {
							@Pc(738) Class11 local738 = Class11.aClass11Array1[local87.anInt249];
							local731 = local87.method179(local738.anIntArray124[local87.anInt231], local738.anIntArray125[local87.anInt231], this.method125(local87));
						}
						if (local731 != null) {
							local731.method172(local163, local174, 0, 0, local87.anInt252, local87.anInt253);
						}
						Class1_Sub3_Sub2_Sub1.anInt287 = local157;
						Class1_Sub3_Sub2_Sub1.anInt288 = local159;
					} else if (local87.anInt235 == 7) {
						local351 = local87.aClass1_Sub3_Sub2_Sub4_5;
						local159 = 0;
						for (local163 = 0; local163 < local87.anInt239; local163++) {
							for (local174 = 0; local174 < local87.anInt238; local174++) {
								if (local87.anIntArray100[local159] > 0) {
									@Pc(805) Class39 local805 = Class39.method471(local87.anIntArray100[local159] - 1);
									@Pc(808) String local808 = local805.aString28;
									if (local805.aBoolean135 || local87.anIntArray101[local159] != 1) {
										local808 = local87.anIntArray101[local159] + "x " + local808;
									}
									@Pc(840) int local840 = local71 + local174 * (local87.anInt244 + 115);
									local256 = local80 + local163 * (local87.anInt245 + 12);
									if (local87.aBoolean65) {
										if (local87.aBoolean66) {
											local351.method274(local256 + 1, this.aBoolean44, local840 + local87.anInt238 / 2 + 1, 0, local808);
										}
										local351.method274(local256, this.aBoolean44, local840 + local87.anInt238 / 2, local87.anInt246, local808);
									} else {
										if (local87.aBoolean66) {
											local351.method277(local808, local840 + 1, local256 + 1, 0);
										}
										local351.method277(local808, local840, local256, local87.anInt246);
									}
								}
								local159++;
							}
						}
					}
				} else if (local87.aBoolean64) {
					Class1_Sub3_Sub2.method270(local87.anInt246, local87.anInt238, local80, local87.anInt239, local71);
				} else {
					Class1_Sub3_Sub2.method271(local87.anInt238, local87.anInt239, local71, local80, local87.anInt246);
				}
			}
		}
		Class1_Sub3_Sub2.method268(local41, this.aByte8, local37, local39, local43);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIILclient!dc;IZI)V")
	private void method122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class7 arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7) {
		if (this.aBoolean42) {
			this.anInt137 = 32;
		} else {
			this.anInt137 = 0;
		}
		this.aBoolean42 = false;
		if (arg2 >= arg1 && arg2 < arg1 + 16 && arg4 >= arg0 && arg4 < arg0 + 16) {
			arg5.anInt242 -= this.anInt183 * 4;
			if (arg6) {
				this.aBoolean21 = true;
				return;
			}
		} else if (arg2 >= arg1 && arg2 < arg1 + 16 && arg4 >= arg0 + arg3 - 16 && arg4 < arg0 + arg3) {
			arg5.anInt242 += this.anInt183 * 4;
			if (arg6) {
				this.aBoolean21 = true;
				return;
			}
		} else if (arg2 >= arg1 - this.anInt137 && arg2 < arg1 + this.anInt137 + 16 && arg4 >= arg0 + 16 && arg4 < arg0 + arg3 - 16 && this.anInt183 > 0) {
			@Pc(127) int local127 = (arg3 - 32) * arg3 / arg7;
			if (local127 < 8) {
				local127 = 8;
			}
			@Pc(142) int local142 = arg4 - arg0 - local127 / 2 - 16;
			@Pc(148) int local148 = arg3 - local127 - 32;
			arg5.anInt242 = (arg7 - arg3) * local142 / local148;
			if (arg6) {
				this.aBoolean21 = true;
			}
			this.aBoolean42 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass1_Sub3_Sub2_Sub3_1.method260(arg1, arg0);
		this.aClass1_Sub3_Sub2_Sub3_2.method260(arg1, arg0 + arg3 - 16);
		Class1_Sub3_Sub2.method270(this.anInt102, 16, arg0 + 16, arg3 - 32, arg1);
		@Pc(42) int local42 = (arg3 - 32) * arg3 / arg4;
		if (local42 < 8) {
			local42 = 8;
		}
		@Pc(59) int local59 = (arg3 - local42 - 32) * arg2 / (arg4 - arg3);
		Class1_Sub3_Sub2.method270(this.anInt188, 16, arg0 + local59 + 16, local42, arg1);
		Class1_Sub3_Sub2.method273(arg0 + local59 + 16, arg1, local42, this.anInt181);
		Class1_Sub3_Sub2.method273(arg0 + local59 + 16, arg1 + 1, local42, this.anInt181);
		Class1_Sub3_Sub2.method272(this.anInt181, arg0 + local59 + 16, 16, arg1);
		Class1_Sub3_Sub2.method272(this.anInt181, arg0 + local59 + 17, 16, arg1);
		Class1_Sub3_Sub2.method273(arg0 + local59 + 16, arg1 + 15, local42, this.anInt140);
		Class1_Sub3_Sub2.method273(arg0 + local59 + 17, arg1 + 14, local42 - 1, this.anInt140);
		Class1_Sub3_Sub2.method272(this.anInt140, arg0 + local59 + local42 + 15, 16, arg1);
		Class1_Sub3_Sub2.method272(this.anInt140, arg0 + local59 + local42 + 14, 15, arg1 + 1);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)Ljava/lang/String;")
	private String method124(@OriginalArg(1) int arg0) {
		return arg0 < 999999999 ? String.valueOf(arg0) : "*";
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!dc;I)Z")
	private boolean method125(@OriginalArg(0) Class7 arg0) {
		if (arg0.anIntArray102 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < arg0.anIntArray102.length; local6++) {
			@Pc(14) int local14 = this.method126(local6, arg0);
			@Pc(19) int local19 = arg0.anIntArray103[local6];
			if (arg0.anIntArray102[local6] == 2) {
				if (local14 >= local19) {
					return false;
				}
			} else if (arg0.anIntArray102[local6] == 3) {
				if (local14 <= local19) {
					return false;
				}
			} else if (arg0.anIntArray102[local6] == 4) {
				if (local14 == local19) {
					return false;
				}
			} else if (local14 != local19) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!dc;)I")
	private int method126(@OriginalArg(1) int arg0, @OriginalArg(2) Class7 arg1) {
		if (arg1.anIntArrayArray11 == null || arg0 >= arg1.anIntArrayArray11.length) {
			return -2;
		}
		try {
			@Pc(27) int[] local27 = arg1.anIntArrayArray11[arg0];
			@Pc(29) int local29 = 0;
			@Pc(31) int local31 = 0;
			while (true) {
				while (true) {
					@Pc(36) int local36;
					@Pc(89) Class7 local89;
					@Pc(96) int local96;
					@Pc(98) int local98;
					do {
						local36 = local27[local31++];
						if (local36 == 0) {
							return local29;
						}
						if (local36 == 1) {
							local29 += this.anIntArray47[local27[local31++]];
						}
						if (local36 == 2) {
							local29 += this.anIntArray44[local27[local31++]];
						}
						if (local36 == 3) {
							local29 += this.anIntArray22[local27[local31++]];
						}
						if (local36 == 4) {
							local89 = Class7.aClass7Array1[local27[local31++]];
							local96 = local27[local31++] + 1;
							for (local98 = 0; local98 < local89.anIntArray100.length; local98++) {
								if (local89.anIntArray100[local98] == local96) {
									local29 += local89.anIntArray101[local98];
								}
							}
						}
						if (local36 == 5) {
							local29 += this.anIntArray61[local27[local31++]];
						}
						if (local36 == 6) {
							local29 += anIntArray48[this.anIntArray44[local27[local31++]] - 1];
						}
						if (local36 == 7) {
							local29 += this.anIntArray61[local27[local31++]] * 100 / 46875;
						}
						if (local36 == 8) {
							local29 += this.aClass1_Sub1_Sub2_Sub2_1.anInt752;
						}
						if (local36 == 9) {
							for (@Pc(180) int local180 = 0; local180 < 19; local180++) {
								local29 += this.anIntArray44[local180];
							}
						}
					} while (local36 != 10);
					local89 = Class7.aClass7Array1[local27[local31++]];
					local96 = local27[local31++] + 1;
					for (local98 = 0; local98 < local89.anIntArray100.length; local98++) {
						if (local89.anIntArray100[local98] == local96) {
							local29 += 999999999;
							break;
						}
					}
				}
			}
		} catch (@Pc(234) Exception local234) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!dc;ZIIIII)V")
	private void method127(@OriginalArg(0) Class7 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0.anInt235 != 0 || arg0.anIntArray104 == null || arg0.aBoolean59 || (arg2 < arg1 || arg4 < arg5 || arg2 > arg1 + arg0.anInt238 || arg4 > arg5 + arg0.anInt239)) {
			return;
		}
		@Pc(34) int local34 = arg0.anIntArray104.length;
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			@Pc(45) int local45 = arg0.anIntArray105[local36] + arg1;
			@Pc(54) int local54 = arg0.anIntArray106[local36] + arg5 - arg3;
			@Pc(61) Class7 local61 = Class7.aClass7Array1[arg0.anIntArray104[local36]];
			if ((local61.anInt240 >= 0 || local61.anInt248 != 0) && arg2 >= local45 && arg4 >= local54 && arg2 < local45 + local61.anInt238 && arg4 < local54 + local61.anInt239) {
				if (local61.anInt240 >= 0) {
					this.anInt154 = local61.anInt240;
				} else {
					this.anInt154 = local61.anInt233;
				}
			}
			if (local61.anInt235 == 0) {
				this.method127(local61, local45, arg2, local61.anInt242, arg4, local54);
				if (local61.anInt241 > local61.anInt239) {
					this.method122(local54, local45 + local61.anInt238, arg2, local61.anInt239, arg4, local61, true, local61.anInt241);
				}
			} else {
				if (local61.anInt236 == 1 && arg2 >= local45 && arg4 >= local54 && arg2 < local45 + local61.anInt238 && arg4 < local54 + local61.anInt239) {
					this.aStringArray1[this.anInt158] = local61.aString20;
					this.anIntArray40[this.anInt158] = 759;
					this.anIntArray39[this.anInt158] = local61.anInt233;
					this.anInt158++;
				}
				if (local61.anInt236 == 2 && this.anInt169 == 0 && arg2 >= local45 && arg4 >= local54 && arg2 < local45 + local61.anInt238 && arg4 < local54 + local61.anInt239) {
					@Pc(210) String local210 = local61.aString18;
					if (local210.indexOf(" ") != -1) {
						local210 = local210.substring(0, local210.indexOf(" "));
					}
					this.aStringArray1[this.anInt158] = local210 + " @gre@" + local61.aString19;
					this.anIntArray40[this.anInt158] = 17;
					this.anIntArray39[this.anInt158] = local61.anInt233;
					this.anInt158++;
				}
				if (local61.anInt236 == 3 && arg2 >= local45 && arg4 >= local54 && arg2 < local45 + local61.anInt238 && arg4 < local54 + local61.anInt239) {
					this.aStringArray1[this.anInt158] = "Close";
					this.anIntArray40[this.anInt158] = 454;
					this.anIntArray39[this.anInt158] = local61.anInt233;
					this.anInt158++;
				}
				if (local61.anInt236 == 4 && arg2 >= local45 && arg4 >= local54 && arg2 < local45 + local61.anInt238 && arg4 < local54 + local61.anInt239) {
					this.aStringArray1[this.anInt158] = local61.aString20;
					this.anIntArray40[this.anInt158] = 739;
					this.anIntArray39[this.anInt158] = local61.anInt233;
					this.anInt158++;
				}
				if (local61.anInt236 == 5 && arg2 >= local45 && arg4 >= local54 && arg2 < local45 + local61.anInt238 && arg4 < local54 + local61.anInt239) {
					this.aStringArray1[this.anInt158] = local61.aString20;
					this.anIntArray40[this.anInt158] = 700;
					this.anIntArray39[this.anInt158] = local61.anInt233;
					this.anInt158++;
				}
				if (local61.anInt236 == 6 && !this.aBoolean28 && arg2 >= local45 && arg4 >= local54 && arg2 < local45 + local61.anInt238 && arg4 < local54 + local61.anInt239) {
					this.aStringArray1[this.anInt158] = local61.aString20;
					this.anIntArray40[this.anInt158] = 883;
					this.anIntArray39[this.anInt158] = local61.anInt233;
					this.anInt158++;
				}
				if (local61.anInt235 == 2) {
					@Pc(458) int local458 = 0;
					for (@Pc(460) int local460 = 0; local460 < local61.anInt239; local460++) {
						for (@Pc(464) int local464 = 0; local464 < local61.anInt238; local464++) {
							if (local61.anIntArray100[local458] > 0) {
								@Pc(480) int local480 = local45 + local464 * (local61.anInt244 + 32);
								@Pc(489) int local489 = local54 + local460 * (local61.anInt245 + 32);
								if (local458 < 20) {
									local480 += local61.anIntArray107[local458];
									local489 += local61.anIntArray108[local458];
								}
								if (arg2 >= local480 && arg4 >= local489 && arg2 < local480 + 32 && arg4 < local489 + 32) {
									@Pc(530) Class39 local530 = Class39.method471(local61.anIntArray100[local458] - 1);
									if (this.anInt110 == 1 && local61.aBoolean62) {
										if (local61.anInt233 != this.anInt112 || local458 != this.anInt111) {
											this.aStringArray1[this.anInt158] = "Use " + this.aString3 + " with @lre@" + local530.aString28;
											this.anIntArray40[this.anInt158] = 39;
											this.anIntArray41[this.anInt158] = local530.anInt766;
											this.anIntArray38[this.anInt158] = local458;
											this.anIntArray39[this.anInt158] = local61.anInt233;
											this.anInt158++;
										}
									} else if (this.anInt169 != 1 || !local61.aBoolean62) {
										@Pc(667) int local667;
										if (local61.aBoolean62) {
											for (local667 = 4; local667 >= 3; local667--) {
												if (local530.aStringArray10 != null && local530.aStringArray10[local667] != null) {
													this.aStringArray1[this.anInt158] = local530.aStringArray10[local667] + " @lre@" + local530.aString28;
													if (local667 == 3) {
														this.anIntArray40[this.anInt158] = 247;
													}
													if (local667 == 4) {
														this.anIntArray40[this.anInt158] = 296;
													}
													this.anIntArray41[this.anInt158] = local530.anInt766;
													this.anIntArray38[this.anInt158] = local458;
													this.anIntArray39[this.anInt158] = local61.anInt233;
													this.anInt158++;
												} else if (local667 == 4) {
													this.aStringArray1[this.anInt158] = "Drop @lre@" + local530.aString28;
													this.anIntArray40[this.anInt158] = 296;
													this.anIntArray41[this.anInt158] = local530.anInt766;
													this.anIntArray38[this.anInt158] = local458;
													this.anIntArray39[this.anInt158] = local61.anInt233;
													this.anInt158++;
												}
											}
										}
										if (local61.aBoolean63) {
											this.aStringArray1[this.anInt158] = "Use @lre@" + local530.aString28;
											this.anIntArray40[this.anInt158] = 669;
											this.anIntArray41[this.anInt158] = local530.anInt766;
											this.anIntArray38[this.anInt158] = local458;
											this.anIntArray39[this.anInt158] = local61.anInt233;
											this.anInt158++;
										}
										if (local61.aBoolean62 && local530.aStringArray10 != null) {
											for (local667 = 2; local667 >= 0; local667--) {
												if (local530.aStringArray10[local667] != null) {
													this.aStringArray1[this.anInt158] = local530.aStringArray10[local667] + " @lre@" + local530.aString28;
													if (local667 == 0) {
														this.anIntArray40[this.anInt158] = 677;
													}
													if (local667 == 1) {
														this.anIntArray40[this.anInt158] = 522;
													}
													if (local667 == 2) {
														this.anIntArray40[this.anInt158] = 249;
													}
													this.anIntArray41[this.anInt158] = local530.anInt766;
													this.anIntArray38[this.anInt158] = local458;
													this.anIntArray39[this.anInt158] = local61.anInt233;
													this.anInt158++;
												}
											}
										}
										if (local61.aStringArray5 != null) {
											for (local667 = 4; local667 >= 0; local667--) {
												if (local61.aStringArray5[local667] != null) {
													this.aStringArray1[this.anInt158] = local61.aStringArray5[local667] + " @lre@" + local530.aString28;
													if (local667 == 0) {
														this.anIntArray40[this.anInt158] = 678;
													}
													if (local667 == 1) {
														this.anIntArray40[this.anInt158] = 523;
													}
													if (local667 == 2) {
														this.anIntArray40[this.anInt158] = 836;
													}
													if (local667 == 3) {
														this.anIntArray40[this.anInt158] = 548;
													}
													if (local667 == 4) {
														this.anIntArray40[this.anInt158] = 62;
													}
													this.anIntArray41[this.anInt158] = local530.anInt766;
													this.anIntArray38[this.anInt158] = local458;
													this.anIntArray39[this.anInt158] = local61.anInt233;
													this.anInt158++;
												}
											}
										}
										this.aStringArray1[this.anInt158] = "Examine @lre@" + local530.aString28;
										this.anIntArray40[this.anInt158] = 1258;
										this.anIntArray41[this.anInt158] = local530.anInt766;
										this.anInt158++;
									} else if ((this.anInt171 & 0x10) == 16) {
										this.aStringArray1[this.anInt158] = this.aString9 + " @lre@" + local530.aString28;
										this.anIntArray40[this.anInt158] = 449;
										this.anIntArray41[this.anInt158] = local530.anInt766;
										this.anIntArray38[this.anInt158] = local458;
										this.anIntArray39[this.anInt158] = local61.anInt233;
										this.anInt158++;
									}
								}
							}
							local458++;
						}
					}
				}
			}
		}
		this.aBoolean41 &= true;
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method128(@OriginalArg(1) int arg0) {
		@Pc(3) Class7 local3 = Class7.aClass7Array1[arg0];
		for (@Pc(5) int local5 = 0; local5 < local3.anIntArray104.length && local3.anIntArray104[local5] != -1; local5++) {
			@Pc(20) Class7 local20 = Class7.aClass7Array1[local3.anIntArray104[local5]];
			if (local20.anInt235 == 1) {
				this.method128(local20.anInt233);
			}
			local20.anInt231 = 0;
			local20.anInt232 = 0;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BII)Z")
	private boolean method129(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) boolean local3 = false;
		@Pc(7) Class7 local7 = Class7.aClass7Array1[arg1];
		for (@Pc(9) int local9 = 0; local9 < local7.anIntArray104.length && local7.anIntArray104[local9] != -1; local9++) {
			@Pc(24) Class7 local24 = Class7.aClass7Array1[local7.anIntArray104[local9]];
			if (local24.anInt235 == 1) {
				local3 |= this.method129(arg0, local24.anInt233);
			}
			if (local24.anInt249 != -1) {
				@Pc(46) Class11 local46 = Class11.aClass11Array1[local24.anInt249];
				local24.anInt232 += arg0;
				while (local24.anInt232 > local46.anIntArray126[local24.anInt231]) {
					local24.anInt232 -= local46.anIntArray126[local24.anInt231] + 1;
					local24.anInt231++;
					if (local24.anInt231 >= local46.anInt294) {
						local24.anInt231 -= local46.anInt295;
						if (local24.anInt231 < 0 || local24.anInt231 >= local46.anInt294) {
							local24.anInt231 = 0;
						}
					}
					local3 = true;
				}
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method130(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = Class15.aClass15Array1[arg0].anInt359;
		if (local4 == 0) {
			return;
		}
		@Pc(20) int local20 = this.anIntArray61[arg0];
		if (local4 == 1) {
			if (local20 == 1) {
				Class1_Sub3_Sub2_Sub1.method213(0.9D);
			}
			if (local20 == 2) {
				Class1_Sub3_Sub2_Sub1.method213(0.8D);
			}
			if (local20 == 3) {
				Class1_Sub3_Sub2_Sub1.method213(0.7D);
			}
			if (local20 == 4) {
				Class1_Sub3_Sub2_Sub1.method213(0.6D);
			}
			Class39.aClass30_9.method421();
			this.aBoolean43 = true;
		}
		if (local4 == 3) {
			if (local20 == 1 && this.aBoolean35) {
				this.aBoolean35 = false;
				signlink.midi = "null";
			}
			if (local20 == 0 && !this.aBoolean35) {
				this.aBoolean35 = true;
				signlink.midi = this.aString10;
			}
		}
		if (local4 == 5) {
			this.anInt155 = local20;
		}
		if (local4 == 6) {
			this.anInt109 = local20;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!dc;I)V")
	private void method131(@OriginalArg(0) Class7 arg0) {
		@Pc(4) int local4 = arg0.anInt237;
		if (local4 >= 1 && local4 <= 100) {
			local4--;
			if (local4 >= this.anInt167) {
				arg0.aString16 = "";
				arg0.anInt236 = 0;
			} else {
				arg0.aString16 = this.aStringArray3[local4];
				arg0.anInt236 = 1;
				if (arg0.aString20 == null) {
					arg0.anInt236 = 0;
				}
			}
		} else if (local4 >= 101 && local4 <= 200) {
			local4 -= 101;
			if (local4 >= this.anInt167) {
				arg0.aString16 = "";
				arg0.anInt236 = 0;
			} else {
				if (this.anIntArray62[local4] == 0) {
					arg0.aString16 = "@red@Offline";
				} else if (this.anIntArray62[local4] == this.anInt172) {
					arg0.aString16 = "@gre@World-" + (this.anIntArray62[local4] - 9);
				} else {
					arg0.aString16 = "@yel@World-" + (this.anIntArray62[local4] - 9);
				}
				arg0.anInt236 = 1;
				if (arg0.aString20 == null) {
					arg0.anInt236 = 0;
				}
			}
		} else if (local4 == 203) {
			arg0.anInt241 = this.anInt167 * 15 + 20;
			if (arg0.anInt241 <= arg0.anInt239) {
				arg0.anInt241 = arg0.anInt239 + 1;
			}
		} else if (local4 >= 401 && local4 <= 500) {
			local4 -= 401;
			if (local4 >= this.anInt153) {
				arg0.aString16 = "";
				arg0.anInt236 = 0;
			} else {
				arg0.aString16 = Class35.method434(Class35.method431(this.aLongArray3[local4]));
			}
		} else if (local4 == 503) {
			arg0.anInt241 = this.anInt153 * 15 + 20;
			if (arg0.anInt241 <= arg0.anInt239) {
				arg0.anInt241 = arg0.anInt239 + 1;
			}
		} else if (local4 == 327) {
			arg0.anInt252 = 150;
			arg0.anInt253 = (int) (Math.sin((double) anInt85 / 40.0D) * 256.0D) & 0x7FF;
			if (this.aBoolean27) {
				this.aBoolean27 = false;
				@Pc(221) Class1_Sub3_Sub1[] local221 = new Class1_Sub3_Sub1[7];
				@Pc(223) int local223 = 0;
				for (@Pc(225) int local225 = 0; local225 < 7; local225++) {
					@Pc(232) int local232 = this.anIntArray33[local225];
					if (local232 >= 0) {
						local221[local223++] = Class5.aClass5Array1[local232].method54();
					}
				}
				@Pc(253) Class1_Sub3_Sub1 local253 = new Class1_Sub3_Sub1(local223, false, local221);
				for (@Pc(255) int local255 = 0; local255 < 5; local255++) {
					if (this.anIntArray49[local255] != 0) {
						local253.method166(anIntArrayArray5[local255][0], anIntArrayArray5[local255][this.anIntArray49[local255]]);
						if (local255 == 1) {
							local253.method166(anIntArray23[0], anIntArray23[this.anIntArray49[local255]]);
						}
					}
				}
				local253.method159();
				local253.method160(Class11.aClass11Array1[this.aClass1_Sub1_Sub2_Sub2_1.anInt710].anIntArray124[0]);
				local253.method169(64, 850, -30, -50, -30, true);
				arg0.aClass1_Sub3_Sub1_1 = local253;
			}
		} else if (local4 == 324) {
			if (this.aClass1_Sub3_Sub2_Sub2_6 == null) {
				this.aClass1_Sub3_Sub2_Sub2_6 = arg0.aClass1_Sub3_Sub2_Sub2_10;
				this.aClass1_Sub3_Sub2_Sub2_7 = arg0.aClass1_Sub3_Sub2_Sub2_11;
			}
			if (this.aBoolean33) {
				arg0.aClass1_Sub3_Sub2_Sub2_10 = this.aClass1_Sub3_Sub2_Sub2_7;
			} else {
				arg0.aClass1_Sub3_Sub2_Sub2_10 = this.aClass1_Sub3_Sub2_Sub2_6;
			}
		} else if (local4 == 325) {
			if (this.aClass1_Sub3_Sub2_Sub2_6 == null) {
				this.aClass1_Sub3_Sub2_Sub2_6 = arg0.aClass1_Sub3_Sub2_Sub2_10;
				this.aClass1_Sub3_Sub2_Sub2_7 = arg0.aClass1_Sub3_Sub2_Sub2_11;
			}
			if (this.aBoolean33) {
				arg0.aClass1_Sub3_Sub2_Sub2_10 = this.aClass1_Sub3_Sub2_Sub2_6;
			} else {
				arg0.aClass1_Sub3_Sub2_Sub2_10 = this.aClass1_Sub3_Sub2_Sub2_7;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!dc;I)Z")
	private boolean method132(@OriginalArg(0) Class7 arg0) {
		@Pc(4) int local4 = arg0.anInt237;
		if (local4 == 201) {
			this.aBoolean36 = true;
			this.aBoolean30 = false;
			this.aBoolean20 = true;
			this.aString15 = "";
			this.anInt103 = 1;
			this.aString14 = "Enter name of friend to add to list";
		}
		if (local4 == 202) {
			this.aBoolean36 = true;
			this.aBoolean30 = false;
			this.aBoolean20 = true;
			this.aString15 = "";
			this.anInt103 = 2;
			this.aString14 = "Enter name of friend to delete from list";
		}
		if (local4 >= 1 && local4 <= 200) {
			if (local4 >= 101) {
				local4 -= 101;
			} else {
				local4--;
			}
			if (this.anIntArray62[local4] > 0) {
				this.aBoolean36 = true;
				this.aBoolean30 = false;
				this.aBoolean20 = true;
				this.aString15 = "";
				this.anInt103 = 3;
				this.anInt117 = local4;
				this.aString14 = "Enter message to send to " + this.aStringArray3[local4];
			}
		}
		if (local4 == 501) {
			this.aBoolean36 = true;
			this.aBoolean30 = false;
			this.aBoolean20 = true;
			this.aString15 = "";
			this.anInt103 = 4;
			this.aString14 = "Enter name of player to add to list";
		}
		if (local4 == 502) {
			this.aBoolean36 = true;
			this.aBoolean30 = false;
			this.aBoolean20 = true;
			this.aString15 = "";
			this.anInt103 = 5;
			this.aString14 = "Enter name of player to delete from list";
		}
		@Pc(154) int local154;
		@Pc(158) int local158;
		@Pc(163) int local163;
		if (local4 >= 300 && local4 <= 313) {
			local154 = (local4 - 300) / 2;
			local158 = local4 & 0x1;
			local163 = this.anIntArray33[local154];
			if (local163 != -1) {
				while (true) {
					if (local158 == 0) {
						local163--;
						if (local163 < 0) {
							local163 = Class5.anInt66 - 1;
						}
					}
					if (local158 == 1) {
						local163++;
						if (local163 >= Class5.anInt66) {
							local163 = 0;
						}
					}
					if (Class5.aClass5Array1[local163].anInt67 == local154 + (this.aBoolean33 ? 0 : 7)) {
						this.anIntArray33[local154] = local163;
						this.aBoolean27 = true;
						break;
					}
				}
			}
		}
		if (local4 >= 314 && local4 <= 323) {
			local154 = (local4 - 314) / 2;
			local158 = local4 & 0x1;
			local163 = this.anIntArray49[local154];
			if (local158 == 0) {
				local163--;
				if (local163 < 0) {
					local163 = anIntArrayArray5[local154].length - 1;
				}
			}
			if (local158 == 1) {
				local163++;
				if (local163 >= anIntArrayArray5[local154].length) {
					local163 = 0;
				}
			}
			this.anIntArray49[local154] = local163;
			this.aBoolean27 = true;
		}
		if (local4 == 324 && !this.aBoolean33) {
			this.aBoolean33 = true;
			this.method133();
		}
		if (local4 == 325 && this.aBoolean33) {
			this.aBoolean33 = false;
			this.method133();
		}
		if (local4 != 326) {
			return false;
		}
		this.aClass1_Sub3_Sub3_1.method323(128);
		this.aClass1_Sub3_Sub3_1.method324(this.aBoolean33 ? 0 : 1);
		for (local154 = 0; local154 < 7; local154++) {
			this.aClass1_Sub3_Sub3_1.method324(this.anIntArray33[local154]);
		}
		for (local158 = 0; local158 < 5; local158++) {
			this.aClass1_Sub3_Sub3_1.method324(this.anIntArray49[local158]);
		}
		return true;
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method133() {
		this.aBoolean27 = true;
		for (@Pc(6) int local6 = 0; local6 < 7; local6++) {
			this.anIntArray33[local6] = -1;
			for (@Pc(15) int local15 = 0; local15 < Class5.anInt66; local15++) {
				if (Class5.aClass5Array1[local15].anInt67 == local6 + (this.aBoolean33 ? 0 : 7)) {
					this.anIntArray33[local6] = local15;
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method134() {
		this.aClass27_13.method359();
		@Pc(17) int local17 = this.aClass1_Sub1_Sub2_Sub2_1.anInt701 / 32 + 48;
		@Pc(25) int local25 = 464 - this.aClass1_Sub1_Sub2_Sub2_1.anInt702 / 32;
		this.aClass1_Sub3_Sub2_Sub2_9.method240(21, local17, local25, this.anInt127, 151, this.anIntArray21, 146, this.anIntArray55, 9);
		this.aClass1_Sub3_Sub2_Sub2_8.method240(0, 25, 25, this.anInt127, 33, this.anIntArray43, 33, this.anIntArray42, 0);
		for (@Pc(59) int local59 = 0; local59 < this.anInt93; local59++) {
			local17 = this.anIntArray25[local59] * 4 + 2 - this.aClass1_Sub1_Sub2_Sub2_1.anInt701 / 32;
			local25 = this.anIntArray26[local59] * 4 + 2 - this.aClass1_Sub1_Sub2_Sub2_1.anInt702 / 32;
			this.method135(local17, local25, this.aClass1_Sub3_Sub2_Sub2Array6[local59]);
		}
		@Pc(111) int local111;
		for (@Pc(107) int local107 = 0; local107 < 104; local107++) {
			for (local111 = 0; local111 < 104; local111++) {
				@Pc(123) Class23 local123 = this.aClass23ArrayArrayArray1[this.anInt173][local107][local111];
				if (local123 != null) {
					local17 = local107 * 4 + 2 - this.aClass1_Sub1_Sub2_Sub2_1.anInt701 / 32;
					local25 = local111 * 4 + 2 - this.aClass1_Sub1_Sub2_Sub2_1.anInt702 / 32;
					this.method135(local17, local25, this.aClass1_Sub3_Sub2_Sub2_3);
				}
			}
		}
		for (local111 = 0; local111 < this.anInt201; local111++) {
			@Pc(176) Class1_Sub1_Sub2_Sub1 local176 = this.aClass1_Sub1_Sub2_Sub1Array1[this.anIntArray60[local111]];
			if (local176 != null && local176.method454() && local176.aClass38_1.aBoolean127) {
				local17 = local176.anInt701 / 32 - this.aClass1_Sub1_Sub2_Sub2_1.anInt701 / 32;
				local25 = local176.anInt702 / 32 - this.aClass1_Sub1_Sub2_Sub2_1.anInt702 / 32;
				this.method135(local17, local25, this.aClass1_Sub3_Sub2_Sub2_4);
			}
		}
		for (@Pc(222) int local222 = 0; local222 < this.anInt121; local222++) {
			@Pc(232) Class1_Sub1_Sub2_Sub2 local232 = this.aClass1_Sub1_Sub2_Sub2Array1[this.anIntArray31[local222]];
			if (local232 != null && local232.method468()) {
				local17 = local232.anInt701 / 32 - this.aClass1_Sub1_Sub2_Sub2_1.anInt701 / 32;
				local25 = local232.anInt702 / 32 - this.aClass1_Sub1_Sub2_Sub2_1.anInt702 / 32;
				this.method135(local17, local25, this.aClass1_Sub3_Sub2_Sub2_5);
			}
		}
		Class1_Sub3_Sub2.method270(16777215, 3, 82, 3, 93);
		this.aClass27_14.method359();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!gb;)V")
	private void method135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub3_Sub2_Sub2 arg2) {
		@Pc(7) int local7 = arg0 * arg0 + arg1 * arg1;
		if (local7 > 6400) {
			return;
		}
		@Pc(20) int local20 = Class1_Sub3_Sub1.anIntArray96[this.anInt127];
		@Pc(25) int local25 = Class1_Sub3_Sub1.anIntArray97[this.anInt127];
		@Pc(35) int local35 = arg1 * local20 + arg0 * local25 >> 16;
		@Pc(45) int local45 = arg1 * local25 - arg0 * local20 >> 16;
		if (local7 > 2500) {
			arg2.method241(this.aClass1_Sub3_Sub2_Sub3_4, local35 + 94 - arg2.anInt322 / 2, 83 - local45 - arg2.anInt323 / 2);
		} else {
			arg2.method236(local35 + 94 - arg2.anInt322 / 2, 83 - local45 - arg2.anInt323 / 2);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
	private void method136(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		if (this.anInt190 == -1) {
			this.aBoolean36 = true;
		}
		for (@Pc(8) int local8 = 99; local8 > 0; local8--) {
			this.anIntArray50[local8] = this.anIntArray50[local8 - 1];
			this.aStringArray2[local8] = this.aStringArray2[local8 - 1];
			this.aStringArray4[local8] = this.aStringArray4[local8 - 1];
		}
		this.anIntArray50[0] = arg0;
		this.aStringArray2[0] = arg1;
		this.aStringArray4[0] = arg2;
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method137(@OriginalArg(0) int arg0) {
		this.aClass27_15.method359();
		if (arg0 != 0) {
			this.aBoolean24 = !this.aBoolean24;
		}
		Class1_Sub3_Sub2_Sub1.anIntArray120 = this.anIntArray28;
		this.aClass1_Sub3_Sub2_Sub3_5.method260(0, 0);
		if (this.aBoolean20) {
			this.aClass1_Sub3_Sub2_Sub4_3.method274(40, this.aBoolean44, 239, 0, this.aString14);
			this.aClass1_Sub3_Sub2_Sub4_3.method274(60, this.aBoolean44, 239, 128, this.aString15 + "*");
		} else if (this.aBoolean30) {
			this.aClass1_Sub3_Sub2_Sub4_3.method274(40, this.aBoolean44, 239, 0, "Enter amount to transfer:");
			this.aClass1_Sub3_Sub2_Sub4_3.method274(60, this.aBoolean44, 239, 128, this.aString8 + "*");
		} else if (this.anInt190 == -1) {
			@Pc(105) int local105 = 0;
			Class1_Sub3_Sub2.method268(463, this.aByte8, 0, 0, 77);
			for (@Pc(114) int local114 = 0; local114 < 50; local114++) {
				if (this.aStringArray4[local114] != null) {
					@Pc(126) int local126 = this.anIntArray50[local114];
					@Pc(135) int local135 = this.anInt177 + 70 - local105 * 14;
					if (local126 == 0) {
						if (local135 > 0 && local135 < 110) {
							this.aClass1_Sub3_Sub2_Sub4_4.method277(this.aStringArray4[local114], 4, local135, 0);
						}
						local105++;
					}
					if (local126 == 1) {
						if (local135 > 0 && local135 < 110) {
							this.aClass1_Sub3_Sub2_Sub4_4.method277(this.aStringArray2[local114] + ":", 4, local135, 16777215);
							this.aClass1_Sub3_Sub2_Sub4_4.method277(this.aStringArray4[local114], this.aClass1_Sub3_Sub2_Sub4_4.method276(this.aStringArray2[local114]) + 12, local135, 255);
						}
						local105++;
					}
					if (local126 == 2 && (this.anInt143 == 0 || this.anInt143 == 1 && this.method138(this.aStringArray2[local114]))) {
						if (local135 > 0 && local135 < 110) {
							this.aClass1_Sub3_Sub2_Sub4_4.method277(this.aStringArray2[local114] + ":", 4, local135, 0);
							this.aClass1_Sub3_Sub2_Sub4_4.method277(this.aStringArray4[local114], this.aClass1_Sub3_Sub2_Sub4_4.method276(this.aStringArray2[local114]) + 12, local135, 255);
						}
						local105++;
					}
					if (local126 == 3 && (this.anInt135 == 0 || this.anInt135 == 1 && this.method138(this.aStringArray2[local114]))) {
						if (local135 > 0 && local135 < 110) {
							this.aClass1_Sub3_Sub2_Sub4_4.method277("From " + this.aStringArray2[local114] + ":", 4, local135, 0);
							this.aClass1_Sub3_Sub2_Sub4_4.method277(this.aStringArray4[local114], this.aClass1_Sub3_Sub2_Sub4_4.method276("From " + this.aStringArray2[local114]) + 12, local135, 8388608);
						}
						local105++;
					}
					if (local126 == 4 && (this.anInt122 == 0 || this.anInt122 == 1 && this.method138(this.aStringArray2[local114]))) {
						if (local135 > 0 && local135 < 110) {
							this.aClass1_Sub3_Sub2_Sub4_4.method277(this.aStringArray2[local114] + " " + this.aStringArray4[local114], 4, local135, 8388736);
						}
						local105++;
					}
					if (local126 == 5 && this.anInt135 < 2) {
						if (local135 > 0 && local135 < 110) {
							this.aClass1_Sub3_Sub2_Sub4_4.method277(this.aStringArray4[local114], 4, local135, 8388608);
						}
						local105++;
					}
					if (local126 == 6 && this.anInt135 < 2) {
						if (local135 > 0 && local135 < 110) {
							this.aClass1_Sub3_Sub2_Sub4_4.method277("To " + this.aStringArray2[local114] + ":", 4, local135, 0);
							this.aClass1_Sub3_Sub2_Sub4_4.method277(this.aStringArray4[local114], this.aClass1_Sub3_Sub2_Sub4_4.method276("To " + this.aStringArray2[local114]) + 12, local135, 8388608);
						}
						local105++;
					}
				}
			}
			Class1_Sub3_Sub2.method267();
			this.anInt189 = local105 * 14 + 7;
			if (this.anInt189 < 78) {
				this.anInt189 = 78;
			}
			this.method123(0, 463, this.anInt189 - this.anInt177 - 77, 77, this.anInt189);
			this.aClass1_Sub3_Sub2_Sub4_4.method277(this.aString7 + "*", 3, 90, 0);
			Class1_Sub3_Sub2.method272(0, 77, 479, 0);
		} else {
			this.method121(0, Class7.aClass7Array1[this.anInt190], 0, 0);
		}
		this.aClass27_15.method360(super.aGraphics2, 22, 375);
		this.aClass27_14.method359();
		Class1_Sub3_Sub2_Sub1.anIntArray120 = this.anIntArray30;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	private boolean method138(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt167; local5++) {
			if (arg0.equalsIgnoreCase(this.aStringArray3[local5])) {
				return true;
			}
		}
		if (this.aByte9 != -21) {
			throw new NullPointerException();
		}
		return arg0.equalsIgnoreCase(this.aClass1_Sub1_Sub2_Sub2_1.aString27);
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method139() {
		this.aClass27_12.method359();
		Class1_Sub3_Sub2_Sub1.anIntArray120 = this.anIntArray29;
		this.aClass1_Sub3_Sub2_Sub3_3.method260(0, 0);
		if (this.anInt100 != -1) {
			this.method121(0, Class7.aClass7Array1[this.anInt100], 0, 0);
		} else if (this.anIntArray54[this.anInt104] != -1) {
			this.method121(0, Class7.aClass7Array1[this.anIntArray54[this.anInt104]], 0, 0);
		}
		if (this.aBoolean45 && this.anInt148 == 1) {
			this.method113();
		}
		this.aClass27_12.method360(super.aGraphics2, 562, 231);
		this.aClass27_14.method359();
		Class1_Sub3_Sub2_Sub1.anIntArray120 = this.anIntArray30;
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)I")
	private int method140() {
		return 0;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)Ljava/awt/Component;")
	@Override
	protected Component method66() {
		if (signlink.mainapp == null) {
			return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
		} else {
			return signlink.mainapp;
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
				return new URL("http://" + this.aString11 + ":" + (this.anInt166 + 80));
			}
		} catch (@Pc(27) Exception local27) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)Ljava/lang/String;")
	private String method141() {
		if (signlink.mainapp == null) {
			return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
		} else {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	@Override
	public void method67(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		if (signlink.mainapp == null) {
			super.method67(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method142(@OriginalArg(0) String arg0) throws IOException {
		return signlink.mainapp == null ? new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream()) : signlink.openurl(arg0);
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)Ljava/net/Socket;")
	private Socket method143(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "gettune", descriptor = "()Ljava/lang/String;")
	private String method144() {
		if (signlink.midi == null) {
			return "none";
		} else {
			@Pc(12) String local12 = signlink.midi + ".mid.gz";
			signlink.midi = null;
			return local12;
		}
	}

	@OriginalMember(owner = "client!client", name = "getjingle", descriptor = "()Ljava/lang/String;")
	private String method145() {
		if (signlink.jingle == null) {
			return "none";
		} else {
			@Pc(12) String local12 = signlink.jingle + ".mid.gz";
			signlink.jingle = null;
			return local12;
		}
	}

	@OriginalMember(owner = "client!client", name = "getjinglelen", descriptor = "()I")
	private int method146() {
		return signlink.jinglelen;
	}
}
