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

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
	private static int anInt837;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "Lclient!KVXZMJHR;")
	public static Class1_Sub1_Sub1_Sub4_Sub1 aClass1_Sub1_Sub1_Sub4_Sub1_1;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
	private static int anInt857;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
	private static int anInt867;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
	private static int anInt868;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "Z")
	private static boolean aBoolean203;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
	private static int anInt913;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "I")
	private static int anInt914;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
	public static int anInt953;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
	private static int anInt955;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
	private static int anInt959;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
	private static int anInt960;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "Z")
	private static boolean aBoolean216;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
	private static int anInt991;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
	private static int anInt997;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "Z")
	private static boolean aBoolean224;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
	private static int anInt1019;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "I")
	private static int anInt1029;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "I")
	public static int anInt1031;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "Z")
	private static boolean aBoolean234;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "I")
	private static int anInt1033;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
	private static int anInt846 = 7;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "Ljava/lang/String;")
	private static String aString20 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "[I")
	public static int[] anIntArray236 = new int[32];

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "[[I")
	public static final int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
	private static int anInt954;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "[I")
	public static final int[] anIntArray261;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
	private static int anInt1002;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "[I")
	private static int[] anIntArray270;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "Z")
	private static boolean aBoolean232;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
	private static int anInt1030;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "Z")
	private static boolean aBoolean233;

	@OriginalMember(owner = "client!client", name = "J", descriptor = "I")
	private int anInt824;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "Lclient!ZXDQRRNS;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_1;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "Lclient!ZXDQRRNS;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_2;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "Lclient!ZXDQRRNS;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "Lclient!ZXDQRRNS;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "Lclient!ZXDQRRNS;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_5;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "Lclient!PTISUREQ;")
	private Class31 aClass31_1;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "I")
	private int anInt825;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "Lclient!GXHGUSOD;")
	private Class10 aClass10_1;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "Lclient!KJGJRATW;")
	private Class18 aClass18_3;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "Lclient!KJGJRATW;")
	private Class18 aClass18_4;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "Lclient!KJGJRATW;")
	private Class18 aClass18_5;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Lclient!KJGJRATW;")
	private Class18 aClass18_6;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "Lclient!KJGJRATW;")
	private Class18 aClass18_7;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!KJGJRATW;")
	private Class18 aClass18_8;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Lclient!KJGJRATW;")
	private Class18 aClass18_9;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Lclient!KJGJRATW;")
	private Class18 aClass18_10;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Lclient!KJGJRATW;")
	private Class18 aClass18_11;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "I")
	private int anInt826;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
	private int anInt827;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
	private int anInt828;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
	private int anInt829;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	private int anInt830;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	private int anInt831;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	private int anInt832;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	private int anInt833;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
	private int anInt834;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
	private int anInt835;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
	private int anInt836;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
	private int anInt838;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
	private int anInt839;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
	private int anInt840;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
	private int anInt842;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
	private int anInt843;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private int anInt844;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
	private int anInt845;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "Lclient!ZXDQRRNS;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_6;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "Lclient!ZXDQRRNS;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_7;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "Lclient!ZXDQRRNS;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_8;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "Lclient!JAGFVRIK;")
	private Class14 aClass14_1;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
	private int anInt847;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
	private int anInt849;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
	private int anInt850;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
	private int anInt851;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
	private int anInt852;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt853;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
	private int anInt854;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "I")
	private int anInt855;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
	private int anInt856;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "Lclient!OMAKLDKI;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_3;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "Lclient!OMAKLDKI;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_4;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
	private int anInt858;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "I")
	private int anInt860;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
	private int anInt862;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
	private int anInt863;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
	private int anInt864;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
	private int anInt869;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
	private int anInt870;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "I")
	private int anInt871;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
	private int anInt873;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
	private int anInt874;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
	private int anInt875;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
	private int anInt877;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "[I")
	private int[] anIntArray224;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "[I")
	private int[] anIntArray225;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "[I")
	private int[] anIntArray226;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "[I")
	private int[] anIntArray227;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "[I")
	private int[] anIntArray228;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "[I")
	private int[] anIntArray229;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "Lclient!OMAKLDKI;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_5;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
	private int anInt879;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "[I")
	private int[] anIntArray232;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "[I")
	private int[] anIntArray233;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "I")
	private int anInt880;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
	private int anInt883;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
	private int anInt885;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "Lclient!OMAKLDKI;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_6;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "Lclient!OMAKLDKI;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_7;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
	private int anInt888;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "I")
	private int anInt890;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "Lclient!KJGJRATW;")
	private Class18 aClass18_12;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "Lclient!KJGJRATW;")
	private Class18 aClass18_13;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "Lclient!KJGJRATW;")
	private Class18 aClass18_14;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "Lclient!KJGJRATW;")
	private Class18 aClass18_15;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "Lclient!KJGJRATW;")
	private Class18 aClass18_16;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "Lclient!KJGJRATW;")
	private Class18 aClass18_17;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "Lclient!KJGJRATW;")
	private Class18 aClass18_18;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "Lclient!KJGJRATW;")
	private Class18 aClass18_19;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "Lclient!KJGJRATW;")
	private Class18 aClass18_20;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
	private int anInt891;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
	private int anInt892;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
	private int anInt893;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "I")
	private int anInt896;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
	private int anInt897;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "I")
	private int anInt899;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
	private int anInt900;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "I")
	private int anInt902;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "I")
	private int anInt903;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private int anInt904;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
	private int anInt905;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
	private int anInt906;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "Ljava/lang/String;")
	private String aString25;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
	private int anInt907;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "I")
	private int anInt911;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
	private int anInt915;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "Ljava/lang/String;")
	private String aString26;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
	private int anInt916;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
	private int anInt919;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
	private int anInt920;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
	private int anInt921;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
	private int anInt922;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
	private int anInt923;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private int anInt925;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "I")
	private int anInt927;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
	private int anInt928;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
	private int anInt929;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private int anInt930;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "Ljava/lang/String;")
	private String aString27;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
	private int anInt932;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "I")
	private int anInt934;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "[I")
	private int[] anIntArray249;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "[I")
	private int[] anIntArray250;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "[I")
	private int[] anIntArray251;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
	private int anInt936;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "I")
	private int anInt937;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
	private int anInt938;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "I")
	private int anInt939;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "I")
	private int anInt940;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
	private int anInt941;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
	private int anInt942;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "I")
	private int anInt943;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "[Lclient!ZXDQRRNS;")
	private Class1_Sub1_Sub2_Sub4[] aClass1_Sub1_Sub2_Sub4Array3;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
	private int anInt944;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "Lclient!WEMOPWVJ;")
	private Class43 aClass43_2;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
	private int anInt946;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "Lclient!ZXDQRRNS;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_9;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "Lclient!ZXDQRRNS;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_10;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
	private int anInt947;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private int anInt948;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "Lclient!OMAKLDKI;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_8;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "Lclient!ZXDQRRNS;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_11;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "Lclient!ZXDQRRNS;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_12;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "Lclient!ZXDQRRNS;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_13;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
	private int anInt951;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
	private int anInt952;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "Lclient!ZXDQRRNS;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_14;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "Lclient!ZXDQRRNS;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_15;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "Lclient!ZXDQRRNS;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_16;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "Lclient!ZXDQRRNS;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_17;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "Lclient!ZXDQRRNS;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_18;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "I")
	private int anInt961;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
	private int anInt962;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "I")
	private int anInt963;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
	private int anInt967;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
	private int anInt969;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
	private int anInt971;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
	private int anInt972;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
	private int anInt975;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
	private int anInt976;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
	private int anInt978;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "I")
	private int anInt980;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "I")
	private int anInt981;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "I")
	private int anInt982;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "I")
	private int anInt985;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "I")
	private int anInt986;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "I")
	private int anInt987;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
	private int anInt988;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
	private int anInt990;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
	private int anInt992;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
	private int anInt993;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "I")
	private int anInt994;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
	private int anInt995;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "Lclient!OMAKLDKI;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_9;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "I")
	private int anInt998;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
	private int anInt1000;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
	private int anInt1001;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "I")
	private int anInt1005;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "[I")
	private int[] anIntArray262;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "[I")
	private int[] anIntArray263;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "[I")
	private int[] anIntArray264;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "[I")
	private int[] anIntArray265;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
	private int anInt1010;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
	private int anInt1011;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
	private int anInt1012;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
	private int anInt1013;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
	private int anInt1014;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "I")
	private int anInt1015;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
	private int anInt1016;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
	private int anInt1018;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "I")
	private int anInt1024;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "I")
	private int anInt1025;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "Lclient!OPLZBITI;")
	private Class26 aClass26_2;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
	private int anInt1027;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "Lclient!KJGJRATW;")
	private Class18 aClass18_21;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "Lclient!KJGJRATW;")
	private Class18 aClass18_22;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "Lclient!KJGJRATW;")
	private Class18 aClass18_23;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "Lclient!OMAKLDKI;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_10;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "Lclient!ONSICLVF;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "Lclient!ONSICLVF;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "Lclient!ONSICLVF;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "Lclient!ONSICLVF;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "I")
	private int anInt1032;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "I")
	private int anInt1034;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
	private int anInt1035;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
	private int anInt1036;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
	private int anInt1037;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
	private int anInt1038;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "Ljava/lang/String;")
	private String aString31;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "I")
	private int anInt1039;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "Lclient!OMAKLDKI;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_11;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "Lclient!OMAKLDKI;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_12;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "Lclient!OMAKLDKI;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_13;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "Lclient!OMAKLDKI;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_14;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "Lclient!OMAKLDKI;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_15;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "I")
	private int anInt1040;

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "Lclient!IHBKBLZU;")
	private Class4_Sub1 aClass4_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "I")
	private int anInt1042;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "Lclient!OMAKLDKI;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_16;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "Lclient!OMAKLDKI;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_17;

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "Lclient!ZXDQRRNS;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_19;

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "Lclient!ZXDQRRNS;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_20;

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "Lclient!KJGJRATW;")
	private Class18 aClass18_24;

	@OriginalMember(owner = "client!client", name = "Pj", descriptor = "Lclient!KJGJRATW;")
	private Class18 aClass18_25;

	@OriginalMember(owner = "client!client", name = "Qj", descriptor = "Lclient!KJGJRATW;")
	private Class18 aClass18_26;

	@OriginalMember(owner = "client!client", name = "Rj", descriptor = "Lclient!KJGJRATW;")
	private Class18 aClass18_27;

	@OriginalMember(owner = "client!client", name = "Uj", descriptor = "I")
	private int anInt1047;

	@OriginalMember(owner = "client!client", name = "Vj", descriptor = "I")
	private int anInt1048;

	@OriginalMember(owner = "client!client", name = "Wj", descriptor = "I")
	private int anInt1049;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "Z")
	private volatile boolean aBoolean194 = false;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "Z")
	private volatile boolean aBoolean195 = false;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "Z")
	private boolean aBoolean196 = true;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "Ljava/lang/String;")
	private String aString18 = "";

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	private int anInt841 = -12340;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "[Lclient!OMAKLDKI;")
	private Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array4 = new Class1_Sub1_Sub2_Sub1[8];

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "B")
	private byte aByte29 = 1;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "Ljava/lang/String;")
	private String aString19 = "";

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[100];

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "[I")
	private int[] anIntArray212 = new int[100];

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "Z")
	private boolean aBoolean197 = false;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "[I")
	private int[] anIntArray213 = new int[200];

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private int anInt848 = 50;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "[I")
	private int[] anIntArray214 = new int[this.anInt848];

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "[I")
	private int[] anIntArray215 = new int[this.anInt848];

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "[I")
	private int[] anIntArray216 = new int[this.anInt848];

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "[I")
	private int[] anIntArray217 = new int[this.anInt848];

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "[I")
	private int[] anIntArray218 = new int[this.anInt848];

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "[I")
	private int[] anIntArray219 = new int[this.anInt848];

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "[I")
	private int[] anIntArray220 = new int[this.anInt848];

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[this.anInt848];

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "[I")
	private int[] anIntArray221 = new int[151];

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "[Lclient!OMAKLDKI;")
	private Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array5 = new Class1_Sub1_Sub2_Sub1[32];

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "Lclient!ETMNPRAF;")
	private Class8 aClass8_10 = new Class8(0);

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
	private int anInt859 = 1;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "Lclient!ETMNPRAF;")
	private Class8 aClass8_11 = new Class8(0);

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
	private int anInt861 = 1;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "B")
	private byte aByte30 = -10;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "Z")
	private boolean aBoolean198 = true;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "Z")
	private boolean aBoolean199 = true;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "I")
	private int anInt865 = 404;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
	private int anInt866 = -1;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "[[[Lclient!ETMNPRAF;")
	private Class8[][][] aClass8ArrayArrayArray1 = new Class8[4][104][104];

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "[I")
	private int[] anIntArray222 = new int[5];

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "Z")
	private boolean aBoolean200 = false;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "[I")
	private int[] anIntArray223 = new int[Class41.anInt683];

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "Lclient!SVWJKJVI;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_6 = Class1_Sub1_Sub4.method393();

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
	private int anInt876 = -309;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "B")
	private byte aByte31 = 112;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "Z")
	private boolean aBoolean201 = false;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
	private int anInt878 = -858;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "Z")
	private boolean aBoolean202 = false;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "Lclient!SVWJKJVI;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_7 = new Class1_Sub1_Sub4(new byte[5000], true);

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "[Lclient!PEHNWFXK;")
	private Class1_Sub1_Sub1_Sub4_Sub2[] aClass1_Sub1_Sub1_Sub4_Sub2Array1 = new Class1_Sub1_Sub1_Sub4_Sub2[16384];

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "[I")
	private int[] anIntArray230 = new int[16384];

	@OriginalMember(owner = "client!client", name = "id", descriptor = "[I")
	public int[] anIntArray231 = new int[2000];

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "md", descriptor = "Ljava/lang/String;")
	private String aString21 = "";

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "[I")
	private int[] anIntArray234 = new int[Class41.anInt683];

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "B")
	private byte aByte32 = -120;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "[I")
	private int[] anIntArray235 = new int[5];

	@OriginalMember(owner = "client!client", name = "td", descriptor = "I")
	private int anInt882 = 78;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "[I")
	private int[] anIntArray237 = new int[33];

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "Z")
	private boolean aBoolean204 = false;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
	private int anInt887 = -1;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
	private int anInt889 = 2;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "Ljava/lang/String;")
	private String aString22 = "";

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "[I")
	private int[] anIntArray238 = new int[100];

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[100];

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[100];

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "[Lclient!OMAKLDKI;")
	private Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array6 = new Class1_Sub1_Sub2_Sub1[1000];

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "Z")
	private boolean aBoolean205 = true;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
	private int anInt895 = 3;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
	private int anInt901 = -1;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "Z")
	private boolean aBoolean206 = false;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "Ljava/lang/String;")
	private String aString23 = "";

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "Ljava/lang/String;")
	private String aString24 = "";

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "Z")
	private boolean aBoolean207 = false;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "[I")
	private int[] anIntArray239 = new int[33];

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "[I")
	private int[] anIntArray240 = new int[500];

	@OriginalMember(owner = "client!client", name = "we", descriptor = "[I")
	private int[] anIntArray241 = new int[500];

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "[I")
	private int[] anIntArray242 = new int[500];

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "[I")
	private int[] anIntArray243 = new int[500];

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
	private int anInt908 = -1;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "I")
	private int anInt909 = 340;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
	private int anInt912 = 2;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
	private int anInt917 = 2;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "[[I")
	private int[][] anIntArrayArray22 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "[Lclient!ZXDQRRNS;")
	private Class1_Sub1_Sub2_Sub4[] aClass1_Sub1_Sub2_Sub4Array2 = new Class1_Sub1_Sub2_Sub4[2];

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "[I")
	private int[] anIntArray244 = new int[7];

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "[I")
	private int[] anIntArray245 = new int[50];

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
	private int anInt918 = 128;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "[I")
	private int[] anIntArray246 = new int[5];

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
	private int anInt924 = -1;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "Z")
	private boolean aBoolean208 = true;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "[[I")
	private int[][] anIntArrayArray23 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "Z")
	private boolean aBoolean209 = false;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "Z")
	private boolean aBoolean210 = false;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "[I")
	private int[] anIntArray247 = new int[1000];

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "[I")
	private int[] anIntArray248 = new int[5];

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "[Lclient!OMAKLDKI;")
	private Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array7 = new Class1_Sub1_Sub2_Sub1[20];

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
	private int anInt935 = 7759444;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "Lclient!NHFASBOX;")
	private Class24 aClass24_1 = new Class24();

	@OriginalMember(owner = "client!client", name = "If", descriptor = "B")
	private byte aByte33 = -22;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "Z")
	private boolean aBoolean211 = false;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "[Lclient!XFNDANMT;")
	public Class47[] aClass47Array1 = new Class47[5];

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
	private int anInt945 = -1;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "[I")
	private int[] anIntArray252 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "[I")
	private int[] anIntArray253 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "B")
	private byte aByte34 = 7;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "[I")
	private int[] anIntArray254 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
	private int anInt956 = 8494;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "[I")
	private int[] anIntArray255 = new int[50];

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "Z")
	private boolean aBoolean212 = false;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "Z")
	public boolean aBoolean213 = false;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "I")
	private int anInt958 = 5063219;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[5];

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "[I")
	private int[] anIntArray256 = new int[5];

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
	private int anInt966 = -1;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "[Lclient!OMAKLDKI;")
	private Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array8 = new Class1_Sub1_Sub2_Sub1[100];

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
	private int anInt968 = -22770;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "[I")
	private final int[] anIntArray257 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "Ljava/lang/String;")
	private String aString28 = "";

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "Ljava/lang/String;")
	private String aString29 = "";

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "Z")
	private boolean aBoolean214 = false;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "Z")
	private boolean aBoolean215 = true;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "[Lclient!ZXDQRRNS;")
	private Class1_Sub1_Sub2_Sub4[] aClass1_Sub1_Sub2_Sub4Array4 = new Class1_Sub1_Sub2_Sub4[100];

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "[Lclient!ZXDQRRNS;")
	private Class1_Sub1_Sub2_Sub4[] aClass1_Sub1_Sub2_Sub4Array5 = new Class1_Sub1_Sub2_Sub4[13];

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
	private int anInt979 = -1;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "Lclient!SVWJKJVI;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_8 = Class1_Sub1_Sub4.method393();

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "Z")
	private boolean aBoolean217 = false;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "I")
	private int anInt983 = -1;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "I")
	private int anInt984 = -1;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "[I")
	private int[] anIntArray258 = new int[2000];

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "Z")
	private boolean aBoolean218 = false;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "Z")
	private boolean aBoolean219 = false;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "[Lclient!OXMJPDWD;")
	private Class28[] aClass28Array1 = new Class28[4];

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "[I")
	private int[] anIntArray259 = new int[9];

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "[I")
	private int[] anIntArray260 = new int[50];

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "Z")
	private boolean aBoolean220 = false;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
	private int anInt989 = 7;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "Z")
	private boolean aBoolean221 = false;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "[Lclient!OMAKLDKI;")
	private Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array9 = new Class1_Sub1_Sub2_Sub1[32];

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "Lclient!SVWJKJVI;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_9 = Class1_Sub1_Sub4.method393();

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "Z")
	private boolean aBoolean222 = true;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
	private int anInt999 = -1;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "Z")
	private boolean aBoolean223 = true;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
	private int anInt1003 = -1;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "I")
	private int anInt1004 = -1;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[500];

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "I")
	private int anInt1006 = -21060;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "I")
	private int anInt1007 = -1;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
	private int anInt1008 = 2301979;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "Z")
	private volatile boolean aBoolean226 = false;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "[I")
	private int[] anIntArray266 = new int[1000];

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "[I")
	private int[] anIntArray267 = new int[1000];

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
	private int anInt1017 = -13325;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "Z")
	private boolean aBoolean227 = true;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "Ljava/lang/String;")
	private String aString30 = "";

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "I")
	private int anInt1021 = 3353893;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "Z")
	private boolean aBoolean228 = false;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
	private int anInt1022 = 2048;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
	private int anInt1023 = 2047;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "[Lclient!KVXZMJHR;")
	private Class1_Sub1_Sub1_Sub4_Sub1[] aClass1_Sub1_Sub1_Sub4_Sub1Array1 = new Class1_Sub1_Sub1_Sub4_Sub1[this.anInt1022];

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "[I")
	private int[] anIntArray268 = new int[this.anInt1022];

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "[I")
	private int[] anIntArray269 = new int[this.anInt1022];

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "[Lclient!SVWJKJVI;")
	private Class1_Sub1_Sub4[] aClass1_Sub1_Sub4Array1 = new Class1_Sub1_Sub4[this.anInt1022];

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "B")
	private byte aByte35 = -4;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "I")
	private int anInt1026 = -1;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "[J")
	private long[] aLongArray4 = new long[200];

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray14 = new String[200];

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "Z")
	private boolean aBoolean229 = false;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "[I")
	private int[] anIntArray271 = new int[Class41.anInt683];

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "[I")
	private int[] anIntArray272 = new int[] { 17, 24, 34, 40 };

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "[I")
	private int[] anIntArray273 = new int[256];

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "Z")
	private boolean aBoolean230 = false;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "Z")
	private boolean aBoolean231 = false;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "[I")
	private int[] anIntArray274 = new int[151];

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "I")
	private int anInt1041 = 25871;

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "B")
	private byte aByte36 = 123;

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "Z")
	private boolean aBoolean235 = false;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "Lclient!ETMNPRAF;")
	private Class8 aClass8_12 = new Class8(0);

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "I")
	private int anInt1043 = -1;

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "[I")
	private int[] anIntArray275 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "I")
	private int anInt1044 = 3;

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "I")
	private int anInt1045 = 42604;

	@OriginalMember(owner = "client!client", name = "Sj", descriptor = "[Lclient!OMAKLDKI;")
	private Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array10 = new Class1_Sub1_Sub2_Sub1[32];

	@OriginalMember(owner = "client!client", name = "Tj", descriptor = "I")
	private int anInt1046 = -214;

	@OriginalMember(owner = "client!client", name = "Xj", descriptor = "I")
	private final int anInt1050 = 100;

	@OriginalMember(owner = "client!client", name = "Yj", descriptor = "[I")
	private int[] anIntArray276 = new int[100];

	static {
		@Pc(13) int local13 = 2;
		@Pc(15) int local15;
		for (local15 = 0; local15 < 32; local15++) {
			anIntArray236[local15] = local13 - 1;
			local13 += local13;
		}
		anIntArrayArray24 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		anInt954 = -43582;
		anIntArray261 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		anInt1002 = 8;
		aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		anIntArray270 = new int[99];
		local13 = 0;
		for (local15 = 0; local15 < 99; local15++) {
			@Pc(378) int local378 = local15 + 1;
			@Pc(391) int local391 = (int) ((double) local378 + Math.pow(2.0D, (double) local378 / 7.0D) * 300.0D);
			local13 += local391;
			anIntArray270[local15] = local13 / 4;
		}
		aBoolean232 = true;
		anInt1030 = 10;
		aBoolean233 = true;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Ljava/lang/String;")
	private static String method594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg1 != -43582) {
				anInt846 = -357;
			}
			@Pc(8) int local8 = arg0 - arg2;
			if (local8 < -9) {
				return "@red@";
			} else if (local8 < -6) {
				return "@or3@";
			} else if (local8 < -3) {
				return "@or2@";
			} else if (local8 < 0) {
				return "@or1@";
			} else if (local8 > 9) {
				return "@gre@";
			} else if (local8 > 6) {
				return "@gr3@";
			} else if (local8 > 3) {
				return "@gr2@";
			} else if (local8 > 0) {
				return "@gr1@";
			} else {
				return "@yel@";
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("53137, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)Ljava/lang/String;")
	private static String method621(@OriginalArg(0) int arg0) {
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
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("69880, " + arg0 + ", " + 0 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)Ljava/lang/String;")
	private static String method653(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("90699, " + arg0 + ", " + -39512 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
	private static void method695() {
		try {
			Class10.aBoolean28 = true;
			Class1_Sub1_Sub2_Sub3.aBoolean131 = true;
			aBoolean234 = true;
			Class45.aBoolean175 = true;
			Class32.aBoolean125 = true;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("72435, " + 30 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 362);
			if (arg0.length == 5) {
				anInt1030 = Integer.parseInt(arg0[0]);
				anInt1031 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method695();
				} else if (arg0[2].equals("highmem")) {
					method719();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean233 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean233 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt1053 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method572();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private static void method719() {
		try {
			Class10.aBoolean28 = false;
			Class1_Sub1_Sub2_Sub3.aBoolean131 = false;
			aBoolean234 = false;
			Class45.aBoolean175 = false;
			Class32.aBoolean125 = false;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("8016, " + true + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIZII)V")
	private void method585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg5 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg1 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg3;
			@Pc(23) int local23;
			@Pc(27) int local27;
			@Pc(37) int local37;
			if (local5 != 0) {
				local23 = Class1_Sub1_Sub1_Sub3.anIntArray90[local5];
				local27 = Class1_Sub1_Sub1_Sub3.anIntArray91[local5];
				local37 = local27 * 0 - arg3 * local23 >> 16;
				local17 = local23 * 0 + arg3 * local27 >> 16;
				local15 = local37;
			}
			if (local11 != 0) {
				local23 = Class1_Sub1_Sub1_Sub3.anIntArray90[local11];
				local27 = Class1_Sub1_Sub1_Sub3.anIntArray91[local11];
				local37 = local17 * local23 + local27 * 0 >> 16;
				local17 = local17 * local27 - local23 * 0 >> 16;
				local13 = local37;
			}
			this.anInt896 = arg2 - local13;
			this.anInt897 = arg0 - local15;
			this.anInt898 = arg4 - local17;
			this.anInt899 = arg5;
			this.anInt900 = arg1;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("15069, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + arg5 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	private void method586() {
		try {
			if (this.anInt1041 != 25871) {
				this.anInt969 = this.aClass26_2.method290();
			}
			@Pc(16) int local16 = this.aClass1_Sub1_Sub2_Sub2_4.method277("Choose Option");
			@Pc(29) int local29;
			for (@Pc(18) int local18 = 0; local18 < this.anInt1005; local18++) {
				local29 = this.aClass1_Sub1_Sub2_Sub2_4.method277(this.aStringArray13[local18]);
				if (local29 > local16) {
					local16 = local29;
				}
			}
			local16 += 8;
			local29 = this.anInt1005 * 15 + 21;
			@Pc(72) int local72;
			@Pc(90) int local90;
			if (super.anInt819 > 4 && super.anInt820 > 4 && super.anInt819 < 516 && super.anInt820 < 338) {
				local72 = super.anInt819 - local16 / 2 - 4;
				if (local72 + local16 > 512) {
					local72 = 512 - local16;
				}
				if (local72 < 0) {
					local72 = 0;
				}
				local90 = super.anInt820 - 4;
				if (local90 + local29 > 334) {
					local90 = 334 - local29;
				}
				if (local90 < 0) {
					local90 = 0;
				}
				this.aBoolean230 = true;
				this.anInt869 = 0;
				this.anInt870 = local72;
				this.anInt871 = local90;
				this.anInt872 = local16;
				this.anInt873 = this.anInt1005 * 15 + 22;
			}
			if (super.anInt819 > 553 && super.anInt820 > 205 && super.anInt819 < 743 && super.anInt820 < 466) {
				local72 = super.anInt819 - local16 / 2 - 553;
				if (local72 < 0) {
					local72 = 0;
				} else if (local72 + local16 > 190) {
					local72 = 190 - local16;
				}
				local90 = super.anInt820 - 205;
				if (local90 < 0) {
					local90 = 0;
				} else if (local90 + local29 > 261) {
					local90 = 261 - local29;
				}
				this.aBoolean230 = true;
				this.anInt869 = 1;
				this.anInt870 = local72;
				this.anInt871 = local90;
				this.anInt872 = local16;
				this.anInt873 = this.anInt1005 * 15 + 22;
			}
			if (super.anInt819 > 17 && super.anInt820 > 357 && super.anInt819 < 496 && super.anInt820 < 453) {
				local72 = super.anInt819 - local16 / 2 - 17;
				if (local72 < 0) {
					local72 = 0;
				} else if (local72 + local16 > 479) {
					local72 = 479 - local16;
				}
				local90 = super.anInt820 - 357;
				if (local90 < 0) {
					local90 = 0;
				} else if (local90 + local29 > 96) {
					local90 = 96 - local29;
				}
				this.aBoolean230 = true;
				this.anInt869 = 2;
				this.anInt870 = local72;
				this.anInt871 = local90;
				this.anInt872 = local16;
				this.anInt873 = this.anInt1005 * 15 + 22;
			}
		} catch (@Pc(294) RuntimeException local294) {
			signlink.reporterror("36580, " + 25871 + ", " + local294.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method587(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			if (super.anInt818 == 1) {
				if (super.anInt819 >= 6 && super.anInt819 <= 106 && super.anInt820 >= 467 && super.anInt820 <= 499) {
					this.anInt824 = (this.anInt824 + 1) % 4;
					this.aBoolean220 = true;
					this.aBoolean228 = true;
					this.aClass1_Sub1_Sub4_8.method394(54);
					this.aClass1_Sub1_Sub4_8.method395(this.anInt824);
					this.aClass1_Sub1_Sub4_8.method395(this.anInt840);
					this.aClass1_Sub1_Sub4_8.method395(this.anInt874);
				}
				if (super.anInt819 >= 135 && super.anInt819 <= 235 && super.anInt820 >= 467 && super.anInt820 <= 499) {
					this.anInt840 = (this.anInt840 + 1) % 3;
					this.aBoolean220 = true;
					this.aBoolean228 = true;
					this.aClass1_Sub1_Sub4_8.method394(54);
					this.aClass1_Sub1_Sub4_8.method395(this.anInt824);
					this.aClass1_Sub1_Sub4_8.method395(this.anInt840);
					this.aClass1_Sub1_Sub4_8.method395(this.anInt874);
				}
				if (super.anInt819 >= 273 && super.anInt819 <= 373 && super.anInt820 >= 467 && super.anInt820 <= 499) {
					this.anInt874 = (this.anInt874 + 1) % 3;
					this.aBoolean220 = true;
					this.aBoolean228 = true;
					this.aClass1_Sub1_Sub4_8.method394(54);
					this.aClass1_Sub1_Sub4_8.method395(this.anInt824);
					this.aClass1_Sub1_Sub4_8.method395(this.anInt840);
					this.aClass1_Sub1_Sub4_8.method395(this.anInt874);
				}
				if (super.anInt819 >= 412 && super.anInt819 <= 512 && super.anInt820 >= 467 && super.anInt820 <= 499) {
					if (this.anInt945 == -1) {
						this.method712(349);
						this.aString30 = "";
						this.aBoolean225 = false;
						this.anInt924 = this.anInt945 = Class24.anInt373;
						return;
					}
					this.method618("", 0, "Please close the interface you have open before using 'report abuse'");
					return;
				}
			}
		} catch (@Pc(201) RuntimeException local201) {
			signlink.reporterror("63699, " + arg0 + ", " + local201.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Ljava/lang/String;")
	private String method588(@OriginalArg(1) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("42161, " + -45195 + ", " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	private boolean method589(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(13) int local13 = 0; local13 < this.anInt977; local13++) {
				if (arg0.equalsIgnoreCase(this.aStringArray14[local13])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass1_Sub1_Sub1_Sub4_Sub1_1.aString7);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("28319, " + arg0 + ", " + 38775 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!SVWJKJVI;IB)V")
	private void method590(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			arg0.method415();
			@Pc(9) int local9 = arg0.method416(8);
			@Pc(15) int local15;
			if (local9 < this.anInt879) {
				for (local15 = local9; local15 < this.anInt879; local15++) {
					this.anIntArray247[this.anInt930++] = this.anIntArray230[local15];
				}
			}
			if (local9 > this.anInt879) {
				signlink.reporterror(this.aString28 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt879 = 0;
			for (local15 = 0; local15 < local9; local15++) {
				@Pc(73) int local73 = this.anIntArray230[local15];
				@Pc(78) Class1_Sub1_Sub1_Sub4_Sub2 local78 = this.aClass1_Sub1_Sub1_Sub4_Sub2Array1[local73];
				@Pc(83) int local83 = arg0.method416(1);
				if (local83 == 0) {
					this.anIntArray230[this.anInt879++] = local73;
					local78.anInt485 = anInt953;
				} else {
					@Pc(106) int local106 = arg0.method416(2);
					if (local106 == 0) {
						this.anIntArray230[this.anInt879++] = local73;
						local78.anInt485 = anInt953;
						this.anIntArray269[this.anInt1025++] = local73;
					} else {
						@Pc(157) int local157;
						@Pc(168) int local168;
						if (local106 == 1) {
							this.anIntArray230[this.anInt879++] = local73;
							local78.anInt485 = anInt953;
							local157 = arg0.method416(3);
							local78.method313(this.anInt878, local157, false);
							local168 = arg0.method416(1);
							if (local168 == 1) {
								this.anIntArray269[this.anInt1025++] = local73;
							}
						} else if (local106 == 2) {
							this.anIntArray230[this.anInt879++] = local73;
							local78.anInt485 = anInt953;
							local157 = arg0.method416(3);
							local78.method313(this.anInt878, local157, true);
							local168 = arg0.method416(3);
							local78.method313(this.anInt878, local168, true);
							@Pc(228) int local228 = arg0.method416(1);
							if (local228 == 1) {
								this.anIntArray269[this.anInt1025++] = local73;
							}
						} else if (local106 == 3) {
							this.anIntArray247[this.anInt930++] = local73;
						}
					}
				}
			}
		} catch (@Pc(265) RuntimeException local265) {
			signlink.reporterror("51857, " + arg0 + ", " + arg1 + ", " + 105 + ", " + local265.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method591(@OriginalArg(1) int arg0) {
		try {
			@Pc(2) Class24 local2 = Class24.method230(arg0);
			for (@Pc(4) int local4 = 0; local4 < local2.anIntArray126.length && local2.anIntArray126[local4] != -1; local4++) {
				@Pc(18) Class24 local18 = Class24.method230(local2.anIntArray126[local4]);
				if (local18.anInt364 == 1) {
					this.method591(local18.anInt375);
				}
				local18.anInt382 = 0;
				local18.anInt387 = 0;
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("8383, " + 1 + ", " + arg0 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method592(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean201) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.method720(43595);
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!NHFASBOX;B)Z")
	private boolean method593(@OriginalArg(0) Class24 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt359;
			if (this.anInt978 == 2) {
				if (local4 == 201) {
					this.aBoolean228 = true;
					this.anInt988 = 0;
					this.aBoolean197 = true;
					this.aString22 = "";
					this.anInt875 = 1;
					this.aString18 = "Enter name of friend to add to list";
				}
				if (local4 == 202) {
					this.aBoolean228 = true;
					this.anInt988 = 0;
					this.aBoolean197 = true;
					this.aString22 = "";
					this.anInt875 = 2;
					this.aString18 = "Enter name of friend to delete from list";
				}
			}
			if (local4 == 205) {
				this.anInt965 = 250;
				return true;
			}
			if (local4 == 501) {
				this.aBoolean228 = true;
				this.anInt988 = 0;
				this.aBoolean197 = true;
				this.aString22 = "";
				this.anInt875 = 4;
				this.aString18 = "Enter name of player to add to list";
			}
			if (local4 == 502) {
				this.aBoolean228 = true;
				this.anInt988 = 0;
				this.aBoolean197 = true;
				this.aString22 = "";
				this.anInt875 = 5;
				this.aString18 = "Enter name of player to delete from list";
			}
			@Pc(119) int local119;
			@Pc(123) int local123;
			@Pc(128) int local128;
			if (local4 >= 300 && local4 <= 313) {
				local119 = (local4 - 300) / 2;
				local123 = local4 & 0x1;
				local128 = this.anIntArray244[local119];
				if (local128 != -1) {
					while (true) {
						if (local123 == 0) {
							local128--;
							if (local128 < 0) {
								local128 = Class37.anInt632 - 1;
							}
						}
						if (local123 == 1) {
							local128++;
							if (local128 >= Class37.anInt632) {
								local128 = 0;
							}
						}
						if (!Class37.aClass37Array1[local128].aBoolean156 && Class37.aClass37Array1[local128].anInt633 == local119 + (this.aBoolean199 ? 0 : 7)) {
							this.anIntArray244[local119] = local128;
							this.aBoolean218 = true;
							break;
						}
					}
				}
			}
			if (local4 >= 314 && local4 <= 323) {
				local119 = (local4 - 314) / 2;
				local123 = local4 & 0x1;
				local128 = this.anIntArray235[local119];
				if (local123 == 0) {
					local128--;
					if (local128 < 0) {
						local128 = anIntArrayArray24[local119].length - 1;
					}
				}
				if (local123 == 1) {
					local128++;
					if (local128 >= anIntArrayArray24[local119].length) {
						local128 = 0;
					}
				}
				this.anIntArray235[local119] = local128;
				this.aBoolean218 = true;
			}
			if (local4 == 324 && !this.aBoolean199) {
				this.aBoolean199 = true;
				this.method663();
			}
			if (local4 == 325 && this.aBoolean199) {
				this.aBoolean199 = false;
				this.method663();
			}
			if (local4 == 326) {
				this.aClass1_Sub1_Sub4_8.method394(24);
				this.aClass1_Sub1_Sub4_8.method395(this.aBoolean199 ? 0 : 1);
				for (local119 = 0; local119 < 7; local119++) {
					this.aClass1_Sub1_Sub4_8.method395(this.anIntArray244[local119]);
				}
				for (local123 = 0; local123 < 5; local123++) {
					this.aClass1_Sub1_Sub4_8.method395(this.anIntArray235[local123]);
				}
				return true;
			}
			if (local4 == 620) {
				this.aBoolean225 = !this.aBoolean225;
			}
			if (local4 >= 601 && local4 <= 613) {
				this.method712(349);
				if (this.aString30.length() > 0) {
					this.aClass1_Sub1_Sub4_8.method394(135);
					this.aClass1_Sub1_Sub4_8.method401(Class2.method14(this.aString30), 601);
					this.aClass1_Sub1_Sub4_8.method395(local4 - 601);
					this.aClass1_Sub1_Sub4_8.method395(this.aBoolean225 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(356) RuntimeException local356) {
			signlink.reporterror("95646, " + arg0 + ", " + -84 + ", " + local356.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;I)V")
	private void method595(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null || arg0.length() == 0) {
				this.anInt844 = 0;
			} else {
				@Pc(12) String local12 = arg0;
				@Pc(23) String[] local23 = new String[100];
				@Pc(25) int local25 = 0;
				while (true) {
					@Pc(29) int local29 = local12.indexOf(" ");
					if (local29 == -1) {
						local12 = local12.trim();
						if (local12.length() > 0) {
							local23[local25++] = local12.toLowerCase();
						}
						this.anInt844 = 0;
						label49: for (local29 = 0; local29 < Class39.anInt652; local29++) {
							@Pc(78) Class39 local78 = Class39.method488(local29);
							if (local78.anInt669 == -1 && local78.aString16 != null) {
								@Pc(89) String local89 = local78.aString16.toLowerCase();
								for (@Pc(91) int local91 = 0; local91 < local25; local91++) {
									if (local89.indexOf(local23[local91]) == -1) {
										continue label49;
									}
								}
								this.aStringArray8[this.anInt844] = local89;
								this.anIntArray212[this.anInt844] = local29;
								this.anInt844++;
								if (this.anInt844 >= this.aStringArray8.length) {
									return;
								}
							}
						}
						return;
					}
					@Pc(38) String local38 = local12.substring(0, local29).trim();
					if (local38.length() > 0) {
						local23[local25++] = local38.toLowerCase();
					}
					local12 = local12.substring(local29 + 1);
				}
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("65490, " + arg0 + ", " + 4 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ZXDQRRNS;I)V")
	private void method596(@OriginalArg(0) Class1_Sub1_Sub2_Sub4 arg0) {
		try {
			this.anInt961 += 0;
			for (@Pc(11) int local11 = 0; local11 < this.anIntArray224.length; local11++) {
				this.anIntArray224[local11] = 0;
			}
			@Pc(36) int local36;
			for (@Pc(26) int local26 = 0; local26 < 5000; local26++) {
				local36 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray224[local36] = (int) (Math.random() * 256.0D);
			}
			@Pc(54) int local54;
			@Pc(58) int local58;
			@Pc(66) int local66;
			for (local36 = 0; local36 < 20; local36++) {
				for (local54 = 1; local54 < 255; local54++) {
					for (local58 = 1; local58 < 127; local58++) {
						local66 = local58 + (local54 << 7);
						this.anIntArray225[local66] = (this.anIntArray224[local66 - 1] + this.anIntArray224[local66 + 1] + this.anIntArray224[local66 - 128] + this.anIntArray224[local66 + 128]) / 4;
					}
				}
				@Pc(112) int[] local112 = this.anIntArray224;
				this.anIntArray224 = this.anIntArray225;
				this.anIntArray225 = local112;
			}
			if (arg0 != null) {
				local54 = 0;
				for (local58 = 0; local58 < arg0.anInt798; local58++) {
					for (local66 = 0; local66 < arg0.anInt797; local66++) {
						if (arg0.aByteArray20[local54++] != 0) {
							@Pc(148) int local148 = local66 + arg0.anInt799 + 16;
							@Pc(155) int local155 = local58 + arg0.anInt800 + 16;
							@Pc(161) int local161 = local148 + (local155 << 7);
							this.anIntArray224[local161] = 0;
						}
					}
				}
			}
		} catch (@Pc(178) RuntimeException local178) {
			signlink.reporterror("81452, " + arg0 + ", " + 0 + ", " + local178.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method597() {
		try {
			for (@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) this.aClass8_11.method46(); local6 != null; local6 = (Class1_Sub2) this.aClass8_11.method48()) {
				if (local6.anInt52 == -1) {
					local6.anInt51 = 0;
					this.method721(local6);
				} else {
					local6.method551();
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("97921, " + false + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(8) int local8 = this.aClass10_1.method80(arg1, arg4, arg0);
			@Pc(24) int local24;
			@Pc(30) int local30;
			@Pc(34) int local34;
			@Pc(36) int local36;
			@Pc(58) int local58;
			@Pc(64) int local64;
			if (local8 != 0) {
				local24 = this.aClass10_1.method84(arg1, arg4, arg0, local8);
				local30 = local24 >> 6 & 0x3;
				local34 = local24 & 0x1F;
				local36 = arg2;
				if (local8 > 0) {
					local36 = arg3;
				}
				@Pc(44) int[] local44 = this.aClass1_Sub1_Sub2_Sub1_9.anIntArray128;
				local58 = arg4 * 4 + (103 - arg0) * 512 * 4 + 24624;
				local64 = local8 >> 14 & 0x7FFF;
				@Pc(67) Class32 local67 = Class32.method345(local64);
				if (local67.anInt551 == -1) {
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
					@Pc(77) Class1_Sub1_Sub2_Sub4 local77 = this.aClass1_Sub1_Sub2_Sub4Array4[local67.anInt551];
					if (local77 != null) {
						@Pc(89) int local89 = (local67.anInt543 * 4 - local77.anInt797) / 2;
						@Pc(99) int local99 = (local67.anInt547 * 4 - local77.anInt798) / 2;
						local77.method570((104 - arg0 - local67.anInt547) * 4 + local99 + 48, arg4 * 4 + 48 + local89);
					}
				}
			}
			local8 = this.aClass10_1.method82(arg1, arg4, arg0);
			if (local8 != 0) {
				local24 = this.aClass10_1.method84(arg1, arg4, arg0, local8);
				local30 = local24 >> 6 & 0x3;
				local34 = local24 & 0x1F;
				local36 = local8 >> 14 & 0x7FFF;
				@Pc(453) Class32 local453 = Class32.method345(local36);
				@Pc(485) int local485;
				if (local453.anInt551 != -1) {
					@Pc(463) Class1_Sub1_Sub2_Sub4 local463 = this.aClass1_Sub1_Sub2_Sub4Array4[local453.anInt551];
					if (local463 != null) {
						local64 = (local453.anInt543 * 4 - local463.anInt797) / 2;
						local485 = (local453.anInt547 * 4 - local463.anInt798) / 2;
						local463.method570((104 - arg0 - local453.anInt547) * 4 + local485 + 48, arg4 * 4 + 48 + local64);
					}
				} else if (local34 == 9) {
					local58 = 15658734;
					if (local8 > 0) {
						local58 = 15597568;
					}
					@Pc(522) int[] local522 = this.aClass1_Sub1_Sub2_Sub1_9.anIntArray128;
					local485 = arg4 * 4 + (103 - arg0) * 512 * 4 + 24624;
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
			local8 = this.aClass10_1.method83(arg1, arg4, arg0);
			if (local8 != 0) {
				local24 = local8 >> 14 & 0x7FFF;
				@Pc(617) Class32 local617 = Class32.method345(local24);
				if (local617.anInt551 != -1) {
					@Pc(627) Class1_Sub1_Sub2_Sub4 local627 = this.aClass1_Sub1_Sub2_Sub4Array4[local617.anInt551];
					if (local627 != null) {
						local36 = (local617.anInt543 * 4 - local627.anInt797) / 2;
						@Pc(649) int local649 = (local617.anInt547 * 4 - local627.anInt798) / 2;
						local627.method570((104 - arg0 - local617.anInt547) * 4 + local649 + 48, arg4 * 4 + 48 + local36);
						return;
					}
				}
			}
		} catch (@Pc(673) RuntimeException local673) {
			signlink.reporterror("81414, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 1 + ", " + arg4 + ", " + local673.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method599(@OriginalArg(1) int arg0) {
		try {
			Class24.method225(arg0);
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("74618, " + -13 + ", " + arg0 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method600() {
		try {
			@Pc(7) byte[] local7 = this.aClass43_2.method515("title.dat", null);
			@Pc(13) Class1_Sub1_Sub2_Sub1 local13 = new Class1_Sub1_Sub2_Sub1(local7, this);
			this.aClass18_15.method189();
			local13.method250(0, 0);
			this.aClass18_16.method189();
			local13.method250(-637, 0);
			this.aClass18_12.method189();
			local13.method250(-128, 0);
			this.aClass18_13.method189();
			local13.method250(-202, -371);
			this.aClass18_14.method189();
			local13.method250(-202, -171);
			this.aClass18_17.method189();
			local13.method250(0, -265);
			this.aClass18_18.method189();
			local13.method250(-562, -265);
			this.aBoolean213 &= true;
			this.aClass18_19.method189();
			local13.method250(-128, -171);
			this.aClass18_20.method189();
			local13.method250(-562, -171);
			@Pc(104) int[] local104 = new int[local13.anInt413];
			for (@Pc(106) int local106 = 0; local106 < local13.anInt414; local106++) {
				for (@Pc(110) int local110 = 0; local110 < local13.anInt413; local110++) {
					local104[local110] = local13.anIntArray128[local13.anInt413 + local13.anInt413 * local106 - local110 - 1];
				}
				for (@Pc(136) int local136 = 0; local136 < local13.anInt413; local136++) {
					local13.anIntArray128[local136 + local13.anInt413 * local106] = local104[local136];
				}
			}
			this.aClass18_15.method189();
			local13.method250(382, 0);
			this.aClass18_16.method189();
			local13.method250(-255, 0);
			this.aClass18_12.method189();
			local13.method250(254, 0);
			this.aClass18_13.method189();
			local13.method250(180, -371);
			this.aClass18_14.method189();
			local13.method250(180, -171);
			this.aClass18_17.method189();
			local13.method250(382, -265);
			this.aClass18_18.method189();
			local13.method250(-180, -265);
			this.aClass18_19.method189();
			local13.method250(254, -171);
			this.aClass18_20.method189();
			local13.method250(-180, -171);
			local13 = new Class1_Sub1_Sub2_Sub1(this.aClass43_2, "logo", 0);
			this.aClass18_12.method189();
			local13.method252(18, 382 - local13.anInt413 / 2 - 128);
			System.gc();
		} catch (@Pc(279) RuntimeException local279) {
			signlink.reporterror("60902, " + true + ", " + local279.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method601() {
		try {
			try {
				if (this.aClass31_1 != null) {
					this.aClass31_1.method335();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass31_1 = null;
			this.aBoolean213 = false;
			this.anInt907 = 0;
			this.aString28 = "";
			this.aString29 = "";
			this.anInt961 += 0;
			this.method664();
			this.aClass10_1.method54();
			for (@Pc(37) int local37 = 0; local37 < 4; local37++) {
				this.aClass28Array1[local37].method295();
			}
			System.gc();
			this.method696();
			this.anInt966 = -1;
			this.anInt1001 = -1;
			this.anInt946 = 0;
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("35293, " + 0 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
	private void method602(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(18) int local18;
			if (this.aClass18_26 != null) {
				this.aClass18_26.method189();
				Class1_Sub1_Sub2_Sub3.anIntArray163 = this.anIntArray228;
				local18 = 151;
				if (arg1 != null) {
					local18 -= 7;
				}
				this.aClass1_Sub1_Sub2_Sub2_3.method275(local18, arg0, 257, 0);
				this.aClass1_Sub1_Sub2_Sub2_3.method275(local18 - 1, arg0, 256, 16777215);
				local18 += 15;
				if (arg1 != null) {
					this.aClass1_Sub1_Sub2_Sub2_3.method275(local18, arg1, 257, 0);
					this.aClass1_Sub1_Sub2_Sub2_3.method275(local18 - 1, arg1, 256, 16777215);
				}
				this.aClass18_26.method190(796, 4, 4, super.aGraphics2);
			} else if (super.aClass18_2 != null) {
				super.aClass18_2.method189();
				Class1_Sub1_Sub2_Sub3.anIntArray163 = this.anIntArray229;
				local18 = 251;
				Class1_Sub1_Sub2.method558(0, 50, 233, 300, 221);
				Class1_Sub1_Sub2.method559(16777215, 233, 221, 50, 300);
				if (arg1 != null) {
					local18 -= 7;
				}
				this.aClass1_Sub1_Sub2_Sub2_3.method275(local18, arg0, 383, 0);
				this.aClass1_Sub1_Sub2_Sub2_3.method275(local18 - 1, arg0, 382, 16777215);
				local18 += 15;
				if (arg1 != null) {
					this.aClass1_Sub1_Sub2_Sub2_3.method275(local18, arg1, 383, 0);
					this.aClass1_Sub1_Sub2_Sub2_3.method275(local18 - 1, arg1, 382, 16777215);
				}
				super.aClass18_2.method190(796, 0, 0, super.aGraphics2);
			}
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("90508, " + arg0 + ", " + arg1 + ", " + -946 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
	private int method603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(9) int local9 = 256 - arg0;
			return ((arg2 & 0xFF00FF) * local9 + (arg1 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg2 & 0xFF00) * local9 + (arg1 & 0xFF00) * arg0 & 0xFF0000) >> 8;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("42213, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -7809 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method604(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt929 >= 100) {
					this.method618("", 0, "Your ignore list is full. Max of 100 hit");
				} else {
					@Pc(23) String local23 = Class2.method18(Class2.method15(357, arg0));
					for (@Pc(25) int local25 = 0; local25 < this.anInt929; local25++) {
						if (this.aLongArray3[local25] == arg0) {
							this.method618("", 0, local23 + " is already on your ignore list");
							return;
						}
					}
					for (@Pc(55) int local55 = 0; local55 < this.anInt977; local55++) {
						if (this.aLongArray4[local55] == arg0) {
							this.method618("", 0, "Please remove " + local23 + " from your friend list first");
							return;
						}
					}
					this.aLongArray3[this.anInt929++] = arg0;
					this.aBoolean219 = true;
					this.aClass1_Sub1_Sub4_8.method394(4);
					this.aClass1_Sub1_Sub4_8.method401(arg0, 601);
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("14404, " + arg0 + ", " + -39 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method605() {
		try {
			if (this.anInt936 == 2) {
				this.method644((this.anInt1011 - this.anInt834 << 7) + this.anInt1014, this.anInt1012 * 2, (this.anInt1010 - this.anInt833 << 7) + this.anInt1013);
				if (this.anInt1003 > -1 && anInt953 % 20 < 10) {
					this.aClass1_Sub1_Sub2_Sub1Array5[0].method252(this.anInt1004 - 28, this.anInt1003 - 12);
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("29659, " + -274 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!SVWJKJVI;IB)V")
	private void method606(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			while (true) {
				if (arg0.anInt625 + 21 < arg1 * 8) {
					@Pc(12) int local12 = arg0.method416(14);
					if (local12 != 16383) {
						if (this.aClass1_Sub1_Sub1_Sub4_Sub2Array1[local12] == null) {
							this.aClass1_Sub1_Sub1_Sub4_Sub2Array1[local12] = new Class1_Sub1_Sub1_Sub4_Sub2();
						}
						@Pc(32) Class1_Sub1_Sub1_Sub4_Sub2 local32 = this.aClass1_Sub1_Sub1_Sub4_Sub2Array1[local12];
						this.anIntArray230[this.anInt879++] = local12;
						local32.anInt485 = anInt953;
						@Pc(51) int local51 = arg0.method416(1);
						if (local51 == 1) {
							this.anIntArray269[this.anInt1025++] = local12;
						}
						@Pc(70) int local70 = arg0.method416(1);
						local32.aClass29_2 = Class29.method326(arg0.method416(13));
						@Pc(82) int local82 = arg0.method416(5);
						if (local82 > 15) {
							local82 -= 32;
						}
						@Pc(91) int local91 = arg0.method416(5);
						if (local91 > 15) {
							local91 -= 32;
						}
						local32.anInt475 = local32.aClass29_2.aByte13;
						local32.anInt476 = local32.aClass29_2.anInt529;
						local32.anInt487 = local32.aClass29_2.anInt516;
						local32.anInt488 = local32.aClass29_2.anInt527;
						local32.anInt489 = local32.aClass29_2.anInt528;
						local32.anInt490 = local32.aClass29_2.anInt513;
						local32.anInt453 = local32.aClass29_2.anInt515;
						local32.method314(aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0] + local82, local70 == 1, this.aBoolean222, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0] + local91);
						continue;
					}
				}
				arg0.method417();
				@Pc(162) boolean local162 = false;
				return;
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("83930, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method607(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		try {
			@Pc(5) boolean local5 = false;
			if (arg1 != 0L) {
				for (@Pc(12) int local12 = 0; local12 < this.anInt929; local12++) {
					if (this.aLongArray3[local12] == arg1) {
						this.anInt929--;
						this.aBoolean219 = true;
						for (@Pc(32) int local32 = local12; local32 < this.anInt929; local32++) {
							this.aLongArray3[local32] = this.aLongArray3[local32 + 1];
						}
						this.aClass1_Sub1_Sub4_8.method394(240);
						this.aClass1_Sub1_Sub4_8.method401(arg1, 601);
						return;
					}
				}
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("42533, " + arg0 + ", " + arg1 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II[B)Z")
	private boolean method608(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			return arg1 == null ? true : signlink.wavesave(arg1, arg0);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("6546, " + arg0 + ", " + -45954 + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!SVWJKJVI;Lclient!KVXZMJHR;II)V")
	private void method609(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub4 arg1, @OriginalArg(2) Class1_Sub1_Sub1_Sub4_Sub1 arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(18) int local18;
			@Pc(22) int local22;
			if ((arg3 & 0x100) != 0) {
				local18 = arg1.method425(this.anInt1045);
				local22 = arg1.method423();
				arg2.method312(local22, anInt953, local18);
				arg2.anInt468 = anInt953 + 300;
				arg2.anInt469 = arg1.method423();
				arg2.anInt470 = arg1.method405();
			}
			if ((arg3 & 0x8) != 0) {
				arg2.aString13 = arg1.method412();
				if (arg2.aString13.charAt(0) == '~') {
					arg2.aString13 = arg2.aString13.substring(1);
					this.method618(arg2.aString7, 2, arg2.aString13);
				} else if (arg2 == aClass1_Sub1_Sub1_Sub4_Sub1_1) {
					this.method618(arg2.aString7, 2, arg2.aString13);
				}
				arg2.anInt457 = 0;
				arg2.anInt471 = 0;
				arg2.anInt486 = 150;
			}
			if ((arg3 & 0x200) != 0) {
				arg2.anInt479 = arg1.method434();
				local18 = arg1.method410();
				arg2.anInt483 = local18 >> 16;
				arg2.anInt482 = anInt953 + (local18 & 0xFFFF);
				arg2.anInt480 = 0;
				arg2.anInt481 = 0;
				if (arg2.anInt482 > anInt953) {
					arg2.anInt480 = -1;
				}
				if (arg2.anInt479 == 65535) {
					arg2.anInt479 = -1;
				}
			}
			@Pc(165) int local165;
			if ((arg3 & 0x4) != 0) {
				local18 = arg1.method407();
				if (local18 == 65535) {
					local18 = -1;
				}
				local22 = arg1.method425(this.anInt1045);
				if (local18 == arg2.anInt491 && local18 != -1) {
					local165 = Class19.aClass19Array1[local18].anInt219;
					if (local165 == 1) {
						arg2.anInt492 = 0;
						arg2.anInt493 = 0;
						arg2.anInt494 = local22;
						arg2.anInt495 = 0;
					}
					if (local165 == 2) {
						arg2.anInt495 = 0;
					}
				} else if (local18 == -1 || arg2.anInt491 == -1 || Class19.aClass19Array1[local18].anInt213 >= Class19.aClass19Array1[arg2.anInt491].anInt213) {
					arg2.anInt491 = local18;
					arg2.anInt492 = 0;
					arg2.anInt493 = 0;
					arg2.anInt494 = local22;
					arg2.anInt495 = 0;
					arg2.anInt496 = arg2.anInt477;
				}
			}
			if ((arg3 & 0x400) != 0) {
				arg2.anInt461 = arg1.method424(this.anInt956);
				arg2.anInt463 = arg1.method425(this.anInt1045);
				arg2.anInt462 = arg1.method424(this.anInt956);
				arg2.anInt464 = arg1.method423();
				arg2.anInt465 = arg1.method432() + anInt953;
				arg2.anInt466 = arg1.method434() + anInt953;
				arg2.anInt467 = arg1.method405();
				arg2.method315();
			}
			if ((arg3 & 0x80) != 0) {
				arg2.anInt455 = arg1.method434();
				arg2.anInt456 = arg1.method407();
			}
			if ((arg3 & 0x2) != 0) {
				arg2.anInt478 = arg1.method407();
				if (arg2.anInt478 == 65535) {
					arg2.anInt478 = -1;
				}
			}
			if ((arg3 & 0x20) != 0) {
				local18 = arg1.method432();
				local22 = arg1.method425(this.anInt1045);
				local165 = arg1.method425(this.anInt1045);
				@Pc(321) int local321 = arg1.anInt624;
				if (arg2.aString7 != null && arg2.aBoolean65) {
					@Pc(331) long local331 = Class2.method14(arg2.aString7);
					@Pc(333) boolean local333 = false;
					if (local22 <= 1) {
						for (@Pc(338) int local338 = 0; local338 < this.anInt929; local338++) {
							if (this.aLongArray3[local338] == local331) {
								local333 = true;
								break;
							}
						}
					}
					if (!local333 && this.anInt1027 == 0) {
						try {
							this.aClass1_Sub1_Sub4_7.anInt624 = 0;
							arg1.method414(36, this.aClass1_Sub1_Sub4_7.aByteArray16, local165);
							this.aClass1_Sub1_Sub4_7.anInt624 = 0;
							@Pc(383) String local383 = Class13.method136(this.aClass1_Sub1_Sub4_7, local165);
							@Pc(387) String local387 = Class38.method456(local383);
							arg2.aString13 = local387;
							arg2.anInt457 = local18 >> 8;
							arg2.anInt471 = local18 & 0xFF;
							arg2.anInt486 = 150;
							if (local22 == 2 || local22 == 3) {
								this.method618("@cr2@" + arg2.aString7, 1, local387);
							} else if (local22 == 1) {
								this.method618("@cr1@" + arg2.aString7, 1, local387);
							} else {
								this.method618(arg2.aString7, 2, local387);
							}
						} catch (@Pc(451) Exception local451) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg1.anInt624 = local321 + local165;
			}
			if ((arg3 & 0x40) != 0) {
				local18 = arg1.method425(this.anInt1045);
				@Pc(471) byte[] local471 = new byte[local18];
				@Pc(477) Class1_Sub1_Sub4 local477 = new Class1_Sub1_Sub4(local471, true);
				arg1.method439(local18, local471);
				this.aClass1_Sub1_Sub4Array1[arg0] = local477;
				arg2.method215(local477);
			}
			if ((arg3 & 0x1) != 0) {
				local18 = arg1.method425(this.anInt1045);
				local22 = arg1.method405();
				arg2.method312(local22, anInt953, local18);
				arg2.anInt468 = anInt953 + 300;
				arg2.anInt469 = arg1.method425(this.anInt1045);
				arg2.anInt470 = arg1.method425(this.anInt1045);
			}
		} catch (@Pc(529) RuntimeException local529) {
			signlink.reporterror("10039, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 85 + ", " + local529.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!SVWJKJVI;)V")
	private void method610(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub4 arg1) {
		try {
			arg1.method415();
			@Pc(17) int local17 = arg1.method416(1);
			if (local17 != 0) {
				@Pc(25) int local25 = arg1.method416(2);
				if (local25 == 0) {
					this.anIntArray269[this.anInt1025++] = this.anInt1023;
				} else {
					@Pc(48) int local48;
					@Pc(59) int local59;
					if (local25 == 1) {
						local48 = arg1.method416(3);
						aClass1_Sub1_Sub1_Sub4_Sub1_1.method313(this.anInt878, local48, false);
						local59 = arg1.method416(1);
						if (local59 == 1) {
							this.anIntArray269[this.anInt1025++] = this.anInt1023;
						}
					} else {
						@Pc(105) int local105;
						if (local25 == 2) {
							local48 = arg1.method416(3);
							aClass1_Sub1_Sub1_Sub4_Sub1_1.method313(this.anInt878, local48, true);
							local59 = arg1.method416(3);
							aClass1_Sub1_Sub1_Sub4_Sub1_1.method313(this.anInt878, local59, true);
							local105 = arg1.method416(1);
							if (local105 == 1) {
								this.anIntArray269[this.anInt1025++] = this.anInt1023;
							}
						} else if (local25 == 3) {
							this.anInt934 = arg1.method416(2);
							local48 = arg1.method416(7);
							local59 = arg1.method416(1);
							local105 = arg1.method416(1);
							if (local105 == 1) {
								this.anIntArray269[this.anInt1025++] = this.anInt1023;
							}
							@Pc(165) int local165 = arg1.method416(7);
							aClass1_Sub1_Sub1_Sub4_Sub1_1.method314(local48, local59 == 1, this.aBoolean222, local165);
						}
					}
				}
			}
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("57379, " + arg0 + ", " + 64 + ", " + arg1 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method611(@OriginalArg(1) int arg0) {
		try {
			this.anInt961 += 0;
			@Pc(10) int local10 = Class17.aClass17Array1[arg0].anInt203;
			if (local10 != 0) {
				@Pc(18) int local18 = this.anIntArray231[arg0];
				if (local10 == 1) {
					if (local18 == 1) {
						Class1_Sub1_Sub2_Sub3.method375(0.9D);
					}
					if (local18 == 2) {
						Class1_Sub1_Sub2_Sub3.method375(0.8D);
					}
					if (local18 == 3) {
						Class1_Sub1_Sub2_Sub3.method375(0.7D);
					}
					if (local18 == 4) {
						Class1_Sub1_Sub2_Sub3.method375(0.6D);
					}
					Class39.aClass7_8.method42();
					this.aBoolean217 = true;
				}
				if (local10 == 3) {
					@Pc(56) boolean local56 = this.aBoolean198;
					if (local18 == 0) {
						this.method646(535, 0, this.aBoolean198);
						this.aBoolean198 = true;
					}
					if (local18 == 1) {
						this.method646(535, -400, this.aBoolean198);
						this.aBoolean198 = true;
					}
					if (local18 == 2) {
						this.method646(535, -800, this.aBoolean198);
						this.aBoolean198 = true;
					}
					if (local18 == 3) {
						this.method646(535, -1200, this.aBoolean198);
						this.aBoolean198 = true;
					}
					if (local18 == 4) {
						this.aBoolean198 = false;
					}
					if (this.aBoolean198 != local56 && !aBoolean234) {
						if (this.aBoolean198) {
							this.anInt1001 = this.anInt966;
							this.aBoolean223 = true;
							this.aClass4_Sub1_1.method111(2, this.anInt1001);
						} else {
							this.method696();
						}
						this.anInt946 = 0;
					}
				}
				if (local10 == 4) {
					if (local18 == 0) {
						this.aBoolean205 = true;
						this.method708(0);
					}
					if (local18 == 1) {
						this.aBoolean205 = true;
						this.method708(-400);
					}
					if (local18 == 2) {
						this.aBoolean205 = true;
						this.method708(-800);
					}
					if (local18 == 3) {
						this.aBoolean205 = true;
						this.method708(-1200);
					}
					if (local18 == 4) {
						this.aBoolean205 = false;
					}
				}
				if (local10 == 5) {
					this.anInt992 = local18;
				}
				if (local10 == 6) {
					this.anInt831 = local18;
				}
				if (local10 == 8) {
					this.anInt1009 = local18;
					this.aBoolean228 = true;
				}
				if (local10 == 9) {
					this.anInt830 = local18;
				}
			}
		} catch (@Pc(216) RuntimeException local216) {
			signlink.reporterror("76945, " + 0 + ", " + arg0 + ", " + local216.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method612() {
		try {
			anInt1019++;
			if (anInt1019 > 117) {
				anInt1019 = 0;
				this.aClass1_Sub1_Sub4_8.method394(72);
				this.aClass1_Sub1_Sub4_8.method399(0);
			}
			while (true) {
				@Pc(29) int local29;
				do {
					while (true) {
						local29 = this.method576();
						if (local29 == -1) {
							return;
						}
						if (this.anInt945 != -1 && this.anInt945 == this.anInt924) {
							if (local29 == 8 && this.aString30.length() > 0) {
								this.aString30 = this.aString30.substring(0, this.aString30.length() - 1);
							}
							break;
						}
						@Pc(209) int local209;
						if (this.aBoolean197) {
							if (local29 >= 32 && local29 <= 122 && this.aString22.length() < 80) {
								this.aString22 = this.aString22 + (char) local29;
								this.aBoolean228 = true;
							}
							if (local29 == 8 && this.aString22.length() > 0) {
								this.aString22 = this.aString22.substring(0, this.aString22.length() - 1);
								this.aBoolean228 = true;
							}
							if (local29 == 13 || local29 == 10) {
								this.aBoolean197 = false;
								this.aBoolean228 = true;
								@Pc(169) long local169;
								if (this.anInt875 == 1) {
									local169 = Class2.method14(this.aString22);
									this.method630(local169);
								}
								if (this.anInt875 == 2 && this.anInt977 > 0) {
									local169 = Class2.method14(this.aString22);
									this.method639(local169);
								}
								if (this.anInt875 == 3 && this.aString22.length() > 0) {
									this.aClass1_Sub1_Sub4_8.method394(124);
									this.aClass1_Sub1_Sub4_8.method395(0);
									local209 = this.aClass1_Sub1_Sub4_8.anInt624;
									this.aClass1_Sub1_Sub4_8.method401(this.aLong29, 601);
									Class13.method137(this.aClass1_Sub1_Sub4_8, this.aString22);
									this.aClass1_Sub1_Sub4_8.method404(this.aClass1_Sub1_Sub4_8.anInt624 - local209);
									this.aString22 = Class13.method138(this.aString22);
									this.aString22 = Class38.method456(this.aString22);
									this.method618(Class2.method18(Class2.method15(357, this.aLong29)), 6, this.aString22);
									if (this.anInt840 == 2) {
										this.anInt840 = 1;
										this.aBoolean220 = true;
										this.aClass1_Sub1_Sub4_8.method394(54);
										this.aClass1_Sub1_Sub4_8.method395(this.anInt824);
										this.aClass1_Sub1_Sub4_8.method395(this.anInt840);
										this.aClass1_Sub1_Sub4_8.method395(this.anInt874);
									}
								}
								if (this.anInt875 == 4 && this.anInt929 < 100) {
									local169 = Class2.method14(this.aString22);
									this.method604(local169);
								}
								if (this.anInt875 == 5 && this.anInt929 > 0) {
									local169 = Class2.method14(this.aString22);
									this.method607(659, local169);
								}
							}
						} else if (this.anInt988 == 1) {
							if (local29 >= 48 && local29 <= 57 && this.aString17.length() < 10) {
								this.aString17 = this.aString17 + (char) local29;
								this.aBoolean228 = true;
							}
							if (local29 == 8 && this.aString17.length() > 0) {
								this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
								this.aBoolean228 = true;
							}
							if (local29 == 13 || local29 == 10) {
								if (this.aString17.length() > 0) {
									local209 = 0;
									try {
										local209 = Integer.parseInt(this.aString17);
									} catch (@Pc(386) Exception local386) {
									}
									this.aClass1_Sub1_Sub4_8.method394(140);
									this.aClass1_Sub1_Sub4_8.method399(local209);
								}
								this.anInt988 = 0;
								this.aBoolean228 = true;
							}
						} else if (this.anInt988 == 2) {
							if (local29 >= 32 && local29 <= 122 && this.aString17.length() < 12) {
								this.aString17 = this.aString17 + (char) local29;
								this.aBoolean228 = true;
							}
							if (local29 == 8 && this.aString17.length() > 0) {
								this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
								this.aBoolean228 = true;
							}
							if (local29 == 13 || local29 == 10) {
								if (this.aString17.length() > 0) {
									this.aClass1_Sub1_Sub4_8.method394(146);
									this.aClass1_Sub1_Sub4_8.method401(Class2.method14(this.aString17), 601);
								}
								this.anInt988 = 0;
								this.aBoolean228 = true;
							}
						} else if (this.anInt988 == 3) {
							if (local29 >= 32 && local29 <= 122 && this.aString17.length() < 40) {
								this.aString17 = this.aString17 + (char) local29;
								this.aBoolean228 = true;
							}
							if (local29 == 8 && this.aString17.length() > 0) {
								this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
								this.aBoolean228 = true;
							}
						} else if (this.anInt887 == -1 && this.anInt999 == -1) {
							if (local29 >= 32 && local29 <= 122 && this.aString21.length() < 80) {
								this.aString21 = this.aString21 + (char) local29;
								this.aBoolean228 = true;
							}
							if (local29 == 8 && this.aString21.length() > 0) {
								this.aString21 = this.aString21.substring(0, this.aString21.length() - 1);
								this.aBoolean228 = true;
							}
							if ((local29 == 13 || local29 == 10) && this.aString21.length() > 0) {
								if (this.anInt838 == 2) {
									if (this.aString21.equals("::clientdrop")) {
										this.method616();
									}
									if (this.aString21.equals("::lag")) {
										this.method652(this.aByte34);
									}
									if (this.aString21.equals("::prefetchmusic")) {
										for (local209 = 0; local209 < this.aClass4_Sub1_1.method110(2); local209++) {
											this.aClass4_Sub1_1.method119((byte) 1, 2, local209);
										}
									}
									if (this.aString21.equals("::fpson")) {
										aBoolean224 = true;
									}
									if (this.aString21.equals("::fpsoff")) {
										aBoolean224 = false;
									}
									if (this.aString21.equals("::noclip")) {
										for (local209 = 0; local209 < 4; local209++) {
											for (@Pc(672) int local672 = 1; local672 < 103; local672++) {
												for (@Pc(676) int local676 = 1; local676 < 103; local676++) {
													this.aClass28Array1[local209].anIntArrayArray13[local672][local676] = 0;
												}
											}
										}
									}
								}
								if (this.aString21.startsWith("::")) {
									this.aClass1_Sub1_Sub4_8.method394(82);
									this.aClass1_Sub1_Sub4_8.method395(this.aString21.length() - 1);
									this.aClass1_Sub1_Sub4_8.method402(this.aString21.substring(2));
								} else {
									@Pc(731) String local731 = this.aString21.toLowerCase();
									@Pc(733) byte local733 = 0;
									if (local731.startsWith("yellow:")) {
										local733 = 0;
										this.aString21 = this.aString21.substring(7);
									} else if (local731.startsWith("red:")) {
										local733 = 1;
										this.aString21 = this.aString21.substring(4);
									} else if (local731.startsWith("green:")) {
										local733 = 2;
										this.aString21 = this.aString21.substring(6);
									} else if (local731.startsWith("cyan:")) {
										local733 = 3;
										this.aString21 = this.aString21.substring(5);
									} else if (local731.startsWith("purple:")) {
										local733 = 4;
										this.aString21 = this.aString21.substring(7);
									} else if (local731.startsWith("white:")) {
										local733 = 5;
										this.aString21 = this.aString21.substring(6);
									} else if (local731.startsWith("flash1:")) {
										local733 = 6;
										this.aString21 = this.aString21.substring(7);
									} else if (local731.startsWith("flash2:")) {
										local733 = 7;
										this.aString21 = this.aString21.substring(7);
									} else if (local731.startsWith("flash3:")) {
										local733 = 8;
										this.aString21 = this.aString21.substring(7);
									} else if (local731.startsWith("glow1:")) {
										local733 = 9;
										this.aString21 = this.aString21.substring(6);
									} else if (local731.startsWith("glow2:")) {
										local733 = 10;
										this.aString21 = this.aString21.substring(6);
									} else if (local731.startsWith("glow3:")) {
										local733 = 11;
										this.aString21 = this.aString21.substring(6);
									}
									local731 = this.aString21.toLowerCase();
									@Pc(905) byte local905 = 0;
									if (local731.startsWith("wave:")) {
										local905 = 1;
										this.aString21 = this.aString21.substring(5);
									} else if (local731.startsWith("wave2:")) {
										local905 = 2;
										this.aString21 = this.aString21.substring(6);
									} else if (local731.startsWith("shake:")) {
										local905 = 3;
										this.aString21 = this.aString21.substring(6);
									} else if (local731.startsWith("scroll:")) {
										local905 = 4;
										this.aString21 = this.aString21.substring(7);
									} else if (local731.startsWith("slide:")) {
										local905 = 5;
										this.aString21 = this.aString21.substring(6);
									}
									this.aClass1_Sub1_Sub4_8.method394(165);
									this.aClass1_Sub1_Sub4_8.method395(0);
									@Pc(986) int local986 = this.aClass1_Sub1_Sub4_8.anInt624;
									this.aClass1_Sub1_Sub4_8.method395(local733);
									this.aClass1_Sub1_Sub4_8.method421(local905);
									this.aClass1_Sub1_Sub4_7.anInt624 = 0;
									Class13.method137(this.aClass1_Sub1_Sub4_7, this.aString21);
									this.aClass1_Sub1_Sub4_8.method403(this.aClass1_Sub1_Sub4_7.aByteArray16, this.aByte30, this.aClass1_Sub1_Sub4_7.anInt624);
									this.aClass1_Sub1_Sub4_8.method404(this.aClass1_Sub1_Sub4_8.anInt624 - local986);
									this.aString21 = Class13.method138(this.aString21);
									this.aString21 = Class38.method456(this.aString21);
									aClass1_Sub1_Sub1_Sub4_Sub1_1.aString13 = this.aString21;
									aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt457 = local733;
									aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt471 = local905;
									aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt486 = 150;
									if (this.anInt838 == 2) {
										this.method618("@cr2@" + aClass1_Sub1_Sub1_Sub4_Sub1_1.aString7, 2, aClass1_Sub1_Sub1_Sub4_Sub1_1.aString13);
									} else if (this.anInt838 == 1) {
										this.method618("@cr1@" + aClass1_Sub1_Sub1_Sub4_Sub1_1.aString7, 2, aClass1_Sub1_Sub1_Sub4_Sub1_1.aString13);
									} else {
										this.method618(aClass1_Sub1_Sub1_Sub4_Sub1_1.aString7, 2, aClass1_Sub1_Sub1_Sub4_Sub1_1.aString13);
									}
									if (this.anInt824 == 2) {
										this.anInt824 = 3;
										this.aBoolean220 = true;
										this.aClass1_Sub1_Sub4_8.method394(54);
										this.aClass1_Sub1_Sub4_8.method395(this.anInt824);
										this.aClass1_Sub1_Sub4_8.method395(this.anInt840);
										this.aClass1_Sub1_Sub4_8.method395(this.anInt874);
									}
								}
								this.aString21 = "";
								this.aBoolean228 = true;
							}
						}
					}
				} while ((local29 < 97 || local29 > 122) && (local29 < 65 || local29 > 90) && (local29 < 48 || local29 > 57) && local29 != 32);
				if (this.aString30.length() < 12) {
					this.aString30 = this.aString30 + (char) local29;
				}
			}
		} catch (@Pc(1139) RuntimeException local1139) {
			signlink.reporterror("40197, " + -39493 + ", " + local1139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method613() {
		try {
			if (this.aClass18_27 == null) {
				this.method711();
				super.aClass18_2 = null;
				this.aClass18_12 = null;
				this.aClass18_13 = null;
				this.aClass18_14 = null;
				this.aClass18_15 = null;
				this.aClass18_16 = null;
				this.aClass18_17 = null;
				this.aClass18_18 = null;
				this.aClass18_19 = null;
				this.aClass18_20 = null;
				this.aClass18_27 = new Class18(this.method582(523), 0, 479, 96);
				this.aClass18_25 = new Class18(this.method582(523), 0, 172, 156);
				this.aBoolean213 &= true;
				Class1_Sub1_Sub2.method556(this.anInt948);
				this.aClass1_Sub1_Sub2_Sub4_7.method570(0, 0);
				this.aClass18_24 = new Class18(this.method582(523), 0, 190, 261);
				this.aClass18_26 = new Class18(this.method582(523), 0, 512, 334);
				Class1_Sub1_Sub2.method556(this.anInt948);
				this.aClass18_21 = new Class18(this.method582(523), 0, 496, 50);
				this.aClass18_22 = new Class18(this.method582(523), 0, 269, 37);
				this.aClass18_23 = new Class18(this.method582(523), 0, 249, 45);
				this.aBoolean217 = true;
				this.aClass18_26.method189();
				Class1_Sub1_Sub2_Sub3.anIntArray163 = this.anIntArray228;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("38816, " + true + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!NHFASBOX;)I")
	private int method614(@OriginalArg(0) int arg0, @OriginalArg(2) Class24 arg1) {
		try {
			if (arg1.anIntArrayArray12 == null || arg0 >= arg1.anIntArrayArray12.length) {
				return -2;
			}
			try {
				@Pc(20) int[] local20 = arg1.anIntArrayArray12[arg0];
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
						local33 = this.anIntArray234[local20[local24++]];
					}
					if (local31 == 2) {
						local33 = this.anIntArray271[local20[local24++]];
					}
					if (local31 == 3) {
						local33 = this.anIntArray223[local20[local24++]];
					}
					@Pc(81) Class24 local81;
					@Pc(86) int local86;
					@Pc(99) int local99;
					if (local31 == 4) {
						local81 = Class24.method230(local20[local24++]);
						local86 = local20[local24++];
						if (local86 >= 0 && local86 < Class39.anInt652 && (!Class39.method488(local86).aBoolean161 || aBoolean233)) {
							for (local99 = 0; local99 < local81.anIntArray125.length; local99++) {
								if (local81.anIntArray125[local99] == local86 + 1) {
									local33 += local81.anIntArray124[local99];
								}
							}
						}
					}
					if (local31 == 5) {
						local33 = this.anIntArray231[local20[local24++]];
					}
					if (local31 == 6) {
						local33 = anIntArray270[this.anIntArray271[local20[local24++]] - 1];
					}
					if (local31 == 7) {
						local33 = this.anIntArray231[local20[local24++]] * 100 / 46875;
					}
					if (local31 == 8) {
						local33 = aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt330;
					}
					@Pc(174) int local174;
					if (local31 == 9) {
						for (local174 = 0; local174 < Class41.anInt683; local174++) {
							if (Class41.aBooleanArray10[local174]) {
								local33 += this.anIntArray271[local174];
							}
						}
					}
					if (local31 == 10) {
						local81 = Class24.method230(local20[local24++]);
						local86 = local20[local24++] + 1;
						if (local86 >= 0 && local86 < Class39.anInt652 && (!Class39.method488(local86).aBoolean161 || aBoolean233)) {
							for (local99 = 0; local99 < local81.anIntArray125.length; local99++) {
								if (local81.anIntArray125[local99] == local86) {
									local33 = 999999999;
									break;
								}
							}
						}
					}
					if (local31 == 11) {
						local33 = this.anInt893;
					}
					if (local31 == 12) {
						local33 = this.anInt986;
					}
					if (local31 == 13) {
						local174 = this.anIntArray231[local20[local24++]];
						local86 = local20[local24++];
						local33 = (local174 & 0x1 << local86) == 0 ? 0 : 1;
					}
					if (local31 == 14) {
						local174 = local20[local24++];
						@Pc(288) Class9 local288 = Class9.aClass9Array1[local174];
						local99 = local288.anInt88;
						@Pc(294) int local294 = local288.anInt89;
						@Pc(297) int local297 = local288.anInt90;
						@Pc(303) int local303 = anIntArray236[local297 - local294];
						local33 = this.anIntArray231[local99] >> local294 & local303;
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
						local33 = (aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt458 >> 7) + this.anInt833;
					}
					if (local31 == 19) {
						local33 = (aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt459 >> 7) + this.anInt834;
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
			} catch (@Pc(396) Exception local396) {
				return -1;
			}
		} catch (@Pc(399) RuntimeException local399) {
			signlink.reporterror("12583, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local399.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!NHFASBOX;IZII)V")
	private void method615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class24 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg3.anInt364 == 0 && arg3.anIntArray126 != null && !arg3.aBoolean69 && (arg0 >= arg6 && arg2 >= arg4 && arg0 <= arg6 + arg3.anInt366 && arg2 <= arg4 + arg3.anInt352)) {
				@Pc(38) int local38 = arg3.anIntArray126.length;
				for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
					@Pc(49) int local49 = arg3.anIntArray118[local40] + arg6;
					@Pc(58) int local58 = arg3.anIntArray122[local40] + arg4 - arg1;
					@Pc(64) Class24 local64 = Class24.method230(arg3.anIntArray126[local40]);
					@Pc(69) int local69 = local49 + local64.anInt374;
					@Pc(74) int local74 = local58 + local64.anInt367;
					if ((local64.anInt365 >= 0 || local64.anInt384 != 0) && arg0 >= local69 && arg2 >= local74 && arg0 < local69 + local64.anInt366 && arg2 < local74 + local64.anInt352) {
						if (local64.anInt365 >= 0) {
							this.anInt856 = local64.anInt365;
						} else {
							this.anInt856 = local64.anInt375;
						}
					}
					if (local64.anInt364 == 8 && arg0 >= local69 && arg2 >= local74 && arg0 < local69 + local64.anInt366 && arg2 < local74 + local64.anInt352) {
						this.anInt998 = local64.anInt375;
					}
					if (local64.anInt364 == 0) {
						this.method615(arg0, local64.anInt377, arg2, local64, local74, arg5, local69);
						if (local64.anInt368 > local64.anInt352) {
							this.method694(local64, local74, arg5, local64.anInt352, arg0, local64.anInt368, local69 + local64.anInt366, arg2);
						}
					} else {
						if (local64.anInt378 == 1 && arg0 >= local69 && arg2 >= local74 && arg0 < local69 + local64.anInt366 && arg2 < local74 + local64.anInt352) {
							@Pc(198) boolean local198 = false;
							if (local64.anInt359 != 0) {
								local198 = this.method682(local64);
							}
							if (!local198) {
								this.aStringArray13[this.anInt1005] = local64.aString12;
								this.anIntArray242[this.anInt1005] = 128;
								this.anIntArray241[this.anInt1005] = local64.anInt375;
								this.anInt1005++;
							}
						}
						if (local64.anInt378 == 2 && this.anInt904 == 0 && arg0 >= local69 && arg2 >= local74 && arg0 < local69 + local64.anInt366 && arg2 < local74 + local64.anInt352) {
							@Pc(262) String local262 = local64.aString10;
							if (local262.indexOf(" ") != -1) {
								local262 = local262.substring(0, local262.indexOf(" "));
							}
							this.aStringArray13[this.anInt1005] = local262 + " @gre@" + local64.aString11;
							this.anIntArray242[this.anInt1005] = 738;
							this.anIntArray241[this.anInt1005] = local64.anInt375;
							this.anInt1005++;
						}
						if (local64.anInt378 == 3 && arg0 >= local69 && arg2 >= local74 && arg0 < local69 + local64.anInt366 && arg2 < local74 + local64.anInt352) {
							this.aStringArray13[this.anInt1005] = "Close";
							if (arg5 == 3) {
								this.anIntArray242[this.anInt1005] = 136;
							} else {
								this.anIntArray242[this.anInt1005] = 526;
							}
							this.anIntArray241[this.anInt1005] = local64.anInt375;
							this.anInt1005++;
						}
						if (local64.anInt378 == 4 && arg0 >= local69 && arg2 >= local74 && arg0 < local69 + local64.anInt366 && arg2 < local74 + local64.anInt352) {
							this.aStringArray13[this.anInt1005] = local64.aString12;
							this.anIntArray242[this.anInt1005] = 256;
							this.anIntArray241[this.anInt1005] = local64.anInt375;
							this.anInt1005++;
						}
						if (local64.anInt378 == 5 && arg0 >= local69 && arg2 >= local74 && arg0 < local69 + local64.anInt366 && arg2 < local74 + local64.anInt352) {
							this.aStringArray13[this.anInt1005] = local64.aString12;
							this.anIntArray242[this.anInt1005] = 211;
							this.anIntArray241[this.anInt1005] = local64.anInt375;
							this.anInt1005++;
						}
						if (local64.anInt378 == 6 && !this.aBoolean206 && arg0 >= local69 && arg2 >= local74 && arg0 < local69 + local64.anInt366 && arg2 < local74 + local64.anInt352) {
							this.aStringArray13[this.anInt1005] = local64.aString12;
							this.anIntArray242[this.anInt1005] = 192;
							this.anIntArray241[this.anInt1005] = local64.anInt375;
							this.anInt1005++;
						}
						if (local64.anInt364 == 2) {
							@Pc(521) int local521 = 0;
							for (@Pc(523) int local523 = 0; local523 < local64.anInt352; local523++) {
								for (@Pc(527) int local527 = 0; local527 < local64.anInt366; local527++) {
									@Pc(538) int local538 = local69 + local527 * (local64.anInt383 + 32);
									@Pc(547) int local547 = local74 + local523 * (local64.anInt355 + 32);
									if (local521 < 20) {
										local538 += local64.anIntArray121[local521];
										local547 += local64.anIntArray120[local521];
									}
									if (arg0 >= local538 && arg2 >= local547 && arg0 < local538 + 32 && arg2 < local547 + 32) {
										this.anInt922 = local521;
										this.anInt923 = local64.anInt375;
										if (local64.anIntArray125[local521] > 0) {
											@Pc(600) Class39 local600 = Class39.method488(local64.anIntArray125[local521] - 1);
											if (this.anInt1035 == 1 && local64.aBoolean74) {
												if (local64.anInt375 != this.anInt1037 || local521 != this.anInt1036) {
													this.aStringArray13[this.anInt1005] = "Use " + this.aString31 + " with @lre@" + local600.aString16;
													this.anIntArray242[this.anInt1005] = 919;
													this.anIntArray243[this.anInt1005] = local600.anInt670;
													this.anIntArray240[this.anInt1005] = local521;
													this.anIntArray241[this.anInt1005] = local64.anInt375;
													this.anInt1005++;
												}
											} else if (this.anInt904 != 1 || !local64.aBoolean74) {
												@Pc(737) int local737;
												if (local64.aBoolean74) {
													for (local737 = 4; local737 >= 3; local737--) {
														if (local600.aStringArray6 != null && local600.aStringArray6[local737] != null) {
															this.aStringArray13[this.anInt1005] = local600.aStringArray6[local737] + " @lre@" + local600.aString16;
															if (local737 == 3) {
																this.anIntArray242[this.anInt1005] = 228;
															}
															if (local737 == 4) {
																this.anIntArray242[this.anInt1005] = 675;
															}
															this.anIntArray243[this.anInt1005] = local600.anInt670;
															this.anIntArray240[this.anInt1005] = local521;
															this.anIntArray241[this.anInt1005] = local64.anInt375;
															this.anInt1005++;
														} else if (local737 == 4) {
															this.aStringArray13[this.anInt1005] = "Drop @lre@" + local600.aString16;
															this.anIntArray242[this.anInt1005] = 675;
															this.anIntArray243[this.anInt1005] = local600.anInt670;
															this.anIntArray240[this.anInt1005] = local521;
															this.anIntArray241[this.anInt1005] = local64.anInt375;
															this.anInt1005++;
														}
													}
												}
												if (local64.aBoolean75) {
													this.aStringArray13[this.anInt1005] = "Use @lre@" + local600.aString16;
													this.anIntArray242[this.anInt1005] = 860;
													this.anIntArray243[this.anInt1005] = local600.anInt670;
													this.anIntArray240[this.anInt1005] = local521;
													this.anIntArray241[this.anInt1005] = local64.anInt375;
													this.anInt1005++;
												}
												if (local64.aBoolean74 && local600.aStringArray6 != null) {
													for (local737 = 2; local737 >= 0; local737--) {
														if (local600.aStringArray6[local737] != null) {
															this.aStringArray13[this.anInt1005] = local600.aStringArray6[local737] + " @lre@" + local600.aString16;
															if (local737 == 0) {
																this.anIntArray242[this.anInt1005] = 221;
															}
															if (local737 == 1) {
																this.anIntArray242[this.anInt1005] = 379;
															}
															if (local737 == 2) {
																this.anIntArray242[this.anInt1005] = 207;
															}
															this.anIntArray243[this.anInt1005] = local600.anInt670;
															this.anIntArray240[this.anInt1005] = local521;
															this.anIntArray241[this.anInt1005] = local64.anInt375;
															this.anInt1005++;
														}
													}
												}
												if (local64.aStringArray1 != null) {
													for (local737 = 4; local737 >= 0; local737--) {
														if (local64.aStringArray1[local737] != null) {
															this.aStringArray13[this.anInt1005] = local64.aStringArray1[local737] + " @lre@" + local600.aString16;
															if (local737 == 0) {
																this.anIntArray242[this.anInt1005] = 941;
															}
															if (local737 == 1) {
																this.anIntArray242[this.anInt1005] = 631;
															}
															if (local737 == 2) {
																this.anIntArray242[this.anInt1005] = 94;
															}
															if (local737 == 3) {
																this.anIntArray242[this.anInt1005] = 292;
															}
															if (local737 == 4) {
																this.anIntArray242[this.anInt1005] = 883;
															}
															this.anIntArray243[this.anInt1005] = local600.anInt670;
															this.anIntArray240[this.anInt1005] = local521;
															this.anIntArray241[this.anInt1005] = local64.anInt375;
															this.anInt1005++;
														}
													}
												}
												this.aStringArray13[this.anInt1005] = "Examine @lre@" + local600.aString16;
												this.anIntArray242[this.anInt1005] = 1826;
												this.anIntArray243[this.anInt1005] = local600.anInt670;
												this.anIntArray240[this.anInt1005] = local521;
												this.anIntArray241[this.anInt1005] = local64.anInt375;
												this.anInt1005++;
											} else if ((this.anInt906 & 0x10) == 16) {
												this.aStringArray13[this.anInt1005] = this.aString25 + " @lre@" + local600.aString16;
												this.anIntArray242[this.anInt1005] = 210;
												this.anIntArray243[this.anInt1005] = local600.anInt670;
												this.anIntArray240[this.anInt1005] = local521;
												this.anIntArray241[this.anInt1005] = local64.anInt375;
												this.anInt1005++;
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
			signlink.reporterror("94338, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + false + ", " + arg5 + ", " + arg6 + ", " + local1167.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method616() {
		try {
			if (this.anInt965 > 0) {
				this.method601();
			} else {
				this.method602("Connection lost", "Please wait - attempting to reestablish");
				this.anInt883 = 0;
				this.anInt995 = 0;
				@Pc(24) Class31 local24 = this.aClass31_1;
				this.aBoolean213 = false;
				this.anInt1042 = 0;
				this.method723(this.aString28, this.aString29, true);
				if (!this.aBoolean213) {
					this.method601();
				}
				try {
					local24.method335();
				} catch (@Pc(47) Exception local47) {
				}
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("88616, " + -3593 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIILclient!KVXZMJHR;)V")
	private void method617(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub1_Sub1_Sub4_Sub1 arg3) {
		try {
			if (arg3 != aClass1_Sub1_Sub1_Sub4_Sub1_1 && this.anInt1005 < 400) {
				@Pc(35) String local35;
				if (arg3.anInt331 == 0) {
					local35 = arg3.aString7 + method594(aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt330, anInt954, arg3.anInt330) + " (level-" + arg3.anInt330 + ")";
				} else {
					local35 = arg3.aString7 + " (skill-" + arg3.anInt331 + ")";
				}
				@Pc(165) int local165;
				if (this.anInt1035 == 1) {
					this.aStringArray13[this.anInt1005] = "Use " + this.aString31 + " with @whi@" + local35;
					this.anIntArray242[this.anInt1005] = 669;
					this.anIntArray243[this.anInt1005] = arg2;
					this.anIntArray240[this.anInt1005] = arg1;
					this.anIntArray241[this.anInt1005] = arg0;
					this.anInt1005++;
				} else if (this.anInt904 != 1) {
					for (local165 = 4; local165 >= 0; local165--) {
						if (this.aStringArray12[local165] != null) {
							this.aStringArray13[this.anInt1005] = this.aStringArray12[local165] + " @whi@" + local35;
							@Pc(192) short local192 = 0;
							if (this.aStringArray12[local165].equalsIgnoreCase("attack")) {
								if (arg3.anInt330 > aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt330) {
									local192 = 2000;
								}
								if (aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt322 != 0 && arg3.anInt322 != 0) {
									if (aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt322 == arg3.anInt322) {
										local192 = 2000;
									} else {
										local192 = 0;
									}
								}
							} else if (this.aBooleanArray11[local165]) {
								local192 = 2000;
							}
							if (local165 == 0) {
								this.anIntArray242[this.anInt1005] = local192 + 685;
							}
							if (local165 == 1) {
								this.anIntArray242[this.anInt1005] = local192 + 530;
							}
							if (local165 == 2) {
								this.anIntArray242[this.anInt1005] = local192 + 622;
							}
							if (local165 == 3) {
								this.anIntArray242[this.anInt1005] = local192 + 749;
							}
							if (local165 == 4) {
								this.anIntArray242[this.anInt1005] = local192 + 832;
							}
							this.anIntArray243[this.anInt1005] = arg2;
							this.anIntArray240[this.anInt1005] = arg1;
							this.anIntArray241[this.anInt1005] = arg0;
							this.anInt1005++;
						}
					}
				} else if ((this.anInt906 & 0x8) == 8) {
					this.aStringArray13[this.anInt1005] = this.aString25 + " @whi@" + local35;
					this.anIntArray242[this.anInt1005] = 544;
					this.anIntArray243[this.anInt1005] = arg2;
					this.anIntArray240[this.anInt1005] = arg1;
					this.anIntArray241[this.anInt1005] = arg0;
					this.anInt1005++;
				}
				for (local165 = 0; local165 < this.anInt1005; local165++) {
					if (this.anIntArray242[local165] == 821) {
						this.aStringArray13[local165] = "Walk here @whi@" + local35;
						break;
					}
				}
			}
		} catch (@Pc(348) RuntimeException local348) {
			signlink.reporterror("59723, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local348.toString());
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
				return new URL("http://127.0.0.1:" + (anInt1031 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)V")
	private void method618(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		try {
			if (arg1 == 0 && this.anInt983 != -1) {
				this.aString27 = arg2;
				super.anInt818 = 0;
			}
			if (this.anInt887 == -1) {
				this.aBoolean228 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray238[local20] = this.anIntArray238[local20 - 1];
				this.aStringArray10[local20] = this.aStringArray10[local20 - 1];
				this.aStringArray11[local20] = this.aStringArray11[local20 - 1];
			}
			this.anIntArray238[0] = arg1;
			this.aStringArray10[0] = arg0;
			this.aStringArray11[0] = arg2;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("87289, " + arg0 + ", " + arg1 + ", " + 895 + ", " + arg2 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method619() {
		try {
			if (this.anInt1005 >= 2 || this.anInt1035 != 0 || this.anInt904 != 0) {
				@Pc(35) String local35;
				if (this.anInt1035 == 1 && this.anInt1005 < 2) {
					local35 = "Use " + this.aString31 + " with...";
				} else if (this.anInt904 == 1 && this.anInt1005 < 2) {
					local35 = this.aString25 + "...";
				} else {
					local35 = this.aStringArray13[this.anInt1005 - 1];
				}
				if (this.anInt1005 > 2) {
					local35 = local35 + "@whi@ / " + (this.anInt1005 - 2) + " more options";
				}
				this.aClass1_Sub1_Sub2_Sub2_4.method284(15, 16777215, local35, anInt953 / 1000, 4);
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("20934, " + 13 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method620() {
		try {
			if (this.aClass18_12 == null) {
				super.aClass18_2 = null;
				this.aClass18_27 = null;
				this.aClass18_25 = null;
				this.aClass18_24 = null;
				this.aClass18_26 = null;
				this.aClass18_21 = null;
				this.aClass18_22 = null;
				this.aClass18_23 = null;
				this.aClass18_15 = new Class18(this.method582(523), 0, 128, 265);
				Class1_Sub1_Sub2.method556(this.anInt948);
				this.aClass18_16 = new Class18(this.method582(523), 0, 128, 265);
				Class1_Sub1_Sub2.method556(this.anInt948);
				this.aClass18_12 = new Class18(this.method582(523), 0, 509, 171);
				Class1_Sub1_Sub2.method556(this.anInt948);
				this.aClass18_13 = new Class18(this.method582(523), 0, 360, 132);
				Class1_Sub1_Sub2.method556(this.anInt948);
				this.aClass18_14 = new Class18(this.method582(523), 0, 360, 200);
				Class1_Sub1_Sub2.method556(this.anInt948);
				this.aClass18_17 = new Class18(this.method582(523), 0, 202, 238);
				Class1_Sub1_Sub2.method556(this.anInt948);
				this.aClass18_18 = new Class18(this.method582(523), 0, 203, 238);
				Class1_Sub1_Sub2.method556(this.anInt948);
				this.aClass18_19 = new Class18(this.method582(523), 0, 74, 94);
				Class1_Sub1_Sub2.method556(this.anInt948);
				this.aClass18_20 = new Class18(this.method582(523), 0, 75, 94);
				Class1_Sub1_Sub2.method556(this.anInt948);
				if (this.aClass43_2 != null) {
					this.method600();
					this.method645();
				}
				this.aBoolean217 = true;
			}
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("84008, " + 94 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method622() {
		try {
			this.aClass18_25.method189();
			@Pc(18) int local18;
			@Pc(20) int local20;
			if (this.anInt883 == 2) {
				@Pc(13) byte[] local13 = this.aClass1_Sub1_Sub2_Sub4_7.aByteArray20;
				@Pc(15) int[] local15 = Class1_Sub1_Sub2.anIntArray208;
				local18 = local13.length;
				for (local20 = 0; local20 < local18; local20++) {
					if (local13[local20] == 0) {
						local15[local20] = 0;
					}
				}
				this.aClass1_Sub1_Sub2_Sub1_10.method256(33, 0, this.anIntArray239, 25, 0, this.anInt919, this.anIntArray237, 33, 256, 25);
				this.aClass18_26.method189();
				Class1_Sub1_Sub2_Sub3.anIntArray163 = this.anIntArray228;
			} else {
				@Pc(67) int local67 = this.anInt919 + this.anInt911 & 0x7FF;
				@Pc(80) int local80 = aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt458 / 32 + 48;
				local18 = 464 - aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt459 / 32;
				this.aClass1_Sub1_Sub2_Sub1_9.method256(146, 5, this.anIntArray274, local80, 25, local67, this.anIntArray221, 151, this.anInt860 + 256, local18);
				this.aClass1_Sub1_Sub2_Sub1_10.method256(33, 0, this.anIntArray239, 25, 0, this.anInt919, this.anIntArray237, 33, 256, 25);
				for (local20 = 0; local20 < this.anInt1016; local20++) {
					local80 = this.anIntArray266[local20] * 4 + 2 - aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt458 / 32;
					local18 = this.anIntArray267[local20] * 4 + 2 - aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt459 / 32;
					this.method660(local18, this.aClass1_Sub1_Sub2_Sub1Array6[local20], local80);
				}
				@Pc(175) int local175;
				for (@Pc(171) int local171 = 0; local171 < 104; local171++) {
					for (local175 = 0; local175 < 104; local175++) {
						@Pc(187) Class8 local187 = this.aClass8ArrayArrayArray1[this.anInt934][local171][local175];
						if (local187 != null) {
							local80 = local171 * 4 + 2 - aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt458 / 32;
							local18 = local175 * 4 + 2 - aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt459 / 32;
							this.method660(local18, this.aClass1_Sub1_Sub2_Sub1_11, local80);
						}
					}
				}
				for (local175 = 0; local175 < this.anInt879; local175++) {
					@Pc(238) Class1_Sub1_Sub1_Sub4_Sub2 local238 = this.aClass1_Sub1_Sub1_Sub4_Sub2Array1[this.anIntArray230[local175]];
					if (local238 != null && local238.method311()) {
						@Pc(247) Class29 local247 = local238.aClass29_2;
						if (local247.anIntArray146 != null) {
							local247 = local247.method325();
						}
						if (local247 != null && local247.aBoolean108 && local247.aBoolean107) {
							local80 = local238.anInt458 / 32 - aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt458 / 32;
							local18 = local238.anInt459 / 32 - aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt459 / 32;
							this.method660(local18, this.aClass1_Sub1_Sub2_Sub1_12, local80);
						}
					}
				}
				@Pc(306) Class1_Sub1_Sub1_Sub4_Sub1 local306;
				for (@Pc(296) int local296 = 0; local296 < this.anInt1024; local296++) {
					local306 = this.aClass1_Sub1_Sub1_Sub4_Sub1Array1[this.anIntArray268[local296]];
					if (local306 != null && local306.method311()) {
						local80 = local306.anInt458 / 32 - aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt458 / 32;
						local18 = local306.anInt459 / 32 - aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt459 / 32;
						@Pc(334) boolean local334 = false;
						@Pc(338) long local338 = Class2.method14(local306.aString7);
						for (@Pc(340) int local340 = 0; local340 < this.anInt977; local340++) {
							if (local338 == this.aLongArray4[local340] && this.anIntArray213[local340] != 0) {
								local334 = true;
								break;
							}
						}
						@Pc(365) boolean local365 = false;
						if (aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt322 != 0 && local306.anInt322 != 0 && aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt322 == local306.anInt322) {
							local365 = true;
						}
						if (local334) {
							this.method660(local18, this.aClass1_Sub1_Sub2_Sub1_14, local80);
						} else if (local365) {
							this.method660(local18, this.aClass1_Sub1_Sub2_Sub1_15, local80);
						} else {
							this.method660(local18, this.aClass1_Sub1_Sub2_Sub1_13, local80);
						}
					}
				}
				if (this.anInt936 != 0 && anInt953 % 20 < 10) {
					if (this.anInt936 == 1 && this.anInt880 >= 0 && this.anInt880 < this.aClass1_Sub1_Sub1_Sub4_Sub2Array1.length) {
						@Pc(439) Class1_Sub1_Sub1_Sub4_Sub2 local439 = this.aClass1_Sub1_Sub1_Sub4_Sub2Array1[this.anInt880];
						if (local439 != null) {
							local80 = local439.anInt458 / 32 - aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt458 / 32;
							local18 = local439.anInt459 / 32 - aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt459 / 32;
							this.method680(local80, this.aClass1_Sub1_Sub2_Sub1_17, local18);
						}
					}
					if (this.anInt936 == 2) {
						local80 = (this.anInt1010 - this.anInt833) * 4 + 2 - aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt458 / 32;
						local18 = (this.anInt1011 - this.anInt834) * 4 + 2 - aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt459 / 32;
						this.method680(local80, this.aClass1_Sub1_Sub2_Sub1_17, local18);
					}
					if (this.anInt936 == 10 && this.anInt1028 >= 0 && this.anInt1028 < this.aClass1_Sub1_Sub1_Sub4_Sub1Array1.length) {
						local306 = this.aClass1_Sub1_Sub1_Sub4_Sub1Array1[this.anInt1028];
						if (local306 != null) {
							local80 = local306.anInt458 / 32 - aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt458 / 32;
							local18 = local306.anInt459 / 32 - aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt459 / 32;
							this.method680(local80, this.aClass1_Sub1_Sub2_Sub1_17, local18);
						}
					}
				}
				if (this.anInt995 != 0) {
					local80 = this.anInt995 * 4 + 2 - aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt458 / 32;
					local18 = this.anInt996 * 4 + 2 - aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt459 / 32;
					this.method660(local18, this.aClass1_Sub1_Sub2_Sub1_16, local80);
				}
				Class1_Sub1_Sub2.method558(16777215, 3, 97, 3, 78);
				this.aClass18_26.method189();
				Class1_Sub1_Sub2_Sub3.anIntArray163 = this.anIntArray228;
			}
		} catch (@Pc(607) RuntimeException local607) {
			signlink.reporterror("78564, " + 5 + ", " + local607.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Z")
	private boolean method623(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(8) int local8 = this.anIntArray242[arg0];
			if (local8 >= 2000) {
				local8 -= 2000;
			}
			return local8 == 839;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("67471, " + arg0 + ", " + 119 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method624() {
		try {
			if (this.anInt1035 == 0 && this.anInt904 == 0) {
				this.aStringArray13[this.anInt1005] = "Walk here";
				this.anIntArray242[this.anInt1005] = 821;
				this.anIntArray240[this.anInt1005] = super.anInt813;
				this.anIntArray241[this.anInt1005] = super.anInt814;
				this.anInt1005++;
			}
			@Pc(41) int local41 = -1;
			for (@Pc(43) int local43 = 0; local43 < Class1_Sub1_Sub1_Sub3.anInt194; local43++) {
				@Pc(49) int local49 = Class1_Sub1_Sub1_Sub3.anIntArray89[local43];
				@Pc(53) int local53 = local49 & 0x7F;
				@Pc(59) int local59 = local49 >> 7 & 0x7F;
				@Pc(65) int local65 = local49 >> 29 & 0x3;
				@Pc(71) int local71 = local49 >> 14 & 0x7FFF;
				if (local49 != local41) {
					local41 = local49;
					@Pc(218) int local218;
					if (local65 == 2 && this.aClass10_1.method84(this.anInt934, local53, local59, local49) >= 0) {
						@Pc(91) Class32 local91 = Class32.method345(local71);
						if (local91.anIntArray154 != null) {
							local91 = local91.method346();
						}
						if (local91 == null) {
							continue;
						}
						if (this.anInt1035 == 1) {
							this.aStringArray13[this.anInt1005] = "Use " + this.aString31 + " with @cya@" + local91.aString15;
							this.anIntArray242[this.anInt1005] = 453;
							this.anIntArray243[this.anInt1005] = local49;
							this.anIntArray240[this.anInt1005] = local53;
							this.anIntArray241[this.anInt1005] = local59;
							this.anInt1005++;
						} else if (this.anInt904 != 1) {
							if (local91.aStringArray3 != null) {
								for (local218 = 4; local218 >= 0; local218--) {
									if (local91.aStringArray3[local218] != null) {
										this.aStringArray13[this.anInt1005] = local91.aStringArray3[local218] + " @cya@" + local91.aString15;
										if (local218 == 0) {
											this.anIntArray242[this.anInt1005] = 405;
										}
										if (local218 == 1) {
											this.anIntArray242[this.anInt1005] = 87;
										}
										if (local218 == 2) {
											this.anIntArray242[this.anInt1005] = 424;
										}
										if (local218 == 3) {
											this.anIntArray242[this.anInt1005] = 707;
										}
										if (local218 == 4) {
											this.anIntArray242[this.anInt1005] = 1198;
										}
										this.anIntArray243[this.anInt1005] = local49;
										this.anIntArray240[this.anInt1005] = local53;
										this.anIntArray241[this.anInt1005] = local59;
										this.anInt1005++;
									}
								}
							}
							this.aStringArray13[this.anInt1005] = "Examine @cya@" + local91.aString15;
							this.anIntArray242[this.anInt1005] = 1648;
							this.anIntArray243[this.anInt1005] = local91.anInt541 << 14;
							this.anIntArray240[this.anInt1005] = local53;
							this.anIntArray241[this.anInt1005] = local59;
							this.anInt1005++;
						} else if ((this.anInt906 & 0x4) == 4) {
							this.aStringArray13[this.anInt1005] = this.aString25 + " @cya@" + local91.aString15;
							this.anIntArray242[this.anInt1005] = 23;
							this.anIntArray243[this.anInt1005] = local49;
							this.anIntArray240[this.anInt1005] = local53;
							this.anIntArray241[this.anInt1005] = local59;
							this.anInt1005++;
						}
					}
					@Pc(398) Class1_Sub1_Sub1_Sub4_Sub2 local398;
					@Pc(446) Class1_Sub1_Sub1_Sub4_Sub1 local446;
					@Pc(436) int local436;
					if (local65 == 1) {
						@Pc(369) Class1_Sub1_Sub1_Sub4_Sub2 local369 = this.aClass1_Sub1_Sub1_Sub4_Sub2Array1[local71];
						if (local369.aClass29_2.aByte13 == 1 && (local369.anInt458 & 0x7F) == 64 && (local369.anInt459 & 0x7F) == 64) {
							for (local218 = 0; local218 < this.anInt879; local218++) {
								local398 = this.aClass1_Sub1_Sub1_Sub4_Sub2Array1[this.anIntArray230[local218]];
								if (local398 != null && local398 != local369 && local398.aClass29_2.aByte13 == 1 && local398.anInt458 == local369.anInt458 && local398.anInt459 == local369.anInt459) {
									this.method681(local53, local59, this.anIntArray230[local218], local398.aClass29_2);
								}
							}
							for (local436 = 0; local436 < this.anInt1024; local436++) {
								local446 = this.aClass1_Sub1_Sub1_Sub4_Sub1Array1[this.anIntArray268[local436]];
								if (local446 != null && local446.anInt458 == local369.anInt458 && local446.anInt459 == local369.anInt459) {
									this.method617(local59, local53, this.anIntArray268[local436], local446);
								}
							}
						}
						this.method681(local53, local59, local71, local369.aClass29_2);
					}
					if (local65 == 0) {
						@Pc(488) Class1_Sub1_Sub1_Sub4_Sub1 local488 = this.aClass1_Sub1_Sub1_Sub4_Sub1Array1[local71];
						if ((local488.anInt458 & 0x7F) == 64 && (local488.anInt459 & 0x7F) == 64) {
							for (local218 = 0; local218 < this.anInt879; local218++) {
								local398 = this.aClass1_Sub1_Sub1_Sub4_Sub2Array1[this.anIntArray230[local218]];
								if (local398 != null && local398.aClass29_2.aByte13 == 1 && local398.anInt458 == local488.anInt458 && local398.anInt459 == local488.anInt459) {
									this.method681(local53, local59, this.anIntArray230[local218], local398.aClass29_2);
								}
							}
							for (local436 = 0; local436 < this.anInt1024; local436++) {
								local446 = this.aClass1_Sub1_Sub1_Sub4_Sub1Array1[this.anIntArray268[local436]];
								if (local446 != null && local446 != local488 && local446.anInt458 == local488.anInt458 && local446.anInt459 == local488.anInt459) {
									this.method617(local59, local53, this.anIntArray268[local436], local446);
								}
							}
						}
						this.method617(local59, local53, local71, local488);
					}
					if (local65 == 3) {
						@Pc(607) Class8 local607 = this.aClass8ArrayArrayArray1[this.anInt934][local53][local59];
						if (local607 != null) {
							for (@Pc(614) Class1_Sub1_Sub1_Sub6 local614 = (Class1_Sub1_Sub1_Sub6) local607.method47(); local614 != null; local614 = (Class1_Sub1_Sub1_Sub6) local607.method49()) {
								@Pc(620) Class39 local620 = Class39.method488(local614.anInt725);
								if (this.anInt1035 == 1) {
									this.aStringArray13[this.anInt1005] = "Use " + this.aString31 + " with @lre@" + local620.aString16;
									this.anIntArray242[this.anInt1005] = 956;
									this.anIntArray243[this.anInt1005] = local614.anInt725;
									this.anIntArray240[this.anInt1005] = local53;
									this.anIntArray241[this.anInt1005] = local59;
									this.anInt1005++;
								} else if (this.anInt904 != 1) {
									for (@Pc(737) int local737 = 4; local737 >= 0; local737--) {
										if (local620.aStringArray5 != null && local620.aStringArray5[local737] != null) {
											this.aStringArray13[this.anInt1005] = local620.aStringArray5[local737] + " @lre@" + local620.aString16;
											if (local737 == 0) {
												this.anIntArray242[this.anInt1005] = 77;
											}
											if (local737 == 1) {
												this.anIntArray242[this.anInt1005] = 483;
											}
											if (local737 == 2) {
												this.anIntArray242[this.anInt1005] = 491;
											}
											if (local737 == 3) {
												this.anIntArray242[this.anInt1005] = 879;
											}
											if (local737 == 4) {
												this.anIntArray242[this.anInt1005] = 455;
											}
											this.anIntArray243[this.anInt1005] = local614.anInt725;
											this.anIntArray240[this.anInt1005] = local53;
											this.anIntArray241[this.anInt1005] = local59;
											this.anInt1005++;
										} else if (local737 == 2) {
											this.aStringArray13[this.anInt1005] = "Take @lre@" + local620.aString16;
											this.anIntArray242[this.anInt1005] = 491;
											this.anIntArray243[this.anInt1005] = local614.anInt725;
											this.anIntArray240[this.anInt1005] = local53;
											this.anIntArray241[this.anInt1005] = local59;
											this.anInt1005++;
										}
									}
									this.aStringArray13[this.anInt1005] = "Examine @lre@" + local620.aString16;
									this.anIntArray242[this.anInt1005] = 1914;
									this.anIntArray243[this.anInt1005] = local614.anInt725;
									this.anIntArray240[this.anInt1005] = local53;
									this.anIntArray241[this.anInt1005] = local59;
									this.anInt1005++;
								} else if ((this.anInt906 & 0x1) == 1) {
									this.aStringArray13[this.anInt1005] = this.aString25 + " @lre@" + local620.aString16;
									this.anIntArray242[this.anInt1005] = 769;
									this.anIntArray243[this.anInt1005] = local614.anInt725;
									this.anIntArray240[this.anInt1005] = local53;
									this.anIntArray241[this.anInt1005] = local59;
									this.anInt1005++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(954) RuntimeException local954) {
			signlink.reporterror("30423, " + -8207 + ", " + local954.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method625() {
		try {
			this.method626();
			if (this.anInt952 == 1) {
				this.aClass1_Sub1_Sub2_Sub1Array4[this.anInt951 / 100].method252(this.anInt950 - 8 - 4, this.anInt949 - 8 - 4);
			}
			@Pc(88) int local88;
			if (this.anInt952 == 2) {
				this.aClass1_Sub1_Sub2_Sub1Array4[this.anInt951 / 100 + 4].method252(this.anInt950 - 8 - 4, this.anInt949 - 8 - 4);
				anInt867++;
				if (anInt867 > 1114) {
					anInt867 = 0;
					this.aClass1_Sub1_Sub4_8.method394(26);
					this.aClass1_Sub1_Sub4_8.method395(0);
					local88 = this.aClass1_Sub1_Sub4_8.anInt624;
					this.aClass1_Sub1_Sub4_8.method395((int) (Math.random() * 256.0D));
					this.aClass1_Sub1_Sub4_8.method396(9360);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub4_8.method395(245);
					}
					this.aClass1_Sub1_Sub4_8.method396(2628);
					this.aClass1_Sub1_Sub4_8.method396(27049);
					this.aClass1_Sub1_Sub4_8.method395(152);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub4_8.method396(33207);
					}
					this.aClass1_Sub1_Sub4_8.method396(59958);
					this.aClass1_Sub1_Sub4_8.method395(186);
					this.aClass1_Sub1_Sub4_8.method396((int) (Math.random() * 65536.0D));
					this.aClass1_Sub1_Sub4_8.method404(this.aClass1_Sub1_Sub4_8.anInt624 - local88);
				}
			}
			if (this.anInt979 != -1) {
				this.method668(this.anInt979, this.anInt944, this.anInt969);
				this.method638(Class24.method230(this.anInt979), 0, 0, 0, 284);
			}
			if (this.anInt945 != -1) {
				this.method668(this.anInt945, this.anInt944, this.anInt969);
				this.method638(Class24.method230(this.anInt945), 0, 0, 0, 284);
			}
			this.method632();
			if (!this.aBoolean230) {
				this.method654();
				this.method619();
			} else if (this.anInt869 == 0) {
				this.method704();
			}
			if (this.anInt881 == 1) {
				this.aClass1_Sub1_Sub2_Sub1_8.method252(296, 472);
			}
			@Pc(267) int local267;
			if (aBoolean224) {
				@Pc(233) byte local233 = 20;
				@Pc(235) int local235 = 16776960;
				if (super.anInt808 < 30 && aBoolean234) {
					local235 = 16711680;
				}
				if (super.anInt808 < 20 && !aBoolean234) {
					local235 = 16711680;
				}
				this.aClass1_Sub1_Sub2_Sub2_3.method274(20, "Fps:" + super.anInt808, local235);
				local267 = local233 + 15;
				@Pc(269) Runtime local269 = Runtime.getRuntime();
				@Pc(278) int local278 = (int) ((local269.totalMemory() - local269.freeMemory()) / 1024L);
				if (local278 > 33554432 && aBoolean234) {
				}
				if (local278 > 67108864 && !aBoolean234) {
				}
				this.aClass1_Sub1_Sub2_Sub2_3.method274(35, "Mem:" + local278 + "k", 16776960);
				local267 += 15;
			}
			if (this.anInt877 != 0) {
				local88 = this.anInt877 / 50;
				local267 = local88 / 60;
				local88 %= 60;
				if (local88 < 10) {
					this.aClass1_Sub1_Sub2_Sub2_3.method279(329, 16776960, 4, "System update in: " + local267 + ":0" + local88);
				} else {
					this.aClass1_Sub1_Sub2_Sub2_3.method279(329, 16776960, 4, "System update in: " + local267 + ":" + local88);
				}
			}
		} catch (@Pc(369) RuntimeException local369) {
			signlink.reporterror("58036, " + 42641 + ", " + local369.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method626() {
		try {
			if (this.anInt1009 != 0) {
				@Pc(6) Class1_Sub1_Sub2_Sub2 local6 = this.aClass1_Sub1_Sub2_Sub2_3;
				@Pc(12) int local12 = 0;
				if (this.anInt877 != 0) {
					local12 = 1;
				}
				for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
					if (this.aStringArray11[local19] != null) {
						@Pc(31) int local31 = this.anIntArray238[local19];
						@Pc(36) String local36 = this.aStringArray10[local19];
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
						if ((local31 == 3 || local31 == 7) && (local31 == 7 || this.anInt840 == 0 || this.anInt840 == 1 && this.method589(local36))) {
							local89 = 329 - local12 * 13;
							local6.method279(local89, 0, 4, "From");
							local6.method279(local89 - 1, 65535, 4, "From");
							@Pc(114) int local114 = local6.method277("From ") + 4;
							if (local38 == 1) {
								this.aClass1_Sub1_Sub2_Sub4Array2[0].method570(local89 - 12, local114);
								local114 += 14;
							}
							if (local38 == 2) {
								this.aClass1_Sub1_Sub2_Sub4Array2[1].method570(local89 - 12, local114);
								local114 += 14;
							}
							local6.method279(local89, 0, local114, local36 + ": " + this.aStringArray11[local19]);
							local6.method279(local89 - 1, 65535, local114, local36 + ": " + this.aStringArray11[local19]);
							local12++;
							if (local12 >= 5) {
								return;
							}
						}
						if (local31 == 5 && this.anInt840 < 2) {
							local89 = 329 - local12 * 13;
							local6.method279(local89, 0, 4, this.aStringArray11[local19]);
							local6.method279(local89 - 1, 65535, 4, this.aStringArray11[local19]);
							local12++;
							if (local12 >= 5) {
								return;
							}
						}
						if (local31 == 6 && this.anInt840 < 2) {
							local89 = 329 - local12 * 13;
							local6.method279(local89, 0, 4, "To " + local36 + ": " + this.aStringArray11[local19]);
							local6.method279(local89 - 1, 65535, 4, "To " + local36 + ": " + this.aStringArray11[local19]);
							local12++;
							if (local12 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("76063, " + -51 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method627(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) Graphics local4 = this.method582(523).getGraphics();
			if (arg0 < 7 || arg0 > 7) {
				this.anInt962 = this.aClass1_Sub1_Sub4_6.method405();
			}
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			this.method575();
			@Pc(47) byte local47;
			@Pc(53) int local53;
			if (this.aBoolean202) {
				this.aBoolean195 = false;
				local4.setFont(new Font("Helvetica", 1, 16));
				local4.setColor(Color.yellow);
				local47 = 35;
				local4.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
				local53 = local47 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				@Pc(62) int local62 = local53 + 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				@Pc(79) int local79 = local62 + 30;
				local4.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
				@Pc(85) int local85 = local79 + 30;
				local4.drawString("3: Try using a different game-world", 30, 195);
				@Pc(91) int local91 = local85 + 30;
				local4.drawString("4: Try rebooting your computer", 30, 225);
				@Pc(97) int local97 = local91 + 30;
				local4.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
			}
			if (this.aBoolean200) {
				this.aBoolean195 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean214) {
				this.aBoolean195 = false;
				local4.setColor(Color.yellow);
				local47 = 35;
				local4.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
				local53 = local47 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				local53 += 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				local53 += 30;
				local4.drawString("2: Try rebooting your computer, and reloading", 30, 165);
				local53 += 30;
			}
		} catch (@Pc(185) RuntimeException local185) {
			signlink.reporterror("4094, " + arg0 + ", " + local185.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!NHFASBOX;)V")
	private void method628(@OriginalArg(1) Class24 arg0) {
		try {
			@Pc(7) int local7;
			if (this.anInt1006 != -21060) {
				for (local7 = 1; local7 > 0; local7++) {
				}
			}
			local7 = arg0.anInt359;
			@Pc(71) int local71;
			if (local7 >= 1 && local7 <= 100 || local7 >= 701 && local7 <= 800) {
				if (local7 == 1 && this.anInt978 == 0) {
					arg0.aString8 = "Loading friend list";
					arg0.anInt378 = 0;
				} else if (local7 == 1 && this.anInt978 == 1) {
					arg0.aString8 = "Connecting to friendserver";
					arg0.anInt378 = 0;
				} else if (local7 == 2 && this.anInt978 != 2) {
					arg0.aString8 = "Please wait...";
					arg0.anInt378 = 0;
				} else {
					local71 = this.anInt977;
					if (this.anInt978 != 2) {
						local71 = 0;
					}
					if (local7 > 700) {
						local7 -= 601;
					} else {
						local7--;
					}
					if (local7 >= local71) {
						arg0.aString8 = "";
						arg0.anInt378 = 0;
					} else {
						arg0.aString8 = this.aStringArray14[local7];
						arg0.anInt378 = 1;
					}
				}
			} else if (local7 >= 101 && local7 <= 200 || !(local7 < 801 || local7 > 900)) {
				local71 = this.anInt977;
				if (this.anInt978 != 2) {
					local71 = 0;
				}
				if (local7 > 800) {
					local7 -= 701;
				} else {
					local7 -= 101;
				}
				if (local7 >= local71) {
					arg0.aString8 = "";
					arg0.anInt378 = 0;
				} else {
					if (this.anIntArray213[local7] == 0) {
						arg0.aString8 = "@red@Offline";
					} else if (this.anIntArray213[local7] < 200) {
						if (this.anIntArray213[local7] == anInt1030) {
							arg0.aString8 = "@gre@World" + (this.anIntArray213[local7] - 9);
						} else {
							arg0.aString8 = "@yel@World" + (this.anIntArray213[local7] - 9);
						}
					} else if (this.anIntArray213[local7] == anInt1030) {
						arg0.aString8 = "@gre@Classic" + (this.anIntArray213[local7] - 219);
					} else {
						arg0.aString8 = "@yel@Classic" + (this.anIntArray213[local7] - 219);
					}
					arg0.anInt378 = 1;
				}
			} else if (local7 == 203) {
				local71 = this.anInt977;
				if (this.anInt978 != 2) {
					local71 = 0;
				}
				arg0.anInt368 = local71 * 15 + 20;
				if (arg0.anInt368 <= arg0.anInt352) {
					arg0.anInt368 = arg0.anInt352 + 1;
				}
			} else if (local7 >= 401 && local7 <= 500) {
				local7 -= 401;
				if (local7 == 0 && this.anInt978 == 0) {
					arg0.aString8 = "Loading ignore list";
					arg0.anInt378 = 0;
				} else if (local7 == 1 && this.anInt978 == 0) {
					arg0.aString8 = "Please wait...";
					arg0.anInt378 = 0;
				} else {
					local71 = this.anInt929;
					if (this.anInt978 == 0) {
						local71 = 0;
					}
					if (local7 >= local71) {
						arg0.aString8 = "";
						arg0.anInt378 = 0;
					} else {
						arg0.aString8 = Class2.method18(Class2.method15(357, this.aLongArray3[local7]));
						arg0.anInt378 = 1;
					}
				}
			} else if (local7 == 503) {
				arg0.anInt368 = this.anInt929 * 15 + 20;
				if (arg0.anInt368 <= arg0.anInt352) {
					arg0.anInt368 = arg0.anInt352 + 1;
				}
			} else if (local7 == 327) {
				arg0.anInt362 = 150;
				arg0.anInt363 = (int) (Math.sin((double) anInt953 / 40.0D) * 256.0D) & 0x7FF;
				if (this.aBoolean218) {
					for (local71 = 0; local71 < 7; local71++) {
						@Pc(384) int local384 = this.anIntArray244[local71];
						if (local384 >= 0 && !Class37.aClass37Array1[local384].method442()) {
							return;
						}
					}
					this.aBoolean218 = false;
					@Pc(403) Class1_Sub1_Sub1_Sub3[] local403 = new Class1_Sub1_Sub1_Sub3[7];
					@Pc(405) int local405 = 0;
					for (@Pc(407) int local407 = 0; local407 < 7; local407++) {
						@Pc(414) int local414 = this.anIntArray244[local407];
						if (local414 >= 0) {
							local403[local405++] = Class37.aClass37Array1[local414].method443();
						}
					}
					@Pc(436) Class1_Sub1_Sub1_Sub3 local436 = new Class1_Sub1_Sub1_Sub3((byte) 9, local405, local403);
					for (@Pc(438) int local438 = 0; local438 < 5; local438++) {
						if (this.anIntArray235[local438] != 0) {
							local436.method161(anIntArrayArray24[local438][0], anIntArrayArray24[local438][this.anIntArray235[local438]]);
							if (local438 == 1) {
								local436.method161(anIntArray261[0], anIntArray261[this.anIntArray235[local438]]);
							}
						}
					}
					local436.method154();
					local436.method155(Class19.aClass19Array1[aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt453].anIntArray99[0]);
					local436.method164(64, 850, -30, -50, -30, true);
					arg0.anInt385 = 5;
					arg0.anInt386 = 0;
					Class24.method229(local436);
				}
			} else if (local7 == 324) {
				if (this.aClass1_Sub1_Sub2_Sub1_3 == null) {
					this.aClass1_Sub1_Sub2_Sub1_3 = arg0.aClass1_Sub1_Sub2_Sub1_1;
					this.aClass1_Sub1_Sub2_Sub1_4 = arg0.aClass1_Sub1_Sub2_Sub1_2;
				}
				if (this.aBoolean199) {
					arg0.aClass1_Sub1_Sub2_Sub1_1 = this.aClass1_Sub1_Sub2_Sub1_4;
				} else {
					arg0.aClass1_Sub1_Sub2_Sub1_1 = this.aClass1_Sub1_Sub2_Sub1_3;
				}
			} else if (local7 == 325) {
				if (this.aClass1_Sub1_Sub2_Sub1_3 == null) {
					this.aClass1_Sub1_Sub2_Sub1_3 = arg0.aClass1_Sub1_Sub2_Sub1_1;
					this.aClass1_Sub1_Sub2_Sub1_4 = arg0.aClass1_Sub1_Sub2_Sub1_2;
				}
				if (this.aBoolean199) {
					arg0.aClass1_Sub1_Sub2_Sub1_1 = this.aClass1_Sub1_Sub2_Sub1_3;
				} else {
					arg0.aClass1_Sub1_Sub2_Sub1_1 = this.aClass1_Sub1_Sub2_Sub1_4;
				}
			} else if (local7 == 600) {
				arg0.aString8 = this.aString30;
				if (anInt953 % 20 < 10) {
					arg0.aString8 = arg0.aString8 + "|";
				} else {
					arg0.aString8 = arg0.aString8 + " ";
				}
			} else {
				if (local7 == 620) {
					if (this.anInt838 < 1) {
						arg0.aString8 = "";
					} else if (this.aBoolean225) {
						arg0.anInt356 = 16711680;
						arg0.aString8 = "Moderator option: Mute player for 48 hours: <ON>";
					} else {
						arg0.anInt356 = 16777215;
						arg0.aString8 = "Moderator option: Mute player for 48 hours: <OFF>";
					}
				}
				@Pc(643) String local643;
				if (local7 == 660) {
					local71 = this.anInt957 - this.anInt1015;
					if (local71 <= 0) {
						local643 = "earlier today";
					} else if (local71 == 1) {
						local643 = "yesterday";
					} else {
						local643 = local71 + " days ago";
					}
					arg0.aString8 = "You last logged in @red@" + local643 + "@bla@ from: @red@" + signlink.dns;
				}
				if (local7 == 661) {
					if (this.anInt967 == 0) {
						arg0.aString8 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
					} else if (this.anInt967 <= this.anInt957) {
						arg0.aString8 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method629(this.anInt967);
					} else {
						local71 = this.anInt957 + 14 - this.anInt967;
						if (local71 <= 0) {
							local643 = "Earlier today";
						} else if (local71 == 1) {
							local643 = "Yesterday";
						} else {
							local643 = local71 + " days ago";
						}
						arg0.aString8 = local643 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method629(this.anInt967) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
					}
				}
				if (local7 == 662) {
					@Pc(761) String local761;
					if (this.anInt842 == 0) {
						local761 = "@yel@0 unread messages";
					} else if (this.anInt842 == 1) {
						local761 = "@gre@1 unread message";
					} else {
						local761 = "@gre@" + this.anInt842 + " unread messages";
					}
					arg0.aString8 = "You have " + local761 + "\\nin your message centre.";
				}
				if (local7 == 663) {
					if (this.anInt981 > 0 && this.anInt981 <= this.anInt957 + 10) {
						arg0.aString8 = "Last password change:\\n@gre@" + this.method629(this.anInt981);
					} else {
						arg0.aString8 = "Last password change:\\n@gre@Never changed";
					}
				}
				if (local7 == 665) {
					if (this.anInt862 > 2 && !aBoolean233) {
						arg0.aString8 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
					} else if (this.anInt862 > 2) {
						arg0.aString8 = "\\n\\nYou have @gre@" + this.anInt862 + "@yel@ days of\\nmember credit remaining.";
					} else if (this.anInt862 > 0) {
						arg0.aString8 = "You have @gre@" + this.anInt862 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
					} else {
						arg0.aString8 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
					}
				}
				if (local7 == 667) {
					if (this.anInt862 > 2 && !aBoolean233) {
						arg0.aString8 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
					} else if (this.anInt862 > 0) {
						arg0.aString8 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
					} else {
						arg0.aString8 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
					}
				}
				if (local7 == 668) {
					if (this.anInt967 > this.anInt957) {
						arg0.aString8 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
					} else {
						arg0.aString8 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
					}
				}
			}
		} catch (@Pc(918) RuntimeException local918) {
			signlink.reporterror("85594, " + -21060 + ", " + arg0 + ", " + local918.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)Ljava/lang/String;")
	private String method629(@OriginalArg(1) int arg0) {
		try {
			if (arg0 > this.anInt957 + 10) {
				return "Unknown";
			}
			@Pc(20) long local20 = ((long) arg0 + 11745L) * 86400000L;
			@Pc(22) Calendar local22 = Calendar.getInstance();
			local22.setTime(new Date(local20));
			@Pc(32) int local32 = local22.get(5);
			@Pc(36) int local36 = local22.get(2);
			@Pc(40) int local40 = local22.get(1);
			@Pc(91) String[] local91 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
			return local32 + "-" + local91[local36] + "-" + local40;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("28446, " + 117 + ", " + arg0 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IJ)V")
	private void method630(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt977 >= 100 && this.anInt903 != 1) {
					this.method618("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
				} else if (this.anInt977 >= 200) {
					this.method618("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
				} else {
					@Pc(38) String local38 = Class2.method18(Class2.method15(357, arg0));
					for (@Pc(40) int local40 = 0; local40 < this.anInt977; local40++) {
						if (this.aLongArray4[local40] == arg0) {
							this.method618("", 0, local38 + " is already on your friend list");
							return;
						}
					}
					for (@Pc(70) int local70 = 0; local70 < this.anInt929; local70++) {
						if (this.aLongArray3[local70] == arg0) {
							this.method618("", 0, "Please remove " + local38 + " from your ignore list first");
							return;
						}
					}
					if (!local38.equals(aClass1_Sub1_Sub1_Sub4_Sub1_1.aString7)) {
						this.aStringArray14[this.anInt977] = local38;
						this.aLongArray4[this.anInt977] = arg0;
						this.anIntArray213[this.anInt977] = 0;
						this.anInt977++;
						this.aBoolean219 = true;
						this.aClass1_Sub1_Sub4_8.method394(190);
						this.aClass1_Sub1_Sub4_8.method401(arg0, 601);
					}
				}
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("26846, " + -25941 + ", " + arg0 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)Z")
	private boolean method631() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("10138, " + 92 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method632() {
		try {
			if (this.aByte29 != 1) {
				this.aBoolean229 = !this.aBoolean229;
			}
			this.anInt1027 = 0;
			@Pc(22) int local22 = (aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt458 >> 7) + this.anInt833;
			@Pc(30) int local30 = (aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt459 >> 7) + this.anInt834;
			if (local22 >= 3053 && local22 <= 3156 && local30 >= 3056 && local30 <= 3136) {
				this.anInt1027 = 1;
			}
			if (local22 >= 3072 && local22 <= 3118 && local30 >= 9492 && local30 <= 9535) {
				this.anInt1027 = 1;
			}
			if (this.anInt1027 == 1 && local22 >= 3139 && local22 <= 3199 && local30 >= 3008 && local30 <= 3062) {
				this.anInt1027 = 0;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("50824, " + 1 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method633() {
		try {
			@Pc(6) int local6 = this.anInt972 * 128 + 64;
			@Pc(13) int local13 = this.anInt973 * 128 + 64;
			@Pc(24) int local24 = this.method666(local6, local13, this.anInt934) - this.anInt974;
			if (this.anInt896 < local6) {
				this.anInt896 += this.anInt975 + (local6 - this.anInt896) * this.anInt976 / 1000;
				if (this.anInt896 > local6) {
					this.anInt896 = local6;
				}
			}
			if (this.anInt896 > local6) {
				this.anInt896 -= this.anInt975 + (this.anInt896 - local6) * this.anInt976 / 1000;
				if (this.anInt896 < local6) {
					this.anInt896 = local6;
				}
			}
			if (this.anInt897 < local24) {
				this.anInt897 += this.anInt975 + (local24 - this.anInt897) * this.anInt976 / 1000;
				if (this.anInt897 > local24) {
					this.anInt897 = local24;
				}
			}
			if (this.anInt897 > local24) {
				this.anInt897 -= this.anInt975 + (this.anInt897 - local24) * this.anInt976 / 1000;
				if (this.anInt897 < local24) {
					this.anInt897 = local24;
				}
			}
			if (this.anInt898 < local13) {
				this.anInt898 += this.anInt975 + (local13 - this.anInt898) * this.anInt976 / 1000;
				if (this.anInt898 > local13) {
					this.anInt898 = local13;
				}
			}
			if (this.anInt898 > local13) {
				this.anInt898 -= this.anInt975 + (this.anInt898 - local13) * this.anInt976 / 1000;
				if (this.anInt898 < local13) {
					this.anInt898 = local13;
				}
			}
			local6 = this.anInt849 * 128 + 64;
			local13 = this.anInt850 * 128 + 64;
			local24 = this.method666(local6, local13, this.anInt934) - this.anInt851;
			@Pc(222) int local222 = local6 - this.anInt896;
			@Pc(227) int local227 = local24 - this.anInt897;
			@Pc(232) int local232 = local13 - this.anInt898;
			@Pc(243) int local243 = (int) Math.sqrt((double) (local222 * local222 + local232 * local232));
			@Pc(259) int local259 = (int) (Math.atan2((double) local227, (double) local243) * 325.949D) & 0x7FF;
			@Pc(270) int local270 = (int) (Math.atan2((double) local222, (double) local232) * -325.949D) & 0x7FF;
			if (local259 < 128) {
				local259 = 128;
			}
			if (local259 > 383) {
				local259 = 383;
			}
			if (this.anInt899 < local259) {
				this.anInt899 += this.anInt852 + (local259 - this.anInt899) * this.anInt853 / 1000;
				if (this.anInt899 > local259) {
					this.anInt899 = local259;
				}
			}
			if (this.anInt899 > local259) {
				this.anInt899 -= this.anInt852 + (this.anInt899 - local259) * this.anInt853 / 1000;
				if (this.anInt899 < local259) {
					this.anInt899 = local259;
				}
			}
			@Pc(341) int local341 = local270 - this.anInt900;
			if (local341 > 1024) {
				local341 -= 2048;
			}
			if (local341 < -1024) {
				local341 += 2048;
			}
			if (local341 > 0) {
				this.anInt900 += this.anInt852 + local341 * this.anInt853 / 1000;
				this.anInt900 &= 0x7FF;
			}
			if (local341 < 0) {
				this.anInt900 -= this.anInt852 + -local341 * this.anInt853 / 1000;
				this.anInt900 &= 0x7FF;
			}
			@Pc(399) int local399 = local270 - this.anInt900;
			if (local399 > 1024) {
				local399 -= 2048;
			}
			if (local399 < -1024) {
				local399 += 2048;
			}
			if (local399 < 0 && local341 > 0 || local399 > 0 && local341 < 0) {
				this.anInt900 = local270;
			}
		} catch (@Pc(420) RuntimeException local420) {
			signlink.reporterror("61531, " + 0 + ", " + local420.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method634() {
		try {
			if (this.anInt939 == 0) {
				@Pc(11) int local11 = super.anInt818;
				if (this.anInt904 == 1 && super.anInt819 >= 516 && super.anInt820 >= 160 && super.anInt819 <= 765 && super.anInt820 <= 205) {
					local11 = 0;
				}
				@Pc(42) int local42;
				@Pc(45) int local45;
				@Pc(121) int local121;
				if (this.aBoolean230) {
					if (local11 != 1) {
						local42 = super.anInt813;
						local45 = super.anInt814;
						if (this.anInt869 == 0) {
							local42 -= 4;
							local45 -= 4;
						}
						if (this.anInt869 == 1) {
							local42 -= 553;
							local45 -= 205;
						}
						if (this.anInt869 == 2) {
							local42 -= 17;
							local45 -= 357;
						}
						if (local42 < this.anInt870 - 10 || local42 > this.anInt870 + this.anInt872 + 10 || local45 < this.anInt871 - 10 || local45 > this.anInt871 + this.anInt873 + 10) {
							this.aBoolean230 = false;
							if (this.anInt869 == 1) {
								this.aBoolean219 = true;
							}
							if (this.anInt869 == 2) {
								this.aBoolean228 = true;
							}
						}
					}
					if (local11 == 1) {
						local42 = this.anInt870;
						local45 = this.anInt871;
						local121 = this.anInt872;
						@Pc(124) int local124 = super.anInt819;
						@Pc(127) int local127 = super.anInt820;
						if (this.anInt869 == 0) {
							local124 -= 4;
							local127 -= 4;
						}
						if (this.anInt869 == 1) {
							local124 -= 553;
							local127 -= 205;
						}
						if (this.anInt869 == 2) {
							local124 -= 17;
							local127 -= 357;
						}
						@Pc(146) int local146 = -1;
						for (@Pc(148) int local148 = 0; local148 < this.anInt1005; local148++) {
							@Pc(163) int local163 = local45 + (this.anInt1005 - 1 - local148) * 15 + 31;
							if (local124 > local42 && local124 < local42 + local121 && local127 > local163 - 13 && local127 < local163 + 3) {
								local146 = local148;
							}
						}
						if (local146 != -1) {
							this.method710(local146);
						}
						this.aBoolean230 = false;
						if (this.anInt869 == 1) {
							this.aBoolean219 = true;
						}
						if (this.anInt869 == 2) {
							this.aBoolean228 = true;
							return;
						}
					}
				} else {
					if (local11 == 1 && this.anInt1005 > 0) {
						local42 = this.anIntArray242[this.anInt1005 - 1];
						if (local42 == 941 || local42 == 631 || local42 == 94 || local42 == 292 || local42 == 883 || local42 == 221 || local42 == 379 || local42 == 207 || local42 == 228 || local42 == 675 || local42 == 860 || local42 == 1826) {
							local45 = this.anIntArray240[this.anInt1005 - 1];
							local121 = this.anIntArray241[this.anInt1005 - 1];
							@Pc(282) Class24 local282 = Class24.method230(local121);
							if (local282.aBoolean73 || local282.aBoolean71) {
								this.aBoolean204 = false;
								this.anInt1018 = 0;
								this.anInt937 = local121;
								this.anInt938 = local45;
								this.anInt939 = 2;
								this.anInt940 = super.anInt819;
								this.anInt941 = super.anInt820;
								if (Class24.method230(local121).anInt379 == this.anInt945) {
									this.anInt939 = 1;
								}
								if (Class24.method230(local121).anInt379 == this.anInt887) {
									this.anInt939 = 3;
								}
								return;
							}
						}
					}
					if (local11 == 1 && (this.anInt992 == 1 || this.method623(this.anInt1005 - 1)) && this.anInt1005 > 2) {
						local11 = 2;
					}
					if (local11 == 1 && this.anInt1005 > 0) {
						this.method710(this.anInt1005 - 1);
					}
					if (local11 != 2 || this.anInt1005 <= 0) {
						return;
					}
					this.method586();
				}
			}
		} catch (@Pc(375) RuntimeException local375) {
			signlink.reporterror("67450, " + false + ", " + local375.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)I")
	private int method635() {
		try {
			@Pc(3) int local3 = 3;
			if (this.anInt899 < 310) {
				@Pc(21) int local21 = this.anInt896 >> 7;
				@Pc(26) int local26 = this.anInt898 >> 7;
				@Pc(31) int local31 = aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt458 >> 7;
				@Pc(36) int local36 = aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt459 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt934][local21][local26] & 0x4) != 0) {
					local3 = this.anInt934;
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
						if ((this.aByteArrayArrayArray8[this.anInt934][local21][local26] & 0x4) != 0) {
							local3 = this.anInt934;
						}
						local88 += local86;
						if (local88 >= 65536) {
							local88 -= 65536;
							if (local26 < local36) {
								local26++;
							} else if (local26 > local36) {
								local26--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt934][local21][local26] & 0x4) != 0) {
								local3 = this.anInt934;
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
						if ((this.aByteArrayArrayArray8[this.anInt934][local21][local26] & 0x4) != 0) {
							local3 = this.anInt934;
						}
						local88 += local86;
						if (local88 >= 65536) {
							local88 -= 65536;
							if (local21 < local31) {
								local21++;
							} else if (local21 > local31) {
								local21--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt934][local21][local26] & 0x4) != 0) {
								local3 = this.anInt934;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt934][aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt458 >> 7][aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt459 >> 7] & 0x4) != 0) {
				local3 = this.anInt934;
			}
			return local3;
		} catch (@Pc(254) RuntimeException local254) {
			signlink.reporterror("72607, " + 5 + ", " + local254.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)I")
	private int method636() {
		try {
			@Pc(9) int local9 = this.method666(this.anInt896, this.anInt898, this.anInt934);
			return local9 - this.anInt897 >= 800 || (this.aByteArrayArrayArray8[this.anInt934][this.anInt896 >> 7][this.anInt898 >> 7] & 0x4) == 0 ? 3 : this.anInt934;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("5314, " + -61 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method637() {
		try {
			this.anInt980++;
			this.method701(true);
			this.method651(this.aByte32, true);
			this.method701(false);
			this.method651(this.aByte32, false);
			this.method662(this.aBoolean229);
			this.method671(this.anInt1046);
			@Pc(44) int local44;
			@Pc(83) int local83;
			if (!this.aBoolean221) {
				local44 = this.anInt918;
				if (this.anInt925 / 256 > local44) {
					local44 = this.anInt925 / 256;
				}
				if (this.aBooleanArray12[4] && this.anIntArray222[4] + 128 > local44) {
					local44 = this.anIntArray222[4] + 128;
				}
				local83 = this.anInt919 + this.anInt858 & 0x7FF;
				this.method585(this.method666(aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt458, aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt459, this.anInt934) - 50, local83, this.anInt926, local44 * 3 + 600, this.anInt927, local44);
			}
			if (this.aBoolean221) {
				local44 = this.method636();
			} else {
				local44 = this.method635();
			}
			local83 = this.anInt896;
			@Pc(127) int local127 = this.anInt897;
			@Pc(130) int local130 = this.anInt898;
			@Pc(133) int local133 = this.anInt899;
			@Pc(136) int local136 = this.anInt900;
			@Pc(185) int local185;
			for (@Pc(138) int local138 = 0; local138 < 5; local138++) {
				if (this.aBooleanArray12[local138]) {
					local185 = (int) (Math.random() * (double) (this.anIntArray248[local138] * 2 + 1) - (double) this.anIntArray248[local138] + Math.sin((double) this.anIntArray256[local138] * ((double) this.anIntArray246[local138] / 100.0D)) * (double) this.anIntArray222[local138]);
					if (local138 == 0) {
						this.anInt896 += local185;
					}
					if (local138 == 1) {
						this.anInt897 += local185;
					}
					if (local138 == 2) {
						this.anInt898 += local185;
					}
					if (local138 == 3) {
						this.anInt900 = this.anInt900 + local185 & 0x7FF;
					}
					if (local138 == 4) {
						this.anInt899 += local185;
						if (this.anInt899 < 128) {
							this.anInt899 = 128;
						}
						if (this.anInt899 > 383) {
							this.anInt899 = 383;
						}
					}
				}
			}
			local185 = Class1_Sub1_Sub2_Sub3.anInt576;
			Class1_Sub1_Sub1_Sub3.aBoolean43 = true;
			Class1_Sub1_Sub1_Sub3.anInt194 = 0;
			Class1_Sub1_Sub1_Sub3.anInt192 = super.anInt813 - 4;
			Class1_Sub1_Sub1_Sub3.anInt193 = super.anInt814 - 4;
			Class1_Sub1_Sub2.method556(this.anInt948);
			this.aClass10_1.method93(this.anInt898, this.anInt900, this.anInt897, this.anInt896, this.anInt899, local44);
			this.aClass10_1.method68(this.aByte31);
			this.method683();
			this.method605();
			this.method698(local185);
			this.method625();
			this.aClass18_26.method190(796, 4, 4, super.aGraphics2);
			this.anInt896 = local83;
			this.anInt897 = local127;
			this.anInt898 = local130;
			this.anInt899 = local133;
			this.anInt900 = local136;
		} catch (@Pc(326) RuntimeException local326) {
			signlink.reporterror("85323, " + false + ", " + local326.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!NHFASBOX;IIII)V")
	private void method638(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg0.anInt364 == 0 && arg0.anIntArray126 != null && (!arg0.aBoolean69 || this.anInt942 == arg0.anInt375 || this.anInt885 == arg0.anInt375 || this.anInt825 == arg0.anInt375)) {
				@Pc(29) int local29 = Class1_Sub1_Sub2.anInt791;
				@Pc(31) int local31 = Class1_Sub1_Sub2.anInt789;
				@Pc(33) int local33 = Class1_Sub1_Sub2.anInt792;
				@Pc(35) int local35 = Class1_Sub1_Sub2.anInt790;
				@Pc(39) boolean local39 = false;
				Class1_Sub1_Sub2.method555(arg2 + arg0.anInt366, arg2, arg3 + arg0.anInt352, this.anInt865, arg3);
				@Pc(56) int local56 = arg0.anIntArray126.length;
				for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
					@Pc(67) int local67 = arg0.anIntArray118[local58] + arg2;
					@Pc(76) int local76 = arg0.anIntArray122[local58] + arg3 - arg1;
					@Pc(82) Class24 local82 = Class24.method230(arg0.anIntArray126[local58]);
					@Pc(87) int local87 = local67 + local82.anInt374;
					@Pc(92) int local92 = local76 + local82.anInt367;
					if (local82.anInt359 > 0) {
						this.method628(local82);
					}
					if (local82.anInt364 == 0) {
						if (local82.anInt377 > local82.anInt368 - local82.anInt352) {
							local82.anInt377 = local82.anInt368 - local82.anInt352;
						}
						if (local82.anInt377 < 0) {
							local82.anInt377 = 0;
						}
						this.method638(local82, local82.anInt377, local87, local92, 284);
						if (local82.anInt368 > local82.anInt352) {
							this.method714(local92, this.anInt993, local82.anInt368, local87 + local82.anInt366, local82.anInt352, local82.anInt377);
						}
					} else if (local82.anInt364 != 1) {
						@Pc(165) int local165;
						@Pc(169) int local169;
						@Pc(180) int local180;
						@Pc(215) int local215;
						@Pc(222) int local222;
						@Pc(247) int local247;
						@Pc(163) int local163;
						@Pc(213) int local213;
						if (local82.anInt364 == 2) {
							local163 = 0;
							for (local165 = 0; local165 < local82.anInt352; local165++) {
								for (local169 = 0; local169 < local82.anInt366; local169++) {
									local180 = local87 + local169 * (local82.anInt383 + 32);
									@Pc(189) int local189 = local92 + local165 * (local82.anInt355 + 32);
									if (local163 < 20) {
										local180 += local82.anIntArray121[local163];
										local189 += local82.anIntArray120[local163];
									}
									if (local82.anIntArray125[local163] > 0) {
										local213 = 0;
										local215 = 0;
										local222 = local82.anIntArray125[local163] - 1;
										if (local180 > Class1_Sub1_Sub2.anInt791 - 32 && local180 < Class1_Sub1_Sub2.anInt792 && local189 > Class1_Sub1_Sub2.anInt789 - 32 && local189 < Class1_Sub1_Sub2.anInt790 || this.anInt939 != 0 && this.anInt938 == local163) {
											local247 = 0;
											if (this.anInt1035 == 1 && this.anInt1036 == local163 && this.anInt1037 == local82.anInt375) {
												local247 = 16777215;
											}
											@Pc(271) Class1_Sub1_Sub2_Sub1 local271 = Class39.method490(local82.anIntArray124[local163], local222, local247);
											if (local271 != null) {
												@Pc(350) int local350;
												if (this.anInt939 != 0 && this.anInt938 == local163 && this.anInt937 == local82.anInt375) {
													local213 = super.anInt813 - this.anInt940;
													local215 = super.anInt814 - this.anInt941;
													if (local213 < 5 && local213 > -5) {
														local213 = 0;
													}
													if (local215 < 5 && local215 > -5) {
														local215 = 0;
													}
													if (this.anInt1018 < 5) {
														local213 = 0;
														local215 = 0;
													}
													local271.method254(local189 + local215, local180 + local213);
													if (local189 + local215 < Class1_Sub1_Sub2.anInt789 && arg0.anInt377 > 0) {
														local350 = this.anInt944 * (Class1_Sub1_Sub2.anInt789 - local189 - local215) / 3;
														if (local350 > this.anInt944 * 10) {
															local350 = this.anInt944 * 10;
														}
														if (local350 > arg0.anInt377) {
															local350 = arg0.anInt377;
														}
														arg0.anInt377 -= local350;
														this.anInt941 += local350;
													}
													if (local189 + local215 + 32 > Class1_Sub1_Sub2.anInt790 && arg0.anInt377 < arg0.anInt368 - arg0.anInt352) {
														local350 = this.anInt944 * (local189 + local215 + 32 - Class1_Sub1_Sub2.anInt790) / 3;
														if (local350 > this.anInt944 * 10) {
															local350 = this.anInt944 * 10;
														}
														if (local350 > arg0.anInt368 - arg0.anInt352 - arg0.anInt377) {
															local350 = arg0.anInt368 - arg0.anInt352 - arg0.anInt377;
														}
														arg0.anInt377 += local350;
														this.anInt941 -= local350;
													}
												} else if (this.anInt829 != 0 && this.anInt828 == local163 && this.anInt827 == local82.anInt375) {
													local271.method254(local189, local180);
												} else {
													local271.method252(local189, local180);
												}
												if (local271.anInt417 == 33 || local82.anIntArray124[local163] != 1) {
													local350 = local82.anIntArray124[local163];
													this.aClass1_Sub1_Sub2_Sub2_2.method279(local189 + local215 + 10, 0, local180 + local213 + 1, method653(local350));
													this.aClass1_Sub1_Sub2_Sub2_2.method279(local189 + local215 + 9, 16776960, local180 + local213, method653(local350));
												}
											}
										}
									} else if (local82.aClass1_Sub1_Sub2_Sub1Array1 != null && local163 < 20) {
										@Pc(539) Class1_Sub1_Sub2_Sub1 local539 = local82.aClass1_Sub1_Sub2_Sub1Array1[local163];
										if (local539 != null) {
											local539.method252(local189, local180);
										}
									}
									local163++;
								}
							}
						} else if (local82.anInt364 == 3) {
							@Pc(565) boolean local565 = false;
							if (this.anInt825 == local82.anInt375 || this.anInt885 == local82.anInt375 || this.anInt942 == local82.anInt375) {
								local565 = true;
							}
							if (this.method705(local82)) {
								local163 = local82.anInt354;
								if (local565 && local82.anInt376 != 0) {
									local163 = local82.anInt376;
								}
							} else {
								local163 = local82.anInt356;
								if (local565 && local82.anInt384 != 0) {
									local163 = local82.anInt384;
								}
							}
							if (local82.aByte4 == 0) {
								if (local82.aBoolean77) {
									Class1_Sub1_Sub2.method558(local163, local82.anInt352, local87, local82.anInt366, local92);
								} else {
									Class1_Sub1_Sub2.method559(local163, local87, local92, local82.anInt352, local82.anInt366);
								}
							} else if (local82.aBoolean77) {
								Class1_Sub1_Sub2.method557(this.aBoolean215, 256 - (local82.aByte4 & 0xFF), local92, local82.anInt352, local82.anInt366, local87, local163);
							} else {
								Class1_Sub1_Sub2.method560(256 - (local82.aByte4 & 0xFF), local163, local87, local92, local82.anInt366, local82.anInt352);
							}
						} else {
							@Pc(684) Class1_Sub1_Sub2_Sub2 local684;
							@Pc(961) String local961;
							if (local82.anInt364 == 4) {
								local684 = local82.aClass1_Sub1_Sub2_Sub2_1;
								@Pc(687) String local687 = local82.aString8;
								@Pc(689) boolean local689 = false;
								if (this.anInt825 == local82.anInt375 || this.anInt885 == local82.anInt375 || this.anInt942 == local82.anInt375) {
									local689 = true;
								}
								if (this.method705(local82)) {
									local165 = local82.anInt354;
									if (local689 && local82.anInt376 != 0) {
										local165 = local82.anInt376;
									}
									if (local82.aString9.length() > 0) {
										local687 = local82.aString9;
									}
								} else {
									local165 = local82.anInt356;
									if (local689 && local82.anInt384 != 0) {
										local165 = local82.anInt384;
									}
								}
								if (local82.anInt378 == 6 && this.aBoolean206) {
									local687 = "Please wait...";
									local165 = local82.anInt356;
								}
								if (Class1_Sub1_Sub2.anInt787 == 479) {
									if (local165 == 16776960) {
										local165 = 255;
									}
									if (local165 == 49152) {
										local165 = 16777215;
									}
								}
								local213 = local92 + local684.anInt434;
								while (local687.length() > 0) {
									if (local687.indexOf("%") != -1) {
										label390: while (true) {
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
																				break label390;
																			}
																			local687 = local687.substring(0, local215) + this.method588(this.method614(4, local82)) + local687.substring(local215 + 2);
																		}
																	}
																	local687 = local687.substring(0, local215) + this.method588(this.method614(3, local82)) + local687.substring(local215 + 2);
																}
															}
															local687 = local687.substring(0, local215) + this.method588(this.method614(2, local82)) + local687.substring(local215 + 2);
														}
													}
													local687 = local687.substring(0, local215) + this.method588(this.method614(1, local82)) + local687.substring(local215 + 2);
												}
											}
											local687 = local687.substring(0, local215) + this.method588(this.method614(0, local82)) + local687.substring(local215 + 2);
										}
									}
									local215 = local687.indexOf("\\n");
									if (local215 == -1) {
										local961 = local687;
										local687 = "";
									} else {
										local961 = local687.substring(0, local215);
										local687 = local687.substring(local215 + 2);
									}
									if (local82.aBoolean70) {
										local684.method276(local87 + local82.anInt366 / 2, local213, local961, local82.aBoolean72, local165);
									} else {
										local684.method283(local165, local82.aBoolean72, local961, local87, local213);
									}
									local213 += local684.anInt434;
								}
							} else if (local82.anInt364 == 5) {
								@Pc(1023) Class1_Sub1_Sub2_Sub1 local1023;
								if (this.method705(local82)) {
									local1023 = local82.aClass1_Sub1_Sub2_Sub1_2;
								} else {
									local1023 = local82.aClass1_Sub1_Sub2_Sub1_1;
								}
								if (local1023 != null) {
									local1023.method252(local92, local87);
								}
							} else if (local82.anInt364 == 6) {
								local163 = Class1_Sub1_Sub2_Sub3.anInt572;
								local165 = Class1_Sub1_Sub2_Sub3.anInt573;
								Class1_Sub1_Sub2_Sub3.anInt572 = local87 + local82.anInt366 / 2;
								Class1_Sub1_Sub2_Sub3.anInt573 = local92 + local82.anInt352 / 2;
								local169 = Class1_Sub1_Sub2_Sub3.anIntArray161[local82.anInt362] * local82.anInt361 >> 16;
								local180 = Class1_Sub1_Sub2_Sub3.anIntArray162[local82.anInt362] * local82.anInt361 >> 16;
								@Pc(1084) boolean local1084 = this.method705(local82);
								if (local1084) {
									local213 = local82.anInt381;
								} else {
									local213 = local82.anInt380;
								}
								@Pc(1105) Class1_Sub1_Sub1_Sub3 local1105;
								if (local213 == -1) {
									local1105 = local82.method224(this.anInt968, local1084, -1, -1);
								} else {
									@Pc(1111) Class19 local1111 = Class19.aClass19Array1[local213];
									local1105 = local82.method224(this.anInt968, local1084, local1111.anIntArray99[local82.anInt382], local1111.anIntArray100[local82.anInt382]);
								}
								if (local1105 != null) {
									local1105.method168(local82.anInt363, 0, local82.anInt362, 0, local169, local180);
								}
								Class1_Sub1_Sub2_Sub3.anInt572 = local163;
								Class1_Sub1_Sub2_Sub3.anInt573 = local165;
							} else {
								if (local82.anInt364 == 7) {
									local684 = local82.aClass1_Sub1_Sub2_Sub2_1;
									local165 = 0;
									for (local169 = 0; local169 < local82.anInt352; local169++) {
										for (local180 = 0; local180 < local82.anInt366; local180++) {
											if (local82.anIntArray125[local165] > 0) {
												@Pc(1176) Class39 local1176 = Class39.method488(local82.anIntArray125[local165] - 1);
												@Pc(1180) String local1180 = String.valueOf(local1176.aString16);
												if (local1176.aBoolean162 || local82.anIntArray124[local165] != 1) {
													local1180 = local1180 + " x" + method621(local82.anIntArray124[local165]);
												}
												local215 = local87 + local180 * (local82.anInt383 + 115);
												local222 = local92 + local169 * (local82.anInt355 + 12);
												if (local82.aBoolean70) {
													local684.method276(local215 + local82.anInt366 / 2, local222, local1180, local82.aBoolean72, local82.anInt356);
												} else {
													local684.method283(local82.anInt356, local82.aBoolean72, local1180, local215, local222);
												}
											}
											local165++;
										}
									}
								}
								if (local82.anInt364 == 8 && (this.anInt947 == local82.anInt375 || this.anInt902 == local82.anInt375 || this.anInt1040 == local82.anInt375) && this.anInt985 == 100) {
									local163 = 0;
									local165 = 0;
									@Pc(1294) Class1_Sub1_Sub2_Sub2 local1294 = this.aClass1_Sub1_Sub2_Sub2_3;
									@Pc(1297) String local1297 = local82.aString8;
									while (local1297.length() > 0) {
										local213 = local1297.indexOf("\\n");
										if (local213 == -1) {
											local961 = local1297;
											local1297 = "";
										} else {
											local961 = local1297.substring(0, local213);
											local1297 = local1297.substring(local213 + 2);
										}
										local215 = local1294.method277(local961);
										if (local215 > local163) {
											local163 = local215;
										}
										local165 += local1294.anInt434 + 1;
									}
									local163 += 6;
									local165 += 7;
									local213 = local87 + local82.anInt366 - local163 - 5;
									local215 = local92 + local82.anInt352 + 5;
									if (local213 < local87 + 5) {
										local213 = local87 + 5;
									}
									if (local213 + local163 > arg2 + arg0.anInt366) {
										local213 = arg2 + arg0.anInt366 - local163;
									}
									if (local215 + local165 > arg3 + arg0.anInt352) {
										local215 = arg3 + arg0.anInt352 - local165;
									}
									Class1_Sub1_Sub2.method558(16777120, local165, local213, local163, local215);
									Class1_Sub1_Sub2.method559(0, local213, local215, local165, local163);
									local1297 = local82.aString8;
									local222 = local215 + local1294.anInt434 + 2;
									while (local1297.length() > 0) {
										local247 = local1297.indexOf("\\n");
										if (local247 == -1) {
											local961 = local1297;
											local1297 = "";
										} else {
											local961 = local1297.substring(0, local247);
											local1297 = local1297.substring(local247 + 2);
										}
										local1294.method283(0, false, local961, local213 + 3, local222);
										local222 += local1294.anInt434 + 1;
									}
								}
							}
						}
					}
				}
				Class1_Sub1_Sub2.method555(local33, local29, local35, this.anInt865, local31);
			}
		} catch (@Pc(1483) RuntimeException local1483) {
			signlink.reporterror("16384, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local1483.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BJ)V")
	private void method639(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt977; local8++) {
					if (this.aLongArray4[local8] == arg0) {
						this.anInt977--;
						this.aBoolean219 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt977; local28++) {
							this.aStringArray14[local28] = this.aStringArray14[local28 + 1];
							this.anIntArray213[local28] = this.anIntArray213[local28 + 1];
							this.aLongArray4[local28] = this.aLongArray4[local28 + 1];
						}
						this.aClass1_Sub1_Sub4_8.method394(183);
						this.aClass1_Sub1_Sub4_8.method401(arg0, 601);
						break;
					}
				}
			}
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("82124, " + -128 + ", " + arg0 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class8 local9 = this.aClass8ArrayArrayArray1[this.anInt934][arg0][arg1];
		if (local9 == null) {
			this.aClass10_1.method75(this.anInt934, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub1_Sub1_Sub6 local23 = null;
		@Pc(27) Class1_Sub1_Sub1_Sub6 local27;
		for (local27 = (Class1_Sub1_Sub1_Sub6) local9.method46(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub6) local9.method48()) {
			@Pc(32) Class39 local32 = Class39.method488(local27.anInt725);
			@Pc(35) int local35 = local32.anInt639;
			if (local32.aBoolean162) {
				local35 *= local27.anInt727 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method44(local23);
		@Pc(65) Class1_Sub1_Sub1_Sub6 local65 = null;
		@Pc(67) Class1_Sub1_Sub1_Sub6 local67 = null;
		for (local27 = (Class1_Sub1_Sub1_Sub6) local9.method46(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub6) local9.method48()) {
			if (local27.anInt725 != local23.anInt725 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt725 != local23.anInt725 && local27.anInt725 != local65.anInt725 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass10_1.method61(local67, local23, arg1, this.anInt934, arg0, this.method666(arg0 * 128 + 64, arg1 * 128 + 64, this.anInt934), local110, local65);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILjava/lang/String;Ljava/lang/String;)Lclient!WEMOPWVJ;")
	private Class43 method641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5) {
		try {
			@Pc(3) byte[] local3 = null;
			@Pc(7) boolean local7 = false;
			@Pc(9) int local9 = 5;
			try {
				if (this.aClass47Array1[0] != null) {
					local3 = this.aClass47Array1[0].method538(arg1);
				}
			} catch (@Pc(24) Exception local24) {
			}
			@Pc(38) int local38;
			if (local3 != null) {
				this.aCRC32_2.reset();
				this.aCRC32_2.update(local3);
				local38 = (int) this.aCRC32_2.getValue();
				if (local38 != arg3) {
					local3 = null;
				}
			}
			if (local3 != null) {
				return new Class43(local3, this.anInt909);
			}
			local38 = 0;
			while (local3 == null) {
				@Pc(60) String local60 = "Unknown error";
				this.method584(arg0, "Requesting " + arg5);
				@Pc(75) int local75;
				try {
					local75 = 0;
					@Pc(86) DataInputStream local86 = this.method592(arg4 + arg3);
					@Pc(89) byte[] local89 = new byte[6];
					local86.readFully(local89, 0, 6);
					@Pc(100) Class1_Sub1_Sub4 local100 = new Class1_Sub1_Sub4(local89, true);
					local100.anInt624 = 3;
					@Pc(108) int local108 = local100.method409() + 6;
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
							this.method584(arg0, "Loading " + arg5 + " - " + local173 + "%");
						}
						local75 = local173;
					}
					local86.close();
					try {
						if (this.aClass47Array1[0] != null) {
							this.aClass47Array1[0].method539(arg1, local3.length, 72, local3);
						}
					} catch (@Pc(218) Exception local218) {
						this.aClass47Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local3);
						local133 = (int) this.aCRC32_2.getValue();
						if (local133 != arg3) {
							local3 = null;
							local38++;
							local60 = "Checksum error: " + local133;
						}
					}
				} catch (@Pc(253) IOException local253) {
					if (local60.equals("Unknown error")) {
						local60 = "Connection error";
					}
					local3 = null;
				} catch (@Pc(263) NullPointerException local263) {
					local60 = "Null error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(272) ArrayIndexOutOfBoundsException local272) {
					local60 = "Bounds error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(281) Exception local281) {
					local60 = "Unexpected error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local3 == null) {
					for (local75 = local9; local75 > 0; local75--) {
						if (local38 >= 3) {
							this.method584(arg0, "Game updated - please reload page");
							local75 = 10;
						} else {
							this.method584(arg0, local60 + " - Retrying in " + local75);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(325) Exception local325) {
						}
					}
					local9 *= 2;
					if (local9 > 60) {
						local9 = 60;
					}
					this.aBoolean201 = !this.aBoolean201;
				}
			}
			return new Class43(local3, this.anInt909);
		} catch (@Pc(358) RuntimeException local358) {
			signlink.reporterror("28529, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local358.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method642() {
		try {
			if (this.anInt895 != 3) {
				this.aBoolean227 = !this.aBoolean227;
			}
			@Pc(24) int local24;
			for (@Pc(17) int local17 = 10; local17 < 117; local17++) {
				local24 = (int) (Math.random() * 100.0D);
				if (local24 < 50) {
					this.anIntArray232[local17 + 32512] = 255;
				}
			}
			@Pc(53) int local53;
			@Pc(60) int local60;
			@Pc(66) int local66;
			for (local24 = 0; local24 < 100; local24++) {
				local53 = (int) (Math.random() * 124.0D) + 2;
				local60 = (int) (Math.random() * 128.0D) + 128;
				local66 = local53 + (local60 << 7);
				this.anIntArray232[local66] = 192;
			}
			for (local53 = 1; local53 < 255; local53++) {
				for (local60 = 1; local60 < 127; local60++) {
					local66 = local60 + (local53 << 7);
					this.anIntArray233[local66] = (this.anIntArray232[local66 - 1] + this.anIntArray232[local66 + 1] + this.anIntArray232[local66 - 128] + this.anIntArray232[local66 + 128]) / 4;
				}
			}
			this.anInt1039 += 128;
			if (this.anInt1039 > this.anIntArray224.length) {
				this.anInt1039 -= this.anIntArray224.length;
				local60 = (int) (Math.random() * 12.0D);
				this.method596(this.aClass1_Sub1_Sub2_Sub4Array3[local60]);
			}
			@Pc(178) int local178;
			for (local60 = 1; local60 < 255; local60++) {
				for (local66 = 1; local66 < 127; local66++) {
					local178 = local66 + (local60 << 7);
					@Pc(201) int local201 = this.anIntArray233[local178 + 128] - this.anIntArray224[local178 + this.anInt1039 & this.anIntArray224.length - 1] / 5;
					if (local201 < 0) {
						local201 = 0;
					}
					this.anIntArray232[local178] = local201;
				}
			}
			for (local66 = 0; local66 < 255; local66++) {
				this.anIntArray273[local66] = this.anIntArray273[local66 + 1];
			}
			this.anIntArray273[255] = (int) (Math.sin((double) anInt953 / 14.0D) * 16.0D + Math.sin((double) anInt953 / 15.0D) * 14.0D + Math.sin((double) anInt953 / 16.0D) * 12.0D);
			if (this.anInt932 > 0) {
				this.anInt932 -= 4;
			}
			if (this.anInt933 > 0) {
				this.anInt933 -= 4;
			}
			if (this.anInt932 == 0 && this.anInt933 == 0) {
				local178 = (int) (Math.random() * 2000.0D);
				if (local178 == 0) {
					this.anInt932 = 1024;
				}
				if (local178 == 1) {
					this.anInt933 = 1024;
					return;
				}
			}
		} catch (@Pc(312) RuntimeException local312) {
			signlink.reporterror("18984, " + 3 + ", " + local312.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!NNWGJIGN;I)V")
	private void method643(@OriginalArg(1) Class1_Sub1_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			this.method644(arg0.anInt459, arg1, arg0.anInt458);
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("98783, " + -99 + ", " + arg0 + ", " + arg1 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)V")
	private void method644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
				@Pc(28) int local28 = this.method666(arg2, arg0, this.anInt934) - arg1;
				@Pc(33) int local33 = arg2 - this.anInt896;
				@Pc(38) int local38 = local28 - this.anInt897;
				@Pc(43) int local43 = arg0 - this.anInt898;
				@Pc(48) int local48 = Class1_Sub1_Sub1_Sub3.anIntArray90[this.anInt899];
				@Pc(53) int local53 = Class1_Sub1_Sub1_Sub3.anIntArray91[this.anInt899];
				@Pc(58) int local58 = Class1_Sub1_Sub1_Sub3.anIntArray90[this.anInt900];
				@Pc(63) int local63 = Class1_Sub1_Sub1_Sub3.anIntArray91[this.anInt900];
				@Pc(73) int local73 = local43 * local58 + local33 * local63 >> 16;
				@Pc(83) int local83 = local43 * local63 - local33 * local58 >> 16;
				this.anInt961 += 0;
				@Pc(91) int local91 = local73;
				@Pc(101) int local101 = local38 * local53 - local83 * local48 >> 16;
				@Pc(111) int local111 = local38 * local48 + local83 * local53 >> 16;
				if (local111 >= 50) {
					this.anInt1003 = Class1_Sub1_Sub2_Sub3.anInt572 + (local91 << 9) / local111;
					this.anInt1004 = Class1_Sub1_Sub2_Sub3.anInt573 + (local101 << 9) / local111;
				} else {
					this.anInt1003 = -1;
					this.anInt1004 = -1;
				}
			} else {
				this.anInt1003 = -1;
				this.anInt1004 = -1;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("61369, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method645() {
		try {
			this.aClass1_Sub1_Sub2_Sub4_9 = new Class1_Sub1_Sub2_Sub4(this.aClass43_2, "titlebox", 0);
			this.aClass1_Sub1_Sub2_Sub4_10 = new Class1_Sub1_Sub2_Sub4(this.aClass43_2, "titlebutton", 0);
			this.aClass1_Sub1_Sub2_Sub4Array3 = new Class1_Sub1_Sub2_Sub4[12];
			for (@Pc(33) int local33 = 0; local33 < 12; local33++) {
				this.aClass1_Sub1_Sub2_Sub4Array3[local33] = new Class1_Sub1_Sub2_Sub4(this.aClass43_2, "runes", local33);
			}
			this.aClass1_Sub1_Sub2_Sub1_6 = new Class1_Sub1_Sub2_Sub1(128, 265);
			this.aClass1_Sub1_Sub2_Sub1_7 = new Class1_Sub1_Sub2_Sub1(128, 265);
			for (@Pc(66) int local66 = 0; local66 < 33920; local66++) {
				this.aClass1_Sub1_Sub2_Sub1_6.anIntArray128[local66] = this.aClass18_15.anIntArray98[local66];
			}
			for (@Pc(84) int local84 = 0; local84 < 33920; local84++) {
				this.aClass1_Sub1_Sub2_Sub1_7.anIntArray128[local84] = this.aClass18_16.anIntArray98[local84];
			}
			this.anIntArray263 = new int[256];
			for (@Pc(106) int local106 = 0; local106 < 64; local106++) {
				this.anIntArray263[local106] = local106 * 262144;
			}
			for (@Pc(121) int local121 = 0; local121 < 64; local121++) {
				this.anIntArray263[local121 + 64] = local121 * 1024 + 16711680;
			}
			for (@Pc(140) int local140 = 0; local140 < 64; local140++) {
				this.anIntArray263[local140 + 128] = local140 * 4 + 16776960;
			}
			for (@Pc(159) int local159 = 0; local159 < 64; local159++) {
				this.anIntArray263[local159 + 192] = 16777215;
			}
			this.anIntArray264 = new int[256];
			for (@Pc(178) int local178 = 0; local178 < 64; local178++) {
				this.anIntArray264[local178] = local178 * 1024;
			}
			for (@Pc(193) int local193 = 0; local193 < 64; local193++) {
				this.anIntArray264[local193 + 64] = local193 * 4 + 65280;
			}
			for (@Pc(212) int local212 = 0; local212 < 64; local212++) {
				this.anIntArray264[local212 + 128] = local212 * 262144 + 65535;
			}
			for (@Pc(231) int local231 = 0; local231 < 64; local231++) {
				this.anIntArray264[local231 + 192] = 16777215;
			}
			this.anIntArray265 = new int[256];
			for (@Pc(250) int local250 = 0; local250 < 64; local250++) {
				this.anIntArray265[local250] = local250 * 4;
			}
			for (@Pc(265) int local265 = 0; local265 < 64; local265++) {
				this.anIntArray265[local265 + 64] = local265 * 262144 + 255;
			}
			for (@Pc(284) int local284 = 0; local284 < 64; local284++) {
				this.anIntArray265[local284 + 128] = local284 * 1024 + 16711935;
			}
			for (@Pc(303) int local303 = 0; local303 < 64; local303++) {
				this.anIntArray265[local303 + 192] = 16777215;
			}
			this.anIntArray262 = new int[256];
			this.anIntArray224 = new int[32768];
			this.anIntArray225 = new int[32768];
			this.method596(null);
			this.anIntArray232 = new int[32768];
			this.anIntArray233 = new int[32768];
			this.method584(10, "Connecting to fileserver");
			if (!this.aBoolean195) {
				this.aBoolean226 = true;
				this.aBoolean195 = true;
				this.method583(this, 2);
			}
		} catch (@Pc(360) RuntimeException local360) {
			signlink.reporterror("63561, " + 6 + ", " + local360.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZ)V")
	private void method646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		try {
			signlink.anInt1057 = arg1;
			@Pc(5) boolean local5 = false;
			if (arg2) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("70518, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method647() {
		try {
			for (@Pc(10) int local10 = 0; local10 < this.anInt886; local10++) {
				if (this.anIntArray255[local10] <= 0) {
					@Pc(19) boolean local19 = false;
					try {
						if (this.anIntArray245[local10] != this.anInt1043 || this.anIntArray260[local10] != this.anInt984) {
							@Pc(52) Class1_Sub1_Sub4 local52 = Class16.method182(this.anIntArray245[local10], this.anIntArray260[local10]);
							if (System.currentTimeMillis() + (long) (local52.anInt624 / 22) > this.aLong30 + (long) (this.anInt987 / 22)) {
								this.anInt987 = local52.anInt624;
								this.aLong30 = System.currentTimeMillis();
								if (this.method608(local52.anInt624, local52.aByteArray16)) {
									this.anInt1043 = this.anIntArray245[local10];
									this.anInt984 = this.anIntArray260[local10];
								} else {
									local19 = true;
								}
							}
						} else if (!this.method631()) {
							local19 = true;
						}
					} catch (@Pc(102) Exception local102) {
						if (signlink.reporterror) {
							this.aClass1_Sub1_Sub4_8.method394(252);
							this.aClass1_Sub1_Sub4_8.method396(this.anIntArray245[local10] & 0x7FFF);
						} else {
							this.aClass1_Sub1_Sub4_8.method394(252);
							this.aClass1_Sub1_Sub4_8.method396(-1);
						}
					}
					if (local19 && this.anIntArray255[local10] != -5) {
						this.anIntArray255[local10] = -5;
					} else {
						this.anInt886--;
						for (@Pc(145) int local145 = local10; local145 < this.anInt886; local145++) {
							this.anIntArray245[local145] = this.anIntArray245[local145 + 1];
							this.anIntArray260[local145] = this.anIntArray260[local145 + 1];
							this.anIntArray255[local145] = this.anIntArray255[local145 + 1];
						}
						local10--;
					}
				} else {
					@Pc(197) int local197 = this.anIntArray255[local10]--;
				}
			}
			if (this.anInt946 > 0) {
				this.anInt946 -= 20;
				if (this.anInt946 < 0) {
					this.anInt946 = 0;
				}
				if (this.anInt946 == 0 && this.aBoolean198 && !aBoolean234) {
					this.anInt1001 = this.anInt966;
					this.aBoolean223 = true;
					this.aClass4_Sub1_1.method111(2, this.anInt1001);
					return;
				}
			}
		} catch (@Pc(243) RuntimeException local243) {
			signlink.reporterror("98944, " + 2 + ", " + local243.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!SVWJKJVI;ZI)V")
	private void method648(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < this.anInt1025; local4++) {
				@Pc(11) int local11 = this.anIntArray269[local4];
				@Pc(16) Class1_Sub1_Sub1_Sub4_Sub1 local16 = this.aClass1_Sub1_Sub1_Sub4_Sub1Array1[local11];
				@Pc(19) int local19 = arg0.method405();
				if ((local19 & 0x10) != 0) {
					local19 += arg0.method405() << 8;
				}
				this.method609(local11, arg0, local16, local19);
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("49041, " + arg0 + ", " + false + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(BI)V")
	private void method649(@OriginalArg(1) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass1_Sub1_Sub2_Sub1_9.anIntArray128;
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
						this.aClass10_1.method89(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass10_1.method89(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			if (this.aByte36 != 123) {
				this.anInt962 = this.aClass1_Sub1_Sub4_6.method405();
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass1_Sub1_Sub2_Sub1_9.method247();
			@Pc(155) int local155;
			for (@Pc(151) int local151 = 1; local151 < 103; local151++) {
				for (local155 = 1; local155 < 103; local155++) {
					if ((this.aByteArrayArrayArray8[arg0][local155][local151] & 0x18) == 0) {
						this.method598(local151, arg0, local34, local36, local155);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local155][local151] & 0x8) != 0) {
						this.method598(local151, arg0 + 1, local34, local36, local155);
					}
				}
			}
			if (this.aClass18_26 != null) {
				this.aClass18_26.method189();
				Class1_Sub1_Sub2_Sub3.anIntArray163 = this.anIntArray228;
			}
			this.anInt1016 = 0;
			for (local155 = 0; local155 < 104; local155++) {
				for (@Pc(229) int local229 = 0; local229 < 104; local229++) {
					@Pc(239) int local239 = this.aClass10_1.method83(this.anInt934, local155, local229);
					if (local239 != 0) {
						local239 = local239 >> 14 & 0x7FFF;
						@Pc(251) int local251 = Class32.method345(local239).anInt555;
						if (local251 >= 0) {
							@Pc(255) int local255 = local155;
							@Pc(257) int local257 = local229;
							if (local251 != 22 && local251 != 29 && local251 != 34 && local251 != 36 && local251 != 46 && local251 != 47 && local251 != 48) {
								@Pc(289) int[][] local289 = this.aClass28Array1[this.anInt934].anIntArrayArray13;
								for (@Pc(291) int local291 = 0; local291 < 10; local291++) {
									@Pc(298) int local298 = (int) (Math.random() * 4.0D);
									if (local298 == 0 && local255 > 0 && local255 > local155 - 3 && (local289[local255 - 1][local257] & 0x1280108) == 0) {
										local255--;
									}
									if (local298 == 1 && local255 < 103 && local255 < local155 + 3 && (local289[local255 + 1][local257] & 0x1280180) == 0) {
										local255++;
									}
									if (local298 == 2 && local257 > 0 && local257 > local229 - 3 && (local289[local255][local257 - 1] & 0x1280102) == 0) {
										local257--;
									}
									if (local298 == 3 && local257 < 103 && local257 < local229 + 3 && (local289[local255][local257 + 1] & 0x1280120) == 0) {
										local257++;
									}
								}
							}
							this.aClass1_Sub1_Sub2_Sub1Array6[this.anInt1016] = this.aClass1_Sub1_Sub2_Sub1Array8[local251];
							this.anIntArray266[this.anInt1016] = local255;
							this.anIntArray267[this.anInt1016] = local257;
							this.anInt1016++;
						}
					}
				}
			}
		} catch (@Pc(428) RuntimeException local428) {
			signlink.reporterror("63823, " + 123 + ", " + arg0 + ", " + local428.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method580() {
		try {
			if (this.aBoolean214 || this.aBoolean202 || this.aBoolean200) {
				this.method627(anInt846);
			} else {
				anInt1029++;
				if (this.aBoolean213) {
					this.method679();
				} else {
					this.method670(false);
				}
				this.anInt1000 = 0;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("65967, " + false + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method650() {
		try {
			if (super.aClass18_2 == null) {
				this.method711();
				this.aClass18_12 = null;
				this.aClass18_13 = null;
				this.aClass18_14 = null;
				this.aClass18_15 = null;
				this.aClass18_16 = null;
				this.aClass18_17 = null;
				this.aClass18_18 = null;
				this.aClass18_19 = null;
				this.aClass18_20 = null;
				this.aClass18_27 = null;
				this.aClass18_25 = null;
				this.aClass18_24 = null;
				this.aClass18_26 = null;
				this.aClass18_21 = null;
				this.aClass18_22 = null;
				this.aClass18_23 = null;
				super.aClass18_2 = new Class18(this.method582(523), 0, 765, 503);
				this.aBoolean217 = true;
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("31645, " + -806 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method578() {
		try {
			if (!this.aBoolean214 && !this.aBoolean202 && !this.aBoolean200) {
				anInt953++;
				if (this.aBoolean213) {
					this.method687();
				} else {
					this.method669();
				}
				this.method689();
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("88242, " + false + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
	private void method651(@OriginalArg(0) byte arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (arg0 != -120) {
				this.method577();
			}
			for (@Pc(6) int local6 = 0; local6 < this.anInt879; local6++) {
				@Pc(16) Class1_Sub1_Sub1_Sub4_Sub2 local16 = this.aClass1_Sub1_Sub1_Sub4_Sub2Array1[this.anIntArray230[local6]];
				@Pc(25) int local25 = (this.anIntArray230[local6] << 14) + 536870912;
				if (local16 != null && local16.method311() && local16.aClass29_2.aBoolean110 == arg1 && local16.aClass29_2.method322()) {
					@Pc(46) int local46 = local16.anInt458 >> 7;
					@Pc(51) int local51 = local16.anInt459 >> 7;
					if (local46 >= 0 && local46 < 104 && local51 >= 0 && local51 < 104) {
						if (local16.anInt475 == 1 && (local16.anInt458 & 0x7F) == 64 && (local16.anInt459 & 0x7F) == 64) {
							if (this.anIntArrayArray25[local46][local51] == this.anInt980) {
								continue;
							}
							this.anIntArrayArray25[local46][local51] = this.anInt980;
						}
						if (!local16.aClass29_2.aBoolean107) {
							local25 += Integer.MIN_VALUE;
						}
						this.aClass10_1.method65(this.method666(local16.anInt458, local16.anInt459, this.anInt934), local16.anInt459, this.anInt934, local16, local16.aBoolean101, local16.anInt460, local25, (local16.anInt475 - 1) * 64 + 60, local16.anInt458);
					}
				}
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("90867, " + arg0 + ", " + arg1 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method652(@OriginalArg(0) byte arg0) {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt839);
			if (arg0 != 7) {
				for (@Pc(17) int local17 = 1; local17 > 0; local17++) {
				}
			}
			if (this.aClass4_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass4_Sub1_1.anInt146);
			}
			System.out.println("loop-cycle:" + anInt953);
			System.out.println("draw-cycle:" + anInt1029);
			System.out.println("ptype:" + this.anInt962);
			System.out.println("psize:" + this.anInt961);
			if (this.aClass31_1 != null) {
				this.aClass31_1.method340(this.aByte34);
			}
			super.aBoolean191 = true;
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("53562, " + arg0 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)Ljava/awt/Component;")
	@Override
	protected Component method582(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("38543, " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method654() {
		try {
			if (this.anInt939 == 0) {
				this.aStringArray13[0] = "Cancel";
				this.anIntArray242[0] = 1467;
				this.anInt1005 = 1;
				if (this.anInt999 == -1) {
					this.method686();
					this.anInt856 = 0;
					this.anInt998 = 0;
					if (super.anInt813 > 4 && super.anInt814 > 4 && super.anInt813 < 516 && super.anInt814 < 338) {
						if (this.anInt945 == -1) {
							this.method624();
						} else {
							this.method615(super.anInt813, 0, super.anInt814, Class24.method230(this.anInt945), 4, 0, 4);
						}
					}
					if (this.anInt856 != this.anInt942) {
						this.anInt942 = this.anInt856;
					}
					if (this.anInt998 != this.anInt1040) {
						this.anInt1040 = this.anInt998;
					}
					this.anInt856 = 0;
					this.anInt998 = 0;
					if (super.anInt813 > 553 && super.anInt814 > 205 && super.anInt813 < 743 && super.anInt814 < 466) {
						if (this.anInt908 != -1) {
							this.method615(super.anInt813, 0, super.anInt814, Class24.method230(this.anInt908), 205, 1, 553);
						} else if (this.anIntArray275[this.anInt1044] != -1) {
							this.method615(super.anInt813, 0, super.anInt814, Class24.method230(this.anIntArray275[this.anInt1044]), 205, 1, 553);
						}
					}
					if (this.anInt856 != this.anInt885) {
						this.aBoolean219 = true;
						this.anInt885 = this.anInt856;
					}
					if (this.anInt998 != this.anInt902) {
						this.aBoolean219 = true;
						this.anInt902 = this.anInt998;
					}
					this.anInt856 = 0;
					this.anInt998 = 0;
					if (super.anInt813 > 17 && super.anInt814 > 357 && super.anInt813 < 496 && super.anInt814 < 453) {
						if (this.anInt887 != -1) {
							this.method615(super.anInt813, 0, super.anInt814, Class24.method230(this.anInt887), 357, 2, 17);
						} else if (this.anInt983 != -1) {
							this.method615(super.anInt813, 0, super.anInt814, Class24.method230(this.anInt983), 357, 3, 17);
						} else if (super.anInt814 < 434 && super.anInt813 < 426 && this.anInt988 == 0) {
							this.method722(super.anInt814 - 357, super.anInt813 - 17);
						}
					}
					if ((this.anInt887 != -1 || this.anInt983 != -1) && this.anInt856 != this.anInt825) {
						this.aBoolean228 = true;
						this.anInt825 = this.anInt856;
					}
					if ((this.anInt887 != -1 || this.anInt983 != -1) && this.anInt998 != this.anInt947) {
						this.aBoolean228 = true;
						this.anInt947 = this.anInt998;
					}
					@Pc(350) boolean local350 = false;
					while (!local350) {
						local350 = true;
						for (@Pc(356) int local356 = 0; local356 < this.anInt1005 - 1; local356++) {
							if (this.anIntArray242[local356] < 1000 && this.anIntArray242[local356 + 1] > 1000) {
								@Pc(377) String local377 = this.aStringArray13[local356];
								this.aStringArray13[local356] = this.aStringArray13[local356 + 1];
								this.aStringArray13[local356 + 1] = local377;
								@Pc(399) int local399 = this.anIntArray242[local356];
								this.anIntArray242[local356] = this.anIntArray242[local356 + 1];
								this.anIntArray242[local356 + 1] = local399;
								@Pc(421) int local421 = this.anIntArray240[local356];
								this.anIntArray240[local356] = this.anIntArray240[local356 + 1];
								this.anIntArray240[local356 + 1] = local421;
								@Pc(443) int local443 = this.anIntArray241[local356];
								this.anIntArray241[local356] = this.anIntArray241[local356 + 1];
								this.anIntArray241[local356 + 1] = local443;
								@Pc(465) int local465 = this.anIntArray243[local356];
								this.anIntArray243[local356] = this.anIntArray243[local356 + 1];
								this.anIntArray243[local356 + 1] = local465;
								local350 = false;
							}
						}
					}
				} else {
					this.anInt856 = 0;
					this.anInt998 = 0;
					this.method615(super.anInt813, 0, super.anInt814, Class24.method230(this.anInt999), 0, 0, 0);
					if (this.anInt856 != this.anInt942) {
						this.anInt942 = this.anInt856;
					}
					if (this.anInt998 != this.anInt1040) {
						this.anInt1040 = this.anInt998;
					}
				}
			}
		} catch (@Pc(495) RuntimeException local495) {
			signlink.reporterror("16741, " + true + ", " + local495.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method655(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			try {
				@Pc(11) int local11 = aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt458 + this.anInt916;
				@Pc(17) int local17 = aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt459 + this.anInt888;
				if (this.anInt926 - local11 < -500 || this.anInt926 - local11 > 500 || this.anInt927 - local17 < -500 || this.anInt927 - local17 > 500) {
					this.anInt926 = local11;
					this.anInt927 = local17;
				}
				if (this.anInt926 != local11) {
					this.anInt926 += (local11 - this.anInt926) / 16;
				}
				if (this.anInt927 != local17) {
					this.anInt927 += (local17 - this.anInt927) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt920 += (-this.anInt920 - 24) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt920 += (24 - this.anInt920) / 2;
				} else {
					this.anInt920 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt921 += (12 - this.anInt921) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt921 += (-this.anInt921 - 12) / 2;
				} else {
					this.anInt921 /= 2;
				}
				this.anInt919 = this.anInt919 + this.anInt920 / 2 & 0x7FF;
				this.anInt918 += this.anInt921 / 2;
				if (this.anInt918 < 128) {
					this.anInt918 = 128;
				}
				if (this.anInt918 > 383) {
					this.anInt918 = 383;
				}
				@Pc(204) int local204 = this.anInt926 >> 7;
				@Pc(209) int local209 = this.anInt927 >> 7;
				@Pc(219) int local219 = this.method666(this.anInt926, this.anInt927, this.anInt934);
				@Pc(221) int local221 = 0;
				@Pc(237) int local237;
				if (local204 > 3 && local209 > 3 && local204 < 100 && local209 < 100) {
					for (local237 = local204 - 4; local237 <= local204 + 4; local237++) {
						for (@Pc(243) int local243 = local209 - 4; local243 <= local209 + 4; local243++) {
							@Pc(248) int local248 = this.anInt934;
							if (local248 < 3 && (this.aByteArrayArrayArray8[1][local237][local243] & 0x2) == 2) {
								local248++;
							}
							@Pc(275) int local275 = local219 - this.anIntArrayArrayArray7[local248][local237][local243];
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
				if (local237 > this.anInt925) {
					this.anInt925 += (local237 - this.anInt925) / 24;
				} else if (local237 < this.anInt925) {
					this.anInt925 += (local237 - this.anInt925) / 80;
				}
			} catch (@Pc(339) Exception local339) {
				signlink.reporterror("glfc_ex " + aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt458 + "," + aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt459 + "," + this.anInt926 + "," + this.anInt927 + "," + this.anInt854 + "," + this.anInt855 + "," + this.anInt833 + "," + this.anInt834);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(389) RuntimeException local389) {
			signlink.reporterror("10025, " + arg0 + ", " + local389.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method656() {
		try {
			for (@Pc(8) int local8 = -1; local8 < this.anInt1024; local8++) {
				@Pc(16) int local16;
				if (local8 == -1) {
					local16 = this.anInt1023;
				} else {
					local16 = this.anIntArray268[local8];
				}
				@Pc(28) Class1_Sub1_Sub1_Sub4_Sub1 local28 = this.aClass1_Sub1_Sub1_Sub4_Sub1Array1[local16];
				if (local28 != null) {
					this.method673(1, local28);
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("61348, " + false + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	@Override
	public void method583(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}
		if (signlink.mainapp == null) {
			super.method583(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!SVWJKJVI;IB)V")
	private void method657(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(6) int local6 = arg0.method416(8);
			@Pc(11) boolean local11 = false;
			@Pc(20) int local20;
			if (local6 < this.anInt1024) {
				for (local20 = local6; local20 < this.anInt1024; local20++) {
					this.anIntArray247[this.anInt930++] = this.anIntArray268[local20];
				}
			}
			if (local6 > this.anInt1024) {
				signlink.reporterror(this.aString28 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt1024 = 0;
			for (local20 = 0; local20 < local6; local20++) {
				@Pc(72) int local72 = this.anIntArray268[local20];
				@Pc(77) Class1_Sub1_Sub1_Sub4_Sub1 local77 = this.aClass1_Sub1_Sub1_Sub4_Sub1Array1[local72];
				@Pc(82) int local82 = arg0.method416(1);
				if (local82 == 0) {
					this.anIntArray268[this.anInt1024++] = local72;
					local77.anInt485 = anInt953;
				} else {
					@Pc(105) int local105 = arg0.method416(2);
					if (local105 == 0) {
						this.anIntArray268[this.anInt1024++] = local72;
						local77.anInt485 = anInt953;
						this.anIntArray269[this.anInt1025++] = local72;
					} else {
						@Pc(156) int local156;
						@Pc(167) int local167;
						if (local105 == 1) {
							this.anIntArray268[this.anInt1024++] = local72;
							local77.anInt485 = anInt953;
							local156 = arg0.method416(3);
							local77.method313(this.anInt878, local156, false);
							local167 = arg0.method416(1);
							if (local167 == 1) {
								this.anIntArray269[this.anInt1025++] = local72;
							}
						} else if (local105 == 2) {
							this.anIntArray268[this.anInt1024++] = local72;
							local77.anInt485 = anInt953;
							local156 = arg0.method416(3);
							local77.method313(this.anInt878, local156, true);
							local167 = arg0.method416(3);
							local77.method313(this.anInt878, local167, true);
							@Pc(227) int local227 = arg0.method416(1);
							if (local227 == 1) {
								this.anIntArray269[this.anInt1025++] = local72;
							}
						} else if (local105 == 3) {
							this.anIntArray247[this.anInt930++] = local72;
						}
					}
				}
			}
		} catch (@Pc(264) RuntimeException local264) {
			signlink.reporterror("4990, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local264.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method658() {
		try {
			@Pc(13) int local13 = 5;
			this.anIntArray259[8] = 0;
			@Pc(20) int local20 = 0;
			while (this.anIntArray259[8] == 0) {
				@Pc(24) String local24 = "Unknown problem";
				this.method584(20, "Connecting to web server");
				try {
					@Pc(46) DataInputStream local46 = this.method592("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 362);
					@Pc(53) Class1_Sub1_Sub4 local53 = new Class1_Sub1_Sub4(new byte[40], true);
					local46.readFully(local53.aByteArray16, 0, 40);
					local46.close();
					for (@Pc(63) int local63 = 0; local63 < 9; local63++) {
						this.anIntArray259[local63] = local53.method410();
					}
					@Pc(78) int local78 = local53.method410();
					@Pc(80) int local80 = 1234;
					for (@Pc(82) int local82 = 0; local82 < 9; local82++) {
						local80 = (local80 << 1) + this.anIntArray259[local82];
					}
					if (local78 != local80) {
						local24 = "checksum problem";
						this.anIntArray259[8] = 0;
					}
				} catch (@Pc(109) EOFException local109) {
					local24 = "EOF problem";
					this.anIntArray259[8] = 0;
				} catch (@Pc(118) IOException local118) {
					local24 = "connection problem";
					this.anIntArray259[8] = 0;
				} catch (@Pc(127) Exception local127) {
					local24 = "logic problem";
					this.anIntArray259[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray259[8] == 0) {
					local20++;
					for (@Pc(145) int local145 = local13; local145 > 0; local145--) {
						if (local20 >= 10) {
							this.method584(10, "Game updated - please reload page");
							local145 = 10;
						} else {
							this.method584(10, local24 + " - Will retry in " + local145 + " secs.");
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(179) Exception local179) {
						}
					}
					local13 *= 2;
					if (local13 > 60) {
						local13 = 60;
					}
					this.aBoolean201 = !this.aBoolean201;
				}
			}
		} catch (@Pc(207) RuntimeException local207) {
			signlink.reporterror("54696, " + 84 + ", " + local207.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method659() {
		try {
			this.anInt961 += 0;
			if (this.anInt883 == 0 && super.anInt818 == 1) {
				@Pc(20) int local20 = super.anInt819 - 25 - 550;
				@Pc(27) int local27 = super.anInt820 - 5 - 4;
				if (local20 >= 0 && local27 >= 0 && local20 < 146 && local27 < 151) {
					local20 -= 73;
					local27 -= 75;
					@Pc(47) int local47 = this.anInt919 + this.anInt911 & 0x7FF;
					@Pc(51) int local51 = Class1_Sub1_Sub2_Sub3.anIntArray161[local47];
					@Pc(55) int local55 = Class1_Sub1_Sub2_Sub3.anIntArray162[local47];
					@Pc(64) int local64 = local51 * (this.anInt860 + 256) >> 8;
					@Pc(73) int local73 = local55 * (this.anInt860 + 256) >> 8;
					@Pc(83) int local83 = local27 * local64 + local20 * local73 >> 11;
					@Pc(93) int local93 = local27 * local73 - local20 * local64 >> 11;
					@Pc(100) int local100 = aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt458 + local83 >> 7;
					@Pc(107) int local107 = aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt459 - local93 >> 7;
					@Pc(128) boolean local128 = this.method661(0, 0, 0, 0, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0], 1, true, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0], 0, local107, local100);
					if (local128) {
						this.aClass1_Sub1_Sub4_8.method395(local20);
						this.aClass1_Sub1_Sub4_8.method395(local27);
						this.aClass1_Sub1_Sub4_8.method396(this.anInt919);
						this.aClass1_Sub1_Sub4_8.method395(57);
						this.aClass1_Sub1_Sub4_8.method395(this.anInt911);
						this.aClass1_Sub1_Sub4_8.method395(this.anInt860);
						this.aClass1_Sub1_Sub4_8.method395(89);
						this.aClass1_Sub1_Sub4_8.method396(aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt458);
						this.aClass1_Sub1_Sub4_8.method396(aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt459);
						this.aClass1_Sub1_Sub4_8.method395(this.anInt990);
						this.aClass1_Sub1_Sub4_8.method395(63);
						return;
					}
				}
			}
		} catch (@Pc(182) RuntimeException local182) {
			signlink.reporterror("61429, " + 0 + ", " + local182.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!OMAKLDKI;IB)V")
	private void method660(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub1 arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(7) int local7 = this.anInt919 + this.anInt911 & 0x7FF;
			@Pc(15) int local15 = arg2 * arg2 + arg0 * arg0;
			if (local15 <= 6400) {
				@Pc(23) int local23 = Class1_Sub1_Sub1_Sub3.anIntArray90[local7];
				@Pc(27) int local27 = Class1_Sub1_Sub1_Sub3.anIntArray91[local7];
				@Pc(36) int local36 = local23 * 256 / (this.anInt860 + 256);
				@Pc(45) int local45 = local27 * 256 / (this.anInt860 + 256);
				@Pc(55) int local55 = arg0 * local36 + arg2 * local45 >> 16;
				@Pc(65) int local65 = arg0 * local45 - arg2 * local36 >> 16;
				if (local15 > 2500) {
					arg1.method258(83 - local65 - arg1.anInt418 / 2 - 4, local55 + 94 - arg1.anInt417 / 2 + 4, this.aClass1_Sub1_Sub2_Sub4_7);
				} else {
					arg1.method252(83 - local65 - arg1.anInt418 / 2 - 4, local55 + 94 - arg1.anInt417 / 2 + 4);
				}
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("79140, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 30 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIZIIII)Z")
	private boolean method661(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray22[local7][local11] = 0;
					this.anIntArrayArray23[local7][local11] = 99999999;
				}
			}
			local11 = arg4;
			@Pc(39) int local39 = arg7;
			this.anIntArrayArray22[arg4][arg7] = 99;
			this.anIntArrayArray23[arg4][arg7] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray252[0] = arg4;
			@Pc(66) int local66 = local55 + 1;
			this.anIntArray253[0] = arg7;
			@Pc(70) boolean local70 = false;
			@Pc(74) int local74 = this.anIntArray252.length;
			@Pc(81) int[][] local81 = this.aClass28Array1[this.anInt934].anIntArrayArray13;
			@Pc(192) int local192;
			while (local57 != local66) {
				local11 = this.anIntArray252[local57];
				local39 = this.anIntArray253[local57];
				local57 = (local57 + 1) % local74;
				if (local11 == arg10 && local39 == arg9) {
					local70 = true;
					break;
				}
				if (arg3 != 0) {
					if ((arg3 < 5 || arg3 == 10) && this.aClass28Array1[this.anInt934].method304(local11, arg9, arg0, arg10, local39, arg3 - 1)) {
						local70 = true;
						break;
					}
					if (arg3 < 10 && this.aClass28Array1[this.anInt934].method305(arg3 - 1, arg9, arg10, local39, arg0, local11)) {
						local70 = true;
						break;
					}
				}
				if (arg8 != 0 && arg1 != 0 && this.aClass28Array1[this.anInt934].method306(arg10, arg2, arg9, arg8, local39, arg1, local11)) {
					local70 = true;
					break;
				}
				local192 = this.anIntArrayArray23[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray22[local11 - 1][local39] == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0) {
					this.anIntArray252[local66] = local11 - 1;
					this.anIntArray253[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11 - 1][local39] = 2;
					this.anIntArrayArray23[local11 - 1][local39] = local192;
				}
				if (local11 < 103 && this.anIntArrayArray22[local11 + 1][local39] == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0) {
					this.anIntArray252[local66] = local11 + 1;
					this.anIntArray253[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11 + 1][local39] = 8;
					this.anIntArrayArray23[local11 + 1][local39] = local192;
				}
				if (local39 > 0 && this.anIntArrayArray22[local11][local39 - 1] == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray252[local66] = local11;
					this.anIntArray253[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11][local39 - 1] = 1;
					this.anIntArrayArray23[local11][local39 - 1] = local192;
				}
				if (local39 < 103 && this.anIntArrayArray22[local11][local39 + 1] == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray252[local66] = local11;
					this.anIntArray253[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11][local39 + 1] = 4;
					this.anIntArrayArray23[local11][local39 + 1] = local192;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray22[local11 - 1][local39 - 1] == 0 && (local81[local11 - 1][local39 - 1] & 0x128010E) == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray252[local66] = local11 - 1;
					this.anIntArray253[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray23[local11 - 1][local39 - 1] = local192;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray22[local11 + 1][local39 - 1] == 0 && (local81[local11 + 1][local39 - 1] & 0x1280183) == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray252[local66] = local11 + 1;
					this.anIntArray253[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray23[local11 + 1][local39 - 1] = local192;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray22[local11 - 1][local39 + 1] == 0 && (local81[local11 - 1][local39 + 1] & 0x1280138) == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray252[local66] = local11 - 1;
					this.anIntArray253[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray23[local11 - 1][local39 + 1] = local192;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray22[local11 + 1][local39 + 1] == 0 && (local81[local11 + 1][local39 + 1] & 0x12801E0) == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray252[local66] = local11 + 1;
					this.anIntArray253[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray23[local11 + 1][local39 + 1] = local192;
				}
			}
			this.anInt990 = 0;
			@Pc(808) int local808;
			@Pc(814) int local814;
			@Pc(820) int local820;
			if (!local70) {
				if (!arg6) {
					return false;
				}
				local192 = 1000;
				local808 = 100;
				for (local814 = arg10 - 10; local814 <= arg10 + 10; local814++) {
					for (local820 = arg9 - 10; local820 <= arg9 + 10; local820++) {
						if (local814 >= 0 && local820 >= 0 && local814 < 104 && local820 < 104 && this.anIntArrayArray23[local814][local820] < 100) {
							@Pc(842) int local842 = 0;
							if (local814 < arg10) {
								local842 = arg10 - local814;
							} else if (local814 > arg10 + arg8 - 1) {
								local842 = local814 + 1 - arg10 - arg8;
							}
							@Pc(868) int local868 = 0;
							if (local820 < arg9) {
								local868 = arg9 - local820;
							} else if (local820 > arg9 + arg1 - 1) {
								local868 = local820 + 1 - arg9 - arg1;
							}
							@Pc(900) int local900 = local842 * local842 + local868 * local868;
							if (local900 < local192 || local900 == local192 && this.anIntArrayArray23[local814][local820] < local808) {
								local192 = local900;
								local808 = this.anIntArrayArray23[local814][local820];
								local11 = local814;
								local39 = local820;
							}
						}
					}
				}
				if (local192 == 1000) {
					return false;
				}
				if (local11 == arg4 && local39 == arg7) {
					return false;
				}
				this.anInt990 = 1;
			}
			@Pc(961) byte local961 = 0;
			this.anIntArray252[0] = local11;
			local57 = local961 + 1;
			this.anIntArray253[0] = local39;
			local192 = local808 = this.anIntArrayArray22[local11][local39];
			while (local11 != arg4 || local39 != arg7) {
				if (local192 != local808) {
					local808 = local192;
					this.anIntArray252[local57] = local11;
					this.anIntArray253[local57++] = local39;
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
				@Pc(1057) int local1057 = this.anIntArray252[local57];
				local814 = this.anIntArray253[local57];
				anInt857++;
				if (anInt857 >= 85) {
					this.aClass1_Sub1_Sub4_8.method394(173);
					this.aClass1_Sub1_Sub4_8.method395(150);
					anInt857 = 0;
				}
				if (arg5 == 0) {
					this.aClass1_Sub1_Sub4_8.method394(169);
					this.aClass1_Sub1_Sub4_8.method395(local74 + local74 + 3);
				}
				if (arg5 == 1) {
					this.aClass1_Sub1_Sub4_8.method394(77);
					this.aClass1_Sub1_Sub4_8.method395(local74 + local74 + 3 + 14);
				}
				if (arg5 == 2) {
					this.aClass1_Sub1_Sub4_8.method394(35);
					this.aClass1_Sub1_Sub4_8.method395(local74 + local74 + 3);
				}
				this.aClass1_Sub1_Sub4_8.method396(local1057 + this.anInt833);
				this.aClass1_Sub1_Sub4_8.method430(local814 + this.anInt834);
				this.aClass1_Sub1_Sub4_8.method421(super.anIntArray210[5] == 1 ? 1 : 0);
				this.anInt995 = this.anIntArray252[0];
				this.anInt996 = this.anIntArray253[0];
				for (local820 = 1; local820 < local74; local820++) {
					local57--;
					this.aClass1_Sub1_Sub4_8.method422(this.anIntArray252[local57] - local1057);
					this.aClass1_Sub1_Sub4_8.method395(this.anIntArray253[local57] - local814);
				}
				return true;
			} else if (arg5 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1207) RuntimeException local1207) {
			signlink.reporterror("20519, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1207.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method662(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(6) Class1_Sub1_Sub1_Sub1 local6 = (Class1_Sub1_Sub1_Sub1) this.aClass8_10.method46();
			if (arg0) {
				this.aBoolean227 = !this.aBoolean227;
			}
			while (local6 != null) {
				if (local6.anInt6 != this.anInt934 || anInt953 > local6.anInt14) {
					local6.method551();
				} else if (anInt953 >= local6.anInt13) {
					if (local6.anInt20 > 0) {
						@Pc(46) Class1_Sub1_Sub1_Sub4_Sub2 local46 = this.aClass1_Sub1_Sub1_Sub4_Sub2Array1[local6.anInt20 - 1];
						if (local46 != null && local46.anInt458 >= 0 && local46.anInt458 < 13312 && local46.anInt459 >= 0 && local46.anInt459 < 13312) {
							local6.method13(local46.anInt458, local46.anInt459, this.method666(local46.anInt458, local46.anInt459, local6.anInt6) - local6.anInt12, anInt953);
						}
					}
					if (local6.anInt20 < 0) {
						@Pc(91) int local91 = -local6.anInt20 - 1;
						@Pc(97) Class1_Sub1_Sub1_Sub4_Sub1 local97;
						if (local91 == this.anInt1026) {
							local97 = aClass1_Sub1_Sub1_Sub4_Sub1_1;
						} else {
							local97 = this.aClass1_Sub1_Sub1_Sub4_Sub1Array1[local91];
						}
						if (local97 != null && local97.anInt458 >= 0 && local97.anInt458 < 13312 && local97.anInt459 >= 0 && local97.anInt459 < 13312) {
							local6.method13(local97.anInt458, local97.anInt459, this.method666(local97.anInt458, local97.anInt459, local6.anInt6) - local6.anInt12, anInt953);
						}
					}
					local6.method12(this.anInt944);
					this.aClass10_1.method65((int) local6.aDouble3, (int) local6.aDouble2, this.anInt934, local6, false, local6.anInt7, -1, 60, (int) local6.aDouble1);
				}
				local6 = (Class1_Sub1_Sub1_Sub1) this.aClass8_10.method48();
			}
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("40803, " + arg0 + ", " + local177.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method663() {
		try {
			this.aBoolean218 = true;
			for (@Pc(10) int local10 = 0; local10 < 7; local10++) {
				this.anIntArray244[local10] = -1;
				for (@Pc(19) int local19 = 0; local19 < Class37.anInt632; local19++) {
					if (!Class37.aClass37Array1[local19].aBoolean156 && Class37.aClass37Array1[local19].anInt633 == local10 + (this.aBoolean199 ? 0 : 7)) {
						this.anIntArray244[local10] = local19;
						break;
					}
				}
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("18344, " + 24830 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method664() {
		try {
			Class32.aClass7_5.method42();
			Class32.aClass7_6.method42();
			Class29.aClass7_4.method42();
			Class39.aClass7_9.method42();
			Class39.aClass7_8.method42();
			Class1_Sub1_Sub1_Sub4_Sub1.aClass7_1.method42();
			Class34.aClass7_7.method42();
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("29803, " + 8 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)Ljava/lang/String;")
	private String method665() {
		try {
			this.anInt961 += 0;
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("91543, " + 0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBI)I")
	private int method666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = arg0 >> 7;
			@Pc(7) int local7 = arg1 >> 7;
			if (local3 < 0 || local7 < 0 || local3 > 103 || local7 > 103) {
				return 0;
			}
			@Pc(21) int local21 = arg2;
			if (arg2 < 3 && (this.aByteArrayArrayArray8[1][local3][local7] & 0x2) == 2) {
				local21 = arg2 + 1;
			}
			@Pc(41) int local41 = arg0 & 0x7F;
			@Pc(45) int local45 = arg1 & 0x7F;
			@Pc(73) int local73 = this.anIntArrayArrayArray7[local21][local3][local7] * (128 - local41) + this.anIntArrayArrayArray7[local21][local3 + 1][local7] * local41 >> 7;
			@Pc(111) int local111 = this.anIntArrayArrayArray7[local21][local3][local7 + 1] * (128 - local41) + this.anIntArrayArrayArray7[local21][local3 + 1][local7 + 1] * local41 >> 7;
			return local73 * (128 - local45) + local111 * local45 >> 7;
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("54502, " + arg0 + ", " + arg1 + ", " + -103 + ", " + arg2 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!SVWJKJVI;II)V")
	private void method667(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.anInt989 > 7 || this.anInt989 < 7) {
				this.anInt962 = -1;
			}
			for (@Pc(14) int local14 = 0; local14 < this.anInt1025; local14++) {
				@Pc(21) int local21 = this.anIntArray269[local14];
				@Pc(26) Class1_Sub1_Sub1_Sub4_Sub2 local26 = this.aClass1_Sub1_Sub1_Sub4_Sub2Array1[local21];
				@Pc(29) int local29 = arg0.method405();
				if ((local29 & 0x20) != 0) {
					local26.anInt478 = arg0.method432();
					if (local26.anInt478 == 65535) {
						local26.anInt478 = -1;
					}
				}
				@Pc(53) int local53;
				@Pc(63) int local63;
				if ((local29 & 0x2) != 0) {
					local53 = arg0.method432();
					if (local53 == 65535) {
						local53 = -1;
					}
					local63 = arg0.method425(this.anInt1045);
					if (local53 == local26.anInt491 && local53 != -1) {
						@Pc(75) int local75 = Class19.aClass19Array1[local53].anInt219;
						if (local75 == 1) {
							local26.anInt492 = 0;
							local26.anInt493 = 0;
							local26.anInt494 = local63;
							local26.anInt495 = 0;
						}
						if (local75 == 2) {
							local26.anInt495 = 0;
						}
					} else if (local53 == -1 || local26.anInt491 == -1 || Class19.aClass19Array1[local53].anInt213 >= Class19.aClass19Array1[local26.anInt491].anInt213) {
						local26.anInt491 = local53;
						local26.anInt492 = 0;
						local26.anInt493 = 0;
						local26.anInt494 = local63;
						local26.anInt495 = 0;
						local26.anInt496 = local26.anInt477;
					}
				}
				if ((local29 & 0x1) != 0) {
					local53 = arg0.method424(this.anInt956);
					local63 = arg0.method423();
					local26.method312(local63, anInt953, local53);
					local26.anInt468 = anInt953 + 300;
					local26.anInt469 = arg0.method424(this.anInt956);
					local26.anInt470 = arg0.method425(this.anInt1045);
				}
				if ((local29 & 0x4) != 0) {
					local53 = arg0.method424(this.anInt956);
					local63 = arg0.method423();
					local26.method312(local63, anInt953, local53);
					local26.anInt468 = anInt953 + 300;
					local26.anInt469 = arg0.method423();
					local26.anInt470 = arg0.method405();
				}
				if ((local29 & 0x10) != 0) {
					local26.anInt479 = arg0.method433();
					local53 = arg0.method410();
					local26.anInt483 = local53 >> 16;
					local26.anInt482 = anInt953 + (local53 & 0xFFFF);
					local26.anInt480 = 0;
					local26.anInt481 = 0;
					if (local26.anInt482 > anInt953) {
						local26.anInt480 = -1;
					}
					if (local26.anInt479 == 65535) {
						local26.anInt479 = -1;
					}
				}
				if ((local29 & 0x40) != 0) {
					local26.aString13 = arg0.method412();
					local26.anInt486 = 100;
				}
				if ((local29 & 0x80) != 0) {
					local26.anInt455 = arg0.method434();
					local26.anInt456 = arg0.method432();
				}
				if ((local29 & 0x8) != 0) {
					local26.aClass29_2 = Class29.method326(arg0.method433());
					local26.anInt475 = local26.aClass29_2.aByte13;
					local26.anInt476 = local26.aClass29_2.anInt529;
					local26.anInt487 = local26.aClass29_2.anInt516;
					local26.anInt488 = local26.aClass29_2.anInt527;
					local26.anInt489 = local26.aClass29_2.anInt528;
					local26.anInt490 = local26.aClass29_2.anInt513;
					local26.anInt453 = local26.aClass29_2.anInt515;
				}
			}
		} catch (@Pc(324) RuntimeException local324) {
			signlink.reporterror("33177, " + arg0 + ", " + arg1 + ", " + 7 + ", " + local324.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(III)Z")
	private boolean method668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt961 += arg2;
			@Pc(9) boolean local9 = false;
			@Pc(12) Class24 local12 = Class24.method230(arg0);
			for (@Pc(14) int local14 = 0; local14 < local12.anIntArray126.length && local12.anIntArray126[local14] != -1; local14++) {
				@Pc(28) Class24 local28 = Class24.method230(local12.anIntArray126[local14]);
				if (local28.anInt364 == 0) {
					local9 |= this.method668(local28.anInt375, arg1, this.anInt969);
				}
				@Pc(63) int local63;
				if (local28.anInt364 == 6 && (local28.anInt380 != -1 || local28.anInt381 != -1)) {
					@Pc(58) boolean local58 = this.method705(local28);
					if (local58) {
						local63 = local28.anInt381;
					} else {
						local63 = local28.anInt380;
					}
					if (local63 != -1) {
						@Pc(75) Class19 local75 = Class19.aClass19Array1[local63];
						local28.anInt387 += arg1;
						while (local28.anInt387 > local75.method193(local28.anInt382)) {
							local28.anInt387 -= local75.method193(local28.anInt382) + 1;
							local28.anInt382++;
							if (local28.anInt382 >= local75.anInt211) {
								local28.anInt382 -= local75.anInt212;
								if (local28.anInt382 < 0 || local28.anInt382 >= local75.anInt211) {
									local28.anInt382 = 0;
								}
							}
							local9 = true;
						}
					}
				}
				if (local28.anInt364 == 6 && local28.anInt389 != 0) {
					@Pc(146) int local146 = local28.anInt389 >> 16;
					local63 = local28.anInt389 << 16 >> 16;
					@Pc(157) int local157 = local146 * arg1;
					local63 *= arg1;
					local28.anInt362 = local28.anInt362 + local157 & 0x7FF;
					local28.anInt363 = local28.anInt363 + local63 & 0x7FF;
					local9 = true;
				}
			}
			return local9;
		} catch (@Pc(188) RuntimeException local188) {
			signlink.reporterror("39551, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local188.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method669() {
		try {
			if (this.aByte35 == -4) {
				@Pc(16) int local16;
				@Pc(23) int local23;
				if (this.anInt907 == 0) {
					local16 = super.anInt809 / 2 - 80;
					local23 = super.anInt810 / 2 + 20;
					local23 += 20;
					if (super.anInt818 == 1 && super.anInt819 >= local16 - 75 && super.anInt819 <= local16 + 75 && super.anInt820 >= local23 - 20 && super.anInt820 <= local23 + 20) {
						this.anInt907 = 3;
						this.anInt843 = 0;
					}
					local16 = super.anInt809 / 2 + 80;
					if (super.anInt818 == 1 && super.anInt819 >= local16 - 75 && super.anInt819 <= local16 + 75 && super.anInt820 >= local23 - 20 && super.anInt820 <= local23 + 20) {
						this.aString23 = "";
						this.aString24 = "Enter your username & password.";
						this.anInt907 = 2;
						this.anInt843 = 0;
					}
				} else if (this.anInt907 == 2) {
					local16 = super.anInt810 / 2 - 40;
					local16 += 30;
					local16 += 25;
					if (super.anInt818 == 1 && super.anInt820 >= local16 - 15 && super.anInt820 < local16) {
						this.anInt843 = 0;
					}
					local16 += 15;
					if (super.anInt818 == 1 && super.anInt820 >= local16 - 15 && super.anInt820 < local16) {
						this.anInt843 = 1;
					}
					local16 += 15;
					local23 = super.anInt809 / 2 - 80;
					@Pc(169) int local169 = super.anInt810 / 2 + 50;
					@Pc(170) int local170 = local169 + 20;
					if (super.anInt818 == 1 && super.anInt819 >= local23 - 75 && super.anInt819 <= local23 + 75 && super.anInt820 >= local170 - 20 && super.anInt820 <= local170 + 20) {
						this.anInt1042 = 0;
						this.method723(this.aString28, this.aString29, false);
						if (this.aBoolean213) {
							return;
						}
					}
					local23 = super.anInt809 / 2 + 80;
					if (super.anInt818 == 1 && super.anInt819 >= local23 - 75 && super.anInt819 <= local23 + 75 && super.anInt820 >= local170 - 20 && super.anInt820 <= local170 + 20) {
						this.anInt907 = 0;
						this.aString28 = "";
						this.aString29 = "";
					}
					while (true) {
						while (true) {
							@Pc(260) int local260 = this.method576();
							if (local260 == -1) {
								return;
							}
							@Pc(265) boolean local265 = false;
							for (@Pc(267) int local267 = 0; local267 < aString20.length(); local267++) {
								if (local260 == aString20.charAt(local267)) {
									local265 = true;
									break;
								}
							}
							if (this.anInt843 == 0) {
								if (local260 == 8 && this.aString28.length() > 0) {
									this.aString28 = this.aString28.substring(0, this.aString28.length() - 1);
								}
								if (local260 == 9 || local260 == 10 || local260 == 13) {
									this.anInt843 = 1;
								}
								if (local265) {
									this.aString28 = this.aString28 + (char) local260;
								}
								if (this.aString28.length() > 12) {
									this.aString28 = this.aString28.substring(0, 12);
								}
							} else if (this.anInt843 == 1) {
								if (local260 == 8 && this.aString29.length() > 0) {
									this.aString29 = this.aString29.substring(0, this.aString29.length() - 1);
								}
								if (local260 == 9 || local260 == 10 || local260 == 13) {
									this.anInt843 = 0;
								}
								if (local265) {
									this.aString29 = this.aString29 + (char) local260;
								}
								if (this.aString29.length() > 20) {
									this.aString29 = this.aString29.substring(0, 20);
								}
							}
						}
					}
				} else if (this.anInt907 == 3) {
					local16 = super.anInt809 / 2;
					local23 = super.anInt810 / 2 + 50;
					@Pc(424) int local424 = local23 + 20;
					if (super.anInt818 == 1 && super.anInt819 >= local16 - 75 && super.anInt819 <= local16 + 75 && super.anInt820 >= local424 - 20 && super.anInt820 <= local424 + 20) {
						this.anInt907 = 0;
						return;
					}
				}
			}
		} catch (@Pc(457) RuntimeException local457) {
			signlink.reporterror("38924, " + -4 + ", " + local457.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method670(@OriginalArg(0) boolean arg0) {
		try {
			this.method620();
			this.aClass18_14.method189();
			this.aClass1_Sub1_Sub2_Sub4_9.method570(0, 0);
			@Pc(50) byte local50;
			@Pc(62) int local62;
			if (this.anInt907 == 0) {
				this.aClass1_Sub1_Sub2_Sub2_2.method276(180, 180, this.aClass4_Sub1_1.aString3, true, 7711145);
				local50 = 80;
				this.aClass1_Sub1_Sub2_Sub2_4.method276(180, 80, "Welcome to RuneScape", true, 16776960);
				local62 = local50 + 30;
				this.aClass1_Sub1_Sub2_Sub4_10.method570(100, 27);
				this.aClass1_Sub1_Sub2_Sub2_4.method276(100, 125, "New User", true, 16777215);
				this.aClass1_Sub1_Sub2_Sub4_10.method570(100, 187);
				this.aClass1_Sub1_Sub2_Sub2_4.method276(260, 125, "Existing User", true, 16777215);
			}
			if (this.anInt907 == 2) {
				local50 = 60;
				if (this.aString23.length() > 0) {
					this.aClass1_Sub1_Sub2_Sub2_4.method276(180, 45, this.aString23, true, 16776960);
					this.aClass1_Sub1_Sub2_Sub2_4.method276(180, 60, this.aString24, true, 16776960);
					local62 = local50 + 30;
				} else {
					this.aClass1_Sub1_Sub2_Sub2_4.method276(180, 53, this.aString24, true, 16776960);
					local62 = local50 + 30;
				}
				this.aClass1_Sub1_Sub2_Sub2_4.method283(16777215, true, "Username: " + this.aString28 + (this.anInt843 == 0 & anInt953 % 40 < 20 ? "@yel@|" : ""), 90, 90);
				local62 += 15;
				this.aClass1_Sub1_Sub2_Sub2_4.method283(16777215, true, "Password: " + Class2.method19(this.aString29, this.anInt1032) + (this.anInt843 == 1 & anInt953 % 40 < 20 ? "@yel@|" : ""), 92, 105);
				local62 += 15;
				if (!arg0) {
					this.aClass1_Sub1_Sub2_Sub4_10.method570(130, 27);
					this.aClass1_Sub1_Sub2_Sub2_4.method276(100, 155, "Login", true, 16777215);
					this.aClass1_Sub1_Sub2_Sub4_10.method570(130, 187);
					this.aClass1_Sub1_Sub2_Sub2_4.method276(260, 155, "Cancel", true, 16777215);
				}
			}
			if (this.anInt907 == 3) {
				this.aClass1_Sub1_Sub2_Sub2_4.method276(180, 40, "Create a free account", true, 16776960);
				local50 = 65;
				this.aClass1_Sub1_Sub2_Sub2_4.method276(180, 65, "To create a new account you need to", true, 16777215);
				local62 = local50 + 15;
				this.aClass1_Sub1_Sub2_Sub2_4.method276(180, 80, "go back to the main RuneScape webpage", true, 16777215);
				local62 += 15;
				this.aClass1_Sub1_Sub2_Sub2_4.method276(180, 95, "and choose the 'create account'", true, 16777215);
				local62 += 15;
				this.aClass1_Sub1_Sub2_Sub2_4.method276(180, 110, "button near the top of that page.", true, 16777215);
				local62 += 15;
				this.aClass1_Sub1_Sub2_Sub4_10.method570(130, 107);
				this.aClass1_Sub1_Sub2_Sub2_4.method276(180, 155, "Cancel", true, 16777215);
			}
			this.aClass18_14.method190(796, 171, 202, super.aGraphics2);
			if (this.aBoolean217) {
				this.aBoolean217 = false;
				this.aClass18_12.method190(796, 0, 128, super.aGraphics2);
				this.aClass18_13.method190(796, 371, 202, super.aGraphics2);
				this.aClass18_17.method190(796, 265, 0, super.aGraphics2);
				this.aClass18_18.method190(796, 265, 562, super.aGraphics2);
				this.aClass18_19.method190(796, 171, 128, super.aGraphics2);
				this.aClass18_20.method190(796, 171, 562, super.aGraphics2);
			}
		} catch (@Pc(496) RuntimeException local496) {
			signlink.reporterror("55515, " + arg0 + ", " + -8466 + ", " + local496.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method671(@OriginalArg(0) int arg0) {
		try {
			while (arg0 >= 0) {
				this.anInt962 = -1;
			}
			for (@Pc(13) Class1_Sub1_Sub1_Sub5 local13 = (Class1_Sub1_Sub1_Sub5) this.aClass8_12.method46(); local13 != null; local13 = (Class1_Sub1_Sub1_Sub5) this.aClass8_12.method48()) {
				if (local13.anInt505 != this.anInt934 || local13.aBoolean106) {
					local13.method551();
				} else if (anInt953 >= local13.anInt502) {
					local13.method321(this.anInt944);
					if (local13.aBoolean106) {
						local13.method551();
					} else {
						this.aClass10_1.method65(local13.anInt508, local13.anInt507, local13.anInt505, local13, false, 0, -1, 60, local13.anInt506);
					}
				}
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("71609, " + arg0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method672() {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt879; local1++) {
				@Pc(8) int local8 = this.anIntArray230[local1];
				@Pc(13) Class1_Sub1_Sub1_Sub4_Sub2 local13 = this.aClass1_Sub1_Sub1_Sub4_Sub2Array1[local8];
				if (local13 != null) {
					this.method673(local13.aClass29_2.aByte13, local13);
				}
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("44091, " + 21350 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!NNWGJIGN;I)V")
	private void method673(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub4 arg1) {
		try {
			if (arg1.anInt458 < 128 || arg1.anInt459 < 128 || arg1.anInt458 >= 13184 || arg1.anInt459 >= 13184) {
				arg1.anInt491 = -1;
				arg1.anInt479 = -1;
				arg1.anInt465 = 0;
				arg1.anInt466 = 0;
				arg1.anInt458 = arg1.anIntArray140[0] * 128 + arg1.anInt475 * 64;
				arg1.anInt459 = arg1.anIntArray141[0] * 128 + arg1.anInt475 * 64;
				arg1.method315();
			}
			if (arg1 == aClass1_Sub1_Sub1_Sub4_Sub1_1 && (arg1.anInt458 < 1536 || arg1.anInt459 < 1536 || arg1.anInt458 >= 11776 || arg1.anInt459 >= 11776)) {
				arg1.anInt491 = -1;
				arg1.anInt479 = -1;
				arg1.anInt465 = 0;
				arg1.anInt466 = 0;
				arg1.anInt458 = arg1.anIntArray140[0] * 128 + arg1.anInt475 * 64;
				arg1.anInt459 = arg1.anIntArray141[0] * 128 + arg1.anInt475 * 64;
				arg1.method315();
			}
			if (arg1.anInt465 > anInt953) {
				this.method674(arg1);
			} else if (arg1.anInt466 >= anInt953) {
				this.method675(arg1);
			} else {
				this.method676(arg1);
			}
			this.method677(arg1);
			this.method678(464, arg1);
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("71359, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!NNWGJIGN;I)V")
	private void method674(@OriginalArg(0) Class1_Sub1_Sub1_Sub4 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt465 - anInt953;
			@Pc(24) int local24 = arg0.anInt461 * 128 + arg0.anInt475 * 64;
			@Pc(34) int local34 = arg0.anInt463 * 128 + arg0.anInt475 * 64;
			arg0.anInt458 += (local24 - arg0.anInt458) / local4;
			arg0.anInt459 += (local34 - arg0.anInt459) / local4;
			arg0.anInt497 = 0;
			if (arg0.anInt467 == 0) {
				arg0.anInt451 = 1024;
			}
			if (arg0.anInt467 == 1) {
				arg0.anInt451 = 1536;
			}
			if (arg0.anInt467 == 2) {
				arg0.anInt451 = 0;
			}
			if (arg0.anInt467 == 3) {
				arg0.anInt451 = 512;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("44529, " + arg0 + ", " + 2 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!NNWGJIGN;B)V")
	private void method675(@OriginalArg(0) Class1_Sub1_Sub1_Sub4 arg0) {
		try {
			if (arg0.anInt466 == anInt953 || arg0.anInt491 == -1 || arg0.anInt494 != 0 || arg0.anInt493 + 1 > Class19.aClass19Array1[arg0.anInt491].method193(arg0.anInt492)) {
				@Pc(29) int local29 = arg0.anInt466 - arg0.anInt465;
				@Pc(34) int local34 = anInt953 - arg0.anInt465;
				@Pc(44) int local44 = arg0.anInt461 * 128 + arg0.anInt475 * 64;
				@Pc(54) int local54 = arg0.anInt463 * 128 + arg0.anInt475 * 64;
				@Pc(64) int local64 = arg0.anInt462 * 128 + arg0.anInt475 * 64;
				@Pc(74) int local74 = arg0.anInt464 * 128 + arg0.anInt475 * 64;
				arg0.anInt458 = (local44 * (local29 - local34) + local64 * local34) / local29;
				arg0.anInt459 = (local54 * (local29 - local34) + local74 * local34) / local29;
			}
			arg0.anInt497 = 0;
			if (arg0.anInt467 == 0) {
				arg0.anInt451 = 1024;
			}
			if (arg0.anInt467 == 1) {
				arg0.anInt451 = 1536;
			}
			if (arg0.anInt467 == 2) {
				arg0.anInt451 = 0;
			}
			if (arg0.anInt467 == 3) {
				arg0.anInt451 = 512;
			}
			arg0.anInt460 = arg0.anInt451;
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("2936, " + arg0 + ", " + 68 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!NNWGJIGN;)V")
	private void method676(@OriginalArg(1) Class1_Sub1_Sub1_Sub4 arg0) {
		try {
			if (this.anInt841 != -12340) {
				this.anInt962 = this.aClass1_Sub1_Sub4_6.method405();
			}
			arg0.anInt472 = arg0.anInt453;
			if (arg0.anInt477 == 0) {
				arg0.anInt497 = 0;
			} else {
				if (arg0.anInt491 != -1 && arg0.anInt494 == 0) {
					@Pc(33) Class19 local33 = Class19.aClass19Array1[arg0.anInt491];
					if (arg0.anInt496 > 0 && local33.anInt217 == 0) {
						arg0.anInt497++;
						return;
					}
					if (arg0.anInt496 <= 0 && local33.anInt218 == 0) {
						arg0.anInt497++;
						return;
					}
				}
				@Pc(62) int local62 = arg0.anInt458;
				@Pc(65) int local65 = arg0.anInt459;
				@Pc(80) int local80 = arg0.anIntArray140[arg0.anInt477 - 1] * 128 + arg0.anInt475 * 64;
				@Pc(95) int local95 = arg0.anIntArray141[arg0.anInt477 - 1] * 128 + arg0.anInt475 * 64;
				if (local80 - local62 <= 256 && local80 - local62 >= -256 && local95 - local65 <= 256 && local95 - local65 >= -256) {
					if (local62 < local80) {
						if (local65 < local95) {
							arg0.anInt451 = 1280;
						} else if (local65 > local95) {
							arg0.anInt451 = 1792;
						} else {
							arg0.anInt451 = 1536;
						}
					} else if (local62 > local80) {
						if (local65 < local95) {
							arg0.anInt451 = 768;
						} else if (local65 > local95) {
							arg0.anInt451 = 256;
						} else {
							arg0.anInt451 = 512;
						}
					} else if (local65 < local95) {
						arg0.anInt451 = 1024;
					} else {
						arg0.anInt451 = 0;
					}
					@Pc(189) int local189 = arg0.anInt451 - arg0.anInt460 & 0x7FF;
					if (local189 > 1024) {
						local189 -= 2048;
					}
					@Pc(196) int local196 = arg0.anInt488;
					if (local189 >= -256 && local189 <= 256) {
						local196 = arg0.anInt487;
					} else if (local189 >= 256 && local189 < 768) {
						local196 = arg0.anInt490;
					} else if (local189 >= -768 && local189 <= -256) {
						local196 = arg0.anInt489;
					}
					if (local196 == -1) {
						local196 = arg0.anInt487;
					}
					arg0.anInt472 = local196;
					@Pc(238) int local238 = 4;
					if (arg0.anInt460 != arg0.anInt451 && arg0.anInt478 == -1 && arg0.anInt476 != 0) {
						local238 = 2;
					}
					if (arg0.anInt477 > 2) {
						local238 = 6;
					}
					if (arg0.anInt477 > 3) {
						local238 = 8;
					}
					if (arg0.anInt497 > 0 && arg0.anInt477 > 1) {
						local238 = 8;
						arg0.anInt497--;
					}
					if (arg0.aBooleanArray5[arg0.anInt477 - 1]) {
						local238 <<= 0x1;
					}
					if (local238 >= 8 && arg0.anInt472 == arg0.anInt487 && arg0.anInt498 != -1) {
						arg0.anInt472 = arg0.anInt498;
					}
					if (local62 < local80) {
						arg0.anInt458 += local238;
						if (arg0.anInt458 > local80) {
							arg0.anInt458 = local80;
						}
					} else if (local62 > local80) {
						arg0.anInt458 -= local238;
						if (arg0.anInt458 < local80) {
							arg0.anInt458 = local80;
						}
					}
					if (local65 < local95) {
						arg0.anInt459 += local238;
						if (arg0.anInt459 > local95) {
							arg0.anInt459 = local95;
						}
					} else if (local65 > local95) {
						arg0.anInt459 -= local238;
						if (arg0.anInt459 < local95) {
							arg0.anInt459 = local95;
						}
					}
					if (arg0.anInt458 == local80 && arg0.anInt459 == local95) {
						arg0.anInt477--;
						if (arg0.anInt496 > 0) {
							arg0.anInt496--;
							return;
						}
					}
				} else {
					arg0.anInt458 = local80;
					arg0.anInt459 = local95;
				}
			}
		} catch (@Pc(400) RuntimeException local400) {
			signlink.reporterror("75139, " + -12340 + ", " + arg0 + ", " + local400.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!NNWGJIGN;)V")
	private void method677(@OriginalArg(1) Class1_Sub1_Sub1_Sub4 arg0) {
		try {
			if (arg0.anInt476 != 0) {
				@Pc(38) int local38;
				@Pc(44) int local44;
				if (arg0.anInt478 != -1 && arg0.anInt478 < 32768) {
					@Pc(30) Class1_Sub1_Sub1_Sub4_Sub2 local30 = this.aClass1_Sub1_Sub1_Sub4_Sub2Array1[arg0.anInt478];
					if (local30 != null) {
						local38 = arg0.anInt458 - local30.anInt458;
						local44 = arg0.anInt459 - local30.anInt459;
						if (local38 != 0 || local44 != 0) {
							arg0.anInt451 = (int) (Math.atan2((double) local38, (double) local44) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(69) int local69;
				if (arg0.anInt478 >= 32768) {
					local69 = arg0.anInt478 - 32768;
					if (local69 == this.anInt1026) {
						local69 = this.anInt1023;
					}
					@Pc(81) Class1_Sub1_Sub1_Sub4_Sub1 local81 = this.aClass1_Sub1_Sub1_Sub4_Sub1Array1[local69];
					if (local81 != null) {
						local44 = arg0.anInt458 - local81.anInt458;
						@Pc(95) int local95 = arg0.anInt459 - local81.anInt459;
						if (local44 != 0 || local95 != 0) {
							arg0.anInt451 = (int) (Math.atan2((double) local44, (double) local95) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt455 != 0 || arg0.anInt456 != 0) && (arg0.anInt477 == 0 || arg0.anInt497 > 0)) {
					local69 = arg0.anInt458 - (arg0.anInt455 - this.anInt833 - this.anInt833) * 64;
					local38 = arg0.anInt459 - (arg0.anInt456 - this.anInt834 - this.anInt834) * 64;
					if (local69 != 0 || local38 != 0) {
						arg0.anInt451 = (int) (Math.atan2((double) local69, (double) local38) * 325.949D) & 0x7FF;
					}
					arg0.anInt455 = 0;
					arg0.anInt456 = 0;
				}
				local69 = arg0.anInt451 - arg0.anInt460 & 0x7FF;
				if (local69 != 0) {
					if (local69 < arg0.anInt476 || local69 > 2048 - arg0.anInt476) {
						arg0.anInt460 = arg0.anInt451;
					} else if (local69 > 1024) {
						arg0.anInt460 -= arg0.anInt476;
					} else {
						arg0.anInt460 += arg0.anInt476;
					}
					arg0.anInt460 &= 0x7FF;
					if (arg0.anInt472 == arg0.anInt453 && arg0.anInt460 != arg0.anInt451) {
						if (arg0.anInt454 != -1) {
							arg0.anInt472 = arg0.anInt454;
							return;
						}
						arg0.anInt472 = arg0.anInt487;
						return;
					}
				}
			}
		} catch (@Pc(249) RuntimeException local249) {
			signlink.reporterror("26227, " + -74 + ", " + arg0 + ", " + local249.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!NNWGJIGN;)V")
	private void method678(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub4 arg1) {
		try {
			@Pc(5) boolean local5 = false;
			arg1.aBoolean101 = false;
			@Pc(17) Class19 local17;
			if (arg1.anInt472 != -1) {
				local17 = Class19.aClass19Array1[arg1.anInt472];
				arg1.anInt474++;
				if (arg1.anInt473 < local17.anInt211 && arg1.anInt474 > local17.method193(arg1.anInt473)) {
					arg1.anInt474 = 0;
					arg1.anInt473++;
				}
				if (arg1.anInt473 >= local17.anInt211) {
					arg1.anInt474 = 0;
					arg1.anInt473 = 0;
				}
			}
			if (arg1.anInt479 != -1 && anInt953 >= arg1.anInt482) {
				if (arg1.anInt480 < 0) {
					arg1.anInt480 = 0;
				}
				local17 = Class34.aClass34Array1[arg1.anInt479].aClass19_2;
				arg1.anInt481++;
				while (arg1.anInt480 < local17.anInt211 && arg1.anInt481 > local17.method193(arg1.anInt480)) {
					arg1.anInt481 -= local17.method193(arg1.anInt480);
					arg1.anInt480++;
				}
				if (arg1.anInt480 >= local17.anInt211 && (arg1.anInt480 < 0 || arg1.anInt480 >= local17.anInt211)) {
					arg1.anInt479 = -1;
				}
			}
			if (arg1.anInt491 != -1 && arg1.anInt494 <= 1) {
				local17 = Class19.aClass19Array1[arg1.anInt491];
				if (local17.anInt217 == 1 && arg1.anInt496 > 0 && arg1.anInt465 <= anInt953 && arg1.anInt466 < anInt953) {
					arg1.anInt494 = 1;
					return;
				}
			}
			if (arg1.anInt491 != -1 && arg1.anInt494 == 0) {
				local17 = Class19.aClass19Array1[arg1.anInt491];
				arg1.anInt493++;
				while (arg1.anInt492 < local17.anInt211 && arg1.anInt493 > local17.method193(arg1.anInt492)) {
					arg1.anInt493 -= local17.method193(arg1.anInt492);
					arg1.anInt492++;
				}
				if (arg1.anInt492 >= local17.anInt211) {
					arg1.anInt492 -= local17.anInt212;
					arg1.anInt495++;
					if (arg1.anInt495 >= local17.anInt216) {
						arg1.anInt491 = -1;
					}
					if (arg1.anInt492 < 0 || arg1.anInt492 >= local17.anInt211) {
						arg1.anInt491 = -1;
					}
				}
				arg1.aBoolean101 = local17.aBoolean52;
			}
			if (arg1.anInt494 > 0) {
				arg1.anInt494--;
			}
		} catch (@Pc(262) RuntimeException local262) {
			signlink.reporterror("36614, " + arg0 + ", " + arg1 + ", " + local262.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method679() {
		try {
			if (this.anInt999 == -1 || this.anInt931 != 2 && super.aClass18_2 == null) {
				if (this.aBoolean217) {
					this.method613();
					this.aBoolean217 = false;
					this.aClass18_3.method190(796, 4, 0, super.aGraphics2);
					this.aClass18_4.method190(796, 357, 0, super.aGraphics2);
					this.aClass18_5.method190(796, 4, 722, super.aGraphics2);
					this.aClass18_6.method190(796, 205, 743, super.aGraphics2);
					this.aClass18_7.method190(796, 0, 0, super.aGraphics2);
					this.aClass18_8.method190(796, 4, 516, super.aGraphics2);
					this.aClass18_9.method190(796, 205, 516, super.aGraphics2);
					this.aClass18_10.method190(796, 357, 496, super.aGraphics2);
					this.aClass18_11.method190(796, 338, 0, super.aGraphics2);
					this.aBoolean219 = true;
					this.aBoolean228 = true;
					this.aBoolean231 = true;
					this.aBoolean220 = true;
					if (this.anInt931 != 2) {
						this.aClass18_26.method190(796, 4, 4, super.aGraphics2);
						this.aClass18_25.method190(796, 4, 550, super.aGraphics2);
					}
				}
				if (this.anInt931 == 2) {
					this.method637();
				}
				if (this.aBoolean230 && this.anInt869 == 1) {
					this.aBoolean219 = true;
				}
				@Pc(293) boolean local293;
				if (this.anInt908 != -1) {
					local293 = this.method668(this.anInt908, this.anInt944, this.anInt969);
					if (local293) {
						this.aBoolean219 = true;
					}
				}
				if (this.anInt829 == 2) {
					this.aBoolean219 = true;
				}
				if (this.anInt939 == 2) {
					this.aBoolean219 = true;
				}
				if (this.aBoolean219) {
					this.method697((byte) 9);
					this.aBoolean219 = false;
				}
				@Pc(378) int local378;
				if (this.anInt887 == -1 && this.anInt988 == 0) {
					this.aClass24_1.anInt377 = this.anInt882 - this.anInt971 - 77;
					if (super.anInt813 > 448 && super.anInt813 < 560 && super.anInt814 > 332) {
						this.method694(this.aClass24_1, 0, -1, 77, super.anInt813 - 17, this.anInt882, 463, super.anInt814 - 357);
					}
					local378 = this.anInt882 - this.aClass24_1.anInt377 - 77;
					if (local378 < 0) {
						local378 = 0;
					}
					if (local378 > this.anInt882 - 77) {
						local378 = this.anInt882 - 77;
					}
					if (this.anInt971 != local378) {
						this.anInt971 = local378;
						this.aBoolean228 = true;
					}
				}
				if (this.anInt887 == -1 && this.anInt988 == 3) {
					local378 = this.anInt844 * 14 + 7;
					this.aClass24_1.anInt377 = this.anInt845;
					if (super.anInt813 > 448 && super.anInt813 < 560 && super.anInt814 > 332) {
						this.method694(this.aClass24_1, 0, -1, 77, super.anInt813 - 17, local378, 463, super.anInt814 - 357);
					}
					@Pc(457) int local457 = this.aClass24_1.anInt377;
					if (local457 < 0) {
						local457 = 0;
					}
					if (local457 > local378 - 77) {
						local457 = local378 - 77;
					}
					if (this.anInt845 != local457) {
						this.anInt845 = local457;
						this.aBoolean228 = true;
					}
				}
				if (this.anInt887 != -1) {
					local293 = this.method668(this.anInt887, this.anInt944, this.anInt969);
					if (local293) {
						this.aBoolean228 = true;
					}
				}
				if (this.anInt829 == 3) {
					this.aBoolean228 = true;
				}
				if (this.anInt939 == 3) {
					this.aBoolean228 = true;
				}
				if (this.aString27 != null) {
					this.aBoolean228 = true;
				}
				if (this.aBoolean230 && this.anInt869 == 2) {
					this.aBoolean228 = true;
				}
				if (this.aBoolean228) {
					this.method703();
					this.aBoolean228 = false;
				}
				if (this.anInt931 == 2) {
					this.method622();
					this.aClass18_25.method190(796, 4, 550, super.aGraphics2);
					anInt997++;
					if (anInt997 > 1271) {
						anInt997 = 0;
						this.aClass1_Sub1_Sub4_8.method394(225);
						this.aClass1_Sub1_Sub4_8.method395(0);
						local378 = this.aClass1_Sub1_Sub4_8.anInt624;
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass1_Sub1_Sub4_8.method395(152);
						}
						this.aClass1_Sub1_Sub4_8.method396((int) (Math.random() * 65536.0D));
						this.aClass1_Sub1_Sub4_8.method395((int) (Math.random() * 256.0D));
						this.aClass1_Sub1_Sub4_8.method395((int) (Math.random() * 256.0D));
						this.aClass1_Sub1_Sub4_8.method396(16113);
						this.aClass1_Sub1_Sub4_8.method396((int) (Math.random() * 65536.0D));
						this.aClass1_Sub1_Sub4_8.method396(60626);
						this.aClass1_Sub1_Sub4_8.method396(58675);
						this.aClass1_Sub1_Sub4_8.method396((int) (Math.random() * 65536.0D));
						this.aClass1_Sub1_Sub4_8.method395((int) (Math.random() * 256.0D));
						this.aClass1_Sub1_Sub4_8.method404(this.aClass1_Sub1_Sub4_8.anInt624 - local378);
					}
				}
				if (this.anInt901 != -1) {
					this.aBoolean231 = true;
				}
				if (this.aBoolean231) {
					if (this.anInt901 != -1 && this.anInt901 == this.anInt1044) {
						this.anInt901 = -1;
						this.aClass1_Sub1_Sub4_8.method394(61);
						this.aClass1_Sub1_Sub4_8.method395(this.anInt1044);
					}
					this.aBoolean231 = false;
					this.aClass18_23.method189();
					this.aClass1_Sub1_Sub2_Sub4_13.method570(0, 0);
					if (this.anInt908 == -1) {
						if (this.anIntArray275[this.anInt1044] != -1) {
							if (this.anInt1044 == 0) {
								this.aClass1_Sub1_Sub2_Sub4_1.method570(10, 22);
							}
							if (this.anInt1044 == 1) {
								this.aClass1_Sub1_Sub2_Sub4_2.method570(8, 54);
							}
							if (this.anInt1044 == 2) {
								this.aClass1_Sub1_Sub2_Sub4_2.method570(8, 82);
							}
							if (this.anInt1044 == 3) {
								this.aClass1_Sub1_Sub2_Sub4_3.method570(8, 110);
							}
							if (this.anInt1044 == 4) {
								this.aClass1_Sub1_Sub2_Sub4_5.method570(8, 153);
							}
							if (this.anInt1044 == 5) {
								this.aClass1_Sub1_Sub2_Sub4_5.method570(8, 181);
							}
							if (this.anInt1044 == 6) {
								this.aClass1_Sub1_Sub2_Sub4_4.method570(9, 209);
							}
						}
						if (this.anIntArray275[0] != -1 && (this.anInt901 != 0 || anInt953 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub4Array5[0].method570(13, 29);
						}
						if (this.anIntArray275[1] != -1 && (this.anInt901 != 1 || anInt953 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub4Array5[1].method570(11, 53);
						}
						if (this.anIntArray275[2] != -1 && (this.anInt901 != 2 || anInt953 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub4Array5[2].method570(11, 82);
						}
						if (this.anIntArray275[3] != -1 && (this.anInt901 != 3 || anInt953 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub4Array5[3].method570(12, 115);
						}
						if (this.anIntArray275[4] != -1 && (this.anInt901 != 4 || anInt953 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub4Array5[4].method570(13, 153);
						}
						if (this.anIntArray275[5] != -1 && (this.anInt901 != 5 || anInt953 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub4Array5[5].method570(11, 180);
						}
						if (this.anIntArray275[6] != -1 && (this.anInt901 != 6 || anInt953 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub4Array5[6].method570(13, 208);
						}
					}
					this.aClass18_23.method190(796, 160, 516, super.aGraphics2);
					this.aClass18_22.method189();
					this.aClass1_Sub1_Sub2_Sub4_12.method570(0, 0);
					if (this.anInt908 == -1) {
						if (this.anIntArray275[this.anInt1044] != -1) {
							if (this.anInt1044 == 7) {
								this.aClass1_Sub1_Sub2_Sub4_14.method570(0, 42);
							}
							if (this.anInt1044 == 8) {
								this.aClass1_Sub1_Sub2_Sub4_15.method570(0, 74);
							}
							if (this.anInt1044 == 9) {
								this.aClass1_Sub1_Sub2_Sub4_15.method570(0, 102);
							}
							if (this.anInt1044 == 10) {
								this.aClass1_Sub1_Sub2_Sub4_16.method570(1, 130);
							}
							if (this.anInt1044 == 11) {
								this.aClass1_Sub1_Sub2_Sub4_18.method570(0, 173);
							}
							if (this.anInt1044 == 12) {
								this.aClass1_Sub1_Sub2_Sub4_18.method570(0, 201);
							}
							if (this.anInt1044 == 13) {
								this.aClass1_Sub1_Sub2_Sub4_17.method570(0, 229);
							}
						}
						if (this.anIntArray275[8] != -1 && (this.anInt901 != 8 || anInt953 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub4Array5[7].method570(2, 74);
						}
						if (this.anIntArray275[9] != -1 && (this.anInt901 != 9 || anInt953 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub4Array5[8].method570(3, 102);
						}
						if (this.anIntArray275[10] != -1 && (this.anInt901 != 10 || anInt953 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub4Array5[9].method570(4, 137);
						}
						if (this.anIntArray275[11] != -1 && (this.anInt901 != 11 || anInt953 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub4Array5[10].method570(2, 174);
						}
						if (this.anIntArray275[12] != -1 && (this.anInt901 != 12 || anInt953 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub4Array5[11].method570(2, 201);
						}
						if (this.anIntArray275[13] != -1 && (this.anInt901 != 13 || anInt953 % 20 < 10)) {
							this.aClass1_Sub1_Sub2_Sub4Array5[12].method570(2, 226);
						}
					}
					this.aClass18_22.method190(796, 466, 496, super.aGraphics2);
					this.aClass18_26.method189();
					Class1_Sub1_Sub2_Sub3.anIntArray163 = this.anIntArray228;
				}
				if (this.aBoolean220) {
					this.aBoolean220 = false;
					this.aClass18_21.method189();
					this.aClass1_Sub1_Sub2_Sub4_11.method570(0, 0);
					this.aClass1_Sub1_Sub2_Sub2_3.method276(55, 28, "Public chat", true, 16777215);
					if (this.anInt824 == 0) {
						this.aClass1_Sub1_Sub2_Sub2_3.method276(55, 41, "On", true, 65280);
					}
					if (this.anInt824 == 1) {
						this.aClass1_Sub1_Sub2_Sub2_3.method276(55, 41, "Friends", true, 16776960);
					}
					if (this.anInt824 == 2) {
						this.aClass1_Sub1_Sub2_Sub2_3.method276(55, 41, "Off", true, 16711680);
					}
					if (this.anInt824 == 3) {
						this.aClass1_Sub1_Sub2_Sub2_3.method276(55, 41, "Hide", true, 65535);
					}
					this.aClass1_Sub1_Sub2_Sub2_3.method276(184, 28, "Private chat", true, 16777215);
					if (this.anInt840 == 0) {
						this.aClass1_Sub1_Sub2_Sub2_3.method276(184, 41, "On", true, 65280);
					}
					if (this.anInt840 == 1) {
						this.aClass1_Sub1_Sub2_Sub2_3.method276(184, 41, "Friends", true, 16776960);
					}
					if (this.anInt840 == 2) {
						this.aClass1_Sub1_Sub2_Sub2_3.method276(184, 41, "Off", true, 16711680);
					}
					this.aClass1_Sub1_Sub2_Sub2_3.method276(324, 28, "Trade/compete", true, 16777215);
					if (this.anInt874 == 0) {
						this.aClass1_Sub1_Sub2_Sub2_3.method276(324, 41, "On", true, 65280);
					}
					if (this.anInt874 == 1) {
						this.aClass1_Sub1_Sub2_Sub2_3.method276(324, 41, "Friends", true, 16776960);
					}
					if (this.anInt874 == 2) {
						this.aClass1_Sub1_Sub2_Sub2_3.method276(324, 41, "Off", true, 16711680);
					}
					this.aClass1_Sub1_Sub2_Sub2_3.method276(458, 33, "Report abuse", true, 16777215);
					this.aClass18_21.method190(796, 453, 0, super.aGraphics2);
					this.aClass18_26.method189();
					Class1_Sub1_Sub2_Sub3.anIntArray163 = this.anIntArray228;
				}
				this.anInt944 = 0;
			} else {
				if (this.anInt931 == 2) {
					this.method668(this.anInt999, this.anInt944, this.anInt969);
					if (this.anInt866 != -1) {
						this.method668(this.anInt866, this.anInt944, this.anInt969);
					}
					this.anInt944 = 0;
					this.method650();
					super.aClass18_2.method189();
					Class1_Sub1_Sub2_Sub3.anIntArray163 = this.anIntArray229;
					Class1_Sub1_Sub2.method556(this.anInt948);
					this.aBoolean217 = true;
					@Pc(71) Class24 local71 = Class24.method230(this.anInt999);
					if (local71.anInt366 == 512 && local71.anInt352 == 334 && local71.anInt364 == 0) {
						local71.anInt366 = 765;
						local71.anInt352 = 503;
					}
					this.method638(local71, 0, 0, 0, 284);
					if (this.anInt866 != -1) {
						local71 = Class24.method230(this.anInt866);
						if (local71.anInt366 == 512 && local71.anInt352 == 334 && local71.anInt364 == 0) {
							local71.anInt366 = 765;
							local71.anInt352 = 503;
						}
						this.method638(local71, 0, 0, 0, 284);
					}
					if (this.aBoolean230) {
						this.method704();
					} else {
						this.method654();
						this.method619();
					}
				}
				super.aClass18_2.method190(796, 0, 0, super.aGraphics2);
			}
		} catch (@Pc(1382) RuntimeException local1382) {
			signlink.reporterror("72163, " + 97 + ", " + local1382.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!OMAKLDKI;ZI)V")
	private void method680(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub1 arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(10) int local10 = arg0 * arg0 + arg2 * arg2;
			if (local10 > 4225 && local10 < 90000) {
				@Pc(24) int local24 = this.anInt919 + this.anInt911 & 0x7FF;
				@Pc(28) int local28 = Class1_Sub1_Sub1_Sub3.anIntArray90[local24];
				@Pc(32) int local32 = Class1_Sub1_Sub1_Sub3.anIntArray91[local24];
				@Pc(41) int local41 = local28 * 256 / (this.anInt860 + 256);
				@Pc(50) int local50 = local32 * 256 / (this.anInt860 + 256);
				@Pc(60) int local60 = arg2 * local41 + arg0 * local50 >> 16;
				@Pc(70) int local70 = arg2 * local50 - arg0 * local41 >> 16;
				@Pc(76) double local76 = Math.atan2((double) local60, (double) local70);
				@Pc(82) int local82 = (int) (Math.sin(local76) * 63.0D);
				@Pc(88) int local88 = (int) (Math.cos(local76) * 57.0D);
				this.aClass1_Sub1_Sub2_Sub1_5.method257(local82 + 94 + 4 - 10, local76, 83 - local88 - 20);
			} else {
				this.method660(arg2, arg1, arg0);
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("55054, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method579() {
		try {
			this.aClass18_21 = null;
			this.aClass18_22 = null;
			this.aClass18_23 = null;
			this.aClass1_Sub1_Sub2_Sub4Array4 = null;
			this.aClass1_Sub1_Sub2_Sub1Array8 = null;
			this.method696();
			this.anIntArrayArray25 = null;
			this.aClass18_17 = null;
			this.aClass18_18 = null;
			this.aClass18_19 = null;
			this.aClass18_20 = null;
			this.aClass18_7 = null;
			this.aClass18_8 = null;
			this.aClass18_9 = null;
			this.aClass18_10 = null;
			this.aClass18_11 = null;
			this.aClass1_Sub1_Sub2_Sub4_6 = null;
			this.aClass1_Sub1_Sub2_Sub4_7 = null;
			this.aClass1_Sub1_Sub2_Sub4_8 = null;
			this.aStringArray14 = null;
			this.aLongArray4 = null;
			this.anIntArray213 = null;
			this.aClass1_Sub1_Sub2_Sub4_14 = null;
			this.aClass1_Sub1_Sub2_Sub4_15 = null;
			this.aClass1_Sub1_Sub2_Sub4_16 = null;
			this.aClass1_Sub1_Sub2_Sub4_17 = null;
			this.aClass1_Sub1_Sub2_Sub4_18 = null;
			this.aClass1_Sub1_Sub2_Sub4_1 = null;
			this.aClass1_Sub1_Sub2_Sub4_2 = null;
			this.aClass1_Sub1_Sub2_Sub4_3 = null;
			this.aClass1_Sub1_Sub2_Sub4_4 = null;
			this.aClass1_Sub1_Sub2_Sub4_5 = null;
			this.aByteArray21 = null;
			this.aClass18_15 = null;
			this.aClass18_16 = null;
			this.aClass18_12 = null;
			this.aClass18_13 = null;
			this.aClass18_14 = null;
			this.anIntArrayArray22 = null;
			this.anIntArrayArray23 = null;
			this.anIntArray252 = null;
			this.anIntArray253 = null;
			this.aClass1_Sub1_Sub2_Sub1_9 = null;
			this.aClass1_Sub1_Sub2_Sub1_10 = null;
			this.aClass1_Sub1_Sub2_Sub1Array7 = null;
			this.aClass1_Sub1_Sub2_Sub1Array10 = null;
			this.aClass1_Sub1_Sub2_Sub1Array9 = null;
			this.aClass1_Sub1_Sub2_Sub1Array5 = null;
			this.aClass1_Sub1_Sub2_Sub1Array4 = null;
			this.anIntArray231 = null;
			this.anIntArray249 = null;
			this.aByteArrayArray5 = null;
			this.aByteArrayArray6 = null;
			this.anIntArray250 = null;
			this.anIntArray251 = null;
			this.aClass1_Sub1_Sub4_8 = null;
			this.aClass1_Sub1_Sub4_9 = null;
			this.aClass1_Sub1_Sub4_6 = null;
			this.aClass1_Sub1_Sub2_Sub1_8 = null;
			this.aClass18_3 = null;
			this.aClass18_4 = null;
			this.aClass18_5 = null;
			this.aClass18_6 = null;
			this.aClass1_Sub1_Sub4_7 = null;
			this.aClass1_Sub1_Sub2_Sub1_11 = null;
			this.aClass1_Sub1_Sub2_Sub1_12 = null;
			this.aClass1_Sub1_Sub2_Sub1_13 = null;
			this.aClass1_Sub1_Sub2_Sub1_14 = null;
			this.aClass1_Sub1_Sub2_Sub1_15 = null;
			this.aClass18_24 = null;
			this.aClass18_25 = null;
			this.aClass18_26 = null;
			this.aClass18_27 = null;
			this.aClass1_Sub1_Sub2_Sub4_11 = null;
			this.aClass1_Sub1_Sub2_Sub4_12 = null;
			this.aClass1_Sub1_Sub2_Sub4_13 = null;
			this.aClass1_Sub1_Sub1_Sub4_Sub2Array1 = null;
			this.anIntArray230 = null;
			this.aClass1_Sub1_Sub1_Sub4_Sub1Array1 = null;
			this.anIntArray268 = null;
			this.anIntArray269 = null;
			this.aClass1_Sub1_Sub4Array1 = null;
			this.anIntArray247 = null;
			this.aClass1_Sub1_Sub2_Sub4Array5 = null;
			try {
				if (this.aClass31_1 != null) {
					this.aClass31_1.method335();
				}
			} catch (@Pc(259) Exception local259) {
			}
			this.aClass31_1 = null;
			this.anIntArrayArrayArray7 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass10_1 = null;
			this.aClass28Array1 = null;
			this.aClass8ArrayArrayArray1 = null;
			this.aClass8_11 = null;
			if (this.aClass4_Sub1_1 != null) {
				this.aClass4_Sub1_1.method118();
			}
			this.aClass4_Sub1_1 = null;
			if (this.aClass14_1 != null) {
				this.aClass14_1.aBoolean44 = false;
			}
			this.aClass14_1 = null;
			this.anIntArray266 = null;
			this.anIntArray267 = null;
			this.aClass1_Sub1_Sub2_Sub1Array6 = null;
			this.anIntArray240 = null;
			this.anIntArray241 = null;
			this.anIntArray242 = null;
			this.anIntArray243 = null;
			this.aStringArray13 = null;
			this.aClass8_10 = null;
			this.aClass8_12 = null;
			this.method711();
			Class32.method348();
			Class29.method328();
			Class39.method485();
			Class24.method227();
			Class6.aClass6Array1 = null;
			Class37.aClass37Array1 = null;
			Class36.aClass36Array1 = null;
			Class19.aClass19Array1 = null;
			Class34.aClass34Array1 = null;
			Class34.aClass7_7 = null;
			Class17.aClass17Array1 = null;
			super.aClass18_2 = null;
			Class1_Sub1_Sub1_Sub4_Sub1.aClass7_1 = null;
			Class1_Sub1_Sub2_Sub3.method366();
			Class10.method53();
			Class1_Sub1_Sub1_Sub3.method143();
			Class30.method332();
			System.gc();
		} catch (@Pc(374) RuntimeException local374) {
			signlink.reporterror("96347, " + 8 + ", " + local374.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZILclient!PIPBZEOV;)V")
	private void method681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class29 arg3) {
		try {
			if (this.anInt1005 < 400) {
				if (arg3.anIntArray146 != null) {
					arg3 = arg3.method325();
				}
				if (arg3 != null && arg3.aBoolean107) {
					@Pc(23) String local23 = arg3.aString14;
					this.aBoolean213 &= true;
					if (arg3.anInt524 != 0) {
						local23 = local23 + method594(aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt330, anInt954, arg3.anInt524) + " (level-" + arg3.anInt524 + ")";
					}
					if (this.anInt1035 == 1) {
						this.aStringArray13[this.anInt1005] = "Use " + this.aString31 + " with @yel@" + local23;
						this.anIntArray242[this.anInt1005] = 227;
						this.anIntArray243[this.anInt1005] = arg2;
						this.anIntArray240[this.anInt1005] = arg0;
						this.anIntArray241[this.anInt1005] = arg1;
						this.anInt1005++;
					} else if (this.anInt904 != 1) {
						@Pc(167) int local167;
						if (arg3.aStringArray2 != null) {
							for (local167 = 4; local167 >= 0; local167--) {
								if (arg3.aStringArray2[local167] != null && !arg3.aStringArray2[local167].equalsIgnoreCase("attack")) {
									this.aStringArray13[this.anInt1005] = arg3.aStringArray2[local167] + " @yel@" + local23;
									if (local167 == 0) {
										this.anIntArray242[this.anInt1005] = 616;
									}
									if (local167 == 1) {
										this.anIntArray242[this.anInt1005] = 310;
									}
									if (local167 == 2) {
										this.anIntArray242[this.anInt1005] = 218;
									}
									if (local167 == 3) {
										this.anIntArray242[this.anInt1005] = 138;
									}
									if (local167 == 4) {
										this.anIntArray242[this.anInt1005] = 745;
									}
									this.anIntArray243[this.anInt1005] = arg2;
									this.anIntArray240[this.anInt1005] = arg0;
									this.anIntArray241[this.anInt1005] = arg1;
									this.anInt1005++;
								}
							}
						}
						if (arg3.aStringArray2 != null) {
							for (local167 = 4; local167 >= 0; local167--) {
								if (arg3.aStringArray2[local167] != null && arg3.aStringArray2[local167].equalsIgnoreCase("attack")) {
									@Pc(291) short local291 = 0;
									if (arg3.anInt524 > aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt330) {
										local291 = 2000;
									}
									this.aStringArray13[this.anInt1005] = arg3.aStringArray2[local167] + " @yel@" + local23;
									if (local167 == 0) {
										this.anIntArray242[this.anInt1005] = local291 + 616;
									}
									if (local167 == 1) {
										this.anIntArray242[this.anInt1005] = local291 + 310;
									}
									if (local167 == 2) {
										this.anIntArray242[this.anInt1005] = local291 + 218;
									}
									if (local167 == 3) {
										this.anIntArray242[this.anInt1005] = local291 + 138;
									}
									if (local167 == 4) {
										this.anIntArray242[this.anInt1005] = local291 + 745;
									}
									this.anIntArray243[this.anInt1005] = arg2;
									this.anIntArray240[this.anInt1005] = arg0;
									this.anIntArray241[this.anInt1005] = arg1;
									this.anInt1005++;
								}
							}
						}
						this.aStringArray13[this.anInt1005] = "Examine @yel@" + local23;
						this.anIntArray242[this.anInt1005] = 1013;
						this.anIntArray243[this.anInt1005] = arg2;
						this.anIntArray240[this.anInt1005] = arg0;
						this.anIntArray241[this.anInt1005] = arg1;
						this.anInt1005++;
					} else if ((this.anInt906 & 0x2) == 2) {
						this.aStringArray13[this.anInt1005] = this.aString25 + " @yel@" + local23;
						this.anIntArray242[this.anInt1005] = 389;
						this.anIntArray243[this.anInt1005] = arg2;
						this.anIntArray240[this.anInt1005] = arg0;
						this.anIntArray241[this.anInt1005] = arg1;
						this.anInt1005++;
						return;
					}
				}
			}
		} catch (@Pc(441) RuntimeException local441) {
			signlink.reporterror("18333, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + local441.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!NHFASBOX;)Z")
	private boolean method682(@OriginalArg(1) Class24 arg0) {
		try {
			@Pc(10) int local10 = arg0.anInt359;
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
				this.aStringArray13[this.anInt1005] = "Remove @whi@" + this.aStringArray14[local10];
				this.anIntArray242[this.anInt1005] = 613;
				this.anInt1005++;
				this.aStringArray13[this.anInt1005] = "Message @whi@" + this.aStringArray14[local10];
				this.anIntArray242[this.anInt1005] = 444;
				this.anInt1005++;
				return true;
			} else if (local10 >= 401 && local10 <= 500) {
				this.aStringArray13[this.anInt1005] = "Remove @whi@" + arg0.aString8;
				this.anIntArray242[this.anInt1005] = 557;
				this.anInt1005++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("58372, " + -52 + ", " + arg0 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method683() {
		try {
			this.anInt847 = 0;
			this.anInt961 += 0;
			@Pc(76) int local76;
			for (@Pc(12) int local12 = -1; local12 < this.anInt1024 + this.anInt879; local12++) {
				@Pc(19) Class1_Sub1_Sub1_Sub4 local19;
				if (local12 == -1) {
					local19 = aClass1_Sub1_Sub1_Sub4_Sub1_1;
				} else if (local12 < this.anInt1024) {
					local19 = this.aClass1_Sub1_Sub1_Sub4_Sub1Array1[this.anIntArray268[local12]];
				} else {
					local19 = this.aClass1_Sub1_Sub1_Sub4_Sub2Array1[this.anIntArray230[local12 - this.anInt1024]];
				}
				if (local19 != null && local19.method311()) {
					@Pc(60) Class29 local60;
					if (local19 instanceof Class1_Sub1_Sub1_Sub4_Sub2) {
						local60 = ((Class1_Sub1_Sub1_Sub4_Sub2) local19).aClass29_2;
						if (local60.anIntArray146 != null) {
							local60 = local60.method325();
						}
						if (local60 == null) {
							continue;
						}
					}
					if (local12 >= this.anInt1024) {
						local60 = ((Class1_Sub1_Sub1_Sub4_Sub2) local19).aClass29_2;
						if (local60.anInt521 >= 0 && local60.anInt521 < this.aClass1_Sub1_Sub2_Sub1Array9.length) {
							this.method643(local19, local19.anInt452 + 15);
							if (this.anInt1003 > -1) {
								this.aClass1_Sub1_Sub2_Sub1Array9[local60.anInt521].method252(this.anInt1004 - 30, this.anInt1003 - 12);
							}
						}
						if (this.anInt936 == 1 && this.anInt880 == this.anIntArray230[local12 - this.anInt1024] && anInt953 % 20 < 10) {
							this.method643(local19, local19.anInt452 + 15);
							if (this.anInt1003 > -1) {
								this.aClass1_Sub1_Sub2_Sub1Array5[0].method252(this.anInt1004 - 28, this.anInt1003 - 12);
							}
						}
					} else {
						local76 = 30;
						@Pc(79) Class1_Sub1_Sub1_Sub4_Sub1 local79 = (Class1_Sub1_Sub1_Sub4_Sub1) local19;
						if (local79.anInt326 != -1 || local79.anInt329 != -1) {
							this.method643(local19, local19.anInt452 + 15);
							if (this.anInt1003 > -1) {
								if (local79.anInt326 != -1) {
									this.aClass1_Sub1_Sub2_Sub1Array10[local79.anInt326].method252(this.anInt1004 - 30, this.anInt1003 - 12);
									local76 += 25;
								}
								if (local79.anInt329 != -1) {
									this.aClass1_Sub1_Sub2_Sub1Array9[local79.anInt329].method252(this.anInt1004 - local76, this.anInt1003 - 12);
									local76 += 25;
								}
							}
						}
						if (local12 >= 0 && this.anInt936 == 10 && this.anInt1028 == this.anIntArray268[local12]) {
							this.method643(local19, local19.anInt452 + 15);
							if (this.anInt1003 > -1) {
								this.aClass1_Sub1_Sub2_Sub1Array5[1].method252(this.anInt1004 - local76, this.anInt1003 - 12);
							}
						}
					}
					if (local19.aString13 != null && (local12 >= this.anInt1024 || this.anInt824 == 0 || this.anInt824 == 3 || this.anInt824 == 1 && this.method589(((Class1_Sub1_Sub1_Sub4_Sub1) local19).aString7))) {
						this.method643(local19, local19.anInt452);
						if (this.anInt1003 > -1 && this.anInt847 < this.anInt848) {
							this.anIntArray217[this.anInt847] = this.aClass1_Sub1_Sub2_Sub2_4.method278(local19.aString13) / 2;
							this.anIntArray216[this.anInt847] = this.aClass1_Sub1_Sub2_Sub2_4.anInt434;
							this.anIntArray214[this.anInt847] = this.anInt1003;
							this.anIntArray215[this.anInt847] = this.anInt1004;
							this.anIntArray218[this.anInt847] = local19.anInt457;
							this.anIntArray219[this.anInt847] = local19.anInt471;
							this.anIntArray220[this.anInt847] = local19.anInt486;
							this.aStringArray9[this.anInt847++] = local19.aString13;
							if (this.anInt831 == 0 && local19.anInt471 >= 1 && local19.anInt471 <= 3) {
								this.anIntArray216[this.anInt847] += 10;
								this.anIntArray215[this.anInt847] += 5;
							}
							if (this.anInt831 == 0 && local19.anInt471 == 4) {
								this.anIntArray217[this.anInt847] = 60;
							}
							if (this.anInt831 == 0 && local19.anInt471 == 5) {
								this.anIntArray216[this.anInt847] += 5;
							}
						}
					}
					if (local19.anInt468 > anInt953) {
						this.method643(local19, local19.anInt452 + 15);
						if (this.anInt1003 > -1) {
							local76 = local19.anInt469 * 30 / local19.anInt470;
							if (local76 > 30) {
								local76 = 30;
							}
							Class1_Sub1_Sub2.method558(65280, 5, this.anInt1003 - 15, local76, this.anInt1004 - 3);
							Class1_Sub1_Sub2.method558(16711680, 5, this.anInt1003 + local76 - 15, 30 - local76, this.anInt1004 - 3);
						}
					}
					for (local76 = 0; local76 < 4; local76++) {
						if (local19.anIntArray139[local76] > anInt953) {
							this.method643(local19, local19.anInt452 / 2);
							if (this.anInt1003 > -1) {
								if (local76 == 1) {
									this.anInt1004 -= 20;
								}
								if (local76 == 2) {
									this.anInt1003 -= 15;
									this.anInt1004 -= 10;
								}
								if (local76 == 3) {
									this.anInt1003 += 15;
									this.anInt1004 -= 10;
								}
								this.aClass1_Sub1_Sub2_Sub1Array7[local19.anIntArray138[local76]].method252(this.anInt1004 - 12, this.anInt1003 - 12);
								this.aClass1_Sub1_Sub2_Sub2_2.method275(this.anInt1004 + 4, String.valueOf(local19.anIntArray137[local76]), this.anInt1003, 0);
								this.aClass1_Sub1_Sub2_Sub2_2.method275(this.anInt1004 + 3, String.valueOf(local19.anIntArray137[local76]), this.anInt1003 - 1, 16777215);
							}
						}
					}
				}
			}
			for (@Pc(616) int local616 = 0; local616 < this.anInt847; local616++) {
				local76 = this.anIntArray214[local616];
				@Pc(628) int local628 = this.anIntArray215[local616];
				@Pc(633) int local633 = this.anIntArray217[local616];
				@Pc(638) int local638 = this.anIntArray216[local616];
				@Pc(640) boolean local640 = true;
				while (local640) {
					local640 = false;
					for (@Pc(646) int local646 = 0; local646 < local616; local646++) {
						if (local628 + 2 > this.anIntArray215[local646] - this.anIntArray216[local646] && local628 - local638 < this.anIntArray215[local646] + 2 && local76 - local633 < this.anIntArray214[local646] + this.anIntArray217[local646] && local76 + local633 > this.anIntArray214[local646] - this.anIntArray217[local646] && this.anIntArray215[local646] - this.anIntArray216[local646] < local628) {
							local628 = this.anIntArray215[local646] - this.anIntArray216[local646];
							local640 = true;
						}
					}
				}
				this.anInt1003 = this.anIntArray214[local616];
				this.anInt1004 = this.anIntArray215[local616] = local628;
				@Pc(745) String local745 = this.aStringArray9[local616];
				if (this.anInt831 == 0) {
					@Pc(750) int local750 = 16776960;
					if (this.anIntArray218[local616] < 6) {
						local750 = this.anIntArray254[this.anIntArray218[local616]];
					}
					if (this.anIntArray218[local616] == 6) {
						local750 = this.anInt980 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray218[local616] == 7) {
						local750 = this.anInt980 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray218[local616] == 8) {
						local750 = this.anInt980 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(825) int local825;
					if (this.anIntArray218[local616] == 9) {
						local825 = 150 - this.anIntArray220[local616];
						if (local825 < 50) {
							local750 = local825 * 1280 + 16711680;
						} else if (local825 < 100) {
							local750 = 16776960 - (local825 - 50) * 327680;
						} else if (local825 < 150) {
							local750 = (local825 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray218[local616] == 10) {
						local825 = 150 - this.anIntArray220[local616];
						if (local825 < 50) {
							local750 = local825 * 5 + 16711680;
						} else if (local825 < 100) {
							local750 = 16711935 - (local825 - 50) * 327680;
						} else if (local825 < 150) {
							local750 = (local825 - 100) * 327680 + 255 - (local825 - 100) * 5;
						}
					}
					if (this.anIntArray218[local616] == 11) {
						local825 = 150 - this.anIntArray220[local616];
						if (local825 < 50) {
							local750 = 16777215 - local825 * 327685;
						} else if (local825 < 100) {
							local750 = (local825 - 50) * 327685 + 65280;
						} else if (local825 < 150) {
							local750 = 16777215 - (local825 - 100) * 327680;
						}
					}
					if (this.anIntArray219[local616] == 0) {
						this.aClass1_Sub1_Sub2_Sub2_4.method275(this.anInt1004 + 1, local745, this.anInt1003, 0);
						this.aClass1_Sub1_Sub2_Sub2_4.method275(this.anInt1004, local745, this.anInt1003, local750);
					}
					if (this.anIntArray219[local616] == 1) {
						this.aClass1_Sub1_Sub2_Sub2_4.method280(this.anInt1003, this.anInt980, 0, local745, this.anInt1004 + 1);
						this.aClass1_Sub1_Sub2_Sub2_4.method280(this.anInt1003, this.anInt980, local750, local745, this.anInt1004);
					}
					if (this.anIntArray219[local616] == 2) {
						this.aClass1_Sub1_Sub2_Sub2_4.method281(local745, this.anInt980, this.anInt1004 + 1, this.anInt1003, 0);
						this.aClass1_Sub1_Sub2_Sub2_4.method281(local745, this.anInt980, this.anInt1004, this.anInt1003, local750);
					}
					if (this.anIntArray219[local616] == 3) {
						this.aClass1_Sub1_Sub2_Sub2_4.method282(this.anInt1004 + 1, 0, local745, this.anInt980, 150 - this.anIntArray220[local616], this.anInt1003);
						this.aClass1_Sub1_Sub2_Sub2_4.method282(this.anInt1004, local750, local745, this.anInt980, 150 - this.anIntArray220[local616], this.anInt1003);
					}
					@Pc(1122) int local1122;
					if (this.anIntArray219[local616] == 4) {
						local825 = this.aClass1_Sub1_Sub2_Sub2_4.method278(local745);
						local1122 = (150 - this.anIntArray220[local616]) * (local825 + 100) / 150;
						Class1_Sub1_Sub2.method555(this.anInt1003 + 50, this.anInt1003 - 50, 334, this.anInt865, 0);
						this.aClass1_Sub1_Sub2_Sub2_4.method279(this.anInt1004 + 1, 0, this.anInt1003 + 50 - local1122, local745);
						this.aClass1_Sub1_Sub2_Sub2_4.method279(this.anInt1004, local750, this.anInt1003 + 50 - local1122, local745);
						Class1_Sub1_Sub2.method554(376);
					}
					if (this.anIntArray219[local616] == 5) {
						local825 = 150 - this.anIntArray220[local616];
						local1122 = 0;
						if (local825 < 25) {
							local1122 = local825 - 25;
						} else if (local825 > 125) {
							local1122 = local825 - 125;
						}
						Class1_Sub1_Sub2.method555(512, 0, this.anInt1004 + 5, this.anInt865, this.anInt1004 - this.aClass1_Sub1_Sub2_Sub2_4.anInt434 - 1);
						this.aClass1_Sub1_Sub2_Sub2_4.method275(this.anInt1004 + local1122 + 1, local745, this.anInt1003, 0);
						this.aClass1_Sub1_Sub2_Sub2_4.method275(this.anInt1004 + local1122, local745, this.anInt1003, local750);
						Class1_Sub1_Sub2.method554(376);
					}
				} else {
					this.aClass1_Sub1_Sub2_Sub2_4.method275(this.anInt1004 + 1, local745, this.anInt1003, 0);
					this.aClass1_Sub1_Sub2_Sub2_4.method275(this.anInt1004, local745, this.anInt1003, 16776960);
				}
			}
		} catch (@Pc(1274) RuntimeException local1274) {
			signlink.reporterror("36120, " + 0 + ", " + local1274.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)Z")
	private boolean method684() {
		try {
			if (this.aClass31_1 == null) {
				return false;
			}
			@Pc(162) String local162;
			@Pc(346) int local346;
			try {
				@Pc(18) int local18 = this.aClass31_1.method337();
				if (local18 == 0) {
					return false;
				}
				if (this.anInt962 == -1) {
					this.aClass31_1.method338(this.aClass1_Sub1_Sub4_6.aByteArray16, 0, 1);
					this.anInt962 = this.aClass1_Sub1_Sub4_6.aByteArray16[0] & 0xFF;
					if (this.aClass26_2 != null) {
						this.anInt962 = this.anInt962 - this.aClass26_2.method290() & 0xFF;
					}
					this.anInt961 = Class22.anIntArray116[this.anInt962];
					local18--;
				}
				if (this.anInt961 == -1) {
					if (local18 <= 0) {
						return false;
					}
					this.aClass31_1.method338(this.aClass1_Sub1_Sub4_6.aByteArray16, 0, 1);
					this.anInt961 = this.aClass1_Sub1_Sub4_6.aByteArray16[0] & 0xFF;
					local18--;
				}
				if (this.anInt961 == -2) {
					if (local18 <= 1) {
						return false;
					}
					this.aClass31_1.method338(this.aClass1_Sub1_Sub4_6.aByteArray16, 0, 2);
					this.aClass1_Sub1_Sub4_6.anInt624 = 0;
					this.anInt961 = this.aClass1_Sub1_Sub4_6.method407();
					local18 -= 2;
				}
				if (local18 < this.anInt961) {
					return false;
				}
				this.aClass1_Sub1_Sub4_6.anInt624 = 0;
				this.aClass31_1.method338(this.aClass1_Sub1_Sub4_6.aByteArray16, 0, this.anInt961);
				this.anInt963 = 0;
				this.anInt1049 = this.anInt1048;
				this.anInt1048 = this.anInt1047;
				this.anInt1047 = this.anInt962;
				@Pc(180) int local180;
				@Pc(313) String local313;
				@Pc(178) boolean local178;
				@Pc(173) String local173;
				if (this.anInt962 == 56) {
					local162 = this.aClass1_Sub1_Sub4_6.method412();
					@Pc(176) long local176;
					if (local162.endsWith(":tradereq:")) {
						local173 = local162.substring(0, local162.indexOf(":"));
						local176 = Class2.method14(local173);
						local178 = false;
						for (local180 = 0; local180 < this.anInt929; local180++) {
							if (this.aLongArray3[local180] == local176) {
								local178 = true;
								break;
							}
						}
						if (!local178 && this.anInt1027 == 0) {
							this.method618(local173, 4, "wishes to trade with you.");
						}
					} else if (local162.endsWith(":duelreq:")) {
						local173 = local162.substring(0, local162.indexOf(":"));
						local176 = Class2.method14(local173);
						local178 = false;
						for (local180 = 0; local180 < this.anInt929; local180++) {
							if (this.aLongArray3[local180] == local176) {
								local178 = true;
								break;
							}
						}
						if (!local178 && this.anInt1027 == 0) {
							this.method618(local173, 8, "wishes to duel with you.");
						}
					} else if (local162.endsWith(":chalreq:")) {
						local173 = local162.substring(0, local162.indexOf(":"));
						local176 = Class2.method14(local173);
						local178 = false;
						for (local180 = 0; local180 < this.anInt929; local180++) {
							if (this.aLongArray3[local180] == local176) {
								local178 = true;
								break;
							}
						}
						if (!local178 && this.anInt1027 == 0) {
							local313 = local162.substring(local162.indexOf(":") + 1, local162.length() - 9);
							this.method618(local173, 8, local313);
						}
					} else {
						this.method618("", 0, local162);
					}
					this.anInt962 = -1;
					return true;
				}
				@Pc(341) int local341;
				@Pc(351) int local351;
				if (this.anInt962 == 12) {
					local341 = this.aClass1_Sub1_Sub4_6.method433();
					local346 = this.aClass1_Sub1_Sub4_6.method434();
					local351 = this.aClass1_Sub1_Sub4_6.method434();
					Class24.method230(local351).anInt389 = (local341 << 16) + local346;
					this.anInt962 = -1;
					return true;
				}
				@Pc(406) int local406;
				@Pc(381) int local381;
				@Pc(373) long local373;
				if (this.anInt962 == 45) {
					local373 = this.aClass1_Sub1_Sub4_6.method411();
					local351 = this.aClass1_Sub1_Sub4_6.method410();
					local381 = this.aClass1_Sub1_Sub4_6.method405();
					local178 = false;
					for (local180 = 0; local180 < 100; local180++) {
						if (this.anIntArray276[local180] == local351) {
							local178 = true;
							break;
						}
					}
					if (local381 <= 1) {
						for (local406 = 0; local406 < this.anInt929; local406++) {
							if (this.aLongArray3[local406] == local373) {
								local178 = true;
								break;
							}
						}
					}
					if (!local178 && this.anInt1027 == 0) {
						try {
							this.anIntArray276[this.anInt832] = local351;
							this.anInt832 = (this.anInt832 + 1) % 100;
							local313 = Class13.method136(this.aClass1_Sub1_Sub4_6, this.anInt961 - 13);
							if (local381 != 3) {
								local313 = Class38.method456(local313);
							}
							if (local381 == 2 || local381 == 3) {
								this.method618("@cr2@" + Class2.method18(Class2.method15(357, local373)), 7, local313);
							} else if (local381 == 1) {
								this.method618("@cr1@" + Class2.method18(Class2.method15(357, local373)), 7, local313);
							} else {
								this.method618(Class2.method18(Class2.method15(357, local373)), 3, local313);
							}
						} catch (@Pc(516) Exception local516) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 51) {
					if (this.anInt908 != -1) {
						this.method599(this.anInt908);
						this.anInt908 = -1;
						this.aBoolean219 = true;
						this.aBoolean231 = true;
					}
					if (this.anInt887 != -1) {
						this.method599(this.anInt887);
						this.anInt887 = -1;
						this.aBoolean228 = true;
					}
					if (this.anInt999 != -1) {
						this.method599(this.anInt999);
						this.anInt999 = -1;
						this.aBoolean217 = true;
					}
					if (this.anInt866 != -1) {
						this.method599(this.anInt866);
						this.anInt866 = -1;
					}
					if (this.anInt945 != -1) {
						this.method599(this.anInt945);
						this.anInt945 = -1;
					}
					if (this.anInt988 != 0) {
						this.anInt988 = 0;
						this.aBoolean228 = true;
					}
					this.aBoolean206 = false;
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 208) {
					this.aBoolean219 = true;
					local341 = this.aClass1_Sub1_Sub4_6.method425(this.anInt1045);
					local346 = this.aClass1_Sub1_Sub4_6.method438();
					local351 = this.aClass1_Sub1_Sub4_6.method425(this.anInt1045);
					this.anIntArray223[local351] = local346;
					this.anIntArray234[local351] = local341;
					this.anIntArray271[local351] = 1;
					for (local381 = 0; local381 < 98; local381++) {
						if (local346 >= anIntArray270[local381]) {
							this.anIntArray271[local351] = local381 + 2;
						}
					}
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 237) {
					this.anInt903 = this.aClass1_Sub1_Sub4_6.method423();
					this.anInt1026 = this.aClass1_Sub1_Sub4_6.method407();
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 235) {
					local341 = this.aClass1_Sub1_Sub4_6.method407();
					local346 = this.aClass1_Sub1_Sub4_6.method432();
					if (this.anInt887 != -1) {
						this.method599(this.anInt887);
						this.anInt887 = -1;
						this.aBoolean228 = true;
					}
					if (this.anInt999 != -1) {
						this.method599(this.anInt999);
						this.anInt999 = -1;
						this.aBoolean217 = true;
					}
					if (this.anInt866 != -1) {
						this.method599(this.anInt866);
						this.anInt866 = -1;
					}
					if (this.anInt945 != local346) {
						this.method599(this.anInt945);
						this.anInt945 = local346;
					}
					if (this.anInt908 != local341) {
						this.method599(this.anInt908);
						this.anInt908 = local341;
					}
					if (this.anInt988 != 0) {
						this.anInt988 = 0;
						this.aBoolean228 = true;
					}
					this.aBoolean219 = true;
					this.aBoolean231 = true;
					this.aBoolean206 = false;
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 123) {
					local341 = this.aClass1_Sub1_Sub4_6.method432();
					local346 = this.aClass1_Sub1_Sub4_6.method437();
					this.anIntArray258[local341] = local346;
					if (this.anIntArray231[local341] != local346) {
						this.anIntArray231[local341] = local346;
						this.method611(local341);
						this.aBoolean219 = true;
						if (this.anInt983 != -1) {
							this.aBoolean228 = true;
						}
					}
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 42) {
					if (this.anInt1044 == 12) {
						this.aBoolean219 = true;
					}
					this.anInt893 = this.aClass1_Sub1_Sub4_6.method405();
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 148) {
					this.aBoolean197 = false;
					this.anInt988 = 2;
					this.aString17 = "";
					this.aBoolean228 = true;
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 85) {
					local341 = this.aClass1_Sub1_Sub4_6.method432();
					if (local341 == 65535) {
						local341 = -1;
					}
					if (local341 != this.anInt966 && this.aBoolean198 && !aBoolean234 && this.anInt946 == 0) {
						this.anInt1001 = local341;
						this.aBoolean223 = true;
						this.aClass4_Sub1_1.method111(2, this.anInt1001);
					}
					this.anInt966 = local341;
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 65) {
					local341 = this.aClass1_Sub1_Sub4_6.method433();
					local346 = this.aClass1_Sub1_Sub4_6.method409();
					if (this.aBoolean198 && !aBoolean234) {
						this.anInt1001 = local341;
						this.aBoolean223 = false;
						this.aClass4_Sub1_1.method111(2, this.anInt1001);
						this.anInt946 = local346;
					}
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 78) {
					local341 = this.aClass1_Sub1_Sub4_6.method407();
					local346 = this.aClass1_Sub1_Sub4_6.method405();
					local351 = this.aClass1_Sub1_Sub4_6.method407();
					if (local351 == 65535) {
						if (this.anInt886 < 50) {
							this.anIntArray245[this.anInt886] = (short) local341;
							this.anIntArray260[this.anInt886] = local346;
							this.anIntArray255[this.anInt886] = 0;
							this.anInt886++;
						}
					} else if (this.aBoolean205 && !aBoolean234 && this.anInt886 < 50) {
						this.anIntArray245[this.anInt886] = local341;
						this.anIntArray260[this.anInt886] = local346;
						this.anIntArray255[this.anInt886] = local351 + Class16.anIntArray96[local341];
						this.anInt886++;
					}
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 185) {
					local341 = this.aClass1_Sub1_Sub4_6.method433();
					Class24.method230(local341).anInt385 = 3;
					if (aClass1_Sub1_Sub1_Sub4_Sub1_1.aClass29_1 == null) {
						Class24.method230(local341).anInt386 = (aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray114[0] << 25) + (aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray114[4] << 20) + (aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray113[0] << 15) + (aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray113[8] << 10) + (aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray113[11] << 5) + aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray113[1];
					} else {
						Class24.method230(local341).anInt386 = (int) (aClass1_Sub1_Sub1_Sub4_Sub1_1.aClass29_1.aLong19 + 305419896L);
					}
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 8) {
					local341 = this.aClass1_Sub1_Sub4_6.method407();
					local346 = this.aClass1_Sub1_Sub4_6.method434();
					local351 = this.aClass1_Sub1_Sub4_6.method432();
					if (local341 == 65535) {
						Class24.method230(local346).anInt385 = 0;
						this.anInt962 = -1;
						return true;
					}
					@Pc(1177) Class39 local1177 = Class39.method488(local341);
					Class24.method230(local346).anInt385 = 4;
					Class24.method230(local346).anInt386 = local341;
					Class24.method230(local346).anInt362 = local1177.anInt650;
					Class24.method230(local346).anInt363 = local1177.anInt644;
					Class24.method230(local346).anInt361 = local1177.anInt641 * 100 / local351;
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 76) {
					this.aBoolean197 = false;
					this.anInt988 = 1;
					this.aString17 = "";
					this.aBoolean228 = true;
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 197) {
					this.anInt995 = 0;
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 29) {
					local341 = this.aClass1_Sub1_Sub4_6.method432();
					local173 = this.aClass1_Sub1_Sub4_6.method412();
					Class24.method230(local341).aString8 = local173;
					@Pc(1267) int local1267 = this.anIntArray275[this.anInt1044];
					if (Class24.method230(local341).anInt379 == local1267) {
						this.aBoolean219 = true;
					}
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 38) {
					this.anInt1044 = this.aClass1_Sub1_Sub4_6.method424(this.anInt956);
					this.aBoolean219 = true;
					this.aBoolean231 = true;
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 137) {
					for (local341 = 0; local341 < this.anIntArray231.length; local341++) {
						if (this.anIntArray231[local341] != this.anIntArray258[local341]) {
							this.anIntArray231[local341] = this.anIntArray258[local341];
							this.method611(local341);
							this.aBoolean219 = true;
						}
					}
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 210) {
					this.anInt881 = this.aClass1_Sub1_Sub4_6.method405();
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 44) {
					this.anInt862 = this.aClass1_Sub1_Sub4_6.method434();
					this.anInt1015 = this.aClass1_Sub1_Sub4_6.method433();
					this.aClass1_Sub1_Sub4_6.method432();
					this.anInt967 = this.aClass1_Sub1_Sub4_6.method433();
					this.anInt915 = this.aClass1_Sub1_Sub4_6.method433();
					this.anInt994 = this.aClass1_Sub1_Sub4_6.method434();
					this.anInt957 = this.aClass1_Sub1_Sub4_6.method433();
					this.anInt890 = this.aClass1_Sub1_Sub4_6.method437();
					this.anInt981 = this.aClass1_Sub1_Sub4_6.method433();
					this.aClass1_Sub1_Sub4_6.method425(this.anInt1045);
					this.anInt842 = this.aClass1_Sub1_Sub4_6.method434();
					signlink.dnslookup(Class2.method17(this.anInt890));
					this.anInt962 = -1;
					return true;
				}
				@Pc(1455) int local1455;
				@Pc(1590) int local1590;
				if (this.anInt962 == 18) {
					local373 = this.aClass1_Sub1_Sub4_6.method411();
					local351 = this.aClass1_Sub1_Sub4_6.method405();
					@Pc(1453) String local1453 = Class2.method18(Class2.method15(357, local373));
					for (local1455 = 0; local1455 < this.anInt977; local1455++) {
						if (local373 == this.aLongArray4[local1455]) {
							if (this.anIntArray213[local1455] != local351) {
								this.anIntArray213[local1455] = local351;
								this.aBoolean219 = true;
								if (local351 > 0) {
									this.method618("", 5, local1453 + " has logged in.");
								}
								if (local351 == 0) {
									this.method618("", 5, local1453 + " has logged out.");
								}
							}
							local1453 = null;
							break;
						}
					}
					if (local1453 != null && this.anInt977 < 200) {
						this.aLongArray4[this.anInt977] = local373;
						this.aStringArray14[this.anInt977] = local1453;
						this.anIntArray213[this.anInt977] = local351;
						this.anInt977++;
						this.aBoolean219 = true;
					}
					@Pc(1551) boolean local1551 = false;
					while (!local1551) {
						local1551 = true;
						for (local406 = 0; local406 < this.anInt977 - 1; local406++) {
							if (this.anIntArray213[local406] != anInt1030 && this.anIntArray213[local406 + 1] == anInt1030 || this.anIntArray213[local406] == 0 && this.anIntArray213[local406 + 1] != 0) {
								local1590 = this.anIntArray213[local406];
								this.anIntArray213[local406] = this.anIntArray213[local406 + 1];
								this.anIntArray213[local406 + 1] = local1590;
								@Pc(1612) String local1612 = this.aStringArray14[local406];
								this.aStringArray14[local406] = this.aStringArray14[local406 + 1];
								this.aStringArray14[local406 + 1] = local1612;
								@Pc(1634) long local1634 = this.aLongArray4[local406];
								this.aLongArray4[local406] = this.aLongArray4[local406 + 1];
								this.aLongArray4[local406 + 1] = local1634;
								this.aBoolean219 = true;
								local1551 = false;
							}
						}
					}
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 94) {
					local341 = this.aClass1_Sub1_Sub4_6.method432();
					this.method591(local341);
					if (this.anInt908 != -1) {
						this.method599(this.anInt908);
						this.anInt908 = -1;
						this.aBoolean219 = true;
						this.aBoolean231 = true;
					}
					if (this.anInt887 != -1) {
						this.method599(this.anInt887);
						this.anInt887 = -1;
						this.aBoolean228 = true;
					}
					if (this.anInt999 != -1) {
						this.method599(this.anInt999);
						this.anInt999 = -1;
						this.aBoolean217 = true;
					}
					if (this.anInt866 != -1) {
						this.method599(this.anInt866);
						this.anInt866 = -1;
					}
					if (this.anInt945 != local341) {
						this.method599(this.anInt945);
						this.anInt945 = local341;
					}
					if (this.anInt988 != 0) {
						this.anInt988 = 0;
						this.aBoolean228 = true;
					}
					this.aBoolean206 = false;
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 101) {
					local341 = this.aClass1_Sub1_Sub4_6.method432();
					local346 = this.aClass1_Sub1_Sub4_6.method407();
					Class24.method230(local341).anInt385 = 1;
					Class24.method230(local341).anInt386 = local346;
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 136) {
					local341 = this.aClass1_Sub1_Sub4_6.method432();
					local346 = this.aClass1_Sub1_Sub4_6.method434();
					local351 = this.aClass1_Sub1_Sub4_6.method433();
					local381 = this.aClass1_Sub1_Sub4_6.method407();
					Class24.method230(local346).anInt362 = local381;
					Class24.method230(local346).anInt363 = local341;
					Class24.method230(local346).anInt361 = local351;
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 33) {
					local341 = this.aClass1_Sub1_Sub4_6.method405();
					local346 = this.aClass1_Sub1_Sub4_6.method405();
					local351 = this.aClass1_Sub1_Sub4_6.method405();
					local381 = this.aClass1_Sub1_Sub4_6.method405();
					this.aBooleanArray12[local341] = true;
					this.anIntArray248[local341] = local346;
					this.anIntArray222[local341] = local351;
					this.anIntArray246[local341] = local381;
					this.anIntArray256[local341] = 0;
					this.anInt962 = -1;
					return true;
				}
				@Pc(1904) Class24 local1904;
				if (this.anInt962 == 67) {
					local341 = this.aClass1_Sub1_Sub4_6.method407();
					local346 = this.aClass1_Sub1_Sub4_6.method436();
					local1904 = Class24.method230(local341);
					if (local1904.anInt380 != local346 || local346 == -1) {
						local1904.anInt380 = local346;
						local1904.anInt382 = 0;
						local1904.anInt387 = 0;
					}
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 230) {
					this.anInt891 = this.aClass1_Sub1_Sub4_6.method424(this.anInt956);
					this.anInt892 = this.aClass1_Sub1_Sub4_6.method423();
					while (this.aClass1_Sub1_Sub4_6.anInt624 < this.anInt961) {
						local341 = this.aClass1_Sub1_Sub4_6.method405();
						this.method709(local341, this.aClass1_Sub1_Sub4_6);
					}
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 193) {
					local341 = this.aClass1_Sub1_Sub4_6.method423();
					local346 = this.aClass1_Sub1_Sub4_6.method423();
					@Pc(1983) String local1983 = this.aClass1_Sub1_Sub4_6.method412();
					if (local341 >= 1 && local341 <= 5) {
						if (local1983.equalsIgnoreCase("null")) {
							local1983 = null;
						}
						this.aStringArray12[local341 - 1] = local1983;
						this.aBooleanArray11[local341 - 1] = local346 == 0;
					}
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 188) {
					local341 = this.aClass1_Sub1_Sub4_6.method408();
					if (local341 >= 0) {
						this.method591(local341);
					}
					if (local341 != this.anInt979) {
						this.method599(this.anInt979);
						this.anInt979 = local341;
					}
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 23) {
					local341 = this.aClass1_Sub1_Sub4_6.method432();
					this.method591(local341);
					if (this.anInt908 != -1) {
						this.method599(this.anInt908);
						this.anInt908 = -1;
						this.aBoolean219 = true;
						this.aBoolean231 = true;
					}
					if (this.anInt999 != -1) {
						this.method599(this.anInt999);
						this.anInt999 = -1;
						this.aBoolean217 = true;
					}
					if (this.anInt866 != -1) {
						this.method599(this.anInt866);
						this.anInt866 = -1;
					}
					if (this.anInt945 != -1) {
						this.method599(this.anInt945);
						this.anInt945 = -1;
					}
					if (this.anInt887 != local341) {
						this.method599(this.anInt887);
						this.anInt887 = local341;
					}
					this.aBoolean206 = false;
					this.aBoolean228 = true;
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 120 || this.anInt962 == 95) {
					local341 = this.anInt854;
					local346 = this.anInt855;
					if (this.anInt962 == 120) {
						local346 = this.aClass1_Sub1_Sub4_6.method434();
						local341 = this.aClass1_Sub1_Sub4_6.method434();
						this.aBoolean235 = false;
					}
					if (this.anInt962 == 95) {
						this.aClass1_Sub1_Sub4_6.method415();
						local351 = 0;
						while (true) {
							if (local351 >= 4) {
								this.aClass1_Sub1_Sub4_6.method417();
								local341 = this.aClass1_Sub1_Sub4_6.method434();
								local346 = this.aClass1_Sub1_Sub4_6.method433();
								this.aBoolean235 = true;
								break;
							}
							for (local381 = 0; local381 < 13; local381++) {
								for (local1455 = 0; local1455 < 13; local1455++) {
									local180 = this.aClass1_Sub1_Sub4_6.method416(1);
									if (local180 == 1) {
										this.anIntArrayArrayArray8[local351][local381][local1455] = this.aClass1_Sub1_Sub4_6.method416(26);
									} else {
										this.anIntArrayArrayArray8[local351][local381][local1455] = -1;
									}
								}
							}
							local351++;
						}
					}
					if (this.anInt854 == local341 && this.anInt855 == local346 && this.anInt931 == 2) {
						this.anInt962 = -1;
						return true;
					}
					this.anInt854 = local341;
					this.anInt855 = local346;
					this.anInt833 = (this.anInt854 - 6) * 8;
					this.anInt834 = (this.anInt855 - 6) * 8;
					this.aBoolean211 = false;
					if ((this.anInt854 / 8 == 48 || this.anInt854 / 8 == 49) && this.anInt855 / 8 == 48) {
						this.aBoolean211 = true;
					}
					if (this.anInt854 / 8 == 48 && this.anInt855 / 8 == 148) {
						this.aBoolean211 = true;
					}
					this.anInt931 = 1;
					this.aLong33 = System.currentTimeMillis();
					this.method602("Loading - please wait.", null);
					if (this.anInt962 == 120) {
						local351 = 0;
						local381 = (this.anInt854 - 6) / 8;
						label1191: while (true) {
							if (local381 > (this.anInt854 + 6) / 8) {
								this.aByteArrayArray5 = new byte[local351][];
								this.aByteArrayArray6 = new byte[local351][];
								this.anIntArray249 = new int[local351];
								this.anIntArray250 = new int[local351];
								this.anIntArray251 = new int[local351];
								local351 = 0;
								local1455 = (this.anInt854 - 6) / 8;
								while (true) {
									if (local1455 > (this.anInt854 + 6) / 8) {
										break label1191;
									}
									for (local180 = (this.anInt855 - 6) / 8; local180 <= (this.anInt855 + 6) / 8; local180++) {
										this.anIntArray249[local351] = (local1455 << 8) + local180;
										if (this.aBoolean211 && (local180 == 49 || local180 == 149 || local180 == 147 || local1455 == 50 || local1455 == 49 && local180 == 47)) {
											this.anIntArray250[local351] = -1;
											this.anIntArray251[local351] = -1;
											local351++;
										} else {
											local406 = this.anIntArray250[local351] = this.aClass4_Sub1_1.method125(0, local1455, local180);
											if (local406 != -1) {
												this.aClass4_Sub1_1.method111(3, local406);
											}
											local1590 = this.anIntArray251[local351] = this.aClass4_Sub1_1.method125(1, local1455, local180);
											if (local1590 != -1) {
												this.aClass4_Sub1_1.method111(3, local1590);
											}
											local351++;
										}
									}
									local1455++;
								}
							}
							for (local1455 = (this.anInt855 - 6) / 8; local1455 <= (this.anInt855 + 6) / 8; local1455++) {
								local351++;
							}
							local381++;
						}
					}
					if (this.anInt962 == 95) {
						local351 = 0;
						@Pc(2540) int[] local2540 = new int[676];
						local1455 = 0;
						label1150: while (true) {
							@Pc(2570) int local2570;
							@Pc(2576) int local2576;
							@Pc(2586) int local2586;
							if (local1455 >= 4) {
								this.aByteArrayArray5 = new byte[local351][];
								this.aByteArrayArray6 = new byte[local351][];
								this.anIntArray249 = new int[local351];
								this.anIntArray250 = new int[local351];
								this.anIntArray251 = new int[local351];
								local180 = 0;
								while (true) {
									if (local180 >= local351) {
										break label1150;
									}
									local406 = this.anIntArray249[local180] = local2540[local180];
									local1590 = local406 >> 8 & 0xFF;
									local2570 = local406 & 0xFF;
									local2576 = this.anIntArray250[local180] = this.aClass4_Sub1_1.method125(0, local1590, local2570);
									if (local2576 != -1) {
										this.aClass4_Sub1_1.method111(3, local2576);
									}
									local2586 = this.anIntArray251[local180] = this.aClass4_Sub1_1.method125(1, local1590, local2570);
									if (local2586 != -1) {
										this.aClass4_Sub1_1.method111(3, local2586);
									}
									local180++;
								}
							}
							for (local180 = 0; local180 < 13; local180++) {
								for (local406 = 0; local406 < 13; local406++) {
									local1590 = this.anIntArrayArrayArray8[local1455][local180][local406];
									if (local1590 != -1) {
										local2570 = local1590 >> 14 & 0x3FF;
										local2576 = local1590 >> 3 & 0x7FF;
										local2586 = (local2570 / 8 << 8) + local2576 / 8;
										for (@Pc(2588) int local2588 = 0; local2588 < local351; local2588++) {
											if (local2540[local2588] == local2586) {
												local2586 = -1;
												break;
											}
										}
										if (local2586 != -1) {
											local2540[local351++] = local2586;
										}
									}
								}
							}
							local1455++;
						}
					}
					local351 = this.anInt833 - this.anInt835;
					local381 = this.anInt834 - this.anInt836;
					this.anInt835 = this.anInt833;
					this.anInt836 = this.anInt834;
					for (local1455 = 0; local1455 < 16384; local1455++) {
						@Pc(2741) Class1_Sub1_Sub1_Sub4_Sub2 local2741 = this.aClass1_Sub1_Sub1_Sub4_Sub2Array1[local1455];
						if (local2741 != null) {
							for (local406 = 0; local406 < 10; local406++) {
								local2741.anIntArray140[local406] -= local351;
								local2741.anIntArray141[local406] -= local381;
							}
							local2741.anInt458 -= local351 * 128;
							local2741.anInt459 -= local381 * 128;
						}
					}
					for (local180 = 0; local180 < this.anInt1022; local180++) {
						@Pc(2796) Class1_Sub1_Sub1_Sub4_Sub1 local2796 = this.aClass1_Sub1_Sub1_Sub4_Sub1Array1[local180];
						if (local2796 != null) {
							for (local1590 = 0; local1590 < 10; local1590++) {
								local2796.anIntArray140[local1590] -= local351;
								local2796.anIntArray141[local1590] -= local381;
							}
							local2796.anInt458 -= local351 * 128;
							local2796.anInt459 -= local381 * 128;
						}
					}
					this.aBoolean212 = true;
					@Pc(2848) byte local2848 = 0;
					@Pc(2850) byte local2850 = 104;
					@Pc(2852) byte local2852 = 1;
					if (local351 < 0) {
						local2848 = 103;
						local2850 = -1;
						local2852 = -1;
					}
					@Pc(2862) byte local2862 = 0;
					@Pc(2864) byte local2864 = 104;
					@Pc(2866) byte local2866 = 1;
					if (local381 < 0) {
						local2862 = 103;
						local2864 = -1;
						local2866 = -1;
					}
					for (@Pc(2876) int local2876 = local2848; local2876 != local2850; local2876 += local2852) {
						for (@Pc(2880) int local2880 = local2862; local2880 != local2864; local2880 += local2866) {
							@Pc(2886) int local2886 = local2876 + local351;
							@Pc(2890) int local2890 = local2880 + local381;
							for (@Pc(2892) int local2892 = 0; local2892 < 4; local2892++) {
								if (local2886 >= 0 && local2890 >= 0 && local2886 < 104 && local2890 < 104) {
									this.aClass8ArrayArrayArray1[local2892][local2876][local2880] = this.aClass8ArrayArrayArray1[local2892][local2886][local2890];
								} else {
									this.aClass8ArrayArrayArray1[local2892][local2876][local2880] = null;
								}
							}
						}
					}
					for (@Pc(2954) Class1_Sub2 local2954 = (Class1_Sub2) this.aClass8_11.method46(); local2954 != null; local2954 = (Class1_Sub2) this.aClass8_11.method48()) {
						local2954.anInt43 -= local351;
						local2954.anInt44 -= local381;
						if (local2954.anInt43 < 0 || local2954.anInt44 < 0 || local2954.anInt43 >= 104 || local2954.anInt44 >= 104) {
							local2954.method551();
						}
					}
					if (this.anInt995 != 0) {
						this.anInt995 -= local351;
						this.anInt996 -= local381;
					}
					this.aBoolean221 = false;
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 4) {
					this.anInt901 = this.aClass1_Sub1_Sub4_6.method423();
					if (this.anInt901 == this.anInt1044) {
						if (this.anInt901 == 3) {
							this.anInt1044 = 1;
						} else {
							this.anInt1044 = 3;
						}
						this.aBoolean219 = true;
					}
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 250) {
					local341 = this.aClass1_Sub1_Sub4_6.method408();
					if (local341 != this.anInt983) {
						this.method599(this.anInt983);
						this.anInt983 = local341;
					}
					this.aBoolean228 = true;
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 232) {
					local341 = this.aClass1_Sub1_Sub4_6.method432();
					this.method591(local341);
					if (this.anInt887 != -1) {
						this.method599(this.anInt887);
						this.anInt887 = -1;
						this.aBoolean228 = true;
					}
					if (this.anInt999 != -1) {
						this.method599(this.anInt999);
						this.anInt999 = -1;
						this.aBoolean217 = true;
					}
					if (this.anInt866 != -1) {
						this.method599(this.anInt866);
						this.anInt866 = -1;
					}
					if (this.anInt945 != -1) {
						this.method599(this.anInt945);
						this.anInt945 = -1;
					}
					if (this.anInt908 != local341) {
						this.method599(this.anInt908);
						this.anInt908 = local341;
					}
					if (this.anInt988 != 0) {
						this.anInt988 = 0;
						this.aBoolean228 = true;
					}
					this.aBoolean219 = true;
					this.aBoolean231 = true;
					this.aBoolean206 = false;
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 224) {
					if (this.anInt1044 == 12) {
						this.aBoolean219 = true;
					}
					this.anInt986 = this.aClass1_Sub1_Sub4_6.method408();
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 89) {
					this.method699(this.anInt961, this.aClass1_Sub1_Sub4_6);
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 57) {
					this.anInt824 = this.aClass1_Sub1_Sub4_6.method405();
					this.anInt840 = this.aClass1_Sub1_Sub4_6.method405();
					this.anInt874 = this.aClass1_Sub1_Sub4_6.method405();
					this.aBoolean220 = true;
					this.aBoolean228 = true;
					this.anInt962 = -1;
					return true;
				}
				@Pc(3261) Class24 local3261;
				if (this.anInt962 == 234) {
					this.aBoolean219 = true;
					local341 = this.aClass1_Sub1_Sub4_6.method407();
					local3261 = Class24.method230(local341);
					while (this.aClass1_Sub1_Sub4_6.anInt624 < this.anInt961) {
						local351 = this.aClass1_Sub1_Sub4_6.method419();
						local381 = this.aClass1_Sub1_Sub4_6.method407();
						local1455 = this.aClass1_Sub1_Sub4_6.method405();
						if (local1455 == 255) {
							local1455 = this.aClass1_Sub1_Sub4_6.method410();
						}
						if (local351 >= 0 && local351 < local3261.anIntArray125.length) {
							local3261.anIntArray125[local351] = local381;
							local3261.anIntArray124[local351] = local1455;
						}
					}
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 141) {
					this.anInt877 = this.aClass1_Sub1_Sub4_6.method433() * 30;
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 75) {
					this.aBoolean219 = true;
					local341 = this.aClass1_Sub1_Sub4_6.method407();
					local3261 = Class24.method230(local341);
					local351 = this.aClass1_Sub1_Sub4_6.method407();
					for (local381 = 0; local381 < local351; local381++) {
						local1455 = this.aClass1_Sub1_Sub4_6.method425(this.anInt1045);
						if (local1455 == 255) {
							local1455 = this.aClass1_Sub1_Sub4_6.method438();
						}
						local3261.anIntArray125[local381] = this.aClass1_Sub1_Sub4_6.method434();
						local3261.anIntArray124[local381] = local1455;
					}
					for (local1455 = local351; local1455 < local3261.anIntArray125.length; local1455++) {
						local3261.anIntArray125[local1455] = 0;
						local3261.anIntArray124[local1455] = 0;
					}
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 205) {
					this.anInt929 = this.anInt961 / 8;
					for (local341 = 0; local341 < this.anInt929; local341++) {
						this.aLongArray3[local341] = this.aClass1_Sub1_Sub4_6.method411();
					}
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 161) {
					local341 = this.aClass1_Sub1_Sub4_6.method407();
					local346 = this.aClass1_Sub1_Sub4_6.method407();
					local351 = local346 >> 10 & 0x1F;
					local381 = local346 >> 5 & 0x1F;
					local1455 = local346 & 0x1F;
					Class24.method230(local341).anInt356 = (local351 << 19) + (local381 << 11) + (local1455 << 3);
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 149) {
					this.anInt978 = this.aClass1_Sub1_Sub4_6.method405();
					this.aBoolean219 = true;
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 221) {
					this.anInt891 = this.aClass1_Sub1_Sub4_6.method423();
					this.anInt892 = this.aClass1_Sub1_Sub4_6.method425(this.anInt1045);
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 199) {
					this.aBoolean221 = true;
					this.anInt849 = this.aClass1_Sub1_Sub4_6.method405();
					this.anInt850 = this.aClass1_Sub1_Sub4_6.method405();
					this.anInt851 = this.aClass1_Sub1_Sub4_6.method407();
					this.anInt852 = this.aClass1_Sub1_Sub4_6.method405();
					this.anInt853 = this.aClass1_Sub1_Sub4_6.method405();
					if (this.anInt853 >= 100) {
						local341 = this.anInt849 * 128 + 64;
						local346 = this.anInt850 * 128 + 64;
						local351 = this.method666(local341, local346, this.anInt934) - this.anInt851;
						local381 = local341 - this.anInt896;
						local1455 = local351 - this.anInt897;
						local180 = local346 - this.anInt898;
						local406 = (int) Math.sqrt((double) (local381 * local381 + local180 * local180));
						this.anInt899 = (int) (Math.atan2((double) local1455, (double) local406) * 325.949D) & 0x7FF;
						this.anInt900 = (int) (Math.atan2((double) local381, (double) local180) * -325.949D) & 0x7FF;
						if (this.anInt899 < 128) {
							this.anInt899 = 128;
						}
						if (this.anInt899 > 383) {
							this.anInt899 = 383;
						}
					}
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 203) {
					local341 = this.aClass1_Sub1_Sub4_6.method434();
					local346 = this.aClass1_Sub1_Sub4_6.method407();
					this.method591(local341);
					if (local346 != -1) {
						this.method591(local346);
					}
					if (this.anInt945 != -1) {
						this.method599(this.anInt945);
						this.anInt945 = -1;
					}
					if (this.anInt908 != -1) {
						this.method599(this.anInt908);
						this.anInt908 = -1;
					}
					if (this.anInt887 != -1) {
						this.method599(this.anInt887);
						this.anInt887 = -1;
					}
					if (this.anInt999 != local341) {
						this.method599(this.anInt999);
						this.anInt999 = local341;
					}
					if (this.anInt866 != local341) {
						this.method599(this.anInt866);
						this.anInt866 = local346;
					}
					this.anInt988 = 0;
					this.aBoolean206 = false;
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 62) {
					local341 = this.aClass1_Sub1_Sub4_6.method407();
					@Pc(3767) boolean local3767 = this.aClass1_Sub1_Sub4_6.method425(this.anInt1045) == 1;
					Class24.method230(local341).aBoolean69 = local3767;
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 17) {
					this.anInt883 = this.aClass1_Sub1_Sub4_6.method405();
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 9) {
					for (local341 = 0; local341 < this.aClass1_Sub1_Sub1_Sub4_Sub1Array1.length; local341++) {
						if (this.aClass1_Sub1_Sub1_Sub4_Sub1Array1[local341] != null) {
							this.aClass1_Sub1_Sub1_Sub4_Sub1Array1[local341].anInt491 = -1;
						}
					}
					for (local346 = 0; local346 < this.aClass1_Sub1_Sub1_Sub4_Sub2Array1.length; local346++) {
						if (this.aClass1_Sub1_Sub1_Sub4_Sub2Array1[local346] != null) {
							this.aClass1_Sub1_Sub1_Sub4_Sub2Array1[local346].anInt491 = -1;
						}
					}
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 154) {
					this.aBoolean221 = false;
					for (local341 = 0; local341 < 5; local341++) {
						this.aBooleanArray12[local341] = false;
					}
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 228) {
					local341 = this.aClass1_Sub1_Sub4_6.method423();
					local346 = this.aClass1_Sub1_Sub4_6.method407();
					if (local346 == 65535) {
						local346 = -1;
					}
					if (this.anIntArray275[local341] != local346) {
						this.method599(this.anIntArray275[local341]);
						this.anIntArray275[local341] = local346;
					}
					this.aBoolean219 = true;
					this.aBoolean231 = true;
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 15) {
					this.anInt936 = this.aClass1_Sub1_Sub4_6.method405();
					if (this.anInt936 == 1) {
						this.anInt880 = this.aClass1_Sub1_Sub4_6.method407();
					}
					if (this.anInt936 >= 2 && this.anInt936 <= 6) {
						if (this.anInt936 == 2) {
							this.anInt1013 = 64;
							this.anInt1014 = 64;
						}
						if (this.anInt936 == 3) {
							this.anInt1013 = 0;
							this.anInt1014 = 64;
						}
						if (this.anInt936 == 4) {
							this.anInt1013 = 128;
							this.anInt1014 = 64;
						}
						if (this.anInt936 == 5) {
							this.anInt1013 = 64;
							this.anInt1014 = 0;
						}
						if (this.anInt936 == 6) {
							this.anInt1013 = 64;
							this.anInt1014 = 128;
						}
						this.anInt936 = 2;
						this.anInt1010 = this.aClass1_Sub1_Sub4_6.method407();
						this.anInt1011 = this.aClass1_Sub1_Sub4_6.method407();
						this.anInt1012 = this.aClass1_Sub1_Sub4_6.method405();
					}
					if (this.anInt936 == 10) {
						this.anInt1028 = this.aClass1_Sub1_Sub4_6.method407();
					}
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 220) {
					local341 = this.aClass1_Sub1_Sub4_6.method407();
					@Pc(4033) byte local4033 = this.aClass1_Sub1_Sub4_6.method406();
					this.anIntArray258[local341] = local4033;
					if (this.anIntArray231[local341] != local4033) {
						this.anIntArray231[local341] = local4033;
						this.method611(local341);
						this.aBoolean219 = true;
						if (this.anInt983 != -1) {
							this.aBoolean228 = true;
						}
					}
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 140) {
					this.anInt892 = this.aClass1_Sub1_Sub4_6.method405();
					this.anInt891 = this.aClass1_Sub1_Sub4_6.method425(this.anInt1045);
					for (local341 = this.anInt891; local341 < this.anInt891 + 8; local341++) {
						for (local346 = this.anInt892; local346 < this.anInt892 + 8; local346++) {
							if (this.aClass8ArrayArrayArray1[this.anInt934][local341][local346] != null) {
								this.aClass8ArrayArrayArray1[this.anInt934][local341][local346] = null;
								this.method640(local341, local346);
							}
						}
					}
					for (@Pc(4137) Class1_Sub2 local4137 = (Class1_Sub2) this.aClass8_11.method46(); local4137 != null; local4137 = (Class1_Sub2) this.aClass8_11.method48()) {
						if (local4137.anInt43 >= this.anInt891 && local4137.anInt43 < this.anInt891 + 8 && local4137.anInt44 >= this.anInt892 && local4137.anInt44 < this.anInt892 + 8 && local4137.anInt41 == this.anInt934) {
							local4137.anInt52 = 0;
						}
					}
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 121) {
					local341 = this.aClass1_Sub1_Sub4_6.method436();
					local346 = this.aClass1_Sub1_Sub4_6.method433();
					local351 = this.aClass1_Sub1_Sub4_6.method435();
					@Pc(4206) Class24 local4206 = Class24.method230(local346);
					local4206.anInt374 = local351;
					local4206.anInt367 = local341;
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 170) {
					this.method702(this.aByte33, this.aClass1_Sub1_Sub4_6, this.anInt961);
					this.aBoolean212 = false;
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 126) {
					local341 = this.aClass1_Sub1_Sub4_6.method433();
					local3261 = Class24.method230(local341);
					for (local351 = 0; local351 < local3261.anIntArray125.length; local351++) {
						local3261.anIntArray125[local351] = -1;
						local3261.anIntArray125[local351] = 0;
					}
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 194) {
					local341 = this.aClass1_Sub1_Sub4_6.method407();
					local346 = this.aClass1_Sub1_Sub4_6.method434();
					Class24.method230(local346).anInt385 = 2;
					Class24.method230(local346).anInt386 = local341;
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 68) {
					this.method601();
					this.anInt962 = -1;
					return false;
				}
				if (this.anInt962 == 80 || this.anInt962 == 200 || this.anInt962 == 243 || this.anInt962 == 34 || this.anInt962 == 129 || this.anInt962 == 99 || this.anInt962 == 189 || this.anInt962 == 247 || this.anInt962 == 157 || this.anInt962 == 144 || this.anInt962 == 26) {
					this.method709(this.anInt962, this.aClass1_Sub1_Sub4_6);
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 139) {
					local341 = this.aClass1_Sub1_Sub4_6.method433();
					local346 = this.aClass1_Sub1_Sub4_6.method432();
					local1904 = Class24.method230(local341);
					if (local1904 != null && local1904.anInt364 == 0) {
						if (local346 < 0) {
							local346 = 0;
						}
						if (local346 > local1904.anInt368 - local1904.anInt352) {
							local346 = local1904.anInt368 - local1904.anInt352;
						}
						local1904.anInt377 = local346;
					}
					this.anInt962 = -1;
					return true;
				}
				if (this.anInt962 == 59) {
					this.aBoolean221 = true;
					this.anInt972 = this.aClass1_Sub1_Sub4_6.method405();
					this.anInt973 = this.aClass1_Sub1_Sub4_6.method405();
					this.anInt974 = this.aClass1_Sub1_Sub4_6.method407();
					this.anInt975 = this.aClass1_Sub1_Sub4_6.method405();
					this.anInt976 = this.aClass1_Sub1_Sub4_6.method405();
					if (this.anInt976 >= 100) {
						this.anInt896 = this.anInt972 * 128 + 64;
						this.anInt898 = this.anInt973 * 128 + 64;
						this.anInt897 = this.method666(this.anInt896, this.anInt898, this.anInt934) - this.anInt974;
					}
					this.anInt962 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt962 + "," + this.anInt961 + " - " + this.anInt1048 + "," + this.anInt1049);
				this.method601();
			} catch (@Pc(4515) IOException local4515) {
				this.method616();
			} catch (@Pc(4520) Exception local4520) {
				local162 = "T2 - " + this.anInt962 + "," + this.anInt1048 + "," + this.anInt1049 + " - " + this.anInt961 + "," + (this.anInt833 + aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0]) + "," + (this.anInt834 + aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0]) + " - ";
				for (local346 = 0; local346 < this.anInt961 && local346 < 50; local346++) {
					local162 = local162 + this.aClass1_Sub1_Sub4_6.aByteArray16[local346] + ",";
				}
				signlink.reporterror(local162);
				this.method601();
			}
			return true;
		} catch (@Pc(4601) RuntimeException local4601) {
			signlink.reporterror("53320, " + false + ", " + local4601.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	private void method685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(1) Class1_Sub2 local1 = null;
			for (@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) this.aClass8_11.method46(); local6 != null; local6 = (Class1_Sub2) this.aClass8_11.method48()) {
				if (local6.anInt41 == arg5 && local6.anInt43 == arg6 && local6.anInt44 == arg7 && local6.anInt42 == arg2) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class1_Sub2();
				local1.anInt41 = arg5;
				local1.anInt42 = arg2;
				local1.anInt43 = arg6;
				local1.anInt44 = arg7;
				this.method721(local1);
				this.aClass8_11.method43(local1);
			}
			local1.anInt45 = arg8;
			local1.anInt47 = arg3;
			local1.anInt46 = arg1;
			local1.anInt51 = arg4;
			local1.anInt52 = arg0;
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("8475, " + arg0 + ", " + arg1 + ", " + -233 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method686() {
		try {
			if (this.anInt1009 != 0) {
				@Pc(5) int local5 = 0;
				if (this.anInt877 != 0) {
					local5 = 1;
				}
				for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
					if (this.aStringArray11[local12] != null) {
						@Pc(24) int local24 = this.anIntArray238[local12];
						@Pc(29) String local29 = this.aStringArray10[local12];
						if (local29 != null && local29.startsWith("@cr1@")) {
							local29 = local29.substring(5);
						}
						if (local29 != null && local29.startsWith("@cr2@")) {
							local29 = local29.substring(5);
						}
						if ((local24 == 3 || local24 == 7) && (local24 == 7 || this.anInt840 == 0 || this.anInt840 == 1 && this.method589(local29))) {
							@Pc(82) int local82 = 329 - local5 * 13;
							if (super.anInt813 > 4 && super.anInt814 - 4 > local82 - 10 && super.anInt814 - 4 <= local82 + 3) {
								@Pc(121) int local121 = this.aClass1_Sub1_Sub2_Sub2_3.method277("From:  " + local29 + this.aStringArray11[local12]) + 25;
								if (local121 > 450) {
									local121 = 450;
								}
								if (super.anInt813 < local121 + 4) {
									if (this.anInt838 >= 1) {
										this.aStringArray13[this.anInt1005] = "Report abuse @whi@" + local29;
										this.anIntArray242[this.anInt1005] = 2591;
										this.anInt1005++;
									}
									this.aStringArray13[this.anInt1005] = "Add ignore @whi@" + local29;
									this.anIntArray242[this.anInt1005] = 2673;
									this.anInt1005++;
									this.aStringArray13[this.anInt1005] = "Add friend @whi@" + local29;
									this.anIntArray242[this.anInt1005] = 2839;
									this.anInt1005++;
								}
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local24 == 5 || local24 == 6) && this.anInt840 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
				this.anInt961 += 0;
			}
		} catch (@Pc(240) RuntimeException local240) {
			signlink.reporterror("60383, " + 0 + ", " + local240.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method687() {
		try {
			if (this.anInt877 > 1) {
				this.anInt877--;
			}
			if (this.anInt965 > 0) {
				this.anInt965--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method684(); local22++) {
			}
			if (this.aBoolean213) {
				@Pc(41) Object local41 = this.aClass14_1.anObject1;
				@Pc(66) int local66;
				@Pc(68) int local68;
				@Pc(70) int local70;
				@Pc(103) int local103;
				synchronized (this.aClass14_1.anObject1) {
					if (!aBoolean203) {
						this.aClass14_1.anInt195 = 0;
					} else if (super.anInt818 != 0 || this.aClass14_1.anInt195 >= 40) {
						this.aClass1_Sub1_Sub4_8.method394(51);
						this.aClass1_Sub1_Sub4_8.method395(0);
						local66 = this.aClass1_Sub1_Sub4_8.anInt624;
						local68 = 0;
						@Pc(86) int local86;
						for (local70 = 0; local70 < this.aClass14_1.anInt195 && local66 - this.aClass1_Sub1_Sub4_8.anInt624 < 240; local70++) {
							local68++;
							local86 = this.aClass14_1.anIntArray94[local70];
							if (local86 < 0) {
								local86 = 0;
							} else if (local86 > 502) {
								local86 = 502;
							}
							local103 = this.aClass14_1.anIntArray95[local70];
							if (local103 < 0) {
								local103 = 0;
							} else if (local103 > 764) {
								local103 = 764;
							}
							@Pc(120) int local120 = local86 * 765 + local103;
							if (this.aClass14_1.anIntArray94[local70] == -1 && this.aClass14_1.anIntArray95[local70] == -1) {
								local103 = -1;
								local86 = -1;
								local120 = 524287;
							}
							if (local103 != this.anInt863 || local86 != this.anInt864) {
								@Pc(165) int local165 = local103 - this.anInt863;
								this.anInt863 = local103;
								@Pc(173) int local173 = local86 - this.anInt864;
								this.anInt864 = local86;
								if (this.anInt943 < 8 && local165 >= -32 && local165 <= 31 && local173 >= -32 && local173 <= 31) {
									local165 += 32;
									local173 += 32;
									this.aClass1_Sub1_Sub4_8.method396((this.anInt943 << 12) + (local165 << 6) + local173);
									this.anInt943 = 0;
								} else if (this.anInt943 < 8) {
									this.aClass1_Sub1_Sub4_8.method398((this.anInt943 << 19) + local120 + 8388608);
									this.anInt943 = 0;
								} else {
									this.aClass1_Sub1_Sub4_8.method399((this.anInt943 << 19) + local120 - 1073741824);
									this.anInt943 = 0;
								}
							} else if (this.anInt943 < 2047) {
								this.anInt943++;
							}
						}
						this.aClass1_Sub1_Sub4_8.method404(this.aClass1_Sub1_Sub4_8.anInt624 - local66);
						if (local68 >= this.aClass14_1.anInt195) {
							this.aClass14_1.anInt195 = 0;
						} else {
							this.aClass14_1.anInt195 -= local68;
							for (local86 = 0; local86 < this.aClass14_1.anInt195; local86++) {
								this.aClass14_1.anIntArray95[local86] = this.aClass14_1.anIntArray95[local86 + local68];
								this.aClass14_1.anIntArray94[local86] = this.aClass14_1.anIntArray94[local86 + local68];
							}
						}
					}
				}
				if (super.anInt818 != 0) {
					@Pc(336) long local336 = (super.aLong28 - this.aLong32) / 50L;
					if (local336 > 4095L) {
						local336 = 4095L;
					}
					this.aLong32 = super.aLong28;
					local66 = super.anInt820;
					if (local66 < 0) {
						local66 = 0;
					} else if (local66 > 502) {
						local66 = 502;
					}
					local68 = super.anInt819;
					if (local68 < 0) {
						local68 = 0;
					} else if (local68 > 764) {
						local68 = 764;
					}
					local70 = local66 * 765 + local68;
					@Pc(382) byte local382 = 0;
					if (super.anInt818 == 2) {
						local382 = 1;
					}
					local103 = (int) local336;
					this.aClass1_Sub1_Sub4_8.method394(27);
					this.aClass1_Sub1_Sub4_8.method399((local103 << 20) + (local382 << 19) + local70);
				}
				if (this.anInt928 > 0) {
					this.anInt928--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean210 = true;
				}
				if (this.aBoolean210 && this.anInt928 <= 0) {
					this.anInt928 = 20;
					this.aBoolean210 = false;
					this.aClass1_Sub1_Sub4_8.method394(166);
					this.aClass1_Sub1_Sub4_8.method431(this.anInt919);
					this.aClass1_Sub1_Sub4_8.method430(this.anInt918);
				}
				if (super.aBoolean193 && !this.aBoolean196) {
					this.aBoolean196 = true;
					this.aClass1_Sub1_Sub4_8.method394(111);
					this.aClass1_Sub1_Sub4_8.method395(1);
				}
				if (!super.aBoolean193 && this.aBoolean196) {
					this.aBoolean196 = false;
					this.aClass1_Sub1_Sub4_8.method394(111);
					this.aClass1_Sub1_Sub4_8.method395(0);
				}
				this.method715();
				this.method717();
				this.method647();
				this.anInt963++;
				if (this.anInt963 > 750) {
					this.method616();
				}
				this.method656();
				this.method672();
				this.method700();
				this.anInt944++;
				if (this.anInt952 != 0) {
					this.anInt951 += 20;
					if (this.anInt951 >= 400) {
						this.anInt952 = 0;
					}
				}
				if (this.anInt829 != 0) {
					this.anInt826++;
					if (this.anInt826 >= 15) {
						if (this.anInt829 == 2) {
							this.aBoolean219 = true;
						}
						if (this.anInt829 == 3) {
							this.aBoolean228 = true;
						}
						this.anInt829 = 0;
					}
				}
				if (this.anInt939 != 0) {
					this.anInt1018++;
					if (super.anInt813 > this.anInt940 + 5 || super.anInt813 < this.anInt940 - 5 || super.anInt814 > this.anInt941 + 5 || super.anInt814 < this.anInt941 - 5) {
						this.aBoolean204 = true;
					}
					if (super.anInt812 == 0) {
						if (this.anInt939 == 2) {
							this.aBoolean219 = true;
						}
						if (this.anInt939 == 3) {
							this.aBoolean228 = true;
						}
						this.anInt939 = 0;
						if (this.aBoolean204 && this.anInt1018 >= 5) {
							this.anInt923 = -1;
							this.method654();
							if (this.anInt923 == this.anInt937 && this.anInt922 != this.anInt938) {
								@Pc(683) Class24 local683 = Class24.method230(this.anInt937);
								@Pc(685) byte local685 = 0;
								if (this.anInt830 == 1 && local683.anInt359 == 206) {
									local685 = 1;
								}
								if (local683.anIntArray125[this.anInt922] <= 0) {
									local685 = 0;
								}
								if (local683.aBoolean71) {
									local66 = this.anInt938;
									local68 = this.anInt922;
									local683.anIntArray125[local68] = local683.anIntArray125[local66];
									local683.anIntArray124[local68] = local683.anIntArray124[local66];
									local683.anIntArray125[local66] = -1;
									local683.anIntArray124[local66] = 0;
								} else if (local685 == 1) {
									local66 = this.anInt938;
									local68 = this.anInt922;
									while (local66 != local68) {
										if (local66 > local68) {
											local683.method231(local66 - 1, local66);
											local66--;
										} else if (local66 < local68) {
											local683.method231(local66 + 1, local66);
											local66++;
										}
									}
								} else {
									local683.method231(this.anInt922, this.anInt938);
								}
								this.aClass1_Sub1_Sub4_8.method394(21);
								this.aClass1_Sub1_Sub4_8.method396(this.anInt937);
								this.aClass1_Sub1_Sub4_8.method396(this.anInt938);
								this.aClass1_Sub1_Sub4_8.method395(local685);
								this.aClass1_Sub1_Sub4_8.method429(this.anInt922);
							}
						} else if ((this.anInt992 == 1 || this.method623(this.anInt1005 - 1)) && this.anInt1005 > 2) {
							this.method586();
						} else if (this.anInt1005 > 0) {
							this.method710(this.anInt1005 - 1);
						}
						this.anInt826 = 10;
						super.anInt818 = 0;
					}
				}
				@Pc(856) int local856;
				@Pc(858) int local858;
				if (Class10.anInt121 != -1) {
					local856 = Class10.anInt121;
					local858 = Class10.anInt122;
					@Pc(879) boolean local879 = this.method661(0, 0, 0, 0, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0], 0, true, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0], 0, local858, local856);
					Class10.anInt121 = -1;
					if (local879) {
						this.anInt949 = super.anInt819;
						this.anInt950 = super.anInt820;
						this.anInt952 = 1;
						this.anInt951 = 0;
					}
				}
				if (super.anInt818 == 1 && this.aString27 != null) {
					this.aString27 = null;
					this.aBoolean228 = true;
					super.anInt818 = 0;
				}
				this.method634();
				if (this.anInt999 == -1) {
					this.method659();
					this.method690();
					this.method587(187);
				}
				if (super.anInt812 == 1 || super.anInt818 == 1) {
					this.anInt1000++;
				}
				if (this.anInt947 == 0 && this.anInt902 == 0 && this.anInt1040 == 0) {
					if (this.anInt985 > 0) {
						this.anInt985--;
					}
				} else if (this.anInt985 < 100) {
					this.anInt985++;
					if (this.anInt985 == 100) {
						if (this.anInt947 != 0) {
							this.aBoolean228 = true;
						}
						if (this.anInt902 != 0) {
							this.aBoolean219 = true;
						}
					}
				}
				if (this.anInt931 == 2) {
					this.method655(847);
				}
				if (this.anInt931 == 2 && this.aBoolean221) {
					this.method633();
				}
				for (local856 = 0; local856 < 5; local856++) {
					@Pc(1015) int local1015 = this.anIntArray256[local856]++;
				}
				this.method612();
				anInt1033++;
				if (anInt1033 > 1804) {
					anInt1033 = 0;
					this.aClass1_Sub1_Sub4_8.method394(69);
					this.aClass1_Sub1_Sub4_8.method395(0);
					local858 = this.aClass1_Sub1_Sub4_8.anInt624;
					this.aClass1_Sub1_Sub4_8.method395((int) (Math.random() * 256.0D));
					this.aClass1_Sub1_Sub4_8.method395(212);
					this.aClass1_Sub1_Sub4_8.method396(25280);
					this.aClass1_Sub1_Sub4_8.method396((int) (Math.random() * 65536.0D));
					this.aClass1_Sub1_Sub4_8.method396((int) (Math.random() * 65536.0D));
					this.aClass1_Sub1_Sub4_8.method395((int) (Math.random() * 256.0D));
					this.aClass1_Sub1_Sub4_8.method395(181);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub4_8.method395(149);
					}
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub4_8.method395(90);
					}
					this.aClass1_Sub1_Sub4_8.method396((int) (Math.random() * 65536.0D));
					this.aClass1_Sub1_Sub4_8.method404(this.aClass1_Sub1_Sub4_8.anInt624 - local858);
				}
				super.anInt811++;
				if (super.anInt811 > 4500) {
					this.anInt965 = 250;
					super.anInt811 -= 500;
					this.aClass1_Sub1_Sub4_8.method394(244);
				}
				this.anInt884++;
				if (this.anInt884 > 500) {
					this.anInt884 = 0;
					local858 = (int) (Math.random() * 8.0D);
					if ((local858 & 0x1) == 1) {
						this.anInt916 += this.anInt917;
					}
					if ((local858 & 0x2) == 2) {
						this.anInt888 += this.anInt889;
					}
					if ((local858 & 0x4) == 4) {
						this.anInt858 += this.anInt859;
					}
				}
				if (this.anInt916 < -50) {
					this.anInt917 = 2;
				}
				if (this.anInt916 > 50) {
					this.anInt917 = -2;
				}
				if (this.anInt888 < -55) {
					this.anInt889 = 2;
				}
				if (this.anInt888 > 55) {
					this.anInt889 = -2;
				}
				if (this.anInt858 < -40) {
					this.anInt859 = 1;
				}
				if (this.anInt858 > 40) {
					this.anInt859 = -1;
				}
				this.anInt982++;
				if (this.anInt982 > 500) {
					this.anInt982 = 0;
					local858 = (int) (Math.random() * 8.0D);
					if ((local858 & 0x1) == 1) {
						this.anInt911 += this.anInt912;
					}
					if ((local858 & 0x2) == 2) {
						this.anInt860 += this.anInt861;
					}
				}
				if (this.anInt911 < -60) {
					this.anInt912 = 2;
				}
				if (this.anInt911 > 60) {
					this.anInt912 = -2;
				}
				if (this.anInt860 < -20) {
					this.anInt861 = 1;
				}
				if (this.anInt860 > 10) {
					this.anInt861 = -1;
				}
				anInt868++;
				if (anInt868 > 1148) {
					anInt868 = 0;
					this.aClass1_Sub1_Sub4_8.method394(206);
					this.aClass1_Sub1_Sub4_8.method395(0);
					local858 = this.aClass1_Sub1_Sub4_8.anInt624;
					this.aClass1_Sub1_Sub4_8.method396((int) (Math.random() * 65536.0D));
					this.aClass1_Sub1_Sub4_8.method395(252);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub4_8.method396(62952);
					}
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub4_8.method395(24);
					}
					this.aClass1_Sub1_Sub4_8.method395((int) (Math.random() * 256.0D));
					this.aClass1_Sub1_Sub4_8.method395(178);
					this.aClass1_Sub1_Sub4_8.method396(7452);
					this.aClass1_Sub1_Sub4_8.method395(12);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub4_8.method396(44881);
					}
					this.aClass1_Sub1_Sub4_8.method395(10);
					this.aClass1_Sub1_Sub4_8.method404(this.aClass1_Sub1_Sub4_8.anInt624 - local858);
				}
				this.anInt964++;
				if (this.anInt964 > 50) {
					this.aClass1_Sub1_Sub4_8.method394(89);
				}
				try {
					if (this.aClass31_1 != null && this.aClass1_Sub1_Sub4_8.anInt624 > 0) {
						this.aClass31_1.method339(this.aClass1_Sub1_Sub4_8.anInt624, this.aClass1_Sub1_Sub4_8.aByteArray16);
						this.aClass1_Sub1_Sub4_8.anInt624 = 0;
						this.anInt964 = 0;
					}
				} catch (@Pc(1452) IOException local1452) {
					this.method616();
				} catch (@Pc(1457) Exception local1457) {
					this.method601();
				}
			}
		} catch (@Pc(1462) RuntimeException local1462) {
			signlink.reporterror("73554, " + -236 + ", " + local1462.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIB)Z")
	private boolean method688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			@Pc(7) int local7 = arg2 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass10_1.method84(this.anInt934, arg0, arg1, arg2);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(43) Class32 local43 = Class32.method345(local7);
				@Pc(51) int local51;
				@Pc(54) int local54;
				if (local31 == 0 || local31 == 2) {
					local51 = local43.anInt543;
					local54 = local43.anInt547;
				} else {
					local51 = local43.anInt547;
					local54 = local43.anInt543;
				}
				@Pc(65) int local65 = local43.anInt549;
				if (local31 != 0) {
					local65 = (local65 << local31 & 0xF) + (local65 >> 4 - local31);
				}
				this.method661(0, local54, local65, 0, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0], 2, true, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0], local51, arg1, arg0);
			} else {
				this.method661(local31, 0, 0, local25 + 1, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0], 2, true, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0], 0, arg1, arg0);
			}
			this.anInt949 = super.anInt819;
			@Pc(134) boolean local134 = false;
			this.anInt950 = super.anInt820;
			this.anInt952 = 2;
			this.anInt951 = 0;
			return true;
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("55043, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method689() {
		try {
			while (true) {
				@Pc(11) Class1_Sub1_Sub3 local11 = this.aClass4_Sub1_1.method127();
				if (local11 == null) {
					return;
				}
				if (local11.anInt351 == 0) {
					Class1_Sub1_Sub1_Sub3.method145(local11.aByteArray6, local11.anInt349);
					if ((this.aClass4_Sub1_1.method114(local11.anInt349) & 0x62) != 0) {
						this.aBoolean219 = true;
						if (this.anInt887 != -1 || this.anInt983 != -1) {
							this.aBoolean228 = true;
						}
					}
				}
				if (local11.anInt351 == 1 && local11.aByteArray6 != null) {
					Class30.method331(local11.aByteArray6);
				}
				if (local11.anInt351 == 2 && local11.anInt349 == this.anInt1001 && local11.aByteArray6 != null) {
					this.method707(local11.aByteArray6, this.aBoolean223);
				}
				if (local11.anInt351 == 3 && this.anInt931 == 1) {
					for (@Pc(86) int local86 = 0; local86 < this.aByteArrayArray5.length; local86++) {
						if (this.anIntArray250[local86] == local11.anInt349) {
							this.aByteArrayArray5[local86] = local11.aByteArray6;
							if (local11.aByteArray6 == null) {
								this.anIntArray250[local86] = -1;
							}
							break;
						}
						if (this.anIntArray251[local86] == local11.anInt349) {
							this.aByteArrayArray6[local86] = local11.aByteArray6;
							if (local11.aByteArray6 == null) {
								this.anIntArray251[local86] = -1;
							}
							break;
						}
					}
				}
				if (local11.anInt351 == 93 && this.aClass4_Sub1_1.method129(local11.anInt349)) {
					Class45.method528(new Class1_Sub1_Sub4(local11.aByteArray6, true), this.aClass4_Sub1_1);
				}
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("75839, " + 108 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method690() {
		try {
			if (super.anInt818 == 1) {
				if (super.anInt819 >= 539 && super.anInt819 <= 573 && super.anInt820 >= 169 && super.anInt820 < 205 && this.anIntArray275[0] != -1) {
					this.aBoolean219 = true;
					this.anInt1044 = 0;
					this.aBoolean231 = true;
				}
				if (super.anInt819 >= 569 && super.anInt819 <= 599 && super.anInt820 >= 168 && super.anInt820 < 205 && this.anIntArray275[1] != -1) {
					this.aBoolean219 = true;
					this.anInt1044 = 1;
					this.aBoolean231 = true;
				}
				if (super.anInt819 >= 597 && super.anInt819 <= 627 && super.anInt820 >= 168 && super.anInt820 < 205 && this.anIntArray275[2] != -1) {
					this.aBoolean219 = true;
					this.anInt1044 = 2;
					this.aBoolean231 = true;
				}
				if (super.anInt819 >= 625 && super.anInt819 <= 669 && super.anInt820 >= 168 && super.anInt820 < 203 && this.anIntArray275[3] != -1) {
					this.aBoolean219 = true;
					this.anInt1044 = 3;
					this.aBoolean231 = true;
				}
				if (super.anInt819 >= 666 && super.anInt819 <= 696 && super.anInt820 >= 168 && super.anInt820 < 205 && this.anIntArray275[4] != -1) {
					this.aBoolean219 = true;
					this.anInt1044 = 4;
					this.aBoolean231 = true;
				}
				if (super.anInt819 >= 694 && super.anInt819 <= 724 && super.anInt820 >= 168 && super.anInt820 < 205 && this.anIntArray275[5] != -1) {
					this.aBoolean219 = true;
					this.anInt1044 = 5;
					this.aBoolean231 = true;
				}
				if (super.anInt819 >= 722 && super.anInt819 <= 756 && super.anInt820 >= 169 && super.anInt820 < 205 && this.anIntArray275[6] != -1) {
					this.aBoolean219 = true;
					this.anInt1044 = 6;
					this.aBoolean231 = true;
				}
				if (super.anInt819 >= 540 && super.anInt819 <= 574 && super.anInt820 >= 466 && super.anInt820 < 502 && this.anIntArray275[7] != -1) {
					this.aBoolean219 = true;
					this.anInt1044 = 7;
					this.aBoolean231 = true;
				}
				if (super.anInt819 >= 572 && super.anInt819 <= 602 && super.anInt820 >= 466 && super.anInt820 < 503 && this.anIntArray275[8] != -1) {
					this.aBoolean219 = true;
					this.anInt1044 = 8;
					this.aBoolean231 = true;
				}
				if (super.anInt819 >= 599 && super.anInt819 <= 629 && super.anInt820 >= 466 && super.anInt820 < 503 && this.anIntArray275[9] != -1) {
					this.aBoolean219 = true;
					this.anInt1044 = 9;
					this.aBoolean231 = true;
				}
				if (super.anInt819 >= 627 && super.anInt819 <= 671 && super.anInt820 >= 467 && super.anInt820 < 502 && this.anIntArray275[10] != -1) {
					this.aBoolean219 = true;
					this.anInt1044 = 10;
					this.aBoolean231 = true;
				}
				if (super.anInt819 >= 669 && super.anInt819 <= 699 && super.anInt820 >= 466 && super.anInt820 < 503 && this.anIntArray275[11] != -1) {
					this.aBoolean219 = true;
					this.anInt1044 = 11;
					this.aBoolean231 = true;
				}
				if (super.anInt819 >= 696 && super.anInt819 <= 726 && super.anInt820 >= 466 && super.anInt820 < 503 && this.anIntArray275[12] != -1) {
					this.aBoolean219 = true;
					this.anInt1044 = 12;
					this.aBoolean231 = true;
				}
				if (super.anInt819 >= 724 && super.anInt819 <= 758 && super.anInt820 >= 466 && super.anInt820 < 502 && this.anIntArray275[13] != -1) {
					this.aBoolean219 = true;
					this.anInt1044 = 13;
					this.aBoolean231 = true;
					return;
				}
			}
		} catch (@Pc(445) RuntimeException local445) {
			signlink.reporterror("13648, " + -107 + ", " + local445.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt1030 = Integer.parseInt(this.getParameter("nodeid"));
		anInt1031 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method695();
		} else {
			method719();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean233 = false;
		} else {
			aBoolean233 = true;
		}
		this.method573();
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method691(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				this.method577();
			}
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(44) int local44;
			@Pc(48) int local48;
			@Pc(96) int local96;
			@Pc(110) int local110;
			@Pc(122) int local122;
			@Pc(181) int local181;
			try {
				this.anInt1007 = -1;
				this.aClass8_12.method50();
				this.aClass8_10.method50();
				Class1_Sub1_Sub2_Sub3.method369(this.anInt1017);
				this.method664();
				this.aClass10_1.method54();
				System.gc();
				for (local27 = 0; local27 < 4; local27++) {
					this.aClass28Array1[local27].method295();
				}
				for (local40 = 0; local40 < 4; local40++) {
					for (local44 = 0; local44 < 104; local44++) {
						for (local48 = 0; local48 < 104; local48++) {
							this.aByteArrayArrayArray8[local40][local44][local48] = 0;
						}
					}
				}
				@Pc(82) Class45 local82 = new Class45(this.anIntArrayArrayArray7, this.aByteArrayArrayArray8, 104, (byte) 36, 104);
				local48 = this.aByteArrayArray5.length;
				this.aClass1_Sub1_Sub4_8.method394(89);
				@Pc(243) int local243;
				@Pc(231) int local231;
				if (!this.aBoolean235) {
					@Pc(127) byte[] local127;
					for (local96 = 0; local96 < local48; local96++) {
						local110 = (this.anIntArray249[local96] >> 8) * 64 - this.anInt833;
						local122 = (this.anIntArray249[local96] & 0xFF) * 64 - this.anInt834;
						local127 = this.aByteArrayArray5[local96];
						if (local127 != null) {
							local82.method519((this.anInt855 - 6) * 8, this.aClass28Array1, local127, local110, local122, (this.anInt854 - 6) * 8);
						}
					}
					for (local110 = 0; local110 < local48; local110++) {
						local122 = (this.anIntArray249[local110] >> 8) * 64 - this.anInt833;
						local181 = (this.anIntArray249[local110] & 0xFF) * 64 - this.anInt834;
						@Pc(186) byte[] local186 = this.aByteArrayArray5[local110];
						if (local186 == null && this.anInt855 < 800) {
							local82.method535(local122, local181, 64, 64);
						}
					}
					this.aClass1_Sub1_Sub4_8.method394(89);
					for (local122 = 0; local122 < local48; local122++) {
						local127 = this.aByteArrayArray6[local122];
						if (local127 != null) {
							local231 = (this.anIntArray249[local122] >> 8) * 64 - this.anInt833;
							local243 = (this.anIntArray249[local122] & 0xFF) * 64 - this.anInt834;
							local82.method534(local127, local231, this.aClass10_1, local243, this.aClass28Array1);
						}
					}
				}
				if (this.aBoolean235) {
					local96 = 0;
					label256: while (true) {
						@Pc(298) int local298;
						@Pc(304) int local304;
						@Pc(310) int local310;
						@Pc(320) int local320;
						@Pc(322) int local322;
						if (local96 >= 4) {
							for (local110 = 0; local110 < 13; local110++) {
								for (local122 = 0; local122 < 13; local122++) {
									local181 = this.anIntArrayArrayArray8[0][local110][local122];
									if (local181 == -1) {
										local82.method535(local110 * 8, local122 * 8, 8, 8);
									}
								}
							}
							this.aClass1_Sub1_Sub4_8.method394(89);
							local122 = 0;
							while (true) {
								if (local122 >= 4) {
									break label256;
								}
								for (local181 = 0; local181 < 13; local181++) {
									for (local231 = 0; local231 < 13; local231++) {
										local243 = this.anIntArrayArrayArray8[local122][local181][local231];
										if (local243 != -1) {
											local298 = local243 >> 24 & 0x3;
											local304 = local243 >> 1 & 0x3;
											local310 = local243 >> 14 & 0x3FF;
											local320 = local243 >> 3 & 0x7FF;
											local322 = (local310 / 8 << 8) + local320 / 8;
											for (@Pc(501) int local501 = 0; local501 < this.anIntArray249.length; local501++) {
												if (this.anIntArray249[local501] == local322 && this.aByteArrayArray6[local501] != null) {
													local82.method537(local231 * 8, local304, (local320 & 0x7) * 8, (local310 & 0x7) * 8, this.aClass28Array1, local298, this.aByteArrayArray6[local501], local181 * 8, this.aClass10_1, local122);
													break;
												}
											}
										}
									}
								}
								local122++;
							}
						}
						for (local110 = 0; local110 < 13; local110++) {
							for (local122 = 0; local122 < 13; local122++) {
								@Pc(274) boolean local274 = false;
								local231 = this.anIntArrayArrayArray8[local96][local110][local122];
								if (local231 != -1) {
									local243 = local231 >> 24 & 0x3;
									local298 = local231 >> 1 & 0x3;
									local304 = local231 >> 14 & 0x3FF;
									local310 = local231 >> 3 & 0x7FF;
									local320 = (local304 / 8 << 8) + local310 / 8;
									for (local322 = 0; local322 < this.anIntArray249.length; local322++) {
										if (this.anIntArray249[local322] == local320 && this.aByteArrayArray5[local322] != null) {
											local82.method536(local298, (local310 & 0x7) * 8, (local304 & 0x7) * 8, this.aByteArrayArray5[local322], local110 * 8, local122 * 8, local96, local243, this.aClass28Array1);
											local274 = true;
											break;
										}
									}
								}
								if (!local274) {
									local82.method524(local122 * 8, local110 * 8, local96);
								}
							}
						}
						local96++;
					}
				}
				this.aClass1_Sub1_Sub4_8.method394(89);
				local82.method530(this.aClass10_1, this.aClass28Array1);
				if (this.aClass18_26 != null) {
					this.aClass18_26.method189();
					Class1_Sub1_Sub2_Sub3.anIntArray163 = this.anIntArray228;
				}
				this.aClass1_Sub1_Sub4_8.method394(89);
				local96 = Class45.anInt739;
				if (local96 > this.anInt934) {
					local96 = this.anInt934;
				}
				if (local96 < this.anInt934 - 1) {
					local96 = this.anInt934 - 1;
				}
				if (aBoolean234) {
					this.aClass10_1.method55(Class45.anInt739);
				} else {
					this.aClass10_1.method55(0);
				}
				for (local110 = 0; local110 < 104; local110++) {
					for (local122 = 0; local122 < 104; local122++) {
						this.method640(local110, local122);
					}
				}
				this.method597();
			} catch (@Pc(650) Exception local650) {
			}
			Class32.aClass7_5.method42();
			if (super.aFrame_Sub1_2 != null) {
				this.aClass1_Sub1_Sub4_8.method394(226);
				this.aClass1_Sub1_Sub4_8.method399(1057001181);
			}
			if (aBoolean234 && signlink.aRandomAccessFile3 != null) {
				local27 = this.aClass4_Sub1_1.method110(0);
				for (local40 = 0; local40 < local27; local40++) {
					local44 = this.aClass4_Sub1_1.method114(local40);
					if ((local44 & 0x79) == 0) {
						Class1_Sub1_Sub1_Sub3.method146(local40);
					}
				}
			}
			System.gc();
			Class1_Sub1_Sub2_Sub3.method370(107);
			this.aClass4_Sub1_1.method126(347);
			local27 = (this.anInt854 - 6) / 8 - 1;
			local40 = (this.anInt854 + 6) / 8 + 1;
			local44 = (this.anInt855 - 6) / 8 - 1;
			local48 = (this.anInt855 + 6) / 8 + 1;
			if (this.aBoolean211) {
				local27 = 49;
				local40 = 50;
				local44 = 49;
				local48 = 50;
			}
			for (local96 = local27; local96 <= local40; local96++) {
				for (local110 = local44; local110 <= local48; local110++) {
					if (local96 == local27 || local96 == local40 || local110 == local44 || local110 == local48) {
						local122 = this.aClass4_Sub1_1.method125(0, local96, local110);
						if (local122 != -1) {
							this.aClass4_Sub1_1.method128(local122, 3);
						}
						local181 = this.aClass4_Sub1_1.method125(1, local96, local110);
						if (local181 != -1) {
							this.aClass4_Sub1_1.method128(local181, 3);
						}
					}
				}
			}
		} catch (@Pc(814) RuntimeException local814) {
			signlink.reporterror("70573, " + arg0 + ", " + local814.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!SVWJKJVI;)V")
	private void method692(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub4 arg1) {
		try {
			while (true) {
				if (arg1.anInt625 + 10 < arg0 * 8) {
					@Pc(12) int local12 = arg1.method416(11);
					if (local12 != 2047) {
						if (this.aClass1_Sub1_Sub1_Sub4_Sub1Array1[local12] == null) {
							this.aClass1_Sub1_Sub1_Sub4_Sub1Array1[local12] = new Class1_Sub1_Sub1_Sub4_Sub1();
							if (this.aClass1_Sub1_Sub4Array1[local12] != null) {
								this.aClass1_Sub1_Sub1_Sub4_Sub1Array1[local12].method215(this.aClass1_Sub1_Sub4Array1[local12]);
							}
						}
						this.anIntArray268[this.anInt1024++] = local12;
						@Pc(58) Class1_Sub1_Sub1_Sub4_Sub1 local58 = this.aClass1_Sub1_Sub1_Sub4_Sub1Array1[local12];
						local58.anInt485 = anInt953;
						@Pc(66) int local66 = arg1.method416(5);
						if (local66 > 15) {
							local66 -= 32;
						}
						@Pc(75) int local75 = arg1.method416(1);
						@Pc(80) int local80 = arg1.method416(1);
						if (local80 == 1) {
							this.anIntArray269[this.anInt1025++] = local12;
						}
						@Pc(99) int local99 = arg1.method416(5);
						if (local99 > 15) {
							local99 -= 32;
						}
						local58.method314(aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0] + local66, local75 == 1, this.aBoolean222, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0] + local99);
						continue;
					}
				}
				arg1.method417();
				return;
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("40941, " + -570 + ", " + arg0 + ", " + arg1 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	private void method693(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			this.anInt961 += 0;
			if (arg4 >= 1 && arg1 >= 1 && arg4 <= 102 && arg1 <= 102) {
				if (aBoolean234 && arg2 != this.anInt934) {
					return;
				}
				@Pc(26) int local26 = 0;
				if (arg0 == 0) {
					local26 = this.aClass10_1.method80(arg2, arg4, arg1);
				}
				if (arg0 == 1) {
					local26 = this.aClass10_1.method81(arg2, arg4, arg1);
				}
				if (arg0 == 2) {
					local26 = this.aClass10_1.method82(arg2, arg4, arg1);
				}
				if (arg0 == 3) {
					local26 = this.aClass10_1.method83(arg2, arg4, arg1);
				}
				@Pc(82) int local82;
				if (local26 != 0) {
					local82 = this.aClass10_1.method84(arg2, arg4, arg1, local26);
					@Pc(88) int local88 = local26 >> 14 & 0x7FFF;
					@Pc(92) int local92 = local82 & 0x1F;
					@Pc(96) int local96 = local82 >> 6;
					@Pc(108) Class32 local108;
					if (arg0 == 0) {
						this.aClass10_1.method71(arg2, arg1, arg4);
						local108 = Class32.method345(local88);
						if (local108.aBoolean117) {
							this.aClass28Array1[arg2].method300(local96, local108.aBoolean119, arg1, arg4, local92);
						}
					}
					if (arg0 == 1) {
						this.aClass10_1.method72(arg2, arg4, arg1);
					}
					if (arg0 == 2) {
						this.aClass10_1.method73(arg4, arg1, arg2);
						local108 = Class32.method345(local88);
						if (arg4 + local108.anInt543 > 103 || arg1 + local108.anInt543 > 103 || arg4 + local108.anInt547 > 103 || arg1 + local108.anInt547 > 103) {
							return;
						}
						if (local108.aBoolean117) {
							this.aClass28Array1[arg2].method301(local96, arg4, local108.aBoolean119, arg1, local108.anInt543, local108.anInt547);
						}
					}
					if (arg0 == 3) {
						this.aClass10_1.method74(arg1, arg2, arg4);
						local108 = Class32.method345(local88);
						if (local108.aBoolean117 && local108.aBoolean121) {
							this.aClass28Array1[arg2].method303(arg4, arg1);
						}
					}
				}
				if (arg5 >= 0) {
					local82 = arg2;
					if (arg2 < 3 && (this.aByteArrayArrayArray8[1][arg4][arg1] & 0x2) == 2) {
						local82 = arg2 + 1;
					}
					Class45.method531(arg4, this.anIntArrayArrayArray7, arg5, arg6, this.aClass28Array1[arg2], this.aClass10_1, arg2, local82, arg3, arg1);
					return;
				}
			}
		} catch (@Pc(255) RuntimeException local255) {
			signlink.reporterror("31087, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local255.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!NHFASBOX;IIBIIIII)V")
	private void method694(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (this.aBoolean209) {
				this.anInt970 = 32;
			} else {
				this.anInt970 = 0;
			}
			this.aBoolean209 = false;
			if (arg4 >= arg6 && arg4 < arg6 + 16 && arg7 >= arg1 && arg7 < arg1 + 16) {
				arg0.anInt377 -= this.anInt1000 * 4;
				if (arg2 == 1) {
					this.aBoolean219 = true;
				}
				if (arg2 == 2 || arg2 == 3) {
					this.aBoolean228 = true;
				}
			} else if (arg4 >= arg6 && arg4 < arg6 + 16 && arg7 >= arg1 + arg3 - 16 && arg7 < arg1 + arg3) {
				arg0.anInt377 += this.anInt1000 * 4;
				if (arg2 == 1) {
					this.aBoolean219 = true;
				}
				if (arg2 == 2 || arg2 == 3) {
					this.aBoolean228 = true;
				}
			} else if (arg4 >= arg6 - this.anInt970 && arg4 < arg6 + this.anInt970 + 16 && arg7 >= arg1 + 16 && arg7 < arg1 + arg3 - 16 && this.anInt1000 > 0) {
				@Pc(142) int local142 = (arg3 - 32) * arg3 / arg5;
				if (local142 < 8) {
					local142 = 8;
				}
				@Pc(157) int local157 = arg7 - arg1 - local142 / 2 - 16;
				@Pc(163) int local163 = arg3 - local142 - 32;
				arg0.anInt377 = (arg5 - arg3) * local157 / local163;
				if (arg2 == 1) {
					this.aBoolean219 = true;
				}
				if (arg2 == 2 || arg2 == 3) {
					this.aBoolean228 = true;
				}
				this.aBoolean209 = true;
			}
		} catch (@Pc(192) RuntimeException local192) {
			signlink.reporterror("60356, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -92 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local192.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method696() {
		try {
			signlink.aBoolean236 = false;
			signlink.anInt1058 = 0;
			signlink.midi = "stop";
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("93794, " + 925 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
	private void method697(@OriginalArg(0) byte arg0) {
		try {
			this.aClass18_24.method189();
			@Pc(10) boolean local10 = false;
			Class1_Sub1_Sub2_Sub3.anIntArray163 = this.anIntArray227;
			this.aClass1_Sub1_Sub2_Sub4_6.method570(0, 0);
			if (this.anInt908 != -1) {
				this.method638(Class24.method230(this.anInt908), 0, 0, 0, 284);
			} else if (this.anIntArray275[this.anInt1044] != -1) {
				this.method638(Class24.method230(this.anIntArray275[this.anInt1044]), 0, 0, 0, 284);
			}
			if (this.aBoolean230 && this.anInt869 == 1) {
				this.method704();
			}
			this.aClass18_24.method190(796, 205, 553, super.aGraphics2);
			this.aClass18_26.method189();
			Class1_Sub1_Sub2_Sub3.anIntArray163 = this.anIntArray228;
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("80380, " + arg0 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(BI)V")
	private void method698(@OriginalArg(1) int arg0) {
		try {
			if (!aBoolean234) {
				for (@Pc(9) int local9 = 0; local9 < this.anIntArray272.length; local9++) {
					@Pc(16) int local16 = this.anIntArray272[local9];
					if (Class1_Sub1_Sub2_Sub3.anIntArray165[local16] >= arg0) {
						@Pc(25) Class1_Sub1_Sub2_Sub4 local25 = Class1_Sub1_Sub2_Sub3.aClass1_Sub1_Sub2_Sub4Array1[local16];
						@Pc(33) int local33 = local25.anInt797 * local25.anInt798 - 1;
						@Pc(41) int local41 = local25.anInt797 * this.anInt944 * 2;
						@Pc(44) byte[] local44 = local25.aByteArray20;
						@Pc(47) byte[] local47 = this.aByteArray21;
						for (@Pc(49) int local49 = 0; local49 <= local33; local49++) {
							local47[local49] = local44[local49 - local41 & local33];
						}
						local25.aByteArray20 = local47;
						this.aByteArray21 = local44;
						Class1_Sub1_Sub2_Sub3.method373(local16);
						anInt960++;
						if (anInt960 > 1734) {
							anInt960 = 0;
							this.aClass1_Sub1_Sub4_8.method394(217);
							this.aClass1_Sub1_Sub4_8.method395(0);
							@Pc(96) int local96 = this.aClass1_Sub1_Sub4_8.anInt624;
							if ((int) (Math.random() * 2.0D) == 0) {
								this.aClass1_Sub1_Sub4_8.method396(8354);
							}
							this.aClass1_Sub1_Sub4_8.method395((int) (Math.random() * 256.0D));
							this.aClass1_Sub1_Sub4_8.method396((int) (Math.random() * 65536.0D));
							this.aClass1_Sub1_Sub4_8.method396(46806);
							this.aClass1_Sub1_Sub4_8.method396(61169);
							this.aClass1_Sub1_Sub4_8.method395(228);
							this.aClass1_Sub1_Sub4_8.method396((int) (Math.random() * 65536.0D));
							this.aClass1_Sub1_Sub4_8.method396(22457);
							this.aClass1_Sub1_Sub4_8.method395((int) (Math.random() * 256.0D));
							this.aClass1_Sub1_Sub4_8.method395((int) (Math.random() * 256.0D));
							this.aClass1_Sub1_Sub4_8.method404(this.aClass1_Sub1_Sub4_8.anInt624 - local96);
						}
					}
				}
			}
		} catch (@Pc(173) RuntimeException local173) {
			signlink.reporterror("89328, " + 7 + ", " + arg0 + ", " + local173.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!SVWJKJVI;B)V")
	private void method699(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub4 arg1) {
		try {
			this.anInt930 = 0;
			this.anInt1025 = 0;
			this.method590(arg1, arg0);
			this.method606(arg1, arg0, (byte) 6);
			this.method667(arg1, arg0);
			@Pc(31) int local31;
			for (@Pc(24) int local24 = 0; local24 < this.anInt930; local24++) {
				local31 = this.anIntArray247[local24];
				if (this.aClass1_Sub1_Sub1_Sub4_Sub2Array1[local31].anInt485 != anInt953) {
					this.aClass1_Sub1_Sub1_Sub4_Sub2Array1[local31].aClass29_2 = null;
					this.aClass1_Sub1_Sub1_Sub4_Sub2Array1[local31] = null;
				}
			}
			if (arg1.anInt624 != arg0) {
				signlink.reporterror(this.aString28 + " size mismatch in getnpcpos - pos:" + arg1.anInt624 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local31 = 0; local31 < this.anInt879; local31++) {
				if (this.aClass1_Sub1_Sub1_Sub4_Sub2Array1[this.anIntArray230[local31]] == null) {
					signlink.reporterror(this.aString28 + " null entry in npc list - pos:" + local31 + " size:" + this.anInt879);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("69210, " + arg0 + ", " + arg1 + ", " + 1 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method700() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt1024; local3++) {
				if (local3 == -1) {
					local11 = this.anInt1023;
				} else {
					local11 = this.anIntArray268[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub4_Sub1 local23 = this.aClass1_Sub1_Sub1_Sub4_Sub1Array1[local11];
				if (local23 != null && local23.anInt486 > 0) {
					local23.anInt486--;
					if (local23.anInt486 == 0) {
						local23.aString13 = null;
					}
				}
			}
			for (local11 = 0; local11 < this.anInt879; local11++) {
				@Pc(61) int local61 = this.anIntArray230[local11];
				@Pc(66) Class1_Sub1_Sub1_Sub4_Sub2 local66 = this.aClass1_Sub1_Sub1_Sub4_Sub2Array1[local61];
				if (local66 != null && local66.anInt486 > 0) {
					local66.anInt486--;
					if (local66.anInt486 == 0) {
						local66.aString13 = null;
					}
				}
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("56244, " + -801 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZB)V")
	private void method701(@OriginalArg(0) boolean arg0) {
		try {
			if (aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt458 >> 7 == this.anInt995 && aClass1_Sub1_Sub1_Sub4_Sub1_1.anInt459 >> 7 == this.anInt996) {
				this.anInt995 = 0;
			}
			@Pc(27) int local27 = this.anInt1024;
			if (arg0) {
				local27 = 1;
			}
			for (@Pc(33) int local33 = 0; local33 < local27; local33++) {
				@Pc(39) Class1_Sub1_Sub1_Sub4_Sub1 local39;
				@Pc(44) int local44;
				if (arg0) {
					local39 = aClass1_Sub1_Sub1_Sub4_Sub1_1;
					local44 = this.anInt1023 << 14;
				} else {
					local39 = this.aClass1_Sub1_Sub1_Sub4_Sub1Array1[this.anIntArray268[local33]];
					local44 = this.anIntArray268[local33] << 14;
				}
				if (local39 != null && local39.method311()) {
					local39.aBoolean64 = false;
					if ((aBoolean234 && this.anInt1024 > 50 || this.anInt1024 > 200) && !arg0 && local39.anInt472 == local39.anInt453) {
						local39.aBoolean64 = true;
					}
					@Pc(95) int local95 = local39.anInt458 >> 7;
					@Pc(100) int local100 = local39.anInt459 >> 7;
					if (local95 >= 0 && local95 < 104 && local100 >= 0 && local100 < 104) {
						if (local39.aClass1_Sub1_Sub1_Sub3_2 == null || anInt953 < local39.anInt332 || anInt953 >= local39.anInt333) {
							if ((local39.anInt458 & 0x7F) == 64 && (local39.anInt459 & 0x7F) == 64) {
								if (this.anIntArrayArray25[local95][local100] == this.anInt980) {
									continue;
								}
								this.anIntArrayArray25[local95][local100] = this.anInt980;
							}
							local39.anInt328 = this.method666(local39.anInt458, local39.anInt459, this.anInt934);
							this.aClass10_1.method65(local39.anInt328, local39.anInt459, this.anInt934, local39, local39.aBoolean101, local39.anInt460, local44, 60, local39.anInt458);
						} else {
							local39.aBoolean64 = false;
							local39.anInt328 = this.method666(local39.anInt458, local39.anInt459, this.anInt934);
							this.aClass10_1.method66(local39.anInt334, local39.anInt458, local39.anInt335, this.anInt934, local39.anInt336, local39.anInt328, local39, local39.anInt337, local39.anInt459, local44, local39.anInt460);
						}
					}
				}
			}
		} catch (@Pc(229) RuntimeException local229) {
			signlink.reporterror("82405, " + arg0 + ", " + -75 + ", " + local229.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean226) {
			this.method718();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!SVWJKJVI;I)V")
	private void method702(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub1_Sub4 arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg0 != -22) {
				this.method577();
			}
			this.anInt930 = 0;
			this.anInt1025 = 0;
			this.method610(arg2, arg1);
			this.method657(arg1, arg2, (byte) 8);
			this.method692(arg2, arg1);
			this.method648(arg1, arg2);
			@Pc(41) int local41;
			for (@Pc(34) int local34 = 0; local34 < this.anInt930; local34++) {
				local41 = this.anIntArray247[local34];
				if (this.aClass1_Sub1_Sub1_Sub4_Sub1Array1[local41].anInt485 != anInt953) {
					this.aClass1_Sub1_Sub1_Sub4_Sub1Array1[local41] = null;
				}
			}
			if (arg1.anInt624 != arg2) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.anInt624 + " psize:" + arg2);
				throw new RuntimeException("eek");
			}
			for (local41 = 0; local41 < this.anInt1024; local41++) {
				if (this.aClass1_Sub1_Sub1_Sub4_Sub1Array1[this.anIntArray268[local41]] == null) {
					signlink.reporterror(this.aString28 + " null entry in pl list - pos:" + local41 + " size:" + this.anInt1024);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("37316, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
	private void method703() {
		try {
			this.aClass18_27.method189();
			Class1_Sub1_Sub2_Sub3.anIntArray163 = this.anIntArray226;
			this.aClass1_Sub1_Sub2_Sub4_8.method570(0, 0);
			if (this.aBoolean197) {
				this.aClass1_Sub1_Sub2_Sub2_4.method275(40, this.aString18, 239, 0);
				this.aClass1_Sub1_Sub2_Sub2_4.method275(60, this.aString22 + "*", 239, 128);
			} else if (this.anInt988 == 1) {
				this.aClass1_Sub1_Sub2_Sub2_4.method275(40, "Enter amount:", 239, 0);
				this.aClass1_Sub1_Sub2_Sub2_4.method275(60, this.aString17 + "*", 239, 128);
			} else if (this.anInt988 == 2) {
				this.aClass1_Sub1_Sub2_Sub2_4.method275(40, "Enter name:", 239, 0);
				this.aClass1_Sub1_Sub2_Sub2_4.method275(60, this.aString17 + "*", 239, 128);
			} else {
				@Pc(125) Class1_Sub1_Sub2_Sub2 local125;
				@Pc(134) int local134;
				@Pc(145) int local145;
				if (this.anInt988 == 3) {
					if (this.aString17 != this.aString19) {
						this.method595(this.aString17);
						this.aString19 = this.aString17;
					}
					local125 = this.aClass1_Sub1_Sub2_Sub2_3;
					Class1_Sub1_Sub2.method555(463, 0, 77, this.anInt865, 0);
					for (local134 = 0; local134 < this.anInt844; local134++) {
						local145 = local134 * 14 + 18 - this.anInt845;
						if (local145 > 0 && local145 < 110) {
							local125.method275(local145, this.aStringArray8[local134], 239, 0);
						}
					}
					Class1_Sub1_Sub2.method554(376);
					if (this.anInt844 > 5) {
						this.method714(0, this.anInt993, this.anInt844 * 14 + 7, 463, 77, this.anInt845);
					}
					if (this.aString17.length() == 0) {
						this.aClass1_Sub1_Sub2_Sub2_4.method275(40, "Enter object name", 239, 255);
					} else if (this.anInt844 == 0) {
						this.aClass1_Sub1_Sub2_Sub2_4.method275(40, "No matching objects found, please shorten search", 239, 0);
					}
					local125.method275(90, this.aString17 + "*", 239, 0);
					Class1_Sub1_Sub2.method561(0, 479, 0, 77);
				} else if (this.aString27 != null) {
					this.aClass1_Sub1_Sub2_Sub2_4.method275(40, this.aString27, 239, 0);
					this.aClass1_Sub1_Sub2_Sub2_4.method275(60, "Click to continue", 239, 128);
				} else if (this.anInt887 != -1) {
					this.method638(Class24.method230(this.anInt887), 0, 0, 0, 284);
				} else if (this.anInt983 == -1) {
					local125 = this.aClass1_Sub1_Sub2_Sub2_3;
					local134 = 0;
					Class1_Sub1_Sub2.method555(463, 0, 77, this.anInt865, 0);
					for (local145 = 0; local145 < 100; local145++) {
						if (this.aStringArray11[local145] != null) {
							@Pc(312) int local312 = this.anIntArray238[local145];
							@Pc(321) int local321 = this.anInt971 + 70 - local134 * 14;
							@Pc(326) String local326 = this.aStringArray10[local145];
							@Pc(328) byte local328 = 0;
							if (local326 != null && local326.startsWith("@cr1@")) {
								local326 = local326.substring(5);
								local328 = 1;
							}
							if (local326 != null && local326.startsWith("@cr2@")) {
								local326 = local326.substring(5);
								local328 = 2;
							}
							if (local312 == 0) {
								if (local321 > 0 && local321 < 110) {
									local125.method279(local321, 0, 4, this.aStringArray11[local145]);
								}
								local134++;
							}
							@Pc(398) int local398;
							if ((local312 == 1 || local312 == 2) && (local312 == 1 || this.anInt824 == 0 || this.anInt824 == 1 && this.method589(local326))) {
								if (local321 > 0 && local321 < 110) {
									local398 = 4;
									if (local328 == 1) {
										this.aClass1_Sub1_Sub2_Sub4Array2[0].method570(local321 - 12, 4);
										local398 += 14;
									}
									if (local328 == 2) {
										this.aClass1_Sub1_Sub2_Sub4Array2[1].method570(local321 - 12, local398);
										local398 += 14;
									}
									local125.method279(local321, 0, local398, local326 + ":");
									local398 += local125.method277(local326) + 8;
									local125.method279(local321, 255, local398, this.aStringArray11[local145]);
								}
								local134++;
							}
							if ((local312 == 3 || local312 == 7) && this.anInt1009 == 0 && (local312 == 7 || this.anInt840 == 0 || this.anInt840 == 1 && this.method589(local326))) {
								if (local321 > 0 && local321 < 110) {
									local125.method279(local321, 0, 4, "From");
									local398 = local125.method277("From ") + 4;
									if (local328 == 1) {
										this.aClass1_Sub1_Sub2_Sub4Array2[0].method570(local321 - 12, local398);
										local398 += 14;
									}
									if (local328 == 2) {
										this.aClass1_Sub1_Sub2_Sub4Array2[1].method570(local321 - 12, local398);
										local398 += 14;
									}
									local125.method279(local321, 0, local398, local326 + ":");
									local398 += local125.method277(local326) + 8;
									local125.method279(local321, 8388608, local398, this.aStringArray11[local145]);
								}
								local134++;
							}
							if (local312 == 4 && (this.anInt874 == 0 || this.anInt874 == 1 && this.method589(local326))) {
								if (local321 > 0 && local321 < 110) {
									local125.method279(local321, 8388736, 4, local326 + " " + this.aStringArray11[local145]);
								}
								local134++;
							}
							if (local312 == 5 && this.anInt1009 == 0 && this.anInt840 < 2) {
								if (local321 > 0 && local321 < 110) {
									local125.method279(local321, 8388608, 4, this.aStringArray11[local145]);
								}
								local134++;
							}
							if (local312 == 6 && this.anInt1009 == 0 && this.anInt840 < 2) {
								if (local321 > 0 && local321 < 110) {
									local125.method279(local321, 0, 4, "To " + local326 + ":");
									local125.method279(local321, 8388608, local125.method277("To " + local326) + 12, this.aStringArray11[local145]);
								}
								local134++;
							}
							if (local312 == 8 && (this.anInt874 == 0 || this.anInt874 == 1 && this.method589(local326))) {
								if (local321 > 0 && local321 < 110) {
									local125.method279(local321, 8270336, 4, local326 + " " + this.aStringArray11[local145]);
								}
								local134++;
							}
						}
					}
					Class1_Sub1_Sub2.method554(376);
					this.anInt882 = local134 * 14 + 7;
					if (this.anInt882 < 78) {
						this.anInt882 = 78;
					}
					this.method714(0, this.anInt993, this.anInt882, 463, 77, this.anInt882 - this.anInt971 - 77);
					@Pc(769) String local769;
					if (aClass1_Sub1_Sub1_Sub4_Sub1_1 == null || aClass1_Sub1_Sub1_Sub4_Sub1_1.aString7 == null) {
						local769 = Class2.method18(this.aString28);
					} else {
						local769 = aClass1_Sub1_Sub1_Sub4_Sub1_1.aString7;
					}
					local125.method279(90, 0, 4, local769 + ":");
					local125.method279(90, 255, local125.method277(local769 + ": ") + 6, this.aString21 + "*");
					Class1_Sub1_Sub2.method561(0, 479, 0, 77);
				} else {
					this.method638(Class24.method230(this.anInt983), 0, 0, 0, 284);
				}
			}
			if (this.aBoolean230 && this.anInt869 == 2) {
				this.method704();
			}
			this.aClass18_27.method190(796, 357, 17, super.aGraphics2);
			this.aClass18_26.method189();
			Class1_Sub1_Sub2_Sub3.anIntArray163 = this.anIntArray228;
		} catch (@Pc(858) RuntimeException local858) {
			signlink.reporterror("75665, " + 0 + ", " + local858.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method704() {
		try {
			@Pc(2) int local2 = this.anInt870;
			@Pc(5) int local5 = this.anInt871;
			@Pc(8) int local8 = this.anInt872;
			@Pc(11) int local11 = this.anInt873;
			Class1_Sub1_Sub2.method558(6116423, local11, local2, local8, local5);
			Class1_Sub1_Sub2.method558(0, 16, local2 + 1, local8 - 2, local5 + 1);
			Class1_Sub1_Sub2.method559(0, local2 + 1, local5 + 18, local11 - 19, local8 - 2);
			this.aClass1_Sub1_Sub2_Sub2_4.method279(local5 + 14, 6116423, local2 + 3, "Choose Option");
			@Pc(63) int local63 = super.anInt813;
			@Pc(66) int local66 = super.anInt814;
			if (this.anInt869 == 0) {
				local63 -= 4;
				local66 -= 4;
			}
			if (this.anInt869 == 1) {
				local63 -= 553;
				local66 -= 205;
			}
			if (this.anInt869 == 2) {
				local63 -= 17;
				local66 -= 357;
			}
			for (@Pc(92) int local92 = 0; local92 < this.anInt1005; local92++) {
				@Pc(107) int local107 = local5 + (this.anInt1005 - 1 - local92) * 15 + 31;
				@Pc(109) int local109 = 16777215;
				if (local63 > local2 && local63 < local2 + local8 && local66 > local107 - 13 && local66 < local107 + 3) {
					local109 = 16776960;
				}
				this.aClass1_Sub1_Sub2_Sub2_4.method283(local109, true, this.aStringArray13[local92], local2 + 3, local107);
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("95758, " + true + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!NHFASBOX;Z)Z")
	private boolean method705(@OriginalArg(0) Class24 arg0) {
		try {
			if (arg0.anIntArray123 == null) {
				return false;
			}
			for (@Pc(6) int local6 = 0; local6 < arg0.anIntArray123.length; local6++) {
				@Pc(14) int local14 = this.method614(local6, arg0);
				@Pc(19) int local19 = arg0.anIntArray119[local6];
				if (arg0.anIntArray123[local6] == 2) {
					if (local14 >= local19) {
						return false;
					}
				} else if (arg0.anIntArray123[local6] == 3) {
					if (local14 <= local19) {
						return false;
					}
				} else if (arg0.anIntArray123[local6] == 4) {
					if (local14 == local19) {
						return false;
					}
				} else if (local14 != local19) {
					return false;
				}
			}
			return true;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("70494, " + arg0 + ", " + true + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)V")
	private void method706(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B[BZ)V")
	private void method707(@OriginalArg(1) byte[] arg0, @OriginalArg(2) boolean arg1) {
		try {
			if (this.aBoolean198) {
				signlink.anInt1058 = arg1 ? 1 : 0;
				signlink.midisave(arg0, arg0.length);
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("88639, " + -70 + ", " + arg0 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method708(@OriginalArg(0) int arg0) {
		try {
			signlink.anInt1060 = arg0;
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("60291, " + arg0 + ", " + false + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILjava/lang/String;)V")
	@Override
	protected void method584(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		try {
			this.anInt1034 = arg0;
			this.aString26 = arg1;
			this.method620();
			if (this.aClass43_2 == null) {
				super.method584(arg0, arg1);
			} else {
				this.aClass18_14.method189();
				this.aBoolean213 &= true;
				this.aClass1_Sub1_Sub2_Sub2_4.method275(54, "RuneScape is loading - please wait...", 180, 16777215);
				Class1_Sub1_Sub2.method559(9179409, 28, 62, 34, 304);
				Class1_Sub1_Sub2.method559(0, 29, 63, 32, 302);
				Class1_Sub1_Sub2.method558(9179409, 30, 30, arg0 * 3, 64);
				Class1_Sub1_Sub2.method558(0, 30, arg0 * 3 + 30, 300 - arg0 * 3, 64);
				this.aClass1_Sub1_Sub2_Sub2_4.method275(85, arg1, 180, 16777215);
				this.aClass18_14.method190(796, 171, 202, super.aGraphics2);
				if (this.aBoolean217) {
					this.aBoolean217 = false;
					if (!this.aBoolean195) {
						this.aClass18_15.method190(796, 0, 0, super.aGraphics2);
						this.aClass18_16.method190(796, 0, 637, super.aGraphics2);
					}
					this.aClass18_12.method190(796, 0, 128, super.aGraphics2);
					this.aClass18_13.method190(796, 371, 202, super.aGraphics2);
					this.aClass18_17.method190(796, 265, 0, super.aGraphics2);
					this.aClass18_18.method190(796, 265, 562, super.aGraphics2);
					this.aClass18_19.method190(796, 171, 128, super.aGraphics2);
					this.aClass18_20.method190(796, 171, 562, super.aGraphics2);
				}
			}
		} catch (@Pc(216) RuntimeException local216) {
			signlink.reporterror("76392, " + true + ", " + arg0 + ", " + arg1 + ", " + local216.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IILclient!SVWJKJVI;)V")
	private void method709(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub4 arg1) {
		try {
			@Pc(12) int local12;
			@Pc(21) int local21;
			@Pc(28) int local28;
			@Pc(36) int local36;
			@Pc(41) int local41;
			@Pc(45) int local45;
			@Pc(49) int local49;
			@Pc(54) int local54;
			@Pc(58) int local58;
			@Pc(65) int local65;
			@Pc(69) int local69;
			if (arg0 == 243) {
				local12 = arg1.method424(this.anInt956);
				local21 = this.anInt891 + (local12 >> 4 & 0x7);
				local28 = this.anInt892 + (local12 & 0x7);
				@Pc(32) byte local32 = arg1.method426();
				local36 = arg1.method434();
				local41 = arg1.method424(this.anInt956);
				local45 = local41 >> 2;
				local49 = local41 & 0x3;
				local54 = this.anIntArray257[local45];
				local58 = arg1.method433();
				@Pc(62) byte local62 = arg1.method428();
				local65 = arg1.method407();
				local69 = arg1.method434();
				@Pc(73) byte local73 = arg1.method427();
				@Pc(76) byte local76 = arg1.method406();
				@Pc(82) Class1_Sub1_Sub1_Sub4_Sub1 local82;
				if (local65 == this.anInt1026) {
					local82 = aClass1_Sub1_Sub1_Sub4_Sub1_1;
				} else {
					local82 = this.aClass1_Sub1_Sub1_Sub4_Sub1Array1[local65];
				}
				if (local82 != null) {
					@Pc(94) Class32 local94 = Class32.method345(local58);
					@Pc(104) int local104 = this.anIntArrayArrayArray7[this.anInt934][local21][local28];
					@Pc(116) int local116 = this.anIntArrayArrayArray7[this.anInt934][local21 + 1][local28];
					@Pc(130) int local130 = this.anIntArrayArrayArray7[this.anInt934][local21 + 1][local28 + 1];
					@Pc(142) int local142 = this.anIntArrayArrayArray7[this.anInt934][local21][local28 + 1];
					@Pc(152) Class1_Sub1_Sub1_Sub3 local152 = local94.method342(local45, local49, local104, local116, local130, local142, -1);
					if (local152 != null) {
						this.method685(local36 + 1, 0, local54, 0, local69 + 1, this.anInt934, local21, local28, -1);
						local82.anInt332 = local69 + anInt953;
						local82.anInt333 = local36 + anInt953;
						local82.aClass1_Sub1_Sub1_Sub3_2 = local152;
						@Pc(187) int local187 = local94.anInt543;
						@Pc(190) int local190 = local94.anInt547;
						if (local49 == 1 || local49 == 3) {
							local187 = local94.anInt547;
							local190 = local94.anInt543;
						}
						local82.anInt323 = local21 * 128 + local187 * 64;
						local82.anInt325 = local28 * 128 + local190 * 64;
						local82.anInt324 = this.method666(local82.anInt323, local82.anInt325, this.anInt934);
						@Pc(236) byte local236;
						if (local32 > local73) {
							local236 = local32;
							local32 = local73;
							local73 = local236;
						}
						if (local62 > local76) {
							local236 = local62;
							local62 = local76;
							local76 = local236;
						}
						local82.anInt334 = local21 + local32;
						local82.anInt336 = local21 + local73;
						local82.anInt335 = local28 + local62;
						local82.anInt337 = local28 + local76;
					}
				}
			}
			@Pc(294) int local294;
			if (arg0 == 200) {
				local12 = arg1.method405();
				local21 = this.anInt891 + (local12 >> 4 & 0x7);
				local28 = this.anInt892 + (local12 & 0x7);
				local294 = arg1.method407();
				local36 = arg1.method407();
				local41 = arg1.method407();
				if (local21 >= 0 && local28 >= 0 && local21 < 104 && local28 < 104) {
					@Pc(320) Class8 local320 = this.aClass8ArrayArrayArray1[this.anInt934][local21][local28];
					if (local320 != null) {
						for (@Pc(326) Class1_Sub1_Sub1_Sub6 local326 = (Class1_Sub1_Sub1_Sub6) local320.method46(); local326 != null; local326 = (Class1_Sub1_Sub1_Sub6) local320.method48()) {
							if (local326.anInt725 == (local294 & 0x7FFF) && local326.anInt727 == local36) {
								local326.anInt727 = local41;
								break;
							}
						}
						this.method640(local21, local28);
					}
				}
			} else {
				@Pc(446) int local446;
				if (arg0 == 157) {
					local12 = arg1.method425(this.anInt1045);
					local21 = this.anInt891 + (local12 >> 4 & 0x7);
					local28 = this.anInt892 + (local12 & 0x7);
					local294 = arg1.method407();
					local36 = arg1.method424(this.anInt956);
					local41 = local36 >> 2;
					local45 = local36 & 0x3;
					local49 = this.anIntArray257[local41];
					if (local21 >= 0 && local28 >= 0 && local21 < 103 && local28 < 103) {
						local54 = this.anIntArrayArrayArray7[this.anInt934][local21][local28];
						local58 = this.anIntArrayArrayArray7[this.anInt934][local21 + 1][local28];
						local446 = this.anIntArrayArrayArray7[this.anInt934][local21 + 1][local28 + 1];
						local65 = this.anIntArrayArrayArray7[this.anInt934][local21][local28 + 1];
						if (local49 == 0) {
							@Pc(469) Class20 local469 = this.aClass10_1.method76(this.anInt934, local21, local28);
							if (local469 != null) {
								@Pc(478) int local478 = local469.anInt344 >> 14 & 0x7FFF;
								if (local41 == 2) {
									local469.aClass1_Sub1_Sub1_1 = new Class1_Sub1_Sub1_Sub2(local446, local58, local478, local294, -371, 2, local45 + 4, false, local54, local65);
									local469.aClass1_Sub1_Sub1_2 = new Class1_Sub1_Sub1_Sub2(local446, local58, local478, local294, -371, 2, local45 + 1 & 0x3, false, local54, local65);
								} else {
									local469.aClass1_Sub1_Sub1_1 = new Class1_Sub1_Sub1_Sub2(local446, local58, local478, local294, -371, local41, local45, false, local54, local65);
								}
							}
						}
						if (local49 == 1) {
							@Pc(546) Class25 local546 = this.aClass10_1.method77(local28, this.anInt934, local21);
							if (local546 != null) {
								local546.aClass1_Sub1_Sub1_3 = new Class1_Sub1_Sub1_Sub2(local446, local58, local546.anInt395 >> 14 & 0x7FFF, local294, -371, 4, 0, false, local54, local65);
							}
						}
						if (local49 == 2) {
							@Pc(580) Class40 local580 = this.aClass10_1.method78(this.anInt934, local21, local28);
							if (local41 == 11) {
								local41 = 10;
							}
							if (local580 != null) {
								local580.aClass1_Sub1_Sub1_4 = new Class1_Sub1_Sub1_Sub2(local446, local58, local580.anInt682 >> 14 & 0x7FFF, local294, -371, local41, local45, false, local54, local65);
							}
						}
						if (local49 == 3) {
							@Pc(619) Class48 local619 = this.aClass10_1.method79(local21, local28, this.anInt934);
							if (local619 != null) {
								local619.aClass1_Sub1_Sub1_8 = new Class1_Sub1_Sub1_Sub2(local446, local58, local619.anInt759 >> 14 & 0x7FFF, local294, -371, 22, local45, false, local54, local65);
							}
						}
					}
				} else {
					if (arg0 == 80) {
						local12 = arg1.method405();
						local21 = this.anInt891 + (local12 >> 4 & 0x7);
						local28 = this.anInt892 + (local12 & 0x7);
						local294 = arg1.method407();
						local36 = arg1.method405();
						local41 = local36 >> 4 & 0xF;
						local45 = local36 & 0x7;
						if (aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0] >= local21 - local41 && aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0] <= local21 + local41 && aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0] >= local28 - local41 && aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0] <= local28 + local41 && this.aBoolean205 && !aBoolean234 && this.anInt886 < 50) {
							this.anIntArray245[this.anInt886] = local294;
							this.anIntArray260[this.anInt886] = local45;
							this.anIntArray255[this.anInt886] = Class16.anIntArray96[local294];
							this.anInt886++;
						}
					}
					if (arg0 == 99) {
						local12 = arg1.method405();
						local21 = this.anInt891 + (local12 >> 4 & 0x7);
						local28 = this.anInt892 + (local12 & 0x7);
						local294 = local21 + arg1.method406();
						local36 = local28 + arg1.method406();
						local41 = arg1.method408();
						local45 = arg1.method407();
						local49 = arg1.method405() * 4;
						local54 = arg1.method405() * 4;
						local58 = arg1.method407();
						local446 = arg1.method407();
						local65 = arg1.method405();
						local69 = arg1.method405();
						if (local21 >= 0 && local28 >= 0 && local21 < 104 && local28 < 104 && local294 >= 0 && local36 >= 0 && local294 < 104 && local36 < 104 && local45 != 65535) {
							local21 = local21 * 128 + 64;
							local28 = local28 * 128 + 64;
							local294 = local294 * 128 + 64;
							local36 = local36 * 128 + 64;
							@Pc(883) Class1_Sub1_Sub1_Sub1 local883 = new Class1_Sub1_Sub1_Sub1(local58 + anInt953, this.method666(local21, local28, this.anInt934) - local49, this.anInt934, local21, local69, local41, local54, (byte) -108, local45, local28, local65, local446 + anInt953);
							local883.method13(local294, local36, this.method666(local294, local36, this.anInt934) - local54, local58 + anInt953);
							this.aClass8_10.method43(local883);
						}
					} else {
						@Pc(957) Class1_Sub1_Sub1_Sub6 local957;
						if (arg0 == 189) {
							local12 = arg1.method432();
							local21 = arg1.method405();
							local28 = this.anInt891 + (local21 >> 4 & 0x7);
							local294 = this.anInt892 + (local21 & 0x7);
							if (local28 >= 0 && local294 >= 0 && local28 < 104 && local294 < 104) {
								@Pc(951) Class8 local951 = this.aClass8ArrayArrayArray1[this.anInt934][local28][local294];
								if (local951 != null) {
									for (local957 = (Class1_Sub1_Sub1_Sub6) local951.method46(); local957 != null; local957 = (Class1_Sub1_Sub1_Sub6) local951.method48()) {
										if (local957.anInt725 == (local12 & 0x7FFF)) {
											local957.method551();
											break;
										}
									}
									if (local951.method46() == null) {
										this.aClass8ArrayArrayArray1[this.anInt934][local28][local294] = null;
									}
									this.method640(local28, local294);
								}
							}
						} else if (arg0 == 144) {
							local12 = arg1.method423();
							local21 = this.anInt891 + (local12 >> 4 & 0x7);
							local28 = this.anInt892 + (local12 & 0x7);
							local294 = arg1.method423();
							local36 = local294 >> 2;
							local41 = local294 & 0x3;
							local45 = this.anIntArray257[local36];
							if (local21 >= 0 && local28 >= 0 && local21 < 104 && local28 < 104) {
								this.method685(-1, local41, local45, local36, 0, this.anInt934, local21, local28, -1);
							}
						} else if (arg0 == 26) {
							local12 = arg1.method434();
							local21 = arg1.method424(this.anInt956);
							local28 = this.anInt891 + (local21 >> 4 & 0x7);
							local294 = this.anInt892 + (local21 & 0x7);
							local36 = arg1.method405();
							local41 = local36 >> 2;
							local45 = local36 & 0x3;
							local49 = this.anIntArray257[local41];
							if (local28 >= 0 && local294 >= 0 && local28 < 104 && local294 < 104) {
								this.method685(-1, local45, local49, local41, 0, this.anInt934, local28, local294, local12);
							}
						} else if (arg0 == 34) {
							local12 = arg1.method434();
							local21 = arg1.method433();
							local28 = arg1.method433();
							local294 = arg1.method405();
							local36 = this.anInt891 + (local294 >> 4 & 0x7);
							local41 = this.anInt892 + (local294 & 0x7);
							if (local36 >= 0 && local41 >= 0 && local36 < 104 && local41 < 104 && local12 != this.anInt1026) {
								@Pc(1178) Class1_Sub1_Sub1_Sub6 local1178 = new Class1_Sub1_Sub1_Sub6();
								local1178.anInt725 = local21;
								local1178.anInt727 = local28;
								if (this.aClass8ArrayArrayArray1[this.anInt934][local36][local41] == null) {
									this.aClass8ArrayArrayArray1[this.anInt934][local36][local41] = new Class8(0);
								}
								this.aClass8ArrayArrayArray1[this.anInt934][local36][local41].method43(local1178);
								this.method640(local36, local41);
							}
						} else if (arg0 == 247) {
							local12 = arg1.method433();
							local21 = arg1.method425(this.anInt1045);
							local28 = this.anInt891 + (local21 >> 4 & 0x7);
							local294 = this.anInt892 + (local21 & 0x7);
							local36 = arg1.method407();
							if (local28 >= 0 && local294 >= 0 && local28 < 104 && local294 < 104) {
								local957 = new Class1_Sub1_Sub1_Sub6();
								local957.anInt725 = local36;
								local957.anInt727 = local12;
								if (this.aClass8ArrayArrayArray1[this.anInt934][local28][local294] == null) {
									this.aClass8ArrayArrayArray1[this.anInt934][local28][local294] = new Class8(0);
								}
								this.aClass8ArrayArrayArray1[this.anInt934][local28][local294].method43(local957);
								this.method640(local28, local294);
							}
						} else if (arg0 == 129) {
							local12 = arg1.method405();
							local21 = this.anInt891 + (local12 >> 4 & 0x7);
							local28 = this.anInt892 + (local12 & 0x7);
							local294 = arg1.method407();
							local36 = arg1.method405();
							local41 = arg1.method407();
							if (local21 >= 0 && local28 >= 0 && local21 < 104 && local28 < 104) {
								local21 = local21 * 128 + 64;
								local28 = local28 * 128 + 64;
								@Pc(1387) Class1_Sub1_Sub1_Sub5 local1387 = new Class1_Sub1_Sub1_Sub5(false, this.anInt934, local41, local294, local28, anInt953, this.method666(local21, local28, this.anInt934) - local36, local21);
								this.aClass8_12.method43(local1387);
							}
						}
					}
				}
			}
		} catch (@Pc(1393) RuntimeException local1393) {
			signlink.reporterror("31646, " + arg0 + ", " + 255 + ", " + arg1 + ", " + local1393.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method710(@OriginalArg(1) int arg0) {
		try {
			if (arg0 >= 0) {
				@Pc(9) int local9 = this.anIntArray240[arg0];
				@Pc(14) int local14 = this.anIntArray241[arg0];
				@Pc(19) int local19 = this.anIntArray242[arg0];
				@Pc(24) int local24 = this.anIntArray243[arg0];
				this.aBoolean213 &= true;
				if (local19 >= 2000) {
					local19 -= 2000;
				}
				if (this.anInt988 != 0 && local19 != 1467) {
					this.anInt988 = 0;
					this.aBoolean228 = true;
				}
				if (local19 == 210) {
					this.aClass1_Sub1_Sub4_8.method394(132);
					this.aClass1_Sub1_Sub4_8.method396(local24);
					this.aClass1_Sub1_Sub4_8.method396(this.anInt905);
					this.aClass1_Sub1_Sub4_8.method429(local14);
					this.aClass1_Sub1_Sub4_8.method429(local9);
					this.anInt826 = 0;
					this.anInt827 = local14;
					this.anInt828 = local9;
					this.anInt829 = 2;
					if (Class24.method230(local14).anInt379 == this.anInt945) {
						this.anInt829 = 1;
					}
					if (Class24.method230(local14).anInt379 == this.anInt887) {
						this.anInt829 = 3;
					}
				}
				if (local19 == 919) {
					this.aClass1_Sub1_Sub4_8.method394(50);
					this.aClass1_Sub1_Sub4_8.method396(local9);
					this.aClass1_Sub1_Sub4_8.method430(local24);
					this.aClass1_Sub1_Sub4_8.method429(this.anInt1037);
					this.aClass1_Sub1_Sub4_8.method431(local14);
					this.aClass1_Sub1_Sub4_8.method396(this.anInt1038);
					this.aClass1_Sub1_Sub4_8.method431(this.anInt1036);
					this.anInt826 = 0;
					this.anInt827 = local14;
					this.anInt828 = local9;
					this.anInt829 = 2;
					if (Class24.method230(local14).anInt379 == this.anInt945) {
						this.anInt829 = 1;
					}
					if (Class24.method230(local14).anInt379 == this.anInt887) {
						this.anInt829 = 3;
					}
				}
				@Pc(180) Class1_Sub1_Sub1_Sub4_Sub2 local180;
				if (local19 == 310) {
					local180 = this.aClass1_Sub1_Sub1_Sub4_Sub2Array1[local24];
					if (local180 != null) {
						this.method661(0, 1, 0, 0, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0], 2, false, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0], 1, local180.anIntArray141[0], local180.anIntArray140[0]);
						this.anInt949 = super.anInt819;
						this.anInt950 = super.anInt820;
						this.anInt952 = 2;
						this.anInt951 = 0;
						this.aClass1_Sub1_Sub4_8.method394(126);
						this.aClass1_Sub1_Sub4_8.method431(local24);
					}
				}
				@Pc(241) Class1_Sub1_Sub1_Sub4_Sub1 local241;
				if (local19 == 622) {
					local241 = this.aClass1_Sub1_Sub1_Sub4_Sub1Array1[local24];
					if (local241 != null) {
						this.method661(0, 1, 0, 0, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0], 2, false, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0], 1, local241.anIntArray141[0], local241.anIntArray140[0]);
						this.anInt949 = super.anInt819;
						this.anInt950 = super.anInt820;
						this.anInt952 = 2;
						this.anInt951 = 0;
						this.aClass1_Sub1_Sub4_8.method394(59);
						this.aClass1_Sub1_Sub4_8.method396(local24);
					}
				}
				if (local19 == 136) {
					this.method599(this.anInt983);
					this.anInt983 = -1;
					this.aBoolean228 = true;
				}
				@Pc(322) int local322;
				@Pc(339) String local339;
				@Pc(343) int local343;
				@Pc(318) String local318;
				if (local19 == 480 || local19 == 189) {
					local318 = this.aStringArray13[arg0];
					local322 = local318.indexOf("@whi@");
					if (local322 != -1) {
						local318 = local318.substring(local322 + 5).trim();
						local339 = Class2.method18(Class2.method15(357, Class2.method14(local318)));
						@Pc(341) boolean local341 = false;
						for (local343 = 0; local343 < this.anInt1024; local343++) {
							@Pc(353) Class1_Sub1_Sub1_Sub4_Sub1 local353 = this.aClass1_Sub1_Sub1_Sub4_Sub1Array1[this.anIntArray268[local343]];
							if (local353 != null && local353.aString7 != null && local353.aString7.equalsIgnoreCase(local339)) {
								this.method661(0, 1, 0, 0, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0], 2, false, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0], 1, local353.anIntArray141[0], local353.anIntArray140[0]);
								if (local19 == 480) {
									anInt991++;
									if (anInt991 >= 82) {
										this.aClass1_Sub1_Sub4_8.method394(188);
										this.aClass1_Sub1_Sub4_8.method399(0);
										anInt991 = 0;
									}
									this.aClass1_Sub1_Sub4_8.method394(128);
									this.aClass1_Sub1_Sub4_8.method429(this.anIntArray268[local343]);
								}
								if (local19 == 189) {
									this.aClass1_Sub1_Sub4_8.method394(186);
									this.aClass1_Sub1_Sub4_8.method396(this.anIntArray268[local343]);
								}
								local341 = true;
								break;
							}
						}
						if (!local341) {
							this.method618("", 0, "Unable to find " + local339);
						}
					}
				}
				if (local19 == 218) {
					local180 = this.aClass1_Sub1_Sub1_Sub4_Sub2Array1[local24];
					if (local180 != null) {
						this.method661(0, 1, 0, 0, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0], 2, false, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0], 1, local180.anIntArray141[0], local180.anIntArray140[0]);
						this.anInt949 = super.anInt819;
						this.anInt950 = super.anInt820;
						this.anInt952 = 2;
						this.anInt951 = 0;
						this.aClass1_Sub1_Sub4_8.method394(29);
						this.aClass1_Sub1_Sub4_8.method429(local24);
					}
				}
				if (local19 == 221) {
					this.aClass1_Sub1_Sub4_8.method394(7);
					this.aClass1_Sub1_Sub4_8.method396(local14);
					this.aClass1_Sub1_Sub4_8.method429(local24);
					this.aClass1_Sub1_Sub4_8.method429(local9);
					this.anInt826 = 0;
					this.anInt827 = local14;
					this.anInt828 = local9;
					this.anInt829 = 2;
					if (Class24.method230(local14).anInt379 == this.anInt945) {
						this.anInt829 = 1;
					}
					if (Class24.method230(local14).anInt379 == this.anInt887) {
						this.anInt829 = 3;
					}
				}
				@Pc(599) boolean local599;
				if (local19 == 483) {
					local599 = this.method661(0, 0, 0, 0, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0], 2, false, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0], 0, local14, local9);
					if (!local599) {
						this.method661(0, 1, 0, 0, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0], 2, false, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0], 1, local14, local9);
					}
					this.anInt949 = super.anInt819;
					this.anInt950 = super.anInt820;
					this.anInt952 = 2;
					this.anInt951 = 0;
					this.aClass1_Sub1_Sub4_8.method394(144);
					this.aClass1_Sub1_Sub4_8.method429(local14 + this.anInt834);
					this.aClass1_Sub1_Sub4_8.method396(local9 + this.anInt833);
					this.aClass1_Sub1_Sub4_8.method430(local24);
				}
				if (local19 == 631) {
					if ((local24 & 0x3) == 0) {
						anInt959++;
					}
					if (anInt959 >= 96) {
						this.aClass1_Sub1_Sub4_8.method394(15);
						this.aClass1_Sub1_Sub4_8.method396(61151);
						anInt959 = 0;
					}
					this.aClass1_Sub1_Sub4_8.method394(94);
					this.aClass1_Sub1_Sub4_8.method429(local24);
					this.aClass1_Sub1_Sub4_8.method429(local9);
					this.aClass1_Sub1_Sub4_8.method396(local14);
					this.anInt826 = 0;
					this.anInt827 = local14;
					this.anInt828 = local9;
					this.anInt829 = 2;
					if (Class24.method230(local14).anInt379 == this.anInt945) {
						this.anInt829 = 1;
					}
					if (Class24.method230(local14).anInt379 == this.anInt887) {
						this.anInt829 = 3;
					}
				}
				if (local19 == 526) {
					this.method712(349);
				}
				@Pc(766) String local766;
				@Pc(747) Class24 local747;
				if (local19 == 738) {
					local747 = Class24.method230(local14);
					this.anInt904 = 1;
					this.anInt905 = local14;
					this.anInt906 = local747.anInt357;
					this.anInt1035 = 0;
					this.aBoolean219 = true;
					local766 = local747.aString10;
					if (local766.indexOf(" ") != -1) {
						local766 = local766.substring(0, local766.indexOf(" "));
					}
					local339 = local747.aString10;
					if (local339.indexOf(" ") != -1) {
						local339 = local339.substring(local339.indexOf(" ") + 1);
					}
					this.aString25 = local766 + " " + local747.aString11 + " " + local339;
					if (this.anInt906 == 16) {
						this.aBoolean219 = true;
						this.anInt1044 = 3;
						this.aBoolean231 = true;
					}
				} else {
					@Pc(848) long local848;
					if (local19 == 444) {
						local318 = this.aStringArray13[arg0];
						local322 = local318.indexOf("@whi@");
						if (local322 != -1) {
							local848 = Class2.method14(local318.substring(local322 + 5).trim());
							local343 = -1;
							for (@Pc(852) int local852 = 0; local852 < this.anInt977; local852++) {
								if (this.aLongArray4[local852] == local848) {
									local343 = local852;
									break;
								}
							}
							if (local343 != -1 && this.anIntArray213[local343] > 0) {
								this.aBoolean228 = true;
								this.anInt988 = 0;
								this.aBoolean197 = true;
								this.aString22 = "";
								this.anInt875 = 3;
								this.aLong29 = this.aLongArray4[local343];
								this.aString18 = "Enter message to send to " + this.aStringArray14[local343];
							}
						}
					}
					if (local19 == 87) {
						this.method688(local9, local14, local24, (byte) 8);
						this.aClass1_Sub1_Sub4_8.method394(134);
						this.aClass1_Sub1_Sub4_8.method430(local9 + this.anInt833);
						this.aClass1_Sub1_Sub4_8.method396(local14 + this.anInt834);
						this.aClass1_Sub1_Sub4_8.method431(local24 >> 14 & 0x7FFF);
					}
					if (local19 == 879) {
						local599 = this.method661(0, 0, 0, 0, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0], 2, false, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0], 0, local14, local9);
						if (!local599) {
							this.method661(0, 1, 0, 0, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0], 2, false, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0], 1, local14, local9);
						}
						this.anInt949 = super.anInt819;
						this.anInt950 = super.anInt820;
						this.anInt952 = 2;
						this.anInt951 = 0;
						this.aClass1_Sub1_Sub4_8.method394(136);
						this.aClass1_Sub1_Sub4_8.method396(local24);
						this.aClass1_Sub1_Sub4_8.method429(local14 + this.anInt834);
						this.aClass1_Sub1_Sub4_8.method430(local9 + this.anInt833);
					}
					if (local19 == 138) {
						local180 = this.aClass1_Sub1_Sub1_Sub4_Sub2Array1[local24];
						if (local180 != null) {
							this.method661(0, 1, 0, 0, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0], 2, false, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0], 1, local180.anIntArray141[0], local180.anIntArray140[0]);
							this.anInt949 = super.anInt819;
							this.anInt950 = super.anInt820;
							this.anInt952 = 2;
							this.anInt951 = 0;
							this.aClass1_Sub1_Sub4_8.method394(203);
							this.aClass1_Sub1_Sub4_8.method429(local24);
						}
					}
					if (local19 == 207) {
						this.aClass1_Sub1_Sub4_8.method394(73);
						this.aClass1_Sub1_Sub4_8.method396(local14);
						this.aClass1_Sub1_Sub4_8.method429(local24);
						this.aClass1_Sub1_Sub4_8.method429(local9);
						this.anInt826 = 0;
						this.anInt827 = local14;
						this.anInt828 = local9;
						this.anInt829 = 2;
						if (Class24.method230(local14).anInt379 == this.anInt945) {
							this.anInt829 = 1;
						}
						if (Class24.method230(local14).anInt379 == this.anInt887) {
							this.anInt829 = 3;
						}
					}
					if (local19 == 769) {
						local599 = this.method661(0, 0, 0, 0, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0], 2, false, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0], 0, local14, local9);
						if (!local599) {
							this.method661(0, 1, 0, 0, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0], 2, false, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0], 1, local14, local9);
						}
						this.anInt949 = super.anInt819;
						this.anInt950 = super.anInt820;
						this.anInt952 = 2;
						this.anInt951 = 0;
						this.aClass1_Sub1_Sub4_8.method394(88);
						this.aClass1_Sub1_Sub4_8.method430(local9 + this.anInt833);
						this.aClass1_Sub1_Sub4_8.method396(this.anInt905);
						this.aClass1_Sub1_Sub4_8.method430(local24);
						this.aClass1_Sub1_Sub4_8.method396(local14 + this.anInt834);
					}
					if (local19 == 389) {
						local180 = this.aClass1_Sub1_Sub1_Sub4_Sub2Array1[local24];
						if (local180 != null) {
							this.method661(0, 1, 0, 0, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0], 2, false, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0], 1, local180.anIntArray141[0], local180.anIntArray140[0]);
							this.anInt949 = super.anInt819;
							this.anInt950 = super.anInt820;
							this.anInt952 = 2;
							this.anInt951 = 0;
							this.aClass1_Sub1_Sub4_8.method394(117);
							this.aClass1_Sub1_Sub4_8.method396(this.anInt905);
							this.aClass1_Sub1_Sub4_8.method429(local24);
						}
					}
					if (local19 == 669) {
						local241 = this.aClass1_Sub1_Sub1_Sub4_Sub1Array1[local24];
						if (local241 != null) {
							this.method661(0, 1, 0, 0, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0], 2, false, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0], 1, local241.anIntArray141[0], local241.anIntArray140[0]);
							this.anInt949 = super.anInt819;
							this.anInt950 = super.anInt820;
							this.anInt952 = 2;
							this.anInt951 = 0;
							this.aClass1_Sub1_Sub4_8.method394(34);
							this.aClass1_Sub1_Sub4_8.method430(this.anInt1036);
							this.aClass1_Sub1_Sub4_8.method431(local24);
							this.aClass1_Sub1_Sub4_8.method429(this.anInt1038);
							this.aClass1_Sub1_Sub4_8.method396(this.anInt1037);
						}
					}
					if (local19 == 228) {
						this.aClass1_Sub1_Sub4_8.method394(208);
						this.aClass1_Sub1_Sub4_8.method430(local9);
						this.aClass1_Sub1_Sub4_8.method429(local14);
						this.aClass1_Sub1_Sub4_8.method430(local24);
						this.anInt826 = 0;
						this.anInt827 = local14;
						this.anInt828 = local9;
						this.anInt829 = 2;
						if (Class24.method230(local14).anInt379 == this.anInt945) {
							this.anInt829 = 1;
						}
						if (Class24.method230(local14).anInt379 == this.anInt887) {
							this.anInt829 = 3;
						}
					}
					@Pc(1443) Class39 local1443;
					if (local19 == 1826) {
						local1443 = Class39.method488(local24);
						@Pc(1446) Class24 local1446 = Class24.method230(local14);
						if (local1446 != null && local1446.anIntArray124[local9] >= 100000) {
							local766 = local1446.anIntArray124[local9] + " x " + local1443.aString16;
						} else if (local1443.aByteArray17 == null) {
							local766 = "It's a " + local1443.aString16 + ".";
						} else {
							local766 = new String(local1443.aByteArray17);
						}
						this.method618("", 0, local766);
					}
					if (local19 == 675) {
						this.aClass1_Sub1_Sub4_8.method394(104);
						this.aClass1_Sub1_Sub4_8.method430(local24);
						this.aClass1_Sub1_Sub4_8.method429(local9);
						this.aClass1_Sub1_Sub4_8.method396(local14);
						this.anInt826 = 0;
						this.anInt827 = local14;
						this.anInt828 = local9;
						this.anInt829 = 2;
						if (Class24.method230(local14).anInt379 == this.anInt945) {
							this.anInt829 = 1;
						}
						if (Class24.method230(local14).anInt379 == this.anInt887) {
							this.anInt829 = 3;
						}
					}
					if (local19 == 227) {
						local180 = this.aClass1_Sub1_Sub1_Sub4_Sub2Array1[local24];
						if (local180 != null) {
							this.method661(0, 1, 0, 0, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0], 2, false, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0], 1, local180.anIntArray141[0], local180.anIntArray140[0]);
							this.anInt949 = super.anInt819;
							this.anInt950 = super.anInt820;
							this.anInt952 = 2;
							this.anInt951 = 0;
							this.aClass1_Sub1_Sub4_8.method394(78);
							this.aClass1_Sub1_Sub4_8.method430(this.anInt1037);
							this.aClass1_Sub1_Sub4_8.method431(this.anInt1038);
							this.aClass1_Sub1_Sub4_8.method431(this.anInt1036);
							this.aClass1_Sub1_Sub4_8.method431(local24);
						}
					}
					if (local19 == 685) {
						local241 = this.aClass1_Sub1_Sub1_Sub4_Sub1Array1[local24];
						if (local241 != null) {
							this.method661(0, 1, 0, 0, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0], 2, false, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0], 1, local241.anIntArray141[0], local241.anIntArray140[0]);
							this.anInt949 = super.anInt819;
							this.anInt950 = super.anInt820;
							this.anInt952 = 2;
							this.anInt951 = 0;
							this.aClass1_Sub1_Sub4_8.method394(186);
							this.aClass1_Sub1_Sub4_8.method396(local24);
						}
					}
					if (local19 == 77) {
						local599 = this.method661(0, 0, 0, 0, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0], 2, false, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0], 0, local14, local9);
						if (!local599) {
							this.method661(0, 1, 0, 0, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0], 2, false, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0], 1, local14, local9);
						}
						this.anInt949 = super.anInt819;
						this.anInt950 = super.anInt820;
						this.anInt952 = 2;
						this.anInt951 = 0;
						this.aClass1_Sub1_Sub4_8.method394(235);
						this.aClass1_Sub1_Sub4_8.method430(local24);
						this.aClass1_Sub1_Sub4_8.method396(local9 + this.anInt833);
						this.aClass1_Sub1_Sub4_8.method431(local14 + this.anInt834);
					}
					if (local19 == 941) {
						this.aClass1_Sub1_Sub4_8.method394(133);
						this.aClass1_Sub1_Sub4_8.method429(local24);
						this.aClass1_Sub1_Sub4_8.method431(local14);
						this.aClass1_Sub1_Sub4_8.method429(local9);
						this.anInt826 = 0;
						this.anInt827 = local14;
						this.anInt828 = local9;
						this.anInt829 = 2;
						if (Class24.method230(local14).anInt379 == this.anInt945) {
							this.anInt829 = 1;
						}
						if (Class24.method230(local14).anInt379 == this.anInt887) {
							this.anInt829 = 3;
						}
					}
					if (local19 == 707) {
						this.method688(local9, local14, local24, (byte) 8);
						this.aClass1_Sub1_Sub4_8.method394(116);
						this.aClass1_Sub1_Sub4_8.method430(local14 + this.anInt834);
						this.aClass1_Sub1_Sub4_8.method429(local24 >> 14 & 0x7FFF);
						this.aClass1_Sub1_Sub4_8.method396(local9 + this.anInt833);
					}
					if (local19 == 94) {
						this.aClass1_Sub1_Sub4_8.method394(192);
						this.aClass1_Sub1_Sub4_8.method396(local14);
						this.aClass1_Sub1_Sub4_8.method396(local24);
						this.aClass1_Sub1_Sub4_8.method396(local9);
						this.anInt826 = 0;
						this.anInt827 = local14;
						this.anInt828 = local9;
						this.anInt829 = 2;
						if (Class24.method230(local14).anInt379 == this.anInt945) {
							this.anInt829 = 1;
						}
						if (Class24.method230(local14).anInt379 == this.anInt887) {
							this.anInt829 = 3;
						}
					}
					if (local19 == 821) {
						if (this.aBoolean230) {
							this.aClass10_1.method92((byte) 1, local14 - 4, local9 - 4);
						} else {
							this.aClass10_1.method92((byte) 1, super.anInt820 - 4, super.anInt819 - 4);
						}
					}
					if (local19 == 883) {
						this.aClass1_Sub1_Sub4_8.method394(221);
						this.aClass1_Sub1_Sub4_8.method431(local24);
						this.aClass1_Sub1_Sub4_8.method431(local9);
						this.aClass1_Sub1_Sub4_8.method431(local14);
						this.anInt826 = 0;
						this.anInt827 = local14;
						this.anInt828 = local9;
						this.anInt829 = 2;
						if (Class24.method230(local14).anInt379 == this.anInt945) {
							this.anInt829 = 1;
						}
						if (Class24.method230(local14).anInt379 == this.anInt887) {
							this.anInt829 = 3;
						}
					}
					if (local19 == 749) {
						local241 = this.aClass1_Sub1_Sub1_Sub4_Sub1Array1[local24];
						if (local241 != null) {
							this.method661(0, 1, 0, 0, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0], 2, false, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0], 1, local241.anIntArray141[0], local241.anIntArray140[0]);
							this.anInt949 = super.anInt819;
							this.anInt950 = super.anInt820;
							this.anInt952 = 2;
							this.anInt951 = 0;
							anInt991++;
							if (anInt991 >= 82) {
								this.aClass1_Sub1_Sub4_8.method394(188);
								this.aClass1_Sub1_Sub4_8.method399(0);
								anInt991 = 0;
							}
							this.aClass1_Sub1_Sub4_8.method394(128);
							this.aClass1_Sub1_Sub4_8.method429(local24);
						}
					}
					if (local19 == 453 && this.method688(local9, local14, local24, (byte) 8)) {
						this.aClass1_Sub1_Sub4_8.method394(181);
						this.aClass1_Sub1_Sub4_8.method396(this.anInt1037);
						this.aClass1_Sub1_Sub4_8.method429(this.anInt1038);
						this.aClass1_Sub1_Sub4_8.method430(this.anInt1036);
						this.aClass1_Sub1_Sub4_8.method431(local24 >> 14 & 0x7FFF);
						this.aClass1_Sub1_Sub4_8.method429(local9 + this.anInt833);
						this.aClass1_Sub1_Sub4_8.method430(local14 + this.anInt834);
					}
					if (local19 == 1013) {
						local180 = this.aClass1_Sub1_Sub1_Sub4_Sub2Array1[local24];
						if (local180 != null) {
							@Pc(2150) Class29 local2150 = local180.aClass29_2;
							if (local2150.anIntArray146 != null) {
								local2150 = local2150.method325();
							}
							if (local2150 != null) {
								if (local2150.aByteArray7 == null) {
									local339 = "It's a " + local2150.aString14 + ".";
								} else {
									local339 = new String(local2150.aByteArray7);
								}
								this.method618("", 0, local339);
							}
						}
					}
					if (local19 == 491) {
						local599 = this.method661(0, 0, 0, 0, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0], 2, false, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0], 0, local14, local9);
						if (!local599) {
							this.method661(0, 1, 0, 0, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0], 2, false, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0], 1, local14, local9);
						}
						this.anInt949 = super.anInt819;
						this.anInt950 = super.anInt820;
						this.anInt952 = 2;
						this.anInt951 = 0;
						if ((this.anInt834 & 0x3) == 0) {
							anInt913++;
						}
						if (anInt913 >= 108) {
							this.aClass1_Sub1_Sub4_8.method394(159);
							this.aClass1_Sub1_Sub4_8.method398(4963834);
							anInt913 = 0;
						}
						this.aClass1_Sub1_Sub4_8.method394(160);
						this.aClass1_Sub1_Sub4_8.method396(local24);
						this.aClass1_Sub1_Sub4_8.method429(local14 + this.anInt834);
						this.aClass1_Sub1_Sub4_8.method431(local9 + this.anInt833);
					}
					if (local19 == 455) {
						local599 = this.method661(0, 0, 0, 0, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0], 2, false, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0], 0, local14, local9);
						if (!local599) {
							this.method661(0, 1, 0, 0, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0], 2, false, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0], 1, local14, local9);
						}
						this.anInt949 = super.anInt819;
						this.anInt950 = super.anInt820;
						this.anInt952 = 2;
						this.anInt951 = 0;
						this.aClass1_Sub1_Sub4_8.method394(40);
						this.aClass1_Sub1_Sub4_8.method430(local9 + this.anInt833);
						this.aClass1_Sub1_Sub4_8.method396(local24);
						this.aClass1_Sub1_Sub4_8.method429(local14 + this.anInt834);
					}
					if (local19 == 1198) {
						this.method688(local9, local14, local24, (byte) 8);
						this.aClass1_Sub1_Sub4_8.method394(31);
						this.aClass1_Sub1_Sub4_8.method396(local24 >> 14 & 0x7FFF);
						this.aClass1_Sub1_Sub4_8.method396(local14 + this.anInt834);
						this.aClass1_Sub1_Sub4_8.method431(local9 + this.anInt833);
					}
					if (local19 == 544) {
						local241 = this.aClass1_Sub1_Sub1_Sub4_Sub1Array1[local24];
						if (local241 != null) {
							this.method661(0, 1, 0, 0, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0], 2, false, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0], 1, local241.anIntArray141[0], local241.anIntArray140[0]);
							this.anInt949 = super.anInt819;
							this.anInt950 = super.anInt820;
							this.anInt952 = 2;
							this.anInt951 = 0;
							this.aClass1_Sub1_Sub4_8.method394(167);
							this.aClass1_Sub1_Sub4_8.method431(local24);
							this.aClass1_Sub1_Sub4_8.method430(this.anInt905);
						}
					}
					if (local19 == 256) {
						this.aClass1_Sub1_Sub4_8.method394(16);
						this.aClass1_Sub1_Sub4_8.method396(local14);
						local747 = Class24.method230(local14);
						if (local747.anIntArrayArray12 != null && local747.anIntArrayArray12[0][0] == 5) {
							local322 = local747.anIntArrayArray12[0][1];
							this.anIntArray231[local322] = 1 - this.anIntArray231[local322];
							this.method611(local322);
							this.aBoolean219 = true;
						}
					}
					if (local19 == 1648) {
						@Pc(2546) int local2546 = local24 >> 14 & 0x7FFF;
						@Pc(2549) Class32 local2549 = Class32.method345(local2546);
						if (local2549.aByteArray9 == null) {
							local339 = "It's a " + local2549.aString15 + ".";
						} else {
							local339 = new String(local2549.aByteArray9);
						}
						this.method618("", 0, local339);
					}
					if (local19 == 192 && !this.aBoolean206) {
						this.aClass1_Sub1_Sub4_8.method394(33);
						this.aClass1_Sub1_Sub4_8.method396(local14);
						this.aBoolean206 = true;
					}
					if (local19 == 956) {
						local599 = this.method661(0, 0, 0, 0, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0], 2, false, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0], 0, local14, local9);
						if (!local599) {
							this.method661(0, 1, 0, 0, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0], 2, false, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0], 1, local14, local9);
						}
						this.anInt949 = super.anInt819;
						this.anInt950 = super.anInt820;
						this.anInt952 = 2;
						this.anInt951 = 0;
						this.aClass1_Sub1_Sub4_8.method394(10);
						this.aClass1_Sub1_Sub4_8.method429(local24);
						this.aClass1_Sub1_Sub4_8.method430(this.anInt1038);
						this.aClass1_Sub1_Sub4_8.method396(local9 + this.anInt833);
						this.aClass1_Sub1_Sub4_8.method431(local14 + this.anInt834);
						this.aClass1_Sub1_Sub4_8.method430(this.anInt1036);
						this.aClass1_Sub1_Sub4_8.method431(this.anInt1037);
					}
					if (local19 == 832) {
						local241 = this.aClass1_Sub1_Sub1_Sub4_Sub1Array1[local24];
						if (local241 != null) {
							this.method661(0, 1, 0, 0, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0], 2, false, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0], 1, local241.anIntArray141[0], local241.anIntArray140[0]);
							this.anInt949 = super.anInt819;
							this.anInt950 = super.anInt820;
							this.anInt952 = 2;
							this.anInt951 = 0;
							anInt955++;
							if (anInt955 >= 78) {
								this.aClass1_Sub1_Sub4_8.method394(227);
								this.aClass1_Sub1_Sub4_8.method398(16243839);
								anInt955 = 0;
							}
							this.aClass1_Sub1_Sub4_8.method394(47);
							this.aClass1_Sub1_Sub4_8.method431(local24);
						}
					}
					if (local19 == 379) {
						this.aClass1_Sub1_Sub4_8.method394(36);
						this.aClass1_Sub1_Sub4_8.method396(local9);
						this.aClass1_Sub1_Sub4_8.method429(local24);
						this.aClass1_Sub1_Sub4_8.method396(local14);
						this.anInt826 = 0;
						this.anInt827 = local14;
						this.anInt828 = local9;
						this.anInt829 = 2;
						if (Class24.method230(local14).anInt379 == this.anInt945) {
							this.anInt829 = 1;
						}
						if (Class24.method230(local14).anInt379 == this.anInt887) {
							this.anInt829 = 3;
						}
					}
					if (local19 == 1914) {
						local1443 = Class39.method488(local24);
						if (local1443.aByteArray17 == null) {
							local766 = "It's a " + local1443.aString16 + ".";
						} else {
							local766 = new String(local1443.aByteArray17);
						}
						this.method618("", 0, local766);
					}
					if (local19 == 128) {
						local747 = Class24.method230(local14);
						@Pc(2871) boolean local2871 = true;
						if (local747.anInt359 > 0) {
							local2871 = this.method593(local747);
						}
						if (local2871) {
							this.aClass1_Sub1_Sub4_8.method394(16);
							this.aClass1_Sub1_Sub4_8.method396(local14);
						}
					}
					if (local19 == 405) {
						this.method688(local9, local14, local24, (byte) 8);
						this.aClass1_Sub1_Sub4_8.method394(239);
						this.aClass1_Sub1_Sub4_8.method396(local24 >> 14 & 0x7FFF);
						this.aClass1_Sub1_Sub4_8.method429(local9 + this.anInt833);
						this.aClass1_Sub1_Sub4_8.method430(local14 + this.anInt834);
					}
					if (local19 == 839 || local19 == 673 || local19 == 613 || local19 == 557) {
						local318 = this.aStringArray13[arg0];
						local322 = local318.indexOf("@whi@");
						if (local322 != -1) {
							local848 = Class2.method14(local318.substring(local322 + 5).trim());
							if (local19 == 839) {
								this.method630(local848);
							}
							if (local19 == 673) {
								this.method604(local848);
							}
							if (local19 == 613) {
								this.method639(local848);
							}
							if (local19 == 557) {
								this.method607(659, local848);
							}
						}
					}
					if (local19 == 745) {
						local180 = this.aClass1_Sub1_Sub1_Sub4_Sub2Array1[local24];
						if (local180 != null) {
							this.method661(0, 1, 0, 0, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0], 2, false, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0], 1, local180.anIntArray141[0], local180.anIntArray140[0]);
							this.anInt949 = super.anInt819;
							this.anInt950 = super.anInt820;
							this.anInt952 = 2;
							this.anInt951 = 0;
							anInt914 += local24;
							if (anInt914 >= 65) {
								this.aClass1_Sub1_Sub4_8.method394(0);
								anInt914 = 0;
							}
							this.aClass1_Sub1_Sub4_8.method394(163);
							this.aClass1_Sub1_Sub4_8.method396(local24);
						}
					}
					if (local19 == 530) {
						local241 = this.aClass1_Sub1_Sub1_Sub4_Sub1Array1[local24];
						if (local241 != null) {
							this.method661(0, 1, 0, 0, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0], 2, false, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0], 1, local241.anIntArray141[0], local241.anIntArray140[0]);
							this.anInt949 = super.anInt819;
							this.anInt950 = super.anInt820;
							this.anInt952 = 2;
							this.anInt951 = 0;
							this.aClass1_Sub1_Sub4_8.method394(153);
							this.aClass1_Sub1_Sub4_8.method430(local24);
						}
					}
					if (local19 == 211) {
						this.aClass1_Sub1_Sub4_8.method394(16);
						this.aClass1_Sub1_Sub4_8.method396(local14);
						local747 = Class24.method230(local14);
						if (local747.anIntArrayArray12 != null && local747.anIntArrayArray12[0][0] == 5) {
							local322 = local747.anIntArrayArray12[0][1];
							if (this.anIntArray231[local322] != local747.anIntArray119[0]) {
								this.anIntArray231[local322] = local747.anIntArray119[0];
								this.method611(local322);
								this.aBoolean219 = true;
							}
						}
					}
					if (local19 == 424) {
						if ((local9 & 0x3) == 0) {
							anInt837++;
						}
						if (anInt837 >= 54) {
							this.aClass1_Sub1_Sub4_8.method394(247);
							this.aClass1_Sub1_Sub4_8.method399(0);
							anInt837 = 0;
						}
						this.method688(local9, local14, local24, (byte) 8);
						this.aClass1_Sub1_Sub4_8.method394(57);
						this.aClass1_Sub1_Sub4_8.method396(local9 + this.anInt833);
						this.aClass1_Sub1_Sub4_8.method430(local14 + this.anInt834);
						this.aClass1_Sub1_Sub4_8.method431(local24 >> 14 & 0x7FFF);
					}
					if (local19 == 591) {
						local318 = this.aStringArray13[arg0];
						local322 = local318.indexOf("@whi@");
						if (local322 != -1) {
							if (this.anInt945 == -1) {
								this.method712(349);
								this.aString30 = local318.substring(local322 + 5).trim();
								this.aBoolean225 = false;
								this.anInt924 = this.anInt945 = Class24.anInt373;
							} else {
								this.method618("", 0, "Please close the interface you have open before using 'report abuse'");
							}
						}
					}
					if (local19 == 23 && this.method688(local9, local14, local24, (byte) 8)) {
						this.aClass1_Sub1_Sub4_8.method394(80);
						this.aClass1_Sub1_Sub4_8.method396(local24 >> 14 & 0x7FFF);
						this.aClass1_Sub1_Sub4_8.method431(this.anInt905);
						this.aClass1_Sub1_Sub4_8.method430(local14 + this.anInt834);
						this.aClass1_Sub1_Sub4_8.method429(local9 + this.anInt833);
					}
					if (local19 == 616) {
						local180 = this.aClass1_Sub1_Sub1_Sub4_Sub2Array1[local24];
						if (local180 != null) {
							this.method661(0, 1, 0, 0, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray140[0], 2, false, aClass1_Sub1_Sub1_Sub4_Sub1_1.anIntArray141[0], 1, local180.anIntArray141[0], local180.anIntArray140[0]);
							this.anInt949 = super.anInt819;
							this.anInt950 = super.anInt820;
							this.anInt952 = 2;
							this.anInt951 = 0;
							this.aClass1_Sub1_Sub4_8.method394(14);
							this.aClass1_Sub1_Sub4_8.method430(local24);
						}
					}
					if (local19 == 860) {
						this.anInt1035 = 1;
						this.anInt1036 = local9;
						this.anInt1037 = local14;
						this.anInt1038 = local24;
						this.aString31 = String.valueOf(Class39.method488(local24).aString16);
						this.anInt904 = 0;
						this.aBoolean219 = true;
					} else {
						if (local19 == 292) {
							this.aClass1_Sub1_Sub4_8.method394(172);
							this.aClass1_Sub1_Sub4_8.method430(local14);
							this.aClass1_Sub1_Sub4_8.method430(local24);
							this.aClass1_Sub1_Sub4_8.method430(local9);
							this.anInt826 = 0;
							this.anInt827 = local14;
							this.anInt828 = local9;
							this.anInt829 = 2;
							if (Class24.method230(local14).anInt379 == this.anInt945) {
								this.anInt829 = 1;
							}
							if (Class24.method230(local14).anInt379 == this.anInt887) {
								this.anInt829 = 3;
							}
						}
						this.anInt1035 = 0;
						this.anInt904 = 0;
						this.aBoolean219 = true;
					}
				}
			}
		} catch (@Pc(3487) RuntimeException local3487) {
			signlink.reporterror("14978, " + true + ", " + arg0 + ", " + local3487.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(B)V")
	private void method711() {
		try {
			this.aBoolean195 = false;
			while (this.aBoolean194) {
				this.aBoolean195 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass1_Sub1_Sub2_Sub4_9 = null;
			this.aClass1_Sub1_Sub2_Sub4_10 = null;
			this.aClass1_Sub1_Sub2_Sub4Array3 = null;
			this.anIntArray262 = null;
			this.anIntArray263 = null;
			this.anIntArray264 = null;
			this.anIntArray265 = null;
			this.anIntArray224 = null;
			this.anIntArray225 = null;
			this.anIntArray232 = null;
			this.anIntArray233 = null;
			this.aClass1_Sub1_Sub2_Sub1_6 = null;
			this.aClass1_Sub1_Sub2_Sub1_7 = null;
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("25633, " + 62 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method581() {
		try {
			this.aBoolean217 = true;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("12931, " + 6 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method712(@OriginalArg(0) int arg0) {
		try {
			this.aClass1_Sub1_Sub4_8.method394(30);
			@Pc(8) boolean local8 = false;
			if (this.anInt908 != -1) {
				this.method599(this.anInt908);
				this.anInt908 = -1;
				this.aBoolean219 = true;
				this.aBoolean206 = false;
				this.aBoolean231 = true;
			}
			if (this.anInt887 != -1) {
				this.method599(this.anInt887);
				this.anInt887 = -1;
				this.aBoolean228 = true;
				this.aBoolean206 = false;
			}
			if (this.anInt999 != -1) {
				this.method599(this.anInt999);
				this.anInt999 = -1;
				this.aBoolean217 = true;
			}
			if (this.anInt866 != -1) {
				this.method599(this.anInt866);
				this.anInt866 = -1;
			}
			if (this.anInt945 != -1) {
				this.method599(this.anInt945);
				this.anInt945 = -1;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("57799, " + arg0 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method713() {
		try {
			@Pc(17) int local17;
			if (this.anInt932 > 0) {
				for (local17 = 0; local17 < 256; local17++) {
					if (this.anInt932 > 768) {
						this.anIntArray262[local17] = this.method603(1024 - this.anInt932, this.anIntArray264[local17], this.anIntArray263[local17]);
					} else if (this.anInt932 > 256) {
						this.anIntArray262[local17] = this.anIntArray264[local17];
					} else {
						this.anIntArray262[local17] = this.method603(256 - this.anInt932, this.anIntArray263[local17], this.anIntArray264[local17]);
					}
				}
			} else if (this.anInt933 > 0) {
				for (local17 = 0; local17 < 256; local17++) {
					if (this.anInt933 > 768) {
						this.anIntArray262[local17] = this.method603(1024 - this.anInt933, this.anIntArray265[local17], this.anIntArray263[local17]);
					} else if (this.anInt933 > 256) {
						this.anIntArray262[local17] = this.anIntArray265[local17];
					} else {
						this.anIntArray262[local17] = this.method603(256 - this.anInt933, this.anIntArray263[local17], this.anIntArray265[local17]);
					}
				}
			} else {
				for (local17 = 0; local17 < 256; local17++) {
					this.anIntArray262[local17] = this.anIntArray263[local17];
				}
			}
			for (local17 = 0; local17 < 33920; local17++) {
				this.aClass18_15.anIntArray98[local17] = this.aClass1_Sub1_Sub2_Sub1_6.anIntArray128[local17];
			}
			@Pc(188) int local188 = 0;
			@Pc(190) int local190 = 1152;
			@Pc(205) int local205;
			@Pc(209) int local209;
			@Pc(219) int local219;
			@Pc(227) int local227;
			@Pc(231) int local231;
			@Pc(235) int local235;
			@Pc(246) int local246;
			for (@Pc(192) int local192 = 1; local192 < 255; local192++) {
				local205 = this.anIntArray273[local192] * (256 - local192) / 256;
				local209 = local205 + 22;
				if (local209 < 0) {
					local209 = 0;
				}
				local188 += local209;
				for (local219 = local209; local219 < 128; local219++) {
					local227 = this.anIntArray232[local188++];
					if (local227 == 0) {
						local190++;
					} else {
						local231 = local227;
						local235 = 256 - local227;
						local227 = this.anIntArray262[local227];
						local246 = this.aClass18_15.anIntArray98[local190];
						this.aClass18_15.anIntArray98[local190++] = ((local227 & 0xFF00FF) * local231 + (local246 & 0xFF00FF) * local235 & 0xFF00FF00) + ((local227 & 0xFF00) * local231 + (local246 & 0xFF00) * local235 & 0xFF0000) >> 8;
					}
				}
				local190 += local209;
			}
			this.aClass18_15.method190(796, 0, 0, super.aGraphics2);
			for (local205 = 0; local205 < 33920; local205++) {
				this.aClass18_16.anIntArray98[local205] = this.aClass1_Sub1_Sub2_Sub1_7.anIntArray128[local205];
			}
			local188 = 0;
			local190 = 1176;
			for (local209 = 1; local209 < 255; local209++) {
				local219 = this.anIntArray273[local209] * (256 - local209) / 256;
				local227 = 103 - local219;
				local190 += local219;
				for (local231 = 0; local231 < local227; local231++) {
					local235 = this.anIntArray232[local188++];
					if (local235 == 0) {
						local190++;
					} else {
						local246 = local235;
						@Pc(369) int local369 = 256 - local235;
						local235 = this.anIntArray262[local235];
						@Pc(380) int local380 = this.aClass18_16.anIntArray98[local190];
						this.aClass18_16.anIntArray98[local190++] = ((local235 & 0xFF00FF) * local246 + (local380 & 0xFF00FF) * local369 & 0xFF00FF00) + ((local235 & 0xFF00) * local246 + (local380 & 0xFF00) * local369 & 0xFF0000) >> 8;
					}
				}
				local188 += 128 - local227;
				local190 += 128 - local227 - local219;
			}
			this.aClass18_16.method190(796, 0, 637, super.aGraphics2);
		} catch (@Pc(452) RuntimeException local452) {
			signlink.reporterror("50585, " + false + ", " + local452.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)V")
	private void method714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			this.aClass1_Sub1_Sub2_Sub4_19.method570(arg0, arg3);
			this.aClass1_Sub1_Sub2_Sub4_20.method570(arg0 + arg4 - 16, arg3);
			Class1_Sub1_Sub2.method558(this.anInt1008, arg4 - 32, arg3, 16, arg0 + 16);
			@Pc(35) int local35 = (arg4 - 32) * arg4 / arg2;
			if (local35 < 8) {
				local35 = 8;
			}
			@Pc(52) int local52 = (arg4 - local35 - 32) * arg5 / (arg2 - arg4);
			this.anInt961 += arg1;
			Class1_Sub1_Sub2.method558(this.anInt958, local35, arg3, 16, arg0 + local52 + 16);
			Class1_Sub1_Sub2.method563(arg0 + local52 + 16, arg3, this.anInt935, local35);
			Class1_Sub1_Sub2.method563(arg0 + local52 + 16, arg3 + 1, this.anInt935, local35);
			Class1_Sub1_Sub2.method561(arg3, 16, this.anInt935, arg0 + local52 + 16);
			Class1_Sub1_Sub2.method561(arg3, 16, this.anInt935, arg0 + local52 + 17);
			Class1_Sub1_Sub2.method563(arg0 + local52 + 16, arg3 + 15, this.anInt1021, local35);
			Class1_Sub1_Sub2.method563(arg0 + local52 + 17, arg3 + 14, this.anInt1021, local35 - 1);
			Class1_Sub1_Sub2.method561(arg3, 16, this.anInt1021, arg0 + local52 + local35 + 15);
			Class1_Sub1_Sub2.method561(arg3 + 1, 15, this.anInt1021, arg0 + local52 + local35 + 14);
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("97199, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method715() {
		try {
			if (aBoolean234 && this.anInt931 == 2 && Class45.anInt742 != this.anInt934) {
				this.method602("Loading - please wait.", null);
				this.anInt931 = 1;
				this.aLong33 = System.currentTimeMillis();
			}
			if (this.anInt931 == 1) {
				@Pc(34) int local34 = this.method716();
				if (local34 != 0 && System.currentTimeMillis() - this.aLong33 > 360000L) {
					signlink.reporterror(this.aString28 + " glcfb " + this.aLong31 + "," + local34 + "," + aBoolean234 + "," + this.aClass47Array1[0] + "," + this.aClass4_Sub1_1.method115() + "," + this.anInt934 + "," + this.anInt854 + "," + this.anInt855);
					this.aLong33 = System.currentTimeMillis();
				}
			}
			if (this.anInt931 == 2 && this.anInt934 != this.anInt1007) {
				this.anInt1007 = this.anInt934;
				this.method649(this.anInt934);
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("78899, " + 1247 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)I")
	private int method716() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray5.length; local3++) {
				if (this.aByteArrayArray5[local3] == null && this.anIntArray250[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray6[local3] == null && this.anIntArray251[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(41) int local41 = 0; local41 < this.aByteArrayArray5.length; local41++) {
				@Pc(48) byte[] local48 = this.aByteArrayArray6[local41];
				if (local48 != null) {
					@Pc(62) int local62 = (this.anIntArray249[local41] >> 8) * 64 - this.anInt833;
					@Pc(74) int local74 = (this.anIntArray249[local41] & 0xFF) * 64 - this.anInt834;
					if (this.aBoolean235) {
						local62 = 10;
						local74 = 10;
					}
					local39 &= Class45.method517(local48, local62, local74);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean212) {
				return -4;
			} else {
				this.anInt931 = 2;
				Class45.anInt742 = this.anInt934;
				this.method691(this.anInt876);
				this.aClass1_Sub1_Sub4_8.method394(138);
				return 0;
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("8921, " + 9 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
	private void method717() {
		try {
			if (this.anInt931 == 2) {
				for (@Pc(16) Class1_Sub2 local16 = (Class1_Sub2) this.aClass8_11.method46(); local16 != null; local16 = (Class1_Sub2) this.aClass8_11.method48()) {
					if (local16.anInt52 > 0) {
						local16.anInt52--;
					}
					if (local16.anInt52 != 0) {
						if (local16.anInt51 > 0) {
							local16.anInt51--;
						}
						if (local16.anInt51 == 0 && local16.anInt43 >= 1 && local16.anInt44 >= 1 && local16.anInt43 <= 102 && local16.anInt44 <= 102 && (local16.anInt45 < 0 || Class45.method526(local16.anInt45, local16.anInt47))) {
							this.method693(local16.anInt42, local16.anInt44, local16.anInt41, local16.anInt46, local16.anInt43, local16.anInt45, local16.anInt47);
							local16.anInt51 = -1;
							if (local16.anInt45 == local16.anInt48 && local16.anInt48 == -1) {
								local16.method551();
							} else if (local16.anInt45 == local16.anInt48 && local16.anInt46 == local16.anInt49 && local16.anInt47 == local16.anInt50) {
								local16.method551();
							}
						}
					} else if (local16.anInt48 < 0 || Class45.method526(local16.anInt48, local16.anInt50)) {
						this.method693(local16.anInt42, local16.anInt44, local16.anInt41, local16.anInt49, local16.anInt43, local16.anInt48, local16.anInt50);
						local16.method551();
					}
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("97011, " + -174 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(B)V")
	private void method718() {
		try {
			this.aBoolean194 = true;
			try {
				@Pc(10) long local10 = System.currentTimeMillis();
				@Pc(12) int local12 = 0;
				@Pc(14) int local14 = 20;
				while (this.aBoolean195) {
					this.anInt839++;
					this.method642();
					this.method642();
					this.method713();
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
			this.aBoolean194 = false;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("37696, " + -20 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)Ljava/net/Socket;")
	public Socket method720(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method577() {
		this.method584(20, "Starting up");
		if (signlink.sunjava) {
			super.anInt807 = 5;
		}
		if (aBoolean216) {
			this.aBoolean214 = true;
			return;
		}
		aBoolean216 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method665();
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
			this.aBoolean200 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(107) int local107 = 0; local107 < 5; local107++) {
				this.aClass47Array1[local107] = new Class47(signlink.aRandomAccessFileArray1[local107], 500000, signlink.aRandomAccessFile3, 0, local107 + 1);
			}
		}
		try {
			this.method658();
			this.aClass43_2 = this.method641(25, 1, 876, this.anIntArray259[1], "title", "title screen");
			this.aClass1_Sub1_Sub2_Sub2_2 = new Class1_Sub1_Sub2_Sub2((byte) 1, this.aClass43_2, false, "p11_full");
			this.aClass1_Sub1_Sub2_Sub2_3 = new Class1_Sub1_Sub2_Sub2((byte) 1, this.aClass43_2, false, "p12_full");
			this.aClass1_Sub1_Sub2_Sub2_4 = new Class1_Sub1_Sub2_Sub2((byte) 1, this.aClass43_2, false, "b12_full");
			this.aClass1_Sub1_Sub2_Sub2_5 = new Class1_Sub1_Sub2_Sub2((byte) 1, this.aClass43_2, true, "q8_full");
			this.method600();
			this.method645();
			@Pc(203) Class43 local203 = this.method641(30, 2, 876, this.anIntArray259[2], "config", "config");
			@Pc(215) Class43 local215 = this.method641(35, 3, 876, this.anIntArray259[3], "interface", "interface");
			@Pc(227) Class43 local227 = this.method641(40, 4, 876, this.anIntArray259[4], "media", "2d graphics");
			@Pc(239) Class43 local239 = this.method641(45, 6, 876, this.anIntArray259[6], "textures", "textures");
			@Pc(251) Class43 local251 = this.method641(50, 7, 876, this.anIntArray259[7], "wordenc", "chat system");
			@Pc(263) Class43 local263 = this.method641(55, 8, 876, this.anIntArray259[8], "sounds", "sound effects");
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray7 = new int[4][105][105];
			this.aClass10_1 = new Class10(4, 1, 104, 104, this.anIntArrayArrayArray7);
			for (@Pc(288) int local288 = 0; local288 < 4; local288++) {
				this.aClass28Array1[local288] = new Class28(103, 104, 104);
			}
			this.aClass1_Sub1_Sub2_Sub1_9 = new Class1_Sub1_Sub2_Sub1(512, 512);
			@Pc(323) Class43 local323 = this.method641(60, 5, 876, this.anIntArray259[5], "versionlist", "update list");
			this.method584(60, "Connecting to update server");
			this.aClass4_Sub1_1 = new Class4_Sub1();
			this.aClass4_Sub1_1.method117(local323, this);
			Class30.method330(this.aClass4_Sub1_1.method122());
			Class1_Sub1_Sub1_Sub3.method144(this.aClass4_Sub1_1.method110(0), this.aClass4_Sub1_1);
			if (!aBoolean234) {
				this.anInt1001 = 0;
				this.aBoolean223 = true;
				this.aClass4_Sub1_1.method111(2, this.anInt1001);
				while (this.aClass4_Sub1_1.method115() > 0) {
					this.method689();
					try {
						Thread.sleep(100L);
					} catch (@Pc(374) Exception local374) {
					}
					if (this.aClass4_Sub1_1.anInt143 > 3) {
						this.method706("ondemand");
						return;
					}
				}
			}
			this.method584(65, "Requesting animations");
			@Pc(398) int local398 = this.aClass4_Sub1_1.method110(1);
			for (@Pc(400) int local400 = 0; local400 < local398; local400++) {
				this.aClass4_Sub1_1.method111(1, local400);
			}
			@Pc(418) int local418;
			while (this.aClass4_Sub1_1.method115() > 0) {
				local418 = local398 - this.aClass4_Sub1_1.method115();
				if (local418 > 0) {
					this.method584(65, "Loading animations - " + local418 * 100 / local398 + "%");
				}
				this.method689();
				try {
					Thread.sleep(100L);
				} catch (@Pc(444) Exception local444) {
				}
				if (this.aClass4_Sub1_1.anInt143 > 3) {
					this.method706("ondemand");
					return;
				}
			}
			this.method584(70, "Requesting models");
			local398 = this.aClass4_Sub1_1.method110(0);
			@Pc(478) int local478;
			for (local418 = 0; local418 < local398; local418++) {
				local478 = this.aClass4_Sub1_1.method114(local418);
				if ((local478 & 0x1) != 0) {
					this.aClass4_Sub1_1.method111(0, local418);
				}
			}
			local398 = this.aClass4_Sub1_1.method115();
			while (this.aClass4_Sub1_1.method115() > 0) {
				local478 = local398 - this.aClass4_Sub1_1.method115();
				if (local478 > 0) {
					this.method584(70, "Loading models - " + local478 * 100 / local398 + "%");
				}
				this.method689();
				try {
					Thread.sleep(100L);
				} catch (@Pc(529) Exception local529) {
				}
			}
			if (this.aClass47Array1[0] != null) {
				this.method584(75, "Requesting maps");
				this.aClass4_Sub1_1.method111(3, this.aClass4_Sub1_1.method125(0, 47, 48));
				this.aClass4_Sub1_1.method111(3, this.aClass4_Sub1_1.method125(1, 47, 48));
				this.aClass4_Sub1_1.method111(3, this.aClass4_Sub1_1.method125(0, 48, 48));
				this.aClass4_Sub1_1.method111(3, this.aClass4_Sub1_1.method125(1, 48, 48));
				this.aClass4_Sub1_1.method111(3, this.aClass4_Sub1_1.method125(0, 49, 48));
				this.aClass4_Sub1_1.method111(3, this.aClass4_Sub1_1.method125(1, 49, 48));
				this.aClass4_Sub1_1.method111(3, this.aClass4_Sub1_1.method125(0, 47, 47));
				this.aClass4_Sub1_1.method111(3, this.aClass4_Sub1_1.method125(1, 47, 47));
				this.aClass4_Sub1_1.method111(3, this.aClass4_Sub1_1.method125(0, 48, 47));
				this.aClass4_Sub1_1.method111(3, this.aClass4_Sub1_1.method125(1, 48, 47));
				this.aClass4_Sub1_1.method111(3, this.aClass4_Sub1_1.method125(0, 48, 148));
				this.aClass4_Sub1_1.method111(3, this.aClass4_Sub1_1.method125(1, 48, 148));
				local398 = this.aClass4_Sub1_1.method115();
				while (this.aClass4_Sub1_1.method115() > 0) {
					local478 = local398 - this.aClass4_Sub1_1.method115();
					if (local478 > 0) {
						this.method584(75, "Loading maps - " + local478 * 100 / local398 + "%");
					}
					this.method689();
					try {
						Thread.sleep(100L);
					} catch (@Pc(714) Exception local714) {
					}
				}
			}
			local398 = this.aClass4_Sub1_1.method110(0);
			@Pc(735) int local735;
			for (local478 = 0; local478 < local398; local478++) {
				local735 = this.aClass4_Sub1_1.method114(local478);
				@Pc(737) byte local737 = 0;
				if ((local735 & 0x8) != 0) {
					local737 = 10;
				} else if ((local735 & 0x20) != 0) {
					local737 = 9;
				} else if ((local735 & 0x10) != 0) {
					local737 = 8;
				} else if ((local735 & 0x40) != 0) {
					local737 = 7;
				} else if ((local735 & 0x80) != 0) {
					local737 = 6;
				} else if ((local735 & 0x2) != 0) {
					local737 = 5;
				} else if ((local735 & 0x4) != 0) {
					local737 = 4;
				}
				if ((local735 & 0x1) != 0) {
					local737 = 3;
				}
				if (local737 != 0) {
					this.aClass4_Sub1_1.method119(local737, 0, local478);
				}
			}
			this.aClass4_Sub1_1.method124(aBoolean233);
			if (!aBoolean234) {
				local398 = this.aClass4_Sub1_1.method110(2);
				for (local735 = 1; local735 < local398; local735++) {
					if (this.aClass4_Sub1_1.method121(local735)) {
						this.aClass4_Sub1_1.method119((byte) 1, 2, local735);
					}
				}
			}
			this.method584(80, "Unpacking media");
			this.aClass1_Sub1_Sub2_Sub4_6 = new Class1_Sub1_Sub2_Sub4(local227, "invback", 0);
			this.aClass1_Sub1_Sub2_Sub4_8 = new Class1_Sub1_Sub2_Sub4(local227, "chatback", 0);
			this.aClass1_Sub1_Sub2_Sub4_7 = new Class1_Sub1_Sub2_Sub4(local227, "mapback", 0);
			this.aClass1_Sub1_Sub2_Sub4_11 = new Class1_Sub1_Sub2_Sub4(local227, "backbase1", 0);
			this.aClass1_Sub1_Sub2_Sub4_12 = new Class1_Sub1_Sub2_Sub4(local227, "backbase2", 0);
			this.aClass1_Sub1_Sub2_Sub4_13 = new Class1_Sub1_Sub2_Sub4(local227, "backhmid1", 0);
			for (local735 = 0; local735 < 13; local735++) {
				this.aClass1_Sub1_Sub2_Sub4Array5[local735] = new Class1_Sub1_Sub2_Sub4(local227, "sideicons", local735);
			}
			this.aClass1_Sub1_Sub2_Sub1_10 = new Class1_Sub1_Sub2_Sub1(local227, "compass", 0);
			this.aClass1_Sub1_Sub2_Sub1_5 = new Class1_Sub1_Sub2_Sub1(local227, "mapedge", 0);
			this.aClass1_Sub1_Sub2_Sub1_5.method249();
			for (@Pc(937) int local937 = 0; local937 < 72; local937++) {
				this.aClass1_Sub1_Sub2_Sub4Array4[local937] = new Class1_Sub1_Sub2_Sub4(local227, "mapscene", local937);
			}
			for (@Pc(955) int local955 = 0; local955 < 63; local955++) {
				this.aClass1_Sub1_Sub2_Sub1Array8[local955] = new Class1_Sub1_Sub2_Sub1(local227, "mapfunction", local955);
			}
			for (@Pc(973) int local973 = 0; local973 < 5; local973++) {
				this.aClass1_Sub1_Sub2_Sub1Array7[local973] = new Class1_Sub1_Sub2_Sub1(local227, "hitmarks", local973);
			}
			for (@Pc(991) int local991 = 0; local991 < 6; local991++) {
				this.aClass1_Sub1_Sub2_Sub1Array10[local991] = new Class1_Sub1_Sub2_Sub1(local227, "headicons_pk", local991);
			}
			for (@Pc(1009) int local1009 = 0; local1009 < 9; local1009++) {
				this.aClass1_Sub1_Sub2_Sub1Array9[local1009] = new Class1_Sub1_Sub2_Sub1(local227, "headicons_prayer", local1009);
			}
			for (@Pc(1027) int local1027 = 0; local1027 < 6; local1027++) {
				this.aClass1_Sub1_Sub2_Sub1Array5[local1027] = new Class1_Sub1_Sub2_Sub1(local227, "headicons_hint", local1027);
			}
			this.aClass1_Sub1_Sub2_Sub1_8 = new Class1_Sub1_Sub2_Sub1(local227, "overlay_multiway", 0);
			this.aClass1_Sub1_Sub2_Sub1_16 = new Class1_Sub1_Sub2_Sub1(local227, "mapmarker", 0);
			this.aClass1_Sub1_Sub2_Sub1_17 = new Class1_Sub1_Sub2_Sub1(local227, "mapmarker", 1);
			for (@Pc(1069) int local1069 = 0; local1069 < 8; local1069++) {
				this.aClass1_Sub1_Sub2_Sub1Array4[local1069] = new Class1_Sub1_Sub2_Sub1(local227, "cross", local1069);
			}
			this.aClass1_Sub1_Sub2_Sub1_11 = new Class1_Sub1_Sub2_Sub1(local227, "mapdots", 0);
			this.aClass1_Sub1_Sub2_Sub1_12 = new Class1_Sub1_Sub2_Sub1(local227, "mapdots", 1);
			this.aClass1_Sub1_Sub2_Sub1_13 = new Class1_Sub1_Sub2_Sub1(local227, "mapdots", 2);
			this.aClass1_Sub1_Sub2_Sub1_14 = new Class1_Sub1_Sub2_Sub1(local227, "mapdots", 3);
			this.aClass1_Sub1_Sub2_Sub1_15 = new Class1_Sub1_Sub2_Sub1(local227, "mapdots", 4);
			this.aClass1_Sub1_Sub2_Sub4_19 = new Class1_Sub1_Sub2_Sub4(local227, "scrollbar", 0);
			this.aClass1_Sub1_Sub2_Sub4_20 = new Class1_Sub1_Sub2_Sub4(local227, "scrollbar", 1);
			this.aClass1_Sub1_Sub2_Sub4_1 = new Class1_Sub1_Sub2_Sub4(local227, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub4_2 = new Class1_Sub1_Sub2_Sub4(local227, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub4_3 = new Class1_Sub1_Sub2_Sub4(local227, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub4_4 = new Class1_Sub1_Sub2_Sub4(local227, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub4_4.method567();
			this.aClass1_Sub1_Sub2_Sub4_5 = new Class1_Sub1_Sub2_Sub4(local227, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub4_5.method567();
			this.aClass1_Sub1_Sub2_Sub4_14 = new Class1_Sub1_Sub2_Sub4(local227, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub4_14.method568();
			this.aClass1_Sub1_Sub2_Sub4_15 = new Class1_Sub1_Sub2_Sub4(local227, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub4_15.method568();
			this.aClass1_Sub1_Sub2_Sub4_16 = new Class1_Sub1_Sub2_Sub4(local227, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub4_16.method568();
			this.aClass1_Sub1_Sub2_Sub4_17 = new Class1_Sub1_Sub2_Sub4(local227, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub4_17.method567();
			this.aClass1_Sub1_Sub2_Sub4_17.method568();
			this.aClass1_Sub1_Sub2_Sub4_18 = new Class1_Sub1_Sub2_Sub4(local227, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub4_18.method567();
			this.aClass1_Sub1_Sub2_Sub4_18.method568();
			for (@Pc(1259) int local1259 = 0; local1259 < 2; local1259++) {
				this.aClass1_Sub1_Sub2_Sub4Array2[local1259] = new Class1_Sub1_Sub2_Sub4(local227, "mod_icons", local1259);
			}
			@Pc(1282) Class1_Sub1_Sub2_Sub1 local1282 = new Class1_Sub1_Sub2_Sub1(local227, "backleft1", 0);
			this.aClass18_3 = new Class18(this.method582(523), 0, local1282.anInt413, local1282.anInt414);
			local1282.method250(0, 0);
			@Pc(1307) Class1_Sub1_Sub2_Sub1 local1307 = new Class1_Sub1_Sub2_Sub1(local227, "backleft2", 0);
			this.aClass18_4 = new Class18(this.method582(523), 0, local1307.anInt413, local1307.anInt414);
			local1307.method250(0, 0);
			@Pc(1332) Class1_Sub1_Sub2_Sub1 local1332 = new Class1_Sub1_Sub2_Sub1(local227, "backright1", 0);
			this.aClass18_5 = new Class18(this.method582(523), 0, local1332.anInt413, local1332.anInt414);
			local1332.method250(0, 0);
			@Pc(1357) Class1_Sub1_Sub2_Sub1 local1357 = new Class1_Sub1_Sub2_Sub1(local227, "backright2", 0);
			this.aClass18_6 = new Class18(this.method582(523), 0, local1357.anInt413, local1357.anInt414);
			local1357.method250(0, 0);
			@Pc(1382) Class1_Sub1_Sub2_Sub1 local1382 = new Class1_Sub1_Sub2_Sub1(local227, "backtop1", 0);
			this.aClass18_7 = new Class18(this.method582(523), 0, local1382.anInt413, local1382.anInt414);
			local1382.method250(0, 0);
			@Pc(1407) Class1_Sub1_Sub2_Sub1 local1407 = new Class1_Sub1_Sub2_Sub1(local227, "backvmid1", 0);
			this.aClass18_8 = new Class18(this.method582(523), 0, local1407.anInt413, local1407.anInt414);
			local1407.method250(0, 0);
			@Pc(1432) Class1_Sub1_Sub2_Sub1 local1432 = new Class1_Sub1_Sub2_Sub1(local227, "backvmid2", 0);
			this.aClass18_9 = new Class18(this.method582(523), 0, local1432.anInt413, local1432.anInt414);
			local1432.method250(0, 0);
			@Pc(1457) Class1_Sub1_Sub2_Sub1 local1457 = new Class1_Sub1_Sub2_Sub1(local227, "backvmid3", 0);
			this.aClass18_10 = new Class18(this.method582(523), 0, local1457.anInt413, local1457.anInt414);
			local1457.method250(0, 0);
			@Pc(1482) Class1_Sub1_Sub2_Sub1 local1482 = new Class1_Sub1_Sub2_Sub1(local227, "backhmid2", 0);
			this.aClass18_11 = new Class18(this.method582(523), 0, local1482.anInt413, local1482.anInt414);
			local1482.method250(0, 0);
			@Pc(1507) int local1507 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1514) int local1514 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1521) int local1521 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1528) int local1528 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1530) int local1530 = 0; local1530 < 100; local1530++) {
				if (this.aClass1_Sub1_Sub2_Sub1Array8[local1530] != null) {
					this.aClass1_Sub1_Sub2_Sub1Array8[local1530].method248(local1521 + local1528, local1514 + local1528, local1507 + local1528);
				}
				if (this.aClass1_Sub1_Sub2_Sub4Array4[local1530] != null) {
					this.aClass1_Sub1_Sub2_Sub4Array4[local1530].method569(local1521 + local1528, local1514 + local1528, local1507 + local1528);
				}
			}
			this.method584(83, "Unpacking textures");
			Class1_Sub1_Sub2_Sub3.method371(local239);
			Class1_Sub1_Sub2_Sub3.method375(0.8D);
			Class1_Sub1_Sub2_Sub3.method370(107);
			this.method584(86, "Unpacking config");
			Class19.method192(local203);
			Class32.method344(local203);
			Class6.method36(local203);
			Class39.method492(local203);
			Class29.method324(local203);
			Class37.method440(local203);
			Class34.method388(local203);
			Class17.method187(local203);
			Class9.method51(local203);
			Class39.aBoolean163 = aBoolean233;
			if (!aBoolean234) {
				this.method584(90, "Unpacking sounds");
				@Pc(1633) byte[] local1633 = local263.method515("sounds.dat", null);
				@Pc(1639) Class1_Sub1_Sub4 local1639 = new Class1_Sub1_Sub4(local1633, true);
				Class16.method181(local1639);
			}
			this.method584(95, "Unpacking interfaces");
			@Pc(1670) Class1_Sub1_Sub2_Sub2[] local1670 = new Class1_Sub1_Sub2_Sub2[] { this.aClass1_Sub1_Sub2_Sub2_2, this.aClass1_Sub1_Sub2_Sub2_3, this.aClass1_Sub1_Sub2_Sub2_4, this.aClass1_Sub1_Sub2_Sub2_5 };
			Class24.method226(local215, local227, local1670);
			this.method584(100, "Preparing game engine");
			@Pc(1686) int local1686;
			@Pc(1688) int local1688;
			@Pc(1690) int local1690;
			for (@Pc(1682) int local1682 = 0; local1682 < 33; local1682++) {
				local1686 = 999;
				local1688 = 0;
				for (local1690 = 0; local1690 < 34; local1690++) {
					if (this.aClass1_Sub1_Sub2_Sub4_7.aByteArray20[local1690 + local1682 * this.aClass1_Sub1_Sub2_Sub4_7.anInt797] == 0) {
						if (local1686 == 999) {
							local1686 = local1690;
						}
					} else if (local1686 != 999) {
						local1688 = local1690;
						break;
					}
				}
				this.anIntArray237[local1682] = local1686;
				this.anIntArray239[local1682] = local1688 - local1686;
			}
			@Pc(1748) int local1748;
			for (local1686 = 5; local1686 < 156; local1686++) {
				local1688 = 999;
				local1690 = 0;
				for (local1748 = 25; local1748 < 172; local1748++) {
					if (this.aClass1_Sub1_Sub2_Sub4_7.aByteArray20[local1748 + local1686 * this.aClass1_Sub1_Sub2_Sub4_7.anInt797] == 0 && (local1748 > 34 || local1686 > 34)) {
						if (local1688 == 999) {
							local1688 = local1748;
						}
					} else if (local1688 != 999) {
						local1690 = local1748;
						break;
					}
				}
				this.anIntArray221[local1686 - 5] = local1688 - 25;
				this.anIntArray274[local1686 - 5] = local1690 - local1688;
			}
			Class1_Sub1_Sub2_Sub3.method368(503, 765, aBoolean232);
			this.anIntArray229 = Class1_Sub1_Sub2_Sub3.anIntArray163;
			Class1_Sub1_Sub2_Sub3.method368(96, 479, aBoolean232);
			this.anIntArray226 = Class1_Sub1_Sub2_Sub3.anIntArray163;
			Class1_Sub1_Sub2_Sub3.method368(261, 190, aBoolean232);
			this.anIntArray227 = Class1_Sub1_Sub2_Sub3.anIntArray163;
			Class1_Sub1_Sub2_Sub3.method368(334, 512, aBoolean232);
			this.anIntArray228 = Class1_Sub1_Sub2_Sub3.anIntArray163;
			@Pc(1839) int[] local1839 = new int[9];
			for (local1690 = 0; local1690 < 9; local1690++) {
				local1748 = local1690 * 32 + 128 + 15;
				@Pc(1857) int local1857 = local1748 * 3 + 600;
				@Pc(1861) int local1861 = Class1_Sub1_Sub2_Sub3.anIntArray161[local1748];
				local1839[local1690] = local1857 * local1861 >> 16;
			}
			Class10.method90(local1839);
			Class38.method446(local251);
			this.aClass14_1 = new Class14(this, (byte) 4);
			this.method583(this.aClass14_1, 10);
			Class1_Sub1_Sub1_Sub2.aClient2 = this;
			Class32.aClient5 = this;
			Class29.aClient4 = this;
		} catch (@Pc(1902) Exception local1902) {
			signlink.reporterror("loaderror " + this.aString26 + " " + this.anInt1034);
			this.aBoolean202 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!CHEFEIMI;B)V")
	private void method721(@OriginalArg(0) Class1_Sub2 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt42 == 0) {
				local1 = this.aClass10_1.method80(arg0.anInt41, arg0.anInt43, arg0.anInt44);
			}
			if (arg0.anInt42 == 1) {
				local1 = this.aClass10_1.method81(arg0.anInt41, arg0.anInt43, arg0.anInt44);
			}
			if (arg0.anInt42 == 2) {
				local1 = this.aClass10_1.method82(arg0.anInt41, arg0.anInt43, arg0.anInt44);
			}
			if (arg0.anInt42 == 3) {
				local1 = this.aClass10_1.method83(arg0.anInt41, arg0.anInt43, arg0.anInt44);
			}
			if (local1 != 0) {
				@Pc(76) int local76 = this.aClass10_1.method84(arg0.anInt41, arg0.anInt43, arg0.anInt44, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local76 & 0x1F;
				local7 = local76 >> 6;
			}
			arg0.anInt48 = local3;
			arg0.anInt50 = local5;
			arg0.anInt49 = local7;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("36467, " + arg0 + ", " + 39 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(III)V")
	private void method722(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(1) int local1 = 0;
			for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
				if (this.aStringArray11[local3] != null) {
					@Pc(15) int local15 = this.anIntArray238[local3];
					@Pc(26) int local26 = this.anInt971 + 70 + 4 - local1 * 14;
					if (local26 < -20) {
						break;
					}
					@Pc(34) String local34 = this.aStringArray10[local3];
					if (local34 != null && local34.startsWith("@cr1@")) {
						local34 = local34.substring(5);
					}
					if (local34 != null && local34.startsWith("@cr2@")) {
						local34 = local34.substring(5);
					}
					if (local15 == 0) {
						local1++;
					}
					if ((local15 == 1 || local15 == 2) && (local15 == 1 || this.anInt824 == 0 || this.anInt824 == 1 && this.method589(local34))) {
						if (arg0 > local26 - 14 && arg0 <= local26 && !local34.equals(aClass1_Sub1_Sub1_Sub4_Sub1_1.aString7)) {
							if (this.anInt838 >= 1) {
								this.aStringArray13[this.anInt1005] = "Report abuse @whi@" + local34;
								this.anIntArray242[this.anInt1005] = 591;
								this.anInt1005++;
							}
							this.aStringArray13[this.anInt1005] = "Add ignore @whi@" + local34;
							this.anIntArray242[this.anInt1005] = 673;
							this.anInt1005++;
							this.aStringArray13[this.anInt1005] = "Add friend @whi@" + local34;
							this.anIntArray242[this.anInt1005] = 839;
							this.anInt1005++;
						}
						local1++;
					}
					if ((local15 == 3 || local15 == 7) && this.anInt1009 == 0 && (local15 == 7 || this.anInt840 == 0 || this.anInt840 == 1 && this.method589(local34))) {
						if (arg0 > local26 - 14 && arg0 <= local26) {
							if (this.anInt838 >= 1) {
								this.aStringArray13[this.anInt1005] = "Report abuse @whi@" + local34;
								this.anIntArray242[this.anInt1005] = 591;
								this.anInt1005++;
							}
							this.aStringArray13[this.anInt1005] = "Add ignore @whi@" + local34;
							this.anIntArray242[this.anInt1005] = 673;
							this.anInt1005++;
							this.aStringArray13[this.anInt1005] = "Add friend @whi@" + local34;
							this.anIntArray242[this.anInt1005] = 839;
							this.anInt1005++;
						}
						local1++;
					}
					if (local15 == 4 && (this.anInt874 == 0 || this.anInt874 == 1 && this.method589(local34))) {
						if (arg0 > local26 - 14 && arg0 <= local26) {
							this.aStringArray13[this.anInt1005] = "Accept trade @whi@" + local34;
							this.anIntArray242[this.anInt1005] = 480;
							this.anInt1005++;
						}
						local1++;
					}
					if ((local15 == 5 || local15 == 6) && this.anInt1009 == 0 && this.anInt840 < 2) {
						local1++;
					}
					if (local15 == 8 && (this.anInt874 == 0 || this.anInt874 == 1 && this.method589(local34))) {
						if (arg0 > local26 - 14 && arg0 <= local26) {
							this.aStringArray13[this.anInt1005] = "Accept challenge @whi@" + local34;
							this.anIntArray242[this.anInt1005] = 189;
							this.anInt1005++;
						}
						local1++;
					}
				}
			}
		} catch (@Pc(404) RuntimeException local404) {
			signlink.reporterror("70496, " + 9 + ", " + arg0 + ", " + arg1 + ", " + local404.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method723(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString23 = "";
				this.aString24 = "Connecting to server...";
				this.method670(true);
			}
			this.aClass31_1 = new Class31(20196, this, this.method720(anInt1031 + 43594));
			@Pc(30) long local30 = Class2.method14(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass1_Sub1_Sub4_8.anInt624 = 0;
			this.aClass1_Sub1_Sub4_8.method395(14);
			this.aClass1_Sub1_Sub4_8.method395(local37);
			this.aClass31_1.method339(2, this.aClass1_Sub1_Sub4_8.aByteArray16);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass31_1.method336();
			}
			@Pc(74) int local74 = this.aClass31_1.method336();
			@Pc(76) int local76 = local74;
			@Pc(225) int local225;
			@Pc(260) int local260;
			if (local74 == 0) {
				this.aClass31_1.method338(this.aClass1_Sub1_Sub4_6.aByteArray16, 0, 8);
				this.aClass1_Sub1_Sub4_6.anInt624 = 0;
				this.aLong31 = this.aClass1_Sub1_Sub4_6.method411();
				@Pc(99) int[] local99 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong31 >> 32), (int) this.aLong31 };
				this.aClass1_Sub1_Sub4_8.anInt624 = 0;
				this.aClass1_Sub1_Sub4_8.method395(10);
				this.aClass1_Sub1_Sub4_8.method399(local99[0]);
				this.aClass1_Sub1_Sub4_8.method399(local99[1]);
				this.aClass1_Sub1_Sub4_8.method399(local99[2]);
				this.aClass1_Sub1_Sub4_8.method399(local99[3]);
				this.aClass1_Sub1_Sub4_8.method399(signlink.anInt1052);
				this.aClass1_Sub1_Sub4_8.method402(arg0);
				this.aClass1_Sub1_Sub4_8.method402(arg1);
				this.aClass1_Sub1_Sub4_8.method420(aBigInteger2, aBigInteger1);
				this.aClass1_Sub1_Sub4_9.anInt624 = 0;
				if (arg2) {
					this.aClass1_Sub1_Sub4_9.method395(18);
				} else {
					this.aClass1_Sub1_Sub4_9.method395(16);
				}
				this.aClass1_Sub1_Sub4_9.method395(this.aClass1_Sub1_Sub4_8.anInt624 + 36 + 1 + 1 + 2);
				this.aClass1_Sub1_Sub4_9.method395(255);
				this.aClass1_Sub1_Sub4_9.method396(362);
				this.aClass1_Sub1_Sub4_9.method395(aBoolean234 ? 1 : 0);
				for (local225 = 0; local225 < 9; local225++) {
					this.aClass1_Sub1_Sub4_9.method399(this.anIntArray259[local225]);
				}
				this.aClass1_Sub1_Sub4_9.method403(this.aClass1_Sub1_Sub4_8.aByteArray16, this.aByte30, this.aClass1_Sub1_Sub4_8.anInt624);
				this.aClass1_Sub1_Sub4_8.aClass26_1 = new Class26(local99, 10236);
				for (local260 = 0; local260 < 4; local260++) {
					local99[local260] += 50;
				}
				this.aClass26_2 = new Class26(local99, 10236);
				this.aClass31_1.method339(this.aClass1_Sub1_Sub4_9.anInt624, this.aClass1_Sub1_Sub4_9.aByteArray16);
				local74 = this.aClass31_1.method336();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(302) Exception local302) {
				}
				this.method723(arg0, arg1, arg2);
			} else {
				@Pc(390) int local390;
				if (local74 == 2) {
					this.anInt838 = this.aClass31_1.method336();
					aBoolean203 = this.aClass31_1.method336() == 1;
					this.aLong32 = 0L;
					this.anInt943 = 0;
					this.aClass14_1.anInt195 = 0;
					super.aBoolean193 = true;
					this.aBoolean196 = true;
					this.aBoolean213 = true;
					this.aClass1_Sub1_Sub4_8.anInt624 = 0;
					this.aClass1_Sub1_Sub4_6.anInt624 = 0;
					this.anInt962 = -1;
					this.anInt1047 = -1;
					this.anInt1048 = -1;
					this.anInt1049 = -1;
					this.anInt961 = 0;
					this.anInt963 = 0;
					this.anInt877 = 0;
					this.anInt965 = 0;
					this.anInt936 = 0;
					this.anInt1005 = 0;
					this.aBoolean230 = false;
					super.anInt811 = 0;
					for (local390 = 0; local390 < 100; local390++) {
						this.aStringArray11[local390] = null;
					}
					this.anInt1035 = 0;
					this.anInt904 = 0;
					this.anInt931 = 0;
					this.anInt886 = 0;
					this.anInt916 = (int) (Math.random() * 100.0D) - 50;
					this.anInt888 = (int) (Math.random() * 110.0D) - 55;
					this.anInt858 = (int) (Math.random() * 80.0D) - 40;
					this.anInt911 = (int) (Math.random() * 120.0D) - 60;
					this.anInt860 = (int) (Math.random() * 30.0D) - 20;
					this.anInt919 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt883 = 0;
					this.anInt1007 = -1;
					this.anInt995 = 0;
					this.anInt996 = 0;
					this.anInt1024 = 0;
					this.anInt879 = 0;
					for (local225 = 0; local225 < this.anInt1022; local225++) {
						this.aClass1_Sub1_Sub1_Sub4_Sub1Array1[local225] = null;
						this.aClass1_Sub1_Sub4Array1[local225] = null;
					}
					for (local260 = 0; local260 < 16384; local260++) {
						this.aClass1_Sub1_Sub1_Sub4_Sub2Array1[local260] = null;
					}
					aClass1_Sub1_Sub1_Sub4_Sub1_1 = this.aClass1_Sub1_Sub1_Sub4_Sub1Array1[this.anInt1023] = new Class1_Sub1_Sub1_Sub4_Sub1();
					this.aClass8_10.method50();
					this.aClass8_12.method50();
					@Pc(535) int local535;
					@Pc(539) int local539;
					for (@Pc(531) int local531 = 0; local531 < 4; local531++) {
						for (local535 = 0; local535 < 104; local535++) {
							for (local539 = 0; local539 < 104; local539++) {
								this.aClass8ArrayArrayArray1[local531][local535][local539] = null;
							}
						}
					}
					this.aClass8_11 = new Class8(0);
					this.anInt978 = 0;
					this.anInt977 = 0;
					this.method599(this.anInt983);
					this.anInt983 = -1;
					this.method599(this.anInt887);
					this.anInt887 = -1;
					this.method599(this.anInt945);
					this.anInt945 = -1;
					this.method599(this.anInt999);
					this.anInt999 = -1;
					this.method599(this.anInt866);
					this.anInt866 = -1;
					this.method599(this.anInt908);
					this.anInt908 = -1;
					this.method599(this.anInt979);
					this.anInt979 = -1;
					this.aBoolean206 = false;
					this.anInt1044 = 3;
					this.anInt988 = 0;
					this.aBoolean230 = false;
					this.aBoolean197 = false;
					this.aString27 = null;
					this.anInt881 = 0;
					this.anInt901 = -1;
					this.aBoolean199 = true;
					this.method663();
					for (local535 = 0; local535 < 5; local535++) {
						this.anIntArray235[local535] = 0;
					}
					for (local539 = 0; local539 < 5; local539++) {
						this.aStringArray12[local539] = null;
						this.aBooleanArray11[local539] = false;
					}
					anInt857 = 0;
					anInt959 = 0;
					anInt914 = 0;
					anInt955 = 0;
					anInt991 = 0;
					anInt837 = 0;
					anInt913 = 0;
					this.method613();
				} else if (local74 == 3) {
					this.aString23 = "";
					this.aString24 = "Invalid username or password.";
				} else if (local74 == 4) {
					this.aString23 = "Your account has been disabled.";
					this.aString24 = "Please check your message-centre for details.";
				} else if (local74 == 5) {
					this.aString23 = "Your account is already logged in.";
					this.aString24 = "Try again in 60 secs...";
				} else if (local74 == 6) {
					this.aString23 = "RuneScape has been updated!";
					this.aString24 = "Please reload this page.";
				} else if (local74 == 7) {
					this.aString23 = "This world is full.";
					this.aString24 = "Please use a different world.";
				} else if (local74 == 8) {
					this.aString23 = "Unable to connect.";
					this.aString24 = "Login server offline.";
				} else if (local74 == 9) {
					this.aString23 = "Login limit exceeded.";
					this.aString24 = "Too many connections from your address.";
				} else if (local74 == 10) {
					this.aString23 = "Unable to connect.";
					this.aString24 = "Bad session id.";
				} else if (local74 == 11) {
					this.aString23 = "Login server rejected session.";
					this.aString24 = "Please try again.";
				} else if (local74 == 12) {
					this.aString23 = "You need a members account to login to this world.";
					this.aString24 = "Please subscribe, or use a different world.";
				} else if (local74 == 13) {
					this.aString23 = "Could not complete login.";
					this.aString24 = "Please try using a different world.";
				} else if (local74 == 14) {
					this.aString23 = "The server is being updated.";
					this.aString24 = "Please wait 1 minute and try again.";
				} else if (local74 == 15) {
					this.aBoolean213 = true;
					this.aClass1_Sub1_Sub4_8.anInt624 = 0;
					this.aClass1_Sub1_Sub4_6.anInt624 = 0;
					this.anInt962 = -1;
					this.anInt1047 = -1;
					this.anInt1048 = -1;
					this.anInt1049 = -1;
					this.anInt961 = 0;
					this.anInt963 = 0;
					this.anInt877 = 0;
					this.anInt1005 = 0;
					this.aBoolean230 = false;
					this.aLong33 = System.currentTimeMillis();
				} else if (local74 == 16) {
					this.aString23 = "Login attempts exceeded.";
					this.aString24 = "Please wait 1 minute and try again.";
				} else if (local74 == 17) {
					this.aString23 = "You are standing in a members-only area.";
					this.aString24 = "To play on this world move to a free area first";
				} else if (local74 == 20) {
					this.aString23 = "Invalid loginserver requested";
					this.aString24 = "Please try using a different world.";
				} else if (local74 == 21) {
					local390 = this.aClass31_1.method336();
					for (@Pc(918) int local918 = local390 + 3; local918 >= 0; local918--) {
						this.aString23 = "You have only just left another world";
						this.aString24 = "Your profile will be transferred in: " + local918;
						this.method670(true);
						try {
							Thread.sleep(1200L);
						} catch (@Pc(940) Exception local940) {
						}
					}
					this.method723(arg0, arg1, arg2);
				} else if (local74 == 22) {
					this.aString23 = "Malformed login packet.";
					this.aString24 = "Please try again.";
				} else if (local74 == 23) {
					this.aString23 = "This computers address has been blocked";
					this.aString24 = "as it was used to break our rules";
				} else if (local74 != -1) {
					System.out.println("response:" + local74);
					this.aString23 = "Unexpected server response";
					this.aString24 = "Please try using a different world.";
				} else if (local76 != 0) {
					this.aString23 = "No response from server";
					this.aString24 = "Please try using a different world.";
				} else if (this.anInt1042 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(982) Exception local982) {
					}
					this.anInt1042++;
					this.method723(arg0, arg1, arg2);
				} else {
					this.aString23 = "No response from loginserver";
					this.aString24 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(1025) IOException local1025) {
			this.aString23 = "";
			this.aString24 = "Error connecting to server.";
		}
	}
}
