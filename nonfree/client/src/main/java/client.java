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

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	private static int anInt824;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
	private static int anInt828;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "I")
	private static int anInt846;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "I")
	private static int anInt854;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "Z")
	private static boolean aBoolean202;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "I")
	private static int anInt858;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
	private static int anInt866;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
	private static int anInt870;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
	private static int anInt904;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private static int anInt912;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "Z")
	private static boolean aBoolean217;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "I")
	public static int anInt921;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
	private static int anInt941;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "I")
	private static int anInt956;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
	public static int anInt965;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "Z")
	private static boolean aBoolean230;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
	private static int anInt968;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "I")
	private static int anInt972;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "Z")
	private static boolean aBoolean232;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "Lclient!QVUHZTUC;")
	public static Class1_Sub1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub1_Sub3_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "I")
	private static int anInt1006;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
	private static int anInt1015;

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "I")
	private static int anInt1023;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
	private static int anInt851 = 5;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "Ljava/lang/String;")
	private static String aString18 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "[[I")
	public static final int[][] anIntArrayArray22 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "I")
	private static int anInt861 = 3;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "[I")
	public static int[] anIntArray220 = new int[32];

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "[I")
	private static int[] anIntArray237;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
	private static int anInt920;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "Z")
	private static boolean aBoolean228;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
	private static int anInt964;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "Z")
	private static boolean aBoolean229;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "[I")
	public static final int[] anIntArray265;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "B")
	private static byte aByte46;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "[[B")
	private byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
	private int anInt817;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "I")
	private int anInt819;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "I")
	private int anInt820;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
	private int anInt821;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	private int anInt822;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
	private int anInt825;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	private int anInt827;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
	private int anInt829;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
	private int anInt831;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "Lclient!FMTLAPCJ;")
	private Class9 aClass9_2;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
	private int anInt834;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
	private int anInt836;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "I")
	private int anInt837;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
	private int anInt838;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
	private int anInt839;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
	private int anInt840;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private int anInt842;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
	private int anInt843;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
	private int anInt844;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private int anInt845;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
	private int anInt847;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "I")
	private int anInt848;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
	private int anInt849;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
	private int anInt850;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "Lclient!TKCVVLIT;")
	private Class1_Sub1_Sub3_Sub3 aClass1_Sub1_Sub3_Sub3_1;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "Lclient!TKCVVLIT;")
	private Class1_Sub1_Sub3_Sub3 aClass1_Sub1_Sub3_Sub3_2;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "Lclient!TKCVVLIT;")
	private Class1_Sub1_Sub3_Sub3 aClass1_Sub1_Sub3_Sub3_3;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt852;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
	private int anInt853;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "I")
	private int anInt855;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
	private int anInt857;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
	private int anInt859;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "Lclient!TKCVVLIT;")
	private Class1_Sub1_Sub3_Sub3 aClass1_Sub1_Sub3_Sub3_4;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "Lclient!TKCVVLIT;")
	private Class1_Sub1_Sub3_Sub3 aClass1_Sub1_Sub3_Sub3_5;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
	private int anInt862;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "Lclient!YOIXICCU;")
	private Class48 aClass48_3;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "Lclient!YOIXICCU;")
	private Class48 aClass48_4;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "Lclient!YOIXICCU;")
	private Class48 aClass48_5;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "Lclient!YOIXICCU;")
	private Class48 aClass48_6;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "Lclient!YOIXICCU;")
	private Class48 aClass48_7;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "Lclient!YOIXICCU;")
	private Class48 aClass48_8;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "Lclient!YOIXICCU;")
	private Class48 aClass48_9;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "Lclient!YOIXICCU;")
	private Class48 aClass48_10;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "Lclient!YOIXICCU;")
	private Class48 aClass48_11;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "I")
	private int anInt863;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
	private int anInt864;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "[Lclient!TKCVVLIT;")
	private Class1_Sub1_Sub3_Sub3[] aClass1_Sub1_Sub3_Sub3Array3;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
	private int anInt865;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
	private int anInt868;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
	private int anInt869;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "Lclient!FHVZVKRA;")
	private Class7_Sub1 aClass7_Sub1_1;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "[I")
	private int[] anIntArray223;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "[I")
	private int[] anIntArray224;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
	private int anInt871;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "I")
	private int anInt873;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "I")
	private int anInt874;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "Ljava/lang/String;")
	private String aString20;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "Lclient!YZDAHXEQ;")
	private Class1_Sub1_Sub3_Sub4 aClass1_Sub1_Sub3_Sub4_3;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "Lclient!YZDAHXEQ;")
	private Class1_Sub1_Sub3_Sub4 aClass1_Sub1_Sub3_Sub4_4;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "I")
	private int anInt875;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "I")
	private int anInt878;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
	private int anInt879;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
	private int anInt880;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
	private int anInt882;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
	private int anInt883;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "I")
	private int anInt885;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "I")
	private int anInt888;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "Lclient!JHRYTWFZ;")
	private Class16 aClass16_1;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "Lclient!YZDAHXEQ;")
	private Class1_Sub1_Sub3_Sub4 aClass1_Sub1_Sub3_Sub4_5;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "Lclient!YZDAHXEQ;")
	private Class1_Sub1_Sub3_Sub4 aClass1_Sub1_Sub3_Sub4_6;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
	private int anInt890;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "Lclient!TKCVVLIT;")
	private Class1_Sub1_Sub3_Sub3 aClass1_Sub1_Sub3_Sub3_6;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "Lclient!TKCVVLIT;")
	private Class1_Sub1_Sub3_Sub3 aClass1_Sub1_Sub3_Sub3_7;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "Lclient!TKCVVLIT;")
	private Class1_Sub1_Sub3_Sub3 aClass1_Sub1_Sub3_Sub3_8;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "Lclient!TKCVVLIT;")
	private Class1_Sub1_Sub3_Sub3 aClass1_Sub1_Sub3_Sub3_9;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "Lclient!TKCVVLIT;")
	private Class1_Sub1_Sub3_Sub3 aClass1_Sub1_Sub3_Sub3_10;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
	private int anInt893;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private int anInt894;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
	private int anInt895;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
	private int anInt896;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "I")
	private int anInt897;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
	private int anInt899;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "I")
	private int anInt900;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
	private int anInt901;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "Lclient!YOIXICCU;")
	private Class48 aClass48_12;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "Lclient!YOIXICCU;")
	private Class48 aClass48_13;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "Lclient!YOIXICCU;")
	private Class48 aClass48_14;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "Lclient!YOIXICCU;")
	private Class48 aClass48_15;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
	private int anInt902;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "Lclient!TKCVVLIT;")
	private Class1_Sub1_Sub3_Sub3 aClass1_Sub1_Sub3_Sub3_11;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "Lclient!TKCVVLIT;")
	private Class1_Sub1_Sub3_Sub3 aClass1_Sub1_Sub3_Sub3_12;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "Lclient!HFOJZUJK;")
	private Class11 aClass11_1;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
	private int anInt905;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
	private int anInt906;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
	private int anInt907;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
	private int anInt908;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
	private int anInt909;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
	private int anInt910;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "I")
	private int anInt911;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
	private int anInt913;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
	private int anInt915;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private int anInt916;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
	private int anInt918;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "[I")
	private int[] anIntArray239;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "[I")
	private int[] anIntArray240;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "[I")
	private int[] anIntArray241;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "I")
	private int anInt923;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "I")
	private int anInt924;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
	private int anInt925;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "I")
	private int anInt927;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "I")
	private int anInt928;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
	private int anInt930;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "Lclient!YZDAHXEQ;")
	private Class1_Sub1_Sub3_Sub4 aClass1_Sub1_Sub3_Sub4_7;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "Lclient!YZDAHXEQ;")
	private Class1_Sub1_Sub3_Sub4 aClass1_Sub1_Sub3_Sub4_8;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "Lclient!YZDAHXEQ;")
	private Class1_Sub1_Sub3_Sub4 aClass1_Sub1_Sub3_Sub4_9;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "Lclient!YZDAHXEQ;")
	private Class1_Sub1_Sub3_Sub4 aClass1_Sub1_Sub3_Sub4_10;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "Lclient!YZDAHXEQ;")
	private Class1_Sub1_Sub3_Sub4 aClass1_Sub1_Sub3_Sub4_11;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
	private int anInt932;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
	private int anInt934;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "[I")
	private int[] anIntArray246;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "[I")
	private int[] anIntArray247;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "[I")
	private int[] anIntArray248;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "[I")
	private int[] anIntArray249;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
	private int anInt936;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
	private int anInt937;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
	private int anInt938;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
	private int anInt939;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
	private int anInt940;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "Lclient!TKCVVLIT;")
	private Class1_Sub1_Sub3_Sub3 aClass1_Sub1_Sub3_Sub3_13;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "Lclient!TKCVVLIT;")
	private Class1_Sub1_Sub3_Sub3 aClass1_Sub1_Sub3_Sub3_14;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "Lclient!TKCVVLIT;")
	private Class1_Sub1_Sub3_Sub3 aClass1_Sub1_Sub3_Sub3_15;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "Lclient!TKCVVLIT;")
	private Class1_Sub1_Sub3_Sub3 aClass1_Sub1_Sub3_Sub3_16;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "Lclient!TKCVVLIT;")
	private Class1_Sub1_Sub3_Sub3 aClass1_Sub1_Sub3_Sub3_17;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "Lclient!YOIXICCU;")
	private Class48 aClass48_16;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "Lclient!YOIXICCU;")
	private Class48 aClass48_17;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "Lclient!YOIXICCU;")
	private Class48 aClass48_18;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "Lclient!YOIXICCU;")
	private Class48 aClass48_19;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "Lclient!YOIXICCU;")
	private Class48 aClass48_20;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "Lclient!YOIXICCU;")
	private Class48 aClass48_21;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "Lclient!YOIXICCU;")
	private Class48 aClass48_22;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "Lclient!YOIXICCU;")
	private Class48 aClass48_23;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "Lclient!YOIXICCU;")
	private Class48 aClass48_24;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
	private int anInt945;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
	private int anInt946;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
	private int anInt947;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
	private int anInt948;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
	private int anInt951;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "[I")
	private int[] anIntArray251;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "[I")
	private int[] anIntArray252;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "[I")
	private int[] anIntArray253;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "Lclient!TKCVVLIT;")
	private Class1_Sub1_Sub3_Sub3 aClass1_Sub1_Sub3_Sub3_18;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "Lclient!TKCVVLIT;")
	private Class1_Sub1_Sub3_Sub3 aClass1_Sub1_Sub3_Sub3_19;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "Lclient!TKCVVLIT;")
	private Class1_Sub1_Sub3_Sub3 aClass1_Sub1_Sub3_Sub3_20;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "Ljava/lang/String;")
	private String aString23;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "Lclient!YZDAHXEQ;")
	private Class1_Sub1_Sub3_Sub4 aClass1_Sub1_Sub3_Sub4_12;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "Lclient!YZDAHXEQ;")
	private Class1_Sub1_Sub3_Sub4 aClass1_Sub1_Sub3_Sub4_13;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "I")
	private int anInt955;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "Lclient!YOIXICCU;")
	private Class48 aClass48_25;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "Lclient!YOIXICCU;")
	private Class48 aClass48_26;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "Lclient!YOIXICCU;")
	private Class48 aClass48_27;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "Lclient!YZDAHXEQ;")
	private Class1_Sub1_Sub3_Sub4 aClass1_Sub1_Sub3_Sub4_14;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "I")
	private int anInt959;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "I")
	private int anInt960;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
	private int anInt961;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
	private int anInt963;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
	private int anInt969;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "Lclient!NEJZODYM;")
	private Class1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub3_Sub2_2;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "Lclient!NEJZODYM;")
	private Class1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub3_Sub2_3;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "Lclient!NEJZODYM;")
	private Class1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub3_Sub2_4;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "Lclient!NEJZODYM;")
	private Class1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub3_Sub2_5;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "Ljava/lang/String;")
	private String aString24;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
	private int anInt975;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "I")
	private int anInt976;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
	private int anInt978;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
	private int anInt979;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
	private int anInt980;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
	private int anInt981;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
	private int anInt982;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "Lclient!YZDAHXEQ;")
	private Class1_Sub1_Sub3_Sub4 aClass1_Sub1_Sub3_Sub4_15;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "I")
	private int anInt983;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
	private int anInt985;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
	private int anInt986;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private int anInt987;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
	private int anInt988;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "I")
	private int anInt989;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
	private int anInt990;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
	private int anInt992;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
	private int anInt995;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "I")
	private int anInt997;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "I")
	private int anInt998;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "I")
	private int anInt999;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "I")
	private int anInt1000;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
	private int anInt1001;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
	private int anInt1002;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
	private int anInt1003;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
	private int anInt1004;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "Lclient!YZDAHXEQ;")
	private Class1_Sub1_Sub3_Sub4 aClass1_Sub1_Sub3_Sub4_16;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "Lclient!PTSFQSMJ;")
	private Class32 aClass32_1;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "I")
	private int anInt1010;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "I")
	private int anInt1013;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "I")
	private int anInt1014;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "Lclient!MNPBQFWE;")
	private Class27 aClass27_1;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "I")
	private int anInt1018;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "I")
	private int anInt1019;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "I")
	private int anInt1020;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "I")
	private int anInt1021;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "[I")
	private int[] anIntArray272;

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "[I")
	private int[] anIntArray273;

	@OriginalMember(owner = "client!client", name = "Pj", descriptor = "I")
	private int anInt1024;

	@OriginalMember(owner = "client!client", name = "Qj", descriptor = "I")
	private int anInt1025;

	@OriginalMember(owner = "client!client", name = "Rj", descriptor = "I")
	private int anInt1026;

	@OriginalMember(owner = "client!client", name = "Sj", descriptor = "I")
	private int anInt1027;

	@OriginalMember(owner = "client!client", name = "Tj", descriptor = "Ljava/lang/String;")
	private String aString30;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "Z")
	private boolean aBoolean190 = false;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "Z")
	private boolean aBoolean191 = false;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "[Lclient!HUQCCBIO;")
	private Class13[] aClass13Array1 = new Class13[4];

	@OriginalMember(owner = "client!client", name = "O", descriptor = "I")
	private int anInt815 = -90;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "I")
	private int anInt816 = -1;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "[Lclient!MMZHRHUG;")
	public Class26[] aClass26Array1 = new Class26[5];

	@OriginalMember(owner = "client!client", name = "S", descriptor = "Z")
	private boolean aBoolean192 = false;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "Z")
	private boolean aBoolean193 = true;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "I")
	private int anInt818 = -1;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "[I")
	public int[] anIntArray212 = new int[2000];

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Z")
	private boolean aBoolean194 = true;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Lclient!BJPWOXRJ;")
	private Class1_Sub1_Sub2 aClass1_Sub1_Sub2_6 = Class1_Sub1_Sub2.method10((byte) 5);

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Z")
	private boolean aBoolean195 = true;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Z")
	private boolean aBoolean196 = false;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "[I")
	private int[] anIntArray213 = new int[151];

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "[Lclient!TKCVVLIT;")
	private Class1_Sub1_Sub3_Sub3[] aClass1_Sub1_Sub3_Sub3Array2 = new Class1_Sub1_Sub3_Sub3[100];

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	private int anInt823 = -1;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "[I")
	private int[] anIntArray214 = new int[50];

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Z")
	private boolean aBoolean197 = true;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "[I")
	private int[] anIntArray215 = new int[33];

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
	private int anInt826 = -41990;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Z")
	private boolean aBoolean198 = false;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "[I")
	private final int[] anIntArray216 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	private int anInt830 = 2;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "[Lclient!YZDAHXEQ;")
	private Class1_Sub1_Sub3_Sub4[] aClass1_Sub1_Sub3_Sub4Array4 = new Class1_Sub1_Sub3_Sub4[1000];

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "[I")
	private int[] anIntArray217 = new int[Class33.anInt544];

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
	private int anInt832 = 2;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
	private int anInt835 = 11341;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "B")
	private byte aByte31 = 9;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "Z")
	private boolean aBoolean199 = true;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
	private int anInt841 = 128;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "Lclient!BJPWOXRJ;")
	private Class1_Sub1_Sub2 aClass1_Sub1_Sub2_7 = Class1_Sub1_Sub2.method10((byte) 5);

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "Z")
	private boolean aBoolean200 = false;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "Lclient!RGZIHLRP;")
	private Class36 aClass36_10 = new Class36(anInt861);

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "Z")
	private boolean aBoolean201 = false;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "[Lclient!YZDAHXEQ;")
	private Class1_Sub1_Sub3_Sub4[] aClass1_Sub1_Sub3_Sub4Array5 = new Class1_Sub1_Sub3_Sub4[8];

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "B")
	private byte aByte32 = 99;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
	private int anInt856 = 893;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "Z")
	private boolean aBoolean203 = false;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "Z")
	private boolean aBoolean204 = false;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
	private int anInt860 = -37066;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "Lclient!BJPWOXRJ;")
	private Class1_Sub1_Sub2 aClass1_Sub1_Sub2_8 = new Class1_Sub1_Sub2(false, new byte[5000]);

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "[Lclient!HGVATLQF;")
	private Class1_Sub1_Sub1_Sub3_Sub1[] aClass1_Sub1_Sub1_Sub3_Sub1Array1 = new Class1_Sub1_Sub1_Sub3_Sub1[16384];

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "[I")
	private int[] anIntArray218 = new int[16384];

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "[I")
	private int[] anIntArray219 = new int[5];

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[200];

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "Z")
	private boolean aBoolean205 = false;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
	private int anInt867 = -31473;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "[I")
	private int[] anIntArray221 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "Z")
	private boolean aBoolean206 = false;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "[I")
	private int[] anIntArray222 = new int[33];

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "Z")
	private boolean aBoolean207 = false;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "[[[Lclient!RGZIHLRP;")
	private Class36[][][] aClass36ArrayArrayArray1 = new Class36[4][104][104];

	@OriginalMember(owner = "client!client", name = "id", descriptor = "Ljava/lang/String;")
	private String aString19 = "";

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "Z")
	private boolean aBoolean208 = false;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "Z")
	private boolean aBoolean209 = false;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "[I")
	private int[] anIntArray225 = new int[256];

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
	private int anInt876 = 1;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
	private final int anInt877 = 100;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "[I")
	private int[] anIntArray226 = new int[100];

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "B")
	private byte aByte33 = 99;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "B")
	private byte aByte34 = -5;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "Z")
	private boolean aBoolean210 = false;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "Z")
	private boolean aBoolean211 = true;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "Ljava/lang/String;")
	private String aString21 = "";

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "Ljava/lang/String;")
	private String aString22 = "";

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "[I")
	private int[] anIntArray227 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
	private int anInt889 = -153;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
	private int anInt891 = 50;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "[I")
	private int[] anIntArray228 = new int[this.anInt891];

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "[I")
	private int[] anIntArray229 = new int[this.anInt891];

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "[I")
	private int[] anIntArray230 = new int[this.anInt891];

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "[I")
	private int[] anIntArray231 = new int[this.anInt891];

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "[I")
	private int[] anIntArray232 = new int[this.anInt891];

	@OriginalMember(owner = "client!client", name = "be", descriptor = "[I")
	private int[] anIntArray233 = new int[this.anInt891];

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "[I")
	private int[] anIntArray234 = new int[this.anInt891];

	@OriginalMember(owner = "client!client", name = "de", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[this.anInt891];

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "I")
	private int anInt892 = -1;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "[I")
	private int[] anIntArray235 = new int[9];

	@OriginalMember(owner = "client!client", name = "le", descriptor = "B")
	private byte aByte35 = 9;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "[[I")
	private int[][] anIntArrayArray23 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "se", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "we", descriptor = "Z")
	private boolean aBoolean212 = false;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "[I")
	private int[] anIntArray236 = new int[5];

	@OriginalMember(owner = "client!client", name = "De", descriptor = "Z")
	private boolean aBoolean213 = false;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "B")
	private byte aByte36 = -128;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "B")
	private byte aByte37 = 39;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "Z")
	private boolean aBoolean214 = false;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[500];

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "Z")
	private boolean aBoolean215 = false;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "I")
	private int anInt914 = 3353893;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "[Lclient!YZDAHXEQ;")
	private Class1_Sub1_Sub3_Sub4[] aClass1_Sub1_Sub3_Sub4Array6 = new Class1_Sub1_Sub3_Sub4[20];

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "Z")
	private boolean aBoolean216 = true;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "[J")
	private long[] aLongArray4 = new long[200];

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private int anInt917 = 2301979;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "Z")
	private boolean aBoolean218 = false;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "Z")
	private boolean aBoolean219 = false;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "Z")
	private boolean aBoolean220 = true;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "Z")
	private boolean aBoolean221 = false;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "B")
	private byte aByte38 = 7;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "Lclient!BJPWOXRJ;")
	private Class1_Sub1_Sub2 aClass1_Sub1_Sub2_9 = Class1_Sub1_Sub2.method10((byte) 5);

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "[I")
	private int[] anIntArray238 = new int[1000];

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
	private int anInt919 = 620;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "B")
	private byte aByte39 = 0;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
	private int anInt922 = -1;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
	private int anInt929 = -1;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "[I")
	private int[] anIntArray242 = new int[5];

	@OriginalMember(owner = "client!client", name = "If", descriptor = "Z")
	private boolean aBoolean222 = false;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "[I")
	private int[] anIntArray243 = new int[5];

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "[I")
	private int[] anIntArray244 = new int[200];

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private int anInt935 = -1;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "[I")
	private int[] anIntArray245 = new int[151];

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "Z")
	private boolean aBoolean223 = false;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "Lclient!RGZIHLRP;")
	private Class36 aClass36_11 = new Class36(anInt861);

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
	private int anInt942 = 529;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
	private int anInt943 = 5063219;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "Lclient!ETSIPTYG;")
	private Class6 aClass6_1 = new Class6();

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "Z")
	private boolean aBoolean224 = true;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
	private int anInt944 = -863;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "[Lclient!TKCVVLIT;")
	private Class1_Sub1_Sub3_Sub3[] aClass1_Sub1_Sub3_Sub3Array4 = new Class1_Sub1_Sub3_Sub3[13];

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
	private int anInt952 = 1;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "[I")
	private int[] anIntArray250 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "Z")
	private boolean aBoolean226 = false;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "Z")
	private boolean aBoolean227 = false;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "I")
	private int anInt954 = -156;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "[I")
	private int[] anIntArray254 = new int[50];

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "[I")
	private int[] anIntArray255 = new int[7];

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "I")
	private int anInt957 = 2048;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "I")
	private int anInt958 = 2047;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "[Lclient!QVUHZTUC;")
	private Class1_Sub1_Sub1_Sub3_Sub2[] aClass1_Sub1_Sub1_Sub3_Sub2Array1 = new Class1_Sub1_Sub1_Sub3_Sub2[this.anInt957];

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "[I")
	private int[] anIntArray256 = new int[this.anInt957];

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "[I")
	private int[] anIntArray257 = new int[this.anInt957];

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "[Lclient!BJPWOXRJ;")
	private Class1_Sub1_Sub2[] aClass1_Sub1_Sub2Array1 = new Class1_Sub1_Sub2[this.anInt957];

	@OriginalMember(owner = "client!client", name = "th", descriptor = "I")
	private int anInt962 = 1;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "[I")
	private int[] anIntArray258 = new int[100];

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[100];

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[100];

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "I")
	private int anInt966 = 8;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "[I")
	private int[] anIntArray259 = new int[Class33.anInt544];

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "I")
	private int anInt967 = -1;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "[Lclient!TKCVVLIT;")
	private Class1_Sub1_Sub3_Sub3[] aClass1_Sub1_Sub3_Sub3Array5 = new Class1_Sub1_Sub3_Sub3[2];

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "Z")
	private boolean aBoolean231 = false;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "[I")
	private int[] anIntArray260 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "[I")
	private int[] anIntArray261 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "B")
	private byte aByte40 = -116;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "B")
	private byte aByte41 = 0;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "I")
	private int anInt971 = 78;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "Z")
	private boolean aBoolean233 = true;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "Ljava/lang/String;")
	private String aString25 = "";

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
	private int anInt991 = -1;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "[I")
	private int[] anIntArray262 = new int[1000];

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "[I")
	private int[] anIntArray263 = new int[1000];

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
	private int anInt993 = 9;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
	private int anInt994 = 3;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "[I")
	private int[] anIntArray264 = new int[5];

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "Ljava/lang/String;")
	private String aString26 = "";

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "[Lclient!YZDAHXEQ;")
	private Class1_Sub1_Sub3_Sub4[] aClass1_Sub1_Sub3_Sub4Array7 = new Class1_Sub1_Sub3_Sub4[100];

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "B")
	private byte aByte42 = 1;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "B")
	private byte aByte43 = 3;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "Ljava/lang/String;")
	private String aString27 = "";

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "Ljava/lang/String;")
	private String aString28 = "";

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private int anInt1005 = -1;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "Z")
	public boolean aBoolean234 = false;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "B")
	private byte aByte44 = 48;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "[I")
	private int[] anIntArray266 = new int[Class33.anInt544];

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
	private int anInt1008 = -1;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
	private int anInt1011 = 2;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "Z")
	private boolean aBoolean235 = true;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "B")
	private byte aByte45 = -5;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "I")
	private int anInt1012 = 7759444;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "[I")
	private int[] anIntArray267 = new int[50];

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "Ljava/lang/String;")
	private String aString29 = "";

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
	private int anInt1016 = -1;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "I")
	private int anInt1017 = -1;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[5];

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "[I")
	private int[] anIntArray268 = new int[500];

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "[I")
	private int[] anIntArray269 = new int[500];

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "[I")
	private int[] anIntArray270 = new int[500];

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "[I")
	private int[] anIntArray271 = new int[500];

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "Lclient!RGZIHLRP;")
	private Class36 aClass36_12 = new Class36(anInt861);

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "I")
	private int anInt1022 = -1;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "Z")
	private boolean aBoolean236 = true;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "Z")
	private boolean aBoolean237 = false;

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "[Lclient!YZDAHXEQ;")
	private Class1_Sub1_Sub3_Sub4[] aClass1_Sub1_Sub3_Sub4Array8 = new Class1_Sub1_Sub3_Sub4[20];

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "Z")
	private boolean aBoolean238 = false;

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "Z")
	private boolean aBoolean239 = false;

	@OriginalMember(owner = "client!client", name = "Uj", descriptor = "Z")
	private boolean aBoolean240 = false;

	static {
		@Pc(275) int local275 = 2;
		@Pc(277) int local277;
		for (local277 = 0; local277 < 32; local277++) {
			anIntArray220[local277] = local275 - 1;
			local275 += local275;
		}
		anIntArray237 = new int[99];
		local275 = 0;
		for (local277 = 0; local277 < 99; local277++) {
			@Pc(304) int local304 = local277 + 1;
			@Pc(317) int local317 = (int) ((double) local304 + Math.pow(2.0D, (double) local304 / 7.0D) * 300.0D);
			local275 += local317;
			anIntArray237[local277] = local275 / 4;
		}
		anInt920 = -832;
		aBoolean228 = true;
		anInt964 = 10;
		aBoolean229 = true;
		anIntArray265 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		aByte46 = 6;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)Ljava/lang/String;")
	private static String method575(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("22970, " + true + ", " + arg0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private static void method577() {
		try {
			Class11.aBoolean53 = true;
			Class1_Sub1_Sub3_Sub1.aBoolean32 = true;
			aBoolean230 = true;
			Class39.aBoolean157 = true;
			Class22.aBoolean106 = true;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("32678, " + 0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)Ljava/lang/String;")
	private static String method637(@OriginalArg(1) int arg0) {
		try {
			@Pc(11) String local11 = String.valueOf(arg0);
			for (@Pc(16) int local16 = local11.length() - 3; local16 > 0; local16 -= 3) {
				local11 = local11.substring(0, local16) + "," + local11.substring(local16);
			}
			if (local11.length() > 8) {
				local11 = "@gre@" + local11.substring(0, local11.length() - 8) + " million @whi@(" + local11 + ")";
			} else if (local11.length() > 4) {
				local11 = "@cya@" + local11.substring(0, local11.length() - 4) + "K @whi@(" + local11 + ")";
			}
			return " " + local11;
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("28291, " + -45360 + ", " + arg0 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 306);
			if (arg0.length == 5) {
				anInt964 = Integer.parseInt(arg0[0]);
				anInt965 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method577();
				} else if (arg0[2].equals("highmem")) {
					method672();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean229 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean229 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt1030 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method539();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
	private static void method672() {
		try {
			Class11.aBoolean53 = false;
			Class1_Sub1_Sub3_Sub1.aBoolean32 = false;
			aBoolean230 = false;
			Class39.aBoolean157 = false;
			Class22.aBoolean106 = false;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("3721, " + 5 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BII)Ljava/lang/String;")
	private static String method673(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) int local4;
			if (arg0 != -116) {
				for (local4 = 1; local4 > 0; local4++) {
				}
			}
			local4 = arg2 - arg1;
			if (local4 < -9) {
				return "@red@";
			} else if (local4 < -6) {
				return "@or3@";
			} else if (local4 < -3) {
				return "@or2@";
			} else if (local4 < 0) {
				return "@or1@";
			} else if (local4 > 9) {
				return "@gre@";
			} else if (local4 > 6) {
				return "@gr3@";
			} else if (local4 > 3) {
				return "@gr2@";
			} else if (local4 > 0) {
				return "@gr1@";
			} else {
				return "@yel@";
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("53491, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BJ)V")
	private void method552(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt953 >= 100) {
					this.method607("Your ignore list is full. Max of 100 hit", "", (byte) 1, 0);
				} else {
					@Pc(23) String local23 = Class31.method383(Class31.method380(arg0));
					for (@Pc(29) int local29 = 0; local29 < this.anInt953; local29++) {
						if (this.aLongArray3[local29] == arg0) {
							this.method607(local23 + " is already on your ignore list", "", (byte) 1, 0);
							return;
						}
					}
					for (@Pc(59) int local59 = 0; local59 < this.anInt887; local59++) {
						if (this.aLongArray4[local59] == arg0) {
							this.method607("Please remove " + local23 + " from your friend list first", "", (byte) 1, 0);
							return;
						}
					}
					this.aLongArray3[this.anInt953++] = arg0;
					this.aBoolean203 = true;
					this.aClass1_Sub1_Sub2_7.method11(38);
					this.aClass1_Sub1_Sub2_7.method18(arg0);
				}
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("4193, " + 61 + ", " + arg0 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method553(@OriginalArg(0) int arg0) {
		try {
			signlink.anInt1037 = arg0;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("38435, " + arg0 + ", " + 5 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	private void method554() {
		try {
			signlink.anInt1035 = 0;
			signlink.midi = "stop";
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("74679, " + 0 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method555(@OriginalArg(0) boolean arg0) {
		try {
			if (aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt573 >> 7 == this.anInt981 && aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt574 >> 7 == this.anInt982) {
				this.anInt981 = 0;
				anInt1015++;
				if (anInt1015 > 66) {
					anInt1015 = 0;
					this.aClass1_Sub1_Sub2_7.method11(248);
				}
			}
			@Pc(35) int local35 = this.anInt959;
			if (arg0) {
				local35 = 1;
			}
			for (@Pc(41) int local41 = 0; local41 < local35; local41++) {
				@Pc(47) Class1_Sub1_Sub1_Sub3_Sub2 local47;
				@Pc(52) int local52;
				if (arg0) {
					local47 = aClass1_Sub1_Sub1_Sub3_Sub2_1;
					local52 = this.anInt958 << 14;
				} else {
					local47 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[this.anIntArray256[local41]];
					local52 = this.anIntArray256[local41] << 14;
				}
				if (local47 != null && local47.method389()) {
					local47.aBoolean145 = false;
					if ((aBoolean230 && this.anInt959 > 50 || this.anInt959 > 200) && !arg0 && local47.anInt583 == local47.anInt598) {
						local47.aBoolean145 = true;
					}
					@Pc(103) int local103 = local47.anInt573 >> 7;
					@Pc(108) int local108 = local47.anInt574 >> 7;
					if (local103 >= 0 && local103 < 104 && local108 >= 0 && local108 < 104) {
						if (local47.aClass1_Sub1_Sub1_Sub4_2 == null || anInt921 < local47.anInt614 || anInt921 >= local47.anInt615) {
							if ((local47.anInt573 & 0x7F) == 64 && (local47.anInt574 & 0x7F) == 64) {
								if (this.anIntArrayArray24[local103][local108] == this.anInt1014) {
									continue;
								}
								this.anIntArrayArray24[local103][local108] = this.anInt1014;
							}
							local47.anInt616 = this.method612(local47.anInt573, 938, local47.anInt574, this.anInt857);
							this.aClass11_1.method146(60, local47, this.anInt857, local52, local47.anInt616, local47.anInt575, local47.anInt573, local47.anInt574, local47.aBoolean142);
						} else {
							local47.aBoolean145 = false;
							local47.anInt616 = this.method612(local47.anInt573, 938, local47.anInt574, this.anInt857);
							this.aClass11_1.method147(local47.anInt573, local47.anInt606, this.anInt857, local47.anInt609, local47.anInt575, local47.anInt607, local47.anInt616, local52, local47, local47.anInt574, local47.anInt608);
						}
					}
				}
			}
			this.anInt905 += 0;
		} catch (@Pc(243) RuntimeException local243) {
			signlink.reporterror("47778, " + arg0 + ", " + 0 + ", " + local243.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)Ljava/lang/String;")
	private String method556() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("32220, " + 120 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method557() {
		try {
			@Pc(6) int local6 = this.anInt947 * 128 + 64;
			@Pc(13) int local13 = this.anInt948 * 128 + 64;
			@Pc(24) int local24 = this.method612(local6, 938, local13, this.anInt857) - this.anInt949;
			if (this.anInt973 < local6) {
				this.anInt973 += this.anInt950 + (local6 - this.anInt973) * this.anInt951 / 1000;
				if (this.anInt973 > local6) {
					this.anInt973 = local6;
				}
			}
			if (this.anInt973 > local6) {
				this.anInt973 -= this.anInt950 + (this.anInt973 - local6) * this.anInt951 / 1000;
				if (this.anInt973 < local6) {
					this.anInt973 = local6;
				}
			}
			if (this.anInt974 < local24) {
				this.anInt974 += this.anInt950 + (local24 - this.anInt974) * this.anInt951 / 1000;
				if (this.anInt974 > local24) {
					this.anInt974 = local24;
				}
			}
			if (this.anInt974 > local24) {
				this.anInt974 -= this.anInt950 + (this.anInt974 - local24) * this.anInt951 / 1000;
				if (this.anInt974 < local24) {
					this.anInt974 = local24;
				}
			}
			if (this.anInt975 < local13) {
				this.anInt975 += this.anInt950 + (local13 - this.anInt975) * this.anInt951 / 1000;
				if (this.anInt975 > local13) {
					this.anInt975 = local13;
				}
			}
			if (this.anInt975 > local13) {
				this.anInt975 -= this.anInt950 + (this.anInt975 - local13) * this.anInt951 / 1000;
				if (this.anInt975 < local13) {
					this.anInt975 = local13;
				}
			}
			local6 = this.anInt923 * 128 + 64;
			local13 = this.anInt924 * 128 + 64;
			local24 = this.method612(local6, 938, local13, this.anInt857) - this.anInt925;
			@Pc(222) int local222 = local6 - this.anInt973;
			@Pc(227) int local227 = local24 - this.anInt974;
			@Pc(232) int local232 = local13 - this.anInt975;
			@Pc(243) int local243 = (int) Math.sqrt((double) (local222 * local222 + local232 * local232));
			@Pc(254) int local254 = (int) (Math.atan2((double) local227, (double) local243) * 325.949D) & 0x7FF;
			@Pc(273) int local273 = (int) (Math.atan2((double) local222, (double) local232) * -325.949D) & 0x7FF;
			if (local254 < 128) {
				local254 = 128;
			}
			if (local254 > 383) {
				local254 = 383;
			}
			if (this.anInt976 < local254) {
				this.anInt976 += this.anInt926 + (local254 - this.anInt976) * this.anInt927 / 1000;
				if (this.anInt976 > local254) {
					this.anInt976 = local254;
				}
			}
			if (this.anInt976 > local254) {
				this.anInt976 -= this.anInt926 + (this.anInt976 - local254) * this.anInt927 / 1000;
				if (this.anInt976 < local254) {
					this.anInt976 = local254;
				}
			}
			@Pc(344) int local344 = local273 - this.anInt977;
			if (local344 > 1024) {
				local344 -= 2048;
			}
			if (local344 < -1024) {
				local344 += 2048;
			}
			if (local344 > 0) {
				this.anInt977 += this.anInt926 + local344 * this.anInt927 / 1000;
				this.anInt977 &= 0x7FF;
			}
			if (local344 < 0) {
				this.anInt977 -= this.anInt926 + -local344 * this.anInt927 / 1000;
				this.anInt977 &= 0x7FF;
			}
			@Pc(402) int local402 = local273 - this.anInt977;
			if (local402 > 1024) {
				local402 -= 2048;
			}
			if (local402 < -1024) {
				local402 += 2048;
			}
			if (local402 < 0 && local344 > 0 || local402 > 0 && local344 < 0) {
				this.anInt977 = local273;
			}
		} catch (@Pc(423) RuntimeException local423) {
			signlink.reporterror("34023, " + 6 + ", " + local423.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method558(@OriginalArg(0) int arg0) {
		try {
			@Pc(22) int local22;
			@Pc(50) int local50;
			@Pc(54) int local54;
			@Pc(63) int local63;
			@Pc(70) int local70;
			@Pc(133) int local133;
			@Pc(190) int local190;
			try {
				this.anInt1022 = -1;
				this.aClass36_11.method404();
				this.aClass36_10.method404();
				Class1_Sub1_Sub3_Sub1.method103(this.aByte35);
				this.method659();
				this.aClass11_1.method135();
				for (local22 = 0; local22 < 4; local22++) {
					this.aClass13Array1[local22].method205();
				}
				System.gc();
				@Pc(46) Class39 local46 = new Class39(this.aByteArrayArrayArray8, 7, 104, this.anIntArrayArrayArray7, 104);
				local50 = this.aByteArrayArray4.length;
				Class39.aBoolean157 = Class11.aBoolean53;
				for (local54 = 0; local54 < local50; local54++) {
					local63 = this.anIntArray251[local54] >> 8;
					local70 = this.anIntArray251[local54] & 0xFF;
					if (local63 == 33 && local70 >= 71 && local70 <= 73) {
						Class39.aBoolean157 = false;
					}
				}
				if (Class39.aBoolean157) {
					this.aClass11_1.method136(this.anInt857);
				} else {
					this.aClass11_1.method136(0);
				}
				this.aClass1_Sub1_Sub2_7.method11(21);
				@Pc(138) byte[] local138;
				for (local63 = 0; local63 < local50; local63++) {
					local70 = (this.anIntArray251[local63] >> 8) * 64 - this.anInt931;
					local133 = (this.anIntArray251[local63] & 0xFF) * 64 - this.anInt932;
					local138 = this.aByteArrayArray4[local63];
					if (local138 != null) {
						local46.method436((this.anInt910 - 6) * 8, local138, (this.anInt911 - 6) * 8, local70, local133);
					}
				}
				for (local70 = 0; local70 < local50; local70++) {
					local133 = (this.anIntArray251[local70] >> 8) * 64 - this.anInt931;
					local190 = (this.anIntArray251[local70] & 0xFF) * 64 - this.anInt932;
					@Pc(195) byte[] local195 = this.aByteArrayArray4[local70];
					if (local195 == null && this.anInt911 < 800) {
						local46.method440(local190, local133);
					}
				}
				this.aClass1_Sub1_Sub2_7.method11(21);
				@Pc(240) int local240;
				for (local133 = 0; local133 < local50; local133++) {
					local138 = this.aByteArrayArray5[local133];
					if (local138 != null) {
						local240 = (this.anIntArray251[local133] >> 8) * 64 - this.anInt931;
						@Pc(252) int local252 = (this.anIntArray251[local133] & 0xFF) * 64 - this.anInt932;
						local46.method429(local252, local138, local240, this.aClass13Array1, this.aClass11_1);
					}
				}
				this.aClass1_Sub1_Sub2_7.method11(21);
				local46.method439(this.aClass11_1, this.aClass13Array1);
				this.aClass48_14.method503();
				this.aClass1_Sub1_Sub2_7.method11(21);
				for (local190 = 0; local190 < 104; local190++) {
					for (local240 = 0; local240 < 104; local240++) {
						this.method561(local190, local240);
					}
				}
				this.method644();
			} catch (@Pc(312) Exception local312) {
			}
			Class22.aClass15_4.method224();
			@Pc(326) int local326;
			if (aBoolean230 && signlink.aRandomAccessFile3 != null) {
				local22 = this.aClass7_Sub1_1.method53(0, aByte46);
				for (local326 = 0; local326 < local22; local326++) {
					local50 = this.aClass7_Sub1_1.method52(local326);
					if ((local50 & 0x79) == 0) {
						Class1_Sub1_Sub1_Sub4.method238(556, local326);
					}
				}
			}
			System.gc();
			Class1_Sub1_Sub3_Sub1.method104();
			this.aClass7_Sub1_1.method61();
			local22 = (this.anInt910 - 6) / 8 - 1;
			local326 = (this.anInt910 + 6) / 8 + 1;
			local50 = (this.anInt911 - 6) / 8 - 1;
			local54 = (this.anInt911 + 6) / 8 + 1;
			@Pc(393) boolean local393 = false;
			if (this.aBoolean218) {
				local22 = 49;
				local326 = 50;
				local50 = 49;
				local54 = 50;
			}
			for (local63 = local22; local63 <= local326; local63++) {
				for (local70 = local50; local70 <= local54; local70++) {
					if (local63 == local22 || local63 == local326 || local70 == local50 || local70 == local54) {
						local133 = this.aClass7_Sub1_1.method68(local63, local70, 0);
						if (local133 != -1) {
							this.aClass7_Sub1_1.method50(local133, 3);
						}
						local190 = this.aClass7_Sub1_1.method68(local63, local70, 1);
						if (local190 != -1) {
							this.aClass7_Sub1_1.method50(local190, 3);
						}
					}
				}
			}
		} catch (@Pc(468) RuntimeException local468) {
			signlink.reporterror("73118, " + arg0 + ", " + local468.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[BB)Z")
	private boolean method559(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			if (this.aByte41 != 0) {
				anInt861 = 123;
			}
			return arg1 == null ? true : signlink.wavesave(arg1, arg0);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("48253, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	private boolean method560(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(16) int local16 = 0; local16 < this.anInt887; local16++) {
				if (arg0.equalsIgnoreCase(this.aStringArray8[local16])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass1_Sub1_Sub1_Sub3_Sub2_1.aString15);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("65679, " + arg0 + ", " + -17594 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class36 local9 = this.aClass36ArrayArrayArray1[this.anInt857][arg0][arg1];
		if (local9 == null) {
			this.aClass11_1.method156(this.anInt857, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub1_Sub1_Sub6 local23 = null;
		@Pc(27) Class1_Sub1_Sub1_Sub6 local27;
		for (local27 = (Class1_Sub1_Sub1_Sub6) local9.method400(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub6) local9.method402((byte) 2)) {
			@Pc(32) Class23 local32 = Class23.method320(local27.anInt768);
			@Pc(35) int local35 = local32.anInt438;
			if (local32.aBoolean113) {
				local35 *= local27.anInt769 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method398(local23);
		@Pc(65) Class1_Sub1_Sub1_Sub6 local65 = null;
		@Pc(67) Class1_Sub1_Sub1_Sub6 local67 = null;
		for (local27 = (Class1_Sub1_Sub1_Sub6) local9.method400(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub6) local9.method402((byte) 2)) {
			if (local27.anInt768 != local23.anInt768 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt768 != local23.anInt768 && local27.anInt768 != local65.anInt768 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass11_1.method142(arg1, local110, arg0, local65, local67, local23, this.method612(arg0 * 128 + 64, 938, arg1 * 128 + 64, this.anInt857), this.anInt857);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!RRZTMHXJ;BI)V")
	private void method562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class38 arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg3 != this.aByte45) {
				for (@Pc(7) int local7 = 1; local7 > 0; local7++) {
				}
			}
			if (this.anInt916 < 400) {
				if (arg2.anIntArray165 != null) {
					arg2 = arg2.method416(this.anInt867);
				}
				if (arg2 != null) {
					@Pc(31) String local31 = arg2.aString16;
					if (arg2.anInt637 != 0) {
						local31 = local31 + method673(this.aByte40, arg2.anInt637, aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt613) + " (level-" + arg2.anInt637 + ")";
					}
					if (this.anInt1024 == 1) {
						this.aStringArray10[this.anInt916] = "Use " + this.aString30 + " with @yel@" + local31;
						this.anIntArray270[this.anInt916] = 231;
						this.anIntArray271[this.anInt916] = arg0;
						this.anIntArray268[this.anInt916] = arg4;
						this.anIntArray269[this.anInt916] = arg1;
						this.anInt916++;
					} else if (this.anInt872 != 1) {
						@Pc(170) int local170;
						if (arg2.aStringArray7 != null) {
							for (local170 = 4; local170 >= 0; local170--) {
								if (arg2.aStringArray7[local170] != null && !arg2.aStringArray7[local170].equalsIgnoreCase("attack")) {
									this.aStringArray10[this.anInt916] = arg2.aStringArray7[local170] + " @yel@" + local31;
									if (local170 == 0) {
										this.anIntArray270[this.anInt916] = 101;
									}
									if (local170 == 1) {
										this.anIntArray270[this.anInt916] = 458;
									}
									if (local170 == 2) {
										this.anIntArray270[this.anInt916] = 766;
									}
									if (local170 == 3) {
										this.anIntArray270[this.anInt916] = 595;
									}
									if (local170 == 4) {
										this.anIntArray270[this.anInt916] = 687;
									}
									this.anIntArray271[this.anInt916] = arg0;
									this.anIntArray268[this.anInt916] = arg4;
									this.anIntArray269[this.anInt916] = arg1;
									this.anInt916++;
								}
							}
						}
						if (arg2.aStringArray7 != null) {
							for (local170 = 4; local170 >= 0; local170--) {
								if (arg2.aStringArray7[local170] != null && arg2.aStringArray7[local170].equalsIgnoreCase("attack")) {
									@Pc(294) short local294 = 0;
									if (arg2.anInt637 > aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt613) {
										local294 = 2000;
									}
									this.aStringArray10[this.anInt916] = arg2.aStringArray7[local170] + " @yel@" + local31;
									if (local170 == 0) {
										this.anIntArray270[this.anInt916] = local294 + 101;
									}
									if (local170 == 1) {
										this.anIntArray270[this.anInt916] = local294 + 458;
									}
									if (local170 == 2) {
										this.anIntArray270[this.anInt916] = local294 + 766;
									}
									if (local170 == 3) {
										this.anIntArray270[this.anInt916] = local294 + 595;
									}
									if (local170 == 4) {
										this.anIntArray270[this.anInt916] = local294 + 687;
									}
									this.anIntArray271[this.anInt916] = arg0;
									this.anIntArray268[this.anInt916] = arg4;
									this.anIntArray269[this.anInt916] = arg1;
									this.anInt916++;
								}
							}
						}
						this.aStringArray10[this.anInt916] = "Examine @yel@" + local31;
						this.anIntArray270[this.anInt916] = 1195;
						this.anIntArray271[this.anInt916] = arg0;
						this.anIntArray268[this.anInt916] = arg4;
						this.anIntArray269[this.anInt916] = arg1;
						this.anInt916++;
					} else if ((this.anInt874 & 0x2) == 2) {
						this.aStringArray10[this.anInt916] = this.aString20 + " @yel@" + local31;
						this.anIntArray270[this.anInt916] = 480;
						this.anIntArray271[this.anInt916] = arg0;
						this.anIntArray268[this.anInt916] = arg4;
						this.anIntArray269[this.anInt916] = arg1;
						this.anInt916++;
						return;
					}
				}
			}
		} catch (@Pc(444) RuntimeException local444) {
			signlink.reporterror("2890, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local444.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method563(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean219) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.method643(43595);
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

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method564() {
		try {
			if (this.anInt916 >= 2 || this.anInt1024 != 0 || this.anInt872 != 0) {
				@Pc(31) String local31;
				if (this.anInt1024 == 1 && this.anInt916 < 2) {
					local31 = "Use " + this.aString30 + " with...";
				} else if (this.anInt872 == 1 && this.anInt916 < 2) {
					local31 = this.aString20 + "...";
				} else {
					local31 = this.aStringArray10[this.anInt916 - 1];
				}
				if (this.anInt916 > 2) {
					local31 = local31 + "@whi@ / " + (this.anInt916 - 2) + " more options";
				}
				this.aClass1_Sub1_Sub3_Sub2_4.method365(anInt921 / 1000, local31, 15, 4, 16777215);
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("35108, " + 50 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method565() {
		try {
			this.aClass1_Sub1_Sub3_Sub3_4 = new Class1_Sub1_Sub3_Sub3(this.aClass27_1, "titlebox", 0);
			this.aClass1_Sub1_Sub3_Sub3_5 = new Class1_Sub1_Sub3_Sub3(this.aClass27_1, "titlebutton", 0);
			this.aClass1_Sub1_Sub3_Sub3Array3 = new Class1_Sub1_Sub3_Sub3[12];
			@Pc(30) int local30 = 0;
			try {
				local30 = Integer.parseInt(this.getParameter("fl_icon"));
			} catch (@Pc(37) Exception local37) {
			}
			@Pc(41) int local41;
			if (local30 == 0) {
				for (local41 = 0; local41 < 12; local41++) {
					this.aClass1_Sub1_Sub3_Sub3Array3[local41] = new Class1_Sub1_Sub3_Sub3(this.aClass27_1, "runes", local41);
				}
			} else {
				for (local41 = 0; local41 < 12; local41++) {
					this.aClass1_Sub1_Sub3_Sub3Array3[local41] = new Class1_Sub1_Sub3_Sub3(this.aClass27_1, "runes", (local41 & 0x3) + 12);
				}
			}
			this.aClass1_Sub1_Sub3_Sub4_3 = new Class1_Sub1_Sub3_Sub4(128, 265);
			this.aClass1_Sub1_Sub3_Sub4_4 = new Class1_Sub1_Sub3_Sub4(128, 265);
			for (local41 = 0; local41 < 33920; local41++) {
				this.aClass1_Sub1_Sub3_Sub4_3.anIntArray209[local41] = this.aClass48_6.anIntArray207[local41];
			}
			for (@Pc(117) int local117 = 0; local117 < 33920; local117++) {
				this.aClass1_Sub1_Sub3_Sub4_4.anIntArray209[local117] = this.aClass48_7.anIntArray207[local117];
			}
			this.anIntArray247 = new int[256];
			for (@Pc(139) int local139 = 0; local139 < 64; local139++) {
				this.anIntArray247[local139] = local139 * 262144;
			}
			for (@Pc(154) int local154 = 0; local154 < 64; local154++) {
				this.anIntArray247[local154 + 64] = local154 * 1024 + 16711680;
			}
			for (@Pc(173) int local173 = 0; local173 < 64; local173++) {
				this.anIntArray247[local173 + 128] = local173 * 4 + 16776960;
			}
			for (@Pc(192) int local192 = 0; local192 < 64; local192++) {
				this.anIntArray247[local192 + 192] = 16777215;
			}
			this.anIntArray248 = new int[256];
			for (@Pc(211) int local211 = 0; local211 < 64; local211++) {
				this.anIntArray248[local211] = local211 * 1024;
			}
			for (@Pc(226) int local226 = 0; local226 < 64; local226++) {
				this.anIntArray248[local226 + 64] = local226 * 4 + 65280;
			}
			for (@Pc(245) int local245 = 0; local245 < 64; local245++) {
				this.anIntArray248[local245 + 128] = local245 * 262144 + 65535;
			}
			for (@Pc(264) int local264 = 0; local264 < 64; local264++) {
				this.anIntArray248[local264 + 192] = 16777215;
			}
			this.anIntArray249 = new int[256];
			for (@Pc(283) int local283 = 0; local283 < 64; local283++) {
				this.anIntArray249[local283] = local283 * 4;
			}
			for (@Pc(298) int local298 = 0; local298 < 64; local298++) {
				this.anIntArray249[local298 + 64] = local298 * 262144 + 255;
			}
			for (@Pc(317) int local317 = 0; local317 < 64; local317++) {
				this.anIntArray249[local317 + 128] = local317 * 1024 + 16711935;
			}
			for (@Pc(336) int local336 = 0; local336 < 64; local336++) {
				this.anIntArray249[local336 + 192] = 16777215;
			}
			this.anIntArray246 = new int[256];
			this.anIntArray223 = new int[32768];
			this.anIntArray224 = new int[32768];
			this.method610(null);
			this.anIntArray272 = new int[32768];
			this.anIntArray273 = new int[32768];
			this.method551("Connecting to fileserver", 10);
			if (!this.aBoolean201) {
				this.aBoolean225 = true;
				this.aBoolean201 = true;
				this.method550(this, 2);
			}
		} catch (@Pc(393) RuntimeException local393) {
			signlink.reporterror("69064, " + true + ", " + local393.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method566() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt959; local3++) {
				if (local3 == -1) {
					local11 = this.anInt958;
				} else {
					local11 = this.anIntArray256[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub3_Sub2 local23 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local11];
				if (local23 != null && local23.anInt596 > 0) {
					local23.anInt596--;
					if (local23.anInt596 == 0) {
						local23.aString14 = null;
					}
				}
			}
			for (local11 = 0; local11 < this.anInt863; local11++) {
				@Pc(65) int local65 = this.anIntArray218[local11];
				@Pc(70) Class1_Sub1_Sub1_Sub3_Sub1 local70 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local65];
				if (local70 != null && local70.anInt596 > 0) {
					local70.anInt596--;
					if (local70.anInt596 == 0) {
						local70.aString14 = null;
					}
				}
			}
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("64987, " + -615 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method548() {
		try {
			this.aBoolean231 = true;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("46144, " + 3 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method567(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 == 3) {
				@Pc(6) boolean local6 = false;
			} else {
				this.aClass1_Sub1_Sub2_7.method12(70);
			}
			if (arg1 >= 0) {
				if (this.aBoolean214) {
					this.aBoolean214 = false;
					this.aBoolean205 = true;
				}
				@Pc(29) int local29 = this.anIntArray268[arg1];
				@Pc(34) int local34 = this.anIntArray269[arg1];
				@Pc(39) int local39 = this.anIntArray270[arg1];
				@Pc(44) int local44 = this.anIntArray271[arg1];
				if (local39 >= 2000) {
					local39 -= 2000;
				}
				@Pc(65) String local65;
				@Pc(69) int local69;
				@Pc(80) long local80;
				if (local39 == 927 || local39 == 266 || local39 == 361 || local39 == 801) {
					local65 = this.aStringArray10[arg1];
					local69 = local65.indexOf("@whi@");
					if (local69 != -1) {
						local80 = Class31.method379(local65.substring(local69 + 5).trim());
						if (local39 == 927) {
							this.method569(local80, this.aBoolean235);
						}
						if (local39 == 266) {
							this.method552(local80);
						}
						if (local39 == 361) {
							this.method647(local80, this.anInt954);
						}
						if (local39 == 801) {
							this.method590(local80);
						}
					}
				}
				@Pc(118) Class1_Sub1_Sub1_Sub3_Sub2 local118;
				if (local39 == 149) {
					local118 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local44];
					if (local118 != null) {
						this.method652(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0], aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0], 0, local118.anIntArray155[0], 1, 303, 0, false, 1, local118.anIntArray156[0], 0, 2);
						this.anInt883 = super.anInt810;
						this.anInt884 = super.anInt811;
						this.anInt886 = 2;
						this.anInt885 = 0;
						this.aClass1_Sub1_Sub2_7.method11(101);
						this.aClass1_Sub1_Sub2_7.method13(local44);
					}
				}
				@Pc(194) boolean local194;
				if (local39 == 109) {
					local194 = this.method652(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0], aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0], 0, local29, 0, 303, 0, false, 0, local34, 0, 2);
					if (!local194) {
						this.method652(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0], aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0], 0, local29, 1, 303, 0, false, 1, local34, 0, 2);
					}
					this.anInt883 = super.anInt810;
					this.anInt884 = super.anInt811;
					this.anInt886 = 2;
					this.anInt885 = 0;
					this.aClass1_Sub1_Sub2_7.method11(105);
					this.aClass1_Sub1_Sub2_7.method13(local29 + this.anInt931);
					this.aClass1_Sub1_Sub2_7.method13(local34 + this.anInt932);
					this.aClass1_Sub1_Sub2_7.method13(local44);
					this.aClass1_Sub1_Sub2_7.method13(this.anInt1027);
					this.aClass1_Sub1_Sub2_7.method13(this.anInt1025);
					this.aClass1_Sub1_Sub2_7.method13(this.anInt1026);
				}
				@Pc(277) Class1_Sub1_Sub1_Sub3_Sub1 local277;
				if (local39 == 595) {
					local277 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local44];
					if (local277 != null) {
						this.method652(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0], aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0], 0, local277.anIntArray155[0], 1, 303, 0, false, 1, local277.anIntArray156[0], 0, 2);
						this.anInt883 = super.anInt810;
						this.anInt884 = super.anInt811;
						this.anInt886 = 2;
						this.anInt885 = 0;
						anInt972 += local44;
						if (anInt972 >= 64) {
							this.aClass1_Sub1_Sub2_7.method11(125);
							anInt972 = 0;
						}
						this.aClass1_Sub1_Sub2_7.method11(237);
						this.aClass1_Sub1_Sub2_7.method13(local44);
					}
				}
				@Pc(359) Class6 local359;
				if (local39 == 907) {
					this.aClass1_Sub1_Sub2_7.method11(114);
					this.aClass1_Sub1_Sub2_7.method13(local34);
					local359 = Class6.aClass6Array1[local34];
					if (local359.anIntArrayArray1 != null && local359.anIntArrayArray1[0][0] == 5) {
						local69 = local359.anIntArrayArray1[0][1];
						this.anIntArray212[local69] = 1 - this.anIntArray212[local69];
						this.method580(this.anInt815, local69);
						this.aBoolean203 = true;
					}
				}
				if (local39 == 848) {
					local194 = this.method652(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0], aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0], 0, local29, 0, 303, 0, false, 0, local34, 0, 2);
					if (!local194) {
						this.method652(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0], aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0], 0, local29, 1, 303, 0, false, 1, local34, 0, 2);
					}
					this.anInt883 = super.anInt810;
					this.anInt884 = super.anInt811;
					this.anInt886 = 2;
					this.anInt885 = 0;
					this.aClass1_Sub1_Sub2_7.method11(62);
					this.aClass1_Sub1_Sub2_7.method13(local29 + this.anInt931);
					this.aClass1_Sub1_Sub2_7.method13(local34 + this.anInt932);
					this.aClass1_Sub1_Sub2_7.method13(local44);
				}
				if (local39 == 934) {
					if ((local29 & 0x3) == 0) {
						anInt1023++;
					}
					if (anInt1023 >= 139) {
						this.aClass1_Sub1_Sub2_7.method11(22);
						this.aClass1_Sub1_Sub2_7.method13(41053);
						anInt1023 = 0;
					}
					this.aClass1_Sub1_Sub2_7.method11(52);
					this.aClass1_Sub1_Sub2_7.method13(local44);
					this.aClass1_Sub1_Sub2_7.method13(local29);
					this.aClass1_Sub1_Sub2_7.method13(local34);
					this.anInt937 = 0;
					this.anInt938 = local34;
					this.anInt939 = local29;
					this.anInt940 = 2;
					if (Class6.aClass6Array1[local34].anInt56 == this.anInt823) {
						this.anInt940 = 1;
					}
					if (Class6.aClass6Array1[local34].anInt56 == this.anInt991) {
						this.anInt940 = 3;
					}
				}
				if (local39 == 472) {
					this.aClass1_Sub1_Sub2_7.method11(209);
					this.aClass1_Sub1_Sub2_7.method13(local44);
					this.aClass1_Sub1_Sub2_7.method13(local29);
					this.aClass1_Sub1_Sub2_7.method13(local34);
					this.anInt937 = 0;
					this.anInt938 = local34;
					this.anInt939 = local29;
					this.anInt940 = 2;
					if (Class6.aClass6Array1[local34].anInt56 == this.anInt823) {
						this.anInt940 = 1;
					}
					if (Class6.aClass6Array1[local34].anInt56 == this.anInt991) {
						this.anInt940 = 3;
					}
				}
				if (local39 == 502) {
					this.aClass1_Sub1_Sub2_7.method11(173);
					this.aClass1_Sub1_Sub2_7.method13(local44);
					this.aClass1_Sub1_Sub2_7.method13(local29);
					this.aClass1_Sub1_Sub2_7.method13(local34);
					this.anInt937 = 0;
					this.anInt938 = local34;
					this.anInt939 = local29;
					this.anInt940 = 2;
					if (Class6.aClass6Array1[local34].anInt56 == this.anInt823) {
						this.anInt940 = 1;
					}
					if (Class6.aClass6Array1[local34].anInt56 == this.anInt991) {
						this.anInt940 = 3;
					}
				}
				if (local39 == 762) {
					if (this.aBoolean200) {
						this.aClass11_1.method173(local29 - 4, local34 - 4);
					} else {
						this.aClass11_1.method173(super.anInt810 - 4, super.anInt811 - 4);
					}
				}
				if (local39 == 505 && this.method624(local34, local29, local44)) {
					this.aClass1_Sub1_Sub2_7.method11(220);
					this.aClass1_Sub1_Sub2_7.method13(local29 + this.anInt931);
					this.aClass1_Sub1_Sub2_7.method13(local34 + this.anInt932);
					this.aClass1_Sub1_Sub2_7.method13(local44 >> 14 & 0x7FFF);
					this.aClass1_Sub1_Sub2_7.method13(this.anInt873);
				}
				if (local39 == 114) {
					local118 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local44];
					if (local118 != null) {
						this.method652(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0], aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0], 0, local118.anIntArray155[0], 1, 303, 0, false, 1, local118.anIntArray156[0], 0, 2);
						this.anInt883 = super.anInt810;
						this.anInt884 = super.anInt811;
						this.anInt886 = 2;
						this.anInt885 = 0;
						this.aClass1_Sub1_Sub2_7.method11(111);
						this.aClass1_Sub1_Sub2_7.method13(local44);
					}
				}
				@Pc(830) String local830;
				@Pc(815) String local815;
				if (local39 == 233) {
					local359 = Class6.aClass6Array1[local34];
					this.anInt872 = 1;
					this.anInt873 = local34;
					this.anInt874 = local359.anInt64;
					this.anInt1024 = 0;
					this.aBoolean203 = true;
					local815 = local359.aString2;
					if (local815.indexOf(" ") != -1) {
						local815 = local815.substring(0, local815.indexOf(" "));
					}
					local830 = local359.aString2;
					if (local830.indexOf(" ") != -1) {
						local830 = local830.substring(local830.indexOf(" ") + 1);
					}
					this.aString20 = local815 + " " + local359.aString5 + " " + local830;
					if (this.anInt874 == 16) {
						this.aBoolean203 = true;
						this.anInt994 = 3;
						this.aBoolean206 = true;
					}
				} else {
					if (local39 == 83 && !this.aBoolean198) {
						this.aClass1_Sub1_Sub2_7.method11(100);
						this.aClass1_Sub1_Sub2_7.method13(local34);
						this.aBoolean198 = true;
					}
					if (local39 == 680 && this.method624(local34, local29, local44)) {
						this.aClass1_Sub1_Sub2_7.method11(67);
						this.aClass1_Sub1_Sub2_7.method13(local29 + this.anInt931);
						this.aClass1_Sub1_Sub2_7.method13(local34 + this.anInt932);
						this.aClass1_Sub1_Sub2_7.method13(local44 >> 14 & 0x7FFF);
						this.aClass1_Sub1_Sub2_7.method13(this.anInt1027);
						this.aClass1_Sub1_Sub2_7.method13(this.anInt1025);
						this.aClass1_Sub1_Sub2_7.method13(this.anInt1026);
					}
					if (local39 == 458) {
						local277 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local44];
						if (local277 != null) {
							this.method652(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0], aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0], 0, local277.anIntArray155[0], 1, 303, 0, false, 1, local277.anIntArray156[0], 0, 2);
							this.anInt883 = super.anInt810;
							this.anInt884 = super.anInt811;
							this.anInt886 = 2;
							this.anInt885 = 0;
							this.aClass1_Sub1_Sub2_7.method11(9);
							this.aClass1_Sub1_Sub2_7.method13(local44);
						}
					}
					if (local39 == 662) {
						this.aClass1_Sub1_Sub2_7.method11(81);
						this.aClass1_Sub1_Sub2_7.method13(local44);
						this.aClass1_Sub1_Sub2_7.method13(local29);
						this.aClass1_Sub1_Sub2_7.method13(local34);
						this.aClass1_Sub1_Sub2_7.method13(this.anInt873);
						this.anInt937 = 0;
						this.anInt938 = local34;
						this.anInt939 = local29;
						this.anInt940 = 2;
						if (Class6.aClass6Array1[local34].anInt56 == this.anInt823) {
							this.anInt940 = 1;
						}
						if (Class6.aClass6Array1[local34].anInt56 == this.anInt991) {
							this.anInt940 = 3;
						}
					}
					if (local39 == 1195) {
						local277 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local44];
						if (local277 != null) {
							@Pc(1074) Class38 local1074 = local277.aClass38_1;
							if (local1074.anIntArray165 != null) {
								local1074 = local1074.method416(this.anInt867);
							}
							if (local1074 != null) {
								if (local1074.aByteArray18 == null) {
									local830 = "It's a " + local1074.aString16 + ".";
								} else {
									local830 = new String(local1074.aByteArray18);
								}
								this.method607(local830, "", (byte) 1, 0);
							}
						}
					}
					if (local39 == 780) {
						this.aClass1_Sub1_Sub2_7.method11(102);
						this.aClass1_Sub1_Sub2_7.method13(local44);
						this.aClass1_Sub1_Sub2_7.method13(local29);
						this.aClass1_Sub1_Sub2_7.method13(local34);
						this.aClass1_Sub1_Sub2_7.method13(this.anInt1027);
						this.aClass1_Sub1_Sub2_7.method13(this.anInt1025);
						this.aClass1_Sub1_Sub2_7.method13(this.anInt1026);
						this.anInt937 = 0;
						this.anInt938 = local34;
						this.anInt939 = local29;
						this.anInt940 = 2;
						if (Class6.aClass6Array1[local34].anInt56 == this.anInt823) {
							this.anInt940 = 1;
						}
						if (Class6.aClass6Array1[local34].anInt56 == this.anInt991) {
							this.anInt940 = 3;
						}
					}
					@Pc(1204) int local1204;
					if (local39 == 281) {
						local65 = this.aStringArray10[arg1];
						local69 = local65.indexOf("@whi@");
						if (local69 != -1) {
							local80 = Class31.method379(local65.substring(local69 + 5).trim());
							local1204 = -1;
							for (@Pc(1206) int local1206 = 0; local1206 < this.anInt887; local1206++) {
								if (this.aLongArray4[local1206] == local80) {
									local1204 = local1206;
									break;
								}
							}
							if (local1204 != -1 && this.anIntArray244[local1204] > 0) {
								this.aBoolean205 = true;
								this.aBoolean214 = false;
								this.aBoolean192 = true;
								this.aString19 = "";
								this.anInt936 = 3;
								this.aLong31 = this.aLongArray4[local1204];
								this.aString29 = "Enter message to send to " + this.aStringArray8[local1204];
							}
						}
					}
					if (local39 == 902) {
						local118 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local44];
						if (local118 != null) {
							this.method652(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0], aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0], 0, local118.anIntArray155[0], 1, 303, 0, false, 1, local118.anIntArray156[0], 0, 2);
							this.anInt883 = super.anInt810;
							this.anInt884 = super.anInt811;
							this.anInt886 = 2;
							this.anInt885 = 0;
							this.aClass1_Sub1_Sub2_7.method11(230);
							this.aClass1_Sub1_Sub2_7.method13(local44);
						}
					}
					if (local39 == 766) {
						local277 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local44];
						if (local277 != null) {
							this.method652(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0], aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0], 0, local277.anIntArray155[0], 1, 303, 0, false, 1, local277.anIntArray156[0], 0, 2);
							this.anInt883 = super.anInt810;
							this.anInt884 = super.anInt811;
							this.anInt886 = 2;
							this.anInt885 = 0;
							if ((local44 & 0x3) == 0) {
								anInt941++;
							}
							if (anInt941 >= 99) {
								this.aClass1_Sub1_Sub2_7.method11(253);
								this.aClass1_Sub1_Sub2_7.method15(1855977);
								anInt941 = 0;
							}
							this.aClass1_Sub1_Sub2_7.method11(185);
							this.aClass1_Sub1_Sub2_7.method13(local44);
						}
					}
					if (local39 == 86) {
						this.aClass1_Sub1_Sub2_7.method11(68);
						this.aClass1_Sub1_Sub2_7.method13(local44);
						this.aClass1_Sub1_Sub2_7.method13(local29);
						this.aClass1_Sub1_Sub2_7.method13(local34);
						this.anInt937 = 0;
						this.anInt938 = local34;
						this.anInt939 = local29;
						this.anInt940 = 2;
						if (Class6.aClass6Array1[local34].anInt56 == this.anInt823) {
							this.anInt940 = 1;
						}
						if (Class6.aClass6Array1[local34].anInt56 == this.anInt991) {
							this.anInt940 = 3;
						}
					}
					@Pc(1465) Class23 local1465;
					if (local39 == 1515) {
						local1465 = Class23.method320(local44);
						if (local1465.aByteArray9 == null) {
							local815 = "It's a " + local1465.aString13 + ".";
						} else {
							local815 = new String(local1465.aByteArray9);
						}
						this.method607(local815, "", (byte) 1, 0);
					}
					if (local39 == 454) {
						local194 = this.method652(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0], aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0], 0, local29, 0, 303, 0, false, 0, local34, 0, 2);
						if (!local194) {
							this.method652(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0], aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0], 0, local29, 1, 303, 0, false, 1, local34, 0, 2);
						}
						this.anInt883 = super.anInt810;
						this.anInt884 = super.anInt811;
						this.anInt886 = 2;
						this.anInt885 = 0;
						this.aClass1_Sub1_Sub2_7.method11(159);
						this.aClass1_Sub1_Sub2_7.method13(local29 + this.anInt931);
						this.aClass1_Sub1_Sub2_7.method13(local34 + this.anInt932);
						this.aClass1_Sub1_Sub2_7.method13(local44);
					}
					if (local39 == 628) {
						this.aClass1_Sub1_Sub2_7.method11(199);
						this.aClass1_Sub1_Sub2_7.method13(local44);
						this.aClass1_Sub1_Sub2_7.method13(local29);
						this.aClass1_Sub1_Sub2_7.method13(local34);
						this.anInt937 = 0;
						this.anInt938 = local34;
						this.anInt939 = local29;
						this.anInt940 = 2;
						if (Class6.aClass6Array1[local34].anInt56 == this.anInt823) {
							this.anInt940 = 1;
						}
						if (Class6.aClass6Array1[local34].anInt56 == this.anInt991) {
							this.anInt940 = 3;
						}
					}
					if (local39 == 512) {
						local194 = this.method652(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0], aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0], 0, local29, 0, 303, 0, false, 0, local34, 0, 2);
						if (!local194) {
							this.method652(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0], aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0], 0, local29, 1, 303, 0, false, 1, local34, 0, 2);
						}
						this.anInt883 = super.anInt810;
						this.anInt884 = super.anInt811;
						this.anInt886 = 2;
						this.anInt885 = 0;
						anInt858++;
						if (anInt858 >= 119) {
							this.aClass1_Sub1_Sub2_7.method11(48);
							this.aClass1_Sub1_Sub2_7.method16(0);
							anInt858 = 0;
						}
						this.aClass1_Sub1_Sub2_7.method11(214);
						this.aClass1_Sub1_Sub2_7.method13(local29 + this.anInt931);
						this.aClass1_Sub1_Sub2_7.method13(local34 + this.anInt932);
						this.aClass1_Sub1_Sub2_7.method13(local44);
					}
					if (local39 == 1918) {
						local1465 = Class23.method320(local44);
						@Pc(1741) Class6 local1741 = Class6.aClass6Array1[local34];
						if (local1741 != null && local1741.anIntArray12[local29] >= 100000) {
							local815 = local1741.anIntArray12[local29] + " x " + local1465.aString13;
						} else if (local1465.aByteArray9 == null) {
							local815 = "It's a " + local1465.aString13 + ".";
						} else {
							local815 = new String(local1465.aByteArray9);
						}
						this.method607(local815, "", (byte) 1, 0);
					}
					if (local39 == 803) {
						local65 = this.aStringArray10[arg1];
						local69 = local65.indexOf("@whi@");
						if (local69 != -1) {
							if (this.anInt823 == -1) {
								this.method616();
								this.aString26 = local65.substring(local69 + 5).trim();
								this.aBoolean227 = false;
								for (@Pc(1829) int local1829 = 0; local1829 < Class6.aClass6Array1.length; local1829++) {
									if (Class6.aClass6Array1[local1829] != null && Class6.aClass6Array1[local1829].anInt70 == 600) {
										this.anInt816 = this.anInt823 = Class6.aClass6Array1[local1829].anInt56;
										break;
									}
								}
							} else {
								this.method607("Please close the interface you have open before using 'report abuse'", "", (byte) 1, 0);
							}
						}
					}
					if (local39 == 480) {
						local277 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local44];
						if (local277 != null) {
							this.method652(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0], aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0], 0, local277.anIntArray155[0], 1, 303, 0, false, 1, local277.anIntArray156[0], 0, 2);
							this.anInt883 = super.anInt810;
							this.anInt884 = super.anInt811;
							this.anInt886 = 2;
							this.anInt885 = 0;
							this.aClass1_Sub1_Sub2_7.method11(174);
							this.aClass1_Sub1_Sub2_7.method13(local44);
							this.aClass1_Sub1_Sub2_7.method13(this.anInt873);
						}
					}
					if (local39 == 760) {
						local359 = Class6.aClass6Array1[local34];
						@Pc(1939) boolean local1939 = true;
						if (local359.anInt70 > 0) {
							local1939 = this.method679(local359);
						}
						if (local1939) {
							this.aClass1_Sub1_Sub2_7.method11(114);
							this.aClass1_Sub1_Sub2_7.method13(local34);
						}
					}
					if (local39 == 1132) {
						@Pc(1967) int local1967 = local44 >> 14 & 0x7FFF;
						@Pc(1970) Class22 local1970 = Class22.method312(local1967);
						if (local1970.aByteArray8 == null) {
							local830 = "It's a " + local1970.aString12 + ".";
						} else {
							local830 = new String(local1970.aByteArray8);
						}
						this.method607(local830, "", (byte) 1, 0);
					}
					if (local39 == 511) {
						local194 = this.method652(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0], aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0], 0, local29, 0, 303, 0, false, 0, local34, 0, 2);
						if (!local194) {
							this.method652(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0], aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0], 0, local29, 1, 303, 0, false, 1, local34, 0, 2);
						}
						this.anInt883 = super.anInt810;
						this.anInt884 = super.anInt811;
						this.anInt886 = 2;
						this.anInt885 = 0;
						this.aClass1_Sub1_Sub2_7.method11(53);
						this.aClass1_Sub1_Sub2_7.method13(local29 + this.anInt931);
						this.aClass1_Sub1_Sub2_7.method13(local34 + this.anInt932);
						this.aClass1_Sub1_Sub2_7.method13(local44);
					}
					if (local39 == 101) {
						local277 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local44];
						if (local277 != null) {
							this.method652(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0], aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0], 0, local277.anIntArray155[0], 1, 303, 0, false, 1, local277.anIntArray156[0], 0, 2);
							this.anInt883 = super.anInt810;
							this.anInt884 = super.anInt811;
							this.anInt886 = 2;
							this.anInt885 = 0;
							this.aClass1_Sub1_Sub2_7.method11(132);
							this.aClass1_Sub1_Sub2_7.method13(local44);
						}
					}
					if (local39 == 615) {
						anInt824++;
						if (anInt824 >= 87) {
							this.aClass1_Sub1_Sub2_7.method11(219);
							anInt824 = 0;
						}
						this.aClass1_Sub1_Sub2_7.method11(85);
						this.aClass1_Sub1_Sub2_7.method13(local44);
						this.aClass1_Sub1_Sub2_7.method13(local29);
						this.aClass1_Sub1_Sub2_7.method13(local34);
						this.anInt937 = 0;
						this.anInt938 = local34;
						this.anInt939 = local29;
						this.anInt940 = 2;
						if (Class6.aClass6Array1[local34].anInt56 == this.anInt823) {
							this.anInt940 = 1;
						}
						if (Class6.aClass6Array1[local34].anInt56 == this.anInt991) {
							this.anInt940 = 3;
						}
					}
					if (local39 == 231) {
						local277 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local44];
						if (local277 != null) {
							this.method652(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0], aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0], 0, local277.anIntArray155[0], 1, 303, 0, false, 1, local277.anIntArray156[0], 0, 2);
							this.anInt883 = super.anInt810;
							this.anInt884 = super.anInt811;
							this.anInt886 = 2;
							this.anInt885 = 0;
							this.aClass1_Sub1_Sub2_7.method11(149);
							this.aClass1_Sub1_Sub2_7.method13(local44);
							this.aClass1_Sub1_Sub2_7.method13(this.anInt1027);
							this.aClass1_Sub1_Sub2_7.method13(this.anInt1025);
							this.aClass1_Sub1_Sub2_7.method13(this.anInt1026);
						}
					}
					if (local39 == 275) {
						this.aClass1_Sub1_Sub2_7.method11(191);
						this.aClass1_Sub1_Sub2_7.method13(local44);
						this.aClass1_Sub1_Sub2_7.method13(local29);
						this.aClass1_Sub1_Sub2_7.method13(local34);
						this.anInt937 = 0;
						this.anInt938 = local34;
						this.anInt939 = local29;
						this.anInt940 = 2;
						if (Class6.aClass6Array1[local34].anInt56 == this.anInt823) {
							this.anInt940 = 1;
						}
						if (Class6.aClass6Array1[local34].anInt56 == this.anInt991) {
							this.anInt940 = 3;
						}
					}
					if (local39 == 214) {
						this.method616();
					}
					if (local39 == 381) {
						this.aClass1_Sub1_Sub2_7.method11(98);
						this.aClass1_Sub1_Sub2_7.method13(local44);
						this.aClass1_Sub1_Sub2_7.method13(local29);
						this.aClass1_Sub1_Sub2_7.method13(local34);
						this.anInt937 = 0;
						this.anInt938 = local34;
						this.anInt939 = local29;
						this.anInt940 = 2;
						if (Class6.aClass6Array1[local34].anInt56 == this.anInt823) {
							this.anInt940 = 1;
						}
						if (Class6.aClass6Array1[local34].anInt56 == this.anInt991) {
							this.anInt940 = 3;
						}
					}
					if (local39 == 945) {
						this.method624(local34, local29, local44);
						this.aClass1_Sub1_Sub2_7.method11(108);
						this.aClass1_Sub1_Sub2_7.method13(local29 + this.anInt931);
						this.aClass1_Sub1_Sub2_7.method13(local34 + this.anInt932);
						this.aClass1_Sub1_Sub2_7.method13(local44 >> 14 & 0x7FFF);
					}
					if (local39 == 158) {
						local118 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local44];
						if (local118 != null) {
							this.method652(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0], aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0], 0, local118.anIntArray155[0], 1, 303, 0, false, 1, local118.anIntArray156[0], 0, 2);
							this.anInt883 = super.anInt810;
							this.anInt884 = super.anInt811;
							this.anInt886 = 2;
							this.anInt885 = 0;
							if ((local44 & 0x3) == 0) {
								anInt854++;
							}
							if (anInt854 >= 96) {
								this.aClass1_Sub1_Sub2_7.method11(212);
								anInt854 = 0;
							}
							this.aClass1_Sub1_Sub2_7.method11(169);
							this.aClass1_Sub1_Sub2_7.method13(local44);
						}
					}
					if (local39 == 222) {
						this.aClass1_Sub1_Sub2_7.method11(140);
						this.aClass1_Sub1_Sub2_7.method13(local44);
						this.aClass1_Sub1_Sub2_7.method13(local29);
						this.aClass1_Sub1_Sub2_7.method13(local34);
						this.anInt937 = 0;
						this.anInt938 = local34;
						this.anInt939 = local29;
						this.anInt940 = 2;
						if (Class6.aClass6Array1[local34].anInt56 == this.anInt823) {
							this.anInt940 = 1;
						}
						if (Class6.aClass6Array1[local34].anInt56 == this.anInt991) {
							this.anInt940 = 3;
						}
					}
					if (local39 == 28) {
						local118 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local44];
						if (local118 != null) {
							this.method652(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0], aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0], 0, local118.anIntArray155[0], 1, 303, 0, false, 1, local118.anIntArray156[0], 0, 2);
							this.anInt883 = super.anInt810;
							this.anInt884 = super.anInt811;
							this.anInt886 = 2;
							this.anInt885 = 0;
							this.aClass1_Sub1_Sub2_7.method11(106);
							this.aClass1_Sub1_Sub2_7.method13(local44);
							this.aClass1_Sub1_Sub2_7.method13(this.anInt873);
						}
					}
					if (local39 == 606) {
						this.anInt1024 = 1;
						this.anInt1025 = local29;
						this.anInt1026 = local34;
						this.anInt1027 = local44;
						this.aString30 = Class23.method320(local44).aString13;
						this.anInt872 = 0;
						this.aBoolean203 = true;
					} else {
						if (local39 == 473) {
							this.method624(local34, local29, local44);
							this.aClass1_Sub1_Sub2_7.method11(198);
							this.aClass1_Sub1_Sub2_7.method13(local29 + this.anInt931);
							this.aClass1_Sub1_Sub2_7.method13(local34 + this.anInt932);
							this.aClass1_Sub1_Sub2_7.method13(local44 >> 14 & 0x7FFF);
						}
						if (local39 == 147) {
							this.method624(local34, local29, local44);
							this.aClass1_Sub1_Sub2_7.method11(61);
							this.aClass1_Sub1_Sub2_7.method13(local29 + this.anInt931);
							this.aClass1_Sub1_Sub2_7.method13(local34 + this.anInt932);
							this.aClass1_Sub1_Sub2_7.method13(local44 >> 14 & 0x7FFF);
						}
						if (local39 == 51) {
							local194 = this.method652(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0], aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0], 0, local29, 0, 303, 0, false, 0, local34, 0, 2);
							if (!local194) {
								this.method652(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0], aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0], 0, local29, 1, 303, 0, false, 1, local34, 0, 2);
							}
							this.anInt883 = super.anInt810;
							this.anInt884 = super.anInt811;
							this.anInt886 = 2;
							this.anInt885 = 0;
							this.aClass1_Sub1_Sub2_7.method11(180);
							this.aClass1_Sub1_Sub2_7.method13(local29 + this.anInt931);
							this.aClass1_Sub1_Sub2_7.method13(local34 + this.anInt932);
							this.aClass1_Sub1_Sub2_7.method13(local44);
							this.aClass1_Sub1_Sub2_7.method13(this.anInt873);
						}
						if (local39 == 447) {
							this.method624(local34, local29, local44);
							this.aClass1_Sub1_Sub2_7.method11(104);
							this.aClass1_Sub1_Sub2_7.method13(local29 + this.anInt931);
							this.aClass1_Sub1_Sub2_7.method13(local34 + this.anInt932);
							this.aClass1_Sub1_Sub2_7.method13(local44 >> 14 & 0x7FFF);
						}
						if (local39 == 687) {
							local277 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local44];
							if (local277 != null) {
								this.method652(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0], aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0], 0, local277.anIntArray155[0], 1, 303, 0, false, 1, local277.anIntArray156[0], 0, 2);
								this.anInt883 = super.anInt810;
								this.anInt884 = super.anInt811;
								this.anInt886 = 2;
								this.anInt885 = 0;
								this.aClass1_Sub1_Sub2_7.method11(113);
								this.aClass1_Sub1_Sub2_7.method13(local44);
							}
						}
						if (local39 == 707) {
							this.aClass1_Sub1_Sub2_7.method11(114);
							this.aClass1_Sub1_Sub2_7.method13(local34);
							local359 = Class6.aClass6Array1[local34];
							if (local359.anIntArrayArray1 != null && local359.anIntArrayArray1[0][0] == 5) {
								local69 = local359.anIntArrayArray1[0][1];
								if (this.anIntArray212[local69] != local359.anIntArray7[0]) {
									this.anIntArray212[local69] = local359.anIntArray7[0];
									this.method580(this.anInt815, local69);
									this.aBoolean203 = true;
								}
							}
						}
						if (local39 == 614 || local39 == 125) {
							local65 = this.aStringArray10[arg1];
							local69 = local65.indexOf("@whi@");
							if (local69 != -1) {
								local65 = local65.substring(local69 + 5).trim();
								local830 = Class31.method383(Class31.method380(Class31.method379(local65)));
								@Pc(3005) boolean local3005 = false;
								for (local1204 = 0; local1204 < this.anInt959; local1204++) {
									@Pc(3017) Class1_Sub1_Sub1_Sub3_Sub2 local3017 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[this.anIntArray256[local1204]];
									if (local3017 != null && local3017.aString15 != null && local3017.aString15.equalsIgnoreCase(local830)) {
										this.method652(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0], aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0], 0, local3017.anIntArray155[0], 1, 303, 0, false, 1, local3017.anIntArray156[0], 0, 2);
										if (local39 == 614) {
											this.aClass1_Sub1_Sub2_7.method11(230);
											this.aClass1_Sub1_Sub2_7.method13(this.anIntArray256[local1204]);
										}
										if (local39 == 125) {
											this.aClass1_Sub1_Sub2_7.method11(101);
											this.aClass1_Sub1_Sub2_7.method13(this.anIntArray256[local1204]);
										}
										local3005 = true;
										break;
									}
								}
								if (!local3005) {
									this.method607("Unable to find " + local830, "", (byte) 1, 0);
								}
							}
						}
						if (local39 == 206) {
							local118 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local44];
							if (local118 != null) {
								this.method652(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0], aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0], 0, local118.anIntArray155[0], 1, 303, 0, false, 1, local118.anIntArray156[0], 0, 2);
								this.anInt883 = super.anInt810;
								this.anInt884 = super.anInt811;
								this.anInt886 = 2;
								this.anInt885 = 0;
								this.aClass1_Sub1_Sub2_7.method11(6);
								this.aClass1_Sub1_Sub2_7.method13(local44);
								this.aClass1_Sub1_Sub2_7.method13(this.anInt1027);
								this.aClass1_Sub1_Sub2_7.method13(this.anInt1025);
								this.aClass1_Sub1_Sub2_7.method13(this.anInt1026);
							}
						}
						if (local39 == 741) {
							local194 = this.method652(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0], aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0], 0, local29, 0, 303, 0, false, 0, local34, 0, 2);
							if (!local194) {
								this.method652(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0], aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0], 0, local29, 1, 303, 0, false, 1, local34, 0, 2);
							}
							this.anInt883 = super.anInt810;
							this.anInt884 = super.anInt811;
							this.anInt886 = 2;
							this.anInt885 = 0;
							this.aClass1_Sub1_Sub2_7.method11(96);
							this.aClass1_Sub1_Sub2_7.method13(local29 + this.anInt931);
							this.aClass1_Sub1_Sub2_7.method13(local34 + this.anInt932);
							this.aClass1_Sub1_Sub2_7.method13(local44);
						}
						if (local39 == 765) {
							local118 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local44];
							if (local118 != null) {
								this.method652(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0], aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0], 0, local118.anIntArray155[0], 1, 303, 0, false, 1, local118.anIntArray156[0], 0, 2);
								this.anInt883 = super.anInt810;
								this.anInt884 = super.anInt811;
								this.anInt886 = 2;
								this.anInt885 = 0;
								this.aClass1_Sub1_Sub2_7.method11(16);
								this.aClass1_Sub1_Sub2_7.method13(local44);
							}
						}
						if (local39 == 1521) {
							this.method624(local34, local29, local44);
							this.aClass1_Sub1_Sub2_7.method11(134);
							this.aClass1_Sub1_Sub2_7.method13(local29 + this.anInt931);
							this.aClass1_Sub1_Sub2_7.method13(local34 + this.anInt932);
							this.aClass1_Sub1_Sub2_7.method13(local44 >> 14 & 0x7FFF);
						}
						if (local39 == 998) {
							this.aClass1_Sub1_Sub2_7.method11(2);
							this.aClass1_Sub1_Sub2_7.method13(local44);
							this.aClass1_Sub1_Sub2_7.method13(local29);
							this.aClass1_Sub1_Sub2_7.method13(local34);
							this.anInt937 = 0;
							this.anInt938 = local34;
							this.anInt939 = local29;
							this.anInt940 = 2;
							if (Class6.aClass6Array1[local34].anInt56 == this.anInt823) {
								this.anInt940 = 1;
							}
							if (Class6.aClass6Array1[local34].anInt56 == this.anInt991) {
								this.anInt940 = 3;
							}
						}
						this.anInt1024 = 0;
						this.anInt872 = 0;
						this.aBoolean203 = true;
					}
				}
			}
		} catch (@Pc(3426) RuntimeException local3426) {
			signlink.reporterror("15782, " + arg0 + ", " + arg1 + ", " + local3426.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIB)V")
	private void method568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6) {
		try {
			@Pc(4) boolean local4 = false;
			@Pc(17) int local17 = 2048 - arg3 & 0x7FF;
			@Pc(23) int local23 = 2048 - arg4 & 0x7FF;
			@Pc(25) int local25 = 0;
			@Pc(27) int local27 = 0;
			@Pc(29) int local29 = arg5;
			@Pc(35) int local35;
			@Pc(39) int local39;
			@Pc(49) int local49;
			if (local17 != 0) {
				local35 = Class1_Sub1_Sub1_Sub4.anIntArray107[local17];
				local39 = Class1_Sub1_Sub1_Sub4.anIntArray108[local17];
				local49 = local39 * 0 - arg5 * local35 >> 16;
				local29 = local35 * 0 + arg5 * local39 >> 16;
				local27 = local49;
			}
			if (local23 != 0) {
				local35 = Class1_Sub1_Sub1_Sub4.anIntArray107[local23];
				local39 = Class1_Sub1_Sub1_Sub4.anIntArray108[local23];
				local49 = local29 * local35 + local39 * 0 >> 16;
				local29 = local29 * local39 - local35 * 0 >> 16;
				local25 = local49;
			}
			this.anInt973 = arg2 - local25;
			this.anInt974 = arg0 - local27;
			this.anInt975 = arg1 - local29;
			this.anInt976 = arg3;
			this.anInt977 = arg4;
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("84412, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JZ)V")
	private void method569(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (arg0 != 0L) {
				if (this.anInt887 >= 100 && this.anInt983 != 1) {
					this.method607("Your friendlist is full. Max of 100 for free users, and 200 for members", "", (byte) 1, 0);
				} else if (this.anInt887 >= 200) {
					this.method607("Your friendlist is full. Max of 100 for free users, and 200 for members", "", (byte) 1, 0);
				} else {
					@Pc(38) String local38 = Class31.method383(Class31.method380(arg0));
					for (@Pc(40) int local40 = 0; local40 < this.anInt887; local40++) {
						if (this.aLongArray4[local40] == arg0) {
							this.method607(local38 + " is already on your friend list", "", (byte) 1, 0);
							return;
						}
					}
					for (@Pc(70) int local70 = 0; local70 < this.anInt953; local70++) {
						if (this.aLongArray3[local70] == arg0) {
							this.method607("Please remove " + local38 + " from your ignore list first", "", (byte) 1, 0);
							return;
						}
					}
					if (!local38.equals(aClass1_Sub1_Sub1_Sub3_Sub2_1.aString15)) {
						this.aStringArray8[this.anInt887] = local38;
						this.aLongArray4[this.anInt887] = arg0;
						if (!arg1) {
							this.aClass36ArrayArrayArray1 = null;
						}
						this.anIntArray244[this.anInt887] = 0;
						this.anInt887++;
						this.aBoolean203 = true;
						this.aClass1_Sub1_Sub2_7.method11(54);
						this.aClass1_Sub1_Sub2_7.method18(arg0);
					}
				}
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("91494, " + arg0 + ", " + arg1 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(III)V")
	private void method570(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(1) int local1 = 0;
			for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
				if (this.aStringArray12[local3] != null) {
					@Pc(15) int local15 = this.anIntArray258[local3];
					@Pc(26) int local26 = this.anInt902 + 70 + 4 - local1 * 14;
					if (local26 < -20) {
						break;
					}
					@Pc(34) String local34 = this.aStringArray11[local3];
					if (local34 != null && local34.startsWith("@cr1@")) {
						local34 = local34.substring(5);
					}
					if (local34 != null && local34.startsWith("@cr2@")) {
						local34 = local34.substring(5);
					}
					if (local15 == 0) {
						local1++;
					}
					if ((local15 == 1 || local15 == 2) && (local15 == 1 || this.anInt834 == 0 || this.anInt834 == 1 && this.method560(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26 && !local34.equals(aClass1_Sub1_Sub1_Sub3_Sub2_1.aString15)) {
							if (this.anInt1003 >= 1) {
								this.aStringArray10[this.anInt916] = "Report abuse @whi@" + local34;
								this.anIntArray270[this.anInt916] = 803;
								this.anInt916++;
							}
							this.aStringArray10[this.anInt916] = "Add ignore @whi@" + local34;
							this.anIntArray270[this.anInt916] = 266;
							this.anInt916++;
							this.aStringArray10[this.anInt916] = "Add friend @whi@" + local34;
							this.anIntArray270[this.anInt916] = 927;
							this.anInt916++;
						}
						local1++;
					}
					if ((local15 == 3 || local15 == 7) && this.anInt868 == 0 && (local15 == 7 || this.anInt930 == 0 || this.anInt930 == 1 && this.method560(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							if (this.anInt1003 >= 1) {
								this.aStringArray10[this.anInt916] = "Report abuse @whi@" + local34;
								this.anIntArray270[this.anInt916] = 803;
								this.anInt916++;
							}
							this.aStringArray10[this.anInt916] = "Add ignore @whi@" + local34;
							this.anIntArray270[this.anInt916] = 266;
							this.anInt916++;
							this.aStringArray10[this.anInt916] = "Add friend @whi@" + local34;
							this.anIntArray270[this.anInt916] = 927;
							this.anInt916++;
						}
						local1++;
					}
					if (local15 == 4 && (this.anInt847 == 0 || this.anInt847 == 1 && this.method560(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							this.aStringArray10[this.anInt916] = "Accept trade @whi@" + local34;
							this.anIntArray270[this.anInt916] = 614;
							this.anInt916++;
						}
						local1++;
					}
					if ((local15 == 5 || local15 == 6) && this.anInt868 == 0 && this.anInt930 < 2) {
						local1++;
					}
					if (local15 == 8 && (this.anInt847 == 0 || this.anInt847 == 1 && this.method560(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							this.aStringArray10[this.anInt916] = "Accept challenge @whi@" + local34;
							this.anIntArray270[this.anInt916] = 125;
							this.anInt916++;
						}
						local1++;
					}
				}
			}
		} catch (@Pc(409) RuntimeException local409) {
			signlink.reporterror("48491, " + -825 + ", " + arg0 + ", " + arg1 + ", " + local409.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
	private void method571(@OriginalArg(0) byte arg0, @OriginalArg(1) boolean arg1) {
		try {
			@Pc(6) boolean local6 = false;
			for (@Pc(15) int local15 = 0; local15 < this.anInt863; local15++) {
				@Pc(25) Class1_Sub1_Sub1_Sub3_Sub1 local25 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[this.anIntArray218[local15]];
				@Pc(34) int local34 = (this.anIntArray218[local15] << 14) + 536870912;
				if (local25 != null && local25.method389() && local25.aClass38_1.aBoolean149 == arg1) {
					@Pc(50) int local50 = local25.anInt573 >> 7;
					@Pc(55) int local55 = local25.anInt574 >> 7;
					if (local50 >= 0 && local50 < 104 && local55 >= 0 && local55 < 104) {
						if (local25.anInt570 == 1 && (local25.anInt573 & 0x7F) == 64 && (local25.anInt574 & 0x7F) == 64) {
							if (this.anIntArrayArray24[local50][local55] == this.anInt1014) {
								continue;
							}
							this.anIntArrayArray24[local50][local55] = this.anInt1014;
						}
						this.aClass11_1.method146((local25.anInt570 - 1) * 64 + 60, local25, this.anInt857, local34, this.method612(local25.anInt573, 938, local25.anInt574, this.anInt857), local25.anInt575, local25.anInt573, local25.anInt574, local25.aBoolean142);
					}
				}
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("46795, " + arg0 + ", " + arg1 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method572() {
		try {
			@Pc(15) int local15;
			@Pc(22) int local22;
			if (this.anInt827 == 0) {
				local15 = super.anInt800 / 2 - 80;
				local22 = super.anInt801 / 2 + 20;
				local22 += 20;
				if (super.anInt809 == 1 && super.anInt810 >= local15 - 75 && super.anInt810 <= local15 + 75 && super.anInt811 >= local22 - 20 && super.anInt811 <= local22 + 20) {
					this.anInt827 = 3;
					this.anInt859 = 0;
				}
				local15 = super.anInt800 / 2 + 80;
				if (super.anInt809 == 1 && super.anInt810 >= local15 - 75 && super.anInt810 <= local15 + 75 && super.anInt811 >= local22 - 20 && super.anInt811 <= local22 + 20) {
					this.aString27 = "";
					this.aString28 = "Enter your username & password.";
					this.anInt827 = 2;
					this.anInt859 = 0;
				}
			} else if (this.anInt827 == 2) {
				local15 = super.anInt801 / 2 - 40;
				local15 += 30;
				local15 += 25;
				if (super.anInt809 == 1 && super.anInt811 >= local15 - 15 && super.anInt811 < local15) {
					this.anInt859 = 0;
				}
				local15 += 15;
				if (super.anInt809 == 1 && super.anInt811 >= local15 - 15 && super.anInt811 < local15) {
					this.anInt859 = 1;
				}
				local15 += 15;
				local22 = super.anInt800 / 2 - 80;
				@Pc(168) int local168 = super.anInt801 / 2 + 50;
				@Pc(169) int local169 = local168 + 20;
				if (super.anInt809 == 1 && super.anInt810 >= local22 - 75 && super.anInt810 <= local22 + 75 && super.anInt811 >= local169 - 20 && super.anInt811 <= local169 + 20) {
					this.anInt945 = 0;
					this.method615(this.aString21, this.aString22, false);
					if (this.aBoolean234) {
						return;
					}
				}
				local22 = super.anInt800 / 2 + 80;
				if (super.anInt809 == 1 && super.anInt810 >= local22 - 75 && super.anInt810 <= local22 + 75 && super.anInt811 >= local169 - 20 && super.anInt811 <= local169 + 20) {
					this.anInt827 = 0;
					this.aString21 = "";
					this.aString22 = "";
				}
				while (true) {
					while (true) {
						@Pc(259) int local259 = this.method543();
						if (local259 == -1) {
							return;
						}
						@Pc(264) boolean local264 = false;
						for (@Pc(266) int local266 = 0; local266 < aString18.length(); local266++) {
							if (local259 == aString18.charAt(local266)) {
								local264 = true;
								break;
							}
						}
						if (this.anInt859 == 0) {
							if (local259 == 8 && this.aString21.length() > 0) {
								this.aString21 = this.aString21.substring(0, this.aString21.length() - 1);
							}
							if (local259 == 9 || local259 == 10 || local259 == 13) {
								this.anInt859 = 1;
							}
							if (local264) {
								this.aString21 = this.aString21 + (char) local259;
							}
							if (this.aString21.length() > 12) {
								this.aString21 = this.aString21.substring(0, 12);
							}
						} else if (this.anInt859 == 1) {
							if (local259 == 8 && this.aString22.length() > 0) {
								this.aString22 = this.aString22.substring(0, this.aString22.length() - 1);
							}
							if (local259 == 9 || local259 == 10 || local259 == 13) {
								this.anInt859 = 0;
							}
							if (local264) {
								this.aString22 = this.aString22 + (char) local259;
							}
							if (this.aString22.length() > 20) {
								this.aString22 = this.aString22.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt827 == 3) {
				local15 = super.anInt800 / 2;
				local22 = super.anInt801 / 2 + 50;
				@Pc(423) int local423 = local22 + 20;
				if (super.anInt809 == 1 && super.anInt810 >= local15 - 75 && super.anInt810 <= local15 + 75 && super.anInt811 >= local423 - 20 && super.anInt811 <= local423 + 20) {
					this.anInt827 = 0;
					return;
				}
			}
		} catch (@Pc(456) RuntimeException local456) {
			signlink.reporterror("67672, " + 5 + ", " + local456.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!BJPWOXRJ;IILclient!QVUHZTUC;I)V")
	private void method573(@OriginalArg(0) Class1_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub1_Sub1_Sub3_Sub2 arg2, @OriginalArg(4) int arg3) {
		try {
			this.anInt905 += 0;
			@Pc(14) int local14;
			if ((arg3 & 0x1) != 0) {
				local14 = arg0.method22();
				@Pc(17) byte[] local17 = new byte[local14];
				@Pc(23) Class1_Sub1_Sub2 local23 = new Class1_Sub1_Sub2(false, local17);
				arg0.method31(local17, local14);
				this.aClass1_Sub1_Sub2Array1[arg1] = local23;
				arg2.method396(local23);
			}
			@Pc(60) int local60;
			@Pc(72) int local72;
			if ((arg3 & 0x2) != 0) {
				local14 = arg0.method24();
				if (local14 == 65535) {
					local14 = -1;
				}
				if (local14 == arg2.anInt590) {
					arg2.anInt594 = 0;
				}
				local60 = arg0.method22();
				if (local14 == arg2.anInt590 && local14 != -1) {
					local72 = Class29.aClass29Array1[local14].anInt510;
					if (local72 == 1) {
						arg2.anInt591 = 0;
						arg2.anInt592 = 0;
						arg2.anInt593 = local60;
						arg2.anInt594 = 0;
					}
					if (local72 == 2) {
						arg2.anInt594 = 0;
					}
				} else if (local14 == -1 || arg2.anInt590 == -1 || Class29.aClass29Array1[local14].anInt504 >= Class29.aClass29Array1[arg2.anInt590].anInt504) {
					arg2.anInt590 = local14;
					arg2.anInt591 = 0;
					arg2.anInt592 = 0;
					arg2.anInt593 = local60;
					arg2.anInt594 = 0;
					arg2.anInt600 = arg2.anInt597;
				}
			}
			if ((arg3 & 0x4) != 0) {
				arg2.anInt582 = arg0.method24();
				if (arg2.anInt582 == 65535) {
					arg2.anInt582 = -1;
				}
			}
			if ((arg3 & 0x8) != 0) {
				arg2.aString14 = arg0.method29();
				if (arg2.aString14.charAt(0) == '~') {
					arg2.aString14 = arg2.aString14.substring(1);
					this.method607(arg2.aString14, arg2.aString15, (byte) 1, 2);
				} else if (arg2 == aClass1_Sub1_Sub1_Sub3_Sub2_1) {
					this.method607(arg2.aString14, arg2.aString15, (byte) 1, 2);
				}
				arg2.anInt563 = 0;
				arg2.anInt554 = 0;
				arg2.anInt596 = 150;
			}
			if ((arg3 & 0x10) != 0) {
				local14 = arg0.method22();
				local60 = arg0.method22();
				arg2.method390(local60, anInt921, local14);
				arg2.anInt576 = anInt921 + 300;
				arg2.anInt577 = arg0.method22();
				arg2.anInt578 = arg0.method22();
			}
			if ((arg3 & 0x20) != 0) {
				arg2.anInt580 = arg0.method24();
				arg2.anInt581 = arg0.method24();
			}
			if ((arg3 & 0x40) != 0) {
				local14 = arg0.method24();
				local60 = arg0.method22();
				local72 = arg0.method22();
				@Pc(253) int local253 = arg0.anInt10;
				if (arg2.aString15 != null && arg2.aBoolean144) {
					@Pc(263) long local263 = Class31.method379(arg2.aString15);
					@Pc(265) boolean local265 = false;
					if (local60 <= 1) {
						for (@Pc(270) int local270 = 0; local270 < this.anInt953; local270++) {
							if (this.aLongArray3[local270] == local263) {
								local265 = true;
								break;
							}
						}
					}
					if (!local265 && this.anInt1019 == 0) {
						try {
							this.aClass1_Sub1_Sub2_8.anInt10 = 0;
							arg0.method31(this.aClass1_Sub1_Sub2_8.aByteArray1, this.anInt905 - 4);
							@Pc(314) String local314 = Class46.method500(this.aClass1_Sub1_Sub2_8, local72);
							@Pc(318) String local318 = Class20.method280(local314);
							arg2.aString14 = local318;
							arg2.anInt563 = local14 >> 8;
							arg2.anInt554 = local14 & 0xFF;
							arg2.anInt596 = 150;
							if (local60 == 2 || local60 == 3) {
								this.method607(local318, "@cr2@" + arg2.aString15, (byte) 1, 1);
							} else if (local60 == 1) {
								this.method607(local318, "@cr1@" + arg2.aString15, (byte) 1, 1);
							} else {
								this.method607(local318, arg2.aString15, (byte) 1, 2);
							}
						} catch (@Pc(382) Exception local382) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg0.anInt10 = local253 + local72;
			}
			if ((arg3 & 0x100) != 0) {
				arg2.anInt564 = arg0.method24();
				local14 = arg0.method27();
				arg2.anInt568 = local14 >> 16;
				arg2.anInt567 = anInt921 + (local14 & 0xFFFF);
				arg2.anInt565 = 0;
				arg2.anInt566 = 0;
				if (arg2.anInt567 > anInt921) {
					arg2.anInt565 = -1;
				}
				if (arg2.anInt564 == 65535) {
					arg2.anInt564 = -1;
				}
			}
			if ((arg3 & 0x200) != 0) {
				arg2.anInt555 = arg0.method22();
				arg2.anInt557 = arg0.method22();
				arg2.anInt556 = arg0.method22();
				arg2.anInt558 = arg0.method22();
				arg2.anInt559 = arg0.method24() + anInt921;
				arg2.anInt560 = arg0.method24() + anInt921;
				arg2.anInt561 = arg0.method22();
				arg2.method391();
			}
			if ((arg3 & 0x400) != 0) {
				local14 = arg0.method22();
				local60 = arg0.method22();
				arg2.method390(local60, anInt921, local14);
				arg2.anInt576 = anInt921 + 300;
				arg2.anInt577 = arg0.method22();
				arg2.anInt578 = arg0.method22();
			}
		} catch (@Pc(503) RuntimeException local503) {
			signlink.reporterror("32864, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + local503.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)Z")
	private boolean method574() {
		try {
			if (this.aClass16_1 == null) {
				return false;
			}
			@Pc(1818) String local1818;
			@Pc(164) int local164;
			try {
				@Pc(16) int local16 = this.aClass16_1.method227();
				if (local16 == 0) {
					return false;
				}
				if (this.anInt906 == -1) {
					this.aClass16_1.method228(this.aClass1_Sub1_Sub2_9.aByteArray1, 0, 1);
					this.anInt906 = this.aClass1_Sub1_Sub2_9.aByteArray1[0] & 0xFF;
					if (this.aClass9_2 != null) {
						this.anInt906 = this.anInt906 - this.aClass9_2.method69() & 0xFF;
					}
					this.anInt905 = Class2.anIntArray4[this.anInt906];
					local16--;
				}
				if (this.anInt905 == -1) {
					if (local16 <= 0) {
						return false;
					}
					this.aClass16_1.method228(this.aClass1_Sub1_Sub2_9.aByteArray1, 0, 1);
					this.anInt905 = this.aClass1_Sub1_Sub2_9.aByteArray1[0] & 0xFF;
					local16--;
				}
				if (this.anInt905 == -2) {
					if (local16 <= 1) {
						return false;
					}
					this.aClass16_1.method228(this.aClass1_Sub1_Sub2_9.aByteArray1, 0, 2);
					this.aClass1_Sub1_Sub2_9.anInt10 = 0;
					this.anInt905 = this.aClass1_Sub1_Sub2_9.method24();
					local16 -= 2;
				}
				if (local16 < this.anInt905) {
					return false;
				}
				this.aClass1_Sub1_Sub2_9.anInt10 = 0;
				this.aClass16_1.method228(this.aClass1_Sub1_Sub2_9.aByteArray1, 0, this.anInt905);
				this.anInt907 = 0;
				this.anInt988 = this.anInt987;
				this.anInt987 = this.anInt986;
				this.anInt986 = this.anInt906;
				@Pc(160) int local160;
				if (this.anInt906 == 105) {
					local160 = this.aClass1_Sub1_Sub2_9.method22();
					local164 = this.aClass1_Sub1_Sub2_9.method22();
					@Pc(168) String local168 = this.aClass1_Sub1_Sub2_9.method29();
					if (local160 >= 1 && local160 <= 5) {
						if (local168.equalsIgnoreCase("null")) {
							local168 = null;
						}
						this.aStringArray13[local160 - 1] = local168;
						this.aBooleanArray12[local160 - 1] = local164 == 0;
					}
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 211) {
					this.anInt888 = this.aClass1_Sub1_Sub2_9.method22();
					this.aBoolean203 = true;
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 157) {
					this.anInt1020 = this.aClass1_Sub1_Sub2_9.method22();
					this.anInt1021 = this.aClass1_Sub1_Sub2_9.method22();
					this.anInt906 = -1;
					return true;
				}
				@Pc(252) int local252;
				@Pc(256) int local256;
				@Pc(281) int local281;
				@Pc(248) long local248;
				@Pc(258) boolean local258;
				@Pc(260) int local260;
				@Pc(327) String local327;
				if (this.anInt906 == 83) {
					local248 = this.aClass1_Sub1_Sub2_9.method28();
					local252 = this.aClass1_Sub1_Sub2_9.method27();
					local256 = this.aClass1_Sub1_Sub2_9.method22();
					local258 = false;
					for (local260 = 0; local260 < 100; local260++) {
						if (this.anIntArray226[local260] == local252) {
							local258 = true;
							break;
						}
					}
					if (local256 <= 1) {
						for (local281 = 0; local281 < this.anInt953; local281++) {
							if (this.aLongArray3[local281] == local248) {
								local258 = true;
								break;
							}
						}
					}
					if (!local258 && this.anInt1019 == 0) {
						try {
							this.anIntArray226[this.anInt817] = local252;
							this.anInt817 = (this.anInt817 + 1) % 100;
							local327 = Class46.method500(this.aClass1_Sub1_Sub2_9, this.anInt905 - 13);
							if (local256 != 3) {
								local327 = Class20.method280(local327);
							}
							if (local256 == 2 || local256 == 3) {
								this.method607(local327, "@cr2@" + Class31.method383(Class31.method380(local248)), (byte) 1, 7);
							} else if (local256 == 1) {
								this.method607(local327, "@cr1@" + Class31.method383(Class31.method380(local248)), (byte) 1, 7);
							} else {
								this.method607(local327, Class31.method383(Class31.method380(local248)), (byte) 1, 3);
							}
						} catch (@Pc(391) Exception local391) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 253) {
					if (this.anInt994 == 12) {
						this.aBoolean203 = true;
					}
					this.anInt878 = this.aClass1_Sub1_Sub2_9.method25();
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 227) {
					for (local160 = 0; local160 < this.aClass1_Sub1_Sub1_Sub3_Sub2Array1.length; local160++) {
						if (this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local160] != null) {
							this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local160].anInt590 = -1;
						}
					}
					for (local164 = 0; local164 < this.aClass1_Sub1_Sub1_Sub3_Sub1Array1.length; local164++) {
						if (this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local164] != null) {
							this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local164].anInt590 = -1;
						}
					}
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 28) {
					this.anInt1018 = this.aClass1_Sub1_Sub2_9.method24() * 30;
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 39) {
					this.aBoolean190 = false;
					for (local160 = 0; local160 < 5; local160++) {
						this.aBooleanArray11[local160] = false;
					}
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 139) {
					local160 = this.aClass1_Sub1_Sub2_9.method24();
					local164 = this.aClass1_Sub1_Sub2_9.method24();
					Class6.aClass6Array1[local160].anInt42 = 2;
					Class6.aClass6Array1[local160].anInt43 = local164;
					this.anInt906 = -1;
					return true;
				}
				@Pc(568) int local568;
				@Pc(554) Class6 local554;
				if (this.anInt906 == 9) {
					this.aBoolean203 = true;
					local160 = this.aClass1_Sub1_Sub2_9.method24();
					local554 = Class6.aClass6Array1[local160];
					while (this.aClass1_Sub1_Sub2_9.anInt10 < this.anInt905) {
						local252 = this.aClass1_Sub1_Sub2_9.method36();
						local256 = this.aClass1_Sub1_Sub2_9.method24();
						local568 = this.aClass1_Sub1_Sub2_9.method22();
						if (local568 == 255) {
							local568 = this.aClass1_Sub1_Sub2_9.method27();
						}
						if (local252 >= 0 && local252 < local554.anIntArray11.length) {
							local554.anIntArray11[local252] = local256;
							local554.anIntArray12[local252] = local568;
						}
					}
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 44) {
					this.anInt892 = this.aClass1_Sub1_Sub2_9.method22();
					if (this.anInt892 == this.anInt994) {
						if (this.anInt892 == 3) {
							this.anInt994 = 1;
						} else {
							this.anInt994 = 3;
						}
						this.aBoolean203 = true;
					}
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 223) {
					this.aBoolean203 = true;
					local160 = this.aClass1_Sub1_Sub2_9.method24();
					local554 = Class6.aClass6Array1[local160];
					local252 = this.aClass1_Sub1_Sub2_9.method24();
					for (local256 = 0; local256 < local252; local256++) {
						local554.anIntArray11[local256] = this.aClass1_Sub1_Sub2_9.method24();
						local568 = this.aClass1_Sub1_Sub2_9.method22();
						if (local568 == 255) {
							local568 = this.aClass1_Sub1_Sub2_9.method27();
						}
						local554.anIntArray12[local256] = local568;
					}
					for (local568 = local252; local568 < local554.anIntArray11.length; local568++) {
						local554.anIntArray11[local568] = 0;
						local554.anIntArray12[local568] = 0;
					}
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 23) {
					this.method671(this.aClass1_Sub1_Sub2_9, this.anInt905);
					this.aBoolean239 = false;
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 254) {
					this.anInt818 = this.aClass1_Sub1_Sub2_9.method24();
					this.anInt983 = this.aClass1_Sub1_Sub2_9.method22();
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 193) {
					this.anInt834 = this.aClass1_Sub1_Sub2_9.method22();
					this.anInt930 = this.aClass1_Sub1_Sub2_9.method22();
					this.anInt847 = this.aClass1_Sub1_Sub2_9.method22();
					this.aBoolean226 = true;
					this.aBoolean205 = true;
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 216) {
					local160 = this.aClass1_Sub1_Sub2_9.method24();
					local164 = this.aClass1_Sub1_Sub2_9.method27();
					this.anIntArray221[local160] = local164;
					if (this.anIntArray212[local160] != local164) {
						this.anIntArray212[local160] = local164;
						this.method580(this.anInt815, local160);
						this.aBoolean203 = true;
						if (this.anInt1005 != -1) {
							this.aBoolean205 = true;
						}
					}
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 202) {
					this.aBoolean203 = true;
					local160 = this.aClass1_Sub1_Sub2_9.method22();
					local164 = this.aClass1_Sub1_Sub2_9.method27();
					local252 = this.aClass1_Sub1_Sub2_9.method22();
					this.anIntArray266[local160] = local164;
					this.anIntArray259[local160] = local252;
					this.anIntArray217[local160] = 1;
					for (local256 = 0; local256 < 98; local256++) {
						if (local164 >= anIntArray237[local256]) {
							this.anIntArray217[local160] = local256 + 2;
						}
					}
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 79) {
					local160 = this.aClass1_Sub1_Sub2_9.method24();
					if (local160 == 65535) {
						local160 = -1;
					}
					if (local160 != this.anInt967 && this.aBoolean193 && !aBoolean230 && this.anInt853 == 0) {
						this.anInt978 = local160;
						this.aBoolean233 = true;
						this.aClass7_Sub1_1.method56(2, this.anInt978);
					}
					this.anInt967 = local160;
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 210) {
					local160 = this.aClass1_Sub1_Sub2_9.method24();
					local164 = this.aClass1_Sub1_Sub2_9.method24();
					if (this.aBoolean193 && !aBoolean230) {
						this.anInt978 = local160;
						this.aBoolean233 = false;
						this.aClass7_Sub1_1.method56(2, this.anInt978);
						this.anInt853 = local164;
					}
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 35) {
					this.aBoolean190 = true;
					this.anInt947 = this.aClass1_Sub1_Sub2_9.method22();
					this.anInt948 = this.aClass1_Sub1_Sub2_9.method22();
					this.anInt949 = this.aClass1_Sub1_Sub2_9.method24();
					this.anInt950 = this.aClass1_Sub1_Sub2_9.method22();
					this.anInt951 = this.aClass1_Sub1_Sub2_9.method22();
					if (this.anInt951 >= 100) {
						this.anInt973 = this.anInt947 * 128 + 64;
						this.anInt975 = this.anInt948 * 128 + 64;
						this.anInt974 = this.method612(this.anInt973, 938, this.anInt975, this.anInt857) - this.anInt949;
					}
					this.anInt906 = -1;
					return true;
				}
				@Pc(1421) int local1421;
				if (this.anInt906 == 92 || this.anInt906 == 192) {
					local160 = this.anInt910;
					local164 = this.anInt911;
					if (this.anInt906 == 92) {
						local160 = this.aClass1_Sub1_Sub2_9.method24();
						local164 = this.aClass1_Sub1_Sub2_9.method24();
						this.aBoolean238 = false;
					}
					if (this.anInt906 == 192) {
						local160 = this.aClass1_Sub1_Sub2_9.method24();
						local164 = this.aClass1_Sub1_Sub2_9.method24();
						this.aClass1_Sub1_Sub2_9.method32();
						local252 = 0;
						while (true) {
							if (local252 >= 4) {
								this.aClass1_Sub1_Sub2_9.method34();
								this.aBoolean238 = true;
								break;
							}
							for (local256 = 0; local256 < 13; local256++) {
								for (local568 = 0; local568 < 13; local568++) {
									local260 = this.aClass1_Sub1_Sub2_9.method33(1);
									if (local260 == 1) {
										this.anIntArrayArrayArray8[local252][local256][local568] = this.aClass1_Sub1_Sub2_9.method33(26);
									} else {
										this.anIntArrayArrayArray8[local252][local256][local568] = -1;
									}
								}
							}
							local252++;
						}
					}
					if (this.anInt910 == local160 && this.anInt911 == local164 && this.anInt1004 == 2) {
						this.anInt906 = -1;
						return true;
					}
					this.anInt910 = local160;
					this.anInt911 = local164;
					this.anInt931 = (this.anInt910 - 6) * 8;
					this.anInt932 = (this.anInt911 - 6) * 8;
					this.aBoolean218 = false;
					if ((this.anInt910 / 8 == 48 || this.anInt910 / 8 == 49) && this.anInt911 / 8 == 48) {
						this.aBoolean218 = true;
					}
					if (this.anInt910 / 8 == 48 && this.anInt911 / 8 == 148) {
						this.aBoolean218 = true;
					}
					this.anInt1004 = 1;
					this.aLong32 = System.currentTimeMillis();
					this.aClass48_14.method503();
					this.aClass1_Sub1_Sub3_Sub2_3.method356(257, 151, "Loading - please wait.", 0);
					this.aClass1_Sub1_Sub3_Sub2_3.method356(256, 150, "Loading - please wait.", 16777215);
					this.aClass48_14.method504(super.aGraphics2, 4, 4);
					if (this.anInt906 == 92) {
						local252 = 0;
						local256 = (this.anInt910 - 6) / 8;
						label1040: while (true) {
							if (local256 > (this.anInt910 + 6) / 8) {
								this.aByteArrayArray4 = new byte[local252][];
								this.aByteArrayArray5 = new byte[local252][];
								this.anIntArray251 = new int[local252];
								this.anIntArray252 = new int[local252];
								this.anIntArray253 = new int[local252];
								local252 = 0;
								local568 = (this.anInt910 - 6) / 8;
								while (true) {
									if (local568 > (this.anInt910 + 6) / 8) {
										break label1040;
									}
									for (local260 = (this.anInt911 - 6) / 8; local260 <= (this.anInt911 + 6) / 8; local260++) {
										this.anIntArray251[local252] = (local568 << 8) + local260;
										if (this.aBoolean218 && (local260 == 49 || local260 == 149 || local260 == 147 || local568 == 50 || local568 == 49 && local260 == 47)) {
											this.anIntArray252[local252] = -1;
											this.anIntArray253[local252] = -1;
											local252++;
										} else {
											local281 = this.anIntArray252[local252] = this.aClass7_Sub1_1.method68(local568, local260, 0);
											if (local281 != -1) {
												this.aClass7_Sub1_1.method56(3, local281);
											}
											local1421 = this.anIntArray253[local252] = this.aClass7_Sub1_1.method68(local568, local260, 1);
											if (local1421 != -1) {
												this.aClass7_Sub1_1.method56(3, local1421);
											}
											local252++;
										}
									}
									local568++;
								}
							}
							for (local568 = (this.anInt911 - 6) / 8; local568 <= (this.anInt911 + 6) / 8; local568++) {
								local252++;
							}
							local256++;
						}
					}
					local252 = this.anInt931 - this.anInt933;
					local256 = this.anInt932 - this.anInt934;
					this.anInt933 = this.anInt931;
					this.anInt934 = this.anInt932;
					for (local568 = 0; local568 < 16384; local568++) {
						@Pc(1477) Class1_Sub1_Sub1_Sub3_Sub1 local1477 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local568];
						if (local1477 != null) {
							for (local281 = 0; local281 < 10; local281++) {
								local1477.anIntArray155[local281] -= local252;
								local1477.anIntArray156[local281] -= local256;
							}
							local1477.anInt573 -= local252 * 128;
							local1477.anInt574 -= local256 * 128;
						}
					}
					for (local260 = 0; local260 < this.anInt957; local260++) {
						@Pc(1532) Class1_Sub1_Sub1_Sub3_Sub2 local1532 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local260];
						if (local1532 != null) {
							for (local1421 = 0; local1421 < 10; local1421++) {
								local1532.anIntArray155[local1421] -= local252;
								local1532.anIntArray156[local1421] -= local256;
							}
							local1532.anInt573 -= local252 * 128;
							local1532.anInt574 -= local256 * 128;
						}
					}
					this.aBoolean239 = true;
					@Pc(1584) byte local1584 = 0;
					@Pc(1586) byte local1586 = 104;
					@Pc(1588) byte local1588 = 1;
					if (local252 < 0) {
						local1584 = 103;
						local1586 = -1;
						local1588 = -1;
					}
					@Pc(1598) byte local1598 = 0;
					@Pc(1600) byte local1600 = 104;
					@Pc(1602) byte local1602 = 1;
					if (local256 < 0) {
						local1598 = 103;
						local1600 = -1;
						local1602 = -1;
					}
					for (@Pc(1612) int local1612 = local1584; local1612 != local1586; local1612 += local1588) {
						for (@Pc(1616) int local1616 = local1598; local1616 != local1600; local1616 += local1602) {
							@Pc(1622) int local1622 = local1612 + local252;
							@Pc(1626) int local1626 = local1616 + local256;
							for (@Pc(1628) int local1628 = 0; local1628 < 4; local1628++) {
								if (local1622 >= 0 && local1626 >= 0 && local1622 < 104 && local1626 < 104) {
									this.aClass36ArrayArrayArray1[local1628][local1612][local1616] = this.aClass36ArrayArrayArray1[local1628][local1622][local1626];
								} else {
									this.aClass36ArrayArrayArray1[local1628][local1612][local1616] = null;
								}
							}
						}
					}
					for (@Pc(1690) Class1_Sub3 local1690 = (Class1_Sub3) this.aClass36_12.method400(); local1690 != null; local1690 = (Class1_Sub3) this.aClass36_12.method402((byte) 2)) {
						local1690.anInt733 -= local252;
						local1690.anInt734 -= local256;
						if (local1690.anInt733 < 0 || local1690.anInt734 < 0 || local1690.anInt733 >= 104 || local1690.anInt734 >= 104) {
							local1690.method510();
						}
					}
					if (this.anInt981 != 0) {
						this.anInt981 -= local252;
						this.anInt982 -= local256;
					}
					this.aBoolean190 = false;
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 154) {
					this.anInt953 = this.anInt905 / 8;
					for (local160 = 0; local160 < this.anInt953; local160++) {
						this.aLongArray3[local160] = this.aClass1_Sub1_Sub2_9.method28();
					}
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 230) {
					local160 = this.aClass1_Sub1_Sub2_9.method24();
					@Pc(1800) boolean local1800 = this.aClass1_Sub1_Sub2_9.method22() == 1;
					Class6.aClass6Array1[local160].aBoolean18 = local1800;
					this.anInt906 = -1;
					return true;
				}
				@Pc(1829) String local1829;
				if (this.anInt906 == 81) {
					local1818 = this.aClass1_Sub1_Sub2_9.method29();
					@Pc(1832) long local1832;
					if (local1818.endsWith(":tradereq:")) {
						local1829 = local1818.substring(0, local1818.indexOf(":"));
						local1832 = Class31.method379(local1829);
						local258 = false;
						for (local260 = 0; local260 < this.anInt953; local260++) {
							if (this.aLongArray3[local260] == local1832) {
								local258 = true;
								break;
							}
						}
						if (!local258 && this.anInt1019 == 0) {
							this.method607("wishes to trade with you.", local1829, (byte) 1, 4);
						}
					} else if (local1818.endsWith(":duelreq:")) {
						local1829 = local1818.substring(0, local1818.indexOf(":"));
						local1832 = Class31.method379(local1829);
						local258 = false;
						for (local260 = 0; local260 < this.anInt953; local260++) {
							if (this.aLongArray3[local260] == local1832) {
								local258 = true;
								break;
							}
						}
						if (!local258 && this.anInt1019 == 0) {
							this.method607("wishes to duel with you.", local1829, (byte) 1, 8);
						}
					} else if (local1818.endsWith(":chalreq:")) {
						local1829 = local1818.substring(0, local1818.indexOf(":"));
						local1832 = Class31.method379(local1829);
						local258 = false;
						for (local260 = 0; local260 < this.anInt953; local260++) {
							if (this.aLongArray3[local260] == local1832) {
								local258 = true;
								break;
							}
						}
						if (!local258 && this.anInt1019 == 0) {
							local327 = local1818.substring(local1818.indexOf(":") + 1, local1818.length() - 9);
							this.method607(local327, local1829, (byte) 1, 8);
						}
					} else {
						this.method607(local1818, "", (byte) 1, 0);
					}
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 244) {
					local160 = this.aClass1_Sub1_Sub2_9.method24();
					local164 = this.aClass1_Sub1_Sub2_9.method24();
					local252 = this.aClass1_Sub1_Sub2_9.method24();
					if (local164 == 65535) {
						Class6.aClass6Array1[local160].anInt42 = 0;
						this.anInt906 = -1;
						return true;
					}
					@Pc(2020) Class23 local2020 = Class23.method320(local164);
					Class6.aClass6Array1[local160].anInt42 = 4;
					Class6.aClass6Array1[local160].anInt43 = local164;
					Class6.aClass6Array1[local160].anInt52 = local2020.anInt467;
					Class6.aClass6Array1[local160].anInt53 = local2020.anInt451;
					Class6.aClass6Array1[local160].anInt51 = local2020.anInt446 * 100 / local252;
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 17) {
					local160 = this.aClass1_Sub1_Sub2_9.method24();
					local554 = Class6.aClass6Array1[local160];
					for (local252 = 0; local252 < local554.anIntArray11.length; local252++) {
						local554.anIntArray11[local252] = -1;
						local554.anIntArray11[local252] = 0;
					}
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 21) {
					local160 = this.aClass1_Sub1_Sub2_9.method24();
					this.method684(local160);
					if (this.anInt935 != -1) {
						this.anInt935 = -1;
						this.aBoolean203 = true;
						this.aBoolean206 = true;
					}
					this.anInt991 = local160;
					this.aBoolean205 = true;
					this.anInt823 = -1;
					this.aBoolean198 = false;
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 97) {
					local160 = this.aClass1_Sub1_Sub2_9.method24();
					Class6.aClass6Array1[local160].anInt42 = 3;
					if (aClass1_Sub1_Sub1_Sub3_Sub2_1.aClass38_2 == null) {
						Class6.aClass6Array1[local160].anInt43 = (aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray158[0] << 25) + (aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray158[4] << 20) + (aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray157[0] << 15) + (aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray157[8] << 10) + (aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray157[11] << 5) + aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray157[1];
					} else {
						Class6.aClass6Array1[local160].anInt43 = (int) (aClass1_Sub1_Sub1_Sub3_Sub2_1.aClass38_2.aLong18 + 305419896L);
					}
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 101) {
					if (this.anInt935 != -1) {
						this.anInt935 = -1;
						this.aBoolean203 = true;
						this.aBoolean206 = true;
					}
					if (this.anInt991 != -1) {
						this.anInt991 = -1;
						this.aBoolean205 = true;
					}
					if (this.aBoolean214) {
						this.aBoolean214 = false;
						this.aBoolean205 = true;
					}
					this.anInt823 = -1;
					this.aBoolean198 = false;
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 46) {
					local160 = this.aClass1_Sub1_Sub2_9.method24();
					local164 = this.aClass1_Sub1_Sub2_9.method24();
					Class6.aClass6Array1[local160].anInt42 = 1;
					Class6.aClass6Array1[local160].anInt43 = local164;
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 174) {
					local160 = this.aClass1_Sub1_Sub2_9.method25();
					this.anInt1005 = local160;
					this.aBoolean205 = true;
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 103) {
					local160 = this.aClass1_Sub1_Sub2_9.method24();
					local1829 = this.aClass1_Sub1_Sub2_9.method29();
					Class6.aClass6Array1[local160].aString4 = local1829;
					if (Class6.aClass6Array1[local160].anInt56 == this.anIntArray227[this.anInt994]) {
						this.aBoolean203 = true;
					}
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 189) {
					local160 = this.aClass1_Sub1_Sub2_9.method24();
					local164 = this.aClass1_Sub1_Sub2_9.method24();
					if (this.anInt991 != -1) {
						this.anInt991 = -1;
						this.aBoolean205 = true;
					}
					if (this.aBoolean214) {
						this.aBoolean214 = false;
						this.aBoolean205 = true;
					}
					this.anInt823 = local160;
					this.anInt935 = local164;
					this.aBoolean203 = true;
					this.aBoolean206 = true;
					this.aBoolean198 = false;
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 82) {
					local160 = this.aClass1_Sub1_Sub2_9.method24();
					local164 = this.aClass1_Sub1_Sub2_9.method24();
					local252 = this.aClass1_Sub1_Sub2_9.method24();
					local256 = this.aClass1_Sub1_Sub2_9.method24();
					Class6.aClass6Array1[local160].anInt52 = local164;
					Class6.aClass6Array1[local160].anInt53 = local252;
					Class6.aClass6Array1[local160].anInt51 = local256;
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 155) {
					this.aBoolean190 = true;
					this.anInt923 = this.aClass1_Sub1_Sub2_9.method22();
					this.anInt924 = this.aClass1_Sub1_Sub2_9.method22();
					this.anInt925 = this.aClass1_Sub1_Sub2_9.method24();
					this.anInt926 = this.aClass1_Sub1_Sub2_9.method22();
					this.anInt927 = this.aClass1_Sub1_Sub2_9.method22();
					if (this.anInt927 >= 100) {
						local160 = this.anInt923 * 128 + 64;
						local164 = this.anInt924 * 128 + 64;
						local252 = this.method612(local160, 938, local164, this.anInt857) - this.anInt925;
						local256 = local160 - this.anInt973;
						local568 = local252 - this.anInt974;
						local260 = local164 - this.anInt975;
						local281 = (int) Math.sqrt((double) (local256 * local256 + local260 * local260));
						this.anInt976 = (int) (Math.atan2((double) local568, (double) local281) * 325.949D) & 0x7FF;
						this.anInt977 = (int) (Math.atan2((double) local256, (double) local260) * -325.949D) & 0x7FF;
						if (this.anInt976 < 128) {
							this.anInt976 = 128;
						}
						if (this.anInt976 > 383) {
							this.anInt976 = 383;
						}
					}
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 176) {
					this.anInt1020 = this.aClass1_Sub1_Sub2_9.method22();
					this.anInt1021 = this.aClass1_Sub1_Sub2_9.method22();
					for (local160 = this.anInt1020; local160 < this.anInt1020 + 8; local160++) {
						for (local164 = this.anInt1021; local164 < this.anInt1021 + 8; local164++) {
							if (this.aClass36ArrayArrayArray1[this.anInt857][local160][local164] != null) {
								this.aClass36ArrayArrayArray1[this.anInt857][local160][local164] = null;
								this.method561(local160, local164);
							}
						}
					}
					for (@Pc(2628) Class1_Sub3 local2628 = (Class1_Sub3) this.aClass36_12.method400(); local2628 != null; local2628 = (Class1_Sub3) this.aClass36_12.method402((byte) 2)) {
						if (local2628.anInt733 >= this.anInt1020 && local2628.anInt733 < this.anInt1020 + 8 && local2628.anInt734 >= this.anInt1021 && local2628.anInt734 < this.anInt1021 + 8 && local2628.anInt731 == this.anInt857) {
							local2628.anInt738 = 0;
						}
					}
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 246) {
					this.aBoolean192 = false;
					this.aBoolean214 = true;
					this.aString17 = "";
					this.aBoolean205 = true;
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 187) {
					this.anInt850 = this.aClass1_Sub1_Sub2_9.method22();
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 151) {
					this.anInt981 = 0;
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 85) {
					local160 = this.aClass1_Sub1_Sub2_9.method24();
					local164 = this.aClass1_Sub1_Sub2_9.method25();
					local252 = this.aClass1_Sub1_Sub2_9.method25();
					@Pc(2742) Class6 local2742 = Class6.aClass6Array1[local160];
					local2742.anInt50 = local164;
					local2742.anInt54 = local252;
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 247) {
					this.anInt994 = this.aClass1_Sub1_Sub2_9.method22();
					this.aBoolean203 = true;
					this.aBoolean206 = true;
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 16) {
					local160 = this.aClass1_Sub1_Sub2_9.method24();
					this.method684(local160);
					if (this.anInt991 != -1) {
						this.anInt991 = -1;
						this.aBoolean205 = true;
					}
					if (this.aBoolean214) {
						this.aBoolean214 = false;
						this.aBoolean205 = true;
					}
					this.anInt935 = local160;
					this.aBoolean203 = true;
					this.aBoolean206 = true;
					this.anInt823 = -1;
					this.aBoolean198 = false;
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 235) {
					this.method680(this.aBoolean195);
					this.anInt906 = -1;
					return false;
				}
				if (this.anInt906 == 169 || this.anInt906 == 242 || this.anInt906 == 222 || this.anInt906 == 107 || this.anInt906 == 104 || this.anInt906 == 90 || this.anInt906 == 110 || this.anInt906 == 147 || this.anInt906 == 1 || this.anInt906 == 141 || this.anInt906 == 133) {
					this.method654(this.anInt906, this.aClass1_Sub1_Sub2_9);
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 215) {
					local160 = this.aClass1_Sub1_Sub2_9.method24();
					local164 = this.aClass1_Sub1_Sub2_9.method24();
					local252 = local164 >> 10 & 0x1F;
					local256 = local164 >> 5 & 0x1F;
					local568 = local164 & 0x1F;
					Class6.aClass6Array1[local160].anInt73 = (local252 << 19) + (local256 << 11) + (local568 << 3);
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 168) {
					local160 = this.aClass1_Sub1_Sub2_9.method24();
					local164 = this.aClass1_Sub1_Sub2_9.method22();
					local252 = this.aClass1_Sub1_Sub2_9.method24();
					if (this.aBoolean220 && !aBoolean230 && this.anInt871 < 50) {
						this.anIntArray267[this.anInt871] = local160;
						this.anIntArray254[this.anInt871] = local164;
						this.anIntArray214[this.anInt871] = local252 + Class10.anIntArray32[local160];
						this.anInt871++;
					}
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 69) {
					this.anInt1020 = this.aClass1_Sub1_Sub2_9.method22();
					this.anInt1021 = this.aClass1_Sub1_Sub2_9.method22();
					while (this.aClass1_Sub1_Sub2_9.anInt10 < this.anInt905) {
						local160 = this.aClass1_Sub1_Sub2_9.method22();
						this.method654(local160, this.aClass1_Sub1_Sub2_9);
					}
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 231) {
					this.anInt995 = this.aClass1_Sub1_Sub2_9.method27();
					this.anInt913 = this.aClass1_Sub1_Sub2_9.method24();
					this.anInt879 = this.aClass1_Sub1_Sub2_9.method22();
					this.anInt821 = this.aClass1_Sub1_Sub2_9.method24();
					this.anInt869 = this.aClass1_Sub1_Sub2_9.method22();
					if (this.anInt995 != 0 && this.anInt823 == -1) {
						signlink.dnslookup(Class31.method382(this.anInt995));
						this.method616();
						@Pc(3082) short local3082 = 650;
						if (this.anInt879 != 201 || this.anInt869 == 1) {
							local3082 = 655;
						}
						this.aString26 = "";
						this.aBoolean227 = false;
						for (local164 = 0; local164 < Class6.aClass6Array1.length; local164++) {
							if (Class6.aClass6Array1[local164] != null && Class6.aClass6Array1[local164].anInt70 == local3082) {
								this.anInt823 = Class6.aClass6Array1[local164].anInt56;
								break;
							}
						}
					}
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 99) {
					local160 = this.aClass1_Sub1_Sub2_9.method24();
					this.method684(local160);
					if (this.anInt935 != -1) {
						this.anInt935 = -1;
						this.aBoolean203 = true;
						this.aBoolean206 = true;
					}
					if (this.anInt991 != -1) {
						this.anInt991 = -1;
						this.aBoolean205 = true;
					}
					if (this.aBoolean214) {
						this.aBoolean214 = false;
						this.aBoolean205 = true;
					}
					this.anInt823 = local160;
					this.aBoolean198 = false;
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 11) {
					local248 = this.aClass1_Sub1_Sub2_9.method28();
					local252 = this.aClass1_Sub1_Sub2_9.method22();
					@Pc(3204) String local3204 = Class31.method383(Class31.method380(local248));
					for (local568 = 0; local568 < this.anInt887; local568++) {
						if (local248 == this.aLongArray4[local568]) {
							if (this.anIntArray244[local568] != local252) {
								this.anIntArray244[local568] = local252;
								this.aBoolean203 = true;
								if (local252 > 0) {
									this.method607(local3204 + " has logged in.", "", (byte) 1, 5);
								}
								if (local252 == 0) {
									this.method607(local3204 + " has logged out.", "", (byte) 1, 5);
								}
							}
							local3204 = null;
							break;
						}
					}
					if (local3204 != null && this.anInt887 < 200) {
						this.aLongArray4[this.anInt887] = local248;
						this.aStringArray8[this.anInt887] = local3204;
						this.anIntArray244[this.anInt887] = local252;
						this.anInt887++;
						this.aBoolean203 = true;
					}
					@Pc(3302) boolean local3302 = false;
					while (!local3302) {
						local3302 = true;
						for (local281 = 0; local281 < this.anInt887 - 1; local281++) {
							if (this.anIntArray244[local281] != anInt964 && this.anIntArray244[local281 + 1] == anInt964 || this.anIntArray244[local281] == 0 && this.anIntArray244[local281 + 1] != 0) {
								local1421 = this.anIntArray244[local281];
								this.anIntArray244[local281] = this.anIntArray244[local281 + 1];
								this.anIntArray244[local281 + 1] = local1421;
								@Pc(3363) String local3363 = this.aStringArray8[local281];
								this.aStringArray8[local281] = this.aStringArray8[local281 + 1];
								this.aStringArray8[local281 + 1] = local3363;
								@Pc(3385) long local3385 = this.aLongArray4[local281];
								this.aLongArray4[local281] = this.aLongArray4[local281 + 1];
								this.aLongArray4[local281 + 1] = local3385;
								this.aBoolean203 = true;
								local3302 = false;
							}
						}
					}
					this.anInt906 = -1;
					return true;
				}
				@Pc(3437) Class6 local3437;
				if (this.anInt906 == 173) {
					local160 = this.aClass1_Sub1_Sub2_9.method24();
					local164 = this.aClass1_Sub1_Sub2_9.method25();
					local3437 = Class6.aClass6Array1[local160];
					local3437.anInt67 = local164;
					if (local164 == -1) {
						local3437.anInt47 = 0;
						local3437.anInt45 = 0;
					}
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 33) {
					for (local160 = 0; local160 < this.anIntArray212.length; local160++) {
						if (this.anIntArray212[local160] != this.anIntArray221[local160]) {
							this.anIntArray212[local160] = this.anIntArray221[local160];
							this.method580(this.anInt815, local160);
							this.aBoolean203 = true;
						}
					}
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 219) {
					this.anInt852 = this.aClass1_Sub1_Sub2_9.method22();
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 41) {
					local160 = this.aClass1_Sub1_Sub2_9.method24();
					local164 = this.aClass1_Sub1_Sub2_9.method22();
					if (local160 == 65535) {
						local160 = -1;
					}
					this.anIntArray227[local164] = local160;
					this.aBoolean203 = true;
					this.aBoolean206 = true;
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 150) {
					this.anInt928 = this.aClass1_Sub1_Sub2_9.method22();
					if (this.anInt928 == 1) {
						this.anInt865 = this.aClass1_Sub1_Sub2_9.method24();
					}
					if (this.anInt928 >= 2 && this.anInt928 <= 6) {
						if (this.anInt928 == 2) {
							this.anInt999 = 64;
							this.anInt1000 = 64;
						}
						if (this.anInt928 == 3) {
							this.anInt999 = 0;
							this.anInt1000 = 64;
						}
						if (this.anInt928 == 4) {
							this.anInt999 = 128;
							this.anInt1000 = 64;
						}
						if (this.anInt928 == 5) {
							this.anInt999 = 64;
							this.anInt1000 = 0;
						}
						if (this.anInt928 == 6) {
							this.anInt999 = 64;
							this.anInt1000 = 128;
						}
						this.anInt928 = 2;
						this.anInt996 = this.aClass1_Sub1_Sub2_9.method24();
						this.anInt997 = this.aClass1_Sub1_Sub2_9.method24();
						this.anInt998 = this.aClass1_Sub1_Sub2_9.method22();
					}
					if (this.anInt928 == 10) {
						this.anInt963 = this.aClass1_Sub1_Sub2_9.method24();
					}
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 102) {
					local160 = this.aClass1_Sub1_Sub2_9.method24();
					local164 = this.aClass1_Sub1_Sub2_9.method24();
					local3437 = Class6.aClass6Array1[local160];
					if (local3437 != null && local3437.anInt48 == 0) {
						if (local164 < 0) {
							local164 = 0;
						}
						if (local164 > local3437.anInt40 - local3437.anInt44) {
							local164 = local3437.anInt40 - local3437.anInt44;
						}
						local3437.anInt65 = local164;
					}
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 205) {
					local160 = this.aClass1_Sub1_Sub2_9.method22();
					local164 = this.aClass1_Sub1_Sub2_9.method22();
					local252 = this.aClass1_Sub1_Sub2_9.method22();
					local256 = this.aClass1_Sub1_Sub2_9.method22();
					this.aBooleanArray11[local160] = true;
					this.anIntArray236[local160] = local164;
					this.anIntArray243[local160] = local252;
					this.anIntArray219[local160] = local256;
					this.anIntArray242[local160] = 0;
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 167) {
					this.method682(this.anInt905, this.aClass1_Sub1_Sub2_9);
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 114) {
					local160 = this.aClass1_Sub1_Sub2_9.method25();
					if (local160 >= 0) {
						this.method684(local160);
					}
					this.anInt929 = local160;
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 70) {
					local160 = this.aClass1_Sub1_Sub2_9.method24();
					@Pc(3799) byte local3799 = this.aClass1_Sub1_Sub2_9.method23();
					this.anIntArray221[local160] = local3799;
					if (this.anIntArray212[local160] != local3799) {
						this.anIntArray212[local160] = local3799;
						this.method580(this.anInt815, local160);
						this.aBoolean203 = true;
						if (this.anInt1005 != -1) {
							this.aBoolean205 = true;
						}
					}
					this.anInt906 = -1;
					return true;
				}
				if (this.anInt906 == 135) {
					if (this.anInt994 == 12) {
						this.aBoolean203 = true;
					}
					this.anInt845 = this.aClass1_Sub1_Sub2_9.method22();
					this.anInt906 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt906 + "," + this.anInt905 + " - " + this.anInt987 + "," + this.anInt988);
				this.method680(this.aBoolean195);
			} catch (@Pc(3886) IOException local3886) {
				this.method641();
			} catch (@Pc(3891) Exception local3891) {
				local1818 = "T2 - " + this.anInt906 + "," + this.anInt987 + "," + this.anInt988 + " - " + this.anInt905 + "," + (this.anInt931 + aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0]) + "," + (this.anInt932 + aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0]) + " - ";
				for (local164 = 0; local164 < this.anInt905 && local164 < 50; local164++) {
					local1818 = local1818 + this.aClass1_Sub1_Sub2_9.aByteArray1[local164] + ",";
				}
				signlink.reporterror(local1818);
				this.method680(this.aBoolean195);
			}
			return true;
		} catch (@Pc(3973) RuntimeException local3973) {
			signlink.reporterror("70484, " + false + ", " + local3973.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method576() {
		try {
			if (this.anInt895 == 0) {
				@Pc(12) int local12 = super.anInt809;
				if (this.anInt872 == 1 && super.anInt810 >= 516 && super.anInt811 >= 160 && super.anInt810 <= 765 && super.anInt811 <= 205) {
					local12 = 0;
				}
				@Pc(43) int local43;
				@Pc(46) int local46;
				@Pc(122) int local122;
				if (this.aBoolean200) {
					if (local12 != 1) {
						local43 = super.anInt804;
						local46 = super.anInt805;
						if (this.anInt836 == 0) {
							local43 -= 4;
							local46 -= 4;
						}
						if (this.anInt836 == 1) {
							local43 -= 553;
							local46 -= 205;
						}
						if (this.anInt836 == 2) {
							local43 -= 17;
							local46 -= 357;
						}
						if (local43 < this.anInt837 - 10 || local43 > this.anInt837 + this.anInt839 + 10 || local46 < this.anInt838 - 10 || local46 > this.anInt838 + this.anInt840 + 10) {
							this.aBoolean200 = false;
							if (this.anInt836 == 1) {
								this.aBoolean203 = true;
							}
							if (this.anInt836 == 2) {
								this.aBoolean205 = true;
							}
						}
					}
					if (local12 == 1) {
						local43 = this.anInt837;
						local46 = this.anInt838;
						local122 = this.anInt839;
						@Pc(125) int local125 = super.anInt810;
						@Pc(128) int local128 = super.anInt811;
						if (this.anInt836 == 0) {
							local125 -= 4;
							local128 -= 4;
						}
						if (this.anInt836 == 1) {
							local125 -= 553;
							local128 -= 205;
						}
						if (this.anInt836 == 2) {
							local125 -= 17;
							local128 -= 357;
						}
						@Pc(147) int local147 = -1;
						for (@Pc(149) int local149 = 0; local149 < this.anInt916; local149++) {
							@Pc(164) int local164 = local46 + (this.anInt916 - 1 - local149) * 15 + 31;
							if (local125 > local43 && local125 < local43 + local122 && local128 > local164 - 13 && local128 < local164 + 3) {
								local147 = local149;
							}
						}
						if (local147 != -1) {
							this.method567(this.aByte43, local147);
						}
						this.aBoolean200 = false;
						if (this.anInt836 == 1) {
							this.aBoolean203 = true;
						}
						if (this.anInt836 == 2) {
							this.aBoolean205 = true;
							return;
						}
					}
				} else {
					if (local12 == 1 && this.anInt916 > 0) {
						local43 = this.anIntArray270[this.anInt916 - 1];
						if (local43 == 222 || local43 == 472 || local43 == 381 || local43 == 628 || local43 == 502 || local43 == 615 || local43 == 998 || local43 == 934 || local43 == 86 || local43 == 275 || local43 == 606 || local43 == 1918) {
							local46 = this.anIntArray268[this.anInt916 - 1];
							local122 = this.anIntArray269[this.anInt916 - 1];
							@Pc(285) Class6 local285 = Class6.aClass6Array1[local122];
							if (local285.aBoolean22 || local285.aBoolean16) {
								this.aBoolean221 = false;
								this.anInt825 = 0;
								this.anInt893 = local122;
								this.anInt894 = local46;
								this.anInt895 = 2;
								this.anInt896 = super.anInt810;
								this.anInt897 = super.anInt811;
								if (Class6.aClass6Array1[local122].anInt56 == this.anInt823) {
									this.anInt895 = 1;
								}
								if (Class6.aClass6Array1[local122].anInt56 == this.anInt991) {
									this.anInt895 = 3;
								}
								return;
							}
						}
					}
					if (local12 == 1 && (this.anInt848 == 1 || this.method630(this.anInt916 - 1)) && this.anInt916 > 2) {
						local12 = 2;
					}
					if (local12 == 1 && this.anInt916 > 0) {
						this.method567(this.aByte43, this.anInt916 - 1);
					}
					if (local12 != 2 || this.anInt916 <= 0) {
						return;
					}
					this.method669();
				}
			}
		} catch (@Pc(381) RuntimeException local381) {
			signlink.reporterror("47942, " + -36118 + ", " + local381.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method578() {
		try {
			while (true) {
				@Pc(13) Class1_Sub1_Sub4 local13 = this.aClass7_Sub1_1.method63();
				if (local13 == null) {
					return;
				}
				if (local13.anInt728 == 0) {
					Class1_Sub1_Sub1_Sub4.method237(local13.aByteArray20, local13.anInt730);
					if ((this.aClass7_Sub1_1.method52(local13.anInt730) & 0x62) != 0) {
						this.aBoolean203 = true;
						if (this.anInt991 != -1) {
							this.aBoolean205 = true;
						}
					}
				}
				if (local13.anInt728 == 1 && local13.aByteArray20 != null) {
					Class42.method476(local13.aByteArray20);
				}
				if (local13.anInt728 == 2 && local13.anInt730 == this.anInt978 && local13.aByteArray20 != null) {
					this.method635(this.aBoolean233, this.anInt856, local13.aByteArray20);
				}
				if (local13.anInt728 == 3 && this.anInt1004 == 1) {
					for (@Pc(85) int local85 = 0; local85 < this.aByteArrayArray4.length; local85++) {
						if (this.anIntArray252[local85] == local13.anInt730) {
							this.aByteArrayArray4[local85] = local13.aByteArray20;
							if (local13.aByteArray20 == null) {
								this.anIntArray252[local85] = -1;
							}
							break;
						}
						if (this.anIntArray253[local85] == local13.anInt730) {
							this.aByteArrayArray5[local85] = local13.aByteArray20;
							if (local13.aByteArray20 == null) {
								this.anIntArray253[local85] = -1;
							}
							break;
						}
					}
				}
				if (local13.anInt728 == 93 && this.aClass7_Sub1_1.method64(857, local13.anInt730)) {
					Class39.method426(this.aClass7_Sub1_1, new Class1_Sub1_Sub2(false, local13.aByteArray20));
				}
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("8378, " + true + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method579(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != this.anInt822) {
				anInt851 = 427;
			}
			if (this.anInt852 == 0 && super.anInt809 == 1) {
				@Pc(20) int local20 = super.anInt810 - 25 - 550;
				@Pc(27) int local27 = super.anInt811 - 5 - 4;
				@Pc(47) int local47;
				if (local20 >= 0 && local27 >= 0 && local20 < 146 && local27 < 151) {
					local20 -= 73;
					local27 -= 75;
					local47 = this.anInt842 + this.anInt829 & 0x7FF;
					@Pc(51) int local51 = Class1_Sub1_Sub3_Sub1.anIntArray26[local47];
					@Pc(55) int local55 = Class1_Sub1_Sub3_Sub1.anIntArray27[local47];
					@Pc(64) int local64 = local51 * (this.anInt875 + 256) >> 8;
					@Pc(73) int local73 = local55 * (this.anInt875 + 256) >> 8;
					@Pc(83) int local83 = local27 * local64 + local20 * local73 >> 11;
					@Pc(93) int local93 = local27 * local73 - local20 * local64 >> 11;
					@Pc(100) int local100 = aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt573 + local83 >> 7;
					@Pc(107) int local107 = aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt574 - local93 >> 7;
					@Pc(128) boolean local128 = this.method652(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0], aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0], 0, local100, 0, 303, 0, true, 0, local107, 0, 1);
					if (local128) {
						this.aClass1_Sub1_Sub2_7.method12(local20);
						this.aClass1_Sub1_Sub2_7.method12(local27);
						this.aClass1_Sub1_Sub2_7.method13(this.anInt842);
						this.aClass1_Sub1_Sub2_7.method12(57);
						this.aClass1_Sub1_Sub2_7.method12(this.anInt829);
						this.aClass1_Sub1_Sub2_7.method12(this.anInt875);
						this.aClass1_Sub1_Sub2_7.method12(89);
						this.aClass1_Sub1_Sub2_7.method13(aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt573);
						this.aClass1_Sub1_Sub2_7.method13(aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt574);
						this.aClass1_Sub1_Sub2_7.method12(this.anInt985);
						this.aClass1_Sub1_Sub2_7.method12(63);
					}
				}
				anInt956++;
				if (anInt956 > 1734) {
					anInt956 = 0;
					this.aClass1_Sub1_Sub2_7.method11(87);
					this.aClass1_Sub1_Sub2_7.method12(0);
					local47 = this.aClass1_Sub1_Sub2_7.anInt10;
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub2_7.method13(60300);
					}
					this.aClass1_Sub1_Sub2_7.method12(36);
					this.aClass1_Sub1_Sub2_7.method12(21);
					this.aClass1_Sub1_Sub2_7.method12((int) (Math.random() * 256.0D));
					this.aClass1_Sub1_Sub2_7.method13((int) (Math.random() * 65536.0D));
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub2_7.method13(2668);
					}
					this.aClass1_Sub1_Sub2_7.method12((int) (Math.random() * 256.0D));
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub2_7.method13(3744);
					}
					this.aClass1_Sub1_Sub2_7.method12(150);
					this.aClass1_Sub1_Sub2_7.method13((int) (Math.random() * 65536.0D));
					this.aClass1_Sub1_Sub2_7.method21(this.aClass1_Sub1_Sub2_7.anInt10 - local47);
					return;
				}
			}
		} catch (@Pc(280) RuntimeException local280) {
			signlink.reporterror("40992, " + arg0 + ", " + local280.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = Class17.aClass17Array1[arg1].anInt377;
			if (arg0 >= 0) {
				this.method544();
			}
			if (local4 != 0) {
				@Pc(16) int local16 = this.anIntArray212[arg1];
				if (local4 == 1) {
					if (local16 == 1) {
						Class1_Sub1_Sub3_Sub1.method109(0.9D);
					}
					if (local16 == 2) {
						Class1_Sub1_Sub3_Sub1.method109(0.8D);
					}
					if (local16 == 3) {
						Class1_Sub1_Sub3_Sub1.method109(0.7D);
					}
					if (local16 == 4) {
						Class1_Sub1_Sub3_Sub1.method109(0.6D);
					}
					Class23.aClass15_6.method224();
					this.aBoolean231 = true;
				}
				if (local4 == 3) {
					@Pc(54) boolean local54 = this.aBoolean193;
					if (local16 == 0) {
						this.method658(0, this.aBoolean193);
						this.aBoolean193 = true;
					}
					if (local16 == 1) {
						this.method658(-400, this.aBoolean193);
						this.aBoolean193 = true;
					}
					if (local16 == 2) {
						this.method658(-800, this.aBoolean193);
						this.aBoolean193 = true;
					}
					if (local16 == 3) {
						this.method658(-1200, this.aBoolean193);
						this.aBoolean193 = true;
					}
					if (local16 == 4) {
						this.aBoolean193 = false;
					}
					if (this.aBoolean193 != local54 && !aBoolean230) {
						if (this.aBoolean193) {
							this.anInt978 = this.anInt967;
							this.aBoolean233 = true;
							this.aClass7_Sub1_1.method56(2, this.anInt978);
						} else {
							this.method554();
						}
						this.anInt853 = 0;
					}
				}
				if (local4 == 4) {
					if (local16 == 0) {
						this.aBoolean220 = true;
						this.method553(0);
					}
					if (local16 == 1) {
						this.aBoolean220 = true;
						this.method553(-400);
					}
					if (local16 == 2) {
						this.aBoolean220 = true;
						this.method553(-800);
					}
					if (local16 == 3) {
						this.aBoolean220 = true;
						this.method553(-1200);
					}
					if (local16 == 4) {
						this.aBoolean220 = false;
					}
				}
				if (local4 == 5) {
					this.anInt848 = local16;
				}
				if (local4 == 6) {
					this.anInt849 = local16;
				}
				if (local4 == 8) {
					this.anInt868 = local16;
					this.aBoolean205 = true;
				}
				if (local4 == 9) {
					this.anInt862 = local16;
				}
			}
		} catch (@Pc(214) RuntimeException local214) {
			signlink.reporterror("11902, " + arg0 + ", " + arg1 + ", " + local214.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ZI)Ljava/lang/String;")
	private String method581(@OriginalArg(1) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("6627, " + false + ", " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)Z")
	private boolean method582(@OriginalArg(0) boolean arg0) {
		try {
			if (arg0) {
				this.aBoolean207 = !this.aBoolean207;
			}
			return signlink.wavereplay();
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("13689, " + arg0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!YZDAHXEQ;)V")
	private void method583(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub3_Sub4 arg2) {
		try {
			@Pc(7) int local7 = this.anInt842 + this.anInt829 & 0x7FF;
			@Pc(15) int local15 = arg0 * arg0 + arg1 * arg1;
			if (local15 <= 6400) {
				@Pc(23) int local23 = Class1_Sub1_Sub1_Sub4.anIntArray107[local7];
				@Pc(27) int local27 = Class1_Sub1_Sub1_Sub4.anIntArray108[local7];
				@Pc(36) int local36 = local23 * 256 / (this.anInt875 + 256);
				@Pc(55) int local55 = local27 * 256 / (this.anInt875 + 256);
				@Pc(65) int local65 = arg1 * local36 + arg0 * local55 >> 16;
				@Pc(75) int local75 = arg1 * local55 - arg0 * local36 >> 16;
				if (local15 > 2500) {
					arg2.method535(local65 + 94 + 4 - arg2.anInt790 / 2, this.aClass1_Sub1_Sub3_Sub3_19, 83 - local75 - arg2.anInt791 / 2 - 4);
				} else {
					arg2.method529(local65 + 94 + 4 - arg2.anInt790 / 2, 83 - local75 - arg2.anInt791 / 2 - 4);
				}
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("67116, " + -7004 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!BJPWOXRJ;Z)V")
	private void method584(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub2 arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt960; local1++) {
				@Pc(8) int local8 = this.anIntArray257[local1];
				@Pc(13) Class1_Sub1_Sub1_Sub3_Sub2 local13 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local8];
				@Pc(16) int local16 = arg1.method22();
				if ((local16 & 0x80) != 0) {
					local16 += arg1.method22() << 8;
				}
				this.method573(arg1, local8, local13, local16);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("7439, " + arg0 + ", " + arg1 + ", " + true + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method585() {
		try {
			this.aClass48_13.method503();
			@Pc(18) int local18;
			@Pc(20) int local20;
			if (this.anInt852 == 2) {
				@Pc(13) byte[] local13 = this.aClass1_Sub1_Sub3_Sub3_19.aByteArray19;
				@Pc(15) int[] local15 = Class1_Sub1_Sub3.anIntArray208;
				local18 = local13.length;
				for (local20 = 0; local20 < local18; local20++) {
					if (local13[local20] == 0) {
						local15[local20] = 0;
					}
				}
				this.aClass1_Sub1_Sub3_Sub4_16.method533(this.anIntArray215, 33, 33, 25, 256, this.anInt842, 0, 25, 0, this.anIntArray222);
				this.aClass48_14.method503();
			} else {
				@Pc(64) int local64 = this.anInt842 + this.anInt829 & 0x7FF;
				@Pc(71) int local71 = aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt573 / 32 + 48;
				local18 = 464 - aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt574 / 32;
				this.aClass1_Sub1_Sub3_Sub4_15.method533(this.anIntArray245, 146, 151, local71, this.anInt875 + 256, local64, 5, local18, 25, this.anIntArray213);
				this.aClass1_Sub1_Sub3_Sub4_16.method533(this.anIntArray215, 33, 33, 25, 256, this.anInt842, 0, 25, 0, this.anIntArray222);
				for (local20 = 0; local20 < this.anInt992; local20++) {
					local71 = this.anIntArray262[local20] * 4 + 2 - aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt573 / 32;
					local18 = this.anIntArray263[local20] * 4 + 2 - aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt574 / 32;
					this.method583(local71, local18, this.aClass1_Sub1_Sub3_Sub4Array4[local20]);
				}
				@Pc(166) int local166;
				for (@Pc(162) int local162 = 0; local162 < 104; local162++) {
					for (local166 = 0; local166 < 104; local166++) {
						@Pc(178) Class36 local178 = this.aClass36ArrayArrayArray1[this.anInt857][local162][local166];
						if (local178 != null) {
							local71 = local162 * 4 + 2 - aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt573 / 32;
							local18 = local166 * 4 + 2 - aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt574 / 32;
							this.method583(local71, local18, this.aClass1_Sub1_Sub3_Sub4_7);
						}
					}
				}
				for (local166 = 0; local166 < this.anInt863; local166++) {
					@Pc(229) Class1_Sub1_Sub1_Sub3_Sub1 local229 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[this.anIntArray218[local166]];
					if (local229 != null && local229.method389()) {
						@Pc(238) Class38 local238 = local229.aClass38_1;
						if (local238.anIntArray165 != null) {
							local238 = local238.method416(this.anInt867);
						}
						if (local238 != null && local238.aBoolean151) {
							local71 = local229.anInt573 / 32 - aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt573 / 32;
							local18 = local229.anInt574 / 32 - aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt574 / 32;
							this.method583(local71, local18, this.aClass1_Sub1_Sub3_Sub4_8);
						}
					}
				}
				@Pc(295) Class1_Sub1_Sub1_Sub3_Sub2 local295;
				for (@Pc(285) int local285 = 0; local285 < this.anInt959; local285++) {
					local295 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[this.anIntArray256[local285]];
					if (local295 != null && local295.method389()) {
						local71 = local295.anInt573 / 32 - aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt573 / 32;
						local18 = local295.anInt574 / 32 - aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt574 / 32;
						@Pc(323) boolean local323 = false;
						@Pc(327) long local327 = Class31.method379(local295.aString15);
						for (@Pc(329) int local329 = 0; local329 < this.anInt887; local329++) {
							if (local327 == this.aLongArray4[local329] && this.anIntArray244[local329] != 0) {
								local323 = true;
								break;
							}
						}
						@Pc(354) boolean local354 = false;
						if (aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt611 != 0 && local295.anInt611 != 0 && aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt611 == local295.anInt611) {
							local354 = true;
						}
						if (local323) {
							this.method583(local71, local18, this.aClass1_Sub1_Sub3_Sub4_10);
						} else if (local354) {
							this.method583(local71, local18, this.aClass1_Sub1_Sub3_Sub4_11);
						} else {
							this.method583(local71, local18, this.aClass1_Sub1_Sub3_Sub4_9);
						}
					}
				}
				if (this.anInt928 != 0 && anInt921 % 20 < 10) {
					if (this.anInt928 == 1 && this.anInt865 >= 0 && this.anInt865 < this.aClass1_Sub1_Sub1_Sub3_Sub1Array1.length) {
						@Pc(428) Class1_Sub1_Sub1_Sub3_Sub1 local428 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[this.anInt865];
						if (local428 != null) {
							local71 = local428.anInt573 / 32 - aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt573 / 32;
							local18 = local428.anInt574 / 32 - aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt574 / 32;
							this.method675(local71, this.aClass1_Sub1_Sub3_Sub4_6, local18);
						}
					}
					if (this.anInt928 == 2) {
						local71 = (this.anInt996 - this.anInt931) * 4 + 2 - aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt573 / 32;
						local18 = (this.anInt997 - this.anInt932) * 4 + 2 - aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt574 / 32;
						this.method675(local71, this.aClass1_Sub1_Sub3_Sub4_6, local18);
					}
					if (this.anInt928 == 10 && this.anInt963 >= 0 && this.anInt963 < this.aClass1_Sub1_Sub1_Sub3_Sub2Array1.length) {
						local295 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[this.anInt963];
						if (local295 != null) {
							local71 = local295.anInt573 / 32 - aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt573 / 32;
							local18 = local295.anInt574 / 32 - aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt574 / 32;
							this.method675(local71, this.aClass1_Sub1_Sub3_Sub4_6, local18);
						}
					}
				}
				if (this.anInt981 != 0) {
					local71 = this.anInt981 * 4 + 2 - aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt573 / 32;
					local18 = this.anInt982 * 4 + 2 - aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt574 / 32;
					this.method583(local71, local18, this.aClass1_Sub1_Sub3_Sub4_5);
				}
				Class1_Sub1_Sub3.method517(78, 3, 3, 97, 16777215);
				this.aClass48_14.method503();
			}
		} catch (@Pc(597) RuntimeException local597) {
			signlink.reporterror("44453, " + 163 + ", " + local597.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method586() {
		try {
			this.method591();
			if (this.anInt886 == 1) {
				this.aClass1_Sub1_Sub3_Sub4Array5[this.anInt885 / 100].method529(this.anInt883 - 8 - 4, this.anInt884 - 8 - 4);
			}
			if (this.anInt886 == 2) {
				this.aClass1_Sub1_Sub3_Sub4Array5[this.anInt885 / 100 + 4].method529(this.anInt883 - 8 - 4, this.anInt884 - 8 - 4);
			}
			if (this.anInt929 != -1) {
				this.method642(this.anInt819, this.anInt929);
				this.method629(0, 0, 0, Class6.aClass6Array1[this.anInt929]);
			}
			if (this.anInt823 != -1) {
				this.method642(this.anInt819, this.anInt823);
				this.method629(0, 0, 0, Class6.aClass6Array1[this.anInt823]);
			}
			this.method623();
			if (!this.aBoolean200) {
				this.method646(this.aBoolean208);
				this.method564();
			} else if (this.anInt836 == 0) {
				this.method636((byte) 4);
			}
			if (this.anInt850 == 1) {
				this.aClass1_Sub1_Sub3_Sub4Array6[1].method529(472, 296);
			}
			@Pc(171) int local171;
			if (aBoolean202) {
				@Pc(147) byte local147 = 20;
				@Pc(149) int local149 = 16776960;
				if (super.anInt799 < 15) {
					local149 = 16711680;
				}
				this.aClass1_Sub1_Sub3_Sub2_3.method355(20, "Fps:" + super.anInt799, local149);
				local171 = local147 + 15;
				@Pc(173) Runtime local173 = Runtime.getRuntime();
				@Pc(182) int local182 = (int) ((local173.totalMemory() - local173.freeMemory()) / 1024L);
				if (local182 > 33554432 && aBoolean230) {
				}
				this.aClass1_Sub1_Sub3_Sub2_3.method355(35, "Mem:" + local182 + "k", 16776960);
				local171 += 15;
			}
			if (this.anInt1018 != 0) {
				@Pc(216) int local216 = this.anInt1018 / 50;
				local171 = local216 / 60;
				@Pc(224) int local224 = local216 % 60;
				if (local224 < 10) {
					this.aClass1_Sub1_Sub3_Sub2_3.method360(16776960, 329, "System update in: " + local171 + ":0" + local224, 4);
				} else {
					this.aClass1_Sub1_Sub3_Sub2_3.method360(16776960, 329, "System update in: " + local171 + ":" + local224, 4);
				}
			}
		} catch (@Pc(266) RuntimeException local266) {
			signlink.reporterror("73666, " + 0 + ", " + local266.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method587() {
		try {
			this.aBoolean222 = true;
			for (@Pc(6) int local6 = 0; local6 < 7; local6++) {
				this.anIntArray255[local6] = -1;
				for (@Pc(15) int local15 = 0; local15 < Class37.anInt627; local15++) {
					if (!Class37.aClass37Array1[local15].aBoolean148 && Class37.aClass37Array1[local15].anInt628 == local6 + (this.aBoolean236 ? 0 : 7)) {
						this.anIntArray255[local6] = local15;
						break;
					}
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("36789, " + 1 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method588() {
		try {
			if (super.anInt809 == 1) {
				if (super.anInt810 >= 6 && super.anInt810 <= 106 && super.anInt811 >= 467 && super.anInt811 <= 499) {
					this.anInt834 = (this.anInt834 + 1) % 4;
					this.aBoolean226 = true;
					this.aBoolean205 = true;
					this.aClass1_Sub1_Sub2_7.method11(23);
					this.aClass1_Sub1_Sub2_7.method12(this.anInt834);
					this.aClass1_Sub1_Sub2_7.method12(this.anInt930);
					this.aClass1_Sub1_Sub2_7.method12(this.anInt847);
				}
				if (super.anInt810 >= 135 && super.anInt810 <= 235 && super.anInt811 >= 467 && super.anInt811 <= 499) {
					this.anInt930 = (this.anInt930 + 1) % 3;
					this.aBoolean226 = true;
					this.aBoolean205 = true;
					this.aClass1_Sub1_Sub2_7.method11(23);
					this.aClass1_Sub1_Sub2_7.method12(this.anInt834);
					this.aClass1_Sub1_Sub2_7.method12(this.anInt930);
					this.aClass1_Sub1_Sub2_7.method12(this.anInt847);
				}
				if (super.anInt810 >= 273 && super.anInt810 <= 373 && super.anInt811 >= 467 && super.anInt811 <= 499) {
					this.anInt847 = (this.anInt847 + 1) % 3;
					this.aBoolean226 = true;
					this.aBoolean205 = true;
					this.aClass1_Sub1_Sub2_7.method11(23);
					this.aClass1_Sub1_Sub2_7.method12(this.anInt834);
					this.aClass1_Sub1_Sub2_7.method12(this.anInt930);
					this.aClass1_Sub1_Sub2_7.method12(this.anInt847);
				}
				if (super.anInt810 >= 412 && super.anInt810 <= 512 && super.anInt811 >= 467 && super.anInt811 <= 499) {
					if (this.anInt823 == -1) {
						this.method616();
						this.aString26 = "";
						this.aBoolean227 = false;
						for (@Pc(191) int local191 = 0; local191 < Class6.aClass6Array1.length; local191++) {
							if (Class6.aClass6Array1[local191] != null && Class6.aClass6Array1[local191].anInt70 == 600) {
								this.anInt816 = this.anInt823 = Class6.aClass6Array1[local191].anInt56;
								return;
							}
						}
						return;
					}
					this.method607("Please close the interface you have open before using 'report abuse'", "", (byte) 1, 0);
					return;
				}
			}
		} catch (@Pc(227) RuntimeException local227) {
			signlink.reporterror("71787, " + 3 + ", " + local227.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method589(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != -37066) {
				this.aClass1_Sub1_Sub2_7.method12(211);
			}
			while (true) {
				@Pc(12) int local12;
				do {
					while (true) {
						local12 = this.method543();
						if (local12 == -1) {
							return;
						}
						if (this.anInt823 != -1 && this.anInt823 == this.anInt816) {
							if (local12 == 8 && this.aString26.length() > 0) {
								this.aString26 = this.aString26.substring(0, this.aString26.length() - 1);
							}
							break;
						}
						@Pc(194) int local194;
						if (this.aBoolean192) {
							if (local12 >= 32 && local12 <= 122 && this.aString19.length() < 80) {
								this.aString19 = this.aString19 + (char) local12;
								this.aBoolean205 = true;
							}
							if (local12 == 8 && this.aString19.length() > 0) {
								this.aString19 = this.aString19.substring(0, this.aString19.length() - 1);
								this.aBoolean205 = true;
							}
							if (local12 == 13 || local12 == 10) {
								this.aBoolean192 = false;
								this.aBoolean205 = true;
								@Pc(152) long local152;
								if (this.anInt936 == 1) {
									local152 = Class31.method379(this.aString19);
									this.method569(local152, this.aBoolean235);
								}
								if (this.anInt936 == 2 && this.anInt887 > 0) {
									local152 = Class31.method379(this.aString19);
									this.method647(local152, this.anInt954);
								}
								if (this.anInt936 == 3 && this.aString19.length() > 0) {
									this.aClass1_Sub1_Sub2_7.method11(75);
									this.aClass1_Sub1_Sub2_7.method12(0);
									local194 = this.aClass1_Sub1_Sub2_7.anInt10;
									this.aClass1_Sub1_Sub2_7.method18(this.aLong31);
									Class46.method501(this.aClass1_Sub1_Sub2_7, this.aString19);
									this.aClass1_Sub1_Sub2_7.method21(this.aClass1_Sub1_Sub2_7.anInt10 - local194);
									this.aString19 = Class46.method502(this.aString19);
									this.aString19 = Class20.method280(this.aString19);
									this.method607(this.aString19, Class31.method383(Class31.method380(this.aLong31)), (byte) 1, 6);
									if (this.anInt930 == 2) {
										this.anInt930 = 1;
										this.aBoolean226 = true;
										this.aClass1_Sub1_Sub2_7.method11(23);
										this.aClass1_Sub1_Sub2_7.method12(this.anInt834);
										this.aClass1_Sub1_Sub2_7.method12(this.anInt930);
										this.aClass1_Sub1_Sub2_7.method12(this.anInt847);
									}
								}
								if (this.anInt936 == 4 && this.anInt953 < 100) {
									local152 = Class31.method379(this.aString19);
									this.method552(local152);
								}
								if (this.anInt936 == 5 && this.anInt953 > 0) {
									local152 = Class31.method379(this.aString19);
									this.method590(local152);
								}
							}
						} else if (this.aBoolean214) {
							if (local12 >= 48 && local12 <= 57 && this.aString17.length() < 10) {
								this.aString17 = this.aString17 + (char) local12;
								this.aBoolean205 = true;
							}
							if (local12 == 8 && this.aString17.length() > 0) {
								this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
								this.aBoolean205 = true;
							}
							if (local12 == 13 || local12 == 10) {
								if (this.aString17.length() > 0) {
									local194 = 0;
									try {
										local194 = Integer.parseInt(this.aString17);
									} catch (@Pc(370) Exception local370) {
									}
									this.aClass1_Sub1_Sub2_7.method11(135);
									this.aClass1_Sub1_Sub2_7.method16(local194);
								}
								this.aBoolean214 = false;
								this.aBoolean205 = true;
							}
						} else if (this.anInt991 == -1) {
							if (local12 >= 32 && local12 <= 122 && this.aString25.length() < 80) {
								this.aString25 = this.aString25 + (char) local12;
								this.aBoolean205 = true;
							}
							if (local12 == 8 && this.aString25.length() > 0) {
								this.aString25 = this.aString25.substring(0, this.aString25.length() - 1);
								this.aBoolean205 = true;
							}
							if ((local12 == 13 || local12 == 10) && this.aString25.length() > 0) {
								if (this.anInt1003 == 2) {
									if (this.aString25.equals("::clientdrop")) {
										this.method641();
									}
									if (this.aString25.equals("::lag")) {
										this.method656(this.aBoolean211);
									}
									if (this.aString25.equals("::prefetchmusic")) {
										for (local194 = 0; local194 < this.aClass7_Sub1_1.method53(2, aByte46); local194++) {
											this.aClass7_Sub1_1.method66(2, (byte) 1, local194);
										}
									}
									if (this.aString25.equals("::fpson")) {
										aBoolean202 = true;
									}
									if (this.aString25.equals("::fpsoff")) {
										aBoolean202 = false;
									}
								}
								if (this.aString25.startsWith("::")) {
									this.aClass1_Sub1_Sub2_7.method11(128);
									this.aClass1_Sub1_Sub2_7.method12(this.aString25.length() - 1);
									this.aClass1_Sub1_Sub2_7.method19(this.aString25.substring(2));
								} else {
									@Pc(538) String local538 = this.aString25.toLowerCase();
									@Pc(540) byte local540 = 0;
									if (local538.startsWith("yellow:")) {
										local540 = 0;
										this.aString25 = this.aString25.substring(7);
									} else if (local538.startsWith("red:")) {
										local540 = 1;
										this.aString25 = this.aString25.substring(4);
									} else if (local538.startsWith("green:")) {
										local540 = 2;
										this.aString25 = this.aString25.substring(6);
									} else if (local538.startsWith("cyan:")) {
										local540 = 3;
										this.aString25 = this.aString25.substring(5);
									} else if (local538.startsWith("purple:")) {
										local540 = 4;
										this.aString25 = this.aString25.substring(7);
									} else if (local538.startsWith("white:")) {
										local540 = 5;
										this.aString25 = this.aString25.substring(6);
									} else if (local538.startsWith("flash1:")) {
										local540 = 6;
										this.aString25 = this.aString25.substring(7);
									} else if (local538.startsWith("flash2:")) {
										local540 = 7;
										this.aString25 = this.aString25.substring(7);
									} else if (local538.startsWith("flash3:")) {
										local540 = 8;
										this.aString25 = this.aString25.substring(7);
									} else if (local538.startsWith("glow1:")) {
										local540 = 9;
										this.aString25 = this.aString25.substring(6);
									} else if (local538.startsWith("glow2:")) {
										local540 = 10;
										this.aString25 = this.aString25.substring(6);
									} else if (local538.startsWith("glow3:")) {
										local540 = 11;
										this.aString25 = this.aString25.substring(6);
									}
									local538 = this.aString25.toLowerCase();
									@Pc(712) byte local712 = 0;
									if (local538.startsWith("wave:")) {
										local712 = 1;
										this.aString25 = this.aString25.substring(5);
									} else if (local538.startsWith("wave2:")) {
										local712 = 2;
										this.aString25 = this.aString25.substring(6);
									} else if (local538.startsWith("shake:")) {
										local712 = 3;
										this.aString25 = this.aString25.substring(6);
									} else if (local538.startsWith("scroll:")) {
										local712 = 4;
										this.aString25 = this.aString25.substring(7);
									} else if (local538.startsWith("slide:")) {
										local712 = 5;
										this.aString25 = this.aString25.substring(6);
									}
									this.aClass1_Sub1_Sub2_7.method11(202);
									this.aClass1_Sub1_Sub2_7.method12(0);
									@Pc(793) int local793 = this.aClass1_Sub1_Sub2_7.anInt10;
									this.aClass1_Sub1_Sub2_7.method12(local540);
									this.aClass1_Sub1_Sub2_7.method12(local712);
									this.aClass1_Sub1_Sub2_8.anInt10 = 0;
									Class46.method501(this.aClass1_Sub1_Sub2_8, this.aString25);
									this.aClass1_Sub1_Sub2_7.method20(this.aClass1_Sub1_Sub2_8.anInt10, this.aClass1_Sub1_Sub2_8.aByteArray1);
									this.aClass1_Sub1_Sub2_7.method21(this.aClass1_Sub1_Sub2_7.anInt10 - local793);
									this.aString25 = Class46.method502(this.aString25);
									this.aString25 = Class20.method280(this.aString25);
									aClass1_Sub1_Sub1_Sub3_Sub2_1.aString14 = this.aString25;
									aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt563 = local540;
									aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt554 = local712;
									aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt596 = 150;
									if (this.anInt1003 == 2) {
										this.method607(aClass1_Sub1_Sub1_Sub3_Sub2_1.aString14, "@cr2@" + aClass1_Sub1_Sub1_Sub3_Sub2_1.aString15, (byte) 1, 2);
									} else if (this.anInt1003 == 1) {
										this.method607(aClass1_Sub1_Sub1_Sub3_Sub2_1.aString14, "@cr1@" + aClass1_Sub1_Sub1_Sub3_Sub2_1.aString15, (byte) 1, 2);
									} else {
										this.method607(aClass1_Sub1_Sub1_Sub3_Sub2_1.aString14, aClass1_Sub1_Sub1_Sub3_Sub2_1.aString15, (byte) 1, 2);
									}
									if (this.anInt834 == 2) {
										this.anInt834 = 3;
										this.aBoolean226 = true;
										this.aClass1_Sub1_Sub2_7.method11(23);
										this.aClass1_Sub1_Sub2_7.method12(this.anInt834);
										this.aClass1_Sub1_Sub2_7.method12(this.anInt930);
										this.aClass1_Sub1_Sub2_7.method12(this.anInt847);
									}
								}
								this.aString25 = "";
								this.aBoolean205 = true;
							}
						}
					}
				} while ((local12 < 97 || local12 > 122) && (local12 < 65 || local12 > 90) && (local12 < 48 || local12 > 57) && local12 != 32);
				if (this.aString26.length() < 12) {
					this.aString26 = this.aString26 + (char) local12;
				}
			}
		} catch (@Pc(944) RuntimeException local944) {
			signlink.reporterror("60127, " + arg0 + ", " + local944.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt964 = Integer.parseInt(this.getParameter("nodeid"));
		anInt965 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method577();
		} else {
			method672();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean229 = false;
		} else {
			aBoolean229 = true;
		}
		this.method540();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method590(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(19) int local19 = 0; local19 < this.anInt953; local19++) {
					if (this.aLongArray3[local19] == arg0) {
						this.anInt953--;
						this.aBoolean203 = true;
						for (@Pc(39) int local39 = local19; local39 < this.anInt953; local39++) {
							this.aLongArray3[local39] = this.aLongArray3[local39 + 1];
						}
						this.aClass1_Sub1_Sub2_7.method11(115);
						this.aClass1_Sub1_Sub2_7.method18(arg0);
						return;
					}
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("74444, " + arg0 + ", " + -46474 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method591() {
		try {
			if (this.anInt868 != 0) {
				@Pc(8) Class1_Sub1_Sub3_Sub2 local8 = this.aClass1_Sub1_Sub3_Sub2_3;
				@Pc(10) int local10 = 0;
				if (this.aByte39 != 0) {
					this.method544();
				}
				if (this.anInt1018 != 0) {
					local10 = 1;
				}
				for (@Pc(27) int local27 = 0; local27 < 100; local27++) {
					if (this.aStringArray12[local27] != null) {
						@Pc(39) int local39 = this.anIntArray258[local27];
						@Pc(44) String local44 = this.aStringArray11[local27];
						@Pc(46) byte local46 = 0;
						if (local44 != null && local44.startsWith("@cr1@")) {
							local44 = local44.substring(5);
							local46 = 1;
						}
						if (local44 != null && local44.startsWith("@cr2@")) {
							local44 = local44.substring(5);
							local46 = 2;
						}
						@Pc(97) int local97;
						if ((local39 == 3 || local39 == 7) && (local39 == 7 || this.anInt930 == 0 || this.anInt930 == 1 && this.method560(local44))) {
							local97 = 329 - local10 * 13;
							local8.method360(0, local97, "From", 4);
							local8.method360(65535, local97 - 1, "From", 4);
							@Pc(123) int local123 = local8.method358(this.aBoolean199, "From ") + 4;
							if (local46 == 1) {
								this.aClass1_Sub1_Sub3_Sub3Array5[0].method473(local123, local97 - 12);
								local123 += 14;
							}
							if (local46 == 2) {
								this.aClass1_Sub1_Sub3_Sub3Array5[1].method473(local123, local97 - 12);
								local123 += 14;
							}
							local8.method360(0, local97, local44 + ": " + this.aStringArray12[local27], local123);
							local8.method360(65535, local97 - 1, local44 + ": " + this.aStringArray12[local27], local123);
							local10++;
							if (local10 >= 5) {
								return;
							}
						}
						if (local39 == 5 && this.anInt930 < 2) {
							local97 = 329 - local10 * 13;
							local8.method360(0, local97, this.aStringArray12[local27], 4);
							local8.method360(65535, local97 - 1, this.aStringArray12[local27], 4);
							local10++;
							if (local10 >= 5) {
								return;
							}
						}
						if (local39 == 6 && this.anInt930 < 2) {
							local97 = 329 - local10 * 13;
							local8.method360(0, local97, "To " + local44 + ": " + this.aStringArray12[local27], 4);
							local8.method360(65535, local97 - 1, "To " + local44 + ": " + this.aStringArray12[local27], 4);
							local10++;
							if (local10 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(302) RuntimeException local302) {
			signlink.reporterror("85118, " + 0 + ", " + local302.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!BJPWOXRJ;ZI)V")
	private void method592(@OriginalArg(0) Class1_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		try {
			arg0.method32();
			@Pc(9) int local9 = arg0.method33(8);
			this.aBoolean234 &= true;
			@Pc(21) int local21;
			if (local9 < this.anInt863) {
				for (local21 = local9; local21 < this.anInt863; local21++) {
					this.anIntArray238[this.anInt918++] = this.anIntArray218[local21];
				}
			}
			if (local9 > this.anInt863) {
				signlink.reporterror(this.aString21 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt863 = 0;
			for (local21 = 0; local21 < local9; local21++) {
				@Pc(73) int local73 = this.anIntArray218[local21];
				@Pc(78) Class1_Sub1_Sub1_Sub3_Sub1 local78 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local73];
				@Pc(83) int local83 = arg0.method33(1);
				if (local83 == 0) {
					this.anIntArray218[this.anInt863++] = local73;
					local78.anInt571 = anInt921;
				} else {
					@Pc(106) int local106 = arg0.method33(2);
					if (local106 == 0) {
						this.anIntArray218[this.anInt863++] = local73;
						local78.anInt571 = anInt921;
						this.anIntArray257[this.anInt960++] = local73;
					} else {
						@Pc(157) int local157;
						@Pc(167) int local167;
						if (local106 == 1) {
							this.anIntArray218[this.anInt863++] = local73;
							local78.anInt571 = anInt921;
							local157 = arg0.method33(3);
							local78.method392(false, local157);
							local167 = arg0.method33(1);
							if (local167 == 1) {
								this.anIntArray257[this.anInt960++] = local73;
							}
						} else if (local106 == 2) {
							this.anIntArray218[this.anInt863++] = local73;
							local78.anInt571 = anInt921;
							local157 = arg0.method33(3);
							local78.method392(true, local157);
							local167 = arg0.method33(3);
							local78.method392(true, local167);
							@Pc(225) int local225 = arg0.method33(1);
							if (local225 == 1) {
								this.anIntArray257[this.anInt960++] = local73;
							}
						} else if (local106 == 3) {
							this.anIntArray238[this.anInt918++] = local73;
						}
					}
				}
			}
		} catch (@Pc(262) RuntimeException local262) {
			signlink.reporterror("82318, " + arg0 + ", " + true + ", " + arg1 + ", " + local262.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method593() {
		try {
			this.anInt1014++;
			this.method555(true);
			this.method571((byte) 7, true);
			this.method555(false);
			this.method571((byte) 7, false);
			this.method683();
			this.method638();
			@Pc(35) int local35;
			@Pc(74) int local74;
			if (!this.aBoolean190) {
				local35 = this.anInt841;
				if (this.anInt990 / 256 > local35) {
					local35 = this.anInt990 / 256;
				}
				if (this.aBooleanArray11[4] && this.anIntArray243[4] + 128 > local35) {
					local35 = this.anIntArray243[4] + 128;
				}
				local74 = this.anInt842 + this.anInt961 & 0x7FF;
				this.method568(this.method612(aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt573, 938, aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt574, this.anInt857) - 50, this.anInt899, this.anInt898, local35, local74, local35 * 3 + 600, (byte) 2);
			}
			if (this.aBoolean190) {
				local35 = this.method627();
			} else {
				local35 = this.method626();
			}
			local74 = this.anInt973;
			@Pc(118) int local118 = this.anInt974;
			@Pc(121) int local121 = this.anInt975;
			@Pc(124) int local124 = this.anInt976;
			@Pc(127) int local127 = this.anInt977;
			@Pc(176) int local176;
			for (@Pc(129) int local129 = 0; local129 < 5; local129++) {
				if (this.aBooleanArray11[local129]) {
					local176 = (int) (Math.random() * (double) (this.anIntArray236[local129] * 2 + 1) - (double) this.anIntArray236[local129] + Math.sin((double) this.anIntArray242[local129] * ((double) this.anIntArray219[local129] / 100.0D)) * (double) this.anIntArray243[local129]);
					if (local129 == 0) {
						this.anInt973 += local176;
					}
					if (local129 == 1) {
						this.anInt974 += local176;
					}
					if (local129 == 2) {
						this.anInt975 += local176;
					}
					if (local129 == 3) {
						this.anInt977 = this.anInt977 + local176 & 0x7FF;
					}
					if (local129 == 4) {
						this.anInt976 += local176;
						if (this.anInt976 < 128) {
							this.anInt976 = 128;
						}
						if (this.anInt976 > 383) {
							this.anInt976 = 383;
						}
					}
				}
			}
			local176 = Class1_Sub1_Sub3_Sub1.anInt138;
			Class1_Sub1_Sub1_Sub4.aBoolean88 = true;
			Class1_Sub1_Sub1_Sub4.anInt372 = 0;
			Class1_Sub1_Sub1_Sub4.anInt370 = super.anInt804 - 4;
			Class1_Sub1_Sub1_Sub4.anInt371 = super.anInt805 - 4;
			Class1_Sub1_Sub3.method515();
			this.aClass11_1.method174(local35, this.anInt973, this.anInt974, this.anInt976, this.anInt977, this.anInt975);
			this.aClass11_1.method149((byte) 1);
			this.method618((byte) 9);
			this.method620();
			this.method660(local176);
			this.method586();
			this.aClass48_14.method504(super.aGraphics2, 4, 4);
			this.anInt973 = local74;
			this.anInt974 = local118;
			this.anInt975 = local121;
			this.anInt976 = local124;
			this.anInt977 = local127;
		} catch (@Pc(329) RuntimeException local329) {
			signlink.reporterror("90910, " + 6 + ", " + local329.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method594() {
		try {
			if (super.anInt809 == 1) {
				if (super.anInt810 >= 539 && super.anInt810 <= 573 && super.anInt811 >= 169 && super.anInt811 < 205 && this.anIntArray227[0] != -1) {
					this.aBoolean203 = true;
					this.anInt994 = 0;
					this.aBoolean206 = true;
				}
				if (super.anInt810 >= 569 && super.anInt810 <= 599 && super.anInt811 >= 168 && super.anInt811 < 205 && this.anIntArray227[1] != -1) {
					this.aBoolean203 = true;
					this.anInt994 = 1;
					this.aBoolean206 = true;
				}
				if (super.anInt810 >= 597 && super.anInt810 <= 627 && super.anInt811 >= 168 && super.anInt811 < 205 && this.anIntArray227[2] != -1) {
					this.aBoolean203 = true;
					this.anInt994 = 2;
					this.aBoolean206 = true;
				}
				if (super.anInt810 >= 625 && super.anInt810 <= 669 && super.anInt811 >= 168 && super.anInt811 < 203 && this.anIntArray227[3] != -1) {
					this.aBoolean203 = true;
					this.anInt994 = 3;
					this.aBoolean206 = true;
				}
				if (super.anInt810 >= 666 && super.anInt810 <= 696 && super.anInt811 >= 168 && super.anInt811 < 205 && this.anIntArray227[4] != -1) {
					this.aBoolean203 = true;
					this.anInt994 = 4;
					this.aBoolean206 = true;
				}
				if (super.anInt810 >= 694 && super.anInt810 <= 724 && super.anInt811 >= 168 && super.anInt811 < 205 && this.anIntArray227[5] != -1) {
					this.aBoolean203 = true;
					this.anInt994 = 5;
					this.aBoolean206 = true;
				}
				if (super.anInt810 >= 722 && super.anInt810 <= 756 && super.anInt811 >= 169 && super.anInt811 < 205 && this.anIntArray227[6] != -1) {
					this.aBoolean203 = true;
					this.anInt994 = 6;
					this.aBoolean206 = true;
				}
				if (super.anInt810 >= 540 && super.anInt810 <= 574 && super.anInt811 >= 466 && super.anInt811 < 502 && this.anIntArray227[7] != -1) {
					this.aBoolean203 = true;
					this.anInt994 = 7;
					this.aBoolean206 = true;
				}
				if (super.anInt810 >= 572 && super.anInt810 <= 602 && super.anInt811 >= 466 && super.anInt811 < 503 && this.anIntArray227[8] != -1) {
					this.aBoolean203 = true;
					this.anInt994 = 8;
					this.aBoolean206 = true;
				}
				if (super.anInt810 >= 599 && super.anInt810 <= 629 && super.anInt811 >= 466 && super.anInt811 < 503 && this.anIntArray227[9] != -1) {
					this.aBoolean203 = true;
					this.anInt994 = 9;
					this.aBoolean206 = true;
				}
				if (super.anInt810 >= 627 && super.anInt810 <= 671 && super.anInt811 >= 467 && super.anInt811 < 502 && this.anIntArray227[10] != -1) {
					this.aBoolean203 = true;
					this.anInt994 = 10;
					this.aBoolean206 = true;
				}
				if (super.anInt810 >= 669 && super.anInt810 <= 699 && super.anInt811 >= 466 && super.anInt811 < 503 && this.anIntArray227[11] != -1) {
					this.aBoolean203 = true;
					this.anInt994 = 11;
					this.aBoolean206 = true;
				}
				if (super.anInt810 >= 696 && super.anInt810 <= 726 && super.anInt811 >= 466 && super.anInt811 < 503 && this.anIntArray227[12] != -1) {
					this.aBoolean203 = true;
					this.anInt994 = 12;
					this.aBoolean206 = true;
				}
				if (super.anInt810 >= 724 && super.anInt810 <= 758 && super.anInt811 >= 466 && super.anInt811 < 502 && this.anIntArray227[13] != -1) {
					this.aBoolean203 = true;
					this.anInt994 = 13;
					this.aBoolean206 = true;
					return;
				}
			}
		} catch (@Pc(444) RuntimeException local444) {
			signlink.reporterror("22951, " + false + ", " + local444.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean225) {
			this.method621((byte) 5);
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method595(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(7) int local7 = 5;
			this.anIntArray235[8] = 0;
			@Pc(14) int local14 = 0;
			while (this.anIntArray235[8] == 0) {
				@Pc(18) String local18 = "Unknown problem";
				this.method551("Connecting to web server", 20);
				try {
					@Pc(40) DataInputStream local40 = this.method563("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 306);
					@Pc(47) Class1_Sub1_Sub2 local47 = new Class1_Sub1_Sub2(false, new byte[40]);
					local40.readFully(local47.aByteArray1, 0, 40);
					local40.close();
					for (@Pc(57) int local57 = 0; local57 < 9; local57++) {
						this.anIntArray235[local57] = local47.method27();
					}
					@Pc(72) int local72 = local47.method27();
					@Pc(74) int local74 = 1234;
					for (@Pc(76) int local76 = 0; local76 < 9; local76++) {
						local74 = (local74 << 1) + this.anIntArray235[local76];
					}
					if (local72 != local74) {
						local18 = "checksum problem";
						this.anIntArray235[8] = 0;
					}
				} catch (@Pc(103) EOFException local103) {
					local18 = "EOF problem";
					this.anIntArray235[8] = 0;
				} catch (@Pc(112) IOException local112) {
					local18 = "connection problem";
					this.anIntArray235[8] = 0;
				} catch (@Pc(121) Exception local121) {
					local18 = "logic problem";
					this.anIntArray235[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray235[8] == 0) {
					local14++;
					for (@Pc(139) int local139 = local7; local139 > 0; local139--) {
						if (local14 >= 10) {
							this.method551("Game updated - please reload page", 10);
							local139 = 10;
						} else {
							this.method551(local18 + " - Will retry in " + local139 + " secs.", 10);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(173) Exception local173) {
						}
					}
					local7 *= 2;
					if (local7 > 60) {
						local7 = 60;
					}
					this.aBoolean219 = !this.aBoolean219;
				}
			}
		} catch (@Pc(201) RuntimeException local201) {
			signlink.reporterror("42416, " + arg0 + ", " + local201.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method596() {
		try {
			for (@Pc(9) int local9 = 0; local9 < this.anInt863; local9++) {
				@Pc(16) int local16 = this.anIntArray218[local9];
				@Pc(21) Class1_Sub1_Sub1_Sub3_Sub1 local21 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local16];
				if (local21 != null) {
					this.method597(local21, local21.aClass38_1.aByte26);
				}
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("10762, " + -9317 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!NUUJCJXB;BI)V")
	private void method597(@OriginalArg(0) Class1_Sub1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			if (arg0.anInt573 < 128 || arg0.anInt574 < 128 || arg0.anInt573 >= 13184 || arg0.anInt574 >= 13184) {
				arg0.anInt590 = -1;
				arg0.anInt564 = -1;
				arg0.anInt559 = 0;
				arg0.anInt560 = 0;
				arg0.anInt573 = arg0.anIntArray155[0] * 128 + arg0.anInt570 * 64;
				arg0.anInt574 = arg0.anIntArray156[0] * 128 + arg0.anInt570 * 64;
				arg0.method391();
			}
			if (arg0 == aClass1_Sub1_Sub1_Sub3_Sub2_1 && (arg0.anInt573 < 1536 || arg0.anInt574 < 1536 || arg0.anInt573 >= 11776 || arg0.anInt574 >= 11776)) {
				arg0.anInt590 = -1;
				arg0.anInt564 = -1;
				arg0.anInt559 = 0;
				arg0.anInt560 = 0;
				arg0.anInt573 = arg0.anIntArray155[0] * 128 + arg0.anInt570 * 64;
				arg0.anInt574 = arg0.anIntArray156[0] * 128 + arg0.anInt570 * 64;
				arg0.method391();
			}
			if (arg0.anInt559 > anInt921) {
				this.method598(arg0);
			} else if (arg0.anInt560 >= anInt921) {
				this.method599(arg0);
			} else {
				this.method600(arg0, this.aBoolean216);
			}
			this.method601(arg0, this.anInt944);
			this.method602(arg0);
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("15658, " + arg0 + ", " + 44 + ", " + arg1 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!NUUJCJXB;Z)V")
	private void method598(@OriginalArg(0) Class1_Sub1_Sub1_Sub3 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt559 - anInt921;
			@Pc(14) int local14 = arg0.anInt555 * 128 + arg0.anInt570 * 64;
			@Pc(24) int local24 = arg0.anInt557 * 128 + arg0.anInt570 * 64;
			arg0.anInt573 += (local14 - arg0.anInt573) / local4;
			this.aBoolean234 &= true;
			arg0.anInt574 += (local24 - arg0.anInt574) / local4;
			arg0.anInt595 = 0;
			if (arg0.anInt561 == 0) {
				arg0.anInt562 = 1024;
			}
			if (arg0.anInt561 == 1) {
				arg0.anInt562 = 1536;
			}
			if (arg0.anInt561 == 2) {
				arg0.anInt562 = 0;
			}
			if (arg0.anInt561 == 3) {
				arg0.anInt562 = 512;
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("40457, " + arg0 + ", " + true + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!NUUJCJXB;)V")
	private void method599(@OriginalArg(1) Class1_Sub1_Sub1_Sub3 arg0) {
		try {
			if (arg0.anInt560 == anInt921 || arg0.anInt590 == -1 || arg0.anInt593 != 0 || arg0.anInt592 + 1 > Class29.aClass29Array1[arg0.anInt590].method377(arg0.anInt591, this.aBoolean223)) {
				@Pc(30) int local30 = arg0.anInt560 - arg0.anInt559;
				@Pc(35) int local35 = anInt921 - arg0.anInt559;
				@Pc(45) int local45 = arg0.anInt555 * 128 + arg0.anInt570 * 64;
				@Pc(55) int local55 = arg0.anInt557 * 128 + arg0.anInt570 * 64;
				@Pc(65) int local65 = arg0.anInt556 * 128 + arg0.anInt570 * 64;
				@Pc(75) int local75 = arg0.anInt558 * 128 + arg0.anInt570 * 64;
				arg0.anInt573 = (local45 * (local30 - local35) + local65 * local35) / local30;
				arg0.anInt574 = (local55 * (local30 - local35) + local75 * local35) / local30;
			}
			arg0.anInt595 = 0;
			if (arg0.anInt561 == 0) {
				arg0.anInt562 = 1024;
			}
			if (arg0.anInt561 == 1) {
				arg0.anInt562 = 1536;
			}
			if (arg0.anInt561 == 2) {
				arg0.anInt562 = 0;
			}
			if (arg0.anInt561 == 3) {
				arg0.anInt562 = 512;
			}
			arg0.anInt575 = arg0.anInt562;
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("13304, " + 0 + ", " + arg0 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!NUUJCJXB;Z)V")
	private void method600(@OriginalArg(0) Class1_Sub1_Sub1_Sub3 arg0, @OriginalArg(1) boolean arg1) {
		try {
			arg0.anInt583 = arg0.anInt598;
			if (arg1) {
				if (arg0.anInt597 == 0) {
					arg0.anInt595 = 0;
				} else {
					if (arg0.anInt590 != -1 && arg0.anInt593 == 0) {
						@Pc(27) Class29 local27 = Class29.aClass29Array1[arg0.anInt590];
						if (arg0.anInt600 > 0 && local27.anInt508 == 0) {
							arg0.anInt595++;
							return;
						}
						if (arg0.anInt600 <= 0 && local27.anInt509 == 0) {
							arg0.anInt595++;
							return;
						}
					}
					@Pc(56) int local56 = arg0.anInt573;
					@Pc(59) int local59 = arg0.anInt574;
					@Pc(74) int local74 = arg0.anIntArray155[arg0.anInt597 - 1] * 128 + arg0.anInt570 * 64;
					@Pc(89) int local89 = arg0.anIntArray156[arg0.anInt597 - 1] * 128 + arg0.anInt570 * 64;
					if (local74 - local56 <= 256 && local74 - local56 >= -256 && local89 - local59 <= 256 && local89 - local59 >= -256) {
						if (local56 < local74) {
							if (local59 < local89) {
								arg0.anInt562 = 1280;
							} else if (local59 > local89) {
								arg0.anInt562 = 1792;
							} else {
								arg0.anInt562 = 1536;
							}
						} else if (local56 > local74) {
							if (local59 < local89) {
								arg0.anInt562 = 768;
							} else if (local59 > local89) {
								arg0.anInt562 = 256;
							} else {
								arg0.anInt562 = 512;
							}
						} else if (local59 < local89) {
							arg0.anInt562 = 1024;
						} else {
							arg0.anInt562 = 0;
						}
						@Pc(183) int local183 = arg0.anInt562 - arg0.anInt575 & 0x7FF;
						if (local183 > 1024) {
							local183 -= 2048;
						}
						@Pc(190) int local190 = arg0.anInt587;
						if (local183 >= -256 && local183 <= 256) {
							local190 = arg0.anInt586;
						} else if (local183 >= 256 && local183 < 768) {
							local190 = arg0.anInt589;
						} else if (local183 >= -768 && local183 <= -256) {
							local190 = arg0.anInt588;
						}
						if (local190 == -1) {
							local190 = arg0.anInt586;
						}
						arg0.anInt583 = local190;
						@Pc(232) int local232 = 4;
						if (arg0.anInt575 != arg0.anInt562 && arg0.anInt582 == -1 && arg0.anInt579 != 0) {
							local232 = 2;
						}
						if (arg0.anInt597 > 2) {
							local232 = 6;
						}
						if (arg0.anInt597 > 3) {
							local232 = 8;
						}
						if (arg0.anInt595 > 0 && arg0.anInt597 > 1) {
							local232 = 8;
							arg0.anInt595--;
						}
						if (arg0.aBooleanArray9[arg0.anInt597 - 1]) {
							local232 <<= 0x1;
						}
						if (local232 >= 8 && arg0.anInt583 == arg0.anInt586 && arg0.anInt569 != -1) {
							arg0.anInt583 = arg0.anInt569;
						}
						if (local56 < local74) {
							arg0.anInt573 += local232;
							if (arg0.anInt573 > local74) {
								arg0.anInt573 = local74;
							}
						} else if (local56 > local74) {
							arg0.anInt573 -= local232;
							if (arg0.anInt573 < local74) {
								arg0.anInt573 = local74;
							}
						}
						if (local59 < local89) {
							arg0.anInt574 += local232;
							if (arg0.anInt574 > local89) {
								arg0.anInt574 = local89;
							}
						} else if (local59 > local89) {
							arg0.anInt574 -= local232;
							if (arg0.anInt574 < local89) {
								arg0.anInt574 = local89;
							}
						}
						if (arg0.anInt573 == local74 && arg0.anInt574 == local89) {
							arg0.anInt597--;
							if (arg0.anInt600 > 0) {
								arg0.anInt600--;
								return;
							}
						}
					} else {
						arg0.anInt573 = local74;
						arg0.anInt574 = local89;
					}
				}
			}
		} catch (@Pc(394) RuntimeException local394) {
			signlink.reporterror("45387, " + arg0 + ", " + arg1 + ", " + local394.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!NUUJCJXB;I)V")
	private void method601(@OriginalArg(0) Class1_Sub1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 >= 0) {
				this.anInt993 = 441;
			}
			if (arg0.anInt579 != 0) {
				@Pc(32) int local32;
				@Pc(38) int local38;
				if (arg0.anInt582 != -1 && arg0.anInt582 < 32768) {
					@Pc(24) Class1_Sub1_Sub1_Sub3_Sub1 local24 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[arg0.anInt582];
					if (local24 != null) {
						local32 = arg0.anInt573 - local24.anInt573;
						local38 = arg0.anInt574 - local24.anInt574;
						if (local32 != 0 || local38 != 0) {
							arg0.anInt562 = (int) (Math.atan2((double) local32, (double) local38) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(63) int local63;
				if (arg0.anInt582 >= 32768) {
					local63 = arg0.anInt582 - 32768;
					if (local63 == this.anInt818) {
						local63 = this.anInt958;
					}
					@Pc(75) Class1_Sub1_Sub1_Sub3_Sub2 local75 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local63];
					if (local75 != null) {
						local38 = arg0.anInt573 - local75.anInt573;
						@Pc(89) int local89 = arg0.anInt574 - local75.anInt574;
						if (local38 != 0 || local89 != 0) {
							arg0.anInt562 = (int) (Math.atan2((double) local38, (double) local89) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt580 != 0 || arg0.anInt581 != 0) && (arg0.anInt597 == 0 || arg0.anInt595 > 0)) {
					local63 = arg0.anInt573 - (arg0.anInt580 - this.anInt931 - this.anInt931) * 64;
					local32 = arg0.anInt574 - (arg0.anInt581 - this.anInt932 - this.anInt932) * 64;
					if (local63 != 0 || local32 != 0) {
						arg0.anInt562 = (int) (Math.atan2((double) local63, (double) local32) * 325.949D) & 0x7FF;
					}
					arg0.anInt580 = 0;
					arg0.anInt581 = 0;
				}
				local63 = arg0.anInt562 - arg0.anInt575 & 0x7FF;
				if (local63 != 0) {
					if (local63 < arg0.anInt579 || local63 > 2048 - arg0.anInt579) {
						arg0.anInt575 = arg0.anInt562;
					} else if (local63 > 1024) {
						arg0.anInt575 -= arg0.anInt579;
					} else {
						arg0.anInt575 += arg0.anInt579;
					}
					arg0.anInt575 &= 0x7FF;
					if (arg0.anInt583 == arg0.anInt598 && arg0.anInt575 != arg0.anInt562) {
						if (arg0.anInt599 != -1) {
							arg0.anInt583 = arg0.anInt599;
							return;
						}
						arg0.anInt583 = arg0.anInt586;
						return;
					}
				}
			}
		} catch (@Pc(243) RuntimeException local243) {
			signlink.reporterror("31434, " + arg0 + ", " + arg1 + ", " + local243.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!NUUJCJXB;I)V")
	private void method602(@OriginalArg(0) Class1_Sub1_Sub1_Sub3 arg0) {
		try {
			arg0.aBoolean142 = false;
			@Pc(20) Class29 local20;
			if (arg0.anInt583 != -1) {
				local20 = Class29.aClass29Array1[arg0.anInt583];
				arg0.anInt585++;
				if (arg0.anInt584 < local20.anInt502 && arg0.anInt585 > local20.method377(arg0.anInt584, this.aBoolean223)) {
					arg0.anInt585 = 0;
					arg0.anInt584++;
				}
				if (arg0.anInt584 >= local20.anInt502) {
					arg0.anInt585 = 0;
					arg0.anInt584 = 0;
				}
			}
			if (arg0.anInt564 != -1 && anInt921 >= arg0.anInt567) {
				if (arg0.anInt565 < 0) {
					arg0.anInt565 = 0;
				}
				local20 = Class25.aClass25Array1[arg0.anInt564].aClass29_1;
				arg0.anInt566++;
				while (arg0.anInt565 < local20.anInt502 && arg0.anInt566 > local20.method377(arg0.anInt565, this.aBoolean223)) {
					arg0.anInt566 -= local20.method377(arg0.anInt565, this.aBoolean223);
					arg0.anInt565++;
				}
				if (arg0.anInt565 >= local20.anInt502 && (arg0.anInt565 < 0 || arg0.anInt565 >= local20.anInt502)) {
					arg0.anInt564 = -1;
				}
			}
			if (arg0.anInt590 != -1 && arg0.anInt593 <= 1) {
				local20 = Class29.aClass29Array1[arg0.anInt590];
				if (local20.anInt508 == 1 && arg0.anInt600 > 0 && arg0.anInt559 <= anInt921 && arg0.anInt560 < anInt921) {
					arg0.anInt593 = 1;
					return;
				}
			}
			if (arg0.anInt590 != -1 && arg0.anInt593 == 0) {
				local20 = Class29.aClass29Array1[arg0.anInt590];
				arg0.anInt592++;
				while (arg0.anInt591 < local20.anInt502 && arg0.anInt592 > local20.method377(arg0.anInt591, this.aBoolean223)) {
					arg0.anInt592 -= local20.method377(arg0.anInt591, this.aBoolean223);
					arg0.anInt591++;
				}
				if (arg0.anInt591 >= local20.anInt502) {
					arg0.anInt591 -= local20.anInt503;
					arg0.anInt594++;
					if (arg0.anInt594 >= local20.anInt507) {
						arg0.anInt590 = -1;
					}
					if (arg0.anInt591 < 0 || arg0.anInt591 >= local20.anInt502) {
						arg0.anInt590 = -1;
					}
				}
				arg0.aBoolean142 = local20.aBoolean131;
			}
			if (arg0.anInt593 > 0) {
				arg0.anInt593--;
			}
		} catch (@Pc(270) RuntimeException local270) {
			signlink.reporterror("67675, " + arg0 + ", " + -29665 + ", " + local270.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method603() {
		try {
			if (this.aBoolean231) {
				this.aBoolean231 = false;
				this.aClass48_16.method504(super.aGraphics2, 4, 0);
				this.aClass48_17.method504(super.aGraphics2, 357, 0);
				this.aClass48_18.method504(super.aGraphics2, 4, 722);
				this.aClass48_19.method504(super.aGraphics2, 205, 743);
				this.aClass48_20.method504(super.aGraphics2, 0, 0);
				this.aClass48_21.method504(super.aGraphics2, 4, 516);
				this.aClass48_22.method504(super.aGraphics2, 205, 516);
				this.aClass48_23.method504(super.aGraphics2, 357, 496);
				this.aClass48_24.method504(super.aGraphics2, 338, 0);
				this.aBoolean203 = true;
				this.aBoolean205 = true;
				this.aBoolean206 = true;
				this.aBoolean226 = true;
				if (this.anInt1004 != 2) {
					this.aClass48_14.method504(super.aGraphics2, 4, 4);
					this.aClass48_13.method504(super.aGraphics2, 4, 550);
				}
			}
			if (this.anInt1004 == 2) {
				this.method593();
			}
			if (this.aBoolean200 && this.anInt836 == 1) {
				this.aBoolean203 = true;
			}
			@Pc(138) boolean local138;
			if (this.anInt935 != -1) {
				local138 = this.method642(this.anInt819, this.anInt935);
				if (local138) {
					this.aBoolean203 = true;
				}
			}
			if (this.anInt940 == 2) {
				this.aBoolean203 = true;
			}
			if (this.anInt895 == 2) {
				this.aBoolean203 = true;
			}
			if (this.aBoolean203) {
				this.method628();
				this.aBoolean203 = false;
			}
			if (this.anInt991 == -1) {
				this.aClass6_1.anInt65 = this.anInt971 - this.anInt902 - 77;
				if (super.anInt804 > 448 && super.anInt804 < 560 && super.anInt805 > 332) {
					this.method608(super.anInt804 - 17, super.anInt805 - 357, false, 77, 463, 0, this.anInt971, this.aClass6_1);
				}
				@Pc(220) int local220 = this.anInt971 - this.aClass6_1.anInt65 - 77;
				if (local220 < 0) {
					local220 = 0;
				}
				if (local220 > this.anInt971 - 77) {
					local220 = this.anInt971 - 77;
				}
				if (this.anInt902 != local220) {
					this.anInt902 = local220;
					this.aBoolean205 = true;
				}
			}
			if (this.anInt991 != -1) {
				local138 = this.method642(this.anInt819, this.anInt991);
				if (local138) {
					this.aBoolean205 = true;
				}
			}
			if (this.anInt940 == 3) {
				this.aBoolean205 = true;
			}
			if (this.anInt895 == 3) {
				this.aBoolean205 = true;
			}
			if (this.aString23 != null) {
				this.aBoolean205 = true;
			}
			if (this.aBoolean200 && this.anInt836 == 2) {
				this.aBoolean205 = true;
			}
			if (this.aBoolean205) {
				this.method640();
				this.aBoolean205 = false;
			}
			if (this.anInt1004 == 2) {
				this.method585();
				this.aClass48_13.method504(super.aGraphics2, 4, 550);
				anInt904++;
				if (anInt904 > 75) {
					anInt904 = 0;
					this.aClass1_Sub1_Sub2_7.method11(172);
				}
			}
			if (this.anInt892 != -1) {
				this.aBoolean206 = true;
			}
			if (this.aBoolean206) {
				if (this.anInt892 != -1 && this.anInt892 == this.anInt994) {
					this.anInt892 = -1;
					this.aClass1_Sub1_Sub2_7.method11(74);
					this.aClass1_Sub1_Sub2_7.method12(this.anInt994);
				}
				this.aBoolean206 = false;
				this.aClass48_27.method503();
				this.aClass1_Sub1_Sub3_Sub3_3.method473(0, 0);
				if (this.anInt935 == -1) {
					if (this.anIntArray227[this.anInt994] != -1) {
						if (this.anInt994 == 0) {
							this.aClass1_Sub1_Sub3_Sub3_13.method473(22, 10);
						}
						if (this.anInt994 == 1) {
							this.aClass1_Sub1_Sub3_Sub3_14.method473(54, 8);
						}
						if (this.anInt994 == 2) {
							this.aClass1_Sub1_Sub3_Sub3_14.method473(82, 8);
						}
						if (this.anInt994 == 3) {
							this.aClass1_Sub1_Sub3_Sub3_15.method473(110, 8);
						}
						if (this.anInt994 == 4) {
							this.aClass1_Sub1_Sub3_Sub3_17.method473(153, 8);
						}
						if (this.anInt994 == 5) {
							this.aClass1_Sub1_Sub3_Sub3_17.method473(181, 8);
						}
						if (this.anInt994 == 6) {
							this.aClass1_Sub1_Sub3_Sub3_16.method473(209, 9);
						}
					}
					if (this.anIntArray227[0] != -1 && (this.anInt892 != 0 || anInt921 % 20 < 10)) {
						this.aClass1_Sub1_Sub3_Sub3Array4[0].method473(29, 13);
					}
					if (this.anIntArray227[1] != -1 && (this.anInt892 != 1 || anInt921 % 20 < 10)) {
						this.aClass1_Sub1_Sub3_Sub3Array4[1].method473(53, 11);
					}
					if (this.anIntArray227[2] != -1 && (this.anInt892 != 2 || anInt921 % 20 < 10)) {
						this.aClass1_Sub1_Sub3_Sub3Array4[2].method473(82, 11);
					}
					if (this.anIntArray227[3] != -1 && (this.anInt892 != 3 || anInt921 % 20 < 10)) {
						this.aClass1_Sub1_Sub3_Sub3Array4[3].method473(115, 12);
					}
					if (this.anIntArray227[4] != -1 && (this.anInt892 != 4 || anInt921 % 20 < 10)) {
						this.aClass1_Sub1_Sub3_Sub3Array4[4].method473(153, 13);
					}
					if (this.anIntArray227[5] != -1 && (this.anInt892 != 5 || anInt921 % 20 < 10)) {
						this.aClass1_Sub1_Sub3_Sub3Array4[5].method473(180, 11);
					}
					if (this.anIntArray227[6] != -1 && (this.anInt892 != 6 || anInt921 % 20 < 10)) {
						this.aClass1_Sub1_Sub3_Sub3Array4[6].method473(208, 13);
					}
				}
				this.aClass48_27.method504(super.aGraphics2, 160, 516);
				this.aClass48_26.method503();
				this.aClass1_Sub1_Sub3_Sub3_2.method473(0, 0);
				if (this.anInt935 == -1) {
					if (this.anIntArray227[this.anInt994] != -1) {
						if (this.anInt994 == 7) {
							this.aClass1_Sub1_Sub3_Sub3_6.method473(42, 0);
						}
						if (this.anInt994 == 8) {
							this.aClass1_Sub1_Sub3_Sub3_7.method473(74, 0);
						}
						if (this.anInt994 == 9) {
							this.aClass1_Sub1_Sub3_Sub3_7.method473(102, 0);
						}
						if (this.anInt994 == 10) {
							this.aClass1_Sub1_Sub3_Sub3_8.method473(130, 1);
						}
						if (this.anInt994 == 11) {
							this.aClass1_Sub1_Sub3_Sub3_10.method473(173, 0);
						}
						if (this.anInt994 == 12) {
							this.aClass1_Sub1_Sub3_Sub3_10.method473(201, 0);
						}
						if (this.anInt994 == 13) {
							this.aClass1_Sub1_Sub3_Sub3_9.method473(229, 0);
						}
					}
					if (this.anIntArray227[8] != -1 && (this.anInt892 != 8 || anInt921 % 20 < 10)) {
						this.aClass1_Sub1_Sub3_Sub3Array4[7].method473(74, 2);
					}
					if (this.anIntArray227[9] != -1 && (this.anInt892 != 9 || anInt921 % 20 < 10)) {
						this.aClass1_Sub1_Sub3_Sub3Array4[8].method473(102, 3);
					}
					if (this.anIntArray227[10] != -1 && (this.anInt892 != 10 || anInt921 % 20 < 10)) {
						this.aClass1_Sub1_Sub3_Sub3Array4[9].method473(137, 4);
					}
					if (this.anIntArray227[11] != -1 && (this.anInt892 != 11 || anInt921 % 20 < 10)) {
						this.aClass1_Sub1_Sub3_Sub3Array4[10].method473(174, 2);
					}
					if (this.anIntArray227[12] != -1 && (this.anInt892 != 12 || anInt921 % 20 < 10)) {
						this.aClass1_Sub1_Sub3_Sub3Array4[11].method473(201, 2);
					}
					if (this.anIntArray227[13] != -1 && (this.anInt892 != 13 || anInt921 % 20 < 10)) {
						this.aClass1_Sub1_Sub3_Sub3Array4[12].method473(226, 2);
					}
				}
				this.aClass48_26.method504(super.aGraphics2, 466, 496);
				this.aClass48_14.method503();
			}
			if (this.aBoolean226) {
				this.aBoolean226 = false;
				this.aClass48_25.method503();
				this.aClass1_Sub1_Sub3_Sub3_1.method473(0, 0);
				this.aClass1_Sub1_Sub3_Sub2_3.method357(16777215, "Public chat", 55, 28, true);
				if (this.anInt834 == 0) {
					this.aClass1_Sub1_Sub3_Sub2_3.method357(65280, "On", 55, 41, true);
				}
				if (this.anInt834 == 1) {
					this.aClass1_Sub1_Sub3_Sub2_3.method357(16776960, "Friends", 55, 41, true);
				}
				if (this.anInt834 == 2) {
					this.aClass1_Sub1_Sub3_Sub2_3.method357(16711680, "Off", 55, 41, true);
				}
				if (this.anInt834 == 3) {
					this.aClass1_Sub1_Sub3_Sub2_3.method357(65535, "Hide", 55, 41, true);
				}
				this.aClass1_Sub1_Sub3_Sub2_3.method357(16777215, "Private chat", 184, 28, true);
				if (this.anInt930 == 0) {
					this.aClass1_Sub1_Sub3_Sub2_3.method357(65280, "On", 184, 41, true);
				}
				if (this.anInt930 == 1) {
					this.aClass1_Sub1_Sub3_Sub2_3.method357(16776960, "Friends", 184, 41, true);
				}
				if (this.anInt930 == 2) {
					this.aClass1_Sub1_Sub3_Sub2_3.method357(16711680, "Off", 184, 41, true);
				}
				this.aClass1_Sub1_Sub3_Sub2_3.method357(16777215, "Trade/compete", 324, 28, true);
				if (this.anInt847 == 0) {
					this.aClass1_Sub1_Sub3_Sub2_3.method357(65280, "On", 324, 41, true);
				}
				if (this.anInt847 == 1) {
					this.aClass1_Sub1_Sub3_Sub2_3.method357(16776960, "Friends", 324, 41, true);
				}
				if (this.anInt847 == 2) {
					this.aClass1_Sub1_Sub3_Sub2_3.method357(16711680, "Off", 324, 41, true);
				}
				this.aClass1_Sub1_Sub3_Sub2_3.method357(16777215, "Report abuse", 458, 33, true);
				this.aClass48_25.method504(super.aGraphics2, 453, 0);
				this.aClass48_14.method503();
			}
			this.anInt819 = 0;
		} catch (@Pc(1065) RuntimeException local1065) {
			signlink.reporterror("84395, " + -33393 + ", " + local1065.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(8) int local8 = this.aClass11_1.method161(arg0, arg1, arg3);
			this.anInt905 += 0;
			@Pc(24) int local24;
			@Pc(30) int local30;
			@Pc(34) int local34;
			@Pc(36) int local36;
			@Pc(58) int local58;
			@Pc(64) int local64;
			if (local8 != 0) {
				local24 = this.aClass11_1.method165(arg0, arg1, arg3, local8);
				local30 = local24 >> 6 & 0x3;
				local34 = local24 & 0x1F;
				local36 = arg2;
				if (local8 > 0) {
					local36 = arg4;
				}
				@Pc(44) int[] local44 = this.aClass1_Sub1_Sub3_Sub4_15.anIntArray209;
				local58 = arg1 * 4 + (103 - arg3) * 512 * 4 + 24624;
				local64 = local8 >> 14 & 0x7FFF;
				@Pc(67) Class22 local67 = Class22.method312(local64);
				if (local67.anInt431 == -1) {
					if (local34 == 0 || local34 == 2) {
						if (local30 == 0) {
							local44[local58] = local36;
							local44[local58 + 512] = local36;
							local44[local58 + 1024] = local36;
							local44[local58 + 1536] = local36;
						} else if (local30 == 1) {
							local44[local58] = local36;
							local44[local58 + 1] = local36;
							local44[local58 + 2] = local36;
							local44[local58 + 3] = local36;
						} else if (local30 == 2) {
							local44[local58 + 3] = local36;
							local44[local58 + 3 + 512] = local36;
							local44[local58 + 3 + 1024] = local36;
							local44[local58 + 3 + 1536] = local36;
						} else if (local30 == 3) {
							local44[local58 + 1536] = local36;
							local44[local58 + 1536 + 1] = local36;
							local44[local58 + 1536 + 2] = local36;
							local44[local58 + 1536 + 3] = local36;
						}
					}
					if (local34 == 3) {
						if (local30 == 0) {
							local44[local58] = local36;
						} else if (local30 == 1) {
							local44[local58 + 3] = local36;
						} else if (local30 == 2) {
							local44[local58 + 3 + 1536] = local36;
						} else if (local30 == 3) {
							local44[local58 + 1536] = local36;
						}
					}
					if (local34 == 2) {
						if (local30 == 3) {
							local44[local58] = local36;
							local44[local58 + 512] = local36;
							local44[local58 + 1024] = local36;
							local44[local58 + 1536] = local36;
						} else if (local30 == 0) {
							local44[local58] = local36;
							local44[local58 + 1] = local36;
							local44[local58 + 2] = local36;
							local44[local58 + 3] = local36;
						} else if (local30 == 1) {
							local44[local58 + 3] = local36;
							local44[local58 + 3 + 512] = local36;
							local44[local58 + 3 + 1024] = local36;
							local44[local58 + 3 + 1536] = local36;
						} else if (local30 == 2) {
							local44[local58 + 1536] = local36;
							local44[local58 + 1536 + 1] = local36;
							local44[local58 + 1536 + 2] = local36;
							local44[local58 + 1536 + 3] = local36;
						}
					}
				} else {
					@Pc(77) Class1_Sub1_Sub3_Sub3 local77 = this.aClass1_Sub1_Sub3_Sub3Array2[local67.anInt431];
					if (local77 != null) {
						@Pc(89) int local89 = (local67.anInt416 * 4 - local77.anInt714) / 2;
						@Pc(99) int local99 = (local67.anInt429 * 4 - local77.anInt715) / 2;
						local77.method473(arg1 * 4 + local89 + 48, (104 - arg3 - local67.anInt429) * 4 + 48 + local99);
					}
				}
			}
			local8 = this.aClass11_1.method163(arg0, arg1, arg3);
			if (local8 != 0) {
				local24 = this.aClass11_1.method165(arg0, arg1, arg3, local8);
				local30 = local24 >> 6 & 0x3;
				local34 = local24 & 0x1F;
				local36 = local8 >> 14 & 0x7FFF;
				@Pc(453) Class22 local453 = Class22.method312(local36);
				@Pc(485) int local485;
				if (local453.anInt431 != -1) {
					@Pc(463) Class1_Sub1_Sub3_Sub3 local463 = this.aClass1_Sub1_Sub3_Sub3Array2[local453.anInt431];
					if (local463 != null) {
						local64 = (local453.anInt416 * 4 - local463.anInt714) / 2;
						local485 = (local453.anInt429 * 4 - local463.anInt715) / 2;
						local463.method473(arg1 * 4 + local64 + 48, (104 - arg3 - local453.anInt429) * 4 + 48 + local485);
					}
				} else if (local34 == 9) {
					local58 = 15658734;
					if (local8 > 0) {
						local58 = 15597568;
					}
					@Pc(522) int[] local522 = this.aClass1_Sub1_Sub3_Sub4_15.anIntArray209;
					local485 = arg1 * 4 + (103 - arg3) * 512 * 4 + 24624;
					if (local30 == 0 || local30 == 2) {
						local522[local485 + 1536] = local58;
						local522[local485 + 1024 + 1] = local58;
						local522[local485 + 512 + 2] = local58;
						local522[local485 + 3] = local58;
					} else {
						local522[local485] = local58;
						local522[local485 + 512 + 1] = local58;
						local522[local485 + 1024 + 2] = local58;
						local522[local485 + 1536 + 3] = local58;
					}
				}
			}
			local8 = this.aClass11_1.method164(arg0, arg1, arg3);
			if (local8 != 0) {
				local24 = local8 >> 14 & 0x7FFF;
				@Pc(617) Class22 local617 = Class22.method312(local24);
				if (local617.anInt431 != -1) {
					@Pc(627) Class1_Sub1_Sub3_Sub3 local627 = this.aClass1_Sub1_Sub3_Sub3Array2[local617.anInt431];
					if (local627 != null) {
						local36 = (local617.anInt416 * 4 - local627.anInt714) / 2;
						@Pc(649) int local649 = (local617.anInt429 * 4 - local627.anInt715) / 2;
						local627.method473(arg1 * 4 + local36 + 48, (104 - arg3 - local617.anInt429) * 4 + 48 + local649);
						return;
					}
				}
			}
		} catch (@Pc(673) RuntimeException local673) {
			signlink.reporterror("11053, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + local673.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!NUUJCJXB;)V")
	private void method605(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub1_Sub3 arg1) {
		try {
			this.method606(arg0, arg1.anInt574, arg1.anInt573);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("74574, " + 6 + ", " + arg0 + ", " + arg1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V")
	private void method606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 >= 128 && arg1 >= 128 && arg2 <= 13056 && arg1 <= 13056) {
				@Pc(28) int local28 = this.method612(arg2, 938, arg1, this.anInt857) - arg0;
				@Pc(33) int local33 = arg2 - this.anInt973;
				@Pc(38) int local38 = local28 - this.anInt974;
				@Pc(43) int local43 = arg1 - this.anInt975;
				@Pc(53) int local53 = Class1_Sub1_Sub1_Sub4.anIntArray107[this.anInt976];
				@Pc(58) int local58 = Class1_Sub1_Sub1_Sub4.anIntArray108[this.anInt976];
				@Pc(63) int local63 = Class1_Sub1_Sub1_Sub4.anIntArray107[this.anInt977];
				@Pc(68) int local68 = Class1_Sub1_Sub1_Sub4.anIntArray108[this.anInt977];
				@Pc(78) int local78 = local43 * local63 + local33 * local68 >> 16;
				@Pc(88) int local88 = local43 * local68 - local33 * local63 >> 16;
				@Pc(90) int local90 = local78;
				@Pc(100) int local100 = local38 * local58 - local88 * local53 >> 16;
				@Pc(110) int local110 = local38 * local53 + local88 * local58 >> 16;
				if (local110 >= 50) {
					this.anInt1016 = Class1_Sub1_Sub3_Sub1.anInt134 + (local90 << 9) / local110;
					this.anInt1017 = Class1_Sub1_Sub3_Sub1.anInt135 + (local100 << 9) / local110;
				} else {
					this.anInt1016 = -1;
					this.anInt1017 = -1;
				}
			} else {
				this.anInt1016 = -1;
				this.anInt1017 = -1;
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("62416, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 3 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BI)V")
	private void method607(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg3 == 0 && this.anInt1005 != -1) {
				this.aString23 = arg0;
				super.anInt809 = 0;
			}
			if (this.anInt991 == -1) {
				this.aBoolean205 = true;
			}
			for (@Pc(22) int local22 = 99; local22 > 0; local22--) {
				this.anIntArray258[local22] = this.anIntArray258[local22 - 1];
				this.aStringArray11[local22] = this.aStringArray11[local22 - 1];
				this.aStringArray12[local22] = this.aStringArray12[local22 - 1];
			}
			this.anIntArray258[0] = arg3;
			this.aStringArray11[0] = arg1;
			@Pc(72) boolean local72 = false;
			this.aStringArray12[0] = arg0;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("77843, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIZIIIILclient!ETSIPTYG;)V")
	private void method608(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class6 arg7) {
		try {
			if (this.aBoolean213) {
				this.anInt820 = 32;
			} else {
				this.anInt820 = 0;
			}
			this.aBoolean213 = false;
			if (arg0 >= arg4 && arg0 < arg4 + 16 && arg1 >= arg5 && arg1 < arg5 + 16) {
				arg7.anInt65 -= this.anInt915 * 4;
				if (arg2) {
					this.aBoolean203 = true;
					return;
				}
			} else if (arg0 >= arg4 && arg0 < arg4 + 16 && arg1 >= arg5 + arg3 - 16 && arg1 < arg5 + arg3) {
				arg7.anInt65 += this.anInt915 * 4;
				if (arg2) {
					this.aBoolean203 = true;
					return;
				}
			} else if (arg0 >= arg4 - this.anInt820 && arg0 < arg4 + this.anInt820 + 16 && arg1 >= arg5 + 16 && arg1 < arg5 + arg3 - 16 && this.anInt915 > 0) {
				@Pc(126) int local126 = (arg3 - 32) * arg3 / arg6;
				if (local126 < 8) {
					local126 = 8;
				}
				@Pc(141) int local141 = arg1 - arg5 - local126 / 2 - 16;
				@Pc(147) int local147 = arg3 - local126 - 32;
				arg7.anInt65 = (arg6 - arg3) * local141 / local147;
				if (arg2) {
					this.aBoolean203 = true;
				}
				this.aBoolean213 = true;
			} else {
				return;
			}
		} catch (@Pc(166) RuntimeException local166) {
			signlink.reporterror("73689, " + arg0 + ", " + 891 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local166.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method609() {
		try {
			@Pc(8) int local8;
			if (this.anInt881 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt881 > 768) {
						this.anIntArray246[local8] = this.method634(218, this.anIntArray247[local8], 1024 - this.anInt881, this.anIntArray248[local8]);
					} else if (this.anInt881 > 256) {
						this.anIntArray246[local8] = this.anIntArray248[local8];
					} else {
						this.anIntArray246[local8] = this.method634(218, this.anIntArray248[local8], 256 - this.anInt881, this.anIntArray247[local8]);
					}
				}
			} else if (this.anInt882 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt882 > 768) {
						this.anIntArray246[local8] = this.method634(218, this.anIntArray247[local8], 1024 - this.anInt882, this.anIntArray249[local8]);
					} else if (this.anInt882 > 256) {
						this.anIntArray246[local8] = this.anIntArray249[local8];
					} else {
						this.anIntArray246[local8] = this.method634(218, this.anIntArray249[local8], 256 - this.anInt882, this.anIntArray247[local8]);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray246[local8] = this.anIntArray247[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass48_6.anIntArray207[local8] = this.aClass1_Sub1_Sub3_Sub4_3.anIntArray209[local8];
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
				local198 = this.anIntArray225[local185] * (256 - local185) / 256;
				local202 = local198 + 22;
				if (local202 < 0) {
					local202 = 0;
				}
				local181 += local202;
				for (local212 = local202; local212 < 128; local212++) {
					local220 = this.anIntArray272[local181++];
					if (local220 == 0) {
						local183++;
					} else {
						local224 = local220;
						local228 = 256 - local220;
						local220 = this.anIntArray246[local220];
						local239 = this.aClass48_6.anIntArray207[local183];
						this.aClass48_6.anIntArray207[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			this.aBoolean234 &= true;
			this.aClass48_6.method504(super.aGraphics2, 0, 0);
			for (local198 = 0; local198 < 33920; local198++) {
				this.aClass48_7.anIntArray207[local198] = this.aClass1_Sub1_Sub3_Sub4_4.anIntArray209[local198];
			}
			local181 = 0;
			local183 = 1176;
			for (local202 = 1; local202 < 255; local202++) {
				local212 = this.anIntArray225[local202] * (256 - local202) / 256;
				local220 = 103 - local212;
				local183 += local212;
				for (local224 = 0; local224 < local220; local224++) {
					local228 = this.anIntArray272[local181++];
					if (local228 == 0) {
						local183++;
					} else {
						local239 = local228;
						@Pc(368) int local368 = 256 - local228;
						local228 = this.anIntArray246[local228];
						@Pc(379) int local379 = this.aClass48_7.anIntArray207[local183];
						this.aClass48_7.anIntArray207[local183++] = ((local228 & 0xFF00FF) * local239 + (local379 & 0xFF00FF) * local368 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local379 & 0xFF00) * local368 & 0xFF0000) >> 8;
					}
				}
				local181 += 128 - local220;
				local183 += 128 - local220 - local212;
			}
			this.aClass48_7.method504(super.aGraphics2, 0, 637);
		} catch (@Pc(451) RuntimeException local451) {
			signlink.reporterror("35667, " + true + ", " + local451.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!TKCVVLIT;)V")
	private void method610(@OriginalArg(1) Class1_Sub1_Sub3_Sub3 arg0) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray223.length; local5++) {
				this.anIntArray223[local5] = 0;
			}
			@Pc(30) int local30;
			for (@Pc(20) int local20 = 0; local20 < 5000; local20++) {
				local30 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray223[local30] = (int) (Math.random() * 256.0D);
			}
			@Pc(48) int local48;
			@Pc(52) int local52;
			@Pc(60) int local60;
			for (local30 = 0; local30 < 20; local30++) {
				for (local48 = 1; local48 < 255; local48++) {
					for (local52 = 1; local52 < 127; local52++) {
						local60 = local52 + (local48 << 7);
						this.anIntArray224[local60] = (this.anIntArray223[local60 - 1] + this.anIntArray223[local60 + 1] + this.anIntArray223[local60 - 128] + this.anIntArray223[local60 + 128]) / 4;
					}
				}
				@Pc(106) int[] local106 = this.anIntArray223;
				this.anIntArray223 = this.anIntArray224;
				this.anIntArray224 = local106;
			}
			if (arg0 != null) {
				local48 = 0;
				for (local52 = 0; local52 < arg0.anInt715; local52++) {
					for (local60 = 0; local60 < arg0.anInt714; local60++) {
						if (arg0.aByteArray19[local48++] != 0) {
							@Pc(146) int local146 = local60 + arg0.anInt716 + 16;
							@Pc(153) int local153 = local52 + arg0.anInt717 + 16;
							@Pc(159) int local159 = local146 + (local153 << 7);
							this.anIntArray223[local159] = 0;
						}
					}
				}
			}
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("95354, " + 9 + ", " + arg0 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!BJPWOXRJ;I)V")
	private void method611(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub2 arg1, @OriginalArg(2) int arg2) {
		try {
			while (true) {
				if (arg1.anInt11 + 10 < arg2 * 8) {
					@Pc(12) int local12 = arg1.method33(11);
					if (local12 != 2047) {
						if (this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local12] == null) {
							this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local12] = new Class1_Sub1_Sub1_Sub3_Sub2();
							if (this.aClass1_Sub1_Sub2Array1[local12] != null) {
								this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local12].method396(this.aClass1_Sub1_Sub2Array1[local12]);
							}
						}
						this.anIntArray256[this.anInt959++] = local12;
						@Pc(58) Class1_Sub1_Sub1_Sub3_Sub2 local58 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local12];
						local58.anInt571 = anInt921;
						@Pc(66) int local66 = arg1.method33(5);
						if (local66 > 15) {
							local66 -= 32;
						}
						@Pc(75) int local75 = arg1.method33(5);
						if (local75 > 15) {
							local75 -= 32;
						}
						@Pc(84) int local84 = arg1.method33(1);
						@Pc(89) int local89 = arg1.method33(1);
						if (local89 == 1) {
							this.anIntArray257[this.anInt960++] = local12;
						}
						local58.method393(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0] + local75, local84 == 1, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0] + local66);
						continue;
					}
				}
				arg1.method34();
				@Pc(133) boolean local133 = false;
				return;
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("66436, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)I")
	private int method612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) int local3 = arg0 >> 7;
			@Pc(7) int local7 = arg2 >> 7;
			@Pc(11) boolean local11 = false;
			if (local3 < 0 || local7 < 0 || local3 > 103 || local7 > 103) {
				return 0;
			}
			@Pc(25) int local25 = arg3;
			if (arg3 < 3 && (this.aByteArrayArrayArray8[1][local3][local7] & 0x2) == 2) {
				local25 = arg3 + 1;
			}
			@Pc(45) int local45 = arg0 & 0x7F;
			@Pc(49) int local49 = arg2 & 0x7F;
			@Pc(77) int local77 = this.anIntArrayArrayArray7[local25][local3][local7] * (128 - local45) + this.anIntArrayArrayArray7[local25][local3 + 1][local7] * local45 >> 7;
			@Pc(109) int local109 = this.anIntArrayArrayArray7[local25][local3][local7 + 1] * (128 - local45) + this.anIntArrayArrayArray7[local25][local3 + 1][local7 + 1] * local45 >> 7;
			return local77 * (128 - local49) + local109 * local49 >> 7;
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("25424, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method613(@OriginalArg(0) int arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt871; local3++) {
				if (this.anIntArray214[local3] <= 0) {
					@Pc(12) boolean local12 = false;
					try {
						if (this.anIntArray267[local3] != this.anInt1008 || this.anIntArray254[local3] != this.anInt922) {
							@Pc(46) Class1_Sub1_Sub2 local46 = Class10.method118(this.anIntArray254[local3], this.anIntArray267[local3]);
							if (System.currentTimeMillis() + (long) (local46.anInt10 / 22) > this.aLong30 + (long) (this.anInt901 / 22)) {
								this.anInt901 = local46.anInt10;
								this.aLong30 = System.currentTimeMillis();
								if (this.method559(local46.anInt10, local46.aByteArray1)) {
									this.anInt1008 = this.anIntArray267[local3];
									this.anInt922 = this.anIntArray254[local3];
								} else {
									local12 = true;
								}
							}
						} else if (!this.method582(this.aBoolean215)) {
							local12 = true;
						}
					} catch (@Pc(96) Exception local96) {
					}
					if (local12 && this.anIntArray214[local3] != -5) {
						this.anIntArray214[local3] = -5;
					} else {
						this.anInt871--;
						for (@Pc(112) int local112 = local3; local112 < this.anInt871; local112++) {
							this.anIntArray267[local112] = this.anIntArray267[local112 + 1];
							this.anIntArray254[local112] = this.anIntArray254[local112 + 1];
							this.anIntArray214[local112] = this.anIntArray214[local112 + 1];
						}
						local3--;
					}
				} else {
					@Pc(164) int local164 = this.anIntArray214[local3]--;
				}
			}
			@Pc(176) boolean local176 = false;
			if (this.anInt853 > 0) {
				this.anInt853 -= 20;
				if (this.anInt853 < 0) {
					this.anInt853 = 0;
				}
				if (this.anInt853 == 0 && this.aBoolean193 && !aBoolean230) {
					this.anInt978 = this.anInt967;
					this.aBoolean233 = true;
					this.aClass7_Sub1_1.method56(2, this.anInt978);
					return;
				}
			}
		} catch (@Pc(214) RuntimeException local214) {
			signlink.reporterror("16669, " + arg0 + ", " + local214.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)V")
	private void method614(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method615(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString27 = "";
				this.aString28 = "Connecting to server...";
				this.method632(this.anInt826, true);
			}
			this.aClass16_1 = new Class16(this.method643(anInt965 + 43594), -24798, this);
			@Pc(31) long local31 = Class31.method379(arg0);
			@Pc(38) int local38 = (int) (local31 >> 16 & 0x1FL);
			this.aClass1_Sub1_Sub2_7.anInt10 = 0;
			this.aClass1_Sub1_Sub2_7.method12(14);
			this.aClass1_Sub1_Sub2_7.method12(local38);
			this.aClass16_1.method229(this.aClass1_Sub1_Sub2_7.aByteArray1, 2);
			for (@Pc(61) int local61 = 0; local61 < 8; local61++) {
				this.aClass16_1.method226();
			}
			@Pc(75) int local75 = this.aClass16_1.method226();
			@Pc(77) int local77 = local75;
			@Pc(226) int local226;
			@Pc(260) int local260;
			if (local75 == 0) {
				this.aClass16_1.method228(this.aClass1_Sub1_Sub2_9.aByteArray1, 0, 8);
				this.aClass1_Sub1_Sub2_9.anInt10 = 0;
				this.aLong29 = this.aClass1_Sub1_Sub2_9.method28();
				@Pc(100) int[] local100 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong29 >> 32), (int) this.aLong29 };
				this.aClass1_Sub1_Sub2_7.anInt10 = 0;
				this.aClass1_Sub1_Sub2_7.method12(10);
				this.aClass1_Sub1_Sub2_7.method16(local100[0]);
				this.aClass1_Sub1_Sub2_7.method16(local100[1]);
				this.aClass1_Sub1_Sub2_7.method16(local100[2]);
				this.aClass1_Sub1_Sub2_7.method16(local100[3]);
				this.aClass1_Sub1_Sub2_7.method16(signlink.anInt1029);
				this.aClass1_Sub1_Sub2_7.method19(arg0);
				this.aClass1_Sub1_Sub2_7.method19(arg1);
				this.aClass1_Sub1_Sub2_7.method37(aBigInteger2, aBigInteger1);
				this.aClass1_Sub1_Sub2_6.anInt10 = 0;
				if (arg2) {
					this.aClass1_Sub1_Sub2_6.method12(18);
				} else {
					this.aClass1_Sub1_Sub2_6.method12(16);
				}
				this.aClass1_Sub1_Sub2_6.method12(this.aClass1_Sub1_Sub2_7.anInt10 + 36 + 1 + 1 + 2);
				this.aClass1_Sub1_Sub2_6.method12(255);
				this.aClass1_Sub1_Sub2_6.method13(306);
				this.aClass1_Sub1_Sub2_6.method12(aBoolean230 ? 1 : 0);
				for (local226 = 0; local226 < 9; local226++) {
					this.aClass1_Sub1_Sub2_6.method16(this.anIntArray235[local226]);
				}
				this.aClass1_Sub1_Sub2_6.method20(this.aClass1_Sub1_Sub2_7.anInt10, this.aClass1_Sub1_Sub2_7.aByteArray1);
				this.aClass1_Sub1_Sub2_7.aClass9_1 = new Class9(local100, false);
				for (local260 = 0; local260 < 4; local260++) {
					local100[local260] += 50;
				}
				this.aClass9_2 = new Class9(local100, false);
				this.aClass16_1.method229(this.aClass1_Sub1_Sub2_6.aByteArray1, this.aClass1_Sub1_Sub2_6.anInt10);
				local75 = this.aClass16_1.method226();
			}
			if (local75 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(302) Exception local302) {
				}
				this.method615(arg0, arg1, arg2);
			} else {
				@Pc(390) int local390;
				if (local75 == 2) {
					this.anInt1003 = this.aClass16_1.method226();
					aBoolean232 = this.aClass16_1.method226() == 1;
					this.aLong33 = 0L;
					this.anInt984 = 0;
					this.aClass32_1.anInt543 = 0;
					super.aBoolean189 = true;
					this.aBoolean197 = true;
					this.aBoolean234 = true;
					this.aClass1_Sub1_Sub2_7.anInt10 = 0;
					this.aClass1_Sub1_Sub2_9.anInt10 = 0;
					this.anInt906 = -1;
					this.anInt986 = -1;
					this.anInt987 = -1;
					this.anInt988 = -1;
					this.anInt905 = 0;
					this.anInt907 = 0;
					this.anInt1018 = 0;
					this.anInt909 = 0;
					this.anInt928 = 0;
					this.anInt916 = 0;
					this.aBoolean200 = false;
					super.anInt802 = 0;
					for (local390 = 0; local390 < 100; local390++) {
						this.aStringArray12[local390] = null;
					}
					this.anInt1024 = 0;
					this.anInt872 = 0;
					this.anInt1004 = 0;
					this.anInt871 = 0;
					this.anInt1010 = (int) (Math.random() * 100.0D) - 50;
					this.anInt831 = (int) (Math.random() * 110.0D) - 55;
					this.anInt961 = (int) (Math.random() * 80.0D) - 40;
					this.anInt829 = (int) (Math.random() * 120.0D) - 60;
					this.anInt875 = (int) (Math.random() * 30.0D) - 20;
					this.anInt842 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt852 = 0;
					this.anInt1022 = -1;
					this.anInt981 = 0;
					this.anInt982 = 0;
					this.anInt959 = 0;
					this.anInt863 = 0;
					for (local226 = 0; local226 < this.anInt957; local226++) {
						this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local226] = null;
						this.aClass1_Sub1_Sub2Array1[local226] = null;
					}
					for (local260 = 0; local260 < 16384; local260++) {
						this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local260] = null;
					}
					aClass1_Sub1_Sub1_Sub3_Sub2_1 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[this.anInt958] = new Class1_Sub1_Sub1_Sub3_Sub2();
					this.aClass36_10.method404();
					this.aClass36_11.method404();
					@Pc(535) int local535;
					@Pc(539) int local539;
					for (@Pc(531) int local531 = 0; local531 < 4; local531++) {
						for (local535 = 0; local535 < 104; local535++) {
							for (local539 = 0; local539 < 104; local539++) {
								this.aClass36ArrayArrayArray1[local531][local535][local539] = null;
							}
						}
					}
					this.aClass36_12 = new Class36(anInt861);
					this.anInt888 = 0;
					this.anInt887 = 0;
					this.anInt1005 = -1;
					this.anInt991 = -1;
					this.anInt823 = -1;
					this.anInt935 = -1;
					this.anInt929 = -1;
					this.aBoolean198 = false;
					this.anInt994 = 3;
					this.aBoolean214 = false;
					this.aBoolean200 = false;
					this.aBoolean192 = false;
					this.aString23 = null;
					this.anInt850 = 0;
					this.anInt892 = -1;
					this.aBoolean236 = true;
					this.method587();
					for (local535 = 0; local535 < 5; local535++) {
						this.anIntArray264[local535] = 0;
					}
					for (local539 = 0; local539 < 5; local539++) {
						this.aStringArray13[local539] = null;
						this.aBooleanArray12[local539] = false;
					}
					anInt972 = 0;
					anInt824 = 0;
					anInt941 = 0;
					anInt858 = 0;
					anInt854 = 0;
					anInt1023 = 0;
					this.method681(anInt851);
				} else if (local75 == 3) {
					this.aString27 = "";
					this.aString28 = "Invalid username or password.";
				} else if (local75 == 4) {
					this.aString27 = "Your account has been disabled.";
					this.aString28 = "Please check your message-centre for details.";
				} else if (local75 == 5) {
					this.aString27 = "Your account is already logged in.";
					this.aString28 = "Try again in 60 secs...";
				} else if (local75 == 6) {
					this.aString27 = "RuneScape has been updated!";
					this.aString28 = "Please reload this page.";
				} else if (local75 == 7) {
					this.aString27 = "This world is full.";
					this.aString28 = "Please use a different world.";
				} else if (local75 == 8) {
					this.aString27 = "Unable to connect.";
					this.aString28 = "Login server offline.";
				} else if (local75 == 9) {
					this.aString27 = "Login limit exceeded.";
					this.aString28 = "Too many connections from your address.";
				} else if (local75 == 10) {
					this.aString27 = "Unable to connect.";
					this.aString28 = "Bad session id.";
				} else if (local75 == 11) {
					this.aString28 = "Login server rejected session.";
					this.aString28 = "Please try again.";
				} else if (local75 == 12) {
					this.aString27 = "You need a members account to login to this world.";
					this.aString28 = "Please subscribe, or use a different world.";
				} else if (local75 == 13) {
					this.aString27 = "Could not complete login.";
					this.aString28 = "Please try using a different world.";
				} else if (local75 == 14) {
					this.aString27 = "The server is being updated.";
					this.aString28 = "Please wait 1 minute and try again.";
				} else if (local75 == 15) {
					this.aBoolean234 = true;
					this.aClass1_Sub1_Sub2_7.anInt10 = 0;
					this.aClass1_Sub1_Sub2_9.anInt10 = 0;
					this.anInt906 = -1;
					this.anInt986 = -1;
					this.anInt987 = -1;
					this.anInt988 = -1;
					this.anInt905 = 0;
					this.anInt907 = 0;
					this.anInt1018 = 0;
					this.anInt916 = 0;
					this.aBoolean200 = false;
					this.aLong32 = System.currentTimeMillis();
				} else if (local75 == 16) {
					this.aString27 = "Login attempts exceeded.";
					this.aString28 = "Please wait 1 minute and try again.";
				} else if (local75 == 17) {
					this.aString27 = "You are standing in a members-only area.";
					this.aString28 = "To play on this world move to a free area first";
				} else if (local75 == 20) {
					this.aString27 = "Invalid loginserver requested";
					this.aString28 = "Please try using a different world.";
				} else if (local75 == 21) {
					for (local390 = this.aClass16_1.method226(); local390 >= 0; local390--) {
						this.aString27 = "You have only just left another world";
						this.aString28 = "Your profile will be transferred in: " + local390 + " seconds";
						this.method632(this.anInt826, true);
						try {
							Thread.sleep(1000L);
						} catch (@Pc(901) Exception local901) {
						}
					}
					this.method615(arg0, arg1, arg2);
				} else if (local75 != -1) {
					System.out.println("response:" + local75);
					this.aString27 = "Unexpected server response";
					this.aString28 = "Please try using a different world.";
				} else if (local77 != 0) {
					this.aString27 = "No response from server";
					this.aString28 = "Please try using a different world.";
				} else if (this.anInt945 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(923) Exception local923) {
					}
					this.anInt945++;
					this.method615(arg0, arg1, arg2);
				} else {
					this.aString27 = "No response from loginserver";
					this.aString28 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(966) IOException local966) {
			this.aString27 = "";
			this.aString28 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method616() {
		try {
			this.aClass1_Sub1_Sub2_7.method11(148);
			if (this.anInt935 != -1) {
				this.anInt935 = -1;
				this.aBoolean203 = true;
				this.aBoolean198 = false;
				this.aBoolean206 = true;
			}
			if (this.anInt991 != -1) {
				this.anInt991 = -1;
				this.aBoolean205 = true;
				this.aBoolean198 = false;
			}
			this.anInt823 = -1;
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("74399, " + 4 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method617() {
		try {
			@Pc(4) Graphics local4 = this.method549().getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			this.method542();
			@Pc(44) byte local44;
			@Pc(50) int local50;
			if (this.aBoolean209) {
				this.aBoolean201 = false;
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
			if (this.aBoolean210) {
				this.aBoolean201 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean240) {
				this.aBoolean201 = false;
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
			signlink.reporterror("5493, " + 8 + ", " + local182.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method618(@OriginalArg(0) byte arg0) {
		try {
			this.anInt890 = 0;
			@Pc(91) int local91;
			@Pc(71) int local71;
			for (@Pc(6) int local6 = -1; local6 < this.anInt959 + this.anInt863; local6++) {
				@Pc(13) Class1_Sub1_Sub1_Sub3 local13;
				if (local6 == -1) {
					local13 = aClass1_Sub1_Sub1_Sub3_Sub2_1;
				} else if (local6 < this.anInt959) {
					local13 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[this.anIntArray256[local6]];
				} else {
					local13 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[this.anIntArray218[local6 - this.anInt959]];
				}
				if (local13 != null && local13.method389()) {
					@Pc(54) Class38 local54;
					if (local13 instanceof Class1_Sub1_Sub1_Sub3_Sub1) {
						local54 = ((Class1_Sub1_Sub1_Sub3_Sub1) local13).aClass38_1;
						if (local54.anIntArray165 != null) {
							local54 = local54.method416(this.anInt867);
						}
						if (local54 == null) {
							continue;
						}
					}
					if (local6 >= this.anInt959) {
						local54 = ((Class1_Sub1_Sub1_Sub3_Sub1) local13).aClass38_1;
						if (local54.anInt630 >= 0 && local54.anInt630 < this.aClass1_Sub1_Sub3_Sub4Array6.length) {
							this.method605(local13.anInt572 + 15, local13);
							if (this.anInt1016 > -1) {
								this.aClass1_Sub1_Sub3_Sub4Array6[local54.anInt630].method529(this.anInt1016 - 12, this.anInt1017 - 30);
							}
						}
						if (this.anInt928 == 1 && this.anInt865 == this.anIntArray218[local6 - this.anInt959] && anInt921 % 20 < 10) {
							this.method605(local13.anInt572 + 15, local13);
							if (this.anInt1016 > -1) {
								this.aClass1_Sub1_Sub3_Sub4Array6[2].method529(this.anInt1016 - 12, this.anInt1017 - 28);
							}
						}
					} else {
						local71 = 30;
						@Pc(74) Class1_Sub1_Sub1_Sub3_Sub2 local74 = (Class1_Sub1_Sub1_Sub3_Sub2) local13;
						if (local74.anInt618 != 0) {
							this.method605(local13.anInt572 + 15, local13);
							if (this.anInt1016 > -1) {
								for (local91 = 0; local91 < 8; local91++) {
									if ((local74.anInt618 & 0x1 << local91) != 0) {
										this.aClass1_Sub1_Sub3_Sub4Array6[local91].method529(this.anInt1016 - 12, this.anInt1017 - local71);
										local71 -= 25;
									}
								}
							}
						}
						if (local6 >= 0 && this.anInt928 == 10 && this.anInt963 == this.anIntArray256[local6]) {
							this.method605(local13.anInt572 + 15, local13);
							if (this.anInt1016 > -1) {
								this.aClass1_Sub1_Sub3_Sub4Array6[7].method529(this.anInt1016 - 12, this.anInt1017 - local71);
							}
						}
					}
					if (local13.aString14 != null && (local6 >= this.anInt959 || this.anInt834 == 0 || this.anInt834 == 3 || this.anInt834 == 1 && this.method560(((Class1_Sub1_Sub1_Sub3_Sub2) local13).aString15))) {
						this.method605(local13.anInt572, local13);
						if (this.anInt1016 > -1 && this.anInt890 < this.anInt891) {
							this.anIntArray231[this.anInt890] = this.aClass1_Sub1_Sub3_Sub2_4.method359(local13.aString14) / 2;
							this.anIntArray230[this.anInt890] = this.aClass1_Sub1_Sub3_Sub2_4.anInt499;
							this.anIntArray228[this.anInt890] = this.anInt1016;
							this.anIntArray229[this.anInt890] = this.anInt1017;
							this.anIntArray232[this.anInt890] = local13.anInt563;
							this.anIntArray233[this.anInt890] = local13.anInt554;
							this.anIntArray234[this.anInt890] = local13.anInt596;
							this.aStringArray9[this.anInt890++] = local13.aString14;
							if (this.anInt849 == 0 && local13.anInt554 >= 1 && local13.anInt554 <= 3) {
								this.anIntArray230[this.anInt890] += 10;
								this.anIntArray229[this.anInt890] += 5;
							}
							if (this.anInt849 == 0 && local13.anInt554 == 4) {
								this.anIntArray231[this.anInt890] = 60;
							}
							if (this.anInt849 == 0 && local13.anInt554 == 5) {
								this.anIntArray230[this.anInt890] += 5;
							}
						}
					}
					if (local13.anInt576 > anInt921) {
						this.method605(local13.anInt572 + 15, local13);
						if (this.anInt1016 > -1) {
							local71 = local13.anInt577 * 30 / local13.anInt578;
							if (local71 > 30) {
								local71 = 30;
							}
							Class1_Sub1_Sub3.method517(this.anInt1017 - 3, 5, local71, this.anInt1016 - 15, 65280);
							Class1_Sub1_Sub3.method517(this.anInt1017 - 3, 5, 30 - local71, this.anInt1016 - 15 + local71, 16711680);
						}
					}
					for (local71 = 0; local71 < 4; local71++) {
						if (local13.anIntArray154[local71] > anInt921) {
							this.method605(local13.anInt572 / 2, local13);
							if (this.anInt1016 > -1) {
								if (local71 == 1) {
									this.anInt1017 -= 20;
								}
								if (local71 == 2) {
									this.anInt1016 -= 15;
									this.anInt1017 -= 10;
								}
								if (local71 == 3) {
									this.anInt1016 += 15;
									this.anInt1017 -= 10;
								}
								this.aClass1_Sub1_Sub3_Sub4Array8[local13.anIntArray153[local71]].method529(this.anInt1016 - 12, this.anInt1017 - 12);
								this.aClass1_Sub1_Sub3_Sub2_2.method356(this.anInt1016, this.anInt1017 + 4, String.valueOf(local13.anIntArray152[local71]), 0);
								this.aClass1_Sub1_Sub3_Sub2_2.method356(this.anInt1016 - 1, this.anInt1017 + 3, String.valueOf(local13.anIntArray152[local71]), 16777215);
							}
						}
					}
				}
			}
			anInt870++;
			@Pc(603) boolean local603 = false;
			@Pc(626) int local626;
			if (anInt870 > 1007) {
				anInt870 = 0;
				this.aClass1_Sub1_Sub2_7.method11(47);
				this.aClass1_Sub1_Sub2_7.method12(0);
				local626 = this.aClass1_Sub1_Sub2_7.anInt10;
				this.aClass1_Sub1_Sub2_7.method13((int) (Math.random() * 65536.0D));
				this.aClass1_Sub1_Sub2_7.method13((int) (Math.random() * 65536.0D));
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub2_7.method12(88);
				}
				this.aClass1_Sub1_Sub2_7.method13(42477);
				this.aClass1_Sub1_Sub2_7.method12(117);
				this.aClass1_Sub1_Sub2_7.method12(85);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub2_7.method13(14901);
				}
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub2_7.method12(77);
				}
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub2_7.method13(9441);
				}
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub2_7.method13(57204);
				}
				this.aClass1_Sub1_Sub2_7.method21(this.aClass1_Sub1_Sub2_7.anInt10 - local626);
			}
			for (local626 = 0; local626 < this.anInt890; local626++) {
				local71 = this.anIntArray228[local626];
				@Pc(720) int local720 = this.anIntArray229[local626];
				local91 = this.anIntArray231[local626];
				@Pc(730) int local730 = this.anIntArray230[local626];
				@Pc(732) boolean local732 = true;
				while (local732) {
					local732 = false;
					for (@Pc(738) int local738 = 0; local738 < local626; local738++) {
						if (local720 + 2 > this.anIntArray229[local738] - this.anIntArray230[local738] && local720 - local730 < this.anIntArray229[local738] + 2 && local71 - local91 < this.anIntArray228[local738] + this.anIntArray231[local738] && local71 + local91 > this.anIntArray228[local738] - this.anIntArray231[local738] && this.anIntArray229[local738] - this.anIntArray230[local738] < local720) {
							local720 = this.anIntArray229[local738] - this.anIntArray230[local738];
							local732 = true;
						}
					}
				}
				this.anInt1016 = this.anIntArray228[local626];
				this.anInt1017 = this.anIntArray229[local626] = local720;
				@Pc(837) String local837 = this.aStringArray9[local626];
				if (this.anInt849 == 0) {
					@Pc(842) int local842 = 16776960;
					if (this.anIntArray232[local626] < 6) {
						local842 = this.anIntArray250[this.anIntArray232[local626]];
					}
					if (this.anIntArray232[local626] == 6) {
						local842 = this.anInt1014 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray232[local626] == 7) {
						local842 = this.anInt1014 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray232[local626] == 8) {
						local842 = this.anInt1014 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(917) int local917;
					if (this.anIntArray232[local626] == 9) {
						local917 = 150 - this.anIntArray234[local626];
						if (local917 < 50) {
							local842 = local917 * 1280 + 16711680;
						} else if (local917 < 100) {
							local842 = 16776960 - (local917 - 50) * 327680;
						} else if (local917 < 150) {
							local842 = (local917 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray232[local626] == 10) {
						local917 = 150 - this.anIntArray234[local626];
						if (local917 < 50) {
							local842 = local917 * 5 + 16711680;
						} else if (local917 < 100) {
							local842 = 16711935 - (local917 - 50) * 327680;
						} else if (local917 < 150) {
							local842 = (local917 - 100) * 327680 + 255 - (local917 - 100) * 5;
						}
					}
					if (this.anIntArray232[local626] == 11) {
						local917 = 150 - this.anIntArray234[local626];
						if (local917 < 50) {
							local842 = 16777215 - local917 * 327685;
						} else if (local917 < 100) {
							local842 = (local917 - 50) * 327685 + 65280;
						} else if (local917 < 150) {
							local842 = 16777215 - (local917 - 100) * 327680;
						}
					}
					if (this.anIntArray233[local626] == 0) {
						this.aClass1_Sub1_Sub3_Sub2_4.method356(this.anInt1016, this.anInt1017 + 1, local837, 0);
						this.aClass1_Sub1_Sub3_Sub2_4.method356(this.anInt1016, this.anInt1017, local837, local842);
					}
					if (this.anIntArray233[local626] == 1) {
						this.aClass1_Sub1_Sub3_Sub2_4.method361(this.anInt1017 + 1, local837, this.anInt1016, this.anInt1014, 0);
						this.aClass1_Sub1_Sub3_Sub2_4.method361(this.anInt1017, local837, this.anInt1016, this.anInt1014, local842);
					}
					if (this.anIntArray233[local626] == 2) {
						this.aClass1_Sub1_Sub3_Sub2_4.method362(this.anInt1016, this.anInt1014, local837, this.anInt1017 + 1, 0);
						this.aClass1_Sub1_Sub3_Sub2_4.method362(this.anInt1016, this.anInt1014, local837, this.anInt1017, local842);
					}
					if (this.anIntArray233[local626] == 3) {
						this.aClass1_Sub1_Sub3_Sub2_4.method363(this.anInt1016, 0, this.anInt1014, this.anInt1017 + 1, 150 - this.anIntArray234[local626], local837);
						this.aClass1_Sub1_Sub3_Sub2_4.method363(this.anInt1016, local842, this.anInt1014, this.anInt1017, 150 - this.anIntArray234[local626], local837);
					}
					@Pc(1214) int local1214;
					if (this.anIntArray233[local626] == 4) {
						local917 = this.aClass1_Sub1_Sub3_Sub2_4.method359(local837);
						local1214 = (150 - this.anIntArray234[local626]) * (local917 + 100) / 150;
						Class1_Sub1_Sub3.method514(334, this.anInt1016 - 50, this.anInt1016 + 50, 0);
						this.aClass1_Sub1_Sub3_Sub2_4.method360(0, this.anInt1017 + 1, local837, this.anInt1016 + 50 - local1214);
						this.aClass1_Sub1_Sub3_Sub2_4.method360(local842, this.anInt1017, local837, this.anInt1016 + 50 - local1214);
						Class1_Sub1_Sub3.method513();
					}
					if (this.anIntArray233[local626] == 5) {
						local917 = 150 - this.anIntArray234[local626];
						local1214 = 0;
						if (local917 < 25) {
							local1214 = local917 - 25;
						} else if (local917 > 125) {
							local1214 = local917 - 125;
						}
						Class1_Sub1_Sub3.method514(this.anInt1017 + 5, 0, 512, this.anInt1017 - this.aClass1_Sub1_Sub3_Sub2_4.anInt499 - 1);
						this.aClass1_Sub1_Sub3_Sub2_4.method356(this.anInt1016, this.anInt1017 + local1214 + 1, local837, 0);
						this.aClass1_Sub1_Sub3_Sub2_4.method356(this.anInt1016, this.anInt1017 + local1214, local837, local842);
						Class1_Sub1_Sub3.method513();
					}
				} else {
					this.aClass1_Sub1_Sub3_Sub2_4.method356(this.anInt1016, this.anInt1017 + 1, local837, 0);
					this.aClass1_Sub1_Sub3_Sub2_4.method356(this.anInt1016, this.anInt1017, local837, 16776960);
				}
			}
		} catch (@Pc(1364) RuntimeException local1364) {
			signlink.reporterror("7942, " + arg0 + ", " + local1364.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method619(@OriginalArg(0) boolean arg0) {
		try {
			if (this.aClass48_3 == null) {
				super.aClass48_2 = null;
				this.aClass48_15 = null;
				this.aClass48_13 = null;
				this.aClass48_12 = null;
				this.aClass48_14 = null;
				this.aClass48_25 = null;
				this.aClass48_26 = null;
				this.aBoolean234 &= arg0;
				this.aClass48_27 = null;
				this.aClass48_6 = new Class48(128, (byte) -48, this.method549(), 265);
				Class1_Sub1_Sub3.method515();
				this.aClass48_7 = new Class48(128, (byte) -48, this.method549(), 265);
				Class1_Sub1_Sub3.method515();
				this.aClass48_3 = new Class48(509, (byte) -48, this.method549(), 171);
				Class1_Sub1_Sub3.method515();
				this.aClass48_4 = new Class48(360, (byte) -48, this.method549(), 132);
				Class1_Sub1_Sub3.method515();
				this.aClass48_5 = new Class48(360, (byte) -48, this.method549(), 200);
				Class1_Sub1_Sub3.method515();
				this.aClass48_8 = new Class48(202, (byte) -48, this.method549(), 238);
				Class1_Sub1_Sub3.method515();
				this.aClass48_9 = new Class48(203, (byte) -48, this.method549(), 238);
				Class1_Sub1_Sub3.method515();
				this.aClass48_10 = new Class48(74, (byte) -48, this.method549(), 94);
				Class1_Sub1_Sub3.method515();
				this.aClass48_11 = new Class48(75, (byte) -48, this.method549(), 94);
				Class1_Sub1_Sub3.method515();
				if (this.aClass27_1 != null) {
					this.method667();
					this.method565();
				}
				this.aBoolean231 = true;
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("73089, " + arg0 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method620() {
		try {
			if (this.anInt928 == 2) {
				this.method606(this.anInt998 * 2, (this.anInt997 - this.anInt932 << 7) + this.anInt1000, (this.anInt996 - this.anInt931 << 7) + this.anInt999);
				if (this.anInt1016 > -1 && anInt921 % 20 < 10) {
					this.aClass1_Sub1_Sub3_Sub4Array6[2].method529(this.anInt1016 - 12, this.anInt1017 - 28);
				}
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("73226, " + 16122 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method621(@OriginalArg(0) byte arg0) {
		try {
			this.aBoolean237 = true;
			@Pc(9) boolean local9 = false;
			try {
				@Pc(16) long local16 = System.currentTimeMillis();
				@Pc(18) int local18 = 0;
				@Pc(20) int local20 = 20;
				while (this.aBoolean201) {
					this.anInt946++;
					this.method655();
					this.method655();
					this.method609();
					local18++;
					if (local18 > 10) {
						@Pc(43) long local43 = System.currentTimeMillis();
						@Pc(52) int local52 = (int) (local43 - local16) / 10 - local20;
						local20 = 40 - local52;
						if (local20 < 5) {
							local20 = 5;
						}
						local18 = 0;
						local16 = local43;
					}
					try {
						Thread.sleep((long) local20);
					} catch (@Pc(70) Exception local70) {
					}
				}
			} catch (@Pc(76) Exception local76) {
			}
			this.aBoolean237 = false;
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("81566, " + arg0 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!ETSIPTYG;)I")
	private int method622(@OriginalArg(0) int arg0, @OriginalArg(2) Class6 arg1) {
		try {
			if (arg1.anIntArrayArray1 == null || arg0 >= arg1.anIntArrayArray1.length) {
				return -2;
			}
			try {
				@Pc(23) int[] local23 = arg1.anIntArrayArray1[arg0];
				@Pc(25) int local25 = 0;
				@Pc(27) int local27 = 0;
				@Pc(29) byte local29 = 0;
				while (true) {
					@Pc(34) int local34 = local23[local27++];
					@Pc(36) int local36 = 0;
					@Pc(38) byte local38 = 0;
					if (local34 == 0) {
						return local25;
					}
					if (local34 == 1) {
						local36 = this.anIntArray259[local23[local27++]];
					}
					if (local34 == 2) {
						local36 = this.anIntArray217[local23[local27++]];
					}
					if (local34 == 3) {
						local36 = this.anIntArray266[local23[local27++]];
					}
					@Pc(85) Class6 local85;
					@Pc(90) int local90;
					@Pc(103) int local103;
					if (local34 == 4) {
						local85 = Class6.aClass6Array1[local23[local27++]];
						local90 = local23[local27++];
						if (local90 >= 0 && local90 < Class23.anInt445 && (!Class23.method320(local90).aBoolean112 || aBoolean229)) {
							for (local103 = 0; local103 < local85.anIntArray11.length; local103++) {
								if (local85.anIntArray11[local103] == local90 + 1) {
									local36 += local85.anIntArray12[local103];
								}
							}
						}
					}
					if (local34 == 5) {
						local36 = this.anIntArray212[local23[local27++]];
					}
					if (local34 == 6) {
						local36 = anIntArray237[this.anIntArray217[local23[local27++]] - 1];
					}
					if (local34 == 7) {
						local36 = this.anIntArray212[local23[local27++]] * 100 / 46875;
					}
					if (local34 == 8) {
						local36 = aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt613;
					}
					@Pc(178) int local178;
					if (local34 == 9) {
						for (local178 = 0; local178 < Class33.anInt544; local178++) {
							if (Class33.aBooleanArray8[local178]) {
								local36 += this.anIntArray217[local178];
							}
						}
					}
					if (local34 == 10) {
						local85 = Class6.aClass6Array1[local23[local27++]];
						local90 = local23[local27++] + 1;
						if (local90 >= 0 && local90 < Class23.anInt445 && (!Class23.method320(local90).aBoolean112 || aBoolean229)) {
							for (local103 = 0; local103 < local85.anIntArray11.length; local103++) {
								if (local85.anIntArray11[local103] == local90) {
									local36 = 999999999;
									break;
								}
							}
						}
					}
					if (local34 == 11) {
						local36 = this.anInt845;
					}
					if (local34 == 12) {
						local36 = this.anInt878;
					}
					if (local34 == 13) {
						local178 = this.anIntArray212[local23[local27++]];
						local90 = local23[local27++];
						local36 = (local178 & 0x1 << local90) == 0 ? 0 : 1;
					}
					if (local34 == 14) {
						local178 = local23[local27++];
						@Pc(293) Class3 local293 = Class3.aClass3Array1[local178];
						local103 = local293.anInt17;
						@Pc(299) int local299 = local293.anInt18;
						@Pc(302) int local302 = local293.anInt19;
						@Pc(308) int local308 = anIntArray220[local302 - local299];
						local36 = this.anIntArray212[local103] >> local299 & local308;
					}
					if (local34 == 15) {
						local38 = 1;
					}
					if (local34 == 16) {
						local38 = 2;
					}
					if (local34 == 17) {
						local38 = 3;
					}
					if (local34 == 18) {
						local36 = (aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt573 >> 7) + this.anInt931;
					}
					if (local34 == 19) {
						local36 = (aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt574 >> 7) + this.anInt932;
					}
					if (local34 == 20) {
						local36 = local23[local27++];
					}
					if (local38 == 0) {
						if (local29 == 0) {
							local25 += local36;
						}
						if (local29 == 1) {
							local25 -= local36;
						}
						if (local29 == 2 && local36 != 0) {
							local25 /= local36;
						}
						if (local29 == 3) {
							local25 *= local36;
						}
						local29 = 0;
					} else {
						local29 = local38;
					}
				}
			} catch (@Pc(401) Exception local401) {
				return -1;
			}
		} catch (@Pc(404) RuntimeException local404) {
			signlink.reporterror("21445, " + arg0 + ", " + 142 + ", " + arg1 + ", " + local404.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method623() {
		try {
			this.anInt1019 = 0;
			@Pc(15) int local15 = (aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt573 >> 7) + this.anInt931;
			@Pc(23) int local23 = (aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt574 >> 7) + this.anInt932;
			if (local15 >= 3053 && local15 <= 3156 && local23 >= 3056 && local23 <= 3136) {
				this.anInt1019 = 1;
			}
			if (local15 >= 3072 && local15 <= 3118 && local23 >= 9492 && local23 <= 9535) {
				this.anInt1019 = 1;
			}
			if (this.anInt1019 == 1 && local15 >= 3139 && local15 <= 3199 && local23 >= 3008 && local23 <= 3062) {
				this.anInt1019 = 0;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("15596, " + 0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IIII)Z")
	private boolean method624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg2 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass11_1.method165(this.anInt857, arg1, arg0, arg2);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(43) Class22 local43 = Class22.method312(local7);
				@Pc(51) int local51;
				@Pc(54) int local54;
				if (local31 == 0 || local31 == 2) {
					local51 = local43.anInt416;
					local54 = local43.anInt429;
				} else {
					local51 = local43.anInt429;
					local54 = local43.anInt416;
				}
				@Pc(65) int local65 = local43.anInt425;
				if (local31 != 0) {
					local65 = (local65 << local31 & 0xF) + (local65 >> 4 - local31);
				}
				this.method652(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0], aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0], 0, arg1, local54, 303, 0, false, local51, arg0, local65, 2);
			} else {
				this.method652(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0], aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0], local25 + 1, arg1, 0, 303, local31, false, 0, arg0, 0, 2);
			}
			this.anInt883 = super.anInt810;
			this.anInt884 = super.anInt811;
			this.anInt886 = 2;
			this.anInt885 = 0;
			return true;
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("96709, " + arg0 + ", " + arg1 + ", " + -6818 + ", " + arg2 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/lang/String;ILjava/lang/String;I)Lclient!MNPBQFWE;")
	private Class27 method625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(3) byte[] local3 = null;
			@Pc(5) int local5 = 5;
			try {
				if (this.aClass26Array1[0] != null) {
					local3 = this.aClass26Array1[0].method335(674, arg3);
				}
			} catch (@Pc(20) Exception local20) {
			}
			@Pc(34) int local34;
			if (local3 != null) {
				this.aCRC32_2.reset();
				this.aCRC32_2.update(local3);
				local34 = (int) this.aCRC32_2.getValue();
				if (local34 != arg5) {
					local3 = null;
				}
			}
			if (local3 != null) {
				return new Class27(17074, local3);
			}
			local34 = 0;
			while (local3 == null) {
				@Pc(55) String local55 = "Unknown error";
				this.method551("Requesting " + arg4, arg0);
				@Pc(70) int local70;
				try {
					local70 = 0;
					@Pc(81) DataInputStream local81 = this.method563(arg2 + arg5);
					@Pc(84) byte[] local84 = new byte[6];
					local81.readFully(local84, 0, 6);
					@Pc(95) Class1_Sub1_Sub2 local95 = new Class1_Sub1_Sub2(false, local84);
					local95.anInt10 = 3;
					@Pc(103) int local103 = local95.method26() + 6;
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
							this.method551("Loading " + arg4 + " - " + local168 + "%", arg0);
						}
						local70 = local168;
					}
					local81.close();
					try {
						if (this.aClass26Array1[0] != null) {
							this.aClass26Array1[0].method336(arg3, local3.length, local3);
						}
					} catch (@Pc(213) Exception local213) {
						this.aClass26Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local3);
						local128 = (int) this.aCRC32_2.getValue();
						if (local128 != arg5) {
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
							this.method551("Game updated - please reload page", arg0);
							local70 = 10;
						} else {
							this.method551(local55 + " - Retrying in " + local70, arg0);
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
					this.aBoolean219 = !this.aBoolean219;
				}
			}
			@Pc(349) Class27 local349 = new Class27(17074, local3);
			while (arg1 >= 0) {
				this.aClass1_Sub1_Sub2_7.method12(127);
			}
			return local349;
		} catch (@Pc(360) RuntimeException local360) {
			signlink.reporterror("24755, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local360.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method545() {
		try {
			if (this.anInt993 != 9) {
				this.anInt906 = -1;
			}
			if (!this.aBoolean240 && !this.aBoolean209 && !this.aBoolean210) {
				anInt921++;
				if (this.aBoolean234) {
					this.method666();
				} else {
					this.method572();
				}
				this.method578();
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("74569, " + 9 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)I")
	private int method626() {
		try {
			@Pc(3) int local3 = 3;
			if (this.anInt835 != 11341) {
				this.aClass36ArrayArrayArray1 = null;
			}
			if (this.anInt976 < 310) {
				@Pc(19) int local19 = this.anInt973 >> 7;
				@Pc(24) int local24 = this.anInt975 >> 7;
				@Pc(29) int local29 = aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt573 >> 7;
				@Pc(34) int local34 = aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt574 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt857][local19][local24] & 0x4) != 0) {
					local3 = this.anInt857;
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
						if ((this.aByteArrayArrayArray8[this.anInt857][local19][local24] & 0x4) != 0) {
							local3 = this.anInt857;
						}
						local86 += local84;
						if (local86 >= 65536) {
							local86 -= 65536;
							if (local24 < local34) {
								local24++;
							} else if (local24 > local34) {
								local24--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt857][local19][local24] & 0x4) != 0) {
								local3 = this.anInt857;
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
						if ((this.aByteArrayArrayArray8[this.anInt857][local19][local24] & 0x4) != 0) {
							local3 = this.anInt857;
						}
						local86 += local84;
						if (local86 >= 65536) {
							local86 -= 65536;
							if (local19 < local29) {
								local19++;
							} else if (local19 > local29) {
								local19--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt857][local19][local24] & 0x4) != 0) {
								local3 = this.anInt857;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt857][aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt573 >> 7][aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt574 >> 7] & 0x4) != 0) {
				local3 = this.anInt857;
			}
			return local3;
		} catch (@Pc(252) RuntimeException local252) {
			signlink.reporterror("63224, " + 11341 + ", " + local252.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)I")
	private int method627() {
		try {
			@Pc(16) int local16 = this.method612(this.anInt973, 938, this.anInt975, this.anInt857);
			return local16 - this.anInt974 >= 800 || (this.aByteArrayArrayArray8[this.anInt857][this.anInt973 >> 7][this.anInt975 >> 7] & 0x4) == 0 ? 3 : this.anInt857;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("35852, " + false + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method628() {
		try {
			this.aClass48_12.method503();
			Class1_Sub1_Sub3_Sub1.anIntArray28 = this.anIntArray240;
			this.aClass1_Sub1_Sub3_Sub3_18.method473(0, 0);
			if (this.anInt935 != -1) {
				this.method629(0, 0, 0, Class6.aClass6Array1[this.anInt935]);
			} else if (this.anIntArray227[this.anInt994] != -1) {
				this.method629(0, 0, 0, Class6.aClass6Array1[this.anIntArray227[this.anInt994]]);
			}
			if (this.aBoolean200 && this.anInt836 == 1) {
				this.method636((byte) 4);
			}
			this.aClass48_12.method504(super.aGraphics2, 205, 553);
			this.aClass48_14.method503();
			Class1_Sub1_Sub3_Sub1.anIntArray28 = this.anIntArray241;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("42033, " + 2 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILclient!ETSIPTYG;)V")
	private void method629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class6 arg3) {
		try {
			if (arg3.anInt48 == 0 && arg3.anIntArray13 != null && (!arg3.aBoolean18 || this.anInt855 == arg3.anInt55 || this.anInt955 == arg3.anInt55 || this.anInt970 == arg3.anInt55)) {
				@Pc(29) int local29 = Class1_Sub1_Sub3.anInt776;
				@Pc(31) int local31 = Class1_Sub1_Sub3.anInt774;
				@Pc(33) int local33 = Class1_Sub1_Sub3.anInt777;
				@Pc(35) int local35 = Class1_Sub1_Sub3.anInt775;
				Class1_Sub1_Sub3.method514(arg1 + arg3.anInt44, arg0, arg0 + arg3.anInt66, arg1);
				@Pc(59) int local59 = arg3.anIntArray13.length;
				for (@Pc(61) int local61 = 0; local61 < local59; local61++) {
					@Pc(70) int local70 = arg3.anIntArray8[local61] + arg0;
					@Pc(79) int local79 = arg3.anIntArray5[local61] + arg1 - arg2;
					@Pc(86) Class6 local86 = Class6.aClass6Array1[arg3.anIntArray13[local61]];
					@Pc(91) int local91 = local70 + local86.anInt50;
					@Pc(96) int local96 = local79 + local86.anInt54;
					if (local86.anInt70 > 0) {
						this.method657(local86);
					}
					if (local86.anInt48 == 0) {
						if (local86.anInt65 > local86.anInt40 - local86.anInt44) {
							local86.anInt65 = local86.anInt40 - local86.anInt44;
						}
						if (local86.anInt65 < 0) {
							local86.anInt65 = 0;
						}
						this.method629(local91, local96, local86.anInt65, local86);
						if (local86.anInt40 > local86.anInt44) {
							this.method663(local86.anInt44, local86.anInt40, local96, local91 + local86.anInt66, local86.anInt65);
						}
					} else if (local86.anInt48 != 1) {
						@Pc(168) int local168;
						@Pc(172) int local172;
						@Pc(183) int local183;
						@Pc(218) int local218;
						@Pc(225) int local225;
						@Pc(166) int local166;
						@Pc(216) int local216;
						if (local86.anInt48 == 2) {
							local166 = 0;
							for (local168 = 0; local168 < local86.anInt44; local168++) {
								for (local172 = 0; local172 < local86.anInt66; local172++) {
									local183 = local91 + local172 * (local86.anInt59 + 32);
									@Pc(192) int local192 = local96 + local168 * (local86.anInt72 + 32);
									if (local166 < 20) {
										local183 += local86.anIntArray9[local166];
										local192 += local86.anIntArray6[local166];
									}
									if (local86.anIntArray11[local166] > 0) {
										local216 = 0;
										local218 = 0;
										local225 = local86.anIntArray11[local166] - 1;
										if (local183 > Class1_Sub1_Sub3.anInt776 - 32 && local183 < Class1_Sub1_Sub3.anInt777 && local192 > Class1_Sub1_Sub3.anInt774 - 32 && local192 < Class1_Sub1_Sub3.anInt775 || this.anInt895 != 0 && this.anInt894 == local166) {
											@Pc(250) int local250 = 0;
											if (this.anInt1024 == 1 && this.anInt1025 == local166 && this.anInt1026 == local86.anInt55) {
												local250 = 16777215;
											}
											@Pc(274) Class1_Sub1_Sub3_Sub4 local274 = Class23.method330(local250, local86.anIntArray12[local166], local225);
											if (local274 != null) {
												@Pc(354) int local354;
												if (this.anInt895 != 0 && this.anInt894 == local166 && this.anInt893 == local86.anInt55) {
													local216 = super.anInt804 - this.anInt896;
													local218 = super.anInt805 - this.anInt897;
													if (local216 < 5 && local216 > -5) {
														local216 = 0;
													}
													if (local218 < 5 && local218 > -5) {
														local218 = 0;
													}
													if (this.anInt825 < 5) {
														local216 = 0;
														local218 = 0;
													}
													local274.method531(this.aByte36, local183 + local216, local192 + local218);
													if (local192 + local218 < Class1_Sub1_Sub3.anInt774 && arg3.anInt65 > 0) {
														local354 = this.anInt819 * (Class1_Sub1_Sub3.anInt774 - local192 - local218) / 3;
														if (local354 > this.anInt819 * 10) {
															local354 = this.anInt819 * 10;
														}
														if (local354 > arg3.anInt65) {
															local354 = arg3.anInt65;
														}
														arg3.anInt65 -= local354;
														this.anInt897 += local354;
													}
													if (local192 + local218 + 32 > Class1_Sub1_Sub3.anInt775 && arg3.anInt65 < arg3.anInt40 - arg3.anInt44) {
														local354 = this.anInt819 * (local192 + local218 + 32 - Class1_Sub1_Sub3.anInt775) / 3;
														if (local354 > this.anInt819 * 10) {
															local354 = this.anInt819 * 10;
														}
														if (local354 > arg3.anInt40 - arg3.anInt44 - arg3.anInt65) {
															local354 = arg3.anInt40 - arg3.anInt44 - arg3.anInt65;
														}
														arg3.anInt65 += local354;
														this.anInt897 -= local354;
													}
												} else if (this.anInt940 != 0 && this.anInt939 == local166 && this.anInt938 == local86.anInt55) {
													local274.method531(this.aByte36, local183, local192);
												} else {
													local274.method529(local183, local192);
												}
												if (local274.anInt790 == 33 || local86.anIntArray12[local166] != 1) {
													local354 = local86.anIntArray12[local166];
													this.aClass1_Sub1_Sub3_Sub2_2.method360(0, local192 + local218 + 10, method575(local354), local183 + local216 + 1);
													this.aClass1_Sub1_Sub3_Sub2_2.method360(16776960, local192 + local218 + 9, method575(local354), local183 + local216);
												}
											}
										}
									} else if (local86.aClass1_Sub1_Sub3_Sub4Array1 != null && local166 < 20) {
										@Pc(544) Class1_Sub1_Sub3_Sub4 local544 = local86.aClass1_Sub1_Sub3_Sub4Array1[local166];
										if (local544 != null) {
											local544.method529(local183, local192);
										}
									}
									local166++;
								}
							}
						} else if (local86.anInt48 == 3) {
							@Pc(570) boolean local570 = false;
							if (this.anInt970 == local86.anInt55 || this.anInt955 == local86.anInt55 || this.anInt855 == local86.anInt55) {
								local570 = true;
							}
							if (this.method677(local86, 261)) {
								local166 = local86.anInt49;
								if (local570 && local86.anInt46 != 0) {
									local166 = local86.anInt46;
								}
							} else {
								local166 = local86.anInt73;
								if (local570 && local86.anInt57 != 0) {
									local166 = local86.anInt57;
								}
							}
							if (local86.aByte5 == 0) {
								if (local86.aBoolean19) {
									Class1_Sub1_Sub3.method517(local96, local86.anInt44, local86.anInt66, local91, local166);
								} else {
									Class1_Sub1_Sub3.method518(local91, local86.anInt44, local86.anInt66, local96, local166);
								}
							} else if (local86.aBoolean19) {
								Class1_Sub1_Sub3.method516(local86.anInt44, local166, local96, local91, 256 - (local86.aByte5 & 0xFF), local86.anInt66);
							} else {
								Class1_Sub1_Sub3.method519(local86.anInt66, local91, local96, local86.anInt44, 256 - (local86.aByte5 & 0xFF), local166, (byte) 6);
							}
						} else {
							@Pc(688) Class1_Sub1_Sub3_Sub2 local688;
							if (local86.anInt48 == 4) {
								local688 = local86.aClass1_Sub1_Sub3_Sub2_1;
								@Pc(691) String local691 = local86.aString4;
								@Pc(693) boolean local693 = false;
								if (this.anInt970 == local86.anInt55 || this.anInt955 == local86.anInt55 || this.anInt855 == local86.anInt55) {
									local693 = true;
								}
								if (this.method677(local86, 261)) {
									local168 = local86.anInt49;
									if (local693 && local86.anInt46 != 0) {
										local168 = local86.anInt46;
									}
									if (local86.aString3.length() > 0) {
										local691 = local86.aString3;
									}
								} else {
									local168 = local86.anInt73;
									if (local693 && local86.anInt57 != 0) {
										local168 = local86.anInt57;
									}
								}
								if (local86.anInt69 == 6 && this.aBoolean198) {
									local691 = "Please wait...";
									local168 = local86.anInt73;
								}
								if (Class1_Sub1_Sub3.anInt772 == 479) {
									if (local168 == 16776960) {
										local168 = 255;
									}
									if (local168 == 49152) {
										local168 = 16777215;
									}
								}
								local216 = local96 + local688.anInt499;
								while (local691.length() > 0) {
									if (local691.indexOf("%") != -1) {
										label348: while (true) {
											local218 = local691.indexOf("%1");
											if (local218 == -1) {
												while (true) {
													local218 = local691.indexOf("%2");
													if (local218 == -1) {
														while (true) {
															local218 = local691.indexOf("%3");
															if (local218 == -1) {
																while (true) {
																	local218 = local691.indexOf("%4");
																	if (local218 == -1) {
																		while (true) {
																			local218 = local691.indexOf("%5");
																			if (local218 == -1) {
																				break label348;
																			}
																			local691 = local691.substring(0, local218) + this.method581(this.method622(4, local86)) + local691.substring(local218 + 2);
																		}
																	}
																	local691 = local691.substring(0, local218) + this.method581(this.method622(3, local86)) + local691.substring(local218 + 2);
																}
															}
															local691 = local691.substring(0, local218) + this.method581(this.method622(2, local86)) + local691.substring(local218 + 2);
														}
													}
													local691 = local691.substring(0, local218) + this.method581(this.method622(1, local86)) + local691.substring(local218 + 2);
												}
											}
											local691 = local691.substring(0, local218) + this.method581(this.method622(0, local86)) + local691.substring(local218 + 2);
										}
									}
									local218 = local691.indexOf("\\n");
									@Pc(965) String local965;
									if (local218 == -1) {
										local965 = local691;
										local691 = "";
									} else {
										local965 = local691.substring(0, local218);
										local691 = local691.substring(local218 + 2);
									}
									if (local86.aBoolean21) {
										local688.method357(local168, local965, local91 + local86.anInt66 / 2, local216, local86.aBoolean17);
									} else {
										local688.method364(local965, local216, local168, local91, 696, local86.aBoolean17);
									}
									local216 += local688.anInt499;
								}
							} else if (local86.anInt48 == 5) {
								@Pc(1027) Class1_Sub1_Sub3_Sub4 local1027;
								if (this.method677(local86, 261)) {
									local1027 = local86.aClass1_Sub1_Sub3_Sub4_1;
								} else {
									local1027 = local86.aClass1_Sub1_Sub3_Sub4_2;
								}
								if (local1027 != null) {
									local1027.method529(local91, local96);
								}
							} else if (local86.anInt48 == 6) {
								local166 = Class1_Sub1_Sub3_Sub1.anInt134;
								local168 = Class1_Sub1_Sub3_Sub1.anInt135;
								Class1_Sub1_Sub3_Sub1.anInt134 = local91 + local86.anInt66 / 2;
								Class1_Sub1_Sub3_Sub1.anInt135 = local96 + local86.anInt44 / 2;
								local172 = Class1_Sub1_Sub3_Sub1.anIntArray26[local86.anInt52] * local86.anInt51 >> 16;
								local183 = Class1_Sub1_Sub3_Sub1.anIntArray27[local86.anInt52] * local86.anInt51 >> 16;
								@Pc(1088) boolean local1088 = this.method677(local86, 261);
								if (local1088) {
									local216 = local86.anInt68;
								} else {
									local216 = local86.anInt67;
								}
								@Pc(1108) Class1_Sub1_Sub1_Sub4 local1108;
								if (local216 == -1) {
									local1108 = local86.method45(local1088, -1, -1);
								} else {
									@Pc(1114) Class29 local1114 = Class29.aClass29Array1[local216];
									local1108 = local86.method45(local1088, local1114.anIntArray140[local86.anInt47], local1114.anIntArray141[local86.anInt47]);
								}
								if (local1108 != null) {
									local1108.method259(local86.anInt53, 0, local86.anInt52, 0, local172, local183);
								}
								Class1_Sub1_Sub3_Sub1.anInt134 = local166;
								Class1_Sub1_Sub3_Sub1.anInt135 = local168;
							} else if (local86.anInt48 == 7) {
								local688 = local86.aClass1_Sub1_Sub3_Sub2_1;
								local168 = 0;
								for (local172 = 0; local172 < local86.anInt44; local172++) {
									for (local183 = 0; local183 < local86.anInt66; local183++) {
										if (local86.anIntArray11[local168] > 0) {
											@Pc(1178) Class23 local1178 = Class23.method320(local86.anIntArray11[local168] - 1);
											@Pc(1181) String local1181 = local1178.aString13;
											if (local1178.aBoolean113 || local86.anIntArray12[local168] != 1) {
												local1181 = local1181 + " x" + method637(local86.anIntArray12[local168]);
											}
											local218 = local91 + local183 * (local86.anInt59 + 115);
											local225 = local96 + local172 * (local86.anInt72 + 12);
											if (local86.aBoolean21) {
												local688.method357(local86.anInt73, local1181, local218 + local86.anInt66 / 2, local225, local86.aBoolean17);
											} else {
												local688.method364(local1181, local225, local86.anInt73, local218, 696, local86.aBoolean17);
											}
										}
										local168++;
									}
								}
							}
						}
					}
				}
				Class1_Sub1_Sub3.method514(local35, local29, local33, local31);
			}
		} catch (@Pc(1277) RuntimeException local1277) {
			signlink.reporterror("24943, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 24182 + ", " + arg3 + ", " + local1277.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)Z")
	private boolean method630(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean234 &= true;
			if (arg0 < 0) {
				return false;
			}
			@Pc(14) int local14 = this.anIntArray270[arg0];
			if (local14 >= 2000) {
				local14 -= 2000;
			}
			return local14 == 927;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("68898, " + arg0 + ", " + true + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method631(@OriginalArg(0) int arg0) {
		try {
			@Pc(6) int local6;
			if (arg0 != 8) {
				for (local6 = 1; local6 > 0; local6++) {
				}
			}
			if (this.anInt1024 == 0 && this.anInt872 == 0) {
				this.aStringArray10[this.anInt916] = "Walk here";
				this.anIntArray270[this.anInt916] = 762;
				this.anIntArray268[this.anInt916] = super.anInt804;
				this.anIntArray269[this.anInt916] = super.anInt805;
				this.anInt916++;
			}
			local6 = -1;
			for (@Pc(53) int local53 = 0; local53 < Class1_Sub1_Sub1_Sub4.anInt372; local53++) {
				@Pc(59) int local59 = Class1_Sub1_Sub1_Sub4.anIntArray106[local53];
				@Pc(63) int local63 = local59 & 0x7F;
				@Pc(69) int local69 = local59 >> 7 & 0x7F;
				@Pc(75) int local75 = local59 >> 29 & 0x3;
				@Pc(81) int local81 = local59 >> 14 & 0x7FFF;
				if (local59 != local6) {
					local6 = local59;
					@Pc(228) int local228;
					if (local75 == 2 && this.aClass11_1.method165(this.anInt857, local63, local69, local59) >= 0) {
						@Pc(101) Class22 local101 = Class22.method312(local81);
						if (local101.anIntArray115 != null) {
							local101 = local101.method308(965);
						}
						if (local101 == null) {
							continue;
						}
						if (this.anInt1024 == 1) {
							this.aStringArray10[this.anInt916] = "Use " + this.aString30 + " with @cya@" + local101.aString12;
							this.anIntArray270[this.anInt916] = 680;
							this.anIntArray271[this.anInt916] = local59;
							this.anIntArray268[this.anInt916] = local63;
							this.anIntArray269[this.anInt916] = local69;
							this.anInt916++;
						} else if (this.anInt872 != 1) {
							if (local101.aStringArray3 != null) {
								for (local228 = 4; local228 >= 0; local228--) {
									if (local101.aStringArray3[local228] != null) {
										this.aStringArray10[this.anInt916] = local101.aStringArray3[local228] + " @cya@" + local101.aString12;
										if (local228 == 0) {
											this.anIntArray270[this.anInt916] = 447;
										}
										if (local228 == 1) {
											this.anIntArray270[this.anInt916] = 147;
										}
										if (local228 == 2) {
											this.anIntArray270[this.anInt916] = 473;
										}
										if (local228 == 3) {
											this.anIntArray270[this.anInt916] = 945;
										}
										if (local228 == 4) {
											this.anIntArray270[this.anInt916] = 1521;
										}
										this.anIntArray271[this.anInt916] = local59;
										this.anIntArray268[this.anInt916] = local63;
										this.anIntArray269[this.anInt916] = local69;
										this.anInt916++;
									}
								}
							}
							this.aStringArray10[this.anInt916] = "Examine @cya@" + local101.aString12;
							this.anIntArray270[this.anInt916] = 1132;
							this.anIntArray271[this.anInt916] = local101.anInt422 << 14;
							this.anIntArray268[this.anInt916] = local63;
							this.anIntArray269[this.anInt916] = local69;
							this.anInt916++;
						} else if ((this.anInt874 & 0x4) == 4) {
							this.aStringArray10[this.anInt916] = this.aString20 + " @cya@" + local101.aString12;
							this.anIntArray270[this.anInt916] = 505;
							this.anIntArray271[this.anInt916] = local59;
							this.anIntArray268[this.anInt916] = local63;
							this.anIntArray269[this.anInt916] = local69;
							this.anInt916++;
						}
					}
					@Pc(408) Class1_Sub1_Sub1_Sub3_Sub1 local408;
					@Pc(457) Class1_Sub1_Sub1_Sub3_Sub2 local457;
					@Pc(447) int local447;
					if (local75 == 1) {
						@Pc(379) Class1_Sub1_Sub1_Sub3_Sub1 local379 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local81];
						if (local379.aClass38_1.aByte26 == 1 && (local379.anInt573 & 0x7F) == 64 && (local379.anInt574 & 0x7F) == 64) {
							for (local228 = 0; local228 < this.anInt863; local228++) {
								local408 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[this.anIntArray218[local228]];
								if (local408 != null && local408 != local379 && local408.aClass38_1.aByte26 == 1 && local408.anInt573 == local379.anInt573 && local408.anInt574 == local379.anInt574) {
									this.method562(this.anIntArray218[local228], local69, local408.aClass38_1, this.aByte34, local63);
								}
							}
							for (local447 = 0; local447 < this.anInt959; local447++) {
								local457 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[this.anIntArray256[local447]];
								if (local457 != null && local457.anInt573 == local379.anInt573 && local457.anInt574 == local379.anInt574) {
									this.method653(local63, this.anIntArray256[local447], local457, local69);
								}
							}
						}
						this.method562(local81, local69, local379.aClass38_1, this.aByte34, local63);
					}
					if (local75 == 0) {
						@Pc(500) Class1_Sub1_Sub1_Sub3_Sub2 local500 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local81];
						if ((local500.anInt573 & 0x7F) == 64 && (local500.anInt574 & 0x7F) == 64) {
							for (local228 = 0; local228 < this.anInt863; local228++) {
								local408 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[this.anIntArray218[local228]];
								if (local408 != null && local408.aClass38_1.aByte26 == 1 && local408.anInt573 == local500.anInt573 && local408.anInt574 == local500.anInt574) {
									this.method562(this.anIntArray218[local228], local69, local408.aClass38_1, this.aByte34, local63);
								}
							}
							for (local447 = 0; local447 < this.anInt959; local447++) {
								local457 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[this.anIntArray256[local447]];
								if (local457 != null && local457 != local500 && local457.anInt573 == local500.anInt573 && local457.anInt574 == local500.anInt574) {
									this.method653(local63, this.anIntArray256[local447], local457, local69);
								}
							}
						}
						this.method653(local63, local81, local500, local69);
					}
					if (local75 == 3) {
						@Pc(620) Class36 local620 = this.aClass36ArrayArrayArray1[this.anInt857][local63][local69];
						if (local620 != null) {
							for (@Pc(627) Class1_Sub1_Sub1_Sub6 local627 = (Class1_Sub1_Sub1_Sub6) local620.method401(); local627 != null; local627 = (Class1_Sub1_Sub1_Sub6) local620.method403()) {
								@Pc(633) Class23 local633 = Class23.method320(local627.anInt768);
								if (this.anInt1024 == 1) {
									this.aStringArray10[this.anInt916] = "Use " + this.aString30 + " with @lre@" + local633.aString13;
									this.anIntArray270[this.anInt916] = 109;
									this.anIntArray271[this.anInt916] = local627.anInt768;
									this.anIntArray268[this.anInt916] = local63;
									this.anIntArray269[this.anInt916] = local69;
									this.anInt916++;
								} else if (this.anInt872 != 1) {
									for (@Pc(750) int local750 = 4; local750 >= 0; local750--) {
										if (local633.aStringArray5 != null && local633.aStringArray5[local750] != null) {
											this.aStringArray10[this.anInt916] = local633.aStringArray5[local750] + " @lre@" + local633.aString13;
											if (local750 == 0) {
												this.anIntArray270[this.anInt916] = 454;
											}
											if (local750 == 1) {
												this.anIntArray270[this.anInt916] = 511;
											}
											if (local750 == 2) {
												this.anIntArray270[this.anInt916] = 848;
											}
											if (local750 == 3) {
												this.anIntArray270[this.anInt916] = 512;
											}
											if (local750 == 4) {
												this.anIntArray270[this.anInt916] = 741;
											}
											this.anIntArray271[this.anInt916] = local627.anInt768;
											this.anIntArray268[this.anInt916] = local63;
											this.anIntArray269[this.anInt916] = local69;
											this.anInt916++;
										} else if (local750 == 2) {
											this.aStringArray10[this.anInt916] = "Take @lre@" + local633.aString13;
											this.anIntArray270[this.anInt916] = 848;
											this.anIntArray271[this.anInt916] = local627.anInt768;
											this.anIntArray268[this.anInt916] = local63;
											this.anIntArray269[this.anInt916] = local69;
											this.anInt916++;
										}
									}
									this.aStringArray10[this.anInt916] = "Examine @lre@" + local633.aString13;
									this.anIntArray270[this.anInt916] = 1515;
									this.anIntArray271[this.anInt916] = local627.anInt768;
									this.anIntArray268[this.anInt916] = local63;
									this.anIntArray269[this.anInt916] = local69;
									this.anInt916++;
								} else if ((this.anInt874 & 0x1) == 1) {
									this.aStringArray10[this.anInt916] = this.aString20 + " @lre@" + local633.aString13;
									this.anIntArray270[this.anInt916] = 51;
									this.anIntArray271[this.anInt916] = local627.anInt768;
									this.anIntArray268[this.anInt916] = local63;
									this.anIntArray269[this.anInt916] = local69;
									this.anInt916++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(957) RuntimeException local957) {
			signlink.reporterror("27133, " + arg0 + ", " + local957.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	@Override
	public void method550(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}
		if (signlink.mainapp == null) {
			super.method550(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
	private void method632(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.method619(this.aBoolean224);
			this.aClass48_5.method503();
			if (arg0 == -41990) {
				this.aClass1_Sub1_Sub3_Sub3_4.method473(0, 0);
				@Pc(49) byte local49;
				@Pc(61) int local61;
				if (this.anInt827 == 0) {
					this.aClass1_Sub1_Sub3_Sub2_2.method357(7711145, this.aClass7_Sub1_1.aString7, 180, 180, true);
					local49 = 80;
					this.aClass1_Sub1_Sub3_Sub2_4.method357(16776960, "Welcome to RuneScape", 180, 80, true);
					local61 = local49 + 30;
					this.aClass1_Sub1_Sub3_Sub3_5.method473(27, 100);
					this.aClass1_Sub1_Sub3_Sub2_4.method357(16777215, "New User", 100, 125, true);
					this.aClass1_Sub1_Sub3_Sub3_5.method473(187, 100);
					this.aClass1_Sub1_Sub3_Sub2_4.method357(16777215, "Existing User", 260, 125, true);
				}
				if (this.anInt827 == 2) {
					local49 = 60;
					if (this.aString27.length() > 0) {
						this.aClass1_Sub1_Sub3_Sub2_4.method357(16776960, this.aString27, 180, 45, true);
						this.aClass1_Sub1_Sub3_Sub2_4.method357(16776960, this.aString28, 180, 60, true);
						local61 = local49 + 30;
					} else {
						this.aClass1_Sub1_Sub3_Sub2_4.method357(16776960, this.aString28, 180, 53, true);
						local61 = local49 + 30;
					}
					this.aClass1_Sub1_Sub3_Sub2_4.method364("Username: " + this.aString21 + (this.anInt859 == 0 & anInt921 % 40 < 20 ? "@yel@|" : ""), 90, 16777215, 90, 696, true);
					local61 += 15;
					this.aClass1_Sub1_Sub3_Sub2_4.method364("Password: " + Class31.method384(this.aString22) + (this.anInt859 == 1 & anInt921 % 40 < 20 ? "@yel@|" : ""), 105, 16777215, 92, 696, true);
					local61 += 15;
					if (!arg1) {
						this.aClass1_Sub1_Sub3_Sub3_5.method473(27, 130);
						this.aClass1_Sub1_Sub3_Sub2_4.method357(16777215, "Login", 100, 155, true);
						this.aClass1_Sub1_Sub3_Sub3_5.method473(187, 130);
						this.aClass1_Sub1_Sub3_Sub2_4.method357(16777215, "Cancel", 260, 155, true);
					}
				}
				if (this.anInt827 == 3) {
					this.aClass1_Sub1_Sub3_Sub2_4.method357(16776960, "Create a free account", 180, 40, true);
					local49 = 65;
					this.aClass1_Sub1_Sub3_Sub2_4.method357(16777215, "To create a new account you need to", 180, 65, true);
					local61 = local49 + 15;
					this.aClass1_Sub1_Sub3_Sub2_4.method357(16777215, "go back to the main RuneScape webpage", 180, 80, true);
					local61 += 15;
					this.aClass1_Sub1_Sub3_Sub2_4.method357(16777215, "and choose the red 'create account'", 180, 95, true);
					local61 += 15;
					this.aClass1_Sub1_Sub3_Sub2_4.method357(16777215, "button at the top right of that page.", 180, 110, true);
					local61 += 15;
					this.aClass1_Sub1_Sub3_Sub3_5.method473(107, 130);
					this.aClass1_Sub1_Sub3_Sub2_4.method357(16777215, "Cancel", 180, 155, true);
				}
				this.aClass48_5.method504(super.aGraphics2, 171, 202);
				if (this.aBoolean231) {
					this.aBoolean231 = false;
					this.aClass48_3.method504(super.aGraphics2, 0, 128);
					this.aClass48_4.method504(super.aGraphics2, 371, 202);
					this.aClass48_8.method504(super.aGraphics2, 265, 0);
					this.aClass48_9.method504(super.aGraphics2, 265, 562);
					this.aClass48_10.method504(super.aGraphics2, 171, 128);
					this.aClass48_11.method504(super.aGraphics2, 171, 562);
				}
			}
		} catch (@Pc(494) RuntimeException local494) {
			signlink.reporterror("77573, " + arg0 + ", " + arg1 + ", " + local494.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!BJPWOXRJ;I)V")
	private void method633(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub2 arg1) {
		try {
			arg1.method32();
			@Pc(18) int local18 = arg1.method33(1);
			if (local18 != 0) {
				@Pc(26) int local26 = arg1.method33(2);
				if (local26 == 0) {
					this.anIntArray257[this.anInt960++] = this.anInt958;
				} else {
					@Pc(49) int local49;
					@Pc(59) int local59;
					if (local26 == 1) {
						local49 = arg1.method33(3);
						aClass1_Sub1_Sub1_Sub3_Sub2_1.method392(false, local49);
						local59 = arg1.method33(1);
						if (local59 == 1) {
							this.anIntArray257[this.anInt960++] = this.anInt958;
						}
					} else {
						@Pc(103) int local103;
						if (local26 == 2) {
							local49 = arg1.method33(3);
							aClass1_Sub1_Sub1_Sub3_Sub2_1.method392(true, local49);
							local59 = arg1.method33(3);
							aClass1_Sub1_Sub1_Sub3_Sub2_1.method392(true, local59);
							local103 = arg1.method33(1);
							if (local103 == 1) {
								this.anIntArray257[this.anInt960++] = this.anInt958;
							}
						} else if (local26 == 3) {
							this.anInt857 = arg1.method33(2);
							local49 = arg1.method33(7);
							local59 = arg1.method33(7);
							local103 = arg1.method33(1);
							@Pc(148) int local148 = arg1.method33(1);
							if (local148 == 1) {
								this.anIntArray257[this.anInt960++] = this.anInt958;
							}
							aClass1_Sub1_Sub1_Sub3_Sub2_1.method393(local59, local103 == 1, local49);
						}
					}
				}
			}
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("74094, " + arg0 + ", " + arg1 + ", " + 26447 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(IIII)I")
	private int method634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(7) int local7 = 256 - arg2;
			return ((arg1 & 0xFF00FF) * local7 + (arg3 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg1 & 0xFF00) * local7 + (arg3 & 0xFF00) * arg2 & 0xFF0000) >> 8;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("17894, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method547() {
		try {
			if (this.aBoolean240 || this.aBoolean209 || this.aBoolean210) {
				this.method617();
			} else {
				anInt1006++;
				if (this.aBoolean234) {
					this.method603();
				} else {
					this.method632(this.anInt826, false);
				}
				this.anInt915 = 0;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("78176, " + false + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI[B)V")
	private void method635(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		try {
			signlink.anInt1035 = arg0 ? 1 : 0;
			signlink.midisave(arg2, arg2.length);
			@Pc(13) int local13 = 44 / arg1;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("73217, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method546(@OriginalArg(0) int arg0) {
		try {
			signlink.reporterror = false;
			try {
				if (this.aClass16_1 != null) {
					this.aClass16_1.method225();
				}
			} catch (@Pc(11) Exception local11) {
			}
			this.aClass16_1 = null;
			this.method554();
			if (this.aClass32_1 != null) {
				this.aClass32_1.aBoolean135 = false;
			}
			this.aClass32_1 = null;
			this.aClass7_Sub1_1.method62();
			this.aClass7_Sub1_1 = null;
			this.aClass1_Sub1_Sub2_8 = null;
			this.aClass1_Sub1_Sub2_7 = null;
			this.aClass1_Sub1_Sub2_6 = null;
			this.aClass1_Sub1_Sub2_9 = null;
			this.anIntArray251 = null;
			this.aByteArrayArray4 = null;
			this.aByteArrayArray5 = null;
			this.anIntArray252 = null;
			this.anIntArray253 = null;
			this.anIntArrayArrayArray7 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass11_1 = null;
			this.aClass13Array1 = null;
			this.anIntArrayArray25 = null;
			this.anIntArrayArray23 = null;
			this.anIntArray260 = null;
			this.anIntArray261 = null;
			this.aByteArray21 = null;
			this.aClass48_12 = null;
			this.aClass48_13 = null;
			this.aClass48_14 = null;
			this.aClass48_15 = null;
			this.aClass48_25 = null;
			this.aClass48_26 = null;
			this.aClass48_27 = null;
			this.aClass48_16 = null;
			this.aClass48_17 = null;
			this.aClass48_18 = null;
			this.aClass48_19 = null;
			this.aClass48_20 = null;
			this.aClass48_21 = null;
			this.aClass48_22 = null;
			this.aClass48_23 = null;
			this.aClass48_24 = null;
			this.aClass1_Sub1_Sub3_Sub3_18 = null;
			this.aClass1_Sub1_Sub3_Sub3_19 = null;
			if (arg0 <= 0) {
				anInt861 = this.aClass9_2.method69();
			}
			this.aClass1_Sub1_Sub3_Sub3_20 = null;
			this.aClass1_Sub1_Sub3_Sub3_1 = null;
			this.aClass1_Sub1_Sub3_Sub3_2 = null;
			this.aClass1_Sub1_Sub3_Sub3_3 = null;
			this.aClass1_Sub1_Sub3_Sub3Array4 = null;
			this.aClass1_Sub1_Sub3_Sub3_13 = null;
			this.aClass1_Sub1_Sub3_Sub3_14 = null;
			this.aClass1_Sub1_Sub3_Sub3_15 = null;
			this.aClass1_Sub1_Sub3_Sub3_16 = null;
			this.aClass1_Sub1_Sub3_Sub3_17 = null;
			this.aClass1_Sub1_Sub3_Sub3_6 = null;
			this.aClass1_Sub1_Sub3_Sub3_7 = null;
			this.aClass1_Sub1_Sub3_Sub3_8 = null;
			this.aClass1_Sub1_Sub3_Sub3_9 = null;
			this.aClass1_Sub1_Sub3_Sub3_10 = null;
			this.aClass1_Sub1_Sub3_Sub4_16 = null;
			this.aClass1_Sub1_Sub3_Sub4Array8 = null;
			this.aClass1_Sub1_Sub3_Sub4Array6 = null;
			this.aClass1_Sub1_Sub3_Sub4Array5 = null;
			this.aClass1_Sub1_Sub3_Sub4_7 = null;
			this.aClass1_Sub1_Sub3_Sub4_8 = null;
			this.aClass1_Sub1_Sub3_Sub4_9 = null;
			this.aClass1_Sub1_Sub3_Sub4_10 = null;
			this.aClass1_Sub1_Sub3_Sub4_11 = null;
			this.aClass1_Sub1_Sub3_Sub3Array2 = null;
			this.aClass1_Sub1_Sub3_Sub4Array7 = null;
			this.anIntArrayArray24 = null;
			this.aClass1_Sub1_Sub1_Sub3_Sub2Array1 = null;
			this.anIntArray256 = null;
			this.anIntArray257 = null;
			this.aClass1_Sub1_Sub2Array1 = null;
			this.anIntArray238 = null;
			this.aClass1_Sub1_Sub1_Sub3_Sub1Array1 = null;
			this.anIntArray218 = null;
			this.aClass36ArrayArrayArray1 = null;
			this.aClass36_12 = null;
			this.aClass36_10 = null;
			this.aClass36_11 = null;
			this.anIntArray268 = null;
			this.anIntArray269 = null;
			this.anIntArray270 = null;
			this.anIntArray271 = null;
			this.aStringArray10 = null;
			this.anIntArray212 = null;
			this.anIntArray262 = null;
			this.anIntArray263 = null;
			this.aClass1_Sub1_Sub3_Sub4Array4 = null;
			this.aClass1_Sub1_Sub3_Sub4_15 = null;
			this.aStringArray8 = null;
			this.aLongArray4 = null;
			this.anIntArray244 = null;
			this.aClass48_6 = null;
			this.aClass48_7 = null;
			this.aClass48_3 = null;
			this.aClass48_4 = null;
			this.aClass48_5 = null;
			this.aClass48_8 = null;
			this.aClass48_9 = null;
			this.aClass48_10 = null;
			this.aClass48_11 = null;
			this.method650();
			Class22.method310();
			Class38.method413();
			Class23.method326();
			Class18.aClass18Array1 = null;
			Class37.aClass37Array1 = null;
			Class6.aClass6Array1 = null;
			Class24.aClass24Array1 = null;
			Class29.aClass29Array1 = null;
			Class25.aClass25Array1 = null;
			Class25.aClass15_7 = null;
			Class17.aClass17Array1 = null;
			super.aClass48_2 = null;
			Class1_Sub1_Sub1_Sub3_Sub2.aClass15_8 = null;
			Class1_Sub1_Sub3_Sub1.method100();
			Class11.method134();
			Class1_Sub1_Sub1_Sub4.method235();
			Class42.method477();
			System.gc();
		} catch (@Pc(376) RuntimeException local376) {
			signlink.reporterror("64105, " + arg0 + ", " + local376.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method636(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) int local4 = this.anInt837;
			@Pc(7) int local7 = this.anInt838;
			@Pc(10) int local10 = this.anInt839;
			@Pc(13) int local13 = this.anInt840;
			Class1_Sub1_Sub3.method517(local7, local13, local10, local4, 6116423);
			Class1_Sub1_Sub3.method517(local7 + 1, 16, local10 - 2, local4 + 1, 0);
			Class1_Sub1_Sub3.method518(local4 + 1, local13 - 19, local10 - 2, local7 + 18, 0);
			this.aClass1_Sub1_Sub3_Sub2_4.method360(6116423, local7 + 14, "Choose Option", local4 + 3);
			@Pc(67) boolean local67 = false;
			@Pc(79) int local79 = super.anInt804;
			@Pc(82) int local82 = super.anInt805;
			if (this.anInt836 == 0) {
				local79 -= 4;
				local82 -= 4;
			}
			if (this.anInt836 == 1) {
				local79 -= 553;
				local82 -= 205;
			}
			if (this.anInt836 == 2) {
				local79 -= 17;
				local82 -= 357;
			}
			for (@Pc(101) int local101 = 0; local101 < this.anInt916; local101++) {
				@Pc(116) int local116 = local7 + (this.anInt916 - 1 - local101) * 15 + 31;
				@Pc(118) int local118 = 16777215;
				if (local79 > local4 && local79 < local4 + local10 && local82 > local116 - 13 && local82 < local116 + 3) {
					local118 = 16776960;
				}
				this.aClass1_Sub1_Sub3_Sub2_4.method364(this.aStringArray10[local101], local116, local118, local4 + 3, 696, true);
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("42545, " + arg0 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method638() {
		try {
			for (@Pc(16) Class1_Sub1_Sub1_Sub1 local16 = (Class1_Sub1_Sub1_Sub1) this.aClass36_11.method400(); local16 != null; local16 = (Class1_Sub1_Sub1_Sub1) this.aClass36_11.method402((byte) 2)) {
				if (local16.anInt146 != this.anInt857 || local16.aBoolean40) {
					local16.method510();
				} else if (anInt921 >= local16.anInt145) {
					local16.method127(this.aByte31, this.anInt819);
					if (local16.aBoolean40) {
						local16.method510();
					} else {
						this.aClass11_1.method146(60, local16, local16.anInt146, -1, local16.anInt149, 0, local16.anInt147, local16.anInt148, false);
					}
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("87953, " + 70 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method639(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			if (this.anInt868 != 0) {
				@Pc(9) int local9 = 0;
				if (this.anInt1018 != 0) {
					local9 = 1;
				}
				for (@Pc(16) int local16 = 0; local16 < 100; local16++) {
					if (this.aStringArray12[local16] != null) {
						@Pc(28) int local28 = this.anIntArray258[local16];
						@Pc(33) String local33 = this.aStringArray11[local16];
						if (local33 != null && local33.startsWith("@cr1@")) {
							local33 = local33.substring(5);
						}
						if (local33 != null && local33.startsWith("@cr2@")) {
							local33 = local33.substring(5);
						}
						if ((local28 == 3 || local28 == 7) && (local28 == 7 || this.anInt930 == 0 || this.anInt930 == 1 && this.method560(local33))) {
							@Pc(86) int local86 = 329 - local9 * 13;
							if (super.anInt804 > 4 && super.anInt805 - 4 > local86 - 10 && super.anInt805 - 4 <= local86 + 3) {
								@Pc(126) int local126 = this.aClass1_Sub1_Sub3_Sub2_3.method358(this.aBoolean199, "From:  " + local33 + this.aStringArray12[local16]) + 25;
								if (local126 > 450) {
									local126 = 450;
								}
								if (super.anInt804 < local126 + 4) {
									if (this.anInt1003 >= 1) {
										this.aStringArray10[this.anInt916] = "Report abuse @whi@" + local33;
										this.anIntArray270[this.anInt916] = 2803;
										this.anInt916++;
									}
									this.aStringArray10[this.anInt916] = "Add ignore @whi@" + local33;
									this.anIntArray270[this.anInt916] = 2266;
									this.anInt916++;
									this.aStringArray10[this.anInt916] = "Add friend @whi@" + local33;
									this.anIntArray270[this.anInt916] = 2927;
									this.anInt916++;
								}
							}
							local9++;
							if (local9 >= 5) {
								return;
							}
						}
						if ((local28 == 5 || local28 == 6) && this.anInt930 < 2) {
							local9++;
							if (local9 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(239) RuntimeException local239) {
			signlink.reporterror("69510, " + arg0 + ", " + local239.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method640() {
		try {
			this.aClass48_15.method503();
			Class1_Sub1_Sub3_Sub1.anIntArray28 = this.anIntArray239;
			this.aClass1_Sub1_Sub3_Sub3_20.method473(0, 0);
			if (this.aBoolean192) {
				this.aClass1_Sub1_Sub3_Sub2_4.method356(239, 40, this.aString29, 0);
				this.aClass1_Sub1_Sub3_Sub2_4.method356(239, 60, this.aString19 + "*", 128);
			} else if (this.aBoolean214) {
				this.aClass1_Sub1_Sub3_Sub2_4.method356(239, 40, "Enter amount:", 0);
				this.aClass1_Sub1_Sub3_Sub2_4.method356(239, 60, this.aString17 + "*", 128);
			} else if (this.aString23 != null) {
				this.aClass1_Sub1_Sub3_Sub2_4.method356(239, 40, this.aString23, 0);
				this.aClass1_Sub1_Sub3_Sub2_4.method356(239, 60, "Click to continue", 128);
			} else if (this.anInt991 != -1) {
				this.method629(0, 0, 0, Class6.aClass6Array1[this.anInt991]);
			} else if (this.anInt1005 == -1) {
				@Pc(130) Class1_Sub1_Sub3_Sub2 local130 = this.aClass1_Sub1_Sub3_Sub2_3;
				@Pc(132) int local132 = 0;
				Class1_Sub1_Sub3.method514(77, 0, 463, 0);
				for (@Pc(140) int local140 = 0; local140 < 100; local140++) {
					if (this.aStringArray12[local140] != null) {
						@Pc(152) int local152 = this.anIntArray258[local140];
						@Pc(161) int local161 = this.anInt902 + 70 - local132 * 14;
						@Pc(166) String local166 = this.aStringArray11[local140];
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
								local130.method360(0, local161, this.aStringArray12[local140], 4);
							}
							local132++;
						}
						@Pc(238) int local238;
						if ((local152 == 1 || local152 == 2) && (local152 == 1 || this.anInt834 == 0 || this.anInt834 == 1 && this.method560(local166))) {
							if (local161 > 0 && local161 < 110) {
								local238 = 4;
								if (local168 == 1) {
									this.aClass1_Sub1_Sub3_Sub3Array5[0].method473(4, local161 - 12);
									local238 += 14;
								}
								if (local168 == 2) {
									this.aClass1_Sub1_Sub3_Sub3Array5[1].method473(local238, local161 - 12);
									local238 += 14;
								}
								local130.method360(0, local161, local166 + ":", local238);
								local238 += local130.method358(this.aBoolean199, local166) + 8;
								local130.method360(255, local161, this.aStringArray12[local140], local238);
							}
							local132++;
						}
						if ((local152 == 3 || local152 == 7) && this.anInt868 == 0 && (local152 == 7 || this.anInt930 == 0 || this.anInt930 == 1 && this.method560(local166))) {
							if (local161 > 0 && local161 < 110) {
								local130.method360(0, local161, "From", 4);
								local238 = local130.method358(this.aBoolean199, "From ") + 4;
								if (local168 == 1) {
									this.aClass1_Sub1_Sub3_Sub3Array5[0].method473(local238, local161 - 12);
									local238 += 14;
								}
								if (local168 == 2) {
									this.aClass1_Sub1_Sub3_Sub3Array5[1].method473(local238, local161 - 12);
									local238 += 14;
								}
								local130.method360(0, local161, local166 + ":", local238);
								local238 += local130.method358(this.aBoolean199, local166) + 8;
								local130.method360(8388608, local161, this.aStringArray12[local140], local238);
							}
							local132++;
						}
						if (local152 == 4 && (this.anInt847 == 0 || this.anInt847 == 1 && this.method560(local166))) {
							if (local161 > 0 && local161 < 110) {
								local130.method360(8388736, local161, local166 + " " + this.aStringArray12[local140], 4);
							}
							local132++;
						}
						if (local152 == 5 && this.anInt868 == 0 && this.anInt930 < 2) {
							if (local161 > 0 && local161 < 110) {
								local130.method360(8388608, local161, this.aStringArray12[local140], 4);
							}
							local132++;
						}
						if (local152 == 6 && this.anInt868 == 0 && this.anInt930 < 2) {
							if (local161 > 0 && local161 < 110) {
								local130.method360(0, local161, "To " + local166 + ":", 4);
								local130.method360(8388608, local161, this.aStringArray12[local140], local130.method358(this.aBoolean199, "To " + local166) + 12);
							}
							local132++;
						}
						if (local152 == 8 && (this.anInt847 == 0 || this.anInt847 == 1 && this.method560(local166))) {
							if (local161 > 0 && local161 < 110) {
								local130.method360(8270336, local161, local166 + " " + this.aStringArray12[local140], 4);
							}
							local132++;
						}
					}
				}
				Class1_Sub1_Sub3.method513();
				this.anInt971 = local132 * 14 + 7;
				if (this.anInt971 < 78) {
					this.anInt971 = 78;
				}
				this.method663(77, this.anInt971, 0, 463, this.anInt971 - this.anInt902 - 77);
				@Pc(612) String local612;
				if (aClass1_Sub1_Sub1_Sub3_Sub2_1 == null || aClass1_Sub1_Sub1_Sub3_Sub2_1.aString15 == null) {
					local612 = Class31.method383(this.aString21);
				} else {
					local612 = aClass1_Sub1_Sub1_Sub3_Sub2_1.aString15;
				}
				local130.method360(0, 90, local612 + ":", 4);
				local130.method360(255, 90, this.aString25 + "*", local130.method358(this.aBoolean199, local612 + ": ") + 6);
				Class1_Sub1_Sub3.method520(0, 479, 77, 0);
			} else {
				this.method629(0, 0, 0, Class6.aClass6Array1[this.anInt1005]);
			}
			if (this.aBoolean200 && this.anInt836 == 2) {
				this.method636((byte) 4);
			}
			this.aClass48_15.method504(super.aGraphics2, 357, 17);
			this.aClass48_14.method503();
			Class1_Sub1_Sub3_Sub1.anIntArray28 = this.anIntArray241;
		} catch (@Pc(703) RuntimeException local703) {
			signlink.reporterror("92008, " + 7 + ", " + local703.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method641() {
		try {
			if (this.anInt909 > 0) {
				this.method680(this.aBoolean195);
			} else {
				this.aClass48_14.method503();
				this.aClass1_Sub1_Sub3_Sub2_3.method356(257, 144, "Connection lost", 0);
				this.aClass1_Sub1_Sub3_Sub2_3.method356(256, 143, "Connection lost", 16777215);
				this.aClass1_Sub1_Sub3_Sub2_3.method356(257, 159, "Please wait - attempting to reestablish", 0);
				this.aClass1_Sub1_Sub3_Sub2_3.method356(256, 158, "Please wait - attempting to reestablish", 16777215);
				this.aClass48_14.method504(super.aGraphics2, 4, 4);
				this.anInt852 = 0;
				this.anInt981 = 0;
				@Pc(73) Class16 local73 = this.aClass16_1;
				this.aBoolean234 = false;
				this.anInt945 = 0;
				this.method615(this.aString21, this.aString22, true);
				if (!this.aBoolean234) {
					this.method680(this.aBoolean195);
				}
				try {
					local73.method225();
				} catch (@Pc(97) Exception local97) {
				}
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("69237, " + 3 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZII)Z")
	private boolean method642(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(11) boolean local11 = false;
			@Pc(15) Class6 local15 = Class6.aClass6Array1[arg1];
			for (@Pc(17) int local17 = 0; local17 < local15.anIntArray13.length && local15.anIntArray13[local17] != -1; local17++) {
				@Pc(32) Class6 local32 = Class6.aClass6Array1[local15.anIntArray13[local17]];
				if (local32.anInt48 == 1) {
					local11 |= this.method642(arg0, local32.anInt55);
				}
				if (local32.anInt48 == 6 && (local32.anInt67 != -1 || local32.anInt68 != -1)) {
					@Pc(62) boolean local62 = this.method677(local32, 261);
					@Pc(67) int local67;
					if (local62) {
						local67 = local32.anInt68;
					} else {
						local67 = local32.anInt67;
					}
					if (local67 != -1) {
						@Pc(79) Class29 local79 = Class29.aClass29Array1[local67];
						local32.anInt45 += arg0;
						while (local32.anInt45 > local79.method377(local32.anInt47, this.aBoolean223)) {
							local32.anInt45 -= local79.method377(local32.anInt47, this.aBoolean223) + 1;
							local32.anInt47++;
							if (local32.anInt47 >= local79.anInt502) {
								local32.anInt47 -= local79.anInt503;
								if (local32.anInt47 < 0 || local32.anInt47 >= local79.anInt502) {
									local32.anInt47 = 0;
								}
							}
							local11 = true;
						}
					}
				}
			}
			return local11;
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("80026, " + false + ", " + arg0 + ", " + arg1 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)Ljava/net/Socket;")
	public Socket method643(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method644() {
		try {
			for (@Pc(16) Class1_Sub3 local16 = (Class1_Sub3) this.aClass36_12.method400(); local16 != null; local16 = (Class1_Sub3) this.aClass36_12.method402((byte) 2)) {
				if (local16.anInt738 == -1) {
					local16.anInt739 = 0;
					this.method678(local16);
				} else {
					local16.method510();
				}
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("82979, " + false + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	private void method645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			@Pc(1) Class1_Sub3 local1 = null;
			for (@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) this.aClass36_12.method400(); local6 != null; local6 = (Class1_Sub3) this.aClass36_12.method402((byte) 2)) {
				if (local6.anInt731 == arg0 && local6.anInt733 == arg1 && local6.anInt734 == arg6 && local6.anInt732 == arg7) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class1_Sub3();
				local1.anInt731 = arg0;
				local1.anInt732 = arg7;
				local1.anInt733 = arg1;
				local1.anInt734 = arg6;
				this.method678(local1);
				this.aClass36_12.method397(local1);
			}
			local1.anInt735 = arg2;
			local1.anInt737 = arg4;
			@Pc(71) boolean local71 = false;
			local1.anInt736 = arg8;
			local1.anInt739 = arg3;
			local1.anInt738 = arg9;
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("33554, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method646(@OriginalArg(0) boolean arg0) {
		try {
			if (this.anInt895 == 0) {
				this.aStringArray10[0] = "Cancel";
				this.anIntArray270[0] = 1103;
				if (!arg0) {
					this.anInt916 = 1;
					this.method639(877);
					this.anInt1009 = 0;
					if (super.anInt804 > 4 && super.anInt805 > 4 && super.anInt804 < 516 && super.anInt805 < 338) {
						if (this.anInt823 == -1) {
							this.method631(this.anInt966);
						} else {
							this.method676(super.anInt804, Class6.aClass6Array1[this.anInt823], super.anInt805, 0, 4, 4);
						}
					}
					if (this.anInt1009 != this.anInt855) {
						this.anInt855 = this.anInt1009;
					}
					this.anInt1009 = 0;
					if (super.anInt804 > 553 && super.anInt805 > 205 && super.anInt804 < 743 && super.anInt805 < 466) {
						if (this.anInt935 != -1) {
							this.method676(super.anInt804, Class6.aClass6Array1[this.anInt935], super.anInt805, 0, 553, 205);
						} else if (this.anIntArray227[this.anInt994] != -1) {
							this.method676(super.anInt804, Class6.aClass6Array1[this.anIntArray227[this.anInt994]], super.anInt805, 0, 553, 205);
						}
					}
					if (this.anInt1009 != this.anInt955) {
						this.aBoolean203 = true;
						this.anInt955 = this.anInt1009;
					}
					this.anInt1009 = 0;
					if (super.anInt804 > 17 && super.anInt805 > 357 && super.anInt804 < 496 && super.anInt805 < 453) {
						if (this.anInt991 != -1) {
							this.method676(super.anInt804, Class6.aClass6Array1[this.anInt991], super.anInt805, 0, 17, 357);
						} else if (super.anInt805 < 434 && super.anInt804 < 426) {
							this.method570(super.anInt804 - 17, super.anInt805 - 357);
						}
					}
					if (this.anInt991 != -1 && this.anInt1009 != this.anInt970) {
						this.aBoolean205 = true;
						this.anInt970 = this.anInt1009;
					}
					@Pc(227) boolean local227 = false;
					while (!local227) {
						local227 = true;
						for (@Pc(233) int local233 = 0; local233 < this.anInt916 - 1; local233++) {
							if (this.anIntArray270[local233] < 1000 && this.anIntArray270[local233 + 1] > 1000) {
								@Pc(254) String local254 = this.aStringArray10[local233];
								this.aStringArray10[local233] = this.aStringArray10[local233 + 1];
								this.aStringArray10[local233 + 1] = local254;
								@Pc(276) int local276 = this.anIntArray270[local233];
								this.anIntArray270[local233] = this.anIntArray270[local233 + 1];
								this.anIntArray270[local233 + 1] = local276;
								@Pc(298) int local298 = this.anIntArray268[local233];
								this.anIntArray268[local233] = this.anIntArray268[local233 + 1];
								this.anIntArray268[local233 + 1] = local298;
								@Pc(320) int local320 = this.anIntArray269[local233];
								this.anIntArray269[local233] = this.anIntArray269[local233 + 1];
								this.anIntArray269[local233 + 1] = local320;
								@Pc(342) int local342 = this.anIntArray271[local233];
								this.anIntArray271[local233] = this.anIntArray271[local233 + 1];
								this.anIntArray271[local233 + 1] = local342;
								local227 = false;
							}
						}
					}
				}
			}
		} catch (@Pc(372) RuntimeException local372) {
			signlink.reporterror("77694, " + arg0 + ", " + local372.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(JI)V")
	private void method647(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) int local5;
			if (arg1 >= 0) {
				for (local5 = 1; local5 > 0; local5++) {
				}
			}
			if (arg0 != 0L) {
				for (local5 = 0; local5 < this.anInt887; local5++) {
					if (this.aLongArray4[local5] == arg0) {
						this.anInt887--;
						this.aBoolean203 = true;
						for (@Pc(37) int local37 = local5; local37 < this.anInt887; local37++) {
							this.aStringArray8[local37] = this.aStringArray8[local37 + 1];
							this.anIntArray244[local37] = this.anIntArray244[local37 + 1];
							this.aLongArray4[local37] = this.aLongArray4[local37 + 1];
						}
						this.aClass1_Sub1_Sub2_7.method11(205);
						this.aClass1_Sub1_Sub2_7.method18(arg0);
						return;
					}
				}
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("77782, " + arg0 + ", " + arg1 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!BJPWOXRJ;BI)V")
	private void method648(@OriginalArg(0) Class1_Sub1_Sub2 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt960; local3++) {
				@Pc(10) int local10 = this.anIntArray257[local3];
				@Pc(15) Class1_Sub1_Sub1_Sub3_Sub1 local15 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local10];
				@Pc(18) int local18 = arg0.method22();
				@Pc(25) int local25;
				@Pc(28) int local28;
				if ((local18 & 0x1) != 0) {
					local25 = arg0.method22();
					local28 = arg0.method22();
					local15.method390(local28, anInt921, local25);
					local15.anInt576 = anInt921 + 300;
					local15.anInt577 = arg0.method22();
					local15.anInt578 = arg0.method22();
				}
				if ((local18 & 0x2) != 0) {
					local25 = arg0.method24();
					if (local25 == 65535) {
						local25 = -1;
					}
					if (local25 == local15.anInt590) {
						local15.anInt594 = 0;
					}
					local28 = arg0.method22();
					if (local25 == local15.anInt590 && local25 != -1) {
						@Pc(81) int local81 = Class29.aClass29Array1[local25].anInt510;
						if (local81 == 1) {
							local15.anInt591 = 0;
							local15.anInt592 = 0;
							local15.anInt593 = local28;
							local15.anInt594 = 0;
						}
						if (local81 == 2) {
							local15.anInt594 = 0;
						}
					} else if (local25 == -1 || local15.anInt590 == -1 || Class29.aClass29Array1[local25].anInt504 >= Class29.aClass29Array1[local15.anInt590].anInt504) {
						local15.anInt590 = local25;
						local15.anInt591 = 0;
						local15.anInt592 = 0;
						local15.anInt593 = local28;
						local15.anInt594 = 0;
						local15.anInt600 = local15.anInt597;
					}
				}
				if ((local18 & 0x4) != 0) {
					local15.anInt582 = arg0.method24();
					if (local15.anInt582 == 65535) {
						local15.anInt582 = -1;
					}
				}
				if ((local18 & 0x8) != 0) {
					local15.aString14 = arg0.method29();
					local15.anInt596 = 100;
				}
				if ((local18 & 0x10) != 0) {
					local25 = arg0.method22();
					local28 = arg0.method22();
					local15.method390(local28, anInt921, local25);
					local15.anInt576 = anInt921 + 300;
					local15.anInt577 = arg0.method22();
					local15.anInt578 = arg0.method22();
				}
				if ((local18 & 0x20) != 0) {
					local15.aClass38_1 = Class38.method417(arg0.method24());
					local15.anInt570 = local15.aClass38_1.aByte26;
					local15.anInt579 = local15.aClass38_1.anInt632;
					local15.anInt586 = local15.aClass38_1.anInt643;
					local15.anInt587 = local15.aClass38_1.anInt645;
					local15.anInt588 = local15.aClass38_1.anInt650;
					local15.anInt589 = local15.aClass38_1.anInt635;
					local15.anInt598 = local15.aClass38_1.anInt634;
				}
				if ((local18 & 0x40) != 0) {
					local15.anInt564 = arg0.method24();
					local25 = arg0.method27();
					local15.anInt568 = local25 >> 16;
					local15.anInt567 = anInt921 + (local25 & 0xFFFF);
					local15.anInt565 = 0;
					local15.anInt566 = 0;
					if (local15.anInt567 > anInt921) {
						local15.anInt565 = -1;
					}
					if (local15.anInt564 == 65535) {
						local15.anInt564 = -1;
					}
				}
				if ((local18 & 0x80) != 0) {
					local15.anInt580 = arg0.method24();
					local15.anInt581 = arg0.method24();
				}
			}
			if (arg1 == this.aByte32) {
				;
			}
		} catch (@Pc(305) RuntimeException local305) {
			signlink.reporterror("56967, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local305.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method649() {
		try {
			if (39 == this.aByte37 && this.anInt1004 == 2) {
				for (@Pc(15) Class1_Sub3 local15 = (Class1_Sub3) this.aClass36_12.method400(); local15 != null; local15 = (Class1_Sub3) this.aClass36_12.method402((byte) 2)) {
					if (local15.anInt738 > 0) {
						local15.anInt738--;
					}
					if (local15.anInt738 != 0) {
						if (local15.anInt739 > 0) {
							local15.anInt739--;
						}
						if (local15.anInt739 == 0 && local15.anInt733 >= 1 && local15.anInt734 >= 1 && local15.anInt733 <= 102 && local15.anInt734 <= 102 && (local15.anInt735 < 0 || Class39.method428(local15.anInt735, local15.anInt737))) {
							this.method685(local15.anInt736, local15.anInt733, local15.anInt737, local15.anInt731, local15.anInt732, local15.anInt734, local15.anInt735);
							local15.anInt739 = -1;
							if (local15.anInt735 == local15.anInt740 && local15.anInt740 == -1) {
								local15.method510();
							} else if (local15.anInt735 == local15.anInt740 && local15.anInt736 == local15.anInt741 && local15.anInt737 == local15.anInt742) {
								local15.method510();
							}
						}
					} else if (local15.anInt740 < 0 || Class39.method428(local15.anInt740, local15.anInt742)) {
						this.method685(local15.anInt741, local15.anInt733, local15.anInt742, local15.anInt731, local15.anInt732, local15.anInt734, local15.anInt740);
						local15.method510();
					}
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("41527, " + 39 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method650() {
		try {
			this.aBoolean201 = false;
			while (this.aBoolean237) {
				this.aBoolean201 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass1_Sub1_Sub3_Sub3_4 = null;
			this.aClass1_Sub1_Sub3_Sub3_5 = null;
			this.aClass1_Sub1_Sub3_Sub3Array3 = null;
			this.anInt905 += 0;
			this.anIntArray246 = null;
			this.anIntArray247 = null;
			this.anIntArray248 = null;
			this.anIntArray249 = null;
			this.anIntArray223 = null;
			this.anIntArray224 = null;
			this.anIntArray272 = null;
			this.anIntArray273 = null;
			this.aClass1_Sub1_Sub3_Sub4_3 = null;
			this.aClass1_Sub1_Sub3_Sub4_4 = null;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("82677, " + 0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!BJPWOXRJ;)V")
	private void method651(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub2 arg1) {
		try {
			while (true) {
				if (arg1.anInt11 + 21 < arg0 * 8) {
					@Pc(16) int local16 = arg1.method33(14);
					if (local16 != 16383) {
						if (this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local16] == null) {
							this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local16] = new Class1_Sub1_Sub1_Sub3_Sub1();
						}
						@Pc(36) Class1_Sub1_Sub1_Sub3_Sub1 local36 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local16];
						this.anIntArray218[this.anInt863++] = local16;
						local36.anInt571 = anInt921;
						local36.aClass38_1 = Class38.method417(arg1.method33(12));
						@Pc(62) int local62 = arg1.method33(5);
						if (local62 > 15) {
							local62 -= 32;
						}
						@Pc(71) int local71 = arg1.method33(5);
						if (local71 > 15) {
							local71 -= 32;
						}
						@Pc(80) int local80 = arg1.method33(1);
						@Pc(85) int local85 = arg1.method33(1);
						if (local85 == 1) {
							this.anIntArray257[this.anInt960++] = local16;
						}
						local36.anInt570 = local36.aClass38_1.aByte26;
						local36.anInt579 = local36.aClass38_1.anInt632;
						local36.anInt586 = local36.aClass38_1.anInt643;
						local36.anInt587 = local36.aClass38_1.anInt645;
						local36.anInt588 = local36.aClass38_1.anInt650;
						local36.anInt589 = local36.aClass38_1.anInt635;
						local36.anInt598 = local36.aClass38_1.anInt634;
						local36.method393(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0] + local71, local80 == 1, aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0] + local62);
						continue;
					}
				}
				arg1.method34();
				return;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("70801, " + arg0 + ", " + -81 + ", " + arg1 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIZIIII)Z")
	private boolean method652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray25[local7][local11] = 0;
					this.anIntArrayArray23[local7][local11] = 99999999;
				}
			}
			local11 = arg1;
			@Pc(39) int local39 = arg0;
			this.anIntArrayArray25[arg1][arg0] = 99;
			this.anIntArrayArray23[arg1][arg0] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			@Pc(61) boolean local61 = false;
			this.anIntArray260[0] = arg1;
			@Pc(70) int local70 = local55 + 1;
			this.anIntArray261[0] = arg0;
			@Pc(74) boolean local74 = false;
			@Pc(78) int local78 = this.anIntArray260.length;
			@Pc(85) int[][] local85 = this.aClass13Array1[this.anInt857].anIntArrayArray9;
			@Pc(199) int local199;
			while (local57 != local70) {
				local11 = this.anIntArray260[local57];
				local39 = this.anIntArray261[local57];
				local57 = (local57 + 1) % local78;
				if (local11 == arg3 && local39 == arg9) {
					local74 = true;
					break;
				}
				if (arg2 != 0) {
					if ((arg2 < 5 || arg2 == 10) && this.aClass13Array1[this.anInt857].method214(arg2 - 1, arg6, local11, arg3, local39, arg9, this.aByte38)) {
						local74 = true;
						break;
					}
					if (arg2 < 10 && this.aClass13Array1[this.anInt857].method215(arg6, arg2 - 1, local39, this.aBoolean191, arg3, arg9, local11)) {
						local74 = true;
						break;
					}
				}
				if (arg8 != 0 && arg4 != 0 && this.aClass13Array1[this.anInt857].method216(arg8, local11, arg10, local39, arg9, arg3, this.anInt952, arg4)) {
					local74 = true;
					break;
				}
				local199 = this.anIntArrayArray23[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray25[local11 - 1][local39] == 0 && (local85[local11 - 1][local39] & 0x280108) == 0) {
					this.anIntArray260[local70] = local11 - 1;
					this.anIntArray261[local70] = local39;
					local70 = (local70 + 1) % local78;
					this.anIntArrayArray25[local11 - 1][local39] = 2;
					this.anIntArrayArray23[local11 - 1][local39] = local199;
				}
				if (local11 < 103 && this.anIntArrayArray25[local11 + 1][local39] == 0 && (local85[local11 + 1][local39] & 0x280180) == 0) {
					this.anIntArray260[local70] = local11 + 1;
					this.anIntArray261[local70] = local39;
					local70 = (local70 + 1) % local78;
					this.anIntArrayArray25[local11 + 1][local39] = 8;
					this.anIntArrayArray23[local11 + 1][local39] = local199;
				}
				if (local39 > 0 && this.anIntArrayArray25[local11][local39 - 1] == 0 && (local85[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray260[local70] = local11;
					this.anIntArray261[local70] = local39 - 1;
					local70 = (local70 + 1) % local78;
					this.anIntArrayArray25[local11][local39 - 1] = 1;
					this.anIntArrayArray23[local11][local39 - 1] = local199;
				}
				if (local39 < 103 && this.anIntArrayArray25[local11][local39 + 1] == 0 && (local85[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray260[local70] = local11;
					this.anIntArray261[local70] = local39 + 1;
					local70 = (local70 + 1) % local78;
					this.anIntArrayArray25[local11][local39 + 1] = 4;
					this.anIntArrayArray23[local11][local39 + 1] = local199;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray25[local11 - 1][local39 - 1] == 0 && (local85[local11 - 1][local39 - 1] & 0x28010E) == 0 && (local85[local11 - 1][local39] & 0x280108) == 0 && (local85[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray260[local70] = local11 - 1;
					this.anIntArray261[local70] = local39 - 1;
					local70 = (local70 + 1) % local78;
					this.anIntArrayArray25[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray23[local11 - 1][local39 - 1] = local199;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray25[local11 + 1][local39 - 1] == 0 && (local85[local11 + 1][local39 - 1] & 0x280183) == 0 && (local85[local11 + 1][local39] & 0x280180) == 0 && (local85[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray260[local70] = local11 + 1;
					this.anIntArray261[local70] = local39 - 1;
					local70 = (local70 + 1) % local78;
					this.anIntArrayArray25[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray23[local11 + 1][local39 - 1] = local199;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray25[local11 - 1][local39 + 1] == 0 && (local85[local11 - 1][local39 + 1] & 0x280138) == 0 && (local85[local11 - 1][local39] & 0x280108) == 0 && (local85[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray260[local70] = local11 - 1;
					this.anIntArray261[local70] = local39 + 1;
					local70 = (local70 + 1) % local78;
					this.anIntArrayArray25[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray23[local11 - 1][local39 + 1] = local199;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray25[local11 + 1][local39 + 1] == 0 && (local85[local11 + 1][local39 + 1] & 0x2801E0) == 0 && (local85[local11 + 1][local39] & 0x280180) == 0 && (local85[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray260[local70] = local11 + 1;
					this.anIntArray261[local70] = local39 + 1;
					local70 = (local70 + 1) % local78;
					this.anIntArrayArray25[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray23[local11 + 1][local39 + 1] = local199;
				}
			}
			this.anInt985 = 0;
			@Pc(815) int local815;
			@Pc(821) int local821;
			@Pc(827) int local827;
			if (!local74) {
				if (arg7) {
					local199 = 100;
					for (local815 = 1; local815 < 2; local815++) {
						for (local821 = arg3 - local815; local821 <= arg3 + local815; local821++) {
							for (local827 = arg9 - local815; local827 <= arg9 + local815; local827++) {
								if (local821 >= 0 && local827 >= 0 && local821 < 104 && local827 < 104 && this.anIntArrayArray23[local821][local827] < local199) {
									local199 = this.anIntArrayArray23[local821][local827];
									local11 = local821;
									local39 = local827;
									this.anInt985 = 1;
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
			@Pc(888) byte local888 = 0;
			this.anIntArray260[0] = local11;
			local57 = local888 + 1;
			this.anIntArray261[0] = local39;
			local199 = local815 = this.anIntArrayArray25[local11][local39];
			while (local11 != arg1 || local39 != arg0) {
				if (local199 != local815) {
					local815 = local199;
					this.anIntArray260[local57] = local11;
					this.anIntArray261[local57++] = local39;
				}
				if ((local199 & 0x2) != 0) {
					local11++;
				} else if ((local199 & 0x8) != 0) {
					local11--;
				}
				if ((local199 & 0x1) != 0) {
					local39++;
				} else if ((local199 & 0x4) != 0) {
					local39--;
				}
				local199 = this.anIntArrayArray25[local11][local39];
			}
			if (local57 > 0) {
				local78 = local57;
				if (local57 > 25) {
					local78 = 25;
				}
				local57--;
				local821 = this.anIntArray260[local57];
				local827 = this.anIntArray261[local57];
				if (arg11 == 0) {
					this.aClass1_Sub1_Sub2_7.method11(25);
					this.aClass1_Sub1_Sub2_7.method12(local78 + local78 + 3);
				}
				if (arg11 == 1) {
					this.aClass1_Sub1_Sub2_7.method11(200);
					this.aClass1_Sub1_Sub2_7.method12(local78 + local78 + 3 + 14);
				}
				if (arg11 == 2) {
					this.aClass1_Sub1_Sub2_7.method11(49);
					this.aClass1_Sub1_Sub2_7.method12(local78 + local78 + 3);
				}
				this.aClass1_Sub1_Sub2_7.method12(super.anIntArray210[5] == 1 ? 1 : 0);
				this.aClass1_Sub1_Sub2_7.method13(local821 + this.anInt931);
				this.aClass1_Sub1_Sub2_7.method13(local827 + this.anInt932);
				this.anInt981 = this.anIntArray260[0];
				this.anInt982 = this.anIntArray261[0];
				for (@Pc(1072) int local1072 = 1; local1072 < local78; local1072++) {
					local57--;
					this.aClass1_Sub1_Sub2_7.method12(this.anIntArray260[local57] - local821);
					this.aClass1_Sub1_Sub2_7.method12(this.anIntArray261[local57] - local827);
				}
				return true;
			} else if (arg11 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1107) RuntimeException local1107) {
			signlink.reporterror("91067, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local1107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIILclient!QVUHZTUC;I)V")
	private void method653(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub1_Sub3_Sub2 arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 != aClass1_Sub1_Sub1_Sub3_Sub2_1 && this.anInt916 < 400) {
				@Pc(42) String local42;
				if (arg2.anInt617 == 0) {
					local42 = arg2.aString15 + method673(this.aByte40, arg2.anInt613, aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt613) + " (level-" + arg2.anInt613 + ")";
				} else {
					local42 = arg2.aString15 + " (skill-" + arg2.anInt617 + ")";
				}
				@Pc(172) int local172;
				if (this.anInt1024 == 1) {
					this.aStringArray10[this.anInt916] = "Use " + this.aString30 + " with @whi@" + local42;
					this.anIntArray270[this.anInt916] = 206;
					this.anIntArray271[this.anInt916] = arg1;
					this.anIntArray268[this.anInt916] = arg0;
					this.anIntArray269[this.anInt916] = arg3;
					this.anInt916++;
				} else if (this.anInt872 != 1) {
					for (local172 = 4; local172 >= 0; local172--) {
						if (this.aStringArray13[local172] != null) {
							this.aStringArray10[this.anInt916] = this.aStringArray13[local172] + " @whi@" + local42;
							@Pc(199) short local199 = 0;
							if (this.aStringArray13[local172].equalsIgnoreCase("attack")) {
								if (arg2.anInt613 > aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt613) {
									local199 = 2000;
								}
								if (aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt611 != 0 && arg2.anInt611 != 0) {
									if (aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt611 == arg2.anInt611) {
										local199 = 2000;
									} else {
										local199 = 0;
									}
								}
							} else if (this.aBooleanArray12[local172]) {
								local199 = 2000;
							}
							if (local172 == 0) {
								this.anIntArray270[this.anInt916] = local199 + 149;
							}
							if (local172 == 1) {
								this.anIntArray270[this.anInt916] = local199 + 158;
							}
							if (local172 == 2) {
								this.anIntArray270[this.anInt916] = local199 + 765;
							}
							if (local172 == 3) {
								this.anIntArray270[this.anInt916] = local199 + 902;
							}
							if (local172 == 4) {
								this.anIntArray270[this.anInt916] = local199 + 114;
							}
							this.anIntArray271[this.anInt916] = arg1;
							this.anIntArray268[this.anInt916] = arg0;
							this.anIntArray269[this.anInt916] = arg3;
							this.anInt916++;
						}
					}
				} else if ((this.anInt874 & 0x8) == 8) {
					this.aStringArray10[this.anInt916] = this.aString20 + " @whi@" + local42;
					this.anIntArray270[this.anInt916] = 28;
					this.anIntArray271[this.anInt916] = arg1;
					this.anIntArray268[this.anInt916] = arg0;
					this.anIntArray269[this.anInt916] = arg3;
					this.anInt916++;
				}
				for (local172 = 0; local172 < this.anInt916; local172++) {
					if (this.anIntArray270[local172] == 762) {
						this.aStringArray10[local172] = "Walk here @whi@" + local42;
						return;
					}
				}
			}
		} catch (@Pc(349) RuntimeException local349) {
			signlink.reporterror("44973, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local349.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ILclient!BJPWOXRJ;I)V")
	private void method654(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub2 arg1) {
		try {
			@Pc(17) int local17;
			@Pc(26) int local26;
			@Pc(33) int local33;
			@Pc(36) int local36;
			@Pc(39) int local39;
			@Pc(45) int local45;
			@Pc(49) int local49;
			if (arg0 == 169) {
				local17 = arg1.method22();
				local26 = this.anInt1020 + (local17 >> 4 & 0x7);
				local33 = this.anInt1021 + (local17 & 0x7);
				local36 = arg1.method24();
				local39 = arg1.method22();
				local45 = local39 >> 4 & 0xF;
				local49 = local39 & 0x7;
				if (aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0] >= local26 - local45 && aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0] <= local26 + local45 && aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0] >= local33 - local45 && aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0] <= local33 + local45 && this.aBoolean220 && !aBoolean230 && this.anInt871 < 50) {
					this.anIntArray267[this.anInt871] = local36;
					this.anIntArray254[this.anInt871] = local49;
					this.anIntArray214[this.anInt871] = Class10.anIntArray32[local36];
					this.anInt871++;
				}
			}
			@Pc(157) int local157;
			@Pc(177) int local177;
			@Pc(189) int local189;
			@Pc(203) int local203;
			@Pc(215) int local215;
			if (arg0 == 1) {
				local17 = arg1.method22();
				local26 = this.anInt1020 + (local17 >> 4 & 0x7);
				local33 = this.anInt1021 + (local17 & 0x7);
				local36 = arg1.method22();
				local39 = local36 >> 2;
				local45 = local36 & 0x3;
				local49 = this.anIntArray216[local39];
				local157 = arg1.method24();
				if (local26 >= 0 && local33 >= 0 && local26 < 103 && local33 < 103) {
					local177 = this.anIntArrayArrayArray7[this.anInt857][local26][local33];
					local189 = this.anIntArrayArrayArray7[this.anInt857][local26 + 1][local33];
					local203 = this.anIntArrayArrayArray7[this.anInt857][local26 + 1][local33 + 1];
					local215 = this.anIntArrayArrayArray7[this.anInt857][local26][local33 + 1];
					if (local49 == 0) {
						@Pc(226) Class5 local226 = this.aClass11_1.method157(this.anInt857, local33, local26);
						if (local226 != null) {
							@Pc(235) int local235 = local226.anInt39 >> 14 & 0x7FFF;
							if (local39 == 2) {
								local226.aClass1_Sub1_Sub1_2 = new Class1_Sub1_Sub1_Sub5(local177, local215, local157, 2, local45 + 4, false, local235, local189, local203, false);
								local226.aClass1_Sub1_Sub1_3 = new Class1_Sub1_Sub1_Sub5(local177, local215, local157, 2, local45 + 1 & 0x3, false, local235, local189, local203, false);
							} else {
								local226.aClass1_Sub1_Sub1_2 = new Class1_Sub1_Sub1_Sub5(local177, local215, local157, local39, local45, false, local235, local189, local203, false);
							}
						}
					}
					if (local49 == 1) {
						@Pc(304) Class34 local304 = this.aClass11_1.method158(local26, this.aByte42, this.anInt857, local33);
						if (local304 != null) {
							local304.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub5(local177, local215, local157, 4, 0, false, local304.anInt550 >> 14 & 0x7FFF, local189, local203, false);
						}
					}
					if (local49 == 2) {
						@Pc(338) Class4 local338 = this.aClass11_1.method159(local26, local33, this.anInt857);
						if (local39 == 11) {
							local39 = 10;
						}
						if (local338 != null) {
							local338.aClass1_Sub1_Sub1_1 = new Class1_Sub1_Sub1_Sub5(local177, local215, local157, local39, local45, false, local338.anInt33 >> 14 & 0x7FFF, local189, local203, false);
						}
					}
					if (local49 == 3) {
						@Pc(377) Class35 local377 = this.aClass11_1.method160(local26, local33, this.anInt857);
						if (local377 != null) {
							local377.aClass1_Sub1_Sub1_8 = new Class1_Sub1_Sub1_Sub5(local177, local215, local157, 22, local45, false, local377.anInt622 >> 14 & 0x7FFF, local189, local203, false);
						}
					}
				}
			} else {
				@Pc(442) Class1_Sub1_Sub1_Sub6 local442;
				if (arg0 == 147) {
					local17 = arg1.method22();
					local26 = this.anInt1020 + (local17 >> 4 & 0x7);
					local33 = this.anInt1021 + (local17 & 0x7);
					local36 = arg1.method24();
					local39 = arg1.method24();
					if (local26 >= 0 && local33 >= 0 && local26 < 104 && local33 < 104) {
						local442 = new Class1_Sub1_Sub1_Sub6();
						local442.anInt768 = local36;
						local442.anInt769 = local39;
						if (this.aClass36ArrayArrayArray1[this.anInt857][local26][local33] == null) {
							this.aClass36ArrayArrayArray1[this.anInt857][local26][local33] = new Class36(anInt861);
						}
						this.aClass36ArrayArrayArray1[this.anInt857][local26][local33].method397(local442);
						this.method561(local26, local33);
					}
				} else if (arg0 == 242) {
					local17 = arg1.method22();
					local26 = this.anInt1020 + (local17 >> 4 & 0x7);
					local33 = this.anInt1021 + (local17 & 0x7);
					local36 = arg1.method24();
					local39 = arg1.method24();
					local45 = arg1.method24();
					if (local26 >= 0 && local33 >= 0 && local26 < 104 && local33 < 104) {
						@Pc(538) Class36 local538 = this.aClass36ArrayArrayArray1[this.anInt857][local26][local33];
						if (local538 != null) {
							for (@Pc(544) Class1_Sub1_Sub1_Sub6 local544 = (Class1_Sub1_Sub1_Sub6) local538.method400(); local544 != null; local544 = (Class1_Sub1_Sub1_Sub6) local538.method402((byte) 2)) {
								if (local544.anInt768 == (local36 & 0x7FFF) && local544.anInt769 == local39) {
									local544.anInt769 = local45;
									break;
								}
							}
							this.method561(local26, local33);
						}
					}
				} else if (arg0 == 110) {
					local17 = arg1.method22();
					local26 = this.anInt1020 + (local17 >> 4 & 0x7);
					local33 = this.anInt1021 + (local17 & 0x7);
					local36 = arg1.method24();
					if (local26 >= 0 && local33 >= 0 && local26 < 104 && local33 < 104) {
						@Pc(618) Class36 local618 = this.aClass36ArrayArrayArray1[this.anInt857][local26][local33];
						if (local618 != null) {
							for (local442 = (Class1_Sub1_Sub1_Sub6) local618.method400(); local442 != null; local442 = (Class1_Sub1_Sub1_Sub6) local618.method402((byte) 2)) {
								if (local442.anInt768 == (local36 & 0x7FFF)) {
									local442.method510();
									break;
								}
							}
							if (local618.method400() == null) {
								this.aClass36ArrayArrayArray1[this.anInt857][local26][local33] = null;
							}
							this.method561(local26, local33);
						}
					}
				} else {
					if (arg0 == 222) {
						local17 = arg1.method22();
						local26 = this.anInt1020 + (local17 >> 4 & 0x7);
						local33 = this.anInt1021 + (local17 & 0x7);
						local36 = arg1.method22();
						local39 = local36 >> 2;
						local45 = local36 & 0x3;
						local49 = this.anIntArray216[local39];
						local157 = arg1.method24();
						local177 = arg1.method24();
						local189 = arg1.method24();
						local203 = arg1.method24();
						@Pc(714) byte local714 = arg1.method23();
						@Pc(717) byte local717 = arg1.method23();
						@Pc(720) byte local720 = arg1.method23();
						@Pc(723) byte local723 = arg1.method23();
						@Pc(729) Class1_Sub1_Sub1_Sub3_Sub2 local729;
						if (local203 == this.anInt818) {
							local729 = aClass1_Sub1_Sub1_Sub3_Sub2_1;
						} else {
							local729 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local203];
						}
						if (local729 != null) {
							@Pc(741) Class22 local741 = Class22.method312(local157);
							@Pc(751) int local751 = this.anIntArrayArrayArray7[this.anInt857][local26][local33];
							@Pc(763) int local763 = this.anIntArrayArrayArray7[this.anInt857][local26 + 1][local33];
							@Pc(777) int local777 = this.anIntArrayArrayArray7[this.anInt857][local26 + 1][local33 + 1];
							@Pc(789) int local789 = this.anIntArrayArrayArray7[this.anInt857][local26][local33 + 1];
							@Pc(799) Class1_Sub1_Sub1_Sub4 local799 = local741.method317(local39, local45, local751, local763, local777, local789, -1);
							if (local799 != null) {
								this.method645(this.anInt857, local26, -1, local177 + 1, 0, 529, local33, local49, 0, local189 + 1);
								local729.anInt614 = local177 + anInt921;
								local729.anInt615 = local189 + anInt921;
								local729.aClass1_Sub1_Sub1_Sub4_2 = local799;
								@Pc(834) int local834 = local741.anInt416;
								@Pc(837) int local837 = local741.anInt429;
								if (local45 == 1 || local45 == 3) {
									local834 = local741.anInt429;
									local837 = local741.anInt416;
								}
								local729.anInt603 = local26 * 128 + local834 * 64;
								local729.anInt605 = local33 * 128 + local837 * 64;
								local729.anInt604 = this.method612(local729.anInt603, 938, local729.anInt605, this.anInt857);
								@Pc(883) byte local883;
								if (local714 > local720) {
									local883 = local714;
									local714 = local720;
									local720 = local883;
								}
								if (local717 > local723) {
									local883 = local717;
									local717 = local723;
									local723 = local883;
								}
								local729.anInt606 = local26 + local714;
								local729.anInt608 = local26 + local720;
								local729.anInt607 = local33 + local717;
								local729.anInt609 = local33 + local723;
							}
						}
					}
					if (arg0 == 104) {
						local17 = arg1.method22();
						local26 = this.anInt1020 + (local17 >> 4 & 0x7);
						local33 = this.anInt1021 + (local17 & 0x7);
						local36 = arg1.method24();
						local39 = arg1.method22();
						local45 = arg1.method24();
						if (local26 >= 0 && local33 >= 0 && local26 < 104 && local33 < 104) {
							local26 = local26 * 128 + 64;
							local33 = local33 * 128 + 64;
							@Pc(990) Class1_Sub1_Sub1_Sub1 local990 = new Class1_Sub1_Sub1_Sub1(local36, local33, this.anInt857, (byte) 2, local26, this.method612(local26, 938, local33, this.anInt857) - local39, anInt921, local45);
							this.aClass36_11.method397(local990);
						}
					} else if (arg0 == 141) {
						local17 = arg1.method22();
						local26 = this.anInt1020 + (local17 >> 4 & 0x7);
						local33 = this.anInt1021 + (local17 & 0x7);
						local36 = arg1.method22();
						local39 = local36 >> 2;
						local45 = local36 & 0x3;
						local49 = this.anIntArray216[local39];
						if (local26 >= 0 && local33 >= 0 && local26 < 104 && local33 < 104) {
							this.method645(this.anInt857, local26, -1, 0, local39, 529, local33, local49, local45, -1);
						}
					} else if (arg0 == 90) {
						local17 = arg1.method22();
						local26 = this.anInt1020 + (local17 >> 4 & 0x7);
						local33 = this.anInt1021 + (local17 & 0x7);
						local36 = local26 + arg1.method23();
						local39 = local33 + arg1.method23();
						local45 = arg1.method25();
						local49 = arg1.method24();
						local157 = arg1.method22() * 4;
						local177 = arg1.method22() * 4;
						local189 = arg1.method24();
						local203 = arg1.method24();
						local215 = arg1.method22();
						@Pc(1117) int local1117 = arg1.method22();
						if (local26 >= 0 && local33 >= 0 && local26 < 104 && local33 < 104 && local36 >= 0 && local39 >= 0 && local36 < 104 && local39 < 104 && local49 != 65535) {
							local26 = local26 * 128 + 64;
							local33 = local33 * 128 + 64;
							local36 = local36 * 128 + 64;
							local39 = local39 * 128 + 64;
							@Pc(1193) Class1_Sub1_Sub1_Sub2 local1193 = new Class1_Sub1_Sub1_Sub2(local33, local177, local1117, local203 + anInt921, local49, this.anInt857, local189 + anInt921, 30330, local45, local215, this.method612(local26, 938, local33, this.anInt857) - local157, local26);
							local1193.method132(local36, this.method612(local36, 938, local39, this.anInt857) - local177, local189 + anInt921, local39);
							this.aClass36_10.method397(local1193);
						}
					} else if (arg0 == 133) {
						local17 = arg1.method22();
						local26 = this.anInt1020 + (local17 >> 4 & 0x7);
						local33 = this.anInt1021 + (local17 & 0x7);
						local36 = arg1.method22();
						local39 = local36 >> 2;
						local45 = local36 & 0x3;
						local49 = this.anIntArray216[local39];
						local157 = arg1.method24();
						if (local26 >= 0 && local33 >= 0 && local26 < 104 && local33 < 104) {
							this.method645(this.anInt857, local26, local157, 0, local39, 529, local33, local49, local45, -1);
						}
					} else if (arg0 == 107) {
						local17 = arg1.method22();
						local26 = this.anInt1020 + (local17 >> 4 & 0x7);
						local33 = this.anInt1021 + (local17 & 0x7);
						local36 = arg1.method24();
						local39 = arg1.method24();
						local45 = arg1.method24();
						if (local26 >= 0 && local33 >= 0 && local26 < 104 && local33 < 104 && local45 != this.anInt818) {
							@Pc(1329) Class1_Sub1_Sub1_Sub6 local1329 = new Class1_Sub1_Sub1_Sub6();
							local1329.anInt768 = local36;
							local1329.anInt769 = local39;
							if (this.aClass36ArrayArrayArray1[this.anInt857][local26][local33] == null) {
								this.aClass36ArrayArrayArray1[this.anInt857][local26][local33] = new Class36(anInt861);
							}
							this.aClass36ArrayArrayArray1[this.anInt857][local26][local33].method397(local1329);
							this.method561(local26, local33);
						}
					}
				}
			}
		} catch (@Pc(1375) RuntimeException local1375) {
			signlink.reporterror("48957, " + arg0 + ", " + arg1 + ", " + -578 + ", " + local1375.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method655() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray272[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray272[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray273[local54] = (this.anIntArray272[local54 - 1] + this.anIntArray272[local54 + 1] + this.anIntArray272[local54 - 128] + this.anIntArray272[local54 + 128]) / 4;
				}
			}
			this.anInt989 += 128;
			if (this.anInt989 > this.anIntArray223.length) {
				this.anInt989 -= this.anIntArray223.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method610(this.aClass1_Sub1_Sub3_Sub3Array3[local48]);
			}
			@Pc(173) int local173;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local173 = local54 + (local48 << 7);
					@Pc(196) int local196 = this.anIntArray273[local173 + 128] - this.anIntArray223[local173 + this.anInt989 & this.anIntArray223.length - 1] / 5;
					if (local196 < 0) {
						local196 = 0;
					}
					this.anIntArray272[local173] = local196;
				}
			}
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray225[local54] = this.anIntArray225[local54 + 1];
			}
			this.anIntArray225[255] = (int) (Math.sin((double) anInt921 / 14.0D) * 16.0D + Math.sin((double) anInt921 / 15.0D) * 14.0D + Math.sin((double) anInt921 / 16.0D) * 12.0D);
			if (this.anInt881 > 0) {
				this.anInt881 -= 4;
			}
			if (this.anInt882 > 0) {
				this.anInt882 -= 4;
			}
			if (this.anInt881 == 0 && this.anInt882 == 0) {
				local173 = (int) (Math.random() * 2000.0D);
				if (local173 == 0) {
					this.anInt881 = 1024;
				}
				if (local173 == 1) {
					this.anInt882 = 1024;
					return;
				}
			}
		} catch (@Pc(307) RuntimeException local307) {
			signlink.reporterror("44168, " + -463 + ", " + local307.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method656(@OriginalArg(0) boolean arg0) {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt946);
			if (this.aClass7_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass7_Sub1_1.anInt87);
			}
			System.out.println("loop-cycle:" + anInt921);
			System.out.println("draw-cycle:" + anInt1006);
			System.out.println("ptype:" + this.anInt906);
			this.aBoolean234 &= arg0;
			System.out.println("psize:" + this.anInt905);
			if (this.aClass16_1 != null) {
				this.aClass16_1.method230(this.aBoolean211);
			}
			super.aBoolean187 = true;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("53871, " + arg0 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)Ljava/awt/Component;")
	@Override
	protected Component method549() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("16446, " + true + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!ETSIPTYG;)V")
	private void method657(@OriginalArg(1) Class6 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt70;
			@Pc(64) int local64;
			if ((local4 < 1 || local4 > 100) && (local4 < 701 || local4 > 800)) {
				if (local4 >= 101 && local4 <= 200 || local4 >= 801 && local4 <= 900) {
					local64 = this.anInt887;
					if (this.anInt888 != 2) {
						local64 = 0;
					}
					if (local4 > 800) {
						local4 -= 701;
					} else {
						local4 -= 101;
					}
					if (local4 >= local64) {
						arg0.aString4 = "";
						arg0.anInt69 = 0;
					} else {
						if (this.anIntArray244[local4] == 0) {
							arg0.aString4 = "@red@Offline";
						} else if (this.anIntArray244[local4] == anInt964) {
							arg0.aString4 = "@gre@World-" + (this.anIntArray244[local4] - 9);
						} else {
							arg0.aString4 = "@yel@World-" + (this.anIntArray244[local4] - 9);
						}
						arg0.anInt69 = 1;
					}
				} else if (local4 == 203) {
					local64 = this.anInt887;
					if (this.anInt888 != 2) {
						local64 = 0;
					}
					arg0.anInt40 = local64 * 15 + 20;
					if (arg0.anInt40 <= arg0.anInt44) {
						arg0.anInt40 = arg0.anInt44 + 1;
					}
				} else if (local4 >= 401 && local4 <= 500) {
					local4 -= 401;
					if (local4 == 0 && this.anInt888 == 0) {
						arg0.aString4 = "Loading ignore list";
						arg0.anInt69 = 0;
					} else if (local4 == 1 && this.anInt888 == 0) {
						arg0.aString4 = "Please wait...";
						arg0.anInt69 = 0;
					} else {
						local64 = this.anInt953;
						if (this.anInt888 == 0) {
							local64 = 0;
						}
						if (local4 >= local64) {
							arg0.aString4 = "";
							arg0.anInt69 = 0;
						} else {
							arg0.aString4 = Class31.method383(Class31.method380(this.aLongArray3[local4]));
							arg0.anInt69 = 1;
						}
					}
				} else if (local4 == 503) {
					arg0.anInt40 = this.anInt953 * 15 + 20;
					if (arg0.anInt40 <= arg0.anInt44) {
						arg0.anInt40 = arg0.anInt44 + 1;
					}
				} else if (local4 == 327) {
					arg0.anInt52 = 150;
					arg0.anInt53 = (int) (Math.sin((double) anInt921 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean222) {
						for (local64 = 0; local64 < 7; local64++) {
							@Pc(333) int local333 = this.anIntArray255[local64];
							if (local333 >= 0 && !Class37.aClass37Array1[local333].method407()) {
								return;
							}
						}
						this.aBoolean222 = false;
						@Pc(352) Class1_Sub1_Sub1_Sub4[] local352 = new Class1_Sub1_Sub1_Sub4[7];
						@Pc(354) int local354 = 0;
						for (@Pc(356) int local356 = 0; local356 < 7; local356++) {
							@Pc(363) int local363 = this.anIntArray255[local356];
							if (local363 >= 0) {
								local352[local354++] = Class37.aClass37Array1[local363].method408();
							}
						}
						@Pc(385) Class1_Sub1_Sub1_Sub4 local385 = new Class1_Sub1_Sub1_Sub4(9, local354, local352);
						for (@Pc(387) int local387 = 0; local387 < 5; local387++) {
							if (this.anIntArray264[local387] != 0) {
								local385.method253(anIntArrayArray22[local387][0], anIntArrayArray22[local387][this.anIntArray264[local387]]);
								if (local387 == 1) {
									local385.method253(anIntArray265[0], anIntArray265[this.anIntArray264[local387]]);
								}
							}
						}
						local385.method246();
						local385.method247(Class29.aClass29Array1[aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt598].anIntArray140[0]);
						local385.method256(64, 850, -30, -50, -30, true);
						arg0.anInt42 = 5;
						arg0.anInt43 = 0;
						Class6.method44(local385);
					}
				} else if (local4 == 324) {
					if (this.aClass1_Sub1_Sub3_Sub4_12 == null) {
						this.aClass1_Sub1_Sub3_Sub4_12 = arg0.aClass1_Sub1_Sub3_Sub4_2;
						this.aClass1_Sub1_Sub3_Sub4_13 = arg0.aClass1_Sub1_Sub3_Sub4_1;
					}
					if (this.aBoolean236) {
						arg0.aClass1_Sub1_Sub3_Sub4_2 = this.aClass1_Sub1_Sub3_Sub4_13;
					} else {
						arg0.aClass1_Sub1_Sub3_Sub4_2 = this.aClass1_Sub1_Sub3_Sub4_12;
					}
				} else if (local4 == 325) {
					if (this.aClass1_Sub1_Sub3_Sub4_12 == null) {
						this.aClass1_Sub1_Sub3_Sub4_12 = arg0.aClass1_Sub1_Sub3_Sub4_2;
						this.aClass1_Sub1_Sub3_Sub4_13 = arg0.aClass1_Sub1_Sub3_Sub4_1;
					}
					if (this.aBoolean236) {
						arg0.aClass1_Sub1_Sub3_Sub4_2 = this.aClass1_Sub1_Sub3_Sub4_12;
					} else {
						arg0.aClass1_Sub1_Sub3_Sub4_2 = this.aClass1_Sub1_Sub3_Sub4_13;
					}
				} else if (local4 == 600) {
					arg0.aString4 = this.aString26;
					if (anInt921 % 20 < 10) {
						arg0.aString4 = arg0.aString4 + "|";
					} else {
						arg0.aString4 = arg0.aString4 + " ";
					}
				} else {
					if (local4 == 613) {
						if (this.anInt1003 < 1) {
							arg0.aString4 = "";
						} else if (this.aBoolean227) {
							arg0.anInt73 = 16711680;
							arg0.aString4 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt73 = 16777215;
							arg0.aString4 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(593) String local593;
					if (local4 == 650 || local4 == 655) {
						if (this.anInt995 == 0) {
							arg0.aString4 = "";
						} else {
							if (this.anInt913 == 0) {
								local593 = "earlier today";
							} else if (this.anInt913 == 1) {
								local593 = "yesterday";
							} else {
								local593 = this.anInt913 + " days ago";
							}
							arg0.aString4 = "You last logged in " + local593 + " from: " + signlink.dns;
						}
					}
					if (local4 == 651) {
						if (this.anInt821 == 0) {
							arg0.aString4 = "0 unread messages";
							arg0.anInt73 = 16776960;
						}
						if (this.anInt821 == 1) {
							arg0.aString4 = "1 unread message";
							arg0.anInt73 = 65280;
						}
						if (this.anInt821 > 1) {
							arg0.aString4 = this.anInt821 + " unread messages";
							arg0.anInt73 = 65280;
						}
					}
					if (local4 == 652) {
						if (this.anInt879 == 201) {
							if (this.anInt869 == 1) {
								arg0.aString4 = "@yel@This is a non-members world: @whi@Since you are a member we";
							} else {
								arg0.aString4 = "";
							}
						} else if (this.anInt879 == 200) {
							arg0.aString4 = "You have not yet set any password recovery questions.";
						} else {
							if (this.anInt879 == 0) {
								local593 = "Earlier today";
							} else if (this.anInt879 == 1) {
								local593 = "Yesterday";
							} else {
								local593 = this.anInt879 + " days ago";
							}
							arg0.aString4 = local593 + " you changed your recovery questions";
						}
					}
					if (local4 == 653) {
						if (this.anInt879 == 201) {
							if (this.anInt869 == 1) {
								arg0.aString4 = "@whi@recommend you use a members world instead. You may use";
							} else {
								arg0.aString4 = "";
							}
						} else if (this.anInt879 == 200) {
							arg0.aString4 = "We strongly recommend you do so now to secure your account.";
						} else {
							arg0.aString4 = "If you do not remember making this change then cancel it immediately";
						}
					}
					if (local4 == 654) {
						if (this.anInt879 == 201) {
							if (this.anInt869 == 1) {
								arg0.aString4 = "@whi@this world but member benefits are unavailable whilst here.";
							} else {
								arg0.aString4 = "";
							}
						} else if (this.anInt879 == 200) {
							arg0.aString4 = "Do this from the 'account management' area on our front webpage";
						} else {
							arg0.aString4 = "Do this from the 'account management' area on our front webpage";
						}
					}
				}
			} else if (local4 == 1 && this.anInt888 == 0) {
				arg0.aString4 = "Loading friend list";
				arg0.anInt69 = 0;
			} else if (local4 == 1 && this.anInt888 == 1) {
				arg0.aString4 = "Connecting to friendserver";
				arg0.anInt69 = 0;
			} else if (local4 == 2 && this.anInt888 != 2) {
				arg0.aString4 = "Please wait...";
				arg0.anInt69 = 0;
			} else {
				local64 = this.anInt887;
				if (this.anInt888 != 2) {
					local64 = 0;
				}
				if (local4 > 700) {
					local4 -= 601;
				} else {
					local4--;
				}
				if (local4 >= local64) {
					arg0.aString4 = "";
					arg0.anInt69 = 0;
				} else {
					arg0.aString4 = this.aStringArray8[local4];
					arg0.anInt69 = 1;
				}
			}
		} catch (@Pc(801) RuntimeException local801) {
			signlink.reporterror("45620, " + 2 + ", " + arg0 + ", " + local801.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZZ)V")
	private void method658(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		try {
			signlink.anInt1034 = arg0;
			if (arg1) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("98933, " + arg0 + ", " + false + ", " + arg1 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method544() {
		this.method551("Starting up", 20);
		if (signlink.sunjava) {
			super.anInt798 = 5;
		}
		if (aBoolean217) {
			this.aBoolean240 = true;
			return;
		}
		aBoolean217 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method556();
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
			this.aBoolean210 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(83) int local83 = 0; local83 < 5; local83++) {
				this.aClass26Array1[local83] = new Class26(local83 + 1, signlink.aRandomAccessFileArray1[local83], 500000, 8, signlink.aRandomAccessFile3);
			}
		}
		try {
			this.method595(88);
			this.aClass27_1 = this.method625(25, anInt920, "title", 1, "title screen", this.anIntArray235[1]);
			this.aClass1_Sub1_Sub3_Sub2_2 = new Class1_Sub1_Sub3_Sub2(this.aClass27_1, false, 0, "p11_full");
			this.aClass1_Sub1_Sub3_Sub2_3 = new Class1_Sub1_Sub3_Sub2(this.aClass27_1, false, 0, "p12_full");
			this.aClass1_Sub1_Sub3_Sub2_4 = new Class1_Sub1_Sub3_Sub2(this.aClass27_1, false, 0, "b12_full");
			this.aClass1_Sub1_Sub3_Sub2_5 = new Class1_Sub1_Sub3_Sub2(this.aClass27_1, true, 0, "q8_full");
			this.method667();
			this.method565();
			@Pc(179) Class27 local179 = this.method625(30, anInt920, "config", 2, "config", this.anIntArray235[2]);
			@Pc(191) Class27 local191 = this.method625(35, anInt920, "interface", 3, "interface", this.anIntArray235[3]);
			@Pc(203) Class27 local203 = this.method625(40, anInt920, "media", 4, "2d graphics", this.anIntArray235[4]);
			@Pc(215) Class27 local215 = this.method625(45, anInt920, "textures", 6, "textures", this.anIntArray235[6]);
			@Pc(227) Class27 local227 = this.method625(50, anInt920, "wordenc", 7, "chat system", this.anIntArray235[7]);
			@Pc(239) Class27 local239 = this.method625(55, anInt920, "sounds", 8, "sound effects", this.anIntArray235[8]);
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray7 = new int[4][105][105];
			this.aClass11_1 = new Class11(anInt968, this.anIntArrayArrayArray7, 104, 104, 4);
			for (@Pc(264) int local264 = 0; local264 < 4; local264++) {
				this.aClass13Array1[local264] = new Class13(104, aBoolean228, 104);
			}
			this.aClass1_Sub1_Sub3_Sub4_15 = new Class1_Sub1_Sub3_Sub4(512, 512);
			@Pc(299) Class27 local299 = this.method625(60, anInt920, "versionlist", 5, "update list", this.anIntArray235[5]);
			this.method551("Connecting to update server", 60);
			this.aClass7_Sub1_1 = new Class7_Sub1();
			this.aClass7_Sub1_1.method57(local299, this);
			Class42.method475(this.aClass7_Sub1_1.method49(514));
			Class1_Sub1_Sub1_Sub4.method236(this.aClass7_Sub1_1.method53(0, aByte46), this.aClass7_Sub1_1);
			if (!aBoolean230) {
				this.anInt978 = 0;
				try {
					this.anInt978 = Integer.parseInt(this.getParameter("music"));
				} catch (@Pc(340) Exception local340) {
				}
				this.aBoolean233 = true;
				this.aClass7_Sub1_1.method56(2, this.anInt978);
				while (this.aClass7_Sub1_1.method60() > 0) {
					this.method578();
					try {
						Thread.sleep(100L);
					} catch (@Pc(358) Exception local358) {
					}
					if (this.aClass7_Sub1_1.anInt78 > 3) {
						this.method614("ondemand");
						return;
					}
				}
			}
			this.method551("Requesting animations", 65);
			@Pc(382) int local382 = this.aClass7_Sub1_1.method53(1, aByte46);
			for (@Pc(384) int local384 = 0; local384 < local382; local384++) {
				this.aClass7_Sub1_1.method56(1, local384);
			}
			@Pc(403) int local403;
			while (this.aClass7_Sub1_1.method60() > 0) {
				local403 = local382 - this.aClass7_Sub1_1.method60();
				if (local403 > 0) {
					this.method551("Loading animations - " + local403 * 100 / local382 + "%", 65);
				}
				this.method578();
				try {
					Thread.sleep(100L);
				} catch (@Pc(429) Exception local429) {
				}
				if (this.aClass7_Sub1_1.anInt78 > 3) {
					this.method614("ondemand");
					return;
				}
			}
			this.method551("Requesting models", 70);
			local382 = this.aClass7_Sub1_1.method53(0, aByte46);
			@Pc(463) int local463;
			for (local403 = 0; local403 < local382; local403++) {
				local463 = this.aClass7_Sub1_1.method52(local403);
				if ((local463 & 0x1) != 0) {
					this.aClass7_Sub1_1.method56(0, local403);
				}
			}
			local382 = this.aClass7_Sub1_1.method60();
			while (this.aClass7_Sub1_1.method60() > 0) {
				local463 = local382 - this.aClass7_Sub1_1.method60();
				if (local463 > 0) {
					this.method551("Loading models - " + local463 * 100 / local382 + "%", 70);
				}
				this.method578();
				try {
					Thread.sleep(100L);
				} catch (@Pc(514) Exception local514) {
				}
			}
			if (this.aClass26Array1[0] != null) {
				this.method551("Requesting maps", 75);
				this.aClass7_Sub1_1.method56(3, this.aClass7_Sub1_1.method68(47, 48, 0));
				this.aClass7_Sub1_1.method56(3, this.aClass7_Sub1_1.method68(47, 48, 1));
				this.aClass7_Sub1_1.method56(3, this.aClass7_Sub1_1.method68(48, 48, 0));
				this.aClass7_Sub1_1.method56(3, this.aClass7_Sub1_1.method68(48, 48, 1));
				this.aClass7_Sub1_1.method56(3, this.aClass7_Sub1_1.method68(49, 48, 0));
				this.aClass7_Sub1_1.method56(3, this.aClass7_Sub1_1.method68(49, 48, 1));
				this.aClass7_Sub1_1.method56(3, this.aClass7_Sub1_1.method68(47, 47, 0));
				this.aClass7_Sub1_1.method56(3, this.aClass7_Sub1_1.method68(47, 47, 1));
				this.aClass7_Sub1_1.method56(3, this.aClass7_Sub1_1.method68(48, 47, 0));
				this.aClass7_Sub1_1.method56(3, this.aClass7_Sub1_1.method68(48, 47, 1));
				this.aClass7_Sub1_1.method56(3, this.aClass7_Sub1_1.method68(48, 148, 0));
				this.aClass7_Sub1_1.method56(3, this.aClass7_Sub1_1.method68(48, 148, 1));
				local382 = this.aClass7_Sub1_1.method60();
				while (this.aClass7_Sub1_1.method60() > 0) {
					local463 = local382 - this.aClass7_Sub1_1.method60();
					if (local463 > 0) {
						this.method551("Loading maps - " + local463 * 100 / local382 + "%", 75);
					}
					this.method578();
					try {
						Thread.sleep(100L);
					} catch (@Pc(699) Exception local699) {
					}
				}
			}
			local382 = this.aClass7_Sub1_1.method53(0, aByte46);
			@Pc(720) int local720;
			for (local463 = 0; local463 < local382; local463++) {
				local720 = this.aClass7_Sub1_1.method52(local463);
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
					this.aClass7_Sub1_1.method66(0, local722, local463);
				}
			}
			this.aClass7_Sub1_1.method55(aBoolean229);
			if (!aBoolean230) {
				local382 = this.aClass7_Sub1_1.method53(2, aByte46);
				for (local720 = 1; local720 < local382; local720++) {
					if (this.aClass7_Sub1_1.method54(local720)) {
						this.aClass7_Sub1_1.method66(2, (byte) 1, local720);
					}
				}
			}
			this.method551("Unpacking media", 80);
			this.aClass1_Sub1_Sub3_Sub3_18 = new Class1_Sub1_Sub3_Sub3(local203, "invback", 0);
			this.aClass1_Sub1_Sub3_Sub3_20 = new Class1_Sub1_Sub3_Sub3(local203, "chatback", 0);
			this.aClass1_Sub1_Sub3_Sub3_19 = new Class1_Sub1_Sub3_Sub3(local203, "mapback", 0);
			this.aClass1_Sub1_Sub3_Sub3_1 = new Class1_Sub1_Sub3_Sub3(local203, "backbase1", 0);
			this.aClass1_Sub1_Sub3_Sub3_2 = new Class1_Sub1_Sub3_Sub3(local203, "backbase2", 0);
			this.aClass1_Sub1_Sub3_Sub3_3 = new Class1_Sub1_Sub3_Sub3(local203, "backhmid1", 0);
			for (local720 = 0; local720 < 13; local720++) {
				this.aClass1_Sub1_Sub3_Sub3Array4[local720] = new Class1_Sub1_Sub3_Sub3(local203, "sideicons", local720);
			}
			this.aClass1_Sub1_Sub3_Sub4_16 = new Class1_Sub1_Sub3_Sub4(local203, "compass", 0);
			this.aClass1_Sub1_Sub3_Sub4_14 = new Class1_Sub1_Sub3_Sub4(local203, "mapedge", 0);
			this.aClass1_Sub1_Sub3_Sub4_14.method526();
			@Pc(922) int local922;
			try {
				for (local922 = 0; local922 < 100; local922++) {
					this.aClass1_Sub1_Sub3_Sub3Array2[local922] = new Class1_Sub1_Sub3_Sub3(local203, "mapscene", local922);
				}
			} catch (@Pc(940) Exception local940) {
			}
			try {
				for (local922 = 0; local922 < 100; local922++) {
					this.aClass1_Sub1_Sub3_Sub4Array7[local922] = new Class1_Sub1_Sub3_Sub4(local203, "mapfunction", local922);
				}
			} catch (@Pc(960) Exception local960) {
			}
			try {
				for (local922 = 0; local922 < 20; local922++) {
					this.aClass1_Sub1_Sub3_Sub4Array8[local922] = new Class1_Sub1_Sub3_Sub4(local203, "hitmarks", local922);
				}
			} catch (@Pc(980) Exception local980) {
			}
			try {
				for (local922 = 0; local922 < 20; local922++) {
					this.aClass1_Sub1_Sub3_Sub4Array6[local922] = new Class1_Sub1_Sub3_Sub4(local203, "headicons", local922);
				}
			} catch (@Pc(1000) Exception local1000) {
			}
			this.aClass1_Sub1_Sub3_Sub4_5 = new Class1_Sub1_Sub3_Sub4(local203, "mapmarker", 0);
			this.aClass1_Sub1_Sub3_Sub4_6 = new Class1_Sub1_Sub3_Sub4(local203, "mapmarker", 1);
			for (local922 = 0; local922 < 8; local922++) {
				this.aClass1_Sub1_Sub3_Sub4Array5[local922] = new Class1_Sub1_Sub3_Sub4(local203, "cross", local922);
			}
			this.aClass1_Sub1_Sub3_Sub4_7 = new Class1_Sub1_Sub3_Sub4(local203, "mapdots", 0);
			this.aClass1_Sub1_Sub3_Sub4_8 = new Class1_Sub1_Sub3_Sub4(local203, "mapdots", 1);
			this.aClass1_Sub1_Sub3_Sub4_9 = new Class1_Sub1_Sub3_Sub4(local203, "mapdots", 2);
			this.aClass1_Sub1_Sub3_Sub4_10 = new Class1_Sub1_Sub3_Sub4(local203, "mapdots", 3);
			this.aClass1_Sub1_Sub3_Sub4_11 = new Class1_Sub1_Sub3_Sub4(local203, "mapdots", 4);
			this.aClass1_Sub1_Sub3_Sub3_11 = new Class1_Sub1_Sub3_Sub3(local203, "scrollbar", 0);
			this.aClass1_Sub1_Sub3_Sub3_12 = new Class1_Sub1_Sub3_Sub3(local203, "scrollbar", 1);
			this.aClass1_Sub1_Sub3_Sub3_13 = new Class1_Sub1_Sub3_Sub3(local203, "redstone1", 0);
			this.aClass1_Sub1_Sub3_Sub3_14 = new Class1_Sub1_Sub3_Sub3(local203, "redstone2", 0);
			this.aClass1_Sub1_Sub3_Sub3_15 = new Class1_Sub1_Sub3_Sub3(local203, "redstone3", 0);
			this.aClass1_Sub1_Sub3_Sub3_16 = new Class1_Sub1_Sub3_Sub3(local203, "redstone1", 0);
			this.aClass1_Sub1_Sub3_Sub3_16.method470();
			this.aClass1_Sub1_Sub3_Sub3_17 = new Class1_Sub1_Sub3_Sub3(local203, "redstone2", 0);
			this.aClass1_Sub1_Sub3_Sub3_17.method470();
			this.aClass1_Sub1_Sub3_Sub3_6 = new Class1_Sub1_Sub3_Sub3(local203, "redstone1", 0);
			this.aClass1_Sub1_Sub3_Sub3_6.method471();
			this.aClass1_Sub1_Sub3_Sub3_7 = new Class1_Sub1_Sub3_Sub3(local203, "redstone2", 0);
			this.aClass1_Sub1_Sub3_Sub3_7.method471();
			this.aClass1_Sub1_Sub3_Sub3_8 = new Class1_Sub1_Sub3_Sub3(local203, "redstone3", 0);
			this.aClass1_Sub1_Sub3_Sub3_8.method471();
			this.aClass1_Sub1_Sub3_Sub3_9 = new Class1_Sub1_Sub3_Sub3(local203, "redstone1", 0);
			this.aClass1_Sub1_Sub3_Sub3_9.method470();
			this.aClass1_Sub1_Sub3_Sub3_9.method471();
			this.aClass1_Sub1_Sub3_Sub3_10 = new Class1_Sub1_Sub3_Sub3(local203, "redstone2", 0);
			this.aClass1_Sub1_Sub3_Sub3_10.method470();
			this.aClass1_Sub1_Sub3_Sub3_10.method471();
			for (@Pc(1208) int local1208 = 0; local1208 < 2; local1208++) {
				this.aClass1_Sub1_Sub3_Sub3Array5[local1208] = new Class1_Sub1_Sub3_Sub3(local203, "mod_icons", local1208);
			}
			@Pc(1231) Class1_Sub1_Sub3_Sub4 local1231 = new Class1_Sub1_Sub3_Sub4(local203, "backleft1", 0);
			this.aClass48_16 = new Class48(local1231.anInt786, (byte) -48, this.method549(), local1231.anInt787);
			local1231.method527(0, 0);
			@Pc(1256) Class1_Sub1_Sub3_Sub4 local1256 = new Class1_Sub1_Sub3_Sub4(local203, "backleft2", 0);
			this.aClass48_17 = new Class48(local1256.anInt786, (byte) -48, this.method549(), local1256.anInt787);
			local1256.method527(0, 0);
			@Pc(1281) Class1_Sub1_Sub3_Sub4 local1281 = new Class1_Sub1_Sub3_Sub4(local203, "backright1", 0);
			this.aClass48_18 = new Class48(local1281.anInt786, (byte) -48, this.method549(), local1281.anInt787);
			local1281.method527(0, 0);
			@Pc(1306) Class1_Sub1_Sub3_Sub4 local1306 = new Class1_Sub1_Sub3_Sub4(local203, "backright2", 0);
			this.aClass48_19 = new Class48(local1306.anInt786, (byte) -48, this.method549(), local1306.anInt787);
			local1306.method527(0, 0);
			@Pc(1331) Class1_Sub1_Sub3_Sub4 local1331 = new Class1_Sub1_Sub3_Sub4(local203, "backtop1", 0);
			this.aClass48_20 = new Class48(local1331.anInt786, (byte) -48, this.method549(), local1331.anInt787);
			local1331.method527(0, 0);
			@Pc(1356) Class1_Sub1_Sub3_Sub4 local1356 = new Class1_Sub1_Sub3_Sub4(local203, "backvmid1", 0);
			this.aClass48_21 = new Class48(local1356.anInt786, (byte) -48, this.method549(), local1356.anInt787);
			local1356.method527(0, 0);
			@Pc(1381) Class1_Sub1_Sub3_Sub4 local1381 = new Class1_Sub1_Sub3_Sub4(local203, "backvmid2", 0);
			this.aClass48_22 = new Class48(local1381.anInt786, (byte) -48, this.method549(), local1381.anInt787);
			local1381.method527(0, 0);
			@Pc(1406) Class1_Sub1_Sub3_Sub4 local1406 = new Class1_Sub1_Sub3_Sub4(local203, "backvmid3", 0);
			this.aClass48_23 = new Class48(local1406.anInt786, (byte) -48, this.method549(), local1406.anInt787);
			local1406.method527(0, 0);
			@Pc(1431) Class1_Sub1_Sub3_Sub4 local1431 = new Class1_Sub1_Sub3_Sub4(local203, "backhmid2", 0);
			this.aClass48_24 = new Class48(local1431.anInt786, (byte) -48, this.method549(), local1431.anInt787);
			local1431.method527(0, 0);
			@Pc(1456) int local1456 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1463) int local1463 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1470) int local1470 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1477) int local1477 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1479) int local1479 = 0; local1479 < 100; local1479++) {
				if (this.aClass1_Sub1_Sub3_Sub4Array7[local1479] != null) {
					this.aClass1_Sub1_Sub3_Sub4Array7[local1479].method525(local1456 + local1477, local1470 + local1477, local1463 + local1477);
				}
				if (this.aClass1_Sub1_Sub3_Sub3Array2[local1479] != null) {
					this.aClass1_Sub1_Sub3_Sub3Array2[local1479].method472(local1456 + local1477, local1470 + local1477, local1463 + local1477);
				}
			}
			this.method551("Unpacking textures", 83);
			Class1_Sub1_Sub3_Sub1.method105((byte) 6, local215);
			Class1_Sub1_Sub3_Sub1.method109(0.8D);
			Class1_Sub1_Sub3_Sub1.method104();
			this.method551("Unpacking config", 86);
			Class29.method376(local179);
			Class22.method315(local179);
			Class18.method266(local179);
			Class23.method327(local179);
			Class38.method412(local179);
			Class37.method405(local179);
			Class25.method332(local179);
			Class17.method264(local179);
			Class3.method38(local179);
			Class23.aBoolean111 = aBoolean229;
			if (!aBoolean230) {
				this.method551("Unpacking sounds", 90);
				@Pc(1582) byte[] local1582 = local239.method340("sounds.dat", null);
				@Pc(1588) Class1_Sub1_Sub2 local1588 = new Class1_Sub1_Sub2(false, local1582);
				Class10.method117(local1588);
			}
			this.method551("Unpacking interfaces", 95);
			@Pc(1619) Class1_Sub1_Sub3_Sub2[] local1619 = new Class1_Sub1_Sub3_Sub2[] { this.aClass1_Sub1_Sub3_Sub2_2, this.aClass1_Sub1_Sub3_Sub2_3, this.aClass1_Sub1_Sub3_Sub2_4, this.aClass1_Sub1_Sub3_Sub2_5 };
			Class6.method43(local191, local1619, local203);
			this.method551("Preparing game engine", 100);
			@Pc(1635) int local1635;
			@Pc(1637) int local1637;
			@Pc(1639) int local1639;
			for (@Pc(1631) int local1631 = 0; local1631 < 33; local1631++) {
				local1635 = 999;
				local1637 = 0;
				for (local1639 = 0; local1639 < 34; local1639++) {
					if (this.aClass1_Sub1_Sub3_Sub3_19.aByteArray19[local1639 + local1631 * this.aClass1_Sub1_Sub3_Sub3_19.anInt714] == 0) {
						if (local1635 == 999) {
							local1635 = local1639;
						}
					} else if (local1635 != 999) {
						local1637 = local1639;
						break;
					}
				}
				this.anIntArray215[local1631] = local1635;
				this.anIntArray222[local1631] = local1637 - local1635;
			}
			@Pc(1697) int local1697;
			for (local1635 = 5; local1635 < 156; local1635++) {
				local1637 = 999;
				local1639 = 0;
				for (local1697 = 25; local1697 < 172; local1697++) {
					if (this.aClass1_Sub1_Sub3_Sub3_19.aByteArray19[local1697 + local1635 * this.aClass1_Sub1_Sub3_Sub3_19.anInt714] == 0 && (local1697 > 34 || local1635 > 34)) {
						if (local1637 == 999) {
							local1637 = local1697;
						}
					} else if (local1637 != 999) {
						local1639 = local1697;
						break;
					}
				}
				this.anIntArray245[local1635 - 5] = local1637 - 25;
				this.anIntArray213[local1635 - 5] = local1639 - local1637;
			}
			Class1_Sub1_Sub3_Sub1.method102(479, 96);
			this.anIntArray239 = Class1_Sub1_Sub3_Sub1.anIntArray28;
			Class1_Sub1_Sub3_Sub1.method102(190, 261);
			this.anIntArray240 = Class1_Sub1_Sub3_Sub1.anIntArray28;
			Class1_Sub1_Sub3_Sub1.method102(512, 334);
			this.anIntArray241 = Class1_Sub1_Sub3_Sub1.anIntArray28;
			@Pc(1781) int[] local1781 = new int[9];
			for (local1639 = 0; local1639 < 9; local1639++) {
				local1697 = local1639 * 32 + 128 + 15;
				@Pc(1799) int local1799 = local1697 * 3 + 600;
				@Pc(1803) int local1803 = Class1_Sub1_Sub3_Sub1.anIntArray26[local1697];
				local1781[local1639] = local1799 * local1803 >> 16;
			}
			Class11.method171(local1781, (byte) 7);
			Class20.method270(local227);
			this.aClass32_1 = new Class32(this, (byte) 0);
			this.method550(this.aClass32_1, 10);
			Class1_Sub1_Sub1_Sub5.aClient5 = this;
			Class22.aClient2 = this;
			Class38.aClient4 = this;
		} catch (@Pc(1844) Exception local1844) {
			signlink.reporterror("loaderror " + this.aString24 + " " + this.anInt864);
			this.aBoolean209 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method659() {
		try {
			Class22.aClass15_4.method224();
			Class22.aClass15_3.method224();
			Class38.aClass15_9.method224();
			Class23.aClass15_5.method224();
			Class23.aClass15_6.method224();
			Class1_Sub1_Sub1_Sub3_Sub2.aClass15_8.method224();
			this.anInt905 += 0;
			Class25.aClass15_7.method224();
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("6135, " + 0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method660(@OriginalArg(1) int arg0) {
		try {
			if (!aBoolean230) {
				@Pc(23) Class1_Sub1_Sub3_Sub3 local23;
				@Pc(31) int local31;
				@Pc(39) int local39;
				@Pc(42) byte[] local42;
				@Pc(45) byte[] local45;
				@Pc(47) int local47;
				if (Class1_Sub1_Sub3_Sub1.anIntArray30[17] >= arg0) {
					local23 = Class1_Sub1_Sub3_Sub1.aClass1_Sub1_Sub3_Sub3Array1[17];
					local31 = local23.anInt714 * local23.anInt715 - 1;
					local39 = local23.anInt714 * this.anInt819 * 2;
					local42 = local23.aByteArray19;
					local45 = this.aByteArray21;
					for (local47 = 0; local47 <= local31; local47++) {
						local45[local47] = local42[local47 - local39 & local31];
					}
					local23.aByteArray19 = local45;
					this.aByteArray21 = local42;
					Class1_Sub1_Sub3_Sub1.method107(17);
					anInt828++;
					if (anInt828 > 1723) {
						anInt828 = 0;
						this.aClass1_Sub1_Sub2_7.method11(144);
						this.aClass1_Sub1_Sub2_7.method12(0);
						@Pc(94) int local94 = this.aClass1_Sub1_Sub2_7.anInt10;
						this.aClass1_Sub1_Sub2_7.method12(61);
						this.aClass1_Sub1_Sub2_7.method13(30830);
						this.aClass1_Sub1_Sub2_7.method13(40631);
						this.aClass1_Sub1_Sub2_7.method12(17);
						this.aClass1_Sub1_Sub2_7.method13((int) (Math.random() * 65536.0D));
						this.aClass1_Sub1_Sub2_7.method12((int) (Math.random() * 256.0D));
						this.aClass1_Sub1_Sub2_7.method12(172);
						this.aClass1_Sub1_Sub2_7.method13(27205);
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass1_Sub1_Sub2_7.method12(157);
						}
						this.aClass1_Sub1_Sub2_7.method12(189);
						this.aClass1_Sub1_Sub2_7.method21(this.aClass1_Sub1_Sub2_7.anInt10 - local94);
					}
				}
				if (Class1_Sub1_Sub3_Sub1.anIntArray30[24] >= arg0) {
					local23 = Class1_Sub1_Sub3_Sub1.aClass1_Sub1_Sub3_Sub3Array1[24];
					local31 = local23.anInt714 * local23.anInt715 - 1;
					local39 = local23.anInt714 * this.anInt819 * 2;
					local42 = local23.aByteArray19;
					local45 = this.aByteArray21;
					for (local47 = 0; local47 <= local31; local47++) {
						local45[local47] = local42[local47 - local39 & local31];
					}
					local23.aByteArray19 = local45;
					this.aByteArray21 = local42;
					Class1_Sub1_Sub3_Sub1.method107(24);
				}
				if (Class1_Sub1_Sub3_Sub1.anIntArray30[34] >= arg0) {
					local23 = Class1_Sub1_Sub3_Sub1.aClass1_Sub1_Sub3_Sub3Array1[34];
					local31 = local23.anInt714 * local23.anInt715 - 1;
					local39 = local23.anInt714 * this.anInt819 * 2;
					local42 = local23.aByteArray19;
					local45 = this.aByteArray21;
					for (local47 = 0; local47 <= local31; local47++) {
						local45[local47] = local42[local47 - local39 & local31];
					}
					local23.aByteArray19 = local45;
					this.aByteArray21 = local42;
					Class1_Sub1_Sub3_Sub1.method107(34);
					return;
				}
			}
		} catch (@Pc(272) RuntimeException local272) {
			signlink.reporterror("37375, " + -19775 + ", " + arg0 + ", " + local272.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method661() {
		try {
			if (aBoolean230 && this.anInt1004 == 2 && Class39.anInt671 != this.anInt857) {
				this.aClass48_14.method503();
				this.aClass1_Sub1_Sub3_Sub2_3.method356(257, 151, "Loading - please wait.", 0);
				this.aClass1_Sub1_Sub3_Sub2_3.method356(256, 150, "Loading - please wait.", 16777215);
				this.aClass48_14.method504(super.aGraphics2, 4, 4);
				this.anInt1004 = 1;
				this.aLong32 = System.currentTimeMillis();
			}
			if (this.anInt1004 == 1) {
				@Pc(56) int local56 = this.method662(this.anInt919);
				if (local56 != 0 && System.currentTimeMillis() - this.aLong32 > 360000L) {
					signlink.reporterror(this.aString21 + " glcfb " + this.aLong29 + "," + local56 + "," + aBoolean230 + "," + this.aClass26Array1[0] + "," + this.aClass7_Sub1_1.method60() + "," + this.anInt857 + "," + this.anInt910 + "," + this.anInt911);
					this.aLong32 = System.currentTimeMillis();
				}
			}
			if (this.anInt1004 == 2 && this.anInt857 != this.anInt1022) {
				this.anInt1022 = this.anInt857;
				this.method670(this.anInt857);
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("8243, " + 43923 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)I")
	private int method662(@OriginalArg(0) int arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray4.length; local3++) {
				if (this.aByteArrayArray4[local3] == null && this.anIntArray252[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray5[local3] == null && this.anIntArray253[local3] != -1) {
					return -2;
				}
			}
			@Pc(41) int local41 = 38 / arg0;
			@Pc(43) boolean local43 = true;
			for (@Pc(45) int local45 = 0; local45 < this.aByteArrayArray4.length; local45++) {
				@Pc(52) byte[] local52 = this.aByteArrayArray5[local45];
				if (local52 != null) {
					@Pc(66) int local66 = (this.anIntArray251[local45] >> 8) * 64 - this.anInt931;
					@Pc(78) int local78 = (this.anIntArray251[local45] & 0xFF) * 64 - this.anInt932;
					local43 &= Class39.method424(local66, local78, local52);
				}
			}
			if (!local43) {
				return -3;
			} else if (this.aBoolean239) {
				return -4;
			} else {
				this.anInt1004 = 2;
				Class39.anInt671 = this.anInt857;
				this.method558(684);
				this.aClass1_Sub1_Sub2_7.method11(15);
				return 0;
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("19615, " + arg0 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)V")
	private void method663(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass1_Sub1_Sub3_Sub3_11.method473(arg3, arg2);
			this.aClass1_Sub1_Sub3_Sub3_12.method473(arg3, arg2 + arg0 - 16);
			Class1_Sub1_Sub3.method517(arg2 + 16, arg0 - 32, 16, arg3, this.anInt917);
			@Pc(35) int local35 = (arg0 - 32) * arg0 / arg1;
			if (local35 < 8) {
				local35 = 8;
			}
			@Pc(52) int local52 = (arg0 - local35 - 32) * arg4 / (arg1 - arg0);
			Class1_Sub1_Sub3.method517(arg2 + local52 + 16, local35, 16, arg3, this.anInt943);
			Class1_Sub1_Sub3.method522(local35, arg3, arg2 + local52 + 16, this.anInt1012);
			Class1_Sub1_Sub3.method522(local35, arg3 + 1, arg2 + 16 + local52, this.anInt1012);
			Class1_Sub1_Sub3.method520(arg3, 16, arg2 + local52 + 16, this.anInt1012);
			Class1_Sub1_Sub3.method520(arg3, 16, arg2 + local52 + 17, this.anInt1012);
			Class1_Sub1_Sub3.method522(local35, arg3 + 15, arg2 + 16 + local52, this.anInt914);
			Class1_Sub1_Sub3.method522(local35 - 1, arg3 + 14, arg2 + local52 + 17, this.anInt914);
			this.anInt905 += 0;
			Class1_Sub1_Sub3.method520(arg3, 16, arg2 + local52 + local35 + 15, this.anInt914);
			Class1_Sub1_Sub3.method520(arg3 + 1, 15, arg2 + local52 + local35 + 14, this.anInt914);
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("82564, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method664(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			try {
				@Pc(15) int local15 = aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt573 + this.anInt1010;
				@Pc(21) int local21 = aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt574 + this.anInt831;
				if (this.anInt898 - local15 < -500 || this.anInt898 - local15 > 500 || this.anInt899 - local21 < -500 || this.anInt899 - local21 > 500) {
					this.anInt898 = local15;
					this.anInt899 = local21;
				}
				if (this.anInt898 != local15) {
					this.anInt898 += (local15 - this.anInt898) / 16;
				}
				if (this.anInt899 != local21) {
					this.anInt899 += (local21 - this.anInt899) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt843 += (-this.anInt843 - 24) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt843 += (24 - this.anInt843) / 2;
				} else {
					this.anInt843 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt844 += (12 - this.anInt844) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt844 += (-this.anInt844 - 12) / 2;
				} else {
					this.anInt844 /= 2;
				}
				this.anInt842 = this.anInt842 + this.anInt843 / 2 & 0x7FF;
				this.anInt841 += this.anInt844 / 2;
				if (this.anInt841 < 128) {
					this.anInt841 = 128;
				}
				if (this.anInt841 > 383) {
					this.anInt841 = 383;
				}
				@Pc(208) int local208 = this.anInt898 >> 7;
				@Pc(213) int local213 = this.anInt899 >> 7;
				@Pc(223) int local223 = this.method612(this.anInt898, 938, this.anInt899, this.anInt857);
				@Pc(225) int local225 = 0;
				@Pc(241) int local241;
				if (local208 > 3 && local213 > 3 && local208 < 100 && local213 < 100) {
					for (local241 = local208 - 4; local241 <= local208 + 4; local241++) {
						for (@Pc(247) int local247 = local213 - 4; local247 <= local213 + 4; local247++) {
							@Pc(252) int local252 = this.anInt857;
							if (local252 < 3 && (this.aByteArrayArrayArray8[1][local241][local247] & 0x2) == 2) {
								local252++;
							}
							@Pc(279) int local279 = local223 - this.anIntArrayArrayArray7[local252][local241][local247];
							if (local279 > local225) {
								local225 = local279;
							}
						}
					}
				}
				local241 = local225 * 192;
				if (local241 > 98048) {
					local241 = 98048;
				}
				if (local241 < 32768) {
					local241 = 32768;
				}
				if (local241 > this.anInt990) {
					this.anInt990 += (local241 - this.anInt990) / 24;
				} else if (local241 < this.anInt990) {
					this.anInt990 += (local241 - this.anInt990) / 80;
				}
			} catch (@Pc(343) Exception local343) {
				signlink.reporterror("glfc_ex " + aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt573 + "," + aClass1_Sub1_Sub1_Sub3_Sub2_1.anInt574 + "," + this.anInt898 + "," + this.anInt899 + "," + this.anInt910 + "," + this.anInt911 + "," + this.anInt931 + "," + this.anInt932);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(393) RuntimeException local393) {
			signlink.reporterror("87755, " + arg0 + ", " + local393.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ETSIPTYG;I)Z")
	private boolean method665(@OriginalArg(0) Class6 arg0) {
		try {
			@Pc(14) int local14 = arg0.anInt70;
			if (local14 >= 1 && local14 <= 200 || !(local14 < 701 || local14 > 900)) {
				if (local14 >= 801) {
					local14 -= 701;
				} else if (local14 >= 701) {
					local14 -= 601;
				} else if (local14 >= 101) {
					local14 -= 101;
				} else {
					local14--;
				}
				this.aStringArray10[this.anInt916] = "Remove @whi@" + this.aStringArray8[local14];
				this.anIntArray270[this.anInt916] = 361;
				this.anInt916++;
				this.aStringArray10[this.anInt916] = "Message @whi@" + this.aStringArray8[local14];
				this.anIntArray270[this.anInt916] = 281;
				this.anInt916++;
				return true;
			} else if (local14 >= 401 && local14 <= 500) {
				this.aStringArray10[this.anInt916] = "Remove @whi@" + arg0.aString4;
				this.anIntArray270[this.anInt916] = 801;
				this.anInt916++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("56061, " + arg0 + ", " + 1 + ", " + local137.toString());
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
				return new URL("http://127.0.0.1:" + (anInt965 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
	private void method666() {
		try {
			if (this.anInt1018 > 1) {
				this.anInt1018--;
			}
			if (this.anInt909 > 0) {
				this.anInt909--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method574(); local22++) {
			}
			if (this.aBoolean234) {
				@Pc(41) Object local41 = this.aClass32_1.anObject1;
				@Pc(66) int local66;
				@Pc(68) int local68;
				@Pc(70) int local70;
				@Pc(103) int local103;
				synchronized (this.aClass32_1.anObject1) {
					if (!aBoolean232) {
						this.aClass32_1.anInt543 = 0;
					} else if (super.anInt809 != 0 || this.aClass32_1.anInt543 >= 40) {
						this.aClass1_Sub1_Sub2_7.method11(116);
						this.aClass1_Sub1_Sub2_7.method12(0);
						local66 = this.aClass1_Sub1_Sub2_7.anInt10;
						local68 = 0;
						@Pc(86) int local86;
						for (local70 = 0; local70 < this.aClass32_1.anInt543 && local66 - this.aClass1_Sub1_Sub2_7.anInt10 < 240; local70++) {
							local68++;
							local86 = this.aClass32_1.anIntArray150[local70];
							if (local86 < 0) {
								local86 = 0;
							} else if (local86 > 502) {
								local86 = 502;
							}
							local103 = this.aClass32_1.anIntArray151[local70];
							if (local103 < 0) {
								local103 = 0;
							} else if (local103 > 764) {
								local103 = 764;
							}
							@Pc(120) int local120 = local86 * 765 + local103;
							if (this.aClass32_1.anIntArray150[local70] == -1 && this.aClass32_1.anIntArray151[local70] == -1) {
								local103 = -1;
								local86 = -1;
								local120 = 524287;
							}
							if (local103 != this.anInt979 || local86 != this.anInt980) {
								@Pc(165) int local165 = local103 - this.anInt979;
								this.anInt979 = local103;
								@Pc(173) int local173 = local86 - this.anInt980;
								this.anInt980 = local86;
								if (this.anInt984 < 8 && local165 >= -32 && local165 <= 31 && local173 >= -32 && local173 <= 31) {
									local165 += 32;
									local173 += 32;
									this.aClass1_Sub1_Sub2_7.method13((this.anInt984 << 12) + (local165 << 6) + local173);
									this.anInt984 = 0;
								} else if (this.anInt984 < 8) {
									this.aClass1_Sub1_Sub2_7.method15((this.anInt984 << 19) + local120 + 8388608);
									this.anInt984 = 0;
								} else {
									this.aClass1_Sub1_Sub2_7.method16((this.anInt984 << 19) + local120 - 1073741824);
									this.anInt984 = 0;
								}
							} else if (this.anInt984 < 2047) {
								this.anInt984++;
							}
						}
						this.aClass1_Sub1_Sub2_7.method21(this.aClass1_Sub1_Sub2_7.anInt10 - local66);
						if (local68 >= this.aClass32_1.anInt543) {
							this.aClass32_1.anInt543 = 0;
						} else {
							this.aClass32_1.anInt543 -= local68;
							for (local86 = 0; local86 < this.aClass32_1.anInt543; local86++) {
								this.aClass32_1.anIntArray151[local86] = this.aClass32_1.anIntArray151[local86 + local68];
								this.aClass32_1.anIntArray150[local86] = this.aClass32_1.anIntArray150[local86 + local68];
							}
						}
					}
				}
				if (super.anInt809 != 0) {
					@Pc(335) long local335 = (super.aLong28 - this.aLong33) / 50L;
					if (local335 > 4095L) {
						local335 = 4095L;
					}
					this.aLong33 = super.aLong28;
					local66 = super.anInt811;
					if (local66 < 0) {
						local66 = 0;
					} else if (local66 > 502) {
						local66 = 502;
					}
					local68 = super.anInt810;
					if (local68 < 0) {
						local68 = 0;
					} else if (local68 > 764) {
						local68 = 764;
					}
					local70 = local66 * 765 + local68;
					@Pc(381) byte local381 = 0;
					if (super.anInt809 == 2) {
						local381 = 1;
					}
					local103 = (int) local335;
					this.aClass1_Sub1_Sub2_7.method11(251);
					this.aClass1_Sub1_Sub2_7.method16((local103 << 20) + (local381 << 19) + local70);
				}
				if (this.anInt900 > 0) {
					this.anInt900--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean212 = true;
				}
				if (this.aBoolean212 && this.anInt900 <= 0) {
					this.anInt900 = 20;
					this.aBoolean212 = false;
					this.aClass1_Sub1_Sub2_7.method11(20);
					this.aClass1_Sub1_Sub2_7.method13(this.anInt841);
					this.aClass1_Sub1_Sub2_7.method13(this.anInt842);
				}
				if (super.aBoolean189 && !this.aBoolean197) {
					this.aBoolean197 = true;
					this.aClass1_Sub1_Sub2_7.method11(206);
					this.aClass1_Sub1_Sub2_7.method12(1);
				}
				if (!super.aBoolean189 && this.aBoolean197) {
					this.aBoolean197 = false;
					this.aClass1_Sub1_Sub2_7.method11(206);
					this.aClass1_Sub1_Sub2_7.method12(0);
				}
				this.method661();
				this.method649();
				this.method613(27);
				this.anInt907++;
				if (this.anInt907 > 750) {
					this.method641();
				}
				this.method674(this.aBoolean196);
				this.method596();
				this.method566();
				this.anInt819++;
				if (this.anInt886 != 0) {
					this.anInt885 += 20;
					if (this.anInt885 >= 400) {
						this.anInt886 = 0;
					}
				}
				if (this.anInt940 != 0) {
					this.anInt937++;
					if (this.anInt937 >= 15) {
						if (this.anInt940 == 2) {
							this.aBoolean203 = true;
						}
						if (this.anInt940 == 3) {
							this.aBoolean205 = true;
						}
						this.anInt940 = 0;
					}
				}
				if (this.anInt895 != 0) {
					this.anInt825++;
					if (super.anInt804 > this.anInt896 + 5 || super.anInt804 < this.anInt896 - 5 || super.anInt805 > this.anInt897 + 5 || super.anInt805 < this.anInt897 - 5) {
						this.aBoolean221 = true;
					}
					if (super.anInt803 == 0) {
						if (this.anInt895 == 2) {
							this.aBoolean203 = true;
						}
						if (this.anInt895 == 3) {
							this.aBoolean205 = true;
						}
						this.anInt895 = 0;
						if (this.aBoolean221 && this.anInt825 >= 5) {
							this.anInt1002 = -1;
							this.method646(this.aBoolean208);
							if (this.anInt1002 == this.anInt893 && this.anInt1001 != this.anInt894) {
								@Pc(683) Class6 local683 = Class6.aClass6Array1[this.anInt893];
								@Pc(685) byte local685 = 0;
								if (this.anInt862 == 1 && local683.anInt70 == 206) {
									local685 = 1;
								}
								if (local683.anIntArray11[this.anInt1001] <= 0) {
									local685 = 0;
								}
								if (local683.aBoolean16) {
									local66 = this.anInt894;
									local68 = this.anInt1001;
									local683.anIntArray11[local68] = local683.anIntArray11[local66];
									local683.anIntArray12[local68] = local683.anIntArray12[local66];
									local683.anIntArray11[local66] = -1;
									local683.anIntArray12[local66] = 0;
								} else if (local685 == 1) {
									local66 = this.anInt894;
									local68 = this.anInt1001;
									while (local66 != local68) {
										if (local66 > local68) {
											local683.method41(local66 - 1, local66);
											local66--;
										} else if (local66 < local68) {
											local683.method41(local66 + 1, local66);
											local66++;
										}
									}
								} else {
									local683.method41(this.anInt1001, this.anInt894);
								}
								this.aClass1_Sub1_Sub2_7.method11(19);
								this.aClass1_Sub1_Sub2_7.method13(this.anInt893);
								this.aClass1_Sub1_Sub2_7.method13(this.anInt894);
								this.aClass1_Sub1_Sub2_7.method13(this.anInt1001);
								this.aClass1_Sub1_Sub2_7.method12(local685);
							}
						} else if ((this.anInt848 == 1 || this.method630(this.anInt916 - 1)) && this.anInt916 > 2) {
							this.method669();
						} else if (this.anInt916 > 0) {
							this.method567(this.aByte43, this.anInt916 - 1);
						}
						this.anInt937 = 10;
						super.anInt809 = 0;
					}
				}
				anInt912++;
				@Pc(872) int local872;
				if (anInt912 > 1046) {
					anInt912 = 0;
					this.aClass1_Sub1_Sub2_7.method11(129);
					this.aClass1_Sub1_Sub2_7.method12(0);
					local872 = this.aClass1_Sub1_Sub2_7.anInt10;
					this.aClass1_Sub1_Sub2_7.method12(12);
					this.aClass1_Sub1_Sub2_7.method13(39329);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub2_7.method13(27202);
					}
					this.aClass1_Sub1_Sub2_7.method12((int) (Math.random() * 256.0D));
					this.aClass1_Sub1_Sub2_7.method13(11442);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub2_7.method12(72);
					}
					this.aClass1_Sub1_Sub2_7.method13(32187);
					this.aClass1_Sub1_Sub2_7.method12(71);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub2_7.method13(59223);
					}
					this.aClass1_Sub1_Sub2_7.method13(26405);
					this.aClass1_Sub1_Sub2_7.method21(this.aClass1_Sub1_Sub2_7.anInt10 - local872);
				}
				@Pc(946) int local946;
				if (Class11.anInt197 != -1) {
					local872 = Class11.anInt197;
					local946 = Class11.anInt198;
					@Pc(967) boolean local967 = this.method652(aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray156[0], aClass1_Sub1_Sub1_Sub3_Sub2_1.anIntArray155[0], 0, local872, 0, 303, 0, true, 0, local946, 0, 0);
					Class11.anInt197 = -1;
					if (local967) {
						this.anInt883 = super.anInt810;
						this.anInt884 = super.anInt811;
						this.anInt886 = 1;
						this.anInt885 = 0;
					}
				}
				if (super.anInt809 == 1 && this.aString23 != null) {
					this.aString23 = null;
					this.aBoolean205 = true;
					super.anInt809 = 0;
				}
				this.method576();
				this.method579(this.anInt822);
				this.method594();
				this.method588();
				if (super.anInt803 == 1 || super.anInt809 == 1) {
					this.anInt915++;
				}
				if (this.anInt1004 == 2) {
					this.method664((byte) 4);
				}
				if (this.anInt1004 == 2 && this.aBoolean190) {
					this.method557();
				}
				for (local872 = 0; local872 < 5; local872++) {
					@Pc(1054) int local1054 = this.anIntArray242[local872]++;
				}
				this.method589(this.anInt860);
				super.anInt802++;
				if (super.anInt802 > 4500) {
					this.anInt909 = 250;
					super.anInt802 -= 500;
					this.aClass1_Sub1_Sub2_7.method11(119);
				}
				this.anInt1013++;
				if (this.anInt1013 > 500) {
					this.anInt1013 = 0;
					local946 = (int) (Math.random() * 8.0D);
					if ((local946 & 0x1) == 1) {
						this.anInt1010 += this.anInt1011;
					}
					if ((local946 & 0x2) == 2) {
						this.anInt831 += this.anInt832;
					}
					if ((local946 & 0x4) == 4) {
						this.anInt961 += this.anInt962;
					}
				}
				if (this.anInt1010 < -50) {
					this.anInt1011 = 2;
				}
				if (this.anInt1010 > 50) {
					this.anInt1011 = -2;
				}
				if (this.anInt831 < -55) {
					this.anInt832 = 2;
				}
				if (this.anInt831 > 55) {
					this.anInt832 = -2;
				}
				if (this.anInt961 < -40) {
					this.anInt962 = 1;
				}
				if (this.anInt961 > 40) {
					this.anInt962 = -1;
				}
				this.anInt969++;
				if (this.anInt969 > 500) {
					this.anInt969 = 0;
					local946 = (int) (Math.random() * 8.0D);
					if ((local946 & 0x1) == 1) {
						this.anInt829 += this.anInt830;
					}
					if ((local946 & 0x2) == 2) {
						this.anInt875 += this.anInt876;
					}
				}
				if (this.anInt829 < -60) {
					this.anInt830 = 2;
				}
				if (this.anInt829 > 60) {
					this.anInt830 = -2;
				}
				if (this.anInt875 < -20) {
					this.anInt876 = 1;
				}
				if (this.anInt875 > 10) {
					this.anInt876 = -1;
				}
				this.anInt908++;
				if (this.anInt908 > 50) {
					this.aClass1_Sub1_Sub2_7.method11(21);
				}
				try {
					if (this.aClass16_1 != null && this.aClass1_Sub1_Sub2_7.anInt10 > 0) {
						this.aClass16_1.method229(this.aClass1_Sub1_Sub2_7.aByteArray1, this.aClass1_Sub1_Sub2_7.anInt10);
						this.aClass1_Sub1_Sub2_7.anInt10 = 0;
						this.anInt908 = 0;
					}
				} catch (@Pc(1304) IOException local1304) {
					this.method641();
				} catch (@Pc(1309) Exception local1309) {
					this.method680(this.aBoolean195);
				}
			}
		} catch (@Pc(1315) RuntimeException local1315) {
			signlink.reporterror("79416, " + false + ", " + local1315.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
	private void method667() {
		try {
			@Pc(7) byte[] local7 = this.aClass27_1.method340("title.dat", null);
			@Pc(13) Class1_Sub1_Sub3_Sub4 local13 = new Class1_Sub1_Sub3_Sub4(local7, this);
			this.aClass48_6.method503();
			local13.method527(0, 0);
			this.aClass48_7.method503();
			local13.method527(0, -637);
			this.aClass48_3.method503();
			local13.method527(0, -128);
			this.aClass48_4.method503();
			local13.method527(-371, -202);
			this.aClass48_5.method503();
			local13.method527(-171, -202);
			this.aClass48_8.method503();
			local13.method527(-265, 0);
			this.aClass48_9.method503();
			local13.method527(-265, -562);
			this.aClass48_10.method503();
			local13.method527(-171, -128);
			this.aClass48_11.method503();
			local13.method527(-171, -562);
			@Pc(104) int[] local104 = new int[local13.anInt786];
			for (@Pc(106) int local106 = 0; local106 < local13.anInt787; local106++) {
				for (@Pc(110) int local110 = 0; local110 < local13.anInt786; local110++) {
					local104[local110] = local13.anIntArray209[local13.anInt786 + local13.anInt786 * local106 - local110 - 1];
				}
				for (@Pc(136) int local136 = 0; local136 < local13.anInt786; local136++) {
					local13.anIntArray209[local136 + local13.anInt786 * local106] = local104[local136];
				}
			}
			this.aClass48_6.method503();
			local13.method527(0, 382);
			this.aClass48_7.method503();
			local13.method527(0, -255);
			this.aClass48_3.method503();
			local13.method527(0, 254);
			this.aClass48_4.method503();
			local13.method527(-371, 180);
			this.aClass48_5.method503();
			local13.method527(-171, 180);
			this.aClass48_8.method503();
			local13.method527(-265, 382);
			this.aClass48_9.method503();
			local13.method527(-265, -180);
			this.aClass48_10.method503();
			local13.method527(-171, 254);
			this.aClass48_11.method503();
			local13.method527(-171, -180);
			local13 = new Class1_Sub1_Sub3_Sub4(this.aClass27_1, "logo", 0);
			this.aClass48_3.method503();
			local13.method529(382 - local13.anInt786 / 2 - 128, 18);
			System.gc();
		} catch (@Pc(274) RuntimeException local274) {
			signlink.reporterror("88112, " + 0 + ", " + local274.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(ILclient!BJPWOXRJ;I)V")
	private void method668(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub2 arg1) {
		try {
			@Pc(6) int local6 = arg1.method33(8);
			@Pc(21) int local21;
			if (local6 < this.anInt959) {
				for (local21 = local6; local21 < this.anInt959; local21++) {
					this.anIntArray238[this.anInt918++] = this.anIntArray256[local21];
				}
			}
			if (local6 > this.anInt959) {
				signlink.reporterror(this.aString21 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt959 = 0;
			for (local21 = 0; local21 < local6; local21++) {
				@Pc(73) int local73 = this.anIntArray256[local21];
				@Pc(78) Class1_Sub1_Sub1_Sub3_Sub2 local78 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local73];
				@Pc(83) int local83 = arg1.method33(1);
				if (local83 == 0) {
					this.anIntArray256[this.anInt959++] = local73;
					local78.anInt571 = anInt921;
				} else {
					@Pc(106) int local106 = arg1.method33(2);
					if (local106 == 0) {
						this.anIntArray256[this.anInt959++] = local73;
						local78.anInt571 = anInt921;
						this.anIntArray257[this.anInt960++] = local73;
					} else {
						@Pc(157) int local157;
						@Pc(167) int local167;
						if (local106 == 1) {
							this.anIntArray256[this.anInt959++] = local73;
							local78.anInt571 = anInt921;
							local157 = arg1.method33(3);
							local78.method392(false, local157);
							local167 = arg1.method33(1);
							if (local167 == 1) {
								this.anIntArray257[this.anInt960++] = local73;
							}
						} else if (local106 == 2) {
							this.anIntArray256[this.anInt959++] = local73;
							local78.anInt571 = anInt921;
							local157 = arg1.method33(3);
							local78.method392(true, local157);
							local167 = arg1.method33(3);
							local78.method392(true, local167);
							@Pc(225) int local225 = arg1.method33(1);
							if (local225 == 1) {
								this.anIntArray257[this.anInt960++] = local73;
							}
						} else if (local106 == 3) {
							this.anIntArray238[this.anInt918++] = local73;
						}
					}
				}
			}
		} catch (@Pc(262) RuntimeException local262) {
			signlink.reporterror("19325, " + arg0 + ", " + arg1 + ", " + -153 + ", " + local262.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
	private void method669() {
		try {
			@Pc(8) int local8 = this.aClass1_Sub1_Sub3_Sub2_4.method358(this.aBoolean199, "Choose Option");
			this.aBoolean234 &= true;
			@Pc(28) int local28;
			for (@Pc(16) int local16 = 0; local16 < this.anInt916; local16++) {
				local28 = this.aClass1_Sub1_Sub3_Sub2_4.method358(this.aBoolean199, this.aStringArray10[local16]);
				if (local28 > local8) {
					local8 = local28;
				}
			}
			local8 += 8;
			local28 = this.anInt916 * 15 + 21;
			@Pc(71) int local71;
			@Pc(89) int local89;
			if (super.anInt810 > 4 && super.anInt811 > 4 && super.anInt810 < 516 && super.anInt811 < 338) {
				local71 = super.anInt810 - local8 / 2 - 4;
				if (local71 + local8 > 512) {
					local71 = 512 - local8;
				}
				if (local71 < 0) {
					local71 = 0;
				}
				local89 = super.anInt811 - 4;
				if (local89 + local28 > 334) {
					local89 = 334 - local28;
				}
				if (local89 < 0) {
					local89 = 0;
				}
				this.aBoolean200 = true;
				this.anInt836 = 0;
				this.anInt837 = local71;
				this.anInt838 = local89;
				this.anInt839 = local8;
				this.anInt840 = this.anInt916 * 15 + 22;
			}
			if (super.anInt810 > 553 && super.anInt811 > 205 && super.anInt810 < 743 && super.anInt811 < 466) {
				local71 = super.anInt810 - local8 / 2 - 553;
				if (local71 < 0) {
					local71 = 0;
				} else if (local71 + local8 > 190) {
					local71 = 190 - local8;
				}
				local89 = super.anInt811 - 205;
				if (local89 < 0) {
					local89 = 0;
				} else if (local89 + local28 > 261) {
					local89 = 261 - local28;
				}
				this.aBoolean200 = true;
				this.anInt836 = 1;
				this.anInt837 = local71;
				this.anInt838 = local89;
				this.anInt839 = local8;
				this.anInt840 = this.anInt916 * 15 + 22;
			}
			if (super.anInt810 > 17 && super.anInt811 > 357 && super.anInt810 < 496 && super.anInt811 < 453) {
				local71 = super.anInt810 - local8 / 2 - 17;
				if (local71 < 0) {
					local71 = 0;
				} else if (local71 + local8 > 479) {
					local71 = 479 - local8;
				}
				local89 = super.anInt811 - 357;
				if (local89 < 0) {
					local89 = 0;
				} else if (local89 + local28 > 96) {
					local89 = 96 - local28;
				}
				this.aBoolean200 = true;
				this.anInt836 = 2;
				this.anInt837 = local71;
				this.anInt838 = local89;
				this.anInt839 = local8;
				this.anInt840 = this.anInt916 * 15 + 22;
			}
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("98342, " + true + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)V")
	private void method670(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass1_Sub1_Sub3_Sub4_15.anIntArray209;
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
						this.aClass11_1.method170(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass11_1.method170(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			anInt846++;
			if (anInt846 > 1190) {
				anInt846 = 0;
				this.aClass1_Sub1_Sub2_7.method11(11);
				this.aClass1_Sub1_Sub2_7.method12(0);
				local34 = this.aClass1_Sub1_Sub2_7.anInt10;
				this.aClass1_Sub1_Sub2_7.method12((int) (Math.random() * 256.0D));
				this.aClass1_Sub1_Sub2_7.method13(31648);
				this.aClass1_Sub1_Sub2_7.method12(22);
				this.aClass1_Sub1_Sub2_7.method12((int) (Math.random() * 256.0D));
				this.aClass1_Sub1_Sub2_7.method13(23169);
				this.aClass1_Sub1_Sub2_7.method13(19661);
				this.aClass1_Sub1_Sub2_7.method13((int) (Math.random() * 65536.0D));
				this.aClass1_Sub1_Sub2_7.method13((int) (Math.random() * 65536.0D));
				this.aClass1_Sub1_Sub2_7.method12(16);
				this.aClass1_Sub1_Sub2_7.method12((int) (Math.random() * 256.0D));
				this.aClass1_Sub1_Sub2_7.method21(this.aClass1_Sub1_Sub2_7.anInt10 - local34);
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass1_Sub1_Sub3_Sub4_15.method524();
			@Pc(238) int local238;
			for (@Pc(234) int local234 = 1; local234 < 103; local234++) {
				for (local238 = 1; local238 < 103; local238++) {
					if ((this.aByteArrayArrayArray8[arg0][local238][local234] & 0x18) == 0) {
						this.method604(arg0, local238, local34, local234, local36);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local238][local234] & 0x8) != 0) {
						this.method604(arg0 + 1, local238, local34, local234, local36);
					}
				}
			}
			this.aClass48_14.method503();
			this.anInt992 = 0;
			for (local238 = 0; local238 < 104; local238++) {
				for (@Pc(306) int local306 = 0; local306 < 104; local306++) {
					@Pc(316) int local316 = this.aClass11_1.method164(this.anInt857, local238, local306);
					if (local316 != 0) {
						local316 = local316 >> 14 & 0x7FFF;
						@Pc(328) int local328 = Class22.method312(local316).anInt427;
						if (local328 >= 0) {
							@Pc(332) int local332 = local238;
							@Pc(334) int local334 = local306;
							if (local328 != 22 && local328 != 29 && local328 != 34 && local328 != 36 && local328 != 46 && local328 != 47 && local328 != 48) {
								@Pc(366) int[][] local366 = this.aClass13Array1[this.anInt857].anIntArrayArray9;
								for (@Pc(368) int local368 = 0; local368 < 10; local368++) {
									@Pc(375) int local375 = (int) (Math.random() * 4.0D);
									if (local375 == 0 && local332 > 0 && local332 > local238 - 3 && (local366[local332 - 1][local334] & 0x280108) == 0) {
										local332--;
									}
									if (local375 == 1 && local332 < 103 && local332 < local238 + 3 && (local366[local332 + 1][local334] & 0x280180) == 0) {
										local332++;
									}
									if (local375 == 2 && local334 > 0 && local334 > local306 - 3 && (local366[local332][local334 - 1] & 0x280102) == 0) {
										local334--;
									}
									if (local375 == 3 && local334 < 103 && local334 < local306 + 3 && (local366[local332][local334 + 1] & 0x280120) == 0) {
										local334++;
									}
								}
							}
							this.aClass1_Sub1_Sub3_Sub4Array4[this.anInt992] = this.aClass1_Sub1_Sub3_Sub4Array7[local328];
							this.anIntArray262[this.anInt992] = local332;
							this.anIntArray263[this.anInt992] = local334;
							this.anInt992++;
						}
					}
				}
			}
		} catch (@Pc(505) RuntimeException local505) {
			signlink.reporterror("16939, " + arg0 + ", " + 3 + ", " + local505.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(ILclient!BJPWOXRJ;I)V")
	private void method671(@OriginalArg(1) Class1_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt918 = 0;
			this.anInt960 = 0;
			this.method633(arg1, arg0);
			this.method668(arg1, arg0);
			this.method611(797, arg0, arg1);
			this.method584(arg1, arg0);
			@Pc(41) int local41;
			for (@Pc(34) int local34 = 0; local34 < this.anInt918; local34++) {
				local41 = this.anIntArray238[local34];
				if (this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local41].anInt571 != anInt921) {
					this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local41] = null;
				}
			}
			if (arg0.anInt10 != arg1) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.anInt10 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local41 = 0; local41 < this.anInt959; local41++) {
				if (this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[this.anIntArray256[local41]] == null) {
					signlink.reporterror(this.aString21 + " null entry in pl list - pos:" + local41 + " size:" + this.anInt959);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("43360, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(Z)V")
	private void method674(@OriginalArg(0) boolean arg0) {
		try {
			if (arg0) {
				this.aClass1_Sub1_Sub2_7.method12(79);
			}
			for (@Pc(9) int local9 = -1; local9 < this.anInt959; local9++) {
				@Pc(17) int local17;
				if (local9 == -1) {
					local17 = this.anInt958;
				} else {
					local17 = this.anIntArray256[local9];
				}
				@Pc(29) Class1_Sub1_Sub1_Sub3_Sub2 local29 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local17];
				if (local29 != null) {
					this.method597(local29, 1);
				}
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("33453, " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!YZDAHXEQ;I)V")
	private void method675(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3_Sub4 arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg0 * arg0 + arg2 * arg2;
			if (local7 > 4225 && local7 < 90000) {
				@Pc(25) int local25 = this.anInt842 + this.anInt829 & 0x7FF;
				@Pc(29) int local29 = Class1_Sub1_Sub1_Sub4.anIntArray107[local25];
				@Pc(33) int local33 = Class1_Sub1_Sub1_Sub4.anIntArray108[local25];
				@Pc(42) int local42 = local29 * 256 / (this.anInt875 + 256);
				@Pc(51) int local51 = local33 * 256 / (this.anInt875 + 256);
				@Pc(61) int local61 = arg2 * local42 + arg0 * local51 >> 16;
				@Pc(71) int local71 = arg2 * local51 - arg0 * local42 >> 16;
				@Pc(77) double local77 = Math.atan2((double) local61, (double) local71);
				@Pc(83) int local83 = (int) (Math.sin(local77) * 63.0D);
				@Pc(89) int local89 = (int) (Math.cos(local77) * 57.0D);
				this.aClass1_Sub1_Sub3_Sub4_14.method534(local83 + 94 + 4 - 10, 655, local77, 83 - local89 - 20);
			} else {
				this.method583(arg0, arg2, arg1);
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("4294, " + 16606 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!ETSIPTYG;ZIIII)V")
	private void method676(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg1.anInt48 == 0 && arg1.anIntArray13 != null && !arg1.aBoolean18 && (arg0 >= arg4 && arg2 >= arg5 && arg0 <= arg4 + arg1.anInt66 && arg2 <= arg5 + arg1.anInt44)) {
				@Pc(38) int local38 = arg1.anIntArray13.length;
				for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
					@Pc(49) int local49 = arg1.anIntArray8[local40] + arg4;
					@Pc(58) int local58 = arg1.anIntArray5[local40] + arg5 - arg3;
					@Pc(65) Class6 local65 = Class6.aClass6Array1[arg1.anIntArray13[local40]];
					@Pc(70) int local70 = local49 + local65.anInt50;
					@Pc(75) int local75 = local58 + local65.anInt54;
					if ((local65.anInt62 >= 0 || local65.anInt57 != 0) && arg0 >= local70 && arg2 >= local75 && arg0 < local70 + local65.anInt66 && arg2 < local75 + local65.anInt44) {
						if (local65.anInt62 >= 0) {
							this.anInt1009 = local65.anInt62;
						} else {
							this.anInt1009 = local65.anInt55;
						}
					}
					if (local65.anInt48 == 0) {
						this.method676(arg0, local65, arg2, local65.anInt65, local70, local75);
						if (local65.anInt40 > local65.anInt44) {
							this.method608(arg0, arg2, true, local65.anInt44, local70 + local65.anInt66, local75, local65.anInt40, local65);
						}
					} else {
						if (local65.anInt69 == 1 && arg0 >= local70 && arg2 >= local75 && arg0 < local70 + local65.anInt66 && arg2 < local75 + local65.anInt44) {
							@Pc(172) boolean local172 = false;
							if (local65.anInt70 != 0) {
								local172 = this.method665(local65);
							}
							if (!local172) {
								this.aStringArray10[this.anInt916] = local65.aString6;
								this.anIntArray270[this.anInt916] = 760;
								this.anIntArray269[this.anInt916] = local65.anInt55;
								this.anInt916++;
							}
						}
						if (local65.anInt69 == 2 && this.anInt872 == 0 && arg0 >= local70 && arg2 >= local75 && arg0 < local70 + local65.anInt66 && arg2 < local75 + local65.anInt44) {
							@Pc(236) String local236 = local65.aString2;
							if (local236.indexOf(" ") != -1) {
								local236 = local236.substring(0, local236.indexOf(" "));
							}
							this.aStringArray10[this.anInt916] = local236 + " @gre@" + local65.aString5;
							this.anIntArray270[this.anInt916] = 233;
							this.anIntArray269[this.anInt916] = local65.anInt55;
							this.anInt916++;
						}
						if (local65.anInt69 == 3 && arg0 >= local70 && arg2 >= local75 && arg0 < local70 + local65.anInt66 && arg2 < local75 + local65.anInt44) {
							this.aStringArray10[this.anInt916] = "Close";
							this.anIntArray270[this.anInt916] = 214;
							this.anIntArray269[this.anInt916] = local65.anInt55;
							this.anInt916++;
						}
						if (local65.anInt69 == 4 && arg0 >= local70 && arg2 >= local75 && arg0 < local70 + local65.anInt66 && arg2 < local75 + local65.anInt44) {
							this.aStringArray10[this.anInt916] = local65.aString6;
							this.anIntArray270[this.anInt916] = 907;
							this.anIntArray269[this.anInt916] = local65.anInt55;
							this.anInt916++;
						}
						if (local65.anInt69 == 5 && arg0 >= local70 && arg2 >= local75 && arg0 < local70 + local65.anInt66 && arg2 < local75 + local65.anInt44) {
							this.aStringArray10[this.anInt916] = local65.aString6;
							this.anIntArray270[this.anInt916] = 707;
							this.anIntArray269[this.anInt916] = local65.anInt55;
							this.anInt916++;
						}
						if (local65.anInt69 == 6 && !this.aBoolean198 && arg0 >= local70 && arg2 >= local75 && arg0 < local70 + local65.anInt66 && arg2 < local75 + local65.anInt44) {
							this.aStringArray10[this.anInt916] = local65.aString6;
							this.anIntArray270[this.anInt916] = 83;
							this.anIntArray269[this.anInt916] = local65.anInt55;
							this.anInt916++;
						}
						if (local65.anInt48 == 2) {
							@Pc(484) int local484 = 0;
							for (@Pc(486) int local486 = 0; local486 < local65.anInt44; local486++) {
								for (@Pc(490) int local490 = 0; local490 < local65.anInt66; local490++) {
									@Pc(501) int local501 = local70 + local490 * (local65.anInt59 + 32);
									@Pc(510) int local510 = local75 + local486 * (local65.anInt72 + 32);
									if (local484 < 20) {
										local501 += local65.anIntArray9[local484];
										local510 += local65.anIntArray6[local484];
									}
									if (arg0 >= local501 && arg2 >= local510 && arg0 < local501 + 32 && arg2 < local510 + 32) {
										this.anInt1001 = local484;
										this.anInt1002 = local65.anInt55;
										if (local65.anIntArray11[local484] > 0) {
											@Pc(563) Class23 local563 = Class23.method320(local65.anIntArray11[local484] - 1);
											if (this.anInt1024 == 1 && local65.aBoolean20) {
												if (local65.anInt55 != this.anInt1026 || local484 != this.anInt1025) {
													this.aStringArray10[this.anInt916] = "Use " + this.aString30 + " with @lre@" + local563.aString13;
													this.anIntArray270[this.anInt916] = 780;
													this.anIntArray271[this.anInt916] = local563.anInt447;
													this.anIntArray268[this.anInt916] = local484;
													this.anIntArray269[this.anInt916] = local65.anInt55;
													this.anInt916++;
												}
											} else if (this.anInt872 != 1 || !local65.aBoolean20) {
												@Pc(700) int local700;
												if (local65.aBoolean20) {
													for (local700 = 4; local700 >= 3; local700--) {
														if (local563.aStringArray4 != null && local563.aStringArray4[local700] != null) {
															this.aStringArray10[this.anInt916] = local563.aStringArray4[local700] + " @lre@" + local563.aString13;
															if (local700 == 3) {
																this.anIntArray270[this.anInt916] = 86;
															}
															if (local700 == 4) {
																this.anIntArray270[this.anInt916] = 275;
															}
															this.anIntArray271[this.anInt916] = local563.anInt447;
															this.anIntArray268[this.anInt916] = local484;
															this.anIntArray269[this.anInt916] = local65.anInt55;
															this.anInt916++;
														} else if (local700 == 4) {
															this.aStringArray10[this.anInt916] = "Drop @lre@" + local563.aString13;
															this.anIntArray270[this.anInt916] = 275;
															this.anIntArray271[this.anInt916] = local563.anInt447;
															this.anIntArray268[this.anInt916] = local484;
															this.anIntArray269[this.anInt916] = local65.anInt55;
															this.anInt916++;
														}
													}
												}
												if (local65.aBoolean14) {
													this.aStringArray10[this.anInt916] = "Use @lre@" + local563.aString13;
													this.anIntArray270[this.anInt916] = 606;
													this.anIntArray271[this.anInt916] = local563.anInt447;
													this.anIntArray268[this.anInt916] = local484;
													this.anIntArray269[this.anInt916] = local65.anInt55;
													this.anInt916++;
												}
												if (local65.aBoolean20 && local563.aStringArray4 != null) {
													for (local700 = 2; local700 >= 0; local700--) {
														if (local563.aStringArray4[local700] != null) {
															this.aStringArray10[this.anInt916] = local563.aStringArray4[local700] + " @lre@" + local563.aString13;
															if (local700 == 0) {
																this.anIntArray270[this.anInt916] = 615;
															}
															if (local700 == 1) {
																this.anIntArray270[this.anInt916] = 998;
															}
															if (local700 == 2) {
																this.anIntArray270[this.anInt916] = 934;
															}
															this.anIntArray271[this.anInt916] = local563.anInt447;
															this.anIntArray268[this.anInt916] = local484;
															this.anIntArray269[this.anInt916] = local65.anInt55;
															this.anInt916++;
														}
													}
												}
												if (local65.aStringArray1 != null) {
													for (local700 = 4; local700 >= 0; local700--) {
														if (local65.aStringArray1[local700] != null) {
															this.aStringArray10[this.anInt916] = local65.aStringArray1[local700] + " @lre@" + local563.aString13;
															if (local700 == 0) {
																this.anIntArray270[this.anInt916] = 222;
															}
															if (local700 == 1) {
																this.anIntArray270[this.anInt916] = 472;
															}
															if (local700 == 2) {
																this.anIntArray270[this.anInt916] = 381;
															}
															if (local700 == 3) {
																this.anIntArray270[this.anInt916] = 628;
															}
															if (local700 == 4) {
																this.anIntArray270[this.anInt916] = 502;
															}
															this.anIntArray271[this.anInt916] = local563.anInt447;
															this.anIntArray268[this.anInt916] = local484;
															this.anIntArray269[this.anInt916] = local65.anInt55;
															this.anInt916++;
														}
													}
												}
												this.aStringArray10[this.anInt916] = "Examine @lre@" + local563.aString13;
												this.anIntArray270[this.anInt916] = 1918;
												this.anIntArray271[this.anInt916] = local563.anInt447;
												this.anIntArray268[this.anInt916] = local484;
												this.anIntArray269[this.anInt916] = local65.anInt55;
												this.anInt916++;
											} else if ((this.anInt874 & 0x10) == 16) {
												this.aStringArray10[this.anInt916] = this.aString20 + " @lre@" + local563.aString13;
												this.anIntArray270[this.anInt916] = 662;
												this.anIntArray271[this.anInt916] = local563.anInt447;
												this.anIntArray268[this.anInt916] = local484;
												this.anIntArray269[this.anInt916] = local65.anInt55;
												this.anInt916++;
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
		} catch (@Pc(1130) RuntimeException local1130) {
			signlink.reporterror("57884, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local1130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!ETSIPTYG;I)Z")
	private boolean method677(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0.anIntArray10 == null) {
				return false;
			}
			for (@Pc(6) int local6 = 0; local6 < arg0.anIntArray10.length; local6++) {
				@Pc(14) int local14 = this.method622(local6, arg0);
				@Pc(19) int local19 = arg0.anIntArray7[local6];
				if (arg0.anIntArray10[local6] == 2) {
					if (local14 >= local19) {
						return false;
					}
				} else if (arg0.anIntArray10[local6] == 3) {
					if (local14 <= local19) {
						return false;
					}
				} else if (arg0.anIntArray10[local6] == 4) {
					if (local14 == local19) {
						return false;
					}
				} else if (local14 != local19) {
					return false;
				}
			}
			@Pc(67) boolean local67 = false;
			return true;
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("77547, " + arg0 + ", " + arg1 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;II)V")
	@Override
	protected void method551(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt864 = arg1;
			this.aString24 = arg0;
			this.method619(this.aBoolean224);
			if (this.aClass27_1 == null) {
				super.method551(arg0, arg1);
			} else {
				this.aClass48_5.method503();
				this.aClass1_Sub1_Sub3_Sub2_4.method356(180, 54, "RuneScape is loading - please wait...", 16777215);
				Class1_Sub1_Sub3.method518(28, 34, 304, 62, 9179409);
				Class1_Sub1_Sub3.method518(29, 32, 302, 63, 0);
				Class1_Sub1_Sub3.method517(64, 30, arg1 * 3, 30, 9179409);
				Class1_Sub1_Sub3.method517(64, 30, 300 - arg1 * 3, arg1 * 3 + 30, 0);
				this.aClass1_Sub1_Sub3_Sub2_4.method356(180, 85, arg0, 16777215);
				this.aClass48_5.method504(super.aGraphics2, 171, 202);
				if (this.aBoolean231) {
					this.aBoolean231 = false;
					if (!this.aBoolean201) {
						this.aClass48_6.method504(super.aGraphics2, 0, 0);
						this.aClass48_7.method504(super.aGraphics2, 0, 637);
					}
					this.aClass48_3.method504(super.aGraphics2, 0, 128);
					this.aClass48_4.method504(super.aGraphics2, 371, 202);
					this.aClass48_8.method504(super.aGraphics2, 265, 0);
					this.aClass48_9.method504(super.aGraphics2, 265, 562);
					this.aClass48_10.method504(super.aGraphics2, 171, 128);
					this.aClass48_11.method504(super.aGraphics2, 171, 562);
				}
			}
		} catch (@Pc(223) RuntimeException local223) {
			signlink.reporterror("85278, " + arg0 + ", " + arg1 + ", " + -799 + ", " + local223.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!WHUVIHKW;I)V")
	private void method678(@OriginalArg(0) Class1_Sub3 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt732 == 0) {
				local1 = this.aClass11_1.method161(arg0.anInt731, arg0.anInt733, arg0.anInt734);
			}
			if (arg0.anInt732 == 1) {
				local1 = this.aClass11_1.method162(arg0.anInt734, arg0.anInt733, arg0.anInt731);
			}
			if (arg0.anInt732 == 2) {
				local1 = this.aClass11_1.method163(arg0.anInt731, arg0.anInt733, arg0.anInt734);
			}
			if (arg0.anInt732 == 3) {
				local1 = this.aClass11_1.method164(arg0.anInt731, arg0.anInt733, arg0.anInt734);
			}
			if (local1 != 0) {
				@Pc(76) int local76 = this.aClass11_1.method165(arg0.anInt731, arg0.anInt733, arg0.anInt734, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local76 & 0x1F;
				local7 = local76 >> 6;
			}
			arg0.anInt740 = local3;
			arg0.anInt742 = local5;
			arg0.anInt741 = local7;
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("65198, " + arg0 + ", " + 7 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!ETSIPTYG;)Z")
	private boolean method679(@OriginalArg(1) Class6 arg0) {
		try {
			this.anInt905 += 0;
			@Pc(10) int local10 = arg0.anInt70;
			if (this.anInt888 == 2) {
				if (local10 == 201) {
					this.aBoolean205 = true;
					this.aBoolean214 = false;
					this.aBoolean192 = true;
					this.aString19 = "";
					this.anInt936 = 1;
					this.aString29 = "Enter name of friend to add to list";
				}
				if (local10 == 202) {
					this.aBoolean205 = true;
					this.aBoolean214 = false;
					this.aBoolean192 = true;
					this.aString19 = "";
					this.anInt936 = 2;
					this.aString29 = "Enter name of friend to delete from list";
				}
			}
			if (local10 == 205) {
				this.anInt909 = 250;
				return true;
			}
			if (local10 == 501) {
				this.aBoolean205 = true;
				this.aBoolean214 = false;
				this.aBoolean192 = true;
				this.aString19 = "";
				this.anInt936 = 4;
				this.aString29 = "Enter name of player to add to list";
			}
			if (local10 == 502) {
				this.aBoolean205 = true;
				this.aBoolean214 = false;
				this.aBoolean192 = true;
				this.aString19 = "";
				this.anInt936 = 5;
				this.aString29 = "Enter name of player to delete from list";
			}
			@Pc(118) int local118;
			@Pc(122) int local122;
			@Pc(127) int local127;
			if (local10 >= 300 && local10 <= 313) {
				local118 = (local10 - 300) / 2;
				local122 = local10 & 0x1;
				local127 = this.anIntArray255[local118];
				if (local127 != -1) {
					while (true) {
						if (local122 == 0) {
							local127--;
							if (local127 < 0) {
								local127 = Class37.anInt627 - 1;
							}
						}
						if (local122 == 1) {
							local127++;
							if (local127 >= Class37.anInt627) {
								local127 = 0;
							}
						}
						if (!Class37.aClass37Array1[local127].aBoolean148 && Class37.aClass37Array1[local127].anInt628 == local118 + (this.aBoolean236 ? 0 : 7)) {
							this.anIntArray255[local118] = local127;
							this.aBoolean222 = true;
							break;
						}
					}
				}
			}
			if (local10 >= 314 && local10 <= 323) {
				local118 = (local10 - 314) / 2;
				local122 = local10 & 0x1;
				local127 = this.anIntArray264[local118];
				if (local122 == 0) {
					local127--;
					if (local127 < 0) {
						local127 = anIntArrayArray22[local118].length - 1;
					}
				}
				if (local122 == 1) {
					local127++;
					if (local127 >= anIntArrayArray22[local118].length) {
						local127 = 0;
					}
				}
				this.anIntArray264[local118] = local127;
				this.aBoolean222 = true;
			}
			if (local10 == 324 && !this.aBoolean236) {
				this.aBoolean236 = true;
				this.method587();
			}
			if (local10 == 325 && this.aBoolean236) {
				this.aBoolean236 = false;
				this.method587();
			}
			if (local10 == 326) {
				this.aClass1_Sub1_Sub2_7.method11(90);
				this.aClass1_Sub1_Sub2_7.method12(this.aBoolean236 ? 0 : 1);
				for (local118 = 0; local118 < 7; local118++) {
					this.aClass1_Sub1_Sub2_7.method12(this.anIntArray255[local118]);
				}
				for (local122 = 0; local122 < 5; local122++) {
					this.aClass1_Sub1_Sub2_7.method12(this.anIntArray264[local122]);
				}
				return true;
			}
			if (local10 == 613) {
				this.aBoolean227 = !this.aBoolean227;
			}
			if (local10 >= 601 && local10 <= 612) {
				this.method616();
				if (this.aString26.length() > 0) {
					this.aClass1_Sub1_Sub2_7.method11(118);
					this.aClass1_Sub1_Sub2_7.method18(Class31.method379(this.aString26));
					this.aClass1_Sub1_Sub2_7.method12(local10 - 601);
					this.aClass1_Sub1_Sub2_7.method12(this.aBoolean227 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(355) RuntimeException local355) {
			signlink.reporterror("2834, " + 0 + ", " + arg0 + ", " + local355.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(Z)V")
	private void method680(@OriginalArg(0) boolean arg0) {
		try {
			try {
				if (this.aClass16_1 != null) {
					this.aClass16_1.method225();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass16_1 = null;
			this.aBoolean234 = false;
			this.anInt827 = 0;
			this.aString21 = "";
			if (!arg0) {
				this.anInt880 = -225;
			}
			this.aString22 = "";
			this.method659();
			this.aClass11_1.method135();
			for (@Pc(36) int local36 = 0; local36 < 4; local36++) {
				this.aClass13Array1[local36].method205();
			}
			System.gc();
			this.method554();
			this.anInt967 = -1;
			this.anInt978 = -1;
			this.anInt853 = 0;
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("99891, " + arg0 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "N", descriptor = "(I)V")
	private void method681(@OriginalArg(0) int arg0) {
		try {
			if (this.aClass48_15 == null) {
				this.method650();
				super.aClass48_2 = null;
				this.aClass48_3 = null;
				this.aClass48_4 = null;
				this.aClass48_5 = null;
				this.aClass48_6 = null;
				this.aClass48_7 = null;
				this.aClass48_8 = null;
				this.aClass48_9 = null;
				this.aClass48_10 = null;
				this.aClass48_11 = null;
				this.aClass48_15 = new Class48(479, (byte) -48, this.method549(), 96);
				this.aClass48_13 = new Class48(172, (byte) -48, this.method549(), 156);
				Class1_Sub1_Sub3.method515();
				this.aClass1_Sub1_Sub3_Sub3_19.method473(0, 0);
				if (arg0 != anInt851) {
					aBoolean228 = !aBoolean228;
				}
				this.aClass48_12 = new Class48(190, (byte) -48, this.method549(), 261);
				this.aClass48_14 = new Class48(512, (byte) -48, this.method549(), 334);
				Class1_Sub1_Sub3.method515();
				this.aClass48_25 = new Class48(496, (byte) -48, this.method549(), 50);
				this.aClass48_26 = new Class48(269, (byte) -48, this.method549(), 37);
				this.aClass48_27 = new Class48(249, (byte) -48, this.method549(), 45);
				this.aBoolean231 = true;
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("32218, " + arg0 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!BJPWOXRJ;Z)V")
	private void method682(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub2 arg1) {
		try {
			this.anInt918 = 0;
			this.anInt960 = 0;
			this.method592(arg1, arg0);
			this.method651(arg0, arg1);
			this.method648(arg1, this.aByte33, arg0);
			@Pc(38) int local38;
			for (@Pc(31) int local31 = 0; local31 < this.anInt918; local31++) {
				local38 = this.anIntArray238[local31];
				if (this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local38].anInt571 != anInt921) {
					this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local38].aClass38_1 = null;
					this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local38] = null;
				}
			}
			if (arg1.anInt10 != arg0) {
				signlink.reporterror(this.aString21 + " size mismatch in getnpcpos - pos:" + arg1.anInt10 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local38 = 0; local38 < this.anInt863; local38++) {
				if (this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[this.anIntArray218[local38]] == null) {
					signlink.reporterror(this.aString21 + " null entry in npc list - pos:" + local38 + " size:" + this.anInt863);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("57860, " + arg0 + ", " + arg1 + ", " + false + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "O", descriptor = "(I)V")
	private void method683() {
		try {
			this.anInt905 += 0;
			for (@Pc(12) Class1_Sub1_Sub1_Sub2 local12 = (Class1_Sub1_Sub1_Sub2) this.aClass36_10.method400(); local12 != null; local12 = (Class1_Sub1_Sub1_Sub2) this.aClass36_10.method402((byte) 2)) {
				if (local12.anInt170 != this.anInt857 || anInt921 > local12.anInt161) {
					local12.method510();
				} else if (anInt921 >= local12.anInt160) {
					if (local12.anInt158 > 0) {
						@Pc(42) Class1_Sub1_Sub1_Sub3_Sub1 local42 = this.aClass1_Sub1_Sub1_Sub3_Sub1Array1[local12.anInt158 - 1];
						if (local42 != null && local42.anInt573 >= 0 && local42.anInt573 < 13312 && local42.anInt574 >= 0 && local42.anInt574 < 13312) {
							local12.method132(local42.anInt573, this.method612(local42.anInt573, 938, local42.anInt574, local12.anInt170) - local12.anInt165, anInt921, local42.anInt574);
						}
					}
					if (local12.anInt158 < 0) {
						@Pc(87) int local87 = -local12.anInt158 - 1;
						@Pc(93) Class1_Sub1_Sub1_Sub3_Sub2 local93;
						if (local87 == this.anInt818) {
							local93 = aClass1_Sub1_Sub1_Sub3_Sub2_1;
						} else {
							local93 = this.aClass1_Sub1_Sub1_Sub3_Sub2Array1[local87];
						}
						if (local93 != null && local93.anInt573 >= 0 && local93.anInt573 < 13312 && local93.anInt574 >= 0 && local93.anInt574 < 13312) {
							local12.method132(local93.anInt573, this.method612(local93.anInt573, 938, local93.anInt574, local12.anInt170) - local12.anInt165, anInt921, local93.anInt574);
						}
					}
					local12.method133(this.anInt819);
					this.aClass11_1.method146(60, local12, this.anInt857, -1, (int) local12.aDouble8, local12.anInt166, (int) local12.aDouble6, (int) local12.aDouble7, false);
				}
			}
		} catch (@Pc(173) RuntimeException local173) {
			signlink.reporterror("88988, " + 0 + ", " + local173.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method684(@OriginalArg(0) int arg0) {
		try {
			@Pc(10) Class6 local10 = Class6.aClass6Array1[arg0];
			for (@Pc(12) int local12 = 0; local12 < local10.anIntArray13.length && local10.anIntArray13[local12] != -1; local12++) {
				@Pc(27) Class6 local27 = Class6.aClass6Array1[local10.anIntArray13[local12]];
				if (local27.anInt48 == 1) {
					this.method684(local27.anInt55);
				}
				local27.anInt47 = 0;
				local27.anInt45 = 0;
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("27520, " + arg0 + ", " + 0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIIIIIII)V")
	private void method685(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (this.aByte44 != 48) {
				this.anInt944 = -80;
			}
			if (arg1 >= 1 && arg5 >= 1 && arg1 <= 102 && arg5 <= 102) {
				if (aBoolean230 && arg3 != this.anInt857) {
					return;
				}
				@Pc(27) int local27 = 0;
				if (arg4 == 0) {
					local27 = this.aClass11_1.method161(arg3, arg1, arg5);
				}
				if (arg4 == 1) {
					local27 = this.aClass11_1.method162(arg5, arg1, arg3);
				}
				if (arg4 == 2) {
					local27 = this.aClass11_1.method163(arg3, arg1, arg5);
				}
				if (arg4 == 3) {
					local27 = this.aClass11_1.method164(arg3, arg1, arg5);
				}
				@Pc(83) int local83;
				if (local27 != 0) {
					local83 = this.aClass11_1.method165(arg3, arg1, arg5, local27);
					@Pc(89) int local89 = local27 >> 14 & 0x7FFF;
					@Pc(93) int local93 = local83 & 0x1F;
					@Pc(97) int local97 = local83 >> 6;
					@Pc(109) Class22 local109;
					if (arg4 == 0) {
						this.aClass11_1.method152(arg5, arg3, arg1);
						local109 = Class22.method312(local89);
						if (local109.aBoolean104) {
							this.aClass13Array1[arg3].method210(arg1, local109.aBoolean105, arg5, local97, local93);
						}
					}
					if (arg4 == 1) {
						this.aClass11_1.method153(arg3, arg5, arg1);
					}
					if (arg4 == 2) {
						this.aClass11_1.method154(arg5, arg3, arg1);
						local109 = Class22.method312(local89);
						if (arg1 + local109.anInt416 > 103 || arg5 + local109.anInt416 > 103 || arg1 + local109.anInt429 > 103 || arg5 + local109.anInt429 > 103) {
							return;
						}
						if (local109.aBoolean104) {
							this.aClass13Array1[arg3].method211(arg1, local109.anInt429, local109.anInt416, arg5, local97, local109.aBoolean105);
						}
					}
					if (arg4 == 3) {
						this.aClass11_1.method155(arg3, arg1, arg5);
						local109 = Class22.method312(local89);
						if (local109.aBoolean104 && local109.aBoolean102) {
							this.aClass13Array1[arg3].method213(arg1, arg5);
						}
					}
				}
				if (arg6 >= 0) {
					local83 = arg3;
					if (arg3 < 3 && (this.aByteArrayArrayArray8[1][arg1][arg5] & 0x2) == 2) {
						local83 = arg3 + 1;
					}
					Class39.method438(arg0, arg1, arg2, this.aClass13Array1[arg3], arg6, arg3, arg5, this.anIntArrayArrayArray7, this.aClass11_1, local83);
					return;
				}
			}
		} catch (@Pc(256) RuntimeException local256) {
			signlink.reporterror("6013, " + 48 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local256.toString());
			throw new RuntimeException();
		}
	}
}
