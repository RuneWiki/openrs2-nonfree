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

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "Z")
	private static boolean aBoolean217;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
	private static int anInt858;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
	public static int anInt869;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "Z")
	private static boolean aBoolean223;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "Z")
	private static boolean aBoolean228;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
	private static int anInt887;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "Z")
	private static boolean aBoolean230;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
	private static int anInt925;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
	private static int anInt938;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "I")
	private static int anInt944;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "I")
	private static int anInt963;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "I")
	private static int anInt972;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "I")
	private static int anInt974;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "Lclient!ZGNGQRPJ;")
	public static Class10_Sub1_Sub2_Sub3_Sub2 aClass10_Sub1_Sub2_Sub3_Sub2_1;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "I")
	private static int anInt975;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "Z")
	private static boolean aBoolean250;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
	private static int anInt1005;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
	private static int anInt1007;

	@OriginalMember(owner = "client!client", name = "Pj", descriptor = "I")
	private static int anInt1044;

	@OriginalMember(owner = "client!client", name = "fk", descriptor = "I")
	public static int anInt1050;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
	private static int anInt868 = 10;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "Z")
	private static boolean aBoolean222 = true;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "[I")
	private static int[] anIntArray228 = new int[99];

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "Z")
	private static boolean aBoolean229;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "Ljava/lang/String;")
	private static String aString23;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "[[I")
	public static final int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
	private static int anInt910;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "Z")
	private static boolean aBoolean249;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "[I")
	public static int[] anIntArray262;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "[I")
	public static final int[] anIntArray266;

	@OriginalMember(owner = "client!client", name = "Wj", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "I")
	private int anInt828;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "I")
	private int anInt829;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "I")
	private int anInt830;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "I")
	private int anInt831;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "I")
	private int anInt832;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "I")
	private int anInt833;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
	private int anInt834;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	private int anInt835;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
	private int anInt837;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "[I")
	private int[] anIntArray216;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "[I")
	private int[] anIntArray217;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "[I")
	private int[] anIntArray218;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
	private int anInt838;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	private int anInt839;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	private int anInt840;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
	private int anInt841;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
	private int anInt842;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
	private int anInt843;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
	private int anInt844;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	private int anInt845;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
	private int anInt846;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	private int anInt847;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
	private int anInt848;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	private int anInt849;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
	private int anInt850;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
	private int anInt851;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
	private int anInt852;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "Lclient!WRRBQEHV;")
	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_1;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "Lclient!WRRBQEHV;")
	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_2;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "Lclient!WRRBQEHV;")
	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_3;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "Lclient!WRRBQEHV;")
	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_4;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "Lclient!WRRBQEHV;")
	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_5;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
	private int anInt853;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "Lclient!ATJMVOZR;")
	private Class2 aClass2_2;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
	private int anInt854;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
	private int anInt855;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
	private int anInt856;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "Lclient!KRGHNEZN;")
	private Class25 aClass25_2;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
	private int anInt860;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
	private int anInt861;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
	private int anInt862;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "Lclient!ISZGOOMR;")
	private Class19 aClass19_3;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "Lclient!ISZGOOMR;")
	private Class19 aClass19_4;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "Lclient!ISZGOOMR;")
	private Class19 aClass19_5;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "Lclient!ISZGOOMR;")
	private Class19 aClass19_6;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "Lclient!ISZGOOMR;")
	private Class19 aClass19_7;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "Lclient!ISZGOOMR;")
	private Class19 aClass19_8;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "Lclient!ISZGOOMR;")
	private Class19 aClass19_9;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "Lclient!ISZGOOMR;")
	private Class19 aClass19_10;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "Lclient!ISZGOOMR;")
	private Class19 aClass19_11;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "I")
	private int anInt863;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "I")
	private int anInt864;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "I")
	private int anInt867;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
	private int anInt876;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
	private int anInt878;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "I")
	private int anInt879;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "Lclient!WRRBQEHV;")
	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_6;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "Lclient!WRRBQEHV;")
	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_7;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "Lclient!WRRBQEHV;")
	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_8;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "I")
	private int anInt885;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "Lclient!WRRBQEHV;")
	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_9;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "Lclient!WRRBQEHV;")
	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_10;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "Lclient!WRRBQEHV;")
	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_11;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "Lclient!WRRBQEHV;")
	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_12;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "Lclient!WRRBQEHV;")
	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_13;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
	private int anInt889;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
	private int anInt890;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "I")
	private int anInt891;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "I")
	private int anInt892;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "I")
	private int anInt893;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "I")
	private int anInt894;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "I")
	private int anInt895;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "I")
	private int anInt896;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "I")
	private int anInt897;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "[I")
	private int[] anIntArray236;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "[I")
	private int[] anIntArray237;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "[I")
	private int[] anIntArray238;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "[I")
	private int[] anIntArray239;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
	private int anInt899;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
	private int anInt900;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
	private int anInt902;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "I")
	private int anInt903;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
	private int anInt905;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "Lclient!EPQDEJTO;")
	private Class10_Sub1_Sub1_Sub1 aClass10_Sub1_Sub1_Sub1_3;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "Lclient!EPQDEJTO;")
	private Class10_Sub1_Sub1_Sub1 aClass10_Sub1_Sub1_Sub1_4;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "I")
	private int anInt906;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "I")
	private int anInt907;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
	private int anInt908;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private int anInt909;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "Lclient!GXWEWMHV;")
	private Class18 aClass18_1;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "Ljava/lang/String;")
	private String aString25;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "I")
	private int anInt911;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
	private int anInt912;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
	private int anInt913;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "Lclient!EPQDEJTO;")
	private Class10_Sub1_Sub1_Sub1 aClass10_Sub1_Sub1_Sub1_5;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "Lclient!EPQDEJTO;")
	private Class10_Sub1_Sub1_Sub1 aClass10_Sub1_Sub1_Sub1_6;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
	private int anInt914;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
	private int anInt915;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "I")
	private int anInt916;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
	private int anInt917;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
	private int anInt918;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
	private int anInt919;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
	private int anInt920;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
	private int anInt921;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
	private int anInt923;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "I")
	private int anInt929;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "Ljava/lang/String;")
	private String aString26;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "Lclient!JDPYRDAS;")
	private Class10_Sub1_Sub1_Sub2 aClass10_Sub1_Sub1_Sub2_2;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "Lclient!JDPYRDAS;")
	private Class10_Sub1_Sub1_Sub2 aClass10_Sub1_Sub1_Sub2_3;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "Lclient!JDPYRDAS;")
	private Class10_Sub1_Sub1_Sub2 aClass10_Sub1_Sub1_Sub2_4;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "Lclient!JDPYRDAS;")
	private Class10_Sub1_Sub1_Sub2 aClass10_Sub1_Sub1_Sub2_5;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
	private int anInt930;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private int anInt932;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "I")
	private int anInt935;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
	private int anInt936;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
	private int anInt939;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "[I")
	private int[] anIntArray249;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "[I")
	private int[] anIntArray250;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "Lclient!EPQDEJTO;")
	private Class10_Sub1_Sub1_Sub1 aClass10_Sub1_Sub1_Sub1_7;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "I")
	private int anInt940;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "I")
	private int anInt942;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private int anInt943;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "Lclient!WRRBQEHV;")
	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_14;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "Lclient!WRRBQEHV;")
	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_15;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
	private int anInt945;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "Lclient!EPQDEJTO;")
	private Class10_Sub1_Sub1_Sub1 aClass10_Sub1_Sub1_Sub1_8;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "Lclient!EPQDEJTO;")
	private Class10_Sub1_Sub1_Sub1 aClass10_Sub1_Sub1_Sub1_9;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
	private int anInt946;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "Lclient!ISZGOOMR;")
	private Class19 aClass19_12;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "Lclient!ISZGOOMR;")
	private Class19 aClass19_13;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "Lclient!ISZGOOMR;")
	private Class19 aClass19_14;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
	private int anInt948;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
	private int anInt951;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
	private int anInt952;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "Lclient!EPQDEJTO;")
	private Class10_Sub1_Sub1_Sub1 aClass10_Sub1_Sub1_Sub1_10;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "[Lclient!WRRBQEHV;")
	private Class10_Sub1_Sub1_Sub3[] aClass10_Sub1_Sub1_Sub3Array3;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
	private int anInt955;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
	private int anInt956;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "Lclient!EPQDEJTO;")
	private Class10_Sub1_Sub1_Sub1 aClass10_Sub1_Sub1_Sub1_11;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "I")
	private int anInt958;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
	private int anInt959;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
	private int anInt960;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "I")
	private int anInt962;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
	private int anInt966;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
	private int anInt967;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
	private int anInt968;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "Ljava/lang/String;")
	private String aString30;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
	private int anInt969;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "Lclient!ISZGOOMR;")
	private Class19 aClass19_15;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "Lclient!ISZGOOMR;")
	private Class19 aClass19_16;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "Lclient!ISZGOOMR;")
	private Class19 aClass19_17;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "Lclient!ISZGOOMR;")
	private Class19 aClass19_18;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "Lclient!KJCMXHNO;")
	private Class23 aClass23_1;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "I")
	private int anInt978;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "I")
	private int anInt979;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "I")
	private int anInt980;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "Ljava/lang/String;")
	private String aString31;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "[I")
	private int[] anIntArray259;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "[I")
	private int[] anIntArray260;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "I")
	private int anInt983;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "Lclient!WRRBQEHV;")
	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_16;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "Lclient!WRRBQEHV;")
	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_17;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "Lclient!WRRBQEHV;")
	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_18;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "Lclient!EPQDEJTO;")
	private Class10_Sub1_Sub1_Sub1 aClass10_Sub1_Sub1_Sub1_12;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "Lclient!EPQDEJTO;")
	private Class10_Sub1_Sub1_Sub1 aClass10_Sub1_Sub1_Sub1_13;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "Lclient!EPQDEJTO;")
	private Class10_Sub1_Sub1_Sub1 aClass10_Sub1_Sub1_Sub1_14;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "Lclient!EPQDEJTO;")
	private Class10_Sub1_Sub1_Sub1 aClass10_Sub1_Sub1_Sub1_15;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "Lclient!EPQDEJTO;")
	private Class10_Sub1_Sub1_Sub1 aClass10_Sub1_Sub1_Sub1_16;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "I")
	private int anInt986;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "Lclient!ISZGOOMR;")
	private Class19 aClass19_19;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "Lclient!ISZGOOMR;")
	private Class19 aClass19_20;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "Lclient!ISZGOOMR;")
	private Class19 aClass19_21;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "Lclient!ISZGOOMR;")
	private Class19 aClass19_22;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "Lclient!ISZGOOMR;")
	private Class19 aClass19_23;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "Lclient!ISZGOOMR;")
	private Class19 aClass19_24;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "Lclient!ISZGOOMR;")
	private Class19 aClass19_25;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "Lclient!ISZGOOMR;")
	private Class19 aClass19_26;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "Lclient!ISZGOOMR;")
	private Class19 aClass19_27;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
	private int anInt987;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
	private int anInt989;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "I")
	private int anInt990;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
	private int anInt991;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "I")
	private int anInt992;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "I")
	private int anInt993;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
	private int anInt994;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
	private int anInt995;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
	private int anInt997;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
	private int anInt998;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
	private int anInt999;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "I")
	private int anInt1000;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
	private int anInt1003;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
	private int anInt1008;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "I")
	private int anInt1010;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "I")
	private int anInt1011;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "Lclient!EPQDEJTO;")
	private Class10_Sub1_Sub1_Sub1 aClass10_Sub1_Sub1_Sub1_17;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "Lclient!BORSVOPG;")
	private Class7 aClass7_1;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
	private int anInt1013;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
	private int anInt1014;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "I")
	private int anInt1015;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
	private int anInt1016;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private int anInt1019;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "I")
	private int anInt1020;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "I")
	private int anInt1021;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "I")
	private int anInt1022;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
	private int anInt1023;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "I")
	private int anInt1025;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
	private int anInt1030;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "I")
	private int anInt1033;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "Lclient!ZPGPWCCV;")
	private Class33_Sub1 aClass33_Sub1_1;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "Lclient!WRRBQEHV;")
	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_19;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "Lclient!WRRBQEHV;")
	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_20;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "I")
	private int anInt1034;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "I")
	private int anInt1035;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "I")
	private int anInt1036;

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "I")
	private int anInt1037;

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "I")
	private int anInt1038;

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "I")
	private int anInt1039;

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "I")
	private int anInt1040;

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "I")
	private int anInt1041;

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "I")
	private int anInt1042;

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "I")
	private int anInt1043;

	@OriginalMember(owner = "client!client", name = "Qj", descriptor = "[I")
	private int[] anIntArray271;

	@OriginalMember(owner = "client!client", name = "Rj", descriptor = "[I")
	private int[] anIntArray272;

	@OriginalMember(owner = "client!client", name = "Sj", descriptor = "[I")
	private int[] anIntArray273;

	@OriginalMember(owner = "client!client", name = "Tj", descriptor = "[I")
	private int[] anIntArray274;

	@OriginalMember(owner = "client!client", name = "Vj", descriptor = "I")
	private int anInt1045;

	@OriginalMember(owner = "client!client", name = "Zj", descriptor = "I")
	private int anInt1047;

	@OriginalMember(owner = "client!client", name = "ck", descriptor = "I")
	private int anInt1048;

	@OriginalMember(owner = "client!client", name = "ek", descriptor = "I")
	private int anInt1049;

	@OriginalMember(owner = "client!client", name = "jk", descriptor = "I")
	private int anInt1053;

	@OriginalMember(owner = "client!client", name = "kk", descriptor = "I")
	private int anInt1054;

	@OriginalMember(owner = "client!client", name = "lk", descriptor = "I")
	private int anInt1055;

	@OriginalMember(owner = "client!client", name = "mk", descriptor = "I")
	private int anInt1056;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "[I")
	private int[] anIntArray212 = new int[9];

	@OriginalMember(owner = "client!client", name = "M", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "P", descriptor = "[I")
	private int[] anIntArray213 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "[I")
	private int[] anIntArray214 = new int[Class43.anInt612];

	@OriginalMember(owner = "client!client", name = "W", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[200];

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "[I")
	private int[] anIntArray215 = new int[5];

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
	private int anInt836 = 2;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Ljava/lang/String;")
	private String aString18 = "";

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[100];

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "[I")
	private int[] anIntArray219 = new int[100];

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Z")
	private boolean aBoolean216 = false;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "[[I")
	private int[][] anIntArrayArray22 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "[[I")
	private int[][] anIntArrayArray23 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "Z")
	private boolean aBoolean218 = false;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private int anInt857 = -992;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "[Lclient!EPQDEJTO;")
	private Class10_Sub1_Sub1_Sub1[] aClass10_Sub1_Sub1_Sub1Array4 = new Class10_Sub1_Sub1_Sub1[8];

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private int anInt859 = 559;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "B")
	private byte aByte45 = 6;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "Z")
	private boolean aBoolean219 = false;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "B")
	private byte aByte46 = -123;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "I")
	private int anInt865 = 2;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "Z")
	private boolean aBoolean220 = true;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "Z")
	private boolean aBoolean221 = true;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "[I")
	private int[] anIntArray220 = new int[151];

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
	private int anInt866 = 8;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
	private int anInt870 = -188;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "Lclient!MFMVIYHT;")
	private Class10_Sub1_Sub3 aClass10_Sub1_Sub3_6 = Class10_Sub1_Sub3.method299();

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
	private int anInt871 = 2301979;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "I")
	private int anInt872 = -1;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
	private int anInt873 = -1;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "Z")
	private boolean aBoolean224 = true;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
	private int anInt874 = -1;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "B")
	private byte aByte47 = -113;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "Ljava/lang/String;")
	private String aString19 = "";

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "I")
	private int anInt875 = -214;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
	private int anInt877 = 50;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "[I")
	private int[] anIntArray221 = new int[this.anInt877];

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "[I")
	private int[] anIntArray222 = new int[this.anInt877];

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "[I")
	private int[] anIntArray223 = new int[this.anInt877];

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "[I")
	private int[] anIntArray224 = new int[this.anInt877];

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "[I")
	private int[] anIntArray225 = new int[this.anInt877];

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "[I")
	private int[] anIntArray226 = new int[this.anInt877];

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "[I")
	private int[] anIntArray227 = new int[this.anInt877];

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[this.anInt877];

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "Ljava/lang/String;")
	private String aString20 = "";

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "Z")
	private boolean aBoolean226 = false;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "[Lclient!EPQDEJTO;")
	private Class10_Sub1_Sub1_Sub1[] aClass10_Sub1_Sub1_Sub1Array5 = new Class10_Sub1_Sub1_Sub1[32];

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "B")
	private byte aByte48 = 1;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "Ljava/lang/String;")
	private String aString21 = "";

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "Ljava/lang/String;")
	private String aString22 = "";

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "Z")
	private boolean aBoolean227 = true;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "I")
	private int anInt880 = -1;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
	private int anInt881 = -1;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "Lclient!MFMVIYHT;")
	private Class10_Sub1_Sub3 aClass10_Sub1_Sub3_7 = Class10_Sub1_Sub3.method299();

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
	private int anInt882 = 2048;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "I")
	private int anInt883 = 2047;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "[Lclient!ZGNGQRPJ;")
	private Class10_Sub1_Sub2_Sub3_Sub2[] aClass10_Sub1_Sub2_Sub3_Sub2Array1 = new Class10_Sub1_Sub2_Sub3_Sub2[this.anInt882];

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "[I")
	private int[] anIntArray229 = new int[this.anInt882];

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "[I")
	private int[] anIntArray230 = new int[this.anInt882];

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "[Lclient!MFMVIYHT;")
	private Class10_Sub1_Sub3[] aClass10_Sub1_Sub3Array1 = new Class10_Sub1_Sub3[this.anInt882];

	@OriginalMember(owner = "client!client", name = "td", descriptor = "[Lclient!WRRBQEHV;")
	private Class10_Sub1_Sub1_Sub3[] aClass10_Sub1_Sub1_Sub3Array2 = new Class10_Sub1_Sub1_Sub3[13];

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "[I")
	private int[] anIntArray231 = new int[500];

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "[I")
	private int[] anIntArray232 = new int[500];

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "[I")
	private int[] anIntArray233 = new int[500];

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "[I")
	private int[] anIntArray234 = new int[500];

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
	private int anInt888 = -1;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "[I")
	private int[] anIntArray235 = new int[5];

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "[I")
	private int[] anIntArray240 = new int[2000];

	@OriginalMember(owner = "client!client", name = "be", descriptor = "I")
	private int anInt901 = 2;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "Z")
	private boolean aBoolean231 = false;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "Z")
	private boolean aBoolean232 = false;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "[I")
	private int[] anIntArray241 = new int[151];

	@OriginalMember(owner = "client!client", name = "re", descriptor = "Ljava/lang/String;")
	private String aString24 = "";

	@OriginalMember(owner = "client!client", name = "te", descriptor = "Z")
	private boolean aBoolean233 = false;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "[I")
	private int[] anIntArray242 = new int[Class43.anInt612];

	@OriginalMember(owner = "client!client", name = "we", descriptor = "[Lclient!EPQDEJTO;")
	private Class10_Sub1_Sub1_Sub1[] aClass10_Sub1_Sub1_Sub1Array6 = new Class10_Sub1_Sub1_Sub1[100];

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "[I")
	private final int[] anIntArray243 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "Z")
	private boolean aBoolean234 = false;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "Z")
	private boolean aBoolean235 = true;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "[I")
	public int[] anIntArray244 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "Z")
	private boolean aBoolean236 = false;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
	private int anInt924 = 69;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
	private int anInt926 = -1;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "[I")
	private int[] anIntArray245 = new int[Class43.anInt612];

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
	private int anInt927 = 2;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
	private int anInt928 = 3;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "Z")
	private boolean aBoolean237 = false;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "B")
	private byte aByte49 = 1;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "Z")
	private boolean aBoolean238 = false;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[5];

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "I")
	private int anInt934 = 20411;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "of", descriptor = "Z")
	private boolean aBoolean239 = false;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "[I")
	private int[] anIntArray246 = new int[1000];

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "[I")
	private int[] anIntArray247 = new int[1000];

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "[Lclient!EPQDEJTO;")
	private Class10_Sub1_Sub1_Sub1[] aClass10_Sub1_Sub1_Sub1Array7 = new Class10_Sub1_Sub1_Sub1[32];

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
	private int anInt937 = 5063219;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "[I")
	private int[] anIntArray248 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
	private int anInt941 = -1;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "[I")
	private int[] anIntArray251 = new int[50];

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "Ljava/lang/String;")
	private String aString27 = "";

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "Ljava/lang/String;")
	private String aString28 = "";

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "Z")
	private boolean aBoolean240 = false;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "Z")
	private boolean aBoolean241 = false;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "[I")
	private int[] anIntArray252 = new int[5];

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "Ljava/lang/String;")
	private String aString29 = "";

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "[I")
	private int[] anIntArray253 = new int[5];

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private int anInt947 = 78;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
	private int anInt954 = -30658;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "[I")
	private int[] anIntArray254 = new int[4000];

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "[I")
	private int[] anIntArray255 = new int[4000];

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "Z")
	private boolean aBoolean242 = false;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "[J")
	private long[] aLongArray4 = new long[200];

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "Lclient!MFMVIYHT;")
	private Class10_Sub1_Sub3 aClass10_Sub1_Sub3_8 = new Class10_Sub1_Sub3(true, new byte[5000]);

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "[Lclient!RGHBDSIJ;")
	private Class10_Sub1_Sub2_Sub3_Sub1[] aClass10_Sub1_Sub2_Sub3_Sub1Array1 = new Class10_Sub1_Sub2_Sub3_Sub1[16384];

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "[I")
	private int[] anIntArray256 = new int[16384];

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
	private int anInt961 = 7759444;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "Z")
	private boolean aBoolean243 = false;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "Z")
	public boolean aBoolean244 = false;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
	private int anInt964 = -110;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "[Lclient!WRRBQEHV;")
	private Class10_Sub1_Sub1_Sub3[] aClass10_Sub1_Sub1_Sub3Array4 = new Class10_Sub1_Sub1_Sub3[2];

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "B")
	private byte aByte50 = -80;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "Z")
	private boolean aBoolean245 = true;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "[I")
	private int[] anIntArray257 = new int[5];

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "[Lclient!WRRBQEHV;")
	private Class10_Sub1_Sub1_Sub3[] aClass10_Sub1_Sub1_Sub3Array5 = new Class10_Sub1_Sub1_Sub3[100];

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "I")
	private int anInt971 = -916;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "Z")
	private boolean aBoolean246 = false;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "B")
	private byte aByte51 = 97;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "Z")
	private boolean aBoolean247 = false;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "[I")
	private int[] anIntArray258 = new int[256];

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "I")
	private int anInt976 = -1;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "I")
	private int anInt981 = -89;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "I")
	private int anInt982 = 300;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "[I")
	private int[] anIntArray261 = new int[33];

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "Z")
	private boolean aBoolean248 = false;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "[Lclient!EPQDEJTO;")
	private Class10_Sub1_Sub1_Sub1[] aClass10_Sub1_Sub1_Sub1Array8 = new Class10_Sub1_Sub1_Sub1[20];

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[500];

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "Lclient!MFMVIYHT;")
	private Class10_Sub1_Sub3 aClass10_Sub1_Sub3_9 = Class10_Sub1_Sub3.method299();

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
	private int anInt985 = -1;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "Z")
	private boolean aBoolean251 = false;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "Lclient!BOHLFXVX;")
	private Class6 aClass6_10 = new Class6(true);

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "Z")
	private boolean aBoolean252 = false;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "Z")
	private boolean aBoolean253 = false;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "I")
	private int anInt988 = -1;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "[Lclient!KNWRHOKF;")
	public Class24[] aClass24Array1 = new Class24[5];

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
	private int anInt1002 = -1;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "I")
	private int anInt1004 = 1;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
	private int anInt1006 = 326;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "Z")
	private boolean aBoolean254 = false;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "Z")
	private boolean aBoolean255 = false;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "Z")
	private volatile boolean aBoolean257 = false;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "Lclient!EWIXBTLV;")
	private Class14 aClass14_1 = new Class14();

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "I")
	private int anInt1012 = 128;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
	private int anInt1017 = 1;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
	private final int anInt1018 = 100;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "[I")
	private int[] anIntArray263 = new int[100];

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "[I")
	private int[] anIntArray264 = new int[50];

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "[Lclient!XRENONSA;")
	private Class47[] aClass47Array1 = new Class47[4];

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "Lclient!BOHLFXVX;")
	private Class6 aClass6_11 = new Class6(true);

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "Z")
	private boolean aBoolean258 = false;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "Z")
	private boolean aBoolean259 = true;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "[I")
	private int[] anIntArray265 = new int[200];

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "Z")
	private boolean aBoolean260 = true;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
	private int anInt1024 = -1;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "Z")
	private boolean aBoolean261 = true;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "Z")
	private boolean aBoolean262 = true;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "I")
	private int anInt1026 = -1;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "Z")
	private boolean aBoolean263 = false;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "[Lclient!EPQDEJTO;")
	private Class10_Sub1_Sub1_Sub1[] aClass10_Sub1_Sub1_Sub1Array9 = new Class10_Sub1_Sub1_Sub1[1000];

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "I")
	private int anInt1027 = -1;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
	private int anInt1029 = -939;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "Lclient!BOHLFXVX;")
	private Class6 aClass6_12 = new Class6(true);

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "Z")
	private boolean aBoolean264 = false;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "I")
	private int anInt1031 = 3;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "[I")
	private int[] anIntArray267 = new int[33];

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "I")
	private int anInt1032 = 3353893;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "[Lclient!EPQDEJTO;")
	private Class10_Sub1_Sub1_Sub1[] aClass10_Sub1_Sub1_Sub1Array10 = new Class10_Sub1_Sub1_Sub1[32];

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "[I")
	private int[] anIntArray268 = new int[] { 17, 24, 34, 40 };

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "[I")
	private int[] anIntArray269 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "[I")
	private int[] anIntArray270 = new int[100];

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[100];

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray14 = new String[100];

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "Z")
	private boolean aBoolean265 = true;

	@OriginalMember(owner = "client!client", name = "Uj", descriptor = "Z")
	private volatile boolean aBoolean266 = false;

	@OriginalMember(owner = "client!client", name = "Xj", descriptor = "B")
	private byte aByte52 = -58;

	@OriginalMember(owner = "client!client", name = "Yj", descriptor = "I")
	private int anInt1046 = 416;

	@OriginalMember(owner = "client!client", name = "ak", descriptor = "Z")
	private volatile boolean aBoolean267 = false;

	@OriginalMember(owner = "client!client", name = "bk", descriptor = "[I")
	private int[] anIntArray275 = new int[50];

	@OriginalMember(owner = "client!client", name = "dk", descriptor = "[[[Lclient!BOHLFXVX;")
	private Class6[][][] aClass6ArrayArrayArray1 = new Class6[4][104][104];

	@OriginalMember(owner = "client!client", name = "gk", descriptor = "[I")
	private int[] anIntArray276 = new int[7];

	@OriginalMember(owner = "client!client", name = "hk", descriptor = "I")
	private int anInt1051 = -1;

	@OriginalMember(owner = "client!client", name = "ik", descriptor = "I")
	private int anInt1052 = 409;

	static {
		@Pc(13) int local13 = 0;
		@Pc(15) int local15;
		for (local15 = 0; local15 < 99; local15++) {
			@Pc(20) int local20 = local15 + 1;
			@Pc(33) int local33 = (int) ((double) local20 + Math.pow(2.0D, (double) local20 / 7.0D) * 300.0D);
			local13 += local33;
			anIntArray228[local15] = local13 / 4;
		}
		aBoolean229 = true;
		aString23 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		anIntArrayArray24 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		anInt910 = -352;
		aBoolean249 = true;
		anIntArray262 = new int[32];
		local13 = 2;
		for (local15 = 0; local15 < 32; local15++) {
			anIntArray262[local15] = local13 - 1;
			local13 += local13;
		}
		aBoolean256 = true;
		anIntArray266 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 377);
			if (arg0.length == 5) {
				anInt868 = Integer.parseInt(arg0[0]);
				anInt869 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method676();
				} else if (arg0[2].equals("highmem")) {
					method602();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean222 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean222 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt1059 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method576(anInt910);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)Ljava/lang/String;")
	private static String method595(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("44898, " + arg0 + ", " + -243 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private static void method602() {
		try {
			Class23.aBoolean93 = false;
			Class10_Sub1_Sub1_Sub4.aBoolean176 = false;
			aBoolean223 = false;
			Class8.aBoolean15 = false;
			Class48.aBoolean183 = false;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("29613, " + true + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Ljava/lang/String;")
	private static String method667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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
			signlink.reporterror("11680, " + arg0 + ", " + arg1 + ", " + 736 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private static void method676() {
		try {
			Class23.aBoolean93 = true;
			Class10_Sub1_Sub1_Sub4.aBoolean176 = true;
			aBoolean223 = true;
			Class8.aBoolean15 = true;
			Class48.aBoolean183 = true;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("10008, " + true + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(II)Ljava/lang/String;")
	private static String method710(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) String local4 = String.valueOf(arg0);
			for (@Pc(15) int local15 = local4.length() - 3; local15 > 0; local15 -= 3) {
				local4 = local4.substring(0, local15) + "," + local4.substring(local15);
			}
			if (local4.length() > 8) {
				local4 = "@gre@" + local4.substring(0, local4.length() - 8) + " million @whi@(" + local4 + ")";
			} else if (local4.length() > 4) {
				local4 = "@cya@" + local4.substring(0, local4.length() - 4) + "K @whi@(" + local4 + ")";
			}
			return " " + local4;
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("88511, " + 0 + ", " + arg0 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method589(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null || arg0.length() == 0) {
				this.anInt840 = 0;
			} else {
				@Pc(12) String local12 = arg0;
				@Pc(15) String[] local15 = new String[100];
				@Pc(17) int local17 = 0;
				while (true) {
					@Pc(21) int local21 = local12.indexOf(" ");
					if (local21 == -1) {
						local12 = local12.trim();
						if (local12.length() > 0) {
							local15[local17++] = local12.toLowerCase();
						}
						this.anInt840 = 0;
						label49: for (local21 = 0; local21 < Class17.anInt179; local21++) {
							@Pc(81) Class17 local81 = Class17.method104(local21);
							if (local81.anInt182 == -1 && local81.aString7 != null) {
								@Pc(92) String local92 = local81.aString7.toLowerCase();
								for (@Pc(94) int local94 = 0; local94 < local17; local94++) {
									if (local92.indexOf(local15[local94]) == -1) {
										continue label49;
									}
								}
								this.aStringArray9[this.anInt840] = local92;
								this.anIntArray219[this.anInt840] = local21;
								this.anInt840++;
								if (this.anInt840 >= this.aStringArray9.length) {
									return;
								}
							}
						}
						return;
					}
					@Pc(30) String local30 = local12.substring(0, local21).trim();
					if (local30.length() > 0) {
						local15[local17++] = local30.toLowerCase();
					}
					local12 = local12.substring(local21 + 1);
				}
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("28494, " + arg0 + ", " + 2 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method590() {
		try {
			this.aClass10_Sub1_Sub3_7.method300(110);
			if (this.anInt941 != -1) {
				this.method619(aBoolean249, this.anInt941);
				this.anInt941 = -1;
				this.aBoolean248 = true;
				this.aBoolean254 = false;
				this.aBoolean225 = true;
			}
			if (this.anInt888 != -1) {
				this.method619(aBoolean249, this.anInt888);
				this.anInt888 = -1;
				this.aBoolean255 = true;
				this.aBoolean254 = false;
			}
			if (this.anInt926 != -1) {
				this.method619(aBoolean249, this.anInt926);
				this.anInt926 = -1;
				this.aBoolean236 = true;
			}
			if (this.anInt880 != -1) {
				this.method619(aBoolean249, this.anInt880);
				this.anInt880 = -1;
			}
			if (this.anInt976 != -1) {
				this.method619(aBoolean249, this.anInt976);
				this.anInt976 = -1;
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("64395, " + false + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!MFMVIYHT;)V")
	private void method591(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class10_Sub1_Sub3 arg2) {
		try {
			while (true) {
				if (arg2.anInt429 + 10 < arg0 * 8) {
					@Pc(12) int local12 = arg2.method322(11);
					if (local12 != 2047) {
						if (this.aClass10_Sub1_Sub2_Sub3_Sub2Array1[local12] == null) {
							this.aClass10_Sub1_Sub2_Sub3_Sub2Array1[local12] = new Class10_Sub1_Sub2_Sub3_Sub2();
							if (this.aClass10_Sub1_Sub3Array1[local12] != null) {
								this.aClass10_Sub1_Sub2_Sub3_Sub2Array1[local12].method545(this.aClass10_Sub1_Sub3Array1[local12]);
							}
						}
						this.anIntArray229[this.anInt884++] = local12;
						@Pc(58) Class10_Sub1_Sub2_Sub3_Sub2 local58 = this.aClass10_Sub1_Sub2_Sub3_Sub2Array1[local12];
						local58.anInt718 = anInt1050;
						@Pc(66) int local66 = arg2.method322(5);
						if (local66 > 15) {
							local66 -= 32;
						}
						@Pc(75) int local75 = arg2.method322(1);
						if (local75 == 1) {
							this.anIntArray230[this.anInt885++] = local12;
						}
						@Pc(94) int local94 = arg2.method322(1);
						@Pc(99) int local99 = arg2.method322(5);
						if (local99 > 15) {
							local99 -= 32;
						}
						local58.method542(aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0] + local99, (byte) 5, local94 == 1, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0] + local66);
						continue;
					}
				}
				arg2.method323();
				@Pc(134) boolean local134 = false;
				return;
			}
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("45666, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method592(@OriginalArg(0) byte arg0) {
		try {
			this.aBoolean267 = true;
			@Pc(9) boolean local9 = false;
			try {
				@Pc(16) long local16 = System.currentTimeMillis();
				@Pc(18) int local18 = 0;
				@Pc(20) int local20 = 20;
				while (this.aBoolean257) {
					this.anInt945++;
					this.method656((byte) 1);
					this.method656((byte) 1);
					this.method673(47);
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
			this.aBoolean267 = false;
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("1126, " + arg0 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method593() {
		try {
			for (@Pc(10) Class10_Sub2 local10 = (Class10_Sub2) this.aClass6_11.method6(); local10 != null; local10 = (Class10_Sub2) this.aClass6_11.method8()) {
				if (local10.anInt453 == -1) {
					local10.anInt458 = 0;
					this.method715(local10);
				} else {
					local10.method534();
				}
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("86545, " + 3 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)V")
	private void method594(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method583(@OriginalArg(0) int arg0) {
		try {
			this.aClass10_Sub1_Sub2_Sub3_Sub2Array1 = null;
			this.anIntArray229 = null;
			this.anIntArray230 = null;
			this.aClass10_Sub1_Sub3Array1 = null;
			this.anIntArray269 = null;
			this.aClass19_3 = null;
			this.aClass19_4 = null;
			this.aClass19_5 = null;
			this.aClass19_6 = null;
			this.aClass10_Sub1_Sub1_Sub3_1 = null;
			this.aClass10_Sub1_Sub1_Sub3_2 = null;
			this.aClass10_Sub1_Sub1_Sub3_3 = null;
			this.aClass10_Sub1_Sub1_Sub3_4 = null;
			this.aClass10_Sub1_Sub1_Sub3_5 = null;
			this.aClass10_Sub1_Sub1_Sub3_9 = null;
			this.aClass10_Sub1_Sub1_Sub3_10 = null;
			this.aClass10_Sub1_Sub1_Sub3_11 = null;
			this.aClass10_Sub1_Sub1_Sub3_12 = null;
			this.aClass10_Sub1_Sub1_Sub3_13 = null;
			this.aStringArray8 = null;
			this.aLongArray4 = null;
			this.anIntArray265 = null;
			this.aClass19_12 = null;
			this.aClass19_13 = null;
			this.aClass19_14 = null;
			this.anIntArray244 = null;
			this.anIntArray216 = null;
			this.aByteArrayArray5 = null;
			this.aByteArrayArray6 = null;
			this.anIntArray217 = null;
			this.anIntArray218 = null;
			this.aClass19_24 = null;
			this.aClass19_25 = null;
			this.aClass19_26 = null;
			this.aClass19_27 = null;
			this.anIntArrayArray22 = null;
			this.anIntArrayArray25 = null;
			this.anIntArray254 = null;
			this.anIntArray255 = null;
			this.aClass10_Sub1_Sub1_Sub1_12 = null;
			this.aClass10_Sub1_Sub1_Sub1_13 = null;
			this.aClass10_Sub1_Sub1_Sub1_14 = null;
			this.aClass10_Sub1_Sub1_Sub1_15 = null;
			this.aClass10_Sub1_Sub1_Sub1_16 = null;
			if (this.aClass7_1 != null) {
				this.aClass7_1.aBoolean12 = false;
			}
			this.aClass7_1 = null;
			this.aClass10_Sub1_Sub1_Sub3_6 = null;
			this.aClass10_Sub1_Sub1_Sub3_7 = null;
			this.aClass10_Sub1_Sub1_Sub3_8 = null;
			this.aClass19_7 = null;
			this.aClass19_8 = null;
			this.aClass19_9 = null;
			this.aClass19_10 = null;
			this.aClass19_11 = null;
			this.anIntArrayArrayArray8 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass23_1 = null;
			this.aClass47Array1 = null;
			this.aClass10_Sub1_Sub1_Sub1_11 = null;
			this.aClass19_22 = null;
			this.aClass19_23 = null;
			this.aClass19_19 = null;
			this.aClass19_20 = null;
			this.aClass19_21 = null;
			this.aClass10_Sub1_Sub1_Sub1_10 = null;
			this.aClass10_Sub1_Sub1_Sub1Array8 = null;
			this.aClass10_Sub1_Sub1_Sub1Array10 = null;
			this.aClass10_Sub1_Sub1_Sub1Array7 = null;
			this.aClass10_Sub1_Sub1_Sub1Array5 = null;
			this.aClass10_Sub1_Sub1_Sub1Array4 = null;
			this.method625();
			this.aClass10_Sub1_Sub3_7 = null;
			this.aClass10_Sub1_Sub3_6 = null;
			this.aClass10_Sub1_Sub3_9 = null;
			this.aClass19_15 = null;
			this.aClass19_16 = null;
			this.aClass19_17 = null;
			this.aClass19_18 = null;
			this.aClass10_Sub1_Sub1_Sub3_16 = null;
			this.aClass10_Sub1_Sub1_Sub3_17 = null;
			this.aClass10_Sub1_Sub1_Sub3_18 = null;
			try {
				if (this.aClass18_1 != null) {
					this.aClass18_1.method116();
				}
			} catch (@Pc(254) Exception local254) {
			}
			this.aClass18_1 = null;
			this.anIntArray246 = null;
			this.anIntArray247 = null;
			this.aClass10_Sub1_Sub1_Sub1Array9 = null;
			this.aClass10_Sub1_Sub2_Sub3_Sub1Array1 = null;
			this.anIntArray256 = null;
			this.aByteArray21 = null;
			this.aClass10_Sub1_Sub3_8 = null;
			this.aClass10_Sub1_Sub1_Sub3Array5 = null;
			this.aClass10_Sub1_Sub1_Sub1Array6 = null;
			this.anIntArrayArray23 = null;
			this.aClass10_Sub1_Sub1_Sub3Array2 = null;
			this.aClass6_12 = null;
			this.aClass6_10 = null;
			this.aClass10_Sub1_Sub1_Sub1_7 = null;
			if (this.aClass33_Sub1_1 != null) {
				this.aClass33_Sub1_1.method568();
			}
			this.aClass33_Sub1_1 = null;
			this.anIntArray231 = null;
			this.anIntArray232 = null;
			this.anIntArray233 = null;
			this.anIntArray234 = null;
			this.aStringArray12 = null;
			this.aClass6ArrayArrayArray1 = null;
			@Pc(330) boolean local330 = false;
			this.aClass6_11 = null;
			this.method716();
			Class48.method533();
			Class38.method401();
			Class17.method114();
			Class14.method94();
			Class16.aClass16Array1 = null;
			Class49.aClass49Array1 = null;
			Class4.aClass4Array1 = null;
			Class15.aClass15Array1 = null;
			Class28.aClass28Array1 = null;
			Class28.aClass34_5 = null;
			Class44.aClass44Array1 = null;
			super.aClass19_2 = null;
			Class10_Sub1_Sub2_Sub3_Sub2.aClass34_9 = null;
			Class10_Sub1_Sub1_Sub4.method506();
			Class23.method189();
			Class10_Sub1_Sub2_Sub4.method267();
			Class22.method167();
			System.gc();
		} catch (@Pc(374) RuntimeException local374) {
			signlink.reporterror("77909, " + arg0 + ", " + local374.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method596() {
		try {
			if (super.anInt821 == 1) {
				if (super.anInt822 >= 539 && super.anInt822 <= 573 && super.anInt823 >= 169 && super.anInt823 < 205 && this.anIntArray248[0] != -1) {
					this.aBoolean248 = true;
					this.anInt1031 = 0;
					this.aBoolean225 = true;
				}
				if (super.anInt822 >= 569 && super.anInt822 <= 599 && super.anInt823 >= 168 && super.anInt823 < 205 && this.anIntArray248[1] != -1) {
					this.aBoolean248 = true;
					this.anInt1031 = 1;
					this.aBoolean225 = true;
				}
				if (super.anInt822 >= 597 && super.anInt822 <= 627 && super.anInt823 >= 168 && super.anInt823 < 205 && this.anIntArray248[2] != -1) {
					this.aBoolean248 = true;
					this.anInt1031 = 2;
					this.aBoolean225 = true;
				}
				if (super.anInt822 >= 625 && super.anInt822 <= 669 && super.anInt823 >= 168 && super.anInt823 < 203 && this.anIntArray248[3] != -1) {
					this.aBoolean248 = true;
					this.anInt1031 = 3;
					this.aBoolean225 = true;
				}
				if (super.anInt822 >= 666 && super.anInt822 <= 696 && super.anInt823 >= 168 && super.anInt823 < 205 && this.anIntArray248[4] != -1) {
					this.aBoolean248 = true;
					this.anInt1031 = 4;
					this.aBoolean225 = true;
				}
				if (super.anInt822 >= 694 && super.anInt822 <= 724 && super.anInt823 >= 168 && super.anInt823 < 205 && this.anIntArray248[5] != -1) {
					this.aBoolean248 = true;
					this.anInt1031 = 5;
					this.aBoolean225 = true;
				}
				if (super.anInt822 >= 722 && super.anInt822 <= 756 && super.anInt823 >= 169 && super.anInt823 < 205 && this.anIntArray248[6] != -1) {
					this.aBoolean248 = true;
					this.anInt1031 = 6;
					this.aBoolean225 = true;
				}
				if (super.anInt822 >= 540 && super.anInt822 <= 574 && super.anInt823 >= 466 && super.anInt823 < 502 && this.anIntArray248[7] != -1) {
					this.aBoolean248 = true;
					this.anInt1031 = 7;
					this.aBoolean225 = true;
				}
				if (super.anInt822 >= 572 && super.anInt822 <= 602 && super.anInt823 >= 466 && super.anInt823 < 503 && this.anIntArray248[8] != -1) {
					this.aBoolean248 = true;
					this.anInt1031 = 8;
					this.aBoolean225 = true;
				}
				if (super.anInt822 >= 599 && super.anInt822 <= 629 && super.anInt823 >= 466 && super.anInt823 < 503 && this.anIntArray248[9] != -1) {
					this.aBoolean248 = true;
					this.anInt1031 = 9;
					this.aBoolean225 = true;
				}
				if (super.anInt822 >= 627 && super.anInt822 <= 671 && super.anInt823 >= 467 && super.anInt823 < 502 && this.anIntArray248[10] != -1) {
					this.aBoolean248 = true;
					this.anInt1031 = 10;
					this.aBoolean225 = true;
				}
				if (super.anInt822 >= 669 && super.anInt822 <= 699 && super.anInt823 >= 466 && super.anInt823 < 503 && this.anIntArray248[11] != -1) {
					this.aBoolean248 = true;
					this.anInt1031 = 11;
					this.aBoolean225 = true;
				}
				if (super.anInt822 >= 696 && super.anInt822 <= 726 && super.anInt823 >= 466 && super.anInt823 < 503 && this.anIntArray248[12] != -1) {
					this.aBoolean248 = true;
					this.anInt1031 = 12;
					this.aBoolean225 = true;
				}
				if (super.anInt822 >= 724 && super.anInt822 <= 758 && super.anInt823 >= 466 && super.anInt823 < 502 && this.anIntArray248[13] != -1) {
					this.aBoolean248 = true;
					this.anInt1031 = 13;
					this.aBoolean225 = true;
					return;
				}
			}
		} catch (@Pc(442) RuntimeException local442) {
			signlink.reporterror("42246, " + false + ", " + local442.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method597(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			try {
				@Pc(11) int local11 = aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt739 + this.anInt835;
				@Pc(17) int local17 = aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt740 + this.anInt900;
				if (this.anInt1019 - local11 < -500 || this.anInt1019 - local11 > 500 || this.anInt1020 - local17 < -500 || this.anInt1020 - local17 > 500) {
					this.anInt1019 = local11;
					this.anInt1020 = local17;
				}
				if (this.anInt1019 != local11) {
					this.anInt1019 += (local11 - this.anInt1019) / 16;
				}
				if (this.anInt1020 != local17) {
					this.anInt1020 += (local17 - this.anInt1020) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt1014 += (-this.anInt1014 - 24) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt1014 += (24 - this.anInt1014) / 2;
				} else {
					this.anInt1014 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt1015 += (12 - this.anInt1015) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt1015 += (-this.anInt1015 - 12) / 2;
				} else {
					this.anInt1015 /= 2;
				}
				this.anInt1013 = this.anInt1013 + this.anInt1014 / 2 & 0x7FF;
				this.anInt1012 += this.anInt1015 / 2;
				if (this.anInt1012 < 128) {
					this.anInt1012 = 128;
				}
				if (this.anInt1012 > 383) {
					this.anInt1012 = 383;
				}
				@Pc(204) int local204 = this.anInt1019 >> 7;
				@Pc(209) int local209 = this.anInt1020 >> 7;
				@Pc(219) int local219 = this.method685(this.anInt1020, this.anInt1019, this.anInt942);
				@Pc(221) int local221 = 0;
				@Pc(237) int local237;
				if (local204 > 3 && local209 > 3 && local204 < 100 && local209 < 100) {
					for (local237 = local204 - 4; local237 <= local204 + 4; local237++) {
						for (@Pc(243) int local243 = local209 - 4; local243 <= local209 + 4; local243++) {
							@Pc(248) int local248 = this.anInt942;
							if (local248 < 3 && (this.aByteArrayArrayArray8[1][local237][local243] & 0x2) == 2) {
								local248++;
							}
							@Pc(275) int local275 = local219 - this.anIntArrayArrayArray8[local248][local237][local243];
							if (local275 > local221) {
								local221 = local275;
							}
						}
					}
				}
				local237 = local221 * 192;
				if (local237 > 98048) {
					local237 = 98048;
				}
				if (local237 < 32768) {
					local237 = 32768;
				}
				if (local237 > this.anInt1033) {
					this.anInt1033 += (local237 - this.anInt1033) / 24;
				} else if (local237 < this.anInt1033) {
					this.anInt1033 += (local237 - this.anInt1033) / 80;
				}
			} catch (@Pc(339) Exception local339) {
				signlink.reporterror("glfc_ex " + aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt739 + "," + aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt740 + "," + this.anInt1019 + "," + this.anInt1020 + "," + this.anInt854 + "," + this.anInt855 + "," + this.anInt914 + "," + this.anInt915);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(389) RuntimeException local389) {
			signlink.reporterror("56921, " + arg0 + ", " + local389.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!EWIXBTLV;I)Z")
	private boolean method598(@OriginalArg(0) Class14 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) boolean local5 = true;
			@Pc(8) int local8 = arg0.anInt124;
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
				this.aStringArray12[this.anInt984] = "Remove @whi@" + this.aStringArray8[local8];
				this.anIntArray233[this.anInt984] = 775;
				this.anInt984++;
				this.aStringArray12[this.anInt984] = "Message @whi@" + this.aStringArray8[local8];
				this.anIntArray233[this.anInt984] = 984;
				this.anInt984++;
				return true;
			} else if (local8 >= 401 && local8 <= 500) {
				this.aStringArray12[this.anInt984] = "Remove @whi@" + arg0.aString2;
				this.anIntArray233[this.anInt984] = 859;
				this.anInt984++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("52235, " + arg0 + ", " + arg1 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[BI)V")
	private void method599(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		try {
			if (this.aBoolean259) {
				signlink.anInt1064 = arg0 ? 1 : 0;
				signlink.midisave(arg1, arg1.length);
				@Pc(17) boolean local17 = false;
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("3007, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method600(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				this.aClass10_Sub1_Sub3_7.method301(186);
			}
			this.aBoolean263 = true;
			for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
				this.anIntArray276[local12] = -1;
				for (@Pc(21) int local21 = 0; local21 < Class49.anInt781; local21++) {
					if (!Class49.aClass49Array1[local21].aBoolean202 && Class49.aClass49Array1[local21].anInt782 == local12 + (this.aBoolean245 ? 0 : 7)) {
						this.anIntArray276[local12] = local21;
						break;
					}
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("40333, " + arg0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class6 local9 = this.aClass6ArrayArrayArray1[this.anInt942][arg0][arg1];
		if (local9 == null) {
			this.aClass23_1.method211(this.anInt942, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class10_Sub1_Sub2_Sub1 local23 = null;
		@Pc(27) Class10_Sub1_Sub2_Sub1 local27;
		for (local27 = (Class10_Sub1_Sub2_Sub1) local9.method6(); local27 != null; local27 = (Class10_Sub1_Sub2_Sub1) local9.method8()) {
			@Pc(32) Class17 local32 = Class17.method104(local27.anInt211);
			@Pc(35) int local35 = local32.anInt183;
			if (local32.aBoolean52) {
				local35 *= local27.anInt213 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method4(local23);
		@Pc(65) Class10_Sub1_Sub2_Sub1 local65 = null;
		@Pc(67) Class10_Sub1_Sub2_Sub1 local67 = null;
		for (local27 = (Class10_Sub1_Sub2_Sub1) local9.method6(); local27 != null; local27 = (Class10_Sub1_Sub2_Sub1) local9.method8()) {
			if (local27.anInt211 != local23.anInt211 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt211 != local23.anInt211 && local27.anInt211 != local65.anInt211 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass23_1.method197(this.method685(arg1 * 128 + 64, arg0 * 128 + 64, this.anInt942), this.anInt942, local23, local65, local110, local67, arg1, arg0);
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method603() {
		try {
			if (this.anInt929 > 1) {
				this.anInt929--;
			}
			if (this.anInt847 > 0) {
				this.anInt847--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method608(); local22++) {
			}
			if (this.aBoolean244) {
				@Pc(41) Object local41 = this.aClass7_1.anObject1;
				@Pc(66) int local66;
				@Pc(68) int local68;
				@Pc(70) int local70;
				@Pc(103) int local103;
				synchronized (this.aClass7_1.anObject1) {
					if (!aBoolean228) {
						this.aClass7_1.anInt54 = 0;
					} else if (super.anInt821 != 0 || this.aClass7_1.anInt54 >= 40) {
						this.aClass10_Sub1_Sub3_7.method300(171);
						this.aClass10_Sub1_Sub3_7.method301(0);
						local66 = this.aClass10_Sub1_Sub3_7.anInt428;
						local68 = 0;
						@Pc(86) int local86;
						for (local70 = 0; local70 < this.aClass7_1.anInt54 && local66 - this.aClass10_Sub1_Sub3_7.anInt428 < 240; local70++) {
							local68++;
							local86 = this.aClass7_1.anIntArray11[local70];
							if (local86 < 0) {
								local86 = 0;
							} else if (local86 > 502) {
								local86 = 502;
							}
							local103 = this.aClass7_1.anIntArray12[local70];
							if (local103 < 0) {
								local103 = 0;
							} else if (local103 > 764) {
								local103 = 764;
							}
							@Pc(120) int local120 = local86 * 765 + local103;
							if (this.aClass7_1.anIntArray11[local70] == -1 && this.aClass7_1.anIntArray12[local70] == -1) {
								local103 = -1;
								local86 = -1;
								local120 = 524287;
							}
							if (local103 != this.anInt902 || local86 != this.anInt903) {
								@Pc(165) int local165 = local103 - this.anInt902;
								this.anInt902 = local103;
								@Pc(173) int local173 = local86 - this.anInt903;
								this.anInt903 = local86;
								if (this.anInt1035 < 8 && local165 >= -32 && local165 <= 31 && local173 >= -32 && local173 <= 31) {
									local165 += 32;
									local173 += 32;
									this.aClass10_Sub1_Sub3_7.method302((this.anInt1035 << 12) + (local165 << 6) + local173);
									this.anInt1035 = 0;
								} else if (this.anInt1035 < 8) {
									this.aClass10_Sub1_Sub3_7.method304((this.anInt1035 << 19) + local120 + 8388608);
									this.anInt1035 = 0;
								} else {
									this.aClass10_Sub1_Sub3_7.method305((this.anInt1035 << 19) + local120 - 1073741824);
									this.anInt1035 = 0;
								}
							} else if (this.anInt1035 < 2047) {
								this.anInt1035++;
							}
						}
						this.aClass10_Sub1_Sub3_7.method310(this.aClass10_Sub1_Sub3_7.anInt428 - local66);
						if (local68 >= this.aClass7_1.anInt54) {
							this.aClass7_1.anInt54 = 0;
						} else {
							this.aClass7_1.anInt54 -= local68;
							for (local86 = 0; local86 < this.aClass7_1.anInt54; local86++) {
								this.aClass7_1.anIntArray12[local86] = this.aClass7_1.anIntArray12[local86 + local68];
								this.aClass7_1.anIntArray11[local86] = this.aClass7_1.anIntArray11[local86 + local68];
							}
						}
					}
				}
				if (super.anInt821 != 0) {
					@Pc(336) long local336 = (super.aLong28 - this.aLong29) / 50L;
					if (local336 > 4095L) {
						local336 = 4095L;
					}
					this.aLong29 = super.aLong28;
					local66 = super.anInt823;
					if (local66 < 0) {
						local66 = 0;
					} else if (local66 > 502) {
						local66 = 502;
					}
					local68 = super.anInt822;
					if (local68 < 0) {
						local68 = 0;
					} else if (local68 > 764) {
						local68 = 764;
					}
					local70 = local66 * 765 + local68;
					@Pc(382) byte local382 = 0;
					if (super.anInt821 == 2) {
						local382 = 1;
					}
					local103 = (int) local336;
					this.aClass10_Sub1_Sub3_7.method300(19);
					this.aClass10_Sub1_Sub3_7.method305((local103 << 20) + (local382 << 19) + local70);
				}
				if (this.anInt1021 > 0) {
					this.anInt1021--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean258 = true;
				}
				if (this.aBoolean258 && this.anInt1021 <= 0) {
					this.anInt1021 = 20;
					this.aBoolean258 = false;
					this.aClass10_Sub1_Sub3_7.method300(140);
					this.aClass10_Sub1_Sub3_7.method336(this.anInt1012);
					this.aClass10_Sub1_Sub3_7.method336(this.anInt1013);
				}
				if (super.aBoolean215 && !this.aBoolean262) {
					this.aBoolean262 = true;
					this.aClass10_Sub1_Sub3_7.method300(187);
					this.aClass10_Sub1_Sub3_7.method301(1);
				}
				if (!super.aBoolean215 && this.aBoolean262) {
					this.aBoolean262 = false;
					this.aClass10_Sub1_Sub3_7.method300(187);
					this.aClass10_Sub1_Sub3_7.method301(0);
				}
				this.method718();
				this.method611();
				this.method727();
				this.anInt845++;
				if (this.anInt845 > 750) {
					this.method634();
				}
				this.method675();
				this.method642();
				this.method660();
				this.anInt878++;
				if (this.anInt909 != 0) {
					this.anInt908 += 20;
					if (this.anInt908 >= 400) {
						this.anInt909 = 0;
					}
				}
				if (this.anInt1056 != 0) {
					this.anInt1053++;
					if (this.anInt1053 >= 15) {
						if (this.anInt1056 == 2) {
							this.aBoolean248 = true;
						}
						if (this.anInt1056 == 3) {
							this.aBoolean255 = true;
						}
						this.anInt1056 = 0;
					}
				}
				if (this.anInt950 != 0) {
					this.anInt1022++;
					if (super.anInt816 > this.anInt951 + 5 || super.anInt816 < this.anInt951 - 5 || super.anInt817 > this.anInt952 + 5 || super.anInt817 < this.anInt952 - 5) {
						this.aBoolean246 = true;
					}
					if (super.anInt815 == 0) {
						if (this.anInt950 == 2) {
							this.aBoolean248 = true;
						}
						if (this.anInt950 == 3) {
							this.aBoolean255 = true;
						}
						this.anInt950 = 0;
						if (this.aBoolean246 && this.anInt1022 >= 5) {
							this.anInt931 = -1;
							this.method666();
							if (this.anInt931 == this.anInt948 && this.anInt930 != this.anInt949) {
								@Pc(683) Class14 local683 = Class14.method87(this.anInt948);
								@Pc(685) byte local685 = 0;
								if (this.anInt879 == 1 && local683.anInt124 == 206) {
									local685 = 1;
								}
								if (local683.anIntArray44[this.anInt930] <= 0) {
									local685 = 0;
								}
								if (local683.aBoolean32) {
									local66 = this.anInt949;
									local68 = this.anInt930;
									local683.anIntArray44[local68] = local683.anIntArray44[local66];
									local683.anIntArray40[local68] = local683.anIntArray40[local66];
									local683.anIntArray44[local66] = -1;
									local683.anIntArray40[local66] = 0;
								} else if (local685 == 1) {
									local66 = this.anInt949;
									local68 = this.anInt930;
									while (local66 != local68) {
										if (local66 > local68) {
											local683.method88(local66 - 1, local66);
											local66--;
										} else if (local66 < local68) {
											local683.method88(local66 + 1, local66);
											local66++;
										}
									}
								} else {
									local683.method88(this.anInt930, this.anInt949);
								}
								this.aClass10_Sub1_Sub3_7.method300(123);
								this.aClass10_Sub1_Sub3_7.method338(this.anInt930);
								this.aClass10_Sub1_Sub3_7.method327(local685);
								this.aClass10_Sub1_Sub3_7.method337(this.anInt948);
								this.aClass10_Sub1_Sub3_7.method336(this.anInt949);
							}
						} else if ((this.anInt1036 == 1 || this.method701(this.anInt984 - 1, this.aByte51)) && this.anInt984 > 2) {
							this.method683();
						} else if (this.anInt984 > 0) {
							this.method695(this.anInt984 - 1);
						}
						this.anInt1053 = 10;
						super.anInt821 = 0;
					}
				}
				@Pc(860) int local860;
				@Pc(862) int local862;
				if (Class23.anInt307 != -1) {
					local860 = Class23.anInt307;
					local862 = Class23.anInt308;
					@Pc(883) boolean local883 = this.method610(true, local862, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0], 0, 0, 0, 0, local860, 0, 0, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0]);
					Class23.anInt307 = -1;
					if (local883) {
						this.anInt906 = super.anInt822;
						this.anInt907 = super.anInt823;
						this.anInt909 = 1;
						this.anInt908 = 0;
					}
				}
				if (super.anInt821 == 1 && this.aString26 != null) {
					this.aString26 = null;
					this.aBoolean255 = true;
					super.anInt821 = 0;
				}
				this.method629();
				if (this.anInt926 == -1) {
					this.method721();
					this.method596();
					this.method614();
				}
				if (super.anInt815 == 1 || super.anInt821 == 1) {
					this.anInt943++;
				}
				if (this.anInt1030 == 0 && this.anInt918 == 0 && this.anInt959 == 0) {
					if (this.anInt856 > 0) {
						this.anInt856--;
					}
				} else if (this.anInt856 < 100) {
					this.anInt856++;
					if (this.anInt856 == 100) {
						if (this.anInt1030 != 0) {
							this.aBoolean255 = true;
						}
						if (this.anInt918 != 0) {
							this.aBoolean248 = true;
						}
					}
				}
				if (this.anInt933 == 2) {
					this.method597(409);
				}
				if (this.anInt933 == 2 && this.aBoolean252) {
					this.method604(this.aBoolean227);
				}
				for (local860 = 0; local860 < 5; local860++) {
					@Pc(1020) int local1020 = this.anIntArray257[local860]++;
				}
				this.method605((byte) 2);
				super.anInt814++;
				if (super.anInt814 > 4500) {
					this.anInt847 = 250;
					super.anInt814 -= 500;
					this.aClass10_Sub1_Sub3_7.method300(202);
				}
				this.anInt953++;
				if (this.anInt953 > 500) {
					this.anInt953 = 0;
					local862 = (int) (Math.random() * 8.0D);
					if ((local862 & 0x1) == 1) {
						this.anInt835 += this.anInt836;
					}
					if ((local862 & 0x2) == 2) {
						this.anInt900 += this.anInt901;
					}
					if ((local862 & 0x4) == 4) {
						this.anInt1016 += this.anInt1017;
					}
				}
				if (this.anInt835 < -50) {
					this.anInt836 = 2;
				}
				if (this.anInt835 > 50) {
					this.anInt836 = -2;
				}
				if (this.anInt900 < -55) {
					this.anInt901 = 2;
				}
				if (this.anInt900 > 55) {
					this.anInt901 = -2;
				}
				if (this.anInt1016 < -40) {
					this.anInt1017 = 1;
				}
				if (this.anInt1016 > 40) {
					this.anInt1017 = -1;
				}
				this.anInt919++;
				if (this.anInt919 > 500) {
					this.anInt919 = 0;
					local862 = (int) (Math.random() * 8.0D);
					if ((local862 & 0x1) == 1) {
						this.anInt864 += this.anInt865;
					}
					if ((local862 & 0x2) == 2) {
						this.anInt1003 += this.anInt1004;
					}
				}
				if (this.anInt864 < -60) {
					this.anInt865 = 2;
				}
				if (this.anInt864 > 60) {
					this.anInt865 = -2;
				}
				if (this.anInt1003 < -20) {
					this.anInt1004 = 1;
				}
				if (this.anInt1003 > 10) {
					this.anInt1004 = -1;
				}
				this.anInt846++;
				if (this.anInt846 > 50) {
					this.aClass10_Sub1_Sub3_7.method300(40);
				}
				try {
					if (this.aClass18_1 != null && this.aClass10_Sub1_Sub3_7.anInt428 > 0) {
						this.aClass18_1.method120(this.aClass10_Sub1_Sub3_7.anInt428, this.aClass10_Sub1_Sub3_7.aByteArray12);
						this.aClass10_Sub1_Sub3_7.anInt428 = 0;
						this.anInt846 = 0;
					}
				} catch (@Pc(1270) IOException local1270) {
					this.method634();
				} catch (@Pc(1275) Exception local1275) {
					this.method699();
				}
			}
		} catch (@Pc(1280) RuntimeException local1280) {
			signlink.reporterror("71494, " + 4 + ", " + local1280.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method604(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(6) int local6 = this.anInt848 * 128 + 64;
			@Pc(13) int local13 = this.anInt849 * 128 + 64;
			@Pc(24) int local24 = this.method685(local13, local6, this.anInt942) - this.anInt850;
			if (this.anInt990 < local6) {
				this.anInt990 += this.anInt851 + (local6 - this.anInt990) * this.anInt852 / 1000;
				if (this.anInt990 > local6) {
					this.anInt990 = local6;
				}
			}
			if (this.anInt990 > local6) {
				this.anInt990 -= this.anInt851 + (this.anInt990 - local6) * this.anInt852 / 1000;
				if (this.anInt990 < local6) {
					this.anInt990 = local6;
				}
			}
			if (this.anInt991 < local24) {
				this.anInt991 += this.anInt851 + (local24 - this.anInt991) * this.anInt852 / 1000;
				if (this.anInt991 > local24) {
					this.anInt991 = local24;
				}
			}
			if (this.anInt991 > local24) {
				this.anInt991 -= this.anInt851 + (this.anInt991 - local24) * this.anInt852 / 1000;
				if (this.anInt991 < local24) {
					this.anInt991 = local24;
				}
			}
			if (this.anInt992 < local13) {
				this.anInt992 += this.anInt851 + (local13 - this.anInt992) * this.anInt852 / 1000;
				if (this.anInt992 > local13) {
					this.anInt992 = local13;
				}
			}
			if (this.anInt992 > local13) {
				this.anInt992 -= this.anInt851 + (this.anInt992 - local13) * this.anInt852 / 1000;
				if (this.anInt992 < local13) {
					this.anInt992 = local13;
				}
			}
			local6 = this.anInt892 * 128 + 64;
			local13 = this.anInt893 * 128 + 64;
			local24 = this.method685(local13, local6, this.anInt942) - this.anInt894;
			@Pc(222) int local222 = local6 - this.anInt990;
			@Pc(227) int local227 = local24 - this.anInt991;
			@Pc(232) int local232 = local13 - this.anInt992;
			@Pc(243) int local243 = (int) Math.sqrt((double) (local222 * local222 + local232 * local232));
			@Pc(254) int local254 = (int) (Math.atan2((double) local227, (double) local243) * 325.949D) & 0x7FF;
			@Pc(258) int local258;
			if (!arg0) {
				for (local258 = 1; local258 > 0; local258++) {
				}
			}
			local258 = (int) (Math.atan2((double) local222, (double) local232) * -325.949D) & 0x7FF;
			if (local254 < 128) {
				local254 = 128;
			}
			if (local254 > 383) {
				local254 = 383;
			}
			if (this.anInt993 < local254) {
				this.anInt993 += this.anInt895 + (local254 - this.anInt993) * this.anInt896 / 1000;
				if (this.anInt993 > local254) {
					this.anInt993 = local254;
				}
			}
			if (this.anInt993 > local254) {
				this.anInt993 -= this.anInt895 + (this.anInt993 - local254) * this.anInt896 / 1000;
				if (this.anInt993 < local254) {
					this.anInt993 = local254;
				}
			}
			@Pc(345) int local345 = local258 - this.anInt994;
			if (local345 > 1024) {
				local345 -= 2048;
			}
			if (local345 < -1024) {
				local345 += 2048;
			}
			if (local345 > 0) {
				this.anInt994 += this.anInt895 + local345 * this.anInt896 / 1000;
				this.anInt994 &= 0x7FF;
			}
			if (local345 < 0) {
				this.anInt994 -= this.anInt895 + -local345 * this.anInt896 / 1000;
				this.anInt994 &= 0x7FF;
			}
			@Pc(403) int local403 = local258 - this.anInt994;
			if (local403 > 1024) {
				local403 -= 2048;
			}
			if (local403 < -1024) {
				local403 += 2048;
			}
			if (local403 < 0 && local345 > 0 || local403 > 0 && local345 < 0) {
				this.anInt994 = local258;
			}
		} catch (@Pc(424) RuntimeException local424) {
			signlink.reporterror("53041, " + arg0 + ", " + local424.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method605(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			while (true) {
				@Pc(13) int local13;
				do {
					while (true) {
						local13 = this.method580();
						if (local13 == -1) {
							return;
						}
						if (this.anInt976 != -1 && this.anInt976 == this.anInt1002) {
							if (local13 == 8 && this.aString17.length() > 0) {
								this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
							}
							break;
						}
						@Pc(193) int local193;
						if (this.aBoolean216) {
							if (local13 >= 32 && local13 <= 122 && this.aString24.length() < 80) {
								this.aString24 = this.aString24 + (char) local13;
								this.aBoolean255 = true;
							}
							if (local13 == 8 && this.aString24.length() > 0) {
								this.aString24 = this.aString24.substring(0, this.aString24.length() - 1);
								this.aBoolean255 = true;
							}
							if (local13 == 13 || local13 == 10) {
								this.aBoolean216 = false;
								this.aBoolean255 = true;
								@Pc(153) long local153;
								if (this.anInt995 == 1) {
									local153 = Class26.method248(this.aString24);
									this.method677(local153);
								}
								if (this.anInt995 == 2 && this.anInt838 > 0) {
									local153 = Class26.method248(this.aString24);
									this.method628(local153);
								}
								if (this.anInt995 == 3 && this.aString24.length() > 0) {
									this.aClass10_Sub1_Sub3_7.method300(227);
									this.aClass10_Sub1_Sub3_7.method301(0);
									local193 = this.aClass10_Sub1_Sub3_7.anInt428;
									this.aClass10_Sub1_Sub3_7.method307(this.aLong31);
									Class32.method372(this.aString24, this.aClass10_Sub1_Sub3_7);
									this.aClass10_Sub1_Sub3_7.method310(this.aClass10_Sub1_Sub3_7.anInt428 - local193);
									this.aString24 = Class32.method373(this.aString24);
									this.aString24 = Class46.method452(this.aString24);
									this.method622(Class26.method252(Class26.method249(this.aLong31), (byte) 7), this.aString24, 6);
									if (this.anInt853 == 2) {
										this.anInt853 = 1;
										this.aBoolean253 = true;
										this.aClass10_Sub1_Sub3_7.method300(176);
										this.aClass10_Sub1_Sub3_7.method301(this.anInt899);
										this.aClass10_Sub1_Sub3_7.method301(this.anInt853);
										this.aClass10_Sub1_Sub3_7.method301(this.anInt1000);
									}
								}
								if (this.anInt995 == 4 && this.anInt837 < 100) {
									local153 = Class26.method248(this.aString24);
									this.method665(this.anInt971, local153);
								}
								if (this.anInt995 == 5 && this.anInt837 > 0) {
									local153 = Class26.method248(this.aString24);
									this.method672(325, local153);
								}
							}
						} else if (this.anInt1010 == 1) {
							if (local13 >= 48 && local13 <= 57 && this.aString20.length() < 10) {
								this.aString20 = this.aString20 + (char) local13;
								this.aBoolean255 = true;
							}
							if (local13 == 8 && this.aString20.length() > 0) {
								this.aString20 = this.aString20.substring(0, this.aString20.length() - 1);
								this.aBoolean255 = true;
							}
							if (local13 == 13 || local13 == 10) {
								if (this.aString20.length() > 0) {
									local193 = 0;
									try {
										local193 = Integer.parseInt(this.aString20);
									} catch (@Pc(371) Exception local371) {
									}
									this.aClass10_Sub1_Sub3_7.method300(75);
									this.aClass10_Sub1_Sub3_7.method305(local193);
								}
								this.anInt1010 = 0;
								this.aBoolean255 = true;
							}
						} else if (this.anInt1010 == 2) {
							if (local13 >= 32 && local13 <= 122 && this.aString20.length() < 12) {
								this.aString20 = this.aString20 + (char) local13;
								this.aBoolean255 = true;
							}
							if (local13 == 8 && this.aString20.length() > 0) {
								this.aString20 = this.aString20.substring(0, this.aString20.length() - 1);
								this.aBoolean255 = true;
							}
							if (local13 == 13 || local13 == 10) {
								if (this.aString20.length() > 0) {
									this.aClass10_Sub1_Sub3_7.method300(206);
									this.aClass10_Sub1_Sub3_7.method307(Class26.method248(this.aString20));
								}
								this.anInt1010 = 0;
								this.aBoolean255 = true;
							}
						} else if (this.anInt1010 == 3) {
							if (local13 >= 32 && local13 <= 122 && this.aString20.length() < 40) {
								this.aString20 = this.aString20 + (char) local13;
								this.aBoolean255 = true;
							}
							if (local13 == 8 && this.aString20.length() > 0) {
								this.aString20 = this.aString20.substring(0, this.aString20.length() - 1);
								this.aBoolean255 = true;
							}
						} else if (this.anInt888 == -1 && this.anInt926 == -1) {
							if (local13 >= 32 && local13 <= 122 && this.aString29.length() < 80) {
								this.aString29 = this.aString29 + (char) local13;
								this.aBoolean255 = true;
							}
							if (local13 == 8 && this.aString29.length() > 0) {
								this.aString29 = this.aString29.substring(0, this.aString29.length() - 1);
								this.aBoolean255 = true;
							}
							if ((local13 == 13 || local13 == 10) && this.aString29.length() > 0) {
								if (this.anInt842 == 2) {
									if (this.aString29.equals("::clientdrop")) {
										this.method634();
									}
									if (this.aString29.equals("::lag")) {
										this.method713();
									}
									if (this.aString29.equals("::prefetchmusic")) {
										for (local193 = 0; local193 < this.aClass33_Sub1_1.method569(2); local193++) {
											this.aClass33_Sub1_1.method556(2, (byte) 1, local193);
										}
									}
									if (this.aString29.equals("::fpson")) {
										aBoolean217 = true;
									}
									if (this.aString29.equals("::fpsoff")) {
										aBoolean217 = false;
									}
									if (this.aString29.equals("::noclip")) {
										for (local193 = 0; local193 < 4; local193++) {
											for (@Pc(656) int local656 = 1; local656 < 103; local656++) {
												for (@Pc(660) int local660 = 1; local660 < 103; local660++) {
													this.aClass47Array1[local193].anIntArrayArray16[local656][local660] = 0;
												}
											}
										}
									}
								}
								if (this.aString29.startsWith("::")) {
									this.aClass10_Sub1_Sub3_7.method300(56);
									this.aClass10_Sub1_Sub3_7.method301(this.aString29.length() - 1);
									this.aClass10_Sub1_Sub3_7.method308(this.aString29.substring(2));
								} else {
									@Pc(715) String local715 = this.aString29.toLowerCase();
									@Pc(717) byte local717 = 0;
									if (local715.startsWith("yellow:")) {
										local717 = 0;
										this.aString29 = this.aString29.substring(7);
									} else if (local715.startsWith("red:")) {
										local717 = 1;
										this.aString29 = this.aString29.substring(4);
									} else if (local715.startsWith("green:")) {
										local717 = 2;
										this.aString29 = this.aString29.substring(6);
									} else if (local715.startsWith("cyan:")) {
										local717 = 3;
										this.aString29 = this.aString29.substring(5);
									} else if (local715.startsWith("purple:")) {
										local717 = 4;
										this.aString29 = this.aString29.substring(7);
									} else if (local715.startsWith("white:")) {
										local717 = 5;
										this.aString29 = this.aString29.substring(6);
									} else if (local715.startsWith("flash1:")) {
										local717 = 6;
										this.aString29 = this.aString29.substring(7);
									} else if (local715.startsWith("flash2:")) {
										local717 = 7;
										this.aString29 = this.aString29.substring(7);
									} else if (local715.startsWith("flash3:")) {
										local717 = 8;
										this.aString29 = this.aString29.substring(7);
									} else if (local715.startsWith("glow1:")) {
										local717 = 9;
										this.aString29 = this.aString29.substring(6);
									} else if (local715.startsWith("glow2:")) {
										local717 = 10;
										this.aString29 = this.aString29.substring(6);
									} else if (local715.startsWith("glow3:")) {
										local717 = 11;
										this.aString29 = this.aString29.substring(6);
									}
									local715 = this.aString29.toLowerCase();
									@Pc(889) byte local889 = 0;
									if (local715.startsWith("wave:")) {
										local889 = 1;
										this.aString29 = this.aString29.substring(5);
									} else if (local715.startsWith("wave2:")) {
										local889 = 2;
										this.aString29 = this.aString29.substring(6);
									} else if (local715.startsWith("shake:")) {
										local889 = 3;
										this.aString29 = this.aString29.substring(6);
									} else if (local715.startsWith("scroll:")) {
										local889 = 4;
										this.aString29 = this.aString29.substring(7);
									} else if (local715.startsWith("slide:")) {
										local889 = 5;
										this.aString29 = this.aString29.substring(6);
									}
									this.aClass10_Sub1_Sub3_7.method300(49);
									this.aClass10_Sub1_Sub3_7.method301(0);
									@Pc(970) int local970 = this.aClass10_Sub1_Sub3_7.anInt428;
									this.aClass10_Sub1_Sub3_7.method328(local717);
									this.aClass10_Sub1_Sub3_7.method327(local889);
									this.aClass10_Sub1_Sub3_8.anInt428 = 0;
									Class32.method372(this.aString29, this.aClass10_Sub1_Sub3_8);
									this.aClass10_Sub1_Sub3_7.method309(this.aClass10_Sub1_Sub3_8.aByteArray12, this.aClass10_Sub1_Sub3_8.anInt428);
									this.aClass10_Sub1_Sub3_7.method310(this.aClass10_Sub1_Sub3_7.anInt428 - local970);
									this.aString29 = Class32.method373(this.aString29);
									this.aString29 = Class46.method452(this.aString29);
									aClass10_Sub1_Sub2_Sub3_Sub2_1.aString13 = this.aString29;
									aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt716 = local717;
									aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt722 = local889;
									aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt715 = 150;
									if (this.anInt842 == 2) {
										this.method622("@cr2@" + aClass10_Sub1_Sub2_Sub3_Sub2_1.aString14, aClass10_Sub1_Sub2_Sub3_Sub2_1.aString13, 2);
									} else if (this.anInt842 == 1) {
										this.method622("@cr1@" + aClass10_Sub1_Sub2_Sub3_Sub2_1.aString14, aClass10_Sub1_Sub2_Sub3_Sub2_1.aString13, 2);
									} else {
										this.method622(aClass10_Sub1_Sub2_Sub3_Sub2_1.aString14, aClass10_Sub1_Sub2_Sub3_Sub2_1.aString13, 2);
									}
									if (this.anInt899 == 2) {
										this.anInt899 = 3;
										this.aBoolean253 = true;
										this.aClass10_Sub1_Sub3_7.method300(176);
										this.aClass10_Sub1_Sub3_7.method301(this.anInt899);
										this.aClass10_Sub1_Sub3_7.method301(this.anInt853);
										this.aClass10_Sub1_Sub3_7.method301(this.anInt1000);
									}
								}
								this.aString29 = "";
								this.aBoolean255 = true;
							}
						}
					}
				} while ((local13 < 97 || local13 > 122) && (local13 < 65 || local13 > 90) && (local13 < 48 || local13 > 57) && local13 != 32);
				if (this.aString17.length() < 12) {
					this.aString17 = this.aString17 + (char) local13;
				}
			}
		} catch (@Pc(1123) RuntimeException local1123) {
			signlink.reporterror("42228, " + arg0 + ", " + local1123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method606(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean219) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.method607(43595);
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

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)Ljava/net/Socket;")
	public Socket method607(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)Z")
	private boolean method608() {
		try {
			if (this.aClass18_1 == null) {
				return false;
			}
			@Pc(1321) String local1321;
			@Pc(170) int local170;
			try {
				@Pc(20) int local20 = this.aClass18_1.method118();
				if (local20 == 0) {
					return false;
				}
				if (this.anInt844 == -1) {
					this.aClass18_1.method119(this.aClass10_Sub1_Sub3_9.aByteArray12, 0, 1);
					this.anInt844 = this.aClass10_Sub1_Sub3_9.aByteArray12[0] & 0xFF;
					if (this.aClass25_2 != null) {
						this.anInt844 = this.anInt844 - this.aClass25_2.method245() & 0xFF;
					}
					this.anInt843 = Class13.anIntArray34[this.anInt844];
					local20--;
				}
				if (this.anInt843 == -1) {
					if (local20 <= 0) {
						return false;
					}
					this.aClass18_1.method119(this.aClass10_Sub1_Sub3_9.aByteArray12, 0, 1);
					this.anInt843 = this.aClass10_Sub1_Sub3_9.aByteArray12[0] & 0xFF;
					local20--;
				}
				if (this.anInt843 == -2) {
					if (local20 <= 1) {
						return false;
					}
					this.aClass18_1.method119(this.aClass10_Sub1_Sub3_9.aByteArray12, 0, 2);
					this.aClass10_Sub1_Sub3_9.anInt428 = 0;
					this.anInt843 = this.aClass10_Sub1_Sub3_9.method313();
					local20 -= 2;
				}
				if (local20 < this.anInt843) {
					return false;
				}
				this.aClass10_Sub1_Sub3_9.anInt428 = 0;
				this.aClass18_1.method119(this.aClass10_Sub1_Sub3_9.aByteArray12, 0, this.anInt843);
				this.anInt845 = 0;
				this.anInt862 = this.anInt861;
				this.anInt861 = this.anInt860;
				this.anInt860 = this.anInt844;
				@Pc(165) int local165;
				@Pc(174) int local174;
				if (this.anInt844 == 166) {
					local165 = this.aClass10_Sub1_Sub3_9.method342();
					local170 = this.aClass10_Sub1_Sub3_9.method342();
					local174 = this.aClass10_Sub1_Sub3_9.method313();
					@Pc(177) Class14 local177 = Class14.method87(local174);
					local177.anInt117 = local170;
					local177.anInt134 = local165;
					this.anInt844 = -1;
					return true;
				}
				@Pc(212) int local212;
				if (this.anInt844 == 186) {
					local165 = this.aClass10_Sub1_Sub3_9.method340();
					local170 = this.aClass10_Sub1_Sub3_9.method341();
					local174 = this.aClass10_Sub1_Sub3_9.method340();
					local212 = this.aClass10_Sub1_Sub3_9.method339();
					Class14.method87(local170).anInt130 = local165;
					Class14.method87(local170).anInt131 = local212;
					Class14.method87(local170).anInt129 = local174;
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 216) {
					local165 = this.aClass10_Sub1_Sub3_9.method341();
					local170 = this.aClass10_Sub1_Sub3_9.method341();
					Class14.method87(local170).anInt145 = 1;
					Class14.method87(local170).anInt146 = local165;
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 26) {
					local165 = this.aClass10_Sub1_Sub3_9.method313();
					local170 = this.aClass10_Sub1_Sub3_9.method311();
					local174 = this.aClass10_Sub1_Sub3_9.method313();
					if (local174 == 65535) {
						if (this.anInt913 < 50) {
							this.anIntArray251[this.anInt913] = (short) local165;
							this.anIntArray275[this.anInt913] = local170;
							this.anIntArray264[this.anInt913] = 0;
							this.anInt913++;
						}
					} else if (this.aBoolean265 && !aBoolean223 && this.anInt913 < 50) {
						this.anIntArray251[this.anInt913] = local165;
						this.anIntArray275[this.anInt913] = local170;
						this.anIntArray264[this.anInt913] = local174 + Class39.anIntArray171[local165];
						this.anInt913++;
					}
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 182) {
					local165 = this.aClass10_Sub1_Sub3_9.method340();
					@Pc(362) byte local362 = this.aClass10_Sub1_Sub3_9.method335();
					this.anIntArray240[local165] = local362;
					if (this.anIntArray244[local165] != local362) {
						this.anIntArray244[local165] = local362;
						this.method680(local165);
						this.aBoolean248 = true;
						if (this.anInt985 != -1) {
							this.aBoolean255 = true;
						}
					}
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 13) {
					for (local165 = 0; local165 < this.aClass10_Sub1_Sub2_Sub3_Sub2Array1.length; local165++) {
						if (this.aClass10_Sub1_Sub2_Sub3_Sub2Array1[local165] != null) {
							this.aClass10_Sub1_Sub2_Sub3_Sub2Array1[local165].anInt753 = -1;
						}
					}
					for (local170 = 0; local170 < this.aClass10_Sub1_Sub2_Sub3_Sub1Array1.length; local170++) {
						if (this.aClass10_Sub1_Sub2_Sub3_Sub1Array1[local170] != null) {
							this.aClass10_Sub1_Sub2_Sub3_Sub1Array1[local170].anInt753 = -1;
						}
					}
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 156) {
					this.anInt923 = this.aClass10_Sub1_Sub3_9.method311();
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 162) {
					local165 = this.aClass10_Sub1_Sub3_9.method340();
					local170 = this.aClass10_Sub1_Sub3_9.method339();
					Class14.method87(local170).anInt145 = 2;
					Class14.method87(local170).anInt146 = local165;
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 109) {
					local165 = this.aClass10_Sub1_Sub3_9.method313();
					this.method687(local165);
					if (this.anInt941 != -1) {
						this.method619(aBoolean249, this.anInt941);
						this.anInt941 = -1;
						this.aBoolean248 = true;
						this.aBoolean225 = true;
					}
					if (this.anInt926 != -1) {
						this.method619(aBoolean249, this.anInt926);
						this.anInt926 = -1;
						this.aBoolean236 = true;
					}
					if (this.anInt880 != -1) {
						this.method619(aBoolean249, this.anInt880);
						this.anInt880 = -1;
					}
					if (this.anInt976 != -1) {
						this.method619(aBoolean249, this.anInt976);
						this.anInt976 = -1;
					}
					if (this.anInt888 != local165) {
						this.method619(aBoolean249, this.anInt888);
						this.anInt888 = local165;
					}
					this.aBoolean254 = false;
					this.aBoolean255 = true;
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 220) {
					local165 = this.aClass10_Sub1_Sub3_9.method341();
					if (local165 == 65535) {
						local165 = -1;
					}
					if (local165 != this.anInt1051 && this.aBoolean259 && !aBoolean223 && this.anInt958 == 0) {
						this.anInt1023 = local165;
						this.aBoolean260 = true;
						this.aClass33_Sub1_1.method558(2, this.anInt1023);
					}
					this.anInt1051 = local165;
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 249) {
					local165 = this.aClass10_Sub1_Sub3_9.method339();
					local170 = this.aClass10_Sub1_Sub3_9.method344();
					if (this.aBoolean259 && !aBoolean223) {
						this.anInt1023 = local165;
						this.aBoolean260 = false;
						this.aClass33_Sub1_1.method558(2, this.anInt1023);
						this.anInt958 = local170;
					}
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 158) {
					local165 = this.aClass10_Sub1_Sub3_9.method342();
					if (local165 != this.anInt985) {
						this.method619(aBoolean249, this.anInt985);
						this.anInt985 = local165;
					}
					this.aBoolean255 = true;
					this.anInt844 = -1;
					return true;
				}
				@Pc(724) int local724;
				if (this.anInt844 == 218) {
					local165 = this.aClass10_Sub1_Sub3_9.method313();
					local170 = this.aClass10_Sub1_Sub3_9.method340();
					local174 = local170 >> 10 & 0x1F;
					local212 = local170 >> 5 & 0x1F;
					local724 = local170 & 0x1F;
					Class14.method87(local165).anInt122 = (local174 << 19) + (local212 << 11) + (local724 << 3);
					this.anInt844 = -1;
					return true;
				}
				@Pc(756) String local756;
				if (this.anInt844 == 157) {
					local165 = this.aClass10_Sub1_Sub3_9.method331();
					local756 = this.aClass10_Sub1_Sub3_9.method318();
					local174 = this.aClass10_Sub1_Sub3_9.method311();
					if (local165 >= 1 && local165 <= 5) {
						if (local756.equalsIgnoreCase("null")) {
							local756 = null;
						}
						this.aStringArray11[local165 - 1] = local756;
						this.aBooleanArray12[local165 - 1] = local174 == 0;
					}
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 6) {
					this.aBoolean216 = false;
					this.anInt1010 = 2;
					this.aString20 = "";
					this.aBoolean255 = true;
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 201) {
					this.anInt899 = this.aClass10_Sub1_Sub3_9.method311();
					this.anInt853 = this.aClass10_Sub1_Sub3_9.method311();
					this.anInt1000 = this.aClass10_Sub1_Sub3_9.method311();
					this.aBoolean253 = true;
					this.aBoolean255 = true;
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 199) {
					this.anInt986 = this.aClass10_Sub1_Sub3_9.method311();
					if (this.anInt986 == 1) {
						this.anInt999 = this.aClass10_Sub1_Sub3_9.method313();
					}
					if (this.anInt986 >= 2 && this.anInt986 <= 6) {
						if (this.anInt986 == 2) {
							this.anInt831 = 64;
							this.anInt832 = 64;
						}
						if (this.anInt986 == 3) {
							this.anInt831 = 0;
							this.anInt832 = 64;
						}
						if (this.anInt986 == 4) {
							this.anInt831 = 128;
							this.anInt832 = 64;
						}
						if (this.anInt986 == 5) {
							this.anInt831 = 64;
							this.anInt832 = 0;
						}
						if (this.anInt986 == 6) {
							this.anInt831 = 64;
							this.anInt832 = 128;
						}
						this.anInt986 = 2;
						this.anInt828 = this.aClass10_Sub1_Sub3_9.method313();
						this.anInt829 = this.aClass10_Sub1_Sub3_9.method313();
						this.anInt830 = this.aClass10_Sub1_Sub3_9.method311();
					}
					if (this.anInt986 == 10) {
						this.anInt969 = this.aClass10_Sub1_Sub3_9.method313();
					}
					this.anInt844 = -1;
					return true;
				}
				@Pc(1030) int local1030;
				@Pc(1041) int local1041;
				if (this.anInt844 == 167) {
					this.aBoolean252 = true;
					this.anInt892 = this.aClass10_Sub1_Sub3_9.method311();
					this.anInt893 = this.aClass10_Sub1_Sub3_9.method311();
					this.anInt894 = this.aClass10_Sub1_Sub3_9.method313();
					this.anInt895 = this.aClass10_Sub1_Sub3_9.method311();
					this.anInt896 = this.aClass10_Sub1_Sub3_9.method311();
					if (this.anInt896 >= 100) {
						local165 = this.anInt892 * 128 + 64;
						local170 = this.anInt893 * 128 + 64;
						local174 = this.method685(local170, local165, this.anInt942) - this.anInt894;
						local212 = local165 - this.anInt990;
						local724 = local174 - this.anInt991;
						local1030 = local170 - this.anInt992;
						local1041 = (int) Math.sqrt((double) (local212 * local212 + local1030 * local1030));
						this.anInt993 = (int) (Math.atan2((double) local724, (double) local1041) * 325.949D) & 0x7FF;
						this.anInt994 = (int) (Math.atan2((double) local212, (double) local1030) * -325.949D) & 0x7FF;
						if (this.anInt993 < 128) {
							this.anInt993 = 128;
						}
						if (this.anInt993 > 383) {
							this.anInt993 = 383;
						}
					}
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 5) {
					this.method699();
					this.anInt844 = -1;
					return false;
				}
				if (this.anInt844 == 115) {
					local165 = this.aClass10_Sub1_Sub3_9.method347();
					local170 = this.aClass10_Sub1_Sub3_9.method339();
					this.anIntArray240[local170] = local165;
					if (this.anIntArray244[local170] != local165) {
						this.anIntArray244[local170] = local165;
						this.method680(local170);
						this.aBoolean248 = true;
						if (this.anInt985 != -1) {
							this.aBoolean255 = true;
						}
					}
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 29) {
					if (this.anInt941 != -1) {
						this.method619(aBoolean249, this.anInt941);
						this.anInt941 = -1;
						this.aBoolean248 = true;
						this.aBoolean225 = true;
					}
					if (this.anInt888 != -1) {
						this.method619(aBoolean249, this.anInt888);
						this.anInt888 = -1;
						this.aBoolean255 = true;
					}
					if (this.anInt926 != -1) {
						this.method619(aBoolean249, this.anInt926);
						this.anInt926 = -1;
						this.aBoolean236 = true;
					}
					if (this.anInt880 != -1) {
						this.method619(aBoolean249, this.anInt880);
						this.anInt880 = -1;
					}
					if (this.anInt976 != -1) {
						this.method619(aBoolean249, this.anInt976);
						this.anInt976 = -1;
					}
					if (this.anInt1010 != 0) {
						this.anInt1010 = 0;
						this.aBoolean255 = true;
					}
					this.aBoolean254 = false;
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 76) {
					this.anInt939 = this.aClass10_Sub1_Sub3_9.method339();
					this.anInt935 = this.aClass10_Sub1_Sub3_9.method341();
					this.aClass10_Sub1_Sub3_9.method313();
					this.anInt987 = this.aClass10_Sub1_Sub3_9.method313();
					this.anInt977 = this.aClass10_Sub1_Sub3_9.method339();
					this.anInt1025 = this.aClass10_Sub1_Sub3_9.method340();
					this.anInt989 = this.aClass10_Sub1_Sub3_9.method340();
					this.anInt891 = this.aClass10_Sub1_Sub3_9.method313();
					this.anInt1009 = this.aClass10_Sub1_Sub3_9.method345();
					this.anInt912 = this.aClass10_Sub1_Sub3_9.method341();
					this.aClass10_Sub1_Sub3_9.method330();
					signlink.dnslookup(Class26.method251(this.anInt1009));
					this.anInt844 = -1;
					return true;
				}
				@Pc(1337) boolean local1337;
				@Pc(1472) String local1472;
				if (this.anInt844 == 63) {
					local1321 = this.aClass10_Sub1_Sub3_9.method318();
					@Pc(1335) long local1335;
					if (local1321.endsWith(":tradereq:")) {
						local756 = local1321.substring(0, local1321.indexOf(":"));
						local1335 = Class26.method248(local756);
						local1337 = false;
						for (local1030 = 0; local1030 < this.anInt837; local1030++) {
							if (this.aLongArray3[local1030] == local1335) {
								local1337 = true;
								break;
							}
						}
						if (!local1337 && this.anInt1011 == 0) {
							this.method622(local756, "wishes to trade with you.", 4);
						}
					} else if (local1321.endsWith(":duelreq:")) {
						local756 = local1321.substring(0, local1321.indexOf(":"));
						local1335 = Class26.method248(local756);
						local1337 = false;
						for (local1030 = 0; local1030 < this.anInt837; local1030++) {
							if (this.aLongArray3[local1030] == local1335) {
								local1337 = true;
								break;
							}
						}
						if (!local1337 && this.anInt1011 == 0) {
							this.method622(local756, "wishes to duel with you.", 8);
						}
					} else if (local1321.endsWith(":chalreq:")) {
						local756 = local1321.substring(0, local1321.indexOf(":"));
						local1335 = Class26.method248(local756);
						local1337 = false;
						for (local1030 = 0; local1030 < this.anInt837; local1030++) {
							if (this.aLongArray3[local1030] == local1335) {
								local1337 = true;
								break;
							}
						}
						if (!local1337 && this.anInt1011 == 0) {
							local1472 = local1321.substring(local1321.indexOf(":") + 1, local1321.length() - 9);
							this.method622(local756, local1472, 8);
						}
					} else {
						this.method622("", local1321, 0);
					}
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 50) {
					local165 = this.aClass10_Sub1_Sub3_9.method314();
					if (local165 >= 0) {
						this.method687(local165);
					}
					if (local165 != this.anInt1027) {
						this.method619(aBoolean249, this.anInt1027);
						this.anInt1027 = local165;
					}
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 82) {
					@Pc(1535) boolean local1535 = this.aClass10_Sub1_Sub3_9.method311() == 1;
					local170 = this.aClass10_Sub1_Sub3_9.method313();
					Class14.method87(local170).aBoolean33 = local1535;
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 174) {
					if (this.anInt1031 == 12) {
						this.aBoolean248 = true;
					}
					this.anInt911 = this.aClass10_Sub1_Sub3_9.method314();
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 233) {
					this.anInt1047 = this.aClass10_Sub1_Sub3_9.method311();
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 61) {
					this.anInt955 = 0;
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 128) {
					local165 = this.aClass10_Sub1_Sub3_9.method340();
					local170 = this.aClass10_Sub1_Sub3_9.method341();
					if (this.anInt888 != -1) {
						this.method619(aBoolean249, this.anInt888);
						this.anInt888 = -1;
						this.aBoolean255 = true;
					}
					if (this.anInt926 != -1) {
						this.method619(aBoolean249, this.anInt926);
						this.anInt926 = -1;
						this.aBoolean236 = true;
					}
					if (this.anInt880 != -1) {
						this.method619(aBoolean249, this.anInt880);
						this.anInt880 = -1;
					}
					if (this.anInt976 != local165) {
						this.method619(aBoolean249, this.anInt976);
						this.anInt976 = local165;
					}
					if (this.anInt941 != local170) {
						this.method619(aBoolean249, this.anInt941);
						this.anInt941 = local170;
					}
					if (this.anInt1010 != 0) {
						this.anInt1010 = 0;
						this.aBoolean255 = true;
					}
					this.aBoolean248 = true;
					this.aBoolean225 = true;
					this.aBoolean254 = false;
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 67) {
					local165 = this.aClass10_Sub1_Sub3_9.method311();
					local170 = this.aClass10_Sub1_Sub3_9.method311();
					local174 = this.aClass10_Sub1_Sub3_9.method311();
					local212 = this.aClass10_Sub1_Sub3_9.method311();
					this.aBooleanArray11[local165] = true;
					this.anIntArray253[local165] = local170;
					this.anIntArray215[local165] = local174;
					this.anIntArray235[local165] = local212;
					this.anIntArray257[local165] = 0;
					this.anInt844 = -1;
					return true;
				}
				@Pc(1762) Class14 local1762;
				if (this.anInt844 == 134) {
					this.aBoolean248 = true;
					local165 = this.aClass10_Sub1_Sub3_9.method313();
					local1762 = Class14.method87(local165);
					while (this.aClass10_Sub1_Sub3_9.anInt428 < this.anInt843) {
						local174 = this.aClass10_Sub1_Sub3_9.method325();
						local212 = this.aClass10_Sub1_Sub3_9.method313();
						local724 = this.aClass10_Sub1_Sub3_9.method311();
						if (local724 == 255) {
							local724 = this.aClass10_Sub1_Sub3_9.method316();
						}
						if (local174 >= 0 && local174 < local1762.anIntArray44.length) {
							local1762.anIntArray44[local174] = local212;
							local1762.anIntArray40[local174] = local724;
						}
					}
					this.anInt844 = -1;
					return true;
				}
				@Pc(1967) int local1967;
				@Pc(1820) long local1820;
				if (this.anInt844 == 78) {
					local1820 = this.aClass10_Sub1_Sub3_9.method317();
					local174 = this.aClass10_Sub1_Sub3_9.method311();
					@Pc(1830) String local1830 = Class26.method252(Class26.method249(local1820), (byte) 7);
					for (local724 = 0; local724 < this.anInt838; local724++) {
						if (local1820 == this.aLongArray4[local724]) {
							if (this.anIntArray265[local724] != local174) {
								this.anIntArray265[local724] = local174;
								this.aBoolean248 = true;
								if (local174 > 0) {
									this.method622("", local1830 + " has logged in.", 5);
								}
								if (local174 == 0) {
									this.method622("", local1830 + " has logged out.", 5);
								}
							}
							local1830 = null;
							break;
						}
					}
					if (local1830 != null && this.anInt838 < 200) {
						this.aLongArray4[this.anInt838] = local1820;
						this.aStringArray8[this.anInt838] = local1830;
						this.anIntArray265[this.anInt838] = local174;
						this.anInt838++;
						this.aBoolean248 = true;
					}
					@Pc(1928) boolean local1928 = false;
					while (!local1928) {
						local1928 = true;
						for (local1041 = 0; local1041 < this.anInt838 - 1; local1041++) {
							if (this.anIntArray265[local1041] != anInt868 && this.anIntArray265[local1041 + 1] == anInt868 || this.anIntArray265[local1041] == 0 && this.anIntArray265[local1041 + 1] != 0) {
								local1967 = this.anIntArray265[local1041];
								this.anIntArray265[local1041] = this.anIntArray265[local1041 + 1];
								this.anIntArray265[local1041 + 1] = local1967;
								@Pc(1989) String local1989 = this.aStringArray8[local1041];
								this.aStringArray8[local1041] = this.aStringArray8[local1041 + 1];
								this.aStringArray8[local1041 + 1] = local1989;
								@Pc(2011) long local2011 = this.aLongArray4[local1041];
								this.aLongArray4[local1041] = this.aLongArray4[local1041 + 1];
								this.aLongArray4[local1041 + 1] = local2011;
								this.aBoolean248 = true;
								local1928 = false;
							}
						}
					}
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 58) {
					this.aBoolean216 = false;
					this.anInt1010 = 1;
					this.aString20 = "";
					this.aBoolean255 = true;
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 252) {
					this.anInt1031 = this.aClass10_Sub1_Sub3_9.method331();
					this.aBoolean248 = true;
					this.aBoolean225 = true;
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 40) {
					this.anInt890 = this.aClass10_Sub1_Sub3_9.method332(this.anInt1006);
					this.anInt889 = this.aClass10_Sub1_Sub3_9.method331();
					for (local165 = this.anInt889; local165 < this.anInt889 + 8; local165++) {
						for (local170 = this.anInt890; local170 < this.anInt890 + 8; local170++) {
							if (this.aClass6ArrayArrayArray1[this.anInt942][local165][local170] != null) {
								this.aClass6ArrayArrayArray1[this.anInt942][local165][local170] = null;
								this.method601(local165, local170);
							}
						}
					}
					for (@Pc(2159) Class10_Sub2 local2159 = (Class10_Sub2) this.aClass6_11.method6(); local2159 != null; local2159 = (Class10_Sub2) this.aClass6_11.method8()) {
						if (local2159.anInt456 >= this.anInt889 && local2159.anInt456 < this.anInt889 + 8 && local2159.anInt457 >= this.anInt890 && local2159.anInt457 < this.anInt890 + 8 && local2159.anInt454 == this.anInt942) {
							local2159.anInt453 = 0;
						}
					}
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 255) {
					local165 = this.aClass10_Sub1_Sub3_9.method341();
					Class14.method87(local165).anInt145 = 3;
					if (aClass10_Sub1_Sub2_Sub3_Sub2_1.aClass38_2 == null) {
						Class14.method87(local165).anInt146 = (aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray199[0] << 25) + (aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray199[4] << 20) + (aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray198[0] << 15) + (aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray198[8] << 10) + (aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray198[11] << 5) + aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray198[1];
					} else {
						Class14.method87(local165).anInt146 = (int) (aClass10_Sub1_Sub2_Sub3_Sub2_1.aClass38_2.aLong19 + 305419896L);
					}
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 135) {
					local1820 = this.aClass10_Sub1_Sub3_9.method317();
					local174 = this.aClass10_Sub1_Sub3_9.method316();
					local212 = this.aClass10_Sub1_Sub3_9.method311();
					local1337 = false;
					for (local1030 = 0; local1030 < 100; local1030++) {
						if (this.anIntArray263[local1030] == local174) {
							local1337 = true;
							break;
						}
					}
					if (local212 <= 1) {
						for (local1041 = 0; local1041 < this.anInt837; local1041++) {
							if (this.aLongArray3[local1041] == local1820) {
								local1337 = true;
								break;
							}
						}
					}
					if (!local1337 && this.anInt1011 == 0) {
						try {
							this.anIntArray263[this.anInt970] = local174;
							this.anInt970 = (this.anInt970 + 1) % 100;
							local1472 = Class32.method371(this.aClass10_Sub1_Sub3_9, this.anInt843 - 13);
							if (local212 != 3) {
								local1472 = Class46.method452(local1472);
							}
							if (local212 == 2 || local212 == 3) {
								this.method622("@cr2@" + Class26.method252(Class26.method249(local1820), (byte) 7), local1472, 7);
							} else if (local212 == 1) {
								this.method622("@cr1@" + Class26.method252(Class26.method249(local1820), (byte) 7), local1472, 7);
							} else {
								this.method622(Class26.method252(Class26.method249(local1820), (byte) 7), local1472, 3);
							}
						} catch (@Pc(2432) Exception local2432) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 183) {
					this.anInt889 = this.aClass10_Sub1_Sub3_9.method311();
					this.anInt890 = this.aClass10_Sub1_Sub3_9.method330();
					while (this.aClass10_Sub1_Sub3_9.anInt428 < this.anInt843) {
						local165 = this.aClass10_Sub1_Sub3_9.method311();
						this.method708(this.aClass10_Sub1_Sub3_9, local165);
					}
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 159) {
					local165 = this.aClass10_Sub1_Sub3_9.method341();
					this.method687(local165);
					if (this.anInt941 != -1) {
						this.method619(aBoolean249, this.anInt941);
						this.anInt941 = -1;
						this.aBoolean248 = true;
						this.aBoolean225 = true;
					}
					if (this.anInt888 != -1) {
						this.method619(aBoolean249, this.anInt888);
						this.anInt888 = -1;
						this.aBoolean255 = true;
					}
					if (this.anInt926 != -1) {
						this.method619(aBoolean249, this.anInt926);
						this.anInt926 = -1;
						this.aBoolean236 = true;
					}
					if (this.anInt880 != -1) {
						this.method619(aBoolean249, this.anInt880);
						this.anInt880 = -1;
					}
					if (this.anInt976 != local165) {
						this.method619(aBoolean249, this.anInt976);
						this.anInt976 = local165;
					}
					if (this.anInt1010 != 0) {
						this.anInt1010 = 0;
						this.aBoolean255 = true;
					}
					this.aBoolean254 = false;
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 246) {
					local165 = this.aClass10_Sub1_Sub3_9.method341();
					this.method687(local165);
					if (this.anInt888 != -1) {
						this.method619(aBoolean249, this.anInt888);
						this.anInt888 = -1;
						this.aBoolean255 = true;
					}
					if (this.anInt926 != -1) {
						this.method619(aBoolean249, this.anInt926);
						this.anInt926 = -1;
						this.aBoolean236 = true;
					}
					if (this.anInt880 != -1) {
						this.method619(aBoolean249, this.anInt880);
						this.anInt880 = -1;
					}
					if (this.anInt976 != -1) {
						this.method619(aBoolean249, this.anInt976);
						this.anInt976 = -1;
					}
					if (this.anInt941 != local165) {
						this.method619(aBoolean249, this.anInt941);
						this.anInt941 = local165;
					}
					if (this.anInt1010 != 0) {
						this.anInt1010 = 0;
						this.aBoolean255 = true;
					}
					this.aBoolean248 = true;
					this.aBoolean225 = true;
					this.aBoolean254 = false;
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 49) {
					this.aBoolean248 = true;
					local165 = this.aClass10_Sub1_Sub3_9.method331();
					local170 = this.aClass10_Sub1_Sub3_9.method311();
					local174 = this.aClass10_Sub1_Sub3_9.method316();
					this.anIntArray214[local165] = local174;
					this.anIntArray242[local165] = local170;
					this.anIntArray245[local165] = 1;
					for (local212 = 0; local212 < 98; local212++) {
						if (local174 >= anIntArray228[local212]) {
							this.anIntArray245[local165] = local212 + 2;
						}
					}
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 206) {
					this.aBoolean248 = true;
					local165 = this.aClass10_Sub1_Sub3_9.method313();
					local1762 = Class14.method87(local165);
					local174 = this.aClass10_Sub1_Sub3_9.method313();
					for (local212 = 0; local212 < local174; local212++) {
						local1762.anIntArray44[local212] = this.aClass10_Sub1_Sub3_9.method341();
						local724 = this.aClass10_Sub1_Sub3_9.method331();
						if (local724 == 255) {
							local724 = this.aClass10_Sub1_Sub3_9.method345();
						}
						local1762.anIntArray40[local212] = local724;
					}
					for (local724 = local174; local724 < local1762.anIntArray44.length; local724++) {
						local1762.anIntArray44[local724] = 0;
						local1762.anIntArray40[local724] = 0;
					}
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 222 || this.anInt844 == 53) {
					local165 = this.anInt854;
					local170 = this.anInt855;
					if (this.anInt844 == 222) {
						local170 = this.aClass10_Sub1_Sub3_9.method313();
						local165 = this.aClass10_Sub1_Sub3_9.method341();
						this.aBoolean247 = false;
					}
					if (this.anInt844 == 53) {
						local165 = this.aClass10_Sub1_Sub3_9.method340();
						this.aClass10_Sub1_Sub3_9.method321((byte) 6);
						local174 = 0;
						while (true) {
							if (local174 >= 4) {
								this.aClass10_Sub1_Sub3_9.method323();
								local170 = this.aClass10_Sub1_Sub3_9.method340();
								this.aBoolean247 = true;
								break;
							}
							for (local212 = 0; local212 < 13; local212++) {
								for (local724 = 0; local724 < 13; local724++) {
									local1030 = this.aClass10_Sub1_Sub3_9.method322(1);
									if (local1030 == 1) {
										this.anIntArrayArrayArray7[local174][local212][local724] = this.aClass10_Sub1_Sub3_9.method322(26);
									} else {
										this.anIntArrayArrayArray7[local174][local212][local724] = -1;
									}
								}
							}
							local174++;
						}
					}
					if (this.anInt854 == local165 && this.anInt855 == local170 && this.anInt933 == 2) {
						this.anInt844 = -1;
						return true;
					}
					this.anInt854 = local165;
					this.anInt855 = local170;
					this.anInt914 = (this.anInt854 - 6) * 8;
					this.anInt915 = (this.anInt855 - 6) * 8;
					this.aBoolean238 = false;
					if ((this.anInt854 / 8 == 48 || this.anInt854 / 8 == 49) && this.anInt855 / 8 == 48) {
						this.aBoolean238 = true;
					}
					if (this.anInt854 / 8 == 48 && this.anInt855 / 8 == 148) {
						this.aBoolean238 = true;
					}
					this.anInt933 = 1;
					this.aLong32 = System.currentTimeMillis();
					this.method700(null, "Loading - please wait.");
					if (this.anInt844 == 222) {
						local174 = 0;
						local212 = (this.anInt854 - 6) / 8;
						label1207: while (true) {
							if (local212 > (this.anInt854 + 6) / 8) {
								this.aByteArrayArray5 = new byte[local174][];
								this.aByteArrayArray6 = new byte[local174][];
								this.anIntArray216 = new int[local174];
								this.anIntArray217 = new int[local174];
								this.anIntArray218 = new int[local174];
								local174 = 0;
								local724 = (this.anInt854 - 6) / 8;
								while (true) {
									if (local724 > (this.anInt854 + 6) / 8) {
										break label1207;
									}
									for (local1030 = (this.anInt855 - 6) / 8; local1030 <= (this.anInt855 + 6) / 8; local1030++) {
										this.anIntArray216[local174] = (local724 << 8) + local1030;
										if (this.aBoolean238 && (local1030 == 49 || local1030 == 149 || local1030 == 147 || local724 == 50 || local724 == 49 && local1030 == 47)) {
											this.anIntArray217[local174] = -1;
											this.anIntArray218[local174] = -1;
											local174++;
										} else {
											local1041 = this.anIntArray217[local174] = this.aClass33_Sub1_1.method573(local724, local1030, 0);
											if (local1041 != -1) {
												this.aClass33_Sub1_1.method558(3, local1041);
											}
											local1967 = this.anIntArray218[local174] = this.aClass33_Sub1_1.method573(local724, local1030, 1);
											if (local1967 != -1) {
												this.aClass33_Sub1_1.method558(3, local1967);
											}
											local174++;
										}
									}
									local724++;
								}
							}
							for (local724 = (this.anInt855 - 6) / 8; local724 <= (this.anInt855 + 6) / 8; local724++) {
								local174++;
							}
							local212++;
						}
					}
					if (this.anInt844 == 53) {
						local174 = 0;
						@Pc(3216) int[] local3216 = new int[676];
						local724 = 0;
						label1166: while (true) {
							@Pc(3246) int local3246;
							@Pc(3252) int local3252;
							@Pc(3262) int local3262;
							if (local724 >= 4) {
								this.aByteArrayArray5 = new byte[local174][];
								this.aByteArrayArray6 = new byte[local174][];
								this.anIntArray216 = new int[local174];
								this.anIntArray217 = new int[local174];
								this.anIntArray218 = new int[local174];
								local1030 = 0;
								while (true) {
									if (local1030 >= local174) {
										break label1166;
									}
									local1041 = this.anIntArray216[local1030] = local3216[local1030];
									local1967 = local1041 >> 8 & 0xFF;
									local3246 = local1041 & 0xFF;
									local3252 = this.anIntArray217[local1030] = this.aClass33_Sub1_1.method573(local1967, local3246, 0);
									if (local3252 != -1) {
										this.aClass33_Sub1_1.method558(3, local3252);
									}
									local3262 = this.anIntArray218[local1030] = this.aClass33_Sub1_1.method573(local1967, local3246, 1);
									if (local3262 != -1) {
										this.aClass33_Sub1_1.method558(3, local3262);
									}
									local1030++;
								}
							}
							for (local1030 = 0; local1030 < 13; local1030++) {
								for (local1041 = 0; local1041 < 13; local1041++) {
									local1967 = this.anIntArrayArrayArray7[local724][local1030][local1041];
									if (local1967 != -1) {
										local3246 = local1967 >> 14 & 0x3FF;
										local3252 = local1967 >> 3 & 0x7FF;
										local3262 = (local3246 / 8 << 8) + local3252 / 8;
										for (@Pc(3264) int local3264 = 0; local3264 < local174; local3264++) {
											if (local3216[local3264] == local3262) {
												local3262 = -1;
												break;
											}
										}
										if (local3262 != -1) {
											local3216[local174++] = local3262;
										}
									}
								}
							}
							local724++;
						}
					}
					local174 = this.anInt914 - this.anInt916;
					local212 = this.anInt915 - this.anInt917;
					this.anInt916 = this.anInt914;
					this.anInt917 = this.anInt915;
					for (local724 = 0; local724 < 16384; local724++) {
						@Pc(3417) Class10_Sub1_Sub2_Sub3_Sub1 local3417 = this.aClass10_Sub1_Sub2_Sub3_Sub1Array1[local724];
						if (local3417 != null) {
							for (local1041 = 0; local1041 < 10; local1041++) {
								local3417.anIntArray193[local1041] -= local174;
								local3417.anIntArray194[local1041] -= local212;
							}
							local3417.anInt739 -= local174 * 128;
							local3417.anInt740 -= local212 * 128;
						}
					}
					for (local1030 = 0; local1030 < this.anInt882; local1030++) {
						@Pc(3472) Class10_Sub1_Sub2_Sub3_Sub2 local3472 = this.aClass10_Sub1_Sub2_Sub3_Sub2Array1[local1030];
						if (local3472 != null) {
							for (local1967 = 0; local1967 < 10; local1967++) {
								local3472.anIntArray193[local1967] -= local174;
								local3472.anIntArray194[local1967] -= local212;
							}
							local3472.anInt739 -= local174 * 128;
							local3472.anInt740 -= local212 * 128;
						}
					}
					this.aBoolean251 = true;
					@Pc(3524) byte local3524 = 0;
					@Pc(3526) byte local3526 = 104;
					@Pc(3528) byte local3528 = 1;
					if (local174 < 0) {
						local3524 = 103;
						local3526 = -1;
						local3528 = -1;
					}
					@Pc(3538) byte local3538 = 0;
					@Pc(3540) byte local3540 = 104;
					@Pc(3542) byte local3542 = 1;
					if (local212 < 0) {
						local3538 = 103;
						local3540 = -1;
						local3542 = -1;
					}
					for (@Pc(3552) int local3552 = local3524; local3552 != local3526; local3552 += local3528) {
						for (@Pc(3556) int local3556 = local3538; local3556 != local3540; local3556 += local3542) {
							@Pc(3562) int local3562 = local3552 + local174;
							@Pc(3566) int local3566 = local3556 + local212;
							for (@Pc(3568) int local3568 = 0; local3568 < 4; local3568++) {
								if (local3562 >= 0 && local3566 >= 0 && local3562 < 104 && local3566 < 104) {
									this.aClass6ArrayArrayArray1[local3568][local3552][local3556] = this.aClass6ArrayArrayArray1[local3568][local3562][local3566];
								} else {
									this.aClass6ArrayArrayArray1[local3568][local3552][local3556] = null;
								}
							}
						}
					}
					for (@Pc(3630) Class10_Sub2 local3630 = (Class10_Sub2) this.aClass6_11.method6(); local3630 != null; local3630 = (Class10_Sub2) this.aClass6_11.method8()) {
						local3630.anInt456 -= local174;
						local3630.anInt457 -= local212;
						if (local3630.anInt456 < 0 || local3630.anInt457 < 0 || local3630.anInt456 >= 104 || local3630.anInt457 >= 104) {
							local3630.method534();
						}
					}
					if (this.anInt955 != 0) {
						this.anInt955 -= local174;
						this.anInt956 -= local212;
					}
					this.aBoolean252 = false;
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 190) {
					this.anInt929 = this.aClass10_Sub1_Sub3_9.method339() * 30;
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 41 || this.anInt844 == 121 || this.anInt844 == 203 || this.anInt844 == 106 || this.anInt844 == 59 || this.anInt844 == 181 || this.anInt844 == 208 || this.anInt844 == 107 || this.anInt844 == 142 || this.anInt844 == 88 || this.anInt844 == 152) {
					this.method708(this.aClass10_Sub1_Sub3_9, this.anInt844);
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 125) {
					if (this.anInt1031 == 12) {
						this.aBoolean248 = true;
					}
					this.anInt1049 = this.aClass10_Sub1_Sub3_9.method311();
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 21) {
					local165 = this.aClass10_Sub1_Sub3_9.method313();
					local170 = this.aClass10_Sub1_Sub3_9.method339();
					local174 = this.aClass10_Sub1_Sub3_9.method341();
					if (local170 == 65535) {
						Class14.method87(local174).anInt145 = 0;
						this.anInt844 = -1;
						return true;
					}
					@Pc(3818) Class17 local3818 = Class17.method104(local170);
					Class14.method87(local174).anInt145 = 4;
					Class14.method87(local174).anInt146 = local170;
					Class14.method87(local174).anInt130 = local3818.anInt192;
					Class14.method87(local174).anInt131 = local3818.anInt189;
					Class14.method87(local174).anInt129 = local3818.anInt200 * 100 / local165;
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 3) {
					this.aBoolean252 = true;
					this.anInt848 = this.aClass10_Sub1_Sub3_9.method311();
					this.anInt849 = this.aClass10_Sub1_Sub3_9.method311();
					this.anInt850 = this.aClass10_Sub1_Sub3_9.method313();
					this.anInt851 = this.aClass10_Sub1_Sub3_9.method311();
					this.anInt852 = this.aClass10_Sub1_Sub3_9.method311();
					if (this.anInt852 >= 100) {
						this.anInt990 = this.anInt848 * 128 + 64;
						this.anInt992 = this.anInt849 * 128 + 64;
						this.anInt991 = this.method685(this.anInt992, this.anInt990, this.anInt942) - this.anInt850;
					}
					this.anInt844 = -1;
					return true;
				}
				@Pc(3938) Class14 local3938;
				if (this.anInt844 == 2) {
					local165 = this.aClass10_Sub1_Sub3_9.method341();
					local170 = this.aClass10_Sub1_Sub3_9.method343();
					local3938 = Class14.method87(local165);
					if (local3938.anInt148 != local170 || local170 == -1) {
						local3938.anInt148 = local170;
						local3938.anInt119 = 0;
						local3938.anInt116 = 0;
					}
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 71) {
					this.method623(this.aClass10_Sub1_Sub3_9, this.aBoolean235, this.anInt843);
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 226) {
					this.anInt837 = this.anInt843 / 8;
					for (local165 = 0; local165 < this.anInt837; local165++) {
						this.aLongArray3[local165] = this.aClass10_Sub1_Sub3_9.method317();
					}
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 10) {
					local165 = this.aClass10_Sub1_Sub3_9.method332(this.anInt1006);
					local170 = this.aClass10_Sub1_Sub3_9.method340();
					if (local170 == 65535) {
						local170 = -1;
					}
					if (this.anIntArray248[local165] != local170) {
						this.method619(aBoolean249, this.anIntArray248[local165]);
						this.anIntArray248[local165] = local170;
					}
					this.aBoolean248 = true;
					this.aBoolean225 = true;
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 219) {
					local165 = this.aClass10_Sub1_Sub3_9.method339();
					local1762 = Class14.method87(local165);
					for (local174 = 0; local174 < local1762.anIntArray44.length; local174++) {
						local1762.anIntArray44[local174] = -1;
						local1762.anIntArray44[local174] = 0;
					}
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 238) {
					this.anInt988 = this.aClass10_Sub1_Sub3_9.method311();
					if (this.anInt988 == this.anInt1031) {
						if (this.anInt988 == 3) {
							this.anInt1031 = 1;
						} else {
							this.anInt1031 = 3;
						}
						this.aBoolean248 = true;
					}
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 148) {
					this.aBoolean252 = false;
					for (local165 = 0; local165 < 5; local165++) {
						this.aBooleanArray11[local165] = false;
					}
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 126) {
					this.anInt932 = this.aClass10_Sub1_Sub3_9.method311();
					this.anInt881 = this.aClass10_Sub1_Sub3_9.method339();
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 75) {
					this.anInt889 = this.aClass10_Sub1_Sub3_9.method331();
					this.anInt890 = this.aClass10_Sub1_Sub3_9.method330();
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 253) {
					local165 = this.aClass10_Sub1_Sub3_9.method339();
					local170 = this.aClass10_Sub1_Sub3_9.method340();
					this.method687(local170);
					if (local165 != -1) {
						this.method687(local165);
					}
					if (this.anInt976 != -1) {
						this.method619(aBoolean249, this.anInt976);
						this.anInt976 = -1;
					}
					if (this.anInt941 != -1) {
						this.method619(aBoolean249, this.anInt941);
						this.anInt941 = -1;
					}
					if (this.anInt888 != -1) {
						this.method619(aBoolean249, this.anInt888);
						this.anInt888 = -1;
					}
					if (this.anInt926 != local170) {
						this.method619(aBoolean249, this.anInt926);
						this.anInt926 = local170;
					}
					if (this.anInt880 != local170) {
						this.method619(aBoolean249, this.anInt880);
						this.anInt880 = local165;
					}
					this.anInt1010 = 0;
					this.aBoolean254 = false;
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 251) {
					this.anInt839 = this.aClass10_Sub1_Sub3_9.method311();
					this.aBoolean248 = true;
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 18) {
					local165 = this.aClass10_Sub1_Sub3_9.method313();
					local170 = this.aClass10_Sub1_Sub3_9.method340();
					local174 = this.aClass10_Sub1_Sub3_9.method339();
					Class14.method87(local170).anInt112 = (local165 << 16) + local174;
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 90) {
					this.method671(this.anInt843, 69, this.aClass10_Sub1_Sub3_9);
					this.aBoolean251 = false;
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 113) {
					for (local165 = 0; local165 < this.anIntArray244.length; local165++) {
						if (this.anIntArray244[local165] != this.anIntArray240[local165]) {
							this.anIntArray244[local165] = this.anIntArray240[local165];
							this.method680(local165);
							this.aBoolean248 = true;
						}
					}
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 232) {
					local165 = this.aClass10_Sub1_Sub3_9.method341();
					local756 = this.aClass10_Sub1_Sub3_9.method318();
					Class14.method87(local165).aString2 = local756;
					@Pc(4425) int local4425 = this.anIntArray248[this.anInt1031];
					if (Class14.method87(local165).anInt128 == local4425) {
						this.aBoolean248 = true;
					}
					this.anInt844 = -1;
					return true;
				}
				if (this.anInt844 == 200) {
					local165 = this.aClass10_Sub1_Sub3_9.method313();
					local170 = this.aClass10_Sub1_Sub3_9.method341();
					local3938 = Class14.method87(local165);
					if (local3938 != null && local3938.anInt120 == 0) {
						if (local170 < 0) {
							local170 = 0;
						}
						if (local170 > local3938.anInt147 - local3938.anInt121) {
							local170 = local3938.anInt147 - local3938.anInt121;
						}
						local3938.anInt118 = local170;
					}
					this.anInt844 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt844 + "," + this.anInt843 + " - " + this.anInt861 + "," + this.anInt862);
				this.method699();
			} catch (@Pc(4509) IOException local4509) {
				this.method634();
			} catch (@Pc(4514) Exception local4514) {
				local1321 = "T2 - " + this.anInt844 + "," + this.anInt861 + "," + this.anInt862 + " - " + this.anInt843 + "," + (this.anInt914 + aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0]) + "," + (this.anInt915 + aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0]) + " - ";
				for (local170 = 0; local170 < this.anInt843 && local170 < 50; local170++) {
					local1321 = local1321 + this.aClass10_Sub1_Sub3_9.aByteArray12[local170] + ",";
				}
				signlink.reporterror(local1321);
				this.method699();
			}
			return true;
		} catch (@Pc(4595) RuntimeException local4595) {
			signlink.reporterror("11063, " + 21389 + ", " + local4595.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method609() {
		try {
			if (this.anInt984 >= 2 || this.anInt965 != 0 || this.anInt978 != 0) {
				@Pc(35) String local35;
				if (this.anInt965 == 1 && this.anInt984 < 2) {
					local35 = "Use " + this.aString30 + " with...";
				} else if (this.anInt978 == 1 && this.anInt984 < 2) {
					local35 = this.aString31 + "...";
				} else {
					local35 = this.aStringArray12[this.anInt984 - 1];
				}
				if (this.anInt984 > 2) {
					local35 = local35 + "@whi@ / " + (this.anInt984 - 2) + " more options";
				}
				this.aClass10_Sub1_Sub1_Sub2_4.method157(anInt1050 / 1000, 4, 16777215, 15, local35);
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("884, " + -79 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZIIIIIIIIII)Z")
	private boolean method610(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray22[local7][local11] = 0;
					this.anIntArrayArray25[local7][local11] = 99999999;
				}
			}
			local11 = arg10;
			@Pc(39) int local39 = arg2;
			this.anIntArrayArray22[arg10][arg2] = 99;
			this.anIntArrayArray25[arg10][arg2] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray254[0] = arg10;
			@Pc(66) int local66 = local55 + 1;
			this.anIntArray255[0] = arg2;
			@Pc(70) boolean local70 = false;
			@Pc(74) int local74 = this.anIntArray254.length;
			@Pc(81) int[][] local81 = this.aClass47Array1[this.anInt942].anIntArrayArray16;
			@Pc(192) int local192;
			while (local57 != local66) {
				local11 = this.anIntArray254[local57];
				local39 = this.anIntArray255[local57];
				local57 = (local57 + 1) % local74;
				if (local11 == arg7 && local39 == arg1) {
					local70 = true;
					break;
				}
				if (arg6 != 0) {
					if ((arg6 < 5 || arg6 == 10) && this.aClass47Array1[this.anInt942].method489(arg7, arg1, arg6 - 1, local11, local39, arg9)) {
						local70 = true;
						break;
					}
					if (arg6 < 10 && this.aClass47Array1[this.anInt942].method490(local39, arg7, local11, arg9, arg6 - 1, arg1)) {
						local70 = true;
						break;
					}
				}
				if (arg3 != 0 && arg4 != 0 && this.aClass47Array1[this.anInt942].method491(arg3, local11, arg7, arg8, arg4, arg1, local39)) {
					local70 = true;
					break;
				}
				local192 = this.anIntArrayArray25[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray22[local11 - 1][local39] == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0) {
					this.anIntArray254[local66] = local11 - 1;
					this.anIntArray255[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11 - 1][local39] = 2;
					this.anIntArrayArray25[local11 - 1][local39] = local192;
				}
				if (local11 < 103 && this.anIntArrayArray22[local11 + 1][local39] == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0) {
					this.anIntArray254[local66] = local11 + 1;
					this.anIntArray255[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11 + 1][local39] = 8;
					this.anIntArrayArray25[local11 + 1][local39] = local192;
				}
				if (local39 > 0 && this.anIntArrayArray22[local11][local39 - 1] == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray254[local66] = local11;
					this.anIntArray255[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11][local39 - 1] = 1;
					this.anIntArrayArray25[local11][local39 - 1] = local192;
				}
				if (local39 < 103 && this.anIntArrayArray22[local11][local39 + 1] == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray254[local66] = local11;
					this.anIntArray255[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11][local39 + 1] = 4;
					this.anIntArrayArray25[local11][local39 + 1] = local192;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray22[local11 - 1][local39 - 1] == 0 && (local81[local11 - 1][local39 - 1] & 0x128010E) == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray254[local66] = local11 - 1;
					this.anIntArray255[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray25[local11 - 1][local39 - 1] = local192;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray22[local11 + 1][local39 - 1] == 0 && (local81[local11 + 1][local39 - 1] & 0x1280183) == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray254[local66] = local11 + 1;
					this.anIntArray255[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray25[local11 + 1][local39 - 1] = local192;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray22[local11 - 1][local39 + 1] == 0 && (local81[local11 - 1][local39 + 1] & 0x1280138) == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray254[local66] = local11 - 1;
					this.anIntArray255[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray25[local11 - 1][local39 + 1] = local192;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray22[local11 + 1][local39 + 1] == 0 && (local81[local11 + 1][local39 + 1] & 0x12801E0) == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray254[local66] = local11 + 1;
					this.anIntArray255[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray25[local11 + 1][local39 + 1] = local192;
				}
			}
			this.anInt957 = 0;
			@Pc(808) int local808;
			@Pc(814) int local814;
			@Pc(820) int local820;
			if (!local70) {
				if (!arg0) {
					return false;
				}
				local192 = 1000;
				local808 = 100;
				for (local814 = arg7 - 10; local814 <= arg7 + 10; local814++) {
					for (local820 = arg1 - 10; local820 <= arg1 + 10; local820++) {
						if (local814 >= 0 && local820 >= 0 && local814 < 104 && local820 < 104 && this.anIntArrayArray25[local814][local820] < 100) {
							@Pc(842) int local842 = 0;
							if (local814 < arg7) {
								local842 = arg7 - local814;
							} else if (local814 > arg7 + arg3 - 1) {
								local842 = local814 + 1 - arg7 - arg3;
							}
							@Pc(868) int local868 = 0;
							if (local820 < arg1) {
								local868 = arg1 - local820;
							} else if (local820 > arg1 + arg4 - 1) {
								local868 = local820 + 1 - arg1 - arg4;
							}
							@Pc(900) int local900 = local842 * local842 + local868 * local868;
							if (local900 < local192 || local900 == local192 && this.anIntArrayArray25[local814][local820] < local808) {
								local192 = local900;
								local808 = this.anIntArrayArray25[local814][local820];
								local11 = local814;
								local39 = local820;
							}
						}
					}
				}
				if (local192 == 1000) {
					return false;
				}
				if (local11 == arg10 && local39 == arg2) {
					return false;
				}
				this.anInt957 = 1;
			}
			@Pc(961) byte local961 = 0;
			this.anIntArray254[0] = local11;
			local57 = local961 + 1;
			this.anIntArray255[0] = local39;
			local192 = local808 = this.anIntArrayArray22[local11][local39];
			while (local11 != arg10 || local39 != arg2) {
				if (local192 != local808) {
					local808 = local192;
					this.anIntArray254[local57] = local11;
					this.anIntArray255[local57++] = local39;
				}
				if ((local192 & 0x2) != 0) {
					local11++;
				} else if ((local192 & 0x8) != 0) {
					local11--;
				}
				if ((local192 & 0x1) != 0) {
					local39++;
				} else if ((local192 & 0x4) != 0) {
					local39--;
				}
				local192 = this.anIntArrayArray22[local11][local39];
			}
			if (local57 > 0) {
				local74 = local57;
				if (local57 > 25) {
					local74 = 25;
				}
				local57--;
				@Pc(1055) int local1055 = this.anIntArray254[local57];
				local814 = this.anIntArray255[local57];
				if (arg5 == 0) {
					this.aClass10_Sub1_Sub3_7.method300(28);
					this.aClass10_Sub1_Sub3_7.method301(local74 + local74 + 3);
				}
				if (arg5 == 1) {
					this.aClass10_Sub1_Sub3_7.method300(213);
					this.aClass10_Sub1_Sub3_7.method301(local74 + local74 + 3 + 14);
				}
				if (arg5 == 2) {
					this.aClass10_Sub1_Sub3_7.method300(247);
					this.aClass10_Sub1_Sub3_7.method301(local74 + local74 + 3);
				}
				this.aClass10_Sub1_Sub3_7.method338(local1055 + this.anInt914);
				this.aClass10_Sub1_Sub3_7.method301(super.anIntArray210[5] == 1 ? 1 : 0);
				this.aClass10_Sub1_Sub3_7.method338(local814 + this.anInt915);
				this.anInt955 = this.anIntArray254[0];
				this.anInt956 = this.anIntArray255[0];
				for (local820 = 1; local820 < local74; local820++) {
					local57--;
					this.aClass10_Sub1_Sub3_7.method301(this.anIntArray254[local57] - local1055);
					this.aClass10_Sub1_Sub3_7.method329(this.anIntArray255[local57] - local814);
				}
				return true;
			} else if (arg5 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1187) RuntimeException local1187) {
			signlink.reporterror("65809, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1187.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method611() {
		try {
			if (this.anInt933 == 2) {
				for (@Pc(16) Class10_Sub2 local16 = (Class10_Sub2) this.aClass6_11.method6(); local16 != null; local16 = (Class10_Sub2) this.aClass6_11.method8()) {
					if (local16.anInt453 > 0) {
						local16.anInt453--;
					}
					if (local16.anInt453 != 0) {
						if (local16.anInt458 > 0) {
							local16.anInt458--;
						}
						if (local16.anInt458 == 0 && local16.anInt456 >= 1 && local16.anInt457 >= 1 && local16.anInt456 <= 102 && local16.anInt457 <= 102 && (local16.anInt447 < 0 || Class8.method18(local16.anInt449, this.aByte50, local16.anInt447))) {
							this.method620(local16.anInt448, local16.anInt456, local16.anInt447, local16.anInt457, local16.anInt454, local16.anInt449, local16.anInt455);
							local16.anInt458 = -1;
							if (local16.anInt447 == local16.anInt450 && local16.anInt450 == -1) {
								local16.method534();
							} else if (local16.anInt447 == local16.anInt450 && local16.anInt448 == local16.anInt451 && local16.anInt449 == local16.anInt452) {
								local16.method534();
							}
						}
					} else if (local16.anInt450 < 0 || Class8.method18(local16.anInt452, this.aByte50, local16.anInt450)) {
						this.method620(local16.anInt451, local16.anInt456, local16.anInt450, local16.anInt457, local16.anInt454, local16.anInt452, local16.anInt455);
						local16.method534();
					}
				}
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("6774, " + 16220 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)Ljava/lang/String;")
	private String method612() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("25300, " + -42588 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!ZGNGQRPJ;I)V")
	private void method613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class10_Sub1_Sub2_Sub3_Sub2 arg3) {
		try {
			if (arg3 != aClass10_Sub1_Sub2_Sub3_Sub2_1 && this.anInt984 < 400) {
				@Pc(43) String local43;
				if (arg3.anInt770 == 0) {
					local43 = arg3.aString14 + method667(arg3.anInt767, aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt767) + " (level-" + arg3.anInt767 + ")";
				} else {
					local43 = arg3.aString14 + " (skill-" + arg3.anInt770 + ")";
				}
				@Pc(173) int local173;
				if (this.anInt965 == 1) {
					this.aStringArray12[this.anInt984] = "Use " + this.aString30 + " with @whi@" + local43;
					this.anIntArray233[this.anInt984] = 596;
					this.anIntArray234[this.anInt984] = arg0;
					this.anIntArray231[this.anInt984] = arg2;
					this.anIntArray232[this.anInt984] = arg1;
					this.anInt984++;
				} else if (this.anInt978 != 1) {
					for (local173 = 4; local173 >= 0; local173--) {
						if (this.aStringArray11[local173] != null) {
							this.aStringArray12[this.anInt984] = this.aStringArray11[local173] + " @whi@" + local43;
							@Pc(200) short local200 = 0;
							if (this.aStringArray11[local173].equalsIgnoreCase("attack")) {
								if (arg3.anInt767 > aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt767) {
									local200 = 2000;
								}
								if (aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt773 != 0 && arg3.anInt773 != 0) {
									if (aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt773 == arg3.anInt773) {
										local200 = 2000;
									} else {
										local200 = 0;
									}
								}
							} else if (this.aBooleanArray12[local173]) {
								local200 = 2000;
							}
							if (local173 == 0) {
								this.anIntArray233[this.anInt984] = local200 + 200;
							}
							if (local173 == 1) {
								this.anIntArray233[this.anInt984] = local200 + 493;
							}
							if (local173 == 2) {
								this.anIntArray233[this.anInt984] = local200 + 408;
							}
							if (local173 == 3) {
								this.anIntArray233[this.anInt984] = local200 + 677;
							}
							if (local173 == 4) {
								this.anIntArray233[this.anInt984] = local200 + 876;
							}
							this.anIntArray234[this.anInt984] = arg0;
							this.anIntArray231[this.anInt984] = arg2;
							this.anIntArray232[this.anInt984] = arg1;
							this.anInt984++;
						}
					}
				} else if ((this.anInt980 & 0x8) == 8) {
					this.aStringArray12[this.anInt984] = this.aString31 + " @whi@" + local43;
					this.anIntArray233[this.anInt984] = 918;
					this.anIntArray234[this.anInt984] = arg0;
					this.anIntArray231[this.anInt984] = arg2;
					this.anIntArray232[this.anInt984] = arg1;
					this.anInt984++;
				}
				for (local173 = 0; local173 < this.anInt984; local173++) {
					if (this.anIntArray233[local173] == 14) {
						this.aStringArray12[local173] = "Walk here @whi@" + local43;
						return;
					}
				}
			}
		} catch (@Pc(350) RuntimeException local350) {
			signlink.reporterror("21590, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + local350.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method614() {
		try {
			if (super.anInt821 == 1) {
				if (super.anInt822 >= 6 && super.anInt822 <= 106 && super.anInt823 >= 467 && super.anInt823 <= 499) {
					this.anInt899 = (this.anInt899 + 1) % 4;
					this.aBoolean253 = true;
					this.aBoolean255 = true;
					this.aClass10_Sub1_Sub3_7.method300(176);
					this.aClass10_Sub1_Sub3_7.method301(this.anInt899);
					this.aClass10_Sub1_Sub3_7.method301(this.anInt853);
					this.aClass10_Sub1_Sub3_7.method301(this.anInt1000);
				}
				if (super.anInt822 >= 135 && super.anInt822 <= 235 && super.anInt823 >= 467 && super.anInt823 <= 499) {
					this.anInt853 = (this.anInt853 + 1) % 3;
					this.aBoolean253 = true;
					this.aBoolean255 = true;
					this.aClass10_Sub1_Sub3_7.method300(176);
					this.aClass10_Sub1_Sub3_7.method301(this.anInt899);
					this.aClass10_Sub1_Sub3_7.method301(this.anInt853);
					this.aClass10_Sub1_Sub3_7.method301(this.anInt1000);
				}
				if (super.anInt822 >= 273 && super.anInt822 <= 373 && super.anInt823 >= 467 && super.anInt823 <= 499) {
					this.anInt1000 = (this.anInt1000 + 1) % 3;
					this.aBoolean253 = true;
					this.aBoolean255 = true;
					this.aClass10_Sub1_Sub3_7.method300(176);
					this.aClass10_Sub1_Sub3_7.method301(this.anInt899);
					this.aClass10_Sub1_Sub3_7.method301(this.anInt853);
					this.aClass10_Sub1_Sub3_7.method301(this.anInt1000);
				}
				if (super.anInt822 >= 412 && super.anInt822 <= 512 && super.anInt823 >= 467 && super.anInt823 <= 499) {
					if (this.anInt976 == -1) {
						this.method590();
						this.aString17 = "";
						this.aBoolean241 = false;
						this.anInt1002 = this.anInt976 = Class14.anInt127;
					} else {
						this.method622("", "Please close the interface you have open before using 'report abuse'", 0);
					}
				}
				anInt972++;
				if (anInt972 > 161) {
					anInt972 = 0;
					this.aClass10_Sub1_Sub3_7.method300(22);
					this.aClass10_Sub1_Sub3_7.method302(38304);
					return;
				}
			}
		} catch (@Pc(221) RuntimeException local221) {
			signlink.reporterror("16738, " + true + ", " + local221.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!MFMVIYHT;I)V")
	private void method615(@OriginalArg(0) int arg0, @OriginalArg(1) Class10_Sub1_Sub3 arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt885; local1++) {
				@Pc(8) int local8 = this.anIntArray230[local1];
				@Pc(13) Class10_Sub1_Sub2_Sub3_Sub2 local13 = this.aClass10_Sub1_Sub2_Sub3_Sub2Array1[local8];
				@Pc(16) int local16 = arg1.method311();
				if ((local16 & 0x20) != 0) {
					local16 += arg1.method311() << 8;
				}
				this.method638(local8, local13, local16, arg1);
			}
			@Pc(43) boolean local43 = false;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("69503, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLclient!MFMVIYHT;)V")
	private void method616(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class10_Sub1_Sub3 arg2) {
		try {
			arg2.method321((byte) 6);
			@Pc(7) int local7 = arg2.method322(1);
			if (local7 != 0) {
				@Pc(15) int local15 = arg2.method322(2);
				this.aBoolean244 &= arg1;
				if (local15 == 0) {
					this.anIntArray230[this.anInt885++] = this.anInt883;
				} else {
					@Pc(44) int local44;
					@Pc(54) int local54;
					if (local15 == 1) {
						local44 = arg2.method322(3);
						aClass10_Sub1_Sub2_Sub3_Sub2_1.method540(false, local44);
						local54 = arg2.method322(1);
						if (local54 == 1) {
							this.anIntArray230[this.anInt885++] = this.anInt883;
						}
					} else {
						@Pc(98) int local98;
						if (local15 == 2) {
							local44 = arg2.method322(3);
							aClass10_Sub1_Sub2_Sub3_Sub2_1.method540(true, local44);
							local54 = arg2.method322(3);
							aClass10_Sub1_Sub2_Sub3_Sub2_1.method540(true, local54);
							local98 = arg2.method322(1);
							if (local98 == 1) {
								this.anIntArray230[this.anInt885++] = this.anInt883;
							}
						} else if (local15 == 3) {
							local44 = arg2.method322(1);
							this.anInt942 = arg2.method322(2);
							local54 = arg2.method322(7);
							local98 = arg2.method322(7);
							@Pc(143) int local143 = arg2.method322(1);
							if (local143 == 1) {
								this.anIntArray230[this.anInt885++] = this.anInt883;
							}
							aClass10_Sub1_Sub2_Sub3_Sub2_1.method542(local54, (byte) 5, local44 == 1, local98);
						}
					}
				}
			}
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("50251, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!EWIXBTLV;BIIIII)V")
	private void method617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (this.aBoolean242) {
				this.anInt1038 = 32;
			} else {
				this.anInt1038 = 0;
			}
			this.aBoolean242 = false;
			if (arg5 >= arg7 && arg5 < arg7 + 16 && arg3 >= arg1 && arg3 < arg1 + 16) {
				arg2.anInt118 -= this.anInt943 * 4;
				if (arg4 == 1) {
					this.aBoolean248 = true;
				}
				if (arg4 == 2 || arg4 == 3) {
					this.aBoolean255 = true;
				}
			} else if (arg5 >= arg7 && arg5 < arg7 + 16 && arg3 >= arg1 + arg6 - 16 && arg3 < arg1 + arg6) {
				arg2.anInt118 += this.anInt943 * 4;
				if (arg4 == 1) {
					this.aBoolean248 = true;
				}
				if (arg4 == 2 || arg4 == 3) {
					this.aBoolean255 = true;
				}
			} else if (arg5 >= arg7 - this.anInt1038 && arg5 < arg7 + this.anInt1038 + 16 && arg3 >= arg1 + 16 && arg3 < arg1 + arg6 - 16 && this.anInt943 > 0) {
				@Pc(148) int local148 = (arg6 - 32) * arg6 / arg0;
				if (local148 < 8) {
					local148 = 8;
				}
				@Pc(163) int local163 = arg3 - arg1 - local148 / 2 - 16;
				@Pc(169) int local169 = arg6 - local148 - 32;
				arg2.anInt118 = (arg0 - arg6) * local163 / local169;
				if (arg4 == 1) {
					this.aBoolean248 = true;
				}
				if (arg4 == 2 || arg4 == 3) {
					this.aBoolean255 = true;
				}
				this.aBoolean242 = true;
			}
		} catch (@Pc(198) RuntimeException local198) {
			signlink.reporterror("27524, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 102 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local198.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method618() {
		try {
			if (this.anInt965 == 0 && this.anInt978 == 0) {
				this.aStringArray12[this.anInt984] = "Walk here";
				this.anIntArray233[this.anInt984] = 14;
				this.anIntArray231[this.anInt984] = super.anInt816;
				this.anIntArray232[this.anInt984] = super.anInt817;
				this.anInt984++;
			}
			@Pc(41) int local41 = -1;
			for (@Pc(49) int local49 = 0; local49 < Class10_Sub1_Sub2_Sub4.anInt419; local49++) {
				@Pc(55) int local55 = Class10_Sub1_Sub2_Sub4.anIntArray145[local49];
				@Pc(59) int local59 = local55 & 0x7F;
				@Pc(65) int local65 = local55 >> 7 & 0x7F;
				@Pc(71) int local71 = local55 >> 29 & 0x3;
				@Pc(77) int local77 = local55 >> 14 & 0x7FFF;
				if (local55 != local41) {
					local41 = local55;
					@Pc(224) int local224;
					if (local71 == 2 && this.aClass23_1.method220(this.anInt942, local59, local65, local55) >= 0) {
						@Pc(97) Class48 local97 = Class48.method523(local77);
						if (local97.anIntArray192 != null) {
							local97 = local97.method524();
						}
						if (local97 == null) {
							continue;
						}
						if (this.anInt965 == 1) {
							this.aStringArray12[this.anInt984] = "Use " + this.aString30 + " with @cya@" + local97.aString12;
							this.anIntArray233[this.anInt984] = 467;
							this.anIntArray234[this.anInt984] = local55;
							this.anIntArray231[this.anInt984] = local59;
							this.anIntArray232[this.anInt984] = local65;
							this.anInt984++;
						} else if (this.anInt978 != 1) {
							if (local97.aStringArray7 != null) {
								for (local224 = 4; local224 >= 0; local224--) {
									if (local97.aStringArray7[local224] != null) {
										this.aStringArray12[this.anInt984] = local97.aStringArray7[local224] + " @cya@" + local97.aString12;
										if (local224 == 0) {
											this.anIntArray233[this.anInt984] = 35;
										}
										if (local224 == 1) {
											this.anIntArray233[this.anInt984] = 389;
										}
										if (local224 == 2) {
											this.anIntArray233[this.anInt984] = 888;
										}
										if (local224 == 3) {
											this.anIntArray233[this.anInt984] = 892;
										}
										if (local224 == 4) {
											this.anIntArray233[this.anInt984] = 1280;
										}
										this.anIntArray234[this.anInt984] = local55;
										this.anIntArray231[this.anInt984] = local59;
										this.anIntArray232[this.anInt984] = local65;
										this.anInt984++;
									}
								}
							}
							this.aStringArray12[this.anInt984] = "Examine @cya@" + local97.aString12;
							this.anIntArray233[this.anInt984] = 1412;
							this.anIntArray234[this.anInt984] = local97.anInt696 << 14;
							this.anIntArray231[this.anInt984] = local59;
							this.anIntArray232[this.anInt984] = local65;
							this.anInt984++;
						} else if ((this.anInt980 & 0x4) == 4) {
							this.aStringArray12[this.anInt984] = this.aString31 + " @cya@" + local97.aString12;
							this.anIntArray233[this.anInt984] = 376;
							this.anIntArray234[this.anInt984] = local55;
							this.anIntArray231[this.anInt984] = local59;
							this.anIntArray232[this.anInt984] = local65;
							this.anInt984++;
						}
					}
					@Pc(404) Class10_Sub1_Sub2_Sub3_Sub1 local404;
					@Pc(452) Class10_Sub1_Sub2_Sub3_Sub2 local452;
					@Pc(442) int local442;
					if (local71 == 1) {
						@Pc(375) Class10_Sub1_Sub2_Sub3_Sub1 local375 = this.aClass10_Sub1_Sub2_Sub3_Sub1Array1[local77];
						if (local375.aClass38_1.aByte31 == 1 && (local375.anInt739 & 0x7F) == 64 && (local375.anInt740 & 0x7F) == 64) {
							for (local224 = 0; local224 < this.anInt960; local224++) {
								local404 = this.aClass10_Sub1_Sub2_Sub3_Sub1Array1[this.anIntArray256[local224]];
								if (local404 != null && local404 != local375 && local404.aClass38_1.aByte31 == 1 && local404.anInt739 == local375.anInt739 && local404.anInt740 == local375.anInt740) {
									this.method657(local404.aClass38_1, local65, local59, this.anIntArray256[local224]);
								}
							}
							for (local442 = 0; local442 < this.anInt884; local442++) {
								local452 = this.aClass10_Sub1_Sub2_Sub3_Sub2Array1[this.anIntArray229[local442]];
								if (local452 != null && local452.anInt739 == local375.anInt739 && local452.anInt740 == local375.anInt740) {
									this.method613(this.anIntArray229[local442], local65, local59, local452);
								}
							}
						}
						this.method657(local375.aClass38_1, local65, local59, local77);
					}
					if (local71 == 0) {
						@Pc(494) Class10_Sub1_Sub2_Sub3_Sub2 local494 = this.aClass10_Sub1_Sub2_Sub3_Sub2Array1[local77];
						if ((local494.anInt739 & 0x7F) == 64 && (local494.anInt740 & 0x7F) == 64) {
							for (local224 = 0; local224 < this.anInt960; local224++) {
								local404 = this.aClass10_Sub1_Sub2_Sub3_Sub1Array1[this.anIntArray256[local224]];
								if (local404 != null && local404.aClass38_1.aByte31 == 1 && local404.anInt739 == local494.anInt739 && local404.anInt740 == local494.anInt740) {
									this.method657(local404.aClass38_1, local65, local59, this.anIntArray256[local224]);
								}
							}
							for (local442 = 0; local442 < this.anInt884; local442++) {
								local452 = this.aClass10_Sub1_Sub2_Sub3_Sub2Array1[this.anIntArray229[local442]];
								if (local452 != null && local452 != local494 && local452.anInt739 == local494.anInt739 && local452.anInt740 == local494.anInt740) {
									this.method613(this.anIntArray229[local442], local65, local59, local452);
								}
							}
						}
						this.method613(local77, local65, local59, local494);
					}
					if (local71 == 3) {
						@Pc(613) Class6 local613 = this.aClass6ArrayArrayArray1[this.anInt942][local59][local65];
						if (local613 != null) {
							for (@Pc(620) Class10_Sub1_Sub2_Sub1 local620 = (Class10_Sub1_Sub2_Sub1) local613.method7(); local620 != null; local620 = (Class10_Sub1_Sub2_Sub1) local613.method9()) {
								@Pc(626) Class17 local626 = Class17.method104(local620.anInt211);
								if (this.anInt965 == 1) {
									this.aStringArray12[this.anInt984] = "Use " + this.aString30 + " with @lre@" + local626.aString7;
									this.anIntArray233[this.anInt984] = 100;
									this.anIntArray234[this.anInt984] = local620.anInt211;
									this.anIntArray231[this.anInt984] = local59;
									this.anIntArray232[this.anInt984] = local65;
									this.anInt984++;
								} else if (this.anInt978 != 1) {
									for (@Pc(743) int local743 = 4; local743 >= 0; local743--) {
										if (local626.aStringArray2 != null && local626.aStringArray2[local743] != null) {
											this.aStringArray12[this.anInt984] = local626.aStringArray2[local743] + " @lre@" + local626.aString7;
											if (local743 == 0) {
												this.anIntArray233[this.anInt984] = 68;
											}
											if (local743 == 1) {
												this.anIntArray233[this.anInt984] = 26;
											}
											if (local743 == 2) {
												this.anIntArray233[this.anInt984] = 684;
											}
											if (local743 == 3) {
												this.anIntArray233[this.anInt984] = 930;
											}
											if (local743 == 4) {
												this.anIntArray233[this.anInt984] = 270;
											}
											this.anIntArray234[this.anInt984] = local620.anInt211;
											this.anIntArray231[this.anInt984] = local59;
											this.anIntArray232[this.anInt984] = local65;
											this.anInt984++;
										} else if (local743 == 2) {
											this.aStringArray12[this.anInt984] = "Take @lre@" + local626.aString7;
											this.anIntArray233[this.anInt984] = 684;
											this.anIntArray234[this.anInt984] = local620.anInt211;
											this.anIntArray231[this.anInt984] = local59;
											this.anIntArray232[this.anInt984] = local65;
											this.anInt984++;
										}
									}
									this.aStringArray12[this.anInt984] = "Examine @lre@" + local626.aString7;
									this.anIntArray233[this.anInt984] = 1564;
									this.anIntArray234[this.anInt984] = local620.anInt211;
									this.anIntArray231[this.anInt984] = local59;
									this.anIntArray232[this.anInt984] = local65;
									this.anInt984++;
								} else if ((this.anInt980 & 0x1) == 1) {
									this.aStringArray12[this.anInt984] = this.aString31 + " @lre@" + local626.aString7;
									this.anIntArray233[this.anInt984] = 199;
									this.anIntArray234[this.anInt984] = local620.anInt211;
									this.anIntArray231[this.anInt984] = local59;
									this.anIntArray232[this.anInt984] = local65;
									this.anInt984++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(950) RuntimeException local950) {
			signlink.reporterror("4081, " + 7 + ", " + local950.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method619(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0) {
				Class14.method92(aBoolean249, arg1);
			}
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("50870, " + arg0 + ", " + arg1 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIBI)V")
	private void method620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (this.aByte49 != 1) {
				this.anInt981 = -380;
			}
			if (arg1 >= 1 && arg3 >= 1 && arg1 <= 102 && arg3 <= 102) {
				if (aBoolean223 && arg4 != this.anInt942) {
					return;
				}
				@Pc(27) int local27 = 0;
				if (arg6 == 0) {
					local27 = this.aClass23_1.method216(arg4, arg1, arg3);
				}
				if (arg6 == 1) {
					local27 = this.aClass23_1.method217(arg1, arg4, arg3);
				}
				if (arg6 == 2) {
					local27 = this.aClass23_1.method218(arg4, arg1, arg3);
				}
				if (arg6 == 3) {
					local27 = this.aClass23_1.method219(arg4, arg1, arg3);
				}
				@Pc(83) int local83;
				if (local27 != 0) {
					local83 = this.aClass23_1.method220(arg4, arg1, arg3, local27);
					@Pc(89) int local89 = local27 >> 14 & 0x7FFF;
					@Pc(93) int local93 = local83 & 0x1F;
					@Pc(97) int local97 = local83 >> 6;
					@Pc(109) Class48 local109;
					if (arg6 == 0) {
						this.aClass23_1.method207(arg3, arg4, arg1);
						local109 = Class48.method523(local89);
						if (local109.aBoolean192) {
							this.aClass47Array1[arg4].method485(local97, arg1, arg3, local93, local109.aBoolean191);
						}
					}
					if (arg6 == 1) {
						this.aClass23_1.method208(arg1, arg3, arg4);
					}
					if (arg6 == 2) {
						this.aClass23_1.method209(arg3, arg4, arg1);
						local109 = Class48.method523(local89);
						if (arg1 + local109.anInt707 > 103 || arg3 + local109.anInt707 > 103 || arg1 + local109.anInt697 > 103 || arg3 + local109.anInt697 > 103) {
							return;
						}
						if (local109.aBoolean192) {
							this.aClass47Array1[arg4].method486(this.anInt927, arg3, arg1, local97, local109.anInt697, local109.aBoolean191, local109.anInt707);
						}
					}
					if (arg6 == 3) {
						this.aClass23_1.method210(arg1, arg3, arg4);
						local109 = Class48.method523(local89);
						if (local109.aBoolean192 && local109.aBoolean180) {
							this.aClass47Array1[arg4].method488(arg1, arg3);
						}
					}
				}
				if (arg2 >= 0) {
					local83 = arg4;
					if (arg4 < 3 && (this.aByteArrayArrayArray8[1][arg1][arg3] & 0x2) == 2) {
						local83 = arg4 + 1;
					}
					Class8.method13(arg2, local83, arg5, arg3, this.aClass47Array1[arg4], arg0, arg1, arg4, this.aClass23_1, this.anIntArrayArrayArray8);
					return;
				}
			}
		} catch (@Pc(257) RuntimeException local257) {
			signlink.reporterror("37722, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 1 + ", " + arg6 + ", " + local257.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IBLclient!MFMVIYHT;)V")
	private void method621(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub1_Sub3 arg1) {
		try {
			arg1.method321((byte) 6);
			@Pc(9) int local9 = arg1.method322(8);
			if (this.aByte52 != -58) {
				this.anInt1029 = -460;
			}
			@Pc(22) int local22;
			if (local9 < this.anInt960) {
				for (local22 = local9; local22 < this.anInt960; local22++) {
					this.anIntArray269[this.anInt1034++] = this.anIntArray256[local22];
				}
			}
			if (local9 > this.anInt960) {
				signlink.reporterror(this.aString27 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt960 = 0;
			for (local22 = 0; local22 < local9; local22++) {
				@Pc(74) int local74 = this.anIntArray256[local22];
				@Pc(79) Class10_Sub1_Sub2_Sub3_Sub1 local79 = this.aClass10_Sub1_Sub2_Sub3_Sub1Array1[local74];
				@Pc(84) int local84 = arg1.method322(1);
				if (local84 == 0) {
					this.anIntArray256[this.anInt960++] = local74;
					local79.anInt718 = anInt1050;
				} else {
					@Pc(107) int local107 = arg1.method322(2);
					if (local107 == 0) {
						this.anIntArray256[this.anInt960++] = local74;
						local79.anInt718 = anInt1050;
						this.anIntArray230[this.anInt885++] = local74;
					} else {
						@Pc(158) int local158;
						@Pc(168) int local168;
						if (local107 == 1) {
							this.anIntArray256[this.anInt960++] = local74;
							local79.anInt718 = anInt1050;
							local158 = arg1.method322(3);
							local79.method540(false, local158);
							local168 = arg1.method322(1);
							if (local168 == 1) {
								this.anIntArray230[this.anInt885++] = local74;
							}
						} else if (local107 == 2) {
							this.anIntArray256[this.anInt960++] = local74;
							local79.anInt718 = anInt1050;
							local158 = arg1.method322(3);
							local79.method540(true, local158);
							local168 = arg1.method322(3);
							local79.method540(true, local168);
							@Pc(226) int local226 = arg1.method322(1);
							if (local226 == 1) {
								this.anIntArray230[this.anInt885++] = local74;
							}
						} else if (local107 == 3) {
							this.anIntArray269[this.anInt1034++] = local74;
						}
					}
				}
			}
		} catch (@Pc(263) RuntimeException local263) {
			signlink.reporterror("6889, " + arg0 + ", " + -58 + ", " + arg1 + ", " + local263.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)V")
	private void method622(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0 && this.anInt985 != -1) {
				this.aString26 = arg1;
				super.anInt821 = 0;
			}
			if (this.anInt888 == -1) {
				this.aBoolean255 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray270[local20] = this.anIntArray270[local20 - 1];
				this.aStringArray13[local20] = this.aStringArray13[local20 - 1];
				this.aStringArray14[local20] = this.aStringArray14[local20 - 1];
			}
			if (this.aByte46 != -123) {
				this.anInt964 = this.aClass25_2.method245();
			}
			this.anIntArray270[0] = arg2;
			this.aStringArray13[0] = arg0;
			this.aStringArray14[0] = arg1;
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("61756, " + arg0 + ", " + -123 + ", " + arg1 + ", " + arg2 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!MFMVIYHT;ZI)V")
	private void method623(@OriginalArg(0) Class10_Sub1_Sub3 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		try {
			this.aBoolean244 &= arg1;
			this.anInt1034 = 0;
			this.anInt885 = 0;
			this.method621(arg2, arg0);
			this.method707(arg0, arg2);
			this.method637(arg0, arg2, 838);
			@Pc(37) int local37;
			for (@Pc(30) int local30 = 0; local30 < this.anInt1034; local30++) {
				local37 = this.anIntArray269[local30];
				if (this.aClass10_Sub1_Sub2_Sub3_Sub1Array1[local37].anInt718 != anInt1050) {
					this.aClass10_Sub1_Sub2_Sub3_Sub1Array1[local37].aClass38_1 = null;
					this.aClass10_Sub1_Sub2_Sub3_Sub1Array1[local37] = null;
				}
			}
			if (arg0.anInt428 != arg2) {
				signlink.reporterror(this.aString27 + " size mismatch in getnpcpos - pos:" + arg0.anInt428 + " psize:" + arg2);
				throw new RuntimeException("eek");
			}
			for (local37 = 0; local37 < this.anInt960; local37++) {
				if (this.aClass10_Sub1_Sub2_Sub3_Sub1Array1[this.anIntArray256[local37]] == null) {
					signlink.reporterror(this.aString27 + " null entry in npc list - pos:" + local37 + " size:" + this.anInt960);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("5522, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method624() {
		try {
			Class48.aClass34_8.method389();
			Class48.aClass34_7.method389();
			Class38.aClass34_6.method389();
			Class17.aClass34_3.method389();
			Class17.aClass34_4.method389();
			Class10_Sub1_Sub2_Sub3_Sub2.aClass34_9.method389();
			Class28.aClass34_5.method389();
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("20385, " + 383 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method625() {
		try {
			signlink.aBoolean268 = false;
			signlink.anInt1064 = 0;
			signlink.midi = "stop";
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("83736, " + false + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method626() {
		try {
			for (@Pc(6) Class10_Sub1_Sub2_Sub2 local6 = (Class10_Sub1_Sub2_Sub2) this.aClass6_12.method6(); local6 != null; local6 = (Class10_Sub1_Sub2_Sub2) this.aClass6_12.method8()) {
				if (local6.anInt264 != this.anInt942 || anInt1050 > local6.anInt271) {
					local6.method534();
				} else if (anInt1050 >= local6.anInt270) {
					if (local6.anInt267 > 0) {
						@Pc(41) Class10_Sub1_Sub2_Sub3_Sub1 local41 = this.aClass10_Sub1_Sub2_Sub3_Sub1Array1[local6.anInt267 - 1];
						if (local41 != null && local41.anInt739 >= 0 && local41.anInt739 < 13312 && local41.anInt740 >= 0 && local41.anInt740 < 13312) {
							local6.method187(local41.anInt739, local41.anInt740, this.method685(local41.anInt740, local41.anInt739, local6.anInt264) - local6.anInt277, anInt1050);
						}
					}
					if (local6.anInt267 < 0) {
						@Pc(86) int local86 = -local6.anInt267 - 1;
						@Pc(92) Class10_Sub1_Sub2_Sub3_Sub2 local92;
						if (local86 == this.anInt881) {
							local92 = aClass10_Sub1_Sub2_Sub3_Sub2_1;
						} else {
							local92 = this.aClass10_Sub1_Sub2_Sub3_Sub2Array1[local86];
						}
						if (local92 != null && local92.anInt739 >= 0 && local92.anInt739 < 13312 && local92.anInt740 >= 0 && local92.anInt740 < 13312) {
							local6.method187(local92.anInt739, local92.anInt740, this.method685(local92.anInt740, local92.anInt739, local6.anInt264) - local6.anInt277, anInt1050);
						}
					}
					local6.method188(this.anInt878);
					this.aClass23_1.method201(-1, local6, (int) local6.aDouble1, (int) local6.aDouble3, false, this.anInt942, 60, (int) local6.aDouble2, local6.anInt268);
				}
			}
			anInt975++;
			if (anInt975 > 51) {
				anInt975 = 0;
				this.aClass10_Sub1_Sub3_7.method300(248);
			}
		} catch (@Pc(186) RuntimeException local186) {
			signlink.reporterror("89047, " + false + ", " + local186.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method627() {
		try {
			this.aClass10_Sub1_Sub1_Sub3_19 = new Class10_Sub1_Sub1_Sub3(this.aClass2_2, "titlebox", 0);
			this.aClass10_Sub1_Sub1_Sub3_20 = new Class10_Sub1_Sub1_Sub3(this.aClass2_2, "titlebutton", 0);
			this.aClass10_Sub1_Sub1_Sub3Array3 = new Class10_Sub1_Sub1_Sub3[12];
			for (@Pc(29) int local29 = 0; local29 < 12; local29++) {
				this.aClass10_Sub1_Sub1_Sub3Array3[local29] = new Class10_Sub1_Sub1_Sub3(this.aClass2_2, "runes", local29);
			}
			this.aClass10_Sub1_Sub1_Sub1_3 = new Class10_Sub1_Sub1_Sub1(128, 265);
			this.aClass10_Sub1_Sub1_Sub1_4 = new Class10_Sub1_Sub1_Sub1(128, 265);
			for (@Pc(62) int local62 = 0; local62 < 33920; local62++) {
				this.aClass10_Sub1_Sub1_Sub1_3.anIntArray37[local62] = this.aClass19_22.anIntArray56[local62];
			}
			for (@Pc(80) int local80 = 0; local80 < 33920; local80++) {
				this.aClass10_Sub1_Sub1_Sub1_4.anIntArray37[local80] = this.aClass19_23.anIntArray56[local80];
			}
			this.anIntArray272 = new int[256];
			for (@Pc(102) int local102 = 0; local102 < 64; local102++) {
				this.anIntArray272[local102] = local102 * 262144;
			}
			for (@Pc(117) int local117 = 0; local117 < 64; local117++) {
				this.anIntArray272[local117 + 64] = local117 * 1024 + 16711680;
			}
			for (@Pc(136) int local136 = 0; local136 < 64; local136++) {
				this.anIntArray272[local136 + 128] = local136 * 4 + 16776960;
			}
			for (@Pc(155) int local155 = 0; local155 < 64; local155++) {
				this.anIntArray272[local155 + 192] = 16777215;
			}
			this.anIntArray273 = new int[256];
			for (@Pc(174) int local174 = 0; local174 < 64; local174++) {
				this.anIntArray273[local174] = local174 * 1024;
			}
			for (@Pc(189) int local189 = 0; local189 < 64; local189++) {
				this.anIntArray273[local189 + 64] = local189 * 4 + 65280;
			}
			for (@Pc(208) int local208 = 0; local208 < 64; local208++) {
				this.anIntArray273[local208 + 128] = local208 * 262144 + 65535;
			}
			for (@Pc(227) int local227 = 0; local227 < 64; local227++) {
				this.anIntArray273[local227 + 192] = 16777215;
			}
			this.anIntArray274 = new int[256];
			for (@Pc(246) int local246 = 0; local246 < 64; local246++) {
				this.anIntArray274[local246] = local246 * 4;
			}
			for (@Pc(261) int local261 = 0; local261 < 64; local261++) {
				this.anIntArray274[local261 + 64] = local261 * 262144 + 255;
			}
			for (@Pc(280) int local280 = 0; local280 < 64; local280++) {
				this.anIntArray274[local280 + 128] = local280 * 1024 + 16711935;
			}
			for (@Pc(299) int local299 = 0; local299 < 64; local299++) {
				this.anIntArray274[local299 + 192] = 16777215;
			}
			this.anIntArray271 = new int[256];
			this.anIntArray259 = new int[32768];
			this.anIntArray260 = new int[32768];
			this.method658(null);
			this.anIntArray249 = new int[32768];
			this.anIntArray250 = new int[32768];
			this.method588(10, "Connecting to fileserver");
			if (!this.aBoolean257) {
				this.aBoolean266 = true;
				this.aBoolean257 = true;
				this.method587(this, 2);
			}
		} catch (@Pc(356) RuntimeException local356) {
			signlink.reporterror("73326, " + false + ", " + local356.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method628(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt838; local8++) {
					if (this.aLongArray4[local8] == arg0) {
						this.anInt838--;
						this.aBoolean248 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt838; local28++) {
							this.aStringArray8[local28] = this.aStringArray8[local28 + 1];
							this.anIntArray265[local28] = this.anIntArray265[local28 + 1];
							this.aLongArray4[local28] = this.aLongArray4[local28 + 1];
						}
						this.aClass10_Sub1_Sub3_7.method300(141);
						this.aClass10_Sub1_Sub3_7.method307(arg0);
						break;
					}
				}
				this.anInt843 += 0;
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("38799, " + arg0 + ", " + 0 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method629() {
		try {
			if (this.anInt950 == 0) {
				@Pc(6) int local6 = super.anInt821;
				if (this.anInt978 == 1 && super.anInt822 >= 516 && super.anInt823 >= 160 && super.anInt822 <= 765 && super.anInt823 <= 205) {
					local6 = 0;
				}
				@Pc(44) int local44;
				@Pc(47) int local47;
				@Pc(123) int local123;
				if (this.aBoolean237) {
					if (local6 != 1) {
						local44 = super.anInt816;
						local47 = super.anInt817;
						if (this.anInt1039 == 0) {
							local44 -= 4;
							local47 -= 4;
						}
						if (this.anInt1039 == 1) {
							local44 -= 553;
							local47 -= 205;
						}
						if (this.anInt1039 == 2) {
							local44 -= 17;
							local47 -= 357;
						}
						if (local44 < this.anInt1040 - 10 || local44 > this.anInt1040 + this.anInt1042 + 10 || local47 < this.anInt1041 - 10 || local47 > this.anInt1041 + this.anInt1043 + 10) {
							this.aBoolean237 = false;
							if (this.anInt1039 == 1) {
								this.aBoolean248 = true;
							}
							if (this.anInt1039 == 2) {
								this.aBoolean255 = true;
							}
						}
					}
					if (local6 == 1) {
						local44 = this.anInt1040;
						local47 = this.anInt1041;
						local123 = this.anInt1042;
						@Pc(126) int local126 = super.anInt822;
						@Pc(129) int local129 = super.anInt823;
						if (this.anInt1039 == 0) {
							local126 -= 4;
							local129 -= 4;
						}
						if (this.anInt1039 == 1) {
							local126 -= 553;
							local129 -= 205;
						}
						if (this.anInt1039 == 2) {
							local126 -= 17;
							local129 -= 357;
						}
						@Pc(148) int local148 = -1;
						for (@Pc(150) int local150 = 0; local150 < this.anInt984; local150++) {
							@Pc(165) int local165 = local47 + (this.anInt984 - 1 - local150) * 15 + 31;
							if (local126 > local44 && local126 < local44 + local123 && local129 > local165 - 13 && local129 < local165 + 3) {
								local148 = local150;
							}
						}
						if (local148 != -1) {
							this.method695(local148);
						}
						this.aBoolean237 = false;
						if (this.anInt1039 == 1) {
							this.aBoolean248 = true;
						}
						if (this.anInt1039 == 2) {
							this.aBoolean255 = true;
							return;
						}
					}
				} else {
					if (local6 == 1 && this.anInt984 > 0) {
						local44 = this.anIntArray233[this.anInt984 - 1];
						if (local44 == 9 || local44 == 225 || local44 == 444 || local44 == 564 || local44 == 894 || local44 == 961 || local44 == 399 || local44 == 324 || local44 == 227 || local44 == 891 || local44 == 52 || local44 == 1094) {
							local47 = this.anIntArray231[this.anInt984 - 1];
							local123 = this.anIntArray232[this.anInt984 - 1];
							@Pc(284) Class14 local284 = Class14.method87(local123);
							if (local284.aBoolean41 || local284.aBoolean32) {
								this.aBoolean246 = false;
								this.anInt1022 = 0;
								this.anInt948 = local123;
								this.anInt949 = local47;
								this.anInt950 = 2;
								this.anInt951 = super.anInt822;
								this.anInt952 = super.anInt823;
								if (Class14.method87(local123).anInt128 == this.anInt976) {
									this.anInt950 = 1;
								}
								if (Class14.method87(local123).anInt128 == this.anInt888) {
									this.anInt950 = 3;
								}
								return;
							}
						}
					}
					if (local6 == 1 && (this.anInt1036 == 1 || this.method701(this.anInt984 - 1, this.aByte51)) && this.anInt984 > 2) {
						local6 = 2;
					}
					if (local6 == 1 && this.anInt984 > 0) {
						this.method695(this.anInt984 - 1);
					}
					if (local6 != 2 || this.anInt984 <= 0) {
						return;
					}
					this.method683();
				}
			}
		} catch (@Pc(378) RuntimeException local378) {
			signlink.reporterror("53733, " + 0 + ", " + local378.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!EPQDEJTO;II)V")
	private void method630(@OriginalArg(0) int arg0, @OriginalArg(1) Class10_Sub1_Sub1_Sub1 arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg2 * arg2 + arg0 * arg0;
			if (local7 > 4225 && local7 < 90000) {
				@Pc(28) int local28 = this.anInt1013 + this.anInt864 & 0x7FF;
				@Pc(32) int local32 = Class10_Sub1_Sub2_Sub4.anIntArray146[local28];
				@Pc(36) int local36 = Class10_Sub1_Sub2_Sub4.anIntArray147[local28];
				@Pc(45) int local45 = local32 * 256 / (this.anInt1003 + 256);
				@Pc(54) int local54 = local36 * 256 / (this.anInt1003 + 256);
				@Pc(64) int local64 = arg0 * local45 + arg2 * local54 >> 16;
				@Pc(74) int local74 = arg0 * local54 - arg2 * local45 >> 16;
				@Pc(80) double local80 = Math.atan2((double) local64, (double) local74);
				@Pc(86) int local86 = (int) (Math.sin(local80) * 63.0D);
				@Pc(92) int local92 = (int) (Math.cos(local80) * 57.0D);
				this.aClass10_Sub1_Sub1_Sub1_17.method83(local86 + 94 + 4 - 10, this.anInt954, local80, 83 - local92 - 20);
			} else {
				this.method705(arg0, arg1, arg2);
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("39548, " + arg0 + ", " + arg1 + ", " + -687 + ", " + arg2 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIIII)V")
	private void method631(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass10_Sub1_Sub1_Sub3_14.method440(arg4, arg1);
			this.aClass10_Sub1_Sub1_Sub3_15.method440(arg4 + arg2 - 16, arg1);
			Class10_Sub1_Sub1.method499(arg2 - 32, arg4 + 16, this.anInt871, 16, arg1);
			@Pc(35) int local35 = (arg2 - 32) * arg2 / arg3;
			if (local35 < 8) {
				local35 = 8;
			}
			@Pc(52) int local52 = (arg2 - local35 - 32) * arg0 / (arg3 - arg2);
			Class10_Sub1_Sub1.method499(local35, arg4 + local52 + 16, this.anInt937, 16, arg1);
			Class10_Sub1_Sub1.method504(arg1, this.anInt961, local35, arg4 + local52 + 16);
			Class10_Sub1_Sub1.method504(arg1 + 1, this.anInt961, local35, arg4 + local52 + 16);
			Class10_Sub1_Sub1.method502(arg1, this.anInt961, arg4 + local52 + 16, 16);
			Class10_Sub1_Sub1.method502(arg1, this.anInt961, arg4 + local52 + 17, 16);
			Class10_Sub1_Sub1.method504(arg1 + 15, this.anInt1032, local35, arg4 + local52 + 16);
			Class10_Sub1_Sub1.method504(arg1 + 14, this.anInt1032, local35 - 1, arg4 + 17 + local52);
			Class10_Sub1_Sub1.method502(arg1, this.anInt1032, arg4 + local52 + local35 + 15, 16);
			Class10_Sub1_Sub1.method502(arg1 + 1, this.anInt1032, arg4 + local52 + local35 + 14, 15);
		} catch (@Pc(173) RuntimeException local173) {
			signlink.reporterror("30245, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local173.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method632(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			@Pc(3) boolean local3 = false;
			for (@Pc(5) int local5 = 0; local5 < this.anInt960; local5++) {
				@Pc(15) Class10_Sub1_Sub2_Sub3_Sub1 local15 = this.aClass10_Sub1_Sub2_Sub3_Sub1Array1[this.anIntArray256[local5]];
				@Pc(24) int local24 = (this.anIntArray256[local5] << 14) + 536870912;
				if (local15 != null && local15.method539() && local15.aClass38_1.aBoolean143 == arg1 && local15.aClass38_1.method403()) {
					@Pc(45) int local45 = local15.anInt739 >> 7;
					@Pc(50) int local50 = local15.anInt740 >> 7;
					if (local45 >= 0 && local45 < 104 && local50 >= 0 && local50 < 104) {
						if (local15.anInt730 == 1 && (local15.anInt739 & 0x7F) == 64 && (local15.anInt740 & 0x7F) == 64) {
							if (this.anIntArrayArray23[local45][local50] == this.anInt962) {
								continue;
							}
							this.anIntArrayArray23[local45][local50] = this.anInt962;
						}
						if (!local15.aClass38_1.aBoolean141) {
							local24 += Integer.MIN_VALUE;
						}
						this.aClass23_1.method201(local24, local15, local15.anInt739, this.method685(local15.anInt740, local15.anInt739, this.anInt942), local15.aBoolean196, this.anInt942, (local15.anInt730 - 1) * 64 + 60, local15.anInt740, local15.anInt741);
					}
				}
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("76083, " + arg0 + ", " + arg1 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method633(@OriginalArg(1) int arg0) {
		try {
			signlink.anInt1066 = arg0;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("16107, " + 822 + ", " + arg0 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method634() {
		try {
			if (this.anInt847 > 0) {
				this.method699();
			} else {
				this.method700("Please wait - attempting to reestablish", "Connection lost");
				this.anInt923 = 0;
				this.anInt955 = 0;
				@Pc(29) Class18 local29 = this.aClass18_1;
				this.aBoolean244 = false;
				this.anInt833 = 0;
				this.method654(this.aString27, this.aString28, true);
				if (!this.aBoolean244) {
					this.method699();
				}
				try {
					local29.method116();
				} catch (@Pc(52) Exception local52) {
				}
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("3954, " + 1 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!EWIXBTLV;)Z")
	private boolean method635(@OriginalArg(1) Class14 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt124;
			if (this.anInt839 == 2) {
				if (local4 == 201) {
					this.aBoolean255 = true;
					this.anInt1010 = 0;
					this.aBoolean216 = true;
					this.aString24 = "";
					this.anInt995 = 1;
					this.aString19 = "Enter name of friend to add to list";
				}
				if (local4 == 202) {
					this.aBoolean255 = true;
					this.anInt1010 = 0;
					this.aBoolean216 = true;
					this.aString24 = "";
					this.anInt995 = 2;
					this.aString19 = "Enter name of friend to delete from list";
				}
			}
			if (local4 == 205) {
				this.anInt847 = 250;
				return true;
			}
			if (local4 == 501) {
				this.aBoolean255 = true;
				this.anInt1010 = 0;
				this.aBoolean216 = true;
				this.aString24 = "";
				this.anInt995 = 4;
				this.aString19 = "Enter name of player to add to list";
			}
			if (local4 == 502) {
				this.aBoolean255 = true;
				this.anInt1010 = 0;
				this.aBoolean216 = true;
				this.aString24 = "";
				this.anInt995 = 5;
				this.aString19 = "Enter name of player to delete from list";
			}
			@Pc(117) int local117;
			@Pc(121) int local121;
			@Pc(126) int local126;
			if (local4 >= 300 && local4 <= 313) {
				local117 = (local4 - 300) / 2;
				local121 = local4 & 0x1;
				local126 = this.anIntArray276[local117];
				if (local126 != -1) {
					while (true) {
						if (local121 == 0) {
							local126--;
							if (local126 < 0) {
								local126 = Class49.anInt781 - 1;
							}
						}
						if (local121 == 1) {
							local126++;
							if (local126 >= Class49.anInt781) {
								local126 = 0;
							}
						}
						if (!Class49.aClass49Array1[local126].aBoolean202 && Class49.aClass49Array1[local126].anInt782 == local117 + (this.aBoolean245 ? 0 : 7)) {
							this.anIntArray276[local117] = local126;
							this.aBoolean263 = true;
							break;
						}
					}
				}
			}
			if (local4 >= 314 && local4 <= 323) {
				local117 = (local4 - 314) / 2;
				local121 = local4 & 0x1;
				local126 = this.anIntArray252[local117];
				if (local121 == 0) {
					local126--;
					if (local126 < 0) {
						local126 = anIntArrayArray24[local117].length - 1;
					}
				}
				if (local121 == 1) {
					local126++;
					if (local126 >= anIntArrayArray24[local117].length) {
						local126 = 0;
					}
				}
				this.anIntArray252[local117] = local126;
				this.aBoolean263 = true;
			}
			if (local4 == 324 && !this.aBoolean245) {
				this.aBoolean245 = true;
				this.method600(this.anInt905);
			}
			if (local4 == 325 && this.aBoolean245) {
				this.aBoolean245 = false;
				this.method600(this.anInt905);
			}
			if (local4 == 326) {
				this.aClass10_Sub1_Sub3_7.method300(163);
				this.aClass10_Sub1_Sub3_7.method301(this.aBoolean245 ? 0 : 1);
				for (local117 = 0; local117 < 7; local117++) {
					this.aClass10_Sub1_Sub3_7.method301(this.anIntArray276[local117]);
				}
				for (local121 = 0; local121 < 5; local121++) {
					this.aClass10_Sub1_Sub3_7.method301(this.anIntArray252[local121]);
				}
				return true;
			}
			if (local4 == 620) {
				this.aBoolean241 = !this.aBoolean241;
			}
			if (local4 >= 601 && local4 <= 613) {
				this.method590();
				if (this.aString17.length() > 0) {
					this.aClass10_Sub1_Sub3_7.method300(184);
					this.aClass10_Sub1_Sub3_7.method307(Class26.method248(this.aString17));
					this.aClass10_Sub1_Sub3_7.method301(local4 - 601);
					this.aClass10_Sub1_Sub3_7.method301(this.aBoolean241 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(356) RuntimeException local356) {
			signlink.reporterror("37535, " + 631 + ", " + arg0 + ", " + local356.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/lang/String;IILjava/lang/String;)Lclient!ATJMVOZR;")
	private Class2 method636(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			@Pc(3) byte[] local3 = null;
			@Pc(5) int local5 = 5;
			try {
				if (this.aClass24Array1[0] != null) {
					local3 = this.aClass24Array1[0].method241(this.aByte45, arg3);
				}
			} catch (@Pc(21) Exception local21) {
			}
			@Pc(35) int local35;
			if (local3 != null) {
				this.aCRC32_2.reset();
				this.aCRC32_2.update(local3);
				local35 = (int) this.aCRC32_2.getValue();
				if (local35 != arg0) {
					local3 = null;
				}
			}
			if (local3 != null) {
				return new Class2(local3, 3);
			}
			local35 = 0;
			while (local3 == null) {
				@Pc(62) String local62 = "Unknown error";
				this.method588(arg2, "Requesting " + arg4);
				@Pc(77) int local77;
				try {
					local77 = 0;
					@Pc(88) DataInputStream local88 = this.method606(arg1 + arg0);
					@Pc(91) byte[] local91 = new byte[6];
					local88.readFully(local91, 0, 6);
					@Pc(102) Class10_Sub1_Sub3 local102 = new Class10_Sub1_Sub3(true, local91);
					local102.anInt428 = 3;
					@Pc(110) int local110 = local102.method315() + 6;
					@Pc(112) int local112 = 6;
					local3 = new byte[local110];
					for (@Pc(117) int local117 = 0; local117 < 6; local117++) {
						local3[local117] = local91[local117];
					}
					@Pc(135) int local135;
					while (local112 < local110) {
						local135 = local110 - local112;
						if (local135 > 1000) {
							local135 = 1000;
						}
						@Pc(146) int local146 = local88.read(local3, local112, local135);
						if (local146 < 0) {
							(new StringBuffer("Length error: ")).append(local112).append("/").append(local110).toString();
							throw new IOException("EOF");
						}
						local112 += local146;
						@Pc(175) int local175 = local112 * 100 / local110;
						if (local175 != local77) {
							this.method588(arg2, "Loading " + arg4 + " - " + local175 + "%");
						}
						local77 = local175;
					}
					local88.close();
					try {
						if (this.aClass24Array1[0] != null) {
							this.aClass24Array1[0].method242(local3.length, local3, arg3);
						}
					} catch (@Pc(220) Exception local220) {
						this.aClass24Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local3);
						local135 = (int) this.aCRC32_2.getValue();
						if (local135 != arg0) {
							local3 = null;
							local35++;
							local62 = "Checksum error: " + local135;
						}
					}
				} catch (@Pc(255) IOException local255) {
					if (local62.equals("Unknown error")) {
						local62 = "Connection error";
					}
					local3 = null;
				} catch (@Pc(265) NullPointerException local265) {
					local62 = "Null error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(274) ArrayIndexOutOfBoundsException local274) {
					local62 = "Bounds error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(283) Exception local283) {
					local62 = "Unexpected error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local3 == null) {
					for (local77 = local5; local77 > 0; local77--) {
						if (local35 >= 3) {
							this.method588(arg2, "Game updated - please reload page");
							local77 = 10;
						} else {
							this.method588(arg2, local62 + " - Retrying in " + local77);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(327) Exception local327) {
						}
					}
					local5 *= 2;
					if (local5 > 60) {
						local5 = 60;
					}
					this.aBoolean219 = !this.aBoolean219;
				}
			}
			return new Class2(local3, 3);
		} catch (@Pc(359) RuntimeException local359) {
			signlink.reporterror("12591, " + 14076 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local359.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method585() {
		try {
			this.aBoolean236 = true;
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("40389, " + -99 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!MFMVIYHT;II)V")
	private void method637(@OriginalArg(0) Class10_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(5) boolean local5 = false;
			for (@Pc(7) int local7 = 0; local7 < this.anInt885; local7++) {
				@Pc(14) int local14 = this.anIntArray230[local7];
				@Pc(19) Class10_Sub1_Sub2_Sub3_Sub1 local19 = this.aClass10_Sub1_Sub2_Sub3_Sub1Array1[local14];
				@Pc(22) int local22 = arg0.method311();
				if ((local22 & 0x1) != 0) {
					local19.aClass38_1 = Class38.method407(arg0.method340());
					local19.anInt730 = local19.aClass38_1.aByte31;
					local19.anInt729 = local19.aClass38_1.anInt579;
					local19.anInt748 = local19.aClass38_1.anInt576;
					local19.anInt749 = local19.aClass38_1.anInt575;
					local19.anInt750 = local19.aClass38_1.anInt574;
					local19.anInt751 = local19.aClass38_1.anInt569;
					local19.anInt760 = local19.aClass38_1.anInt564;
				}
				if ((local22 & 0x40) != 0) {
					local19.anInt738 = arg0.method339();
					if (local19.anInt738 == 65535) {
						local19.anInt738 = -1;
					}
				}
				@Pc(91) int local91;
				@Pc(95) int local95;
				if ((local22 & 0x80) != 0) {
					local91 = arg0.method330();
					local95 = arg0.method330();
					local19.method541(anInt1050, local91, local95);
					local19.anInt724 = anInt1050 + 300;
					local19.anInt725 = arg0.method311();
					local19.anInt726 = arg0.method332(this.anInt1006);
				}
				if ((local22 & 0x4) != 0) {
					local19.anInt743 = arg0.method313();
					local91 = arg0.method346();
					local19.anInt747 = local91 >> 16;
					local19.anInt746 = anInt1050 + (local91 & 0xFFFF);
					local19.anInt744 = 0;
					local19.anInt745 = 0;
					if (local19.anInt746 > anInt1050) {
						local19.anInt744 = -1;
					}
					if (local19.anInt743 == 65535) {
						local19.anInt743 = -1;
					}
				}
				if ((local22 & 0x20) != 0) {
					local19.aString13 = arg0.method318();
					local19.anInt715 = 100;
				}
				if ((local22 & 0x8) != 0) {
					local19.anInt727 = arg0.method341();
					local19.anInt728 = arg0.method339();
				}
				if ((local22 & 0x2) != 0) {
					local91 = arg0.method313();
					if (local91 == 65535) {
						local91 = -1;
					}
					local95 = arg0.method332(this.anInt1006);
					if (local91 == local19.anInt753 && local91 != -1) {
						@Pc(214) int local214 = Class15.aClass15Array1[local91].anInt160;
						if (local214 == 1) {
							local19.anInt754 = 0;
							local19.anInt755 = 0;
							local19.anInt756 = local95;
							local19.anInt757 = 0;
						}
						if (local214 == 2) {
							local19.anInt757 = 0;
						}
					} else if (local91 == -1 || local19.anInt753 == -1 || Class15.aClass15Array1[local91].anInt154 >= Class15.aClass15Array1[local19.anInt753].anInt154) {
						local19.anInt753 = local91;
						local19.anInt754 = 0;
						local19.anInt755 = 0;
						local19.anInt756 = local95;
						local19.anInt757 = 0;
						local19.anInt742 = local19.anInt759;
					}
				}
				if ((local22 & 0x10) != 0) {
					local91 = arg0.method332(this.anInt1006);
					local95 = arg0.method332(this.anInt1006);
					local19.method541(anInt1050, local91, local95);
					local19.anInt724 = anInt1050 + 300;
					local19.anInt725 = arg0.method311();
					local19.anInt726 = arg0.method331();
				}
			}
		} catch (@Pc(314) RuntimeException local314) {
			signlink.reporterror("29349, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local314.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!ZGNGQRPJ;ILclient!MFMVIYHT;)V")
	private void method638(@OriginalArg(1) int arg0, @OriginalArg(2) Class10_Sub1_Sub2_Sub3_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class10_Sub1_Sub3 arg3) {
		try {
			@Pc(18) int local18;
			@Pc(28) int local28;
			@Pc(40) int local40;
			if ((arg2 & 0x8) != 0) {
				local18 = arg3.method313();
				if (local18 == 65535) {
					local18 = -1;
				}
				local28 = arg3.method332(this.anInt1006);
				if (local18 == arg1.anInt753 && local18 != -1) {
					local40 = Class15.aClass15Array1[local18].anInt160;
					if (local40 == 1) {
						arg1.anInt754 = 0;
						arg1.anInt755 = 0;
						arg1.anInt756 = local28;
						arg1.anInt757 = 0;
					}
					if (local40 == 2) {
						arg1.anInt757 = 0;
					}
				} else if (local18 == -1 || arg1.anInt753 == -1 || Class15.aClass15Array1[local18].anInt154 >= Class15.aClass15Array1[arg1.anInt753].anInt154) {
					arg1.anInt753 = local18;
					arg1.anInt754 = 0;
					arg1.anInt755 = 0;
					arg1.anInt756 = local28;
					arg1.anInt757 = 0;
					arg1.anInt742 = arg1.anInt759;
				}
			}
			if ((arg2 & 0x10) != 0) {
				arg1.aString13 = arg3.method318();
				if (arg1.aString13.charAt(0) == '~') {
					arg1.aString13 = arg1.aString13.substring(1);
					this.method622(arg1.aString14, arg1.aString13, 2);
				} else if (arg1 == aClass10_Sub1_Sub2_Sub3_Sub2_1) {
					this.method622(arg1.aString14, arg1.aString13, 2);
				}
				arg1.anInt716 = 0;
				arg1.anInt722 = 0;
				arg1.anInt715 = 150;
			}
			if ((arg2 & 0x100) != 0) {
				arg1.anInt731 = arg3.method330();
				arg1.anInt733 = arg3.method331();
				arg1.anInt732 = arg3.method332(this.anInt1006);
				arg1.anInt734 = arg3.method311();
				arg1.anInt735 = arg3.method313() + anInt1050;
				arg1.anInt736 = arg3.method340() + anInt1050;
				arg1.anInt737 = arg3.method311();
				arg1.method538();
			}
			if ((arg2 & 0x1) != 0) {
				arg1.anInt738 = arg3.method340();
				if (arg1.anInt738 == 65535) {
					arg1.anInt738 = -1;
				}
			}
			if ((arg2 & 0x2) != 0) {
				arg1.anInt727 = arg3.method313();
				arg1.anInt728 = arg3.method313();
			}
			if ((arg2 & 0x200) != 0) {
				arg1.anInt743 = arg3.method340();
				local18 = arg3.method346();
				arg1.anInt747 = local18 >> 16;
				arg1.anInt746 = anInt1050 + (local18 & 0xFFFF);
				arg1.anInt744 = 0;
				arg1.anInt745 = 0;
				if (arg1.anInt746 > anInt1050) {
					arg1.anInt744 = -1;
				}
				if (arg1.anInt743 == 65535) {
					arg1.anInt743 = -1;
				}
			}
			if ((arg2 & 0x4) != 0) {
				local18 = arg3.method311();
				@Pc(276) byte[] local276 = new byte[local18];
				@Pc(282) Class10_Sub1_Sub3 local282 = new Class10_Sub1_Sub3(true, local276);
				arg3.method348(local276, local18);
				this.aClass10_Sub1_Sub3Array1[arg0] = local282;
				arg1.method545(local282);
			}
			if ((arg2 & 0x400) != 0) {
				local18 = arg3.method330();
				local28 = arg3.method332(this.anInt1006);
				arg1.method541(anInt1050, local18, local28);
				arg1.anInt724 = anInt1050 + 300;
				arg1.anInt725 = arg3.method331();
				arg1.anInt726 = arg3.method311();
			}
			if ((arg2 & 0x40) != 0) {
				local18 = arg3.method313();
				local28 = arg3.method331();
				local40 = arg3.method330();
				@Pc(348) int local348 = arg3.anInt428;
				if (arg1.aString14 != null && arg1.aBoolean198) {
					@Pc(358) long local358 = Class26.method248(arg1.aString14);
					@Pc(360) boolean local360 = false;
					if (local28 <= 1) {
						for (@Pc(365) int local365 = 0; local365 < this.anInt837; local365++) {
							if (this.aLongArray3[local365] == local358) {
								local360 = true;
								break;
							}
						}
					}
					if (!local360 && this.anInt1011 == 0) {
						try {
							this.aClass10_Sub1_Sub3_8.anInt428 = 0;
							arg3.method349(this.aClass10_Sub1_Sub3_8.aByteArray12, local40);
							this.aClass10_Sub1_Sub3_8.anInt428 = 0;
							@Pc(410) String local410 = Class32.method371(this.aClass10_Sub1_Sub3_8, local40);
							@Pc(414) String local414 = Class46.method452(local410);
							arg1.aString13 = local414;
							arg1.anInt716 = local18 >> 8;
							arg1.anInt722 = local18 & 0xFF;
							arg1.anInt715 = 150;
							if (local28 == 2 || local28 == 3) {
								this.method622("@cr2@" + arg1.aString14, local414, 1);
							} else if (local28 == 1) {
								this.method622("@cr1@" + arg1.aString14, local414, 1);
							} else {
								this.method622(arg1.aString14, local414, 2);
							}
						} catch (@Pc(478) Exception local478) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg3.anInt428 = local348 + local40;
			}
			if ((arg2 & 0x80) != 0) {
				local18 = arg3.method332(this.anInt1006);
				local28 = arg3.method331();
				arg1.method541(anInt1050, local18, local28);
				arg1.anInt724 = anInt1050 + 300;
				arg1.anInt725 = arg3.method332(this.anInt1006);
				arg1.anInt726 = arg3.method311();
			}
		} catch (@Pc(522) RuntimeException local522) {
			signlink.reporterror("61238, " + 2 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local522.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method639() {
		try {
			if (this.aClass19_19 == null) {
				super.aClass19_2 = null;
				this.aClass19_18 = null;
				this.aClass19_16 = null;
				this.aClass19_15 = null;
				this.aClass19_17 = null;
				this.aClass19_12 = null;
				this.aClass19_13 = null;
				this.aClass19_14 = null;
				this.aClass19_22 = new Class19(265, (byte) -12, this.method586(), 128);
				Class10_Sub1_Sub1.method497();
				this.aClass19_23 = new Class19(265, (byte) -12, this.method586(), 128);
				Class10_Sub1_Sub1.method497();
				this.aClass19_19 = new Class19(171, (byte) -12, this.method586(), 509);
				Class10_Sub1_Sub1.method497();
				this.aClass19_20 = new Class19(132, (byte) -12, this.method586(), 360);
				Class10_Sub1_Sub1.method497();
				this.aClass19_21 = new Class19(200, (byte) -12, this.method586(), 360);
				Class10_Sub1_Sub1.method497();
				this.aClass19_24 = new Class19(238, (byte) -12, this.method586(), 202);
				Class10_Sub1_Sub1.method497();
				this.aClass19_25 = new Class19(238, (byte) -12, this.method586(), 203);
				Class10_Sub1_Sub1.method497();
				this.aClass19_26 = new Class19(94, (byte) -12, this.method586(), 74);
				Class10_Sub1_Sub1.method497();
				this.aClass19_27 = new Class19(94, (byte) -12, this.method586(), 75);
				Class10_Sub1_Sub1.method497();
				if (this.aClass2_2 != null) {
					this.method714(aBoolean250);
					this.method627();
				}
				this.aBoolean236 = true;
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("21632, " + -188 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method581() {
		this.method588(20, "Starting up");
		if (signlink.sunjava) {
			super.anInt810 = 5;
		}
		if (aBoolean230) {
			this.aBoolean232 = true;
			return;
		}
		aBoolean230 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method612();
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
			this.aBoolean240 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(107) int local107 = 0; local107 < 5; local107++) {
				this.aClass24Array1[local107] = new Class24(local107 + 1, 600000, signlink.aRandomAccessFile3, signlink.aRandomAccessFileArray1[local107], 4);
			}
		}
		try {
			this.method661();
			this.aClass2_2 = this.method636(this.anIntArray212[1], "title", 25, 1, "title screen");
			this.aClass10_Sub1_Sub1_Sub2_2 = new Class10_Sub1_Sub1_Sub2(false, this.aClass2_2, -914, "p11_full");
			this.aClass10_Sub1_Sub1_Sub2_3 = new Class10_Sub1_Sub1_Sub2(false, this.aClass2_2, -914, "p12_full");
			this.aClass10_Sub1_Sub1_Sub2_4 = new Class10_Sub1_Sub1_Sub2(false, this.aClass2_2, -914, "b12_full");
			this.aClass10_Sub1_Sub1_Sub2_5 = new Class10_Sub1_Sub1_Sub2(true, this.aClass2_2, -914, "q8_full");
			this.method714(aBoolean250);
			this.method627();
			@Pc(203) Class2 local203 = this.method636(this.anIntArray212[2], "config", 30, 2, "config");
			@Pc(215) Class2 local215 = this.method636(this.anIntArray212[3], "interface", 35, 3, "interface");
			@Pc(227) Class2 local227 = this.method636(this.anIntArray212[4], "media", 40, 4, "2d graphics");
			@Pc(239) Class2 local239 = this.method636(this.anIntArray212[6], "textures", 45, 6, "textures");
			@Pc(251) Class2 local251 = this.method636(this.anIntArray212[7], "wordenc", 50, 7, "chat system");
			@Pc(263) Class2 local263 = this.method636(this.anIntArray212[8], "sounds", 55, 8, "sound effects");
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray8 = new int[4][105][105];
			this.aClass23_1 = new Class23(this.anIntArrayArrayArray8, 104, 4, 104, (byte) 5);
			for (@Pc(288) int local288 = 0; local288 < 4; local288++) {
				this.aClass47Array1[local288] = new Class47(104, 0, 104);
			}
			this.aClass10_Sub1_Sub1_Sub1_11 = new Class10_Sub1_Sub1_Sub1(512, 512);
			@Pc(323) Class2 local323 = this.method636(this.anIntArray212[5], "versionlist", 60, 5, "update list");
			this.method588(60, "Connecting to update server");
			this.aClass33_Sub1_1 = new Class33_Sub1();
			this.aClass33_Sub1_1.method564(local323, this);
			Class22.method165(this.aClass33_Sub1_1.method572(553));
			Class10_Sub1_Sub2_Sub4.method268(this.aClass33_Sub1_1.method569(0), this.aClass33_Sub1_1);
			if (!aBoolean223) {
				this.anInt1023 = 0;
				this.aBoolean260 = true;
				this.aClass33_Sub1_1.method558(2, this.anInt1023);
				while (this.aClass33_Sub1_1.method562() > 0) {
					this.method652();
					try {
						Thread.sleep(100L);
					} catch (@Pc(374) Exception local374) {
					}
					if (this.aClass33_Sub1_1.anInt797 > 3) {
						this.method594("ondemand");
						return;
					}
				}
			}
			this.method588(65, "Requesting animations");
			@Pc(398) int local398 = this.aClass33_Sub1_1.method569(1);
			for (@Pc(400) int local400 = 0; local400 < local398; local400++) {
				this.aClass33_Sub1_1.method558(1, local400);
			}
			@Pc(419) int local419;
			while (this.aClass33_Sub1_1.method562() > 0) {
				local419 = local398 - this.aClass33_Sub1_1.method562();
				if (local419 > 0) {
					this.method588(65, "Loading animations - " + local419 * 100 / local398 + "%");
				}
				this.method652();
				try {
					Thread.sleep(100L);
				} catch (@Pc(445) Exception local445) {
				}
				if (this.aClass33_Sub1_1.anInt797 > 3) {
					this.method594("ondemand");
					return;
				}
			}
			this.method588(70, "Requesting models");
			local398 = this.aClass33_Sub1_1.method569(0);
			@Pc(479) int local479;
			for (local419 = 0; local419 < local398; local419++) {
				local479 = this.aClass33_Sub1_1.method554(local419);
				if ((local479 & 0x1) != 0) {
					this.aClass33_Sub1_1.method558(0, local419);
				}
			}
			local398 = this.aClass33_Sub1_1.method562();
			while (this.aClass33_Sub1_1.method562() > 0) {
				local479 = local398 - this.aClass33_Sub1_1.method562();
				if (local479 > 0) {
					this.method588(70, "Loading models - " + local479 * 100 / local398 + "%");
				}
				this.method652();
				try {
					Thread.sleep(100L);
				} catch (@Pc(530) Exception local530) {
				}
			}
			if (this.aClass24Array1[0] != null) {
				this.method588(75, "Requesting maps");
				this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(47, 48, 0));
				this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(47, 48, 1));
				this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(48, 48, 0));
				this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(48, 48, 1));
				this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(49, 48, 0));
				this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(49, 48, 1));
				this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(47, 47, 0));
				this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(47, 47, 1));
				this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(48, 47, 0));
				this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(48, 47, 1));
				this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(48, 148, 0));
				this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(48, 148, 1));
				local398 = this.aClass33_Sub1_1.method562();
				while (this.aClass33_Sub1_1.method562() > 0) {
					local479 = local398 - this.aClass33_Sub1_1.method562();
					if (local479 > 0) {
						this.method588(75, "Loading maps - " + local479 * 100 / local398 + "%");
					}
					this.method652();
					try {
						Thread.sleep(100L);
					} catch (@Pc(715) Exception local715) {
					}
				}
			}
			local398 = this.aClass33_Sub1_1.method569(0);
			@Pc(736) int local736;
			for (local479 = 0; local479 < local398; local479++) {
				local736 = this.aClass33_Sub1_1.method554(local479);
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
					this.aClass33_Sub1_1.method556(0, local738, local479);
				}
			}
			this.aClass33_Sub1_1.method561(aBoolean222);
			if (!aBoolean223) {
				local398 = this.aClass33_Sub1_1.method569(2);
				for (local736 = 1; local736 < local398; local736++) {
					if (this.aClass33_Sub1_1.method557(local736, aBoolean229)) {
						this.aClass33_Sub1_1.method556(2, (byte) 1, local736);
					}
				}
			}
			local398 = this.aClass33_Sub1_1.method569(0);
			@Pc(861) int local861;
			for (local736 = 0; local736 < local398; local736++) {
				local861 = this.aClass33_Sub1_1.method554(local736);
				if (local861 == 0 && this.aClass33_Sub1_1.anInt789 < 200) {
					this.aClass33_Sub1_1.method556(0, (byte) 1, local736);
				}
			}
			this.method588(80, "Unpacking media");
			this.aClass10_Sub1_Sub1_Sub3_16 = new Class10_Sub1_Sub1_Sub3(local227, "invback", 0);
			this.aClass10_Sub1_Sub1_Sub3_18 = new Class10_Sub1_Sub1_Sub3(local227, "chatback", 0);
			this.aClass10_Sub1_Sub1_Sub3_17 = new Class10_Sub1_Sub1_Sub3(local227, "mapback", 0);
			this.aClass10_Sub1_Sub1_Sub3_6 = new Class10_Sub1_Sub1_Sub3(local227, "backbase1", 0);
			this.aClass10_Sub1_Sub1_Sub3_7 = new Class10_Sub1_Sub1_Sub3(local227, "backbase2", 0);
			this.aClass10_Sub1_Sub1_Sub3_8 = new Class10_Sub1_Sub1_Sub3(local227, "backhmid1", 0);
			for (local861 = 0; local861 < 13; local861++) {
				this.aClass10_Sub1_Sub1_Sub3Array2[local861] = new Class10_Sub1_Sub1_Sub3(local227, "sideicons", local861);
			}
			this.aClass10_Sub1_Sub1_Sub1_10 = new Class10_Sub1_Sub1_Sub1(local227, "compass", 0);
			this.aClass10_Sub1_Sub1_Sub1_17 = new Class10_Sub1_Sub1_Sub1(local227, "mapedge", 0);
			this.aClass10_Sub1_Sub1_Sub1_17.method75();
			for (@Pc(972) int local972 = 0; local972 < 72; local972++) {
				this.aClass10_Sub1_Sub1_Sub3Array5[local972] = new Class10_Sub1_Sub1_Sub3(local227, "mapscene", local972);
			}
			for (@Pc(990) int local990 = 0; local990 < 70; local990++) {
				this.aClass10_Sub1_Sub1_Sub1Array6[local990] = new Class10_Sub1_Sub1_Sub1(local227, "mapfunction", local990);
			}
			for (@Pc(1008) int local1008 = 0; local1008 < 5; local1008++) {
				this.aClass10_Sub1_Sub1_Sub1Array8[local1008] = new Class10_Sub1_Sub1_Sub1(local227, "hitmarks", local1008);
			}
			for (@Pc(1026) int local1026 = 0; local1026 < 6; local1026++) {
				this.aClass10_Sub1_Sub1_Sub1Array10[local1026] = new Class10_Sub1_Sub1_Sub1(local227, "headicons_pk", local1026);
			}
			for (@Pc(1044) int local1044 = 0; local1044 < 9; local1044++) {
				this.aClass10_Sub1_Sub1_Sub1Array7[local1044] = new Class10_Sub1_Sub1_Sub1(local227, "headicons_prayer", local1044);
			}
			for (@Pc(1062) int local1062 = 0; local1062 < 6; local1062++) {
				this.aClass10_Sub1_Sub1_Sub1Array5[local1062] = new Class10_Sub1_Sub1_Sub1(local227, "headicons_hint", local1062);
			}
			this.aClass10_Sub1_Sub1_Sub1_7 = new Class10_Sub1_Sub1_Sub1(local227, "overlay_multiway", 0);
			this.aClass10_Sub1_Sub1_Sub1_5 = new Class10_Sub1_Sub1_Sub1(local227, "mapmarker", 0);
			this.aClass10_Sub1_Sub1_Sub1_6 = new Class10_Sub1_Sub1_Sub1(local227, "mapmarker", 1);
			for (@Pc(1104) int local1104 = 0; local1104 < 8; local1104++) {
				this.aClass10_Sub1_Sub1_Sub1Array4[local1104] = new Class10_Sub1_Sub1_Sub1(local227, "cross", local1104);
			}
			this.aClass10_Sub1_Sub1_Sub1_12 = new Class10_Sub1_Sub1_Sub1(local227, "mapdots", 0);
			this.aClass10_Sub1_Sub1_Sub1_13 = new Class10_Sub1_Sub1_Sub1(local227, "mapdots", 1);
			this.aClass10_Sub1_Sub1_Sub1_14 = new Class10_Sub1_Sub1_Sub1(local227, "mapdots", 2);
			this.aClass10_Sub1_Sub1_Sub1_15 = new Class10_Sub1_Sub1_Sub1(local227, "mapdots", 3);
			this.aClass10_Sub1_Sub1_Sub1_16 = new Class10_Sub1_Sub1_Sub1(local227, "mapdots", 4);
			this.aClass10_Sub1_Sub1_Sub3_14 = new Class10_Sub1_Sub1_Sub3(local227, "scrollbar", 0);
			this.aClass10_Sub1_Sub1_Sub3_15 = new Class10_Sub1_Sub1_Sub3(local227, "scrollbar", 1);
			this.aClass10_Sub1_Sub1_Sub3_1 = new Class10_Sub1_Sub1_Sub3(local227, "redstone1", 0);
			this.aClass10_Sub1_Sub1_Sub3_2 = new Class10_Sub1_Sub1_Sub3(local227, "redstone2", 0);
			this.aClass10_Sub1_Sub1_Sub3_3 = new Class10_Sub1_Sub1_Sub3(local227, "redstone3", 0);
			this.aClass10_Sub1_Sub1_Sub3_4 = new Class10_Sub1_Sub1_Sub3(local227, "redstone1", 0);
			this.aClass10_Sub1_Sub1_Sub3_4.method437();
			this.aClass10_Sub1_Sub1_Sub3_5 = new Class10_Sub1_Sub1_Sub3(local227, "redstone2", 0);
			this.aClass10_Sub1_Sub1_Sub3_5.method437();
			this.aClass10_Sub1_Sub1_Sub3_9 = new Class10_Sub1_Sub1_Sub3(local227, "redstone1", 0);
			this.aClass10_Sub1_Sub1_Sub3_9.method438();
			this.aClass10_Sub1_Sub1_Sub3_10 = new Class10_Sub1_Sub1_Sub3(local227, "redstone2", 0);
			this.aClass10_Sub1_Sub1_Sub3_10.method438();
			this.aClass10_Sub1_Sub1_Sub3_11 = new Class10_Sub1_Sub1_Sub3(local227, "redstone3", 0);
			this.aClass10_Sub1_Sub1_Sub3_11.method438();
			this.aClass10_Sub1_Sub1_Sub3_12 = new Class10_Sub1_Sub1_Sub3(local227, "redstone1", 0);
			this.aClass10_Sub1_Sub1_Sub3_12.method437();
			this.aClass10_Sub1_Sub1_Sub3_12.method438();
			this.aClass10_Sub1_Sub1_Sub3_13 = new Class10_Sub1_Sub1_Sub3(local227, "redstone2", 0);
			this.aClass10_Sub1_Sub1_Sub3_13.method437();
			this.aClass10_Sub1_Sub1_Sub3_13.method438();
			for (@Pc(1294) int local1294 = 0; local1294 < 2; local1294++) {
				this.aClass10_Sub1_Sub1_Sub3Array4[local1294] = new Class10_Sub1_Sub1_Sub3(local227, "mod_icons", local1294);
			}
			@Pc(1317) Class10_Sub1_Sub1_Sub1 local1317 = new Class10_Sub1_Sub1_Sub1(local227, "backleft1", 0);
			this.aClass19_3 = new Class19(local1317.anInt105, (byte) -12, this.method586(), local1317.anInt104);
			local1317.method76(0, 0);
			@Pc(1342) Class10_Sub1_Sub1_Sub1 local1342 = new Class10_Sub1_Sub1_Sub1(local227, "backleft2", 0);
			this.aClass19_4 = new Class19(local1342.anInt105, (byte) -12, this.method586(), local1342.anInt104);
			local1342.method76(0, 0);
			@Pc(1367) Class10_Sub1_Sub1_Sub1 local1367 = new Class10_Sub1_Sub1_Sub1(local227, "backright1", 0);
			this.aClass19_5 = new Class19(local1367.anInt105, (byte) -12, this.method586(), local1367.anInt104);
			local1367.method76(0, 0);
			@Pc(1392) Class10_Sub1_Sub1_Sub1 local1392 = new Class10_Sub1_Sub1_Sub1(local227, "backright2", 0);
			this.aClass19_6 = new Class19(local1392.anInt105, (byte) -12, this.method586(), local1392.anInt104);
			local1392.method76(0, 0);
			@Pc(1417) Class10_Sub1_Sub1_Sub1 local1417 = new Class10_Sub1_Sub1_Sub1(local227, "backtop1", 0);
			this.aClass19_7 = new Class19(local1417.anInt105, (byte) -12, this.method586(), local1417.anInt104);
			local1417.method76(0, 0);
			@Pc(1442) Class10_Sub1_Sub1_Sub1 local1442 = new Class10_Sub1_Sub1_Sub1(local227, "backvmid1", 0);
			this.aClass19_8 = new Class19(local1442.anInt105, (byte) -12, this.method586(), local1442.anInt104);
			local1442.method76(0, 0);
			@Pc(1467) Class10_Sub1_Sub1_Sub1 local1467 = new Class10_Sub1_Sub1_Sub1(local227, "backvmid2", 0);
			this.aClass19_9 = new Class19(local1467.anInt105, (byte) -12, this.method586(), local1467.anInt104);
			local1467.method76(0, 0);
			@Pc(1492) Class10_Sub1_Sub1_Sub1 local1492 = new Class10_Sub1_Sub1_Sub1(local227, "backvmid3", 0);
			this.aClass19_10 = new Class19(local1492.anInt105, (byte) -12, this.method586(), local1492.anInt104);
			local1492.method76(0, 0);
			@Pc(1517) Class10_Sub1_Sub1_Sub1 local1517 = new Class10_Sub1_Sub1_Sub1(local227, "backhmid2", 0);
			this.aClass19_11 = new Class19(local1517.anInt105, (byte) -12, this.method586(), local1517.anInt104);
			local1517.method76(0, 0);
			@Pc(1542) int local1542 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1549) int local1549 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1556) int local1556 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1563) int local1563 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1565) int local1565 = 0; local1565 < 100; local1565++) {
				if (this.aClass10_Sub1_Sub1_Sub1Array6[local1565] != null) {
					this.aClass10_Sub1_Sub1_Sub1Array6[local1565].method74(local1556 + local1563, local1549 + local1563, local1542 + local1563);
				}
				if (this.aClass10_Sub1_Sub1_Sub3Array5[local1565] != null) {
					this.aClass10_Sub1_Sub1_Sub3Array5[local1565].method439(local1556 + local1563, local1549 + local1563, local1542 + local1563);
				}
			}
			this.method588(83, "Unpacking textures");
			Class10_Sub1_Sub1_Sub4.method511(local239);
			Class10_Sub1_Sub1_Sub4.method515(0.8D, (byte) 6);
			Class10_Sub1_Sub1_Sub4.method510();
			this.method588(86, "Unpacking config");
			Class15.method96(local203);
			Class48.method526(local203);
			Class16.method99(local203);
			Class17.method106(local203);
			Class38.method404(local203);
			Class49.method546(local203);
			Class28.method350(local203);
			Class44.method414(local203);
			Class50.method574(local203);
			Class17.aBoolean49 = aBoolean222;
			if (!aBoolean223) {
				this.method588(90, "Unpacking sounds");
				@Pc(1668) byte[] local1668 = local263.method2("sounds.dat", null);
				@Pc(1674) Class10_Sub1_Sub3 local1674 = new Class10_Sub1_Sub3(true, local1668);
				Class39.method408(local1674);
			}
			this.method588(95, "Unpacking interfaces");
			@Pc(1705) Class10_Sub1_Sub1_Sub2[] local1705 = new Class10_Sub1_Sub1_Sub2[] { this.aClass10_Sub1_Sub1_Sub2_2, this.aClass10_Sub1_Sub1_Sub2_3, this.aClass10_Sub1_Sub1_Sub2_4, this.aClass10_Sub1_Sub1_Sub2_5 };
			Class14.method91(local1705, local215, local227);
			this.method588(100, "Preparing game engine");
			@Pc(1721) int local1721;
			@Pc(1723) int local1723;
			@Pc(1725) int local1725;
			for (@Pc(1717) int local1717 = 0; local1717 < 33; local1717++) {
				local1721 = 999;
				local1723 = 0;
				for (local1725 = 0; local1725 < 34; local1725++) {
					if (this.aClass10_Sub1_Sub1_Sub3_17.aByteArray16[local1725 + local1717 * this.aClass10_Sub1_Sub1_Sub3_17.anInt652] == 0) {
						if (local1721 == 999) {
							local1721 = local1725;
						}
					} else if (local1721 != 999) {
						local1723 = local1725;
						break;
					}
				}
				this.anIntArray261[local1717] = local1721;
				this.anIntArray267[local1717] = local1723 - local1721;
			}
			@Pc(1783) int local1783;
			for (local1721 = 5; local1721 < 156; local1721++) {
				local1723 = 999;
				local1725 = 0;
				for (local1783 = 25; local1783 < 172; local1783++) {
					if (this.aClass10_Sub1_Sub1_Sub3_17.aByteArray16[local1783 + local1721 * this.aClass10_Sub1_Sub1_Sub3_17.anInt652] == 0 && (local1783 > 34 || local1721 > 34)) {
						if (local1723 == 999) {
							local1723 = local1783;
						}
					} else if (local1723 != 999) {
						local1725 = local1783;
						break;
					}
				}
				this.anIntArray241[local1721 - 5] = local1723 - 25;
				this.anIntArray220[local1721 - 5] = local1725 - local1723;
			}
			Class10_Sub1_Sub1_Sub4.method508(503, 765);
			this.anIntArray239 = Class10_Sub1_Sub1_Sub4.anIntArray183;
			Class10_Sub1_Sub1_Sub4.method508(96, 479);
			this.anIntArray236 = Class10_Sub1_Sub1_Sub4.anIntArray183;
			Class10_Sub1_Sub1_Sub4.method508(261, 190);
			this.anIntArray237 = Class10_Sub1_Sub1_Sub4.anIntArray183;
			Class10_Sub1_Sub1_Sub4.method508(334, 512);
			this.anIntArray238 = Class10_Sub1_Sub1_Sub4.anIntArray183;
			@Pc(1874) int[] local1874 = new int[9];
			for (local1725 = 0; local1725 < 9; local1725++) {
				local1783 = local1725 * 32 + 128 + 15;
				@Pc(1892) int local1892 = local1783 * 3 + 600;
				@Pc(1896) int local1896 = Class10_Sub1_Sub1_Sub4.anIntArray181[local1783];
				local1874[local1725] = local1892 * local1896 >> 16;
			}
			Class23.method226(local1874);
			Class46.method442(local251);
			this.aClass7_1 = new Class7(this, (byte) -116);
			this.method587(this.aClass7_1, 10);
			Class10_Sub1_Sub2_Sub5.aClient2 = this;
			Class48.aClient4 = this;
			Class38.aClient3 = this;
		} catch (@Pc(1937) Exception local1937) {
			signlink.reporterror("loaderror " + this.aString25 + " " + this.anInt1048);
			this.aBoolean264 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method640(@OriginalArg(0) int arg0) {
		try {
			if (!aBoolean223) {
				for (@Pc(10) int local10 = 0; local10 < this.anIntArray268.length; local10++) {
					@Pc(17) int local17 = this.anIntArray268[local10];
					if (Class10_Sub1_Sub1_Sub4.anIntArray185[local17] >= arg0) {
						@Pc(26) Class10_Sub1_Sub1_Sub3 local26 = Class10_Sub1_Sub1_Sub4.aClass10_Sub1_Sub1_Sub3Array1[local17];
						@Pc(34) int local34 = local26.anInt652 * local26.anInt653 - 1;
						@Pc(42) int local42 = local26.anInt652 * this.anInt878 * 2;
						@Pc(45) byte[] local45 = local26.aByteArray16;
						@Pc(48) byte[] local48 = this.aByteArray21;
						for (@Pc(50) int local50 = 0; local50 <= local34; local50++) {
							local48[local50] = local45[local50 - local42 & local34];
						}
						local26.aByteArray16 = local48;
						this.aByteArray21 = local45;
						Class10_Sub1_Sub1_Sub4.method513(local17);
					}
				}
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("88281, " + arg0 + ", " + -927 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!EWIXBTLV;IIIIII)V")
	private void method641(@OriginalArg(0) int arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg1.anInt120 == 0 && arg1.anIntArray43 != null && !arg1.aBoolean33 && (arg5 >= arg4 && arg6 >= arg0 && arg5 <= arg4 + arg1.anInt123 && arg6 <= arg0 + arg1.anInt121)) {
				@Pc(38) int local38 = arg1.anIntArray43.length;
				for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
					@Pc(49) int local49 = arg1.anIntArray41[local40] + arg4;
					@Pc(58) int local58 = arg1.anIntArray46[local40] + arg0 - arg3;
					@Pc(64) Class14 local64 = Class14.method87(arg1.anIntArray43[local40]);
					@Pc(69) int local69 = local49 + local64.anInt117;
					@Pc(74) int local74 = local58 + local64.anInt134;
					if ((local64.anInt132 >= 0 || local64.anInt136 != 0) && arg5 >= local69 && arg6 >= local74 && arg5 < local69 + local64.anInt123 && arg6 < local74 + local64.anInt121) {
						if (local64.anInt132 >= 0) {
							this.anInt863 = local64.anInt132;
						} else {
							this.anInt863 = local64.anInt111;
						}
					}
					if (local64.anInt120 == 8 && arg5 >= local69 && arg6 >= local74 && arg5 < local69 + local64.anInt123 && arg6 < local74 + local64.anInt121) {
						this.anInt1045 = local64.anInt111;
					}
					if (local64.anInt120 == 0) {
						this.method641(local74, local64, arg2, local64.anInt118, local69, arg5, arg6);
						if (local64.anInt147 > local64.anInt121) {
							this.method617(local64.anInt147, local74, local64, arg6, arg2, arg5, local64.anInt121, local69 + local64.anInt123);
						}
					} else {
						if (local64.anInt150 == 1 && arg5 >= local69 && arg6 >= local74 && arg5 < local69 + local64.anInt123 && arg6 < local74 + local64.anInt121) {
							@Pc(198) boolean local198 = false;
							if (local64.anInt124 != 0) {
								local198 = this.method598(local64, 8);
							}
							if (!local198) {
								this.aStringArray12[this.anInt984] = local64.aString4;
								this.anIntArray233[this.anInt984] = 352;
								this.anIntArray232[this.anInt984] = local64.anInt111;
								this.anInt984++;
							}
						}
						if (local64.anInt150 == 2 && this.anInt978 == 0 && arg5 >= local69 && arg6 >= local74 && arg5 < local69 + local64.anInt123 && arg6 < local74 + local64.anInt121) {
							@Pc(262) String local262 = local64.aString5;
							if (local262.indexOf(" ") != -1) {
								local262 = local262.substring(0, local262.indexOf(" "));
							}
							this.aStringArray12[this.anInt984] = local262 + " @gre@" + local64.aString1;
							this.anIntArray233[this.anInt984] = 70;
							this.anIntArray232[this.anInt984] = local64.anInt111;
							this.anInt984++;
						}
						if (local64.anInt150 == 3 && arg5 >= local69 && arg6 >= local74 && arg5 < local69 + local64.anInt123 && arg6 < local74 + local64.anInt121) {
							this.aStringArray12[this.anInt984] = "Close";
							if (arg2 == 3) {
								this.anIntArray233[this.anInt984] = 55;
							} else {
								this.anIntArray233[this.anInt984] = 639;
							}
							this.anIntArray232[this.anInt984] = local64.anInt111;
							this.anInt984++;
						}
						if (local64.anInt150 == 4 && arg5 >= local69 && arg6 >= local74 && arg5 < local69 + local64.anInt123 && arg6 < local74 + local64.anInt121) {
							this.aStringArray12[this.anInt984] = local64.aString4;
							this.anIntArray233[this.anInt984] = 890;
							this.anIntArray232[this.anInt984] = local64.anInt111;
							this.anInt984++;
						}
						if (local64.anInt150 == 5 && arg5 >= local69 && arg6 >= local74 && arg5 < local69 + local64.anInt123 && arg6 < local74 + local64.anInt121) {
							this.aStringArray12[this.anInt984] = local64.aString4;
							this.anIntArray233[this.anInt984] = 518;
							this.anIntArray232[this.anInt984] = local64.anInt111;
							this.anInt984++;
						}
						if (local64.anInt150 == 6 && !this.aBoolean254 && arg5 >= local69 && arg6 >= local74 && arg5 < local69 + local64.anInt123 && arg6 < local74 + local64.anInt121) {
							this.aStringArray12[this.anInt984] = local64.aString4;
							this.anIntArray233[this.anInt984] = 575;
							this.anIntArray232[this.anInt984] = local64.anInt111;
							this.anInt984++;
						}
						if (local64.anInt120 == 2) {
							@Pc(521) int local521 = 0;
							for (@Pc(523) int local523 = 0; local523 < local64.anInt121; local523++) {
								for (@Pc(527) int local527 = 0; local527 < local64.anInt123; local527++) {
									@Pc(538) int local538 = local69 + local527 * (local64.anInt137 + 32);
									@Pc(547) int local547 = local74 + local523 * (local64.anInt126 + 32);
									if (local521 < 20) {
										local538 += local64.anIntArray39[local521];
										local547 += local64.anIntArray38[local521];
									}
									if (arg5 >= local538 && arg6 >= local547 && arg5 < local538 + 32 && arg6 < local547 + 32) {
										this.anInt930 = local521;
										this.anInt931 = local64.anInt111;
										if (local64.anIntArray44[local521] > 0) {
											@Pc(600) Class17 local600 = Class17.method104(local64.anIntArray44[local521] - 1);
											if (this.anInt965 == 1 && local64.aBoolean34) {
												if (local64.anInt111 != this.anInt967 || local521 != this.anInt966) {
													this.aStringArray12[this.anInt984] = "Use " + this.aString30 + " with @lre@" + local600.aString7;
													this.anIntArray233[this.anInt984] = 903;
													this.anIntArray234[this.anInt984] = local600.anInt196;
													this.anIntArray231[this.anInt984] = local521;
													this.anIntArray232[this.anInt984] = local64.anInt111;
													this.anInt984++;
												}
											} else if (this.anInt978 != 1 || !local64.aBoolean34) {
												@Pc(737) int local737;
												if (local64.aBoolean34) {
													for (local737 = 4; local737 >= 3; local737--) {
														if (local600.aStringArray3 != null && local600.aStringArray3[local737] != null) {
															this.aStringArray12[this.anInt984] = local600.aStringArray3[local737] + " @lre@" + local600.aString7;
															if (local737 == 3) {
																this.anIntArray233[this.anInt984] = 227;
															}
															if (local737 == 4) {
																this.anIntArray233[this.anInt984] = 891;
															}
															this.anIntArray234[this.anInt984] = local600.anInt196;
															this.anIntArray231[this.anInt984] = local521;
															this.anIntArray232[this.anInt984] = local64.anInt111;
															this.anInt984++;
														} else if (local737 == 4) {
															this.aStringArray12[this.anInt984] = "Drop @lre@" + local600.aString7;
															this.anIntArray233[this.anInt984] = 891;
															this.anIntArray234[this.anInt984] = local600.anInt196;
															this.anIntArray231[this.anInt984] = local521;
															this.anIntArray232[this.anInt984] = local64.anInt111;
															this.anInt984++;
														}
													}
												}
												if (local64.aBoolean43) {
													this.aStringArray12[this.anInt984] = "Use @lre@" + local600.aString7;
													this.anIntArray233[this.anInt984] = 52;
													this.anIntArray234[this.anInt984] = local600.anInt196;
													this.anIntArray231[this.anInt984] = local521;
													this.anIntArray232[this.anInt984] = local64.anInt111;
													this.anInt984++;
												}
												if (local64.aBoolean34 && local600.aStringArray3 != null) {
													for (local737 = 2; local737 >= 0; local737--) {
														if (local600.aStringArray3[local737] != null) {
															this.aStringArray12[this.anInt984] = local600.aStringArray3[local737] + " @lre@" + local600.aString7;
															if (local737 == 0) {
																this.anIntArray233[this.anInt984] = 961;
															}
															if (local737 == 1) {
																this.anIntArray233[this.anInt984] = 399;
															}
															if (local737 == 2) {
																this.anIntArray233[this.anInt984] = 324;
															}
															this.anIntArray234[this.anInt984] = local600.anInt196;
															this.anIntArray231[this.anInt984] = local521;
															this.anIntArray232[this.anInt984] = local64.anInt111;
															this.anInt984++;
														}
													}
												}
												if (local64.aStringArray1 != null) {
													for (local737 = 4; local737 >= 0; local737--) {
														if (local64.aStringArray1[local737] != null) {
															this.aStringArray12[this.anInt984] = local64.aStringArray1[local737] + " @lre@" + local600.aString7;
															if (local737 == 0) {
																this.anIntArray233[this.anInt984] = 9;
															}
															if (local737 == 1) {
																this.anIntArray233[this.anInt984] = 225;
															}
															if (local737 == 2) {
																this.anIntArray233[this.anInt984] = 444;
															}
															if (local737 == 3) {
																this.anIntArray233[this.anInt984] = 564;
															}
															if (local737 == 4) {
																this.anIntArray233[this.anInt984] = 894;
															}
															this.anIntArray234[this.anInt984] = local600.anInt196;
															this.anIntArray231[this.anInt984] = local521;
															this.anIntArray232[this.anInt984] = local64.anInt111;
															this.anInt984++;
														}
													}
												}
												this.aStringArray12[this.anInt984] = "Examine @lre@" + local600.aString7;
												this.anIntArray233[this.anInt984] = 1094;
												this.anIntArray234[this.anInt984] = local600.anInt196;
												this.anIntArray231[this.anInt984] = local521;
												this.anIntArray232[this.anInt984] = local64.anInt111;
												this.anInt984++;
											} else if ((this.anInt980 & 0x10) == 16) {
												this.aStringArray12[this.anInt984] = this.aString31 + " @lre@" + local600.aString7;
												this.anIntArray233[this.anInt984] = 361;
												this.anIntArray234[this.anInt984] = local600.anInt196;
												this.anIntArray231[this.anInt984] = local521;
												this.anIntArray232[this.anInt984] = local64.anInt111;
												this.anInt984++;
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
			signlink.reporterror("81476, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 23658 + ", " + arg6 + ", " + local1167.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method642() {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt960; local1++) {
				@Pc(8) int local8 = this.anIntArray256[local1];
				@Pc(13) Class10_Sub1_Sub2_Sub3_Sub1 local13 = this.aClass10_Sub1_Sub2_Sub3_Sub1Array1[local8];
				if (local13 != null) {
					this.method643(local13.aClass38_1.aByte31, local13);
				}
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("63020, " + -37214 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!LRUWCBNN;)V")
	private void method643(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub1_Sub2_Sub3 arg1) {
		try {
			if (arg1.anInt739 < 128 || arg1.anInt740 < 128 || arg1.anInt739 >= 13184 || arg1.anInt740 >= 13184) {
				arg1.anInt753 = -1;
				arg1.anInt743 = -1;
				arg1.anInt735 = 0;
				arg1.anInt736 = 0;
				arg1.anInt739 = arg1.anIntArray193[0] * 128 + arg1.anInt730 * 64;
				arg1.anInt740 = arg1.anIntArray194[0] * 128 + arg1.anInt730 * 64;
				arg1.method538();
			}
			if (arg1 == aClass10_Sub1_Sub2_Sub3_Sub2_1 && (arg1.anInt739 < 1536 || arg1.anInt740 < 1536 || arg1.anInt739 >= 11776 || arg1.anInt740 >= 11776)) {
				arg1.anInt753 = -1;
				arg1.anInt743 = -1;
				arg1.anInt735 = 0;
				arg1.anInt736 = 0;
				arg1.anInt739 = arg1.anIntArray193[0] * 128 + arg1.anInt730 * 64;
				arg1.anInt740 = arg1.anIntArray194[0] * 128 + arg1.anInt730 * 64;
				arg1.method538();
			}
			if (arg1.anInt735 > anInt1050) {
				this.method644(arg1);
			} else if (arg1.anInt736 >= anInt1050) {
				this.method645(arg1);
			} else {
				this.method646(arg1);
			}
			this.method647(arg1);
			this.method648(arg1);
		} catch (@Pc(155) RuntimeException local155) {
			signlink.reporterror("26942, " + arg0 + ", " + -97 + ", " + arg1 + ", " + local155.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!LRUWCBNN;Z)V")
	private void method644(@OriginalArg(0) Class10_Sub1_Sub2_Sub3 arg0) {
		try {
			@Pc(12) int local12 = arg0.anInt735 - anInt1050;
			@Pc(22) int local22 = arg0.anInt731 * 128 + arg0.anInt730 * 64;
			@Pc(32) int local32 = arg0.anInt733 * 128 + arg0.anInt730 * 64;
			arg0.anInt739 += (local22 - arg0.anInt739) / local12;
			arg0.anInt740 += (local32 - arg0.anInt740) / local12;
			arg0.anInt752 = 0;
			if (arg0.anInt737 == 0) {
				arg0.anInt717 = 1024;
			}
			if (arg0.anInt737 == 1) {
				arg0.anInt717 = 1536;
			}
			if (arg0.anInt737 == 2) {
				arg0.anInt717 = 0;
			}
			if (arg0.anInt737 == 3) {
				arg0.anInt717 = 512;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("69093, " + arg0 + ", " + true + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!LRUWCBNN;I)V")
	private void method645(@OriginalArg(0) Class10_Sub1_Sub2_Sub3 arg0) {
		try {
			if (arg0.anInt736 == anInt1050 || arg0.anInt753 == -1 || arg0.anInt756 != 0 || arg0.anInt755 + 1 > Class15.aClass15Array1[arg0.anInt753].method97(arg0.anInt754)) {
				@Pc(29) int local29 = arg0.anInt736 - arg0.anInt735;
				@Pc(34) int local34 = anInt1050 - arg0.anInt735;
				@Pc(44) int local44 = arg0.anInt731 * 128 + arg0.anInt730 * 64;
				@Pc(54) int local54 = arg0.anInt733 * 128 + arg0.anInt730 * 64;
				@Pc(64) int local64 = arg0.anInt732 * 128 + arg0.anInt730 * 64;
				@Pc(74) int local74 = arg0.anInt734 * 128 + arg0.anInt730 * 64;
				arg0.anInt739 = (local44 * (local29 - local34) + local64 * local34) / local29;
				arg0.anInt740 = (local54 * (local29 - local34) + local74 * local34) / local29;
			}
			arg0.anInt752 = 0;
			if (arg0.anInt737 == 0) {
				arg0.anInt717 = 1024;
			}
			if (arg0.anInt737 == 1) {
				arg0.anInt717 = 1536;
			}
			if (arg0.anInt737 == 2) {
				arg0.anInt717 = 0;
			}
			if (arg0.anInt737 == 3) {
				arg0.anInt717 = 512;
			}
			arg0.anInt741 = arg0.anInt717;
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("67614, " + arg0 + ", " + -31135 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!LRUWCBNN;I)V")
	private void method646(@OriginalArg(0) Class10_Sub1_Sub2_Sub3 arg0) {
		try {
			arg0.anInt719 = arg0.anInt760;
			if (arg0.anInt759 == 0) {
				arg0.anInt752 = 0;
			} else {
				if (arg0.anInt753 != -1 && arg0.anInt756 == 0) {
					@Pc(24) Class15 local24 = Class15.aClass15Array1[arg0.anInt753];
					if (arg0.anInt742 > 0 && local24.anInt158 == 0) {
						arg0.anInt752++;
						return;
					}
					if (arg0.anInt742 <= 0 && local24.anInt159 == 0) {
						arg0.anInt752++;
						return;
					}
				}
				@Pc(53) int local53 = arg0.anInt739;
				@Pc(56) int local56 = arg0.anInt740;
				@Pc(71) int local71 = arg0.anIntArray193[arg0.anInt759 - 1] * 128 + arg0.anInt730 * 64;
				@Pc(86) int local86 = arg0.anIntArray194[arg0.anInt759 - 1] * 128 + arg0.anInt730 * 64;
				if (local71 - local53 <= 256 && local71 - local53 >= -256 && local86 - local56 <= 256 && local86 - local56 >= -256) {
					if (local53 < local71) {
						if (local56 < local86) {
							arg0.anInt717 = 1280;
						} else if (local56 > local86) {
							arg0.anInt717 = 1792;
						} else {
							arg0.anInt717 = 1536;
						}
					} else if (local53 > local71) {
						if (local56 < local86) {
							arg0.anInt717 = 768;
						} else if (local56 > local86) {
							arg0.anInt717 = 256;
						} else {
							arg0.anInt717 = 512;
						}
					} else if (local56 < local86) {
						arg0.anInt717 = 1024;
					} else {
						arg0.anInt717 = 0;
					}
					@Pc(180) int local180 = arg0.anInt717 - arg0.anInt741 & 0x7FF;
					if (local180 > 1024) {
						local180 -= 2048;
					}
					@Pc(187) int local187 = arg0.anInt749;
					if (local180 >= -256 && local180 <= 256) {
						local187 = arg0.anInt748;
					} else if (local180 >= 256 && local180 < 768) {
						local187 = arg0.anInt751;
					} else if (local180 >= -768 && local180 <= -256) {
						local187 = arg0.anInt750;
					}
					if (local187 == -1) {
						local187 = arg0.anInt748;
					}
					arg0.anInt719 = local187;
					@Pc(235) int local235 = 4;
					if (arg0.anInt741 != arg0.anInt717 && arg0.anInt738 == -1 && arg0.anInt729 != 0) {
						local235 = 2;
					}
					if (arg0.anInt759 > 2) {
						local235 = 6;
					}
					if (arg0.anInt759 > 3) {
						local235 = 8;
					}
					if (arg0.anInt752 > 0 && arg0.anInt759 > 1) {
						local235 = 8;
						arg0.anInt752--;
					}
					if (arg0.aBooleanArray10[arg0.anInt759 - 1]) {
						local235 <<= 0x1;
					}
					if (local235 >= 8 && arg0.anInt719 == arg0.anInt748 && arg0.anInt758 != -1) {
						arg0.anInt719 = arg0.anInt758;
					}
					if (local53 < local71) {
						arg0.anInt739 += local235;
						if (arg0.anInt739 > local71) {
							arg0.anInt739 = local71;
						}
					} else if (local53 > local71) {
						arg0.anInt739 -= local235;
						if (arg0.anInt739 < local71) {
							arg0.anInt739 = local71;
						}
					}
					if (local56 < local86) {
						arg0.anInt740 += local235;
						if (arg0.anInt740 > local86) {
							arg0.anInt740 = local86;
						}
					} else if (local56 > local86) {
						arg0.anInt740 -= local235;
						if (arg0.anInt740 < local86) {
							arg0.anInt740 = local86;
						}
					}
					if (arg0.anInt739 == local71 && arg0.anInt740 == local86) {
						arg0.anInt759--;
						if (arg0.anInt742 > 0) {
							arg0.anInt742--;
							return;
						}
					}
				} else {
					arg0.anInt739 = local71;
					arg0.anInt740 = local86;
				}
			}
		} catch (@Pc(397) RuntimeException local397) {
			signlink.reporterror("4659, " + arg0 + ", " + 0 + ", " + local397.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!LRUWCBNN;)V")
	private void method647(@OriginalArg(1) Class10_Sub1_Sub2_Sub3 arg0) {
		try {
			if (arg0.anInt729 != 0) {
				@Pc(35) int local35;
				@Pc(41) int local41;
				if (arg0.anInt738 != -1 && arg0.anInt738 < 32768) {
					@Pc(27) Class10_Sub1_Sub2_Sub3_Sub1 local27 = this.aClass10_Sub1_Sub2_Sub3_Sub1Array1[arg0.anInt738];
					if (local27 != null) {
						local35 = arg0.anInt739 - local27.anInt739;
						local41 = arg0.anInt740 - local27.anInt740;
						if (local35 != 0 || local41 != 0) {
							arg0.anInt717 = (int) (Math.atan2((double) local35, (double) local41) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(66) int local66;
				if (arg0.anInt738 >= 32768) {
					local66 = arg0.anInt738 - 32768;
					if (local66 == this.anInt881) {
						local66 = this.anInt883;
					}
					@Pc(78) Class10_Sub1_Sub2_Sub3_Sub2 local78 = this.aClass10_Sub1_Sub2_Sub3_Sub2Array1[local66];
					if (local78 != null) {
						local41 = arg0.anInt739 - local78.anInt739;
						@Pc(92) int local92 = arg0.anInt740 - local78.anInt740;
						if (local41 != 0 || local92 != 0) {
							arg0.anInt717 = (int) (Math.atan2((double) local41, (double) local92) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt727 != 0 || arg0.anInt728 != 0) && (arg0.anInt759 == 0 || arg0.anInt752 > 0)) {
					local66 = arg0.anInt739 - (arg0.anInt727 - this.anInt914 - this.anInt914) * 64;
					local35 = arg0.anInt740 - (arg0.anInt728 - this.anInt915 - this.anInt915) * 64;
					if (local66 != 0 || local35 != 0) {
						arg0.anInt717 = (int) (Math.atan2((double) local66, (double) local35) * 325.949D) & 0x7FF;
					}
					arg0.anInt727 = 0;
					arg0.anInt728 = 0;
				}
				local66 = arg0.anInt717 - arg0.anInt741 & 0x7FF;
				if (local66 != 0) {
					if (local66 < arg0.anInt729 || local66 > 2048 - arg0.anInt729) {
						arg0.anInt741 = arg0.anInt717;
					} else if (local66 > 1024) {
						arg0.anInt741 -= arg0.anInt729;
					} else {
						arg0.anInt741 += arg0.anInt729;
					}
					arg0.anInt741 &= 0x7FF;
					if (arg0.anInt719 == arg0.anInt760 && arg0.anInt741 != arg0.anInt717) {
						if (arg0.anInt761 != -1) {
							arg0.anInt719 = arg0.anInt761;
							return;
						}
						arg0.anInt719 = arg0.anInt748;
						return;
					}
				}
			}
		} catch (@Pc(246) RuntimeException local246) {
			signlink.reporterror("40909, " + 8 + ", " + arg0 + ", " + local246.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!LRUWCBNN;I)V")
	private void method648(@OriginalArg(0) Class10_Sub1_Sub2_Sub3 arg0) {
		try {
			arg0.aBoolean196 = false;
			@Pc(20) Class15 local20;
			if (arg0.anInt719 != -1) {
				local20 = Class15.aClass15Array1[arg0.anInt719];
				arg0.anInt721++;
				if (arg0.anInt720 < local20.anInt152 && arg0.anInt721 > local20.method97(arg0.anInt720)) {
					arg0.anInt721 = 1;
					arg0.anInt720++;
				}
				if (arg0.anInt720 >= local20.anInt152) {
					arg0.anInt721 = 1;
					arg0.anInt720 = 0;
				}
			}
			if (arg0.anInt743 != -1 && anInt1050 >= arg0.anInt746) {
				if (arg0.anInt744 < 0) {
					arg0.anInt744 = 0;
				}
				local20 = Class28.aClass28Array1[arg0.anInt743].aClass15_1;
				arg0.anInt745++;
				if (arg0.anInt744 < local20.anInt152 && arg0.anInt745 > local20.method97(arg0.anInt744)) {
					arg0.anInt745 = 1;
					arg0.anInt744++;
				}
				if (arg0.anInt744 >= local20.anInt152 && (arg0.anInt744 < 0 || arg0.anInt744 >= local20.anInt152)) {
					arg0.anInt743 = -1;
				}
			}
			if (arg0.anInt753 != -1 && arg0.anInt756 <= 1) {
				local20 = Class15.aClass15Array1[arg0.anInt753];
				if (local20.anInt158 == 1 && arg0.anInt742 > 0 && arg0.anInt735 <= anInt1050 && arg0.anInt736 < anInt1050) {
					arg0.anInt756 = 1;
					return;
				}
			}
			if (arg0.anInt753 != -1 && arg0.anInt756 == 0) {
				local20 = Class15.aClass15Array1[arg0.anInt753];
				arg0.anInt755++;
				if (arg0.anInt754 < local20.anInt152 && arg0.anInt755 > local20.method97(arg0.anInt754)) {
					arg0.anInt755 = 1;
					arg0.anInt754++;
				}
				if (arg0.anInt754 >= local20.anInt152) {
					arg0.anInt754 -= local20.anInt153;
					arg0.anInt757++;
					if (arg0.anInt757 >= local20.anInt157) {
						arg0.anInt753 = -1;
					}
					if (arg0.anInt754 < 0 || arg0.anInt754 >= local20.anInt152) {
						arg0.anInt753 = -1;
					}
				}
				arg0.aBoolean196 = local20.aBoolean45;
			}
			if (arg0.anInt756 > 0) {
				arg0.anInt756--;
			}
		} catch (@Pc(247) RuntimeException local247) {
			signlink.reporterror("8251, " + arg0 + ", " + -136 + ", " + local247.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method649() {
		try {
			if (this.anInt926 == -1 || this.anInt933 != 2 && super.aClass19_2 == null) {
				if (this.aBoolean236) {
					this.method697();
					this.aBoolean236 = false;
					this.aClass19_3.method131(4, 0, super.aGraphics2, this.aBoolean239);
					this.aClass19_4.method131(357, 0, super.aGraphics2, this.aBoolean239);
					this.aClass19_5.method131(4, 722, super.aGraphics2, this.aBoolean239);
					this.aClass19_6.method131(205, 743, super.aGraphics2, this.aBoolean239);
					this.aClass19_7.method131(0, 0, super.aGraphics2, this.aBoolean239);
					this.aClass19_8.method131(4, 516, super.aGraphics2, this.aBoolean239);
					this.aClass19_9.method131(205, 516, super.aGraphics2, this.aBoolean239);
					this.aClass19_10.method131(357, 496, super.aGraphics2, this.aBoolean239);
					this.aClass19_11.method131(338, 0, super.aGraphics2, this.aBoolean239);
					this.aBoolean248 = true;
					this.aBoolean255 = true;
					this.aBoolean225 = true;
					this.aBoolean253 = true;
					if (this.anInt933 != 2) {
						this.aClass19_17.method131(4, 4, super.aGraphics2, this.aBoolean239);
						this.aClass19_16.method131(4, 550, super.aGraphics2, this.aBoolean239);
					}
					anInt1007++;
					if (anInt1007 > 85) {
						anInt1007 = 0;
						this.aClass10_Sub1_Sub3_7.method300(168);
					}
				}
				if (this.anInt933 == 2) {
					this.method726();
				}
				if (this.aBoolean237 && this.anInt1039 == 1) {
					this.aBoolean248 = true;
				}
				@Pc(306) boolean local306;
				if (this.anInt941 != -1) {
					local306 = this.method663(this.anInt878, this.anInt941, (byte) 5);
					if (local306) {
						this.aBoolean248 = true;
					}
				}
				if (this.anInt1056 == 2) {
					this.aBoolean248 = true;
				}
				if (this.anInt950 == 2) {
					this.aBoolean248 = true;
				}
				if (this.aBoolean248) {
					this.method709();
					this.aBoolean248 = false;
				}
				@Pc(391) int local391;
				if (this.anInt888 == -1 && this.anInt1010 == 0) {
					this.aClass14_1.anInt118 = this.anInt947 - this.anInt834 - 77;
					if (super.anInt816 > 448 && super.anInt816 < 560 && super.anInt817 > 332) {
						this.method617(this.anInt947, 0, this.aClass14_1, super.anInt817 - 357, -1, super.anInt816 - 17, 77, 463);
					}
					local391 = this.anInt947 - this.aClass14_1.anInt118 - 77;
					if (local391 < 0) {
						local391 = 0;
					}
					if (local391 > this.anInt947 - 77) {
						local391 = this.anInt947 - 77;
					}
					if (this.anInt834 != local391) {
						this.anInt834 = local391;
						this.aBoolean255 = true;
					}
				}
				if (this.anInt888 == -1 && this.anInt1010 == 3) {
					local391 = this.anInt840 * 14 + 7;
					this.aClass14_1.anInt118 = this.anInt841;
					if (super.anInt816 > 448 && super.anInt816 < 560 && super.anInt817 > 332) {
						this.method617(local391, 0, this.aClass14_1, super.anInt817 - 357, -1, super.anInt816 - 17, 77, 463);
					}
					@Pc(470) int local470 = this.aClass14_1.anInt118;
					if (local470 < 0) {
						local470 = 0;
					}
					if (local470 > local391 - 77) {
						local470 = local391 - 77;
					}
					if (this.anInt841 != local470) {
						this.anInt841 = local470;
						this.aBoolean255 = true;
					}
				}
				if (this.anInt888 != -1) {
					local306 = this.method663(this.anInt878, this.anInt888, (byte) 5);
					if (local306) {
						this.aBoolean255 = true;
					}
				}
				if (this.anInt1056 == 3) {
					this.aBoolean255 = true;
				}
				if (this.anInt950 == 3) {
					this.aBoolean255 = true;
				}
				if (this.aString26 != null) {
					this.aBoolean255 = true;
				}
				if (this.aBoolean237 && this.anInt1039 == 2) {
					this.aBoolean255 = true;
				}
				if (this.aBoolean255) {
					this.method659();
					this.aBoolean255 = false;
				}
				if (this.anInt933 == 2) {
					this.method662(503);
					this.aClass19_16.method131(4, 550, super.aGraphics2, this.aBoolean239);
				}
				if (this.anInt988 != -1) {
					this.aBoolean225 = true;
				}
				if (this.aBoolean225) {
					if (this.anInt988 != -1 && this.anInt988 == this.anInt1031) {
						this.anInt988 = -1;
						this.aClass10_Sub1_Sub3_7.method300(119);
						this.aClass10_Sub1_Sub3_7.method301(this.anInt1031);
					}
					this.aBoolean225 = false;
					this.aClass19_14.method130();
					this.aClass10_Sub1_Sub1_Sub3_8.method440(0, 0);
					if (this.anInt941 == -1) {
						if (this.anIntArray248[this.anInt1031] != -1) {
							if (this.anInt1031 == 0) {
								this.aClass10_Sub1_Sub1_Sub3_1.method440(10, 22);
							}
							if (this.anInt1031 == 1) {
								this.aClass10_Sub1_Sub1_Sub3_2.method440(8, 54);
							}
							if (this.anInt1031 == 2) {
								this.aClass10_Sub1_Sub1_Sub3_2.method440(8, 82);
							}
							if (this.anInt1031 == 3) {
								this.aClass10_Sub1_Sub1_Sub3_3.method440(8, 110);
							}
							if (this.anInt1031 == 4) {
								this.aClass10_Sub1_Sub1_Sub3_5.method440(8, 153);
							}
							if (this.anInt1031 == 5) {
								this.aClass10_Sub1_Sub1_Sub3_5.method440(8, 181);
							}
							if (this.anInt1031 == 6) {
								this.aClass10_Sub1_Sub1_Sub3_4.method440(9, 209);
							}
						}
						if (this.anIntArray248[0] != -1 && (this.anInt988 != 0 || anInt1050 % 20 < 10)) {
							this.aClass10_Sub1_Sub1_Sub3Array2[0].method440(13, 29);
						}
						if (this.anIntArray248[1] != -1 && (this.anInt988 != 1 || anInt1050 % 20 < 10)) {
							this.aClass10_Sub1_Sub1_Sub3Array2[1].method440(11, 53);
						}
						if (this.anIntArray248[2] != -1 && (this.anInt988 != 2 || anInt1050 % 20 < 10)) {
							this.aClass10_Sub1_Sub1_Sub3Array2[2].method440(11, 82);
						}
						if (this.anIntArray248[3] != -1 && (this.anInt988 != 3 || anInt1050 % 20 < 10)) {
							this.aClass10_Sub1_Sub1_Sub3Array2[3].method440(12, 115);
						}
						if (this.anIntArray248[4] != -1 && (this.anInt988 != 4 || anInt1050 % 20 < 10)) {
							this.aClass10_Sub1_Sub1_Sub3Array2[4].method440(13, 153);
						}
						if (this.anIntArray248[5] != -1 && (this.anInt988 != 5 || anInt1050 % 20 < 10)) {
							this.aClass10_Sub1_Sub1_Sub3Array2[5].method440(11, 180);
						}
						if (this.anIntArray248[6] != -1 && (this.anInt988 != 6 || anInt1050 % 20 < 10)) {
							this.aClass10_Sub1_Sub1_Sub3Array2[6].method440(13, 208);
						}
					}
					this.aClass19_14.method131(160, 516, super.aGraphics2, this.aBoolean239);
					this.aClass19_13.method130();
					this.aClass10_Sub1_Sub1_Sub3_7.method440(0, 0);
					if (this.anInt941 == -1) {
						if (this.anIntArray248[this.anInt1031] != -1) {
							if (this.anInt1031 == 7) {
								this.aClass10_Sub1_Sub1_Sub3_9.method440(0, 42);
							}
							if (this.anInt1031 == 8) {
								this.aClass10_Sub1_Sub1_Sub3_10.method440(0, 74);
							}
							if (this.anInt1031 == 9) {
								this.aClass10_Sub1_Sub1_Sub3_10.method440(0, 102);
							}
							if (this.anInt1031 == 10) {
								this.aClass10_Sub1_Sub1_Sub3_11.method440(1, 130);
							}
							if (this.anInt1031 == 11) {
								this.aClass10_Sub1_Sub1_Sub3_13.method440(0, 173);
							}
							if (this.anInt1031 == 12) {
								this.aClass10_Sub1_Sub1_Sub3_13.method440(0, 201);
							}
							if (this.anInt1031 == 13) {
								this.aClass10_Sub1_Sub1_Sub3_12.method440(0, 229);
							}
						}
						if (this.anIntArray248[8] != -1 && (this.anInt988 != 8 || anInt1050 % 20 < 10)) {
							this.aClass10_Sub1_Sub1_Sub3Array2[7].method440(2, 74);
						}
						if (this.anIntArray248[9] != -1 && (this.anInt988 != 9 || anInt1050 % 20 < 10)) {
							this.aClass10_Sub1_Sub1_Sub3Array2[8].method440(3, 102);
						}
						if (this.anIntArray248[10] != -1 && (this.anInt988 != 10 || anInt1050 % 20 < 10)) {
							this.aClass10_Sub1_Sub1_Sub3Array2[9].method440(4, 137);
						}
						if (this.anIntArray248[11] != -1 && (this.anInt988 != 11 || anInt1050 % 20 < 10)) {
							this.aClass10_Sub1_Sub1_Sub3Array2[10].method440(2, 174);
						}
						if (this.anIntArray248[12] != -1 && (this.anInt988 != 12 || anInt1050 % 20 < 10)) {
							this.aClass10_Sub1_Sub1_Sub3Array2[11].method440(2, 201);
						}
						if (this.anIntArray248[13] != -1 && (this.anInt988 != 13 || anInt1050 % 20 < 10)) {
							this.aClass10_Sub1_Sub1_Sub3Array2[12].method440(2, 226);
						}
					}
					this.aClass19_13.method131(466, 496, super.aGraphics2, this.aBoolean239);
					this.aClass19_17.method130();
					Class10_Sub1_Sub1_Sub4.anIntArray183 = this.anIntArray238;
				}
				if (this.aBoolean253) {
					this.aBoolean253 = false;
					this.aClass19_12.method130();
					this.aClass10_Sub1_Sub1_Sub3_6.method440(0, 0);
					this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 16777215, 28, 55, "Public chat");
					if (this.anInt899 == 0) {
						this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 65280, 41, 55, "On");
					}
					if (this.anInt899 == 1) {
						this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 16776960, 41, 55, "Friends");
					}
					if (this.anInt899 == 2) {
						this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 16711680, 41, 55, "Off");
					}
					if (this.anInt899 == 3) {
						this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 65535, 41, 55, "Hide");
					}
					this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 16777215, 28, 184, "Private chat");
					if (this.anInt853 == 0) {
						this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 65280, 41, 184, "On");
					}
					if (this.anInt853 == 1) {
						this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 16776960, 41, 184, "Friends");
					}
					if (this.anInt853 == 2) {
						this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 16711680, 41, 184, "Off");
					}
					this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 16777215, 28, 324, "Trade/compete");
					if (this.anInt1000 == 0) {
						this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 65280, 41, 324, "On");
					}
					if (this.anInt1000 == 1) {
						this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 16776960, 41, 324, "Friends");
					}
					if (this.anInt1000 == 2) {
						this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 16711680, 41, 324, "Off");
					}
					this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 16777215, 33, 458, "Report abuse");
					this.aClass19_12.method131(453, 0, super.aGraphics2, this.aBoolean239);
					this.aClass19_17.method130();
					Class10_Sub1_Sub1_Sub4.anIntArray183 = this.anIntArray238;
				}
				this.anInt878 = 0;
			} else {
				if (this.anInt933 == 2) {
					this.method663(this.anInt878, this.anInt926, (byte) 5);
					if (this.anInt880 != -1) {
						this.method663(this.anInt878, this.anInt880, (byte) 5);
					}
					this.anInt878 = 0;
					this.method722(this.anInt964);
					super.aClass19_2.method130();
					Class10_Sub1_Sub1_Sub4.anIntArray183 = this.anIntArray239;
					Class10_Sub1_Sub1.method497();
					this.aBoolean236 = true;
					@Pc(59) Class14 local59 = Class14.method87(this.anInt926);
					if (local59.anInt123 == 512 && local59.anInt121 == 334 && local59.anInt120 == 0) {
						local59.anInt123 = 765;
						local59.anInt121 = 503;
					}
					this.method717(0, 0, local59, 0);
					if (this.anInt880 != -1) {
						local59 = Class14.method87(this.anInt880);
						if (local59.anInt123 == 512 && local59.anInt121 == 334 && local59.anInt120 == 0) {
							local59.anInt123 = 765;
							local59.anInt121 = 503;
						}
						this.method717(0, 0, local59, 0);
					}
					if (this.aBoolean237) {
						this.method703();
					} else {
						this.method666();
						this.method609();
					}
				}
				super.aClass19_2.method131(0, 0, super.aGraphics2, this.aBoolean239);
			}
		} catch (@Pc(1328) RuntimeException local1328) {
			signlink.reporterror("29795, " + 7 + ", " + local1328.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method650() {
		try {
			this.anInt843 += 0;
			if (this.anInt997 != 0) {
				@Pc(12) Class10_Sub1_Sub1_Sub2 local12 = this.aClass10_Sub1_Sub1_Sub2_3;
				@Pc(14) int local14 = 0;
				if (this.anInt929 != 0) {
					local14 = 1;
				}
				for (@Pc(21) int local21 = 0; local21 < 100; local21++) {
					if (this.aStringArray14[local21] != null) {
						@Pc(33) int local33 = this.anIntArray270[local21];
						@Pc(38) String local38 = this.aStringArray13[local21];
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
						if ((local33 == 3 || local33 == 7) && (local33 == 7 || this.anInt853 == 0 || this.anInt853 == 1 && this.method723(local38))) {
							local91 = 329 - local14 * 13;
							local12.method152(4, 0, local91, "From");
							local12.method152(4, 65535, local91 - 1, "From");
							@Pc(116) int local116 = local12.method150("From ") + 4;
							if (local40 == 1) {
								this.aClass10_Sub1_Sub1_Sub3Array4[0].method440(local91 - 12, local116);
								local116 += 14;
							}
							if (local40 == 2) {
								this.aClass10_Sub1_Sub1_Sub3Array4[1].method440(local91 - 12, local116);
								local116 += 14;
							}
							local12.method152(local116, 0, local91, local38 + ": " + this.aStringArray14[local21]);
							local12.method152(local116, 65535, local91 - 1, local38 + ": " + this.aStringArray14[local21]);
							local14++;
							if (local14 >= 5) {
								return;
							}
						}
						if (local33 == 5 && this.anInt853 < 2) {
							local91 = 329 - local14 * 13;
							local12.method152(4, 0, local91, this.aStringArray14[local21]);
							local12.method152(4, 65535, local91 - 1, this.aStringArray14[local21]);
							local14++;
							if (local14 >= 5) {
								return;
							}
						}
						if (local33 == 6 && this.anInt853 < 2) {
							local91 = 329 - local14 * 13;
							local12.method152(4, 0, local91, "To " + local38 + ": " + this.aStringArray14[local21]);
							local12.method152(4, 65535, local91 - 1, "To " + local38 + ": " + this.aStringArray14[local21]);
							local14++;
							if (local14 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(295) RuntimeException local295) {
			signlink.reporterror("72902, " + 0 + ", " + local295.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt868 = Integer.parseInt(this.getParameter("nodeid"));
		anInt869 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method676();
		} else {
			method602();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean222 = false;
		} else {
			aBoolean222 = true;
		}
		this.method577();
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method651() {
		try {
			for (@Pc(13) Class10_Sub1_Sub2_Sub6 local13 = (Class10_Sub1_Sub2_Sub6) this.aClass6_10.method6(); local13 != null; local13 = (Class10_Sub1_Sub2_Sub6) this.aClass6_10.method8()) {
				if (local13.anInt623 != this.anInt942 || local13.aBoolean156) {
					local13.method534();
				} else if (anInt1050 >= local13.anInt629) {
					local13.method420((byte) 1, this.anInt878);
					if (local13.aBoolean156) {
						local13.method534();
					} else {
						this.aClass23_1.method201(-1, local13, local13.anInt624, local13.anInt626, false, local13.anInt623, 60, local13.anInt625, 0);
					}
				}
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("83050, " + -992 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method652() {
		try {
			while (true) {
				@Pc(10) Class10_Sub1_Sub4 local10 = this.aClass33_Sub1_1.method559();
				if (local10 == null) {
					return;
				}
				if (local10.anInt486 == 0) {
					Class10_Sub1_Sub2_Sub4.method269(local10.aByteArray13, local10.anInt487);
					if ((this.aClass33_Sub1_1.method554(local10.anInt487) & 0x62) != 0) {
						this.aBoolean248 = true;
						if (this.anInt888 != -1 || this.anInt985 != -1) {
							this.aBoolean255 = true;
						}
					}
				}
				if (local10.anInt486 == 1 && local10.aByteArray13 != null) {
					Class22.method166(local10.aByteArray13);
				}
				if (local10.anInt486 == 2 && local10.anInt487 == this.anInt1023 && local10.aByteArray13 != null) {
					this.method599(this.aBoolean260, local10.aByteArray13, 659);
				}
				if (local10.anInt486 == 3 && this.anInt933 == 1) {
					for (@Pc(85) int local85 = 0; local85 < this.aByteArrayArray5.length; local85++) {
						if (this.anIntArray217[local85] == local10.anInt487) {
							this.aByteArrayArray5[local85] = local10.aByteArray13;
							if (local10.aByteArray13 == null) {
								this.anIntArray217[local85] = -1;
							}
							break;
						}
						if (this.anIntArray218[local85] == local10.anInt487) {
							this.aByteArrayArray6[local85] = local10.aByteArray13;
							if (local10.aByteArray13 == null) {
								this.anIntArray218[local85] = -1;
							}
							break;
						}
					}
				}
				if (local10.anInt486 == 93 && this.aClass33_Sub1_1.method563(local10.anInt487)) {
					Class8.method17(this.aClass33_Sub1_1, new Class10_Sub1_Sub3(true, local10.aByteArray13));
				}
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("96200, " + false + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)Z")
	private boolean method653() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("22206, " + 295 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method654(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString21 = "";
				this.aString22 = "Connecting to server...";
				this.method706(true);
			}
			this.aClass18_1 = new Class18((byte) 2, this.method607(anInt869 + 43594), this);
			@Pc(30) long local30 = Class26.method248(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass10_Sub1_Sub3_7.anInt428 = 0;
			this.aClass10_Sub1_Sub3_7.method301(14);
			this.aClass10_Sub1_Sub3_7.method301(local37);
			this.aClass18_1.method120(2, this.aClass10_Sub1_Sub3_7.aByteArray12);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass18_1.method117();
			}
			@Pc(74) int local74 = this.aClass18_1.method117();
			@Pc(76) int local76 = local74;
			@Pc(226) int local226;
			@Pc(261) int local261;
			if (local74 == 0) {
				this.aClass18_1.method119(this.aClass10_Sub1_Sub3_9.aByteArray12, 0, 8);
				this.aClass10_Sub1_Sub3_9.anInt428 = 0;
				this.aLong30 = this.aClass10_Sub1_Sub3_9.method317();
				@Pc(99) int[] local99 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong30 >> 32), (int) this.aLong30 };
				this.aClass10_Sub1_Sub3_7.anInt428 = 0;
				this.aClass10_Sub1_Sub3_7.method301(10);
				this.aClass10_Sub1_Sub3_7.method305(local99[0]);
				this.aClass10_Sub1_Sub3_7.method305(local99[1]);
				this.aClass10_Sub1_Sub3_7.method305(local99[2]);
				this.aClass10_Sub1_Sub3_7.method305(local99[3]);
				this.aClass10_Sub1_Sub3_7.method305(signlink.anInt1058);
				this.aClass10_Sub1_Sub3_7.method308(arg0);
				this.aClass10_Sub1_Sub3_7.method308(arg1);
				this.aClass10_Sub1_Sub3_7.method326(this.anInt867, aBigInteger1, aBigInteger2);
				this.aClass10_Sub1_Sub3_6.anInt428 = 0;
				if (arg2) {
					this.aClass10_Sub1_Sub3_6.method301(18);
				} else {
					this.aClass10_Sub1_Sub3_6.method301(16);
				}
				this.aClass10_Sub1_Sub3_6.method301(this.aClass10_Sub1_Sub3_7.anInt428 + 36 + 1 + 1 + 2);
				this.aClass10_Sub1_Sub3_6.method301(255);
				this.aClass10_Sub1_Sub3_6.method302(377);
				this.aClass10_Sub1_Sub3_6.method301(aBoolean223 ? 1 : 0);
				for (local226 = 0; local226 < 9; local226++) {
					this.aClass10_Sub1_Sub3_6.method305(this.anIntArray212[local226]);
				}
				this.aClass10_Sub1_Sub3_6.method309(this.aClass10_Sub1_Sub3_7.aByteArray12, this.aClass10_Sub1_Sub3_7.anInt428);
				this.aClass10_Sub1_Sub3_7.aClass25_1 = new Class25(this.anInt981, local99);
				for (local261 = 0; local261 < 4; local261++) {
					local99[local261] += 50;
				}
				this.aClass25_2 = new Class25(this.anInt981, local99);
				this.aClass18_1.method120(this.aClass10_Sub1_Sub3_6.anInt428, this.aClass10_Sub1_Sub3_6.aByteArray12);
				local74 = this.aClass18_1.method117();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(304) Exception local304) {
				}
				this.method654(arg0, arg1, arg2);
			} else {
				@Pc(392) int local392;
				if (local74 == 2) {
					this.anInt842 = this.aClass18_1.method117();
					aBoolean228 = this.aClass18_1.method117() == 1;
					this.aLong29 = 0L;
					this.anInt1035 = 0;
					this.aClass7_1.anInt54 = 0;
					super.aBoolean215 = true;
					this.aBoolean262 = true;
					this.aBoolean244 = true;
					this.aClass10_Sub1_Sub3_7.anInt428 = 0;
					this.aClass10_Sub1_Sub3_9.anInt428 = 0;
					this.anInt844 = -1;
					this.anInt860 = -1;
					this.anInt861 = -1;
					this.anInt862 = -1;
					this.anInt843 = 0;
					this.anInt845 = 0;
					this.anInt929 = 0;
					this.anInt847 = 0;
					this.anInt986 = 0;
					this.anInt984 = 0;
					this.aBoolean237 = false;
					super.anInt814 = 0;
					for (local392 = 0; local392 < 100; local392++) {
						this.aStringArray14[local392] = null;
					}
					this.anInt965 = 0;
					this.anInt978 = 0;
					this.anInt933 = 0;
					this.anInt913 = 0;
					this.anInt835 = (int) (Math.random() * 100.0D) - 50;
					this.anInt900 = (int) (Math.random() * 110.0D) - 55;
					this.anInt1016 = (int) (Math.random() * 80.0D) - 40;
					this.anInt864 = (int) (Math.random() * 120.0D) - 60;
					this.anInt1003 = (int) (Math.random() * 30.0D) - 20;
					this.anInt1013 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt923 = 0;
					this.anInt1026 = -1;
					this.anInt955 = 0;
					this.anInt956 = 0;
					this.anInt884 = 0;
					this.anInt960 = 0;
					for (local226 = 0; local226 < this.anInt882; local226++) {
						this.aClass10_Sub1_Sub2_Sub3_Sub2Array1[local226] = null;
						this.aClass10_Sub1_Sub3Array1[local226] = null;
					}
					for (local261 = 0; local261 < 16384; local261++) {
						this.aClass10_Sub1_Sub2_Sub3_Sub1Array1[local261] = null;
					}
					aClass10_Sub1_Sub2_Sub3_Sub2_1 = this.aClass10_Sub1_Sub2_Sub3_Sub2Array1[this.anInt883] = new Class10_Sub1_Sub2_Sub3_Sub2();
					this.aClass6_12.method10();
					this.aClass6_10.method10();
					@Pc(537) int local537;
					@Pc(541) int local541;
					for (@Pc(533) int local533 = 0; local533 < 4; local533++) {
						for (local537 = 0; local537 < 104; local537++) {
							for (local541 = 0; local541 < 104; local541++) {
								this.aClass6ArrayArrayArray1[local533][local537][local541] = null;
							}
						}
					}
					this.aClass6_11 = new Class6(true);
					this.anInt839 = 0;
					this.anInt838 = 0;
					this.method619(aBoolean249, this.anInt985);
					this.anInt985 = -1;
					this.method619(aBoolean249, this.anInt888);
					this.anInt888 = -1;
					this.method619(aBoolean249, this.anInt976);
					this.anInt976 = -1;
					this.method619(aBoolean249, this.anInt926);
					this.anInt926 = -1;
					this.method619(aBoolean249, this.anInt880);
					this.anInt880 = -1;
					this.method619(aBoolean249, this.anInt941);
					this.anInt941 = -1;
					this.method619(aBoolean249, this.anInt1027);
					this.anInt1027 = -1;
					this.aBoolean254 = false;
					this.anInt1031 = 3;
					this.anInt1010 = 0;
					this.aBoolean237 = false;
					this.aBoolean216 = false;
					this.aString26 = null;
					this.anInt1047 = 0;
					this.anInt988 = -1;
					this.aBoolean245 = true;
					this.method600(this.anInt905);
					for (local537 = 0; local537 < 5; local537++) {
						this.anIntArray252[local537] = 0;
					}
					for (local541 = 0; local541 < 5; local541++) {
						this.aStringArray11[local541] = null;
						this.aBooleanArray12[local541] = false;
					}
					anInt944 = 0;
					anInt974 = 0;
					anInt1005 = 0;
					anInt925 = 0;
					anInt963 = 0;
					this.method697();
				} else if (local74 == 3) {
					this.aString21 = "";
					this.aString22 = "Invalid username or password.";
				} else if (local74 == 4) {
					this.aString21 = "Your account has been disabled.";
					this.aString22 = "Please check your message-centre for details.";
				} else if (local74 == 5) {
					this.aString21 = "Your account is already logged in.";
					this.aString22 = "Try again in 60 secs...";
				} else if (local74 == 6) {
					this.aString21 = "RuneScape has been updated!";
					this.aString22 = "Please reload this page.";
				} else if (local74 == 7) {
					this.aString21 = "This world is full.";
					this.aString22 = "Please use a different world.";
				} else if (local74 == 8) {
					this.aString21 = "Unable to connect.";
					this.aString22 = "Login server offline.";
				} else if (local74 == 9) {
					this.aString21 = "Login limit exceeded.";
					this.aString22 = "Too many connections from your address.";
				} else if (local74 == 10) {
					this.aString21 = "Unable to connect.";
					this.aString22 = "Bad session id.";
				} else if (local74 == 12) {
					this.aString21 = "You need a members account to login to this world.";
					this.aString22 = "Please subscribe, or use a different world.";
				} else if (local74 == 13) {
					this.aString21 = "Could not complete login.";
					this.aString22 = "Please try using a different world.";
				} else if (local74 == 14) {
					this.aString21 = "The server is being updated.";
					this.aString22 = "Please wait 1 minute and try again.";
				} else if (local74 == 15) {
					this.aBoolean244 = true;
					this.aClass10_Sub1_Sub3_7.anInt428 = 0;
					this.aClass10_Sub1_Sub3_9.anInt428 = 0;
					this.anInt844 = -1;
					this.anInt860 = -1;
					this.anInt861 = -1;
					this.anInt862 = -1;
					this.anInt843 = 0;
					this.anInt845 = 0;
					this.anInt929 = 0;
					this.anInt984 = 0;
					this.aBoolean237 = false;
					this.aLong32 = System.currentTimeMillis();
				} else if (local74 == 16) {
					this.aString21 = "Login attempts exceeded.";
					this.aString22 = "Please wait 1 minute and try again.";
				} else if (local74 == 17) {
					this.aString21 = "You are standing in a members-only area.";
					this.aString22 = "To play on this world move to a free area first";
				} else if (local74 == 18) {
					this.aString21 = "Account locked as we suspect it has been stolen.";
					this.aString22 = "Press 'recover a locked account' on front page.";
				} else if (local74 == 20) {
					this.aString21 = "Invalid loginserver requested";
					this.aString22 = "Please try using a different world.";
				} else if (local74 == 21) {
					local392 = this.aClass18_1.method117();
					for (@Pc(921) int local921 = local392 + 3; local921 >= 0; local921--) {
						this.aString21 = "You have only just left another world";
						this.aString22 = "Your profile will be transferred in: " + local921;
						this.method706(true);
						try {
							Thread.sleep(1200L);
						} catch (@Pc(943) Exception local943) {
						}
					}
					this.method654(arg0, arg1, arg2);
				} else if (local74 == 22) {
					this.aString21 = "Malformed login packet.";
					this.aString22 = "Please try again.";
				} else if (local74 == 23) {
					this.aString21 = "No reply from loginserver.";
					this.aString22 = "Please try again.";
				} else if (local74 == 24) {
					this.aString21 = "Error loading your profile.";
					this.aString22 = "Please contact customer support.";
				} else if (local74 == 25) {
					this.aString21 = "Unexpected loginserver response.";
					this.aString22 = "Please try using a different world.";
				} else if (local74 == 26) {
					this.aString21 = "This computers address has been blocked";
					this.aString22 = "as it was used to break our rules";
				} else if (local74 != -1) {
					System.out.println("response:" + local74);
					this.aString21 = "Unexpected server response";
					this.aString22 = "Please try using a different world.";
				} else if (local76 != 0) {
					this.aString21 = "No response from server";
					this.aString22 = "Please try using a different world.";
				} else if (this.anInt833 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(1015) Exception local1015) {
					}
					this.anInt833++;
					this.method654(arg0, arg1, arg2);
				} else {
					this.aString21 = "No response from loginserver";
					this.aString22 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(1058) IOException local1058) {
			this.aString21 = "";
			this.aString22 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)Z")
	private boolean method655(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg2 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass23_1.method220(this.anInt942, arg1, arg0, arg2);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(43) Class48 local43 = Class48.method523(local7);
				@Pc(51) int local51;
				@Pc(54) int local54;
				if (local31 == 0 || local31 == 2) {
					local51 = local43.anInt707;
					local54 = local43.anInt697;
				} else {
					local51 = local43.anInt697;
					local54 = local43.anInt707;
				}
				@Pc(65) int local65 = local43.anInt693;
				if (local31 != 0) {
					local65 = (local65 << local31 & 0xF) + (local65 >> 4 - local31);
				}
				this.method610(true, arg0, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0], local51, local54, 2, 0, arg1, local65, 0, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0]);
			} else {
				this.method610(true, arg0, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0], 0, 0, 2, local25 + 1, arg1, 0, local31, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0]);
			}
			this.anInt906 = super.anInt822;
			this.anInt907 = super.anInt823;
			this.anInt909 = 2;
			this.anInt908 = 0;
			this.anInt843 += 0;
			return true;
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("96069, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method656(@OriginalArg(0) byte arg0) {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray249[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray249[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray250[local54] = (this.anIntArray249[local54 - 1] + this.anIntArray249[local54 + 1] + this.anIntArray249[local54 - 128] + this.anIntArray249[local54 + 128]) / 4;
				}
			}
			this.anInt1008 += 128;
			if (this.anInt1008 > this.anIntArray259.length) {
				this.anInt1008 -= this.anIntArray259.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method658(this.aClass10_Sub1_Sub1_Sub3Array3[local48]);
			}
			@Pc(166) int local166;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local166 = local54 + (local48 << 7);
					@Pc(189) int local189 = this.anIntArray250[local166 + 128] - this.anIntArray259[local166 + this.anInt1008 & this.anIntArray259.length - 1] / 5;
					if (local189 < 0) {
						local189 = 0;
					}
					this.anIntArray249[local166] = local189;
				}
			}
			@Pc(213) boolean local213 = false;
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray258[local54] = this.anIntArray258[local54 + 1];
			}
			this.anIntArray258[255] = (int) (Math.sin((double) anInt1050 / 14.0D) * 16.0D + Math.sin((double) anInt1050 / 15.0D) * 14.0D + Math.sin((double) anInt1050 / 16.0D) * 12.0D);
			if (this.anInt920 > 0) {
				this.anInt920 -= 4;
			}
			if (this.anInt921 > 0) {
				this.anInt921 -= 4;
			}
			if (this.anInt920 == 0 && this.anInt921 == 0) {
				local166 = (int) (Math.random() * 2000.0D);
				if (local166 == 0) {
					this.anInt920 = 1024;
				}
				if (local166 == 1) {
					this.anInt921 = 1024;
					return;
				}
			}
		} catch (@Pc(314) RuntimeException local314) {
			signlink.reporterror("47625, " + arg0 + ", " + local314.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!SLDUQHOR;IIIB)V")
	private void method657(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (this.anInt984 < 400) {
				if (arg0.anIntArray165 != null) {
					arg0 = arg0.method406();
				}
				if (arg0 != null && arg0.aBoolean141) {
					@Pc(29) String local29 = arg0.aString10;
					if (arg0.anInt572 != 0) {
						local29 = local29 + method667(arg0.anInt572, aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt767) + " (level-" + arg0.anInt572 + ")";
					}
					if (this.anInt965 == 1) {
						this.aStringArray12[this.anInt984] = "Use " + this.aString30 + " with @yel@" + local29;
						this.anIntArray233[this.anInt984] = 347;
						this.anIntArray234[this.anInt984] = arg3;
						this.anIntArray231[this.anInt984] = arg2;
						this.anIntArray232[this.anInt984] = arg1;
						this.anInt984++;
					} else if (this.anInt978 != 1) {
						@Pc(167) int local167;
						if (arg0.aStringArray4 != null) {
							for (local167 = 4; local167 >= 0; local167--) {
								if (arg0.aStringArray4[local167] != null && !arg0.aStringArray4[local167].equalsIgnoreCase("attack")) {
									this.aStringArray12[this.anInt984] = arg0.aStringArray4[local167] + " @yel@" + local29;
									if (local167 == 0) {
										this.anIntArray233[this.anInt984] = 318;
									}
									if (local167 == 1) {
										this.anIntArray233[this.anInt984] = 921;
									}
									if (local167 == 2) {
										this.anIntArray233[this.anInt984] = 118;
									}
									if (local167 == 3) {
										this.anIntArray233[this.anInt984] = 553;
									}
									if (local167 == 4) {
										this.anIntArray233[this.anInt984] = 432;
									}
									this.anIntArray234[this.anInt984] = arg3;
									this.anIntArray231[this.anInt984] = arg2;
									this.anIntArray232[this.anInt984] = arg1;
									this.anInt984++;
								}
							}
						}
						if (arg0.aStringArray4 != null) {
							for (local167 = 4; local167 >= 0; local167--) {
								if (arg0.aStringArray4[local167] != null && arg0.aStringArray4[local167].equalsIgnoreCase("attack")) {
									@Pc(291) short local291 = 0;
									if (arg0.anInt572 > aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt767) {
										local291 = 2000;
									}
									this.aStringArray12[this.anInt984] = arg0.aStringArray4[local167] + " @yel@" + local29;
									if (local167 == 0) {
										this.anIntArray233[this.anInt984] = local291 + 318;
									}
									if (local167 == 1) {
										this.anIntArray233[this.anInt984] = local291 + 921;
									}
									if (local167 == 2) {
										this.anIntArray233[this.anInt984] = local291 + 118;
									}
									if (local167 == 3) {
										this.anIntArray233[this.anInt984] = local291 + 553;
									}
									if (local167 == 4) {
										this.anIntArray233[this.anInt984] = local291 + 432;
									}
									this.anIntArray234[this.anInt984] = arg3;
									this.anIntArray231[this.anInt984] = arg2;
									this.anIntArray232[this.anInt984] = arg1;
									this.anInt984++;
								}
							}
						}
						this.aStringArray12[this.anInt984] = "Examine @yel@" + local29;
						this.anIntArray233[this.anInt984] = 1668;
						this.anIntArray234[this.anInt984] = arg3;
						this.anIntArray231[this.anInt984] = arg2;
						this.anIntArray232[this.anInt984] = arg1;
						this.anInt984++;
					} else if ((this.anInt980 & 0x2) == 2) {
						this.aStringArray12[this.anInt984] = this.aString31 + " @yel@" + local29;
						this.anIntArray233[this.anInt984] = 67;
						this.anIntArray234[this.anInt984] = arg3;
						this.anIntArray231[this.anInt984] = arg2;
						this.anIntArray232[this.anInt984] = arg1;
						this.anInt984++;
						return;
					}
				}
			}
		} catch (@Pc(441) RuntimeException local441) {
			signlink.reporterror("57326, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -76 + ", " + local441.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!WRRBQEHV;I)V")
	private void method658(@OriginalArg(0) Class10_Sub1_Sub1_Sub3 arg0) {
		try {
			this.anInt843 += 0;
			for (@Pc(11) int local11 = 0; local11 < this.anIntArray259.length; local11++) {
				this.anIntArray259[local11] = 0;
			}
			@Pc(36) int local36;
			for (@Pc(26) int local26 = 0; local26 < 5000; local26++) {
				local36 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray259[local36] = (int) (Math.random() * 256.0D);
			}
			@Pc(54) int local54;
			@Pc(58) int local58;
			@Pc(66) int local66;
			for (local36 = 0; local36 < 20; local36++) {
				for (local54 = 1; local54 < 255; local54++) {
					for (local58 = 1; local58 < 127; local58++) {
						local66 = local58 + (local54 << 7);
						this.anIntArray260[local66] = (this.anIntArray259[local66 - 1] + this.anIntArray259[local66 + 1] + this.anIntArray259[local66 - 128] + this.anIntArray259[local66 + 128]) / 4;
					}
				}
				@Pc(112) int[] local112 = this.anIntArray259;
				this.anIntArray259 = this.anIntArray260;
				this.anIntArray260 = local112;
			}
			if (arg0 != null) {
				local54 = 0;
				for (local58 = 0; local58 < arg0.anInt653; local58++) {
					for (local66 = 0; local66 < arg0.anInt652; local66++) {
						if (arg0.aByteArray16[local54++] != 0) {
							@Pc(148) int local148 = local66 + arg0.anInt654 + 16;
							@Pc(155) int local155 = local58 + arg0.anInt655 + 16;
							@Pc(161) int local161 = local148 + (local155 << 7);
							this.anIntArray259[local161] = 0;
						}
					}
				}
			}
		} catch (@Pc(178) RuntimeException local178) {
			signlink.reporterror("12993, " + arg0 + ", " + 0 + ", " + local178.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method659() {
		try {
			this.aClass19_18.method130();
			Class10_Sub1_Sub1_Sub4.anIntArray183 = this.anIntArray236;
			this.aClass10_Sub1_Sub1_Sub3_18.method440(0, 0);
			if (this.aBoolean216) {
				this.aClass10_Sub1_Sub1_Sub2_4.method148(239, 452, 40, 0, this.aString19);
				this.aClass10_Sub1_Sub1_Sub2_4.method148(239, 452, 60, 128, this.aString24 + "*");
			} else if (this.anInt1010 == 1) {
				this.aClass10_Sub1_Sub1_Sub2_4.method148(239, 452, 40, 0, "Enter amount:");
				this.aClass10_Sub1_Sub1_Sub2_4.method148(239, 452, 60, 128, this.aString20 + "*");
			} else if (this.anInt1010 == 2) {
				this.aClass10_Sub1_Sub1_Sub2_4.method148(239, 452, 40, 0, "Enter name:");
				this.aClass10_Sub1_Sub1_Sub2_4.method148(239, 452, 60, 128, this.aString20 + "*");
			} else {
				@Pc(125) Class10_Sub1_Sub1_Sub2 local125;
				@Pc(133) int local133;
				@Pc(144) int local144;
				if (this.anInt1010 == 3) {
					if (this.aString20 != this.aString18) {
						this.method589(this.aString20);
						this.aString18 = this.aString20;
					}
					local125 = this.aClass10_Sub1_Sub1_Sub2_3;
					Class10_Sub1_Sub1.method496(0, 0, 77, 463);
					for (local133 = 0; local133 < this.anInt840; local133++) {
						local144 = local133 * 14 + 18 - this.anInt841;
						if (local144 > 0 && local144 < 110) {
							local125.method148(239, 452, local144, 0, this.aStringArray9[local133]);
						}
					}
					Class10_Sub1_Sub1.method495();
					if (this.anInt840 > 5) {
						this.method631(this.anInt841, 463, 77, this.anInt840 * 14 + 7, 0);
					}
					if (this.aString20.length() == 0) {
						this.aClass10_Sub1_Sub1_Sub2_4.method148(239, 452, 40, 255, "Enter object name");
					} else if (this.anInt840 == 0) {
						this.aClass10_Sub1_Sub1_Sub2_4.method148(239, 452, 40, 0, "No matching objects found, please shorten search");
					}
					local125.method148(239, 452, 90, 0, this.aString20 + "*");
					Class10_Sub1_Sub1.method502(0, 0, 77, 479);
				} else if (this.aString26 != null) {
					this.aClass10_Sub1_Sub1_Sub2_4.method148(239, 452, 40, 0, this.aString26);
					this.aClass10_Sub1_Sub1_Sub2_4.method148(239, 452, 60, 128, "Click to continue");
				} else if (this.anInt888 != -1) {
					this.method717(0, 0, Class14.method87(this.anInt888), 0);
				} else if (this.anInt985 == -1) {
					local125 = this.aClass10_Sub1_Sub1_Sub2_3;
					local133 = 0;
					Class10_Sub1_Sub1.method496(0, 0, 77, 463);
					for (local144 = 0; local144 < 100; local144++) {
						if (this.aStringArray14[local144] != null) {
							@Pc(309) int local309 = this.anIntArray270[local144];
							@Pc(318) int local318 = this.anInt834 + 70 - local133 * 14;
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
									local125.method152(4, 0, local318, this.aStringArray14[local144]);
								}
								local133++;
							}
							@Pc(395) int local395;
							if ((local309 == 1 || local309 == 2) && (local309 == 1 || this.anInt899 == 0 || this.anInt899 == 1 && this.method723(local323))) {
								if (local318 > 0 && local318 < 110) {
									local395 = 4;
									if (local325 == 1) {
										this.aClass10_Sub1_Sub1_Sub3Array4[0].method440(local318 - 12, 4);
										local395 += 14;
									}
									if (local325 == 2) {
										this.aClass10_Sub1_Sub1_Sub3Array4[1].method440(local318 - 12, local395);
										local395 += 14;
									}
									local125.method152(local395, 0, local318, local323 + ":");
									local395 += local125.method150(local323) + 8;
									local125.method152(local395, 255, local318, this.aStringArray14[local144]);
								}
								local133++;
							}
							if ((local309 == 3 || local309 == 7) && this.anInt997 == 0 && (local309 == 7 || this.anInt853 == 0 || this.anInt853 == 1 && this.method723(local323))) {
								if (local318 > 0 && local318 < 110) {
									local125.method152(4, 0, local318, "From");
									local395 = local125.method150("From ") + 4;
									if (local325 == 1) {
										this.aClass10_Sub1_Sub1_Sub3Array4[0].method440(local318 - 12, local395);
										local395 += 14;
									}
									if (local325 == 2) {
										this.aClass10_Sub1_Sub1_Sub3Array4[1].method440(local318 - 12, local395);
										local395 += 14;
									}
									local125.method152(local395, 0, local318, local323 + ":");
									local395 += local125.method150(local323) + 8;
									local125.method152(local395, 8388608, local318, this.aStringArray14[local144]);
								}
								local133++;
							}
							if (local309 == 4 && (this.anInt1000 == 0 || this.anInt1000 == 1 && this.method723(local323))) {
								if (local318 > 0 && local318 < 110) {
									local125.method152(4, 8388736, local318, local323 + " " + this.aStringArray14[local144]);
								}
								local133++;
							}
							if (local309 == 5 && this.anInt997 == 0 && this.anInt853 < 2) {
								if (local318 > 0 && local318 < 110) {
									local125.method152(4, 8388608, local318, this.aStringArray14[local144]);
								}
								local133++;
							}
							if (local309 == 6 && this.anInt997 == 0 && this.anInt853 < 2) {
								if (local318 > 0 && local318 < 110) {
									local125.method152(4, 0, local318, "To " + local323 + ":");
									local125.method152(local125.method150("To " + local323) + 12, 8388608, local318, this.aStringArray14[local144]);
								}
								local133++;
							}
							if (local309 == 8 && (this.anInt1000 == 0 || this.anInt1000 == 1 && this.method723(local323))) {
								if (local318 > 0 && local318 < 110) {
									local125.method152(4, 8270336, local318, local323 + " " + this.aStringArray14[local144]);
								}
								local133++;
							}
						}
					}
					Class10_Sub1_Sub1.method495();
					this.anInt947 = local133 * 14 + 7;
					if (this.anInt947 < 78) {
						this.anInt947 = 78;
					}
					this.method631(this.anInt947 - this.anInt834 - 77, 463, 77, this.anInt947, 0);
					@Pc(765) String local765;
					if (aClass10_Sub1_Sub2_Sub3_Sub2_1 == null || aClass10_Sub1_Sub2_Sub3_Sub2_1.aString14 == null) {
						local765 = Class26.method252(this.aString27, (byte) 7);
					} else {
						local765 = aClass10_Sub1_Sub2_Sub3_Sub2_1.aString14;
					}
					local125.method152(4, 0, 90, local765 + ":");
					local125.method152(local125.method150(local765 + ": ") + 6, 255, 90, this.aString29 + "*");
					Class10_Sub1_Sub1.method502(0, 0, 77, 479);
				} else {
					this.method717(0, 0, Class14.method87(this.anInt985), 0);
				}
			}
			if (this.aBoolean237 && this.anInt1039 == 2) {
				this.method703();
			}
			this.aClass19_18.method131(357, 17, super.aGraphics2, this.aBoolean239);
			this.aClass19_17.method130();
			Class10_Sub1_Sub1_Sub4.anIntArray183 = this.anIntArray238;
		} catch (@Pc(852) RuntimeException local852) {
			signlink.reporterror("86402, " + 0 + ", " + local852.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method660() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt884; local3++) {
				if (local3 == -1) {
					local11 = this.anInt883;
				} else {
					local11 = this.anIntArray229[local3];
				}
				@Pc(23) Class10_Sub1_Sub2_Sub3_Sub2 local23 = this.aClass10_Sub1_Sub2_Sub3_Sub2Array1[local11];
				if (local23 != null && local23.anInt715 > 0) {
					local23.anInt715--;
					if (local23.anInt715 == 0) {
						local23.aString13 = null;
					}
				}
			}
			this.anInt843 += 0;
			for (local11 = 0; local11 < this.anInt960; local11++) {
				@Pc(60) int local60 = this.anIntArray256[local11];
				@Pc(65) Class10_Sub1_Sub2_Sub3_Sub1 local65 = this.aClass10_Sub1_Sub2_Sub3_Sub1Array1[local60];
				if (local65 != null && local65.anInt715 > 0) {
					local65.anInt715--;
					if (local65.anInt715 == 0) {
						local65.aString13 = null;
					}
				}
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("72352, " + 0 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method661() {
		try {
			@Pc(3) int local3 = 5;
			this.anIntArray212[8] = 0;
			@Pc(19) int local19 = 0;
			while (this.anIntArray212[8] == 0) {
				@Pc(23) String local23 = "Unknown problem";
				this.method588(20, "Connecting to web server");
				try {
					@Pc(45) DataInputStream local45 = this.method606("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 377);
					@Pc(52) Class10_Sub1_Sub3 local52 = new Class10_Sub1_Sub3(true, new byte[40]);
					local45.readFully(local52.aByteArray12, 0, 40);
					local45.close();
					for (@Pc(62) int local62 = 0; local62 < 9; local62++) {
						this.anIntArray212[local62] = local52.method316();
					}
					@Pc(77) int local77 = local52.method316();
					@Pc(79) int local79 = 1234;
					for (@Pc(81) int local81 = 0; local81 < 9; local81++) {
						local79 = (local79 << 1) + this.anIntArray212[local81];
					}
					if (local77 != local79) {
						local23 = "checksum problem";
						this.anIntArray212[8] = 0;
					}
				} catch (@Pc(108) EOFException local108) {
					local23 = "EOF problem";
					this.anIntArray212[8] = 0;
				} catch (@Pc(117) IOException local117) {
					local23 = "connection problem";
					this.anIntArray212[8] = 0;
				} catch (@Pc(126) Exception local126) {
					local23 = "logic problem";
					this.anIntArray212[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray212[8] == 0) {
					local19++;
					for (@Pc(144) int local144 = local3; local144 > 0; local144--) {
						if (local19 >= 10) {
							this.method588(10, "Game updated - please reload page");
							local144 = 10;
						} else {
							this.method588(10, local23 + " - Will retry in " + local144 + " secs.");
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
					this.aBoolean219 = !this.aBoolean219;
				}
			}
		} catch (@Pc(206) RuntimeException local206) {
			signlink.reporterror("76789, " + false + ", " + local206.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method662(@OriginalArg(0) int arg0) {
		try {
			this.aClass19_16.method130();
			@Pc(18) int local18;
			@Pc(20) int local20;
			if (this.anInt923 == 2) {
				@Pc(13) byte[] local13 = this.aClass10_Sub1_Sub1_Sub3_17.aByteArray16;
				@Pc(15) int[] local15 = Class10_Sub1_Sub1.anIntArray178;
				local18 = local13.length;
				for (local20 = 0; local20 < local18; local20++) {
					if (local13[local20] == 0) {
						local15[local20] = 0;
					}
				}
				this.aClass10_Sub1_Sub1_Sub1_10.method82(0, 567, 33, 25, 33, this.anIntArray267, 0, this.anInt1013, 256, this.anIntArray261, 25);
				this.aClass19_17.method130();
				Class10_Sub1_Sub1_Sub4.anIntArray183 = this.anIntArray238;
			} else {
				@Pc(67) int local67 = this.anInt1013 + this.anInt864 & 0x7FF;
				@Pc(74) int local74 = aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt739 / 32 + 48;
				@Pc(78) boolean local78 = false;
				local18 = 464 - aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt740 / 32;
				this.aClass10_Sub1_Sub1_Sub1_11.method82(5, 567, 151, local74, 146, this.anIntArray220, 25, local67, this.anInt1003 + 256, this.anIntArray241, local18);
				this.aClass10_Sub1_Sub1_Sub1_10.method82(0, 567, 33, 25, 33, this.anIntArray267, 0, this.anInt1013, 256, this.anIntArray261, 25);
				for (local20 = 0; local20 < this.anInt936; local20++) {
					local74 = this.anIntArray246[local20] * 4 + 2 - aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt739 / 32;
					local18 = this.anIntArray247[local20] * 4 + 2 - aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt740 / 32;
					this.method705(local18, this.aClass10_Sub1_Sub1_Sub1Array9[local20], local74);
				}
				@Pc(173) int local173;
				for (@Pc(169) int local169 = 0; local169 < 104; local169++) {
					for (local173 = 0; local173 < 104; local173++) {
						@Pc(185) Class6 local185 = this.aClass6ArrayArrayArray1[this.anInt942][local169][local173];
						if (local185 != null) {
							local74 = local169 * 4 + 2 - aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt739 / 32;
							local18 = local173 * 4 + 2 - aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt740 / 32;
							this.method705(local18, this.aClass10_Sub1_Sub1_Sub1_12, local74);
						}
					}
				}
				for (local173 = 0; local173 < this.anInt960; local173++) {
					@Pc(236) Class10_Sub1_Sub2_Sub3_Sub1 local236 = this.aClass10_Sub1_Sub2_Sub3_Sub1Array1[this.anIntArray256[local173]];
					if (local236 != null && local236.method539()) {
						@Pc(245) Class38 local245 = local236.aClass38_1;
						if (local245.anIntArray165 != null) {
							local245 = local245.method406();
						}
						if (local245 != null && local245.aBoolean142 && local245.aBoolean141) {
							local74 = local236.anInt739 / 32 - aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt739 / 32;
							local18 = local236.anInt740 / 32 - aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt740 / 32;
							this.method705(local18, this.aClass10_Sub1_Sub1_Sub1_13, local74);
						}
					}
				}
				@Pc(304) Class10_Sub1_Sub2_Sub3_Sub2 local304;
				for (@Pc(294) int local294 = 0; local294 < this.anInt884; local294++) {
					local304 = this.aClass10_Sub1_Sub2_Sub3_Sub2Array1[this.anIntArray229[local294]];
					if (local304 != null && local304.method539()) {
						local74 = local304.anInt739 / 32 - aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt739 / 32;
						local18 = local304.anInt740 / 32 - aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt740 / 32;
						@Pc(332) boolean local332 = false;
						@Pc(336) long local336 = Class26.method248(local304.aString14);
						for (@Pc(338) int local338 = 0; local338 < this.anInt838; local338++) {
							if (local336 == this.aLongArray4[local338] && this.anIntArray265[local338] != 0) {
								local332 = true;
								break;
							}
						}
						@Pc(363) boolean local363 = false;
						if (aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt773 != 0 && local304.anInt773 != 0 && aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt773 == local304.anInt773) {
							local363 = true;
						}
						if (local332) {
							this.method705(local18, this.aClass10_Sub1_Sub1_Sub1_15, local74);
						} else if (local363) {
							this.method705(local18, this.aClass10_Sub1_Sub1_Sub1_16, local74);
						} else {
							this.method705(local18, this.aClass10_Sub1_Sub1_Sub1_14, local74);
						}
					}
				}
				if (this.anInt986 != 0 && anInt1050 % 20 < 10) {
					if (this.anInt986 == 1 && this.anInt999 >= 0 && this.anInt999 < this.aClass10_Sub1_Sub2_Sub3_Sub1Array1.length) {
						@Pc(437) Class10_Sub1_Sub2_Sub3_Sub1 local437 = this.aClass10_Sub1_Sub2_Sub3_Sub1Array1[this.anInt999];
						if (local437 != null) {
							local74 = local437.anInt739 / 32 - aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt739 / 32;
							local18 = local437.anInt740 / 32 - aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt740 / 32;
							this.method630(local18, this.aClass10_Sub1_Sub1_Sub1_6, local74);
						}
					}
					if (this.anInt986 == 2) {
						local74 = (this.anInt828 - this.anInt914) * 4 + 2 - aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt739 / 32;
						local18 = (this.anInt829 - this.anInt915) * 4 + 2 - aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt740 / 32;
						this.method630(local18, this.aClass10_Sub1_Sub1_Sub1_6, local74);
					}
					if (this.anInt986 == 10 && this.anInt969 >= 0 && this.anInt969 < this.aClass10_Sub1_Sub2_Sub3_Sub2Array1.length) {
						local304 = this.aClass10_Sub1_Sub2_Sub3_Sub2Array1[this.anInt969];
						if (local304 != null) {
							local74 = local304.anInt739 / 32 - aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt739 / 32;
							local18 = local304.anInt740 / 32 - aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt740 / 32;
							this.method630(local18, this.aClass10_Sub1_Sub1_Sub1_6, local74);
						}
					}
				}
				if (this.anInt955 != 0) {
					local74 = this.anInt955 * 4 + 2 - aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt739 / 32;
					local18 = this.anInt956 * 4 + 2 - aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt740 / 32;
					this.method705(local18, this.aClass10_Sub1_Sub1_Sub1_5, local74);
				}
				Class10_Sub1_Sub1.method499(3, 78, 16777215, 3, 97);
				this.aClass19_17.method130();
				Class10_Sub1_Sub1_Sub4.anIntArray183 = this.anIntArray238;
			}
		} catch (@Pc(605) RuntimeException local605) {
			signlink.reporterror("5267, " + arg0 + ", " + local605.toString());
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
				return new URL("http://127.0.0.1:" + (anInt869 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIB)Z")
	private boolean method663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(6) Class14 local6 = Class14.method87(arg1);
			for (@Pc(8) int local8 = 0; local8 < local6.anIntArray43.length && local6.anIntArray43[local8] != -1; local8++) {
				@Pc(22) Class14 local22 = Class14.method87(local6.anIntArray43[local8]);
				if (local22.anInt120 == 0) {
					local3 |= this.method663(arg0, local22.anInt111, (byte) 5);
				}
				@Pc(56) int local56;
				if (local22.anInt120 == 6 && (local22.anInt148 != -1 || local22.anInt149 != -1)) {
					@Pc(51) boolean local51 = this.method670(local22);
					if (local51) {
						local56 = local22.anInt149;
					} else {
						local56 = local22.anInt148;
					}
					if (local56 != -1) {
						@Pc(68) Class15 local68 = Class15.aClass15Array1[local56];
						local22.anInt116 += arg0;
						while (local22.anInt116 > local68.method97(local22.anInt119)) {
							local22.anInt116 -= local68.method97(local22.anInt119);
							local22.anInt119++;
							if (local22.anInt119 >= local68.anInt152) {
								local22.anInt119 -= local68.anInt153;
								if (local22.anInt119 < 0 || local22.anInt119 >= local68.anInt152) {
									local22.anInt119 = 0;
								}
							}
							local3 = true;
						}
					}
				}
				if (local22.anInt120 == 6 && local22.anInt112 != 0) {
					@Pc(137) int local137 = local22.anInt112 >> 16;
					local56 = local22.anInt112 << 16 >> 16;
					@Pc(148) int local148 = local137 * arg0;
					local56 *= arg0;
					local22.anInt130 = local22.anInt130 + local148 & 0x7FF;
					local22.anInt131 = local22.anInt131 + local56 & 0x7FF;
					local3 = true;
				}
			}
			@Pc(181) boolean local181 = false;
			return local3;
		} catch (@Pc(189) RuntimeException local189) {
			signlink.reporterror("87155, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local189.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)Ljava/lang/String;")
	private String method664(@OriginalArg(0) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("89286, " + arg0 + ", " + 8 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method665(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg0 != -916) {
				this.anInt844 = this.aClass10_Sub1_Sub3_9.method311();
			}
			if (arg1 != 0L) {
				if (this.anInt837 >= 100) {
					this.method622("", "Your ignore list is full. Max of 100 hit", 0);
				} else {
					@Pc(31) String local31 = Class26.method252(Class26.method249(arg1), (byte) 7);
					for (@Pc(33) int local33 = 0; local33 < this.anInt837; local33++) {
						if (this.aLongArray3[local33] == arg1) {
							this.method622("", local31 + " is already on your ignore list", 0);
							return;
						}
					}
					for (@Pc(63) int local63 = 0; local63 < this.anInt838; local63++) {
						if (this.aLongArray4[local63] == arg1) {
							this.method622("", "Please remove " + local31 + " from your friend list first", 0);
							return;
						}
					}
					this.aLongArray3[this.anInt837++] = arg1;
					this.aBoolean248 = true;
					this.aClass10_Sub1_Sub3_7.method300(217);
					this.aClass10_Sub1_Sub3_7.method307(arg1);
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("27939, " + arg0 + ", " + arg1 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method582() {
		try {
			if (!this.aBoolean232 && !this.aBoolean264 && !this.aBoolean240) {
				anInt1050++;
				if (this.aBoolean244) {
					this.method603();
				} else {
					this.method724();
				}
				this.method652();
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("76962, " + -111 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method666() {
		try {
			if (this.anInt950 == 0) {
				this.aStringArray12[0] = "Cancel";
				this.anIntArray233[0] = 1016;
				this.anInt984 = 1;
				if (this.anInt926 == -1) {
					this.method686(this.anInt982);
					this.anInt863 = 0;
					this.anInt1045 = 0;
					if (super.anInt816 > 4 && super.anInt817 > 4 && super.anInt816 < 516 && super.anInt817 < 338) {
						if (this.anInt976 == -1) {
							this.method618();
						} else {
							this.method641(4, Class14.method87(this.anInt976), 0, 0, 4, super.anInt816, super.anInt817);
						}
					}
					if (this.anInt863 != this.anInt1037) {
						this.anInt1037 = this.anInt863;
					}
					if (this.anInt1045 != this.anInt959) {
						this.anInt959 = this.anInt1045;
					}
					this.anInt863 = 0;
					this.anInt1045 = 0;
					if (super.anInt816 > 553 && super.anInt817 > 205 && super.anInt816 < 743 && super.anInt817 < 466) {
						if (this.anInt941 != -1) {
							this.method641(205, Class14.method87(this.anInt941), 1, 0, 553, super.anInt816, super.anInt817);
						} else if (this.anIntArray248[this.anInt1031] != -1) {
							this.method641(205, Class14.method87(this.anIntArray248[this.anInt1031]), 1, 0, 553, super.anInt816, super.anInt817);
						}
					}
					if (this.anInt863 != this.anInt1028) {
						this.aBoolean248 = true;
						this.anInt1028 = this.anInt863;
					}
					if (this.anInt1045 != this.anInt918) {
						this.aBoolean248 = true;
						this.anInt918 = this.anInt1045;
					}
					this.anInt863 = 0;
					this.anInt1045 = 0;
					if (super.anInt816 > 17 && super.anInt817 > 357 && super.anInt816 < 496 && super.anInt817 < 453) {
						if (this.anInt888 != -1) {
							this.method641(357, Class14.method87(this.anInt888), 2, 0, 17, super.anInt816, super.anInt817);
						} else if (this.anInt985 != -1) {
							this.method641(357, Class14.method87(this.anInt985), 3, 0, 17, super.anInt816, super.anInt817);
						} else if (super.anInt817 < 434 && super.anInt816 < 426 && this.anInt1010 == 0) {
							this.method688(466, super.anInt816 - 17, super.anInt817 - 357);
						}
					}
					if ((this.anInt888 != -1 || this.anInt985 != -1) && this.anInt863 != this.anInt946) {
						this.aBoolean255 = true;
						this.anInt946 = this.anInt863;
					}
					if ((this.anInt888 != -1 || this.anInt985 != -1) && this.anInt1045 != this.anInt1030) {
						this.aBoolean255 = true;
						this.anInt1030 = this.anInt1045;
					}
					@Pc(351) boolean local351 = false;
					while (!local351) {
						local351 = true;
						for (@Pc(357) int local357 = 0; local357 < this.anInt984 - 1; local357++) {
							if (this.anIntArray233[local357] < 1000 && this.anIntArray233[local357 + 1] > 1000) {
								@Pc(378) String local378 = this.aStringArray12[local357];
								this.aStringArray12[local357] = this.aStringArray12[local357 + 1];
								this.aStringArray12[local357 + 1] = local378;
								@Pc(400) int local400 = this.anIntArray233[local357];
								this.anIntArray233[local357] = this.anIntArray233[local357 + 1];
								this.anIntArray233[local357 + 1] = local400;
								@Pc(422) int local422 = this.anIntArray231[local357];
								this.anIntArray231[local357] = this.anIntArray231[local357 + 1];
								this.anIntArray231[local357 + 1] = local422;
								@Pc(444) int local444 = this.anIntArray232[local357];
								this.anIntArray232[local357] = this.anIntArray232[local357 + 1];
								this.anIntArray232[local357 + 1] = local444;
								@Pc(466) int local466 = this.anIntArray234[local357];
								this.anIntArray234[local357] = this.anIntArray234[local357 + 1];
								this.anIntArray234[local357 + 1] = local466;
								local351 = false;
							}
						}
					}
				} else {
					this.anInt863 = 0;
					this.anInt1045 = 0;
					this.method641(0, Class14.method87(this.anInt926), 0, 0, 0, super.anInt816, super.anInt817);
					if (this.anInt863 != this.anInt1037) {
						this.anInt1037 = this.anInt863;
					}
					if (this.anInt1045 != this.anInt959) {
						this.anInt959 = this.anInt1045;
					}
				}
			}
		} catch (@Pc(496) RuntimeException local496) {
			signlink.reporterror("34424, " + -521 + ", " + local496.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method668(@OriginalArg(0) int arg0) {
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
				this.anInt1026 = -1;
				this.aClass6_10.method10();
				this.aClass6_12.method10();
				Class10_Sub1_Sub1_Sub4.method509();
				this.method624();
				this.aClass23_1.method190();
				System.gc();
				for (local22 = 0; local22 < 4; local22++) {
					this.aClass47Array1[local22].method480();
				}
				for (local35 = 0; local35 < 4; local35++) {
					for (local39 = 0; local39 < 104; local39++) {
						for (local43 = 0; local43 < 104; local43++) {
							this.aByteArrayArrayArray8[local35][local39][local43] = 0;
						}
					}
				}
				@Pc(77) Class8 local77 = new Class8(this.anIntArrayArrayArray8, 14290, this.aByteArrayArrayArray8, 104, 104);
				local43 = this.aByteArrayArray5.length;
				this.aClass10_Sub1_Sub3_7.method300(40);
				@Pc(238) int local238;
				@Pc(226) int local226;
				if (!this.aBoolean247) {
					@Pc(122) byte[] local122;
					for (local91 = 0; local91 < local43; local91++) {
						local105 = (this.anIntArray216[local91] >> 8) * 64 - this.anInt914;
						local117 = (this.anIntArray216[local91] & 0xFF) * 64 - this.anInt915;
						local122 = this.aByteArrayArray5[local91];
						if (local122 != null) {
							local77.method22(local117, (this.anInt855 - 6) * 8, local105, local122, (this.anInt854 - 6) * 8, this.aClass47Array1);
						}
					}
					for (local105 = 0; local105 < local43; local105++) {
						local117 = (this.anIntArray216[local105] >> 8) * 64 - this.anInt914;
						local176 = (this.anIntArray216[local105] & 0xFF) * 64 - this.anInt915;
						@Pc(181) byte[] local181 = this.aByteArrayArray5[local105];
						if (local181 == null && this.anInt855 < 800) {
							local77.method28(local117, local176, 64, 64);
						}
					}
					this.aClass10_Sub1_Sub3_7.method300(40);
					for (local117 = 0; local117 < local43; local117++) {
						local122 = this.aByteArrayArray6[local117];
						if (local122 != null) {
							local226 = (this.anIntArray216[local117] >> 8) * 64 - this.anInt914;
							local238 = (this.anIntArray216[local117] & 0xFF) * 64 - this.anInt915;
							local77.method27(local238, this.aClass47Array1, local226, this.aClass23_1, local122);
						}
					}
				}
				if (this.aBoolean247) {
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
										local77.method28(local105 * 8, local117 * 8, 8, 8);
									}
								}
							}
							this.aClass10_Sub1_Sub3_7.method300(40);
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
											for (@Pc(497) int local497 = 0; local497 < this.anIntArray216.length; local497++) {
												if (this.anIntArray216[local497] == local317 && this.aByteArrayArray6[local497] != null) {
													local77.method20(local117, this.aClass47Array1, this.aClass23_1, this.aByteArrayArray6[local497], local226 * 8, local299, (local305 & 0x7) * 8, local176 * 8, (local315 & 0x7) * 8, local293);
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
									for (local317 = 0; local317 < this.anIntArray216.length; local317++) {
										if (this.anIntArray216[local317] == local315 && this.aByteArrayArray5[local317] != null) {
											local77.method16(local293, (local305 & 0x7) * 8, this.aByteArrayArray5[local317], local91, local238, local105 * 8, this.aClass47Array1, local117 * 8, (local299 & 0x7) * 8);
											local269 = true;
											break;
										}
									}
								}
								if (!local269) {
									local77.method14(this.anInt934, local91, local117 * 8, local105 * 8);
								}
							}
						}
						local91++;
					}
				}
				this.aClass10_Sub1_Sub3_7.method300(40);
				local77.method15(this.aClass47Array1, this.anInt1046, this.aClass23_1);
				if (this.aClass19_17 != null) {
					this.aClass19_17.method130();
					Class10_Sub1_Sub1_Sub4.anIntArray183 = this.anIntArray238;
				}
				this.aClass10_Sub1_Sub3_7.method300(40);
				local91 = Class8.anInt56;
				if (local91 > this.anInt942) {
					local91 = this.anInt942;
				}
				if (local91 < this.anInt942 - 1) {
					local91 = this.anInt942 - 1;
				}
				if (aBoolean223) {
					this.aClass23_1.method191(Class8.anInt56);
				} else {
					this.aClass23_1.method191(0);
				}
				for (local105 = 0; local105 < 104; local105++) {
					for (local117 = 0; local117 < 104; local117++) {
						this.method601(local105, local117);
					}
				}
				this.method593();
			} catch (@Pc(647) Exception local647) {
			}
			Class48.aClass34_8.method389();
			if (super.aFrame_Sub1_2 != null) {
				this.aClass10_Sub1_Sub3_7.method300(78);
				this.aClass10_Sub1_Sub3_7.method305(1057001181);
			}
			if (aBoolean223 && signlink.aRandomAccessFile3 != null) {
				local22 = this.aClass33_Sub1_1.method569(0);
				for (local35 = 0; local35 < local22; local35++) {
					local39 = this.aClass33_Sub1_1.method554(local35);
					if ((local39 & 0x79) == 0) {
						Class10_Sub1_Sub2_Sub4.method270(local35);
					}
				}
			}
			System.gc();
			Class10_Sub1_Sub1_Sub4.method510();
			this.aClass33_Sub1_1.method565();
			local22 = (this.anInt854 - 6) / 8 - 1;
			local35 = (this.anInt854 + 6) / 8 + 1;
			local39 = (this.anInt855 - 6) / 8 - 1;
			local43 = (this.anInt855 + 6) / 8 + 1;
			@Pc(740) boolean local740 = false;
			if (this.aBoolean238) {
				local22 = 49;
				local35 = 50;
				local39 = 49;
				local43 = 50;
			}
			for (local91 = local22; local91 <= local35; local91++) {
				for (local105 = local39; local105 <= local43; local105++) {
					if (local91 == local22 || local91 == local35 || local105 == local39 || local105 == local43) {
						local117 = this.aClass33_Sub1_1.method573(local91, local105, 0);
						if (local117 != -1) {
							this.aClass33_Sub1_1.method566(local117, 3, this.aByte47);
						}
						local176 = this.aClass33_Sub1_1.method573(local91, local105, 1);
						if (local176 != -1) {
							this.aClass33_Sub1_1.method566(local176, 3, this.aByte47);
						}
					}
				}
			}
		} catch (@Pc(817) RuntimeException local817) {
			signlink.reporterror("1413, " + arg0 + ", " + local817.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIB)V")
	private void method669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg2 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg4 & 0x7FF;
			@Pc(19) int local19 = 0;
			@Pc(21) int local21 = 0;
			@Pc(23) int local23 = arg3;
			@Pc(29) int local29;
			@Pc(33) int local33;
			@Pc(43) int local43;
			if (local5 != 0) {
				local29 = Class10_Sub1_Sub2_Sub4.anIntArray146[local5];
				local33 = Class10_Sub1_Sub2_Sub4.anIntArray147[local5];
				local43 = local33 * 0 - arg3 * local29 >> 16;
				local23 = local29 * 0 + arg3 * local33 >> 16;
				local21 = local43;
			}
			if (local11 != 0) {
				local29 = Class10_Sub1_Sub2_Sub4.anIntArray146[local11];
				local33 = Class10_Sub1_Sub2_Sub4.anIntArray147[local11];
				local43 = local23 * local29 + local33 * 0 >> 16;
				local23 = local23 * local33 - local29 * 0 >> 16;
				local19 = local43;
			}
			this.anInt990 = arg1 - local19;
			this.anInt991 = arg0 - local21;
			this.anInt992 = arg5 - local23;
			this.anInt993 = arg2;
			this.anInt994 = arg4;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("85476, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + -103 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!EWIXBTLV;I)Z")
	private boolean method670(@OriginalArg(0) Class14 arg0) {
		try {
			if (arg0.anIntArray45 == null) {
				return false;
			}
			for (@Pc(11) int local11 = 0; local11 < arg0.anIntArray45.length; local11++) {
				@Pc(19) int local19 = this.method704(local11, arg0);
				@Pc(24) int local24 = arg0.anIntArray42[local11];
				if (arg0.anIntArray45[local11] == 2) {
					if (local19 >= local24) {
						return false;
					}
				} else if (arg0.anIntArray45[local11] == 3) {
					if (local19 <= local24) {
						return false;
					}
				} else if (arg0.anIntArray45[local11] == 4) {
					if (local19 == local24) {
						return false;
					}
				} else if (local19 != local24) {
					return false;
				}
			}
			return true;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("95389, " + arg0 + ", " + -693 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!MFMVIYHT;)V")
	private void method671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class10_Sub1_Sub3 arg2) {
		try {
			this.anInt1034 = 0;
			this.anInt885 = 0;
			this.method616(arg0, this.aBoolean261, arg2);
			this.method689(arg0, arg2);
			@Pc(22) boolean local22 = false;
			this.method591(arg0, (byte) 6, arg2);
			this.method615(808, arg2, arg0);
			@Pc(41) int local41;
			for (@Pc(34) int local34 = 0; local34 < this.anInt1034; local34++) {
				local41 = this.anIntArray269[local34];
				if (this.aClass10_Sub1_Sub2_Sub3_Sub2Array1[local41].anInt718 != anInt1050) {
					this.aClass10_Sub1_Sub2_Sub3_Sub2Array1[local41] = null;
				}
			}
			if (arg2.anInt428 != arg0) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.anInt428 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local41 = 0; local41 < this.anInt884; local41++) {
				if (this.aClass10_Sub1_Sub2_Sub3_Sub2Array1[this.anIntArray229[local41]] == null) {
					signlink.reporterror(this.aString27 + " null entry in pl list - pos:" + local41 + " size:" + this.anInt884);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("88583, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IJ)V")
	private void method672(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg1 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt837; local8++) {
					if (this.aLongArray3[local8] == arg1) {
						this.anInt837--;
						this.aBoolean248 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt837; local28++) {
							this.aLongArray3[local28] = this.aLongArray3[local28 + 1];
						}
						this.aClass10_Sub1_Sub3_7.method300(160);
						this.aClass10_Sub1_Sub3_7.method307(arg1);
						break;
					}
				}
				@Pc(66) boolean local66 = false;
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("45745, " + arg0 + ", " + arg1 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method673(@OriginalArg(0) int arg0) {
		try {
			@Pc(8) int local8;
			if (this.anInt920 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt920 > 768) {
						this.anIntArray271[local8] = this.method681(this.anIntArray272[local8], this.anIntArray273[local8], 1024 - this.anInt920);
					} else if (this.anInt920 > 256) {
						this.anIntArray271[local8] = this.anIntArray273[local8];
					} else {
						this.anIntArray271[local8] = this.method681(this.anIntArray273[local8], this.anIntArray272[local8], 256 - this.anInt920);
					}
				}
			} else if (this.anInt921 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt921 > 768) {
						this.anIntArray271[local8] = this.method681(this.anIntArray272[local8], this.anIntArray274[local8], 1024 - this.anInt921);
					} else if (this.anInt921 > 256) {
						this.anIntArray271[local8] = this.anIntArray274[local8];
					} else {
						this.anIntArray271[local8] = this.method681(this.anIntArray274[local8], this.anIntArray272[local8], 256 - this.anInt921);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray271[local8] = this.anIntArray272[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass19_22.anIntArray56[local8] = this.aClass10_Sub1_Sub1_Sub1_3.anIntArray37[local8];
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
				local198 = this.anIntArray258[local185] * (256 - local185) / 256;
				local202 = local198 + 22;
				if (local202 < 0) {
					local202 = 0;
				}
				local181 += local202;
				for (local212 = local202; local212 < 128; local212++) {
					local220 = this.anIntArray249[local181++];
					if (local220 == 0) {
						local183++;
					} else {
						local224 = local220;
						local228 = 256 - local220;
						local220 = this.anIntArray271[local220];
						local239 = this.aClass19_22.anIntArray56[local183];
						this.aClass19_22.anIntArray56[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			this.aClass19_22.method131(0, 0, super.aGraphics2, this.aBoolean239);
			@Pc(304) boolean local304 = true;
			for (local198 = 0; local198 < 33920; local198++) {
				this.aClass19_23.anIntArray56[local198] = this.aClass10_Sub1_Sub1_Sub1_4.anIntArray37[local198];
			}
			local181 = 0;
			local183 = 1176;
			for (local202 = 1; local202 < 255; local202++) {
				local212 = this.anIntArray258[local202] * (256 - local202) / 256;
				local220 = 103 - local212;
				local183 += local212;
				for (local224 = 0; local224 < local220; local224++) {
					local228 = this.anIntArray249[local181++];
					if (local228 == 0) {
						local183++;
					} else {
						local239 = local228;
						@Pc(367) int local367 = 256 - local228;
						local228 = this.anIntArray271[local228];
						@Pc(378) int local378 = this.aClass19_23.anIntArray56[local183];
						this.aClass19_23.anIntArray56[local183++] = ((local228 & 0xFF00FF) * local239 + (local378 & 0xFF00FF) * local367 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local378 & 0xFF00) * local367 & 0xFF0000) >> 8;
					}
				}
				local181 += 128 - local220;
				local183 += 128 - local220 - local212;
			}
			this.aClass19_23.method131(0, 637, super.aGraphics2, this.aBoolean239);
		} catch (@Pc(451) RuntimeException local451) {
			signlink.reporterror("77236, " + arg0 + ", " + local451.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZBI)V")
	private void method674(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		try {
			signlink.anInt1063 = arg1;
			if (arg0) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("76893, " + arg0 + ", " + 8 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method675() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt884; local3++) {
				if (local3 == -1) {
					local11 = this.anInt883;
				} else {
					local11 = this.anIntArray229[local3];
				}
				@Pc(23) Class10_Sub1_Sub2_Sub3_Sub2 local23 = this.aClass10_Sub1_Sub2_Sub3_Sub2Array1[local11];
				if (local23 != null) {
					this.method643(1, local23);
				}
			}
			if (this.anInt996 > 0 || this.anInt996 < 0) {
				for (local11 = 1; local11 > 0; local11++) {
				}
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("41968, " + 0 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(JI)V")
	private void method677(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt838 >= 100 && this.anInt932 != 1) {
					this.method622("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
				} else if (this.anInt838 >= 200) {
					this.method622("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
				} else {
					@Pc(38) String local38 = Class26.method252(Class26.method249(arg0), (byte) 7);
					for (@Pc(40) int local40 = 0; local40 < this.anInt838; local40++) {
						if (this.aLongArray4[local40] == arg0) {
							this.method622("", local38 + " is already on your friend list", 0);
							return;
						}
					}
					for (@Pc(70) int local70 = 0; local70 < this.anInt837; local70++) {
						if (this.aLongArray3[local70] == arg0) {
							this.method622("", "Please remove " + local38 + " from your ignore list first", 0);
							return;
						}
					}
					if (!local38.equals(aClass10_Sub1_Sub2_Sub3_Sub2_1.aString14)) {
						this.aStringArray8[this.anInt838] = local38;
						this.aLongArray4[this.anInt838] = arg0;
						this.anIntArray265[this.anInt838] = 0;
						this.anInt838++;
						this.aBoolean248 = true;
						this.aClass10_Sub1_Sub3_7.method300(120);
						this.aClass10_Sub1_Sub3_7.method307(arg0);
					}
				}
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("94629, " + arg0 + ", " + -45229 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!EWIXBTLV;)V")
	private void method678(@OriginalArg(0) byte arg0, @OriginalArg(1) Class14 arg1) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(14) int local14 = arg1.anInt124;
			@Pc(70) int local70;
			if ((local14 < 1 || local14 > 100) && (local14 < 701 || local14 > 800)) {
				if (local14 >= 101 && local14 <= 200 || !(local14 < 801 || local14 > 900)) {
					local70 = this.anInt838;
					if (this.anInt839 != 2) {
						local70 = 0;
					}
					if (local14 > 800) {
						local14 -= 701;
					} else {
						local14 -= 101;
					}
					if (local14 >= local70) {
						arg1.aString2 = "";
						arg1.anInt150 = 0;
					} else {
						if (this.anIntArray265[local14] == 0) {
							arg1.aString2 = "@red@Offline";
						} else if (this.anIntArray265[local14] < 200) {
							if (this.anIntArray265[local14] == anInt868) {
								arg1.aString2 = "@gre@World" + (this.anIntArray265[local14] - 9);
							} else {
								arg1.aString2 = "@yel@World" + (this.anIntArray265[local14] - 9);
							}
						} else if (this.anIntArray265[local14] == anInt868) {
							arg1.aString2 = "@gre@Classic" + (this.anIntArray265[local14] - 219);
						} else {
							arg1.aString2 = "@yel@Classic" + (this.anIntArray265[local14] - 219);
						}
						arg1.anInt150 = 1;
					}
				} else if (local14 == 203) {
					local70 = this.anInt838;
					if (this.anInt839 != 2) {
						local70 = 0;
					}
					arg1.anInt147 = local70 * 15 + 20;
					if (arg1.anInt147 <= arg1.anInt121) {
						arg1.anInt147 = arg1.anInt121 + 1;
					}
				} else if (local14 >= 401 && local14 <= 500) {
					local14 -= 401;
					if (local14 == 0 && this.anInt839 == 0) {
						arg1.aString2 = "Loading ignore list";
						arg1.anInt150 = 0;
					} else if (local14 == 1 && this.anInt839 == 0) {
						arg1.aString2 = "Please wait...";
						arg1.anInt150 = 0;
					} else {
						local70 = this.anInt837;
						if (this.anInt839 == 0) {
							local70 = 0;
						}
						if (local14 >= local70) {
							arg1.aString2 = "";
							arg1.anInt150 = 0;
						} else {
							arg1.aString2 = Class26.method252(Class26.method249(this.aLongArray3[local14]), (byte) 7);
							arg1.anInt150 = 1;
						}
					}
				} else if (local14 == 503) {
					arg1.anInt147 = this.anInt837 * 15 + 20;
					if (arg1.anInt147 <= arg1.anInt121) {
						arg1.anInt147 = arg1.anInt121 + 1;
					}
				} else if (local14 == 327) {
					arg1.anInt130 = 150;
					arg1.anInt131 = (int) (Math.sin((double) anInt1050 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean263) {
						for (local70 = 0; local70 < 7; local70++) {
							@Pc(383) int local383 = this.anIntArray276[local70];
							if (local383 >= 0 && !Class49.aClass49Array1[local383].method548(256)) {
								return;
							}
						}
						this.aBoolean263 = false;
						@Pc(402) Class10_Sub1_Sub2_Sub4[] local402 = new Class10_Sub1_Sub2_Sub4[7];
						@Pc(404) int local404 = 0;
						for (@Pc(406) int local406 = 0; local406 < 7; local406++) {
							@Pc(413) int local413 = this.anIntArray276[local406];
							if (local413 >= 0) {
								local402[local404++] = Class49.aClass49Array1[local413].method549();
							}
						}
						@Pc(435) Class10_Sub1_Sub2_Sub4 local435 = new Class10_Sub1_Sub2_Sub4(local404, local402, (byte) -89);
						for (@Pc(437) int local437 = 0; local437 < 5; local437++) {
							if (this.anIntArray252[local437] != 0) {
								local435.method285(anIntArrayArray24[local437][0], anIntArrayArray24[local437][this.anIntArray252[local437]]);
								if (local437 == 1) {
									local435.method285(anIntArray266[0], anIntArray266[this.anIntArray252[local437]]);
								}
							}
						}
						local435.method278();
						local435.method279(Class15.aClass15Array1[aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt760].anIntArray47[0], (byte) 6);
						local435.method288(64, 850, -30, -50, -30, true);
						arg1.anInt145 = 5;
						arg1.anInt146 = 0;
						Class14.method93(local435);
					}
				} else if (local14 == 324) {
					if (this.aClass10_Sub1_Sub1_Sub1_8 == null) {
						this.aClass10_Sub1_Sub1_Sub1_8 = arg1.aClass10_Sub1_Sub1_Sub1_1;
						this.aClass10_Sub1_Sub1_Sub1_9 = arg1.aClass10_Sub1_Sub1_Sub1_2;
					}
					if (this.aBoolean245) {
						arg1.aClass10_Sub1_Sub1_Sub1_1 = this.aClass10_Sub1_Sub1_Sub1_9;
					} else {
						arg1.aClass10_Sub1_Sub1_Sub1_1 = this.aClass10_Sub1_Sub1_Sub1_8;
					}
				} else if (local14 == 325) {
					if (this.aClass10_Sub1_Sub1_Sub1_8 == null) {
						this.aClass10_Sub1_Sub1_Sub1_8 = arg1.aClass10_Sub1_Sub1_Sub1_1;
						this.aClass10_Sub1_Sub1_Sub1_9 = arg1.aClass10_Sub1_Sub1_Sub1_2;
					}
					if (this.aBoolean245) {
						arg1.aClass10_Sub1_Sub1_Sub1_1 = this.aClass10_Sub1_Sub1_Sub1_8;
					} else {
						arg1.aClass10_Sub1_Sub1_Sub1_1 = this.aClass10_Sub1_Sub1_Sub1_9;
					}
				} else if (local14 == 600) {
					arg1.aString2 = this.aString17;
					if (anInt1050 % 20 < 10) {
						arg1.aString2 = arg1.aString2 + "|";
					} else {
						arg1.aString2 = arg1.aString2 + " ";
					}
				} else {
					if (local14 == 620) {
						if (this.anInt842 < 1) {
							arg1.aString2 = "";
						} else if (this.aBoolean241) {
							arg1.anInt122 = 16711680;
							arg1.aString2 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg1.anInt122 = 16777215;
							arg1.aString2 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(642) String local642;
					if (local14 == 660) {
						local70 = this.anInt977 - this.anInt989;
						if (local70 <= 0) {
							local642 = "earlier today";
						} else if (local70 == 1) {
							local642 = "yesterday";
						} else {
							local642 = local70 + " days ago";
						}
						arg1.aString2 = "You last logged in @red@" + local642 + "@bla@ from: @red@" + signlink.dns;
					}
					if (local14 == 661) {
						if (this.anInt912 == 0) {
							arg1.aString2 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
						} else if (this.anInt912 <= this.anInt977) {
							arg1.aString2 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method679(this.anInt912);
						} else {
							local70 = this.anInt977 + 14 - this.anInt912;
							if (local70 <= 0) {
								local642 = "Earlier today";
							} else if (local70 == 1) {
								local642 = "Yesterday";
							} else {
								local642 = local70 + " days ago";
							}
							arg1.aString2 = local642 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method679(this.anInt912) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
						}
					}
					if (local14 == 662) {
						@Pc(760) String local760;
						if (this.anInt1025 == 0) {
							local760 = "@yel@0 unread messages";
						} else if (this.anInt1025 == 1) {
							local760 = "@gre@1 unread message";
						} else {
							local760 = "@gre@" + this.anInt1025 + " unread messages";
						}
						arg1.aString2 = "You have " + local760 + "\\nin your message centre.";
					}
					if (local14 == 663) {
						if (this.anInt939 > 0 && this.anInt939 <= this.anInt977 + 10) {
							arg1.aString2 = "Last password change:\\n@gre@" + this.method679(this.anInt939);
						} else {
							arg1.aString2 = "Last password change:\\n@gre@Never changed";
						}
					}
					if (local14 == 665) {
						if (this.anInt891 > 2 && !aBoolean222) {
							arg1.aString2 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
						} else if (this.anInt891 > 2) {
							arg1.aString2 = "\\n\\nYou have @gre@" + this.anInt891 + "@yel@ days of\\nmember credit remaining.";
						} else if (this.anInt891 > 0) {
							arg1.aString2 = "You have @gre@" + this.anInt891 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
						} else {
							arg1.aString2 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
						}
					}
					if (local14 == 667) {
						if (this.anInt891 > 2 && !aBoolean222) {
							arg1.aString2 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
						} else if (this.anInt891 > 0) {
							arg1.aString2 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
						} else {
							arg1.aString2 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
						}
					}
					if (local14 == 668) {
						if (this.anInt912 > this.anInt977) {
							arg1.aString2 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
						} else {
							arg1.aString2 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
						}
					}
				}
			} else if (local14 == 1 && this.anInt839 == 0) {
				arg1.aString2 = "Loading friend list";
				arg1.anInt150 = 0;
			} else if (local14 == 1 && this.anInt839 == 1) {
				arg1.aString2 = "Connecting to friendserver";
				arg1.anInt150 = 0;
			} else if (local14 == 2 && this.anInt839 != 2) {
				arg1.aString2 = "Please wait...";
				arg1.anInt150 = 0;
			} else {
				local70 = this.anInt838;
				if (this.anInt839 != 2) {
					local70 = 0;
				}
				if (local14 > 700) {
					local14 -= 601;
				} else {
					local14--;
				}
				if (local14 >= local70) {
					arg1.aString2 = "";
					arg1.anInt150 = 0;
				} else {
					arg1.aString2 = this.aStringArray8[local14];
					arg1.anInt150 = 1;
				}
			}
		} catch (@Pc(917) RuntimeException local917) {
			signlink.reporterror("38927, " + arg0 + ", " + arg1 + ", " + local917.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Ljava/lang/String;")
	private String method679(@OriginalArg(0) int arg0) {
		try {
			if (arg0 > this.anInt977 + 10) {
				return "Unknown";
			}
			@Pc(22) long local22 = ((long) arg0 + 11745L) * 86400000L;
			@Pc(24) Calendar local24 = Calendar.getInstance();
			local24.setTime(new Date(local22));
			@Pc(34) int local34 = local24.get(5);
			@Pc(38) int local38 = local24.get(2);
			@Pc(42) int local42 = local24.get(1);
			@Pc(93) String[] local93 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
			return local34 + "-" + local93[local38] + "-" + local42;
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("68481, " + arg0 + ", " + 83 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method680(@OriginalArg(1) int arg0) {
		try {
			this.anInt843 += 0;
			@Pc(10) int local10 = Class44.aClass44Array1[arg0].anInt617;
			if (local10 != 0) {
				@Pc(18) int local18 = this.anIntArray244[arg0];
				if (local10 == 1) {
					if (local18 == 1) {
						Class10_Sub1_Sub1_Sub4.method515(0.9D, (byte) 6);
					}
					if (local18 == 2) {
						Class10_Sub1_Sub1_Sub4.method515(0.8D, (byte) 6);
					}
					if (local18 == 3) {
						Class10_Sub1_Sub1_Sub4.method515(0.7D, (byte) 6);
					}
					if (local18 == 4) {
						Class10_Sub1_Sub1_Sub4.method515(0.6D, (byte) 6);
					}
					Class17.aClass34_4.method389();
					this.aBoolean236 = true;
				}
				if (local10 == 3) {
					@Pc(56) boolean local56 = this.aBoolean259;
					if (local18 == 0) {
						this.method674(this.aBoolean259, 0);
						this.aBoolean259 = true;
					}
					if (local18 == 1) {
						this.method674(this.aBoolean259, -400);
						this.aBoolean259 = true;
					}
					if (local18 == 2) {
						this.method674(this.aBoolean259, -800);
						this.aBoolean259 = true;
					}
					if (local18 == 3) {
						this.method674(this.aBoolean259, -1200);
						this.aBoolean259 = true;
					}
					if (local18 == 4) {
						this.aBoolean259 = false;
					}
					if (this.aBoolean259 != local56 && !aBoolean223) {
						if (this.aBoolean259) {
							this.anInt1023 = this.anInt1051;
							this.aBoolean260 = true;
							this.aClass33_Sub1_1.method558(2, this.anInt1023);
						} else {
							this.method625();
						}
						this.anInt958 = 0;
					}
				}
				if (local10 == 4) {
					if (local18 == 0) {
						this.aBoolean265 = true;
						this.method633(0);
					}
					if (local18 == 1) {
						this.aBoolean265 = true;
						this.method633(-400);
					}
					if (local18 == 2) {
						this.aBoolean265 = true;
						this.method633(-800);
					}
					if (local18 == 3) {
						this.aBoolean265 = true;
						this.method633(-1200);
					}
					if (local18 == 4) {
						this.aBoolean265 = false;
					}
				}
				if (local10 == 5) {
					this.anInt1036 = local18;
				}
				if (local10 == 6) {
					this.anInt897 = local18;
				}
				if (local10 == 8) {
					this.anInt997 = local18;
					this.aBoolean255 = true;
				}
				if (local10 == 9) {
					this.anInt879 = local18;
				}
			}
		} catch (@Pc(216) RuntimeException local216) {
			signlink.reporterror("9652, " + 0 + ", " + arg0 + ", " + local216.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)I")
	private int method681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(13) int local13 = 256 - arg2;
			return ((arg0 & 0xFF00FF) * local13 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * local13 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("31901, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 8 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method682() {
		try {
			this.anInt1011 = 0;
			@Pc(10) int local10 = (aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt739 >> 7) + this.anInt914;
			@Pc(18) int local18 = (aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt740 >> 7) + this.anInt915;
			if (local10 >= 3053 && local10 <= 3156 && local18 >= 3056 && local18 <= 3136) {
				this.anInt1011 = 1;
			}
			if (local10 >= 3072 && local10 <= 3118 && local18 >= 9492 && local18 <= 9535) {
				this.anInt1011 = 1;
			}
			if (this.anInt1011 == 1 && local10 >= 3139 && local10 <= 3199 && local18 >= 3008 && local18 <= 3062) {
				this.anInt1011 = 0;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("98796, " + -7 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method683() {
		try {
			@Pc(7) int local7 = this.aClass10_Sub1_Sub1_Sub2_4.method150("Choose Option");
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt984; local9++) {
				local20 = this.aClass10_Sub1_Sub1_Sub2_4.method150(this.aStringArray12[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			local7 += 8;
			local20 = this.anInt984 * 15 + 21;
			@Pc(71) int local71;
			@Pc(89) int local89;
			if (super.anInt822 > 4 && super.anInt823 > 4 && super.anInt822 < 516 && super.anInt823 < 338) {
				local71 = super.anInt822 - local7 / 2 - 4;
				if (local71 + local7 > 512) {
					local71 = 512 - local7;
				}
				if (local71 < 0) {
					local71 = 0;
				}
				local89 = super.anInt823 - 4;
				if (local89 + local20 > 334) {
					local89 = 334 - local20;
				}
				if (local89 < 0) {
					local89 = 0;
				}
				this.aBoolean237 = true;
				this.anInt1039 = 0;
				this.anInt1040 = local71;
				this.anInt1041 = local89;
				this.anInt1042 = local7;
				this.anInt1043 = this.anInt984 * 15 + 22;
			}
			if (super.anInt822 > 553 && super.anInt823 > 205 && super.anInt822 < 743 && super.anInt823 < 466) {
				local71 = super.anInt822 - local7 / 2 - 553;
				if (local71 < 0) {
					local71 = 0;
				} else if (local71 + local7 > 190) {
					local71 = 190 - local7;
				}
				local89 = super.anInt823 - 205;
				if (local89 < 0) {
					local89 = 0;
				} else if (local89 + local20 > 261) {
					local89 = 261 - local20;
				}
				this.aBoolean237 = true;
				this.anInt1039 = 1;
				this.anInt1040 = local71;
				this.anInt1041 = local89;
				this.anInt1042 = local7;
				this.anInt1043 = this.anInt984 * 15 + 22;
			}
			if (super.anInt822 > 17 && super.anInt823 > 357 && super.anInt822 < 496 && super.anInt823 < 453) {
				local71 = super.anInt822 - local7 / 2 - 17;
				if (local71 < 0) {
					local71 = 0;
				} else if (local71 + local7 > 479) {
					local71 = 479 - local7;
				}
				local89 = super.anInt823 - 357;
				if (local89 < 0) {
					local89 = 0;
				} else if (local89 + local20 > 96) {
					local89 = 96 - local20;
				}
				this.aBoolean237 = true;
				this.anInt1039 = 2;
				this.anInt1040 = local71;
				this.anInt1041 = local89;
				this.anInt1042 = local7;
				this.anInt1043 = this.anInt984 * 15 + 22;
			}
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("27328, " + 811 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method684() {
		try {
			this.method650();
			if (this.anInt909 == 1) {
				this.aClass10_Sub1_Sub1_Sub1Array4[this.anInt908 / 100].method78(this.anInt907 - 8 - 4, this.anInt906 - 8 - 4);
			}
			if (this.anInt909 == 2) {
				this.aClass10_Sub1_Sub1_Sub1Array4[this.anInt908 / 100 + 4].method78(this.anInt907 - 8 - 4, this.anInt906 - 8 - 4);
			}
			if (this.anInt1027 != -1) {
				this.method663(this.anInt878, this.anInt1027, (byte) 5);
				this.method717(0, 0, Class14.method87(this.anInt1027), 0);
			}
			if (this.anInt976 != -1) {
				this.method663(this.anInt878, this.anInt976, (byte) 5);
				this.method717(0, 0, Class14.method87(this.anInt976), 0);
			}
			this.method682();
			if (!this.aBoolean237) {
				this.method666();
				this.method609();
			} else if (this.anInt1039 == 0) {
				this.method703();
			}
			if (this.anInt1047 == 1) {
				this.aClass10_Sub1_Sub1_Sub1_7.method78(296, 472);
			}
			@Pc(176) int local176;
			if (aBoolean217) {
				@Pc(142) byte local142 = 20;
				@Pc(144) int local144 = 16776960;
				if (super.anInt811 < 30 && aBoolean223) {
					local144 = 16711680;
				}
				if (super.anInt811 < 20 && !aBoolean223) {
					local144 = 16711680;
				}
				this.aClass10_Sub1_Sub1_Sub2_3.method147("Fps:" + super.anInt811, local144, 20);
				local176 = local142 + 15;
				@Pc(178) Runtime local178 = Runtime.getRuntime();
				@Pc(187) int local187 = (int) ((local178.totalMemory() - local178.freeMemory()) / 1024L);
				if (local187 > 33554432 && aBoolean223) {
				}
				if (local187 > 67108864 && !aBoolean223) {
				}
				this.aClass10_Sub1_Sub1_Sub2_3.method147("Mem:" + local187 + "k", 16776960, 35);
				local176 += 15;
			}
			if (this.anInt929 != 0) {
				@Pc(228) int local228 = this.anInt929 / 50;
				local176 = local228 / 60;
				@Pc(236) int local236 = local228 % 60;
				if (local236 < 10) {
					this.aClass10_Sub1_Sub1_Sub2_3.method152(4, 16776960, 329, "System update in: " + local176 + ":0" + local236);
				} else {
					this.aClass10_Sub1_Sub1_Sub2_3.method152(4, 16776960, 329, "System update in: " + local176 + ":" + local236);
				}
				anInt858++;
				if (anInt858 > 112) {
					anInt858 = 0;
					this.aClass10_Sub1_Sub3_7.method300(197);
					this.aClass10_Sub1_Sub3_7.method305(0);
					return;
				}
			}
		} catch (@Pc(297) RuntimeException local297) {
			signlink.reporterror("93570, " + 30729 + ", " + local297.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean266) {
			this.method592((byte) 4);
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBI)I")
	private int method685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = arg1 >> 7;
			@Pc(7) int local7 = arg0 >> 7;
			if (local3 < 0 || local7 < 0 || local3 > 103 || local7 > 103) {
				return 0;
			}
			@Pc(21) int local21 = arg2;
			if (arg2 < 3 && (this.aByteArrayArrayArray8[1][local3][local7] & 0x2) == 2) {
				local21 = arg2 + 1;
			}
			@Pc(41) int local41 = arg1 & 0x7F;
			@Pc(45) int local45 = arg0 & 0x7F;
			@Pc(84) int local84 = this.anIntArrayArrayArray8[local21][local3][local7] * (128 - local41) + this.anIntArrayArrayArray8[local21][local3 + 1][local7] * local41 >> 7;
			@Pc(116) int local116 = this.anIntArrayArrayArray8[local21][local3][local7 + 1] * (128 - local41) + this.anIntArrayArrayArray8[local21][local3 + 1][local7 + 1] * local41 >> 7;
			return local84 * (128 - local45) + local116 * local45 >> 7;
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("46343, " + arg0 + ", " + arg1 + ", " + 9 + ", " + arg2 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method686(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = 21 / arg0;
			if (this.anInt997 != 0) {
				@Pc(9) int local9 = 0;
				if (this.anInt929 != 0) {
					local9 = 1;
				}
				for (@Pc(16) int local16 = 0; local16 < 100; local16++) {
					if (this.aStringArray14[local16] != null) {
						@Pc(28) int local28 = this.anIntArray270[local16];
						@Pc(33) String local33 = this.aStringArray13[local16];
						if (local33 != null && local33.startsWith("@cr1@")) {
							local33 = local33.substring(5);
						}
						if (local33 != null && local33.startsWith("@cr2@")) {
							local33 = local33.substring(5);
						}
						if ((local28 == 3 || local28 == 7) && (local28 == 7 || this.anInt853 == 0 || this.anInt853 == 1 && this.method723(local33))) {
							@Pc(86) int local86 = 329 - local9 * 13;
							if (super.anInt816 > 4 && super.anInt817 - 4 > local86 - 10 && super.anInt817 - 4 <= local86 + 3) {
								@Pc(125) int local125 = this.aClass10_Sub1_Sub1_Sub2_3.method150("From:  " + local33 + this.aStringArray14[local16]) + 25;
								if (local125 > 450) {
									local125 = 450;
								}
								if (super.anInt816 < local125 + 4) {
									if (this.anInt842 >= 1) {
										this.aStringArray12[this.anInt984] = "Report abuse @whi@" + local33;
										this.anIntArray233[this.anInt984] = 2507;
										this.anInt984++;
									}
									this.aStringArray12[this.anInt984] = "Add ignore @whi@" + local33;
									this.anIntArray233[this.anInt984] = 2574;
									this.anInt984++;
									this.aStringArray12[this.anInt984] = "Add friend @whi@" + local33;
									this.anIntArray233[this.anInt984] = 2762;
									this.anInt984++;
								}
							}
							local9++;
							if (local9 >= 5) {
								return;
							}
						}
						if ((local28 == 5 || local28 == 6) && this.anInt853 < 2) {
							local9++;
							if (local9 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(238) RuntimeException local238) {
			signlink.reporterror("9655, " + arg0 + ", " + local238.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)V")
	private void method687(@OriginalArg(1) int arg0) {
		try {
			@Pc(9) Class14 local9 = Class14.method87(arg0);
			for (@Pc(11) int local11 = 0; local11 < local9.anIntArray43.length && local9.anIntArray43[local11] != -1; local11++) {
				@Pc(25) Class14 local25 = Class14.method87(local9.anIntArray43[local11]);
				if (local25.anInt120 == 1) {
					this.method687(local25.anInt111);
				}
				local25.anInt119 = 0;
				local25.anInt116 = 0;
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("12465, " + 36 + ", " + arg0 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(III)V")
	private void method688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(5) boolean local5 = false;
			for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
				if (this.aStringArray14[local7] != null) {
					@Pc(19) int local19 = this.anIntArray270[local7];
					@Pc(30) int local30 = this.anInt834 + 70 + 4 - local1 * 14;
					if (local30 < -20) {
						break;
					}
					@Pc(38) String local38 = this.aStringArray13[local7];
					if (local38 != null && local38.startsWith("@cr1@")) {
						local38 = local38.substring(5);
					}
					if (local38 != null && local38.startsWith("@cr2@")) {
						local38 = local38.substring(5);
					}
					if (local19 == 0) {
						local1++;
					}
					if ((local19 == 1 || local19 == 2) && (local19 == 1 || this.anInt899 == 0 || this.anInt899 == 1 && this.method723(local38))) {
						if (arg2 > local30 - 14 && arg2 <= local30 && !local38.equals(aClass10_Sub1_Sub2_Sub3_Sub2_1.aString14)) {
							if (this.anInt842 >= 1) {
								this.aStringArray12[this.anInt984] = "Report abuse @whi@" + local38;
								this.anIntArray233[this.anInt984] = 507;
								this.anInt984++;
							}
							this.aStringArray12[this.anInt984] = "Add ignore @whi@" + local38;
							this.anIntArray233[this.anInt984] = 574;
							this.anInt984++;
							this.aStringArray12[this.anInt984] = "Add friend @whi@" + local38;
							this.anIntArray233[this.anInt984] = 762;
							this.anInt984++;
						}
						local1++;
					}
					if ((local19 == 3 || local19 == 7) && this.anInt997 == 0 && (local19 == 7 || this.anInt853 == 0 || this.anInt853 == 1 && this.method723(local38))) {
						if (arg2 > local30 - 14 && arg2 <= local30) {
							if (this.anInt842 >= 1) {
								this.aStringArray12[this.anInt984] = "Report abuse @whi@" + local38;
								this.anIntArray233[this.anInt984] = 507;
								this.anInt984++;
							}
							this.aStringArray12[this.anInt984] = "Add ignore @whi@" + local38;
							this.anIntArray233[this.anInt984] = 574;
							this.anInt984++;
							this.aStringArray12[this.anInt984] = "Add friend @whi@" + local38;
							this.anIntArray233[this.anInt984] = 762;
							this.anInt984++;
						}
						local1++;
					}
					if (local19 == 4 && (this.anInt1000 == 0 || this.anInt1000 == 1 && this.method723(local38))) {
						if (arg2 > local30 - 14 && arg2 <= local30) {
							this.aStringArray12[this.anInt984] = "Accept trade @whi@" + local38;
							this.anIntArray233[this.anInt984] = 544;
							this.anInt984++;
						}
						local1++;
					}
					if ((local19 == 5 || local19 == 6) && this.anInt997 == 0 && this.anInt853 < 2) {
						local1++;
					}
					if (local19 == 8 && (this.anInt1000 == 0 || this.anInt1000 == 1 && this.method723(local38))) {
						if (arg2 > local30 - 14 && arg2 <= local30) {
							this.aStringArray12[this.anInt984] = "Accept challenge @whi@" + local38;
							this.anIntArray233[this.anInt984] = 695;
							this.anInt984++;
						}
						local1++;
					}
				}
			}
		} catch (@Pc(403) RuntimeException local403) {
			signlink.reporterror("70082, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local403.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IILclient!MFMVIYHT;)V")
	private void method689(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub1_Sub3 arg1) {
		try {
			@Pc(6) int local6 = arg1.method322(8);
			@Pc(12) int local12;
			if (local6 < this.anInt884) {
				for (local12 = local6; local12 < this.anInt884; local12++) {
					this.anIntArray269[this.anInt1034++] = this.anIntArray229[local12];
				}
			}
			if (local6 > this.anInt884) {
				signlink.reporterror(this.aString27 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt884 = 0;
			for (local12 = 0; local12 < local6; local12++) {
				@Pc(69) int local69 = this.anIntArray229[local12];
				@Pc(74) Class10_Sub1_Sub2_Sub3_Sub2 local74 = this.aClass10_Sub1_Sub2_Sub3_Sub2Array1[local69];
				@Pc(79) int local79 = arg1.method322(1);
				if (local79 == 0) {
					this.anIntArray229[this.anInt884++] = local69;
					local74.anInt718 = anInt1050;
				} else {
					@Pc(102) int local102 = arg1.method322(2);
					if (local102 == 0) {
						this.anIntArray229[this.anInt884++] = local69;
						local74.anInt718 = anInt1050;
						this.anIntArray230[this.anInt885++] = local69;
					} else {
						@Pc(153) int local153;
						@Pc(163) int local163;
						if (local102 == 1) {
							this.anIntArray229[this.anInt884++] = local69;
							local74.anInt718 = anInt1050;
							local153 = arg1.method322(3);
							local74.method540(false, local153);
							local163 = arg1.method322(1);
							if (local163 == 1) {
								this.anIntArray230[this.anInt885++] = local69;
							}
						} else if (local102 == 2) {
							this.anIntArray229[this.anInt884++] = local69;
							local74.anInt718 = anInt1050;
							local153 = arg1.method322(3);
							local74.method540(true, local153);
							local163 = arg1.method322(3);
							local74.method540(true, local163);
							@Pc(221) int local221 = arg1.method322(1);
							if (local221 == 1) {
								this.anIntArray230[this.anInt885++] = local69;
							}
						} else if (local102 == 3) {
							this.anIntArray269[this.anInt1034++] = local69;
						}
					}
				}
			}
		} catch (@Pc(258) RuntimeException local258) {
			signlink.reporterror("71993, " + arg0 + ", " + -138 + ", " + arg1 + ", " + local258.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)V")
	private void method690(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass10_Sub1_Sub1_Sub1_11.anIntArray37;
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
						this.aClass23_1.method225(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass23_1.method225(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass10_Sub1_Sub1_Sub1_11.method73();
			@Pc(153) int local153;
			for (@Pc(149) int local149 = 1; local149 < 103; local149++) {
				for (local153 = 1; local153 < 103; local153++) {
					if ((this.aByteArrayArrayArray8[arg0][local153][local149] & 0x18) == 0) {
						this.method725(local149, arg0, local153, local36, 563, local34);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local153][local149] & 0x8) != 0) {
						this.method725(local149, arg0 + 1, local153, local36, 563, local34);
					}
				}
			}
			if (this.aClass19_17 != null) {
				this.aClass19_17.method130();
				Class10_Sub1_Sub1_Sub4.anIntArray183 = this.anIntArray238;
			}
			anInt938++;
			if (anInt938 > 177) {
				anInt938 = 0;
				this.aClass10_Sub1_Sub3_7.method300(173);
				this.aClass10_Sub1_Sub3_7.method304(2657152);
			}
			this.anInt936 = 0;
			for (local153 = 0; local153 < 104; local153++) {
				for (@Pc(245) int local245 = 0; local245 < 104; local245++) {
					@Pc(255) int local255 = this.aClass23_1.method219(this.anInt942, local153, local245);
					if (local255 != 0) {
						local255 = local255 >> 14 & 0x7FFF;
						@Pc(267) int local267 = Class48.method523(local255).anInt710;
						if (local267 >= 0) {
							@Pc(271) int local271 = local153;
							@Pc(273) int local273 = local245;
							if (local267 != 22 && local267 != 29 && local267 != 34 && local267 != 36 && local267 != 46 && local267 != 47 && local267 != 48) {
								@Pc(305) int[][] local305 = this.aClass47Array1[this.anInt942].anIntArrayArray16;
								for (@Pc(307) int local307 = 0; local307 < 10; local307++) {
									@Pc(314) int local314 = (int) (Math.random() * 4.0D);
									if (local314 == 0 && local271 > 0 && local271 > local153 - 3 && (local305[local271 - 1][local273] & 0x1280108) == 0) {
										local271--;
									}
									if (local314 == 1 && local271 < 103 && local271 < local153 + 3 && (local305[local271 + 1][local273] & 0x1280180) == 0) {
										local271++;
									}
									if (local314 == 2 && local273 > 0 && local273 > local245 - 3 && (local305[local271][local273 - 1] & 0x1280102) == 0) {
										local273--;
									}
									if (local314 == 3 && local273 < 103 && local273 < local245 + 3 && (local305[local271][local273 + 1] & 0x1280120) == 0) {
										local273++;
									}
								}
							}
							this.aClass10_Sub1_Sub1_Sub1Array9[this.anInt936] = this.aClass10_Sub1_Sub1_Sub1Array6[local267];
							this.anIntArray246[this.anInt936] = local271;
							this.anIntArray247[this.anInt936] = local273;
							this.anInt936++;
						}
					}
				}
			}
		} catch (@Pc(444) RuntimeException local444) {
			signlink.reporterror("20009, " + arg0 + ", " + 0 + ", " + local444.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II[B)Z")
	private boolean method691(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			return arg1 == null ? true : signlink.wavesave(arg1, arg0);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("88075, " + 3 + ", " + arg0 + ", " + arg1 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)I")
	private int method692(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) int local3 = 3;
			if (this.aByte48 == 1) {
				@Pc(9) boolean local9 = false;
			} else {
				this.method581();
			}
			if (this.anInt993 < 310) {
				anInt887++;
				@Pc(39) int local39;
				if (anInt887 > 1457) {
					anInt887 = 0;
					this.aClass10_Sub1_Sub3_7.method300(244);
					this.aClass10_Sub1_Sub3_7.method301(0);
					local39 = this.aClass10_Sub1_Sub3_7.anInt428;
					this.aClass10_Sub1_Sub3_7.method301(219);
					this.aClass10_Sub1_Sub3_7.method302(37745);
					this.aClass10_Sub1_Sub3_7.method301(61);
					this.aClass10_Sub1_Sub3_7.method302(43756);
					this.aClass10_Sub1_Sub3_7.method302((int) (Math.random() * 65536.0D));
					this.aClass10_Sub1_Sub3_7.method301((int) (Math.random() * 256.0D));
					this.aClass10_Sub1_Sub3_7.method302(51171);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass10_Sub1_Sub3_7.method302(15808);
					}
					this.aClass10_Sub1_Sub3_7.method301(97);
					this.aClass10_Sub1_Sub3_7.method301((int) (Math.random() * 256.0D));
					this.aClass10_Sub1_Sub3_7.method310(this.aClass10_Sub1_Sub3_7.anInt428 - local39);
				}
				local39 = this.anInt990 >> 7;
				@Pc(112) int local112 = this.anInt992 >> 7;
				@Pc(117) int local117 = aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt739 >> 7;
				@Pc(122) int local122 = aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt740 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt942][local39][local112] & 0x4) != 0) {
					local3 = this.anInt942;
				}
				@Pc(144) int local144;
				if (local117 > local39) {
					local144 = local117 - local39;
				} else {
					local144 = local39 - local117;
				}
				@Pc(157) int local157;
				if (local122 > local112) {
					local157 = local122 - local112;
				} else {
					local157 = local112 - local122;
				}
				@Pc(172) int local172;
				@Pc(174) int local174;
				if (local144 > local157) {
					local172 = local157 * 65536 / local144;
					local174 = 32768;
					while (local39 != local117) {
						if (local39 < local117) {
							local39++;
						} else if (local39 > local117) {
							local39--;
						}
						if ((this.aByteArrayArrayArray8[this.anInt942][local39][local112] & 0x4) != 0) {
							local3 = this.anInt942;
						}
						local174 += local172;
						if (local174 >= 65536) {
							local174 -= 65536;
							if (local112 < local122) {
								local112++;
							} else if (local112 > local122) {
								local112--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt942][local39][local112] & 0x4) != 0) {
								local3 = this.anInt942;
							}
						}
					}
				} else {
					local172 = local144 * 65536 / local157;
					local174 = 32768;
					while (local112 != local122) {
						if (local112 < local122) {
							local112++;
						} else if (local112 > local122) {
							local112--;
						}
						if ((this.aByteArrayArrayArray8[this.anInt942][local39][local112] & 0x4) != 0) {
							local3 = this.anInt942;
						}
						local174 += local172;
						if (local174 >= 65536) {
							local174 -= 65536;
							if (local39 < local117) {
								local39++;
							} else if (local39 > local117) {
								local39--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt942][local39][local112] & 0x4) != 0) {
								local3 = this.anInt942;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt942][aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt739 >> 7][aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt740 >> 7] & 0x4) != 0) {
				local3 = this.anInt942;
			}
			return local3;
		} catch (@Pc(340) RuntimeException local340) {
			signlink.reporterror("1340, " + arg0 + ", " + local340.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)I")
	private int method693() {
		try {
			@Pc(9) int local9 = this.method685(this.anInt992, this.anInt990, this.anInt942);
			return local9 - this.anInt991 >= 800 || (this.aByteArrayArrayArray8[this.anInt942][this.anInt990 >> 7][this.anInt992 >> 7] & 0x4) == 0 ? 3 : this.anInt942;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("20147, " + -276 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	@Override
	public void method587(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}
		if (signlink.mainapp == null) {
			super.method587(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
	private void method694(@OriginalArg(1) boolean arg0) {
		try {
			if (aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt739 >> 7 == this.anInt955 && aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt740 >> 7 == this.anInt956) {
				this.anInt955 = 0;
			}
			@Pc(21) int local21 = this.anInt884;
			if (arg0) {
				local21 = 1;
			}
			for (@Pc(27) int local27 = 0; local27 < local21; local27++) {
				@Pc(33) Class10_Sub1_Sub2_Sub3_Sub2 local33;
				@Pc(38) int local38;
				if (arg0) {
					local33 = aClass10_Sub1_Sub2_Sub3_Sub2_1;
					local38 = this.anInt883 << 14;
				} else {
					local33 = this.aClass10_Sub1_Sub2_Sub3_Sub2Array1[this.anIntArray229[local27]];
					local38 = this.anIntArray229[local27] << 14;
				}
				if (local33 != null && local33.method539()) {
					local33.aBoolean200 = false;
					if ((aBoolean223 && this.anInt884 > 50 || this.anInt884 > 200) && !arg0 && local33.anInt719 == local33.anInt760) {
						local33.aBoolean200 = true;
					}
					@Pc(89) int local89 = local33.anInt739 >> 7;
					@Pc(94) int local94 = local33.anInt740 >> 7;
					if (local89 >= 0 && local89 < 104 && local94 >= 0 && local94 < 104) {
						if (local33.aClass10_Sub1_Sub2_Sub4_2 == null || anInt1050 < local33.anInt771 || anInt1050 >= local33.anInt772) {
							if ((local33.anInt739 & 0x7F) == 64 && (local33.anInt740 & 0x7F) == 64) {
								if (this.anIntArrayArray23[local89][local94] == this.anInt962) {
									continue;
								}
								this.anIntArrayArray23[local89][local94] = this.anInt962;
							}
							local33.anInt766 = this.method685(local33.anInt740, local33.anInt739, this.anInt942);
							this.aClass23_1.method201(local38, local33, local33.anInt739, local33.anInt766, local33.aBoolean196, this.anInt942, 60, local33.anInt740, local33.anInt741);
						} else {
							local33.aBoolean200 = false;
							local33.anInt766 = this.method685(local33.anInt740, local33.anInt739, this.anInt942);
							this.aClass23_1.method202(local33.anInt766, local33.anInt775, local33, local33.anInt774, local33.anInt740, local33.anInt777, local33.anInt739, local33.anInt741, local33.anInt776, this.anInt942, local38);
						}
					}
				}
			}
		} catch (@Pc(225) RuntimeException local225) {
			signlink.reporterror("37806, " + 0 + ", " + arg0 + ", " + local225.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(II)V")
	private void method695(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				@Pc(9) int local9 = this.anIntArray231[arg0];
				@Pc(14) int local14 = this.anIntArray232[arg0];
				@Pc(19) int local19 = this.anIntArray233[arg0];
				@Pc(24) int local24 = this.anIntArray234[arg0];
				if (this.anInt866 > 8 || this.anInt866 < 8) {
					this.anInt844 = this.aClass10_Sub1_Sub3_9.method311();
				}
				if (local19 >= 2000) {
					local19 -= 2000;
				}
				if (this.anInt1010 != 0 && local19 != 1016) {
					this.anInt1010 = 0;
					this.aBoolean255 = true;
				}
				@Pc(61) Class10_Sub1_Sub2_Sub3_Sub2 local61;
				if (local19 == 200) {
					local61 = this.aClass10_Sub1_Sub2_Sub3_Sub2Array1[local24];
					if (local61 != null) {
						this.method610(false, local61.anIntArray194[0], aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0], 1, 1, 2, 0, local61.anIntArray193[0], 0, 0, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0]);
						this.anInt906 = super.anInt822;
						this.anInt907 = super.anInt823;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.aClass10_Sub1_Sub3_7.method300(245);
						this.aClass10_Sub1_Sub3_7.method338(local24);
					}
				}
				if (local19 == 227) {
					anInt974++;
					if (anInt974 >= 62) {
						this.aClass10_Sub1_Sub3_7.method300(165);
						this.aClass10_Sub1_Sub3_7.method301(206);
						anInt974 = 0;
					}
					this.aClass10_Sub1_Sub3_7.method300(228);
					this.aClass10_Sub1_Sub3_7.method336(local9);
					this.aClass10_Sub1_Sub3_7.method337(local24);
					this.aClass10_Sub1_Sub3_7.method302(local14);
					this.anInt1053 = 0;
					this.anInt1054 = local14;
					this.anInt1055 = local9;
					this.anInt1056 = 2;
					if (Class14.method87(local14).anInt128 == this.anInt976) {
						this.anInt1056 = 1;
					}
					if (Class14.method87(local14).anInt128 == this.anInt888) {
						this.anInt1056 = 3;
					}
				}
				if (local19 == 876) {
					local61 = this.aClass10_Sub1_Sub2_Sub3_Sub2Array1[local24];
					if (local61 != null) {
						this.method610(false, local61.anIntArray194[0], aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0], 1, 1, 2, 0, local61.anIntArray193[0], 0, 0, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0]);
						this.anInt906 = super.anInt822;
						this.anInt907 = super.anInt823;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.aClass10_Sub1_Sub3_7.method300(45);
						this.aClass10_Sub1_Sub3_7.method337(local24);
					}
				}
				@Pc(253) Class10_Sub1_Sub2_Sub3_Sub1 local253;
				if (local19 == 921) {
					local253 = this.aClass10_Sub1_Sub2_Sub3_Sub1Array1[local24];
					if (local253 != null) {
						this.method610(false, local253.anIntArray194[0], aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0], 1, 1, 2, 0, local253.anIntArray193[0], 0, 0, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0]);
						this.anInt906 = super.anInt822;
						this.anInt907 = super.anInt823;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.aClass10_Sub1_Sub3_7.method300(67);
						this.aClass10_Sub1_Sub3_7.method337(local24);
					}
				}
				if (local19 == 961) {
					anInt963 += local24;
					if (anInt963 >= 115) {
						this.aClass10_Sub1_Sub3_7.method300(126);
						this.aClass10_Sub1_Sub3_7.method301(125);
						anInt963 = 0;
					}
					this.aClass10_Sub1_Sub3_7.method300(203);
					this.aClass10_Sub1_Sub3_7.method337(local14);
					this.aClass10_Sub1_Sub3_7.method336(local9);
					this.aClass10_Sub1_Sub3_7.method336(local24);
					this.anInt1053 = 0;
					this.anInt1054 = local14;
					this.anInt1055 = local9;
					this.anInt1056 = 2;
					if (Class14.method87(local14).anInt128 == this.anInt976) {
						this.anInt1056 = 1;
					}
					if (Class14.method87(local14).anInt128 == this.anInt888) {
						this.anInt1056 = 3;
					}
				}
				if (local19 == 467 && this.method655(local14, local9, local24)) {
					this.aClass10_Sub1_Sub3_7.method300(152);
					this.aClass10_Sub1_Sub3_7.method336(local24 >> 14 & 0x7FFF);
					this.aClass10_Sub1_Sub3_7.method336(this.anInt967);
					this.aClass10_Sub1_Sub3_7.method336(this.anInt968);
					this.aClass10_Sub1_Sub3_7.method336(local14 + this.anInt915);
					this.aClass10_Sub1_Sub3_7.method302(this.anInt966);
					this.aClass10_Sub1_Sub3_7.method338(local9 + this.anInt914);
				}
				if (local19 == 9) {
					this.aClass10_Sub1_Sub3_7.method300(3);
					this.aClass10_Sub1_Sub3_7.method337(local24);
					this.aClass10_Sub1_Sub3_7.method302(local14);
					this.aClass10_Sub1_Sub3_7.method302(local9);
					this.anInt1053 = 0;
					this.anInt1054 = local14;
					this.anInt1055 = local9;
					this.anInt1056 = 2;
					if (Class14.method87(local14).anInt128 == this.anInt976) {
						this.anInt1056 = 1;
					}
					if (Class14.method87(local14).anInt128 == this.anInt888) {
						this.anInt1056 = 3;
					}
				}
				if (local19 == 553) {
					local253 = this.aClass10_Sub1_Sub2_Sub3_Sub1Array1[local24];
					if (local253 != null) {
						this.method610(false, local253.anIntArray194[0], aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0], 1, 1, 2, 0, local253.anIntArray193[0], 0, 0, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0]);
						this.anInt906 = super.anInt822;
						this.anInt907 = super.anInt823;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.aClass10_Sub1_Sub3_7.method300(42);
						this.aClass10_Sub1_Sub3_7.method336(local24);
					}
				}
				if (local19 == 677) {
					local61 = this.aClass10_Sub1_Sub2_Sub3_Sub2Array1[local24];
					if (local61 != null) {
						this.method610(false, local61.anIntArray194[0], aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0], 1, 1, 2, 0, local61.anIntArray193[0], 0, 0, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0]);
						this.anInt906 = super.anInt822;
						this.anInt907 = super.anInt823;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.aClass10_Sub1_Sub3_7.method300(116);
						this.aClass10_Sub1_Sub3_7.method336(local24);
					}
				}
				@Pc(628) int local628;
				@Pc(639) long local639;
				@Pc(624) String local624;
				if (local19 == 762 || local19 == 574 || local19 == 775 || local19 == 859) {
					local624 = this.aStringArray12[arg0];
					local628 = local624.indexOf("@whi@");
					if (local628 != -1) {
						local639 = Class26.method248(local624.substring(local628 + 5).trim());
						if (local19 == 762) {
							this.method677(local639);
						}
						if (local19 == 574) {
							this.method665(this.anInt971, local639);
						}
						if (local19 == 775) {
							this.method628(local639);
						}
						if (local19 == 859) {
							this.method672(325, local639);
						}
					}
				}
				@Pc(692) boolean local692;
				if (local19 == 930) {
					local692 = this.method610(false, local14, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0], 0, 0, 2, 0, local9, 0, 0, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0]);
					if (!local692) {
						this.method610(false, local14, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0], 1, 1, 2, 0, local9, 0, 0, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0]);
					}
					this.anInt906 = super.anInt822;
					this.anInt907 = super.anInt823;
					this.anInt909 = 2;
					this.anInt908 = 0;
					this.aClass10_Sub1_Sub3_7.method300(54);
					this.aClass10_Sub1_Sub3_7.method337(local24);
					this.aClass10_Sub1_Sub3_7.method336(local14 + this.anInt915);
					this.aClass10_Sub1_Sub3_7.method302(local9 + this.anInt914);
				}
				if (local19 == 399) {
					this.aClass10_Sub1_Sub3_7.method300(24);
					this.aClass10_Sub1_Sub3_7.method336(local14);
					this.aClass10_Sub1_Sub3_7.method336(local24);
					this.aClass10_Sub1_Sub3_7.method337(local9);
					this.anInt1053 = 0;
					this.anInt1054 = local14;
					this.anInt1055 = local9;
					this.anInt1056 = 2;
					if (Class14.method87(local14).anInt128 == this.anInt976) {
						this.anInt1056 = 1;
					}
					if (Class14.method87(local14).anInt128 == this.anInt888) {
						this.anInt1056 = 3;
					}
				}
				if (local19 == 347) {
					local253 = this.aClass10_Sub1_Sub2_Sub3_Sub1Array1[local24];
					if (local253 != null) {
						this.method610(false, local253.anIntArray194[0], aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0], 1, 1, 2, 0, local253.anIntArray193[0], 0, 0, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0]);
						this.anInt906 = super.anInt822;
						this.anInt907 = super.anInt823;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.aClass10_Sub1_Sub3_7.method300(57);
						this.aClass10_Sub1_Sub3_7.method302(local24);
						this.aClass10_Sub1_Sub3_7.method336(this.anInt968);
						this.aClass10_Sub1_Sub3_7.method338(this.anInt967);
						this.aClass10_Sub1_Sub3_7.method302(this.anInt966);
					}
				}
				@Pc(899) Class14 local899;
				if (local19 == 890) {
					this.aClass10_Sub1_Sub3_7.method300(79);
					this.aClass10_Sub1_Sub3_7.method302(local14);
					local899 = Class14.method87(local14);
					if (local899.anIntArrayArray5 != null && local899.anIntArrayArray5[0][0] == 5) {
						local628 = local899.anIntArrayArray5[0][1];
						this.anIntArray244[local628] = 1 - this.anIntArray244[local628];
						this.method680(local628);
						this.aBoolean248 = true;
					}
				}
				if (local19 == 493) {
					local61 = this.aClass10_Sub1_Sub2_Sub3_Sub2Array1[local24];
					if (local61 != null) {
						this.method610(false, local61.anIntArray194[0], aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0], 1, 1, 2, 0, local61.anIntArray193[0], 0, 0, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0]);
						this.anInt906 = super.anInt822;
						this.anInt907 = super.anInt823;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.aClass10_Sub1_Sub3_7.method300(233);
						this.aClass10_Sub1_Sub3_7.method337(local24);
					}
				}
				if (local19 == 14) {
					if (this.aBoolean237) {
						this.aClass23_1.method228(local9 - 4, local14 - 4);
					} else {
						this.aClass23_1.method228(super.anInt822 - 4, super.anInt823 - 4);
					}
				}
				if (local19 == 903) {
					this.aClass10_Sub1_Sub3_7.method300(1);
					this.aClass10_Sub1_Sub3_7.method302(local24);
					this.aClass10_Sub1_Sub3_7.method336(this.anInt966);
					this.aClass10_Sub1_Sub3_7.method336(this.anInt968);
					this.aClass10_Sub1_Sub3_7.method338(this.anInt967);
					this.aClass10_Sub1_Sub3_7.method337(local9);
					this.aClass10_Sub1_Sub3_7.method337(local14);
					this.anInt1053 = 0;
					this.anInt1054 = local14;
					this.anInt1055 = local9;
					this.anInt1056 = 2;
					if (Class14.method87(local14).anInt128 == this.anInt976) {
						this.anInt1056 = 1;
					}
					if (Class14.method87(local14).anInt128 == this.anInt888) {
						this.anInt1056 = 3;
					}
				}
				if (local19 == 361) {
					this.aClass10_Sub1_Sub3_7.method300(36);
					this.aClass10_Sub1_Sub3_7.method302(this.anInt979);
					this.aClass10_Sub1_Sub3_7.method337(local14);
					this.aClass10_Sub1_Sub3_7.method337(local9);
					this.aClass10_Sub1_Sub3_7.method337(local24);
					this.anInt1053 = 0;
					this.anInt1054 = local14;
					this.anInt1055 = local9;
					this.anInt1056 = 2;
					if (Class14.method87(local14).anInt128 == this.anInt976) {
						this.anInt1056 = 1;
					}
					if (Class14.method87(local14).anInt128 == this.anInt888) {
						this.anInt1056 = 3;
					}
				}
				if (local19 == 118) {
					local253 = this.aClass10_Sub1_Sub2_Sub3_Sub1Array1[local24];
					if (local253 != null) {
						this.method610(false, local253.anIntArray194[0], aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0], 1, 1, 2, 0, local253.anIntArray193[0], 0, 0, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0]);
						this.anInt906 = super.anInt822;
						this.anInt907 = super.anInt823;
						this.anInt909 = 2;
						this.anInt908 = 0;
						anInt1005 += local24;
						if (anInt1005 >= 143) {
							this.aClass10_Sub1_Sub3_7.method300(157);
							this.aClass10_Sub1_Sub3_7.method305(0);
							anInt1005 = 0;
						}
						this.aClass10_Sub1_Sub3_7.method300(13);
						this.aClass10_Sub1_Sub3_7.method338(local24);
					}
				}
				if (local19 == 376 && this.method655(local14, local9, local24)) {
					this.aClass10_Sub1_Sub3_7.method300(210);
					this.aClass10_Sub1_Sub3_7.method302(this.anInt979);
					this.aClass10_Sub1_Sub3_7.method336(local24 >> 14 & 0x7FFF);
					this.aClass10_Sub1_Sub3_7.method337(local9 + this.anInt914);
					this.aClass10_Sub1_Sub3_7.method336(local14 + this.anInt915);
				}
				if (local19 == 432) {
					local253 = this.aClass10_Sub1_Sub2_Sub3_Sub1Array1[local24];
					if (local253 != null) {
						this.method610(false, local253.anIntArray194[0], aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0], 1, 1, 2, 0, local253.anIntArray193[0], 0, 0, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0]);
						this.anInt906 = super.anInt822;
						this.anInt907 = super.anInt823;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.aClass10_Sub1_Sub3_7.method300(8);
						this.aClass10_Sub1_Sub3_7.method336(local24);
					}
				}
				if (local19 == 639) {
					this.method590();
				}
				if (local19 == 918) {
					local61 = this.aClass10_Sub1_Sub2_Sub3_Sub2Array1[local24];
					if (local61 != null) {
						this.method610(false, local61.anIntArray194[0], aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0], 1, 1, 2, 0, local61.anIntArray193[0], 0, 0, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0]);
						this.anInt906 = super.anInt822;
						this.anInt907 = super.anInt823;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.aClass10_Sub1_Sub3_7.method300(31);
						this.aClass10_Sub1_Sub3_7.method302(local24);
						this.aClass10_Sub1_Sub3_7.method336(this.anInt979);
					}
				}
				if (local19 == 67) {
					local253 = this.aClass10_Sub1_Sub2_Sub3_Sub1Array1[local24];
					if (local253 != null) {
						this.method610(false, local253.anIntArray194[0], aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0], 1, 1, 2, 0, local253.anIntArray193[0], 0, 0, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0]);
						this.anInt906 = super.anInt822;
						this.anInt907 = super.anInt823;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.aClass10_Sub1_Sub3_7.method300(104);
						this.aClass10_Sub1_Sub3_7.method337(this.anInt979);
						this.aClass10_Sub1_Sub3_7.method336(local24);
					}
				}
				if (local19 == 68) {
					local692 = this.method610(false, local14, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0], 0, 0, 2, 0, local9, 0, 0, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0]);
					if (!local692) {
						this.method610(false, local14, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0], 1, 1, 2, 0, local9, 0, 0, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0]);
					}
					this.anInt906 = super.anInt822;
					this.anInt907 = super.anInt823;
					this.anInt909 = 2;
					this.anInt908 = 0;
					this.aClass10_Sub1_Sub3_7.method300(77);
					this.aClass10_Sub1_Sub3_7.method337(local9 + this.anInt914);
					this.aClass10_Sub1_Sub3_7.method302(local14 + this.anInt915);
					this.aClass10_Sub1_Sub3_7.method338(local24);
				}
				if (local19 == 684) {
					local692 = this.method610(false, local14, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0], 0, 0, 2, 0, local9, 0, 0, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0]);
					if (!local692) {
						this.method610(false, local14, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0], 1, 1, 2, 0, local9, 0, 0, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0]);
					}
					this.anInt906 = super.anInt822;
					this.anInt907 = super.anInt823;
					this.anInt909 = 2;
					this.anInt908 = 0;
					if ((local24 & 0x3) == 0) {
						anInt925++;
					}
					if (anInt925 >= 84) {
						this.aClass10_Sub1_Sub3_7.method300(222);
						this.aClass10_Sub1_Sub3_7.method304(11257922);
						anInt925 = 0;
					}
					this.aClass10_Sub1_Sub3_7.method300(71);
					this.aClass10_Sub1_Sub3_7.method338(local24);
					this.aClass10_Sub1_Sub3_7.method338(local9 + this.anInt914);
					this.aClass10_Sub1_Sub3_7.method337(local14 + this.anInt915);
				}
				@Pc(1708) int local1708;
				@Pc(1704) String local1704;
				if (local19 == 544 || local19 == 695) {
					local624 = this.aStringArray12[arg0];
					local628 = local624.indexOf("@whi@");
					if (local628 != -1) {
						local624 = local624.substring(local628 + 5).trim();
						local1704 = Class26.method252(Class26.method249(Class26.method248(local624)), (byte) 7);
						@Pc(1706) boolean local1706 = false;
						for (local1708 = 0; local1708 < this.anInt884; local1708++) {
							@Pc(1718) Class10_Sub1_Sub2_Sub3_Sub2 local1718 = this.aClass10_Sub1_Sub2_Sub3_Sub2Array1[this.anIntArray229[local1708]];
							if (local1718 != null && local1718.aString14 != null && local1718.aString14.equalsIgnoreCase(local1704)) {
								this.method610(false, local1718.anIntArray194[0], aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0], 1, 1, 2, 0, local1718.anIntArray193[0], 0, 0, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0]);
								if (local19 == 544) {
									this.aClass10_Sub1_Sub3_7.method300(116);
									this.aClass10_Sub1_Sub3_7.method336(this.anIntArray229[local1708]);
								}
								if (local19 == 695) {
									this.aClass10_Sub1_Sub3_7.method300(245);
									this.aClass10_Sub1_Sub3_7.method338(this.anIntArray229[local1708]);
								}
								local1706 = true;
								break;
							}
						}
						if (!local1706) {
							this.method622("", "Unable to find " + local1704, 0);
						}
					}
				}
				if (local19 == 225) {
					this.aClass10_Sub1_Sub3_7.method300(177);
					this.aClass10_Sub1_Sub3_7.method337(local9);
					this.aClass10_Sub1_Sub3_7.method336(local24);
					this.aClass10_Sub1_Sub3_7.method336(local14);
					this.anInt1053 = 0;
					this.anInt1054 = local14;
					this.anInt1055 = local9;
					this.anInt1056 = 2;
					if (Class14.method87(local14).anInt128 == this.anInt976) {
						this.anInt1056 = 1;
					}
					if (Class14.method87(local14).anInt128 == this.anInt888) {
						this.anInt1056 = 3;
					}
				}
				@Pc(1888) String local1888;
				if (local19 == 70) {
					local899 = Class14.method87(local14);
					this.anInt978 = 1;
					this.anInt979 = local14;
					this.anInt980 = local899.anInt113;
					this.anInt965 = 0;
					this.aBoolean248 = true;
					local1888 = local899.aString5;
					if (local1888.indexOf(" ") != -1) {
						local1888 = local1888.substring(0, local1888.indexOf(" "));
					}
					local1704 = local899.aString5;
					if (local1704.indexOf(" ") != -1) {
						local1704 = local1704.substring(local1704.indexOf(" ") + 1);
					}
					this.aString31 = local1888 + " " + local899.aString1 + " " + local1704;
					if (this.anInt980 == 16) {
						this.aBoolean248 = true;
						this.anInt1031 = 3;
						this.aBoolean225 = true;
					}
				} else {
					if (local19 == 891) {
						this.aClass10_Sub1_Sub3_7.method300(4);
						this.aClass10_Sub1_Sub3_7.method336(local9);
						this.aClass10_Sub1_Sub3_7.method338(local24);
						this.aClass10_Sub1_Sub3_7.method338(local14);
						this.anInt1053 = 0;
						this.anInt1054 = local14;
						this.anInt1055 = local9;
						this.anInt1056 = 2;
						if (Class14.method87(local14).anInt128 == this.anInt976) {
							this.anInt1056 = 1;
						}
						if (Class14.method87(local14).anInt128 == this.anInt888) {
							this.anInt1056 = 3;
						}
					}
					if (local19 == 894) {
						this.aClass10_Sub1_Sub3_7.method300(158);
						this.aClass10_Sub1_Sub3_7.method338(local9);
						this.aClass10_Sub1_Sub3_7.method338(local24);
						this.aClass10_Sub1_Sub3_7.method336(local14);
						this.anInt1053 = 0;
						this.anInt1054 = local14;
						this.anInt1055 = local9;
						this.anInt1056 = 2;
						if (Class14.method87(local14).anInt128 == this.anInt976) {
							this.anInt1056 = 1;
						}
						if (Class14.method87(local14).anInt128 == this.anInt888) {
							this.anInt1056 = 3;
						}
					}
					if (local19 == 1280) {
						this.method655(local14, local9, local24);
						this.aClass10_Sub1_Sub3_7.method300(55);
						this.aClass10_Sub1_Sub3_7.method336(local24 >> 14 & 0x7FFF);
						this.aClass10_Sub1_Sub3_7.method336(local14 + this.anInt915);
						this.aClass10_Sub1_Sub3_7.method302(local9 + this.anInt914);
					}
					if (local19 == 35) {
						this.method655(local14, local9, local24);
						this.aClass10_Sub1_Sub3_7.method300(181);
						this.aClass10_Sub1_Sub3_7.method337(local9 + this.anInt914);
						this.aClass10_Sub1_Sub3_7.method336(local14 + this.anInt915);
						this.aClass10_Sub1_Sub3_7.method336(local24 >> 14 & 0x7FFF);
					}
					if (local19 == 888) {
						this.method655(local14, local9, local24);
						this.aClass10_Sub1_Sub3_7.method300(50);
						this.aClass10_Sub1_Sub3_7.method337(local14 + this.anInt915);
						this.aClass10_Sub1_Sub3_7.method336(local24 >> 14 & 0x7FFF);
						this.aClass10_Sub1_Sub3_7.method338(local9 + this.anInt914);
					}
					if (local19 == 324) {
						this.aClass10_Sub1_Sub3_7.method300(161);
						this.aClass10_Sub1_Sub3_7.method338(local9);
						this.aClass10_Sub1_Sub3_7.method338(local24);
						this.aClass10_Sub1_Sub3_7.method336(local14);
						this.anInt1053 = 0;
						this.anInt1054 = local14;
						this.anInt1055 = local9;
						this.anInt1056 = 2;
						if (Class14.method87(local14).anInt128 == this.anInt976) {
							this.anInt1056 = 1;
						}
						if (Class14.method87(local14).anInt128 == this.anInt888) {
							this.anInt1056 = 3;
						}
					}
					@Pc(2231) Class17 local2231;
					if (local19 == 1094) {
						local2231 = Class17.method104(local24);
						@Pc(2234) Class14 local2234 = Class14.method87(local14);
						if (local2234 != null && local2234.anIntArray40[local9] >= 100000) {
							local1888 = local2234.anIntArray40[local9] + " x " + local2231.aString7;
						} else if (local2231.aByteArray8 == null) {
							local1888 = "It's a " + local2231.aString7 + ".";
						} else {
							local1888 = new String(local2231.aByteArray8);
						}
						this.method622("", local1888, 0);
					}
					if (local19 == 352) {
						local899 = Class14.method87(local14);
						@Pc(2295) boolean local2295 = true;
						if (local899.anInt124 > 0) {
							local2295 = this.method635(local899);
						}
						if (local2295) {
							this.aClass10_Sub1_Sub3_7.method300(79);
							this.aClass10_Sub1_Sub3_7.method302(local14);
						}
					}
					if (local19 == 1412) {
						@Pc(2323) int local2323 = local24 >> 14 & 0x7FFF;
						@Pc(2326) Class48 local2326 = Class48.method523(local2323);
						if (local2326.aByteArray17 == null) {
							local1704 = "It's a " + local2326.aString12 + ".";
						} else {
							local1704 = new String(local2326.aByteArray17);
						}
						this.method622("", local1704, 0);
					}
					if (local19 == 575 && !this.aBoolean254) {
						this.aClass10_Sub1_Sub3_7.method300(226);
						this.aClass10_Sub1_Sub3_7.method302(local14);
						this.aBoolean254 = true;
					}
					if (local19 == 892) {
						this.method655(local14, local9, local24);
						this.aClass10_Sub1_Sub3_7.method300(136);
						this.aClass10_Sub1_Sub3_7.method302(local9 + this.anInt914);
						this.aClass10_Sub1_Sub3_7.method336(local14 + this.anInt915);
						this.aClass10_Sub1_Sub3_7.method302(local24 >> 14 & 0x7FFF);
					}
					if (local19 == 270) {
						local692 = this.method610(false, local14, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0], 0, 0, 2, 0, local9, 0, 0, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0]);
						if (!local692) {
							this.method610(false, local14, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0], 1, 1, 2, 0, local9, 0, 0, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0]);
						}
						this.anInt906 = super.anInt822;
						this.anInt907 = super.anInt823;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.aClass10_Sub1_Sub3_7.method300(230);
						this.aClass10_Sub1_Sub3_7.method336(local24);
						this.aClass10_Sub1_Sub3_7.method337(local9 + this.anInt914);
						this.aClass10_Sub1_Sub3_7.method302(local14 + this.anInt915);
					}
					if (local19 == 596) {
						local61 = this.aClass10_Sub1_Sub2_Sub3_Sub2Array1[local24];
						if (local61 != null) {
							this.method610(false, local61.anIntArray194[0], aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0], 1, 1, 2, 0, local61.anIntArray193[0], 0, 0, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0]);
							this.anInt906 = super.anInt822;
							this.anInt907 = super.anInt823;
							this.anInt909 = 2;
							this.anInt908 = 0;
							this.aClass10_Sub1_Sub3_7.method300(143);
							this.aClass10_Sub1_Sub3_7.method336(this.anInt968);
							this.aClass10_Sub1_Sub3_7.method338(this.anInt966);
							this.aClass10_Sub1_Sub3_7.method302(this.anInt967);
							this.aClass10_Sub1_Sub3_7.method337(local24);
						}
					}
					if (local19 == 100) {
						local692 = this.method610(false, local14, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0], 0, 0, 2, 0, local9, 0, 0, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0]);
						if (!local692) {
							this.method610(false, local14, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0], 1, 1, 2, 0, local9, 0, 0, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0]);
						}
						this.anInt906 = super.anInt822;
						this.anInt907 = super.anInt823;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.aClass10_Sub1_Sub3_7.method300(211);
						this.aClass10_Sub1_Sub3_7.method338(this.anInt966);
						this.aClass10_Sub1_Sub3_7.method337(this.anInt968);
						this.aClass10_Sub1_Sub3_7.method338(local14 + this.anInt915);
						this.aClass10_Sub1_Sub3_7.method338(local9 + this.anInt914);
						this.aClass10_Sub1_Sub3_7.method336(this.anInt967);
						this.aClass10_Sub1_Sub3_7.method336(local24);
					}
					if (local19 == 1668) {
						local253 = this.aClass10_Sub1_Sub2_Sub3_Sub1Array1[local24];
						if (local253 != null) {
							@Pc(2692) Class38 local2692 = local253.aClass38_1;
							if (local2692.anIntArray165 != null) {
								local2692 = local2692.method406();
							}
							if (local2692 != null) {
								if (local2692.aByteArray14 == null) {
									local1704 = "It's a " + local2692.aString10 + ".";
								} else {
									local1704 = new String(local2692.aByteArray14);
								}
								this.method622("", local1704, 0);
							}
						}
					}
					if (local19 == 26) {
						local692 = this.method610(false, local14, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0], 0, 0, 2, 0, local9, 0, 0, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0]);
						if (!local692) {
							this.method610(false, local14, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0], 1, 1, 2, 0, local9, 0, 0, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0]);
						}
						this.anInt906 = super.anInt822;
						this.anInt907 = super.anInt823;
						this.anInt909 = 2;
						this.anInt908 = 0;
						anInt944++;
						if (anInt944 >= 120) {
							this.aClass10_Sub1_Sub3_7.method300(95);
							this.aClass10_Sub1_Sub3_7.method305(0);
							anInt944 = 0;
						}
						this.aClass10_Sub1_Sub3_7.method300(100);
						this.aClass10_Sub1_Sub3_7.method302(local9 + this.anInt914);
						this.aClass10_Sub1_Sub3_7.method337(local14 + this.anInt915);
						this.aClass10_Sub1_Sub3_7.method338(local24);
					}
					if (local19 == 444) {
						this.aClass10_Sub1_Sub3_7.method300(91);
						this.aClass10_Sub1_Sub3_7.method336(local24);
						this.aClass10_Sub1_Sub3_7.method338(local9);
						this.aClass10_Sub1_Sub3_7.method302(local14);
						this.anInt1053 = 0;
						this.anInt1054 = local14;
						this.anInt1055 = local9;
						this.anInt1056 = 2;
						if (Class14.method87(local14).anInt128 == this.anInt976) {
							this.anInt1056 = 1;
						}
						if (Class14.method87(local14).anInt128 == this.anInt888) {
							this.anInt1056 = 3;
						}
					}
					if (local19 == 507) {
						local624 = this.aStringArray12[arg0];
						local628 = local624.indexOf("@whi@");
						if (local628 != -1) {
							if (this.anInt976 == -1) {
								this.method590();
								this.aString17 = local624.substring(local628 + 5).trim();
								this.aBoolean241 = false;
								this.anInt1002 = this.anInt976 = Class14.anInt127;
							} else {
								this.method622("", "Please close the interface you have open before using 'report abuse'", 0);
							}
						}
					}
					if (local19 == 389) {
						this.method655(local14, local9, local24);
						this.aClass10_Sub1_Sub3_7.method300(241);
						this.aClass10_Sub1_Sub3_7.method302(local24 >> 14 & 0x7FFF);
						this.aClass10_Sub1_Sub3_7.method302(local9 + this.anInt914);
						this.aClass10_Sub1_Sub3_7.method337(local14 + this.anInt915);
					}
					if (local19 == 564) {
						this.aClass10_Sub1_Sub3_7.method300(231);
						this.aClass10_Sub1_Sub3_7.method338(local14);
						this.aClass10_Sub1_Sub3_7.method336(local9);
						this.aClass10_Sub1_Sub3_7.method302(local24);
						this.anInt1053 = 0;
						this.anInt1054 = local14;
						this.anInt1055 = local9;
						this.anInt1056 = 2;
						if (Class14.method87(local14).anInt128 == this.anInt976) {
							this.anInt1056 = 1;
						}
						if (Class14.method87(local14).anInt128 == this.anInt888) {
							this.anInt1056 = 3;
						}
					}
					if (local19 == 984) {
						local624 = this.aStringArray12[arg0];
						local628 = local624.indexOf("@whi@");
						if (local628 != -1) {
							local639 = Class26.method248(local624.substring(local628 + 5).trim());
							local1708 = -1;
							for (@Pc(3049) int local3049 = 0; local3049 < this.anInt838; local3049++) {
								if (this.aLongArray4[local3049] == local639) {
									local1708 = local3049;
									break;
								}
							}
							if (local1708 != -1 && this.anIntArray265[local1708] > 0) {
								this.aBoolean255 = true;
								this.anInt1010 = 0;
								this.aBoolean216 = true;
								this.aString24 = "";
								this.anInt995 = 3;
								this.aLong31 = this.aLongArray4[local1708];
								this.aString19 = "Enter message to send to " + this.aStringArray8[local1708];
							}
						}
					}
					if (local19 == 518) {
						this.aClass10_Sub1_Sub3_7.method300(79);
						this.aClass10_Sub1_Sub3_7.method302(local14);
						local899 = Class14.method87(local14);
						if (local899.anIntArrayArray5 != null && local899.anIntArrayArray5[0][0] == 5) {
							local628 = local899.anIntArrayArray5[0][1];
							if (this.anIntArray244[local628] != local899.anIntArray42[0]) {
								this.anIntArray244[local628] = local899.anIntArray42[0];
								this.method680(local628);
								this.aBoolean248 = true;
							}
						}
					}
					if (local19 == 318) {
						local253 = this.aClass10_Sub1_Sub2_Sub3_Sub1Array1[local24];
						if (local253 != null) {
							this.method610(false, local253.anIntArray194[0], aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0], 1, 1, 2, 0, local253.anIntArray193[0], 0, 0, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0]);
							this.anInt906 = super.anInt822;
							this.anInt907 = super.anInt823;
							this.anInt909 = 2;
							this.anInt908 = 0;
							this.aClass10_Sub1_Sub3_7.method300(112);
							this.aClass10_Sub1_Sub3_7.method336(local24);
						}
					}
					if (local19 == 199) {
						local692 = this.method610(false, local14, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0], 0, 0, 2, 0, local9, 0, 0, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0]);
						if (!local692) {
							this.method610(false, local14, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0], 1, 1, 2, 0, local9, 0, 0, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0]);
						}
						this.anInt906 = super.anInt822;
						this.anInt907 = super.anInt823;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.aClass10_Sub1_Sub3_7.method300(83);
						this.aClass10_Sub1_Sub3_7.method336(local24);
						this.aClass10_Sub1_Sub3_7.method302(local14 + this.anInt915);
						this.aClass10_Sub1_Sub3_7.method336(this.anInt979);
						this.aClass10_Sub1_Sub3_7.method338(local9 + this.anInt914);
					}
					if (local19 == 55) {
						this.method619(aBoolean249, this.anInt985);
						this.anInt985 = -1;
						this.aBoolean255 = true;
					}
					if (local19 == 52) {
						this.anInt965 = 1;
						this.anInt966 = local9;
						this.anInt967 = local14;
						this.anInt968 = local24;
						this.aString30 = String.valueOf(Class17.method104(local24).aString7);
						this.anInt978 = 0;
						this.aBoolean248 = true;
					} else {
						if (local19 == 1564) {
							local2231 = Class17.method104(local24);
							if (local2231.aByteArray8 == null) {
								local1888 = "It's a " + local2231.aString7 + ".";
							} else {
								local1888 = new String(local2231.aByteArray8);
							}
							this.method622("", local1888, 0);
						}
						if (local19 == 408) {
							local61 = this.aClass10_Sub1_Sub2_Sub3_Sub2Array1[local24];
							if (local61 != null) {
								this.method610(false, local61.anIntArray194[0], aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0], 1, 1, 2, 0, local61.anIntArray193[0], 0, 0, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0]);
								this.anInt906 = super.anInt822;
								this.anInt907 = super.anInt823;
								this.anInt909 = 2;
								this.anInt908 = 0;
								this.aClass10_Sub1_Sub3_7.method300(194);
								this.aClass10_Sub1_Sub3_7.method336(local24);
							}
						}
						this.anInt965 = 0;
						this.anInt978 = 0;
						this.aBoolean248 = true;
					}
				}
			}
		} catch (@Pc(3466) RuntimeException local3466) {
			signlink.reporterror("95946, " + arg0 + ", " + 8 + ", " + local3466.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method696() {
		try {
			this.anInt876 = 0;
			@Pc(70) int local70;
			for (@Pc(6) int local6 = -1; local6 < this.anInt884 + this.anInt960; local6++) {
				@Pc(13) Class10_Sub1_Sub2_Sub3 local13;
				if (local6 == -1) {
					local13 = aClass10_Sub1_Sub2_Sub3_Sub2_1;
				} else if (local6 < this.anInt884) {
					local13 = this.aClass10_Sub1_Sub2_Sub3_Sub2Array1[this.anIntArray229[local6]];
				} else {
					local13 = this.aClass10_Sub1_Sub2_Sub3_Sub1Array1[this.anIntArray256[local6 - this.anInt884]];
				}
				if (local13 != null && local13.method539()) {
					@Pc(54) Class38 local54;
					if (local13 instanceof Class10_Sub1_Sub2_Sub3_Sub1) {
						local54 = ((Class10_Sub1_Sub2_Sub3_Sub1) local13).aClass38_1;
						if (local54.anIntArray165 != null) {
							local54 = local54.method406();
						}
						if (local54 == null) {
							continue;
						}
					}
					if (local6 >= this.anInt884) {
						local54 = ((Class10_Sub1_Sub2_Sub3_Sub1) local13).aClass38_1;
						if (local54.anInt571 >= 0 && local54.anInt571 < this.aClass10_Sub1_Sub1_Sub1Array7.length) {
							this.method711(local13, local13.anInt723 + 15);
							if (this.anInt872 > -1) {
								this.aClass10_Sub1_Sub1_Sub1Array7[local54.anInt571].method78(this.anInt873 - 30, this.anInt872 - 12);
							}
						}
						if (this.anInt986 == 1 && this.anInt999 == this.anIntArray256[local6 - this.anInt884] && anInt1050 % 20 < 10) {
							this.method711(local13, local13.anInt723 + 15);
							if (this.anInt872 > -1) {
								this.aClass10_Sub1_Sub1_Sub1Array5[0].method78(this.anInt873 - 28, this.anInt872 - 12);
							}
						}
					} else {
						local70 = 30;
						@Pc(73) Class10_Sub1_Sub2_Sub3_Sub2 local73 = (Class10_Sub1_Sub2_Sub3_Sub2) local13;
						if (local73.anInt769 != -1 || local73.anInt765 != -1) {
							this.method711(local13, local13.anInt723 + 15);
							if (this.anInt872 > -1) {
								if (local73.anInt769 != -1) {
									this.aClass10_Sub1_Sub1_Sub1Array10[local73.anInt769].method78(this.anInt873 - 30, this.anInt872 - 12);
									local70 += 25;
								}
								if (local73.anInt765 != -1) {
									this.aClass10_Sub1_Sub1_Sub1Array7[local73.anInt765].method78(this.anInt873 - local70, this.anInt872 - 12);
									local70 += 25;
								}
							}
						}
						if (local6 >= 0 && this.anInt986 == 10 && this.anInt969 == this.anIntArray229[local6]) {
							this.method711(local13, local13.anInt723 + 15);
							if (this.anInt872 > -1) {
								this.aClass10_Sub1_Sub1_Sub1Array5[1].method78(this.anInt873 - local70, this.anInt872 - 12);
							}
						}
					}
					if (local13.aString13 != null && (local6 >= this.anInt884 || this.anInt899 == 0 || this.anInt899 == 3 || this.anInt899 == 1 && this.method723(((Class10_Sub1_Sub2_Sub3_Sub2) local13).aString14))) {
						this.method711(local13, local13.anInt723);
						if (this.anInt872 > -1 && this.anInt876 < this.anInt877) {
							this.anIntArray224[this.anInt876] = this.aClass10_Sub1_Sub1_Sub2_4.method151(local13.aString13) / 2;
							this.anIntArray223[this.anInt876] = this.aClass10_Sub1_Sub1_Sub2_4.anInt230;
							this.anIntArray221[this.anInt876] = this.anInt872;
							this.anIntArray222[this.anInt876] = this.anInt873;
							this.anIntArray225[this.anInt876] = local13.anInt716;
							this.anIntArray226[this.anInt876] = local13.anInt722;
							this.anIntArray227[this.anInt876] = local13.anInt715;
							this.aStringArray10[this.anInt876++] = local13.aString13;
							if (this.anInt897 == 0 && local13.anInt722 >= 1 && local13.anInt722 <= 3) {
								this.anIntArray223[this.anInt876] += 10;
								this.anIntArray222[this.anInt876] += 5;
							}
							if (this.anInt897 == 0 && local13.anInt722 == 4) {
								this.anIntArray224[this.anInt876] = 60;
							}
							if (this.anInt897 == 0 && local13.anInt722 == 5) {
								this.anIntArray223[this.anInt876] += 5;
							}
						}
					}
					if (local13.anInt724 > anInt1050) {
						this.method711(local13, local13.anInt723 + 15);
						if (this.anInt872 > -1) {
							local70 = local13.anInt725 * 30 / local13.anInt726;
							if (local70 > 30) {
								local70 = 30;
							}
							Class10_Sub1_Sub1.method499(5, this.anInt873 - 3, 65280, local70, this.anInt872 - 15);
							Class10_Sub1_Sub1.method499(5, this.anInt873 - 3, 16711680, 30 - local70, this.anInt872 - 15 + local70);
						}
					}
					for (local70 = 0; local70 < 4; local70++) {
						if (local13.anIntArray197[local70] > anInt1050) {
							this.method711(local13, local13.anInt723 / 2);
							if (this.anInt872 > -1) {
								if (local70 == 1) {
									this.anInt873 -= 20;
								}
								if (local70 == 2) {
									this.anInt872 -= 15;
									this.anInt873 -= 10;
								}
								if (local70 == 3) {
									this.anInt872 += 15;
									this.anInt873 -= 10;
								}
								this.aClass10_Sub1_Sub1_Sub1Array8[local13.anIntArray196[local70]].method78(this.anInt873 - 12, this.anInt872 - 12);
								this.aClass10_Sub1_Sub1_Sub2_2.method148(this.anInt872, 452, this.anInt873 + 4, 0, String.valueOf(local13.anIntArray195[local70]));
								this.aClass10_Sub1_Sub1_Sub2_2.method148(this.anInt872 - 1, 452, this.anInt873 + 3, 16777215, String.valueOf(local13.anIntArray195[local70]));
							}
						}
					}
				}
			}
			for (@Pc(610) int local610 = 0; local610 < this.anInt876; local610++) {
				local70 = this.anIntArray221[local610];
				@Pc(622) int local622 = this.anIntArray222[local610];
				@Pc(627) int local627 = this.anIntArray224[local610];
				@Pc(632) int local632 = this.anIntArray223[local610];
				@Pc(634) boolean local634 = true;
				while (local634) {
					local634 = false;
					for (@Pc(640) int local640 = 0; local640 < local610; local640++) {
						if (local622 + 2 > this.anIntArray222[local640] - this.anIntArray223[local640] && local622 - local632 < this.anIntArray222[local640] + 2 && local70 - local627 < this.anIntArray221[local640] + this.anIntArray224[local640] && local70 + local627 > this.anIntArray221[local640] - this.anIntArray224[local640] && this.anIntArray222[local640] - this.anIntArray223[local640] < local622) {
							local622 = this.anIntArray222[local640] - this.anIntArray223[local640];
							local634 = true;
						}
					}
				}
				this.anInt872 = this.anIntArray221[local610];
				this.anInt873 = this.anIntArray222[local610] = local622;
				@Pc(739) String local739 = this.aStringArray10[local610];
				if (this.anInt897 == 0) {
					@Pc(744) int local744 = 16776960;
					if (this.anIntArray225[local610] < 6) {
						local744 = this.anIntArray213[this.anIntArray225[local610]];
					}
					if (this.anIntArray225[local610] == 6) {
						local744 = this.anInt962 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray225[local610] == 7) {
						local744 = this.anInt962 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray225[local610] == 8) {
						local744 = this.anInt962 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(819) int local819;
					if (this.anIntArray225[local610] == 9) {
						local819 = 150 - this.anIntArray227[local610];
						if (local819 < 50) {
							local744 = local819 * 1280 + 16711680;
						} else if (local819 < 100) {
							local744 = 16776960 - (local819 - 50) * 327680;
						} else if (local819 < 150) {
							local744 = (local819 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray225[local610] == 10) {
						local819 = 150 - this.anIntArray227[local610];
						if (local819 < 50) {
							local744 = local819 * 5 + 16711680;
						} else if (local819 < 100) {
							local744 = 16711935 - (local819 - 50) * 327680;
						} else if (local819 < 150) {
							local744 = (local819 - 100) * 327680 + 255 - (local819 - 100) * 5;
						}
					}
					if (this.anIntArray225[local610] == 11) {
						local819 = 150 - this.anIntArray227[local610];
						if (local819 < 50) {
							local744 = 16777215 - local819 * 327685;
						} else if (local819 < 100) {
							local744 = (local819 - 50) * 327685 + 65280;
						} else if (local819 < 150) {
							local744 = 16777215 - (local819 - 100) * 327680;
						}
					}
					if (this.anIntArray226[local610] == 0) {
						this.aClass10_Sub1_Sub1_Sub2_4.method148(this.anInt872, 452, this.anInt873 + 1, 0, local739);
						this.aClass10_Sub1_Sub1_Sub2_4.method148(this.anInt872, 452, this.anInt873, local744, local739);
					}
					if (this.anIntArray226[local610] == 1) {
						this.aClass10_Sub1_Sub1_Sub2_4.method153(this.anInt873 + 1, (byte) 4, this.anInt962, local739, this.anInt872, 0);
						this.aClass10_Sub1_Sub1_Sub2_4.method153(this.anInt873, (byte) 4, this.anInt962, local739, this.anInt872, local744);
					}
					if (this.anIntArray226[local610] == 2) {
						this.aClass10_Sub1_Sub1_Sub2_4.method154(this.anInt873 + 1, 0, local739, this.anInt872, this.anInt962);
						this.aClass10_Sub1_Sub1_Sub2_4.method154(this.anInt873, local744, local739, this.anInt872, this.anInt962);
					}
					if (this.anIntArray226[local610] == 3) {
						this.aClass10_Sub1_Sub1_Sub2_4.method155(local739, 0, this.anInt872, this.anInt873 + 1, 150 - this.anIntArray227[local610], this.anInt962);
						this.aClass10_Sub1_Sub1_Sub2_4.method155(local739, local744, this.anInt872, this.anInt873, 150 - this.anIntArray227[local610], this.anInt962);
					}
					@Pc(1116) int local1116;
					if (this.anIntArray226[local610] == 4) {
						local819 = this.aClass10_Sub1_Sub1_Sub2_4.method151(local739);
						local1116 = (150 - this.anIntArray227[local610]) * (local819 + 100) / 150;
						Class10_Sub1_Sub1.method496(0, this.anInt872 - 50, 334, this.anInt872 + 50);
						this.aClass10_Sub1_Sub1_Sub2_4.method152(this.anInt872 + 50 - local1116, 0, this.anInt873 + 1, local739);
						this.aClass10_Sub1_Sub1_Sub2_4.method152(this.anInt872 + 50 - local1116, local744, this.anInt873, local739);
						Class10_Sub1_Sub1.method495();
					}
					if (this.anIntArray226[local610] == 5) {
						local819 = 150 - this.anIntArray227[local610];
						local1116 = 0;
						if (local819 < 25) {
							local1116 = local819 - 25;
						} else if (local819 > 125) {
							local1116 = local819 - 125;
						}
						Class10_Sub1_Sub1.method496(this.anInt873 - this.aClass10_Sub1_Sub1_Sub2_4.anInt230 - 1, 0, this.anInt873 + 5, 512);
						this.aClass10_Sub1_Sub1_Sub2_4.method148(this.anInt872, 452, this.anInt873 + local1116 + 1, 0, local739);
						this.aClass10_Sub1_Sub1_Sub2_4.method148(this.anInt872, 452, this.anInt873 + local1116, local744, local739);
						Class10_Sub1_Sub1.method495();
					}
				} else {
					this.aClass10_Sub1_Sub1_Sub2_4.method148(this.anInt872, 452, this.anInt873 + 1, 0, local739);
					this.aClass10_Sub1_Sub1_Sub2_4.method148(this.anInt872, 452, this.anInt873, 16776960, local739);
				}
			}
		} catch (@Pc(1271) RuntimeException local1271) {
			signlink.reporterror("91115, " + false + ", " + local1271.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method697() {
		try {
			if (this.aClass19_18 == null) {
				this.method716();
				super.aClass19_2 = null;
				this.aClass19_19 = null;
				this.aClass19_20 = null;
				this.aClass19_21 = null;
				this.aClass19_22 = null;
				this.aClass19_23 = null;
				this.aClass19_24 = null;
				this.aClass19_25 = null;
				this.aClass19_26 = null;
				this.aClass19_27 = null;
				this.aClass19_18 = new Class19(96, (byte) -12, this.method586(), 479);
				this.aClass19_16 = new Class19(156, (byte) -12, this.method586(), 172);
				Class10_Sub1_Sub1.method497();
				this.aClass10_Sub1_Sub1_Sub3_17.method440(0, 0);
				this.aClass19_15 = new Class19(261, (byte) -12, this.method586(), 190);
				this.aClass19_17 = new Class19(334, (byte) -12, this.method586(), 512);
				Class10_Sub1_Sub1.method497();
				this.aClass19_12 = new Class19(50, (byte) -12, this.method586(), 496);
				this.aClass19_13 = new Class19(37, (byte) -12, this.method586(), 269);
				this.aClass19_14 = new Class19(45, (byte) -12, this.method586(), 249);
				this.aBoolean236 = true;
				this.aClass19_17.method130();
				Class10_Sub1_Sub1_Sub4.anIntArray183 = this.anIntArray238;
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("69063, " + -906 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method698(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) Graphics local4 = this.method586().getGraphics();
			local4.setColor(Color.black);
			@Pc(11) boolean local11 = false;
			local4.fillRect(0, 0, 765, 503);
			this.method579();
			@Pc(40) byte local40;
			@Pc(46) int local46;
			if (this.aBoolean264) {
				this.aBoolean257 = false;
				local4.setFont(new Font("Helvetica", 1, 16));
				local4.setColor(Color.yellow);
				local40 = 35;
				local4.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
				local46 = local40 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				@Pc(55) int local55 = local46 + 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				@Pc(72) int local72 = local55 + 30;
				local4.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
				@Pc(78) int local78 = local72 + 30;
				local4.drawString("3: Try using a different game-world", 30, 195);
				@Pc(84) int local84 = local78 + 30;
				local4.drawString("4: Try rebooting your computer", 30, 225);
				@Pc(90) int local90 = local84 + 30;
				local4.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
			}
			if (this.aBoolean240) {
				this.aBoolean257 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean232) {
				this.aBoolean257 = false;
				local4.setColor(Color.yellow);
				local40 = 35;
				local4.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
				local46 = local40 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				local46 += 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				local46 += 30;
				local4.drawString("2: Try rebooting your computer, and reloading", 30, 165);
				local46 += 30;
			}
		} catch (@Pc(178) RuntimeException local178) {
			signlink.reporterror("19067, " + arg0 + ", " + local178.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method699() {
		try {
			try {
				if (this.aClass18_1 != null) {
					this.aClass18_1.method116();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass18_1 = null;
			this.aBoolean244 = false;
			this.anInt998 = 0;
			this.aString27 = "";
			this.aString28 = "";
			this.method624();
			this.aBoolean244 &= true;
			this.aClass23_1.method190();
			for (@Pc(37) int local37 = 0; local37 < 4; local37++) {
				this.aClass47Array1[local37].method480();
			}
			System.gc();
			this.method625();
			this.anInt1051 = -1;
			this.anInt1023 = -1;
			this.anInt958 = 0;
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("93177, " + true + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)V")
	private void method700(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(16) int local16;
			if (this.aClass19_17 != null) {
				this.aClass19_17.method130();
				Class10_Sub1_Sub1_Sub4.anIntArray183 = this.anIntArray238;
				local16 = 151;
				if (arg0 != null) {
					local16 -= 7;
				}
				this.aClass10_Sub1_Sub1_Sub2_3.method148(257, 452, local16, 0, arg1);
				this.aClass10_Sub1_Sub1_Sub2_3.method148(256, 452, local16 - 1, 16777215, arg1);
				local16 += 15;
				if (arg0 != null) {
					this.aClass10_Sub1_Sub1_Sub2_3.method148(257, 452, local16, 0, arg0);
					this.aClass10_Sub1_Sub1_Sub2_3.method148(256, 452, local16 - 1, 16777215, arg0);
				}
				this.aClass19_17.method131(4, 4, super.aGraphics2, this.aBoolean239);
			} else if (super.aClass19_2 != null) {
				super.aClass19_2.method130();
				Class10_Sub1_Sub1_Sub4.anIntArray183 = this.anIntArray239;
				local16 = 251;
				Class10_Sub1_Sub1.method499(50, 221, 0, 300, 233);
				Class10_Sub1_Sub1.method500(221, 50, 16777215, 233, 300);
				if (arg0 != null) {
					local16 -= 7;
				}
				this.aClass10_Sub1_Sub1_Sub2_3.method148(383, 452, local16, 0, arg1);
				this.aClass10_Sub1_Sub1_Sub2_3.method148(382, 452, local16 - 1, 16777215, arg1);
				local16 += 15;
				if (arg0 != null) {
					this.aClass10_Sub1_Sub1_Sub2_3.method148(383, 452, local16, 0, arg0);
					this.aClass10_Sub1_Sub1_Sub2_3.method148(382, 452, local16 - 1, 16777215, arg0);
				}
				super.aClass19_2.method131(0, 0, super.aGraphics2, this.aBoolean239);
			}
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("61884, " + -332 + ", " + arg0 + ", " + arg1 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)Z")
	private boolean method701(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(8) int local8 = this.anIntArray233[arg0];
			if (arg1 != 97) {
				throw new NullPointerException();
			}
			if (local8 >= 2000) {
				local8 -= 2000;
			}
			return local8 == 762;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("33506, " + arg0 + ", " + arg1 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
	private void method702() {
		try {
			if (this.anInt986 == 2) {
				this.method712((this.anInt828 - this.anInt914 << 7) + this.anInt831, this.anInt830 * 2, (this.anInt829 - this.anInt915 << 7) + this.anInt832);
				if (this.anInt872 > -1 && anInt1050 % 20 < 10) {
					this.aClass10_Sub1_Sub1_Sub1Array5[0].method78(this.anInt873 - 28, this.anInt872 - 12);
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("96436, " + true + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method584() {
		try {
			if (this.aBoolean232 || this.aBoolean264 || this.aBoolean240) {
				this.method698(281);
			} else {
				anInt1044++;
				if (this.aBoolean244) {
					this.method649();
				} else {
					this.method706(false);
				}
				this.anInt943 = 0;
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("87021, " + 818 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
	private void method703() {
		try {
			@Pc(8) int local8 = this.anInt1040;
			@Pc(11) int local11 = this.anInt1041;
			@Pc(14) int local14 = this.anInt1042;
			@Pc(17) int local17 = this.anInt1043;
			Class10_Sub1_Sub1.method499(local17, local11, 6116423, local14, local8);
			Class10_Sub1_Sub1.method499(16, local11 + 1, 0, local14 - 2, local8 + 1);
			Class10_Sub1_Sub1.method500(local11 + 18, local17 - 19, 0, local8 + 1, local14 - 2);
			this.aClass10_Sub1_Sub1_Sub2_4.method152(local8 + 3, 6116423, local11 + 14, "Choose Option");
			@Pc(69) int local69 = super.anInt816;
			@Pc(72) int local72 = super.anInt817;
			if (this.anInt1039 == 0) {
				local69 -= 4;
				local72 -= 4;
			}
			if (this.anInt1039 == 1) {
				local69 -= 553;
				local72 -= 205;
			}
			if (this.anInt1039 == 2) {
				local69 -= 17;
				local72 -= 357;
			}
			for (@Pc(91) int local91 = 0; local91 < this.anInt984; local91++) {
				@Pc(106) int local106 = local11 + (this.anInt984 - 1 - local91) * 15 + 31;
				@Pc(108) int local108 = 16777215;
				if (local69 > local8 && local69 < local8 + local14 && local72 > local106 - 13 && local72 < local106 + 3) {
					local108 = 16776960;
				}
				this.aClass10_Sub1_Sub1_Sub2_4.method156(local108, local8 + 3, local106, true, this.aStringArray12[local91]);
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("50432, " + false + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!EWIXBTLV;)I")
	private int method704(@OriginalArg(1) int arg0, @OriginalArg(2) Class14 arg1) {
		try {
			if (arg1.anIntArrayArray5 == null || arg0 >= arg1.anIntArrayArray5.length) {
				return -2;
			}
			try {
				@Pc(22) int[] local22 = arg1.anIntArrayArray5[arg0];
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
						local35 = this.anIntArray242[local22[local26++]];
					}
					if (local33 == 2) {
						local35 = this.anIntArray245[local22[local26++]];
					}
					if (local33 == 3) {
						local35 = this.anIntArray214[local22[local26++]];
					}
					@Pc(83) Class14 local83;
					@Pc(88) int local88;
					@Pc(101) int local101;
					if (local33 == 4) {
						local83 = Class14.method87(local22[local26++]);
						local88 = local22[local26++];
						if (local88 >= 0 && local88 < Class17.anInt179 && (!Class17.method104(local88).aBoolean54 || aBoolean222)) {
							for (local101 = 0; local101 < local83.anIntArray44.length; local101++) {
								if (local83.anIntArray44[local101] == local88 + 1) {
									local35 += local83.anIntArray40[local101];
								}
							}
						}
					}
					if (local33 == 5) {
						local35 = this.anIntArray244[local22[local26++]];
					}
					if (local33 == 6) {
						local35 = anIntArray228[this.anIntArray245[local22[local26++]] - 1];
					}
					if (local33 == 7) {
						local35 = this.anIntArray244[local22[local26++]] * 100 / 46875;
					}
					if (local33 == 8) {
						local35 = aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt767;
					}
					@Pc(176) int local176;
					if (local33 == 9) {
						for (local176 = 0; local176 < Class43.anInt612; local176++) {
							if (Class43.aBooleanArray8[local176]) {
								local35 += this.anIntArray245[local176];
							}
						}
					}
					if (local33 == 10) {
						local83 = Class14.method87(local22[local26++]);
						local88 = local22[local26++] + 1;
						if (local88 >= 0 && local88 < Class17.anInt179 && (!Class17.method104(local88).aBoolean54 || aBoolean222)) {
							for (local101 = 0; local101 < local83.anIntArray44.length; local101++) {
								if (local83.anIntArray44[local101] == local88) {
									local35 = 999999999;
									break;
								}
							}
						}
					}
					if (local33 == 11) {
						local35 = this.anInt1049;
					}
					if (local33 == 12) {
						local35 = this.anInt911;
					}
					if (local33 == 13) {
						local176 = this.anIntArray244[local22[local26++]];
						local88 = local22[local26++];
						local35 = (local176 & 0x1 << local88) == 0 ? 0 : 1;
					}
					if (local33 == 14) {
						local176 = local22[local26++];
						@Pc(290) Class50 local290 = Class50.aClass50Array1[local176];
						local101 = local290.anInt800;
						@Pc(296) int local296 = local290.anInt801;
						@Pc(299) int local299 = local290.anInt802;
						@Pc(305) int local305 = anIntArray262[local299 - local296];
						local35 = this.anIntArray244[local101] >> local296 & local305;
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
						local35 = (aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt739 >> 7) + this.anInt914;
					}
					if (local33 == 19) {
						local35 = (aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt740 >> 7) + this.anInt915;
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
			} catch (@Pc(398) Exception local398) {
				return -1;
			}
		} catch (@Pc(401) RuntimeException local401) {
			signlink.reporterror("524, " + 3 + ", " + arg0 + ", " + arg1 + ", " + local401.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLclient!EPQDEJTO;I)V")
	private void method705(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub1_Sub1_Sub1 arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg1 != null) {
				@Pc(10) int local10 = this.anInt1013 + this.anInt864 & 0x7FF;
				@Pc(18) int local18 = arg2 * arg2 + arg0 * arg0;
				if (local18 <= 6400) {
					@Pc(26) int local26 = Class10_Sub1_Sub2_Sub4.anIntArray146[local10];
					@Pc(30) int local30 = Class10_Sub1_Sub2_Sub4.anIntArray147[local10];
					@Pc(39) int local39 = local26 * 256 / (this.anInt1003 + 256);
					@Pc(48) int local48 = local30 * 256 / (this.anInt1003 + 256);
					@Pc(65) int local65 = arg0 * local39 + arg2 * local48 >> 16;
					@Pc(75) int local75 = arg0 * local48 - arg2 * local39 >> 16;
					if (local18 > 2500) {
						arg1.method84(this.aClass10_Sub1_Sub1_Sub3_17, 83 - local75 - arg1.anInt109 / 2 - 4, local65 + 94 - arg1.anInt108 / 2 + 4);
					} else {
						arg1.method78(83 - local75 - arg1.anInt109 / 2 - 4, local65 + 94 - arg1.anInt108 / 2 + 4);
					}
				}
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("62069, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
	private void method706(@OriginalArg(1) boolean arg0) {
		try {
			this.method639();
			this.aClass19_21.method130();
			this.aClass10_Sub1_Sub1_Sub3_19.method440(0, 0);
			@Pc(57) byte local57;
			@Pc(70) int local70;
			if (this.anInt998 == 0) {
				this.aClass10_Sub1_Sub1_Sub2_2.method149(true, this.anInt928, 7711145, 180, 180, this.aClass33_Sub1_1.aString15);
				local57 = 80;
				this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16776960, 80, 180, "Welcome to RuneScape");
				local70 = local57 + 30;
				this.aClass10_Sub1_Sub1_Sub3_20.method440(100, 27);
				this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16777215, 125, 100, "New User");
				this.aClass10_Sub1_Sub1_Sub3_20.method440(100, 187);
				this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16777215, 125, 260, "Existing User");
			}
			if (this.anInt998 == 2) {
				local57 = 60;
				if (this.aString21.length() > 0) {
					this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16776960, 45, 180, this.aString21);
					this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16776960, 60, 180, this.aString22);
					local70 = local57 + 30;
				} else {
					this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16776960, 53, 180, this.aString22);
					local70 = local57 + 30;
				}
				this.aClass10_Sub1_Sub1_Sub2_4.method156(16777215, 90, 90, true, "Username: " + this.aString27 + (this.anInt886 == 0 & anInt1050 % 40 < 20 ? "@yel@|" : ""));
				local70 += 15;
				this.aClass10_Sub1_Sub1_Sub2_4.method156(16777215, 92, 105, true, "Password: " + Class26.method253(this.aString28) + (this.anInt886 == 1 & anInt1050 % 40 < 20 ? "@yel@|" : ""));
				local70 += 15;
				if (!arg0) {
					this.aClass10_Sub1_Sub1_Sub3_20.method440(130, 27);
					this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16777215, 155, 100, "Login");
					this.aClass10_Sub1_Sub1_Sub3_20.method440(130, 187);
					this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16777215, 155, 260, "Cancel");
				}
			}
			if (this.anInt998 == 3) {
				this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16776960, 40, 180, "Create a free account");
				local57 = 65;
				this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16777215, 65, 180, "To create a new account you need to");
				local70 = local57 + 15;
				this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16777215, 80, 180, "go back to the main RuneScape webpage");
				local70 += 15;
				this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16777215, 95, 180, "and choose the 'create account'");
				local70 += 15;
				this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16777215, 110, 180, "button near the top of that page.");
				local70 += 15;
				this.aClass10_Sub1_Sub1_Sub3_20.method440(130, 107);
				this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16777215, 155, 180, "Cancel");
			}
			this.aClass19_21.method131(171, 202, super.aGraphics2, this.aBoolean239);
			if (this.aBoolean236) {
				this.aBoolean236 = false;
				this.aClass19_19.method131(0, 128, super.aGraphics2, this.aBoolean239);
				this.aClass19_20.method131(371, 202, super.aGraphics2, this.aBoolean239);
				this.aClass19_24.method131(265, 0, super.aGraphics2, this.aBoolean239);
				this.aClass19_25.method131(265, 562, super.aGraphics2, this.aBoolean239);
				this.aClass19_26.method131(171, 128, super.aGraphics2, this.aBoolean239);
				this.aClass19_27.method131(171, 562, super.aGraphics2, this.aBoolean239);
			}
		} catch (@Pc(523) RuntimeException local523) {
			signlink.reporterror("86033, " + -50 + ", " + arg0 + ", " + local523.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!MFMVIYHT;IZ)V")
	private void method707(@OriginalArg(0) Class10_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			while (true) {
				if (arg0.anInt429 + 21 < arg1 * 8) {
					@Pc(17) int local17 = arg0.method322(14);
					if (local17 != 16383) {
						if (this.aClass10_Sub1_Sub2_Sub3_Sub1Array1[local17] == null) {
							this.aClass10_Sub1_Sub2_Sub3_Sub1Array1[local17] = new Class10_Sub1_Sub2_Sub3_Sub1();
						}
						@Pc(37) Class10_Sub1_Sub2_Sub3_Sub1 local37 = this.aClass10_Sub1_Sub2_Sub3_Sub1Array1[local17];
						this.anIntArray256[this.anInt960++] = local17;
						local37.anInt718 = anInt1050;
						@Pc(56) int local56 = arg0.method322(1);
						if (local56 == 1) {
							this.anIntArray230[this.anInt885++] = local17;
						}
						@Pc(75) int local75 = arg0.method322(5);
						if (local75 > 15) {
							local75 -= 32;
						}
						@Pc(84) int local84 = arg0.method322(5);
						if (local84 > 15) {
							local84 -= 32;
						}
						@Pc(93) int local93 = arg0.method322(1);
						local37.aClass38_1 = Class38.method407(arg0.method322(13));
						local37.anInt730 = local37.aClass38_1.aByte31;
						local37.anInt729 = local37.aClass38_1.anInt579;
						local37.anInt748 = local37.aClass38_1.anInt576;
						local37.anInt749 = local37.aClass38_1.anInt575;
						local37.anInt750 = local37.aClass38_1.anInt574;
						local37.anInt751 = local37.aClass38_1.anInt569;
						local37.anInt760 = local37.aClass38_1.anInt564;
						local37.method542(aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0] + local75, (byte) 5, local93 == 1, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0] + local84);
						continue;
					}
				}
				arg0.method323();
				return;
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("11789, " + arg0 + ", " + arg1 + ", " + false + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!MFMVIYHT;II)V")
	private void method708(@OriginalArg(0) Class10_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(12) int local12;
			@Pc(15) int local15;
			@Pc(19) int local19;
			@Pc(23) int local23;
			@Pc(28) int local28;
			@Pc(36) int local36;
			@Pc(45) int local45;
			@Pc(52) int local52;
			@Pc(61) int local61;
			@Pc(65) int local65;
			if (arg1 == 203) {
				local12 = arg0.method313();
				local15 = arg0.method311();
				local19 = local15 >> 2;
				local23 = local15 & 0x3;
				local28 = this.anIntArray243[local19];
				@Pc(32) byte local32 = arg0.method334();
				local36 = arg0.method330();
				local45 = this.anInt889 + (local36 >> 4 & 0x7);
				local52 = this.anInt890 + (local36 & 0x7);
				@Pc(57) byte local57 = arg0.method333(this.anInt940);
				local61 = arg0.method340();
				local65 = arg0.method339();
				@Pc(68) byte local68 = arg0.method312();
				@Pc(73) byte local73 = arg0.method333(this.anInt940);
				@Pc(76) int local76 = arg0.method313();
				@Pc(82) Class10_Sub1_Sub2_Sub3_Sub2 local82;
				if (local65 == this.anInt881) {
					local82 = aClass10_Sub1_Sub2_Sub3_Sub2_1;
				} else {
					local82 = this.aClass10_Sub1_Sub2_Sub3_Sub2Array1[local65];
				}
				if (local82 != null) {
					@Pc(94) Class48 local94 = Class48.method523(local12);
					@Pc(104) int local104 = this.anIntArrayArrayArray8[this.anInt942][local45][local52];
					@Pc(116) int local116 = this.anIntArrayArrayArray8[this.anInt942][local45 + 1][local52];
					@Pc(130) int local130 = this.anIntArrayArrayArray8[this.anInt942][local45 + 1][local52 + 1];
					@Pc(142) int local142 = this.anIntArrayArrayArray8[this.anInt942][local45][local52 + 1];
					@Pc(152) Class10_Sub1_Sub2_Sub4 local152 = local94.method531(local19, local23, local104, local116, local130, local142, -1);
					if (local152 != null) {
						this.method720(this.anInt942, local45, 0, local61 + 1, 0, -1, local76 + 1, local28, local52);
						local82.anInt771 = local76 + anInt1050;
						local82.anInt772 = local61 + anInt1050;
						local82.aClass10_Sub1_Sub2_Sub4_2 = local152;
						@Pc(187) int local187 = local94.anInt707;
						@Pc(190) int local190 = local94.anInt697;
						if (local23 == 1 || local23 == 3) {
							local187 = local94.anInt697;
							local190 = local94.anInt707;
						}
						local82.anInt762 = local45 * 128 + local187 * 64;
						local82.anInt764 = local52 * 128 + local190 * 64;
						local82.anInt763 = this.method685(local82.anInt764, local82.anInt762, this.anInt942);
						@Pc(236) byte local236;
						if (local57 > local32) {
							local236 = local57;
							local57 = local32;
							local32 = local236;
						}
						if (local73 > local68) {
							local236 = local73;
							local73 = local68;
							local68 = local236;
						}
						local82.anInt774 = local45 + local57;
						local82.anInt776 = local45 + local32;
						local82.anInt775 = local52 + local73;
						local82.anInt777 = local52 + local68;
					}
				}
			}
			@Pc(304) int local304;
			if (arg1 == 106) {
				local12 = arg0.method330();
				local15 = this.anInt889 + (local12 >> 4 & 0x7);
				local19 = this.anInt890 + (local12 & 0x7);
				local23 = arg0.method341();
				local28 = arg0.method340();
				local304 = arg0.method340();
				if (local15 >= 0 && local19 >= 0 && local15 < 104 && local19 < 104 && local304 != this.anInt881) {
					@Pc(322) Class10_Sub1_Sub2_Sub1 local322 = new Class10_Sub1_Sub2_Sub1();
					local322.anInt211 = local28;
					local322.anInt213 = local23;
					if (this.aClass6ArrayArrayArray1[this.anInt942][local15][local19] == null) {
						this.aClass6ArrayArrayArray1[this.anInt942][local15][local19] = new Class6(true);
					}
					this.aClass6ArrayArrayArray1[this.anInt942][local15][local19].method3(local322);
					this.method601(local15, local19);
				}
			} else {
				@Pc(441) int local441;
				if (arg1 == 142) {
					local12 = arg0.method313();
					local15 = arg0.method330();
					local19 = local15 >> 2;
					local23 = local15 & 0x3;
					local28 = this.anIntArray243[local19];
					local304 = arg0.method311();
					local36 = this.anInt889 + (local304 >> 4 & 0x7);
					local45 = this.anInt890 + (local304 & 0x7);
					if (local36 >= 0 && local45 >= 0 && local36 < 103 && local45 < 103) {
						local52 = this.anIntArrayArrayArray8[this.anInt942][local36][local45];
						local441 = this.anIntArrayArrayArray8[this.anInt942][local36 + 1][local45];
						local61 = this.anIntArrayArrayArray8[this.anInt942][local36 + 1][local45 + 1];
						local65 = this.anIntArrayArrayArray8[this.anInt942][local36][local45 + 1];
						if (local28 == 0) {
							@Pc(478) Class45 local478 = this.aClass23_1.method212(this.anInt942, local36, local45);
							if (local478 != null) {
								@Pc(487) int local487 = local478.anInt635 >> 14 & 0x7FFF;
								if (local19 == 2) {
									local478.aClass10_Sub1_Sub2_7 = new Class10_Sub1_Sub2_Sub5(local12, local61, local65, local441, 2, (byte) 3, local487, false, local52, local23 + 4);
									local478.aClass10_Sub1_Sub2_8 = new Class10_Sub1_Sub2_Sub5(local12, local61, local65, local441, 2, (byte) 3, local487, false, local52, local23 + 1 & 0x3);
								} else {
									local478.aClass10_Sub1_Sub2_7 = new Class10_Sub1_Sub2_Sub5(local12, local61, local65, local441, local19, (byte) 3, local487, false, local52, local23);
								}
							}
						}
						if (local28 == 1) {
							@Pc(555) Class36 local555 = this.aClass23_1.method213(this.anInt942, local45, local36);
							if (local555 != null) {
								local555.aClass10_Sub1_Sub2_6 = new Class10_Sub1_Sub2_Sub5(local12, local61, local65, local441, 4, (byte) 3, local555.anInt561 >> 14 & 0x7FFF, false, local52, 0);
							}
						}
						if (local28 == 2) {
							@Pc(589) Class5 local589 = this.aClass23_1.method214(local36, local45, this.anInt942);
							if (local19 == 11) {
								local19 = 10;
							}
							if (local589 != null) {
								local589.aClass10_Sub1_Sub2_1 = new Class10_Sub1_Sub2_Sub5(local12, local61, local65, local441, local19, (byte) 3, local589.anInt50 >> 14 & 0x7FFF, false, local52, local23);
							}
						}
						if (local28 == 3) {
							@Pc(628) Class29 local628 = this.aClass23_1.method215(this.anInt942, local45, local36);
							if (local628 != null) {
								local628.aClass10_Sub1_Sub2_5 = new Class10_Sub1_Sub2_Sub5(local12, local61, local65, local441, 22, (byte) 3, local628.anInt446 >> 14 & 0x7FFF, false, local52, local23);
							}
						}
					}
				} else {
					@Pc(695) Class10_Sub1_Sub2_Sub1 local695;
					if (arg1 == 107) {
						local12 = arg0.method313();
						local15 = arg0.method331();
						local19 = this.anInt889 + (local15 >> 4 & 0x7);
						local23 = this.anInt890 + (local15 & 0x7);
						local28 = arg0.method340();
						if (local19 >= 0 && local23 >= 0 && local19 < 104 && local23 < 104) {
							local695 = new Class10_Sub1_Sub2_Sub1();
							local695.anInt211 = local12;
							local695.anInt213 = local28;
							if (this.aClass6ArrayArrayArray1[this.anInt942][local19][local23] == null) {
								this.aClass6ArrayArrayArray1[this.anInt942][local19][local23] = new Class6(true);
							}
							this.aClass6ArrayArrayArray1[this.anInt942][local19][local23].method3(local695);
							this.method601(local19, local23);
						}
					} else if (arg1 == 121) {
						local12 = arg0.method311();
						local15 = this.anInt889 + (local12 >> 4 & 0x7);
						local19 = this.anInt890 + (local12 & 0x7);
						local23 = arg0.method313();
						local28 = arg0.method313();
						local304 = arg0.method313();
						if (local15 >= 0 && local19 >= 0 && local15 < 104 && local19 < 104) {
							@Pc(791) Class6 local791 = this.aClass6ArrayArrayArray1[this.anInt942][local15][local19];
							if (local791 != null) {
								for (@Pc(797) Class10_Sub1_Sub2_Sub1 local797 = (Class10_Sub1_Sub2_Sub1) local791.method6(); local797 != null; local797 = (Class10_Sub1_Sub2_Sub1) local791.method8()) {
									if (local797.anInt211 == (local23 & 0x7FFF) && local797.anInt213 == local28) {
										local797.anInt213 = local304;
										break;
									}
								}
								this.method601(local15, local19);
							}
						}
					} else if (arg1 == 181) {
						local12 = arg0.method311();
						local15 = this.anInt889 + (local12 >> 4 & 0x7);
						local19 = this.anInt890 + (local12 & 0x7);
						local23 = local15 + arg0.method312();
						local28 = local19 + arg0.method312();
						local304 = arg0.method314();
						local36 = arg0.method313();
						local45 = arg0.method311() * 4;
						local52 = arg0.method311() * 4;
						local441 = arg0.method313();
						local61 = arg0.method313();
						local65 = arg0.method311();
						@Pc(886) int local886 = arg0.method311();
						if (local15 >= 0 && local19 >= 0 && local15 < 104 && local19 < 104 && local23 >= 0 && local28 >= 0 && local23 < 104 && local28 < 104 && local36 != 65535) {
							local15 = local15 * 128 + 64;
							local19 = local19 * 128 + 64;
							local23 = local23 * 128 + 64;
							local28 = local28 * 128 + 64;
							@Pc(962) Class10_Sub1_Sub2_Sub2 local962 = new Class10_Sub1_Sub2_Sub2(this.anInt942, local52, local886, local19, local36, local61 + anInt1050, local65, local304, (byte) -41, this.method685(local19, local15, this.anInt942) - local45, local15, local441 + anInt1050);
							local962.method187(local23, local28, this.method685(local28, local23, this.anInt942) - local52, local441 + anInt1050);
							this.aClass6_12.method3(local962);
						}
					} else {
						if (arg1 == 41) {
							local12 = arg0.method311();
							local15 = this.anInt889 + (local12 >> 4 & 0x7);
							local19 = this.anInt890 + (local12 & 0x7);
							local23 = arg0.method313();
							local28 = arg0.method311();
							local304 = local28 >> 4 & 0xF;
							local36 = local28 & 0x7;
							if (aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0] >= local15 - local304 && aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0] <= local15 + local304 && aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0] >= local19 - local304 && aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0] <= local19 + local304 && this.aBoolean265 && !aBoolean223 && this.anInt913 < 50) {
								this.anIntArray251[this.anInt913] = local23;
								this.anIntArray275[this.anInt913] = local36;
								this.anIntArray264[this.anInt913] = Class39.anIntArray171[local23];
								this.anInt913++;
							}
						}
						if (arg1 == 59) {
							local12 = arg0.method311();
							local15 = this.anInt889 + (local12 >> 4 & 0x7);
							local19 = this.anInt890 + (local12 & 0x7);
							local23 = arg0.method313();
							local28 = arg0.method311();
							local304 = arg0.method313();
							if (local15 >= 0 && local19 >= 0 && local15 < 104 && local19 < 104) {
								local15 = local15 * 128 + 64;
								local19 = local19 * 128 + 64;
								@Pc(1163) Class10_Sub1_Sub2_Sub6 local1163 = new Class10_Sub1_Sub2_Sub6(local15, this.anInt942, this.method685(local19, local15, this.anInt942) - local28, local304, local23, anInt1050, local19, 10709);
								this.aClass6_10.method3(local1163);
							}
						} else if (arg1 == 152) {
							local12 = arg0.method331();
							local15 = local12 >> 2;
							local19 = local12 & 0x3;
							local23 = this.anIntArray243[local15];
							local28 = arg0.method341();
							local304 = arg0.method330();
							local36 = this.anInt889 + (local304 >> 4 & 0x7);
							local45 = this.anInt890 + (local304 & 0x7);
							if (local36 >= 0 && local45 >= 0 && local36 < 104 && local45 < 104) {
								this.method720(this.anInt942, local36, local19, -1, local15, local28, 0, local23, local45);
							}
						} else if (arg1 == 208) {
							local12 = arg0.method340();
							local15 = arg0.method330();
							local19 = this.anInt889 + (local15 >> 4 & 0x7);
							local23 = this.anInt890 + (local15 & 0x7);
							if (local19 >= 0 && local23 >= 0 && local19 < 104 && local23 < 104) {
								@Pc(1283) Class6 local1283 = this.aClass6ArrayArrayArray1[this.anInt942][local19][local23];
								if (local1283 != null) {
									for (local695 = (Class10_Sub1_Sub2_Sub1) local1283.method6(); local695 != null; local695 = (Class10_Sub1_Sub2_Sub1) local1283.method8()) {
										if (local695.anInt211 == (local12 & 0x7FFF)) {
											local695.method534();
											break;
										}
									}
									if (local1283.method6() == null) {
										this.aClass6ArrayArrayArray1[this.anInt942][local19][local23] = null;
									}
									this.method601(local19, local23);
								}
							}
						} else if (arg1 == 88) {
							local12 = arg0.method332(this.anInt1006);
							local15 = this.anInt889 + (local12 >> 4 & 0x7);
							local19 = this.anInt890 + (local12 & 0x7);
							local23 = arg0.method332(this.anInt1006);
							local28 = local23 >> 2;
							local304 = local23 & 0x3;
							local36 = this.anIntArray243[local28];
							if (local15 >= 0 && local19 >= 0 && local15 < 104 && local19 < 104) {
								this.method720(this.anInt942, local15, local304, -1, local28, -1, 0, local36, local19);
							}
						}
					}
				}
			}
		} catch (@Pc(1393) RuntimeException local1393) {
			signlink.reporterror("94366, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local1393.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method709() {
		try {
			this.aClass19_15.method130();
			Class10_Sub1_Sub1_Sub4.anIntArray183 = this.anIntArray237;
			this.aClass10_Sub1_Sub1_Sub3_16.method440(0, 0);
			if (this.anInt941 != -1) {
				this.method717(0, 0, Class14.method87(this.anInt941), 0);
			} else if (this.anIntArray248[this.anInt1031] != -1) {
				this.method717(0, 0, Class14.method87(this.anIntArray248[this.anInt1031]), 0);
			}
			if (this.aBoolean237 && this.anInt1039 == 1) {
				this.method703();
			}
			this.aClass19_15.method131(205, 553, super.aGraphics2, this.aBoolean239);
			this.aClass19_17.method130();
			Class10_Sub1_Sub1_Sub4.anIntArray183 = this.anIntArray238;
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("69819, " + 7 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!LRUWCBNN;ZI)V")
	private void method711(@OriginalArg(0) Class10_Sub1_Sub2_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.method712(arg0.anInt739, arg1, arg0.anInt740);
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("22747, " + arg0 + ", " + false + ", " + arg1 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IIII)V")
	private void method712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg0 >= 128 && arg2 >= 128 && arg0 <= 13056 && arg2 <= 13056) {
				@Pc(28) int local28 = this.method685(arg2, arg0, this.anInt942) - arg1;
				@Pc(33) int local33 = arg0 - this.anInt990;
				@Pc(38) int local38 = local28 - this.anInt991;
				@Pc(43) int local43 = arg2 - this.anInt992;
				@Pc(48) int local48 = Class10_Sub1_Sub2_Sub4.anIntArray146[this.anInt993];
				@Pc(53) int local53 = Class10_Sub1_Sub2_Sub4.anIntArray147[this.anInt993];
				@Pc(58) int local58 = Class10_Sub1_Sub2_Sub4.anIntArray146[this.anInt994];
				@Pc(63) int local63 = Class10_Sub1_Sub2_Sub4.anIntArray147[this.anInt994];
				@Pc(73) int local73 = local43 * local58 + local33 * local63 >> 16;
				@Pc(83) int local83 = local43 * local63 - local33 * local58 >> 16;
				@Pc(85) int local85 = local73;
				@Pc(95) int local95 = local38 * local53 - local83 * local48 >> 16;
				@Pc(105) int local105 = local38 * local48 + local83 * local53 >> 16;
				if (local105 >= 50) {
					this.anInt872 = Class10_Sub1_Sub1_Sub4.anInt686 + (local85 << 9) / local105;
					this.anInt873 = Class10_Sub1_Sub1_Sub4.anInt687 + (local95 << 9) / local105;
				} else {
					this.anInt872 = -1;
					this.anInt873 = -1;
				}
			} else {
				this.anInt872 = -1;
				this.anInt873 = -1;
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("91402, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -214 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(Z)V")
	private void method713() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt945);
			if (this.aClass33_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass33_Sub1_1.anInt788);
			}
			System.out.println("loop-cycle:" + anInt1050);
			System.out.println("draw-cycle:" + anInt1044);
			System.out.println("ptype:" + this.anInt844);
			System.out.println("psize:" + this.anInt843);
			if (this.aClass18_1 != null) {
				this.aClass18_1.method121();
			}
			super.aBoolean213 = true;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("7648, " + false + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)Ljava/awt/Component;")
	@Override
	protected Component method586() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("16126, " + -756 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLjava/lang/String;)V")
	@Override
	protected void method588(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		try {
			this.anInt1048 = arg0;
			this.aString25 = arg1;
			this.method639();
			if (this.aClass2_2 == null) {
				super.method588(arg0, arg1);
			} else {
				this.aClass19_21.method130();
				this.aClass10_Sub1_Sub1_Sub2_4.method148(180, 452, 54, 16777215, "RuneScape is loading - please wait...");
				Class10_Sub1_Sub1.method500(62, 34, 9179409, 28, 304);
				Class10_Sub1_Sub1.method500(63, 32, 0, 29, 302);
				Class10_Sub1_Sub1.method499(30, 64, 9179409, arg0 * 3, 30);
				Class10_Sub1_Sub1.method499(30, 64, 0, 300 - arg0 * 3, arg0 * 3 + 30);
				this.aClass10_Sub1_Sub1_Sub2_4.method148(180, 452, 85, 16777215, arg1);
				this.aClass19_21.method131(171, 202, super.aGraphics2, this.aBoolean239);
				if (this.aBoolean236) {
					this.aBoolean236 = false;
					if (!this.aBoolean257) {
						this.aClass19_22.method131(0, 0, super.aGraphics2, this.aBoolean239);
						this.aClass19_23.method131(0, 637, super.aGraphics2, this.aBoolean239);
					}
					this.aClass19_19.method131(0, 128, super.aGraphics2, this.aBoolean239);
					this.aClass19_20.method131(371, 202, super.aGraphics2, this.aBoolean239);
					this.aClass19_24.method131(265, 0, super.aGraphics2, this.aBoolean239);
					this.aClass19_25.method131(265, 562, super.aGraphics2, this.aBoolean239);
					this.aClass19_26.method131(171, 128, super.aGraphics2, this.aBoolean239);
					this.aClass19_27.method131(171, 562, super.aGraphics2, this.aBoolean239);
				}
			}
		} catch (@Pc(229) RuntimeException local229) {
			signlink.reporterror("97534, " + arg0 + ", " + true + ", " + arg1 + ", " + local229.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(Z)V")
	private void method714(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(7) byte[] local7 = this.aClass2_2.method2("title.dat", null);
			@Pc(13) Class10_Sub1_Sub1_Sub1 local13 = new Class10_Sub1_Sub1_Sub1(local7, this);
			this.aClass19_22.method130();
			local13.method76(0, 0);
			this.aClass19_23.method130();
			local13.method76(0, -637);
			this.aClass19_19.method130();
			local13.method76(0, -128);
			this.aClass19_20.method130();
			local13.method76(-371, -202);
			this.aClass19_21.method130();
			local13.method76(-171, -202);
			this.aClass19_24.method130();
			local13.method76(-265, 0);
			this.aClass19_25.method130();
			local13.method76(-265, -562);
			this.aClass19_26.method130();
			local13.method76(-171, -128);
			this.aClass19_27.method130();
			local13.method76(-171, -562);
			@Pc(98) int[] local98 = new int[local13.anInt104];
			@Pc(104) int local104;
			for (@Pc(100) int local100 = 0; local100 < local13.anInt105; local100++) {
				for (local104 = 0; local104 < local13.anInt104; local104++) {
					local98[local104] = local13.anIntArray37[local13.anInt104 + local13.anInt104 * local100 - local104 - 1];
				}
				for (@Pc(130) int local130 = 0; local130 < local13.anInt104; local130++) {
					local13.anIntArray37[local130 + local13.anInt104 * local100] = local98[local130];
				}
			}
			this.aClass19_22.method130();
			local13.method76(0, 382);
			this.aClass19_23.method130();
			local13.method76(0, -255);
			this.aClass19_19.method130();
			local13.method76(0, 254);
			this.aClass19_20.method130();
			local13.method76(-371, 180);
			this.aClass19_21.method130();
			local13.method76(-171, 180);
			this.aClass19_24.method130();
			if (arg0) {
				for (local104 = 1; local104 > 0; local104++) {
				}
			}
			local13.method76(-265, 382);
			this.aClass19_25.method130();
			local13.method76(-265, -180);
			this.aClass19_26.method130();
			local13.method76(-171, 254);
			this.aClass19_27.method130();
			local13.method76(-171, -180);
			local13 = new Class10_Sub1_Sub1_Sub1(this.aClass2_2, "logo", 0);
			this.aClass19_19.method130();
			local13.method78(18, 382 - local13.anInt104 / 2 - 128);
			System.gc();
		} catch (@Pc(282) RuntimeException local282) {
			signlink.reporterror("54886, " + arg0 + ", " + local282.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!NLLHDXXJ;)V")
	private void method715(@OriginalArg(1) Class10_Sub2 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt455 == 0) {
				local1 = this.aClass23_1.method216(arg0.anInt454, arg0.anInt456, arg0.anInt457);
			}
			if (arg0.anInt455 == 1) {
				local1 = this.aClass23_1.method217(arg0.anInt456, arg0.anInt454, arg0.anInt457);
			}
			if (arg0.anInt455 == 2) {
				local1 = this.aClass23_1.method218(arg0.anInt454, arg0.anInt456, arg0.anInt457);
			}
			if (arg0.anInt455 == 3) {
				local1 = this.aClass23_1.method219(arg0.anInt454, arg0.anInt456, arg0.anInt457);
			}
			if (local1 != 0) {
				@Pc(83) int local83 = this.aClass23_1.method220(arg0.anInt454, arg0.anInt456, arg0.anInt457, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local83 & 0x1F;
				local7 = local83 >> 6;
			}
			arg0.anInt450 = local3;
			arg0.anInt452 = local5;
			arg0.anInt451 = local7;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("50647, " + -61 + ", " + arg0 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method716() {
		try {
			this.aBoolean257 = false;
			while (this.aBoolean267) {
				this.aBoolean257 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass10_Sub1_Sub1_Sub3_19 = null;
			this.aClass10_Sub1_Sub1_Sub3_20 = null;
			this.aClass10_Sub1_Sub1_Sub3Array3 = null;
			this.anIntArray271 = null;
			this.anIntArray272 = null;
			this.anIntArray273 = null;
			this.anIntArray274 = null;
			this.anIntArray259 = null;
			this.anIntArray260 = null;
			this.anIntArray249 = null;
			this.anIntArray250 = null;
			this.aClass10_Sub1_Sub1_Sub1_3 = null;
			this.aClass10_Sub1_Sub1_Sub1_4 = null;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("64682, " + 28614 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!EWIXBTLV;II)V")
	private void method717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14 arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg2.anInt120 == 0 && arg2.anIntArray43 != null && (!arg2.aBoolean33 || this.anInt1037 == arg2.anInt111 || this.anInt1028 == arg2.anInt111 || this.anInt946 == arg2.anInt111)) {
				@Pc(29) int local29 = Class10_Sub1_Sub1.anInt678;
				@Pc(31) int local31 = Class10_Sub1_Sub1.anInt676;
				@Pc(33) int local33 = Class10_Sub1_Sub1.anInt679;
				@Pc(35) int local35 = Class10_Sub1_Sub1.anInt677;
				Class10_Sub1_Sub1.method496(arg0, arg1, arg0 + arg2.anInt121, arg1 + arg2.anInt123);
				@Pc(51) int local51 = arg2.anIntArray43.length;
				for (@Pc(59) int local59 = 0; local59 < local51; local59++) {
					@Pc(68) int local68 = arg2.anIntArray41[local59] + arg1;
					@Pc(77) int local77 = arg2.anIntArray46[local59] + arg0 - arg3;
					@Pc(83) Class14 local83 = Class14.method87(arg2.anIntArray43[local59]);
					@Pc(88) int local88 = local68 + local83.anInt117;
					@Pc(93) int local93 = local77 + local83.anInt134;
					if (local83.anInt124 > 0) {
						this.method678((byte) 2, local83);
					}
					if (local83.anInt120 == 0) {
						if (local83.anInt118 > local83.anInt147 - local83.anInt121) {
							local83.anInt118 = local83.anInt147 - local83.anInt121;
						}
						if (local83.anInt118 < 0) {
							local83.anInt118 = 0;
						}
						this.method717(local93, local88, local83, local83.anInt118);
						if (local83.anInt147 > local83.anInt121) {
							this.method631(local83.anInt118, local88 + local83.anInt123, local83.anInt121, local83.anInt147, local93);
						}
					} else if (local83.anInt120 != 1) {
						@Pc(165) int local165;
						@Pc(169) int local169;
						@Pc(180) int local180;
						@Pc(215) int local215;
						@Pc(222) int local222;
						@Pc(247) int local247;
						@Pc(163) int local163;
						@Pc(213) int local213;
						if (local83.anInt120 == 2) {
							local163 = 0;
							for (local165 = 0; local165 < local83.anInt121; local165++) {
								for (local169 = 0; local169 < local83.anInt123; local169++) {
									local180 = local88 + local169 * (local83.anInt137 + 32);
									@Pc(189) int local189 = local93 + local165 * (local83.anInt126 + 32);
									if (local163 < 20) {
										local180 += local83.anIntArray39[local163];
										local189 += local83.anIntArray38[local163];
									}
									if (local83.anIntArray44[local163] > 0) {
										local213 = 0;
										local215 = 0;
										local222 = local83.anIntArray44[local163] - 1;
										if (local180 > Class10_Sub1_Sub1.anInt678 - 32 && local180 < Class10_Sub1_Sub1.anInt679 && local189 > Class10_Sub1_Sub1.anInt676 - 32 && local189 < Class10_Sub1_Sub1.anInt677 || this.anInt950 != 0 && this.anInt949 == local163) {
											local247 = 0;
											if (this.anInt965 == 1 && this.anInt966 == local163 && this.anInt967 == local83.anInt111) {
												local247 = 16777215;
											}
											@Pc(271) Class10_Sub1_Sub1_Sub1 local271 = Class17.method113(local247, local83.anIntArray40[local163], local222);
											if (local271 != null) {
												@Pc(350) int local350;
												if (this.anInt950 != 0 && this.anInt949 == local163 && this.anInt948 == local83.anInt111) {
													local213 = super.anInt816 - this.anInt951;
													local215 = super.anInt817 - this.anInt952;
													if (local213 < 5 && local213 > -5) {
														local213 = 0;
													}
													if (local215 < 5 && local215 > -5) {
														local215 = 0;
													}
													if (this.anInt1022 < 5) {
														local213 = 0;
														local215 = 0;
													}
													local271.method80(local180 + local213, local189 + local215);
													if (local189 + local215 < Class10_Sub1_Sub1.anInt676 && arg2.anInt118 > 0) {
														local350 = this.anInt878 * (Class10_Sub1_Sub1.anInt676 - local189 - local215) / 3;
														if (local350 > this.anInt878 * 10) {
															local350 = this.anInt878 * 10;
														}
														if (local350 > arg2.anInt118) {
															local350 = arg2.anInt118;
														}
														arg2.anInt118 -= local350;
														this.anInt952 += local350;
													}
													if (local189 + local215 + 32 > Class10_Sub1_Sub1.anInt677 && arg2.anInt118 < arg2.anInt147 - arg2.anInt121) {
														local350 = this.anInt878 * (local189 + local215 + 32 - Class10_Sub1_Sub1.anInt677) / 3;
														if (local350 > this.anInt878 * 10) {
															local350 = this.anInt878 * 10;
														}
														if (local350 > arg2.anInt147 - arg2.anInt121 - arg2.anInt118) {
															local350 = arg2.anInt147 - arg2.anInt121 - arg2.anInt118;
														}
														arg2.anInt118 += local350;
														this.anInt952 -= local350;
													}
												} else if (this.anInt1056 != 0 && this.anInt1055 == local163 && this.anInt1054 == local83.anInt111) {
													local271.method80(local180, local189);
												} else {
													local271.method78(local189, local180);
												}
												if (local271.anInt108 == 33 || local83.anIntArray40[local163] != 1) {
													local350 = local83.anIntArray40[local163];
													this.aClass10_Sub1_Sub1_Sub2_2.method152(local180 + local213 + 1, 0, local189 + local215 + 10, method595(local350));
													this.aClass10_Sub1_Sub1_Sub2_2.method152(local180 + local213, 16776960, local189 + local215 + 9, method595(local350));
												}
											}
										}
									} else if (local83.aClass10_Sub1_Sub1_Sub1Array1 != null && local163 < 20) {
										@Pc(539) Class10_Sub1_Sub1_Sub1 local539 = local83.aClass10_Sub1_Sub1_Sub1Array1[local163];
										if (local539 != null) {
											local539.method78(local189, local180);
										}
									}
									local163++;
								}
							}
						} else if (local83.anInt120 == 3) {
							@Pc(564) boolean local564 = false;
							if (this.anInt946 == local83.anInt111 || this.anInt1028 == local83.anInt111 || this.anInt1037 == local83.anInt111) {
								local564 = true;
							}
							if (this.method670(local83)) {
								local163 = local83.anInt135;
								if (local564 && local83.anInt115 != 0) {
									local163 = local83.anInt115;
								}
							} else {
								local163 = local83.anInt122;
								if (local564 && local83.anInt136 != 0) {
									local163 = local83.anInt136;
								}
							}
							if (local83.aByte9 == 0) {
								if (local83.aBoolean36) {
									Class10_Sub1_Sub1.method499(local83.anInt121, local93, local163, local83.anInt123, local88);
								} else {
									Class10_Sub1_Sub1.method500(local93, local83.anInt121, local163, local88, local83.anInt123);
								}
							} else if (local83.aBoolean36) {
								Class10_Sub1_Sub1.method498(local163, local93, local83.anInt123, local83.anInt121, 256 - (local83.aByte9 & 0xFF), local88);
							} else {
								Class10_Sub1_Sub1.method501(local88, local83.anInt123, local163, local83.anInt121, local93, 256 - (local83.aByte9 & 0xFF));
							}
						} else {
							@Pc(682) Class10_Sub1_Sub1_Sub2 local682;
							@Pc(959) String local959;
							if (local83.anInt120 == 4) {
								local682 = local83.aClass10_Sub1_Sub1_Sub2_1;
								@Pc(685) String local685 = local83.aString2;
								@Pc(687) boolean local687 = false;
								if (this.anInt946 == local83.anInt111 || this.anInt1028 == local83.anInt111 || this.anInt1037 == local83.anInt111) {
									local687 = true;
								}
								if (this.method670(local83)) {
									local165 = local83.anInt135;
									if (local687 && local83.anInt115 != 0) {
										local165 = local83.anInt115;
									}
									if (local83.aString3.length() > 0) {
										local685 = local83.aString3;
									}
								} else {
									local165 = local83.anInt122;
									if (local687 && local83.anInt136 != 0) {
										local165 = local83.anInt136;
									}
								}
								if (local83.anInt150 == 6 && this.aBoolean254) {
									local685 = "Please wait...";
									local165 = local83.anInt122;
								}
								if (Class10_Sub1_Sub1.anInt674 == 479) {
									if (local165 == 16776960) {
										local165 = 255;
									}
									if (local165 == 49152) {
										local165 = 16777215;
									}
								}
								local213 = local93 + local682.anInt230;
								while (local685.length() > 0) {
									if (local685.indexOf("%") != -1) {
										label390: while (true) {
											local215 = local685.indexOf("%1");
											if (local215 == -1) {
												while (true) {
													local215 = local685.indexOf("%2");
													if (local215 == -1) {
														while (true) {
															local215 = local685.indexOf("%3");
															if (local215 == -1) {
																while (true) {
																	local215 = local685.indexOf("%4");
																	if (local215 == -1) {
																		while (true) {
																			local215 = local685.indexOf("%5");
																			if (local215 == -1) {
																				break label390;
																			}
																			local685 = local685.substring(0, local215) + this.method664(this.method704(4, local83)) + local685.substring(local215 + 2);
																		}
																	}
																	local685 = local685.substring(0, local215) + this.method664(this.method704(3, local83)) + local685.substring(local215 + 2);
																}
															}
															local685 = local685.substring(0, local215) + this.method664(this.method704(2, local83)) + local685.substring(local215 + 2);
														}
													}
													local685 = local685.substring(0, local215) + this.method664(this.method704(1, local83)) + local685.substring(local215 + 2);
												}
											}
											local685 = local685.substring(0, local215) + this.method664(this.method704(0, local83)) + local685.substring(local215 + 2);
										}
									}
									local215 = local685.indexOf("\\n");
									if (local215 == -1) {
										local959 = local685;
										local685 = "";
									} else {
										local959 = local685.substring(0, local215);
										local685 = local685.substring(local215 + 2);
									}
									if (local83.aBoolean40) {
										local682.method149(local83.aBoolean37, this.anInt928, local165, local213, local88 + local83.anInt123 / 2, local959);
									} else {
										local682.method156(local165, local88, local213, local83.aBoolean37, local959);
									}
									local213 += local682.anInt230;
								}
							} else if (local83.anInt120 == 5) {
								@Pc(1021) Class10_Sub1_Sub1_Sub1 local1021;
								if (this.method670(local83)) {
									local1021 = local83.aClass10_Sub1_Sub1_Sub1_2;
								} else {
									local1021 = local83.aClass10_Sub1_Sub1_Sub1_1;
								}
								if (local1021 != null) {
									local1021.method78(local93, local88);
								}
							} else if (local83.anInt120 == 6) {
								local163 = Class10_Sub1_Sub1_Sub4.anInt686;
								local165 = Class10_Sub1_Sub1_Sub4.anInt687;
								Class10_Sub1_Sub1_Sub4.anInt686 = local88 + local83.anInt123 / 2;
								Class10_Sub1_Sub1_Sub4.anInt687 = local93 + local83.anInt121 / 2;
								local169 = Class10_Sub1_Sub1_Sub4.anIntArray181[local83.anInt130] * local83.anInt129 >> 16;
								local180 = Class10_Sub1_Sub1_Sub4.anIntArray182[local83.anInt130] * local83.anInt129 >> 16;
								@Pc(1082) boolean local1082 = this.method670(local83);
								if (local1082) {
									local213 = local83.anInt149;
								} else {
									local213 = local83.anInt148;
								}
								@Pc(1102) Class10_Sub1_Sub2_Sub4 local1102;
								if (local213 == -1) {
									local1102 = local83.method95(-1, -1, local1082);
								} else {
									@Pc(1108) Class15 local1108 = Class15.aClass15Array1[local213];
									local1102 = local83.method95(local1108.anIntArray47[local83.anInt119], local1108.anIntArray48[local83.anInt119], local1082);
								}
								if (local1102 != null) {
									local1102.method292(local83.anInt131, 0, local83.anInt130, 0, local169, local180);
								}
								Class10_Sub1_Sub1_Sub4.anInt686 = local163;
								Class10_Sub1_Sub1_Sub4.anInt687 = local165;
							} else {
								if (local83.anInt120 == 7) {
									local682 = local83.aClass10_Sub1_Sub1_Sub2_1;
									local165 = 0;
									for (local169 = 0; local169 < local83.anInt121; local169++) {
										for (local180 = 0; local180 < local83.anInt123; local180++) {
											if (local83.anIntArray44[local165] > 0) {
												@Pc(1172) Class17 local1172 = Class17.method104(local83.anIntArray44[local165] - 1);
												@Pc(1176) String local1176 = String.valueOf(local1172.aString7);
												if (local1172.aBoolean52 || local83.anIntArray40[local165] != 1) {
													local1176 = local1176 + " x" + method710(local83.anIntArray40[local165]);
												}
												local215 = local88 + local180 * (local83.anInt137 + 115);
												local222 = local93 + local169 * (local83.anInt126 + 12);
												if (local83.aBoolean40) {
													local682.method149(local83.aBoolean37, this.anInt928, local83.anInt122, local222, local215 + local83.anInt123 / 2, local1176);
												} else {
													local682.method156(local83.anInt122, local215, local222, local83.aBoolean37, local1176);
												}
											}
											local165++;
										}
									}
								}
								if (local83.anInt120 == 8 && (this.anInt1030 == local83.anInt111 || this.anInt918 == local83.anInt111 || this.anInt959 == local83.anInt111) && this.anInt856 == 100) {
									local163 = 0;
									local165 = 0;
									@Pc(1291) Class10_Sub1_Sub1_Sub2 local1291 = this.aClass10_Sub1_Sub1_Sub2_3;
									@Pc(1294) String local1294 = local83.aString2;
									while (local1294.length() > 0) {
										local213 = local1294.indexOf("\\n");
										if (local213 == -1) {
											local959 = local1294;
											local1294 = "";
										} else {
											local959 = local1294.substring(0, local213);
											local1294 = local1294.substring(local213 + 2);
										}
										local215 = local1291.method150(local959);
										if (local215 > local163) {
											local163 = local215;
										}
										local165 += local1291.anInt230 + 1;
									}
									local163 += 6;
									local165 += 7;
									local213 = local88 + local83.anInt123 - local163 - 5;
									local215 = local93 + local83.anInt121 + 5;
									if (local213 < local88 + 5) {
										local213 = local88 + 5;
									}
									if (local213 + local163 > arg1 + arg2.anInt123) {
										local213 = arg1 + arg2.anInt123 - local163;
									}
									if (local215 + local165 > arg0 + arg2.anInt121) {
										local215 = arg0 + arg2.anInt121 - local165;
									}
									Class10_Sub1_Sub1.method499(local165, local215, 16777120, local163, local213);
									Class10_Sub1_Sub1.method500(local215, local165, 0, local213, local163);
									local1294 = local83.aString2;
									local222 = local215 + local1291.anInt230 + 2;
									while (local1294.length() > 0) {
										local247 = local1294.indexOf("\\n");
										if (local247 == -1) {
											local959 = local1294;
											local1294 = "";
										} else {
											local959 = local1294.substring(0, local247);
											local1294 = local1294.substring(local247 + 2);
										}
										local1291.method156(0, local213 + 3, local222, false, local959);
										local222 += local1291.anInt230 + 1;
									}
								}
							}
						}
					}
				}
				Class10_Sub1_Sub1.method496(local31, local29, local35, local33);
			}
		} catch (@Pc(1479) RuntimeException local1479) {
			signlink.reporterror("31048, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 8 + ", " + local1479.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method718() {
		try {
			if (aBoolean223 && this.anInt933 == 2 && Class8.anInt60 != this.anInt942) {
				this.method700(null, "Loading - please wait.");
				this.anInt933 = 1;
				this.aLong32 = System.currentTimeMillis();
			}
			if (this.anInt933 == 1) {
				@Pc(37) int local37 = this.method719();
				if (local37 != 0 && System.currentTimeMillis() - this.aLong32 > 360000L) {
					signlink.reporterror(this.aString27 + " glcfb " + this.aLong30 + "," + local37 + "," + aBoolean223 + "," + this.aClass24Array1[0] + "," + this.aClass33_Sub1_1.method562() + "," + this.anInt942 + "," + this.anInt854 + "," + this.anInt855);
					this.aLong32 = System.currentTimeMillis();
				}
			}
			if (this.anInt933 == 2 && this.anInt942 != this.anInt1026) {
				this.anInt1026 = this.anInt942;
				this.method690(this.anInt942);
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("75168, " + -40 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)I")
	private int method719() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray5.length; local3++) {
				if (this.aByteArrayArray5[local3] == null && this.anIntArray217[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray6[local3] == null && this.anIntArray218[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(55) int local55 = 0; local55 < this.aByteArrayArray5.length; local55++) {
				@Pc(62) byte[] local62 = this.aByteArrayArray6[local55];
				if (local62 != null) {
					@Pc(76) int local76 = (this.anIntArray216[local55] >> 8) * 64 - this.anInt914;
					@Pc(88) int local88 = (this.anIntArray216[local55] & 0xFF) * 64 - this.anInt915;
					if (this.aBoolean247) {
						local76 = 10;
						local88 = 10;
					}
					local39 &= Class8.method29(local76, local88, local62);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean251) {
				return -4;
			} else {
				this.anInt933 = 2;
				Class8.anInt60 = this.anInt942;
				this.method668(175);
				this.aClass10_Sub1_Sub3_7.method300(6);
				return 0;
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("80821, " + 5 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIIIIIIII)V")
	private void method720(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(1) Class10_Sub2 local1 = null;
			for (@Pc(6) Class10_Sub2 local6 = (Class10_Sub2) this.aClass6_11.method6(); local6 != null; local6 = (Class10_Sub2) this.aClass6_11.method8()) {
				if (local6.anInt454 == arg0 && local6.anInt456 == arg1 && local6.anInt457 == arg8 && local6.anInt455 == arg7) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class10_Sub2();
				local1.anInt454 = arg0;
				local1.anInt455 = arg7;
				local1.anInt456 = arg1;
				local1.anInt457 = arg8;
				this.method715(local1);
				this.aClass6_11.method3(local1);
			}
			local1.anInt447 = arg5;
			local1.anInt449 = arg4;
			local1.anInt448 = arg2;
			local1.anInt458 = arg6;
			local1.anInt453 = arg3;
			this.aBoolean244 &= true;
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("63025, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method721() {
		try {
			if (this.anInt923 == 0 && super.anInt821 == 1) {
				@Pc(18) int local18 = super.anInt822 - 25 - 550;
				@Pc(25) int local25 = super.anInt823 - 5 - 4;
				if (local18 >= 0 && local25 >= 0 && local18 < 146 && local25 < 151) {
					local18 -= 73;
					local25 -= 75;
					@Pc(45) int local45 = this.anInt1013 + this.anInt864 & 0x7FF;
					@Pc(49) int local49 = Class10_Sub1_Sub1_Sub4.anIntArray181[local45];
					@Pc(53) int local53 = Class10_Sub1_Sub1_Sub4.anIntArray182[local45];
					@Pc(62) int local62 = local49 * (this.anInt1003 + 256) >> 8;
					@Pc(71) int local71 = local53 * (this.anInt1003 + 256) >> 8;
					@Pc(81) int local81 = local25 * local62 + local18 * local71 >> 11;
					@Pc(91) int local91 = local25 * local71 - local18 * local62 >> 11;
					@Pc(98) int local98 = aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt739 + local81 >> 7;
					@Pc(105) int local105 = aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt740 - local91 >> 7;
					@Pc(126) boolean local126 = this.method610(true, local105, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray194[0], 0, 0, 1, 0, local98, 0, 0, aClass10_Sub1_Sub2_Sub3_Sub2_1.anIntArray193[0]);
					if (local126) {
						this.aClass10_Sub1_Sub3_7.method301(local18);
						this.aClass10_Sub1_Sub3_7.method301(local25);
						this.aClass10_Sub1_Sub3_7.method302(this.anInt1013);
						this.aClass10_Sub1_Sub3_7.method301(57);
						this.aClass10_Sub1_Sub3_7.method301(this.anInt864);
						this.aClass10_Sub1_Sub3_7.method301(this.anInt1003);
						this.aClass10_Sub1_Sub3_7.method301(89);
						this.aClass10_Sub1_Sub3_7.method302(aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt739);
						this.aClass10_Sub1_Sub3_7.method302(aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt740);
						this.aClass10_Sub1_Sub3_7.method301(this.anInt957);
						this.aClass10_Sub1_Sub3_7.method301(63);
						return;
					}
				}
			}
		} catch (@Pc(180) RuntimeException local180) {
			signlink.reporterror("47659, " + 4 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method722(@OriginalArg(0) int arg0) {
		try {
			if (super.aClass19_2 == null) {
				this.method716();
				this.aClass19_19 = null;
				this.aClass19_20 = null;
				this.aClass19_21 = null;
				if (arg0 >= 0) {
					this.anInt898 = -4;
				}
				this.aClass19_22 = null;
				this.aClass19_23 = null;
				this.aClass19_24 = null;
				this.aClass19_25 = null;
				this.aClass19_26 = null;
				this.aClass19_27 = null;
				this.aClass19_18 = null;
				this.aClass19_16 = null;
				this.aClass19_15 = null;
				this.aClass19_17 = null;
				this.aClass19_12 = null;
				this.aClass19_13 = null;
				this.aClass19_14 = null;
				super.aClass19_2 = new Class19(503, (byte) -12, this.method586(), 765);
				this.aBoolean236 = true;
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("50497, " + arg0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;)Z")
	private boolean method723(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(5) int local5 = 0; local5 < this.anInt838; local5++) {
				if (arg0.equalsIgnoreCase(this.aStringArray8[local5])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass10_Sub1_Sub2_Sub3_Sub2_1.aString14);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("13116, " + 13292 + ", " + arg0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
	private void method724() {
		try {
			@Pc(20) int local20;
			@Pc(27) int local27;
			if (this.anInt998 == 0) {
				local20 = super.anInt812 / 2 - 80;
				local27 = super.anInt813 / 2 + 20;
				local27 += 20;
				if (super.anInt821 == 1 && super.anInt822 >= local20 - 75 && super.anInt822 <= local20 + 75 && super.anInt823 >= local27 - 20 && super.anInt823 <= local27 + 20) {
					this.anInt998 = 3;
					this.anInt886 = 0;
				}
				local20 = super.anInt812 / 2 + 80;
				if (super.anInt821 == 1 && super.anInt822 >= local20 - 75 && super.anInt822 <= local20 + 75 && super.anInt823 >= local27 - 20 && super.anInt823 <= local27 + 20) {
					this.aString21 = "";
					this.aString22 = "Enter your username & password.";
					this.anInt998 = 2;
					this.anInt886 = 0;
				}
			} else if (this.anInt998 == 2) {
				local20 = super.anInt813 / 2 - 40;
				local20 += 30;
				local20 += 25;
				if (super.anInt821 == 1 && super.anInt823 >= local20 - 15 && super.anInt823 < local20) {
					this.anInt886 = 0;
				}
				local20 += 15;
				if (super.anInt821 == 1 && super.anInt823 >= local20 - 15 && super.anInt823 < local20) {
					this.anInt886 = 1;
				}
				local20 += 15;
				local27 = super.anInt812 / 2 - 80;
				@Pc(173) int local173 = super.anInt813 / 2 + 50;
				@Pc(174) int local174 = local173 + 20;
				if (super.anInt821 == 1 && super.anInt822 >= local27 - 75 && super.anInt822 <= local27 + 75 && super.anInt823 >= local174 - 20 && super.anInt823 <= local174 + 20) {
					this.anInt833 = 0;
					this.method654(this.aString27, this.aString28, false);
					if (this.aBoolean244) {
						return;
					}
				}
				local27 = super.anInt812 / 2 + 80;
				if (super.anInt821 == 1 && super.anInt822 >= local27 - 75 && super.anInt822 <= local27 + 75 && super.anInt823 >= local174 - 20 && super.anInt823 <= local174 + 20) {
					this.anInt998 = 0;
					this.aString27 = "";
					this.aString28 = "";
				}
				while (true) {
					while (true) {
						@Pc(264) int local264 = this.method580();
						if (local264 == -1) {
							return;
						}
						@Pc(269) boolean local269 = false;
						for (@Pc(271) int local271 = 0; local271 < aString23.length(); local271++) {
							if (local264 == aString23.charAt(local271)) {
								local269 = true;
								break;
							}
						}
						if (this.anInt886 == 0) {
							if (local264 == 8 && this.aString27.length() > 0) {
								this.aString27 = this.aString27.substring(0, this.aString27.length() - 1);
							}
							if (local264 == 9 || local264 == 10 || local264 == 13) {
								this.anInt886 = 1;
							}
							if (local269) {
								this.aString27 = this.aString27 + (char) local264;
							}
							if (this.aString27.length() > 12) {
								this.aString27 = this.aString27.substring(0, 12);
							}
						} else if (this.anInt886 == 1) {
							if (local264 == 8 && this.aString28.length() > 0) {
								this.aString28 = this.aString28.substring(0, this.aString28.length() - 1);
							}
							if (local264 == 9 || local264 == 10 || local264 == 13) {
								this.anInt886 = 0;
							}
							if (local269) {
								this.aString28 = this.aString28 + (char) local264;
							}
							if (this.aString28.length() > 20) {
								this.aString28 = this.aString28.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt998 == 3) {
				local20 = super.anInt812 / 2;
				local27 = super.anInt813 / 2 + 50;
				@Pc(428) int local428 = local27 + 20;
				if (super.anInt821 == 1 && super.anInt822 >= local20 - 75 && super.anInt822 <= local20 + 75 && super.anInt823 >= local428 - 20 && super.anInt823 <= local428 + 20) {
					this.anInt998 = 0;
					return;
				}
			}
		} catch (@Pc(461) RuntimeException local461) {
			signlink.reporterror("47621, " + -724 + ", " + local461.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(8) int local8 = this.aClass23_1.method216(arg1, arg2, arg0);
			@Pc(12) boolean local12 = false;
			@Pc(22) int local22;
			@Pc(28) int local28;
			@Pc(32) int local32;
			@Pc(34) int local34;
			@Pc(56) int local56;
			@Pc(62) int local62;
			if (local8 != 0) {
				local22 = this.aClass23_1.method220(arg1, arg2, arg0, local8);
				local28 = local22 >> 6 & 0x3;
				local32 = local22 & 0x1F;
				local34 = arg5;
				if (local8 > 0) {
					local34 = arg3;
				}
				@Pc(42) int[] local42 = this.aClass10_Sub1_Sub1_Sub1_11.anIntArray37;
				local56 = arg2 * 4 + (103 - arg0) * 512 * 4 + 24624;
				local62 = local8 >> 14 & 0x7FFF;
				@Pc(65) Class48 local65 = Class48.method523(local62);
				if (local65.anInt705 == -1) {
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
					@Pc(75) Class10_Sub1_Sub1_Sub3 local75 = this.aClass10_Sub1_Sub1_Sub3Array5[local65.anInt705];
					if (local75 != null) {
						@Pc(87) int local87 = (local65.anInt707 * 4 - local75.anInt652) / 2;
						@Pc(97) int local97 = (local65.anInt697 * 4 - local75.anInt653) / 2;
						local75.method440((104 - arg0 - local65.anInt697) * 4 + local97 + 48, arg2 * 4 + 48 + local87);
					}
				}
			}
			local8 = this.aClass23_1.method218(arg1, arg2, arg0);
			if (local8 != 0) {
				local22 = this.aClass23_1.method220(arg1, arg2, arg0, local8);
				local28 = local22 >> 6 & 0x3;
				local32 = local22 & 0x1F;
				local34 = local8 >> 14 & 0x7FFF;
				@Pc(451) Class48 local451 = Class48.method523(local34);
				@Pc(483) int local483;
				if (local451.anInt705 != -1) {
					@Pc(461) Class10_Sub1_Sub1_Sub3 local461 = this.aClass10_Sub1_Sub1_Sub3Array5[local451.anInt705];
					if (local461 != null) {
						local62 = (local451.anInt707 * 4 - local461.anInt652) / 2;
						local483 = (local451.anInt697 * 4 - local461.anInt653) / 2;
						local461.method440((104 - arg0 - local451.anInt697) * 4 + local483 + 48, arg2 * 4 + 48 + local62);
					}
				} else if (local32 == 9) {
					local56 = 15658734;
					if (local8 > 0) {
						local56 = 15597568;
					}
					@Pc(520) int[] local520 = this.aClass10_Sub1_Sub1_Sub1_11.anIntArray37;
					local483 = arg2 * 4 + (103 - arg0) * 512 * 4 + 24624;
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
			local8 = this.aClass23_1.method219(arg1, arg2, arg0);
			if (local8 != 0) {
				local22 = local8 >> 14 & 0x7FFF;
				@Pc(615) Class48 local615 = Class48.method523(local22);
				if (local615.anInt705 != -1) {
					@Pc(625) Class10_Sub1_Sub1_Sub3 local625 = this.aClass10_Sub1_Sub1_Sub3Array5[local615.anInt705];
					if (local625 != null) {
						local34 = (local615.anInt707 * 4 - local625.anInt652) / 2;
						@Pc(647) int local647 = (local615.anInt697 * 4 - local625.anInt653) / 2;
						local625.method440((104 - arg0 - local615.anInt697) * 4 + local647 + 48, arg2 * 4 + 48 + local34);
						return;
					}
				}
			}
		} catch (@Pc(671) RuntimeException local671) {
			signlink.reporterror("51834, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local671.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
	private void method726() {
		try {
			this.anInt962++;
			this.method694(true);
			this.method632(751, true);
			this.method694(false);
			this.method632(751, false);
			this.method626();
			this.method651();
			@Pc(35) int local35;
			@Pc(74) int local74;
			if (!this.aBoolean252) {
				local35 = this.anInt1012;
				if (this.anInt1033 / 256 > local35) {
					local35 = this.anInt1033 / 256;
				}
				if (this.aBooleanArray11[4] && this.anIntArray215[4] + 128 > local35) {
					local35 = this.anIntArray215[4] + 128;
				}
				local74 = this.anInt1013 + this.anInt1016 & 0x7FF;
				this.method669(this.method685(aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt740, aClass10_Sub1_Sub2_Sub3_Sub2_1.anInt739, this.anInt942) - 50, this.anInt1019, local35, local35 * 3 + 600, local74, this.anInt1020);
			}
			if (this.aBoolean252) {
				local35 = this.method693();
			} else {
				local35 = this.method692((byte) 1);
			}
			local74 = this.anInt990;
			@Pc(118) int local118 = this.anInt991;
			@Pc(121) int local121 = this.anInt992;
			@Pc(124) int local124 = this.anInt993;
			@Pc(127) int local127 = this.anInt994;
			@Pc(184) int local184;
			for (@Pc(137) int local137 = 0; local137 < 5; local137++) {
				if (this.aBooleanArray11[local137]) {
					local184 = (int) (Math.random() * (double) (this.anIntArray253[local137] * 2 + 1) - (double) this.anIntArray253[local137] + Math.sin((double) this.anIntArray257[local137] * ((double) this.anIntArray235[local137] / 100.0D)) * (double) this.anIntArray215[local137]);
					if (local137 == 0) {
						this.anInt990 += local184;
					}
					if (local137 == 1) {
						this.anInt991 += local184;
					}
					if (local137 == 2) {
						this.anInt992 += local184;
					}
					if (local137 == 3) {
						this.anInt994 = this.anInt994 + local184 & 0x7FF;
					}
					if (local137 == 4) {
						this.anInt993 += local184;
						if (this.anInt993 < 128) {
							this.anInt993 = 128;
						}
						if (this.anInt993 > 383) {
							this.anInt993 = 383;
						}
					}
				}
			}
			local184 = Class10_Sub1_Sub1_Sub4.anInt690;
			Class10_Sub1_Sub2_Sub4.aBoolean107 = true;
			Class10_Sub1_Sub2_Sub4.anInt419 = 0;
			Class10_Sub1_Sub2_Sub4.anInt417 = super.anInt816 - 4;
			Class10_Sub1_Sub2_Sub4.anInt418 = super.anInt817 - 4;
			Class10_Sub1_Sub1.method497();
			this.aClass23_1.method229(this.anInt990, local35, this.anInt991, this.anInt992, this.anInt994, this.anInt993);
			this.aClass23_1.method204(this.anInt859);
			this.method696();
			this.method702();
			this.method640(local184);
			this.method684();
			this.aClass19_17.method131(4, 4, super.aGraphics2, this.aBoolean239);
			this.anInt990 = local74;
			this.anInt991 = local118;
			this.anInt992 = local121;
			this.anInt993 = local124;
			this.anInt994 = local127;
		} catch (@Pc(325) RuntimeException local325) {
			signlink.reporterror("99254, " + 2 + ", " + local325.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
	private void method727() {
		try {
			for (@Pc(8) int local8 = 0; local8 < this.anInt913; local8++) {
				if (this.anIntArray264[local8] <= 0) {
					@Pc(17) boolean local17 = false;
					try {
						if (this.anIntArray251[local8] != this.anInt1024 || this.anIntArray275[local8] != this.anInt874) {
							@Pc(50) Class10_Sub1_Sub3 local50 = Class39.method409(this.anIntArray275[local8], this.anIntArray251[local8]);
							if (System.currentTimeMillis() + (long) (local50.anInt428 / 22) > this.aLong33 + (long) (this.anInt983 / 22)) {
								this.anInt983 = local50.anInt428;
								this.aLong33 = System.currentTimeMillis();
								if (this.method691(local50.anInt428, local50.aByteArray12)) {
									this.anInt1024 = this.anIntArray251[local8];
									this.anInt874 = this.anIntArray275[local8];
								} else {
									local17 = true;
								}
							}
						} else if (!this.method653()) {
							local17 = true;
						}
					} catch (@Pc(100) Exception local100) {
						if (signlink.reporterror) {
							this.aClass10_Sub1_Sub3_7.method300(80);
							this.aClass10_Sub1_Sub3_7.method302(this.anIntArray251[local8] & 0x7FFF);
						} else {
							this.aClass10_Sub1_Sub3_7.method300(80);
							this.aClass10_Sub1_Sub3_7.method302(-1);
						}
					}
					if (local17 && this.anIntArray264[local8] != -5) {
						this.anIntArray264[local8] = -5;
					} else {
						this.anInt913--;
						for (@Pc(143) int local143 = local8; local143 < this.anInt913; local143++) {
							this.anIntArray251[local143] = this.anIntArray251[local143 + 1];
							this.anIntArray275[local143] = this.anIntArray275[local143 + 1];
							this.anIntArray264[local143] = this.anIntArray264[local143 + 1];
						}
						local8--;
					}
				} else {
					@Pc(195) int local195 = this.anIntArray264[local8]--;
				}
			}
			if (this.anInt958 > 0) {
				this.anInt958 -= 20;
				if (this.anInt958 < 0) {
					this.anInt958 = 0;
				}
				if (this.anInt958 == 0 && this.aBoolean259 && !aBoolean223) {
					this.anInt1023 = this.anInt1051;
					this.aBoolean260 = true;
					this.aClass33_Sub1_1.method558(2, this.anInt1023);
					return;
				}
			}
		} catch (@Pc(241) RuntimeException local241) {
			signlink.reporterror("46583, " + -23763 + ", " + local241.toString());
			throw new RuntimeException();
		}
	}
}
