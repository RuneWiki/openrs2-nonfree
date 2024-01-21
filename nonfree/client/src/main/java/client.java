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
import java.util.Calendar;
import java.util.Date;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!client")
public final class client extends Applet_Sub1 {

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Lclient!YFPQHQAV;")
	public static Class4_Sub1_Sub2_Sub5_Sub2 aClass4_Sub1_Sub2_Sub5_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "I")
	public static int anInt853;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "Z")
	private static boolean aBoolean225;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "Z")
	private static boolean aBoolean228;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "I")
	private static int anInt885;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "Z")
	private static boolean aBoolean236;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
	private static int anInt921;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
	public static int anInt927;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
	private static int anInt946;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "Z")
	private static boolean aBoolean251;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "I")
	private static int anInt968;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "I")
	private static int anInt987;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
	private static int anInt1000;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
	private static int anInt1012;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "I")
	private static int anInt1025;

	@OriginalMember(owner = "client!client", name = "Sj", descriptor = "I")
	private static int anInt1045;

	@OriginalMember(owner = "client!client", name = "ak", descriptor = "I")
	private static int anInt1049;

	@OriginalMember(owner = "client!client", name = "kk", descriptor = "I")
	private static int anInt1057;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "[I")
	private static int[] anIntArray217 = new int[99];

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
	private static int anInt852;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "Z")
	private static boolean aBoolean224;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "[I")
	public static final int[] anIntArray233;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
	private static int anInt919;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "Ljava/lang/String;")
	private static String aString27;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "[[I")
	public static final int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "[I")
	public static int[] anIntArray269;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "I")
	private int anInt830;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "I")
	private int anInt831;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "I")
	private int anInt832;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "[I")
	private int[] anIntArray213;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "[I")
	private int[] anIntArray214;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "Lclient!HZYGKZDT;")
	private Class13 aClass13_3;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!HZYGKZDT;")
	private Class13 aClass13_4;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Lclient!HZYGKZDT;")
	private Class13 aClass13_5;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Lclient!HZYGKZDT;")
	private Class13 aClass13_6;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Lclient!HZYGKZDT;")
	private Class13 aClass13_7;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Lclient!HZYGKZDT;")
	private Class13 aClass13_8;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Lclient!HZYGKZDT;")
	private Class13 aClass13_9;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Lclient!HZYGKZDT;")
	private Class13 aClass13_10;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Lclient!HZYGKZDT;")
	private Class13 aClass13_11;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
	private int anInt834;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
	private int anInt838;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
	private int anInt839;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	private int anInt840;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
	private int anInt841;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	private int anInt842;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
	private int anInt843;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private int anInt844;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
	private int anInt845;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
	private int anInt846;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
	private int anInt847;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "I")
	private int anInt848;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
	private int anInt849;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
	private int anInt850;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
	private int anInt851;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "Ljava/lang/String;")
	private String aString20;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private int anInt854;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
	private int anInt856;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
	private int anInt857;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
	private int anInt858;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
	private int anInt859;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt860;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
	private int anInt861;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "I")
	private int anInt862;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "Lclient!XNSGYTEG;")
	private Class45 aClass45_1;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
	private int anInt865;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
	private int anInt866;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
	private int anInt868;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "Lclient!ITVAFKCK;")
	private Class4_Sub1_Sub1_Sub2 aClass4_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "Lclient!ITVAFKCK;")
	private Class4_Sub1_Sub1_Sub2 aClass4_Sub1_Sub1_Sub2_2;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "Lclient!ITVAFKCK;")
	private Class4_Sub1_Sub1_Sub2 aClass4_Sub1_Sub1_Sub2_3;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "I")
	private int anInt870;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "[I")
	private int[] anIntArray223;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "[I")
	private int[] anIntArray224;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
	private int anInt873;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
	private int anInt874;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
	private int anInt875;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "I")
	private int anInt876;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "Lclient!HZYGKZDT;")
	private Class13 aClass13_12;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "Lclient!HZYGKZDT;")
	private Class13 aClass13_13;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "Lclient!HZYGKZDT;")
	private Class13 aClass13_14;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "Lclient!HZYGKZDT;")
	private Class13 aClass13_15;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "Lclient!HZYGKZDT;")
	private Class13 aClass13_16;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "Lclient!HZYGKZDT;")
	private Class13 aClass13_17;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "Lclient!HZYGKZDT;")
	private Class13 aClass13_18;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "Lclient!HZYGKZDT;")
	private Class13 aClass13_19;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "Lclient!HZYGKZDT;")
	private Class13 aClass13_20;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
	private int anInt877;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "Lclient!AKPFVPPG;")
	private Class2 aClass2_2;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "I")
	private int anInt879;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
	private int anInt880;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "Ljava/lang/String;")
	private String aString21;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "I")
	private int anInt889;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
	private int anInt891;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "I")
	private int anInt892;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
	private int anInt893;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "I")
	private int anInt894;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
	private int anInt895;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
	private int anInt896;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
	private int anInt897;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
	private int anInt899;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "Lclient!ITVAFKCK;")
	private Class4_Sub1_Sub1_Sub2 aClass4_Sub1_Sub1_Sub2_4;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "Lclient!ITVAFKCK;")
	private Class4_Sub1_Sub1_Sub2 aClass4_Sub1_Sub1_Sub2_5;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "Lclient!ITVAFKCK;")
	private Class4_Sub1_Sub1_Sub2 aClass4_Sub1_Sub1_Sub2_6;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "Lclient!ITVAFKCK;")
	private Class4_Sub1_Sub1_Sub2 aClass4_Sub1_Sub1_Sub2_7;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "Lclient!ITVAFKCK;")
	private Class4_Sub1_Sub1_Sub2 aClass4_Sub1_Sub1_Sub2_8;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "I")
	private int anInt900;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "Lclient!ITVAFKCK;")
	private Class4_Sub1_Sub1_Sub2 aClass4_Sub1_Sub1_Sub2_9;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "Lclient!ITVAFKCK;")
	private Class4_Sub1_Sub1_Sub2 aClass4_Sub1_Sub1_Sub2_10;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
	private int anInt903;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
	private int anInt904;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
	private int anInt905;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "I")
	private int anInt908;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "Lclient!KUDWIDHU;")
	private Class4_Sub1_Sub1_Sub3 aClass4_Sub1_Sub1_Sub3_3;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
	private int anInt910;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
	private int anInt911;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
	private int anInt913;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "I")
	private int anInt914;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
	private int anInt917;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
	private int anInt920;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
	private int anInt922;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
	private int anInt924;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
	private int anInt925;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
	private int anInt928;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "I")
	private int anInt929;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
	private int anInt930;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
	private int anInt932;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "Lclient!ITVAFKCK;")
	private Class4_Sub1_Sub1_Sub2 aClass4_Sub1_Sub1_Sub2_11;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "Lclient!ITVAFKCK;")
	private Class4_Sub1_Sub1_Sub2 aClass4_Sub1_Sub1_Sub2_12;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "Lclient!ITVAFKCK;")
	private Class4_Sub1_Sub1_Sub2 aClass4_Sub1_Sub1_Sub2_13;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "Lclient!ITVAFKCK;")
	private Class4_Sub1_Sub1_Sub2 aClass4_Sub1_Sub1_Sub2_14;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "Lclient!ITVAFKCK;")
	private Class4_Sub1_Sub1_Sub2 aClass4_Sub1_Sub1_Sub2_15;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "Lclient!ITVAFKCK;")
	private Class4_Sub1_Sub1_Sub2 aClass4_Sub1_Sub1_Sub2_16;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "Lclient!ITVAFKCK;")
	private Class4_Sub1_Sub1_Sub2 aClass4_Sub1_Sub1_Sub2_17;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
	private int anInt935;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "Lclient!HZYGKZDT;")
	private Class13 aClass13_21;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "Lclient!HZYGKZDT;")
	private Class13 aClass13_22;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "Lclient!HZYGKZDT;")
	private Class13 aClass13_23;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "[I")
	private int[] anIntArray248;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "[I")
	private int[] anIntArray249;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "[I")
	private int[] anIntArray250;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "[I")
	private int[] anIntArray251;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "Lclient!KUDWIDHU;")
	private Class4_Sub1_Sub1_Sub3 aClass4_Sub1_Sub1_Sub3_4;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "[I")
	private int[] anIntArray252;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "[I")
	private int[] anIntArray253;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "[I")
	private int[] anIntArray254;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "[I")
	private int[] anIntArray255;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
	private int anInt938;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
	private int anInt939;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private int anInt940;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "I")
	private int anInt941;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "[I")
	private int[] anIntArray256;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "[I")
	private int[] anIntArray257;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "[I")
	private int[] anIntArray258;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
	private int anInt942;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
	private int anInt943;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
	private int anInt944;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "Lclient!SRCZZRYO;")
	private Class38 aClass38_1;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
	private int anInt947;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
	private int anInt948;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
	private int anInt951;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "Lclient!KUDWIDHU;")
	private Class4_Sub1_Sub1_Sub3 aClass4_Sub1_Sub1_Sub3_5;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "Lclient!KUDWIDHU;")
	private Class4_Sub1_Sub1_Sub3 aClass4_Sub1_Sub1_Sub3_6;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
	private int anInt952;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
	private int anInt954;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
	private int anInt955;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private int anInt956;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
	private int anInt959;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
	private int anInt960;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
	private int anInt961;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
	private int anInt962;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "I")
	private int anInt963;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "I")
	private int anInt966;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
	private int anInt967;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "Lclient!LVBGZMMP;")
	private Class20_Sub1 aClass20_Sub1_1;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "I")
	private int anInt971;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
	private int anInt972;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "I")
	private int anInt975;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "I")
	private int anInt976;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "I")
	private int anInt978;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "I")
	private int anInt979;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "Lclient!CAMKASVY;")
	private Class4_Sub1_Sub1_Sub1 aClass4_Sub1_Sub1_Sub1_2;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "Lclient!CAMKASVY;")
	private Class4_Sub1_Sub1_Sub1 aClass4_Sub1_Sub1_Sub1_3;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "Lclient!CAMKASVY;")
	private Class4_Sub1_Sub1_Sub1 aClass4_Sub1_Sub1_Sub1_4;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "Lclient!CAMKASVY;")
	private Class4_Sub1_Sub1_Sub1 aClass4_Sub1_Sub1_Sub1_5;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
	private int anInt981;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "Ljava/lang/String;")
	private String aString28;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
	private int anInt983;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "Ljava/lang/String;")
	private String aString29;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "[Lclient!ITVAFKCK;")
	private Class4_Sub1_Sub1_Sub2[] aClass4_Sub1_Sub1_Sub2Array3;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
	private int anInt990;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
	private int anInt991;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
	private int anInt993;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
	private int anInt995;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
	private int anInt997;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "I")
	private int anInt998;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "I")
	private int anInt999;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "Lclient!KUDWIDHU;")
	private Class4_Sub1_Sub1_Sub3 aClass4_Sub1_Sub1_Sub3_7;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "Lclient!KUDWIDHU;")
	private Class4_Sub1_Sub1_Sub3 aClass4_Sub1_Sub1_Sub3_8;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "I")
	private int anInt1001;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
	private int anInt1002;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "I")
	private int anInt1003;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
	private int anInt1004;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "Lclient!KUDWIDHU;")
	private Class4_Sub1_Sub1_Sub3 aClass4_Sub1_Sub1_Sub3_9;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
	private int anInt1005;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
	private int anInt1006;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "Lclient!HZYGKZDT;")
	private Class13 aClass13_24;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "Lclient!HZYGKZDT;")
	private Class13 aClass13_25;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "Lclient!HZYGKZDT;")
	private Class13 aClass13_26;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "Lclient!HZYGKZDT;")
	private Class13 aClass13_27;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
	private int anInt1008;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
	private int anInt1011;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "I")
	private int anInt1013;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "I")
	private int anInt1014;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "I")
	private int anInt1015;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
	private int anInt1018;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
	private int anInt1019;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
	private int anInt1020;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
	private int anInt1021;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "Lclient!ITVAFKCK;")
	private Class4_Sub1_Sub1_Sub2 aClass4_Sub1_Sub1_Sub2_18;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "Lclient!ITVAFKCK;")
	private Class4_Sub1_Sub1_Sub2 aClass4_Sub1_Sub1_Sub2_19;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "Lclient!ITVAFKCK;")
	private Class4_Sub1_Sub1_Sub2 aClass4_Sub1_Sub1_Sub2_20;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
	private int anInt1022;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
	private int anInt1023;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "I")
	private int anInt1024;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
	private int anInt1026;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "Lclient!KUDWIDHU;")
	private Class4_Sub1_Sub1_Sub3 aClass4_Sub1_Sub1_Sub3_10;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "Lclient!KUDWIDHU;")
	private Class4_Sub1_Sub1_Sub3 aClass4_Sub1_Sub1_Sub3_11;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "Lclient!YEQNFKYU;")
	private Class47 aClass47_2;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "Lclient!KUDWIDHU;")
	private Class4_Sub1_Sub1_Sub3 aClass4_Sub1_Sub1_Sub3_12;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "Lclient!KUDWIDHU;")
	private Class4_Sub1_Sub1_Sub3 aClass4_Sub1_Sub1_Sub3_13;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "Lclient!KUDWIDHU;")
	private Class4_Sub1_Sub1_Sub3 aClass4_Sub1_Sub1_Sub3_14;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "Lclient!KUDWIDHU;")
	private Class4_Sub1_Sub1_Sub3 aClass4_Sub1_Sub1_Sub3_15;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "Lclient!KUDWIDHU;")
	private Class4_Sub1_Sub1_Sub3 aClass4_Sub1_Sub1_Sub3_16;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "I")
	private int anInt1033;

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "I")
	private int anInt1035;

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "I")
	private int anInt1036;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "I")
	private int anInt1037;

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "I")
	private int anInt1038;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "I")
	private int anInt1039;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "Lclient!KUDWIDHU;")
	private Class4_Sub1_Sub1_Sub3 aClass4_Sub1_Sub1_Sub3_17;

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "I")
	private int anInt1040;

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "I")
	private int anInt1043;

	@OriginalMember(owner = "client!client", name = "Pj", descriptor = "I")
	private int anInt1044;

	@OriginalMember(owner = "client!client", name = "Wj", descriptor = "Lclient!GFMKEKCW;")
	private Class9 aClass9_1;

	@OriginalMember(owner = "client!client", name = "Yj", descriptor = "I")
	private int anInt1047;

	@OriginalMember(owner = "client!client", name = "Zj", descriptor = "I")
	private int anInt1048;

	@OriginalMember(owner = "client!client", name = "bk", descriptor = "I")
	private int anInt1050;

	@OriginalMember(owner = "client!client", name = "dk", descriptor = "I")
	private int anInt1051;

	@OriginalMember(owner = "client!client", name = "ek", descriptor = "I")
	private int anInt1052;

	@OriginalMember(owner = "client!client", name = "fk", descriptor = "I")
	private int anInt1053;

	@OriginalMember(owner = "client!client", name = "gk", descriptor = "I")
	private int anInt1054;

	@OriginalMember(owner = "client!client", name = "ik", descriptor = "I")
	private int anInt1056;

	@OriginalMember(owner = "client!client", name = "jk", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "S", descriptor = "Z")
	private boolean aBoolean219 = false;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "[I")
	private int[] anIntArray212 = new int[9];

	@OriginalMember(owner = "client!client", name = "U", descriptor = "Z")
	private boolean aBoolean220 = false;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "B")
	private byte aByte36 = 93;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	private int anInt833 = 11573;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Z")
	private boolean aBoolean221 = false;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Z")
	private boolean aBoolean222 = true;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "[I")
	private int[] anIntArray215 = new int[256];

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
	private int anInt836 = -1;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
	private int anInt837 = 39461;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "Z")
	private boolean aBoolean223 = false;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "[J")
	private long[] aLongArray3 = new long[200];

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "[I")
	private int[] anIntArray216 = new int[1000];

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "Ljava/lang/String;")
	private String aString18 = "";

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "Ljava/lang/String;")
	private String aString19 = "";

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "[I")
	private int[] anIntArray218 = new int[50];

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "Z")
	private boolean aBoolean226 = true;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "I")
	private int anInt855 = 2;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[500];

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "Z")
	private boolean aBoolean227 = false;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "[I")
	private int[] anIntArray219 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "[I")
	private int[] anIntArray220 = new int[1000];

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "Lclient!FTMSICIZ;")
	private Class4_Sub1_Sub3 aClass4_Sub1_Sub3_6 = Class4_Sub1_Sub3.method90();

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "Z")
	private boolean aBoolean229 = false;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "Lclient!QGWIBVPG;")
	private Class30 aClass30_10 = new Class30(9203);

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "B")
	private byte aByte37 = -90;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "I")
	private int anInt863 = -1;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
	private int anInt864 = 12912;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "Z")
	private volatile boolean aBoolean230 = false;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "[I")
	private int[] anIntArray221 = new int[33];

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
	private int anInt867 = 2064;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
	private int anInt869 = 884;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "[I")
	private int[] anIntArray222 = new int[5];

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "[J")
	private long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "Z")
	private boolean aBoolean231 = true;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "[I")
	private final int[] anIntArray225 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "[I")
	private int[] anIntArray226 = new int[151];

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "Z")
	private boolean aBoolean232 = false;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "[I")
	private int[] anIntArray227 = new int[500];

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "[I")
	private int[] anIntArray228 = new int[500];

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "[I")
	private int[] anIntArray229 = new int[500];

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "[I")
	private int[] anIntArray230 = new int[500];

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "I")
	private int anInt878 = -30605;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "Z")
	private boolean aBoolean233 = false;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
	private int anInt882 = -1;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
	private int anInt883 = 5063219;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "I")
	private int anInt887 = 1;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
	private int anInt888 = -1;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "B")
	private byte aByte38 = 5;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "[I")
	private int[] anIntArray231 = new int[Class43.anInt634];

	@OriginalMember(owner = "client!client", name = "td", descriptor = "[I")
	private int[] anIntArray232 = new int[5];

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
	private int anInt890 = 10;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "B")
	private byte aByte39 = 2;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "Z")
	private boolean aBoolean234 = false;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "[I")
	private int[] anIntArray234 = new int[50];

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "[Lclient!ITVAFKCK;")
	private Class4_Sub1_Sub1_Sub2[] aClass4_Sub1_Sub1_Sub2Array2 = new Class4_Sub1_Sub1_Sub2[13];

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "B")
	private byte aByte40 = -36;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
	private int anInt901 = 380;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
	private int anInt902 = -3404;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "Lclient!QGWIBVPG;")
	private Class30 aClass30_11 = new Class30(9203);

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
	private int anInt906 = -1;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
	private int anInt907 = -1;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "Z")
	private boolean aBoolean235 = false;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "I")
	private int anInt909 = -1;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "[I")
	private int[] anIntArray235 = new int[200];

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "Ljava/lang/String;")
	private String aString22 = "";

	@OriginalMember(owner = "client!client", name = "je", descriptor = "I")
	private int anInt912 = 9;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "[Lclient!KUDWIDHU;")
	private Class4_Sub1_Sub1_Sub3[] aClass4_Sub1_Sub1_Sub3Array4 = new Class4_Sub1_Sub1_Sub3[100];

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
	private int anInt915 = 6187;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private int anInt916 = 581;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
	private int anInt918 = 50;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "[I")
	private int[] anIntArray236 = new int[this.anInt918];

	@OriginalMember(owner = "client!client", name = "se", descriptor = "[I")
	private int[] anIntArray237 = new int[this.anInt918];

	@OriginalMember(owner = "client!client", name = "te", descriptor = "[I")
	private int[] anIntArray238 = new int[this.anInt918];

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "[I")
	private int[] anIntArray239 = new int[this.anInt918];

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "[I")
	private int[] anIntArray240 = new int[this.anInt918];

	@OriginalMember(owner = "client!client", name = "we", descriptor = "[I")
	private int[] anIntArray241 = new int[this.anInt918];

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "[I")
	private int[] anIntArray242 = new int[this.anInt918];

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[this.anInt918];

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "Z")
	private boolean aBoolean237 = false;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "Z")
	private boolean aBoolean238 = false;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "[I")
	private int[] anIntArray243 = new int[151];

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "[I")
	private int[] anIntArray244 = new int[4000];

	@OriginalMember(owner = "client!client", name = "He", descriptor = "[I")
	private int[] anIntArray245 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "Z")
	private boolean aBoolean239 = false;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
	private int anInt923 = -1;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "[Lclient!KUDWIDHU;")
	private Class4_Sub1_Sub1_Sub3[] aClass4_Sub1_Sub1_Sub3Array5 = new Class4_Sub1_Sub1_Sub3[20];

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "Z")
	private volatile boolean aBoolean240 = false;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "[[[Lclient!QGWIBVPG;")
	private Class30[][][] aClass30ArrayArrayArray1 = new Class30[4][104][104];

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "[I")
	private int[] anIntArray246 = new int[50];

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "[[I")
	private int[][] anIntArrayArray22 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "Z")
	public boolean aBoolean241 = false;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "Z")
	private boolean aBoolean242 = true;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "B")
	private byte aByte41 = 2;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private int anInt934 = 25957;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "[Lclient!ARIAIPRE;")
	public Class3[] aClass3Array1 = new Class3[5];

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "Lclient!FTMSICIZ;")
	private Class4_Sub1_Sub3 aClass4_Sub1_Sub3_7 = Class4_Sub1_Sub3.method90();

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "[[I")
	private int[][] anIntArrayArray23 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "Ljava/lang/String;")
	private String aString23 = "";

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "Z")
	private boolean aBoolean243 = false;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "Ljava/lang/String;")
	private String aString24 = "";

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "[Lclient!KUDWIDHU;")
	private Class4_Sub1_Sub1_Sub3[] aClass4_Sub1_Sub1_Sub3Array6 = new Class4_Sub1_Sub1_Sub3[8];

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "[I")
	private int[] anIntArray247 = new int[100];

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[100];

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[100];

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "B")
	private byte aByte42 = 1;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[5];

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "Z")
	private boolean aBoolean244 = false;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "Ljava/lang/String;")
	private String aString25 = "";

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "I")
	private int anInt936 = 402;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
	private int anInt937 = 3;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "Z")
	private boolean aBoolean245 = false;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "Z")
	private boolean aBoolean246 = true;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "Z")
	private boolean aBoolean247 = false;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "[Lclient!ZSRJFSKK;")
	private Class50[] aClass50Array1 = new Class50[4];

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "Lclient!PCARWQQC;")
	private Class26 aClass26_1 = new Class26();

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "Ljava/lang/String;")
	private String aString26 = "";

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[100];

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "[I")
	private int[] anIntArray259 = new int[100];

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "Z")
	private boolean aBoolean248 = false;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "Z")
	private boolean aBoolean249 = false;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
	private int anInt945 = 5948;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "Z")
	private boolean aBoolean250 = true;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "[I")
	private int[] anIntArray260 = new int[] { 17, 24, 34, 40 };

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
	private int anInt953 = 128;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "[Lclient!KUDWIDHU;")
	private Class4_Sub1_Sub1_Sub3[] aClass4_Sub1_Sub1_Sub3Array7 = new Class4_Sub1_Sub1_Sub3[1000];

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "Z")
	private boolean aBoolean252 = false;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
	private int anInt958 = 1;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "Z")
	private boolean aBoolean253 = true;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "[I")
	private int[] anIntArray261 = new int[Class43.anInt634];

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "Z")
	private boolean aBoolean255 = false;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "Z")
	private boolean aBoolean256 = false;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "I")
	private int anInt980 = 6;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
	private int anInt982 = -1;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "Z")
	private boolean aBoolean257 = false;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "I")
	private final int anInt985 = 100;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "[I")
	private int[] anIntArray262 = new int[100];

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "Z")
	private boolean aBoolean258 = true;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "I")
	private int anInt988 = 78;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "[I")
	private int[] anIntArray263 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
	private int anInt989 = 3353893;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "Lclient!QGWIBVPG;")
	private Class30 aClass30_12 = new Class30(9203);

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "I")
	private int anInt992 = 2;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
	private int anInt994 = 7759444;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "[I")
	private int[] anIntArray264 = new int[Class43.anInt634];

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "B")
	private byte aByte43 = 90;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "Z")
	private boolean aBoolean259 = false;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "[I")
	private int[] anIntArray265 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "Z")
	private boolean aBoolean260 = false;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "Ljava/lang/String;")
	private String aString30 = "";

	@OriginalMember(owner = "client!client", name = "li", descriptor = "Ljava/lang/String;")
	private String aString31 = "";

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private int anInt1007 = 984;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
	private int anInt1010 = 2;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "[Lclient!KUDWIDHU;")
	private Class4_Sub1_Sub1_Sub3[] aClass4_Sub1_Sub1_Sub3Array8 = new Class4_Sub1_Sub1_Sub3[32];

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "[Lclient!KUDWIDHU;")
	private Class4_Sub1_Sub1_Sub3[] aClass4_Sub1_Sub1_Sub3Array9 = new Class4_Sub1_Sub1_Sub3[32];

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "Z")
	private boolean aBoolean261 = false;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray14 = new String[200];

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "B")
	private byte aByte44 = 92;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "Z")
	private boolean aBoolean262 = false;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "Lclient!FTMSICIZ;")
	private Class4_Sub1_Sub3 aClass4_Sub1_Sub3_8 = new Class4_Sub1_Sub3(new byte[5000], (byte) 3);

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "[Lclient!VMSVDNWD;")
	private Class4_Sub1_Sub2_Sub5_Sub1[] aClass4_Sub1_Sub2_Sub5_Sub1Array1 = new Class4_Sub1_Sub2_Sub5_Sub1[16384];

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "[I")
	private int[] anIntArray266 = new int[16384];

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "[I")
	private int[] anIntArray267 = new int[5];

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
	private int anInt1016 = 440;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "Z")
	private volatile boolean aBoolean263 = false;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "[Lclient!ITVAFKCK;")
	private Class4_Sub1_Sub1_Sub2[] aClass4_Sub1_Sub1_Sub2Array4 = new Class4_Sub1_Sub1_Sub2[2];

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "[I")
	private int[] anIntArray268 = new int[33];

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "Z")
	private boolean aBoolean264 = false;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "Z")
	private boolean aBoolean265 = false;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "I")
	private int anInt1027 = -1;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "[Lclient!KUDWIDHU;")
	private Class4_Sub1_Sub1_Sub3[] aClass4_Sub1_Sub1_Sub3Array10 = new Class4_Sub1_Sub1_Sub3[32];

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "I")
	private int anInt1029 = -1;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "I")
	private int anInt1030 = -1;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
	private int anInt1031 = -1;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "[I")
	private int[] anIntArray270 = new int[7];

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
	private int anInt1032 = -1;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "[I")
	private int[] anIntArray271 = new int[2000];

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "I")
	private int anInt1034 = -1;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "B")
	private byte aByte45 = 93;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "Lclient!FTMSICIZ;")
	private Class4_Sub1_Sub3 aClass4_Sub1_Sub3_9 = Class4_Sub1_Sub3.method90();

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "[I")
	private int[] anIntArray272 = new int[5];

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "I")
	private int anInt1041 = 2048;

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "I")
	private int anInt1042 = 2047;

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "[Lclient!YFPQHQAV;")
	private Class4_Sub1_Sub2_Sub5_Sub2[] aClass4_Sub1_Sub2_Sub5_Sub2Array1 = new Class4_Sub1_Sub2_Sub5_Sub2[this.anInt1041];

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "[I")
	private int[] anIntArray273 = new int[this.anInt1041];

	@OriginalMember(owner = "client!client", name = "Qj", descriptor = "[I")
	private int[] anIntArray274 = new int[this.anInt1041];

	@OriginalMember(owner = "client!client", name = "Rj", descriptor = "[Lclient!FTMSICIZ;")
	private Class4_Sub1_Sub3[] aClass4_Sub1_Sub3Array1 = new Class4_Sub1_Sub3[this.anInt1041];

	@OriginalMember(owner = "client!client", name = "Tj", descriptor = "[I")
	private int[] anIntArray275 = new int[5];

	@OriginalMember(owner = "client!client", name = "Uj", descriptor = "I")
	private int anInt1046 = 2301979;

	@OriginalMember(owner = "client!client", name = "Vj", descriptor = "Z")
	private boolean aBoolean266 = true;

	@OriginalMember(owner = "client!client", name = "Xj", descriptor = "[I")
	public int[] anIntArray276 = new int[2000];

	@OriginalMember(owner = "client!client", name = "ck", descriptor = "[Lclient!ITVAFKCK;")
	private Class4_Sub1_Sub1_Sub2[] aClass4_Sub1_Sub1_Sub2Array5 = new Class4_Sub1_Sub1_Sub2[100];

	@OriginalMember(owner = "client!client", name = "hk", descriptor = "I")
	private int anInt1055 = -1;

	static {
		@Pc(9) int local9 = 0;
		@Pc(11) int local11;
		for (local11 = 0; local11 < 99; local11++) {
			@Pc(16) int local16 = local11 + 1;
			@Pc(29) int local29 = (int) ((double) local16 + Math.pow(2.0D, (double) local16 / 7.0D) * 300.0D);
			local9 += local29;
			anIntArray217[local11] = local9 / 4;
		}
		anInt852 = 10;
		aBoolean224 = true;
		aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		anIntArray233 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		anInt919 = -6102;
		aBoolean254 = true;
		aString27 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		anIntArrayArray25 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		anIntArray269 = new int[32];
		local9 = 2;
		for (local11 = 0; local11 < 32; local11++) {
			anIntArray269[local11] = local9 - 1;
			local9 += local9;
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 372);
			if (arg0.length == 5) {
				anInt852 = Integer.parseInt(arg0[0]);
				anInt853 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method607();
				} else if (arg0[2].equals("highmem")) {
					method725();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean224 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean224 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt1060 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method577();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private static void method607() {
		try {
			Class45.aBoolean181 = true;
			Class4_Sub1_Sub1_Sub4.aBoolean206 = true;
			aBoolean225 = true;
			Class48.aBoolean195 = true;
			Class28.aBoolean133 = true;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("25077, " + 5 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(III)Ljava/lang/String;")
	private static String method632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
			signlink.reporterror("63190, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	private static String method633(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("29577, " + arg0 + ", " + false + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)Ljava/lang/String;")
	private static String method679(@OriginalArg(0) int arg0) {
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
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("45705, " + arg0 + ", " + 0 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "R", descriptor = "(I)V")
	private static void method725() {
		try {
			Class45.aBoolean181 = false;
			Class4_Sub1_Sub1_Sub4.aBoolean206 = false;
			aBoolean225 = false;
			Class48.aBoolean195 = false;
			Class28.aBoolean133 = false;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("21677, " + 270 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method590(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString30 = "";
				this.aString31 = "Connecting to server...";
				this.method646(true);
			}
			this.aClass38_1 = new Class38(this.method619(anInt853 + 43594), 34706, this);
			@Pc(30) long local30 = Class36.method378(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass4_Sub1_Sub3_6.anInt101 = 0;
			this.aClass4_Sub1_Sub3_6.method92(14);
			this.aClass4_Sub1_Sub3_6.method92(local37);
			this.aClass38_1.method393(2, this.anInt915, this.aClass4_Sub1_Sub3_6.aByteArray3);
			for (@Pc(61) int local61 = 0; local61 < 8; local61++) {
				this.aClass38_1.method390();
			}
			@Pc(75) int local75 = this.aClass38_1.method390();
			@Pc(77) int local77 = local75;
			@Pc(226) int local226;
			@Pc(260) int local260;
			if (local75 == 0) {
				this.aClass38_1.method392(this.aClass4_Sub1_Sub3_9.aByteArray3, 0, 8);
				this.aClass4_Sub1_Sub3_9.anInt101 = 0;
				this.aLong30 = this.aClass4_Sub1_Sub3_9.method108();
				@Pc(100) int[] local100 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong30 >> 32), (int) this.aLong30 };
				this.aClass4_Sub1_Sub3_6.anInt101 = 0;
				this.aClass4_Sub1_Sub3_6.method92(10);
				this.aClass4_Sub1_Sub3_6.method96(local100[0]);
				this.aClass4_Sub1_Sub3_6.method96(local100[1]);
				this.aClass4_Sub1_Sub3_6.method96(local100[2]);
				this.aClass4_Sub1_Sub3_6.method96(local100[3]);
				this.aClass4_Sub1_Sub3_6.method96(signlink.anInt1059);
				this.aClass4_Sub1_Sub3_6.method99(arg0);
				this.aClass4_Sub1_Sub3_6.method99(arg1);
				this.aClass4_Sub1_Sub3_6.method117(aBigInteger1, aBigInteger2);
				this.aClass4_Sub1_Sub3_7.anInt101 = 0;
				if (arg2) {
					this.aClass4_Sub1_Sub3_7.method92(18);
				} else {
					this.aClass4_Sub1_Sub3_7.method92(16);
				}
				this.aClass4_Sub1_Sub3_7.method92(this.aClass4_Sub1_Sub3_6.anInt101 + 36 + 1 + 1 + 2);
				this.aClass4_Sub1_Sub3_7.method92(255);
				this.aClass4_Sub1_Sub3_7.method93(372);
				this.aClass4_Sub1_Sub3_7.method92(aBoolean225 ? 1 : 0);
				for (local226 = 0; local226 < 9; local226++) {
					this.aClass4_Sub1_Sub3_7.method96(this.anIntArray212[local226]);
				}
				this.aClass4_Sub1_Sub3_7.method100(this.aClass4_Sub1_Sub3_6.aByteArray3, this.aClass4_Sub1_Sub3_6.anInt101);
				this.aClass4_Sub1_Sub3_6.aClass47_1 = new Class47(local100, 5);
				for (local260 = 0; local260 < 4; local260++) {
					local100[local260] += 50;
				}
				this.aClass47_2 = new Class47(local100, 5);
				this.aClass38_1.method393(this.aClass4_Sub1_Sub3_7.anInt101, this.anInt915, this.aClass4_Sub1_Sub3_7.aByteArray3);
				local75 = this.aClass38_1.method390();
			}
			if (local75 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(303) Exception local303) {
				}
				this.method590(arg0, arg1, arg2);
			} else {
				@Pc(391) int local391;
				if (local75 == 2) {
					this.anInt877 = this.aClass38_1.method390();
					aBoolean228 = this.aClass38_1.method390() == 1;
					this.aLong32 = 0L;
					this.anInt949 = 0;
					this.aClass9_1.anInt122 = 0;
					super.aBoolean218 = true;
					this.aBoolean266 = true;
					this.aBoolean241 = true;
					this.aClass4_Sub1_Sub3_6.anInt101 = 0;
					this.aClass4_Sub1_Sub3_9.anInt101 = 0;
					this.anInt996 = -1;
					this.anInt858 = -1;
					this.anInt859 = -1;
					this.anInt860 = -1;
					this.anInt995 = 0;
					this.anInt997 = 0;
					this.anInt1040 = 0;
					this.anInt999 = 0;
					this.anInt1056 = 0;
					this.anInt990 = 0;
					this.aBoolean237 = false;
					super.anInt817 = 0;
					for (local391 = 0; local391 < 100; local391++) {
						this.aStringArray11[local391] = null;
					}
					this.anInt848 = 0;
					this.anInt879 = 0;
					this.anInt967 = 0;
					this.anInt834 = 0;
					this.anInt854 = (int) (Math.random() * 100.0D) - 50;
					this.anInt1009 = (int) (Math.random() * 110.0D) - 55;
					this.anInt957 = (int) (Math.random() * 80.0D) - 40;
					this.anInt991 = (int) (Math.random() * 120.0D) - 60;
					this.anInt886 = (int) (Math.random() * 30.0D) - 20;
					this.anInt954 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt847 = 0;
					this.anInt907 = -1;
					this.anInt1003 = 0;
					this.anInt1004 = 0;
					this.anInt1043 = 0;
					this.anInt1013 = 0;
					for (local226 = 0; local226 < this.anInt1041; local226++) {
						this.aClass4_Sub1_Sub2_Sub5_Sub2Array1[local226] = null;
						this.aClass4_Sub1_Sub3Array1[local226] = null;
					}
					for (local260 = 0; local260 < 16384; local260++) {
						this.aClass4_Sub1_Sub2_Sub5_Sub1Array1[local260] = null;
					}
					aClass4_Sub1_Sub2_Sub5_Sub2_1 = this.aClass4_Sub1_Sub2_Sub5_Sub2Array1[this.anInt1042] = new Class4_Sub1_Sub2_Sub5_Sub2();
					this.aClass30_10.method350();
					this.aClass30_11.method350();
					@Pc(536) int local536;
					@Pc(540) int local540;
					for (@Pc(532) int local532 = 0; local532 < 4; local532++) {
						for (local536 = 0; local536 < 104; local536++) {
							for (local540 = 0; local540 < 104; local540++) {
								this.aClass30ArrayArrayArray1[local532][local536][local540] = null;
							}
						}
					}
					this.aClass30_12 = new Class30(9203);
					this.anInt911 = 0;
					this.anInt910 = 0;
					this.method599(this.anInt888);
					this.anInt888 = -1;
					this.method599(this.anInt882);
					this.anInt882 = -1;
					this.method599(this.anInt863);
					this.anInt863 = -1;
					this.method599(this.anInt923);
					this.anInt923 = -1;
					this.method599(this.anInt1031);
					this.anInt1031 = -1;
					this.method599(this.anInt1032);
					this.anInt1032 = -1;
					this.method599(this.anInt1027);
					this.anInt1027 = -1;
					this.aBoolean235 = false;
					this.anInt937 = 3;
					this.anInt846 = 0;
					this.aBoolean237 = false;
					this.aBoolean248 = false;
					this.aString28 = null;
					this.anInt856 = 0;
					this.anInt909 = -1;
					this.aBoolean222 = true;
					this.method673();
					for (local536 = 0; local536 < 5; local536++) {
						this.anIntArray232[local536] = 0;
					}
					for (local540 = 0; local540 < 5; local540++) {
						this.aStringArray12[local540] = null;
						this.aBooleanArray11[local540] = false;
					}
					anInt987 = 0;
					anInt1000 = 0;
					anInt1045 = 0;
					anInt1049 = 0;
					anInt946 = 0;
					this.method723();
				} else if (local75 == 3) {
					this.aString30 = "";
					this.aString31 = "Invalid username or password.";
				} else if (local75 == 4) {
					this.aString30 = "Your account has been disabled.";
					this.aString31 = "Please check your message-centre for details.";
				} else if (local75 == 5) {
					this.aString30 = "Your account is already logged in.";
					this.aString31 = "Try again in 60 secs...";
				} else if (local75 == 6) {
					this.aString30 = "RuneScape has been updated!";
					this.aString31 = "Please reload this page.";
				} else if (local75 == 7) {
					this.aString30 = "This world is full.";
					this.aString31 = "Please use a different world.";
				} else if (local75 == 8) {
					this.aString30 = "Unable to connect.";
					this.aString31 = "Login server offline.";
				} else if (local75 == 9) {
					this.aString30 = "Login limit exceeded.";
					this.aString31 = "Too many connections from your address.";
				} else if (local75 == 10) {
					this.aString30 = "Unable to connect.";
					this.aString31 = "Bad session id.";
				} else if (local75 == 12) {
					this.aString30 = "You need a members account to login to this world.";
					this.aString31 = "Please subscribe, or use a different world.";
				} else if (local75 == 13) {
					this.aString30 = "Could not complete login.";
					this.aString31 = "Please try using a different world.";
				} else if (local75 == 14) {
					this.aString30 = "The server is being updated.";
					this.aString31 = "Please wait 1 minute and try again.";
				} else if (local75 == 15) {
					this.aBoolean241 = true;
					this.aClass4_Sub1_Sub3_6.anInt101 = 0;
					this.aClass4_Sub1_Sub3_9.anInt101 = 0;
					this.anInt996 = -1;
					this.anInt858 = -1;
					this.anInt859 = -1;
					this.anInt860 = -1;
					this.anInt995 = 0;
					this.anInt997 = 0;
					this.anInt1040 = 0;
					this.anInt990 = 0;
					this.aBoolean237 = false;
					this.aLong31 = System.currentTimeMillis();
				} else if (local75 == 16) {
					this.aString30 = "Login attempts exceeded.";
					this.aString31 = "Please wait 1 minute and try again.";
				} else if (local75 == 17) {
					this.aString30 = "You are standing in a members-only area.";
					this.aString31 = "To play on this world move to a free area first";
				} else if (local75 == 20) {
					this.aString30 = "Invalid loginserver requested";
					this.aString31 = "Please try using a different world.";
				} else if (local75 == 21) {
					local391 = this.aClass38_1.method390();
					for (@Pc(909) int local909 = local391 + 3; local909 >= 0; local909--) {
						this.aString30 = "You have only just left another world";
						this.aString31 = "Your profile will be transferred in: " + local909;
						this.method646(true);
						try {
							Thread.sleep(1200L);
						} catch (@Pc(931) Exception local931) {
						}
					}
					this.method590(arg0, arg1, arg2);
				} else if (local75 == 22) {
					this.aString30 = "Malformed login packet.";
					this.aString31 = "Please try again.";
				} else if (local75 == 23) {
					this.aString30 = "No reply from loginserver.";
					this.aString31 = "Please try again.";
				} else if (local75 == 24) {
					this.aString30 = "Error loading your profile.";
					this.aString31 = "Please contact customer support.";
				} else if (local75 == 25) {
					this.aString30 = "Unexpected loginserver response.";
					this.aString31 = "Please try using a different world.";
				} else if (local75 == 26) {
					this.aString30 = "This computers address has been blocked";
					this.aString31 = "as it was used to break our rules";
				} else if (local75 != -1) {
					System.out.println("response:" + local75);
					this.aString30 = "Unexpected server response";
					this.aString31 = "Please try using a different world.";
				} else if (local77 != 0) {
					this.aString30 = "No response from server";
					this.aString31 = "Please try using a different world.";
				} else if (this.anInt866 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(1003) Exception local1003) {
					}
					this.anInt866++;
					this.method590(arg0, arg1, arg2);
				} else {
					this.aString30 = "No response from loginserver";
					this.aString31 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(1046) IOException local1046) {
			this.aString30 = "";
			this.aString31 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ[B)Z")
	private boolean method591(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			this.aBoolean241 &= true;
			return arg1 == null ? true : signlink.wavesave(arg1, arg0);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("16887, " + arg0 + ", " + true + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method592(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			if (this.anInt847 == 0 && super.anInt824 == 1) {
				@Pc(18) int local18 = super.anInt825 - 25 - 550;
				@Pc(25) int local25 = super.anInt826 - 5 - 4;
				if (local18 >= 0 && local25 >= 0 && local18 < 146 && local25 < 151) {
					local18 -= 73;
					local25 -= 75;
					@Pc(45) int local45 = this.anInt954 + this.anInt991 & 0x7FF;
					@Pc(49) int local49 = Class4_Sub1_Sub1_Sub4.anIntArray204[local45];
					@Pc(53) int local53 = Class4_Sub1_Sub1_Sub4.anIntArray205[local45];
					@Pc(62) int local62 = local49 * (this.anInt886 + 256) >> 8;
					@Pc(71) int local71 = local53 * (this.anInt886 + 256) >> 8;
					@Pc(81) int local81 = local25 * local62 + local18 * local71 >> 11;
					@Pc(91) int local91 = local25 * local71 - local18 * local62 >> 11;
					@Pc(98) int local98 = aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt694 + local81 >> 7;
					@Pc(105) int local105 = aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt695 - local91 >> 7;
					@Pc(126) boolean local126 = this.method706(local105, 1, 0, 0, 0, aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0], aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0], true, local98, 0, 0);
					if (local126) {
						this.aClass4_Sub1_Sub3_6.method92(local18);
						this.aClass4_Sub1_Sub3_6.method92(local25);
						this.aClass4_Sub1_Sub3_6.method93(this.anInt954);
						this.aClass4_Sub1_Sub3_6.method92(57);
						this.aClass4_Sub1_Sub3_6.method92(this.anInt991);
						this.aClass4_Sub1_Sub3_6.method92(this.anInt886);
						this.aClass4_Sub1_Sub3_6.method92(89);
						this.aClass4_Sub1_Sub3_6.method93(aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt694);
						this.aClass4_Sub1_Sub3_6.method93(aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt695);
						this.aClass4_Sub1_Sub3_6.method92(this.anInt844);
						this.aClass4_Sub1_Sub3_6.method92(63);
						return;
					}
				}
			}
		} catch (@Pc(180) RuntimeException local180) {
			signlink.reporterror("36097, " + arg0 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method593(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg1 == null || arg1.length() == 0) {
				this.anInt942 = 0;
			} else {
				@Pc(12) String local12 = arg1;
				if (arg0 == this.aByte39) {
					@Pc(20) String[] local20 = new String[100];
					@Pc(22) int local22 = 0;
					while (true) {
						@Pc(26) int local26 = local12.indexOf(" ");
						if (local26 == -1) {
							local12 = local12.trim();
							if (local12.length() > 0) {
								local20[local22++] = local12.toLowerCase();
							}
							this.anInt942 = 0;
							label53: for (local26 = 0; local26 < Class24.anInt301; local26++) {
								@Pc(75) Class24 local75 = Class24.method315(local26);
								if (local75.anInt307 == -1 && local75.aString3 != null) {
									@Pc(86) String local86 = local75.aString3.toLowerCase();
									for (@Pc(88) int local88 = 0; local88 < local22; local88++) {
										if (local86.indexOf(local20[local88]) == -1) {
											continue label53;
										}
									}
									this.aStringArray13[this.anInt942] = local86;
									this.anIntArray259[this.anInt942] = local26;
									this.anInt942++;
									if (this.anInt942 >= this.aStringArray13.length) {
										return;
									}
								}
							}
							return;
						}
						@Pc(35) String local35 = local12.substring(0, local26).trim();
						if (local35.length() > 0) {
							local20[local22++] = local35.toLowerCase();
						}
						local12 = local12.substring(local26 + 1);
					}
				}
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("76994, " + arg0 + ", " + arg1 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!PCARWQQC;IIIIII)V")
	private void method594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (this.aBoolean256) {
				this.anInt1002 = 32;
			} else {
				this.anInt1002 = 0;
			}
			this.aBoolean256 = false;
			if (arg6 >= arg1 && arg6 < arg1 + 16 && arg7 >= arg3 && arg7 < arg3 + 16) {
				arg2.anInt339 -= this.anInt903 * 4;
				if (arg0 == 1) {
					this.aBoolean255 = true;
				}
				if (arg0 == 2 || arg0 == 3) {
					this.aBoolean260 = true;
				}
			} else if (arg6 >= arg1 && arg6 < arg1 + 16 && arg7 >= arg3 + arg4 - 16 && arg7 < arg3 + arg4) {
				arg2.anInt339 += this.anInt903 * 4;
				if (arg0 == 1) {
					this.aBoolean255 = true;
				}
				if (arg0 == 2 || arg0 == 3) {
					this.aBoolean260 = true;
				}
			} else if (arg6 >= arg1 - this.anInt1002 && arg6 < arg1 + this.anInt1002 + 16 && arg7 >= arg3 + 16 && arg7 < arg3 + arg4 - 16 && this.anInt903 > 0) {
				@Pc(139) int local139 = (arg4 - 32) * arg4 / arg5;
				if (local139 < 8) {
					local139 = 8;
				}
				@Pc(154) int local154 = arg7 - arg3 - local139 / 2 - 16;
				@Pc(160) int local160 = arg4 - local139 - 32;
				arg2.anInt339 = (arg5 - arg4) * local154 / local160;
				if (arg0 == 1) {
					this.aBoolean255 = true;
				}
				if (arg0 == 2 || arg0 == 3) {
					this.aBoolean260 = true;
				}
				this.aBoolean256 = true;
			}
		} catch (@Pc(189) RuntimeException local189) {
			signlink.reporterror("15690, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -609 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local189.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method595() {
		try {
			this.anInt1033++;
			this.method726(this.anInt916, true);
			this.method661(true);
			this.method726(this.anInt916, false);
			this.method661(false);
			this.method640();
			this.method645();
			@Pc(37) int local37;
			@Pc(76) int local76;
			if (!this.aBoolean245) {
				local37 = this.anInt953;
				if (this.anInt842 / 256 > local37) {
					local37 = this.anInt842 / 256;
				}
				if (this.aBooleanArray12[4] && this.anIntArray272[4] + 128 > local37) {
					local37 = this.anIntArray272[4] + 128;
				}
				local76 = this.anInt954 + this.anInt957 & 0x7FF;
				this.method699(this.anInt897, this.method651(aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt694, this.anInt981, aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt695) - 50, this.anInt896, local37 * 3 + 600, local76, local37, 686);
			}
			if (this.aBoolean245) {
				local37 = this.method688();
			} else {
				local37 = this.method687();
			}
			local76 = this.anInt928;
			@Pc(120) int local120 = this.anInt929;
			@Pc(123) int local123 = this.anInt930;
			@Pc(126) int local126 = this.anInt931;
			@Pc(129) int local129 = this.anInt932;
			@Pc(178) int local178;
			for (@Pc(131) int local131 = 0; local131 < 5; local131++) {
				if (this.aBooleanArray12[local131]) {
					local178 = (int) (Math.random() * (double) (this.anIntArray267[local131] * 2 + 1) - (double) this.anIntArray267[local131] + Math.sin((double) this.anIntArray222[local131] * ((double) this.anIntArray275[local131] / 100.0D)) * (double) this.anIntArray272[local131]);
					if (local131 == 0) {
						this.anInt928 += local178;
					}
					if (local131 == 1) {
						this.anInt929 += local178;
					}
					if (local131 == 2) {
						this.anInt930 += local178;
					}
					if (local131 == 3) {
						this.anInt932 = this.anInt932 + local178 & 0x7FF;
					}
					if (local131 == 4) {
						this.anInt931 += local178;
						if (this.anInt931 < 128) {
							this.anInt931 = 128;
						}
						if (this.anInt931 > 383) {
							this.anInt931 = 383;
						}
					}
				}
			}
			local178 = Class4_Sub1_Sub1_Sub4.anInt797;
			Class4_Sub1_Sub2_Sub3.aBoolean91 = true;
			Class4_Sub1_Sub2_Sub3.anInt245 = 0;
			Class4_Sub1_Sub2_Sub3.anInt243 = super.anInt819 - 4;
			Class4_Sub1_Sub2_Sub3.anInt244 = super.anInt820 - 4;
			Class4_Sub1_Sub1.method546();
			this.aClass45_1.method470(this.anInt931, this.anInt928, this.anInt932, this.anInt929, this.anInt930, local37);
			this.aClass45_1.method445();
			this.method694(this.anInt869);
			this.method613();
			this.method650(local178);
			this.method705();
			this.aClass13_26.method188(4, super.aGraphics2, 4);
			this.anInt928 = local76;
			this.anInt929 = local120;
			this.anInt930 = local123;
			this.anInt931 = local126;
			this.anInt932 = local129;
		} catch (@Pc(324) RuntimeException local324) {
			signlink.reporterror("62626, " + 28029 + ", " + local324.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(8) int local8 = this.aClass45_1.method457(arg4, arg2, arg3);
			@Pc(26) int local26;
			@Pc(32) int local32;
			@Pc(36) int local36;
			@Pc(38) int local38;
			@Pc(60) int local60;
			@Pc(66) int local66;
			if (local8 != 0) {
				local26 = this.aClass45_1.method461(arg4, arg2, arg3, local8);
				local32 = local26 >> 6 & 0x3;
				local36 = local26 & 0x1F;
				local38 = arg1;
				if (local8 > 0) {
					local38 = arg0;
				}
				@Pc(46) int[] local46 = this.aClass4_Sub1_Sub1_Sub3_9.anIntArray33;
				local60 = arg2 * 4 + (103 - arg3) * 512 * 4 + 24624;
				local66 = local8 >> 14 & 0x7FFF;
				@Pc(69) Class28 local69 = Class28.method334(local66);
				if (local69.anInt397 == -1) {
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
					@Pc(79) Class4_Sub1_Sub1_Sub2 local79 = this.aClass4_Sub1_Sub1_Sub2Array5[local69.anInt397];
					if (local79 != null) {
						@Pc(91) int local91 = (local69.anInt387 * 4 - local79.anInt155) / 2;
						@Pc(101) int local101 = (local69.anInt384 * 4 - local79.anInt156) / 2;
						local79.method211(233, arg2 * 4 + local91 + 48, (104 - arg3 - local69.anInt384) * 4 + 48 + local101);
					}
				}
			}
			local8 = this.aClass45_1.method459(arg4, arg2, arg3);
			if (local8 != 0) {
				local26 = this.aClass45_1.method461(arg4, arg2, arg3, local8);
				local32 = local26 >> 6 & 0x3;
				local36 = local26 & 0x1F;
				local38 = local8 >> 14 & 0x7FFF;
				@Pc(455) Class28 local455 = Class28.method334(local38);
				@Pc(487) int local487;
				if (local455.anInt397 != -1) {
					@Pc(465) Class4_Sub1_Sub1_Sub2 local465 = this.aClass4_Sub1_Sub1_Sub2Array5[local455.anInt397];
					if (local465 != null) {
						local66 = (local455.anInt387 * 4 - local465.anInt155) / 2;
						local487 = (local455.anInt384 * 4 - local465.anInt156) / 2;
						local465.method211(233, arg2 * 4 + local66 + 48, (104 - arg3 - local455.anInt384) * 4 + 48 + local487);
					}
				} else if (local36 == 9) {
					local60 = 15658734;
					if (local8 > 0) {
						local60 = 15597568;
					}
					@Pc(524) int[] local524 = this.aClass4_Sub1_Sub1_Sub3_9.anIntArray33;
					local487 = arg2 * 4 + (103 - arg3) * 512 * 4 + 24624;
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
			local8 = this.aClass45_1.method460(arg4, arg2, arg3);
			if (local8 != 0) {
				local26 = local8 >> 14 & 0x7FFF;
				@Pc(619) Class28 local619 = Class28.method334(local26);
				if (local619.anInt397 != -1) {
					@Pc(629) Class4_Sub1_Sub1_Sub2 local629 = this.aClass4_Sub1_Sub1_Sub2Array5[local619.anInt397];
					if (local629 != null) {
						local38 = (local619.anInt387 * 4 - local629.anInt155) / 2;
						@Pc(651) int local651 = (local619.anInt384 * 4 - local629.anInt156) / 2;
						local629.method211(233, arg2 * 4 + local38 + 48, (104 - arg3 - local619.anInt384) * 4 + 48 + local651);
						return;
					}
				}
			}
		} catch (@Pc(675) RuntimeException local675) {
			signlink.reporterror("68766, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 45824 + ", " + arg3 + ", " + arg4 + ", " + local675.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class30 local9 = this.aClass30ArrayArrayArray1[this.anInt981][arg0][arg1];
		if (local9 == null) {
			this.aClass45_1.method452(this.anInt981, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class4_Sub1_Sub2_Sub1 local23 = null;
		@Pc(27) Class4_Sub1_Sub2_Sub1 local27;
		for (local27 = (Class4_Sub1_Sub2_Sub1) local9.method346(); local27 != null; local27 = (Class4_Sub1_Sub2_Sub1) local9.method348()) {
			@Pc(32) Class24 local32 = Class24.method315(local27.anInt40);
			@Pc(35) int local35 = local32.anInt306;
			if (local32.aBoolean108) {
				local35 *= local27.anInt41 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method344(local23);
		@Pc(65) Class4_Sub1_Sub2_Sub1 local65 = null;
		@Pc(67) Class4_Sub1_Sub2_Sub1 local67 = null;
		for (local27 = (Class4_Sub1_Sub2_Sub1) local9.method346(); local27 != null; local27 = (Class4_Sub1_Sub2_Sub1) local9.method348()) {
			if (local27.anInt40 != local23.anInt40 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt40 != local23.anInt40 && local27.anInt40 != local65.anInt40 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass45_1.method438(local23, arg0, this.anInt981, local65, local110, this.method651(arg0 * 128 + 64, this.anInt981, arg1 * 128 + 64), local67, arg1);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method598() {
		try {
			this.aBoolean230 = true;
			try {
				@Pc(15) long local15 = System.currentTimeMillis();
				@Pc(17) int local17 = 0;
				@Pc(19) int local19 = 20;
				while (this.aBoolean240) {
					this.anInt950++;
					this.method667();
					this.method667();
					this.method711();
					local17++;
					if (local17 > 10) {
						@Pc(42) long local42 = System.currentTimeMillis();
						@Pc(51) int local51 = (int) (local42 - local15) / 10 - local19;
						local19 = 40 - local51;
						if (local19 < 5) {
							local19 = 5;
						}
						local17 = 0;
						local15 = local42;
					}
					try {
						Thread.sleep((long) local19);
					} catch (@Pc(69) Exception local69) {
					}
				}
			} catch (@Pc(75) Exception local75) {
			}
			this.aBoolean230 = false;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("83495, " + 8 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method599(@OriginalArg(0) int arg0) {
		try {
			Class26.method321(arg0);
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("90984, " + arg0 + ", " + 7063 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!FTMSICIZ;II)V")
	private void method600(@OriginalArg(0) Class4_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(6) int local6 = arg0.method113(8, 779);
			@Pc(12) int local12;
			if (local6 < this.anInt1043) {
				for (local12 = local6; local12 < this.anInt1043; local12++) {
					this.anIntArray216[this.anInt843++] = this.anIntArray273[local12];
				}
			}
			if (local6 > this.anInt1043) {
				signlink.reporterror(this.aString18 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt1043 = 0;
			for (local12 = 0; local12 < local6; local12++) {
				@Pc(64) int local64 = this.anIntArray273[local12];
				@Pc(69) Class4_Sub1_Sub2_Sub5_Sub2 local69 = this.aClass4_Sub1_Sub2_Sub5_Sub2Array1[local64];
				@Pc(74) int local74 = arg0.method113(1, 779);
				if (local74 == 0) {
					this.anIntArray273[this.anInt1043++] = local64;
					local69.anInt711 = anInt927;
				} else {
					@Pc(97) int local97 = arg0.method113(2, 779);
					if (local97 == 0) {
						this.anIntArray273[this.anInt1043++] = local64;
						local69.anInt711 = anInt927;
						this.anIntArray274[this.anInt1044++] = local64;
					} else {
						@Pc(148) int local148;
						@Pc(158) int local158;
						if (local97 == 1) {
							this.anIntArray273[this.anInt1043++] = local64;
							local69.anInt711 = anInt927;
							local148 = arg0.method113(3, 779);
							local69.method496(local148, false);
							local158 = arg0.method113(1, 779);
							if (local158 == 1) {
								this.anIntArray274[this.anInt1044++] = local64;
							}
						} else if (local97 == 2) {
							this.anIntArray273[this.anInt1043++] = local64;
							local69.anInt711 = anInt927;
							local148 = arg0.method113(3, 779);
							local69.method496(local148, true);
							local158 = arg0.method113(3, 779);
							local69.method496(local158, true);
							@Pc(216) int local216 = arg0.method113(1, 779);
							if (local216 == 1) {
								this.anIntArray274[this.anInt1044++] = local64;
							}
						} else if (local97 == 3) {
							this.anIntArray216[this.anInt843++] = local64;
						}
					}
				}
			}
			@Pc(255) int local255 = arg1 + 0;
		} catch (@Pc(257) RuntimeException local257) {
			signlink.reporterror("33739, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local257.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!FTMSICIZ;II)V")
	private void method601(@OriginalArg(0) Class4_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt843 = 0;
			this.anInt1044 = 0;
			this.method605(arg1, arg0);
			this.method639(arg1, arg0);
			this.method674(arg0, arg1);
			@Pc(31) int local31;
			for (@Pc(24) int local24 = 0; local24 < this.anInt843; local24++) {
				local31 = this.anIntArray216[local24];
				if (this.aClass4_Sub1_Sub2_Sub5_Sub1Array1[local31].anInt711 != anInt927) {
					this.aClass4_Sub1_Sub2_Sub5_Sub1Array1[local31].aClass33_1 = null;
					this.aClass4_Sub1_Sub2_Sub5_Sub1Array1[local31] = null;
				}
			}
			if (arg0.anInt101 != arg1) {
				signlink.reporterror(this.aString18 + " size mismatch in getnpcpos - pos:" + arg0.anInt101 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local31 = 0; local31 < this.anInt1013; local31++) {
				if (this.aClass4_Sub1_Sub2_Sub5_Sub1Array1[this.anIntArray266[local31]] == null) {
					signlink.reporterror(this.aString18 + " null entry in npc list - pos:" + local31 + " size:" + this.anInt1013);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("78965, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	private void method602() {
		try {
			if (this.anInt999 > 0) {
				this.method680();
			} else {
				this.method681("Please wait - attempting to reestablish", "Connection lost");
				this.anInt847 = 0;
				this.anInt1003 = 0;
				@Pc(29) Class38 local29 = this.aClass38_1;
				this.aBoolean241 = false;
				this.anInt866 = 0;
				this.method590(this.aString18, this.aString19, true);
				if (!this.aBoolean241) {
					this.method680();
				}
				try {
					local29.method389();
				} catch (@Pc(52) Exception local52) {
				}
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("18215, " + true + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method603() {
		try {
			@Pc(7) int local7 = this.aClass4_Sub1_Sub1_Sub1_4.method46("Choose Option");
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt990; local9++) {
				local20 = this.aClass4_Sub1_Sub1_Sub1_4.method46(this.aStringArray8[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			local7 += 8;
			local20 = this.anInt990 * 15 + 21;
			@Pc(67) int local67;
			@Pc(85) int local85;
			if (super.anInt825 > 4 && super.anInt826 > 4 && super.anInt825 < 516 && super.anInt826 < 338) {
				local67 = super.anInt825 - local7 / 2 - 4;
				if (local67 + local7 > 512) {
					local67 = 512 - local7;
				}
				if (local67 < 0) {
					local67 = 0;
				}
				local85 = super.anInt826 - 4;
				if (local85 + local20 > 334) {
					local85 = 334 - local20;
				}
				if (local85 < 0) {
					local85 = 0;
				}
				this.aBoolean237 = true;
				this.anInt891 = 0;
				this.anInt892 = local67;
				this.anInt893 = local85;
				this.anInt894 = local7;
				this.anInt895 = this.anInt990 * 15 + 22;
			}
			if (super.anInt825 > 553 && super.anInt826 > 205 && super.anInt825 < 743 && super.anInt826 < 466) {
				local67 = super.anInt825 - local7 / 2 - 553;
				if (local67 < 0) {
					local67 = 0;
				} else if (local67 + local7 > 190) {
					local67 = 190 - local7;
				}
				local85 = super.anInt826 - 205;
				if (local85 < 0) {
					local85 = 0;
				} else if (local85 + local20 > 261) {
					local85 = 261 - local20;
				}
				this.aBoolean237 = true;
				this.anInt891 = 1;
				this.anInt892 = local67;
				this.anInt893 = local85;
				this.anInt894 = local7;
				this.anInt895 = this.anInt990 * 15 + 22;
			}
			if (super.anInt825 > 17 && super.anInt826 > 357 && super.anInt825 < 496 && super.anInt826 < 453) {
				local67 = super.anInt825 - local7 / 2 - 17;
				if (local67 < 0) {
					local67 = 0;
				} else if (local67 + local7 > 479) {
					local67 = 479 - local7;
				}
				local85 = super.anInt826 - 357;
				if (local85 < 0) {
					local85 = 0;
				} else if (local85 + local20 > 96) {
					local85 = 96 - local20;
				}
				this.aBoolean237 = true;
				this.anInt891 = 2;
				this.anInt892 = local67;
				this.anInt893 = local85;
				this.anInt894 = local7;
				this.anInt895 = this.anInt990 * 15 + 22;
			}
		} catch (@Pc(289) RuntimeException local289) {
			signlink.reporterror("8334, " + -34918 + ", " + local289.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
	private void method604(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg0) {
				this.aBoolean243 = !this.aBoolean243;
			}
			if (arg1 != 0L) {
				for (@Pc(18) int local18 = 0; local18 < this.anInt910; local18++) {
					if (this.aLongArray3[local18] == arg1) {
						this.anInt910--;
						this.aBoolean255 = true;
						for (@Pc(38) int local38 = local18; local38 < this.anInt910; local38++) {
							this.aStringArray14[local38] = this.aStringArray14[local38 + 1];
							this.anIntArray235[local38] = this.anIntArray235[local38 + 1];
							this.aLongArray3[local38] = this.aLongArray3[local38 + 1];
						}
						this.aClass4_Sub1_Sub3_6.method91(99);
						this.aClass4_Sub1_Sub3_6.method98(arg1, (byte) 7);
						return;
					}
				}
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("34085, " + arg0 + ", " + arg1 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!FTMSICIZ;I)V")
	private void method605(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1_Sub3 arg1) {
		try {
			@Pc(5) int local5 = arg0 + 0;
			arg1.method112();
			@Pc(13) int local13 = arg1.method113(8, 779);
			@Pc(19) int local19;
			if (local13 < this.anInt1013) {
				for (local19 = local13; local19 < this.anInt1013; local19++) {
					this.anIntArray216[this.anInt843++] = this.anIntArray266[local19];
				}
			}
			if (local13 > this.anInt1013) {
				signlink.reporterror(this.aString18 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt1013 = 0;
			for (local19 = 0; local19 < local13; local19++) {
				@Pc(71) int local71 = this.anIntArray266[local19];
				@Pc(76) Class4_Sub1_Sub2_Sub5_Sub1 local76 = this.aClass4_Sub1_Sub2_Sub5_Sub1Array1[local71];
				@Pc(81) int local81 = arg1.method113(1, 779);
				if (local81 == 0) {
					this.anIntArray266[this.anInt1013++] = local71;
					local76.anInt711 = anInt927;
				} else {
					@Pc(104) int local104 = arg1.method113(2, 779);
					if (local104 == 0) {
						this.anIntArray266[this.anInt1013++] = local71;
						local76.anInt711 = anInt927;
						this.anIntArray274[this.anInt1044++] = local71;
					} else {
						@Pc(155) int local155;
						@Pc(165) int local165;
						if (local104 == 1) {
							this.anIntArray266[this.anInt1013++] = local71;
							local76.anInt711 = anInt927;
							local155 = arg1.method113(3, 779);
							local76.method496(local155, false);
							local165 = arg1.method113(1, 779);
							if (local165 == 1) {
								this.anIntArray274[this.anInt1044++] = local71;
							}
						} else if (local104 == 2) {
							this.anIntArray266[this.anInt1013++] = local71;
							local76.anInt711 = anInt927;
							local155 = arg1.method113(3, 779);
							local76.method496(local155, true);
							local165 = arg1.method113(3, 779);
							local76.method496(local165, true);
							@Pc(223) int local223 = arg1.method113(1, 779);
							if (local223 == 1) {
								this.anIntArray274[this.anInt1044++] = local71;
							}
						} else if (local104 == 3) {
							this.anIntArray216[this.anInt843++] = local71;
						}
					}
				}
			}
		} catch (@Pc(260) RuntimeException local260) {
			signlink.reporterror("89508, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local260.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method583(@OriginalArg(0) int arg0) {
		try {
			if (!this.aBoolean249 && !this.aBoolean244 && !this.aBoolean229) {
				anInt927++;
				if (this.aBoolean241) {
					this.method618(718);
				} else {
					this.method616();
				}
				this.method707();
				if (arg0 != this.anInt902) {
					this.anInt996 = this.aClass4_Sub1_Sub3_9.method102();
				}
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("27961, " + arg0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method606() {
		try {
			this.anInt944 = 0;
			@Pc(16) int local16 = (aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt694 >> 7) + this.anInt838;
			@Pc(24) int local24 = (aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt695 >> 7) + this.anInt839;
			if (local16 >= 3053 && local16 <= 3156 && local24 >= 3056 && local24 <= 3136) {
				this.anInt944 = 1;
			}
			if (local16 >= 3072 && local16 <= 3118 && local24 >= 9492 && local24 <= 9535) {
				this.anInt944 = 1;
			}
			if (this.anInt944 == 1 && local16 >= 3139 && local16 <= 3199 && local24 >= 3008 && local24 <= 3062) {
				this.anInt944 = 0;
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("12981, " + 5 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)Z")
	private boolean method608(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg0 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass45_1.method461(this.anInt981, arg1, arg2, arg0);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(43) Class28 local43 = Class28.method334(local7);
				@Pc(51) int local51;
				@Pc(54) int local54;
				if (local31 == 0 || local31 == 2) {
					local51 = local43.anInt387;
					local54 = local43.anInt384;
				} else {
					local51 = local43.anInt384;
					local54 = local43.anInt387;
				}
				@Pc(65) int local65 = local43.anInt379;
				if (local31 != 0) {
					local65 = (local65 << local31 & 0xF) + (local65 >> 4 - local31);
				}
				this.method706(arg2, 2, local65, 0, local51, aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0], aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0], true, arg1, local54, 0);
			} else {
				this.method706(arg2, 2, 0, local31, 0, aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0], aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0], true, arg1, 0, local25 + 1);
			}
			this.anInt970 = super.anInt825;
			this.anInt971 = super.anInt826;
			this.anInt973 = 2;
			this.anInt972 = 0;
			return true;
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("33542, " + arg0 + ", " + -864 + ", " + arg1 + ", " + arg2 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method585() {
		try {
			if (this.aBoolean249 || this.aBoolean244 || this.aBoolean229) {
				this.method691();
			} else {
				anInt1025++;
				if (this.aBoolean241) {
					this.method631((byte) 3);
				} else {
					this.method646(false);
				}
				this.anInt903 = 0;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("17635, " + 46632 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Z")
	private boolean method609(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(13) Class26 local13 = Class26.method319(arg0);
			for (@Pc(15) int local15 = 0; local15 < local13.anIntArray87.length && local13.anIntArray87[local15] != -1; local15++) {
				@Pc(29) Class26 local29 = Class26.method319(local13.anIntArray87[local15]);
				if (local29.anInt347 == 0) {
					local3 |= this.method609(local29.anInt334, arg1);
				}
				@Pc(63) int local63;
				if (local29.anInt347 == 6 && (local29.anInt327 != -1 || local29.anInt328 != -1)) {
					@Pc(58) boolean local58 = this.method620(local29);
					if (local58) {
						local63 = local29.anInt328;
					} else {
						local63 = local29.anInt327;
					}
					if (local63 != -1) {
						@Pc(75) Class27 local75 = Class27.aClass27Array1[local63];
						local29.anInt335 += arg1;
						while (local29.anInt335 > local75.method330(local29.anInt326)) {
							local29.anInt335 -= local75.method330(local29.anInt326);
							local29.anInt326++;
							if (local29.anInt326 >= local75.anInt366) {
								local29.anInt326 -= local75.anInt367;
								if (local29.anInt326 < 0 || local29.anInt326 >= local75.anInt366) {
									local29.anInt326 = 0;
								}
							}
							local3 = true;
						}
					}
				}
				if (local29.anInt347 == 6 && local29.anInt329 != 0) {
					@Pc(144) int local144 = local29.anInt329 >> 16;
					local63 = local29.anInt329 << 16 >> 16;
					@Pc(155) int local155 = local144 * arg1;
					local63 *= arg1;
					local29.anInt350 = local29.anInt350 + local155 & 0x7FF;
					local29.anInt351 = local29.anInt351 + local63 & 0x7FF;
					local3 = true;
				}
			}
			return local3;
		} catch (@Pc(186) RuntimeException local186) {
			signlink.reporterror("57937, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local186.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method610() {
		try {
			this.aClass13_25.method187();
			@Pc(26) int local26;
			@Pc(28) int local28;
			if (this.anInt847 == 2) {
				@Pc(21) byte[] local21 = this.aClass4_Sub1_Sub1_Sub2_19.aByteArray4;
				@Pc(23) int[] local23 = Class4_Sub1_Sub1.anIntArray201;
				local26 = local21.length;
				for (local28 = 0; local28 < local26; local28++) {
					if (local21[local28] == 0) {
						local23[local28] = 0;
					}
				}
				this.aClass4_Sub1_Sub1_Sub3_3.method243(33, this.anInt954, 256, this.anIntArray221, 33, this.anIntArray268, 0, this.anInt837, 25, 25, 0);
				this.aClass13_26.method187();
				Class4_Sub1_Sub1_Sub4.anIntArray206 = this.anIntArray254;
			} else {
				@Pc(76) int local76 = this.anInt954 + this.anInt991 & 0x7FF;
				@Pc(83) int local83 = aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt694 / 32 + 48;
				local26 = 464 - aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt695 / 32;
				this.aClass4_Sub1_Sub1_Sub3_9.method243(151, local76, this.anInt886 + 256, this.anIntArray243, 146, this.anIntArray226, 5, this.anInt837, local83, local26, 25);
				this.aClass4_Sub1_Sub1_Sub3_3.method243(33, this.anInt954, 256, this.anIntArray221, 33, this.anIntArray268, 0, this.anInt837, 25, 25, 0);
				for (local28 = 0; local28 < this.anInt857; local28++) {
					local83 = this.anIntArray219[local28] * 4 + 2 - aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt694 / 32;
					local26 = this.anIntArray220[local28] * 4 + 2 - aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt695 / 32;
					this.method678(local83, this.aClass4_Sub1_Sub1_Sub3Array7[local28], local26);
				}
				@Pc(180) int local180;
				for (@Pc(176) int local176 = 0; local176 < 104; local176++) {
					for (local180 = 0; local180 < 104; local180++) {
						@Pc(192) Class30 local192 = this.aClass30ArrayArrayArray1[this.anInt981][local176][local180];
						if (local192 != null) {
							local83 = local176 * 4 + 2 - aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt694 / 32;
							local26 = local180 * 4 + 2 - aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt695 / 32;
							this.method678(local83, this.aClass4_Sub1_Sub1_Sub3_12, local26);
						}
					}
				}
				for (local180 = 0; local180 < this.anInt1013; local180++) {
					@Pc(243) Class4_Sub1_Sub2_Sub5_Sub1 local243 = this.aClass4_Sub1_Sub2_Sub5_Sub1Array1[this.anIntArray266[local180]];
					if (local243 != null && local243.method499(172)) {
						@Pc(252) Class33 local252 = local243.aClass33_1;
						if (local252.anIntArray133 != null) {
							local252 = local252.method369();
						}
						if (local252 != null && local252.aBoolean153 && local252.aBoolean156) {
							local83 = local243.anInt694 / 32 - aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt694 / 32;
							local26 = local243.anInt695 / 32 - aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt695 / 32;
							this.method678(local83, this.aClass4_Sub1_Sub1_Sub3_13, local26);
						}
					}
				}
				@Pc(311) Class4_Sub1_Sub2_Sub5_Sub2 local311;
				for (@Pc(301) int local301 = 0; local301 < this.anInt1043; local301++) {
					local311 = this.aClass4_Sub1_Sub2_Sub5_Sub2Array1[this.anIntArray273[local301]];
					if (local311 != null && local311.method499(172)) {
						local83 = local311.anInt694 / 32 - aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt694 / 32;
						local26 = local311.anInt695 / 32 - aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt695 / 32;
						@Pc(339) boolean local339 = false;
						@Pc(343) long local343 = Class36.method378(local311.aString16);
						for (@Pc(345) int local345 = 0; local345 < this.anInt910; local345++) {
							if (local343 == this.aLongArray3[local345] && this.anIntArray235[local345] != 0) {
								local339 = true;
								break;
							}
						}
						@Pc(370) boolean local370 = false;
						if (aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt743 != 0 && local311.anInt743 != 0 && aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt743 == local311.anInt743) {
							local370 = true;
						}
						if (local339) {
							this.method678(local83, this.aClass4_Sub1_Sub1_Sub3_15, local26);
						} else if (local370) {
							this.method678(local83, this.aClass4_Sub1_Sub1_Sub3_16, local26);
						} else {
							this.method678(local83, this.aClass4_Sub1_Sub1_Sub3_14, local26);
						}
					}
				}
				if (this.anInt1056 != 0 && anInt927 % 20 < 10) {
					if (this.anInt1056 == 1 && this.anInt951 >= 0 && this.anInt951 < this.aClass4_Sub1_Sub2_Sub5_Sub1Array1.length) {
						@Pc(444) Class4_Sub1_Sub2_Sub5_Sub1 local444 = this.aClass4_Sub1_Sub2_Sub5_Sub1Array1[this.anInt951];
						if (local444 != null) {
							local83 = local444.anInt694 / 32 - aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt694 / 32;
							local26 = local444.anInt695 / 32 - aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt695 / 32;
							this.method644(local26, local83, this.aClass4_Sub1_Sub1_Sub3_11);
						}
					}
					if (this.anInt1056 == 2) {
						local83 = (this.anInt962 - this.anInt838) * 4 + 2 - aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt694 / 32;
						local26 = (this.anInt963 - this.anInt839) * 4 + 2 - aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt695 / 32;
						this.method644(local26, local83, this.aClass4_Sub1_Sub1_Sub3_11);
					}
					if (this.anInt1056 == 10 && this.anInt1028 >= 0 && this.anInt1028 < this.aClass4_Sub1_Sub2_Sub5_Sub2Array1.length) {
						local311 = this.aClass4_Sub1_Sub2_Sub5_Sub2Array1[this.anInt1028];
						if (local311 != null) {
							local83 = local311.anInt694 / 32 - aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt694 / 32;
							local26 = local311.anInt695 / 32 - aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt695 / 32;
							this.method644(local26, local83, this.aClass4_Sub1_Sub1_Sub3_11);
						}
					}
				}
				if (this.anInt1003 != 0) {
					local83 = this.anInt1003 * 4 + 2 - aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt694 / 32;
					local26 = this.anInt1004 * 4 + 2 - aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt695 / 32;
					this.method678(local83, this.aClass4_Sub1_Sub1_Sub3_10, local26);
				}
				Class4_Sub1_Sub1.method548(97, 16777215, 78, 3, this.anInt945, 3);
				this.aClass13_26.method187();
				Class4_Sub1_Sub1_Sub4.anIntArray206 = this.anIntArray254;
			}
		} catch (@Pc(613) RuntimeException local613) {
			signlink.reporterror("85634, " + 1 + ", " + local613.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt852 = Integer.parseInt(this.getParameter("nodeid"));
		anInt853 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method607();
		} else {
			method725();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean224 = false;
		} else {
			aBoolean224 = true;
		}
		this.method578();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method586() {
		try {
			this.aBoolean239 = true;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("76613, " + -120 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method611() {
		try {
			@Pc(6) int local6 = this.anInt872 * 128 + 64;
			@Pc(13) int local13 = this.anInt873 * 128 + 64;
			@Pc(24) int local24 = this.method651(local6, this.anInt981, local13) - this.anInt874;
			if (this.anInt928 < local6) {
				this.anInt928 += this.anInt875 + (local6 - this.anInt928) * this.anInt876 / 1000;
				if (this.anInt928 > local6) {
					this.anInt928 = local6;
				}
			}
			if (this.anInt928 > local6) {
				this.anInt928 -= this.anInt875 + (this.anInt928 - local6) * this.anInt876 / 1000;
				if (this.anInt928 < local6) {
					this.anInt928 = local6;
				}
			}
			if (this.anInt929 < local24) {
				this.anInt929 += this.anInt875 + (local24 - this.anInt929) * this.anInt876 / 1000;
				if (this.anInt929 > local24) {
					this.anInt929 = local24;
				}
			}
			if (this.anInt929 > local24) {
				this.anInt929 -= this.anInt875 + (this.anInt929 - local24) * this.anInt876 / 1000;
				if (this.anInt929 < local24) {
					this.anInt929 = local24;
				}
			}
			if (this.anInt930 < local13) {
				this.anInt930 += this.anInt875 + (local13 - this.anInt930) * this.anInt876 / 1000;
				if (this.anInt930 > local13) {
					this.anInt930 = local13;
				}
			}
			if (this.anInt930 > local13) {
				this.anInt930 -= this.anInt875 + (this.anInt930 - local13) * this.anInt876 / 1000;
				if (this.anInt930 < local13) {
					this.anInt930 = local13;
				}
			}
			local6 = this.anInt1035 * 128 + 64;
			local13 = this.anInt1036 * 128 + 64;
			local24 = this.method651(local6, this.anInt981, local13) - this.anInt1037;
			@Pc(222) int local222 = local6 - this.anInt928;
			@Pc(227) int local227 = local24 - this.anInt929;
			@Pc(232) int local232 = local13 - this.anInt930;
			@Pc(243) int local243 = (int) Math.sqrt((double) (local222 * local222 + local232 * local232));
			@Pc(254) int local254 = (int) (Math.atan2((double) local227, (double) local243) * 325.949D) & 0x7FF;
			@Pc(265) int local265 = (int) (Math.atan2((double) local222, (double) local232) * -325.949D) & 0x7FF;
			if (local254 < 128) {
				local254 = 128;
			}
			if (local254 > 383) {
				local254 = 383;
			}
			if (this.anInt931 < local254) {
				this.anInt931 += this.anInt1038 + (local254 - this.anInt931) * this.anInt1039 / 1000;
				if (this.anInt931 > local254) {
					this.anInt931 = local254;
				}
			}
			if (this.anInt931 > local254) {
				this.anInt931 -= this.anInt1038 + (this.anInt931 - local254) * this.anInt1039 / 1000;
				if (this.anInt931 < local254) {
					this.anInt931 = local254;
				}
			}
			@Pc(339) int local339 = local265 - this.anInt932;
			if (local339 > 1024) {
				local339 -= 2048;
			}
			if (local339 < -1024) {
				local339 += 2048;
			}
			if (local339 > 0) {
				this.anInt932 += this.anInt1038 + local339 * this.anInt1039 / 1000;
				this.anInt932 &= 0x7FF;
			}
			if (local339 < 0) {
				this.anInt932 -= this.anInt1038 + -local339 * this.anInt1039 / 1000;
				this.anInt932 &= 0x7FF;
			}
			@Pc(397) int local397 = local265 - this.anInt932;
			if (local397 > 1024) {
				local397 -= 2048;
			}
			if (local397 < -1024) {
				local397 += 2048;
			}
			if (local397 < 0 && local339 > 0 || local397 > 0 && local339 < 0) {
				this.anInt932 = local265;
			}
		} catch (@Pc(418) RuntimeException local418) {
			signlink.reporterror("59641, " + false + ", " + local418.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method612() {
		try {
			@Pc(7) byte[] local7 = this.aClass2_2.method7("title.dat", null);
			@Pc(13) Class4_Sub1_Sub1_Sub3 local13 = new Class4_Sub1_Sub1_Sub3(local7, this);
			this.aClass13_15.method187();
			local13.method237(0, 0);
			this.aClass13_16.method187();
			local13.method237(-637, 0);
			this.aClass13_12.method187();
			local13.method237(-128, 0);
			this.aClass13_13.method187();
			local13.method237(-202, -371);
			this.aClass13_14.method187();
			local13.method237(-202, -171);
			this.aClass13_17.method187();
			local13.method237(0, -265);
			this.aClass13_18.method187();
			local13.method237(-562, -265);
			this.aClass13_19.method187();
			local13.method237(-128, -171);
			this.aClass13_20.method187();
			local13.method237(-562, -171);
			@Pc(98) int[] local98 = new int[local13.anInt215];
			for (@Pc(100) int local100 = 0; local100 < local13.anInt216; local100++) {
				for (@Pc(104) int local104 = 0; local104 < local13.anInt215; local104++) {
					local98[local104] = local13.anIntArray33[local13.anInt215 + local13.anInt215 * local100 - local104 - 1];
				}
				for (@Pc(130) int local130 = 0; local130 < local13.anInt215; local130++) {
					local13.anIntArray33[local130 + local13.anInt215 * local100] = local98[local130];
				}
			}
			this.aClass13_15.method187();
			local13.method237(382, 0);
			this.aClass13_16.method187();
			local13.method237(-255, 0);
			this.aClass13_12.method187();
			local13.method237(254, 0);
			this.aClass13_13.method187();
			local13.method237(180, -371);
			this.aBoolean241 &= true;
			this.aClass13_14.method187();
			local13.method237(180, -171);
			this.aClass13_17.method187();
			local13.method237(382, -265);
			this.aClass13_18.method187();
			local13.method237(-180, -265);
			this.aClass13_19.method187();
			local13.method237(254, -171);
			this.aClass13_20.method187();
			local13.method237(-180, -171);
			local13 = new Class4_Sub1_Sub1_Sub3(this.aClass2_2, "logo", 0);
			this.aClass13_12.method187();
			local13.method239(233, 382 - local13.anInt215 / 2 - 128, 18);
			System.gc();
		} catch (@Pc(279) RuntimeException local279) {
			signlink.reporterror("7178, " + true + ", " + local279.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method613() {
		try {
			if (this.anInt1056 == 2) {
				this.method693(444, this.anInt964 * 2, (this.anInt963 - this.anInt839 << 7) + this.anInt966, (this.anInt962 - this.anInt838 << 7) + this.anInt965);
				if (this.anInt1029 > -1 && anInt927 % 20 < 10) {
					this.aClass4_Sub1_Sub1_Sub3Array9[0].method239(233, this.anInt1029 - 12, this.anInt1030 - 28);
				}
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("27277, " + -638 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method614(@OriginalArg(0) int arg0) {
		try {
			signlink.anInt1067 = arg0;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("51509, " + arg0 + ", " + -692 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)Z")
	private boolean method615() {
		try {
			if (this.aClass38_1 == null) {
				return false;
			}
			@Pc(526) String local526;
			@Pc(168) int local168;
			try {
				@Pc(17) int local17 = this.aClass38_1.method391();
				if (local17 == 0) {
					return false;
				}
				if (this.anInt996 == -1) {
					this.aClass38_1.method392(this.aClass4_Sub1_Sub3_9.aByteArray3, 0, 1);
					this.anInt996 = this.aClass4_Sub1_Sub3_9.aByteArray3[0] & 0xFF;
					if (this.aClass47_2 != null) {
						this.anInt996 = this.anInt996 - this.aClass47_2.method488() & 0xFF;
					}
					this.anInt995 = Class18.anIntArray31[this.anInt996];
					local17--;
				}
				if (this.anInt995 == -1) {
					if (local17 <= 0) {
						return false;
					}
					this.aClass38_1.method392(this.aClass4_Sub1_Sub3_9.aByteArray3, 0, 1);
					this.anInt995 = this.aClass4_Sub1_Sub3_9.aByteArray3[0] & 0xFF;
					local17--;
				}
				if (this.anInt995 == -2) {
					if (local17 <= 1) {
						return false;
					}
					this.aClass38_1.method392(this.aClass4_Sub1_Sub3_9.aByteArray3, 0, 2);
					this.aClass4_Sub1_Sub3_9.anInt101 = 0;
					this.anInt995 = this.aClass4_Sub1_Sub3_9.method104();
					local17 -= 2;
				}
				if (local17 < this.anInt995) {
					return false;
				}
				this.aClass4_Sub1_Sub3_9.anInt101 = 0;
				this.aClass38_1.method392(this.aClass4_Sub1_Sub3_9.aByteArray3, 0, this.anInt995);
				this.anInt997 = 0;
				this.anInt860 = this.anInt859;
				this.anInt859 = this.anInt858;
				this.anInt858 = this.anInt996;
				@Pc(163) int local163;
				if (this.anInt996 == 185) {
					local163 = this.aClass4_Sub1_Sub3_9.method132(this.aByte42);
					local168 = this.aClass4_Sub1_Sub3_9.method131();
					Class26.method319(local168).anInt344 = 1;
					Class26.method319(local168).anInt345 = local163;
					this.anInt996 = -1;
					return true;
				}
				@Pc(201) int local201;
				@Pc(205) int local205;
				@Pc(195) Class26 local195;
				@Pc(209) int local209;
				if (this.anInt996 == 148) {
					this.aBoolean255 = true;
					local163 = this.aClass4_Sub1_Sub3_9.method104();
					local195 = Class26.method319(local163);
					while (this.aClass4_Sub1_Sub3_9.anInt101 < this.anInt995) {
						local201 = this.aClass4_Sub1_Sub3_9.method116();
						local205 = this.aClass4_Sub1_Sub3_9.method104();
						local209 = this.aClass4_Sub1_Sub3_9.method102();
						if (local209 == 255) {
							local209 = this.aClass4_Sub1_Sub3_9.method107();
						}
						if (local201 >= 0 && local201 < local195.anIntArray86.length) {
							local195.anIntArray86[local201] = local205;
							local195.anIntArray92[local201] = local209;
						}
					}
					this.anInt996 = -1;
					return true;
				}
				@Pc(320) int local320;
				@Pc(331) int local331;
				if (this.anInt996 == 159) {
					this.aBoolean245 = true;
					this.anInt1035 = this.aClass4_Sub1_Sub3_9.method102();
					this.anInt1036 = this.aClass4_Sub1_Sub3_9.method102();
					this.anInt1037 = this.aClass4_Sub1_Sub3_9.method104();
					this.anInt1038 = this.aClass4_Sub1_Sub3_9.method102();
					this.anInt1039 = this.aClass4_Sub1_Sub3_9.method102();
					if (this.anInt1039 >= 100) {
						local163 = this.anInt1035 * 128 + 64;
						local168 = this.anInt1036 * 128 + 64;
						local201 = this.method651(local163, this.anInt981, local168) - this.anInt1037;
						local205 = local163 - this.anInt928;
						local209 = local201 - this.anInt929;
						local320 = local168 - this.anInt930;
						local331 = (int) Math.sqrt((double) (local205 * local205 + local320 * local320));
						this.anInt931 = (int) (Math.atan2((double) local209, (double) local331) * 325.949D) & 0x7FF;
						this.anInt932 = (int) (Math.atan2((double) local205, (double) local320) * -325.949D) & 0x7FF;
						if (this.anInt931 < 128) {
							this.anInt931 = 128;
						}
						if (this.anInt931 > 383) {
							this.anInt931 = 383;
						}
					}
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 138) {
					this.aBoolean248 = false;
					this.anInt846 = 1;
					this.aString23 = "";
					this.aBoolean260 = true;
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 43) {
					this.anInt1047 = this.aClass4_Sub1_Sub3_9.method122();
					this.anInt1048 = this.aClass4_Sub1_Sub3_9.method121();
					while (this.aClass4_Sub1_Sub3_9.anInt101 < this.anInt995) {
						local163 = this.aClass4_Sub1_Sub3_9.method102();
						this.method724(this.aClass4_Sub1_Sub3_9, local163);
					}
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 69) {
					this.aBoolean255 = true;
					local163 = this.aClass4_Sub1_Sub3_9.method139(this.anInt913);
					local168 = this.aClass4_Sub1_Sub3_9.method121();
					local201 = this.aClass4_Sub1_Sub3_9.method121();
					this.anIntArray231[local201] = local163;
					this.anIntArray261[local201] = local168;
					this.anIntArray264[local201] = 1;
					for (local205 = 0; local205 < 98; local205++) {
						if (local163 >= anIntArray217[local205]) {
							this.anIntArray264[local201] = local205 + 2;
						}
					}
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 137) {
					this.aBoolean248 = false;
					this.anInt846 = 2;
					this.aString23 = "";
					this.aBoolean260 = true;
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 183) {
					local526 = this.aClass4_Sub1_Sub3_9.method109();
					local168 = this.aClass4_Sub1_Sub3_9.method130();
					Class26.method319(local168).aString9 = local526;
					@Pc(543) int local543 = this.anIntArray265[this.anInt937];
					if (Class26.method319(local168).anInt356 == local543) {
						this.aBoolean255 = true;
					}
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 122) {
					local163 = this.aClass4_Sub1_Sub3_9.method104();
					local168 = this.aClass4_Sub1_Sub3_9.method132(this.aByte42);
					local201 = this.aClass4_Sub1_Sub3_9.method104();
					Class26.method319(local201).anInt329 = (local168 << 16) + local163;
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 161) {
					local163 = this.aClass4_Sub1_Sub3_9.method132(this.aByte42);
					@Pc(598) byte local598 = this.aClass4_Sub1_Sub3_9.method124();
					this.anIntArray271[local163] = local598;
					if (this.anIntArray276[local163] != local598) {
						this.anIntArray276[local163] = local598;
						this.method656(local163);
						this.aBoolean255 = true;
						if (this.anInt888 != -1) {
							this.aBoolean260 = true;
						}
					}
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 16) {
					local163 = this.aClass4_Sub1_Sub3_9.method132(this.aByte42);
					local168 = this.aClass4_Sub1_Sub3_9.method131();
					if (this.anInt882 != -1) {
						this.method599(this.anInt882);
						this.anInt882 = -1;
						this.aBoolean260 = true;
					}
					if (this.anInt923 != -1) {
						this.method599(this.anInt923);
						this.anInt923 = -1;
						this.aBoolean239 = true;
					}
					if (this.anInt1031 != -1) {
						this.method599(this.anInt1031);
						this.anInt1031 = -1;
					}
					if (this.anInt863 != local168) {
						this.method599(this.anInt863);
						this.anInt863 = local168;
					}
					if (this.anInt1032 != local163) {
						this.method599(this.anInt1032);
						this.anInt1032 = local163;
					}
					if (this.anInt846 != 0) {
						this.anInt846 = 0;
						this.aBoolean260 = true;
					}
					this.aBoolean255 = true;
					this.aBoolean233 = true;
					this.aBoolean235 = false;
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 112) {
					for (local163 = 0; local163 < this.aClass4_Sub1_Sub2_Sub5_Sub2Array1.length; local163++) {
						if (this.aClass4_Sub1_Sub2_Sub5_Sub2Array1[local163] != null) {
							this.aClass4_Sub1_Sub2_Sub5_Sub2Array1[local163].anInt715 = -1;
						}
					}
					for (local168 = 0; local168 < this.aClass4_Sub1_Sub2_Sub5_Sub1Array1.length; local168++) {
						if (this.aClass4_Sub1_Sub2_Sub5_Sub1Array1[local168] != null) {
							this.aClass4_Sub1_Sub2_Sub5_Sub1Array1[local168].anInt715 = -1;
						}
					}
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 163) {
					local163 = this.aClass4_Sub1_Sub3_9.method131();
					if (local163 == 65535) {
						local163 = -1;
					}
					if (local163 != this.anInt836 && this.aBoolean231 && !aBoolean225 && this.anInt861 == 0) {
						this.anInt961 = local163;
						this.aBoolean253 = true;
						this.aClass20_Sub1_1.method292(2, this.anInt961);
					}
					this.anInt836 = local163;
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 157) {
					local163 = this.aClass4_Sub1_Sub3_9.method130();
					local168 = this.aClass4_Sub1_Sub3_9.method135();
					if (this.aBoolean231 && !aBoolean225) {
						this.anInt961 = local163;
						this.aBoolean253 = false;
						this.aClass20_Sub1_1.method292(2, this.anInt961);
						this.anInt861 = local168;
					}
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 109) {
					local163 = this.aClass4_Sub1_Sub3_9.method104();
					@Pc(891) boolean local891 = this.aClass4_Sub1_Sub3_9.method122() == 1;
					Class26.method319(local163).aBoolean113 = local891;
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 24) {
					this.anInt1003 = 0;
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 87) {
					local163 = this.aClass4_Sub1_Sub3_9.method131();
					Class26.method319(local163).anInt344 = 3;
					if (aClass4_Sub1_Sub2_Sub5_Sub2_1.aClass33_2 == null) {
						Class26.method319(local163).anInt345 = (aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray179[0] << 25) + (aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray179[4] << 20) + (aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray180[0] << 15) + (aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray180[8] << 10) + (aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray180[11] << 5) + aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray180[1];
					} else {
						Class26.method319(local163).anInt345 = (int) (aClass4_Sub1_Sub2_Sub5_Sub2_1.aClass33_2.aLong19 + 305419896L);
					}
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 191) {
					local163 = this.aClass4_Sub1_Sub3_9.method131();
					local168 = this.aClass4_Sub1_Sub3_9.method130();
					this.method722(local163);
					if (local168 != -1) {
						this.method722(local168);
					}
					if (this.anInt863 != -1) {
						this.method599(this.anInt863);
						this.anInt863 = -1;
					}
					if (this.anInt1032 != -1) {
						this.method599(this.anInt1032);
						this.anInt1032 = -1;
					}
					if (this.anInt882 != -1) {
						this.method599(this.anInt882);
						this.anInt882 = -1;
					}
					if (this.anInt923 != local163) {
						this.method599(this.anInt923);
						this.anInt923 = local163;
					}
					if (this.anInt1031 != local163) {
						this.method599(this.anInt1031);
						this.anInt1031 = local168;
					}
					this.anInt846 = 0;
					this.aBoolean235 = false;
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 240) {
					this.method680();
					this.anInt996 = -1;
					return false;
				}
				if (this.anInt996 == 64) {
					this.aClass4_Sub1_Sub3_9.method104();
					this.aClass4_Sub1_Sub3_9.method122();
					this.anInt1021 = this.aClass4_Sub1_Sub3_9.method104();
					this.anInt941 = this.aClass4_Sub1_Sub3_9.method138(this.anInt934);
					this.anInt830 = this.aClass4_Sub1_Sub3_9.method130();
					this.anInt900 = this.aClass4_Sub1_Sub3_9.method104();
					this.anInt993 = this.aClass4_Sub1_Sub3_9.method130();
					this.anInt926 = this.aClass4_Sub1_Sub3_9.method130();
					this.anInt862 = this.aClass4_Sub1_Sub3_9.method104();
					this.anInt832 = this.aClass4_Sub1_Sub3_9.method130();
					this.anInt920 = this.aClass4_Sub1_Sub3_9.method131();
					signlink.dnslookup(Class36.method381(this.anInt941, (byte) 3));
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 167) {
					this.anInt940 = this.aClass4_Sub1_Sub3_9.method102();
					this.anInt1008 = this.aClass4_Sub1_Sub3_9.method102();
					this.anInt1018 = this.aClass4_Sub1_Sub3_9.method102();
					this.aBoolean232 = true;
					this.aBoolean260 = true;
					this.anInt996 = -1;
					return true;
				}
				@Pc(1215) Class26 local1215;
				if (this.anInt996 == 124) {
					local163 = this.aClass4_Sub1_Sub3_9.method105();
					local168 = this.aClass4_Sub1_Sub3_9.method131();
					local1215 = Class26.method319(local168);
					if (local1215.anInt327 != local163 || local163 == -1) {
						local1215.anInt327 = local163;
						local1215.anInt326 = 0;
						local1215.anInt335 = 0;
					}
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 118) {
					if (this.anInt1032 != -1) {
						this.method599(this.anInt1032);
						this.anInt1032 = -1;
						this.aBoolean255 = true;
						this.aBoolean233 = true;
					}
					if (this.anInt882 != -1) {
						this.method599(this.anInt882);
						this.anInt882 = -1;
						this.aBoolean260 = true;
					}
					if (this.anInt923 != -1) {
						this.method599(this.anInt923);
						this.anInt923 = -1;
						this.aBoolean239 = true;
					}
					if (this.anInt1031 != -1) {
						this.method599(this.anInt1031);
						this.anInt1031 = -1;
					}
					if (this.anInt863 != -1) {
						this.method599(this.anInt863);
						this.anInt863 = -1;
					}
					if (this.anInt846 != 0) {
						this.anInt846 = 0;
						this.aBoolean260 = true;
					}
					this.aBoolean235 = false;
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 133) {
					local163 = this.aClass4_Sub1_Sub3_9.method130();
					local168 = this.aClass4_Sub1_Sub3_9.method131();
					local1215 = Class26.method319(local168);
					if (local1215 != null && local1215.anInt347 == 0) {
						if (local163 < 0) {
							local163 = 0;
						}
						if (local163 > local1215.anInt352 - local1215.anInt357) {
							local163 = local1215.anInt352 - local1215.anInt357;
						}
						local1215.anInt339 = local163;
					}
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 145) {
					this.anInt933 = this.anInt995 / 8;
					for (local163 = 0; local163 < this.anInt933; local163++) {
						this.aLongArray4[local163] = this.aClass4_Sub1_Sub3_9.method108();
					}
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 239) {
					this.aBoolean245 = true;
					this.anInt872 = this.aClass4_Sub1_Sub3_9.method102();
					this.anInt873 = this.aClass4_Sub1_Sub3_9.method102();
					this.anInt874 = this.aClass4_Sub1_Sub3_9.method104();
					this.anInt875 = this.aClass4_Sub1_Sub3_9.method102();
					this.anInt876 = this.aClass4_Sub1_Sub3_9.method102();
					if (this.anInt876 >= 100) {
						this.anInt928 = this.anInt872 * 128 + 64;
						this.anInt930 = this.anInt873 * 128 + 64;
						this.anInt929 = this.method651(this.anInt928, this.anInt981, this.anInt930) - this.anInt874;
					}
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 219) {
					this.anInt1040 = this.aClass4_Sub1_Sub3_9.method131() * 30;
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 156) {
					local163 = this.aClass4_Sub1_Sub3_9.method130();
					local195 = Class26.method319(local163);
					for (local201 = 0; local201 < local195.anIntArray86.length; local201++) {
						local195.anIntArray86[local201] = -1;
						local195.anIntArray86[local201] = 0;
					}
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 58) {
					local163 = this.aClass4_Sub1_Sub3_9.method134();
					local168 = this.aClass4_Sub1_Sub3_9.method104();
					local201 = this.aClass4_Sub1_Sub3_9.method105();
					@Pc(1553) Class26 local1553 = Class26.method319(local168);
					local1553.anInt333 = local201;
					local1553.anInt361 = local163;
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 151) {
					this.anInt937 = this.aClass4_Sub1_Sub3_9.method121();
					this.aBoolean255 = true;
					this.aBoolean233 = true;
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 173) {
					local163 = this.aClass4_Sub1_Sub3_9.method131();
					local168 = this.aClass4_Sub1_Sub3_9.method132(this.aByte42);
					local201 = local168 >> 10 & 0x1F;
					local205 = local168 >> 5 & 0x1F;
					local209 = local168 & 0x1F;
					Class26.method319(local163).anInt330 = (local201 << 19) + (local205 << 11) + (local209 << 3);
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 218) {
					local163 = this.aClass4_Sub1_Sub3_9.method130();
					local168 = this.aClass4_Sub1_Sub3_9.method131();
					local201 = this.aClass4_Sub1_Sub3_9.method131();
					if (local163 == 65535) {
						Class26.method319(local168).anInt344 = 0;
						this.anInt996 = -1;
						return true;
					}
					@Pc(1669) Class24 local1669 = Class24.method315(local163);
					Class26.method319(local168).anInt344 = 4;
					Class26.method319(local168).anInt345 = local163;
					Class26.method319(local168).anInt350 = local1669.anInt311;
					Class26.method319(local168).anInt351 = local1669.anInt305;
					Class26.method319(local168).anInt349 = local1669.anInt310 * 100 / local201;
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 246) {
					local163 = this.aClass4_Sub1_Sub3_9.method134();
					if (local163 >= 0) {
						this.method722(local163);
					}
					if (local163 != this.anInt1027) {
						this.method599(this.anInt1027);
						this.anInt1027 = local163;
					}
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 254) {
					this.method697(this.aClass4_Sub1_Sub3_9, this.anInt995);
					this.aBoolean252 = false;
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 71) {
					this.method601(this.aClass4_Sub1_Sub3_9, this.anInt995);
					this.anInt996 = -1;
					return true;
				}
				@Pc(1792) boolean local1792;
				@Pc(1927) String local1927;
				if (this.anInt996 == 42) {
					local526 = this.aClass4_Sub1_Sub3_9.method109();
					@Pc(1787) String local1787;
					@Pc(1790) long local1790;
					if (local526.endsWith(":tradereq:")) {
						local1787 = local526.substring(0, local526.indexOf(":"));
						local1790 = Class36.method378(local1787);
						local1792 = false;
						for (local320 = 0; local320 < this.anInt933; local320++) {
							if (this.aLongArray4[local320] == local1790) {
								local1792 = true;
								break;
							}
						}
						if (!local1792 && this.anInt944 == 0) {
							this.method718("wishes to trade with you.", local1787, 4);
						}
					} else if (local526.endsWith(":duelreq:")) {
						local1787 = local526.substring(0, local526.indexOf(":"));
						local1790 = Class36.method378(local1787);
						local1792 = false;
						for (local320 = 0; local320 < this.anInt933; local320++) {
							if (this.aLongArray4[local320] == local1790) {
								local1792 = true;
								break;
							}
						}
						if (!local1792 && this.anInt944 == 0) {
							this.method718("wishes to duel with you.", local1787, 8);
						}
					} else if (local526.endsWith(":chalreq:")) {
						local1787 = local526.substring(0, local526.indexOf(":"));
						local1790 = Class36.method378(local1787);
						local1792 = false;
						for (local320 = 0; local320 < this.anInt933; local320++) {
							if (this.aLongArray4[local320] == local1790) {
								local1792 = true;
								break;
							}
						}
						if (!local1792 && this.anInt944 == 0) {
							local1927 = local526.substring(local526.indexOf(":") + 1, local526.length() - 9);
							this.method718(local1927, local1787, 8);
						}
					} else {
						this.method718(local526, "", 0);
					}
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 228) {
					if (this.anInt937 == 12) {
						this.aBoolean255 = true;
					}
					this.anInt1006 = this.aClass4_Sub1_Sub3_9.method105();
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 227) {
					local163 = this.aClass4_Sub1_Sub3_9.method104();
					local168 = this.aClass4_Sub1_Sub3_9.method102();
					local201 = this.aClass4_Sub1_Sub3_9.method104();
					if (local201 == 65535) {
						if (this.anInt834 < 50) {
							this.anIntArray218[this.anInt834] = (short) local163;
							this.anIntArray234[this.anInt834] = local168;
							this.anIntArray246[this.anInt834] = 0;
							this.anInt834++;
						}
					} else if (this.aBoolean242 && !aBoolean225 && this.anInt834 < 50) {
						this.anIntArray218[this.anInt834] = local163;
						this.anIntArray234[this.anInt834] = local168;
						this.anIntArray246[this.anInt834] = local201 + Class40.anIntArray145[local163];
						this.anInt834++;
					}
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 252) {
					local163 = this.aClass4_Sub1_Sub3_9.method131();
					local168 = this.aClass4_Sub1_Sub3_9.method130();
					local201 = this.aClass4_Sub1_Sub3_9.method130();
					local205 = this.aClass4_Sub1_Sub3_9.method130();
					Class26.method319(local168).anInt350 = local163;
					Class26.method319(local168).anInt351 = local201;
					Class26.method319(local168).anInt349 = local205;
					this.anInt996 = -1;
					return true;
				}
				@Pc(2256) int local2256;
				@Pc(2109) long local2109;
				if (this.anInt996 == 235) {
					local2109 = this.aClass4_Sub1_Sub3_9.method108();
					local201 = this.aClass4_Sub1_Sub3_9.method102();
					@Pc(2119) String local2119 = Class36.method382(Class36.method379(local2109), 78);
					for (local209 = 0; local209 < this.anInt910; local209++) {
						if (local2109 == this.aLongArray3[local209]) {
							if (this.anIntArray235[local209] != local201) {
								this.anIntArray235[local209] = local201;
								this.aBoolean255 = true;
								if (local201 > 0) {
									this.method718(local2119 + " has logged in.", "", 5);
								}
								if (local201 == 0) {
									this.method718(local2119 + " has logged out.", "", 5);
								}
							}
							local2119 = null;
							break;
						}
					}
					if (local2119 != null && this.anInt910 < 200) {
						this.aLongArray3[this.anInt910] = local2109;
						this.aStringArray14[this.anInt910] = local2119;
						this.anIntArray235[this.anInt910] = local201;
						this.anInt910++;
						this.aBoolean255 = true;
					}
					@Pc(2217) boolean local2217 = false;
					while (!local2217) {
						local2217 = true;
						for (local331 = 0; local331 < this.anInt910 - 1; local331++) {
							if (this.anIntArray235[local331] != anInt852 && this.anIntArray235[local331 + 1] == anInt852 || this.anIntArray235[local331] == 0 && this.anIntArray235[local331 + 1] != 0) {
								local2256 = this.anIntArray235[local331];
								this.anIntArray235[local331] = this.anIntArray235[local331 + 1];
								this.anIntArray235[local331 + 1] = local2256;
								@Pc(2278) String local2278 = this.aStringArray14[local331];
								this.aStringArray14[local331] = this.aStringArray14[local331 + 1];
								this.aStringArray14[local331 + 1] = local2278;
								@Pc(2300) long local2300 = this.aLongArray3[local331];
								this.aLongArray3[local331] = this.aLongArray3[local331 + 1];
								this.aLongArray3[local331 + 1] = local2300;
								this.aBoolean255 = true;
								local2217 = false;
							}
						}
					}
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 189) {
					this.anInt847 = this.aClass4_Sub1_Sub3_9.method102();
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 210) {
					local163 = this.aClass4_Sub1_Sub3_9.method102();
					local168 = this.aClass4_Sub1_Sub3_9.method102();
					@Pc(2366) String local2366 = this.aClass4_Sub1_Sub3_9.method109();
					if (local163 >= 1 && local163 <= 5) {
						if (local2366.equalsIgnoreCase("null")) {
							local2366 = null;
						}
						this.aStringArray12[local163 - 1] = local2366;
						this.aBooleanArray11[local163 - 1] = local168 == 0;
					}
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 == 217) {
					this.anInt909 = this.aClass4_Sub1_Sub3_9.method121();
					if (this.anInt909 == this.anInt937) {
						if (this.anInt909 == 3) {
							this.anInt937 = 1;
						} else {
							this.anInt937 = 3;
						}
						this.aBoolean255 = true;
					}
					this.anInt996 = -1;
					return true;
				}
				if (this.anInt996 != 176 && this.anInt996 != 174 && this.anInt996 != 32 && this.anInt996 != 121 && this.anInt996 != 53 && this.anInt996 != 54 && this.anInt996 != 9 && this.anInt996 != 253 && this.anInt996 != 162 && this.anInt996 != 17 && this.anInt996 != 182) {
					if (this.anInt996 == 102) {
						local163 = this.aClass4_Sub1_Sub3_9.method138(this.anInt934);
						local168 = this.aClass4_Sub1_Sub3_9.method132(this.aByte42);
						this.anIntArray271[local168] = local163;
						if (this.anIntArray276[local168] != local163) {
							this.anIntArray276[local168] = local163;
							this.method656(local168);
							this.aBoolean255 = true;
							if (this.anInt888 != -1) {
								this.aBoolean260 = true;
							}
						}
						this.anInt996 = -1;
						return true;
					}
					if (this.anInt996 == 153) {
						local163 = this.aClass4_Sub1_Sub3_9.method133(699);
						if (local163 != this.anInt888) {
							this.method599(this.anInt888);
							this.anInt888 = local163;
						}
						this.aBoolean260 = true;
						this.anInt996 = -1;
						return true;
					}
					if (this.anInt996 == 78) {
						this.anInt1048 = this.aClass4_Sub1_Sub3_9.method121();
						this.anInt1047 = this.aClass4_Sub1_Sub3_9.method123();
						this.anInt996 = -1;
						return true;
					}
					if (this.anInt996 == 82) {
						this.anInt856 = this.aClass4_Sub1_Sub3_9.method102();
						this.anInt996 = -1;
						return true;
					}
					if (this.anInt996 == 44) {
						local163 = this.aClass4_Sub1_Sub3_9.method122();
						local168 = this.aClass4_Sub1_Sub3_9.method131();
						if (local168 == 65535) {
							local168 = -1;
						}
						if (this.anIntArray265[local163] != local168) {
							this.method599(this.anIntArray265[local163]);
							this.anIntArray265[local163] = local168;
						}
						this.aBoolean255 = true;
						this.aBoolean233 = true;
						this.anInt996 = -1;
						return true;
					}
					if (this.anInt996 == 103) {
						this.anInt831 = this.aClass4_Sub1_Sub3_9.method123();
						this.anInt982 = this.aClass4_Sub1_Sub3_9.method104();
						this.anInt996 = -1;
						return true;
					}
					if (this.anInt996 == 150) {
						this.anInt911 = this.aClass4_Sub1_Sub3_9.method102();
						this.aBoolean255 = true;
						this.anInt996 = -1;
						return true;
					}
					if (this.anInt996 == 243) {
						this.aBoolean245 = false;
						for (local163 = 0; local163 < 5; local163++) {
							this.aBooleanArray12[local163] = false;
						}
						this.anInt996 = -1;
						return true;
					}
					if (this.anInt996 == 86) {
						local163 = this.aClass4_Sub1_Sub3_9.method130();
						local168 = this.aClass4_Sub1_Sub3_9.method131();
						Class26.method319(local163).anInt344 = 2;
						Class26.method319(local163).anInt345 = local168;
						this.anInt996 = -1;
						return true;
					}
					if (this.anInt996 == 77) {
						this.anInt1056 = this.aClass4_Sub1_Sub3_9.method102();
						if (this.anInt1056 == 1) {
							this.anInt951 = this.aClass4_Sub1_Sub3_9.method104();
						}
						if (this.anInt1056 >= 2 && this.anInt1056 <= 6) {
							if (this.anInt1056 == 2) {
								this.anInt965 = 64;
								this.anInt966 = 64;
							}
							if (this.anInt1056 == 3) {
								this.anInt965 = 0;
								this.anInt966 = 64;
							}
							if (this.anInt1056 == 4) {
								this.anInt965 = 128;
								this.anInt966 = 64;
							}
							if (this.anInt1056 == 5) {
								this.anInt965 = 64;
								this.anInt966 = 0;
							}
							if (this.anInt1056 == 6) {
								this.anInt965 = 64;
								this.anInt966 = 128;
							}
							this.anInt1056 = 2;
							this.anInt962 = this.aClass4_Sub1_Sub3_9.method104();
							this.anInt963 = this.aClass4_Sub1_Sub3_9.method104();
							this.anInt964 = this.aClass4_Sub1_Sub3_9.method102();
						}
						if (this.anInt1056 == 10) {
							this.anInt1028 = this.aClass4_Sub1_Sub3_9.method104();
						}
						this.anInt996 = -1;
						return true;
					}
					if (this.anInt996 != 184) {
						if (this.anInt996 == 48) {
							for (local163 = 0; local163 < this.anIntArray276.length; local163++) {
								if (this.anIntArray276[local163] != this.anIntArray271[local163]) {
									this.anIntArray276[local163] = this.anIntArray271[local163];
									this.method656(local163);
									this.aBoolean255 = true;
								}
							}
							this.anInt996 = -1;
							return true;
						}
						if (this.anInt996 == 52) {
							this.anInt1048 = this.aClass4_Sub1_Sub3_9.method121();
							this.anInt1047 = this.aClass4_Sub1_Sub3_9.method121();
							for (local163 = this.anInt1047; local163 < this.anInt1047 + 8; local163++) {
								for (local168 = this.anInt1048; local168 < this.anInt1048 + 8; local168++) {
									if (this.aClass30ArrayArrayArray1[this.anInt981][local163][local168] != null) {
										this.aClass30ArrayArrayArray1[this.anInt981][local163][local168] = null;
										this.method597(local163, local168);
									}
								}
							}
							for (@Pc(3124) Class4_Sub2 local3124 = (Class4_Sub2) this.aClass30_12.method346(); local3124 != null; local3124 = (Class4_Sub2) this.aClass30_12.method348()) {
								if (local3124.anInt58 >= this.anInt1047 && local3124.anInt58 < this.anInt1047 + 8 && local3124.anInt59 >= this.anInt1048 && local3124.anInt59 < this.anInt1048 + 8 && local3124.anInt56 == this.anInt981) {
									local3124.anInt51 = 0;
								}
							}
							this.anInt996 = -1;
							return true;
						}
						if (this.anInt996 == 166) {
							this.aBoolean255 = true;
							local163 = this.aClass4_Sub1_Sub3_9.method104();
							local195 = Class26.method319(local163);
							local201 = this.aClass4_Sub1_Sub3_9.method104();
							for (local205 = 0; local205 < local201; local205++) {
								local195.anIntArray86[local205] = this.aClass4_Sub1_Sub3_9.method131();
								local209 = this.aClass4_Sub1_Sub3_9.method102();
								if (local209 == 255) {
									local209 = this.aClass4_Sub1_Sub3_9.method137(this.aByte38);
								}
								local195.anIntArray92[local205] = local209;
							}
							for (local209 = local201; local209 < local195.anIntArray86.length; local209++) {
								local195.anIntArray86[local209] = 0;
								local195.anIntArray92[local209] = 0;
							}
							this.anInt996 = -1;
							return true;
						}
						if (this.anInt996 == 139) {
							local163 = this.aClass4_Sub1_Sub3_9.method104();
							this.method722(local163);
							if (this.anInt882 != -1) {
								this.method599(this.anInt882);
								this.anInt882 = -1;
								this.aBoolean260 = true;
							}
							if (this.anInt923 != -1) {
								this.method599(this.anInt923);
								this.anInt923 = -1;
								this.aBoolean239 = true;
							}
							if (this.anInt1031 != -1) {
								this.method599(this.anInt1031);
								this.anInt1031 = -1;
							}
							if (this.anInt863 != -1) {
								this.method599(this.anInt863);
								this.anInt863 = -1;
							}
							if (this.anInt1032 != local163) {
								this.method599(this.anInt1032);
								this.anInt1032 = local163;
							}
							if (this.anInt846 != 0) {
								this.anInt846 = 0;
								this.aBoolean260 = true;
							}
							this.aBoolean255 = true;
							this.aBoolean233 = true;
							this.aBoolean235 = false;
							this.anInt996 = -1;
							return true;
						}
						if (this.anInt996 == 178) {
							if (this.anInt937 == 12) {
								this.aBoolean255 = true;
							}
							this.anInt1023 = this.aClass4_Sub1_Sub3_9.method102();
							this.anInt996 = -1;
							return true;
						}
						if (this.anInt996 == 50) {
							local163 = this.aClass4_Sub1_Sub3_9.method130();
							this.method722(local163);
							if (this.anInt1032 != -1) {
								this.method599(this.anInt1032);
								this.anInt1032 = -1;
								this.aBoolean255 = true;
								this.aBoolean233 = true;
							}
							if (this.anInt882 != -1) {
								this.method599(this.anInt882);
								this.anInt882 = -1;
								this.aBoolean260 = true;
							}
							if (this.anInt923 != -1) {
								this.method599(this.anInt923);
								this.anInt923 = -1;
								this.aBoolean239 = true;
							}
							if (this.anInt1031 != -1) {
								this.method599(this.anInt1031);
								this.anInt1031 = -1;
							}
							if (this.anInt863 != local163) {
								this.method599(this.anInt863);
								this.anInt863 = local163;
							}
							if (this.anInt846 != 0) {
								this.anInt846 = 0;
								this.aBoolean260 = true;
							}
							this.aBoolean235 = false;
							this.anInt996 = -1;
							return true;
						}
						if (this.anInt996 == 2) {
							local163 = this.aClass4_Sub1_Sub3_9.method104();
							this.method722(local163);
							if (this.anInt1032 != -1) {
								this.method599(this.anInt1032);
								this.anInt1032 = -1;
								this.aBoolean255 = true;
								this.aBoolean233 = true;
							}
							if (this.anInt923 != -1) {
								this.method599(this.anInt923);
								this.anInt923 = -1;
								this.aBoolean239 = true;
							}
							if (this.anInt1031 != -1) {
								this.method599(this.anInt1031);
								this.anInt1031 = -1;
							}
							if (this.anInt863 != -1) {
								this.method599(this.anInt863);
								this.anInt863 = -1;
							}
							if (this.anInt882 != local163) {
								this.method599(this.anInt882);
								this.anInt882 = local163;
							}
							this.aBoolean235 = false;
							this.aBoolean260 = true;
							this.anInt996 = -1;
							return true;
						}
						if (this.anInt996 == 233 || this.anInt996 == 179) {
							local163 = this.anInt1014;
							local168 = this.anInt1015;
							if (this.anInt996 == 233) {
								local163 = this.aClass4_Sub1_Sub3_9.method131();
								local168 = this.aClass4_Sub1_Sub3_9.method130();
								this.aBoolean265 = false;
							}
							if (this.anInt996 == 179) {
								local163 = this.aClass4_Sub1_Sub3_9.method131();
								this.aClass4_Sub1_Sub3_9.method112();
								local201 = 0;
								while (true) {
									if (local201 >= 4) {
										this.aClass4_Sub1_Sub3_9.method114(462);
										local168 = this.aClass4_Sub1_Sub3_9.method104();
										this.aBoolean265 = true;
										break;
									}
									for (local205 = 0; local205 < 13; local205++) {
										for (local209 = 0; local209 < 13; local209++) {
											local320 = this.aClass4_Sub1_Sub3_9.method113(1, 779);
											if (local320 == 1) {
												this.anIntArrayArrayArray7[local201][local205][local209] = this.aClass4_Sub1_Sub3_9.method113(26, 779);
											} else {
												this.anIntArrayArrayArray7[local201][local205][local209] = -1;
											}
										}
									}
									local201++;
								}
							}
							if (this.anInt1014 == local163 && this.anInt1015 == local168 && this.anInt967 == 2) {
								this.anInt996 = -1;
								return true;
							}
							this.anInt1014 = local163;
							this.anInt1015 = local168;
							this.anInt838 = (this.anInt1014 - 6) * 8;
							this.anInt839 = (this.anInt1015 - 6) * 8;
							this.aBoolean247 = false;
							if ((this.anInt1014 / 8 == 48 || this.anInt1014 / 8 == 49) && this.anInt1015 / 8 == 48) {
								this.aBoolean247 = true;
							}
							if (this.anInt1014 / 8 == 48 && this.anInt1015 / 8 == 148) {
								this.aBoolean247 = true;
							}
							this.anInt967 = 1;
							this.aLong31 = System.currentTimeMillis();
							this.method681(null, "Loading - please wait.");
							if (this.anInt996 == 233) {
								local201 = 0;
								local205 = (this.anInt1014 - 6) / 8;
								label1184: while (true) {
									if (local205 > (this.anInt1014 + 6) / 8) {
										this.aByteArrayArray5 = new byte[local201][];
										this.aByteArrayArray6 = new byte[local201][];
										this.anIntArray256 = new int[local201];
										this.anIntArray257 = new int[local201];
										this.anIntArray258 = new int[local201];
										local201 = 0;
										local209 = (this.anInt1014 - 6) / 8;
										while (true) {
											if (local209 > (this.anInt1014 + 6) / 8) {
												break label1184;
											}
											for (local320 = (this.anInt1015 - 6) / 8; local320 <= (this.anInt1015 + 6) / 8; local320++) {
												this.anIntArray256[local201] = (local209 << 8) + local320;
												if (this.aBoolean247 && (local320 == 49 || local320 == 149 || local320 == 147 || local209 == 50 || local209 == 49 && local320 == 47)) {
													this.anIntArray257[local201] = -1;
													this.anIntArray258[local201] = -1;
													local201++;
												} else {
													local331 = this.anIntArray257[local201] = this.aClass20_Sub1_1.method297(local320, 0, local209);
													if (local331 != -1) {
														this.aClass20_Sub1_1.method292(3, local331);
													}
													local2256 = this.anIntArray258[local201] = this.aClass20_Sub1_1.method297(local320, 1, local209);
													if (local2256 != -1) {
														this.aClass20_Sub1_1.method292(3, local2256);
													}
													local201++;
												}
											}
											local209++;
										}
									}
									for (local209 = (this.anInt1015 - 6) / 8; local209 <= (this.anInt1015 + 6) / 8; local209++) {
										local201++;
									}
									local205++;
								}
							}
							if (this.anInt996 == 179) {
								local201 = 0;
								@Pc(3961) int[] local3961 = new int[676];
								local209 = 0;
								label1145: while (true) {
									@Pc(3991) int local3991;
									@Pc(3997) int local3997;
									@Pc(4007) int local4007;
									if (local209 >= 4) {
										this.aByteArrayArray5 = new byte[local201][];
										this.aByteArrayArray6 = new byte[local201][];
										this.anIntArray256 = new int[local201];
										this.anIntArray257 = new int[local201];
										this.anIntArray258 = new int[local201];
										local320 = 0;
										while (true) {
											if (local320 >= local201) {
												break label1145;
											}
											local331 = this.anIntArray256[local320] = local3961[local320];
											local2256 = local331 >> 8 & 0xFF;
											local3991 = local331 & 0xFF;
											local3997 = this.anIntArray257[local320] = this.aClass20_Sub1_1.method297(local3991, 0, local2256);
											if (local3997 != -1) {
												this.aClass20_Sub1_1.method292(3, local3997);
											}
											local4007 = this.anIntArray258[local320] = this.aClass20_Sub1_1.method297(local3991, 1, local2256);
											if (local4007 != -1) {
												this.aClass20_Sub1_1.method292(3, local4007);
											}
											local320++;
										}
									}
									for (local320 = 0; local320 < 13; local320++) {
										for (local331 = 0; local331 < 13; local331++) {
											local2256 = this.anIntArrayArrayArray7[local209][local320][local331];
											if (local2256 != -1) {
												local3991 = local2256 >> 14 & 0x3FF;
												local3997 = local2256 >> 3 & 0x7FF;
												local4007 = (local3991 / 8 << 8) + local3997 / 8;
												for (@Pc(4009) int local4009 = 0; local4009 < local201; local4009++) {
													if (local3961[local4009] == local4007) {
														local4007 = -1;
														break;
													}
												}
												if (local4007 != -1) {
													local3961[local201++] = local4007;
												}
											}
										}
									}
									local209++;
								}
							}
							local201 = this.anInt838 - this.anInt840;
							local205 = this.anInt839 - this.anInt841;
							this.anInt840 = this.anInt838;
							this.anInt841 = this.anInt839;
							for (local209 = 0; local209 < 16384; local209++) {
								@Pc(4162) Class4_Sub1_Sub2_Sub5_Sub1 local4162 = this.aClass4_Sub1_Sub2_Sub5_Sub1Array1[local209];
								if (local4162 != null) {
									for (local331 = 0; local331 < 10; local331++) {
										local4162.anIntArray174[local331] -= local201;
										local4162.anIntArray175[local331] -= local205;
									}
									local4162.anInt694 -= local201 * 128;
									local4162.anInt695 -= local205 * 128;
								}
							}
							for (local320 = 0; local320 < this.anInt1041; local320++) {
								@Pc(4217) Class4_Sub1_Sub2_Sub5_Sub2 local4217 = this.aClass4_Sub1_Sub2_Sub5_Sub2Array1[local320];
								if (local4217 != null) {
									for (local2256 = 0; local2256 < 10; local2256++) {
										local4217.anIntArray174[local2256] -= local201;
										local4217.anIntArray175[local2256] -= local205;
									}
									local4217.anInt694 -= local201 * 128;
									local4217.anInt695 -= local205 * 128;
								}
							}
							this.aBoolean252 = true;
							@Pc(4269) byte local4269 = 0;
							@Pc(4271) byte local4271 = 104;
							@Pc(4273) byte local4273 = 1;
							if (local201 < 0) {
								local4269 = 103;
								local4271 = -1;
								local4273 = -1;
							}
							@Pc(4283) byte local4283 = 0;
							@Pc(4285) byte local4285 = 104;
							@Pc(4287) byte local4287 = 1;
							if (local205 < 0) {
								local4283 = 103;
								local4285 = -1;
								local4287 = -1;
							}
							for (@Pc(4297) int local4297 = local4269; local4297 != local4271; local4297 += local4273) {
								for (@Pc(4301) int local4301 = local4283; local4301 != local4285; local4301 += local4287) {
									@Pc(4307) int local4307 = local4297 + local201;
									@Pc(4311) int local4311 = local4301 + local205;
									for (@Pc(4313) int local4313 = 0; local4313 < 4; local4313++) {
										if (local4307 >= 0 && local4311 >= 0 && local4307 < 104 && local4311 < 104) {
											this.aClass30ArrayArrayArray1[local4313][local4297][local4301] = this.aClass30ArrayArrayArray1[local4313][local4307][local4311];
										} else {
											this.aClass30ArrayArrayArray1[local4313][local4297][local4301] = null;
										}
									}
								}
							}
							for (@Pc(4375) Class4_Sub2 local4375 = (Class4_Sub2) this.aClass30_12.method346(); local4375 != null; local4375 = (Class4_Sub2) this.aClass30_12.method348()) {
								local4375.anInt58 -= local201;
								local4375.anInt59 -= local205;
								if (local4375.anInt58 < 0 || local4375.anInt59 < 0 || local4375.anInt58 >= 104 || local4375.anInt59 >= 104) {
									local4375.method572();
								}
							}
							if (this.anInt1003 != 0) {
								this.anInt1003 -= local201;
								this.anInt1004 -= local205;
							}
							this.aBoolean245 = false;
							this.anInt996 = -1;
							return true;
						}
						if (this.anInt996 == 141) {
							local163 = this.aClass4_Sub1_Sub3_9.method102();
							local168 = this.aClass4_Sub1_Sub3_9.method102();
							local201 = this.aClass4_Sub1_Sub3_9.method102();
							local205 = this.aClass4_Sub1_Sub3_9.method102();
							this.aBooleanArray12[local163] = true;
							this.anIntArray267[local163] = local168;
							this.anIntArray272[local163] = local201;
							this.anIntArray275[local163] = local205;
							this.anIntArray222[local163] = 0;
							this.anInt996 = -1;
							return true;
						}
						signlink.reporterror("T1 - " + this.anInt996 + "," + this.anInt995 + " - " + this.anInt859 + "," + this.anInt860);
						this.method680();
						return true;
					}
					local2109 = this.aClass4_Sub1_Sub3_9.method108();
					local201 = this.aClass4_Sub1_Sub3_9.method107();
					local205 = this.aClass4_Sub1_Sub3_9.method102();
					local1792 = false;
					for (local320 = 0; local320 < 100; local320++) {
						if (this.anIntArray262[local320] == local201) {
							local1792 = true;
							break;
						}
					}
					if (local205 <= 1) {
						for (local331 = 0; local331 < this.anInt933; local331++) {
							if (this.aLongArray4[local331] == local2109) {
								local1792 = true;
								break;
							}
						}
					}
					if (!local1792 && this.anInt944 == 0) {
						try {
							this.anIntArray262[this.anInt884] = local201;
							this.anInt884 = (this.anInt884 + 1) % 100;
							local1927 = Class35.method375(this.aClass4_Sub1_Sub3_9, this.anInt995 - 13);
							if (local205 != 3) {
								local1927 = Class10.method157(local1927);
							}
							if (local205 == 2 || local205 == 3) {
								this.method718(local1927, "@cr2@" + Class36.method382(Class36.method379(local2109), 78), 7);
							} else if (local205 == 1) {
								this.method718(local1927, "@cr1@" + Class36.method382(Class36.method379(local2109), 78), 7);
							} else {
								this.method718(local1927, Class36.method382(Class36.method379(local2109), 78), 3);
							}
						} catch (@Pc(3004) Exception local3004) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt996 = -1;
					return true;
				}
				this.method724(this.aClass4_Sub1_Sub3_9, this.anInt996);
				this.anInt996 = -1;
				return true;
			} catch (@Pc(4515) IOException local4515) {
				this.method602();
			} catch (@Pc(4520) Exception local4520) {
				local526 = "T2 - " + this.anInt996 + "," + this.anInt859 + "," + this.anInt860 + " - " + this.anInt995 + "," + (this.anInt838 + aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0]) + "," + (this.anInt839 + aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0]) + " - ";
				for (local168 = 0; local168 < this.anInt995 && local168 < 50; local168++) {
					local526 = local526 + this.aClass4_Sub1_Sub3_9.aByteArray3[local168] + ",";
				}
				signlink.reporterror(local526);
				this.method680();
			}
			return true;
		} catch (@Pc(4601) RuntimeException local4601) {
			signlink.reporterror("93206, " + -43764 + ", " + local4601.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method616() {
		try {
			@Pc(17) int local17;
			@Pc(24) int local24;
			if (this.anInt952 == 0) {
				local17 = super.anInt815 / 2 - 80;
				local24 = super.anInt816 / 2 + 20;
				local24 += 20;
				if (super.anInt824 == 1 && super.anInt825 >= local17 - 75 && super.anInt825 <= local17 + 75 && super.anInt826 >= local24 - 20 && super.anInt826 <= local24 + 20) {
					this.anInt952 = 3;
					this.anInt938 = 0;
				}
				local17 = super.anInt815 / 2 + 80;
				if (super.anInt824 == 1 && super.anInt825 >= local17 - 75 && super.anInt825 <= local17 + 75 && super.anInt826 >= local24 - 20 && super.anInt826 <= local24 + 20) {
					this.aString30 = "";
					this.aString31 = "Enter your username & password.";
					this.anInt952 = 2;
					this.anInt938 = 0;
				}
			} else if (this.anInt952 == 2) {
				local17 = super.anInt816 / 2 - 40;
				local17 += 30;
				local17 += 25;
				if (super.anInt824 == 1 && super.anInt826 >= local17 - 15 && super.anInt826 < local17) {
					this.anInt938 = 0;
				}
				local17 += 15;
				if (super.anInt824 == 1 && super.anInt826 >= local17 - 15 && super.anInt826 < local17) {
					this.anInt938 = 1;
				}
				local17 += 15;
				local24 = super.anInt815 / 2 - 80;
				@Pc(170) int local170 = super.anInt816 / 2 + 50;
				@Pc(171) int local171 = local170 + 20;
				if (super.anInt824 == 1 && super.anInt825 >= local24 - 75 && super.anInt825 <= local24 + 75 && super.anInt826 >= local171 - 20 && super.anInt826 <= local171 + 20) {
					this.anInt866 = 0;
					this.method590(this.aString18, this.aString19, false);
					if (this.aBoolean241) {
						return;
					}
				}
				local24 = super.anInt815 / 2 + 80;
				if (super.anInt824 == 1 && super.anInt825 >= local24 - 75 && super.anInt825 <= local24 + 75 && super.anInt826 >= local171 - 20 && super.anInt826 <= local171 + 20) {
					this.anInt952 = 0;
					this.aString18 = "";
					this.aString19 = "";
				}
				while (true) {
					while (true) {
						@Pc(261) int local261 = this.method581();
						if (local261 == -1) {
							return;
						}
						@Pc(266) boolean local266 = false;
						for (@Pc(268) int local268 = 0; local268 < aString27.length(); local268++) {
							if (local261 == aString27.charAt(local268)) {
								local266 = true;
								break;
							}
						}
						if (this.anInt938 == 0) {
							if (local261 == 8 && this.aString18.length() > 0) {
								this.aString18 = this.aString18.substring(0, this.aString18.length() - 1);
							}
							if (local261 == 9 || local261 == 10 || local261 == 13) {
								this.anInt938 = 1;
							}
							if (local266) {
								this.aString18 = this.aString18 + (char) local261;
							}
							if (this.aString18.length() > 12) {
								this.aString18 = this.aString18.substring(0, 12);
							}
						} else if (this.anInt938 == 1) {
							if (local261 == 8 && this.aString19.length() > 0) {
								this.aString19 = this.aString19.substring(0, this.aString19.length() - 1);
							}
							if (local261 == 9 || local261 == 10 || local261 == 13) {
								this.anInt938 = 0;
							}
							if (local266) {
								this.aString19 = this.aString19 + (char) local261;
							}
							if (this.aString19.length() > 20) {
								this.aString19 = this.aString19.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt952 == 3) {
				local17 = super.anInt815 / 2;
				local24 = super.anInt816 / 2 + 50;
				@Pc(425) int local425 = local24 + 20;
				if (super.anInt824 == 1 && super.anInt825 >= local17 - 75 && super.anInt825 <= local17 + 75 && super.anInt826 >= local425 - 20 && super.anInt826 <= local425 + 20) {
					this.anInt952 = 0;
					return;
				}
			}
		} catch (@Pc(458) RuntimeException local458) {
			signlink.reporterror("84558, " + 28 + ", " + local458.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZILclient!PCARWQQC;I)V")
	private void method617(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class26 arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2.anInt347 == 0 && arg2.anIntArray87 != null && (!arg2.aBoolean113 || this.anInt1005 == arg2.anInt334 || this.anInt914 == arg2.anInt334 || this.anInt889 == arg2.anInt334)) {
				@Pc(29) int local29 = Class4_Sub1_Sub1.anInt786;
				@Pc(31) int local31 = Class4_Sub1_Sub1.anInt784;
				@Pc(33) int local33 = Class4_Sub1_Sub1.anInt787;
				@Pc(35) int local35 = Class4_Sub1_Sub1.anInt785;
				Class4_Sub1_Sub1.method545(arg3 + arg2.anInt357, arg3, arg0, arg0 + arg2.anInt362);
				@Pc(51) int local51 = arg2.anIntArray87.length;
				for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
					@Pc(62) int local62 = arg2.anIntArray90[local53] + arg0;
					@Pc(71) int local71 = arg2.anIntArray91[local53] + arg3 - arg1;
					@Pc(77) Class26 local77 = Class26.method319(arg2.anIntArray87[local53]);
					@Pc(82) int local82 = local62 + local77.anInt333;
					@Pc(87) int local87 = local71 + local77.anInt361;
					if (local77.anInt337 > 0) {
						this.method701(local77);
					}
					if (local77.anInt347 == 0) {
						if (local77.anInt339 > local77.anInt352 - local77.anInt357) {
							local77.anInt339 = local77.anInt352 - local77.anInt357;
						}
						if (local77.anInt339 < 0) {
							local77.anInt339 = 0;
						}
						this.method617(local82, local77.anInt339, local77, local87);
						if (local77.anInt352 > local77.anInt357) {
							this.method643(local77.anInt339, local82 + local77.anInt362, local77.anInt357, local87, local77.anInt352);
						}
					} else if (local77.anInt347 != 1) {
						@Pc(159) int local159;
						@Pc(163) int local163;
						@Pc(174) int local174;
						@Pc(209) int local209;
						@Pc(216) int local216;
						@Pc(241) int local241;
						@Pc(157) int local157;
						@Pc(207) int local207;
						if (local77.anInt347 == 2) {
							local157 = 0;
							for (local159 = 0; local159 < local77.anInt357; local159++) {
								for (local163 = 0; local163 < local77.anInt362; local163++) {
									local174 = local82 + local163 * (local77.anInt364 + 32);
									@Pc(183) int local183 = local87 + local159 * (local77.anInt355 + 32);
									if (local157 < 20) {
										local174 += local77.anIntArray93[local157];
										local183 += local77.anIntArray94[local157];
									}
									if (local77.anIntArray86[local157] > 0) {
										local207 = 0;
										local209 = 0;
										local216 = local77.anIntArray86[local157] - 1;
										if (local174 > Class4_Sub1_Sub1.anInt786 - 32 && local174 < Class4_Sub1_Sub1.anInt787 && local183 > Class4_Sub1_Sub1.anInt784 - 32 && local183 < Class4_Sub1_Sub1.anInt785 || this.anInt976 != 0 && this.anInt975 == local157) {
											local241 = 0;
											if (this.anInt848 == 1 && this.anInt849 == local157 && this.anInt850 == local77.anInt334) {
												local241 = 16777215;
											}
											@Pc(265) Class4_Sub1_Sub1_Sub3 local265 = Class24.method311(local216, local77.anIntArray92[local157], local241);
											if (local265 != null) {
												@Pc(344) int local344;
												if (this.anInt976 != 0 && this.anInt975 == local157 && this.anInt974 == local77.anInt334) {
													local207 = super.anInt819 - this.anInt977;
													local209 = super.anInt820 - this.anInt978;
													if (local207 < 5 && local207 > -5) {
														local207 = 0;
													}
													if (local209 < 5 && local209 > -5) {
														local209 = 0;
													}
													if (this.anInt948 < 5) {
														local207 = 0;
														local209 = 0;
													}
													local265.method241(local183 + local209, 245, local174 + local207);
													if (local183 + local209 < Class4_Sub1_Sub1.anInt784 && arg2.anInt339 > 0) {
														local344 = this.anInt947 * (Class4_Sub1_Sub1.anInt784 - local183 - local209) / 3;
														if (local344 > this.anInt947 * 10) {
															local344 = this.anInt947 * 10;
														}
														if (local344 > arg2.anInt339) {
															local344 = arg2.anInt339;
														}
														arg2.anInt339 -= local344;
														this.anInt978 += local344;
													}
													if (local183 + local209 + 32 > Class4_Sub1_Sub1.anInt785 && arg2.anInt339 < arg2.anInt352 - arg2.anInt357) {
														local344 = this.anInt947 * (local183 + local209 + 32 - Class4_Sub1_Sub1.anInt785) / 3;
														if (local344 > this.anInt947 * 10) {
															local344 = this.anInt947 * 10;
														}
														if (local344 > arg2.anInt352 - arg2.anInt357 - arg2.anInt339) {
															local344 = arg2.anInt352 - arg2.anInt357 - arg2.anInt339;
														}
														arg2.anInt339 += local344;
														this.anInt978 -= local344;
													}
												} else if (this.anInt1054 != 0 && this.anInt1053 == local157 && this.anInt1052 == local77.anInt334) {
													local265.method241(local183, 245, local174);
												} else {
													local265.method239(233, local174, local183);
												}
												if (local265.anInt219 == 33 || local77.anIntArray92[local157] != 1) {
													local344 = local77.anIntArray92[local157];
													this.aClass4_Sub1_Sub1_Sub1_2.method48(779, method633(local344), local174 + local207 + 1, local183 + 10 + local209, 0);
													this.aClass4_Sub1_Sub1_Sub1_2.method48(779, method633(local344), local174 + local207, local183 + 9 + local209, 16776960);
												}
											}
										}
									} else if (local77.aClass4_Sub1_Sub1_Sub3Array2 != null && local157 < 20) {
										@Pc(533) Class4_Sub1_Sub1_Sub3 local533 = local77.aClass4_Sub1_Sub1_Sub3Array2[local157];
										if (local533 != null) {
											local533.method239(233, local174, local183);
										}
									}
									local157++;
								}
							}
						} else if (local77.anInt347 == 3) {
							@Pc(559) boolean local559 = false;
							if (this.anInt889 == local77.anInt334 || this.anInt914 == local77.anInt334 || this.anInt1005 == local77.anInt334) {
								local559 = true;
							}
							if (this.method620(local77)) {
								local157 = local77.anInt360;
								if (local559 && local77.anInt342 != 0) {
									local157 = local77.anInt342;
								}
							} else {
								local157 = local77.anInt330;
								if (local559 && local77.anInt343 != 0) {
									local157 = local77.anInt343;
								}
							}
							if (local77.aByte20 == 0) {
								if (local77.aBoolean119) {
									Class4_Sub1_Sub1.method548(local82, local157, local87, local77.anInt357, this.anInt945, local77.anInt362);
								} else {
									Class4_Sub1_Sub1.method549(local77.anInt362, local77.anInt357, local157, local82, local87);
								}
							} else if (local77.aBoolean119) {
								Class4_Sub1_Sub1.method547(local82, local77.anInt362, local77.anInt357, local157, 256 - (local77.aByte20 & 0xFF), local87);
							} else {
								Class4_Sub1_Sub1.method550(local82, local77.anInt362, local77.anInt357, 256 - (local77.aByte20 & 0xFF), local87, this.anInt864, local157);
							}
						} else {
							@Pc(679) Class4_Sub1_Sub1_Sub1 local679;
							@Pc(956) String local956;
							if (local77.anInt347 == 4) {
								local679 = local77.aClass4_Sub1_Sub1_Sub1_1;
								@Pc(682) String local682 = local77.aString9;
								@Pc(684) boolean local684 = false;
								if (this.anInt889 == local77.anInt334 || this.anInt914 == local77.anInt334 || this.anInt1005 == local77.anInt334) {
									local684 = true;
								}
								if (this.method620(local77)) {
									local159 = local77.anInt360;
									if (local684 && local77.anInt342 != 0) {
										local159 = local77.anInt342;
									}
									if (local77.aString6.length() > 0) {
										local682 = local77.aString6;
									}
								} else {
									local159 = local77.anInt330;
									if (local684 && local77.anInt343 != 0) {
										local159 = local77.anInt343;
									}
								}
								if (local77.anInt340 == 6 && this.aBoolean235) {
									local682 = "Please wait...";
									local159 = local77.anInt330;
								}
								if (Class4_Sub1_Sub1.anInt782 == 479) {
									if (local159 == 16776960) {
										local159 = 255;
									}
									if (local159 == 49152) {
										local159 = 16777215;
									}
								}
								local207 = local87 + local679.anInt35;
								while (local682.length() > 0) {
									if (local682.indexOf("%") != -1) {
										label390: while (true) {
											local209 = local682.indexOf("%1");
											if (local209 == -1) {
												while (true) {
													local209 = local682.indexOf("%2");
													if (local209 == -1) {
														while (true) {
															local209 = local682.indexOf("%3");
															if (local209 == -1) {
																while (true) {
																	local209 = local682.indexOf("%4");
																	if (local209 == -1) {
																		while (true) {
																			local209 = local682.indexOf("%5");
																			if (local209 == -1) {
																				break label390;
																			}
																			local682 = local682.substring(0, local209) + this.method675(this.method710(local77, 4)) + local682.substring(local209 + 2);
																		}
																	}
																	local682 = local682.substring(0, local209) + this.method675(this.method710(local77, 3)) + local682.substring(local209 + 2);
																}
															}
															local682 = local682.substring(0, local209) + this.method675(this.method710(local77, 2)) + local682.substring(local209 + 2);
														}
													}
													local682 = local682.substring(0, local209) + this.method675(this.method710(local77, 1)) + local682.substring(local209 + 2);
												}
											}
											local682 = local682.substring(0, local209) + this.method675(this.method710(local77, 0)) + local682.substring(local209 + 2);
										}
									}
									local209 = local682.indexOf("\\n");
									if (local209 == -1) {
										local956 = local682;
										local682 = "";
									} else {
										local956 = local682.substring(0, local209);
										local682 = local682.substring(local209 + 2);
									}
									if (local77.aBoolean114) {
										local679.method45(local77.aBoolean115, local82 + local77.anInt362 / 2, local956, local207, local159);
									} else {
										local679.method52(local82, local207, local77.aBoolean115, local956, local159);
									}
									local207 += local679.anInt35;
								}
							} else if (local77.anInt347 == 5) {
								@Pc(1018) Class4_Sub1_Sub1_Sub3 local1018;
								if (this.method620(local77)) {
									local1018 = local77.aClass4_Sub1_Sub1_Sub3_2;
								} else {
									local1018 = local77.aClass4_Sub1_Sub1_Sub3_1;
								}
								if (local1018 != null) {
									local1018.method239(233, local82, local87);
								}
							} else if (local77.anInt347 == 6) {
								local157 = Class4_Sub1_Sub1_Sub4.anInt793;
								local159 = Class4_Sub1_Sub1_Sub4.anInt794;
								Class4_Sub1_Sub1_Sub4.anInt793 = local82 + local77.anInt362 / 2;
								Class4_Sub1_Sub1_Sub4.anInt794 = local87 + local77.anInt357 / 2;
								local163 = Class4_Sub1_Sub1_Sub4.anIntArray204[local77.anInt350] * local77.anInt349 >> 16;
								local174 = Class4_Sub1_Sub1_Sub4.anIntArray205[local77.anInt350] * local77.anInt349 >> 16;
								@Pc(1079) boolean local1079 = this.method620(local77);
								if (local1079) {
									local207 = local77.anInt328;
								} else {
									local207 = local77.anInt327;
								}
								@Pc(1099) Class4_Sub1_Sub2_Sub3 local1099;
								if (local207 == -1) {
									local1099 = local77.method323(-1, -1, local1079);
								} else {
									@Pc(1105) Class27 local1105 = Class27.aClass27Array1[local207];
									local1099 = local77.method323(local1105.anIntArray95[local77.anInt326], local1105.anIntArray96[local77.anInt326], local1079);
								}
								if (local1099 != null) {
									local1099.method276(local77.anInt351, 0, local77.anInt350, 0, local163, local174);
								}
								Class4_Sub1_Sub1_Sub4.anInt793 = local157;
								Class4_Sub1_Sub1_Sub4.anInt794 = local159;
							} else {
								if (local77.anInt347 == 7) {
									local679 = local77.aClass4_Sub1_Sub1_Sub1_1;
									local159 = 0;
									for (local163 = 0; local163 < local77.anInt357; local163++) {
										for (local174 = 0; local174 < local77.anInt362; local174++) {
											if (local77.anIntArray86[local159] > 0) {
												@Pc(1169) Class24 local1169 = Class24.method315(local77.anIntArray86[local159] - 1);
												@Pc(1173) String local1173 = String.valueOf(local1169.aString3);
												if (local1169.aBoolean108 || local77.anIntArray92[local159] != 1) {
													local1173 = local1173 + " x" + method679(local77.anIntArray92[local159]);
												}
												local209 = local82 + local174 * (local77.anInt364 + 115);
												local216 = local87 + local163 * (local77.anInt355 + 12);
												if (local77.aBoolean114) {
													local679.method45(local77.aBoolean115, local209 + local77.anInt362 / 2, local1173, local216, local77.anInt330);
												} else {
													local679.method52(local209, local216, local77.aBoolean115, local1173, local77.anInt330);
												}
											}
											local159++;
										}
									}
								}
								if (local77.anInt347 == 8 && (this.anInt1011 == local77.anInt334 || this.anInt924 == local77.anInt334 || this.anInt939 == local77.anInt334) && this.anInt845 == 100) {
									local157 = 0;
									local159 = 0;
									@Pc(1287) Class4_Sub1_Sub1_Sub1 local1287 = this.aClass4_Sub1_Sub1_Sub1_3;
									@Pc(1290) String local1290 = local77.aString9;
									while (local1290.length() > 0) {
										local207 = local1290.indexOf("\\n");
										if (local207 == -1) {
											local956 = local1290;
											local1290 = "";
										} else {
											local956 = local1290.substring(0, local207);
											local1290 = local1290.substring(local207 + 2);
										}
										local209 = local1287.method46(local956);
										if (local209 > local157) {
											local157 = local209;
										}
										local159 += local1287.anInt35 + 1;
									}
									local157 += 6;
									local159 += 7;
									local207 = local82 + local77.anInt362 - local157 - 5;
									local209 = local87 + local77.anInt357 + 5;
									if (local207 < local82 + 5) {
										local207 = local82 + 5;
									}
									if (local207 + local157 > arg0 + arg2.anInt362) {
										local207 = arg0 + arg2.anInt362 - local157;
									}
									if (local209 + local159 > arg3 + arg2.anInt357) {
										local209 = arg3 + arg2.anInt357 - local159;
									}
									Class4_Sub1_Sub1.method548(local207, 16777120, local209, local159, this.anInt945, local157);
									Class4_Sub1_Sub1.method549(local157, local159, 0, local207, local209);
									local1290 = local77.aString9;
									local216 = local209 + local1287.anInt35 + 2;
									while (local1290.length() > 0) {
										local241 = local1290.indexOf("\\n");
										if (local241 == -1) {
											local956 = local1290;
											local1290 = "";
										} else {
											local956 = local1290.substring(0, local241);
											local1290 = local1290.substring(local241 + 2);
										}
										local1287.method52(local207 + 3, local216, false, local956, 0);
										local216 += local1287.anInt35 + 1;
									}
								}
							}
						}
					}
				}
				Class4_Sub1_Sub1.method545(local35, local31, local29, local33);
			}
		} catch (@Pc(1484) RuntimeException local1484) {
			signlink.reporterror("63632, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local1484.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method618(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			if (this.anInt1040 > 1) {
				this.anInt1040--;
			}
			if (this.anInt999 > 0) {
				this.anInt999--;
			}
			for (@Pc(26) int local26 = 0; local26 < 5 && this.method615(); local26++) {
			}
			if (this.aBoolean241) {
				@Pc(45) Object local45 = this.aClass9_1.anObject1;
				@Pc(70) int local70;
				@Pc(72) int local72;
				@Pc(74) int local74;
				@Pc(107) int local107;
				synchronized (this.aClass9_1.anObject1) {
					if (!aBoolean228) {
						this.aClass9_1.anInt122 = 0;
					} else if (super.anInt824 != 0 || this.aClass9_1.anInt122 >= 40) {
						this.aClass4_Sub1_Sub3_6.method91(124);
						this.aClass4_Sub1_Sub3_6.method92(0);
						local70 = this.aClass4_Sub1_Sub3_6.anInt101;
						local72 = 0;
						@Pc(90) int local90;
						for (local74 = 0; local74 < this.aClass9_1.anInt122 && local70 - this.aClass4_Sub1_Sub3_6.anInt101 < 240; local74++) {
							local72++;
							local90 = this.aClass9_1.anIntArray18[local74];
							if (local90 < 0) {
								local90 = 0;
							} else if (local90 > 502) {
								local90 = 502;
							}
							local107 = this.aClass9_1.anIntArray19[local74];
							if (local107 < 0) {
								local107 = 0;
							} else if (local107 > 764) {
								local107 = 764;
							}
							@Pc(124) int local124 = local90 * 765 + local107;
							if (this.aClass9_1.anIntArray18[local74] == -1 && this.aClass9_1.anIntArray19[local74] == -1) {
								local107 = -1;
								local90 = -1;
								local124 = 524287;
							}
							if (local107 != this.anInt904 || local90 != this.anInt905) {
								@Pc(169) int local169 = local107 - this.anInt904;
								this.anInt904 = local107;
								@Pc(177) int local177 = local90 - this.anInt905;
								this.anInt905 = local90;
								if (this.anInt949 < 8 && local169 >= -32 && local169 <= 31 && local177 >= -32 && local177 <= 31) {
									local169 += 32;
									local177 += 32;
									this.aClass4_Sub1_Sub3_6.method93((this.anInt949 << 12) + (local169 << 6) + local177);
									this.anInt949 = 0;
								} else if (this.anInt949 < 8) {
									this.aClass4_Sub1_Sub3_6.method95((this.anInt949 << 19) + local124 + 8388608);
									this.anInt949 = 0;
								} else {
									this.aClass4_Sub1_Sub3_6.method96((this.anInt949 << 19) + local124 - 1073741824);
									this.anInt949 = 0;
								}
							} else if (this.anInt949 < 2047) {
								this.anInt949++;
							}
						}
						this.aClass4_Sub1_Sub3_6.method101(this.aClass4_Sub1_Sub3_6.anInt101 - local70);
						if (local72 >= this.aClass9_1.anInt122) {
							this.aClass9_1.anInt122 = 0;
						} else {
							this.aClass9_1.anInt122 -= local72;
							for (local90 = 0; local90 < this.aClass9_1.anInt122; local90++) {
								this.aClass9_1.anIntArray19[local90] = this.aClass9_1.anIntArray19[local90 + local72];
								this.aClass9_1.anIntArray18[local90] = this.aClass9_1.anIntArray18[local90 + local72];
							}
						}
					}
				}
				if (super.anInt824 != 0) {
					@Pc(340) long local340 = (super.aLong28 - this.aLong32) / 50L;
					if (local340 > 4095L) {
						local340 = 4095L;
					}
					this.aLong32 = super.aLong28;
					local70 = super.anInt826;
					if (local70 < 0) {
						local70 = 0;
					} else if (local70 > 502) {
						local70 = 502;
					}
					local72 = super.anInt825;
					if (local72 < 0) {
						local72 = 0;
					} else if (local72 > 764) {
						local72 = 764;
					}
					local74 = local70 * 765 + local72;
					@Pc(386) byte local386 = 0;
					if (super.anInt824 == 2) {
						local386 = 1;
					}
					local107 = (int) local340;
					this.aClass4_Sub1_Sub3_6.method91(144);
					this.aClass4_Sub1_Sub3_6.method136(902, (local107 << 20) + (local386 << 19) + local74);
				}
				if (this.anInt898 > 0) {
					this.anInt898--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean234 = true;
				}
				if (this.aBoolean234 && this.anInt898 <= 0) {
					this.anInt898 = 20;
					this.aBoolean234 = false;
					this.aClass4_Sub1_Sub3_6.method91(29);
					this.aClass4_Sub1_Sub3_6.method128(this.anInt954);
					this.aClass4_Sub1_Sub3_6.method93(this.anInt953);
				}
				if (super.aBoolean218 && !this.aBoolean266) {
					this.aBoolean266 = true;
					this.aClass4_Sub1_Sub3_6.method91(40);
					this.aClass4_Sub1_Sub3_6.method92(1);
				}
				if (!super.aBoolean218 && this.aBoolean266) {
					this.aBoolean266 = false;
					this.aClass4_Sub1_Sub3_6.method91(40);
					this.aClass4_Sub1_Sub3_6.method92(0);
				}
				this.method669();
				this.method695();
				this.method714();
				this.anInt997++;
				if (this.anInt997 > 750) {
					this.method602();
				}
				this.method641(this.aBoolean246);
				this.method624((byte) 3);
				this.method637();
				this.anInt947++;
				if (this.anInt973 != 0) {
					this.anInt972 += 20;
					if (this.anInt972 >= 400) {
						this.anInt973 = 0;
					}
				}
				if (this.anInt1054 != 0) {
					this.anInt1051++;
					if (this.anInt1051 >= 15) {
						if (this.anInt1054 == 2) {
							this.aBoolean255 = true;
						}
						if (this.anInt1054 == 3) {
							this.aBoolean260 = true;
						}
						this.anInt1054 = 0;
					}
				}
				if (this.anInt976 != 0) {
					this.anInt948++;
					if (super.anInt819 > this.anInt977 + 5 || super.anInt819 < this.anInt977 - 5 || super.anInt820 > this.anInt978 + 5 || super.anInt820 < this.anInt978 - 5) {
						this.aBoolean220 = true;
					}
					if (super.anInt818 == 0) {
						if (this.anInt976 == 2) {
							this.aBoolean255 = true;
						}
						if (this.anInt976 == 3) {
							this.aBoolean260 = true;
						}
						this.anInt976 = 0;
						if (this.aBoolean220 && this.anInt948 >= 5) {
							this.anInt984 = -1;
							this.method634();
							if (this.anInt984 == this.anInt974 && this.anInt983 != this.anInt975) {
								@Pc(688) Class26 local688 = Class26.method319(this.anInt974);
								@Pc(690) byte local690 = 0;
								if (this.anInt1026 == 1 && local688.anInt337 == 206) {
									local690 = 1;
								}
								if (local688.anIntArray86[this.anInt983] <= 0) {
									local690 = 0;
								}
								if (local688.aBoolean118) {
									local70 = this.anInt975;
									local72 = this.anInt983;
									local688.anIntArray86[local72] = local688.anIntArray86[local70];
									local688.anIntArray92[local72] = local688.anIntArray92[local70];
									local688.anIntArray86[local70] = -1;
									local688.anIntArray92[local70] = 0;
								} else if (local690 == 1) {
									local70 = this.anInt975;
									local72 = this.anInt983;
									while (local70 != local72) {
										if (local70 > local72) {
											local688.method327(local70, local70 - 1);
											local70--;
										} else if (local70 < local72) {
											local688.method327(local70, local70 + 1);
											local70++;
										}
									}
								} else {
									local688.method327(this.anInt975, this.anInt983);
								}
								this.aClass4_Sub1_Sub3_6.method91(162);
								this.aClass4_Sub1_Sub3_6.method127(this.anInt983);
								this.aClass4_Sub1_Sub3_6.method127(this.anInt974);
								this.aClass4_Sub1_Sub3_6.method127(this.anInt975);
								this.aClass4_Sub1_Sub3_6.method120(local690);
							}
						} else if ((this.anInt935 == 1 || this.method719(this.anInt990 - 1)) && this.anInt990 > 2) {
							this.method603();
						} else if (this.anInt990 > 0) {
							this.method636(this.anInt990 - 1);
						}
						this.anInt1051 = 10;
						super.anInt824 = 0;
					}
				}
				anInt968++;
				@Pc(881) int local881;
				if (anInt968 > 1660) {
					anInt968 = 0;
					this.aClass4_Sub1_Sub3_6.method91(226);
					this.aClass4_Sub1_Sub3_6.method92(0);
					local881 = this.aClass4_Sub1_Sub3_6.anInt101;
					this.aClass4_Sub1_Sub3_6.method93(39982);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass4_Sub1_Sub3_6.method92(167);
					}
					this.aClass4_Sub1_Sub3_6.method92((int) (Math.random() * 256.0D));
					this.aClass4_Sub1_Sub3_6.method93((int) (Math.random() * 65536.0D));
					this.aClass4_Sub1_Sub3_6.method93((int) (Math.random() * 65536.0D));
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass4_Sub1_Sub3_6.method92(156);
					}
					this.aClass4_Sub1_Sub3_6.method92(6);
					this.aClass4_Sub1_Sub3_6.method93((int) (Math.random() * 65536.0D));
					this.aClass4_Sub1_Sub3_6.method92(101);
					this.aClass4_Sub1_Sub3_6.method93(17446);
					this.aClass4_Sub1_Sub3_6.method101(this.aClass4_Sub1_Sub3_6.anInt101 - local881);
				}
				@Pc(959) int local959;
				if (Class45.anInt669 != -1) {
					local881 = Class45.anInt669;
					local959 = Class45.anInt670;
					@Pc(980) boolean local980 = this.method706(local959, 0, 0, 0, 0, aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0], aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0], true, local881, 0, 0);
					Class45.anInt669 = -1;
					if (local980) {
						this.anInt970 = super.anInt825;
						this.anInt971 = super.anInt826;
						this.anInt973 = 1;
						this.anInt972 = 0;
					}
				}
				if (super.anInt824 == 1 && this.aString28 != null) {
					this.aString28 = null;
					this.aBoolean260 = true;
					super.anInt824 = 0;
				}
				this.method708();
				if (this.anInt923 == -1) {
					this.method592(370);
					this.method642(this.aBoolean258);
					this.method648(869);
				}
				if (super.anInt818 == 1 || super.anInt824 == 1) {
					this.anInt903++;
				}
				if (this.anInt1011 == 0 && this.anInt924 == 0 && this.anInt939 == 0) {
					if (this.anInt845 > 0) {
						this.anInt845--;
					}
				} else if (this.anInt845 < 100) {
					this.anInt845++;
					if (this.anInt845 == 100) {
						if (this.anInt1011 != 0) {
							this.aBoolean260 = true;
						}
						if (this.anInt924 != 0) {
							this.aBoolean255 = true;
						}
					}
				}
				if (this.anInt967 == 2) {
					this.method709();
				}
				if (this.anInt967 == 2 && this.aBoolean245) {
					this.method611();
				}
				for (local881 = 0; local881 < 5; local881++) {
					@Pc(1117) int local1117 = this.anIntArray222[local881]++;
				}
				this.method623();
				anInt1057++;
				if (anInt1057 > 99) {
					anInt1057 = 0;
					this.aClass4_Sub1_Sub3_6.method91(252);
				}
				super.anInt817++;
				if (super.anInt817 > 4500) {
					this.anInt999 = 250;
					super.anInt817 -= 500;
					this.aClass4_Sub1_Sub3_6.method91(245);
				}
				this.anInt908++;
				if (this.anInt908 > 500) {
					this.anInt908 = 0;
					local959 = (int) (Math.random() * 8.0D);
					if ((local959 & 0x1) == 1) {
						this.anInt854 += this.anInt855;
					}
					if ((local959 & 0x2) == 2) {
						this.anInt1009 += this.anInt1010;
					}
					if ((local959 & 0x4) == 4) {
						this.anInt957 += this.anInt958;
					}
				}
				if (this.anInt854 < -50) {
					this.anInt855 = 2;
				}
				if (this.anInt854 > 50) {
					this.anInt855 = -2;
				}
				if (this.anInt1009 < -55) {
					this.anInt1010 = 2;
				}
				if (this.anInt1009 > 55) {
					this.anInt1010 = -2;
				}
				if (this.anInt957 < -40) {
					this.anInt958 = 1;
				}
				if (this.anInt957 > 40) {
					this.anInt958 = -1;
				}
				this.anInt922++;
				if (this.anInt922 > 500) {
					this.anInt922 = 0;
					local959 = (int) (Math.random() * 8.0D);
					if ((local959 & 0x1) == 1) {
						this.anInt991 += this.anInt992;
					}
					if ((local959 & 0x2) == 2) {
						this.anInt886 += this.anInt887;
					}
				}
				if (this.anInt991 < -60) {
					this.anInt992 = 2;
				}
				if (this.anInt991 > 60) {
					this.anInt992 = -2;
				}
				if (this.anInt886 < -20) {
					this.anInt887 = 1;
				}
				if (this.anInt886 > 10) {
					this.anInt887 = -1;
				}
				this.anInt998++;
				if (this.anInt998 > 50) {
					this.aClass4_Sub1_Sub3_6.method91(225);
				}
				try {
					if (this.aClass38_1 != null && this.aClass4_Sub1_Sub3_6.anInt101 > 0) {
						this.aClass38_1.method393(this.aClass4_Sub1_Sub3_6.anInt101, this.anInt915, this.aClass4_Sub1_Sub3_6.aByteArray3);
						this.aClass4_Sub1_Sub3_6.anInt101 = 0;
						this.anInt998 = 0;
					}
				} catch (@Pc(1374) IOException local1374) {
					this.method602();
				} catch (@Pc(1379) Exception local1379) {
					this.method680();
				}
			}
		} catch (@Pc(1384) RuntimeException local1384) {
			signlink.reporterror("5775, " + arg0 + ", " + local1384.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)Ljava/net/Socket;")
	public Socket method619(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!PCARWQQC;)Z")
	private boolean method620(@OriginalArg(1) Class26 arg0) {
		try {
			if (arg0.anIntArray88 == null) {
				return false;
			}
			for (@Pc(14) int local14 = 0; local14 < arg0.anIntArray88.length; local14++) {
				@Pc(22) int local22 = this.method710(arg0, local14);
				@Pc(27) int local27 = arg0.anIntArray89[local14];
				if (arg0.anIntArray88[local14] == 2) {
					if (local22 >= local27) {
						return false;
					}
				} else if (arg0.anIntArray88[local14] == 3) {
					if (local22 <= local27) {
						return false;
					}
				} else if (arg0.anIntArray88[local14] == 4) {
					if (local22 == local27) {
						return false;
					}
				} else if (local22 != local27) {
					return false;
				}
			}
			return true;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("60658, " + 7 + ", " + arg0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method621(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 != 0L) {
				if (this.anInt933 >= 100) {
					this.method718("Your ignore list is full. Max of 100 hit", "", 0);
				} else {
					@Pc(23) String local23 = Class36.method382(Class36.method379(arg0), 78);
					for (@Pc(25) int local25 = 0; local25 < this.anInt933; local25++) {
						if (this.aLongArray4[local25] == arg0) {
							this.method718(local23 + " is already on your ignore list", "", 0);
							return;
						}
					}
					for (@Pc(55) int local55 = 0; local55 < this.anInt910; local55++) {
						if (this.aLongArray3[local55] == arg0) {
							this.method718("Please remove " + local23 + " from your friend list first", "", 0);
							return;
						}
					}
					this.aLongArray4[this.anInt933++] = arg0;
					@Pc(99) boolean local99 = false;
					this.aBoolean255 = true;
					this.aClass4_Sub1_Sub3_6.method91(82);
					this.aClass4_Sub1_Sub3_6.method98(arg0, (byte) 7);
				}
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("11325, " + arg0 + ", " + arg1 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method622(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean257) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.method619(43595);
			this.aSocket3.setSoTimeout(10000);
			@Pc(42) InputStream local42 = this.aSocket3.getInputStream();
			@Pc(46) OutputStream local46 = this.aSocket3.getOutputStream();
			local46.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(local42);
		} else if (signlink.mainapp == null) {
			return new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
		} else {
			return signlink.openurl(arg0);
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method623() {
		try {
			while (true) {
				@Pc(11) int local11 = this.method581();
				if (local11 == -1) {
					return;
				}
				if (this.anInt863 != -1 && this.anInt863 == this.anInt1055) {
					if (local11 == 8 && this.aString22.length() > 0) {
						this.aString22 = this.aString22.substring(0, this.aString22.length() - 1);
					}
					if ((local11 >= 97 && local11 <= 122 || local11 >= 65 && local11 <= 90 || local11 >= 48 && local11 <= 57 || local11 == 32) && this.aString22.length() < 12) {
						this.aString22 = this.aString22 + (char) local11;
					}
				} else {
					@Pc(192) int local192;
					if (this.aBoolean248) {
						if (local11 >= 32 && local11 <= 122 && this.aString24.length() < 80) {
							this.aString24 = this.aString24 + (char) local11;
							this.aBoolean260 = true;
						}
						if (local11 == 8 && this.aString24.length() > 0) {
							this.aString24 = this.aString24.substring(0, this.aString24.length() - 1);
							this.aBoolean260 = true;
						}
						if (local11 == 13 || local11 == 10) {
							this.aBoolean248 = false;
							this.aBoolean260 = true;
							@Pc(151) long local151;
							if (this.anInt1022 == 1) {
								local151 = Class36.method378(this.aString24);
								this.method654(local151);
							}
							if (this.anInt1022 == 2 && this.anInt910 > 0) {
								local151 = Class36.method378(this.aString24);
								this.method604(this.aBoolean261, local151);
							}
							if (this.anInt1022 == 3 && this.aString24.length() > 0) {
								this.aClass4_Sub1_Sub3_6.method91(201);
								this.aClass4_Sub1_Sub3_6.method92(0);
								local192 = this.aClass4_Sub1_Sub3_6.anInt101;
								this.aClass4_Sub1_Sub3_6.method98(this.aLong33, (byte) 7);
								Class35.method376(this.aString24, this.aClass4_Sub1_Sub3_6);
								this.aClass4_Sub1_Sub3_6.method101(this.aClass4_Sub1_Sub3_6.anInt101 - local192);
								this.aString24 = Class35.method377(this.aString24);
								this.aString24 = Class10.method157(this.aString24);
								this.method718(this.aString24, Class36.method382(Class36.method379(this.aLong33), 78), 6);
								if (this.anInt1008 == 2) {
									this.anInt1008 = 1;
									this.aBoolean232 = true;
									this.aClass4_Sub1_Sub3_6.method91(206);
									this.aClass4_Sub1_Sub3_6.method92(this.anInt940);
									this.aClass4_Sub1_Sub3_6.method92(this.anInt1008);
									this.aClass4_Sub1_Sub3_6.method92(this.anInt1018);
								}
							}
							if (this.anInt1022 == 4 && this.anInt933 < 100) {
								local151 = Class36.method378(this.aString24);
								this.method621(local151, 731);
							}
							if (this.anInt1022 == 5 && this.anInt933 > 0) {
								local151 = Class36.method378(this.aString24);
								this.method683(local151);
							}
						}
					} else if (this.anInt846 == 1) {
						if (local11 >= 48 && local11 <= 57 && this.aString23.length() < 10) {
							this.aString23 = this.aString23 + (char) local11;
							this.aBoolean260 = true;
						}
						if (local11 == 8 && this.aString23.length() > 0) {
							this.aString23 = this.aString23.substring(0, this.aString23.length() - 1);
							this.aBoolean260 = true;
						}
						if (local11 == 13 || local11 == 10) {
							if (this.aString23.length() > 0) {
								local192 = 0;
								try {
									local192 = Integer.parseInt(this.aString23);
								} catch (@Pc(369) Exception local369) {
								}
								this.aClass4_Sub1_Sub3_6.method91(172);
								this.aClass4_Sub1_Sub3_6.method96(local192);
							}
							this.anInt846 = 0;
							this.aBoolean260 = true;
						}
					} else if (this.anInt846 == 2) {
						if (local11 >= 32 && local11 <= 122 && this.aString23.length() < 12) {
							this.aString23 = this.aString23 + (char) local11;
							this.aBoolean260 = true;
						}
						if (local11 == 8 && this.aString23.length() > 0) {
							this.aString23 = this.aString23.substring(0, this.aString23.length() - 1);
							this.aBoolean260 = true;
						}
						if (local11 == 13 || local11 == 10) {
							if (this.aString23.length() > 0) {
								this.aClass4_Sub1_Sub3_6.method91(3);
								this.aClass4_Sub1_Sub3_6.method98(Class36.method378(this.aString23), (byte) 7);
							}
							this.anInt846 = 0;
							this.aBoolean260 = true;
						}
					} else if (this.anInt846 == 3) {
						if (local11 >= 32 && local11 <= 122 && this.aString23.length() < 40) {
							this.aString23 = this.aString23 + (char) local11;
							this.aBoolean260 = true;
						}
						if (local11 == 8 && this.aString23.length() > 0) {
							this.aString23 = this.aString23.substring(0, this.aString23.length() - 1);
							this.aBoolean260 = true;
						}
					} else if (this.anInt882 == -1 && this.anInt923 == -1) {
						if (local11 >= 32 && local11 <= 122 && this.aString17.length() < 80) {
							this.aString17 = this.aString17 + (char) local11;
							this.aBoolean260 = true;
						}
						if (local11 == 8 && this.aString17.length() > 0) {
							this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
							this.aBoolean260 = true;
						}
						if ((local11 == 13 || local11 == 10) && this.aString17.length() > 0) {
							if (this.anInt877 == 2) {
								if (this.aString17.equals("::clientdrop")) {
									this.method602();
								}
								if (this.aString17.equals("::lag")) {
									this.method652(this.aByte40);
								}
								if (this.aString17.equals("::prefetchmusic")) {
									for (local192 = 0; local192 < this.aClass20_Sub1_1.method285(2); local192++) {
										this.aClass20_Sub1_1.method291(2, (byte) 1, local192);
									}
								}
								if (this.aString17.equals("::fpson")) {
									aBoolean236 = true;
								}
								if (this.aString17.equals("::fpsoff")) {
									aBoolean236 = false;
								}
								if (this.aString17.equals("::noclip")) {
									for (local192 = 0; local192 < 4; local192++) {
										for (@Pc(655) int local655 = 1; local655 < 103; local655++) {
											for (@Pc(659) int local659 = 1; local659 < 103; local659++) {
												this.aClass50Array1[local192].anIntArrayArray18[local655][local659] = 0;
											}
										}
									}
								}
							}
							if (this.aString17.startsWith("::")) {
								this.aClass4_Sub1_Sub3_6.method91(153);
								this.aClass4_Sub1_Sub3_6.method92(this.aString17.length() - 1);
								this.aClass4_Sub1_Sub3_6.method99(this.aString17.substring(2));
							} else {
								@Pc(714) String local714 = this.aString17.toLowerCase();
								@Pc(716) byte local716 = 0;
								if (local714.startsWith("yellow:")) {
									local716 = 0;
									this.aString17 = this.aString17.substring(7);
								} else if (local714.startsWith("red:")) {
									local716 = 1;
									this.aString17 = this.aString17.substring(4);
								} else if (local714.startsWith("green:")) {
									local716 = 2;
									this.aString17 = this.aString17.substring(6);
								} else if (local714.startsWith("cyan:")) {
									local716 = 3;
									this.aString17 = this.aString17.substring(5);
								} else if (local714.startsWith("purple:")) {
									local716 = 4;
									this.aString17 = this.aString17.substring(7);
								} else if (local714.startsWith("white:")) {
									local716 = 5;
									this.aString17 = this.aString17.substring(6);
								} else if (local714.startsWith("flash1:")) {
									local716 = 6;
									this.aString17 = this.aString17.substring(7);
								} else if (local714.startsWith("flash2:")) {
									local716 = 7;
									this.aString17 = this.aString17.substring(7);
								} else if (local714.startsWith("flash3:")) {
									local716 = 8;
									this.aString17 = this.aString17.substring(7);
								} else if (local714.startsWith("glow1:")) {
									local716 = 9;
									this.aString17 = this.aString17.substring(6);
								} else if (local714.startsWith("glow2:")) {
									local716 = 10;
									this.aString17 = this.aString17.substring(6);
								} else if (local714.startsWith("glow3:")) {
									local716 = 11;
									this.aString17 = this.aString17.substring(6);
								}
								local714 = this.aString17.toLowerCase();
								@Pc(888) byte local888 = 0;
								if (local714.startsWith("wave:")) {
									local888 = 1;
									this.aString17 = this.aString17.substring(5);
								} else if (local714.startsWith("wave2:")) {
									local888 = 2;
									this.aString17 = this.aString17.substring(6);
								} else if (local714.startsWith("shake:")) {
									local888 = 3;
									this.aString17 = this.aString17.substring(6);
								} else if (local714.startsWith("scroll:")) {
									local888 = 4;
									this.aString17 = this.aString17.substring(7);
								} else if (local714.startsWith("slide:")) {
									local888 = 5;
									this.aString17 = this.aString17.substring(6);
								}
								this.aClass4_Sub1_Sub3_6.method91(57);
								this.aClass4_Sub1_Sub3_6.method92(0);
								@Pc(969) int local969 = this.aClass4_Sub1_Sub3_6.anInt101;
								this.aClass4_Sub1_Sub3_6.method119(local888);
								this.aClass4_Sub1_Sub3_6.method118(local716);
								this.aClass4_Sub1_Sub3_8.anInt101 = 0;
								Class35.method376(this.aString17, this.aClass4_Sub1_Sub3_8);
								this.aClass4_Sub1_Sub3_6.method140(this.aClass4_Sub1_Sub3_8.anInt101, this.aClass4_Sub1_Sub3_8.aByteArray3);
								this.aClass4_Sub1_Sub3_6.method101(this.aClass4_Sub1_Sub3_6.anInt101 - local969);
								this.aString17 = Class35.method377(this.aString17);
								this.aString17 = Class10.method157(this.aString17);
								aClass4_Sub1_Sub2_Sub5_Sub2_1.aString15 = this.aString17;
								aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt721 = local716;
								aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt729 = local888;
								aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt732 = 150;
								if (this.anInt877 == 2) {
									this.method718(aClass4_Sub1_Sub2_Sub5_Sub2_1.aString15, "@cr2@" + aClass4_Sub1_Sub2_Sub5_Sub2_1.aString16, 2);
								} else if (this.anInt877 == 1) {
									this.method718(aClass4_Sub1_Sub2_Sub5_Sub2_1.aString15, "@cr1@" + aClass4_Sub1_Sub2_Sub5_Sub2_1.aString16, 2);
								} else {
									this.method718(aClass4_Sub1_Sub2_Sub5_Sub2_1.aString15, aClass4_Sub1_Sub2_Sub5_Sub2_1.aString16, 2);
								}
								if (this.anInt940 == 2) {
									this.anInt940 = 3;
									this.aBoolean232 = true;
									this.aClass4_Sub1_Sub3_6.method91(206);
									this.aClass4_Sub1_Sub3_6.method92(this.anInt940);
									this.aClass4_Sub1_Sub3_6.method92(this.anInt1008);
									this.aClass4_Sub1_Sub3_6.method92(this.anInt1018);
								}
							}
							this.aString17 = "";
							this.aBoolean260 = true;
						}
					}
				}
			}
		} catch (@Pc(1122) RuntimeException local1122) {
			signlink.reporterror("69534, " + 12942 + ", " + local1122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method624(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			for (@Pc(16) int local16 = 0; local16 < this.anInt1013; local16++) {
				@Pc(23) int local23 = this.anIntArray266[local16];
				@Pc(28) Class4_Sub1_Sub2_Sub5_Sub1 local28 = this.aClass4_Sub1_Sub2_Sub5_Sub1Array1[local23];
				if (local28 != null) {
					this.method625(local28.aClass33_1.aByte25, local28);
				}
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("64274, " + arg0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!QQSLPTGQ;)V")
	private void method625(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub1_Sub2_Sub5 arg1) {
		try {
			if (arg1.anInt694 < 128 || arg1.anInt695 < 128 || arg1.anInt694 >= 13184 || arg1.anInt695 >= 13184) {
				arg1.anInt715 = -1;
				arg1.anInt689 = -1;
				arg1.anInt701 = 0;
				arg1.anInt702 = 0;
				arg1.anInt694 = arg1.anIntArray174[0] * 128 + arg1.anInt706 * 64;
				arg1.anInt695 = arg1.anIntArray175[0] * 128 + arg1.anInt706 * 64;
				arg1.method495();
			}
			if (arg1 == aClass4_Sub1_Sub2_Sub5_Sub2_1 && (arg1.anInt694 < 1536 || arg1.anInt695 < 1536 || arg1.anInt694 >= 11776 || arg1.anInt695 >= 11776)) {
				arg1.anInt715 = -1;
				arg1.anInt689 = -1;
				arg1.anInt701 = 0;
				arg1.anInt702 = 0;
				arg1.anInt694 = arg1.anIntArray174[0] * 128 + arg1.anInt706 * 64;
				arg1.anInt695 = arg1.anIntArray175[0] * 128 + arg1.anInt706 * 64;
				arg1.method495();
			}
			if (arg1.anInt701 > anInt927) {
				this.method626(arg1);
			} else if (arg1.anInt702 >= anInt927) {
				this.method627(arg1);
			} else {
				this.method628(arg1);
			}
			this.method629(arg1);
			this.method630(arg1, 440);
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("51419, " + 45950 + ", " + arg0 + ", " + arg1 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!QQSLPTGQ;Z)V")
	private void method626(@OriginalArg(0) Class4_Sub1_Sub2_Sub5 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt701 - anInt927;
			this.aBoolean241 &= true;
			@Pc(20) int local20 = arg0.anInt697 * 128 + arg0.anInt706 * 64;
			@Pc(30) int local30 = arg0.anInt699 * 128 + arg0.anInt706 * 64;
			arg0.anInt694 += (local20 - arg0.anInt694) / local4;
			arg0.anInt695 += (local30 - arg0.anInt695) / local4;
			arg0.anInt722 = 0;
			if (arg0.anInt703 == 0) {
				arg0.anInt733 = 1024;
			}
			if (arg0.anInt703 == 1) {
				arg0.anInt733 = 1536;
			}
			if (arg0.anInt703 == 2) {
				arg0.anInt733 = 0;
			}
			if (arg0.anInt703 == 3) {
				arg0.anInt733 = 512;
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("3950, " + arg0 + ", " + true + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!QQSLPTGQ;Z)V")
	private void method627(@OriginalArg(0) Class4_Sub1_Sub2_Sub5 arg0) {
		try {
			if (arg0.anInt702 == anInt927 || arg0.anInt715 == -1 || arg0.anInt718 != 0 || arg0.anInt717 + 1 > Class27.aClass27Array1[arg0.anInt715].method330(arg0.anInt716)) {
				@Pc(29) int local29 = arg0.anInt702 - arg0.anInt701;
				@Pc(34) int local34 = anInt927 - arg0.anInt701;
				@Pc(44) int local44 = arg0.anInt697 * 128 + arg0.anInt706 * 64;
				@Pc(54) int local54 = arg0.anInt699 * 128 + arg0.anInt706 * 64;
				@Pc(64) int local64 = arg0.anInt698 * 128 + arg0.anInt706 * 64;
				@Pc(74) int local74 = arg0.anInt700 * 128 + arg0.anInt706 * 64;
				arg0.anInt694 = (local44 * (local29 - local34) + local64 * local34) / local29;
				arg0.anInt695 = (local54 * (local29 - local34) + local74 * local34) / local29;
			}
			arg0.anInt722 = 0;
			if (arg0.anInt703 == 0) {
				arg0.anInt733 = 1024;
			}
			if (arg0.anInt703 == 1) {
				arg0.anInt733 = 1536;
			}
			if (arg0.anInt703 == 2) {
				arg0.anInt733 = 0;
			}
			if (arg0.anInt703 == 3) {
				arg0.anInt733 = 512;
			}
			arg0.anInt696 = arg0.anInt733;
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("45778, " + arg0 + ", " + false + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!QQSLPTGQ;I)V")
	private void method628(@OriginalArg(0) Class4_Sub1_Sub2_Sub5 arg0) {
		try {
			arg0.anInt712 = arg0.anInt724;
			if (arg0.anInt737 == 0) {
				arg0.anInt722 = 0;
			} else {
				if (arg0.anInt715 != -1 && arg0.anInt718 == 0) {
					@Pc(24) Class27 local24 = Class27.aClass27Array1[arg0.anInt715];
					if (arg0.anInt705 > 0 && local24.anInt372 == 0) {
						arg0.anInt722++;
						return;
					}
					if (arg0.anInt705 <= 0 && local24.anInt373 == 0) {
						arg0.anInt722++;
						return;
					}
				}
				@Pc(53) int local53 = arg0.anInt694;
				@Pc(56) int local56 = arg0.anInt695;
				if (this.anInt878 != -30605) {
					this.anInt996 = -1;
				}
				@Pc(78) int local78 = arg0.anIntArray174[arg0.anInt737 - 1] * 128 + arg0.anInt706 * 64;
				@Pc(93) int local93 = arg0.anIntArray175[arg0.anInt737 - 1] * 128 + arg0.anInt706 * 64;
				if (local78 - local53 <= 256 && local78 - local53 >= -256 && local93 - local56 <= 256 && local93 - local56 >= -256) {
					if (local53 < local78) {
						if (local56 < local93) {
							arg0.anInt733 = 1280;
						} else if (local56 > local93) {
							arg0.anInt733 = 1792;
						} else {
							arg0.anInt733 = 1536;
						}
					} else if (local53 > local78) {
						if (local56 < local93) {
							arg0.anInt733 = 768;
						} else if (local56 > local93) {
							arg0.anInt733 = 256;
						} else {
							arg0.anInt733 = 512;
						}
					} else if (local56 < local93) {
						arg0.anInt733 = 1024;
					} else {
						arg0.anInt733 = 0;
					}
					@Pc(187) int local187 = arg0.anInt733 - arg0.anInt696 & 0x7FF;
					if (local187 > 1024) {
						local187 -= 2048;
					}
					@Pc(194) int local194 = arg0.anInt708;
					if (local187 >= -256 && local187 <= 256) {
						local194 = arg0.anInt707;
					} else if (local187 >= 256 && local187 < 768) {
						local194 = arg0.anInt710;
					} else if (local187 >= -768 && local187 <= -256) {
						local194 = arg0.anInt709;
					}
					if (local194 == -1) {
						local194 = arg0.anInt707;
					}
					arg0.anInt712 = local194;
					@Pc(236) int local236 = 4;
					if (arg0.anInt696 != arg0.anInt733 && arg0.anInt720 == -1 && arg0.anInt730 != 0) {
						local236 = 2;
					}
					if (arg0.anInt737 > 2) {
						local236 = 6;
					}
					if (arg0.anInt737 > 3) {
						local236 = 8;
					}
					if (arg0.anInt722 > 0 && arg0.anInt737 > 1) {
						local236 = 8;
						arg0.anInt722--;
					}
					if (arg0.aBooleanArray9[arg0.anInt737 - 1]) {
						local236 <<= 0x1;
					}
					if (local236 >= 8 && arg0.anInt712 == arg0.anInt707 && arg0.anInt726 != -1) {
						arg0.anInt712 = arg0.anInt726;
					}
					if (local53 < local78) {
						arg0.anInt694 += local236;
						if (arg0.anInt694 > local78) {
							arg0.anInt694 = local78;
						}
					} else if (local53 > local78) {
						arg0.anInt694 -= local236;
						if (arg0.anInt694 < local78) {
							arg0.anInt694 = local78;
						}
					}
					if (local56 < local93) {
						arg0.anInt695 += local236;
						if (arg0.anInt695 > local93) {
							arg0.anInt695 = local93;
						}
					} else if (local56 > local93) {
						arg0.anInt695 -= local236;
						if (arg0.anInt695 < local93) {
							arg0.anInt695 = local93;
						}
					}
					if (arg0.anInt694 == local78 && arg0.anInt695 == local93) {
						arg0.anInt737--;
						if (arg0.anInt705 > 0) {
							arg0.anInt705--;
							return;
						}
					}
				} else {
					arg0.anInt694 = local78;
					arg0.anInt695 = local93;
				}
			}
		} catch (@Pc(398) RuntimeException local398) {
			signlink.reporterror("47628, " + arg0 + ", " + -30605 + ", " + local398.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!QQSLPTGQ;)V")
	private void method629(@OriginalArg(1) Class4_Sub1_Sub2_Sub5 arg0) {
		try {
			if (arg0.anInt730 != 0) {
				@Pc(34) int local34;
				@Pc(40) int local40;
				if (arg0.anInt720 != -1 && arg0.anInt720 < 32768) {
					@Pc(26) Class4_Sub1_Sub2_Sub5_Sub1 local26 = this.aClass4_Sub1_Sub2_Sub5_Sub1Array1[arg0.anInt720];
					if (local26 != null) {
						local34 = arg0.anInt694 - local26.anInt694;
						local40 = arg0.anInt695 - local26.anInt695;
						if (local34 != 0 || local40 != 0) {
							arg0.anInt733 = (int) (Math.atan2((double) local34, (double) local40) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(65) int local65;
				if (arg0.anInt720 >= 32768) {
					local65 = arg0.anInt720 - 32768;
					if (local65 == this.anInt982) {
						local65 = this.anInt1042;
					}
					@Pc(77) Class4_Sub1_Sub2_Sub5_Sub2 local77 = this.aClass4_Sub1_Sub2_Sub5_Sub2Array1[local65];
					if (local77 != null) {
						local40 = arg0.anInt694 - local77.anInt694;
						@Pc(91) int local91 = arg0.anInt695 - local77.anInt695;
						if (local40 != 0 || local91 != 0) {
							arg0.anInt733 = (int) (Math.atan2((double) local40, (double) local91) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt727 != 0 || arg0.anInt728 != 0) && (arg0.anInt737 == 0 || arg0.anInt722 > 0)) {
					local65 = arg0.anInt694 - (arg0.anInt727 - this.anInt838 - this.anInt838) * 64;
					local34 = arg0.anInt695 - (arg0.anInt728 - this.anInt839 - this.anInt839) * 64;
					if (local65 != 0 || local34 != 0) {
						arg0.anInt733 = (int) (Math.atan2((double) local65, (double) local34) * 325.949D) & 0x7FF;
					}
					arg0.anInt727 = 0;
					arg0.anInt728 = 0;
				}
				local65 = arg0.anInt733 - arg0.anInt696 & 0x7FF;
				if (local65 != 0) {
					if (local65 < arg0.anInt730 || local65 > 2048 - arg0.anInt730) {
						arg0.anInt696 = arg0.anInt733;
					} else if (local65 > 1024) {
						arg0.anInt696 -= arg0.anInt730;
					} else {
						arg0.anInt696 += arg0.anInt730;
					}
					arg0.anInt696 &= 0x7FF;
					if (arg0.anInt712 == arg0.anInt724 && arg0.anInt696 != arg0.anInt733) {
						if (arg0.anInt725 != -1) {
							arg0.anInt712 = arg0.anInt725;
							return;
						}
						arg0.anInt712 = arg0.anInt707;
						return;
					}
				}
			}
		} catch (@Pc(245) RuntimeException local245) {
			signlink.reporterror("43217, " + 2 + ", " + arg0 + ", " + local245.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!QQSLPTGQ;I)V")
	private void method630(@OriginalArg(0) Class4_Sub1_Sub2_Sub5 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			arg0.aBoolean187 = false;
			@Pc(15) Class27 local15;
			if (arg0.anInt712 != -1) {
				local15 = Class27.aClass27Array1[arg0.anInt712];
				arg0.anInt714++;
				if (arg0.anInt713 < local15.anInt366 && arg0.anInt714 > local15.method330(arg0.anInt713)) {
					arg0.anInt714 = 1;
					arg0.anInt713++;
				}
				if (arg0.anInt713 >= local15.anInt366) {
					arg0.anInt714 = 1;
					arg0.anInt713 = 0;
				}
			}
			if (arg0.anInt689 != -1 && anInt927 >= arg0.anInt692) {
				if (arg0.anInt690 < 0) {
					arg0.anInt690 = 0;
				}
				local15 = Class16.aClass16Array1[arg0.anInt689].aClass27_2;
				arg0.anInt691++;
				if (arg0.anInt690 < local15.anInt366 && arg0.anInt691 > local15.method330(arg0.anInt690)) {
					arg0.anInt691 = 1;
					arg0.anInt690++;
				}
				if (arg0.anInt690 >= local15.anInt366 && (arg0.anInt690 < 0 || arg0.anInt690 >= local15.anInt366)) {
					arg0.anInt689 = -1;
				}
			}
			if (arg0.anInt715 != -1 && arg0.anInt718 <= 1) {
				local15 = Class27.aClass27Array1[arg0.anInt715];
				if (local15.anInt372 == 1 && arg0.anInt705 > 0 && arg0.anInt701 <= anInt927 && arg0.anInt702 < anInt927) {
					arg0.anInt718 = 1;
					return;
				}
			}
			if (arg0.anInt715 != -1 && arg0.anInt718 == 0) {
				local15 = Class27.aClass27Array1[arg0.anInt715];
				arg0.anInt717++;
				if (arg0.anInt716 < local15.anInt366 && arg0.anInt717 > local15.method330(arg0.anInt716)) {
					arg0.anInt717 = 1;
					arg0.anInt716++;
				}
				if (arg0.anInt716 >= local15.anInt366) {
					arg0.anInt716 -= local15.anInt367;
					arg0.anInt719++;
					if (arg0.anInt719 >= local15.anInt371) {
						arg0.anInt715 = -1;
					}
					if (arg0.anInt716 < 0 || arg0.anInt716 >= local15.anInt366) {
						arg0.anInt715 = -1;
					}
				}
				arg0.aBoolean187 = local15.aBoolean124;
			}
			if (arg0.anInt718 > 0) {
				arg0.anInt718--;
			}
		} catch (@Pc(242) RuntimeException local242) {
			signlink.reporterror("3535, " + arg0 + ", " + arg1 + ", " + local242.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method631(@OriginalArg(0) byte arg0) {
		try {
			if (this.anInt923 == -1 || this.anInt967 != 2 && super.aClass13_2 == null) {
				if (this.aBoolean239) {
					this.method723();
					this.aBoolean239 = false;
					this.aClass13_3.method188(4, super.aGraphics2, 0);
					this.aClass13_4.method188(357, super.aGraphics2, 0);
					this.aClass13_5.method188(4, super.aGraphics2, 722);
					this.aClass13_6.method188(205, super.aGraphics2, 743);
					this.aClass13_7.method188(0, super.aGraphics2, 0);
					this.aClass13_8.method188(4, super.aGraphics2, 516);
					this.aClass13_9.method188(205, super.aGraphics2, 516);
					this.aClass13_10.method188(357, super.aGraphics2, 496);
					this.aClass13_11.method188(338, super.aGraphics2, 0);
					this.aBoolean255 = true;
					this.aBoolean260 = true;
					this.aBoolean233 = true;
					this.aBoolean232 = true;
					if (this.anInt967 != 2) {
						this.aClass13_26.method188(4, super.aGraphics2, 4);
						this.aClass13_25.method188(4, super.aGraphics2, 550);
					}
				}
				if (this.anInt967 == 2) {
					this.method595();
				}
				if (this.aBoolean237 && this.anInt891 == 1) {
					this.aBoolean255 = true;
				}
				@Pc(279) boolean local279;
				if (this.anInt1032 != -1) {
					local279 = this.method609(this.anInt1032, this.anInt947);
					if (local279) {
						this.aBoolean255 = true;
					}
				}
				if (this.anInt1054 == 2) {
					this.aBoolean255 = true;
				}
				if (this.anInt976 == 2) {
					this.aBoolean255 = true;
				}
				if (this.aBoolean255) {
					this.method672(10);
					this.aBoolean255 = false;
				}
				@Pc(364) int local364;
				if (this.anInt882 == -1 && this.anInt846 == 0) {
					this.aClass26_1.anInt339 = this.anInt988 - this.anInt899 - 77;
					if (super.anInt819 > 448 && super.anInt819 < 560 && super.anInt820 > 332) {
						this.method594(-1, 463, this.aClass26_1, 0, 77, this.anInt988, super.anInt819 - 17, super.anInt820 - 357);
					}
					local364 = this.anInt988 - this.aClass26_1.anInt339 - 77;
					if (local364 < 0) {
						local364 = 0;
					}
					if (local364 > this.anInt988 - 77) {
						local364 = this.anInt988 - 77;
					}
					if (this.anInt899 != local364) {
						this.anInt899 = local364;
						this.aBoolean260 = true;
					}
				}
				if (this.anInt882 == -1 && this.anInt846 == 3) {
					local364 = this.anInt942 * 14 + 7;
					this.aClass26_1.anInt339 = this.anInt943;
					if (super.anInt819 > 448 && super.anInt819 < 560 && super.anInt820 > 332) {
						this.method594(-1, 463, this.aClass26_1, 0, 77, local364, super.anInt819 - 17, super.anInt820 - 357);
					}
					@Pc(443) int local443 = this.aClass26_1.anInt339;
					if (local443 < 0) {
						local443 = 0;
					}
					if (local443 > local364 - 77) {
						local443 = local364 - 77;
					}
					if (this.anInt943 != local443) {
						this.anInt943 = local443;
						this.aBoolean260 = true;
					}
				}
				if (this.anInt882 != -1) {
					local279 = this.method609(this.anInt882, this.anInt947);
					if (local279) {
						this.aBoolean260 = true;
					}
				}
				if (this.anInt1054 == 3) {
					this.aBoolean260 = true;
				}
				if (this.anInt976 == 3) {
					this.aBoolean260 = true;
				}
				if (this.aString28 != null) {
					this.aBoolean260 = true;
				}
				if (this.aBoolean237 && this.anInt891 == 2) {
					this.aBoolean260 = true;
				}
				if (this.aBoolean260) {
					this.method690(this.aBoolean250);
					this.aBoolean260 = false;
				}
				if (this.anInt967 == 2) {
					this.method610();
					this.aClass13_25.method188(4, super.aGraphics2, 550);
				}
				if (this.anInt909 != -1) {
					this.aBoolean233 = true;
				}
				if (this.aBoolean233) {
					if (this.anInt909 != -1 && this.anInt909 == this.anInt937) {
						this.anInt909 = -1;
						this.aClass4_Sub1_Sub3_6.method91(19);
						this.aClass4_Sub1_Sub3_6.method92(this.anInt937);
					}
					this.aBoolean233 = false;
					this.aClass13_23.method187();
					this.aClass4_Sub1_Sub1_Sub2_3.method211(233, 0, 0);
					if (this.anInt1032 == -1) {
						if (this.anIntArray265[this.anInt937] != -1) {
							if (this.anInt937 == 0) {
								this.aClass4_Sub1_Sub1_Sub2_13.method211(233, 22, 10);
							}
							if (this.anInt937 == 1) {
								this.aClass4_Sub1_Sub1_Sub2_14.method211(233, 54, 8);
							}
							if (this.anInt937 == 2) {
								this.aClass4_Sub1_Sub1_Sub2_14.method211(233, 82, 8);
							}
							if (this.anInt937 == 3) {
								this.aClass4_Sub1_Sub1_Sub2_15.method211(233, 110, 8);
							}
							if (this.anInt937 == 4) {
								this.aClass4_Sub1_Sub1_Sub2_17.method211(233, 153, 8);
							}
							if (this.anInt937 == 5) {
								this.aClass4_Sub1_Sub1_Sub2_17.method211(233, 181, 8);
							}
							if (this.anInt937 == 6) {
								this.aClass4_Sub1_Sub1_Sub2_16.method211(233, 209, 9);
							}
						}
						if (this.anIntArray265[0] != -1 && (this.anInt909 != 0 || anInt927 % 20 < 10)) {
							this.aClass4_Sub1_Sub1_Sub2Array2[0].method211(233, 29, 13);
						}
						if (this.anIntArray265[1] != -1 && (this.anInt909 != 1 || anInt927 % 20 < 10)) {
							this.aClass4_Sub1_Sub1_Sub2Array2[1].method211(233, 53, 11);
						}
						if (this.anIntArray265[2] != -1 && (this.anInt909 != 2 || anInt927 % 20 < 10)) {
							this.aClass4_Sub1_Sub1_Sub2Array2[2].method211(233, 82, 11);
						}
						if (this.anIntArray265[3] != -1 && (this.anInt909 != 3 || anInt927 % 20 < 10)) {
							this.aClass4_Sub1_Sub1_Sub2Array2[3].method211(233, 115, 12);
						}
						if (this.anIntArray265[4] != -1 && (this.anInt909 != 4 || anInt927 % 20 < 10)) {
							this.aClass4_Sub1_Sub1_Sub2Array2[4].method211(233, 153, 13);
						}
						if (this.anIntArray265[5] != -1 && (this.anInt909 != 5 || anInt927 % 20 < 10)) {
							this.aClass4_Sub1_Sub1_Sub2Array2[5].method211(233, 180, 11);
						}
						if (this.anIntArray265[6] != -1 && (this.anInt909 != 6 || anInt927 % 20 < 10)) {
							this.aClass4_Sub1_Sub1_Sub2Array2[6].method211(233, 208, 13);
						}
					}
					this.aClass13_23.method188(160, super.aGraphics2, 516);
					this.aClass13_22.method187();
					this.aClass4_Sub1_Sub1_Sub2_2.method211(233, 0, 0);
					if (this.anInt1032 == -1) {
						if (this.anIntArray265[this.anInt937] != -1) {
							if (this.anInt937 == 7) {
								this.aClass4_Sub1_Sub1_Sub2_4.method211(233, 42, 0);
							}
							if (this.anInt937 == 8) {
								this.aClass4_Sub1_Sub1_Sub2_5.method211(233, 74, 0);
							}
							if (this.anInt937 == 9) {
								this.aClass4_Sub1_Sub1_Sub2_5.method211(233, 102, 0);
							}
							if (this.anInt937 == 10) {
								this.aClass4_Sub1_Sub1_Sub2_6.method211(233, 130, 1);
							}
							if (this.anInt937 == 11) {
								this.aClass4_Sub1_Sub1_Sub2_8.method211(233, 173, 0);
							}
							if (this.anInt937 == 12) {
								this.aClass4_Sub1_Sub1_Sub2_8.method211(233, 201, 0);
							}
							if (this.anInt937 == 13) {
								this.aClass4_Sub1_Sub1_Sub2_7.method211(233, 229, 0);
							}
						}
						if (this.anIntArray265[8] != -1 && (this.anInt909 != 8 || anInt927 % 20 < 10)) {
							this.aClass4_Sub1_Sub1_Sub2Array2[7].method211(233, 74, 2);
						}
						if (this.anIntArray265[9] != -1 && (this.anInt909 != 9 || anInt927 % 20 < 10)) {
							this.aClass4_Sub1_Sub1_Sub2Array2[8].method211(233, 102, 3);
						}
						if (this.anIntArray265[10] != -1 && (this.anInt909 != 10 || anInt927 % 20 < 10)) {
							this.aClass4_Sub1_Sub1_Sub2Array2[9].method211(233, 137, 4);
						}
						if (this.anIntArray265[11] != -1 && (this.anInt909 != 11 || anInt927 % 20 < 10)) {
							this.aClass4_Sub1_Sub1_Sub2Array2[10].method211(233, 174, 2);
						}
						if (this.anIntArray265[12] != -1 && (this.anInt909 != 12 || anInt927 % 20 < 10)) {
							this.aClass4_Sub1_Sub1_Sub2Array2[11].method211(233, 201, 2);
						}
						if (this.anIntArray265[13] != -1 && (this.anInt909 != 13 || anInt927 % 20 < 10)) {
							this.aClass4_Sub1_Sub1_Sub2Array2[12].method211(233, 226, 2);
						}
					}
					this.aClass13_22.method188(466, super.aGraphics2, 496);
					this.aClass13_26.method187();
					Class4_Sub1_Sub1_Sub4.anIntArray206 = this.anIntArray254;
				}
				if (this.aBoolean232) {
					this.aBoolean232 = false;
					this.aClass13_21.method187();
					this.aClass4_Sub1_Sub1_Sub2_1.method211(233, 0, 0);
					this.aClass4_Sub1_Sub1_Sub1_3.method45(true, 55, "Public chat", 28, 16777215);
					if (this.anInt940 == 0) {
						this.aClass4_Sub1_Sub1_Sub1_3.method45(true, 55, "On", 41, 65280);
					}
					if (this.anInt940 == 1) {
						this.aClass4_Sub1_Sub1_Sub1_3.method45(true, 55, "Friends", 41, 16776960);
					}
					if (this.anInt940 == 2) {
						this.aClass4_Sub1_Sub1_Sub1_3.method45(true, 55, "Off", 41, 16711680);
					}
					if (this.anInt940 == 3) {
						this.aClass4_Sub1_Sub1_Sub1_3.method45(true, 55, "Hide", 41, 65535);
					}
					this.aClass4_Sub1_Sub1_Sub1_3.method45(true, 184, "Private chat", 28, 16777215);
					if (this.anInt1008 == 0) {
						this.aClass4_Sub1_Sub1_Sub1_3.method45(true, 184, "On", 41, 65280);
					}
					if (this.anInt1008 == 1) {
						this.aClass4_Sub1_Sub1_Sub1_3.method45(true, 184, "Friends", 41, 16776960);
					}
					if (this.anInt1008 == 2) {
						this.aClass4_Sub1_Sub1_Sub1_3.method45(true, 184, "Off", 41, 16711680);
					}
					this.aClass4_Sub1_Sub1_Sub1_3.method45(true, 324, "Trade/compete", 28, 16777215);
					if (this.anInt1018 == 0) {
						this.aClass4_Sub1_Sub1_Sub1_3.method45(true, 324, "On", 41, 65280);
					}
					if (this.anInt1018 == 1) {
						this.aClass4_Sub1_Sub1_Sub1_3.method45(true, 324, "Friends", 41, 16776960);
					}
					if (this.anInt1018 == 2) {
						this.aClass4_Sub1_Sub1_Sub1_3.method45(true, 324, "Off", 41, 16711680);
					}
					this.aClass4_Sub1_Sub1_Sub1_3.method45(true, 458, "Report abuse", 33, 16777215);
					this.aClass13_21.method188(453, super.aGraphics2, 0);
					this.aClass13_26.method187();
					Class4_Sub1_Sub1_Sub4.anIntArray206 = this.anIntArray254;
				}
				this.anInt947 = 0;
				@Pc(1277) boolean local1277 = false;
			} else {
				if (this.anInt967 == 2) {
					this.method609(this.anInt923, this.anInt947);
					if (this.anInt1031 != -1) {
						this.method609(this.anInt1031, this.anInt947);
					}
					this.anInt947 = 0;
					this.method655(427);
					super.aClass13_2.method187();
					Class4_Sub1_Sub1_Sub4.anIntArray206 = this.anIntArray255;
					Class4_Sub1_Sub1.method546();
					this.aBoolean239 = true;
					@Pc(58) Class26 local58 = Class26.method319(this.anInt923);
					if (local58.anInt362 == 512 && local58.anInt357 == 334 && local58.anInt347 == 0) {
						local58.anInt362 = 765;
						local58.anInt357 = 503;
					}
					this.method617(0, 0, local58, 0);
					if (this.anInt1031 != -1) {
						local58 = Class26.method319(this.anInt1031);
						if (local58.anInt362 == 512 && local58.anInt357 == 334 && local58.anInt347 == 0) {
							local58.anInt362 = 765;
							local58.anInt357 = 503;
						}
						this.method617(0, 0, local58, 0);
					}
					if (this.aBoolean237) {
						this.method657();
					} else {
						this.method634();
						this.method653();
					}
				}
				super.aClass13_2.method188(0, super.aGraphics2, 0);
			}
		} catch (@Pc(1287) RuntimeException local1287) {
			signlink.reporterror("84640, " + arg0 + ", " + local1287.toString());
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
				return new URL("http://127.0.0.1:" + (anInt853 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method634() {
		try {
			if (this.anInt976 == 0) {
				this.aStringArray8[0] = "Cancel";
				this.anIntArray229[0] = 1290;
				this.anInt990 = 1;
				if (this.anInt923 == -1) {
					this.method685();
					this.anInt1024 = 0;
					this.anInt1019 = 0;
					if (super.anInt819 > 4 && super.anInt820 > 4 && super.anInt819 < 516 && super.anInt820 < 338) {
						if (this.anInt863 == -1) {
							this.method635();
						} else {
							this.method703(4, Class26.method319(this.anInt863), 0, (byte) 1, super.anInt819, super.anInt820, 0, 4);
						}
					}
					if (this.anInt1024 != this.anInt1005) {
						this.anInt1005 = this.anInt1024;
					}
					if (this.anInt1019 != this.anInt939) {
						this.anInt939 = this.anInt1019;
					}
					this.anInt1024 = 0;
					this.anInt1019 = 0;
					if (super.anInt819 > 553 && super.anInt820 > 205 && super.anInt819 < 743 && super.anInt820 < 466) {
						if (this.anInt1032 != -1) {
							this.method703(553, Class26.method319(this.anInt1032), 1, (byte) 1, super.anInt819, super.anInt820, 0, 205);
						} else if (this.anIntArray265[this.anInt937] != -1) {
							this.method703(553, Class26.method319(this.anIntArray265[this.anInt937]), 1, (byte) 1, super.anInt819, super.anInt820, 0, 205);
						}
					}
					if (this.anInt1024 != this.anInt914) {
						this.aBoolean255 = true;
						this.anInt914 = this.anInt1024;
					}
					if (this.anInt1019 != this.anInt924) {
						this.aBoolean255 = true;
						this.anInt924 = this.anInt1019;
					}
					this.anInt1024 = 0;
					this.anInt1019 = 0;
					if (super.anInt819 > 17 && super.anInt820 > 357 && super.anInt819 < 496 && super.anInt820 < 453) {
						if (this.anInt882 != -1) {
							this.method703(17, Class26.method319(this.anInt882), 2, (byte) 1, super.anInt819, super.anInt820, 0, 357);
						} else if (this.anInt888 != -1) {
							this.method703(17, Class26.method319(this.anInt888), 3, (byte) 1, super.anInt819, super.anInt820, 0, 357);
						} else if (super.anInt820 < 434 && super.anInt819 < 426 && this.anInt846 == 0) {
							this.method660((byte) 9, super.anInt820 - 357, super.anInt819 - 17);
						}
					}
					if ((this.anInt882 != -1 || this.anInt888 != -1) && this.anInt1024 != this.anInt889) {
						this.aBoolean260 = true;
						this.anInt889 = this.anInt1024;
					}
					if ((this.anInt882 != -1 || this.anInt888 != -1) && this.anInt1019 != this.anInt1011) {
						this.aBoolean260 = true;
						this.anInt1011 = this.anInt1019;
					}
					@Pc(343) boolean local343 = false;
					while (!local343) {
						local343 = true;
						for (@Pc(354) int local354 = 0; local354 < this.anInt990 - 1; local354++) {
							if (this.anIntArray229[local354] < 1000 && this.anIntArray229[local354 + 1] > 1000) {
								@Pc(375) String local375 = this.aStringArray8[local354];
								this.aStringArray8[local354] = this.aStringArray8[local354 + 1];
								this.aStringArray8[local354 + 1] = local375;
								@Pc(397) int local397 = this.anIntArray229[local354];
								this.anIntArray229[local354] = this.anIntArray229[local354 + 1];
								this.anIntArray229[local354 + 1] = local397;
								@Pc(419) int local419 = this.anIntArray227[local354];
								this.anIntArray227[local354] = this.anIntArray227[local354 + 1];
								this.anIntArray227[local354 + 1] = local419;
								@Pc(441) int local441 = this.anIntArray228[local354];
								this.anIntArray228[local354] = this.anIntArray228[local354 + 1];
								this.anIntArray228[local354 + 1] = local441;
								@Pc(463) int local463 = this.anIntArray230[local354];
								this.anIntArray230[local354] = this.anIntArray230[local354 + 1];
								this.anIntArray230[local354 + 1] = local463;
								local343 = false;
							}
						}
					}
				} else {
					this.anInt1024 = 0;
					this.anInt1019 = 0;
					this.method703(0, Class26.method319(this.anInt923), 0, (byte) 1, super.anInt819, super.anInt820, 0, 0);
					if (this.anInt1024 != this.anInt1005) {
						this.anInt1005 = this.anInt1024;
					}
					if (this.anInt1019 != this.anInt939) {
						this.anInt939 = this.anInt1019;
					}
				}
			}
		} catch (@Pc(493) RuntimeException local493) {
			signlink.reporterror("91468, " + 133 + ", " + local493.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method635() {
		try {
			this.anInt995 += 0;
			if (this.anInt848 == 0 && this.anInt879 == 0) {
				this.aStringArray8[this.anInt990] = "Walk here";
				this.anIntArray229[this.anInt990] = 763;
				this.anIntArray227[this.anInt990] = super.anInt819;
				this.anIntArray228[this.anInt990] = super.anInt820;
				this.anInt990++;
			}
			@Pc(47) int local47 = -1;
			for (@Pc(49) int local49 = 0; local49 < Class4_Sub1_Sub2_Sub3.anInt245; local49++) {
				@Pc(55) int local55 = Class4_Sub1_Sub2_Sub3.anIntArray70[local49];
				@Pc(59) int local59 = local55 & 0x7F;
				@Pc(65) int local65 = local55 >> 7 & 0x7F;
				@Pc(71) int local71 = local55 >> 29 & 0x3;
				@Pc(77) int local77 = local55 >> 14 & 0x7FFF;
				if (local55 != local47) {
					local47 = local55;
					@Pc(224) int local224;
					if (local71 == 2 && this.aClass45_1.method461(this.anInt981, local59, local65, local55) >= 0) {
						@Pc(97) Class28 local97 = Class28.method334(local77);
						if (local97.anIntArray104 != null) {
							local97 = local97.method335();
						}
						if (local97 == null) {
							continue;
						}
						if (this.anInt848 == 1) {
							this.aStringArray8[this.anInt990] = "Use " + this.aString20 + " with @cya@" + local97.aString10;
							this.anIntArray229[this.anInt990] = 725;
							this.anIntArray230[this.anInt990] = local55;
							this.anIntArray227[this.anInt990] = local59;
							this.anIntArray228[this.anInt990] = local65;
							this.anInt990++;
						} else if (this.anInt879 != 1) {
							if (local97.aStringArray5 != null) {
								for (local224 = 4; local224 >= 0; local224--) {
									if (local97.aStringArray5[local224] != null) {
										this.aStringArray8[this.anInt990] = local97.aStringArray5[local224] + " @cya@" + local97.aString10;
										if (local224 == 0) {
											this.anIntArray229[this.anInt990] = 837;
										}
										if (local224 == 1) {
											this.anIntArray229[this.anInt990] = 337;
										}
										if (local224 == 2) {
											this.anIntArray229[this.anInt990] = 101;
										}
										if (local224 == 3) {
											this.anIntArray229[this.anInt990] = 840;
										}
										if (local224 == 4) {
											this.anIntArray229[this.anInt990] = 1173;
										}
										this.anIntArray230[this.anInt990] = local55;
										this.anIntArray227[this.anInt990] = local59;
										this.anIntArray228[this.anInt990] = local65;
										this.anInt990++;
									}
								}
							}
							this.aStringArray8[this.anInt990] = "Examine @cya@" + local97.aString10;
							this.anIntArray229[this.anInt990] = 1030;
							this.anIntArray230[this.anInt990] = local97.anInt398 << 14;
							this.anIntArray227[this.anInt990] = local59;
							this.anIntArray228[this.anInt990] = local65;
							this.anInt990++;
						} else if ((this.anInt881 & 0x4) == 4) {
							this.aStringArray8[this.anInt990] = this.aString21 + " @cya@" + local97.aString10;
							this.anIntArray229[this.anInt990] = 865;
							this.anIntArray230[this.anInt990] = local55;
							this.anIntArray227[this.anInt990] = local59;
							this.anIntArray228[this.anInt990] = local65;
							this.anInt990++;
						}
					}
					@Pc(404) Class4_Sub1_Sub2_Sub5_Sub1 local404;
					@Pc(452) Class4_Sub1_Sub2_Sub5_Sub2 local452;
					@Pc(442) int local442;
					if (local71 == 1) {
						@Pc(375) Class4_Sub1_Sub2_Sub5_Sub1 local375 = this.aClass4_Sub1_Sub2_Sub5_Sub1Array1[local77];
						if (local375.aClass33_1.aByte25 == 1 && (local375.anInt694 & 0x7F) == 64 && (local375.anInt695 & 0x7F) == 64) {
							for (local224 = 0; local224 < this.anInt1013; local224++) {
								local404 = this.aClass4_Sub1_Sub2_Sub5_Sub1Array1[this.anIntArray266[local224]];
								if (local404 != null && local404 != local375 && local404.aClass33_1.aByte25 == 1 && local404.anInt694 == local375.anInt694 && local404.anInt695 == local375.anInt695) {
									this.method721(this.anIntArray266[local224], local59, local65, local404.aClass33_1);
								}
							}
							for (local442 = 0; local442 < this.anInt1043; local442++) {
								local452 = this.aClass4_Sub1_Sub2_Sub5_Sub2Array1[this.anIntArray273[local442]];
								if (local452 != null && local452.anInt694 == local375.anInt694 && local452.anInt695 == local375.anInt695) {
									this.method689(local65, local452, local59, this.anIntArray273[local442]);
								}
							}
						}
						this.method721(local77, local59, local65, local375.aClass33_1);
					}
					if (local71 == 0) {
						@Pc(494) Class4_Sub1_Sub2_Sub5_Sub2 local494 = this.aClass4_Sub1_Sub2_Sub5_Sub2Array1[local77];
						if ((local494.anInt694 & 0x7F) == 64 && (local494.anInt695 & 0x7F) == 64) {
							for (local224 = 0; local224 < this.anInt1013; local224++) {
								local404 = this.aClass4_Sub1_Sub2_Sub5_Sub1Array1[this.anIntArray266[local224]];
								if (local404 != null && local404.aClass33_1.aByte25 == 1 && local404.anInt694 == local494.anInt694 && local404.anInt695 == local494.anInt695) {
									this.method721(this.anIntArray266[local224], local59, local65, local404.aClass33_1);
								}
							}
							for (local442 = 0; local442 < this.anInt1043; local442++) {
								local452 = this.aClass4_Sub1_Sub2_Sub5_Sub2Array1[this.anIntArray273[local442]];
								if (local452 != null && local452 != local494 && local452.anInt694 == local494.anInt694 && local452.anInt695 == local494.anInt695) {
									this.method689(local65, local452, local59, this.anIntArray273[local442]);
								}
							}
						}
						this.method689(local65, local494, local59, local77);
					}
					if (local71 == 3) {
						@Pc(613) Class30 local613 = this.aClass30ArrayArrayArray1[this.anInt981][local59][local65];
						if (local613 != null) {
							for (@Pc(620) Class4_Sub1_Sub2_Sub1 local620 = (Class4_Sub1_Sub2_Sub1) local613.method347(); local620 != null; local620 = (Class4_Sub1_Sub2_Sub1) local613.method349()) {
								@Pc(626) Class24 local626 = Class24.method315(local620.anInt40);
								if (this.anInt848 == 1) {
									this.aStringArray8[this.anInt990] = "Use " + this.aString20 + " with @lre@" + local626.aString3;
									this.anIntArray229[this.anInt990] = 641;
									this.anIntArray230[this.anInt990] = local620.anInt40;
									this.anIntArray227[this.anInt990] = local59;
									this.anIntArray228[this.anInt990] = local65;
									this.anInt990++;
								} else if (this.anInt879 != 1) {
									for (@Pc(743) int local743 = 4; local743 >= 0; local743--) {
										if (local626.aStringArray3 != null && local626.aStringArray3[local743] != null) {
											this.aStringArray8[this.anInt990] = local626.aStringArray3[local743] + " @lre@" + local626.aString3;
											if (local743 == 0) {
												this.anIntArray229[this.anInt990] = 429;
											}
											if (local743 == 1) {
												this.anIntArray229[this.anInt990] = 367;
											}
											if (local743 == 2) {
												this.anIntArray229[this.anInt990] = 595;
											}
											if (local743 == 3) {
												this.anIntArray229[this.anInt990] = 155;
											}
											if (local743 == 4) {
												this.anIntArray229[this.anInt990] = 180;
											}
											this.anIntArray230[this.anInt990] = local620.anInt40;
											this.anIntArray227[this.anInt990] = local59;
											this.anIntArray228[this.anInt990] = local65;
											this.anInt990++;
										} else if (local743 == 2) {
											this.aStringArray8[this.anInt990] = "Take @lre@" + local626.aString3;
											this.anIntArray229[this.anInt990] = 595;
											this.anIntArray230[this.anInt990] = local620.anInt40;
											this.anIntArray227[this.anInt990] = local59;
											this.anIntArray228[this.anInt990] = local65;
											this.anInt990++;
										}
									}
									this.aStringArray8[this.anInt990] = "Examine @lre@" + local626.aString3;
									this.anIntArray229[this.anInt990] = 1635;
									this.anIntArray230[this.anInt990] = local620.anInt40;
									this.anIntArray227[this.anInt990] = local59;
									this.anIntArray228[this.anInt990] = local65;
									this.anInt990++;
								} else if ((this.anInt881 & 0x1) == 1) {
									this.aStringArray8[this.anInt990] = this.aString21 + " @lre@" + local626.aString3;
									this.anIntArray229[this.anInt990] = 540;
									this.anIntArray230[this.anInt990] = local620.anInt40;
									this.anIntArray227[this.anInt990] = local59;
									this.anIntArray228[this.anInt990] = local65;
									this.anInt990++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(950) RuntimeException local950) {
			signlink.reporterror("25834, " + 0 + ", " + local950.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean263) {
			this.method598();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method636(@OriginalArg(1) int arg0) {
		try {
			if (arg0 >= 0) {
				@Pc(9) int local9 = this.anIntArray227[arg0];
				@Pc(14) int local14 = this.anIntArray228[arg0];
				@Pc(19) int local19 = this.anIntArray229[arg0];
				@Pc(24) int local24 = this.anIntArray230[arg0];
				if (local19 >= 2000) {
					local19 -= 2000;
				}
				if (this.anInt846 != 0 && local19 != 1290) {
					this.anInt846 = 0;
					this.aBoolean260 = true;
				}
				if (local19 == 865 && this.method608(local24, local9, local14)) {
					this.aClass4_Sub1_Sub3_6.method91(156);
					this.aClass4_Sub1_Sub3_6.method127(this.anInt880);
					this.aClass4_Sub1_Sub3_6.method127(local9 + this.anInt838);
					this.aClass4_Sub1_Sub3_6.method129(local24 >> 14 & 0x7FFF);
					this.aClass4_Sub1_Sub3_6.method127(local14 + this.anInt839);
				}
				@Pc(107) String local107;
				if (local19 == 1030) {
					@Pc(95) int local95 = local24 >> 14 & 0x7FFF;
					@Pc(98) Class28 local98 = Class28.method334(local95);
					if (local98.aByteArray10 == null) {
						local107 = "It's a " + local98.aString10 + ".";
					} else {
						local107 = new String(local98.aByteArray10);
					}
					this.method718(local107, "", 0);
				}
				if (local19 == 4) {
					this.aClass4_Sub1_Sub3_6.method91(208);
					this.aClass4_Sub1_Sub3_6.method129(local14);
					this.aClass4_Sub1_Sub3_6.method128(local24);
					this.aClass4_Sub1_Sub3_6.method128(local9);
					this.anInt1051 = 0;
					this.anInt1052 = local14;
					this.anInt1053 = local9;
					this.anInt1054 = 2;
					if (Class26.method319(local14).anInt356 == this.anInt863) {
						this.anInt1054 = 1;
					}
					if (Class26.method319(local14).anInt356 == this.anInt882) {
						this.anInt1054 = 3;
					}
				}
				@Pc(203) boolean local203;
				if (local19 == 595) {
					local203 = this.method706(local14, 2, 0, 0, 0, aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0], aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0], false, local9, 0, 0);
					if (!local203) {
						this.method706(local14, 2, 0, 0, 1, aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0], aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0], false, local9, 1, 0);
					}
					this.anInt970 = super.anInt825;
					this.anInt971 = super.anInt826;
					this.anInt973 = 2;
					this.anInt972 = 0;
					this.aClass4_Sub1_Sub3_6.method91(170);
					this.aClass4_Sub1_Sub3_6.method93(local14 + this.anInt839);
					this.aClass4_Sub1_Sub3_6.method129(local24);
					this.aClass4_Sub1_Sub3_6.method93(local9 + this.anInt838);
				}
				if (local19 == 155) {
					local203 = this.method706(local14, 2, 0, 0, 0, aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0], aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0], false, local9, 0, 0);
					if (!local203) {
						this.method706(local14, 2, 0, 0, 1, aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0], aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0], false, local9, 1, 0);
					}
					this.anInt970 = super.anInt825;
					this.anInt971 = super.anInt826;
					this.anInt973 = 2;
					this.anInt972 = 0;
					this.aClass4_Sub1_Sub3_6.method91(28);
					this.aClass4_Sub1_Sub3_6.method127(local14 + this.anInt839);
					this.aClass4_Sub1_Sub3_6.method93(local24);
					this.aClass4_Sub1_Sub3_6.method129(local9 + this.anInt838);
				}
				@Pc(358) Class4_Sub1_Sub2_Sub5_Sub1 local358;
				if (local19 == 476) {
					local358 = this.aClass4_Sub1_Sub2_Sub5_Sub1Array1[local24];
					if (local358 != null) {
						this.method706(local358.anIntArray175[0], 2, 0, 0, 1, aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0], aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0], false, local358.anIntArray174[0], 1, 0);
						this.anInt970 = super.anInt825;
						this.anInt971 = super.anInt826;
						this.anInt973 = 2;
						this.anInt972 = 0;
						this.aClass4_Sub1_Sub3_6.method91(86);
						this.aClass4_Sub1_Sub3_6.method127(local24);
					}
				}
				@Pc(419) Class4_Sub1_Sub2_Sub5_Sub2 local419;
				if (local19 == 545) {
					local419 = this.aClass4_Sub1_Sub2_Sub5_Sub2Array1[local24];
					if (local419 != null) {
						this.method706(local419.anIntArray175[0], 2, 0, 0, 1, aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0], aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0], false, local419.anIntArray174[0], 1, 0);
						this.anInt970 = super.anInt825;
						this.anInt971 = super.anInt826;
						this.anInt973 = 2;
						this.anInt972 = 0;
						this.aClass4_Sub1_Sub3_6.method91(142);
						this.aClass4_Sub1_Sub3_6.method128(local24);
					}
				}
				@Pc(493) int local493;
				@Pc(489) String local489;
				@Pc(504) long local504;
				if (local19 == 143 || local19 == 950 || local19 == 140 || local19 == 9) {
					local489 = this.aStringArray8[arg0];
					local493 = local489.indexOf("@whi@");
					if (local493 != -1) {
						local504 = Class36.method378(local489.substring(local493 + 5).trim());
						if (local19 == 143) {
							this.method654(local504);
						}
						if (local19 == 950) {
							this.method621(local504, 731);
						}
						if (local19 == 140) {
							this.method604(this.aBoolean261, local504);
						}
						if (local19 == 9) {
							this.method683(local504);
						}
					}
				}
				if (local19 == 891) {
					local419 = this.aClass4_Sub1_Sub2_Sub5_Sub2Array1[local24];
					if (local419 != null) {
						this.method706(local419.anIntArray175[0], 2, 0, 0, 1, aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0], aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0], false, local419.anIntArray174[0], 1, 0);
						this.anInt970 = super.anInt825;
						this.anInt971 = super.anInt826;
						this.anInt973 = 2;
						this.anInt972 = 0;
						this.aClass4_Sub1_Sub3_6.method91(216);
						this.aClass4_Sub1_Sub3_6.method129(local24);
					}
				}
				if (local19 == 223) {
					local419 = this.aClass4_Sub1_Sub2_Sub5_Sub2Array1[local24];
					if (local419 != null) {
						this.method706(local419.anIntArray175[0], 2, 0, 0, 1, aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0], aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0], false, local419.anIntArray174[0], 1, 0);
						this.anInt970 = super.anInt825;
						this.anInt971 = super.anInt826;
						this.anInt973 = 2;
						this.anInt972 = 0;
						this.aClass4_Sub1_Sub3_6.method91(74);
						this.aClass4_Sub1_Sub3_6.method129(this.anInt850);
						this.aClass4_Sub1_Sub3_6.method127(this.anInt851);
						this.aClass4_Sub1_Sub3_6.method129(this.anInt849);
						this.aClass4_Sub1_Sub3_6.method93(local24);
					}
				}
				if (local19 == 800) {
					local358 = this.aClass4_Sub1_Sub2_Sub5_Sub1Array1[local24];
					if (local358 != null) {
						this.method706(local358.anIntArray175[0], 2, 0, 0, 1, aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0], aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0], false, local358.anIntArray174[0], 1, 0);
						this.anInt970 = super.anInt825;
						this.anInt971 = super.anInt826;
						this.anInt973 = 2;
						this.anInt972 = 0;
						this.aClass4_Sub1_Sub3_6.method91(66);
						this.aClass4_Sub1_Sub3_6.method127(this.anInt851);
						this.aClass4_Sub1_Sub3_6.method129(this.anInt849);
						this.aClass4_Sub1_Sub3_6.method93(local24);
						this.aClass4_Sub1_Sub3_6.method129(this.anInt850);
					}
				}
				if (local19 == 367) {
					local203 = this.method706(local14, 2, 0, 0, 0, aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0], aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0], false, local9, 0, 0);
					if (!local203) {
						this.method706(local14, 2, 0, 0, 1, aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0], aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0], false, local9, 1, 0);
					}
					this.anInt970 = super.anInt825;
					this.anInt971 = super.anInt826;
					this.anInt973 = 2;
					this.anInt972 = 0;
					this.aClass4_Sub1_Sub3_6.method91(42);
					this.aClass4_Sub1_Sub3_6.method128(local24);
					this.aClass4_Sub1_Sub3_6.method93(local14 + this.anInt839);
					this.aClass4_Sub1_Sub3_6.method127(local9 + this.anInt838);
				}
				if (local19 == 422) {
					this.aClass4_Sub1_Sub3_6.method91(241);
					this.aClass4_Sub1_Sub3_6.method127(local24);
					this.aClass4_Sub1_Sub3_6.method93(local9);
					this.aClass4_Sub1_Sub3_6.method93(local14);
					this.anInt1051 = 0;
					this.anInt1052 = local14;
					this.anInt1053 = local9;
					this.anInt1054 = 2;
					if (Class26.method319(local14).anInt356 == this.anInt863) {
						this.anInt1054 = 1;
					}
					if (Class26.method319(local14).anInt356 == this.anInt882) {
						this.anInt1054 = 3;
					}
				}
				@Pc(902) String local902;
				@Pc(893) Class24 local893;
				if (local19 == 1635) {
					local893 = Class24.method315(local24);
					if (local893.aByteArray9 == null) {
						local902 = "It's a " + local893.aString3 + ".";
					} else {
						local902 = new String(local893.aByteArray9);
					}
					this.method718(local902, "", 0);
				}
				if (local19 == 490) {
					if ((local24 & 0x3) == 0) {
						anInt987++;
					}
					if (anInt987 >= 63) {
						this.aClass4_Sub1_Sub3_6.method91(193);
						this.aClass4_Sub1_Sub3_6.method95(7246564);
						anInt987 = 0;
					}
					this.aClass4_Sub1_Sub3_6.method91(126);
					this.aClass4_Sub1_Sub3_6.method129(local9);
					this.aClass4_Sub1_Sub3_6.method129(local14);
					this.aClass4_Sub1_Sub3_6.method129(local24);
					this.anInt1051 = 0;
					this.anInt1052 = local14;
					this.anInt1053 = local9;
					this.anInt1054 = 2;
					if (Class26.method319(local14).anInt356 == this.anInt863) {
						this.anInt1054 = 1;
					}
					if (Class26.method319(local14).anInt356 == this.anInt882) {
						this.anInt1054 = 3;
					}
				}
				if (local19 == 51) {
					this.aClass4_Sub1_Sub3_6.method91(164);
					this.aClass4_Sub1_Sub3_6.method129(this.anInt851);
					this.aClass4_Sub1_Sub3_6.method127(local9);
					this.aClass4_Sub1_Sub3_6.method93(local24);
					this.aClass4_Sub1_Sub3_6.method128(this.anInt850);
					this.aClass4_Sub1_Sub3_6.method127(local14);
					this.aClass4_Sub1_Sub3_6.method127(this.anInt849);
					this.anInt1051 = 0;
					this.anInt1052 = local14;
					this.anInt1053 = local9;
					this.anInt1054 = 2;
					if (Class26.method319(local14).anInt356 == this.anInt863) {
						this.anInt1054 = 1;
					}
					if (Class26.method319(local14).anInt356 == this.anInt882) {
						this.anInt1054 = 3;
					}
				}
				if (local19 == 763) {
					if (this.aBoolean237) {
						this.aClass45_1.method469(local14 - 4, local9 - 4);
					} else {
						this.aClass45_1.method469(super.anInt826 - 4, super.anInt825 - 4);
					}
				}
				if (local19 == 486) {
					this.aClass4_Sub1_Sub3_6.method91(146);
					this.aClass4_Sub1_Sub3_6.method129(local9);
					this.aClass4_Sub1_Sub3_6.method129(local14);
					this.aClass4_Sub1_Sub3_6.method128(local24);
					this.anInt1051 = 0;
					this.anInt1052 = local14;
					this.anInt1053 = local9;
					this.anInt1054 = 2;
					if (Class26.method319(local14).anInt356 == this.anInt863) {
						this.anInt1054 = 1;
					}
					if (Class26.method319(local14).anInt356 == this.anInt882) {
						this.anInt1054 = 3;
					}
				}
				if (local19 == 992) {
					local358 = this.aClass4_Sub1_Sub2_Sub5_Sub1Array1[local24];
					if (local358 != null) {
						this.method706(local358.anIntArray175[0], 2, 0, 0, 1, aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0], aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0], false, local358.anIntArray174[0], 1, 0);
						this.anInt970 = super.anInt825;
						this.anInt971 = super.anInt826;
						this.anInt973 = 2;
						this.anInt972 = 0;
						this.aClass4_Sub1_Sub3_6.method91(128);
						this.aClass4_Sub1_Sub3_6.method128(local24);
					}
				}
				if (local19 == 856) {
					this.aClass4_Sub1_Sub3_6.method91(47);
					this.aClass4_Sub1_Sub3_6.method93(local9);
					this.aClass4_Sub1_Sub3_6.method128(local24);
					this.aClass4_Sub1_Sub3_6.method93(local14);
					this.anInt1051 = 0;
					this.anInt1052 = local14;
					this.anInt1053 = local9;
					this.anInt1054 = 2;
					if (Class26.method319(local14).anInt356 == this.anInt863) {
						this.anInt1054 = 1;
					}
					if (Class26.method319(local14).anInt356 == this.anInt882) {
						this.anInt1054 = 3;
					}
				}
				if (local19 == 113) {
					this.aClass4_Sub1_Sub3_6.method91(207);
					this.aClass4_Sub1_Sub3_6.method129(local24);
					this.aClass4_Sub1_Sub3_6.method129(local14);
					this.aClass4_Sub1_Sub3_6.method129(local9);
					this.anInt1051 = 0;
					this.anInt1052 = local14;
					this.anInt1053 = local9;
					this.anInt1054 = 2;
					if (Class26.method319(local14).anInt356 == this.anInt863) {
						this.anInt1054 = 1;
					}
					if (Class26.method319(local14).anInt356 == this.anInt882) {
						this.anInt1054 = 3;
					}
				}
				if (local19 == 531) {
					this.method712();
				}
				if (local19 == 337) {
					this.method608(local24, local9, local14);
					this.aClass4_Sub1_Sub3_6.method91(224);
					this.aClass4_Sub1_Sub3_6.method129(local24 >> 14 & 0x7FFF);
					this.aClass4_Sub1_Sub3_6.method93(local9 + this.anInt838);
					this.aClass4_Sub1_Sub3_6.method128(local14 + this.anInt839);
				}
				if (local19 == 365) {
					local419 = this.aClass4_Sub1_Sub2_Sub5_Sub2Array1[local24];
					if (local419 != null) {
						this.method706(local419.anIntArray175[0], 2, 0, 0, 1, aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0], aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0], false, local419.anIntArray174[0], 1, 0);
						this.anInt970 = super.anInt825;
						this.anInt971 = super.anInt826;
						this.anInt973 = 2;
						this.anInt972 = 0;
						this.aClass4_Sub1_Sub3_6.method91(236);
						this.aClass4_Sub1_Sub3_6.method128(local24);
					}
				}
				if (local19 == 83) {
					local358 = this.aClass4_Sub1_Sub2_Sub5_Sub1Array1[local24];
					if (local358 != null) {
						this.method706(local358.anIntArray175[0], 2, 0, 0, 1, aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0], aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0], false, local358.anIntArray174[0], 1, 0);
						this.anInt970 = super.anInt825;
						this.anInt971 = super.anInt826;
						this.anInt973 = 2;
						this.anInt972 = 0;
						this.aClass4_Sub1_Sub3_6.method91(18);
						this.aClass4_Sub1_Sub3_6.method127(this.anInt880);
						this.aClass4_Sub1_Sub3_6.method127(local24);
					}
				}
				if (local19 == 286) {
					local358 = this.aClass4_Sub1_Sub2_Sub5_Sub1Array1[local24];
					if (local358 != null) {
						this.method706(local358.anIntArray175[0], 2, 0, 0, 1, aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0], aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0], false, local358.anIntArray174[0], 1, 0);
						this.anInt970 = super.anInt825;
						this.anInt971 = super.anInt826;
						this.anInt973 = 2;
						this.anInt972 = 0;
						this.aClass4_Sub1_Sub3_6.method91(182);
						this.aClass4_Sub1_Sub3_6.method127(local24);
					}
				}
				if (local19 == 840) {
					if ((this.anInt838 & 0x3) == 0) {
						anInt946++;
					}
					if (anInt946 >= 52) {
						this.aClass4_Sub1_Sub3_6.method91(168);
						anInt946 = 0;
					}
					this.method608(local24, local9, local14);
					this.aClass4_Sub1_Sub3_6.method91(195);
					this.aClass4_Sub1_Sub3_6.method129(local9 + this.anInt838);
					this.aClass4_Sub1_Sub3_6.method128(local14 + this.anInt839);
					this.aClass4_Sub1_Sub3_6.method129(local24 >> 14 & 0x7FFF);
				}
				if (local19 == 489) {
					this.aClass4_Sub1_Sub3_6.method91(36);
					this.aClass4_Sub1_Sub3_6.method127(local9);
					this.aClass4_Sub1_Sub3_6.method128(local14);
					this.aClass4_Sub1_Sub3_6.method128(local24);
					this.anInt1051 = 0;
					this.anInt1052 = local14;
					this.anInt1053 = local9;
					this.anInt1054 = 2;
					if (Class26.method319(local14).anInt356 == this.anInt863) {
						this.anInt1054 = 1;
					}
					if (Class26.method319(local14).anInt356 == this.anInt882) {
						this.anInt1054 = 3;
					}
				}
				if (local19 == 269) {
					this.method599(this.anInt888);
					this.anInt888 = -1;
					this.aBoolean260 = true;
				}
				@Pc(1699) int local1699;
				if (local19 == 363) {
					local489 = this.aStringArray8[arg0];
					local493 = local489.indexOf("@whi@");
					if (local493 != -1) {
						local504 = Class36.method378(local489.substring(local493 + 5).trim());
						local1699 = -1;
						for (@Pc(1701) int local1701 = 0; local1701 < this.anInt910; local1701++) {
							if (this.aLongArray3[local1701] == local504) {
								local1699 = local1701;
								break;
							}
						}
						if (local1699 != -1 && this.anIntArray235[local1699] > 0) {
							this.aBoolean260 = true;
							this.anInt846 = 0;
							this.aBoolean248 = true;
							this.aString24 = "";
							this.anInt1022 = 3;
							this.aLong33 = this.aLongArray3[local1699];
							this.aString25 = "Enter message to send to " + this.aStringArray14[local1699];
						}
					}
				}
				if (local19 == 1314) {
					local893 = Class24.method315(local24);
					@Pc(1769) Class26 local1769 = Class26.method319(local14);
					if (local1769 != null && local1769.anIntArray92[local9] >= 100000) {
						local902 = local1769.anIntArray92[local9] + " x " + local893.aString3;
					} else if (local893.aByteArray9 == null) {
						local902 = "It's a " + local893.aString3 + ".";
					} else {
						local902 = new String(local893.aByteArray9);
					}
					this.method718(local902, "", 0);
				}
				if (local19 == 555) {
					local419 = this.aClass4_Sub1_Sub2_Sub5_Sub2Array1[local24];
					if (local419 != null) {
						this.method706(local419.anIntArray175[0], 2, 0, 0, 1, aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0], aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0], false, local419.anIntArray174[0], 1, 0);
						this.anInt970 = super.anInt825;
						this.anInt971 = super.anInt826;
						this.anInt973 = 2;
						this.anInt972 = 0;
						this.aClass4_Sub1_Sub3_6.method91(25);
						this.aClass4_Sub1_Sub3_6.method127(local24);
						this.aClass4_Sub1_Sub3_6.method93(this.anInt880);
					}
				}
				if (local19 == 94) {
					local419 = this.aClass4_Sub1_Sub2_Sub5_Sub2Array1[local24];
					if (local419 != null) {
						this.method706(local419.anIntArray175[0], 2, 0, 0, 1, aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0], aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0], false, local419.anIntArray174[0], 1, 0);
						this.anInt970 = super.anInt825;
						this.anInt971 = super.anInt826;
						this.anInt973 = 2;
						this.anInt972 = 0;
						if ((local24 & 0x3) == 0) {
							anInt1045++;
						}
						if (anInt1045 >= 144) {
							this.aClass4_Sub1_Sub3_6.method91(44);
							this.aClass4_Sub1_Sub3_6.method93(4239);
							anInt1045 = 0;
						}
						this.aClass4_Sub1_Sub3_6.method91(108);
						this.aClass4_Sub1_Sub3_6.method128(local24);
					}
				}
				if (local19 == 1 && !this.aBoolean235) {
					this.aClass4_Sub1_Sub3_6.method91(223);
					this.aClass4_Sub1_Sub3_6.method93(local14);
					this.aBoolean235 = true;
				}
				if (local19 == 1738) {
					local358 = this.aClass4_Sub1_Sub2_Sub5_Sub1Array1[local24];
					if (local358 != null) {
						@Pc(2002) Class33 local2002 = local358.aClass33_1;
						if (local2002.anIntArray133 != null) {
							local2002 = local2002.method369();
						}
						if (local2002 != null) {
							if (local2002.aByteArray11 == null) {
								local107 = "It's a " + local2002.aString12 + ".";
							} else {
								local107 = new String(local2002.aByteArray11);
							}
							this.method718(local107, "", 0);
						}
					}
				}
				@Pc(2045) Class26 local2045;
				if (local19 == 741) {
					local2045 = Class26.method319(local14);
					@Pc(2047) boolean local2047 = true;
					if (local2045.anInt337 > 0) {
						local2047 = this.method663(local2045);
					}
					if (local2047) {
						this.aClass4_Sub1_Sub3_6.method91(16);
						this.aClass4_Sub1_Sub3_6.method93(local14);
					}
				}
				if (local19 == 540) {
					local203 = this.method706(local14, 2, 0, 0, 0, aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0], aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0], false, local9, 0, 0);
					if (!local203) {
						this.method706(local14, 2, 0, 0, 1, aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0], aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0], false, local9, 1, 0);
					}
					this.anInt970 = super.anInt825;
					this.anInt971 = super.anInt826;
					this.anInt973 = 2;
					this.anInt972 = 0;
					this.aClass4_Sub1_Sub3_6.method91(34);
					this.aClass4_Sub1_Sub3_6.method129(local9 + this.anInt838);
					this.aClass4_Sub1_Sub3_6.method129(local24);
					this.aClass4_Sub1_Sub3_6.method127(local14 + this.anInt839);
					this.aClass4_Sub1_Sub3_6.method128(this.anInt880);
				}
				if (local19 == 641) {
					local203 = this.method706(local14, 2, 0, 0, 0, aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0], aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0], false, local9, 0, 0);
					if (!local203) {
						this.method706(local14, 2, 0, 0, 1, aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0], aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0], false, local9, 1, 0);
					}
					this.anInt970 = super.anInt825;
					this.anInt971 = super.anInt826;
					this.anInt973 = 2;
					this.anInt972 = 0;
					this.aClass4_Sub1_Sub3_6.method91(59);
					this.aClass4_Sub1_Sub3_6.method93(local9 + this.anInt838);
					this.aClass4_Sub1_Sub3_6.method127(local14 + this.anInt839);
					this.aClass4_Sub1_Sub3_6.method93(local24);
					this.aClass4_Sub1_Sub3_6.method129(this.anInt849);
					this.aClass4_Sub1_Sub3_6.method127(this.anInt850);
					this.aClass4_Sub1_Sub3_6.method128(this.anInt851);
				}
				if (local19 == 315) {
					this.aClass4_Sub1_Sub3_6.method91(137);
					this.aClass4_Sub1_Sub3_6.method93(local24);
					this.aClass4_Sub1_Sub3_6.method93(local9);
					this.aClass4_Sub1_Sub3_6.method128(local14);
					this.anInt1051 = 0;
					this.anInt1052 = local14;
					this.anInt1053 = local9;
					this.anInt1054 = 2;
					if (Class26.method319(local14).anInt356 == this.anInt863) {
						this.anInt1054 = 1;
					}
					if (Class26.method319(local14).anInt356 == this.anInt882) {
						this.anInt1054 = 3;
					}
				}
				if (local19 == 101) {
					this.method608(local24, local9, local14);
					this.aClass4_Sub1_Sub3_6.method91(177);
					this.aClass4_Sub1_Sub3_6.method127(local9 + this.anInt838);
					this.aClass4_Sub1_Sub3_6.method127(local24 >> 14 & 0x7FFF);
					this.aClass4_Sub1_Sub3_6.method93(local14 + this.anInt839);
				}
				if (local19 == 319) {
					local358 = this.aClass4_Sub1_Sub2_Sub5_Sub1Array1[local24];
					if (local358 != null) {
						this.method706(local358.anIntArray175[0], 2, 0, 0, 1, aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0], aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0], false, local358.anIntArray174[0], 1, 0);
						this.anInt970 = super.anInt825;
						this.anInt971 = super.anInt826;
						this.anInt973 = 2;
						this.anInt972 = 0;
						this.aClass4_Sub1_Sub3_6.method91(6);
						this.aClass4_Sub1_Sub3_6.method127(local24);
					}
				}
				if (local19 == 725 && this.method608(local24, local9, local14)) {
					this.aClass4_Sub1_Sub3_6.method91(95);
					this.aClass4_Sub1_Sub3_6.method128(local24 >> 14 & 0x7FFF);
					this.aClass4_Sub1_Sub3_6.method93(local14 + this.anInt839);
					this.aClass4_Sub1_Sub3_6.method127(this.anInt849);
					this.aClass4_Sub1_Sub3_6.method127(this.anInt851);
					this.aClass4_Sub1_Sub3_6.method128(this.anInt850);
					this.aClass4_Sub1_Sub3_6.method127(local9 + this.anInt838);
				}
				if (local19 == 837) {
					this.method608(local24, local9, local14);
					this.aClass4_Sub1_Sub3_6.method91(110);
					this.aClass4_Sub1_Sub3_6.method129(local24 >> 14 & 0x7FFF);
					this.aClass4_Sub1_Sub3_6.method129(local14 + this.anInt839);
					this.aClass4_Sub1_Sub3_6.method93(local9 + this.anInt838);
				}
				if (local19 == 243) {
					local489 = this.aStringArray8[arg0];
					local493 = local489.indexOf("@whi@");
					if (local493 != -1) {
						if (this.anInt863 == -1) {
							this.method712();
							this.aString22 = local489.substring(local493 + 5).trim();
							this.aBoolean264 = false;
							this.anInt1055 = this.anInt863 = Class26.anInt325;
						} else {
							this.method718("Please close the interface you have open before using 'report abuse'", "", 0);
						}
					}
				}
				if (local19 == 793 || local19 == 510) {
					local489 = this.aStringArray8[arg0];
					local493 = local489.indexOf("@whi@");
					if (local493 != -1) {
						local489 = local489.substring(local493 + 5).trim();
						local107 = Class36.method382(Class36.method379(Class36.method378(local489)), 78);
						@Pc(2590) boolean local2590 = false;
						for (local1699 = 0; local1699 < this.anInt1043; local1699++) {
							@Pc(2602) Class4_Sub1_Sub2_Sub5_Sub2 local2602 = this.aClass4_Sub1_Sub2_Sub5_Sub2Array1[this.anIntArray273[local1699]];
							if (local2602 != null && local2602.aString16 != null && local2602.aString16.equalsIgnoreCase(local107)) {
								this.method706(local2602.anIntArray175[0], 2, 0, 0, 1, aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0], aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0], false, local2602.anIntArray174[0], 1, 0);
								if (local19 == 793) {
									if ((local24 & 0x3) == 0) {
										anInt1045++;
									}
									if (anInt1045 >= 144) {
										this.aClass4_Sub1_Sub3_6.method91(44);
										this.aClass4_Sub1_Sub3_6.method93(4239);
										anInt1045 = 0;
									}
									this.aClass4_Sub1_Sub3_6.method91(108);
									this.aClass4_Sub1_Sub3_6.method128(this.anIntArray273[local1699]);
								}
								if (local19 == 510) {
									if ((local24 & 0x3) == 0) {
										anInt1049++;
									}
									if (anInt1049 >= 138) {
										this.aClass4_Sub1_Sub3_6.method91(145);
										this.aClass4_Sub1_Sub3_6.method95(4353197);
										anInt1049 = 0;
									}
									this.aClass4_Sub1_Sub3_6.method91(70);
									this.aClass4_Sub1_Sub3_6.method128(this.anIntArray273[local1699]);
								}
								local2590 = true;
								break;
							}
						}
						if (!local2590) {
							this.method718("Unable to find " + local107, "", 0);
						}
					}
				}
				if (local19 == 906) {
					this.aClass4_Sub1_Sub3_6.method91(45);
					this.aClass4_Sub1_Sub3_6.method129(local24);
					this.aClass4_Sub1_Sub3_6.method127(local9);
					this.aClass4_Sub1_Sub3_6.method127(this.anInt880);
					this.aClass4_Sub1_Sub3_6.method128(local14);
					this.anInt1051 = 0;
					this.anInt1052 = local14;
					this.anInt1053 = local9;
					this.anInt1054 = 2;
					if (Class26.method319(local14).anInt356 == this.anInt863) {
						this.anInt1054 = 1;
					}
					if (Class26.method319(local14).anInt356 == this.anInt882) {
						this.anInt1054 = 3;
					}
				}
				if (local19 == 682) {
					this.aClass4_Sub1_Sub3_6.method91(91);
					this.aClass4_Sub1_Sub3_6.method127(local9);
					this.aClass4_Sub1_Sub3_6.method127(local24);
					this.aClass4_Sub1_Sub3_6.method127(local14);
					this.anInt1051 = 0;
					this.anInt1052 = local14;
					this.anInt1053 = local9;
					this.anInt1054 = 2;
					if (Class26.method319(local14).anInt356 == this.anInt863) {
						this.anInt1054 = 1;
					}
					if (Class26.method319(local14).anInt356 == this.anInt882) {
						this.anInt1054 = 3;
					}
				}
				if (local19 == 417) {
					this.aClass4_Sub1_Sub3_6.method91(16);
					this.aClass4_Sub1_Sub3_6.method93(local14);
					local2045 = Class26.method319(local14);
					if (local2045.anIntArrayArray8 != null && local2045.anIntArrayArray8[0][0] == 5) {
						local493 = local2045.anIntArrayArray8[0][1];
						if (this.anIntArray276[local493] != local2045.anIntArray89[0]) {
							this.anIntArray276[local493] = local2045.anIntArray89[0];
							this.method656(local493);
							this.aBoolean255 = true;
						}
					}
				}
				if (local19 == 180) {
					local203 = this.method706(local14, 2, 0, 0, 0, aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0], aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0], false, local9, 0, 0);
					if (!local203) {
						this.method706(local14, 2, 0, 0, 1, aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0], aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0], false, local9, 1, 0);
					}
					this.anInt970 = super.anInt825;
					this.anInt971 = super.anInt826;
					this.anInt973 = 2;
					this.anInt972 = 0;
					this.aClass4_Sub1_Sub3_6.method91(27);
					this.aClass4_Sub1_Sub3_6.method127(local24);
					this.aClass4_Sub1_Sub3_6.method127(local14 + this.anInt839);
					this.aClass4_Sub1_Sub3_6.method128(local9 + this.anInt838);
				}
				if (local19 == 429) {
					local203 = this.method706(local14, 2, 0, 0, 0, aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0], aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0], false, local9, 0, 0);
					if (!local203) {
						this.method706(local14, 2, 0, 0, 1, aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0], aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0], false, local9, 1, 0);
					}
					this.anInt970 = super.anInt825;
					this.anInt971 = super.anInt826;
					this.anInt973 = 2;
					this.anInt972 = 0;
					this.aClass4_Sub1_Sub3_6.method91(84);
					this.aClass4_Sub1_Sub3_6.method128(local14 + this.anInt839);
					this.aClass4_Sub1_Sub3_6.method93(local9 + this.anInt838);
					this.aClass4_Sub1_Sub3_6.method128(local24);
				}
				if (local19 == 529) {
					this.anInt848 = 1;
					this.anInt849 = local9;
					this.anInt850 = local14;
					this.anInt851 = local24;
					this.aString20 = String.valueOf(Class24.method315(local24).aString3);
					this.anInt879 = 0;
					this.aBoolean255 = true;
				} else if (local19 == 508) {
					local2045 = Class26.method319(local14);
					this.anInt879 = 1;
					this.anInt880 = local14;
					this.anInt881 = local2045.anInt359;
					this.anInt848 = 0;
					this.aBoolean255 = true;
					local902 = local2045.aString5;
					if (local902.indexOf(" ") != -1) {
						local902 = local902.substring(0, local902.indexOf(" "));
					}
					local107 = local2045.aString5;
					if (local107.indexOf(" ") != -1) {
						local107 = local107.substring(local107.indexOf(" ") + 1);
					}
					this.aString21 = local902 + " " + local2045.aString8 + " " + local107;
					if (this.anInt881 == 16) {
						this.aBoolean255 = true;
						this.anInt937 = 3;
						this.aBoolean233 = true;
					}
				} else {
					if (local19 == 1173) {
						if ((local24 & 0x3) == 0) {
							anInt1000++;
						}
						if (anInt1000 >= 112) {
							this.aClass4_Sub1_Sub3_6.method91(232);
							this.aClass4_Sub1_Sub3_6.method93(63273);
							anInt1000 = 0;
						}
						this.method608(local24, local9, local14);
						this.aClass4_Sub1_Sub3_6.method91(50);
						this.aClass4_Sub1_Sub3_6.method128(local9 + this.anInt838);
						this.aClass4_Sub1_Sub3_6.method129(local14 + this.anInt839);
						this.aClass4_Sub1_Sub3_6.method93(local24 >> 14 & 0x7FFF);
					}
					if (local19 == 416) {
						local419 = this.aClass4_Sub1_Sub2_Sub5_Sub2Array1[local24];
						if (local419 != null) {
							this.method706(local419.anIntArray175[0], 2, 0, 0, 1, aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0], aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0], false, local419.anIntArray174[0], 1, 0);
							this.anInt970 = super.anInt825;
							this.anInt971 = super.anInt826;
							this.anInt973 = 2;
							this.anInt972 = 0;
							if ((local24 & 0x3) == 0) {
								anInt1049++;
							}
							if (anInt1049 >= 138) {
								this.aClass4_Sub1_Sub3_6.method91(145);
								this.aClass4_Sub1_Sub3_6.method95(4353197);
								anInt1049 = 0;
							}
							this.aClass4_Sub1_Sub3_6.method91(70);
							this.aClass4_Sub1_Sub3_6.method128(local24);
						}
					}
					if (local19 == 593) {
						this.aClass4_Sub1_Sub3_6.method91(190);
						this.aClass4_Sub1_Sub3_6.method129(local9);
						this.aClass4_Sub1_Sub3_6.method93(local24);
						this.aClass4_Sub1_Sub3_6.method129(local14);
						this.anInt1051 = 0;
						this.anInt1052 = local14;
						this.anInt1053 = local9;
						this.anInt1054 = 2;
						if (Class26.method319(local14).anInt356 == this.anInt863) {
							this.anInt1054 = 1;
						}
						if (Class26.method319(local14).anInt356 == this.anInt882) {
							this.anInt1054 = 3;
						}
					}
					if (local19 == 923) {
						this.aClass4_Sub1_Sub3_6.method91(16);
						this.aClass4_Sub1_Sub3_6.method93(local14);
						local2045 = Class26.method319(local14);
						if (local2045.anIntArrayArray8 != null && local2045.anIntArrayArray8[0][0] == 5) {
							local493 = local2045.anIntArrayArray8[0][1];
							this.anIntArray276[local493] = 1 - this.anIntArray276[local493];
							this.method656(local493);
							this.aBoolean255 = true;
						}
					}
					if (local19 == 434) {
						local358 = this.aClass4_Sub1_Sub2_Sub5_Sub1Array1[local24];
						if (local358 != null) {
							this.method706(local358.anIntArray175[0], 2, 0, 0, 1, aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0], aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0], false, local358.anIntArray174[0], 1, 0);
							this.anInt970 = super.anInt825;
							this.anInt971 = super.anInt826;
							this.anInt973 = 2;
							this.anInt972 = 0;
							this.aClass4_Sub1_Sub3_6.method91(147);
							this.aClass4_Sub1_Sub3_6.method93(local24);
						}
					}
					this.anInt848 = 0;
					this.anInt879 = 0;
					this.aBoolean255 = true;
				}
			}
		} catch (@Pc(3519) RuntimeException local3519) {
			signlink.reporterror("2673, " + 7 + ", " + arg0 + ", " + local3519.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method637() {
		try {
			@Pc(17) int local17;
			for (@Pc(9) int local9 = -1; local9 < this.anInt1043; local9++) {
				if (local9 == -1) {
					local17 = this.anInt1042;
				} else {
					local17 = this.anIntArray273[local9];
				}
				@Pc(29) Class4_Sub1_Sub2_Sub5_Sub2 local29 = this.aClass4_Sub1_Sub2_Sub5_Sub2Array1[local17];
				if (local29 != null && local29.anInt732 > 0) {
					local29.anInt732--;
					if (local29.anInt732 == 0) {
						local29.aString15 = null;
					}
				}
			}
			for (local17 = 0; local17 < this.anInt1013; local17++) {
				@Pc(60) int local60 = this.anIntArray266[local17];
				@Pc(65) Class4_Sub1_Sub2_Sub5_Sub1 local65 = this.aClass4_Sub1_Sub2_Sub5_Sub1Array1[local60];
				if (local65 != null && local65.anInt732 > 0) {
					local65.anInt732--;
					if (local65.anInt732 == 0) {
						local65.aString15 = null;
					}
				}
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("89955, " + -7 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIZ)I")
	private int method638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(9) int local9 = 256 - arg0;
			return ((arg2 & 0xFF00FF) * local9 + (arg1 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg2 & 0xFF00) * local9 + (arg1 & 0xFF00) * arg0 & 0xFF0000) >> 8;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("5335, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILclient!FTMSICIZ;)V")
	private void method639(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub1_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt102 + 21 < arg0 * 8) {
					@Pc(18) int local18 = arg1.method113(14, 779);
					if (local18 != 16383) {
						if (this.aClass4_Sub1_Sub2_Sub5_Sub1Array1[local18] == null) {
							this.aClass4_Sub1_Sub2_Sub5_Sub1Array1[local18] = new Class4_Sub1_Sub2_Sub5_Sub1();
						}
						@Pc(38) Class4_Sub1_Sub2_Sub5_Sub1 local38 = this.aClass4_Sub1_Sub2_Sub5_Sub1Array1[local18];
						this.anIntArray266[this.anInt1013++] = local18;
						local38.anInt711 = anInt927;
						@Pc(57) int local57 = arg1.method113(5, 779);
						if (local57 > 15) {
							local57 -= 32;
						}
						@Pc(66) int local66 = arg1.method113(5, 779);
						if (local66 > 15) {
							local66 -= 32;
						}
						@Pc(75) int local75 = arg1.method113(1, 779);
						if (local75 == 1) {
							this.anIntArray274[this.anInt1044++] = local18;
						}
						@Pc(94) int local94 = arg1.method113(1, 779);
						local38.aClass33_1 = Class33.method372(arg1.method113(13, 779));
						local38.anInt706 = local38.aClass33_1.aByte25;
						local38.anInt730 = local38.aClass33_1.anInt514;
						local38.anInt707 = local38.aClass33_1.anInt505;
						local38.anInt708 = local38.aClass33_1.anInt503;
						local38.anInt709 = local38.aClass33_1.anInt507;
						local38.anInt710 = local38.aClass33_1.anInt501;
						local38.anInt724 = local38.aClass33_1.anInt515;
						local38.method498(aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0] + local57, local94 == 1, aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0] + local66);
						continue;
					}
				}
				arg1.method114(462);
				return;
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("32045, " + true + ", " + arg0 + ", " + arg1 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method640() {
		try {
			@Pc(6) Class4_Sub1_Sub2_Sub4 local6 = (Class4_Sub1_Sub2_Sub4) this.aClass30_10.method346();
			this.aBoolean241 &= true;
			while (local6 != null) {
				if (local6.anInt419 != this.anInt981 || anInt927 > local6.anInt418) {
					local6.method572();
				} else if (anInt927 >= local6.anInt417) {
					if (local6.anInt410 > 0) {
						@Pc(42) Class4_Sub1_Sub2_Sub5_Sub1 local42 = this.aClass4_Sub1_Sub2_Sub5_Sub1Array1[local6.anInt410 - 1];
						if (local42 != null && local42.anInt694 >= 0 && local42.anInt694 < 13312 && local42.anInt695 >= 0 && local42.anInt695 < 13312) {
							local6.method355(this.method651(local42.anInt694, local6.anInt419, local42.anInt695) - local6.anInt416, anInt927, local42.anInt694, this.aByte37, local42.anInt695);
						}
					}
					if (local6.anInt410 < 0) {
						@Pc(88) int local88 = -local6.anInt410 - 1;
						@Pc(94) Class4_Sub1_Sub2_Sub5_Sub2 local94;
						if (local88 == this.anInt982) {
							local94 = aClass4_Sub1_Sub2_Sub5_Sub2_1;
						} else {
							local94 = this.aClass4_Sub1_Sub2_Sub5_Sub2Array1[local88];
						}
						if (local94 != null && local94.anInt694 >= 0 && local94.anInt694 < 13312 && local94.anInt695 >= 0 && local94.anInt695 < 13312) {
							local6.method355(this.method651(local94.anInt694, local6.anInt419, local94.anInt695) - local6.anInt416, anInt927, local94.anInt694, this.aByte37, local94.anInt695);
						}
					}
					local6.method356(this.anInt947);
					this.aClass45_1.method442((int) local6.aDouble8, local6, (int) local6.aDouble6, 60, (int) local6.aDouble7, local6.anInt411, this.anInt981, false, -1);
				}
				local6 = (Class4_Sub1_Sub2_Sub4) this.aClass30_10.method348();
			}
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("25954, " + true + ", " + local175.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method641(@OriginalArg(0) boolean arg0) {
		try {
			for (@Pc(3) int local3 = -1; local3 < this.anInt1043; local3++) {
				@Pc(11) int local11;
				if (local3 == -1) {
					local11 = this.anInt1042;
				} else {
					local11 = this.anIntArray273[local3];
				}
				@Pc(23) Class4_Sub1_Sub2_Sub5_Sub2 local23 = this.aClass4_Sub1_Sub2_Sub5_Sub2Array1[local11];
				if (local23 != null) {
					this.method625(1, local23);
				}
			}
			if (arg0) {
				;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("28070, " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method642(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0) {
				for (@Pc(3) int local3 = 1; local3 > 0; local3++) {
				}
			}
			if (super.anInt824 == 1) {
				if (super.anInt825 >= 539 && super.anInt825 <= 573 && super.anInt826 >= 169 && super.anInt826 < 205 && this.anIntArray265[0] != -1) {
					this.aBoolean255 = true;
					this.anInt937 = 0;
					this.aBoolean233 = true;
				}
				if (super.anInt825 >= 569 && super.anInt825 <= 599 && super.anInt826 >= 168 && super.anInt826 < 205 && this.anIntArray265[1] != -1) {
					this.aBoolean255 = true;
					this.anInt937 = 1;
					this.aBoolean233 = true;
				}
				if (super.anInt825 >= 597 && super.anInt825 <= 627 && super.anInt826 >= 168 && super.anInt826 < 205 && this.anIntArray265[2] != -1) {
					this.aBoolean255 = true;
					this.anInt937 = 2;
					this.aBoolean233 = true;
				}
				if (super.anInt825 >= 625 && super.anInt825 <= 669 && super.anInt826 >= 168 && super.anInt826 < 203 && this.anIntArray265[3] != -1) {
					this.aBoolean255 = true;
					this.anInt937 = 3;
					this.aBoolean233 = true;
				}
				if (super.anInt825 >= 666 && super.anInt825 <= 696 && super.anInt826 >= 168 && super.anInt826 < 205 && this.anIntArray265[4] != -1) {
					this.aBoolean255 = true;
					this.anInt937 = 4;
					this.aBoolean233 = true;
				}
				if (super.anInt825 >= 694 && super.anInt825 <= 724 && super.anInt826 >= 168 && super.anInt826 < 205 && this.anIntArray265[5] != -1) {
					this.aBoolean255 = true;
					this.anInt937 = 5;
					this.aBoolean233 = true;
				}
				if (super.anInt825 >= 722 && super.anInt825 <= 756 && super.anInt826 >= 169 && super.anInt826 < 205 && this.anIntArray265[6] != -1) {
					this.aBoolean255 = true;
					this.anInt937 = 6;
					this.aBoolean233 = true;
				}
				if (super.anInt825 >= 540 && super.anInt825 <= 574 && super.anInt826 >= 466 && super.anInt826 < 502 && this.anIntArray265[7] != -1) {
					this.aBoolean255 = true;
					this.anInt937 = 7;
					this.aBoolean233 = true;
				}
				if (super.anInt825 >= 572 && super.anInt825 <= 602 && super.anInt826 >= 466 && super.anInt826 < 503 && this.anIntArray265[8] != -1) {
					this.aBoolean255 = true;
					this.anInt937 = 8;
					this.aBoolean233 = true;
				}
				if (super.anInt825 >= 599 && super.anInt825 <= 629 && super.anInt826 >= 466 && super.anInt826 < 503 && this.anIntArray265[9] != -1) {
					this.aBoolean255 = true;
					this.anInt937 = 9;
					this.aBoolean233 = true;
				}
				if (super.anInt825 >= 627 && super.anInt825 <= 671 && super.anInt826 >= 467 && super.anInt826 < 502 && this.anIntArray265[10] != -1) {
					this.aBoolean255 = true;
					this.anInt937 = 10;
					this.aBoolean233 = true;
				}
				if (super.anInt825 >= 669 && super.anInt825 <= 699 && super.anInt826 >= 466 && super.anInt826 < 503 && this.anIntArray265[11] != -1) {
					this.aBoolean255 = true;
					this.anInt937 = 11;
					this.aBoolean233 = true;
				}
				if (super.anInt825 >= 696 && super.anInt825 <= 726 && super.anInt826 >= 466 && super.anInt826 < 503 && this.anIntArray265[12] != -1) {
					this.aBoolean255 = true;
					this.anInt937 = 12;
					this.aBoolean233 = true;
				}
				if (super.anInt825 >= 724 && super.anInt825 <= 758 && super.anInt826 >= 466 && super.anInt826 < 502 && this.anIntArray265[13] != -1) {
					this.aBoolean255 = true;
					this.anInt937 = 13;
					this.aBoolean233 = true;
					return;
				}
			}
		} catch (@Pc(448) RuntimeException local448) {
			signlink.reporterror("28928, " + arg0 + ", " + local448.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)V")
	private void method643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass4_Sub1_Sub1_Sub2_9.method211(233, arg1, arg3);
			this.aClass4_Sub1_Sub1_Sub2_10.method211(233, arg1, arg3 + arg2 - 16);
			Class4_Sub1_Sub1.method548(arg1, this.anInt1046, arg3 + 16, arg2 - 32, this.anInt945, 16);
			@Pc(36) int local36 = (arg2 - 32) * arg2 / arg4;
			if (local36 < 8) {
				local36 = 8;
			}
			@Pc(53) int local53 = (arg2 - local36 - 32) * arg0 / (arg4 - arg2);
			Class4_Sub1_Sub1.method548(arg1, this.anInt883, arg3 + local53 + 16, local36, this.anInt945, 16);
			Class4_Sub1_Sub1.method553(local36, this.aBoolean227, this.anInt994, arg3 + local53 + 16, arg1);
			Class4_Sub1_Sub1.method553(local36, this.aBoolean227, this.anInt994, arg3 + local53 + 16, arg1 + 1);
			Class4_Sub1_Sub1.method551(arg3 + local53 + 16, arg1, this.anInt994, 16);
			Class4_Sub1_Sub1.method551(arg3 + local53 + 17, arg1, this.anInt994, 16);
			Class4_Sub1_Sub1.method553(local36, this.aBoolean227, this.anInt989, arg3 + local53 + 16, arg1 + 15);
			Class4_Sub1_Sub1.method553(local36 - 1, this.aBoolean227, this.anInt989, arg3 + local53 + 17, arg1 + 14);
			Class4_Sub1_Sub1.method551(arg3 + local53 + local36 + 15, arg1, this.anInt989, 16);
			Class4_Sub1_Sub1.method551(arg3 + local53 + local36 + 14, arg1 + 1, this.anInt989, 15);
		} catch (@Pc(180) RuntimeException local180) {
			signlink.reporterror("19472, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 6 + ", " + arg3 + ", " + arg4 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZLclient!KUDWIDHU;)V")
	private void method644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class4_Sub1_Sub1_Sub3 arg2) {
		try {
			@Pc(7) int local7 = arg1 * arg1 + arg0 * arg0;
			if (local7 > 4225 && local7 < 90000) {
				@Pc(28) int local28 = this.anInt954 + this.anInt991 & 0x7FF;
				@Pc(32) int local32 = Class4_Sub1_Sub2_Sub3.anIntArray71[local28];
				@Pc(36) int local36 = Class4_Sub1_Sub2_Sub3.anIntArray72[local28];
				@Pc(45) int local45 = local32 * 256 / (this.anInt886 + 256);
				@Pc(54) int local54 = local36 * 256 / (this.anInt886 + 256);
				@Pc(64) int local64 = arg0 * local45 + arg1 * local54 >> 16;
				@Pc(74) int local74 = arg0 * local54 - arg1 * local45 >> 16;
				@Pc(80) double local80 = Math.atan2((double) local64, (double) local74);
				@Pc(86) int local86 = (int) (Math.sin(local80) * 63.0D);
				@Pc(92) int local92 = (int) (Math.cos(local80) * 57.0D);
				this.aClass4_Sub1_Sub1_Sub3_4.method244(83 - local92 - 20, local86 + 94 + 4 - 10, local80);
			} else {
				this.method678(arg1, arg2, arg0);
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("88845, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method645() {
		try {
			for (@Pc(10) Class4_Sub1_Sub2_Sub6 local10 = (Class4_Sub1_Sub2_Sub6) this.aClass30_11.method346(); local10 != null; local10 = (Class4_Sub1_Sub2_Sub6) this.aClass30_11.method348()) {
				if (local10.anInt800 != this.anInt981 || local10.aBoolean213) {
					local10.method572();
				} else if (anInt927 >= local10.anInt806) {
					local10.method576(this.anInt947, (byte) 9);
					if (local10.aBoolean213) {
						local10.method572();
					} else {
						this.aClass45_1.method442(local10.anInt803, local10, local10.anInt801, 60, local10.anInt802, 0, local10.anInt800, false, -1);
					}
				}
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("81302, " + 691 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZB)V")
	private void method646(@OriginalArg(0) boolean arg0) {
		try {
			this.method682();
			this.aClass13_14.method187();
			this.aClass4_Sub1_Sub1_Sub2_11.method211(233, 0, 0);
			@Pc(44) byte local44;
			@Pc(56) int local56;
			if (this.anInt952 == 0) {
				this.aClass4_Sub1_Sub1_Sub1_2.method45(true, 180, this.aClass20_Sub1_1.aString2, 180, 7711145);
				local44 = 80;
				this.aClass4_Sub1_Sub1_Sub1_4.method45(true, 180, "Welcome to RuneScape", 80, 16776960);
				local56 = local44 + 30;
				this.aClass4_Sub1_Sub1_Sub2_12.method211(233, 27, 100);
				this.aClass4_Sub1_Sub1_Sub1_4.method45(true, 100, "New User", 125, 16777215);
				this.aClass4_Sub1_Sub1_Sub2_12.method211(233, 187, 100);
				this.aClass4_Sub1_Sub1_Sub1_4.method45(true, 260, "Existing User", 125, 16777215);
			}
			if (this.anInt952 == 2) {
				local44 = 60;
				if (this.aString30.length() > 0) {
					this.aClass4_Sub1_Sub1_Sub1_4.method45(true, 180, this.aString30, 45, 16776960);
					this.aClass4_Sub1_Sub1_Sub1_4.method45(true, 180, this.aString31, 60, 16776960);
					local56 = local44 + 30;
				} else {
					this.aClass4_Sub1_Sub1_Sub1_4.method45(true, 180, this.aString31, 53, 16776960);
					local56 = local44 + 30;
				}
				this.aClass4_Sub1_Sub1_Sub1_4.method52(90, 90, true, "Username: " + this.aString18 + (this.anInt938 == 0 & anInt927 % 40 < 20 ? "@yel@|" : ""), 16777215);
				local56 += 15;
				this.aClass4_Sub1_Sub1_Sub1_4.method52(92, 105, true, "Password: " + Class36.method383(this.aString19) + (this.anInt938 == 1 & anInt927 % 40 < 20 ? "@yel@|" : ""), 16777215);
				local56 += 15;
				if (!arg0) {
					this.aClass4_Sub1_Sub1_Sub2_12.method211(233, 27, 130);
					this.aClass4_Sub1_Sub1_Sub1_4.method45(true, 100, "Login", 155, 16777215);
					this.aClass4_Sub1_Sub1_Sub2_12.method211(233, 187, 130);
					this.aClass4_Sub1_Sub1_Sub1_4.method45(true, 260, "Cancel", 155, 16777215);
				}
			}
			if (this.anInt952 == 3) {
				this.aClass4_Sub1_Sub1_Sub1_4.method45(true, 180, "Create a free account", 40, 16776960);
				local44 = 65;
				this.aClass4_Sub1_Sub1_Sub1_4.method45(true, 180, "To create a new account you need to", 65, 16777215);
				local56 = local44 + 15;
				this.aClass4_Sub1_Sub1_Sub1_4.method45(true, 180, "go back to the main RuneScape webpage", 80, 16777215);
				local56 += 15;
				this.aClass4_Sub1_Sub1_Sub1_4.method45(true, 180, "and choose the 'create account'", 95, 16777215);
				local56 += 15;
				this.aClass4_Sub1_Sub1_Sub1_4.method45(true, 180, "button near the top of that page.", 110, 16777215);
				local56 += 15;
				this.aClass4_Sub1_Sub1_Sub2_12.method211(233, 107, 130);
				this.aClass4_Sub1_Sub1_Sub1_4.method45(true, 180, "Cancel", 155, 16777215);
			}
			this.aClass13_14.method188(171, super.aGraphics2, 202);
			if (this.aBoolean239) {
				this.aBoolean239 = false;
				this.aClass13_12.method188(0, super.aGraphics2, 128);
				this.aClass13_13.method188(371, super.aGraphics2, 202);
				this.aClass13_17.method188(265, super.aGraphics2, 0);
				this.aClass13_18.method188(265, super.aGraphics2, 562);
				this.aClass13_19.method188(171, super.aGraphics2, 128);
				this.aClass13_20.method188(171, super.aGraphics2, 562);
			}
		} catch (@Pc(498) RuntimeException local498) {
			signlink.reporterror("45013, " + arg0 + ", " + 8 + ", " + local498.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!PCARWQQC;I)Z")
	private boolean method647(@OriginalArg(0) Class26 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt337;
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
				this.aStringArray8[this.anInt990] = "Remove @whi@" + this.aStringArray14[local4];
				this.anIntArray229[this.anInt990] = 140;
				this.anInt990++;
				this.aStringArray8[this.anInt990] = "Message @whi@" + this.aStringArray14[local4];
				this.anIntArray229[this.anInt990] = 363;
				this.anInt990++;
				return true;
			} else if (local4 >= 401 && local4 <= 500) {
				this.aStringArray8[this.anInt990] = "Remove @whi@" + arg0.aString9;
				this.anIntArray229[this.anInt990] = 9;
				this.anInt990++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("30421, " + arg0 + ", " + 1 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method648(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			if (super.anInt824 == 1) {
				if (super.anInt825 >= 6 && super.anInt825 <= 106 && super.anInt826 >= 467 && super.anInt826 <= 499) {
					this.anInt940 = (this.anInt940 + 1) % 4;
					this.aBoolean232 = true;
					this.aBoolean260 = true;
					this.aClass4_Sub1_Sub3_6.method91(206);
					this.aClass4_Sub1_Sub3_6.method92(this.anInt940);
					this.aClass4_Sub1_Sub3_6.method92(this.anInt1008);
					this.aClass4_Sub1_Sub3_6.method92(this.anInt1018);
				}
				if (super.anInt825 >= 135 && super.anInt825 <= 235 && super.anInt826 >= 467 && super.anInt826 <= 499) {
					this.anInt1008 = (this.anInt1008 + 1) % 3;
					this.aBoolean232 = true;
					this.aBoolean260 = true;
					this.aClass4_Sub1_Sub3_6.method91(206);
					this.aClass4_Sub1_Sub3_6.method92(this.anInt940);
					this.aClass4_Sub1_Sub3_6.method92(this.anInt1008);
					this.aClass4_Sub1_Sub3_6.method92(this.anInt1018);
				}
				if (super.anInt825 >= 273 && super.anInt825 <= 373 && super.anInt826 >= 467 && super.anInt826 <= 499) {
					this.anInt1018 = (this.anInt1018 + 1) % 3;
					this.aBoolean232 = true;
					this.aBoolean260 = true;
					this.aClass4_Sub1_Sub3_6.method91(206);
					this.aClass4_Sub1_Sub3_6.method92(this.anInt940);
					this.aClass4_Sub1_Sub3_6.method92(this.anInt1008);
					this.aClass4_Sub1_Sub3_6.method92(this.anInt1018);
				}
				if (super.anInt825 >= 412 && super.anInt825 <= 512 && super.anInt826 >= 467 && super.anInt826 <= 499) {
					if (this.anInt863 == -1) {
						this.method712();
						this.aString22 = "";
						this.aBoolean264 = false;
						this.anInt1055 = this.anInt863 = Class26.anInt325;
						return;
					}
					this.method718("Please close the interface you have open before using 'report abuse'", "", 0);
					return;
				}
			}
		} catch (@Pc(201) RuntimeException local201) {
			signlink.reporterror("10689, " + arg0 + ", " + local201.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method584(@OriginalArg(0) int arg0) {
		try {
			this.anIntArrayArray23 = null;
			this.anIntArray256 = null;
			this.aByteArrayArray5 = null;
			this.aByteArrayArray6 = null;
			this.anIntArray257 = null;
			this.anIntArray258 = null;
			this.aClass30ArrayArrayArray1 = null;
			this.aClass30_12 = null;
			this.aClass4_Sub1_Sub1_Sub2_4 = null;
			this.aClass4_Sub1_Sub1_Sub2_5 = null;
			this.aClass4_Sub1_Sub1_Sub2_6 = null;
			this.aClass4_Sub1_Sub1_Sub2_7 = null;
			this.aClass4_Sub1_Sub1_Sub2_8 = null;
			this.anIntArray219 = null;
			this.anIntArray220 = null;
			this.aClass4_Sub1_Sub1_Sub3Array7 = null;
			this.aClass4_Sub1_Sub1_Sub2_18 = null;
			this.aClass4_Sub1_Sub1_Sub2_19 = null;
			this.aClass4_Sub1_Sub1_Sub2_20 = null;
			this.aClass4_Sub1_Sub3_6 = null;
			this.aClass4_Sub1_Sub3_7 = null;
			this.aClass4_Sub1_Sub3_9 = null;
			this.aClass4_Sub1_Sub2_Sub5_Sub1Array1 = null;
			this.anIntArray266 = null;
			this.aStringArray14 = null;
			this.aLongArray3 = null;
			this.anIntArray235 = null;
			this.aClass4_Sub1_Sub1_Sub3_3 = null;
			this.aClass4_Sub1_Sub1_Sub3Array5 = null;
			this.aClass4_Sub1_Sub1_Sub3Array8 = null;
			this.aClass4_Sub1_Sub1_Sub3Array10 = null;
			this.aClass4_Sub1_Sub1_Sub3Array9 = null;
			this.aClass4_Sub1_Sub1_Sub3Array6 = null;
			this.aClass4_Sub1_Sub1_Sub3_9 = null;
			this.method671();
			this.aClass13_21 = null;
			this.aClass13_22 = null;
			this.aClass13_23 = null;
			this.aClass13_17 = null;
			this.aClass13_18 = null;
			this.aClass13_19 = null;
			this.aClass13_20 = null;
			this.aClass13_3 = null;
			this.aClass13_4 = null;
			this.aClass13_5 = null;
			this.aClass13_6 = null;
			this.aClass4_Sub1_Sub1_Sub2_13 = null;
			this.aClass4_Sub1_Sub1_Sub2_14 = null;
			this.aClass4_Sub1_Sub1_Sub2_15 = null;
			this.aClass4_Sub1_Sub1_Sub2_16 = null;
			this.aClass4_Sub1_Sub1_Sub2_17 = null;
			this.aClass4_Sub1_Sub2_Sub5_Sub2Array1 = null;
			this.anIntArray273 = null;
			this.anIntArray274 = null;
			this.aClass4_Sub1_Sub3Array1 = null;
			this.anIntArray216 = null;
			this.aByteArray21 = null;
			this.aClass4_Sub1_Sub1_Sub2Array2 = null;
			this.aClass4_Sub1_Sub1_Sub2_1 = null;
			this.aClass4_Sub1_Sub1_Sub2_2 = null;
			this.aClass4_Sub1_Sub1_Sub2_3 = null;
			this.anIntArrayArrayArray8 = null;
			@Pc(189) boolean local189 = false;
			this.aByteArrayArrayArray8 = null;
			this.aClass45_1 = null;
			this.aClass50Array1 = null;
			this.aClass13_15 = null;
			this.aClass13_16 = null;
			this.aClass13_12 = null;
			this.aClass13_13 = null;
			this.aClass13_14 = null;
			this.aClass4_Sub1_Sub1_Sub3_17 = null;
			this.aClass13_7 = null;
			this.aClass13_8 = null;
			this.aClass13_9 = null;
			this.aClass13_10 = null;
			this.aClass13_11 = null;
			if (this.aClass9_1 != null) {
				this.aClass9_1.aBoolean53 = false;
			}
			this.aClass9_1 = null;
			this.anIntArray276 = null;
			this.aClass4_Sub1_Sub1_Sub3_12 = null;
			this.aClass4_Sub1_Sub1_Sub3_13 = null;
			this.aClass4_Sub1_Sub1_Sub3_14 = null;
			this.aClass4_Sub1_Sub1_Sub3_15 = null;
			this.aClass4_Sub1_Sub1_Sub3_16 = null;
			this.anIntArrayArray22 = null;
			this.anIntArrayArray24 = null;
			this.anIntArray244 = null;
			this.anIntArray245 = null;
			if (this.aClass20_Sub1_1 != null) {
				this.aClass20_Sub1_1.method289();
			}
			this.aClass20_Sub1_1 = null;
			this.aClass4_Sub1_Sub3_8 = null;
			try {
				if (this.aClass38_1 != null) {
					this.aClass38_1.method389();
				}
			} catch (@Pc(291) Exception local291) {
			}
			this.aClass38_1 = null;
			this.aClass13_24 = null;
			this.aClass13_25 = null;
			this.aClass13_26 = null;
			this.aClass13_27 = null;
			this.anIntArray227 = null;
			this.anIntArray228 = null;
			this.anIntArray229 = null;
			this.anIntArray230 = null;
			this.aStringArray8 = null;
			this.aClass30_10 = null;
			this.aClass30_11 = null;
			this.aClass4_Sub1_Sub1_Sub2Array5 = null;
			this.aClass4_Sub1_Sub1_Sub3Array4 = null;
			this.method677();
			Class28.method340(this.anInt901);
			Class33.method371(this.anInt901);
			Class24.method307(this.anInt901);
			Class26.method325(this.anInt901);
			Class41.aClass41Array1 = null;
			Class46.aClass46Array1 = null;
			Class22.aClass22Array1 = null;
			Class27.aClass27Array1 = null;
			Class16.aClass16Array1 = null;
			Class16.aClass7_1 = null;
			Class14.aClass14Array1 = null;
			super.aClass13_2 = null;
			Class4_Sub1_Sub2_Sub5_Sub2.aClass7_9 = null;
			Class4_Sub1_Sub1_Sub4.method555(this.anInt901);
			Class45.method430(this.anInt901);
			Class4_Sub1_Sub2_Sub3.method251(this.anInt901);
			Class37.method386(this.anInt901);
			System.gc();
		} catch (@Pc(382) RuntimeException local382) {
			signlink.reporterror("21942, " + arg0 + ", " + local382.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)V")
	private void method649(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
	private void method650(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean241 &= true;
			if (!aBoolean225) {
				for (@Pc(11) int local11 = 0; local11 < this.anIntArray260.length; local11++) {
					@Pc(18) int local18 = this.anIntArray260[local11];
					if (Class4_Sub1_Sub1_Sub4.anIntArray208[local18] >= arg0) {
						@Pc(27) Class4_Sub1_Sub1_Sub2 local27 = Class4_Sub1_Sub1_Sub4.aClass4_Sub1_Sub1_Sub2Array1[local18];
						@Pc(35) int local35 = local27.anInt155 * local27.anInt156 - 1;
						@Pc(43) int local43 = local27.anInt155 * this.anInt947 * 2;
						@Pc(46) byte[] local46 = local27.aByteArray4;
						@Pc(49) byte[] local49 = this.aByteArray21;
						for (@Pc(51) int local51 = 0; local51 <= local35; local51++) {
							local49[local51] = local46[local51 - local43 & local35];
						}
						local27.aByteArray4 = local49;
						this.aByteArray21 = local46;
						Class4_Sub1_Sub1_Sub4.method562(local18);
					}
				}
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("77938, " + arg0 + ", " + true + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBII)I")
	private int method651(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = arg0 >> 7;
			@Pc(7) int local7 = arg2 >> 7;
			if (local3 < 0 || local7 < 0 || local3 > 103 || local7 > 103) {
				return 0;
			}
			@Pc(21) int local21 = arg1;
			if (arg1 < 3 && (this.aByteArrayArrayArray8[1][local3][local7] & 0x2) == 2) {
				local21 = arg1 + 1;
			}
			@Pc(41) int local41 = arg0 & 0x7F;
			@Pc(45) int local45 = arg2 & 0x7F;
			@Pc(79) int local79 = this.anIntArrayArrayArray8[local21][local3][local7] * (128 - local41) + this.anIntArrayArrayArray8[local21][local3 + 1][local7] * local41 >> 7;
			@Pc(111) int local111 = this.anIntArrayArrayArray8[local21][local3][local7 + 1] * (128 - local41) + this.anIntArrayArrayArray8[local21][local3 + 1][local7 + 1] * local41 >> 7;
			return local79 * (128 - local45) + local111 * local45 >> 7;
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("67393, " + arg0 + ", " + -10 + ", " + arg1 + ", " + arg2 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	@Override
	public void method588(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}
		if (signlink.mainapp == null) {
			super.method588(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method652(@OriginalArg(0) byte arg0) {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt950);
			if (this.aClass20_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass20_Sub1_1.anInt252);
			}
			System.out.println("loop-cycle:" + anInt927);
			System.out.println("draw-cycle:" + anInt1025);
			if (arg0 != -36) {
				this.anInt902 = 478;
			}
			System.out.println("ptype:" + this.anInt996);
			System.out.println("psize:" + this.anInt995);
			if (this.aClass38_1 != null) {
				this.aClass38_1.method394(this.aByte40);
			}
			super.aBoolean216 = true;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("79325, " + arg0 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)Ljava/awt/Component;")
	@Override
	protected Component method587() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("29625, " + -61 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method653() {
		try {
			if (this.anInt990 >= 2 || this.anInt848 != 0 || this.anInt879 != 0) {
				@Pc(31) String local31;
				if (this.anInt848 == 1 && this.anInt990 < 2) {
					local31 = "Use " + this.aString20 + " with...";
				} else if (this.anInt879 == 1 && this.anInt990 < 2) {
					local31 = this.aString21 + "...";
				} else {
					local31 = this.aStringArray8[this.anInt990 - 1];
				}
				if (this.anInt990 > 2) {
					local31 = local31 + "@whi@ / " + (this.anInt990 - 2) + " more options";
				}
				this.aClass4_Sub1_Sub1_Sub1_4.method53(anInt927 / 1000, local31, 4, 16777215, 15);
			}
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("2016, " + -118 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BJ)V")
	private void method654(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt910 >= 100 && this.anInt831 != 1) {
					this.method718("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
				} else if (this.anInt910 >= 200) {
					this.method718("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
				} else {
					@Pc(38) String local38 = Class36.method382(Class36.method379(arg0), 78);
					for (@Pc(40) int local40 = 0; local40 < this.anInt910; local40++) {
						if (this.aLongArray3[local40] == arg0) {
							this.method718(local38 + " is already on your friend list", "", 0);
							return;
						}
					}
					for (@Pc(70) int local70 = 0; local70 < this.anInt933; local70++) {
						if (this.aLongArray4[local70] == arg0) {
							this.method718("Please remove " + local38 + " from your ignore list first", "", 0);
							return;
						}
					}
					if (!local38.equals(aClass4_Sub1_Sub2_Sub5_Sub2_1.aString16)) {
						this.aStringArray14[this.anInt910] = local38;
						this.aLongArray3[this.anInt910] = arg0;
						this.anIntArray235[this.anInt910] = 0;
						this.anInt910++;
						this.aBoolean255 = true;
						this.aClass4_Sub1_Sub3_6.method91(253);
						this.aClass4_Sub1_Sub3_6.method98(arg0, (byte) 7);
					}
				}
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("45996, " + 8 + ", " + arg0 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method655(@OriginalArg(0) int arg0) {
		try {
			if (super.aClass13_2 == null) {
				this.method677();
				this.aClass13_12 = null;
				this.aClass13_13 = null;
				this.aClass13_14 = null;
				this.aClass13_15 = null;
				@Pc(22) boolean local22 = false;
				this.aClass13_16 = null;
				this.aClass13_17 = null;
				this.aClass13_18 = null;
				this.aClass13_19 = null;
				this.aClass13_20 = null;
				this.aClass13_27 = null;
				this.aClass13_25 = null;
				this.aClass13_24 = null;
				this.aClass13_26 = null;
				this.aClass13_21 = null;
				this.aClass13_22 = null;
				this.aClass13_23 = null;
				super.aClass13_2 = new Class13(this.method587(), 765, 430, 503);
				this.aBoolean239 = true;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("37919, " + arg0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)V")
	private void method656(@OriginalArg(1) int arg0) {
		try {
			if (this.aByte44 != 92) {
				this.aClass4_Sub1_Sub3_6.method92(71);
			}
			@Pc(12) int local12 = Class14.aClass14Array1[arg0].anInt139;
			if (local12 != 0) {
				@Pc(20) int local20 = this.anIntArray276[arg0];
				if (local12 == 1) {
					if (local20 == 1) {
						Class4_Sub1_Sub1_Sub4.method564(0.9D);
					}
					if (local20 == 2) {
						Class4_Sub1_Sub1_Sub4.method564(0.8D);
					}
					if (local20 == 3) {
						Class4_Sub1_Sub1_Sub4.method564(0.7D);
					}
					if (local20 == 4) {
						Class4_Sub1_Sub1_Sub4.method564(0.6D);
					}
					Class24.aClass7_3.method87();
					this.aBoolean239 = true;
				}
				if (local12 == 3) {
					@Pc(58) boolean local58 = this.aBoolean231;
					if (local20 == 0) {
						this.method704(this.aBoolean231, 0);
						this.aBoolean231 = true;
					}
					if (local20 == 1) {
						this.method704(this.aBoolean231, -400);
						this.aBoolean231 = true;
					}
					if (local20 == 2) {
						this.method704(this.aBoolean231, -800);
						this.aBoolean231 = true;
					}
					if (local20 == 3) {
						this.method704(this.aBoolean231, -1200);
						this.aBoolean231 = true;
					}
					if (local20 == 4) {
						this.aBoolean231 = false;
					}
					if (this.aBoolean231 != local58 && !aBoolean225) {
						if (this.aBoolean231) {
							this.anInt961 = this.anInt836;
							this.aBoolean253 = true;
							this.aClass20_Sub1_1.method292(2, this.anInt961);
						} else {
							this.method671();
						}
						this.anInt861 = 0;
					}
				}
				if (local12 == 4) {
					if (local20 == 0) {
						this.aBoolean242 = true;
						this.method614(0);
					}
					if (local20 == 1) {
						this.aBoolean242 = true;
						this.method614(-400);
					}
					if (local20 == 2) {
						this.aBoolean242 = true;
						this.method614(-800);
					}
					if (local20 == 3) {
						this.aBoolean242 = true;
						this.method614(-1200);
					}
					if (local20 == 4) {
						this.aBoolean242 = false;
					}
				}
				if (local12 == 5) {
					this.anInt935 = local20;
				}
				if (local12 == 6) {
					this.anInt868 = local20;
				}
				if (local12 == 8) {
					this.anInt925 = local20;
					this.aBoolean260 = true;
				}
				if (local12 == 9) {
					this.anInt1026 = local20;
				}
			}
		} catch (@Pc(218) RuntimeException local218) {
			signlink.reporterror("99749, " + 92 + ", " + arg0 + ", " + local218.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method657() {
		try {
			@Pc(2) int local2 = this.anInt892;
			@Pc(5) int local5 = this.anInt893;
			@Pc(8) int local8 = this.anInt894;
			@Pc(11) int local11 = this.anInt895;
			Class4_Sub1_Sub1.method548(local2, 6116423, local5, local11, this.anInt945, local8);
			Class4_Sub1_Sub1.method548(local2 + 1, 0, local5 + 1, 16, this.anInt945, local8 - 2);
			Class4_Sub1_Sub1.method549(local8 - 2, local11 - 19, 0, local2 + 1, local5 + 18);
			this.aClass4_Sub1_Sub1_Sub1_4.method48(779, "Choose Option", local2 + 3, local5 + 14, 6116423);
			@Pc(70) int local70 = super.anInt819;
			@Pc(73) int local73 = super.anInt820;
			if (this.anInt891 == 0) {
				local70 -= 4;
				local73 -= 4;
			}
			if (this.anInt891 == 1) {
				local70 -= 553;
				local73 -= 205;
			}
			if (this.anInt891 == 2) {
				local70 -= 17;
				local73 -= 357;
			}
			for (@Pc(92) int local92 = 0; local92 < this.anInt990; local92++) {
				@Pc(107) int local107 = local5 + (this.anInt990 - 1 - local92) * 15 + 31;
				@Pc(109) int local109 = 16777215;
				if (local70 > local2 && local70 < local2 + local8 && local73 > local107 - 13 && local73 < local107 + 3) {
					local109 = 16776960;
				}
				this.aClass4_Sub1_Sub1_Sub1_4.method52(local2 + 3, local107, true, this.aStringArray8[local92], local109);
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("50860, " + 45528 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;)Z")
	private boolean method658(@OriginalArg(1) String arg0) {
		try {
			this.anInt995 += 0;
			if (arg0 == null) {
				return false;
			}
			for (@Pc(11) int local11 = 0; local11 < this.anInt910; local11++) {
				if (arg0.equalsIgnoreCase(this.aStringArray14[local11])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass4_Sub1_Sub2_Sub5_Sub2_1.aString16);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("36157, " + 0 + ", " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!FTMSICIZ;ZIILclient!YFPQHQAV;)V")
	private void method659(@OriginalArg(0) Class4_Sub1_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4_Sub1_Sub2_Sub5_Sub2 arg3) {
		try {
			@Pc(12) int local12;
			@Pc(21) int local21;
			@Pc(33) int local33;
			if ((arg1 & 0x20) != 0) {
				local12 = arg0.method131();
				if (local12 == 65535) {
					local12 = -1;
				}
				local21 = arg0.method122();
				if (local12 == arg3.anInt715 && local12 != -1) {
					local33 = Class27.aClass27Array1[local12].anInt374;
					if (local33 == 1) {
						arg3.anInt716 = 0;
						arg3.anInt717 = 0;
						arg3.anInt718 = local21;
						arg3.anInt719 = 0;
					}
					if (local33 == 2) {
						arg3.anInt719 = 0;
					}
				} else if (local12 == -1 || arg3.anInt715 == -1 || Class27.aClass27Array1[local12].anInt368 >= Class27.aClass27Array1[arg3.anInt715].anInt368) {
					arg3.anInt715 = local12;
					arg3.anInt716 = 0;
					arg3.anInt717 = 0;
					arg3.anInt718 = local21;
					arg3.anInt719 = 0;
					arg3.anInt705 = arg3.anInt737;
				}
			}
			if ((arg1 & 0x40) != 0) {
				local12 = arg0.method102();
				@Pc(102) byte[] local102 = new byte[local12];
				@Pc(108) Class4_Sub1_Sub3 local108 = new Class4_Sub1_Sub3(local102, (byte) 3);
				arg0.method111(local102, local12);
				this.aClass4_Sub1_Sub3Array1[arg2] = local108;
				arg3.method501(local108);
			}
			if ((arg1 & 0x80) != 0) {
				arg3.aString15 = arg0.method109();
				if (arg3.aString15.charAt(0) == '~') {
					arg3.aString15 = arg3.aString15.substring(1);
					this.method718(arg3.aString15, arg3.aString16, 2);
				} else if (arg3 == aClass4_Sub1_Sub2_Sub5_Sub2_1) {
					this.method718(arg3.aString15, arg3.aString16, 2);
				}
				arg3.anInt721 = 0;
				arg3.anInt729 = 0;
				arg3.anInt732 = 150;
			}
			if ((arg1 & 0x4) != 0) {
				local12 = arg0.method122();
				local21 = arg0.method102();
				arg3.method497(local21, this.anInt867, local12, anInt927);
				arg3.anInt734 = anInt927 + 300;
				arg3.anInt735 = arg0.method122();
				arg3.anInt736 = arg0.method123();
			}
			if ((arg1 & 0x8) != 0) {
				local12 = arg0.method104();
				local21 = arg0.method123();
				local33 = arg0.method122();
				@Pc(224) int local224 = arg0.anInt101;
				if (arg3.aString16 != null && arg3.aBoolean192) {
					@Pc(234) long local234 = Class36.method378(arg3.aString16);
					@Pc(236) boolean local236 = false;
					if (local21 <= 1) {
						for (@Pc(241) int local241 = 0; local241 < this.anInt933; local241++) {
							if (this.aLongArray4[local241] == local234) {
								local236 = true;
								break;
							}
						}
					}
					if (!local236 && this.anInt944 == 0) {
						try {
							this.aClass4_Sub1_Sub3_8.anInt101 = 0;
							arg0.method141(this.aClass4_Sub1_Sub3_8.aByteArray3, local33);
							this.aClass4_Sub1_Sub3_8.anInt101 = 0;
							@Pc(286) String local286 = Class35.method375(this.aClass4_Sub1_Sub3_8, local33);
							@Pc(290) String local290 = Class10.method157(local286);
							arg3.aString15 = local290;
							arg3.anInt721 = local12 >> 8;
							arg3.anInt729 = local12 & 0xFF;
							arg3.anInt732 = 150;
							if (local21 == 2 || local21 == 3) {
								this.method718(local290, "@cr2@" + arg3.aString16, 1);
							} else if (local21 == 1) {
								this.method718(local290, "@cr1@" + arg3.aString16, 1);
							} else {
								this.method718(local290, arg3.aString16, 2);
							}
						} catch (@Pc(354) Exception local354) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg0.anInt101 = local224 + local33;
			}
			if ((arg1 & 0x100) != 0) {
				arg3.anInt689 = arg0.method104();
				local12 = arg0.method138(this.anInt934);
				arg3.anInt693 = local12 >> 16;
				arg3.anInt692 = anInt927 + (local12 & 0xFFFF);
				arg3.anInt690 = 0;
				arg3.anInt691 = 0;
				if (arg3.anInt692 > anInt927) {
					arg3.anInt690 = -1;
				}
				if (arg3.anInt689 == 65535) {
					arg3.anInt689 = -1;
				}
			}
			if ((arg1 & 0x400) != 0) {
				local12 = arg0.method102();
				local21 = arg0.method121();
				arg3.method497(local21, this.anInt867, local12, anInt927);
				arg3.anInt734 = anInt927 + 300;
				arg3.anInt735 = arg0.method122();
				arg3.anInt736 = arg0.method122();
			}
			if ((arg1 & 0x1) != 0) {
				arg3.anInt727 = arg0.method131();
				arg3.anInt728 = arg0.method131();
			}
			if ((arg1 & 0x200) != 0) {
				arg3.anInt697 = arg0.method102();
				arg3.anInt699 = arg0.method122();
				arg3.anInt698 = arg0.method123();
				arg3.anInt700 = arg0.method102();
				arg3.anInt701 = arg0.method104() + anInt927;
				arg3.anInt702 = arg0.method104() + anInt927;
				arg3.anInt703 = arg0.method121();
				arg3.method495();
			}
			if ((arg1 & 0x2) != 0) {
				arg3.anInt720 = arg0.method104();
				if (arg3.anInt720 == 65535) {
					arg3.anInt720 = -1;
					return;
				}
			}
		} catch (@Pc(513) RuntimeException local513) {
			signlink.reporterror("92322, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local513.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BII)V")
	private void method660(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(8) boolean local8 = false;
			for (@Pc(17) int local17 = 0; local17 < 100; local17++) {
				if (this.aStringArray11[local17] != null) {
					@Pc(29) int local29 = this.anIntArray247[local17];
					@Pc(40) int local40 = this.anInt899 + 70 + 4 - local3 * 14;
					if (local40 < -20) {
						break;
					}
					@Pc(48) String local48 = this.aStringArray10[local17];
					if (local48 != null && local48.startsWith("@cr1@")) {
						local48 = local48.substring(5);
					}
					if (local48 != null && local48.startsWith("@cr2@")) {
						local48 = local48.substring(5);
					}
					if (local29 == 0) {
						local3++;
					}
					if ((local29 == 1 || local29 == 2) && (local29 == 1 || this.anInt940 == 0 || this.anInt940 == 1 && this.method658(local48))) {
						if (arg1 > local40 - 14 && arg1 <= local40 && !local48.equals(aClass4_Sub1_Sub2_Sub5_Sub2_1.aString16)) {
							if (this.anInt877 >= 1) {
								this.aStringArray8[this.anInt990] = "Report abuse @whi@" + local48;
								this.anIntArray229[this.anInt990] = 243;
								this.anInt990++;
							}
							this.aStringArray8[this.anInt990] = "Add ignore @whi@" + local48;
							this.anIntArray229[this.anInt990] = 950;
							this.anInt990++;
							this.aStringArray8[this.anInt990] = "Add friend @whi@" + local48;
							this.anIntArray229[this.anInt990] = 143;
							this.anInt990++;
						}
						local3++;
					}
					if ((local29 == 3 || local29 == 7) && this.anInt925 == 0 && (local29 == 7 || this.anInt1008 == 0 || this.anInt1008 == 1 && this.method658(local48))) {
						if (arg1 > local40 - 14 && arg1 <= local40) {
							if (this.anInt877 >= 1) {
								this.aStringArray8[this.anInt990] = "Report abuse @whi@" + local48;
								this.anIntArray229[this.anInt990] = 243;
								this.anInt990++;
							}
							this.aStringArray8[this.anInt990] = "Add ignore @whi@" + local48;
							this.anIntArray229[this.anInt990] = 950;
							this.anInt990++;
							this.aStringArray8[this.anInt990] = "Add friend @whi@" + local48;
							this.anIntArray229[this.anInt990] = 143;
							this.anInt990++;
						}
						local3++;
					}
					if (local29 == 4 && (this.anInt1018 == 0 || this.anInt1018 == 1 && this.method658(local48))) {
						if (arg1 > local40 - 14 && arg1 <= local40) {
							this.aStringArray8[this.anInt990] = "Accept trade @whi@" + local48;
							this.anIntArray229[this.anInt990] = 793;
							this.anInt990++;
						}
						local3++;
					}
					if ((local29 == 5 || local29 == 6) && this.anInt925 == 0 && this.anInt1008 < 2) {
						local3++;
					}
					if (local29 == 8 && (this.anInt1018 == 0 || this.anInt1018 == 1 && this.method658(local48))) {
						if (arg1 > local40 - 14 && arg1 <= local40) {
							this.aStringArray8[this.anInt990] = "Accept challenge @whi@" + local48;
							this.anIntArray229[this.anInt990] = 510;
							this.anInt990++;
						}
						local3++;
					}
				}
			}
		} catch (@Pc(413) RuntimeException local413) {
			signlink.reporterror("78563, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local413.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method661(@OriginalArg(0) boolean arg0) {
		try {
			for (@Pc(11) int local11 = 0; local11 < this.anInt1013; local11++) {
				@Pc(21) Class4_Sub1_Sub2_Sub5_Sub1 local21 = this.aClass4_Sub1_Sub2_Sub5_Sub1Array1[this.anIntArray266[local11]];
				@Pc(30) int local30 = (this.anIntArray266[local11] << 14) + 536870912;
				if (local21 != null && local21.method499(172) && local21.aClass33_1.aBoolean155 == arg0 && local21.aClass33_1.method367()) {
					@Pc(51) int local51 = local21.anInt694 >> 7;
					@Pc(56) int local56 = local21.anInt695 >> 7;
					if (local51 >= 0 && local51 < 104 && local56 >= 0 && local56 < 104) {
						if (local21.anInt706 == 1 && (local21.anInt694 & 0x7F) == 64 && (local21.anInt695 & 0x7F) == 64) {
							if (this.anIntArrayArray23[local51][local56] == this.anInt1033) {
								continue;
							}
							this.anIntArrayArray23[local51][local56] = this.anInt1033;
						}
						if (!local21.aClass33_1.aBoolean156) {
							local30 += Integer.MIN_VALUE;
						}
						this.aClass45_1.method442(this.method651(local21.anInt694, this.anInt981, local21.anInt695), local21, local21.anInt694, (local21.anInt706 - 1) * 64 + 60, local21.anInt695, local21.anInt696, this.anInt981, local21.aBoolean187, local30);
					}
				}
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("40728, " + arg0 + ", " + 0 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!CUNUEMWX;I)V")
	private void method662(@OriginalArg(0) Class4_Sub2 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt57 == 0) {
				local1 = this.aClass45_1.method457(arg0.anInt56, arg0.anInt58, arg0.anInt59);
			}
			if (arg0.anInt57 == 1) {
				local1 = this.aClass45_1.method458(arg0.anInt56, arg0.anInt58, arg0.anInt59);
			}
			if (arg0.anInt57 == 2) {
				local1 = this.aClass45_1.method459(arg0.anInt56, arg0.anInt58, arg0.anInt59);
			}
			if (arg0.anInt57 == 3) {
				local1 = this.aClass45_1.method460(arg0.anInt56, arg0.anInt58, arg0.anInt59);
			}
			if (local1 != 0) {
				@Pc(76) int local76 = this.aClass45_1.method461(arg0.anInt56, arg0.anInt58, arg0.anInt59, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local76 & 0x1F;
				local7 = local76 >> 6;
			}
			arg0.anInt48 = local3;
			arg0.anInt50 = local5;
			arg0.anInt49 = local7;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("71333, " + arg0 + ", " + 691 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method582() {
		this.method589("Starting up", 20);
		if (signlink.sunjava) {
			super.anInt813 = 5;
		}
		if (aBoolean251) {
			this.aBoolean249 = true;
			return;
		}
		aBoolean251 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method728();
		if (local25.endsWith("jagex.com")) {
			local21 = true;
		}
		if (local25.endsWith("runescape.com")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.2")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.231")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.229")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.228")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.227")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.226")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.224")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.223")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.221")) {
			local21 = true;
		}
		if (local25.endsWith("127.0.0.1")) {
			local21 = true;
		}
		if (!local21) {
			this.aBoolean229 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(107) int local107 = 0; local107 < 5; local107++) {
				this.aClass3Array1[local107] = new Class3(false, local107 + 1, signlink.aRandomAccessFile3, signlink.aRandomAccessFileArray1[local107], 600000);
			}
		}
		try {
			this.method665();
			this.aClass2_2 = this.method720("title screen", 1, this.anIntArray212[1], 25, "title");
			this.aClass4_Sub1_Sub1_Sub1_2 = new Class4_Sub1_Sub1_Sub1(this.aClass2_2, "p11_full", false, false);
			this.aClass4_Sub1_Sub1_Sub1_3 = new Class4_Sub1_Sub1_Sub1(this.aClass2_2, "p12_full", false, false);
			this.aClass4_Sub1_Sub1_Sub1_4 = new Class4_Sub1_Sub1_Sub1(this.aClass2_2, "b12_full", false, false);
			this.aClass4_Sub1_Sub1_Sub1_5 = new Class4_Sub1_Sub1_Sub1(this.aClass2_2, "q8_full", false, true);
			this.method612();
			this.method686();
			@Pc(203) Class2 local203 = this.method720("config", 2, this.anIntArray212[2], 30, "config");
			@Pc(215) Class2 local215 = this.method720("interface", 3, this.anIntArray212[3], 35, "interface");
			@Pc(227) Class2 local227 = this.method720("2d graphics", 4, this.anIntArray212[4], 40, "media");
			@Pc(239) Class2 local239 = this.method720("textures", 6, this.anIntArray212[6], 45, "textures");
			@Pc(251) Class2 local251 = this.method720("chat system", 7, this.anIntArray212[7], 50, "wordenc");
			@Pc(263) Class2 local263 = this.method720("sound effects", 8, this.anIntArray212[8], 55, "sounds");
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray8 = new int[4][105][105];
			this.aClass45_1 = new Class45(104, this.anIntArrayArrayArray8, 104, 0, 4);
			for (@Pc(288) int local288 = 0; local288 < 4; local288++) {
				this.aClass50Array1[local288] = new Class50(-14416, 104, 104);
			}
			this.aClass4_Sub1_Sub1_Sub3_9 = new Class4_Sub1_Sub1_Sub3(512, 512);
			@Pc(323) Class2 local323 = this.method720("update list", 5, this.anIntArray212[5], 60, "versionlist");
			this.method589("Connecting to update server", 60);
			this.aClass20_Sub1_1 = new Class20_Sub1();
			this.aClass20_Sub1_1.method299(local323, this);
			Class37.method384(this.aClass20_Sub1_1.method295());
			Class4_Sub1_Sub2_Sub3.method252(this.aClass20_Sub1_1.method285(0), this.aClass20_Sub1_1);
			if (!aBoolean225) {
				this.anInt961 = 0;
				this.aBoolean253 = true;
				this.aClass20_Sub1_1.method292(2, this.anInt961);
				while (this.aClass20_Sub1_1.method302() > 0) {
					this.method707();
					try {
						Thread.sleep(100L);
					} catch (@Pc(374) Exception local374) {
					}
					if (this.aClass20_Sub1_1.anInt256 > 3) {
						this.method649("ondemand");
						return;
					}
				}
			}
			this.method589("Requesting animations", 65);
			@Pc(398) int local398 = this.aClass20_Sub1_1.method285(1);
			for (@Pc(400) int local400 = 0; local400 < local398; local400++) {
				this.aClass20_Sub1_1.method292(1, local400);
			}
			@Pc(419) int local419;
			while (this.aClass20_Sub1_1.method302() > 0) {
				local419 = local398 - this.aClass20_Sub1_1.method302();
				if (local419 > 0) {
					this.method589("Loading animations - " + local419 * 100 / local398 + "%", 65);
				}
				this.method707();
				try {
					Thread.sleep(100L);
				} catch (@Pc(445) Exception local445) {
				}
				if (this.aClass20_Sub1_1.anInt256 > 3) {
					this.method649("ondemand");
					return;
				}
			}
			this.method589("Requesting models", 70);
			local398 = this.aClass20_Sub1_1.method285(0);
			@Pc(479) int local479;
			for (local419 = 0; local419 < local398; local419++) {
				local479 = this.aClass20_Sub1_1.method300(local419);
				if ((local479 & 0x1) != 0) {
					this.aClass20_Sub1_1.method292(0, local419);
				}
			}
			local398 = this.aClass20_Sub1_1.method302();
			while (this.aClass20_Sub1_1.method302() > 0) {
				local479 = local398 - this.aClass20_Sub1_1.method302();
				if (local479 > 0) {
					this.method589("Loading models - " + local479 * 100 / local398 + "%", 70);
				}
				this.method707();
				try {
					Thread.sleep(100L);
				} catch (@Pc(530) Exception local530) {
				}
			}
			if (this.aClass3Array1[0] != null) {
				this.method589("Requesting maps", 75);
				this.aClass20_Sub1_1.method292(3, this.aClass20_Sub1_1.method297(48, 0, 47));
				this.aClass20_Sub1_1.method292(3, this.aClass20_Sub1_1.method297(48, 1, 47));
				this.aClass20_Sub1_1.method292(3, this.aClass20_Sub1_1.method297(48, 0, 48));
				this.aClass20_Sub1_1.method292(3, this.aClass20_Sub1_1.method297(48, 1, 48));
				this.aClass20_Sub1_1.method292(3, this.aClass20_Sub1_1.method297(48, 0, 49));
				this.aClass20_Sub1_1.method292(3, this.aClass20_Sub1_1.method297(48, 1, 49));
				this.aClass20_Sub1_1.method292(3, this.aClass20_Sub1_1.method297(47, 0, 47));
				this.aClass20_Sub1_1.method292(3, this.aClass20_Sub1_1.method297(47, 1, 47));
				this.aClass20_Sub1_1.method292(3, this.aClass20_Sub1_1.method297(47, 0, 48));
				this.aClass20_Sub1_1.method292(3, this.aClass20_Sub1_1.method297(47, 1, 48));
				this.aClass20_Sub1_1.method292(3, this.aClass20_Sub1_1.method297(148, 0, 48));
				this.aClass20_Sub1_1.method292(3, this.aClass20_Sub1_1.method297(148, 1, 48));
				local398 = this.aClass20_Sub1_1.method302();
				while (this.aClass20_Sub1_1.method302() > 0) {
					local479 = local398 - this.aClass20_Sub1_1.method302();
					if (local479 > 0) {
						this.method589("Loading maps - " + local479 * 100 / local398 + "%", 75);
					}
					this.method707();
					try {
						Thread.sleep(100L);
					} catch (@Pc(715) Exception local715) {
					}
				}
			}
			local398 = this.aClass20_Sub1_1.method285(0);
			@Pc(736) int local736;
			for (local479 = 0; local479 < local398; local479++) {
				local736 = this.aClass20_Sub1_1.method300(local479);
				@Pc(738) byte local738 = 0;
				if ((local736 & 0x8) != 0) {
					local738 = 10;
				} else if ((local736 & 0x20) != 0) {
					local738 = 9;
				} else if ((local736 & 0x10) != 0) {
					local738 = 8;
				} else if ((local736 & 0x40) != 0) {
					local738 = 7;
				} else if ((local736 & 0x80) != 0) {
					local738 = 6;
				} else if ((local736 & 0x2) != 0) {
					local738 = 5;
				} else if ((local736 & 0x4) != 0) {
					local738 = 4;
				}
				if ((local736 & 0x1) != 0) {
					local738 = 3;
				}
				if (local738 != 0) {
					this.aClass20_Sub1_1.method291(0, local738, local479);
				}
			}
			this.aClass20_Sub1_1.method286(aBoolean224);
			if (!aBoolean225) {
				local398 = this.aClass20_Sub1_1.method285(2);
				for (local736 = 1; local736 < local398; local736++) {
					if (this.aClass20_Sub1_1.method293(local736)) {
						this.aClass20_Sub1_1.method291(2, (byte) 1, local736);
					}
				}
			}
			local398 = this.aClass20_Sub1_1.method285(0);
			@Pc(861) int local861;
			for (local736 = 0; local736 < local398; local736++) {
				local861 = this.aClass20_Sub1_1.method300(local736);
				if (local861 == 0 && this.aClass20_Sub1_1.anInt255 < 200) {
					this.aClass20_Sub1_1.method291(0, (byte) 1, local736);
				}
			}
			this.method589("Unpacking media", 80);
			this.aClass4_Sub1_Sub1_Sub2_18 = new Class4_Sub1_Sub1_Sub2(local227, "invback", 0);
			this.aClass4_Sub1_Sub1_Sub2_20 = new Class4_Sub1_Sub1_Sub2(local227, "chatback", 0);
			this.aClass4_Sub1_Sub1_Sub2_19 = new Class4_Sub1_Sub1_Sub2(local227, "mapback", 0);
			this.aClass4_Sub1_Sub1_Sub2_1 = new Class4_Sub1_Sub1_Sub2(local227, "backbase1", 0);
			this.aClass4_Sub1_Sub1_Sub2_2 = new Class4_Sub1_Sub1_Sub2(local227, "backbase2", 0);
			this.aClass4_Sub1_Sub1_Sub2_3 = new Class4_Sub1_Sub1_Sub2(local227, "backhmid1", 0);
			for (local861 = 0; local861 < 13; local861++) {
				this.aClass4_Sub1_Sub1_Sub2Array2[local861] = new Class4_Sub1_Sub1_Sub2(local227, "sideicons", local861);
			}
			this.aClass4_Sub1_Sub1_Sub3_3 = new Class4_Sub1_Sub1_Sub3(local227, "compass", 0);
			this.aClass4_Sub1_Sub1_Sub3_4 = new Class4_Sub1_Sub1_Sub3(local227, "mapedge", 0);
			this.aClass4_Sub1_Sub1_Sub3_4.method236();
			for (@Pc(972) int local972 = 0; local972 < 72; local972++) {
				this.aClass4_Sub1_Sub1_Sub2Array5[local972] = new Class4_Sub1_Sub1_Sub2(local227, "mapscene", local972);
			}
			for (@Pc(990) int local990 = 0; local990 < 70; local990++) {
				this.aClass4_Sub1_Sub1_Sub3Array4[local990] = new Class4_Sub1_Sub1_Sub3(local227, "mapfunction", local990);
			}
			for (@Pc(1008) int local1008 = 0; local1008 < 5; local1008++) {
				this.aClass4_Sub1_Sub1_Sub3Array5[local1008] = new Class4_Sub1_Sub1_Sub3(local227, "hitmarks", local1008);
			}
			for (@Pc(1026) int local1026 = 0; local1026 < 6; local1026++) {
				this.aClass4_Sub1_Sub1_Sub3Array8[local1026] = new Class4_Sub1_Sub1_Sub3(local227, "headicons_pk", local1026);
			}
			for (@Pc(1044) int local1044 = 0; local1044 < 9; local1044++) {
				this.aClass4_Sub1_Sub1_Sub3Array10[local1044] = new Class4_Sub1_Sub1_Sub3(local227, "headicons_prayer", local1044);
			}
			for (@Pc(1062) int local1062 = 0; local1062 < 6; local1062++) {
				this.aClass4_Sub1_Sub1_Sub3Array9[local1062] = new Class4_Sub1_Sub1_Sub3(local227, "headicons_hint", local1062);
			}
			this.aClass4_Sub1_Sub1_Sub3_17 = new Class4_Sub1_Sub1_Sub3(local227, "overlay_multiway", 0);
			this.aClass4_Sub1_Sub1_Sub3_10 = new Class4_Sub1_Sub1_Sub3(local227, "mapmarker", 0);
			this.aClass4_Sub1_Sub1_Sub3_11 = new Class4_Sub1_Sub1_Sub3(local227, "mapmarker", 1);
			for (@Pc(1104) int local1104 = 0; local1104 < 8; local1104++) {
				this.aClass4_Sub1_Sub1_Sub3Array6[local1104] = new Class4_Sub1_Sub1_Sub3(local227, "cross", local1104);
			}
			this.aClass4_Sub1_Sub1_Sub3_12 = new Class4_Sub1_Sub1_Sub3(local227, "mapdots", 0);
			this.aClass4_Sub1_Sub1_Sub3_13 = new Class4_Sub1_Sub1_Sub3(local227, "mapdots", 1);
			this.aClass4_Sub1_Sub1_Sub3_14 = new Class4_Sub1_Sub1_Sub3(local227, "mapdots", 2);
			this.aClass4_Sub1_Sub1_Sub3_15 = new Class4_Sub1_Sub1_Sub3(local227, "mapdots", 3);
			this.aClass4_Sub1_Sub1_Sub3_16 = new Class4_Sub1_Sub1_Sub3(local227, "mapdots", 4);
			this.aClass4_Sub1_Sub1_Sub2_9 = new Class4_Sub1_Sub1_Sub2(local227, "scrollbar", 0);
			this.aClass4_Sub1_Sub1_Sub2_10 = new Class4_Sub1_Sub1_Sub2(local227, "scrollbar", 1);
			this.aClass4_Sub1_Sub1_Sub2_13 = new Class4_Sub1_Sub1_Sub2(local227, "redstone1", 0);
			this.aClass4_Sub1_Sub1_Sub2_14 = new Class4_Sub1_Sub1_Sub2(local227, "redstone2", 0);
			this.aClass4_Sub1_Sub1_Sub2_15 = new Class4_Sub1_Sub1_Sub2(local227, "redstone3", 0);
			this.aClass4_Sub1_Sub1_Sub2_16 = new Class4_Sub1_Sub1_Sub2(local227, "redstone1", 0);
			this.aClass4_Sub1_Sub1_Sub2_16.method208();
			this.aClass4_Sub1_Sub1_Sub2_17 = new Class4_Sub1_Sub1_Sub2(local227, "redstone2", 0);
			this.aClass4_Sub1_Sub1_Sub2_17.method208();
			this.aClass4_Sub1_Sub1_Sub2_4 = new Class4_Sub1_Sub1_Sub2(local227, "redstone1", 0);
			this.aClass4_Sub1_Sub1_Sub2_4.method209();
			this.aClass4_Sub1_Sub1_Sub2_5 = new Class4_Sub1_Sub1_Sub2(local227, "redstone2", 0);
			this.aClass4_Sub1_Sub1_Sub2_5.method209();
			this.aClass4_Sub1_Sub1_Sub2_6 = new Class4_Sub1_Sub1_Sub2(local227, "redstone3", 0);
			this.aClass4_Sub1_Sub1_Sub2_6.method209();
			this.aClass4_Sub1_Sub1_Sub2_7 = new Class4_Sub1_Sub1_Sub2(local227, "redstone1", 0);
			this.aClass4_Sub1_Sub1_Sub2_7.method208();
			this.aClass4_Sub1_Sub1_Sub2_7.method209();
			this.aClass4_Sub1_Sub1_Sub2_8 = new Class4_Sub1_Sub1_Sub2(local227, "redstone2", 0);
			this.aClass4_Sub1_Sub1_Sub2_8.method208();
			this.aClass4_Sub1_Sub1_Sub2_8.method209();
			for (@Pc(1294) int local1294 = 0; local1294 < 2; local1294++) {
				this.aClass4_Sub1_Sub1_Sub2Array4[local1294] = new Class4_Sub1_Sub1_Sub2(local227, "mod_icons", local1294);
			}
			@Pc(1317) Class4_Sub1_Sub1_Sub3 local1317 = new Class4_Sub1_Sub1_Sub3(local227, "backleft1", 0);
			this.aClass13_3 = new Class13(this.method587(), local1317.anInt215, 430, local1317.anInt216);
			local1317.method237(0, 0);
			@Pc(1342) Class4_Sub1_Sub1_Sub3 local1342 = new Class4_Sub1_Sub1_Sub3(local227, "backleft2", 0);
			this.aClass13_4 = new Class13(this.method587(), local1342.anInt215, 430, local1342.anInt216);
			local1342.method237(0, 0);
			@Pc(1367) Class4_Sub1_Sub1_Sub3 local1367 = new Class4_Sub1_Sub1_Sub3(local227, "backright1", 0);
			this.aClass13_5 = new Class13(this.method587(), local1367.anInt215, 430, local1367.anInt216);
			local1367.method237(0, 0);
			@Pc(1392) Class4_Sub1_Sub1_Sub3 local1392 = new Class4_Sub1_Sub1_Sub3(local227, "backright2", 0);
			this.aClass13_6 = new Class13(this.method587(), local1392.anInt215, 430, local1392.anInt216);
			local1392.method237(0, 0);
			@Pc(1417) Class4_Sub1_Sub1_Sub3 local1417 = new Class4_Sub1_Sub1_Sub3(local227, "backtop1", 0);
			this.aClass13_7 = new Class13(this.method587(), local1417.anInt215, 430, local1417.anInt216);
			local1417.method237(0, 0);
			@Pc(1442) Class4_Sub1_Sub1_Sub3 local1442 = new Class4_Sub1_Sub1_Sub3(local227, "backvmid1", 0);
			this.aClass13_8 = new Class13(this.method587(), local1442.anInt215, 430, local1442.anInt216);
			local1442.method237(0, 0);
			@Pc(1467) Class4_Sub1_Sub1_Sub3 local1467 = new Class4_Sub1_Sub1_Sub3(local227, "backvmid2", 0);
			this.aClass13_9 = new Class13(this.method587(), local1467.anInt215, 430, local1467.anInt216);
			local1467.method237(0, 0);
			@Pc(1492) Class4_Sub1_Sub1_Sub3 local1492 = new Class4_Sub1_Sub1_Sub3(local227, "backvmid3", 0);
			this.aClass13_10 = new Class13(this.method587(), local1492.anInt215, 430, local1492.anInt216);
			local1492.method237(0, 0);
			@Pc(1517) Class4_Sub1_Sub1_Sub3 local1517 = new Class4_Sub1_Sub1_Sub3(local227, "backhmid2", 0);
			this.aClass13_11 = new Class13(this.method587(), local1517.anInt215, 430, local1517.anInt216);
			local1517.method237(0, 0);
			@Pc(1542) int local1542 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1549) int local1549 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1556) int local1556 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1563) int local1563 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1565) int local1565 = 0; local1565 < 100; local1565++) {
				if (this.aClass4_Sub1_Sub1_Sub3Array4[local1565] != null) {
					this.aClass4_Sub1_Sub1_Sub3Array4[local1565].method235(aBoolean254, local1549 + local1563, local1556 + local1563, local1542 + local1563);
				}
				if (this.aClass4_Sub1_Sub1_Sub2Array5[local1565] != null) {
					this.aClass4_Sub1_Sub1_Sub2Array5[local1565].method210(aBoolean254, local1549 + local1563, local1556 + local1563, local1542 + local1563);
				}
			}
			this.method589("Unpacking textures", 83);
			Class4_Sub1_Sub1_Sub4.method560(local239);
			Class4_Sub1_Sub1_Sub4.method564(0.8D);
			Class4_Sub1_Sub1_Sub4.method559();
			this.method589("Unpacking config", 86);
			Class27.method329(local203);
			Class28.method337(local203);
			Class41.method401(local203);
			Class24.method314(local203);
			Class33.method374(local203);
			Class46.method482(local203);
			Class16.method213(local203);
			Class14.method190(local203);
			Class25.method317(local203);
			Class24.aBoolean105 = aBoolean224;
			if (!aBoolean225) {
				this.method589("Unpacking sounds", 90);
				@Pc(1668) byte[] local1668 = local263.method7("sounds.dat", null);
				@Pc(1674) Class4_Sub1_Sub3 local1674 = new Class4_Sub1_Sub3(local1668, (byte) 3);
				Class40.method395(local1674);
			}
			this.method589("Unpacking interfaces", 95);
			@Pc(1705) Class4_Sub1_Sub1_Sub1[] local1705 = new Class4_Sub1_Sub1_Sub1[] { this.aClass4_Sub1_Sub1_Sub1_2, this.aClass4_Sub1_Sub1_Sub1_3, this.aClass4_Sub1_Sub1_Sub1_4, this.aClass4_Sub1_Sub1_Sub1_5 };
			Class26.method326(local1705, local227, local215);
			this.method589("Preparing game engine", 100);
			@Pc(1721) int local1721;
			@Pc(1723) int local1723;
			@Pc(1725) int local1725;
			for (@Pc(1717) int local1717 = 0; local1717 < 33; local1717++) {
				local1721 = 999;
				local1723 = 0;
				for (local1725 = 0; local1725 < 34; local1725++) {
					if (this.aClass4_Sub1_Sub1_Sub2_19.aByteArray4[local1725 + local1717 * this.aClass4_Sub1_Sub1_Sub2_19.anInt155] == 0) {
						if (local1721 == 999) {
							local1721 = local1725;
						}
					} else if (local1721 != 999) {
						local1723 = local1725;
						break;
					}
				}
				this.anIntArray221[local1717] = local1721;
				this.anIntArray268[local1717] = local1723 - local1721;
			}
			@Pc(1783) int local1783;
			for (local1721 = 5; local1721 < 156; local1721++) {
				local1723 = 999;
				local1725 = 0;
				for (local1783 = 25; local1783 < 172; local1783++) {
					if (this.aClass4_Sub1_Sub1_Sub2_19.aByteArray4[local1783 + local1721 * this.aClass4_Sub1_Sub1_Sub2_19.anInt155] == 0 && (local1783 > 34 || local1721 > 34)) {
						if (local1723 == 999) {
							local1723 = local1783;
						}
					} else if (local1723 != 999) {
						local1725 = local1783;
						break;
					}
				}
				this.anIntArray243[local1721 - 5] = local1723 - 25;
				this.anIntArray226[local1721 - 5] = local1725 - local1723;
			}
			Class4_Sub1_Sub1_Sub4.method557(503, (byte) 7, 765);
			this.anIntArray255 = Class4_Sub1_Sub1_Sub4.anIntArray206;
			Class4_Sub1_Sub1_Sub4.method557(96, (byte) 7, 479);
			this.anIntArray252 = Class4_Sub1_Sub1_Sub4.anIntArray206;
			Class4_Sub1_Sub1_Sub4.method557(261, (byte) 7, 190);
			this.anIntArray253 = Class4_Sub1_Sub1_Sub4.anIntArray206;
			Class4_Sub1_Sub1_Sub4.method557(334, (byte) 7, 512);
			this.anIntArray254 = Class4_Sub1_Sub1_Sub4.anIntArray206;
			@Pc(1874) int[] local1874 = new int[9];
			for (local1725 = 0; local1725 < 9; local1725++) {
				local1783 = local1725 * 32 + 128 + 15;
				@Pc(1892) int local1892 = local1783 * 3 + 600;
				@Pc(1896) int local1896 = Class4_Sub1_Sub1_Sub4.anIntArray204[local1783];
				local1874[local1725] = local1892 * local1896 >> 16;
			}
			Class45.method467(local1874);
			Class10.method147(local251);
			this.aClass9_1 = new Class9(0, this);
			this.method588(this.aClass9_1, 10);
			Class4_Sub1_Sub2_Sub2.aClient1 = this;
			Class28.aClient4 = this;
			Class33.aClient5 = this;
		} catch (@Pc(1937) Exception local1937) {
			signlink.reporterror("loaderror " + this.aString29 + " " + this.anInt1001);
			this.aBoolean244 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!PCARWQQC;I)Z")
	private boolean method663(@OriginalArg(0) Class26 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt337;
			if (this.anInt911 == 2) {
				if (local4 == 201) {
					this.aBoolean260 = true;
					this.anInt846 = 0;
					this.aBoolean248 = true;
					this.aString24 = "";
					this.anInt1022 = 1;
					this.aString25 = "Enter name of friend to add to list";
				}
				if (local4 == 202) {
					this.aBoolean260 = true;
					this.anInt846 = 0;
					this.aBoolean248 = true;
					this.aString24 = "";
					this.anInt1022 = 2;
					this.aString25 = "Enter name of friend to delete from list";
				}
			}
			if (local4 == 205) {
				this.anInt999 = 250;
				return true;
			}
			if (local4 == 501) {
				this.aBoolean260 = true;
				this.anInt846 = 0;
				this.aBoolean248 = true;
				this.aString24 = "";
				this.anInt1022 = 4;
				this.aString25 = "Enter name of player to add to list";
			}
			if (local4 == 502) {
				this.aBoolean260 = true;
				this.anInt846 = 0;
				this.aBoolean248 = true;
				this.aString24 = "";
				this.anInt1022 = 5;
				this.aString25 = "Enter name of player to delete from list";
			}
			@Pc(117) int local117;
			@Pc(121) int local121;
			@Pc(126) int local126;
			if (local4 >= 300 && local4 <= 313) {
				local117 = (local4 - 300) / 2;
				local121 = local4 & 0x1;
				local126 = this.anIntArray270[local117];
				if (local126 != -1) {
					while (true) {
						if (local121 == 0) {
							local126--;
							if (local126 < 0) {
								local126 = Class46.anInt680 - 1;
							}
						}
						if (local121 == 1) {
							local126++;
							if (local126 >= Class46.anInt680) {
								local126 = 0;
							}
						}
						if (!Class46.aClass46Array1[local126].aBoolean183 && Class46.aClass46Array1[local126].anInt681 == local117 + (this.aBoolean222 ? 0 : 7)) {
							this.anIntArray270[local117] = local126;
							this.aBoolean238 = true;
							break;
						}
					}
				}
			}
			if (local4 >= 314 && local4 <= 323) {
				local117 = (local4 - 314) / 2;
				local121 = local4 & 0x1;
				local126 = this.anIntArray232[local117];
				if (local121 == 0) {
					local126--;
					if (local126 < 0) {
						local126 = anIntArrayArray25[local117].length - 1;
					}
				}
				if (local121 == 1) {
					local126++;
					if (local126 >= anIntArrayArray25[local117].length) {
						local126 = 0;
					}
				}
				this.anIntArray232[local117] = local126;
				this.aBoolean238 = true;
			}
			if (local4 == 324 && !this.aBoolean222) {
				this.aBoolean222 = true;
				this.method673();
			}
			if (local4 == 325 && this.aBoolean222) {
				this.aBoolean222 = false;
				this.method673();
			}
			if (local4 == 326) {
				this.aClass4_Sub1_Sub3_6.method91(118);
				this.aClass4_Sub1_Sub3_6.method92(this.aBoolean222 ? 0 : 1);
				for (local117 = 0; local117 < 7; local117++) {
					this.aClass4_Sub1_Sub3_6.method92(this.anIntArray270[local117]);
				}
				for (local121 = 0; local121 < 5; local121++) {
					this.aClass4_Sub1_Sub3_6.method92(this.anIntArray232[local121]);
				}
				return true;
			}
			if (local4 == 620) {
				this.aBoolean264 = !this.aBoolean264;
			}
			if (local4 >= 601 && local4 <= 613) {
				this.method712();
				if (this.aString22.length() > 0) {
					this.aClass4_Sub1_Sub3_6.method91(167);
					this.aClass4_Sub1_Sub3_6.method98(Class36.method378(this.aString22), (byte) 7);
					this.aClass4_Sub1_Sub3_6.method92(local4 - 601);
					this.aClass4_Sub1_Sub3_6.method92(this.aBoolean264 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(354) RuntimeException local354) {
			signlink.reporterror("52471, " + arg0 + ", " + -818 + ", " + local354.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!ITVAFKCK;)V")
	private void method664(@OriginalArg(1) Class4_Sub1_Sub1_Sub2 arg0) {
		try {
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray223.length; local12++) {
				this.anIntArray223[local12] = 0;
			}
			@Pc(37) int local37;
			for (@Pc(27) int local27 = 0; local27 < 5000; local27++) {
				local37 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray223[local37] = (int) (Math.random() * 256.0D);
			}
			@Pc(55) int local55;
			@Pc(59) int local59;
			@Pc(67) int local67;
			for (local37 = 0; local37 < 20; local37++) {
				for (local55 = 1; local55 < 255; local55++) {
					for (local59 = 1; local59 < 127; local59++) {
						local67 = local59 + (local55 << 7);
						this.anIntArray224[local67] = (this.anIntArray223[local67 - 1] + this.anIntArray223[local67 + 1] + this.anIntArray223[local67 - 128] + this.anIntArray223[local67 + 128]) / 4;
					}
				}
				@Pc(113) int[] local113 = this.anIntArray223;
				this.anIntArray223 = this.anIntArray224;
				this.anIntArray224 = local113;
			}
			if (arg0 != null) {
				local55 = 0;
				for (local59 = 0; local59 < arg0.anInt156; local59++) {
					for (local67 = 0; local67 < arg0.anInt155; local67++) {
						if (arg0.aByteArray4[local55++] != 0) {
							@Pc(149) int local149 = local67 + arg0.anInt157 + 16;
							@Pc(156) int local156 = local59 + arg0.anInt158 + 16;
							@Pc(162) int local162 = local149 + (local156 << 7);
							this.anIntArray223[local162] = 0;
						}
					}
				}
			}
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("65868, " + false + ", " + arg0 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method665() {
		try {
			if (anInt919 != -6102) {
				this.aClass30ArrayArrayArray1 = null;
			}
			@Pc(9) int local9 = 5;
			this.anIntArray212[8] = 0;
			@Pc(16) int local16 = 0;
			while (this.anIntArray212[8] == 0) {
				@Pc(20) String local20 = "Unknown problem";
				this.method589("Connecting to web server", 20);
				try {
					@Pc(42) DataInputStream local42 = this.method622("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 372);
					@Pc(49) Class4_Sub1_Sub3 local49 = new Class4_Sub1_Sub3(new byte[40], (byte) 3);
					local42.readFully(local49.aByteArray3, 0, 40);
					local42.close();
					for (@Pc(59) int local59 = 0; local59 < 9; local59++) {
						this.anIntArray212[local59] = local49.method107();
					}
					@Pc(74) int local74 = local49.method107();
					@Pc(76) int local76 = 1234;
					for (@Pc(78) int local78 = 0; local78 < 9; local78++) {
						local76 = (local76 << 1) + this.anIntArray212[local78];
					}
					if (local74 != local76) {
						local20 = "checksum problem";
						this.anIntArray212[8] = 0;
					}
				} catch (@Pc(105) EOFException local105) {
					local20 = "EOF problem";
					this.anIntArray212[8] = 0;
				} catch (@Pc(114) IOException local114) {
					local20 = "connection problem";
					this.anIntArray212[8] = 0;
				} catch (@Pc(123) Exception local123) {
					local20 = "logic problem";
					this.anIntArray212[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray212[8] == 0) {
					local16++;
					for (@Pc(141) int local141 = local9; local141 > 0; local141--) {
						if (local16 >= 10) {
							this.method589("Game updated - please reload page", 10);
							local141 = 10;
						} else {
							this.method589(local20 + " - Will retry in " + local141 + " secs.", 10);
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
					this.aBoolean257 = !this.aBoolean257;
				}
			}
		} catch (@Pc(203) RuntimeException local203) {
			signlink.reporterror("23741, " + -6102 + ", " + local203.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method666(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt925 != 0) {
				@Pc(6) Class4_Sub1_Sub1_Sub1 local6 = this.aClass4_Sub1_Sub1_Sub1_3;
				@Pc(8) int local8 = 0;
				if (arg0 < 6 || arg0 > 6) {
					this.aBoolean223 = !this.aBoolean223;
				}
				if (this.anInt1040 != 0) {
					local8 = 1;
				}
				for (@Pc(29) int local29 = 0; local29 < 100; local29++) {
					if (this.aStringArray11[local29] != null) {
						@Pc(41) int local41 = this.anIntArray247[local29];
						@Pc(46) String local46 = this.aStringArray10[local29];
						@Pc(48) byte local48 = 0;
						if (local46 != null && local46.startsWith("@cr1@")) {
							local46 = local46.substring(5);
							local48 = 1;
						}
						if (local46 != null && local46.startsWith("@cr2@")) {
							local46 = local46.substring(5);
							local48 = 2;
						}
						@Pc(99) int local99;
						if ((local41 == 3 || local41 == 7) && (local41 == 7 || this.anInt1008 == 0 || this.anInt1008 == 1 && this.method658(local46))) {
							local99 = 329 - local8 * 13;
							local6.method48(779, "From", 4, local99, 0);
							local6.method48(779, "From", 4, local99 - 1, 65535);
							@Pc(124) int local124 = local6.method46("From ") + 4;
							if (local48 == 1) {
								this.aClass4_Sub1_Sub1_Sub2Array4[0].method211(233, local124, local99 - 12);
								local124 += 14;
							}
							if (local48 == 2) {
								this.aClass4_Sub1_Sub1_Sub2Array4[1].method211(233, local124, local99 - 12);
								local124 += 14;
							}
							local6.method48(779, local46 + ": " + this.aStringArray11[local29], local124, local99, 0);
							local6.method48(779, local46 + ": " + this.aStringArray11[local29], local124, local99 - 1, 65535);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local41 == 5 && this.anInt1008 < 2) {
							local99 = 329 - local8 * 13;
							local6.method48(779, this.aStringArray11[local29], 4, local99, 0);
							local6.method48(779, this.aStringArray11[local29], 4, local99 - 1, 65535);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local41 == 6 && this.anInt1008 < 2) {
							local99 = 329 - local8 * 13;
							local6.method48(779, "To " + local46 + ": " + this.aStringArray11[local29], 4, local99, 0);
							local6.method48(779, "To " + local46 + ": " + this.aStringArray11[local29], 4, local99 - 1, 65535);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(303) RuntimeException local303) {
			signlink.reporterror("32831, " + arg0 + ", " + local303.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method667() {
		try {
			this.aBoolean241 &= true;
			@Pc(18) int local18;
			for (@Pc(11) int local11 = 10; local11 < 117; local11++) {
				local18 = (int) (Math.random() * 100.0D);
				if (local18 < 50) {
					this.anIntArray213[local11 + 32512] = 255;
				}
			}
			@Pc(47) int local47;
			@Pc(54) int local54;
			@Pc(60) int local60;
			for (local18 = 0; local18 < 100; local18++) {
				local47 = (int) (Math.random() * 124.0D) + 2;
				local54 = (int) (Math.random() * 128.0D) + 128;
				local60 = local47 + (local54 << 7);
				this.anIntArray213[local60] = 192;
			}
			for (local47 = 1; local47 < 255; local47++) {
				for (local54 = 1; local54 < 127; local54++) {
					local60 = local54 + (local47 << 7);
					this.anIntArray214[local60] = (this.anIntArray213[local60 - 1] + this.anIntArray213[local60 + 1] + this.anIntArray213[local60 - 128] + this.anIntArray213[local60 + 128]) / 4;
				}
			}
			this.anInt979 += 128;
			if (this.anInt979 > this.anIntArray223.length) {
				this.anInt979 -= this.anIntArray223.length;
				local54 = (int) (Math.random() * 12.0D);
				this.method664(this.aClass4_Sub1_Sub1_Sub2Array3[local54]);
			}
			@Pc(172) int local172;
			for (local54 = 1; local54 < 255; local54++) {
				for (local60 = 1; local60 < 127; local60++) {
					local172 = local60 + (local54 << 7);
					@Pc(195) int local195 = this.anIntArray214[local172 + 128] - this.anIntArray223[local172 + this.anInt979 & this.anIntArray223.length - 1] / 5;
					if (local195 < 0) {
						local195 = 0;
					}
					this.anIntArray213[local172] = local195;
				}
			}
			for (local60 = 0; local60 < 255; local60++) {
				this.anIntArray215[local60] = this.anIntArray215[local60 + 1];
			}
			this.anIntArray215[255] = (int) (Math.sin((double) anInt927 / 14.0D) * 16.0D + Math.sin((double) anInt927 / 15.0D) * 14.0D + Math.sin((double) anInt927 / 16.0D) * 12.0D);
			if (this.anInt959 > 0) {
				this.anInt959 -= 4;
			}
			if (this.anInt960 > 0) {
				this.anInt960 -= 4;
			}
			if (this.anInt959 == 0 && this.anInt960 == 0) {
				local172 = (int) (Math.random() * 2000.0D);
				if (local172 == 0) {
					this.anInt959 = 1024;
				}
				if (local172 == 1) {
					this.anInt960 = 1024;
					return;
				}
			}
		} catch (@Pc(306) RuntimeException local306) {
			signlink.reporterror("80519, " + true + ", " + local306.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method668() {
		try {
			@Pc(22) int local22;
			@Pc(35) int local35;
			@Pc(39) int local39;
			@Pc(43) int local43;
			@Pc(91) int local91;
			@Pc(105) int local105;
			@Pc(117) int local117;
			@Pc(176) int local176;
			try {
				this.anInt907 = -1;
				this.aClass30_11.method350();
				this.aClass30_10.method350();
				Class4_Sub1_Sub1_Sub4.method558();
				this.method727();
				this.aClass45_1.method431();
				System.gc();
				for (local22 = 0; local22 < 4; local22++) {
					this.aClass50Array1[local22].method529();
				}
				for (local35 = 0; local35 < 4; local35++) {
					for (local39 = 0; local39 < 104; local39++) {
						for (local43 = 0; local43 < 104; local43++) {
							this.aByteArrayArrayArray8[local35][local39][local43] = 0;
						}
					}
				}
				@Pc(77) Class48 local77 = new Class48(this.anIntArrayArrayArray8, 104, this.aByteArrayArrayArray8, (byte) -61, 104);
				local43 = this.aByteArrayArray5.length;
				this.aClass4_Sub1_Sub3_6.method91(225);
				@Pc(238) int local238;
				@Pc(226) int local226;
				if (!this.aBoolean265) {
					@Pc(122) byte[] local122;
					for (local91 = 0; local91 < local43; local91++) {
						local105 = (this.anIntArray256[local91] >> 8) * 64 - this.anInt838;
						local117 = (this.anIntArray256[local91] & 0xFF) * 64 - this.anInt839;
						local122 = this.aByteArrayArray5[local91];
						if (local122 != null) {
							local77.method519(this.aClass50Array1, local117, (this.anInt1015 - 6) * 8, local122, local105, (this.anInt1014 - 6) * 8);
						}
					}
					for (local105 = 0; local105 < local43; local105++) {
						local117 = (this.anIntArray256[local105] >> 8) * 64 - this.anInt838;
						local176 = (this.anIntArray256[local105] & 0xFF) * 64 - this.anInt839;
						@Pc(181) byte[] local181 = this.aByteArrayArray5[local105];
						if (local181 == null && this.anInt1015 < 800) {
							local77.method517(local176, local117, 64, 64);
						}
					}
					this.aClass4_Sub1_Sub3_6.method91(225);
					for (local117 = 0; local117 < local43; local117++) {
						local122 = this.aByteArrayArray6[local117];
						if (local122 != null) {
							local226 = (this.anIntArray256[local117] >> 8) * 64 - this.anInt838;
							local238 = (this.anIntArray256[local117] & 0xFF) * 64 - this.anInt839;
							local77.method522(local226, local238, this.aClass50Array1, local122, this.aClass45_1);
						}
					}
				}
				if (this.aBoolean265) {
					local91 = 0;
					label254: while (true) {
						@Pc(293) int local293;
						@Pc(299) int local299;
						@Pc(305) int local305;
						@Pc(315) int local315;
						@Pc(317) int local317;
						if (local91 >= 4) {
							for (local105 = 0; local105 < 13; local105++) {
								for (local117 = 0; local117 < 13; local117++) {
									local176 = this.anIntArrayArrayArray7[0][local105][local117];
									if (local176 == -1) {
										local77.method517(local117 * 8, local105 * 8, 8, 8);
									}
								}
							}
							this.aClass4_Sub1_Sub3_6.method91(225);
							local117 = 0;
							while (true) {
								if (local117 >= 4) {
									break label254;
								}
								for (local176 = 0; local176 < 13; local176++) {
									for (local226 = 0; local226 < 13; local226++) {
										local238 = this.anIntArrayArrayArray7[local117][local176][local226];
										if (local238 != -1) {
											local293 = local238 >> 24 & 0x3;
											local299 = local238 >> 1 & 0x3;
											local305 = local238 >> 14 & 0x3FF;
											local315 = local238 >> 3 & 0x7FF;
											local317 = (local305 / 8 << 8) + local315 / 8;
											for (@Pc(497) int local497 = 0; local497 < this.anIntArray256.length; local497++) {
												if (this.anIntArray256[local497] == local317 && this.aByteArrayArray6[local497] != null) {
													local77.method509(local299, local293, local176 * 8, local226 * 8, this.aClass45_1, (local305 & 0x7) * 8, this.aByteArrayArray6[local497], local117, this.aClass50Array1, (local315 & 0x7) * 8);
													break;
												}
											}
										}
									}
								}
								local117++;
							}
						}
						for (local105 = 0; local105 < 13; local105++) {
							for (local117 = 0; local117 < 13; local117++) {
								@Pc(269) boolean local269 = false;
								local226 = this.anIntArrayArrayArray7[local91][local105][local117];
								if (local226 != -1) {
									local238 = local226 >> 24 & 0x3;
									local293 = local226 >> 1 & 0x3;
									local299 = local226 >> 14 & 0x3FF;
									local305 = local226 >> 3 & 0x7FF;
									local315 = (local299 / 8 << 8) + local305 / 8;
									for (local317 = 0; local317 < this.anIntArray256.length; local317++) {
										if (this.anIntArray256[local317] == local315 && this.aByteArrayArray5[local317] != null) {
											local77.method503(this.aByteArrayArray5[local317], local117 * 8, (local305 & 0x7) * 8, local238, (local299 & 0x7) * 8, local293, this.anInt936, local91, this.aClass50Array1, local105 * 8);
											local269 = true;
											break;
										}
									}
								}
								if (!local269) {
									local77.method504(local117 * 8, local91, local105 * 8);
								}
							}
						}
						local91++;
					}
				}
				this.aClass4_Sub1_Sub3_6.method91(225);
				local77.method521(this.aClass45_1, this.aClass50Array1);
				if (this.aClass13_26 != null) {
					this.aClass13_26.method187();
					Class4_Sub1_Sub1_Sub4.anIntArray206 = this.anIntArray254;
				}
				this.aClass4_Sub1_Sub3_6.method91(225);
				local91 = Class48.anInt758;
				if (local91 > this.anInt981) {
					local91 = this.anInt981;
				}
				if (local91 < this.anInt981 - 1) {
					local91 = this.anInt981 - 1;
				}
				if (aBoolean225) {
					this.aClass45_1.method432(Class48.anInt758);
				} else {
					this.aClass45_1.method432(0);
				}
				for (local105 = 0; local105 < 104; local105++) {
					for (local117 = 0; local117 < 104; local117++) {
						this.method597(local105, local117);
					}
				}
				this.method684();
			} catch (@Pc(646) Exception local646) {
			}
			Class28.aClass7_7.method87();
			if (super.aFrame_Sub1_2 != null) {
				this.aClass4_Sub1_Sub3_6.method91(133);
				this.aClass4_Sub1_Sub3_6.method96(1057001181);
			}
			if (aBoolean225 && signlink.aRandomAccessFile3 != null) {
				local22 = this.aClass20_Sub1_1.method285(0);
				for (local35 = 0; local35 < local22; local35++) {
					local39 = this.aClass20_Sub1_1.method300(local35);
					if ((local39 & 0x79) == 0) {
						Class4_Sub1_Sub2_Sub3.method254(local35);
					}
				}
			}
			System.gc();
			Class4_Sub1_Sub1_Sub4.method559();
			this.aClass20_Sub1_1.method283();
			local22 = (this.anInt1014 - 6) / 8 - 1;
			local35 = (this.anInt1014 + 6) / 8 + 1;
			local39 = (this.anInt1015 - 6) / 8 - 1;
			local43 = (this.anInt1015 + 6) / 8 + 1;
			if (this.aBoolean247) {
				local22 = 49;
				local35 = 50;
				local39 = 49;
				local43 = 50;
			}
			for (local91 = local22; local91 <= local35; local91++) {
				for (local105 = local39; local105 <= local43; local105++) {
					if (local91 == local22 || local91 == local35 || local105 == local39 || local105 == local43) {
						local117 = this.aClass20_Sub1_1.method297(local105, 0, local91);
						if (local117 != -1) {
							this.aClass20_Sub1_1.method294(local117, this.anInt833, 3);
						}
						local176 = this.aClass20_Sub1_1.method297(local105, 1, local91);
						if (local176 != -1) {
							this.aClass20_Sub1_1.method294(local176, this.anInt833, 3);
						}
					}
				}
			}
		} catch (@Pc(818) RuntimeException local818) {
			signlink.reporterror("18771, " + 4 + ", " + local818.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method669() {
		try {
			this.anInt995 += 0;
			if (aBoolean225 && this.anInt967 == 2 && Class48.anInt761 != this.anInt981) {
				this.method681(null, "Loading - please wait.");
				this.anInt967 = 1;
				this.aLong31 = System.currentTimeMillis();
			}
			if (this.anInt967 == 1) {
				@Pc(34) int local34 = this.method670();
				if (local34 != 0 && System.currentTimeMillis() - this.aLong31 > 360000L) {
					signlink.reporterror(this.aString18 + " glcfb " + this.aLong30 + "," + local34 + "," + aBoolean225 + "," + this.aClass3Array1[0] + "," + this.aClass20_Sub1_1.method302() + "," + this.anInt981 + "," + this.anInt1014 + "," + this.anInt1015);
					this.aLong31 = System.currentTimeMillis();
				}
			}
			if (this.anInt967 == 2 && this.anInt981 != this.anInt907) {
				this.anInt907 = this.anInt981;
				this.method676(this.anInt981);
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("85222, " + 0 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)I")
	private int method670() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray5.length; local3++) {
				if (this.aByteArrayArray5[local3] == null && this.anIntArray257[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray6[local3] == null && this.anIntArray258[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(41) int local41 = 0; local41 < this.aByteArrayArray5.length; local41++) {
				@Pc(48) byte[] local48 = this.aByteArrayArray6[local41];
				if (local48 != null) {
					@Pc(62) int local62 = (this.anIntArray256[local41] >> 8) * 64 - this.anInt838;
					@Pc(74) int local74 = (this.anIntArray256[local41] & 0xFF) * 64 - this.anInt839;
					if (this.aBoolean265) {
						local62 = 10;
						local74 = 10;
					}
					local39 &= Class48.method520(local48, local62, local74);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean252) {
				return -4;
			} else {
				this.anInt967 = 2;
				Class48.anInt761 = this.anInt981;
				this.method668();
				this.aClass4_Sub1_Sub3_6.method91(21);
				return 0;
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("58147, " + 76 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method671() {
		try {
			signlink.aBoolean267 = false;
			signlink.anInt1065 = 0;
			signlink.midi = "stop";
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("84784, " + 419 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method672(@OriginalArg(0) int arg0) {
		try {
			this.aClass13_24.method187();
			@Pc(7) boolean local7 = true;
			Class4_Sub1_Sub1_Sub4.anIntArray206 = this.anIntArray253;
			this.aClass4_Sub1_Sub1_Sub2_18.method211(233, 0, 0);
			if (this.anInt1032 != -1) {
				this.method617(0, 0, Class26.method319(this.anInt1032), 0);
			} else if (this.anIntArray265[this.anInt937] != -1) {
				this.method617(0, 0, Class26.method319(this.anIntArray265[this.anInt937]), 0);
			}
			if (this.aBoolean237 && this.anInt891 == 1) {
				this.method657();
			}
			this.aClass13_24.method188(205, super.aGraphics2, 553);
			this.aClass13_26.method187();
			Class4_Sub1_Sub1_Sub4.anIntArray206 = this.anIntArray254;
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("48081, " + arg0 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method673() {
		try {
			this.aBoolean238 = true;
			for (@Pc(11) int local11 = 0; local11 < 7; local11++) {
				this.anIntArray270[local11] = -1;
				for (@Pc(20) int local20 = 0; local20 < Class46.anInt680; local20++) {
					if (!Class46.aClass46Array1[local20].aBoolean183 && Class46.aClass46Array1[local20].anInt681 == local11 + (this.aBoolean222 ? 0 : 7)) {
						this.anIntArray270[local11] = local20;
						break;
					}
				}
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("711, " + 0 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!FTMSICIZ;IB)V")
	private void method674(@OriginalArg(0) Class4_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt1044; local3++) {
				@Pc(10) int local10 = this.anIntArray274[local3];
				@Pc(15) Class4_Sub1_Sub2_Sub5_Sub1 local15 = this.aClass4_Sub1_Sub2_Sub5_Sub1Array1[local10];
				@Pc(18) int local18 = arg0.method102();
				@Pc(25) int local25;
				@Pc(28) int local28;
				if ((local18 & 0x4) != 0) {
					local25 = arg0.method102();
					local28 = arg0.method102();
					local15.method497(local28, this.anInt867, local25, anInt927);
					local15.anInt734 = anInt927 + 300;
					local15.anInt735 = arg0.method122();
					local15.anInt736 = arg0.method122();
				}
				if ((local18 & 0x8) != 0) {
					local25 = arg0.method102();
					local28 = arg0.method102();
					local15.method497(local28, this.anInt867, local25, anInt927);
					local15.anInt734 = anInt927 + 300;
					local15.anInt735 = arg0.method102();
					local15.anInt736 = arg0.method123();
				}
				if ((local18 & 0x10) != 0) {
					local15.aClass33_1 = Class33.method372(arg0.method104());
					local15.anInt706 = local15.aClass33_1.aByte25;
					local15.anInt730 = local15.aClass33_1.anInt514;
					local15.anInt707 = local15.aClass33_1.anInt505;
					local15.anInt708 = local15.aClass33_1.anInt503;
					local15.anInt709 = local15.aClass33_1.anInt507;
					local15.anInt710 = local15.aClass33_1.anInt501;
					local15.anInt724 = local15.aClass33_1.anInt515;
				}
				if ((local18 & 0x2) != 0) {
					local15.anInt727 = arg0.method104();
					local15.anInt728 = arg0.method131();
				}
				if ((local18 & 0x80) != 0) {
					local25 = arg0.method104();
					if (local25 == 65535) {
						local25 = -1;
					}
					local28 = arg0.method102();
					if (local25 == local15.anInt715 && local25 != -1) {
						@Pc(165) int local165 = Class27.aClass27Array1[local25].anInt374;
						if (local165 == 1) {
							local15.anInt716 = 0;
							local15.anInt717 = 0;
							local15.anInt718 = local28;
							local15.anInt719 = 0;
						}
						if (local165 == 2) {
							local15.anInt719 = 0;
						}
					} else if (local25 == -1 || local15.anInt715 == -1 || Class27.aClass27Array1[local25].anInt368 >= Class27.aClass27Array1[local15.anInt715].anInt368) {
						local15.anInt715 = local25;
						local15.anInt716 = 0;
						local15.anInt717 = 0;
						local15.anInt718 = local28;
						local15.anInt719 = 0;
						local15.anInt705 = local15.anInt737;
					}
				}
				if ((local18 & 0x40) != 0) {
					local15.anInt720 = arg0.method132(this.aByte42);
					if (local15.anInt720 == 65535) {
						local15.anInt720 = -1;
					}
				}
				if ((local18 & 0x1) != 0) {
					local15.aString15 = arg0.method109();
					local15.anInt732 = 100;
				}
				if ((local18 & 0x20) != 0) {
					local15.anInt689 = arg0.method132(this.aByte42);
					local25 = arg0.method139(this.anInt913);
					local15.anInt693 = local25 >> 16;
					local15.anInt692 = anInt927 + (local25 & 0xFFFF);
					local15.anInt690 = 0;
					local15.anInt691 = 0;
					if (local15.anInt692 > anInt927) {
						local15.anInt690 = -1;
					}
					if (local15.anInt689 == 65535) {
						local15.anInt689 = -1;
					}
				}
			}
		} catch (@Pc(309) RuntimeException local309) {
			signlink.reporterror("50158, " + arg0 + ", " + arg1 + ", " + -100 + ", " + local309.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)Ljava/lang/String;")
	private String method675(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt912 > 9 || this.anInt912 < 9) {
				this.aClass4_Sub1_Sub3_6.method92(61);
			}
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("95230, " + arg0 + ", " + 9 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ZI)V")
	private void method676(@OriginalArg(1) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass4_Sub1_Sub1_Sub3_9.anIntArray33;
			@Pc(8) int local8 = local5.length;
			for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
				local5[local10] = 0;
			}
			@Pc(34) int local34;
			@Pc(36) int local36;
			for (@Pc(22) int local22 = 1; local22 < 103; local22++) {
				local34 = (103 - local22) * 512 * 4 + 24628;
				for (local36 = 1; local36 < 103; local36++) {
					if ((this.aByteArrayArrayArray8[arg0][local36][local22] & 0x18) == 0) {
						this.aClass45_1.method466(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass45_1.method466(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass4_Sub1_Sub1_Sub3_9.method234();
			@Pc(146) int local146;
			for (@Pc(142) int local142 = 1; local142 < 103; local142++) {
				for (local146 = 1; local146 < 103; local146++) {
					if ((this.aByteArrayArrayArray8[arg0][local146][local142] & 0x18) == 0) {
						this.method596(local36, local34, local146, local142, arg0);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local146][local142] & 0x8) != 0) {
						this.method596(local36, local34, local146, local142, arg0 + 1);
					}
				}
			}
			this.aBoolean241 &= true;
			if (this.aClass13_26 != null) {
				this.aClass13_26.method187();
				Class4_Sub1_Sub1_Sub4.anIntArray206 = this.anIntArray254;
			}
			this.anInt857 = 0;
			for (local146 = 0; local146 < 104; local146++) {
				for (@Pc(226) int local226 = 0; local226 < 104; local226++) {
					@Pc(236) int local236 = this.aClass45_1.method460(this.anInt981, local146, local226);
					if (local236 != 0) {
						local236 = local236 >> 14 & 0x7FFF;
						@Pc(248) int local248 = Class28.method334(local236).anInt383;
						if (local248 >= 0) {
							@Pc(252) int local252 = local146;
							@Pc(254) int local254 = local226;
							if (local248 != 22 && local248 != 29 && local248 != 34 && local248 != 36 && local248 != 46 && local248 != 47 && local248 != 48) {
								@Pc(286) int[][] local286 = this.aClass50Array1[this.anInt981].anIntArrayArray18;
								for (@Pc(288) int local288 = 0; local288 < 10; local288++) {
									@Pc(295) int local295 = (int) (Math.random() * 4.0D);
									if (local295 == 0 && local252 > 0 && local252 > local146 - 3 && (local286[local252 - 1][local254] & 0x1280108) == 0) {
										local252--;
									}
									if (local295 == 1 && local252 < 103 && local252 < local146 + 3 && (local286[local252 + 1][local254] & 0x1280180) == 0) {
										local252++;
									}
									if (local295 == 2 && local254 > 0 && local254 > local226 - 3 && (local286[local252][local254 - 1] & 0x1280102) == 0) {
										local254--;
									}
									if (local295 == 3 && local254 < 103 && local254 < local226 + 3 && (local286[local252][local254 + 1] & 0x1280120) == 0) {
										local254++;
									}
								}
							}
							this.aClass4_Sub1_Sub1_Sub3Array7[this.anInt857] = this.aClass4_Sub1_Sub1_Sub3Array4[local248];
							this.anIntArray219[this.anInt857] = local252;
							this.anIntArray220[this.anInt857] = local254;
							this.anInt857++;
						}
					}
				}
			}
		} catch (@Pc(425) RuntimeException local425) {
			signlink.reporterror("10377, " + true + ", " + arg0 + ", " + local425.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method677() {
		try {
			this.aBoolean240 = false;
			while (this.aBoolean230) {
				this.aBoolean240 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(13) Exception local13) {
				}
			}
			this.aClass4_Sub1_Sub1_Sub2_11 = null;
			this.aClass4_Sub1_Sub1_Sub2_12 = null;
			this.aClass4_Sub1_Sub1_Sub2Array3 = null;
			this.anIntArray248 = null;
			this.anIntArray249 = null;
			this.anIntArray250 = null;
			this.anIntArray251 = null;
			this.anIntArray223 = null;
			this.anIntArray224 = null;
			this.anIntArray213 = null;
			this.anIntArray214 = null;
			this.aClass4_Sub1_Sub1_Sub3_7 = null;
			this.aClass4_Sub1_Sub1_Sub3_8 = null;
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("6609, " + -513 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!KUDWIDHU;II)V")
	private void method678(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1_Sub1_Sub3 arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg1 != null) {
				@Pc(10) int local10 = this.anInt954 + this.anInt991 & 0x7FF;
				@Pc(18) int local18 = arg0 * arg0 + arg2 * arg2;
				if (local18 <= 6400) {
					@Pc(26) int local26 = Class4_Sub1_Sub2_Sub3.anIntArray71[local10];
					@Pc(30) int local30 = Class4_Sub1_Sub2_Sub3.anIntArray72[local10];
					@Pc(39) int local39 = local26 * 256 / (this.anInt886 + 256);
					@Pc(48) int local48 = local30 * 256 / (this.anInt886 + 256);
					@Pc(58) int local58 = arg2 * local39 + arg0 * local48 >> 16;
					@Pc(68) int local68 = arg2 * local48 - arg0 * local39 >> 16;
					if (local18 > 2500) {
						arg1.method245(this.aClass4_Sub1_Sub1_Sub2_19, 83 - local68 - arg1.anInt220 / 2 - 4, local58 + 94 - arg1.anInt219 / 2 + 4);
					} else {
						arg1.method239(233, local58 + 94 + 4 - arg1.anInt219 / 2, 83 - local68 - arg1.anInt220 / 2 - 4);
					}
				}
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("34902, " + arg0 + ", " + arg1 + ", " + -20546 + ", " + arg2 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method680() {
		try {
			try {
				if (this.aClass38_1 != null) {
					this.aClass38_1.method389();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass38_1 = null;
			this.aBoolean241 = false;
			this.anInt952 = 0;
			this.aString18 = "";
			this.aString19 = "";
			this.method727();
			this.aClass45_1.method431();
			for (@Pc(36) int local36 = 0; local36 < 4; local36++) {
				this.aClass50Array1[local36].method529();
			}
			System.gc();
			this.method671();
			this.anInt836 = -1;
			this.anInt961 = -1;
			this.anInt861 = 0;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("21504, " + false + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
	private void method681(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(21) int local21;
			if (this.aClass13_26 != null) {
				this.aClass13_26.method187();
				Class4_Sub1_Sub1_Sub4.anIntArray206 = this.anIntArray254;
				local21 = 151;
				if (arg0 != null) {
					local21 -= 7;
				}
				this.aClass4_Sub1_Sub1_Sub1_3.method44(257, local21, arg1, 0);
				this.aClass4_Sub1_Sub1_Sub1_3.method44(256, local21 - 1, arg1, 16777215);
				local21 += 15;
				if (arg0 != null) {
					this.aClass4_Sub1_Sub1_Sub1_3.method44(257, local21, arg0, 0);
					this.aClass4_Sub1_Sub1_Sub1_3.method44(256, local21 - 1, arg0, 16777215);
				}
				this.aClass13_26.method188(4, super.aGraphics2, 4);
			} else if (super.aClass13_2 != null) {
				super.aClass13_2.method187();
				Class4_Sub1_Sub1_Sub4.anIntArray206 = this.anIntArray255;
				local21 = 251;
				Class4_Sub1_Sub1.method548(233, 0, 221, 50, this.anInt945, 300);
				Class4_Sub1_Sub1.method549(300, 50, 16777215, 233, 221);
				if (arg0 != null) {
					local21 -= 7;
				}
				this.aClass4_Sub1_Sub1_Sub1_3.method44(383, local21, arg1, 0);
				this.aClass4_Sub1_Sub1_Sub1_3.method44(382, local21 - 1, arg1, 16777215);
				local21 += 15;
				if (arg0 != null) {
					this.aClass4_Sub1_Sub1_Sub1_3.method44(383, local21, arg0, 0);
					this.aClass4_Sub1_Sub1_Sub1_3.method44(382, local21 - 1, arg0, 16777215);
				}
				super.aClass13_2.method188(0, super.aGraphics2, 0);
			}
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("56720, " + arg0 + ", " + 4 + ", " + arg1 + ", " + local175.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method682() {
		try {
			if (this.aClass13_12 == null) {
				super.aClass13_2 = null;
				this.aClass13_27 = null;
				this.aClass13_25 = null;
				this.aClass13_24 = null;
				this.aClass13_26 = null;
				this.aClass13_21 = null;
				this.aClass13_22 = null;
				this.aClass13_23 = null;
				this.aClass13_15 = new Class13(this.method587(), 128, 430, 265);
				Class4_Sub1_Sub1.method546();
				this.aClass13_16 = new Class13(this.method587(), 128, 430, 265);
				Class4_Sub1_Sub1.method546();
				this.aClass13_12 = new Class13(this.method587(), 509, 430, 171);
				Class4_Sub1_Sub1.method546();
				this.aClass13_13 = new Class13(this.method587(), 360, 430, 132);
				Class4_Sub1_Sub1.method546();
				this.aClass13_14 = new Class13(this.method587(), 360, 430, 200);
				Class4_Sub1_Sub1.method546();
				this.aClass13_17 = new Class13(this.method587(), 202, 430, 238);
				Class4_Sub1_Sub1.method546();
				this.aClass13_18 = new Class13(this.method587(), 203, 430, 238);
				Class4_Sub1_Sub1.method546();
				this.aClass13_19 = new Class13(this.method587(), 74, 430, 94);
				Class4_Sub1_Sub1.method546();
				this.aClass13_20 = new Class13(this.method587(), 75, 430, 94);
				Class4_Sub1_Sub1.method546();
				if (this.aClass2_2 != null) {
					this.method612();
					this.method686();
				}
				this.aBoolean239 = true;
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("93399, " + true + ", " + local165.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JB)V")
	private void method683(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(16) int local16 = 0; local16 < this.anInt933; local16++) {
					if (this.aLongArray4[local16] == arg0) {
						this.anInt933--;
						this.aBoolean255 = true;
						for (@Pc(36) int local36 = local16; local36 < this.anInt933; local36++) {
							this.aLongArray4[local36] = this.aLongArray4[local36 + 1];
						}
						this.aClass4_Sub1_Sub3_6.method91(188);
						this.aClass4_Sub1_Sub3_6.method98(arg0, (byte) 7);
						return;
					}
				}
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("39888, " + arg0 + ", " + -63 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method684() {
		try {
			for (@Pc(6) Class4_Sub2 local6 = (Class4_Sub2) this.aClass30_12.method346(); local6 != null; local6 = (Class4_Sub2) this.aClass30_12.method348()) {
				if (local6.anInt51 == -1) {
					local6.anInt52 = 0;
					this.method662(local6);
				} else {
					local6.method572();
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("38762, " + 0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method685() {
		try {
			if (this.anInt925 != 0) {
				@Pc(5) int local5 = 0;
				if (this.anInt1040 != 0) {
					local5 = 1;
				}
				for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
					if (this.aStringArray11[local15] != null) {
						@Pc(27) int local27 = this.anIntArray247[local15];
						@Pc(32) String local32 = this.aStringArray10[local15];
						if (local32 != null && local32.startsWith("@cr1@")) {
							local32 = local32.substring(5);
						}
						if (local32 != null && local32.startsWith("@cr2@")) {
							local32 = local32.substring(5);
						}
						if ((local27 == 3 || local27 == 7) && (local27 == 7 || this.anInt1008 == 0 || this.anInt1008 == 1 && this.method658(local32))) {
							@Pc(85) int local85 = 329 - local5 * 13;
							if (super.anInt819 > 4 && super.anInt820 - 4 > local85 - 10 && super.anInt820 - 4 <= local85 + 3) {
								@Pc(124) int local124 = this.aClass4_Sub1_Sub1_Sub1_3.method46("From:  " + local32 + this.aStringArray11[local15]) + 25;
								if (local124 > 450) {
									local124 = 450;
								}
								if (super.anInt819 < local124 + 4) {
									if (this.anInt877 >= 1) {
										this.aStringArray8[this.anInt990] = "Report abuse @whi@" + local32;
										this.anIntArray229[this.anInt990] = 2243;
										this.anInt990++;
									}
									this.aStringArray8[this.anInt990] = "Add ignore @whi@" + local32;
									this.anIntArray229[this.anInt990] = 2950;
									this.anInt990++;
									this.aStringArray8[this.anInt990] = "Add friend @whi@" + local32;
									this.anIntArray229[this.anInt990] = 2143;
									this.anInt990++;
								}
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local27 == 5 || local27 == 6) && this.anInt1008 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(237) RuntimeException local237) {
			signlink.reporterror("33781, " + 68 + ", " + local237.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method686() {
		try {
			this.aClass4_Sub1_Sub1_Sub2_11 = new Class4_Sub1_Sub1_Sub2(this.aClass2_2, "titlebox", 0);
			this.aClass4_Sub1_Sub1_Sub2_12 = new Class4_Sub1_Sub1_Sub2(this.aClass2_2, "titlebutton", 0);
			this.aClass4_Sub1_Sub1_Sub2Array3 = new Class4_Sub1_Sub1_Sub2[12];
			for (@Pc(31) int local31 = 0; local31 < 12; local31++) {
				this.aClass4_Sub1_Sub1_Sub2Array3[local31] = new Class4_Sub1_Sub1_Sub2(this.aClass2_2, "runes", local31);
			}
			this.aClass4_Sub1_Sub1_Sub3_7 = new Class4_Sub1_Sub1_Sub3(128, 265);
			this.aClass4_Sub1_Sub1_Sub3_8 = new Class4_Sub1_Sub1_Sub3(128, 265);
			for (@Pc(64) int local64 = 0; local64 < 33920; local64++) {
				this.aClass4_Sub1_Sub1_Sub3_7.anIntArray33[local64] = this.aClass13_15.anIntArray22[local64];
			}
			for (@Pc(82) int local82 = 0; local82 < 33920; local82++) {
				this.aClass4_Sub1_Sub1_Sub3_8.anIntArray33[local82] = this.aClass13_16.anIntArray22[local82];
			}
			this.anIntArray249 = new int[256];
			for (@Pc(104) int local104 = 0; local104 < 64; local104++) {
				this.anIntArray249[local104] = local104 * 262144;
			}
			for (@Pc(119) int local119 = 0; local119 < 64; local119++) {
				this.anIntArray249[local119 + 64] = local119 * 1024 + 16711680;
			}
			for (@Pc(138) int local138 = 0; local138 < 64; local138++) {
				this.anIntArray249[local138 + 128] = local138 * 4 + 16776960;
			}
			for (@Pc(157) int local157 = 0; local157 < 64; local157++) {
				this.anIntArray249[local157 + 192] = 16777215;
			}
			this.anIntArray250 = new int[256];
			for (@Pc(176) int local176 = 0; local176 < 64; local176++) {
				this.anIntArray250[local176] = local176 * 1024;
			}
			for (@Pc(191) int local191 = 0; local191 < 64; local191++) {
				this.anIntArray250[local191 + 64] = local191 * 4 + 65280;
			}
			for (@Pc(210) int local210 = 0; local210 < 64; local210++) {
				this.anIntArray250[local210 + 128] = local210 * 262144 + 65535;
			}
			for (@Pc(229) int local229 = 0; local229 < 64; local229++) {
				this.anIntArray250[local229 + 192] = 16777215;
			}
			this.anIntArray251 = new int[256];
			for (@Pc(248) int local248 = 0; local248 < 64; local248++) {
				this.anIntArray251[local248] = local248 * 4;
			}
			for (@Pc(263) int local263 = 0; local263 < 64; local263++) {
				this.anIntArray251[local263 + 64] = local263 * 262144 + 255;
			}
			for (@Pc(282) int local282 = 0; local282 < 64; local282++) {
				this.anIntArray251[local282 + 128] = local282 * 1024 + 16711935;
			}
			for (@Pc(301) int local301 = 0; local301 < 64; local301++) {
				this.anIntArray251[local301 + 192] = 16777215;
			}
			this.anIntArray248 = new int[256];
			this.anIntArray223 = new int[32768];
			this.anIntArray224 = new int[32768];
			this.method664(null);
			this.anIntArray213 = new int[32768];
			this.anIntArray214 = new int[32768];
			this.method589("Connecting to fileserver", 10);
			if (!this.aBoolean240) {
				this.aBoolean263 = true;
				this.aBoolean240 = true;
				this.method588(this, 2);
			}
		} catch (@Pc(358) RuntimeException local358) {
			signlink.reporterror("91006, " + 8 + ", " + local358.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)I")
	private int method687() {
		try {
			@Pc(9) int local9 = 3;
			if (this.anInt931 < 310) {
				@Pc(18) int local18 = this.anInt928 >> 7;
				@Pc(23) int local23 = this.anInt930 >> 7;
				@Pc(28) int local28 = aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt694 >> 7;
				@Pc(33) int local33 = aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt695 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt981][local18][local23] & 0x4) != 0) {
					local9 = this.anInt981;
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
						if ((this.aByteArrayArrayArray8[this.anInt981][local18][local23] & 0x4) != 0) {
							local9 = this.anInt981;
						}
						local85 += local83;
						if (local85 >= 65536) {
							local85 -= 65536;
							if (local23 < local33) {
								local23++;
							} else if (local23 > local33) {
								local23--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt981][local18][local23] & 0x4) != 0) {
								local9 = this.anInt981;
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
						if ((this.aByteArrayArrayArray8[this.anInt981][local18][local23] & 0x4) != 0) {
							local9 = this.anInt981;
						}
						local85 += local83;
						if (local85 >= 65536) {
							local85 -= 65536;
							if (local18 < local28) {
								local18++;
							} else if (local18 > local28) {
								local18--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt981][local18][local23] & 0x4) != 0) {
								local9 = this.anInt981;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt981][aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt694 >> 7][aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt695 >> 7] & 0x4) != 0) {
				local9 = this.anInt981;
			}
			return local9;
		} catch (@Pc(251) RuntimeException local251) {
			signlink.reporterror("29359, " + 3 + ", " + local251.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)I")
	private int method688() {
		try {
			@Pc(16) int local16 = this.method651(this.anInt928, this.anInt981, this.anInt930);
			return local16 - this.anInt929 >= 800 || (this.aByteArrayArrayArray8[this.anInt981][this.anInt928 >> 7][this.anInt930 >> 7] & 0x4) == 0 ? 3 : this.anInt981;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("56567, " + 223 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!YFPQHQAV;II)V")
	private void method689(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub1_Sub2_Sub5_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 != aClass4_Sub1_Sub2_Sub5_Sub2_1 && this.anInt990 < 400) {
				@Pc(45) String local45;
				if (arg1.anInt746 == 0) {
					local45 = arg1.aString16 + method632(614, aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt755, arg1.anInt755) + " (level-" + arg1.anInt755 + ")";
				} else {
					local45 = arg1.aString16 + " (skill-" + arg1.anInt746 + ")";
				}
				@Pc(175) int local175;
				if (this.anInt848 == 1) {
					this.aStringArray8[this.anInt990] = "Use " + this.aString20 + " with @whi@" + local45;
					this.anIntArray229[this.anInt990] = 223;
					this.anIntArray230[this.anInt990] = arg3;
					this.anIntArray227[this.anInt990] = arg2;
					this.anIntArray228[this.anInt990] = arg0;
					this.anInt990++;
				} else if (this.anInt879 != 1) {
					for (local175 = 4; local175 >= 0; local175--) {
						if (this.aStringArray12[local175] != null) {
							this.aStringArray8[this.anInt990] = this.aStringArray12[local175] + " @whi@" + local45;
							@Pc(202) short local202 = 0;
							if (this.aStringArray12[local175].equalsIgnoreCase("attack")) {
								if (arg1.anInt755 > aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt755) {
									local202 = 2000;
								}
								if (aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt743 != 0 && arg1.anInt743 != 0) {
									if (aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt743 == arg1.anInt743) {
										local202 = 2000;
									} else {
										local202 = 0;
									}
								}
							} else if (this.aBooleanArray11[local175]) {
								local202 = 2000;
							}
							if (local175 == 0) {
								this.anIntArray229[this.anInt990] = local202 + 416;
							}
							if (local175 == 1) {
								this.anIntArray229[this.anInt990] = local202 + 365;
							}
							if (local175 == 2) {
								this.anIntArray229[this.anInt990] = local202 + 891;
							}
							if (local175 == 3) {
								this.anIntArray229[this.anInt990] = local202 + 94;
							}
							if (local175 == 4) {
								this.anIntArray229[this.anInt990] = local202 + 545;
							}
							this.anIntArray230[this.anInt990] = arg3;
							this.anIntArray227[this.anInt990] = arg2;
							this.anIntArray228[this.anInt990] = arg0;
							this.anInt990++;
						}
					}
				} else if ((this.anInt881 & 0x8) == 8) {
					this.aStringArray8[this.anInt990] = this.aString21 + " @whi@" + local45;
					this.anIntArray229[this.anInt990] = 555;
					this.anIntArray230[this.anInt990] = arg3;
					this.anIntArray227[this.anInt990] = arg2;
					this.anIntArray228[this.anInt990] = arg0;
					this.anInt990++;
				}
				for (local175 = 0; local175 < this.anInt990; local175++) {
					if (this.anIntArray229[local175] == 763) {
						this.aStringArray8[local175] = "Walk here @whi@" + local45;
						return;
					}
				}
			}
		} catch (@Pc(352) RuntimeException local352) {
			signlink.reporterror("65085, " + 9 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local352.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method690(@OriginalArg(0) boolean arg0) {
		try {
			this.aClass13_27.method187();
			Class4_Sub1_Sub1_Sub4.anIntArray206 = this.anIntArray252;
			this.aClass4_Sub1_Sub1_Sub2_20.method211(233, 0, 0);
			if (this.aBoolean248) {
				this.aClass4_Sub1_Sub1_Sub1_4.method44(239, 40, this.aString25, 0);
				this.aClass4_Sub1_Sub1_Sub1_4.method44(239, 60, this.aString24 + "*", 128);
			} else if (this.anInt846 == 1) {
				this.aClass4_Sub1_Sub1_Sub1_4.method44(239, 40, "Enter amount:", 0);
				this.aClass4_Sub1_Sub1_Sub1_4.method44(239, 60, this.aString23 + "*", 128);
			} else if (this.anInt846 == 2) {
				this.aClass4_Sub1_Sub1_Sub1_4.method44(239, 40, "Enter name:", 0);
				this.aClass4_Sub1_Sub1_Sub1_4.method44(239, 60, this.aString23 + "*", 128);
			} else {
				@Pc(126) Class4_Sub1_Sub1_Sub1 local126;
				@Pc(134) int local134;
				@Pc(145) int local145;
				if (this.anInt846 == 3) {
					if (this.aString23 != this.aString26) {
						this.method593(this.aByte41, this.aString23);
						this.aString26 = this.aString23;
					}
					local126 = this.aClass4_Sub1_Sub1_Sub1_3;
					Class4_Sub1_Sub1.method545(77, 0, 0, 463);
					for (local134 = 0; local134 < this.anInt942; local134++) {
						local145 = local134 * 14 + 18 - this.anInt943;
						if (local145 > 0 && local145 < 110) {
							local126.method44(239, local145, this.aStringArray13[local134], 0);
						}
					}
					Class4_Sub1_Sub1.method544(this.aBoolean259);
					if (this.anInt942 > 5) {
						this.method643(this.anInt943, 463, 77, 0, this.anInt942 * 14 + 7);
					}
					if (this.aString23.length() == 0) {
						this.aClass4_Sub1_Sub1_Sub1_4.method44(239, 40, "Enter object name", 255);
					} else if (this.anInt942 == 0) {
						this.aClass4_Sub1_Sub1_Sub1_4.method44(239, 40, "No matching objects found, please shorten search", 0);
					}
					local126.method44(239, 90, this.aString23 + "*", 0);
					Class4_Sub1_Sub1.method551(77, 0, 0, 479);
				} else if (this.aString28 != null) {
					this.aClass4_Sub1_Sub1_Sub1_4.method44(239, 40, this.aString28, 0);
					this.aClass4_Sub1_Sub1_Sub1_4.method44(239, 60, "Click to continue", 128);
				} else if (this.anInt882 != -1) {
					this.method617(0, 0, Class26.method319(this.anInt882), 0);
				} else if (this.anInt888 == -1) {
					local126 = this.aClass4_Sub1_Sub1_Sub1_3;
					local134 = 0;
					Class4_Sub1_Sub1.method545(77, 0, 0, 463);
					for (local145 = 0; local145 < 100; local145++) {
						if (this.aStringArray11[local145] != null) {
							@Pc(311) int local311 = this.anIntArray247[local145];
							@Pc(320) int local320 = this.anInt899 + 70 - local134 * 14;
							@Pc(325) String local325 = this.aStringArray10[local145];
							@Pc(327) byte local327 = 0;
							if (local325 != null && local325.startsWith("@cr1@")) {
								local325 = local325.substring(5);
								local327 = 1;
							}
							if (local325 != null && local325.startsWith("@cr2@")) {
								local325 = local325.substring(5);
								local327 = 2;
							}
							if (local311 == 0) {
								if (local320 > 0 && local320 < 110) {
									local126.method48(779, this.aStringArray11[local145], 4, local320, 0);
								}
								local134++;
							}
							@Pc(397) int local397;
							if ((local311 == 1 || local311 == 2) && (local311 == 1 || this.anInt940 == 0 || this.anInt940 == 1 && this.method658(local325))) {
								if (local320 > 0 && local320 < 110) {
									local397 = 4;
									if (local327 == 1) {
										this.aClass4_Sub1_Sub1_Sub2Array4[0].method211(233, 4, local320 - 12);
										local397 += 14;
									}
									if (local327 == 2) {
										this.aClass4_Sub1_Sub1_Sub2Array4[1].method211(233, local397, local320 - 12);
										local397 += 14;
									}
									local126.method48(779, local325 + ":", local397, local320, 0);
									local397 += local126.method46(local325) + 8;
									local126.method48(779, this.aStringArray11[local145], local397, local320, 255);
								}
								local134++;
							}
							if ((local311 == 3 || local311 == 7) && this.anInt925 == 0 && (local311 == 7 || this.anInt1008 == 0 || this.anInt1008 == 1 && this.method658(local325))) {
								if (local320 > 0 && local320 < 110) {
									local126.method48(779, "From", 4, local320, 0);
									local397 = local126.method46("From ") + 4;
									if (local327 == 1) {
										this.aClass4_Sub1_Sub1_Sub2Array4[0].method211(233, local397, local320 - 12);
										local397 += 14;
									}
									if (local327 == 2) {
										this.aClass4_Sub1_Sub1_Sub2Array4[1].method211(233, local397, local320 - 12);
										local397 += 14;
									}
									local126.method48(779, local325 + ":", local397, local320, 0);
									local397 += local126.method46(local325) + 8;
									local126.method48(779, this.aStringArray11[local145], local397, local320, 8388608);
								}
								local134++;
							}
							if (local311 == 4 && (this.anInt1018 == 0 || this.anInt1018 == 1 && this.method658(local325))) {
								if (local320 > 0 && local320 < 110) {
									local126.method48(779, local325 + " " + this.aStringArray11[local145], 4, local320, 8388736);
								}
								local134++;
							}
							if (local311 == 5 && this.anInt925 == 0 && this.anInt1008 < 2) {
								if (local320 > 0 && local320 < 110) {
									local126.method48(779, this.aStringArray11[local145], 4, local320, 8388608);
								}
								local134++;
							}
							if (local311 == 6 && this.anInt925 == 0 && this.anInt1008 < 2) {
								if (local320 > 0 && local320 < 110) {
									local126.method48(779, "To " + local325 + ":", 4, local320, 0);
									local126.method48(779, this.aStringArray11[local145], local126.method46("To " + local325) + 12, local320, 8388608);
								}
								local134++;
							}
							if (local311 == 8 && (this.anInt1018 == 0 || this.anInt1018 == 1 && this.method658(local325))) {
								if (local320 > 0 && local320 < 110) {
									local126.method48(779, local325 + " " + this.aStringArray11[local145], 4, local320, 8270336);
								}
								local134++;
							}
						}
					}
					Class4_Sub1_Sub1.method544(this.aBoolean259);
					this.anInt988 = local134 * 14 + 7;
					if (this.anInt988 < 78) {
						this.anInt988 = 78;
					}
					this.method643(this.anInt988 - this.anInt899 - 77, 463, 77, 0, this.anInt988);
					@Pc(768) String local768;
					if (aClass4_Sub1_Sub2_Sub5_Sub2_1 == null || aClass4_Sub1_Sub2_Sub5_Sub2_1.aString16 == null) {
						local768 = Class36.method382(this.aString18, 78);
					} else {
						local768 = aClass4_Sub1_Sub2_Sub5_Sub2_1.aString16;
					}
					local126.method48(779, local768 + ":", 4, 90, 0);
					local126.method48(779, this.aString17 + "*", local126.method46(local768 + ": ") + 6, 90, 255);
					Class4_Sub1_Sub1.method551(77, 0, 0, 479);
				} else {
					this.method617(0, 0, Class26.method319(this.anInt888), 0);
				}
			}
			if (this.aBoolean237 && this.anInt891 == 2) {
				this.method657();
			}
			this.aClass13_27.method188(357, super.aGraphics2, 17);
			this.aClass13_26.method187();
			if (!arg0) {
				this.aClass30ArrayArrayArray1 = null;
			}
			Class4_Sub1_Sub1_Sub4.anIntArray206 = this.anIntArray254;
		} catch (@Pc(854) RuntimeException local854) {
			signlink.reporterror("482, " + arg0 + ", " + local854.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method691() {
		try {
			@Pc(4) Graphics local4 = this.method587().getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			this.method580();
			@Pc(45) byte local45;
			@Pc(51) int local51;
			if (this.aBoolean244) {
				this.aBoolean240 = false;
				local4.setFont(new Font("Helvetica", 1, 16));
				local4.setColor(Color.yellow);
				local45 = 35;
				local4.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
				local51 = local45 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				@Pc(60) int local60 = local51 + 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				@Pc(77) int local77 = local60 + 30;
				local4.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
				@Pc(83) int local83 = local77 + 30;
				local4.drawString("3: Try using a different game-world", 30, 195);
				@Pc(89) int local89 = local83 + 30;
				local4.drawString("4: Try rebooting your computer", 30, 225);
				@Pc(95) int local95 = local89 + 30;
				local4.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
			}
			if (this.aBoolean229) {
				this.aBoolean240 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean249) {
				this.aBoolean240 = false;
				local4.setColor(Color.yellow);
				local45 = 35;
				local4.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
				local51 = local45 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				local51 += 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				local51 += 30;
				local4.drawString("2: Try rebooting your computer, and reloading", 30, 165);
				local51 += 30;
			}
		} catch (@Pc(183) RuntimeException local183) {
			signlink.reporterror("65215, " + -944 + ", " + local183.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!QQSLPTGQ;BI)V")
	private void method692(@OriginalArg(0) Class4_Sub1_Sub2_Sub5 arg0, @OriginalArg(2) int arg1) {
		try {
			this.method693(444, arg1, arg0.anInt695, arg0.anInt694);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("55367, " + arg0 + ", " + -4 + ", " + arg1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)V")
	private void method693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg3 >= 128 && arg2 >= 128 && arg3 <= 13056 && arg2 <= 13056) {
				@Pc(28) int local28 = this.method651(arg3, this.anInt981, arg2) - arg1;
				@Pc(33) int local33 = arg3 - this.anInt928;
				@Pc(38) int local38 = local28 - this.anInt929;
				@Pc(43) int local43 = arg2 - this.anInt930;
				@Pc(48) int local48 = Class4_Sub1_Sub2_Sub3.anIntArray71[this.anInt931];
				@Pc(53) int local53 = Class4_Sub1_Sub2_Sub3.anIntArray72[this.anInt931];
				@Pc(58) int local58 = Class4_Sub1_Sub2_Sub3.anIntArray71[this.anInt932];
				@Pc(63) int local63 = Class4_Sub1_Sub2_Sub3.anIntArray72[this.anInt932];
				@Pc(73) int local73 = local43 * local58 + local33 * local63 >> 16;
				@Pc(83) int local83 = local43 * local63 - local33 * local58 >> 16;
				@Pc(85) int local85 = local73;
				@Pc(95) int local95 = local38 * local53 - local83 * local48 >> 16;
				@Pc(105) int local105 = local38 * local48 + local83 * local53 >> 16;
				@Pc(111) boolean local111 = false;
				if (local105 >= 50) {
					this.anInt1029 = Class4_Sub1_Sub1_Sub4.anInt793 + (local85 << 9) / local105;
					this.anInt1030 = Class4_Sub1_Sub1_Sub4.anInt794 + (local95 << 9) / local105;
				} else {
					this.anInt1029 = -1;
					this.anInt1030 = -1;
				}
			} else {
				this.anInt1029 = -1;
				this.anInt1030 = -1;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("96491, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method694(@OriginalArg(0) int arg0) {
		try {
			this.anInt917 = 0;
			@Pc(70) int local70;
			for (@Pc(6) int local6 = -1; local6 < this.anInt1043 + this.anInt1013; local6++) {
				@Pc(13) Class4_Sub1_Sub2_Sub5 local13;
				if (local6 == -1) {
					local13 = aClass4_Sub1_Sub2_Sub5_Sub2_1;
				} else if (local6 < this.anInt1043) {
					local13 = this.aClass4_Sub1_Sub2_Sub5_Sub2Array1[this.anIntArray273[local6]];
				} else {
					local13 = this.aClass4_Sub1_Sub2_Sub5_Sub1Array1[this.anIntArray266[local6 - this.anInt1043]];
				}
				if (local13 != null && local13.method499(172)) {
					@Pc(54) Class33 local54;
					if (local13 instanceof Class4_Sub1_Sub2_Sub5_Sub1) {
						local54 = ((Class4_Sub1_Sub2_Sub5_Sub1) local13).aClass33_1;
						if (local54.anIntArray133 != null) {
							local54 = local54.method369();
						}
						if (local54 == null) {
							continue;
						}
					}
					if (local6 >= this.anInt1043) {
						local54 = ((Class4_Sub1_Sub2_Sub5_Sub1) local13).aClass33_1;
						if (local54.anInt506 >= 0 && local54.anInt506 < this.aClass4_Sub1_Sub1_Sub3Array10.length) {
							this.method692(local13, local13.anInt731 + 15);
							if (this.anInt1029 > -1) {
								this.aClass4_Sub1_Sub1_Sub3Array10[local54.anInt506].method239(233, this.anInt1029 - 12, this.anInt1030 - 30);
							}
						}
						if (this.anInt1056 == 1 && this.anInt951 == this.anIntArray266[local6 - this.anInt1043] && anInt927 % 20 < 10) {
							this.method692(local13, local13.anInt731 + 15);
							if (this.anInt1029 > -1) {
								this.aClass4_Sub1_Sub1_Sub3Array9[0].method239(233, this.anInt1029 - 12, this.anInt1030 - 28);
							}
						}
					} else {
						local70 = 30;
						@Pc(73) Class4_Sub1_Sub2_Sub5_Sub2 local73 = (Class4_Sub1_Sub2_Sub5_Sub2) local13;
						if (local73.anInt744 != -1 || local73.anInt739 != -1) {
							this.method692(local13, local13.anInt731 + 15);
							if (this.anInt1029 > -1) {
								if (local73.anInt744 != -1) {
									this.aClass4_Sub1_Sub1_Sub3Array8[local73.anInt744].method239(233, this.anInt1029 - 12, this.anInt1030 - 30);
									local70 += 25;
								}
								if (local73.anInt739 != -1) {
									this.aClass4_Sub1_Sub1_Sub3Array10[local73.anInt739].method239(233, this.anInt1029 - 12, this.anInt1030 - local70);
									local70 += 25;
								}
							}
						}
						if (local6 >= 0 && this.anInt1056 == 10 && this.anInt1028 == this.anIntArray273[local6]) {
							this.method692(local13, local13.anInt731 + 15);
							if (this.anInt1029 > -1) {
								this.aClass4_Sub1_Sub1_Sub3Array9[1].method239(233, this.anInt1029 - 12, this.anInt1030 - local70);
							}
						}
					}
					if (local13.aString15 != null && (local6 >= this.anInt1043 || this.anInt940 == 0 || this.anInt940 == 3 || this.anInt940 == 1 && this.method658(((Class4_Sub1_Sub2_Sub5_Sub2) local13).aString16))) {
						this.method692(local13, local13.anInt731);
						if (this.anInt1029 > -1 && this.anInt917 < this.anInt918) {
							this.anIntArray239[this.anInt917] = this.aClass4_Sub1_Sub1_Sub1_4.method47(this.anInt1050, local13.aString15) / 2;
							this.anIntArray238[this.anInt917] = this.aClass4_Sub1_Sub1_Sub1_4.anInt35;
							this.anIntArray236[this.anInt917] = this.anInt1029;
							this.anIntArray237[this.anInt917] = this.anInt1030;
							this.anIntArray240[this.anInt917] = local13.anInt721;
							this.anIntArray241[this.anInt917] = local13.anInt729;
							this.anIntArray242[this.anInt917] = local13.anInt732;
							this.aStringArray9[this.anInt917++] = local13.aString15;
							if (this.anInt868 == 0 && local13.anInt729 >= 1 && local13.anInt729 <= 3) {
								this.anIntArray238[this.anInt917] += 10;
								this.anIntArray237[this.anInt917] += 5;
							}
							if (this.anInt868 == 0 && local13.anInt729 == 4) {
								this.anIntArray239[this.anInt917] = 60;
							}
							if (this.anInt868 == 0 && local13.anInt729 == 5) {
								this.anIntArray238[this.anInt917] += 5;
							}
						}
					}
					if (local13.anInt734 > anInt927) {
						this.method692(local13, local13.anInt731 + 15);
						if (this.anInt1029 > -1) {
							local70 = local13.anInt735 * 30 / local13.anInt736;
							if (local70 > 30) {
								local70 = 30;
							}
							Class4_Sub1_Sub1.method548(this.anInt1029 - 15, 65280, this.anInt1030 - 3, 5, this.anInt945, local70);
							Class4_Sub1_Sub1.method548(this.anInt1029 + local70 - 15, 16711680, this.anInt1030 - 3, 5, this.anInt945, 30 - local70);
						}
					}
					for (local70 = 0; local70 < 4; local70++) {
						if (local13.anIntArray178[local70] > anInt927) {
							this.method692(local13, local13.anInt731 / 2);
							if (this.anInt1029 > -1) {
								if (local70 == 1) {
									this.anInt1030 -= 20;
								}
								if (local70 == 2) {
									this.anInt1029 -= 15;
									this.anInt1030 -= 10;
								}
								if (local70 == 3) {
									this.anInt1029 += 15;
									this.anInt1030 -= 10;
								}
								this.aClass4_Sub1_Sub1_Sub3Array5[local13.anIntArray177[local70]].method239(233, this.anInt1029 - 12, this.anInt1030 - 12);
								this.aClass4_Sub1_Sub1_Sub1_2.method44(this.anInt1029, this.anInt1030 + 4, String.valueOf(local13.anIntArray176[local70]), 0);
								this.aClass4_Sub1_Sub1_Sub1_2.method44(this.anInt1029 - 1, this.anInt1030 + 3, String.valueOf(local13.anIntArray176[local70]), 16777215);
							}
						}
					}
				}
			}
			for (@Pc(613) int local613 = 0; local613 < this.anInt917; local613++) {
				local70 = this.anIntArray236[local613];
				@Pc(625) int local625 = this.anIntArray237[local613];
				@Pc(630) int local630 = this.anIntArray239[local613];
				@Pc(635) int local635 = this.anIntArray238[local613];
				@Pc(637) boolean local637 = true;
				while (local637) {
					local637 = false;
					for (@Pc(643) int local643 = 0; local643 < local613; local643++) {
						if (local625 + 2 > this.anIntArray237[local643] - this.anIntArray238[local643] && local625 - local635 < this.anIntArray237[local643] + 2 && local70 - local630 < this.anIntArray236[local643] + this.anIntArray239[local643] && local70 + local630 > this.anIntArray236[local643] - this.anIntArray239[local643] && this.anIntArray237[local643] - this.anIntArray238[local643] < local625) {
							local625 = this.anIntArray237[local643] - this.anIntArray238[local643];
							local637 = true;
						}
					}
				}
				this.anInt1029 = this.anIntArray236[local613];
				this.anInt1030 = this.anIntArray237[local613] = local625;
				@Pc(742) String local742 = this.aStringArray9[local613];
				if (this.anInt868 == 0) {
					@Pc(747) int local747 = 16776960;
					if (this.anIntArray240[local613] < 6) {
						local747 = this.anIntArray263[this.anIntArray240[local613]];
					}
					if (this.anIntArray240[local613] == 6) {
						local747 = this.anInt1033 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray240[local613] == 7) {
						local747 = this.anInt1033 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray240[local613] == 8) {
						local747 = this.anInt1033 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(822) int local822;
					if (this.anIntArray240[local613] == 9) {
						local822 = 150 - this.anIntArray242[local613];
						if (local822 < 50) {
							local747 = local822 * 1280 + 16711680;
						} else if (local822 < 100) {
							local747 = 16776960 - (local822 - 50) * 327680;
						} else if (local822 < 150) {
							local747 = (local822 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray240[local613] == 10) {
						local822 = 150 - this.anIntArray242[local613];
						if (local822 < 50) {
							local747 = local822 * 5 + 16711680;
						} else if (local822 < 100) {
							local747 = 16711935 - (local822 - 50) * 327680;
						} else if (local822 < 150) {
							local747 = (local822 - 100) * 327680 + 255 - (local822 - 100) * 5;
						}
					}
					if (this.anIntArray240[local613] == 11) {
						local822 = 150 - this.anIntArray242[local613];
						if (local822 < 50) {
							local747 = 16777215 - local822 * 327685;
						} else if (local822 < 100) {
							local747 = (local822 - 50) * 327685 + 65280;
						} else if (local822 < 150) {
							local747 = 16777215 - (local822 - 100) * 327680;
						}
					}
					if (this.anIntArray241[local613] == 0) {
						this.aClass4_Sub1_Sub1_Sub1_4.method44(this.anInt1029, this.anInt1030 + 1, local742, 0);
						this.aClass4_Sub1_Sub1_Sub1_4.method44(this.anInt1029, this.anInt1030, local742, local747);
					}
					if (this.anIntArray241[local613] == 1) {
						this.aClass4_Sub1_Sub1_Sub1_4.method49(local742, this.anInt1029, this.anInt1030 + 1, 0, this.anInt1033);
						this.aClass4_Sub1_Sub1_Sub1_4.method49(local742, this.anInt1029, this.anInt1030, local747, this.anInt1033);
					}
					if (this.anIntArray241[local613] == 2) {
						this.aClass4_Sub1_Sub1_Sub1_4.method50(this.anInt1030 + 1, this.anInt1033, local742, this.anInt1029, 0);
						this.aClass4_Sub1_Sub1_Sub1_4.method50(this.anInt1030, this.anInt1033, local742, this.anInt1029, local747);
					}
					if (this.anIntArray241[local613] == 3) {
						this.aClass4_Sub1_Sub1_Sub1_4.method51(150 - this.anIntArray242[local613], this.anInt1030 + 1, 0, local742, this.anInt1029, this.anInt1033);
						this.aClass4_Sub1_Sub1_Sub1_4.method51(150 - this.anIntArray242[local613], this.anInt1030, local747, local742, this.anInt1029, this.anInt1033);
					}
					@Pc(1120) int local1120;
					if (this.anIntArray241[local613] == 4) {
						local822 = this.aClass4_Sub1_Sub1_Sub1_4.method47(this.anInt1050, local742);
						local1120 = (150 - this.anIntArray242[local613]) * (local822 + 100) / 150;
						Class4_Sub1_Sub1.method545(334, 0, this.anInt1029 - 50, this.anInt1029 + 50);
						this.aClass4_Sub1_Sub1_Sub1_4.method48(779, local742, this.anInt1029 + 50 - local1120, this.anInt1030 + 1, 0);
						this.aClass4_Sub1_Sub1_Sub1_4.method48(779, local742, this.anInt1029 + 50 - local1120, this.anInt1030, local747);
						Class4_Sub1_Sub1.method544(this.aBoolean259);
					}
					if (this.anIntArray241[local613] == 5) {
						local822 = 150 - this.anIntArray242[local613];
						local1120 = 0;
						if (local822 < 25) {
							local1120 = local822 - 25;
						} else if (local822 > 125) {
							local1120 = local822 - 125;
						}
						Class4_Sub1_Sub1.method545(this.anInt1030 + 5, this.anInt1030 - this.aClass4_Sub1_Sub1_Sub1_4.anInt35 - 1, 0, 512);
						this.aClass4_Sub1_Sub1_Sub1_4.method44(this.anInt1029, this.anInt1030 + local1120 + 1, local742, 0);
						this.aClass4_Sub1_Sub1_Sub1_4.method44(this.anInt1029, this.anInt1030 + local1120, local742, local747);
						Class4_Sub1_Sub1.method544(this.aBoolean259);
					}
				} else {
					this.aClass4_Sub1_Sub1_Sub1_4.method44(this.anInt1029, this.anInt1030 + 1, local742, 0);
					this.aClass4_Sub1_Sub1_Sub1_4.method44(this.anInt1029, this.anInt1030, local742, 16776960);
				}
			}
			if (arg0 > 0) {
				;
			}
		} catch (@Pc(1274) RuntimeException local1274) {
			signlink.reporterror("83066, " + arg0 + ", " + local1274.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method695() {
		try {
			if (this.anInt967 == 2) {
				for (@Pc(20) Class4_Sub2 local20 = (Class4_Sub2) this.aClass30_12.method346(); local20 != null; local20 = (Class4_Sub2) this.aClass30_12.method348()) {
					if (local20.anInt51 > 0) {
						local20.anInt51--;
					}
					if (local20.anInt51 != 0) {
						if (local20.anInt52 > 0) {
							local20.anInt52--;
						}
						if (local20.anInt52 == 0 && local20.anInt58 >= 1 && local20.anInt59 >= 1 && local20.anInt58 <= 102 && local20.anInt59 <= 102 && (local20.anInt53 < 0 || Class48.method515(local20.anInt55, local20.anInt53))) {
							this.method696(local20.anInt58, local20.anInt55, local20.anInt54, local20.anInt53, local20.anInt56, local20.anInt59, local20.anInt57);
							local20.anInt52 = -1;
							if (local20.anInt53 == local20.anInt48 && local20.anInt48 == -1) {
								local20.method572();
							} else if (local20.anInt53 == local20.anInt48 && local20.anInt54 == local20.anInt49 && local20.anInt55 == local20.anInt50) {
								local20.method572();
							}
						}
					} else if (local20.anInt48 < 0 || Class48.method515(local20.anInt50, local20.anInt48)) {
						this.method696(local20.anInt58, local20.anInt50, local20.anInt49, local20.anInt48, local20.anInt56, local20.anInt59, local20.anInt57);
						local20.method572();
					}
				}
				anInt1012++;
				if (anInt1012 > 1775) {
					anInt1012 = 0;
					this.aClass4_Sub1_Sub3_6.method91(161);
					this.aClass4_Sub1_Sub3_6.method92(0);
					@Pc(183) int local183 = this.aClass4_Sub1_Sub3_6.anInt101;
					this.aClass4_Sub1_Sub3_6.method93(13807);
					this.aClass4_Sub1_Sub3_6.method93(63614);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass4_Sub1_Sub3_6.method92(173);
					}
					this.aClass4_Sub1_Sub3_6.method92((int) (Math.random() * 256.0D));
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass4_Sub1_Sub3_6.method92(76);
					}
					this.aClass4_Sub1_Sub3_6.method93(61477);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass4_Sub1_Sub3_6.method93(27808);
					}
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass4_Sub1_Sub3_6.method93(55754);
					}
					this.aClass4_Sub1_Sub3_6.method92(211);
					this.aClass4_Sub1_Sub3_6.method92(248);
					this.aClass4_Sub1_Sub3_6.method101(this.aClass4_Sub1_Sub3_6.anInt101 - local183);
					return;
				}
			}
		} catch (@Pc(257) RuntimeException local257) {
			signlink.reporterror("33133, " + -13170 + ", " + local257.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIIIIII)V")
	private void method696(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			this.aBoolean241 &= true;
			if (arg0 >= 1 && arg5 >= 1 && arg0 <= 102 && arg5 <= 102) {
				if (aBoolean225 && arg4 != this.anInt981) {
					return;
				}
				@Pc(26) int local26 = 0;
				if (arg6 == 0) {
					local26 = this.aClass45_1.method457(arg4, arg0, arg5);
				}
				if (arg6 == 1) {
					local26 = this.aClass45_1.method458(arg4, arg0, arg5);
				}
				if (arg6 == 2) {
					local26 = this.aClass45_1.method459(arg4, arg0, arg5);
				}
				if (arg6 == 3) {
					local26 = this.aClass45_1.method460(arg4, arg0, arg5);
				}
				@Pc(82) int local82;
				if (local26 != 0) {
					local82 = this.aClass45_1.method461(arg4, arg0, arg5, local26);
					@Pc(88) int local88 = local26 >> 14 & 0x7FFF;
					@Pc(92) int local92 = local82 & 0x1F;
					@Pc(96) int local96 = local82 >> 6;
					@Pc(108) Class28 local108;
					if (arg6 == 0) {
						this.aClass45_1.method448(arg5, arg4, arg0);
						local108 = Class28.method334(local88);
						if (local108.aBoolean125) {
							this.aClass50Array1[arg4].method534(arg5, local96, local108.aBoolean136, arg0, local92);
						}
					}
					if (arg6 == 1) {
						this.aClass45_1.method449(arg5, arg0, arg4);
					}
					if (arg6 == 2) {
						this.aClass45_1.method450(arg5, arg0, arg4);
						local108 = Class28.method334(local88);
						if (arg0 + local108.anInt387 > 103 || arg5 + local108.anInt387 > 103 || arg0 + local108.anInt384 > 103 || arg5 + local108.anInt384 > 103) {
							return;
						}
						if (local108.aBoolean125) {
							this.aClass50Array1[arg4].method535(arg0, local108.aBoolean136, local108.anInt384, arg5, local108.anInt387, local96);
						}
					}
					if (arg6 == 3) {
						this.aClass45_1.method451(arg0, arg4, arg5);
						local108 = Class28.method334(local88);
						if (local108.aBoolean125 && local108.aBoolean126) {
							this.aClass50Array1[arg4].method537(arg5, this.anInt865, arg0);
						}
					}
				}
				if (arg3 >= 0) {
					local82 = arg4;
					if (arg4 < 3 && (this.aByteArrayArrayArray8[1][arg0][arg5] & 0x2) == 2) {
						local82 = arg4 + 1;
					}
					Class48.method524(arg0, this.aClass45_1, arg2, arg1, this.aClass50Array1[arg4], arg5, local82, this.anIntArrayArrayArray8, arg4, arg3);
					return;
				}
			}
		} catch (@Pc(256) RuntimeException local256) {
			signlink.reporterror("78856, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local256.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!FTMSICIZ;I)V")
	private void method697(@OriginalArg(1) Class4_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt843 = 0;
			this.anInt1044 = 0;
			this.method717(arg0, arg1);
			this.method600(arg0, arg1);
			this.method716(arg1, arg0);
			this.method713(arg0, this.aByte45, arg1);
			@Pc(43) int local43;
			for (@Pc(36) int local36 = 0; local36 < this.anInt843; local36++) {
				local43 = this.anIntArray216[local36];
				if (this.aClass4_Sub1_Sub2_Sub5_Sub2Array1[local43].anInt711 != anInt927) {
					this.aClass4_Sub1_Sub2_Sub5_Sub2Array1[local43] = null;
				}
			}
			if (arg0.anInt101 != arg1) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.anInt101 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local43 = 0; local43 < this.anInt1043; local43++) {
				if (this.aClass4_Sub1_Sub2_Sub5_Sub2Array1[this.anIntArray273[local43]] == null) {
					signlink.reporterror(this.aString18 + " null entry in pl list - pos:" + local43 + " size:" + this.anInt1043);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("98530, " + 5 + ", " + arg0 + ", " + arg1 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	private void method698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(1) Class4_Sub2 local1 = null;
			for (@Pc(6) Class4_Sub2 local6 = (Class4_Sub2) this.aClass30_12.method346(); local6 != null; local6 = (Class4_Sub2) this.aClass30_12.method348()) {
				if (local6.anInt56 == arg4 && local6.anInt58 == arg7 && local6.anInt59 == arg6 && local6.anInt57 == arg5) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class4_Sub2();
				local1.anInt56 = arg4;
				local1.anInt57 = arg5;
				local1.anInt58 = arg7;
				local1.anInt59 = arg6;
				this.method662(local1);
				this.aClass30_12.method343(local1);
			}
			local1.anInt53 = arg0;
			local1.anInt55 = arg8;
			local1.anInt54 = arg3;
			local1.anInt52 = arg2;
			local1.anInt51 = arg1;
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("20650, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 6 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(5) int local5 = 2048 - arg5 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg4 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg3;
			@Pc(23) int local23;
			@Pc(27) int local27;
			@Pc(37) int local37;
			if (local5 != 0) {
				local23 = Class4_Sub1_Sub2_Sub3.anIntArray71[local5];
				local27 = Class4_Sub1_Sub2_Sub3.anIntArray72[local5];
				local37 = local27 * 0 - arg3 * local23 >> 16;
				local17 = local23 * 0 + arg3 * local27 >> 16;
				local15 = local37;
			}
			if (local11 != 0) {
				local23 = Class4_Sub1_Sub2_Sub3.anIntArray71[local11];
				local27 = Class4_Sub1_Sub2_Sub3.anIntArray72[local11];
				local37 = local17 * local23 + local27 * 0 >> 16;
				local17 = local17 * local27 - local23 * 0 >> 16;
				local13 = local37;
			}
			this.anInt928 = arg2 - local13;
			@Pc(90) boolean local90 = false;
			this.anInt929 = arg1 - local15;
			this.anInt930 = arg0 - local17;
			this.anInt931 = arg5;
			this.anInt932 = arg4;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("15694, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)Z")
	private boolean method700() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("15557, " + -24738 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BLclient!PCARWQQC;)V")
	private void method701(@OriginalArg(1) Class26 arg0) {
		try {
			if (this.aByte43 != 90) {
				this.anInt996 = -1;
			}
			@Pc(11) int local11 = arg0.anInt337;
			@Pc(67) int local67;
			if ((local11 < 1 || local11 > 100) && (local11 < 701 || local11 > 800)) {
				if (local11 >= 101 && local11 <= 200 || !(local11 < 801 || local11 > 900)) {
					local67 = this.anInt910;
					if (this.anInt911 != 2) {
						local67 = 0;
					}
					if (local11 > 800) {
						local11 -= 701;
					} else {
						local11 -= 101;
					}
					if (local11 >= local67) {
						arg0.aString9 = "";
						arg0.anInt340 = 0;
					} else {
						if (this.anIntArray235[local11] == 0) {
							arg0.aString9 = "@red@Offline";
						} else if (this.anIntArray235[local11] < 200) {
							if (this.anIntArray235[local11] == anInt852) {
								arg0.aString9 = "@gre@World" + (this.anIntArray235[local11] - 9);
							} else {
								arg0.aString9 = "@yel@World" + (this.anIntArray235[local11] - 9);
							}
						} else if (this.anIntArray235[local11] == anInt852) {
							arg0.aString9 = "@gre@Classic" + (this.anIntArray235[local11] - 219);
						} else {
							arg0.aString9 = "@yel@Classic" + (this.anIntArray235[local11] - 219);
						}
						arg0.anInt340 = 1;
					}
				} else if (local11 == 203) {
					local67 = this.anInt910;
					if (this.anInt911 != 2) {
						local67 = 0;
					}
					arg0.anInt352 = local67 * 15 + 20;
					if (arg0.anInt352 <= arg0.anInt357) {
						arg0.anInt352 = arg0.anInt357 + 1;
					}
				} else if (local11 >= 401 && local11 <= 500) {
					local11 -= 401;
					if (local11 == 0 && this.anInt911 == 0) {
						arg0.aString9 = "Loading ignore list";
						arg0.anInt340 = 0;
					} else if (local11 == 1 && this.anInt911 == 0) {
						arg0.aString9 = "Please wait...";
						arg0.anInt340 = 0;
					} else {
						local67 = this.anInt933;
						if (this.anInt911 == 0) {
							local67 = 0;
						}
						if (local11 >= local67) {
							arg0.aString9 = "";
							arg0.anInt340 = 0;
						} else {
							arg0.aString9 = Class36.method382(Class36.method379(this.aLongArray4[local11]), 78);
							arg0.anInt340 = 1;
						}
					}
				} else if (local11 == 503) {
					arg0.anInt352 = this.anInt933 * 15 + 20;
					if (arg0.anInt352 <= arg0.anInt357) {
						arg0.anInt352 = arg0.anInt357 + 1;
					}
				} else if (local11 == 327) {
					arg0.anInt350 = 150;
					arg0.anInt351 = (int) (Math.sin((double) anInt927 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean238) {
						for (local67 = 0; local67 < 7; local67++) {
							@Pc(380) int local380 = this.anIntArray270[local67];
							if (local380 >= 0 && !Class46.aClass46Array1[local380].method484()) {
								return;
							}
						}
						this.aBoolean238 = false;
						@Pc(399) Class4_Sub1_Sub2_Sub3[] local399 = new Class4_Sub1_Sub2_Sub3[7];
						@Pc(401) int local401 = 0;
						for (@Pc(403) int local403 = 0; local403 < 7; local403++) {
							@Pc(410) int local410 = this.anIntArray270[local403];
							if (local410 >= 0) {
								local399[local401++] = Class46.aClass46Array1[local410].method485();
							}
						}
						@Pc(432) Class4_Sub1_Sub2_Sub3 local432 = new Class4_Sub1_Sub2_Sub3(local401, local399, 127);
						for (@Pc(434) int local434 = 0; local434 < 5; local434++) {
							if (this.anIntArray232[local434] != 0) {
								local432.method269(anIntArrayArray25[local434][0], anIntArrayArray25[local434][this.anIntArray232[local434]]);
								if (local434 == 1) {
									local432.method269(anIntArray233[0], anIntArray233[this.anIntArray232[local434]]);
								}
							}
						}
						local432.method262();
						local432.method263(Class27.aClass27Array1[aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt724].anIntArray95[0]);
						local432.method272(64, 850, -30, -50, -30, true);
						arg0.anInt344 = 5;
						arg0.anInt345 = 0;
						Class26.method324(local432);
					}
				} else if (local11 == 324) {
					if (this.aClass4_Sub1_Sub1_Sub3_5 == null) {
						this.aClass4_Sub1_Sub1_Sub3_5 = arg0.aClass4_Sub1_Sub1_Sub3_1;
						this.aClass4_Sub1_Sub1_Sub3_6 = arg0.aClass4_Sub1_Sub1_Sub3_2;
					}
					if (this.aBoolean222) {
						arg0.aClass4_Sub1_Sub1_Sub3_1 = this.aClass4_Sub1_Sub1_Sub3_6;
					} else {
						arg0.aClass4_Sub1_Sub1_Sub3_1 = this.aClass4_Sub1_Sub1_Sub3_5;
					}
				} else if (local11 == 325) {
					if (this.aClass4_Sub1_Sub1_Sub3_5 == null) {
						this.aClass4_Sub1_Sub1_Sub3_5 = arg0.aClass4_Sub1_Sub1_Sub3_1;
						this.aClass4_Sub1_Sub1_Sub3_6 = arg0.aClass4_Sub1_Sub1_Sub3_2;
					}
					if (this.aBoolean222) {
						arg0.aClass4_Sub1_Sub1_Sub3_1 = this.aClass4_Sub1_Sub1_Sub3_5;
					} else {
						arg0.aClass4_Sub1_Sub1_Sub3_1 = this.aClass4_Sub1_Sub1_Sub3_6;
					}
				} else if (local11 == 600) {
					arg0.aString9 = this.aString22;
					if (anInt927 % 20 < 10) {
						arg0.aString9 = arg0.aString9 + "|";
					} else {
						arg0.aString9 = arg0.aString9 + " ";
					}
				} else {
					if (local11 == 620) {
						if (this.anInt877 < 1) {
							arg0.aString9 = "";
						} else if (this.aBoolean264) {
							arg0.anInt330 = 16711680;
							arg0.aString9 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt330 = 16777215;
							arg0.aString9 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(639) String local639;
					if (local11 == 660) {
						local67 = this.anInt920 - this.anInt926;
						if (local67 <= 0) {
							local639 = "earlier today";
						} else if (local67 == 1) {
							local639 = "yesterday";
						} else {
							local639 = local67 + " days ago";
						}
						arg0.aString9 = "You last logged in @red@" + local639 + "@bla@ from: @red@" + signlink.dns;
					}
					if (local11 == 661) {
						if (this.anInt862 == 0) {
							arg0.aString9 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
						} else if (this.anInt862 <= this.anInt920) {
							arg0.aString9 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method702(this.anInt862);
						} else {
							local67 = this.anInt920 + 14 - this.anInt862;
							if (local67 <= 0) {
								local639 = "Earlier today";
							} else if (local67 == 1) {
								local639 = "Yesterday";
							} else {
								local639 = local67 + " days ago";
							}
							arg0.aString9 = local639 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method702(this.anInt862) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
						}
					}
					if (local11 == 662) {
						@Pc(757) String local757;
						if (this.anInt900 == 0) {
							local757 = "@yel@0 unread messages";
						} else if (this.anInt900 == 1) {
							local757 = "@gre@1 unread message";
						} else {
							local757 = "@gre@" + this.anInt900 + " unread messages";
						}
						arg0.aString9 = "You have " + local757 + "\\nin your message centre.";
					}
					if (local11 == 663) {
						if (this.anInt993 > 0 && this.anInt993 <= this.anInt920 + 10) {
							arg0.aString9 = "Last password change:\\n@gre@" + this.method702(this.anInt993);
						} else {
							arg0.aString9 = "Last password change:\\n@gre@Never changed";
						}
					}
					if (local11 == 665) {
						if (this.anInt830 > 2 && !aBoolean224) {
							arg0.aString9 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
						} else if (this.anInt830 > 2) {
							arg0.aString9 = "\\n\\nYou have @gre@" + this.anInt830 + "@yel@ days of\\nmember credit remaining.";
						} else if (this.anInt830 > 0) {
							arg0.aString9 = "You have @gre@" + this.anInt830 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
						} else {
							arg0.aString9 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
						}
					}
					if (local11 == 667) {
						if (this.anInt830 > 2 && !aBoolean224) {
							arg0.aString9 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
						} else if (this.anInt830 > 0) {
							arg0.aString9 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
						} else {
							arg0.aString9 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
						}
					}
					if (local11 == 668) {
						if (this.anInt862 > this.anInt920) {
							arg0.aString9 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
						} else {
							arg0.aString9 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
						}
					}
				}
			} else if (local11 == 1 && this.anInt911 == 0) {
				arg0.aString9 = "Loading friend list";
				arg0.anInt340 = 0;
			} else if (local11 == 1 && this.anInt911 == 1) {
				arg0.aString9 = "Connecting to friendserver";
				arg0.anInt340 = 0;
			} else if (local11 == 2 && this.anInt911 != 2) {
				arg0.aString9 = "Please wait...";
				arg0.anInt340 = 0;
			} else {
				local67 = this.anInt910;
				if (this.anInt911 != 2) {
					local67 = 0;
				}
				if (local11 > 700) {
					local11 -= 601;
				} else {
					local11--;
				}
				if (local11 >= local67) {
					arg0.aString9 = "";
					arg0.anInt340 = 0;
				} else {
					arg0.aString9 = this.aStringArray14[local11];
					arg0.anInt340 = 1;
				}
			}
		} catch (@Pc(914) RuntimeException local914) {
			signlink.reporterror("49276, " + 90 + ", " + arg0 + ", " + local914.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)Ljava/lang/String;")
	private String method702(@OriginalArg(1) int arg0) {
		try {
			if (arg0 > this.anInt920 + 10) {
				return "Unknown";
			}
			@Pc(14) long local14 = ((long) arg0 + 11745L) * 86400000L;
			@Pc(16) Calendar local16 = Calendar.getInstance();
			local16.setTime(new Date(local14));
			@Pc(31) int local31 = local16.get(5);
			@Pc(35) int local35 = local16.get(2);
			@Pc(39) int local39 = local16.get(1);
			@Pc(90) String[] local90 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
			return local31 + "-" + local90[local35] + "-" + local39;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("83423, " + 392 + ", " + arg0 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!PCARWQQC;IBIIII)V")
	private void method703(@OriginalArg(0) int arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			@Pc(6) boolean local6 = false;
			if (arg1.anInt347 == 0 && arg1.anIntArray87 != null && !arg1.aBoolean113 && (arg4 >= arg0 && arg5 >= arg7 && arg4 <= arg0 + arg1.anInt362 && arg5 <= arg7 + arg1.anInt357)) {
				@Pc(44) int local44 = arg1.anIntArray87.length;
				for (@Pc(46) int local46 = 0; local46 < local44; local46++) {
					@Pc(55) int local55 = arg1.anIntArray90[local46] + arg0;
					@Pc(64) int local64 = arg1.anIntArray91[local46] + arg7 - arg6;
					@Pc(70) Class26 local70 = Class26.method319(arg1.anIntArray87[local46]);
					@Pc(75) int local75 = local55 + local70.anInt333;
					@Pc(80) int local80 = local64 + local70.anInt361;
					if ((local70.anInt331 >= 0 || local70.anInt343 != 0) && arg4 >= local75 && arg5 >= local80 && arg4 < local75 + local70.anInt362 && arg5 < local80 + local70.anInt357) {
						if (local70.anInt331 >= 0) {
							this.anInt1024 = local70.anInt331;
						} else {
							this.anInt1024 = local70.anInt334;
						}
					}
					if (local70.anInt347 == 8 && arg4 >= local75 && arg5 >= local80 && arg4 < local75 + local70.anInt362 && arg5 < local80 + local70.anInt357) {
						this.anInt1019 = local70.anInt334;
					}
					if (local70.anInt347 == 0) {
						this.method703(local75, local70, arg2, (byte) 1, arg4, arg5, local70.anInt339, local80);
						if (local70.anInt352 > local70.anInt357) {
							this.method594(arg2, local75 + local70.anInt362, local70, local80, local70.anInt357, local70.anInt352, arg4, arg5);
						}
					} else {
						if (local70.anInt340 == 1 && arg4 >= local75 && arg5 >= local80 && arg4 < local75 + local70.anInt362 && arg5 < local80 + local70.anInt357) {
							@Pc(204) boolean local204 = false;
							if (local70.anInt337 != 0) {
								local204 = this.method647(local70);
							}
							if (!local204) {
								this.aStringArray8[this.anInt990] = local70.aString7;
								this.anIntArray229[this.anInt990] = 741;
								this.anIntArray228[this.anInt990] = local70.anInt334;
								this.anInt990++;
							}
						}
						if (local70.anInt340 == 2 && this.anInt879 == 0 && arg4 >= local75 && arg5 >= local80 && arg4 < local75 + local70.anInt362 && arg5 < local80 + local70.anInt357) {
							@Pc(268) String local268 = local70.aString5;
							if (local268.indexOf(" ") != -1) {
								local268 = local268.substring(0, local268.indexOf(" "));
							}
							this.aStringArray8[this.anInt990] = local268 + " @gre@" + local70.aString8;
							this.anIntArray229[this.anInt990] = 508;
							this.anIntArray228[this.anInt990] = local70.anInt334;
							this.anInt990++;
						}
						if (local70.anInt340 == 3 && arg4 >= local75 && arg5 >= local80 && arg4 < local75 + local70.anInt362 && arg5 < local80 + local70.anInt357) {
							this.aStringArray8[this.anInt990] = "Close";
							if (arg2 == 3) {
								this.anIntArray229[this.anInt990] = 269;
							} else {
								this.anIntArray229[this.anInt990] = 531;
							}
							this.anIntArray228[this.anInt990] = local70.anInt334;
							this.anInt990++;
						}
						if (local70.anInt340 == 4 && arg4 >= local75 && arg5 >= local80 && arg4 < local75 + local70.anInt362 && arg5 < local80 + local70.anInt357) {
							this.aStringArray8[this.anInt990] = local70.aString7;
							this.anIntArray229[this.anInt990] = 923;
							this.anIntArray228[this.anInt990] = local70.anInt334;
							this.anInt990++;
						}
						if (local70.anInt340 == 5 && arg4 >= local75 && arg5 >= local80 && arg4 < local75 + local70.anInt362 && arg5 < local80 + local70.anInt357) {
							this.aStringArray8[this.anInt990] = local70.aString7;
							this.anIntArray229[this.anInt990] = 417;
							this.anIntArray228[this.anInt990] = local70.anInt334;
							this.anInt990++;
						}
						if (local70.anInt340 == 6 && !this.aBoolean235 && arg4 >= local75 && arg5 >= local80 && arg4 < local75 + local70.anInt362 && arg5 < local80 + local70.anInt357) {
							this.aStringArray8[this.anInt990] = local70.aString7;
							this.anIntArray229[this.anInt990] = 1;
							this.anIntArray228[this.anInt990] = local70.anInt334;
							this.anInt990++;
						}
						if (local70.anInt347 == 2) {
							@Pc(527) int local527 = 0;
							for (@Pc(529) int local529 = 0; local529 < local70.anInt357; local529++) {
								for (@Pc(533) int local533 = 0; local533 < local70.anInt362; local533++) {
									@Pc(544) int local544 = local75 + local533 * (local70.anInt364 + 32);
									@Pc(553) int local553 = local80 + local529 * (local70.anInt355 + 32);
									if (local527 < 20) {
										local544 += local70.anIntArray93[local527];
										local553 += local70.anIntArray94[local527];
									}
									if (arg4 >= local544 && arg5 >= local553 && arg4 < local544 + 32 && arg5 < local553 + 32) {
										this.anInt983 = local527;
										this.anInt984 = local70.anInt334;
										if (local70.anIntArray86[local527] > 0) {
											@Pc(606) Class24 local606 = Class24.method315(local70.anIntArray86[local527] - 1);
											if (this.anInt848 == 1 && local70.aBoolean117) {
												if (local70.anInt334 != this.anInt850 || local527 != this.anInt849) {
													this.aStringArray8[this.anInt990] = "Use " + this.aString20 + " with @lre@" + local606.aString3;
													this.anIntArray229[this.anInt990] = 51;
													this.anIntArray230[this.anInt990] = local606.anInt304;
													this.anIntArray227[this.anInt990] = local527;
													this.anIntArray228[this.anInt990] = local70.anInt334;
													this.anInt990++;
												}
											} else if (this.anInt879 != 1 || !local70.aBoolean117) {
												@Pc(743) int local743;
												if (local70.aBoolean117) {
													for (local743 = 4; local743 >= 3; local743--) {
														if (local606.aStringArray2 != null && local606.aStringArray2[local743] != null) {
															this.aStringArray8[this.anInt990] = local606.aStringArray2[local743] + " @lre@" + local606.aString3;
															if (local743 == 3) {
																this.anIntArray229[this.anInt990] = 4;
															}
															if (local743 == 4) {
																this.anIntArray229[this.anInt990] = 856;
															}
															this.anIntArray230[this.anInt990] = local606.anInt304;
															this.anIntArray227[this.anInt990] = local527;
															this.anIntArray228[this.anInt990] = local70.anInt334;
															this.anInt990++;
														} else if (local743 == 4) {
															this.aStringArray8[this.anInt990] = "Drop @lre@" + local606.aString3;
															this.anIntArray229[this.anInt990] = 856;
															this.anIntArray230[this.anInt990] = local606.anInt304;
															this.anIntArray227[this.anInt990] = local527;
															this.anIntArray228[this.anInt990] = local70.anInt334;
															this.anInt990++;
														}
													}
												}
												if (local70.aBoolean122) {
													this.aStringArray8[this.anInt990] = "Use @lre@" + local606.aString3;
													this.anIntArray229[this.anInt990] = 529;
													this.anIntArray230[this.anInt990] = local606.anInt304;
													this.anIntArray227[this.anInt990] = local527;
													this.anIntArray228[this.anInt990] = local70.anInt334;
													this.anInt990++;
												}
												if (local70.aBoolean117 && local606.aStringArray2 != null) {
													for (local743 = 2; local743 >= 0; local743--) {
														if (local606.aStringArray2[local743] != null) {
															this.aStringArray8[this.anInt990] = local606.aStringArray2[local743] + " @lre@" + local606.aString3;
															if (local743 == 0) {
																this.anIntArray229[this.anInt990] = 682;
															}
															if (local743 == 1) {
																this.anIntArray229[this.anInt990] = 486;
															}
															if (local743 == 2) {
																this.anIntArray229[this.anInt990] = 593;
															}
															this.anIntArray230[this.anInt990] = local606.anInt304;
															this.anIntArray227[this.anInt990] = local527;
															this.anIntArray228[this.anInt990] = local70.anInt334;
															this.anInt990++;
														}
													}
												}
												if (local70.aStringArray4 != null) {
													for (local743 = 4; local743 >= 0; local743--) {
														if (local70.aStringArray4[local743] != null) {
															this.aStringArray8[this.anInt990] = local70.aStringArray4[local743] + " @lre@" + local606.aString3;
															if (local743 == 0) {
																this.anIntArray229[this.anInt990] = 113;
															}
															if (local743 == 1) {
																this.anIntArray229[this.anInt990] = 490;
															}
															if (local743 == 2) {
																this.anIntArray229[this.anInt990] = 489;
															}
															if (local743 == 3) {
																this.anIntArray229[this.anInt990] = 315;
															}
															if (local743 == 4) {
																this.anIntArray229[this.anInt990] = 422;
															}
															this.anIntArray230[this.anInt990] = local606.anInt304;
															this.anIntArray227[this.anInt990] = local527;
															this.anIntArray228[this.anInt990] = local70.anInt334;
															this.anInt990++;
														}
													}
												}
												this.aStringArray8[this.anInt990] = "Examine @lre@" + local606.aString3;
												this.anIntArray229[this.anInt990] = 1314;
												this.anIntArray230[this.anInt990] = local606.anInt304;
												this.anIntArray227[this.anInt990] = local527;
												this.anIntArray228[this.anInt990] = local70.anInt334;
												this.anInt990++;
											} else if ((this.anInt881 & 0x10) == 16) {
												this.aStringArray8[this.anInt990] = this.aString21 + " @lre@" + local606.aString3;
												this.anIntArray229[this.anInt990] = 906;
												this.anIntArray230[this.anInt990] = local606.anInt304;
												this.anIntArray227[this.anInt990] = local527;
												this.anIntArray228[this.anInt990] = local70.anInt334;
												this.anInt990++;
											}
										}
									}
									local527++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1173) RuntimeException local1173) {
			signlink.reporterror("52874, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local1173.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZII)V")
	private void method704(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			signlink.anInt1064 = arg1;
			if (arg0) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("90021, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method705() {
		try {
			this.aBoolean241 &= true;
			this.method666(this.anInt980);
			if (this.anInt973 == 1) {
				this.aClass4_Sub1_Sub1_Sub3Array6[this.anInt972 / 100].method239(233, this.anInt970 - 8 - 4, this.anInt971 - 8 - 4);
			}
			@Pc(85) int local85;
			if (this.anInt973 == 2) {
				this.aClass4_Sub1_Sub1_Sub3Array6[this.anInt972 / 100 + 4].method239(233, this.anInt970 - 8 - 4, this.anInt971 - 8 - 4);
				anInt885++;
				if (anInt885 > 1088) {
					anInt885 = 0;
					this.aClass4_Sub1_Sub3_6.method91(158);
					this.aClass4_Sub1_Sub3_6.method92(0);
					local85 = this.aClass4_Sub1_Sub3_6.anInt101;
					this.aClass4_Sub1_Sub3_6.method92(191);
					this.aClass4_Sub1_Sub3_6.method93((int) (Math.random() * 65536.0D));
					this.aClass4_Sub1_Sub3_6.method92(252);
					this.aClass4_Sub1_Sub3_6.method93((int) (Math.random() * 65536.0D));
					this.aClass4_Sub1_Sub3_6.method93(57323);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass4_Sub1_Sub3_6.method93(6617);
					}
					this.aClass4_Sub1_Sub3_6.method93((int) (Math.random() * 65536.0D));
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass4_Sub1_Sub3_6.method92(218);
					}
					this.aClass4_Sub1_Sub3_6.method93(45149);
					this.aClass4_Sub1_Sub3_6.method92((int) (Math.random() * 256.0D));
					this.aClass4_Sub1_Sub3_6.method101(this.aClass4_Sub1_Sub3_6.anInt101 - local85);
				}
			}
			if (this.anInt1027 != -1) {
				this.method609(this.anInt1027, this.anInt947);
				this.method617(0, 0, Class26.method319(this.anInt1027), 0);
			}
			if (this.anInt863 != -1) {
				this.method609(this.anInt863, this.anInt947);
				this.method617(0, 0, Class26.method319(this.anInt863), 0);
			}
			this.method606();
			if (!this.aBoolean237) {
				this.method634();
				this.method653();
			} else if (this.anInt891 == 0) {
				this.method657();
			}
			if (this.anInt856 == 1) {
				this.aClass4_Sub1_Sub1_Sub3_17.method239(233, 472, 296);
			}
			@Pc(236) int local236;
			@Pc(268) int local268;
			if (aBoolean236) {
				@Pc(234) byte local234 = 20;
				local236 = 16776960;
				if (super.anInt814 < 30 && aBoolean225) {
					local236 = 16711680;
				}
				if (super.anInt814 < 20 && !aBoolean225) {
					local236 = 16711680;
				}
				this.aClass4_Sub1_Sub1_Sub1_3.method43(20, "Fps:" + super.anInt814, local236);
				local268 = local234 + 15;
				@Pc(270) Runtime local270 = Runtime.getRuntime();
				@Pc(279) int local279 = (int) ((local270.totalMemory() - local270.freeMemory()) / 1024L);
				if (local279 > 33554432 && aBoolean225) {
				}
				if (local279 > 67108864 && !aBoolean225) {
				}
				this.aClass4_Sub1_Sub1_Sub1_3.method43(35, "Mem:" + local279 + "k", 16776960);
				local268 += 15;
			}
			if (this.anInt1040 != 0) {
				local85 = this.anInt1040 / 50;
				local268 = local85 / 60;
				local85 %= 60;
				if (local85 < 10) {
					this.aClass4_Sub1_Sub1_Sub1_3.method48(779, "System update in: " + local268 + ":0" + local85, 4, 329, 16776960);
				} else {
					this.aClass4_Sub1_Sub1_Sub1_3.method48(779, "System update in: " + local268 + ":" + local85, 4, 329, 16776960);
				}
				anInt921++;
				if (anInt921 > 1677) {
					anInt921 = 0;
					this.aClass4_Sub1_Sub3_6.method91(211);
					this.aClass4_Sub1_Sub3_6.method92(0);
					local236 = this.aClass4_Sub1_Sub3_6.anInt101;
					this.aClass4_Sub1_Sub3_6.method92(151);
					this.aClass4_Sub1_Sub3_6.method93(56197);
					this.aClass4_Sub1_Sub3_6.method93((int) (Math.random() * 65536.0D));
					this.aClass4_Sub1_Sub3_6.method92(200);
					this.aClass4_Sub1_Sub3_6.method92(125);
					this.aClass4_Sub1_Sub3_6.method93((int) (Math.random() * 65536.0D));
					this.aClass4_Sub1_Sub3_6.method92(53);
					this.aClass4_Sub1_Sub3_6.method93(49325);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass4_Sub1_Sub3_6.method93(62961);
					}
					this.aClass4_Sub1_Sub3_6.method93(38474);
					this.aClass4_Sub1_Sub3_6.method101(this.aClass4_Sub1_Sub3_6.anInt101 - local236);
					return;
				}
			}
		} catch (@Pc(453) RuntimeException local453) {
			signlink.reporterror("84478, " + true + ", " + local453.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIZIBII)Z")
	private boolean method706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray22[local7][local11] = 0;
					this.anIntArrayArray24[local7][local11] = 99999999;
				}
			}
			local11 = arg6;
			@Pc(39) int local39 = arg5;
			this.anIntArrayArray22[arg6][arg5] = 99;
			this.anIntArrayArray24[arg6][arg5] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray244[0] = arg6;
			@Pc(74) int local74 = local55 + 1;
			this.anIntArray245[0] = arg5;
			@Pc(78) boolean local78 = false;
			@Pc(82) int local82 = this.anIntArray244.length;
			@Pc(89) int[][] local89 = this.aClass50Array1[this.anInt981].anIntArrayArray18;
			@Pc(200) int local200;
			while (local57 != local74) {
				local11 = this.anIntArray244[local57];
				local39 = this.anIntArray245[local57];
				local57 = (local57 + 1) % local82;
				if (local11 == arg8 && local39 == arg0) {
					local78 = true;
					break;
				}
				if (arg10 != 0) {
					if ((arg10 < 5 || arg10 == 10) && this.aClass50Array1[this.anInt981].method538(arg0, arg3, arg10 - 1, local39, arg8, local11)) {
						local78 = true;
						break;
					}
					if (arg10 < 10 && this.aClass50Array1[this.anInt981].method539(arg3, arg0, local39, arg10 - 1, local11, arg8)) {
						local78 = true;
						break;
					}
				}
				if (arg4 != 0 && arg9 != 0 && this.aClass50Array1[this.anInt981].method540(local39, local11, arg9, arg0, arg8, arg4, arg2)) {
					local78 = true;
					break;
				}
				local200 = this.anIntArrayArray24[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray22[local11 - 1][local39] == 0 && (local89[local11 - 1][local39] & 0x1280108) == 0) {
					this.anIntArray244[local74] = local11 - 1;
					this.anIntArray245[local74] = local39;
					local74 = (local74 + 1) % local82;
					this.anIntArrayArray22[local11 - 1][local39] = 2;
					this.anIntArrayArray24[local11 - 1][local39] = local200;
				}
				if (local11 < 103 && this.anIntArrayArray22[local11 + 1][local39] == 0 && (local89[local11 + 1][local39] & 0x1280180) == 0) {
					this.anIntArray244[local74] = local11 + 1;
					this.anIntArray245[local74] = local39;
					local74 = (local74 + 1) % local82;
					this.anIntArrayArray22[local11 + 1][local39] = 8;
					this.anIntArrayArray24[local11 + 1][local39] = local200;
				}
				if (local39 > 0 && this.anIntArrayArray22[local11][local39 - 1] == 0 && (local89[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray244[local74] = local11;
					this.anIntArray245[local74] = local39 - 1;
					local74 = (local74 + 1) % local82;
					this.anIntArrayArray22[local11][local39 - 1] = 1;
					this.anIntArrayArray24[local11][local39 - 1] = local200;
				}
				if (local39 < 103 && this.anIntArrayArray22[local11][local39 + 1] == 0 && (local89[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray244[local74] = local11;
					this.anIntArray245[local74] = local39 + 1;
					local74 = (local74 + 1) % local82;
					this.anIntArrayArray22[local11][local39 + 1] = 4;
					this.anIntArrayArray24[local11][local39 + 1] = local200;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray22[local11 - 1][local39 - 1] == 0 && (local89[local11 - 1][local39 - 1] & 0x128010E) == 0 && (local89[local11 - 1][local39] & 0x1280108) == 0 && (local89[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray244[local74] = local11 - 1;
					this.anIntArray245[local74] = local39 - 1;
					local74 = (local74 + 1) % local82;
					this.anIntArrayArray22[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray24[local11 - 1][local39 - 1] = local200;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray22[local11 + 1][local39 - 1] == 0 && (local89[local11 + 1][local39 - 1] & 0x1280183) == 0 && (local89[local11 + 1][local39] & 0x1280180) == 0 && (local89[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray244[local74] = local11 + 1;
					this.anIntArray245[local74] = local39 - 1;
					local74 = (local74 + 1) % local82;
					this.anIntArrayArray22[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray24[local11 + 1][local39 - 1] = local200;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray22[local11 - 1][local39 + 1] == 0 && (local89[local11 - 1][local39 + 1] & 0x1280138) == 0 && (local89[local11 - 1][local39] & 0x1280108) == 0 && (local89[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray244[local74] = local11 - 1;
					this.anIntArray245[local74] = local39 + 1;
					local74 = (local74 + 1) % local82;
					this.anIntArrayArray22[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray24[local11 - 1][local39 + 1] = local200;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray22[local11 + 1][local39 + 1] == 0 && (local89[local11 + 1][local39 + 1] & 0x12801E0) == 0 && (local89[local11 + 1][local39] & 0x1280180) == 0 && (local89[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray244[local74] = local11 + 1;
					this.anIntArray245[local74] = local39 + 1;
					local74 = (local74 + 1) % local82;
					this.anIntArrayArray22[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray24[local11 + 1][local39 + 1] = local200;
				}
			}
			this.anInt844 = 0;
			@Pc(816) int local816;
			@Pc(822) int local822;
			@Pc(828) int local828;
			if (!local78) {
				if (!arg7) {
					return false;
				}
				local200 = 1000;
				local816 = 100;
				for (local822 = arg8 - 10; local822 <= arg8 + 10; local822++) {
					for (local828 = arg0 - 10; local828 <= arg0 + 10; local828++) {
						if (local822 >= 0 && local828 >= 0 && local822 < 104 && local828 < 104 && this.anIntArrayArray24[local822][local828] < 100) {
							@Pc(850) int local850 = 0;
							if (local822 < arg8) {
								local850 = arg8 - local822;
							} else if (local822 > arg8 + arg4 - 1) {
								local850 = local822 + 1 - arg8 - arg4;
							}
							@Pc(876) int local876 = 0;
							if (local828 < arg0) {
								local876 = arg0 - local828;
							} else if (local828 > arg0 + arg9 - 1) {
								local876 = local828 + 1 - arg0 - arg9;
							}
							@Pc(908) int local908 = local850 * local850 + local876 * local876;
							if (local908 < local200 || local908 == local200 && this.anIntArrayArray24[local822][local828] < local816) {
								local200 = local908;
								local816 = this.anIntArrayArray24[local822][local828];
								local11 = local822;
								local39 = local828;
							}
						}
					}
				}
				if (local200 == 1000) {
					return false;
				}
				if (local11 == arg6 && local39 == arg5) {
					return false;
				}
				this.anInt844 = 1;
			}
			@Pc(969) byte local969 = 0;
			this.anIntArray244[0] = local11;
			local57 = local969 + 1;
			this.anIntArray245[0] = local39;
			local200 = local816 = this.anIntArrayArray22[local11][local39];
			while (local11 != arg6 || local39 != arg5) {
				if (local200 != local816) {
					local816 = local200;
					this.anIntArray244[local57] = local11;
					this.anIntArray245[local57++] = local39;
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
				local200 = this.anIntArrayArray22[local11][local39];
			}
			if (local57 > 0) {
				local82 = local57;
				if (local57 > 25) {
					local82 = 25;
				}
				local57--;
				@Pc(1059) int local1059 = this.anIntArray244[local57];
				local822 = this.anIntArray245[local57];
				if (arg1 == 0) {
					this.aClass4_Sub1_Sub3_6.method91(130);
					this.aClass4_Sub1_Sub3_6.method92(local82 + local82 + 3);
				}
				if (arg1 == 1) {
					this.aClass4_Sub1_Sub3_6.method91(97);
					this.aClass4_Sub1_Sub3_6.method92(local82 + local82 + 3 + 14);
				}
				if (arg1 == 2) {
					this.aClass4_Sub1_Sub3_6.method91(32);
					this.aClass4_Sub1_Sub3_6.method92(local82 + local82 + 3);
				}
				this.anInt1003 = this.anIntArray244[0];
				this.anInt1004 = this.anIntArray245[0];
				for (local828 = 1; local828 < local82; local828++) {
					local57--;
					this.aClass4_Sub1_Sub3_6.method120(this.anIntArray244[local57] - local1059);
					this.aClass4_Sub1_Sub3_6.method118(this.anIntArray245[local57] - local822);
				}
				this.aClass4_Sub1_Sub3_6.method93(local822 + this.anInt839);
				this.aClass4_Sub1_Sub3_6.method128(local1059 + this.anInt838);
				this.aClass4_Sub1_Sub3_6.method120(super.anIntArray210[5] == 1 ? 1 : 0);
				return true;
			} else if (arg1 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1192) RuntimeException local1192) {
			signlink.reporterror("41719, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + -85 + ", " + arg9 + ", " + arg10 + ", " + local1192.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
	private void method707() {
		try {
			while (true) {
				@Pc(13) Class4_Sub1_Sub4 local13 = this.aClass20_Sub1_1.method298();
				if (local13 == null) {
					return;
				}
				if (local13.anInt637 == 0) {
					Class4_Sub1_Sub2_Sub3.method253(local13.anInt636, local13.aByteArray20);
					if ((this.aClass20_Sub1_1.method300(local13.anInt636) & 0x62) != 0) {
						this.aBoolean255 = true;
						if (this.anInt882 != -1 || this.anInt888 != -1) {
							this.aBoolean260 = true;
						}
					}
				}
				if (local13.anInt637 == 1 && local13.aByteArray20 != null) {
					Class37.method385(local13.aByteArray20);
				}
				if (local13.anInt637 == 2 && local13.anInt636 == this.anInt961 && local13.aByteArray20 != null) {
					this.method715(this.aBoolean253, local13.aByteArray20, this.aBoolean243);
				}
				if (local13.anInt637 == 3 && this.anInt967 == 1) {
					for (@Pc(89) int local89 = 0; local89 < this.aByteArrayArray5.length; local89++) {
						if (this.anIntArray257[local89] == local13.anInt636) {
							this.aByteArrayArray5[local89] = local13.aByteArray20;
							if (local13.aByteArray20 == null) {
								this.anIntArray257[local89] = -1;
							}
							break;
						}
						if (this.anIntArray258[local89] == local13.anInt636) {
							this.aByteArrayArray6[local89] = local13.aByteArray20;
							if (local13.aByteArray20 == null) {
								this.anIntArray258[local89] = -1;
							}
							break;
						}
					}
				}
				if (local13.anInt637 == 93 && this.aClass20_Sub1_1.method290(local13.anInt636)) {
					Class48.method505(this.aClass20_Sub1_1, new Class4_Sub1_Sub3(local13.aByteArray20, (byte) 3));
				}
			}
		} catch (@Pc(166) RuntimeException local166) {
			signlink.reporterror("43534, " + 8 + ", " + local166.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
	private void method708() {
		try {
			if (this.anInt976 == 0) {
				@Pc(6) int local6 = super.anInt824;
				if (this.anInt879 == 1 && super.anInt825 >= 516 && super.anInt826 >= 160 && super.anInt825 <= 765 && super.anInt826 <= 205) {
					local6 = 0;
				}
				@Pc(43) int local43;
				@Pc(46) int local46;
				@Pc(122) int local122;
				if (this.aBoolean237) {
					if (local6 != 1) {
						local43 = super.anInt819;
						local46 = super.anInt820;
						if (this.anInt891 == 0) {
							local43 -= 4;
							local46 -= 4;
						}
						if (this.anInt891 == 1) {
							local43 -= 553;
							local46 -= 205;
						}
						if (this.anInt891 == 2) {
							local43 -= 17;
							local46 -= 357;
						}
						if (local43 < this.anInt892 - 10 || local43 > this.anInt892 + this.anInt894 + 10 || local46 < this.anInt893 - 10 || local46 > this.anInt893 + this.anInt895 + 10) {
							this.aBoolean237 = false;
							if (this.anInt891 == 1) {
								this.aBoolean255 = true;
							}
							if (this.anInt891 == 2) {
								this.aBoolean260 = true;
							}
						}
					}
					if (local6 == 1) {
						local43 = this.anInt892;
						local46 = this.anInt893;
						local122 = this.anInt894;
						@Pc(125) int local125 = super.anInt825;
						@Pc(128) int local128 = super.anInt826;
						if (this.anInt891 == 0) {
							local125 -= 4;
							local128 -= 4;
						}
						if (this.anInt891 == 1) {
							local125 -= 553;
							local128 -= 205;
						}
						if (this.anInt891 == 2) {
							local125 -= 17;
							local128 -= 357;
						}
						@Pc(147) int local147 = -1;
						for (@Pc(149) int local149 = 0; local149 < this.anInt990; local149++) {
							@Pc(164) int local164 = local46 + (this.anInt990 - 1 - local149) * 15 + 31;
							if (local125 > local43 && local125 < local43 + local122 && local128 > local164 - 13 && local128 < local164 + 3) {
								local147 = local149;
							}
						}
						if (local147 != -1) {
							this.method636(local147);
						}
						this.aBoolean237 = false;
						if (this.anInt891 == 1) {
							this.aBoolean255 = true;
						}
						if (this.anInt891 == 2) {
							this.aBoolean260 = true;
							return;
						}
					}
				} else {
					if (local6 == 1 && this.anInt990 > 0) {
						local43 = this.anIntArray229[this.anInt990 - 1];
						if (local43 == 113 || local43 == 490 || local43 == 489 || local43 == 315 || local43 == 422 || local43 == 682 || local43 == 486 || local43 == 593 || local43 == 4 || local43 == 856 || local43 == 529 || local43 == 1314) {
							local46 = this.anIntArray227[this.anInt990 - 1];
							local122 = this.anIntArray228[this.anInt990 - 1];
							@Pc(283) Class26 local283 = Class26.method319(local122);
							if (local283.aBoolean121 || local283.aBoolean118) {
								this.aBoolean220 = false;
								this.anInt948 = 0;
								this.anInt974 = local122;
								this.anInt975 = local46;
								this.anInt976 = 2;
								this.anInt977 = super.anInt825;
								this.anInt978 = super.anInt826;
								if (Class26.method319(local122).anInt356 == this.anInt863) {
									this.anInt976 = 1;
								}
								if (Class26.method319(local122).anInt356 == this.anInt882) {
									this.anInt976 = 3;
								}
								return;
							}
						}
					}
					if (local6 == 1 && (this.anInt935 == 1 || this.method719(this.anInt990 - 1)) && this.anInt990 > 2) {
						local6 = 2;
					}
					if (local6 == 1 && this.anInt990 > 0) {
						this.method636(this.anInt990 - 1);
					}
					if (local6 != 2 || this.anInt990 <= 0) {
						return;
					}
					this.method603();
				}
			}
		} catch (@Pc(376) RuntimeException local376) {
			signlink.reporterror("90896, " + 9 + ", " + local376.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "N", descriptor = "(I)V")
	private void method709() {
		try {
			try {
				@Pc(13) int local13 = aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt694 + this.anInt854;
				@Pc(19) int local19 = aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt695 + this.anInt1009;
				if (this.anInt896 - local13 < -500 || this.anInt896 - local13 > 500 || this.anInt897 - local19 < -500 || this.anInt897 - local19 > 500) {
					this.anInt896 = local13;
					this.anInt897 = local19;
				}
				if (this.anInt896 != local13) {
					this.anInt896 += (local13 - this.anInt896) / 16;
				}
				if (this.anInt897 != local19) {
					this.anInt897 += (local19 - this.anInt897) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt955 += (-this.anInt955 - 24) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt955 += (24 - this.anInt955) / 2;
				} else {
					this.anInt955 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt956 += (12 - this.anInt956) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt956 += (-this.anInt956 - 12) / 2;
				} else {
					this.anInt956 /= 2;
				}
				this.anInt954 = this.anInt954 + this.anInt955 / 2 & 0x7FF;
				this.anInt953 += this.anInt956 / 2;
				if (this.anInt953 < 128) {
					this.anInt953 = 128;
				}
				if (this.anInt953 > 383) {
					this.anInt953 = 383;
				}
				@Pc(206) int local206 = this.anInt896 >> 7;
				@Pc(211) int local211 = this.anInt897 >> 7;
				@Pc(221) int local221 = this.method651(this.anInt896, this.anInt981, this.anInt897);
				@Pc(223) int local223 = 0;
				@Pc(239) int local239;
				if (local206 > 3 && local211 > 3 && local206 < 100 && local211 < 100) {
					for (local239 = local206 - 4; local239 <= local206 + 4; local239++) {
						for (@Pc(245) int local245 = local211 - 4; local245 <= local211 + 4; local245++) {
							@Pc(250) int local250 = this.anInt981;
							if (local250 < 3 && (this.aByteArrayArrayArray8[1][local239][local245] & 0x2) == 2) {
								local250++;
							}
							@Pc(277) int local277 = local221 - this.anIntArrayArrayArray8[local250][local239][local245];
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
				if (local239 > this.anInt842) {
					this.anInt842 += (local239 - this.anInt842) / 24;
				} else if (local239 < this.anInt842) {
					this.anInt842 += (local239 - this.anInt842) / 80;
				}
			} catch (@Pc(341) Exception local341) {
				signlink.reporterror("glfc_ex " + aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt694 + "," + aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt695 + "," + this.anInt896 + "," + this.anInt897 + "," + this.anInt1014 + "," + this.anInt1015 + "," + this.anInt838 + "," + this.anInt839);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(391) RuntimeException local391) {
			signlink.reporterror("31454, " + -3265 + ", " + local391.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!PCARWQQC;I)I")
	private int method710(@OriginalArg(1) Class26 arg0, @OriginalArg(2) int arg1) {
		try {
			if (arg0.anIntArrayArray8 == null || arg1 >= arg0.anIntArrayArray8.length) {
				return -2;
			}
			try {
				@Pc(21) int[] local21 = arg0.anIntArrayArray8[arg1];
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
						local34 = this.anIntArray261[local21[local25++]];
					}
					if (local32 == 2) {
						local34 = this.anIntArray264[local21[local25++]];
					}
					if (local32 == 3) {
						local34 = this.anIntArray231[local21[local25++]];
					}
					@Pc(82) Class26 local82;
					@Pc(87) int local87;
					@Pc(100) int local100;
					if (local32 == 4) {
						local82 = Class26.method319(local21[local25++]);
						local87 = local21[local25++];
						if (local87 >= 0 && local87 < Class24.anInt301 && (!Class24.method315(local87).aBoolean107 || aBoolean224)) {
							for (local100 = 0; local100 < local82.anIntArray86.length; local100++) {
								if (local82.anIntArray86[local100] == local87 + 1) {
									local34 += local82.anIntArray92[local100];
								}
							}
						}
					}
					if (local32 == 5) {
						local34 = this.anIntArray276[local21[local25++]];
					}
					if (local32 == 6) {
						local34 = anIntArray217[this.anIntArray264[local21[local25++]] - 1];
					}
					if (local32 == 7) {
						local34 = this.anIntArray276[local21[local25++]] * 100 / 46875;
					}
					if (local32 == 8) {
						local34 = aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt755;
					}
					@Pc(175) int local175;
					if (local32 == 9) {
						for (local175 = 0; local175 < Class43.anInt634; local175++) {
							if (Class43.aBooleanArray8[local175]) {
								local34 += this.anIntArray264[local175];
							}
						}
					}
					if (local32 == 10) {
						local82 = Class26.method319(local21[local25++]);
						local87 = local21[local25++] + 1;
						if (local87 >= 0 && local87 < Class24.anInt301 && (!Class24.method315(local87).aBoolean107 || aBoolean224)) {
							for (local100 = 0; local100 < local82.anIntArray86.length; local100++) {
								if (local82.anIntArray86[local100] == local87) {
									local34 = 999999999;
									break;
								}
							}
						}
					}
					if (local32 == 11) {
						local34 = this.anInt1023;
					}
					if (local32 == 12) {
						local34 = this.anInt1006;
					}
					if (local32 == 13) {
						local175 = this.anIntArray276[local21[local25++]];
						local87 = local21[local25++];
						local34 = (local175 & 0x1 << local87) == 0 ? 0 : 1;
					}
					if (local32 == 14) {
						local175 = local21[local25++];
						@Pc(289) Class25 local289 = Class25.aClass25Array1[local175];
						local100 = local289.anInt320;
						@Pc(295) int local295 = local289.anInt321;
						@Pc(298) int local298 = local289.anInt322;
						@Pc(304) int local304 = anIntArray269[local298 - local295];
						local34 = this.anIntArray276[local100] >> local295 & local304;
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
						local34 = (aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt694 >> 7) + this.anInt838;
					}
					if (local32 == 19) {
						local34 = (aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt695 >> 7) + this.anInt839;
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
			} catch (@Pc(397) Exception local397) {
				return -1;
			}
		} catch (@Pc(400) RuntimeException local400) {
			signlink.reporterror("73770, " + -7 + ", " + arg0 + ", " + arg1 + ", " + local400.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "O", descriptor = "(I)V")
	private void method711() {
		try {
			@Pc(15) int local15;
			if (this.anInt959 > 0) {
				for (local15 = 0; local15 < 256; local15++) {
					if (this.anInt959 > 768) {
						this.anIntArray248[local15] = this.method638(1024 - this.anInt959, this.anIntArray250[local15], this.anIntArray249[local15]);
					} else if (this.anInt959 > 256) {
						this.anIntArray248[local15] = this.anIntArray250[local15];
					} else {
						this.anIntArray248[local15] = this.method638(256 - this.anInt959, this.anIntArray249[local15], this.anIntArray250[local15]);
					}
				}
			} else if (this.anInt960 > 0) {
				for (local15 = 0; local15 < 256; local15++) {
					if (this.anInt960 > 768) {
						this.anIntArray248[local15] = this.method638(1024 - this.anInt960, this.anIntArray251[local15], this.anIntArray249[local15]);
					} else if (this.anInt960 > 256) {
						this.anIntArray248[local15] = this.anIntArray251[local15];
					} else {
						this.anIntArray248[local15] = this.method638(256 - this.anInt960, this.anIntArray249[local15], this.anIntArray251[local15]);
					}
				}
			} else {
				for (local15 = 0; local15 < 256; local15++) {
					this.anIntArray248[local15] = this.anIntArray249[local15];
				}
			}
			for (local15 = 0; local15 < 33920; local15++) {
				this.aClass13_15.anIntArray22[local15] = this.aClass4_Sub1_Sub1_Sub3_7.anIntArray33[local15];
			}
			@Pc(186) int local186 = 0;
			@Pc(188) int local188 = 1152;
			@Pc(203) int local203;
			@Pc(207) int local207;
			@Pc(217) int local217;
			@Pc(225) int local225;
			@Pc(229) int local229;
			@Pc(233) int local233;
			@Pc(244) int local244;
			for (@Pc(190) int local190 = 1; local190 < 255; local190++) {
				local203 = this.anIntArray215[local190] * (256 - local190) / 256;
				local207 = local203 + 22;
				if (local207 < 0) {
					local207 = 0;
				}
				local186 += local207;
				for (local217 = local207; local217 < 128; local217++) {
					local225 = this.anIntArray213[local186++];
					if (local225 == 0) {
						local188++;
					} else {
						local229 = local225;
						local233 = 256 - local225;
						local225 = this.anIntArray248[local225];
						local244 = this.aClass13_15.anIntArray22[local188];
						this.aClass13_15.anIntArray22[local188++] = ((local225 & 0xFF00FF) * local229 + (local244 & 0xFF00FF) * local233 & 0xFF00FF00) + ((local225 & 0xFF00) * local229 + (local244 & 0xFF00) * local233 & 0xFF0000) >> 8;
					}
				}
				local188 += local207;
			}
			this.aClass13_15.method188(0, super.aGraphics2, 0);
			for (local203 = 0; local203 < 33920; local203++) {
				this.aClass13_16.anIntArray22[local203] = this.aClass4_Sub1_Sub1_Sub3_8.anIntArray33[local203];
			}
			local186 = 0;
			local188 = 1176;
			for (local207 = 1; local207 < 255; local207++) {
				local217 = this.anIntArray215[local207] * (256 - local207) / 256;
				local225 = 103 - local217;
				local188 += local217;
				for (local229 = 0; local229 < local225; local229++) {
					local233 = this.anIntArray213[local186++];
					if (local233 == 0) {
						local188++;
					} else {
						local244 = local233;
						@Pc(367) int local367 = 256 - local233;
						local233 = this.anIntArray248[local233];
						@Pc(378) int local378 = this.aClass13_16.anIntArray22[local188];
						this.aClass13_16.anIntArray22[local188++] = ((local233 & 0xFF00FF) * local244 + (local378 & 0xFF00FF) * local367 & 0xFF00FF00) + ((local233 & 0xFF00) * local244 + (local378 & 0xFF00) * local367 & 0xFF0000) >> 8;
					}
				}
				local186 += 128 - local225;
				local188 += 128 - local225 - local217;
			}
			this.aClass13_16.method188(0, super.aGraphics2, 637);
		} catch (@Pc(450) RuntimeException local450) {
			signlink.reporterror("91965, " + -732 + ", " + local450.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "P", descriptor = "(I)V")
	private void method712() {
		try {
			this.aClass4_Sub1_Sub3_6.method91(155);
			if (this.anInt1032 != -1) {
				this.method599(this.anInt1032);
				this.anInt1032 = -1;
				this.aBoolean255 = true;
				this.aBoolean235 = false;
				this.aBoolean233 = true;
			}
			if (this.anInt882 != -1) {
				this.method599(this.anInt882);
				this.anInt882 = -1;
				this.aBoolean260 = true;
				this.aBoolean235 = false;
			}
			if (this.anInt923 != -1) {
				this.method599(this.anInt923);
				this.anInt923 = -1;
				this.aBoolean239 = true;
			}
			if (this.anInt1031 != -1) {
				this.method599(this.anInt1031);
				this.anInt1031 = -1;
			}
			if (this.anInt863 != -1) {
				this.method599(this.anInt863);
				this.anInt863 = -1;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("71271, " + -618 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!FTMSICIZ;BI)V")
	private void method713(@OriginalArg(0) Class4_Sub1_Sub3 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt1044; local1++) {
				@Pc(8) int local8 = this.anIntArray274[local1];
				@Pc(13) Class4_Sub1_Sub2_Sub5_Sub2 local13 = this.aClass4_Sub1_Sub2_Sub5_Sub2Array1[local8];
				@Pc(16) int local16 = arg0.method102();
				if ((local16 & 0x10) != 0) {
					local16 += arg0.method102() << 8;
				}
				this.method659(arg0, local16, local8, local13);
			}
			if (arg1 != this.aByte36) {
				this.method582();
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("57321, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;I)V")
	@Override
	protected void method589(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt1001 = arg1;
			this.aString29 = arg0;
			this.method682();
			if (this.aClass2_2 == null) {
				super.method589(arg0, arg1);
			} else {
				this.aClass13_14.method187();
				this.aClass4_Sub1_Sub1_Sub1_4.method44(180, 54, "RuneScape is loading - please wait...", 16777215);
				Class4_Sub1_Sub1.method549(304, 34, 9179409, 28, 62);
				Class4_Sub1_Sub1.method549(302, 32, 0, 29, 63);
				Class4_Sub1_Sub1.method548(30, 9179409, 64, 30, this.anInt945, arg1 * 3);
				Class4_Sub1_Sub1.method548(arg1 * 3 + 30, 0, 64, 30, this.anInt945, 300 - arg1 * 3);
				this.aClass4_Sub1_Sub1_Sub1_4.method44(180, 85, arg0, 16777215);
				this.aClass13_14.method188(171, super.aGraphics2, 202);
				if (this.aBoolean239) {
					this.aBoolean239 = false;
					if (!this.aBoolean240) {
						this.aClass13_15.method188(0, super.aGraphics2, 0);
						this.aClass13_16.method188(0, super.aGraphics2, 637);
					}
					this.aClass13_12.method188(0, super.aGraphics2, 128);
					this.aClass13_13.method188(371, super.aGraphics2, 202);
					this.aClass13_17.method188(265, super.aGraphics2, 0);
					this.aClass13_18.method188(265, super.aGraphics2, 562);
					this.aClass13_19.method188(171, super.aGraphics2, 128);
					this.aClass13_20.method188(171, super.aGraphics2, 562);
				}
			}
		} catch (@Pc(222) RuntimeException local222) {
			signlink.reporterror("86294, " + -23874 + ", " + arg0 + ", " + arg1 + ", " + local222.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "(I)V")
	private void method714() {
		try {
			for (@Pc(8) int local8 = 0; local8 < this.anInt834; local8++) {
				if (this.anIntArray246[local8] <= 0) {
					@Pc(17) boolean local17 = false;
					try {
						if (this.anIntArray218[local8] != this.anInt906 || this.anIntArray234[local8] != this.anInt1034) {
							@Pc(50) Class4_Sub1_Sub3 local50 = Class40.method396(this.anIntArray218[local8], this.anIntArray234[local8]);
							if (System.currentTimeMillis() + (long) (local50.anInt101 / 22) > this.aLong29 + (long) (this.anInt1020 / 22)) {
								this.anInt1020 = local50.anInt101;
								this.aLong29 = System.currentTimeMillis();
								if (this.method591(local50.anInt101, local50.aByteArray3)) {
									this.anInt906 = this.anIntArray218[local8];
									this.anInt1034 = this.anIntArray234[local8];
								} else {
									local17 = true;
								}
							}
						} else if (!this.method700()) {
							local17 = true;
						}
					} catch (@Pc(100) Exception local100) {
						if (signlink.reporterror) {
							this.aClass4_Sub1_Sub3_6.method91(1);
							this.aClass4_Sub1_Sub3_6.method93(this.anIntArray218[local8] & 0x7FFF);
						} else {
							this.aClass4_Sub1_Sub3_6.method91(1);
							this.aClass4_Sub1_Sub3_6.method93(-1);
						}
					}
					if (local17 && this.anIntArray246[local8] != -5) {
						this.anIntArray246[local8] = -5;
					} else {
						this.anInt834--;
						for (@Pc(143) int local143 = local8; local143 < this.anInt834; local143++) {
							this.anIntArray218[local143] = this.anIntArray218[local143 + 1];
							this.anIntArray234[local143] = this.anIntArray234[local143 + 1];
							this.anIntArray246[local143] = this.anIntArray246[local143 + 1];
						}
						local8--;
					}
				} else {
					@Pc(195) int local195 = this.anIntArray246[local8]--;
				}
			}
			if (this.anInt861 > 0) {
				this.anInt861 -= 20;
				if (this.anInt861 < 0) {
					this.anInt861 = 0;
				}
				if (this.anInt861 == 0 && this.aBoolean231 && !aBoolean225) {
					this.anInt961 = this.anInt836;
					this.aBoolean253 = true;
					this.aClass20_Sub1_1.method292(2, this.anInt961);
					return;
				}
			}
		} catch (@Pc(241) RuntimeException local241) {
			signlink.reporterror("97787, " + -21554 + ", " + local241.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[BZ)V")
	private void method715(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2) {
		try {
			if (this.aBoolean231) {
				signlink.anInt1065 = arg0 ? 1 : 0;
				signlink.midisave(arg1, arg1.length);
				if (arg2) {
					this.anInt945 = this.aClass47_2.method488();
				}
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("68535, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!FTMSICIZ;Z)V")
	private void method716(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1_Sub3 arg1) {
		try {
			this.aBoolean241 &= true;
			while (arg1.anInt102 + 10 < arg0 * 8) {
				@Pc(18) int local18 = arg1.method113(11, 779);
				if (local18 == 2047) {
					break;
				}
				if (this.aClass4_Sub1_Sub2_Sub5_Sub2Array1[local18] == null) {
					this.aClass4_Sub1_Sub2_Sub5_Sub2Array1[local18] = new Class4_Sub1_Sub2_Sub5_Sub2();
					if (this.aClass4_Sub1_Sub3Array1[local18] != null) {
						this.aClass4_Sub1_Sub2_Sub5_Sub2Array1[local18].method501(this.aClass4_Sub1_Sub3Array1[local18]);
					}
				}
				this.anIntArray273[this.anInt1043++] = local18;
				@Pc(64) Class4_Sub1_Sub2_Sub5_Sub2 local64 = this.aClass4_Sub1_Sub2_Sub5_Sub2Array1[local18];
				local64.anInt711 = anInt927;
				@Pc(72) int local72 = arg1.method113(5, 779);
				if (local72 > 15) {
					local72 -= 32;
				}
				@Pc(81) int local81 = arg1.method113(5, 779);
				if (local81 > 15) {
					local81 -= 32;
				}
				@Pc(90) int local90 = arg1.method113(1, 779);
				if (local90 == 1) {
					this.anIntArray274[this.anInt1044++] = local18;
				}
				@Pc(109) int local109 = arg1.method113(1, 779);
				local64.method498(aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0] + local81, local109 == 1, aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0] + local72);
			}
			arg1.method114(462);
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("14558, " + arg0 + ", " + arg1 + ", " + true + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!FTMSICIZ;IZ)V")
	private void method717(@OriginalArg(0) Class4_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			arg0.method112();
			@Pc(7) int local7 = arg0.method113(1, 779);
			if (local7 != 0) {
				@Pc(25) int local25 = arg0.method113(2, 779);
				if (local25 == 0) {
					this.anIntArray274[this.anInt1044++] = this.anInt1042;
				} else {
					@Pc(48) int local48;
					@Pc(58) int local58;
					if (local25 == 1) {
						local48 = arg0.method113(3, 779);
						aClass4_Sub1_Sub2_Sub5_Sub2_1.method496(local48, false);
						local58 = arg0.method113(1, 779);
						if (local58 == 1) {
							this.anIntArray274[this.anInt1044++] = this.anInt1042;
						}
					} else {
						@Pc(102) int local102;
						if (local25 == 2) {
							local48 = arg0.method113(3, 779);
							aClass4_Sub1_Sub2_Sub5_Sub2_1.method496(local48, true);
							local58 = arg0.method113(3, 779);
							aClass4_Sub1_Sub2_Sub5_Sub2_1.method496(local58, true);
							local102 = arg0.method113(1, 779);
							if (local102 == 1) {
								this.anIntArray274[this.anInt1044++] = this.anInt1042;
							}
						} else if (local25 == 3) {
							local48 = arg0.method113(1, 779);
							if (local48 == 1) {
								this.anIntArray274[this.anInt1044++] = this.anInt1042;
							}
							local58 = arg0.method113(7, 779);
							local102 = arg0.method113(7, 779);
							@Pc(156) int local156 = arg0.method113(1, 779);
							this.anInt981 = arg0.method113(2, 779);
							aClass4_Sub1_Sub2_Sub5_Sub2_1.method498(local58, local156 == 1, local102);
						}
					}
				}
			}
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("77092, " + arg0 + ", " + arg1 + ", " + false + ", " + local175.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V")
	private void method718(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 == 0 && this.anInt888 != -1) {
				this.aString28 = arg0;
				super.anInt824 = 0;
			}
			if (this.anInt882 == -1) {
				this.aBoolean260 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray247[local20] = this.anIntArray247[local20 - 1];
				this.aStringArray10[local20] = this.aStringArray10[local20 - 1];
				this.aStringArray11[local20] = this.aStringArray11[local20 - 1];
			}
			this.anIntArray247[0] = arg2;
			this.aStringArray10[0] = arg1;
			this.aStringArray11[0] = arg0;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("7251, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 20045 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)Z")
	private boolean method719(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(8) int local8 = this.anIntArray229[arg0];
			if (local8 >= 2000) {
				local8 -= 2000;
			}
			return local8 == 143;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("93778, " + arg0 + ", " + 984 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;IIILjava/lang/String;I)Lclient!AKPFVPPG;")
	private Class2 method720(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		try {
			@Pc(12) byte[] local12 = null;
			@Pc(14) int local14 = 5;
			try {
				if (this.aClass3Array1[0] != null) {
					local12 = this.aClass3Array1[0].method8(arg1);
				}
			} catch (@Pc(29) Exception local29) {
			}
			@Pc(43) int local43;
			if (local12 != null) {
				this.aCRC32_2.reset();
				this.aCRC32_2.update(local12);
				local43 = (int) this.aCRC32_2.getValue();
				if (local43 != arg2) {
					local12 = null;
				}
			}
			if (local12 != null) {
				return new Class2(true, local12);
			}
			local43 = 0;
			while (local12 == null) {
				@Pc(64) String local64 = "Unknown error";
				this.method589("Requesting " + arg0, arg3);
				@Pc(79) int local79;
				try {
					local79 = 0;
					@Pc(90) DataInputStream local90 = this.method622(arg4 + arg2);
					@Pc(93) byte[] local93 = new byte[6];
					local90.readFully(local93, 0, 6);
					@Pc(104) Class4_Sub1_Sub3 local104 = new Class4_Sub1_Sub3(local93, (byte) 3);
					local104.anInt101 = 3;
					@Pc(112) int local112 = local104.method106() + 6;
					@Pc(114) int local114 = 6;
					local12 = new byte[local112];
					for (@Pc(119) int local119 = 0; local119 < 6; local119++) {
						local12[local119] = local93[local119];
					}
					@Pc(136) int local136;
					while (local114 < local112) {
						local136 = local112 - local114;
						if (local136 > 1000) {
							local136 = 1000;
						}
						@Pc(147) int local147 = local90.read(local12, local114, local136);
						if (local147 < 0) {
							(new StringBuffer("Length error: ")).append(local114).append("/").append(local112).toString();
							throw new IOException("EOF");
						}
						local114 += local147;
						@Pc(176) int local176 = local114 * 100 / local112;
						if (local176 != local79) {
							this.method589("Loading " + arg0 + " - " + local176 + "%", arg3);
						}
						local79 = local176;
					}
					local90.close();
					try {
						if (this.aClass3Array1[0] != null) {
							this.aClass3Array1[0].method9(local12, local12.length, arg1);
						}
					} catch (@Pc(221) Exception local221) {
						this.aClass3Array1[0] = null;
					}
					if (local12 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local12);
						local136 = (int) this.aCRC32_2.getValue();
						if (local136 != arg2) {
							local12 = null;
							local43++;
							local64 = "Checksum error: " + local136;
						}
					}
				} catch (@Pc(256) IOException local256) {
					if (local64.equals("Unknown error")) {
						local64 = "Connection error";
					}
					local12 = null;
				} catch (@Pc(266) NullPointerException local266) {
					local64 = "Null error";
					local12 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(275) ArrayIndexOutOfBoundsException local275) {
					local64 = "Bounds error";
					local12 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(284) Exception local284) {
					local64 = "Unexpected error";
					local12 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local12 == null) {
					for (local79 = local14; local79 > 0; local79--) {
						if (local43 >= 3) {
							this.method589("Game updated - please reload page", arg3);
							local79 = 10;
						} else {
							this.method589(local64 + " - Retrying in " + local79, arg3);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(328) Exception local328) {
						}
					}
					local14 *= 2;
					if (local14 > 60) {
						local14 = 60;
					}
					this.aBoolean257 = !this.aBoolean257;
				}
			}
			return new Class2(true, local12);
		} catch (@Pc(360) RuntimeException local360) {
			signlink.reporterror("70899, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 1 + ", " + local360.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZILclient!RDFTXEYV;)V")
	private void method721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class33 arg3) {
		try {
			this.aBoolean241 &= true;
			if (this.anInt990 < 400) {
				if (arg3.anIntArray133 != null) {
					arg3 = arg3.method369();
				}
				if (arg3 != null && arg3.aBoolean156) {
					@Pc(29) String local29 = arg3.aString12;
					if (arg3.anInt495 != 0) {
						local29 = local29 + method632(614, aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt755, arg3.anInt495) + " (level-" + arg3.anInt495 + ")";
					}
					if (this.anInt848 == 1) {
						this.aStringArray8[this.anInt990] = "Use " + this.aString20 + " with @yel@" + local29;
						this.anIntArray229[this.anInt990] = 800;
						this.anIntArray230[this.anInt990] = arg0;
						this.anIntArray227[this.anInt990] = arg1;
						this.anIntArray228[this.anInt990] = arg2;
						this.anInt990++;
					} else if (this.anInt879 != 1) {
						@Pc(167) int local167;
						if (arg3.aStringArray6 != null) {
							for (local167 = 4; local167 >= 0; local167--) {
								if (arg3.aStringArray6[local167] != null && !arg3.aStringArray6[local167].equalsIgnoreCase("attack")) {
									this.aStringArray8[this.anInt990] = arg3.aStringArray6[local167] + " @yel@" + local29;
									if (local167 == 0) {
										this.anIntArray229[this.anInt990] = 992;
									}
									if (local167 == 1) {
										this.anIntArray229[this.anInt990] = 286;
									}
									if (local167 == 2) {
										this.anIntArray229[this.anInt990] = 434;
									}
									if (local167 == 3) {
										this.anIntArray229[this.anInt990] = 319;
									}
									if (local167 == 4) {
										this.anIntArray229[this.anInt990] = 476;
									}
									this.anIntArray230[this.anInt990] = arg0;
									this.anIntArray227[this.anInt990] = arg1;
									this.anIntArray228[this.anInt990] = arg2;
									this.anInt990++;
								}
							}
						}
						if (arg3.aStringArray6 != null) {
							for (local167 = 4; local167 >= 0; local167--) {
								if (arg3.aStringArray6[local167] != null && arg3.aStringArray6[local167].equalsIgnoreCase("attack")) {
									@Pc(291) short local291 = 0;
									if (arg3.anInt495 > aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt755) {
										local291 = 2000;
									}
									this.aStringArray8[this.anInt990] = arg3.aStringArray6[local167] + " @yel@" + local29;
									if (local167 == 0) {
										this.anIntArray229[this.anInt990] = local291 + 992;
									}
									if (local167 == 1) {
										this.anIntArray229[this.anInt990] = local291 + 286;
									}
									if (local167 == 2) {
										this.anIntArray229[this.anInt990] = local291 + 434;
									}
									if (local167 == 3) {
										this.anIntArray229[this.anInt990] = local291 + 319;
									}
									if (local167 == 4) {
										this.anIntArray229[this.anInt990] = local291 + 476;
									}
									this.anIntArray230[this.anInt990] = arg0;
									this.anIntArray227[this.anInt990] = arg1;
									this.anIntArray228[this.anInt990] = arg2;
									this.anInt990++;
								}
							}
						}
						this.aStringArray8[this.anInt990] = "Examine @yel@" + local29;
						this.anIntArray229[this.anInt990] = 1738;
						this.anIntArray230[this.anInt990] = arg0;
						this.anIntArray227[this.anInt990] = arg1;
						this.anIntArray228[this.anInt990] = arg2;
						this.anInt990++;
					} else if ((this.anInt881 & 0x2) == 2) {
						this.aStringArray8[this.anInt990] = this.aString21 + " @yel@" + local29;
						this.anIntArray229[this.anInt990] = 83;
						this.anIntArray230[this.anInt990] = arg0;
						this.anIntArray227[this.anInt990] = arg1;
						this.anIntArray228[this.anInt990] = arg2;
						this.anInt990++;
						return;
					}
				}
			}
		} catch (@Pc(441) RuntimeException local441) {
			signlink.reporterror("68536, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + local441.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IZ)V")
	private void method722(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) Class26 local2 = Class26.method319(arg0);
			for (@Pc(4) int local4 = 0; local4 < local2.anIntArray87.length && local2.anIntArray87[local4] != -1; local4++) {
				@Pc(18) Class26 local18 = Class26.method319(local2.anIntArray87[local4]);
				if (local18.anInt347 == 1) {
					this.method722(local18.anInt334);
				}
				local18.anInt326 = 0;
				local18.anInt335 = 0;
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("890, " + arg0 + ", " + false + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method723() {
		try {
			if (this.aClass13_27 == null) {
				this.method677();
				super.aClass13_2 = null;
				this.aClass13_12 = null;
				this.aClass13_13 = null;
				this.aClass13_14 = null;
				this.aClass13_15 = null;
				this.aClass13_16 = null;
				this.aClass13_17 = null;
				this.aClass13_18 = null;
				this.aClass13_19 = null;
				this.aClass13_20 = null;
				this.aClass13_27 = new Class13(this.method587(), 479, 430, 96);
				this.aClass13_25 = new Class13(this.method587(), 172, 430, 156);
				Class4_Sub1_Sub1.method546();
				this.aClass4_Sub1_Sub1_Sub2_19.method211(233, 0, 0);
				this.aClass13_24 = new Class13(this.method587(), 190, 430, 261);
				this.aClass13_26 = new Class13(this.method587(), 512, 430, 334);
				Class4_Sub1_Sub1.method546();
				this.aClass13_21 = new Class13(this.method587(), 496, 430, 50);
				this.aClass13_22 = new Class13(this.method587(), 269, 430, 37);
				this.aBoolean241 &= true;
				this.aClass13_23 = new Class13(this.method587(), 249, 430, 45);
				this.aBoolean239 = true;
				this.aClass13_26.method187();
				Class4_Sub1_Sub1_Sub4.anIntArray206 = this.anIntArray254;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("57203, " + true + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!FTMSICIZ;II)V")
	private void method724(@OriginalArg(0) Class4_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(20) int local20;
			@Pc(25) int local25;
			@Pc(28) int local28;
			@Pc(44) int local44;
			@Pc(12) int local12;
			@Pc(16) int local16;
			@Pc(37) int local37;
			if (arg1 == 17) {
				local12 = arg0.method123();
				local16 = local12 >> 2;
				local20 = local12 & 0x3;
				local25 = this.anIntArray225[local16];
				local28 = arg0.method102();
				local37 = this.anInt1047 + (local28 >> 4 & 0x7);
				local44 = this.anInt1048 + (local28 & 0x7);
				if (local37 >= 0 && local44 >= 0 && local37 < 104 && local44 < 104) {
					this.method698(-1, -1, 0, local20, this.anInt981, local25, local44, local37, local16);
				}
			} else if (arg1 == 121) {
				local12 = arg0.method131();
				local16 = arg0.method123();
				local20 = this.anInt1047 + (local16 >> 4 & 0x7);
				local25 = this.anInt1048 + (local16 & 0x7);
				local28 = arg0.method131();
				local37 = arg0.method131();
				if (local20 >= 0 && local25 >= 0 && local20 < 104 && local25 < 104 && local12 != this.anInt982) {
					@Pc(121) Class4_Sub1_Sub2_Sub1 local121 = new Class4_Sub1_Sub2_Sub1();
					local121.anInt40 = local28;
					local121.anInt41 = local37;
					if (this.aClass30ArrayArrayArray1[this.anInt981][local20][local25] == null) {
						this.aClass30ArrayArrayArray1[this.anInt981][local20][local25] = new Class30(9203);
					}
					this.aClass30ArrayArrayArray1[this.anInt981][local20][local25].method343(local121);
					this.method597(local20, local25);
				}
			} else {
				@Pc(209) Class4_Sub1_Sub2_Sub1 local209;
				if (arg1 == 253) {
					local12 = arg0.method131();
					local16 = arg0.method104();
					local20 = arg0.method102();
					local25 = this.anInt1047 + (local20 >> 4 & 0x7);
					local28 = this.anInt1048 + (local20 & 0x7);
					if (local25 >= 0 && local28 >= 0 && local25 < 104 && local28 < 104) {
						local209 = new Class4_Sub1_Sub2_Sub1();
						local209.anInt40 = local12;
						local209.anInt41 = local16;
						if (this.aClass30ArrayArrayArray1[this.anInt981][local25][local28] == null) {
							this.aClass30ArrayArrayArray1[this.anInt981][local25][local28] = new Class30(9203);
						}
						this.aClass30ArrayArrayArray1[this.anInt981][local25][local28].method343(local209);
						this.method597(local25, local28);
					}
				} else {
					@Pc(296) int local296;
					@Pc(300) int local300;
					@Pc(304) int local304;
					@Pc(308) int local308;
					@Pc(313) int local313;
					@Pc(322) int local322;
					if (arg1 == 32) {
						@Pc(261) byte local261 = arg0.method126();
						@Pc(265) byte local265 = arg0.method126();
						local20 = arg0.method123();
						local25 = this.anInt1047 + (local20 >> 4 & 0x7);
						local28 = this.anInt1048 + (local20 & 0x7);
						@Pc(288) byte local288 = arg0.method103();
						local44 = arg0.method130();
						local296 = arg0.method131();
						local300 = arg0.method121();
						local304 = local300 >> 2;
						local308 = local300 & 0x3;
						local313 = this.anIntArray225[local304];
						@Pc(317) byte local317 = arg0.method125();
						local322 = arg0.method132(this.aByte42);
						@Pc(326) int local326 = arg0.method131();
						@Pc(332) Class4_Sub1_Sub2_Sub5_Sub2 local332;
						if (local322 == this.anInt982) {
							local332 = aClass4_Sub1_Sub2_Sub5_Sub2_1;
						} else {
							local332 = this.aClass4_Sub1_Sub2_Sub5_Sub2Array1[local322];
						}
						if (local332 != null) {
							@Pc(344) Class28 local344 = Class28.method334(local296);
							@Pc(354) int local354 = this.anIntArrayArrayArray8[this.anInt981][local25][local28];
							@Pc(366) int local366 = this.anIntArrayArrayArray8[this.anInt981][local25 + 1][local28];
							@Pc(380) int local380 = this.anIntArrayArrayArray8[this.anInt981][local25 + 1][local28 + 1];
							@Pc(392) int local392 = this.anIntArrayArrayArray8[this.anInt981][local25][local28 + 1];
							@Pc(402) Class4_Sub1_Sub2_Sub3 local402 = local344.method338(local304, local308, local354, local366, local380, local392, -1);
							if (local402 != null) {
								this.method698(-1, local44 + 1, local326 + 1, 0, this.anInt981, local313, local28, local25, 0);
								local332.anInt752 = local326 + anInt927;
								local332.anInt753 = local44 + anInt927;
								local332.aClass4_Sub1_Sub2_Sub3_2 = local402;
								@Pc(437) int local437 = local344.anInt387;
								@Pc(440) int local440 = local344.anInt384;
								if (local308 == 1 || local308 == 3) {
									local437 = local344.anInt384;
									local440 = local344.anInt387;
								}
								local332.anInt740 = local25 * 128 + local437 * 64;
								local332.anInt742 = local28 * 128 + local440 * 64;
								local332.anInt741 = this.method651(local332.anInt740, this.anInt981, local332.anInt742);
								@Pc(486) byte local486;
								if (local317 > local261) {
									local486 = local317;
									local317 = local261;
									local261 = local486;
								}
								if (local265 > local288) {
									local486 = local265;
									local265 = local288;
									local288 = local486;
								}
								local332.anInt748 = local25 + local317;
								local332.anInt750 = local25 + local261;
								local332.anInt749 = local28 + local265;
								local332.anInt751 = local28 + local288;
							}
						}
					}
					if (arg1 == 162) {
						local12 = arg0.method102();
						local16 = local12 >> 2;
						local20 = local12 & 0x3;
						local25 = this.anIntArray225[local16];
						local28 = arg0.method122();
						local37 = this.anInt1047 + (local28 >> 4 & 0x7);
						local44 = this.anInt1048 + (local28 & 0x7);
						local296 = arg0.method104();
						if (local37 >= 0 && local44 >= 0 && local37 < 103 && local44 < 103) {
							local300 = this.anIntArrayArrayArray8[this.anInt981][local37][local44];
							local304 = this.anIntArrayArrayArray8[this.anInt981][local37 + 1][local44];
							local308 = this.anIntArrayArrayArray8[this.anInt981][local37 + 1][local44 + 1];
							local313 = this.anIntArrayArrayArray8[this.anInt981][local37][local44 + 1];
							if (local25 == 0) {
								@Pc(630) Class19 local630 = this.aClass45_1.method453(this.anInt981, local37, local44);
								if (local630 != null) {
									local322 = local630.anInt251 >> 14 & 0x7FFF;
									if (local16 == 2) {
										local630.aClass4_Sub1_Sub2_2 = new Class4_Sub1_Sub2_Sub2(local322, local304, local300, 2, local296, local313, local308, local20 + 4, 4, false);
										local630.aClass4_Sub1_Sub2_3 = new Class4_Sub1_Sub2_Sub2(local322, local304, local300, 2, local296, local313, local308, local20 + 1 & 0x3, 4, false);
									} else {
										local630.aClass4_Sub1_Sub2_2 = new Class4_Sub1_Sub2_Sub2(local322, local304, local300, local16, local296, local313, local308, local20, 4, false);
									}
								}
							}
							if (local25 == 1) {
								@Pc(707) Class5 local707 = this.aClass45_1.method454(this.anInt981, local44, local37);
								if (local707 != null) {
									local707.aClass4_Sub1_Sub2_1 = new Class4_Sub1_Sub2_Sub2(local707.anInt47 >> 14 & 0x7FFF, local304, local300, 4, local296, local313, local308, 0, 4, false);
								}
							}
							if (local25 == 2) {
								@Pc(741) Class34 local741 = this.aClass45_1.method455(local44, local37, this.anInt981);
								if (local16 == 11) {
									local16 = 10;
								}
								if (local741 != null) {
									local741.aClass4_Sub1_Sub2_8 = new Class4_Sub1_Sub2_Sub2(local741.anInt528 >> 14 & 0x7FFF, local304, local300, local16, local296, local313, local308, local20, 4, false);
								}
							}
							if (local25 == 3) {
								@Pc(780) Class32 local780 = this.aClass45_1.method456(this.anInt981, local44, local37);
								if (local780 != null) {
									local780.aClass4_Sub1_Sub2_7 = new Class4_Sub1_Sub2_Sub2(local780.anInt481 >> 14 & 0x7FFF, local304, local300, 22, local296, local313, local308, local20, 4, false);
								}
							}
						}
					} else if (arg1 == 174) {
						local12 = arg0.method102();
						local16 = this.anInt1047 + (local12 >> 4 & 0x7);
						local20 = this.anInt1048 + (local12 & 0x7);
						local25 = arg0.method104();
						local28 = arg0.method104();
						local37 = arg0.method104();
						if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104) {
							@Pc(854) Class30 local854 = this.aClass30ArrayArrayArray1[this.anInt981][local16][local20];
							if (local854 != null) {
								for (@Pc(860) Class4_Sub1_Sub2_Sub1 local860 = (Class4_Sub1_Sub2_Sub1) local854.method346(); local860 != null; local860 = (Class4_Sub1_Sub2_Sub1) local854.method348()) {
									if (local860.anInt40 == (local25 & 0x7FFF) && local860.anInt41 == local28) {
										local860.anInt41 = local37;
										break;
									}
								}
								this.method597(local16, local20);
							}
						}
					} else if (arg1 == 9) {
						local12 = arg0.method104();
						local16 = arg0.method122();
						local20 = this.anInt1047 + (local16 >> 4 & 0x7);
						local25 = this.anInt1048 + (local16 & 0x7);
						if (local20 >= 0 && local25 >= 0 && local20 < 104 && local25 < 104) {
							@Pc(935) Class30 local935 = this.aClass30ArrayArrayArray1[this.anInt981][local20][local25];
							if (local935 != null) {
								for (local209 = (Class4_Sub1_Sub2_Sub1) local935.method346(); local209 != null; local209 = (Class4_Sub1_Sub2_Sub1) local935.method348()) {
									if (local209.anInt40 == (local12 & 0x7FFF)) {
										local209.method572();
										break;
									}
								}
								if (local935.method346() == null) {
									this.aClass30ArrayArrayArray1[this.anInt981][local20][local25] = null;
								}
								this.method597(local20, local25);
							}
						}
					} else if (arg1 == 53) {
						local12 = arg0.method102();
						local16 = this.anInt1047 + (local12 >> 4 & 0x7);
						local20 = this.anInt1048 + (local12 & 0x7);
						local25 = arg0.method104();
						local28 = arg0.method102();
						local37 = arg0.method104();
						if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104) {
							local16 = local16 * 128 + 64;
							local20 = local20 * 128 + 64;
							@Pc(1052) Class4_Sub1_Sub2_Sub6 local1052 = new Class4_Sub1_Sub2_Sub6(local16, local37, anInt927, this.anInt981, this.method651(local16, this.anInt981, local20) - local28, (byte) 31, local25, local20);
							this.aClass30_11.method343(local1052);
						}
					} else {
						if (arg1 == 176) {
							local12 = arg0.method102();
							local16 = this.anInt1047 + (local12 >> 4 & 0x7);
							local20 = this.anInt1048 + (local12 & 0x7);
							local25 = arg0.method104();
							local28 = arg0.method102();
							local37 = local28 >> 4 & 0xF;
							local44 = local28 & 0x7;
							if (aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0] >= local16 - local37 && aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray174[0] <= local16 + local37 && aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0] >= local20 - local37 && aClass4_Sub1_Sub2_Sub5_Sub2_1.anIntArray175[0] <= local20 + local37 && this.aBoolean242 && !aBoolean225 && this.anInt834 < 50) {
								this.anIntArray218[this.anInt834] = local25;
								this.anIntArray234[this.anInt834] = local44;
								this.anIntArray246[this.anInt834] = Class40.anIntArray145[local25];
								this.anInt834++;
							}
						}
						if (arg1 == 54) {
							local12 = arg0.method102();
							local16 = this.anInt1047 + (local12 >> 4 & 0x7);
							local20 = this.anInt1048 + (local12 & 0x7);
							local25 = local16 + arg0.method103();
							local28 = local20 + arg0.method103();
							local37 = arg0.method105();
							local44 = arg0.method104();
							local296 = arg0.method102() * 4;
							local300 = arg0.method102() * 4;
							local304 = arg0.method104();
							local308 = arg0.method104();
							local313 = arg0.method102();
							@Pc(1222) int local1222 = arg0.method102();
							if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104 && local25 >= 0 && local28 >= 0 && local25 < 104 && local28 < 104 && local44 != 65535) {
								local16 = local16 * 128 + 64;
								local20 = local20 * 128 + 64;
								local25 = local25 * 128 + 64;
								local28 = local28 * 128 + 64;
								@Pc(1298) Class4_Sub1_Sub2_Sub4 local1298 = new Class4_Sub1_Sub2_Sub4(this.method651(local16, this.anInt981, local20) - local296, local304 + anInt927, local16, local20, false, local313, local1222, local44, local37, local308 + anInt927, local300, this.anInt981);
								local1298.method355(this.method651(local25, this.anInt981, local28) - local300, local304 + anInt927, local25, this.aByte37, local28);
								this.aClass30_10.method343(local1298);
							}
						} else if (arg1 == 182) {
							local12 = arg0.method132(this.aByte42);
							local16 = arg0.method121();
							local20 = local16 >> 2;
							local25 = local16 & 0x3;
							local28 = this.anIntArray225[local20];
							local37 = arg0.method123();
							local44 = this.anInt1047 + (local37 >> 4 & 0x7);
							local296 = this.anInt1048 + (local37 & 0x7);
							if (local44 >= 0 && local296 >= 0 && local44 < 104 && local296 < 104) {
								this.method698(local12, -1, 0, local25, this.anInt981, local28, local296, local44, local20);
							}
						}
					}
				}
			}
		} catch (@Pc(1391) RuntimeException local1391) {
			signlink.reporterror("79303, " + arg0 + ", " + -519 + ", " + arg1 + ", " + local1391.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(IZ)V")
	private void method726(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt694 >> 7 == this.anInt1003 && aClass4_Sub1_Sub2_Sub5_Sub2_1.anInt695 >> 7 == this.anInt1004) {
				this.anInt1003 = 0;
			}
			@Pc(21) int local21 = this.anInt1043;
			if (arg1) {
				local21 = 1;
			}
			for (@Pc(27) int local27 = 0; local27 < local21; local27++) {
				@Pc(33) Class4_Sub1_Sub2_Sub5_Sub2 local33;
				@Pc(38) int local38;
				if (arg1) {
					local33 = aClass4_Sub1_Sub2_Sub5_Sub2_1;
					local38 = this.anInt1042 << 14;
				} else {
					local33 = this.aClass4_Sub1_Sub2_Sub5_Sub2Array1[this.anIntArray273[local27]];
					local38 = this.anIntArray273[local27] << 14;
				}
				if (local33 != null && local33.method499(172)) {
					local33.aBoolean188 = false;
					if ((aBoolean225 && this.anInt1043 > 50 || this.anInt1043 > 200) && !arg1 && local33.anInt712 == local33.anInt724) {
						local33.aBoolean188 = true;
					}
					@Pc(89) int local89 = local33.anInt694 >> 7;
					@Pc(94) int local94 = local33.anInt695 >> 7;
					if (local89 >= 0 && local89 < 104 && local94 >= 0 && local94 < 104) {
						if (local33.aClass4_Sub1_Sub2_Sub3_2 == null || anInt927 < local33.anInt752 || anInt927 >= local33.anInt753) {
							if ((local33.anInt694 & 0x7F) == 64 && (local33.anInt695 & 0x7F) == 64) {
								if (this.anIntArrayArray23[local89][local94] == this.anInt1033) {
									continue;
								}
								this.anIntArrayArray23[local89][local94] = this.anInt1033;
							}
							local33.anInt738 = this.method651(local33.anInt694, this.anInt981, local33.anInt695);
							this.aClass45_1.method442(local33.anInt738, local33, local33.anInt694, 60, local33.anInt695, local33.anInt696, this.anInt981, local33.aBoolean187, local38);
						} else {
							local33.aBoolean188 = false;
							local33.anInt738 = this.method651(local33.anInt694, this.anInt981, local33.anInt695);
							this.aClass45_1.method443(local33.anInt748, local33.anInt749, local33.anInt696, local33, this.anInt981, local33.anInt694, local33.anInt751, local33.anInt750, local33.anInt738, local38, local33.anInt695);
						}
					}
				}
			}
			@Pc(225) int local225 = 86 / arg0;
		} catch (@Pc(227) RuntimeException local227) {
			signlink.reporterror("92028, " + arg0 + ", " + arg1 + ", " + local227.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "S", descriptor = "(I)V")
	private void method727() {
		try {
			Class28.aClass7_7.method87();
			Class28.aClass7_6.method87();
			Class33.aClass7_8.method87();
			Class24.aClass7_2.method87();
			Class24.aClass7_3.method87();
			Class4_Sub1_Sub2_Sub5_Sub2.aClass7_9.method87();
			Class16.aClass7_1.method87();
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("87719, " + -429 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)Ljava/lang/String;")
	private String method728() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("36747, " + -124 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}
}
