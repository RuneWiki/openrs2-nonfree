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

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	private static int anInt841;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
	private static int anInt866;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
	private static int anInt881;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "Z")
	private static boolean aBoolean198;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
	private static int anInt920;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
	private static int anInt936;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "Z")
	private static boolean aBoolean202;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private static int anInt945;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "I")
	public static int anInt956;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "Z")
	private static boolean aBoolean205;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "I")
	private static int anInt961;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "I")
	private static int anInt970;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "I")
	private static int anInt972;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "I")
	private static int anInt996;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "Z")
	private static boolean aBoolean209;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "Z")
	private static boolean aBoolean211;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "I")
	private static int anInt1006;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "I")
	public static int anInt1007;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
	private static int anInt1014;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "Lclient!BSQIIHOT;")
	public static Class1_Sub1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "Z")
	private static boolean aBoolean218;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "Z")
	private static boolean aBoolean221;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
	private static int anInt1036;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "I")
	private static int anInt831 = 22535;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "B")
	private static byte aByte27 = 8;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
	private static int anInt955 = 10;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "Z")
	private static boolean aBoolean204 = true;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "[I")
	private static int[] anIntArray235 = new int[99];

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "[I")
	public static int[] anIntArray236;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "B")
	private static byte aByte32;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "I")
	private static int anInt974;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "[I")
	public static final int[] anIntArray250;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "Ljava/lang/String;")
	private static String aString29;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "[[I")
	public static final int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "Z")
	private static boolean aBoolean216;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "B")
	private static byte aByte36;

	@OriginalMember(owner = "client!client", name = "J", descriptor = "I")
	private int anInt825;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "I")
	private int anInt827;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "I")
	private int anInt828;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "I")
	private int anInt829;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "Lclient!ESGPTMPA;")
	private Class8 aClass8_3;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "Lclient!ESGPTMPA;")
	private Class8 aClass8_4;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "Lclient!ESGPTMPA;")
	private Class8 aClass8_5;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "Lclient!ESGPTMPA;")
	private Class8 aClass8_6;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Lclient!ESGPTMPA;")
	private Class8 aClass8_7;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "Lclient!ESGPTMPA;")
	private Class8 aClass8_8;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!ESGPTMPA;")
	private Class8 aClass8_9;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Lclient!ESGPTMPA;")
	private Class8 aClass8_10;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Lclient!ESGPTMPA;")
	private Class8 aClass8_11;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "I")
	private int anInt832;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	private int anInt836;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	private int anInt837;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
	private int anInt838;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
	private int anInt840;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
	private int anInt842;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	private int anInt843;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
	private int anInt846;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "Lclient!BNGXLHWA;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "Lclient!BNGXLHWA;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "Lclient!BNGXLHWA;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "Lclient!BNGXLHWA;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "Lclient!BNGXLHWA;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
	private int anInt847;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
	private int anInt848;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "I")
	private int anInt849;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
	private int anInt850;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private int anInt851;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "Lclient!BNGXLHWA;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_6;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "Lclient!BNGXLHWA;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_7;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private int anInt852;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
	private int anInt853;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "I")
	private int anInt854;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
	private int anInt855;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
	private int anInt856;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
	private int anInt857;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
	private int anInt858;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "Lclient!BNGXLHWA;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_8;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "Lclient!BNGXLHWA;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_9;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "Lclient!BNGXLHWA;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_10;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "Lclient!QIAMMSTQ;")
	private Class32 aClass32_2;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "I")
	private int anInt861;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "Lclient!AWMLZOXZ;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_2;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "Lclient!AWMLZOXZ;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_3;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "Lclient!AWMLZOXZ;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_4;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "Lclient!AWMLZOXZ;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_5;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "Lclient!IBHUFTPE;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "Lclient!IBHUFTPE;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "I")
	private int anInt862;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
	private int anInt864;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "Lclient!ESGPTMPA;")
	private Class8 aClass8_12;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "Lclient!ESGPTMPA;")
	private Class8 aClass8_13;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "Lclient!ESGPTMPA;")
	private Class8 aClass8_14;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "Lclient!ESGPTMPA;")
	private Class8 aClass8_15;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "Lclient!ESGPTMPA;")
	private Class8 aClass8_16;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "Lclient!ESGPTMPA;")
	private Class8 aClass8_17;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "Lclient!ESGPTMPA;")
	private Class8 aClass8_18;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "Lclient!ESGPTMPA;")
	private Class8 aClass8_19;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "Lclient!ESGPTMPA;")
	private Class8 aClass8_20;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
	private int anInt868;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
	private int anInt869;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
	private int anInt870;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
	private int anInt871;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "Ljava/lang/String;")
	private String aString17;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
	private int anInt873;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
	private int anInt874;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
	private int anInt876;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "[I")
	private int[] anIntArray216;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "[I")
	private int[] anIntArray217;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "[I")
	private int[] anIntArray218;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
	private int anInt878;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "I")
	private int anInt879;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
	private int anInt880;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "I")
	private int anInt882;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
	private int anInt883;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "I")
	private int anInt885;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "I")
	private int anInt889;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
	private int anInt890;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "I")
	private int anInt891;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
	private int anInt892;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "[I")
	private int[] anIntArray223;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "[I")
	private int[] anIntArray224;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
	private int anInt894;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
	private int anInt895;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "I")
	private int anInt896;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "I")
	private int anInt897;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "I")
	private int anInt899;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "I")
	private int anInt900;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "Ljava/lang/String;")
	private String aString20;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "I")
	private int anInt902;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "Ljava/lang/String;")
	private String aString21;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
	private int anInt903;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
	private int anInt904;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
	private int anInt905;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "I")
	private int anInt906;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
	private int anInt907;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "I")
	private int anInt908;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "I")
	private int anInt909;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "Lclient!YNDLJDLS;")
	private Class48 aClass48_1;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
	private int anInt911;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
	private int anInt912;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
	private int anInt913;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "I")
	private int anInt914;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "I")
	private int anInt915;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "I")
	private int anInt916;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
	private int anInt917;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "I")
	private int anInt918;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "I")
	private int anInt919;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
	private int anInt921;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
	private int anInt922;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
	private int anInt923;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "I")
	private int anInt924;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "I")
	private int anInt925;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
	private int anInt927;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
	private int anInt929;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
	private int anInt930;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "Lclient!IBHUFTPE;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
	private int anInt940;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private int anInt942;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
	private int anInt943;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private int anInt944;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "I")
	private int anInt946;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "I")
	private int anInt947;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
	private int anInt948;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
	private int anInt951;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
	private int anInt954;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "Lclient!IBHUFTPE;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_6;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "Lclient!IBHUFTPE;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_7;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "Lclient!IBHUFTPE;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_8;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "Lclient!ESGPTMPA;")
	private Class8 aClass8_21;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "Lclient!ESGPTMPA;")
	private Class8 aClass8_22;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "Lclient!ESGPTMPA;")
	private Class8 aClass8_23;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
	private int anInt960;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "I")
	private int anInt962;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
	private int anInt963;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "Ljava/lang/String;")
	private String aString24;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "Lclient!IBHUFTPE;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_9;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
	private int anInt967;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "I")
	private int anInt969;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "Lclient!TYRTFBBQ;")
	private Class43 aClass43_1;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "I")
	private int anInt976;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
	private int anInt978;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
	private int anInt980;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
	private int anInt981;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private int anInt982;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "Lclient!RKMPVAZH;")
	private Class28_Sub1 aClass28_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
	private int anInt985;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
	private int anInt986;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
	private int anInt987;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
	private int anInt988;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
	private int anInt989;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "I")
	private int anInt990;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "I")
	private int anInt993;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
	private int anInt994;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "Lclient!JFQWYHZJ;")
	private Class18 aClass18_1;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
	private int anInt995;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "Lclient!ESGPTMPA;")
	private Class8 aClass8_24;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "Lclient!ESGPTMPA;")
	private Class8 aClass8_25;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "Lclient!ESGPTMPA;")
	private Class8 aClass8_26;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "Lclient!ESGPTMPA;")
	private Class8 aClass8_27;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "I")
	private int anInt997;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "I")
	private int anInt998;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "I")
	private int anInt1001;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
	private int anInt1003;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "Lclient!BNGXLHWA;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_11;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "Lclient!BNGXLHWA;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_12;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "Lclient!BNGXLHWA;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_13;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
	private int anInt1004;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "I")
	private int anInt1008;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
	private int anInt1011;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
	private int anInt1012;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "I")
	private int anInt1013;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "[Lclient!BNGXLHWA;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array5;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "[I")
	private int[] anIntArray254;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "[I")
	private int[] anIntArray255;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "[I")
	private int[] anIntArray256;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "[I")
	private int[] anIntArray257;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
	private int anInt1015;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
	private int anInt1017;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private int anInt1018;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
	private int anInt1019;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "I")
	private int anInt1020;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
	private int anInt1021;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "Lclient!BNGXLHWA;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_14;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "Lclient!BNGXLHWA;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_15;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
	private int anInt1022;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
	private int anInt1023;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "Lclient!BNGXLHWA;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_16;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "Lclient!BNGXLHWA;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_17;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "Lclient!BNGXLHWA;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_18;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "Lclient!BNGXLHWA;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_19;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "Lclient!BNGXLHWA;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_20;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
	private int anInt1025;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "I")
	private int anInt1026;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
	private int anInt1027;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
	private int anInt1029;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
	private int anInt1030;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
	private int anInt1031;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private int anInt1032;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "I")
	private int anInt1033;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "I")
	private int anInt1034;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "[I")
	private int[] anIntArray262;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "[I")
	private int[] anIntArray263;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "[I")
	private int[] anIntArray267;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "[I")
	private int[] anIntArray268;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "[I")
	private int[] anIntArray269;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "[I")
	private int[] anIntArray270;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "I")
	private int anInt1035;

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "I")
	private int anInt1041;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "I")
	private int anInt1042;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "I")
	private int anInt1043;

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "I")
	private int anInt1044;

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "Lclient!IBHUFTPE;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_10;

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "Lclient!IBHUFTPE;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_11;

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "Rj", descriptor = "I")
	private int anInt1045;

	@OriginalMember(owner = "client!client", name = "Tj", descriptor = "Lclient!IEMHZJLX;")
	private Class15 aClass15_2;

	@OriginalMember(owner = "client!client", name = "Uj", descriptor = "I")
	private int anInt1046;

	@OriginalMember(owner = "client!client", name = "Vj", descriptor = "I")
	private int anInt1047;

	@OriginalMember(owner = "client!client", name = "Wj", descriptor = "I")
	private int anInt1048;

	@OriginalMember(owner = "client!client", name = "Xj", descriptor = "I")
	private int anInt1049;

	@OriginalMember(owner = "client!client", name = "Yj", descriptor = "Lclient!IBHUFTPE;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_12;

	@OriginalMember(owner = "client!client", name = "Zj", descriptor = "I")
	private int anInt1050;

	@OriginalMember(owner = "client!client", name = "ak", descriptor = "Lclient!IBHUFTPE;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_13;

	@OriginalMember(owner = "client!client", name = "bk", descriptor = "Lclient!IBHUFTPE;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_14;

	@OriginalMember(owner = "client!client", name = "ck", descriptor = "Lclient!IBHUFTPE;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_15;

	@OriginalMember(owner = "client!client", name = "dk", descriptor = "Lclient!IBHUFTPE;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_16;

	@OriginalMember(owner = "client!client", name = "ek", descriptor = "Lclient!IBHUFTPE;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_17;

	@OriginalMember(owner = "client!client", name = "ik", descriptor = "I")
	private int anInt1052;

	@OriginalMember(owner = "client!client", name = "lk", descriptor = "I")
	private int anInt1055;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "[Lclient!IBHUFTPE;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array4 = new Class1_Sub1_Sub2_Sub3[32];

	@OriginalMember(owner = "client!client", name = "L", descriptor = "I")
	private int anInt826 = -1;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
	private int anInt830 = 9764;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "B")
	private byte aByte26 = 90;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Z")
	private volatile boolean aBoolean180 = false;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
	private int anInt833 = 2;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Z")
	private boolean aBoolean181 = false;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
	private int anInt834 = 2048;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	private int anInt835 = 2047;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "[Lclient!BSQIIHOT;")
	private Class1_Sub1_Sub1_Sub1_Sub2[] aClass1_Sub1_Sub1_Sub1_Sub2Array1 = new Class1_Sub1_Sub1_Sub1_Sub2[this.anInt834];

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "[I")
	private int[] anIntArray212 = new int[this.anInt834];

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "[I")
	private int[] anIntArray213 = new int[this.anInt834];

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "[Lclient!MVHXDWGI;")
	private Class1_Sub1_Sub4[] aClass1_Sub1_Sub4Array1 = new Class1_Sub1_Sub4[this.anInt834];

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "[I")
	private int[] anIntArray214 = new int[Class50.anInt803];

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
	private int anInt839 = 35446;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "[I")
	private int[] anIntArray215 = new int[200];

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
	private int anInt844 = 3;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
	private int anInt845 = 394;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "Z")
	private boolean aBoolean182 = false;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "[Lclient!IBHUFTPE;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array5 = new Class1_Sub1_Sub2_Sub3[100];

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "Z")
	private boolean aBoolean183 = true;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "Z")
	private boolean aBoolean184 = true;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "Lclient!IHMCQRZY;")
	private Class16 aClass16_10 = new Class16(aBoolean218);

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "Z")
	private volatile boolean aBoolean185 = false;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
	private int anInt859 = -30964;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "Z")
	private boolean aBoolean186 = false;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt860 = -1;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "Z")
	private boolean aBoolean187 = true;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "Z")
	public boolean aBoolean188 = false;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
	private int anInt863 = 8;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "I")
	private int anInt865 = 7759444;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "Z")
	private boolean aBoolean189 = false;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
	private int anInt867 = -1;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "Z")
	private boolean aBoolean190 = false;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "Z")
	private boolean aBoolean191 = false;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
	private int anInt875 = 653;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "[J")
	private long[] aLongArray4 = new long[200];

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "Ljava/lang/String;")
	private String aString18 = "";

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
	private int anInt877 = 1;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "Z")
	private boolean aBoolean192 = false;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "Lclient!MVHXDWGI;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_6 = Class1_Sub1_Sub4.method282((byte) 7);

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "[I")
	private int[] anIntArray219 = new int[1000];

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "Z")
	private boolean aBoolean193 = false;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "B")
	private byte aByte28 = -18;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "Z")
	private boolean aBoolean194 = false;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "[I")
	private int[] anIntArray220 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
	private int anInt886 = 6;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
	private int anInt888 = 2;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "B")
	private byte aByte29 = -58;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "Ljava/lang/String;")
	private String aString19 = "";

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[100];

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "[I")
	private int[] anIntArray221 = new int[100];

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "Z")
	private boolean aBoolean195 = false;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "[I")
	private int[] anIntArray222 = new int[151];

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
	private int anInt893 = 307;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "Z")
	private boolean aBoolean196 = false;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "[I")
	private int[] anIntArray225 = new int[9];

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "Z")
	private boolean aBoolean197 = false;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "[I")
	private int[] anIntArray226 = new int[5];

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "Lclient!IHMCQRZY;")
	private Class16 aClass16_11 = new Class16(aBoolean218);

	@OriginalMember(owner = "client!client", name = "he", descriptor = "I")
	private int anInt910 = 3353893;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "Z")
	private boolean aBoolean199 = false;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "[I")
	private int[] anIntArray227 = new int[1000];

	@OriginalMember(owner = "client!client", name = "me", descriptor = "[I")
	private int[] anIntArray228 = new int[1000];

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "[Lclient!LQLHEUAQ;")
	private Class22[] aClass22Array1 = new Class22[4];

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "Z")
	private boolean aBoolean200 = false;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "[I")
	private int[] anIntArray229 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "[I")
	private int[] anIntArray230 = new int[33];

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "Ljava/lang/String;")
	private String aString22 = "";

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "[[I")
	private int[][] anIntArrayArray22 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
	private int anInt932 = 78;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "Ljava/lang/String;")
	private String aString23 = "";

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
	private int anInt934 = 6;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "Z")
	private boolean aBoolean201 = true;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "[I")
	private int[] anIntArray231 = new int[5];

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "[I")
	private int[] anIntArray232 = new int[50];

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "[Lclient!IBHUFTPE;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array6 = new Class1_Sub1_Sub2_Sub3[20];

	@OriginalMember(owner = "client!client", name = "We", descriptor = "I")
	private int anInt935 = -1;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private int anInt937 = -1;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "I")
	private int anInt939 = 4;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "I")
	private int anInt941 = -208;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "[Lclient!BNGXLHWA;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array2 = new Class1_Sub1_Sub2_Sub2[13];

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "[Lclient!QQNRPAWO;")
	public Class34[] aClass34Array1 = new Class34[5];

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "B")
	private byte aByte30 = -114;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "I")
	private int anInt952 = -1;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "[I")
	private int[] anIntArray233 = new int[50];

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "Z")
	private boolean aBoolean203 = true;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
	private int anInt957 = -1;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "I")
	private int anInt958 = 156;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "Z")
	private volatile boolean aBoolean206 = false;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "[Lclient!IBHUFTPE;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array7 = new Class1_Sub1_Sub2_Sub3[32];

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "Lclient!IHMCQRZY;")
	private Class16 aClass16_12 = new Class16(aBoolean218);

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "[Lclient!BNGXLHWA;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array3 = new Class1_Sub1_Sub2_Sub2[2];

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "[I")
	private int[] anIntArray234 = new int[50];

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
	private int anInt959 = 3;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "B")
	private byte aByte31 = 8;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[5];

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "[Lclient!BNGXLHWA;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array4 = new Class1_Sub1_Sub2_Sub2[100];

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "Lclient!MVHXDWGI;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_7 = Class1_Sub1_Sub4.method282((byte) 7);

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "Z")
	private boolean aBoolean207 = false;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "[Lclient!IBHUFTPE;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array8 = new Class1_Sub1_Sub2_Sub3[32];

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
	private int anInt966 = 16892;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
	private int anInt968 = 1;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "Z")
	private boolean aBoolean208 = true;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
	private int anInt971 = 3;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "[[[Lclient!IHMCQRZY;")
	private Class16[][][] aClass16ArrayArrayArray1 = new Class16[4][104][104];

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[500];

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "Lclient!MVHXDWGI;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_8 = Class1_Sub1_Sub4.method282((byte) 7);

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
	private int anInt975 = 128;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
	private int anInt979 = -1;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "[I")
	private int[] anIntArray237 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
	private int anInt991 = 2;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
	private int anInt992 = -1;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "[Lclient!IBHUFTPE;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array9 = new Class1_Sub1_Sub2_Sub3[1000];

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "[Lclient!IBHUFTPE;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array10 = new Class1_Sub1_Sub2_Sub3[8];

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "Ljava/lang/String;")
	private String aString25 = "";

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "Ljava/lang/String;")
	private String aString26 = "";

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "[I")
	private int[] anIntArray238 = new int[500];

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "[I")
	private int[] anIntArray239 = new int[500];

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "[I")
	private int[] anIntArray240 = new int[500];

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "[I")
	private int[] anIntArray241 = new int[500];

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "I")
	private int anInt999 = -1;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "I")
	private int anInt1000 = -1;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "[I")
	private final int[] anIntArray242 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "I")
	private int anInt1002 = 50;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "[I")
	private int[] anIntArray243 = new int[this.anInt1002];

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "[I")
	private int[] anIntArray244 = new int[this.anInt1002];

	@OriginalMember(owner = "client!client", name = "th", descriptor = "[I")
	private int[] anIntArray245 = new int[this.anInt1002];

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "[I")
	private int[] anIntArray246 = new int[this.anInt1002];

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "[I")
	private int[] anIntArray247 = new int[this.anInt1002];

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "[I")
	private int[] anIntArray248 = new int[this.anInt1002];

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "[I")
	private int[] anIntArray249 = new int[this.anInt1002];

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[this.anInt1002];

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "[[I")
	private int[][] anIntArrayArray23 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "Ljava/lang/String;")
	private String aString27 = "";

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "Ljava/lang/String;")
	private String aString28 = "";

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "Lclient!MYGSUHVG;")
	private Class27 aClass27_1 = new Class27();

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "Z")
	private boolean aBoolean210 = true;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
	private int anInt1005 = 2301979;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "Z")
	private boolean aBoolean212 = true;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "Z")
	private boolean aBoolean213 = false;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "[I")
	private int[] anIntArray251 = new int[256];

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "[I")
	private int[] anIntArray252 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "[I")
	private int[] anIntArray253 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "I")
	private int anInt1010 = -1;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "B")
	private byte aByte33 = 2;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "Z")
	private boolean aBoolean214 = true;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
	private int anInt1016 = -17648;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "Z")
	private boolean aBoolean215 = false;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "[I")
	public int[] anIntArray258 = new int[2000];

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "[I")
	private int[] anIntArray259 = new int[151];

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "B")
	private byte aByte34 = 1;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
	private final int anInt1024 = 100;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "[I")
	private int[] anIntArray260 = new int[100];

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "[I")
	private int[] anIntArray261 = new int[5];

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "Z")
	private boolean aBoolean217 = false;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "B")
	private byte aByte35 = 1;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "[I")
	private int[] anIntArray264 = new int[Class50.anInt803];

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "[I")
	private int[] anIntArray265 = new int[Class50.anInt803];

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "[I")
	private int[] anIntArray266 = new int[5];

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "Z")
	private boolean aBoolean219 = false;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "Z")
	private boolean aBoolean220 = false;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
	private int anInt1037 = -1;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
	private int anInt1038 = -1;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
	private int anInt1039 = 5063219;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "[I")
	private int[] anIntArray271 = new int[7];

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "Z")
	private boolean aBoolean222 = false;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "I")
	private int anInt1040 = -1;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "[I")
	private int[] anIntArray272 = new int[33];

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[200];

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "Ljava/lang/String;")
	private String aString30 = "";

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "[I")
	private int[] anIntArray273 = new int[100];

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[100];

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray14 = new String[100];

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "B")
	private byte aByte37 = 6;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "Z")
	private boolean aBoolean223 = false;

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "Z")
	private boolean aBoolean224 = false;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "B")
	private byte aByte38 = 8;

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "Ljava/lang/String;")
	private String aString31 = "";

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "client!client", name = "Pj", descriptor = "Lclient!MVHXDWGI;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_9 = new Class1_Sub1_Sub4(0, new byte[5000]);

	@OriginalMember(owner = "client!client", name = "Qj", descriptor = "[Lclient!ACKJULTZ;")
	private Class1_Sub1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1_Sub1Array1 = new Class1_Sub1_Sub1_Sub1_Sub1[16384];

	@OriginalMember(owner = "client!client", name = "Sj", descriptor = "[I")
	private int[] anIntArray274 = new int[16384];

	@OriginalMember(owner = "client!client", name = "fk", descriptor = "[I")
	private int[] anIntArray275 = new int[5];

	@OriginalMember(owner = "client!client", name = "gk", descriptor = "I")
	private int anInt1051 = 632;

	@OriginalMember(owner = "client!client", name = "hk", descriptor = "[I")
	private int[] anIntArray276 = new int[] { 17, 24, 34, 40 };

	@OriginalMember(owner = "client!client", name = "jk", descriptor = "I")
	private int anInt1053 = -33142;

	@OriginalMember(owner = "client!client", name = "kk", descriptor = "I")
	private int anInt1054 = -1;

	static {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14;
		for (local14 = 0; local14 < 99; local14++) {
			@Pc(19) int local19 = local14 + 1;
			@Pc(32) int local32 = (int) ((double) local19 + Math.pow(2.0D, (double) local19 / 7.0D) * 300.0D);
			local12 += local32;
			anIntArray235[local14] = local12 / 4;
		}
		anIntArray236 = new int[32];
		local12 = 2;
		for (local14 = 0; local14 < 32; local14++) {
			anIntArray236[local14] = local12 - 1;
			local12 += local12;
		}
		aByte32 = 7;
		anInt974 = 625;
		aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		anIntArray250 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		aString29 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		anIntArrayArray24 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		aBoolean216 = true;
		aByte36 = 9;
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 365);
			if (arg0.length == 5) {
				anInt955 = Integer.parseInt(arg0[0]);
				anInt956 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method697();
				} else if (arg0[2].equals("highmem")) {
					method678();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean204 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean204 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt1058 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method574((byte) 7);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private static void method678() {
		try {
			Class18.aBoolean80 = false;
			Class1_Sub1_Sub2_Sub4.aBoolean162 = false;
			aBoolean205 = false;
			Class39.aBoolean150 = false;
			Class5.aBoolean41 = false;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("63156, " + 0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZII)Ljava/lang/String;")
	private static String method689(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (!arg0) {
				anInt974 = -343;
			}
			@Pc(7) int local7 = arg2 - arg1;
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
			signlink.reporterror("74176, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
	private static void method697() {
		try {
			Class18.aBoolean80 = true;
			Class1_Sub1_Sub2_Sub4.aBoolean162 = true;
			aBoolean205 = true;
			Class39.aBoolean150 = true;
			Class5.aBoolean41 = true;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("56551, " + true + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(II)Ljava/lang/String;")
	private static String method712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 <= 0) {
				throw new NullPointerException();
			} else if (arg1 < 100000) {
				return String.valueOf(arg1);
			} else if (arg1 < 10000000) {
				return arg1 / 1000 + "K";
			} else {
				return arg1 / 1000000 + "M";
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("1023, " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(II)Ljava/lang/String;")
	private static String method720(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) String local4 = String.valueOf(arg0);
			for (@Pc(17) int local17 = local4.length() - 3; local17 > 0; local17 -= 3) {
				local4 = local4.substring(0, local17) + "," + local4.substring(local17);
			}
			if (local4.length() > 8) {
				local4 = "@gre@" + local4.substring(0, local4.length() - 8) + " million @whi@(" + local4 + ")";
			} else if (local4.length() > 4) {
				local4 = "@cya@" + local4.substring(0, local4.length() - 4) + "K @whi@(" + local4 + ")";
			}
			return " " + local4;
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("4698, " + -563 + ", " + arg0 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	private void method587() {
		try {
			@Pc(6) int local6 = this.anInt853 * 128 + 64;
			@Pc(13) int local13 = this.anInt854 * 128 + 64;
			@Pc(24) int local24 = this.method607(local13, local6, this.anInt995) - this.anInt855;
			if (this.anInt863 != 8) {
				anInt831 = 86;
			}
			if (this.anInt946 < local6) {
				this.anInt946 += this.anInt856 + (local6 - this.anInt946) * this.anInt857 / 1000;
				if (this.anInt946 > local6) {
					this.anInt946 = local6;
				}
			}
			if (this.anInt946 > local6) {
				this.anInt946 -= this.anInt856 + (this.anInt946 - local6) * this.anInt857 / 1000;
				if (this.anInt946 < local6) {
					this.anInt946 = local6;
				}
			}
			if (this.anInt947 < local24) {
				this.anInt947 += this.anInt856 + (local24 - this.anInt947) * this.anInt857 / 1000;
				if (this.anInt947 > local24) {
					this.anInt947 = local24;
				}
			}
			if (this.anInt947 > local24) {
				this.anInt947 -= this.anInt856 + (this.anInt947 - local24) * this.anInt857 / 1000;
				if (this.anInt947 < local24) {
					this.anInt947 = local24;
				}
			}
			if (this.anInt948 < local13) {
				this.anInt948 += this.anInt856 + (local13 - this.anInt948) * this.anInt857 / 1000;
				if (this.anInt948 > local13) {
					this.anInt948 = local13;
				}
			}
			if (this.anInt948 > local13) {
				this.anInt948 -= this.anInt856 + (this.anInt948 - local13) * this.anInt857 / 1000;
				if (this.anInt948 < local13) {
					this.anInt948 = local13;
				}
			}
			local6 = this.anInt1017 * 128 + 64;
			local13 = this.anInt1018 * 128 + 64;
			local24 = this.method607(local13, local6, this.anInt995) - this.anInt1019;
			@Pc(228) int local228 = local6 - this.anInt946;
			@Pc(233) int local233 = local24 - this.anInt947;
			@Pc(238) int local238 = local13 - this.anInt948;
			@Pc(249) int local249 = (int) Math.sqrt((double) (local228 * local228 + local238 * local238));
			@Pc(260) int local260 = (int) (Math.atan2((double) local233, (double) local249) * 325.949D) & 0x7FF;
			@Pc(271) int local271 = (int) (Math.atan2((double) local228, (double) local238) * -325.949D) & 0x7FF;
			if (local260 < 128) {
				local260 = 128;
			}
			if (local260 > 383) {
				local260 = 383;
			}
			if (this.anInt949 < local260) {
				this.anInt949 += this.anInt1020 + (local260 - this.anInt949) * this.anInt1021 / 1000;
				if (this.anInt949 > local260) {
					this.anInt949 = local260;
				}
			}
			if (this.anInt949 > local260) {
				this.anInt949 -= this.anInt1020 + (this.anInt949 - local260) * this.anInt1021 / 1000;
				if (this.anInt949 < local260) {
					this.anInt949 = local260;
				}
			}
			@Pc(342) int local342 = local271 - this.anInt950;
			if (local342 > 1024) {
				local342 -= 2048;
			}
			if (local342 < -1024) {
				local342 += 2048;
			}
			if (local342 > 0) {
				this.anInt950 += this.anInt1020 + local342 * this.anInt1021 / 1000;
				this.anInt950 &= 0x7FF;
			}
			if (local342 < 0) {
				this.anInt950 -= this.anInt1020 + -local342 * this.anInt1021 / 1000;
				this.anInt950 &= 0x7FF;
			}
			@Pc(400) int local400 = local271 - this.anInt950;
			if (local400 > 1024) {
				local400 -= 2048;
			}
			if (local400 < -1024) {
				local400 += 2048;
			}
			if (local400 < 0 && local342 > 0 || local400 > 0 && local342 < 0) {
				this.anInt950 = local271;
			}
		} catch (@Pc(421) RuntimeException local421) {
			signlink.reporterror("33834, " + 8 + ", " + local421.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!BSQIIHOT;BIII)V")
	private void method588(@OriginalArg(0) Class1_Sub1_Sub1_Sub1_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 != aClass1_Sub1_Sub1_Sub1_Sub2_1 && this.anInt885 < 400) {
				@Pc(41) String local41;
				if (arg0.anInt253 == 0) {
					local41 = arg0.aString5 + method689(this.aBoolean212, arg0.anInt251, aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt251) + " (level-" + arg0.anInt251 + ")";
				} else {
					local41 = arg0.aString5 + " (skill-" + arg0.anInt253 + ")";
				}
				@Pc(171) int local171;
				if (this.anInt868 == 1) {
					this.aStringArray10[this.anInt885] = "Use " + this.aString17 + " with @whi@" + local41;
					this.anIntArray240[this.anInt885] = 567;
					this.anIntArray241[this.anInt885] = arg2;
					this.anIntArray238[this.anInt885] = arg1;
					this.anIntArray239[this.anInt885] = arg3;
					this.anInt885++;
				} else if (this.anInt963 != 1) {
					for (local171 = 4; local171 >= 0; local171--) {
						if (this.aStringArray9[local171] != null) {
							this.aStringArray10[this.anInt885] = this.aStringArray9[local171] + " @whi@" + local41;
							@Pc(198) short local198 = 0;
							if (this.aStringArray9[local171].equalsIgnoreCase("attack")) {
								if (arg0.anInt251 > aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt251) {
									local198 = 2000;
								}
								if (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt245 != 0 && arg0.anInt245 != 0) {
									if (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt245 == arg0.anInt245) {
										local198 = 2000;
									} else {
										local198 = 0;
									}
								}
							} else if (this.aBooleanArray11[local171]) {
								local198 = 2000;
							}
							if (local171 == 0) {
								this.anIntArray240[this.anInt885] = local198 + 314;
							}
							if (local171 == 1) {
								this.anIntArray240[this.anInt885] = local198 + 274;
							}
							if (local171 == 2) {
								this.anIntArray240[this.anInt885] = local198 + 369;
							}
							if (local171 == 3) {
								this.anIntArray240[this.anInt885] = local198 + 191;
							}
							if (local171 == 4) {
								this.anIntArray240[this.anInt885] = local198 + 48;
							}
							this.anIntArray241[this.anInt885] = arg2;
							this.anIntArray238[this.anInt885] = arg1;
							this.anIntArray239[this.anInt885] = arg3;
							this.anInt885++;
						}
					}
				} else if ((this.anInt965 & 0x8) == 8) {
					this.aStringArray10[this.anInt885] = this.aString24 + " @whi@" + local41;
					this.anIntArray240[this.anInt885] = 495;
					this.anIntArray241[this.anInt885] = arg2;
					this.anIntArray238[this.anInt885] = arg1;
					this.anIntArray239[this.anInt885] = arg3;
					this.anInt885++;
				}
				for (local171 = 0; local171 < this.anInt885; local171++) {
					if (this.anIntArray240[local171] == 2) {
						this.aStringArray10[local171] = "Walk here @whi@" + local41;
						return;
					}
				}
			}
		} catch (@Pc(348) RuntimeException local348) {
			signlink.reporterror("10726, " + arg0 + ", " + 36 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local348.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIZ)V")
	private void method589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(1) int local1 = 0;
			for (@Pc(6) int local6 = 0; local6 < 100; local6++) {
				if (this.aStringArray14[local6] != null) {
					@Pc(18) int local18 = this.anIntArray273[local6];
					@Pc(29) int local29 = this.anInt926 + 70 + 4 - local1 * 14;
					if (local29 < -20) {
						break;
					}
					@Pc(37) String local37 = this.aStringArray13[local6];
					if (local37 != null && local37.startsWith("@cr1@")) {
						local37 = local37.substring(5);
					}
					if (local37 != null && local37.startsWith("@cr2@")) {
						local37 = local37.substring(5);
					}
					if (local18 == 0) {
						local1++;
					}
					if ((local18 == 1 || local18 == 2) && (local18 == 1 || this.anInt921 == 0 || this.anInt921 == 1 && this.method612(local37))) {
						if (arg0 > local29 - 14 && arg0 <= local29 && !local37.equals(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString5)) {
							if (this.anInt980 >= 1) {
								this.aStringArray10[this.anInt885] = "Report abuse @whi@" + local37;
								this.anIntArray240[this.anInt885] = 614;
								this.anInt885++;
							}
							this.aStringArray10[this.anInt885] = "Add ignore @whi@" + local37;
							this.anIntArray240[this.anInt885] = 235;
							this.anInt885++;
							this.aStringArray10[this.anInt885] = "Add friend @whi@" + local37;
							this.anIntArray240[this.anInt885] = 87;
							this.anInt885++;
						}
						local1++;
					}
					if ((local18 == 3 || local18 == 7) && this.anInt1055 == 0 && (local18 == 7 || this.anInt892 == 0 || this.anInt892 == 1 && this.method612(local37))) {
						if (arg0 > local29 - 14 && arg0 <= local29) {
							if (this.anInt980 >= 1) {
								this.aStringArray10[this.anInt885] = "Report abuse @whi@" + local37;
								this.anIntArray240[this.anInt885] = 614;
								this.anInt885++;
							}
							this.aStringArray10[this.anInt885] = "Add ignore @whi@" + local37;
							this.anIntArray240[this.anInt885] = 235;
							this.anInt885++;
							this.aStringArray10[this.anInt885] = "Add friend @whi@" + local37;
							this.anIntArray240[this.anInt885] = 87;
							this.anInt885++;
						}
						local1++;
					}
					if (local18 == 4 && (this.anInt951 == 0 || this.anInt951 == 1 && this.method612(local37))) {
						if (arg0 > local29 - 14 && arg0 <= local29) {
							this.aStringArray10[this.anInt885] = "Accept trade @whi@" + local37;
							this.anIntArray240[this.anInt885] = 536;
							this.anInt885++;
						}
						local1++;
					}
					if ((local18 == 5 || local18 == 6) && this.anInt1055 == 0 && this.anInt892 < 2) {
						local1++;
					}
					if (local18 == 8 && (this.anInt951 == 0 || this.anInt951 == 1 && this.method612(local37))) {
						if (arg0 > local29 - 14 && arg0 <= local29) {
							this.aStringArray10[this.anInt885] = "Accept challenge @whi@" + local37;
							this.anIntArray240[this.anInt885] = 691;
							this.anInt885++;
						}
						local1++;
					}
				}
			}
		} catch (@Pc(402) RuntimeException local402) {
			signlink.reporterror("6264, " + arg0 + ", " + arg1 + ", " + false + ", " + local402.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method590() {
		try {
			if (this.aClass8_27 == null) {
				this.method673();
				super.aClass8_2 = null;
				this.aClass8_12 = null;
				this.aClass8_13 = null;
				this.aClass8_14 = null;
				this.aClass8_15 = null;
				this.aClass8_16 = null;
				this.aClass8_17 = null;
				this.aClass8_18 = null;
				this.aClass8_19 = null;
				this.aClass8_20 = null;
				this.aClass8_27 = new Class8(96, 479, this.method584(), anInt974);
				this.aClass8_25 = new Class8(156, 172, this.method584(), anInt974);
				Class1_Sub1_Sub2.method515();
				this.aClass1_Sub1_Sub2_Sub2_12.method103(0, 0);
				this.aClass8_24 = new Class8(261, 190, this.method584(), anInt974);
				this.aClass8_26 = new Class8(334, 512, this.method584(), anInt974);
				Class1_Sub1_Sub2.method515();
				this.aClass8_21 = new Class8(50, 496, this.method584(), anInt974);
				this.aClass8_22 = new Class8(37, 269, this.method584(), anInt974);
				this.aClass8_23 = new Class8(45, 249, this.method584(), anInt974);
				this.aBoolean197 = true;
				this.aClass8_26.method133();
				Class1_Sub1_Sub2_Sub4.anIntArray197 = this.anIntArray256;
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("60918, " + 0 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	private void method591() {
		try {
			anInt1014++;
			@Pc(27) int local27;
			if (anInt1014 > 1754) {
				anInt1014 = 0;
				this.aClass1_Sub1_Sub4_8.method283(41);
				this.aClass1_Sub1_Sub4_8.method284(0);
				local27 = this.aClass1_Sub1_Sub4_8.anInt529;
				this.aClass1_Sub1_Sub4_8.method284(105);
				this.aClass1_Sub1_Sub4_8.method285(61787);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub4_8.method284(216);
				}
				this.aClass1_Sub1_Sub4_8.method285(15751);
				this.aClass1_Sub1_Sub4_8.method285(46500);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub4_8.method285(56513);
				}
				this.aClass1_Sub1_Sub4_8.method285(34718);
				this.aClass1_Sub1_Sub4_8.method284(7);
				this.aClass1_Sub1_Sub4_8.method285((int) (Math.random() * 65536.0D));
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub4_8.method284(222);
				}
				this.aClass1_Sub1_Sub4_8.method293(this.aClass1_Sub1_Sub4_8.anInt529 - local27);
			}
			for (local27 = 0; local27 < this.anInt1045; local27++) {
				@Pc(103) int local103 = this.anIntArray274[local27];
				@Pc(108) Class1_Sub1_Sub1_Sub1_Sub1 local108 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local103];
				if (local108 != null) {
					this.method592(local108.aClass21_1.aByte10, local108);
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("81913, " + -6 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!JXGMYPJH;B)V")
	private void method592(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg1) {
		try {
			if (arg1.anInt231 < 128 || arg1.anInt232 < 128 || arg1.anInt231 >= 13184 || arg1.anInt232 >= 13184) {
				arg1.anInt226 = -1;
				arg1.anInt199 = -1;
				arg1.anInt208 = 0;
				arg1.anInt209 = 0;
				arg1.anInt231 = arg1.anIntArray28[0] * 128 + arg1.anInt216 * 64;
				arg1.anInt232 = arg1.anIntArray29[0] * 128 + arg1.anInt216 * 64;
				arg1.method110(this.aByte31);
			}
			if (arg1 == aClass1_Sub1_Sub1_Sub1_Sub2_1 && (arg1.anInt231 < 1536 || arg1.anInt232 < 1536 || arg1.anInt231 >= 11776 || arg1.anInt232 >= 11776)) {
				arg1.anInt226 = -1;
				arg1.anInt199 = -1;
				arg1.anInt208 = 0;
				arg1.anInt209 = 0;
				arg1.anInt231 = arg1.anIntArray28[0] * 128 + arg1.anInt216 * 64;
				arg1.anInt232 = arg1.anIntArray29[0] * 128 + arg1.anInt216 * 64;
				arg1.method110(this.aByte31);
			}
			if (arg1.anInt208 > anInt1007) {
				this.method593(arg1, 414);
			} else if (arg1.anInt209 >= anInt1007) {
				this.method594(arg1);
			} else {
				this.method595(arg1);
			}
			this.method596(arg1);
			this.method597(arg1);
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("88071, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!JXGMYPJH;I)V")
	private void method593(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = arg0.anInt208 - anInt1007;
			@Pc(14) int local14 = arg0.anInt204 * 128 + arg0.anInt216 * 64;
			@Pc(24) int local24 = arg0.anInt206 * 128 + arg0.anInt216 * 64;
			arg0.anInt231 += (local14 - arg0.anInt231) / local4;
			arg0.anInt232 += (local24 - arg0.anInt232) / local4;
			arg0.anInt211 = 0;
			@Pc(53) boolean local53 = false;
			if (arg0.anInt210 == 0) {
				arg0.anInt221 = 1024;
			}
			if (arg0.anInt210 == 1) {
				arg0.anInt221 = 1536;
			}
			if (arg0.anInt210 == 2) {
				arg0.anInt221 = 0;
			}
			if (arg0.anInt210 == 3) {
				arg0.anInt221 = 512;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("92525, " + arg0 + ", " + arg1 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!JXGMYPJH;I)V")
	private void method594(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt209 == anInt1007 || arg0.anInt226 == -1 || arg0.anInt229 != 0 || arg0.anInt228 + 1 > Class19.aClass19Array1[arg0.anInt226].method243(arg0.anInt227)) {
				@Pc(36) int local36 = arg0.anInt209 - arg0.anInt208;
				@Pc(41) int local41 = anInt1007 - arg0.anInt208;
				@Pc(51) int local51 = arg0.anInt204 * 128 + arg0.anInt216 * 64;
				@Pc(61) int local61 = arg0.anInt206 * 128 + arg0.anInt216 * 64;
				@Pc(71) int local71 = arg0.anInt205 * 128 + arg0.anInt216 * 64;
				@Pc(81) int local81 = arg0.anInt207 * 128 + arg0.anInt216 * 64;
				arg0.anInt231 = (local51 * (local36 - local41) + local71 * local41) / local36;
				arg0.anInt232 = (local61 * (local36 - local41) + local81 * local41) / local36;
			}
			arg0.anInt211 = 0;
			if (arg0.anInt210 == 0) {
				arg0.anInt221 = 1024;
			}
			if (arg0.anInt210 == 1) {
				arg0.anInt221 = 1536;
			}
			if (arg0.anInt210 == 2) {
				arg0.anInt221 = 0;
			}
			if (arg0.anInt210 == 3) {
				arg0.anInt221 = 512;
			}
			arg0.anInt233 = arg0.anInt221;
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("28753, " + arg0 + ", " + 205 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!JXGMYPJH;)V")
	private void method595(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.anInt237 = arg0.anInt235;
			if (arg0.anInt220 == 0) {
				arg0.anInt211 = 0;
			} else {
				if (arg0.anInt226 != -1 && arg0.anInt229 == 0) {
					@Pc(24) Class19 local24 = Class19.aClass19Array1[arg0.anInt226];
					if (arg0.anInt218 > 0 && local24.anInt417 == 0) {
						arg0.anInt211++;
						return;
					}
					if (arg0.anInt218 <= 0 && local24.anInt418 == 0) {
						arg0.anInt211++;
						return;
					}
				}
				@Pc(53) int local53 = arg0.anInt231;
				@Pc(56) int local56 = arg0.anInt232;
				@Pc(71) int local71 = arg0.anIntArray28[arg0.anInt220 - 1] * 128 + arg0.anInt216 * 64;
				@Pc(86) int local86 = arg0.anIntArray29[arg0.anInt220 - 1] * 128 + arg0.anInt216 * 64;
				if (local71 - local53 <= 256 && local71 - local53 >= -256 && local86 - local56 <= 256 && local86 - local56 >= -256) {
					if (local53 < local71) {
						if (local56 < local86) {
							arg0.anInt221 = 1280;
						} else if (local56 > local86) {
							arg0.anInt221 = 1792;
						} else {
							arg0.anInt221 = 1536;
						}
					} else if (local53 > local71) {
						if (local56 < local86) {
							arg0.anInt221 = 768;
						} else if (local56 > local86) {
							arg0.anInt221 = 256;
						} else {
							arg0.anInt221 = 512;
						}
					} else if (local56 < local86) {
						arg0.anInt221 = 1024;
					} else {
						arg0.anInt221 = 0;
					}
					@Pc(180) int local180 = arg0.anInt221 - arg0.anInt233 & 0x7FF;
					if (local180 > 1024) {
						local180 -= 2048;
					}
					@Pc(187) int local187 = arg0.anInt213;
					if (local180 >= -256 && local180 <= 256) {
						local187 = arg0.anInt212;
					} else if (local180 >= 256 && local180 < 768) {
						local187 = arg0.anInt215;
					} else if (local180 >= -768 && local180 <= -256) {
						local187 = arg0.anInt214;
					}
					if (local187 == -1) {
						local187 = arg0.anInt212;
					}
					arg0.anInt237 = local187;
					@Pc(235) int local235 = 4;
					if (arg0.anInt233 != arg0.anInt221 && arg0.anInt219 == -1 && arg0.anInt234 != 0) {
						local235 = 2;
					}
					if (arg0.anInt220 > 2) {
						local235 = 6;
					}
					if (arg0.anInt220 > 3) {
						local235 = 8;
					}
					if (arg0.anInt211 > 0 && arg0.anInt220 > 1) {
						local235 = 8;
						arg0.anInt211--;
					}
					if (arg0.aBooleanArray3[arg0.anInt220 - 1]) {
						local235 <<= 0x1;
					}
					if (local235 >= 8 && arg0.anInt237 == arg0.anInt212 && arg0.anInt222 != -1) {
						arg0.anInt237 = arg0.anInt222;
					}
					if (local53 < local71) {
						arg0.anInt231 += local235;
						if (arg0.anInt231 > local71) {
							arg0.anInt231 = local71;
						}
					} else if (local53 > local71) {
						arg0.anInt231 -= local235;
						if (arg0.anInt231 < local71) {
							arg0.anInt231 = local71;
						}
					}
					if (local56 < local86) {
						arg0.anInt232 += local235;
						if (arg0.anInt232 > local86) {
							arg0.anInt232 = local86;
						}
					} else if (local56 > local86) {
						arg0.anInt232 -= local235;
						if (arg0.anInt232 < local86) {
							arg0.anInt232 = local86;
						}
					}
					if (arg0.anInt231 == local71 && arg0.anInt232 == local86) {
						arg0.anInt220--;
						if (arg0.anInt218 > 0) {
							arg0.anInt218--;
							return;
						}
					}
				} else {
					arg0.anInt231 = local71;
					arg0.anInt232 = local86;
				}
			}
		} catch (@Pc(397) RuntimeException local397) {
			signlink.reporterror("34356, " + -38823 + ", " + arg0 + ", " + local397.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!JXGMYPJH;B)V")
	private void method596(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt234 != 0) {
				@Pc(31) int local31;
				@Pc(37) int local37;
				if (arg0.anInt219 != -1 && arg0.anInt219 < 32768) {
					@Pc(23) Class1_Sub1_Sub1_Sub1_Sub1 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[arg0.anInt219];
					if (local23 != null) {
						local31 = arg0.anInt231 - local23.anInt231;
						local37 = arg0.anInt232 - local23.anInt232;
						if (local31 != 0 || local37 != 0) {
							arg0.anInt221 = (int) (Math.atan2((double) local31, (double) local37) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(62) int local62;
				if (arg0.anInt219 >= 32768) {
					local62 = arg0.anInt219 - 32768;
					if (local62 == this.anInt992) {
						local62 = this.anInt835;
					}
					@Pc(74) Class1_Sub1_Sub1_Sub1_Sub2 local74 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local62];
					if (local74 != null) {
						local37 = arg0.anInt231 - local74.anInt231;
						@Pc(88) int local88 = arg0.anInt232 - local74.anInt232;
						if (local37 != 0 || local88 != 0) {
							arg0.anInt221 = (int) (Math.atan2((double) local37, (double) local88) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt197 != 0 || arg0.anInt198 != 0) && (arg0.anInt220 == 0 || arg0.anInt211 > 0)) {
					local62 = arg0.anInt231 - (arg0.anInt197 - this.anInt894 - this.anInt894) * 64;
					local31 = arg0.anInt232 - (arg0.anInt198 - this.anInt895 - this.anInt895) * 64;
					if (local62 != 0 || local31 != 0) {
						arg0.anInt221 = (int) (Math.atan2((double) local62, (double) local31) * 325.949D) & 0x7FF;
					}
					arg0.anInt197 = 0;
					arg0.anInt198 = 0;
				}
				local62 = arg0.anInt221 - arg0.anInt233 & 0x7FF;
				if (local62 != 0) {
					if (local62 < arg0.anInt234 || local62 > 2048 - arg0.anInt234) {
						arg0.anInt233 = arg0.anInt221;
					} else if (local62 > 1024) {
						arg0.anInt233 -= arg0.anInt234;
					} else {
						arg0.anInt233 += arg0.anInt234;
					}
					arg0.anInt233 &= 0x7FF;
					if (arg0.anInt237 == arg0.anInt235 && arg0.anInt233 != arg0.anInt221) {
						if (arg0.anInt236 != -1) {
							arg0.anInt237 = arg0.anInt236;
							return;
						}
						arg0.anInt237 = arg0.anInt212;
						return;
					}
				}
			}
		} catch (@Pc(242) RuntimeException local242) {
			signlink.reporterror("50214, " + arg0 + ", " + 53 + ", " + local242.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!JXGMYPJH;I)V")
	private void method597(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.aBoolean33 = false;
			@Pc(21) Class19 local21;
			if (arg0.anInt237 != -1) {
				local21 = Class19.aClass19Array1[arg0.anInt237];
				arg0.anInt239++;
				if (arg0.anInt238 < local21.anInt411 && arg0.anInt239 > local21.method243(arg0.anInt238)) {
					arg0.anInt239 = 0;
					arg0.anInt238++;
				}
				if (arg0.anInt238 >= local21.anInt411) {
					arg0.anInt239 = 0;
					arg0.anInt238 = 0;
				}
			}
			if (arg0.anInt199 != -1 && anInt1007 >= arg0.anInt202) {
				if (arg0.anInt200 < 0) {
					arg0.anInt200 = 0;
				}
				local21 = Class25.aClass25Array1[arg0.anInt199].aClass19_1;
				arg0.anInt201++;
				while (arg0.anInt200 < local21.anInt411 && arg0.anInt201 > local21.method243(arg0.anInt200)) {
					arg0.anInt201 -= local21.method243(arg0.anInt200);
					arg0.anInt200++;
				}
				if (arg0.anInt200 >= local21.anInt411 && (arg0.anInt200 < 0 || arg0.anInt200 >= local21.anInt411)) {
					arg0.anInt199 = -1;
				}
			}
			if (arg0.anInt226 != -1 && arg0.anInt229 <= 1) {
				local21 = Class19.aClass19Array1[arg0.anInt226];
				if (local21.anInt417 == 1 && arg0.anInt218 > 0 && arg0.anInt208 <= anInt1007 && arg0.anInt209 < anInt1007) {
					arg0.anInt229 = 1;
					return;
				}
			}
			if (arg0.anInt226 != -1 && arg0.anInt229 == 0) {
				local21 = Class19.aClass19Array1[arg0.anInt226];
				arg0.anInt228++;
				while (arg0.anInt227 < local21.anInt411 && arg0.anInt228 > local21.method243(arg0.anInt227)) {
					arg0.anInt228 -= local21.method243(arg0.anInt227);
					arg0.anInt227++;
				}
				if (arg0.anInt227 >= local21.anInt411) {
					arg0.anInt227 -= local21.anInt412;
					arg0.anInt230++;
					if (arg0.anInt230 >= local21.anInt416) {
						arg0.anInt226 = -1;
					}
					if (arg0.anInt227 < 0 || arg0.anInt227 >= local21.anInt411) {
						arg0.anInt226 = -1;
					}
				}
				arg0.aBoolean33 = local21.aBoolean83;
			}
			if (arg0.anInt229 > 0) {
				arg0.anInt229--;
			}
		} catch (@Pc(266) RuntimeException local266) {
			signlink.reporterror("9400, " + arg0 + ", " + 0 + ", " + local266.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method598() {
		try {
			this.aBoolean188 &= true;
			if (this.anInt1010 == -1 || this.anInt922 != 2 && super.aClass8_2 == null) {
				if (this.aBoolean197) {
					this.method590();
					this.aBoolean197 = false;
					this.aClass8_3.method134(super.aGraphics2, 4, 0);
					this.aClass8_4.method134(super.aGraphics2, 357, 0);
					this.aClass8_5.method134(super.aGraphics2, 4, 722);
					this.aClass8_6.method134(super.aGraphics2, 205, 743);
					this.aClass8_7.method134(super.aGraphics2, 0, 0);
					this.aClass8_8.method134(super.aGraphics2, 4, 516);
					this.aClass8_9.method134(super.aGraphics2, 205, 516);
					this.aClass8_10.method134(super.aGraphics2, 357, 496);
					this.aClass8_11.method134(super.aGraphics2, 338, 0);
					this.aBoolean194 = true;
					this.aBoolean199 = true;
					this.aBoolean181 = true;
					this.aBoolean213 = true;
					if (this.anInt922 != 2) {
						this.aClass8_26.method134(super.aGraphics2, 4, 4);
						this.aClass8_25.method134(super.aGraphics2, 4, 550);
					}
				}
				if (this.anInt922 == 2) {
					this.method611();
				}
				if (this.aBoolean200 && this.anInt1025 == 1) {
					this.aBoolean194 = true;
				}
				@Pc(283) boolean local283;
				if (this.anInt826 != -1) {
					local283 = this.method718(this.anInt1042, this.anInt826);
					if (local283) {
						this.aBoolean194 = true;
					}
				}
				if (this.anInt987 == 2) {
					this.aBoolean194 = true;
				}
				if (this.anInt915 == 2) {
					this.aBoolean194 = true;
				}
				if (this.aBoolean194) {
					this.method724((byte) 4);
					this.aBoolean194 = false;
				}
				@Pc(368) int local368;
				if (this.anInt1054 == -1 && this.anInt1022 == 0) {
					this.aClass27_1.anInt570 = this.anInt932 - this.anInt926 - 77;
					if (super.anInt814 > 448 && super.anInt814 < 560 && super.anInt815 > 332) {
						this.method646(super.anInt815 - 357, this.aClass27_1, 77, 0, -1, super.anInt814 - 17, 463, this.anInt932);
					}
					local368 = this.anInt932 - this.aClass27_1.anInt570 - 77;
					if (local368 < 0) {
						local368 = 0;
					}
					if (local368 > this.anInt932 - 77) {
						local368 = this.anInt932 - 77;
					}
					if (this.anInt926 != local368) {
						this.anInt926 = local368;
						this.aBoolean199 = true;
					}
				}
				if (this.anInt1054 == -1 && this.anInt1022 == 3) {
					local368 = this.anInt890 * 14 + 7;
					this.aClass27_1.anInt570 = this.anInt891;
					if (super.anInt814 > 448 && super.anInt814 < 560 && super.anInt815 > 332) {
						this.method646(super.anInt815 - 357, this.aClass27_1, 77, 0, -1, super.anInt814 - 17, 463, local368);
					}
					@Pc(447) int local447 = this.aClass27_1.anInt570;
					if (local447 < 0) {
						local447 = 0;
					}
					if (local447 > local368 - 77) {
						local447 = local368 - 77;
					}
					if (this.anInt891 != local447) {
						this.anInt891 = local447;
						this.aBoolean199 = true;
					}
				}
				if (this.anInt1054 != -1) {
					local283 = this.method718(this.anInt1042, this.anInt1054);
					if (local283) {
						this.aBoolean199 = true;
					}
				}
				if (this.anInt987 == 3) {
					this.aBoolean199 = true;
				}
				if (this.anInt915 == 3) {
					this.aBoolean199 = true;
				}
				if (this.aString21 != null) {
					this.aBoolean199 = true;
				}
				if (this.aBoolean200 && this.anInt1025 == 2) {
					this.aBoolean199 = true;
				}
				if (this.aBoolean199) {
					this.method625();
					this.aBoolean199 = false;
				}
				if (this.anInt922 == 2) {
					this.method713();
					this.aClass8_25.method134(super.aGraphics2, 4, 550);
				}
				if (this.anInt999 != -1) {
					this.aBoolean181 = true;
				}
				if (this.aBoolean181) {
					if (this.anInt999 != -1 && this.anInt999 == this.anInt959) {
						this.anInt999 = -1;
						this.aClass1_Sub1_Sub4_8.method283(77);
						this.aClass1_Sub1_Sub4_8.method284(this.anInt959);
					}
					this.aBoolean181 = false;
					this.aClass8_23.method133();
					this.aClass1_Sub1_Sub2_Sub2_10.method103(0, 0);
					if (this.anInt826 == -1) {
						if (this.anIntArray229[this.anInt959] != -1) {
							if (this.anInt959 == 0) {
								this.aClass1_Sub1_Sub2_Sub2_1.method103(22, 10);
							}
							if (this.anInt959 == 1) {
								this.aClass1_Sub1_Sub2_Sub2_2.method103(54, 8);
							}
							if (this.anInt959 == 2) {
								this.aClass1_Sub1_Sub2_Sub2_2.method103(82, 8);
							}
							if (this.anInt959 == 3) {
								this.aClass1_Sub1_Sub2_Sub2_3.method103(110, 8);
							}
							if (this.anInt959 == 4) {
								this.aClass1_Sub1_Sub2_Sub2_5.method103(153, 8);
							}
							if (this.anInt959 == 5) {
								this.aClass1_Sub1_Sub2_Sub2_5.method103(181, 8);
							}
							if (this.anInt959 == 6) {
								this.aClass1_Sub1_Sub2_Sub2_4.method103(209, 9);
							}
						}
						if (this.anIntArray229[0] != -1 && (this.anInt999 != 0 || anInt1007 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub2Array2[0].method103(29, 13);
						}
						if (this.anIntArray229[1] != -1 && (this.anInt999 != 1 || anInt1007 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub2Array2[1].method103(53, 11);
						}
						if (this.anIntArray229[2] != -1 && (this.anInt999 != 2 || anInt1007 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub2Array2[2].method103(82, 11);
						}
						if (this.anIntArray229[3] != -1 && (this.anInt999 != 3 || anInt1007 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub2Array2[3].method103(115, 12);
						}
						if (this.anIntArray229[4] != -1 && (this.anInt999 != 4 || anInt1007 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub2Array2[4].method103(153, 13);
						}
						if (this.anIntArray229[5] != -1 && (this.anInt999 != 5 || anInt1007 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub2Array2[5].method103(180, 11);
						}
						if (this.anIntArray229[6] != -1 && (this.anInt999 != 6 || anInt1007 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub2Array2[6].method103(208, 13);
						}
					}
					this.aClass8_23.method134(super.aGraphics2, 160, 516);
					this.aClass8_22.method133();
					this.aClass1_Sub1_Sub2_Sub2_9.method103(0, 0);
					if (this.anInt826 == -1) {
						if (this.anIntArray229[this.anInt959] != -1) {
							if (this.anInt959 == 7) {
								this.aClass1_Sub1_Sub2_Sub2_16.method103(42, 0);
							}
							if (this.anInt959 == 8) {
								this.aClass1_Sub1_Sub2_Sub2_17.method103(74, 0);
							}
							if (this.anInt959 == 9) {
								this.aClass1_Sub1_Sub2_Sub2_17.method103(102, 0);
							}
							if (this.anInt959 == 10) {
								this.aClass1_Sub1_Sub2_Sub2_18.method103(130, 1);
							}
							if (this.anInt959 == 11) {
								this.aClass1_Sub1_Sub2_Sub2_20.method103(173, 0);
							}
							if (this.anInt959 == 12) {
								this.aClass1_Sub1_Sub2_Sub2_20.method103(201, 0);
							}
							if (this.anInt959 == 13) {
								this.aClass1_Sub1_Sub2_Sub2_19.method103(229, 0);
							}
						}
						if (this.anIntArray229[8] != -1 && (this.anInt999 != 8 || anInt1007 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub2Array2[7].method103(74, 2);
						}
						if (this.anIntArray229[9] != -1 && (this.anInt999 != 9 || anInt1007 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub2Array2[8].method103(102, 3);
						}
						if (this.anIntArray229[10] != -1 && (this.anInt999 != 10 || anInt1007 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub2Array2[9].method103(137, 4);
						}
						if (this.anIntArray229[11] != -1 && (this.anInt999 != 11 || anInt1007 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub2Array2[10].method103(174, 2);
						}
						if (this.anIntArray229[12] != -1 && (this.anInt999 != 12 || anInt1007 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub2Array2[11].method103(201, 2);
						}
						if (this.anIntArray229[13] != -1 && (this.anInt999 != 13 || anInt1007 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub2Array2[12].method103(226, 2);
						}
					}
					this.aClass8_22.method134(super.aGraphics2, 466, 496);
					this.aClass8_26.method133();
					Class1_Sub1_Sub2_Sub4.anIntArray197 = this.anIntArray256;
				}
				if (this.aBoolean213) {
					this.aBoolean213 = false;
					this.aClass8_21.method133();
					this.aClass1_Sub1_Sub2_Sub2_8.method103(0, 0);
					this.aClass1_Sub1_Sub2_Sub1_3.method70("Public chat", true, 28, 16777215, 55);
					if (this.anInt921 == 0) {
						this.aClass1_Sub1_Sub2_Sub1_3.method70("On", true, 41, 65280, 55);
					}
					if (this.anInt921 == 1) {
						this.aClass1_Sub1_Sub2_Sub1_3.method70("Friends", true, 41, 16776960, 55);
					}
					if (this.anInt921 == 2) {
						this.aClass1_Sub1_Sub2_Sub1_3.method70("Off", true, 41, 16711680, 55);
					}
					if (this.anInt921 == 3) {
						this.aClass1_Sub1_Sub2_Sub1_3.method70("Hide", true, 41, 65535, 55);
					}
					this.aClass1_Sub1_Sub2_Sub1_3.method70("Private chat", true, 28, 16777215, 184);
					if (this.anInt892 == 0) {
						this.aClass1_Sub1_Sub2_Sub1_3.method70("On", true, 41, 65280, 184);
					}
					if (this.anInt892 == 1) {
						this.aClass1_Sub1_Sub2_Sub1_3.method70("Friends", true, 41, 16776960, 184);
					}
					if (this.anInt892 == 2) {
						this.aClass1_Sub1_Sub2_Sub1_3.method70("Off", true, 41, 16711680, 184);
					}
					this.aClass1_Sub1_Sub2_Sub1_3.method70("Trade/compete", true, 28, 16777215, 324);
					if (this.anInt951 == 0) {
						this.aClass1_Sub1_Sub2_Sub1_3.method70("On", true, 41, 65280, 324);
					}
					if (this.anInt951 == 1) {
						this.aClass1_Sub1_Sub2_Sub1_3.method70("Friends", true, 41, 16776960, 324);
					}
					if (this.anInt951 == 2) {
						this.aClass1_Sub1_Sub2_Sub1_3.method70("Off", true, 41, 16711680, 324);
					}
					this.aClass1_Sub1_Sub2_Sub1_3.method70("Report abuse", true, 33, 16777215, 458);
					this.aClass8_21.method134(super.aGraphics2, 453, 0);
					this.aClass8_26.method133();
					Class1_Sub1_Sub2_Sub4.anIntArray197 = this.anIntArray256;
				}
				this.anInt1042 = 0;
			} else {
				if (this.anInt922 == 2) {
					this.method718(this.anInt1042, this.anInt1010);
					if (this.anInt979 != -1) {
						this.method718(this.anInt1042, this.anInt979);
					}
					this.anInt1042 = 0;
					this.method609((byte) 3);
					super.aClass8_2.method133();
					Class1_Sub1_Sub2_Sub4.anIntArray197 = this.anIntArray257;
					Class1_Sub1_Sub2.method515();
					this.aBoolean197 = true;
					@Pc(62) Class27 local62 = Class27.method339(this.anInt1010);
					if (local62.anInt542 == 512 && local62.anInt538 == 334 && local62.anInt571 == 0) {
						local62.anInt542 = 765;
						local62.anInt538 = 503;
					}
					this.method660(local62, 0, 0, 878, 0);
					if (this.anInt979 != -1) {
						local62 = Class27.method339(this.anInt979);
						if (local62.anInt542 == 512 && local62.anInt538 == 334 && local62.anInt571 == 0) {
							local62.anInt542 = 765;
							local62.anInt538 = 503;
						}
						this.method660(local62, 0, 0, 878, 0);
					}
					if (this.aBoolean200) {
						this.method608();
					} else {
						this.method698();
						this.method706();
					}
				}
				super.aClass8_2.method134(super.aGraphics2, 0, 0);
			}
		} catch (@Pc(1277) RuntimeException local1277) {
			signlink.reporterror("91454, " + true + ", " + local1277.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method599() {
		try {
			this.aBoolean180 = true;
			try {
				@Pc(12) long local12 = System.currentTimeMillis();
				@Pc(14) int local14 = 0;
				@Pc(16) int local16 = 20;
				while (this.aBoolean206) {
					this.anInt997++;
					this.method681();
					this.method681();
					this.method683(this.anInt931);
					local14++;
					if (local14 > 10) {
						@Pc(40) long local40 = System.currentTimeMillis();
						@Pc(49) int local49 = (int) (local40 - local12) / 10 - local16;
						local16 = 40 - local49;
						if (local16 < 5) {
							local16 = 5;
						}
						local14 = 0;
						local12 = local40;
					}
					try {
						Thread.sleep((long) local16);
					} catch (@Pc(67) Exception local67) {
					}
				}
			} catch (@Pc(73) Exception local73) {
			}
			this.aBoolean180 = false;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("91599, " + 3127 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!MVHXDWGI;ZI)V")
	private void method600(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				if (arg0.anInt530 + 10 < arg1 * 8) {
					@Pc(14) int local14 = arg0.method305(11);
					if (local14 != 2047) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local14] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local14] = new Class1_Sub1_Sub1_Sub1_Sub2();
							if (this.aClass1_Sub1_Sub4Array1[local14] != null) {
								this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local14].method116(this.aClass1_Sub1_Sub4Array1[local14]);
							}
						}
						this.anIntArray212[this.anInt836++] = local14;
						@Pc(60) Class1_Sub1_Sub1_Sub1_Sub2 local60 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local14];
						local60.anInt217 = anInt1007;
						@Pc(68) int local68 = arg0.method305(5);
						if (local68 > 15) {
							local68 -= 32;
						}
						@Pc(77) int local77 = arg0.method305(1);
						@Pc(82) int local82 = arg0.method305(1);
						if (local82 == 1) {
							this.anIntArray213[this.anInt837++] = local14;
						}
						@Pc(101) int local101 = arg0.method305(5);
						if (local101 > 15) {
							local101 -= 32;
						}
						local60.method113(aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0] + local68, local77 == 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0] + local101, this.anInt902);
						continue;
					}
				}
				arg0.method306();
				return;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("84019, " + arg0 + ", " + true + ", " + arg1 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	private void method601() {
		try {
			for (@Pc(6) Class1_Sub1_Sub1_Sub6 local6 = (Class1_Sub1_Sub1_Sub6) this.aClass16_12.method185(); local6 != null; local6 = (Class1_Sub1_Sub1_Sub6) this.aClass16_12.method187()) {
				if (local6.anInt709 != this.anInt995 || anInt1007 > local6.anInt713) {
					local6.method560();
				} else if (anInt1007 >= local6.anInt712) {
					if (local6.anInt716 > 0) {
						@Pc(36) Class1_Sub1_Sub1_Sub1_Sub1 local36 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local6.anInt716 - 1];
						if (local36 != null && local36.anInt231 >= 0 && local36.anInt231 < 13312 && local36.anInt232 >= 0 && local36.anInt232 < 13312) {
							local6.method499(local36.anInt231, anInt1007, this.method607(local36.anInt232, local36.anInt231, local6.anInt709) - local6.anInt720, local36.anInt232);
						}
					}
					if (local6.anInt716 < 0) {
						@Pc(81) int local81 = -local6.anInt716 - 1;
						@Pc(87) Class1_Sub1_Sub1_Sub1_Sub2 local87;
						if (local81 == this.anInt992) {
							local87 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
						} else {
							local87 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local81];
						}
						if (local87 != null && local87.anInt231 >= 0 && local87.anInt231 < 13312 && local87.anInt232 >= 0 && local87.anInt232 < 13312) {
							local6.method499(local87.anInt231, anInt1007, this.method607(local87.anInt232, local87.anInt231, local6.anInt709) - local6.anInt720, local87.anInt232);
						}
					}
					local6.method498(this.anInt1042, aBoolean209);
					this.aClass18_1.method202(this.anInt995, (int) local6.aDouble7, (int) local6.aDouble5, local6, (int) local6.aDouble6, 60, local6.anInt707, false, -1);
				}
			}
			anInt972++;
			if (anInt972 > 138) {
				anInt972 = 0;
				this.aClass1_Sub1_Sub4_8.method283(36);
				this.aClass1_Sub1_Sub4_8.method285(48837);
			}
		} catch (@Pc(195) RuntimeException local195) {
			signlink.reporterror("94975, " + -119 + ", " + local195.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method602(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt1013; local8++) {
					if (this.aLongArray3[local8] == arg0) {
						this.anInt1013--;
						this.aBoolean194 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt1013; local28++) {
							this.aLongArray3[local28] = this.aLongArray3[local28 + 1];
						}
						this.aClass1_Sub1_Sub4_8.method283(141);
						this.aClass1_Sub1_Sub4_8.method290(arg0);
						break;
					}
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("23075, " + arg0 + ", " + 7 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method603(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			if (aBoolean205 && this.anInt922 == 2 && Class39.anInt702 != this.anInt995) {
				this.method648(null, "Loading - please wait.");
				this.anInt922 = 1;
				this.aLong31 = System.currentTimeMillis();
			}
			if (this.anInt922 == 1) {
				@Pc(36) int local36 = this.method604();
				if (local36 != 0 && System.currentTimeMillis() - this.aLong31 > 360000L) {
					signlink.reporterror(this.aString27 + " glcfb " + this.aLong33 + "," + local36 + "," + aBoolean205 + "," + this.aClass34Array1[0] + "," + this.aClass28_Sub1_1.method452() + "," + this.anInt995 + "," + this.anInt988 + "," + this.anInt989);
					this.aLong31 = System.currentTimeMillis();
				}
			}
			if (this.anInt922 == 2 && this.anInt995 != this.anInt952) {
				this.anInt952 = this.anInt995;
				this.method624(this.anInt995);
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("8188, " + arg0 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)I")
	private int method604() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray6.length; local3++) {
				if (this.aByteArrayArray6[local3] == null && this.anIntArray217[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray5[local3] == null && this.anIntArray218[local3] != -1) {
					return -2;
				}
			}
			@Pc(45) boolean local45 = true;
			for (@Pc(47) int local47 = 0; local47 < this.aByteArrayArray6.length; local47++) {
				@Pc(54) byte[] local54 = this.aByteArrayArray5[local47];
				if (local54 != null) {
					@Pc(68) int local68 = (this.anIntArray216[local47] >> 8) * 64 - this.anInt894;
					@Pc(80) int local80 = (this.anIntArray216[local47] & 0xFF) * 64 - this.anInt895;
					if (this.aBoolean217) {
						local68 = 10;
						local80 = 10;
					}
					local45 &= Class39.method490(local54, local80, local68);
				}
			}
			if (!local45) {
				return -3;
			} else if (this.aBoolean192) {
				return -4;
			} else {
				this.anInt922 = 2;
				Class39.anInt702 = this.anInt995;
				this.method641();
				this.aClass1_Sub1_Sub4_8.method283(50);
				return 0;
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("56985, " + false + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method605(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) Class27 local2 = Class27.method339(arg0);
			for (@Pc(4) int local4 = 0; local4 < local2.anIntArray113.length && local2.anIntArray113[local4] != -1; local4++) {
				@Pc(18) Class27 local18 = Class27.method339(local2.anIntArray113[local4]);
				if (local18.anInt571 == 1) {
					this.method605(local18.anInt565);
				}
				local18.anInt555 = 0;
				local18.anInt573 = 0;
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("24710, " + arg0 + ", " + 0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method606() {
		try {
			while (true) {
				@Pc(11) int local11 = this.method578();
				if (local11 == -1) {
					return;
				}
				if (this.anInt935 != -1 && this.anInt935 == this.anInt957) {
					if (local11 == 8 && this.aString31.length() > 0) {
						this.aString31 = this.aString31.substring(0, this.aString31.length() - 1);
					}
					if ((local11 >= 97 && local11 <= 122 || local11 >= 65 && local11 <= 90 || local11 >= 48 && local11 <= 57 || local11 == 32) && this.aString31.length() < 12) {
						this.aString31 = this.aString31 + (char) local11;
					}
				} else {
					@Pc(191) int local191;
					if (this.aBoolean195) {
						if (local11 >= 32 && local11 <= 122 && this.aString18.length() < 80) {
							this.aString18 = this.aString18 + (char) local11;
							this.aBoolean199 = true;
						}
						if (local11 == 8 && this.aString18.length() > 0) {
							this.aString18 = this.aString18.substring(0, this.aString18.length() - 1);
							this.aBoolean199 = true;
						}
						if (local11 == 13 || local11 == 10) {
							this.aBoolean195 = false;
							this.aBoolean199 = true;
							@Pc(151) long local151;
							if (this.anInt843 == 1) {
								local151 = Class41.method504(this.aString18);
								this.method710(local151);
							}
							if (this.anInt843 == 2 && this.anInt827 > 0) {
								local151 = Class41.method504(this.aString18);
								this.method640(986, local151);
							}
							if (this.anInt843 == 3 && this.aString18.length() > 0) {
								this.aClass1_Sub1_Sub4_8.method283(177);
								this.aClass1_Sub1_Sub4_8.method284(0);
								local191 = this.aClass1_Sub1_Sub4_8.anInt529;
								this.aClass1_Sub1_Sub4_8.method290(this.aLong29);
								Class37.method448(this.aClass1_Sub1_Sub4_8, this.aString18);
								this.aClass1_Sub1_Sub4_8.method293(this.aClass1_Sub1_Sub4_8.anInt529 - local191);
								this.aString18 = Class37.method449(this.aString18);
								this.aString18 = Class29.method399(this.aString18);
								this.method639(this.aString18, 6, Class41.method508(Class41.method505(this.aLong29)));
								if (this.anInt892 == 2) {
									this.anInt892 = 1;
									this.aBoolean213 = true;
									this.aClass1_Sub1_Sub4_8.method283(227);
									this.aClass1_Sub1_Sub4_8.method284(this.anInt921);
									this.aClass1_Sub1_Sub4_8.method284(this.anInt892);
									this.aClass1_Sub1_Sub4_8.method284(this.anInt951);
								}
							}
							if (this.anInt843 == 4 && this.anInt1013 < 100) {
								local151 = Class41.method504(this.aString18);
								this.method620(local151);
							}
							if (this.anInt843 == 5 && this.anInt1013 > 0) {
								local151 = Class41.method504(this.aString18);
								this.method602(local151);
							}
						}
					} else if (this.anInt1022 == 1) {
						if (local11 >= 48 && local11 <= 57 && this.aString22.length() < 10) {
							this.aString22 = this.aString22 + (char) local11;
							this.aBoolean199 = true;
						}
						if (local11 == 8 && this.aString22.length() > 0) {
							this.aString22 = this.aString22.substring(0, this.aString22.length() - 1);
							this.aBoolean199 = true;
						}
						if (local11 == 13 || local11 == 10) {
							if (this.aString22.length() > 0) {
								local191 = 0;
								try {
									local191 = Integer.parseInt(this.aString22);
								} catch (@Pc(368) Exception local368) {
								}
								this.aClass1_Sub1_Sub4_8.method283(142);
								this.aClass1_Sub1_Sub4_8.method288(local191);
							}
							this.anInt1022 = 0;
							this.aBoolean199 = true;
						}
					} else if (this.anInt1022 == 2) {
						if (local11 >= 32 && local11 <= 122 && this.aString22.length() < 12) {
							this.aString22 = this.aString22 + (char) local11;
							this.aBoolean199 = true;
						}
						if (local11 == 8 && this.aString22.length() > 0) {
							this.aString22 = this.aString22.substring(0, this.aString22.length() - 1);
							this.aBoolean199 = true;
						}
						if (local11 == 13 || local11 == 10) {
							if (this.aString22.length() > 0) {
								this.aClass1_Sub1_Sub4_8.method283(217);
								this.aClass1_Sub1_Sub4_8.method290(Class41.method504(this.aString22));
							}
							this.anInt1022 = 0;
							this.aBoolean199 = true;
						}
					} else if (this.anInt1022 == 3) {
						if (local11 >= 32 && local11 <= 122 && this.aString22.length() < 40) {
							this.aString22 = this.aString22 + (char) local11;
							this.aBoolean199 = true;
						}
						if (local11 == 8 && this.aString22.length() > 0) {
							this.aString22 = this.aString22.substring(0, this.aString22.length() - 1);
							this.aBoolean199 = true;
						}
					} else if (this.anInt1054 == -1 && this.anInt1010 == -1) {
						if (local11 >= 32 && local11 <= 122 && this.aString30.length() < 80) {
							this.aString30 = this.aString30 + (char) local11;
							this.aBoolean199 = true;
						}
						if (local11 == 8 && this.aString30.length() > 0) {
							this.aString30 = this.aString30.substring(0, this.aString30.length() - 1);
							this.aBoolean199 = true;
						}
						if ((local11 == 13 || local11 == 10) && this.aString30.length() > 0) {
							if (this.anInt980 == 2) {
								if (this.aString30.equals("::clientdrop")) {
									this.method700();
								}
								if (this.aString30.equals("::lag")) {
									this.method655();
								}
								if (this.aString30.equals("::prefetchmusic")) {
									for (local191 = 0; local191 < this.aClass28_Sub1_1.method467(2); local191++) {
										this.aClass28_Sub1_1.method454(2, (byte) 1, local191, aByte36);
									}
								}
								if (this.aString30.equals("::fpson")) {
									aBoolean198 = true;
								}
								if (this.aString30.equals("::fpsoff")) {
									aBoolean198 = false;
								}
								if (this.aString30.equals("::noclip")) {
									for (local191 = 0; local191 < 4; local191++) {
										for (@Pc(653) int local653 = 1; local653 < 103; local653++) {
											for (@Pc(657) int local657 = 1; local657 < 103; local657++) {
												this.aClass22Array1[local191].anIntArrayArray6[local653][local657] = 0;
											}
										}
									}
								}
							}
							if (this.aString30.startsWith("::")) {
								this.aClass1_Sub1_Sub4_8.method283(58);
								this.aClass1_Sub1_Sub4_8.method284(this.aString30.length() - 1);
								this.aClass1_Sub1_Sub4_8.method291(this.aString30.substring(2));
							} else {
								@Pc(712) String local712 = this.aString30.toLowerCase();
								@Pc(714) byte local714 = 0;
								if (local712.startsWith("yellow:")) {
									local714 = 0;
									this.aString30 = this.aString30.substring(7);
								} else if (local712.startsWith("red:")) {
									local714 = 1;
									this.aString30 = this.aString30.substring(4);
								} else if (local712.startsWith("green:")) {
									local714 = 2;
									this.aString30 = this.aString30.substring(6);
								} else if (local712.startsWith("cyan:")) {
									local714 = 3;
									this.aString30 = this.aString30.substring(5);
								} else if (local712.startsWith("purple:")) {
									local714 = 4;
									this.aString30 = this.aString30.substring(7);
								} else if (local712.startsWith("white:")) {
									local714 = 5;
									this.aString30 = this.aString30.substring(6);
								} else if (local712.startsWith("flash1:")) {
									local714 = 6;
									this.aString30 = this.aString30.substring(7);
								} else if (local712.startsWith("flash2:")) {
									local714 = 7;
									this.aString30 = this.aString30.substring(7);
								} else if (local712.startsWith("flash3:")) {
									local714 = 8;
									this.aString30 = this.aString30.substring(7);
								} else if (local712.startsWith("glow1:")) {
									local714 = 9;
									this.aString30 = this.aString30.substring(6);
								} else if (local712.startsWith("glow2:")) {
									local714 = 10;
									this.aString30 = this.aString30.substring(6);
								} else if (local712.startsWith("glow3:")) {
									local714 = 11;
									this.aString30 = this.aString30.substring(6);
								}
								local712 = this.aString30.toLowerCase();
								@Pc(886) byte local886 = 0;
								if (local712.startsWith("wave:")) {
									local886 = 1;
									this.aString30 = this.aString30.substring(5);
								} else if (local712.startsWith("wave2:")) {
									local886 = 2;
									this.aString30 = this.aString30.substring(6);
								} else if (local712.startsWith("shake:")) {
									local886 = 3;
									this.aString30 = this.aString30.substring(6);
								} else if (local712.startsWith("scroll:")) {
									local886 = 4;
									this.aString30 = this.aString30.substring(7);
								} else if (local712.startsWith("slide:")) {
									local886 = 5;
									this.aString30 = this.aString30.substring(6);
								}
								this.aClass1_Sub1_Sub4_8.method283(110);
								this.aClass1_Sub1_Sub4_8.method284(0);
								@Pc(967) int local967 = this.aClass1_Sub1_Sub4_8.anInt529;
								this.aClass1_Sub1_Sub4_9.anInt529 = 0;
								Class37.method448(this.aClass1_Sub1_Sub4_9, this.aString30);
								this.aClass1_Sub1_Sub4_8.method292(this.aClass1_Sub1_Sub4_9.aByteArray14, this.aClass1_Sub1_Sub4_9.anInt529);
								this.aClass1_Sub1_Sub4_8.method284(local886);
								this.aClass1_Sub1_Sub4_8.method311(164, local714);
								this.aClass1_Sub1_Sub4_8.method293(this.aClass1_Sub1_Sub4_8.anInt529 - local967);
								this.aString30 = Class37.method449(this.aString30);
								this.aString30 = Class29.method399(this.aString30);
								aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4 = this.aString30;
								aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt195 = local714;
								aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt196 = local886;
								aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt240 = 150;
								if (this.anInt980 == 2) {
									this.method639(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4, 2, "@cr2@" + aClass1_Sub1_Sub1_Sub1_Sub2_1.aString5);
								} else if (this.anInt980 == 1) {
									this.method639(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4, 2, "@cr1@" + aClass1_Sub1_Sub1_Sub1_Sub2_1.aString5);
								} else {
									this.method639(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4, 2, aClass1_Sub1_Sub1_Sub1_Sub2_1.aString5);
								}
								if (this.anInt921 == 2) {
									this.anInt921 = 3;
									this.aBoolean213 = true;
									this.aClass1_Sub1_Sub4_8.method283(227);
									this.aClass1_Sub1_Sub4_8.method284(this.anInt921);
									this.aClass1_Sub1_Sub4_8.method284(this.anInt892);
									this.aClass1_Sub1_Sub4_8.method284(this.anInt951);
								}
							}
							this.aString30 = "";
							this.aBoolean199 = true;
						}
					}
				}
			}
		} catch (@Pc(1119) RuntimeException local1119) {
			signlink.reporterror("29316, " + 56 + ", " + local1119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
	private int method607(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = arg1 >> 7;
			@Pc(7) int local7 = arg0 >> 7;
			if (local3 < 0 || local7 < 0 || local3 > 103 || local7 > 103) {
				return 0;
			}
			@Pc(30) int local30 = arg2;
			if (arg2 < 3 && (this.aByteArrayArrayArray8[1][local3][local7] & 0x2) == 2) {
				local30 = arg2 + 1;
			}
			@Pc(50) int local50 = arg1 & 0x7F;
			@Pc(54) int local54 = arg0 & 0x7F;
			@Pc(82) int local82 = this.anIntArrayArrayArray8[local30][local3][local7] * (128 - local50) + this.anIntArrayArrayArray8[local30][local3 + 1][local7] * local50 >> 7;
			@Pc(114) int local114 = this.anIntArrayArrayArray8[local30][local3][local7 + 1] * (128 - local50) + this.anIntArrayArrayArray8[local30][local3 + 1][local7 + 1] * local50 >> 7;
			return local82 * (128 - local54) + local114 * local54 >> 7;
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("27191, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method608() {
		try {
			@Pc(4) int local4 = this.anInt1026;
			@Pc(7) int local7 = this.anInt1027;
			@Pc(10) int local10 = this.anInt1028;
			@Pc(13) int local13 = this.anInt1029;
			Class1_Sub1_Sub2.method517(6116423, local13, local4, local7, local10);
			Class1_Sub1_Sub2.method517(0, 16, local4 + 1, local7 + 1, local10 - 2);
			Class1_Sub1_Sub2.method518(local13 - 19, 0, local10 - 2, local7 + 18, local4 + 1);
			this.aClass1_Sub1_Sub2_Sub1_4.method73((byte) 6, local7 + 14, "Choose Option", local4 + 3, 6116423);
			@Pc(65) int local65 = super.anInt814;
			@Pc(68) int local68 = super.anInt815;
			if (this.anInt1025 == 0) {
				local65 -= 4;
				local68 -= 4;
			}
			if (this.anInt1025 == 1) {
				local65 -= 553;
				local68 -= 205;
			}
			if (this.anInt1025 == 2) {
				local65 -= 17;
				local68 -= 357;
			}
			for (@Pc(94) int local94 = 0; local94 < this.anInt885; local94++) {
				@Pc(109) int local109 = local7 + (this.anInt885 - 1 - local94) * 15 + 31;
				@Pc(111) int local111 = 16777215;
				if (local65 > local4 && local65 < local4 + local10 && local68 > local109 - 13 && local68 < local109 + 3) {
					local111 = 16776960;
				}
				this.aClass1_Sub1_Sub2_Sub1_4.method77(local4 + 3, local109, true, this.aStringArray10[local94], local111);
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("22641, " + -705 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean185) {
			this.method599();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method609(@OriginalArg(0) byte arg0) {
		try {
			if (super.aClass8_2 == null) {
				this.method673();
				this.aClass8_12 = null;
				this.aClass8_13 = null;
				this.aClass8_14 = null;
				this.aClass8_15 = null;
				@Pc(23) boolean local23 = false;
				this.aClass8_16 = null;
				this.aClass8_17 = null;
				this.aClass8_18 = null;
				this.aClass8_19 = null;
				this.aClass8_20 = null;
				this.aClass8_27 = null;
				this.aClass8_25 = null;
				this.aClass8_24 = null;
				this.aClass8_26 = null;
				this.aClass8_21 = null;
				this.aClass8_22 = null;
				this.aClass8_23 = null;
				super.aClass8_2 = new Class8(503, 765, this.method584(), anInt974);
				this.aBoolean197 = true;
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("72557, " + arg0 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method610() {
		try {
			if (this.anInt1023 == 2) {
				this.method686((this.anInt848 - this.anInt895 << 7) + this.anInt851, this.anInt849 * 2, (this.anInt847 - this.anInt894 << 7) + this.anInt850);
				if (this.anInt1037 > -1 && anInt1007 % 20 < 10) {
					this.aClass1_Sub1_Sub2_Sub3Array7[0].method172(this.anInt1037 - 12, this.anInt1038 - 28);
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("21843, " + 100 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/lang/String;)V")
	@Override
	protected void method586(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		try {
			this.anInt1043 = arg0;
			this.aString20 = arg1;
			this.method614();
			if (this.aClass15_2 == null) {
				super.method586(arg0, arg1);
			} else {
				this.aClass8_14.method133();
				this.aClass1_Sub1_Sub2_Sub1_4.method69(16777215, "RuneScape is loading - please wait...", 54, 180);
				Class1_Sub1_Sub2.method518(34, 9179409, 304, 62, 28);
				Class1_Sub1_Sub2.method518(32, 0, 302, 63, 29);
				Class1_Sub1_Sub2.method517(9179409, 30, 30, 64, arg0 * 3);
				Class1_Sub1_Sub2.method517(0, 30, arg0 * 3 + 30, 64, 300 - arg0 * 3);
				this.aClass1_Sub1_Sub2_Sub1_4.method69(16777215, arg1, 85, 180);
				this.aClass8_14.method134(super.aGraphics2, 171, 202);
				if (this.aBoolean197) {
					this.aBoolean197 = false;
					if (!this.aBoolean206) {
						this.aClass8_15.method134(super.aGraphics2, 0, 0);
						this.aClass8_16.method134(super.aGraphics2, 0, 637);
					}
					this.aClass8_12.method134(super.aGraphics2, 0, 128);
					this.aClass8_13.method134(super.aGraphics2, 371, 202);
					this.aClass8_17.method134(super.aGraphics2, 265, 0);
					this.aClass8_18.method134(super.aGraphics2, 265, 562);
					this.aClass8_19.method134(super.aGraphics2, 171, 128);
					this.aClass8_20.method134(super.aGraphics2, 171, 562);
				}
			}
		} catch (@Pc(216) RuntimeException local216) {
			signlink.reporterror("28326, " + -618 + ", " + arg0 + ", " + arg1 + ", " + local216.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method611() {
		try {
			this.anInt840++;
			this.method633(true, this.anInt1035);
			this.method680(true, (byte) 7);
			this.method633(false, this.anInt1035);
			this.method680(false, (byte) 7);
			this.method601();
			this.method691(this.anInt875);
			@Pc(38) int local38;
			@Pc(77) int local77;
			if (!this.aBoolean186) {
				local38 = this.anInt975;
				if (this.anInt1041 / 256 > local38) {
					local38 = this.anInt1041 / 256;
				}
				if (this.aBooleanArray12[4] && this.anIntArray266[4] + 128 > local38) {
					local38 = this.anIntArray266[4] + 128;
				}
				local77 = this.anInt976 + this.anInt876 & 0x7FF;
				this.method696(local38 * 3 + 600, this.method607(aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt232, aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt231, this.anInt995) - 50, this.anInt873, local77, local38, this.anInt872);
			}
			if (this.aBoolean186) {
				local38 = this.method653(this.anInt958);
			} else {
				local38 = this.method652();
			}
			local77 = this.anInt946;
			@Pc(122) int local122 = this.anInt947;
			@Pc(125) int local125 = this.anInt948;
			@Pc(128) int local128 = this.anInt949;
			@Pc(131) int local131 = this.anInt950;
			@Pc(180) int local180;
			for (@Pc(133) int local133 = 0; local133 < 5; local133++) {
				if (this.aBooleanArray12[local133]) {
					local180 = (int) (Math.random() * (double) (this.anIntArray275[local133] * 2 + 1) - (double) this.anIntArray275[local133] + Math.sin((double) this.anIntArray261[local133] * ((double) this.anIntArray226[local133] / 100.0D)) * (double) this.anIntArray266[local133]);
					if (local133 == 0) {
						this.anInt946 += local180;
					}
					if (local133 == 1) {
						this.anInt947 += local180;
					}
					if (local133 == 2) {
						this.anInt948 += local180;
					}
					if (local133 == 3) {
						this.anInt950 = this.anInt950 + local180 & 0x7FF;
					}
					if (local133 == 4) {
						this.anInt949 += local180;
						if (this.anInt949 < 128) {
							this.anInt949 = 128;
						}
						if (this.anInt949 > 383) {
							this.anInt949 = 383;
						}
					}
				}
			}
			local180 = Class1_Sub1_Sub2_Sub4.anInt745;
			Class1_Sub1_Sub1_Sub4.aBoolean126 = true;
			Class1_Sub1_Sub1_Sub4.anInt619 = 0;
			Class1_Sub1_Sub1_Sub4.anInt617 = super.anInt814 - 4;
			Class1_Sub1_Sub1_Sub4.anInt618 = super.anInt815 - 4;
			Class1_Sub1_Sub2.method515();
			this.aClass18_1.method230(this.anInt949, this.anInt947, local38, this.anInt950, this.anInt948, this.anInt946);
			this.aClass18_1.method205();
			this.method704();
			this.method610();
			this.method630(local180);
			this.method719(this.anInt859);
			this.aClass8_26.method134(super.aGraphics2, 4, 4);
			this.anInt946 = local77;
			this.anInt947 = local122;
			this.anInt948 = local125;
			this.anInt949 = local128;
			this.anInt950 = local131;
		} catch (@Pc(329) RuntimeException local329) {
			signlink.reporterror("90675, " + true + ", " + local329.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;)Z")
	private boolean method612(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(15) int local15 = 0; local15 < this.anInt827; local15++) {
				if (arg0.equalsIgnoreCase(this.aStringArray12[local15])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString5);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("87103, " + -238 + ", " + arg0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	@Override
	protected void method582() {
		try {
			if (this.aBoolean224 || this.aBoolean196 || this.aBoolean207) {
				this.method677();
			} else {
				anInt945++;
				if (this.aBoolean188) {
					this.method598();
				} else {
					this.method679(false);
				}
				this.anInt899 = 0;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("37585, " + true + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!MVHXDWGI;I)V")
	private void method613(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub4 arg1, @OriginalArg(2) int arg2) {
		try {
			arg1.method304();
			@Pc(9) int local9 = arg1.method305(8);
			@Pc(13) boolean local13 = true;
			@Pc(19) int local19;
			if (local9 < this.anInt1045) {
				for (local19 = local9; local19 < this.anInt1045; local19++) {
					this.anIntArray219[this.anInt880++] = this.anIntArray274[local19];
				}
			}
			if (local9 > this.anInt1045) {
				signlink.reporterror(this.aString27 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt1045 = 0;
			for (local19 = 0; local19 < local9; local19++) {
				@Pc(71) int local71 = this.anIntArray274[local19];
				@Pc(76) Class1_Sub1_Sub1_Sub1_Sub1 local76 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local71];
				@Pc(81) int local81 = arg1.method305(1);
				if (local81 == 0) {
					this.anIntArray274[this.anInt1045++] = local71;
					local76.anInt217 = anInt1007;
				} else {
					@Pc(104) int local104 = arg1.method305(2);
					if (local104 == 0) {
						this.anIntArray274[this.anInt1045++] = local71;
						local76.anInt217 = anInt1007;
						this.anIntArray213[this.anInt837++] = local71;
					} else {
						@Pc(155) int local155;
						@Pc(165) int local165;
						if (local104 == 1) {
							this.anIntArray274[this.anInt1045++] = local71;
							local76.anInt217 = anInt1007;
							local155 = arg1.method305(3);
							local76.method109(local155, false);
							local165 = arg1.method305(1);
							if (local165 == 1) {
								this.anIntArray213[this.anInt837++] = local71;
							}
						} else if (local104 == 2) {
							this.anIntArray274[this.anInt1045++] = local71;
							local76.anInt217 = anInt1007;
							local155 = arg1.method305(3);
							local76.method109(local155, true);
							local165 = arg1.method305(3);
							local76.method109(local165, true);
							@Pc(223) int local223 = arg1.method305(1);
							if (local223 == 1) {
								this.anIntArray213[this.anInt837++] = local71;
							}
						} else if (local104 == 3) {
							this.anIntArray219[this.anInt880++] = local71;
						}
					}
				}
			}
		} catch (@Pc(260) RuntimeException local260) {
			signlink.reporterror("54277, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local260.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method614() {
		try {
			if (this.aClass8_12 == null) {
				super.aClass8_2 = null;
				this.aClass8_27 = null;
				this.aClass8_25 = null;
				this.aClass8_24 = null;
				this.aClass8_26 = null;
				this.aClass8_21 = null;
				this.aClass8_22 = null;
				this.aClass8_23 = null;
				this.aClass8_15 = new Class8(265, 128, this.method584(), anInt974);
				Class1_Sub1_Sub2.method515();
				this.aClass8_16 = new Class8(265, 128, this.method584(), anInt974);
				Class1_Sub1_Sub2.method515();
				this.aClass8_12 = new Class8(171, 509, this.method584(), anInt974);
				Class1_Sub1_Sub2.method515();
				this.aClass8_13 = new Class8(132, 360, this.method584(), anInt974);
				Class1_Sub1_Sub2.method515();
				this.aClass8_14 = new Class8(200, 360, this.method584(), anInt974);
				Class1_Sub1_Sub2.method515();
				this.aClass8_17 = new Class8(238, 202, this.method584(), anInt974);
				Class1_Sub1_Sub2.method515();
				this.aClass8_18 = new Class8(238, 203, this.method584(), anInt974);
				Class1_Sub1_Sub2.method515();
				this.aClass8_19 = new Class8(94, 74, this.method584(), anInt974);
				Class1_Sub1_Sub2.method515();
				this.anInt1030 += 0;
				this.aClass8_20 = new Class8(94, 75, this.method584(), anInt974);
				Class1_Sub1_Sub2.method515();
				if (this.aClass15_2 != null) {
					this.method688();
					this.method725(anInt831);
				}
				this.aBoolean197 = true;
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("84577, " + 0 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method615() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt836; local3++) {
				if (local3 == -1) {
					local11 = this.anInt835;
				} else {
					local11 = this.anIntArray212[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub2 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local11];
				if (local23 != null && local23.anInt240 > 0) {
					local23.anInt240--;
					if (local23.anInt240 == 0) {
						local23.aString4 = null;
					}
				}
			}
			for (local11 = 0; local11 < this.anInt1045; local11++) {
				@Pc(58) int local58 = this.anIntArray274[local11];
				@Pc(63) Class1_Sub1_Sub1_Sub1_Sub1 local63 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local58];
				if (local63 != null && local63.anInt240 > 0) {
					local63.anInt240--;
					if (local63.anInt240 == 0) {
						local63.aString4 = null;
					}
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("4631, " + 44732 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)V")
	private void method616(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method617() {
		try {
			if (this.anInt1055 != 0) {
				@Pc(6) Class1_Sub1_Sub2_Sub1 local6 = this.aClass1_Sub1_Sub2_Sub1_3;
				@Pc(12) int local12 = 0;
				if (this.anInt1015 != 0) {
					local12 = 1;
				}
				for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
					if (this.aStringArray14[local19] != null) {
						@Pc(31) int local31 = this.anIntArray273[local19];
						@Pc(36) String local36 = this.aStringArray13[local19];
						@Pc(38) byte local38 = 0;
						if (local36 != null && local36.startsWith("@cr1@")) {
							local36 = local36.substring(5);
							local38 = 1;
						}
						if (local36 != null && local36.startsWith("@cr2@")) {
							local36 = local36.substring(5);
							local38 = 2;
						}
						@Pc(89) int local89;
						if ((local31 == 3 || local31 == 7) && (local31 == 7 || this.anInt892 == 0 || this.anInt892 == 1 && this.method612(local36))) {
							local89 = 329 - local12 * 13;
							local6.method73((byte) 6, local89, "From", 4, 0);
							local6.method73((byte) 6, local89 - 1, "From", 4, 65535);
							@Pc(114) int local114 = local6.method71("From ") + 4;
							if (local38 == 1) {
								this.aClass1_Sub1_Sub2_Sub2Array3[0].method103(local114, local89 - 12);
								local114 += 14;
							}
							if (local38 == 2) {
								this.aClass1_Sub1_Sub2_Sub2Array3[1].method103(local114, local89 - 12);
								local114 += 14;
							}
							local6.method73((byte) 6, local89, local36 + ": " + this.aStringArray14[local19], local114, 0);
							local6.method73((byte) 6, local89 - 1, local36 + ": " + this.aStringArray14[local19], local114, 65535);
							local12++;
							if (local12 >= 5) {
								return;
							}
						}
						if (local31 == 5 && this.anInt892 < 2) {
							local89 = 329 - local12 * 13;
							local6.method73((byte) 6, local89, this.aStringArray14[local19], 4, 0);
							local6.method73((byte) 6, local89 - 1, this.aStringArray14[local19], 4, 65535);
							local12++;
							if (local12 >= 5) {
								return;
							}
						}
						if (local31 == 6 && this.anInt892 < 2) {
							local89 = 329 - local12 * 13;
							local6.method73((byte) 6, local89, "To " + local36 + ": " + this.aStringArray14[local19], 4, 0);
							local6.method73((byte) 6, local89 - 1, "To " + local36 + ": " + this.aStringArray14[local19], 4, 65535);
							local12++;
							if (local12 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("31053, " + -8180 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;IIILjava/lang/String;I)Lclient!IEMHZJLX;")
	private Class15 method618(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(10) byte[] local10 = null;
			@Pc(12) int local12 = 5;
			try {
				if (this.aClass34Array1[0] != null) {
					local10 = this.aClass34Array1[0].method436(403, arg4);
				}
			} catch (@Pc(27) Exception local27) {
			}
			@Pc(41) int local41;
			if (local10 != null) {
				this.aCRC32_2.reset();
				this.aCRC32_2.update(local10);
				local41 = (int) this.aCRC32_2.getValue();
				if (local41 != arg1) {
					local10 = null;
				}
			}
			if (local10 != null) {
				return new Class15((byte) 5, local10);
			}
			local41 = 0;
			while (local10 == null) {
				@Pc(62) String local62 = "Unknown error";
				this.method586(arg2, "Requesting " + arg0);
				@Pc(77) int local77;
				try {
					local77 = 0;
					@Pc(88) DataInputStream local88 = this.method708(arg3 + arg1);
					@Pc(91) byte[] local91 = new byte[6];
					local88.readFully(local91, 0, 6);
					@Pc(102) Class1_Sub1_Sub4 local102 = new Class1_Sub1_Sub4(0, local91);
					local102.anInt529 = 3;
					@Pc(110) int local110 = local102.method298() + 6;
					@Pc(112) int local112 = 6;
					local10 = new byte[local110];
					for (@Pc(117) int local117 = 0; local117 < 6; local117++) {
						local10[local117] = local91[local117];
					}
					@Pc(135) int local135;
					while (local112 < local110) {
						local135 = local110 - local112;
						if (local135 > 1000) {
							local135 = 1000;
						}
						@Pc(146) int local146 = local88.read(local10, local112, local135);
						if (local146 < 0) {
							(new StringBuffer("Length error: ")).append(local112).append("/").append(local110).toString();
							throw new IOException("EOF");
						}
						local112 += local146;
						@Pc(175) int local175 = local112 * 100 / local110;
						if (local175 != local77) {
							this.method586(arg2, "Loading " + arg0 + " - " + local175 + "%");
						}
						local77 = local175;
					}
					local88.close();
					try {
						if (this.aClass34Array1[0] != null) {
							this.aClass34Array1[0].method437(arg4, local10.length, local10);
						}
					} catch (@Pc(220) Exception local220) {
						this.aClass34Array1[0] = null;
					}
					if (local10 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local10);
						local135 = (int) this.aCRC32_2.getValue();
						if (local135 != arg1) {
							local10 = null;
							local41++;
							local62 = "Checksum error: " + local135;
						}
					}
				} catch (@Pc(255) IOException local255) {
					if (local62.equals("Unknown error")) {
						local62 = "Connection error";
					}
					local10 = null;
				} catch (@Pc(265) NullPointerException local265) {
					local62 = "Null error";
					local10 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(274) ArrayIndexOutOfBoundsException local274) {
					local62 = "Bounds error";
					local10 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(283) Exception local283) {
					local62 = "Unexpected error";
					local10 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local10 == null) {
					for (local77 = local12; local77 > 0; local77--) {
						if (local41 >= 3) {
							this.method586(arg2, "Game updated - please reload page");
							local77 = 10;
						} else {
							this.method586(arg2, local62 + " - Retrying in " + local77);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(327) Exception local327) {
						}
					}
					local12 *= 2;
					if (local12 > 60) {
						local12 = 60;
					}
					this.aBoolean193 = !this.aBoolean193;
				}
			}
			return new Class15((byte) 5, local10);
		} catch (@Pc(359) RuntimeException local359) {
			signlink.reporterror("32706, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local359.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method619() {
		try {
			Class5.aClass46_4.method559();
			Class5.aClass46_5.method559();
			Class21.aClass46_6.method559();
			Class3.aClass46_2.method559();
			if (this.aByte33 != 2) {
				for (@Pc(13) int local13 = 1; local13 > 0; local13++) {
				}
			}
			Class3.aClass46_1.method559();
			Class1_Sub1_Sub1_Sub1_Sub2.aClass46_3.method559();
			Class25.aClass46_7.method559();
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("72256, " + 2 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JB)V")
	private void method620(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt1013 >= 100) {
					this.method639("Your ignore list is full. Max of 100 hit", 0, "");
				} else {
					@Pc(23) String local23 = Class41.method508(Class41.method505(arg0));
					for (@Pc(25) int local25 = 0; local25 < this.anInt1013; local25++) {
						if (this.aLongArray3[local25] == arg0) {
							this.method639(local23 + " is already on your ignore list", 0, "");
							return;
						}
					}
					for (@Pc(55) int local55 = 0; local55 < this.anInt827; local55++) {
						if (this.aLongArray4[local55] == arg0) {
							this.method639("Please remove " + local23 + " from your friend list first", 0, "");
							return;
						}
					}
					this.aLongArray3[this.anInt1013++] = arg0;
					this.aBoolean194 = true;
					this.aClass1_Sub1_Sub4_8.method283(104);
					this.aClass1_Sub1_Sub4_8.method290(arg0);
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("11912, " + arg0 + ", " + -99 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!XEHNJCHN;Z)V")
	private void method621(@OriginalArg(0) Class1_Sub3 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt796 == 0) {
				local1 = this.aClass18_1.method217(arg0.anInt795, arg0.anInt797, arg0.anInt798);
			}
			if (arg0.anInt796 == 1) {
				local1 = this.aClass18_1.method218(arg0.anInt797, arg0.anInt798, arg0.anInt795);
			}
			if (arg0.anInt796 == 2) {
				local1 = this.aClass18_1.method219(arg0.anInt795, arg0.anInt797, arg0.anInt798);
			}
			if (arg0.anInt796 == 3) {
				local1 = this.aClass18_1.method220(arg0.anInt795, arg0.anInt797, arg0.anInt798);
			}
			if (local1 != 0) {
				@Pc(76) int local76 = this.aClass18_1.method221(arg0.anInt795, arg0.anInt797, arg0.anInt798, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local76 & 0x1F;
				local7 = local76 >> 6;
			}
			arg0.anInt787 = local3;
			arg0.anInt789 = local5;
			arg0.anInt788 = local7;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("11189, " + arg0 + ", " + false + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!MYGSUHVG;I)V")
	private void method622(@OriginalArg(0) Class27 arg0) {
		try {
			@Pc(9) int local9 = arg0.anInt567;
			@Pc(65) int local65;
			if ((local9 < 1 || local9 > 100) && (local9 < 701 || local9 > 800)) {
				if (local9 >= 101 && local9 <= 200 || !(local9 < 801 || local9 > 900)) {
					local65 = this.anInt827;
					if (this.anInt828 != 2) {
						local65 = 0;
					}
					if (local9 > 800) {
						local9 -= 701;
					} else {
						local9 -= 101;
					}
					if (local9 >= local65) {
						arg0.aString10 = "";
						arg0.anInt559 = 0;
					} else {
						if (this.anIntArray215[local9] == 0) {
							arg0.aString10 = "@red@Offline";
						} else if (this.anIntArray215[local9] < 200) {
							if (this.anIntArray215[local9] == anInt955) {
								arg0.aString10 = "@gre@World" + (this.anIntArray215[local9] - 9);
							} else {
								arg0.aString10 = "@yel@World" + (this.anIntArray215[local9] - 9);
							}
						} else if (this.anIntArray215[local9] == anInt955) {
							arg0.aString10 = "@gre@Classic" + (this.anIntArray215[local9] - 219);
						} else {
							arg0.aString10 = "@yel@Classic" + (this.anIntArray215[local9] - 219);
						}
						arg0.anInt559 = 1;
					}
				} else if (local9 == 203) {
					local65 = this.anInt827;
					if (this.anInt828 != 2) {
						local65 = 0;
					}
					arg0.anInt568 = local65 * 15 + 20;
					if (arg0.anInt568 <= arg0.anInt538) {
						arg0.anInt568 = arg0.anInt538 + 1;
					}
				} else if (local9 >= 401 && local9 <= 500) {
					local9 -= 401;
					if (local9 == 0 && this.anInt828 == 0) {
						arg0.aString10 = "Loading ignore list";
						arg0.anInt559 = 0;
					} else if (local9 == 1 && this.anInt828 == 0) {
						arg0.aString10 = "Please wait...";
						arg0.anInt559 = 0;
					} else {
						local65 = this.anInt1013;
						if (this.anInt828 == 0) {
							local65 = 0;
						}
						if (local9 >= local65) {
							arg0.aString10 = "";
							arg0.anInt559 = 0;
						} else {
							arg0.aString10 = Class41.method508(Class41.method505(this.aLongArray3[local9]));
							arg0.anInt559 = 1;
						}
					}
				} else if (local9 == 503) {
					arg0.anInt568 = this.anInt1013 * 15 + 20;
					if (arg0.anInt568 <= arg0.anInt538) {
						arg0.anInt568 = arg0.anInt538 + 1;
					}
				} else if (local9 == 327) {
					arg0.anInt552 = 150;
					arg0.anInt553 = (int) (Math.sin((double) anInt1007 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean215) {
						for (local65 = 0; local65 < 7; local65++) {
							@Pc(378) int local378 = this.anIntArray271[local65];
							if (local378 >= 0 && !Class24.aClass24Array1[local378].method272()) {
								return;
							}
						}
						this.aBoolean215 = false;
						@Pc(397) Class1_Sub1_Sub1_Sub4[] local397 = new Class1_Sub1_Sub1_Sub4[7];
						@Pc(399) int local399 = 0;
						for (@Pc(401) int local401 = 0; local401 < 7; local401++) {
							@Pc(408) int local408 = this.anIntArray271[local401];
							if (local408 >= 0) {
								local397[local399++] = Class24.aClass24Array1[local408].method273();
							}
						}
						@Pc(430) Class1_Sub1_Sub1_Sub4 local430 = new Class1_Sub1_Sub1_Sub4(local397, local399, 0);
						for (@Pc(432) int local432 = 0; local432 < 5; local432++) {
							if (this.anIntArray231[local432] != 0) {
								local430.method377(anIntArrayArray24[local432][0], anIntArrayArray24[local432][this.anIntArray231[local432]]);
								if (local432 == 1) {
									local430.method377(anIntArray250[0], anIntArray250[this.anIntArray231[local432]]);
								}
							}
						}
						local430.method370();
						local430.method371(Class19.aClass19Array1[aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt235].anIntArray82[0]);
						local430.method380(64, 850, -30, -50, -30, true);
						arg0.anInt546 = 5;
						arg0.anInt547 = 0;
						Class27.method331(local430);
					}
				} else if (local9 == 324) {
					if (this.aClass1_Sub1_Sub2_Sub3_10 == null) {
						this.aClass1_Sub1_Sub2_Sub3_10 = arg0.aClass1_Sub1_Sub2_Sub3_2;
						this.aClass1_Sub1_Sub2_Sub3_11 = arg0.aClass1_Sub1_Sub2_Sub3_1;
					}
					if (this.aBoolean208) {
						arg0.aClass1_Sub1_Sub2_Sub3_2 = this.aClass1_Sub1_Sub2_Sub3_11;
					} else {
						arg0.aClass1_Sub1_Sub2_Sub3_2 = this.aClass1_Sub1_Sub2_Sub3_10;
					}
				} else if (local9 == 325) {
					if (this.aClass1_Sub1_Sub2_Sub3_10 == null) {
						this.aClass1_Sub1_Sub2_Sub3_10 = arg0.aClass1_Sub1_Sub2_Sub3_2;
						this.aClass1_Sub1_Sub2_Sub3_11 = arg0.aClass1_Sub1_Sub2_Sub3_1;
					}
					if (this.aBoolean208) {
						arg0.aClass1_Sub1_Sub2_Sub3_2 = this.aClass1_Sub1_Sub2_Sub3_10;
					} else {
						arg0.aClass1_Sub1_Sub2_Sub3_2 = this.aClass1_Sub1_Sub2_Sub3_11;
					}
				} else if (local9 == 600) {
					arg0.aString10 = this.aString31;
					if (anInt1007 % 20 < 10) {
						arg0.aString10 = arg0.aString10 + "|";
					} else {
						arg0.aString10 = arg0.aString10 + " ";
					}
				} else {
					if (local9 == 620) {
						if (this.anInt980 < 1) {
							arg0.aString10 = "";
						} else if (this.aBoolean219) {
							arg0.anInt558 = 16711680;
							arg0.aString10 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt558 = 16777215;
							arg0.aString10 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(637) String local637;
					if (local9 == 660) {
						local65 = this.anInt940 - this.anInt884;
						if (local65 <= 0) {
							local637 = "earlier today";
						} else if (local65 == 1) {
							local637 = "yesterday";
						} else {
							local637 = local65 + " days ago";
						}
						arg0.aString10 = "You last logged in @red@" + local637 + "@bla@ from: @red@" + signlink.dns;
					}
					if (local9 == 661) {
						if (this.anInt998 == 0) {
							arg0.aString10 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
						} else if (this.anInt998 <= this.anInt940) {
							arg0.aString10 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method623(this.anInt998);
						} else {
							local65 = this.anInt940 + 14 - this.anInt998;
							if (local65 <= 0) {
								local637 = "Earlier today";
							} else if (local65 == 1) {
								local637 = "Yesterday";
							} else {
								local637 = local65 + " days ago";
							}
							arg0.aString10 = local637 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method623(this.anInt998) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
						}
					}
					if (local9 == 662) {
						@Pc(755) String local755;
						if (this.anInt825 == 0) {
							local755 = "@yel@0 unread messages";
						} else if (this.anInt825 == 1) {
							local755 = "@gre@1 unread message";
						} else {
							local755 = "@gre@" + this.anInt825 + " unread messages";
						}
						arg0.aString10 = "You have " + local755 + "\\nin your message centre.";
					}
					if (local9 == 663) {
						if (this.anInt982 > 0 && this.anInt982 <= this.anInt940 + 10) {
							arg0.aString10 = "Last password change:\\n@gre@" + this.method623(this.anInt982);
						} else {
							arg0.aString10 = "Last password change:\\n@gre@Never changed";
						}
					}
					if (local9 == 665) {
						if (this.anInt969 > 2 && !aBoolean204) {
							arg0.aString10 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
						} else if (this.anInt969 > 2) {
							arg0.aString10 = "\\n\\nYou have @gre@" + this.anInt969 + "@yel@ days of\\nmember credit remaining.";
						} else if (this.anInt969 > 0) {
							arg0.aString10 = "You have @gre@" + this.anInt969 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
						} else {
							arg0.aString10 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
						}
					}
					if (local9 == 667) {
						if (this.anInt969 > 2 && !aBoolean204) {
							arg0.aString10 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
						} else if (this.anInt969 > 0) {
							arg0.aString10 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
						} else {
							arg0.aString10 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
						}
					}
					if (local9 == 668) {
						if (this.anInt998 > this.anInt940) {
							arg0.aString10 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
						} else {
							arg0.aString10 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
						}
					}
				}
			} else if (local9 == 1 && this.anInt828 == 0) {
				arg0.aString10 = "Loading friend list";
				arg0.anInt559 = 0;
			} else if (local9 == 1 && this.anInt828 == 1) {
				arg0.aString10 = "Connecting to friendserver";
				arg0.anInt559 = 0;
			} else if (local9 == 2 && this.anInt828 != 2) {
				arg0.aString10 = "Please wait...";
				arg0.anInt559 = 0;
			} else {
				local65 = this.anInt827;
				if (this.anInt828 != 2) {
					local65 = 0;
				}
				if (local9 > 700) {
					local9 -= 601;
				} else {
					local9--;
				}
				if (local9 >= local65) {
					arg0.aString10 = "";
					arg0.anInt559 = 0;
				} else {
					arg0.aString10 = this.aStringArray12[local9];
					arg0.anInt559 = 1;
				}
			}
		} catch (@Pc(912) RuntimeException local912) {
			signlink.reporterror("58573, " + arg0 + ", " + -519 + ", " + local912.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	private String method623(@OriginalArg(1) int arg0) {
		try {
			if (arg0 > this.anInt940 + 10) {
				return "Unknown";
			}
			@Pc(14) long local14 = ((long) arg0 + 11745L) * 86400000L;
			@Pc(16) Calendar local16 = Calendar.getInstance();
			local16.setTime(new Date(local14));
			this.aBoolean188 &= true;
			@Pc(32) int local32 = local16.get(5);
			@Pc(36) int local36 = local16.get(2);
			@Pc(40) int local40 = local16.get(1);
			@Pc(91) String[] local91 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
			return local32 + "-" + local91[local36] + "-" + local40;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("31386, " + true + ", " + arg0 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method624(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass1_Sub1_Sub2_Sub3_6.anIntArray62;
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
						this.aClass18_1.method226(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass18_1.method226(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass1_Sub1_Sub2_Sub3_6.method167();
			@Pc(146) int local146;
			for (@Pc(142) int local142 = 1; local142 < 103; local142++) {
				for (local146 = 1; local146 < 103; local146++) {
					if ((this.aByteArrayArrayArray8[arg0][local146][local142] & 0x18) == 0) {
						this.method711(local36, local142, arg0, local146, local34);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local146][local142] & 0x8) != 0) {
						this.method711(local36, local142, arg0 + 1, local146, local34);
					}
				}
			}
			if (this.aClass8_26 != null) {
				this.aClass8_26.method133();
				Class1_Sub1_Sub2_Sub4.anIntArray197 = this.anIntArray256;
			}
			this.anInt911 = 0;
			for (local146 = 0; local146 < 104; local146++) {
				for (@Pc(224) int local224 = 0; local224 < 104; local224++) {
					@Pc(234) int local234 = this.aClass18_1.method220(this.anInt995, local146, local224);
					if (local234 != 0) {
						local234 = local234 >> 14 & 0x7FFF;
						@Pc(246) int local246 = Class5.method130(local234).anInt267;
						if (local246 >= 0) {
							@Pc(250) int local250 = local146;
							@Pc(252) int local252 = local224;
							if (local246 != 22 && local246 != 29 && local246 != 34 && local246 != 36 && local246 != 46 && local246 != 47 && local246 != 48) {
								@Pc(284) int[][] local284 = this.aClass22Array1[this.anInt995].anIntArrayArray6;
								for (@Pc(286) int local286 = 0; local286 < 10; local286++) {
									@Pc(293) int local293 = (int) (Math.random() * 4.0D);
									if (local293 == 0 && local250 > 0 && local250 > local146 - 3 && (local284[local250 - 1][local252] & 0x1280108) == 0) {
										local250--;
									}
									if (local293 == 1 && local250 < 103 && local250 < local146 + 3 && (local284[local250 + 1][local252] & 0x1280180) == 0) {
										local250++;
									}
									if (local293 == 2 && local252 > 0 && local252 > local224 - 3 && (local284[local250][local252 - 1] & 0x1280102) == 0) {
										local252--;
									}
									if (local293 == 3 && local252 < 103 && local252 < local224 + 3 && (local284[local250][local252 + 1] & 0x1280120) == 0) {
										local252++;
									}
								}
							}
							this.aClass1_Sub1_Sub2_Sub3Array9[this.anInt911] = this.aClass1_Sub1_Sub2_Sub3Array5[local246];
							this.anIntArray227[this.anInt911] = local250;
							this.anIntArray228[this.anInt911] = local252;
							this.anInt911++;
						}
					}
				}
			}
			anInt1036++;
			if (anInt1036 > 88) {
				anInt1036 = 0;
				this.aClass1_Sub1_Sub4_8.method283(45);
			}
		} catch (@Pc(437) RuntimeException local437) {
			signlink.reporterror("38017, " + arg0 + ", " + -114 + ", " + local437.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method625() {
		try {
			this.aClass8_27.method133();
			Class1_Sub1_Sub2_Sub4.anIntArray197 = this.anIntArray254;
			this.aClass1_Sub1_Sub2_Sub2_13.method103(0, 0);
			if (this.aBoolean195) {
				this.aClass1_Sub1_Sub2_Sub1_4.method69(0, this.aString23, 40, 239);
				this.aClass1_Sub1_Sub2_Sub1_4.method69(128, this.aString18 + "*", 60, 239);
			} else if (this.anInt1022 == 1) {
				this.aClass1_Sub1_Sub2_Sub1_4.method69(0, "Enter amount:", 40, 239);
				this.aClass1_Sub1_Sub2_Sub1_4.method69(128, this.aString22 + "*", 60, 239);
			} else if (this.anInt1022 == 2) {
				this.aClass1_Sub1_Sub2_Sub1_4.method69(0, "Enter name:", 40, 239);
				this.aClass1_Sub1_Sub2_Sub1_4.method69(128, this.aString22 + "*", 60, 239);
			} else {
				@Pc(125) Class1_Sub1_Sub2_Sub1 local125;
				@Pc(133) int local133;
				@Pc(144) int local144;
				if (this.anInt1022 == 3) {
					if (this.aString22 != this.aString19) {
						this.method702(this.aString22);
						this.aString19 = this.aString22;
					}
					local125 = this.aClass1_Sub1_Sub2_Sub1_3;
					Class1_Sub1_Sub2.method514(0, 0, 77, 463);
					for (local133 = 0; local133 < this.anInt890; local133++) {
						local144 = local133 * 14 + 18 - this.anInt891;
						if (local144 > 0 && local144 < 110) {
							local125.method69(0, this.aStringArray8[local133], local144, 239);
						}
					}
					Class1_Sub1_Sub2.method513();
					if (this.anInt890 > 5) {
						this.method714(this.anInt891, 463, 77, 0, this.anInt890 * 14 + 7);
					}
					if (this.aString22.length() == 0) {
						this.aClass1_Sub1_Sub2_Sub1_4.method69(255, "Enter object name", 40, 239);
					} else if (this.anInt890 == 0) {
						this.aClass1_Sub1_Sub2_Sub1_4.method69(0, "No matching objects found, please shorten search", 40, 239);
					}
					local125.method69(0, this.aString22 + "*", 90, 239);
					Class1_Sub1_Sub2.method520(0, 77, 0, 479);
				} else if (this.aString21 != null) {
					this.aClass1_Sub1_Sub2_Sub1_4.method69(0, this.aString21, 40, 239);
					this.aClass1_Sub1_Sub2_Sub1_4.method69(128, "Click to continue", 60, 239);
				} else if (this.anInt1054 != -1) {
					this.method660(Class27.method339(this.anInt1054), 0, 0, 878, 0);
				} else if (this.anInt1040 == -1) {
					local125 = this.aClass1_Sub1_Sub2_Sub1_3;
					local133 = 0;
					Class1_Sub1_Sub2.method514(0, 0, 77, 463);
					for (local144 = 0; local144 < 100; local144++) {
						if (this.aStringArray14[local144] != null) {
							@Pc(309) int local309 = this.anIntArray273[local144];
							@Pc(318) int local318 = this.anInt926 + 70 - local133 * 14;
							@Pc(323) String local323 = this.aStringArray13[local144];
							@Pc(325) byte local325 = 0;
							if (local323 != null && local323.startsWith("@cr1@")) {
								local323 = local323.substring(5);
								local325 = 1;
							}
							if (local323 != null && local323.startsWith("@cr2@")) {
								local323 = local323.substring(5);
								local325 = 2;
							}
							if (local309 == 0) {
								if (local318 > 0 && local318 < 110) {
									local125.method73((byte) 6, local318, this.aStringArray14[local144], 4, 0);
								}
								local133++;
							}
							@Pc(395) int local395;
							if ((local309 == 1 || local309 == 2) && (local309 == 1 || this.anInt921 == 0 || this.anInt921 == 1 && this.method612(local323))) {
								if (local318 > 0 && local318 < 110) {
									local395 = 4;
									if (local325 == 1) {
										this.aClass1_Sub1_Sub2_Sub2Array3[0].method103(4, local318 - 12);
										local395 += 14;
									}
									if (local325 == 2) {
										this.aClass1_Sub1_Sub2_Sub2Array3[1].method103(local395, local318 - 12);
										local395 += 14;
									}
									local125.method73((byte) 6, local318, local323 + ":", local395, 0);
									local395 += local125.method71(local323) + 8;
									local125.method73((byte) 6, local318, this.aStringArray14[local144], local395, 255);
								}
								local133++;
							}
							if ((local309 == 3 || local309 == 7) && this.anInt1055 == 0 && (local309 == 7 || this.anInt892 == 0 || this.anInt892 == 1 && this.method612(local323))) {
								if (local318 > 0 && local318 < 110) {
									local125.method73((byte) 6, local318, "From", 4, 0);
									local395 = local125.method71("From ") + 4;
									if (local325 == 1) {
										this.aClass1_Sub1_Sub2_Sub2Array3[0].method103(local395, local318 - 12);
										local395 += 14;
									}
									if (local325 == 2) {
										this.aClass1_Sub1_Sub2_Sub2Array3[1].method103(local395, local318 - 12);
										local395 += 14;
									}
									local125.method73((byte) 6, local318, local323 + ":", local395, 0);
									local395 += local125.method71(local323) + 8;
									local125.method73((byte) 6, local318, this.aStringArray14[local144], local395, 8388608);
								}
								local133++;
							}
							if (local309 == 4 && (this.anInt951 == 0 || this.anInt951 == 1 && this.method612(local323))) {
								if (local318 > 0 && local318 < 110) {
									local125.method73((byte) 6, local318, local323 + " " + this.aStringArray14[local144], 4, 8388736);
								}
								local133++;
							}
							if (local309 == 5 && this.anInt1055 == 0 && this.anInt892 < 2) {
								if (local318 > 0 && local318 < 110) {
									local125.method73((byte) 6, local318, this.aStringArray14[local144], 4, 8388608);
								}
								local133++;
							}
							if (local309 == 6 && this.anInt1055 == 0 && this.anInt892 < 2) {
								if (local318 > 0 && local318 < 110) {
									local125.method73((byte) 6, local318, "To " + local323 + ":", 4, 0);
									local125.method73((byte) 6, local318, this.aStringArray14[local144], local125.method71("To " + local323) + 12, 8388608);
								}
								local133++;
							}
							if (local309 == 8 && (this.anInt951 == 0 || this.anInt951 == 1 && this.method612(local323))) {
								if (local318 > 0 && local318 < 110) {
									local125.method73((byte) 6, local318, local323 + " " + this.aStringArray14[local144], 4, 8270336);
								}
								local133++;
							}
						}
					}
					Class1_Sub1_Sub2.method513();
					this.anInt932 = local133 * 14 + 7;
					if (this.anInt932 < 78) {
						this.anInt932 = 78;
					}
					this.method714(this.anInt932 - this.anInt926 - 77, 463, 77, 0, this.anInt932);
					@Pc(765) String local765;
					if (aClass1_Sub1_Sub1_Sub1_Sub2_1 == null || aClass1_Sub1_Sub1_Sub1_Sub2_1.aString5 == null) {
						local765 = Class41.method508(this.aString27);
					} else {
						local765 = aClass1_Sub1_Sub1_Sub1_Sub2_1.aString5;
					}
					local125.method73((byte) 6, 90, local765 + ":", 4, 0);
					local125.method73((byte) 6, 90, this.aString30 + "*", local125.method71(local765 + ": ") + 6, 255);
					Class1_Sub1_Sub2.method520(0, 77, 0, 479);
				} else {
					this.method660(Class27.method339(this.anInt1040), 0, 0, 878, 0);
				}
			}
			if (this.aBoolean200 && this.anInt1025 == 2) {
				this.method608();
			}
			this.aClass8_27.method134(super.aGraphics2, 357, 17);
			this.aClass8_26.method133();
			Class1_Sub1_Sub2_Sub4.anIntArray197 = this.anIntArray256;
		} catch (@Pc(856) RuntimeException local856) {
			signlink.reporterror("88568, " + false + ", " + local856.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method626(@OriginalArg(0) int arg0) {
		try {
			@Pc(12) int local12 = Class36.aClass36Array1[arg0].anInt671;
			if (local12 != 0) {
				@Pc(20) int local20 = this.anIntArray258[arg0];
				if (local12 == 1) {
					if (local20 == 1) {
						Class1_Sub1_Sub2_Sub4.method533(0.9D);
					}
					if (local20 == 2) {
						Class1_Sub1_Sub2_Sub4.method533(0.8D);
					}
					if (local20 == 3) {
						Class1_Sub1_Sub2_Sub4.method533(0.7D);
					}
					if (local20 == 4) {
						Class1_Sub1_Sub2_Sub4.method533(0.6D);
					}
					Class3.aClass46_1.method559();
					this.aBoolean197 = true;
				}
				if (local12 == 3) {
					@Pc(58) boolean local58 = this.aBoolean210;
					if (local20 == 0) {
						this.method643(0, this.aBoolean210, this.anInt886);
						this.aBoolean210 = true;
					}
					if (local20 == 1) {
						this.method643(-400, this.aBoolean210, this.anInt886);
						this.aBoolean210 = true;
					}
					if (local20 == 2) {
						this.method643(-800, this.aBoolean210, this.anInt886);
						this.aBoolean210 = true;
					}
					if (local20 == 3) {
						this.method643(-1200, this.aBoolean210, this.anInt886);
						this.aBoolean210 = true;
					}
					if (local20 == 4) {
						this.aBoolean210 = false;
					}
					if (this.aBoolean210 != local58 && !aBoolean205) {
						if (this.aBoolean210) {
							this.anInt1012 = this.anInt937;
							this.aBoolean214 = true;
							this.aClass28_Sub1_1.method469(2, this.anInt1012);
						} else {
							this.method690();
						}
						this.anInt973 = 0;
					}
				}
				if (local12 == 4) {
					if (local20 == 0) {
						this.aBoolean187 = true;
						this.method670(0);
					}
					if (local20 == 1) {
						this.aBoolean187 = true;
						this.method670(-400);
					}
					if (local20 == 2) {
						this.aBoolean187 = true;
						this.method670(-800);
					}
					if (local20 == 3) {
						this.aBoolean187 = true;
						this.method670(-1200);
					}
					if (local20 == 4) {
						this.aBoolean187 = false;
					}
				}
				if (local12 == 5) {
					this.anInt1050 = local20;
				}
				if (local12 == 6) {
					this.anInt962 = local20;
				}
				if (local12 == 8) {
					this.anInt1055 = local20;
					this.aBoolean199 = true;
				}
				if (local12 == 9) {
					this.anInt903 = local20;
				}
			}
		} catch (@Pc(222) RuntimeException local222) {
			signlink.reporterror("85458, " + arg0 + ", " + -457 + ", " + local222.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method627() {
		try {
			try {
				@Pc(15) int local15 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt231 + this.anInt832;
				@Pc(21) int local21 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt232 + this.anInt990;
				if (this.anInt872 - local15 < -500 || this.anInt872 - local15 > 500 || this.anInt873 - local21 < -500 || this.anInt873 - local21 > 500) {
					this.anInt872 = local15;
					this.anInt873 = local21;
				}
				if (this.anInt872 != local15) {
					this.anInt872 += (local15 - this.anInt872) / 16;
				}
				if (this.anInt873 != local21) {
					this.anInt873 += (local21 - this.anInt873) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt977 += (-this.anInt977 - 24) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt977 += (24 - this.anInt977) / 2;
				} else {
					this.anInt977 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt978 += (12 - this.anInt978) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt978 += (-this.anInt978 - 12) / 2;
				} else {
					this.anInt978 /= 2;
				}
				this.anInt976 = this.anInt976 + this.anInt977 / 2 & 0x7FF;
				this.anInt975 += this.anInt978 / 2;
				if (this.anInt975 < 128) {
					this.anInt975 = 128;
				}
				if (this.anInt975 > 383) {
					this.anInt975 = 383;
				}
				@Pc(208) int local208 = this.anInt872 >> 7;
				@Pc(213) int local213 = this.anInt873 >> 7;
				@Pc(223) int local223 = this.method607(this.anInt873, this.anInt872, this.anInt995);
				@Pc(225) int local225 = 0;
				@Pc(241) int local241;
				if (local208 > 3 && local213 > 3 && local208 < 100 && local213 < 100) {
					for (local241 = local208 - 4; local241 <= local208 + 4; local241++) {
						for (@Pc(247) int local247 = local213 - 4; local247 <= local213 + 4; local247++) {
							@Pc(252) int local252 = this.anInt995;
							if (local252 < 3 && (this.aByteArrayArrayArray8[1][local241][local247] & 0x2) == 2) {
								local252++;
							}
							@Pc(279) int local279 = local223 - this.anIntArrayArrayArray8[local252][local241][local247];
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
				if (local241 > this.anInt1041) {
					this.anInt1041 += (local241 - this.anInt1041) / 24;
				} else if (local241 < this.anInt1041) {
					this.anInt1041 += (local241 - this.anInt1041) / 80;
				}
			} catch (@Pc(343) Exception local343) {
				signlink.reporterror("glfc_ex " + aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt231 + "," + aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt232 + "," + this.anInt872 + "," + this.anInt873 + "," + this.anInt988 + "," + this.anInt989 + "," + this.anInt894 + "," + this.anInt895);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(393) RuntimeException local393) {
			signlink.reporterror("32094, " + 15260 + ", " + local393.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!MVHXDWGI;)V")
	private void method628(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub4 arg2) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt837; local1++) {
				@Pc(8) int local8 = this.anIntArray213[local1];
				@Pc(13) Class1_Sub1_Sub1_Sub1_Sub2 local13 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local8];
				@Pc(16) int local16 = arg2.method294();
				if ((local16 & 0x2) != 0) {
					local16 += arg2.method294() << 8;
				}
				this.method723(local16, local8, local13, arg2);
			}
			if (this.aByte38 == 8) {
				@Pc(45) boolean local45 = false;
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("69519, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIIILclient!LQFHJGYA;)V")
	private void method629(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class21 arg3) {
		try {
			if (this.anInt885 < 400) {
				if (arg3.anIntArray86 != null) {
					arg3 = arg3.method251();
				}
				if (arg3 != null && arg3.aBoolean86) {
					@Pc(23) String local23 = arg3.aString7;
					if (this.aByte37 != 6) {
						anInt831 = this.aClass32_2.method431();
					}
					if (arg3.anInt428 != 0) {
						local23 = local23 + method689(this.aBoolean212, arg3.anInt428, aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt251) + " (level-" + arg3.anInt428 + ")";
					}
					if (this.anInt868 == 1) {
						this.aStringArray10[this.anInt885] = "Use " + this.aString17 + " with @yel@" + local23;
						this.anIntArray240[this.anInt885] = 416;
						this.anIntArray241[this.anInt885] = arg1;
						this.anIntArray238[this.anInt885] = arg0;
						this.anIntArray239[this.anInt885] = arg2;
						this.anInt885++;
					} else if (this.anInt963 != 1) {
						@Pc(170) int local170;
						if (arg3.aStringArray4 != null) {
							for (local170 = 4; local170 >= 0; local170--) {
								if (arg3.aStringArray4[local170] != null && !arg3.aStringArray4[local170].equalsIgnoreCase("attack")) {
									this.aStringArray10[this.anInt885] = arg3.aStringArray4[local170] + " @yel@" + local23;
									if (local170 == 0) {
										this.anIntArray240[this.anInt885] = 950;
									}
									if (local170 == 1) {
										this.anIntArray240[this.anInt885] = 956;
									}
									if (local170 == 2) {
										this.anIntArray240[this.anInt885] = 912;
									}
									if (local170 == 3) {
										this.anIntArray240[this.anInt885] = 804;
									}
									if (local170 == 4) {
										this.anIntArray240[this.anInt885] = 157;
									}
									this.anIntArray241[this.anInt885] = arg1;
									this.anIntArray238[this.anInt885] = arg0;
									this.anIntArray239[this.anInt885] = arg2;
									this.anInt885++;
								}
							}
						}
						if (arg3.aStringArray4 != null) {
							for (local170 = 4; local170 >= 0; local170--) {
								if (arg3.aStringArray4[local170] != null && arg3.aStringArray4[local170].equalsIgnoreCase("attack")) {
									@Pc(294) short local294 = 0;
									if (arg3.anInt428 > aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt251) {
										local294 = 2000;
									}
									this.aStringArray10[this.anInt885] = arg3.aStringArray4[local170] + " @yel@" + local23;
									if (local170 == 0) {
										this.anIntArray240[this.anInt885] = local294 + 950;
									}
									if (local170 == 1) {
										this.anIntArray240[this.anInt885] = local294 + 956;
									}
									if (local170 == 2) {
										this.anIntArray240[this.anInt885] = local294 + 912;
									}
									if (local170 == 3) {
										this.anIntArray240[this.anInt885] = local294 + 804;
									}
									if (local170 == 4) {
										this.anIntArray240[this.anInt885] = local294 + 157;
									}
									this.anIntArray241[this.anInt885] = arg1;
									this.anIntArray238[this.anInt885] = arg0;
									this.anIntArray239[this.anInt885] = arg2;
									this.anInt885++;
								}
							}
						}
						this.aStringArray10[this.anInt885] = "Examine @yel@" + local23;
						this.anIntArray240[this.anInt885] = 1581;
						this.anIntArray241[this.anInt885] = arg1;
						this.anIntArray238[this.anInt885] = arg0;
						this.anIntArray239[this.anInt885] = arg2;
						this.anInt885++;
					} else if ((this.anInt965 & 0x2) == 2) {
						this.aStringArray10[this.anInt885] = this.aString24 + " @yel@" + local23;
						this.anIntArray240[this.anInt885] = 372;
						this.anIntArray241[this.anInt885] = arg1;
						this.anIntArray238[this.anInt885] = arg0;
						this.anIntArray239[this.anInt885] = arg2;
						this.anInt885++;
						return;
					}
				}
			}
		} catch (@Pc(444) RuntimeException local444) {
			signlink.reporterror("8324, " + 6 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local444.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method630(@OriginalArg(1) int arg0) {
		try {
			if (!aBoolean205) {
				for (@Pc(14) int local14 = 0; local14 < this.anIntArray276.length; local14++) {
					@Pc(21) int local21 = this.anIntArray276[local14];
					if (Class1_Sub1_Sub2_Sub4.anIntArray199[local21] >= arg0) {
						@Pc(30) Class1_Sub1_Sub2_Sub2 local30 = Class1_Sub1_Sub2_Sub4.aClass1_Sub1_Sub2_Sub2Array1[local21];
						@Pc(38) int local38 = local30.anInt185 * local30.anInt186 - 1;
						@Pc(46) int local46 = local30.anInt185 * this.anInt1042 * 2;
						@Pc(49) byte[] local49 = local30.aByteArray2;
						@Pc(52) byte[] local52 = this.aByteArray21;
						for (@Pc(54) int local54 = 0; local54 <= local38; local54++) {
							local52[local54] = local49[local54 - local46 & local38];
						}
						local30.aByteArray2 = local52;
						this.aByteArray21 = local49;
						Class1_Sub1_Sub2_Sub4.method531(local21);
					}
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("25179, " + -139 + ", " + arg0 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method631(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				this.method579();
			}
			if (super.anInt819 == 1) {
				if (super.anInt820 >= 6 && super.anInt820 <= 106 && super.anInt821 >= 467 && super.anInt821 <= 499) {
					this.anInt921 = (this.anInt921 + 1) % 4;
					this.aBoolean213 = true;
					this.aBoolean199 = true;
					this.aClass1_Sub1_Sub4_8.method283(227);
					this.aClass1_Sub1_Sub4_8.method284(this.anInt921);
					this.aClass1_Sub1_Sub4_8.method284(this.anInt892);
					this.aClass1_Sub1_Sub4_8.method284(this.anInt951);
				}
				if (super.anInt820 >= 135 && super.anInt820 <= 235 && super.anInt821 >= 467 && super.anInt821 <= 499) {
					this.anInt892 = (this.anInt892 + 1) % 3;
					this.aBoolean213 = true;
					this.aBoolean199 = true;
					this.aClass1_Sub1_Sub4_8.method283(227);
					this.aClass1_Sub1_Sub4_8.method284(this.anInt921);
					this.aClass1_Sub1_Sub4_8.method284(this.anInt892);
					this.aClass1_Sub1_Sub4_8.method284(this.anInt951);
				}
				if (super.anInt820 >= 273 && super.anInt820 <= 373 && super.anInt821 >= 467 && super.anInt821 <= 499) {
					this.anInt951 = (this.anInt951 + 1) % 3;
					this.aBoolean213 = true;
					this.aBoolean199 = true;
					this.aClass1_Sub1_Sub4_8.method283(227);
					this.aClass1_Sub1_Sub4_8.method284(this.anInt921);
					this.aClass1_Sub1_Sub4_8.method284(this.anInt892);
					this.aClass1_Sub1_Sub4_8.method284(this.anInt951);
				}
				if (super.anInt820 >= 412 && super.anInt820 <= 512 && super.anInt821 >= 467 && super.anInt821 <= 499) {
					if (this.anInt935 == -1) {
						this.method638();
						this.aString31 = "";
						this.aBoolean219 = false;
						this.anInt957 = this.anInt935 = Class27.anInt539;
						return;
					}
					this.method639("Please close the interface you have open before using 'report abuse'", 0, "");
					return;
				}
			}
		} catch (@Pc(201) RuntimeException local201) {
			signlink.reporterror("95408, " + arg0 + ", " + local201.toString());
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
				return new URL("http://127.0.0.1:" + (anInt956 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!MVHXDWGI;I)V")
	private void method632(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub4 arg1) {
		try {
			@Pc(12) int local12;
			@Pc(21) int local21;
			@Pc(28) int local28;
			@Pc(31) int local31;
			@Pc(34) int local34;
			@Pc(40) int local40;
			@Pc(44) int local44;
			if (arg0 == 143) {
				local12 = arg1.method294();
				local21 = this.anInt1046 + (local12 >> 4 & 0x7);
				local28 = this.anInt1047 + (local12 & 0x7);
				local31 = arg1.method296();
				local34 = arg1.method294();
				local40 = local34 >> 4 & 0xF;
				local44 = local34 & 0x7;
				if (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0] >= local21 - local40 && aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0] <= local21 + local40 && aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0] >= local28 - local40 && aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0] <= local28 + local40 && this.aBoolean187 && !aBoolean205 && this.anInt924 < 50) {
					this.anIntArray232[this.anInt924] = local31;
					this.anIntArray234[this.anInt924] = local44;
					this.anIntArray233[this.anInt924] = Class45.anIntArray203[local31];
					this.anInt924++;
				}
			}
			@Pc(146) int local146;
			@Pc(158) int local158;
			@Pc(162) int local162;
			@Pc(165) int local165;
			@Pc(174) int local174;
			if (arg0 == 137) {
				local12 = arg1.method322();
				local21 = arg1.method294();
				local28 = local21 >> 2;
				local31 = local21 & 0x3;
				local34 = this.anIntArray242[local28];
				@Pc(138) byte local138 = arg1.method315();
				@Pc(142) byte local142 = arg1.method316();
				local146 = arg1.method322();
				@Pc(150) byte local150 = arg1.method316();
				@Pc(154) byte local154 = arg1.method315();
				local158 = arg1.method320();
				local162 = arg1.method322();
				local165 = arg1.method294();
				local174 = this.anInt1046 + (local165 >> 4 & 0x7);
				@Pc(181) int local181 = this.anInt1047 + (local165 & 0x7);
				@Pc(187) Class1_Sub1_Sub1_Sub1_Sub2 local187;
				if (local162 == this.anInt992) {
					local187 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
				} else {
					local187 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local162];
				}
				if (local187 != null) {
					@Pc(199) Class5 local199 = Class5.method130(local146);
					@Pc(209) int local209 = this.anIntArrayArrayArray8[this.anInt995][local174][local181];
					@Pc(221) int local221 = this.anIntArrayArrayArray8[this.anInt995][local174 + 1][local181];
					@Pc(235) int local235 = this.anIntArrayArrayArray8[this.anInt995][local174 + 1][local181 + 1];
					@Pc(247) int local247 = this.anIntArrayArrayArray8[this.anInt995][local174][local181 + 1];
					@Pc(257) Class1_Sub1_Sub1_Sub4 local257 = local199.method132(local28, local31, local209, local221, local235, local247, -1);
					if (local257 != null) {
						this.method674(-1, local181, local158 + 1, local34, 0, local12 + 1, this.anInt995, local174, 0);
						local187.anInt249 = local158 + anInt1007;
						local187.anInt250 = local12 + anInt1007;
						local187.aClass1_Sub1_Sub1_Sub4_1 = local257;
						@Pc(292) int local292 = local199.anInt261;
						@Pc(295) int local295 = local199.anInt280;
						if (local31 == 1 || local31 == 3) {
							local292 = local199.anInt280;
							local295 = local199.anInt261;
						}
						local187.anInt246 = local174 * 128 + local292 * 64;
						local187.anInt248 = local181 * 128 + local295 * 64;
						local187.anInt247 = this.method607(local187.anInt248, local187.anInt246, this.anInt995);
						@Pc(341) byte local341;
						if (local154 > local142) {
							local341 = local154;
							local154 = local142;
							local142 = local341;
						}
						if (local150 > local138) {
							local341 = local150;
							local150 = local138;
							local138 = local341;
						}
						local187.anInt254 = local174 + local154;
						local187.anInt256 = local174 + local142;
						local187.anInt255 = local181 + local150;
						local187.anInt257 = local181 + local138;
					}
				}
			}
			@Pc(419) Class1_Sub1_Sub1_Sub2 local419;
			if (arg0 == 101) {
				local12 = arg1.method320();
				local21 = arg1.method312(964);
				local28 = this.anInt1046 + (local21 >> 4 & 0x7);
				local31 = this.anInt1047 + (local21 & 0x7);
				local34 = arg1.method320();
				if (local28 >= 0 && local31 >= 0 && local28 < 104 && local31 < 104) {
					local419 = new Class1_Sub1_Sub1_Sub2();
					local419.anInt311 = local12;
					local419.anInt310 = local34;
					if (this.aClass16ArrayArrayArray1[this.anInt995][local28][local31] == null) {
						this.aClass16ArrayArrayArray1[this.anInt995][local28][local31] = new Class16(aBoolean218);
					}
					this.aClass16ArrayArrayArray1[this.anInt995][local28][local31].method182(local419);
					this.method693(local28, local31);
				}
			} else if (arg0 == 247) {
				local12 = arg1.method320();
				local21 = arg1.method313();
				local28 = this.anInt1046 + (local21 >> 4 & 0x7);
				local31 = this.anInt1047 + (local21 & 0x7);
				local34 = arg1.method320();
				local40 = arg1.method320();
				if (local28 >= 0 && local31 >= 0 && local28 < 104 && local31 < 104 && local40 != this.anInt992) {
					@Pc(517) Class1_Sub1_Sub1_Sub2 local517 = new Class1_Sub1_Sub1_Sub2();
					local517.anInt311 = local34;
					local517.anInt310 = local12;
					if (this.aClass16ArrayArrayArray1[this.anInt995][local28][local31] == null) {
						this.aClass16ArrayArrayArray1[this.anInt995][local28][local31] = new Class16(aBoolean218);
					}
					this.aClass16ArrayArrayArray1[this.anInt995][local28][local31].method182(local517);
					this.method693(local28, local31);
				}
			} else if (arg0 == 243) {
				local12 = arg1.method313();
				local21 = this.anInt1046 + (local12 >> 4 & 0x7);
				local28 = this.anInt1047 + (local12 & 0x7);
				local31 = arg1.method296();
				local34 = arg1.method294();
				local40 = local34 >> 2;
				local44 = local34 & 0x3;
				local146 = this.anIntArray242[local40];
				if (local21 >= 0 && local28 >= 0 && local21 < 104 && local28 < 104) {
					this.method674(local31, local28, 0, local146, local40, -1, this.anInt995, local21, local44);
				}
			} else if (arg0 == 23) {
				local12 = arg1.method294();
				local21 = this.anInt1046 + (local12 >> 4 & 0x7);
				local28 = this.anInt1047 + (local12 & 0x7);
				local31 = arg1.method313();
				local34 = local31 >> 2;
				local40 = local31 & 0x3;
				local44 = this.anIntArray242[local34];
				if (local21 >= 0 && local28 >= 0 && local21 < 104 && local28 < 104) {
					this.method674(-1, local28, 0, local44, local34, -1, this.anInt995, local21, local40);
				}
			} else {
				@Pc(754) int local754;
				@Pc(766) int local766;
				if (arg0 == 94) {
					local12 = arg1.method312(964);
					local21 = this.anInt1046 + (local12 >> 4 & 0x7);
					local28 = this.anInt1047 + (local12 & 0x7);
					local31 = arg1.method314();
					local34 = local31 >> 2;
					local40 = local31 & 0x3;
					local44 = this.anIntArray242[local34];
					local146 = arg1.method296();
					if (local21 >= 0 && local28 >= 0 && local21 < 103 && local28 < 103) {
						local754 = this.anIntArrayArrayArray8[this.anInt995][local21][local28];
						local766 = this.anIntArrayArrayArray8[this.anInt995][local21 + 1][local28];
						local158 = this.anIntArrayArrayArray8[this.anInt995][local21 + 1][local28 + 1];
						local162 = this.anIntArrayArrayArray8[this.anInt995][local21][local28 + 1];
						if (local44 == 0) {
							@Pc(803) Class9 local803 = this.aClass18_1.method213(local28, local21, this.anInt995);
							if (local803 != null) {
								local174 = local803.anInt297 >> 14 & 0x7FFF;
								if (local34 == 2) {
									local803.aClass1_Sub1_Sub1_4 = new Class1_Sub1_Sub1_Sub5(local766, local146, local174, local158, local40 + 4, 2, false, 902, local754, local162);
									local803.aClass1_Sub1_Sub1_5 = new Class1_Sub1_Sub1_Sub5(local766, local146, local174, local158, local40 + 1 & 0x3, 2, false, 902, local754, local162);
								} else {
									local803.aClass1_Sub1_Sub1_4 = new Class1_Sub1_Sub1_Sub5(local766, local146, local174, local158, local40, local34, false, 902, local754, local162);
								}
							}
						}
						if (local44 == 1) {
							@Pc(880) Class11 local880 = this.aClass18_1.method214(this.anInt995, local21, local28);
							if (local880 != null) {
								local880.aClass1_Sub1_Sub1_6 = new Class1_Sub1_Sub1_Sub5(local766, local146, local880.anInt305 >> 14 & 0x7FFF, local158, 0, 4, false, 902, local754, local162);
							}
						}
						if (local44 == 2) {
							@Pc(914) Class17 local914 = this.aClass18_1.method215(local21, local28, this.anInt995);
							if (local34 == 11) {
								local34 = 10;
							}
							if (local914 != null) {
								local914.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub5(local766, local146, local914.anInt369 >> 14 & 0x7FFF, local158, local40, local34, false, 902, local754, local162);
							}
						}
						if (local44 == 3) {
							@Pc(954) Class30 local954 = this.aClass18_1.method216(this.anInt995, local28, local21, this.anInt830);
							if (local954 != null) {
								local954.aClass1_Sub1_Sub1_8 = new Class1_Sub1_Sub1_Sub5(local766, local146, local954.anInt628 >> 14 & 0x7FFF, local158, local40, 22, false, 902, local754, local162);
							}
						}
					}
				} else if (arg0 == 4) {
					local12 = arg1.method294();
					local21 = this.anInt1046 + (local12 >> 4 & 0x7);
					local28 = this.anInt1047 + (local12 & 0x7);
					local31 = arg1.method296();
					local34 = arg1.method294();
					local40 = arg1.method296();
					if (local21 >= 0 && local28 >= 0 && local21 < 104 && local28 < 104) {
						local21 = local21 * 128 + 64;
						local28 = local28 * 128 + 64;
						@Pc(1051) Class1_Sub1_Sub1_Sub3 local1051 = new Class1_Sub1_Sub1_Sub3(this.anInt995, local31, anInt1007, local28, 533, local21, local40, this.method607(local28, local21, this.anInt995) - local34);
						this.aClass16_11.method182(local1051);
					}
				} else if (arg0 == 235) {
					local12 = arg1.method294();
					local21 = this.anInt1046 + (local12 >> 4 & 0x7);
					local28 = this.anInt1047 + (local12 & 0x7);
					local31 = local21 + arg1.method295();
					local34 = local28 + arg1.method295();
					local40 = arg1.method297();
					local44 = arg1.method296();
					local146 = arg1.method294() * 4;
					local754 = arg1.method294() * 4;
					local766 = arg1.method296();
					local158 = arg1.method296();
					local162 = arg1.method294();
					local165 = arg1.method294();
					if (local21 >= 0 && local28 >= 0 && local21 < 104 && local28 < 104 && local31 >= 0 && local34 >= 0 && local31 < 104 && local34 < 104 && local44 != 65535) {
						local21 = local21 * 128 + 64;
						local28 = local28 * 128 + 64;
						local31 = local31 * 128 + 64;
						local34 = local34 * 128 + 64;
						@Pc(1192) Class1_Sub1_Sub1_Sub6 local1192 = new Class1_Sub1_Sub1_Sub6(local754, this.anInt995, local44, local158 + anInt1007, this.method607(local28, local21, this.anInt995) - local146, local40, local162, local165, local28, local766 + anInt1007, (byte) 9, local21);
						local1192.method499(local31, local766 + anInt1007, this.method607(local34, local31, this.anInt995) - local754, local34);
						this.aClass16_12.method182(local1192);
					}
				} else if (arg0 == 179) {
					local12 = arg1.method313();
					local21 = this.anInt1046 + (local12 >> 4 & 0x7);
					local28 = this.anInt1047 + (local12 & 0x7);
					local31 = arg1.method296();
					if (local21 >= 0 && local28 >= 0 && local21 < 104 && local28 < 104) {
						@Pc(1260) Class16 local1260 = this.aClass16ArrayArrayArray1[this.anInt995][local21][local28];
						if (local1260 != null) {
							for (local419 = (Class1_Sub1_Sub1_Sub2) local1260.method185(); local419 != null; local419 = (Class1_Sub1_Sub1_Sub2) local1260.method187()) {
								if (local419.anInt311 == (local31 & 0x7FFF)) {
									local419.method560();
									break;
								}
							}
							if (local1260.method185() == null) {
								this.aClass16ArrayArrayArray1[this.anInt995][local21][local28] = null;
							}
							this.method693(local21, local28);
						}
					}
				} else if (arg0 == 93) {
					local12 = arg1.method294();
					local21 = this.anInt1046 + (local12 >> 4 & 0x7);
					local28 = this.anInt1047 + (local12 & 0x7);
					local31 = arg1.method296();
					local34 = arg1.method296();
					local40 = arg1.method296();
					if (local21 >= 0 && local28 >= 0 && local21 < 104 && local28 < 104) {
						@Pc(1354) Class16 local1354 = this.aClass16ArrayArrayArray1[this.anInt995][local21][local28];
						if (local1354 != null) {
							for (@Pc(1360) Class1_Sub1_Sub1_Sub2 local1360 = (Class1_Sub1_Sub1_Sub2) local1354.method185(); local1360 != null; local1360 = (Class1_Sub1_Sub1_Sub2) local1354.method187()) {
								if (local1360.anInt311 == (local31 & 0x7FFF) && local1360.anInt310 == local34) {
									local1360.anInt310 = local40;
									break;
								}
							}
							this.method693(local21, local28);
						}
					}
				}
			}
		} catch (@Pc(1390) RuntimeException local1390) {
			signlink.reporterror("29658, " + arg0 + ", " + arg1 + ", " + -323 + ", " + local1390.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method633(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			if (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt231 >> 7 == this.anInt953 && aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt232 >> 7 == this.anInt954) {
				this.anInt953 = 0;
			}
			@Pc(21) int local21 = this.anInt836;
			if (arg1 != 0) {
				this.anInt859 = -230;
			}
			if (arg0) {
				local21 = 1;
			}
			for (@Pc(32) int local32 = 0; local32 < local21; local32++) {
				@Pc(38) Class1_Sub1_Sub1_Sub1_Sub2 local38;
				@Pc(43) int local43;
				if (arg0) {
					local38 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
					local43 = this.anInt835 << 14;
				} else {
					local38 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray212[local32]];
					local43 = this.anIntArray212[local32] << 14;
				}
				if (local38 != null && local38.method112((byte) 9)) {
					local38.aBoolean35 = false;
					if ((aBoolean205 && this.anInt836 > 50 || this.anInt836 > 200) && !arg0 && local38.anInt237 == local38.anInt235) {
						local38.aBoolean35 = true;
					}
					@Pc(94) int local94 = local38.anInt231 >> 7;
					@Pc(99) int local99 = local38.anInt232 >> 7;
					if (local94 >= 0 && local94 < 104 && local99 >= 0 && local99 < 104) {
						if (local38.aClass1_Sub1_Sub1_Sub4_1 == null || anInt1007 < local38.anInt249 || anInt1007 >= local38.anInt250) {
							if ((local38.anInt231 & 0x7F) == 64 && (local38.anInt232 & 0x7F) == 64) {
								if (this.anIntArrayArray22[local94][local99] == this.anInt840) {
									continue;
								}
								this.anIntArrayArray22[local94][local99] = this.anInt840;
							}
							local38.anInt242 = this.method607(local38.anInt232, local38.anInt231, this.anInt995);
							this.aClass18_1.method202(this.anInt995, local38.anInt242, local38.anInt231, local38, local38.anInt232, 60, local38.anInt233, local38.aBoolean33, local43);
						} else {
							local38.aBoolean35 = false;
							local38.anInt242 = this.method607(local38.anInt232, local38.anInt231, this.anInt995);
							this.aClass18_1.method203(local38.anInt242, local38.anInt256, local38.anInt255, local38, local38.anInt257, local38.anInt254, local43, this.anInt995, local38.anInt231, local38.anInt232, this.aBoolean183, local38.anInt233);
						}
					}
				}
			}
		} catch (@Pc(229) RuntimeException local229) {
			signlink.reporterror("39865, " + arg0 + ", " + arg1 + ", " + local229.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIZ)I")
	private int method634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.aBoolean188 &= true;
			@Pc(9) int local9 = 256 - arg1;
			return ((arg2 & 0xFF00FF) * local9 + (arg0 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg2 & 0xFF00) * local9 + (arg0 & 0xFF00) * arg1 & 0xFF0000) >> 8;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("2611, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[BI)Z")
	private boolean method635(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			return arg1 == null ? true : signlink.wavesave(arg1, arg0);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("10061, " + arg0 + ", " + arg1 + ", " + 7 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method636(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 6 || arg0 > 6) {
				this.anInt1031 = this.aClass1_Sub1_Sub4_6.method294();
			}
			for (@Pc(14) int local14 = 0; local14 < this.anInt924; local14++) {
				if (this.anIntArray233[local14] <= 0) {
					@Pc(23) boolean local23 = false;
					try {
						if (this.anIntArray232[local14] != this.anInt860 || this.anIntArray234[local14] != this.anInt1000) {
							@Pc(56) Class1_Sub1_Sub4 local56 = Class45.method552(this.anIntArray234[local14], this.anIntArray232[local14]);
							if (System.currentTimeMillis() + (long) (local56.anInt529 / 22) > this.aLong32 + (long) (this.anInt858 / 22)) {
								this.anInt858 = local56.anInt529;
								this.aLong32 = System.currentTimeMillis();
								if (this.method635(local56.anInt529, local56.aByteArray14)) {
									this.anInt860 = this.anIntArray232[local14];
									this.anInt1000 = this.anIntArray234[local14];
								} else {
									local23 = true;
								}
							}
						} else if (!this.method645()) {
							local23 = true;
						}
					} catch (@Pc(106) Exception local106) {
						if (signlink.reporterror) {
							this.aClass1_Sub1_Sub4_8.method283(198);
							this.aClass1_Sub1_Sub4_8.method285(this.anIntArray232[local14] & 0x7FFF);
						} else {
							this.aClass1_Sub1_Sub4_8.method283(198);
							this.aClass1_Sub1_Sub4_8.method285(-1);
						}
					}
					if (local23 && this.anIntArray233[local14] != -5) {
						this.anIntArray233[local14] = -5;
					} else {
						this.anInt924--;
						for (@Pc(149) int local149 = local14; local149 < this.anInt924; local149++) {
							this.anIntArray232[local149] = this.anIntArray232[local149 + 1];
							this.anIntArray234[local149] = this.anIntArray234[local149 + 1];
							this.anIntArray233[local149] = this.anIntArray233[local149 + 1];
						}
						local14--;
					}
				} else {
					@Pc(201) int local201 = this.anIntArray233[local14]--;
				}
			}
			if (this.anInt973 > 0) {
				this.anInt973 -= 20;
				if (this.anInt973 < 0) {
					this.anInt973 = 0;
				}
				if (this.anInt973 == 0 && this.aBoolean210 && !aBoolean205) {
					this.anInt1012 = this.anInt937;
					this.aBoolean214 = true;
					this.aClass28_Sub1_1.method469(2, this.anInt1012);
					return;
				}
			}
		} catch (@Pc(247) RuntimeException local247) {
			signlink.reporterror("13151, " + arg0 + ", " + local247.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method637() {
		try {
			this.aBoolean215 = true;
			for (@Pc(6) int local6 = 0; local6 < 7; local6++) {
				this.anIntArray271[local6] = -1;
				for (@Pc(15) int local15 = 0; local15 < Class24.anInt466; local15++) {
					if (!Class24.aClass24Array1[local15].aBoolean93 && Class24.aClass24Array1[local15].anInt467 == local6 + (this.aBoolean208 ? 0 : 7)) {
						this.anIntArray271[local6] = local15;
						break;
					}
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("58094, " + 14877 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method638() {
		try {
			this.aClass1_Sub1_Sub4_8.method283(71);
			if (this.anInt826 != -1) {
				this.method649(this.anInt826);
				this.anInt826 = -1;
				this.aBoolean194 = true;
				this.aBoolean189 = false;
				this.aBoolean181 = true;
			}
			if (this.anInt1054 != -1) {
				this.method649(this.anInt1054);
				this.anInt1054 = -1;
				this.aBoolean199 = true;
				this.aBoolean189 = false;
			}
			if (this.anInt1010 != -1) {
				this.method649(this.anInt1010);
				this.anInt1010 = -1;
				this.aBoolean197 = true;
			}
			if (this.anInt979 != -1) {
				this.method649(this.anInt979);
				this.anInt979 = -1;
			}
			if (this.anInt935 != -1) {
				this.method649(this.anInt935);
				this.anInt935 = -1;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("5537, " + false + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V")
	private void method639(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		try {
			if (arg1 == 0 && this.anInt1040 != -1) {
				this.aString21 = arg0;
				super.anInt819 = 0;
			}
			if (this.anInt1054 == -1) {
				this.aBoolean199 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray273[local20] = this.anIntArray273[local20 - 1];
				this.aStringArray13[local20] = this.aStringArray13[local20 - 1];
				this.aStringArray14[local20] = this.aStringArray14[local20 - 1];
			}
			this.anIntArray273[0] = arg1;
			this.aStringArray13[0] = arg2;
			this.aStringArray14[0] = arg0;
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("96612, " + 4 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method640(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg1 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt827; local8++) {
					if (this.aLongArray4[local8] == arg1) {
						this.anInt827--;
						this.aBoolean194 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt827; local28++) {
							this.aStringArray12[local28] = this.aStringArray12[local28 + 1];
							this.anIntArray215[local28] = this.anIntArray215[local28 + 1];
							this.aLongArray4[local28] = this.aLongArray4[local28 + 1];
						}
						this.aClass1_Sub1_Sub4_8.method283(193);
						this.aClass1_Sub1_Sub4_8.method290(arg1);
						break;
					}
				}
				@Pc(86) boolean local86 = false;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("2541, " + arg0 + ", " + arg1 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method641() {
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
				this.anInt952 = -1;
				this.aClass16_11.method189();
				this.aClass16_12.method189();
				Class1_Sub1_Sub2_Sub4.method527();
				this.method619();
				this.aClass18_1.method191();
				System.gc();
				for (local22 = 0; local22 < 4; local22++) {
					this.aClass22Array1[local22].method258();
				}
				for (local35 = 0; local35 < 4; local35++) {
					for (local39 = 0; local39 < 104; local39++) {
						for (local43 = 0; local43 < 104; local43++) {
							this.aByteArrayArrayArray8[local35][local39][local43] = 0;
						}
					}
				}
				@Pc(77) Class39 local77 = new Class39(this.anIntArrayArrayArray8, 104, 0, this.aByteArrayArrayArray8, 104);
				local43 = this.aByteArrayArray6.length;
				this.aClass1_Sub1_Sub4_8.method283(204);
				@Pc(256) int local256;
				@Pc(244) int local244;
				if (!this.aBoolean217) {
					@Pc(122) byte[] local122;
					for (local91 = 0; local91 < local43; local91++) {
						local105 = (this.anIntArray216[local91] >> 8) * 64 - this.anInt894;
						local117 = (this.anIntArray216[local91] & 0xFF) * 64 - this.anInt895;
						local122 = this.aByteArrayArray6[local91];
						if (local122 != null) {
							local77.method484((this.anInt988 - 6) * 8, local122, local105, local117, (this.anInt989 - 6) * 8, this.aClass22Array1);
						}
					}
					for (local105 = 0; local105 < local43; local105++) {
						local117 = (this.anIntArray216[local105] >> 8) * 64 - this.anInt894;
						local176 = (this.anIntArray216[local105] & 0xFF) * 64 - this.anInt895;
						@Pc(181) byte[] local181 = this.aByteArrayArray6[local105];
						if (local181 == null && this.anInt989 < 800) {
							local77.method489(64, local176, local117, 64);
						}
					}
					anInt841++;
					if (anInt841 > 167) {
						anInt841 = 0;
						this.aClass1_Sub1_Sub4_8.method283(75);
						this.aClass1_Sub1_Sub4_8.method284(150);
					}
					this.aClass1_Sub1_Sub4_8.method283(204);
					for (local117 = 0; local117 < local43; local117++) {
						local122 = this.aByteArrayArray5[local117];
						if (local122 != null) {
							local244 = (this.anIntArray216[local117] >> 8) * 64 - this.anInt894;
							local256 = (this.anIntArray216[local117] & 0xFF) * 64 - this.anInt895;
							local77.method482(local122, this.aClass22Array1, this.aClass18_1, local244, local256);
						}
					}
				}
				if (this.aBoolean217) {
					local91 = 0;
					label258: while (true) {
						@Pc(311) int local311;
						@Pc(317) int local317;
						@Pc(323) int local323;
						@Pc(333) int local333;
						@Pc(335) int local335;
						if (local91 >= 4) {
							for (local105 = 0; local105 < 13; local105++) {
								for (local117 = 0; local117 < 13; local117++) {
									local176 = this.anIntArrayArrayArray7[0][local105][local117];
									if (local176 == -1) {
										local77.method489(8, local117 * 8, local105 * 8, 8);
									}
								}
							}
							this.aClass1_Sub1_Sub4_8.method283(204);
							local117 = 0;
							while (true) {
								if (local117 >= 4) {
									break label258;
								}
								for (local176 = 0; local176 < 13; local176++) {
									for (local244 = 0; local244 < 13; local244++) {
										local256 = this.anIntArrayArrayArray7[local117][local176][local244];
										if (local256 != -1) {
											local311 = local256 >> 24 & 0x3;
											local317 = local256 >> 1 & 0x3;
											local323 = local256 >> 14 & 0x3FF;
											local333 = local256 >> 3 & 0x7FF;
											local335 = (local323 / 8 << 8) + local333 / 8;
											for (@Pc(514) int local514 = 0; local514 < this.anIntArray216.length; local514++) {
												if (this.anIntArray216[local514] == local335 && this.aByteArrayArray5[local514] != null) {
													local77.method481(this.aClass22Array1, this.aClass18_1, local311, local176 * 8, this.aByteArrayArray5[local514], (local323 & 0x7) * 8, local117, local244 * 8, local317, (local333 & 0x7) * 8);
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
								@Pc(287) boolean local287 = false;
								local244 = this.anIntArrayArrayArray7[local91][local105][local117];
								if (local244 != -1) {
									local256 = local244 >> 24 & 0x3;
									local311 = local244 >> 1 & 0x3;
									local317 = local244 >> 14 & 0x3FF;
									local323 = local244 >> 3 & 0x7FF;
									local333 = (local317 / 8 << 8) + local323 / 8;
									for (local335 = 0; local335 < this.anIntArray216.length; local335++) {
										if (this.anIntArray216[local335] == local333 && this.aByteArrayArray6[local335] != null) {
											local77.method488(this.aClass22Array1, (local317 & 0x7) * 8, local256, this.aByteArrayArray6[local335], local105 * 8, local311, (local323 & 0x7) * 8, local117 * 8, local91);
											local287 = true;
											break;
										}
									}
								}
								if (!local287) {
									local77.method473(local91, local105 * 8, local117 * 8);
								}
							}
						}
						local91++;
					}
				}
				this.aClass1_Sub1_Sub4_8.method283(204);
				local77.method493(this.anInt1016, this.aClass18_1, this.aClass22Array1);
				if (this.aClass8_26 != null) {
					this.aClass8_26.method133();
					Class1_Sub1_Sub2_Sub4.anIntArray197 = this.anIntArray256;
				}
				this.aClass1_Sub1_Sub4_8.method283(204);
				local91 = Class39.anInt695;
				if (local91 > this.anInt995) {
					local91 = this.anInt995;
				}
				if (local91 < this.anInt995 - 1) {
					local91 = this.anInt995 - 1;
				}
				if (aBoolean205) {
					this.aClass18_1.method192(Class39.anInt695);
				} else {
					this.aClass18_1.method192(0);
				}
				for (local105 = 0; local105 < 104; local105++) {
					for (local117 = 0; local117 < 104; local117++) {
						this.method693(local105, local117);
					}
				}
				this.method658();
			} catch (@Pc(664) Exception local664) {
			}
			Class5.aClass46_4.method559();
			if (super.aFrame_Sub1_2 != null) {
				this.aClass1_Sub1_Sub4_8.method283(236);
				this.aClass1_Sub1_Sub4_8.method288(1057001181);
			}
			if (aBoolean205 && signlink.aRandomAccessFile3 != null) {
				local22 = this.aClass28_Sub1_1.method467(0);
				for (local35 = 0; local35 < local22; local35++) {
					local39 = this.aClass28_Sub1_1.method457(local35);
					if ((local39 & 0x79) == 0) {
						Class1_Sub1_Sub1_Sub4.method362(local35);
					}
				}
			}
			System.gc();
			Class1_Sub1_Sub2_Sub4.method528(aBoolean202);
			this.aClass28_Sub1_1.method471();
			local22 = (this.anInt988 - 6) / 8 - 1;
			local35 = (this.anInt988 + 6) / 8 + 1;
			local39 = (this.anInt989 - 6) / 8 - 1;
			local43 = (this.anInt989 + 6) / 8 + 1;
			if (this.aBoolean225) {
				local22 = 49;
				local35 = 50;
				local39 = 49;
				local43 = 50;
			}
			for (local91 = local22; local91 <= local35; local91++) {
				for (local105 = local39; local105 <= local43; local105++) {
					if (local91 == local22 || local91 == local35 || local105 == local39 || local105 == local43) {
						local117 = this.aClass28_Sub1_1.method460(0, local91, local105);
						if (local117 != -1) {
							this.aClass28_Sub1_1.method470(local117, 3);
						}
						local176 = this.aClass28_Sub1_1.method460(1, local91, local105);
						if (local176 != -1) {
							this.aClass28_Sub1_1.method470(local176, 3);
						}
					}
				}
			}
		} catch (@Pc(835) RuntimeException local835) {
			signlink.reporterror("69446, " + 2 + ", " + local835.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)Ljava/lang/String;")
	private String method642() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("28549, " + false + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZI)V")
	private void method643(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 >= 6 && arg2 <= 6) {
				signlink.anInt1062 = arg0;
				if (arg1) {
					signlink.midi = "voladjust";
				}
			}
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("87997, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!MVHXDWGI;IB)V")
	private void method644(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(6) int local6 = arg0.method305(8);
			@Pc(12) int local12;
			if (local6 < this.anInt836) {
				for (local12 = local6; local12 < this.anInt836; local12++) {
					this.anIntArray219[this.anInt880++] = this.anIntArray212[local12];
				}
			}
			if (local6 > this.anInt836) {
				signlink.reporterror(this.aString27 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt836 = 0;
			for (local12 = 0; local12 < local6; local12++) {
				@Pc(72) int local72 = this.anIntArray212[local12];
				@Pc(77) Class1_Sub1_Sub1_Sub1_Sub2 local77 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local72];
				@Pc(82) int local82 = arg0.method305(1);
				if (local82 == 0) {
					this.anIntArray212[this.anInt836++] = local72;
					local77.anInt217 = anInt1007;
				} else {
					@Pc(105) int local105 = arg0.method305(2);
					if (local105 == 0) {
						this.anIntArray212[this.anInt836++] = local72;
						local77.anInt217 = anInt1007;
						this.anIntArray213[this.anInt837++] = local72;
					} else {
						@Pc(156) int local156;
						@Pc(166) int local166;
						if (local105 == 1) {
							this.anIntArray212[this.anInt836++] = local72;
							local77.anInt217 = anInt1007;
							local156 = arg0.method305(3);
							local77.method109(local156, false);
							local166 = arg0.method305(1);
							if (local166 == 1) {
								this.anIntArray213[this.anInt837++] = local72;
							}
						} else if (local105 == 2) {
							this.anIntArray212[this.anInt836++] = local72;
							local77.anInt217 = anInt1007;
							local156 = arg0.method305(3);
							local77.method109(local156, true);
							local166 = arg0.method305(3);
							local77.method109(local166, true);
							@Pc(224) int local224 = arg0.method305(1);
							if (local224 == 1) {
								this.anIntArray213[this.anInt837++] = local72;
							}
						} else if (local105 == 3) {
							this.anIntArray219[this.anInt880++] = local72;
						}
					}
				}
			}
		} catch (@Pc(261) RuntimeException local261) {
			signlink.reporterror("56050, " + arg0 + ", " + arg1 + ", " + 3 + ", " + local261.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)Z")
	private boolean method645() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("21389, " + -21 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!MYGSUHVG;IZIIIII)V")
	private void method646(@OriginalArg(0) int arg0, @OriginalArg(1) Class27 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (this.aBoolean190) {
				this.anInt878 = 32;
			} else {
				this.anInt878 = 0;
			}
			this.aBoolean190 = false;
			this.aBoolean188 &= true;
			if (arg5 >= arg6 && arg5 < arg6 + 16 && arg0 >= arg3 && arg0 < arg3 + 16) {
				arg1.anInt570 -= this.anInt899 * 4;
				if (arg4 == 1) {
					this.aBoolean194 = true;
				}
				if (arg4 == 2 || arg4 == 3) {
					this.aBoolean199 = true;
				}
			} else if (arg5 >= arg6 && arg5 < arg6 + 16 && arg0 >= arg3 + arg2 - 16 && arg0 < arg3 + arg2) {
				arg1.anInt570 += this.anInt899 * 4;
				if (arg4 == 1) {
					this.aBoolean194 = true;
				}
				if (arg4 == 2 || arg4 == 3) {
					this.aBoolean199 = true;
				}
			} else if (arg5 >= arg6 - this.anInt878 && arg5 < arg6 + this.anInt878 + 16 && arg0 >= arg3 + 16 && arg0 < arg3 + arg2 - 16 && this.anInt899 > 0) {
				@Pc(142) int local142 = (arg2 - 32) * arg2 / arg7;
				if (local142 < 8) {
					local142 = 8;
				}
				@Pc(157) int local157 = arg0 - arg3 - local142 / 2 - 16;
				@Pc(163) int local163 = arg2 - local142 - 32;
				arg1.anInt570 = (arg7 - arg2) * local157 / local163;
				if (arg4 == 1) {
					this.aBoolean194 = true;
				}
				if (arg4 == 2 || arg4 == 3) {
					this.aBoolean199 = true;
				}
				this.aBoolean190 = true;
			}
		} catch (@Pc(192) RuntimeException local192) {
			signlink.reporterror("79830, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local192.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method647() {
		try {
			try {
				if (this.aClass43_1 != null) {
					this.aClass43_1.method545();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass43_1 = null;
			this.aBoolean188 = false;
			this.anInt838 = 0;
			this.aString27 = "";
			this.aString28 = "";
			this.method619();
			this.aClass18_1.method191();
			for (@Pc(35) int local35 = 0; local35 < 4; local35++) {
				this.aClass22Array1[local35].method258();
			}
			System.gc();
			this.method690();
			this.anInt937 = -1;
			this.anInt1012 = -1;
			this.anInt973 = 0;
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("45546, " + -26 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
	private void method648(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(19) int local19;
			if (this.aClass8_26 != null) {
				this.aClass8_26.method133();
				Class1_Sub1_Sub2_Sub4.anIntArray197 = this.anIntArray256;
				local19 = 151;
				if (arg0 != null) {
					local19 -= 7;
				}
				this.aClass1_Sub1_Sub2_Sub1_3.method69(0, arg1, local19, 257);
				this.aClass1_Sub1_Sub2_Sub1_3.method69(16777215, arg1, local19 - 1, 256);
				local19 += 15;
				if (arg0 != null) {
					this.aClass1_Sub1_Sub2_Sub1_3.method69(0, arg0, local19, 257);
					this.aClass1_Sub1_Sub2_Sub1_3.method69(16777215, arg0, local19 - 1, 256);
				}
				this.aClass8_26.method134(super.aGraphics2, 4, 4);
			} else if (super.aClass8_2 != null) {
				super.aClass8_2.method133();
				Class1_Sub1_Sub2_Sub4.anIntArray197 = this.anIntArray257;
				local19 = 251;
				Class1_Sub1_Sub2.method517(0, 50, 233, 221, 300);
				Class1_Sub1_Sub2.method518(50, 16777215, 300, 221, 233);
				if (arg0 != null) {
					local19 -= 7;
				}
				this.aClass1_Sub1_Sub2_Sub1_3.method69(0, arg1, local19, 383);
				this.aClass1_Sub1_Sub2_Sub1_3.method69(16777215, arg1, local19 - 1, 382);
				local19 += 15;
				if (arg0 != null) {
					this.aClass1_Sub1_Sub2_Sub1_3.method69(0, arg0, local19, 383);
					this.aClass1_Sub1_Sub2_Sub1_3.method69(16777215, arg0, local19 - 1, 382);
				}
				super.aClass8_2.method134(super.aGraphics2, 0, 0);
			}
		} catch (@Pc(172) RuntimeException local172) {
			signlink.reporterror("33162, " + arg0 + ", " + 9231 + ", " + arg1 + ", " + local172.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method649(@OriginalArg(1) int arg0) {
		try {
			Class27.method340(arg0);
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("74148, " + -681 + ", " + arg0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!MYGSUHVG;BI)I")
	private int method650(@OriginalArg(0) Class27 arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aByte29 != -58) {
				this.anInt1016 = 304;
			}
			if (arg0.anIntArrayArray10 == null || arg1 >= arg0.anIntArrayArray10.length) {
				return -2;
			}
			try {
				@Pc(23) int[] local23 = arg0.anIntArrayArray10[arg1];
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
						local36 = this.anIntArray265[local23[local27++]];
					}
					if (local34 == 2) {
						local36 = this.anIntArray264[local23[local27++]];
					}
					if (local34 == 3) {
						local36 = this.anIntArray214[local23[local27++]];
					}
					@Pc(84) Class27 local84;
					@Pc(89) int local89;
					@Pc(102) int local102;
					if (local34 == 4) {
						local84 = Class27.method339(local23[local27++]);
						local89 = local23[local27++];
						if (local89 >= 0 && local89 < Class3.anInt134 && (!Class3.method34(local89).aBoolean15 || aBoolean204)) {
							for (local102 = 0; local102 < local84.anIntArray110.length; local102++) {
								if (local84.anIntArray110[local102] == local89 + 1) {
									local36 += local84.anIntArray112[local102];
								}
							}
						}
					}
					if (local34 == 5) {
						local36 = this.anIntArray258[local23[local27++]];
					}
					if (local34 == 6) {
						local36 = anIntArray235[this.anIntArray264[local23[local27++]] - 1];
					}
					if (local34 == 7) {
						local36 = this.anIntArray258[local23[local27++]] * 100 / 46875;
					}
					if (local34 == 8) {
						local36 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt251;
					}
					@Pc(177) int local177;
					if (local34 == 9) {
						for (local177 = 0; local177 < Class50.anInt803; local177++) {
							if (Class50.aBooleanArray10[local177]) {
								local36 += this.anIntArray264[local177];
							}
						}
					}
					if (local34 == 10) {
						local84 = Class27.method339(local23[local27++]);
						local89 = local23[local27++] + 1;
						if (local89 >= 0 && local89 < Class3.anInt134 && (!Class3.method34(local89).aBoolean15 || aBoolean204)) {
							for (local102 = 0; local102 < local84.anIntArray110.length; local102++) {
								if (local84.anIntArray110[local102] == local89) {
									local36 = 999999999;
									break;
								}
							}
						}
					}
					if (local34 == 11) {
						local36 = this.anInt1011;
					}
					if (local34 == 12) {
						local36 = this.anInt898;
					}
					if (local34 == 13) {
						local177 = this.anIntArray258[local23[local27++]];
						local89 = local23[local27++];
						local36 = (local177 & 0x1 << local89) == 0 ? 0 : 1;
					}
					if (local34 == 14) {
						local177 = local23[local27++];
						@Pc(291) Class33 local291 = Class33.aClass33Array1[local177];
						local102 = local291.anInt643;
						@Pc(297) int local297 = local291.anInt644;
						@Pc(300) int local300 = local291.anInt645;
						@Pc(306) int local306 = anIntArray236[local300 - local297];
						local36 = this.anIntArray258[local102] >> local297 & local306;
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
						local36 = (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt231 >> 7) + this.anInt894;
					}
					if (local34 == 19) {
						local36 = (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt232 >> 7) + this.anInt895;
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
			} catch (@Pc(399) Exception local399) {
				return -1;
			}
		} catch (@Pc(402) RuntimeException local402) {
			signlink.reporterror("38250, " + arg0 + ", " + -58 + ", " + arg1 + ", " + local402.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!MVHXDWGI;II)V")
	private void method651(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt880 = 0;
			this.anInt837 = 0;
			this.method701(arg1, arg0);
			this.method644(arg0, arg1);
			this.method600(arg0, arg1);
			this.method628((byte) 8, arg1, arg0);
			@Pc(49) int local49;
			for (@Pc(42) int local42 = 0; local42 < this.anInt880; local42++) {
				local49 = this.anIntArray219[local42];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local49].anInt217 != anInt1007) {
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local49] = null;
				}
			}
			if (arg0.anInt529 != arg1) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.anInt529 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local49 = 0; local49 < this.anInt836; local49++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray212[local49]] == null) {
					signlink.reporterror(this.aString27 + " null entry in pl list - pos:" + local49 + " size:" + this.anInt836);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("11446, " + arg0 + ", " + arg1 + ", " + 6 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)I")
	private int method652() {
		try {
			@Pc(3) int local3 = 3;
			if (this.anInt949 < 310) {
				@Pc(19) int local19 = this.anInt946 >> 7;
				@Pc(24) int local24 = this.anInt948 >> 7;
				@Pc(29) int local29 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt231 >> 7;
				@Pc(34) int local34 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt232 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt995][local19][local24] & 0x4) != 0) {
					local3 = this.anInt995;
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
						if ((this.aByteArrayArrayArray8[this.anInt995][local19][local24] & 0x4) != 0) {
							local3 = this.anInt995;
						}
						local86 += local84;
						if (local86 >= 65536) {
							local86 -= 65536;
							if (local24 < local34) {
								local24++;
							} else if (local24 > local34) {
								local24--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt995][local19][local24] & 0x4) != 0) {
								local3 = this.anInt995;
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
						if ((this.aByteArrayArrayArray8[this.anInt995][local19][local24] & 0x4) != 0) {
							local3 = this.anInt995;
						}
						local86 += local84;
						if (local86 >= 65536) {
							local86 -= 65536;
							if (local19 < local29) {
								local19++;
							} else if (local19 > local29) {
								local19--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt995][local19][local24] & 0x4) != 0) {
								local3 = this.anInt995;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt995][aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt231 >> 7][aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt232 >> 7] & 0x4) != 0) {
				local3 = this.anInt995;
			}
			return local3;
		} catch (@Pc(252) RuntimeException local252) {
			signlink.reporterror("52639, " + 32209 + ", " + local252.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)I")
	private int method653(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = 19 / arg0;
			@Pc(13) int local13 = this.method607(this.anInt948, this.anInt946, this.anInt995);
			return local13 - this.anInt947 >= 800 || (this.aByteArrayArrayArray8[this.anInt995][this.anInt946 >> 7][this.anInt948 >> 7] & 0x4) == 0 ? 3 : this.anInt995;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("22279, " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method654(@OriginalArg(0) int arg0) {
		try {
			@Pc(7) int local7;
			if (arg0 != this.anInt971) {
				for (local7 = 1; local7 > 0; local7++) {
				}
			}
			@Pc(29) int local29;
			if (this.anInt838 == 0) {
				local7 = super.anInt810 / 2 - 80;
				local29 = super.anInt811 / 2 + 20;
				@Pc(30) int local30 = local29 + 20;
				if (super.anInt819 == 1 && super.anInt820 >= local7 - 75 && super.anInt820 <= local7 + 75 && super.anInt821 >= local30 - 20 && super.anInt821 <= local30 + 20) {
					this.anInt838 = 3;
					this.anInt919 = 0;
				}
				local7 = super.anInt810 / 2 + 80;
				if (super.anInt819 == 1 && super.anInt820 >= local7 - 75 && super.anInt820 <= local7 + 75 && super.anInt821 >= local30 - 20 && super.anInt821 <= local30 + 20) {
					this.aString25 = "";
					this.aString26 = "Enter your username & password.";
					this.anInt838 = 2;
					this.anInt919 = 0;
					return;
				}
			} else {
				if (this.anInt838 == 2) {
					local7 = super.anInt811 / 2 - 40;
					local7 += 30;
					local7 += 25;
					if (super.anInt819 == 1 && super.anInt821 >= local7 - 15 && super.anInt821 < local7) {
						this.anInt919 = 0;
					}
					local7 += 15;
					if (super.anInt819 == 1 && super.anInt821 >= local7 - 15 && super.anInt821 < local7) {
						this.anInt919 = 1;
					}
					local7 += 15;
					local29 = super.anInt810 / 2 - 80;
					@Pc(175) int local175 = super.anInt811 / 2 + 50;
					@Pc(176) int local176 = local175 + 20;
					if (super.anInt819 == 1 && super.anInt820 >= local29 - 75 && super.anInt820 <= local29 + 75 && super.anInt821 >= local176 - 20 && super.anInt821 <= local176 + 20) {
						this.anInt1044 = 0;
						this.method669(this.aString27, this.aString28, false);
						if (this.aBoolean188) {
							return;
						}
					}
					local29 = super.anInt810 / 2 + 80;
					if (super.anInt819 == 1 && super.anInt820 >= local29 - 75 && super.anInt820 <= local29 + 75 && super.anInt821 >= local176 - 20 && super.anInt821 <= local176 + 20) {
						this.anInt838 = 0;
						this.aString27 = "";
						this.aString28 = "";
					}
					while (true) {
						while (true) {
							@Pc(266) int local266 = this.method578();
							if (local266 == -1) {
								return;
							}
							@Pc(271) boolean local271 = false;
							for (@Pc(273) int local273 = 0; local273 < aString29.length(); local273++) {
								if (local266 == aString29.charAt(local273)) {
									local271 = true;
									break;
								}
							}
							if (this.anInt919 == 0) {
								if (local266 == 8 && this.aString27.length() > 0) {
									this.aString27 = this.aString27.substring(0, this.aString27.length() - 1);
								}
								if (local266 == 9 || local266 == 10 || local266 == 13) {
									this.anInt919 = 1;
								}
								if (local271) {
									this.aString27 = this.aString27 + (char) local266;
								}
								if (this.aString27.length() > 12) {
									this.aString27 = this.aString27.substring(0, 12);
								}
							} else if (this.anInt919 == 1) {
								if (local266 == 8 && this.aString28.length() > 0) {
									this.aString28 = this.aString28.substring(0, this.aString28.length() - 1);
								}
								if (local266 == 9 || local266 == 10 || local266 == 13) {
									this.anInt919 = 0;
								}
								if (local271) {
									this.aString28 = this.aString28 + (char) local266;
								}
								if (this.aString28.length() > 20) {
									this.aString28 = this.aString28.substring(0, 20);
								}
							}
						}
					}
				}
				if (this.anInt838 != 3) {
					return;
				}
				local7 = super.anInt810 / 2;
				local29 = super.anInt811 / 2 + 50;
				local29 += 20;
				if (super.anInt819 != 1 || super.anInt820 < local7 - 75 || super.anInt820 > local7 + 75 || super.anInt821 < local29 - 20 || super.anInt821 > local29 + 20) {
					return;
				}
				this.anInt838 = 0;
			}
		} catch (@Pc(463) RuntimeException local463) {
			signlink.reporterror("52490, " + arg0 + ", " + local463.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method655() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt997);
			if (this.aClass28_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass28_Sub1_1.anInt679);
			}
			System.out.println("loop-cycle:" + anInt1007);
			System.out.println("draw-cycle:" + anInt945);
			System.out.println("ptype:" + this.anInt1031);
			System.out.println("psize:" + this.anInt1030);
			if (this.aClass43_1 != null) {
				this.aClass43_1.method550();
			}
			super.aBoolean177 = true;
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("43599, " + 6 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)Ljava/awt/Component;")
	@Override
	protected Component method584() {
		try {
			this.anInt1030 += 0;
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("54659, " + 0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)Ljava/lang/String;")
	private String method656(@OriginalArg(1) int arg0) {
		try {
			if (this.aByte28 != -18) {
				throw new NullPointerException();
			}
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("88164, " + -18 + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!MYGSUHVG;I)Z")
	private boolean method657(@OriginalArg(0) Class27 arg0) {
		try {
			@Pc(12) int local12 = arg0.anInt567;
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
				this.aStringArray10[this.anInt885] = "Remove @whi@" + this.aStringArray12[local12];
				this.anIntArray240[this.anInt885] = 612;
				this.anInt885++;
				this.aStringArray10[this.anInt885] = "Message @whi@" + this.aStringArray12[local12];
				this.anIntArray240[this.anInt885] = 28;
				this.anInt885++;
				return true;
			} else if (local12 >= 401 && local12 <= 500) {
				this.aStringArray10[this.anInt885] = "Remove @whi@" + arg0.aString10;
				this.anIntArray240[this.anInt885] = 199;
				this.anInt885++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("84036, " + arg0 + ", " + 47294 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method658() {
		try {
			for (@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) this.aClass16_10.method185(); local6 != null; local6 = (Class1_Sub3) this.aClass16_10.method187()) {
				if (local6.anInt794 == -1) {
					local6.anInt793 = 0;
					this.method621(local6);
				} else {
					local6.method560();
				}
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("86219, " + 0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!MYGSUHVG;)Z")
	private boolean method659(@OriginalArg(1) Class27 arg0) {
		try {
			@Pc(14) int local14 = arg0.anInt567;
			if (this.anInt828 == 2) {
				if (local14 == 201) {
					this.aBoolean199 = true;
					this.anInt1022 = 0;
					this.aBoolean195 = true;
					this.aString18 = "";
					this.anInt843 = 1;
					this.aString23 = "Enter name of friend to add to list";
				}
				if (local14 == 202) {
					this.aBoolean199 = true;
					this.anInt1022 = 0;
					this.aBoolean195 = true;
					this.aString18 = "";
					this.anInt843 = 2;
					this.aString23 = "Enter name of friend to delete from list";
				}
			}
			if (local14 == 205) {
				this.anInt1034 = 250;
				return true;
			}
			if (local14 == 501) {
				this.aBoolean199 = true;
				this.anInt1022 = 0;
				this.aBoolean195 = true;
				this.aString18 = "";
				this.anInt843 = 4;
				this.aString23 = "Enter name of player to add to list";
			}
			if (local14 == 502) {
				this.aBoolean199 = true;
				this.anInt1022 = 0;
				this.aBoolean195 = true;
				this.aString18 = "";
				this.anInt843 = 5;
				this.aString23 = "Enter name of player to delete from list";
			}
			@Pc(122) int local122;
			@Pc(126) int local126;
			@Pc(131) int local131;
			if (local14 >= 300 && local14 <= 313) {
				local122 = (local14 - 300) / 2;
				local126 = local14 & 0x1;
				local131 = this.anIntArray271[local122];
				if (local131 != -1) {
					while (true) {
						if (local126 == 0) {
							local131--;
							if (local131 < 0) {
								local131 = Class24.anInt466 - 1;
							}
						}
						if (local126 == 1) {
							local131++;
							if (local131 >= Class24.anInt466) {
								local131 = 0;
							}
						}
						if (!Class24.aClass24Array1[local131].aBoolean93 && Class24.aClass24Array1[local131].anInt467 == local122 + (this.aBoolean208 ? 0 : 7)) {
							this.anIntArray271[local122] = local131;
							this.aBoolean215 = true;
							break;
						}
					}
				}
			}
			if (local14 >= 314 && local14 <= 323) {
				local122 = (local14 - 314) / 2;
				local126 = local14 & 0x1;
				local131 = this.anIntArray231[local122];
				if (local126 == 0) {
					local131--;
					if (local131 < 0) {
						local131 = anIntArrayArray24[local122].length - 1;
					}
				}
				if (local126 == 1) {
					local131++;
					if (local131 >= anIntArrayArray24[local122].length) {
						local131 = 0;
					}
				}
				this.anIntArray231[local122] = local131;
				this.aBoolean215 = true;
			}
			if (local14 == 324 && !this.aBoolean208) {
				this.aBoolean208 = true;
				this.method637();
			}
			if (local14 == 325 && this.aBoolean208) {
				this.aBoolean208 = false;
				this.method637();
			}
			if (local14 == 326) {
				this.aClass1_Sub1_Sub4_8.method283(44);
				this.aClass1_Sub1_Sub4_8.method284(this.aBoolean208 ? 0 : 1);
				for (local122 = 0; local122 < 7; local122++) {
					this.aClass1_Sub1_Sub4_8.method284(this.anIntArray271[local122]);
				}
				for (local126 = 0; local126 < 5; local126++) {
					this.aClass1_Sub1_Sub4_8.method284(this.anIntArray231[local126]);
				}
				return true;
			}
			if (local14 == 620) {
				this.aBoolean219 = !this.aBoolean219;
			}
			if (local14 >= 601 && local14 <= 613) {
				this.method638();
				if (this.aString31.length() > 0) {
					this.aClass1_Sub1_Sub4_8.method283(154);
					this.aClass1_Sub1_Sub4_8.method290(Class41.method504(this.aString31));
					this.aClass1_Sub1_Sub4_8.method284(local14 - 601);
					this.aClass1_Sub1_Sub4_8.method284(this.aBoolean219 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(359) RuntimeException local359) {
			signlink.reporterror("74969, " + -887 + ", " + arg0 + ", " + local359.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!MYGSUHVG;IIII)V")
	private void method660(@OriginalArg(0) Class27 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg0.anInt571 == 0 && arg0.anIntArray113 != null && (!arg0.aBoolean115 || this.anInt882 == arg0.anInt565 || this.anInt861 == arg0.anInt565 || this.anInt905 == arg0.anInt565)) {
				@Pc(29) int local29 = Class1_Sub1_Sub2.anInt734;
				@Pc(31) int local31 = Class1_Sub1_Sub2.anInt732;
				@Pc(33) int local33 = Class1_Sub1_Sub2.anInt735;
				@Pc(35) int local35 = Class1_Sub1_Sub2.anInt733;
				Class1_Sub1_Sub2.method514(arg2, arg4, arg2 + arg0.anInt538, arg4 + arg0.anInt542);
				@Pc(51) int local51 = arg0.anIntArray113.length;
				for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
					@Pc(62) int local62 = arg0.anIntArray108[local53] + arg4;
					@Pc(71) int local71 = arg0.anIntArray109[local53] + arg2 - arg1;
					@Pc(77) Class27 local77 = Class27.method339(arg0.anIntArray113[local53]);
					@Pc(82) int local82 = local62 + local77.anInt562;
					@Pc(87) int local87 = local71 + local77.anInt544;
					if (local77.anInt567 > 0) {
						this.method622(local77);
					}
					if (local77.anInt571 == 0) {
						if (local77.anInt570 > local77.anInt568 - local77.anInt538) {
							local77.anInt570 = local77.anInt568 - local77.anInt538;
						}
						if (local77.anInt570 < 0) {
							local77.anInt570 = 0;
						}
						this.method660(local77, local77.anInt570, local87, 878, local82);
						if (local77.anInt568 > local77.anInt538) {
							this.method714(local77.anInt570, local82 + local77.anInt542, local77.anInt538, local87, local77.anInt568);
						}
					} else if (local77.anInt571 != 1) {
						@Pc(159) int local159;
						@Pc(163) int local163;
						@Pc(174) int local174;
						@Pc(209) int local209;
						@Pc(216) int local216;
						@Pc(241) int local241;
						@Pc(157) int local157;
						@Pc(207) int local207;
						if (local77.anInt571 == 2) {
							local157 = 0;
							for (local159 = 0; local159 < local77.anInt538; local159++) {
								for (local163 = 0; local163 < local77.anInt542; local163++) {
									local174 = local82 + local163 * (local77.anInt535 + 32);
									@Pc(183) int local183 = local87 + local159 * (local77.anInt564 + 32);
									if (local157 < 20) {
										local174 += local77.anIntArray107[local157];
										local183 += local77.anIntArray114[local157];
									}
									if (local77.anIntArray110[local157] > 0) {
										local207 = 0;
										local209 = 0;
										local216 = local77.anIntArray110[local157] - 1;
										if (local174 > Class1_Sub1_Sub2.anInt734 - 32 && local174 < Class1_Sub1_Sub2.anInt735 && local183 > Class1_Sub1_Sub2.anInt732 - 32 && local183 < Class1_Sub1_Sub2.anInt733 || this.anInt915 != 0 && this.anInt914 == local157) {
											local241 = 0;
											if (this.anInt868 == 1 && this.anInt869 == local157 && this.anInt870 == local77.anInt565) {
												local241 = 16777215;
											}
											@Pc(265) Class1_Sub1_Sub2_Sub3 local265 = Class3.method35(local241, local77.anIntArray112[local157], local216);
											if (local265 != null) {
												@Pc(344) int local344;
												if (this.anInt915 != 0 && this.anInt914 == local157 && this.anInt913 == local77.anInt565) {
													local207 = super.anInt814 - this.anInt916;
													local209 = super.anInt815 - this.anInt917;
													if (local207 < 5 && local207 > -5) {
														local207 = 0;
													}
													if (local209 < 5 && local209 > -5) {
														local209 = 0;
													}
													if (this.anInt852 < 5) {
														local207 = 0;
														local209 = 0;
													}
													local265.method174(local183 + local209, (byte) 5, local174 + local207);
													if (local183 + local209 < Class1_Sub1_Sub2.anInt732 && arg0.anInt570 > 0) {
														local344 = this.anInt1042 * (Class1_Sub1_Sub2.anInt732 - local183 - local209) / 3;
														if (local344 > this.anInt1042 * 10) {
															local344 = this.anInt1042 * 10;
														}
														if (local344 > arg0.anInt570) {
															local344 = arg0.anInt570;
														}
														arg0.anInt570 -= local344;
														this.anInt917 += local344;
													}
													if (local183 + local209 + 32 > Class1_Sub1_Sub2.anInt733 && arg0.anInt570 < arg0.anInt568 - arg0.anInt538) {
														local344 = this.anInt1042 * (local183 + local209 + 32 - Class1_Sub1_Sub2.anInt733) / 3;
														if (local344 > this.anInt1042 * 10) {
															local344 = this.anInt1042 * 10;
														}
														if (local344 > arg0.anInt568 - arg0.anInt538 - arg0.anInt570) {
															local344 = arg0.anInt568 - arg0.anInt538 - arg0.anInt570;
														}
														arg0.anInt570 += local344;
														this.anInt917 -= local344;
													}
												} else if (this.anInt987 != 0 && this.anInt986 == local157 && this.anInt985 == local77.anInt565) {
													local265.method174(local183, (byte) 5, local174);
												} else {
													local265.method172(local174, local183);
												}
												if (local265.anInt353 == 33 || local77.anIntArray112[local157] != 1) {
													local344 = local77.anIntArray112[local157];
													this.aClass1_Sub1_Sub2_Sub1_2.method73((byte) 6, local183 + local209 + 10, method712(this.anInt893, local344), local174 + local207 + 1, 0);
													this.aClass1_Sub1_Sub2_Sub1_2.method73((byte) 6, local183 + local209 + 9, method712(this.anInt893, local344), local174 + local207, 16776960);
												}
											}
										}
									} else if (local77.aClass1_Sub1_Sub2_Sub3Array1 != null && local157 < 20) {
										@Pc(535) Class1_Sub1_Sub2_Sub3 local535 = local77.aClass1_Sub1_Sub2_Sub3Array1[local157];
										if (local535 != null) {
											local535.method172(local174, local183);
										}
									}
									local157++;
								}
							}
						} else if (local77.anInt571 == 3) {
							@Pc(561) boolean local561 = false;
							if (this.anInt905 == local77.anInt565 || this.anInt861 == local77.anInt565 || this.anInt882 == local77.anInt565) {
								local561 = true;
							}
							if (this.method707(this.aBoolean203, local77)) {
								local157 = local77.anInt534;
								if (local561 && local77.anInt560 != 0) {
									local157 = local77.anInt560;
								}
							} else {
								local157 = local77.anInt558;
								if (local561 && local77.anInt572 != 0) {
									local157 = local77.anInt572;
								}
							}
							if (local77.aByte17 == 0) {
								if (local77.aBoolean116) {
									Class1_Sub1_Sub2.method517(local157, local77.anInt538, local82, local87, local77.anInt542);
								} else {
									Class1_Sub1_Sub2.method518(local77.anInt538, local157, local77.anInt542, local87, local82);
								}
							} else if (local77.aBoolean116) {
								Class1_Sub1_Sub2.method516(local157, local87, local77.anInt542, 256 - (local77.aByte17 & 0xFF), local82, local77.anInt538);
							} else {
								Class1_Sub1_Sub2.method519(local82, local157, 256 - (local77.aByte17 & 0xFF), local77.anInt538, local77.anInt542, local87);
							}
						} else {
							@Pc(680) Class1_Sub1_Sub2_Sub1 local680;
							@Pc(958) String local958;
							if (local77.anInt571 == 4) {
								local680 = local77.aClass1_Sub1_Sub2_Sub1_1;
								@Pc(683) String local683 = local77.aString10;
								@Pc(685) boolean local685 = false;
								if (this.anInt905 == local77.anInt565 || this.anInt861 == local77.anInt565 || this.anInt882 == local77.anInt565) {
									local685 = true;
								}
								if (this.method707(this.aBoolean203, local77)) {
									local159 = local77.anInt534;
									if (local685 && local77.anInt560 != 0) {
										local159 = local77.anInt560;
									}
									if (local77.aString8.length() > 0) {
										local683 = local77.aString8;
									}
								} else {
									local159 = local77.anInt558;
									if (local685 && local77.anInt572 != 0) {
										local159 = local77.anInt572;
									}
								}
								if (local77.anInt559 == 6 && this.aBoolean189) {
									local683 = "Please wait...";
									local159 = local77.anInt558;
								}
								if (Class1_Sub1_Sub2.anInt730 == 479) {
									if (local159 == 16776960) {
										local159 = 255;
									}
									if (local159 == 49152) {
										local159 = 16777215;
									}
								}
								local207 = local87 + local680.anInt170;
								while (local683.length() > 0) {
									if (local683.indexOf("%") != -1) {
										label390: while (true) {
											local209 = local683.indexOf("%1");
											if (local209 == -1) {
												while (true) {
													local209 = local683.indexOf("%2");
													if (local209 == -1) {
														while (true) {
															local209 = local683.indexOf("%3");
															if (local209 == -1) {
																while (true) {
																	local209 = local683.indexOf("%4");
																	if (local209 == -1) {
																		while (true) {
																			local209 = local683.indexOf("%5");
																			if (local209 == -1) {
																				break label390;
																			}
																			local683 = local683.substring(0, local209) + this.method656(this.method650(local77, 4)) + local683.substring(local209 + 2);
																		}
																	}
																	local683 = local683.substring(0, local209) + this.method656(this.method650(local77, 3)) + local683.substring(local209 + 2);
																}
															}
															local683 = local683.substring(0, local209) + this.method656(this.method650(local77, 2)) + local683.substring(local209 + 2);
														}
													}
													local683 = local683.substring(0, local209) + this.method656(this.method650(local77, 1)) + local683.substring(local209 + 2);
												}
											}
											local683 = local683.substring(0, local209) + this.method656(this.method650(local77, 0)) + local683.substring(local209 + 2);
										}
									}
									local209 = local683.indexOf("\\n");
									if (local209 == -1) {
										local958 = local683;
										local683 = "";
									} else {
										local958 = local683.substring(0, local209);
										local683 = local683.substring(local209 + 2);
									}
									if (local77.aBoolean107) {
										local680.method70(local958, local77.aBoolean113, local207, local159, local82 + local77.anInt542 / 2);
									} else {
										local680.method77(local82, local207, local77.aBoolean113, local958, local159);
									}
									local207 += local680.anInt170;
								}
							} else if (local77.anInt571 == 5) {
								@Pc(1021) Class1_Sub1_Sub2_Sub3 local1021;
								if (this.method707(this.aBoolean203, local77)) {
									local1021 = local77.aClass1_Sub1_Sub2_Sub3_1;
								} else {
									local1021 = local77.aClass1_Sub1_Sub2_Sub3_2;
								}
								if (local1021 != null) {
									local1021.method172(local82, local87);
								}
							} else if (local77.anInt571 == 6) {
								local157 = Class1_Sub1_Sub2_Sub4.anInt741;
								local159 = Class1_Sub1_Sub2_Sub4.anInt742;
								Class1_Sub1_Sub2_Sub4.anInt741 = local82 + local77.anInt542 / 2;
								Class1_Sub1_Sub2_Sub4.anInt742 = local87 + local77.anInt538 / 2;
								local163 = Class1_Sub1_Sub2_Sub4.anIntArray195[local77.anInt552] * local77.anInt551 >> 16;
								local174 = Class1_Sub1_Sub2_Sub4.anIntArray196[local77.anInt552] * local77.anInt551 >> 16;
								@Pc(1083) boolean local1083 = this.method707(this.aBoolean203, local77);
								if (local1083) {
									local207 = local77.anInt557;
								} else {
									local207 = local77.anInt556;
								}
								@Pc(1103) Class1_Sub1_Sub1_Sub4 local1103;
								if (local207 == -1) {
									local1103 = local77.method337(local1083, -1, -1);
								} else {
									@Pc(1109) Class19 local1109 = Class19.aClass19Array1[local207];
									local1103 = local77.method337(local1083, local1109.anIntArray82[local77.anInt555], local1109.anIntArray83[local77.anInt555]);
								}
								if (local1103 != null) {
									local1103.method384(local77.anInt553, 0, local77.anInt552, 0, local163, local174);
								}
								Class1_Sub1_Sub2_Sub4.anInt741 = local157;
								Class1_Sub1_Sub2_Sub4.anInt742 = local159;
							} else {
								if (local77.anInt571 == 7) {
									local680 = local77.aClass1_Sub1_Sub2_Sub1_1;
									local159 = 0;
									for (local163 = 0; local163 < local77.anInt538; local163++) {
										for (local174 = 0; local174 < local77.anInt542; local174++) {
											if (local77.anIntArray110[local159] > 0) {
												@Pc(1173) Class3 local1173 = Class3.method34(local77.anIntArray110[local159] - 1);
												@Pc(1177) String local1177 = String.valueOf(local1173.aString3);
												if (local1173.aBoolean13 || local77.anIntArray112[local159] != 1) {
													local1177 = local1177 + " x" + method720(local77.anIntArray112[local159]);
												}
												local209 = local82 + local174 * (local77.anInt535 + 115);
												local216 = local87 + local163 * (local77.anInt564 + 12);
												if (local77.aBoolean107) {
													local680.method70(local1177, local77.aBoolean113, local216, local77.anInt558, local209 + local77.anInt542 / 2);
												} else {
													local680.method77(local209, local216, local77.aBoolean113, local1177, local77.anInt558);
												}
											}
											local159++;
										}
									}
								}
								if (local77.anInt571 == 8 && (this.anInt829 == local77.anInt565 || this.anInt912 == local77.anInt565 || this.anInt862 == local77.anInt565) && this.anInt981 == 100) {
									local157 = 0;
									local159 = 0;
									@Pc(1291) Class1_Sub1_Sub2_Sub1 local1291 = this.aClass1_Sub1_Sub2_Sub1_3;
									@Pc(1294) String local1294 = local77.aString10;
									while (local1294.length() > 0) {
										local207 = local1294.indexOf("\\n");
										if (local207 == -1) {
											local958 = local1294;
											local1294 = "";
										} else {
											local958 = local1294.substring(0, local207);
											local1294 = local1294.substring(local207 + 2);
										}
										local209 = local1291.method71(local958);
										if (local209 > local157) {
											local157 = local209;
										}
										local159 += local1291.anInt170 + 1;
									}
									local157 += 6;
									local159 += 7;
									local207 = local82 + local77.anInt542 - local157 - 5;
									local209 = local87 + local77.anInt538 + 5;
									if (local207 < local82 + 5) {
										local207 = local82 + 5;
									}
									if (local207 + local157 > arg4 + arg0.anInt542) {
										local207 = arg4 + arg0.anInt542 - local157;
									}
									if (local209 + local159 > arg2 + arg0.anInt538) {
										local209 = arg2 + arg0.anInt538 - local159;
									}
									Class1_Sub1_Sub2.method517(16777120, local159, local207, local209, local157);
									Class1_Sub1_Sub2.method518(local159, 0, local157, local209, local207);
									local1294 = local77.aString10;
									local216 = local209 + local1291.anInt170 + 2;
									while (local1294.length() > 0) {
										local241 = local1294.indexOf("\\n");
										if (local241 == -1) {
											local958 = local1294;
											local1294 = "";
										} else {
											local958 = local1294.substring(0, local241);
											local1294 = local1294.substring(local241 + 2);
										}
										local1291.method77(local207 + 3, local216, false, local958, 0);
										local216 += local1291.anInt170 + 1;
									}
								}
							}
						}
					}
				}
				@Pc(1475) boolean local1475 = false;
				Class1_Sub1_Sub2.method514(local31, local29, local35, local33);
			}
		} catch (@Pc(1483) RuntimeException local1483) {
			signlink.reporterror("64957, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local1483.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method661() {
		try {
			@Pc(3) int local3 = 5;
			this.anIntArray225[8] = 0;
			@Pc(19) int local19 = 0;
			while (this.anIntArray225[8] == 0) {
				@Pc(23) String local23 = "Unknown problem";
				this.method586(20, "Connecting to web server");
				try {
					@Pc(45) DataInputStream local45 = this.method708("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 365);
					@Pc(52) Class1_Sub1_Sub4 local52 = new Class1_Sub1_Sub4(0, new byte[40]);
					local45.readFully(local52.aByteArray14, 0, 40);
					local45.close();
					for (@Pc(62) int local62 = 0; local62 < 9; local62++) {
						this.anIntArray225[local62] = local52.method299();
					}
					@Pc(77) int local77 = local52.method299();
					@Pc(79) int local79 = 1234;
					for (@Pc(81) int local81 = 0; local81 < 9; local81++) {
						local79 = (local79 << 1) + this.anIntArray225[local81];
					}
					if (local77 != local79) {
						local23 = "checksum problem";
						this.anIntArray225[8] = 0;
					}
				} catch (@Pc(108) EOFException local108) {
					local23 = "EOF problem";
					this.anIntArray225[8] = 0;
				} catch (@Pc(117) IOException local117) {
					local23 = "connection problem";
					this.anIntArray225[8] = 0;
				} catch (@Pc(126) Exception local126) {
					local23 = "logic problem";
					this.anIntArray225[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray225[8] == 0) {
					local19++;
					for (@Pc(144) int local144 = local3; local144 > 0; local144--) {
						if (local19 >= 10) {
							this.method586(10, "Game updated - please reload page");
							local144 = 10;
						} else {
							this.method586(10, local23 + " - Will retry in " + local144 + " secs.");
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(178) Exception local178) {
						}
					}
					local3 *= 2;
					if (local3 > 60) {
						local3 = 60;
					}
					this.aBoolean193 = !this.aBoolean193;
				}
			}
		} catch (@Pc(206) RuntimeException local206) {
			signlink.reporterror("70603, " + -33 + ", " + local206.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!IBHUFTPE;II)V")
	private void method662(@OriginalArg(1) Class1_Sub1_Sub2_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 != null) {
				@Pc(10) int local10 = this.anInt976 + this.anInt887 & 0x7FF;
				@Pc(18) int local18 = arg2 * arg2 + arg1 * arg1;
				if (local18 <= 6400) {
					@Pc(26) int local26 = Class1_Sub1_Sub1_Sub4.anIntArray155[local10];
					@Pc(30) int local30 = Class1_Sub1_Sub1_Sub4.anIntArray156[local10];
					@Pc(39) int local39 = local26 * 256 / (this.anInt967 + 256);
					@Pc(51) int local51 = local30 * 256 / (this.anInt967 + 256);
					@Pc(61) int local61 = arg1 * local39 + arg2 * local51 >> 16;
					@Pc(71) int local71 = arg1 * local51 - arg2 * local39 >> 16;
					if (local18 > 2500) {
						arg0.method178(this.aClass1_Sub1_Sub2_Sub2_12, 83 - local71 - arg0.anInt354 / 2 - 4, local61 + 94 - arg0.anInt353 / 2 + 4);
					} else {
						arg0.method172(local61 + 94 + 4 - arg0.anInt353 / 2, 83 - local71 - arg0.anInt354 / 2 - 4);
					}
				}
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("23698, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method663() {
		try {
			if (super.anInt819 == 1) {
				if (super.anInt820 >= 539 && super.anInt820 <= 573 && super.anInt821 >= 169 && super.anInt821 < 205 && this.anIntArray229[0] != -1) {
					this.aBoolean194 = true;
					this.anInt959 = 0;
					this.aBoolean181 = true;
				}
				if (super.anInt820 >= 569 && super.anInt820 <= 599 && super.anInt821 >= 168 && super.anInt821 < 205 && this.anIntArray229[1] != -1) {
					this.aBoolean194 = true;
					this.anInt959 = 1;
					this.aBoolean181 = true;
				}
				if (super.anInt820 >= 597 && super.anInt820 <= 627 && super.anInt821 >= 168 && super.anInt821 < 205 && this.anIntArray229[2] != -1) {
					this.aBoolean194 = true;
					this.anInt959 = 2;
					this.aBoolean181 = true;
				}
				if (super.anInt820 >= 625 && super.anInt820 <= 669 && super.anInt821 >= 168 && super.anInt821 < 203 && this.anIntArray229[3] != -1) {
					this.aBoolean194 = true;
					this.anInt959 = 3;
					this.aBoolean181 = true;
				}
				if (super.anInt820 >= 666 && super.anInt820 <= 696 && super.anInt821 >= 168 && super.anInt821 < 205 && this.anIntArray229[4] != -1) {
					this.aBoolean194 = true;
					this.anInt959 = 4;
					this.aBoolean181 = true;
				}
				if (super.anInt820 >= 694 && super.anInt820 <= 724 && super.anInt821 >= 168 && super.anInt821 < 205 && this.anIntArray229[5] != -1) {
					this.aBoolean194 = true;
					this.anInt959 = 5;
					this.aBoolean181 = true;
				}
				if (super.anInt820 >= 722 && super.anInt820 <= 756 && super.anInt821 >= 169 && super.anInt821 < 205 && this.anIntArray229[6] != -1) {
					this.aBoolean194 = true;
					this.anInt959 = 6;
					this.aBoolean181 = true;
				}
				if (super.anInt820 >= 540 && super.anInt820 <= 574 && super.anInt821 >= 466 && super.anInt821 < 502 && this.anIntArray229[7] != -1) {
					this.aBoolean194 = true;
					this.anInt959 = 7;
					this.aBoolean181 = true;
				}
				if (super.anInt820 >= 572 && super.anInt820 <= 602 && super.anInt821 >= 466 && super.anInt821 < 503 && this.anIntArray229[8] != -1) {
					this.aBoolean194 = true;
					this.anInt959 = 8;
					this.aBoolean181 = true;
				}
				if (super.anInt820 >= 599 && super.anInt820 <= 629 && super.anInt821 >= 466 && super.anInt821 < 503 && this.anIntArray229[9] != -1) {
					this.aBoolean194 = true;
					this.anInt959 = 9;
					this.aBoolean181 = true;
				}
				if (super.anInt820 >= 627 && super.anInt820 <= 671 && super.anInt821 >= 467 && super.anInt821 < 502 && this.anIntArray229[10] != -1) {
					this.aBoolean194 = true;
					this.anInt959 = 10;
					this.aBoolean181 = true;
				}
				if (super.anInt820 >= 669 && super.anInt820 <= 699 && super.anInt821 >= 466 && super.anInt821 < 503 && this.anIntArray229[11] != -1) {
					this.aBoolean194 = true;
					this.anInt959 = 11;
					this.aBoolean181 = true;
				}
				if (super.anInt820 >= 696 && super.anInt820 <= 726 && super.anInt821 >= 466 && super.anInt821 < 503 && this.anIntArray229[12] != -1) {
					this.aBoolean194 = true;
					this.anInt959 = 12;
					this.aBoolean181 = true;
				}
				if (super.anInt820 >= 724 && super.anInt820 <= 758 && super.anInt821 >= 466 && super.anInt821 < 502 && this.anIntArray229[13] != -1) {
					this.aBoolean194 = true;
					this.anInt959 = 13;
					this.aBoolean181 = true;
					return;
				}
			}
		} catch (@Pc(443) RuntimeException local443) {
			signlink.reporterror("71079, " + true + ", " + local443.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIILclient!MYGSUHVG;)V")
	private void method664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class27 arg6) {
		try {
			if (arg6.anInt571 == 0 && arg6.anIntArray113 != null && !arg6.aBoolean115 && (arg3 >= arg1 && arg5 >= arg4 && arg3 <= arg1 + arg6.anInt542 && arg5 <= arg4 + arg6.anInt538)) {
				@Pc(34) int local34 = arg6.anIntArray113.length;
				for (@Pc(40) int local40 = 0; local40 < local34; local40++) {
					@Pc(49) int local49 = arg6.anIntArray108[local40] + arg1;
					@Pc(58) int local58 = arg6.anIntArray109[local40] + arg4 - arg0;
					@Pc(64) Class27 local64 = Class27.method339(arg6.anIntArray113[local40]);
					@Pc(69) int local69 = local49 + local64.anInt562;
					@Pc(74) int local74 = local58 + local64.anInt544;
					if ((local64.anInt561 >= 0 || local64.anInt572 != 0) && arg3 >= local69 && arg5 >= local74 && arg3 < local69 + local64.anInt542 && arg5 < local74 + local64.anInt538) {
						if (local64.anInt561 >= 0) {
							this.anInt1004 = local64.anInt561;
						} else {
							this.anInt1004 = local64.anInt565;
						}
					}
					if (local64.anInt571 == 8 && arg3 >= local69 && arg5 >= local74 && arg3 < local69 + local64.anInt542 && arg5 < local74 + local64.anInt538) {
						this.anInt879 = local64.anInt565;
					}
					if (local64.anInt571 == 0) {
						this.method664(local64.anInt570, local69, arg2, arg3, local74, arg5, local64);
						if (local64.anInt568 > local64.anInt538) {
							this.method646(arg5, local64, local64.anInt538, local74, arg2, arg3, local69 + local64.anInt542, local64.anInt568);
						}
					} else {
						if (local64.anInt559 == 1 && arg3 >= local69 && arg5 >= local74 && arg3 < local69 + local64.anInt542 && arg5 < local74 + local64.anInt538) {
							@Pc(198) boolean local198 = false;
							if (local64.anInt567 != 0) {
								local198 = this.method657(local64);
							}
							if (!local198) {
								this.aStringArray10[this.anInt885] = local64.aString11;
								this.anIntArray240[this.anInt885] = 639;
								this.anIntArray239[this.anInt885] = local64.anInt565;
								this.anInt885++;
							}
						}
						if (local64.anInt559 == 2 && this.anInt963 == 0 && arg3 >= local69 && arg5 >= local74 && arg3 < local69 + local64.anInt542 && arg5 < local74 + local64.anInt538) {
							@Pc(262) String local262 = local64.aString12;
							if (local262.indexOf(" ") != -1) {
								local262 = local262.substring(0, local262.indexOf(" "));
							}
							this.aStringArray10[this.anInt885] = local262 + " @gre@" + local64.aString9;
							this.anIntArray240[this.anInt885] = 201;
							this.anIntArray239[this.anInt885] = local64.anInt565;
							this.anInt885++;
						}
						if (local64.anInt559 == 3 && arg3 >= local69 && arg5 >= local74 && arg3 < local69 + local64.anInt542 && arg5 < local74 + local64.anInt538) {
							this.aStringArray10[this.anInt885] = "Close";
							if (arg2 == 3) {
								this.anIntArray240[this.anInt885] = 141;
							} else {
								this.anIntArray240[this.anInt885] = 78;
							}
							this.anIntArray239[this.anInt885] = local64.anInt565;
							this.anInt885++;
						}
						if (local64.anInt559 == 4 && arg3 >= local69 && arg5 >= local74 && arg3 < local69 + local64.anInt542 && arg5 < local74 + local64.anInt538) {
							this.aStringArray10[this.anInt885] = local64.aString11;
							this.anIntArray240[this.anInt885] = 600;
							this.anIntArray239[this.anInt885] = local64.anInt565;
							this.anInt885++;
						}
						if (local64.anInt559 == 5 && arg3 >= local69 && arg5 >= local74 && arg3 < local69 + local64.anInt542 && arg5 < local74 + local64.anInt538) {
							this.aStringArray10[this.anInt885] = local64.aString11;
							this.anIntArray240[this.anInt885] = 645;
							this.anIntArray239[this.anInt885] = local64.anInt565;
							this.anInt885++;
						}
						if (local64.anInt559 == 6 && !this.aBoolean189 && arg3 >= local69 && arg5 >= local74 && arg3 < local69 + local64.anInt542 && arg5 < local74 + local64.anInt538) {
							this.aStringArray10[this.anInt885] = local64.aString11;
							this.anIntArray240[this.anInt885] = 253;
							this.anIntArray239[this.anInt885] = local64.anInt565;
							this.anInt885++;
						}
						if (local64.anInt571 == 2) {
							@Pc(521) int local521 = 0;
							for (@Pc(523) int local523 = 0; local523 < local64.anInt538; local523++) {
								for (@Pc(527) int local527 = 0; local527 < local64.anInt542; local527++) {
									@Pc(538) int local538 = local69 + local527 * (local64.anInt535 + 32);
									@Pc(547) int local547 = local74 + local523 * (local64.anInt564 + 32);
									if (local521 < 20) {
										local538 += local64.anIntArray107[local521];
										local547 += local64.anIntArray114[local521];
									}
									if (arg3 >= local538 && arg5 >= local547 && arg3 < local538 + 32 && arg5 < local547 + 32) {
										this.anInt929 = local521;
										this.anInt930 = local64.anInt565;
										if (local64.anIntArray110[local521] > 0) {
											@Pc(600) Class3 local600 = Class3.method34(local64.anIntArray110[local521] - 1);
											if (this.anInt868 == 1 && local64.aBoolean110) {
												if (local64.anInt565 != this.anInt870 || local521 != this.anInt869) {
													this.aStringArray10[this.anInt885] = "Use " + this.aString17 + " with @lre@" + local600.aString3;
													this.anIntArray240[this.anInt885] = 878;
													this.anIntArray241[this.anInt885] = local600.anInt119;
													this.anIntArray238[this.anInt885] = local521;
													this.anIntArray239[this.anInt885] = local64.anInt565;
													this.anInt885++;
												}
											} else if (this.anInt963 != 1 || !local64.aBoolean110) {
												@Pc(737) int local737;
												if (local64.aBoolean110) {
													for (local737 = 4; local737 >= 3; local737--) {
														if (local600.aStringArray1 != null && local600.aStringArray1[local737] != null) {
															this.aStringArray10[this.anInt885] = local600.aStringArray1[local737] + " @lre@" + local600.aString3;
															if (local737 == 3) {
																this.anIntArray240[this.anInt885] = 635;
															}
															if (local737 == 4) {
																this.anIntArray240[this.anInt885] = 139;
															}
															this.anIntArray241[this.anInt885] = local600.anInt119;
															this.anIntArray238[this.anInt885] = local521;
															this.anIntArray239[this.anInt885] = local64.anInt565;
															this.anInt885++;
														} else if (local737 == 4) {
															this.aStringArray10[this.anInt885] = "Drop @lre@" + local600.aString3;
															this.anIntArray240[this.anInt885] = 139;
															this.anIntArray241[this.anInt885] = local600.anInt119;
															this.anIntArray238[this.anInt885] = local521;
															this.anIntArray239[this.anInt885] = local64.anInt565;
															this.anInt885++;
														}
													}
												}
												if (local64.aBoolean111) {
													this.aStringArray10[this.anInt885] = "Use @lre@" + local600.aString3;
													this.anIntArray240[this.anInt885] = 25;
													this.anIntArray241[this.anInt885] = local600.anInt119;
													this.anIntArray238[this.anInt885] = local521;
													this.anIntArray239[this.anInt885] = local64.anInt565;
													this.anInt885++;
												}
												if (local64.aBoolean110 && local600.aStringArray1 != null) {
													for (local737 = 2; local737 >= 0; local737--) {
														if (local600.aStringArray1[local737] != null) {
															this.aStringArray10[this.anInt885] = local600.aStringArray1[local737] + " @lre@" + local600.aString3;
															if (local737 == 0) {
																this.anIntArray240[this.anInt885] = 176;
															}
															if (local737 == 1) {
																this.anIntArray240[this.anInt885] = 212;
															}
															if (local737 == 2) {
																this.anIntArray240[this.anInt885] = 592;
															}
															this.anIntArray241[this.anInt885] = local600.anInt119;
															this.anIntArray238[this.anInt885] = local521;
															this.anIntArray239[this.anInt885] = local64.anInt565;
															this.anInt885++;
														}
													}
												}
												if (local64.aStringArray5 != null) {
													for (local737 = 4; local737 >= 0; local737--) {
														if (local64.aStringArray5[local737] != null) {
															this.aStringArray10[this.anInt885] = local64.aStringArray5[local737] + " @lre@" + local600.aString3;
															if (local737 == 0) {
																this.anIntArray240[this.anInt885] = 872;
															}
															if (local737 == 1) {
																this.anIntArray240[this.anInt885] = 348;
															}
															if (local737 == 2) {
																this.anIntArray240[this.anInt885] = 881;
															}
															if (local737 == 3) {
																this.anIntArray240[this.anInt885] = 829;
															}
															if (local737 == 4) {
																this.anIntArray240[this.anInt885] = 497;
															}
															this.anIntArray241[this.anInt885] = local600.anInt119;
															this.anIntArray238[this.anInt885] = local521;
															this.anIntArray239[this.anInt885] = local64.anInt565;
															this.anInt885++;
														}
													}
												}
												this.aStringArray10[this.anInt885] = "Examine @lre@" + local600.aString3;
												this.anIntArray240[this.anInt885] = 1169;
												this.anIntArray241[this.anInt885] = local600.anInt119;
												this.anIntArray238[this.anInt885] = local521;
												this.anIntArray239[this.anInt885] = local64.anInt565;
												this.anInt885++;
											} else if ((this.anInt965 & 0x10) == 16) {
												this.aStringArray10[this.anInt885] = this.aString24 + " @lre@" + local600.aString3;
												this.anIntArray240[this.anInt885] = 200;
												this.anIntArray241[this.anInt885] = local600.anInt119;
												this.anIntArray238[this.anInt885] = local521;
												this.anIntArray239[this.anInt885] = local64.anInt565;
												this.anInt885++;
											}
										}
									}
									local521++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1167) RuntimeException local1167) {
			signlink.reporterror("88843, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 2 + ", " + arg6 + ", " + local1167.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method665() {
		try {
			while (true) {
				@Pc(13) Class1_Sub1_Sub3 local13 = this.aClass28_Sub1_1.method462();
				if (local13 == null) {
					return;
				}
				if (local13.anInt332 == 0) {
					Class1_Sub1_Sub1_Sub4.method361(local13.anInt333, 141, local13.aByteArray4);
					if ((this.aClass28_Sub1_1.method457(local13.anInt333) & 0x62) != 0) {
						this.aBoolean194 = true;
						if (this.anInt1054 != -1 || this.anInt1040 != -1) {
							this.aBoolean199 = true;
						}
					}
				}
				if (local13.anInt332 == 1 && local13.aByteArray4 != null) {
					Class49.method570(local13.aByteArray4);
				}
				if (local13.anInt332 == 2 && local13.anInt333 == this.anInt1012 && local13.aByteArray4 != null) {
					this.method672(local13.aByteArray4, this.aBoolean214);
				}
				if (local13.anInt332 == 3 && this.anInt922 == 1) {
					for (@Pc(88) int local88 = 0; local88 < this.aByteArrayArray6.length; local88++) {
						if (this.anIntArray217[local88] == local13.anInt333) {
							this.aByteArrayArray6[local88] = local13.aByteArray4;
							if (local13.aByteArray4 == null) {
								this.anIntArray217[local88] = -1;
							}
							break;
						}
						if (this.anIntArray218[local88] == local13.anInt333) {
							this.aByteArrayArray5[local88] = local13.aByteArray4;
							if (local13.aByteArray4 == null) {
								this.anIntArray218[local88] = -1;
							}
							break;
						}
					}
				}
				if (local13.anInt332 == 93 && this.aClass28_Sub1_1.method466(local13.anInt333)) {
					Class39.method492(this.aClass28_Sub1_1, new Class1_Sub1_Sub4(0, local13.aByteArray4));
				}
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("5113, " + -33822 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method666(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt1015 > 1) {
				this.anInt1015--;
			}
			if (this.anInt1034 > 0) {
				this.anInt1034--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method703(918); local22++) {
			}
			if (this.aBoolean188) {
				@Pc(41) Object local41 = this.aClass48_1.anObject1;
				@Pc(66) int local66;
				@Pc(68) int local68;
				@Pc(70) int local70;
				@Pc(103) int local103;
				synchronized (this.aClass48_1.anObject1) {
					if (!aBoolean211) {
						this.aClass48_1.anInt799 = 0;
					} else if (super.anInt819 != 0 || this.aClass48_1.anInt799 >= 40) {
						this.aClass1_Sub1_Sub4_8.method283(156);
						this.aClass1_Sub1_Sub4_8.method284(0);
						local66 = this.aClass1_Sub1_Sub4_8.anInt529;
						local68 = 0;
						@Pc(86) int local86;
						for (local70 = 0; local70 < this.aClass48_1.anInt799 && local66 - this.aClass1_Sub1_Sub4_8.anInt529 < 240; local70++) {
							local68++;
							local86 = this.aClass48_1.anIntArray204[local70];
							if (local86 < 0) {
								local86 = 0;
							} else if (local86 > 502) {
								local86 = 502;
							}
							local103 = this.aClass48_1.anIntArray205[local70];
							if (local103 < 0) {
								local103 = 0;
							} else if (local103 > 764) {
								local103 = 764;
							}
							@Pc(120) int local120 = local86 * 765 + local103;
							if (this.aClass48_1.anIntArray204[local70] == -1 && this.aClass48_1.anIntArray205[local70] == -1) {
								local103 = -1;
								local86 = -1;
								local120 = 524287;
							}
							if (local103 != this.anInt1048 || local86 != this.anInt1049) {
								@Pc(165) int local165 = local103 - this.anInt1048;
								this.anInt1048 = local103;
								@Pc(173) int local173 = local86 - this.anInt1049;
								this.anInt1049 = local86;
								if (this.anInt994 < 8 && local165 >= -32 && local165 <= 31 && local173 >= -32 && local173 <= 31) {
									local165 += 32;
									local173 += 32;
									this.aClass1_Sub1_Sub4_8.method285((this.anInt994 << 12) + (local165 << 6) + local173);
									this.anInt994 = 0;
								} else if (this.anInt994 < 8) {
									this.aClass1_Sub1_Sub4_8.method287((this.anInt994 << 19) + local120 + 8388608);
									this.anInt994 = 0;
								} else {
									this.aClass1_Sub1_Sub4_8.method288((this.anInt994 << 19) + local120 - 1073741824);
									this.anInt994 = 0;
								}
							} else if (this.anInt994 < 2047) {
								this.anInt994++;
							}
						}
						this.aClass1_Sub1_Sub4_8.method293(this.aClass1_Sub1_Sub4_8.anInt529 - local66);
						if (local68 >= this.aClass48_1.anInt799) {
							this.aClass48_1.anInt799 = 0;
						} else {
							this.aClass48_1.anInt799 -= local68;
							for (local86 = 0; local86 < this.aClass48_1.anInt799; local86++) {
								this.aClass48_1.anIntArray205[local86] = this.aClass48_1.anIntArray205[local86 + local68];
								this.aClass48_1.anIntArray204[local86] = this.aClass48_1.anIntArray204[local86 + local68];
							}
						}
					}
				}
				if (super.anInt819 != 0) {
					@Pc(336) long local336 = (super.aLong28 - this.aLong30) / 50L;
					if (local336 > 4095L) {
						local336 = 4095L;
					}
					this.aLong30 = super.aLong28;
					local66 = super.anInt821;
					if (local66 < 0) {
						local66 = 0;
					} else if (local66 > 502) {
						local66 = 502;
					}
					local68 = super.anInt820;
					if (local68 < 0) {
						local68 = 0;
					} else if (local68 > 764) {
						local68 = 764;
					}
					local70 = local66 * 765 + local68;
					@Pc(382) byte local382 = 0;
					if (super.anInt819 == 2) {
						local382 = 1;
					}
					local103 = (int) local336;
					this.aClass1_Sub1_Sub4_8.method283(127);
					this.aClass1_Sub1_Sub4_8.method325((local103 << 20) + (local382 << 19) + local70);
				}
				if (this.anInt874 > 0) {
					this.anInt874--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean191 = true;
				}
				if (this.aBoolean191 && this.anInt874 <= 0) {
					this.anInt874 = 20;
					this.aBoolean191 = false;
					this.aClass1_Sub1_Sub4_8.method283(82);
					this.aClass1_Sub1_Sub4_8.method318(this.anInt975);
					this.aClass1_Sub1_Sub4_8.method285(this.anInt976);
				}
				if (super.aBoolean179 && !this.aBoolean184) {
					this.aBoolean184 = true;
					this.aClass1_Sub1_Sub4_8.method283(163);
					this.aClass1_Sub1_Sub4_8.method284(1);
				}
				if (!super.aBoolean179 && this.aBoolean184) {
					this.aBoolean184 = false;
					this.aClass1_Sub1_Sub4_8.method283(163);
					this.aClass1_Sub1_Sub4_8.method284(0);
				}
				this.method603((byte) 2);
				this.method668();
				this.method636(this.anInt934);
				this.anInt1032++;
				if (this.anInt1032 > 750) {
					this.method700();
				}
				this.method699();
				this.method591();
				this.method615();
				this.anInt1042++;
				if (this.anInt909 != 0) {
					this.anInt908 += 20;
					if (this.anInt908 >= 400) {
						this.anInt909 = 0;
					}
				}
				if (this.anInt987 != 0) {
					this.anInt984++;
					if (this.anInt984 >= 15) {
						if (this.anInt987 == 2) {
							this.aBoolean194 = true;
						}
						if (this.anInt987 == 3) {
							this.aBoolean199 = true;
						}
						this.anInt987 = 0;
					}
				}
				if (this.anInt915 != 0) {
					this.anInt852++;
					if (super.anInt814 > this.anInt916 + 5 || super.anInt814 < this.anInt916 - 5 || super.anInt815 > this.anInt917 + 5 || super.anInt815 < this.anInt917 - 5) {
						this.aBoolean223 = true;
					}
					if (super.anInt813 == 0) {
						if (this.anInt915 == 2) {
							this.aBoolean194 = true;
						}
						if (this.anInt915 == 3) {
							this.aBoolean199 = true;
						}
						this.anInt915 = 0;
						if (this.aBoolean223 && this.anInt852 >= 5) {
							this.anInt930 = -1;
							this.method698();
							if (this.anInt930 == this.anInt913 && this.anInt929 != this.anInt914) {
								@Pc(684) Class27 local684 = Class27.method339(this.anInt913);
								@Pc(686) byte local686 = 0;
								if (this.anInt903 == 1 && local684.anInt567 == 206) {
									local686 = 1;
								}
								if (local684.anIntArray110[this.anInt929] <= 0) {
									local686 = 0;
								}
								if (local684.aBoolean114) {
									local66 = this.anInt914;
									local68 = this.anInt929;
									local684.anIntArray110[local68] = local684.anIntArray110[local66];
									local684.anIntArray112[local68] = local684.anIntArray112[local66];
									local684.anIntArray110[local66] = -1;
									local684.anIntArray112[local66] = 0;
								} else if (local686 == 1) {
									local66 = this.anInt914;
									local68 = this.anInt929;
									while (local66 != local68) {
										if (local66 > local68) {
											local684.method333(local66, local66 - 1);
											local66--;
										} else if (local66 < local68) {
											local684.method333(local66, local66 + 1);
											local66++;
										}
									}
								} else {
									local684.method333(this.anInt914, this.anInt929);
								}
								this.aClass1_Sub1_Sub4_8.method283(208);
								this.aClass1_Sub1_Sub4_8.method285(this.anInt929);
								this.aClass1_Sub1_Sub4_8.method285(this.anInt913);
								this.aClass1_Sub1_Sub4_8.method310((byte) 6, local686);
								this.aClass1_Sub1_Sub4_8.method317(this.aByte35, this.anInt914);
							}
						} else if ((this.anInt1050 == 1 || this.method716(this.anInt885 - 1)) && this.anInt885 > 2) {
							this.method717();
						} else if (this.anInt885 > 0) {
							this.method692(this.anInt885 - 1, 688);
						}
						this.anInt984 = 10;
						super.anInt819 = 0;
					}
				}
				@Pc(859) int local859;
				@Pc(861) int local861;
				if (Class18.anInt399 != -1) {
					local859 = Class18.anInt399;
					local861 = Class18.anInt400;
					@Pc(882) boolean local882 = this.method667(0, 0, 0, 0, 0, 0, true, local859, local861, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0]);
					Class18.anInt399 = -1;
					if (local882) {
						this.anInt906 = super.anInt820;
						this.anInt907 = super.anInt821;
						this.anInt909 = 1;
						this.anInt908 = 0;
					}
				}
				if (super.anInt819 == 1 && this.aString21 != null) {
					this.aString21 = null;
					this.aBoolean199 = true;
					super.anInt819 = 0;
				}
				this.method695();
				if (arg0 <= 0) {
					this.anInt934 = this.aClass32_2.method431();
				}
				if (this.anInt1010 == -1) {
					this.method684();
					this.method663();
					this.method631(this.anInt941);
				}
				if (super.anInt813 == 1 || super.anInt819 == 1) {
					this.anInt899++;
				}
				if (this.anInt829 == 0 && this.anInt912 == 0 && this.anInt862 == 0) {
					if (this.anInt981 > 0) {
						this.anInt981--;
					}
				} else if (this.anInt981 < 100) {
					this.anInt981++;
					if (this.anInt981 == 100) {
						if (this.anInt829 != 0) {
							this.aBoolean199 = true;
						}
						if (this.anInt912 != 0) {
							this.aBoolean194 = true;
						}
					}
				}
				if (this.anInt922 == 2) {
					this.method627();
				}
				if (this.anInt922 == 2 && this.aBoolean186) {
					this.method587();
				}
				for (local859 = 0; local859 < 5; local859++) {
					@Pc(1026) int local1026 = this.anIntArray261[local859]++;
				}
				this.method606();
				super.anInt812++;
				if (super.anInt812 > 4500) {
					this.anInt1034 = 250;
					super.anInt812 -= 500;
					this.aClass1_Sub1_Sub4_8.method283(10);
				}
				this.anInt960++;
				if (this.anInt960 > 500) {
					this.anInt960 = 0;
					local861 = (int) (Math.random() * 8.0D);
					if ((local861 & 0x1) == 1) {
						this.anInt832 += this.anInt833;
					}
					if ((local861 & 0x2) == 2) {
						this.anInt990 += this.anInt991;
					}
					if ((local861 & 0x4) == 4) {
						this.anInt876 += this.anInt877;
					}
				}
				if (this.anInt832 < -50) {
					this.anInt833 = 2;
				}
				if (this.anInt832 > 50) {
					this.anInt833 = -2;
				}
				if (this.anInt990 < -55) {
					this.anInt991 = 2;
				}
				if (this.anInt990 > 55) {
					this.anInt991 = -2;
				}
				if (this.anInt876 < -40) {
					this.anInt877 = 1;
				}
				if (this.anInt876 > 40) {
					this.anInt877 = -1;
				}
				this.anInt904++;
				if (this.anInt904 > 500) {
					this.anInt904 = 0;
					local861 = (int) (Math.random() * 8.0D);
					if ((local861 & 0x1) == 1) {
						this.anInt887 += this.anInt888;
					}
					if ((local861 & 0x2) == 2) {
						this.anInt967 += this.anInt968;
					}
				}
				if (this.anInt887 < -60) {
					this.anInt888 = 2;
				}
				if (this.anInt887 > 60) {
					this.anInt888 = -2;
				}
				if (this.anInt967 < -20) {
					this.anInt968 = 1;
				}
				if (this.anInt967 > 10) {
					this.anInt968 = -1;
				}
				anInt961++;
				if (anInt961 > 161) {
					anInt961 = 0;
					this.aClass1_Sub1_Sub4_8.method283(168);
					this.aClass1_Sub1_Sub4_8.method287(15793049);
				}
				this.anInt1033++;
				if (this.anInt1033 > 50) {
					this.aClass1_Sub1_Sub4_8.method283(204);
				}
				try {
					if (this.aClass43_1 != null && this.aClass1_Sub1_Sub4_8.anInt529 > 0) {
						this.aClass43_1.method549(this.aClass1_Sub1_Sub4_8.anInt529, this.aClass1_Sub1_Sub4_8.aByteArray14);
						this.aClass1_Sub1_Sub4_8.anInt529 = 0;
						this.anInt1033 = 0;
					}
				} catch (@Pc(1286) IOException local1286) {
					this.method700();
				} catch (@Pc(1291) Exception local1291) {
					this.method647();
				}
			}
		} catch (@Pc(1296) RuntimeException local1296) {
			signlink.reporterror("65806, " + arg0 + ", " + local1296.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIZZIIII)Z")
	private boolean method667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray25[local7][local11] = 0;
					this.anIntArrayArray23[local7][local11] = 99999999;
				}
			}
			local11 = arg10;
			@Pc(39) int local39 = arg9;
			this.anIntArrayArray25[arg10][arg9] = 99;
			this.anIntArrayArray23[arg10][arg9] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray252[0] = arg10;
			@Pc(71) int local71 = local55 + 1;
			this.anIntArray253[0] = arg9;
			@Pc(75) boolean local75 = false;
			@Pc(79) int local79 = this.anIntArray252.length;
			@Pc(86) int[][] local86 = this.aClass22Array1[this.anInt995].anIntArrayArray6;
			@Pc(197) int local197;
			while (local57 != local71) {
				local11 = this.anIntArray252[local57];
				local39 = this.anIntArray253[local57];
				local57 = (local57 + 1) % local79;
				if (local11 == arg7 && local39 == arg8) {
					local75 = true;
					break;
				}
				if (arg3 != 0) {
					if ((arg3 < 5 || arg3 == 10) && this.aClass22Array1[this.anInt995].method267(arg8, local39, arg3 - 1, arg7, local11, (byte) 9, arg4)) {
						local75 = true;
						break;
					}
					if (arg3 < 10 && this.aClass22Array1[this.anInt995].method268(arg7, local39, local11, arg4, 372, arg3 - 1, arg8)) {
						local75 = true;
						break;
					}
				}
				if (arg2 != 0 && arg0 != 0 && this.aClass22Array1[this.anInt995].method269(arg7, arg2, arg0, local39, arg8, arg1, local11)) {
					local75 = true;
					break;
				}
				local197 = this.anIntArrayArray23[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray25[local11 - 1][local39] == 0 && (local86[local11 - 1][local39] & 0x1280108) == 0) {
					this.anIntArray252[local71] = local11 - 1;
					this.anIntArray253[local71] = local39;
					local71 = (local71 + 1) % local79;
					this.anIntArrayArray25[local11 - 1][local39] = 2;
					this.anIntArrayArray23[local11 - 1][local39] = local197;
				}
				if (local11 < 103 && this.anIntArrayArray25[local11 + 1][local39] == 0 && (local86[local11 + 1][local39] & 0x1280180) == 0) {
					this.anIntArray252[local71] = local11 + 1;
					this.anIntArray253[local71] = local39;
					local71 = (local71 + 1) % local79;
					this.anIntArrayArray25[local11 + 1][local39] = 8;
					this.anIntArrayArray23[local11 + 1][local39] = local197;
				}
				if (local39 > 0 && this.anIntArrayArray25[local11][local39 - 1] == 0 && (local86[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray252[local71] = local11;
					this.anIntArray253[local71] = local39 - 1;
					local71 = (local71 + 1) % local79;
					this.anIntArrayArray25[local11][local39 - 1] = 1;
					this.anIntArrayArray23[local11][local39 - 1] = local197;
				}
				if (local39 < 103 && this.anIntArrayArray25[local11][local39 + 1] == 0 && (local86[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray252[local71] = local11;
					this.anIntArray253[local71] = local39 + 1;
					local71 = (local71 + 1) % local79;
					this.anIntArrayArray25[local11][local39 + 1] = 4;
					this.anIntArrayArray23[local11][local39 + 1] = local197;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray25[local11 - 1][local39 - 1] == 0 && (local86[local11 - 1][local39 - 1] & 0x128010E) == 0 && (local86[local11 - 1][local39] & 0x1280108) == 0 && (local86[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray252[local71] = local11 - 1;
					this.anIntArray253[local71] = local39 - 1;
					local71 = (local71 + 1) % local79;
					this.anIntArrayArray25[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray23[local11 - 1][local39 - 1] = local197;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray25[local11 + 1][local39 - 1] == 0 && (local86[local11 + 1][local39 - 1] & 0x1280183) == 0 && (local86[local11 + 1][local39] & 0x1280180) == 0 && (local86[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray252[local71] = local11 + 1;
					this.anIntArray253[local71] = local39 - 1;
					local71 = (local71 + 1) % local79;
					this.anIntArrayArray25[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray23[local11 + 1][local39 - 1] = local197;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray25[local11 - 1][local39 + 1] == 0 && (local86[local11 - 1][local39 + 1] & 0x1280138) == 0 && (local86[local11 - 1][local39] & 0x1280108) == 0 && (local86[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray252[local71] = local11 - 1;
					this.anIntArray253[local71] = local39 + 1;
					local71 = (local71 + 1) % local79;
					this.anIntArrayArray25[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray23[local11 - 1][local39 + 1] = local197;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray25[local11 + 1][local39 + 1] == 0 && (local86[local11 + 1][local39 + 1] & 0x12801E0) == 0 && (local86[local11 + 1][local39] & 0x1280180) == 0 && (local86[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray252[local71] = local11 + 1;
					this.anIntArray253[local71] = local39 + 1;
					local71 = (local71 + 1) % local79;
					this.anIntArrayArray25[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray23[local11 + 1][local39 + 1] = local197;
				}
			}
			this.anInt846 = 0;
			@Pc(813) int local813;
			@Pc(819) int local819;
			@Pc(825) int local825;
			if (!local75) {
				if (!arg6) {
					return false;
				}
				local197 = 1000;
				local813 = 100;
				for (local819 = arg7 - 10; local819 <= arg7 + 10; local819++) {
					for (local825 = arg8 - 10; local825 <= arg8 + 10; local825++) {
						if (local819 >= 0 && local825 >= 0 && local819 < 104 && local825 < 104 && this.anIntArrayArray23[local819][local825] < 100) {
							@Pc(847) int local847 = 0;
							if (local819 < arg7) {
								local847 = arg7 - local819;
							} else if (local819 > arg7 + arg2 - 1) {
								local847 = local819 + 1 - arg7 - arg2;
							}
							@Pc(873) int local873 = 0;
							if (local825 < arg8) {
								local873 = arg8 - local825;
							} else if (local825 > arg8 + arg0 - 1) {
								local873 = local825 + 1 - arg8 - arg0;
							}
							@Pc(905) int local905 = local847 * local847 + local873 * local873;
							if (local905 < local197 || local905 == local197 && this.anIntArrayArray23[local819][local825] < local813) {
								local197 = local905;
								local813 = this.anIntArrayArray23[local819][local825];
								local11 = local819;
								local39 = local825;
							}
						}
					}
				}
				if (local197 == 1000) {
					return false;
				}
				if (local11 == arg10 && local39 == arg9) {
					return false;
				}
				this.anInt846 = 1;
			}
			@Pc(966) byte local966 = 0;
			this.anIntArray252[0] = local11;
			local57 = local966 + 1;
			this.anIntArray253[0] = local39;
			local197 = local813 = this.anIntArrayArray25[local11][local39];
			while (local11 != arg10 || local39 != arg9) {
				if (local197 != local813) {
					local813 = local197;
					this.anIntArray252[local57] = local11;
					this.anIntArray253[local57++] = local39;
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
				local197 = this.anIntArrayArray25[local11][local39];
			}
			if (local57 > 0) {
				local79 = local57;
				if (local57 > 25) {
					local79 = 25;
				}
				local57--;
				@Pc(1056) int local1056 = this.anIntArray252[local57];
				local819 = this.anIntArray253[local57];
				anInt996++;
				if (anInt996 >= 96) {
					this.aClass1_Sub1_Sub4_8.method283(128);
					this.aClass1_Sub1_Sub4_8.method287(7618330);
					anInt996 = 0;
				}
				if (arg5 == 0) {
					this.aClass1_Sub1_Sub4_8.method283(1);
					this.aClass1_Sub1_Sub4_8.method284(local79 + local79 + 3);
				}
				if (arg5 == 1) {
					this.aClass1_Sub1_Sub4_8.method283(19);
					this.aClass1_Sub1_Sub4_8.method284(local79 + local79 + 3 + 14);
				}
				if (arg5 == 2) {
					this.aClass1_Sub1_Sub4_8.method283(18);
					this.aClass1_Sub1_Sub4_8.method284(local79 + local79 + 3);
				}
				this.aClass1_Sub1_Sub4_8.method311(164, super.anIntArray210[5] == 1 ? 1 : 0);
				this.aClass1_Sub1_Sub4_8.method317(this.aByte35, local819 + this.anInt895);
				this.anInt953 = this.anIntArray252[0];
				this.anInt954 = this.anIntArray253[0];
				for (local825 = 1; local825 < local79; local825++) {
					local57--;
					this.aClass1_Sub1_Sub4_8.method311(164, this.anIntArray252[local57] - local1056);
					this.aClass1_Sub1_Sub4_8.method310((byte) 6, this.anIntArray253[local57] - local819);
				}
				this.aClass1_Sub1_Sub4_8.method317(this.aByte35, local1056 + this.anInt894);
				return true;
			} else if (arg5 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1210) RuntimeException local1210) {
			signlink.reporterror("79313, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + true + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1210.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method668() {
		try {
			if (this.anInt922 == 2) {
				for (@Pc(15) Class1_Sub3 local15 = (Class1_Sub3) this.aClass16_10.method185(); local15 != null; local15 = (Class1_Sub3) this.aClass16_10.method187()) {
					if (local15.anInt794 > 0) {
						local15.anInt794--;
					}
					if (local15.anInt794 != 0) {
						if (local15.anInt793 > 0) {
							local15.anInt793--;
						}
						if (local15.anInt793 == 0 && local15.anInt797 >= 1 && local15.anInt798 >= 1 && local15.anInt797 <= 102 && local15.anInt798 <= 102 && (local15.anInt790 < 0 || Class39.method487(local15.anInt792, (byte) 9, local15.anInt790))) {
							this.method671(local15.anInt792, local15.anInt790, local15.anInt797, local15.anInt796, local15.anInt795, local15.anInt798, local15.anInt791);
							local15.anInt793 = -1;
							if (local15.anInt790 == local15.anInt787 && local15.anInt787 == -1) {
								local15.method560();
							} else if (local15.anInt790 == local15.anInt787 && local15.anInt791 == local15.anInt788 && local15.anInt792 == local15.anInt789) {
								local15.method560();
							}
						}
					} else if (local15.anInt787 < 0 || Class39.method487(local15.anInt789, (byte) 9, local15.anInt787)) {
						this.method671(local15.anInt789, local15.anInt787, local15.anInt797, local15.anInt796, local15.anInt795, local15.anInt798, local15.anInt788);
						local15.method560();
					}
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("71712, " + true + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method669(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString25 = "";
				this.aString26 = "Connecting to server...";
				this.method679(true);
			}
			this.aClass43_1 = new Class43(this, (byte) 0, this.method709(anInt956 + 43594));
			@Pc(30) long local30 = Class41.method504(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass1_Sub1_Sub4_8.anInt529 = 0;
			this.aClass1_Sub1_Sub4_8.method284(14);
			this.aClass1_Sub1_Sub4_8.method284(local37);
			this.aClass43_1.method549(2, this.aClass1_Sub1_Sub4_8.aByteArray14);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass43_1.method546();
			}
			@Pc(74) int local74 = this.aClass43_1.method546();
			@Pc(76) int local76 = local74;
			@Pc(225) int local225;
			@Pc(259) int local259;
			if (local74 == 0) {
				this.aClass43_1.method548(this.aClass1_Sub1_Sub4_6.aByteArray14, 0, 8);
				this.aClass1_Sub1_Sub4_6.anInt529 = 0;
				this.aLong33 = this.aClass1_Sub1_Sub4_6.method300();
				@Pc(99) int[] local99 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong33 >> 32), (int) this.aLong33 };
				this.aClass1_Sub1_Sub4_8.anInt529 = 0;
				this.aClass1_Sub1_Sub4_8.method284(10);
				this.aClass1_Sub1_Sub4_8.method288(local99[0]);
				this.aClass1_Sub1_Sub4_8.method288(local99[1]);
				this.aClass1_Sub1_Sub4_8.method288(local99[2]);
				this.aClass1_Sub1_Sub4_8.method288(local99[3]);
				this.aClass1_Sub1_Sub4_8.method288(signlink.anInt1057);
				this.aClass1_Sub1_Sub4_8.method291(arg0);
				this.aClass1_Sub1_Sub4_8.method291(arg1);
				this.aClass1_Sub1_Sub4_8.method309(aBigInteger1, aBigInteger2);
				this.aClass1_Sub1_Sub4_7.anInt529 = 0;
				if (arg2) {
					this.aClass1_Sub1_Sub4_7.method284(18);
				} else {
					this.aClass1_Sub1_Sub4_7.method284(16);
				}
				this.aClass1_Sub1_Sub4_7.method284(this.aClass1_Sub1_Sub4_8.anInt529 + 36 + 1 + 1 + 2);
				this.aClass1_Sub1_Sub4_7.method284(255);
				this.aClass1_Sub1_Sub4_7.method285(365);
				this.aClass1_Sub1_Sub4_7.method284(aBoolean205 ? 1 : 0);
				for (local225 = 0; local225 < 9; local225++) {
					this.aClass1_Sub1_Sub4_7.method288(this.anIntArray225[local225]);
				}
				this.aClass1_Sub1_Sub4_7.method292(this.aClass1_Sub1_Sub4_8.aByteArray14, this.aClass1_Sub1_Sub4_8.anInt529);
				this.aClass1_Sub1_Sub4_8.aClass32_1 = new Class32(local99, true);
				for (local259 = 0; local259 < 4; local259++) {
					local99[local259] += 50;
				}
				this.aClass32_2 = new Class32(local99, true);
				this.aClass43_1.method549(this.aClass1_Sub1_Sub4_7.anInt529, this.aClass1_Sub1_Sub4_7.aByteArray14);
				local74 = this.aClass43_1.method546();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(301) Exception local301) {
				}
				this.method669(arg0, arg1, arg2);
			} else {
				@Pc(389) int local389;
				if (local74 == 2) {
					this.anInt980 = this.aClass43_1.method546();
					aBoolean211 = this.aClass43_1.method546() == 1;
					this.aLong30 = 0L;
					this.anInt994 = 0;
					this.aClass48_1.anInt799 = 0;
					super.aBoolean179 = true;
					this.aBoolean184 = true;
					this.aBoolean188 = true;
					this.aClass1_Sub1_Sub4_8.anInt529 = 0;
					this.aClass1_Sub1_Sub4_6.anInt529 = 0;
					this.anInt1031 = -1;
					this.anInt942 = -1;
					this.anInt943 = -1;
					this.anInt944 = -1;
					this.anInt1030 = 0;
					this.anInt1032 = 0;
					this.anInt1015 = 0;
					this.anInt1034 = 0;
					this.anInt1023 = 0;
					this.anInt885 = 0;
					this.aBoolean200 = false;
					super.anInt812 = 0;
					for (local389 = 0; local389 < 100; local389++) {
						this.aStringArray14[local389] = null;
					}
					this.anInt868 = 0;
					this.anInt963 = 0;
					this.anInt922 = 0;
					this.anInt924 = 0;
					this.anInt832 = (int) (Math.random() * 100.0D) - 50;
					this.anInt990 = (int) (Math.random() * 110.0D) - 55;
					this.anInt876 = (int) (Math.random() * 80.0D) - 40;
					this.anInt887 = (int) (Math.random() * 120.0D) - 60;
					this.anInt967 = (int) (Math.random() * 30.0D) - 20;
					this.anInt976 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt864 = 0;
					this.anInt952 = -1;
					this.anInt953 = 0;
					this.anInt954 = 0;
					this.anInt836 = 0;
					this.anInt1045 = 0;
					for (local225 = 0; local225 < this.anInt834; local225++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local225] = null;
						this.aClass1_Sub1_Sub4Array1[local225] = null;
					}
					for (local259 = 0; local259 < 16384; local259++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local259] = null;
					}
					aClass1_Sub1_Sub1_Sub1_Sub2_1 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anInt835] = new Class1_Sub1_Sub1_Sub1_Sub2();
					this.aClass16_12.method189();
					this.aClass16_11.method189();
					@Pc(534) int local534;
					@Pc(538) int local538;
					for (@Pc(530) int local530 = 0; local530 < 4; local530++) {
						for (local534 = 0; local534 < 104; local534++) {
							for (local538 = 0; local538 < 104; local538++) {
								this.aClass16ArrayArrayArray1[local530][local534][local538] = null;
							}
						}
					}
					this.aClass16_10 = new Class16(aBoolean218);
					this.anInt828 = 0;
					this.anInt827 = 0;
					this.method649(this.anInt1040);
					this.anInt1040 = -1;
					this.method649(this.anInt1054);
					this.anInt1054 = -1;
					this.method649(this.anInt935);
					this.anInt935 = -1;
					this.method649(this.anInt1010);
					this.anInt1010 = -1;
					this.method649(this.anInt979);
					this.anInt979 = -1;
					this.method649(this.anInt826);
					this.anInt826 = -1;
					this.method649(this.anInt867);
					this.anInt867 = -1;
					this.aBoolean189 = false;
					this.anInt959 = 3;
					this.anInt1022 = 0;
					this.aBoolean200 = false;
					this.aBoolean195 = false;
					this.aString21 = null;
					this.anInt925 = 0;
					this.anInt999 = -1;
					this.aBoolean208 = true;
					this.method637();
					for (local534 = 0; local534 < 5; local534++) {
						this.anIntArray231[local534] = 0;
					}
					for (local538 = 0; local538 < 5; local538++) {
						this.aStringArray9[local538] = null;
						this.aBooleanArray11[local538] = false;
					}
					anInt970 = 0;
					anInt881 = 0;
					anInt866 = 0;
					anInt1006 = 0;
					anInt996 = 0;
					this.method590();
				} else if (local74 == 3) {
					this.aString25 = "";
					this.aString26 = "Invalid username or password.";
				} else if (local74 == 4) {
					this.aString25 = "Your account has been disabled.";
					this.aString26 = "Please check your message-centre for details.";
				} else if (local74 == 5) {
					this.aString25 = "Your account is already logged in.";
					this.aString26 = "Try again in 60 secs...";
				} else if (local74 == 6) {
					this.aString25 = "RuneScape has been updated!";
					this.aString26 = "Please reload this page.";
				} else if (local74 == 7) {
					this.aString25 = "This world is full.";
					this.aString26 = "Please use a different world.";
				} else if (local74 == 8) {
					this.aString25 = "Unable to connect.";
					this.aString26 = "Login server offline.";
				} else if (local74 == 9) {
					this.aString25 = "Login limit exceeded.";
					this.aString26 = "Too many connections from your address.";
				} else if (local74 == 10) {
					this.aString25 = "Unable to connect.";
					this.aString26 = "Bad session id.";
				} else if (local74 == 12) {
					this.aString25 = "You need a members account to login to this world.";
					this.aString26 = "Please subscribe, or use a different world.";
				} else if (local74 == 13) {
					this.aString25 = "Could not complete login.";
					this.aString26 = "Please try using a different world.";
				} else if (local74 == 14) {
					this.aString25 = "The server is being updated.";
					this.aString26 = "Please wait 1 minute and try again.";
				} else if (local74 == 15) {
					this.aBoolean188 = true;
					this.aClass1_Sub1_Sub4_8.anInt529 = 0;
					this.aClass1_Sub1_Sub4_6.anInt529 = 0;
					this.anInt1031 = -1;
					this.anInt942 = -1;
					this.anInt943 = -1;
					this.anInt944 = -1;
					this.anInt1030 = 0;
					this.anInt1032 = 0;
					this.anInt1015 = 0;
					this.anInt885 = 0;
					this.aBoolean200 = false;
					this.aLong31 = System.currentTimeMillis();
				} else if (local74 == 16) {
					this.aString25 = "Login attempts exceeded.";
					this.aString26 = "Please wait 1 minute and try again.";
				} else if (local74 == 17) {
					this.aString25 = "You are standing in a members-only area.";
					this.aString26 = "To play on this world move to a free area first";
				} else if (local74 == 20) {
					this.aString25 = "Invalid loginserver requested";
					this.aString26 = "Please try using a different world.";
				} else if (local74 == 21) {
					local389 = this.aClass43_1.method546();
					for (@Pc(907) int local907 = local389 + 3; local907 >= 0; local907--) {
						this.aString25 = "You have only just left another world";
						this.aString26 = "Your profile will be transferred in: " + local907;
						this.method679(true);
						try {
							Thread.sleep(1200L);
						} catch (@Pc(929) Exception local929) {
						}
					}
					this.method669(arg0, arg1, arg2);
				} else if (local74 == 22) {
					this.aString25 = "Malformed login packet.";
					this.aString26 = "Please try again.";
				} else if (local74 == 23) {
					this.aString25 = "No reply from loginserver.";
					this.aString26 = "Please try again.";
				} else if (local74 == 24) {
					this.aString25 = "Error loading your profile.";
					this.aString26 = "Please contact customer support.";
				} else if (local74 == 25) {
					this.aString25 = "Unexpected loginserver response.";
					this.aString26 = "Please try using a different world.";
				} else if (local74 == 26) {
					this.aString25 = "This computers address has been blocked";
					this.aString26 = "as it was used to break our rules";
				} else if (local74 != -1) {
					System.out.println("response:" + local74);
					this.aString25 = "Unexpected server response";
					this.aString26 = "Please try using a different world.";
				} else if (local76 != 0) {
					this.aString25 = "No response from server";
					this.aString26 = "Please try using a different world.";
				} else if (this.anInt1044 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(1001) Exception local1001) {
					}
					this.anInt1044++;
					this.method669(arg0, arg1, arg2);
				} else {
					this.aString25 = "No response from loginserver";
					this.aString26 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(1044) IOException local1044) {
			this.aString25 = "";
			this.aString26 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt955 = Integer.parseInt(this.getParameter("nodeid"));
		anInt956 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method697();
		} else {
			method678();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean204 = false;
		} else {
			aBoolean204 = true;
		}
		this.method575();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method670(@OriginalArg(0) int arg0) {
		try {
			signlink.anInt1065 = arg0;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("26166, " + arg0 + ", " + false + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	private void method671(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg2 >= 1 && arg5 >= 1 && arg2 <= 102 && arg5 <= 102) {
				if (aBoolean205 && arg4 != this.anInt995) {
					return;
				}
				@Pc(24) int local24 = 0;
				if (arg3 == 0) {
					local24 = this.aClass18_1.method217(arg4, arg2, arg5);
				}
				if (arg3 == 1) {
					local24 = this.aClass18_1.method218(arg2, arg5, arg4);
				}
				if (arg3 == 2) {
					local24 = this.aClass18_1.method219(arg4, arg2, arg5);
				}
				if (arg3 == 3) {
					local24 = this.aClass18_1.method220(arg4, arg2, arg5);
				}
				@Pc(80) int local80;
				if (local24 != 0) {
					local80 = this.aClass18_1.method221(arg4, arg2, arg5, local24);
					@Pc(86) int local86 = local24 >> 14 & 0x7FFF;
					@Pc(90) int local90 = local80 & 0x1F;
					@Pc(94) int local94 = local80 >> 6;
					@Pc(106) Class5 local106;
					if (arg3 == 0) {
						this.aClass18_1.method208(arg5, arg4, arg2);
						local106 = Class5.method130(local86);
						if (local106.aBoolean45) {
							this.aClass22Array1[arg4].method263(local106.aBoolean39, arg2, (byte) 2, local90, arg5, local94);
						}
					}
					if (arg3 == 1) {
						this.aClass18_1.method209(this.anInt839, arg5, arg2, arg4);
					}
					if (arg3 == 2) {
						this.aClass18_1.method210(arg4, arg5, arg2);
						local106 = Class5.method130(local86);
						if (arg2 + local106.anInt261 > 103 || arg5 + local106.anInt261 > 103 || arg2 + local106.anInt280 > 103 || arg5 + local106.anInt280 > 103) {
							return;
						}
						if (local106.aBoolean45) {
							this.aClass22Array1[arg4].method264(local94, arg5, local106.anInt261, arg2, local106.anInt280, local106.aBoolean39);
						}
					}
					if (arg3 == 3) {
						this.aClass18_1.method211(arg4, arg2, arg5);
						local106 = Class5.method130(local86);
						if (local106.aBoolean45 && local106.aBoolean48) {
							this.aClass22Array1[arg4].method266(arg5, arg2);
						}
					}
				}
				if (arg1 >= 0) {
					local80 = arg4;
					if (arg4 < 3 && (this.aByteArrayArrayArray8[1][arg2][arg5] & 0x2) == 2) {
						local80 = arg4 + 1;
					}
					Class39.method476(arg0, arg4, arg6, this.anIntArrayArrayArray8, arg2, arg5, this.aClass22Array1[arg4], local80, this.aClass18_1, arg1);
					return;
				}
			}
		} catch (@Pc(254) RuntimeException local254) {
			signlink.reporterror("83153, " + arg0 + ", " + 40790 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local254.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BZZ)V")
	private void method672(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1) {
		try {
			if (this.aBoolean210) {
				signlink.anInt1063 = arg1 ? 1 : 0;
				signlink.midisave(arg0, arg0.length);
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("36229, " + arg0 + ", " + false + ", " + arg1 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method673() {
		try {
			this.aBoolean206 = false;
			while (this.aBoolean180) {
				this.aBoolean206 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(13) Exception local13) {
				}
			}
			this.aClass1_Sub1_Sub2_Sub2_14 = null;
			this.aClass1_Sub1_Sub2_Sub2_15 = null;
			this.aClass1_Sub1_Sub2_Sub2Array5 = null;
			this.anIntArray267 = null;
			this.anIntArray268 = null;
			this.anIntArray269 = null;
			this.anIntArray270 = null;
			this.anIntArray262 = null;
			this.anIntArray263 = null;
			this.anIntArray223 = null;
			this.anIntArray224 = null;
			this.aClass1_Sub1_Sub2_Sub3_3 = null;
			this.aClass1_Sub1_Sub2_Sub3_4 = null;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("19646, " + -788 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	private void method674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(5) Class1_Sub3 local5 = null;
			for (@Pc(10) Class1_Sub3 local10 = (Class1_Sub3) this.aClass16_10.method185(); local10 != null; local10 = (Class1_Sub3) this.aClass16_10.method187()) {
				if (local10.anInt795 == arg6 && local10.anInt797 == arg7 && local10.anInt798 == arg1 && local10.anInt796 == arg3) {
					local5 = local10;
					break;
				}
			}
			if (local5 == null) {
				local5 = new Class1_Sub3();
				local5.anInt795 = arg6;
				local5.anInt796 = arg3;
				local5.anInt797 = arg7;
				local5.anInt798 = arg1;
				this.method621(local5);
				this.aClass16_10.method182(local5);
			}
			local5.anInt790 = arg0;
			local5.anInt792 = arg4;
			local5.anInt791 = arg8;
			local5.anInt793 = arg2;
			local5.anInt794 = arg5;
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("47502, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -33233 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!IBHUFTPE;I)V")
	private void method675(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub2_Sub3 arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg2 * arg2 + arg0 * arg0;
			if (local7 > 4225 && local7 < 90000) {
				@Pc(25) int local25 = this.anInt976 + this.anInt887 & 0x7FF;
				@Pc(29) int local29 = Class1_Sub1_Sub1_Sub4.anIntArray155[local25];
				@Pc(33) int local33 = Class1_Sub1_Sub1_Sub4.anIntArray156[local25];
				@Pc(42) int local42 = local29 * 256 / (this.anInt967 + 256);
				@Pc(51) int local51 = local33 * 256 / (this.anInt967 + 256);
				@Pc(61) int local61 = arg0 * local42 + arg2 * local51 >> 16;
				@Pc(71) int local71 = arg0 * local51 - arg2 * local42 >> 16;
				@Pc(77) double local77 = Math.atan2((double) local61, (double) local71);
				@Pc(83) int local83 = (int) (Math.sin(local77) * 63.0D);
				@Pc(89) int local89 = (int) (Math.cos(local77) * 57.0D);
				this.aClass1_Sub1_Sub2_Sub3_5.method177(83 - local89 - 20, local77, (byte) 6, local83 + 94 + 4 - 10);
			} else {
				this.method662(arg1, arg0, arg2);
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("87801, " + 31951 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)Z")
	private boolean method676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(7) int local7 = arg0 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass18_1.method221(this.anInt995, arg1, arg2, arg0);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(43) Class5 local43 = Class5.method130(local7);
				@Pc(51) int local51;
				@Pc(54) int local54;
				if (local31 == 0 || local31 == 2) {
					local51 = local43.anInt261;
					local54 = local43.anInt280;
				} else {
					local51 = local43.anInt280;
					local54 = local43.anInt261;
				}
				@Pc(65) int local65 = local43.anInt281;
				if (local31 != 0) {
					local65 = (local65 << local31 & 0xF) + (local65 >> 4 - local31);
				}
				this.method667(local54, local65, local51, 0, 0, 2, true, arg1, arg2, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0]);
			} else {
				this.method667(0, 0, 0, local25 + 1, local31, 2, true, arg1, arg2, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0]);
			}
			anInt920++;
			if (anInt920 > 1332) {
				anInt920 = 0;
				this.aClass1_Sub1_Sub4_8.method283(183);
				this.aClass1_Sub1_Sub4_8.method284(0);
				@Pc(147) int local147 = this.aClass1_Sub1_Sub4_8.anInt529;
				this.aClass1_Sub1_Sub4_8.method284(123);
				this.aClass1_Sub1_Sub4_8.method284(96);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub4_8.method285(63133);
				}
				this.aClass1_Sub1_Sub4_8.method285(30708);
				this.aClass1_Sub1_Sub4_8.method284(24);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub4_8.method284(188);
				}
				this.aClass1_Sub1_Sub4_8.method284((int) (Math.random() * 256.0D));
				this.aClass1_Sub1_Sub4_8.method284((int) (Math.random() * 256.0D));
				this.aClass1_Sub1_Sub4_8.method284((int) (Math.random() * 256.0D));
				this.aClass1_Sub1_Sub4_8.method284(14);
				this.aClass1_Sub1_Sub4_8.method293(this.aClass1_Sub1_Sub4_8.anInt529 - local147);
			}
			this.anInt906 = super.anInt820;
			this.anInt907 = super.anInt821;
			this.anInt909 = 2;
			this.anInt908 = 0;
			return true;
		} catch (@Pc(240) RuntimeException local240) {
			signlink.reporterror("10473, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 5 + ", " + local240.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method677() {
		try {
			@Pc(4) Graphics local4 = this.method584().getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			this.method577();
			@Pc(42) byte local42;
			@Pc(48) int local48;
			if (this.aBoolean196) {
				this.aBoolean206 = false;
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
			if (this.aBoolean207) {
				this.aBoolean206 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean224) {
				this.aBoolean206 = false;
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
			signlink.reporterror("71428, " + 85 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
	private void method679(@OriginalArg(1) boolean arg0) {
		try {
			this.method614();
			this.aClass8_14.method133();
			this.aClass1_Sub1_Sub2_Sub2_14.method103(0, 0);
			@Pc(50) byte local50;
			@Pc(62) int local62;
			if (this.anInt838 == 0) {
				this.aClass1_Sub1_Sub2_Sub1_2.method70(this.aClass28_Sub1_1.aString16, true, 180, 7711145, 180);
				local50 = 80;
				this.aClass1_Sub1_Sub2_Sub1_4.method70("Welcome to RuneScape", true, 80, 16776960, 180);
				local62 = local50 + 30;
				this.aClass1_Sub1_Sub2_Sub2_15.method103(27, 100);
				this.aClass1_Sub1_Sub2_Sub1_4.method70("New User", true, 125, 16777215, 100);
				this.aClass1_Sub1_Sub2_Sub2_15.method103(187, 100);
				this.aClass1_Sub1_Sub2_Sub1_4.method70("Existing User", true, 125, 16777215, 260);
			}
			if (this.anInt838 == 2) {
				local50 = 60;
				if (this.aString25.length() > 0) {
					this.aClass1_Sub1_Sub2_Sub1_4.method70(this.aString25, true, 45, 16776960, 180);
					this.aClass1_Sub1_Sub2_Sub1_4.method70(this.aString26, true, 60, 16776960, 180);
					local62 = local50 + 30;
				} else {
					this.aClass1_Sub1_Sub2_Sub1_4.method70(this.aString26, true, 53, 16776960, 180);
					local62 = local50 + 30;
				}
				this.aClass1_Sub1_Sub2_Sub1_4.method77(90, 90, true, "Username: " + this.aString27 + (this.anInt919 == 0 & anInt1007 % 40 < 20 ? "@yel@|" : ""), 16777215);
				local62 += 15;
				this.aClass1_Sub1_Sub2_Sub1_4.method77(92, 105, true, "Password: " + Class41.method509(this.aString28) + (this.anInt919 == 1 & anInt1007 % 40 < 20 ? "@yel@|" : ""), 16777215);
				local62 += 15;
				if (!arg0) {
					this.aClass1_Sub1_Sub2_Sub2_15.method103(27, 130);
					this.aClass1_Sub1_Sub2_Sub1_4.method70("Login", true, 155, 16777215, 100);
					this.aClass1_Sub1_Sub2_Sub2_15.method103(187, 130);
					this.aClass1_Sub1_Sub2_Sub1_4.method70("Cancel", true, 155, 16777215, 260);
				}
			}
			if (this.anInt838 == 3) {
				this.aClass1_Sub1_Sub2_Sub1_4.method70("Create a free account", true, 40, 16776960, 180);
				local50 = 65;
				this.aClass1_Sub1_Sub2_Sub1_4.method70("To create a new account you need to", true, 65, 16777215, 180);
				local62 = local50 + 15;
				this.aClass1_Sub1_Sub2_Sub1_4.method70("go back to the main RuneScape webpage", true, 80, 16777215, 180);
				local62 += 15;
				this.aClass1_Sub1_Sub2_Sub1_4.method70("and choose the 'create account'", true, 95, 16777215, 180);
				local62 += 15;
				this.aClass1_Sub1_Sub2_Sub1_4.method70("button near the top of that page.", true, 110, 16777215, 180);
				local62 += 15;
				this.aClass1_Sub1_Sub2_Sub2_15.method103(107, 130);
				this.aClass1_Sub1_Sub2_Sub1_4.method70("Cancel", true, 155, 16777215, 180);
			}
			this.aClass8_14.method134(super.aGraphics2, 171, 202);
			if (this.aBoolean197) {
				this.aBoolean197 = false;
				this.aClass8_12.method134(super.aGraphics2, 0, 128);
				this.aClass8_13.method134(super.aGraphics2, 371, 202);
				this.aClass8_17.method134(super.aGraphics2, 265, 0);
				this.aClass8_18.method134(super.aGraphics2, 265, 562);
				this.aClass8_19.method134(super.aGraphics2, 171, 128);
				this.aClass8_20.method134(super.aGraphics2, 171, 562);
			}
		} catch (@Pc(495) RuntimeException local495) {
			signlink.reporterror("62360, " + -941 + ", " + arg0 + ", " + local495.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZB)V")
	private void method680(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(6) boolean local6 = false;
			for (@Pc(12) int local12 = 0; local12 < this.anInt1045; local12++) {
				@Pc(22) Class1_Sub1_Sub1_Sub1_Sub1 local22 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray274[local12]];
				@Pc(31) int local31 = (this.anIntArray274[local12] << 14) + 536870912;
				if (local22 != null && local22.method112((byte) 9) && local22.aClass21_1.aBoolean87 == arg0 && local22.aClass21_1.method253()) {
					@Pc(52) int local52 = local22.anInt231 >> 7;
					@Pc(57) int local57 = local22.anInt232 >> 7;
					if (local52 >= 0 && local52 < 104 && local57 >= 0 && local57 < 104) {
						if (local22.anInt216 == 1 && (local22.anInt231 & 0x7F) == 64 && (local22.anInt232 & 0x7F) == 64) {
							if (this.anIntArrayArray22[local52][local57] == this.anInt840) {
								continue;
							}
							this.anIntArrayArray22[local52][local57] = this.anInt840;
						}
						if (!local22.aClass21_1.aBoolean86) {
							local31 += Integer.MIN_VALUE;
						}
						this.aClass18_1.method202(this.anInt995, this.method607(local22.anInt232, local22.anInt231, this.anInt995), local22.anInt231, local22, local22.anInt232, (local22.anInt216 - 1) * 64 + 60, local22.anInt233, local22.aBoolean33, local31);
					}
				}
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("12741, " + arg0 + ", " + arg1 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method681() {
		try {
			@Pc(9) int local9;
			if (this.aByte26 != 90) {
				for (local9 = 1; local9 > 0; local9++) {
				}
			}
			@Pc(23) int local23;
			for (local9 = 10; local9 < 117; local9++) {
				local23 = (int) (Math.random() * 100.0D);
				if (local23 < 50) {
					this.anIntArray223[local9 + 32512] = 255;
				}
			}
			@Pc(52) int local52;
			@Pc(59) int local59;
			@Pc(65) int local65;
			for (local23 = 0; local23 < 100; local23++) {
				local52 = (int) (Math.random() * 124.0D) + 2;
				local59 = (int) (Math.random() * 128.0D) + 128;
				local65 = local52 + (local59 << 7);
				this.anIntArray223[local65] = 192;
			}
			for (local52 = 1; local52 < 255; local52++) {
				for (local59 = 1; local59 < 127; local59++) {
					local65 = local59 + (local52 << 7);
					this.anIntArray224[local65] = (this.anIntArray223[local65 - 1] + this.anIntArray223[local65 + 1] + this.anIntArray223[local65 - 128] + this.anIntArray223[local65 + 128]) / 4;
				}
			}
			this.anInt842 += 128;
			if (this.anInt842 > this.anIntArray262.length) {
				this.anInt842 -= this.anIntArray262.length;
				local59 = (int) (Math.random() * 12.0D);
				this.method687(this.aClass1_Sub1_Sub2_Sub2Array5[local59]);
			}
			@Pc(177) int local177;
			for (local59 = 1; local59 < 255; local59++) {
				for (local65 = 1; local65 < 127; local65++) {
					local177 = local65 + (local59 << 7);
					@Pc(200) int local200 = this.anIntArray224[local177 + 128] - this.anIntArray262[local177 + this.anInt842 & this.anIntArray262.length - 1] / 5;
					if (local200 < 0) {
						local200 = 0;
					}
					this.anIntArray223[local177] = local200;
				}
			}
			for (local65 = 0; local65 < 255; local65++) {
				this.anIntArray251[local65] = this.anIntArray251[local65 + 1];
			}
			this.anIntArray251[255] = (int) (Math.sin((double) anInt1007 / 14.0D) * 16.0D + Math.sin((double) anInt1007 / 15.0D) * 14.0D + Math.sin((double) anInt1007 / 16.0D) * 12.0D);
			if (this.anInt1008 > 0) {
				this.anInt1008 -= 4;
			}
			if (this.anInt1009 > 0) {
				this.anInt1009 -= 4;
			}
			if (this.anInt1008 == 0 && this.anInt1009 == 0) {
				local177 = (int) (Math.random() * 2000.0D);
				if (local177 == 0) {
					this.anInt1008 = 1024;
				}
				if (local177 == 1) {
					this.anInt1009 = 1024;
					return;
				}
			}
		} catch (@Pc(311) RuntimeException local311) {
			signlink.reporterror("22556, " + 90 + ", " + local311.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!MVHXDWGI;)V")
	private void method682(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub4 arg1) {
		try {
			this.anInt880 = 0;
			this.anInt837 = 0;
			this.method613(arg0, arg1, 75);
			this.method694(arg1, arg0);
			this.method722(arg1, arg0);
			@Pc(31) int local31;
			for (@Pc(24) int local24 = 0; local24 < this.anInt880; local24++) {
				local31 = this.anIntArray219[local24];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local31].anInt217 != anInt1007) {
					this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local31].aClass21_1 = null;
					this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local31] = null;
				}
			}
			if (arg1.anInt529 != arg0) {
				signlink.reporterror(this.aString27 + " size mismatch in getnpcpos - pos:" + arg1.anInt529 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local31 = 0; local31 < this.anInt1045; local31++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray274[local31]] == null) {
					signlink.reporterror(this.aString27 + " null entry in npc list - pos:" + local31 + " size:" + this.anInt1045);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("52535, " + 14094 + ", " + arg0 + ", " + arg1 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method579() {
		this.method586(20, "Starting up");
		if (signlink.sunjava) {
			super.anInt808 = 5;
		}
		if (aBoolean221) {
			this.aBoolean224 = true;
			return;
		}
		aBoolean221 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method642();
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
			this.aBoolean207 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(107) int local107 = 0; local107 < 5; local107++) {
				this.aClass34Array1[local107] = new Class34(signlink.aRandomAccessFileArray1[local107], local107 + 1, 500000, 730, signlink.aRandomAccessFile3);
			}
		}
		try {
			this.method661();
			this.aClass15_2 = this.method618("title screen", this.anIntArray225[1], 25, "title", 1);
			this.aClass1_Sub1_Sub2_Sub1_2 = new Class1_Sub1_Sub2_Sub1("p11_full", this.aClass15_2, true, false);
			this.aClass1_Sub1_Sub2_Sub1_3 = new Class1_Sub1_Sub2_Sub1("p12_full", this.aClass15_2, true, false);
			this.aClass1_Sub1_Sub2_Sub1_4 = new Class1_Sub1_Sub2_Sub1("b12_full", this.aClass15_2, true, false);
			this.aClass1_Sub1_Sub2_Sub1_5 = new Class1_Sub1_Sub2_Sub1("q8_full", this.aClass15_2, true, true);
			this.method688();
			this.method725(anInt831);
			@Pc(203) Class15 local203 = this.method618("config", this.anIntArray225[2], 30, "config", 2);
			@Pc(215) Class15 local215 = this.method618("interface", this.anIntArray225[3], 35, "interface", 3);
			@Pc(227) Class15 local227 = this.method618("2d graphics", this.anIntArray225[4], 40, "media", 4);
			@Pc(239) Class15 local239 = this.method618("textures", this.anIntArray225[6], 45, "textures", 6);
			@Pc(251) Class15 local251 = this.method618("chat system", this.anIntArray225[7], 50, "wordenc", 7);
			@Pc(263) Class15 local263 = this.method618("sound effects", this.anIntArray225[8], 55, "sounds", 8);
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray8 = new int[4][105][105];
			this.aClass18_1 = new Class18(104, this.anIntArrayArrayArray8, 458, 4, 104);
			for (@Pc(288) int local288 = 0; local288 < 4; local288++) {
				this.aClass22Array1[local288] = new Class22((byte) -99, 104, 104);
			}
			this.aClass1_Sub1_Sub2_Sub3_6 = new Class1_Sub1_Sub2_Sub3(512, 512);
			@Pc(323) Class15 local323 = this.method618("update list", this.anIntArray225[5], 60, "versionlist", 5);
			this.method586(60, "Connecting to update server");
			this.aClass28_Sub1_1 = new Class28_Sub1();
			this.aClass28_Sub1_1.method458(local323, this);
			Class49.method569(this.aClass28_Sub1_1.method459());
			Class1_Sub1_Sub1_Sub4.method360(this.aClass28_Sub1_1.method467(0), this.aClass28_Sub1_1);
			if (!aBoolean205) {
				this.anInt1012 = 0;
				this.aBoolean214 = true;
				this.aClass28_Sub1_1.method469(2, this.anInt1012);
				while (this.aClass28_Sub1_1.method452() > 0) {
					this.method665();
					try {
						Thread.sleep(100L);
					} catch (@Pc(374) Exception local374) {
					}
					if (this.aClass28_Sub1_1.anInt680 > 3) {
						this.method616("ondemand");
						return;
					}
				}
			}
			this.method586(65, "Requesting animations");
			@Pc(398) int local398 = this.aClass28_Sub1_1.method467(1);
			for (@Pc(400) int local400 = 0; local400 < local398; local400++) {
				this.aClass28_Sub1_1.method469(1, local400);
			}
			@Pc(419) int local419;
			while (this.aClass28_Sub1_1.method452() > 0) {
				local419 = local398 - this.aClass28_Sub1_1.method452();
				if (local419 > 0) {
					this.method586(65, "Loading animations - " + local419 * 100 / local398 + "%");
				}
				this.method665();
				try {
					Thread.sleep(100L);
				} catch (@Pc(445) Exception local445) {
				}
				if (this.aClass28_Sub1_1.anInt680 > 3) {
					this.method616("ondemand");
					return;
				}
			}
			this.method586(70, "Requesting models");
			local398 = this.aClass28_Sub1_1.method467(0);
			@Pc(479) int local479;
			for (local419 = 0; local419 < local398; local419++) {
				local479 = this.aClass28_Sub1_1.method457(local419);
				if ((local479 & 0x1) != 0) {
					this.aClass28_Sub1_1.method469(0, local419);
				}
			}
			local398 = this.aClass28_Sub1_1.method452();
			while (this.aClass28_Sub1_1.method452() > 0) {
				local479 = local398 - this.aClass28_Sub1_1.method452();
				if (local479 > 0) {
					this.method586(70, "Loading models - " + local479 * 100 / local398 + "%");
				}
				this.method665();
				try {
					Thread.sleep(100L);
				} catch (@Pc(530) Exception local530) {
				}
			}
			if (this.aClass34Array1[0] != null) {
				this.method586(75, "Requesting maps");
				this.aClass28_Sub1_1.method469(3, this.aClass28_Sub1_1.method460(0, 47, 48));
				this.aClass28_Sub1_1.method469(3, this.aClass28_Sub1_1.method460(1, 47, 48));
				this.aClass28_Sub1_1.method469(3, this.aClass28_Sub1_1.method460(0, 48, 48));
				this.aClass28_Sub1_1.method469(3, this.aClass28_Sub1_1.method460(1, 48, 48));
				this.aClass28_Sub1_1.method469(3, this.aClass28_Sub1_1.method460(0, 49, 48));
				this.aClass28_Sub1_1.method469(3, this.aClass28_Sub1_1.method460(1, 49, 48));
				this.aClass28_Sub1_1.method469(3, this.aClass28_Sub1_1.method460(0, 47, 47));
				this.aClass28_Sub1_1.method469(3, this.aClass28_Sub1_1.method460(1, 47, 47));
				this.aClass28_Sub1_1.method469(3, this.aClass28_Sub1_1.method460(0, 48, 47));
				this.aClass28_Sub1_1.method469(3, this.aClass28_Sub1_1.method460(1, 48, 47));
				this.aClass28_Sub1_1.method469(3, this.aClass28_Sub1_1.method460(0, 48, 148));
				this.aClass28_Sub1_1.method469(3, this.aClass28_Sub1_1.method460(1, 48, 148));
				local398 = this.aClass28_Sub1_1.method452();
				while (this.aClass28_Sub1_1.method452() > 0) {
					local479 = local398 - this.aClass28_Sub1_1.method452();
					if (local479 > 0) {
						this.method586(75, "Loading maps - " + local479 * 100 / local398 + "%");
					}
					this.method665();
					try {
						Thread.sleep(100L);
					} catch (@Pc(715) Exception local715) {
					}
				}
			}
			local398 = this.aClass28_Sub1_1.method467(0);
			@Pc(736) int local736;
			for (local479 = 0; local479 < local398; local479++) {
				local736 = this.aClass28_Sub1_1.method457(local479);
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
					this.aClass28_Sub1_1.method454(0, local738, local479, aByte36);
				}
			}
			this.aClass28_Sub1_1.method463(aBoolean204);
			if (!aBoolean205) {
				local398 = this.aClass28_Sub1_1.method467(2);
				for (local736 = 1; local736 < local398; local736++) {
					if (this.aClass28_Sub1_1.method456(local736)) {
						this.aClass28_Sub1_1.method454(2, (byte) 1, local736, aByte36);
					}
				}
			}
			this.method586(80, "Unpacking media");
			this.aClass1_Sub1_Sub2_Sub2_11 = new Class1_Sub1_Sub2_Sub2(local227, "invback", 0);
			this.aClass1_Sub1_Sub2_Sub2_13 = new Class1_Sub1_Sub2_Sub2(local227, "chatback", 0);
			this.aClass1_Sub1_Sub2_Sub2_12 = new Class1_Sub1_Sub2_Sub2(local227, "mapback", 0);
			this.aClass1_Sub1_Sub2_Sub2_8 = new Class1_Sub1_Sub2_Sub2(local227, "backbase1", 0);
			this.aClass1_Sub1_Sub2_Sub2_9 = new Class1_Sub1_Sub2_Sub2(local227, "backbase2", 0);
			this.aClass1_Sub1_Sub2_Sub2_10 = new Class1_Sub1_Sub2_Sub2(local227, "backhmid1", 0);
			for (local736 = 0; local736 < 13; local736++) {
				this.aClass1_Sub1_Sub2_Sub2Array2[local736] = new Class1_Sub1_Sub2_Sub2(local227, "sideicons", local736);
			}
			this.aClass1_Sub1_Sub2_Sub3_12 = new Class1_Sub1_Sub2_Sub3(local227, "compass", 0);
			this.aClass1_Sub1_Sub2_Sub3_5 = new Class1_Sub1_Sub2_Sub3(local227, "mapedge", 0);
			this.aClass1_Sub1_Sub2_Sub3_5.method169();
			for (@Pc(938) int local938 = 0; local938 < 72; local938++) {
				this.aClass1_Sub1_Sub2_Sub2Array4[local938] = new Class1_Sub1_Sub2_Sub2(local227, "mapscene", local938);
			}
			for (@Pc(956) int local956 = 0; local956 < 70; local956++) {
				this.aClass1_Sub1_Sub2_Sub3Array5[local956] = new Class1_Sub1_Sub2_Sub3(local227, "mapfunction", local956);
			}
			for (@Pc(974) int local974 = 0; local974 < 5; local974++) {
				this.aClass1_Sub1_Sub2_Sub3Array6[local974] = new Class1_Sub1_Sub2_Sub3(local227, "hitmarks", local974);
			}
			for (@Pc(992) int local992 = 0; local992 < 6; local992++) {
				this.aClass1_Sub1_Sub2_Sub3Array8[local992] = new Class1_Sub1_Sub2_Sub3(local227, "headicons_pk", local992);
			}
			for (@Pc(1010) int local1010 = 0; local1010 < 9; local1010++) {
				this.aClass1_Sub1_Sub2_Sub3Array4[local1010] = new Class1_Sub1_Sub2_Sub3(local227, "headicons_prayer", local1010);
			}
			for (@Pc(1028) int local1028 = 0; local1028 < 6; local1028++) {
				this.aClass1_Sub1_Sub2_Sub3Array7[local1028] = new Class1_Sub1_Sub2_Sub3(local227, "headicons_hint", local1028);
			}
			this.aClass1_Sub1_Sub2_Sub3_9 = new Class1_Sub1_Sub2_Sub3(local227, "overlay_multiway", 0);
			this.aClass1_Sub1_Sub2_Sub3_7 = new Class1_Sub1_Sub2_Sub3(local227, "mapmarker", 0);
			this.aClass1_Sub1_Sub2_Sub3_8 = new Class1_Sub1_Sub2_Sub3(local227, "mapmarker", 1);
			for (@Pc(1070) int local1070 = 0; local1070 < 8; local1070++) {
				this.aClass1_Sub1_Sub2_Sub3Array10[local1070] = new Class1_Sub1_Sub2_Sub3(local227, "cross", local1070);
			}
			this.aClass1_Sub1_Sub2_Sub3_13 = new Class1_Sub1_Sub2_Sub3(local227, "mapdots", 0);
			this.aClass1_Sub1_Sub2_Sub3_14 = new Class1_Sub1_Sub2_Sub3(local227, "mapdots", 1);
			this.aClass1_Sub1_Sub2_Sub3_15 = new Class1_Sub1_Sub2_Sub3(local227, "mapdots", 2);
			this.aClass1_Sub1_Sub2_Sub3_16 = new Class1_Sub1_Sub2_Sub3(local227, "mapdots", 3);
			this.aClass1_Sub1_Sub2_Sub3_17 = new Class1_Sub1_Sub2_Sub3(local227, "mapdots", 4);
			this.aClass1_Sub1_Sub2_Sub2_6 = new Class1_Sub1_Sub2_Sub2(local227, "scrollbar", 0);
			this.aClass1_Sub1_Sub2_Sub2_7 = new Class1_Sub1_Sub2_Sub2(local227, "scrollbar", 1);
			this.aClass1_Sub1_Sub2_Sub2_1 = new Class1_Sub1_Sub2_Sub2(local227, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub2_2 = new Class1_Sub1_Sub2_Sub2(local227, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub2_3 = new Class1_Sub1_Sub2_Sub2(local227, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub2_4 = new Class1_Sub1_Sub2_Sub2(local227, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub2_4.method100();
			this.aClass1_Sub1_Sub2_Sub2_5 = new Class1_Sub1_Sub2_Sub2(local227, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub2_5.method100();
			this.aClass1_Sub1_Sub2_Sub2_16 = new Class1_Sub1_Sub2_Sub2(local227, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub2_16.method101();
			this.aClass1_Sub1_Sub2_Sub2_17 = new Class1_Sub1_Sub2_Sub2(local227, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub2_17.method101();
			this.aClass1_Sub1_Sub2_Sub2_18 = new Class1_Sub1_Sub2_Sub2(local227, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub2_18.method101();
			this.aClass1_Sub1_Sub2_Sub2_19 = new Class1_Sub1_Sub2_Sub2(local227, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub2_19.method100();
			this.aClass1_Sub1_Sub2_Sub2_19.method101();
			this.aClass1_Sub1_Sub2_Sub2_20 = new Class1_Sub1_Sub2_Sub2(local227, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub2_20.method100();
			this.aClass1_Sub1_Sub2_Sub2_20.method101();
			for (@Pc(1260) int local1260 = 0; local1260 < 2; local1260++) {
				this.aClass1_Sub1_Sub2_Sub2Array3[local1260] = new Class1_Sub1_Sub2_Sub2(local227, "mod_icons", local1260);
			}
			@Pc(1283) Class1_Sub1_Sub2_Sub3 local1283 = new Class1_Sub1_Sub2_Sub3(local227, "backleft1", 0);
			this.aClass8_3 = new Class8(local1283.anInt350, local1283.anInt349, this.method584(), anInt974);
			local1283.method170(0, 0);
			@Pc(1308) Class1_Sub1_Sub2_Sub3 local1308 = new Class1_Sub1_Sub2_Sub3(local227, "backleft2", 0);
			this.aClass8_4 = new Class8(local1308.anInt350, local1308.anInt349, this.method584(), anInt974);
			local1308.method170(0, 0);
			@Pc(1333) Class1_Sub1_Sub2_Sub3 local1333 = new Class1_Sub1_Sub2_Sub3(local227, "backright1", 0);
			this.aClass8_5 = new Class8(local1333.anInt350, local1333.anInt349, this.method584(), anInt974);
			local1333.method170(0, 0);
			@Pc(1358) Class1_Sub1_Sub2_Sub3 local1358 = new Class1_Sub1_Sub2_Sub3(local227, "backright2", 0);
			this.aClass8_6 = new Class8(local1358.anInt350, local1358.anInt349, this.method584(), anInt974);
			local1358.method170(0, 0);
			@Pc(1383) Class1_Sub1_Sub2_Sub3 local1383 = new Class1_Sub1_Sub2_Sub3(local227, "backtop1", 0);
			this.aClass8_7 = new Class8(local1383.anInt350, local1383.anInt349, this.method584(), anInt974);
			local1383.method170(0, 0);
			@Pc(1408) Class1_Sub1_Sub2_Sub3 local1408 = new Class1_Sub1_Sub2_Sub3(local227, "backvmid1", 0);
			this.aClass8_8 = new Class8(local1408.anInt350, local1408.anInt349, this.method584(), anInt974);
			local1408.method170(0, 0);
			@Pc(1433) Class1_Sub1_Sub2_Sub3 local1433 = new Class1_Sub1_Sub2_Sub3(local227, "backvmid2", 0);
			this.aClass8_9 = new Class8(local1433.anInt350, local1433.anInt349, this.method584(), anInt974);
			local1433.method170(0, 0);
			@Pc(1458) Class1_Sub1_Sub2_Sub3 local1458 = new Class1_Sub1_Sub2_Sub3(local227, "backvmid3", 0);
			this.aClass8_10 = new Class8(local1458.anInt350, local1458.anInt349, this.method584(), anInt974);
			local1458.method170(0, 0);
			@Pc(1483) Class1_Sub1_Sub2_Sub3 local1483 = new Class1_Sub1_Sub2_Sub3(local227, "backhmid2", 0);
			this.aClass8_11 = new Class8(local1483.anInt350, local1483.anInt349, this.method584(), anInt974);
			local1483.method170(0, 0);
			@Pc(1508) int local1508 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1515) int local1515 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1522) int local1522 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1529) int local1529 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1531) int local1531 = 0; local1531 < 100; local1531++) {
				if (this.aClass1_Sub1_Sub2_Sub3Array5[local1531] != null) {
					this.aClass1_Sub1_Sub2_Sub3Array5[local1531].method168(aByte32, local1515 + local1529, local1508 + local1529, local1522 + local1529);
				}
				if (this.aClass1_Sub1_Sub2_Sub2Array4[local1531] != null) {
					this.aClass1_Sub1_Sub2_Sub2Array4[local1531].method102(aByte32, local1515 + local1529, local1508 + local1529, local1522 + local1529);
				}
			}
			this.method586(83, "Unpacking textures");
			Class1_Sub1_Sub2_Sub4.method529(local239);
			Class1_Sub1_Sub2_Sub4.method533(0.8D);
			Class1_Sub1_Sub2_Sub4.method528(aBoolean202);
			this.method586(86, "Unpacking config");
			Class19.method242(local203);
			Class5.method123(local203);
			Class31.method427(local203);
			Class3.method30(local203);
			Class21.method255(local203);
			Class24.method270(local203);
			Class25.method276(local203);
			Class36.method445((byte) 8, local203);
			Class33.method434(local203);
			Class3.aBoolean14 = aBoolean204;
			if (!aBoolean205) {
				this.method586(90, "Unpacking sounds");
				@Pc(1634) byte[] local1634 = local263.method181("sounds.dat", null);
				@Pc(1640) Class1_Sub1_Sub4 local1640 = new Class1_Sub1_Sub4(0, local1634);
				Class45.method551(local1640);
			}
			this.method586(95, "Unpacking interfaces");
			@Pc(1671) Class1_Sub1_Sub2_Sub1[] local1671 = new Class1_Sub1_Sub2_Sub1[] { this.aClass1_Sub1_Sub2_Sub1_2, this.aClass1_Sub1_Sub2_Sub1_3, this.aClass1_Sub1_Sub2_Sub1_4, this.aClass1_Sub1_Sub2_Sub1_5 };
			Class27.method338(local1671, local215, local227);
			this.method586(100, "Preparing game engine");
			@Pc(1687) int local1687;
			@Pc(1689) int local1689;
			@Pc(1691) int local1691;
			for (@Pc(1683) int local1683 = 0; local1683 < 33; local1683++) {
				local1687 = 999;
				local1689 = 0;
				for (local1691 = 0; local1691 < 34; local1691++) {
					if (this.aClass1_Sub1_Sub2_Sub2_12.aByteArray2[local1691 + local1683 * this.aClass1_Sub1_Sub2_Sub2_12.anInt185] == 0) {
						if (local1687 == 999) {
							local1687 = local1691;
						}
					} else if (local1687 != 999) {
						local1689 = local1691;
						break;
					}
				}
				this.anIntArray272[local1683] = local1687;
				this.anIntArray230[local1683] = local1689 - local1687;
			}
			@Pc(1749) int local1749;
			for (local1687 = 5; local1687 < 156; local1687++) {
				local1689 = 999;
				local1691 = 0;
				for (local1749 = 25; local1749 < 172; local1749++) {
					if (this.aClass1_Sub1_Sub2_Sub2_12.aByteArray2[local1749 + local1687 * this.aClass1_Sub1_Sub2_Sub2_12.anInt185] == 0 && (local1749 > 34 || local1687 > 34)) {
						if (local1689 == 999) {
							local1689 = local1749;
						}
					} else if (local1689 != 999) {
						local1691 = local1749;
						break;
					}
				}
				this.anIntArray222[local1687 - 5] = local1689 - 25;
				this.anIntArray259[local1687 - 5] = local1691 - local1689;
			}
			Class1_Sub1_Sub2_Sub4.method526(765, 503);
			this.anIntArray257 = Class1_Sub1_Sub2_Sub4.anIntArray197;
			Class1_Sub1_Sub2_Sub4.method526(479, 96);
			this.anIntArray254 = Class1_Sub1_Sub2_Sub4.anIntArray197;
			Class1_Sub1_Sub2_Sub4.method526(190, 261);
			this.anIntArray255 = Class1_Sub1_Sub2_Sub4.anIntArray197;
			Class1_Sub1_Sub2_Sub4.method526(512, 334);
			this.anIntArray256 = Class1_Sub1_Sub2_Sub4.anIntArray197;
			@Pc(1840) int[] local1840 = new int[9];
			for (local1691 = 0; local1691 < 9; local1691++) {
				local1749 = local1691 * 32 + 128 + 15;
				@Pc(1858) int local1858 = local1749 * 3 + 600;
				@Pc(1862) int local1862 = Class1_Sub1_Sub2_Sub4.anIntArray195[local1749];
				local1840[local1691] = local1858 * local1862 >> 16;
			}
			Class18.method227(local1840);
			Class29.method389(local251);
			this.aClass48_1 = new Class48(this, aByte27);
			this.method585(this.aClass48_1, 10);
			Class1_Sub1_Sub1_Sub5.aClient3 = this;
			Class5.aClient1 = this;
			Class21.aClient2 = this;
		} catch (@Pc(1903) Exception local1903) {
			signlink.reporterror("loaderror " + this.aString20 + " " + this.anInt1043);
			this.aBoolean196 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	@Override
	protected void method581() {
		try {
			this.anIntArray238 = null;
			this.anIntArray239 = null;
			this.anIntArray240 = null;
			this.anIntArray241 = null;
			this.aStringArray10 = null;
			this.anIntArray227 = null;
			this.anIntArray228 = null;
			this.aClass1_Sub1_Sub2_Sub3Array9 = null;
			this.anIntArray216 = null;
			this.aByteArrayArray6 = null;
			this.aByteArrayArray5 = null;
			this.anIntArray217 = null;
			this.anIntArray218 = null;
			this.aClass1_Sub1_Sub2_Sub2_1 = null;
			this.aClass1_Sub1_Sub2_Sub2_2 = null;
			this.aClass1_Sub1_Sub2_Sub2_3 = null;
			this.aClass1_Sub1_Sub2_Sub2_4 = null;
			this.aClass1_Sub1_Sub2_Sub2_5 = null;
			if (this.aClass48_1 != null) {
				this.aClass48_1.aBoolean174 = false;
			}
			this.aClass48_1 = null;
			this.aClass1_Sub1_Sub2_Sub3_13 = null;
			this.aClass1_Sub1_Sub2_Sub3_14 = null;
			this.aClass1_Sub1_Sub2_Sub3_15 = null;
			this.aClass1_Sub1_Sub2_Sub3_16 = null;
			this.aClass1_Sub1_Sub2_Sub3_17 = null;
			this.aClass1_Sub1_Sub2_Sub2Array4 = null;
			this.aClass1_Sub1_Sub2_Sub3Array5 = null;
			this.aClass1_Sub1_Sub2_Sub2Array2 = null;
			this.method690();
			this.aClass1_Sub1_Sub2_Sub2_11 = null;
			this.aClass1_Sub1_Sub2_Sub2_12 = null;
			this.aClass1_Sub1_Sub2_Sub2_13 = null;
			this.anIntArray258 = null;
			this.aClass8_17 = null;
			this.aClass8_18 = null;
			this.aClass8_19 = null;
			this.aClass8_20 = null;
			this.aClass1_Sub1_Sub4_9 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub1Array1 = null;
			this.anIntArray274 = null;
			this.aClass8_24 = null;
			this.aClass8_25 = null;
			this.aClass8_26 = null;
			this.aClass8_27 = null;
			this.anIntArrayArrayArray8 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass18_1 = null;
			this.aClass22Array1 = null;
			this.aClass1_Sub1_Sub2_Sub3_6 = null;
			this.aClass1_Sub1_Sub4_8 = null;
			this.aClass1_Sub1_Sub4_7 = null;
			this.aClass1_Sub1_Sub4_6 = null;
			this.aClass1_Sub1_Sub2_Sub3_9 = null;
			this.aClass8_7 = null;
			this.aBoolean188 &= true;
			this.aClass8_8 = null;
			this.aClass8_9 = null;
			this.aClass8_10 = null;
			this.aClass8_11 = null;
			this.aClass8_3 = null;
			this.aClass8_4 = null;
			this.aClass8_5 = null;
			this.aClass8_6 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub2Array1 = null;
			this.anIntArray212 = null;
			this.anIntArray213 = null;
			this.aClass1_Sub1_Sub4Array1 = null;
			this.anIntArray219 = null;
			this.anIntArrayArray25 = null;
			this.anIntArrayArray23 = null;
			this.anIntArray252 = null;
			this.anIntArray253 = null;
			this.anIntArrayArray22 = null;
			this.aClass8_15 = null;
			this.aClass8_16 = null;
			this.aClass8_12 = null;
			this.aClass8_13 = null;
			this.aClass8_14 = null;
			this.aClass1_Sub1_Sub2_Sub3_12 = null;
			this.aClass1_Sub1_Sub2_Sub3Array6 = null;
			this.aClass1_Sub1_Sub2_Sub3Array8 = null;
			this.aClass1_Sub1_Sub2_Sub3Array4 = null;
			this.aClass1_Sub1_Sub2_Sub3Array7 = null;
			this.aClass1_Sub1_Sub2_Sub3Array10 = null;
			this.aClass16ArrayArrayArray1 = null;
			this.aClass16_10 = null;
			this.aStringArray12 = null;
			this.aLongArray4 = null;
			this.anIntArray215 = null;
			if (this.aClass28_Sub1_1 != null) {
				this.aClass28_Sub1_1.method464();
			}
			this.aClass28_Sub1_1 = null;
			try {
				if (this.aClass43_1 != null) {
					this.aClass43_1.method545();
				}
			} catch (@Pc(290) Exception local290) {
			}
			this.aClass43_1 = null;
			this.aClass1_Sub1_Sub2_Sub2_8 = null;
			this.aClass1_Sub1_Sub2_Sub2_9 = null;
			this.aClass1_Sub1_Sub2_Sub2_10 = null;
			this.aClass8_21 = null;
			this.aClass8_22 = null;
			this.aClass8_23 = null;
			this.aClass1_Sub1_Sub2_Sub2_16 = null;
			this.aClass1_Sub1_Sub2_Sub2_17 = null;
			this.aClass1_Sub1_Sub2_Sub2_18 = null;
			this.aClass1_Sub1_Sub2_Sub2_19 = null;
			this.aClass1_Sub1_Sub2_Sub2_20 = null;
			this.aClass16_12 = null;
			this.aClass16_11 = null;
			this.aByteArray21 = null;
			this.method673();
			Class5.method124();
			Class21.method254();
			Class3.method31();
			Class27.method336();
			Class31.aClass31Array1 = null;
			Class24.aClass24Array1 = null;
			Class10.aClass10Array1 = null;
			Class19.aClass19Array1 = null;
			Class25.aClass25Array1 = null;
			Class25.aClass46_7 = null;
			Class36.aClass36Array1 = null;
			super.aClass8_2 = null;
			Class1_Sub1_Sub1_Sub1_Sub2.aClass46_3 = null;
			Class1_Sub1_Sub2_Sub4.method524();
			Class18.method190();
			Class1_Sub1_Sub1_Sub4.method359();
			Class49.method571();
			System.gc();
		} catch (@Pc(376) RuntimeException local376) {
			signlink.reporterror("2110, " + true + ", " + local376.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method683(@OriginalArg(0) int arg0) {
		try {
			@Pc(8) int local8;
			if (this.anInt1008 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt1008 > 768) {
						this.anIntArray267[local8] = this.method634(this.anIntArray269[local8], 1024 - this.anInt1008, this.anIntArray268[local8]);
					} else if (this.anInt1008 > 256) {
						this.anIntArray267[local8] = this.anIntArray269[local8];
					} else {
						this.anIntArray267[local8] = this.method634(this.anIntArray268[local8], 256 - this.anInt1008, this.anIntArray269[local8]);
					}
				}
			} else if (this.anInt1009 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt1009 > 768) {
						this.anIntArray267[local8] = this.method634(this.anIntArray270[local8], 1024 - this.anInt1009, this.anIntArray268[local8]);
					} else if (this.anInt1009 > 256) {
						this.anIntArray267[local8] = this.anIntArray270[local8];
					} else {
						this.anIntArray267[local8] = this.method634(this.anIntArray268[local8], 256 - this.anInt1009, this.anIntArray270[local8]);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray267[local8] = this.anIntArray268[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass8_15.anIntArray42[local8] = this.aClass1_Sub1_Sub2_Sub3_3.anIntArray62[local8];
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
				local198 = this.anIntArray251[local185] * (256 - local185) / 256;
				local202 = local198 + 22;
				if (local202 < 0) {
					local202 = 0;
				}
				local181 += local202;
				for (local212 = local202; local212 < 128; local212++) {
					local220 = this.anIntArray223[local181++];
					if (local220 == 0) {
						local183++;
					} else {
						local224 = local220;
						local228 = 256 - local220;
						local220 = this.anIntArray267[local220];
						local239 = this.aClass8_15.anIntArray42[local183];
						this.aClass8_15.anIntArray42[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			this.aClass8_15.method134(super.aGraphics2, 0, 0);
			this.anInt1030 += arg0;
			for (local198 = 0; local198 < 33920; local198++) {
				this.aClass8_16.anIntArray42[local198] = this.aClass1_Sub1_Sub2_Sub3_4.anIntArray62[local198];
			}
			local181 = 0;
			local183 = 1176;
			for (local202 = 1; local202 < 255; local202++) {
				local212 = this.anIntArray251[local202] * (256 - local202) / 256;
				local220 = 103 - local212;
				local183 += local212;
				for (local224 = 0; local224 < local220; local224++) {
					local228 = this.anIntArray223[local181++];
					if (local228 == 0) {
						local183++;
					} else {
						local239 = local228;
						@Pc(368) int local368 = 256 - local228;
						local228 = this.anIntArray267[local228];
						@Pc(379) int local379 = this.aClass8_16.anIntArray42[local183];
						this.aClass8_16.anIntArray42[local183++] = ((local228 & 0xFF00FF) * local239 + (local379 & 0xFF00FF) * local368 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local379 & 0xFF00) * local368 & 0xFF0000) >> 8;
					}
				}
				local181 += 128 - local220;
				local183 += 128 - local220 - local212;
			}
			this.aClass8_16.method134(super.aGraphics2, 0, 637);
		} catch (@Pc(451) RuntimeException local451) {
			signlink.reporterror("80009, " + arg0 + ", " + local451.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method684() {
		try {
			if (this.anInt864 == 0 && super.anInt819 == 1) {
				@Pc(19) int local19 = super.anInt820 - 25 - 550;
				@Pc(26) int local26 = super.anInt821 - 5 - 4;
				if (local19 >= 0 && local26 >= 0 && local19 < 146 && local26 < 151) {
					local19 -= 73;
					local26 -= 75;
					@Pc(46) int local46 = this.anInt976 + this.anInt887 & 0x7FF;
					@Pc(50) int local50 = Class1_Sub1_Sub2_Sub4.anIntArray195[local46];
					@Pc(54) int local54 = Class1_Sub1_Sub2_Sub4.anIntArray196[local46];
					@Pc(63) int local63 = local50 * (this.anInt967 + 256) >> 8;
					@Pc(72) int local72 = local54 * (this.anInt967 + 256) >> 8;
					@Pc(82) int local82 = local26 * local63 + local19 * local72 >> 11;
					@Pc(92) int local92 = local26 * local72 - local19 * local63 >> 11;
					@Pc(99) int local99 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt231 + local82 >> 7;
					@Pc(106) int local106 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt232 - local92 >> 7;
					@Pc(127) boolean local127 = this.method667(0, 0, 0, 0, 0, 1, true, local99, local106, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0]);
					if (local127) {
						this.aClass1_Sub1_Sub4_8.method284(local19);
						this.aClass1_Sub1_Sub4_8.method284(local26);
						this.aClass1_Sub1_Sub4_8.method285(this.anInt976);
						this.aClass1_Sub1_Sub4_8.method284(57);
						this.aClass1_Sub1_Sub4_8.method284(this.anInt887);
						this.aClass1_Sub1_Sub4_8.method284(this.anInt967);
						this.aClass1_Sub1_Sub4_8.method284(89);
						this.aClass1_Sub1_Sub4_8.method285(aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt231);
						this.aClass1_Sub1_Sub4_8.method285(aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt232);
						this.aClass1_Sub1_Sub4_8.method284(this.anInt846);
						this.aClass1_Sub1_Sub4_8.method284(63);
						return;
					}
				}
			}
		} catch (@Pc(181) RuntimeException local181) {
			signlink.reporterror("44592, " + false + ", " + local181.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!JXGMYPJH;B)V")
	private void method685(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg1, @OriginalArg(2) byte arg2) {
		try {
			this.method686(arg1.anInt232, arg0, arg1.anInt231);
			if (this.aByte34 == 1) {
				@Pc(13) boolean local13 = false;
			} else {
				this.anInt1031 = this.aClass1_Sub1_Sub4_6.method294();
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("74471, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IIII)V")
	private void method686(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
				@Pc(28) int local28 = this.method607(arg0, arg2, this.anInt995) - arg1;
				@Pc(33) int local33 = arg2 - this.anInt946;
				@Pc(38) int local38 = local28 - this.anInt947;
				@Pc(43) int local43 = arg0 - this.anInt948;
				@Pc(48) int local48 = Class1_Sub1_Sub1_Sub4.anIntArray155[this.anInt949];
				@Pc(53) int local53 = Class1_Sub1_Sub1_Sub4.anIntArray156[this.anInt949];
				@Pc(58) int local58 = Class1_Sub1_Sub1_Sub4.anIntArray155[this.anInt950];
				@Pc(63) int local63 = Class1_Sub1_Sub1_Sub4.anIntArray156[this.anInt950];
				@Pc(73) int local73 = local43 * local58 + local33 * local63 >> 16;
				@Pc(83) int local83 = local43 * local63 - local33 * local58 >> 16;
				@Pc(85) int local85 = local73;
				@Pc(95) int local95 = local38 * local53 - local83 * local48 >> 16;
				@Pc(105) int local105 = local38 * local48 + local83 * local53 >> 16;
				if (local105 >= 50) {
					this.anInt1037 = Class1_Sub1_Sub2_Sub4.anInt741 + (local85 << 9) / local105;
					this.anInt1038 = Class1_Sub1_Sub2_Sub4.anInt742 + (local95 << 9) / local105;
				} else {
					this.anInt1037 = -1;
					this.anInt1038 = -1;
				}
			} else {
				this.anInt1037 = -1;
				this.anInt1038 = -1;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("69190, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method580() {
		try {
			if (!this.aBoolean224 && !this.aBoolean196 && !this.aBoolean207) {
				anInt1007++;
				if (this.aBoolean188) {
					this.method666(this.anInt845);
				} else {
					this.method654(this.anInt844);
				}
				this.method665();
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("20399, " + true + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!BNGXLHWA;)V")
	private void method687(@OriginalArg(1) Class1_Sub1_Sub2_Sub2 arg0) {
		try {
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray262.length; local12++) {
				this.anIntArray262[local12] = 0;
			}
			@Pc(37) int local37;
			for (@Pc(27) int local27 = 0; local27 < 5000; local27++) {
				local37 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray262[local37] = (int) (Math.random() * 256.0D);
			}
			@Pc(55) int local55;
			@Pc(59) int local59;
			@Pc(67) int local67;
			for (local37 = 0; local37 < 20; local37++) {
				for (local55 = 1; local55 < 255; local55++) {
					for (local59 = 1; local59 < 127; local59++) {
						local67 = local59 + (local55 << 7);
						this.anIntArray263[local67] = (this.anIntArray262[local67 - 1] + this.anIntArray262[local67 + 1] + this.anIntArray262[local67 - 128] + this.anIntArray262[local67 + 128]) / 4;
					}
				}
				@Pc(113) int[] local113 = this.anIntArray262;
				this.anIntArray262 = this.anIntArray263;
				this.anIntArray263 = local113;
			}
			if (arg0 != null) {
				local55 = 0;
				for (local59 = 0; local59 < arg0.anInt186; local59++) {
					for (local67 = 0; local67 < arg0.anInt185; local67++) {
						if (arg0.aByteArray2[local55++] != 0) {
							@Pc(149) int local149 = local67 + arg0.anInt187 + 16;
							@Pc(156) int local156 = local59 + arg0.anInt188 + 16;
							@Pc(162) int local162 = local149 + (local156 << 7);
							this.anIntArray262[local162] = 0;
						}
					}
				}
			}
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("17902, " + -131 + ", " + arg0 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
	private void method688() {
		try {
			@Pc(7) byte[] local7 = this.aClass15_2.method181("title.dat", null);
			@Pc(13) Class1_Sub1_Sub2_Sub3 local13 = new Class1_Sub1_Sub2_Sub3(local7, this);
			this.aClass8_15.method133();
			local13.method170(0, 0);
			this.aClass8_16.method133();
			local13.method170(-637, 0);
			this.aClass8_12.method133();
			local13.method170(-128, 0);
			this.aClass8_13.method133();
			local13.method170(-202, -371);
			this.aClass8_14.method133();
			local13.method170(-202, -171);
			this.aClass8_17.method133();
			local13.method170(0, -265);
			this.aClass8_18.method133();
			local13.method170(-562, -265);
			this.aClass8_19.method133();
			local13.method170(-128, -171);
			this.aClass8_20.method133();
			local13.method170(-562, -171);
			@Pc(102) int[] local102 = new int[local13.anInt349];
			for (@Pc(104) int local104 = 0; local104 < local13.anInt350; local104++) {
				for (@Pc(108) int local108 = 0; local108 < local13.anInt349; local108++) {
					local102[local108] = local13.anIntArray62[local13.anInt349 + local13.anInt349 * local104 - local108 - 1];
				}
				for (@Pc(134) int local134 = 0; local134 < local13.anInt349; local134++) {
					local13.anIntArray62[local134 + local13.anInt349 * local104] = local102[local134];
				}
			}
			this.aClass8_15.method133();
			local13.method170(382, 0);
			this.aClass8_16.method133();
			local13.method170(-255, 0);
			this.aClass8_12.method133();
			local13.method170(254, 0);
			this.aClass8_13.method133();
			local13.method170(180, -371);
			this.aClass8_14.method133();
			local13.method170(180, -171);
			this.aClass8_17.method133();
			local13.method170(382, -265);
			this.aClass8_18.method133();
			local13.method170(-180, -265);
			this.aClass8_19.method133();
			local13.method170(254, -171);
			this.aClass8_20.method133();
			local13.method170(-180, -171);
			local13 = new Class1_Sub1_Sub2_Sub3(this.aClass15_2, "logo", 0);
			this.aClass8_12.method133();
			local13.method172(382 - local13.anInt349 / 2 - 128, 18);
			System.gc();
		} catch (@Pc(272) RuntimeException local272) {
			signlink.reporterror("50118, " + 112 + ", " + local272.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method690() {
		try {
			signlink.aBoolean226 = false;
			signlink.anInt1063 = 0;
			signlink.midi = "stop";
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("76953, " + false + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method691(@OriginalArg(0) int arg0) {
		try {
			if (arg0 <= 0) {
				this.anInt1031 = this.aClass1_Sub1_Sub4_6.method294();
			}
			for (@Pc(13) Class1_Sub1_Sub1_Sub3 local13 = (Class1_Sub1_Sub1_Sub3) this.aClass16_11.method185(); local13 != null; local13 = (Class1_Sub1_Sub1_Sub3) this.aClass16_11.method187()) {
				if (local13.anInt319 != this.anInt995 || local13.aBoolean65) {
					local13.method560();
				} else if (anInt1007 >= local13.anInt325) {
					local13.method144(this.anInt1042);
					if (local13.aBoolean65) {
						local13.method560();
					} else {
						this.aClass18_1.method202(local13.anInt319, local13.anInt322, local13.anInt320, local13, local13.anInt321, 60, 0, false, -1);
					}
				}
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("94908, " + arg0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) boolean local5 = false;
			if (arg0 >= 0) {
				@Pc(13) int local13 = this.anIntArray238[arg0];
				@Pc(18) int local18 = this.anIntArray239[arg0];
				@Pc(23) int local23 = this.anIntArray240[arg0];
				@Pc(28) int local28 = this.anIntArray241[arg0];
				if (local23 >= 2000) {
					local23 -= 2000;
				}
				if (this.anInt1022 != 0 && local23 != 1153) {
					this.anInt1022 = 0;
					this.aBoolean199 = true;
				}
				if (local23 == 697 && this.method676(local28, local13, local18)) {
					this.aClass1_Sub1_Sub4_8.method283(121);
					this.aClass1_Sub1_Sub4_8.method318(this.anInt870);
					this.aClass1_Sub1_Sub4_8.method317(this.aByte35, local18 + this.anInt895);
					this.aClass1_Sub1_Sub4_8.method317(this.aByte35, this.anInt871);
					this.aClass1_Sub1_Sub4_8.method318(local13 + this.anInt894);
					this.aClass1_Sub1_Sub4_8.method318(this.anInt869);
					this.aClass1_Sub1_Sub4_8.method285(local28 >> 14 & 0x7FFF);
				}
				@Pc(111) String local111;
				@Pc(115) int local115;
				@Pc(126) long local126;
				@Pc(128) int local128;
				if (local23 == 28) {
					local111 = this.aStringArray10[arg0];
					local115 = local111.indexOf("@whi@");
					if (local115 != -1) {
						local126 = Class41.method504(local111.substring(local115 + 5).trim());
						local128 = -1;
						for (@Pc(130) int local130 = 0; local130 < this.anInt827; local130++) {
							if (this.aLongArray4[local130] == local126) {
								local128 = local130;
								break;
							}
						}
						if (local128 != -1 && this.anIntArray215[local128] > 0) {
							this.aBoolean199 = true;
							this.anInt1022 = 0;
							this.aBoolean195 = true;
							this.aString18 = "";
							this.anInt843 = 3;
							this.aLong29 = this.aLongArray4[local128];
							this.aString23 = "Enter message to send to " + this.aStringArray12[local128];
						}
					}
				}
				@Pc(210) String local210;
				if (local23 == 1881) {
					@Pc(198) int local198 = local28 >> 14 & 0x7FFF;
					@Pc(201) Class5 local201 = Class5.method130(local198);
					if (local201.aByteArray3 == null) {
						local210 = "It's a " + local201.aString6 + ".";
					} else {
						local210 = new String(local201.aByteArray3);
					}
					this.method639(local210, 0, "");
				}
				@Pc(235) Class3 local235;
				@Pc(244) String local244;
				if (local23 == 1993) {
					local235 = Class3.method34(local28);
					if (local235.aByteArray1 == null) {
						local244 = "It's a " + local235.aString3 + ".";
					} else {
						local244 = new String(local235.aByteArray1);
					}
					this.method639(local244, 0, "");
				}
				if (local23 == 1478) {
					this.method676(local28, local13, local18);
					this.aClass1_Sub1_Sub4_8.method283(158);
					this.aClass1_Sub1_Sub4_8.method317(this.aByte35, local13 + this.anInt894);
					this.aClass1_Sub1_Sub4_8.method317(this.aByte35, local28 >> 14 & 0x7FFF);
					this.aClass1_Sub1_Sub4_8.method317(this.aByte35, local18 + this.anInt895);
				}
				if (local23 == 78) {
					this.method638();
				}
				@Pc(320) Class1_Sub1_Sub1_Sub1_Sub1 local320;
				if (local23 == 157) {
					local320 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local28];
					if (local320 != null) {
						this.method667(1, 0, 1, 0, 0, 2, false, local320.anIntArray28[0], local320.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0]);
						this.anInt906 = super.anInt820;
						this.anInt907 = super.anInt821;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.aClass1_Sub1_Sub4_8.method283(95);
						this.aClass1_Sub1_Sub4_8.method318(local28);
					}
				}
				if (local23 == 614) {
					local111 = this.aStringArray10[arg0];
					local115 = local111.indexOf("@whi@");
					if (local115 != -1) {
						if (this.anInt935 == -1) {
							this.method638();
							this.aString31 = local111.substring(local115 + 5).trim();
							this.aBoolean219 = false;
							this.anInt957 = this.anInt935 = Class27.anInt539;
						} else {
							this.method639("Please close the interface you have open before using 'report abuse'", 0, "");
						}
					}
				}
				if (local23 == 497) {
					this.aClass1_Sub1_Sub4_8.method283(116);
					this.aClass1_Sub1_Sub4_8.method285(local13);
					this.aClass1_Sub1_Sub4_8.method317(this.aByte35, local28);
					this.aClass1_Sub1_Sub4_8.method319(local18);
					this.anInt984 = 0;
					this.anInt985 = local18;
					this.anInt986 = local13;
					this.anInt987 = 2;
					if (Class27.method339(local18).anInt536 == this.anInt935) {
						this.anInt987 = 1;
					}
					if (Class27.method339(local18).anInt536 == this.anInt1054) {
						this.anInt987 = 3;
					}
				}
				if (local23 == 878) {
					this.aClass1_Sub1_Sub4_8.method283(188);
					this.aClass1_Sub1_Sub4_8.method285(this.anInt871);
					this.aClass1_Sub1_Sub4_8.method317(this.aByte35, this.anInt870);
					this.aClass1_Sub1_Sub4_8.method285(local18);
					this.aClass1_Sub1_Sub4_8.method319(local28);
					this.aClass1_Sub1_Sub4_8.method317(this.aByte35, this.anInt869);
					this.aClass1_Sub1_Sub4_8.method317(this.aByte35, local13);
					this.anInt984 = 0;
					this.anInt985 = local18;
					this.anInt986 = local13;
					this.anInt987 = 2;
					if (Class27.method339(local18).anInt536 == this.anInt935) {
						this.anInt987 = 1;
					}
					if (Class27.method339(local18).anInt536 == this.anInt1054) {
						this.anInt987 = 3;
					}
				}
				@Pc(560) Class27 local560;
				if (local23 == 600) {
					this.aClass1_Sub1_Sub4_8.method283(155);
					this.aClass1_Sub1_Sub4_8.method285(local18);
					local560 = Class27.method339(local18);
					if (local560.anIntArrayArray10 != null && local560.anIntArrayArray10[0][0] == 5) {
						local115 = local560.anIntArrayArray10[0][1];
						this.anIntArray258[local115] = 1 - this.anIntArray258[local115];
						this.method626(local115);
						this.aBoolean194 = true;
					}
				}
				@Pc(603) Class1_Sub1_Sub1_Sub1_Sub2 local603;
				if (local23 == 495) {
					local603 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local28];
					if (local603 != null) {
						this.method667(1, 0, 1, 0, 0, 2, false, local603.anIntArray28[0], local603.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0]);
						this.anInt906 = super.anInt820;
						this.anInt907 = super.anInt821;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.aClass1_Sub1_Sub4_8.method283(230);
						this.aClass1_Sub1_Sub4_8.method319(this.anInt964);
						this.aClass1_Sub1_Sub4_8.method285(local28);
					}
				}
				if (local23 == 956) {
					local320 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local28];
					if (local320 != null) {
						this.method667(1, 0, 1, 0, 0, 2, false, local320.anIntArray28[0], local320.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0]);
						this.anInt906 = super.anInt820;
						this.anInt907 = super.anInt821;
						this.anInt909 = 2;
						this.anInt908 = 0;
						if ((local28 & 0x3) == 0) {
							anInt970++;
						}
						if (anInt970 >= 147) {
							this.aClass1_Sub1_Sub4_8.method283(34);
							this.aClass1_Sub1_Sub4_8.method288(0);
							anInt970 = 0;
						}
						this.aClass1_Sub1_Sub4_8.method283(233);
						this.aClass1_Sub1_Sub4_8.method285(local28);
					}
				}
				if (local23 == 881) {
					this.aClass1_Sub1_Sub4_8.method283(111);
					this.aClass1_Sub1_Sub4_8.method317(this.aByte35, local13);
					this.aClass1_Sub1_Sub4_8.method318(local28);
					this.aClass1_Sub1_Sub4_8.method285(local18);
					this.anInt984 = 0;
					this.anInt985 = local18;
					this.anInt986 = local13;
					this.anInt987 = 2;
					if (Class27.method339(local18).anInt536 == this.anInt935) {
						this.anInt987 = 1;
					}
					if (Class27.method339(local18).anInt536 == this.anInt1054) {
						this.anInt987 = 3;
					}
				}
				if (local23 == 635) {
					this.aClass1_Sub1_Sub4_8.method283(51);
					this.aClass1_Sub1_Sub4_8.method319(local18);
					this.aClass1_Sub1_Sub4_8.method317(this.aByte35, local28);
					this.aClass1_Sub1_Sub4_8.method317(this.aByte35, local13);
					this.anInt984 = 0;
					this.anInt985 = local18;
					this.anInt986 = local13;
					this.anInt987 = 2;
					if (Class27.method339(local18).anInt536 == this.anInt935) {
						this.anInt987 = 1;
					}
					if (Class27.method339(local18).anInt536 == this.anInt1054) {
						this.anInt987 = 3;
					}
				}
				if (local23 == 592) {
					this.aClass1_Sub1_Sub4_8.method283(11);
					this.aClass1_Sub1_Sub4_8.method317(this.aByte35, local18);
					this.aClass1_Sub1_Sub4_8.method317(this.aByte35, local28);
					this.aClass1_Sub1_Sub4_8.method317(this.aByte35, local13);
					this.anInt984 = 0;
					this.anInt985 = local18;
					this.anInt986 = local13;
					this.anInt987 = 2;
					if (Class27.method339(local18).anInt536 == this.anInt935) {
						this.anInt987 = 1;
					}
					if (Class27.method339(local18).anInt536 == this.anInt1054) {
						this.anInt987 = 3;
					}
				}
				if (local23 == 369) {
					local603 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local28];
					if (local603 != null) {
						this.method667(1, 0, 1, 0, 0, 2, false, local603.anIntArray28[0], local603.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0]);
						this.anInt906 = super.anInt820;
						this.anInt907 = super.anInt821;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.aClass1_Sub1_Sub4_8.method283(139);
						this.aClass1_Sub1_Sub4_8.method317(this.aByte35, local28);
					}
				}
				if (local23 == 212) {
					this.aClass1_Sub1_Sub4_8.method283(103);
					this.aClass1_Sub1_Sub4_8.method319(local18);
					this.aClass1_Sub1_Sub4_8.method319(local28);
					this.aClass1_Sub1_Sub4_8.method317(this.aByte35, local13);
					this.anInt984 = 0;
					this.anInt985 = local18;
					this.anInt986 = local13;
					this.anInt987 = 2;
					if (Class27.method339(local18).anInt536 == this.anInt935) {
						this.anInt987 = 1;
					}
					if (Class27.method339(local18).anInt536 == this.anInt1054) {
						this.anInt987 = 3;
					}
				}
				if (local23 == 2) {
					if (this.aBoolean200) {
						this.aClass18_1.method229(local13 - 4, local18 - 4);
					} else {
						this.aClass18_1.method229(super.anInt820 - 4, super.anInt821 - 4);
					}
				}
				if (local23 == 416) {
					local320 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local28];
					if (local320 != null) {
						this.method667(1, 0, 1, 0, 0, 2, false, local320.anIntArray28[0], local320.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0]);
						this.anInt906 = super.anInt820;
						this.anInt907 = super.anInt821;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.aClass1_Sub1_Sub4_8.method283(101);
						this.aClass1_Sub1_Sub4_8.method319(this.anInt870);
						this.aClass1_Sub1_Sub4_8.method319(this.anInt871);
						this.aClass1_Sub1_Sub4_8.method318(this.anInt869);
						this.aClass1_Sub1_Sub4_8.method317(this.aByte35, local28);
					}
				}
				if (local23 == 314) {
					local603 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local28];
					if (local603 != null) {
						this.method667(1, 0, 1, 0, 0, 2, false, local603.anIntArray28[0], local603.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0]);
						this.anInt906 = super.anInt820;
						this.anInt907 = super.anInt821;
						this.anInt909 = 2;
						this.anInt908 = 0;
						anInt881 += local28;
						if (anInt881 >= 91) {
							this.aClass1_Sub1_Sub4_8.method283(86);
							this.aClass1_Sub1_Sub4_8.method285(51305);
							anInt881 = 0;
						}
						this.aClass1_Sub1_Sub4_8.method283(91);
						this.aClass1_Sub1_Sub4_8.method319(local28);
					}
				}
				if (local23 == 732) {
					this.method676(local28, local13, local18);
					this.aClass1_Sub1_Sub4_8.method283(201);
					this.aClass1_Sub1_Sub4_8.method317(this.aByte35, local13 + this.anInt894);
					this.aClass1_Sub1_Sub4_8.method318(local18 + this.anInt895);
					this.aClass1_Sub1_Sub4_8.method319(local28 >> 14 & 0x7FFF);
				}
				@Pc(1277) boolean local1277;
				if (local23 == 745) {
					local1277 = this.method667(0, 0, 0, 0, 0, 2, false, local13, local18, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0]);
					if (!local1277) {
						this.method667(1, 0, 1, 0, 0, 2, false, local13, local18, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0]);
					}
					this.anInt906 = super.anInt820;
					this.anInt907 = super.anInt821;
					this.anInt909 = 2;
					this.anInt908 = 0;
					this.aClass1_Sub1_Sub4_8.method283(73);
					this.aClass1_Sub1_Sub4_8.method318(local13 + this.anInt894);
					this.aClass1_Sub1_Sub4_8.method319(local18 + this.anInt895);
					this.aClass1_Sub1_Sub4_8.method317(this.aByte35, local28);
				}
				if (local23 == 872) {
					this.aClass1_Sub1_Sub4_8.method283(126);
					this.aClass1_Sub1_Sub4_8.method285(local13);
					this.aClass1_Sub1_Sub4_8.method319(local18);
					this.aClass1_Sub1_Sub4_8.method285(local28);
					this.anInt984 = 0;
					this.anInt985 = local18;
					this.anInt986 = local13;
					this.anInt987 = 2;
					if (Class27.method339(local18).anInt536 == this.anInt935) {
						this.anInt987 = 1;
					}
					if (Class27.method339(local18).anInt536 == this.anInt1054) {
						this.anInt987 = 3;
					}
				}
				if (local23 == 603) {
					local1277 = this.method667(0, 0, 0, 0, 0, 2, false, local13, local18, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0]);
					if (!local1277) {
						this.method667(1, 0, 1, 0, 0, 2, false, local13, local18, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0]);
					}
					this.anInt906 = super.anInt820;
					this.anInt907 = super.anInt821;
					this.anInt909 = 2;
					this.anInt908 = 0;
					this.aClass1_Sub1_Sub4_8.method283(81);
					this.aClass1_Sub1_Sub4_8.method285(local28);
					this.aClass1_Sub1_Sub4_8.method317(this.aByte35, local13 + this.anInt894);
					this.aClass1_Sub1_Sub4_8.method319(local18 + this.anInt895);
				}
				if (local23 == 912) {
					local320 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local28];
					if (local320 != null) {
						this.method667(1, 0, 1, 0, 0, 2, false, local320.anIntArray28[0], local320.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0]);
						this.anInt906 = super.anInt820;
						this.anInt907 = super.anInt821;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.aClass1_Sub1_Sub4_8.method283(69);
						this.aClass1_Sub1_Sub4_8.method319(local28);
					}
				}
				if (local23 == 274) {
					local603 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local28];
					if (local603 != null) {
						this.method667(1, 0, 1, 0, 0, 2, false, local603.anIntArray28[0], local603.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0]);
						this.anInt906 = super.anInt820;
						this.anInt907 = super.anInt821;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.aClass1_Sub1_Sub4_8.method283(112);
						this.aClass1_Sub1_Sub4_8.method285(local28);
					}
				}
				if (local23 == 829) {
					this.aClass1_Sub1_Sub4_8.method283(175);
					this.aClass1_Sub1_Sub4_8.method285(local28);
					this.aClass1_Sub1_Sub4_8.method317(this.aByte35, local13);
					this.aClass1_Sub1_Sub4_8.method319(local18);
					this.anInt984 = 0;
					this.anInt985 = local18;
					this.anInt986 = local13;
					this.anInt987 = 2;
					if (Class27.method339(local18).anInt536 == this.anInt935) {
						this.anInt987 = 1;
					}
					if (Class27.method339(local18).anInt536 == this.anInt1054) {
						this.anInt987 = 3;
					}
				}
				if (local23 == 917 && this.method676(local28, local13, local18)) {
					this.aClass1_Sub1_Sub4_8.method283(16);
					this.aClass1_Sub1_Sub4_8.method285(local18 + this.anInt895);
					this.aClass1_Sub1_Sub4_8.method318(this.anInt964);
					this.aClass1_Sub1_Sub4_8.method318(local13 + this.anInt894);
					this.aClass1_Sub1_Sub4_8.method319(local28 >> 14 & 0x7FFF);
				}
				if (local23 == 176) {
					this.aClass1_Sub1_Sub4_8.method283(226);
					this.aClass1_Sub1_Sub4_8.method317(this.aByte35, local18);
					this.aClass1_Sub1_Sub4_8.method319(local28);
					this.aClass1_Sub1_Sub4_8.method319(local13);
					this.anInt984 = 0;
					this.anInt985 = local18;
					this.anInt986 = local13;
					this.anInt987 = 2;
					if (Class27.method339(local18).anInt536 == this.anInt935) {
						this.anInt987 = 1;
					}
					if (Class27.method339(local18).anInt536 == this.anInt1054) {
						this.anInt987 = 3;
					}
				}
				if (local23 == 804) {
					local320 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local28];
					if (local320 != null) {
						this.method667(1, 0, 1, 0, 0, 2, false, local320.anIntArray28[0], local320.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0]);
						this.anInt906 = super.anInt820;
						this.anInt907 = super.anInt821;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.aClass1_Sub1_Sub4_8.method283(210);
						this.aClass1_Sub1_Sub4_8.method318(local28);
					}
				}
				if (local23 == 567) {
					local603 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local28];
					if (local603 != null) {
						this.method667(1, 0, 1, 0, 0, 2, false, local603.anIntArray28[0], local603.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0]);
						this.anInt906 = super.anInt820;
						this.anInt907 = super.anInt821;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.aClass1_Sub1_Sub4_8.method283(85);
						this.aClass1_Sub1_Sub4_8.method317(this.aByte35, this.anInt869);
						this.aClass1_Sub1_Sub4_8.method285(local28);
						this.aClass1_Sub1_Sub4_8.method317(this.aByte35, this.anInt870);
						this.aClass1_Sub1_Sub4_8.method317(this.aByte35, this.anInt871);
					}
				}
				if (local23 == 702) {
					anInt866 += this.anInt894;
					if (anInt866 >= 105) {
						this.aClass1_Sub1_Sub4_8.method283(53);
						this.aClass1_Sub1_Sub4_8.method284(45);
						anInt866 = 0;
					}
					this.method676(local28, local13, local18);
					this.aClass1_Sub1_Sub4_8.method283(14);
					this.aClass1_Sub1_Sub4_8.method318(local18 + this.anInt895);
					this.aClass1_Sub1_Sub4_8.method317(this.aByte35, local28 >> 14 & 0x7FFF);
					this.aClass1_Sub1_Sub4_8.method319(local13 + this.anInt894);
				}
				if (local23 == 1581) {
					local320 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local28];
					if (local320 != null) {
						@Pc(1967) Class21 local1967 = local320.aClass21_1;
						if (local1967.anIntArray86 != null) {
							local1967 = local1967.method251();
						}
						if (local1967 != null) {
							if (local1967.aByteArray6 == null) {
								local210 = "It's a " + local1967.aString7 + ".";
							} else {
								local210 = new String(local1967.aByteArray6);
							}
							this.method639(local210, 0, "");
						}
					}
				}
				if (local23 == 25) {
					this.anInt868 = 1;
					this.anInt869 = local13;
					this.anInt870 = local18;
					this.anInt871 = local28;
					this.aString17 = String.valueOf(Class3.method34(local28).aString3);
					this.anInt963 = 0;
					this.aBoolean194 = true;
				} else {
					if (local23 == 253 && !this.aBoolean189) {
						this.aClass1_Sub1_Sub4_8.method283(78);
						this.aClass1_Sub1_Sub4_8.method285(local18);
						this.aBoolean189 = true;
					}
					if (local23 == 191) {
						local603 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local28];
						if (local603 != null) {
							this.method667(1, 0, 1, 0, 0, 2, false, local603.anIntArray28[0], local603.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0]);
							this.anInt906 = super.anInt820;
							this.anInt907 = super.anInt821;
							this.anInt909 = 2;
							this.anInt908 = 0;
							this.aClass1_Sub1_Sub4_8.method283(138);
							this.aClass1_Sub1_Sub4_8.method318(local28);
						}
					}
					if (local23 == 639) {
						local560 = Class27.method339(local18);
						@Pc(2119) boolean local2119 = true;
						if (local560.anInt567 > 0) {
							local2119 = this.method659(local560);
						}
						if (local2119) {
							this.aClass1_Sub1_Sub4_8.method283(155);
							this.aClass1_Sub1_Sub4_8.method285(local18);
						}
					}
					if (local23 == 601) {
						this.method676(local28, local13, local18);
						this.aClass1_Sub1_Sub4_8.method283(129);
						this.aClass1_Sub1_Sub4_8.method319(local13 + this.anInt894);
						this.aClass1_Sub1_Sub4_8.method318(local18 + this.anInt895);
						this.aClass1_Sub1_Sub4_8.method285(local28 >> 14 & 0x7FFF);
					}
					if (local23 == 194) {
						local1277 = this.method667(0, 0, 0, 0, 0, 2, false, local13, local18, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0]);
						if (!local1277) {
							this.method667(1, 0, 1, 0, 0, 2, false, local13, local18, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0]);
						}
						this.anInt906 = super.anInt820;
						this.anInt907 = super.anInt821;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.aClass1_Sub1_Sub4_8.method283(114);
						this.aClass1_Sub1_Sub4_8.method285(local28);
						this.aClass1_Sub1_Sub4_8.method285(local13 + this.anInt894);
						this.aClass1_Sub1_Sub4_8.method317(this.aByte35, local18 + this.anInt895);
					}
					if (local23 == 644) {
						local1277 = this.method667(0, 0, 0, 0, 0, 2, false, local13, local18, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0]);
						if (!local1277) {
							this.method667(1, 0, 1, 0, 0, 2, false, local13, local18, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0]);
						}
						this.anInt906 = super.anInt820;
						this.anInt907 = super.anInt821;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.aClass1_Sub1_Sub4_8.method283(190);
						this.aClass1_Sub1_Sub4_8.method318(local28);
						this.aClass1_Sub1_Sub4_8.method319(local18 + this.anInt895);
						this.aClass1_Sub1_Sub4_8.method319(local13 + this.anInt894);
					}
					if (local23 == 1169) {
						local235 = Class3.method34(local28);
						@Pc(2359) Class27 local2359 = Class27.method339(local18);
						if (local2359 != null && local2359.anIntArray112[local13] >= 100000) {
							local244 = local2359.anIntArray112[local13] + " x " + local235.aString3;
						} else if (local235.aByteArray1 == null) {
							local244 = "It's a " + local235.aString3 + ".";
						} else {
							local244 = new String(local235.aByteArray1);
						}
						this.method639(local244, 0, "");
					}
					if (local23 == 645) {
						this.aClass1_Sub1_Sub4_8.method283(155);
						this.aClass1_Sub1_Sub4_8.method285(local18);
						local560 = Class27.method339(local18);
						if (local560.anIntArrayArray10 != null && local560.anIntArrayArray10[0][0] == 5) {
							local115 = local560.anIntArrayArray10[0][1];
							if (this.anIntArray258[local115] != local560.anIntArray115[0]) {
								this.anIntArray258[local115] = local560.anIntArray115[0];
								this.method626(local115);
								this.aBoolean194 = true;
							}
						}
					}
					if (local23 == 141) {
						this.method649(this.anInt1040);
						this.anInt1040 = -1;
						this.aBoolean199 = true;
					}
					if (local23 == 200) {
						this.aClass1_Sub1_Sub4_8.method283(4);
						this.aClass1_Sub1_Sub4_8.method285(local28);
						this.aClass1_Sub1_Sub4_8.method285(local18);
						this.aClass1_Sub1_Sub4_8.method285(local13);
						this.aClass1_Sub1_Sub4_8.method319(this.anInt964);
						this.anInt984 = 0;
						this.anInt985 = local18;
						this.anInt986 = local13;
						this.anInt987 = 2;
						if (Class27.method339(local18).anInt536 == this.anInt935) {
							this.anInt987 = 1;
						}
						if (Class27.method339(local18).anInt536 == this.anInt1054) {
							this.anInt987 = 3;
						}
					}
					if (local23 == 536 || local23 == 691) {
						local111 = this.aStringArray10[arg0];
						local115 = local111.indexOf("@whi@");
						if (local115 != -1) {
							local111 = local111.substring(local115 + 5).trim();
							local210 = Class41.method508(Class41.method505(Class41.method504(local111)));
							@Pc(2573) boolean local2573 = false;
							for (local128 = 0; local128 < this.anInt836; local128++) {
								@Pc(2585) Class1_Sub1_Sub1_Sub1_Sub2 local2585 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray212[local128]];
								if (local2585 != null && local2585.aString5 != null && local2585.aString5.equalsIgnoreCase(local210)) {
									this.method667(1, 0, 1, 0, 0, 2, false, local2585.anIntArray28[0], local2585.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0]);
									if (local23 == 536) {
										this.aClass1_Sub1_Sub4_8.method283(138);
										this.aClass1_Sub1_Sub4_8.method318(this.anIntArray212[local128]);
									}
									if (local23 == 691) {
										anInt881 += local28;
										if (anInt881 >= 91) {
											this.aClass1_Sub1_Sub4_8.method283(86);
											this.aClass1_Sub1_Sub4_8.method285(51305);
											anInt881 = 0;
										}
										this.aClass1_Sub1_Sub4_8.method283(91);
										this.aClass1_Sub1_Sub4_8.method319(this.anIntArray212[local128]);
									}
									local2573 = true;
									break;
								}
							}
							if (!local2573) {
								this.method639("Unable to find " + local210, 0, "");
							}
						}
					}
					if (local23 == 48) {
						local603 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local28];
						if (local603 != null) {
							this.method667(1, 0, 1, 0, 0, 2, false, local603.anIntArray28[0], local603.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0]);
							this.anInt906 = super.anInt820;
							this.anInt907 = super.anInt821;
							this.anInt909 = 2;
							this.anInt908 = 0;
							anInt1006++;
							if (anInt1006 >= 88) {
								this.aClass1_Sub1_Sub4_8.method283(6);
								this.aClass1_Sub1_Sub4_8.method285(33600);
								anInt1006 = 0;
							}
							this.aClass1_Sub1_Sub4_8.method283(140);
							this.aClass1_Sub1_Sub4_8.method319(local28);
						}
					}
					if (local23 == 450) {
						local1277 = this.method667(0, 0, 0, 0, 0, 2, false, local13, local18, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0]);
						if (!local1277) {
							this.method667(1, 0, 1, 0, 0, 2, false, local13, local18, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0]);
						}
						this.anInt906 = super.anInt820;
						this.anInt907 = super.anInt821;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.aClass1_Sub1_Sub4_8.method283(222);
						this.aClass1_Sub1_Sub4_8.method285(local28);
						this.aClass1_Sub1_Sub4_8.method319(this.anInt964);
						this.aClass1_Sub1_Sub4_8.method317(this.aByte35, local13 + this.anInt894);
						this.aClass1_Sub1_Sub4_8.method319(local18 + this.anInt895);
					}
					if (local23 == 348) {
						this.aClass1_Sub1_Sub4_8.method283(194);
						this.aClass1_Sub1_Sub4_8.method285(local28);
						this.aClass1_Sub1_Sub4_8.method319(local18);
						this.aClass1_Sub1_Sub4_8.method318(local13);
						this.anInt984 = 0;
						this.anInt985 = local18;
						this.anInt986 = local13;
						this.anInt987 = 2;
						if (Class27.method339(local18).anInt536 == this.anInt935) {
							this.anInt987 = 1;
						}
						if (Class27.method339(local18).anInt536 == this.anInt1054) {
							this.anInt987 = 3;
						}
					}
					if (local23 == 344) {
						local1277 = this.method667(0, 0, 0, 0, 0, 2, false, local13, local18, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0]);
						if (!local1277) {
							this.method667(1, 0, 1, 0, 0, 2, false, local13, local18, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0]);
						}
						this.anInt906 = super.anInt820;
						this.anInt907 = super.anInt821;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.aClass1_Sub1_Sub4_8.method283(117);
						this.aClass1_Sub1_Sub4_8.method319(local13 + this.anInt894);
						this.aClass1_Sub1_Sub4_8.method317(this.aByte35, local28);
						this.aClass1_Sub1_Sub4_8.method317(this.aByte35, local18 + this.anInt895);
					}
					if (local23 == 87 || local23 == 235 || local23 == 612 || local23 == 199) {
						local111 = this.aStringArray10[arg0];
						local115 = local111.indexOf("@whi@");
						if (local115 != -1) {
							local126 = Class41.method504(local111.substring(local115 + 5).trim());
							if (local23 == 87) {
								this.method710(local126);
							}
							if (local23 == 235) {
								this.method620(local126);
							}
							if (local23 == 612) {
								this.method640(986, local126);
							}
							if (local23 == 199) {
								this.method602(local126);
							}
						}
					}
					if (local23 == 201) {
						local560 = Class27.method339(local18);
						this.anInt963 = 1;
						this.anInt964 = local18;
						this.anInt965 = local560.anInt540;
						this.anInt868 = 0;
						this.aBoolean194 = true;
						local244 = local560.aString12;
						if (local244.indexOf(" ") != -1) {
							local244 = local244.substring(0, local244.indexOf(" "));
						}
						local210 = local560.aString12;
						if (local210.indexOf(" ") != -1) {
							local210 = local210.substring(local210.indexOf(" ") + 1);
						}
						this.aString24 = local244 + " " + local560.aString9 + " " + local210;
						if (this.anInt965 == 16) {
							this.aBoolean194 = true;
							this.anInt959 = 3;
							this.aBoolean181 = true;
						}
					} else {
						if (local23 == 950) {
							local320 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local28];
							if (local320 != null) {
								this.method667(1, 0, 1, 0, 0, 2, false, local320.anIntArray28[0], local320.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0]);
								this.anInt906 = super.anInt820;
								this.anInt907 = super.anInt821;
								this.anInt909 = 2;
								this.anInt908 = 0;
								this.aClass1_Sub1_Sub4_8.method283(93);
								this.aClass1_Sub1_Sub4_8.method285(local28);
							}
						}
						if (local23 == 861) {
							this.method676(local28, local13, local18);
							this.aClass1_Sub1_Sub4_8.method283(242);
							this.aClass1_Sub1_Sub4_8.method319(local13 + this.anInt894);
							this.aClass1_Sub1_Sub4_8.method285(local28 >> 14 & 0x7FFF);
							this.aClass1_Sub1_Sub4_8.method317(this.aByte35, local18 + this.anInt895);
						}
						if (local23 == 368) {
							local1277 = this.method667(0, 0, 0, 0, 0, 2, false, local13, local18, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0]);
							if (!local1277) {
								this.method667(1, 0, 1, 0, 0, 2, false, local13, local18, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0]);
							}
							this.anInt906 = super.anInt820;
							this.anInt907 = super.anInt821;
							this.anInt909 = 2;
							this.anInt908 = 0;
							this.aClass1_Sub1_Sub4_8.method283(38);
							this.aClass1_Sub1_Sub4_8.method319(this.anInt870);
							this.aClass1_Sub1_Sub4_8.method317(this.aByte35, local18 + this.anInt895);
							this.aClass1_Sub1_Sub4_8.method318(local28);
							this.aClass1_Sub1_Sub4_8.method318(this.anInt871);
							this.aClass1_Sub1_Sub4_8.method319(local13 + this.anInt894);
							this.aClass1_Sub1_Sub4_8.method319(this.anInt869);
						}
						if (local23 == 139) {
							this.aClass1_Sub1_Sub4_8.method283(27);
							this.aClass1_Sub1_Sub4_8.method319(local18);
							this.aClass1_Sub1_Sub4_8.method317(this.aByte35, local28);
							this.aClass1_Sub1_Sub4_8.method318(local13);
							this.anInt984 = 0;
							this.anInt985 = local18;
							this.anInt986 = local13;
							this.anInt987 = 2;
							if (Class27.method339(local18).anInt536 == this.anInt935) {
								this.anInt987 = 1;
							}
							if (Class27.method339(local18).anInt536 == this.anInt1054) {
								this.anInt987 = 3;
							}
						}
						if (local23 == 372) {
							local320 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local28];
							if (local320 != null) {
								this.method667(1, 0, 1, 0, 0, 2, false, local320.anIntArray28[0], local320.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0], aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0]);
								this.anInt906 = super.anInt820;
								this.anInt907 = super.anInt821;
								this.anInt909 = 2;
								this.anInt908 = 0;
								this.aClass1_Sub1_Sub4_8.method283(221);
								this.aClass1_Sub1_Sub4_8.method318(local28);
								this.aClass1_Sub1_Sub4_8.method317(this.aByte35, this.anInt964);
							}
						}
						this.anInt868 = 0;
						this.anInt963 = 0;
						this.aBoolean194 = true;
					}
				}
			}
		} catch (@Pc(3491) RuntimeException local3491) {
			signlink.reporterror("79922, " + arg0 + ", " + arg1 + ", " + local3491.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)V")
	private void method693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class16 local9 = this.aClass16ArrayArrayArray1[this.anInt995][arg0][arg1];
		if (local9 == null) {
			this.aClass18_1.method212(this.anInt995, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub1_Sub1_Sub2 local23 = null;
		@Pc(27) Class1_Sub1_Sub1_Sub2 local27;
		for (local27 = (Class1_Sub1_Sub1_Sub2) local9.method185(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub2) local9.method187()) {
			@Pc(32) Class3 local32 = Class3.method34(local27.anInt311);
			@Pc(35) int local35 = local32.anInt118;
			if (local32.aBoolean13) {
				local35 *= local27.anInt310 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method183(local23);
		@Pc(65) Class1_Sub1_Sub1_Sub2 local65 = null;
		@Pc(67) Class1_Sub1_Sub1_Sub2 local67 = null;
		for (local27 = (Class1_Sub1_Sub1_Sub2) local9.method185(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub2) local9.method187()) {
			if (local27.anInt311 != local23.anInt311 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt311 != local23.anInt311 && local27.anInt311 != local65.anInt311 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass18_1.method198(local67, this.anInt995, arg0, local110, local23, local65, this.method607(arg1 * 128 + 64, arg0 * 128 + 64, this.anInt995), arg1, (byte) 1);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!MVHXDWGI;II)V")
	private void method694(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			while (true) {
				if (arg0.anInt530 + 21 < arg1 * 8) {
					@Pc(20) int local20 = arg0.method305(14);
					if (local20 != 16383) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local20] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local20] = new Class1_Sub1_Sub1_Sub1_Sub1();
						}
						@Pc(40) Class1_Sub1_Sub1_Sub1_Sub1 local40 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local20];
						this.anIntArray274[this.anInt1045++] = local20;
						local40.anInt217 = anInt1007;
						@Pc(59) int local59 = arg0.method305(1);
						local40.aClass21_1 = Class21.method250(arg0.method305(13));
						@Pc(71) int local71 = arg0.method305(5);
						if (local71 > 15) {
							local71 -= 32;
						}
						@Pc(80) int local80 = arg0.method305(1);
						if (local80 == 1) {
							this.anIntArray213[this.anInt837++] = local20;
						}
						@Pc(99) int local99 = arg0.method305(5);
						if (local99 > 15) {
							local99 -= 32;
						}
						local40.anInt216 = local40.aClass21_1.aByte10;
						local40.anInt234 = local40.aClass21_1.anInt437;
						local40.anInt212 = local40.aClass21_1.anInt436;
						local40.anInt213 = local40.aClass21_1.anInt430;
						local40.anInt214 = local40.aClass21_1.anInt438;
						local40.anInt215 = local40.aClass21_1.anInt425;
						local40.anInt235 = local40.aClass21_1.anInt442;
						local40.method113(aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0] + local71, local59 == 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0] + local99, this.anInt902);
						continue;
					}
				}
				arg0.method306();
				return;
			}
		} catch (@Pc(167) RuntimeException local167) {
			signlink.reporterror("69563, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local167.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
	private void method695() {
		try {
			if (this.anInt915 == 0) {
				@Pc(8) int local8 = super.anInt819;
				if (this.anInt963 == 1 && super.anInt820 >= 516 && super.anInt821 >= 160 && super.anInt820 <= 765 && super.anInt821 <= 205) {
					local8 = 0;
				}
				@Pc(48) int local48;
				@Pc(51) int local51;
				@Pc(127) int local127;
				if (this.aBoolean200) {
					if (local8 != 1) {
						local48 = super.anInt814;
						local51 = super.anInt815;
						if (this.anInt1025 == 0) {
							local48 -= 4;
							local51 -= 4;
						}
						if (this.anInt1025 == 1) {
							local48 -= 553;
							local51 -= 205;
						}
						if (this.anInt1025 == 2) {
							local48 -= 17;
							local51 -= 357;
						}
						if (local48 < this.anInt1026 - 10 || local48 > this.anInt1026 + this.anInt1028 + 10 || local51 < this.anInt1027 - 10 || local51 > this.anInt1027 + this.anInt1029 + 10) {
							this.aBoolean200 = false;
							if (this.anInt1025 == 1) {
								this.aBoolean194 = true;
							}
							if (this.anInt1025 == 2) {
								this.aBoolean199 = true;
							}
						}
					}
					if (local8 == 1) {
						local48 = this.anInt1026;
						local51 = this.anInt1027;
						local127 = this.anInt1028;
						@Pc(130) int local130 = super.anInt820;
						@Pc(133) int local133 = super.anInt821;
						if (this.anInt1025 == 0) {
							local130 -= 4;
							local133 -= 4;
						}
						if (this.anInt1025 == 1) {
							local130 -= 553;
							local133 -= 205;
						}
						if (this.anInt1025 == 2) {
							local130 -= 17;
							local133 -= 357;
						}
						@Pc(152) int local152 = -1;
						for (@Pc(154) int local154 = 0; local154 < this.anInt885; local154++) {
							@Pc(169) int local169 = local51 + (this.anInt885 - 1 - local154) * 15 + 31;
							if (local130 > local48 && local130 < local48 + local127 && local133 > local169 - 13 && local133 < local169 + 3) {
								local152 = local154;
							}
						}
						if (local152 != -1) {
							this.method692(local152, 688);
						}
						this.aBoolean200 = false;
						if (this.anInt1025 == 1) {
							this.aBoolean194 = true;
						}
						if (this.anInt1025 == 2) {
							this.aBoolean199 = true;
							return;
						}
					}
				} else {
					if (local8 == 1 && this.anInt885 > 0) {
						local48 = this.anIntArray240[this.anInt885 - 1];
						if (local48 == 872 || local48 == 348 || local48 == 881 || local48 == 829 || local48 == 497 || local48 == 176 || local48 == 212 || local48 == 592 || local48 == 635 || local48 == 139 || local48 == 25 || local48 == 1169) {
							local51 = this.anIntArray238[this.anInt885 - 1];
							local127 = this.anIntArray239[this.anInt885 - 1];
							@Pc(288) Class27 local288 = Class27.method339(local127);
							if (local288.aBoolean108 || local288.aBoolean114) {
								this.aBoolean223 = false;
								this.anInt852 = 0;
								this.anInt913 = local127;
								this.anInt914 = local51;
								this.anInt915 = 2;
								this.anInt916 = super.anInt820;
								this.anInt917 = super.anInt821;
								if (Class27.method339(local127).anInt536 == this.anInt935) {
									this.anInt915 = 1;
								}
								if (Class27.method339(local127).anInt536 == this.anInt1054) {
									this.anInt915 = 3;
								}
								return;
							}
						}
					}
					if (local8 == 1 && (this.anInt1050 == 1 || this.method716(this.anInt885 - 1)) && this.anInt885 > 2) {
						local8 = 2;
					}
					if (local8 == 1 && this.anInt885 > 0) {
						this.method692(this.anInt885 - 1, 688);
					}
					if (local8 != 2 || this.anInt885 <= 0) {
						return;
					}
					this.method717();
				}
			}
		} catch (@Pc(381) RuntimeException local381) {
			signlink.reporterror("86753, " + false + ", " + local381.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg4 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg3 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg0;
			@Pc(23) int local23;
			@Pc(27) int local27;
			@Pc(37) int local37;
			if (local5 != 0) {
				local23 = Class1_Sub1_Sub1_Sub4.anIntArray155[local5];
				local27 = Class1_Sub1_Sub1_Sub4.anIntArray156[local5];
				local37 = local27 * 0 - arg0 * local23 >> 16;
				local17 = local23 * 0 + arg0 * local27 >> 16;
				local15 = local37;
			}
			if (local11 != 0) {
				local23 = Class1_Sub1_Sub1_Sub4.anIntArray155[local11];
				local27 = Class1_Sub1_Sub1_Sub4.anIntArray156[local11];
				local37 = local17 * local23 + local27 * 0 >> 16;
				local17 = local17 * local27 - local23 * 0 >> 16;
				local13 = local37;
			}
			this.anInt946 = arg5 - local13;
			this.anInt947 = arg1 - local15;
			this.anInt948 = arg2 - local17;
			if (this.anInt1053 == -33142) {
				this.anInt949 = arg4;
				this.anInt950 = arg3;
			}
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("20300, " + arg0 + ", " + arg1 + ", " + -33142 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
	private void method698() {
		try {
			if (this.anInt915 == 0) {
				this.aStringArray10[0] = "Cancel";
				this.anIntArray240[0] = 1153;
				this.anInt885 = 1;
				if (this.anInt1010 == -1) {
					this.method715();
					this.anInt1004 = 0;
					this.anInt879 = 0;
					if (super.anInt814 > 4 && super.anInt815 > 4 && super.anInt814 < 516 && super.anInt815 < 338) {
						if (this.anInt935 == -1) {
							this.method721(this.anInt1051);
						} else {
							this.method664(0, 4, 0, super.anInt814, 4, super.anInt815, Class27.method339(this.anInt935));
						}
					}
					if (this.anInt1004 != this.anInt882) {
						this.anInt882 = this.anInt1004;
					}
					if (this.anInt879 != this.anInt862) {
						this.anInt862 = this.anInt879;
					}
					this.anInt1004 = 0;
					this.anInt879 = 0;
					if (super.anInt814 > 553 && super.anInt815 > 205 && super.anInt814 < 743 && super.anInt815 < 466) {
						if (this.anInt826 != -1) {
							this.method664(0, 553, 1, super.anInt814, 205, super.anInt815, Class27.method339(this.anInt826));
						} else if (this.anIntArray229[this.anInt959] != -1) {
							this.method664(0, 553, 1, super.anInt814, 205, super.anInt815, Class27.method339(this.anIntArray229[this.anInt959]));
						}
					}
					if (this.anInt1004 != this.anInt861) {
						this.aBoolean194 = true;
						this.anInt861 = this.anInt1004;
					}
					if (this.anInt879 != this.anInt912) {
						this.aBoolean194 = true;
						this.anInt912 = this.anInt879;
					}
					this.anInt1004 = 0;
					this.anInt879 = 0;
					if (super.anInt814 > 17 && super.anInt815 > 357 && super.anInt814 < 496 && super.anInt815 < 453) {
						if (this.anInt1054 != -1) {
							this.method664(0, 17, 2, super.anInt814, 357, super.anInt815, Class27.method339(this.anInt1054));
						} else if (this.anInt1040 != -1) {
							this.method664(0, 17, 3, super.anInt814, 357, super.anInt815, Class27.method339(this.anInt1040));
						} else if (super.anInt815 < 434 && super.anInt814 < 426 && this.anInt1022 == 0) {
							this.method589(super.anInt815 - 357, super.anInt814 - 17);
						}
					}
					if ((this.anInt1054 != -1 || this.anInt1040 != -1) && this.anInt1004 != this.anInt905) {
						this.aBoolean199 = true;
						this.anInt905 = this.anInt1004;
					}
					if ((this.anInt1054 != -1 || this.anInt1040 != -1) && this.anInt879 != this.anInt829) {
						this.aBoolean199 = true;
						this.anInt829 = this.anInt879;
					}
					@Pc(348) boolean local348 = false;
					while (!local348) {
						local348 = true;
						for (@Pc(354) int local354 = 0; local354 < this.anInt885 - 1; local354++) {
							if (this.anIntArray240[local354] < 1000 && this.anIntArray240[local354 + 1] > 1000) {
								@Pc(375) String local375 = this.aStringArray10[local354];
								this.aStringArray10[local354] = this.aStringArray10[local354 + 1];
								this.aStringArray10[local354 + 1] = local375;
								@Pc(397) int local397 = this.anIntArray240[local354];
								this.anIntArray240[local354] = this.anIntArray240[local354 + 1];
								this.anIntArray240[local354 + 1] = local397;
								@Pc(419) int local419 = this.anIntArray238[local354];
								this.anIntArray238[local354] = this.anIntArray238[local354 + 1];
								this.anIntArray238[local354 + 1] = local419;
								@Pc(441) int local441 = this.anIntArray239[local354];
								this.anIntArray239[local354] = this.anIntArray239[local354 + 1];
								this.anIntArray239[local354 + 1] = local441;
								@Pc(463) int local463 = this.anIntArray241[local354];
								this.anIntArray241[local354] = this.anIntArray241[local354 + 1];
								this.anIntArray241[local354 + 1] = local463;
								local348 = false;
							}
						}
					}
				} else {
					this.anInt1004 = 0;
					this.anInt879 = 0;
					this.method664(0, 0, 0, super.anInt814, 0, super.anInt815, Class27.method339(this.anInt1010));
					if (this.anInt1004 != this.anInt882) {
						this.anInt882 = this.anInt1004;
					}
					if (this.anInt879 != this.anInt862) {
						this.anInt862 = this.anInt879;
					}
				}
			}
		} catch (@Pc(493) RuntimeException local493) {
			signlink.reporterror("91995, " + 106 + ", " + local493.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method699() {
		try {
			for (@Pc(3) int local3 = -1; local3 < this.anInt836; local3++) {
				@Pc(11) int local11;
				if (local3 == -1) {
					local11 = this.anInt835;
				} else {
					local11 = this.anIntArray212[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub2 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local11];
				if (local23 != null) {
					this.method592(1, local23);
				}
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("45039, " + -36249 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(Z)V")
	private void method700() {
		try {
			if (this.anInt1034 > 0) {
				this.method647();
			} else {
				this.method648("Please wait - attempting to reestablish", "Connection lost");
				this.anInt864 = 0;
				this.anInt953 = 0;
				@Pc(20) Class43 local20 = this.aClass43_1;
				this.aBoolean188 = false;
				this.anInt1044 = 0;
				this.method669(this.aString27, this.aString28, true);
				if (!this.aBoolean188) {
					this.method647();
				}
				try {
					local20.method545();
				} catch (@Pc(52) Exception local52) {
				}
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("30714, " + false + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ILclient!MVHXDWGI;I)V")
	private void method701(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub4 arg1) {
		try {
			arg1.method304();
			@Pc(10) int local10 = arg1.method305(1);
			if (local10 != 0) {
				@Pc(18) int local18 = arg1.method305(2);
				if (local18 == 0) {
					this.anIntArray213[this.anInt837++] = this.anInt835;
				} else {
					@Pc(41) int local41;
					@Pc(51) int local51;
					if (local18 == 1) {
						local41 = arg1.method305(3);
						aClass1_Sub1_Sub1_Sub1_Sub2_1.method109(local41, false);
						local51 = arg1.method305(1);
						if (local51 == 1) {
							this.anIntArray213[this.anInt837++] = this.anInt835;
						}
					} else {
						@Pc(95) int local95;
						if (local18 == 2) {
							local41 = arg1.method305(3);
							aClass1_Sub1_Sub1_Sub1_Sub2_1.method109(local41, true);
							local51 = arg1.method305(3);
							aClass1_Sub1_Sub1_Sub1_Sub2_1.method109(local51, true);
							local95 = arg1.method305(1);
							if (local95 == 1) {
								this.anIntArray213[this.anInt837++] = this.anInt835;
							}
						} else if (local18 == 3) {
							local41 = arg1.method305(1);
							this.anInt995 = arg1.method305(2);
							local51 = arg1.method305(7);
							local95 = arg1.method305(1);
							if (local95 == 1) {
								this.anIntArray213[this.anInt837++] = this.anInt835;
							}
							@Pc(155) int local155 = arg1.method305(7);
							aClass1_Sub1_Sub1_Sub1_Sub2_1.method113(local155, local41 == 1, local51, this.anInt902);
						}
					}
				}
			}
		} catch (@Pc(169) RuntimeException local169) {
			signlink.reporterror("34252, " + arg0 + ", " + arg1 + ", " + 274 + ", " + local169.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	@Override
	public void method585(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}
		if (signlink.mainapp == null) {
			super.method585(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILjava/lang/String;)V")
	private void method702(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null || arg0.length() == 0) {
				this.anInt890 = 0;
			} else {
				@Pc(12) String local12 = arg0;
				@Pc(21) String[] local21 = new String[100];
				@Pc(23) int local23 = 0;
				while (true) {
					@Pc(27) int local27 = local12.indexOf(" ");
					if (local27 == -1) {
						local12 = local12.trim();
						if (local12.length() > 0) {
							local21[local23++] = local12.toLowerCase();
						}
						this.anInt890 = 0;
						label49: for (local27 = 0; local27 < Class3.anInt134; local27++) {
							@Pc(76) Class3 local76 = Class3.method34(local27);
							if (local76.anInt140 == -1 && local76.aString3 != null) {
								@Pc(87) String local87 = local76.aString3.toLowerCase();
								for (@Pc(89) int local89 = 0; local89 < local23; local89++) {
									if (local87.indexOf(local21[local89]) == -1) {
										continue label49;
									}
								}
								this.aStringArray8[this.anInt890] = local87;
								this.anIntArray221[this.anInt890] = local27;
								this.anInt890++;
								if (this.anInt890 >= this.aStringArray8.length) {
									return;
								}
							}
						}
						return;
					}
					@Pc(36) String local36 = local12.substring(0, local27).trim();
					if (local36.length() > 0) {
						local21[local23++] = local36.toLowerCase();
					}
					local12 = local12.substring(local27 + 1);
				}
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("54403, " + -884 + ", " + arg0 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)Z")
	private boolean method703(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			if (this.aClass43_1 == null) {
				return false;
			}
			@Pc(1787) String local1787;
			@Pc(164) int local164;
			try {
				@Pc(14) int local14 = this.aClass43_1.method547();
				if (local14 == 0) {
					return false;
				}
				if (this.anInt1031 == -1) {
					this.aClass43_1.method548(this.aClass1_Sub1_Sub4_6.aByteArray14, 0, 1);
					this.anInt1031 = this.aClass1_Sub1_Sub4_6.aByteArray14[0] & 0xFF;
					if (this.aClass32_2 != null) {
						this.anInt1031 = this.anInt1031 - this.aClass32_2.method431() & 0xFF;
					}
					this.anInt1030 = Class7.anIntArray41[this.anInt1031];
					local14--;
				}
				if (this.anInt1030 == -1) {
					if (local14 <= 0) {
						return false;
					}
					this.aClass43_1.method548(this.aClass1_Sub1_Sub4_6.aByteArray14, 0, 1);
					this.anInt1030 = this.aClass1_Sub1_Sub4_6.aByteArray14[0] & 0xFF;
					local14--;
				}
				if (this.anInt1030 == -2) {
					if (local14 <= 1) {
						return false;
					}
					this.aClass43_1.method548(this.aClass1_Sub1_Sub4_6.aByteArray14, 0, 2);
					this.aClass1_Sub1_Sub4_6.anInt529 = 0;
					this.anInt1030 = this.aClass1_Sub1_Sub4_6.method296();
					local14 -= 2;
				}
				if (local14 < this.anInt1030) {
					return false;
				}
				this.aClass1_Sub1_Sub4_6.anInt529 = 0;
				this.aClass43_1.method548(this.aClass1_Sub1_Sub4_6.aByteArray14, 0, this.anInt1030);
				this.anInt1032 = 0;
				this.anInt944 = this.anInt943;
				this.anInt943 = this.anInt942;
				this.anInt942 = this.anInt1031;
				@Pc(159) int local159;
				if (this.anInt1031 == 154) {
					local159 = this.aClass1_Sub1_Sub4_6.method321();
					local164 = this.aClass1_Sub1_Sub4_6.method327();
					this.anIntArray237[local159] = local164;
					if (this.anIntArray258[local159] != local164) {
						this.anIntArray258[local159] = local164;
						this.method626(local159);
						this.aBoolean194 = true;
						if (this.anInt1040 != -1) {
							this.aBoolean199 = true;
						}
					}
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 65) {
					this.anInt1046 = this.aClass1_Sub1_Sub4_6.method313();
					this.anInt1047 = this.aClass1_Sub1_Sub4_6.method314();
					for (local159 = this.anInt1046; local159 < this.anInt1046 + 8; local159++) {
						for (local164 = this.anInt1047; local164 < this.anInt1047 + 8; local164++) {
							if (this.aClass16ArrayArrayArray1[this.anInt995][local159][local164] != null) {
								this.aClass16ArrayArrayArray1[this.anInt995][local159][local164] = null;
								this.method693(local159, local164);
							}
						}
					}
					for (@Pc(268) Class1_Sub3 local268 = (Class1_Sub3) this.aClass16_10.method185(); local268 != null; local268 = (Class1_Sub3) this.aClass16_10.method187()) {
						if (local268.anInt797 >= this.anInt1046 && local268.anInt797 < this.anInt1046 + 8 && local268.anInt798 >= this.anInt1047 && local268.anInt798 < this.anInt1047 + 8 && local268.anInt795 == this.anInt995) {
							local268.anInt794 = 0;
						}
					}
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 207) {
					for (local159 = 0; local159 < this.anIntArray258.length; local159++) {
						if (this.anIntArray258[local159] != this.anIntArray237[local159]) {
							this.anIntArray258[local159] = this.anIntArray237[local159];
							this.method626(local159);
							this.aBoolean194 = true;
						}
					}
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 35) {
					local159 = this.aClass1_Sub1_Sub4_6.method296();
					local164 = this.aClass1_Sub1_Sub4_6.method296();
					this.method605(local164);
					if (local159 != -1) {
						this.method605(local159);
					}
					if (this.anInt935 != -1) {
						this.method649(this.anInt935);
						this.anInt935 = -1;
					}
					if (this.anInt826 != -1) {
						this.method649(this.anInt826);
						this.anInt826 = -1;
					}
					if (this.anInt1054 != -1) {
						this.method649(this.anInt1054);
						this.anInt1054 = -1;
					}
					if (this.anInt1010 != local164) {
						this.method649(this.anInt1010);
						this.anInt1010 = local164;
					}
					if (this.anInt979 != local164) {
						this.method649(this.anInt979);
						this.anInt979 = local159;
					}
					this.anInt1022 = 0;
					this.aBoolean189 = false;
					this.anInt1031 = -1;
					return true;
				}
				@Pc(471) int local471;
				if (this.anInt1031 == 115) {
					local159 = this.aClass1_Sub1_Sub4_6.method322();
					local164 = this.aClass1_Sub1_Sub4_6.method322();
					local471 = this.aClass1_Sub1_Sub4_6.method322();
					if (local164 == 65535) {
						Class27.method339(local471).anInt546 = 0;
						this.anInt1031 = -1;
						return true;
					}
					@Pc(486) Class3 local486 = Class3.method34(local164);
					Class27.method339(local471).anInt546 = 4;
					Class27.method339(local471).anInt547 = local164;
					Class27.method339(local471).anInt552 = local486.anInt116;
					Class27.method339(local471).anInt553 = local486.anInt113;
					Class27.method339(local471).anInt551 = local486.anInt141 * 100 / local159;
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 12) {
					this.anInt864 = this.aClass1_Sub1_Sub4_6.method294();
					this.anInt1031 = -1;
					return true;
				}
				@Pc(585) int local585;
				@Pc(589) int local589;
				@Pc(597) int local597;
				@Pc(871) int local871;
				@Pc(892) int local892;
				if (this.anInt1031 == 21 || this.anInt1031 == 15) {
					local159 = this.anInt988;
					local164 = this.anInt989;
					if (this.anInt1031 == 21) {
						local164 = this.aClass1_Sub1_Sub4_6.method320();
						local159 = this.aClass1_Sub1_Sub4_6.method296();
						this.aBoolean217 = false;
					}
					if (this.anInt1031 == 15) {
						local164 = this.aClass1_Sub1_Sub4_6.method322();
						local159 = this.aClass1_Sub1_Sub4_6.method296();
						this.aClass1_Sub1_Sub4_6.method304();
						local471 = 0;
						while (true) {
							if (local471 >= 4) {
								this.aClass1_Sub1_Sub4_6.method306();
								this.aBoolean217 = true;
								break;
							}
							for (local585 = 0; local585 < 13; local585++) {
								for (local589 = 0; local589 < 13; local589++) {
									local597 = this.aClass1_Sub1_Sub4_6.method305(1);
									if (local597 == 1) {
										this.anIntArrayArrayArray7[local471][local585][local589] = this.aClass1_Sub1_Sub4_6.method305(26);
									} else {
										this.anIntArrayArrayArray7[local471][local585][local589] = -1;
									}
								}
							}
							local471++;
						}
					}
					if (this.anInt988 == local159 && this.anInt989 == local164 && this.anInt922 == 2) {
						this.anInt1031 = -1;
						return true;
					}
					this.anInt988 = local159;
					this.anInt989 = local164;
					this.anInt894 = (this.anInt988 - 6) * 8;
					this.anInt895 = (this.anInt989 - 6) * 8;
					this.aBoolean225 = false;
					if ((this.anInt988 / 8 == 48 || this.anInt988 / 8 == 49) && this.anInt989 / 8 == 48) {
						this.aBoolean225 = true;
					}
					if (this.anInt988 / 8 == 48 && this.anInt989 / 8 == 148) {
						this.aBoolean225 = true;
					}
					this.anInt922 = 1;
					this.aLong31 = System.currentTimeMillis();
					this.method648(null, "Loading - please wait.");
					if (this.anInt1031 == 21) {
						local471 = 0;
						local585 = (this.anInt988 - 6) / 8;
						label1189: while (true) {
							if (local585 > (this.anInt988 + 6) / 8) {
								this.aByteArrayArray6 = new byte[local471][];
								this.aByteArrayArray5 = new byte[local471][];
								this.anIntArray216 = new int[local471];
								this.anIntArray217 = new int[local471];
								this.anIntArray218 = new int[local471];
								local471 = 0;
								local589 = (this.anInt988 - 6) / 8;
								while (true) {
									if (local589 > (this.anInt988 + 6) / 8) {
										break label1189;
									}
									for (local597 = (this.anInt989 - 6) / 8; local597 <= (this.anInt989 + 6) / 8; local597++) {
										this.anIntArray216[local471] = (local589 << 8) + local597;
										if (this.aBoolean225 && (local597 == 49 || local597 == 149 || local597 == 147 || local589 == 50 || local589 == 49 && local597 == 47)) {
											this.anIntArray217[local471] = -1;
											this.anIntArray218[local471] = -1;
											local471++;
										} else {
											local871 = this.anIntArray217[local471] = this.aClass28_Sub1_1.method460(0, local589, local597);
											if (local871 != -1) {
												this.aClass28_Sub1_1.method469(3, local871);
											}
											local892 = this.anIntArray218[local471] = this.aClass28_Sub1_1.method460(1, local589, local597);
											if (local892 != -1) {
												this.aClass28_Sub1_1.method469(3, local892);
											}
											local471++;
										}
									}
									local589++;
								}
							}
							for (local589 = (this.anInt989 - 6) / 8; local589 <= (this.anInt989 + 6) / 8; local589++) {
								local471++;
							}
							local585++;
						}
					}
					if (this.anInt1031 == 15) {
						local471 = 0;
						@Pc(928) int[] local928 = new int[676];
						local589 = 0;
						label1148: while (true) {
							@Pc(974) int local974;
							@Pc(958) int local958;
							@Pc(964) int local964;
							if (local589 >= 4) {
								this.aByteArrayArray6 = new byte[local471][];
								this.aByteArrayArray5 = new byte[local471][];
								this.anIntArray216 = new int[local471];
								this.anIntArray217 = new int[local471];
								this.anIntArray218 = new int[local471];
								local597 = 0;
								while (true) {
									if (local597 >= local471) {
										break label1148;
									}
									local871 = this.anIntArray216[local597] = local928[local597];
									local892 = local871 >> 8 & 0xFF;
									local958 = local871 & 0xFF;
									local964 = this.anIntArray217[local597] = this.aClass28_Sub1_1.method460(0, local892, local958);
									if (local964 != -1) {
										this.aClass28_Sub1_1.method469(3, local964);
									}
									local974 = this.anIntArray218[local597] = this.aClass28_Sub1_1.method460(1, local892, local958);
									if (local974 != -1) {
										this.aClass28_Sub1_1.method469(3, local974);
									}
									local597++;
								}
							}
							for (local597 = 0; local597 < 13; local597++) {
								for (local871 = 0; local871 < 13; local871++) {
									local892 = this.anIntArrayArrayArray7[local589][local597][local871];
									if (local892 != -1) {
										local958 = local892 >> 14 & 0x3FF;
										local964 = local892 >> 3 & 0x7FF;
										local974 = (local958 / 8 << 8) + local964 / 8;
										for (@Pc(976) int local976 = 0; local976 < local471; local976++) {
											if (local928[local976] == local974) {
												local974 = -1;
												break;
											}
										}
										if (local974 != -1) {
											local928[local471++] = local974;
										}
									}
								}
							}
							local589++;
						}
					}
					local471 = this.anInt894 - this.anInt896;
					local585 = this.anInt895 - this.anInt897;
					this.anInt896 = this.anInt894;
					this.anInt897 = this.anInt895;
					for (local589 = 0; local589 < 16384; local589++) {
						@Pc(1129) Class1_Sub1_Sub1_Sub1_Sub1 local1129 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local589];
						if (local1129 != null) {
							for (local871 = 0; local871 < 10; local871++) {
								local1129.anIntArray28[local871] -= local471;
								local1129.anIntArray29[local871] -= local585;
							}
							local1129.anInt231 -= local471 * 128;
							local1129.anInt232 -= local585 * 128;
						}
					}
					for (local597 = 0; local597 < this.anInt834; local597++) {
						@Pc(1184) Class1_Sub1_Sub1_Sub1_Sub2 local1184 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local597];
						if (local1184 != null) {
							for (local892 = 0; local892 < 10; local892++) {
								local1184.anIntArray28[local892] -= local471;
								local1184.anIntArray29[local892] -= local585;
							}
							local1184.anInt231 -= local471 * 128;
							local1184.anInt232 -= local585 * 128;
						}
					}
					this.aBoolean192 = true;
					@Pc(1236) byte local1236 = 0;
					@Pc(1238) byte local1238 = 104;
					@Pc(1240) byte local1240 = 1;
					if (local471 < 0) {
						local1236 = 103;
						local1238 = -1;
						local1240 = -1;
					}
					@Pc(1250) byte local1250 = 0;
					@Pc(1252) byte local1252 = 104;
					@Pc(1254) byte local1254 = 1;
					if (local585 < 0) {
						local1250 = 103;
						local1252 = -1;
						local1254 = -1;
					}
					for (@Pc(1264) int local1264 = local1236; local1264 != local1238; local1264 += local1240) {
						for (@Pc(1268) int local1268 = local1250; local1268 != local1252; local1268 += local1254) {
							@Pc(1274) int local1274 = local1264 + local471;
							@Pc(1278) int local1278 = local1268 + local585;
							for (@Pc(1280) int local1280 = 0; local1280 < 4; local1280++) {
								if (local1274 >= 0 && local1278 >= 0 && local1274 < 104 && local1278 < 104) {
									this.aClass16ArrayArrayArray1[local1280][local1264][local1268] = this.aClass16ArrayArrayArray1[local1280][local1274][local1278];
								} else {
									this.aClass16ArrayArrayArray1[local1280][local1264][local1268] = null;
								}
							}
						}
					}
					for (@Pc(1342) Class1_Sub3 local1342 = (Class1_Sub3) this.aClass16_10.method185(); local1342 != null; local1342 = (Class1_Sub3) this.aClass16_10.method187()) {
						local1342.anInt797 -= local471;
						local1342.anInt798 -= local585;
						if (local1342.anInt797 < 0 || local1342.anInt798 < 0 || local1342.anInt797 >= 104 || local1342.anInt798 >= 104) {
							local1342.method560();
						}
					}
					if (this.anInt953 != 0) {
						this.anInt953 -= local471;
						this.anInt954 -= local585;
					}
					this.aBoolean186 = false;
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 218) {
					this.anInt883 = this.aClass1_Sub1_Sub4_6.method328();
					this.anInt969 = this.aClass1_Sub1_Sub4_6.method320();
					this.anInt998 = this.aClass1_Sub1_Sub4_6.method320();
					this.aClass1_Sub1_Sub4_6.method296();
					this.anInt884 = this.aClass1_Sub1_Sub4_6.method296();
					this.anInt889 = this.aClass1_Sub1_Sub4_6.method321();
					this.anInt825 = this.aClass1_Sub1_Sub4_6.method321();
					this.anInt982 = this.aClass1_Sub1_Sub4_6.method320();
					this.aClass1_Sub1_Sub4_6.method313();
					this.anInt940 = this.aClass1_Sub1_Sub4_6.method296();
					this.anInt923 = this.aClass1_Sub1_Sub4_6.method321();
					signlink.dnslookup(Class41.method507(this.anInt883));
					this.anInt1031 = -1;
					return true;
				}
				@Pc(1487) long local1487;
				if (this.anInt1031 == 11) {
					local1487 = this.aClass1_Sub1_Sub4_6.method300();
					local471 = this.aClass1_Sub1_Sub4_6.method294();
					@Pc(1497) String local1497 = Class41.method508(Class41.method505(local1487));
					for (local589 = 0; local589 < this.anInt827; local589++) {
						if (local1487 == this.aLongArray4[local589]) {
							if (this.anIntArray215[local589] != local471) {
								this.anIntArray215[local589] = local471;
								this.aBoolean194 = true;
								if (local471 > 0) {
									this.method639(local1497 + " has logged in.", 5, "");
								}
								if (local471 == 0) {
									this.method639(local1497 + " has logged out.", 5, "");
								}
							}
							local1497 = null;
							break;
						}
					}
					if (local1497 != null && this.anInt827 < 200) {
						this.aLongArray4[this.anInt827] = local1487;
						this.aStringArray12[this.anInt827] = local1497;
						this.anIntArray215[this.anInt827] = local471;
						this.anInt827++;
						this.aBoolean194 = true;
					}
					@Pc(1595) boolean local1595 = false;
					while (!local1595) {
						local1595 = true;
						for (local871 = 0; local871 < this.anInt827 - 1; local871++) {
							if (this.anIntArray215[local871] != anInt955 && this.anIntArray215[local871 + 1] == anInt955 || this.anIntArray215[local871] == 0 && this.anIntArray215[local871 + 1] != 0) {
								local892 = this.anIntArray215[local871];
								this.anIntArray215[local871] = this.anIntArray215[local871 + 1];
								this.anIntArray215[local871 + 1] = local892;
								@Pc(1656) String local1656 = this.aStringArray12[local871];
								this.aStringArray12[local871] = this.aStringArray12[local871 + 1];
								this.aStringArray12[local871 + 1] = local1656;
								@Pc(1678) long local1678 = this.aLongArray4[local871];
								this.aLongArray4[local871] = this.aLongArray4[local871 + 1];
								this.aLongArray4[local871 + 1] = local1678;
								this.aBoolean194 = true;
								local1595 = false;
							}
						}
					}
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 64) {
					local159 = this.aClass1_Sub1_Sub4_6.method296();
					local164 = this.aClass1_Sub1_Sub4_6.method321();
					local471 = this.aClass1_Sub1_Sub4_6.method320();
					local585 = this.aClass1_Sub1_Sub4_6.method296();
					Class27.method339(local159).anInt552 = local585;
					Class27.method339(local159).anInt553 = local471;
					Class27.method339(local159).anInt551 = local164;
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 244) {
					local159 = this.aClass1_Sub1_Sub4_6.method296();
					local164 = this.aClass1_Sub1_Sub4_6.method320();
					Class27.method339(local164).anInt546 = 1;
					Class27.method339(local164).anInt547 = local159;
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 27) {
					local1787 = this.aClass1_Sub1_Sub4_6.method301();
					local164 = this.aClass1_Sub1_Sub4_6.method321();
					Class27.method339(local164).aString10 = local1787;
					@Pc(1804) int local1804 = this.anIntArray229[this.anInt959];
					if (Class27.method339(local164).anInt536 == local1804) {
						this.aBoolean194 = true;
					}
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 204) {
					this.anInt1047 = this.aClass1_Sub1_Sub4_6.method313();
					this.anInt1046 = this.aClass1_Sub1_Sub4_6.method294();
					while (this.aClass1_Sub1_Sub4_6.anInt529 < this.anInt1030) {
						local159 = this.aClass1_Sub1_Sub4_6.method294();
						this.method632(local159, this.aClass1_Sub1_Sub4_6);
					}
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 83) {
					local159 = this.aClass1_Sub1_Sub4_6.method296();
					if (local159 == 65535) {
						local159 = -1;
					}
					if (local159 != this.anInt937 && this.aBoolean210 && !aBoolean205 && this.anInt973 == 0) {
						this.anInt1012 = local159;
						this.aBoolean214 = true;
						this.aClass28_Sub1_1.method469(2, this.anInt1012);
					}
					this.anInt937 = local159;
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 232) {
					local159 = this.aClass1_Sub1_Sub4_6.method296();
					local164 = this.aClass1_Sub1_Sub4_6.method298();
					if (this.aBoolean210 && !aBoolean205) {
						this.anInt1012 = local159;
						this.aBoolean214 = false;
						this.aClass28_Sub1_1.method469(2, this.anInt1012);
						this.anInt973 = local164;
					}
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 138) {
					this.anInt921 = this.aClass1_Sub1_Sub4_6.method294();
					this.anInt892 = this.aClass1_Sub1_Sub4_6.method294();
					this.anInt951 = this.aClass1_Sub1_Sub4_6.method294();
					this.aBoolean213 = true;
					this.aBoolean199 = true;
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 84) {
					local159 = this.aClass1_Sub1_Sub4_6.method320();
					@Pc(1977) byte local1977 = this.aClass1_Sub1_Sub4_6.method316();
					this.anIntArray237[local159] = local1977;
					if (this.anIntArray258[local159] != local1977) {
						this.anIntArray258[local159] = local1977;
						this.method626(local159);
						this.aBoolean194 = true;
						if (this.anInt1040 != -1) {
							this.aBoolean199 = true;
						}
					}
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 136) {
					this.anInt925 = this.aClass1_Sub1_Sub4_6.method294();
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 147) {
					local159 = this.aClass1_Sub1_Sub4_6.method294();
					local164 = this.aClass1_Sub1_Sub4_6.method294();
					local471 = this.aClass1_Sub1_Sub4_6.method294();
					local585 = this.aClass1_Sub1_Sub4_6.method294();
					this.aBooleanArray12[local159] = true;
					this.anIntArray275[local159] = local164;
					this.anIntArray266[local159] = local471;
					this.anIntArray226[local159] = local585;
					this.anIntArray261[local159] = 0;
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 151) {
					this.anInt999 = this.aClass1_Sub1_Sub4_6.method294();
					if (this.anInt999 == this.anInt959) {
						if (this.anInt999 == 3) {
							this.anInt959 = 1;
						} else {
							this.anInt959 = 3;
						}
						this.aBoolean194 = true;
					}
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 24) {
					this.method651(this.aClass1_Sub1_Sub4_6, this.anInt1030);
					this.aBoolean192 = false;
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 165) {
					local159 = this.aClass1_Sub1_Sub4_6.method322();
					this.method605(local159);
					if (this.anInt1054 != -1) {
						this.method649(this.anInt1054);
						this.anInt1054 = -1;
						this.aBoolean199 = true;
					}
					if (this.anInt1010 != -1) {
						this.method649(this.anInt1010);
						this.anInt1010 = -1;
						this.aBoolean197 = true;
					}
					if (this.anInt979 != -1) {
						this.method649(this.anInt979);
						this.anInt979 = -1;
					}
					if (this.anInt935 != -1) {
						this.method649(this.anInt935);
						this.anInt935 = -1;
					}
					if (this.anInt826 != local159) {
						this.method649(this.anInt826);
						this.anInt826 = local159;
					}
					if (this.anInt1022 != 0) {
						this.anInt1022 = 0;
						this.aBoolean199 = true;
					}
					this.aBoolean194 = true;
					this.aBoolean181 = true;
					this.aBoolean189 = false;
					this.anInt1031 = -1;
					return true;
				}
				@Pc(2248) Class27 local2248;
				if (this.anInt1031 == 155) {
					local159 = this.aClass1_Sub1_Sub4_6.method322();
					local164 = this.aClass1_Sub1_Sub4_6.method320();
					local2248 = Class27.method339(local159);
					if (local2248 != null && local2248.anInt571 == 0) {
						if (local164 < 0) {
							local164 = 0;
						}
						if (local164 > local2248.anInt568 - local2248.anInt538) {
							local164 = local2248.anInt568 - local2248.anInt538;
						}
						local2248.anInt570 = local164;
					}
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 30) {
					local159 = this.aClass1_Sub1_Sub4_6.method322();
					local164 = this.aClass1_Sub1_Sub4_6.method322();
					local471 = this.aClass1_Sub1_Sub4_6.method296();
					Class27.method339(local159).anInt554 = (local471 << 16) + local164;
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 215) {
					this.anInt1013 = this.anInt1030 / 8;
					for (local159 = 0; local159 < this.anInt1013; local159++) {
						this.aLongArray3[local159] = this.aClass1_Sub1_Sub4_6.method300();
					}
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 173) {
					this.aBoolean195 = false;
					this.anInt1022 = 1;
					this.aString22 = "";
					this.aBoolean199 = true;
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 198) {
					local159 = this.aClass1_Sub1_Sub4_6.method321();
					this.method605(local159);
					if (this.anInt826 != -1) {
						this.method649(this.anInt826);
						this.anInt826 = -1;
						this.aBoolean194 = true;
						this.aBoolean181 = true;
					}
					if (this.anInt1010 != -1) {
						this.method649(this.anInt1010);
						this.anInt1010 = -1;
						this.aBoolean197 = true;
					}
					if (this.anInt979 != -1) {
						this.method649(this.anInt979);
						this.anInt979 = -1;
					}
					if (this.anInt935 != -1) {
						this.method649(this.anInt935);
						this.anInt935 = -1;
					}
					if (this.anInt1054 != local159) {
						this.method649(this.anInt1054);
						this.anInt1054 = local159;
					}
					this.aBoolean189 = false;
					this.aBoolean199 = true;
					this.anInt1031 = -1;
					return true;
				}
				@Pc(2467) String local2467;
				if (this.anInt1031 == 253) {
					local159 = this.aClass1_Sub1_Sub4_6.method294();
					local2467 = this.aClass1_Sub1_Sub4_6.method301();
					local471 = this.aClass1_Sub1_Sub4_6.method313();
					if (local159 >= 1 && local159 <= 5) {
						if (local2467.equalsIgnoreCase("null")) {
							local2467 = null;
						}
						this.aStringArray9[local159 - 1] = local2467;
						this.aBooleanArray11[local159 - 1] = local471 == 0;
					}
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 122) {
					this.anInt953 = 0;
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 199) {
					this.anInt1015 = this.aClass1_Sub1_Sub4_6.method322() * 30;
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 61) {
					this.anInt1047 = this.aClass1_Sub1_Sub4_6.method314();
					this.anInt1046 = this.aClass1_Sub1_Sub4_6.method313();
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 87) {
					local159 = this.aClass1_Sub1_Sub4_6.method322();
					this.method605(local159);
					if (this.anInt826 != -1) {
						this.method649(this.anInt826);
						this.anInt826 = -1;
						this.aBoolean194 = true;
						this.aBoolean181 = true;
					}
					if (this.anInt1054 != -1) {
						this.method649(this.anInt1054);
						this.anInt1054 = -1;
						this.aBoolean199 = true;
					}
					if (this.anInt1010 != -1) {
						this.method649(this.anInt1010);
						this.anInt1010 = -1;
						this.aBoolean197 = true;
					}
					if (this.anInt979 != -1) {
						this.method649(this.anInt979);
						this.anInt979 = -1;
					}
					if (this.anInt935 != local159) {
						this.method649(this.anInt935);
						this.anInt935 = local159;
					}
					if (this.anInt1022 != 0) {
						this.anInt1022 = 0;
						this.aBoolean199 = true;
					}
					this.aBoolean189 = false;
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 123) {
					local159 = this.aClass1_Sub1_Sub4_6.method296();
					local164 = this.aClass1_Sub1_Sub4_6.method294();
					local471 = this.aClass1_Sub1_Sub4_6.method296();
					if (local471 == 65535) {
						if (this.anInt924 < 50) {
							this.anIntArray232[this.anInt924] = (short) local159;
							this.anIntArray234[this.anInt924] = local164;
							this.anIntArray233[this.anInt924] = 0;
							this.anInt924++;
						}
					} else if (this.aBoolean187 && !aBoolean205 && this.anInt924 < 50) {
						this.anIntArray232[this.anInt924] = local159;
						this.anIntArray234[this.anInt924] = local164;
						this.anIntArray233[this.anInt924] = local471 + Class45.anIntArray203[local159];
						this.anInt924++;
					}
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 239) {
					local159 = this.aClass1_Sub1_Sub4_6.method322();
					local164 = this.aClass1_Sub1_Sub4_6.method322();
					Class27.method339(local164).anInt546 = 2;
					Class27.method339(local164).anInt547 = local159;
					this.anInt1031 = -1;
					return true;
				}
				@Pc(2792) Class27 local2792;
				if (this.anInt1031 == 134) {
					this.aBoolean194 = true;
					local159 = this.aClass1_Sub1_Sub4_6.method296();
					local2792 = Class27.method339(local159);
					local471 = this.aClass1_Sub1_Sub4_6.method296();
					for (local585 = 0; local585 < local471; local585++) {
						local589 = this.aClass1_Sub1_Sub4_6.method294();
						if (local589 == 255) {
							local589 = this.aClass1_Sub1_Sub4_6.method299();
						}
						local2792.anIntArray110[local585] = this.aClass1_Sub1_Sub4_6.method296();
						local2792.anIntArray112[local585] = local589;
					}
					for (local589 = local471; local589 < local2792.anIntArray110.length; local589++) {
						local2792.anIntArray110[local589] = 0;
						local2792.anIntArray112[local589] = 0;
					}
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 20) {
					this.method647();
					this.anInt1031 = -1;
					return false;
				}
				if (this.anInt1031 == 51) {
					this.anInt828 = this.aClass1_Sub1_Sub4_6.method294();
					this.aBoolean194 = true;
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 163) {
					if (this.anInt959 == 12) {
						this.aBoolean194 = true;
					}
					this.anInt898 = this.aClass1_Sub1_Sub4_6.method297();
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 29) {
					this.aBoolean194 = true;
					local159 = this.aClass1_Sub1_Sub4_6.method296();
					local2792 = Class27.method339(local159);
					while (this.aClass1_Sub1_Sub4_6.anInt529 < this.anInt1030) {
						local471 = this.aClass1_Sub1_Sub4_6.method308();
						local585 = this.aClass1_Sub1_Sub4_6.method296();
						local589 = this.aClass1_Sub1_Sub4_6.method294();
						if (local589 == 255) {
							local589 = this.aClass1_Sub1_Sub4_6.method299();
						}
						if (local471 >= 0 && local471 < local2792.anIntArray110.length) {
							local2792.anIntArray110[local471] = local585;
							local2792.anIntArray112[local471] = local589;
						}
					}
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 34) {
					this.aBoolean195 = false;
					this.anInt1022 = 2;
					this.aString22 = "";
					this.aBoolean199 = true;
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 216) {
					this.method682(this.anInt1030, this.aClass1_Sub1_Sub4_6);
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 25) {
					local159 = this.aClass1_Sub1_Sub4_6.method297();
					local164 = this.aClass1_Sub1_Sub4_6.method324(this.anInt966);
					local471 = this.aClass1_Sub1_Sub4_6.method320();
					@Pc(3024) Class27 local3024 = Class27.method339(local471);
					local3024.anInt562 = local159;
					local3024.anInt544 = local164;
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 139) {
					local159 = this.aClass1_Sub1_Sub4_6.method297();
					if (local159 != this.anInt1040) {
						this.method649(this.anInt1040);
						this.anInt1040 = local159;
					}
					this.aBoolean199 = true;
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 110) {
					this.aBoolean186 = false;
					for (local159 = 0; local159 < 5; local159++) {
						this.aBooleanArray12[local159] = false;
					}
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 158) {
					local159 = this.aClass1_Sub1_Sub4_6.method320();
					@Pc(3107) boolean local3107 = this.aClass1_Sub1_Sub4_6.method312(964) == 1;
					Class27.method339(local159).aBoolean115 = local3107;
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 91) {
					local159 = this.aClass1_Sub1_Sub4_6.method321();
					local164 = this.aClass1_Sub1_Sub4_6.method323();
					local2248 = Class27.method339(local159);
					if (local2248.anInt556 != local164 || local164 == -1) {
						local2248.anInt556 = local164;
						local2248.anInt555 = 0;
						local2248.anInt573 = 0;
					}
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 228) {
					if (this.anInt826 != -1) {
						this.method649(this.anInt826);
						this.anInt826 = -1;
						this.aBoolean194 = true;
						this.aBoolean181 = true;
					}
					if (this.anInt1054 != -1) {
						this.method649(this.anInt1054);
						this.anInt1054 = -1;
						this.aBoolean199 = true;
					}
					if (this.anInt1010 != -1) {
						this.method649(this.anInt1010);
						this.anInt1010 = -1;
						this.aBoolean197 = true;
					}
					if (this.anInt979 != -1) {
						this.method649(this.anInt979);
						this.anInt979 = -1;
					}
					if (this.anInt935 != -1) {
						this.method649(this.anInt935);
						this.anInt935 = -1;
					}
					if (this.anInt1022 != 0) {
						this.anInt1022 = 0;
						this.aBoolean199 = true;
					}
					this.aBoolean189 = false;
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 76) {
					for (local159 = 0; local159 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length; local159++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local159] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local159].anInt226 = -1;
						}
					}
					for (local164 = 0; local164 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length; local164++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local164] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local164].anInt226 = -1;
						}
					}
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 182) {
					local159 = this.aClass1_Sub1_Sub4_6.method320();
					local164 = this.aClass1_Sub1_Sub4_6.method320();
					local471 = local159 >> 10 & 0x1F;
					local585 = local159 >> 5 & 0x1F;
					local589 = local159 & 0x1F;
					Class27.method339(local164).anInt558 = (local471 << 19) + (local585 << 11) + (local589 << 3);
					this.anInt1031 = -1;
					return true;
				}
				@Pc(3366) boolean local3366;
				@Pc(3435) String local3435;
				if (this.anInt1031 == 99) {
					local1487 = this.aClass1_Sub1_Sub4_6.method300();
					local471 = this.aClass1_Sub1_Sub4_6.method299();
					local585 = this.aClass1_Sub1_Sub4_6.method294();
					local3366 = false;
					for (local597 = 0; local597 < 100; local597++) {
						if (this.anIntArray260[local597] == local471) {
							local3366 = true;
							break;
						}
					}
					if (local585 <= 1) {
						for (local871 = 0; local871 < this.anInt1013; local871++) {
							if (this.aLongArray3[local871] == local1487) {
								local3366 = true;
								break;
							}
						}
					}
					if (!local3366 && this.anInt918 == 0) {
						try {
							this.anIntArray260[this.anInt1052] = local471;
							this.anInt1052 = (this.anInt1052 + 1) % 100;
							local3435 = Class37.method447(this.anInt1030 - 13, this.aClass1_Sub1_Sub4_6);
							if (local585 != 3) {
								local3435 = Class29.method399(local3435);
							}
							if (local585 == 2 || local585 == 3) {
								this.method639(local3435, 7, "@cr2@" + Class41.method508(Class41.method505(local1487)));
							} else if (local585 == 1) {
								this.method639(local3435, 7, "@cr1@" + Class41.method508(Class41.method505(local1487)));
							} else {
								this.method639(local3435, 3, Class41.method508(Class41.method505(local1487)));
							}
						} catch (@Pc(3499) Exception local3499) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 191) {
					this.anInt959 = this.aClass1_Sub1_Sub4_6.method313();
					this.aBoolean194 = true;
					this.aBoolean181 = true;
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 161) {
					local1787 = this.aClass1_Sub1_Sub4_6.method301();
					@Pc(3550) long local3550;
					if (local1787.endsWith(":tradereq:")) {
						local2467 = local1787.substring(0, local1787.indexOf(":"));
						local3550 = Class41.method504(local2467);
						local3366 = false;
						for (local597 = 0; local597 < this.anInt1013; local597++) {
							if (this.aLongArray3[local597] == local3550) {
								local3366 = true;
								break;
							}
						}
						if (!local3366 && this.anInt918 == 0) {
							this.method639("wishes to trade with you.", 4, local2467);
						}
					} else if (local1787.endsWith(":duelreq:")) {
						local2467 = local1787.substring(0, local1787.indexOf(":"));
						local3550 = Class41.method504(local2467);
						local3366 = false;
						for (local597 = 0; local597 < this.anInt1013; local597++) {
							if (this.aLongArray3[local597] == local3550) {
								local3366 = true;
								break;
							}
						}
						if (!local3366 && this.anInt918 == 0) {
							this.method639("wishes to duel with you.", 8, local2467);
						}
					} else if (local1787.endsWith(":chalreq:")) {
						local2467 = local1787.substring(0, local1787.indexOf(":"));
						local3550 = Class41.method504(local2467);
						local3366 = false;
						for (local597 = 0; local597 < this.anInt1013; local597++) {
							if (this.aLongArray3[local597] == local3550) {
								local3366 = true;
								break;
							}
						}
						if (!local3366 && this.anInt918 == 0) {
							local3435 = local1787.substring(local1787.indexOf(":") + 1, local1787.length() - 9);
							this.method639(local3435, 8, local2467);
						}
					} else {
						this.method639(local1787, 0, "");
					}
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 242) {
					local159 = this.aClass1_Sub1_Sub4_6.method321();
					local164 = this.aClass1_Sub1_Sub4_6.method320();
					if (this.anInt1054 != -1) {
						this.method649(this.anInt1054);
						this.anInt1054 = -1;
						this.aBoolean199 = true;
					}
					if (this.anInt1010 != -1) {
						this.method649(this.anInt1010);
						this.anInt1010 = -1;
						this.aBoolean197 = true;
					}
					if (this.anInt979 != -1) {
						this.method649(this.anInt979);
						this.anInt979 = -1;
					}
					if (this.anInt935 != local164) {
						this.method649(this.anInt935);
						this.anInt935 = local164;
					}
					if (this.anInt826 != local159) {
						this.method649(this.anInt826);
						this.anInt826 = local159;
					}
					if (this.anInt1022 != 0) {
						this.anInt1022 = 0;
						this.aBoolean199 = true;
					}
					this.aBoolean194 = true;
					this.aBoolean181 = true;
					this.aBoolean189 = false;
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 92) {
					local159 = this.aClass1_Sub1_Sub4_6.method320();
					local164 = this.aClass1_Sub1_Sub4_6.method312(964);
					if (local159 == 65535) {
						local159 = -1;
					}
					if (this.anIntArray229[local164] != local159) {
						this.method649(this.anIntArray229[local164]);
						this.anIntArray229[local164] = local159;
					}
					this.aBoolean194 = true;
					this.aBoolean181 = true;
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 214) {
					this.aBoolean186 = true;
					this.anInt1017 = this.aClass1_Sub1_Sub4_6.method294();
					this.anInt1018 = this.aClass1_Sub1_Sub4_6.method294();
					this.anInt1019 = this.aClass1_Sub1_Sub4_6.method296();
					this.anInt1020 = this.aClass1_Sub1_Sub4_6.method294();
					this.anInt1021 = this.aClass1_Sub1_Sub4_6.method294();
					if (this.anInt1021 >= 100) {
						local159 = this.anInt1017 * 128 + 64;
						local164 = this.anInt1018 * 128 + 64;
						local471 = this.method607(local164, local159, this.anInt995) - this.anInt1019;
						local585 = local159 - this.anInt946;
						local589 = local471 - this.anInt947;
						local597 = local164 - this.anInt948;
						local871 = (int) Math.sqrt((double) (local585 * local585 + local597 * local597));
						this.anInt949 = (int) (Math.atan2((double) local589, (double) local871) * 325.949D) & 0x7FF;
						this.anInt950 = (int) (Math.atan2((double) local585, (double) local597) * -325.949D) & 0x7FF;
						if (this.anInt949 < 128) {
							this.anInt949 = 128;
						}
						if (this.anInt949 > 383) {
							this.anInt949 = 383;
						}
					}
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 221) {
					this.aBoolean194 = true;
					local159 = this.aClass1_Sub1_Sub4_6.method313();
					local164 = this.aClass1_Sub1_Sub4_6.method312(964);
					local471 = this.aClass1_Sub1_Sub4_6.method326(34);
					this.anIntArray214[local159] = local471;
					this.anIntArray265[local159] = local164;
					this.anIntArray264[local159] = 1;
					for (local585 = 0; local585 < 98; local585++) {
						if (local471 >= anIntArray235[local585]) {
							this.anIntArray264[local159] = local585 + 2;
						}
					}
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 130) {
					local159 = this.aClass1_Sub1_Sub4_6.method320();
					Class27.method339(local159).anInt546 = 3;
					if (aClass1_Sub1_Sub1_Sub1_Sub2_1.aClass21_2 == null) {
						Class27.method339(local159).anInt547 = (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray31[0] << 25) + (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray31[4] << 20) + (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray30[0] << 15) + (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray30[8] << 10) + (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray30[11] << 5) + aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray30[1];
					} else {
						Class27.method339(local159).anInt547 = (int) (aClass1_Sub1_Sub1_Sub1_Sub2_1.aClass21_2.aLong16 + 305419896L);
					}
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 143 || this.anInt1031 == 93 || this.anInt1031 == 137 || this.anInt1031 == 247 || this.anInt1031 == 4 || this.anInt1031 == 235 || this.anInt1031 == 179 || this.anInt1031 == 101 || this.anInt1031 == 94 || this.anInt1031 == 23 || this.anInt1031 == 243) {
					this.method632(this.anInt1031, this.aClass1_Sub1_Sub4_6);
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 230) {
					this.anInt1023 = this.aClass1_Sub1_Sub4_6.method294();
					if (this.anInt1023 == 1) {
						this.anInt1003 = this.aClass1_Sub1_Sub4_6.method296();
					}
					if (this.anInt1023 >= 2 && this.anInt1023 <= 6) {
						if (this.anInt1023 == 2) {
							this.anInt850 = 64;
							this.anInt851 = 64;
						}
						if (this.anInt1023 == 3) {
							this.anInt850 = 0;
							this.anInt851 = 64;
						}
						if (this.anInt1023 == 4) {
							this.anInt850 = 128;
							this.anInt851 = 64;
						}
						if (this.anInt1023 == 5) {
							this.anInt850 = 64;
							this.anInt851 = 0;
						}
						if (this.anInt1023 == 6) {
							this.anInt850 = 64;
							this.anInt851 = 128;
						}
						this.anInt1023 = 2;
						this.anInt847 = this.aClass1_Sub1_Sub4_6.method296();
						this.anInt848 = this.aClass1_Sub1_Sub4_6.method296();
						this.anInt849 = this.aClass1_Sub1_Sub4_6.method294();
					}
					if (this.anInt1023 == 10) {
						this.anInt993 = this.aClass1_Sub1_Sub4_6.method296();
					}
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 164) {
					local159 = this.aClass1_Sub1_Sub4_6.method296();
					local2792 = Class27.method339(local159);
					for (local471 = 0; local471 < local2792.anIntArray110.length; local471++) {
						local2792.anIntArray110[local471] = -1;
						local2792.anIntArray110[local471] = 0;
					}
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 251) {
					local159 = this.aClass1_Sub1_Sub4_6.method323();
					if (local159 >= 0) {
						this.method605(local159);
					}
					if (local159 != this.anInt867) {
						this.method649(this.anInt867);
						this.anInt867 = local159;
					}
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 55) {
					this.anInt900 = this.aClass1_Sub1_Sub4_6.method314();
					this.anInt992 = this.aClass1_Sub1_Sub4_6.method322();
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 203) {
					if (this.anInt959 == 12) {
						this.aBoolean194 = true;
					}
					this.anInt1011 = this.aClass1_Sub1_Sub4_6.method294();
					this.anInt1031 = -1;
					return true;
				}
				if (this.anInt1031 == 103) {
					this.aBoolean186 = true;
					this.anInt853 = this.aClass1_Sub1_Sub4_6.method294();
					this.anInt854 = this.aClass1_Sub1_Sub4_6.method294();
					this.anInt855 = this.aClass1_Sub1_Sub4_6.method296();
					this.anInt856 = this.aClass1_Sub1_Sub4_6.method294();
					this.anInt857 = this.aClass1_Sub1_Sub4_6.method294();
					if (this.anInt857 >= 100) {
						this.anInt946 = this.anInt853 * 128 + 64;
						this.anInt948 = this.anInt854 * 128 + 64;
						this.anInt947 = this.method607(this.anInt948, this.anInt946, this.anInt995) - this.anInt855;
					}
					this.anInt1031 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt1031 + "," + this.anInt1030 + " - " + this.anInt943 + "," + this.anInt944);
				this.method647();
			} catch (@Pc(4497) IOException local4497) {
				this.method700();
			} catch (@Pc(4502) Exception local4502) {
				local1787 = "T2 - " + this.anInt1031 + "," + this.anInt943 + "," + this.anInt944 + " - " + this.anInt1030 + "," + (this.anInt894 + aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray28[0]) + "," + (this.anInt895 + aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray29[0]) + " - ";
				for (local164 = 0; local164 < this.anInt1030 && local164 < 50; local164++) {
					local1787 = local1787 + this.aClass1_Sub1_Sub4_6.aByteArray14[local164] + ",";
				}
				signlink.reporterror(local1787);
				this.method647();
			}
			return true;
		} catch (@Pc(4583) RuntimeException local4583) {
			signlink.reporterror("24489, " + arg0 + ", " + local4583.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(Z)V")
	private void method704() {
		try {
			this.anInt1001 = 0;
			@Pc(73) int local73;
			for (@Pc(9) int local9 = -1; local9 < this.anInt836 + this.anInt1045; local9++) {
				@Pc(16) Class1_Sub1_Sub1_Sub1 local16;
				if (local9 == -1) {
					local16 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
				} else if (local9 < this.anInt836) {
					local16 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray212[local9]];
				} else {
					local16 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray274[local9 - this.anInt836]];
				}
				if (local16 != null && local16.method112((byte) 9)) {
					@Pc(57) Class21 local57;
					if (local16 instanceof Class1_Sub1_Sub1_Sub1_Sub1) {
						local57 = ((Class1_Sub1_Sub1_Sub1_Sub1) local16).aClass21_1;
						if (local57.anIntArray86 != null) {
							local57 = local57.method251();
						}
						if (local57 == null) {
							continue;
						}
					}
					if (local9 >= this.anInt836) {
						local57 = ((Class1_Sub1_Sub1_Sub1_Sub1) local16).aClass21_1;
						if (local57.anInt423 >= 0 && local57.anInt423 < this.aClass1_Sub1_Sub2_Sub3Array4.length) {
							this.method685(local16.anInt194 + 15, local16, (byte) 1);
							if (this.anInt1037 > -1) {
								this.aClass1_Sub1_Sub2_Sub3Array4[local57.anInt423].method172(this.anInt1037 - 12, this.anInt1038 - 30);
							}
						}
						if (this.anInt1023 == 1 && this.anInt1003 == this.anIntArray274[local9 - this.anInt836] && anInt1007 % 20 < 10) {
							this.method685(local16.anInt194 + 15, local16, (byte) 1);
							if (this.anInt1037 > -1) {
								this.aClass1_Sub1_Sub2_Sub3Array7[0].method172(this.anInt1037 - 12, this.anInt1038 - 28);
							}
						}
					} else {
						local73 = 30;
						@Pc(76) Class1_Sub1_Sub1_Sub1_Sub2 local76 = (Class1_Sub1_Sub1_Sub1_Sub2) local16;
						if (local76.anInt241 != -1 || local76.anInt244 != -1) {
							this.method685(local16.anInt194 + 15, local16, (byte) 1);
							if (this.anInt1037 > -1) {
								if (local76.anInt241 != -1) {
									this.aClass1_Sub1_Sub2_Sub3Array8[local76.anInt241].method172(this.anInt1037 - 12, this.anInt1038 - 30);
									local73 += 25;
								}
								if (local76.anInt244 != -1) {
									this.aClass1_Sub1_Sub2_Sub3Array4[local76.anInt244].method172(this.anInt1037 - 12, this.anInt1038 - local73);
									local73 += 25;
								}
							}
						}
						if (local9 >= 0 && this.anInt1023 == 10 && this.anInt993 == this.anIntArray212[local9]) {
							this.method685(local16.anInt194 + 15, local16, (byte) 1);
							if (this.anInt1037 > -1) {
								this.aClass1_Sub1_Sub2_Sub3Array7[1].method172(this.anInt1037 - 12, this.anInt1038 - local73);
							}
						}
					}
					if (local16.aString4 != null && (local9 >= this.anInt836 || this.anInt921 == 0 || this.anInt921 == 3 || this.anInt921 == 1 && this.method612(((Class1_Sub1_Sub1_Sub1_Sub2) local16).aString5))) {
						this.method685(local16.anInt194, local16, (byte) 1);
						if (this.anInt1037 > -1 && this.anInt1001 < this.anInt1002) {
							this.anIntArray246[this.anInt1001] = this.aClass1_Sub1_Sub2_Sub1_4.method72(local16.aString4) / 2;
							this.anIntArray245[this.anInt1001] = this.aClass1_Sub1_Sub2_Sub1_4.anInt170;
							this.anIntArray243[this.anInt1001] = this.anInt1037;
							this.anIntArray244[this.anInt1001] = this.anInt1038;
							this.anIntArray247[this.anInt1001] = local16.anInt195;
							this.anIntArray248[this.anInt1001] = local16.anInt196;
							this.anIntArray249[this.anInt1001] = local16.anInt240;
							this.aStringArray11[this.anInt1001++] = local16.aString4;
							if (this.anInt962 == 0 && local16.anInt196 >= 1 && local16.anInt196 <= 3) {
								this.anIntArray245[this.anInt1001] += 10;
								this.anIntArray244[this.anInt1001] += 5;
							}
							if (this.anInt962 == 0 && local16.anInt196 == 4) {
								this.anIntArray246[this.anInt1001] = 60;
							}
							if (this.anInt962 == 0 && local16.anInt196 == 5) {
								this.anIntArray245[this.anInt1001] += 5;
							}
						}
					}
					if (local16.anInt223 > anInt1007) {
						this.method685(local16.anInt194 + 15, local16, (byte) 1);
						if (this.anInt1037 > -1) {
							local73 = local16.anInt224 * 30 / local16.anInt225;
							if (local73 > 30) {
								local73 = 30;
							}
							Class1_Sub1_Sub2.method517(65280, 5, this.anInt1037 - 15, this.anInt1038 - 3, local73);
							Class1_Sub1_Sub2.method517(16711680, 5, this.anInt1037 + local73 - 15, this.anInt1038 - 3, 30 - local73);
						}
					}
					for (local73 = 0; local73 < 4; local73++) {
						if (local16.anIntArray27[local73] > anInt1007) {
							this.method685(local16.anInt194 / 2, local16, (byte) 1);
							if (this.anInt1037 > -1) {
								if (local73 == 1) {
									this.anInt1038 -= 20;
								}
								if (local73 == 2) {
									this.anInt1037 -= 15;
									this.anInt1038 -= 10;
								}
								if (local73 == 3) {
									this.anInt1037 += 15;
									this.anInt1038 -= 10;
								}
								this.aClass1_Sub1_Sub2_Sub3Array6[local16.anIntArray26[local73]].method172(this.anInt1037 - 12, this.anInt1038 - 12);
								this.aClass1_Sub1_Sub2_Sub1_2.method69(0, String.valueOf(local16.anIntArray25[local73]), this.anInt1038 + 4, this.anInt1037);
								this.aClass1_Sub1_Sub2_Sub1_2.method69(16777215, String.valueOf(local16.anIntArray25[local73]), this.anInt1038 + 3, this.anInt1037 - 1);
							}
						}
					}
				}
			}
			for (@Pc(613) int local613 = 0; local613 < this.anInt1001; local613++) {
				local73 = this.anIntArray243[local613];
				@Pc(625) int local625 = this.anIntArray244[local613];
				@Pc(630) int local630 = this.anIntArray246[local613];
				@Pc(635) int local635 = this.anIntArray245[local613];
				@Pc(637) boolean local637 = true;
				while (local637) {
					local637 = false;
					for (@Pc(643) int local643 = 0; local643 < local613; local643++) {
						if (local625 + 2 > this.anIntArray244[local643] - this.anIntArray245[local643] && local625 - local635 < this.anIntArray244[local643] + 2 && local73 - local630 < this.anIntArray243[local643] + this.anIntArray246[local643] && local73 + local630 > this.anIntArray243[local643] - this.anIntArray246[local643] && this.anIntArray244[local643] - this.anIntArray245[local643] < local625) {
							local625 = this.anIntArray244[local643] - this.anIntArray245[local643];
							local637 = true;
						}
					}
				}
				this.anInt1037 = this.anIntArray243[local613];
				this.anInt1038 = this.anIntArray244[local613] = local625;
				@Pc(742) String local742 = this.aStringArray11[local613];
				if (this.anInt962 == 0) {
					@Pc(747) int local747 = 16776960;
					if (this.anIntArray247[local613] < 6) {
						local747 = this.anIntArray220[this.anIntArray247[local613]];
					}
					if (this.anIntArray247[local613] == 6) {
						local747 = this.anInt840 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray247[local613] == 7) {
						local747 = this.anInt840 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray247[local613] == 8) {
						local747 = this.anInt840 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(822) int local822;
					if (this.anIntArray247[local613] == 9) {
						local822 = 150 - this.anIntArray249[local613];
						if (local822 < 50) {
							local747 = local822 * 1280 + 16711680;
						} else if (local822 < 100) {
							local747 = 16776960 - (local822 - 50) * 327680;
						} else if (local822 < 150) {
							local747 = (local822 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray247[local613] == 10) {
						local822 = 150 - this.anIntArray249[local613];
						if (local822 < 50) {
							local747 = local822 * 5 + 16711680;
						} else if (local822 < 100) {
							local747 = 16711935 - (local822 - 50) * 327680;
						} else if (local822 < 150) {
							local747 = (local822 - 100) * 327680 + 255 - (local822 - 100) * 5;
						}
					}
					if (this.anIntArray247[local613] == 11) {
						local822 = 150 - this.anIntArray249[local613];
						if (local822 < 50) {
							local747 = 16777215 - local822 * 327685;
						} else if (local822 < 100) {
							local747 = (local822 - 50) * 327685 + 65280;
						} else if (local822 < 150) {
							local747 = 16777215 - (local822 - 100) * 327680;
						}
					}
					if (this.anIntArray248[local613] == 0) {
						this.aClass1_Sub1_Sub2_Sub1_4.method69(0, local742, this.anInt1038 + 1, this.anInt1037);
						this.aClass1_Sub1_Sub2_Sub1_4.method69(local747, local742, this.anInt1038, this.anInt1037);
					}
					if (this.anIntArray248[local613] == 1) {
						this.aClass1_Sub1_Sub2_Sub1_4.method74(this.anInt1037, local742, 0, this.anInt927, this.anInt1038 + 1, this.anInt840);
						this.aClass1_Sub1_Sub2_Sub1_4.method74(this.anInt1037, local742, local747, this.anInt927, this.anInt1038, this.anInt840);
					}
					if (this.anIntArray248[local613] == 2) {
						this.aClass1_Sub1_Sub2_Sub1_4.method75(this.aByte30, this.anInt840, this.anInt1038 + 1, this.anInt1037, 0, local742);
						this.aClass1_Sub1_Sub2_Sub1_4.method75(this.aByte30, this.anInt840, this.anInt1038, this.anInt1037, local747, local742);
					}
					if (this.anIntArray248[local613] == 3) {
						this.aClass1_Sub1_Sub2_Sub1_4.method76(this.anInt1038 + 1, this.aBoolean201, this.anInt1037, this.anInt840, 150 - this.anIntArray249[local613], local742, 0);
						this.aClass1_Sub1_Sub2_Sub1_4.method76(this.anInt1038, this.aBoolean201, this.anInt1037, this.anInt840, 150 - this.anIntArray249[local613], local742, local747);
					}
					@Pc(1125) int local1125;
					if (this.anIntArray248[local613] == 4) {
						local822 = this.aClass1_Sub1_Sub2_Sub1_4.method72(local742);
						local1125 = (150 - this.anIntArray249[local613]) * (local822 + 100) / 150;
						Class1_Sub1_Sub2.method514(0, this.anInt1037 - 50, 334, this.anInt1037 + 50);
						this.aClass1_Sub1_Sub2_Sub1_4.method73((byte) 6, this.anInt1038 + 1, local742, this.anInt1037 + 50 - local1125, 0);
						this.aClass1_Sub1_Sub2_Sub1_4.method73((byte) 6, this.anInt1038, local742, this.anInt1037 + 50 - local1125, local747);
						Class1_Sub1_Sub2.method513();
					}
					if (this.anIntArray248[local613] == 5) {
						local822 = 150 - this.anIntArray249[local613];
						local1125 = 0;
						if (local822 < 25) {
							local1125 = local822 - 25;
						} else if (local822 > 125) {
							local1125 = local822 - 125;
						}
						Class1_Sub1_Sub2.method514(this.anInt1038 - this.aClass1_Sub1_Sub2_Sub1_4.anInt170 - 1, 0, this.anInt1038 + 5, 512);
						this.aClass1_Sub1_Sub2_Sub1_4.method69(0, local742, this.anInt1038 + local1125 + 1, this.anInt1037);
						this.aClass1_Sub1_Sub2_Sub1_4.method69(local747, local742, this.anInt1038 + local1125, this.anInt1037);
						Class1_Sub1_Sub2.method513();
					}
				} else {
					this.aClass1_Sub1_Sub2_Sub1_4.method69(0, local742, this.anInt1038 + 1, this.anInt1037);
					this.aClass1_Sub1_Sub2_Sub1_4.method69(16776960, local742, this.anInt1038, this.anInt1037);
				}
			}
		} catch (@Pc(1275) RuntimeException local1275) {
			signlink.reporterror("7714, " + false + ", " + local1275.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
	private void method705() {
		try {
			this.anInt918 = 0;
			@Pc(14) int local14 = (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt231 >> 7) + this.anInt894;
			@Pc(22) int local22 = (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt232 >> 7) + this.anInt895;
			if (local14 >= 3053 && local14 <= 3156 && local22 >= 3056 && local22 <= 3136) {
				this.anInt918 = 1;
			}
			if (local14 >= 3072 && local14 <= 3118 && local22 >= 9492 && local22 <= 9535) {
				this.anInt918 = 1;
			}
			if (this.anInt918 == 1 && local14 >= 3139 && local14 <= 3199 && local22 >= 3008 && local22 <= 3062) {
				this.anInt918 = 0;
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("4136, " + -86 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(B)V")
	private void method706() {
		try {
			if (this.anInt885 >= 2 || this.anInt868 != 0 || this.anInt963 != 0) {
				@Pc(36) String local36;
				if (this.anInt868 == 1 && this.anInt885 < 2) {
					local36 = "Use " + this.aString17 + " with...";
				} else if (this.anInt963 == 1 && this.anInt885 < 2) {
					local36 = this.aString24 + "...";
				} else {
					local36 = this.aStringArray10[this.anInt885 - 1];
				}
				if (this.anInt885 > 2) {
					local36 = local36 + "@whi@ / " + (this.anInt885 - 2) + " more options";
				}
				this.aClass1_Sub1_Sub2_Sub1_4.method78(16777215, 4, local36, 15, (byte) 2, anInt1007 / 1000);
			}
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("2749, " + 125 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!MYGSUHVG;)Z")
	private boolean method707(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class27 arg1) {
		try {
			if (arg1.anIntArray111 == null) {
				return false;
			}
			for (@Pc(6) int local6 = 0; local6 < arg1.anIntArray111.length; local6++) {
				@Pc(14) int local14 = this.method650(arg1, local6);
				@Pc(19) int local19 = arg1.anIntArray115[local6];
				if (arg1.anIntArray111[local6] == 2) {
					if (local14 >= local19) {
						return false;
					}
				} else if (arg1.anIntArray111[local6] == 3) {
					if (local14 <= local19) {
						return false;
					}
				} else if (arg1.anIntArray111[local6] == 4) {
					if (local14 == local19) {
						return false;
					}
				} else if (local14 != local19) {
					return false;
				}
			}
			if (!arg0) {
				this.aClass16ArrayArrayArray1 = null;
			}
			return true;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("19178, " + arg0 + ", " + arg1 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method708(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean193) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.method709(43595);
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

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)Ljava/net/Socket;")
	public Socket method709(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(JI)V")
	private void method710(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt827 >= 100 && this.anInt900 != 1) {
					this.method639("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
				} else if (this.anInt827 >= 200) {
					this.method639("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
				} else {
					@Pc(38) String local38 = Class41.method508(Class41.method505(arg0));
					for (@Pc(45) int local45 = 0; local45 < this.anInt827; local45++) {
						if (this.aLongArray4[local45] == arg0) {
							this.method639(local38 + " is already on your friend list", 0, "");
							return;
						}
					}
					for (@Pc(75) int local75 = 0; local75 < this.anInt1013; local75++) {
						if (this.aLongArray3[local75] == arg0) {
							this.method639("Please remove " + local38 + " from your ignore list first", 0, "");
							return;
						}
					}
					if (!local38.equals(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString5)) {
						this.aStringArray12[this.anInt827] = local38;
						this.aLongArray4[this.anInt827] = arg0;
						this.anIntArray215[this.anInt827] = 0;
						this.anInt827++;
						this.aBoolean194 = true;
						this.aClass1_Sub1_Sub4_8.method283(52);
						this.aClass1_Sub1_Sub4_8.method290(arg0);
					}
				}
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("25439, " + arg0 + ", " + -678 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method711(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(8) int local8 = this.aClass18_1.method217(arg2, arg3, arg1);
			@Pc(27) int local27;
			@Pc(33) int local33;
			@Pc(37) int local37;
			@Pc(39) int local39;
			@Pc(61) int local61;
			@Pc(67) int local67;
			if (local8 != 0) {
				local27 = this.aClass18_1.method221(arg2, arg3, arg1, local8);
				local33 = local27 >> 6 & 0x3;
				local37 = local27 & 0x1F;
				local39 = arg4;
				if (local8 > 0) {
					local39 = arg0;
				}
				@Pc(47) int[] local47 = this.aClass1_Sub1_Sub2_Sub3_6.anIntArray62;
				local61 = arg3 * 4 + (103 - arg1) * 512 * 4 + 24624;
				local67 = local8 >> 14 & 0x7FFF;
				@Pc(70) Class5 local70 = Class5.method130(local67);
				if (local70.anInt265 == -1) {
					if (local37 == 0 || local37 == 2) {
						if (local33 == 0) {
							local47[local61] = local39;
							local47[local61 + 512] = local39;
							local47[local61 + 1024] = local39;
							local47[local61 + 1536] = local39;
						} else if (local33 == 1) {
							local47[local61] = local39;
							local47[local61 + 1] = local39;
							local47[local61 + 2] = local39;
							local47[local61 + 3] = local39;
						} else if (local33 == 2) {
							local47[local61 + 3] = local39;
							local47[local61 + 3 + 512] = local39;
							local47[local61 + 3 + 1024] = local39;
							local47[local61 + 3 + 1536] = local39;
						} else if (local33 == 3) {
							local47[local61 + 1536] = local39;
							local47[local61 + 1536 + 1] = local39;
							local47[local61 + 1536 + 2] = local39;
							local47[local61 + 1536 + 3] = local39;
						}
					}
					if (local37 == 3) {
						if (local33 == 0) {
							local47[local61] = local39;
						} else if (local33 == 1) {
							local47[local61 + 3] = local39;
						} else if (local33 == 2) {
							local47[local61 + 3 + 1536] = local39;
						} else if (local33 == 3) {
							local47[local61 + 1536] = local39;
						}
					}
					if (local37 == 2) {
						if (local33 == 3) {
							local47[local61] = local39;
							local47[local61 + 512] = local39;
							local47[local61 + 1024] = local39;
							local47[local61 + 1536] = local39;
						} else if (local33 == 0) {
							local47[local61] = local39;
							local47[local61 + 1] = local39;
							local47[local61 + 2] = local39;
							local47[local61 + 3] = local39;
						} else if (local33 == 1) {
							local47[local61 + 3] = local39;
							local47[local61 + 3 + 512] = local39;
							local47[local61 + 3 + 1024] = local39;
							local47[local61 + 3 + 1536] = local39;
						} else if (local33 == 2) {
							local47[local61 + 1536] = local39;
							local47[local61 + 1536 + 1] = local39;
							local47[local61 + 1536 + 2] = local39;
							local47[local61 + 1536 + 3] = local39;
						}
					}
				} else {
					@Pc(80) Class1_Sub1_Sub2_Sub2 local80 = this.aClass1_Sub1_Sub2_Sub2Array4[local70.anInt265];
					if (local80 != null) {
						@Pc(92) int local92 = (local70.anInt261 * 4 - local80.anInt185) / 2;
						@Pc(102) int local102 = (local70.anInt280 * 4 - local80.anInt186) / 2;
						local80.method103(arg3 * 4 + local92 + 48, (104 - arg1 - local70.anInt280) * 4 + 48 + local102);
					}
				}
			}
			local8 = this.aClass18_1.method219(arg2, arg3, arg1);
			if (local8 != 0) {
				local27 = this.aClass18_1.method221(arg2, arg3, arg1, local8);
				local33 = local27 >> 6 & 0x3;
				local37 = local27 & 0x1F;
				local39 = local8 >> 14 & 0x7FFF;
				@Pc(456) Class5 local456 = Class5.method130(local39);
				@Pc(488) int local488;
				if (local456.anInt265 != -1) {
					@Pc(466) Class1_Sub1_Sub2_Sub2 local466 = this.aClass1_Sub1_Sub2_Sub2Array4[local456.anInt265];
					if (local466 != null) {
						local67 = (local456.anInt261 * 4 - local466.anInt185) / 2;
						local488 = (local456.anInt280 * 4 - local466.anInt186) / 2;
						local466.method103(arg3 * 4 + local67 + 48, (104 - arg1 - local456.anInt280) * 4 + 48 + local488);
					}
				} else if (local37 == 9) {
					local61 = 15658734;
					if (local8 > 0) {
						local61 = 15597568;
					}
					@Pc(525) int[] local525 = this.aClass1_Sub1_Sub2_Sub3_6.anIntArray62;
					local488 = arg3 * 4 + (103 - arg1) * 512 * 4 + 24624;
					if (local33 == 0 || local33 == 2) {
						local525[local488 + 1536] = local61;
						local525[local488 + 1024 + 1] = local61;
						local525[local488 + 512 + 2] = local61;
						local525[local488 + 3] = local61;
					} else {
						local525[local488] = local61;
						local525[local488 + 512 + 1] = local61;
						local525[local488 + 1024 + 2] = local61;
						local525[local488 + 1536 + 3] = local61;
					}
				}
			}
			local8 = this.aClass18_1.method220(arg2, arg3, arg1);
			if (local8 != 0) {
				local27 = local8 >> 14 & 0x7FFF;
				@Pc(620) Class5 local620 = Class5.method130(local27);
				if (local620.anInt265 != -1) {
					@Pc(630) Class1_Sub1_Sub2_Sub2 local630 = this.aClass1_Sub1_Sub2_Sub2Array4[local620.anInt265];
					if (local630 != null) {
						local39 = (local620.anInt261 * 4 - local630.anInt185) / 2;
						@Pc(652) int local652 = (local620.anInt280 * 4 - local630.anInt186) / 2;
						local630.method103(arg3 * 4 + local39 + 48, (104 - arg1 - local620.anInt280) * 4 + 48 + local652);
						return;
					}
				}
			}
		} catch (@Pc(676) RuntimeException local676) {
			signlink.reporterror("6755, " + -871 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local676.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method713() {
		try {
			this.aClass8_25.method133();
			@Pc(18) int local18;
			@Pc(20) int local20;
			if (this.anInt864 == 2) {
				@Pc(13) byte[] local13 = this.aClass1_Sub1_Sub2_Sub2_12.aByteArray2;
				@Pc(15) int[] local15 = Class1_Sub1_Sub2.anIntArray192;
				local18 = local13.length;
				for (local20 = 0; local20 < local18; local20++) {
					if (local13[local20] == 0) {
						local15[local20] = 0;
					}
				}
				this.aClass1_Sub1_Sub2_Sub3_12.method176(25, this.anIntArray272, 256, 33, this.anIntArray230, 33, 0, 25, 0, this.anInt976);
				this.aClass8_26.method133();
				Class1_Sub1_Sub2_Sub4.anIntArray197 = this.anIntArray256;
			} else {
				@Pc(67) int local67 = this.anInt976 + this.anInt887 & 0x7FF;
				@Pc(74) int local74 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt231 / 32 + 48;
				local18 = 464 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt232 / 32;
				this.aClass1_Sub1_Sub2_Sub3_6.method176(local74, this.anIntArray222, this.anInt967 + 256, 151, this.anIntArray259, 146, 5, local18, 25, local67);
				this.aClass1_Sub1_Sub2_Sub3_12.method176(25, this.anIntArray272, 256, 33, this.anIntArray230, 33, 0, 25, 0, this.anInt976);
				for (local20 = 0; local20 < this.anInt911; local20++) {
					local74 = this.anIntArray227[local20] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt231 / 32;
					local18 = this.anIntArray228[local20] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt232 / 32;
					this.method662(this.aClass1_Sub1_Sub2_Sub3Array9[local20], local18, local74);
				}
				@Pc(176) int local176;
				for (@Pc(172) int local172 = 0; local172 < 104; local172++) {
					for (local176 = 0; local176 < 104; local176++) {
						@Pc(188) Class16 local188 = this.aClass16ArrayArrayArray1[this.anInt995][local172][local176];
						if (local188 != null) {
							local74 = local172 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt231 / 32;
							local18 = local176 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt232 / 32;
							this.method662(this.aClass1_Sub1_Sub2_Sub3_13, local18, local74);
						}
					}
				}
				for (local176 = 0; local176 < this.anInt1045; local176++) {
					@Pc(239) Class1_Sub1_Sub1_Sub1_Sub1 local239 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray274[local176]];
					if (local239 != null && local239.method112((byte) 9)) {
						@Pc(248) Class21 local248 = local239.aClass21_1;
						if (local248.anIntArray86 != null) {
							local248 = local248.method251();
						}
						if (local248 != null && local248.aBoolean88 && local248.aBoolean86) {
							local74 = local239.anInt231 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt231 / 32;
							local18 = local239.anInt232 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt232 / 32;
							this.method662(this.aClass1_Sub1_Sub2_Sub3_14, local18, local74);
						}
					}
				}
				@Pc(307) Class1_Sub1_Sub1_Sub1_Sub2 local307;
				for (@Pc(297) int local297 = 0; local297 < this.anInt836; local297++) {
					local307 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray212[local297]];
					if (local307 != null && local307.method112((byte) 9)) {
						local74 = local307.anInt231 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt231 / 32;
						local18 = local307.anInt232 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt232 / 32;
						@Pc(335) boolean local335 = false;
						@Pc(339) long local339 = Class41.method504(local307.aString5);
						for (@Pc(341) int local341 = 0; local341 < this.anInt827; local341++) {
							if (local339 == this.aLongArray4[local341] && this.anIntArray215[local341] != 0) {
								local335 = true;
								break;
							}
						}
						@Pc(366) boolean local366 = false;
						if (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt245 != 0 && local307.anInt245 != 0 && aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt245 == local307.anInt245) {
							local366 = true;
						}
						if (local335) {
							this.method662(this.aClass1_Sub1_Sub2_Sub3_16, local18, local74);
						} else if (local366) {
							this.method662(this.aClass1_Sub1_Sub2_Sub3_17, local18, local74);
						} else {
							this.method662(this.aClass1_Sub1_Sub2_Sub3_15, local18, local74);
						}
					}
				}
				if (this.anInt1023 != 0 && anInt1007 % 20 < 10) {
					if (this.anInt1023 == 1 && this.anInt1003 >= 0 && this.anInt1003 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length) {
						@Pc(440) Class1_Sub1_Sub1_Sub1_Sub1 local440 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anInt1003];
						if (local440 != null) {
							local74 = local440.anInt231 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt231 / 32;
							local18 = local440.anInt232 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt232 / 32;
							this.method675(local18, this.aClass1_Sub1_Sub2_Sub3_8, local74);
						}
					}
					if (this.anInt1023 == 2) {
						local74 = (this.anInt847 - this.anInt894) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt231 / 32;
						local18 = (this.anInt848 - this.anInt895) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt232 / 32;
						this.method675(local18, this.aClass1_Sub1_Sub2_Sub3_8, local74);
					}
					if (this.anInt1023 == 10 && this.anInt993 >= 0 && this.anInt993 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length) {
						local307 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anInt993];
						if (local307 != null) {
							local74 = local307.anInt231 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt231 / 32;
							local18 = local307.anInt232 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt232 / 32;
							this.method675(local18, this.aClass1_Sub1_Sub2_Sub3_8, local74);
						}
					}
				}
				if (this.anInt953 != 0) {
					local74 = this.anInt953 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt231 / 32;
					local18 = this.anInt954 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt232 / 32;
					this.method662(this.aClass1_Sub1_Sub2_Sub3_7, local18, local74);
				}
				Class1_Sub1_Sub2.method517(16777215, 3, 97, 78, 3);
				this.aClass8_26.method133();
				Class1_Sub1_Sub2_Sub4.anIntArray197 = this.anIntArray256;
			}
		} catch (@Pc(608) RuntimeException local608) {
			signlink.reporterror("20640, " + -234 + ", " + local608.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)V")
	private void method714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass1_Sub1_Sub2_Sub2_6.method103(arg1, arg3);
			this.aClass1_Sub1_Sub2_Sub2_7.method103(arg1, arg3 + arg2 - 16);
			Class1_Sub1_Sub2.method517(this.anInt1005, arg2 - 32, arg1, arg3 + 16, 16);
			@Pc(38) int local38 = (arg2 - 32) * arg2 / arg4;
			if (local38 < 8) {
				local38 = 8;
			}
			@Pc(55) int local55 = (arg2 - local38 - 32) * arg0 / (arg4 - arg2);
			Class1_Sub1_Sub2.method517(this.anInt1039, local38, arg1, arg3 + local55 + 16, 16);
			Class1_Sub1_Sub2.method522(arg3 + local55 + 16, local38, arg1, this.anInt865);
			Class1_Sub1_Sub2.method522(arg3 + local55 + 16, local38, arg1 + 1, this.anInt865);
			Class1_Sub1_Sub2.method520(arg1, arg3 + local55 + 16, this.anInt865, 16);
			Class1_Sub1_Sub2.method520(arg1, arg3 + local55 + 17, this.anInt865, 16);
			Class1_Sub1_Sub2.method522(arg3 + local55 + 16, local38, arg1 + 15, this.anInt910);
			Class1_Sub1_Sub2.method522(arg3 + local55 + 17, local38 - 1, arg1 + 14, this.anInt910);
			Class1_Sub1_Sub2.method520(arg1, arg3 + local55 + local38 + 15, this.anInt910, 16);
			Class1_Sub1_Sub2.method520(arg1 + 1, arg3 + 14 + local55 + local38, this.anInt910, 15);
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("69767, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -408 + ", " + arg4 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method715() {
		try {
			if (this.anInt1055 != 0) {
				@Pc(12) int local12 = 0;
				if (this.anInt1015 != 0) {
					local12 = 1;
				}
				for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
					if (this.aStringArray14[local19] != null) {
						@Pc(31) int local31 = this.anIntArray273[local19];
						@Pc(36) String local36 = this.aStringArray13[local19];
						if (local36 != null && local36.startsWith("@cr1@")) {
							local36 = local36.substring(5);
						}
						if (local36 != null && local36.startsWith("@cr2@")) {
							local36 = local36.substring(5);
						}
						if ((local31 == 3 || local31 == 7) && (local31 == 7 || this.anInt892 == 0 || this.anInt892 == 1 && this.method612(local36))) {
							@Pc(89) int local89 = 329 - local12 * 13;
							if (super.anInt814 > 4 && super.anInt815 - 4 > local89 - 10 && super.anInt815 - 4 <= local89 + 3) {
								@Pc(128) int local128 = this.aClass1_Sub1_Sub2_Sub1_3.method71("From:  " + local36 + this.aStringArray14[local19]) + 25;
								if (local128 > 450) {
									local128 = 450;
								}
								if (super.anInt814 < local128 + 4) {
									if (this.anInt980 >= 1) {
										this.aStringArray10[this.anInt885] = "Report abuse @whi@" + local36;
										this.anIntArray240[this.anInt885] = 2614;
										this.anInt885++;
									}
									this.aStringArray10[this.anInt885] = "Add ignore @whi@" + local36;
									this.anIntArray240[this.anInt885] = 2235;
									this.anInt885++;
									this.aStringArray10[this.anInt885] = "Add friend @whi@" + local36;
									this.anIntArray240[this.anInt885] = 2087;
									this.anInt885++;
								}
							}
							local12++;
							if (local12 >= 5) {
								return;
							}
						}
						if ((local31 == 5 || local31 == 6) && this.anInt892 < 2) {
							local12++;
							if (local12 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(241) RuntimeException local241) {
			signlink.reporterror("23851, " + -897 + ", " + local241.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(II)Z")
	private boolean method716(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(8) int local8 = this.anIntArray240[arg0];
			if (local8 >= 2000) {
				local8 -= 2000;
			}
			return local8 == 87;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("97647, " + -39865 + ", " + arg0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method717() {
		try {
			@Pc(7) int local7 = this.aClass1_Sub1_Sub2_Sub1_4.method71("Choose Option");
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt885; local9++) {
				local20 = this.aClass1_Sub1_Sub2_Sub1_4.method71(this.aStringArray10[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			local7 += 8;
			local20 = this.anInt885 * 15 + 21;
			@Pc(67) int local67;
			@Pc(85) int local85;
			if (super.anInt820 > 4 && super.anInt821 > 4 && super.anInt820 < 516 && super.anInt821 < 338) {
				local67 = super.anInt820 - local7 / 2 - 4;
				if (local67 + local7 > 512) {
					local67 = 512 - local7;
				}
				if (local67 < 0) {
					local67 = 0;
				}
				local85 = super.anInt821 - 4;
				if (local85 + local20 > 334) {
					local85 = 334 - local20;
				}
				if (local85 < 0) {
					local85 = 0;
				}
				this.aBoolean200 = true;
				this.anInt1025 = 0;
				this.anInt1026 = local67;
				this.anInt1027 = local85;
				this.anInt1028 = local7;
				this.anInt1029 = this.anInt885 * 15 + 22;
			}
			if (super.anInt820 > 553 && super.anInt821 > 205 && super.anInt820 < 743 && super.anInt821 < 466) {
				local67 = super.anInt820 - local7 / 2 - 553;
				if (local67 < 0) {
					local67 = 0;
				} else if (local67 + local7 > 190) {
					local67 = 190 - local7;
				}
				local85 = super.anInt821 - 205;
				if (local85 < 0) {
					local85 = 0;
				} else if (local85 + local20 > 261) {
					local85 = 261 - local20;
				}
				this.aBoolean200 = true;
				this.anInt1025 = 1;
				this.anInt1026 = local67;
				this.anInt1027 = local85;
				this.anInt1028 = local7;
				this.anInt1029 = this.anInt885 * 15 + 22;
			}
			if (super.anInt820 > 17 && super.anInt821 > 357 && super.anInt820 < 496 && super.anInt821 < 453) {
				local67 = super.anInt820 - local7 / 2 - 17;
				if (local67 < 0) {
					local67 = 0;
				} else if (local67 + local7 > 479) {
					local67 = 479 - local7;
				}
				local85 = super.anInt821 - 357;
				if (local85 < 0) {
					local85 = 0;
				} else if (local85 + local20 > 96) {
					local85 = 96 - local20;
				}
				this.aBoolean200 = true;
				this.anInt1025 = 2;
				this.anInt1026 = local67;
				this.anInt1027 = local85;
				this.anInt1028 = local7;
				this.anInt1029 = this.anInt885 * 15 + 22;
			}
		} catch (@Pc(289) RuntimeException local289) {
			signlink.reporterror("63898, " + 6 + ", " + local289.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(III)Z")
	private boolean method718(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(12) Class27 local12 = Class27.method339(arg1);
			for (@Pc(14) int local14 = 0; local14 < local12.anIntArray113.length && local12.anIntArray113[local14] != -1; local14++) {
				@Pc(28) Class27 local28 = Class27.method339(local12.anIntArray113[local14]);
				if (local28.anInt571 == 0) {
					local3 |= this.method718(arg0, local28.anInt565);
				}
				@Pc(63) int local63;
				if (local28.anInt571 == 6 && (local28.anInt556 != -1 || local28.anInt557 != -1)) {
					@Pc(58) boolean local58 = this.method707(this.aBoolean203, local28);
					if (local58) {
						local63 = local28.anInt557;
					} else {
						local63 = local28.anInt556;
					}
					if (local63 != -1) {
						@Pc(75) Class19 local75 = Class19.aClass19Array1[local63];
						local28.anInt573 += arg0;
						while (local28.anInt573 > local75.method243(local28.anInt555)) {
							local28.anInt573 -= local75.method243(local28.anInt555) + 1;
							local28.anInt555++;
							if (local28.anInt555 >= local75.anInt411) {
								local28.anInt555 -= local75.anInt412;
								if (local28.anInt555 < 0 || local28.anInt555 >= local75.anInt411) {
									local28.anInt555 = 0;
								}
							}
							local3 = true;
						}
					}
				}
				if (local28.anInt571 == 6 && local28.anInt554 != 0) {
					@Pc(146) int local146 = local28.anInt554 >> 16;
					local63 = local28.anInt554 << 16 >> 16;
					@Pc(157) int local157 = local146 * arg0;
					local63 *= arg0;
					local28.anInt552 = local28.anInt552 + local157 & 0x7FF;
					local28.anInt553 = local28.anInt553 + local63 & 0x7FF;
					local3 = true;
				}
			}
			return local3;
		} catch (@Pc(188) RuntimeException local188) {
			signlink.reporterror("66066, " + -523 + ", " + arg0 + ", " + arg1 + ", " + local188.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method719(@OriginalArg(0) int arg0) {
		try {
			this.method617();
			if (this.anInt909 == 1) {
				this.aClass1_Sub1_Sub2_Sub3Array10[this.anInt908 / 100].method172(this.anInt906 - 8 - 4, this.anInt907 - 8 - 4);
			}
			if (this.anInt909 == 2) {
				this.aClass1_Sub1_Sub2_Sub3Array10[this.anInt908 / 100 + 4].method172(this.anInt906 - 8 - 4, this.anInt907 - 8 - 4);
			}
			if (this.anInt867 != -1) {
				this.method718(this.anInt1042, this.anInt867);
				this.method660(Class27.method339(this.anInt867), 0, 0, 878, 0);
			}
			if (this.anInt935 != -1) {
				this.method718(this.anInt1042, this.anInt935);
				this.method660(Class27.method339(this.anInt935), 0, 0, 878, 0);
			}
			this.method705();
			if (arg0 != -30964) {
				this.aClass1_Sub1_Sub4_8.method284(153);
			}
			if (!this.aBoolean200) {
				this.method698();
				this.method706();
			} else if (this.anInt1025 == 0) {
				this.method608();
			}
			if (this.anInt925 == 1) {
				this.aClass1_Sub1_Sub2_Sub3_9.method172(472, 296);
			}
			@Pc(175) int local175;
			if (aBoolean198) {
				@Pc(141) byte local141 = 20;
				@Pc(143) int local143 = 16776960;
				if (super.anInt809 < 30 && aBoolean205) {
					local143 = 16711680;
				}
				if (super.anInt809 < 20 && !aBoolean205) {
					local143 = 16711680;
				}
				this.aClass1_Sub1_Sub2_Sub1_3.method68(local143, "Fps:" + super.anInt809, 20);
				local175 = local141 + 15;
				@Pc(177) Runtime local177 = Runtime.getRuntime();
				@Pc(186) int local186 = (int) ((local177.totalMemory() - local177.freeMemory()) / 1024L);
				if (local186 > 33554432 && aBoolean205) {
				}
				if (local186 > 67108864 && !aBoolean205) {
				}
				this.aClass1_Sub1_Sub2_Sub1_3.method68(16776960, "Mem:" + local186 + "k", 35);
				local175 += 15;
			}
			if (this.anInt1015 != 0) {
				@Pc(227) int local227 = this.anInt1015 / 50;
				local175 = local227 / 60;
				@Pc(235) int local235 = local227 % 60;
				if (local235 < 10) {
					this.aClass1_Sub1_Sub2_Sub1_3.method73((byte) 6, 329, "System update in: " + local175 + ":0" + local235, 4, 16776960);
				} else {
					this.aClass1_Sub1_Sub2_Sub1_3.method73((byte) 6, 329, "System update in: " + local175 + ":" + local235, 4, 16776960);
				}
				anInt936++;
				if (anInt936 > 74) {
					anInt936 = 0;
					this.aClass1_Sub1_Sub4_8.method283(105);
					return;
				}
			}
		} catch (@Pc(292) RuntimeException local292) {
			signlink.reporterror("4387, " + arg0 + ", " + local292.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method721(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt868 == 0 && this.anInt963 == 0) {
				this.aStringArray10[this.anInt885] = "Walk here";
				this.anIntArray240[this.anInt885] = 2;
				this.anIntArray238[this.anInt885] = super.anInt814;
				this.anIntArray239[this.anInt885] = super.anInt815;
				this.anInt885++;
			}
			@Pc(41) int local41 = -1;
			if (arg0 <= 0) {
				this.anInt845 = -329;
			}
			for (@Pc(48) int local48 = 0; local48 < Class1_Sub1_Sub1_Sub4.anInt619; local48++) {
				@Pc(54) int local54 = Class1_Sub1_Sub1_Sub4.anIntArray154[local48];
				@Pc(58) int local58 = local54 & 0x7F;
				@Pc(64) int local64 = local54 >> 7 & 0x7F;
				@Pc(70) int local70 = local54 >> 29 & 0x3;
				@Pc(76) int local76 = local54 >> 14 & 0x7FFF;
				if (local54 != local41) {
					local41 = local54;
					@Pc(223) int local223;
					if (local70 == 2 && this.aClass18_1.method221(this.anInt995, local58, local64, local54) >= 0) {
						@Pc(96) Class5 local96 = Class5.method130(local76);
						if (local96.anIntArray36 != null) {
							local96 = local96.method122();
						}
						if (local96 == null) {
							continue;
						}
						if (this.anInt868 == 1) {
							this.aStringArray10[this.anInt885] = "Use " + this.aString17 + " with @cya@" + local96.aString6;
							this.anIntArray240[this.anInt885] = 697;
							this.anIntArray241[this.anInt885] = local54;
							this.anIntArray238[this.anInt885] = local58;
							this.anIntArray239[this.anInt885] = local64;
							this.anInt885++;
						} else if (this.anInt963 != 1) {
							if (local96.aStringArray3 != null) {
								for (local223 = 4; local223 >= 0; local223--) {
									if (local96.aStringArray3[local223] != null) {
										this.aStringArray10[this.anInt885] = local96.aStringArray3[local223] + " @cya@" + local96.aString6;
										if (local223 == 0) {
											this.anIntArray240[this.anInt885] = 861;
										}
										if (local223 == 1) {
											this.anIntArray240[this.anInt885] = 601;
										}
										if (local223 == 2) {
											this.anIntArray240[this.anInt885] = 732;
										}
										if (local223 == 3) {
											this.anIntArray240[this.anInt885] = 702;
										}
										if (local223 == 4) {
											this.anIntArray240[this.anInt885] = 1478;
										}
										this.anIntArray241[this.anInt885] = local54;
										this.anIntArray238[this.anInt885] = local58;
										this.anIntArray239[this.anInt885] = local64;
										this.anInt885++;
									}
								}
							}
							this.aStringArray10[this.anInt885] = "Examine @cya@" + local96.aString6;
							this.anIntArray240[this.anInt885] = 1881;
							this.anIntArray241[this.anInt885] = local96.anInt275 << 14;
							this.anIntArray238[this.anInt885] = local58;
							this.anIntArray239[this.anInt885] = local64;
							this.anInt885++;
						} else if ((this.anInt965 & 0x4) == 4) {
							this.aStringArray10[this.anInt885] = this.aString24 + " @cya@" + local96.aString6;
							this.anIntArray240[this.anInt885] = 917;
							this.anIntArray241[this.anInt885] = local54;
							this.anIntArray238[this.anInt885] = local58;
							this.anIntArray239[this.anInt885] = local64;
							this.anInt885++;
						}
					}
					@Pc(403) Class1_Sub1_Sub1_Sub1_Sub1 local403;
					@Pc(451) Class1_Sub1_Sub1_Sub1_Sub2 local451;
					@Pc(441) int local441;
					if (local70 == 1) {
						@Pc(374) Class1_Sub1_Sub1_Sub1_Sub1 local374 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local76];
						if (local374.aClass21_1.aByte10 == 1 && (local374.anInt231 & 0x7F) == 64 && (local374.anInt232 & 0x7F) == 64) {
							for (local223 = 0; local223 < this.anInt1045; local223++) {
								local403 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray274[local223]];
								if (local403 != null && local403 != local374 && local403.aClass21_1.aByte10 == 1 && local403.anInt231 == local374.anInt231 && local403.anInt232 == local374.anInt232) {
									this.method629(local58, this.anIntArray274[local223], local64, local403.aClass21_1);
								}
							}
							for (local441 = 0; local441 < this.anInt836; local441++) {
								local451 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray212[local441]];
								if (local451 != null && local451.anInt231 == local374.anInt231 && local451.anInt232 == local374.anInt232) {
									this.method588(local451, local58, this.anIntArray212[local441], local64);
								}
							}
						}
						this.method629(local58, local76, local64, local374.aClass21_1);
					}
					if (local70 == 0) {
						@Pc(493) Class1_Sub1_Sub1_Sub1_Sub2 local493 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local76];
						if ((local493.anInt231 & 0x7F) == 64 && (local493.anInt232 & 0x7F) == 64) {
							for (local223 = 0; local223 < this.anInt1045; local223++) {
								local403 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray274[local223]];
								if (local403 != null && local403.aClass21_1.aByte10 == 1 && local403.anInt231 == local493.anInt231 && local403.anInt232 == local493.anInt232) {
									this.method629(local58, this.anIntArray274[local223], local64, local403.aClass21_1);
								}
							}
							for (local441 = 0; local441 < this.anInt836; local441++) {
								local451 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray212[local441]];
								if (local451 != null && local451 != local493 && local451.anInt231 == local493.anInt231 && local451.anInt232 == local493.anInt232) {
									this.method588(local451, local58, this.anIntArray212[local441], local64);
								}
							}
						}
						this.method588(local493, local58, local76, local64);
					}
					if (local70 == 3) {
						@Pc(612) Class16 local612 = this.aClass16ArrayArrayArray1[this.anInt995][local58][local64];
						if (local612 != null) {
							for (@Pc(619) Class1_Sub1_Sub1_Sub2 local619 = (Class1_Sub1_Sub1_Sub2) local612.method186(); local619 != null; local619 = (Class1_Sub1_Sub1_Sub2) local612.method188(this.anInt939)) {
								@Pc(625) Class3 local625 = Class3.method34(local619.anInt311);
								if (this.anInt868 == 1) {
									this.aStringArray10[this.anInt885] = "Use " + this.aString17 + " with @lre@" + local625.aString3;
									this.anIntArray240[this.anInt885] = 368;
									this.anIntArray241[this.anInt885] = local619.anInt311;
									this.anIntArray238[this.anInt885] = local58;
									this.anIntArray239[this.anInt885] = local64;
									this.anInt885++;
								} else if (this.anInt963 != 1) {
									for (@Pc(742) int local742 = 4; local742 >= 0; local742--) {
										if (local625.aStringArray2 != null && local625.aStringArray2[local742] != null) {
											this.aStringArray10[this.anInt885] = local625.aStringArray2[local742] + " @lre@" + local625.aString3;
											if (local742 == 0) {
												this.anIntArray240[this.anInt885] = 644;
											}
											if (local742 == 1) {
												this.anIntArray240[this.anInt885] = 603;
											}
											if (local742 == 2) {
												this.anIntArray240[this.anInt885] = 194;
											}
											if (local742 == 3) {
												this.anIntArray240[this.anInt885] = 745;
											}
											if (local742 == 4) {
												this.anIntArray240[this.anInt885] = 344;
											}
											this.anIntArray241[this.anInt885] = local619.anInt311;
											this.anIntArray238[this.anInt885] = local58;
											this.anIntArray239[this.anInt885] = local64;
											this.anInt885++;
										} else if (local742 == 2) {
											this.aStringArray10[this.anInt885] = "Take @lre@" + local625.aString3;
											this.anIntArray240[this.anInt885] = 194;
											this.anIntArray241[this.anInt885] = local619.anInt311;
											this.anIntArray238[this.anInt885] = local58;
											this.anIntArray239[this.anInt885] = local64;
											this.anInt885++;
										}
									}
									this.aStringArray10[this.anInt885] = "Examine @lre@" + local625.aString3;
									this.anIntArray240[this.anInt885] = 1993;
									this.anIntArray241[this.anInt885] = local619.anInt311;
									this.anIntArray238[this.anInt885] = local58;
									this.anIntArray239[this.anInt885] = local64;
									this.anInt885++;
								} else if ((this.anInt965 & 0x1) == 1) {
									this.aStringArray10[this.anInt885] = this.aString24 + " @lre@" + local625.aString3;
									this.anIntArray240[this.anInt885] = 450;
									this.anIntArray241[this.anInt885] = local619.anInt311;
									this.anIntArray238[this.anInt885] = local58;
									this.anIntArray239[this.anInt885] = local64;
									this.anInt885++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(950) RuntimeException local950) {
			signlink.reporterror("19857, " + arg0 + ", " + local950.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(ILclient!MVHXDWGI;I)V")
	private void method722(@OriginalArg(1) Class1_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt837; local3++) {
				@Pc(10) int local10 = this.anIntArray213[local3];
				@Pc(15) Class1_Sub1_Sub1_Sub1_Sub1 local15 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local10];
				@Pc(18) int local18 = arg0.method294();
				if ((local18 & 0x20) != 0) {
					local15.anInt197 = arg0.method321();
					local15.anInt198 = arg0.method322();
				}
				@Pc(45) int local45;
				if ((local18 & 0x1) != 0) {
					local15.anInt199 = arg0.method320();
					local45 = arg0.method327();
					local15.anInt203 = local45 >> 16;
					local15.anInt202 = anInt1007 + (local45 & 0xFFFF);
					local15.anInt200 = 0;
					local15.anInt201 = 0;
					if (local15.anInt202 > anInt1007) {
						local15.anInt200 = -1;
					}
					if (local15.anInt199 == 65535) {
						local15.anInt199 = -1;
					}
				}
				@Pc(94) int local94;
				if ((local18 & 0x10) != 0) {
					local45 = arg0.method322();
					if (local45 == 65535) {
						local45 = -1;
					}
					local94 = arg0.method314();
					if (local45 == local15.anInt226 && local45 != -1) {
						@Pc(106) int local106 = Class19.aClass19Array1[local45].anInt419;
						if (local106 == 1) {
							local15.anInt227 = 0;
							local15.anInt228 = 0;
							local15.anInt229 = local94;
							local15.anInt230 = 0;
						}
						if (local106 == 2) {
							local15.anInt230 = 0;
						}
					} else if (local45 == -1 || local15.anInt226 == -1 || Class19.aClass19Array1[local45].anInt413 >= Class19.aClass19Array1[local15.anInt226].anInt413) {
						local15.anInt226 = local45;
						local15.anInt227 = 0;
						local15.anInt228 = 0;
						local15.anInt229 = local94;
						local15.anInt230 = 0;
						local15.anInt218 = local15.anInt220;
					}
				}
				if ((local18 & 0x80) != 0) {
					local45 = arg0.method294();
					local94 = arg0.method294();
					local15.method111(local45, anInt1007, local94);
					local15.anInt223 = anInt1007 + 300;
					local15.anInt224 = arg0.method314();
					local15.anInt225 = arg0.method294();
				}
				if ((local18 & 0x40) != 0) {
					local45 = arg0.method313();
					local94 = arg0.method312(964);
					local15.method111(local45, anInt1007, local94);
					local15.anInt223 = anInt1007 + 300;
					local15.anInt224 = arg0.method313();
					local15.anInt225 = arg0.method294();
				}
				if ((local18 & 0x8) != 0) {
					local15.aClass21_1 = Class21.method250(arg0.method296());
					local15.anInt216 = local15.aClass21_1.aByte10;
					local15.anInt234 = local15.aClass21_1.anInt437;
					local15.anInt212 = local15.aClass21_1.anInt436;
					local15.anInt213 = local15.aClass21_1.anInt430;
					local15.anInt214 = local15.aClass21_1.anInt438;
					local15.anInt215 = local15.aClass21_1.anInt425;
					local15.anInt235 = local15.aClass21_1.anInt442;
				}
				if ((local18 & 0x2) != 0) {
					local15.anInt219 = arg0.method320();
					if (local15.anInt219 == 65535) {
						local15.anInt219 = -1;
					}
				}
				if ((local18 & 0x4) != 0) {
					local15.aString4 = arg0.method301();
					local15.anInt240 = 100;
				}
			}
			@Pc(307) int local307 = arg1 + 0;
		} catch (@Pc(309) RuntimeException local309) {
			signlink.reporterror("47801, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local309.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method583() {
		try {
			this.aBoolean197 = true;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("1098, " + 0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!BSQIIHOT;Lclient!MVHXDWGI;)V")
	private void method723(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub1_Sub1_Sub2 arg2, @OriginalArg(4) Class1_Sub1_Sub4 arg3) {
		try {
			if ((arg0 & 0x40) != 0) {
				arg2.anInt197 = arg3.method296();
				arg2.anInt198 = arg3.method322();
			}
			@Pc(33) int local33;
			if ((arg0 & 0x200) != 0) {
				arg2.anInt199 = arg3.method296();
				local33 = arg3.method328();
				arg2.anInt203 = local33 >> 16;
				arg2.anInt202 = anInt1007 + (local33 & 0xFFFF);
				arg2.anInt200 = 0;
				arg2.anInt201 = 0;
				if (arg2.anInt202 > anInt1007) {
					arg2.anInt200 = -1;
				}
				if (arg2.anInt199 == 65535) {
					arg2.anInt199 = -1;
				}
			}
			if ((arg0 & 0x1) != 0) {
				arg2.aString4 = arg3.method301();
				if (arg2.aString4.charAt(0) == '~') {
					arg2.aString4 = arg2.aString4.substring(1);
					this.method639(arg2.aString4, 2, arg2.aString5);
				} else if (arg2 == aClass1_Sub1_Sub1_Sub1_Sub2_1) {
					this.method639(arg2.aString4, 2, arg2.aString5);
				}
				arg2.anInt195 = 0;
				arg2.anInt196 = 0;
				arg2.anInt240 = 150;
			}
			@Pc(127) int local127;
			if ((arg0 & 0x400) != 0) {
				local33 = arg3.method313();
				local127 = arg3.method314();
				arg2.method111(local33, anInt1007, local127);
				arg2.anInt223 = anInt1007 + 300;
				arg2.anInt224 = arg3.method312(964);
				arg2.anInt225 = arg3.method314();
			}
			if ((arg0 & 0x100) != 0) {
				arg2.anInt204 = arg3.method314();
				arg2.anInt206 = arg3.method294();
				arg2.anInt205 = arg3.method294();
				arg2.anInt207 = arg3.method314();
				arg2.anInt208 = arg3.method322() + anInt1007;
				arg2.anInt209 = arg3.method296() + anInt1007;
				arg2.anInt210 = arg3.method314();
				arg2.method110(this.aByte31);
			}
			@Pc(208) int local208;
			if ((arg0 & 0x10) != 0) {
				local33 = arg3.method322();
				local127 = arg3.method312(964);
				local208 = arg3.method314();
				@Pc(211) int local211 = arg3.anInt529;
				if (arg2.aString5 != null && arg2.aBoolean34) {
					@Pc(221) long local221 = Class41.method504(arg2.aString5);
					@Pc(223) boolean local223 = false;
					if (local127 <= 1) {
						for (@Pc(228) int local228 = 0; local228 < this.anInt1013; local228++) {
							if (this.aLongArray3[local228] == local221) {
								local223 = true;
								break;
							}
						}
					}
					if (!local223 && this.anInt918 == 0) {
						try {
							this.aClass1_Sub1_Sub4_9.anInt529 = 0;
							arg3.method330(this.aClass1_Sub1_Sub4_9.aByteArray14, local208, 349);
							this.aClass1_Sub1_Sub4_9.anInt529 = 0;
							@Pc(273) String local273 = Class37.method447(local208, this.aClass1_Sub1_Sub4_9);
							@Pc(277) String local277 = Class29.method399(local273);
							arg2.aString4 = local277;
							arg2.anInt195 = local33 >> 8;
							arg2.anInt196 = local33 & 0xFF;
							arg2.anInt240 = 150;
							if (local127 == 2 || local127 == 3) {
								this.method639(local277, 1, "@cr2@" + arg2.aString5);
							} else if (local127 == 1) {
								this.method639(local277, 1, "@cr1@" + arg2.aString5);
							} else {
								this.method639(local277, 2, arg2.aString5);
							}
						} catch (@Pc(341) Exception local341) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg3.anInt529 = local211 + local208;
			}
			if ((arg0 & 0x4) != 0) {
				arg2.anInt219 = arg3.method322();
				if (arg2.anInt219 == 65535) {
					arg2.anInt219 = -1;
				}
			}
			if ((arg0 & 0x20) != 0) {
				local33 = arg3.method313();
				local127 = arg3.method312(964);
				arg2.method111(local33, anInt1007, local127);
				arg2.anInt223 = anInt1007 + 300;
				arg2.anInt224 = arg3.method313();
				arg2.anInt225 = arg3.method313();
			}
			if ((arg0 & 0x80) != 0) {
				local33 = arg3.method322();
				if (local33 == 65535) {
					local33 = -1;
				}
				local127 = arg3.method312(964);
				if (local33 == arg2.anInt226 && local33 != -1) {
					local208 = Class19.aClass19Array1[local33].anInt419;
					if (local208 == 1) {
						arg2.anInt227 = 0;
						arg2.anInt228 = 0;
						arg2.anInt229 = local127;
						arg2.anInt230 = 0;
					}
					if (local208 == 2) {
						arg2.anInt230 = 0;
					}
				} else if (local33 == -1 || arg2.anInt226 == -1 || Class19.aClass19Array1[local33].anInt413 >= Class19.aClass19Array1[arg2.anInt226].anInt413) {
					arg2.anInt226 = local33;
					arg2.anInt227 = 0;
					arg2.anInt228 = 0;
					arg2.anInt229 = local127;
					arg2.anInt230 = 0;
					arg2.anInt218 = arg2.anInt220;
				}
			}
			if ((arg0 & 0x8) != 0) {
				local33 = arg3.method294();
				@Pc(496) byte[] local496 = new byte[local33];
				@Pc(502) Class1_Sub1_Sub4 local502 = new Class1_Sub1_Sub4(0, local496);
				arg3.method329(local33, local496);
				this.aClass1_Sub1_Sub4Array1[arg1] = local502;
				arg2.method116(local502);
			}
		} catch (@Pc(519) RuntimeException local519) {
			signlink.reporterror("49234, " + arg0 + ", " + -826 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local519.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(B)V")
	private void method724(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			this.aClass8_24.method133();
			Class1_Sub1_Sub2_Sub4.anIntArray197 = this.anIntArray255;
			this.aClass1_Sub1_Sub2_Sub2_11.method103(0, 0);
			if (this.anInt826 != -1) {
				this.method660(Class27.method339(this.anInt826), 0, 0, 878, 0);
			} else if (this.anIntArray229[this.anInt959] != -1) {
				this.method660(Class27.method339(this.anIntArray229[this.anInt959]), 0, 0, 878, 0);
			}
			if (this.aBoolean200 && this.anInt1025 == 1) {
				this.method608();
			}
			this.aClass8_24.method134(super.aGraphics2, 205, 553);
			this.aClass8_26.method133();
			Class1_Sub1_Sub2_Sub4.anIntArray197 = this.anIntArray256;
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("39147, " + arg0 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method725(@OriginalArg(0) int arg0) {
		try {
			this.aClass1_Sub1_Sub2_Sub2_14 = new Class1_Sub1_Sub2_Sub2(this.aClass15_2, "titlebox", 0);
			if (arg0 != 22535) {
				this.anInt1031 = -1;
			}
			this.aClass1_Sub1_Sub2_Sub2_15 = new Class1_Sub1_Sub2_Sub2(this.aClass15_2, "titlebutton", 0);
			this.aClass1_Sub1_Sub2_Sub2Array5 = new Class1_Sub1_Sub2_Sub2[12];
			for (@Pc(31) int local31 = 0; local31 < 12; local31++) {
				this.aClass1_Sub1_Sub2_Sub2Array5[local31] = new Class1_Sub1_Sub2_Sub2(this.aClass15_2, "runes", local31);
			}
			this.aClass1_Sub1_Sub2_Sub3_3 = new Class1_Sub1_Sub2_Sub3(128, 265);
			this.aClass1_Sub1_Sub2_Sub3_4 = new Class1_Sub1_Sub2_Sub3(128, 265);
			for (@Pc(64) int local64 = 0; local64 < 33920; local64++) {
				this.aClass1_Sub1_Sub2_Sub3_3.anIntArray62[local64] = this.aClass8_15.anIntArray42[local64];
			}
			for (@Pc(82) int local82 = 0; local82 < 33920; local82++) {
				this.aClass1_Sub1_Sub2_Sub3_4.anIntArray62[local82] = this.aClass8_16.anIntArray42[local82];
			}
			this.anIntArray268 = new int[256];
			for (@Pc(104) int local104 = 0; local104 < 64; local104++) {
				this.anIntArray268[local104] = local104 * 262144;
			}
			for (@Pc(119) int local119 = 0; local119 < 64; local119++) {
				this.anIntArray268[local119 + 64] = local119 * 1024 + 16711680;
			}
			for (@Pc(138) int local138 = 0; local138 < 64; local138++) {
				this.anIntArray268[local138 + 128] = local138 * 4 + 16776960;
			}
			for (@Pc(157) int local157 = 0; local157 < 64; local157++) {
				this.anIntArray268[local157 + 192] = 16777215;
			}
			this.anIntArray269 = new int[256];
			for (@Pc(176) int local176 = 0; local176 < 64; local176++) {
				this.anIntArray269[local176] = local176 * 1024;
			}
			for (@Pc(191) int local191 = 0; local191 < 64; local191++) {
				this.anIntArray269[local191 + 64] = local191 * 4 + 65280;
			}
			for (@Pc(210) int local210 = 0; local210 < 64; local210++) {
				this.anIntArray269[local210 + 128] = local210 * 262144 + 65535;
			}
			for (@Pc(229) int local229 = 0; local229 < 64; local229++) {
				this.anIntArray269[local229 + 192] = 16777215;
			}
			this.anIntArray270 = new int[256];
			for (@Pc(248) int local248 = 0; local248 < 64; local248++) {
				this.anIntArray270[local248] = local248 * 4;
			}
			for (@Pc(263) int local263 = 0; local263 < 64; local263++) {
				this.anIntArray270[local263 + 64] = local263 * 262144 + 255;
			}
			for (@Pc(282) int local282 = 0; local282 < 64; local282++) {
				this.anIntArray270[local282 + 128] = local282 * 1024 + 16711935;
			}
			for (@Pc(301) int local301 = 0; local301 < 64; local301++) {
				this.anIntArray270[local301 + 192] = 16777215;
			}
			this.anIntArray267 = new int[256];
			this.anIntArray262 = new int[32768];
			this.anIntArray263 = new int[32768];
			this.method687(null);
			this.anIntArray223 = new int[32768];
			this.anIntArray224 = new int[32768];
			this.method586(10, "Connecting to fileserver");
			if (!this.aBoolean206) {
				this.aBoolean185 = true;
				this.aBoolean206 = true;
				this.method585(this, 2);
			}
		} catch (@Pc(358) RuntimeException local358) {
			signlink.reporterror("5228, " + arg0 + ", " + local358.toString());
			throw new RuntimeException();
		}
	}
}
