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

	@OriginalMember(owner = "client!client", name = "N", descriptor = "I")
	private static int anInt841;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
	private static int anInt849;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
	private static int anInt886;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
	public static int anInt907;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "I")
	private static int anInt909;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "I")
	private static int anInt911;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "Z")
	private static boolean aBoolean210;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "Z")
	private static boolean aBoolean212;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "I")
	private static int anInt915;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
	private static int anInt916;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "Z")
	private static boolean aBoolean219;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
	private static int anInt947;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "I")
	private static int anInt953;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
	private static int anInt954;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "Z")
	private static boolean aBoolean222;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
	private static int anInt968;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "Z")
	private static boolean aBoolean224;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "I")
	private static int anInt971;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
	public static int anInt976;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "Z")
	private static boolean aBoolean226;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "I")
	private static int anInt993;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "Lclient!FVFJZZXQ;")
	public static Class1_Sub1_Sub2_Sub2_Sub1 aClass1_Sub1_Sub2_Sub2_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "I")
	private static int anInt1015;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private static int anInt1023;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "I")
	private static int anInt1038;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
	private static int anInt842 = 4;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "[[I")
	public static final int[][] anIntArrayArray22 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "Ljava/lang/String;")
	private static String aString25 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "[I")
	private static int[] anIntArray240 = new int[99];

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
	private static int anInt975;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "Z")
	private static boolean aBoolean225;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "B")
	private static byte aByte61;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "[I")
	public static final int[] anIntArray254;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "[I")
	public static int[] anIntArray271;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "I")
	private int anInt839;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "I")
	private int anInt840;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "I")
	private int anInt843;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "[Lclient!YAPSNHGU;")
	private Class1_Sub1_Sub1_Sub4[] aClass1_Sub1_Sub1_Sub4Array2;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "Lclient!CMFQLMCT;")
	private Class7 aClass7_3;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Lclient!CMFQLMCT;")
	private Class7 aClass7_4;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "Lclient!CMFQLMCT;")
	private Class7 aClass7_5;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!CMFQLMCT;")
	private Class7 aClass7_6;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Lclient!CMFQLMCT;")
	private Class7 aClass7_7;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Lclient!CMFQLMCT;")
	private Class7 aClass7_8;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Lclient!CMFQLMCT;")
	private Class7 aClass7_9;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Lclient!CMFQLMCT;")
	private Class7 aClass7_10;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Lclient!CMFQLMCT;")
	private Class7 aClass7_11;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
	private int anInt846;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	private int anInt848;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	private int anInt850;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
	private int anInt851;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Lclient!VCAZMAEX;")
	private Class46 aClass46_1;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "[I")
	private int[] anIntArray218;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "[I")
	private int[] anIntArray219;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "[I")
	private int[] anIntArray220;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	private int anInt852;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "Lclient!DLNMSHLT;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_3;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "Lclient!DLNMSHLT;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_4;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
	private int anInt854;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "Lclient!DLNMSHLT;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_5;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "Ljava/lang/String;")
	private String aString18;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
	private int anInt855;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
	private int anInt856;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
	private int anInt857;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "I")
	private int anInt858;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
	private int anInt859;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "[[B")
	private byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
	private int anInt861;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
	private int anInt862;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "I")
	private int anInt863;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "Lclient!YAPSNHGU;")
	private Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "Lclient!YAPSNHGU;")
	private Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_2;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private int anInt865;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "I")
	private int anInt866;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "I")
	private int anInt867;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
	private int anInt868;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "I")
	private int anInt869;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "[I")
	private int[] anIntArray221;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "[I")
	private int[] anIntArray222;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "[I")
	private int[] anIntArray223;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
	private int anInt871;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
	private int anInt875;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "I")
	private int anInt877;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "Lclient!CMFQLMCT;")
	private Class7 aClass7_12;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "Lclient!CMFQLMCT;")
	private Class7 aClass7_13;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "Lclient!CMFQLMCT;")
	private Class7 aClass7_14;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "Lclient!CMFQLMCT;")
	private Class7 aClass7_15;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "Lclient!CMFQLMCT;")
	private Class7 aClass7_16;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "Lclient!CMFQLMCT;")
	private Class7 aClass7_17;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "Lclient!CMFQLMCT;")
	private Class7 aClass7_18;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "Lclient!CMFQLMCT;")
	private Class7 aClass7_19;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "Lclient!CMFQLMCT;")
	private Class7 aClass7_20;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
	private int anInt878;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
	private int anInt879;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
	private int anInt880;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "I")
	private int anInt882;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
	private int anInt883;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "Lclient!VCPXACGS;")
	private Class31_Sub1 aClass31_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
	private int anInt888;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "I")
	private int anInt889;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
	private int anInt890;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
	private int anInt891;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
	private int anInt893;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "I")
	private int anInt894;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "I")
	private int anInt899;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "I")
	private int anInt900;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
	private int anInt901;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "I")
	private int anInt902;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "Ljava/lang/String;")
	private String aString21;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
	private int anInt903;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "[I")
	private int[] anIntArray231;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "[I")
	private int[] anIntArray232;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "Lclient!CMFQLMCT;")
	private Class7 aClass7_21;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "Lclient!CMFQLMCT;")
	private Class7 aClass7_22;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "Lclient!CMFQLMCT;")
	private Class7 aClass7_23;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "Lclient!CMFQLMCT;")
	private Class7 aClass7_24;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
	private int anInt904;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
	private int anInt905;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "I")
	private int anInt908;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "I")
	private int anInt912;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "Lclient!ZPIYFABJ;")
	private Class50 aClass50_2;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
	private int anInt913;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "Lclient!YAPSNHGU;")
	private Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_3;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "Lclient!YAPSNHGU;")
	private Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_4;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "Lclient!YAPSNHGU;")
	private Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_5;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "Lclient!YAPSNHGU;")
	private Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_6;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "Lclient!YAPSNHGU;")
	private Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_7;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
	private int anInt917;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
	private int anInt918;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "Lclient!HRXSNEYZ;")
	private Class15 aClass15_1;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "I")
	private int anInt919;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "I")
	private int anInt920;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "I")
	private int anInt924;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "I")
	private int anInt927;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "Lclient!QLBHZVFC;")
	private Class37 aClass37_1;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "I")
	private int anInt929;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
	private int anInt930;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
	private int anInt932;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
	private int anInt934;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
	private int anInt935;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
	private int anInt936;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
	private int anInt938;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "I")
	private int anInt939;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
	private int anInt940;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "I")
	private int anInt941;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "Lclient!YAPSNHGU;")
	private Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_8;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "Lclient!YAPSNHGU;")
	private Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_9;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "Lclient!YAPSNHGU;")
	private Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_10;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "Lclient!YAPSNHGU;")
	private Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_11;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "Lclient!YAPSNHGU;")
	private Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_12;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
	private int anInt943;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "Lclient!QJBJRTJO;")
	private Class1_Sub1_Sub1_Sub3 aClass1_Sub1_Sub1_Sub3_2;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "Lclient!QJBJRTJO;")
	private Class1_Sub1_Sub1_Sub3 aClass1_Sub1_Sub1_Sub3_3;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "Lclient!QJBJRTJO;")
	private Class1_Sub1_Sub1_Sub3 aClass1_Sub1_Sub1_Sub3_4;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "Lclient!QJBJRTJO;")
	private Class1_Sub1_Sub1_Sub3 aClass1_Sub1_Sub1_Sub3_5;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "I")
	private int anInt944;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "Lclient!DLNMSHLT;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_6;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "Lclient!DLNMSHLT;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_7;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "Ljava/lang/String;")
	private String aString26;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private int anInt948;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
	private int anInt951;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
	private int anInt952;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
	private int anInt955;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
	private int anInt956;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
	private int anInt960;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
	private int anInt961;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
	private int anInt962;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
	private int anInt963;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "Lclient!DLNMSHLT;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_8;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "Lclient!DLNMSHLT;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_9;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "Lclient!DLNMSHLT;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_10;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "Lclient!DLNMSHLT;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_11;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "Lclient!DLNMSHLT;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_12;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "Lclient!DLNMSHLT;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_13;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "Lclient!DLNMSHLT;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_14;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "I")
	private int anInt969;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
	private int anInt978;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
	private int anInt979;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
	private int anInt980;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
	private int anInt981;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
	private int anInt982;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
	private int anInt986;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "I")
	private int anInt987;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "I")
	private int anInt989;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "I")
	private int anInt990;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
	private int anInt992;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "I")
	private int anInt995;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "I")
	private int anInt997;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "I")
	private int anInt998;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
	private int anInt999;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
	private int anInt1000;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "[I")
	private int[] anIntArray255;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "[I")
	private int[] anIntArray256;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "[I")
	private int[] anIntArray257;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "[I")
	private int[] anIntArray258;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "I")
	private int anInt1001;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "I")
	private int anInt1002;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "I")
	private int anInt1003;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "Lclient!DLNMSHLT;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_15;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "Lclient!YAPSNHGU;")
	private Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_13;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "Lclient!YAPSNHGU;")
	private Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_14;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
	private int anInt1005;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "I")
	private int anInt1006;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "I")
	private int anInt1007;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
	private int anInt1008;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "Lclient!YAPSNHGU;")
	private Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_15;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "Lclient!YAPSNHGU;")
	private Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_16;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "Lclient!YAPSNHGU;")
	private Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_17;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
	private int anInt1010;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "Lclient!DLNMSHLT;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_16;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
	private int anInt1011;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
	private int anInt1014;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "Lclient!UMYAUCNU;")
	private Class45 aClass45_1;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "Lclient!CMFQLMCT;")
	private Class7 aClass7_25;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "Lclient!CMFQLMCT;")
	private Class7 aClass7_26;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "Lclient!CMFQLMCT;")
	private Class7 aClass7_27;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "Lclient!YAPSNHGU;")
	private Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_18;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "Lclient!YAPSNHGU;")
	private Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_19;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "Lclient!YAPSNHGU;")
	private Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_20;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "I")
	private int anInt1016;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "I")
	private int anInt1018;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
	private int anInt1019;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
	private int anInt1020;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "I")
	private int anInt1021;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "Ljava/lang/String;")
	private String aString28;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
	private int anInt1022;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "I")
	private int anInt1024;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "I")
	private int anInt1025;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
	private int anInt1026;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
	private int anInt1027;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "I")
	private int anInt1029;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
	private int anInt1030;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "I")
	private int anInt1031;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "I")
	private int anInt1033;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
	private int anInt1034;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
	private int anInt1035;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "I")
	private int anInt1036;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "I")
	private int anInt1037;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
	private int anInt1040;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "I")
	private int anInt1041;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "I")
	private int anInt1043;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "I")
	private int anInt1044;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "I")
	private int anInt1045;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "I")
	private int anInt1046;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "I")
	private int anInt1047;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "I")
	private int anInt1048;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "I")
	private int anInt1049;

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "I")
	private int anInt1050;

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "I")
	private int anInt1051;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "I")
	private int anInt1052;

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "[I")
	private int[] anIntArray272;

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "[I")
	private int[] anIntArray273;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "[I")
	private int[] anIntArray212 = new int[33];

	@OriginalMember(owner = "client!client", name = "P", descriptor = "[I")
	private int[] anIntArray213 = new int[7];

	@OriginalMember(owner = "client!client", name = "S", descriptor = "[I")
	private int[] anIntArray214 = new int[50];

	@OriginalMember(owner = "client!client", name = "T", descriptor = "I")
	private final int anInt844 = 100;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "[I")
	private int[] anIntArray215 = new int[100];

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
	private int anInt845 = -9534;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	private int anInt847 = 2301979;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "[I")
	private int[] anIntArray216 = new int[1000];

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "B")
	private byte aByte55 = -32;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "Z")
	private boolean aBoolean197 = false;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "[I")
	private int[] anIntArray217 = new int[5];

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
	private int anInt853 = 78;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "Z")
	private boolean aBoolean198 = false;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "Z")
	private boolean aBoolean199 = false;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
	private int anInt860 = -1;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "Lclient!JHKSAGUC;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_6 = Class1_Sub1_Sub3.method226();

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
	private int anInt864 = -1;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "[Lclient!DLNMSHLT;")
	private Class1_Sub1_Sub1_Sub2[] aClass1_Sub1_Sub1_Sub2Array4 = new Class1_Sub1_Sub1_Sub2[100];

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
	private int anInt870 = 21057;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "Z")
	private boolean aBoolean200 = false;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "[I")
	private int[] anIntArray224 = new int[50];

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "I")
	private int anInt873 = 2;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "I")
	private int anInt874 = 3353893;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "Z")
	private boolean aBoolean201 = false;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "B")
	private byte aByte56 = 1;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "[I")
	private int[] anIntArray225 = new int[5];

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "Z")
	private boolean aBoolean202 = false;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "Z")
	private boolean aBoolean203 = false;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "B")
	private byte aByte57 = -91;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
	private int anInt876 = 42086;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "[I")
	private int[] anIntArray226 = new int[1000];

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "[I")
	private int[] anIntArray227 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "Z")
	private boolean aBoolean204 = false;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "Z")
	private boolean aBoolean205 = false;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
	private int anInt884 = -1;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "Lclient!OUZUCGGU;")
	private Class32 aClass32_10 = new Class32(-392);

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "[I")
	private final int[] anIntArray228 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
	private int anInt885 = 7759444;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "Ljava/lang/String;")
	private String aString19 = "";

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "Ljava/lang/String;")
	private String aString20 = "";

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "I")
	private int anInt892 = 6;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
	private int anInt895 = -1;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
	private int anInt896 = 2048;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "I")
	private int anInt897 = 2047;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "[Lclient!FVFJZZXQ;")
	private Class1_Sub1_Sub2_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub2_Sub1Array1 = new Class1_Sub1_Sub2_Sub2_Sub1[this.anInt896];

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "[I")
	private int[] anIntArray229 = new int[this.anInt896];

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "[I")
	private int[] anIntArray230 = new int[this.anInt896];

	@OriginalMember(owner = "client!client", name = "od", descriptor = "[Lclient!JHKSAGUC;")
	private Class1_Sub1_Sub3[] aClass1_Sub1_Sub3Array1 = new Class1_Sub1_Sub3[this.anInt896];

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "Lclient!JHKSAGUC;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_7 = Class1_Sub1_Sub3.method226();

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "Z")
	private volatile boolean aBoolean206 = false;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
	private int anInt906 = -1;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "Z")
	private boolean aBoolean207 = false;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "B")
	private byte aByte58 = 3;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "Z")
	private boolean aBoolean208 = false;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "I")
	private int anInt910 = 405;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "Z")
	private boolean aBoolean209 = false;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "[I")
	private int[] anIntArray233 = new int[Class10.anInt128];

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "Z")
	private boolean aBoolean211 = true;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "Lclient!TNOPEJNZ;")
	private Class43 aClass43_1 = new Class43();

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "[I")
	private int[] anIntArray234 = new int[5];

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "[I")
	private int[] anIntArray235 = new int[9];

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "[I")
	private int[] anIntArray236 = new int[33];

	@OriginalMember(owner = "client!client", name = "be", descriptor = "Z")
	private boolean aBoolean213 = false;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "[I")
	private int[] anIntArray237 = new int[151];

	@OriginalMember(owner = "client!client", name = "de", descriptor = "Z")
	private boolean aBoolean214 = true;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "Z")
	public boolean aBoolean215 = false;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "Z")
	private boolean aBoolean216 = false;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
	private int anInt914 = -1;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "Z")
	private boolean aBoolean217 = false;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
	private int anInt921 = -1;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "I")
	private int anInt922 = 573;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "I")
	private int anInt923 = 788;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
	private int anInt925 = 2;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "Z")
	private boolean aBoolean218 = false;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "Ljava/lang/String;")
	private String aString22 = "";

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
	private int anInt928 = -40997;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "[I")
	private int[] anIntArray238 = new int[256];

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "Lclient!JHKSAGUC;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_8 = Class1_Sub1_Sub3.method226();

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "[I")
	private int[] anIntArray239 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "Ljava/lang/String;")
	private String aString23 = "";

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "Ljava/lang/String;")
	private String aString24 = "";

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[200];

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "[[I")
	private int[][] anIntArrayArray23 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
	private int anInt942 = 5;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "[Lclient!KQOBJHBO;")
	public Class21[] aClass21Array1 = new Class21[5];

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "[Lclient!DLNMSHLT;")
	private Class1_Sub1_Sub1_Sub2[] aClass1_Sub1_Sub1_Sub2Array5 = new Class1_Sub1_Sub1_Sub2[1000];

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "Z")
	private boolean aBoolean220 = true;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
	private int anInt945 = 50;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "[I")
	private int[] anIntArray241 = new int[this.anInt945];

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "[I")
	private int[] anIntArray242 = new int[this.anInt945];

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "[I")
	private int[] anIntArray243 = new int[this.anInt945];

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "[I")
	private int[] anIntArray244 = new int[this.anInt945];

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "[I")
	private int[] anIntArray245 = new int[this.anInt945];

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "[I")
	private int[] anIntArray246 = new int[this.anInt945];

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "[I")
	private int[] anIntArray247 = new int[this.anInt945];

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[this.anInt945];

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "I")
	private int anInt946 = -374;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "[Lclient!YAPSNHGU;")
	private Class1_Sub1_Sub1_Sub4[] aClass1_Sub1_Sub1_Sub4Array3 = new Class1_Sub1_Sub1_Sub4[2];

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "Z")
	private boolean aBoolean221 = false;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "[Lclient!YAPSNHGU;")
	private Class1_Sub1_Sub1_Sub4[] aClass1_Sub1_Sub1_Sub4Array4 = new Class1_Sub1_Sub1_Sub4[13];

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "[I")
	private int[] anIntArray248 = new int[Class10.anInt128];

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "[I")
	private int[] anIntArray249 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
	private int anInt959 = 5063219;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
	private int anInt965 = -1;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
	private int anInt966 = -1;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "Z")
	private boolean aBoolean223 = true;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
	private int anInt967 = 3;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "[I")
	private int[] anIntArray250 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "B")
	private byte aByte59 = -73;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "[I")
	private int[] anIntArray251 = new int[50];

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
	private int anInt972 = -1;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "B")
	private byte aByte60 = 1;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
	private int anInt977 = 2;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "Z")
	private boolean aBoolean227 = true;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
	private int anInt983 = 1;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "[I")
	private int[] anIntArray252 = new int[5];

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
	private int anInt984 = 6;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
	private int anInt985 = -375;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "Lclient!JHKSAGUC;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_9 = new Class1_Sub1_Sub3(new byte[5000], 8);

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "[Lclient!NLPNWUNL;")
	private Class1_Sub1_Sub2_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2_Sub2Array1 = new Class1_Sub1_Sub2_Sub2_Sub2[16384];

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "[I")
	private int[] anIntArray253 = new int[16384];

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "I")
	private int anInt988 = 431;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "[Lclient!YAPSNHGU;")
	private Class1_Sub1_Sub1_Sub4[] aClass1_Sub1_Sub1_Sub4Array5 = new Class1_Sub1_Sub1_Sub4[100];

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "I")
	private int anInt991 = 1;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[500];

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "Z")
	private volatile boolean aBoolean228 = false;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "I")
	private int anInt994 = 70;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "Z")
	private boolean aBoolean229 = false;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "Lclient!OUZUCGGU;")
	private Class32 aClass32_11 = new Class32(-392);

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "Z")
	private boolean aBoolean230 = false;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "[I")
	private int[] anIntArray259 = new int[500];

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "[I")
	private int[] anIntArray260 = new int[500];

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "[I")
	private int[] anIntArray261 = new int[500];

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "[I")
	private int[] anIntArray262 = new int[500];

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "[I")
	public int[] anIntArray263 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "Z")
	private boolean aBoolean231 = true;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "[Lclient!DLNMSHLT;")
	private Class1_Sub1_Sub1_Sub2[] aClass1_Sub1_Sub1_Sub2Array6 = new Class1_Sub1_Sub1_Sub2[8];

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "[I")
	private int[] anIntArray264 = new int[Class10.anInt128];

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
	private int anInt1004 = 128;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "[I")
	private int[] anIntArray265 = new int[5];

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "[Lclient!DLNMSHLT;")
	private Class1_Sub1_Sub1_Sub2[] aClass1_Sub1_Sub1_Sub2Array7 = new Class1_Sub1_Sub1_Sub2[20];

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "B")
	private byte aByte62 = 122;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "Z")
	private boolean aBoolean232 = false;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "[I")
	private int[] anIntArray266 = new int[151];

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "[[[Lclient!OUZUCGGU;")
	private Class32[][][] aClass32ArrayArrayArray1 = new Class32[4][104][104];

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "[Lclient!KFLNJHKB;")
	private Class20[] aClass20Array1 = new Class20[4];

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "Z")
	private boolean aBoolean233 = false;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "Ljava/lang/String;")
	private String aString27 = "";

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "[I")
	private int[] anIntArray267 = new int[200];

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "[Lclient!DLNMSHLT;")
	private Class1_Sub1_Sub1_Sub2[] aClass1_Sub1_Sub1_Sub2Array8 = new Class1_Sub1_Sub1_Sub2[20];

	@OriginalMember(owner = "client!client", name = "li", descriptor = "[J")
	private long[] aLongArray4 = new long[200];

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "B")
	private byte aByte63 = -32;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "Z")
	private boolean aBoolean234 = false;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "Z")
	private boolean aBoolean235 = false;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "Z")
	private boolean aBoolean236 = true;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private int anInt1012 = -1;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
	private int anInt1013 = -1;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "[I")
	private int[] anIntArray268 = new int[100];

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[100];

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[100];

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "B")
	private byte aByte64 = 20;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "I")
	private int anInt1017 = 2;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "Ljava/lang/String;")
	private String aString29 = "";

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "[I")
	private int[] anIntArray269 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "[I")
	private int[] anIntArray270 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "Z")
	private volatile boolean aBoolean237 = false;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "I")
	private int anInt1028 = -1;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
	private int anInt1032 = 1;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "Ljava/lang/String;")
	private String aString30 = "";

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "Z")
	private boolean aBoolean238 = false;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
	private int anInt1039 = -984;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "Z")
	private boolean aBoolean239 = false;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "I")
	private int anInt1042 = -1;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "Z")
	private boolean aBoolean240 = false;

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[5];

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "Lclient!OUZUCGGU;")
	private Class32 aClass32_12 = new Class32(-392);

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "I")
	private int anInt1053 = -499;

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "Z")
	private boolean aBoolean241 = false;

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "Z")
	private boolean aBoolean242 = false;

	static {
		@Pc(273) int local273 = 0;
		@Pc(275) int local275;
		for (local275 = 0; local275 < 99; local275++) {
			@Pc(280) int local280 = local275 + 1;
			@Pc(293) int local293 = (int) ((double) local280 + Math.pow(2.0D, (double) local280 / 7.0D) * 300.0D);
			local273 += local293;
			anIntArray240[local275] = local273 / 4;
		}
		anInt975 = 10;
		aBoolean225 = true;
		aByte61 = 93;
		aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		anIntArray254 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		anIntArray271 = new int[32];
		local273 = 2;
		for (local275 = 0; local275 < 32; local275++) {
			anIntArray271[local275] = local273 - 1;
			local273 += local273;
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private static void method609() {
		try {
			Class45.aBoolean163 = false;
			Class1_Sub1_Sub1_Sub1.aBoolean15 = false;
			aBoolean226 = false;
			Class3.aBoolean5 = false;
			Class41.aBoolean140 = false;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("38979, " + 2 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private static void method618() {
		try {
			Class45.aBoolean163 = true;
			Class1_Sub1_Sub1_Sub1.aBoolean15 = true;
			aBoolean226 = true;
			Class3.aBoolean5 = true;
			Class41.aBoolean140 = true;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("5738, " + 7 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Ljava/lang/String;")
	private static String method646(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
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
			signlink.reporterror("54004, " + 5 + ", " + arg0 + ", " + arg1 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Ljava/lang/String;")
	private static String method657(@OriginalArg(0) int arg0) {
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
			signlink.reporterror("40658, " + arg0 + ", " + 3 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)Ljava/lang/String;")
	private static String method658(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("32994, " + 1 + ", " + arg0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 318);
			if (arg0.length == 5) {
				anInt975 = Integer.parseInt(arg0[0]);
				anInt976 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method618();
				} else if (arg0[2].equals("highmem")) {
					method609();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean225 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean225 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt1056 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method568();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!TNOPEJNZ;)Z")
	private boolean method581(@OriginalArg(1) Class43 arg0) {
		try {
			@Pc(8) int local8 = arg0.anInt712;
			if (local8 >= 1 && local8 <= 200 || !(local8 < 701 || local8 > 900)) {
				if (local8 >= 801) {
					local8 -= 701;
				} else if (local8 >= 701) {
					local8 -= 601;
				} else if (local8 >= 101) {
					local8 -= 101;
				} else {
					local8--;
				}
				this.aStringArray10[this.anInt931] = "Remove @whi@" + this.aStringArray8[local8];
				this.anIntArray261[this.anInt931] = 47;
				this.anInt931++;
				this.aStringArray10[this.anInt931] = "Message @whi@" + this.aStringArray8[local8];
				this.anIntArray261[this.anInt931] = 904;
				this.anInt931++;
				return true;
			} else if (local8 >= 401 && local8 <= 500) {
				this.aStringArray10[this.anInt931] = "Remove @whi@" + arg0.aString15;
				this.anIntArray261[this.anInt931] = 281;
				this.anInt931++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("26, " + true + ", " + arg0 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	private void method582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			@Pc(1) Class1_Sub2 local1 = null;
			@Pc(5) boolean local5 = false;
			for (@Pc(10) Class1_Sub2 local10 = (Class1_Sub2) this.aClass32_12.method336(); local10 != null; local10 = (Class1_Sub2) this.aClass32_12.method338()) {
				if (local10.anInt86 == arg2 && local10.anInt88 == arg4 && local10.anInt89 == arg5 && local10.anInt87 == arg1) {
					local1 = local10;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class1_Sub2();
				local1.anInt86 = arg2;
				local1.anInt87 = arg1;
				local1.anInt88 = arg4;
				local1.anInt89 = arg5;
				this.method621(local1);
				this.aClass32_12.method333(local1);
			}
			local1.anInt93 = arg7;
			local1.anInt95 = arg6;
			local1.anInt94 = arg9;
			local1.anInt85 = arg8;
			local1.anInt96 = arg3;
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("29089, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local82.toString());
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
				return new URL("http://127.0.0.1:" + (anInt976 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	private void method583() {
		try {
			Class41.aClass30_6.method331();
			Class41.aClass30_5.method331();
			Class39.aClass30_4.method331();
			Class27.aClass30_3.method331();
			Class27.aClass30_2.method331();
			Class1_Sub1_Sub2_Sub2_Sub1.aClass30_1.method331();
			Class44.aClass30_9.method331();
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("78699, " + true + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILclient!JHKSAGUC;)V")
	private void method584(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			for (@Pc(6) int local6 = 0; local6 < this.anInt899; local6++) {
				@Pc(13) int local13 = this.anIntArray230[local6];
				@Pc(18) Class1_Sub1_Sub2_Sub2_Sub1 local18 = this.aClass1_Sub1_Sub2_Sub2_Sub1Array1[local13];
				@Pc(21) int local21 = arg1.method238();
				if ((local21 & 0x10) != 0) {
					local21 += arg1.method238() << 8;
				}
				this.method604(local13, arg1, local21, local18);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("32220, " + true + ", " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method585(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt969; local8++) {
					if (this.aLongArray3[local8] == arg0) {
						this.anInt969--;
						this.aBoolean232 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt969; local28++) {
							this.aLongArray3[local28] = this.aLongArray3[local28 + 1];
						}
						this.aClass1_Sub1_Sub3_6.method227(203);
						this.aClass1_Sub1_Sub3_6.method234(arg0);
						break;
					}
				}
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("72575, " + -121 + ", " + arg0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method586() {
		try {
			anInt971++;
			if (anInt971 > 121) {
				anInt971 = 0;
				this.aClass1_Sub1_Sub3_6.method227(55);
				this.aClass1_Sub1_Sub3_6.method232(0);
			}
			while (true) {
				@Pc(28) int local28;
				do {
					while (true) {
						local28 = this.method572();
						if (local28 == -1) {
							return;
						}
						if (this.anInt895 != -1 && this.anInt895 == this.anInt1042) {
							if (local28 == 8 && this.aString22.length() > 0) {
								this.aString22 = this.aString22.substring(0, this.aString22.length() - 1);
							}
							break;
						}
						@Pc(208) int local208;
						if (this.aBoolean216) {
							if (local28 >= 32 && local28 <= 122 && this.aString27.length() < 80) {
								this.aString27 = this.aString27 + (char) local28;
								this.aBoolean242 = true;
							}
							if (local28 == 8 && this.aString27.length() > 0) {
								this.aString27 = this.aString27.substring(0, this.aString27.length() - 1);
								this.aBoolean242 = true;
							}
							if (local28 == 13 || local28 == 10) {
								this.aBoolean216 = false;
								this.aBoolean242 = true;
								@Pc(168) long local168;
								if (this.anInt987 == 1) {
									local168 = Class49.method538(this.aString27);
									this.method627(local168);
								}
								if (this.anInt987 == 2 && this.anInt919 > 0) {
									local168 = Class49.method538(this.aString27);
									this.method625(local168);
								}
								if (this.anInt987 == 3 && this.aString27.length() > 0) {
									this.aClass1_Sub1_Sub3_6.method227(204);
									this.aClass1_Sub1_Sub3_6.method228(0);
									local208 = this.aClass1_Sub1_Sub3_6.anInt352;
									this.aClass1_Sub1_Sub3_6.method234(this.aLong32);
									Class18.method222(this.aClass1_Sub1_Sub3_6, this.aString27);
									this.aClass1_Sub1_Sub3_6.method237(this.aClass1_Sub1_Sub3_6.anInt352 - local208);
									this.aString27 = Class18.method223(this.aString27);
									this.aString27 = Class14.method179(861, this.aString27);
									this.method630(6, this.aString27, Class49.method542(Class49.method539(this.aLong32)), (byte) 4);
									if (this.anInt912 == 2) {
										this.anInt912 = 1;
										this.aBoolean200 = true;
										this.aClass1_Sub1_Sub3_6.method227(36);
										this.aClass1_Sub1_Sub3_6.method228(this.anInt843);
										this.aClass1_Sub1_Sub3_6.method228(this.anInt912);
										this.aClass1_Sub1_Sub3_6.method228(this.anInt1022);
									}
								}
								if (this.anInt987 == 4 && this.anInt969 < 100) {
									local168 = Class49.method538(this.aString27);
									this.method592(local168);
								}
								if (this.anInt987 == 5 && this.anInt969 > 0) {
									local168 = Class49.method538(this.aString27);
									this.method585(local168);
								}
							}
						} else if (this.anInt1041 == 1) {
							if (local28 >= 48 && local28 <= 57 && this.aString29.length() < 10) {
								this.aString29 = this.aString29 + (char) local28;
								this.aBoolean242 = true;
							}
							if (local28 == 8 && this.aString29.length() > 0) {
								this.aString29 = this.aString29.substring(0, this.aString29.length() - 1);
								this.aBoolean242 = true;
							}
							if (local28 == 13 || local28 == 10) {
								if (this.aString29.length() > 0) {
									local208 = 0;
									try {
										local208 = Integer.parseInt(this.aString29);
									} catch (@Pc(385) Exception local385) {
									}
									this.aClass1_Sub1_Sub3_6.method227(20);
									this.aClass1_Sub1_Sub3_6.method232(local208);
								}
								this.anInt1041 = 0;
								this.aBoolean242 = true;
							}
						} else if (this.anInt1041 == 2) {
							if (local28 >= 32 && local28 <= 122 && this.aString29.length() < 12) {
								this.aString29 = this.aString29 + (char) local28;
								this.aBoolean242 = true;
							}
							if (local28 == 8 && this.aString29.length() > 0) {
								this.aString29 = this.aString29.substring(0, this.aString29.length() - 1);
								this.aBoolean242 = true;
							}
							if (local28 == 13 || local28 == 10) {
								if (this.aString29.length() > 0) {
									this.aClass1_Sub1_Sub3_6.method227(14);
									this.aClass1_Sub1_Sub3_6.method234(Class49.method538(this.aString29));
								}
								this.anInt1041 = 0;
								this.aBoolean242 = true;
							}
						} else if (this.anInt914 == -1) {
							if (local28 >= 32 && local28 <= 122 && this.aString17.length() < 80) {
								this.aString17 = this.aString17 + (char) local28;
								this.aBoolean242 = true;
							}
							if (local28 == 8 && this.aString17.length() > 0) {
								this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
								this.aBoolean242 = true;
							}
							if ((local28 == 13 || local28 == 10) && this.aString17.length() > 0) {
								if (this.anInt1003 == 2) {
									if (this.aString17.equals("::clientdrop")) {
										this.method659();
									}
									if (this.aString17.equals("::lag")) {
										this.method702(this.aByte55);
									}
									if (this.aString17.equals("::prefetchmusic")) {
										for (local208 = 0; local208 < this.aClass31_Sub1_1.method519(2); local208++) {
											this.aClass31_Sub1_1.method526((byte) 1, local208, 2);
										}
									}
									if (this.aString17.equals("::fpson")) {
										aBoolean210 = true;
									}
									if (this.aString17.equals("::fpsoff")) {
										aBoolean210 = false;
									}
									if (this.aString17.equals("::noclip")) {
										for (local208 = 0; local208 < 4; local208++) {
											for (@Pc(614) int local614 = 1; local614 < 103; local614++) {
												for (@Pc(618) int local618 = 1; local618 < 103; local618++) {
													this.aClass20Array1[local208].anIntArrayArray7[local614][local618] = 0;
												}
											}
										}
									}
								}
								if (this.aString17.startsWith("::")) {
									this.aClass1_Sub1_Sub3_6.method227(212);
									this.aClass1_Sub1_Sub3_6.method228(this.aString17.length() - 1);
									this.aClass1_Sub1_Sub3_6.method235(this.aString17.substring(2));
								} else {
									@Pc(673) String local673 = this.aString17.toLowerCase();
									@Pc(675) byte local675 = 0;
									if (local673.startsWith("yellow:")) {
										local675 = 0;
										this.aString17 = this.aString17.substring(7);
									} else if (local673.startsWith("red:")) {
										local675 = 1;
										this.aString17 = this.aString17.substring(4);
									} else if (local673.startsWith("green:")) {
										local675 = 2;
										this.aString17 = this.aString17.substring(6);
									} else if (local673.startsWith("cyan:")) {
										local675 = 3;
										this.aString17 = this.aString17.substring(5);
									} else if (local673.startsWith("purple:")) {
										local675 = 4;
										this.aString17 = this.aString17.substring(7);
									} else if (local673.startsWith("white:")) {
										local675 = 5;
										this.aString17 = this.aString17.substring(6);
									} else if (local673.startsWith("flash1:")) {
										local675 = 6;
										this.aString17 = this.aString17.substring(7);
									} else if (local673.startsWith("flash2:")) {
										local675 = 7;
										this.aString17 = this.aString17.substring(7);
									} else if (local673.startsWith("flash3:")) {
										local675 = 8;
										this.aString17 = this.aString17.substring(7);
									} else if (local673.startsWith("glow1:")) {
										local675 = 9;
										this.aString17 = this.aString17.substring(6);
									} else if (local673.startsWith("glow2:")) {
										local675 = 10;
										this.aString17 = this.aString17.substring(6);
									} else if (local673.startsWith("glow3:")) {
										local675 = 11;
										this.aString17 = this.aString17.substring(6);
									}
									local673 = this.aString17.toLowerCase();
									@Pc(847) byte local847 = 0;
									if (local673.startsWith("wave:")) {
										local847 = 1;
										this.aString17 = this.aString17.substring(5);
									} else if (local673.startsWith("wave2:")) {
										local847 = 2;
										this.aString17 = this.aString17.substring(6);
									} else if (local673.startsWith("shake:")) {
										local847 = 3;
										this.aString17 = this.aString17.substring(6);
									} else if (local673.startsWith("scroll:")) {
										local847 = 4;
										this.aString17 = this.aString17.substring(7);
									} else if (local673.startsWith("slide:")) {
										local847 = 5;
										this.aString17 = this.aString17.substring(6);
									}
									this.aClass1_Sub1_Sub3_6.method227(172);
									this.aClass1_Sub1_Sub3_6.method228(0);
									@Pc(928) int local928 = this.aClass1_Sub1_Sub3_6.anInt352;
									this.aClass1_Sub1_Sub3_6.method256(local847);
									this.aClass1_Sub1_Sub3_6.method256(local675);
									this.aClass1_Sub1_Sub3_9.anInt352 = 0;
									Class18.method222(this.aClass1_Sub1_Sub3_9, this.aString17);
									this.aClass1_Sub1_Sub3_6.method236(this.aClass1_Sub1_Sub3_9.anInt352, this.aClass1_Sub1_Sub3_9.aByteArray3);
									this.aClass1_Sub1_Sub3_6.method237(this.aClass1_Sub1_Sub3_6.anInt352 - local928);
									this.aString17 = Class18.method223(this.aString17);
									this.aString17 = Class14.method179(861, this.aString17);
									aClass1_Sub1_Sub2_Sub2_Sub1_1.aString8 = this.aString17;
									aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt504 = local675;
									aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt495 = local847;
									aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt501 = 150;
									if (this.anInt1003 == 2) {
										this.method630(2, aClass1_Sub1_Sub2_Sub2_Sub1_1.aString8, "@cr2@" + aClass1_Sub1_Sub2_Sub2_Sub1_1.aString5, (byte) 4);
									} else if (this.anInt1003 == 1) {
										this.method630(2, aClass1_Sub1_Sub2_Sub2_Sub1_1.aString8, "@cr1@" + aClass1_Sub1_Sub2_Sub2_Sub1_1.aString5, (byte) 4);
									} else {
										this.method630(2, aClass1_Sub1_Sub2_Sub2_Sub1_1.aString8, aClass1_Sub1_Sub2_Sub2_Sub1_1.aString5, (byte) 4);
									}
									if (this.anInt843 == 2) {
										this.anInt843 = 3;
										this.aBoolean200 = true;
										this.aClass1_Sub1_Sub3_6.method227(36);
										this.aClass1_Sub1_Sub3_6.method228(this.anInt843);
										this.aClass1_Sub1_Sub3_6.method228(this.anInt912);
										this.aClass1_Sub1_Sub3_6.method228(this.anInt1022);
									}
								}
								this.aString17 = "";
								this.aBoolean242 = true;
							}
						}
					}
				} while ((local28 < 97 || local28 > 122) && (local28 < 65 || local28 > 90) && (local28 < 48 || local28 > 57) && local28 != 32);
				if (this.aString22.length() < 12) {
					this.aString22 = this.aString22 + (char) local28;
				}
			}
		} catch (@Pc(1081) RuntimeException local1081) {
			signlink.reporterror("47703, " + 0 + ", " + local1081.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method587() {
		try {
			for (@Pc(14) Class1_Sub1_Sub2_Sub5 local14 = (Class1_Sub1_Sub2_Sub5) this.aClass32_11.method336(); local14 != null; local14 = (Class1_Sub1_Sub2_Sub5) this.aClass32_11.method338()) {
				if (local14.anInt543 != this.anInt850 || local14.aBoolean110) {
					local14.method544();
				} else if (anInt907 >= local14.anInt542) {
					local14.method359(this.anInt840);
					if (local14.aBoolean110) {
						local14.method544();
					} else {
						this.aClass45_1.method476(local14.anInt546, -1, 60, false, local14.anInt543, local14.anInt544, local14, local14.anInt545, 0);
					}
				}
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("86144, " + 7 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!QQAAMZPI;)V")
	private void method588(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub2_Sub2 arg1) {
		try {
			this.method589(arg0, arg1.anInt498, this.anInt922, arg1.anInt497);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("3341, " + 45917 + ", " + arg0 + ", " + arg1 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V")
	private void method589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg3 >= 128 && arg1 >= 128 && arg3 <= 13056 && arg1 <= 13056) {
				@Pc(28) int local28 = this.method692(arg1, arg3, this.anInt850) - arg0;
				@Pc(33) int local33 = arg3 - this.anInt1033;
				@Pc(37) int local37 = 0 / arg2;
				@Pc(42) int local42 = local28 - this.anInt1034;
				@Pc(47) int local47 = arg1 - this.anInt1035;
				@Pc(52) int local52 = Class1_Sub1_Sub2_Sub6.anIntArray154[this.anInt1036];
				@Pc(57) int local57 = Class1_Sub1_Sub2_Sub6.anIntArray155[this.anInt1036];
				@Pc(62) int local62 = Class1_Sub1_Sub2_Sub6.anIntArray154[this.anInt1037];
				@Pc(67) int local67 = Class1_Sub1_Sub2_Sub6.anIntArray155[this.anInt1037];
				@Pc(77) int local77 = local47 * local62 + local33 * local67 >> 16;
				@Pc(87) int local87 = local47 * local67 - local33 * local62 >> 16;
				@Pc(89) int local89 = local77;
				@Pc(99) int local99 = local42 * local57 - local87 * local52 >> 16;
				@Pc(109) int local109 = local42 * local52 + local87 * local57 >> 16;
				if (local109 >= 50) {
					this.anInt1012 = Class1_Sub1_Sub1_Sub1.anInt51 + (local89 << 9) / local109;
					this.anInt1013 = Class1_Sub1_Sub1_Sub1.anInt52 + (local99 << 9) / local109;
				} else {
					this.anInt1012 = -1;
					this.anInt1013 = -1;
				}
			} else {
				this.anInt1012 = -1;
				this.anInt1013 = -1;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("37299, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)V")
	private void method590(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	@Override
	protected void method580(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			this.anInt875 = arg1;
			this.aString26 = arg0;
			this.method652();
			if (this.aClass15_1 == null) {
				super.method580(arg0, arg1, (byte) 3);
			} else {
				this.aClass7_14.method92();
				this.aClass1_Sub1_Sub1_Sub3_4.method379(54, 180, "RuneScape is loading - please wait...", 16777215);
				Class1_Sub1_Sub1.method552(34, 28, 304, 9179409, 62);
				Class1_Sub1_Sub1.method552(32, 29, 302, 0, 63);
				Class1_Sub1_Sub1.method551(30, arg1 * 3, 64, 9179409, 30);
				if (this.aByte58 == 3) {
					@Pc(96) boolean local96 = false;
				} else {
					this.method573();
				}
				Class1_Sub1_Sub1.method551(30, 300 - arg1 * 3, 64, 0, arg1 * 3 + 30);
				this.aClass1_Sub1_Sub1_Sub3_4.method379(85, 180, arg0, 16777215);
				this.aClass7_14.method93(super.aGraphics2, 171, 202);
				if (this.aBoolean233) {
					this.aBoolean233 = false;
					if (!this.aBoolean237) {
						this.aClass7_15.method93(super.aGraphics2, 0, 0);
						this.aClass7_16.method93(super.aGraphics2, 0, 637);
					}
					this.aClass7_12.method93(super.aGraphics2, 0, 128);
					this.aClass7_13.method93(super.aGraphics2, 371, 202);
					this.aClass7_17.method93(super.aGraphics2, 265, 0);
					this.aClass7_18.method93(super.aGraphics2, 265, 562);
					this.aClass7_19.method93(super.aGraphics2, 171, 128);
					this.aClass7_20.method93(super.aGraphics2, 171, 562);
				}
			}
		} catch (@Pc(220) RuntimeException local220) {
			signlink.reporterror("49894, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local220.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method591(@OriginalArg(0) int arg0) {
		try {
			this.anInt887 += arg0;
			@Pc(9) int local9 = 5;
			this.anIntArray235[8] = 0;
			@Pc(16) int local16 = 0;
			while (this.anIntArray235[8] == 0) {
				@Pc(20) String local20 = "Unknown problem";
				this.method580("Connecting to web server", 20, (byte) 3);
				try {
					@Pc(42) DataInputStream local42 = this.method613("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 318);
					@Pc(49) Class1_Sub1_Sub3 local49 = new Class1_Sub1_Sub3(new byte[40], 8);
					local42.readFully(local49.aByteArray3, 0, 40);
					local42.close();
					for (@Pc(59) int local59 = 0; local59 < 9; local59++) {
						this.anIntArray235[local59] = local49.method243();
					}
					@Pc(74) int local74 = local49.method243();
					@Pc(76) int local76 = 1234;
					for (@Pc(78) int local78 = 0; local78 < 9; local78++) {
						local76 = (local76 << 1) + this.anIntArray235[local78];
					}
					if (local74 != local76) {
						local20 = "checksum problem";
						this.anIntArray235[8] = 0;
					}
				} catch (@Pc(105) EOFException local105) {
					local20 = "EOF problem";
					this.anIntArray235[8] = 0;
				} catch (@Pc(114) IOException local114) {
					local20 = "connection problem";
					this.anIntArray235[8] = 0;
				} catch (@Pc(123) Exception local123) {
					local20 = "logic problem";
					this.anIntArray235[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray235[8] == 0) {
					local16++;
					for (@Pc(141) int local141 = local9; local141 > 0; local141--) {
						if (local16 >= 10) {
							this.method580("Game updated - please reload page", 10, (byte) 3);
							local141 = 10;
						} else {
							this.method580(local20 + " - Will retry in " + local141 + " secs.", 10, (byte) 3);
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
					this.aBoolean230 = !this.aBoolean230;
				}
			}
		} catch (@Pc(203) RuntimeException local203) {
			signlink.reporterror("54535, " + arg0 + ", " + local203.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JB)V")
	private void method592(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt969 >= 100) {
					this.method630(0, "Your ignore list is full. Max of 100 hit", "", (byte) 4);
				} else {
					@Pc(23) String local23 = Class49.method542(Class49.method539(arg0));
					for (@Pc(25) int local25 = 0; local25 < this.anInt969; local25++) {
						if (this.aLongArray3[local25] == arg0) {
							this.method630(0, local23 + " is already on your ignore list", "", (byte) 4);
							return;
						}
					}
					for (@Pc(55) int local55 = 0; local55 < this.anInt919; local55++) {
						if (this.aLongArray4[local55] == arg0) {
							this.method630(0, "Please remove " + local23 + " from your friend list first", "", (byte) 4);
							return;
						}
					}
					this.aLongArray3[this.anInt969++] = arg0;
					this.aBoolean232 = true;
					this.aClass1_Sub1_Sub3_6.method227(105);
					this.aClass1_Sub1_Sub3_6.method234(arg0);
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("89100, " + arg0 + ", " + 3 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)Z")
	private boolean method593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(7) int local7 = arg0 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass45_1.method495(this.anInt850, arg2, arg1, arg0);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(43) Class41 local43 = Class41.method452(local7);
				@Pc(51) int local51;
				@Pc(54) int local54;
				if (local31 == 0 || local31 == 2) {
					local51 = local43.anInt648;
					local54 = local43.anInt640;
				} else {
					local51 = local43.anInt640;
					local54 = local43.anInt648;
				}
				@Pc(65) int local65 = local43.anInt652;
				if (local31 != 0) {
					local65 = (local65 << local31 & 0xF) + (local65 >> 4 - local31);
				}
				this.method690(arg2, local65, local54, 2, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0], 0, false, 0, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0], local51, arg1);
			} else {
				this.method690(arg2, 0, 0, 2, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0], local25 + 1, false, local31, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0], 0, arg1);
			}
			this.anInt961 = super.anInt834;
			this.anInt962 = super.anInt835;
			this.anInt964 = 2;
			this.anInt963 = 0;
			return true;
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("75987, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method574() {
		try {
			if (!this.aBoolean241 && !this.aBoolean209 && !this.aBoolean240) {
				anInt907++;
				if (this.aBoolean215) {
					this.method663();
				} else {
					this.method612();
				}
				this.method668(anInt842);
				this.anInt887 += 0;
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("68898, " + 0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method594() {
		try {
			this.anInt887 += 0;
			if (this.anInt857 == 0) {
				@Pc(12) int local12 = super.anInt833;
				if (this.anInt900 == 1 && super.anInt834 >= 516 && super.anInt835 >= 160 && super.anInt834 <= 765 && super.anInt835 <= 205) {
					local12 = 0;
				}
				@Pc(43) int local43;
				@Pc(46) int local46;
				@Pc(122) int local122;
				if (this.aBoolean217) {
					if (local12 != 1) {
						local43 = super.anInt828;
						local46 = super.anInt829;
						if (this.anInt865 == 0) {
							local43 -= 4;
							local46 -= 4;
						}
						if (this.anInt865 == 1) {
							local43 -= 553;
							local46 -= 205;
						}
						if (this.anInt865 == 2) {
							local43 -= 17;
							local46 -= 357;
						}
						if (local43 < this.anInt866 - 10 || local43 > this.anInt866 + this.anInt868 + 10 || local46 < this.anInt867 - 10 || local46 > this.anInt867 + this.anInt869 + 10) {
							this.aBoolean217 = false;
							if (this.anInt865 == 1) {
								this.aBoolean232 = true;
							}
							if (this.anInt865 == 2) {
								this.aBoolean242 = true;
							}
						}
					}
					if (local12 == 1) {
						local43 = this.anInt866;
						local46 = this.anInt867;
						local122 = this.anInt868;
						@Pc(125) int local125 = super.anInt834;
						@Pc(128) int local128 = super.anInt835;
						if (this.anInt865 == 0) {
							local125 -= 4;
							local128 -= 4;
						}
						if (this.anInt865 == 1) {
							local125 -= 553;
							local128 -= 205;
						}
						if (this.anInt865 == 2) {
							local125 -= 17;
							local128 -= 357;
						}
						@Pc(147) int local147 = -1;
						for (@Pc(149) int local149 = 0; local149 < this.anInt931; local149++) {
							@Pc(164) int local164 = local46 + (this.anInt931 - 1 - local149) * 15 + 31;
							if (local125 > local43 && local125 < local43 + local122 && local128 > local164 - 13 && local128 < local164 + 3) {
								local147 = local149;
							}
						}
						if (local147 != -1) {
							this.method620(local147);
						}
						this.aBoolean217 = false;
						if (this.anInt865 == 1) {
							this.aBoolean232 = true;
						}
						if (this.anInt865 == 2) {
							this.aBoolean242 = true;
							return;
						}
					}
				} else {
					if (local12 == 1 && this.anInt931 > 0) {
						local43 = this.anIntArray261[this.anInt931 - 1];
						if (local43 == 3 || local43 == 743 || local43 == 705 || local43 == 947 || local43 == 760 || local43 == 723 || local43 == 22 || local43 == 300 || local43 == 863 || local43 == 196 || local43 == 146 || local43 == 1752) {
							local46 = this.anIntArray259[this.anInt931 - 1];
							local122 = this.anIntArray260[this.anInt931 - 1];
							@Pc(284) Class43 local284 = Class43.aClass43Array1[local122];
							if (local284.aBoolean152 || local284.aBoolean148) {
								this.aBoolean238 = false;
								this.anInt882 = 0;
								this.anInt855 = local122;
								this.anInt856 = local46;
								this.anInt857 = 2;
								this.anInt858 = super.anInt834;
								this.anInt859 = super.anInt835;
								if (Class43.aClass43Array1[local122].anInt703 == this.anInt895) {
									this.anInt857 = 1;
								}
								if (Class43.aClass43Array1[local122].anInt703 == this.anInt914) {
									this.anInt857 = 3;
								}
								return;
							}
						}
					}
					if (local12 == 1 && (this.anInt1040 == 1 || this.method634(this.anInt931 - 1)) && this.anInt931 > 2) {
						local12 = 2;
					}
					if (local12 == 1 && this.anInt931 > 0) {
						this.method620(this.anInt931 - 1);
					}
					if (local12 != 2 || this.anInt931 <= 0) {
						return;
					}
					this.method617();
				}
			}
		} catch (@Pc(379) RuntimeException local379) {
			signlink.reporterror("31616, " + 0 + ", " + local379.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Ljava/lang/String;")
	private String method595(@OriginalArg(1) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("48264, " + 49 + ", " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[BZ)V")
	private void method596(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2) {
		try {
			signlink.anInt1061 = arg2 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
			this.anInt887 += arg0;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("9100, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean206) {
			this.method672();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)Z")
	private boolean method597() {
		try {
			this.aBoolean215 &= true;
			return signlink.wavereplay();
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("98970, " + true + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(III)V")
	private void method598(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(1) int local1 = 0;
			for (@Pc(9) int local9 = 0; local9 < 100; local9++) {
				if (this.aStringArray12[local9] != null) {
					@Pc(21) int local21 = this.anIntArray268[local9];
					@Pc(32) int local32 = this.anInt880 + 70 + 4 - local1 * 14;
					if (local32 < -20) {
						break;
					}
					@Pc(40) String local40 = this.aStringArray11[local9];
					if (local40 != null && local40.startsWith("@cr1@")) {
						local40 = local40.substring(5);
					}
					if (local40 != null && local40.startsWith("@cr2@")) {
						local40 = local40.substring(5);
					}
					if (local21 == 0) {
						local1++;
					}
					if ((local21 == 1 || local21 == 2) && (local21 == 1 || this.anInt843 == 0 || this.anInt843 == 1 && this.method693(local40))) {
						if (arg1 > local32 - 14 && arg1 <= local32 && !local40.equals(aClass1_Sub1_Sub2_Sub2_Sub1_1.aString5)) {
							if (this.anInt1003 >= 1) {
								this.aStringArray10[this.anInt931] = "Report abuse @whi@" + local40;
								this.anIntArray261[this.anInt931] = 953;
								this.anInt931++;
							}
							this.aStringArray10[this.anInt931] = "Add ignore @whi@" + local40;
							this.anIntArray261[this.anInt931] = 13;
							this.anInt931++;
							this.aStringArray10[this.anInt931] = "Add friend @whi@" + local40;
							this.anIntArray261[this.anInt931] = 217;
							this.anInt931++;
						}
						local1++;
					}
					if ((local21 == 3 || local21 == 7) && this.anInt862 == 0 && (local21 == 7 || this.anInt912 == 0 || this.anInt912 == 1 && this.method693(local40))) {
						if (arg1 > local32 - 14 && arg1 <= local32) {
							if (this.anInt1003 >= 1) {
								this.aStringArray10[this.anInt931] = "Report abuse @whi@" + local40;
								this.anIntArray261[this.anInt931] = 953;
								this.anInt931++;
							}
							this.aStringArray10[this.anInt931] = "Add ignore @whi@" + local40;
							this.anIntArray261[this.anInt931] = 13;
							this.anInt931++;
							this.aStringArray10[this.anInt931] = "Add friend @whi@" + local40;
							this.anIntArray261[this.anInt931] = 217;
							this.anInt931++;
						}
						local1++;
					}
					if (local21 == 4 && (this.anInt1022 == 0 || this.anInt1022 == 1 && this.method693(local40))) {
						if (arg1 > local32 - 14 && arg1 <= local32) {
							this.aStringArray10[this.anInt931] = "Accept trade @whi@" + local40;
							this.anIntArray261[this.anInt931] = 15;
							this.anInt931++;
						}
						local1++;
					}
					if ((local21 == 5 || local21 == 6) && this.anInt862 == 0 && this.anInt912 < 2) {
						local1++;
					}
					if (local21 == 8 && (this.anInt1022 == 0 || this.anInt1022 == 1 && this.method693(local40))) {
						if (arg1 > local32 - 14 && arg1 <= local32) {
							this.aStringArray10[this.anInt931] = "Accept challenge @whi@" + local40;
							this.anIntArray261[this.anInt931] = 84;
							this.anInt931++;
						}
						local1++;
					}
				}
			}
		} catch (@Pc(405) RuntimeException local405) {
			signlink.reporterror("12996, " + arg0 + ", " + 45905 + ", " + arg1 + ", " + local405.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method599() {
		try {
			if (this.anInt908 == 2) {
				for (@Pc(21) Class1_Sub2 local21 = (Class1_Sub2) this.aClass32_12.method336(); local21 != null; local21 = (Class1_Sub2) this.aClass32_12.method338()) {
					if (local21.anInt96 > 0) {
						local21.anInt96--;
					}
					if (local21.anInt96 != 0) {
						if (local21.anInt85 > 0) {
							local21.anInt85--;
						}
						if (local21.anInt85 == 0 && local21.anInt88 >= 1 && local21.anInt89 >= 1 && local21.anInt88 <= 102 && local21.anInt89 <= 102 && (local21.anInt93 < 0 || Class3.method10(local21.anInt95, local21.anInt93))) {
							this.method636(local21.anInt94, local21.anInt93, local21.anInt86, local21.anInt95, local21.anInt89, this.aBoolean234, local21.anInt87, local21.anInt88);
							local21.anInt85 = -1;
							if (local21.anInt93 == local21.anInt90 && local21.anInt90 == -1) {
								local21.method544();
							} else if (local21.anInt93 == local21.anInt90 && local21.anInt94 == local21.anInt91 && local21.anInt95 == local21.anInt92) {
								local21.method544();
							}
						}
					} else if (local21.anInt90 < 0 || Class3.method10(local21.anInt92, local21.anInt90)) {
						this.method636(local21.anInt91, local21.anInt90, local21.anInt86, local21.anInt92, local21.anInt89, this.aBoolean234, local21.anInt87, local21.anInt88);
						local21.method544();
					}
				}
			}
		} catch (@Pc(166) RuntimeException local166) {
			signlink.reporterror("98275, " + 2 + ", " + local166.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method600() {
		try {
			this.aClass1_Sub1_Sub1_Sub4_13 = new Class1_Sub1_Sub1_Sub4(this.aClass15_1, "titlebox", 0);
			this.aClass1_Sub1_Sub1_Sub4_14 = new Class1_Sub1_Sub1_Sub4(this.aClass15_1, "titlebutton", 0);
			this.aClass1_Sub1_Sub1_Sub4Array2 = new Class1_Sub1_Sub1_Sub4[12];
			@Pc(32) int local32 = 0;
			try {
				local32 = Integer.parseInt(this.getParameter("fl_icon"));
			} catch (@Pc(39) Exception local39) {
			}
			@Pc(43) int local43;
			if (local32 == 0) {
				for (local43 = 0; local43 < 12; local43++) {
					this.aClass1_Sub1_Sub1_Sub4Array2[local43] = new Class1_Sub1_Sub1_Sub4(this.aClass15_1, "runes", local43);
				}
			} else {
				for (local43 = 0; local43 < 12; local43++) {
					this.aClass1_Sub1_Sub1_Sub4Array2[local43] = new Class1_Sub1_Sub1_Sub4(this.aClass15_1, "runes", (local43 & 0x3) + 12);
				}
			}
			this.aClass1_Sub1_Sub1_Sub2_8 = new Class1_Sub1_Sub1_Sub2(128, 265);
			this.aClass1_Sub1_Sub1_Sub2_9 = new Class1_Sub1_Sub1_Sub2(128, 265);
			for (local43 = 0; local43 < 33920; local43++) {
				this.aClass1_Sub1_Sub1_Sub2_8.anIntArray24[local43] = this.aClass7_15.anIntArray22[local43];
			}
			for (@Pc(119) int local119 = 0; local119 < 33920; local119++) {
				this.aClass1_Sub1_Sub1_Sub2_9.anIntArray24[local119] = this.aClass7_16.anIntArray22[local119];
			}
			this.anIntArray256 = new int[256];
			for (@Pc(141) int local141 = 0; local141 < 64; local141++) {
				this.anIntArray256[local141] = local141 * 262144;
			}
			for (@Pc(156) int local156 = 0; local156 < 64; local156++) {
				this.anIntArray256[local156 + 64] = local156 * 1024 + 16711680;
			}
			for (@Pc(175) int local175 = 0; local175 < 64; local175++) {
				this.anIntArray256[local175 + 128] = local175 * 4 + 16776960;
			}
			for (@Pc(194) int local194 = 0; local194 < 64; local194++) {
				this.anIntArray256[local194 + 192] = 16777215;
			}
			this.anIntArray257 = new int[256];
			for (@Pc(213) int local213 = 0; local213 < 64; local213++) {
				this.anIntArray257[local213] = local213 * 1024;
			}
			for (@Pc(228) int local228 = 0; local228 < 64; local228++) {
				this.anIntArray257[local228 + 64] = local228 * 4 + 65280;
			}
			for (@Pc(247) int local247 = 0; local247 < 64; local247++) {
				this.anIntArray257[local247 + 128] = local247 * 262144 + 65535;
			}
			for (@Pc(266) int local266 = 0; local266 < 64; local266++) {
				this.anIntArray257[local266 + 192] = 16777215;
			}
			this.anIntArray258 = new int[256];
			for (@Pc(285) int local285 = 0; local285 < 64; local285++) {
				this.anIntArray258[local285] = local285 * 4;
			}
			for (@Pc(300) int local300 = 0; local300 < 64; local300++) {
				this.anIntArray258[local300 + 64] = local300 * 262144 + 255;
			}
			for (@Pc(319) int local319 = 0; local319 < 64; local319++) {
				this.anIntArray258[local319 + 128] = local319 * 1024 + 16711935;
			}
			for (@Pc(338) int local338 = 0; local338 < 64; local338++) {
				this.anIntArray258[local338 + 192] = 16777215;
			}
			this.anIntArray255 = new int[256];
			this.anIntArray272 = new int[32768];
			this.anIntArray273 = new int[32768];
			this.method647(null);
			this.anIntArray231 = new int[32768];
			this.anIntArray232 = new int[32768];
			this.method580("Connecting to fileserver", 10, (byte) 3);
			if (!this.aBoolean237) {
				this.aBoolean206 = true;
				this.aBoolean237 = true;
				this.method579(this, 2);
			}
		} catch (@Pc(395) RuntimeException local395) {
			signlink.reporterror("52689, " + -375 + ", " + local395.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!JHKSAGUC;II)V")
	private void method601(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			arg0.method248();
			@Pc(15) int local15 = arg0.method249((byte) 9, 8);
			@Pc(21) int local21;
			if (local15 < this.anInt986) {
				for (local21 = local15; local21 < this.anInt986; local21++) {
					this.anIntArray216[this.anInt848++] = this.anIntArray253[local21];
				}
			}
			if (local15 > this.anInt986) {
				signlink.reporterror(this.aString23 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt986 = 0;
			for (local21 = 0; local21 < local15; local21++) {
				@Pc(73) int local73 = this.anIntArray253[local21];
				@Pc(78) Class1_Sub1_Sub2_Sub2_Sub2 local78 = this.aClass1_Sub1_Sub2_Sub2_Sub2Array1[local73];
				@Pc(83) int local83 = arg0.method249((byte) 9, 1);
				if (local83 == 0) {
					this.anIntArray253[this.anInt986++] = local73;
					local78.anInt500 = anInt907;
				} else {
					@Pc(106) int local106 = arg0.method249((byte) 9, 2);
					if (local106 == 0) {
						this.anIntArray253[this.anInt986++] = local73;
						local78.anInt500 = anInt907;
						this.anIntArray230[this.anInt899++] = local73;
					} else {
						@Pc(157) int local157;
						@Pc(167) int local167;
						if (local106 == 1) {
							this.anIntArray253[this.anInt986++] = local73;
							local78.anInt500 = anInt907;
							local157 = arg0.method249((byte) 9, 3);
							local78.method324(local157, false);
							local167 = arg0.method249((byte) 9, 1);
							if (local167 == 1) {
								this.anIntArray230[this.anInt899++] = local73;
							}
						} else if (local106 == 2) {
							this.anIntArray253[this.anInt986++] = local73;
							local78.anInt500 = anInt907;
							local157 = arg0.method249((byte) 9, 3);
							local78.method324(local157, true);
							local167 = arg0.method249((byte) 9, 3);
							local78.method324(local167, true);
							@Pc(225) int local225 = arg0.method249((byte) 9, 1);
							if (local225 == 1) {
								this.anIntArray230[this.anInt899++] = local73;
							}
						} else if (local106 == 3) {
							this.anIntArray216[this.anInt848++] = local73;
						}
					}
				}
			}
		} catch (@Pc(262) RuntimeException local262) {
			signlink.reporterror("30098, " + arg0 + ", " + arg1 + ", " + 8 + ", " + local262.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	@Override
	public void method579(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}
		if (signlink.mainapp == null) {
			super.method579(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method602() {
		try {
			this.aClass7_22.method92();
			@Pc(27) int local27;
			@Pc(29) int local29;
			if (this.anInt929 == 2) {
				@Pc(22) byte[] local22 = this.aClass1_Sub1_Sub1_Sub4_19.aByteArray20;
				@Pc(24) int[] local24 = Class1_Sub1_Sub1.anIntArray206;
				local27 = local22.length;
				for (local29 = 0; local29 < local27; local29++) {
					if (local22[local29] == 0) {
						local24[local29] = 0;
					}
				}
				this.aClass1_Sub1_Sub1_Sub2_5.method127(25, this.anIntArray212, 33, 0, 25, 256, this.anIntArray236, 33, 0, this.anInt1005);
				this.aClass7_23.method92();
			} else {
				@Pc(73) int local73 = this.anInt1005 + this.anInt1016 & 0x7FF;
				@Pc(80) int local80 = aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt497 / 32 + 48;
				local27 = 464 - aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt498 / 32;
				this.aClass1_Sub1_Sub1_Sub2_16.method127(local80, this.anIntArray266, 151, 5, local27, this.anInt1031 + 256, this.anIntArray237, 146, 25, local73);
				this.aClass1_Sub1_Sub1_Sub2_5.method127(25, this.anIntArray212, 33, 0, 25, 256, this.anIntArray236, 33, 0, this.anInt1005);
				for (local29 = 0; local29 < this.anInt877; local29++) {
					local80 = this.anIntArray226[local29] * 4 + 2 - aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt497 / 32;
					local27 = this.anIntArray227[local29] * 4 + 2 - aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt498 / 32;
					this.method656(local80, this.aClass1_Sub1_Sub1_Sub2Array5[local29], local27);
				}
				@Pc(175) int local175;
				for (@Pc(171) int local171 = 0; local171 < 104; local171++) {
					for (local175 = 0; local175 < 104; local175++) {
						@Pc(187) Class32 local187 = this.aClass32ArrayArrayArray1[this.anInt850][local171][local175];
						if (local187 != null) {
							local80 = local171 * 4 + 2 - aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt497 / 32;
							local27 = local175 * 4 + 2 - aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt498 / 32;
							this.method656(local80, this.aClass1_Sub1_Sub1_Sub2_10, local27);
						}
					}
				}
				for (local175 = 0; local175 < this.anInt986; local175++) {
					@Pc(238) Class1_Sub1_Sub2_Sub2_Sub2 local238 = this.aClass1_Sub1_Sub2_Sub2_Sub2Array1[this.anIntArray253[local175]];
					if (local238 != null && local238.method323()) {
						@Pc(247) Class39 local247 = local238.aClass39_2;
						if (local247.anIntArray114 != null) {
							local247 = local247.method405();
						}
						if (local247 != null && local247.aBoolean123 && local247.aBoolean124) {
							local80 = local238.anInt497 / 32 - aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt497 / 32;
							local27 = local238.anInt498 / 32 - aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt498 / 32;
							this.method656(local80, this.aClass1_Sub1_Sub1_Sub2_11, local27);
						}
					}
				}
				@Pc(306) Class1_Sub1_Sub2_Sub2_Sub1 local306;
				for (@Pc(296) int local296 = 0; local296 < this.anInt898; local296++) {
					local306 = this.aClass1_Sub1_Sub2_Sub2_Sub1Array1[this.anIntArray229[local296]];
					if (local306 != null && local306.method323()) {
						local80 = local306.anInt497 / 32 - aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt497 / 32;
						local27 = local306.anInt498 / 32 - aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt498 / 32;
						@Pc(334) boolean local334 = false;
						@Pc(338) long local338 = Class49.method538(local306.aString5);
						for (@Pc(340) int local340 = 0; local340 < this.anInt919; local340++) {
							if (local338 == this.aLongArray4[local340] && this.anIntArray267[local340] != 0) {
								local334 = true;
								break;
							}
						}
						@Pc(365) boolean local365 = false;
						if (aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt254 != 0 && local306.anInt254 != 0 && aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt254 == local306.anInt254) {
							local365 = true;
						}
						if (local334) {
							this.method656(local80, this.aClass1_Sub1_Sub1_Sub2_13, local27);
						} else if (local365) {
							this.method656(local80, this.aClass1_Sub1_Sub1_Sub2_14, local27);
						} else {
							this.method656(local80, this.aClass1_Sub1_Sub1_Sub2_12, local27);
						}
					}
				}
				if (this.anInt846 != 0 && anInt907 % 20 < 10) {
					if (this.anInt846 == 1 && this.anInt955 >= 0 && this.anInt955 < this.aClass1_Sub1_Sub2_Sub2_Sub2Array1.length) {
						@Pc(439) Class1_Sub1_Sub2_Sub2_Sub2 local439 = this.aClass1_Sub1_Sub2_Sub2_Sub2Array1[this.anInt955];
						if (local439 != null) {
							local80 = local439.anInt497 / 32 - aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt497 / 32;
							local27 = local439.anInt498 / 32 - aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt498 / 32;
							this.method695(local27, local80, this.aClass1_Sub1_Sub1_Sub2_4);
						}
					}
					if (this.anInt846 == 2) {
						local80 = (this.anInt1047 - this.anInt1043) * 4 + 2 - aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt497 / 32;
						local27 = (this.anInt1048 - this.anInt1044) * 4 + 2 - aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt498 / 32;
						this.method695(local27, local80, this.aClass1_Sub1_Sub1_Sub2_4);
					}
					if (this.anInt846 == 10 && this.anInt992 >= 0 && this.anInt992 < this.aClass1_Sub1_Sub2_Sub2_Sub1Array1.length) {
						local306 = this.aClass1_Sub1_Sub2_Sub2_Sub1Array1[this.anInt992];
						if (local306 != null) {
							local80 = local306.anInt497 / 32 - aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt497 / 32;
							local27 = local306.anInt498 / 32 - aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt498 / 32;
							this.method695(local27, local80, this.aClass1_Sub1_Sub1_Sub2_4);
						}
					}
				}
				if (this.anInt1009 != 0) {
					local80 = this.anInt1009 * 4 + 2 - aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt497 / 32;
					local27 = this.anInt1010 * 4 + 2 - aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt498 / 32;
					this.method656(local80, this.aClass1_Sub1_Sub1_Sub2_3, local27);
				}
				Class1_Sub1_Sub1.method551(3, 3, 78, 16777215, 97);
				this.aClass7_23.method92();
			}
		} catch (@Pc(604) RuntimeException local604) {
			signlink.reporterror("75090, " + 44975 + ", " + local604.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBII)I")
	private int method603(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = 256 - arg2;
			return ((arg1 & 0xFF00FF) * local3 + (arg0 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg1 & 0xFF00) * local3 + (arg0 & 0xFF00) * arg2 & 0xFF0000) >> 8;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("61044, " + arg0 + ", " + -45 + ", " + arg1 + ", " + arg2 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!JHKSAGUC;ILclient!FVFJZZXQ;)V")
	private void method604(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub1_Sub2_Sub2_Sub1 arg3) {
		try {
			@Pc(14) int local14;
			@Pc(17) int local17;
			@Pc(21) int local21;
			if ((arg2 & 0x20) != 0) {
				local14 = arg1.method240();
				local17 = arg1.method238();
				local21 = arg1.method258();
				@Pc(24) int local24 = arg1.anInt352;
				if (arg3.aString5 != null && arg3.aBoolean55) {
					@Pc(34) long local34 = Class49.method538(arg3.aString5);
					@Pc(36) boolean local36 = false;
					if (local17 <= 1) {
						for (@Pc(41) int local41 = 0; local41 < this.anInt969; local41++) {
							if (this.aLongArray3[local41] == local34) {
								local36 = true;
								break;
							}
						}
					}
					if (!local36 && this.anInt943 == 0) {
						try {
							this.aClass1_Sub1_Sub3_9.anInt352 = 0;
							arg1.method275(local21, this.aClass1_Sub1_Sub3_9.aByteArray3);
							this.aClass1_Sub1_Sub3_9.anInt352 = 0;
							@Pc(86) String local86 = Class18.method221(local21, this.aClass1_Sub1_Sub3_9);
							@Pc(90) String local90 = Class14.method179(861, local86);
							arg3.aString8 = local90;
							arg3.anInt504 = local14 >> 8;
							arg3.anInt495 = local14 & 0xFF;
							arg3.anInt501 = 150;
							if (local17 == 2 || local17 == 3) {
								this.method630(1, local90, "@cr2@" + arg3.aString5, (byte) 4);
							} else if (local17 == 1) {
								this.method630(1, local90, "@cr1@" + arg3.aString5, (byte) 4);
							} else {
								this.method630(2, local90, arg3.aString5, (byte) 4);
							}
						} catch (@Pc(154) Exception local154) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg1.anInt352 = local24 + local21;
			}
			if ((arg2 & 0x4) != 0) {
				local14 = arg1.method257();
				@Pc(173) byte[] local173 = new byte[local14];
				@Pc(179) Class1_Sub1_Sub3 local179 = new Class1_Sub1_Sub3(local173, 8);
				arg1.method275(local14, local173);
				this.aClass1_Sub1_Sub3Array1[arg0] = local179;
				arg3.method166(local179);
			}
			if ((arg2 & 0x1) != 0) {
				arg3.anInt488 = arg1.method240();
				arg3.anInt489 = arg1.method240();
			}
			if ((arg2 & 0x2) != 0) {
				local14 = arg1.method240();
				if (local14 == 65535) {
					local14 = -1;
				}
				local17 = arg1.method259();
				if (local14 == arg3.anInt510 && local14 != -1) {
					local21 = Class23.aClass23Array1[local14].anInt395;
					if (local21 == 1) {
						arg3.anInt511 = 0;
						arg3.anInt512 = 0;
						arg3.anInt513 = local17;
						arg3.anInt514 = 0;
					}
					if (local21 == 2) {
						arg3.anInt514 = 0;
					}
				} else if (local14 == -1 || arg3.anInt510 == -1 || Class23.aClass23Array1[local14].anInt389 >= Class23.aClass23Array1[arg3.anInt510].anInt389) {
					arg3.anInt510 = local14;
					arg3.anInt511 = 0;
					arg3.anInt512 = 0;
					arg3.anInt513 = local17;
					arg3.anInt514 = 0;
					arg3.anInt493 = arg3.anInt483;
				}
			}
			if ((arg2 & 0x400) != 0) {
				arg3.anInt476 = arg1.method258();
				arg3.anInt478 = arg1.method259();
				arg3.anInt477 = arg1.method258();
				arg3.anInt479 = arg1.method257();
				arg3.anInt480 = arg1.method268() + anInt907;
				arg3.anInt481 = arg1.method240() + anInt907;
				arg3.anInt482 = arg1.method258();
				arg3.method326(900);
			}
			if ((arg2 & 0x100) != 0) {
				arg3.anInt470 = arg1.method240();
				local14 = arg1.method243();
				arg3.anInt474 = local14 >> 16;
				arg3.anInt473 = anInt907 + (local14 & 0xFFFF);
				arg3.anInt471 = 0;
				arg3.anInt472 = 0;
				if (arg3.anInt473 > anInt907) {
					arg3.anInt471 = -1;
				}
				if (arg3.anInt470 == 65535) {
					arg3.anInt470 = -1;
				}
			}
			if ((arg2 & 0x200) != 0) {
				local14 = arg1.method259();
				local17 = arg1.method259();
				arg3.method327(local14, local17, anInt907);
				arg3.anInt507 = anInt907 + 300;
				arg3.anInt508 = arg1.method258();
				arg3.anInt509 = arg1.method257();
			}
			if ((arg2 & 0x8) != 0) {
				arg3.anInt505 = arg1.method266();
				if (arg3.anInt505 == 65535) {
					arg3.anInt505 = -1;
				}
			}
			if ((arg2 & 0x80) != 0) {
				local14 = arg1.method238();
				local17 = arg1.method258();
				arg3.method327(local14, local17, anInt907);
				arg3.anInt507 = anInt907 + 300;
				arg3.anInt508 = arg1.method258();
				arg3.anInt509 = arg1.method238();
			}
			if ((arg2 & 0x40) != 0) {
				arg3.aString8 = arg1.method245();
				if (arg3.aString8.charAt(0) == '~') {
					arg3.aString8 = arg3.aString8.substring(1);
					this.method630(2, arg3.aString8, arg3.aString5, (byte) 4);
				} else if (arg3 == aClass1_Sub1_Sub2_Sub2_Sub1_1) {
					this.method630(2, arg3.aString8, arg3.aString5, (byte) 4);
				}
				arg3.anInt504 = 0;
				arg3.anInt495 = 0;
				arg3.anInt501 = 150;
			}
		} catch (@Pc(513) RuntimeException local513) {
			signlink.reporterror("96410, " + -28163 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local513.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method605() {
		try {
			this.aClass7_21.method92();
			this.aBoolean215 &= true;
			Class1_Sub1_Sub1_Sub1.anIntArray16 = this.anIntArray222;
			this.aClass1_Sub1_Sub1_Sub4_18.method563(0, 0);
			if (this.anInt906 != -1) {
				this.method704(0, Class43.aClass43Array1[this.anInt906], 0, 0);
			} else if (this.anIntArray249[this.anInt967] != -1) {
				this.method704(0, Class43.aClass43Array1[this.anIntArray249[this.anInt967]], 0, 0);
			}
			if (this.aBoolean217 && this.anInt865 == 1) {
				this.method611();
			}
			this.aClass7_21.method93(super.aGraphics2, 205, 553);
			this.aClass7_23.method92();
			Class1_Sub1_Sub1_Sub1.anIntArray16 = this.anIntArray223;
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("39347, " + true + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method606(@OriginalArg(1) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass1_Sub1_Sub1_Sub2_16.anIntArray24;
			this.anInt887 += 0;
			@Pc(14) int local14 = local5.length;
			for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
				local5[local16] = 0;
			}
			@Pc(40) int local40;
			@Pc(42) int local42;
			for (@Pc(28) int local28 = 1; local28 < 103; local28++) {
				local40 = (103 - local28) * 512 * 4 + 24628;
				for (local42 = 1; local42 < 103; local42++) {
					if ((this.aByteArrayArrayArray8[arg0][local42][local28] & 0x18) == 0) {
						this.aClass45_1.method500(local5, local40, arg0, local42, local28);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local42][local28] & 0x8) != 0) {
						this.aClass45_1.method500(local5, local40, arg0 + 1, local42, local28);
					}
					local40 += 4;
				}
			}
			local40 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local42 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass1_Sub1_Sub1_Sub2_16.method118();
			@Pc(152) int local152;
			for (@Pc(148) int local148 = 1; local148 < 103; local148++) {
				for (local152 = 1; local152 < 103; local152++) {
					if ((this.aByteArrayArrayArray8[arg0][local152][local148] & 0x18) == 0) {
						this.method654(local148, local152, arg0, local40, local42);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local152][local148] & 0x8) != 0) {
						this.method654(local148, local152, arg0 + 1, local40, local42);
					}
				}
			}
			this.aClass7_23.method92();
			this.anInt877 = 0;
			for (local152 = 0; local152 < 104; local152++) {
				for (@Pc(220) int local220 = 0; local220 < 104; local220++) {
					@Pc(230) int local230 = this.aClass45_1.method494(this.anInt850, local152, local220);
					if (local230 != 0) {
						local230 = local230 >> 14 & 0x7FFF;
						@Pc(242) int local242 = Class41.method452(local230).anInt642;
						if (local242 >= 0) {
							@Pc(246) int local246 = local152;
							@Pc(248) int local248 = local220;
							if (local242 != 22 && local242 != 29 && local242 != 34 && local242 != 36 && local242 != 46 && local242 != 47 && local242 != 48) {
								@Pc(280) int[][] local280 = this.aClass20Array1[this.anInt850].anIntArrayArray7;
								for (@Pc(282) int local282 = 0; local282 < 10; local282++) {
									@Pc(289) int local289 = (int) (Math.random() * 4.0D);
									if (local289 == 0 && local246 > 0 && local246 > local152 - 3 && (local280[local246 - 1][local248] & 0x1280108) == 0) {
										local246--;
									}
									if (local289 == 1 && local246 < 103 && local246 < local152 + 3 && (local280[local246 + 1][local248] & 0x1280180) == 0) {
										local246++;
									}
									if (local289 == 2 && local248 > 0 && local248 > local220 - 3 && (local280[local246][local248 - 1] & 0x1280102) == 0) {
										local248--;
									}
									if (local289 == 3 && local248 < 103 && local248 < local220 + 3 && (local280[local246][local248 + 1] & 0x1280120) == 0) {
										local248++;
									}
								}
							}
							this.aClass1_Sub1_Sub1_Sub2Array5[this.anInt877] = this.aClass1_Sub1_Sub1_Sub2Array4[local242];
							this.anIntArray226[this.anInt877] = local246;
							this.anIntArray227[this.anInt877] = local248;
							this.anInt877++;
						}
					}
				}
			}
		} catch (@Pc(419) RuntimeException local419) {
			signlink.reporterror("89935, " + 0 + ", " + arg0 + ", " + local419.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method607(@OriginalArg(1) int arg0) {
		try {
			this.anInt887 += 0;
			if (!aBoolean226) {
				@Pc(18) Class1_Sub1_Sub1_Sub4 local18;
				@Pc(26) int local26;
				@Pc(34) int local34;
				@Pc(37) byte[] local37;
				@Pc(40) byte[] local40;
				@Pc(42) int local42;
				if (Class1_Sub1_Sub1_Sub1.anIntArray18[17] >= arg0) {
					local18 = Class1_Sub1_Sub1_Sub1.aClass1_Sub1_Sub1_Sub4Array1[17];
					local26 = local18.anInt810 * local18.anInt811 - 1;
					local34 = local18.anInt810 * this.anInt840 * 2;
					local37 = local18.aByteArray20;
					local40 = this.aByteArray21;
					for (local42 = 0; local42 <= local26; local42++) {
						local40[local42] = local37[local42 - local34 & local26];
					}
					local18.aByteArray20 = local40;
					this.aByteArray21 = local37;
					Class1_Sub1_Sub1_Sub1.method62(17);
					anInt1015++;
					if (anInt1015 > 132) {
						anInt1015 = 0;
						this.aClass1_Sub1_Sub3_6.method227(60);
						this.aClass1_Sub1_Sub3_6.method228(4);
					}
				}
				if (Class1_Sub1_Sub1_Sub1.anIntArray18[24] >= arg0) {
					local18 = Class1_Sub1_Sub1_Sub1.aClass1_Sub1_Sub1_Sub4Array1[24];
					local26 = local18.anInt810 * local18.anInt811 - 1;
					local34 = local18.anInt810 * this.anInt840 * 2;
					local37 = local18.aByteArray20;
					local40 = this.aByteArray21;
					for (local42 = 0; local42 <= local26; local42++) {
						local40[local42] = local37[local42 - local34 & local26];
					}
					local18.aByteArray20 = local40;
					this.aByteArray21 = local37;
					Class1_Sub1_Sub1_Sub1.method62(24);
				}
				if (Class1_Sub1_Sub1_Sub1.anIntArray18[34] >= arg0) {
					local18 = Class1_Sub1_Sub1_Sub1.aClass1_Sub1_Sub1_Sub4Array1[34];
					local26 = local18.anInt810 * local18.anInt811 - 1;
					local34 = local18.anInt810 * this.anInt840 * 2;
					local37 = local18.aByteArray20;
					local40 = this.aByteArray21;
					for (local42 = 0; local42 <= local26; local42++) {
						local40[local42] = local37[local42 - local34 & local26];
					}
					local18.aByteArray20 = local40;
					this.aByteArray21 = local37;
					Class1_Sub1_Sub1_Sub1.method62(34);
					return;
				}
			}
		} catch (@Pc(203) RuntimeException local203) {
			signlink.reporterror("32405, " + 0 + ", " + arg0 + ", " + local203.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method608() {
		try {
			signlink.anInt1061 = 0;
			signlink.midi = "stop";
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("93254, " + 2 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method610() {
		try {
			if (this.aClass7_24 == null) {
				this.method697();
				super.aClass7_2 = null;
				this.aClass7_12 = null;
				this.aClass7_13 = null;
				this.aClass7_14 = null;
				this.aClass7_15 = null;
				this.aClass7_16 = null;
				this.aClass7_17 = null;
				this.aClass7_18 = null;
				this.aClass7_19 = null;
				this.aClass7_20 = null;
				this.aClass7_24 = new Class7(479, this.method578(aByte61), 96, 912);
				this.aClass7_22 = new Class7(172, this.method578(aByte61), 156, 912);
				Class1_Sub1_Sub1.method549(this.aBoolean204);
				this.aClass1_Sub1_Sub1_Sub4_19.method563(0, 0);
				this.aClass7_21 = new Class7(190, this.method578(aByte61), 261, 912);
				this.aClass7_23 = new Class7(512, this.method578(aByte61), 334, 912);
				Class1_Sub1_Sub1.method549(this.aBoolean204);
				this.aClass7_25 = new Class7(496, this.method578(aByte61), 50, 912);
				this.aClass7_26 = new Class7(269, this.method578(aByte61), 37, 912);
				this.aClass7_27 = new Class7(249, this.method578(aByte61), 45, 912);
				this.aBoolean233 = true;
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("18020, " + -26 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method611() {
		try {
			@Pc(4) int local4 = this.anInt866;
			@Pc(7) int local7 = this.anInt867;
			@Pc(10) int local10 = this.anInt868;
			@Pc(13) int local13 = this.anInt869;
			Class1_Sub1_Sub1.method551(local13, local10, local7, 6116423, local4);
			Class1_Sub1_Sub1.method551(16, local10 - 2, local7 + 1, 0, local4 + 1);
			Class1_Sub1_Sub1.method552(local13 - 19, local4 + 1, local10 - 2, 0, local7 + 18);
			this.aClass1_Sub1_Sub1_Sub3_4.method383(6116423, (byte) 2, "Choose Option", local4 + 3, local7 + 14);
			@Pc(72) int local72 = super.anInt828;
			@Pc(75) int local75 = super.anInt829;
			if (this.anInt865 == 0) {
				local72 -= 4;
				local75 -= 4;
			}
			if (this.anInt865 == 1) {
				local72 -= 553;
				local75 -= 205;
			}
			if (this.anInt865 == 2) {
				local72 -= 17;
				local75 -= 357;
			}
			for (@Pc(94) int local94 = 0; local94 < this.anInt931; local94++) {
				@Pc(109) int local109 = local7 + (this.anInt931 - 1 - local94) * 15 + 31;
				@Pc(111) int local111 = 16777215;
				if (local72 > local4 && local72 < local4 + local10 && local75 > local109 - 13 && local75 < local109 + 3) {
					local111 = 16776960;
				}
				this.aClass1_Sub1_Sub1_Sub3_4.method387(this.aStringArray10[local94], true, local4 + 3, local111, local109);
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("93120, " + 0 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method612() {
		try {
			this.aBoolean215 &= true;
			@Pc(17) int local17;
			@Pc(24) int local24;
			if (this.anInt1014 == 0) {
				local17 = super.anInt824 / 2 - 80;
				local24 = super.anInt825 / 2 + 20;
				local24 += 20;
				if (super.anInt833 == 1 && super.anInt834 >= local17 - 75 && super.anInt834 <= local17 + 75 && super.anInt835 >= local24 - 20 && super.anInt835 <= local24 + 20) {
					this.anInt1014 = 3;
					this.anInt1002 = 0;
				}
				local17 = super.anInt824 / 2 + 80;
				if (super.anInt833 == 1 && super.anInt834 >= local17 - 75 && super.anInt834 <= local17 + 75 && super.anInt835 >= local24 - 20 && super.anInt835 <= local24 + 20) {
					this.aString19 = "";
					this.aString20 = "Enter your username & password.";
					this.anInt1014 = 2;
					this.anInt1002 = 0;
				}
			} else if (this.anInt1014 == 2) {
				local17 = super.anInt825 / 2 - 40;
				local17 += 30;
				local17 += 25;
				if (super.anInt833 == 1 && super.anInt835 >= local17 - 15 && super.anInt835 < local17) {
					this.anInt1002 = 0;
				}
				local17 += 15;
				if (super.anInt833 == 1 && super.anInt835 >= local17 - 15 && super.anInt835 < local17) {
					this.anInt1002 = 1;
				}
				local17 += 15;
				local24 = super.anInt824 / 2 - 80;
				@Pc(170) int local170 = super.anInt825 / 2 + 50;
				@Pc(171) int local171 = local170 + 20;
				if (super.anInt833 == 1 && super.anInt834 >= local24 - 75 && super.anInt834 <= local24 + 75 && super.anInt835 >= local171 - 20 && super.anInt835 <= local171 + 20) {
					this.anInt974 = 0;
					this.method706(this.aString23, this.aString24, false);
					if (this.aBoolean215) {
						return;
					}
				}
				local24 = super.anInt824 / 2 + 80;
				if (super.anInt833 == 1 && super.anInt834 >= local24 - 75 && super.anInt834 <= local24 + 75 && super.anInt835 >= local171 - 20 && super.anInt835 <= local171 + 20) {
					this.anInt1014 = 0;
					this.aString23 = "";
					this.aString24 = "";
				}
				while (true) {
					while (true) {
						@Pc(261) int local261 = this.method572();
						if (local261 == -1) {
							return;
						}
						@Pc(266) boolean local266 = false;
						for (@Pc(268) int local268 = 0; local268 < aString25.length(); local268++) {
							if (local261 == aString25.charAt(local268)) {
								local266 = true;
								break;
							}
						}
						if (this.anInt1002 == 0) {
							if (local261 == 8 && this.aString23.length() > 0) {
								this.aString23 = this.aString23.substring(0, this.aString23.length() - 1);
							}
							if (local261 == 9 || local261 == 10 || local261 == 13) {
								this.anInt1002 = 1;
							}
							if (local266) {
								this.aString23 = this.aString23 + (char) local261;
							}
							if (this.aString23.length() > 12) {
								this.aString23 = this.aString23.substring(0, 12);
							}
						} else if (this.anInt1002 == 1) {
							if (local261 == 8 && this.aString24.length() > 0) {
								this.aString24 = this.aString24.substring(0, this.aString24.length() - 1);
							}
							if (local261 == 9 || local261 == 10 || local261 == 13) {
								this.anInt1002 = 0;
							}
							if (local266) {
								this.aString24 = this.aString24 + (char) local261;
							}
							if (this.aString24.length() > 20) {
								this.aString24 = this.aString24.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt1014 == 3) {
				local17 = super.anInt824 / 2;
				local24 = super.anInt825 / 2 + 50;
				@Pc(425) int local425 = local24 + 20;
				if (super.anInt833 == 1 && super.anInt834 >= local17 - 75 && super.anInt834 <= local17 + 75 && super.anInt835 >= local425 - 20 && super.anInt835 <= local425 + 20) {
					this.anInt1014 = 0;
					return;
				}
			}
		} catch (@Pc(458) RuntimeException local458) {
			signlink.reporterror("30582, " + true + ", " + local458.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method613(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean230) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.method662(43595);
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!TNOPEJNZ;ZIII)V")
	private void method614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class43 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg2.anInt708 == 0 && arg2.anIntArray178 != null && !arg2.aBoolean146 && (arg1 >= arg3 && arg4 >= arg5 && arg1 <= arg3 + arg2.anInt699 && arg4 <= arg5 + arg2.anInt707)) {
				@Pc(34) int local34 = arg2.anIntArray178.length;
				this.aBoolean215 &= true;
				for (@Pc(42) int local42 = 0; local42 < local34; local42++) {
					@Pc(51) int local51 = arg2.anIntArray176[local42] + arg3;
					@Pc(60) int local60 = arg2.anIntArray179[local42] + arg5 - arg0;
					@Pc(67) Class43 local67 = Class43.aClass43Array1[arg2.anIntArray178[local42]];
					@Pc(72) int local72 = local51 + local67.anInt702;
					@Pc(77) int local77 = local60 + local67.anInt716;
					if ((local67.anInt718 >= 0 || local67.anInt692 != 0) && arg1 >= local72 && arg4 >= local77 && arg1 < local72 + local67.anInt699 && arg4 < local77 + local67.anInt707) {
						if (local67.anInt718 >= 0) {
							this.anInt941 = local67.anInt718;
						} else {
							this.anInt941 = local67.anInt694;
						}
					}
					if (local67.anInt708 == 0) {
						this.method614(local67.anInt720, arg1, local67, local72, arg4, local77);
						if (local67.anInt701 > local67.anInt707) {
							this.method699(true, local67.anInt707, local67.anInt701, local72 + local67.anInt699, arg1, local67, arg4, local77);
						}
					} else {
						if (local67.anInt711 == 1 && arg1 >= local72 && arg4 >= local77 && arg1 < local72 + local67.anInt699 && arg4 < local77 + local67.anInt707) {
							@Pc(174) boolean local174 = false;
							if (local67.anInt712 != 0) {
								local174 = this.method581(local67);
							}
							if (!local174) {
								this.aStringArray10[this.anInt931] = local67.aString11;
								this.anIntArray261[this.anInt931] = 640;
								this.anIntArray260[this.anInt931] = local67.anInt694;
								this.anInt931++;
							}
						}
						if (local67.anInt711 == 2 && this.anInt900 == 0 && arg1 >= local72 && arg4 >= local77 && arg1 < local72 + local67.anInt699 && arg4 < local77 + local67.anInt707) {
							@Pc(238) String local238 = local67.aString12;
							if (local238.indexOf(" ") != -1) {
								local238 = local238.substring(0, local238.indexOf(" "));
							}
							this.aStringArray10[this.anInt931] = local238 + " @gre@" + local67.aString14;
							this.anIntArray261[this.anInt931] = 877;
							this.anIntArray260[this.anInt931] = local67.anInt694;
							this.anInt931++;
						}
						if (local67.anInt711 == 3 && arg1 >= local72 && arg4 >= local77 && arg1 < local72 + local67.anInt699 && arg4 < local77 + local67.anInt707) {
							this.aStringArray10[this.anInt931] = "Close";
							this.anIntArray261[this.anInt931] = 590;
							this.anIntArray260[this.anInt931] = local67.anInt694;
							this.anInt931++;
						}
						if (local67.anInt711 == 4 && arg1 >= local72 && arg4 >= local77 && arg1 < local72 + local67.anInt699 && arg4 < local77 + local67.anInt707) {
							this.aStringArray10[this.anInt931] = local67.aString11;
							this.anIntArray261[this.anInt931] = 450;
							this.anIntArray260[this.anInt931] = local67.anInt694;
							this.anInt931++;
						}
						if (local67.anInt711 == 5 && arg1 >= local72 && arg4 >= local77 && arg1 < local72 + local67.anInt699 && arg4 < local77 + local67.anInt707) {
							this.aStringArray10[this.anInt931] = local67.aString11;
							this.anIntArray261[this.anInt931] = 46;
							this.anIntArray260[this.anInt931] = local67.anInt694;
							this.anInt931++;
						}
						if (local67.anInt711 == 6 && !this.aBoolean198 && arg1 >= local72 && arg4 >= local77 && arg1 < local72 + local67.anInt699 && arg4 < local77 + local67.anInt707) {
							this.aStringArray10[this.anInt931] = local67.aString11;
							this.anIntArray261[this.anInt931] = 924;
							this.anIntArray260[this.anInt931] = local67.anInt694;
							this.anInt931++;
						}
						if (local67.anInt708 == 2) {
							@Pc(486) int local486 = 0;
							for (@Pc(488) int local488 = 0; local488 < local67.anInt707; local488++) {
								for (@Pc(492) int local492 = 0; local492 < local67.anInt699; local492++) {
									@Pc(503) int local503 = local72 + local492 * (local67.anInt696 + 32);
									@Pc(512) int local512 = local77 + local488 * (local67.anInt717 + 32);
									if (local486 < 20) {
										local503 += local67.anIntArray172[local486];
										local512 += local67.anIntArray180[local486];
									}
									if (arg1 >= local503 && arg4 >= local512 && arg1 < local503 + 32 && arg4 < local512 + 32) {
										this.anInt926 = local486;
										this.anInt927 = local67.anInt694;
										if (local67.anIntArray177[local486] > 0) {
											@Pc(565) Class27 local565 = Class27.method308(local67.anIntArray177[local486] - 1);
											if (this.anInt1018 == 1 && local67.aBoolean147) {
												if (local67.anInt694 != this.anInt1020 || local486 != this.anInt1019) {
													this.aStringArray10[this.anInt931] = "Use " + this.aString28 + " with @lre@" + local565.aString6;
													this.anIntArray261[this.anInt931] = 571;
													this.anIntArray262[this.anInt931] = local565.anInt451;
													this.anIntArray259[this.anInt931] = local486;
													this.anIntArray260[this.anInt931] = local67.anInt694;
													this.anInt931++;
												}
											} else if (this.anInt900 != 1 || !local67.aBoolean147) {
												@Pc(702) int local702;
												if (local67.aBoolean147) {
													for (local702 = 4; local702 >= 3; local702--) {
														if (local565.aStringArray4 != null && local565.aStringArray4[local702] != null) {
															this.aStringArray10[this.anInt931] = local565.aStringArray4[local702] + " @lre@" + local565.aString6;
															if (local702 == 3) {
																this.anIntArray261[this.anInt931] = 863;
															}
															if (local702 == 4) {
																this.anIntArray261[this.anInt931] = 196;
															}
															this.anIntArray262[this.anInt931] = local565.anInt451;
															this.anIntArray259[this.anInt931] = local486;
															this.anIntArray260[this.anInt931] = local67.anInt694;
															this.anInt931++;
														} else if (local702 == 4) {
															this.aStringArray10[this.anInt931] = "Drop @lre@" + local565.aString6;
															this.anIntArray261[this.anInt931] = 196;
															this.anIntArray262[this.anInt931] = local565.anInt451;
															this.anIntArray259[this.anInt931] = local486;
															this.anIntArray260[this.anInt931] = local67.anInt694;
															this.anInt931++;
														}
													}
												}
												if (local67.aBoolean153) {
													this.aStringArray10[this.anInt931] = "Use @lre@" + local565.aString6;
													this.anIntArray261[this.anInt931] = 146;
													this.anIntArray262[this.anInt931] = local565.anInt451;
													this.anIntArray259[this.anInt931] = local486;
													this.anIntArray260[this.anInt931] = local67.anInt694;
													this.anInt931++;
												}
												if (local67.aBoolean147 && local565.aStringArray4 != null) {
													for (local702 = 2; local702 >= 0; local702--) {
														if (local565.aStringArray4[local702] != null) {
															this.aStringArray10[this.anInt931] = local565.aStringArray4[local702] + " @lre@" + local565.aString6;
															if (local702 == 0) {
																this.anIntArray261[this.anInt931] = 723;
															}
															if (local702 == 1) {
																this.anIntArray261[this.anInt931] = 22;
															}
															if (local702 == 2) {
																this.anIntArray261[this.anInt931] = 300;
															}
															this.anIntArray262[this.anInt931] = local565.anInt451;
															this.anIntArray259[this.anInt931] = local486;
															this.anIntArray260[this.anInt931] = local67.anInt694;
															this.anInt931++;
														}
													}
												}
												if (local67.aStringArray7 != null) {
													for (local702 = 4; local702 >= 0; local702--) {
														if (local67.aStringArray7[local702] != null) {
															this.aStringArray10[this.anInt931] = local67.aStringArray7[local702] + " @lre@" + local565.aString6;
															if (local702 == 0) {
																this.anIntArray261[this.anInt931] = 3;
															}
															if (local702 == 1) {
																this.anIntArray261[this.anInt931] = 743;
															}
															if (local702 == 2) {
																this.anIntArray261[this.anInt931] = 705;
															}
															if (local702 == 3) {
																this.anIntArray261[this.anInt931] = 947;
															}
															if (local702 == 4) {
																this.anIntArray261[this.anInt931] = 760;
															}
															this.anIntArray262[this.anInt931] = local565.anInt451;
															this.anIntArray259[this.anInt931] = local486;
															this.anIntArray260[this.anInt931] = local67.anInt694;
															this.anInt931++;
														}
													}
												}
												this.aStringArray10[this.anInt931] = "Examine @lre@" + local565.aString6;
												this.anIntArray261[this.anInt931] = 1752;
												this.anIntArray262[this.anInt931] = local565.anInt451;
												this.anIntArray259[this.anInt931] = local486;
												this.anIntArray260[this.anInt931] = local67.anInt694;
												this.anInt931++;
											} else if ((this.anInt902 & 0x10) == 16) {
												this.aStringArray10[this.anInt931] = this.aString21 + " @lre@" + local565.aString6;
												this.anIntArray261[this.anInt931] = 24;
												this.anIntArray262[this.anInt931] = local565.anInt451;
												this.anIntArray259[this.anInt931] = local486;
												this.anIntArray260[this.anInt931] = local67.anInt694;
												this.anInt931++;
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
			signlink.reporterror("22887, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local1132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method615(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			this.aBoolean205 = true;
			for (@Pc(16) int local16 = 0; local16 < 7; local16++) {
				this.anIntArray213[local16] = -1;
				for (@Pc(25) int local25 = 0; local25 < Class8.anInt121; local25++) {
					if (!Class8.aClass8Array1[local25].aBoolean43 && Class8.aClass8Array1[local25].anInt122 == local16 + (this.aBoolean231 ? 0 : 7)) {
						this.anIntArray213[local16] = local25;
						break;
					}
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("32193, " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method616() {
		try {
			if (this.anInt862 != 0) {
				@Pc(5) int local5 = 0;
				if (this.anInt1052 != 0) {
					local5 = 1;
				}
				for (@Pc(17) int local17 = 0; local17 < 100; local17++) {
					if (this.aStringArray12[local17] != null) {
						@Pc(29) int local29 = this.anIntArray268[local17];
						@Pc(34) String local34 = this.aStringArray11[local17];
						if (local34 != null && local34.startsWith("@cr1@")) {
							local34 = local34.substring(5);
						}
						if (local34 != null && local34.startsWith("@cr2@")) {
							local34 = local34.substring(5);
						}
						if ((local29 == 3 || local29 == 7) && (local29 == 7 || this.anInt912 == 0 || this.anInt912 == 1 && this.method693(local34))) {
							@Pc(87) int local87 = 329 - local5 * 13;
							if (super.anInt828 > 4 && super.anInt829 - 4 > local87 - 10 && super.anInt829 - 4 <= local87 + 3) {
								@Pc(127) int local127 = this.aClass1_Sub1_Sub1_Sub3_3.method381("From:  " + local34 + this.aStringArray12[local17], this.anInt876) + 25;
								if (local127 > 450) {
									local127 = 450;
								}
								if (super.anInt828 < local127 + 4) {
									if (this.anInt1003 >= 1) {
										this.aStringArray10[this.anInt931] = "Report abuse @whi@" + local34;
										this.anIntArray261[this.anInt931] = 2953;
										this.anInt931++;
									}
									this.aStringArray10[this.anInt931] = "Add ignore @whi@" + local34;
									this.anIntArray261[this.anInt931] = 2013;
									this.anInt931++;
									this.aStringArray10[this.anInt931] = "Add friend @whi@" + local34;
									this.anIntArray261[this.anInt931] = 2217;
									this.anInt931++;
								}
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local29 == 5 || local29 == 6) && this.anInt912 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(240) RuntimeException local240) {
			signlink.reporterror("43594, " + 110 + ", " + local240.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method617() {
		try {
			@Pc(8) int local8 = this.aClass1_Sub1_Sub1_Sub3_4.method381("Choose Option", this.anInt876);
			@Pc(22) int local22;
			for (@Pc(10) int local10 = 0; local10 < this.anInt931; local10++) {
				local22 = this.aClass1_Sub1_Sub1_Sub3_4.method381(this.aStringArray10[local10], this.anInt876);
				if (local22 > local8) {
					local8 = local22;
				}
			}
			local8 += 8;
			local22 = this.anInt931 * 15 + 21;
			@Pc(75) int local75;
			@Pc(93) int local93;
			if (super.anInt834 > 4 && super.anInt835 > 4 && super.anInt834 < 516 && super.anInt835 < 338) {
				local75 = super.anInt834 - local8 / 2 - 4;
				if (local75 + local8 > 512) {
					local75 = 512 - local8;
				}
				if (local75 < 0) {
					local75 = 0;
				}
				local93 = super.anInt835 - 4;
				if (local93 + local22 > 334) {
					local93 = 334 - local22;
				}
				if (local93 < 0) {
					local93 = 0;
				}
				this.aBoolean217 = true;
				this.anInt865 = 0;
				this.anInt866 = local75;
				this.anInt867 = local93;
				this.anInt868 = local8;
				this.anInt869 = this.anInt931 * 15 + 22;
			}
			if (super.anInt834 > 553 && super.anInt835 > 205 && super.anInt834 < 743 && super.anInt835 < 466) {
				local75 = super.anInt834 - local8 / 2 - 553;
				if (local75 < 0) {
					local75 = 0;
				} else if (local75 + local8 > 190) {
					local75 = 190 - local8;
				}
				local93 = super.anInt835 - 205;
				if (local93 < 0) {
					local93 = 0;
				} else if (local93 + local22 > 261) {
					local93 = 261 - local22;
				}
				this.aBoolean217 = true;
				this.anInt865 = 1;
				this.anInt866 = local75;
				this.anInt867 = local93;
				this.anInt868 = local8;
				this.anInt869 = this.anInt931 * 15 + 22;
			}
			if (super.anInt834 > 17 && super.anInt835 > 357 && super.anInt834 < 496 && super.anInt835 < 453) {
				local75 = super.anInt834 - local8 / 2 - 17;
				if (local75 < 0) {
					local75 = 0;
				} else if (local75 + local8 > 479) {
					local75 = 479 - local8;
				}
				local93 = super.anInt835 - 357;
				if (local93 < 0) {
					local93 = 0;
				} else if (local93 + local22 > 96) {
					local93 = 96 - local22;
				}
				this.aBoolean217 = true;
				this.anInt865 = 2;
				this.anInt866 = local75;
				this.anInt867 = local93;
				this.anInt868 = local8;
				this.anInt869 = this.anInt931 * 15 + 22;
			}
		} catch (@Pc(297) RuntimeException local297) {
			signlink.reporterror("17362, " + 16143 + ", " + local297.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method619() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt918; local3++) {
				if (this.anIntArray251[local3] <= 0) {
					@Pc(12) boolean local12 = false;
					try {
						if (this.anIntArray214[local3] != this.anInt860 || this.anIntArray224[local3] != this.anInt972) {
							@Pc(45) Class1_Sub1_Sub3 local45 = Class34.method342(this.anIntArray214[local3], this.anIntArray224[local3]);
							if (System.currentTimeMillis() + (long) (local45.anInt352 / 22) > this.aLong31 + (long) (this.anInt878 / 22)) {
								this.anInt878 = local45.anInt352;
								this.aLong31 = System.currentTimeMillis();
								if (this.method669(local45.anInt352, local45.aByteArray3)) {
									this.anInt860 = this.anIntArray214[local3];
									this.anInt972 = this.anIntArray224[local3];
								} else {
									local12 = true;
								}
							}
						} else if (!this.method597()) {
							local12 = true;
						}
					} catch (@Pc(95) Exception local95) {
					}
					if (local12 && this.anIntArray251[local3] != -5) {
						this.anIntArray251[local3] = -5;
					} else {
						this.anInt918--;
						for (@Pc(111) int local111 = local3; local111 < this.anInt918; local111++) {
							this.anIntArray214[local111] = this.anIntArray214[local111 + 1];
							this.anIntArray224[local111] = this.anIntArray224[local111 + 1];
							this.anIntArray251[local111] = this.anIntArray251[local111 + 1];
						}
						local3--;
					}
				} else {
					@Pc(163) int local163 = this.anIntArray251[local3]--;
				}
			}
			this.aBoolean215 &= true;
			if (this.anInt839 > 0) {
				this.anInt839 -= 20;
				if (this.anInt839 < 0) {
					this.anInt839 = 0;
				}
				if (this.anInt839 == 0 && this.aBoolean223 && !aBoolean226) {
					this.anInt913 = this.anInt864;
					this.aBoolean211 = true;
					this.aClass31_Sub1_1.method529(2, this.anInt913);
					return;
				}
			}
		} catch (@Pc(215) RuntimeException local215) {
			signlink.reporterror("61937, " + true + ", " + local215.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method573() {
		this.method580("Starting up", 20, (byte) 3);
		if (signlink.sunjava) {
			super.anInt822 = 5;
		}
		if (aBoolean212) {
			this.aBoolean241 = true;
			return;
		}
		aBoolean212 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method639((byte) 5);
		if (local25.endsWith("jagex.com")) {
			local21 = true;
		}
		if (local25.endsWith("runescape.com")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.2")) {
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
		if (local25.endsWith("127.0.0.1")) {
			local21 = true;
		}
		if (!local21) {
			this.aBoolean240 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(83) int local83 = 0; local83 < 5; local83++) {
				this.aClass21Array1[local83] = new Class21(local83 + 1, signlink.aRandomAccessFile3, signlink.aRandomAccessFileArray1[local83], 500000, -36202);
			}
		}
		try {
			this.method591(anInt915);
			this.aClass15_1 = this.method633("title", "title screen", 1, 25, this.anIntArray235[1]);
			this.aClass1_Sub1_Sub1_Sub3_2 = new Class1_Sub1_Sub1_Sub3(9, this.aClass15_1, "p11_full", false);
			this.aClass1_Sub1_Sub1_Sub3_3 = new Class1_Sub1_Sub1_Sub3(9, this.aClass15_1, "p12_full", false);
			this.aClass1_Sub1_Sub1_Sub3_4 = new Class1_Sub1_Sub1_Sub3(9, this.aClass15_1, "b12_full", false);
			this.aClass1_Sub1_Sub1_Sub3_5 = new Class1_Sub1_Sub1_Sub3(9, this.aClass15_1, "q8_full", true);
			this.method674(505);
			this.method600();
			@Pc(179) Class15 local179 = this.method633("config", "config", 2, 30, this.anIntArray235[2]);
			@Pc(191) Class15 local191 = this.method633("interface", "interface", 3, 35, this.anIntArray235[3]);
			@Pc(203) Class15 local203 = this.method633("media", "2d graphics", 4, 40, this.anIntArray235[4]);
			@Pc(215) Class15 local215 = this.method633("textures", "textures", 6, 45, this.anIntArray235[6]);
			@Pc(227) Class15 local227 = this.method633("wordenc", "chat system", 7, 50, this.anIntArray235[7]);
			@Pc(239) Class15 local239 = this.method633("sounds", "sound effects", 8, 55, this.anIntArray235[8]);
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray8 = new int[4][105][105];
			this.aClass45_1 = new Class45(4, 104, this.anIntArrayArrayArray8, (byte) 1, 104);
			for (@Pc(264) int local264 = 0; local264 < 4; local264++) {
				this.aClass20Array1[local264] = new Class20((byte) -72, 104, 104);
			}
			this.aClass1_Sub1_Sub1_Sub2_16 = new Class1_Sub1_Sub1_Sub2(512, 512);
			@Pc(299) Class15 local299 = this.method633("versionlist", "update list", 5, 60, this.anIntArray235[5]);
			this.method580("Connecting to update server", 60, (byte) 3);
			this.aClass31_Sub1_1 = new Class31_Sub1();
			this.aClass31_Sub1_1.method522(local299, this);
			Class13.method143(this.aClass31_Sub1_1.method523(93));
			Class1_Sub1_Sub2_Sub6.method412(this.aClass31_Sub1_1.method519(0), this.aClass31_Sub1_1);
			if (!aBoolean226) {
				this.anInt913 = 0;
				try {
					this.anInt913 = Integer.parseInt(this.getParameter("music"));
				} catch (@Pc(340) Exception local340) {
				}
				this.aBoolean211 = true;
				this.aClass31_Sub1_1.method529(2, this.anInt913);
				while (this.aClass31_Sub1_1.method533() > 0) {
					this.method668(anInt842);
					try {
						Thread.sleep(100L);
					} catch (@Pc(358) Exception local358) {
					}
					if (this.aClass31_Sub1_1.anInt779 > 3) {
						this.method590("ondemand");
						return;
					}
				}
			}
			this.method580("Requesting animations", 65, (byte) 3);
			@Pc(382) int local382 = this.aClass31_Sub1_1.method519(1);
			for (@Pc(384) int local384 = 0; local384 < local382; local384++) {
				this.aClass31_Sub1_1.method529(1, local384);
			}
			@Pc(403) int local403;
			while (this.aClass31_Sub1_1.method533() > 0) {
				local403 = local382 - this.aClass31_Sub1_1.method533();
				if (local403 > 0) {
					this.method580("Loading animations - " + local403 * 100 / local382 + "%", 65, (byte) 3);
				}
				this.method668(anInt842);
				try {
					Thread.sleep(100L);
				} catch (@Pc(429) Exception local429) {
				}
				if (this.aClass31_Sub1_1.anInt779 > 3) {
					this.method590("ondemand");
					return;
				}
			}
			this.method580("Requesting models", 70, (byte) 3);
			local382 = this.aClass31_Sub1_1.method519(0);
			@Pc(463) int local463;
			for (local403 = 0; local403 < local382; local403++) {
				local463 = this.aClass31_Sub1_1.method520(local403);
				if ((local463 & 0x1) != 0) {
					this.aClass31_Sub1_1.method529(0, local403);
				}
			}
			local382 = this.aClass31_Sub1_1.method533();
			while (this.aClass31_Sub1_1.method533() > 0) {
				local463 = local382 - this.aClass31_Sub1_1.method533();
				if (local463 > 0) {
					this.method580("Loading models - " + local463 * 100 / local382 + "%", 70, (byte) 3);
				}
				this.method668(anInt842);
				try {
					Thread.sleep(100L);
				} catch (@Pc(514) Exception local514) {
				}
			}
			if (this.aClass21Array1[0] != null) {
				this.method580("Requesting maps", 75, (byte) 3);
				this.aClass31_Sub1_1.method529(3, this.aClass31_Sub1_1.method525(0, 47, 48));
				this.aClass31_Sub1_1.method529(3, this.aClass31_Sub1_1.method525(1, 47, 48));
				this.aClass31_Sub1_1.method529(3, this.aClass31_Sub1_1.method525(0, 48, 48));
				this.aClass31_Sub1_1.method529(3, this.aClass31_Sub1_1.method525(1, 48, 48));
				this.aClass31_Sub1_1.method529(3, this.aClass31_Sub1_1.method525(0, 49, 48));
				this.aClass31_Sub1_1.method529(3, this.aClass31_Sub1_1.method525(1, 49, 48));
				this.aClass31_Sub1_1.method529(3, this.aClass31_Sub1_1.method525(0, 47, 47));
				this.aClass31_Sub1_1.method529(3, this.aClass31_Sub1_1.method525(1, 47, 47));
				this.aClass31_Sub1_1.method529(3, this.aClass31_Sub1_1.method525(0, 48, 47));
				this.aClass31_Sub1_1.method529(3, this.aClass31_Sub1_1.method525(1, 48, 47));
				this.aClass31_Sub1_1.method529(3, this.aClass31_Sub1_1.method525(0, 48, 148));
				this.aClass31_Sub1_1.method529(3, this.aClass31_Sub1_1.method525(1, 48, 148));
				local382 = this.aClass31_Sub1_1.method533();
				while (this.aClass31_Sub1_1.method533() > 0) {
					local463 = local382 - this.aClass31_Sub1_1.method533();
					if (local463 > 0) {
						this.method580("Loading maps - " + local463 * 100 / local382 + "%", 75, (byte) 3);
					}
					this.method668(anInt842);
					try {
						Thread.sleep(100L);
					} catch (@Pc(699) Exception local699) {
					}
				}
			}
			local382 = this.aClass31_Sub1_1.method519(0);
			@Pc(720) int local720;
			for (local463 = 0; local463 < local382; local463++) {
				local720 = this.aClass31_Sub1_1.method520(local463);
				@Pc(722) byte local722 = 0;
				if ((local720 & 0x8) != 0) {
					local722 = 10;
				} else if ((local720 & 0x20) != 0) {
					local722 = 9;
				} else if ((local720 & 0x10) != 0) {
					local722 = 8;
				} else if ((local720 & 0x40) != 0) {
					local722 = 7;
				} else if ((local720 & 0x80) != 0) {
					local722 = 6;
				} else if ((local720 & 0x2) != 0) {
					local722 = 5;
				} else if ((local720 & 0x4) != 0) {
					local722 = 4;
				}
				if ((local720 & 0x1) != 0) {
					local722 = 3;
				}
				if (local722 != 0) {
					this.aClass31_Sub1_1.method526(local722, local463, 0);
				}
			}
			this.aClass31_Sub1_1.method532(aBoolean225);
			if (!aBoolean226) {
				local382 = this.aClass31_Sub1_1.method519(2);
				for (local720 = 1; local720 < local382; local720++) {
					if (this.aClass31_Sub1_1.method528(local720)) {
						this.aClass31_Sub1_1.method526((byte) 1, local720, 2);
					}
				}
			}
			this.method580("Unpacking media", 80, (byte) 3);
			this.aClass1_Sub1_Sub1_Sub4_18 = new Class1_Sub1_Sub1_Sub4(local203, "invback", 0);
			this.aClass1_Sub1_Sub1_Sub4_20 = new Class1_Sub1_Sub1_Sub4(local203, "chatback", 0);
			this.aClass1_Sub1_Sub1_Sub4_19 = new Class1_Sub1_Sub1_Sub4(local203, "mapback", 0);
			this.aClass1_Sub1_Sub1_Sub4_15 = new Class1_Sub1_Sub1_Sub4(local203, "backbase1", 0);
			this.aClass1_Sub1_Sub1_Sub4_16 = new Class1_Sub1_Sub1_Sub4(local203, "backbase2", 0);
			this.aClass1_Sub1_Sub1_Sub4_17 = new Class1_Sub1_Sub1_Sub4(local203, "backhmid1", 0);
			for (local720 = 0; local720 < 13; local720++) {
				this.aClass1_Sub1_Sub1_Sub4Array4[local720] = new Class1_Sub1_Sub1_Sub4(local203, "sideicons", local720);
			}
			this.aClass1_Sub1_Sub1_Sub2_5 = new Class1_Sub1_Sub1_Sub2(local203, "compass", 0);
			this.aClass1_Sub1_Sub1_Sub2_15 = new Class1_Sub1_Sub1_Sub2(local203, "mapedge", 0);
			this.aClass1_Sub1_Sub1_Sub2_15.method120();
			@Pc(922) int local922;
			try {
				for (local922 = 0; local922 < 100; local922++) {
					this.aClass1_Sub1_Sub1_Sub4Array5[local922] = new Class1_Sub1_Sub1_Sub4(local203, "mapscene", local922);
				}
			} catch (@Pc(940) Exception local940) {
			}
			try {
				for (local922 = 0; local922 < 100; local922++) {
					this.aClass1_Sub1_Sub1_Sub2Array4[local922] = new Class1_Sub1_Sub1_Sub2(local203, "mapfunction", local922);
				}
			} catch (@Pc(960) Exception local960) {
			}
			try {
				for (local922 = 0; local922 < 20; local922++) {
					this.aClass1_Sub1_Sub1_Sub2Array7[local922] = new Class1_Sub1_Sub1_Sub2(local203, "hitmarks", local922);
				}
			} catch (@Pc(980) Exception local980) {
			}
			try {
				for (local922 = 0; local922 < 20; local922++) {
					this.aClass1_Sub1_Sub1_Sub2Array8[local922] = new Class1_Sub1_Sub1_Sub2(local203, "headicons", local922);
				}
			} catch (@Pc(1000) Exception local1000) {
			}
			this.aClass1_Sub1_Sub1_Sub2_3 = new Class1_Sub1_Sub1_Sub2(local203, "mapmarker", 0);
			this.aClass1_Sub1_Sub1_Sub2_4 = new Class1_Sub1_Sub1_Sub2(local203, "mapmarker", 1);
			for (local922 = 0; local922 < 8; local922++) {
				this.aClass1_Sub1_Sub1_Sub2Array6[local922] = new Class1_Sub1_Sub1_Sub2(local203, "cross", local922);
			}
			this.aClass1_Sub1_Sub1_Sub2_10 = new Class1_Sub1_Sub1_Sub2(local203, "mapdots", 0);
			this.aClass1_Sub1_Sub1_Sub2_11 = new Class1_Sub1_Sub1_Sub2(local203, "mapdots", 1);
			this.aClass1_Sub1_Sub1_Sub2_12 = new Class1_Sub1_Sub1_Sub2(local203, "mapdots", 2);
			this.aClass1_Sub1_Sub1_Sub2_13 = new Class1_Sub1_Sub1_Sub2(local203, "mapdots", 3);
			this.aClass1_Sub1_Sub1_Sub2_14 = new Class1_Sub1_Sub1_Sub2(local203, "mapdots", 4);
			this.aClass1_Sub1_Sub1_Sub4_1 = new Class1_Sub1_Sub1_Sub4(local203, "scrollbar", 0);
			this.aClass1_Sub1_Sub1_Sub4_2 = new Class1_Sub1_Sub1_Sub4(local203, "scrollbar", 1);
			this.aClass1_Sub1_Sub1_Sub4_3 = new Class1_Sub1_Sub1_Sub4(local203, "redstone1", 0);
			this.aClass1_Sub1_Sub1_Sub4_4 = new Class1_Sub1_Sub1_Sub4(local203, "redstone2", 0);
			this.aClass1_Sub1_Sub1_Sub4_5 = new Class1_Sub1_Sub1_Sub4(local203, "redstone3", 0);
			this.aClass1_Sub1_Sub1_Sub4_6 = new Class1_Sub1_Sub1_Sub4(local203, "redstone1", 0);
			this.aClass1_Sub1_Sub1_Sub4_6.method560();
			this.aClass1_Sub1_Sub1_Sub4_7 = new Class1_Sub1_Sub1_Sub4(local203, "redstone2", 0);
			this.aClass1_Sub1_Sub1_Sub4_7.method560();
			this.aClass1_Sub1_Sub1_Sub4_8 = new Class1_Sub1_Sub1_Sub4(local203, "redstone1", 0);
			this.aClass1_Sub1_Sub1_Sub4_8.method561();
			this.aClass1_Sub1_Sub1_Sub4_9 = new Class1_Sub1_Sub1_Sub4(local203, "redstone2", 0);
			this.aClass1_Sub1_Sub1_Sub4_9.method561();
			this.aClass1_Sub1_Sub1_Sub4_10 = new Class1_Sub1_Sub1_Sub4(local203, "redstone3", 0);
			this.aClass1_Sub1_Sub1_Sub4_10.method561();
			this.aClass1_Sub1_Sub1_Sub4_11 = new Class1_Sub1_Sub1_Sub4(local203, "redstone1", 0);
			this.aClass1_Sub1_Sub1_Sub4_11.method560();
			this.aClass1_Sub1_Sub1_Sub4_11.method561();
			this.aClass1_Sub1_Sub1_Sub4_12 = new Class1_Sub1_Sub1_Sub4(local203, "redstone2", 0);
			this.aClass1_Sub1_Sub1_Sub4_12.method560();
			this.aClass1_Sub1_Sub1_Sub4_12.method561();
			for (@Pc(1208) int local1208 = 0; local1208 < 2; local1208++) {
				this.aClass1_Sub1_Sub1_Sub4Array3[local1208] = new Class1_Sub1_Sub1_Sub4(local203, "mod_icons", local1208);
			}
			@Pc(1231) Class1_Sub1_Sub1_Sub2 local1231 = new Class1_Sub1_Sub1_Sub2(local203, "backleft1", 0);
			this.aClass7_3 = new Class7(local1231.anInt113, this.method578(aByte61), local1231.anInt114, 912);
			local1231.method121(0, 0);
			@Pc(1256) Class1_Sub1_Sub1_Sub2 local1256 = new Class1_Sub1_Sub1_Sub2(local203, "backleft2", 0);
			this.aClass7_4 = new Class7(local1256.anInt113, this.method578(aByte61), local1256.anInt114, 912);
			local1256.method121(0, 0);
			@Pc(1281) Class1_Sub1_Sub1_Sub2 local1281 = new Class1_Sub1_Sub1_Sub2(local203, "backright1", 0);
			this.aClass7_5 = new Class7(local1281.anInt113, this.method578(aByte61), local1281.anInt114, 912);
			local1281.method121(0, 0);
			@Pc(1306) Class1_Sub1_Sub1_Sub2 local1306 = new Class1_Sub1_Sub1_Sub2(local203, "backright2", 0);
			this.aClass7_6 = new Class7(local1306.anInt113, this.method578(aByte61), local1306.anInt114, 912);
			local1306.method121(0, 0);
			@Pc(1331) Class1_Sub1_Sub1_Sub2 local1331 = new Class1_Sub1_Sub1_Sub2(local203, "backtop1", 0);
			this.aClass7_7 = new Class7(local1331.anInt113, this.method578(aByte61), local1331.anInt114, 912);
			local1331.method121(0, 0);
			@Pc(1356) Class1_Sub1_Sub1_Sub2 local1356 = new Class1_Sub1_Sub1_Sub2(local203, "backvmid1", 0);
			this.aClass7_8 = new Class7(local1356.anInt113, this.method578(aByte61), local1356.anInt114, 912);
			local1356.method121(0, 0);
			@Pc(1381) Class1_Sub1_Sub1_Sub2 local1381 = new Class1_Sub1_Sub1_Sub2(local203, "backvmid2", 0);
			this.aClass7_9 = new Class7(local1381.anInt113, this.method578(aByte61), local1381.anInt114, 912);
			local1381.method121(0, 0);
			@Pc(1406) Class1_Sub1_Sub1_Sub2 local1406 = new Class1_Sub1_Sub1_Sub2(local203, "backvmid3", 0);
			this.aClass7_10 = new Class7(local1406.anInt113, this.method578(aByte61), local1406.anInt114, 912);
			local1406.method121(0, 0);
			@Pc(1431) Class1_Sub1_Sub1_Sub2 local1431 = new Class1_Sub1_Sub1_Sub2(local203, "backhmid2", 0);
			this.aClass7_11 = new Class7(local1431.anInt113, this.method578(aByte61), local1431.anInt114, 912);
			local1431.method121(0, 0);
			@Pc(1456) int local1456 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1463) int local1463 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1470) int local1470 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1477) int local1477 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1479) int local1479 = 0; local1479 < 100; local1479++) {
				if (this.aClass1_Sub1_Sub1_Sub2Array4[local1479] != null) {
					this.aClass1_Sub1_Sub1_Sub2Array4[local1479].method119(local1463 + local1477, local1456 + local1477, local1470 + local1477);
				}
				if (this.aClass1_Sub1_Sub1_Sub4Array5[local1479] != null) {
					this.aClass1_Sub1_Sub1_Sub4Array5[local1479].method562(local1463 + local1477, local1456 + local1477, local1470 + local1477);
				}
			}
			this.method580("Unpacking textures", 83, (byte) 3);
			Class1_Sub1_Sub1_Sub1.method60(local215);
			Class1_Sub1_Sub1_Sub1.method64(0.8D, 932);
			Class1_Sub1_Sub1_Sub1.method59();
			this.method580("Unpacking config", 86, (byte) 3);
			Class23.method292(309, local179);
			Class41.method445(local179);
			Class28.method315(local179);
			Class27.method303(local179);
			Class39.method402(local179);
			Class8.method131(local179);
			Class44.method461(local179);
			Class12.method141(309, local179);
			Class2.method4(local179);
			Class27.aBoolean96 = aBoolean225;
			if (!aBoolean226) {
				this.method580("Unpacking sounds", 90, (byte) 3);
				@Pc(1582) byte[] local1582 = local239.method220("sounds.dat", null);
				@Pc(1588) Class1_Sub1_Sub3 local1588 = new Class1_Sub1_Sub3(local1582, 8);
				Class34.method341(309, local1588);
			}
			this.method580("Unpacking interfaces", 95, (byte) 3);
			@Pc(1619) Class1_Sub1_Sub1_Sub3[] local1619 = new Class1_Sub1_Sub1_Sub3[] { this.aClass1_Sub1_Sub1_Sub3_2, this.aClass1_Sub1_Sub1_Sub3_3, this.aClass1_Sub1_Sub1_Sub3_4, this.aClass1_Sub1_Sub1_Sub3_5 };
			Class43.method458(local1619, local191, local203);
			this.method580("Preparing game engine", 100, (byte) 3);
			@Pc(1635) int local1635;
			@Pc(1637) int local1637;
			@Pc(1639) int local1639;
			for (@Pc(1631) int local1631 = 0; local1631 < 33; local1631++) {
				local1635 = 999;
				local1637 = 0;
				for (local1639 = 0; local1639 < 34; local1639++) {
					if (this.aClass1_Sub1_Sub1_Sub4_19.aByteArray20[local1639 + local1631 * this.aClass1_Sub1_Sub1_Sub4_19.anInt810] == 0) {
						if (local1635 == 999) {
							local1635 = local1639;
						}
					} else if (local1635 != 999) {
						local1637 = local1639;
						break;
					}
				}
				this.anIntArray236[local1631] = local1635;
				this.anIntArray212[local1631] = local1637 - local1635;
			}
			@Pc(1697) int local1697;
			for (local1635 = 5; local1635 < 156; local1635++) {
				local1637 = 999;
				local1639 = 0;
				for (local1697 = 25; local1697 < 172; local1697++) {
					if (this.aClass1_Sub1_Sub1_Sub4_19.aByteArray20[local1697 + local1635 * this.aClass1_Sub1_Sub1_Sub4_19.anInt810] == 0 && (local1697 > 34 || local1635 > 34)) {
						if (local1637 == 999) {
							local1637 = local1697;
						}
					} else if (local1637 != 999) {
						local1639 = local1697;
						break;
					}
				}
				this.anIntArray237[local1635 - 5] = local1637 - 25;
				this.anIntArray266[local1635 - 5] = local1639 - local1637;
			}
			Class1_Sub1_Sub1_Sub1.method57(96, 479, aBoolean224);
			this.anIntArray221 = Class1_Sub1_Sub1_Sub1.anIntArray16;
			Class1_Sub1_Sub1_Sub1.method57(261, 190, aBoolean224);
			this.anIntArray222 = Class1_Sub1_Sub1_Sub1.anIntArray16;
			Class1_Sub1_Sub1_Sub1.method57(334, 512, aBoolean224);
			this.anIntArray223 = Class1_Sub1_Sub1_Sub1.anIntArray16;
			@Pc(1781) int[] local1781 = new int[9];
			for (local1639 = 0; local1639 < 9; local1639++) {
				local1697 = local1639 * 32 + 128 + 15;
				@Pc(1799) int local1799 = local1697 * 3 + 600;
				@Pc(1803) int local1803 = Class1_Sub1_Sub1_Sub1.anIntArray14[local1697];
				local1781[local1639] = local1799 * local1803 >> 16;
			}
			Class45.method501(local1781);
			Class14.method169(local227);
			this.aClass46_1 = new Class46(true, this);
			this.method579(this.aClass46_1, 10);
			Class1_Sub1_Sub2_Sub3.aClient1 = this;
			Class41.aClient3 = this;
			Class39.aClient2 = this;
		} catch (@Pc(1844) Exception local1844) {
			signlink.reporterror("loaderror " + this.aString26 + " " + this.anInt875);
			this.aBoolean209 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method620(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				if (this.anInt1041 != 0) {
					this.anInt1041 = 0;
					this.aBoolean242 = true;
				}
				@Pc(18) int local18 = this.anIntArray259[arg0];
				@Pc(23) int local23 = this.anIntArray260[arg0];
				@Pc(28) int local28 = this.anIntArray261[arg0];
				@Pc(33) int local33 = this.anIntArray262[arg0];
				if (local28 >= 2000) {
					local28 -= 2000;
				}
				@Pc(61) boolean local61;
				if (local28 == 629) {
					local61 = this.method690(local18, 0, 0, 2, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0], 0, false, 0, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0], 0, local23);
					if (!local61) {
						this.method690(local18, 0, 1, 2, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0], 0, false, 0, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0], 1, local23);
					}
					this.anInt961 = super.anInt834;
					this.anInt962 = super.anInt835;
					this.anInt964 = 2;
					this.anInt963 = 0;
					this.aClass1_Sub1_Sub3_6.method227(254);
					this.aClass1_Sub1_Sub3_6.method229(local18 + this.anInt1043);
					this.aClass1_Sub1_Sub3_6.method264(local33);
					this.aClass1_Sub1_Sub3_6.method264(local23 + this.anInt1044);
				}
				if (local28 == 412) {
					this.method593(local33, local23, local18);
					this.aClass1_Sub1_Sub3_6.method227(87);
					this.aClass1_Sub1_Sub3_6.method264(local23 + this.anInt1044);
					this.aClass1_Sub1_Sub3_6.method265(local33 >> 14 & 0x7FFF);
					this.aClass1_Sub1_Sub3_6.method263(local18 + this.anInt1043);
				}
				if (local28 == 505) {
					if (this.aBoolean217) {
						this.aClass45_1.method503(local18 - 4, local23 - 4);
					} else {
						this.aClass45_1.method503(super.anInt834 - 4, super.anInt835 - 4);
					}
				}
				@Pc(201) Class1_Sub1_Sub2_Sub2_Sub1 local201;
				if (local28 == 562) {
					local201 = this.aClass1_Sub1_Sub2_Sub2_Sub1Array1[local33];
					if (local201 != null) {
						this.method690(local201.anIntArray87[0], 0, 1, 2, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0], 0, false, 0, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0], 1, local201.anIntArray88[0]);
						this.anInt961 = super.anInt834;
						this.anInt962 = super.anInt835;
						this.anInt964 = 2;
						this.anInt963 = 0;
						this.aClass1_Sub1_Sub3_6.method227(33);
						this.aClass1_Sub1_Sub3_6.method263(local33);
					}
				}
				@Pc(262) Class1_Sub1_Sub2_Sub2_Sub2 local262;
				if (local28 == 209) {
					local262 = this.aClass1_Sub1_Sub2_Sub2_Sub2Array1[local33];
					if (local262 != null) {
						this.method690(local262.anIntArray87[0], 0, 1, 2, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0], 0, false, 0, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0], 1, local262.anIntArray88[0]);
						this.anInt961 = super.anInt834;
						this.anInt962 = super.anInt835;
						this.anInt964 = 2;
						this.anInt963 = 0;
						this.aClass1_Sub1_Sub3_6.method227(236);
						this.aClass1_Sub1_Sub3_6.method264(local33);
						this.aClass1_Sub1_Sub3_6.method229(this.anInt901);
					}
				}
				@Pc(341) String local341;
				if (local28 == 1912) {
					@Pc(329) int local329 = local33 >> 14 & 0x7FFF;
					@Pc(332) Class41 local332 = Class41.method452(local329);
					if (local332.aByteArray10 == null) {
						local341 = "It's a " + local332.aString10 + ".";
					} else {
						local341 = new String(local332.aByteArray10);
					}
					this.method630(0, local341, "", (byte) 4);
				}
				@Pc(367) Class43 local367;
				if (local28 == 640) {
					local367 = Class43.aClass43Array1[local23];
					@Pc(369) boolean local369 = true;
					if (local367.anInt712 > 0) {
						local369 = this.method640(local367);
					}
					if (local369) {
						this.aClass1_Sub1_Sub3_6.method227(131);
						this.aClass1_Sub1_Sub3_6.method229(local23);
					}
				}
				if (local28 == 124) {
					local61 = this.method690(local18, 0, 0, 2, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0], 0, false, 0, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0], 0, local23);
					if (!local61) {
						this.method690(local18, 0, 1, 2, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0], 0, false, 0, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0], 1, local23);
					}
					this.anInt961 = super.anInt834;
					this.anInt962 = super.anInt835;
					this.anInt964 = 2;
					this.anInt963 = 0;
					this.aClass1_Sub1_Sub3_6.method227(13);
					this.aClass1_Sub1_Sub3_6.method263(local18 + this.anInt1043);
					this.aClass1_Sub1_Sub3_6.method229(local23 + this.anInt1044);
					this.aClass1_Sub1_Sub3_6.method264(local33);
				}
				if (local28 == 81) {
					local61 = this.method690(local18, 0, 0, 2, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0], 0, false, 0, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0], 0, local23);
					if (!local61) {
						this.method690(local18, 0, 1, 2, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0], 0, false, 0, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0], 1, local23);
					}
					this.anInt961 = super.anInt834;
					this.anInt962 = super.anInt835;
					this.anInt964 = 2;
					this.anInt963 = 0;
					anInt968 += local23;
					if (anInt968 >= 75) {
						this.aClass1_Sub1_Sub3_6.method227(246);
						this.aClass1_Sub1_Sub3_6.method228(242);
						anInt968 = 0;
					}
					this.aClass1_Sub1_Sub3_6.method227(239);
					this.aClass1_Sub1_Sub3_6.method263(local23 + this.anInt1044);
					this.aClass1_Sub1_Sub3_6.method229(local18 + this.anInt1043);
					this.aClass1_Sub1_Sub3_6.method265(local33);
				}
				if (local28 == 801) {
					local201 = this.aClass1_Sub1_Sub2_Sub2_Sub1Array1[local33];
					if (local201 != null) {
						this.method690(local201.anIntArray87[0], 0, 1, 2, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0], 0, false, 0, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0], 1, local201.anIntArray88[0]);
						this.anInt961 = super.anInt834;
						this.anInt962 = super.anInt835;
						this.anInt964 = 2;
						this.anInt963 = 0;
						this.aClass1_Sub1_Sub3_6.method227(129);
						this.aClass1_Sub1_Sub3_6.method229(local33);
					}
				}
				@Pc(659) int local659;
				@Pc(655) String local655;
				@Pc(670) long local670;
				if (local28 == 217 || local28 == 13 || local28 == 47 || local28 == 281) {
					local655 = this.aStringArray10[arg0];
					local659 = local655.indexOf("@whi@");
					if (local659 != -1) {
						local670 = Class49.method538(local655.substring(local659 + 5).trim());
						if (local28 == 217) {
							this.method627(local670);
						}
						if (local28 == 13) {
							this.method592(local670);
						}
						if (local28 == 47) {
							this.method625(local670);
						}
						if (local28 == 281) {
							this.method585(local670);
						}
					}
				}
				if (local28 == 760) {
					this.aClass1_Sub1_Sub3_6.method227(247);
					this.aClass1_Sub1_Sub3_6.method264(local33);
					this.aClass1_Sub1_Sub3_6.method229(local23);
					this.aClass1_Sub1_Sub3_6.method265(local18);
					this.anInt1024 = 0;
					this.anInt1025 = local23;
					this.anInt1026 = local18;
					this.anInt1027 = 2;
					if (Class43.aClass43Array1[local23].anInt703 == this.anInt895) {
						this.anInt1027 = 1;
					}
					if (Class43.aClass43Array1[local23].anInt703 == this.anInt914) {
						this.anInt1027 = 3;
					}
				}
				if (local28 == 667) {
					local262 = this.aClass1_Sub1_Sub2_Sub2_Sub2Array1[local33];
					if (local262 != null) {
						this.method690(local262.anIntArray87[0], 0, 1, 2, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0], 0, false, 0, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0], 1, local262.anIntArray88[0]);
						this.anInt961 = super.anInt834;
						this.anInt962 = super.anInt835;
						this.anInt964 = 2;
						this.anInt963 = 0;
						this.aClass1_Sub1_Sub3_6.method227(180);
						this.aClass1_Sub1_Sub3_6.method263(local33);
					}
				}
				if (local28 == 590) {
					this.method664();
				}
				if (local28 == 22) {
					this.aClass1_Sub1_Sub3_6.method227(47);
					this.aClass1_Sub1_Sub3_6.method263(local18);
					this.aClass1_Sub1_Sub3_6.method229(local33);
					this.aClass1_Sub1_Sub3_6.method229(local23);
					this.anInt1024 = 0;
					this.anInt1025 = local23;
					this.anInt1026 = local18;
					this.anInt1027 = 2;
					if (Class43.aClass43Array1[local23].anInt703 == this.anInt895) {
						this.anInt1027 = 1;
					}
					if (Class43.aClass43Array1[local23].anInt703 == this.anInt914) {
						this.anInt1027 = 3;
					}
				}
				if (local28 == 146) {
					this.anInt1018 = 1;
					this.anInt1019 = local18;
					this.anInt1020 = local23;
					this.anInt1021 = local33;
					this.aString28 = Class27.method308(local33).aString6;
					this.anInt900 = 0;
					this.aBoolean232 = true;
				} else {
					if (local28 == 196) {
						this.aClass1_Sub1_Sub3_6.method227(25);
						this.aClass1_Sub1_Sub3_6.method264(local23);
						this.aClass1_Sub1_Sub3_6.method265(local18);
						this.aClass1_Sub1_Sub3_6.method229(local33);
						this.anInt1024 = 0;
						this.anInt1025 = local23;
						this.anInt1026 = local18;
						this.anInt1027 = 2;
						if (Class43.aClass43Array1[local23].anInt703 == this.anInt895) {
							this.anInt1027 = 1;
						}
						if (Class43.aClass43Array1[local23].anInt703 == this.anInt914) {
							this.anInt1027 = 3;
						}
					}
					if (local28 == 1842) {
						local262 = this.aClass1_Sub1_Sub2_Sub2_Sub2Array1[local33];
						if (local262 != null) {
							@Pc(966) Class39 local966 = local262.aClass39_2;
							if (local966.anIntArray114 != null) {
								local966 = local966.method405();
							}
							if (local966 != null) {
								if (local966.aByteArray9 == null) {
									local341 = "It's a " + local966.aString9 + ".";
								} else {
									local341 = new String(local966.aByteArray9);
								}
								this.method630(0, local341, "", (byte) 4);
							}
						}
					}
					if (local28 == 953) {
						local655 = this.aStringArray10[arg0];
						local659 = local655.indexOf("@whi@");
						if (local659 != -1) {
							if (this.anInt895 == -1) {
								this.method664();
								this.aString22 = local655.substring(local659 + 5).trim();
								this.aBoolean218 = false;
								for (@Pc(1038) int local1038 = 0; local1038 < Class43.aClass43Array1.length; local1038++) {
									if (Class43.aClass43Array1[local1038] != null && Class43.aClass43Array1[local1038].anInt712 == 600) {
										this.anInt1042 = this.anInt895 = Class43.aClass43Array1[local1038].anInt703;
										break;
									}
								}
							} else {
								this.method630(0, "Please close the interface you have open before using 'report abuse'", "", (byte) 4);
							}
						}
					}
					if (local28 == 450) {
						this.aClass1_Sub1_Sub3_6.method227(131);
						this.aClass1_Sub1_Sub3_6.method229(local23);
						local367 = Class43.aClass43Array1[local23];
						if (local367.anIntArrayArray17 != null && local367.anIntArrayArray17[0][0] == 5) {
							local659 = local367.anIntArrayArray17[0][1];
							this.anIntArray263[local659] = 1 - this.anIntArray263[local659];
							this.method635(local659);
							this.aBoolean232 = true;
						}
					}
					if (local28 == 270) {
						local262 = this.aClass1_Sub1_Sub2_Sub2_Sub2Array1[local33];
						if (local262 != null) {
							this.method690(local262.anIntArray87[0], 0, 1, 2, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0], 0, false, 0, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0], 1, local262.anIntArray88[0]);
							this.anInt961 = super.anInt834;
							this.anInt962 = super.anInt835;
							this.anInt964 = 2;
							this.anInt963 = 0;
							this.aClass1_Sub1_Sub3_6.method227(77);
							this.aClass1_Sub1_Sub3_6.method229(local33);
						}
					}
					if (local28 == 863) {
						anInt909++;
						if (anInt909 >= 135) {
							this.aClass1_Sub1_Sub3_6.method227(38);
							this.aClass1_Sub1_Sub3_6.method228(167);
							anInt909 = 0;
						}
						this.aClass1_Sub1_Sub3_6.method227(8);
						this.aClass1_Sub1_Sub3_6.method265(local23);
						this.aClass1_Sub1_Sub3_6.method265(local33);
						this.aClass1_Sub1_Sub3_6.method264(local18);
						this.anInt1024 = 0;
						this.anInt1025 = local23;
						this.anInt1026 = local18;
						this.anInt1027 = 2;
						if (Class43.aClass43Array1[local23].anInt703 == this.anInt895) {
							this.anInt1027 = 1;
						}
						if (Class43.aClass43Array1[local23].anInt703 == this.anInt914) {
							this.anInt1027 = 3;
						}
					}
					if (local28 == 24) {
						this.aClass1_Sub1_Sub3_6.method227(85);
						this.aClass1_Sub1_Sub3_6.method229(local33);
						this.aClass1_Sub1_Sub3_6.method229(local18);
						this.aClass1_Sub1_Sub3_6.method229(this.anInt901);
						this.aClass1_Sub1_Sub3_6.method263(local23);
						this.anInt1024 = 0;
						this.anInt1025 = local23;
						this.anInt1026 = local18;
						this.anInt1027 = 2;
						if (Class43.aClass43Array1[local23].anInt703 == this.anInt895) {
							this.anInt1027 = 1;
						}
						if (Class43.aClass43Array1[local23].anInt703 == this.anInt914) {
							this.anInt1027 = 3;
						}
					}
					@Pc(1352) int local1352;
					if (local28 == 15 || local28 == 84) {
						local655 = this.aStringArray10[arg0];
						local659 = local655.indexOf("@whi@");
						if (local659 != -1) {
							local655 = local655.substring(local659 + 5).trim();
							local341 = Class49.method542(Class49.method539(Class49.method538(local655)));
							@Pc(1350) boolean local1350 = false;
							for (local1352 = 0; local1352 < this.anInt898; local1352++) {
								@Pc(1362) Class1_Sub1_Sub2_Sub2_Sub1 local1362 = this.aClass1_Sub1_Sub2_Sub2_Sub1Array1[this.anIntArray229[local1352]];
								if (local1362 != null && local1362.aString5 != null && local1362.aString5.equalsIgnoreCase(local341)) {
									this.method690(local1362.anIntArray87[0], 0, 1, 2, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0], 0, false, 0, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0], 1, local1362.anIntArray88[0]);
									if (local28 == 15) {
										this.aClass1_Sub1_Sub3_6.method227(177);
										this.aClass1_Sub1_Sub3_6.method229(this.anIntArray229[local1352]);
									}
									if (local28 == 84) {
										anInt849 += local33;
										if (anInt849 >= 78) {
											this.aClass1_Sub1_Sub3_6.method227(15);
											this.aClass1_Sub1_Sub3_6.method232(0);
											anInt849 = 0;
										}
										this.aClass1_Sub1_Sub3_6.method227(113);
										this.aClass1_Sub1_Sub3_6.method229(this.anIntArray229[local1352]);
									}
									local1350 = true;
									break;
								}
							}
							if (!local1350) {
								this.method630(0, "Unable to find " + local341, "", (byte) 4);
							}
						}
					}
					if (local28 == 745) {
						anInt947++;
						if (anInt947 >= 142) {
							this.aClass1_Sub1_Sub3_6.method227(170);
							anInt947 = 0;
						}
						this.method593(local33, local23, local18);
						this.aClass1_Sub1_Sub3_6.method227(175);
						this.aClass1_Sub1_Sub3_6.method263(local18 + this.anInt1043);
						this.aClass1_Sub1_Sub3_6.method263(local33 >> 14 & 0x7FFF);
						this.aClass1_Sub1_Sub3_6.method263(local23 + this.anInt1044);
					}
					if (local28 == 571) {
						this.aClass1_Sub1_Sub3_6.method227(238);
						this.aClass1_Sub1_Sub3_6.method229(local18);
						this.aClass1_Sub1_Sub3_6.method229(local23);
						this.aClass1_Sub1_Sub3_6.method229(this.anInt1021);
						this.aClass1_Sub1_Sub3_6.method265(this.anInt1020);
						this.aClass1_Sub1_Sub3_6.method265(local33);
						this.aClass1_Sub1_Sub3_6.method263(this.anInt1019);
						this.anInt1024 = 0;
						this.anInt1025 = local23;
						this.anInt1026 = local18;
						this.anInt1027 = 2;
						if (Class43.aClass43Array1[local23].anInt703 == this.anInt895) {
							this.anInt1027 = 1;
						}
						if (Class43.aClass43Array1[local23].anInt703 == this.anInt914) {
							this.anInt1027 = 3;
						}
					}
					if (local28 == 46) {
						this.aClass1_Sub1_Sub3_6.method227(131);
						this.aClass1_Sub1_Sub3_6.method229(local23);
						local367 = Class43.aClass43Array1[local23];
						if (local367.anIntArrayArray17 != null && local367.anIntArrayArray17[0][0] == 5) {
							local659 = local367.anIntArrayArray17[0][1];
							if (this.anIntArray263[local659] != local367.anIntArray175[0]) {
								this.anIntArray263[local659] = local367.anIntArray175[0];
								this.method635(local659);
								this.aBoolean232 = true;
							}
						}
					}
					if (local28 == 705) {
						if ((local23 & 0x3) == 0) {
							anInt1023++;
						}
						if (anInt1023 >= 100) {
							this.aClass1_Sub1_Sub3_6.method227(24);
							this.aClass1_Sub1_Sub3_6.method228(71);
							anInt1023 = 0;
						}
						this.aClass1_Sub1_Sub3_6.method227(221);
						this.aClass1_Sub1_Sub3_6.method265(local23);
						this.aClass1_Sub1_Sub3_6.method263(local33);
						this.aClass1_Sub1_Sub3_6.method263(local18);
						this.anInt1024 = 0;
						this.anInt1025 = local23;
						this.anInt1026 = local18;
						this.anInt1027 = 2;
						if (Class43.aClass43Array1[local23].anInt703 == this.anInt895) {
							this.anInt1027 = 1;
						}
						if (Class43.aClass43Array1[local23].anInt703 == this.anInt914) {
							this.anInt1027 = 3;
						}
					}
					if (local28 == 572) {
						local61 = this.method690(local18, 0, 0, 2, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0], 0, false, 0, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0], 0, local23);
						if (!local61) {
							this.method690(local18, 0, 1, 2, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0], 0, false, 0, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0], 1, local23);
						}
						this.anInt961 = super.anInt834;
						this.anInt962 = super.anInt835;
						this.anInt964 = 2;
						this.anInt963 = 0;
						this.aClass1_Sub1_Sub3_6.method227(142);
						this.aClass1_Sub1_Sub3_6.method264(local33);
						this.aClass1_Sub1_Sub3_6.method229(this.anInt901);
						this.aClass1_Sub1_Sub3_6.method229(local18 + this.anInt1043);
						this.aClass1_Sub1_Sub3_6.method263(local23 + this.anInt1044);
					}
					@Pc(1835) String local1835;
					@Pc(1826) Class27 local1826;
					if (local28 == 1859) {
						local1826 = Class27.method308(local33);
						if (local1826.aByteArray6 == null) {
							local1835 = "It's a " + local1826.aString6 + ".";
						} else {
							local1835 = new String(local1826.aByteArray6);
						}
						this.method630(0, local1835, "", (byte) 4);
					}
					if (local28 == 464) {
						local262 = this.aClass1_Sub1_Sub2_Sub2_Sub2Array1[local33];
						if (local262 != null) {
							this.method690(local262.anIntArray87[0], 0, 1, 2, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0], 0, false, 0, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0], 1, local262.anIntArray88[0]);
							this.anInt961 = super.anInt834;
							this.anInt962 = super.anInt835;
							this.anInt964 = 2;
							this.anInt963 = 0;
							this.aClass1_Sub1_Sub3_6.method227(156);
							this.aClass1_Sub1_Sub3_6.method229(local33);
						}
					}
					if (local28 == 964) {
						local201 = this.aClass1_Sub1_Sub2_Sub2_Sub1Array1[local33];
						if (local201 != null) {
							this.method690(local201.anIntArray87[0], 0, 1, 2, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0], 0, false, 0, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0], 1, local201.anIntArray88[0]);
							this.anInt961 = super.anInt834;
							this.anInt962 = super.anInt835;
							this.anInt964 = 2;
							this.anInt963 = 0;
							this.aClass1_Sub1_Sub3_6.method227(45);
							this.aClass1_Sub1_Sub3_6.method264(this.anInt901);
							this.aClass1_Sub1_Sub3_6.method229(local33);
						}
					}
					if (local28 == 296) {
						local262 = this.aClass1_Sub1_Sub2_Sub2_Sub2Array1[local33];
						if (local262 != null) {
							this.method690(local262.anIntArray87[0], 0, 1, 2, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0], 0, false, 0, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0], 1, local262.anIntArray88[0]);
							this.anInt961 = super.anInt834;
							this.anInt962 = super.anInt835;
							this.anInt964 = 2;
							this.anInt963 = 0;
							if ((local33 & 0x3) == 0) {
								anInt993++;
							}
							if (anInt993 >= 103) {
								this.aClass1_Sub1_Sub3_6.method227(17);
								this.aClass1_Sub1_Sub3_6.method228(3);
								anInt993 = 0;
							}
							this.aClass1_Sub1_Sub3_6.method227(89);
							this.aClass1_Sub1_Sub3_6.method229(local33);
						}
					}
					if (local28 == 128) {
						local201 = this.aClass1_Sub1_Sub2_Sub2_Sub1Array1[local33];
						if (local201 != null) {
							this.method690(local201.anIntArray87[0], 0, 1, 2, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0], 0, false, 0, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0], 1, local201.anIntArray88[0]);
							this.anInt961 = super.anInt834;
							this.anInt962 = super.anInt835;
							this.anInt964 = 2;
							this.anInt963 = 0;
							this.aClass1_Sub1_Sub3_6.method227(240);
							this.aClass1_Sub1_Sub3_6.method229(this.anInt1019);
							this.aClass1_Sub1_Sub3_6.method264(local33);
							this.aClass1_Sub1_Sub3_6.method264(this.anInt1020);
							this.aClass1_Sub1_Sub3_6.method263(this.anInt1021);
						}
					}
					if (local28 == 919) {
						this.method593(local33, local23, local18);
						this.aClass1_Sub1_Sub3_6.method227(111);
						this.aClass1_Sub1_Sub3_6.method263(local23 + this.anInt1044);
						this.aClass1_Sub1_Sub3_6.method264(local18 + this.anInt1043);
						this.aClass1_Sub1_Sub3_6.method265(local33 >> 14 & 0x7FFF);
					}
					if (local28 == 90) {
						local201 = this.aClass1_Sub1_Sub2_Sub2_Sub1Array1[local33];
						if (local201 != null) {
							this.method690(local201.anIntArray87[0], 0, 1, 2, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0], 0, false, 0, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0], 1, local201.anIntArray88[0]);
							this.anInt961 = super.anInt834;
							this.anInt962 = super.anInt835;
							this.anInt964 = 2;
							this.anInt963 = 0;
							anInt841 += local33;
							if (anInt841 >= 108) {
								this.aClass1_Sub1_Sub3_6.method227(67);
								this.aClass1_Sub1_Sub3_6.method229(59871);
								anInt841 = 0;
							}
							this.aClass1_Sub1_Sub3_6.method227(7);
							this.aClass1_Sub1_Sub3_6.method229(local33);
						}
					}
					if (local28 == 723) {
						this.aClass1_Sub1_Sub3_6.method227(140);
						this.aClass1_Sub1_Sub3_6.method264(local33);
						this.aClass1_Sub1_Sub3_6.method229(local23);
						this.aClass1_Sub1_Sub3_6.method265(local18);
						this.anInt1024 = 0;
						this.anInt1025 = local23;
						this.anInt1026 = local18;
						this.anInt1027 = 2;
						if (Class43.aClass43Array1[local23].anInt703 == this.anInt895) {
							this.anInt1027 = 1;
						}
						if (Class43.aClass43Array1[local23].anInt703 == this.anInt914) {
							this.anInt1027 = 3;
						}
					}
					if (local28 == 901) {
						local201 = this.aClass1_Sub1_Sub2_Sub2_Sub1Array1[local33];
						if (local201 != null) {
							this.method690(local201.anIntArray87[0], 0, 1, 2, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0], 0, false, 0, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0], 1, local201.anIntArray88[0]);
							this.anInt961 = super.anInt834;
							this.anInt962 = super.anInt835;
							this.anInt964 = 2;
							this.anInt963 = 0;
							anInt849 += local33;
							if (anInt849 >= 78) {
								this.aClass1_Sub1_Sub3_6.method227(15);
								this.aClass1_Sub1_Sub3_6.method232(0);
								anInt849 = 0;
							}
							this.aClass1_Sub1_Sub3_6.method227(113);
							this.aClass1_Sub1_Sub3_6.method229(local33);
						}
					}
					if (local28 == 633) {
						local61 = this.method690(local18, 0, 0, 2, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0], 0, false, 0, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0], 0, local23);
						if (!local61) {
							this.method690(local18, 0, 1, 2, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0], 0, false, 0, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0], 1, local23);
						}
						this.anInt961 = super.anInt834;
						this.anInt962 = super.anInt835;
						this.anInt964 = 2;
						this.anInt963 = 0;
						if ((this.anInt1044 & 0x3) == 0) {
							anInt953++;
						}
						if (anInt953 >= 105) {
							this.aClass1_Sub1_Sub3_6.method227(35);
							this.aClass1_Sub1_Sub3_6.method228(54);
							anInt953 = 0;
						}
						this.aClass1_Sub1_Sub3_6.method227(34);
						this.aClass1_Sub1_Sub3_6.method264(local23 + this.anInt1044);
						this.aClass1_Sub1_Sub3_6.method265(local33);
						this.aClass1_Sub1_Sub3_6.method265(local18 + this.anInt1043);
					}
					if (local28 == 924 && !this.aBoolean198) {
						this.aClass1_Sub1_Sub3_6.method227(184);
						this.aClass1_Sub1_Sub3_6.method229(local23);
						this.aBoolean198 = true;
					}
					if (local28 == 338) {
						local201 = this.aClass1_Sub1_Sub2_Sub2_Sub1Array1[local33];
						if (local201 != null) {
							this.method690(local201.anIntArray87[0], 0, 1, 2, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0], 0, false, 0, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0], 1, local201.anIntArray88[0]);
							this.anInt961 = super.anInt834;
							this.anInt962 = super.anInt835;
							this.anInt964 = 2;
							this.anInt963 = 0;
							this.aClass1_Sub1_Sub3_6.method227(177);
							this.aClass1_Sub1_Sub3_6.method229(local33);
						}
					}
					if (local28 == 187) {
						local262 = this.aClass1_Sub1_Sub2_Sub2_Sub2Array1[local33];
						if (local262 != null) {
							this.method690(local262.anIntArray87[0], 0, 1, 2, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0], 0, false, 0, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0], 1, local262.anIntArray88[0]);
							this.anInt961 = super.anInt834;
							this.anInt962 = super.anInt835;
							this.anInt964 = 2;
							this.anInt963 = 0;
							this.aClass1_Sub1_Sub3_6.method227(152);
							this.aClass1_Sub1_Sub3_6.method263(local33);
						}
					}
					if (local28 == 770 && this.method593(local33, local23, local18)) {
						this.aClass1_Sub1_Sub3_6.method227(216);
						this.aClass1_Sub1_Sub3_6.method265(this.anInt901);
						this.aClass1_Sub1_Sub3_6.method263(local23 + this.anInt1044);
						this.aClass1_Sub1_Sub3_6.method265(local33 >> 14 & 0x7FFF);
						this.aClass1_Sub1_Sub3_6.method264(local18 + this.anInt1043);
					}
					if (local28 == 3) {
						this.aClass1_Sub1_Sub3_6.method227(255);
						this.aClass1_Sub1_Sub3_6.method264(local33);
						this.aClass1_Sub1_Sub3_6.method264(local23);
						this.aClass1_Sub1_Sub3_6.method264(local18);
						this.anInt1024 = 0;
						this.anInt1025 = local23;
						this.anInt1026 = local18;
						this.anInt1027 = 2;
						if (Class43.aClass43Array1[local23].anInt703 == this.anInt895) {
							this.anInt1027 = 1;
						}
						if (Class43.aClass43Array1[local23].anInt703 == this.anInt914) {
							this.anInt1027 = 3;
						}
					}
					if (local28 == 943) {
						local61 = this.method690(local18, 0, 0, 2, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0], 0, false, 0, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0], 0, local23);
						if (!local61) {
							this.method690(local18, 0, 1, 2, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0], 0, false, 0, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0], 1, local23);
						}
						this.anInt961 = super.anInt834;
						this.anInt962 = super.anInt835;
						this.anInt964 = 2;
						this.anInt963 = 0;
						this.aClass1_Sub1_Sub3_6.method227(124);
						this.aClass1_Sub1_Sub3_6.method263(local18 + this.anInt1043);
						this.aClass1_Sub1_Sub3_6.method229(local23 + this.anInt1044);
						this.aClass1_Sub1_Sub3_6.method264(local33);
					}
					if (local28 == 743) {
						this.aClass1_Sub1_Sub3_6.method227(100);
						this.aClass1_Sub1_Sub3_6.method229(local33);
						this.aClass1_Sub1_Sub3_6.method265(local18);
						this.aClass1_Sub1_Sub3_6.method264(local23);
						this.anInt1024 = 0;
						this.anInt1025 = local23;
						this.anInt1026 = local18;
						this.anInt1027 = 2;
						if (Class43.aClass43Array1[local23].anInt703 == this.anInt895) {
							this.anInt1027 = 1;
						}
						if (Class43.aClass43Array1[local23].anInt703 == this.anInt914) {
							this.anInt1027 = 3;
						}
					}
					if (local28 == 1752) {
						local1826 = Class27.method308(local33);
						@Pc(2890) Class43 local2890 = Class43.aClass43Array1[local23];
						if (local2890 != null && local2890.anIntArray174[local18] >= 100000) {
							local1835 = local2890.anIntArray174[local18] + " x " + local1826.aString6;
						} else if (local1826.aByteArray6 == null) {
							local1835 = "It's a " + local1826.aString6 + ".";
						} else {
							local1835 = new String(local1826.aByteArray6);
						}
						this.method630(0, local1835, "", (byte) 4);
					}
					if (local28 == 237) {
						local262 = this.aClass1_Sub1_Sub2_Sub2_Sub2Array1[local33];
						if (local262 != null) {
							this.method690(local262.anIntArray87[0], 0, 1, 2, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0], 0, false, 0, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0], 1, local262.anIntArray88[0]);
							this.anInt961 = super.anInt834;
							this.anInt962 = super.anInt835;
							this.anInt964 = 2;
							this.anInt963 = 0;
							this.aClass1_Sub1_Sub3_6.method227(252);
							this.aClass1_Sub1_Sub3_6.method265(this.anInt1020);
							this.aClass1_Sub1_Sub3_6.method229(this.anInt1019);
							this.aClass1_Sub1_Sub3_6.method229(this.anInt1021);
							this.aClass1_Sub1_Sub3_6.method229(local33);
						}
					}
					if (local28 == 947) {
						this.aClass1_Sub1_Sub3_6.method227(207);
						this.aClass1_Sub1_Sub3_6.method229(local23);
						this.aClass1_Sub1_Sub3_6.method263(local18);
						this.aClass1_Sub1_Sub3_6.method265(local33);
						this.anInt1024 = 0;
						this.anInt1025 = local23;
						this.anInt1026 = local18;
						this.anInt1027 = 2;
						if (Class43.aClass43Array1[local23].anInt703 == this.anInt895) {
							this.anInt1027 = 1;
						}
						if (Class43.aClass43Array1[local23].anInt703 == this.anInt914) {
							this.anInt1027 = 3;
						}
					}
					if (local28 == 904) {
						local655 = this.aStringArray10[arg0];
						local659 = local655.indexOf("@whi@");
						if (local659 != -1) {
							local670 = Class49.method538(local655.substring(local659 + 5).trim());
							local1352 = -1;
							for (@Pc(3100) int local3100 = 0; local3100 < this.anInt919; local3100++) {
								if (this.aLongArray4[local3100] == local670) {
									local1352 = local3100;
									break;
								}
							}
							if (local1352 != -1 && this.anIntArray267[local1352] > 0) {
								this.aBoolean242 = true;
								this.anInt1041 = 0;
								this.aBoolean216 = true;
								this.aString27 = "";
								this.anInt987 = 3;
								this.aLong32 = this.aLongArray4[local1352];
								this.aString30 = "Enter message to send to " + this.aStringArray8[local1352];
							}
						}
					}
					if (local28 == 877) {
						local367 = Class43.aClass43Array1[local23];
						this.anInt900 = 1;
						this.anInt901 = local23;
						this.anInt902 = local367.anInt693;
						this.anInt1018 = 0;
						this.aBoolean232 = true;
						local1835 = local367.aString12;
						if (local1835.indexOf(" ") != -1) {
							local1835 = local1835.substring(0, local1835.indexOf(" "));
						}
						local341 = local367.aString12;
						if (local341.indexOf(" ") != -1) {
							local341 = local341.substring(local341.indexOf(" ") + 1);
						}
						this.aString21 = local1835 + " " + local367.aString14 + " " + local341;
						if (this.anInt902 == 16) {
							this.aBoolean232 = true;
							this.anInt967 = 3;
							this.aBoolean213 = true;
						}
					} else {
						if (local28 == 701 && this.method593(local33, local23, local18)) {
							this.aClass1_Sub1_Sub3_6.method227(29);
							this.aClass1_Sub1_Sub3_6.method229(local18 + this.anInt1043);
							this.aClass1_Sub1_Sub3_6.method263(local33 >> 14 & 0x7FFF);
							this.aClass1_Sub1_Sub3_6.method263(this.anInt1020);
							this.aClass1_Sub1_Sub3_6.method229(this.anInt1021);
							this.aClass1_Sub1_Sub3_6.method265(this.anInt1019);
							this.aClass1_Sub1_Sub3_6.method229(local23 + this.anInt1044);
						}
						if (local28 == 1043) {
							this.method593(local33, local23, local18);
							this.aClass1_Sub1_Sub3_6.method227(185);
							this.aClass1_Sub1_Sub3_6.method229(local33 >> 14 & 0x7FFF);
							this.aClass1_Sub1_Sub3_6.method264(local23 + this.anInt1044);
							this.aClass1_Sub1_Sub3_6.method229(local18 + this.anInt1043);
						}
						if (local28 == 707) {
							this.method593(local33, local23, local18);
							this.aClass1_Sub1_Sub3_6.method227(208);
							this.aClass1_Sub1_Sub3_6.method263(local18 + this.anInt1043);
							this.aClass1_Sub1_Sub3_6.method263(local33 >> 14 & 0x7FFF);
							this.aClass1_Sub1_Sub3_6.method263(local23 + this.anInt1044);
						}
						if (local28 == 389) {
							local61 = this.method690(local18, 0, 0, 2, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0], 0, false, 0, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0], 0, local23);
							if (!local61) {
								this.method690(local18, 0, 1, 2, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0], 0, false, 0, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0], 1, local23);
							}
							this.anInt961 = super.anInt834;
							this.anInt962 = super.anInt835;
							this.anInt964 = 2;
							this.anInt963 = 0;
							this.aClass1_Sub1_Sub3_6.method227(120);
							this.aClass1_Sub1_Sub3_6.method263(local18 + this.anInt1043);
							this.aClass1_Sub1_Sub3_6.method263(this.anInt1021);
							this.aClass1_Sub1_Sub3_6.method229(this.anInt1020);
							this.aClass1_Sub1_Sub3_6.method264(this.anInt1019);
							this.aClass1_Sub1_Sub3_6.method265(local33);
							this.aClass1_Sub1_Sub3_6.method229(local23 + this.anInt1044);
						}
						if (local28 == 300) {
							this.aClass1_Sub1_Sub3_6.method227(40);
							this.aClass1_Sub1_Sub3_6.method229(local33);
							this.aClass1_Sub1_Sub3_6.method264(local18);
							this.aClass1_Sub1_Sub3_6.method264(local23);
							this.anInt1024 = 0;
							this.anInt1025 = local23;
							this.anInt1026 = local18;
							this.anInt1027 = 2;
							if (Class43.aClass43Array1[local23].anInt703 == this.anInt895) {
								this.anInt1027 = 1;
							}
							if (Class43.aClass43Array1[local23].anInt703 == this.anInt914) {
								this.anInt1027 = 3;
							}
						}
						this.anInt1018 = 0;
						this.anInt900 = 0;
						this.aBoolean232 = true;
					}
				}
			}
		} catch (@Pc(3551) RuntimeException local3551) {
			signlink.reporterror("7662, " + arg0 + ", " + 16655 + ", " + local3551.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!DHMMFTZG;)V")
	private void method621(@OriginalArg(1) Class1_Sub2 arg0) {
		try {
			@Pc(7) int local7 = 0;
			@Pc(9) int local9 = -1;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			if (arg0.anInt87 == 0) {
				local7 = this.aClass45_1.method491(arg0.anInt86, arg0.anInt88, arg0.anInt89);
			}
			if (arg0.anInt87 == 1) {
				local7 = this.aClass45_1.method492(arg0.anInt89, arg0.anInt86, arg0.anInt88);
			}
			if (arg0.anInt87 == 2) {
				local7 = this.aClass45_1.method493(arg0.anInt86, arg0.anInt88, arg0.anInt89);
			}
			if (arg0.anInt87 == 3) {
				local7 = this.aClass45_1.method494(arg0.anInt86, arg0.anInt88, arg0.anInt89);
			}
			if (local7 != 0) {
				@Pc(82) int local82 = this.aClass45_1.method495(arg0.anInt86, arg0.anInt88, arg0.anInt89, local7);
				local9 = local7 >> 14 & 0x7FFF;
				local11 = local82 & 0x1F;
				local13 = local82 >> 6;
			}
			arg0.anInt90 = local9;
			arg0.anInt92 = local11;
			arg0.anInt91 = local13;
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("4175, " + 107 + ", " + arg0 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method622() {
		try {
			for (@Pc(6) Class1_Sub1_Sub2_Sub4 local6 = (Class1_Sub1_Sub2_Sub4) this.aClass32_10.method336(); local6 != null; local6 = (Class1_Sub1_Sub2_Sub4) this.aClass32_10.method338()) {
				if (local6.anInt306 != this.anInt850 || anInt907 > local6.anInt304) {
					local6.method544();
				} else if (anInt907 >= local6.anInt303) {
					if (local6.anInt313 > 0) {
						@Pc(41) Class1_Sub1_Sub2_Sub2_Sub2 local41 = this.aClass1_Sub1_Sub2_Sub2_Sub2Array1[local6.anInt313 - 1];
						if (local41 != null && local41.anInt497 >= 0 && local41.anInt497 < 13312 && local41.anInt498 >= 0 && local41.anInt498 < 13312) {
							local6.method218(this.method692(local41.anInt498, local41.anInt497, local6.anInt306) - local6.anInt310, local41.anInt497, local41.anInt498, anInt907);
						}
					}
					if (local6.anInt313 < 0) {
						@Pc(86) int local86 = -local6.anInt313 - 1;
						@Pc(92) Class1_Sub1_Sub2_Sub2_Sub1 local92;
						if (local86 == this.anInt966) {
							local92 = aClass1_Sub1_Sub2_Sub2_Sub1_1;
						} else {
							local92 = this.aClass1_Sub1_Sub2_Sub2_Sub1Array1[local86];
						}
						if (local92 != null && local92.anInt497 >= 0 && local92.anInt497 < 13312 && local92.anInt498 >= 0 && local92.anInt498 < 13312) {
							local6.method218(this.method692(local92.anInt498, local92.anInt497, local6.anInt306) - local6.anInt310, local92.anInt497, local92.anInt498, anInt907);
						}
					}
					local6.method217(this.anInt994, this.anInt840);
					this.aClass45_1.method476((int) local6.aDouble7, -1, 60, false, this.anInt850, (int) local6.aDouble5, local6, (int) local6.aDouble6, local6.anInt315);
				}
			}
		} catch (@Pc(173) RuntimeException local173) {
			signlink.reporterror("35379, " + 0 + ", " + local173.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method623() {
		try {
			if (aBoolean226 && this.anInt908 == 2 && Class3.anInt13 != this.anInt850) {
				this.aClass7_23.method92();
				this.aClass1_Sub1_Sub1_Sub3_3.method379(151, 257, "Loading - please wait.", 0);
				this.aClass1_Sub1_Sub1_Sub3_3.method379(150, 256, "Loading - please wait.", 16777215);
				this.aClass7_23.method93(super.aGraphics2, 4, 4);
				this.anInt908 = 1;
				this.aLong33 = System.currentTimeMillis();
			}
			if (this.anInt908 == 1) {
				@Pc(62) int local62 = this.method624();
				if (local62 != 0 && System.currentTimeMillis() - this.aLong33 > 360000L) {
					signlink.reporterror(this.aString23 + " glcfb " + this.aLong29 + "," + local62 + "," + aBoolean226 + "," + this.aClass21Array1[0] + "," + this.aClass31_Sub1_1.method533() + "," + this.anInt850 + "," + this.anInt938 + "," + this.anInt939);
					this.aLong33 = System.currentTimeMillis();
				}
			}
			if (this.anInt908 == 2 && this.anInt850 != this.anInt1028) {
				this.anInt1028 = this.anInt850;
				this.method606(this.anInt850);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("36554, " + 21 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)I")
	private int method624() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray5.length; local3++) {
				if (this.aByteArrayArray5[local3] == null && this.anIntArray219[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray4[local3] == null && this.anIntArray220[local3] != -1) {
					return -2;
				}
			}
			this.anInt887 += 0;
			@Pc(45) boolean local45 = true;
			for (@Pc(47) int local47 = 0; local47 < this.aByteArrayArray5.length; local47++) {
				@Pc(54) byte[] local54 = this.aByteArrayArray4[local47];
				if (local54 != null) {
					@Pc(68) int local68 = (this.anIntArray218[local47] >> 8) * 64 - this.anInt1043;
					@Pc(80) int local80 = (this.anIntArray218[local47] & 0xFF) * 64 - this.anInt1044;
					if (this.aBoolean221) {
						local68 = 10;
						local80 = 10;
					}
					local45 &= Class3.method26(local80, local54, local68);
				}
			}
			if (!local45) {
				return -3;
			} else if (this.aBoolean203) {
				return -4;
			} else {
				this.anInt908 = 2;
				Class3.anInt13 = this.anInt850;
				this.method650();
				this.aClass1_Sub1_Sub3_6.method227(88);
				return 0;
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("91938, " + 0 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IJ)V")
	private void method625(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(11) int local11 = 0; local11 < this.anInt919; local11++) {
					if (this.aLongArray4[local11] == arg0) {
						this.anInt919--;
						this.aBoolean232 = true;
						for (@Pc(31) int local31 = local11; local31 < this.anInt919; local31++) {
							this.aStringArray8[local31] = this.aStringArray8[local31 + 1];
							this.anIntArray267[local31] = this.anIntArray267[local31 + 1];
							this.aLongArray4[local31] = this.aLongArray4[local31 + 1];
						}
						this.aClass1_Sub1_Sub3_6.method227(193);
						this.aClass1_Sub1_Sub3_6.method234(arg0);
						return;
					}
				}
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("75714, " + 653 + ", " + arg0 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method626() {
		try {
			this.anInt943 = 0;
			@Pc(16) int local16 = (aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt497 >> 7) + this.anInt1043;
			@Pc(24) int local24 = (aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt498 >> 7) + this.anInt1044;
			if (local16 >= 3053 && local16 <= 3156 && local24 >= 3056 && local24 <= 3136) {
				this.anInt943 = 1;
			}
			if (local16 >= 3072 && local16 <= 3118 && local24 >= 9492 && local24 <= 9535) {
				this.anInt943 = 1;
			}
			if (this.anInt943 == 1 && local16 >= 3139 && local16 <= 3199 && local24 >= 3008 && local24 <= 3062) {
				this.anInt943 = 0;
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("57219, " + -34462 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IJ)V")
	private void method627(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt919 >= 100 && this.anInt894 != 1) {
					this.method630(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "", (byte) 4);
				} else if (this.anInt919 >= 200) {
					this.method630(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "", (byte) 4);
				} else {
					@Pc(38) String local38 = Class49.method542(Class49.method539(arg0));
					for (@Pc(40) int local40 = 0; local40 < this.anInt919; local40++) {
						if (this.aLongArray4[local40] == arg0) {
							this.method630(0, local38 + " is already on your friend list", "", (byte) 4);
							return;
						}
					}
					for (@Pc(70) int local70 = 0; local70 < this.anInt969; local70++) {
						if (this.aLongArray3[local70] == arg0) {
							this.method630(0, "Please remove " + local38 + " from your ignore list first", "", (byte) 4);
							return;
						}
					}
					if (!local38.equals(aClass1_Sub1_Sub2_Sub2_Sub1_1.aString5)) {
						this.aStringArray8[this.anInt919] = local38;
						this.aLongArray4[this.anInt919] = arg0;
						this.anIntArray267[this.anInt919] = 0;
						this.anInt919++;
						this.aBoolean232 = true;
						this.aClass1_Sub1_Sub3_6.method227(217);
						this.aClass1_Sub1_Sub3_6.method234(arg0);
					}
				}
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("78682, " + -47898 + ", " + arg0 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method628() {
		try {
			this.anInt851++;
			this.method651(237, true);
			this.method689(true);
			this.method651(237, false);
			this.method689(false);
			this.method622();
			this.method587();
			@Pc(35) int local35;
			@Pc(74) int local74;
			if (!this.aBoolean208) {
				local35 = this.anInt1004;
				if (this.anInt861 / 256 > local35) {
					local35 = this.anInt861 / 256;
				}
				if (this.aBooleanArray11[4] && this.anIntArray217[4] + 128 > local35) {
					local35 = this.anIntArray217[4] + 128;
				}
				local74 = this.anInt1005 + this.anInt990 & 0x7FF;
				this.method638(this.method692(aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt498, aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt497, this.anInt850) - 50, local35 * 3 + 600, this.anInt995, local74, this.anInt996, local35);
			}
			if (this.aBoolean208) {
				local35 = this.method710();
			} else {
				local35 = this.method709(this.aByte59);
			}
			local74 = this.anInt1033;
			@Pc(119) int local119 = this.anInt1034;
			@Pc(122) int local122 = this.anInt1035;
			@Pc(125) int local125 = this.anInt1036;
			@Pc(128) int local128 = this.anInt1037;
			@Pc(177) int local177;
			for (@Pc(130) int local130 = 0; local130 < 5; local130++) {
				if (this.aBooleanArray11[local130]) {
					local177 = (int) (Math.random() * (double) (this.anIntArray252[local130] * 2 + 1) - (double) this.anIntArray252[local130] + Math.sin((double) this.anIntArray234[local130] * ((double) this.anIntArray265[local130] / 100.0D)) * (double) this.anIntArray217[local130]);
					if (local130 == 0) {
						this.anInt1033 += local177;
					}
					if (local130 == 1) {
						this.anInt1034 += local177;
					}
					if (local130 == 2) {
						this.anInt1035 += local177;
					}
					if (local130 == 3) {
						this.anInt1037 = this.anInt1037 + local177 & 0x7FF;
					}
					if (local130 == 4) {
						this.anInt1036 += local177;
						if (this.anInt1036 < 128) {
							this.anInt1036 = 128;
						}
						if (this.anInt1036 > 383) {
							this.anInt1036 = 383;
						}
					}
				}
			}
			local177 = Class1_Sub1_Sub1_Sub1.anInt55;
			Class1_Sub1_Sub2_Sub6.aBoolean131 = true;
			Class1_Sub1_Sub2_Sub6.anInt626 = 0;
			Class1_Sub1_Sub2_Sub6.anInt624 = super.anInt828 - 4;
			Class1_Sub1_Sub2_Sub6.anInt625 = super.anInt829 - 4;
			Class1_Sub1_Sub1.method549(this.aBoolean204);
			this.aClass45_1.method504(local35, this.anInt1035, this.anInt1036, this.anInt1037, this.anInt1033, this.anInt1034);
			this.aClass45_1.method479();
			this.method677();
			this.method660();
			this.method607(local177);
			this.method703();
			this.aClass7_23.method93(super.aGraphics2, 4, 4);
			this.anInt1033 = local74;
			this.anInt1034 = local119;
			this.anInt1035 = local122;
			this.anInt1036 = local125;
			this.anInt1037 = local128;
		} catch (@Pc(322) RuntimeException local322) {
			signlink.reporterror("71668, " + -830 + ", " + local322.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!TNOPEJNZ;II)I")
	private int method629(@OriginalArg(0) Class43 arg0, @OriginalArg(2) int arg1) {
		try {
			if (arg0.anIntArrayArray17 == null || arg1 >= arg0.anIntArrayArray17.length) {
				return -2;
			}
			try {
				@Pc(20) int[] local20 = arg0.anIntArrayArray17[arg1];
				@Pc(22) int local22 = 0;
				@Pc(24) int local24 = 0;
				@Pc(26) byte local26 = 0;
				while (true) {
					@Pc(31) int local31 = local20[local24++];
					@Pc(33) int local33 = 0;
					@Pc(35) byte local35 = 0;
					if (local31 == 0) {
						return local22;
					}
					if (local31 == 1) {
						local33 = this.anIntArray248[local20[local24++]];
					}
					if (local31 == 2) {
						local33 = this.anIntArray264[local20[local24++]];
					}
					if (local31 == 3) {
						local33 = this.anIntArray233[local20[local24++]];
					}
					@Pc(82) Class43 local82;
					@Pc(87) int local87;
					@Pc(100) int local100;
					if (local31 == 4) {
						local82 = Class43.aClass43Array1[local20[local24++]];
						local87 = local20[local24++];
						if (local87 >= 0 && local87 < Class27.anInt437 && (!Class27.method308(local87).aBoolean94 || aBoolean225)) {
							for (local100 = 0; local100 < local82.anIntArray177.length; local100++) {
								if (local82.anIntArray177[local100] == local87 + 1) {
									local33 += local82.anIntArray174[local100];
								}
							}
						}
					}
					if (local31 == 5) {
						local33 = this.anIntArray263[local20[local24++]];
					}
					if (local31 == 6) {
						local33 = anIntArray240[this.anIntArray264[local20[local24++]] - 1];
					}
					if (local31 == 7) {
						local33 = this.anIntArray263[local20[local24++]] * 100 / 46875;
					}
					if (local31 == 8) {
						local33 = aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt266;
					}
					@Pc(175) int local175;
					if (local31 == 9) {
						for (local175 = 0; local175 < Class10.anInt128; local175++) {
							if (Class10.aBooleanArray2[local175]) {
								local33 += this.anIntArray264[local175];
							}
						}
					}
					if (local31 == 10) {
						local82 = Class43.aClass43Array1[local20[local24++]];
						local87 = local20[local24++] + 1;
						if (local87 >= 0 && local87 < Class27.anInt437 && (!Class27.method308(local87).aBoolean94 || aBoolean225)) {
							for (local100 = 0; local100 < local82.anIntArray177.length; local100++) {
								if (local82.anIntArray177[local100] == local87) {
									local33 = 999999999;
									break;
								}
							}
						}
					}
					if (local31 == 11) {
						local33 = this.anInt978;
					}
					if (local31 == 12) {
						local33 = this.anInt883;
					}
					if (local31 == 13) {
						local175 = this.anIntArray263[local20[local24++]];
						local87 = local20[local24++];
						local33 = (local175 & 0x1 << local87) == 0 ? 0 : 1;
					}
					if (local31 == 14) {
						local175 = local20[local24++];
						@Pc(290) Class2 local290 = Class2.aClass2Array1[local175];
						local100 = local290.anInt3;
						@Pc(296) int local296 = local290.anInt4;
						@Pc(299) int local299 = local290.anInt5;
						@Pc(305) int local305 = anIntArray271[local299 - local296];
						local33 = this.anIntArray263[local100] >> local296 & local305;
					}
					if (local31 == 15) {
						local35 = 1;
					}
					if (local31 == 16) {
						local35 = 2;
					}
					if (local31 == 17) {
						local35 = 3;
					}
					if (local31 == 18) {
						local33 = (aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt497 >> 7) + this.anInt1043;
					}
					if (local31 == 19) {
						local33 = (aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt498 >> 7) + this.anInt1044;
					}
					if (local31 == 20) {
						local33 = local20[local24++];
					}
					if (local35 == 0) {
						if (local26 == 0) {
							local22 += local33;
						}
						if (local26 == 1) {
							local22 -= local33;
						}
						if (local26 == 2 && local33 != 0) {
							local22 /= local33;
						}
						if (local26 == 3) {
							local22 *= local33;
						}
						local26 = 0;
					} else {
						local26 = local35;
					}
				}
			} catch (@Pc(398) Exception local398) {
				return -1;
			}
		} catch (@Pc(401) RuntimeException local401) {
			signlink.reporterror("90799, " + arg0 + ", " + -66 + ", " + arg1 + ", " + local401.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;B)V")
	private void method630(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) byte arg3) {
		try {
			if (arg0 == 0 && this.anInt965 != -1) {
				this.aString18 = arg1;
				super.anInt833 = 0;
			}
			if (this.anInt914 == -1) {
				this.aBoolean242 = true;
			}
			for (@Pc(22) int local22 = 99; local22 > 0; local22--) {
				this.anIntArray268[local22] = this.anIntArray268[local22 - 1];
				this.aStringArray11[local22] = this.aStringArray11[local22 - 1];
				this.aStringArray12[local22] = this.aStringArray12[local22 - 1];
			}
			this.anIntArray268[0] = arg0;
			this.aStringArray11[0] = arg2;
			@Pc(72) boolean local72 = false;
			this.aStringArray12[0] = arg1;
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("29378, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method631(@OriginalArg(1) int arg0) {
		try {
			@Pc(10) Class43 local10 = Class43.aClass43Array1[arg0];
			for (@Pc(12) int local12 = 0; local12 < local10.anIntArray178.length && local10.anIntArray178[local12] != -1; local12++) {
				@Pc(27) Class43 local27 = Class43.aClass43Array1[local10.anIntArray178[local12]];
				if (local27.anInt708 == 1) {
					this.method631(local27.anInt694);
				}
				local27.anInt700 = 0;
				local27.anInt709 = 0;
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("63021, " + false + ", " + arg0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method632() {
		try {
			this.aBoolean215 &= true;
			try {
				@Pc(13) int local13 = aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt497 + this.anInt924;
				@Pc(19) int local19 = aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt498 + this.anInt872;
				if (this.anInt995 - local13 < -500 || this.anInt995 - local13 > 500 || this.anInt996 - local19 < -500 || this.anInt996 - local19 > 500) {
					this.anInt995 = local13;
					this.anInt996 = local19;
				}
				if (this.anInt995 != local13) {
					this.anInt995 += (local13 - this.anInt995) / 16;
				}
				if (this.anInt996 != local19) {
					this.anInt996 += (local19 - this.anInt996) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt1006 += (-this.anInt1006 - 24) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt1006 += (24 - this.anInt1006) / 2;
				} else {
					this.anInt1006 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt1007 += (12 - this.anInt1007) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt1007 += (-this.anInt1007 - 12) / 2;
				} else {
					this.anInt1007 /= 2;
				}
				this.anInt1005 = this.anInt1005 + this.anInt1006 / 2 & 0x7FF;
				this.anInt1004 += this.anInt1007 / 2;
				if (this.anInt1004 < 128) {
					this.anInt1004 = 128;
				}
				if (this.anInt1004 > 383) {
					this.anInt1004 = 383;
				}
				@Pc(206) int local206 = this.anInt995 >> 7;
				@Pc(211) int local211 = this.anInt996 >> 7;
				@Pc(221) int local221 = this.method692(this.anInt996, this.anInt995, this.anInt850);
				@Pc(223) int local223 = 0;
				@Pc(239) int local239;
				if (local206 > 3 && local211 > 3 && local206 < 100 && local211 < 100) {
					for (local239 = local206 - 4; local239 <= local206 + 4; local239++) {
						for (@Pc(245) int local245 = local211 - 4; local245 <= local211 + 4; local245++) {
							@Pc(250) int local250 = this.anInt850;
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
				if (local239 > this.anInt861) {
					this.anInt861 += (local239 - this.anInt861) / 24;
				} else if (local239 < this.anInt861) {
					this.anInt861 += (local239 - this.anInt861) / 80;
				}
			} catch (@Pc(341) Exception local341) {
				signlink.reporterror("glfc_ex " + aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt497 + "," + aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt498 + "," + this.anInt995 + "," + this.anInt996 + "," + this.anInt938 + "," + this.anInt939 + "," + this.anInt1043 + "," + this.anInt1044);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(391) RuntimeException local391) {
			signlink.reporterror("98391, " + true + ", " + local391.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZIII)Lclient!HRXSNEYZ;")
	private Class15 method633(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(3) byte[] local3 = null;
			@Pc(5) int local5 = 5;
			try {
				if (this.aClass21Array1[0] != null) {
					local3 = this.aClass21Array1[0].method288(arg2);
				}
			} catch (@Pc(20) Exception local20) {
			}
			@Pc(34) int local34;
			if (local3 != null) {
				this.aCRC32_2.reset();
				this.aCRC32_2.update(local3);
				local34 = (int) this.aCRC32_2.getValue();
				if (local34 != arg4) {
					local3 = null;
				}
			}
			if (local3 != null) {
				return new Class15(local3, (byte) 6);
			}
			local34 = 0;
			while (local3 == null) {
				@Pc(55) String local55 = "Unknown error";
				this.method580("Requesting " + arg1, arg3, (byte) 3);
				@Pc(70) int local70;
				try {
					local70 = 0;
					@Pc(81) DataInputStream local81 = this.method613(arg0 + arg4);
					@Pc(84) byte[] local84 = new byte[6];
					local81.readFully(local84, 0, 6);
					@Pc(95) Class1_Sub1_Sub3 local95 = new Class1_Sub1_Sub3(local84, 8);
					local95.anInt352 = 3;
					@Pc(103) int local103 = local95.method242() + 6;
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
							this.method580("Loading " + arg1 + " - " + local168 + "%", arg3, (byte) 3);
						}
						local70 = local168;
					}
					local81.close();
					try {
						if (this.aClass21Array1[0] != null) {
							this.aClass21Array1[0].method289(local3, arg2, local3.length);
						}
					} catch (@Pc(213) Exception local213) {
						this.aClass21Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local3);
						local128 = (int) this.aCRC32_2.getValue();
						if (local128 != arg4) {
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
							this.method580("Game updated - please reload page", arg3, (byte) 3);
							local70 = 10;
						} else {
							this.method580(local55 + " - Retrying in " + local70, arg3, (byte) 3);
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
					this.aBoolean230 = !this.aBoolean230;
				}
			}
			@Pc(349) Class15 local349 = new Class15(local3, (byte) 6);
			this.aBoolean215 &= true;
			return local349;
		} catch (@Pc(358) RuntimeException local358) {
			signlink.reporterror("15035, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local358.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)Z")
	private boolean method634(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(17) int local17 = this.anIntArray261[arg0];
			if (local17 >= 2000) {
				local17 -= 2000;
			}
			return local17 == 217;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("98912, " + true + ", " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method635(@OriginalArg(0) int arg0) {
		try {
			@Pc(8) int local8 = Class12.aClass12Array1[arg0].anInt136;
			if (local8 != 0) {
				@Pc(16) int local16 = this.anIntArray263[arg0];
				if (local8 == 1) {
					if (local16 == 1) {
						Class1_Sub1_Sub1_Sub1.method64(0.9D, 932);
					}
					if (local16 == 2) {
						Class1_Sub1_Sub1_Sub1.method64(0.8D, 932);
					}
					if (local16 == 3) {
						Class1_Sub1_Sub1_Sub1.method64(0.7D, 932);
					}
					if (local16 == 4) {
						Class1_Sub1_Sub1_Sub1.method64(0.6D, 932);
					}
					Class27.aClass30_2.method331();
					this.aBoolean233 = true;
				}
				if (local8 == 3) {
					@Pc(54) boolean local54 = this.aBoolean223;
					if (local16 == 0) {
						this.method696(this.aBoolean223, 0);
						this.aBoolean223 = true;
					}
					if (local16 == 1) {
						this.method696(this.aBoolean223, -400);
						this.aBoolean223 = true;
					}
					if (local16 == 2) {
						this.method696(this.aBoolean223, -800);
						this.aBoolean223 = true;
					}
					if (local16 == 3) {
						this.method696(this.aBoolean223, -1200);
						this.aBoolean223 = true;
					}
					if (local16 == 4) {
						this.aBoolean223 = false;
					}
					if (this.aBoolean223 != local54 && !aBoolean226) {
						if (this.aBoolean223) {
							this.anInt913 = this.anInt864;
							this.aBoolean211 = true;
							this.aClass31_Sub1_1.method529(2, this.anInt913);
						} else {
							this.method608();
						}
						this.anInt839 = 0;
					}
				}
				if (local8 == 4) {
					if (local16 == 0) {
						this.aBoolean236 = true;
						this.method670(0);
					}
					if (local16 == 1) {
						this.aBoolean236 = true;
						this.method670(-400);
					}
					if (local16 == 2) {
						this.aBoolean236 = true;
						this.method670(-800);
					}
					if (local16 == 3) {
						this.aBoolean236 = true;
						this.method670(-1200);
					}
					if (local16 == 4) {
						this.aBoolean236 = false;
					}
				}
				if (local8 == 5) {
					this.anInt1040 = local16;
				}
				if (local8 == 6) {
					this.anInt989 = local16;
				}
				if (local8 == 8) {
					this.anInt862 = local16;
					this.aBoolean242 = true;
				}
				if (local8 == 9) {
					this.anInt1008 = local16;
				}
			}
		} catch (@Pc(214) RuntimeException local214) {
			signlink.reporterror("27542, " + arg0 + ", " + true + ", " + local214.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIZII)V")
	private void method636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			if (arg5) {
				this.anInt928 = this.aClass50_2.method565();
			}
			if (arg7 >= 1 && arg4 >= 1 && arg7 <= 102 && arg4 <= 102) {
				if (aBoolean226 && arg2 != this.anInt850) {
					return;
				}
				@Pc(27) int local27 = 0;
				if (arg6 == 0) {
					local27 = this.aClass45_1.method491(arg2, arg7, arg4);
				}
				if (arg6 == 1) {
					local27 = this.aClass45_1.method492(arg4, arg2, arg7);
				}
				if (arg6 == 2) {
					local27 = this.aClass45_1.method493(arg2, arg7, arg4);
				}
				if (arg6 == 3) {
					local27 = this.aClass45_1.method494(arg2, arg7, arg4);
				}
				@Pc(83) int local83;
				if (local27 != 0) {
					local83 = this.aClass45_1.method495(arg2, arg7, arg4, local27);
					@Pc(89) int local89 = local27 >> 14 & 0x7FFF;
					@Pc(93) int local93 = local83 & 0x1F;
					@Pc(97) int local97 = local83 >> 6;
					@Pc(109) Class41 local109;
					if (arg6 == 0) {
						this.aClass45_1.method482(arg2, arg7, arg4);
						local109 = Class41.method452(local89);
						if (local109.aBoolean144) {
							this.aClass20Array1[arg2].method281(arg4, local93, local97, local109.aBoolean133, arg7);
						}
					}
					if (arg6 == 1) {
						this.aClass45_1.method483(arg7, arg2, arg4);
					}
					if (arg6 == 2) {
						this.aClass45_1.method484(arg2, arg7, this.aBoolean199, arg4);
						local109 = Class41.method452(local89);
						if (arg7 + local109.anInt648 > 103 || arg4 + local109.anInt648 > 103 || arg7 + local109.anInt640 > 103 || arg4 + local109.anInt640 > 103) {
							return;
						}
						if (local109.aBoolean144) {
							this.aClass20Array1[arg2].method282(local109.anInt648, arg4, arg7, local97, local109.aBoolean133, this.aByte64, local109.anInt640);
						}
					}
					if (arg6 == 3) {
						this.aClass45_1.method485(arg7, arg2, arg4);
						local109 = Class41.method452(local89);
						if (local109.aBoolean144 && local109.aBoolean141) {
							this.aClass20Array1[arg2].method284(arg7, arg4);
						}
					}
				}
				if (arg1 >= 0) {
					local83 = arg2;
					if (arg2 < 3 && (this.aByteArrayArrayArray8[1][arg7][arg4] & 0x2) == 2) {
						local83 = arg2 + 1;
					}
					Class3.method21(arg7, arg2, this.anIntArrayArrayArray8, this.aClass20Array1[arg2], arg1, arg0, arg3, arg4, this.aClass45_1, local83);
					return;
				}
			}
		} catch (@Pc(258) RuntimeException local258) {
			signlink.reporterror("50981, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local258.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)Z")
	private boolean method637(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			if (this.aClass37_1 == null) {
				return false;
			}
			@Pc(2147) String local2147;
			@Pc(207) int local207;
			try {
				@Pc(21) int local21 = this.aClass37_1.method396();
				if (local21 == 0) {
					return false;
				}
				if (this.anInt888 == -1) {
					this.aClass37_1.method397(this.aClass1_Sub1_Sub3_7.aByteArray3, 0, 1);
					this.anInt888 = this.aClass1_Sub1_Sub3_7.aByteArray3[0] & 0xFF;
					if (this.aClass50_2 != null) {
						this.anInt888 = this.anInt888 - this.aClass50_2.method565() & 0xFF;
					}
					this.anInt887 = Class22.anIntArray75[this.anInt888];
					local21--;
				}
				if (this.anInt887 == -1) {
					if (local21 <= 0) {
						return false;
					}
					this.aClass37_1.method397(this.aClass1_Sub1_Sub3_7.aByteArray3, 0, 1);
					this.anInt887 = this.aClass1_Sub1_Sub3_7.aByteArray3[0] & 0xFF;
					local21--;
				}
				if (this.anInt887 == -2) {
					if (local21 <= 1) {
						return false;
					}
					this.aClass37_1.method397(this.aClass1_Sub1_Sub3_7.aByteArray3, 0, 2);
					this.aClass1_Sub1_Sub3_7.anInt352 = 0;
					this.anInt887 = this.aClass1_Sub1_Sub3_7.method240();
					local21 -= 2;
				}
				if (local21 < this.anInt887) {
					return false;
				}
				this.aClass1_Sub1_Sub3_7.anInt352 = 0;
				this.aClass37_1.method397(this.aClass1_Sub1_Sub3_7.aByteArray3, 0, this.anInt887);
				this.anInt889 = 0;
				this.anInt982 = this.anInt981;
				this.anInt981 = this.anInt980;
				this.anInt980 = this.anInt888;
				@Pc(218) int local218;
				@Pc(228) int local228;
				@Pc(244) int local244;
				@Pc(200) int local200;
				@Pc(223) int local223;
				@Pc(233) int local233;
				if (this.anInt888 == 233) {
					this.aBoolean208 = true;
					this.anInt948 = this.aClass1_Sub1_Sub3_7.method238();
					this.anInt949 = this.aClass1_Sub1_Sub3_7.method238();
					this.anInt950 = this.aClass1_Sub1_Sub3_7.method240();
					this.anInt951 = this.aClass1_Sub1_Sub3_7.method238();
					this.anInt952 = this.aClass1_Sub1_Sub3_7.method238();
					if (this.anInt952 >= 100) {
						local200 = this.anInt948 * 128 + 64;
						local207 = this.anInt949 * 128 + 64;
						local218 = this.method692(local207, local200, this.anInt850) - this.anInt950;
						local223 = local200 - this.anInt1033;
						local228 = local218 - this.anInt1034;
						local233 = local207 - this.anInt1035;
						local244 = (int) Math.sqrt((double) (local223 * local223 + local233 * local233));
						this.anInt1036 = (int) (Math.atan2((double) local228, (double) local244) * 325.949D) & 0x7FF;
						this.anInt1037 = (int) (Math.atan2((double) local223, (double) local233) * -325.949D) & 0x7FF;
						if (this.anInt1036 < 128) {
							this.anInt1036 = 128;
						}
						if (this.anInt1036 > 383) {
							this.anInt1036 = 383;
						}
					}
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 122) {
					this.anInt957 = this.aClass1_Sub1_Sub3_7.method267();
					this.anInt998 = this.aClass1_Sub1_Sub3_7.method240();
					this.anInt930 = this.aClass1_Sub1_Sub3_7.method274();
					this.anInt979 = this.aClass1_Sub1_Sub3_7.method257();
					this.anInt879 = this.aClass1_Sub1_Sub3_7.method259();
					if (this.anInt930 != 0 && this.anInt895 == -1) {
						signlink.dnslookup(Class49.method541(this.anInt930));
						this.method664();
						@Pc(337) short local337 = 650;
						if (this.anInt979 != 201 || this.anInt879 == 1) {
							local337 = 655;
						}
						this.aString22 = "";
						this.aBoolean218 = false;
						for (local207 = 0; local207 < Class43.aClass43Array1.length; local207++) {
							if (Class43.aClass43Array1[local207] != null && Class43.aClass43Array1[local207].anInt712 == local337) {
								this.anInt895 = Class43.aClass43Array1[local207].anInt703;
								break;
							}
						}
					}
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 136) {
					this.anInt969 = this.anInt887 / 8;
					for (local200 = 0; local200 < this.anInt969; local200++) {
						this.aLongArray3[local200] = this.aClass1_Sub1_Sub3_7.method244();
					}
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 165) {
					local200 = this.aClass1_Sub1_Sub3_7.method272();
					local207 = this.aClass1_Sub1_Sub3_7.method240();
					this.anIntArray239[local207] = local200;
					if (this.anIntArray263[local207] != local200) {
						this.anIntArray263[local207] = local200;
						this.method635(local207);
						this.aBoolean232 = true;
						if (this.anInt965 != -1) {
							this.aBoolean242 = true;
						}
					}
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 91) {
					for (local200 = 0; local200 < this.anIntArray263.length; local200++) {
						if (this.anIntArray263[local200] != this.anIntArray239[local200]) {
							this.anIntArray263[local200] = this.anIntArray239[local200];
							this.method635(local200);
							this.aBoolean232 = true;
						}
					}
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 20) {
					if (this.anInt967 == 12) {
						this.aBoolean232 = true;
					}
					this.anInt978 = this.aClass1_Sub1_Sub3_7.method238();
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 63) {
					this.anInt884 = this.aClass1_Sub1_Sub3_7.method258();
					if (this.anInt884 == this.anInt967) {
						if (this.anInt884 == 3) {
							this.anInt967 = 1;
						} else {
							this.anInt967 = 3;
						}
						this.aBoolean232 = true;
					}
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 227) {
					local200 = this.aClass1_Sub1_Sub3_7.method268();
					local207 = this.aClass1_Sub1_Sub3_7.method257();
					if (local200 == 65535) {
						local200 = -1;
					}
					this.anIntArray249[local207] = local200;
					this.aBoolean232 = true;
					this.aBoolean213 = true;
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 192) {
					local200 = this.aClass1_Sub1_Sub3_7.method238();
					local207 = this.aClass1_Sub1_Sub3_7.method238();
					local218 = this.aClass1_Sub1_Sub3_7.method238();
					local223 = this.aClass1_Sub1_Sub3_7.method238();
					this.aBooleanArray11[local200] = true;
					this.anIntArray252[local200] = local207;
					this.anIntArray217[local200] = local218;
					this.anIntArray265[local200] = local223;
					this.anIntArray234[local200] = 0;
					this.anInt888 = -1;
					return true;
				}
				@Pc(667) Class43 local667;
				if (this.anInt888 == 18) {
					local200 = this.aClass1_Sub1_Sub3_7.method266();
					local207 = this.aClass1_Sub1_Sub3_7.method267();
					local667 = Class43.aClass43Array1[local200];
					if (local667 != null && local667.anInt708 == 0) {
						if (local207 < 0) {
							local207 = 0;
						}
						if (local207 > local667.anInt701 - local667.anInt707) {
							local207 = local667.anInt701 - local667.anInt707;
						}
						local667.anInt720 = local207;
					}
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 25) {
					local200 = this.aClass1_Sub1_Sub3_7.method240();
					local207 = this.aClass1_Sub1_Sub3_7.method266();
					local218 = this.aClass1_Sub1_Sub3_7.method240();
					local223 = this.aClass1_Sub1_Sub3_7.method266();
					Class43.aClass43Array1[local218].anInt714 = local223;
					Class43.aClass43Array1[local218].anInt715 = local207;
					Class43.aClass43Array1[local218].anInt713 = local200;
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 217) {
					this.anInt843 = this.aClass1_Sub1_Sub3_7.method238();
					this.anInt912 = this.aClass1_Sub1_Sub3_7.method238();
					this.anInt1022 = this.aClass1_Sub1_Sub3_7.method238();
					this.aBoolean200 = true;
					this.aBoolean242 = true;
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 232) {
					this.aBoolean216 = false;
					this.anInt1041 = 1;
					this.aString29 = "";
					this.aBoolean242 = true;
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 250) {
					this.method687(this.aClass1_Sub1_Sub3_7, this.anInt887);
					this.aBoolean203 = false;
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 245) {
					local200 = this.aClass1_Sub1_Sub3_7.method269();
					this.anInt965 = local200;
					this.aBoolean242 = true;
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 178) {
					local200 = this.aClass1_Sub1_Sub3_7.method240();
					local207 = this.aClass1_Sub1_Sub3_7.method267();
					Class43.aClass43Array1[local200].anInt689 = 1;
					Class43.aClass43Array1[local200].anInt690 = local207;
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 133) {
					local200 = this.aClass1_Sub1_Sub3_7.method240();
					if (local200 == 65535) {
						local200 = -1;
					}
					if (local200 != this.anInt864 && this.aBoolean223 && !aBoolean226 && this.anInt839 == 0) {
						this.anInt913 = local200;
						this.aBoolean211 = true;
						this.aClass31_Sub1_1.method529(2, this.anInt913);
					}
					this.anInt864 = local200;
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 24) {
					local200 = this.aClass1_Sub1_Sub3_7.method271();
					local207 = this.aClass1_Sub1_Sub3_7.method266();
					if (this.aBoolean223 && !aBoolean226) {
						this.anInt913 = local207;
						this.aBoolean211 = false;
						this.aClass31_Sub1_1.method529(2, this.anInt913);
						this.anInt839 = local200;
					}
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 163) {
					local200 = this.aClass1_Sub1_Sub3_7.method240();
					local207 = this.aClass1_Sub1_Sub3_7.method238();
					local218 = this.aClass1_Sub1_Sub3_7.method240();
					if (this.aBoolean236 && !aBoolean226 && this.anInt918 < 50) {
						this.anIntArray214[this.anInt918] = local200;
						this.anIntArray224[this.anInt918] = local207;
						this.anIntArray251[this.anInt918] = local218 + Class34.anIntArray93[local200];
						this.anInt918++;
					}
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 252) {
					this.anInt1052 = this.aClass1_Sub1_Sub3_7.method268() * 30;
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 11) {
					this.anInt940 = this.aClass1_Sub1_Sub3_7.method238();
					this.anInt888 = -1;
					return true;
				}
				@Pc(1039) long local1039;
				@Pc(1049) boolean local1049;
				@Pc(1118) String local1118;
				if (this.anInt888 == 42) {
					local1039 = this.aClass1_Sub1_Sub3_7.method244();
					local218 = this.aClass1_Sub1_Sub3_7.method243();
					local223 = this.aClass1_Sub1_Sub3_7.method238();
					local1049 = false;
					for (local233 = 0; local233 < 100; local233++) {
						if (this.anIntArray215[local233] == local218) {
							local1049 = true;
							break;
						}
					}
					if (local223 <= 1) {
						for (local244 = 0; local244 < this.anInt969; local244++) {
							if (this.aLongArray3[local244] == local1039) {
								local1049 = true;
								break;
							}
						}
					}
					if (!local1049 && this.anInt943 == 0) {
						try {
							this.anIntArray215[this.anInt881] = local218;
							this.anInt881 = (this.anInt881 + 1) % 100;
							local1118 = Class18.method221(this.anInt887 - 13, this.aClass1_Sub1_Sub3_7);
							if (local223 != 3) {
								local1118 = Class14.method179(861, local1118);
							}
							if (local223 == 2 || local223 == 3) {
								this.method630(7, local1118, "@cr2@" + Class49.method542(Class49.method539(local1039)), (byte) 4);
							} else if (local223 == 1) {
								this.method630(7, local1118, "@cr1@" + Class49.method542(Class49.method539(local1039)), (byte) 4);
							} else {
								this.method630(3, local1118, Class49.method542(Class49.method539(local1039)), (byte) 4);
							}
						} catch (@Pc(1182) Exception local1182) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 243) {
					for (local200 = 0; local200 < this.aClass1_Sub1_Sub2_Sub2_Sub1Array1.length; local200++) {
						if (this.aClass1_Sub1_Sub2_Sub2_Sub1Array1[local200] != null) {
							this.aClass1_Sub1_Sub2_Sub2_Sub1Array1[local200].anInt510 = -1;
						}
					}
					for (local207 = 0; local207 < this.aClass1_Sub1_Sub2_Sub2_Sub2Array1.length; local207++) {
						if (this.aClass1_Sub1_Sub2_Sub2_Sub2Array1[local207] != null) {
							this.aClass1_Sub1_Sub2_Sub2_Sub2Array1[local207].anInt510 = -1;
						}
					}
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 214) {
					this.method700(this.aClass1_Sub1_Sub3_7, this.anInt887);
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 100) {
					local200 = this.aClass1_Sub1_Sub3_7.method240();
					@Pc(1274) boolean local1274 = this.aClass1_Sub1_Sub3_7.method238() == 1;
					Class43.aClass43Array1[local200].aBoolean146 = local1274;
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 191) {
					local200 = this.aClass1_Sub1_Sub3_7.method240();
					local207 = this.aClass1_Sub1_Sub3_7.method268();
					local218 = this.aClass1_Sub1_Sub3_7.method240();
					if (local200 == 65535) {
						Class43.aClass43Array1[local207].anInt689 = 0;
						this.anInt888 = -1;
						return true;
					}
					@Pc(1317) Class27 local1317 = Class27.method308(local200);
					Class43.aClass43Array1[local207].anInt689 = 4;
					Class43.aClass43Array1[local207].anInt690 = local200;
					Class43.aClass43Array1[local207].anInt714 = local1317.anInt454;
					Class43.aClass43Array1[local207].anInt715 = local1317.anInt440;
					Class43.aClass43Array1[local207].anInt713 = local1317.anInt426 * 100 / local218;
					this.anInt888 = -1;
					return true;
				}
				@Pc(1366) Class43 local1366;
				if (this.anInt888 == 221) {
					local200 = this.aClass1_Sub1_Sub3_7.method240();
					local1366 = Class43.aClass43Array1[local200];
					for (local218 = 0; local218 < local1366.anIntArray177.length; local218++) {
						local1366.anIntArray177[local218] = -1;
						local1366.anIntArray177[local218] = 0;
					}
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 6) {
					local200 = this.aClass1_Sub1_Sub3_7.method266();
					this.method631(local200);
					if (this.anInt914 != -1) {
						this.anInt914 = -1;
						this.aBoolean242 = true;
					}
					if (this.anInt1041 != 0) {
						this.anInt1041 = 0;
						this.aBoolean242 = true;
					}
					this.anInt906 = local200;
					this.aBoolean232 = true;
					this.aBoolean213 = true;
					this.anInt895 = -1;
					this.aBoolean198 = false;
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 224) {
					this.anInt999 = this.aClass1_Sub1_Sub3_7.method259();
					this.anInt1000 = this.aClass1_Sub1_Sub3_7.method258();
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 196) {
					if (this.anInt906 != -1) {
						this.anInt906 = -1;
						this.aBoolean232 = true;
						this.aBoolean213 = true;
					}
					if (this.anInt914 != -1) {
						this.anInt914 = -1;
						this.aBoolean242 = true;
					}
					if (this.anInt1041 != 0) {
						this.anInt1041 = 0;
						this.aBoolean242 = true;
					}
					this.anInt895 = -1;
					this.aBoolean198 = false;
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 53) {
					local200 = this.aClass1_Sub1_Sub3_7.method267();
					this.method631(local200);
					if (this.anInt906 != -1) {
						this.anInt906 = -1;
						this.aBoolean232 = true;
						this.aBoolean213 = true;
					}
					if (this.anInt914 != -1) {
						this.anInt914 = -1;
						this.aBoolean242 = true;
					}
					if (this.anInt1041 != 0) {
						this.anInt1041 = 0;
						this.aBoolean242 = true;
					}
					this.anInt895 = local200;
					this.aBoolean198 = false;
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 198) {
					local200 = this.aClass1_Sub1_Sub3_7.method267();
					local207 = this.aClass1_Sub1_Sub3_7.method268();
					local218 = local200 >> 10 & 0x1F;
					local223 = local200 >> 5 & 0x1F;
					local228 = local200 & 0x1F;
					Class43.aClass43Array1[local207].anInt721 = (local218 << 19) + (local223 << 11) + (local228 << 3);
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 104) {
					@Pc(1626) byte local1626 = this.aClass1_Sub1_Sub3_7.method260();
					local207 = this.aClass1_Sub1_Sub3_7.method267();
					this.anIntArray239[local207] = local1626;
					if (this.anIntArray263[local207] != local1626) {
						this.anIntArray263[local207] = local1626;
						this.method635(local207);
						this.aBoolean232 = true;
						if (this.anInt965 != -1) {
							this.aBoolean242 = true;
						}
					}
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 228) {
					local200 = this.aClass1_Sub1_Sub3_7.method240();
					this.method631(local200);
					if (this.anInt906 != -1) {
						this.anInt906 = -1;
						this.aBoolean232 = true;
						this.aBoolean213 = true;
					}
					this.anInt914 = local200;
					this.aBoolean242 = true;
					this.anInt895 = -1;
					this.aBoolean198 = false;
					this.anInt888 = -1;
					return true;
				}
				@Pc(1721) String local1721;
				if (this.anInt888 == 12) {
					local200 = this.aClass1_Sub1_Sub3_7.method267();
					local1721 = this.aClass1_Sub1_Sub3_7.method245();
					Class43.aClass43Array1[local200].aString15 = local1721;
					if (Class43.aClass43Array1[local200].anInt703 == this.anIntArray249[this.anInt967]) {
						this.aBoolean232 = true;
					}
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 151) {
					this.aBoolean232 = true;
					local200 = this.aClass1_Sub1_Sub3_7.method257();
					local207 = this.aClass1_Sub1_Sub3_7.method272();
					local218 = this.aClass1_Sub1_Sub3_7.method259();
					this.anIntArray233[local218] = local207;
					this.anIntArray248[local218] = local200;
					this.anIntArray264[local218] = 1;
					for (local223 = 0; local223 < 98; local223++) {
						if (local207 >= anIntArray240[local223]) {
							this.anIntArray264[local218] = local223 + 2;
						}
					}
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 213) {
					this.anInt920 = this.aClass1_Sub1_Sub3_7.method238();
					this.aBoolean232 = true;
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 118) {
					local200 = this.aClass1_Sub1_Sub3_7.method266();
					Class43.aClass43Array1[local200].anInt689 = 3;
					if (aClass1_Sub1_Sub2_Sub2_Sub1_1.aClass39_1 == null) {
						Class43.aClass43Array1[local200].anInt690 = (aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray45[0] << 25) + (aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray45[4] << 20) + (aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray44[0] << 15) + (aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray44[8] << 10) + (aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray44[11] << 5) + aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray44[1];
					} else {
						Class43.aClass43Array1[local200].anInt690 = (int) (aClass1_Sub1_Sub2_Sub2_Sub1_1.aClass39_1.aLong23 + 305419896L);
					}
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 123) {
					this.anInt966 = this.aClass1_Sub1_Sub3_7.method266();
					this.anInt894 = this.aClass1_Sub1_Sub3_7.method258();
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 41) {
					this.anInt929 = this.aClass1_Sub1_Sub3_7.method238();
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 116) {
					this.anInt967 = this.aClass1_Sub1_Sub3_7.method259();
					this.aBoolean232 = true;
					this.aBoolean213 = true;
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 3) {
					local200 = this.aClass1_Sub1_Sub3_7.method269();
					if (local200 >= 0) {
						this.method631(local200);
					}
					this.anInt921 = local200;
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 242) {
					this.aBoolean208 = false;
					for (local200 = 0; local200 < 5; local200++) {
						this.aBooleanArray11[local200] = false;
					}
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 23) {
					this.aBoolean232 = true;
					local200 = this.aClass1_Sub1_Sub3_7.method240();
					local1366 = Class43.aClass43Array1[local200];
					while (this.aClass1_Sub1_Sub3_7.anInt352 < this.anInt887) {
						local218 = this.aClass1_Sub1_Sub3_7.method252();
						local223 = this.aClass1_Sub1_Sub3_7.method240();
						local228 = this.aClass1_Sub1_Sub3_7.method238();
						if (local228 == 255) {
							local228 = this.aClass1_Sub1_Sub3_7.method243();
						}
						if (local218 >= 0 && local218 < local1366.anIntArray177.length) {
							local1366.anIntArray177[local218] = local223;
							local1366.anIntArray174[local218] = local228;
						}
					}
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 92) {
					this.aBoolean208 = true;
					this.anInt932 = this.aClass1_Sub1_Sub3_7.method238();
					this.anInt933 = this.aClass1_Sub1_Sub3_7.method238();
					this.anInt934 = this.aClass1_Sub1_Sub3_7.method240();
					this.anInt935 = this.aClass1_Sub1_Sub3_7.method238();
					this.anInt936 = this.aClass1_Sub1_Sub3_7.method238();
					if (this.anInt936 >= 100) {
						this.anInt1033 = this.anInt932 * 128 + 64;
						this.anInt1035 = this.anInt933 * 128 + 64;
						this.anInt1034 = this.method692(this.anInt1035, this.anInt1033, this.anInt850) - this.anInt934;
					}
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 102) {
					local2147 = this.aClass1_Sub1_Sub3_7.method245();
					@Pc(2161) long local2161;
					if (local2147.endsWith(":tradereq:")) {
						local1721 = local2147.substring(0, local2147.indexOf(":"));
						local2161 = Class49.method538(local1721);
						local1049 = false;
						for (local233 = 0; local233 < this.anInt969; local233++) {
							if (this.aLongArray3[local233] == local2161) {
								local1049 = true;
								break;
							}
						}
						if (!local1049 && this.anInt943 == 0) {
							this.method630(4, "wishes to trade with you.", local1721, (byte) 4);
						}
					} else if (local2147.endsWith(":duelreq:")) {
						local1721 = local2147.substring(0, local2147.indexOf(":"));
						local2161 = Class49.method538(local1721);
						local1049 = false;
						for (local233 = 0; local233 < this.anInt969; local233++) {
							if (this.aLongArray3[local233] == local2161) {
								local1049 = true;
								break;
							}
						}
						if (!local1049 && this.anInt943 == 0) {
							this.method630(8, "wishes to duel with you.", local1721, (byte) 4);
						}
					} else if (local2147.endsWith(":chalreq:")) {
						local1721 = local2147.substring(0, local2147.indexOf(":"));
						local2161 = Class49.method538(local1721);
						local1049 = false;
						for (local233 = 0; local233 < this.anInt969; local233++) {
							if (this.aLongArray3[local233] == local2161) {
								local1049 = true;
								break;
							}
						}
						if (!local1049 && this.anInt943 == 0) {
							local1118 = local2147.substring(local2147.indexOf(":") + 1, local2147.length() - 9);
							this.method630(8, local1118, local1721, (byte) 4);
						}
					} else {
						this.method630(0, local2147, "", (byte) 4);
					}
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 0) {
					this.anInt999 = this.aClass1_Sub1_Sub3_7.method257();
					this.anInt1000 = this.aClass1_Sub1_Sub3_7.method258();
					for (local200 = this.anInt999; local200 < this.anInt999 + 8; local200++) {
						for (local207 = this.anInt1000; local207 < this.anInt1000 + 8; local207++) {
							if (this.aClass32ArrayArrayArray1[this.anInt850][local200][local207] != null) {
								this.aClass32ArrayArrayArray1[this.anInt850][local200][local207] = null;
								this.method667(local200, local207);
							}
						}
					}
					for (@Pc(2385) Class1_Sub2 local2385 = (Class1_Sub2) this.aClass32_12.method336(); local2385 != null; local2385 = (Class1_Sub2) this.aClass32_12.method338()) {
						if (local2385.anInt88 >= this.anInt999 && local2385.anInt88 < this.anInt999 + 8 && local2385.anInt89 >= this.anInt1000 && local2385.anInt89 < this.anInt1000 + 8 && local2385.anInt86 == this.anInt850) {
							local2385.anInt96 = 0;
						}
					}
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 94) {
					this.anInt999 = this.aClass1_Sub1_Sub3_7.method238();
					this.anInt1000 = this.aClass1_Sub1_Sub3_7.method259();
					while (this.aClass1_Sub1_Sub3_7.anInt352 < this.anInt887) {
						local200 = this.aClass1_Sub1_Sub3_7.method238();
						this.method673(this.aClass1_Sub1_Sub3_7, local200);
					}
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 159 || this.anInt888 == 32 || this.anInt888 == 65 || this.anInt888 == 78 || this.anInt888 == 183 || this.anInt888 == 223 || this.anInt888 == 4 || this.anInt888 == 19 || this.anInt888 == 189 || this.anInt888 == 101 || this.anInt888 == 27) {
					this.method673(this.aClass1_Sub1_Sub3_7, this.anInt888);
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 157) {
					this.anInt1009 = 0;
					this.anInt888 = -1;
					return true;
				}
				@Pc(2921) int local2921;
				if (this.anInt888 == 38 || this.anInt888 == 154) {
					local200 = this.anInt938;
					local207 = this.anInt939;
					if (this.anInt888 == 38) {
						local200 = this.aClass1_Sub1_Sub3_7.method267();
						local207 = this.aClass1_Sub1_Sub3_7.method240();
						this.aBoolean221 = false;
					}
					if (this.anInt888 == 154) {
						local207 = this.aClass1_Sub1_Sub3_7.method240();
						this.aClass1_Sub1_Sub3_7.method248();
						local218 = 0;
						while (true) {
							if (local218 >= 4) {
								this.aClass1_Sub1_Sub3_7.method250();
								local200 = this.aClass1_Sub1_Sub3_7.method266();
								this.aBoolean221 = true;
								break;
							}
							for (local223 = 0; local223 < 13; local223++) {
								for (local228 = 0; local228 < 13; local228++) {
									local233 = this.aClass1_Sub1_Sub3_7.method249((byte) 9, 1);
									if (local233 == 1) {
										this.anIntArrayArrayArray7[local218][local223][local228] = this.aClass1_Sub1_Sub3_7.method249((byte) 9, 26);
									} else {
										this.anIntArrayArrayArray7[local218][local223][local228] = -1;
									}
								}
							}
							local218++;
						}
					}
					if (this.anInt938 == local200 && this.anInt939 == local207 && this.anInt908 == 2) {
						this.anInt888 = -1;
						return true;
					}
					this.anInt938 = local200;
					this.anInt939 = local207;
					this.anInt1043 = (this.anInt938 - 6) * 8;
					this.anInt1044 = (this.anInt939 - 6) * 8;
					this.aBoolean235 = false;
					if ((this.anInt938 / 8 == 48 || this.anInt938 / 8 == 49) && this.anInt939 / 8 == 48) {
						this.aBoolean235 = true;
					}
					if (this.anInt938 / 8 == 48 && this.anInt939 / 8 == 148) {
						this.aBoolean235 = true;
					}
					this.anInt908 = 1;
					this.aLong33 = System.currentTimeMillis();
					this.aClass7_23.method92();
					this.aClass1_Sub1_Sub1_Sub3_3.method379(151, 257, "Loading - please wait.", 0);
					this.aClass1_Sub1_Sub1_Sub3_3.method379(150, 256, "Loading - please wait.", 16777215);
					this.aClass7_23.method93(super.aGraphics2, 4, 4);
					if (this.anInt888 == 38) {
						local218 = 0;
						local223 = (this.anInt938 - 6) / 8;
						label1109: while (true) {
							if (local223 > (this.anInt938 + 6) / 8) {
								this.aByteArrayArray5 = new byte[local218][];
								this.aByteArrayArray4 = new byte[local218][];
								this.anIntArray218 = new int[local218];
								this.anIntArray219 = new int[local218];
								this.anIntArray220 = new int[local218];
								local218 = 0;
								local228 = (this.anInt938 - 6) / 8;
								while (true) {
									if (local228 > (this.anInt938 + 6) / 8) {
										break label1109;
									}
									for (local233 = (this.anInt939 - 6) / 8; local233 <= (this.anInt939 + 6) / 8; local233++) {
										this.anIntArray218[local218] = (local228 << 8) + local233;
										if (this.aBoolean235 && (local233 == 49 || local233 == 149 || local233 == 147 || local228 == 50 || local228 == 49 && local233 == 47)) {
											this.anIntArray219[local218] = -1;
											this.anIntArray220[local218] = -1;
											local218++;
										} else {
											local244 = this.anIntArray219[local218] = this.aClass31_Sub1_1.method525(0, local228, local233);
											if (local244 != -1) {
												this.aClass31_Sub1_1.method529(3, local244);
											}
											local2921 = this.anIntArray220[local218] = this.aClass31_Sub1_1.method525(1, local228, local233);
											if (local2921 != -1) {
												this.aClass31_Sub1_1.method529(3, local2921);
											}
											local218++;
										}
									}
									local228++;
								}
							}
							for (local228 = (this.anInt939 - 6) / 8; local228 <= (this.anInt939 + 6) / 8; local228++) {
								local218++;
							}
							local223++;
						}
					}
					if (this.anInt888 == 154) {
						local218 = 0;
						@Pc(2957) int[] local2957 = new int[676];
						local228 = 0;
						label1070: while (true) {
							@Pc(3003) int local3003;
							@Pc(2987) int local2987;
							@Pc(2993) int local2993;
							if (local228 >= 4) {
								this.aByteArrayArray5 = new byte[local218][];
								this.aByteArrayArray4 = new byte[local218][];
								this.anIntArray218 = new int[local218];
								this.anIntArray219 = new int[local218];
								this.anIntArray220 = new int[local218];
								local233 = 0;
								while (true) {
									if (local233 >= local218) {
										break label1070;
									}
									local244 = this.anIntArray218[local233] = local2957[local233];
									local2921 = local244 >> 8 & 0xFF;
									local2987 = local244 & 0xFF;
									local2993 = this.anIntArray219[local233] = this.aClass31_Sub1_1.method525(0, local2921, local2987);
									if (local2993 != -1) {
										this.aClass31_Sub1_1.method529(3, local2993);
									}
									local3003 = this.anIntArray220[local233] = this.aClass31_Sub1_1.method525(1, local2921, local2987);
									if (local3003 != -1) {
										this.aClass31_Sub1_1.method529(3, local3003);
									}
									local233++;
								}
							}
							for (local233 = 0; local233 < 13; local233++) {
								for (local244 = 0; local244 < 13; local244++) {
									local2921 = this.anIntArrayArrayArray7[local228][local233][local244];
									if (local2921 != -1) {
										local2987 = local2921 >> 14 & 0x3FF;
										local2993 = local2921 >> 3 & 0x7FF;
										local3003 = (local2987 / 8 << 8) + local2993 / 8;
										for (@Pc(3005) int local3005 = 0; local3005 < local218; local3005++) {
											if (local2957[local3005] == local3003) {
												local3003 = -1;
												break;
											}
										}
										if (local3003 != -1) {
											local2957[local218++] = local3003;
										}
									}
								}
							}
							local228++;
						}
					}
					local218 = this.anInt1043 - this.anInt1045;
					local223 = this.anInt1044 - this.anInt1046;
					this.anInt1045 = this.anInt1043;
					this.anInt1046 = this.anInt1044;
					for (local228 = 0; local228 < 16384; local228++) {
						@Pc(3158) Class1_Sub1_Sub2_Sub2_Sub2 local3158 = this.aClass1_Sub1_Sub2_Sub2_Sub2Array1[local228];
						if (local3158 != null) {
							for (local244 = 0; local244 < 10; local244++) {
								local3158.anIntArray87[local244] -= local218;
								local3158.anIntArray88[local244] -= local223;
							}
							local3158.anInt497 -= local218 * 128;
							local3158.anInt498 -= local223 * 128;
						}
					}
					for (local233 = 0; local233 < this.anInt896; local233++) {
						@Pc(3213) Class1_Sub1_Sub2_Sub2_Sub1 local3213 = this.aClass1_Sub1_Sub2_Sub2_Sub1Array1[local233];
						if (local3213 != null) {
							for (local2921 = 0; local2921 < 10; local2921++) {
								local3213.anIntArray87[local2921] -= local218;
								local3213.anIntArray88[local2921] -= local223;
							}
							local3213.anInt497 -= local218 * 128;
							local3213.anInt498 -= local223 * 128;
						}
					}
					this.aBoolean203 = true;
					@Pc(3265) byte local3265 = 0;
					@Pc(3267) byte local3267 = 104;
					@Pc(3269) byte local3269 = 1;
					if (local218 < 0) {
						local3265 = 103;
						local3267 = -1;
						local3269 = -1;
					}
					@Pc(3279) byte local3279 = 0;
					@Pc(3281) byte local3281 = 104;
					@Pc(3283) byte local3283 = 1;
					if (local223 < 0) {
						local3279 = 103;
						local3281 = -1;
						local3283 = -1;
					}
					for (@Pc(3293) int local3293 = local3265; local3293 != local3267; local3293 += local3269) {
						for (@Pc(3297) int local3297 = local3279; local3297 != local3281; local3297 += local3283) {
							@Pc(3303) int local3303 = local3293 + local218;
							@Pc(3307) int local3307 = local3297 + local223;
							for (@Pc(3309) int local3309 = 0; local3309 < 4; local3309++) {
								if (local3303 >= 0 && local3307 >= 0 && local3303 < 104 && local3307 < 104) {
									this.aClass32ArrayArrayArray1[local3309][local3293][local3297] = this.aClass32ArrayArrayArray1[local3309][local3303][local3307];
								} else {
									this.aClass32ArrayArrayArray1[local3309][local3293][local3297] = null;
								}
							}
						}
					}
					for (@Pc(3371) Class1_Sub2 local3371 = (Class1_Sub2) this.aClass32_12.method336(); local3371 != null; local3371 = (Class1_Sub2) this.aClass32_12.method338()) {
						local3371.anInt88 -= local218;
						local3371.anInt89 -= local223;
						if (local3371.anInt88 < 0 || local3371.anInt89 < 0 || local3371.anInt88 >= 104 || local3371.anInt89 >= 104) {
							local3371.method544();
						}
					}
					if (this.anInt1009 != 0) {
						this.anInt1009 -= local218;
						this.anInt1010 -= local223;
					}
					this.aBoolean208 = false;
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 182) {
					this.aBoolean232 = true;
					local200 = this.aClass1_Sub1_Sub3_7.method240();
					local1366 = Class43.aClass43Array1[local200];
					local218 = this.aClass1_Sub1_Sub3_7.method240();
					for (local223 = 0; local223 < local218; local223++) {
						local228 = this.aClass1_Sub1_Sub3_7.method259();
						if (local228 == 255) {
							local228 = this.aClass1_Sub1_Sub3_7.method274();
						}
						local1366.anIntArray177[local223] = this.aClass1_Sub1_Sub3_7.method267();
						local1366.anIntArray174[local223] = local228;
					}
					for (local228 = local218; local228 < local1366.anIntArray177.length; local228++) {
						local1366.anIntArray177[local228] = 0;
						local1366.anIntArray174[local228] = 0;
					}
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 90) {
					this.method698();
					this.anInt888 = -1;
					return false;
				}
				if (this.anInt888 == 229) {
					this.aBoolean216 = false;
					this.anInt1041 = 2;
					this.aString29 = "";
					this.aBoolean242 = true;
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 51) {
					this.anInt846 = this.aClass1_Sub1_Sub3_7.method238();
					if (this.anInt846 == 1) {
						this.anInt955 = this.aClass1_Sub1_Sub3_7.method240();
					}
					if (this.anInt846 >= 2 && this.anInt846 <= 6) {
						if (this.anInt846 == 2) {
							this.anInt1050 = 64;
							this.anInt1051 = 64;
						}
						if (this.anInt846 == 3) {
							this.anInt1050 = 0;
							this.anInt1051 = 64;
						}
						if (this.anInt846 == 4) {
							this.anInt1050 = 128;
							this.anInt1051 = 64;
						}
						if (this.anInt846 == 5) {
							this.anInt1050 = 64;
							this.anInt1051 = 0;
						}
						if (this.anInt846 == 6) {
							this.anInt1050 = 64;
							this.anInt1051 = 128;
						}
						this.anInt846 = 2;
						this.anInt1047 = this.aClass1_Sub1_Sub3_7.method240();
						this.anInt1048 = this.aClass1_Sub1_Sub3_7.method240();
						this.anInt1049 = this.aClass1_Sub1_Sub3_7.method238();
					}
					if (this.anInt846 == 10) {
						this.anInt992 = this.aClass1_Sub1_Sub3_7.method240();
					}
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 75) {
					local1039 = this.aClass1_Sub1_Sub3_7.method244();
					local218 = this.aClass1_Sub1_Sub3_7.method238();
					@Pc(3670) String local3670 = Class49.method542(Class49.method539(local1039));
					for (local228 = 0; local228 < this.anInt919; local228++) {
						if (local1039 == this.aLongArray4[local228]) {
							if (this.anIntArray267[local228] != local218) {
								this.anIntArray267[local228] = local218;
								this.aBoolean232 = true;
								if (local218 > 0) {
									this.method630(5, local3670 + " has logged in.", "", (byte) 4);
								}
								if (local218 == 0) {
									this.method630(5, local3670 + " has logged out.", "", (byte) 4);
								}
							}
							local3670 = null;
							break;
						}
					}
					if (local3670 != null && this.anInt919 < 200) {
						this.aLongArray4[this.anInt919] = local1039;
						this.aStringArray8[this.anInt919] = local3670;
						this.anIntArray267[this.anInt919] = local218;
						this.anInt919++;
						this.aBoolean232 = true;
					}
					@Pc(3768) boolean local3768 = false;
					while (!local3768) {
						local3768 = true;
						for (local244 = 0; local244 < this.anInt919 - 1; local244++) {
							if (this.anIntArray267[local244] != anInt975 && this.anIntArray267[local244 + 1] == anInt975 || this.anIntArray267[local244] == 0 && this.anIntArray267[local244 + 1] != 0) {
								local2921 = this.anIntArray267[local244];
								this.anIntArray267[local244] = this.anIntArray267[local244 + 1];
								this.anIntArray267[local244 + 1] = local2921;
								@Pc(3829) String local3829 = this.aStringArray8[local244];
								this.aStringArray8[local244] = this.aStringArray8[local244 + 1];
								this.aStringArray8[local244 + 1] = local3829;
								@Pc(3851) long local3851 = this.aLongArray4[local244];
								this.aLongArray4[local244] = this.aLongArray4[local244 + 1];
								this.aLongArray4[local244 + 1] = local3851;
								this.aBoolean232 = true;
								local3768 = false;
							}
						}
					}
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 255) {
					local200 = this.aClass1_Sub1_Sub3_7.method238();
					local1721 = this.aClass1_Sub1_Sub3_7.method245();
					local218 = this.aClass1_Sub1_Sub3_7.method238();
					if (local218 >= 1 && local218 <= 5) {
						if (local1721.equalsIgnoreCase("null")) {
							local1721 = null;
						}
						this.aStringArray13[local218 - 1] = local1721;
						this.aBooleanArray12[local218 - 1] = local200 == 0;
					}
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 211) {
					if (this.anInt967 == 12) {
						this.aBoolean232 = true;
					}
					this.anInt883 = this.aClass1_Sub1_Sub3_7.method241();
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 111) {
					local200 = this.aClass1_Sub1_Sub3_7.method270(this.anInt923);
					local207 = this.aClass1_Sub1_Sub3_7.method266();
					local667 = Class43.aClass43Array1[local207];
					local667.anInt697 = local200;
					if (local200 == -1) {
						local667.anInt700 = 0;
						local667.anInt709 = 0;
					}
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 10) {
					local200 = this.aClass1_Sub1_Sub3_7.method267();
					local207 = this.aClass1_Sub1_Sub3_7.method266();
					if (this.anInt914 != -1) {
						this.anInt914 = -1;
						this.aBoolean242 = true;
					}
					if (this.anInt1041 != 0) {
						this.anInt1041 = 0;
						this.aBoolean242 = true;
					}
					this.anInt895 = local200;
					this.anInt906 = local207;
					this.aBoolean232 = true;
					this.aBoolean213 = true;
					this.aBoolean198 = false;
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 206) {
					local200 = this.aClass1_Sub1_Sub3_7.method241();
					local207 = this.aClass1_Sub1_Sub3_7.method270(this.anInt923);
					local218 = this.aClass1_Sub1_Sub3_7.method240();
					@Pc(4070) Class43 local4070 = Class43.aClass43Array1[local218];
					local4070.anInt702 = local200;
					local4070.anInt716 = local207;
					this.anInt888 = -1;
					return true;
				}
				if (this.anInt888 == 68) {
					local200 = this.aClass1_Sub1_Sub3_7.method240();
					local207 = this.aClass1_Sub1_Sub3_7.method240();
					Class43.aClass43Array1[local200].anInt689 = 2;
					Class43.aClass43Array1[local200].anInt690 = local207;
					this.anInt888 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt888 + "," + this.anInt887 + " - " + this.anInt981 + "," + this.anInt982);
				this.method698();
			} catch (@Pc(4137) IOException local4137) {
				this.method659();
			} catch (@Pc(4142) Exception local4142) {
				local2147 = "T2 - " + this.anInt888 + "," + this.anInt981 + "," + this.anInt982 + " - " + this.anInt887 + "," + (this.anInt1043 + aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0]) + "," + (this.anInt1044 + aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0]) + " - ";
				for (local207 = 0; local207 < this.anInt887 && local207 < 50; local207++) {
					local2147 = local2147 + this.aClass1_Sub1_Sub3_7.aByteArray3[local207] + ",";
				}
				signlink.reporterror(local2147);
				this.method698();
			}
			return true;
		} catch (@Pc(4223) RuntimeException local4223) {
			signlink.reporterror("45774, " + arg0 + ", " + local4223.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg5 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg3 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg1;
			@Pc(23) int local23;
			@Pc(27) int local27;
			@Pc(37) int local37;
			if (local5 != 0) {
				local23 = Class1_Sub1_Sub2_Sub6.anIntArray154[local5];
				local27 = Class1_Sub1_Sub2_Sub6.anIntArray155[local5];
				local37 = local27 * 0 - arg1 * local23 >> 16;
				local17 = local23 * 0 + arg1 * local27 >> 16;
				local15 = local37;
			}
			if (local11 != 0) {
				local23 = Class1_Sub1_Sub2_Sub6.anIntArray154[local11];
				local27 = Class1_Sub1_Sub2_Sub6.anIntArray155[local11];
				local37 = local17 * local23 + local27 * 0 >> 16;
				local17 = local17 * local27 - local23 * 0 >> 16;
				local13 = local37;
			}
			this.anInt1033 = arg2 - local13;
			this.anInt1034 = arg0 - local15;
			this.anInt1035 = arg4 - local17;
			this.anInt1036 = arg5;
			this.anInt1037 = arg3;
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("90237, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + arg5 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)Ljava/lang/String;")
	private String method639(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("1468, " + arg0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!TNOPEJNZ;)Z")
	private boolean method640(@OriginalArg(1) Class43 arg0) {
		try {
			@Pc(15) int local15 = arg0.anInt712;
			if (this.anInt920 == 2) {
				if (local15 == 201) {
					this.aBoolean242 = true;
					this.anInt1041 = 0;
					this.aBoolean216 = true;
					this.aString27 = "";
					this.anInt987 = 1;
					this.aString30 = "Enter name of friend to add to list";
				}
				if (local15 == 202) {
					this.aBoolean242 = true;
					this.anInt1041 = 0;
					this.aBoolean216 = true;
					this.aString27 = "";
					this.anInt987 = 2;
					this.aString30 = "Enter name of friend to delete from list";
				}
			}
			if (local15 == 205) {
				this.anInt891 = 250;
				return true;
			}
			if (local15 == 501) {
				this.aBoolean242 = true;
				this.anInt1041 = 0;
				this.aBoolean216 = true;
				this.aString27 = "";
				this.anInt987 = 4;
				this.aString30 = "Enter name of player to add to list";
			}
			if (local15 == 502) {
				this.aBoolean242 = true;
				this.anInt1041 = 0;
				this.aBoolean216 = true;
				this.aString27 = "";
				this.anInt987 = 5;
				this.aString30 = "Enter name of player to delete from list";
			}
			@Pc(123) int local123;
			@Pc(127) int local127;
			@Pc(132) int local132;
			if (local15 >= 300 && local15 <= 313) {
				local123 = (local15 - 300) / 2;
				local127 = local15 & 0x1;
				local132 = this.anIntArray213[local123];
				if (local132 != -1) {
					while (true) {
						if (local127 == 0) {
							local132--;
							if (local132 < 0) {
								local132 = Class8.anInt121 - 1;
							}
						}
						if (local127 == 1) {
							local132++;
							if (local132 >= Class8.anInt121) {
								local132 = 0;
							}
						}
						if (!Class8.aClass8Array1[local132].aBoolean43 && Class8.aClass8Array1[local132].anInt122 == local123 + (this.aBoolean231 ? 0 : 7)) {
							this.anIntArray213[local123] = local132;
							this.aBoolean205 = true;
							break;
						}
					}
				}
			}
			if (local15 >= 314 && local15 <= 323) {
				local123 = (local15 - 314) / 2;
				local127 = local15 & 0x1;
				local132 = this.anIntArray225[local123];
				if (local127 == 0) {
					local132--;
					if (local132 < 0) {
						local132 = anIntArrayArray22[local123].length - 1;
					}
				}
				if (local127 == 1) {
					local132++;
					if (local132 >= anIntArrayArray22[local123].length) {
						local132 = 0;
					}
				}
				this.anIntArray225[local123] = local132;
				this.aBoolean205 = true;
			}
			if (local15 == 324 && !this.aBoolean231) {
				this.aBoolean231 = true;
				this.method615((byte) 3);
			}
			if (local15 == 325 && this.aBoolean231) {
				this.aBoolean231 = false;
				this.method615((byte) 3);
			}
			if (local15 == 326) {
				this.aClass1_Sub1_Sub3_6.method227(253);
				this.aClass1_Sub1_Sub3_6.method228(this.aBoolean231 ? 0 : 1);
				for (local123 = 0; local123 < 7; local123++) {
					this.aClass1_Sub1_Sub3_6.method228(this.anIntArray213[local123]);
				}
				for (local127 = 0; local127 < 5; local127++) {
					this.aClass1_Sub1_Sub3_6.method228(this.anIntArray225[local127]);
				}
				return true;
			}
			if (local15 == 613) {
				this.aBoolean218 = !this.aBoolean218;
			}
			if (local15 >= 601 && local15 <= 612) {
				this.method664();
				if (this.aString22.length() > 0) {
					this.aClass1_Sub1_Sub3_6.method227(19);
					this.aClass1_Sub1_Sub3_6.method234(Class49.method538(this.aString22));
					this.aClass1_Sub1_Sub3_6.method228(local15 - 601);
					this.aClass1_Sub1_Sub3_6.method228(this.aBoolean218 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(360) RuntimeException local360) {
			signlink.reporterror("40390, " + -2 + ", " + arg0 + ", " + local360.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method641(@OriginalArg(0) int arg0) {
		try {
			for (@Pc(3) int local3 = -1; local3 < this.anInt898; local3++) {
				@Pc(11) int local11;
				if (local3 == -1) {
					local11 = this.anInt897;
				} else {
					local11 = this.anIntArray229[local3];
				}
				@Pc(23) Class1_Sub1_Sub2_Sub2_Sub1 local23 = this.aClass1_Sub1_Sub2_Sub2_Sub1Array1[local11];
				if (local23 != null) {
					this.method680(local23, 1);
				}
			}
			if (arg0 != 21057) {
				this.aBoolean207 = !this.aBoolean207;
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("77137, " + arg0 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLclient!JHKSAGUC;)V")
	private void method642(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			arg1.method248();
			@Pc(7) int local7 = arg1.method249((byte) 9, 1);
			if (local7 != 0) {
				@Pc(21) int local21 = arg1.method249((byte) 9, 2);
				if (local21 == 0) {
					this.anIntArray230[this.anInt899++] = this.anInt897;
				} else {
					@Pc(44) int local44;
					@Pc(54) int local54;
					if (local21 == 1) {
						local44 = arg1.method249((byte) 9, 3);
						aClass1_Sub1_Sub2_Sub2_Sub1_1.method324(local44, false);
						local54 = arg1.method249((byte) 9, 1);
						if (local54 == 1) {
							this.anIntArray230[this.anInt899++] = this.anInt897;
						}
					} else {
						@Pc(98) int local98;
						if (local21 == 2) {
							local44 = arg1.method249((byte) 9, 3);
							aClass1_Sub1_Sub2_Sub2_Sub1_1.method324(local44, true);
							local54 = arg1.method249((byte) 9, 3);
							aClass1_Sub1_Sub2_Sub2_Sub1_1.method324(local54, true);
							local98 = arg1.method249((byte) 9, 1);
							if (local98 == 1) {
								this.anIntArray230[this.anInt899++] = this.anInt897;
							}
						} else if (local21 == 3) {
							local44 = arg1.method249((byte) 9, 1);
							if (local44 == 1) {
								this.anIntArray230[this.anInt899++] = this.anInt897;
							}
							this.anInt850 = arg1.method249((byte) 9, 2);
							local54 = arg1.method249((byte) 9, 1);
							local98 = arg1.method249((byte) 9, 7);
							@Pc(158) int local158 = arg1.method249((byte) 9, 7);
							aClass1_Sub1_Sub2_Sub2_Sub1_1.method325(local98, local54 == 1, local158);
						}
					}
				}
			}
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("10525, " + arg0 + ", " + false + ", " + arg1 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method643(@OriginalArg(0) byte arg0) {
		try {
			if (this.anInt931 >= 2 || this.anInt1018 != 0 || this.anInt900 != 0) {
				@Pc(17) boolean local17 = false;
				@Pc(43) String local43;
				if (this.anInt1018 == 1 && this.anInt931 < 2) {
					local43 = "Use " + this.aString28 + " with...";
				} else if (this.anInt900 == 1 && this.anInt931 < 2) {
					local43 = this.aString21 + "...";
				} else {
					local43 = this.aStringArray10[this.anInt931 - 1];
				}
				if (this.anInt931 > 2) {
					local43 = local43 + "@whi@ / " + (this.anInt931 - 2) + " more options";
				}
				this.aClass1_Sub1_Sub1_Sub3_4.method388(local43, 15, anInt907 / 1000, 16777215, 4);
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("33188, " + arg0 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method644(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt1018 == 0 && this.anInt900 == 0) {
				this.aStringArray10[this.anInt931] = "Walk here";
				this.anIntArray261[this.anInt931] = 505;
				this.anIntArray259[this.anInt931] = super.anInt828;
				this.anIntArray260[this.anInt931] = super.anInt829;
				this.anInt931++;
			}
			@Pc(41) int local41 = -1;
			if (arg0 >= 6 && arg0 <= 6) {
				for (@Pc(50) int local50 = 0; local50 < Class1_Sub1_Sub2_Sub6.anInt626; local50++) {
					@Pc(56) int local56 = Class1_Sub1_Sub2_Sub6.anIntArray153[local50];
					@Pc(60) int local60 = local56 & 0x7F;
					@Pc(66) int local66 = local56 >> 7 & 0x7F;
					@Pc(72) int local72 = local56 >> 29 & 0x3;
					@Pc(78) int local78 = local56 >> 14 & 0x7FFF;
					if (local56 != local41) {
						local41 = local56;
						@Pc(225) int local225;
						if (local72 == 2 && this.aClass45_1.method495(this.anInt850, local60, local66, local56) >= 0) {
							@Pc(98) Class41 local98 = Class41.method452(local78);
							if (local98.anIntArray161 != null) {
								local98 = local98.method451();
							}
							if (local98 == null) {
								continue;
							}
							if (this.anInt1018 == 1) {
								this.aStringArray10[this.anInt931] = "Use " + this.aString28 + " with @cya@" + local98.aString10;
								this.anIntArray261[this.anInt931] = 701;
								this.anIntArray262[this.anInt931] = local56;
								this.anIntArray259[this.anInt931] = local60;
								this.anIntArray260[this.anInt931] = local66;
								this.anInt931++;
							} else if (this.anInt900 != 1) {
								if (local98.aStringArray6 != null) {
									for (local225 = 4; local225 >= 0; local225--) {
										if (local98.aStringArray6[local225] != null) {
											this.aStringArray10[this.anInt931] = local98.aStringArray6[local225] + " @cya@" + local98.aString10;
											if (local225 == 0) {
												this.anIntArray261[this.anInt931] = 707;
											}
											if (local225 == 1) {
												this.anIntArray261[this.anInt931] = 919;
											}
											if (local225 == 2) {
												this.anIntArray261[this.anInt931] = 745;
											}
											if (local225 == 3) {
												this.anIntArray261[this.anInt931] = 412;
											}
											if (local225 == 4) {
												this.anIntArray261[this.anInt931] = 1043;
											}
											this.anIntArray262[this.anInt931] = local56;
											this.anIntArray259[this.anInt931] = local60;
											this.anIntArray260[this.anInt931] = local66;
											this.anInt931++;
										}
									}
								}
								this.aStringArray10[this.anInt931] = "Examine @cya@" + local98.aString10;
								this.anIntArray261[this.anInt931] = 1912;
								this.anIntArray262[this.anInt931] = local98.anInt641 << 14;
								this.anIntArray259[this.anInt931] = local60;
								this.anIntArray260[this.anInt931] = local66;
								this.anInt931++;
							} else if ((this.anInt902 & 0x4) == 4) {
								this.aStringArray10[this.anInt931] = this.aString21 + " @cya@" + local98.aString10;
								this.anIntArray261[this.anInt931] = 770;
								this.anIntArray262[this.anInt931] = local56;
								this.anIntArray259[this.anInt931] = local60;
								this.anIntArray260[this.anInt931] = local66;
								this.anInt931++;
							}
						}
						@Pc(405) Class1_Sub1_Sub2_Sub2_Sub2 local405;
						@Pc(453) Class1_Sub1_Sub2_Sub2_Sub1 local453;
						@Pc(443) int local443;
						if (local72 == 1) {
							@Pc(376) Class1_Sub1_Sub2_Sub2_Sub2 local376 = this.aClass1_Sub1_Sub2_Sub2_Sub2Array1[local78];
							if (local376.aClass39_2.aByte36 == 1 && (local376.anInt497 & 0x7F) == 64 && (local376.anInt498 & 0x7F) == 64) {
								for (local225 = 0; local225 < this.anInt986; local225++) {
									local405 = this.aClass1_Sub1_Sub2_Sub2_Sub2Array1[this.anIntArray253[local225]];
									if (local405 != null && local405 != local376 && local405.aClass39_2.aByte36 == 1 && local405.anInt497 == local376.anInt497 && local405.anInt498 == local376.anInt498) {
										this.method688(local405.aClass39_2, this.anIntArray253[local225], local60, local66);
									}
								}
								for (local443 = 0; local443 < this.anInt898; local443++) {
									local453 = this.aClass1_Sub1_Sub2_Sub2_Sub1Array1[this.anIntArray229[local443]];
									if (local453 != null && local453.anInt497 == local376.anInt497 && local453.anInt498 == local376.anInt498) {
										this.method661(local60, local66, this.anIntArray229[local443], local453, this.anInt910);
									}
								}
							}
							this.method688(local376.aClass39_2, local78, local60, local66);
						}
						if (local72 == 0) {
							@Pc(496) Class1_Sub1_Sub2_Sub2_Sub1 local496 = this.aClass1_Sub1_Sub2_Sub2_Sub1Array1[local78];
							if ((local496.anInt497 & 0x7F) == 64 && (local496.anInt498 & 0x7F) == 64) {
								for (local225 = 0; local225 < this.anInt986; local225++) {
									local405 = this.aClass1_Sub1_Sub2_Sub2_Sub2Array1[this.anIntArray253[local225]];
									if (local405 != null && local405.aClass39_2.aByte36 == 1 && local405.anInt497 == local496.anInt497 && local405.anInt498 == local496.anInt498) {
										this.method688(local405.aClass39_2, this.anIntArray253[local225], local60, local66);
									}
								}
								for (local443 = 0; local443 < this.anInt898; local443++) {
									local453 = this.aClass1_Sub1_Sub2_Sub2_Sub1Array1[this.anIntArray229[local443]];
									if (local453 != null && local453 != local496 && local453.anInt497 == local496.anInt497 && local453.anInt498 == local496.anInt498) {
										this.method661(local60, local66, this.anIntArray229[local443], local453, this.anInt910);
									}
								}
							}
							this.method661(local60, local66, local78, local496, this.anInt910);
						}
						if (local72 == 3) {
							@Pc(617) Class32 local617 = this.aClass32ArrayArrayArray1[this.anInt850][local60][local66];
							if (local617 != null) {
								for (@Pc(624) Class1_Sub1_Sub2_Sub1 local624 = (Class1_Sub1_Sub2_Sub1) local617.method337(); local624 != null; local624 = (Class1_Sub1_Sub2_Sub1) local617.method339()) {
									@Pc(630) Class27 local630 = Class27.method308(local624.anInt84);
									if (this.anInt1018 == 1) {
										this.aStringArray10[this.anInt931] = "Use " + this.aString28 + " with @lre@" + local630.aString6;
										this.anIntArray261[this.anInt931] = 389;
										this.anIntArray262[this.anInt931] = local624.anInt84;
										this.anIntArray259[this.anInt931] = local60;
										this.anIntArray260[this.anInt931] = local66;
										this.anInt931++;
									} else if (this.anInt900 != 1) {
										for (@Pc(747) int local747 = 4; local747 >= 0; local747--) {
											if (local630.aStringArray3 != null && local630.aStringArray3[local747] != null) {
												this.aStringArray10[this.anInt931] = local630.aStringArray3[local747] + " @lre@" + local630.aString6;
												if (local747 == 0) {
													this.anIntArray261[this.anInt931] = 81;
												}
												if (local747 == 1) {
													this.anIntArray261[this.anInt931] = 633;
												}
												if (local747 == 2) {
													this.anIntArray261[this.anInt931] = 943;
												}
												if (local747 == 3) {
													this.anIntArray261[this.anInt931] = 629;
												}
												if (local747 == 4) {
													this.anIntArray261[this.anInt931] = 124;
												}
												this.anIntArray262[this.anInt931] = local624.anInt84;
												this.anIntArray259[this.anInt931] = local60;
												this.anIntArray260[this.anInt931] = local66;
												this.anInt931++;
											} else if (local747 == 2) {
												this.aStringArray10[this.anInt931] = "Take @lre@" + local630.aString6;
												this.anIntArray261[this.anInt931] = 943;
												this.anIntArray262[this.anInt931] = local624.anInt84;
												this.anIntArray259[this.anInt931] = local60;
												this.anIntArray260[this.anInt931] = local66;
												this.anInt931++;
											}
										}
										this.aStringArray10[this.anInt931] = "Examine @lre@" + local630.aString6;
										this.anIntArray261[this.anInt931] = 1859;
										this.anIntArray262[this.anInt931] = local624.anInt84;
										this.anIntArray259[this.anInt931] = local60;
										this.anIntArray260[this.anInt931] = local66;
										this.anInt931++;
									} else if ((this.anInt902 & 0x1) == 1) {
										this.aStringArray10[this.anInt931] = this.aString21 + " @lre@" + local630.aString6;
										this.anIntArray261[this.anInt931] = 572;
										this.anIntArray262[this.anInt931] = local624.anInt84;
										this.anIntArray259[this.anInt931] = local60;
										this.anIntArray260[this.anInt931] = local66;
										this.anInt931++;
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(954) RuntimeException local954) {
			signlink.reporterror("36571, " + arg0 + ", " + local954.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method645() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray231[local5 + 32512] = 255;
				}
			}
			@Pc(47) int local47;
			@Pc(54) int local54;
			@Pc(60) int local60;
			for (local12 = 0; local12 < 100; local12++) {
				local47 = (int) (Math.random() * 124.0D) + 2;
				local54 = (int) (Math.random() * 128.0D) + 128;
				local60 = local47 + (local54 << 7);
				this.anIntArray231[local60] = 192;
			}
			for (local47 = 1; local47 < 255; local47++) {
				for (local54 = 1; local54 < 127; local54++) {
					local60 = local54 + (local47 << 7);
					this.anIntArray232[local60] = (this.anIntArray231[local60 - 1] + this.anIntArray231[local60 + 1] + this.anIntArray231[local60 - 128] + this.anIntArray231[local60 + 128]) / 4;
				}
			}
			this.anInt970 += 128;
			if (this.anInt970 > this.anIntArray272.length) {
				this.anInt970 -= this.anIntArray272.length;
				local54 = (int) (Math.random() * 12.0D);
				this.method647(this.aClass1_Sub1_Sub1_Sub4Array2[local54]);
			}
			@Pc(172) int local172;
			for (local54 = 1; local54 < 255; local54++) {
				for (local60 = 1; local60 < 127; local60++) {
					local172 = local60 + (local54 << 7);
					@Pc(195) int local195 = this.anIntArray232[local172 + 128] - this.anIntArray272[local172 + this.anInt970 & this.anIntArray272.length - 1] / 5;
					if (local195 < 0) {
						local195 = 0;
					}
					this.anIntArray231[local172] = local195;
				}
			}
			for (local60 = 0; local60 < 255; local60++) {
				this.anIntArray238[local60] = this.anIntArray238[local60 + 1];
			}
			this.anIntArray238[255] = (int) (Math.sin((double) anInt907 / 14.0D) * 16.0D + Math.sin((double) anInt907 / 15.0D) * 14.0D + Math.sin((double) anInt907 / 16.0D) * 12.0D);
			if (this.anInt1029 > 0) {
				this.anInt1029 -= 4;
			}
			if (this.anInt1030 > 0) {
				this.anInt1030 -= 4;
			}
			if (this.anInt1029 == 0 && this.anInt1030 == 0) {
				local172 = (int) (Math.random() * 2000.0D);
				if (local172 == 0) {
					this.anInt1029 = 1024;
				}
				if (local172 == 1) {
					this.anInt1030 = 1024;
					return;
				}
			}
		} catch (@Pc(306) RuntimeException local306) {
			signlink.reporterror("77636, " + 29434 + ", " + local306.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!YAPSNHGU;)V")
	private void method647(@OriginalArg(1) Class1_Sub1_Sub1_Sub4 arg0) {
		try {
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray272.length; local13++) {
				this.anIntArray272[local13] = 0;
			}
			@Pc(38) int local38;
			for (@Pc(28) int local28 = 0; local28 < 5000; local28++) {
				local38 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray272[local38] = (int) (Math.random() * 256.0D);
			}
			@Pc(56) int local56;
			@Pc(60) int local60;
			@Pc(68) int local68;
			for (local38 = 0; local38 < 20; local38++) {
				for (local56 = 1; local56 < 255; local56++) {
					for (local60 = 1; local60 < 127; local60++) {
						local68 = local60 + (local56 << 7);
						this.anIntArray273[local68] = (this.anIntArray272[local68 - 1] + this.anIntArray272[local68 + 1] + this.anIntArray272[local68 - 128] + this.anIntArray272[local68 + 128]) / 4;
					}
				}
				@Pc(114) int[] local114 = this.anIntArray272;
				this.anIntArray272 = this.anIntArray273;
				this.anIntArray273 = local114;
			}
			if (arg0 != null) {
				local56 = 0;
				for (local60 = 0; local60 < arg0.anInt811; local60++) {
					for (local68 = 0; local68 < arg0.anInt810; local68++) {
						if (arg0.aByteArray20[local56++] != 0) {
							@Pc(150) int local150 = local68 + arg0.anInt812 + 16;
							@Pc(157) int local157 = local60 + arg0.anInt813 + 16;
							@Pc(163) int local163 = local150 + (local157 << 7);
							this.anIntArray272[local163] = 0;
						}
					}
				}
			}
		} catch (@Pc(180) RuntimeException local180) {
			signlink.reporterror("37460, " + 4 + ", " + arg0 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method648() {
		try {
			this.aClass7_24.method92();
			Class1_Sub1_Sub1_Sub1.anIntArray16 = this.anIntArray221;
			this.aClass1_Sub1_Sub1_Sub4_20.method563(0, 0);
			if (this.aBoolean216) {
				this.aClass1_Sub1_Sub1_Sub3_4.method379(40, 239, this.aString30, 0);
				this.aClass1_Sub1_Sub1_Sub3_4.method379(60, 239, this.aString27 + "*", 128);
			} else if (this.anInt1041 == 1) {
				this.aClass1_Sub1_Sub1_Sub3_4.method379(40, 239, "Enter amount:", 0);
				this.aClass1_Sub1_Sub1_Sub3_4.method379(60, 239, this.aString29 + "*", 128);
			} else if (this.anInt1041 == 2) {
				this.aClass1_Sub1_Sub1_Sub3_4.method379(40, 239, "Enter name:", 0);
				this.aClass1_Sub1_Sub1_Sub3_4.method379(60, 239, this.aString29 + "*", 128);
			} else if (this.aString18 != null) {
				this.aClass1_Sub1_Sub1_Sub3_4.method379(40, 239, this.aString18, 0);
				this.aClass1_Sub1_Sub1_Sub3_4.method379(60, 239, "Click to continue", 128);
			} else if (this.anInt914 != -1) {
				this.method704(0, Class43.aClass43Array1[this.anInt914], 0, 0);
			} else if (this.anInt965 == -1) {
				@Pc(169) Class1_Sub1_Sub1_Sub3 local169 = this.aClass1_Sub1_Sub1_Sub3_3;
				@Pc(171) int local171 = 0;
				Class1_Sub1_Sub1.method548(463, 0, 77, 0);
				for (@Pc(179) int local179 = 0; local179 < 100; local179++) {
					if (this.aStringArray12[local179] != null) {
						@Pc(191) int local191 = this.anIntArray268[local179];
						@Pc(200) int local200 = this.anInt880 + 70 - local171 * 14;
						@Pc(205) String local205 = this.aStringArray11[local179];
						@Pc(207) byte local207 = 0;
						if (local205 != null && local205.startsWith("@cr1@")) {
							local205 = local205.substring(5);
							local207 = 1;
						}
						if (local205 != null && local205.startsWith("@cr2@")) {
							local205 = local205.substring(5);
							local207 = 2;
						}
						if (local191 == 0) {
							if (local200 > 0 && local200 < 110) {
								local169.method383(0, (byte) 2, this.aStringArray12[local179], 4, local200);
							}
							local171++;
						}
						@Pc(277) int local277;
						if ((local191 == 1 || local191 == 2) && (local191 == 1 || this.anInt843 == 0 || this.anInt843 == 1 && this.method693(local205))) {
							if (local200 > 0 && local200 < 110) {
								local277 = 4;
								if (local207 == 1) {
									this.aClass1_Sub1_Sub1_Sub4Array3[0].method563(local200 - 12, 4);
									local277 += 14;
								}
								if (local207 == 2) {
									this.aClass1_Sub1_Sub1_Sub4Array3[1].method563(local200 - 12, local277);
									local277 += 14;
								}
								local169.method383(0, (byte) 2, local205 + ":", local277, local200);
								local277 += local169.method381(local205, this.anInt876) + 8;
								local169.method383(255, (byte) 2, this.aStringArray12[local179], local277, local200);
							}
							local171++;
						}
						if ((local191 == 3 || local191 == 7) && this.anInt862 == 0 && (local191 == 7 || this.anInt912 == 0 || this.anInt912 == 1 && this.method693(local205))) {
							if (local200 > 0 && local200 < 110) {
								local169.method383(0, (byte) 2, "From", 4, local200);
								local277 = local169.method381("From ", this.anInt876) + 4;
								if (local207 == 1) {
									this.aClass1_Sub1_Sub1_Sub4Array3[0].method563(local200 - 12, local277);
									local277 += 14;
								}
								if (local207 == 2) {
									this.aClass1_Sub1_Sub1_Sub4Array3[1].method563(local200 - 12, local277);
									local277 += 14;
								}
								local169.method383(0, (byte) 2, local205 + ":", local277, local200);
								local277 += local169.method381(local205, this.anInt876) + 8;
								local169.method383(8388608, (byte) 2, this.aStringArray12[local179], local277, local200);
							}
							local171++;
						}
						if (local191 == 4 && (this.anInt1022 == 0 || this.anInt1022 == 1 && this.method693(local205))) {
							if (local200 > 0 && local200 < 110) {
								local169.method383(8388736, (byte) 2, local205 + " " + this.aStringArray12[local179], 4, local200);
							}
							local171++;
						}
						if (local191 == 5 && this.anInt862 == 0 && this.anInt912 < 2) {
							if (local200 > 0 && local200 < 110) {
								local169.method383(8388608, (byte) 2, this.aStringArray12[local179], 4, local200);
							}
							local171++;
						}
						if (local191 == 6 && this.anInt862 == 0 && this.anInt912 < 2) {
							if (local200 > 0 && local200 < 110) {
								local169.method383(0, (byte) 2, "To " + local205 + ":", 4, local200);
								local169.method383(8388608, (byte) 2, this.aStringArray12[local179], local169.method381("To " + local205, this.anInt876) + 12, local200);
							}
							local171++;
						}
						if (local191 == 8 && (this.anInt1022 == 0 || this.anInt1022 == 1 && this.method693(local205))) {
							if (local200 > 0 && local200 < 110) {
								local169.method383(8270336, (byte) 2, local205 + " " + this.aStringArray12[local179], 4, local200);
							}
							local171++;
						}
					}
				}
				Class1_Sub1_Sub1.method547();
				this.anInt853 = local171 * 14 + 7;
				if (this.anInt853 < 78) {
					this.anInt853 = 78;
				}
				this.method665(this.anInt853 - this.anInt880 - 77, 77, this.anInt853, 0, 463);
				@Pc(651) String local651;
				if (aClass1_Sub1_Sub2_Sub2_Sub1_1 == null || aClass1_Sub1_Sub2_Sub2_Sub1_1.aString5 == null) {
					local651 = Class49.method542(this.aString23);
				} else {
					local651 = aClass1_Sub1_Sub2_Sub2_Sub1_1.aString5;
				}
				local169.method383(0, (byte) 2, local651 + ":", 4, 90);
				local169.method383(255, (byte) 2, this.aString17 + "*", local169.method381(local651 + ": ", this.anInt876) + 6, 90);
				Class1_Sub1_Sub1.method554(479, 0, 0, 77);
			} else {
				this.method704(0, Class43.aClass43Array1[this.anInt965], 0, 0);
			}
			if (this.aBoolean217 && this.anInt865 == 2) {
				this.method611();
			}
			this.aClass7_24.method93(super.aGraphics2, 357, 17);
			this.aClass7_23.method92();
			Class1_Sub1_Sub1_Sub1.anIntArray16 = this.anIntArray223;
		} catch (@Pc(733) RuntimeException local733) {
			signlink.reporterror("82688, " + 40 + ", " + local733.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZB)V")
	private void method649(@OriginalArg(0) boolean arg0) {
		try {
			this.method652();
			this.aClass7_14.method92();
			this.aClass1_Sub1_Sub1_Sub4_13.method563(0, 0);
			@Pc(52) byte local52;
			@Pc(64) int local64;
			if (this.anInt1014 == 0) {
				this.aClass1_Sub1_Sub1_Sub3_2.method380(true, this.aClass31_Sub1_1.aString16, 180, 7711145, 180);
				local52 = 80;
				this.aClass1_Sub1_Sub1_Sub3_4.method380(true, "Welcome to RuneScape", 180, 16776960, 80);
				local64 = local52 + 30;
				this.aClass1_Sub1_Sub1_Sub4_14.method563(100, 27);
				this.aClass1_Sub1_Sub1_Sub3_4.method380(true, "New User", 100, 16777215, 125);
				this.aClass1_Sub1_Sub1_Sub4_14.method563(100, 187);
				this.aClass1_Sub1_Sub1_Sub3_4.method380(true, "Existing User", 260, 16777215, 125);
			}
			if (this.anInt1014 == 2) {
				local52 = 60;
				if (this.aString19.length() > 0) {
					this.aClass1_Sub1_Sub1_Sub3_4.method380(true, this.aString19, 180, 16776960, 45);
					this.aClass1_Sub1_Sub1_Sub3_4.method380(true, this.aString20, 180, 16776960, 60);
					local64 = local52 + 30;
				} else {
					this.aClass1_Sub1_Sub1_Sub3_4.method380(true, this.aString20, 180, 16776960, 53);
					local64 = local52 + 30;
				}
				this.aClass1_Sub1_Sub1_Sub3_4.method387("Username: " + this.aString23 + (this.anInt1002 == 0 & anInt907 % 40 < 20 ? "@yel@|" : ""), true, 90, 16777215, 90);
				local64 += 15;
				this.aClass1_Sub1_Sub1_Sub3_4.method387("Password: " + Class49.method543(this.aString24) + (this.anInt1002 == 1 & anInt907 % 40 < 20 ? "@yel@|" : ""), true, 92, 16777215, 105);
				local64 += 15;
				if (!arg0) {
					this.aClass1_Sub1_Sub1_Sub4_14.method563(130, 27);
					this.aClass1_Sub1_Sub1_Sub3_4.method380(true, "Login", 100, 16777215, 155);
					this.aClass1_Sub1_Sub1_Sub4_14.method563(130, 187);
					this.aClass1_Sub1_Sub1_Sub3_4.method380(true, "Cancel", 260, 16777215, 155);
				}
			}
			if (this.anInt1014 == 3) {
				this.aClass1_Sub1_Sub1_Sub3_4.method380(true, "Create a free account", 180, 16776960, 40);
				local52 = 65;
				this.aClass1_Sub1_Sub1_Sub3_4.method380(true, "To create a new account you need to", 180, 16777215, 65);
				local64 = local52 + 15;
				this.aClass1_Sub1_Sub1_Sub3_4.method380(true, "go back to the main RuneScape webpage", 180, 16777215, 80);
				local64 += 15;
				this.aClass1_Sub1_Sub1_Sub3_4.method380(true, "and choose the red 'create account'", 180, 16777215, 95);
				local64 += 15;
				this.aClass1_Sub1_Sub1_Sub3_4.method380(true, "button at the top right of that page.", 180, 16777215, 110);
				local64 += 15;
				this.aClass1_Sub1_Sub1_Sub4_14.method563(130, 107);
				this.aClass1_Sub1_Sub1_Sub3_4.method380(true, "Cancel", 180, 16777215, 155);
			}
			this.aClass7_14.method93(super.aGraphics2, 171, 202);
			if (this.aBoolean233) {
				this.aBoolean233 = false;
				this.aClass7_12.method93(super.aGraphics2, 0, 128);
				this.aClass7_13.method93(super.aGraphics2, 371, 202);
				this.aClass7_17.method93(super.aGraphics2, 265, 0);
				this.aClass7_18.method93(super.aGraphics2, 265, 562);
				this.aClass7_19.method93(super.aGraphics2, 171, 128);
				this.aClass7_20.method93(super.aGraphics2, 171, 562);
			}
		} catch (@Pc(497) RuntimeException local497) {
			signlink.reporterror("85188, " + arg0 + ", " + 68 + ", " + local497.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method650() {
		try {
			@Pc(22) int local22;
			@Pc(35) int local35;
			@Pc(39) int local39;
			@Pc(43) int local43;
			@Pc(92) int local92;
			@Pc(106) int local106;
			@Pc(118) int local118;
			@Pc(177) int local177;
			try {
				this.anInt1028 = -1;
				this.aClass32_11.method340();
				this.aClass32_10.method340();
				Class1_Sub1_Sub1_Sub1.method58();
				this.method583();
				this.aClass45_1.method465();
				System.gc();
				for (local22 = 0; local22 < 4; local22++) {
					this.aClass20Array1[local22].method276();
				}
				for (local35 = 0; local35 < 4; local35++) {
					for (local39 = 0; local39 < 104; local39++) {
						for (local43 = 0; local43 < 104; local43++) {
							this.aByteArrayArrayArray8[local35][local39][local43] = 0;
						}
					}
				}
				@Pc(78) Class3 local78 = new Class3(104, this.anIntArrayArrayArray8, this.aBoolean201, this.aByteArrayArrayArray8, 104);
				local43 = this.aByteArrayArray5.length;
				this.aClass1_Sub1_Sub3_6.method227(166);
				@Pc(239) int local239;
				@Pc(227) int local227;
				if (!this.aBoolean221) {
					@Pc(123) byte[] local123;
					for (local92 = 0; local92 < local43; local92++) {
						local106 = (this.anIntArray218[local92] >> 8) * 64 - this.anInt1043;
						local118 = (this.anIntArray218[local92] & 0xFF) * 64 - this.anInt1044;
						local123 = this.aByteArrayArray5[local92];
						if (local123 != null) {
							local78.method9(local123, local106, local118, this.aClass20Array1, (this.anInt939 - 6) * 8, (this.anInt938 - 6) * 8);
						}
					}
					for (local106 = 0; local106 < local43; local106++) {
						local118 = (this.anIntArray218[local106] >> 8) * 64 - this.anInt1043;
						local177 = (this.anIntArray218[local106] & 0xFF) * 64 - this.anInt1044;
						@Pc(182) byte[] local182 = this.aByteArrayArray5[local106];
						if (local182 == null && this.anInt939 < 800) {
							local78.method8(local177, local118, 64, 64);
						}
					}
					this.aClass1_Sub1_Sub3_6.method227(166);
					for (local118 = 0; local118 < local43; local118++) {
						local123 = this.aByteArrayArray4[local118];
						if (local123 != null) {
							local227 = (this.anIntArray218[local118] >> 8) * 64 - this.anInt1043;
							local239 = (this.anIntArray218[local118] & 0xFF) * 64 - this.anInt1044;
							local78.method18(local239, this.aClass45_1, local227, this.aClass20Array1, local123);
						}
					}
				}
				if (this.aBoolean221) {
					local92 = 0;
					label246: while (true) {
						@Pc(298) int local298;
						@Pc(304) int local304;
						@Pc(314) int local314;
						@Pc(316) int local316;
						if (local92 >= 4) {
							for (local106 = 0; local106 < 13; local106++) {
								for (local118 = 0; local118 < 13; local118++) {
									local177 = this.anIntArrayArrayArray7[0][local106][local118];
									if (local177 == -1) {
										local78.method8(local118 * 8, local106 * 8, 8, 8);
									}
								}
							}
							this.aClass1_Sub1_Sub3_6.method227(166);
							local118 = 0;
							while (true) {
								if (local118 >= 4) {
									break label246;
								}
								for (local177 = 0; local177 < 13; local177++) {
									for (local227 = 0; local227 < 13; local227++) {
										local239 = this.anIntArrayArrayArray7[local118][local177][local227];
										if (local239 != -1) {
											local298 = local239 >> 24 & 0x3;
											local304 = local239 >> 1 & 0x3;
											local314 = local239 >> 14 & 0x3FF;
											local316 = local239 >> 3 & 0x7FF;
											@Pc(479) int local479 = (local314 / 8 << 8) + local316 / 8;
											for (@Pc(481) int local481 = 0; local481 < this.anIntArray218.length; local481++) {
												if (this.anIntArray218[local481] == local479 && this.aByteArrayArray4[local481] != null) {
													local78.method17(local227 * 8, this.aByteArrayArray4[local481], this.aClass20Array1, local298, local177 * 8, (local314 & 0x7) * 8, local118, local304, this.aClass45_1, (local316 & 0x7) * 8);
													break;
												}
											}
										}
									}
								}
								local118++;
							}
						}
						for (local106 = 0; local106 < 13; local106++) {
							for (local118 = 0; local118 < 13; local118++) {
								local177 = this.anIntArrayArrayArray7[local92][local106][local118];
								if (local177 != -1) {
									local227 = local177 >> 24 & 0x3;
									local239 = local177 >> 1 & 0x3;
									local298 = local177 >> 14 & 0x3FF;
									local304 = local177 >> 3 & 0x7FF;
									local314 = (local298 / 8 << 8) + local304 / 8;
									for (local316 = 0; local316 < this.anIntArray218.length; local316++) {
										if (this.anIntArray218[local316] == local314 && this.aByteArrayArray5[local316] != null) {
											local78.method15(local227, this.aClass20Array1, local118 * 8, (local298 & 0x7) * 8, local239, this.aByteArrayArray5[local316], local92, local106 * 8, (local304 & 0x7) * 8);
											break;
										}
									}
								}
							}
						}
						local92++;
					}
				}
				this.aClass1_Sub1_Sub3_6.method227(166);
				local78.method14(this.aClass45_1, this.aClass20Array1);
				this.aClass7_23.method92();
				this.aClass1_Sub1_Sub3_6.method227(166);
				local92 = Class3.anInt14;
				if (local92 > this.anInt850) {
					local92 = this.anInt850;
				}
				if (local92 < this.anInt850 - 1) {
					local92 = this.anInt850 - 1;
				}
				if (aBoolean226) {
					this.aClass45_1.method466(Class3.anInt14);
				} else {
					this.aClass45_1.method466(0);
				}
				for (local106 = 0; local106 < 104; local106++) {
					for (local118 = 0; local118 < 104; local118++) {
						this.method667(local106, local118);
					}
				}
				this.method691();
			} catch (@Pc(624) Exception local624) {
			}
			Class41.aClass30_6.method331();
			if (super.aFrame_Sub1_2 != null) {
				this.aClass1_Sub1_Sub3_6.method227(53);
				this.aClass1_Sub1_Sub3_6.method232(1057001181);
			}
			if (aBoolean226 && signlink.aRandomAccessFile3 != null) {
				local22 = this.aClass31_Sub1_1.method519(0);
				for (local35 = 0; local35 < local22; local35++) {
					local39 = this.aClass31_Sub1_1.method520(local35);
					if ((local39 & 0x79) == 0) {
						Class1_Sub1_Sub2_Sub6.method414(local35);
					}
				}
			}
			System.gc();
			Class1_Sub1_Sub1_Sub1.method59();
			this.aClass31_Sub1_1.method535();
			local22 = (this.anInt938 - 6) / 8 - 1;
			local35 = (this.anInt938 + 6) / 8 + 1;
			local39 = (this.anInt939 - 6) / 8 - 1;
			local43 = (this.anInt939 + 6) / 8 + 1;
			if (this.aBoolean235) {
				local22 = 49;
				local35 = 50;
				local39 = 49;
				local43 = 50;
			}
			for (local92 = local22; local92 <= local35; local92++) {
				for (local106 = local39; local106 <= local43; local106++) {
					if (local92 == local22 || local92 == local35 || local106 == local39 || local106 == local43) {
						local118 = this.aClass31_Sub1_1.method525(0, local92, local106);
						if (local118 != -1) {
							this.aClass31_Sub1_1.method527(local118, 3);
						}
						local177 = this.aClass31_Sub1_1.method525(1, local92, local106);
						if (local177 != -1) {
							this.aClass31_Sub1_1.method527(local177, 3);
						}
					}
				}
			}
		} catch (@Pc(793) RuntimeException local793) {
			signlink.reporterror("98615, " + 595 + ", " + local793.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
	private void method651(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt497 >> 7 == this.anInt1009 && aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt498 >> 7 == this.anInt1010) {
				this.anInt1009 = 0;
			}
			@Pc(21) int local21 = this.anInt898;
			@Pc(25) boolean local25 = false;
			if (arg1) {
				local21 = 1;
			}
			for (@Pc(31) int local31 = 0; local31 < local21; local31++) {
				@Pc(37) Class1_Sub1_Sub2_Sub2_Sub1 local37;
				@Pc(42) int local42;
				if (arg1) {
					local37 = aClass1_Sub1_Sub2_Sub2_Sub1_1;
					local42 = this.anInt897 << 14;
				} else {
					local37 = this.aClass1_Sub1_Sub2_Sub2_Sub1Array1[this.anIntArray229[local31]];
					local42 = this.anIntArray229[local31] << 14;
				}
				if (local37 != null && local37.method323()) {
					local37.aBoolean58 = false;
					if ((aBoolean226 && this.anInt898 > 50 || this.anInt898 > 200) && !arg1 && local37.anInt490 == local37.anInt485) {
						local37.aBoolean58 = true;
					}
					@Pc(93) int local93 = local37.anInt497 >> 7;
					@Pc(98) int local98 = local37.anInt498 >> 7;
					if (local93 >= 0 && local93 < 104 && local98 >= 0 && local98 < 104) {
						if (local37.aClass1_Sub1_Sub2_Sub6_1 == null || anInt907 < local37.anInt257 || anInt907 >= local37.anInt258) {
							if ((local37.anInt497 & 0x7F) == 64 && (local37.anInt498 & 0x7F) == 64) {
								if (this.anIntArrayArray25[local93][local98] == this.anInt851) {
									continue;
								}
								this.anIntArrayArray25[local93][local98] = this.anInt851;
							}
							local37.anInt250 = this.method692(local37.anInt498, local37.anInt497, this.anInt850);
							this.aClass45_1.method476(local37.anInt250, local42, 60, local37.aBoolean102, this.anInt850, local37.anInt497, local37, local37.anInt498, local37.anInt499);
						} else {
							local37.aBoolean58 = false;
							local37.anInt250 = this.method692(local37.anInt498, local37.anInt497, this.anInt850);
							this.aClass45_1.method477(this.anInt850, local37.anInt260, local37.anInt262, local37.anInt497, local37.anInt250, local37, local37.anInt499, local42, local37.anInt263, local37.anInt498, local37.anInt261);
						}
					}
				}
			}
		} catch (@Pc(227) RuntimeException local227) {
			signlink.reporterror("99959, " + arg0 + ", " + arg1 + ", " + local227.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method652() {
		try {
			if (this.aClass7_12 == null) {
				super.aClass7_2 = null;
				this.aClass7_24 = null;
				this.aClass7_22 = null;
				this.aClass7_21 = null;
				this.aClass7_23 = null;
				this.aClass7_25 = null;
				this.aClass7_26 = null;
				this.aClass7_27 = null;
				this.aClass7_15 = new Class7(128, this.method578(aByte61), 265, 912);
				Class1_Sub1_Sub1.method549(this.aBoolean204);
				this.aClass7_16 = new Class7(128, this.method578(aByte61), 265, 912);
				Class1_Sub1_Sub1.method549(this.aBoolean204);
				this.aClass7_12 = new Class7(509, this.method578(aByte61), 171, 912);
				Class1_Sub1_Sub1.method549(this.aBoolean204);
				this.aClass7_13 = new Class7(360, this.method578(aByte61), 132, 912);
				Class1_Sub1_Sub1.method549(this.aBoolean204);
				this.aClass7_14 = new Class7(360, this.method578(aByte61), 200, 912);
				Class1_Sub1_Sub1.method549(this.aBoolean204);
				this.aClass7_17 = new Class7(202, this.method578(aByte61), 238, 912);
				if (this.anInt845 != -9534) {
					aBoolean224 = !aBoolean224;
				}
				Class1_Sub1_Sub1.method549(this.aBoolean204);
				this.aClass7_18 = new Class7(203, this.method578(aByte61), 238, 912);
				Class1_Sub1_Sub1.method549(this.aBoolean204);
				this.aClass7_19 = new Class7(74, this.method578(aByte61), 94, 912);
				Class1_Sub1_Sub1.method549(this.aBoolean204);
				this.aClass7_20 = new Class7(75, this.method578(aByte61), 94, 912);
				Class1_Sub1_Sub1.method549(this.aBoolean204);
				if (this.aClass15_1 != null) {
					this.method674(505);
					this.method600();
				}
				this.aBoolean233 = true;
			}
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("58394, " + -9534 + ", " + local177.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!TNOPEJNZ;I)Z")
	private boolean method653(@OriginalArg(0) Class43 arg0) {
		try {
			if (arg0.anIntArray173 == null) {
				return false;
			}
			for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray173.length; local12++) {
				@Pc(20) int local20 = this.method629(arg0, local12);
				@Pc(25) int local25 = arg0.anIntArray175[local12];
				if (arg0.anIntArray173[local12] == 2) {
					if (local20 >= local25) {
						return false;
					}
				} else if (arg0.anIntArray173[local12] == 3) {
					if (local20 <= local25) {
						return false;
					}
				} else if (arg0.anIntArray173[local12] == 4) {
					if (local20 == local25) {
						return false;
					}
				} else if (local20 != local25) {
					return false;
				}
			}
			return true;
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("15883, " + arg0 + ", " + 18875 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method654(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(8) int local8 = this.aClass45_1.method491(arg2, arg1, arg0);
			@Pc(18) int local18;
			@Pc(24) int local24;
			@Pc(28) int local28;
			@Pc(30) int local30;
			@Pc(52) int local52;
			@Pc(58) int local58;
			if (local8 != 0) {
				local18 = this.aClass45_1.method495(arg2, arg1, arg0, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = arg3;
				if (local8 > 0) {
					local30 = arg4;
				}
				@Pc(38) int[] local38 = this.aClass1_Sub1_Sub1_Sub2_16.anIntArray24;
				local52 = arg1 * 4 + (103 - arg0) * 512 * 4 + 24624;
				local58 = local8 >> 14 & 0x7FFF;
				@Pc(61) Class41 local61 = Class41.method452(local58);
				if (local61.anInt647 == -1) {
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
					@Pc(71) Class1_Sub1_Sub1_Sub4 local71 = this.aClass1_Sub1_Sub1_Sub4Array5[local61.anInt647];
					if (local71 != null) {
						@Pc(83) int local83 = (local61.anInt648 * 4 - local71.anInt810) / 2;
						@Pc(93) int local93 = (local61.anInt640 * 4 - local71.anInt811) / 2;
						local71.method563((104 - arg0 - local61.anInt640) * 4 + local93 + 48, arg1 * 4 + 48 + local83);
					}
				}
			}
			local8 = this.aClass45_1.method493(arg2, arg1, arg0);
			if (local8 != 0) {
				local18 = this.aClass45_1.method495(arg2, arg1, arg0, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = local8 >> 14 & 0x7FFF;
				@Pc(447) Class41 local447 = Class41.method452(local30);
				@Pc(479) int local479;
				if (local447.anInt647 != -1) {
					@Pc(457) Class1_Sub1_Sub1_Sub4 local457 = this.aClass1_Sub1_Sub1_Sub4Array5[local447.anInt647];
					if (local457 != null) {
						local58 = (local447.anInt648 * 4 - local457.anInt810) / 2;
						local479 = (local447.anInt640 * 4 - local457.anInt811) / 2;
						local457.method563((104 - arg0 - local447.anInt640) * 4 + local479 + 48, arg1 * 4 + 48 + local58);
					}
				} else if (local28 == 9) {
					local52 = 15658734;
					if (local8 > 0) {
						local52 = 15597568;
					}
					@Pc(516) int[] local516 = this.aClass1_Sub1_Sub1_Sub2_16.anIntArray24;
					local479 = arg1 * 4 + (103 - arg0) * 512 * 4 + 24624;
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
			local8 = this.aClass45_1.method494(arg2, arg1, arg0);
			if (local8 != 0) {
				local18 = local8 >> 14 & 0x7FFF;
				@Pc(619) Class41 local619 = Class41.method452(local18);
				if (local619.anInt647 != -1) {
					@Pc(629) Class1_Sub1_Sub1_Sub4 local629 = this.aClass1_Sub1_Sub1_Sub4Array5[local619.anInt647];
					if (local629 != null) {
						local30 = (local619.anInt648 * 4 - local629.anInt810) / 2;
						@Pc(651) int local651 = (local619.anInt640 * 4 - local629.anInt811) / 2;
						local629.method563((104 - arg0 - local619.anInt640) * 4 + local651 + 48, arg1 * 4 + 48 + local30);
						return;
					}
				}
			}
		} catch (@Pc(675) RuntimeException local675) {
			signlink.reporterror("52390, " + 3 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local675.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method655() {
		try {
			if (this.anInt862 != 0) {
				@Pc(6) Class1_Sub1_Sub1_Sub3 local6 = this.aClass1_Sub1_Sub1_Sub3_3;
				@Pc(13) int local13 = 0;
				if (this.anInt1052 != 0) {
					local13 = 1;
				}
				for (@Pc(20) int local20 = 0; local20 < 100; local20++) {
					if (this.aStringArray12[local20] != null) {
						@Pc(32) int local32 = this.anIntArray268[local20];
						@Pc(37) String local37 = this.aStringArray11[local20];
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
						if ((local32 == 3 || local32 == 7) && (local32 == 7 || this.anInt912 == 0 || this.anInt912 == 1 && this.method693(local37))) {
							local90 = 329 - local13 * 13;
							local6.method383(0, (byte) 2, "From", 4, local90);
							local6.method383(65535, (byte) 2, "From", 4, local90 - 1);
							@Pc(116) int local116 = local6.method381("From ", this.anInt876) + 4;
							if (local39 == 1) {
								this.aClass1_Sub1_Sub1_Sub4Array3[0].method563(local90 - 12, local116);
								local116 += 14;
							}
							if (local39 == 2) {
								this.aClass1_Sub1_Sub1_Sub4Array3[1].method563(local90 - 12, local116);
								local116 += 14;
							}
							local6.method383(0, (byte) 2, local37 + ": " + this.aStringArray12[local20], local116, local90);
							local6.method383(65535, (byte) 2, local37 + ": " + this.aStringArray12[local20], local116, local90 - 1);
							local13++;
							if (local13 >= 5) {
								return;
							}
						}
						if (local32 == 5 && this.anInt912 < 2) {
							local90 = 329 - local13 * 13;
							local6.method383(0, (byte) 2, this.aStringArray12[local20], 4, local90);
							local6.method383(65535, (byte) 2, this.aStringArray12[local20], 4, local90 - 1);
							local13++;
							if (local13 >= 5) {
								return;
							}
						}
						if (local32 == 6 && this.anInt912 < 2) {
							local90 = 329 - local13 * 13;
							local6.method383(0, (byte) 2, "To " + local37 + ": " + this.aStringArray12[local20], 4, local90);
							local6.method383(65535, (byte) 2, "To " + local37 + ": " + this.aStringArray12[local20], 4, local90 - 1);
							local13++;
							if (local13 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(295) RuntimeException local295) {
			signlink.reporterror("38806, " + 636 + ", " + local295.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!DLNMSHLT;I)V")
	private void method656(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub1_Sub2 arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(18) int local18 = this.anInt1005 + this.anInt1016 & 0x7FF;
			@Pc(26) int local26 = arg0 * arg0 + arg2 * arg2;
			if (local26 <= 6400) {
				@Pc(34) int local34 = Class1_Sub1_Sub2_Sub6.anIntArray154[local18];
				@Pc(38) int local38 = Class1_Sub1_Sub2_Sub6.anIntArray155[local18];
				@Pc(47) int local47 = local34 * 256 / (this.anInt1031 + 256);
				@Pc(56) int local56 = local38 * 256 / (this.anInt1031 + 256);
				@Pc(66) int local66 = arg2 * local47 + arg0 * local56 >> 16;
				@Pc(76) int local76 = arg2 * local56 - arg0 * local47 >> 16;
				if (local26 > 2500) {
					arg1.method129(this.aClass1_Sub1_Sub1_Sub4_19, local66 + 94 + 4 - arg1.anInt117 / 2, 83 - local76 - arg1.anInt118 / 2 - 4);
				} else {
					arg1.method123(83 - local76 - arg1.anInt118 / 2 - 4, local66 + 94 - arg1.anInt117 / 2 + 4);
				}
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("7358, " + 8 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method659() {
		try {
			if (this.anInt891 > 0) {
				this.method698();
			} else {
				this.aClass7_23.method92();
				this.aClass1_Sub1_Sub1_Sub3_3.method379(144, 257, "Connection lost", 0);
				this.aClass1_Sub1_Sub1_Sub3_3.method379(143, 256, "Connection lost", 16777215);
				this.aClass1_Sub1_Sub1_Sub3_3.method379(159, 257, "Please wait - attempting to reestablish", 0);
				this.aClass1_Sub1_Sub1_Sub3_3.method379(158, 256, "Please wait - attempting to reestablish", 16777215);
				this.aClass7_23.method93(super.aGraphics2, 4, 4);
				this.anInt929 = 0;
				this.anInt1009 = 0;
				@Pc(68) Class37 local68 = this.aClass37_1;
				this.aBoolean215 = false;
				this.anInt974 = 0;
				this.method706(this.aString23, this.aString24, true);
				if (!this.aBoolean215) {
					this.method698();
				}
				try {
					local68.method394();
				} catch (@Pc(91) Exception local91) {
				}
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("95718, " + -984 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method660() {
		try {
			if (this.anInt846 == 2) {
				this.method589(this.anInt1049 * 2, (this.anInt1048 - this.anInt1044 << 7) + this.anInt1051, this.anInt922, (this.anInt1047 - this.anInt1043 << 7) + this.anInt1050);
				this.anInt887 += 0;
				if (this.anInt1012 > -1 && anInt907 % 20 < 10) {
					this.aClass1_Sub1_Sub1_Sub2Array8[2].method123(this.anInt1013 - 28, this.anInt1012 - 12);
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("29652, " + 0 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!FVFJZZXQ;I)V")
	private void method661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub1_Sub2_Sub2_Sub1 arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg3 != aClass1_Sub1_Sub2_Sub2_Sub1_1 && this.anInt931 < 400) {
				@Pc(35) String local35;
				if (arg3.anInt248 == 0) {
					local35 = arg3.aString5 + method646(arg3.anInt266, aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt266) + " (level-" + arg3.anInt266 + ")";
				} else {
					local35 = arg3.aString5 + " (skill-" + arg3.anInt248 + ")";
				}
				@Pc(165) int local165;
				if (this.anInt1018 == 1) {
					this.aStringArray10[this.anInt931] = "Use " + this.aString28 + " with @whi@" + local35;
					this.anIntArray261[this.anInt931] = 128;
					this.anIntArray262[this.anInt931] = arg2;
					this.anIntArray259[this.anInt931] = arg0;
					this.anIntArray260[this.anInt931] = arg1;
					this.anInt931++;
				} else if (this.anInt900 != 1) {
					for (local165 = 4; local165 >= 0; local165--) {
						if (this.aStringArray13[local165] != null) {
							this.aStringArray10[this.anInt931] = this.aStringArray13[local165] + " @whi@" + local35;
							@Pc(192) short local192 = 0;
							if (this.aStringArray13[local165].equalsIgnoreCase("attack")) {
								if (arg3.anInt266 > aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt266) {
									local192 = 2000;
								}
								if (aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt254 != 0 && arg3.anInt254 != 0) {
									if (aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt254 == arg3.anInt254) {
										local192 = 2000;
									} else {
										local192 = 0;
									}
								}
							} else if (this.aBooleanArray12[local165]) {
								local192 = 2000;
							}
							if (local165 == 0) {
								this.anIntArray261[this.anInt931] = local192 + 901;
							}
							if (local165 == 1) {
								this.anIntArray261[this.anInt931] = local192 + 562;
							}
							if (local165 == 2) {
								this.anIntArray261[this.anInt931] = local192 + 801;
							}
							if (local165 == 3) {
								this.anIntArray261[this.anInt931] = local192 + 338;
							}
							if (local165 == 4) {
								this.anIntArray261[this.anInt931] = local192 + 90;
							}
							this.anIntArray262[this.anInt931] = arg2;
							this.anIntArray259[this.anInt931] = arg0;
							this.anIntArray260[this.anInt931] = arg1;
							this.anInt931++;
						}
					}
				} else if ((this.anInt902 & 0x8) == 8) {
					this.aStringArray10[this.anInt931] = this.aString21 + " @whi@" + local35;
					this.anIntArray261[this.anInt931] = 964;
					this.anIntArray262[this.anInt931] = arg2;
					this.anIntArray259[this.anInt931] = arg0;
					this.anIntArray260[this.anInt931] = arg1;
					this.anInt931++;
				}
				for (local165 = 0; local165 < this.anInt931; local165++) {
					if (this.anIntArray261[local165] == 505) {
						this.aStringArray10[local165] = "Walk here @whi@" + local35;
						break;
					}
				}
				@Pc(345) int local345 = 92 / arg4;
			}
		} catch (@Pc(347) RuntimeException local347) {
			signlink.reporterror("75086, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local347.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)Ljava/net/Socket;")
	public Socket method662(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method663() {
		try {
			if (this.anInt1052 > 1) {
				this.anInt1052--;
			}
			if (this.anInt891 > 0) {
				this.anInt891--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method637((byte) 8); local22++) {
			}
			if (this.aBoolean215) {
				@Pc(41) Object local41 = this.aClass46_1.anObject1;
				@Pc(66) int local66;
				@Pc(68) int local68;
				@Pc(70) int local70;
				@Pc(103) int local103;
				synchronized (this.aClass46_1.anObject1) {
					if (!aBoolean222) {
						this.aClass46_1.anInt769 = 0;
					} else if (super.anInt833 != 0 || this.aClass46_1.anInt769 >= 40) {
						this.aClass1_Sub1_Sub3_6.method227(22);
						this.aClass1_Sub1_Sub3_6.method228(0);
						local66 = this.aClass1_Sub1_Sub3_6.anInt352;
						local68 = 0;
						@Pc(86) int local86;
						for (local70 = 0; local70 < this.aClass46_1.anInt769 && local66 - this.aClass1_Sub1_Sub3_6.anInt352 < 240; local70++) {
							local68++;
							local86 = this.aClass46_1.anIntArray198[local70];
							if (local86 < 0) {
								local86 = 0;
							} else if (local86 > 502) {
								local86 = 502;
							}
							local103 = this.aClass46_1.anIntArray199[local70];
							if (local103 < 0) {
								local103 = 0;
							} else if (local103 > 764) {
								local103 = 764;
							}
							@Pc(120) int local120 = local86 * 765 + local103;
							if (this.aClass46_1.anIntArray198[local70] == -1 && this.aClass46_1.anIntArray199[local70] == -1) {
								local103 = -1;
								local86 = -1;
								local120 = 524287;
							}
							if (local103 != this.anInt904 || local86 != this.anInt905) {
								@Pc(165) int local165 = local103 - this.anInt904;
								this.anInt904 = local103;
								@Pc(173) int local173 = local86 - this.anInt905;
								this.anInt905 = local86;
								if (this.anInt917 < 8 && local165 >= -32 && local165 <= 31 && local173 >= -32 && local173 <= 31) {
									local165 += 32;
									local173 += 32;
									this.aClass1_Sub1_Sub3_6.method229((this.anInt917 << 12) + (local165 << 6) + local173);
									this.anInt917 = 0;
								} else if (this.anInt917 < 8) {
									this.aClass1_Sub1_Sub3_6.method231((this.anInt917 << 19) + local120 + 8388608);
									this.anInt917 = 0;
								} else {
									this.aClass1_Sub1_Sub3_6.method232((this.anInt917 << 19) + local120 - 1073741824);
									this.anInt917 = 0;
								}
							} else if (this.anInt917 < 2047) {
								this.anInt917++;
							}
						}
						this.aClass1_Sub1_Sub3_6.method237(this.aClass1_Sub1_Sub3_6.anInt352 - local66);
						if (local68 >= this.aClass46_1.anInt769) {
							this.aClass46_1.anInt769 = 0;
						} else {
							this.aClass46_1.anInt769 -= local68;
							for (local86 = 0; local86 < this.aClass46_1.anInt769; local86++) {
								this.aClass46_1.anIntArray199[local86] = this.aClass46_1.anIntArray199[local86 + local68];
								this.aClass46_1.anIntArray198[local86] = this.aClass46_1.anIntArray198[local86 + local68];
							}
						}
					}
				}
				if (super.anInt833 != 0) {
					@Pc(336) long local336 = (super.aLong28 - this.aLong30) / 50L;
					if (local336 > 4095L) {
						local336 = 4095L;
					}
					this.aLong30 = super.aLong28;
					local66 = super.anInt835;
					if (local66 < 0) {
						local66 = 0;
					} else if (local66 > 502) {
						local66 = 502;
					}
					local68 = super.anInt834;
					if (local68 < 0) {
						local68 = 0;
					} else if (local68 > 764) {
						local68 = 764;
					}
					local70 = local66 * 765 + local68;
					@Pc(382) byte local382 = 0;
					if (super.anInt833 == 2) {
						local382 = 1;
					}
					local103 = (int) local336;
					this.aClass1_Sub1_Sub3_6.method227(160);
					this.aClass1_Sub1_Sub3_6.method232((local103 << 20) + (local382 << 19) + local70);
				}
				if (this.anInt997 > 0) {
					this.anInt997--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean229 = true;
				}
				if (this.aBoolean229 && this.anInt997 <= 0) {
					this.anInt997 = 20;
					this.aBoolean229 = false;
					this.aClass1_Sub1_Sub3_6.method227(188);
					this.aClass1_Sub1_Sub3_6.method264(this.anInt1005);
					this.aClass1_Sub1_Sub3_6.method263(this.anInt1004);
				}
				if (super.aBoolean196 && !this.aBoolean220) {
					this.aBoolean220 = true;
					this.aClass1_Sub1_Sub3_6.method227(136);
					this.aClass1_Sub1_Sub3_6.method228(1);
				}
				if (!super.aBoolean196 && this.aBoolean220) {
					this.aBoolean220 = false;
					this.aClass1_Sub1_Sub3_6.method227(136);
					this.aClass1_Sub1_Sub3_6.method228(0);
				}
				this.method623();
				this.method599();
				this.method619();
				this.anInt889++;
				if (this.anInt889 > 750) {
					this.method659();
				}
				this.method641(this.anInt870);
				this.method679();
				this.method713();
				anInt911++;
				if (anInt911 > 85) {
					anInt911 = 0;
					this.aClass1_Sub1_Sub3_6.method227(245);
				}
				this.anInt840++;
				if (this.anInt964 != 0) {
					this.anInt963 += 20;
					if (this.anInt963 >= 400) {
						this.anInt964 = 0;
					}
				}
				if (this.anInt1027 != 0) {
					this.anInt1024++;
					if (this.anInt1024 >= 15) {
						if (this.anInt1027 == 2) {
							this.aBoolean232 = true;
						}
						if (this.anInt1027 == 3) {
							this.aBoolean242 = true;
						}
						this.anInt1027 = 0;
					}
				}
				if (this.anInt857 != 0) {
					this.anInt882++;
					if (super.anInt828 > this.anInt858 + 5 || super.anInt828 < this.anInt858 - 5 || super.anInt829 > this.anInt859 + 5 || super.anInt829 < this.anInt859 - 5) {
						this.aBoolean238 = true;
					}
					if (super.anInt827 == 0) {
						if (this.anInt857 == 2) {
							this.aBoolean232 = true;
						}
						if (this.anInt857 == 3) {
							this.aBoolean242 = true;
						}
						this.anInt857 = 0;
						if (this.aBoolean238 && this.anInt882 >= 5) {
							this.anInt927 = -1;
							this.method676();
							if (this.anInt927 == this.anInt855 && this.anInt926 != this.anInt856) {
								@Pc(699) Class43 local699 = Class43.aClass43Array1[this.anInt855];
								@Pc(701) byte local701 = 0;
								if (this.anInt1008 == 1 && local699.anInt712 == 206) {
									local701 = 1;
								}
								if (local699.anIntArray177[this.anInt926] <= 0) {
									local701 = 0;
								}
								if (local699.aBoolean148) {
									local66 = this.anInt856;
									local68 = this.anInt926;
									local699.anIntArray177[local68] = local699.anIntArray177[local66];
									local699.anIntArray174[local68] = local699.anIntArray174[local66];
									local699.anIntArray177[local66] = -1;
									local699.anIntArray174[local66] = 0;
								} else if (local701 == 1) {
									local66 = this.anInt856;
									local68 = this.anInt926;
									while (local66 != local68) {
										if (local66 > local68) {
											local699.method459(local66, local66 - 1);
											local66--;
										} else if (local66 < local68) {
											local699.method459(local66, local66 + 1);
											local66++;
										}
									}
								} else {
									local699.method459(this.anInt856, this.anInt926);
								}
								this.aClass1_Sub1_Sub3_6.method227(228);
								this.aClass1_Sub1_Sub3_6.method254(local701);
								this.aClass1_Sub1_Sub3_6.method229(this.anInt855);
								this.aClass1_Sub1_Sub3_6.method265(this.anInt856);
								this.aClass1_Sub1_Sub3_6.method229(this.anInt926);
							}
						} else if ((this.anInt1040 == 1 || this.method634(this.anInt931 - 1)) && this.anInt931 > 2) {
							this.method617();
						} else if (this.anInt931 > 0) {
							this.method620(this.anInt931 - 1);
						}
						this.anInt1024 = 10;
						super.anInt833 = 0;
					}
				}
				@Pc(873) int local873;
				@Pc(875) int local875;
				if (Class45.anInt758 != -1) {
					local873 = Class45.anInt758;
					local875 = Class45.anInt759;
					@Pc(896) boolean local896 = this.method690(local873, 0, 0, 0, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0], 0, true, 0, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0], 0, local875);
					Class45.anInt758 = -1;
					if (local896) {
						this.anInt961 = super.anInt834;
						this.anInt962 = super.anInt835;
						this.anInt964 = 1;
						this.anInt963 = 0;
					}
				}
				if (super.anInt833 == 1 && this.aString18 != null) {
					this.aString18 = null;
					this.aBoolean242 = true;
					super.anInt833 = 0;
				}
				this.method594();
				this.method708(this.anInt942);
				this.method666();
				this.method694(this.aByte62);
				if (super.anInt827 == 1 || super.anInt833 == 1) {
					this.anInt903++;
				}
				if (this.anInt908 == 2) {
					this.method632();
				}
				if (this.anInt908 == 2 && this.aBoolean208) {
					this.method701(217);
				}
				for (local873 = 0; local873 < 5; local873++) {
					@Pc(993) int local993 = this.anIntArray234[local873]++;
				}
				this.method586();
				super.anInt826++;
				if (super.anInt826 > 4500) {
					this.anInt891 = 250;
					super.anInt826 -= 500;
					this.aClass1_Sub1_Sub3_6.method227(243);
				}
				this.anInt973++;
				if (this.anInt973 > 500) {
					this.anInt973 = 0;
					local875 = (int) (Math.random() * 8.0D);
					if ((local875 & 0x1) == 1) {
						this.anInt924 += this.anInt925;
					}
					if ((local875 & 0x2) == 2) {
						this.anInt872 += this.anInt873;
					}
					if ((local875 & 0x4) == 4) {
						this.anInt990 += this.anInt991;
					}
				}
				if (this.anInt924 < -50) {
					this.anInt925 = 2;
				}
				if (this.anInt924 > 50) {
					this.anInt925 = -2;
				}
				if (this.anInt872 < -55) {
					this.anInt873 = 2;
				}
				if (this.anInt872 > 55) {
					this.anInt873 = -2;
				}
				if (this.anInt990 < -40) {
					this.anInt991 = 1;
				}
				if (this.anInt990 > 40) {
					this.anInt991 = -1;
				}
				this.anInt1011++;
				if (this.anInt1011 > 500) {
					this.anInt1011 = 0;
					local875 = (int) (Math.random() * 8.0D);
					if ((local875 & 0x1) == 1) {
						this.anInt1016 += this.anInt1017;
					}
					if ((local875 & 0x2) == 2) {
						this.anInt1031 += this.anInt1032;
					}
				}
				if (this.anInt1016 < -60) {
					this.anInt1017 = 2;
				}
				if (this.anInt1016 > 60) {
					this.anInt1017 = -2;
				}
				if (this.anInt1031 < -20) {
					this.anInt1032 = 1;
				}
				if (this.anInt1031 > 10) {
					this.anInt1032 = -1;
				}
				this.anInt890++;
				if (this.anInt890 > 50) {
					this.aClass1_Sub1_Sub3_6.method227(166);
				}
				try {
					if (this.aClass37_1 != null && this.aClass1_Sub1_Sub3_6.anInt352 > 0) {
						this.aClass37_1.method398(this.aClass1_Sub1_Sub3_6.aByteArray3, this.aClass1_Sub1_Sub3_6.anInt352);
						this.aClass1_Sub1_Sub3_6.anInt352 = 0;
						this.anInt890 = 0;
					}
				} catch (@Pc(1235) IOException local1235) {
					this.method659();
				} catch (@Pc(1240) Exception local1240) {
					this.method698();
				}
			}
		} catch (@Pc(1245) RuntimeException local1245) {
			signlink.reporterror("53083, " + -499 + ", " + local1245.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
	private void method664() {
		try {
			this.aClass1_Sub1_Sub3_6.method227(70);
			if (this.anInt906 != -1) {
				this.anInt906 = -1;
				this.aBoolean232 = true;
				this.aBoolean198 = false;
				this.aBoolean213 = true;
			}
			if (this.anInt914 != -1) {
				this.anInt914 = -1;
				this.aBoolean242 = true;
				this.aBoolean198 = false;
			}
			this.anInt895 = -1;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("21237, " + 7 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIZI)V")
	private void method665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass1_Sub1_Sub1_Sub4_1.method563(arg3, arg4);
			this.aClass1_Sub1_Sub1_Sub4_2.method563(arg3 + arg1 - 16, arg4);
			Class1_Sub1_Sub1.method551(arg1 - 32, 16, arg3 + 16, this.anInt847, arg4);
			@Pc(35) int local35 = (arg1 - 32) * arg1 / arg2;
			if (local35 < 8) {
				local35 = 8;
			}
			@Pc(52) int local52 = (arg1 - local35 - 32) * arg0 / (arg2 - arg1);
			Class1_Sub1_Sub1.method551(local35, 16, arg3 + local52 + 16, this.anInt959, arg4);
			Class1_Sub1_Sub1.method556(arg4, arg3 + local52 + 16, this.anInt885, local35);
			Class1_Sub1_Sub1.method556(arg4 + 1, arg3 + 16 + local52, this.anInt885, local35);
			Class1_Sub1_Sub1.method554(16, this.anInt885, arg4, arg3 + local52 + 16);
			Class1_Sub1_Sub1.method554(16, this.anInt885, arg4, arg3 + local52 + 17);
			Class1_Sub1_Sub1.method556(arg4 + 15, arg3 + 16 + local52, this.anInt874, local35);
			Class1_Sub1_Sub1.method556(arg4 + 14, arg3 + 17 + local52, this.anInt874, local35 - 1);
			Class1_Sub1_Sub1.method554(16, this.anInt874, arg4, arg3 + local52 + local35 + 15);
			Class1_Sub1_Sub1.method554(15, this.anInt874, arg4 + 1, arg3 + 14 + local52 + local35);
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("36436, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + local175.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method666() {
		try {
			if (super.anInt833 == 1) {
				if (super.anInt834 >= 539 && super.anInt834 <= 573 && super.anInt835 >= 169 && super.anInt835 < 205 && this.anIntArray249[0] != -1) {
					this.aBoolean232 = true;
					this.anInt967 = 0;
					this.aBoolean213 = true;
				}
				if (super.anInt834 >= 569 && super.anInt834 <= 599 && super.anInt835 >= 168 && super.anInt835 < 205 && this.anIntArray249[1] != -1) {
					this.aBoolean232 = true;
					this.anInt967 = 1;
					this.aBoolean213 = true;
				}
				if (super.anInt834 >= 597 && super.anInt834 <= 627 && super.anInt835 >= 168 && super.anInt835 < 205 && this.anIntArray249[2] != -1) {
					this.aBoolean232 = true;
					this.anInt967 = 2;
					this.aBoolean213 = true;
				}
				if (super.anInt834 >= 625 && super.anInt834 <= 669 && super.anInt835 >= 168 && super.anInt835 < 203 && this.anIntArray249[3] != -1) {
					this.aBoolean232 = true;
					this.anInt967 = 3;
					this.aBoolean213 = true;
				}
				if (super.anInt834 >= 666 && super.anInt834 <= 696 && super.anInt835 >= 168 && super.anInt835 < 205 && this.anIntArray249[4] != -1) {
					this.aBoolean232 = true;
					this.anInt967 = 4;
					this.aBoolean213 = true;
				}
				if (super.anInt834 >= 694 && super.anInt834 <= 724 && super.anInt835 >= 168 && super.anInt835 < 205 && this.anIntArray249[5] != -1) {
					this.aBoolean232 = true;
					this.anInt967 = 5;
					this.aBoolean213 = true;
				}
				if (super.anInt834 >= 722 && super.anInt834 <= 756 && super.anInt835 >= 169 && super.anInt835 < 205 && this.anIntArray249[6] != -1) {
					this.aBoolean232 = true;
					this.anInt967 = 6;
					this.aBoolean213 = true;
				}
				if (super.anInt834 >= 540 && super.anInt834 <= 574 && super.anInt835 >= 466 && super.anInt835 < 502 && this.anIntArray249[7] != -1) {
					this.aBoolean232 = true;
					this.anInt967 = 7;
					this.aBoolean213 = true;
				}
				if (super.anInt834 >= 572 && super.anInt834 <= 602 && super.anInt835 >= 466 && super.anInt835 < 503 && this.anIntArray249[8] != -1) {
					this.aBoolean232 = true;
					this.anInt967 = 8;
					this.aBoolean213 = true;
				}
				if (super.anInt834 >= 599 && super.anInt834 <= 629 && super.anInt835 >= 466 && super.anInt835 < 503 && this.anIntArray249[9] != -1) {
					this.aBoolean232 = true;
					this.anInt967 = 9;
					this.aBoolean213 = true;
				}
				if (super.anInt834 >= 627 && super.anInt834 <= 671 && super.anInt835 >= 467 && super.anInt835 < 502 && this.anIntArray249[10] != -1) {
					this.aBoolean232 = true;
					this.anInt967 = 10;
					this.aBoolean213 = true;
				}
				if (super.anInt834 >= 669 && super.anInt834 <= 699 && super.anInt835 >= 466 && super.anInt835 < 503 && this.anIntArray249[11] != -1) {
					this.aBoolean232 = true;
					this.anInt967 = 11;
					this.aBoolean213 = true;
				}
				if (super.anInt834 >= 696 && super.anInt834 <= 726 && super.anInt835 >= 466 && super.anInt835 < 503 && this.anIntArray249[12] != -1) {
					this.aBoolean232 = true;
					this.anInt967 = 12;
					this.aBoolean213 = true;
				}
				if (super.anInt834 >= 724 && super.anInt834 <= 758 && super.anInt835 >= 466 && super.anInt835 < 502 && this.anIntArray249[13] != -1) {
					this.aBoolean232 = true;
					this.anInt967 = 13;
					this.aBoolean213 = true;
					return;
				}
			}
		} catch (@Pc(443) RuntimeException local443) {
			signlink.reporterror("97017, " + 49818 + ", " + local443.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)V")
	private void method667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class32 local9 = this.aClass32ArrayArrayArray1[this.anInt850][arg0][arg1];
		if (local9 == null) {
			this.aClass45_1.method486(this.anInt850, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub1_Sub2_Sub1 local23 = null;
		@Pc(27) Class1_Sub1_Sub2_Sub1 local27;
		for (local27 = (Class1_Sub1_Sub2_Sub1) local9.method336(); local27 != null; local27 = (Class1_Sub1_Sub2_Sub1) local9.method338()) {
			@Pc(32) Class27 local32 = Class27.method308(local27.anInt84);
			@Pc(35) int local35 = local32.anInt436;
			if (local32.aBoolean95) {
				local35 *= local27.anInt83 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method334(local23);
		@Pc(65) Class1_Sub1_Sub2_Sub1 local65 = null;
		@Pc(67) Class1_Sub1_Sub2_Sub1 local67 = null;
		for (local27 = (Class1_Sub1_Sub2_Sub1) local9.method336(); local27 != null; local27 = (Class1_Sub1_Sub2_Sub1) local9.method338()) {
			if (local27.anInt84 != local23.anInt84 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt84 != local23.anInt84 && local27.anInt84 != local65.anInt84 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass45_1.method472(local110, local65, this.method692(arg1 * 128 + 64, arg0 * 128 + 64, this.anInt850), local23, arg0, this.anInt850, arg1, local67);
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method668(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 4 || arg0 > 4) {
				this.anInt870 = this.aClass50_2.method565();
			}
			while (true) {
				@Pc(16) Class1_Sub1_Sub4 local16 = this.aClass31_Sub1_1.method530();
				if (local16 == null) {
					return;
				}
				if (local16.anInt401 == 0) {
					Class1_Sub1_Sub2_Sub6.method413(local16.anInt399, local16.aByteArray5);
					if ((this.aClass31_Sub1_1.method520(local16.anInt399) & 0x62) != 0) {
						this.aBoolean232 = true;
						if (this.anInt914 != -1) {
							this.aBoolean242 = true;
						}
					}
				}
				if (local16.anInt401 == 1 && local16.aByteArray5 != null) {
					Class13.method144(local16.aByteArray5);
				}
				if (local16.anInt401 == 2 && local16.anInt399 == this.anInt913 && local16.aByteArray5 != null) {
					this.method596(this.anInt852, local16.aByteArray5, this.aBoolean211);
				}
				if (local16.anInt401 == 3 && this.anInt908 == 1) {
					for (@Pc(88) int local88 = 0; local88 < this.aByteArrayArray5.length; local88++) {
						if (this.anIntArray219[local88] == local16.anInt399) {
							this.aByteArrayArray5[local88] = local16.aByteArray5;
							if (local16.aByteArray5 == null) {
								this.anIntArray219[local88] = -1;
							}
							break;
						}
						if (this.anIntArray220[local88] == local16.anInt399) {
							this.aByteArrayArray4[local88] = local16.aByteArray5;
							if (local16.aByteArray5 == null) {
								this.anIntArray220[local88] = -1;
							}
							break;
						}
					}
				}
				if (local16.anInt401 == 93 && this.aClass31_Sub1_1.method537(local16.anInt399)) {
					Class3.method13(new Class1_Sub1_Sub3(local16.aByteArray5, 8), this.aClass31_Sub1_1);
				}
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("37249, " + arg0 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II[B)Z")
	private boolean method669(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			return arg1 == null ? true : signlink.wavesave(arg1, arg0);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("38693, " + arg0 + ", " + -259 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(II)V")
	private void method670(@OriginalArg(0) int arg0) {
		try {
			this.anInt887 += 0;
			signlink.anInt1063 = arg0;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("71686, " + arg0 + ", " + 0 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!TNOPEJNZ;I)V")
	private void method671(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(8) int local8 = arg0.anInt712;
			@Pc(64) int local64;
			if ((local8 < 1 || local8 > 100) && (local8 < 701 || local8 > 800)) {
				if (local8 >= 101 && local8 <= 200 || local8 >= 801 && local8 <= 900) {
					local64 = this.anInt919;
					if (this.anInt920 != 2) {
						local64 = 0;
					}
					if (local8 > 800) {
						local8 -= 701;
					} else {
						local8 -= 101;
					}
					if (local8 >= local64) {
						arg0.aString15 = "";
						arg0.anInt711 = 0;
					} else {
						if (this.anIntArray267[local8] == 0) {
							arg0.aString15 = "@red@Offline";
						} else if (this.anIntArray267[local8] == anInt975) {
							arg0.aString15 = "@gre@World-" + (this.anIntArray267[local8] - 9);
						} else {
							arg0.aString15 = "@yel@World-" + (this.anIntArray267[local8] - 9);
						}
						arg0.anInt711 = 1;
					}
				} else if (local8 == 203) {
					local64 = this.anInt919;
					if (this.anInt920 != 2) {
						local64 = 0;
					}
					arg0.anInt701 = local64 * 15 + 20;
					if (arg0.anInt701 <= arg0.anInt707) {
						arg0.anInt701 = arg0.anInt707 + 1;
					}
				} else if (local8 >= 401 && local8 <= 500) {
					local8 -= 401;
					if (local8 == 0 && this.anInt920 == 0) {
						arg0.aString15 = "Loading ignore list";
						arg0.anInt711 = 0;
					} else if (local8 == 1 && this.anInt920 == 0) {
						arg0.aString15 = "Please wait...";
						arg0.anInt711 = 0;
					} else {
						local64 = this.anInt969;
						if (this.anInt920 == 0) {
							local64 = 0;
						}
						if (local8 >= local64) {
							arg0.aString15 = "";
							arg0.anInt711 = 0;
						} else {
							arg0.aString15 = Class49.method542(Class49.method539(this.aLongArray3[local8]));
							arg0.anInt711 = 1;
						}
					}
				} else if (local8 == 503) {
					arg0.anInt701 = this.anInt969 * 15 + 20;
					if (arg0.anInt701 <= arg0.anInt707) {
						arg0.anInt701 = arg0.anInt707 + 1;
					}
				} else if (local8 == 327) {
					arg0.anInt714 = 150;
					arg0.anInt715 = (int) (Math.sin((double) anInt907 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean205) {
						for (local64 = 0; local64 < 7; local64++) {
							@Pc(333) int local333 = this.anIntArray213[local64];
							if (local333 >= 0 && !Class8.aClass8Array1[local333].method133()) {
								return;
							}
						}
						this.aBoolean205 = false;
						@Pc(352) Class1_Sub1_Sub2_Sub6[] local352 = new Class1_Sub1_Sub2_Sub6[7];
						@Pc(354) int local354 = 0;
						for (@Pc(356) int local356 = 0; local356 < 7; local356++) {
							@Pc(363) int local363 = this.anIntArray213[local356];
							if (local363 >= 0) {
								local352[local354++] = Class8.aClass8Array1[local363].method134();
							}
						}
						@Pc(386) Class1_Sub1_Sub2_Sub6 local386 = new Class1_Sub1_Sub2_Sub6(local354, local352, this.anInt956);
						for (@Pc(388) int local388 = 0; local388 < 5; local388++) {
							if (this.anIntArray225[local388] != 0) {
								local386.method429(anIntArrayArray22[local388][0], anIntArrayArray22[local388][this.anIntArray225[local388]]);
								if (local388 == 1) {
									local386.method429(anIntArray254[0], anIntArray254[this.anIntArray225[local388]]);
								}
							}
						}
						local386.method422(this.anInt946);
						local386.method423(Class23.aClass23Array1[aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt485].anIntArray76[0], this.aByte56);
						local386.method432(64, 850, -30, -50, -30, true);
						arg0.anInt689 = 5;
						arg0.anInt690 = 0;
						Class43.method457(local386);
					}
				} else if (local8 == 324) {
					if (this.aClass1_Sub1_Sub1_Sub2_6 == null) {
						this.aClass1_Sub1_Sub1_Sub2_6 = arg0.aClass1_Sub1_Sub1_Sub2_2;
						this.aClass1_Sub1_Sub1_Sub2_7 = arg0.aClass1_Sub1_Sub1_Sub2_1;
					}
					if (this.aBoolean231) {
						arg0.aClass1_Sub1_Sub1_Sub2_2 = this.aClass1_Sub1_Sub1_Sub2_7;
					} else {
						arg0.aClass1_Sub1_Sub1_Sub2_2 = this.aClass1_Sub1_Sub1_Sub2_6;
					}
				} else if (local8 == 325) {
					if (this.aClass1_Sub1_Sub1_Sub2_6 == null) {
						this.aClass1_Sub1_Sub1_Sub2_6 = arg0.aClass1_Sub1_Sub1_Sub2_2;
						this.aClass1_Sub1_Sub1_Sub2_7 = arg0.aClass1_Sub1_Sub1_Sub2_1;
					}
					if (this.aBoolean231) {
						arg0.aClass1_Sub1_Sub1_Sub2_2 = this.aClass1_Sub1_Sub1_Sub2_6;
					} else {
						arg0.aClass1_Sub1_Sub1_Sub2_2 = this.aClass1_Sub1_Sub1_Sub2_7;
					}
				} else if (local8 == 600) {
					arg0.aString15 = this.aString22;
					if (anInt907 % 20 < 10) {
						arg0.aString15 = arg0.aString15 + "|";
					} else {
						arg0.aString15 = arg0.aString15 + " ";
					}
				} else {
					if (local8 == 613) {
						if (this.anInt1003 < 1) {
							arg0.aString15 = "";
						} else if (this.aBoolean218) {
							arg0.anInt721 = 16711680;
							arg0.aString15 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt721 = 16777215;
							arg0.aString15 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(596) String local596;
					if (local8 == 650 || local8 == 655) {
						if (this.anInt930 == 0) {
							arg0.aString15 = "";
						} else {
							if (this.anInt957 == 0) {
								local596 = "earlier today";
							} else if (this.anInt957 == 1) {
								local596 = "yesterday";
							} else {
								local596 = this.anInt957 + " days ago";
							}
							arg0.aString15 = "You last logged in " + local596 + " from: " + signlink.dns;
						}
					}
					if (local8 == 651) {
						if (this.anInt998 == 0) {
							arg0.aString15 = "0 unread messages";
							arg0.anInt721 = 16776960;
						}
						if (this.anInt998 == 1) {
							arg0.aString15 = "1 unread message";
							arg0.anInt721 = 65280;
						}
						if (this.anInt998 > 1) {
							arg0.aString15 = this.anInt998 + " unread messages";
							arg0.anInt721 = 65280;
						}
					}
					if (local8 == 652) {
						if (this.anInt979 == 201) {
							if (this.anInt879 == 1) {
								arg0.aString15 = "@yel@This is a non-members world: @whi@Since you are a member we";
							} else {
								arg0.aString15 = "";
							}
						} else if (this.anInt979 == 200) {
							arg0.aString15 = "You have not yet set any password recovery questions.";
						} else {
							if (this.anInt979 == 0) {
								local596 = "Earlier today";
							} else if (this.anInt979 == 1) {
								local596 = "Yesterday";
							} else {
								local596 = this.anInt979 + " days ago";
							}
							arg0.aString15 = local596 + " you changed your recovery questions";
						}
					}
					if (local8 == 653) {
						if (this.anInt979 == 201) {
							if (this.anInt879 == 1) {
								arg0.aString15 = "@whi@recommend you use a members world instead. You may use";
							} else {
								arg0.aString15 = "";
							}
						} else if (this.anInt979 == 200) {
							arg0.aString15 = "We strongly recommend you do so now to secure your account.";
						} else {
							arg0.aString15 = "If you do not remember making this change then cancel it immediately";
						}
					}
					if (local8 == 654) {
						if (this.anInt979 == 201) {
							if (this.anInt879 == 1) {
								arg0.aString15 = "@whi@this world but member benefits are unavailable whilst here.";
							} else {
								arg0.aString15 = "";
							}
						} else if (this.anInt979 == 200) {
							arg0.aString15 = "Do this from the 'account management' area on our front webpage";
						} else {
							arg0.aString15 = "Do this from the 'account management' area on our front webpage";
						}
					}
				}
			} else if (local8 == 1 && this.anInt920 == 0) {
				arg0.aString15 = "Loading friend list";
				arg0.anInt711 = 0;
			} else if (local8 == 1 && this.anInt920 == 1) {
				arg0.aString15 = "Connecting to friendserver";
				arg0.anInt711 = 0;
			} else if (local8 == 2 && this.anInt920 != 2) {
				arg0.aString15 = "Please wait...";
				arg0.anInt711 = 0;
			} else {
				local64 = this.anInt919;
				if (this.anInt920 != 2) {
					local64 = 0;
				}
				if (local8 > 700) {
					local8 -= 601;
				} else {
					local8--;
				}
				if (local8 >= local64) {
					arg0.aString15 = "";
					arg0.anInt711 = 0;
				} else {
					arg0.aString15 = this.aStringArray8[local8];
					arg0.anInt711 = 1;
				}
			}
		} catch (@Pc(804) RuntimeException local804) {
			signlink.reporterror("21490, " + arg0 + ", " + arg1 + ", " + local804.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
	private void method672() {
		try {
			this.aBoolean228 = true;
			try {
				@Pc(6) long local6 = System.currentTimeMillis();
				@Pc(8) int local8 = 0;
				@Pc(10) int local10 = 20;
				while (this.aBoolean237) {
					this.anInt960++;
					this.method645();
					this.method645();
					this.method675();
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
			this.aBoolean228 = false;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("32951, " + 0 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!JHKSAGUC;II)V")
	private void method673(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt887 += 0;
			@Pc(14) int local14;
			@Pc(31) int local31;
			@Pc(40) int local40;
			@Pc(47) int local47;
			@Pc(51) int local51;
			@Pc(71) int local71;
			@Pc(83) int local83;
			@Pc(97) int local97;
			@Pc(109) int local109;
			@Pc(18) int local18;
			@Pc(22) int local22;
			@Pc(27) int local27;
			if (arg1 == 189) {
				local14 = arg0.method258();
				local18 = local14 >> 2;
				local22 = local14 & 0x3;
				local27 = this.anIntArray228[local18];
				local31 = arg0.method257();
				local40 = this.anInt999 + (local31 >> 4 & 0x7);
				local47 = this.anInt1000 + (local31 & 0x7);
				local51 = arg0.method267();
				if (local40 >= 0 && local47 >= 0 && local40 < 103 && local47 < 103) {
					local71 = this.anIntArrayArrayArray8[this.anInt850][local40][local47];
					local83 = this.anIntArrayArrayArray8[this.anInt850][local40 + 1][local47];
					local97 = this.anIntArrayArrayArray8[this.anInt850][local40 + 1][local47 + 1];
					local109 = this.anIntArrayArrayArray8[this.anInt850][local40][local47 + 1];
					if (local27 == 0) {
						@Pc(120) Class33 local120 = this.aClass45_1.method487(local47, local40, this.anInt850);
						if (local120 != null) {
							@Pc(129) int local129 = local120.anInt534 >> 14 & 0x7FFF;
							if (local18 == 2) {
								local120.aClass1_Sub1_Sub2_6 = new Class1_Sub1_Sub2_Sub3(2, local22 + 4, local83, local129, -611, local51, local109, local97, false, local71);
								local120.aClass1_Sub1_Sub2_7 = new Class1_Sub1_Sub2_Sub3(2, local22 + 1 & 0x3, local83, local129, -611, local51, local109, local97, false, local71);
							} else {
								local120.aClass1_Sub1_Sub2_6 = new Class1_Sub1_Sub2_Sub3(local18, local22, local83, local129, -611, local51, local109, local97, false, local71);
							}
						}
					}
					if (local27 == 1) {
						@Pc(197) Class25 local197 = this.aClass45_1.method488(local47, this.anInt850, local40, 297);
						if (local197 != null) {
							local197.aClass1_Sub1_Sub2_4 = new Class1_Sub1_Sub2_Sub3(4, 0, local83, local197.anInt410 >> 14 & 0x7FFF, -611, local51, local109, local97, false, local71);
						}
					}
					if (local27 == 2) {
						@Pc(231) Class26 local231 = this.aClass45_1.method489(local47, this.anInt850, local40);
						if (local18 == 11) {
							local18 = 10;
						}
						if (local231 != null) {
							local231.aClass1_Sub1_Sub2_5 = new Class1_Sub1_Sub2_Sub3(local18, local22, local83, local231.anInt422 >> 14 & 0x7FFF, -611, local51, local109, local97, false, local71);
						}
					}
					if (local27 == 3) {
						@Pc(270) Class38 local270 = this.aClass45_1.method490(local40, local47, this.anInt850);
						if (local270 != null) {
							local270.aClass1_Sub1_Sub2_8 = new Class1_Sub1_Sub2_Sub3(22, local22, local83, local270.anInt579 >> 14 & 0x7FFF, -611, local51, local109, local97, false, local71);
						}
					}
				}
			} else {
				@Pc(338) Class1_Sub1_Sub2_Sub1 local338;
				if (arg1 == 19) {
					local14 = arg0.method267();
					local18 = arg0.method268();
					local22 = arg0.method258();
					local27 = this.anInt999 + (local22 >> 4 & 0x7);
					local31 = this.anInt1000 + (local22 & 0x7);
					if (local27 >= 0 && local31 >= 0 && local27 < 104 && local31 < 104) {
						local338 = new Class1_Sub1_Sub2_Sub1();
						local338.anInt84 = local14;
						local338.anInt83 = local18;
						if (this.aClass32ArrayArrayArray1[this.anInt850][local27][local31] == null) {
							this.aClass32ArrayArrayArray1[this.anInt850][local27][local31] = new Class32(-392);
						}
						this.aClass32ArrayArrayArray1[this.anInt850][local27][local31].method333(local338);
						this.method667(local27, local31);
					}
				} else if (arg1 == 78) {
					local14 = arg0.method267();
					local18 = arg0.method268();
					local22 = arg0.method268();
					local27 = arg0.method238();
					local31 = this.anInt999 + (local27 >> 4 & 0x7);
					local40 = this.anInt1000 + (local27 & 0x7);
					if (local31 >= 0 && local40 >= 0 && local31 < 104 && local40 < 104 && local22 != this.anInt966) {
						@Pc(435) Class1_Sub1_Sub2_Sub1 local435 = new Class1_Sub1_Sub2_Sub1();
						local435.anInt84 = local18;
						local435.anInt83 = local14;
						if (this.aClass32ArrayArrayArray1[this.anInt850][local31][local40] == null) {
							this.aClass32ArrayArrayArray1[this.anInt850][local31][local40] = new Class32(-392);
						}
						this.aClass32ArrayArrayArray1[this.anInt850][local31][local40].method333(local435);
						this.method667(local31, local40);
					}
				} else if (arg1 == 32) {
					local14 = arg0.method238();
					local18 = this.anInt999 + (local14 >> 4 & 0x7);
					local22 = this.anInt1000 + (local14 & 0x7);
					local27 = arg0.method240();
					local31 = arg0.method240();
					local40 = arg0.method240();
					if (local18 >= 0 && local22 >= 0 && local18 < 104 && local22 < 104) {
						@Pc(531) Class32 local531 = this.aClass32ArrayArrayArray1[this.anInt850][local18][local22];
						if (local531 != null) {
							for (@Pc(537) Class1_Sub1_Sub2_Sub1 local537 = (Class1_Sub1_Sub2_Sub1) local531.method336(); local537 != null; local537 = (Class1_Sub1_Sub2_Sub1) local531.method338()) {
								if (local537.anInt84 == (local27 & 0x7FFF) && local537.anInt83 == local31) {
									local537.anInt83 = local40;
									break;
								}
							}
							this.method667(local18, local22);
						}
					}
				} else {
					@Pc(629) int local629;
					if (arg1 == 65) {
						local14 = arg0.method240();
						@Pc(576) byte local576 = arg0.method262();
						@Pc(580) byte local580 = arg0.method261();
						@Pc(584) byte local584 = arg0.method261();
						local31 = arg0.method259();
						local40 = local31 >> 2;
						local47 = local31 & 0x3;
						local51 = this.anIntArray228[local40];
						local71 = arg0.method258();
						local83 = this.anInt999 + (local71 >> 4 & 0x7);
						local97 = this.anInt1000 + (local71 & 0x7);
						local109 = arg0.method267();
						local629 = arg0.method267();
						@Pc(633) byte local633 = arg0.method262();
						@Pc(637) int local637 = arg0.method266();
						@Pc(643) Class1_Sub1_Sub2_Sub2_Sub1 local643;
						if (local637 == this.anInt966) {
							local643 = aClass1_Sub1_Sub2_Sub2_Sub1_1;
						} else {
							local643 = this.aClass1_Sub1_Sub2_Sub2_Sub1Array1[local637];
						}
						if (local643 != null) {
							@Pc(655) Class41 local655 = Class41.method452(local109);
							@Pc(665) int local665 = this.anIntArrayArrayArray8[this.anInt850][local83][local97];
							@Pc(677) int local677 = this.anIntArrayArrayArray8[this.anInt850][local83 + 1][local97];
							@Pc(691) int local691 = this.anIntArrayArrayArray8[this.anInt850][local83 + 1][local97 + 1];
							@Pc(703) int local703 = this.anIntArrayArrayArray8[this.anInt850][local83][local97 + 1];
							@Pc(713) Class1_Sub1_Sub2_Sub6 local713 = local655.method447(local40, local47, local665, local677, local691, local703, -1);
							if (local713 != null) {
								this.method582(431, local51, this.anInt850, local14 + 1, local83, local97, 0, -1, local629 + 1, 0);
								local643.anInt257 = local629 + anInt907;
								local643.anInt258 = local14 + anInt907;
								local643.aClass1_Sub1_Sub2_Sub6_1 = local713;
								@Pc(748) int local748 = local655.anInt648;
								@Pc(751) int local751 = local655.anInt640;
								if (local47 == 1 || local47 == 3) {
									local748 = local655.anInt640;
									local751 = local655.anInt648;
								}
								local643.anInt251 = local83 * 128 + local748 * 64;
								local643.anInt253 = local97 * 128 + local751 * 64;
								local643.anInt252 = this.method692(local643.anInt253, local643.anInt251, this.anInt850);
								@Pc(797) byte local797;
								if (local584 > local576) {
									local797 = local584;
									local584 = local576;
									local576 = local797;
								}
								if (local633 > local580) {
									local797 = local633;
									local633 = local580;
									local580 = local797;
								}
								local643.anInt260 = local83 + local584;
								local643.anInt262 = local83 + local576;
								local643.anInt261 = local97 + local633;
								local643.anInt263 = local97 + local580;
							}
						}
					}
					if (arg1 == 159) {
						local14 = arg0.method238();
						local18 = this.anInt999 + (local14 >> 4 & 0x7);
						local22 = this.anInt1000 + (local14 & 0x7);
						local27 = arg0.method240();
						local31 = arg0.method238();
						local40 = local31 >> 4 & 0xF;
						local47 = local31 & 0x7;
						if (aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0] >= local18 - local40 && aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0] <= local18 + local40 && aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0] >= local22 - local40 && aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0] <= local22 + local40 && this.aBoolean236 && !aBoolean226 && this.anInt918 < 50) {
							this.anIntArray214[this.anInt918] = local27;
							this.anIntArray224[this.anInt918] = local47;
							this.anIntArray251[this.anInt918] = Class34.anIntArray93[local27];
							this.anInt918++;
						}
					}
					if (arg1 == 27) {
						local14 = arg0.method238();
						local18 = this.anInt999 + (local14 >> 4 & 0x7);
						local22 = this.anInt1000 + (local14 & 0x7);
						local27 = arg0.method258();
						local31 = local27 >> 2;
						local40 = local27 & 0x3;
						local47 = this.anIntArray228[local31];
						local51 = arg0.method240();
						if (local18 >= 0 && local22 >= 0 && local18 < 104 && local22 < 104) {
							this.method582(431, local47, this.anInt850, -1, local18, local22, local31, local51, 0, local40);
						}
					} else if (arg1 == 101) {
						local14 = arg0.method238();
						local18 = this.anInt999 + (local14 >> 4 & 0x7);
						local22 = this.anInt1000 + (local14 & 0x7);
						local27 = arg0.method259();
						local31 = local27 >> 2;
						local40 = local27 & 0x3;
						local47 = this.anIntArray228[local31];
						if (local18 >= 0 && local22 >= 0 && local18 < 104 && local22 < 104) {
							this.method582(431, local47, this.anInt850, -1, local18, local22, local31, -1, 0, local40);
						}
					} else if (arg1 == 183) {
						local14 = arg0.method238();
						local18 = this.anInt999 + (local14 >> 4 & 0x7);
						local22 = this.anInt1000 + (local14 & 0x7);
						local27 = arg0.method240();
						local31 = arg0.method238();
						local40 = arg0.method240();
						if (local18 >= 0 && local22 >= 0 && local18 < 104 && local22 < 104) {
							local18 = local18 * 128 + 64;
							local22 = local22 * 128 + 64;
							@Pc(1138) Class1_Sub1_Sub2_Sub5 local1138 = new Class1_Sub1_Sub2_Sub5(local22, anInt907, this.method692(local22, local18, this.anInt850) - local31, local18, (byte) -112, local27, local40, this.anInt850);
							this.aClass32_11.method333(local1138);
						}
					} else if (arg1 == 4) {
						local14 = arg0.method267();
						local18 = arg0.method258();
						local22 = this.anInt999 + (local18 >> 4 & 0x7);
						local27 = this.anInt1000 + (local18 & 0x7);
						if (local22 >= 0 && local27 >= 0 && local22 < 104 && local27 < 104) {
							@Pc(1190) Class32 local1190 = this.aClass32ArrayArrayArray1[this.anInt850][local22][local27];
							if (local1190 != null) {
								for (local338 = (Class1_Sub1_Sub2_Sub1) local1190.method336(); local338 != null; local338 = (Class1_Sub1_Sub2_Sub1) local1190.method338()) {
									if (local338.anInt84 == (local14 & 0x7FFF)) {
										local338.method544();
										break;
									}
								}
								if (local1190.method336() == null) {
									this.aClass32ArrayArrayArray1[this.anInt850][local22][local27] = null;
								}
								this.method667(local22, local27);
							}
						}
					} else if (arg1 == 223) {
						local14 = arg0.method238();
						local18 = this.anInt999 + (local14 >> 4 & 0x7);
						local22 = this.anInt1000 + (local14 & 0x7);
						local27 = local18 + arg0.method239();
						local31 = local22 + arg0.method239();
						local40 = arg0.method241();
						local47 = arg0.method240();
						local51 = arg0.method238() * 4;
						local71 = arg0.method238() * 4;
						local83 = arg0.method240();
						local97 = arg0.method240();
						local109 = arg0.method238();
						local629 = arg0.method238();
						if (local18 >= 0 && local22 >= 0 && local18 < 104 && local22 < 104 && local27 >= 0 && local31 >= 0 && local27 < 104 && local31 < 104 && local47 != 65535) {
							local18 = local18 * 128 + 64;
							local22 = local22 * 128 + 64;
							local27 = local27 * 128 + 64;
							local31 = local31 * 128 + 64;
							@Pc(1369) Class1_Sub1_Sub2_Sub4 local1369 = new Class1_Sub1_Sub2_Sub4(local47, local83 + anInt907, local18, local40, local629, 0, this.method692(local22, local18, this.anInt850) - local51, local22, local97 + anInt907, local71, local109, this.anInt850);
							local1369.method218(this.method692(local31, local27, this.anInt850) - local71, local27, local31, local83 + anInt907);
							this.aClass32_10.method333(local1369);
						}
					}
				}
			}
		} catch (@Pc(1392) RuntimeException local1392) {
			signlink.reporterror("20456, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local1392.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method674(@OriginalArg(0) int arg0) {
		try {
			@Pc(7) byte[] local7 = this.aClass15_1.method220("title.dat", null);
			@Pc(13) Class1_Sub1_Sub1_Sub2 local13 = new Class1_Sub1_Sub1_Sub2(local7, this);
			this.aClass7_15.method92();
			local13.method121(0, 0);
			this.aClass7_16.method92();
			local13.method121(-637, 0);
			this.aClass7_12.method92();
			local13.method121(-128, 0);
			this.aClass7_13.method92();
			local13.method121(-202, -371);
			this.aClass7_14.method92();
			local13.method121(-202, -171);
			this.aClass7_17.method92();
			local13.method121(0, -265);
			this.aClass7_18.method92();
			local13.method121(-562, -265);
			this.aClass7_19.method92();
			local13.method121(-128, -171);
			this.aClass7_20.method92();
			local13.method121(-562, -171);
			@Pc(98) int[] local98 = new int[local13.anInt113];
			for (@Pc(100) int local100 = 0; local100 < local13.anInt114; local100++) {
				for (@Pc(104) int local104 = 0; local104 < local13.anInt113; local104++) {
					local98[local104] = local13.anIntArray24[local13.anInt113 + local13.anInt113 * local100 - local104 - 1];
				}
				for (@Pc(130) int local130 = 0; local130 < local13.anInt113; local130++) {
					local13.anIntArray24[local130 + local13.anInt113 * local100] = local98[local130];
				}
			}
			this.aClass7_15.method92();
			local13.method121(382, 0);
			this.aClass7_16.method92();
			local13.method121(-255, 0);
			this.aClass7_12.method92();
			local13.method121(254, 0);
			this.aClass7_13.method92();
			local13.method121(180, -371);
			this.aClass7_14.method92();
			local13.method121(180, -171);
			this.aClass7_17.method92();
			local13.method121(382, -265);
			this.aClass7_18.method92();
			local13.method121(-180, -265);
			this.aClass7_19.method92();
			local13.method121(254, -171);
			this.aClass7_20.method92();
			local13.method121(-180, -171);
			local13 = new Class1_Sub1_Sub1_Sub2(this.aClass15_1, "logo", 0);
			this.aClass7_12.method92();
			local13.method123(18, 382 - local13.anInt113 / 2 - 128);
			@Pc(267) boolean local267 = false;
			System.gc();
		} catch (@Pc(272) RuntimeException local272) {
			signlink.reporterror("5869, " + arg0 + ", " + local272.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method675() {
		try {
			@Pc(17) int local17;
			if (this.anInt1029 > 0) {
				for (local17 = 0; local17 < 256; local17++) {
					if (this.anInt1029 > 768) {
						this.anIntArray255[local17] = this.method603(this.anIntArray257[local17], this.anIntArray256[local17], 1024 - this.anInt1029);
					} else if (this.anInt1029 > 256) {
						this.anIntArray255[local17] = this.anIntArray257[local17];
					} else {
						this.anIntArray255[local17] = this.method603(this.anIntArray256[local17], this.anIntArray257[local17], 256 - this.anInt1029);
					}
				}
			} else if (this.anInt1030 > 0) {
				for (local17 = 0; local17 < 256; local17++) {
					if (this.anInt1030 > 768) {
						this.anIntArray255[local17] = this.method603(this.anIntArray258[local17], this.anIntArray256[local17], 1024 - this.anInt1030);
					} else if (this.anInt1030 > 256) {
						this.anIntArray255[local17] = this.anIntArray258[local17];
					} else {
						this.anIntArray255[local17] = this.method603(this.anIntArray256[local17], this.anIntArray258[local17], 256 - this.anInt1030);
					}
				}
			} else {
				for (local17 = 0; local17 < 256; local17++) {
					this.anIntArray255[local17] = this.anIntArray256[local17];
				}
			}
			for (local17 = 0; local17 < 33920; local17++) {
				this.aClass7_15.anIntArray22[local17] = this.aClass1_Sub1_Sub1_Sub2_8.anIntArray24[local17];
			}
			@Pc(190) int local190 = 0;
			@Pc(192) int local192 = 1152;
			@Pc(207) int local207;
			@Pc(211) int local211;
			@Pc(221) int local221;
			@Pc(229) int local229;
			@Pc(233) int local233;
			@Pc(237) int local237;
			@Pc(248) int local248;
			for (@Pc(194) int local194 = 1; local194 < 255; local194++) {
				local207 = this.anIntArray238[local194] * (256 - local194) / 256;
				local211 = local207 + 22;
				if (local211 < 0) {
					local211 = 0;
				}
				local190 += local211;
				for (local221 = local211; local221 < 128; local221++) {
					local229 = this.anIntArray231[local190++];
					if (local229 == 0) {
						local192++;
					} else {
						local233 = local229;
						local237 = 256 - local229;
						local229 = this.anIntArray255[local229];
						local248 = this.aClass7_15.anIntArray22[local192];
						this.aClass7_15.anIntArray22[local192++] = ((local229 & 0xFF00FF) * local233 + (local248 & 0xFF00FF) * local237 & 0xFF00FF00) + ((local229 & 0xFF00) * local233 + (local248 & 0xFF00) * local237 & 0xFF0000) >> 8;
					}
				}
				local192 += local211;
			}
			this.aClass7_15.method93(super.aGraphics2, 0, 0);
			for (local207 = 0; local207 < 33920; local207++) {
				this.aClass7_16.anIntArray22[local207] = this.aClass1_Sub1_Sub1_Sub2_9.anIntArray24[local207];
			}
			local190 = 0;
			local192 = 1176;
			for (local211 = 1; local211 < 255; local211++) {
				local221 = this.anIntArray238[local211] * (256 - local211) / 256;
				local229 = 103 - local221;
				local192 += local221;
				for (local233 = 0; local233 < local229; local233++) {
					local237 = this.anIntArray231[local190++];
					if (local237 == 0) {
						local192++;
					} else {
						local248 = local237;
						@Pc(371) int local371 = 256 - local237;
						local237 = this.anIntArray255[local237];
						@Pc(382) int local382 = this.aClass7_16.anIntArray22[local192];
						this.aClass7_16.anIntArray22[local192++] = ((local237 & 0xFF00FF) * local248 + (local382 & 0xFF00FF) * local371 & 0xFF00FF00) + ((local237 & 0xFF00) * local248 + (local382 & 0xFF00) * local371 & 0xFF0000) >> 8;
					}
				}
				local190 += 128 - local229;
				local192 += 128 - local229 - local221;
			}
			this.aClass7_16.method93(super.aGraphics2, 0, 637);
		} catch (@Pc(454) RuntimeException local454) {
			signlink.reporterror("54444, " + 4 + ", " + local454.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method676() {
		try {
			if (this.anInt857 == 0) {
				this.aStringArray10[0] = "Cancel";
				this.anIntArray261[0] = 1540;
				this.anInt931 = 1;
				this.method616();
				this.anInt941 = 0;
				if (super.anInt828 > 4 && super.anInt829 > 4 && super.anInt828 < 516 && super.anInt829 < 338) {
					if (this.anInt895 == -1) {
						this.method644(this.anInt984);
					} else {
						this.method614(0, super.anInt828, Class43.aClass43Array1[this.anInt895], 4, super.anInt829, 4);
					}
				}
				if (this.anInt941 != this.anInt854) {
					this.anInt854 = this.anInt941;
				}
				this.anInt941 = 0;
				if (super.anInt828 > 553 && super.anInt829 > 205 && super.anInt828 < 743 && super.anInt829 < 466) {
					if (this.anInt906 != -1) {
						this.method614(0, super.anInt828, Class43.aClass43Array1[this.anInt906], 553, super.anInt829, 205);
					} else if (this.anIntArray249[this.anInt967] != -1) {
						this.method614(0, super.anInt828, Class43.aClass43Array1[this.anIntArray249[this.anInt967]], 553, super.anInt829, 205);
					}
				}
				if (this.anInt941 != this.anInt1001) {
					this.aBoolean232 = true;
					this.anInt1001 = this.anInt941;
				}
				this.anInt941 = 0;
				if (super.anInt828 > 17 && super.anInt829 > 357 && super.anInt828 < 496 && super.anInt829 < 453) {
					if (this.anInt914 != -1) {
						this.method614(0, super.anInt828, Class43.aClass43Array1[this.anInt914], 17, super.anInt829, 357);
					} else if (super.anInt829 < 434 && super.anInt828 < 426) {
						this.method598(super.anInt828 - 17, super.anInt829 - 357);
					}
				}
				if (this.anInt914 != -1 && this.anInt941 != this.anInt863) {
					this.aBoolean242 = true;
					this.anInt863 = this.anInt941;
				}
				@Pc(235) boolean local235 = false;
				while (!local235) {
					local235 = true;
					for (@Pc(241) int local241 = 0; local241 < this.anInt931 - 1; local241++) {
						if (this.anIntArray261[local241] < 1000 && this.anIntArray261[local241 + 1] > 1000) {
							@Pc(262) String local262 = this.aStringArray10[local241];
							this.aStringArray10[local241] = this.aStringArray10[local241 + 1];
							this.aStringArray10[local241 + 1] = local262;
							@Pc(284) int local284 = this.anIntArray261[local241];
							this.anIntArray261[local241] = this.anIntArray261[local241 + 1];
							this.anIntArray261[local241 + 1] = local284;
							@Pc(306) int local306 = this.anIntArray259[local241];
							this.anIntArray259[local241] = this.anIntArray259[local241 + 1];
							this.anIntArray259[local241 + 1] = local306;
							@Pc(328) int local328 = this.anIntArray260[local241];
							this.anIntArray260[local241] = this.anIntArray260[local241 + 1];
							this.anIntArray260[local241 + 1] = local328;
							@Pc(350) int local350 = this.anIntArray262[local241];
							this.anIntArray262[local241] = this.anIntArray262[local241 + 1];
							this.anIntArray262[local241 + 1] = local350;
							local235 = false;
						}
					}
				}
			}
		} catch (@Pc(380) RuntimeException local380) {
			signlink.reporterror("66948, " + -346 + ", " + local380.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method576() {
		try {
			if (this.aBoolean241 || this.aBoolean209 || this.aBoolean240) {
				this.method707(this.anInt977);
			} else {
				anInt916++;
				if (this.aBoolean215) {
					this.method686();
				} else {
					this.method649(false);
				}
				this.anInt903 = 0;
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("60225, " + -31159 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method677() {
		try {
			this.anInt944 = 0;
			@Pc(90) int local90;
			@Pc(70) int local70;
			for (@Pc(6) int local6 = -1; local6 < this.anInt898 + this.anInt986; local6++) {
				@Pc(13) Class1_Sub1_Sub2_Sub2 local13;
				if (local6 == -1) {
					local13 = aClass1_Sub1_Sub2_Sub2_Sub1_1;
				} else if (local6 < this.anInt898) {
					local13 = this.aClass1_Sub1_Sub2_Sub2_Sub1Array1[this.anIntArray229[local6]];
				} else {
					local13 = this.aClass1_Sub1_Sub2_Sub2_Sub2Array1[this.anIntArray253[local6 - this.anInt898]];
				}
				if (local13 != null && local13.method323()) {
					@Pc(54) Class39 local54;
					if (local13 instanceof Class1_Sub1_Sub2_Sub2_Sub2) {
						local54 = ((Class1_Sub1_Sub2_Sub2_Sub2) local13).aClass39_2;
						if (local54.anIntArray114 != null) {
							local54 = local54.method405();
						}
						if (local54 == null) {
							continue;
						}
					}
					if (local6 >= this.anInt898) {
						local54 = ((Class1_Sub1_Sub2_Sub2_Sub2) local13).aClass39_2;
						if (local54.anInt589 >= 0 && local54.anInt589 < this.aClass1_Sub1_Sub1_Sub2Array8.length) {
							this.method588(local13.anInt503 + 15, local13);
							if (this.anInt1012 > -1) {
								this.aClass1_Sub1_Sub1_Sub2Array8[local54.anInt589].method123(this.anInt1013 - 30, this.anInt1012 - 12);
							}
						}
						if (this.anInt846 == 1 && this.anInt955 == this.anIntArray253[local6 - this.anInt898] && anInt907 % 20 < 10) {
							this.method588(local13.anInt503 + 15, local13);
							if (this.anInt1012 > -1) {
								this.aClass1_Sub1_Sub1_Sub2Array8[2].method123(this.anInt1013 - 28, this.anInt1012 - 12);
							}
						}
					} else {
						local70 = 30;
						@Pc(73) Class1_Sub1_Sub2_Sub2_Sub1 local73 = (Class1_Sub1_Sub2_Sub2_Sub1) local13;
						if (local73.anInt249 != 0) {
							this.method588(local13.anInt503 + 15, local13);
							if (this.anInt1012 > -1) {
								for (local90 = 0; local90 < 8; local90++) {
									if ((local73.anInt249 & 0x1 << local90) != 0) {
										this.aClass1_Sub1_Sub1_Sub2Array8[local90].method123(this.anInt1013 - local70, this.anInt1012 - 12);
										local70 -= 25;
									}
								}
							}
						}
						if (local6 >= 0 && this.anInt846 == 10 && this.anInt992 == this.anIntArray229[local6]) {
							this.method588(local13.anInt503 + 15, local13);
							if (this.anInt1012 > -1) {
								this.aClass1_Sub1_Sub1_Sub2Array8[7].method123(this.anInt1013 - local70, this.anInt1012 - 12);
							}
						}
					}
					if (local13.aString8 != null && (local6 >= this.anInt898 || this.anInt843 == 0 || this.anInt843 == 3 || this.anInt843 == 1 && this.method693(((Class1_Sub1_Sub2_Sub2_Sub1) local13).aString5))) {
						this.method588(local13.anInt503, local13);
						if (this.anInt1012 > -1 && this.anInt944 < this.anInt945) {
							this.anIntArray244[this.anInt944] = this.aClass1_Sub1_Sub1_Sub3_4.method382(510, local13.aString8) / 2;
							this.anIntArray243[this.anInt944] = this.aClass1_Sub1_Sub1_Sub3_4.anInt572;
							this.anIntArray241[this.anInt944] = this.anInt1012;
							this.anIntArray242[this.anInt944] = this.anInt1013;
							this.anIntArray245[this.anInt944] = local13.anInt504;
							this.anIntArray246[this.anInt944] = local13.anInt495;
							this.anIntArray247[this.anInt944] = local13.anInt501;
							this.aStringArray9[this.anInt944++] = local13.aString8;
							if (this.anInt989 == 0 && local13.anInt495 >= 1 && local13.anInt495 <= 3) {
								this.anIntArray243[this.anInt944] += 10;
								this.anIntArray242[this.anInt944] += 5;
							}
							if (this.anInt989 == 0 && local13.anInt495 == 4) {
								this.anIntArray244[this.anInt944] = 60;
							}
							if (this.anInt989 == 0 && local13.anInt495 == 5) {
								this.anIntArray243[this.anInt944] += 5;
							}
						}
					}
					if (local13.anInt507 > anInt907) {
						this.method588(local13.anInt503 + 15, local13);
						if (this.anInt1012 > -1) {
							local70 = local13.anInt508 * 30 / local13.anInt509;
							if (local70 > 30) {
								local70 = 30;
							}
							Class1_Sub1_Sub1.method551(5, local70, this.anInt1013 - 3, 65280, this.anInt1012 - 15);
							Class1_Sub1_Sub1.method551(5, 30 - local70, this.anInt1013 - 3, 16711680, this.anInt1012 + local70 - 15);
						}
					}
					for (local70 = 0; local70 < 4; local70++) {
						if (local13.anIntArray91[local70] > anInt907) {
							this.method588(local13.anInt503 / 2, local13);
							if (this.anInt1012 > -1) {
								if (local70 == 1) {
									this.anInt1013 -= 20;
								}
								if (local70 == 2) {
									this.anInt1012 -= 15;
									this.anInt1013 -= 10;
								}
								if (local70 == 3) {
									this.anInt1012 += 15;
									this.anInt1013 -= 10;
								}
								this.aClass1_Sub1_Sub1_Sub2Array7[local13.anIntArray90[local70]].method123(this.anInt1013 - 12, this.anInt1012 - 12);
								this.aClass1_Sub1_Sub1_Sub3_2.method379(this.anInt1013 + 4, this.anInt1012, String.valueOf(local13.anIntArray89[local70]), 0);
								this.aClass1_Sub1_Sub1_Sub3_2.method379(this.anInt1013 + 3, this.anInt1012 - 1, String.valueOf(local13.anIntArray89[local70]), 16777215);
							}
						}
					}
				}
			}
			for (@Pc(602) int local602 = 0; local602 < this.anInt944; local602++) {
				local70 = this.anIntArray241[local602];
				@Pc(614) int local614 = this.anIntArray242[local602];
				local90 = this.anIntArray244[local602];
				@Pc(624) int local624 = this.anIntArray243[local602];
				@Pc(626) boolean local626 = true;
				while (local626) {
					local626 = false;
					for (@Pc(632) int local632 = 0; local632 < local602; local632++) {
						if (local614 + 2 > this.anIntArray242[local632] - this.anIntArray243[local632] && local614 - local624 < this.anIntArray242[local632] + 2 && local70 - local90 < this.anIntArray241[local632] + this.anIntArray244[local632] && local70 + local90 > this.anIntArray241[local632] - this.anIntArray244[local632] && this.anIntArray242[local632] - this.anIntArray243[local632] < local614) {
							local614 = this.anIntArray242[local632] - this.anIntArray243[local632];
							local626 = true;
						}
					}
				}
				this.anInt1012 = this.anIntArray241[local602];
				this.anInt1013 = this.anIntArray242[local602] = local614;
				@Pc(731) String local731 = this.aStringArray9[local602];
				if (this.anInt989 == 0) {
					@Pc(736) int local736 = 16776960;
					if (this.anIntArray245[local602] < 6) {
						local736 = this.anIntArray250[this.anIntArray245[local602]];
					}
					if (this.anIntArray245[local602] == 6) {
						local736 = this.anInt851 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray245[local602] == 7) {
						local736 = this.anInt851 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray245[local602] == 8) {
						local736 = this.anInt851 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(811) int local811;
					if (this.anIntArray245[local602] == 9) {
						local811 = 150 - this.anIntArray247[local602];
						if (local811 < 50) {
							local736 = local811 * 1280 + 16711680;
						} else if (local811 < 100) {
							local736 = 16776960 - (local811 - 50) * 327680;
						} else if (local811 < 150) {
							local736 = (local811 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray245[local602] == 10) {
						local811 = 150 - this.anIntArray247[local602];
						if (local811 < 50) {
							local736 = local811 * 5 + 16711680;
						} else if (local811 < 100) {
							local736 = 16711935 - (local811 - 50) * 327680;
						} else if (local811 < 150) {
							local736 = (local811 - 100) * 327680 + 255 - (local811 - 100) * 5;
						}
					}
					if (this.anIntArray245[local602] == 11) {
						local811 = 150 - this.anIntArray247[local602];
						if (local811 < 50) {
							local736 = 16777215 - local811 * 327685;
						} else if (local811 < 100) {
							local736 = (local811 - 50) * 327685 + 65280;
						} else if (local811 < 150) {
							local736 = 16777215 - (local811 - 100) * 327680;
						}
					}
					if (this.anIntArray246[local602] == 0) {
						this.aClass1_Sub1_Sub1_Sub3_4.method379(this.anInt1013 + 1, this.anInt1012, local731, 0);
						this.aClass1_Sub1_Sub1_Sub3_4.method379(this.anInt1013, this.anInt1012, local731, local736);
					}
					if (this.anIntArray246[local602] == 1) {
						this.aClass1_Sub1_Sub1_Sub3_4.method384(0, this.anInt1013 + 1, local731, this.anInt851, this.anInt1012);
						this.aClass1_Sub1_Sub1_Sub3_4.method384(local736, this.anInt1013, local731, this.anInt851, this.anInt1012);
					}
					if (this.anIntArray246[local602] == 2) {
						this.aClass1_Sub1_Sub1_Sub3_4.method385(this.anInt1013 + 1, this.anInt1012, 0, this.anInt851, local731);
						this.aClass1_Sub1_Sub1_Sub3_4.method385(this.anInt1013, this.anInt1012, local736, this.anInt851, local731);
					}
					if (this.anIntArray246[local602] == 3) {
						this.aClass1_Sub1_Sub1_Sub3_4.method386(0, this.anInt1012, this.anInt1013 + 1, 150 - this.anIntArray247[local602], this.anInt851, local731);
						this.aClass1_Sub1_Sub1_Sub3_4.method386(local736, this.anInt1012, this.anInt1013, 150 - this.anIntArray247[local602], this.anInt851, local731);
					}
					@Pc(1108) int local1108;
					if (this.anIntArray246[local602] == 4) {
						local811 = this.aClass1_Sub1_Sub1_Sub3_4.method382(510, local731);
						local1108 = (150 - this.anIntArray247[local602]) * (local811 + 100) / 150;
						Class1_Sub1_Sub1.method548(this.anInt1012 + 50, this.anInt1012 - 50, 334, 0);
						this.aClass1_Sub1_Sub1_Sub3_4.method383(0, (byte) 2, local731, this.anInt1012 + 50 - local1108, this.anInt1013 + 1);
						this.aClass1_Sub1_Sub1_Sub3_4.method383(local736, (byte) 2, local731, this.anInt1012 + 50 - local1108, this.anInt1013);
						Class1_Sub1_Sub1.method547();
					}
					if (this.anIntArray246[local602] == 5) {
						local811 = 150 - this.anIntArray247[local602];
						local1108 = 0;
						if (local811 < 25) {
							local1108 = local811 - 25;
						} else if (local811 > 125) {
							local1108 = local811 - 125;
						}
						Class1_Sub1_Sub1.method548(512, 0, this.anInt1013 + 5, this.anInt1013 - this.aClass1_Sub1_Sub1_Sub3_4.anInt572 - 1);
						this.aClass1_Sub1_Sub1_Sub3_4.method379(this.anInt1013 + local1108 + 1, this.anInt1012, local731, 0);
						this.aClass1_Sub1_Sub1_Sub3_4.method379(this.anInt1013 + local1108, this.anInt1012, local731, local736);
						Class1_Sub1_Sub1.method547();
					}
				} else {
					this.aClass1_Sub1_Sub1_Sub3_4.method379(this.anInt1013 + 1, this.anInt1012, local731, 0);
					this.aClass1_Sub1_Sub1_Sub3_4.method379(this.anInt1013, this.anInt1012, local731, 16776960);
				}
			}
		} catch (@Pc(1258) RuntimeException local1258) {
			signlink.reporterror("17846, " + true + ", " + local1258.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!JHKSAGUC;B)V")
	private void method678(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) byte arg2) {
		try {
			while (true) {
				if (arg1.anInt353 + 10 < arg0 * 8) {
					@Pc(12) int local12 = arg1.method249((byte) 9, 11);
					if (local12 != 2047) {
						if (this.aClass1_Sub1_Sub2_Sub2_Sub1Array1[local12] == null) {
							this.aClass1_Sub1_Sub2_Sub2_Sub1Array1[local12] = new Class1_Sub1_Sub2_Sub2_Sub1();
							if (this.aClass1_Sub1_Sub3Array1[local12] != null) {
								this.aClass1_Sub1_Sub2_Sub2_Sub1Array1[local12].method166(this.aClass1_Sub1_Sub3Array1[local12]);
							}
						}
						this.anIntArray229[this.anInt898++] = local12;
						@Pc(58) Class1_Sub1_Sub2_Sub2_Sub1 local58 = this.aClass1_Sub1_Sub2_Sub2_Sub1Array1[local12];
						local58.anInt500 = anInt907;
						@Pc(66) int local66 = arg1.method249((byte) 9, 5);
						if (local66 > 15) {
							local66 -= 32;
						}
						@Pc(75) int local75 = arg1.method249((byte) 9, 1);
						@Pc(80) int local80 = arg1.method249((byte) 9, 5);
						if (local80 > 15) {
							local80 -= 32;
						}
						@Pc(89) int local89 = arg1.method249((byte) 9, 1);
						if (local89 == 1) {
							this.anIntArray230[this.anInt899++] = local12;
						}
						local58.method325(aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0] + local66, local75 == 1, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0] + local80);
						continue;
					}
				}
				arg1.method250();
				if (arg2 != 1) {
					this.method573();
					return;
				}
				return;
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("83697, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method679() {
		try {
			for (@Pc(7) int local7 = 0; local7 < this.anInt986; local7++) {
				@Pc(14) int local14 = this.anIntArray253[local7];
				@Pc(19) Class1_Sub1_Sub2_Sub2_Sub2 local19 = this.aClass1_Sub1_Sub2_Sub2_Sub2Array1[local14];
				if (local19 != null) {
					this.method680(local19, local19.aClass39_2.aByte36);
				}
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("21013, " + 0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!QQAAMZPI;II)V")
	private void method680(@OriginalArg(0) Class1_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0.anInt497 < 128 || arg0.anInt498 < 128 || arg0.anInt497 >= 13184 || arg0.anInt498 >= 13184) {
				arg0.anInt510 = -1;
				arg0.anInt470 = -1;
				arg0.anInt480 = 0;
				arg0.anInt481 = 0;
				arg0.anInt497 = arg0.anIntArray87[0] * 128 + arg0.anInt484 * 64;
				arg0.anInt498 = arg0.anIntArray88[0] * 128 + arg0.anInt484 * 64;
				arg0.method326(900);
			}
			if (arg0 == aClass1_Sub1_Sub2_Sub2_Sub1_1 && (arg0.anInt497 < 1536 || arg0.anInt498 < 1536 || arg0.anInt497 >= 11776 || arg0.anInt498 >= 11776)) {
				arg0.anInt510 = -1;
				arg0.anInt470 = -1;
				arg0.anInt480 = 0;
				arg0.anInt481 = 0;
				arg0.anInt497 = arg0.anIntArray87[0] * 128 + arg0.anInt484 * 64;
				arg0.anInt498 = arg0.anIntArray88[0] * 128 + arg0.anInt484 * 64;
				arg0.method326(900);
			}
			if (arg0.anInt480 > anInt907) {
				this.method681(arg0);
			} else if (arg0.anInt481 >= anInt907) {
				this.method682(this.aBoolean214, arg0);
			} else {
				this.method683(arg0);
			}
			this.method684(arg0);
			this.method685(arg0);
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("49476, " + arg0 + ", " + arg1 + ", " + 40656 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!QQAAMZPI;)V")
	private void method681(@OriginalArg(1) Class1_Sub1_Sub2_Sub2 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt480 - anInt907;
			@Pc(18) int local18 = arg0.anInt476 * 128 + arg0.anInt484 * 64;
			@Pc(28) int local28 = arg0.anInt478 * 128 + arg0.anInt484 * 64;
			arg0.anInt497 += (local18 - arg0.anInt497) / local4;
			arg0.anInt498 += (local28 - arg0.anInt498) / local4;
			arg0.anInt496 = 0;
			if (arg0.anInt482 == 0) {
				arg0.anInt475 = 1024;
			}
			if (arg0.anInt482 == 1) {
				arg0.anInt475 = 1536;
			}
			if (arg0.anInt482 == 2) {
				arg0.anInt475 = 0;
			}
			if (arg0.anInt482 == 3) {
				arg0.anInt475 = 512;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("69290, " + 44 + ", " + arg0 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!QQAAMZPI;)V")
	private void method682(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub2 arg1) {
		try {
			if (arg1.anInt481 == anInt907 || arg1.anInt510 == -1 || arg1.anInt513 != 0 || arg1.anInt512 + 1 > Class23.aClass23Array1[arg1.anInt510].method293(this.anInt892, arg1.anInt511)) {
				@Pc(30) int local30 = arg1.anInt481 - arg1.anInt480;
				@Pc(35) int local35 = anInt907 - arg1.anInt480;
				@Pc(45) int local45 = arg1.anInt476 * 128 + arg1.anInt484 * 64;
				@Pc(55) int local55 = arg1.anInt478 * 128 + arg1.anInt484 * 64;
				@Pc(65) int local65 = arg1.anInt477 * 128 + arg1.anInt484 * 64;
				@Pc(75) int local75 = arg1.anInt479 * 128 + arg1.anInt484 * 64;
				arg1.anInt497 = (local45 * (local30 - local35) + local65 * local35) / local30;
				arg1.anInt498 = (local55 * (local30 - local35) + local75 * local35) / local30;
			}
			arg1.anInt496 = 0;
			if (arg1.anInt482 == 0) {
				arg1.anInt475 = 1024;
			}
			if (arg1.anInt482 == 1) {
				arg1.anInt475 = 1536;
			}
			if (arg1.anInt482 == 2) {
				arg1.anInt475 = 0;
			}
			if (arg1.anInt482 == 3) {
				arg1.anInt475 = 512;
			}
			arg1.anInt499 = arg1.anInt475;
			if (arg0) {
				;
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("45769, " + arg0 + ", " + arg1 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BLclient!QQAAMZPI;)V")
	private void method683(@OriginalArg(1) Class1_Sub1_Sub2_Sub2 arg0) {
		try {
			arg0.anInt490 = arg0.anInt485;
			if (arg0.anInt483 == 0) {
				arg0.anInt496 = 0;
			} else {
				if (arg0.anInt510 != -1 && arg0.anInt513 == 0) {
					@Pc(24) Class23 local24 = Class23.aClass23Array1[arg0.anInt510];
					if (arg0.anInt493 > 0 && local24.anInt393 == 0) {
						arg0.anInt496++;
						return;
					}
					if (arg0.anInt493 <= 0 && local24.anInt394 == 0) {
						arg0.anInt496++;
						return;
					}
				}
				@Pc(53) int local53 = arg0.anInt497;
				@Pc(56) int local56 = arg0.anInt498;
				@Pc(71) int local71 = arg0.anIntArray87[arg0.anInt483 - 1] * 128 + arg0.anInt484 * 64;
				@Pc(86) int local86 = arg0.anIntArray88[arg0.anInt483 - 1] * 128 + arg0.anInt484 * 64;
				if (local71 - local53 <= 256 && local71 - local53 >= -256 && local86 - local56 <= 256 && local86 - local56 >= -256) {
					if (local53 < local71) {
						if (local56 < local86) {
							arg0.anInt475 = 1280;
						} else if (local56 > local86) {
							arg0.anInt475 = 1792;
						} else {
							arg0.anInt475 = 1536;
						}
					} else if (local53 > local71) {
						if (local56 < local86) {
							arg0.anInt475 = 768;
						} else if (local56 > local86) {
							arg0.anInt475 = 256;
						} else {
							arg0.anInt475 = 512;
						}
					} else if (local56 < local86) {
						arg0.anInt475 = 1024;
					} else {
						arg0.anInt475 = 0;
					}
					@Pc(187) int local187 = arg0.anInt475 - arg0.anInt499 & 0x7FF;
					if (local187 > 1024) {
						local187 -= 2048;
					}
					@Pc(194) int local194 = arg0.anInt516;
					if (local187 >= -256 && local187 <= 256) {
						local194 = arg0.anInt515;
					} else if (local187 >= 256 && local187 < 768) {
						local194 = arg0.anInt518;
					} else if (local187 >= -768 && local187 <= -256) {
						local194 = arg0.anInt517;
					}
					if (local194 == -1) {
						local194 = arg0.anInt515;
					}
					arg0.anInt490 = local194;
					@Pc(236) int local236 = 4;
					if (arg0.anInt499 != arg0.anInt475 && arg0.anInt505 == -1 && arg0.anInt519 != 0) {
						local236 = 2;
					}
					if (arg0.anInt483 > 2) {
						local236 = 6;
					}
					if (arg0.anInt483 > 3) {
						local236 = 8;
					}
					if (arg0.anInt496 > 0 && arg0.anInt483 > 1) {
						local236 = 8;
						arg0.anInt496--;
					}
					if (arg0.aBooleanArray6[arg0.anInt483 - 1]) {
						local236 <<= 0x1;
					}
					if (local236 >= 8 && arg0.anInt490 == arg0.anInt515 && arg0.anInt506 != -1) {
						arg0.anInt490 = arg0.anInt506;
					}
					if (local53 < local71) {
						arg0.anInt497 += local236;
						if (arg0.anInt497 > local71) {
							arg0.anInt497 = local71;
						}
					} else if (local53 > local71) {
						arg0.anInt497 -= local236;
						if (arg0.anInt497 < local71) {
							arg0.anInt497 = local71;
						}
					}
					if (local56 < local86) {
						arg0.anInt498 += local236;
						if (arg0.anInt498 > local86) {
							arg0.anInt498 = local86;
						}
					} else if (local56 > local86) {
						arg0.anInt498 -= local236;
						if (arg0.anInt498 < local86) {
							arg0.anInt498 = local86;
						}
					}
					if (arg0.anInt497 == local71 && arg0.anInt498 == local86) {
						arg0.anInt483--;
						if (arg0.anInt493 > 0) {
							arg0.anInt493--;
							return;
						}
					}
				} else {
					arg0.anInt497 = local71;
					arg0.anInt498 = local86;
				}
			}
		} catch (@Pc(398) RuntimeException local398) {
			signlink.reporterror("95536, " + -65 + ", " + arg0 + ", " + local398.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!QQAAMZPI;)V")
	private void method684(@OriginalArg(1) Class1_Sub1_Sub2_Sub2 arg0) {
		try {
			this.anInt887 += 0;
			if (arg0.anInt519 != 0) {
				@Pc(33) int local33;
				@Pc(39) int local39;
				if (arg0.anInt505 != -1 && arg0.anInt505 < 32768) {
					@Pc(25) Class1_Sub1_Sub2_Sub2_Sub2 local25 = this.aClass1_Sub1_Sub2_Sub2_Sub2Array1[arg0.anInt505];
					if (local25 != null) {
						local33 = arg0.anInt497 - local25.anInt497;
						local39 = arg0.anInt498 - local25.anInt498;
						if (local33 != 0 || local39 != 0) {
							arg0.anInt475 = (int) (Math.atan2((double) local33, (double) local39) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(64) int local64;
				if (arg0.anInt505 >= 32768) {
					local64 = arg0.anInt505 - 32768;
					if (local64 == this.anInt966) {
						local64 = this.anInt897;
					}
					@Pc(76) Class1_Sub1_Sub2_Sub2_Sub1 local76 = this.aClass1_Sub1_Sub2_Sub2_Sub1Array1[local64];
					if (local76 != null) {
						local39 = arg0.anInt497 - local76.anInt497;
						@Pc(90) int local90 = arg0.anInt498 - local76.anInt498;
						if (local39 != 0 || local90 != 0) {
							arg0.anInt475 = (int) (Math.atan2((double) local39, (double) local90) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt488 != 0 || arg0.anInt489 != 0) && (arg0.anInt483 == 0 || arg0.anInt496 > 0)) {
					local64 = arg0.anInt497 - (arg0.anInt488 - this.anInt1043 - this.anInt1043) * 64;
					local33 = arg0.anInt498 - (arg0.anInt489 - this.anInt1044 - this.anInt1044) * 64;
					if (local64 != 0 || local33 != 0) {
						arg0.anInt475 = (int) (Math.atan2((double) local64, (double) local33) * 325.949D) & 0x7FF;
					}
					arg0.anInt488 = 0;
					arg0.anInt489 = 0;
				}
				local64 = arg0.anInt475 - arg0.anInt499 & 0x7FF;
				if (local64 != 0) {
					if (local64 < arg0.anInt519 || local64 > 2048 - arg0.anInt519) {
						arg0.anInt499 = arg0.anInt475;
					} else if (local64 > 1024) {
						arg0.anInt499 -= arg0.anInt519;
					} else {
						arg0.anInt499 += arg0.anInt519;
					}
					arg0.anInt499 &= 0x7FF;
					if (arg0.anInt490 == arg0.anInt485 && arg0.anInt499 != arg0.anInt475) {
						if (arg0.anInt486 != -1) {
							arg0.anInt490 = arg0.anInt486;
							return;
						}
						arg0.anInt490 = arg0.anInt515;
						return;
					}
				}
			}
		} catch (@Pc(244) RuntimeException local244) {
			signlink.reporterror("24756, " + 0 + ", " + arg0 + ", " + local244.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!QQAAMZPI;I)V")
	private void method685(@OriginalArg(0) Class1_Sub1_Sub2_Sub2 arg0) {
		try {
			arg0.aBoolean102 = false;
			@Pc(18) Class23 local18;
			if (arg0.anInt490 != -1) {
				local18 = Class23.aClass23Array1[arg0.anInt490];
				arg0.anInt492++;
				if (arg0.anInt491 < local18.anInt387 && arg0.anInt492 > local18.method293(this.anInt892, arg0.anInt491)) {
					arg0.anInt492 = 0;
					arg0.anInt491++;
				}
				if (arg0.anInt491 >= local18.anInt387) {
					arg0.anInt492 = 0;
					arg0.anInt491 = 0;
				}
			}
			if (arg0.anInt470 != -1 && anInt907 >= arg0.anInt473) {
				if (arg0.anInt471 < 0) {
					arg0.anInt471 = 0;
				}
				local18 = Class44.aClass44Array1[arg0.anInt470].aClass23_2;
				arg0.anInt472++;
				while (arg0.anInt471 < local18.anInt387 && arg0.anInt472 > local18.method293(this.anInt892, arg0.anInt471)) {
					arg0.anInt472 -= local18.method293(this.anInt892, arg0.anInt471);
					arg0.anInt471++;
				}
				if (arg0.anInt471 >= local18.anInt387 && (arg0.anInt471 < 0 || arg0.anInt471 >= local18.anInt387)) {
					arg0.anInt470 = -1;
				}
			}
			if (arg0.anInt510 != -1 && arg0.anInt513 <= 1) {
				local18 = Class23.aClass23Array1[arg0.anInt510];
				if (local18.anInt393 == 1 && arg0.anInt493 > 0 && arg0.anInt480 <= anInt907 && arg0.anInt481 < anInt907) {
					arg0.anInt513 = 1;
					return;
				}
			}
			if (arg0.anInt510 != -1 && arg0.anInt513 == 0) {
				local18 = Class23.aClass23Array1[arg0.anInt510];
				arg0.anInt512++;
				while (arg0.anInt511 < local18.anInt387 && arg0.anInt512 > local18.method293(this.anInt892, arg0.anInt511)) {
					arg0.anInt512 -= local18.method293(this.anInt892, arg0.anInt511);
					arg0.anInt511++;
				}
				if (arg0.anInt511 >= local18.anInt387) {
					arg0.anInt511 -= local18.anInt388;
					arg0.anInt514++;
					if (arg0.anInt514 >= local18.anInt392) {
						arg0.anInt510 = -1;
					}
					if (arg0.anInt511 < 0 || arg0.anInt511 >= local18.anInt387) {
						arg0.anInt510 = -1;
					}
				}
				arg0.aBoolean102 = local18.aBoolean91;
			}
			if (arg0.anInt513 > 0) {
				arg0.anInt513--;
			}
		} catch (@Pc(268) RuntimeException local268) {
			signlink.reporterror("48354, " + arg0 + ", " + 131 + ", " + local268.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method686() {
		try {
			if (this.aBoolean233) {
				this.aBoolean233 = false;
				this.aClass7_3.method93(super.aGraphics2, 4, 0);
				this.aClass7_4.method93(super.aGraphics2, 357, 0);
				this.aClass7_5.method93(super.aGraphics2, 4, 722);
				this.aClass7_6.method93(super.aGraphics2, 205, 743);
				this.aClass7_7.method93(super.aGraphics2, 0, 0);
				this.aClass7_8.method93(super.aGraphics2, 4, 516);
				this.aClass7_9.method93(super.aGraphics2, 205, 516);
				this.aClass7_10.method93(super.aGraphics2, 357, 496);
				this.aClass7_11.method93(super.aGraphics2, 338, 0);
				this.aBoolean232 = true;
				this.aBoolean242 = true;
				this.aBoolean213 = true;
				this.aBoolean200 = true;
				if (this.anInt908 != 2) {
					this.aClass7_23.method93(super.aGraphics2, 4, 4);
					this.aClass7_22.method93(super.aGraphics2, 4, 550);
				}
			}
			if (this.anInt908 == 2) {
				this.method628();
			}
			if (this.aBoolean217 && this.anInt865 == 1) {
				this.aBoolean232 = true;
			}
			@Pc(138) boolean local138;
			if (this.anInt906 != -1) {
				local138 = this.method712(this.anInt906, this.anInt840);
				if (local138) {
					this.aBoolean232 = true;
				}
			}
			if (this.anInt1027 == 2) {
				this.aBoolean232 = true;
			}
			if (this.anInt857 == 2) {
				this.aBoolean232 = true;
			}
			if (this.aBoolean232) {
				this.method605();
				this.aBoolean232 = false;
			}
			if (this.anInt914 == -1) {
				this.aClass43_1.anInt720 = this.anInt853 - this.anInt880 - 77;
				if (super.anInt828 > 448 && super.anInt828 < 560 && super.anInt829 > 332) {
					this.method699(false, 77, this.anInt853, 463, super.anInt828 - 17, this.aClass43_1, super.anInt829 - 357, 0);
				}
				@Pc(220) int local220 = this.anInt853 - this.aClass43_1.anInt720 - 77;
				if (local220 < 0) {
					local220 = 0;
				}
				if (local220 > this.anInt853 - 77) {
					local220 = this.anInt853 - 77;
				}
				if (this.anInt880 != local220) {
					this.anInt880 = local220;
					this.aBoolean242 = true;
				}
			}
			if (this.anInt914 != -1) {
				local138 = this.method712(this.anInt914, this.anInt840);
				if (local138) {
					this.aBoolean242 = true;
				}
			}
			if (this.anInt1027 == 3) {
				this.aBoolean242 = true;
			}
			if (this.anInt857 == 3) {
				this.aBoolean242 = true;
			}
			if (this.aString18 != null) {
				this.aBoolean242 = true;
			}
			if (this.aBoolean217 && this.anInt865 == 2) {
				this.aBoolean242 = true;
			}
			if (this.aBoolean242) {
				this.method648();
				this.aBoolean242 = false;
			}
			if (this.anInt908 == 2) {
				this.method602();
				this.aClass7_22.method93(super.aGraphics2, 4, 550);
			}
			if (this.anInt884 != -1) {
				this.aBoolean213 = true;
			}
			if (this.aBoolean213) {
				if (this.anInt884 != -1 && this.anInt884 == this.anInt967) {
					this.anInt884 = -1;
					this.aClass1_Sub1_Sub3_6.method227(86);
					this.aClass1_Sub1_Sub3_6.method228(this.anInt967);
				}
				this.aBoolean213 = false;
				this.aClass7_27.method92();
				this.aClass1_Sub1_Sub1_Sub4_17.method563(0, 0);
				if (this.anInt906 == -1) {
					if (this.anIntArray249[this.anInt967] != -1) {
						if (this.anInt967 == 0) {
							this.aClass1_Sub1_Sub1_Sub4_3.method563(10, 22);
						}
						if (this.anInt967 == 1) {
							this.aClass1_Sub1_Sub1_Sub4_4.method563(8, 54);
						}
						if (this.anInt967 == 2) {
							this.aClass1_Sub1_Sub1_Sub4_4.method563(8, 82);
						}
						if (this.anInt967 == 3) {
							this.aClass1_Sub1_Sub1_Sub4_5.method563(8, 110);
						}
						if (this.anInt967 == 4) {
							this.aClass1_Sub1_Sub1_Sub4_7.method563(8, 153);
						}
						if (this.anInt967 == 5) {
							this.aClass1_Sub1_Sub1_Sub4_7.method563(8, 181);
						}
						if (this.anInt967 == 6) {
							this.aClass1_Sub1_Sub1_Sub4_6.method563(9, 209);
						}
					}
					if (this.anIntArray249[0] != -1 && (this.anInt884 != 0 || anInt907 % 20 < 10)) {
						this.aClass1_Sub1_Sub1_Sub4Array4[0].method563(13, 29);
					}
					if (this.anIntArray249[1] != -1 && (this.anInt884 != 1 || anInt907 % 20 < 10)) {
						this.aClass1_Sub1_Sub1_Sub4Array4[1].method563(11, 53);
					}
					if (this.anIntArray249[2] != -1 && (this.anInt884 != 2 || anInt907 % 20 < 10)) {
						this.aClass1_Sub1_Sub1_Sub4Array4[2].method563(11, 82);
					}
					if (this.anIntArray249[3] != -1 && (this.anInt884 != 3 || anInt907 % 20 < 10)) {
						this.aClass1_Sub1_Sub1_Sub4Array4[3].method563(12, 115);
					}
					if (this.anIntArray249[4] != -1 && (this.anInt884 != 4 || anInt907 % 20 < 10)) {
						this.aClass1_Sub1_Sub1_Sub4Array4[4].method563(13, 153);
					}
					if (this.anIntArray249[5] != -1 && (this.anInt884 != 5 || anInt907 % 20 < 10)) {
						this.aClass1_Sub1_Sub1_Sub4Array4[5].method563(11, 180);
					}
					if (this.anIntArray249[6] != -1 && (this.anInt884 != 6 || anInt907 % 20 < 10)) {
						this.aClass1_Sub1_Sub1_Sub4Array4[6].method563(13, 208);
					}
				}
				this.aClass7_27.method93(super.aGraphics2, 160, 516);
				this.aClass7_26.method92();
				this.aClass1_Sub1_Sub1_Sub4_16.method563(0, 0);
				if (this.anInt906 == -1) {
					if (this.anIntArray249[this.anInt967] != -1) {
						if (this.anInt967 == 7) {
							this.aClass1_Sub1_Sub1_Sub4_8.method563(0, 42);
						}
						if (this.anInt967 == 8) {
							this.aClass1_Sub1_Sub1_Sub4_9.method563(0, 74);
						}
						if (this.anInt967 == 9) {
							this.aClass1_Sub1_Sub1_Sub4_9.method563(0, 102);
						}
						if (this.anInt967 == 10) {
							this.aClass1_Sub1_Sub1_Sub4_10.method563(1, 130);
						}
						if (this.anInt967 == 11) {
							this.aClass1_Sub1_Sub1_Sub4_12.method563(0, 173);
						}
						if (this.anInt967 == 12) {
							this.aClass1_Sub1_Sub1_Sub4_12.method563(0, 201);
						}
						if (this.anInt967 == 13) {
							this.aClass1_Sub1_Sub1_Sub4_11.method563(0, 229);
						}
					}
					if (this.anIntArray249[8] != -1 && (this.anInt884 != 8 || anInt907 % 20 < 10)) {
						this.aClass1_Sub1_Sub1_Sub4Array4[7].method563(2, 74);
					}
					if (this.anIntArray249[9] != -1 && (this.anInt884 != 9 || anInt907 % 20 < 10)) {
						this.aClass1_Sub1_Sub1_Sub4Array4[8].method563(3, 102);
					}
					if (this.anIntArray249[10] != -1 && (this.anInt884 != 10 || anInt907 % 20 < 10)) {
						this.aClass1_Sub1_Sub1_Sub4Array4[9].method563(4, 137);
					}
					if (this.anIntArray249[11] != -1 && (this.anInt884 != 11 || anInt907 % 20 < 10)) {
						this.aClass1_Sub1_Sub1_Sub4Array4[10].method563(2, 174);
					}
					if (this.anIntArray249[12] != -1 && (this.anInt884 != 12 || anInt907 % 20 < 10)) {
						this.aClass1_Sub1_Sub1_Sub4Array4[11].method563(2, 201);
					}
					if (this.anIntArray249[13] != -1 && (this.anInt884 != 13 || anInt907 % 20 < 10)) {
						this.aClass1_Sub1_Sub1_Sub4Array4[12].method563(2, 226);
					}
				}
				this.aClass7_26.method93(super.aGraphics2, 466, 496);
				this.aClass7_23.method92();
			}
			if (this.aBoolean200) {
				this.aBoolean200 = false;
				this.aClass7_25.method92();
				this.aClass1_Sub1_Sub1_Sub4_15.method563(0, 0);
				this.aClass1_Sub1_Sub1_Sub3_3.method380(true, "Public chat", 55, 16777215, 28);
				if (this.anInt843 == 0) {
					this.aClass1_Sub1_Sub1_Sub3_3.method380(true, "On", 55, 65280, 41);
				}
				if (this.anInt843 == 1) {
					this.aClass1_Sub1_Sub1_Sub3_3.method380(true, "Friends", 55, 16776960, 41);
				}
				if (this.anInt843 == 2) {
					this.aClass1_Sub1_Sub1_Sub3_3.method380(true, "Off", 55, 16711680, 41);
				}
				if (this.anInt843 == 3) {
					this.aClass1_Sub1_Sub1_Sub3_3.method380(true, "Hide", 55, 65535, 41);
				}
				this.aClass1_Sub1_Sub1_Sub3_3.method380(true, "Private chat", 184, 16777215, 28);
				if (this.anInt912 == 0) {
					this.aClass1_Sub1_Sub1_Sub3_3.method380(true, "On", 184, 65280, 41);
				}
				if (this.anInt912 == 1) {
					this.aClass1_Sub1_Sub1_Sub3_3.method380(true, "Friends", 184, 16776960, 41);
				}
				if (this.anInt912 == 2) {
					this.aClass1_Sub1_Sub1_Sub3_3.method380(true, "Off", 184, 16711680, 41);
				}
				this.aClass1_Sub1_Sub1_Sub3_3.method380(true, "Trade/compete", 324, 16777215, 28);
				if (this.anInt1022 == 0) {
					this.aClass1_Sub1_Sub1_Sub3_3.method380(true, "On", 324, 65280, 41);
				}
				if (this.anInt1022 == 1) {
					this.aClass1_Sub1_Sub1_Sub3_3.method380(true, "Friends", 324, 16776960, 41);
				}
				if (this.anInt1022 == 2) {
					this.aClass1_Sub1_Sub1_Sub3_3.method380(true, "Off", 324, 16711680, 41);
				}
				this.aClass1_Sub1_Sub1_Sub3_3.method380(true, "Report abuse", 458, 16777215, 33);
				this.aClass7_25.method93(super.aGraphics2, 453, 0);
				this.aClass7_23.method92();
			}
			this.anInt840 = 0;
		} catch (@Pc(1054) RuntimeException local1054) {
			signlink.reporterror("98153, " + 8 + ", " + local1054.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!JHKSAGUC;II)V")
	private void method687(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt848 = 0;
			this.anInt899 = 0;
			this.method642(arg1, arg0);
			this.method711(arg1, arg0);
			this.method678(arg1, arg0, this.aByte60);
			this.method584(arg1, arg0);
			@Pc(46) int local46;
			for (@Pc(39) int local39 = 0; local39 < this.anInt848; local39++) {
				local46 = this.anIntArray216[local39];
				if (this.aClass1_Sub1_Sub2_Sub2_Sub1Array1[local46].anInt500 != anInt907) {
					this.aClass1_Sub1_Sub2_Sub2_Sub1Array1[local46] = null;
				}
			}
			if (arg0.anInt352 != arg1) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.anInt352 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local46 = 0; local46 < this.anInt898; local46++) {
				if (this.aClass1_Sub1_Sub2_Sub2_Sub1Array1[this.anIntArray229[local46]] == null) {
					signlink.reporterror(this.aString23 + " null entry in pl list - pos:" + local46 + " size:" + this.anInt898);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("98782, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!RBTWCHLG;IZII)V")
	private void method688(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (this.anInt931 < 400) {
				if (arg0.anIntArray114 != null) {
					arg0 = arg0.method405();
				}
				if (arg0 != null && arg0.aBoolean124) {
					@Pc(26) String local26 = arg0.aString9;
					if (arg0.anInt584 != 0) {
						local26 = local26 + method646(arg0.anInt584, aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt266) + " (level-" + arg0.anInt584 + ")";
					}
					if (this.anInt1018 == 1) {
						this.aStringArray10[this.anInt931] = "Use " + this.aString28 + " with @yel@" + local26;
						this.anIntArray261[this.anInt931] = 237;
						this.anIntArray262[this.anInt931] = arg1;
						this.anIntArray259[this.anInt931] = arg2;
						this.anIntArray260[this.anInt931] = arg3;
						this.anInt931++;
					} else if (this.anInt900 != 1) {
						@Pc(164) int local164;
						if (arg0.aStringArray5 != null) {
							for (local164 = 4; local164 >= 0; local164--) {
								if (arg0.aStringArray5[local164] != null && !arg0.aStringArray5[local164].equalsIgnoreCase("attack")) {
									this.aStringArray10[this.anInt931] = arg0.aStringArray5[local164] + " @yel@" + local26;
									if (local164 == 0) {
										this.anIntArray261[this.anInt931] = 296;
									}
									if (local164 == 1) {
										this.anIntArray261[this.anInt931] = 187;
									}
									if (local164 == 2) {
										this.anIntArray261[this.anInt931] = 464;
									}
									if (local164 == 3) {
										this.anIntArray261[this.anInt931] = 667;
									}
									if (local164 == 4) {
										this.anIntArray261[this.anInt931] = 270;
									}
									this.anIntArray262[this.anInt931] = arg1;
									this.anIntArray259[this.anInt931] = arg2;
									this.anIntArray260[this.anInt931] = arg3;
									this.anInt931++;
								}
							}
						}
						if (arg0.aStringArray5 != null) {
							for (local164 = 4; local164 >= 0; local164--) {
								if (arg0.aStringArray5[local164] != null && arg0.aStringArray5[local164].equalsIgnoreCase("attack")) {
									@Pc(288) short local288 = 0;
									if (arg0.anInt584 > aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt266) {
										local288 = 2000;
									}
									this.aStringArray10[this.anInt931] = arg0.aStringArray5[local164] + " @yel@" + local26;
									if (local164 == 0) {
										this.anIntArray261[this.anInt931] = local288 + 296;
									}
									if (local164 == 1) {
										this.anIntArray261[this.anInt931] = local288 + 187;
									}
									if (local164 == 2) {
										this.anIntArray261[this.anInt931] = local288 + 464;
									}
									if (local164 == 3) {
										this.anIntArray261[this.anInt931] = local288 + 667;
									}
									if (local164 == 4) {
										this.anIntArray261[this.anInt931] = local288 + 270;
									}
									this.anIntArray262[this.anInt931] = arg1;
									this.anIntArray259[this.anInt931] = arg2;
									this.anIntArray260[this.anInt931] = arg3;
									this.anInt931++;
								}
							}
						}
						this.aStringArray10[this.anInt931] = "Examine @yel@" + local26;
						this.anIntArray261[this.anInt931] = 1842;
						this.anIntArray262[this.anInt931] = arg1;
						this.anIntArray259[this.anInt931] = arg2;
						this.anIntArray260[this.anInt931] = arg3;
						this.anInt931++;
					} else if ((this.anInt902 & 0x2) == 2) {
						this.aStringArray10[this.anInt931] = this.aString21 + " @yel@" + local26;
						this.anIntArray261[this.anInt931] = 209;
						this.anIntArray262[this.anInt931] = arg1;
						this.anIntArray259[this.anInt931] = arg2;
						this.anIntArray260[this.anInt931] = arg3;
						this.anInt931++;
						return;
					}
				}
			}
		} catch (@Pc(438) RuntimeException local438) {
			signlink.reporterror("2974, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + local438.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method577() {
		try {
			this.aBoolean233 = true;
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("2586, " + 0 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZB)V")
	private void method689(@OriginalArg(0) boolean arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt986; local3++) {
				@Pc(13) Class1_Sub1_Sub2_Sub2_Sub2 local13 = this.aClass1_Sub1_Sub2_Sub2_Sub2Array1[this.anIntArray253[local3]];
				@Pc(22) int local22 = (this.anIntArray253[local3] << 14) + 536870912;
				if (local13 != null && local13.method323() && local13.aClass39_2.aBoolean122 == arg0) {
					@Pc(38) int local38 = local13.anInt497 >> 7;
					@Pc(43) int local43 = local13.anInt498 >> 7;
					if (local38 >= 0 && local38 < 104 && local43 >= 0 && local43 < 104) {
						if (local13.anInt484 == 1 && (local13.anInt497 & 0x7F) == 64 && (local13.anInt498 & 0x7F) == 64) {
							if (this.anIntArrayArray25[local38][local43] == this.anInt851) {
								continue;
							}
							this.anIntArrayArray25[local38][local43] = this.anInt851;
						}
						if (!local13.aClass39_2.aBoolean124) {
							local22 += Integer.MIN_VALUE;
						}
						this.aClass45_1.method476(this.method692(local13.anInt498, local13.anInt497, this.anInt850), local22, (local13.anInt484 - 1) * 64 + 60, local13.aBoolean102, this.anInt850, local13.anInt497, local13, local13.anInt498, local13.anInt499);
					}
				}
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("83505, " + arg0 + ", " + 101 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIZIBIII)Z")
	private boolean method690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(19) int local19;
			for (@Pc(15) int local15 = 0; local15 < 104; local15++) {
				for (local19 = 0; local19 < 104; local19++) {
					this.anIntArrayArray24[local15][local19] = 0;
					this.anIntArrayArray23[local15][local19] = 99999999;
				}
			}
			local19 = arg4;
			@Pc(47) int local47 = arg8;
			this.anIntArrayArray24[arg4][arg8] = 99;
			this.anIntArrayArray23[arg4][arg8] = 0;
			@Pc(63) byte local63 = 0;
			@Pc(65) int local65 = 0;
			this.anIntArray269[0] = arg4;
			@Pc(74) int local74 = local63 + 1;
			this.anIntArray270[0] = arg8;
			@Pc(78) boolean local78 = false;
			@Pc(82) int local82 = this.anIntArray269.length;
			@Pc(89) int[][] local89 = this.aClass20Array1[this.anInt850].anIntArrayArray7;
			@Pc(200) int local200;
			while (local65 != local74) {
				local19 = this.anIntArray269[local65];
				local47 = this.anIntArray270[local65];
				local65 = (local65 + 1) % local82;
				if (local19 == arg0 && local47 == arg10) {
					local78 = true;
					break;
				}
				if (arg5 != 0) {
					if ((arg5 < 5 || arg5 == 10) && this.aClass20Array1[this.anInt850].method285(local19, arg5 - 1, arg7, local47, arg0, arg10)) {
						local78 = true;
						break;
					}
					if (arg5 < 10 && this.aClass20Array1[this.anInt850].method286(arg0, local19, arg7, local47, arg10, arg5 - 1)) {
						local78 = true;
						break;
					}
				}
				if (arg9 != 0 && arg2 != 0 && this.aClass20Array1[this.anInt850].method287(arg1, arg2, arg0, arg9, local47, local19, arg10)) {
					local78 = true;
					break;
				}
				local200 = this.anIntArrayArray23[local19][local47] + 1;
				if (local19 > 0 && this.anIntArrayArray24[local19 - 1][local47] == 0 && (local89[local19 - 1][local47] & 0x1280108) == 0) {
					this.anIntArray269[local74] = local19 - 1;
					this.anIntArray270[local74] = local47;
					local74 = (local74 + 1) % local82;
					this.anIntArrayArray24[local19 - 1][local47] = 2;
					this.anIntArrayArray23[local19 - 1][local47] = local200;
				}
				if (local19 < 103 && this.anIntArrayArray24[local19 + 1][local47] == 0 && (local89[local19 + 1][local47] & 0x1280180) == 0) {
					this.anIntArray269[local74] = local19 + 1;
					this.anIntArray270[local74] = local47;
					local74 = (local74 + 1) % local82;
					this.anIntArrayArray24[local19 + 1][local47] = 8;
					this.anIntArrayArray23[local19 + 1][local47] = local200;
				}
				if (local47 > 0 && this.anIntArrayArray24[local19][local47 - 1] == 0 && (local89[local19][local47 - 1] & 0x1280102) == 0) {
					this.anIntArray269[local74] = local19;
					this.anIntArray270[local74] = local47 - 1;
					local74 = (local74 + 1) % local82;
					this.anIntArrayArray24[local19][local47 - 1] = 1;
					this.anIntArrayArray23[local19][local47 - 1] = local200;
				}
				if (local47 < 103 && this.anIntArrayArray24[local19][local47 + 1] == 0 && (local89[local19][local47 + 1] & 0x1280120) == 0) {
					this.anIntArray269[local74] = local19;
					this.anIntArray270[local74] = local47 + 1;
					local74 = (local74 + 1) % local82;
					this.anIntArrayArray24[local19][local47 + 1] = 4;
					this.anIntArrayArray23[local19][local47 + 1] = local200;
				}
				if (local19 > 0 && local47 > 0 && this.anIntArrayArray24[local19 - 1][local47 - 1] == 0 && (local89[local19 - 1][local47 - 1] & 0x128010E) == 0 && (local89[local19 - 1][local47] & 0x1280108) == 0 && (local89[local19][local47 - 1] & 0x1280102) == 0) {
					this.anIntArray269[local74] = local19 - 1;
					this.anIntArray270[local74] = local47 - 1;
					local74 = (local74 + 1) % local82;
					this.anIntArrayArray24[local19 - 1][local47 - 1] = 3;
					this.anIntArrayArray23[local19 - 1][local47 - 1] = local200;
				}
				if (local19 < 103 && local47 > 0 && this.anIntArrayArray24[local19 + 1][local47 - 1] == 0 && (local89[local19 + 1][local47 - 1] & 0x1280183) == 0 && (local89[local19 + 1][local47] & 0x1280180) == 0 && (local89[local19][local47 - 1] & 0x1280102) == 0) {
					this.anIntArray269[local74] = local19 + 1;
					this.anIntArray270[local74] = local47 - 1;
					local74 = (local74 + 1) % local82;
					this.anIntArrayArray24[local19 + 1][local47 - 1] = 9;
					this.anIntArrayArray23[local19 + 1][local47 - 1] = local200;
				}
				if (local19 > 0 && local47 < 103 && this.anIntArrayArray24[local19 - 1][local47 + 1] == 0 && (local89[local19 - 1][local47 + 1] & 0x1280138) == 0 && (local89[local19 - 1][local47] & 0x1280108) == 0 && (local89[local19][local47 + 1] & 0x1280120) == 0) {
					this.anIntArray269[local74] = local19 - 1;
					this.anIntArray270[local74] = local47 + 1;
					local74 = (local74 + 1) % local82;
					this.anIntArrayArray24[local19 - 1][local47 + 1] = 6;
					this.anIntArrayArray23[local19 - 1][local47 + 1] = local200;
				}
				if (local19 < 103 && local47 < 103 && this.anIntArrayArray24[local19 + 1][local47 + 1] == 0 && (local89[local19 + 1][local47 + 1] & 0x12801E0) == 0 && (local89[local19 + 1][local47] & 0x1280180) == 0 && (local89[local19][local47 + 1] & 0x1280120) == 0) {
					this.anIntArray269[local74] = local19 + 1;
					this.anIntArray270[local74] = local47 + 1;
					local74 = (local74 + 1) % local82;
					this.anIntArrayArray24[local19 + 1][local47 + 1] = 12;
					this.anIntArrayArray23[local19 + 1][local47 + 1] = local200;
				}
			}
			this.anInt871 = 0;
			@Pc(816) int local816;
			@Pc(822) int local822;
			@Pc(828) int local828;
			if (!local78) {
				if (arg6) {
					local200 = 100;
					for (local816 = 1; local816 < 2; local816++) {
						for (local822 = arg0 - local816; local822 <= arg0 + local816; local822++) {
							for (local828 = arg10 - local816; local828 <= arg10 + local816; local828++) {
								if (local822 >= 0 && local828 >= 0 && local822 < 104 && local828 < 104 && this.anIntArrayArray23[local822][local828] < local200) {
									local200 = this.anIntArrayArray23[local822][local828];
									local19 = local822;
									local47 = local828;
									this.anInt871 = 1;
									local78 = true;
								}
							}
						}
						if (local78) {
							break;
						}
					}
				}
				if (!local78) {
					return false;
				}
			}
			@Pc(889) byte local889 = 0;
			this.anIntArray269[0] = local19;
			local65 = local889 + 1;
			this.anIntArray270[0] = local47;
			local200 = local816 = this.anIntArrayArray24[local19][local47];
			while (local19 != arg4 || local47 != arg8) {
				if (local200 != local816) {
					local816 = local200;
					this.anIntArray269[local65] = local19;
					this.anIntArray270[local65++] = local47;
				}
				if ((local200 & 0x2) != 0) {
					local19++;
				} else if ((local200 & 0x8) != 0) {
					local19--;
				}
				if ((local200 & 0x1) != 0) {
					local47++;
				} else if ((local200 & 0x4) != 0) {
					local47--;
				}
				local200 = this.anIntArrayArray24[local19][local47];
			}
			if (local65 > 0) {
				local82 = local65;
				if (local65 > 25) {
					local82 = 25;
				}
				local65--;
				local822 = this.anIntArray269[local65];
				local828 = this.anIntArray270[local65];
				if (arg3 == 0) {
					this.aClass1_Sub1_Sub3_6.method227(146);
					this.aClass1_Sub1_Sub3_6.method228(local82 + local82 + 3);
				}
				if (arg3 == 1) {
					this.aClass1_Sub1_Sub3_6.method227(130);
					this.aClass1_Sub1_Sub3_6.method228(local82 + local82 + 3 + 14);
				}
				if (arg3 == 2) {
					this.aClass1_Sub1_Sub3_6.method227(106);
					this.aClass1_Sub1_Sub3_6.method228(local82 + local82 + 3);
				}
				this.anInt1009 = this.anIntArray269[0];
				this.anInt1010 = this.anIntArray270[0];
				for (@Pc(1047) int local1047 = 1; local1047 < local82; local1047++) {
					local65--;
					this.aClass1_Sub1_Sub3_6.method255(this.anIntArray269[local65] - local822, this.aBoolean227);
					this.aClass1_Sub1_Sub3_6.method254(this.anIntArray270[local65] - local828);
				}
				this.aClass1_Sub1_Sub3_6.method254(super.anIntArray210[5] == 1 ? 1 : 0);
				this.aClass1_Sub1_Sub3_6.method263(local822 + this.anInt1043);
				this.aClass1_Sub1_Sub3_6.method265(local828 + this.anInt1044);
				return true;
			} else if (arg3 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1114) RuntimeException local1114) {
			signlink.reporterror("55102, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 4 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method691() {
		try {
			for (@Pc(12) Class1_Sub2 local12 = (Class1_Sub2) this.aClass32_12.method336(); local12 != null; local12 = (Class1_Sub2) this.aClass32_12.method338()) {
				if (local12.anInt96 == -1) {
					local12.anInt85 = 0;
					this.method621(local12);
				} else {
					local12.method544();
				}
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("22228, " + -402 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IIII)I")
	private int method692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) int local3 = arg1 >> 7;
			@Pc(7) int local7 = arg0 >> 7;
			if (local3 < 0 || local7 < 0 || local3 > 103 || local7 > 103) {
				return 0;
			}
			@Pc(21) int local21 = arg2;
			if (this.anInt983 != 1) {
				this.aClass32ArrayArrayArray1 = null;
			}
			if (arg2 < 3 && (this.aByteArrayArrayArray8[1][local3][local7] & 0x2) == 2) {
				local21 = arg2 + 1;
			}
			@Pc(48) int local48 = arg1 & 0x7F;
			@Pc(52) int local52 = arg0 & 0x7F;
			@Pc(80) int local80 = this.anIntArrayArrayArray8[local21][local3][local7] * (128 - local48) + this.anIntArrayArrayArray8[local21][local3 + 1][local7] * local48 >> 7;
			@Pc(112) int local112 = this.anIntArrayArrayArray8[local21][local3][local7 + 1] * (128 - local48) + this.anIntArrayArrayArray8[local21][local3 + 1][local7 + 1] * local48 >> 7;
			return local80 * (128 - local52) + local112 * local52 >> 7;
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("59875, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 1 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	private boolean method693(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(5) int local5 = 0; local5 < this.anInt919; local5++) {
				if (arg0.equalsIgnoreCase(this.aStringArray8[local5])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass1_Sub1_Sub2_Sub2_Sub1_1.aString5);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("97918, " + arg0 + ", " + -39869 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
	private void method694(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != 122) {
				this.aClass32ArrayArrayArray1 = null;
			}
			if (super.anInt833 == 1) {
				if (super.anInt834 >= 6 && super.anInt834 <= 106 && super.anInt835 >= 467 && super.anInt835 <= 499) {
					this.anInt843 = (this.anInt843 + 1) % 4;
					this.aBoolean200 = true;
					this.aBoolean242 = true;
					this.aClass1_Sub1_Sub3_6.method227(36);
					this.aClass1_Sub1_Sub3_6.method228(this.anInt843);
					this.aClass1_Sub1_Sub3_6.method228(this.anInt912);
					this.aClass1_Sub1_Sub3_6.method228(this.anInt1022);
				}
				if (super.anInt834 >= 135 && super.anInt834 <= 235 && super.anInt835 >= 467 && super.anInt835 <= 499) {
					this.anInt912 = (this.anInt912 + 1) % 3;
					this.aBoolean200 = true;
					this.aBoolean242 = true;
					this.aClass1_Sub1_Sub3_6.method227(36);
					this.aClass1_Sub1_Sub3_6.method228(this.anInt843);
					this.aClass1_Sub1_Sub3_6.method228(this.anInt912);
					this.aClass1_Sub1_Sub3_6.method228(this.anInt1022);
				}
				if (super.anInt834 >= 273 && super.anInt834 <= 373 && super.anInt835 >= 467 && super.anInt835 <= 499) {
					this.anInt1022 = (this.anInt1022 + 1) % 3;
					this.aBoolean200 = true;
					this.aBoolean242 = true;
					this.aClass1_Sub1_Sub3_6.method227(36);
					this.aClass1_Sub1_Sub3_6.method228(this.anInt843);
					this.aClass1_Sub1_Sub3_6.method228(this.anInt912);
					this.aClass1_Sub1_Sub3_6.method228(this.anInt1022);
				}
				@Pc(192) int local192;
				if (super.anInt834 >= 412 && super.anInt834 <= 512 && super.anInt835 >= 467 && super.anInt835 <= 499) {
					if (this.anInt895 == -1) {
						this.method664();
						this.aString22 = "";
						this.aBoolean218 = false;
						for (local192 = 0; local192 < Class43.aClass43Array1.length; local192++) {
							if (Class43.aClass43Array1[local192] != null && Class43.aClass43Array1[local192].anInt712 == 600) {
								this.anInt1042 = this.anInt895 = Class43.aClass43Array1[local192].anInt703;
								break;
							}
						}
					} else {
						this.method630(0, "Please close the interface you have open before using 'report abuse'", "", (byte) 4);
					}
				}
				anInt886++;
				if (anInt886 > 1671) {
					anInt886 = 0;
					this.aClass1_Sub1_Sub3_6.method227(50);
					this.aClass1_Sub1_Sub3_6.method228(0);
					local192 = this.aClass1_Sub1_Sub3_6.anInt352;
					this.aClass1_Sub1_Sub3_6.method228((int) (Math.random() * 256.0D));
					this.aClass1_Sub1_Sub3_6.method229((int) (Math.random() * 65536.0D));
					this.aClass1_Sub1_Sub3_6.method228(198);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub3_6.method228(116);
					}
					this.aClass1_Sub1_Sub3_6.method229((int) (Math.random() * 65536.0D));
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub3_6.method229(63782);
					}
					this.aClass1_Sub1_Sub3_6.method229((int) (Math.random() * 65536.0D));
					this.aClass1_Sub1_Sub3_6.method228((int) (Math.random() * 256.0D));
					this.aClass1_Sub1_Sub3_6.method228(1);
					this.aClass1_Sub1_Sub3_6.method229(18724);
					this.aClass1_Sub1_Sub3_6.method237(this.aClass1_Sub1_Sub3_6.anInt352 - local192);
					return;
				}
			}
		} catch (@Pc(325) RuntimeException local325) {
			signlink.reporterror("36496, " + arg0 + ", " + local325.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!DLNMSHLT;)V")
	private void method695(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub1_Sub2 arg2) {
		try {
			this.anInt887 += 0;
			@Pc(13) int local13 = arg1 * arg1 + arg0 * arg0;
			if (local13 > 4225 && local13 < 90000) {
				@Pc(27) int local27 = this.anInt1005 + this.anInt1016 & 0x7FF;
				@Pc(31) int local31 = Class1_Sub1_Sub2_Sub6.anIntArray154[local27];
				@Pc(35) int local35 = Class1_Sub1_Sub2_Sub6.anIntArray155[local27];
				@Pc(44) int local44 = local31 * 256 / (this.anInt1031 + 256);
				@Pc(53) int local53 = local35 * 256 / (this.anInt1031 + 256);
				@Pc(63) int local63 = arg0 * local44 + arg1 * local53 >> 16;
				@Pc(73) int local73 = arg0 * local53 - arg1 * local44 >> 16;
				@Pc(79) double local79 = Math.atan2((double) local63, (double) local73);
				@Pc(85) int local85 = (int) (Math.sin(local79) * 63.0D);
				@Pc(91) int local91 = (int) (Math.cos(local79) * 57.0D);
				this.aClass1_Sub1_Sub1_Sub2_15.method128(local79, 83 - local91 - 20, local85 + 94 + 4 - 10);
			} else {
				this.method656(arg1, arg2, arg0);
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("62951, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZI)V")
	private void method696(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		try {
			signlink.anInt1060 = arg1;
			if (arg0) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("69790, " + false + ", " + arg0 + ", " + arg1 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
	private void method697() {
		try {
			this.aBoolean237 = false;
			while (this.aBoolean228) {
				this.aBoolean237 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass1_Sub1_Sub1_Sub4_13 = null;
			this.aClass1_Sub1_Sub1_Sub4_14 = null;
			this.aClass1_Sub1_Sub1_Sub4Array2 = null;
			this.anIntArray255 = null;
			this.anIntArray256 = null;
			this.anIntArray257 = null;
			this.anIntArray258 = null;
			this.anIntArray272 = null;
			this.anIntArray273 = null;
			this.anIntArray231 = null;
			this.anIntArray232 = null;
			this.aClass1_Sub1_Sub1_Sub2_8 = null;
			this.aClass1_Sub1_Sub1_Sub2_9 = null;
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("48719, " + 9 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
	private void method698() {
		try {
			try {
				if (this.aClass37_1 != null) {
					this.aClass37_1.method394();
				}
			} catch (@Pc(15) Exception local15) {
			}
			this.aClass37_1 = null;
			this.aBoolean215 = false;
			this.anInt1014 = 0;
			this.aString23 = "";
			this.aString24 = "";
			this.method583();
			this.aClass45_1.method465();
			for (@Pc(39) int local39 = 0; local39 < 4; local39++) {
				this.aClass20Array1[local39].method276();
			}
			System.gc();
			this.method608();
			this.anInt864 = -1;
			this.anInt913 = -1;
			this.anInt839 = 0;
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("5605, " + 8 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIIIILclient!TNOPEJNZ;II)V")
	private void method699(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class43 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (this.aBoolean202) {
				this.anInt893 = 32;
			} else {
				this.anInt893 = 0;
			}
			this.aBoolean202 = false;
			if (arg4 >= arg3 && arg4 < arg3 + 16 && arg6 >= arg7 && arg6 < arg7 + 16) {
				arg5.anInt720 -= this.anInt903 * 4;
				if (arg0) {
					this.aBoolean232 = true;
					return;
				}
			} else if (arg4 >= arg3 && arg4 < arg3 + 16 && arg6 >= arg7 + arg1 - 16 && arg6 < arg7 + arg1) {
				arg5.anInt720 += this.anInt903 * 4;
				if (arg0) {
					this.aBoolean232 = true;
					return;
				}
			} else if (arg4 >= arg3 - this.anInt893 && arg4 < arg3 + this.anInt893 + 16 && arg6 >= arg7 + 16 && arg6 < arg7 + arg1 - 16 && this.anInt903 > 0) {
				@Pc(127) int local127 = (arg1 - 32) * arg1 / arg2;
				if (local127 < 8) {
					local127 = 8;
				}
				@Pc(142) int local142 = arg6 - arg7 - local127 / 2 - 16;
				@Pc(148) int local148 = arg1 - local127 - 32;
				arg5.anInt720 = (arg2 - arg1) * local142 / local148;
				if (arg0) {
					this.aBoolean232 = true;
				}
				this.aBoolean202 = true;
			} else {
				return;
			}
		} catch (@Pc(167) RuntimeException local167) {
			signlink.reporterror("49891, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -15719 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local167.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!JHKSAGUC;I)V")
	private void method700(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt848 = 0;
			this.anInt899 = 0;
			this.method601(arg0, arg1);
			this.method705(this.aByte57, arg1, arg0);
			this.method714(arg0, arg1);
			@Pc(32) int local32;
			for (@Pc(25) int local25 = 0; local25 < this.anInt848; local25++) {
				local32 = this.anIntArray216[local25];
				if (this.aClass1_Sub1_Sub2_Sub2_Sub2Array1[local32].anInt500 != anInt907) {
					this.aClass1_Sub1_Sub2_Sub2_Sub2Array1[local32].aClass39_2 = null;
					this.aClass1_Sub1_Sub2_Sub2_Sub2Array1[local32] = null;
				}
			}
			@Pc(59) int local59 = arg1 + 0;
			if (arg0.anInt352 != local59) {
				signlink.reporterror(this.aString23 + " size mismatch in getnpcpos - pos:" + arg0.anInt352 + " psize:" + local59);
				throw new RuntimeException("eek");
			}
			for (local32 = 0; local32 < this.anInt986; local32++) {
				if (this.aClass1_Sub1_Sub2_Sub2_Sub2Array1[this.anIntArray253[local32]] == null) {
					signlink.reporterror(this.aString23 + " null entry in npc list - pos:" + local32 + " size:" + this.anInt986);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("27875, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
	private void method701(@OriginalArg(0) int arg0) {
		try {
			@Pc(6) int local6 = this.anInt932 * 128 + 64;
			@Pc(13) int local13 = this.anInt933 * 128 + 64;
			@Pc(24) int local24 = this.method692(local13, local6, this.anInt850) - this.anInt934;
			if (this.anInt1033 < local6) {
				this.anInt1033 += this.anInt935 + (local6 - this.anInt1033) * this.anInt936 / 1000;
				if (this.anInt1033 > local6) {
					this.anInt1033 = local6;
				}
			}
			if (this.anInt1033 > local6) {
				this.anInt1033 -= this.anInt935 + (this.anInt1033 - local6) * this.anInt936 / 1000;
				if (this.anInt1033 < local6) {
					this.anInt1033 = local6;
				}
			}
			if (this.anInt1034 < local24) {
				this.anInt1034 += this.anInt935 + (local24 - this.anInt1034) * this.anInt936 / 1000;
				if (this.anInt1034 > local24) {
					this.anInt1034 = local24;
				}
			}
			if (this.anInt1034 > local24) {
				this.anInt1034 -= this.anInt935 + (this.anInt1034 - local24) * this.anInt936 / 1000;
				if (this.anInt1034 < local24) {
					this.anInt1034 = local24;
				}
			}
			if (this.anInt1035 < local13) {
				this.anInt1035 += this.anInt935 + (local13 - this.anInt1035) * this.anInt936 / 1000;
				if (this.anInt1035 > local13) {
					this.anInt1035 = local13;
				}
			}
			if (this.anInt1035 > local13) {
				this.anInt1035 -= this.anInt935 + (this.anInt1035 - local13) * this.anInt936 / 1000;
				if (this.anInt1035 < local13) {
					this.anInt1035 = local13;
				}
			}
			local6 = this.anInt948 * 128 + 64;
			local13 = this.anInt949 * 128 + 64;
			local24 = this.method692(local13, local6, this.anInt850) - this.anInt950;
			@Pc(222) int local222 = local6 - this.anInt1033;
			@Pc(227) int local227 = local24 - this.anInt1034;
			@Pc(232) int local232 = local13 - this.anInt1035;
			@Pc(243) int local243 = (int) Math.sqrt((double) (local222 * local222 + local232 * local232));
			@Pc(254) int local254 = (int) (Math.atan2((double) local227, (double) local243) * 325.949D) & 0x7FF;
			@Pc(265) int local265 = (int) (Math.atan2((double) local222, (double) local232) * -325.949D) & 0x7FF;
			@Pc(269) boolean local269 = false;
			if (local254 < 128) {
				local254 = 128;
			}
			if (local254 > 383) {
				local254 = 383;
			}
			if (this.anInt1036 < local254) {
				this.anInt1036 += this.anInt951 + (local254 - this.anInt1036) * this.anInt952 / 1000;
				if (this.anInt1036 > local254) {
					this.anInt1036 = local254;
				}
			}
			if (this.anInt1036 > local254) {
				this.anInt1036 -= this.anInt951 + (this.anInt1036 - local254) * this.anInt952 / 1000;
				if (this.anInt1036 < local254) {
					this.anInt1036 = local254;
				}
			}
			@Pc(340) int local340 = local265 - this.anInt1037;
			if (local340 > 1024) {
				local340 -= 2048;
			}
			if (local340 < -1024) {
				local340 += 2048;
			}
			if (local340 > 0) {
				this.anInt1037 += this.anInt951 + local340 * this.anInt952 / 1000;
				this.anInt1037 &= 0x7FF;
			}
			if (local340 < 0) {
				this.anInt1037 -= this.anInt951 + -local340 * this.anInt952 / 1000;
				this.anInt1037 &= 0x7FF;
			}
			@Pc(398) int local398 = local265 - this.anInt1037;
			if (local398 > 1024) {
				local398 -= 2048;
			}
			if (local398 < -1024) {
				local398 += 2048;
			}
			if (local398 < 0 && local340 > 0 || local398 > 0 && local340 < 0) {
				this.anInt1037 = local265;
			}
		} catch (@Pc(419) RuntimeException local419) {
			signlink.reporterror("34199, " + arg0 + ", " + local419.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method575() {
		try {
			signlink.reporterror = false;
			try {
				if (this.aClass37_1 != null) {
					this.aClass37_1.method394();
				}
			} catch (@Pc(11) Exception local11) {
			}
			this.aClass37_1 = null;
			this.method608();
			if (this.aClass46_1 != null) {
				this.aClass46_1.aBoolean166 = false;
			}
			this.aClass46_1 = null;
			this.aClass31_Sub1_1.method536();
			this.aClass31_Sub1_1 = null;
			this.aClass1_Sub1_Sub3_9 = null;
			this.aClass1_Sub1_Sub3_6 = null;
			this.aClass1_Sub1_Sub3_8 = null;
			this.aClass1_Sub1_Sub3_7 = null;
			this.anIntArray218 = null;
			this.aByteArrayArray5 = null;
			this.aByteArrayArray4 = null;
			this.anIntArray219 = null;
			this.anIntArray220 = null;
			this.anIntArrayArrayArray8 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass45_1 = null;
			this.aClass20Array1 = null;
			this.anIntArrayArray24 = null;
			this.anIntArrayArray23 = null;
			this.anIntArray269 = null;
			this.anIntArray270 = null;
			this.aByteArray21 = null;
			this.aClass7_21 = null;
			this.aClass7_22 = null;
			this.aClass7_23 = null;
			this.aClass7_24 = null;
			this.aClass7_25 = null;
			this.aClass7_26 = null;
			this.aClass7_27 = null;
			this.aClass7_3 = null;
			this.aClass7_4 = null;
			this.aClass7_5 = null;
			this.aClass7_6 = null;
			this.aClass7_7 = null;
			this.aClass7_8 = null;
			this.aClass7_9 = null;
			this.aClass7_10 = null;
			this.aClass7_11 = null;
			this.aClass1_Sub1_Sub1_Sub4_18 = null;
			this.aClass1_Sub1_Sub1_Sub4_19 = null;
			this.aClass1_Sub1_Sub1_Sub4_20 = null;
			this.aClass1_Sub1_Sub1_Sub4_15 = null;
			this.aClass1_Sub1_Sub1_Sub4_16 = null;
			this.aClass1_Sub1_Sub1_Sub4_17 = null;
			this.aClass1_Sub1_Sub1_Sub4Array4 = null;
			this.aClass1_Sub1_Sub1_Sub4_3 = null;
			this.aClass1_Sub1_Sub1_Sub4_4 = null;
			this.aClass1_Sub1_Sub1_Sub4_5 = null;
			if (this.aByte63 != -32) {
				this.aClass1_Sub1_Sub3_6.method228(232);
			}
			this.aClass1_Sub1_Sub1_Sub4_6 = null;
			this.aClass1_Sub1_Sub1_Sub4_7 = null;
			this.aClass1_Sub1_Sub1_Sub4_8 = null;
			this.aClass1_Sub1_Sub1_Sub4_9 = null;
			this.aClass1_Sub1_Sub1_Sub4_10 = null;
			this.aClass1_Sub1_Sub1_Sub4_11 = null;
			this.aClass1_Sub1_Sub1_Sub4_12 = null;
			this.aClass1_Sub1_Sub1_Sub2_5 = null;
			this.aClass1_Sub1_Sub1_Sub2Array7 = null;
			this.aClass1_Sub1_Sub1_Sub2Array8 = null;
			this.aClass1_Sub1_Sub1_Sub2Array6 = null;
			this.aClass1_Sub1_Sub1_Sub2_10 = null;
			this.aClass1_Sub1_Sub1_Sub2_11 = null;
			this.aClass1_Sub1_Sub1_Sub2_12 = null;
			this.aClass1_Sub1_Sub1_Sub2_13 = null;
			this.aClass1_Sub1_Sub1_Sub2_14 = null;
			this.aClass1_Sub1_Sub1_Sub4Array5 = null;
			this.aClass1_Sub1_Sub1_Sub2Array4 = null;
			this.anIntArrayArray25 = null;
			this.aClass1_Sub1_Sub2_Sub2_Sub1Array1 = null;
			this.anIntArray229 = null;
			this.anIntArray230 = null;
			this.aClass1_Sub1_Sub3Array1 = null;
			this.anIntArray216 = null;
			this.aClass1_Sub1_Sub2_Sub2_Sub2Array1 = null;
			this.anIntArray253 = null;
			this.aClass32ArrayArrayArray1 = null;
			this.aClass32_12 = null;
			this.aClass32_10 = null;
			this.aClass32_11 = null;
			this.anIntArray259 = null;
			this.anIntArray260 = null;
			this.anIntArray261 = null;
			this.anIntArray262 = null;
			this.aStringArray10 = null;
			this.anIntArray263 = null;
			this.anIntArray226 = null;
			this.anIntArray227 = null;
			this.aClass1_Sub1_Sub1_Sub2Array5 = null;
			this.aClass1_Sub1_Sub1_Sub2_16 = null;
			this.aStringArray8 = null;
			this.aLongArray4 = null;
			this.anIntArray267 = null;
			this.aClass7_15 = null;
			this.aClass7_16 = null;
			this.aClass7_12 = null;
			this.aClass7_13 = null;
			this.aClass7_14 = null;
			this.aClass7_17 = null;
			this.aClass7_18 = null;
			this.aClass7_19 = null;
			this.aClass7_20 = null;
			this.method697();
			Class41.method444();
			Class39.method403();
			Class27.method314();
			Class28.aClass28Array1 = null;
			Class8.aClass8Array1 = null;
			Class43.aClass43Array1 = null;
			Class47.aClass47Array1 = null;
			Class23.aClass23Array1 = null;
			Class44.aClass44Array1 = null;
			Class44.aClass30_9 = null;
			Class12.aClass12Array1 = null;
			super.aClass7_2 = null;
			Class1_Sub1_Sub2_Sub2_Sub1.aClass30_1 = null;
			Class1_Sub1_Sub1_Sub1.method55();
			Class45.method464();
			Class1_Sub1_Sub2_Sub6.method411();
			Class13.method145();
			System.gc();
		} catch (@Pc(375) RuntimeException local375) {
			signlink.reporterror("26358, " + -32 + ", " + local375.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(B)V")
	private void method702(@OriginalArg(0) byte arg0) {
		try {
			System.out.println("============");
			if (arg0 != -32) {
				this.aBoolean214 = !this.aBoolean214;
			}
			System.out.println("flame-cycle:" + this.anInt960);
			if (this.aClass31_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass31_Sub1_1.anInt777);
			}
			System.out.println("loop-cycle:" + anInt907);
			System.out.println("draw-cycle:" + anInt916);
			System.out.println("ptype:" + this.anInt888);
			System.out.println("psize:" + this.anInt887);
			if (this.aClass37_1 != null) {
				this.aClass37_1.method399(this.aByte55);
			}
			super.aBoolean194 = true;
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("39091, " + arg0 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)Ljava/awt/Component;")
	@Override
	protected Component method578(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != aByte61) {
				this.method573();
			}
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("38909, " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "N", descriptor = "(I)V")
	private void method703() {
		try {
			this.method655();
			this.anInt887 += 0;
			if (this.anInt964 == 1) {
				this.aClass1_Sub1_Sub1_Sub2Array6[this.anInt963 / 100].method123(this.anInt962 - 8 - 4, this.anInt961 - 8 - 4);
				anInt954++;
				if (anInt954 > 161) {
					anInt954 = 0;
					this.aClass1_Sub1_Sub3_6.method227(196);
					this.aClass1_Sub1_Sub3_6.method231(1545697);
				}
			}
			if (this.anInt964 == 2) {
				this.aClass1_Sub1_Sub1_Sub2Array6[this.anInt963 / 100 + 4].method123(this.anInt962 - 8 - 4, this.anInt961 - 8 - 4);
			}
			if (this.anInt921 != -1) {
				this.method712(this.anInt921, this.anInt840);
				this.method704(0, Class43.aClass43Array1[this.anInt921], 0, 0);
			}
			if (this.anInt895 != -1) {
				this.method712(this.anInt895, this.anInt840);
				this.method704(0, Class43.aClass43Array1[this.anInt895], 0, 0);
			}
			this.method626();
			if (!this.aBoolean217) {
				this.method676();
				this.method643((byte) 8);
			} else if (this.anInt865 == 0) {
				this.method611();
			}
			if (this.anInt940 == 1) {
				this.aClass1_Sub1_Sub1_Sub2Array8[1].method123(296, 472);
			}
			@Pc(184) int local184;
			if (aBoolean210) {
				@Pc(160) byte local160 = 20;
				@Pc(162) int local162 = 16776960;
				if (super.anInt823 < 15) {
					local162 = 16711680;
				}
				this.aClass1_Sub1_Sub1_Sub3_3.method378("Fps:" + super.anInt823, 20, local162);
				local184 = local160 + 15;
				@Pc(186) Runtime local186 = Runtime.getRuntime();
				@Pc(195) int local195 = (int) ((local186.totalMemory() - local186.freeMemory()) / 1024L);
				if (local195 > 33554432 && aBoolean226) {
				}
				this.aClass1_Sub1_Sub1_Sub3_3.method378("Mem:" + local195 + "k", 35, 16776960);
				local184 += 15;
			}
			if (this.anInt1052 != 0) {
				@Pc(229) int local229 = this.anInt1052 / 50;
				local184 = local229 / 60;
				@Pc(237) int local237 = local229 % 60;
				if (local237 < 10) {
					this.aClass1_Sub1_Sub1_Sub3_3.method383(16776960, (byte) 2, "System update in: " + local184 + ":0" + local237, 4, 329);
				} else {
					this.aClass1_Sub1_Sub1_Sub3_3.method383(16776960, (byte) 2, "System update in: " + local184 + ":" + local237, 4, 329);
				}
			}
		} catch (@Pc(279) RuntimeException local279) {
			signlink.reporterror("15179, " + 0 + ", " + local279.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!TNOPEJNZ;II)V")
	private void method704(@OriginalArg(0) int arg0, @OriginalArg(2) Class43 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1.anInt708 == 0 && arg1.anIntArray178 != null && (!arg1.aBoolean146 || this.anInt854 == arg1.anInt694 || this.anInt1001 == arg1.anInt694 || this.anInt863 == arg1.anInt694)) {
				@Pc(29) int local29 = Class1_Sub1_Sub1.anInt803;
				@Pc(31) int local31 = Class1_Sub1_Sub1.anInt801;
				@Pc(33) int local33 = Class1_Sub1_Sub1.anInt804;
				@Pc(35) int local35 = Class1_Sub1_Sub1.anInt802;
				Class1_Sub1_Sub1.method548(arg2 + arg1.anInt699, arg2, arg0 + arg1.anInt707, arg0);
				@Pc(51) int local51 = arg1.anIntArray178.length;
				for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
					@Pc(62) int local62 = arg1.anIntArray176[local53] + arg2;
					@Pc(71) int local71 = arg1.anIntArray179[local53] + arg0 - arg3;
					@Pc(78) Class43 local78 = Class43.aClass43Array1[arg1.anIntArray178[local53]];
					@Pc(83) int local83 = local62 + local78.anInt702;
					@Pc(88) int local88 = local71 + local78.anInt716;
					if (local78.anInt712 > 0) {
						this.method671(local78, 716);
					}
					if (local78.anInt708 == 0) {
						if (local78.anInt720 > local78.anInt701 - local78.anInt707) {
							local78.anInt720 = local78.anInt701 - local78.anInt707;
						}
						if (local78.anInt720 < 0) {
							local78.anInt720 = 0;
						}
						this.method704(local88, local78, local83, local78.anInt720);
						if (local78.anInt701 > local78.anInt707) {
							this.method665(local78.anInt720, local78.anInt707, local78.anInt701, local88, local83 + local78.anInt699);
						}
					} else if (local78.anInt708 != 1) {
						@Pc(160) int local160;
						@Pc(164) int local164;
						@Pc(175) int local175;
						@Pc(210) int local210;
						@Pc(217) int local217;
						@Pc(158) int local158;
						@Pc(208) int local208;
						if (local78.anInt708 == 2) {
							local158 = 0;
							for (local160 = 0; local160 < local78.anInt707; local160++) {
								for (local164 = 0; local164 < local78.anInt699; local164++) {
									local175 = local83 + local164 * (local78.anInt696 + 32);
									@Pc(184) int local184 = local88 + local160 * (local78.anInt717 + 32);
									if (local158 < 20) {
										local175 += local78.anIntArray172[local158];
										local184 += local78.anIntArray180[local158];
									}
									if (local78.anIntArray177[local158] > 0) {
										local208 = 0;
										local210 = 0;
										local217 = local78.anIntArray177[local158] - 1;
										if (local175 > Class1_Sub1_Sub1.anInt803 - 32 && local175 < Class1_Sub1_Sub1.anInt804 && local184 > Class1_Sub1_Sub1.anInt801 - 32 && local184 < Class1_Sub1_Sub1.anInt802 || this.anInt857 != 0 && this.anInt856 == local158) {
											@Pc(242) int local242 = 0;
											if (this.anInt1018 == 1 && this.anInt1019 == local158 && this.anInt1020 == local78.anInt694) {
												local242 = 16777215;
											}
											@Pc(266) Class1_Sub1_Sub1_Sub2 local266 = Class27.method309(local78.anIntArray174[local158], local217, local242);
											if (local266 != null) {
												@Pc(345) int local345;
												if (this.anInt857 != 0 && this.anInt856 == local158 && this.anInt855 == local78.anInt694) {
													local208 = super.anInt828 - this.anInt858;
													local210 = super.anInt829 - this.anInt859;
													if (local208 < 5 && local208 > -5) {
														local208 = 0;
													}
													if (local210 < 5 && local210 > -5) {
														local210 = 0;
													}
													if (this.anInt882 < 5) {
														local208 = 0;
														local210 = 0;
													}
													local266.method125(local175 + local208, local184 + local210);
													if (local184 + local210 < Class1_Sub1_Sub1.anInt801 && arg1.anInt720 > 0) {
														local345 = this.anInt840 * (Class1_Sub1_Sub1.anInt801 - local184 - local210) / 3;
														if (local345 > this.anInt840 * 10) {
															local345 = this.anInt840 * 10;
														}
														if (local345 > arg1.anInt720) {
															local345 = arg1.anInt720;
														}
														arg1.anInt720 -= local345;
														this.anInt859 += local345;
													}
													if (local184 + local210 + 32 > Class1_Sub1_Sub1.anInt802 && arg1.anInt720 < arg1.anInt701 - arg1.anInt707) {
														local345 = this.anInt840 * (local184 + local210 + 32 - Class1_Sub1_Sub1.anInt802) / 3;
														if (local345 > this.anInt840 * 10) {
															local345 = this.anInt840 * 10;
														}
														if (local345 > arg1.anInt701 - arg1.anInt707 - arg1.anInt720) {
															local345 = arg1.anInt701 - arg1.anInt707 - arg1.anInt720;
														}
														arg1.anInt720 += local345;
														this.anInt859 -= local345;
													}
												} else if (this.anInt1027 != 0 && this.anInt1026 == local158 && this.anInt1025 == local78.anInt694) {
													local266.method125(local175, local184);
												} else {
													local266.method123(local184, local175);
												}
												if (local266.anInt117 == 33 || local78.anIntArray174[local158] != 1) {
													local345 = local78.anIntArray174[local158];
													this.aClass1_Sub1_Sub1_Sub3_2.method383(0, (byte) 2, method658(local345), local175 + local208 + 1, local184 + 10 + local210);
													this.aClass1_Sub1_Sub1_Sub3_2.method383(16776960, (byte) 2, method658(local345), local175 + local208, local184 + 9 + local210);
												}
											}
										}
									} else if (local78.aClass1_Sub1_Sub1_Sub2Array2 != null && local158 < 20) {
										@Pc(534) Class1_Sub1_Sub1_Sub2 local534 = local78.aClass1_Sub1_Sub1_Sub2Array2[local158];
										if (local534 != null) {
											local534.method123(local184, local175);
										}
									}
									local158++;
								}
							}
						} else if (local78.anInt708 == 3) {
							@Pc(559) boolean local559 = false;
							if (this.anInt863 == local78.anInt694 || this.anInt1001 == local78.anInt694 || this.anInt854 == local78.anInt694) {
								local559 = true;
							}
							if (this.method653(local78)) {
								local158 = local78.anInt719;
								if (local559 && local78.anInt691 != 0) {
									local158 = local78.anInt691;
								}
							} else {
								local158 = local78.anInt721;
								if (local559 && local78.anInt692 != 0) {
									local158 = local78.anInt692;
								}
							}
							if (local78.aByte47 == 0) {
								if (local78.aBoolean151) {
									Class1_Sub1_Sub1.method551(local78.anInt707, local78.anInt699, local88, local158, local83);
								} else {
									Class1_Sub1_Sub1.method552(local78.anInt707, local83, local78.anInt699, local158, local88);
								}
							} else if (local78.aBoolean151) {
								Class1_Sub1_Sub1.method550(local88, local83, 256 - (local78.aByte47 & 0xFF), local78.anInt699, local78.anInt707, local158);
							} else {
								Class1_Sub1_Sub1.method553(256 - (local78.aByte47 & 0xFF), local88, local78.anInt707, local158, local78.anInt699, local83);
							}
						} else {
							@Pc(677) Class1_Sub1_Sub1_Sub3 local677;
							if (local78.anInt708 == 4) {
								local677 = local78.aClass1_Sub1_Sub1_Sub3_1;
								@Pc(680) String local680 = local78.aString15;
								@Pc(682) boolean local682 = false;
								if (this.anInt863 == local78.anInt694 || this.anInt1001 == local78.anInt694 || this.anInt854 == local78.anInt694) {
									local682 = true;
								}
								if (this.method653(local78)) {
									local160 = local78.anInt719;
									if (local682 && local78.anInt691 != 0) {
										local160 = local78.anInt691;
									}
									if (local78.aString13.length() > 0) {
										local680 = local78.aString13;
									}
								} else {
									local160 = local78.anInt721;
									if (local682 && local78.anInt692 != 0) {
										local160 = local78.anInt692;
									}
								}
								if (local78.anInt711 == 6 && this.aBoolean198) {
									local680 = "Please wait...";
									local160 = local78.anInt721;
								}
								if (Class1_Sub1_Sub1.anInt799 == 479) {
									if (local160 == 16776960) {
										local160 = 255;
									}
									if (local160 == 49152) {
										local160 = 16777215;
									}
								}
								local208 = local88 + local677.anInt572;
								while (local680.length() > 0) {
									if (local680.indexOf("%") != -1) {
										label348: while (true) {
											local210 = local680.indexOf("%1");
											if (local210 == -1) {
												while (true) {
													local210 = local680.indexOf("%2");
													if (local210 == -1) {
														while (true) {
															local210 = local680.indexOf("%3");
															if (local210 == -1) {
																while (true) {
																	local210 = local680.indexOf("%4");
																	if (local210 == -1) {
																		while (true) {
																			local210 = local680.indexOf("%5");
																			if (local210 == -1) {
																				break label348;
																			}
																			local680 = local680.substring(0, local210) + this.method595(this.method629(local78, 4)) + local680.substring(local210 + 2);
																		}
																	}
																	local680 = local680.substring(0, local210) + this.method595(this.method629(local78, 3)) + local680.substring(local210 + 2);
																}
															}
															local680 = local680.substring(0, local210) + this.method595(this.method629(local78, 2)) + local680.substring(local210 + 2);
														}
													}
													local680 = local680.substring(0, local210) + this.method595(this.method629(local78, 1)) + local680.substring(local210 + 2);
												}
											}
											local680 = local680.substring(0, local210) + this.method595(this.method629(local78, 0)) + local680.substring(local210 + 2);
										}
									}
									local210 = local680.indexOf("\\n");
									@Pc(954) String local954;
									if (local210 == -1) {
										local954 = local680;
										local680 = "";
									} else {
										local954 = local680.substring(0, local210);
										local680 = local680.substring(local210 + 2);
									}
									if (local78.aBoolean154) {
										local677.method380(local78.aBoolean150, local954, local83 + local78.anInt699 / 2, local160, local208);
									} else {
										local677.method387(local954, local78.aBoolean150, local83, local160, local208);
									}
									local208 += local677.anInt572;
								}
							} else if (local78.anInt708 == 5) {
								@Pc(1015) Class1_Sub1_Sub1_Sub2 local1015;
								if (this.method653(local78)) {
									local1015 = local78.aClass1_Sub1_Sub1_Sub2_1;
								} else {
									local1015 = local78.aClass1_Sub1_Sub1_Sub2_2;
								}
								if (local1015 != null) {
									local1015.method123(local88, local83);
								}
							} else if (local78.anInt708 == 6) {
								local158 = Class1_Sub1_Sub1_Sub1.anInt51;
								local160 = Class1_Sub1_Sub1_Sub1.anInt52;
								Class1_Sub1_Sub1_Sub1.anInt51 = local83 + local78.anInt699 / 2;
								Class1_Sub1_Sub1_Sub1.anInt52 = local88 + local78.anInt707 / 2;
								local164 = Class1_Sub1_Sub1_Sub1.anIntArray14[local78.anInt714] * local78.anInt713 >> 16;
								local175 = Class1_Sub1_Sub1_Sub1.anIntArray15[local78.anInt714] * local78.anInt713 >> 16;
								@Pc(1076) boolean local1076 = this.method653(local78);
								if (local1076) {
									local208 = local78.anInt698;
								} else {
									local208 = local78.anInt697;
								}
								@Pc(1096) Class1_Sub1_Sub2_Sub6 local1096;
								if (local208 == -1) {
									local1096 = local78.method460(local1076, -1, 856, -1);
								} else {
									@Pc(1102) Class23 local1102 = Class23.aClass23Array1[local208];
									local1096 = local78.method460(local1076, local1102.anIntArray77[local78.anInt700], 856, local1102.anIntArray76[local78.anInt700]);
								}
								if (local1096 != null) {
									local1096.method435(local78.anInt715, 0, local78.anInt714, 0, local164, local175);
								}
								Class1_Sub1_Sub1_Sub1.anInt51 = local158;
								Class1_Sub1_Sub1_Sub1.anInt52 = local160;
							} else if (local78.anInt708 == 7) {
								local677 = local78.aClass1_Sub1_Sub1_Sub3_1;
								local160 = 0;
								for (local164 = 0; local164 < local78.anInt707; local164++) {
									for (local175 = 0; local175 < local78.anInt699; local175++) {
										if (local78.anIntArray177[local160] > 0) {
											@Pc(1166) Class27 local1166 = Class27.method308(local78.anIntArray177[local160] - 1);
											@Pc(1169) String local1169 = local1166.aString6;
											if (local1166.aBoolean95 || local78.anIntArray174[local160] != 1) {
												local1169 = local1169 + " x" + method657(local78.anIntArray174[local160]);
											}
											local210 = local83 + local175 * (local78.anInt696 + 115);
											local217 = local88 + local164 * (local78.anInt717 + 12);
											if (local78.aBoolean154) {
												local677.method380(local78.aBoolean150, local1169, local210 + local78.anInt699 / 2, local78.anInt721, local217);
											} else {
												local677.method387(local1169, local78.aBoolean150, local210, local78.anInt721, local217);
											}
										}
										local160++;
									}
								}
							}
						}
					}
				}
				this.anInt887 += 0;
				Class1_Sub1_Sub1.method548(local33, local29, local35, local31);
			}
		} catch (@Pc(1271) RuntimeException local1271) {
			signlink.reporterror("94706, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local1271.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt975 = Integer.parseInt(this.getParameter("nodeid"));
		anInt976 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method618();
		} else {
			method609();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean225 = false;
		} else {
			aBoolean225 = true;
		}
		this.method569();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!JHKSAGUC;)V")
	private void method705(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2) {
		try {
			while (true) {
				if (arg2.anInt353 + 21 < arg1 * 8) {
					@Pc(12) int local12 = arg2.method249((byte) 9, 14);
					if (local12 != 16383) {
						if (this.aClass1_Sub1_Sub2_Sub2_Sub2Array1[local12] == null) {
							this.aClass1_Sub1_Sub2_Sub2_Sub2Array1[local12] = new Class1_Sub1_Sub2_Sub2_Sub2();
						}
						@Pc(32) Class1_Sub1_Sub2_Sub2_Sub2 local32 = this.aClass1_Sub1_Sub2_Sub2_Sub2Array1[local12];
						this.anIntArray253[this.anInt986++] = local12;
						local32.anInt500 = anInt907;
						@Pc(51) int local51 = arg2.method249((byte) 9, 5);
						if (local51 > 15) {
							local51 -= 32;
						}
						@Pc(60) int local60 = arg2.method249((byte) 9, 5);
						if (local60 > 15) {
							local60 -= 32;
						}
						@Pc(69) int local69 = arg2.method249((byte) 9, 1);
						local32.aClass39_2 = Class39.method406(arg2.method249((byte) 9, 12));
						@Pc(81) int local81 = arg2.method249((byte) 9, 1);
						if (local81 == 1) {
							this.anIntArray230[this.anInt899++] = local12;
						}
						local32.anInt484 = local32.aClass39_2.aByte36;
						local32.anInt519 = local32.aClass39_2.anInt590;
						local32.anInt515 = local32.aClass39_2.anInt599;
						local32.anInt516 = local32.aClass39_2.anInt593;
						local32.anInt517 = local32.aClass39_2.anInt591;
						local32.anInt518 = local32.aClass39_2.anInt586;
						local32.anInt485 = local32.aClass39_2.anInt595;
						local32.method325(aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0] + local51, local69 == 1, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0] + local60);
						continue;
					}
				}
				arg2.method250();
				if (arg0 != this.aByte57) {
					return;
				}
				return;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("53691, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method706(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString19 = "";
				this.aString20 = "Connecting to server...";
				this.method649(true);
			}
			this.aClass37_1 = new Class37(this, 0, this.method662(anInt976 + 43594));
			@Pc(30) long local30 = Class49.method538(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass1_Sub1_Sub3_6.anInt352 = 0;
			this.aClass1_Sub1_Sub3_6.method228(14);
			this.aClass1_Sub1_Sub3_6.method228(local37);
			this.aClass37_1.method398(this.aClass1_Sub1_Sub3_6.aByteArray3, 2);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass37_1.method395();
			}
			@Pc(74) int local74 = this.aClass37_1.method395();
			@Pc(76) int local76 = local74;
			@Pc(225) int local225;
			@Pc(259) int local259;
			if (local74 == 0) {
				this.aClass37_1.method397(this.aClass1_Sub1_Sub3_7.aByteArray3, 0, 8);
				this.aClass1_Sub1_Sub3_7.anInt352 = 0;
				this.aLong29 = this.aClass1_Sub1_Sub3_7.method244();
				@Pc(99) int[] local99 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong29 >> 32), (int) this.aLong29 };
				this.aClass1_Sub1_Sub3_6.anInt352 = 0;
				this.aClass1_Sub1_Sub3_6.method228(10);
				this.aClass1_Sub1_Sub3_6.method232(local99[0]);
				this.aClass1_Sub1_Sub3_6.method232(local99[1]);
				this.aClass1_Sub1_Sub3_6.method232(local99[2]);
				this.aClass1_Sub1_Sub3_6.method232(local99[3]);
				this.aClass1_Sub1_Sub3_6.method232(signlink.anInt1055);
				this.aClass1_Sub1_Sub3_6.method235(arg0);
				this.aClass1_Sub1_Sub3_6.method235(arg1);
				this.aClass1_Sub1_Sub3_6.method253(aBigInteger2, aBigInteger1);
				this.aClass1_Sub1_Sub3_8.anInt352 = 0;
				if (arg2) {
					this.aClass1_Sub1_Sub3_8.method228(18);
				} else {
					this.aClass1_Sub1_Sub3_8.method228(16);
				}
				this.aClass1_Sub1_Sub3_8.method228(this.aClass1_Sub1_Sub3_6.anInt352 + 36 + 1 + 1 + 2);
				this.aClass1_Sub1_Sub3_8.method228(255);
				this.aClass1_Sub1_Sub3_8.method229(318);
				this.aClass1_Sub1_Sub3_8.method228(aBoolean226 ? 1 : 0);
				for (local225 = 0; local225 < 9; local225++) {
					this.aClass1_Sub1_Sub3_8.method232(this.anIntArray235[local225]);
				}
				this.aClass1_Sub1_Sub3_8.method236(this.aClass1_Sub1_Sub3_6.anInt352, this.aClass1_Sub1_Sub3_6.aByteArray3);
				this.aClass1_Sub1_Sub3_6.aClass50_1 = new Class50(-48131, local99);
				for (local259 = 0; local259 < 4; local259++) {
					local99[local259] += 50;
				}
				this.aClass50_2 = new Class50(-48131, local99);
				this.aClass37_1.method398(this.aClass1_Sub1_Sub3_8.aByteArray3, this.aClass1_Sub1_Sub3_8.anInt352);
				local74 = this.aClass37_1.method395();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(301) Exception local301) {
				}
				this.method706(arg0, arg1, arg2);
			} else {
				@Pc(389) int local389;
				if (local74 == 2) {
					this.anInt1003 = this.aClass37_1.method395();
					aBoolean222 = this.aClass37_1.method395() == 1;
					this.aLong30 = 0L;
					this.anInt917 = 0;
					this.aClass46_1.anInt769 = 0;
					super.aBoolean196 = true;
					this.aBoolean220 = true;
					this.aBoolean215 = true;
					this.aClass1_Sub1_Sub3_6.anInt352 = 0;
					this.aClass1_Sub1_Sub3_7.anInt352 = 0;
					this.anInt888 = -1;
					this.anInt980 = -1;
					this.anInt981 = -1;
					this.anInt982 = -1;
					this.anInt887 = 0;
					this.anInt889 = 0;
					this.anInt1052 = 0;
					this.anInt891 = 0;
					this.anInt846 = 0;
					this.anInt931 = 0;
					this.aBoolean217 = false;
					super.anInt826 = 0;
					for (local389 = 0; local389 < 100; local389++) {
						this.aStringArray12[local389] = null;
					}
					this.anInt1018 = 0;
					this.anInt900 = 0;
					this.anInt908 = 0;
					this.anInt918 = 0;
					this.anInt924 = (int) (Math.random() * 100.0D) - 50;
					this.anInt872 = (int) (Math.random() * 110.0D) - 55;
					this.anInt990 = (int) (Math.random() * 80.0D) - 40;
					this.anInt1016 = (int) (Math.random() * 120.0D) - 60;
					this.anInt1031 = (int) (Math.random() * 30.0D) - 20;
					this.anInt1005 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt929 = 0;
					this.anInt1028 = -1;
					this.anInt1009 = 0;
					this.anInt1010 = 0;
					this.anInt898 = 0;
					this.anInt986 = 0;
					for (local225 = 0; local225 < this.anInt896; local225++) {
						this.aClass1_Sub1_Sub2_Sub2_Sub1Array1[local225] = null;
						this.aClass1_Sub1_Sub3Array1[local225] = null;
					}
					for (local259 = 0; local259 < 16384; local259++) {
						this.aClass1_Sub1_Sub2_Sub2_Sub2Array1[local259] = null;
					}
					aClass1_Sub1_Sub2_Sub2_Sub1_1 = this.aClass1_Sub1_Sub2_Sub2_Sub1Array1[this.anInt897] = new Class1_Sub1_Sub2_Sub2_Sub1();
					this.aClass32_10.method340();
					this.aClass32_11.method340();
					@Pc(534) int local534;
					@Pc(538) int local538;
					for (@Pc(530) int local530 = 0; local530 < 4; local530++) {
						for (local534 = 0; local534 < 104; local534++) {
							for (local538 = 0; local538 < 104; local538++) {
								this.aClass32ArrayArrayArray1[local530][local534][local538] = null;
							}
						}
					}
					this.aClass32_12 = new Class32(-392);
					this.anInt920 = 0;
					this.anInt919 = 0;
					this.anInt965 = -1;
					this.anInt914 = -1;
					this.anInt895 = -1;
					this.anInt906 = -1;
					this.anInt921 = -1;
					this.aBoolean198 = false;
					this.anInt967 = 3;
					this.anInt1041 = 0;
					this.aBoolean217 = false;
					this.aBoolean216 = false;
					this.aString18 = null;
					this.anInt940 = 0;
					this.anInt884 = -1;
					this.aBoolean231 = true;
					this.method615((byte) 3);
					for (local534 = 0; local534 < 5; local534++) {
						this.anIntArray225[local534] = 0;
					}
					for (local538 = 0; local538 < 5; local538++) {
						this.aStringArray13[local538] = null;
						this.aBooleanArray12[local538] = false;
					}
					anInt993 = 0;
					anInt1023 = 0;
					anInt953 = 0;
					anInt841 = 0;
					anInt968 = 0;
					anInt909 = 0;
					anInt947 = 0;
					anInt849 = 0;
					this.method610();
				} else if (local74 == 3) {
					this.aString19 = "";
					this.aString20 = "Invalid username or password.";
				} else if (local74 == 4) {
					this.aString19 = "Your account has been disabled.";
					this.aString20 = "Please check your message-centre for details.";
				} else if (local74 == 5) {
					this.aString19 = "Your account is already logged in.";
					this.aString20 = "Try again in 60 secs...";
				} else if (local74 == 6) {
					this.aString19 = "RuneScape has been updated!";
					this.aString20 = "Please reload this page.";
				} else if (local74 == 7) {
					this.aString19 = "This world is full.";
					this.aString20 = "Please use a different world.";
				} else if (local74 == 8) {
					this.aString19 = "Unable to connect.";
					this.aString20 = "Login server offline.";
				} else if (local74 == 9) {
					this.aString19 = "Login limit exceeded.";
					this.aString20 = "Too many connections from your address.";
				} else if (local74 == 10) {
					this.aString19 = "Unable to connect.";
					this.aString20 = "Bad session id.";
				} else if (local74 == 11) {
					this.aString20 = "Login server rejected session.";
					this.aString20 = "Please try again.";
				} else if (local74 == 12) {
					this.aString19 = "You need a members account to login to this world.";
					this.aString20 = "Please subscribe, or use a different world.";
				} else if (local74 == 13) {
					this.aString19 = "Could not complete login.";
					this.aString20 = "Please try using a different world.";
				} else if (local74 == 14) {
					this.aString19 = "The server is being updated.";
					this.aString20 = "Please wait 1 minute and try again.";
				} else if (local74 == 15) {
					this.aBoolean215 = true;
					this.aClass1_Sub1_Sub3_6.anInt352 = 0;
					this.aClass1_Sub1_Sub3_7.anInt352 = 0;
					this.anInt888 = -1;
					this.anInt980 = -1;
					this.anInt981 = -1;
					this.anInt982 = -1;
					this.anInt887 = 0;
					this.anInt889 = 0;
					this.anInt1052 = 0;
					this.anInt931 = 0;
					this.aBoolean217 = false;
					this.aLong33 = System.currentTimeMillis();
				} else if (local74 == 16) {
					this.aString19 = "Login attempts exceeded.";
					this.aString20 = "Please wait 1 minute and try again.";
				} else if (local74 == 17) {
					this.aString19 = "You are standing in a members-only area.";
					this.aString20 = "To play on this world move to a free area first";
				} else if (local74 == 20) {
					this.aString19 = "Invalid loginserver requested";
					this.aString20 = "Please try using a different world.";
				} else if (local74 == 21) {
					local389 = this.aClass37_1.method395();
					for (@Pc(876) int local876 = local389 + 3; local876 >= 0; local876--) {
						this.aString19 = "You have only just left another world";
						this.aString20 = "Your profile will be transferred in: " + local876;
						this.method649(true);
						try {
							Thread.sleep(1200L);
						} catch (@Pc(898) Exception local898) {
						}
					}
					this.method706(arg0, arg1, arg2);
				} else if (local74 != -1) {
					System.out.println("response:" + local74);
					this.aString19 = "Unexpected server response";
					this.aString20 = "Please try using a different world.";
				} else if (local76 != 0) {
					this.aString19 = "No response from server";
					this.aString20 = "Please try using a different world.";
				} else if (this.anInt974 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(920) Exception local920) {
					}
					this.anInt974++;
					this.method706(arg0, arg1, arg2);
				} else {
					this.aString19 = "No response from loginserver";
					this.aString20 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(963) IOException local963) {
			this.aString19 = "";
			this.aString20 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "O", descriptor = "(I)V")
	private void method707(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) Graphics local4 = this.method578(aByte61).getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			if (arg0 < 2 || arg0 > 2) {
				anInt1038 = 193;
			}
			this.method571();
			@Pc(44) byte local44;
			@Pc(50) int local50;
			if (this.aBoolean209) {
				this.aBoolean237 = false;
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
			if (this.aBoolean240) {
				this.aBoolean237 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean241) {
				this.aBoolean237 = false;
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
			signlink.reporterror("23346, " + arg0 + ", " + local182.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "P", descriptor = "(I)V")
	private void method708(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 5 || arg0 > 5) {
				this.anInt1053 = this.aClass50_2.method565();
			}
			if (this.anInt929 == 0 && super.anInt833 == 1) {
				@Pc(25) int local25 = super.anInt834 - 25 - 550;
				@Pc(32) int local32 = super.anInt835 - 5 - 4;
				if (local25 >= 0 && local32 >= 0 && local25 < 146 && local32 < 151) {
					local25 -= 73;
					local32 -= 75;
					@Pc(52) int local52 = this.anInt1005 + this.anInt1016 & 0x7FF;
					@Pc(56) int local56 = Class1_Sub1_Sub1_Sub1.anIntArray14[local52];
					@Pc(60) int local60 = Class1_Sub1_Sub1_Sub1.anIntArray15[local52];
					@Pc(69) int local69 = local56 * (this.anInt1031 + 256) >> 8;
					@Pc(78) int local78 = local60 * (this.anInt1031 + 256) >> 8;
					@Pc(88) int local88 = local32 * local69 + local25 * local78 >> 11;
					@Pc(98) int local98 = local32 * local78 - local25 * local69 >> 11;
					@Pc(105) int local105 = aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt497 + local88 >> 7;
					@Pc(112) int local112 = aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt498 - local98 >> 7;
					@Pc(133) boolean local133 = this.method690(local105, 0, 0, 1, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray87[0], 0, true, 0, aClass1_Sub1_Sub2_Sub2_Sub1_1.anIntArray88[0], 0, local112);
					if (local133) {
						this.aClass1_Sub1_Sub3_6.method228(local25);
						this.aClass1_Sub1_Sub3_6.method228(local32);
						this.aClass1_Sub1_Sub3_6.method229(this.anInt1005);
						this.aClass1_Sub1_Sub3_6.method228(57);
						this.aClass1_Sub1_Sub3_6.method228(this.anInt1016);
						this.aClass1_Sub1_Sub3_6.method228(this.anInt1031);
						this.aClass1_Sub1_Sub3_6.method228(89);
						this.aClass1_Sub1_Sub3_6.method229(aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt497);
						this.aClass1_Sub1_Sub3_6.method229(aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt498);
						this.aClass1_Sub1_Sub3_6.method228(this.anInt871);
						this.aClass1_Sub1_Sub3_6.method228(63);
						return;
					}
				}
			}
		} catch (@Pc(187) RuntimeException local187) {
			signlink.reporterror("71552, " + arg0 + ", " + local187.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(B)I")
	private int method709(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) int local3 = 3;
			if (arg0 != this.aByte59) {
				return this.anInt845;
			}
			if (this.anInt1036 < 310) {
				@Pc(19) int local19 = this.anInt1033 >> 7;
				@Pc(24) int local24 = this.anInt1035 >> 7;
				@Pc(29) int local29 = aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt497 >> 7;
				@Pc(34) int local34 = aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt498 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt850][local19][local24] & 0x4) != 0) {
					local3 = this.anInt850;
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
						if ((this.aByteArrayArrayArray8[this.anInt850][local19][local24] & 0x4) != 0) {
							local3 = this.anInt850;
						}
						local86 += local84;
						if (local86 >= 65536) {
							local86 -= 65536;
							if (local24 < local34) {
								local24++;
							} else if (local24 > local34) {
								local24--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt850][local19][local24] & 0x4) != 0) {
								local3 = this.anInt850;
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
						if ((this.aByteArrayArrayArray8[this.anInt850][local19][local24] & 0x4) != 0) {
							local3 = this.anInt850;
						}
						local86 += local84;
						if (local86 >= 65536) {
							local86 -= 65536;
							if (local19 < local29) {
								local19++;
							} else if (local19 > local29) {
								local19--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt850][local19][local24] & 0x4) != 0) {
								local3 = this.anInt850;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt850][aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt497 >> 7][aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt498 >> 7] & 0x4) != 0) {
				local3 = this.anInt850;
			}
			return local3;
		} catch (@Pc(251) RuntimeException local251) {
			signlink.reporterror("46831, " + arg0 + ", " + local251.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "(I)I")
	private int method710() {
		try {
			if (this.anInt928 != -40997) {
				this.anInt888 = -1;
			}
			@Pc(16) int local16 = this.method692(this.anInt1035, this.anInt1033, this.anInt850);
			return local16 - this.anInt1034 >= 800 || (this.aByteArrayArrayArray8[this.anInt850][this.anInt1033 >> 7][this.anInt1035 >> 7] & 0x4) == 0 ? 3 : this.anInt850;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("73937, " + -40997 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!JHKSAGUC;I)V")
	private void method711(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(6) int local6 = arg1.method249((byte) 9, 8);
			@Pc(21) int local21;
			if (local6 < this.anInt898) {
				for (local21 = local6; local21 < this.anInt898; local21++) {
					this.anIntArray216[this.anInt848++] = this.anIntArray229[local21];
				}
			}
			if (local6 > this.anInt898) {
				signlink.reporterror(this.aString23 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt898 = 0;
			for (local21 = 0; local21 < local6; local21++) {
				@Pc(73) int local73 = this.anIntArray229[local21];
				@Pc(78) Class1_Sub1_Sub2_Sub2_Sub1 local78 = this.aClass1_Sub1_Sub2_Sub2_Sub1Array1[local73];
				@Pc(83) int local83 = arg1.method249((byte) 9, 1);
				if (local83 == 0) {
					this.anIntArray229[this.anInt898++] = local73;
					local78.anInt500 = anInt907;
				} else {
					@Pc(106) int local106 = arg1.method249((byte) 9, 2);
					if (local106 == 0) {
						this.anIntArray229[this.anInt898++] = local73;
						local78.anInt500 = anInt907;
						this.anIntArray230[this.anInt899++] = local73;
					} else {
						@Pc(157) int local157;
						@Pc(167) int local167;
						if (local106 == 1) {
							this.anIntArray229[this.anInt898++] = local73;
							local78.anInt500 = anInt907;
							local157 = arg1.method249((byte) 9, 3);
							local78.method324(local157, false);
							local167 = arg1.method249((byte) 9, 1);
							if (local167 == 1) {
								this.anIntArray230[this.anInt899++] = local73;
							}
						} else if (local106 == 2) {
							this.anIntArray229[this.anInt898++] = local73;
							local78.anInt500 = anInt907;
							local157 = arg1.method249((byte) 9, 3);
							local78.method324(local157, true);
							local167 = arg1.method249((byte) 9, 3);
							local78.method324(local167, true);
							@Pc(225) int local225 = arg1.method249((byte) 9, 1);
							if (local225 == 1) {
								this.anIntArray230[this.anInt899++] = local73;
							}
						} else if (local106 == 3) {
							this.anIntArray216[this.anInt848++] = local73;
						}
					}
				}
			}
		} catch (@Pc(262) RuntimeException local262) {
			signlink.reporterror("64184, " + arg0 + ", " + arg1 + ", " + 655 + ", " + local262.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(III)Z")
	private boolean method712(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(7) Class43 local7 = Class43.aClass43Array1[arg0];
			for (@Pc(9) int local9 = 0; local9 < local7.anIntArray178.length && local7.anIntArray178[local9] != -1; local9++) {
				@Pc(24) Class43 local24 = Class43.aClass43Array1[local7.anIntArray178[local9]];
				if (local24.anInt708 == 1) {
					local3 |= this.method712(local24.anInt694, arg1);
				}
				if (local24.anInt708 == 6 && (local24.anInt697 != -1 || local24.anInt698 != -1)) {
					@Pc(54) boolean local54 = this.method653(local24);
					@Pc(59) int local59;
					if (local54) {
						local59 = local24.anInt698;
					} else {
						local59 = local24.anInt697;
					}
					if (local59 != -1) {
						@Pc(71) Class23 local71 = Class23.aClass23Array1[local59];
						local24.anInt709 += arg1;
						while (local24.anInt709 > local71.method293(this.anInt892, local24.anInt700)) {
							local24.anInt709 -= local71.method293(this.anInt892, local24.anInt700) + 1;
							local24.anInt700++;
							if (local24.anInt700 >= local71.anInt387) {
								local24.anInt700 -= local71.anInt388;
								if (local24.anInt700 < 0 || local24.anInt700 >= local71.anInt387) {
									local24.anInt700 = 0;
								}
							}
							local3 = true;
						}
					}
				}
			}
			return local3;
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("14208, " + arg0 + ", " + -63 + ", " + arg1 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method713() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt898; local3++) {
				if (local3 == -1) {
					local11 = this.anInt897;
				} else {
					local11 = this.anIntArray229[local3];
				}
				@Pc(23) Class1_Sub1_Sub2_Sub2_Sub1 local23 = this.aClass1_Sub1_Sub2_Sub2_Sub1Array1[local11];
				if (local23 != null && local23.anInt501 > 0) {
					local23.anInt501--;
					if (local23.anInt501 == 0) {
						local23.aString8 = null;
					}
				}
			}
			this.aBoolean215 &= true;
			for (local11 = 0; local11 < this.anInt986; local11++) {
				@Pc(60) int local60 = this.anIntArray253[local11];
				@Pc(65) Class1_Sub1_Sub2_Sub2_Sub2 local65 = this.aClass1_Sub1_Sub2_Sub2_Sub2Array1[local60];
				if (local65 != null && local65.anInt501 > 0) {
					local65.anInt501--;
					if (local65.anInt501 == 0) {
						local65.aString8 = null;
					}
				}
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("83019, " + true + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!JHKSAGUC;I)V")
	private void method714(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(13) int local13 = 0; local13 < this.anInt899; local13++) {
				@Pc(20) int local20 = this.anIntArray230[local13];
				@Pc(25) Class1_Sub1_Sub2_Sub2_Sub2 local25 = this.aClass1_Sub1_Sub2_Sub2_Sub2Array1[local20];
				@Pc(28) int local28 = arg0.method238();
				@Pc(35) int local35;
				@Pc(38) int local38;
				if ((local28 & 0x40) != 0) {
					local35 = arg0.method238();
					local38 = arg0.method238();
					local25.method327(local35, local38, anInt907);
					local25.anInt507 = anInt907 + 300;
					local25.anInt508 = arg0.method257();
					local25.anInt509 = arg0.method259();
				}
				if ((local28 & 0x8) != 0) {
					local35 = arg0.method268();
					if (local35 == 65535) {
						local35 = -1;
					}
					local38 = arg0.method257();
					if (local35 == local25.anInt510 && local35 != -1) {
						@Pc(88) int local88 = Class23.aClass23Array1[local35].anInt395;
						if (local88 == 1) {
							local25.anInt511 = 0;
							local25.anInt512 = 0;
							local25.anInt513 = local38;
							local25.anInt514 = 0;
						}
						if (local88 == 2) {
							local25.anInt514 = 0;
						}
					} else if (local35 == -1 || local25.anInt510 == -1 || Class23.aClass23Array1[local35].anInt389 >= Class23.aClass23Array1[local25.anInt510].anInt389) {
						local25.anInt510 = local35;
						local25.anInt511 = 0;
						local25.anInt512 = 0;
						local25.anInt513 = local38;
						local25.anInt514 = 0;
						local25.anInt493 = local25.anInt483;
					}
				}
				if ((local28 & 0x10) != 0) {
					local35 = arg0.method259();
					local38 = arg0.method257();
					local25.method327(local35, local38, anInt907);
					local25.anInt507 = anInt907 + 300;
					local25.anInt508 = arg0.method257();
					local25.anInt509 = arg0.method238();
				}
				if ((local28 & 0x1) != 0) {
					local25.aClass39_2 = Class39.method406(arg0.method240());
					local25.anInt484 = local25.aClass39_2.aByte36;
					local25.anInt519 = local25.aClass39_2.anInt590;
					local25.anInt515 = local25.aClass39_2.anInt599;
					local25.anInt516 = local25.aClass39_2.anInt593;
					local25.anInt517 = local25.aClass39_2.anInt591;
					local25.anInt518 = local25.aClass39_2.anInt586;
					local25.anInt485 = local25.aClass39_2.anInt595;
				}
				if ((local28 & 0x20) != 0) {
					local25.anInt470 = arg0.method240();
					local35 = arg0.method273();
					local25.anInt474 = local35 >> 16;
					local25.anInt473 = anInt907 + (local35 & 0xFFFF);
					local25.anInt471 = 0;
					local25.anInt472 = 0;
					if (local25.anInt473 > anInt907) {
						local25.anInt471 = -1;
					}
					if (local25.anInt470 == 65535) {
						local25.anInt470 = -1;
					}
				}
				if ((local28 & 0x4) != 0) {
					local25.anInt488 = arg0.method266();
					local25.anInt489 = arg0.method267();
				}
				if ((local28 & 0x2) != 0) {
					local25.aString8 = arg0.method245();
					local25.anInt501 = 100;
				}
				if ((local28 & 0x80) != 0) {
					local25.anInt505 = arg0.method267();
					if (local25.anInt505 == 65535) {
						local25.anInt505 = -1;
					}
				}
			}
		} catch (@Pc(315) RuntimeException local315) {
			signlink.reporterror("59223, " + false + ", " + arg0 + ", " + arg1 + ", " + local315.toString());
			throw new RuntimeException();
		}
	}
}
