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

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Z")
	private static boolean aBoolean216;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
	private static int anInt846;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
	private static int anInt854;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
	private static int anInt856;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
	public static int anInt866;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "Z")
	private static boolean aBoolean223;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "I")
	private static int anInt890;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "Z")
	private static boolean aBoolean233;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
	private static int anInt917;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private static int anInt924;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
	public static int anInt928;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "Z")
	private static boolean aBoolean242;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "Lclient!UFGXOLGK;")
	public static Class6_Sub2_Sub1_Sub3_Sub2 aClass6_Sub2_Sub1_Sub3_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
	private static int anInt963;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "I")
	private static int anInt968;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "I")
	private static int anInt1003;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private static int anInt1004;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "I")
	private static int anInt1013;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "I")
	private static int anInt1028;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "[I")
	public static final int[] anIntArray214 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "Z")
	private static boolean aBoolean217 = true;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "[I")
	public static int[] anIntArray228 = new int[32];

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
	private static int anInt865;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "Z")
	private static boolean aBoolean222;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
	private static int anInt897;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "[[I")
	public static final int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "B")
	private static byte aByte42;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "[I")
	private static int[] anIntArray264;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "Ljava/lang/String;")
	private static String aString30;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
	private static int anInt1021;

	@OriginalMember(owner = "client!client", name = "I", descriptor = "I")
	private int anInt826;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "I")
	private int anInt828;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "I")
	private int anInt829;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "I")
	private int anInt832;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "I")
	private int anInt833;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "I")
	private int anInt834;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "I")
	private int anInt835;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
	private int anInt839;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Ljava/lang/String;")
	private String aString17;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
	private int anInt840;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "[I")
	private int[] anIntArray223;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "[I")
	private int[] anIntArray224;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
	private int anInt843;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	private int anInt844;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
	private int anInt845;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "Ljava/lang/String;")
	private String aString18;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
	private int anInt848;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
	private int anInt849;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
	private int anInt850;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private int anInt851;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
	private int anInt852;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "Lclient!XHDQQNIR;")
	private Class6_Sub2_Sub2_Sub4 aClass6_Sub2_Sub2_Sub4_1;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "Lclient!XHDQQNIR;")
	private Class6_Sub2_Sub2_Sub4 aClass6_Sub2_Sub2_Sub4_2;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "I")
	private int anInt853;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "[[B")
	private byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "Lclient!PKTDMNAV;")
	private Class28 aClass28_3;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "Lclient!PKTDMNAV;")
	private Class28 aClass28_4;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "Lclient!PKTDMNAV;")
	private Class28 aClass28_5;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "Lclient!PKTDMNAV;")
	private Class28 aClass28_6;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "Lclient!PKTDMNAV;")
	private Class28 aClass28_7;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "Lclient!PKTDMNAV;")
	private Class28 aClass28_8;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "Lclient!PKTDMNAV;")
	private Class28 aClass28_9;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "Lclient!PKTDMNAV;")
	private Class28 aClass28_10;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "Lclient!PKTDMNAV;")
	private Class28 aClass28_11;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
	private int anInt858;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "I")
	private int anInt859;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
	private int anInt860;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "I")
	private int anInt861;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "I")
	private int anInt862;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "I")
	private int anInt863;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "I")
	private int anInt864;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "Lclient!VXFBFZWJ;")
	private Class44 aClass44_1;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
	private int anInt867;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "Lclient!PKTDMNAV;")
	private Class28 aClass28_12;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "Lclient!PKTDMNAV;")
	private Class28 aClass28_13;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "Lclient!PKTDMNAV;")
	private Class28 aClass28_14;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "Lclient!PKTDMNAV;")
	private Class28 aClass28_15;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "Lclient!PKTDMNAV;")
	private Class28 aClass28_16;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "Lclient!PKTDMNAV;")
	private Class28 aClass28_17;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "Lclient!PKTDMNAV;")
	private Class28 aClass28_18;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "Lclient!PKTDMNAV;")
	private Class28 aClass28_19;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "Lclient!PKTDMNAV;")
	private Class28 aClass28_20;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
	private int anInt869;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
	private int anInt870;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
	private int anInt871;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
	private int anInt873;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
	private int anInt874;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "I")
	private int anInt875;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "I")
	private int anInt876;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
	private int anInt877;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
	private int anInt878;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "I")
	private int anInt879;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
	private int anInt880;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
	private int anInt882;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
	private int anInt883;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "Lclient!XHDQQNIR;")
	private Class6_Sub2_Sub2_Sub4 aClass6_Sub2_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "Lclient!XHDQQNIR;")
	private Class6_Sub2_Sub2_Sub4 aClass6_Sub2_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "Lclient!XHDQQNIR;")
	private Class6_Sub2_Sub2_Sub4 aClass6_Sub2_Sub2_Sub4_5;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "I")
	private int anInt885;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "Lclient!XHDQQNIR;")
	private Class6_Sub2_Sub2_Sub4 aClass6_Sub2_Sub2_Sub4_6;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "Lclient!XHDQQNIR;")
	private Class6_Sub2_Sub2_Sub4 aClass6_Sub2_Sub2_Sub4_7;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "Lclient!VZIKSEDY;")
	private Class45 aClass45_2;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "Lclient!IBHVCUAH;")
	private Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_3;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "I")
	private int anInt891;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
	private int anInt892;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "I")
	private int anInt893;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
	private int anInt894;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "I")
	private int anInt895;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
	private int anInt896;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
	private int anInt899;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
	private int anInt900;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
	private int anInt901;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "I")
	private int anInt902;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "I")
	private int anInt903;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "I")
	private int anInt905;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "[I")
	private int[] anIntArray236;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "[I")
	private int[] anIntArray237;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "[I")
	private int[] anIntArray238;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "Lclient!IBHVCUAH;")
	private Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_4;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "[Lclient!XHDQQNIR;")
	private Class6_Sub2_Sub2_Sub4[] aClass6_Sub2_Sub2_Sub4Array2;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
	private int anInt907;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "I")
	private int anInt908;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
	private int anInt909;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "I")
	private int anInt910;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "I")
	private int anInt911;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private int anInt913;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "Lclient!IBHVCUAH;")
	private Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_5;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "Lclient!IBHVCUAH;")
	private Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_6;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "Lclient!IBHVCUAH;")
	private Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_7;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "Lclient!IBHVCUAH;")
	private Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_8;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "Lclient!XHDQQNIR;")
	private Class6_Sub2_Sub2_Sub4 aClass6_Sub2_Sub2_Sub4_8;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "Lclient!XHDQQNIR;")
	private Class6_Sub2_Sub2_Sub4 aClass6_Sub2_Sub2_Sub4_9;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "Lclient!XHDQQNIR;")
	private Class6_Sub2_Sub2_Sub4 aClass6_Sub2_Sub2_Sub4_10;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "Lclient!DUZSRFJE;")
	private Class7 aClass7_1;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
	private int anInt916;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "[I")
	private int[] anIntArray246;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "[I")
	private int[] anIntArray247;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "[I")
	private int[] anIntArray248;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "[I")
	private int[] anIntArray249;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
	private int anInt918;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
	private int anInt919;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "Lclient!IDBGYHWK;")
	private Class6_Sub2_Sub2_Sub2 aClass6_Sub2_Sub2_Sub2_2;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "Lclient!IDBGYHWK;")
	private Class6_Sub2_Sub2_Sub2 aClass6_Sub2_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "Lclient!IDBGYHWK;")
	private Class6_Sub2_Sub2_Sub2 aClass6_Sub2_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "Lclient!IDBGYHWK;")
	private Class6_Sub2_Sub2_Sub2 aClass6_Sub2_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "I")
	private int anInt920;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
	private int anInt921;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private int anInt925;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
	private int anInt934;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
	private int anInt937;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
	private int anInt939;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private int anInt940;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
	private int anInt941;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "[I")
	private int[] anIntArray254;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "[I")
	private int[] anIntArray255;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "I")
	private int anInt942;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private int anInt944;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
	private int anInt946;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
	private int anInt947;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
	private int anInt948;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "Ljava/lang/String;")
	private String aString26;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "Lclient!OBOSMEDX;")
	private Class25 aClass25_1;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
	private int anInt951;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "Lclient!XHDQQNIR;")
	private Class6_Sub2_Sub2_Sub4 aClass6_Sub2_Sub2_Sub4_11;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "Lclient!XHDQQNIR;")
	private Class6_Sub2_Sub2_Sub4 aClass6_Sub2_Sub2_Sub4_12;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "Lclient!XHDQQNIR;")
	private Class6_Sub2_Sub2_Sub4 aClass6_Sub2_Sub2_Sub4_13;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "Lclient!XHDQQNIR;")
	private Class6_Sub2_Sub2_Sub4 aClass6_Sub2_Sub2_Sub4_14;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "Lclient!XHDQQNIR;")
	private Class6_Sub2_Sub2_Sub4 aClass6_Sub2_Sub2_Sub4_15;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
	private int anInt952;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "I")
	private int anInt954;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
	private int anInt955;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "Lclient!IBHVCUAH;")
	private Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_9;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
	private int anInt956;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "I")
	private int anInt958;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "I")
	private int anInt960;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
	private int anInt961;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "Lclient!XHDQQNIR;")
	private Class6_Sub2_Sub2_Sub4 aClass6_Sub2_Sub2_Sub4_16;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "Lclient!XHDQQNIR;")
	private Class6_Sub2_Sub2_Sub4 aClass6_Sub2_Sub2_Sub4_17;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "Lclient!XHDQQNIR;")
	private Class6_Sub2_Sub2_Sub4 aClass6_Sub2_Sub2_Sub4_18;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "Lclient!XHDQQNIR;")
	private Class6_Sub2_Sub2_Sub4 aClass6_Sub2_Sub2_Sub4_19;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "Lclient!XHDQQNIR;")
	private Class6_Sub2_Sub2_Sub4 aClass6_Sub2_Sub2_Sub4_20;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "Lclient!IBHVCUAH;")
	private Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_10;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
	private int anInt966;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
	private int anInt967;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "I")
	private int anInt971;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "I")
	private int anInt975;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "I")
	private int anInt976;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "I")
	private int anInt978;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "I")
	private int anInt980;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "I")
	private int anInt981;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "I")
	private int anInt982;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "[I")
	private int[] anIntArray261;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "[I")
	private int[] anIntArray262;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "[I")
	private int[] anIntArray263;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "I")
	private int anInt987;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "I")
	private int anInt988;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
	private int anInt990;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
	private int anInt994;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "I")
	private int anInt995;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "I")
	private int anInt997;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
	private int anInt998;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "Lclient!ELICEBAH;")
	private Class9_Sub1 aClass9_Sub1_1;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
	private int anInt999;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
	private int anInt1000;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
	private int anInt1001;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
	private int anInt1002;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "Ljava/lang/String;")
	private String aString29;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "Lclient!PKTDMNAV;")
	private Class28 aClass28_21;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "Lclient!PKTDMNAV;")
	private Class28 aClass28_22;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "Lclient!PKTDMNAV;")
	private Class28 aClass28_23;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "Lclient!PKTDMNAV;")
	private Class28 aClass28_24;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "Lclient!IBHVCUAH;")
	private Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_11;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "Lclient!IBHVCUAH;")
	private Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_12;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
	private int anInt1005;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
	private int anInt1006;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
	private int anInt1007;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "I")
	private int anInt1008;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "I")
	private int anInt1010;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "I")
	private int anInt1011;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "I")
	private int anInt1012;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
	private int anInt1014;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
	private int anInt1015;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "I")
	private int anInt1016;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
	private int anInt1018;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
	private int anInt1026;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
	private int anInt1027;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "I")
	private int anInt1029;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "I")
	private int anInt1030;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "I")
	private int anInt1031;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
	private int anInt1032;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
	private int anInt1033;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "I")
	private int anInt1035;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "Lclient!IBHVCUAH;")
	private Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_13;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "Lclient!IBHVCUAH;")
	private Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_14;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "Lclient!IBHVCUAH;")
	private Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_15;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "Lclient!IBHVCUAH;")
	private Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_16;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "Lclient!IBHVCUAH;")
	private Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_17;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "I")
	private int anInt1036;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "Lclient!PKTDMNAV;")
	private Class28 aClass28_25;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "Lclient!PKTDMNAV;")
	private Class28 aClass28_26;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "Lclient!PKTDMNAV;")
	private Class28 aClass28_27;

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "Lclient!RVLWVPJQ;")
	private Class36 aClass36_1;

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "I")
	private int anInt1037;

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "I")
	private int anInt1038;

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "I")
	private int anInt1039;

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "I")
	private int anInt1040;

	@OriginalMember(owner = "client!client", name = "Pj", descriptor = "I")
	private int anInt1041;

	@OriginalMember(owner = "client!client", name = "Qj", descriptor = "I")
	private int anInt1042;

	@OriginalMember(owner = "client!client", name = "Rj", descriptor = "I")
	private int anInt1043;

	@OriginalMember(owner = "client!client", name = "Sj", descriptor = "I")
	private int anInt1044;

	@OriginalMember(owner = "client!client", name = "H", descriptor = "[Lclient!IBHVCUAH;")
	private Class6_Sub2_Sub2_Sub1[] aClass6_Sub2_Sub2_Sub1Array4 = new Class6_Sub2_Sub2_Sub1[1000];

	@OriginalMember(owner = "client!client", name = "J", descriptor = "I")
	private int anInt827 = -40048;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "I")
	private int anInt830 = 2;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "[I")
	private int[] anIntArray212 = new int[4000];

	@OriginalMember(owner = "client!client", name = "O", descriptor = "[I")
	private int[] anIntArray213 = new int[4000];

	@OriginalMember(owner = "client!client", name = "P", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "B")
	private byte aByte31 = 6;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "I")
	private int anInt831 = 128;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
	private int anInt836 = 3;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
	private int anInt837 = -1;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	private int anInt838 = -56;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "[I")
	private int[] anIntArray215 = new int[33];

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[5];

	@OriginalMember(owner = "client!client", name = "db", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	private int anInt841 = 50;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "[I")
	private int[] anIntArray216 = new int[this.anInt841];

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "[I")
	private int[] anIntArray217 = new int[this.anInt841];

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "[I")
	private int[] anIntArray218 = new int[this.anInt841];

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "[I")
	private int[] anIntArray219 = new int[this.anInt841];

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "[I")
	private int[] anIntArray220 = new int[this.anInt841];

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "[I")
	private int[] anIntArray221 = new int[this.anInt841];

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "[I")
	private int[] anIntArray222 = new int[this.anInt841];

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[this.anInt841];

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	private int anInt842 = 3;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
	private int anInt847 = -40048;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "Z")
	private boolean aBoolean218 = false;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "[I")
	private int[] anIntArray225 = new int[200];

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "B")
	private byte aByte32 = -26;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "I")
	private int anInt855 = -67;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "[I")
	private int[] anIntArray226 = new int[9];

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "[I")
	private int[] anIntArray227 = new int[Class1.anInt22];

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "Ljava/lang/String;")
	private String aString19 = "";

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "Z")
	private boolean aBoolean219 = false;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
	private int anInt857 = 78;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "Z")
	private volatile boolean aBoolean220 = false;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "Z")
	private boolean aBoolean221 = false;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
	private int anInt868 = 2;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "Lclient!URASIGRB;")
	private Class39 aClass39_10 = new Class39(41824);

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "[I")
	private int[] anIntArray229 = new int[50];

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "[I")
	private int[] anIntArray230 = new int[Class1.anInt22];

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "B")
	private byte aByte33 = 109;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "B")
	private byte aByte34 = 1;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "Z")
	private boolean aBoolean224 = false;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "Ljava/lang/String;")
	private String aString20 = "";

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "Ljava/lang/String;")
	private String aString21 = "";

	@OriginalMember(owner = "client!client", name = "md", descriptor = "I")
	private int anInt888 = -1;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "Z")
	private boolean aBoolean225 = true;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "I")
	private int anInt889 = 1;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "Z")
	public boolean aBoolean226 = false;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "[I")
	private int[] anIntArray231 = new int[500];

	@OriginalMember(owner = "client!client", name = "td", descriptor = "[I")
	private int[] anIntArray232 = new int[500];

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "[I")
	private int[] anIntArray233 = new int[500];

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "[I")
	private int[] anIntArray234 = new int[500];

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "Z")
	private boolean aBoolean227 = false;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "[I")
	private int[] anIntArray235 = new int[151];

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "Z")
	private boolean aBoolean228 = false;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "I")
	private int anInt904 = -1;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "B")
	private byte aByte35 = 2;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "Z")
	private boolean aBoolean229 = false;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "B")
	private byte aByte36 = 0;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
	private int anInt906 = 3353893;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "B")
	private byte aByte37 = 9;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "[I")
	private int[] anIntArray239 = new int[Class1.anInt22];

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "Z")
	private boolean aBoolean230 = true;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "[I")
	public int[] anIntArray240 = new int[2000];

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "[I")
	private int[] anIntArray241 = new int[50];

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "[I")
	private int[] anIntArray242 = new int[1000];

	@OriginalMember(owner = "client!client", name = "he", descriptor = "[I")
	private int[] anIntArray243 = new int[1000];

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
	private int anInt912 = 1;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "B")
	private byte aByte38 = 4;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "Lclient!UAWAYCTK;")
	private Class6_Sub2_Sub3 aClass6_Sub2_Sub3_6 = Class6_Sub2_Sub3.method390();

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "Z")
	private boolean aBoolean231 = false;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "[I")
	private int[] anIntArray244 = new int[1000];

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
	private int anInt914 = -1;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "Ljava/lang/String;")
	private String aString22 = "";

	@OriginalMember(owner = "client!client", name = "se", descriptor = "Z")
	private boolean aBoolean232 = false;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "[Lclient!IBHVCUAH;")
	private Class6_Sub2_Sub2_Sub1[] aClass6_Sub2_Sub2_Sub1Array5 = new Class6_Sub2_Sub2_Sub1[20];

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "B")
	private byte aByte39 = 1;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[500];

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "Lclient!LYHLTGUG;")
	private Class18 aClass18_1 = new Class18();

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "[[I")
	private int[][] anIntArrayArray23 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "De", descriptor = "I")
	private int anInt915 = 7759444;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "[J")
	private long[] aLongArray3 = new long[200];

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "B")
	private byte aByte40 = 6;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "Lclient!UAWAYCTK;")
	private Class6_Sub2_Sub3 aClass6_Sub2_Sub3_7 = Class6_Sub2_Sub3.method390();

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "[I")
	private int[] anIntArray245 = new int[151];

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "Z")
	private boolean aBoolean234 = false;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
	private int anInt922 = -1;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "I")
	private int anInt923 = -1;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "Ljava/lang/String;")
	private String aString23 = "";

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "Z")
	private boolean aBoolean235 = false;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "[I")
	private int[] anIntArray250 = new int[5];

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "I")
	private int anInt927 = 1;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "I")
	private int anInt930 = -1;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
	private int anInt932 = 5063219;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "[I")
	private int[] anIntArray251 = new int[2000];

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
	private int anInt935 = -1;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
	private int anInt936 = -1;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "Ljava/lang/String;")
	private String aString24 = "";

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "Ljava/lang/String;")
	private String aString25 = "";

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "I")
	private final int anInt938 = 100;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "[I")
	private int[] anIntArray252 = new int[100];

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "Lclient!UAWAYCTK;")
	private Class6_Sub2_Sub3 aClass6_Sub2_Sub3_8 = Class6_Sub2_Sub3.method390();

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "Lclient!UAWAYCTK;")
	private Class6_Sub2_Sub3 aClass6_Sub2_Sub3_9 = new Class6_Sub2_Sub3(741, new byte[5000]);

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "[Lclient!JKNLPRIU;")
	private Class6_Sub2_Sub1_Sub3_Sub1[] aClass6_Sub2_Sub1_Sub3_Sub1Array1 = new Class6_Sub2_Sub1_Sub3_Sub1[16384];

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "[I")
	private int[] anIntArray253 = new int[16384];

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "Z")
	private boolean aBoolean236 = true;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
	private int anInt943 = -1;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
	private int anInt945 = 2;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "Z")
	private volatile boolean aBoolean238 = false;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "Ljava/lang/String;")
	private String aString27 = "";

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "B")
	private byte aByte41 = 9;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "[Lclient!XHDQQNIR;")
	private Class6_Sub2_Sub2_Sub4[] aClass6_Sub2_Sub2_Sub4Array3 = new Class6_Sub2_Sub2_Sub4[100];

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "[I")
	private int[] anIntArray256 = new int[33];

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "[J")
	private long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
	private int anInt957 = 2301979;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
	private int anInt959 = 3;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "[I")
	private int[] anIntArray257 = new int[5];

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "Ljava/lang/String;")
	private String aString28 = "";

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "Z")
	private boolean aBoolean239 = false;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "Z")
	private boolean aBoolean240 = false;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "Z")
	private boolean aBoolean241 = false;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
	private int anInt962 = -1;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "[I")
	private int[] anIntArray258 = new int[5];

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "[I")
	private int[] anIntArray259 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "I")
	private int anInt969 = 30130;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
	private int anInt970 = 973;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "[Lclient!MQOIEGDZ;")
	public Class21[] aClass21Array1 = new Class21[5];

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "Z")
	private boolean aBoolean243 = false;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "I")
	private int anInt972 = 3;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
	private int anInt979 = -66;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "[Lclient!CGGBZSOS;")
	private Class3[] aClass3Array1 = new Class3[4];

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "Z")
	private boolean aBoolean244 = true;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "Lclient!URASIGRB;")
	private Class39 aClass39_11 = new Class39(41824);

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "[I")
	private int[] anIntArray260 = new int[5];

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "I")
	private int anInt983 = -77;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "Z")
	private volatile boolean aBoolean245 = false;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "Z")
	private boolean aBoolean247 = false;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "Z")
	private boolean aBoolean248 = false;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "Lclient!URASIGRB;")
	private Class39 aClass39_12 = new Class39(41824);

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "Z")
	private boolean aBoolean249 = true;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "[Lclient!IBHVCUAH;")
	private Class6_Sub2_Sub2_Sub1[] aClass6_Sub2_Sub2_Sub1Array6 = new Class6_Sub2_Sub2_Sub1[8];

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "[Lclient!IBHVCUAH;")
	private Class6_Sub2_Sub2_Sub1[] aClass6_Sub2_Sub2_Sub1Array7 = new Class6_Sub2_Sub2_Sub1[32];

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "[Lclient!IBHVCUAH;")
	private Class6_Sub2_Sub2_Sub1[] aClass6_Sub2_Sub2_Sub1Array8 = new Class6_Sub2_Sub2_Sub1[32];

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "I")
	private int anInt985 = 2048;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "I")
	private int anInt986 = 2047;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "[Lclient!UFGXOLGK;")
	private Class6_Sub2_Sub1_Sub3_Sub2[] aClass6_Sub2_Sub1_Sub3_Sub2Array1 = new Class6_Sub2_Sub1_Sub3_Sub2[this.anInt985];

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "[I")
	private int[] anIntArray265 = new int[this.anInt985];

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "[I")
	private int[] anIntArray266 = new int[this.anInt985];

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "[Lclient!UAWAYCTK;")
	private Class6_Sub2_Sub3[] aClass6_Sub2_Sub3Array1 = new Class6_Sub2_Sub3[this.anInt985];

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
	private int anInt989 = -1;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "[I")
	private int[] anIntArray267 = new int[50];

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
	private int anInt991 = 974;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "Z")
	private boolean aBoolean250 = true;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "I")
	private int anInt992 = -752;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "I")
	private int anInt993 = 504;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "Z")
	private boolean aBoolean251 = false;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "Z")
	private boolean aBoolean252 = false;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "Z")
	private boolean aBoolean253 = false;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "[Lclient!XHDQQNIR;")
	private Class6_Sub2_Sub2_Sub4[] aClass6_Sub2_Sub2_Sub4Array4 = new Class6_Sub2_Sub2_Sub4[2];

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "Z")
	private boolean aBoolean254 = false;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "Z")
	private boolean aBoolean255 = false;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "[Lclient!IBHVCUAH;")
	private Class6_Sub2_Sub2_Sub1[] aClass6_Sub2_Sub2_Sub1Array9 = new Class6_Sub2_Sub2_Sub1[100];

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "Z")
	private boolean aBoolean256 = false;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "Z")
	private boolean aBoolean257 = true;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "[I")
	private int[] anIntArray268 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "Z")
	private boolean aBoolean258 = true;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
	private int anInt1019 = 33820;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
	private int anInt1020 = -1;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "I")
	private int anInt1023 = -1;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
	private int anInt1024 = 1;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "[I")
	private int[] anIntArray269 = new int[256];

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "[I")
	private int[] anIntArray270 = new int[5];

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "[I")
	private int[] anIntArray271 = new int[7];

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "Z")
	private boolean aBoolean259 = false;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "Z")
	private boolean aBoolean260 = false;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "Z")
	private boolean aBoolean261 = false;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "[I")
	private int[] anIntArray272 = new int[100];

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[100];

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[100];

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "I")
	private int anInt1034 = -1;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "[Lclient!IBHVCUAH;")
	private Class6_Sub2_Sub2_Sub1[] aClass6_Sub2_Sub2_Sub1Array10 = new Class6_Sub2_Sub2_Sub1[32];

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "[Lclient!XHDQQNIR;")
	private Class6_Sub2_Sub2_Sub4[] aClass6_Sub2_Sub2_Sub4Array5 = new Class6_Sub2_Sub2_Sub4[13];

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "[I")
	private final int[] anIntArray273 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "Z")
	private boolean aBoolean262 = false;

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "[[[Lclient!URASIGRB;")
	private Class39[][][] aClass39ArrayArrayArray1 = new Class39[4][104][104];

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[200];

	static {
		@Pc(73) int local73 = 2;
		@Pc(75) int local75;
		for (local75 = 0; local75 < 32; local75++) {
			anIntArray228[local75] = local73 - 1;
			local73 += local73;
		}
		anInt865 = 10;
		aBoolean222 = true;
		anInt897 = 6;
		anIntArrayArray22 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		aBoolean237 = true;
		aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		aByte42 = 85;
		anIntArray264 = new int[99];
		local73 = 0;
		for (local75 = 0; local75 < 99; local75++) {
			@Pc(382) int local382 = local75 + 1;
			@Pc(395) int local395 = (int) ((double) local382 + Math.pow(2.0D, (double) local382 / 7.0D) * 300.0D);
			local73 += local395;
			anIntArray264[local75] = local73 / 4;
		}
		aString30 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		anInt1021 = -652;
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 333);
			if (arg0.length == 5) {
				anInt865 = Integer.parseInt(arg0[0]);
				anInt866 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method697();
				} else if (arg0[2].equals("highmem")) {
					method639();
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
				signlink.anInt1047 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method571();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IZ)Ljava/lang/String;")
	private static String method624(@OriginalArg(0) int arg0) {
		try {
			@Pc(8) String local8 = String.valueOf(arg0);
			for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
				local8 = local8.substring(0, local13) + "," + local8.substring(local13);
			}
			if (local8.length() > 8) {
				local8 = "@gre@" + local8.substring(0, local8.length() - 8) + " million @whi@(" + local8 + ")";
			} else if (local8.length() > 4) {
				local8 = "@cya@" + local8.substring(0, local8.length() - 4) + "K @whi@(" + local8 + ")";
			}
			return " " + local8;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("70932, " + arg0 + ", " + false + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(III)Ljava/lang/String;")
	private static String method625(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
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
			signlink.reporterror("3160, " + arg0 + ", " + -695 + ", " + arg1 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private static void method639() {
		try {
			Class25.aBoolean141 = false;
			Class6_Sub2_Sub2_Sub3.aBoolean100 = false;
			aBoolean223 = false;
			Class15.aBoolean72 = false;
			Class2.aBoolean10 = false;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("35071, " + 1652 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)Ljava/lang/String;")
	private static String method665(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("22927, " + 538 + ", " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private static void method697() {
		try {
			Class25.aBoolean141 = true;
			Class6_Sub2_Sub2_Sub3.aBoolean100 = true;
			aBoolean223 = true;
			Class15.aBoolean72 = true;
			Class2.aBoolean10 = true;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("56043, " + 5 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	private void method584() {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt939; local1++) {
				@Pc(8) int local8 = this.anIntArray253[local1];
				@Pc(13) Class6_Sub2_Sub1_Sub3_Sub1 local13 = this.aClass6_Sub2_Sub1_Sub3_Sub1Array1[local8];
				if (local13 != null) {
					this.method585(594, local13.aClass16_1.aByte10, local13);
				}
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("6089, " + -28 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!TTYUWHXI;)V")
	private void method585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub2_Sub1_Sub3 arg2) {
		try {
			@Pc(5) boolean local5 = false;
			if (arg2.anInt651 < 128 || arg2.anInt652 < 128 || arg2.anInt651 >= 13184 || arg2.anInt652 >= 13184) {
				arg2.anInt616 = -1;
				arg2.anInt630 = -1;
				arg2.anInt626 = 0;
				arg2.anInt627 = 0;
				arg2.anInt651 = arg2.anIntArray143[0] * 128 + arg2.anInt648 * 64;
				arg2.anInt652 = arg2.anIntArray144[0] * 128 + arg2.anInt648 * 64;
				arg2.method448();
			}
			if (arg2 == aClass6_Sub2_Sub1_Sub3_Sub2_1 && (arg2.anInt651 < 1536 || arg2.anInt652 < 1536 || arg2.anInt651 >= 11776 || arg2.anInt652 >= 11776)) {
				arg2.anInt616 = -1;
				arg2.anInt630 = -1;
				arg2.anInt626 = 0;
				arg2.anInt627 = 0;
				arg2.anInt651 = arg2.anIntArray143[0] * 128 + arg2.anInt648 * 64;
				arg2.anInt652 = arg2.anIntArray144[0] * 128 + arg2.anInt648 * 64;
				arg2.method448();
			}
			if (arg2.anInt626 > anInt928) {
				this.method586(arg2);
			} else if (arg2.anInt627 >= anInt928) {
				this.method587(arg2);
			} else {
				this.method588(arg2);
			}
			this.method589(arg2);
			this.method590(arg2);
		} catch (@Pc(156) RuntimeException local156) {
			signlink.reporterror("17037, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local156.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!TTYUWHXI;Z)V")
	private void method586(@OriginalArg(0) Class6_Sub2_Sub1_Sub3 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt626 - anInt928;
			@Pc(20) int local20 = arg0.anInt622 * 128 + arg0.anInt648 * 64;
			@Pc(30) int local30 = arg0.anInt624 * 128 + arg0.anInt648 * 64;
			arg0.anInt651 += (local20 - arg0.anInt651) / local4;
			arg0.anInt652 += (local30 - arg0.anInt652) / local4;
			arg0.anInt629 = 0;
			if (arg0.anInt628 == 0) {
				arg0.anInt662 = 1024;
			}
			if (arg0.anInt628 == 1) {
				arg0.anInt662 = 1536;
			}
			if (arg0.anInt628 == 2) {
				arg0.anInt662 = 0;
			}
			if (arg0.anInt628 == 3) {
				arg0.anInt662 = 512;
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("99267, " + arg0 + ", " + true + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!TTYUWHXI;Z)V")
	private void method587(@OriginalArg(0) Class6_Sub2_Sub1_Sub3 arg0) {
		try {
			if (arg0.anInt627 == anInt928 || arg0.anInt616 == -1 || arg0.anInt619 != 0 || arg0.anInt618 + 1 > Class33.aClass33Array1[arg0.anInt616].method371(arg0.anInt617, this.anInt842)) {
				@Pc(30) int local30 = arg0.anInt627 - arg0.anInt626;
				@Pc(35) int local35 = anInt928 - arg0.anInt626;
				@Pc(45) int local45 = arg0.anInt622 * 128 + arg0.anInt648 * 64;
				@Pc(55) int local55 = arg0.anInt624 * 128 + arg0.anInt648 * 64;
				@Pc(65) int local65 = arg0.anInt623 * 128 + arg0.anInt648 * 64;
				@Pc(75) int local75 = arg0.anInt625 * 128 + arg0.anInt648 * 64;
				arg0.anInt651 = (local45 * (local30 - local35) + local65 * local35) / local30;
				arg0.anInt652 = (local55 * (local30 - local35) + local75 * local35) / local30;
			}
			arg0.anInt629 = 0;
			if (arg0.anInt628 == 0) {
				arg0.anInt662 = 1024;
			}
			if (arg0.anInt628 == 1) {
				arg0.anInt662 = 1536;
			}
			if (arg0.anInt628 == 2) {
				arg0.anInt662 = 0;
			}
			if (arg0.anInt628 == 3) {
				arg0.anInt662 = 512;
			}
			arg0.anInt653 = arg0.anInt662;
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("77766, " + arg0 + ", " + false + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!TTYUWHXI;B)V")
	private void method588(@OriginalArg(0) Class6_Sub2_Sub1_Sub3 arg0) {
		try {
			arg0.anInt654 = arg0.anInt640;
			if (arg0.anInt621 == 0) {
				arg0.anInt629 = 0;
			} else {
				if (arg0.anInt616 != -1 && arg0.anInt619 == 0) {
					@Pc(31) Class33 local31 = Class33.aClass33Array1[arg0.anInt616];
					if (arg0.anInt650 > 0 && local31.anInt564 == 0) {
						arg0.anInt629++;
						return;
					}
					if (arg0.anInt650 <= 0 && local31.anInt565 == 0) {
						arg0.anInt629++;
						return;
					}
				}
				@Pc(60) int local60 = arg0.anInt651;
				@Pc(63) int local63 = arg0.anInt652;
				@Pc(78) int local78 = arg0.anIntArray143[arg0.anInt621 - 1] * 128 + arg0.anInt648 * 64;
				@Pc(93) int local93 = arg0.anIntArray144[arg0.anInt621 - 1] * 128 + arg0.anInt648 * 64;
				if (local78 - local60 <= 256 && local78 - local60 >= -256 && local93 - local63 <= 256 && local93 - local63 >= -256) {
					if (local60 < local78) {
						if (local63 < local93) {
							arg0.anInt662 = 1280;
						} else if (local63 > local93) {
							arg0.anInt662 = 1792;
						} else {
							arg0.anInt662 = 1536;
						}
					} else if (local60 > local78) {
						if (local63 < local93) {
							arg0.anInt662 = 768;
						} else if (local63 > local93) {
							arg0.anInt662 = 256;
						} else {
							arg0.anInt662 = 512;
						}
					} else if (local63 < local93) {
						arg0.anInt662 = 1024;
					} else {
						arg0.anInt662 = 0;
					}
					@Pc(187) int local187 = arg0.anInt662 - arg0.anInt653 & 0x7FF;
					if (local187 > 1024) {
						local187 -= 2048;
					}
					@Pc(194) int local194 = arg0.anInt644;
					if (local187 >= -256 && local187 <= 256) {
						local194 = arg0.anInt643;
					} else if (local187 >= 256 && local187 < 768) {
						local194 = arg0.anInt646;
					} else if (local187 >= -768 && local187 <= -256) {
						local194 = arg0.anInt645;
					}
					if (local194 == -1) {
						local194 = arg0.anInt643;
					}
					arg0.anInt654 = local194;
					@Pc(236) int local236 = 4;
					if (arg0.anInt653 != arg0.anInt662 && arg0.anInt657 == -1 && arg0.anInt649 != 0) {
						local236 = 2;
					}
					if (arg0.anInt621 > 2) {
						local236 = 6;
					}
					if (arg0.anInt621 > 3) {
						local236 = 8;
					}
					if (arg0.anInt629 > 0 && arg0.anInt621 > 1) {
						local236 = 8;
						arg0.anInt629--;
					}
					if (arg0.aBooleanArray8[arg0.anInt621 - 1]) {
						local236 <<= 0x1;
					}
					if (local236 >= 8 && arg0.anInt654 == arg0.anInt643 && arg0.anInt647 != -1) {
						arg0.anInt654 = arg0.anInt647;
					}
					if (local60 < local78) {
						arg0.anInt651 += local236;
						if (arg0.anInt651 > local78) {
							arg0.anInt651 = local78;
						}
					} else if (local60 > local78) {
						arg0.anInt651 -= local236;
						if (arg0.anInt651 < local78) {
							arg0.anInt651 = local78;
						}
					}
					if (local63 < local93) {
						arg0.anInt652 += local236;
						if (arg0.anInt652 > local93) {
							arg0.anInt652 = local93;
						}
					} else if (local63 > local93) {
						arg0.anInt652 -= local236;
						if (arg0.anInt652 < local93) {
							arg0.anInt652 = local93;
						}
					}
					if (arg0.anInt651 == local78 && arg0.anInt652 == local93) {
						arg0.anInt621--;
						if (arg0.anInt650 > 0) {
							arg0.anInt650--;
							return;
						}
					}
				} else {
					arg0.anInt651 = local78;
					arg0.anInt652 = local93;
				}
			}
		} catch (@Pc(398) RuntimeException local398) {
			signlink.reporterror("49406, " + arg0 + ", " + 5 + ", " + local398.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!TTYUWHXI;I)V")
	private void method589(@OriginalArg(0) Class6_Sub2_Sub1_Sub3 arg0) {
		try {
			if (anInt897 != 6) {
				this.method576();
			}
			if (arg0.anInt649 != 0) {
				@Pc(32) int local32;
				@Pc(38) int local38;
				if (arg0.anInt657 != -1 && arg0.anInt657 < 32768) {
					@Pc(24) Class6_Sub2_Sub1_Sub3_Sub1 local24 = this.aClass6_Sub2_Sub1_Sub3_Sub1Array1[arg0.anInt657];
					if (local24 != null) {
						local32 = arg0.anInt651 - local24.anInt651;
						local38 = arg0.anInt652 - local24.anInt652;
						if (local32 != 0 || local38 != 0) {
							arg0.anInt662 = (int) (Math.atan2((double) local32, (double) local38) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(63) int local63;
				if (arg0.anInt657 >= 32768) {
					local63 = arg0.anInt657 - 32768;
					if (local63 == this.anInt943) {
						local63 = this.anInt986;
					}
					@Pc(75) Class6_Sub2_Sub1_Sub3_Sub2 local75 = this.aClass6_Sub2_Sub1_Sub3_Sub2Array1[local63];
					if (local75 != null) {
						local38 = arg0.anInt651 - local75.anInt651;
						@Pc(89) int local89 = arg0.anInt652 - local75.anInt652;
						if (local38 != 0 || local89 != 0) {
							arg0.anInt662 = (int) (Math.atan2((double) local38, (double) local89) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt658 != 0 || arg0.anInt659 != 0) && (arg0.anInt621 == 0 || arg0.anInt629 > 0)) {
					local63 = arg0.anInt651 - (arg0.anInt658 - this.anInt893 - this.anInt893) * 64;
					local32 = arg0.anInt652 - (arg0.anInt659 - this.anInt894 - this.anInt894) * 64;
					if (local63 != 0 || local32 != 0) {
						arg0.anInt662 = (int) (Math.atan2((double) local63, (double) local32) * 325.949D) & 0x7FF;
					}
					arg0.anInt658 = 0;
					arg0.anInt659 = 0;
				}
				local63 = arg0.anInt662 - arg0.anInt653 & 0x7FF;
				if (local63 != 0) {
					if (local63 < arg0.anInt649 || local63 > 2048 - arg0.anInt649) {
						arg0.anInt653 = arg0.anInt662;
					} else if (local63 > 1024) {
						arg0.anInt653 -= arg0.anInt649;
					} else {
						arg0.anInt653 += arg0.anInt649;
					}
					arg0.anInt653 &= 0x7FF;
					if (arg0.anInt654 == arg0.anInt640 && arg0.anInt653 != arg0.anInt662) {
						if (arg0.anInt641 != -1) {
							arg0.anInt654 = arg0.anInt641;
							return;
						}
						arg0.anInt654 = arg0.anInt643;
						return;
					}
				}
			}
		} catch (@Pc(243) RuntimeException local243) {
			signlink.reporterror("98441, " + arg0 + ", " + 6 + ", " + local243.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!TTYUWHXI;)V")
	private void method590(@OriginalArg(1) Class6_Sub2_Sub1_Sub3 arg0) {
		try {
			arg0.aBoolean173 = false;
			@Pc(22) Class33 local22;
			if (arg0.anInt654 != -1) {
				local22 = Class33.aClass33Array1[arg0.anInt654];
				arg0.anInt656++;
				if (arg0.anInt655 < local22.anInt558 && arg0.anInt656 > local22.method371(arg0.anInt655, this.anInt842)) {
					arg0.anInt656 = 0;
					arg0.anInt655++;
				}
				if (arg0.anInt655 >= local22.anInt558) {
					arg0.anInt656 = 0;
					arg0.anInt655 = 0;
				}
			}
			if (arg0.anInt630 != -1 && anInt928 >= arg0.anInt633) {
				if (arg0.anInt631 < 0) {
					arg0.anInt631 = 0;
				}
				local22 = Class29.aClass29Array1[arg0.anInt630].aClass33_2;
				arg0.anInt632++;
				while (arg0.anInt631 < local22.anInt558 && arg0.anInt632 > local22.method371(arg0.anInt631, this.anInt842)) {
					arg0.anInt632 -= local22.method371(arg0.anInt631, this.anInt842);
					arg0.anInt631++;
				}
				if (arg0.anInt631 >= local22.anInt558 && (arg0.anInt631 < 0 || arg0.anInt631 >= local22.anInt558)) {
					arg0.anInt630 = -1;
				}
			}
			if (arg0.anInt616 != -1 && arg0.anInt619 <= 1) {
				local22 = Class33.aClass33Array1[arg0.anInt616];
				if (local22.anInt564 == 1 && arg0.anInt650 > 0 && arg0.anInt626 <= anInt928 && arg0.anInt627 < anInt928) {
					arg0.anInt619 = 1;
					return;
				}
			}
			if (arg0.anInt616 != -1 && arg0.anInt619 == 0) {
				local22 = Class33.aClass33Array1[arg0.anInt616];
				arg0.anInt618++;
				while (arg0.anInt617 < local22.anInt558 && arg0.anInt618 > local22.method371(arg0.anInt617, this.anInt842)) {
					arg0.anInt618 -= local22.method371(arg0.anInt617, this.anInt842);
					arg0.anInt617++;
				}
				if (arg0.anInt617 >= local22.anInt558) {
					arg0.anInt617 -= local22.anInt559;
					arg0.anInt620++;
					if (arg0.anInt620 >= local22.anInt563) {
						arg0.anInt616 = -1;
					}
					if (arg0.anInt617 < 0 || arg0.anInt617 >= local22.anInt558) {
						arg0.anInt616 = -1;
					}
				}
				arg0.aBoolean173 = local22.aBoolean147;
			}
			if (arg0.anInt619 > 0) {
				arg0.anInt619--;
			}
		} catch (@Pc(272) RuntimeException local272) {
			signlink.reporterror("68352, " + 8 + ", " + arg0 + ", " + local272.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	private void method591() {
		try {
			if (this.aBoolean240) {
				this.aBoolean240 = false;
				this.aClass28_3.method357(4, 0, super.aGraphics2);
				this.aClass28_4.method357(357, 0, super.aGraphics2);
				this.aClass28_5.method357(4, 722, super.aGraphics2);
				this.aClass28_6.method357(205, 743, super.aGraphics2);
				this.aClass28_7.method357(0, 0, super.aGraphics2);
				this.aClass28_8.method357(4, 516, super.aGraphics2);
				this.aClass28_9.method357(205, 516, super.aGraphics2);
				this.aClass28_10.method357(357, 496, super.aGraphics2);
				this.aClass28_11.method357(338, 0, super.aGraphics2);
				this.aBoolean252 = true;
				this.aBoolean239 = true;
				this.aBoolean247 = true;
				this.aBoolean248 = true;
				if (this.anInt978 != 2) {
					this.aClass28_23.method357(4, 4, super.aGraphics2);
					this.aClass28_22.method357(4, 550, super.aGraphics2);
				}
				anInt1028++;
				if (anInt1028 > 92) {
					anInt1028 = 0;
					this.aClass6_Sub2_Sub3_7.method391(248);
				}
			}
			if (this.anInt978 == 2) {
				this.method645();
			}
			if (this.aBoolean262 && this.anInt973 == 1) {
				this.aBoolean252 = true;
			}
			@Pc(152) boolean local152;
			if (this.anInt1034 != -1) {
				local152 = this.method698(this.anInt1034, this.anInt1039);
				if (local152) {
					this.aBoolean252 = true;
				}
			}
			if (this.anInt878 == 2) {
				this.aBoolean252 = true;
			}
			if (this.anInt1042 == 2) {
				this.aBoolean252 = true;
			}
			if (this.aBoolean252) {
				this.method656(this.aByte40);
				this.aBoolean252 = false;
			}
			if (this.anInt923 == -1) {
				this.aClass18_1.anInt365 = this.anInt857 - this.anInt952 - 77;
				if (super.anInt815 > 448 && super.anInt815 < 560 && super.anInt816 > 332) {
					this.method664(77, this.anInt857, super.anInt815 - 17, 0, 463, -1, this.aClass18_1, super.anInt816 - 357);
				}
				@Pc(235) int local235 = this.anInt857 - this.aClass18_1.anInt365 - 77;
				if (local235 < 0) {
					local235 = 0;
				}
				if (local235 > this.anInt857 - 77) {
					local235 = this.anInt857 - 77;
				}
				if (this.anInt952 != local235) {
					this.anInt952 = local235;
					this.aBoolean239 = true;
				}
			}
			if (this.anInt923 != -1) {
				local152 = this.method698(this.anInt923, this.anInt1039);
				if (local152) {
					this.aBoolean239 = true;
				}
			}
			if (this.anInt878 == 3) {
				this.aBoolean239 = true;
			}
			if (this.anInt1042 == 3) {
				this.aBoolean239 = true;
			}
			if (this.aString26 != null) {
				this.aBoolean239 = true;
			}
			if (this.aBoolean262 && this.anInt973 == 2) {
				this.aBoolean239 = true;
			}
			if (this.aBoolean239) {
				this.method630();
				this.aBoolean239 = false;
			}
			if (this.anInt978 == 2) {
				this.method593();
				this.aClass28_22.method357(4, 550, super.aGraphics2);
			}
			if (this.anInt904 != -1) {
				this.aBoolean247 = true;
			}
			if (this.aBoolean247) {
				if (this.anInt904 != -1 && this.anInt904 == this.anInt836) {
					this.anInt904 = -1;
					this.aClass6_Sub2_Sub3_7.method391(132);
					this.aClass6_Sub2_Sub3_7.method392(this.anInt836);
				}
				this.aBoolean247 = false;
				this.aClass28_27.method356();
				this.aClass6_Sub2_Sub2_Sub4_5.method531(0, 0, this.anInt992);
				if (this.anInt1034 == -1) {
					if (this.anIntArray259[this.anInt836] != -1) {
						if (this.anInt836 == 0) {
							this.aClass6_Sub2_Sub2_Sub4_16.method531(22, 10, this.anInt992);
						}
						if (this.anInt836 == 1) {
							this.aClass6_Sub2_Sub2_Sub4_17.method531(54, 8, this.anInt992);
						}
						if (this.anInt836 == 2) {
							this.aClass6_Sub2_Sub2_Sub4_17.method531(82, 8, this.anInt992);
						}
						if (this.anInt836 == 3) {
							this.aClass6_Sub2_Sub2_Sub4_18.method531(110, 8, this.anInt992);
						}
						if (this.anInt836 == 4) {
							this.aClass6_Sub2_Sub2_Sub4_20.method531(153, 8, this.anInt992);
						}
						if (this.anInt836 == 5) {
							this.aClass6_Sub2_Sub2_Sub4_20.method531(181, 8, this.anInt992);
						}
						if (this.anInt836 == 6) {
							this.aClass6_Sub2_Sub2_Sub4_19.method531(209, 9, this.anInt992);
						}
					}
					if (this.anIntArray259[0] != -1 && (this.anInt904 != 0 || anInt928 % 20 < 10)) {
						this.aClass6_Sub2_Sub2_Sub4Array5[0].method531(29, 13, this.anInt992);
					}
					if (this.anIntArray259[1] != -1 && (this.anInt904 != 1 || anInt928 % 20 < 10)) {
						this.aClass6_Sub2_Sub2_Sub4Array5[1].method531(53, 11, this.anInt992);
					}
					if (this.anIntArray259[2] != -1 && (this.anInt904 != 2 || anInt928 % 20 < 10)) {
						this.aClass6_Sub2_Sub2_Sub4Array5[2].method531(82, 11, this.anInt992);
					}
					if (this.anIntArray259[3] != -1 && (this.anInt904 != 3 || anInt928 % 20 < 10)) {
						this.aClass6_Sub2_Sub2_Sub4Array5[3].method531(115, 12, this.anInt992);
					}
					if (this.anIntArray259[4] != -1 && (this.anInt904 != 4 || anInt928 % 20 < 10)) {
						this.aClass6_Sub2_Sub2_Sub4Array5[4].method531(153, 13, this.anInt992);
					}
					if (this.anIntArray259[5] != -1 && (this.anInt904 != 5 || anInt928 % 20 < 10)) {
						this.aClass6_Sub2_Sub2_Sub4Array5[5].method531(180, 11, this.anInt992);
					}
					if (this.anIntArray259[6] != -1 && (this.anInt904 != 6 || anInt928 % 20 < 10)) {
						this.aClass6_Sub2_Sub2_Sub4Array5[6].method531(208, 13, this.anInt992);
					}
				}
				this.aClass28_27.method357(160, 516, super.aGraphics2);
				this.aClass28_26.method356();
				this.aClass6_Sub2_Sub2_Sub4_4.method531(0, 0, this.anInt992);
				if (this.anInt1034 == -1) {
					if (this.anIntArray259[this.anInt836] != -1) {
						if (this.anInt836 == 7) {
							this.aClass6_Sub2_Sub2_Sub4_11.method531(42, 0, this.anInt992);
						}
						if (this.anInt836 == 8) {
							this.aClass6_Sub2_Sub2_Sub4_12.method531(74, 0, this.anInt992);
						}
						if (this.anInt836 == 9) {
							this.aClass6_Sub2_Sub2_Sub4_12.method531(102, 0, this.anInt992);
						}
						if (this.anInt836 == 10) {
							this.aClass6_Sub2_Sub2_Sub4_13.method531(130, 1, this.anInt992);
						}
						if (this.anInt836 == 11) {
							this.aClass6_Sub2_Sub2_Sub4_15.method531(173, 0, this.anInt992);
						}
						if (this.anInt836 == 12) {
							this.aClass6_Sub2_Sub2_Sub4_15.method531(201, 0, this.anInt992);
						}
						if (this.anInt836 == 13) {
							this.aClass6_Sub2_Sub2_Sub4_14.method531(229, 0, this.anInt992);
						}
					}
					if (this.anIntArray259[8] != -1 && (this.anInt904 != 8 || anInt928 % 20 < 10)) {
						this.aClass6_Sub2_Sub2_Sub4Array5[7].method531(74, 2, this.anInt992);
					}
					if (this.anIntArray259[9] != -1 && (this.anInt904 != 9 || anInt928 % 20 < 10)) {
						this.aClass6_Sub2_Sub2_Sub4Array5[8].method531(102, 3, this.anInt992);
					}
					if (this.anIntArray259[10] != -1 && (this.anInt904 != 10 || anInt928 % 20 < 10)) {
						this.aClass6_Sub2_Sub2_Sub4Array5[9].method531(137, 4, this.anInt992);
					}
					if (this.anIntArray259[11] != -1 && (this.anInt904 != 11 || anInt928 % 20 < 10)) {
						this.aClass6_Sub2_Sub2_Sub4Array5[10].method531(174, 2, this.anInt992);
					}
					if (this.anIntArray259[12] != -1 && (this.anInt904 != 12 || anInt928 % 20 < 10)) {
						this.aClass6_Sub2_Sub2_Sub4Array5[11].method531(201, 2, this.anInt992);
					}
					if (this.anIntArray259[13] != -1 && (this.anInt904 != 13 || anInt928 % 20 < 10)) {
						this.aClass6_Sub2_Sub2_Sub4Array5[12].method531(226, 2, this.anInt992);
					}
				}
				this.aClass28_26.method357(466, 496, super.aGraphics2);
				this.aClass28_23.method356();
			}
			if (this.aBoolean248) {
				this.aBoolean248 = false;
				this.aClass28_25.method356();
				this.aClass6_Sub2_Sub2_Sub4_3.method531(0, 0, this.anInt992);
				this.aClass6_Sub2_Sub2_Sub2_3.method161(16777215, true, "Public chat", 55, 28);
				if (this.anInt1036 == 0) {
					this.aClass6_Sub2_Sub2_Sub2_3.method161(65280, true, "On", 55, 41);
				}
				if (this.anInt1036 == 1) {
					this.aClass6_Sub2_Sub2_Sub2_3.method161(16776960, true, "Friends", 55, 41);
				}
				if (this.anInt1036 == 2) {
					this.aClass6_Sub2_Sub2_Sub2_3.method161(16711680, true, "Off", 55, 41);
				}
				if (this.anInt1036 == 3) {
					this.aClass6_Sub2_Sub2_Sub2_3.method161(65535, true, "Hide", 55, 41);
				}
				this.aClass6_Sub2_Sub2_Sub2_3.method161(16777215, true, "Private chat", 184, 28);
				if (this.anInt934 == 0) {
					this.aClass6_Sub2_Sub2_Sub2_3.method161(65280, true, "On", 184, 41);
				}
				if (this.anInt934 == 1) {
					this.aClass6_Sub2_Sub2_Sub2_3.method161(16776960, true, "Friends", 184, 41);
				}
				if (this.anInt934 == 2) {
					this.aClass6_Sub2_Sub2_Sub2_3.method161(16711680, true, "Off", 184, 41);
				}
				this.aClass6_Sub2_Sub2_Sub2_3.method161(16777215, true, "Trade/compete", 324, 28);
				if (this.anInt1006 == 0) {
					this.aClass6_Sub2_Sub2_Sub2_3.method161(65280, true, "On", 324, 41);
				}
				if (this.anInt1006 == 1) {
					this.aClass6_Sub2_Sub2_Sub2_3.method161(16776960, true, "Friends", 324, 41);
				}
				if (this.anInt1006 == 2) {
					this.aClass6_Sub2_Sub2_Sub2_3.method161(16711680, true, "Off", 324, 41);
				}
				this.aClass6_Sub2_Sub2_Sub2_3.method161(16777215, true, "Report abuse", 458, 33);
				this.aClass28_25.method357(453, 0, super.aGraphics2);
				this.aClass28_23.method356();
			}
			this.anInt1039 = 0;
			if (this.aByte32 != -26) {
				this.aClass39ArrayArrayArray1 = null;
			}
		} catch (@Pc(1098) RuntimeException local1098) {
			signlink.reporterror("74724, " + -26 + ", " + local1098.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method592(@OriginalArg(0) int arg0) {
		try {
			signlink.anInt1054 = arg0;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("56563, " + arg0 + ", " + -21639 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	private void method593() {
		try {
			this.aClass28_22.method356();
			@Pc(18) int local18;
			@Pc(20) int local20;
			if (this.anInt1027 == 2) {
				@Pc(13) byte[] local13 = this.aClass6_Sub2_Sub2_Sub4_9.aByteArray20;
				@Pc(15) int[] local15 = Class6_Sub2_Sub2.anIntArray206;
				local18 = local13.length;
				for (local20 = 0; local20 < local18; local20++) {
					if (local13[local20] == 0) {
						local15[local20] = 0;
					}
				}
				this.aClass6_Sub2_Sub2_Sub1_3.method141(33, 33, 25, this.anIntArray215, this.anInt832, this.aByte39, this.anIntArray256, 25, 0, 256, 0);
				this.aClass28_23.method356();
			} else {
				@Pc(65) int local65 = this.anInt832 + this.anInt867 & 0x7FF;
				@Pc(72) int local72 = aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt651 / 32 + 48;
				local18 = 464 - aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt652 / 32;
				this.anInt1008 += 0;
				this.aClass6_Sub2_Sub2_Sub1_9.method141(146, 151, local72, this.anIntArray235, local65, this.aByte39, this.anIntArray245, local18, 5, this.anInt911 + 256, 25);
				this.aClass6_Sub2_Sub2_Sub1_3.method141(33, 33, 25, this.anIntArray215, this.anInt832, this.aByte39, this.anIntArray256, 25, 0, 256, 0);
				for (local20 = 0; local20 < this.anInt909; local20++) {
					local72 = this.anIntArray242[local20] * 4 + 2 - aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt651 / 32;
					local18 = this.anIntArray243[local20] * 4 + 2 - aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt652 / 32;
					this.method644(local72, local18, this.aClass6_Sub2_Sub2_Sub1Array4[local20]);
				}
				@Pc(175) int local175;
				for (@Pc(171) int local171 = 0; local171 < 104; local171++) {
					for (local175 = 0; local175 < 104; local175++) {
						@Pc(187) Class39 local187 = this.aClass39ArrayArrayArray1[this.anInt1026][local171][local175];
						if (local187 != null) {
							local72 = local171 * 4 + 2 - aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt651 / 32;
							local18 = local175 * 4 + 2 - aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt652 / 32;
							this.method644(local72, local18, this.aClass6_Sub2_Sub2_Sub1_13);
						}
					}
				}
				for (local175 = 0; local175 < this.anInt939; local175++) {
					@Pc(238) Class6_Sub2_Sub1_Sub3_Sub1 local238 = this.aClass6_Sub2_Sub1_Sub3_Sub1Array1[this.anIntArray253[local175]];
					if (local238 != null && local238.method446()) {
						@Pc(247) Class16 local247 = local238.aClass16_1;
						if (local247.anIntArray59 != null) {
							local247 = local247.method205();
						}
						if (local247 != null && local247.aBoolean80 && local247.aBoolean78) {
							local72 = local238.anInt651 / 32 - aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt651 / 32;
							local18 = local238.anInt652 / 32 - aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt652 / 32;
							this.method644(local72, local18, this.aClass6_Sub2_Sub2_Sub1_14);
						}
					}
				}
				@Pc(306) Class6_Sub2_Sub1_Sub3_Sub2 local306;
				for (@Pc(296) int local296 = 0; local296 < this.anInt987; local296++) {
					local306 = this.aClass6_Sub2_Sub1_Sub3_Sub2Array1[this.anIntArray265[local296]];
					if (local306 != null && local306.method446()) {
						local72 = local306.anInt651 / 32 - aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt651 / 32;
						local18 = local306.anInt652 / 32 - aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt652 / 32;
						@Pc(334) boolean local334 = false;
						@Pc(338) long local338 = Class42.method464(local306.aString15);
						for (@Pc(340) int local340 = 0; local340 < this.anInt981; local340++) {
							if (local338 == this.aLongArray3[local340] && this.anIntArray225[local340] != 0) {
								local334 = true;
								break;
							}
						}
						@Pc(365) boolean local365 = false;
						if (aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt665 != 0 && local306.anInt665 != 0 && aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt665 == local306.anInt665) {
							local365 = true;
						}
						if (local334) {
							this.method644(local72, local18, this.aClass6_Sub2_Sub2_Sub1_16);
						} else if (local365) {
							this.method644(local72, local18, this.aClass6_Sub2_Sub2_Sub1_17);
						} else {
							this.method644(local72, local18, this.aClass6_Sub2_Sub2_Sub1_15);
						}
					}
				}
				if (this.anInt960 != 0 && anInt928 % 20 < 10) {
					if (this.anInt960 == 1 && this.anInt903 >= 0 && this.anInt903 < this.aClass6_Sub2_Sub1_Sub3_Sub1Array1.length) {
						@Pc(439) Class6_Sub2_Sub1_Sub3_Sub1 local439 = this.aClass6_Sub2_Sub1_Sub3_Sub1Array1[this.anInt903];
						if (local439 != null) {
							local72 = local439.anInt651 / 32 - aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt651 / 32;
							local18 = local439.anInt652 / 32 - aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt652 / 32;
							this.method703(local18, this.aClass6_Sub2_Sub2_Sub1_8, local72);
						}
					}
					if (this.anInt960 == 2) {
						local72 = (this.anInt879 - this.anInt893) * 4 + 2 - aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt651 / 32;
						local18 = (this.anInt880 - this.anInt894) * 4 + 2 - aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt652 / 32;
						this.method703(local18, this.aClass6_Sub2_Sub2_Sub1_8, local72);
					}
					if (this.anInt960 == 10 && this.anInt933 >= 0 && this.anInt933 < this.aClass6_Sub2_Sub1_Sub3_Sub2Array1.length) {
						local306 = this.aClass6_Sub2_Sub1_Sub3_Sub2Array1[this.anInt933];
						if (local306 != null) {
							local72 = local306.anInt651 / 32 - aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt651 / 32;
							local18 = local306.anInt652 / 32 - aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt652 / 32;
							this.method703(local18, this.aClass6_Sub2_Sub2_Sub1_8, local72);
						}
					}
				}
				if (this.anInt954 != 0) {
					local72 = this.anInt954 * 4 + 2 - aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt651 / 32;
					local18 = this.anInt955 * 4 + 2 - aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt652 / 32;
					this.method644(local72, local18, this.aClass6_Sub2_Sub2_Sub1_7);
				}
				Class6_Sub2_Sub2.method519(16777215, 78, 3, 97, 3);
				this.aClass28_23.method356();
			}
		} catch (@Pc(604) RuntimeException local604) {
			signlink.reporterror("18797, " + 0 + ", " + local604.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	private void method594(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(1) Class6_Sub1 local1 = null;
			for (@Pc(6) Class6_Sub1 local6 = (Class6_Sub1) this.aClass39_12.method459(); local6 != null; local6 = (Class6_Sub1) this.aClass39_12.method461()) {
				if (local6.anInt64 == arg1 && local6.anInt66 == arg3 && local6.anInt67 == arg6 && local6.anInt65 == arg8) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class6_Sub1();
				local1.anInt64 = arg1;
				local1.anInt65 = arg8;
				local1.anInt66 = arg3;
				local1.anInt67 = arg6;
				this.method708(local1);
				this.aClass39_12.method456(local1);
			}
			local1.anInt56 = arg5;
			local1.anInt58 = arg7;
			local1.anInt57 = arg0;
			local1.anInt63 = arg4;
			local1.anInt62 = arg2;
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("20612, " + -558 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	private void method595(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
			if (this.anInt873 != 0) {
				@Pc(17) Class6_Sub2_Sub2_Sub2 local17 = this.aClass6_Sub2_Sub2_Sub2_3;
				@Pc(19) int local19 = 0;
				if (this.anInt1018 != 0) {
					local19 = 1;
				}
				for (@Pc(26) int local26 = 0; local26 < 100; local26++) {
					if (this.aStringArray12[local26] != null) {
						@Pc(38) int local38 = this.anIntArray272[local26];
						@Pc(43) String local43 = this.aStringArray11[local26];
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
						if ((local38 == 3 || local38 == 7) && (local38 == 7 || this.anInt934 == 0 || this.anInt934 == 1 && this.method623(local43))) {
							local96 = 329 - local19 * 13;
							local17.method164(0, 4, local96, "From");
							local17.method164(65535, 4, local96 - 1, "From");
							@Pc(121) int local121 = local17.method162("From ") + 4;
							if (local45 == 1) {
								this.aClass6_Sub2_Sub2_Sub4Array4[0].method531(local121, local96 - 12, this.anInt992);
								local121 += 14;
							}
							if (local45 == 2) {
								this.aClass6_Sub2_Sub2_Sub4Array4[1].method531(local121, local96 - 12, this.anInt992);
								local121 += 14;
							}
							local17.method164(0, local121, local96, local43 + ": " + this.aStringArray12[local26]);
							local17.method164(65535, local121, local96 - 1, local43 + ": " + this.aStringArray12[local26]);
							local19++;
							if (local19 >= 5) {
								return;
							}
						}
						if (local38 == 5 && this.anInt934 < 2) {
							local96 = 329 - local19 * 13;
							local17.method164(0, 4, local96, this.aStringArray12[local26]);
							local17.method164(65535, 4, local96 - 1, this.aStringArray12[local26]);
							local19++;
							if (local19 >= 5) {
								return;
							}
						}
						if (local38 == 6 && this.anInt934 < 2) {
							local96 = 329 - local19 * 13;
							local17.method164(0, 4, local96, "To " + local43 + ": " + this.aStringArray12[local26]);
							local17.method164(65535, 4, local96 - 1, "To " + local43 + ": " + this.aStringArray12[local26]);
							local19++;
							if (local19 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(302) RuntimeException local302) {
			signlink.reporterror("63083, " + arg0 + ", " + local302.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method596() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt987; local3++) {
				if (local3 == -1) {
					local11 = this.anInt986;
				} else {
					local11 = this.anIntArray265[local3];
				}
				@Pc(23) Class6_Sub2_Sub1_Sub3_Sub2 local23 = this.aClass6_Sub2_Sub1_Sub3_Sub2Array1[local11];
				if (local23 != null && local23.anInt642 > 0) {
					local23.anInt642--;
					if (local23.anInt642 == 0) {
						local23.aString14 = null;
					}
				}
			}
			for (local11 = 0; local11 < this.anInt939; local11++) {
				@Pc(54) int local54 = this.anIntArray253[local11];
				@Pc(59) Class6_Sub2_Sub1_Sub3_Sub1 local59 = this.aClass6_Sub2_Sub1_Sub3_Sub1Array1[local54];
				if (local59 != null && local59.anInt642 > 0) {
					local59.anInt642--;
					if (local59.anInt642 == 0) {
						local59.aString14 = null;
					}
				}
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("11873, " + 0 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!LYHLTGUG;I)V")
	private void method597(@OriginalArg(0) Class18 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt383;
			@Pc(66) int local66;
			if ((local4 < 1 || local4 > 100) && (local4 < 701 || local4 > 800)) {
				if (local4 >= 101 && local4 <= 200 || local4 >= 801 && local4 <= 900) {
					local66 = this.anInt981;
					if (this.anInt982 != 2) {
						local66 = 0;
					}
					if (local4 > 800) {
						local4 -= 701;
					} else {
						local4 -= 101;
					}
					if (local4 >= local66) {
						arg0.aString10 = "";
						arg0.anInt364 = 0;
					} else {
						if (this.anIntArray225[local4] == 0) {
							arg0.aString10 = "@red@Offline";
						} else if (this.anIntArray225[local4] < 200) {
							if (this.anIntArray225[local4] == anInt865) {
								arg0.aString10 = "@gre@World-" + (this.anIntArray225[local4] - 9);
							} else {
								arg0.aString10 = "@yel@World-" + (this.anIntArray225[local4] - 9);
							}
						} else if (this.anIntArray225[local4] == anInt865) {
							arg0.aString10 = "@gre@Classic" + (this.anIntArray225[local4] - 219);
						} else {
							arg0.aString10 = "@yel@Classic" + (this.anIntArray225[local4] - 219);
						}
						arg0.anInt364 = 1;
					}
				} else if (local4 == 203) {
					local66 = this.anInt981;
					if (this.anInt982 != 2) {
						local66 = 0;
					}
					arg0.anInt386 = local66 * 15 + 20;
					if (arg0.anInt386 <= arg0.anInt394) {
						arg0.anInt386 = arg0.anInt394 + 1;
					}
				} else if (local4 >= 401 && local4 <= 500) {
					local4 -= 401;
					if (local4 == 0 && this.anInt982 == 0) {
						arg0.aString10 = "Loading ignore list";
						arg0.anInt364 = 0;
					} else if (local4 == 1 && this.anInt982 == 0) {
						arg0.aString10 = "Please wait...";
						arg0.anInt364 = 0;
					} else {
						local66 = this.anInt891;
						if (this.anInt982 == 0) {
							local66 = 0;
						}
						if (local4 >= local66) {
							arg0.aString10 = "";
							arg0.anInt364 = 0;
						} else {
							arg0.aString10 = Class42.method468(Class42.method465(this.anInt1019, this.aLongArray4[local4]));
							arg0.anInt364 = 1;
						}
					}
				} else if (local4 == 503) {
					arg0.anInt386 = this.anInt891 * 15 + 20;
					if (arg0.anInt386 <= arg0.anInt394) {
						arg0.anInt386 = arg0.anInt394 + 1;
					}
				} else if (local4 == 327) {
					arg0.anInt379 = 150;
					arg0.anInt380 = (int) (Math.sin((double) anInt928 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean232) {
						for (local66 = 0; local66 < 7; local66++) {
							@Pc(380) int local380 = this.anIntArray271[local66];
							if (local380 >= 0 && !Class23.aClass23Array1[local380].method293()) {
								return;
							}
						}
						this.aBoolean232 = false;
						@Pc(399) Class6_Sub2_Sub1_Sub6[] local399 = new Class6_Sub2_Sub1_Sub6[7];
						@Pc(401) int local401 = 0;
						for (@Pc(403) int local403 = 0; local403 < 7; local403++) {
							@Pc(410) int local410 = this.anIntArray271[local403];
							if (local410 >= 0) {
								local399[local401++] = Class23.aClass23Array1[local410].method294((byte) 4);
							}
						}
						@Pc(432) Class6_Sub2_Sub1_Sub6 local432 = new Class6_Sub2_Sub1_Sub6(true, local401, local399);
						for (@Pc(434) int local434 = 0; local434 < 5; local434++) {
							if (this.anIntArray257[local434] != 0) {
								local432.method501(anIntArrayArray22[local434][0], anIntArrayArray22[local434][this.anIntArray257[local434]]);
								if (local434 == 1) {
									local432.method501(anIntArray214[0], anIntArray214[this.anIntArray257[local434]]);
								}
							}
						}
						local432.method494((byte) 2);
						local432.method495(Class33.aClass33Array1[aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt640].anIntArray129[0], 803);
						local432.method504(64, 850, -30, -50, -30, true);
						arg0.anInt361 = 5;
						arg0.anInt362 = 0;
						Class18.method264(this.aByte36, local432);
					}
				} else if (local4 == 324) {
					if (this.aClass6_Sub2_Sub2_Sub1_5 == null) {
						this.aClass6_Sub2_Sub2_Sub1_5 = arg0.aClass6_Sub2_Sub2_Sub1_2;
						this.aClass6_Sub2_Sub2_Sub1_6 = arg0.aClass6_Sub2_Sub2_Sub1_1;
					}
					if (this.aBoolean257) {
						arg0.aClass6_Sub2_Sub2_Sub1_2 = this.aClass6_Sub2_Sub2_Sub1_6;
					} else {
						arg0.aClass6_Sub2_Sub2_Sub1_2 = this.aClass6_Sub2_Sub2_Sub1_5;
					}
				} else if (local4 == 325) {
					if (this.aClass6_Sub2_Sub2_Sub1_5 == null) {
						this.aClass6_Sub2_Sub2_Sub1_5 = arg0.aClass6_Sub2_Sub2_Sub1_2;
						this.aClass6_Sub2_Sub2_Sub1_6 = arg0.aClass6_Sub2_Sub2_Sub1_1;
					}
					if (this.aBoolean257) {
						arg0.aClass6_Sub2_Sub2_Sub1_2 = this.aClass6_Sub2_Sub2_Sub1_5;
					} else {
						arg0.aClass6_Sub2_Sub2_Sub1_2 = this.aClass6_Sub2_Sub2_Sub1_6;
					}
				} else if (local4 == 600) {
					arg0.aString10 = this.aString28;
					if (anInt928 % 20 < 10) {
						arg0.aString10 = arg0.aString10 + "|";
					} else {
						arg0.aString10 = arg0.aString10 + " ";
					}
				} else {
					if (local4 == 620) {
						if (this.anInt835 < 1) {
							arg0.aString10 = "";
						} else if (this.aBoolean254) {
							arg0.anInt393 = 16711680;
							arg0.aString10 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt393 = 16777215;
							arg0.aString10 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(641) String local641;
					if (local4 == 650 || local4 == 655) {
						if (this.anInt940 == 0) {
							arg0.aString10 = "";
						} else {
							if (this.anInt1005 == 0) {
								local641 = "earlier today";
							} else if (this.anInt1005 == 1) {
								local641 = "yesterday";
							} else {
								local641 = this.anInt1005 + " days ago";
							}
							arg0.aString10 = "You last logged in " + local641 + " from: " + signlink.dns;
						}
					}
					if (local4 == 651) {
						if (this.anInt907 == 0) {
							arg0.aString10 = "0 unread messages";
							arg0.anInt393 = 16776960;
						}
						if (this.anInt907 == 1) {
							arg0.aString10 = "1 unread message";
							arg0.anInt393 = 65280;
						}
						if (this.anInt907 > 1) {
							arg0.aString10 = this.anInt907 + " unread messages";
							arg0.anInt393 = 65280;
						}
					}
					if (local4 == 652) {
						if (this.anInt984 == 201) {
							if (this.anInt921 == 1) {
								arg0.aString10 = "@yel@This is a non-members world: @whi@Since you are a member we";
							} else {
								arg0.aString10 = "";
							}
						} else if (this.anInt984 == 200) {
							arg0.aString10 = "You have not yet set any password recovery questions.";
						} else {
							if (this.anInt984 == 0) {
								local641 = "Earlier today";
							} else if (this.anInt984 == 1) {
								local641 = "Yesterday";
							} else {
								local641 = this.anInt984 + " days ago";
							}
							arg0.aString10 = local641 + " you changed your recovery questions";
						}
					}
					if (local4 == 653) {
						if (this.anInt984 == 201) {
							if (this.anInt921 == 1) {
								arg0.aString10 = "@whi@recommend you use a members world instead. You may use";
							} else {
								arg0.aString10 = "";
							}
						} else if (this.anInt984 == 200) {
							arg0.aString10 = "We strongly recommend you do so now to secure your account.";
						} else {
							arg0.aString10 = "If you do not remember making this change then cancel it immediately";
						}
					}
					if (local4 == 654) {
						if (this.anInt984 == 201) {
							if (this.anInt921 == 1) {
								arg0.aString10 = "@whi@this world but member benefits are unavailable whilst here.";
							} else {
								arg0.aString10 = "";
							}
						} else if (this.anInt984 == 200) {
							arg0.aString10 = "Do this from the 'account management' area on our front webpage";
						} else {
							arg0.aString10 = "Do this from the 'account management' area on our front webpage";
						}
					}
				}
			} else if (local4 == 1 && this.anInt982 == 0) {
				arg0.aString10 = "Loading friend list";
				arg0.anInt364 = 0;
			} else if (local4 == 1 && this.anInt982 == 1) {
				arg0.aString10 = "Connecting to friendserver";
				arg0.anInt364 = 0;
			} else if (local4 == 2 && this.anInt982 != 2) {
				arg0.aString10 = "Please wait...";
				arg0.anInt364 = 0;
			} else {
				local66 = this.anInt981;
				if (this.anInt982 != 2) {
					local66 = 0;
				}
				if (local4 > 700) {
					local4 -= 601;
				} else {
					local4--;
				}
				if (local4 >= local66) {
					arg0.aString10 = "";
					arg0.anInt364 = 0;
				} else {
					arg0.aString10 = this.aStringArray13[local4];
					arg0.anInt364 = 1;
				}
			}
		} catch (@Pc(849) RuntimeException local849) {
			signlink.reporterror("22265, " + arg0 + ", " + -209 + ", " + local849.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method598(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg1 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt981; local8++) {
					if (this.aLongArray3[local8] == arg1) {
						this.anInt981--;
						this.aBoolean252 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt981; local28++) {
							this.aStringArray13[local28] = this.aStringArray13[local28 + 1];
							this.anIntArray225[local28] = this.anIntArray225[local28 + 1];
							this.aLongArray3[local28] = this.aLongArray3[local28 + 1];
						}
						this.aClass6_Sub2_Sub3_7.method391(222);
						this.aClass6_Sub2_Sub3_7.method398(arg1);
						break;
					}
				}
				@Pc(86) boolean local86 = false;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("88320, " + arg0 + ", " + arg1 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method599() {
		try {
			while (true) {
				@Pc(15) int local15 = this.method575();
				if (local15 == -1) {
					return;
				}
				if (this.anInt914 != -1 && this.anInt914 == this.anInt888) {
					if (local15 == 8 && this.aString28.length() > 0) {
						this.aString28 = this.aString28.substring(0, this.aString28.length() - 1);
					}
					if ((local15 >= 97 && local15 <= 122 || local15 >= 65 && local15 <= 90 || local15 >= 48 && local15 <= 57 || local15 == 32) && this.aString28.length() < 12) {
						this.aString28 = this.aString28 + (char) local15;
					}
				} else {
					@Pc(196) int local196;
					if (this.aBoolean234) {
						if (local15 >= 32 && local15 <= 122 && this.aString19.length() < 80) {
							this.aString19 = this.aString19 + (char) local15;
							this.aBoolean239 = true;
						}
						if (local15 == 8 && this.aString19.length() > 0) {
							this.aString19 = this.aString19.substring(0, this.aString19.length() - 1);
							this.aBoolean239 = true;
						}
						if (local15 == 13 || local15 == 10) {
							this.aBoolean234 = false;
							this.aBoolean239 = true;
							@Pc(155) long local155;
							if (this.anInt916 == 1) {
								local155 = Class42.method464(this.aString19);
								this.method717(this.aBoolean249, local155);
							}
							if (this.anInt916 == 2 && this.anInt981 > 0) {
								local155 = Class42.method464(this.aString19);
								this.method598(973, local155);
							}
							if (this.anInt916 == 3 && this.aString19.length() > 0) {
								this.aClass6_Sub2_Sub3_7.method391(242);
								this.aClass6_Sub2_Sub3_7.method392(0);
								local196 = this.aClass6_Sub2_Sub3_7.anInt609;
								this.aClass6_Sub2_Sub3_7.method398(this.aLong29);
								Class4.method38(this.aString19, this.aClass6_Sub2_Sub3_7);
								this.aClass6_Sub2_Sub3_7.method401(this.aClass6_Sub2_Sub3_7.anInt609 - local196);
								this.aString19 = Class4.method39(this.aString19);
								this.aString19 = Class50.method543(76, this.aString19);
								this.method648(Class42.method468(Class42.method465(this.anInt1019, this.aLong29)), this.aString19, 6, this.aBoolean235);
								if (this.anInt934 == 2) {
									this.anInt934 = 1;
									this.aBoolean248 = true;
									this.aClass6_Sub2_Sub3_7.method391(4);
									this.aClass6_Sub2_Sub3_7.method392(this.anInt1036);
									this.aClass6_Sub2_Sub3_7.method392(this.anInt934);
									this.aClass6_Sub2_Sub3_7.method392(this.anInt1006);
								}
							}
							if (this.anInt916 == 4 && this.anInt891 < 100) {
								local155 = Class42.method464(this.aString19);
								this.method650(local155);
							}
							if (this.anInt916 == 5 && this.anInt891 > 0) {
								local155 = Class42.method464(this.aString19);
								this.method655(local155, this.anInt991);
							}
						}
					} else if (this.anInt1035 == 1) {
						if (local15 >= 48 && local15 <= 57 && this.aString23.length() < 10) {
							this.aString23 = this.aString23 + (char) local15;
							this.aBoolean239 = true;
						}
						if (local15 == 8 && this.aString23.length() > 0) {
							this.aString23 = this.aString23.substring(0, this.aString23.length() - 1);
							this.aBoolean239 = true;
						}
						if (local15 == 13 || local15 == 10) {
							if (this.aString23.length() > 0) {
								local196 = 0;
								try {
									local196 = Integer.parseInt(this.aString23);
								} catch (@Pc(376) Exception local376) {
								}
								this.aClass6_Sub2_Sub3_7.method391(243);
								this.aClass6_Sub2_Sub3_7.method396(local196);
							}
							this.anInt1035 = 0;
							this.aBoolean239 = true;
						}
					} else if (this.anInt1035 == 2) {
						if (local15 >= 32 && local15 <= 122 && this.aString23.length() < 12) {
							this.aString23 = this.aString23 + (char) local15;
							this.aBoolean239 = true;
						}
						if (local15 == 8 && this.aString23.length() > 0) {
							this.aString23 = this.aString23.substring(0, this.aString23.length() - 1);
							this.aBoolean239 = true;
						}
						if (local15 == 13 || local15 == 10) {
							if (this.aString23.length() > 0) {
								this.aClass6_Sub2_Sub3_7.method391(52);
								this.aClass6_Sub2_Sub3_7.method398(Class42.method464(this.aString23));
							}
							this.anInt1035 = 0;
							this.aBoolean239 = true;
						}
					} else if (this.anInt923 == -1) {
						if (local15 >= 32 && local15 <= 122 && this.aString27.length() < 80) {
							this.aString27 = this.aString27 + (char) local15;
							this.aBoolean239 = true;
						}
						if (local15 == 8 && this.aString27.length() > 0) {
							this.aString27 = this.aString27.substring(0, this.aString27.length() - 1);
							this.aBoolean239 = true;
						}
						if ((local15 == 13 || local15 == 10) && this.aString27.length() > 0) {
							if (this.anInt835 == 2) {
								if (this.aString27.equals("::clientdrop")) {
									this.method694();
								}
								if (this.aString27.equals("::lag")) {
									this.method652();
								}
								if (this.aString27.equals("::prefetchmusic")) {
									for (local196 = 0; local196 < this.aClass9_Sub1_1.method61(2); local196++) {
										this.aClass9_Sub1_1.method70(2, (byte) 1, local196);
									}
								}
								if (this.aString27.equals("::fpson")) {
									aBoolean216 = true;
								}
								if (this.aString27.equals("::fpsoff")) {
									aBoolean216 = false;
								}
								if (this.aString27.equals("::noclip")) {
									for (local196 = 0; local196 < 4; local196++) {
										for (@Pc(604) int local604 = 1; local604 < 103; local604++) {
											for (@Pc(608) int local608 = 1; local608 < 103; local608++) {
												this.aClass3Array1[local196].anIntArrayArray1[local604][local608] = 0;
											}
										}
									}
								}
							}
							if (this.aString27.startsWith("::")) {
								this.aClass6_Sub2_Sub3_7.method391(216);
								this.aClass6_Sub2_Sub3_7.method392(this.aString27.length() - 1);
								this.aClass6_Sub2_Sub3_7.method399(this.aString27.substring(2));
							} else {
								@Pc(663) String local663 = this.aString27.toLowerCase();
								@Pc(665) byte local665 = 0;
								if (local663.startsWith("yellow:")) {
									local665 = 0;
									this.aString27 = this.aString27.substring(7);
								} else if (local663.startsWith("red:")) {
									local665 = 1;
									this.aString27 = this.aString27.substring(4);
								} else if (local663.startsWith("green:")) {
									local665 = 2;
									this.aString27 = this.aString27.substring(6);
								} else if (local663.startsWith("cyan:")) {
									local665 = 3;
									this.aString27 = this.aString27.substring(5);
								} else if (local663.startsWith("purple:")) {
									local665 = 4;
									this.aString27 = this.aString27.substring(7);
								} else if (local663.startsWith("white:")) {
									local665 = 5;
									this.aString27 = this.aString27.substring(6);
								} else if (local663.startsWith("flash1:")) {
									local665 = 6;
									this.aString27 = this.aString27.substring(7);
								} else if (local663.startsWith("flash2:")) {
									local665 = 7;
									this.aString27 = this.aString27.substring(7);
								} else if (local663.startsWith("flash3:")) {
									local665 = 8;
									this.aString27 = this.aString27.substring(7);
								} else if (local663.startsWith("glow1:")) {
									local665 = 9;
									this.aString27 = this.aString27.substring(6);
								} else if (local663.startsWith("glow2:")) {
									local665 = 10;
									this.aString27 = this.aString27.substring(6);
								} else if (local663.startsWith("glow3:")) {
									local665 = 11;
									this.aString27 = this.aString27.substring(6);
								}
								local663 = this.aString27.toLowerCase();
								@Pc(837) byte local837 = 0;
								if (local663.startsWith("wave:")) {
									local837 = 1;
									this.aString27 = this.aString27.substring(5);
								} else if (local663.startsWith("wave2:")) {
									local837 = 2;
									this.aString27 = this.aString27.substring(6);
								} else if (local663.startsWith("shake:")) {
									local837 = 3;
									this.aString27 = this.aString27.substring(6);
								} else if (local663.startsWith("scroll:")) {
									local837 = 4;
									this.aString27 = this.aString27.substring(7);
								} else if (local663.startsWith("slide:")) {
									local837 = 5;
									this.aString27 = this.aString27.substring(6);
								}
								this.aClass6_Sub2_Sub3_7.method391(173);
								this.aClass6_Sub2_Sub3_7.method392(0);
								@Pc(918) int local918 = this.aClass6_Sub2_Sub3_7.anInt609;
								this.aClass6_Sub2_Sub3_7.method418(local837);
								this.aClass6_Sub2_Sub3_9.anInt609 = 0;
								Class4.method38(this.aString27, this.aClass6_Sub2_Sub3_9);
								this.aClass6_Sub2_Sub3_7.method439(this.aClass6_Sub2_Sub3_9.aByteArray17, this.aClass6_Sub2_Sub3_9.anInt609);
								this.aClass6_Sub2_Sub3_7.method392(local665);
								this.aClass6_Sub2_Sub3_7.method401(this.aClass6_Sub2_Sub3_7.anInt609 - local918);
								this.aString27 = Class4.method39(this.aString27);
								this.aString27 = Class50.method543(76, this.aString27);
								aClass6_Sub2_Sub1_Sub3_Sub2_1.aString14 = this.aString27;
								aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt635 = local665;
								aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt636 = local837;
								aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt642 = 150;
								if (this.anInt835 == 2) {
									this.method648("@cr2@" + aClass6_Sub2_Sub1_Sub3_Sub2_1.aString15, aClass6_Sub2_Sub1_Sub3_Sub2_1.aString14, 2, this.aBoolean235);
								} else if (this.anInt835 == 1) {
									this.method648("@cr1@" + aClass6_Sub2_Sub1_Sub3_Sub2_1.aString15, aClass6_Sub2_Sub1_Sub3_Sub2_1.aString14, 2, this.aBoolean235);
								} else {
									this.method648(aClass6_Sub2_Sub1_Sub3_Sub2_1.aString15, aClass6_Sub2_Sub1_Sub3_Sub2_1.aString14, 2, this.aBoolean235);
								}
								if (this.anInt1036 == 2) {
									this.anInt1036 = 3;
									this.aBoolean248 = true;
									this.aClass6_Sub2_Sub3_7.method391(4);
									this.aClass6_Sub2_Sub3_7.method392(this.anInt1036);
									this.aClass6_Sub2_Sub3_7.method392(this.anInt934);
									this.aClass6_Sub2_Sub3_7.method392(this.anInt1006);
								}
							}
							this.aString27 = "";
							this.aBoolean239 = true;
						}
					}
				}
			}
		} catch (@Pc(1073) RuntimeException local1073) {
			signlink.reporterror("4228, " + 2 + ", " + local1073.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZ)V")
	private void method600(@OriginalArg(0) boolean arg0) {
		try {
			this.method679((byte) 7);
			this.aClass28_14.method356();
			this.aClass6_Sub2_Sub2_Sub4_1.method531(0, 0, this.anInt992);
			@Pc(45) byte local45;
			@Pc(57) int local57;
			if (this.anInt887 == 0) {
				this.aClass6_Sub2_Sub2_Sub2_2.method161(7711145, true, this.aClass9_Sub1_1.aString3, 180, 180);
				local45 = 80;
				this.aClass6_Sub2_Sub2_Sub2_4.method161(16776960, true, "Welcome to RuneScape", 180, 80);
				local57 = local45 + 30;
				this.aClass6_Sub2_Sub2_Sub4_2.method531(27, 100, this.anInt992);
				this.aClass6_Sub2_Sub2_Sub2_4.method161(16777215, true, "New User", 100, 125);
				this.aClass6_Sub2_Sub2_Sub4_2.method531(187, 100, this.anInt992);
				this.aClass6_Sub2_Sub2_Sub2_4.method161(16777215, true, "Existing User", 260, 125);
			}
			if (this.anInt887 == 2) {
				local45 = 60;
				if (this.aString20.length() > 0) {
					this.aClass6_Sub2_Sub2_Sub2_4.method161(16776960, true, this.aString20, 180, 45);
					this.aClass6_Sub2_Sub2_Sub2_4.method161(16776960, true, this.aString21, 180, 60);
					local57 = local45 + 30;
				} else {
					this.aClass6_Sub2_Sub2_Sub2_4.method161(16776960, true, this.aString21, 180, 53);
					local57 = local45 + 30;
				}
				this.aClass6_Sub2_Sub2_Sub2_4.method168(true, "Username: " + this.aString24 + (this.anInt998 == 0 & anInt928 % 40 < 20 ? "@yel@|" : ""), 16777215, 90, 90);
				local57 += 15;
				this.aClass6_Sub2_Sub2_Sub2_4.method168(true, "Password: " + Class42.method469(this.anInt972, this.aString25) + (this.anInt998 == 1 & anInt928 % 40 < 20 ? "@yel@|" : ""), 16777215, 92, 105);
				local57 += 15;
				if (!arg0) {
					this.aClass6_Sub2_Sub2_Sub4_2.method531(27, 130, this.anInt992);
					this.aClass6_Sub2_Sub2_Sub2_4.method161(16777215, true, "Login", 100, 155);
					this.aClass6_Sub2_Sub2_Sub4_2.method531(187, 130, this.anInt992);
					this.aClass6_Sub2_Sub2_Sub2_4.method161(16777215, true, "Cancel", 260, 155);
				}
			}
			if (this.anInt887 == 3) {
				this.aClass6_Sub2_Sub2_Sub2_4.method161(16776960, true, "Create a free account", 180, 40);
				local45 = 65;
				this.aClass6_Sub2_Sub2_Sub2_4.method161(16777215, true, "To create a new account you need to", 180, 65);
				local57 = local45 + 15;
				this.aClass6_Sub2_Sub2_Sub2_4.method161(16777215, true, "go back to the main RuneScape webpage", 180, 80);
				local57 += 15;
				this.aClass6_Sub2_Sub2_Sub2_4.method161(16777215, true, "and choose the red 'create account'", 180, 95);
				local57 += 15;
				this.aClass6_Sub2_Sub2_Sub2_4.method161(16777215, true, "button at the top right of that page.", 180, 110);
				local57 += 15;
				this.aClass6_Sub2_Sub2_Sub4_2.method531(107, 130, this.anInt992);
				this.aClass6_Sub2_Sub2_Sub2_4.method161(16777215, true, "Cancel", 180, 155);
			}
			this.aClass28_14.method357(171, 202, super.aGraphics2);
			this.aBoolean226 &= true;
			if (this.aBoolean240) {
				this.aBoolean240 = false;
				this.aClass28_12.method357(0, 128, super.aGraphics2);
				this.aClass28_13.method357(371, 202, super.aGraphics2);
				this.aClass28_17.method357(265, 0, super.aGraphics2);
				this.aClass28_18.method357(265, 562, super.aGraphics2);
				this.aClass28_19.method357(171, 128, super.aGraphics2);
				this.aClass28_20.method357(171, 562, super.aGraphics2);
			}
		} catch (@Pc(502) RuntimeException local502) {
			signlink.reporterror("7406, " + arg0 + ", " + true + ", " + local502.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIIIIII)V")
	private void method601(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg3 >= 1 && arg6 >= 1 && arg3 <= 102 && arg6 <= 102) {
				if (aBoolean223 && arg1 != this.anInt1026) {
					return;
				}
				@Pc(28) int local28 = 0;
				if (arg4 == 0) {
					local28 = this.aClass25_1.method326(arg1, arg3, arg6);
				}
				if (arg4 == 1) {
					local28 = this.aClass25_1.method327(arg6, arg3, arg1);
				}
				if (arg4 == 2) {
					local28 = this.aClass25_1.method328(arg1, arg3, arg6);
				}
				if (arg4 == 3) {
					local28 = this.aClass25_1.method329(arg1, arg3, arg6);
				}
				@Pc(84) int local84;
				if (local28 != 0) {
					local84 = this.aClass25_1.method330(arg1, arg3, arg6, local28);
					@Pc(90) int local90 = local28 >> 14 & 0x7FFF;
					@Pc(94) int local94 = local84 & 0x1F;
					@Pc(98) int local98 = local84 >> 6;
					@Pc(110) Class2 local110;
					if (arg4 == 0) {
						this.aClass25_1.method317(arg1, arg6, arg3);
						local110 = Class2.method24(local90);
						if (local110.aBoolean14) {
							this.aClass3Array1[arg1].method30(arg6, local110.aBoolean9, local94, local98, arg3);
						}
					}
					if (arg4 == 1) {
						this.aClass25_1.method318(arg3, arg6, arg1);
					}
					if (arg4 == 2) {
						this.aClass25_1.method319(arg3, arg6, arg1);
						local110 = Class2.method24(local90);
						if (arg3 + local110.anInt36 > 103 || arg6 + local110.anInt36 > 103 || arg3 + local110.anInt29 > 103 || arg6 + local110.anInt29 > 103) {
							return;
						}
						if (local110.aBoolean14) {
							this.aClass3Array1[arg1].method31(local110.aBoolean9, local110.anInt29, arg3, local98, arg6, local110.anInt36);
						}
					}
					if (arg4 == 3) {
						this.aClass25_1.method320(arg1, arg6, arg3);
						local110 = Class2.method24(local90);
						if (local110.aBoolean14 && local110.aBoolean6) {
							this.aClass3Array1[arg1].method33(arg6, arg3);
						}
					}
				}
				if (arg0 >= 0) {
					local84 = arg1;
					if (arg1 < 3 && (this.aByteArrayArrayArray8[1][arg3][arg6] & 0x2) == 2) {
						local84 = arg1 + 1;
					}
					Class15.method193(arg0, arg3, arg2, arg5, this.aClass25_1, local84, this.aClass3Array1[arg1], arg1, this.anIntArrayArrayArray7, arg6);
					return;
				}
			}
		} catch (@Pc(257) RuntimeException local257) {
			signlink.reporterror("18758, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local257.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!LYHLTGUG;)I")
	private int method602(@OriginalArg(1) int arg0, @OriginalArg(2) Class18 arg1) {
		try {
			if (arg1.anIntArrayArray10 == null || arg0 >= arg1.anIntArrayArray10.length) {
				return -2;
			}
			try {
				@Pc(24) int[] local24 = arg1.anIntArrayArray10[arg0];
				@Pc(26) int local26 = 0;
				@Pc(28) int local28 = 0;
				@Pc(30) byte local30 = 0;
				while (true) {
					@Pc(35) int local35 = local24[local28++];
					@Pc(37) int local37 = 0;
					@Pc(39) byte local39 = 0;
					if (local35 == 0) {
						return local26;
					}
					if (local35 == 1) {
						local37 = this.anIntArray227[local24[local28++]];
					}
					if (local35 == 2) {
						local37 = this.anIntArray230[local24[local28++]];
					}
					if (local35 == 3) {
						local37 = this.anIntArray239[local24[local28++]];
					}
					@Pc(86) Class18 local86;
					@Pc(91) int local91;
					@Pc(104) int local104;
					if (local35 == 4) {
						local86 = Class18.aClass18Array1[local24[local28++]];
						local91 = local24[local28++];
						if (local91 >= 0 && local91 < Class19.anInt435 && (!Class19.method281(local91).aBoolean128 || aBoolean222)) {
							for (local104 = 0; local104 < local86.anIntArray88.length; local104++) {
								if (local86.anIntArray88[local104] == local91 + 1) {
									local37 += local86.anIntArray83[local104];
								}
							}
						}
					}
					if (local35 == 5) {
						local37 = this.anIntArray240[local24[local28++]];
					}
					if (local35 == 6) {
						local37 = anIntArray264[this.anIntArray230[local24[local28++]] - 1];
					}
					if (local35 == 7) {
						local37 = this.anIntArray240[local24[local28++]] * 100 / 46875;
					}
					if (local35 == 8) {
						local37 = aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt669;
					}
					@Pc(179) int local179;
					if (local35 == 9) {
						for (local179 = 0; local179 < Class1.anInt22; local179++) {
							if (Class1.aBooleanArray1[local179]) {
								local37 += this.anIntArray230[local179];
							}
						}
					}
					if (local35 == 10) {
						local86 = Class18.aClass18Array1[local24[local28++]];
						local91 = local24[local28++] + 1;
						if (local91 >= 0 && local91 < Class19.anInt435 && (!Class19.method281(local91).aBoolean128 || aBoolean222)) {
							for (local104 = 0; local104 < local86.anIntArray88.length; local104++) {
								if (local86.anIntArray88[local104] == local91) {
									local37 = 999999999;
									break;
								}
							}
						}
					}
					if (local35 == 11) {
						local37 = this.anInt872;
					}
					if (local35 == 12) {
						local37 = this.anInt853;
					}
					if (local35 == 13) {
						local179 = this.anIntArray240[local24[local28++]];
						local91 = local24[local28++];
						local37 = (local179 & 0x1 << local91) == 0 ? 0 : 1;
					}
					if (local35 == 14) {
						local179 = local24[local28++];
						@Pc(294) Class38 local294 = Class38.aClass38Array1[local179];
						local104 = local294.anInt681;
						@Pc(300) int local300 = local294.anInt682;
						@Pc(303) int local303 = local294.anInt683;
						@Pc(309) int local309 = anIntArray228[local303 - local300];
						local37 = this.anIntArray240[local104] >> local300 & local309;
					}
					if (local35 == 15) {
						local39 = 1;
					}
					if (local35 == 16) {
						local39 = 2;
					}
					if (local35 == 17) {
						local39 = 3;
					}
					if (local35 == 18) {
						local37 = (aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt651 >> 7) + this.anInt893;
					}
					if (local35 == 19) {
						local37 = (aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt652 >> 7) + this.anInt894;
					}
					if (local35 == 20) {
						local37 = local24[local28++];
					}
					if (local39 == 0) {
						if (local30 == 0) {
							local26 += local37;
						}
						if (local30 == 1) {
							local26 -= local37;
						}
						if (local30 == 2 && local37 != 0) {
							local26 /= local37;
						}
						if (local30 == 3) {
							local26 *= local37;
						}
						local30 = 0;
					} else {
						local30 = local39;
					}
				}
			} catch (@Pc(402) Exception local402) {
				return -1;
			}
		} catch (@Pc(405) RuntimeException local405) {
			signlink.reporterror("28302, " + 967 + ", " + arg0 + ", " + arg1 + ", " + local405.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BIB)Z")
	private boolean method603(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			return arg0 == null ? true : signlink.wavesave(arg0, arg1);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("337, " + arg0 + ", " + arg1 + ", " + 103 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method604() {
		try {
			try {
				@Pc(14) int local14 = aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt651 + this.anInt944;
				@Pc(20) int local20 = aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt652 + this.anInt829;
				if (this.anInt1029 - local14 < -500 || this.anInt1029 - local14 > 500 || this.anInt1030 - local20 < -500 || this.anInt1030 - local20 > 500) {
					this.anInt1029 = local14;
					this.anInt1030 = local20;
				}
				if (this.anInt1029 != local14) {
					this.anInt1029 += (local14 - this.anInt1029) / 16;
				}
				if (this.anInt1030 != local20) {
					this.anInt1030 += (local20 - this.anInt1030) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt833 += (-this.anInt833 - 24) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt833 += (24 - this.anInt833) / 2;
				} else {
					this.anInt833 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt834 += (12 - this.anInt834) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt834 += (-this.anInt834 - 12) / 2;
				} else {
					this.anInt834 /= 2;
				}
				this.anInt832 = this.anInt832 + this.anInt833 / 2 & 0x7FF;
				this.anInt831 += this.anInt834 / 2;
				if (this.anInt831 < 128) {
					this.anInt831 = 128;
				}
				if (this.anInt831 > 383) {
					this.anInt831 = 383;
				}
				@Pc(207) int local207 = this.anInt1029 >> 7;
				@Pc(212) int local212 = this.anInt1030 >> 7;
				@Pc(222) int local222 = this.method616(this.anInt1030, this.anInt1029, this.anInt1026);
				@Pc(224) int local224 = 0;
				@Pc(240) int local240;
				if (local207 > 3 && local212 > 3 && local207 < 100 && local212 < 100) {
					for (local240 = local207 - 4; local240 <= local207 + 4; local240++) {
						for (@Pc(246) int local246 = local212 - 4; local246 <= local212 + 4; local246++) {
							@Pc(251) int local251 = this.anInt1026;
							if (local251 < 3 && (this.aByteArrayArrayArray8[1][local240][local246] & 0x2) == 2) {
								local251++;
							}
							@Pc(278) int local278 = local222 - this.anIntArrayArrayArray7[local251][local240][local246];
							if (local278 > local224) {
								local224 = local278;
							}
						}
					}
				}
				anInt854++;
				if (anInt854 > 184) {
					anInt854 = 0;
					this.aClass6_Sub2_Sub3_7.method391(129);
					this.aClass6_Sub2_Sub3_7.method393(12882);
				}
				local240 = local224 * 192;
				if (local240 > 98048) {
					local240 = 98048;
				}
				if (local240 < 32768) {
					local240 = 32768;
				}
				if (local240 > this.anInt925) {
					this.anInt925 += (local240 - this.anInt925) / 24;
				} else if (local240 < this.anInt925) {
					this.anInt925 += (local240 - this.anInt925) / 80;
				}
			} catch (@Pc(360) Exception local360) {
				signlink.reporterror("glfc_ex " + aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt651 + "," + aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt652 + "," + this.anInt1029 + "," + this.anInt1030 + "," + this.anInt1032 + "," + this.anInt1033 + "," + this.anInt893 + "," + this.anInt894);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(410) RuntimeException local410) {
			signlink.reporterror("82146, " + -246 + ", " + local410.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!UAWAYCTK;I)V")
	private void method605(@OriginalArg(1) Class6_Sub2_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			arg0.method412();
			@Pc(14) int local14 = arg0.method413(8);
			@Pc(20) int local20;
			if (local14 < this.anInt939) {
				for (local20 = local14; local20 < this.anInt939; local20++) {
					this.anIntArray244[this.anInt913++] = this.anIntArray253[local20];
				}
			}
			if (local14 > this.anInt939) {
				signlink.reporterror(this.aString24 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt939 = 0;
			for (local20 = 0; local20 < local14; local20++) {
				@Pc(72) int local72 = this.anIntArray253[local20];
				@Pc(77) Class6_Sub2_Sub1_Sub3_Sub1 local77 = this.aClass6_Sub2_Sub1_Sub3_Sub1Array1[local72];
				@Pc(82) int local82 = arg0.method413(1);
				if (local82 == 0) {
					this.anIntArray253[this.anInt939++] = local72;
					local77.anInt660 = anInt928;
				} else {
					@Pc(105) int local105 = arg0.method413(2);
					if (local105 == 0) {
						this.anIntArray253[this.anInt939++] = local72;
						local77.anInt660 = anInt928;
						this.anIntArray266[this.anInt988++] = local72;
					} else {
						@Pc(156) int local156;
						@Pc(166) int local166;
						if (local105 == 1) {
							this.anIntArray253[this.anInt939++] = local72;
							local77.anInt660 = anInt928;
							local156 = arg0.method413(3);
							local77.method447(12, false, local156);
							local166 = arg0.method413(1);
							if (local166 == 1) {
								this.anIntArray266[this.anInt988++] = local72;
							}
						} else if (local105 == 2) {
							this.anIntArray253[this.anInt939++] = local72;
							local77.anInt660 = anInt928;
							local156 = arg0.method413(3);
							local77.method447(12, true, local156);
							local166 = arg0.method413(3);
							local77.method447(12, true, local166);
							@Pc(224) int local224 = arg0.method413(1);
							if (local224 == 1) {
								this.anIntArray266[this.anInt988++] = local72;
							}
						} else if (local105 == 3) {
							this.anIntArray244[this.anInt913++] = local72;
						}
					}
				}
			}
		} catch (@Pc(261) RuntimeException local261) {
			signlink.reporterror("95877, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local261.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method606(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				if (this.anInt1035 != 0) {
					this.anInt1035 = 0;
					this.aBoolean239 = true;
				}
				@Pc(25) int local25 = this.anIntArray231[arg0];
				@Pc(30) int local30 = this.anIntArray232[arg0];
				@Pc(35) int local35 = this.anIntArray233[arg0];
				@Pc(40) int local40 = this.anIntArray234[arg0];
				if (local35 >= 2000) {
					local35 -= 2000;
				}
				@Pc(55) String local55;
				@Pc(59) int local59;
				@Pc(77) String local77;
				@Pc(81) int local81;
				if (local35 == 406 || local35 == 853) {
					local55 = this.aStringArray10[arg0];
					local59 = local55.indexOf("@whi@");
					if (local59 != -1) {
						local55 = local55.substring(local59 + 5).trim();
						local77 = Class42.method468(Class42.method465(this.anInt1019, Class42.method464(local55)));
						@Pc(79) boolean local79 = false;
						for (local81 = 0; local81 < this.anInt987; local81++) {
							@Pc(91) Class6_Sub2_Sub1_Sub3_Sub2 local91 = this.aClass6_Sub2_Sub1_Sub3_Sub2Array1[this.anIntArray265[local81]];
							if (local91 != null && local91.aString15 != null && local91.aString15.equalsIgnoreCase(local77)) {
								this.method615(local91.anIntArray143[0], false, 1, 1, 0, aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0], aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0], 0, 0, local91.anIntArray144[0], 2);
								if (local35 == 406) {
									this.aClass6_Sub2_Sub3_7.method391(218);
									this.aClass6_Sub2_Sub3_7.method427(this.anIntArray265[local81]);
								}
								if (local35 == 853) {
									this.aClass6_Sub2_Sub3_7.method391(170);
									this.aClass6_Sub2_Sub3_7.method428(this.anIntArray265[local81]);
								}
								local79 = true;
								break;
							}
						}
						if (!local79) {
							this.method648("", "Unable to find " + local77, 0, this.aBoolean235);
						}
					}
				}
				if (local35 == 842) {
					this.aClass6_Sub2_Sub3_7.method391(149);
					this.aClass6_Sub2_Sub3_7.method428(local40);
					this.aClass6_Sub2_Sub3_7.method427(local30);
					this.aClass6_Sub2_Sub3_7.method426(local25);
					this.anInt875 = 0;
					this.anInt876 = local30;
					this.anInt877 = local25;
					this.anInt878 = 2;
					if (Class18.aClass18Array1[local30].anInt369 == this.anInt914) {
						this.anInt878 = 1;
					}
					if (Class18.aClass18Array1[local30].anInt369 == this.anInt923) {
						this.anInt878 = 3;
					}
				}
				if (local35 == 532) {
					this.aClass6_Sub2_Sub3_7.method391(35);
					this.aClass6_Sub2_Sub3_7.method393(local25);
					this.aClass6_Sub2_Sub3_7.method427(local40);
					this.aClass6_Sub2_Sub3_7.method393(local30);
					this.anInt875 = 0;
					this.anInt876 = local30;
					this.anInt877 = local25;
					this.anInt878 = 2;
					if (Class18.aClass18Array1[local30].anInt369 == this.anInt914) {
						this.anInt878 = 1;
					}
					if (Class18.aClass18Array1[local30].anInt369 == this.anInt923) {
						this.anInt878 = 3;
					}
				}
				@Pc(300) Class6_Sub2_Sub1_Sub3_Sub1 local300;
				if (local35 == 153) {
					local300 = this.aClass6_Sub2_Sub1_Sub3_Sub1Array1[local40];
					if (local300 != null) {
						this.method615(local300.anIntArray143[0], false, 1, 1, 0, aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0], aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0], 0, 0, local300.anIntArray144[0], 2);
						this.anInt964 = super.anInt821;
						this.anInt965 = super.anInt822;
						this.anInt967 = 2;
						this.anInt966 = 0;
						this.aClass6_Sub2_Sub3_7.method391(36);
						this.aClass6_Sub2_Sub3_7.method426(local40);
					}
				}
				if (local35 == 69) {
					this.aClass6_Sub2_Sub3_7.method391(44);
					this.aClass6_Sub2_Sub3_7.method427(local30);
					this.aClass6_Sub2_Sub3_7.method393(local25);
					this.aClass6_Sub2_Sub3_7.method426(local40);
					this.anInt875 = 0;
					this.anInt876 = local30;
					this.anInt877 = local25;
					this.anInt878 = 2;
					if (Class18.aClass18Array1[local30].anInt369 == this.anInt914) {
						this.anInt878 = 1;
					}
					if (Class18.aClass18Array1[local30].anInt369 == this.anInt923) {
						this.anInt878 = 3;
					}
				}
				if (local35 == 904) {
					if (this.aBoolean262) {
						this.aClass25_1.method338(local25 - 4, local30 - 4);
					} else {
						this.aClass25_1.method338(super.anInt821 - 4, super.anInt822 - 4);
					}
				}
				if (local35 == 118) {
					this.aClass6_Sub2_Sub3_7.method391(209);
					this.aClass6_Sub2_Sub3_7.method393(local30);
					this.aClass6_Sub2_Sub3_7.method427(local40);
					this.aClass6_Sub2_Sub3_7.method428(local25);
					this.anInt875 = 0;
					this.anInt876 = local30;
					this.anInt877 = local25;
					this.anInt878 = 2;
					if (Class18.aClass18Array1[local30].anInt369 == this.anInt914) {
						this.anInt878 = 1;
					}
					if (Class18.aClass18Array1[local30].anInt369 == this.anInt923) {
						this.anInt878 = 3;
					}
				}
				if (local35 == 35) {
					this.aClass6_Sub2_Sub3_7.method391(88);
					this.aClass6_Sub2_Sub3_7.method428(local40);
					this.aClass6_Sub2_Sub3_7.method426(local30);
					this.aClass6_Sub2_Sub3_7.method426(local25);
					this.anInt875 = 0;
					this.anInt876 = local30;
					this.anInt877 = local25;
					this.anInt878 = 2;
					if (Class18.aClass18Array1[local30].anInt369 == this.anInt914) {
						this.anInt878 = 1;
					}
					if (Class18.aClass18Array1[local30].anInt369 == this.anInt923) {
						this.anInt878 = 3;
					}
				}
				if (local35 == 775) {
					this.aClass6_Sub2_Sub3_7.method391(192);
					this.aClass6_Sub2_Sub3_7.method428(local25);
					this.aClass6_Sub2_Sub3_7.method393(local30);
					this.aClass6_Sub2_Sub3_7.method393(local40);
					this.aClass6_Sub2_Sub3_7.method426(this.anInt844);
					this.anInt875 = 0;
					this.anInt876 = local30;
					this.anInt877 = local25;
					this.anInt878 = 2;
					if (Class18.aClass18Array1[local30].anInt369 == this.anInt914) {
						this.anInt878 = 1;
					}
					if (Class18.aClass18Array1[local30].anInt369 == this.anInt923) {
						this.anInt878 = 3;
					}
				}
				if (local35 == 978) {
					this.method687();
				}
				if (local35 == 749) {
					local300 = this.aClass6_Sub2_Sub1_Sub3_Sub1Array1[local40];
					if (local300 != null) {
						this.method615(local300.anIntArray143[0], false, 1, 1, 0, aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0], aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0], 0, 0, local300.anIntArray144[0], 2);
						this.anInt964 = super.anInt821;
						this.anInt965 = super.anInt822;
						this.anInt967 = 2;
						this.anInt966 = 0;
						anInt846 += local40;
						if (anInt846 >= 134) {
							this.aClass6_Sub2_Sub3_7.method391(99);
							this.aClass6_Sub2_Sub3_7.method396(0);
							anInt846 = 0;
						}
						this.aClass6_Sub2_Sub3_7.method391(136);
						this.aClass6_Sub2_Sub3_7.method427(local40);
					}
				}
				@Pc(698) Class6_Sub2_Sub1_Sub3_Sub2 local698;
				if (local35 == 863) {
					local698 = this.aClass6_Sub2_Sub1_Sub3_Sub2Array1[local40];
					if (local698 != null) {
						this.method615(local698.anIntArray143[0], false, 1, 1, 0, aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0], aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0], 0, 0, local698.anIntArray144[0], 2);
						this.anInt964 = super.anInt821;
						this.anInt965 = super.anInt822;
						this.anInt967 = 2;
						this.anInt966 = 0;
						this.aClass6_Sub2_Sub3_7.method391(113);
						this.aClass6_Sub2_Sub3_7.method428(local40);
						this.aClass6_Sub2_Sub3_7.method428(this.anInt1001);
						this.aClass6_Sub2_Sub3_7.method393(this.anInt1002);
						this.aClass6_Sub2_Sub3_7.method426(this.anInt1000);
					}
				}
				if (local35 == 551) {
					this.method654(local25, local40, local30);
					this.aClass6_Sub2_Sub3_7.method391(9);
					this.aClass6_Sub2_Sub3_7.method393(local30 + this.anInt894);
					this.aClass6_Sub2_Sub3_7.method393(local40 >> 14 & 0x7FFF);
					this.aClass6_Sub2_Sub3_7.method427(local25 + this.anInt893);
				}
				@Pc(822) Class18 local822;
				if (local35 == 734) {
					this.aClass6_Sub2_Sub3_7.method391(153);
					this.aClass6_Sub2_Sub3_7.method393(local30);
					local822 = Class18.aClass18Array1[local30];
					if (local822.anIntArrayArray10 != null && local822.anIntArrayArray10[0][0] == 5) {
						local59 = local822.anIntArrayArray10[0][1];
						this.anIntArray240[local59] = 1 - this.anIntArray240[local59];
						this.method709(this.aByte33, local59);
						this.aBoolean252 = true;
					}
				}
				@Pc(882) boolean local882;
				if (local35 == 14) {
					local882 = this.method615(local25, false, 0, 0, 0, aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0], aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0], 0, 0, local30, 2);
					if (!local882) {
						this.method615(local25, false, 1, 1, 0, aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0], aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0], 0, 0, local30, 2);
					}
					this.anInt964 = super.anInt821;
					this.anInt965 = super.anInt822;
					this.anInt967 = 2;
					this.anInt966 = 0;
					this.aClass6_Sub2_Sub3_7.method391(198);
					this.aClass6_Sub2_Sub3_7.method426(local40);
					this.aClass6_Sub2_Sub3_7.method427(local30 + this.anInt894);
					this.aClass6_Sub2_Sub3_7.method426(local25 + this.anInt893);
				}
				@Pc(977) long local977;
				if (local35 == 761 || local35 == 157 || local35 == 280 || local35 == 279) {
					local55 = this.aStringArray10[arg0];
					local59 = local55.indexOf("@whi@");
					if (local59 != -1) {
						local977 = Class42.method464(local55.substring(local59 + 5).trim());
						if (local35 == 761) {
							this.method717(this.aBoolean249, local977);
						}
						if (local35 == 157) {
							this.method650(local977);
						}
						if (local35 == 280) {
							this.method598(973, local977);
						}
						if (local35 == 279) {
							this.method655(local977, this.anInt991);
						}
					}
				}
				if (local35 == 186) {
					local882 = this.method615(local25, false, 0, 0, 0, aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0], aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0], 0, 0, local30, 2);
					if (!local882) {
						this.method615(local25, false, 1, 1, 0, aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0], aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0], 0, 0, local30, 2);
					}
					this.anInt964 = super.anInt821;
					this.anInt965 = super.anInt822;
					this.anInt967 = 2;
					this.anInt966 = 0;
					this.aClass6_Sub2_Sub3_7.method391(114);
					this.aClass6_Sub2_Sub3_7.method393(local40);
					this.aClass6_Sub2_Sub3_7.method393(local30 + this.anInt894);
					this.aClass6_Sub2_Sub3_7.method393(local25 + this.anInt893);
				}
				if (local35 == 1822) {
					local300 = this.aClass6_Sub2_Sub1_Sub3_Sub1Array1[local40];
					if (local300 != null) {
						@Pc(1104) Class16 local1104 = local300.aClass16_1;
						if (local1104.anIntArray59 != null) {
							local1104 = local1104.method205();
						}
						if (local1104 != null) {
							if (local1104.aByteArray7 == null) {
								local77 = "It's a " + local1104.aString4 + ".";
							} else {
								local77 = new String(local1104.aByteArray7);
							}
							this.method648("", local77, 0, this.aBoolean235);
						}
					}
				}
				if (local35 == 915) {
					local882 = this.method615(local25, false, 0, 0, 0, aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0], aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0], 0, 0, local30, 2);
					if (!local882) {
						this.method615(local25, false, 1, 1, 0, aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0], aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0], 0, 0, local30, 2);
					}
					this.anInt964 = super.anInt821;
					this.anInt965 = super.anInt822;
					this.anInt967 = 2;
					this.anInt966 = 0;
					if ((local30 & 0x3) == 0) {
						anInt1004++;
					}
					if (anInt1004 >= 149) {
						this.aClass6_Sub2_Sub3_7.method391(244);
						this.aClass6_Sub2_Sub3_7.method392(161);
						anInt1004 = 0;
					}
					this.aClass6_Sub2_Sub3_7.method391(109);
					this.aClass6_Sub2_Sub3_7.method428(local30 + this.anInt894);
					this.aClass6_Sub2_Sub3_7.method426(local40);
					this.aClass6_Sub2_Sub3_7.method393(local25 + this.anInt893);
				}
				@Pc(1283) String local1283;
				@Pc(1256) Class19 local1256;
				if (local35 == 1969) {
					local1256 = Class19.method281(local40);
					@Pc(1260) Class18 local1260 = Class18.aClass18Array1[local30];
					if (local1260 != null && local1260.anIntArray83[local25] >= 100000) {
						local1283 = local1260.anIntArray83[local25] + " x " + local1256.aString12;
					} else if (local1256.aByteArray8 == null) {
						local1283 = "It's a " + local1256.aString12 + ".";
					} else {
						local1283 = new String(local1256.aByteArray8);
					}
					this.method648("", local1283, 0, this.aBoolean235);
				}
				if (local35 == 870) {
					local822 = Class18.aClass18Array1[local30];
					this.anInt843 = 1;
					this.anInt844 = local30;
					this.anInt845 = local822.anInt368;
					this.anInt999 = 0;
					this.aBoolean252 = true;
					local1283 = local822.aString11;
					if (local1283.indexOf(" ") != -1) {
						local1283 = local1283.substring(0, local1283.indexOf(" "));
					}
					local77 = local822.aString11;
					if (local77.indexOf(" ") != -1) {
						local77 = local77.substring(local77.indexOf(" ") + 1);
					}
					this.aString18 = local1283 + " " + local822.aString8 + " " + local77;
					if (this.anInt845 == 16) {
						this.aBoolean252 = true;
						this.anInt836 = 3;
						this.aBoolean247 = true;
					}
				} else {
					if (local35 == 194) {
						local55 = this.aStringArray10[arg0];
						local59 = local55.indexOf("@whi@");
						if (local59 != -1) {
							if (this.anInt914 == -1) {
								this.method687();
								this.aString28 = local55.substring(local59 + 5).trim();
								this.aBoolean254 = false;
								for (@Pc(1434) int local1434 = 0; local1434 < Class18.aClass18Array1.length; local1434++) {
									if (Class18.aClass18Array1[local1434] != null && Class18.aClass18Array1[local1434].anInt383 == 600) {
										this.anInt888 = this.anInt914 = Class18.aClass18Array1[local1434].anInt369;
										break;
									}
								}
							} else {
								this.method648("", "Please close the interface you have open before using 'report abuse'", 0, this.aBoolean235);
							}
						}
					}
					if (local35 == 534) {
						local882 = this.method615(local25, false, 0, 0, 0, aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0], aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0], 0, 0, local30, 2);
						if (!local882) {
							this.method615(local25, false, 1, 1, 0, aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0], aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0], 0, 0, local30, 2);
						}
						this.anInt964 = super.anInt821;
						this.anInt965 = super.anInt822;
						this.anInt967 = 2;
						this.anInt966 = 0;
						this.aClass6_Sub2_Sub3_7.method391(30);
						this.aClass6_Sub2_Sub3_7.method393(local30 + this.anInt894);
						this.aClass6_Sub2_Sub3_7.method393(this.anInt1002);
						this.aClass6_Sub2_Sub3_7.method427(this.anInt1001);
						this.aClass6_Sub2_Sub3_7.method426(local40);
						this.aClass6_Sub2_Sub3_7.method427(local25 + this.anInt893);
						this.aClass6_Sub2_Sub3_7.method428(this.anInt1000);
					}
					if (local35 == 457) {
						local300 = this.aClass6_Sub2_Sub1_Sub3_Sub1Array1[local40];
						if (local300 != null) {
							this.method615(local300.anIntArray143[0], false, 1, 1, 0, aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0], aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0], 0, 0, local300.anIntArray144[0], 2);
							this.anInt964 = super.anInt821;
							this.anInt965 = super.anInt822;
							this.anInt967 = 2;
							this.anInt966 = 0;
							this.aClass6_Sub2_Sub3_7.method391(228);
							this.aClass6_Sub2_Sub3_7.method426(local40);
						}
					}
					if (local35 == 102 && this.method654(local25, local40, local30)) {
						this.aClass6_Sub2_Sub3_7.method391(96);
						this.aClass6_Sub2_Sub3_7.method427(this.anInt1000);
						this.aClass6_Sub2_Sub3_7.method426(local40 >> 14 & 0x7FFF);
						this.aClass6_Sub2_Sub3_7.method393(this.anInt1001);
						this.aClass6_Sub2_Sub3_7.method427(local30 + this.anInt894);
						this.aClass6_Sub2_Sub3_7.method428(this.anInt1002);
						this.aClass6_Sub2_Sub3_7.method393(local25 + this.anInt893);
					}
					if (local35 == 698) {
						this.method654(local25, local40, local30);
						this.aClass6_Sub2_Sub3_7.method391(134);
						this.aClass6_Sub2_Sub3_7.method427(local30 + this.anInt894);
						this.aClass6_Sub2_Sub3_7.method428(local40 >> 14 & 0x7FFF);
						this.aClass6_Sub2_Sub3_7.method427(local25 + this.anInt893);
					}
					if (local35 == 222) {
						local698 = this.aClass6_Sub2_Sub1_Sub3_Sub2Array1[local40];
						if (local698 != null) {
							this.method615(local698.anIntArray143[0], false, 1, 1, 0, aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0], aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0], 0, 0, local698.anIntArray144[0], 2);
							this.anInt964 = super.anInt821;
							this.anInt965 = super.anInt822;
							this.anInt967 = 2;
							this.anInt966 = 0;
							this.aClass6_Sub2_Sub3_7.method391(139);
							this.aClass6_Sub2_Sub3_7.method393(local40);
							this.aClass6_Sub2_Sub3_7.method427(this.anInt844);
						}
					}
					if (local35 == 255 && this.method654(local25, local40, local30)) {
						this.aClass6_Sub2_Sub3_7.method391(183);
						this.aClass6_Sub2_Sub3_7.method427(local40 >> 14 & 0x7FFF);
						this.aClass6_Sub2_Sub3_7.method428(this.anInt844);
						this.aClass6_Sub2_Sub3_7.method426(local30 + this.anInt894);
						this.aClass6_Sub2_Sub3_7.method428(local25 + this.anInt893);
					}
					if (local35 == 73) {
						local55 = this.aStringArray10[arg0];
						local59 = local55.indexOf("@whi@");
						if (local59 != -1) {
							local977 = Class42.method464(local55.substring(local59 + 5).trim());
							local81 = -1;
							for (@Pc(1870) int local1870 = 0; local1870 < this.anInt981; local1870++) {
								if (this.aLongArray3[local1870] == local977) {
									local81 = local1870;
									break;
								}
							}
							if (local81 != -1 && this.anIntArray225[local81] > 0) {
								this.aBoolean239 = true;
								this.anInt1035 = 0;
								this.aBoolean234 = true;
								this.aString19 = "";
								this.anInt916 = 3;
								this.aLong29 = this.aLongArray3[local81];
								this.aString22 = "Enter message to send to " + this.aStringArray13[local81];
							}
						}
					}
					if (local35 == 568) {
						this.method654(local25, local40, local30);
						this.aClass6_Sub2_Sub3_7.method391(148);
						this.aClass6_Sub2_Sub3_7.method428(local25 + this.anInt893);
						this.aClass6_Sub2_Sub3_7.method428(local40 >> 14 & 0x7FFF);
						this.aClass6_Sub2_Sub3_7.method427(local30 + this.anInt894);
					}
					if (local35 == 962) {
						local698 = this.aClass6_Sub2_Sub1_Sub3_Sub2Array1[local40];
						if (local698 != null) {
							this.method615(local698.anIntArray143[0], false, 1, 1, 0, aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0], aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0], 0, 0, local698.anIntArray144[0], 2);
							this.anInt964 = super.anInt821;
							this.anInt965 = super.anInt822;
							this.anInt967 = 2;
							this.anInt966 = 0;
							anInt890 += local40;
							if (anInt890 >= 107) {
								this.aClass6_Sub2_Sub3_7.method391(11);
								anInt890 = 0;
							}
							this.aClass6_Sub2_Sub3_7.method391(50);
							this.aClass6_Sub2_Sub3_7.method427(local40);
						}
					}
					if (local35 == 208) {
						this.aClass6_Sub2_Sub3_7.method391(15);
						this.aClass6_Sub2_Sub3_7.method393(this.anInt1000);
						this.aClass6_Sub2_Sub3_7.method428(this.anInt1002);
						this.aClass6_Sub2_Sub3_7.method427(local30);
						this.aClass6_Sub2_Sub3_7.method428(this.anInt1001);
						this.aClass6_Sub2_Sub3_7.method427(local40);
						this.aClass6_Sub2_Sub3_7.method393(local25);
						this.anInt875 = 0;
						this.anInt876 = local30;
						this.anInt877 = local25;
						this.anInt878 = 2;
						if (Class18.aClass18Array1[local30].anInt369 == this.anInt914) {
							this.anInt878 = 1;
						}
						if (Class18.aClass18Array1[local30].anInt369 == this.anInt923) {
							this.anInt878 = 3;
						}
					}
					if (local35 == 267) {
						local698 = this.aClass6_Sub2_Sub1_Sub3_Sub2Array1[local40];
						if (local698 != null) {
							this.method615(local698.anIntArray143[0], false, 1, 1, 0, aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0], aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0], 0, 0, local698.anIntArray144[0], 2);
							this.anInt964 = super.anInt821;
							this.anInt965 = super.anInt822;
							this.anInt967 = 2;
							this.anInt966 = 0;
							this.aClass6_Sub2_Sub3_7.method391(170);
							this.aClass6_Sub2_Sub3_7.method428(local40);
						}
					}
					if (local35 == 187) {
						local698 = this.aClass6_Sub2_Sub1_Sub3_Sub2Array1[local40];
						if (local698 != null) {
							this.method615(local698.anIntArray143[0], false, 1, 1, 0, aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0], aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0], 0, 0, local698.anIntArray144[0], 2);
							this.anInt964 = super.anInt821;
							this.anInt965 = super.anInt822;
							this.anInt967 = 2;
							this.anInt966 = 0;
							this.aClass6_Sub2_Sub3_7.method391(241);
							this.aClass6_Sub2_Sub3_7.method428(local40);
						}
					}
					if (local35 == 1554) {
						@Pc(2246) int local2246 = local40 >> 14 & 0x7FFF;
						@Pc(2249) Class2 local2249 = Class2.method24(local2246);
						if (local2249.aByteArray1 == null) {
							local77 = "It's a " + local2249.aString1 + ".";
						} else {
							local77 = new String(local2249.aByteArray1);
						}
						this.method648("", local77, 0, this.aBoolean235);
					}
					if (local35 == 650) {
						this.aClass6_Sub2_Sub3_7.method391(250);
						this.aClass6_Sub2_Sub3_7.method428(local25);
						this.aClass6_Sub2_Sub3_7.method428(local40);
						this.aClass6_Sub2_Sub3_7.method426(local30);
						this.anInt875 = 0;
						this.anInt876 = local30;
						this.anInt877 = local25;
						this.anInt878 = 2;
						if (Class18.aClass18Array1[local30].anInt369 == this.anInt914) {
							this.anInt878 = 1;
						}
						if (Class18.aClass18Array1[local30].anInt369 == this.anInt923) {
							this.anInt878 = 3;
						}
					}
					if (local35 == 821) {
						this.aClass6_Sub2_Sub3_7.method391(64);
						this.aClass6_Sub2_Sub3_7.method393(local40);
						this.aClass6_Sub2_Sub3_7.method428(local30);
						this.aClass6_Sub2_Sub3_7.method427(local25);
						this.anInt875 = 0;
						this.anInt876 = local30;
						this.anInt877 = local25;
						this.anInt878 = 2;
						if (Class18.aClass18Array1[local30].anInt369 == this.anInt914) {
							this.anInt878 = 1;
						}
						if (Class18.aClass18Array1[local30].anInt369 == this.anInt923) {
							this.anInt878 = 3;
						}
					}
					if (local35 == 1892) {
						local1256 = Class19.method281(local40);
						if (local1256.aByteArray8 == null) {
							local1283 = "It's a " + local1256.aString12 + ".";
						} else {
							local1283 = new String(local1256.aByteArray8);
						}
						this.method648("", local1283, 0, this.aBoolean235);
					}
					if (local35 == 479) {
						this.aClass6_Sub2_Sub3_7.method391(135);
						this.aClass6_Sub2_Sub3_7.method428(local40);
						this.aClass6_Sub2_Sub3_7.method427(local25);
						this.aClass6_Sub2_Sub3_7.method428(local30);
						this.anInt875 = 0;
						this.anInt876 = local30;
						this.anInt877 = local25;
						this.anInt878 = 2;
						if (Class18.aClass18Array1[local30].anInt369 == this.anInt914) {
							this.anInt878 = 1;
						}
						if (Class18.aClass18Array1[local30].anInt369 == this.anInt923) {
							this.anInt878 = 3;
						}
					}
					if (local35 == 681) {
						this.anInt999 = 1;
						this.anInt1000 = local25;
						this.anInt1001 = local30;
						this.anInt1002 = local40;
						this.aString29 = Class19.method281(local40).aString12;
						this.anInt843 = 0;
						this.aBoolean252 = true;
					} else {
						if (local35 == 861) {
							this.anInt837 = -1;
							this.aBoolean239 = true;
						}
						if (local35 == 597) {
							this.aClass6_Sub2_Sub3_7.method391(153);
							this.aClass6_Sub2_Sub3_7.method393(local30);
							local822 = Class18.aClass18Array1[local30];
							if (local822.anIntArrayArray10 != null && local822.anIntArrayArray10[0][0] == 5) {
								local59 = local822.anIntArrayArray10[0][1];
								if (this.anIntArray240[local59] != local822.anIntArray86[0]) {
									this.anIntArray240[local59] = local822.anIntArray86[0];
									this.method709(this.aByte33, local59);
									this.aBoolean252 = true;
								}
							}
						}
						if (local35 == 1500) {
							this.method654(local25, local40, local30);
							this.aClass6_Sub2_Sub3_7.method391(111);
							this.aClass6_Sub2_Sub3_7.method426(local30 + this.anInt894);
							this.aClass6_Sub2_Sub3_7.method426(local25 + this.anInt893);
							this.aClass6_Sub2_Sub3_7.method426(local40 >> 14 & 0x7FFF);
						}
						if (local35 == 217 && !this.aBoolean255) {
							this.aClass6_Sub2_Sub3_7.method391(189);
							this.aClass6_Sub2_Sub3_7.method393(local30);
							this.aBoolean255 = true;
						}
						if (local35 == 951) {
							local822 = Class18.aClass18Array1[local30];
							@Pc(2639) boolean local2639 = true;
							if (local822.anInt383 > 0) {
								local2639 = this.method711(local822);
							}
							if (local2639) {
								this.aClass6_Sub2_Sub3_7.method391(153);
								this.aClass6_Sub2_Sub3_7.method393(local30);
							}
						}
						if (local35 == 610) {
							local300 = this.aClass6_Sub2_Sub1_Sub3_Sub1Array1[local40];
							if (local300 != null) {
								this.method615(local300.anIntArray143[0], false, 1, 1, 0, aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0], aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0], 0, 0, local300.anIntArray144[0], 2);
								this.anInt964 = super.anInt821;
								this.anInt965 = super.anInt822;
								this.anInt967 = 2;
								this.anInt966 = 0;
								this.aClass6_Sub2_Sub3_7.method391(142);
								this.aClass6_Sub2_Sub3_7.method393(local40);
								this.aClass6_Sub2_Sub3_7.method393(this.anInt844);
							}
						}
						if (local35 == 397) {
							local300 = this.aClass6_Sub2_Sub1_Sub3_Sub1Array1[local40];
							if (local300 != null) {
								this.method615(local300.anIntArray143[0], false, 1, 1, 0, aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0], aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0], 0, 0, local300.anIntArray144[0], 2);
								this.anInt964 = super.anInt821;
								this.anInt965 = super.anInt822;
								this.anInt967 = 2;
								this.anInt966 = 0;
								this.aClass6_Sub2_Sub3_7.method391(204);
								this.aClass6_Sub2_Sub3_7.method428(this.anInt1001);
								this.aClass6_Sub2_Sub3_7.method427(this.anInt1000);
								this.aClass6_Sub2_Sub3_7.method393(this.anInt1002);
								this.aClass6_Sub2_Sub3_7.method428(local40);
							}
						}
						if (local35 == 468) {
							local882 = this.method615(local25, false, 0, 0, 0, aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0], aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0], 0, 0, local30, 2);
							if (!local882) {
								this.method615(local25, false, 1, 1, 0, aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0], aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0], 0, 0, local30, 2);
							}
							this.anInt964 = super.anInt821;
							this.anInt965 = super.anInt822;
							this.anInt967 = 2;
							this.anInt966 = 0;
							this.aClass6_Sub2_Sub3_7.method391(246);
							this.aClass6_Sub2_Sub3_7.method426(local40);
							this.aClass6_Sub2_Sub3_7.method393(local30 + this.anInt894);
							this.aClass6_Sub2_Sub3_7.method427(this.anInt844);
							this.aClass6_Sub2_Sub3_7.method427(local25 + this.anInt893);
						}
						if (local35 == 149) {
							this.aClass6_Sub2_Sub3_7.method391(172);
							this.aClass6_Sub2_Sub3_7.method393(local25);
							this.aClass6_Sub2_Sub3_7.method428(local30);
							this.aClass6_Sub2_Sub3_7.method426(local40);
							this.anInt875 = 0;
							this.anInt876 = local30;
							this.anInt877 = local25;
							this.anInt878 = 2;
							if (Class18.aClass18Array1[local30].anInt369 == this.anInt914) {
								this.anInt878 = 1;
							}
							if (Class18.aClass18Array1[local30].anInt369 == this.anInt923) {
								this.anInt878 = 3;
							}
						}
						if (local35 == 684) {
							if ((local25 & 0x3) == 0) {
								anInt917++;
							}
							if (anInt917 >= 99) {
								this.aClass6_Sub2_Sub3_7.method391(119);
								anInt917 = 0;
							}
							this.aClass6_Sub2_Sub3_7.method391(76);
							this.aClass6_Sub2_Sub3_7.method427(local40);
							this.aClass6_Sub2_Sub3_7.method428(local30);
							this.aClass6_Sub2_Sub3_7.method426(local25);
							this.anInt875 = 0;
							this.anInt876 = local30;
							this.anInt877 = local25;
							this.anInt878 = 2;
							if (Class18.aClass18Array1[local30].anInt369 == this.anInt914) {
								this.anInt878 = 1;
							}
							if (Class18.aClass18Array1[local30].anInt369 == this.anInt923) {
								this.anInt878 = 3;
							}
						}
						if (local35 == 401) {
							local882 = this.method615(local25, false, 0, 0, 0, aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0], aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0], 0, 0, local30, 2);
							if (!local882) {
								this.method615(local25, false, 1, 1, 0, aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0], aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0], 0, 0, local30, 2);
							}
							this.anInt964 = super.anInt821;
							this.anInt965 = super.anInt822;
							this.anInt967 = 2;
							this.anInt966 = 0;
							anInt1003++;
							if (anInt1003 >= 128) {
								this.aClass6_Sub2_Sub3_7.method391(146);
								this.aClass6_Sub2_Sub3_7.method392(124);
								anInt1003 = 0;
							}
							this.aClass6_Sub2_Sub3_7.method391(144);
							this.aClass6_Sub2_Sub3_7.method428(local40);
							this.aClass6_Sub2_Sub3_7.method393(local30 + this.anInt894);
							this.aClass6_Sub2_Sub3_7.method426(local25 + this.anInt893);
						}
						if (local35 == 560) {
							local300 = this.aClass6_Sub2_Sub1_Sub3_Sub1Array1[local40];
							if (local300 != null) {
								this.method615(local300.anIntArray143[0], false, 1, 1, 0, aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0], aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0], 0, 0, local300.anIntArray144[0], 2);
								this.anInt964 = super.anInt821;
								this.anInt965 = super.anInt822;
								this.anInt967 = 2;
								this.anInt966 = 0;
								this.aClass6_Sub2_Sub3_7.method391(247);
								this.aClass6_Sub2_Sub3_7.method426(local40);
							}
						}
						if (local35 == 634) {
							local698 = this.aClass6_Sub2_Sub1_Sub3_Sub2Array1[local40];
							if (local698 != null) {
								this.method615(local698.anIntArray143[0], false, 1, 1, 0, aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0], aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0], 0, 0, local698.anIntArray144[0], 2);
								this.anInt964 = super.anInt821;
								this.anInt965 = super.anInt822;
								this.anInt967 = 2;
								this.anInt966 = 0;
								this.aClass6_Sub2_Sub3_7.method391(218);
								this.aClass6_Sub2_Sub3_7.method427(local40);
							}
						}
						if (local35 == 275) {
							local698 = this.aClass6_Sub2_Sub1_Sub3_Sub2Array1[local40];
							if (local698 != null) {
								this.method615(local698.anIntArray143[0], false, 1, 1, 0, aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0], aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0], 0, 0, local698.anIntArray144[0], 2);
								this.anInt964 = super.anInt821;
								this.anInt965 = super.anInt822;
								this.anInt967 = 2;
								this.anInt966 = 0;
								this.aClass6_Sub2_Sub3_7.method391(23);
								this.aClass6_Sub2_Sub3_7.method427(local40);
							}
						}
						if (local35 == 388) {
							this.method654(local25, local40, local30);
							this.aClass6_Sub2_Sub3_7.method391(226);
							this.aClass6_Sub2_Sub3_7.method426(local25 + this.anInt893);
							this.aClass6_Sub2_Sub3_7.method426(local30 + this.anInt894);
							this.aClass6_Sub2_Sub3_7.method426(local40 >> 14 & 0x7FFF);
						}
						if (local35 == 109) {
							local882 = this.method615(local25, false, 0, 0, 0, aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0], aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0], 0, 0, local30, 2);
							if (!local882) {
								this.method615(local25, false, 1, 1, 0, aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0], aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0], 0, 0, local30, 2);
							}
							this.anInt964 = super.anInt821;
							this.anInt965 = super.anInt822;
							this.anInt967 = 2;
							this.anInt966 = 0;
							this.aClass6_Sub2_Sub3_7.method391(47);
							this.aClass6_Sub2_Sub3_7.method427(local40);
							this.aClass6_Sub2_Sub3_7.method426(local30 + this.anInt894);
							this.aClass6_Sub2_Sub3_7.method428(local25 + this.anInt893);
						}
						if (local35 == 735) {
							local300 = this.aClass6_Sub2_Sub1_Sub3_Sub1Array1[local40];
							if (local300 != null) {
								this.method615(local300.anIntArray143[0], false, 1, 1, 0, aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0], aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0], 0, 0, local300.anIntArray144[0], 2);
								this.anInt964 = super.anInt821;
								this.anInt965 = super.anInt822;
								this.anInt967 = 2;
								this.anInt966 = 0;
								this.aClass6_Sub2_Sub3_7.method391(2);
								this.aClass6_Sub2_Sub3_7.method393(local40);
							}
						}
						this.anInt999 = 0;
						this.anInt843 = 0;
						this.aBoolean252 = true;
					}
				}
			}
		} catch (@Pc(3505) RuntimeException local3505) {
			signlink.reporterror("58027, " + arg0 + ", " + 3 + ", " + local3505.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZI)V")
	private void method607(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			signlink.anInt1051 = arg0;
			if (arg1) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("37409, " + arg0 + ", " + arg1 + ", " + -22490 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!UAWAYCTK;BI)V")
	private void method608(@OriginalArg(0) Class6_Sub2_Sub3 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt988; local1++) {
				@Pc(8) int local8 = this.anIntArray266[local1];
				@Pc(13) Class6_Sub2_Sub1_Sub3_Sub2 local13 = this.aClass6_Sub2_Sub1_Sub3_Sub2Array1[local8];
				@Pc(16) int local16 = arg0.method402();
				if ((local16 & 0x20) != 0) {
					local16 += arg0.method402() << 8;
				}
				this.method634(local16, local13, local8, arg0);
			}
			@Pc(44) boolean local44 = false;
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("97446, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method609() {
		try {
			@Pc(7) byte[] local7 = this.aClass36_1.method381("title.dat", null);
			@Pc(13) Class6_Sub2_Sub2_Sub1 local13 = new Class6_Sub2_Sub2_Sub1(local7, this);
			this.aClass28_15.method356();
			local13.method135(0, 0);
			this.aClass28_16.method356();
			local13.method135(-637, 0);
			this.aClass28_12.method356();
			local13.method135(-128, 0);
			this.aClass28_13.method356();
			local13.method135(-202, -371);
			this.aClass28_14.method356();
			local13.method135(-202, -171);
			this.aClass28_17.method356();
			local13.method135(0, -265);
			this.aClass28_18.method356();
			local13.method135(-562, -265);
			this.aClass28_19.method356();
			local13.method135(-128, -171);
			this.aClass28_20.method356();
			local13.method135(-562, -171);
			@Pc(104) int[] local104 = new int[local13.anInt153];
			for (@Pc(106) int local106 = 0; local106 < local13.anInt154; local106++) {
				for (@Pc(110) int local110 = 0; local110 < local13.anInt153; local110++) {
					local104[local110] = local13.anIntArray40[local13.anInt153 + local13.anInt153 * local106 - local110 - 1];
				}
				for (@Pc(136) int local136 = 0; local136 < local13.anInt153; local136++) {
					local13.anIntArray40[local136 + local13.anInt153 * local106] = local104[local136];
				}
			}
			this.aClass28_15.method356();
			local13.method135(382, 0);
			this.aClass28_16.method356();
			local13.method135(-255, 0);
			this.aClass28_12.method356();
			local13.method135(254, 0);
			this.aClass28_13.method356();
			local13.method135(180, -371);
			this.aClass28_14.method356();
			local13.method135(180, -171);
			this.aClass28_17.method356();
			local13.method135(382, -265);
			this.aClass28_18.method356();
			local13.method135(-180, -265);
			this.aClass28_19.method356();
			local13.method135(254, -171);
			this.aClass28_20.method356();
			local13.method135(-180, -171);
			local13 = new Class6_Sub2_Sub2_Sub1(this.aClass36_1, "logo", 0);
			this.aClass28_12.method356();
			local13.method137(382 - local13.anInt153 / 2 - 128, 18, this.anInt992);
			System.gc();
		} catch (@Pc(275) RuntimeException local275) {
			signlink.reporterror("18094, " + -23897 + ", " + local275.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class39 local9 = this.aClass39ArrayArrayArray1[this.anInt1026][arg0][arg1];
		if (local9 == null) {
			this.aClass25_1.method321(this.anInt1026, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class6_Sub2_Sub1_Sub4 local23 = null;
		@Pc(27) Class6_Sub2_Sub1_Sub4 local27;
		for (local27 = (Class6_Sub2_Sub1_Sub4) local9.method459(); local27 != null; local27 = (Class6_Sub2_Sub1_Sub4) local9.method461()) {
			@Pc(32) Class19 local32 = Class19.method281(local27.anInt347);
			@Pc(35) int local35 = local32.anInt422;
			if (local32.aBoolean127) {
				local35 *= local27.anInt348 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method457(local23);
		@Pc(65) Class6_Sub2_Sub1_Sub4 local65 = null;
		@Pc(67) Class6_Sub2_Sub1_Sub4 local67 = null;
		for (local27 = (Class6_Sub2_Sub1_Sub4) local9.method459(); local27 != null; local27 = (Class6_Sub2_Sub1_Sub4) local9.method461()) {
			if (local27.anInt347 != local23.anInt347 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt347 != local23.anInt347 && local27.anInt347 != local65.anInt347 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass25_1.method307(arg0, local110, this.method616(arg1 * 128 + 64, arg0 * 128 + 64, this.anInt1026), arg1, local65, local23, local67, this.anInt1026);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method611(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString20 = "";
				this.aString21 = "Connecting to server...";
				this.method600(true);
			}
			this.aClass7_1 = new Class7(this, this.aBoolean251, this.method643(anInt866 + 43594));
			@Pc(31) long local31 = Class42.method464(arg0);
			@Pc(38) int local38 = (int) (local31 >> 16 & 0x1FL);
			this.aClass6_Sub2_Sub3_7.anInt609 = 0;
			this.aClass6_Sub2_Sub3_7.method392(14);
			this.aClass6_Sub2_Sub3_7.method392(local38);
			this.aClass7_1.method46(this.aClass6_Sub2_Sub3_7.aByteArray17, 2);
			for (@Pc(61) int local61 = 0; local61 < 8; local61++) {
				this.aClass7_1.method43();
			}
			@Pc(75) int local75 = this.aClass7_1.method43();
			@Pc(77) int local77 = local75;
			@Pc(226) int local226;
			@Pc(260) int local260;
			if (local75 == 0) {
				this.aClass7_1.method45(this.aClass6_Sub2_Sub3_8.aByteArray17, 0, 8);
				this.aClass6_Sub2_Sub3_8.anInt609 = 0;
				this.aLong31 = this.aClass6_Sub2_Sub3_8.method408();
				@Pc(100) int[] local100 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong31 >> 32), (int) this.aLong31 };
				this.aClass6_Sub2_Sub3_7.anInt609 = 0;
				this.aClass6_Sub2_Sub3_7.method392(10);
				this.aClass6_Sub2_Sub3_7.method396(local100[0]);
				this.aClass6_Sub2_Sub3_7.method396(local100[1]);
				this.aClass6_Sub2_Sub3_7.method396(local100[2]);
				this.aClass6_Sub2_Sub3_7.method396(local100[3]);
				this.aClass6_Sub2_Sub3_7.method396(signlink.anInt1046);
				this.aClass6_Sub2_Sub3_7.method399(arg0);
				this.aClass6_Sub2_Sub3_7.method399(arg1);
				this.aClass6_Sub2_Sub3_7.method417(aBigInteger2, aBigInteger1);
				this.aClass6_Sub2_Sub3_6.anInt609 = 0;
				if (arg2) {
					this.aClass6_Sub2_Sub3_6.method392(18);
				} else {
					this.aClass6_Sub2_Sub3_6.method392(16);
				}
				this.aClass6_Sub2_Sub3_6.method392(this.aClass6_Sub2_Sub3_7.anInt609 + 36 + 1 + 1 + 2);
				this.aClass6_Sub2_Sub3_6.method392(255);
				this.aClass6_Sub2_Sub3_6.method393(333);
				this.aClass6_Sub2_Sub3_6.method392(aBoolean223 ? 1 : 0);
				for (local226 = 0; local226 < 9; local226++) {
					this.aClass6_Sub2_Sub3_6.method396(this.anIntArray226[local226]);
				}
				this.aClass6_Sub2_Sub3_6.method400(this.aClass6_Sub2_Sub3_7.aByteArray17, this.aClass6_Sub2_Sub3_7.anInt609);
				this.aClass6_Sub2_Sub3_7.aClass45_1 = new Class45(local100, 803);
				for (local260 = 0; local260 < 4; local260++) {
					local100[local260] += 50;
				}
				this.aClass45_2 = new Class45(local100, 803);
				this.aClass7_1.method46(this.aClass6_Sub2_Sub3_6.aByteArray17, this.aClass6_Sub2_Sub3_6.anInt609);
				local75 = this.aClass7_1.method43();
			}
			if (local75 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(302) Exception local302) {
				}
				this.method611(arg0, arg1, arg2);
			} else {
				@Pc(390) int local390;
				if (local75 == 2) {
					this.anInt835 = this.aClass7_1.method43();
					aBoolean242 = this.aClass7_1.method43() == 1;
					this.aLong33 = 0L;
					this.anInt884 = 0;
					this.aClass44_1.anInt708 = 0;
					super.aBoolean215 = true;
					this.aBoolean230 = true;
					this.aBoolean226 = true;
					this.aClass6_Sub2_Sub3_7.anInt609 = 0;
					this.aClass6_Sub2_Sub3_8.anInt609 = 0;
					this.anInt1009 = -1;
					this.anInt949 = -1;
					this.anInt950 = -1;
					this.anInt951 = -1;
					this.anInt1008 = 0;
					this.anInt1010 = 0;
					this.anInt1018 = 0;
					this.anInt1012 = 0;
					this.anInt960 = 0;
					this.anInt839 = 0;
					this.aBoolean262 = false;
					super.anInt813 = 0;
					for (local390 = 0; local390 < 100; local390++) {
						this.aStringArray12[local390] = null;
					}
					this.anInt999 = 0;
					this.anInt843 = 0;
					this.anInt978 = 0;
					this.anInt869 = 0;
					this.anInt944 = (int) (Math.random() * 100.0D) - 50;
					this.anInt829 = (int) (Math.random() * 110.0D) - 55;
					this.anInt926 = (int) (Math.random() * 80.0D) - 40;
					this.anInt867 = (int) (Math.random() * 120.0D) - 60;
					this.anInt911 = (int) (Math.random() * 30.0D) - 20;
					this.anInt832 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt1027 = 0;
					this.anInt962 = -1;
					this.anInt954 = 0;
					this.anInt955 = 0;
					this.anInt987 = 0;
					this.anInt939 = 0;
					for (local226 = 0; local226 < this.anInt985; local226++) {
						this.aClass6_Sub2_Sub1_Sub3_Sub2Array1[local226] = null;
						this.aClass6_Sub2_Sub3Array1[local226] = null;
					}
					for (local260 = 0; local260 < 16384; local260++) {
						this.aClass6_Sub2_Sub1_Sub3_Sub1Array1[local260] = null;
					}
					aClass6_Sub2_Sub1_Sub3_Sub2_1 = this.aClass6_Sub2_Sub1_Sub3_Sub2Array1[this.anInt986] = new Class6_Sub2_Sub1_Sub3_Sub2();
					this.aClass39_10.method463();
					this.aClass39_11.method463();
					@Pc(535) int local535;
					@Pc(539) int local539;
					for (@Pc(531) int local531 = 0; local531 < 4; local531++) {
						for (local535 = 0; local535 < 104; local535++) {
							for (local539 = 0; local539 < 104; local539++) {
								this.aClass39ArrayArrayArray1[local531][local535][local539] = null;
							}
						}
					}
					this.aClass39_12 = new Class39(41824);
					this.anInt982 = 0;
					this.anInt981 = 0;
					this.anInt837 = -1;
					this.anInt923 = -1;
					this.anInt914 = -1;
					this.anInt1020 = -1;
					this.anInt1034 = -1;
					this.anInt922 = -1;
					this.aBoolean255 = false;
					this.anInt836 = 3;
					this.anInt1035 = 0;
					this.aBoolean262 = false;
					this.aBoolean234 = false;
					this.aString26 = null;
					this.anInt908 = 0;
					this.anInt904 = -1;
					this.aBoolean257 = true;
					this.method690();
					for (local535 = 0; local535 < 5; local535++) {
						this.anIntArray257[local535] = 0;
					}
					for (local539 = 0; local539 < 5; local539++) {
						this.aStringArray8[local539] = null;
						this.aBooleanArray12[local539] = false;
					}
					anInt1004 = 0;
					anInt846 = 0;
					anInt890 = 0;
					anInt1003 = 0;
					anInt917 = 0;
					this.method712();
				} else if (local75 == 3) {
					this.aString20 = "";
					this.aString21 = "Invalid username or password.";
				} else if (local75 == 4) {
					this.aString20 = "Your account has been disabled.";
					this.aString21 = "Please check your message-centre for details.";
				} else if (local75 == 5) {
					this.aString20 = "Your account is already logged in.";
					this.aString21 = "Try again in 60 secs...";
				} else if (local75 == 6) {
					this.aString20 = "RuneScape has been updated!";
					this.aString21 = "Please reload this page.";
				} else if (local75 == 7) {
					this.aString20 = "This world is full.";
					this.aString21 = "Please use a different world.";
				} else if (local75 == 8) {
					this.aString20 = "Unable to connect.";
					this.aString21 = "Login server offline.";
				} else if (local75 == 9) {
					this.aString20 = "Login limit exceeded.";
					this.aString21 = "Too many connections from your address.";
				} else if (local75 == 10) {
					this.aString20 = "Unable to connect.";
					this.aString21 = "Bad session id.";
				} else if (local75 == 11) {
					this.aString20 = "Login server rejected session.";
					this.aString21 = "Please try again.";
				} else if (local75 == 12) {
					this.aString20 = "You need a members account to login to this world.";
					this.aString21 = "Please subscribe, or use a different world.";
				} else if (local75 == 13) {
					this.aString20 = "Could not complete login.";
					this.aString21 = "Please try using a different world.";
				} else if (local75 == 14) {
					this.aString20 = "The server is being updated.";
					this.aString21 = "Please wait 1 minute and try again.";
				} else if (local75 == 15) {
					this.aBoolean226 = true;
					this.aClass6_Sub2_Sub3_7.anInt609 = 0;
					this.aClass6_Sub2_Sub3_8.anInt609 = 0;
					this.anInt1009 = -1;
					this.anInt949 = -1;
					this.anInt950 = -1;
					this.anInt951 = -1;
					this.anInt1008 = 0;
					this.anInt1010 = 0;
					this.anInt1018 = 0;
					this.anInt839 = 0;
					this.aBoolean262 = false;
					this.aLong30 = System.currentTimeMillis();
				} else if (local75 == 16) {
					this.aString20 = "Login attempts exceeded.";
					this.aString21 = "Please wait 1 minute and try again.";
				} else if (local75 == 17) {
					this.aString20 = "You are standing in a members-only area.";
					this.aString21 = "To play on this world move to a free area first";
				} else if (local75 == 20) {
					this.aString20 = "Invalid loginserver requested";
					this.aString21 = "Please try using a different world.";
				} else if (local75 == 21) {
					local390 = this.aClass7_1.method43();
					for (@Pc(880) int local880 = local390 + 3; local880 >= 0; local880--) {
						this.aString20 = "You have only just left another world";
						this.aString21 = "Your profile will be transferred in: " + local880;
						this.method600(true);
						try {
							Thread.sleep(1200L);
						} catch (@Pc(902) Exception local902) {
						}
					}
					this.method611(arg0, arg1, arg2);
				} else if (local75 == 22) {
					this.aString20 = "Malformed login packet.";
					this.aString21 = "Please try again.";
				} else if (local75 != -1) {
					System.out.println("response:" + local75);
					this.aString20 = "Unexpected server response";
					this.aString21 = "Please try using a different world.";
				} else if (local77 != 0) {
					this.aString20 = "No response from server";
					this.aString21 = "Please try using a different world.";
				} else if (this.anInt996 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(934) Exception local934) {
					}
					this.anInt996++;
					this.method611(arg0, arg1, arg2);
				} else {
					this.aString20 = "No response from loginserver";
					this.aString21 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(977) IOException local977) {
			this.aString20 = "";
			this.aString21 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	@Override
	protected void method583(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			this.anInt958 = arg0;
			this.aString17 = arg1;
			this.method679((byte) 7);
			if (this.aClass36_1 == null) {
				super.method583(arg0, arg1);
			} else {
				this.aClass28_14.method356();
				this.aClass6_Sub2_Sub2_Sub2_4.method160(54, 180, "RuneScape is loading - please wait...", 16777215);
				Class6_Sub2_Sub2.method520(28, 62, 304, 9179409, 248, 34);
				Class6_Sub2_Sub2.method520(29, 63, 302, 0, 248, 32);
				Class6_Sub2_Sub2.method519(9179409, 64, 30, 30, arg0 * 3);
				Class6_Sub2_Sub2.method519(0, 64, 30, arg0 * 3 + 30, 300 - arg0 * 3);
				this.aClass6_Sub2_Sub2_Sub2_4.method160(85, 180, arg1, 16777215);
				this.aClass28_14.method357(171, 202, super.aGraphics2);
				if (this.aBoolean240) {
					this.aBoolean240 = false;
					if (!this.aBoolean238) {
						this.aClass28_15.method357(0, 0, super.aGraphics2);
						this.aClass28_16.method357(0, 637, super.aGraphics2);
					}
					this.aClass28_12.method357(0, 128, super.aGraphics2);
					this.aClass28_13.method357(371, 202, super.aGraphics2);
					this.aClass28_17.method357(265, 0, super.aGraphics2);
					this.aClass28_18.method357(265, 562, super.aGraphics2);
					this.aClass28_19.method357(171, 128, super.aGraphics2);
					this.aClass28_20.method357(171, 562, super.aGraphics2);
				}
			}
		} catch (@Pc(216) RuntimeException local216) {
			signlink.reporterror("78049, " + arg0 + ", " + arg1 + ", " + false + ", " + local216.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method612() {
		try {
			if (this.anInt1027 == 0 && super.anInt820 == 1) {
				@Pc(18) int local18 = super.anInt821 - 25 - 550;
				@Pc(25) int local25 = super.anInt822 - 5 - 4;
				if (local18 >= 0 && local25 >= 0 && local18 < 146 && local25 < 151) {
					local18 -= 73;
					local25 -= 75;
					@Pc(45) int local45 = this.anInt832 + this.anInt867 & 0x7FF;
					@Pc(49) int local49 = Class6_Sub2_Sub2_Sub3.anIntArray76[local45];
					@Pc(53) int local53 = Class6_Sub2_Sub2_Sub3.anIntArray77[local45];
					@Pc(62) int local62 = local49 * (this.anInt911 + 256) >> 8;
					@Pc(71) int local71 = local53 * (this.anInt911 + 256) >> 8;
					@Pc(81) int local81 = local25 * local62 + local18 * local71 >> 11;
					@Pc(91) int local91 = local25 * local71 - local18 * local62 >> 11;
					@Pc(98) int local98 = aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt651 + local81 >> 7;
					@Pc(105) int local105 = aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt652 - local91 >> 7;
					@Pc(126) boolean local126 = this.method615(local98, true, 0, 0, 0, aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0], aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0], 0, 0, local105, 1);
					if (local126) {
						this.aClass6_Sub2_Sub3_7.method392(local18);
						this.aClass6_Sub2_Sub3_7.method392(local25);
						this.aClass6_Sub2_Sub3_7.method393(this.anInt832);
						this.aClass6_Sub2_Sub3_7.method392(57);
						this.aClass6_Sub2_Sub3_7.method392(this.anInt867);
						this.aClass6_Sub2_Sub3_7.method392(this.anInt911);
						this.aClass6_Sub2_Sub3_7.method392(89);
						this.aClass6_Sub2_Sub3_7.method393(aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt651);
						this.aClass6_Sub2_Sub3_7.method393(aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt652);
						this.aClass6_Sub2_Sub3_7.method392(this.anInt892);
						this.aClass6_Sub2_Sub3_7.method392(63);
						return;
					}
				}
			}
		} catch (@Pc(180) RuntimeException local180) {
			signlink.reporterror("67337, " + true + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)Ljava/lang/String;")
	private String method613(@OriginalArg(0) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("75890, " + arg0 + ", " + false + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method614(@OriginalArg(0) int arg0) {
		try {
			Class2.aClass10_2.method77();
			Class2.aClass10_1.method77();
			Class16.aClass10_3.method77();
			Class19.aClass10_6.method77();
			Class19.aClass10_7.method77();
			Class6_Sub2_Sub1_Sub3_Sub2.aClass10_9.method77();
			Class29.aClass10_8.method77();
			if (arg0 < 3 || arg0 > 3) {
				this.aClass6_Sub2_Sub3_7.method392(192);
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("6864, " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZIIIIIIIIII)Z")
	private boolean method615(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray25[local7][local11] = 0;
					this.anIntArrayArray23[local7][local11] = 99999999;
				}
			}
			local11 = arg6;
			@Pc(39) int local39 = arg5;
			this.anIntArrayArray25[arg6][arg5] = 99;
			this.anIntArrayArray23[arg6][arg5] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray212[0] = arg6;
			@Pc(73) int local73 = local55 + 1;
			this.anIntArray213[0] = arg5;
			@Pc(77) boolean local77 = false;
			@Pc(81) int local81 = this.anIntArray212.length;
			@Pc(88) int[][] local88 = this.aClass3Array1[this.anInt1026].anIntArrayArray1;
			@Pc(199) int local199;
			while (local57 != local73) {
				local11 = this.anIntArray212[local57];
				local39 = this.anIntArray213[local57];
				local57 = (local57 + 1) % local81;
				if (local11 == arg0 && local39 == arg9) {
					local77 = true;
					break;
				}
				if (arg7 != 0) {
					if ((arg7 < 5 || arg7 == 10) && this.aClass3Array1[this.anInt1026].method34(local39, local11, arg9, arg7 - 1, arg0, arg4)) {
						local77 = true;
						break;
					}
					if (arg7 < 10 && this.aClass3Array1[this.anInt1026].method35(arg7 - 1, local39, arg0, local11, arg4, arg9)) {
						local77 = true;
						break;
					}
				}
				if (arg2 != 0 && arg3 != 0 && this.aClass3Array1[this.anInt1026].method36(arg3, arg8, arg0, arg2, local11, local39, arg9)) {
					local77 = true;
					break;
				}
				local199 = this.anIntArrayArray23[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray25[local11 - 1][local39] == 0 && (local88[local11 - 1][local39] & 0x1280108) == 0) {
					this.anIntArray212[local73] = local11 - 1;
					this.anIntArray213[local73] = local39;
					local73 = (local73 + 1) % local81;
					this.anIntArrayArray25[local11 - 1][local39] = 2;
					this.anIntArrayArray23[local11 - 1][local39] = local199;
				}
				if (local11 < 103 && this.anIntArrayArray25[local11 + 1][local39] == 0 && (local88[local11 + 1][local39] & 0x1280180) == 0) {
					this.anIntArray212[local73] = local11 + 1;
					this.anIntArray213[local73] = local39;
					local73 = (local73 + 1) % local81;
					this.anIntArrayArray25[local11 + 1][local39] = 8;
					this.anIntArrayArray23[local11 + 1][local39] = local199;
				}
				if (local39 > 0 && this.anIntArrayArray25[local11][local39 - 1] == 0 && (local88[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray212[local73] = local11;
					this.anIntArray213[local73] = local39 - 1;
					local73 = (local73 + 1) % local81;
					this.anIntArrayArray25[local11][local39 - 1] = 1;
					this.anIntArrayArray23[local11][local39 - 1] = local199;
				}
				if (local39 < 103 && this.anIntArrayArray25[local11][local39 + 1] == 0 && (local88[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray212[local73] = local11;
					this.anIntArray213[local73] = local39 + 1;
					local73 = (local73 + 1) % local81;
					this.anIntArrayArray25[local11][local39 + 1] = 4;
					this.anIntArrayArray23[local11][local39 + 1] = local199;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray25[local11 - 1][local39 - 1] == 0 && (local88[local11 - 1][local39 - 1] & 0x128010E) == 0 && (local88[local11 - 1][local39] & 0x1280108) == 0 && (local88[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray212[local73] = local11 - 1;
					this.anIntArray213[local73] = local39 - 1;
					local73 = (local73 + 1) % local81;
					this.anIntArrayArray25[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray23[local11 - 1][local39 - 1] = local199;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray25[local11 + 1][local39 - 1] == 0 && (local88[local11 + 1][local39 - 1] & 0x1280183) == 0 && (local88[local11 + 1][local39] & 0x1280180) == 0 && (local88[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray212[local73] = local11 + 1;
					this.anIntArray213[local73] = local39 - 1;
					local73 = (local73 + 1) % local81;
					this.anIntArrayArray25[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray23[local11 + 1][local39 - 1] = local199;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray25[local11 - 1][local39 + 1] == 0 && (local88[local11 - 1][local39 + 1] & 0x1280138) == 0 && (local88[local11 - 1][local39] & 0x1280108) == 0 && (local88[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray212[local73] = local11 - 1;
					this.anIntArray213[local73] = local39 + 1;
					local73 = (local73 + 1) % local81;
					this.anIntArrayArray25[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray23[local11 - 1][local39 + 1] = local199;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray25[local11 + 1][local39 + 1] == 0 && (local88[local11 + 1][local39 + 1] & 0x12801E0) == 0 && (local88[local11 + 1][local39] & 0x1280180) == 0 && (local88[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray212[local73] = local11 + 1;
					this.anIntArray213[local73] = local39 + 1;
					local73 = (local73 + 1) % local81;
					this.anIntArrayArray25[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray23[local11 + 1][local39 + 1] = local199;
				}
			}
			this.anInt892 = 0;
			@Pc(815) int local815;
			@Pc(821) int local821;
			@Pc(827) int local827;
			if (!local77) {
				if (arg1) {
					local199 = 100;
					for (local815 = 1; local815 < 2; local815++) {
						for (local821 = arg0 - local815; local821 <= arg0 + local815; local821++) {
							for (local827 = arg9 - local815; local827 <= arg9 + local815; local827++) {
								if (local821 >= 0 && local827 >= 0 && local821 < 104 && local827 < 104 && this.anIntArrayArray23[local821][local827] < local199) {
									local199 = this.anIntArrayArray23[local821][local827];
									local11 = local821;
									local39 = local827;
									this.anInt892 = 1;
									local77 = true;
								}
							}
						}
						if (local77) {
							break;
						}
					}
				}
				if (!local77) {
					return false;
				}
			}
			@Pc(888) byte local888 = 0;
			this.anIntArray212[0] = local11;
			local57 = local888 + 1;
			this.anIntArray213[0] = local39;
			local199 = local815 = this.anIntArrayArray25[local11][local39];
			while (local11 != arg6 || local39 != arg5) {
				if (local199 != local815) {
					local815 = local199;
					this.anIntArray212[local57] = local11;
					this.anIntArray213[local57++] = local39;
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
				local81 = local57;
				if (local57 > 25) {
					local81 = 25;
				}
				local57--;
				local821 = this.anIntArray212[local57];
				local827 = this.anIntArray213[local57];
				if (arg10 == 0) {
					this.aClass6_Sub2_Sub3_7.method391(115);
					this.aClass6_Sub2_Sub3_7.method392(local81 + local81 + 3);
				}
				if (arg10 == 1) {
					this.aClass6_Sub2_Sub3_7.method391(16);
					this.aClass6_Sub2_Sub3_7.method392(local81 + local81 + 3 + 14);
				}
				if (arg10 == 2) {
					this.aClass6_Sub2_Sub3_7.method391(251);
					this.aClass6_Sub2_Sub3_7.method392(local81 + local81 + 3);
				}
				this.aClass6_Sub2_Sub3_7.method419(super.anIntArray210[5] == 1 ? 1 : 0, this.aByte38);
				this.aClass6_Sub2_Sub3_7.method393(local821 + this.anInt893);
				this.anInt954 = this.anIntArray212[0];
				this.anInt955 = this.anIntArray213[0];
				for (@Pc(1067) int local1067 = 1; local1067 < local81; local1067++) {
					local57--;
					this.aClass6_Sub2_Sub3_7.method419(this.anIntArray212[local57] - local821, this.aByte38);
					this.aClass6_Sub2_Sub3_7.method419(this.anIntArray213[local57] - local827, this.aByte38);
				}
				this.aClass6_Sub2_Sub3_7.method427(local827 + this.anInt894);
				return true;
			} else if (arg10 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1114) RuntimeException local1114) {
			signlink.reporterror("24925, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + 0 + ", " + arg10 + ", " + local1114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
	private int method616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
			@Pc(77) int local77 = this.anIntArrayArrayArray7[local21][local3][local7] * (128 - local41) + this.anIntArrayArrayArray7[local21][local3 + 1][local7] * local41 >> 7;
			@Pc(109) int local109 = this.anIntArrayArrayArray7[local21][local3][local7 + 1] * (128 - local41) + this.anIntArrayArrayArray7[local21][local3 + 1][local7 + 1] * local41 >> 7;
			return local77 * (128 - local45) + local109 * local45 >> 7;
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("29083, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -964 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method617(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			if (super.anInt820 == 1) {
				if (super.anInt821 >= 539 && super.anInt821 <= 573 && super.anInt822 >= 169 && super.anInt822 < 205 && this.anIntArray259[0] != -1) {
					this.aBoolean252 = true;
					this.anInt836 = 0;
					this.aBoolean247 = true;
				}
				if (super.anInt821 >= 569 && super.anInt821 <= 599 && super.anInt822 >= 168 && super.anInt822 < 205 && this.anIntArray259[1] != -1) {
					this.aBoolean252 = true;
					this.anInt836 = 1;
					this.aBoolean247 = true;
				}
				if (super.anInt821 >= 597 && super.anInt821 <= 627 && super.anInt822 >= 168 && super.anInt822 < 205 && this.anIntArray259[2] != -1) {
					this.aBoolean252 = true;
					this.anInt836 = 2;
					this.aBoolean247 = true;
				}
				if (super.anInt821 >= 625 && super.anInt821 <= 669 && super.anInt822 >= 168 && super.anInt822 < 203 && this.anIntArray259[3] != -1) {
					this.aBoolean252 = true;
					this.anInt836 = 3;
					this.aBoolean247 = true;
				}
				if (super.anInt821 >= 666 && super.anInt821 <= 696 && super.anInt822 >= 168 && super.anInt822 < 205 && this.anIntArray259[4] != -1) {
					this.aBoolean252 = true;
					this.anInt836 = 4;
					this.aBoolean247 = true;
				}
				if (super.anInt821 >= 694 && super.anInt821 <= 724 && super.anInt822 >= 168 && super.anInt822 < 205 && this.anIntArray259[5] != -1) {
					this.aBoolean252 = true;
					this.anInt836 = 5;
					this.aBoolean247 = true;
				}
				if (super.anInt821 >= 722 && super.anInt821 <= 756 && super.anInt822 >= 169 && super.anInt822 < 205 && this.anIntArray259[6] != -1) {
					this.aBoolean252 = true;
					this.anInt836 = 6;
					this.aBoolean247 = true;
				}
				if (super.anInt821 >= 540 && super.anInt821 <= 574 && super.anInt822 >= 466 && super.anInt822 < 502 && this.anIntArray259[7] != -1) {
					this.aBoolean252 = true;
					this.anInt836 = 7;
					this.aBoolean247 = true;
				}
				if (super.anInt821 >= 572 && super.anInt821 <= 602 && super.anInt822 >= 466 && super.anInt822 < 503 && this.anIntArray259[8] != -1) {
					this.aBoolean252 = true;
					this.anInt836 = 8;
					this.aBoolean247 = true;
				}
				if (super.anInt821 >= 599 && super.anInt821 <= 629 && super.anInt822 >= 466 && super.anInt822 < 503 && this.anIntArray259[9] != -1) {
					this.aBoolean252 = true;
					this.anInt836 = 9;
					this.aBoolean247 = true;
				}
				if (super.anInt821 >= 627 && super.anInt821 <= 671 && super.anInt822 >= 467 && super.anInt822 < 502 && this.anIntArray259[10] != -1) {
					this.aBoolean252 = true;
					this.anInt836 = 10;
					this.aBoolean247 = true;
				}
				if (super.anInt821 >= 669 && super.anInt821 <= 699 && super.anInt822 >= 466 && super.anInt822 < 503 && this.anIntArray259[11] != -1) {
					this.aBoolean252 = true;
					this.anInt836 = 11;
					this.aBoolean247 = true;
				}
				if (super.anInt821 >= 696 && super.anInt821 <= 726 && super.anInt822 >= 466 && super.anInt822 < 503 && this.anIntArray259[12] != -1) {
					this.aBoolean252 = true;
					this.anInt836 = 12;
					this.aBoolean247 = true;
				}
				if (super.anInt821 >= 724 && super.anInt821 <= 758 && super.anInt822 >= 466 && super.anInt822 < 502 && this.anIntArray259[13] != -1) {
					this.aBoolean252 = true;
					this.anInt836 = 13;
					this.aBoolean247 = true;
					return;
				}
			}
		} catch (@Pc(443) RuntimeException local443) {
			signlink.reporterror("56301, " + arg0 + ", " + local443.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method618() {
		try {
			@Pc(7) int local7 = this.aClass6_Sub2_Sub2_Sub2_4.method162("Choose Option");
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt839; local9++) {
				local20 = this.aClass6_Sub2_Sub2_Sub2_4.method162(this.aStringArray10[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			local7 += 8;
			local20 = this.anInt839 * 15 + 21;
			@Pc(67) int local67;
			@Pc(85) int local85;
			if (super.anInt821 > 4 && super.anInt822 > 4 && super.anInt821 < 516 && super.anInt822 < 338) {
				local67 = super.anInt821 - local7 / 2 - 4;
				if (local67 + local7 > 512) {
					local67 = 512 - local7;
				}
				if (local67 < 0) {
					local67 = 0;
				}
				local85 = super.anInt822 - 4;
				if (local85 + local20 > 334) {
					local85 = 334 - local20;
				}
				if (local85 < 0) {
					local85 = 0;
				}
				this.aBoolean262 = true;
				this.anInt973 = 0;
				this.anInt974 = local67;
				this.anInt975 = local85;
				this.anInt976 = local7;
				this.anInt977 = this.anInt839 * 15 + 22;
			}
			if (super.anInt821 > 553 && super.anInt822 > 205 && super.anInt821 < 743 && super.anInt822 < 466) {
				local67 = super.anInt821 - local7 / 2 - 553;
				if (local67 < 0) {
					local67 = 0;
				} else if (local67 + local7 > 190) {
					local67 = 190 - local7;
				}
				local85 = super.anInt822 - 205;
				if (local85 < 0) {
					local85 = 0;
				} else if (local85 + local20 > 261) {
					local85 = 261 - local20;
				}
				this.aBoolean262 = true;
				this.anInt973 = 1;
				this.anInt974 = local67;
				this.anInt975 = local85;
				this.anInt976 = local7;
				this.anInt977 = this.anInt839 * 15 + 22;
			}
			if (super.anInt821 > 17 && super.anInt822 > 357 && super.anInt821 < 496 && super.anInt822 < 453) {
				local67 = super.anInt821 - local7 / 2 - 17;
				if (local67 < 0) {
					local67 = 0;
				} else if (local67 + local7 > 479) {
					local67 = 479 - local7;
				}
				local85 = super.anInt822 - 357;
				if (local85 < 0) {
					local85 = 0;
				} else if (local85 + local20 > 96) {
					local85 = 96 - local20;
				}
				this.aBoolean262 = true;
				this.anInt973 = 2;
				this.anInt974 = local67;
				this.anInt975 = local85;
				this.anInt976 = local7;
				this.anInt977 = this.anInt839 * 15 + 22;
			}
		} catch (@Pc(289) RuntimeException local289) {
			signlink.reporterror("18274, " + -83 + ", " + local289.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method619(@OriginalArg(1) int arg0) {
		try {
			@Pc(14) int[] local14 = this.aClass6_Sub2_Sub2_Sub1_9.anIntArray40;
			@Pc(17) int local17 = local14.length;
			for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
				local14[local19] = 0;
			}
			@Pc(43) int local43;
			@Pc(45) int local45;
			for (@Pc(31) int local31 = 1; local31 < 103; local31++) {
				local43 = (103 - local31) * 512 * 4 + 24628;
				for (local45 = 1; local45 < 103; local45++) {
					if ((this.aByteArrayArrayArray8[arg0][local45][local31] & 0x18) == 0) {
						this.aClass25_1.method335(local14, local43, arg0, local45, local31);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local45][local31] & 0x8) != 0) {
						this.aClass25_1.method335(local14, local43, arg0 + 1, local45, local31);
					}
					local43 += 4;
				}
			}
			anInt968++;
			if (anInt968 > 58) {
				anInt968 = 0;
				this.aClass6_Sub2_Sub3_7.method391(79);
			}
			local43 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local45 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass6_Sub2_Sub2_Sub1_9.method132();
			@Pc(169) int local169;
			for (@Pc(165) int local165 = 1; local165 < 103; local165++) {
				for (local169 = 1; local169 < 103; local169++) {
					if ((this.aByteArrayArrayArray8[arg0][local169][local165] & 0x18) == 0) {
						this.method670(local45, local165, arg0, local43, local169);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local169][local165] & 0x8) != 0) {
						this.method670(local45, local165, arg0 + 1, local43, local169);
					}
				}
			}
			this.aClass28_23.method356();
			anInt963++;
			if (anInt963 > 1279) {
				anInt963 = 0;
				this.aClass6_Sub2_Sub3_7.method391(93);
				this.aClass6_Sub2_Sub3_7.method392(0);
				local169 = this.aClass6_Sub2_Sub3_7.anInt609;
				this.aClass6_Sub2_Sub3_7.method393((int) (Math.random() * 65536.0D));
				this.aClass6_Sub2_Sub3_7.method392(5);
				this.aClass6_Sub2_Sub3_7.method393((int) (Math.random() * 65536.0D));
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass6_Sub2_Sub3_7.method392(190);
				}
				this.aClass6_Sub2_Sub3_7.method393((int) (Math.random() * 65536.0D));
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass6_Sub2_Sub3_7.method392(224);
				}
				this.aClass6_Sub2_Sub3_7.method392(142);
				this.aClass6_Sub2_Sub3_7.method392((int) (Math.random() * 256.0D));
				this.aClass6_Sub2_Sub3_7.method392((int) (Math.random() * 256.0D));
				this.aClass6_Sub2_Sub3_7.method393((int) (Math.random() * 65536.0D));
				this.aClass6_Sub2_Sub3_7.method401(this.aClass6_Sub2_Sub3_7.anInt609 - local169);
			}
			this.anInt909 = 0;
			for (local169 = 0; local169 < 104; local169++) {
				for (@Pc(336) int local336 = 0; local336 < 104; local336++) {
					@Pc(346) int local346 = this.aClass25_1.method329(this.anInt1026, local169, local336);
					if (local346 != 0) {
						local346 = local346 >> 14 & 0x7FFF;
						@Pc(358) int local358 = Class2.method24(local346).anInt26;
						if (local358 >= 0) {
							@Pc(362) int local362 = local169;
							@Pc(364) int local364 = local336;
							if (local358 != 22 && local358 != 29 && local358 != 34 && local358 != 36 && local358 != 46 && local358 != 47 && local358 != 48) {
								@Pc(396) int[][] local396 = this.aClass3Array1[this.anInt1026].anIntArrayArray1;
								for (@Pc(398) int local398 = 0; local398 < 10; local398++) {
									@Pc(405) int local405 = (int) (Math.random() * 4.0D);
									if (local405 == 0 && local362 > 0 && local362 > local169 - 3 && (local396[local362 - 1][local364] & 0x1280108) == 0) {
										local362--;
									}
									if (local405 == 1 && local362 < 103 && local362 < local169 + 3 && (local396[local362 + 1][local364] & 0x1280180) == 0) {
										local362++;
									}
									if (local405 == 2 && local364 > 0 && local364 > local336 - 3 && (local396[local362][local364 - 1] & 0x1280102) == 0) {
										local364--;
									}
									if (local405 == 3 && local364 < 103 && local364 < local336 + 3 && (local396[local362][local364 + 1] & 0x1280120) == 0) {
										local364++;
									}
								}
							}
							this.aClass6_Sub2_Sub2_Sub1Array4[this.anInt909] = this.aClass6_Sub2_Sub2_Sub1Array9[local358];
							this.anIntArray242[this.anInt909] = local362;
							this.anIntArray243[this.anInt909] = local364;
							this.anInt909++;
						}
					}
				}
			}
		} catch (@Pc(535) RuntimeException local535) {
			signlink.reporterror("13048, " + -363 + ", " + arg0 + ", " + local535.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method620(@OriginalArg(0) boolean arg0) {
		try {
			if (this.anInt873 != 0) {
				@Pc(5) int local5 = 0;
				if (this.anInt1018 != 0) {
					local5 = 1;
				}
				for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
					if (this.aStringArray12[local12] != null) {
						@Pc(24) int local24 = this.anIntArray272[local12];
						@Pc(29) String local29 = this.aStringArray11[local12];
						if (local29 != null && local29.startsWith("@cr1@")) {
							local29 = local29.substring(5);
						}
						if (local29 != null && local29.startsWith("@cr2@")) {
							local29 = local29.substring(5);
						}
						if ((local24 == 3 || local24 == 7) && (local24 == 7 || this.anInt934 == 0 || this.anInt934 == 1 && this.method623(local29))) {
							@Pc(82) int local82 = 329 - local5 * 13;
							if (super.anInt815 > 4 && super.anInt816 - 4 > local82 - 10 && super.anInt816 - 4 <= local82 + 3) {
								@Pc(121) int local121 = this.aClass6_Sub2_Sub2_Sub2_3.method162("From:  " + local29 + this.aStringArray12[local12]) + 25;
								if (local121 > 450) {
									local121 = 450;
								}
								if (super.anInt815 < local121 + 4) {
									if (this.anInt835 >= 1) {
										this.aStringArray10[this.anInt839] = "Report abuse @whi@" + local29;
										this.anIntArray233[this.anInt839] = 2194;
										this.anInt839++;
									}
									this.aStringArray10[this.anInt839] = "Add ignore @whi@" + local29;
									this.anIntArray233[this.anInt839] = 2157;
									this.anInt839++;
									this.aStringArray10[this.anInt839] = "Add friend @whi@" + local29;
									this.anIntArray233[this.anInt839] = 2761;
									this.anInt839++;
								}
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local24 == 5 || local24 == 6) && this.anInt934 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
				if (arg0) {
					this.aClass6_Sub2_Sub3_7.method392(145);
				}
			}
		} catch (@Pc(240) RuntimeException local240) {
			signlink.reporterror("97414, " + arg0 + ", " + local240.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method621(@OriginalArg(0) boolean arg0) {
		try {
			if (aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt651 >> 7 == this.anInt954 && aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt652 >> 7 == this.anInt955) {
				this.anInt954 = 0;
			}
			@Pc(21) int local21 = this.anInt987;
			if (arg0) {
				local21 = 1;
			}
			for (@Pc(37) int local37 = 0; local37 < local21; local37++) {
				@Pc(43) Class6_Sub2_Sub1_Sub3_Sub2 local43;
				@Pc(48) int local48;
				if (arg0) {
					local43 = aClass6_Sub2_Sub1_Sub3_Sub2_1;
					local48 = this.anInt986 << 14;
				} else {
					local43 = this.aClass6_Sub2_Sub1_Sub3_Sub2Array1[this.anIntArray265[local37]];
					local48 = this.anIntArray265[local37] << 14;
				}
				if (local43 != null && local43.method446()) {
					local43.aBoolean175 = false;
					if ((aBoolean223 && this.anInt987 > 50 || this.anInt987 > 200) && !arg0 && local43.anInt654 == local43.anInt640) {
						local43.aBoolean175 = true;
					}
					@Pc(99) int local99 = local43.anInt651 >> 7;
					@Pc(104) int local104 = local43.anInt652 >> 7;
					if (local99 >= 0 && local99 < 104 && local104 >= 0 && local104 < 104) {
						if (local43.aClass6_Sub2_Sub1_Sub6_1 == null || anInt928 < local43.anInt673 || anInt928 >= local43.anInt674) {
							if ((local43.anInt651 & 0x7F) == 64 && (local43.anInt652 & 0x7F) == 64) {
								if (this.anIntArrayArray24[local99][local104] == this.anInt919) {
									continue;
								}
								this.anIntArrayArray24[local99][local104] = this.anInt919;
							}
							local43.anInt664 = this.method616(local43.anInt652, local43.anInt651, this.anInt1026);
							this.aClass25_1.method311(60, local43.anInt651, local43.anInt653, local48, local43.anInt664, this.anInt1026, local43.anInt652, local43, local43.aBoolean173);
						} else {
							local43.aBoolean175 = false;
							local43.anInt664 = this.method616(local43.anInt652, local43.anInt651, this.anInt1026);
							this.aClass25_1.method312(local43.anInt652, local48, local43.anInt677, local43.anInt678, this.anInt1026, local43.anInt676, local43, local43.anInt653, local43.anInt675, local43.anInt651, local43.anInt664);
						}
					}
				}
			}
		} catch (@Pc(233) RuntimeException local233) {
			signlink.reporterror("28301, " + arg0 + ", " + 1 + ", " + local233.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method622() {
		try {
			try {
				if (this.aClass7_1 != null) {
					this.aClass7_1.method42();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass7_1 = null;
			this.aBoolean226 = false;
			this.anInt887 = 0;
			this.aString24 = "";
			this.aString25 = "";
			this.method614(this.anInt959);
			this.aClass25_1.method300();
			for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
				this.aClass3Array1[local38].method25();
			}
			System.gc();
			this.method667();
			this.anInt989 = -1;
			this.anInt941 = -1;
			this.anInt870 = 0;
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("33644, " + true + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	private boolean method623(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(14) int local14 = 0; local14 < this.anInt981; local14++) {
				if (arg0.equalsIgnoreCase(this.aStringArray13[local14])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass6_Sub2_Sub1_Sub3_Sub2_1.aString15);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("76263, " + arg0 + ", " + 9 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!UAWAYCTK;)V")
	private void method626(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub2_Sub3 arg1) {
		try {
			arg1.method412();
			@Pc(7) int local7 = arg1.method413(1);
			if (local7 != 0) {
				@Pc(20) int local20 = arg1.method413(2);
				if (local20 == 0) {
					this.anIntArray266[this.anInt988++] = this.anInt986;
				} else {
					@Pc(43) int local43;
					@Pc(53) int local53;
					if (local20 == 1) {
						local43 = arg1.method413(3);
						aClass6_Sub2_Sub1_Sub3_Sub2_1.method447(12, false, local43);
						local53 = arg1.method413(1);
						if (local53 == 1) {
							this.anIntArray266[this.anInt988++] = this.anInt986;
						}
					} else {
						@Pc(97) int local97;
						if (local20 == 2) {
							local43 = arg1.method413(3);
							aClass6_Sub2_Sub1_Sub3_Sub2_1.method447(12, true, local43);
							local53 = arg1.method413(3);
							aClass6_Sub2_Sub1_Sub3_Sub2_1.method447(12, true, local53);
							local97 = arg1.method413(1);
							if (local97 == 1) {
								this.anIntArray266[this.anInt988++] = this.anInt986;
							}
						} else if (local20 == 3) {
							local43 = arg1.method413(1);
							this.anInt1026 = arg1.method413(2);
							local53 = arg1.method413(7);
							local97 = arg1.method413(1);
							if (local97 == 1) {
								this.anIntArray266[this.anInt988++] = this.anInt986;
							}
							@Pc(157) int local157 = arg1.method413(7);
							aClass6_Sub2_Sub1_Sub3_Sub2_1.method449(local157, local43 == 1, local53);
						}
					}
				}
			}
		} catch (@Pc(170) RuntimeException local170) {
			signlink.reporterror("81553, " + arg0 + ", " + -90 + ", " + arg1 + ", " + local170.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!XHDQQNIR;)V")
	private void method627(@OriginalArg(1) Class6_Sub2_Sub2_Sub4 arg0) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray254.length; local5++) {
				this.anIntArray254[local5] = 0;
			}
			@Pc(30) int local30;
			for (@Pc(20) int local20 = 0; local20 < 5000; local20++) {
				local30 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray254[local30] = (int) (Math.random() * 256.0D);
			}
			@Pc(57) int local57;
			@Pc(61) int local61;
			@Pc(69) int local69;
			for (local30 = 0; local30 < 20; local30++) {
				for (local57 = 1; local57 < 255; local57++) {
					for (local61 = 1; local61 < 127; local61++) {
						local69 = local61 + (local57 << 7);
						this.anIntArray255[local69] = (this.anIntArray254[local69 - 1] + this.anIntArray254[local69 + 1] + this.anIntArray254[local69 - 128] + this.anIntArray254[local69 + 128]) / 4;
					}
				}
				@Pc(115) int[] local115 = this.anIntArray254;
				this.anIntArray254 = this.anIntArray255;
				this.anIntArray255 = local115;
			}
			if (arg0 != null) {
				local57 = 0;
				for (local61 = 0; local61 < arg0.anInt771; local61++) {
					for (local69 = 0; local69 < arg0.anInt770; local69++) {
						if (arg0.aByteArray20[local57++] != 0) {
							@Pc(151) int local151 = local69 + arg0.anInt772 + 16;
							@Pc(158) int local158 = local61 + arg0.anInt773 + 16;
							@Pc(164) int local164 = local151 + (local158 << 7);
							this.anIntArray254[local164] = 0;
						}
					}
				}
			}
		} catch (@Pc(181) RuntimeException local181) {
			signlink.reporterror("47218, " + 0 + ", " + arg0 + ", " + local181.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	@Override
	protected void method577() {
		try {
			this.aBoolean226 &= true;
			if (!this.aBoolean241 && !this.aBoolean259 && !this.aBoolean256) {
				anInt928++;
				if (this.aBoolean226) {
					this.method688();
				} else {
					this.method676();
				}
				this.method710();
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("16009, " + true + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method628() {
		try {
			if (aBoolean223 && this.anInt978 == 2 && Class15.anInt191 != this.anInt1026) {
				this.aClass28_23.method356();
				this.aClass6_Sub2_Sub2_Sub2_3.method160(151, 257, "Loading - please wait.", 0);
				this.aClass6_Sub2_Sub2_Sub2_3.method160(150, 256, "Loading - please wait.", 16777215);
				this.aClass28_23.method357(4, 4, super.aGraphics2);
				this.anInt978 = 1;
				this.aLong30 = System.currentTimeMillis();
			}
			if (this.anInt978 == 1) {
				@Pc(60) int local60 = this.method629();
				if (local60 != 0 && System.currentTimeMillis() - this.aLong30 > 360000L) {
					signlink.reporterror(this.aString24 + " glcfb " + this.aLong31 + "," + local60 + "," + aBoolean223 + "," + this.aClass21Array1[0] + "," + this.aClass9_Sub1_1.method73() + "," + this.anInt1026 + "," + this.anInt1032 + "," + this.anInt1033);
					this.aLong30 = System.currentTimeMillis();
				}
			}
			if (this.anInt978 == 2 && this.anInt1026 != this.anInt962) {
				this.anInt962 = this.anInt1026;
				this.method619(this.anInt1026);
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("13353, " + -770 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)I")
	private int method629() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray4.length; local3++) {
				if (this.aByteArrayArray4[local3] == null && this.anIntArray237[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray5[local3] == null && this.anIntArray238[local3] != -1) {
					return -2;
				}
			}
			@Pc(46) boolean local46 = true;
			for (@Pc(48) int local48 = 0; local48 < this.aByteArrayArray4.length; local48++) {
				@Pc(55) byte[] local55 = this.aByteArrayArray5[local48];
				if (local55 != null) {
					@Pc(69) int local69 = (this.anIntArray236[local48] >> 8) * 64 - this.anInt893;
					@Pc(81) int local81 = (this.anIntArray236[local48] & 0xFF) * 64 - this.anInt894;
					if (this.aBoolean253) {
						local69 = 10;
						local81 = 10;
					}
					local46 &= Class15.method189(local69, local55, local81);
				}
			}
			if (!local46) {
				return -3;
			} else if (this.aBoolean229) {
				return -4;
			} else {
				this.anInt978 = 2;
				Class15.anInt191 = this.anInt1026;
				this.method704((byte) 7);
				this.aClass6_Sub2_Sub3_7.method391(14);
				return 0;
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("27223, " + true + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method630() {
		try {
			this.aClass28_24.method356();
			Class6_Sub2_Sub2_Sub3.anIntArray78 = this.anIntArray261;
			this.aClass6_Sub2_Sub2_Sub4_10.method531(0, 0, this.anInt992);
			if (this.aBoolean234) {
				this.aClass6_Sub2_Sub2_Sub2_4.method160(40, 239, this.aString22, 0);
				this.aClass6_Sub2_Sub2_Sub2_4.method160(60, 239, this.aString19 + "*", 128);
			} else if (this.anInt1035 == 1) {
				this.aClass6_Sub2_Sub2_Sub2_4.method160(40, 239, "Enter amount:", 0);
				this.aClass6_Sub2_Sub2_Sub2_4.method160(60, 239, this.aString23 + "*", 128);
			} else if (this.anInt1035 == 2) {
				this.aClass6_Sub2_Sub2_Sub2_4.method160(40, 239, "Enter name:", 0);
				this.aClass6_Sub2_Sub2_Sub2_4.method160(60, 239, this.aString23 + "*", 128);
			} else if (this.aString26 != null) {
				this.aClass6_Sub2_Sub2_Sub2_4.method160(40, 239, this.aString26, 0);
				this.aClass6_Sub2_Sub2_Sub2_4.method160(60, 239, "Click to continue", 128);
			} else if (this.anInt923 != -1) {
				this.method674(0, 0, Class18.aClass18Array1[this.anInt923], 0);
			} else if (this.anInt837 == -1) {
				@Pc(168) Class6_Sub2_Sub2_Sub2 local168 = this.aClass6_Sub2_Sub2_Sub2_3;
				@Pc(170) int local170 = 0;
				Class6_Sub2_Sub2.method516(0, 463, 77, 0);
				for (@Pc(178) int local178 = 0; local178 < 100; local178++) {
					if (this.aStringArray12[local178] != null) {
						@Pc(190) int local190 = this.anIntArray272[local178];
						@Pc(199) int local199 = this.anInt952 + 70 - local170 * 14;
						@Pc(204) String local204 = this.aStringArray11[local178];
						@Pc(206) byte local206 = 0;
						if (local204 != null && local204.startsWith("@cr1@")) {
							local204 = local204.substring(5);
							local206 = 1;
						}
						if (local204 != null && local204.startsWith("@cr2@")) {
							local204 = local204.substring(5);
							local206 = 2;
						}
						if (local190 == 0) {
							if (local199 > 0 && local199 < 110) {
								local168.method164(0, 4, local199, this.aStringArray12[local178]);
							}
							local170++;
						}
						@Pc(276) int local276;
						if ((local190 == 1 || local190 == 2) && (local190 == 1 || this.anInt1036 == 0 || this.anInt1036 == 1 && this.method623(local204))) {
							if (local199 > 0 && local199 < 110) {
								local276 = 4;
								if (local206 == 1) {
									this.aClass6_Sub2_Sub2_Sub4Array4[0].method531(4, local199 - 12, this.anInt992);
									local276 += 14;
								}
								if (local206 == 2) {
									this.aClass6_Sub2_Sub2_Sub4Array4[1].method531(local276, local199 - 12, this.anInt992);
									local276 += 14;
								}
								local168.method164(0, local276, local199, local204 + ":");
								local276 += local168.method162(local204) + 8;
								local168.method164(255, local276, local199, this.aStringArray12[local178]);
							}
							local170++;
						}
						if ((local190 == 3 || local190 == 7) && this.anInt873 == 0 && (local190 == 7 || this.anInt934 == 0 || this.anInt934 == 1 && this.method623(local204))) {
							if (local199 > 0 && local199 < 110) {
								local168.method164(0, 4, local199, "From");
								local276 = local168.method162("From ") + 4;
								if (local206 == 1) {
									this.aClass6_Sub2_Sub2_Sub4Array4[0].method531(local276, local199 - 12, this.anInt992);
									local276 += 14;
								}
								if (local206 == 2) {
									this.aClass6_Sub2_Sub2_Sub4Array4[1].method531(local276, local199 - 12, this.anInt992);
									local276 += 14;
								}
								local168.method164(0, local276, local199, local204 + ":");
								local276 += local168.method162(local204) + 8;
								local168.method164(8388608, local276, local199, this.aStringArray12[local178]);
							}
							local170++;
						}
						if (local190 == 4 && (this.anInt1006 == 0 || this.anInt1006 == 1 && this.method623(local204))) {
							if (local199 > 0 && local199 < 110) {
								local168.method164(8388736, 4, local199, local204 + " " + this.aStringArray12[local178]);
							}
							local170++;
						}
						if (local190 == 5 && this.anInt873 == 0 && this.anInt934 < 2) {
							if (local199 > 0 && local199 < 110) {
								local168.method164(8388608, 4, local199, this.aStringArray12[local178]);
							}
							local170++;
						}
						if (local190 == 6 && this.anInt873 == 0 && this.anInt934 < 2) {
							if (local199 > 0 && local199 < 110) {
								local168.method164(0, 4, local199, "To " + local204 + ":");
								local168.method164(8388608, local168.method162("To " + local204) + 12, local199, this.aStringArray12[local178]);
							}
							local170++;
						}
						if (local190 == 8 && (this.anInt1006 == 0 || this.anInt1006 == 1 && this.method623(local204))) {
							if (local199 > 0 && local199 < 110) {
								local168.method164(8270336, 4, local199, local204 + " " + this.aStringArray12[local178]);
							}
							local170++;
						}
					}
				}
				Class6_Sub2_Sub2.method515();
				this.anInt857 = local170 * 14 + 7;
				if (this.anInt857 < 78) {
					this.anInt857 = 78;
				}
				this.method699(this.anInt857, 77, 0, 463, this.anInt857 - this.anInt952 - 77);
				@Pc(650) String local650;
				if (aClass6_Sub2_Sub1_Sub3_Sub2_1 == null || aClass6_Sub2_Sub1_Sub3_Sub2_1.aString15 == null) {
					local650 = Class42.method468(this.aString24);
				} else {
					local650 = aClass6_Sub2_Sub1_Sub3_Sub2_1.aString15;
				}
				local168.method164(0, 4, 90, local650 + ":");
				local168.method164(255, local168.method162(local650 + ": ") + 6, 90, this.aString27 + "*");
				Class6_Sub2_Sub2.method522(77, 479, 0, 0);
			} else {
				this.method674(0, 0, Class18.aClass18Array1[this.anInt837], 0);
			}
			if (this.aBoolean262 && this.anInt973 == 2) {
				this.method633(this.anInt838);
			}
			this.aClass28_24.method357(357, 17, super.aGraphics2);
			this.aClass28_23.method356();
			Class6_Sub2_Sub2_Sub3.anIntArray78 = this.anIntArray263;
		} catch (@Pc(732) RuntimeException local732) {
			signlink.reporterror("55124, " + false + ", " + local732.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!UAWAYCTK;II)V")
	private void method631(@OriginalArg(0) Class6_Sub2_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 != this.anInt847) {
				this.anInt889 = 386;
			}
			while (arg0.anInt610 + 10 < arg1 * 8) {
				@Pc(19) int local19 = arg0.method413(11);
				if (local19 == 2047) {
					break;
				}
				if (this.aClass6_Sub2_Sub1_Sub3_Sub2Array1[local19] == null) {
					this.aClass6_Sub2_Sub1_Sub3_Sub2Array1[local19] = new Class6_Sub2_Sub1_Sub3_Sub2();
					if (this.aClass6_Sub2_Sub3Array1[local19] != null) {
						this.aClass6_Sub2_Sub1_Sub3_Sub2Array1[local19].method452(this.aByte35, this.aClass6_Sub2_Sub3Array1[local19]);
					}
				}
				this.anIntArray265[this.anInt987++] = local19;
				@Pc(66) Class6_Sub2_Sub1_Sub3_Sub2 local66 = this.aClass6_Sub2_Sub1_Sub3_Sub2Array1[local19];
				local66.anInt660 = anInt928;
				@Pc(74) int local74 = arg0.method413(5);
				if (local74 > 15) {
					local74 -= 32;
				}
				@Pc(83) int local83 = arg0.method413(1);
				if (local83 == 1) {
					this.anIntArray266[this.anInt988++] = local19;
				}
				@Pc(102) int local102 = arg0.method413(1);
				@Pc(107) int local107 = arg0.method413(5);
				if (local107 > 15) {
					local107 -= 32;
				}
				local66.method449(aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0] + local107, local102 == 1, aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0] + local74);
			}
			arg0.method414();
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("42157, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[BB)V")
	private void method632(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		try {
			if (this.aBoolean258) {
				signlink.anInt1052 = arg0 ? 1 : 0;
				signlink.midisave(arg1, arg1.length);
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("68311, " + arg0 + ", " + arg1 + ", " + -101 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method633(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) int local4 = this.anInt974;
			@Pc(7) int local7 = this.anInt975;
			@Pc(10) int local10 = this.anInt976;
			@Pc(13) int local13 = this.anInt977;
			Class6_Sub2_Sub2.method519(6116423, local7, local13, local4, local10);
			Class6_Sub2_Sub2.method519(0, local7 + 1, 16, local4 + 1, local10 - 2);
			Class6_Sub2_Sub2.method520(local4 + 1, local7 + 18, local10 - 2, 0, 248, local13 - 19);
			this.aClass6_Sub2_Sub2_Sub2_4.method164(6116423, local4 + 3, local7 + 14, "Choose Option");
			@Pc(65) int local65 = super.anInt815;
			@Pc(68) int local68 = super.anInt816;
			while (arg0 >= 0) {
				this.anInt953 = -104;
			}
			if (this.anInt973 == 0) {
				local65 -= 4;
				local68 -= 4;
			}
			if (this.anInt973 == 1) {
				local65 -= 553;
				local68 -= 205;
			}
			if (this.anInt973 == 2) {
				local65 -= 17;
				local68 -= 357;
			}
			for (@Pc(94) int local94 = 0; local94 < this.anInt839; local94++) {
				@Pc(109) int local109 = local7 + (this.anInt839 - 1 - local94) * 15 + 31;
				@Pc(111) int local111 = 16777215;
				if (local65 > local4 && local65 < local4 + local10 && local68 > local109 - 13 && local68 < local109 + 3) {
					local111 = 16776960;
				}
				this.aClass6_Sub2_Sub2_Sub2_4.method168(true, this.aStringArray10[local94], local111, local4 + 3, local109);
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("49257, " + arg0 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!UFGXOLGK;ILclient!UAWAYCTK;I)V")
	private void method634(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub2_Sub1_Sub3_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class6_Sub2_Sub3 arg3) {
		try {
			this.anInt1008 += 0;
			@Pc(19) int local19;
			if ((arg0 & 0x200) != 0) {
				arg1.anInt630 = arg3.method404();
				local19 = arg3.method436();
				arg1.anInt634 = local19 >> 16;
				arg1.anInt633 = anInt928 + (local19 & 0xFFFF);
				arg1.anInt631 = 0;
				arg1.anInt632 = 0;
				if (arg1.anInt633 > anInt928) {
					arg1.anInt631 = -1;
				}
				if (arg1.anInt630 == 65535) {
					arg1.anInt630 = -1;
				}
			}
			if ((arg0 & 0x400) != 0) {
				arg1.anInt622 = arg3.method402();
				arg1.anInt624 = arg3.method422();
				arg1.anInt623 = arg3.method421();
				arg1.anInt625 = arg3.method422();
				arg1.anInt626 = arg3.method430() + anInt928;
				arg1.anInt627 = arg3.method431() + anInt928;
				arg1.anInt628 = arg3.method422();
				arg1.method448();
			}
			if ((arg0 & 0x10) != 0) {
				arg1.anInt657 = arg3.method431();
				if (arg1.anInt657 == 65535) {
					arg1.anInt657 = -1;
				}
			}
			@Pc(124) int local124;
			@Pc(128) int local128;
			if ((arg0 & 0x1) != 0) {
				local19 = arg3.method430();
				local124 = arg3.method421();
				local128 = arg3.method421();
				@Pc(131) int local131 = arg3.anInt609;
				if (arg1.aString15 != null && arg1.aBoolean174) {
					@Pc(141) long local141 = Class42.method464(arg1.aString15);
					@Pc(143) boolean local143 = false;
					if (local124 <= 1) {
						for (@Pc(148) int local148 = 0; local148 < this.anInt891; local148++) {
							if (this.aLongArray4[local148] == local141) {
								local143 = true;
								break;
							}
						}
					}
					if (!local143 && this.anInt990 == 0) {
						try {
							this.aClass6_Sub2_Sub3_9.anInt609 = 0;
							arg3.method441(local128, this.aClass6_Sub2_Sub3_9.aByteArray17);
							this.aClass6_Sub2_Sub3_9.anInt609 = 0;
							@Pc(193) String local193 = Class4.method37(this.aClass6_Sub2_Sub3_9, local128);
							@Pc(197) String local197 = Class50.method543(76, local193);
							arg1.aString14 = local197;
							arg1.anInt635 = local19 >> 8;
							arg1.anInt636 = local19 & 0xFF;
							arg1.anInt642 = 150;
							if (local124 == 2 || local124 == 3) {
								this.method648("@cr2@" + arg1.aString15, local197, 1, this.aBoolean235);
							} else if (local124 == 1) {
								this.method648("@cr1@" + arg1.aString15, local197, 1, this.aBoolean235);
							} else {
								this.method648(arg1.aString15, local197, 2, this.aBoolean235);
							}
						} catch (@Pc(264) Exception local264) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg3.anInt609 = local131 + local128;
			}
			if ((arg0 & 0x8) != 0) {
				arg1.aString14 = arg3.method409();
				if (arg1.aString14.charAt(0) == '~') {
					arg1.aString14 = arg1.aString14.substring(1);
					this.method648(arg1.aString15, arg1.aString14, 2, this.aBoolean235);
				} else if (arg1 == aClass6_Sub2_Sub1_Sub3_Sub2_1) {
					this.method648(arg1.aString15, arg1.aString14, 2, this.aBoolean235);
				}
				arg1.anInt635 = 0;
				arg1.anInt636 = 0;
				arg1.anInt642 = 150;
			}
			if ((arg0 & 0x100) != 0) {
				local19 = arg3.method423();
				local124 = arg3.method402();
				arg1.method450(this.aBoolean260, local124, anInt928, local19);
				arg1.anInt637 = anInt928 + 300;
				arg1.anInt638 = arg3.method421();
				arg1.anInt639 = arg3.method422();
			}
			if ((arg0 & 0x80) != 0) {
				arg1.anInt658 = arg3.method404();
				arg1.anInt659 = arg3.method431();
			}
			if ((arg0 & 0x40) != 0) {
				local19 = arg3.method422();
				@Pc(381) byte[] local381 = new byte[local19];
				@Pc(387) Class6_Sub2_Sub3 local387 = new Class6_Sub2_Sub3(741, local381);
				arg3.method440(local19, local381);
				this.aClass6_Sub2_Sub3Array1[arg2] = local387;
				arg1.method452(this.aByte35, local387);
			}
			if ((arg0 & 0x4) != 0) {
				local19 = arg3.method422();
				local124 = arg3.method421();
				arg1.method450(this.aBoolean260, local124, anInt928, local19);
				arg1.anInt637 = anInt928 + 300;
				arg1.anInt638 = arg3.method402();
				arg1.anInt639 = arg3.method423();
			}
			if ((arg0 & 0x2) != 0) {
				local19 = arg3.method430();
				if (local19 == 65535) {
					local19 = -1;
				}
				local124 = arg3.method422();
				if (local19 == arg1.anInt616 && local19 != -1) {
					local128 = Class33.aClass33Array1[local19].anInt566;
					if (local128 == 1) {
						arg1.anInt617 = 0;
						arg1.anInt618 = 0;
						arg1.anInt619 = local124;
						arg1.anInt620 = 0;
					}
					if (local128 == 2) {
						arg1.anInt620 = 0;
						return;
					}
				} else if (local19 == -1 || arg1.anInt616 == -1 || Class33.aClass33Array1[local19].anInt560 >= Class33.aClass33Array1[arg1.anInt616].anInt560) {
					arg1.anInt616 = local19;
					arg1.anInt617 = 0;
					arg1.anInt618 = 0;
					arg1.anInt619 = local124;
					arg1.anInt620 = 0;
					arg1.anInt650 = arg1.anInt621;
				}
			}
		} catch (@Pc(525) RuntimeException local525) {
			signlink.reporterror("78378, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + local525.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBI)I")
	private int method635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(13) int local13 = 256 - arg0;
			return ((arg1 & 0xFF00FF) * local13 + (arg2 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg1 & 0xFF00) * local13 + (arg2 & 0xFF00) * arg0 & 0xFF0000) >> 8;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("61647, " + arg0 + ", " + arg1 + ", " + -62 + ", " + arg2 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method578() {
		try {
			signlink.reporterror = false;
			try {
				if (this.aClass7_1 != null) {
					this.aClass7_1.method42();
				}
			} catch (@Pc(11) Exception local11) {
			}
			this.aClass7_1 = null;
			this.method667();
			if (this.aClass44_1 != null) {
				this.aClass44_1.aBoolean185 = false;
			}
			this.aClass44_1 = null;
			this.aClass9_Sub1_1.method58();
			this.aClass9_Sub1_1 = null;
			this.aClass6_Sub2_Sub3_9 = null;
			this.aClass6_Sub2_Sub3_7 = null;
			this.aClass6_Sub2_Sub3_6 = null;
			this.aClass6_Sub2_Sub3_8 = null;
			this.anIntArray236 = null;
			this.aByteArrayArray4 = null;
			this.aByteArrayArray5 = null;
			this.anIntArray237 = null;
			this.anIntArray238 = null;
			this.anIntArrayArrayArray7 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass25_1 = null;
			this.aClass3Array1 = null;
			this.anIntArrayArray25 = null;
			this.anIntArrayArray23 = null;
			this.anIntArray212 = null;
			this.anIntArray213 = null;
			this.aByteArray21 = null;
			this.aClass28_21 = null;
			this.aClass28_22 = null;
			this.aClass28_23 = null;
			this.aClass28_24 = null;
			this.aClass28_25 = null;
			this.aClass28_26 = null;
			this.aClass28_27 = null;
			this.aClass28_3 = null;
			this.aClass28_4 = null;
			this.aClass28_5 = null;
			this.aClass28_6 = null;
			this.aClass28_7 = null;
			this.aClass28_8 = null;
			this.aClass28_9 = null;
			this.aClass28_10 = null;
			this.aClass28_11 = null;
			this.aClass6_Sub2_Sub2_Sub4_8 = null;
			this.aClass6_Sub2_Sub2_Sub4_9 = null;
			this.aClass6_Sub2_Sub2_Sub4_10 = null;
			this.aClass6_Sub2_Sub2_Sub4_3 = null;
			this.aClass6_Sub2_Sub2_Sub4_4 = null;
			this.aClass6_Sub2_Sub2_Sub4_5 = null;
			this.aClass6_Sub2_Sub2_Sub4Array5 = null;
			this.aClass6_Sub2_Sub2_Sub4_16 = null;
			this.aClass6_Sub2_Sub2_Sub4_17 = null;
			this.aClass6_Sub2_Sub2_Sub4_18 = null;
			this.aClass6_Sub2_Sub2_Sub4_19 = null;
			this.aClass6_Sub2_Sub2_Sub4_20 = null;
			this.aClass6_Sub2_Sub2_Sub4_11 = null;
			this.aClass6_Sub2_Sub2_Sub4_12 = null;
			this.aClass6_Sub2_Sub2_Sub4_13 = null;
			this.aClass6_Sub2_Sub2_Sub4_14 = null;
			this.aClass6_Sub2_Sub2_Sub4_15 = null;
			this.aClass6_Sub2_Sub2_Sub1_3 = null;
			this.aClass6_Sub2_Sub2_Sub1Array5 = null;
			this.aClass6_Sub2_Sub2_Sub1Array10 = null;
			this.aClass6_Sub2_Sub2_Sub1Array8 = null;
			this.aClass6_Sub2_Sub2_Sub1Array7 = null;
			this.aClass6_Sub2_Sub2_Sub1Array6 = null;
			this.aClass6_Sub2_Sub2_Sub1_10 = null;
			this.aClass6_Sub2_Sub2_Sub1_13 = null;
			this.aClass6_Sub2_Sub2_Sub1_14 = null;
			this.aClass6_Sub2_Sub2_Sub1_15 = null;
			this.aClass6_Sub2_Sub2_Sub1_16 = null;
			this.aClass6_Sub2_Sub2_Sub1_17 = null;
			this.aClass6_Sub2_Sub2_Sub4Array3 = null;
			this.aClass6_Sub2_Sub2_Sub1Array9 = null;
			this.anIntArrayArray24 = null;
			this.aClass6_Sub2_Sub1_Sub3_Sub2Array1 = null;
			this.anIntArray265 = null;
			this.anIntArray266 = null;
			this.aClass6_Sub2_Sub3Array1 = null;
			this.anIntArray244 = null;
			this.aClass6_Sub2_Sub1_Sub3_Sub1Array1 = null;
			this.anIntArray253 = null;
			this.aClass39ArrayArrayArray1 = null;
			this.aClass39_12 = null;
			this.aClass39_10 = null;
			this.aClass39_11 = null;
			this.anIntArray231 = null;
			this.anIntArray232 = null;
			this.anInt1008 += 0;
			this.anIntArray233 = null;
			this.anIntArray234 = null;
			this.aStringArray10 = null;
			this.anIntArray240 = null;
			this.anIntArray242 = null;
			this.anIntArray243 = null;
			this.aClass6_Sub2_Sub2_Sub1Array4 = null;
			this.aClass6_Sub2_Sub2_Sub1_9 = null;
			this.aStringArray13 = null;
			this.aLongArray3 = null;
			this.anIntArray225 = null;
			this.aClass28_15 = null;
			this.aClass28_16 = null;
			this.aClass28_12 = null;
			this.aClass28_13 = null;
			this.aClass28_14 = null;
			this.aClass28_17 = null;
			this.aClass28_18 = null;
			this.aClass28_19 = null;
			this.aClass28_20 = null;
			this.method686();
			Class2.method18();
			Class16.method202();
			Class19.method282();
			Class8.aClass8Array1 = null;
			Class23.aClass23Array1 = null;
			Class18.aClass18Array1 = null;
			Class49.aClass49Array1 = null;
			Class33.aClass33Array1 = null;
			Class29.aClass29Array1 = null;
			Class29.aClass10_8 = null;
			Class35.aClass35Array1 = null;
			super.aClass28_2 = null;
			Class6_Sub2_Sub1_Sub3_Sub2.aClass10_9 = null;
			Class6_Sub2_Sub2_Sub3.method242();
			Class25.method299();
			Class6_Sub2_Sub1_Sub6.method483();
			Class12.method86();
			System.gc();
		} catch (@Pc(382) RuntimeException local382) {
			signlink.reporterror("31964, " + 0 + ", " + local382.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!UAWAYCTK;BI)V")
	private void method636(@OriginalArg(0) Class6_Sub2_Sub3 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg1 == this.aByte31) {
				@Pc(7) boolean local7 = false;
			} else {
				this.anInt1009 = arg0.method402();
			}
			for (@Pc(15) int local15 = 0; local15 < this.anInt988; local15++) {
				@Pc(22) int local22 = this.anIntArray266[local15];
				@Pc(27) Class6_Sub2_Sub1_Sub3_Sub1 local27 = this.aClass6_Sub2_Sub1_Sub3_Sub1Array1[local22];
				@Pc(30) int local30 = arg0.method402();
				if ((local30 & 0x4) != 0) {
					local27.aString14 = arg0.method409();
					local27.anInt642 = 100;
				}
				@Pc(54) int local54;
				if ((local30 & 0x1) != 0) {
					local27.anInt630 = arg0.method431();
					local54 = arg0.method436();
					local27.anInt634 = local54 >> 16;
					local27.anInt633 = anInt928 + (local54 & 0xFFFF);
					local27.anInt631 = 0;
					local27.anInt632 = 0;
					if (local27.anInt633 > anInt928) {
						local27.anInt631 = -1;
					}
					if (local27.anInt630 == 65535) {
						local27.anInt630 = -1;
					}
				}
				@Pc(97) int local97;
				if ((local30 & 0x80) != 0) {
					local54 = arg0.method402();
					local97 = arg0.method422();
					local27.method450(this.aBoolean260, local97, anInt928, local54);
					local27.anInt637 = anInt928 + 300;
					local27.anInt638 = arg0.method402();
					local27.anInt639 = arg0.method422();
				}
				if ((local30 & 0x40) != 0) {
					local27.anInt657 = arg0.method430();
					if (local27.anInt657 == 65535) {
						local27.anInt657 = -1;
					}
				}
				if ((local30 & 0x2) != 0) {
					local54 = arg0.method421();
					local97 = arg0.method421();
					local27.method450(this.aBoolean260, local97, anInt928, local54);
					local27.anInt637 = anInt928 + 300;
					local27.anInt638 = arg0.method402();
					local27.anInt639 = arg0.method423();
				}
				if ((local30 & 0x20) != 0) {
					local54 = arg0.method431();
					if (local54 == 65535) {
						local54 = -1;
					}
					local97 = arg0.method421();
					if (local54 == local27.anInt616 && local54 != -1) {
						@Pc(196) int local196 = Class33.aClass33Array1[local54].anInt566;
						if (local196 == 1) {
							local27.anInt617 = 0;
							local27.anInt618 = 0;
							local27.anInt619 = local97;
							local27.anInt620 = 0;
						}
						if (local196 == 2) {
							local27.anInt620 = 0;
						}
					} else if (local54 == -1 || local27.anInt616 == -1 || Class33.aClass33Array1[local54].anInt560 >= Class33.aClass33Array1[local27.anInt616].anInt560) {
						local27.anInt616 = local54;
						local27.anInt617 = 0;
						local27.anInt618 = 0;
						local27.anInt619 = local97;
						local27.anInt620 = 0;
						local27.anInt650 = local27.anInt621;
					}
				}
				if ((local30 & 0x8) != 0) {
					local27.aClass16_1 = Class16.method207(arg0.method404());
					local27.anInt648 = local27.aClass16_1.aByte10;
					local27.anInt649 = local27.aClass16_1.anInt222;
					local27.anInt643 = local27.aClass16_1.anInt212;
					local27.anInt644 = local27.aClass16_1.anInt223;
					local27.anInt645 = local27.aClass16_1.anInt209;
					local27.anInt646 = local27.aClass16_1.anInt219;
					local27.anInt640 = local27.aClass16_1.anInt207;
				}
				if ((local30 & 0x10) != 0) {
					local27.anInt658 = arg0.method431();
					local27.anInt659 = arg0.method429();
				}
			}
		} catch (@Pc(320) RuntimeException local320) {
			signlink.reporterror("81564, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local320.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZII)V")
	private void method637(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(1) int local1 = 0;
			for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
				if (this.aStringArray12[local3] != null) {
					@Pc(15) int local15 = this.anIntArray272[local3];
					@Pc(26) int local26 = this.anInt952 + 70 + 4 - local1 * 14;
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
					if ((local15 == 1 || local15 == 2) && (local15 == 1 || this.anInt1036 == 0 || this.anInt1036 == 1 && this.method623(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26 && !local34.equals(aClass6_Sub2_Sub1_Sub3_Sub2_1.aString15)) {
							if (this.anInt835 >= 1) {
								this.aStringArray10[this.anInt839] = "Report abuse @whi@" + local34;
								this.anIntArray233[this.anInt839] = 194;
								this.anInt839++;
							}
							this.aStringArray10[this.anInt839] = "Add ignore @whi@" + local34;
							this.anIntArray233[this.anInt839] = 157;
							this.anInt839++;
							this.aStringArray10[this.anInt839] = "Add friend @whi@" + local34;
							this.anIntArray233[this.anInt839] = 761;
							this.anInt839++;
						}
						local1++;
					}
					if ((local15 == 3 || local15 == 7) && this.anInt873 == 0 && (local15 == 7 || this.anInt934 == 0 || this.anInt934 == 1 && this.method623(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							if (this.anInt835 >= 1) {
								this.aStringArray10[this.anInt839] = "Report abuse @whi@" + local34;
								this.anIntArray233[this.anInt839] = 194;
								this.anInt839++;
							}
							this.aStringArray10[this.anInt839] = "Add ignore @whi@" + local34;
							this.anIntArray233[this.anInt839] = 157;
							this.anInt839++;
							this.aStringArray10[this.anInt839] = "Add friend @whi@" + local34;
							this.anIntArray233[this.anInt839] = 761;
							this.anInt839++;
						}
						local1++;
					}
					if (local15 == 4 && (this.anInt1006 == 0 || this.anInt1006 == 1 && this.method623(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							this.aStringArray10[this.anInt839] = "Accept trade @whi@" + local34;
							this.anIntArray233[this.anInt839] = 406;
							this.anInt839++;
						}
						local1++;
					}
					if ((local15 == 5 || local15 == 6) && this.anInt873 == 0 && this.anInt934 < 2) {
						local1++;
					}
					if (local15 == 8 && (this.anInt1006 == 0 || this.anInt1006 == 1 && this.method623(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							this.aStringArray10[this.anInt839] = "Accept challenge @whi@" + local34;
							this.anIntArray233[this.anInt839] = 853;
							this.anInt839++;
						}
						local1++;
					}
				}
			}
		} catch (@Pc(404) RuntimeException local404) {
			signlink.reporterror("92466, " + true + ", " + arg0 + ", " + arg1 + ", " + local404.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)Z")
	private boolean method638(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(18) int local18 = this.anIntArray233[arg0];
			if (local18 >= 2000) {
				local18 -= 2000;
			}
			return local18 == 761;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("68140, " + arg0 + ", " + 9525 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	@Override
	public void method582(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}
		if (signlink.mainapp == null) {
			super.method582(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!JKAPIYZO;II)V")
	private void method640(@OriginalArg(0) int arg0, @OriginalArg(2) Class16 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (this.anInt839 < 400) {
				if (arg1.anIntArray59 != null) {
					arg1 = arg1.method205();
				}
				if (arg1 != null && arg1.aBoolean78) {
					@Pc(29) String local29 = arg1.aString4;
					if (arg1.anInt208 != 0) {
						local29 = local29 + method625(arg1.anInt208, aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt669) + " (level-" + arg1.anInt208 + ")";
					}
					if (this.anInt999 == 1) {
						this.aStringArray10[this.anInt839] = "Use " + this.aString29 + " with @yel@" + local29;
						this.anIntArray233[this.anInt839] = 397;
						this.anIntArray234[this.anInt839] = arg3;
						this.anIntArray231[this.anInt839] = arg0;
						this.anIntArray232[this.anInt839] = arg2;
						this.anInt839++;
					} else if (this.anInt843 != 1) {
						@Pc(167) int local167;
						if (arg1.aStringArray3 != null) {
							for (local167 = 4; local167 >= 0; local167--) {
								if (arg1.aStringArray3[local167] != null && !arg1.aStringArray3[local167].equalsIgnoreCase("attack")) {
									this.aStringArray10[this.anInt839] = arg1.aStringArray3[local167] + " @yel@" + local29;
									if (local167 == 0) {
										this.anIntArray233[this.anInt839] = 457;
									}
									if (local167 == 1) {
										this.anIntArray233[this.anInt839] = 749;
									}
									if (local167 == 2) {
										this.anIntArray233[this.anInt839] = 735;
									}
									if (local167 == 3) {
										this.anIntArray233[this.anInt839] = 153;
									}
									if (local167 == 4) {
										this.anIntArray233[this.anInt839] = 560;
									}
									this.anIntArray234[this.anInt839] = arg3;
									this.anIntArray231[this.anInt839] = arg0;
									this.anIntArray232[this.anInt839] = arg2;
									this.anInt839++;
								}
							}
						}
						if (arg1.aStringArray3 != null) {
							for (local167 = 4; local167 >= 0; local167--) {
								if (arg1.aStringArray3[local167] != null && arg1.aStringArray3[local167].equalsIgnoreCase("attack")) {
									@Pc(291) short local291 = 0;
									if (arg1.anInt208 > aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt669) {
										local291 = 2000;
									}
									this.aStringArray10[this.anInt839] = arg1.aStringArray3[local167] + " @yel@" + local29;
									if (local167 == 0) {
										this.anIntArray233[this.anInt839] = local291 + 457;
									}
									if (local167 == 1) {
										this.anIntArray233[this.anInt839] = local291 + 749;
									}
									if (local167 == 2) {
										this.anIntArray233[this.anInt839] = local291 + 735;
									}
									if (local167 == 3) {
										this.anIntArray233[this.anInt839] = local291 + 153;
									}
									if (local167 == 4) {
										this.anIntArray233[this.anInt839] = local291 + 560;
									}
									this.anIntArray234[this.anInt839] = arg3;
									this.anIntArray231[this.anInt839] = arg0;
									this.anIntArray232[this.anInt839] = arg2;
									this.anInt839++;
								}
							}
						}
						this.aStringArray10[this.anInt839] = "Examine @yel@" + local29;
						this.anIntArray233[this.anInt839] = 1822;
						this.anIntArray234[this.anInt839] = arg3;
						this.anIntArray231[this.anInt839] = arg0;
						this.anIntArray232[this.anInt839] = arg2;
						this.anInt839++;
					} else if ((this.anInt845 & 0x2) == 2) {
						this.aStringArray10[this.anInt839] = this.aString18 + " @yel@" + local29;
						this.anIntArray233[this.anInt839] = 610;
						this.anIntArray234[this.anInt839] = arg3;
						this.anIntArray231[this.anInt839] = arg0;
						this.anIntArray232[this.anInt839] = arg2;
						this.anInt839++;
						return;
					}
				}
			}
		} catch (@Pc(441) RuntimeException local441) {
			signlink.reporterror("38440, " + arg0 + ", " + -12242 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local441.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!LYHLTGUG;)Z")
	private boolean method641(@OriginalArg(1) Class18 arg0) {
		try {
			if (arg0.anIntArray87 == null) {
				return false;
			}
			for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray87.length; local12++) {
				@Pc(20) int local20 = this.method602(local12, arg0);
				@Pc(25) int local25 = arg0.anIntArray86[local12];
				if (arg0.anIntArray87[local12] == 2) {
					if (local20 >= local25) {
						return false;
					}
				} else if (arg0.anIntArray87[local12] == 3) {
					if (local20 <= local25) {
						return false;
					}
				} else if (arg0.anIntArray87[local12] == 4) {
					if (local20 == local25) {
						return false;
					}
				} else if (local20 != local25) {
					return false;
				}
			}
			return true;
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("85015, " + 2 + ", " + arg0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method642() {
		try {
			if (this.anInt978 == 2) {
				for (@Pc(17) Class6_Sub1 local17 = (Class6_Sub1) this.aClass39_12.method459(); local17 != null; local17 = (Class6_Sub1) this.aClass39_12.method461()) {
					if (local17.anInt62 > 0) {
						local17.anInt62--;
					}
					if (local17.anInt62 != 0) {
						if (local17.anInt63 > 0) {
							local17.anInt63--;
						}
						if (local17.anInt63 == 0 && local17.anInt66 >= 1 && local17.anInt67 >= 1 && local17.anInt66 <= 102 && local17.anInt67 <= 102 && (local17.anInt56 < 0 || Class15.method178(local17.anInt58, local17.anInt56))) {
							this.method601(local17.anInt56, local17.anInt64, local17.anInt57, local17.anInt66, local17.anInt65, local17.anInt58, local17.anInt67);
							local17.anInt63 = -1;
							if (local17.anInt56 == local17.anInt59 && local17.anInt59 == -1) {
								local17.method512();
							} else if (local17.anInt56 == local17.anInt59 && local17.anInt57 == local17.anInt60 && local17.anInt58 == local17.anInt61) {
								local17.method512();
							}
						}
					} else if (local17.anInt59 < 0 || Class15.method178(local17.anInt61, local17.anInt59)) {
						this.method601(local17.anInt59, local17.anInt64, local17.anInt60, local17.anInt66, local17.anInt65, local17.anInt61, local17.anInt67);
						local17.method512();
					}
				}
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("71701, " + false + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)Ljava/net/Socket;")
	public Socket method643(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!IBHVCUAH;I)V")
	private void method644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub2_Sub2_Sub1 arg2) {
		try {
			@Pc(13) int local13 = this.anInt832 + this.anInt867 & 0x7FF;
			@Pc(21) int local21 = arg0 * arg0 + arg1 * arg1;
			if (local21 <= 6400) {
				@Pc(29) int local29 = Class6_Sub2_Sub1_Sub6.anIntArray202[local13];
				@Pc(33) int local33 = Class6_Sub2_Sub1_Sub6.anIntArray203[local13];
				@Pc(42) int local42 = local29 * 256 / (this.anInt911 + 256);
				@Pc(51) int local51 = local33 * 256 / (this.anInt911 + 256);
				@Pc(61) int local61 = arg1 * local42 + arg0 * local51 >> 16;
				@Pc(71) int local71 = arg1 * local51 - arg0 * local42 >> 16;
				if (local21 > 2500) {
					arg2.method143(this.aBoolean250, 83 - local71 - arg2.anInt158 / 2 - 4, this.aClass6_Sub2_Sub2_Sub4_9, local61 + 94 + 4 - arg2.anInt157 / 2);
				} else {
					arg2.method137(local61 + 94 + 4 - arg2.anInt157 / 2, 83 - local71 - arg2.anInt158 / 2 - 4, this.anInt992);
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("47846, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 2934 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method645() {
		try {
			this.anInt919++;
			this.method621(true);
			this.method666((byte) 2, true);
			this.method621(false);
			this.method666((byte) 2, false);
			this.method705(474);
			this.method714();
			@Pc(44) int local44;
			@Pc(83) int local83;
			@Pc(130) int local130;
			if (!this.aBoolean228) {
				local44 = this.anInt831;
				if (this.anInt925 / 256 > local44) {
					local44 = this.anInt925 / 256;
				}
				if (this.aBooleanArray11[4] && this.anIntArray250[4] + 128 > local44) {
					local44 = this.anIntArray250[4] + 128;
				}
				local83 = this.anInt832 + this.anInt926 & 0x7FF;
				this.method647(local83, this.anInt1030, this.anInt1029, local44 * 3 + 600, local44, this.method616(aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt652, aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt651, this.anInt1026) - 50);
				anInt856++;
				if (anInt856 > 1252) {
					anInt856 = 0;
					this.aClass6_Sub2_Sub3_7.method391(191);
					this.aClass6_Sub2_Sub3_7.method392(0);
					local130 = this.aClass6_Sub2_Sub3_7.anInt609;
					this.aClass6_Sub2_Sub3_7.method393((int) (Math.random() * 65536.0D));
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass6_Sub2_Sub3_7.method393(29307);
					}
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass6_Sub2_Sub3_7.method392(10);
					}
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass6_Sub2_Sub3_7.method392(104);
					}
					this.aClass6_Sub2_Sub3_7.method393(34003);
					this.aClass6_Sub2_Sub3_7.method392(235);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass6_Sub2_Sub3_7.method393(64940);
					}
					this.aClass6_Sub2_Sub3_7.method392(242);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass6_Sub2_Sub3_7.method393(64309);
					}
					this.aClass6_Sub2_Sub3_7.method392(174);
					this.aClass6_Sub2_Sub3_7.method401(this.aClass6_Sub2_Sub3_7.anInt609 - local130);
				}
			}
			if (this.aBoolean228) {
				local44 = this.method685();
			} else {
				local44 = this.method684();
			}
			local83 = this.anInt859;
			local130 = this.anInt860;
			@Pc(229) int local229 = this.anInt861;
			@Pc(232) int local232 = this.anInt862;
			@Pc(235) int local235 = this.anInt863;
			@Pc(284) int local284;
			for (@Pc(237) int local237 = 0; local237 < 5; local237++) {
				if (this.aBooleanArray11[local237]) {
					local284 = (int) (Math.random() * (double) (this.anIntArray270[local237] * 2 + 1) - (double) this.anIntArray270[local237] + Math.sin((double) this.anIntArray260[local237] * ((double) this.anIntArray258[local237] / 100.0D)) * (double) this.anIntArray250[local237]);
					if (local237 == 0) {
						this.anInt859 += local284;
					}
					if (local237 == 1) {
						this.anInt860 += local284;
					}
					if (local237 == 2) {
						this.anInt861 += local284;
					}
					if (local237 == 3) {
						this.anInt863 = this.anInt863 + local284 & 0x7FF;
					}
					if (local237 == 4) {
						this.anInt862 += local284;
						if (this.anInt862 < 128) {
							this.anInt862 = 128;
						}
						if (this.anInt862 > 383) {
							this.anInt862 = 383;
						}
					}
				}
			}
			local284 = Class6_Sub2_Sub2_Sub3.anInt344;
			Class6_Sub2_Sub1_Sub6.aBoolean193 = true;
			Class6_Sub2_Sub1_Sub6.anInt737 = 0;
			Class6_Sub2_Sub1_Sub6.anInt735 = super.anInt815 - 4;
			Class6_Sub2_Sub1_Sub6.anInt736 = super.anInt816 - 4;
			Class6_Sub2_Sub2.method517();
			this.aClass25_1.method339(this.anInt861, this.anInt859, this.anInt863, this.anInt862, this.anInt860, local44);
			this.aClass25_1.method314();
			this.method669(69);
			this.method677();
			this.method683(local284);
			this.method658();
			this.aClass28_23.method357(4, 4, super.aGraphics2);
			this.anInt859 = local83;
			this.anInt860 = local130;
			this.anInt861 = local229;
			this.anInt862 = local232;
			this.anInt863 = local235;
		} catch (@Pc(423) RuntimeException local423) {
			signlink.reporterror("75202, " + -97 + ", " + local423.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)V")
	private void method646(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZIIIII)V")
	private void method647(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg4 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg0 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg3;
			@Pc(23) int local23;
			@Pc(27) int local27;
			@Pc(37) int local37;
			if (local5 != 0) {
				local23 = Class6_Sub2_Sub1_Sub6.anIntArray202[local5];
				local27 = Class6_Sub2_Sub1_Sub6.anIntArray203[local5];
				local37 = local27 * 0 - arg3 * local23 >> 16;
				local17 = local23 * 0 + arg3 * local27 >> 16;
				local15 = local37;
			}
			if (local11 != 0) {
				local23 = Class6_Sub2_Sub1_Sub6.anIntArray202[local11];
				local27 = Class6_Sub2_Sub1_Sub6.anIntArray203[local11];
				local37 = local17 * local23 + local27 * 0 >> 16;
				local17 = local17 * local27 - local23 * 0 >> 16;
				local13 = local37;
			}
			this.anInt859 = arg2 - local13;
			this.anInt860 = arg5 - local15;
			this.anInt861 = arg1 - local17;
			this.anInt862 = arg4;
			this.anInt863 = arg0;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("49863, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZ)V")
	private void method648(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		try {
			if (arg2 == 0 && this.anInt837 != -1) {
				this.aString26 = arg1;
				super.anInt820 = 0;
			}
			if (this.anInt923 == -1) {
				this.aBoolean239 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray272[local20] = this.anIntArray272[local20 - 1];
				this.aStringArray11[local20] = this.aStringArray11[local20 - 1];
				this.aStringArray12[local20] = this.aStringArray12[local20 - 1];
			}
			this.anIntArray272[0] = arg2;
			this.aStringArray11[0] = arg0;
			if (arg3) {
				this.aClass6_Sub2_Sub3_7.method392(19);
			}
			this.aStringArray12[0] = arg1;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("49218, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method649() {
		try {
			@Pc(4) Graphics local4 = this.method581().getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			this.method574();
			@Pc(42) byte local42;
			@Pc(48) int local48;
			if (this.aBoolean259) {
				this.aBoolean238 = false;
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
			if (this.aBoolean256) {
				this.aBoolean238 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean241) {
				this.aBoolean238 = false;
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
			signlink.reporterror("13997, " + 81 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method650(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt891 >= 100) {
					this.method648("", "Your ignore list is full. Max of 100 hit", 0, this.aBoolean235);
				} else {
					@Pc(25) String local25 = Class42.method468(Class42.method465(this.anInt1019, arg0));
					for (@Pc(27) int local27 = 0; local27 < this.anInt891; local27++) {
						if (this.aLongArray4[local27] == arg0) {
							this.method648("", local25 + " is already on your ignore list", 0, this.aBoolean235);
							return;
						}
					}
					for (@Pc(58) int local58 = 0; local58 < this.anInt981; local58++) {
						if (this.aLongArray3[local58] == arg0) {
							this.method648("", "Please remove " + local25 + " from your friend list first", 0, this.aBoolean235);
							return;
						}
					}
					this.aLongArray4[this.anInt891++] = arg0;
					this.aBoolean252 = true;
					this.aClass6_Sub2_Sub3_7.method391(12);
					this.aClass6_Sub2_Sub3_7.method398(arg0);
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("4299, " + arg0 + ", " + 0 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)Ljava/lang/String;")
	private String method651() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("5958, " + -48843 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method576() {
		this.method583(20, "Starting up");
		if (signlink.sunjava) {
			super.anInt809 = 5;
		}
		if (aBoolean233) {
			this.aBoolean241 = true;
			return;
		}
		aBoolean233 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method651();
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
		if (local25.endsWith("192.168.1.224")) {
			local21 = true;
		}
		if (local25.endsWith("127.0.0.1")) {
			local21 = true;
		}
		if (!local21) {
			this.aBoolean256 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(89) int local89 = 0; local89 < 5; local89++) {
				this.aClass21Array1[local89] = new Class21(signlink.aRandomAccessFileArray1[local89], local89 + 1, 500000, (byte) 37, signlink.aRandomAccessFile3);
			}
		}
		try {
			this.method678();
			this.aClass36_1 = this.method662("title", this.anIntArray226[1], 25, "title screen", 1);
			this.aClass6_Sub2_Sub2_Sub2_2 = new Class6_Sub2_Sub2_Sub2("p11_full", this.aClass36_1, false, 8801);
			this.aClass6_Sub2_Sub2_Sub2_3 = new Class6_Sub2_Sub2_Sub2("p12_full", this.aClass36_1, false, 8801);
			this.aClass6_Sub2_Sub2_Sub2_4 = new Class6_Sub2_Sub2_Sub2("b12_full", this.aClass36_1, false, 8801);
			this.aClass6_Sub2_Sub2_Sub2_5 = new Class6_Sub2_Sub2_Sub2("q8_full", this.aClass36_1, true, 8801);
			this.method609();
			this.method653();
			@Pc(185) Class36 local185 = this.method662("config", this.anIntArray226[2], 30, "config", 2);
			@Pc(197) Class36 local197 = this.method662("interface", this.anIntArray226[3], 35, "interface", 3);
			@Pc(209) Class36 local209 = this.method662("media", this.anIntArray226[4], 40, "2d graphics", 4);
			@Pc(221) Class36 local221 = this.method662("textures", this.anIntArray226[6], 45, "textures", 6);
			@Pc(233) Class36 local233 = this.method662("wordenc", this.anIntArray226[7], 50, "chat system", 7);
			@Pc(245) Class36 local245 = this.method662("sounds", this.anIntArray226[8], 55, "sound effects", 8);
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray7 = new int[4][105][105];
			this.aClass25_1 = new Class25(4, aBoolean237, 104, this.anIntArrayArrayArray7, 104);
			for (@Pc(270) int local270 = 0; local270 < 4; local270++) {
				this.aClass3Array1[local270] = new Class3(104, 104, (byte) 4);
			}
			this.aClass6_Sub2_Sub2_Sub1_9 = new Class6_Sub2_Sub2_Sub1(512, 512);
			@Pc(305) Class36 local305 = this.method662("versionlist", this.anIntArray226[5], 60, "update list", 5);
			this.method583(60, "Connecting to update server");
			this.aClass9_Sub1_1 = new Class9_Sub1();
			this.aClass9_Sub1_1.method66(local305, this);
			Class12.method84(this.aClass9_Sub1_1.method64());
			Class6_Sub2_Sub1_Sub6.method484(this.aClass9_Sub1_1.method61(0), this.aClass9_Sub1_1);
			if (!aBoolean223) {
				this.anInt941 = 0;
				try {
					this.anInt941 = Integer.parseInt(this.getParameter("music"));
				} catch (@Pc(346) Exception local346) {
				}
				this.aBoolean236 = true;
				this.aClass9_Sub1_1.method54(2, this.anInt941);
				while (this.aClass9_Sub1_1.method73() > 0) {
					this.method710();
					try {
						Thread.sleep(100L);
					} catch (@Pc(364) Exception local364) {
					}
					if (this.aClass9_Sub1_1.anInt90 > 3) {
						this.method646("ondemand");
						return;
					}
				}
			}
			this.method583(65, "Requesting animations");
			@Pc(388) int local388 = this.aClass9_Sub1_1.method61(1);
			for (@Pc(390) int local390 = 0; local390 < local388; local390++) {
				this.aClass9_Sub1_1.method54(1, local390);
			}
			@Pc(409) int local409;
			while (this.aClass9_Sub1_1.method73() > 0) {
				local409 = local388 - this.aClass9_Sub1_1.method73();
				if (local409 > 0) {
					this.method583(65, "Loading animations - " + local409 * 100 / local388 + "%");
				}
				this.method710();
				try {
					Thread.sleep(100L);
				} catch (@Pc(435) Exception local435) {
				}
				if (this.aClass9_Sub1_1.anInt90 > 3) {
					this.method646("ondemand");
					return;
				}
			}
			this.method583(70, "Requesting models");
			local388 = this.aClass9_Sub1_1.method61(0);
			@Pc(469) int local469;
			for (local409 = 0; local409 < local388; local409++) {
				local469 = this.aClass9_Sub1_1.method69(local409);
				if ((local469 & 0x1) != 0) {
					this.aClass9_Sub1_1.method54(0, local409);
				}
			}
			local388 = this.aClass9_Sub1_1.method73();
			while (this.aClass9_Sub1_1.method73() > 0) {
				local469 = local388 - this.aClass9_Sub1_1.method73();
				if (local469 > 0) {
					this.method583(70, "Loading models - " + local469 * 100 / local388 + "%");
				}
				this.method710();
				try {
					Thread.sleep(100L);
				} catch (@Pc(520) Exception local520) {
				}
			}
			if (this.aClass21Array1[0] != null) {
				this.method583(75, "Requesting maps");
				this.aClass9_Sub1_1.method54(3, this.aClass9_Sub1_1.method68(48, 0, 47));
				this.aClass9_Sub1_1.method54(3, this.aClass9_Sub1_1.method68(48, 1, 47));
				this.aClass9_Sub1_1.method54(3, this.aClass9_Sub1_1.method68(48, 0, 48));
				this.aClass9_Sub1_1.method54(3, this.aClass9_Sub1_1.method68(48, 1, 48));
				this.aClass9_Sub1_1.method54(3, this.aClass9_Sub1_1.method68(48, 0, 49));
				this.aClass9_Sub1_1.method54(3, this.aClass9_Sub1_1.method68(48, 1, 49));
				this.aClass9_Sub1_1.method54(3, this.aClass9_Sub1_1.method68(47, 0, 47));
				this.aClass9_Sub1_1.method54(3, this.aClass9_Sub1_1.method68(47, 1, 47));
				this.aClass9_Sub1_1.method54(3, this.aClass9_Sub1_1.method68(47, 0, 48));
				this.aClass9_Sub1_1.method54(3, this.aClass9_Sub1_1.method68(47, 1, 48));
				this.aClass9_Sub1_1.method54(3, this.aClass9_Sub1_1.method68(148, 0, 48));
				this.aClass9_Sub1_1.method54(3, this.aClass9_Sub1_1.method68(148, 1, 48));
				local388 = this.aClass9_Sub1_1.method73();
				while (this.aClass9_Sub1_1.method73() > 0) {
					local469 = local388 - this.aClass9_Sub1_1.method73();
					if (local469 > 0) {
						this.method583(75, "Loading maps - " + local469 * 100 / local388 + "%");
					}
					this.method710();
					try {
						Thread.sleep(100L);
					} catch (@Pc(705) Exception local705) {
					}
				}
			}
			local388 = this.aClass9_Sub1_1.method61(0);
			@Pc(726) int local726;
			for (local469 = 0; local469 < local388; local469++) {
				local726 = this.aClass9_Sub1_1.method69(local469);
				@Pc(728) byte local728 = 0;
				if ((local726 & 0x8) != 0) {
					local728 = 10;
				} else if ((local726 & 0x20) != 0) {
					local728 = 9;
				} else if ((local726 & 0x10) != 0) {
					local728 = 8;
				} else if ((local726 & 0x40) != 0) {
					local728 = 7;
				} else if ((local726 & 0x80) != 0) {
					local728 = 6;
				} else if ((local726 & 0x2) != 0) {
					local728 = 5;
				} else if ((local726 & 0x4) != 0) {
					local728 = 4;
				}
				if ((local726 & 0x1) != 0) {
					local728 = 3;
				}
				if (local728 != 0) {
					this.aClass9_Sub1_1.method70(0, local728, local469);
				}
			}
			this.aClass9_Sub1_1.method71(anInt1021, aBoolean222);
			if (!aBoolean223) {
				local388 = this.aClass9_Sub1_1.method61(2);
				for (local726 = 1; local726 < local388; local726++) {
					if (this.aClass9_Sub1_1.method56(aBoolean246, local726)) {
						this.aClass9_Sub1_1.method70(2, (byte) 1, local726);
					}
				}
			}
			this.method583(80, "Unpacking media");
			this.aClass6_Sub2_Sub2_Sub4_8 = new Class6_Sub2_Sub2_Sub4(local209, "invback", 0);
			this.aClass6_Sub2_Sub2_Sub4_10 = new Class6_Sub2_Sub2_Sub4(local209, "chatback", 0);
			this.aClass6_Sub2_Sub2_Sub4_9 = new Class6_Sub2_Sub2_Sub4(local209, "mapback", 0);
			this.aClass6_Sub2_Sub2_Sub4_3 = new Class6_Sub2_Sub2_Sub4(local209, "backbase1", 0);
			this.aClass6_Sub2_Sub2_Sub4_4 = new Class6_Sub2_Sub2_Sub4(local209, "backbase2", 0);
			this.aClass6_Sub2_Sub2_Sub4_5 = new Class6_Sub2_Sub2_Sub4(local209, "backhmid1", 0);
			for (local726 = 0; local726 < 13; local726++) {
				this.aClass6_Sub2_Sub2_Sub4Array5[local726] = new Class6_Sub2_Sub2_Sub4(local209, "sideicons", local726);
			}
			this.aClass6_Sub2_Sub2_Sub1_3 = new Class6_Sub2_Sub2_Sub1(local209, "compass", 0);
			this.aClass6_Sub2_Sub2_Sub1_4 = new Class6_Sub2_Sub2_Sub1(local209, "mapedge", 0);
			this.aClass6_Sub2_Sub2_Sub1_4.method134();
			for (@Pc(928) int local928 = 0; local928 < 72; local928++) {
				this.aClass6_Sub2_Sub2_Sub4Array3[local928] = new Class6_Sub2_Sub2_Sub4(local209, "mapscene", local928);
			}
			for (@Pc(946) int local946 = 0; local946 < 63; local946++) {
				this.aClass6_Sub2_Sub2_Sub1Array9[local946] = new Class6_Sub2_Sub2_Sub1(local209, "mapfunction", local946);
			}
			for (@Pc(964) int local964 = 0; local964 < 5; local964++) {
				this.aClass6_Sub2_Sub2_Sub1Array5[local964] = new Class6_Sub2_Sub2_Sub1(local209, "hitmarks", local964);
			}
			for (@Pc(982) int local982 = 0; local982 < 6; local982++) {
				this.aClass6_Sub2_Sub2_Sub1Array10[local982] = new Class6_Sub2_Sub2_Sub1(local209, "headicons_pk", local982);
			}
			for (@Pc(1000) int local1000 = 0; local1000 < 9; local1000++) {
				this.aClass6_Sub2_Sub2_Sub1Array8[local1000] = new Class6_Sub2_Sub2_Sub1(local209, "headicons_prayer", local1000);
			}
			for (@Pc(1018) int local1018 = 0; local1018 < 6; local1018++) {
				this.aClass6_Sub2_Sub2_Sub1Array7[local1018] = new Class6_Sub2_Sub2_Sub1(local209, "headicons_hint", local1018);
			}
			this.aClass6_Sub2_Sub2_Sub1_10 = new Class6_Sub2_Sub2_Sub1(local209, "overlay_multiway", 0);
			this.aClass6_Sub2_Sub2_Sub1_7 = new Class6_Sub2_Sub2_Sub1(local209, "mapmarker", 0);
			this.aClass6_Sub2_Sub2_Sub1_8 = new Class6_Sub2_Sub2_Sub1(local209, "mapmarker", 1);
			for (@Pc(1060) int local1060 = 0; local1060 < 8; local1060++) {
				this.aClass6_Sub2_Sub2_Sub1Array6[local1060] = new Class6_Sub2_Sub2_Sub1(local209, "cross", local1060);
			}
			this.aClass6_Sub2_Sub2_Sub1_13 = new Class6_Sub2_Sub2_Sub1(local209, "mapdots", 0);
			this.aClass6_Sub2_Sub2_Sub1_14 = new Class6_Sub2_Sub2_Sub1(local209, "mapdots", 1);
			this.aClass6_Sub2_Sub2_Sub1_15 = new Class6_Sub2_Sub2_Sub1(local209, "mapdots", 2);
			this.aClass6_Sub2_Sub2_Sub1_16 = new Class6_Sub2_Sub2_Sub1(local209, "mapdots", 3);
			this.aClass6_Sub2_Sub2_Sub1_17 = new Class6_Sub2_Sub2_Sub1(local209, "mapdots", 4);
			this.aClass6_Sub2_Sub2_Sub4_6 = new Class6_Sub2_Sub2_Sub4(local209, "scrollbar", 0);
			this.aClass6_Sub2_Sub2_Sub4_7 = new Class6_Sub2_Sub2_Sub4(local209, "scrollbar", 1);
			this.aClass6_Sub2_Sub2_Sub4_16 = new Class6_Sub2_Sub2_Sub4(local209, "redstone1", 0);
			this.aClass6_Sub2_Sub2_Sub4_17 = new Class6_Sub2_Sub2_Sub4(local209, "redstone2", 0);
			this.aClass6_Sub2_Sub2_Sub4_18 = new Class6_Sub2_Sub2_Sub4(local209, "redstone3", 0);
			this.aClass6_Sub2_Sub2_Sub4_19 = new Class6_Sub2_Sub2_Sub4(local209, "redstone1", 0);
			this.aClass6_Sub2_Sub2_Sub4_19.method528();
			this.aClass6_Sub2_Sub2_Sub4_20 = new Class6_Sub2_Sub2_Sub4(local209, "redstone2", 0);
			this.aClass6_Sub2_Sub2_Sub4_20.method528();
			this.aClass6_Sub2_Sub2_Sub4_11 = new Class6_Sub2_Sub2_Sub4(local209, "redstone1", 0);
			this.aClass6_Sub2_Sub2_Sub4_11.method529();
			this.aClass6_Sub2_Sub2_Sub4_12 = new Class6_Sub2_Sub2_Sub4(local209, "redstone2", 0);
			this.aClass6_Sub2_Sub2_Sub4_12.method529();
			this.aClass6_Sub2_Sub2_Sub4_13 = new Class6_Sub2_Sub2_Sub4(local209, "redstone3", 0);
			this.aClass6_Sub2_Sub2_Sub4_13.method529();
			this.aClass6_Sub2_Sub2_Sub4_14 = new Class6_Sub2_Sub2_Sub4(local209, "redstone1", 0);
			this.aClass6_Sub2_Sub2_Sub4_14.method528();
			this.aClass6_Sub2_Sub2_Sub4_14.method529();
			this.aClass6_Sub2_Sub2_Sub4_15 = new Class6_Sub2_Sub2_Sub4(local209, "redstone2", 0);
			this.aClass6_Sub2_Sub2_Sub4_15.method528();
			this.aClass6_Sub2_Sub2_Sub4_15.method529();
			for (@Pc(1250) int local1250 = 0; local1250 < 2; local1250++) {
				this.aClass6_Sub2_Sub2_Sub4Array4[local1250] = new Class6_Sub2_Sub2_Sub4(local209, "mod_icons", local1250);
			}
			@Pc(1273) Class6_Sub2_Sub2_Sub1 local1273 = new Class6_Sub2_Sub2_Sub1(local209, "backleft1", 0);
			this.aClass28_3 = new Class28(local1273.anInt153, this.method581(), local1273.anInt154, (byte) 33);
			local1273.method135(0, 0);
			@Pc(1298) Class6_Sub2_Sub2_Sub1 local1298 = new Class6_Sub2_Sub2_Sub1(local209, "backleft2", 0);
			this.aClass28_4 = new Class28(local1298.anInt153, this.method581(), local1298.anInt154, (byte) 33);
			local1298.method135(0, 0);
			@Pc(1323) Class6_Sub2_Sub2_Sub1 local1323 = new Class6_Sub2_Sub2_Sub1(local209, "backright1", 0);
			this.aClass28_5 = new Class28(local1323.anInt153, this.method581(), local1323.anInt154, (byte) 33);
			local1323.method135(0, 0);
			@Pc(1348) Class6_Sub2_Sub2_Sub1 local1348 = new Class6_Sub2_Sub2_Sub1(local209, "backright2", 0);
			this.aClass28_6 = new Class28(local1348.anInt153, this.method581(), local1348.anInt154, (byte) 33);
			local1348.method135(0, 0);
			@Pc(1373) Class6_Sub2_Sub2_Sub1 local1373 = new Class6_Sub2_Sub2_Sub1(local209, "backtop1", 0);
			this.aClass28_7 = new Class28(local1373.anInt153, this.method581(), local1373.anInt154, (byte) 33);
			local1373.method135(0, 0);
			@Pc(1398) Class6_Sub2_Sub2_Sub1 local1398 = new Class6_Sub2_Sub2_Sub1(local209, "backvmid1", 0);
			this.aClass28_8 = new Class28(local1398.anInt153, this.method581(), local1398.anInt154, (byte) 33);
			local1398.method135(0, 0);
			@Pc(1423) Class6_Sub2_Sub2_Sub1 local1423 = new Class6_Sub2_Sub2_Sub1(local209, "backvmid2", 0);
			this.aClass28_9 = new Class28(local1423.anInt153, this.method581(), local1423.anInt154, (byte) 33);
			local1423.method135(0, 0);
			@Pc(1448) Class6_Sub2_Sub2_Sub1 local1448 = new Class6_Sub2_Sub2_Sub1(local209, "backvmid3", 0);
			this.aClass28_10 = new Class28(local1448.anInt153, this.method581(), local1448.anInt154, (byte) 33);
			local1448.method135(0, 0);
			@Pc(1473) Class6_Sub2_Sub2_Sub1 local1473 = new Class6_Sub2_Sub2_Sub1(local209, "backhmid2", 0);
			this.aClass28_11 = new Class28(local1473.anInt153, this.method581(), local1473.anInt154, (byte) 33);
			local1473.method135(0, 0);
			@Pc(1498) int local1498 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1505) int local1505 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1512) int local1512 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1519) int local1519 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1521) int local1521 = 0; local1521 < 100; local1521++) {
				if (this.aClass6_Sub2_Sub2_Sub1Array9[local1521] != null) {
					this.aClass6_Sub2_Sub2_Sub1Array9[local1521].method133(local1505 + local1519, aByte42, local1512 + local1519, local1498 + local1519);
				}
				if (this.aClass6_Sub2_Sub2_Sub4Array3[local1521] != null) {
					this.aClass6_Sub2_Sub2_Sub4Array3[local1521].method530(local1505 + local1519, aByte42, local1512 + local1519, local1498 + local1519);
				}
			}
			this.method583(83, "Unpacking textures");
			Class6_Sub2_Sub2_Sub3.method247(local221);
			Class6_Sub2_Sub2_Sub3.method251(0.8D);
			Class6_Sub2_Sub2_Sub3.method246();
			this.method583(86, "Unpacking config");
			Class33.method370(local185);
			Class2.method15(local185);
			Class8.method48(local185);
			Class19.method275(local185);
			Class16.method208(local185);
			Class23.method291(local185);
			Class29.method359(local185);
			Class35.method378(local185);
			Class38.method454(local185);
			Class19.aBoolean124 = aBoolean222;
			if (!aBoolean223) {
				this.method583(90, "Unpacking sounds");
				@Pc(1624) byte[] local1624 = local245.method381("sounds.dat", null);
				@Pc(1630) Class6_Sub2_Sub3 local1630 = new Class6_Sub2_Sub3(741, local1624);
				Class13.method89(local1630);
			}
			this.method583(95, "Unpacking interfaces");
			@Pc(1661) Class6_Sub2_Sub2_Sub2[] local1661 = new Class6_Sub2_Sub2_Sub2[] { this.aClass6_Sub2_Sub2_Sub2_2, this.aClass6_Sub2_Sub2_Sub2_3, this.aClass6_Sub2_Sub2_Sub2_4, this.aClass6_Sub2_Sub2_Sub2_5 };
			Class18.method265(local209, local1661, local197);
			this.method583(100, "Preparing game engine");
			@Pc(1677) int local1677;
			@Pc(1679) int local1679;
			@Pc(1681) int local1681;
			for (@Pc(1673) int local1673 = 0; local1673 < 33; local1673++) {
				local1677 = 999;
				local1679 = 0;
				for (local1681 = 0; local1681 < 34; local1681++) {
					if (this.aClass6_Sub2_Sub2_Sub4_9.aByteArray20[local1681 + local1673 * this.aClass6_Sub2_Sub2_Sub4_9.anInt770] == 0) {
						if (local1677 == 999) {
							local1677 = local1681;
						}
					} else if (local1677 != 999) {
						local1679 = local1681;
						break;
					}
				}
				this.anIntArray256[local1673] = local1677;
				this.anIntArray215[local1673] = local1679 - local1677;
			}
			@Pc(1739) int local1739;
			for (local1677 = 5; local1677 < 156; local1677++) {
				local1679 = 999;
				local1681 = 0;
				for (local1739 = 25; local1739 < 172; local1739++) {
					if (this.aClass6_Sub2_Sub2_Sub4_9.aByteArray20[local1739 + local1677 * this.aClass6_Sub2_Sub2_Sub4_9.anInt770] == 0 && (local1739 > 34 || local1677 > 34)) {
						if (local1679 == 999) {
							local1679 = local1739;
						}
					} else if (local1679 != 999) {
						local1681 = local1739;
						break;
					}
				}
				this.anIntArray245[local1677 - 5] = local1679 - 25;
				this.anIntArray235[local1677 - 5] = local1681 - local1679;
			}
			Class6_Sub2_Sub2_Sub3.method244(479, 96);
			this.anIntArray261 = Class6_Sub2_Sub2_Sub3.anIntArray78;
			Class6_Sub2_Sub2_Sub3.method244(190, 261);
			this.anIntArray262 = Class6_Sub2_Sub2_Sub3.anIntArray78;
			Class6_Sub2_Sub2_Sub3.method244(512, 334);
			this.anIntArray263 = Class6_Sub2_Sub2_Sub3.anIntArray78;
			@Pc(1823) int[] local1823 = new int[9];
			for (local1681 = 0; local1681 < 9; local1681++) {
				local1739 = local1681 * 32 + 128 + 15;
				@Pc(1841) int local1841 = local1739 * 3 + 600;
				@Pc(1845) int local1845 = Class6_Sub2_Sub2_Sub3.anIntArray76[local1739];
				local1823[local1681] = local1841 * local1845 >> 16;
			}
			Class25.method336(local1823);
			Class50.method533(local233);
			this.aClass44_1 = new Class44(true, this);
			this.method582(this.aClass44_1, 10);
			Class6_Sub2_Sub1_Sub2.aClient3 = this;
			Class2.aClient1 = this;
			Class16.aClient4 = this;
		} catch (@Pc(1886) Exception local1886) {
			signlink.reporterror("loaderror " + this.aString17 + " " + this.anInt958);
			this.aBoolean259 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method652() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt980);
			if (this.aClass9_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass9_Sub1_1.anInt83);
			}
			System.out.println("loop-cycle:" + anInt928);
			System.out.println("draw-cycle:" + anInt924);
			System.out.println("ptype:" + this.anInt1009);
			System.out.println("psize:" + this.anInt1008);
			if (this.aClass7_1 != null) {
				this.aClass7_1.method47();
			}
			super.aBoolean213 = true;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("1569, " + 0 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)Ljava/awt/Component;")
	@Override
	protected Component method581() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("36588, " + false + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method653() {
		try {
			this.aClass6_Sub2_Sub2_Sub4_1 = new Class6_Sub2_Sub2_Sub4(this.aClass36_1, "titlebox", 0);
			this.aClass6_Sub2_Sub2_Sub4_2 = new Class6_Sub2_Sub2_Sub4(this.aClass36_1, "titlebutton", 0);
			this.aClass6_Sub2_Sub2_Sub4Array2 = new Class6_Sub2_Sub2_Sub4[12];
			@Pc(25) int local25 = 0;
			try {
				local25 = Integer.parseInt(this.getParameter("fl_icon"));
			} catch (@Pc(39) Exception local39) {
			}
			@Pc(43) int local43;
			if (local25 == 0) {
				for (local43 = 0; local43 < 12; local43++) {
					this.aClass6_Sub2_Sub2_Sub4Array2[local43] = new Class6_Sub2_Sub2_Sub4(this.aClass36_1, "runes", local43);
				}
			} else {
				for (local43 = 0; local43 < 12; local43++) {
					this.aClass6_Sub2_Sub2_Sub4Array2[local43] = new Class6_Sub2_Sub2_Sub4(this.aClass36_1, "runes", (local43 & 0x3) + 12);
				}
			}
			this.aClass6_Sub2_Sub2_Sub1_11 = new Class6_Sub2_Sub2_Sub1(128, 265);
			this.aClass6_Sub2_Sub2_Sub1_12 = new Class6_Sub2_Sub2_Sub1(128, 265);
			for (local43 = 0; local43 < 33920; local43++) {
				this.aClass6_Sub2_Sub2_Sub1_11.anIntArray40[local43] = this.aClass28_15.anIntArray124[local43];
			}
			for (@Pc(119) int local119 = 0; local119 < 33920; local119++) {
				this.aClass6_Sub2_Sub2_Sub1_12.anIntArray40[local119] = this.aClass28_16.anIntArray124[local119];
			}
			this.anIntArray247 = new int[256];
			for (@Pc(141) int local141 = 0; local141 < 64; local141++) {
				this.anIntArray247[local141] = local141 * 262144;
			}
			for (@Pc(156) int local156 = 0; local156 < 64; local156++) {
				this.anIntArray247[local156 + 64] = local156 * 1024 + 16711680;
			}
			for (@Pc(175) int local175 = 0; local175 < 64; local175++) {
				this.anIntArray247[local175 + 128] = local175 * 4 + 16776960;
			}
			for (@Pc(194) int local194 = 0; local194 < 64; local194++) {
				this.anIntArray247[local194 + 192] = 16777215;
			}
			this.anIntArray248 = new int[256];
			for (@Pc(213) int local213 = 0; local213 < 64; local213++) {
				this.anIntArray248[local213] = local213 * 1024;
			}
			for (@Pc(228) int local228 = 0; local228 < 64; local228++) {
				this.anIntArray248[local228 + 64] = local228 * 4 + 65280;
			}
			for (@Pc(247) int local247 = 0; local247 < 64; local247++) {
				this.anIntArray248[local247 + 128] = local247 * 262144 + 65535;
			}
			for (@Pc(266) int local266 = 0; local266 < 64; local266++) {
				this.anIntArray248[local266 + 192] = 16777215;
			}
			this.anIntArray249 = new int[256];
			for (@Pc(285) int local285 = 0; local285 < 64; local285++) {
				this.anIntArray249[local285] = local285 * 4;
			}
			for (@Pc(300) int local300 = 0; local300 < 64; local300++) {
				this.anIntArray249[local300 + 64] = local300 * 262144 + 255;
			}
			for (@Pc(319) int local319 = 0; local319 < 64; local319++) {
				this.anIntArray249[local319 + 128] = local319 * 1024 + 16711935;
			}
			for (@Pc(338) int local338 = 0; local338 < 64; local338++) {
				this.anIntArray249[local338 + 192] = 16777215;
			}
			this.anIntArray246 = new int[256];
			this.anIntArray254 = new int[32768];
			this.anIntArray255 = new int[32768];
			this.method627(null);
			this.anIntArray223 = new int[32768];
			this.anIntArray224 = new int[32768];
			this.method583(10, "Connecting to fileserver");
			if (!this.aBoolean238) {
				this.aBoolean220 = true;
				this.aBoolean238 = true;
				this.method582(this, 2);
			}
		} catch (@Pc(395) RuntimeException local395) {
			signlink.reporterror("96593, " + -576 + ", " + local395.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)Z")
	private boolean method654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(7) int local7 = arg1 >> 14 & 0x7FFF;
			@Pc(25) int local25 = this.aClass25_1.method330(this.anInt1026, arg0, arg2, arg1);
			if (local25 == -1) {
				return false;
			}
			@Pc(34) int local34 = local25 & 0x1F;
			@Pc(40) int local40 = local25 >> 6 & 0x3;
			if (local34 == 10 || local34 == 11 || local34 == 22) {
				@Pc(52) Class2 local52 = Class2.method24(local7);
				@Pc(60) int local60;
				@Pc(63) int local63;
				if (local40 == 0 || local40 == 2) {
					local60 = local52.anInt36;
					local63 = local52.anInt29;
				} else {
					local60 = local52.anInt29;
					local63 = local52.anInt36;
				}
				@Pc(74) int local74 = local52.anInt24;
				if (local40 != 0) {
					local74 = (local74 << local40 & 0xF) + (local74 >> 4 - local40);
				}
				this.method615(arg0, false, local60, local63, 0, aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0], aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0], 0, local74, arg2, 2);
			} else {
				this.method615(arg0, false, 0, 0, local40, aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0], aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0], local34 + 1, 0, arg2, 2);
			}
			this.anInt964 = super.anInt821;
			this.anInt965 = super.anInt822;
			this.anInt967 = 2;
			this.anInt966 = 0;
			return true;
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("93354, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -734 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(JI)V")
	private void method655(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 > 0 && arg0 != 0L) {
				for (@Pc(11) int local11 = 0; local11 < this.anInt891; local11++) {
					if (this.aLongArray4[local11] == arg0) {
						this.anInt891--;
						this.aBoolean252 = true;
						for (@Pc(31) int local31 = local11; local31 < this.anInt891; local31++) {
							this.aLongArray4[local31] = this.aLongArray4[local31 + 1];
						}
						this.aClass6_Sub2_Sub3_7.method391(107);
						this.aClass6_Sub2_Sub3_7.method398(arg0);
						return;
					}
				}
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("70301, " + arg0 + ", " + arg1 + ", " + local66.toString());
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
				return new URL("http://127.0.0.1:" + (anInt866 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method656(@OriginalArg(0) byte arg0) {
		try {
			this.aClass28_21.method356();
			Class6_Sub2_Sub2_Sub3.anIntArray78 = this.anIntArray262;
			this.aClass6_Sub2_Sub2_Sub4_8.method531(0, 0, this.anInt992);
			if (this.anInt1034 != -1) {
				this.method674(0, 0, Class18.aClass18Array1[this.anInt1034], 0);
			} else if (this.anIntArray259[this.anInt836] != -1) {
				this.method674(0, 0, Class18.aClass18Array1[this.anIntArray259[this.anInt836]], 0);
			}
			if (this.aBoolean262 && this.anInt973 == 1) {
				this.method633(this.anInt838);
			}
			this.aClass28_21.method357(205, 553, super.aGraphics2);
			this.aClass28_23.method356();
			Class6_Sub2_Sub2_Sub3.anIntArray78 = this.anIntArray263;
			if (arg0 != 6) {
				this.aClass39ArrayArrayArray1 = null;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("93131, " + arg0 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method657() {
		try {
			@Pc(6) int local6 = this.anInt848 * 128 + 64;
			@Pc(13) int local13 = this.anInt849 * 128 + 64;
			@Pc(24) int local24 = this.method616(local13, local6, this.anInt1026) - this.anInt850;
			if (this.anInt859 < local6) {
				this.anInt859 += this.anInt851 + (local6 - this.anInt859) * this.anInt852 / 1000;
				if (this.anInt859 > local6) {
					this.anInt859 = local6;
				}
			}
			if (this.anInt859 > local6) {
				this.anInt859 -= this.anInt851 + (this.anInt859 - local6) * this.anInt852 / 1000;
				if (this.anInt859 < local6) {
					this.anInt859 = local6;
				}
			}
			if (this.anInt860 < local24) {
				this.anInt860 += this.anInt851 + (local24 - this.anInt860) * this.anInt852 / 1000;
				if (this.anInt860 > local24) {
					this.anInt860 = local24;
				}
			}
			if (this.anInt860 > local24) {
				this.anInt860 -= this.anInt851 + (this.anInt860 - local24) * this.anInt852 / 1000;
				if (this.anInt860 < local24) {
					this.anInt860 = local24;
				}
			}
			if (this.anInt861 < local13) {
				this.anInt861 += this.anInt851 + (local13 - this.anInt861) * this.anInt852 / 1000;
				if (this.anInt861 > local13) {
					this.anInt861 = local13;
				}
			}
			if (this.anInt861 > local13) {
				this.anInt861 -= this.anInt851 + (this.anInt861 - local13) * this.anInt852 / 1000;
				if (this.anInt861 < local13) {
					this.anInt861 = local13;
				}
			}
			local6 = this.anInt898 * 128 + 64;
			local13 = this.anInt899 * 128 + 64;
			local24 = this.method616(local13, local6, this.anInt1026) - this.anInt900;
			@Pc(222) int local222 = local6 - this.anInt859;
			@Pc(227) int local227 = local24 - this.anInt860;
			@Pc(232) int local232 = local13 - this.anInt861;
			@Pc(243) int local243 = (int) Math.sqrt((double) (local222 * local222 + local232 * local232));
			@Pc(254) int local254 = (int) (Math.atan2((double) local227, (double) local243) * 325.949D) & 0x7FF;
			@Pc(274) int local274 = (int) (Math.atan2((double) local222, (double) local232) * -325.949D) & 0x7FF;
			if (local254 < 128) {
				local254 = 128;
			}
			if (local254 > 383) {
				local254 = 383;
			}
			if (this.anInt862 < local254) {
				this.anInt862 += this.anInt901 + (local254 - this.anInt862) * this.anInt902 / 1000;
				if (this.anInt862 > local254) {
					this.anInt862 = local254;
				}
			}
			if (this.anInt862 > local254) {
				this.anInt862 -= this.anInt901 + (this.anInt862 - local254) * this.anInt902 / 1000;
				if (this.anInt862 < local254) {
					this.anInt862 = local254;
				}
			}
			@Pc(345) int local345 = local274 - this.anInt863;
			if (local345 > 1024) {
				local345 -= 2048;
			}
			if (local345 < -1024) {
				local345 += 2048;
			}
			if (local345 > 0) {
				this.anInt863 += this.anInt901 + local345 * this.anInt902 / 1000;
				this.anInt863 &= 0x7FF;
			}
			if (local345 < 0) {
				this.anInt863 -= this.anInt901 + -local345 * this.anInt902 / 1000;
				this.anInt863 &= 0x7FF;
			}
			@Pc(403) int local403 = local274 - this.anInt863;
			if (local403 > 1024) {
				local403 -= 2048;
			}
			if (local403 < -1024) {
				local403 += 2048;
			}
			if (local403 < 0 && local345 > 0 || local403 > 0 && local345 < 0) {
				this.anInt863 = local274;
			}
		} catch (@Pc(424) RuntimeException local424) {
			signlink.reporterror("3288, " + -183 + ", " + local424.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method658() {
		try {
			this.method595(this.anInt979);
			if (this.anInt967 == 1) {
				this.aClass6_Sub2_Sub2_Sub1Array6[this.anInt966 / 100].method137(this.anInt964 - 8 - 4, this.anInt965 - 8 - 4, this.anInt992);
			}
			if (this.anInt967 == 2) {
				this.aClass6_Sub2_Sub2_Sub1Array6[this.anInt966 / 100 + 4].method137(this.anInt964 - 8 - 4, this.anInt965 - 8 - 4, this.anInt992);
			}
			if (this.anInt922 != -1) {
				this.method698(this.anInt922, this.anInt1039);
				this.method674(0, 0, Class18.aClass18Array1[this.anInt922], 0);
			}
			if (this.anInt914 != -1) {
				this.method698(this.anInt914, this.anInt1039);
				this.method674(0, 0, Class18.aClass18Array1[this.anInt914], 0);
			}
			this.method660();
			if (!this.aBoolean262) {
				this.method701();
				this.method682();
			} else if (this.anInt973 == 0) {
				this.method633(this.anInt838);
			}
			if (this.anInt908 == 1) {
				this.aClass6_Sub2_Sub2_Sub1_10.method137(472, 296, this.anInt992);
			}
			@Pc(174) int local174;
			if (aBoolean216) {
				@Pc(150) byte local150 = 20;
				@Pc(152) int local152 = 16776960;
				if (super.anInt810 < 15) {
					local152 = 16711680;
				}
				this.aClass6_Sub2_Sub2_Sub2_3.method159("Fps:" + super.anInt810, local152, 20);
				local174 = local150 + 15;
				@Pc(176) Runtime local176 = Runtime.getRuntime();
				@Pc(185) int local185 = (int) ((local176.totalMemory() - local176.freeMemory()) / 1024L);
				if (local185 > 33554432 && aBoolean223) {
				}
				if (local185 > 67108864 && !aBoolean223) {
				}
				this.aClass6_Sub2_Sub2_Sub2_3.method159("Mem:" + local185 + "k", 16776960, 35);
				local174 += 15;
			}
			if (this.anInt1018 != 0) {
				@Pc(226) int local226 = this.anInt1018 / 50;
				local174 = local226 / 60;
				@Pc(234) int local234 = local226 % 60;
				if (local234 < 10) {
					this.aClass6_Sub2_Sub2_Sub2_3.method164(16776960, 4, 329, "System update in: " + local174 + ":0" + local234);
				} else {
					this.aClass6_Sub2_Sub2_Sub2_3.method164(16776960, 4, 329, "System update in: " + local174 + ":" + local234);
				}
			}
		} catch (@Pc(276) RuntimeException local276) {
			signlink.reporterror("70652, " + -58 + ", " + local276.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!UAWAYCTK;I)V")
	private void method659(@OriginalArg(0) byte arg0, @OriginalArg(1) Class6_Sub2_Sub3 arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(17) int local17 = arg1.method413(8);
			@Pc(23) int local23;
			if (local17 < this.anInt987) {
				for (local23 = local17; local23 < this.anInt987; local23++) {
					this.anIntArray244[this.anInt913++] = this.anIntArray265[local23];
				}
			}
			if (local17 > this.anInt987) {
				signlink.reporterror(this.aString24 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt987 = 0;
			for (local23 = 0; local23 < local17; local23++) {
				@Pc(75) int local75 = this.anIntArray265[local23];
				@Pc(80) Class6_Sub2_Sub1_Sub3_Sub2 local80 = this.aClass6_Sub2_Sub1_Sub3_Sub2Array1[local75];
				@Pc(85) int local85 = arg1.method413(1);
				if (local85 == 0) {
					this.anIntArray265[this.anInt987++] = local75;
					local80.anInt660 = anInt928;
				} else {
					@Pc(108) int local108 = arg1.method413(2);
					if (local108 == 0) {
						this.anIntArray265[this.anInt987++] = local75;
						local80.anInt660 = anInt928;
						this.anIntArray266[this.anInt988++] = local75;
					} else {
						@Pc(159) int local159;
						@Pc(169) int local169;
						if (local108 == 1) {
							this.anIntArray265[this.anInt987++] = local75;
							local80.anInt660 = anInt928;
							local159 = arg1.method413(3);
							local80.method447(12, false, local159);
							local169 = arg1.method413(1);
							if (local169 == 1) {
								this.anIntArray266[this.anInt988++] = local75;
							}
						} else if (local108 == 2) {
							this.anIntArray265[this.anInt987++] = local75;
							local80.anInt660 = anInt928;
							local159 = arg1.method413(3);
							local80.method447(12, true, local159);
							local169 = arg1.method413(3);
							local80.method447(12, true, local169);
							@Pc(227) int local227 = arg1.method413(1);
							if (local227 == 1) {
								this.anIntArray266[this.anInt988++] = local75;
							}
						} else if (local108 == 3) {
							this.anIntArray244[this.anInt913++] = local75;
						}
					}
				}
			}
		} catch (@Pc(264) RuntimeException local264) {
			signlink.reporterror("74773, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local264.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method660() {
		try {
			this.anInt990 = 0;
			@Pc(10) int local10 = (aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt651 >> 7) + this.anInt893;
			@Pc(18) int local18 = (aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt652 >> 7) + this.anInt894;
			if (local10 >= 3053 && local10 <= 3156 && local18 >= 3056 && local18 <= 3136) {
				this.anInt990 = 1;
			}
			if (local10 >= 3072 && local10 <= 3118 && local18 >= 9492 && local18 <= 9535) {
				this.anInt990 = 1;
			}
			if (this.anInt990 == 1 && local10 >= 3139 && local10 <= 3199 && local18 >= 3008 && local18 <= 3062) {
				this.anInt990 = 0;
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("13241, " + 7 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method661() {
		try {
			for (@Pc(6) int local6 = 0; local6 < this.anInt869; local6++) {
				if (this.anIntArray229[local6] <= 0) {
					@Pc(15) boolean local15 = false;
					try {
						if (this.anIntArray267[local6] != this.anInt930 || this.anIntArray241[local6] != this.anInt1023) {
							@Pc(49) Class6_Sub2_Sub3 local49 = Class13.method90(this.anIntArray267[local6], this.anIntArray241[local6]);
							if (System.currentTimeMillis() + (long) (local49.anInt609 / 22) > this.aLong32 + (long) (this.anInt1015 / 22)) {
								this.anInt1015 = local49.anInt609;
								this.aLong32 = System.currentTimeMillis();
								if (this.method603(local49.aByteArray17, local49.anInt609)) {
									this.anInt930 = this.anIntArray267[local6];
									this.anInt1023 = this.anIntArray241[local6];
								} else {
									local15 = true;
								}
							}
						} else if (!this.method672(this.anInt993)) {
							local15 = true;
						}
					} catch (@Pc(99) Exception local99) {
					}
					if (local15 && this.anIntArray229[local6] != -5) {
						this.anIntArray229[local6] = -5;
					} else {
						this.anInt869--;
						for (@Pc(115) int local115 = local6; local115 < this.anInt869; local115++) {
							this.anIntArray267[local115] = this.anIntArray267[local115 + 1];
							this.anIntArray241[local115] = this.anIntArray241[local115 + 1];
							this.anIntArray229[local115] = this.anIntArray229[local115 + 1];
						}
						local6--;
					}
				} else {
					@Pc(167) int local167 = this.anIntArray229[local6]--;
				}
			}
			if (this.anInt870 > 0) {
				this.anInt870 -= 20;
				if (this.anInt870 < 0) {
					this.anInt870 = 0;
				}
				if (this.anInt870 == 0 && this.aBoolean258 && !aBoolean223) {
					this.anInt941 = this.anInt989;
					this.aBoolean236 = true;
					this.aClass9_Sub1_1.method54(2, this.anInt941);
					return;
				}
			}
		} catch (@Pc(213) RuntimeException local213) {
			signlink.reporterror("20700, " + false + ", " + local213.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;II)Lclient!RVLWVPJQ;")
	private Class36 method662(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(3) byte[] local3 = null;
			@Pc(12) int local12 = 5;
			try {
				if (this.aClass21Array1[0] != null) {
					local3 = this.aClass21Array1[0].method287(arg4);
				}
			} catch (@Pc(27) Exception local27) {
			}
			@Pc(41) int local41;
			if (local3 != null) {
				this.aCRC32_2.reset();
				this.aCRC32_2.update(local3);
				local41 = (int) this.aCRC32_2.getValue();
				if (local41 != arg1) {
					local3 = null;
				}
			}
			if (local3 != null) {
				return new Class36(34194, local3);
			}
			local41 = 0;
			while (local3 == null) {
				@Pc(62) String local62 = "Unknown error";
				this.method583(arg2, "Requesting " + arg3);
				@Pc(77) int local77;
				try {
					local77 = 0;
					@Pc(88) DataInputStream local88 = this.method695(arg0 + arg1);
					@Pc(91) byte[] local91 = new byte[6];
					local88.readFully(local91, 0, 6);
					@Pc(102) Class6_Sub2_Sub3 local102 = new Class6_Sub2_Sub3(741, local91);
					local102.anInt609 = 3;
					@Pc(110) int local110 = local102.method406() + 6;
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
							this.method583(arg2, "Loading " + arg3 + " - " + local175 + "%");
						}
						local77 = local175;
					}
					local88.close();
					try {
						if (this.aClass21Array1[0] != null) {
							this.aClass21Array1[0].method288(arg4, this.anInt918, local3.length, local3);
						}
					} catch (@Pc(221) Exception local221) {
						this.aClass21Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local3);
						local135 = (int) this.aCRC32_2.getValue();
						if (local135 != arg1) {
							local3 = null;
							local41++;
							local62 = "Checksum error: " + local135;
						}
					}
				} catch (@Pc(256) IOException local256) {
					if (local62.equals("Unknown error")) {
						local62 = "Connection error";
					}
					local3 = null;
				} catch (@Pc(266) NullPointerException local266) {
					local62 = "Null error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(275) ArrayIndexOutOfBoundsException local275) {
					local62 = "Bounds error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(284) Exception local284) {
					local62 = "Unexpected error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local3 == null) {
					for (local77 = local12; local77 > 0; local77--) {
						if (local41 >= 3) {
							this.method583(arg2, "Game updated - please reload page");
							local77 = 10;
						} else {
							this.method583(arg2, local62 + " - Retrying in " + local77);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(328) Exception local328) {
						}
					}
					local12 *= 2;
					if (local12 > 60) {
						local12 = 60;
					}
					this.aBoolean219 = !this.aBoolean219;
				}
			}
			return new Class36(34194, local3);
		} catch (@Pc(360) RuntimeException local360) {
			signlink.reporterror("34921, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -378 + ", " + local360.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)Z")
	private boolean method663() {
		try {
			if (this.aClass7_1 == null) {
				return false;
			}
			@Pc(2439) String local2439;
			@Pc(220) int local220;
			try {
				@Pc(16) int local16 = this.aClass7_1.method44();
				if (local16 == 0) {
					return false;
				}
				if (this.anInt1009 == -1) {
					this.aClass7_1.method45(this.aClass6_Sub2_Sub3_8.aByteArray17, 0, 1);
					this.anInt1009 = this.aClass6_Sub2_Sub3_8.aByteArray17[0] & 0xFF;
					if (this.aClass45_2 != null) {
						this.anInt1009 = this.anInt1009 - this.aClass45_2.method476() & 0xFF;
					}
					this.anInt1008 = Class30.anIntArray128[this.anInt1009];
					local16--;
				}
				if (this.anInt1008 == -1) {
					if (local16 <= 0) {
						return false;
					}
					this.aClass7_1.method45(this.aClass6_Sub2_Sub3_8.aByteArray17, 0, 1);
					this.anInt1008 = this.aClass6_Sub2_Sub3_8.aByteArray17[0] & 0xFF;
					local16--;
				}
				if (this.anInt1008 == -2) {
					if (local16 <= 1) {
						return false;
					}
					this.aClass7_1.method45(this.aClass6_Sub2_Sub3_8.aByteArray17, 0, 2);
					this.aClass6_Sub2_Sub3_8.anInt609 = 0;
					this.anInt1008 = this.aClass6_Sub2_Sub3_8.method404();
					local16 -= 2;
				}
				if (local16 < this.anInt1008) {
					return false;
				}
				this.aClass6_Sub2_Sub3_8.anInt609 = 0;
				this.aClass7_1.method45(this.aClass6_Sub2_Sub3_8.aByteArray17, 0, this.anInt1008);
				this.anInt1010 = 0;
				this.anInt951 = this.anInt950;
				this.anInt950 = this.anInt949;
				this.anInt949 = this.anInt1009;
				if (this.anInt1009 == 203) {
					this.anInt907 = this.aClass6_Sub2_Sub3_8.method404();
					this.anInt940 = this.aClass6_Sub2_Sub3_8.method438();
					this.anInt921 = this.aClass6_Sub2_Sub3_8.method423();
					this.anInt1005 = this.aClass6_Sub2_Sub3_8.method429();
					this.anInt984 = this.aClass6_Sub2_Sub3_8.method421();
					if (this.anInt940 != 0 && this.anInt914 == -1) {
						signlink.dnslookup(Class42.method467(this.anInt940));
						this.method687();
						@Pc(202) short local202 = 650;
						if (this.anInt984 != 201 || this.anInt921 == 1) {
							local202 = 655;
						}
						this.aString28 = "";
						this.aBoolean254 = false;
						for (local220 = 0; local220 < Class18.aClass18Array1.length; local220++) {
							if (Class18.aClass18Array1[local220] != null && Class18.aClass18Array1[local220].anInt383 == local202) {
								this.anInt914 = Class18.aClass18Array1[local220].anInt369;
								break;
							}
						}
					}
					this.anInt1009 = -1;
					return true;
				}
				@Pc(266) int local266;
				@Pc(258) int local258;
				@Pc(270) int local270;
				if (this.anInt1009 == 250) {
					local258 = this.aClass6_Sub2_Sub3_8.method402();
					local220 = this.aClass6_Sub2_Sub3_8.method402();
					local266 = this.aClass6_Sub2_Sub3_8.method402();
					local270 = this.aClass6_Sub2_Sub3_8.method402();
					this.aBooleanArray11[local258] = true;
					this.anIntArray270[local258] = local220;
					this.anIntArray250[local258] = local266;
					this.anIntArray258[local258] = local270;
					this.anIntArray260[local258] = 0;
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 57) {
					if (this.anInt836 == 12) {
						this.aBoolean252 = true;
					}
					this.anInt853 = this.aClass6_Sub2_Sub3_8.method405();
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 198) {
					this.anInt904 = this.aClass6_Sub2_Sub3_8.method423();
					if (this.anInt904 == this.anInt836) {
						if (this.anInt904 == 3) {
							this.anInt836 = 1;
						} else {
							this.anInt836 = 3;
						}
						this.aBoolean252 = true;
					}
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 116 || this.anInt1009 == 177 || this.anInt1009 == 147 || this.anInt1009 == 155 || this.anInt1009 == 126 || this.anInt1009 == 137 || this.anInt1009 == 105 || this.anInt1009 == 113 || this.anInt1009 == 170 || this.anInt1009 == 234 || this.anInt1009 == 217) {
					this.method668(this.anInt1009, this.aClass6_Sub2_Sub3_8);
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 140) {
					this.anInt908 = this.aClass6_Sub2_Sub3_8.method402();
					this.anInt1009 = -1;
					return true;
				}
				@Pc(456) int local456;
				if (this.anInt1009 == 136) {
					local258 = this.aClass6_Sub2_Sub3_8.method429();
					local220 = this.aClass6_Sub2_Sub3_8.method429();
					local266 = local220 >> 10 & 0x1F;
					local270 = local220 >> 5 & 0x1F;
					local456 = local220 & 0x1F;
					Class18.aClass18Array1[local258].anInt393 = (local266 << 19) + (local270 << 11) + (local456 << 3);
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 131) {
					this.anInt836 = this.aClass6_Sub2_Sub3_8.method402();
					this.aBoolean252 = true;
					this.aBoolean247 = true;
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 158) {
					this.aBoolean234 = false;
					this.anInt1035 = 2;
					this.aString23 = "";
					this.aBoolean239 = true;
					this.anInt1009 = -1;
					return true;
				}
				@Pc(577) int local577;
				@Pc(879) int local879;
				@Pc(900) int local900;
				if (this.anInt1009 == 36 || this.anInt1009 == 62) {
					local258 = this.anInt1032;
					local220 = this.anInt1033;
					if (this.anInt1009 == 36) {
						local220 = this.aClass6_Sub2_Sub3_8.method404();
						local258 = this.aClass6_Sub2_Sub3_8.method430();
						this.aBoolean253 = false;
					}
					if (this.anInt1009 == 62) {
						local258 = this.aClass6_Sub2_Sub3_8.method404();
						this.aClass6_Sub2_Sub3_8.method412();
						local266 = 0;
						while (true) {
							if (local266 >= 4) {
								this.aClass6_Sub2_Sub3_8.method414();
								local220 = this.aClass6_Sub2_Sub3_8.method430();
								this.aBoolean253 = true;
								break;
							}
							for (local270 = 0; local270 < 13; local270++) {
								for (local456 = 0; local456 < 13; local456++) {
									local577 = this.aClass6_Sub2_Sub3_8.method413(1);
									if (local577 == 1) {
										this.anIntArrayArrayArray8[local266][local270][local456] = this.aClass6_Sub2_Sub3_8.method413(26);
									} else {
										this.anIntArrayArrayArray8[local266][local270][local456] = -1;
									}
								}
							}
							local266++;
						}
					}
					if (this.anInt1032 == local258 && this.anInt1033 == local220 && this.anInt978 == 2) {
						this.anInt1009 = -1;
						return true;
					}
					this.anInt1032 = local258;
					this.anInt1033 = local220;
					this.anInt893 = (this.anInt1032 - 6) * 8;
					this.anInt894 = (this.anInt1033 - 6) * 8;
					this.aBoolean218 = false;
					if ((this.anInt1032 / 8 == 48 || this.anInt1032 / 8 == 49) && this.anInt1033 / 8 == 48) {
						this.aBoolean218 = true;
					}
					if (this.anInt1032 / 8 == 48 && this.anInt1033 / 8 == 148) {
						this.aBoolean218 = true;
					}
					this.anInt978 = 1;
					this.aLong30 = System.currentTimeMillis();
					this.aClass28_23.method356();
					this.aClass6_Sub2_Sub2_Sub2_3.method160(151, 257, "Loading - please wait.", 0);
					this.aClass6_Sub2_Sub2_Sub2_3.method160(150, 256, "Loading - please wait.", 16777215);
					this.aClass28_23.method357(4, 4, super.aGraphics2);
					if (this.anInt1009 == 36) {
						local266 = 0;
						local270 = (this.anInt1032 - 6) / 8;
						label1187: while (true) {
							if (local270 > (this.anInt1032 + 6) / 8) {
								this.aByteArrayArray4 = new byte[local266][];
								this.aByteArrayArray5 = new byte[local266][];
								this.anIntArray236 = new int[local266];
								this.anIntArray237 = new int[local266];
								this.anIntArray238 = new int[local266];
								local266 = 0;
								local456 = (this.anInt1032 - 6) / 8;
								while (true) {
									if (local456 > (this.anInt1032 + 6) / 8) {
										break label1187;
									}
									for (local577 = (this.anInt1033 - 6) / 8; local577 <= (this.anInt1033 + 6) / 8; local577++) {
										this.anIntArray236[local266] = (local456 << 8) + local577;
										if (this.aBoolean218 && (local577 == 49 || local577 == 149 || local577 == 147 || local456 == 50 || local456 == 49 && local577 == 47)) {
											this.anIntArray237[local266] = -1;
											this.anIntArray238[local266] = -1;
											local266++;
										} else {
											local879 = this.anIntArray237[local266] = this.aClass9_Sub1_1.method68(local577, 0, local456);
											if (local879 != -1) {
												this.aClass9_Sub1_1.method54(3, local879);
											}
											local900 = this.anIntArray238[local266] = this.aClass9_Sub1_1.method68(local577, 1, local456);
											if (local900 != -1) {
												this.aClass9_Sub1_1.method54(3, local900);
											}
											local266++;
										}
									}
									local456++;
								}
							}
							for (local456 = (this.anInt1033 - 6) / 8; local456 <= (this.anInt1033 + 6) / 8; local456++) {
								local266++;
							}
							local270++;
						}
					}
					if (this.anInt1009 == 62) {
						local266 = 0;
						@Pc(936) int[] local936 = new int[676];
						local456 = 0;
						label1148: while (true) {
							@Pc(982) int local982;
							@Pc(966) int local966;
							@Pc(972) int local972;
							if (local456 >= 4) {
								this.aByteArrayArray4 = new byte[local266][];
								this.aByteArrayArray5 = new byte[local266][];
								this.anIntArray236 = new int[local266];
								this.anIntArray237 = new int[local266];
								this.anIntArray238 = new int[local266];
								local577 = 0;
								while (true) {
									if (local577 >= local266) {
										break label1148;
									}
									local879 = this.anIntArray236[local577] = local936[local577];
									local900 = local879 >> 8 & 0xFF;
									local966 = local879 & 0xFF;
									local972 = this.anIntArray237[local577] = this.aClass9_Sub1_1.method68(local966, 0, local900);
									if (local972 != -1) {
										this.aClass9_Sub1_1.method54(3, local972);
									}
									local982 = this.anIntArray238[local577] = this.aClass9_Sub1_1.method68(local966, 1, local900);
									if (local982 != -1) {
										this.aClass9_Sub1_1.method54(3, local982);
									}
									local577++;
								}
							}
							for (local577 = 0; local577 < 13; local577++) {
								for (local879 = 0; local879 < 13; local879++) {
									local900 = this.anIntArrayArrayArray8[local456][local577][local879];
									if (local900 != -1) {
										local966 = local900 >> 14 & 0x3FF;
										local972 = local900 >> 3 & 0x7FF;
										local982 = (local966 / 8 << 8) + local972 / 8;
										for (@Pc(984) int local984 = 0; local984 < local266; local984++) {
											if (local936[local984] == local982) {
												local982 = -1;
												break;
											}
										}
										if (local982 != -1) {
											local936[local266++] = local982;
										}
									}
								}
							}
							local456++;
						}
					}
					local266 = this.anInt893 - this.anInt895;
					local270 = this.anInt894 - this.anInt896;
					this.anInt895 = this.anInt893;
					this.anInt896 = this.anInt894;
					for (local456 = 0; local456 < 16384; local456++) {
						@Pc(1137) Class6_Sub2_Sub1_Sub3_Sub1 local1137 = this.aClass6_Sub2_Sub1_Sub3_Sub1Array1[local456];
						if (local1137 != null) {
							for (local879 = 0; local879 < 10; local879++) {
								local1137.anIntArray143[local879] -= local266;
								local1137.anIntArray144[local879] -= local270;
							}
							local1137.anInt651 -= local266 * 128;
							local1137.anInt652 -= local270 * 128;
						}
					}
					for (local577 = 0; local577 < this.anInt985; local577++) {
						@Pc(1192) Class6_Sub2_Sub1_Sub3_Sub2 local1192 = this.aClass6_Sub2_Sub1_Sub3_Sub2Array1[local577];
						if (local1192 != null) {
							for (local900 = 0; local900 < 10; local900++) {
								local1192.anIntArray143[local900] -= local266;
								local1192.anIntArray144[local900] -= local270;
							}
							local1192.anInt651 -= local266 * 128;
							local1192.anInt652 -= local270 * 128;
						}
					}
					this.aBoolean229 = true;
					@Pc(1244) byte local1244 = 0;
					@Pc(1246) byte local1246 = 104;
					@Pc(1248) byte local1248 = 1;
					if (local266 < 0) {
						local1244 = 103;
						local1246 = -1;
						local1248 = -1;
					}
					@Pc(1258) byte local1258 = 0;
					@Pc(1260) byte local1260 = 104;
					@Pc(1262) byte local1262 = 1;
					if (local270 < 0) {
						local1258 = 103;
						local1260 = -1;
						local1262 = -1;
					}
					for (@Pc(1272) int local1272 = local1244; local1272 != local1246; local1272 += local1248) {
						for (@Pc(1276) int local1276 = local1258; local1276 != local1260; local1276 += local1262) {
							@Pc(1282) int local1282 = local1272 + local266;
							@Pc(1286) int local1286 = local1276 + local270;
							for (@Pc(1288) int local1288 = 0; local1288 < 4; local1288++) {
								if (local1282 >= 0 && local1286 >= 0 && local1282 < 104 && local1286 < 104) {
									this.aClass39ArrayArrayArray1[local1288][local1272][local1276] = this.aClass39ArrayArrayArray1[local1288][local1282][local1286];
								} else {
									this.aClass39ArrayArrayArray1[local1288][local1272][local1276] = null;
								}
							}
						}
					}
					for (@Pc(1350) Class6_Sub1 local1350 = (Class6_Sub1) this.aClass39_12.method459(); local1350 != null; local1350 = (Class6_Sub1) this.aClass39_12.method461()) {
						local1350.anInt66 -= local266;
						local1350.anInt67 -= local270;
						if (local1350.anInt66 < 0 || local1350.anInt67 < 0 || local1350.anInt66 >= 104 || local1350.anInt67 >= 104) {
							local1350.method512();
						}
					}
					if (this.anInt954 != 0) {
						this.anInt954 -= local266;
						this.anInt955 -= local270;
					}
					this.aBoolean228 = false;
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 90) {
					this.anInt960 = this.aClass6_Sub2_Sub3_8.method402();
					if (this.anInt960 == 1) {
						this.anInt903 = this.aClass6_Sub2_Sub3_8.method404();
					}
					if (this.anInt960 >= 2 && this.anInt960 <= 6) {
						if (this.anInt960 == 2) {
							this.anInt882 = 64;
							this.anInt883 = 64;
						}
						if (this.anInt960 == 3) {
							this.anInt882 = 0;
							this.anInt883 = 64;
						}
						if (this.anInt960 == 4) {
							this.anInt882 = 128;
							this.anInt883 = 64;
						}
						if (this.anInt960 == 5) {
							this.anInt882 = 64;
							this.anInt883 = 0;
						}
						if (this.anInt960 == 6) {
							this.anInt882 = 64;
							this.anInt883 = 128;
						}
						this.anInt960 = 2;
						this.anInt879 = this.aClass6_Sub2_Sub3_8.method404();
						this.anInt880 = this.aClass6_Sub2_Sub3_8.method404();
						this.anInt881 = this.aClass6_Sub2_Sub3_8.method402();
					}
					if (this.anInt960 == 10) {
						this.anInt933 = this.aClass6_Sub2_Sub3_8.method404();
					}
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 31) {
					local258 = this.aClass6_Sub2_Sub3_8.method405();
					local220 = this.aClass6_Sub2_Sub3_8.method433();
					local266 = this.aClass6_Sub2_Sub3_8.method404();
					@Pc(1540) Class18 local1540 = Class18.aClass18Array1[local266];
					local1540.anInt370 = local258;
					local1540.anInt372 = local220;
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 190) {
					local258 = this.aClass6_Sub2_Sub3_8.method431();
					local220 = this.aClass6_Sub2_Sub3_8.method431();
					Class18.aClass18Array1[local258].anInt361 = 1;
					Class18.aClass18Array1[local258].anInt362 = local220;
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 132) {
					local258 = this.aClass6_Sub2_Sub3_8.method404();
					local220 = this.aClass6_Sub2_Sub3_8.method430();
					local266 = this.aClass6_Sub2_Sub3_8.method430();
					Class18.aClass18Array1[local266].anInt367 = (local258 << 16) + local220;
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 0) {
					this.anInt982 = this.aClass6_Sub2_Sub3_8.method402();
					this.aBoolean252 = true;
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 8) {
					local258 = this.aClass6_Sub2_Sub3_8.method431();
					local220 = this.aClass6_Sub2_Sub3_8.method437(506);
					this.anIntArray251[local258] = local220;
					if (this.anIntArray240[local258] != local220) {
						this.anIntArray240[local258] = local220;
						this.method709(this.aByte33, local258);
						this.aBoolean252 = true;
						if (this.anInt837 != -1) {
							this.aBoolean239 = true;
						}
					}
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 161) {
					this.method681(this.aClass6_Sub2_Sub3_8, this.anInt1008);
					this.aBoolean229 = false;
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 2) {
					this.aBoolean234 = false;
					this.anInt1035 = 1;
					this.aString23 = "";
					this.aBoolean239 = true;
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 75) {
					this.anInt946 = this.aClass6_Sub2_Sub3_8.method402();
					this.anInt947 = this.aClass6_Sub2_Sub3_8.method421();
					for (local258 = this.anInt946; local258 < this.anInt946 + 8; local258++) {
						for (local220 = this.anInt947; local220 < this.anInt947 + 8; local220++) {
							if (this.aClass39ArrayArrayArray1[this.anInt1026][local258][local220] != null) {
								this.aClass39ArrayArrayArray1[this.anInt1026][local258][local220] = null;
								this.method610(local258, local220);
							}
						}
					}
					for (@Pc(1786) Class6_Sub1 local1786 = (Class6_Sub1) this.aClass39_12.method459(); local1786 != null; local1786 = (Class6_Sub1) this.aClass39_12.method461()) {
						if (local1786.anInt66 >= this.anInt946 && local1786.anInt66 < this.anInt946 + 8 && local1786.anInt67 >= this.anInt947 && local1786.anInt67 < this.anInt947 + 8 && local1786.anInt64 == this.anInt1026) {
							local1786.anInt62 = 0;
						}
					}
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 145) {
					this.aBoolean228 = true;
					this.anInt848 = this.aClass6_Sub2_Sub3_8.method402();
					this.anInt849 = this.aClass6_Sub2_Sub3_8.method402();
					this.anInt850 = this.aClass6_Sub2_Sub3_8.method404();
					this.anInt851 = this.aClass6_Sub2_Sub3_8.method402();
					this.anInt852 = this.aClass6_Sub2_Sub3_8.method402();
					if (this.anInt852 >= 100) {
						this.anInt859 = this.anInt848 * 128 + 64;
						this.anInt861 = this.anInt849 * 128 + 64;
						this.anInt860 = this.method616(this.anInt861, this.anInt859, this.anInt1026) - this.anInt850;
					}
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 12) {
					local258 = this.aClass6_Sub2_Sub3_8.method431();
					this.method680(local258);
					this.anInt914 = -1;
					this.anInt1034 = -1;
					this.anInt923 = -1;
					this.anInt1035 = 0;
					this.aBoolean255 = false;
					this.anInt1020 = local258;
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 35) {
					this.anInt1027 = this.aClass6_Sub2_Sub3_8.method402();
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 168) {
					this.aBoolean228 = false;
					for (local258 = 0; local258 < 5; local258++) {
						this.aBooleanArray11[local258] = false;
					}
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 253) {
					this.anInt954 = 0;
					this.anInt1009 = -1;
					return true;
				}
				@Pc(2006) Class18 local2006;
				if (this.anInt1009 == 207) {
					this.aBoolean252 = true;
					local258 = this.aClass6_Sub2_Sub3_8.method404();
					local2006 = Class18.aClass18Array1[local258];
					while (this.aClass6_Sub2_Sub3_8.anInt609 < this.anInt1008) {
						local266 = this.aClass6_Sub2_Sub3_8.method416();
						local270 = this.aClass6_Sub2_Sub3_8.method404();
						local456 = this.aClass6_Sub2_Sub3_8.method402();
						if (local456 == 255) {
							local456 = this.aClass6_Sub2_Sub3_8.method407();
						}
						if (local266 >= 0 && local266 < local2006.anIntArray88.length) {
							local2006.anIntArray88[local266] = local270;
							local2006.anIntArray83[local266] = local456;
						}
					}
					this.anInt1009 = -1;
					return true;
				}
				@Pc(2074) boolean local2074;
				@Pc(2143) String local2143;
				@Pc(2064) long local2064;
				if (this.anInt1009 == 247) {
					local2064 = this.aClass6_Sub2_Sub3_8.method408();
					local266 = this.aClass6_Sub2_Sub3_8.method407();
					local270 = this.aClass6_Sub2_Sub3_8.method402();
					local2074 = false;
					for (local577 = 0; local577 < 100; local577++) {
						if (this.anIntArray252[local577] == local266) {
							local2074 = true;
							break;
						}
					}
					if (local270 <= 1) {
						for (local879 = 0; local879 < this.anInt891; local879++) {
							if (this.aLongArray4[local879] == local2064) {
								local2074 = true;
								break;
							}
						}
					}
					if (!local2074 && this.anInt990 == 0) {
						try {
							this.anIntArray252[this.anInt826] = local266;
							this.anInt826 = (this.anInt826 + 1) % 100;
							local2143 = Class4.method37(this.aClass6_Sub2_Sub3_8, this.anInt1008 - 13);
							if (local270 != 3) {
								local2143 = Class50.method543(76, local2143);
							}
							if (local270 == 2 || local270 == 3) {
								this.method648("@cr2@" + Class42.method468(Class42.method465(this.anInt1019, local2064)), local2143, 7, this.aBoolean235);
							} else if (local270 == 1) {
								this.method648("@cr1@" + Class42.method468(Class42.method465(this.anInt1019, local2064)), local2143, 7, this.aBoolean235);
							} else {
								this.method648(Class42.method468(Class42.method465(this.anInt1019, local2064)), local2143, 3, this.aBoolean235);
							}
						} catch (@Pc(2213) Exception local2213) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 19) {
					for (local258 = 0; local258 < this.anIntArray240.length; local258++) {
						if (this.anIntArray240[local258] != this.anIntArray251[local258]) {
							this.anIntArray240[local258] = this.anIntArray251[local258];
							this.method709(this.aByte33, local258);
							this.aBoolean252 = true;
						}
					}
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 25) {
					local258 = this.aClass6_Sub2_Sub3_8.method405();
					if (local258 >= 0) {
						this.method680(local258);
					}
					this.anInt922 = local258;
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 58) {
					this.method692(this.aClass6_Sub2_Sub3_8, this.anInt1008, 160);
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 72) {
					@Pc(2317) boolean local2317 = this.aClass6_Sub2_Sub3_8.method421() == 1;
					local220 = this.aClass6_Sub2_Sub3_8.method429();
					Class18.aClass18Array1[local220].aBoolean117 = local2317;
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 11) {
					this.anInt943 = this.aClass6_Sub2_Sub3_8.method430();
					this.anInt942 = this.aClass6_Sub2_Sub3_8.method423();
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 135) {
					this.aBoolean252 = true;
					local258 = this.aClass6_Sub2_Sub3_8.method404();
					local2006 = Class18.aClass18Array1[local258];
					local266 = this.aClass6_Sub2_Sub3_8.method404();
					for (local270 = 0; local270 < local266; local270++) {
						local2006.anIntArray88[local270] = this.aClass6_Sub2_Sub3_8.method430();
						local456 = this.aClass6_Sub2_Sub3_8.method422();
						if (local456 == 255) {
							local456 = this.aClass6_Sub2_Sub3_8.method436();
						}
						local2006.anIntArray83[local270] = local456;
					}
					for (local456 = local266; local456 < local2006.anIntArray88.length; local456++) {
						local2006.anIntArray88[local456] = 0;
						local2006.anIntArray83[local456] = 0;
					}
					this.anInt1009 = -1;
					return true;
				}
				@Pc(2450) String local2450;
				if (this.anInt1009 == 193) {
					local2439 = this.aClass6_Sub2_Sub3_8.method409();
					@Pc(2453) long local2453;
					if (local2439.endsWith(":tradereq:")) {
						local2450 = local2439.substring(0, local2439.indexOf(":"));
						local2453 = Class42.method464(local2450);
						local2074 = false;
						for (local577 = 0; local577 < this.anInt891; local577++) {
							if (this.aLongArray4[local577] == local2453) {
								local2074 = true;
								break;
							}
						}
						if (!local2074 && this.anInt990 == 0) {
							this.method648(local2450, "wishes to trade with you.", 4, this.aBoolean235);
						}
					} else if (local2439.endsWith(":duelreq:")) {
						local2450 = local2439.substring(0, local2439.indexOf(":"));
						local2453 = Class42.method464(local2450);
						local2074 = false;
						for (local577 = 0; local577 < this.anInt891; local577++) {
							if (this.aLongArray4[local577] == local2453) {
								local2074 = true;
								break;
							}
						}
						if (!local2074 && this.anInt990 == 0) {
							this.method648(local2450, "wishes to duel with you.", 8, this.aBoolean235);
						}
					} else if (local2439.endsWith(":chalreq:")) {
						local2450 = local2439.substring(0, local2439.indexOf(":"));
						local2453 = Class42.method464(local2450);
						local2074 = false;
						for (local577 = 0; local577 < this.anInt891; local577++) {
							if (this.aLongArray4[local577] == local2453) {
								local2074 = true;
								break;
							}
						}
						if (!local2074 && this.anInt990 == 0) {
							local2143 = local2439.substring(local2439.indexOf(":") + 1, local2439.length() - 9);
							this.method648(local2450, local2143, 8, this.aBoolean235);
						}
					} else {
						this.method648("", local2439, 0, this.aBoolean235);
					}
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 182) {
					@Pc(2623) byte local2623 = this.aClass6_Sub2_Sub3_8.method424(this.anInt889);
					local220 = this.aClass6_Sub2_Sub3_8.method431();
					this.anIntArray251[local220] = local2623;
					if (this.anIntArray240[local220] != local2623) {
						this.anIntArray240[local220] = local2623;
						this.method709(this.aByte33, local220);
						this.aBoolean252 = true;
						if (this.anInt837 != -1) {
							this.aBoolean239 = true;
						}
					}
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 187) {
					this.anInt946 = this.aClass6_Sub2_Sub3_8.method402();
					this.anInt947 = this.aClass6_Sub2_Sub3_8.method422();
					while (this.aClass6_Sub2_Sub3_8.anInt609 < this.anInt1008) {
						local258 = this.aClass6_Sub2_Sub3_8.method402();
						this.method668(local258, this.aClass6_Sub2_Sub3_8);
					}
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 178) {
					local258 = this.aClass6_Sub2_Sub3_8.method404();
					local220 = this.aClass6_Sub2_Sub3_8.method429();
					if (this.anInt923 != -1) {
						this.anInt923 = -1;
						this.aBoolean239 = true;
					}
					if (this.anInt1035 != 0) {
						this.anInt1035 = 0;
						this.aBoolean239 = true;
					}
					this.anInt914 = local258;
					this.anInt1034 = local220;
					this.aBoolean252 = true;
					this.aBoolean247 = true;
					this.aBoolean255 = false;
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 205) {
					for (local258 = 0; local258 < this.aClass6_Sub2_Sub1_Sub3_Sub2Array1.length; local258++) {
						if (this.aClass6_Sub2_Sub1_Sub3_Sub2Array1[local258] != null) {
							this.aClass6_Sub2_Sub1_Sub3_Sub2Array1[local258].anInt616 = -1;
						}
					}
					for (local220 = 0; local220 < this.aClass6_Sub2_Sub1_Sub3_Sub1Array1.length; local220++) {
						if (this.aClass6_Sub2_Sub1_Sub3_Sub1Array1[local220] != null) {
							this.aClass6_Sub2_Sub1_Sub3_Sub1Array1[local220].anInt616 = -1;
						}
					}
					this.anInt1009 = -1;
					return true;
				}
				@Pc(2823) Class18 local2823;
				if (this.anInt1009 == 33) {
					local258 = this.aClass6_Sub2_Sub3_8.method431();
					local220 = this.aClass6_Sub2_Sub3_8.method433();
					local2823 = Class18.aClass18Array1[local258];
					if (local2823.anInt384 != local220 || local220 == -1) {
						local2823.anInt384 = local220;
						local2823.anInt390 = 0;
						local2823.anInt392 = 0;
					}
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 39) {
					local258 = this.aClass6_Sub2_Sub3_8.method430();
					local220 = this.aClass6_Sub2_Sub3_8.method404();
					local266 = this.aClass6_Sub2_Sub3_8.method404();
					local270 = this.aClass6_Sub2_Sub3_8.method429();
					Class18.aClass18Array1[local266].anInt379 = local270;
					Class18.aClass18Array1[local266].anInt380 = local258;
					Class18.aClass18Array1[local266].anInt378 = local220;
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 91) {
					this.anInt891 = this.anInt1008 / 8;
					for (local258 = 0; local258 < this.anInt891; local258++) {
						this.aLongArray4[local258] = this.aClass6_Sub2_Sub3_8.method408();
					}
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 38) {
					local258 = this.aClass6_Sub2_Sub3_8.method429();
					local220 = this.aClass6_Sub2_Sub3_8.method430();
					Class18.aClass18Array1[local220].anInt361 = 2;
					Class18.aClass18Array1[local220].anInt362 = local258;
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 87) {
					local258 = this.aClass6_Sub2_Sub3_8.method429();
					this.method680(local258);
					if (this.anInt923 != -1) {
						this.anInt923 = -1;
						this.aBoolean239 = true;
					}
					if (this.anInt1035 != 0) {
						this.anInt1035 = 0;
						this.aBoolean239 = true;
					}
					if (this.anInt1020 != -1) {
						this.anInt1020 = -1;
						this.aBoolean240 = true;
					}
					this.anInt1034 = local258;
					this.aBoolean252 = true;
					this.aBoolean247 = true;
					this.anInt914 = -1;
					this.aBoolean255 = false;
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 184) {
					local2064 = this.aClass6_Sub2_Sub3_8.method408();
					local266 = this.aClass6_Sub2_Sub3_8.method402();
					@Pc(3029) String local3029 = Class42.method468(Class42.method465(this.anInt1019, local2064));
					for (local456 = 0; local456 < this.anInt981; local456++) {
						if (local2064 == this.aLongArray3[local456]) {
							if (this.anIntArray225[local456] != local266) {
								this.anIntArray225[local456] = local266;
								this.aBoolean252 = true;
								if (local266 > 0) {
									this.method648("", local3029 + " has logged in.", 5, this.aBoolean235);
								}
								if (local266 == 0) {
									this.method648("", local3029 + " has logged out.", 5, this.aBoolean235);
								}
							}
							local3029 = null;
							break;
						}
					}
					if (local3029 != null && this.anInt981 < 200) {
						this.aLongArray3[this.anInt981] = local2064;
						this.aStringArray13[this.anInt981] = local3029;
						this.anIntArray225[this.anInt981] = local266;
						this.anInt981++;
						this.aBoolean252 = true;
					}
					@Pc(3129) boolean local3129 = false;
					while (!local3129) {
						local3129 = true;
						for (local879 = 0; local879 < this.anInt981 - 1; local879++) {
							if (this.anIntArray225[local879] != anInt865 && this.anIntArray225[local879 + 1] == anInt865 || this.anIntArray225[local879] == 0 && this.anIntArray225[local879 + 1] != 0) {
								local900 = this.anIntArray225[local879];
								this.anIntArray225[local879] = this.anIntArray225[local879 + 1];
								this.anIntArray225[local879 + 1] = local900;
								@Pc(3190) String local3190 = this.aStringArray13[local879];
								this.aStringArray13[local879] = this.aStringArray13[local879 + 1];
								this.aStringArray13[local879 + 1] = local3190;
								@Pc(3212) long local3212 = this.aLongArray3[local879];
								this.aLongArray3[local879] = this.aLongArray3[local879 + 1];
								this.aLongArray3[local879 + 1] = local3212;
								this.aBoolean252 = true;
								local3129 = false;
							}
						}
					}
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 189) {
					this.anInt1036 = this.aClass6_Sub2_Sub3_8.method402();
					this.anInt934 = this.aClass6_Sub2_Sub3_8.method402();
					this.anInt1006 = this.aClass6_Sub2_Sub3_8.method402();
					this.aBoolean248 = true;
					this.aBoolean239 = true;
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 220) {
					local258 = this.aClass6_Sub2_Sub3_8.method429();
					Class18.aClass18Array1[local258].anInt361 = 3;
					if (aClass6_Sub2_Sub1_Sub3_Sub2_1.aClass16_2 == null) {
						Class18.aClass18Array1[local258].anInt362 = (aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray149[0] << 25) + (aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray149[4] << 20) + (aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray148[0] << 15) + (aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray148[8] << 10) + (aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray148[11] << 5) + aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray148[1];
					} else {
						Class18.aClass18Array1[local258].anInt362 = (int) (aClass6_Sub2_Sub1_Sub3_Sub2_1.aClass16_2.aLong13 + 305419896L);
					}
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 238) {
					this.anInt1018 = this.aClass6_Sub2_Sub3_8.method430() * 30;
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 4) {
					this.anInt947 = this.aClass6_Sub2_Sub3_8.method423();
					this.anInt946 = this.aClass6_Sub2_Sub3_8.method402();
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 197) {
					local258 = this.aClass6_Sub2_Sub3_8.method432();
					this.anInt837 = local258;
					this.aBoolean239 = true;
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 77) {
					local258 = this.aClass6_Sub2_Sub3_8.method404();
					local220 = this.aClass6_Sub2_Sub3_8.method402();
					if (local258 == 65535) {
						local258 = -1;
					}
					this.anIntArray259[local220] = local258;
					this.aBoolean252 = true;
					this.aBoolean247 = true;
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 20) {
					if (this.anInt836 == 12) {
						this.aBoolean252 = true;
					}
					this.anInt872 = this.aClass6_Sub2_Sub3_8.method402();
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 10) {
					if (this.anInt1034 != -1) {
						this.anInt1034 = -1;
						this.aBoolean252 = true;
						this.aBoolean247 = true;
					}
					if (this.anInt923 != -1) {
						this.anInt923 = -1;
						this.aBoolean239 = true;
					}
					if (this.anInt1020 != -1) {
						this.anInt1020 = -1;
						this.aBoolean240 = true;
					}
					if (this.anInt1035 != 0) {
						this.anInt1035 = 0;
						this.aBoolean239 = true;
					}
					this.anInt914 = -1;
					this.aBoolean255 = false;
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 48) {
					this.aBoolean228 = true;
					this.anInt898 = this.aClass6_Sub2_Sub3_8.method402();
					this.anInt899 = this.aClass6_Sub2_Sub3_8.method402();
					this.anInt900 = this.aClass6_Sub2_Sub3_8.method404();
					this.anInt901 = this.aClass6_Sub2_Sub3_8.method402();
					this.anInt902 = this.aClass6_Sub2_Sub3_8.method402();
					if (this.anInt902 >= 100) {
						local258 = this.anInt898 * 128 + 64;
						local220 = this.anInt899 * 128 + 64;
						local266 = this.method616(local220, local258, this.anInt1026) - this.anInt900;
						local270 = local258 - this.anInt859;
						local456 = local266 - this.anInt860;
						local577 = local220 - this.anInt861;
						local879 = (int) Math.sqrt((double) (local270 * local270 + local577 * local577));
						this.anInt862 = (int) (Math.atan2((double) local456, (double) local879) * 325.949D) & 0x7FF;
						this.anInt863 = (int) (Math.atan2((double) local270, (double) local577) * -325.949D) & 0x7FF;
						if (this.anInt862 < 128) {
							this.anInt862 = 128;
						}
						if (this.anInt862 > 383) {
							this.anInt862 = 383;
						}
					}
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 175) {
					local258 = this.aClass6_Sub2_Sub3_8.method429();
					local2006 = Class18.aClass18Array1[local258];
					for (local266 = 0; local266 < local2006.anIntArray88.length; local266++) {
						local2006.anIntArray88[local266] = -1;
						local2006.anIntArray88[local266] = 0;
					}
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 166) {
					local258 = this.aClass6_Sub2_Sub3_8.method430();
					this.method680(local258);
					if (this.anInt1034 != -1) {
						this.anInt1034 = -1;
						this.aBoolean252 = true;
						this.aBoolean247 = true;
					}
					if (this.anInt1020 != -1) {
						this.anInt1020 = -1;
						this.aBoolean240 = true;
					}
					this.anInt923 = local258;
					this.aBoolean239 = true;
					this.anInt914 = -1;
					this.aBoolean255 = false;
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 139) {
					this.method622();
					this.anInt1009 = -1;
					return false;
				}
				if (this.anInt1009 == 119) {
					local2439 = this.aClass6_Sub2_Sub3_8.method409();
					local220 = this.aClass6_Sub2_Sub3_8.method404();
					Class18.aClass18Array1[local220].aString10 = local2439;
					if (Class18.aClass18Array1[local220].anInt369 == this.anIntArray259[this.anInt836]) {
						this.aBoolean252 = true;
					}
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 85) {
					local258 = this.aClass6_Sub2_Sub3_8.method422();
					local2450 = this.aClass6_Sub2_Sub3_8.method409();
					local266 = this.aClass6_Sub2_Sub3_8.method402();
					if (local258 >= 1 && local258 <= 5) {
						if (local2450.equalsIgnoreCase("null")) {
							local2450 = null;
						}
						this.aStringArray8[local258 - 1] = local2450;
						this.aBooleanArray12[local258 - 1] = local266 == 0;
					}
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 52) {
					local258 = this.aClass6_Sub2_Sub3_8.method429();
					if (local258 == 65535) {
						local258 = -1;
					}
					if (local258 != this.anInt989 && this.aBoolean258 && !aBoolean223 && this.anInt870 == 0) {
						this.anInt941 = local258;
						this.aBoolean236 = true;
						this.aClass9_Sub1_1.method54(2, this.anInt941);
					}
					this.anInt989 = local258;
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 146) {
					local258 = this.aClass6_Sub2_Sub3_8.method434();
					local220 = this.aClass6_Sub2_Sub3_8.method404();
					if (this.aBoolean258 && !aBoolean223) {
						this.anInt941 = local220;
						this.aBoolean236 = false;
						this.aClass9_Sub1_1.method54(2, this.anInt941);
						this.anInt870 = local258;
					}
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 60) {
					this.aBoolean252 = true;
					local258 = this.aClass6_Sub2_Sub3_8.method437(506);
					local220 = this.aClass6_Sub2_Sub3_8.method422();
					local266 = this.aClass6_Sub2_Sub3_8.method422();
					this.anIntArray239[local220] = local258;
					this.anIntArray227[local220] = local266;
					this.anIntArray230[local220] = 1;
					for (local270 = 0; local270 < 98; local270++) {
						if (local258 >= anIntArray264[local270]) {
							this.anIntArray230[local220] = local270 + 2;
						}
					}
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 208) {
					local258 = this.aClass6_Sub2_Sub3_8.method404();
					local220 = this.aClass6_Sub2_Sub3_8.method402();
					local266 = this.aClass6_Sub2_Sub3_8.method404();
					if (this.aBoolean225 && !aBoolean223 && this.anInt869 < 50) {
						this.anIntArray267[this.anInt869] = local258;
						this.anIntArray241[this.anInt869] = local220;
						this.anIntArray229[this.anInt869] = local266 + Class13.anIntArray37[local258];
						this.anInt869++;
					}
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 5) {
					local258 = this.aClass6_Sub2_Sub3_8.method430();
					local220 = this.aClass6_Sub2_Sub3_8.method431();
					local2823 = Class18.aClass18Array1[local258];
					if (local2823 != null && local2823.anInt366 == 0) {
						if (local220 < 0) {
							local220 = 0;
						}
						if (local220 > local2823.anInt386 - local2823.anInt394) {
							local220 = local2823.anInt386 - local2823.anInt394;
						}
						local2823.anInt365 = local220;
					}
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 111) {
					local258 = this.aClass6_Sub2_Sub3_8.method429();
					this.method680(local258);
					if (this.anInt1034 != -1) {
						this.anInt1034 = -1;
						this.aBoolean252 = true;
						this.aBoolean247 = true;
					}
					if (this.anInt923 != -1) {
						this.anInt923 = -1;
						this.aBoolean239 = true;
					}
					if (this.anInt1020 != -1) {
						this.anInt1020 = -1;
						this.aBoolean240 = true;
					}
					if (this.anInt1035 != 0) {
						this.anInt1035 = 0;
						this.aBoolean239 = true;
					}
					this.anInt914 = local258;
					this.aBoolean255 = false;
					this.anInt1009 = -1;
					return true;
				}
				if (this.anInt1009 == 142) {
					local258 = this.aClass6_Sub2_Sub3_8.method431();
					local220 = this.aClass6_Sub2_Sub3_8.method430();
					local266 = this.aClass6_Sub2_Sub3_8.method429();
					if (local266 == 65535) {
						Class18.aClass18Array1[local220].anInt361 = 0;
						this.anInt1009 = -1;
						return true;
					}
					@Pc(4196) Class19 local4196 = Class19.method281(local266);
					Class18.aClass18Array1[local220].anInt361 = 4;
					Class18.aClass18Array1[local220].anInt362 = local266;
					Class18.aClass18Array1[local220].anInt379 = local4196.anInt411;
					Class18.aClass18Array1[local220].anInt380 = local4196.anInt407;
					Class18.aClass18Array1[local220].anInt378 = local4196.anInt425 * 100 / local258;
					this.anInt1009 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt1009 + "," + this.anInt1008 + " - " + this.anInt950 + "," + this.anInt951);
				this.method622();
			} catch (@Pc(4262) IOException local4262) {
				this.method694();
			} catch (@Pc(4267) Exception local4267) {
				local2439 = "T2 - " + this.anInt1009 + "," + this.anInt950 + "," + this.anInt951 + " - " + this.anInt1008 + "," + (this.anInt893 + aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0]) + "," + (this.anInt894 + aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0]) + " - ";
				for (local220 = 0; local220 < this.anInt1008 && local220 < 50; local220++) {
					local2439 = local2439 + this.aClass6_Sub2_Sub3_8.aByteArray17[local220] + ",";
				}
				signlink.reporterror(local2439);
				this.method622();
			}
			return true;
		} catch (@Pc(4348) RuntimeException local4348) {
			signlink.reporterror("67098, " + true + ", " + local4348.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIILclient!LYHLTGUG;I)V")
	private void method664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class18 arg6, @OriginalArg(8) int arg7) {
		try {
			if (this.aBoolean227) {
				this.anInt905 = 32;
			} else {
				this.anInt905 = 0;
			}
			this.aBoolean227 = false;
			if (arg2 >= arg4 && arg2 < arg4 + 16 && arg7 >= arg3 && arg7 < arg3 + 16) {
				arg6.anInt365 -= this.anInt871 * 4;
				if (arg5 == 1) {
					this.aBoolean252 = true;
				}
				if (arg5 == 2 || arg5 == 3) {
					this.aBoolean239 = true;
				}
			} else if (arg2 >= arg4 && arg2 < arg4 + 16 && arg7 >= arg3 + arg0 - 16 && arg7 < arg3 + arg0) {
				arg6.anInt365 += this.anInt871 * 4;
				if (arg5 == 1) {
					this.aBoolean252 = true;
				}
				if (arg5 == 2 || arg5 == 3) {
					this.aBoolean239 = true;
				}
			} else if (arg2 >= arg4 - this.anInt905 && arg2 < arg4 + this.anInt905 + 16 && arg7 >= arg3 + 16 && arg7 < arg3 + arg0 - 16 && this.anInt871 > 0) {
				@Pc(142) int local142 = (arg0 - 32) * arg0 / arg1;
				if (local142 < 8) {
					local142 = 8;
				}
				@Pc(157) int local157 = arg7 - arg3 - local142 / 2 - 16;
				@Pc(163) int local163 = arg0 - local142 - 32;
				arg6.anInt365 = (arg1 - arg0) * local157 / local163;
				if (arg5 == 1) {
					this.aBoolean252 = true;
				}
				if (arg5 == 2 || arg5 == 3) {
					this.aBoolean239 = true;
				}
				this.aBoolean227 = true;
			}
		} catch (@Pc(192) RuntimeException local192) {
			signlink.reporterror("41495, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 44345 + ", " + arg6 + ", " + arg7 + ", " + local192.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
	private void method666(@OriginalArg(0) byte arg0, @OriginalArg(1) boolean arg1) {
		try {
			@Pc(6) boolean local6 = false;
			for (@Pc(13) int local13 = 0; local13 < this.anInt939; local13++) {
				@Pc(23) Class6_Sub2_Sub1_Sub3_Sub1 local23 = this.aClass6_Sub2_Sub1_Sub3_Sub1Array1[this.anIntArray253[local13]];
				@Pc(32) int local32 = (this.anIntArray253[local13] << 14) + 536870912;
				if (local23 != null && local23.method446() && local23.aClass16_1.aBoolean82 == arg1 && local23.aClass16_1.method203()) {
					@Pc(53) int local53 = local23.anInt651 >> 7;
					@Pc(58) int local58 = local23.anInt652 >> 7;
					if (local53 >= 0 && local53 < 104 && local58 >= 0 && local58 < 104) {
						if (local23.anInt648 == 1 && (local23.anInt651 & 0x7F) == 64 && (local23.anInt652 & 0x7F) == 64) {
							if (this.anIntArrayArray24[local53][local58] == this.anInt919) {
								continue;
							}
							this.anIntArrayArray24[local53][local58] = this.anInt919;
						}
						if (!local23.aClass16_1.aBoolean78) {
							local32 += Integer.MIN_VALUE;
						}
						this.aClass25_1.method311((local23.anInt648 - 1) * 64 + 60, local23.anInt651, local23.anInt653, local32, this.method616(local23.anInt652, local23.anInt651, this.anInt1026), this.anInt1026, local23.anInt652, local23, local23.aBoolean173);
					}
				}
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("42765, " + arg0 + ", " + arg1 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method667() {
		try {
			this.anInt1008 += 0;
			signlink.aBoolean263 = false;
			signlink.anInt1052 = 0;
			signlink.midi = "stop";
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("90011, " + 0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!UAWAYCTK;)V")
	private void method668(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub2_Sub3 arg1) {
		try {
			@Pc(24) int local24;
			@Pc(31) int local31;
			@Pc(15) int local15;
			@Pc(35) int local35;
			@Pc(61) Class6_Sub2_Sub1_Sub4 local61;
			if (arg0 == 105) {
				local15 = arg1.method421();
				local24 = this.anInt946 + (local15 >> 4 & 0x7);
				local31 = this.anInt947 + (local15 & 0x7);
				local35 = arg1.method431();
				if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104) {
					@Pc(55) Class39 local55 = this.aClass39ArrayArrayArray1[this.anInt1026][local24][local31];
					if (local55 != null) {
						for (local61 = (Class6_Sub2_Sub1_Sub4) local55.method459(); local61 != null; local61 = (Class6_Sub2_Sub1_Sub4) local55.method461()) {
							if (local61.anInt347 == (local35 & 0x7FFF)) {
								local61.method512();
								break;
							}
						}
						if (local55.method459() == null) {
							this.aClass39ArrayArrayArray1[this.anInt1026][local24][local31] = null;
						}
						this.method610(local24, local31);
					}
				}
			} else {
				@Pc(121) int local121;
				@Pc(130) int local130;
				@Pc(137) int local137;
				@Pc(145) int local145;
				@Pc(149) int local149;
				@Pc(153) int local153;
				@Pc(158) int local158;
				@Pc(167) int local167;
				if (arg0 == 147) {
					@Pc(106) byte local106 = arg1.method424(this.anInt889);
					local24 = arg1.method431();
					local31 = arg1.method430();
					@Pc(118) byte local118 = arg1.method425();
					local121 = arg1.method402();
					local130 = this.anInt946 + (local121 >> 4 & 0x7);
					local137 = this.anInt947 + (local121 & 0x7);
					@Pc(141) byte local141 = arg1.method425();
					local145 = arg1.method423();
					local149 = local145 >> 2;
					local153 = local145 & 0x3;
					local158 = this.anIntArray273[local149];
					@Pc(163) byte local163 = arg1.method424(this.anInt889);
					local167 = arg1.method431();
					@Pc(170) int local170 = arg1.method404();
					@Pc(176) Class6_Sub2_Sub1_Sub3_Sub2 local176;
					if (local31 == this.anInt943) {
						local176 = aClass6_Sub2_Sub1_Sub3_Sub2_1;
					} else {
						local176 = this.aClass6_Sub2_Sub1_Sub3_Sub2Array1[local31];
					}
					if (local176 != null) {
						@Pc(188) Class2 local188 = Class2.method24(local24);
						@Pc(198) int local198 = this.anIntArrayArrayArray7[this.anInt1026][local130][local137];
						@Pc(210) int local210 = this.anIntArrayArrayArray7[this.anInt1026][local130 + 1][local137];
						@Pc(224) int local224 = this.anIntArrayArrayArray7[this.anInt1026][local130 + 1][local137 + 1];
						@Pc(236) int local236 = this.anIntArrayArrayArray7[this.anInt1026][local130][local137 + 1];
						@Pc(246) Class6_Sub2_Sub1_Sub6 local246 = local188.method20(local149, local153, local198, local210, local224, local236, -1);
						if (local246 != null) {
							this.method594(0, this.anInt1026, local167 + 1, local130, local170 + 1, -1, local137, 0, local158);
							local176.anInt673 = local170 + anInt928;
							local176.anInt674 = local167 + anInt928;
							local176.aClass6_Sub2_Sub1_Sub6_1 = local246;
							@Pc(281) int local281 = local188.anInt36;
							@Pc(284) int local284 = local188.anInt29;
							if (local153 == 1 || local153 == 3) {
								local281 = local188.anInt29;
								local284 = local188.anInt36;
							}
							local176.anInt670 = local130 * 128 + local281 * 64;
							local176.anInt672 = local137 * 128 + local284 * 64;
							local176.anInt671 = this.method616(local176.anInt672, local176.anInt670, this.anInt1026);
							@Pc(330) byte local330;
							if (local141 > local106) {
								local330 = local141;
								local141 = local106;
								local106 = local330;
							}
							if (local118 > local163) {
								local330 = local118;
								local118 = local163;
								local163 = local330;
							}
							local176.anInt675 = local130 + local141;
							local176.anInt677 = local130 + local106;
							local176.anInt676 = local137 + local118;
							local176.anInt678 = local137 + local163;
						}
					}
				}
				if (arg0 == 177) {
					local15 = arg1.method402();
					local24 = this.anInt946 + (local15 >> 4 & 0x7);
					local31 = this.anInt947 + (local15 & 0x7);
					local35 = arg1.method404();
					local121 = arg1.method404();
					local130 = arg1.method404();
					if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104) {
						@Pc(414) Class39 local414 = this.aClass39ArrayArrayArray1[this.anInt1026][local24][local31];
						if (local414 != null) {
							for (@Pc(420) Class6_Sub2_Sub1_Sub4 local420 = (Class6_Sub2_Sub1_Sub4) local414.method459(); local420 != null; local420 = (Class6_Sub2_Sub1_Sub4) local414.method461()) {
								if (local420.anInt347 == (local35 & 0x7FFF) && local420.anInt348 == local121) {
									local420.anInt348 = local130;
									break;
								}
							}
							this.method610(local24, local31);
						}
					}
				} else {
					@Pc(493) int local493;
					if (arg0 == 170) {
						local15 = arg1.method423();
						local24 = local15 >> 2;
						local31 = local15 & 0x3;
						local35 = this.anIntArray273[local24];
						local121 = arg1.method430();
						local130 = arg1.method422();
						local137 = this.anInt946 + (local130 >> 4 & 0x7);
						local493 = this.anInt947 + (local130 & 0x7);
						if (local137 >= 0 && local493 >= 0 && local137 < 103 && local493 < 103) {
							local145 = this.anIntArrayArrayArray7[this.anInt1026][local137][local493];
							local149 = this.anIntArrayArrayArray7[this.anInt1026][local137 + 1][local493];
							local153 = this.anIntArrayArrayArray7[this.anInt1026][local137 + 1][local493 + 1];
							local158 = this.anIntArrayArrayArray7[this.anInt1026][local137][local493 + 1];
							if (local35 == 0) {
								@Pc(562) Class32 local562 = this.aClass25_1.method322(local493, this.anInt1026, local137);
								if (local562 != null) {
									local167 = local562.anInt555 >> 14 & 0x7FFF;
									if (local24 == 2) {
										local562.aClass6_Sub2_Sub1_3 = new Class6_Sub2_Sub1_Sub2(local149, local121, local158, local167, local153, 2, local31 + 4, local145, true, false);
										local562.aClass6_Sub2_Sub1_4 = new Class6_Sub2_Sub1_Sub2(local149, local121, local158, local167, local153, 2, local31 + 1 & 0x3, local145, true, false);
									} else {
										local562.aClass6_Sub2_Sub1_3 = new Class6_Sub2_Sub1_Sub2(local149, local121, local158, local167, local153, local24, local31, local145, true, false);
									}
								}
							}
							if (local35 == 1) {
								@Pc(639) Class48 local639 = this.aClass25_1.method323(this.anInt1026, local493, local137);
								if (local639 != null) {
									local639.aClass6_Sub2_Sub1_8 = new Class6_Sub2_Sub1_Sub2(local149, local121, local158, local639.anInt799 >> 14 & 0x7FFF, local153, 4, 0, local145, true, false);
								}
							}
							if (local35 == 2) {
								@Pc(673) Class17 local673 = this.aClass25_1.method324(local493, (byte) 3, local137, this.anInt1026);
								if (local24 == 11) {
									local24 = 10;
								}
								if (local673 != null) {
									local673.aClass6_Sub2_Sub1_2 = new Class6_Sub2_Sub1_Sub2(local149, local121, local158, local673.anInt360 >> 14 & 0x7FFF, local153, local24, local31, local145, true, false);
								}
							}
							if (local35 == 3) {
								@Pc(712) Class14 local712 = this.aClass25_1.method325(this.anInt1026, local493, local137);
								if (local712 != null) {
									local712.aClass6_Sub2_Sub1_1 = new Class6_Sub2_Sub1_Sub2(local149, local121, local158, local712.anInt178 >> 14 & 0x7FFF, local153, 22, local31, local145, true, false);
								}
							}
						}
					} else if (arg0 == 217) {
						local15 = arg1.method402();
						local24 = local15 >> 2;
						local31 = local15 & 0x3;
						local35 = this.anIntArray273[local24];
						local121 = arg1.method421();
						local130 = this.anInt946 + (local121 >> 4 & 0x7);
						local137 = this.anInt947 + (local121 & 0x7);
						local493 = arg1.method431();
						if (local130 >= 0 && local137 >= 0 && local130 < 104 && local137 < 104) {
							this.method594(local31, this.anInt1026, -1, local130, 0, local493, local137, local24, local35);
						}
					} else {
						if (arg0 == 116) {
							local15 = arg1.method402();
							local24 = this.anInt946 + (local15 >> 4 & 0x7);
							local31 = this.anInt947 + (local15 & 0x7);
							local35 = arg1.method404();
							local121 = arg1.method402();
							local130 = local121 >> 4 & 0xF;
							local137 = local121 & 0x7;
							if (aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0] >= local24 - local130 && aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0] <= local24 + local130 && aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0] >= local31 - local130 && aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0] <= local31 + local130 && this.aBoolean225 && !aBoolean223 && this.anInt869 < 50) {
								this.anIntArray267[this.anInt869] = local35;
								this.anIntArray241[this.anInt869] = local137;
								this.anIntArray229[this.anInt869] = Class13.anIntArray37[local35];
								this.anInt869++;
							}
						}
						if (arg0 == 234) {
							local15 = arg1.method402();
							local24 = local15 >> 2;
							local31 = local15 & 0x3;
							local35 = this.anIntArray273[local24];
							local121 = arg1.method421();
							local130 = this.anInt946 + (local121 >> 4 & 0x7);
							local137 = this.anInt947 + (local121 & 0x7);
							if (local130 >= 0 && local137 >= 0 && local130 < 104 && local137 < 104) {
								this.method594(local31, this.anInt1026, -1, local130, 0, -1, local137, local24, local35);
							}
						} else if (arg0 == 137) {
							local15 = arg1.method402();
							local24 = this.anInt946 + (local15 >> 4 & 0x7);
							local31 = this.anInt947 + (local15 & 0x7);
							local35 = local24 + arg1.method403();
							local121 = local31 + arg1.method403();
							local130 = arg1.method405();
							local137 = arg1.method404();
							local493 = arg1.method402() * 4;
							local145 = arg1.method402() * 4;
							local149 = arg1.method404();
							local153 = arg1.method404();
							local158 = arg1.method402();
							@Pc(1030) int local1030 = arg1.method402();
							if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104 && local35 >= 0 && local121 >= 0 && local35 < 104 && local121 < 104 && local137 != 65535) {
								local24 = local24 * 128 + 64;
								local31 = local31 * 128 + 64;
								local35 = local35 * 128 + 64;
								local121 = local121 * 128 + 64;
								@Pc(1106) Class6_Sub2_Sub1_Sub5 local1106 = new Class6_Sub2_Sub1_Sub5(local149 + anInt928, local31, local130, local24, this.anInt1026, (byte) 3, local145, local137, local158, local1030, this.method616(local31, local24, this.anInt1026) - local493, local153 + anInt928);
								local1106.method386(this.method616(local121, local35, this.anInt1026) - local145, local35, local121, local149 + anInt928);
								this.aClass39_10.method456(local1106);
							}
						} else if (arg0 == 155) {
							local15 = arg1.method431();
							local24 = arg1.method423();
							local31 = this.anInt946 + (local24 >> 4 & 0x7);
							local35 = this.anInt947 + (local24 & 0x7);
							local121 = arg1.method404();
							local130 = arg1.method431();
							if (local31 >= 0 && local35 >= 0 && local31 < 104 && local35 < 104 && local130 != this.anInt943) {
								@Pc(1180) Class6_Sub2_Sub1_Sub4 local1180 = new Class6_Sub2_Sub1_Sub4();
								local1180.anInt347 = local121;
								local1180.anInt348 = local15;
								if (this.aClass39ArrayArrayArray1[this.anInt1026][local31][local35] == null) {
									this.aClass39ArrayArrayArray1[this.anInt1026][local31][local35] = new Class39(41824);
								}
								this.aClass39ArrayArrayArray1[this.anInt1026][local31][local35].method456(local1180);
								this.method610(local31, local35);
							}
						} else if (arg0 == 113) {
							local15 = arg1.method429();
							local24 = arg1.method422();
							local31 = this.anInt946 + (local24 >> 4 & 0x7);
							local35 = this.anInt947 + (local24 & 0x7);
							local121 = arg1.method429();
							if (local31 >= 0 && local35 >= 0 && local31 < 104 && local35 < 104) {
								local61 = new Class6_Sub2_Sub1_Sub4();
								local61.anInt347 = local15;
								local61.anInt348 = local121;
								if (this.aClass39ArrayArrayArray1[this.anInt1026][local31][local35] == null) {
									this.aClass39ArrayArrayArray1[this.anInt1026][local31][local35] = new Class39(41824);
								}
								this.aClass39ArrayArrayArray1[this.anInt1026][local31][local35].method456(local61);
								this.method610(local31, local35);
							}
						} else if (arg0 == 126) {
							local15 = arg1.method402();
							local24 = this.anInt946 + (local15 >> 4 & 0x7);
							local31 = this.anInt947 + (local15 & 0x7);
							local35 = arg1.method404();
							local121 = arg1.method402();
							local130 = arg1.method404();
							if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104) {
								local24 = local24 * 128 + 64;
								local31 = local31 * 128 + 64;
								@Pc(1389) Class6_Sub2_Sub1_Sub1 local1389 = new Class6_Sub2_Sub1_Sub1(-911, local24, anInt928, this.anInt1026, local130, this.method616(local31, local24, this.anInt1026) - local121, local31, local35);
								this.aClass39_11.method456(local1389);
							}
						}
					}
				}
			}
		} catch (@Pc(1395) RuntimeException local1395) {
			signlink.reporterror("10664, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local1395.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method669(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			this.anInt840 = 0;
			@Pc(74) int local74;
			for (@Pc(10) int local10 = -1; local10 < this.anInt987 + this.anInt939; local10++) {
				@Pc(17) Class6_Sub2_Sub1_Sub3 local17;
				if (local10 == -1) {
					local17 = aClass6_Sub2_Sub1_Sub3_Sub2_1;
				} else if (local10 < this.anInt987) {
					local17 = this.aClass6_Sub2_Sub1_Sub3_Sub2Array1[this.anIntArray265[local10]];
				} else {
					local17 = this.aClass6_Sub2_Sub1_Sub3_Sub1Array1[this.anIntArray253[local10 - this.anInt987]];
				}
				if (local17 != null && local17.method446()) {
					@Pc(58) Class16 local58;
					if (local17 instanceof Class6_Sub2_Sub1_Sub3_Sub1) {
						local58 = ((Class6_Sub2_Sub1_Sub3_Sub1) local17).aClass16_1;
						if (local58.anIntArray59 != null) {
							local58 = local58.method205();
						}
						if (local58 == null) {
							continue;
						}
					}
					if (local10 >= this.anInt987) {
						local58 = ((Class6_Sub2_Sub1_Sub3_Sub1) local17).aClass16_1;
						if (local58.anInt224 >= 0 && local58.anInt224 < this.aClass6_Sub2_Sub2_Sub1Array8.length) {
							this.method706(local17.anInt661 + 15, local17);
							if (this.anInt935 > -1) {
								this.aClass6_Sub2_Sub2_Sub1Array8[local58.anInt224].method137(this.anInt935 - 12, this.anInt936 - 30, this.anInt992);
							}
						}
						if (this.anInt960 == 1 && this.anInt903 == this.anIntArray253[local10 - this.anInt987] && anInt928 % 20 < 10) {
							this.method706(local17.anInt661 + 15, local17);
							if (this.anInt935 > -1) {
								this.aClass6_Sub2_Sub2_Sub1Array7[0].method137(this.anInt935 - 12, this.anInt936 - 28, this.anInt992);
							}
						}
					} else {
						local74 = 30;
						@Pc(77) Class6_Sub2_Sub1_Sub3_Sub2 local77 = (Class6_Sub2_Sub1_Sub3_Sub2) local17;
						if (local77.anInt666 != -1 || local77.anInt668 != -1) {
							this.method706(local17.anInt661 + 15, local17);
							if (this.anInt935 > -1) {
								if (local77.anInt666 != -1) {
									this.aClass6_Sub2_Sub2_Sub1Array10[local77.anInt666].method137(this.anInt935 - 12, this.anInt936 - 30, this.anInt992);
									local74 += 25;
								}
								if (local77.anInt668 != -1) {
									this.aClass6_Sub2_Sub2_Sub1Array8[local77.anInt668].method137(this.anInt935 - 12, this.anInt936 - local74, this.anInt992);
									local74 += 25;
								}
							}
						}
						if (local10 >= 0 && this.anInt960 == 10 && this.anInt933 == this.anIntArray265[local10]) {
							this.method706(local17.anInt661 + 15, local17);
							if (this.anInt935 > -1) {
								this.aClass6_Sub2_Sub2_Sub1Array7[1].method137(this.anInt935 - 12, this.anInt936 - local74, this.anInt992);
							}
						}
					}
					if (local17.aString14 != null && (local10 >= this.anInt987 || this.anInt1036 == 0 || this.anInt1036 == 3 || this.anInt1036 == 1 && this.method623(((Class6_Sub2_Sub1_Sub3_Sub2) local17).aString15))) {
						this.method706(local17.anInt661, local17);
						if (this.anInt935 > -1 && this.anInt840 < this.anInt841) {
							this.anIntArray219[this.anInt840] = this.aClass6_Sub2_Sub2_Sub2_4.method163(local17.aString14) / 2;
							this.anIntArray218[this.anInt840] = this.aClass6_Sub2_Sub2_Sub2_4.anInt174;
							this.anIntArray216[this.anInt840] = this.anInt935;
							this.anIntArray217[this.anInt840] = this.anInt936;
							this.anIntArray220[this.anInt840] = local17.anInt635;
							this.anIntArray221[this.anInt840] = local17.anInt636;
							this.anIntArray222[this.anInt840] = local17.anInt642;
							this.aStringArray9[this.anInt840++] = local17.aString14;
							if (this.anInt948 == 0 && local17.anInt636 >= 1 && local17.anInt636 <= 3) {
								this.anIntArray218[this.anInt840] += 10;
								this.anIntArray217[this.anInt840] += 5;
							}
							if (this.anInt948 == 0 && local17.anInt636 == 4) {
								this.anIntArray219[this.anInt840] = 60;
							}
							if (this.anInt948 == 0 && local17.anInt636 == 5) {
								this.anIntArray218[this.anInt840] += 5;
							}
						}
					}
					if (local17.anInt637 > anInt928) {
						this.method706(local17.anInt661 + 15, local17);
						if (this.anInt935 > -1) {
							local74 = local17.anInt638 * 30 / local17.anInt639;
							if (local74 > 30) {
								local74 = 30;
							}
							Class6_Sub2_Sub2.method519(65280, this.anInt936 - 3, 5, this.anInt935 - 15, local74);
							Class6_Sub2_Sub2.method519(16711680, this.anInt936 - 3, 5, this.anInt935 + local74 - 15, 30 - local74);
						}
					}
					for (local74 = 0; local74 < 4; local74++) {
						if (local17.anIntArray147[local74] > anInt928) {
							this.method706(local17.anInt661 / 2, local17);
							if (this.anInt935 > -1) {
								if (local74 == 1) {
									this.anInt936 -= 20;
								}
								if (local74 == 2) {
									this.anInt935 -= 15;
									this.anInt936 -= 10;
								}
								if (local74 == 3) {
									this.anInt935 += 15;
									this.anInt936 -= 10;
								}
								this.aClass6_Sub2_Sub2_Sub1Array5[local17.anIntArray146[local74]].method137(this.anInt935 - 12, this.anInt936 - 12, this.anInt992);
								this.aClass6_Sub2_Sub2_Sub2_2.method160(this.anInt936 + 4, this.anInt935, String.valueOf(local17.anIntArray145[local74]), 0);
								this.aClass6_Sub2_Sub2_Sub2_2.method160(this.anInt936 + 3, this.anInt935 - 1, String.valueOf(local17.anIntArray145[local74]), 16777215);
							}
						}
					}
				}
			}
			for (@Pc(620) int local620 = 0; local620 < this.anInt840; local620++) {
				local74 = this.anIntArray216[local620];
				@Pc(632) int local632 = this.anIntArray217[local620];
				@Pc(637) int local637 = this.anIntArray219[local620];
				@Pc(642) int local642 = this.anIntArray218[local620];
				@Pc(644) boolean local644 = true;
				while (local644) {
					local644 = false;
					for (@Pc(650) int local650 = 0; local650 < local620; local650++) {
						if (local632 + 2 > this.anIntArray217[local650] - this.anIntArray218[local650] && local632 - local642 < this.anIntArray217[local650] + 2 && local74 - local637 < this.anIntArray216[local650] + this.anIntArray219[local650] && local74 + local637 > this.anIntArray216[local650] - this.anIntArray219[local650] && this.anIntArray217[local650] - this.anIntArray218[local650] < local632) {
							local632 = this.anIntArray217[local650] - this.anIntArray218[local650];
							local644 = true;
						}
					}
				}
				this.anInt935 = this.anIntArray216[local620];
				this.anInt936 = this.anIntArray217[local620] = local632;
				@Pc(749) String local749 = this.aStringArray9[local620];
				if (this.anInt948 == 0) {
					@Pc(754) int local754 = 16776960;
					if (this.anIntArray220[local620] < 6) {
						local754 = this.anIntArray268[this.anIntArray220[local620]];
					}
					if (this.anIntArray220[local620] == 6) {
						local754 = this.anInt919 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray220[local620] == 7) {
						local754 = this.anInt919 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray220[local620] == 8) {
						local754 = this.anInt919 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(829) int local829;
					if (this.anIntArray220[local620] == 9) {
						local829 = 150 - this.anIntArray222[local620];
						if (local829 < 50) {
							local754 = local829 * 1280 + 16711680;
						} else if (local829 < 100) {
							local754 = 16776960 - (local829 - 50) * 327680;
						} else if (local829 < 150) {
							local754 = (local829 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray220[local620] == 10) {
						local829 = 150 - this.anIntArray222[local620];
						if (local829 < 50) {
							local754 = local829 * 5 + 16711680;
						} else if (local829 < 100) {
							local754 = 16711935 - (local829 - 50) * 327680;
						} else if (local829 < 150) {
							local754 = (local829 - 100) * 327680 + 255 - (local829 - 100) * 5;
						}
					}
					if (this.anIntArray220[local620] == 11) {
						local829 = 150 - this.anIntArray222[local620];
						if (local829 < 50) {
							local754 = 16777215 - local829 * 327685;
						} else if (local829 < 100) {
							local754 = (local829 - 50) * 327685 + 65280;
						} else if (local829 < 150) {
							local754 = 16777215 - (local829 - 100) * 327680;
						}
					}
					if (this.anIntArray221[local620] == 0) {
						this.aClass6_Sub2_Sub2_Sub2_4.method160(this.anInt936 + 1, this.anInt935, local749, 0);
						this.aClass6_Sub2_Sub2_Sub2_4.method160(this.anInt936, this.anInt935, local749, local754);
					}
					if (this.anIntArray221[local620] == 1) {
						this.aClass6_Sub2_Sub2_Sub2_4.method165(this.anInt936 + 1, local749, this.anInt919, 0, this.anInt935);
						this.aClass6_Sub2_Sub2_Sub2_4.method165(this.anInt936, local749, this.anInt919, local754, this.anInt935);
					}
					if (this.anIntArray221[local620] == 2) {
						this.aClass6_Sub2_Sub2_Sub2_4.method166(0, this.anInt919, this.anInt936 + 1, local749, this.anInt935);
						this.aClass6_Sub2_Sub2_Sub2_4.method166(local754, this.anInt919, this.anInt936, local749, this.anInt935);
					}
					if (this.anIntArray221[local620] == 3) {
						this.aClass6_Sub2_Sub2_Sub2_4.method167(this.anInt919, 0, this.anInt935, local749, 150 - this.anIntArray222[local620], this.anInt936 + 1);
						this.aClass6_Sub2_Sub2_Sub2_4.method167(this.anInt919, local754, this.anInt935, local749, 150 - this.anIntArray222[local620], this.anInt936);
					}
					@Pc(1126) int local1126;
					if (this.anIntArray221[local620] == 4) {
						local829 = this.aClass6_Sub2_Sub2_Sub2_4.method163(local749);
						local1126 = (150 - this.anIntArray222[local620]) * (local829 + 100) / 150;
						Class6_Sub2_Sub2.method516(0, this.anInt935 + 50, 334, this.anInt935 - 50);
						this.aClass6_Sub2_Sub2_Sub2_4.method164(0, this.anInt935 + 50 - local1126, this.anInt936 + 1, local749);
						this.aClass6_Sub2_Sub2_Sub2_4.method164(local754, this.anInt935 + 50 - local1126, this.anInt936, local749);
						Class6_Sub2_Sub2.method515();
					}
					if (this.anIntArray221[local620] == 5) {
						local829 = 150 - this.anIntArray222[local620];
						local1126 = 0;
						if (local829 < 25) {
							local1126 = local829 - 25;
						} else if (local829 > 125) {
							local1126 = local829 - 125;
						}
						Class6_Sub2_Sub2.method516(this.anInt936 - this.aClass6_Sub2_Sub2_Sub2_4.anInt174 - 1, 512, this.anInt936 + 5, 0);
						this.aClass6_Sub2_Sub2_Sub2_4.method160(this.anInt936 + local1126 + 1, this.anInt935, local749, 0);
						this.aClass6_Sub2_Sub2_Sub2_4.method160(this.anInt936 + local1126, this.anInt935, local749, local754);
						Class6_Sub2_Sub2.method515();
					}
				} else {
					this.aClass6_Sub2_Sub2_Sub2_4.method160(this.anInt936 + 1, this.anInt935, local749, 0);
					this.aClass6_Sub2_Sub2_Sub2_4.method160(this.anInt936, this.anInt935, local749, 16776960);
				}
			}
		} catch (@Pc(1276) RuntimeException local1276) {
			signlink.reporterror("41457, " + arg0 + ", " + local1276.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	@Override
	protected void method580() {
		try {
			this.aBoolean240 = true;
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("24880, " + true + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(8) int local8 = this.aClass25_1.method326(arg2, arg4, arg1);
			@Pc(18) int local18;
			@Pc(24) int local24;
			@Pc(28) int local28;
			@Pc(30) int local30;
			@Pc(52) int local52;
			@Pc(58) int local58;
			if (local8 != 0) {
				local18 = this.aClass25_1.method330(arg2, arg4, arg1, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = arg3;
				if (local8 > 0) {
					local30 = arg0;
				}
				@Pc(38) int[] local38 = this.aClass6_Sub2_Sub2_Sub1_9.anIntArray40;
				local52 = arg4 * 4 + (103 - arg1) * 512 * 4 + 24624;
				local58 = local8 >> 14 & 0x7FFF;
				@Pc(61) Class2 local61 = Class2.method24(local58);
				if (local61.anInt23 == -1) {
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
					@Pc(71) Class6_Sub2_Sub2_Sub4 local71 = this.aClass6_Sub2_Sub2_Sub4Array3[local61.anInt23];
					if (local71 != null) {
						@Pc(83) int local83 = (local61.anInt36 * 4 - local71.anInt770) / 2;
						@Pc(93) int local93 = (local61.anInt29 * 4 - local71.anInt771) / 2;
						local71.method531(arg4 * 4 + local83 + 48, (104 - arg1 - local61.anInt29) * 4 + 48 + local93, this.anInt992);
					}
				}
			}
			local8 = this.aClass25_1.method328(arg2, arg4, arg1);
			if (local8 != 0) {
				local18 = this.aClass25_1.method330(arg2, arg4, arg1, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = local8 >> 14 & 0x7FFF;
				@Pc(454) Class2 local454 = Class2.method24(local30);
				@Pc(486) int local486;
				if (local454.anInt23 != -1) {
					@Pc(464) Class6_Sub2_Sub2_Sub4 local464 = this.aClass6_Sub2_Sub2_Sub4Array3[local454.anInt23];
					if (local464 != null) {
						local58 = (local454.anInt36 * 4 - local464.anInt770) / 2;
						local486 = (local454.anInt29 * 4 - local464.anInt771) / 2;
						local464.method531(arg4 * 4 + local58 + 48, (104 - arg1 - local454.anInt29) * 4 + 48 + local486, this.anInt992);
					}
				} else if (local28 == 9) {
					local52 = 15658734;
					if (local8 > 0) {
						local52 = 15597568;
					}
					@Pc(524) int[] local524 = this.aClass6_Sub2_Sub2_Sub1_9.anIntArray40;
					local486 = arg4 * 4 + (103 - arg1) * 512 * 4 + 24624;
					if (local24 == 0 || local24 == 2) {
						local524[local486 + 1536] = local52;
						local524[local486 + 1024 + 1] = local52;
						local524[local486 + 512 + 2] = local52;
						local524[local486 + 3] = local52;
					} else {
						local524[local486] = local52;
						local524[local486 + 512 + 1] = local52;
						local524[local486 + 1024 + 2] = local52;
						local524[local486 + 1536 + 3] = local52;
					}
				}
			}
			local8 = this.aClass25_1.method329(arg2, arg4, arg1);
			if (local8 != 0) {
				local18 = local8 >> 14 & 0x7FFF;
				@Pc(619) Class2 local619 = Class2.method24(local18);
				if (local619.anInt23 != -1) {
					@Pc(629) Class6_Sub2_Sub2_Sub4 local629 = this.aClass6_Sub2_Sub2_Sub4Array3[local619.anInt23];
					if (local629 != null) {
						local30 = (local619.anInt36 * 4 - local629.anInt770) / 2;
						@Pc(651) int local651 = (local619.anInt29 * 4 - local629.anInt771) / 2;
						local629.method531(arg4 * 4 + local30 + 48, (104 - arg1 - local619.anInt29) * 4 + 48 + local651, this.anInt992);
						return;
					}
				}
			}
		} catch (@Pc(676) RuntimeException local676) {
			signlink.reporterror("99308, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 1 + ", " + arg3 + ", " + arg4 + ", " + local676.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method671() {
		try {
			this.aBoolean245 = true;
			try {
				@Pc(11) long local11 = System.currentTimeMillis();
				@Pc(13) int local13 = 0;
				@Pc(15) int local15 = 20;
				while (this.aBoolean238) {
					this.anInt980++;
					this.method673();
					this.method673();
					this.method689();
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
			this.aBoolean245 = false;
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("11715, " + -226 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)Z")
	private boolean method672(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 504) {
				for (@Pc(4) int local4 = 1; local4 > 0; local4++) {
				}
			}
			return signlink.wavereplay();
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("3773, " + arg0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method673() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray223[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray223[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray224[local54] = (this.anIntArray223[local54 - 1] + this.anIntArray223[local54 + 1] + this.anIntArray223[local54 - 128] + this.anIntArray223[local54 + 128]) / 4;
				}
			}
			this.anInt1016 += 128;
			if (this.anInt1016 > this.anIntArray254.length) {
				this.anInt1016 -= this.anIntArray254.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method627(this.aClass6_Sub2_Sub2_Sub4Array2[local48]);
			}
			@Pc(169) int local169;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local169 = local54 + (local48 << 7);
					@Pc(192) int local192 = this.anIntArray224[local169 + 128] - this.anIntArray254[local169 + this.anInt1016 & this.anIntArray254.length - 1] / 5;
					if (local192 < 0) {
						local192 = 0;
					}
					this.anIntArray223[local169] = local192;
				}
			}
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray269[local54] = this.anIntArray269[local54 + 1];
			}
			this.anIntArray269[255] = (int) (Math.sin((double) anInt928 / 14.0D) * 16.0D + Math.sin((double) anInt928 / 15.0D) * 14.0D + Math.sin((double) anInt928 / 16.0D) * 12.0D);
			if (this.anInt994 > 0) {
				this.anInt994 -= 4;
			}
			if (this.anInt995 > 0) {
				this.anInt995 -= 4;
			}
			if (this.anInt994 == 0 && this.anInt995 == 0) {
				local169 = (int) (Math.random() * 2000.0D);
				if (local169 == 0) {
					this.anInt994 = 1024;
				}
				if (local169 == 1) {
					this.anInt995 = 1024;
					return;
				}
			}
		} catch (@Pc(303) RuntimeException local303) {
			signlink.reporterror("65506, " + -67 + ", " + local303.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!LYHLTGUG;BI)V")
	private void method674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class18 arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2.anInt366 == 0 && arg2.anIntArray85 != null && (!arg2.aBoolean117 || this.anInt858 == arg2.anInt374 || this.anInt956 == arg2.anInt374 || this.anInt937 == arg2.anInt374)) {
				@Pc(29) int local29 = Class6_Sub2_Sub2.anInt762;
				@Pc(31) int local31 = Class6_Sub2_Sub2.anInt760;
				@Pc(33) int local33 = Class6_Sub2_Sub2.anInt763;
				@Pc(35) int local35 = Class6_Sub2_Sub2.anInt761;
				Class6_Sub2_Sub2.method516(arg0, arg1 + arg2.anInt381, arg0 + arg2.anInt394, arg1);
				@Pc(51) int local51 = arg2.anIntArray85.length;
				for (@Pc(63) int local63 = 0; local63 < local51; local63++) {
					@Pc(72) int local72 = arg2.anIntArray84[local63] + arg1;
					@Pc(81) int local81 = arg2.anIntArray89[local63] + arg0 - arg3;
					@Pc(88) Class18 local88 = Class18.aClass18Array1[arg2.anIntArray85[local63]];
					@Pc(93) int local93 = local72 + local88.anInt370;
					@Pc(98) int local98 = local81 + local88.anInt372;
					if (local88.anInt383 > 0) {
						this.method597(local88);
					}
					if (local88.anInt366 == 0) {
						if (local88.anInt365 > local88.anInt386 - local88.anInt394) {
							local88.anInt365 = local88.anInt386 - local88.anInt394;
						}
						if (local88.anInt365 < 0) {
							local88.anInt365 = 0;
						}
						this.method674(local98, local93, local88, local88.anInt365);
						if (local88.anInt386 > local88.anInt394) {
							this.method699(local88.anInt386, local88.anInt394, local98, local93 + local88.anInt381, local88.anInt365);
						}
					} else if (local88.anInt366 != 1) {
						@Pc(170) int local170;
						@Pc(174) int local174;
						@Pc(185) int local185;
						@Pc(220) int local220;
						@Pc(227) int local227;
						@Pc(252) int local252;
						@Pc(168) int local168;
						@Pc(218) int local218;
						if (local88.anInt366 == 2) {
							local168 = 0;
							for (local170 = 0; local170 < local88.anInt394; local170++) {
								for (local174 = 0; local174 < local88.anInt381; local174++) {
									local185 = local93 + local174 * (local88.anInt389 + 32);
									@Pc(194) int local194 = local98 + local170 * (local88.anInt375 + 32);
									if (local168 < 20) {
										local185 += local88.anIntArray90[local168];
										local194 += local88.anIntArray82[local168];
									}
									if (local88.anIntArray88[local168] > 0) {
										local218 = 0;
										local220 = 0;
										local227 = local88.anIntArray88[local168] - 1;
										if (local185 > Class6_Sub2_Sub2.anInt762 - 32 && local185 < Class6_Sub2_Sub2.anInt763 && local194 > Class6_Sub2_Sub2.anInt760 - 32 && local194 < Class6_Sub2_Sub2.anInt761 || this.anInt1042 != 0 && this.anInt1041 == local168) {
											local252 = 0;
											if (this.anInt999 == 1 && this.anInt1000 == local168 && this.anInt1001 == local88.anInt374) {
												local252 = 16777215;
											}
											@Pc(276) Class6_Sub2_Sub2_Sub1 local276 = Class19.method273(local252, local227, local88.anIntArray83[local168]);
											if (local276 != null) {
												@Pc(355) int local355;
												if (this.anInt1042 != 0 && this.anInt1041 == local168 && this.anInt1040 == local88.anInt374) {
													local218 = super.anInt815 - this.anInt1043;
													local220 = super.anInt816 - this.anInt1044;
													if (local218 < 5 && local218 > -5) {
														local218 = 0;
													}
													if (local220 < 5 && local220 > -5) {
														local220 = 0;
													}
													if (this.anInt997 < 5) {
														local218 = 0;
														local220 = 0;
													}
													local276.method139(local185 + local218, local194 + local220);
													if (local194 + local220 < Class6_Sub2_Sub2.anInt760 && arg2.anInt365 > 0) {
														local355 = this.anInt1039 * (Class6_Sub2_Sub2.anInt760 - local194 - local220) / 3;
														if (local355 > this.anInt1039 * 10) {
															local355 = this.anInt1039 * 10;
														}
														if (local355 > arg2.anInt365) {
															local355 = arg2.anInt365;
														}
														arg2.anInt365 -= local355;
														this.anInt1044 += local355;
													}
													if (local194 + local220 + 32 > Class6_Sub2_Sub2.anInt761 && arg2.anInt365 < arg2.anInt386 - arg2.anInt394) {
														local355 = this.anInt1039 * (local194 + local220 + 32 - Class6_Sub2_Sub2.anInt761) / 3;
														if (local355 > this.anInt1039 * 10) {
															local355 = this.anInt1039 * 10;
														}
														if (local355 > arg2.anInt386 - arg2.anInt394 - arg2.anInt365) {
															local355 = arg2.anInt386 - arg2.anInt394 - arg2.anInt365;
														}
														arg2.anInt365 += local355;
														this.anInt1044 -= local355;
													}
												} else if (this.anInt878 != 0 && this.anInt877 == local168 && this.anInt876 == local88.anInt374) {
													local276.method139(local185, local194);
												} else {
													local276.method137(local185, local194, this.anInt992);
												}
												if (local276.anInt157 == 33 || local88.anIntArray83[local168] != 1) {
													local355 = local88.anIntArray83[local168];
													this.aClass6_Sub2_Sub2_Sub2_2.method164(0, local185 + local218 + 1, local194 + 10 + local220, method665(local355));
													this.aClass6_Sub2_Sub2_Sub2_2.method164(16776960, local185 + local218, local194 + 9 + local220, method665(local355));
												}
											}
										}
									} else if (local88.aClass6_Sub2_Sub2_Sub1Array2 != null && local168 < 20) {
										@Pc(545) Class6_Sub2_Sub2_Sub1 local545 = local88.aClass6_Sub2_Sub2_Sub1Array2[local168];
										if (local545 != null) {
											local545.method137(local185, local194, this.anInt992);
										}
									}
									local168++;
								}
							}
						} else if (local88.anInt366 == 3) {
							@Pc(572) boolean local572 = false;
							if (this.anInt937 == local88.anInt374 || this.anInt956 == local88.anInt374 || this.anInt858 == local88.anInt374) {
								local572 = true;
							}
							if (this.method641(local88)) {
								local168 = local88.anInt388;
								if (local572 && local88.anInt387 != 0) {
									local168 = local88.anInt387;
								}
							} else {
								local168 = local88.anInt393;
								if (local572 && local88.anInt382 != 0) {
									local168 = local88.anInt382;
								}
							}
							if (local88.aByte12 == 0) {
								if (local88.aBoolean109) {
									Class6_Sub2_Sub2.method519(local168, local98, local88.anInt394, local93, local88.anInt381);
								} else {
									Class6_Sub2_Sub2.method520(local93, local98, local88.anInt381, local168, 248, local88.anInt394);
								}
							} else if (local88.aBoolean109) {
								Class6_Sub2_Sub2.method518(local93, local88.anInt381, local168, 256 - (local88.aByte12 & 0xFF), local98, local88.anInt394);
							} else {
								Class6_Sub2_Sub2.method521(local98, this.anInt1024, 256 - (local88.aByte12 & 0xFF), local93, local88.anInt381, local168, local88.anInt394);
							}
						} else {
							@Pc(691) Class6_Sub2_Sub2_Sub2 local691;
							@Pc(968) String local968;
							if (local88.anInt366 == 4) {
								local691 = local88.aClass6_Sub2_Sub2_Sub2_1;
								@Pc(694) String local694 = local88.aString10;
								@Pc(696) boolean local696 = false;
								if (this.anInt937 == local88.anInt374 || this.anInt956 == local88.anInt374 || this.anInt858 == local88.anInt374) {
									local696 = true;
								}
								if (this.method641(local88)) {
									local170 = local88.anInt388;
									if (local696 && local88.anInt387 != 0) {
										local170 = local88.anInt387;
									}
									if (local88.aString7.length() > 0) {
										local694 = local88.aString7;
									}
								} else {
									local170 = local88.anInt393;
									if (local696 && local88.anInt382 != 0) {
										local170 = local88.anInt382;
									}
								}
								if (local88.anInt364 == 6 && this.aBoolean255) {
									local694 = "Please wait...";
									local170 = local88.anInt393;
								}
								if (Class6_Sub2_Sub2.anInt758 == 479) {
									if (local170 == 16776960) {
										local170 = 255;
									}
									if (local170 == 49152) {
										local170 = 16777215;
									}
								}
								local218 = local98 + local691.anInt174;
								while (local694.length() > 0) {
									if (local694.indexOf("%") != -1) {
										label379: while (true) {
											local220 = local694.indexOf("%1");
											if (local220 == -1) {
												while (true) {
													local220 = local694.indexOf("%2");
													if (local220 == -1) {
														while (true) {
															local220 = local694.indexOf("%3");
															if (local220 == -1) {
																while (true) {
																	local220 = local694.indexOf("%4");
																	if (local220 == -1) {
																		while (true) {
																			local220 = local694.indexOf("%5");
																			if (local220 == -1) {
																				break label379;
																			}
																			local694 = local694.substring(0, local220) + this.method613(this.method602(4, local88)) + local694.substring(local220 + 2);
																		}
																	}
																	local694 = local694.substring(0, local220) + this.method613(this.method602(3, local88)) + local694.substring(local220 + 2);
																}
															}
															local694 = local694.substring(0, local220) + this.method613(this.method602(2, local88)) + local694.substring(local220 + 2);
														}
													}
													local694 = local694.substring(0, local220) + this.method613(this.method602(1, local88)) + local694.substring(local220 + 2);
												}
											}
											local694 = local694.substring(0, local220) + this.method613(this.method602(0, local88)) + local694.substring(local220 + 2);
										}
									}
									local220 = local694.indexOf("\\n");
									if (local220 == -1) {
										local968 = local694;
										local694 = "";
									} else {
										local968 = local694.substring(0, local220);
										local694 = local694.substring(local220 + 2);
									}
									if (local88.aBoolean113) {
										local691.method161(local170, local88.aBoolean107, local968, local93 + local88.anInt381 / 2, local218);
									} else {
										local691.method168(local88.aBoolean107, local968, local170, local93, local218);
									}
									local218 += local691.anInt174;
								}
							} else if (local88.anInt366 == 5) {
								@Pc(1030) Class6_Sub2_Sub2_Sub1 local1030;
								if (this.method641(local88)) {
									local1030 = local88.aClass6_Sub2_Sub2_Sub1_1;
								} else {
									local1030 = local88.aClass6_Sub2_Sub2_Sub1_2;
								}
								if (local1030 != null) {
									local1030.method137(local93, local98, this.anInt992);
								}
							} else if (local88.anInt366 == 6) {
								local168 = Class6_Sub2_Sub2_Sub3.anInt340;
								local170 = Class6_Sub2_Sub2_Sub3.anInt341;
								Class6_Sub2_Sub2_Sub3.anInt340 = local93 + local88.anInt381 / 2;
								Class6_Sub2_Sub2_Sub3.anInt341 = local98 + local88.anInt394 / 2;
								local174 = Class6_Sub2_Sub2_Sub3.anIntArray76[local88.anInt379] * local88.anInt378 >> 16;
								local185 = Class6_Sub2_Sub2_Sub3.anIntArray77[local88.anInt379] * local88.anInt378 >> 16;
								@Pc(1092) boolean local1092 = this.method641(local88);
								if (local1092) {
									local218 = local88.anInt385;
								} else {
									local218 = local88.anInt384;
								}
								@Pc(1112) Class6_Sub2_Sub1_Sub6 local1112;
								if (local218 == -1) {
									local1112 = local88.method263(-1, local1092, -1);
								} else {
									@Pc(1118) Class33 local1118 = Class33.aClass33Array1[local218];
									local1112 = local88.method263(local1118.anIntArray129[local88.anInt390], local1092, local1118.anIntArray130[local88.anInt390]);
								}
								if (local1112 != null) {
									local1112.method507(local88.anInt380, 0, local88.anInt379, 0, local174, local185);
								}
								Class6_Sub2_Sub2_Sub3.anInt340 = local168;
								Class6_Sub2_Sub2_Sub3.anInt341 = local170;
							} else {
								if (local88.anInt366 == 7) {
									local691 = local88.aClass6_Sub2_Sub2_Sub2_1;
									local170 = 0;
									for (local174 = 0; local174 < local88.anInt394; local174++) {
										for (local185 = 0; local185 < local88.anInt381; local185++) {
											if (local88.anIntArray88[local170] > 0) {
												@Pc(1182) Class19 local1182 = Class19.method281(local88.anIntArray88[local170] - 1);
												@Pc(1185) String local1185 = local1182.aString12;
												if (local1182.aBoolean127 || local88.anIntArray83[local170] != 1) {
													local1185 = local1185 + " x" + method624(local88.anIntArray83[local170]);
												}
												local220 = local93 + local185 * (local88.anInt389 + 115);
												local227 = local98 + local174 * (local88.anInt375 + 12);
												if (local88.aBoolean113) {
													local691.method161(local88.anInt393, local88.aBoolean107, local1185, local220 + local88.anInt381 / 2, local227);
												} else {
													local691.method168(local88.aBoolean107, local1185, local88.anInt393, local220, local227);
												}
											}
											local170++;
										}
									}
								}
								if (local88.anInt366 == 8 && (this.anInt971 == local88.anInt374 || this.anInt1014 == local88.anInt374 || this.anInt864 == local88.anInt374)) {
									local168 = 0;
									local170 = 0;
									@Pc(1295) Class6_Sub2_Sub2_Sub2 local1295 = this.aClass6_Sub2_Sub2_Sub2_3;
									@Pc(1298) String local1298 = local88.aString10;
									while (local1298.length() > 0) {
										local218 = local1298.indexOf("\\n");
										if (local218 == -1) {
											local968 = local1298;
											local1298 = "";
										} else {
											local968 = local1298.substring(0, local218);
											local1298 = local1298.substring(local218 + 2);
										}
										local220 = local1295.method162(local968);
										if (local220 > local168) {
											local168 = local220;
										}
										local170 += local1295.anInt174 + 1;
									}
									local168 += 6;
									local170 += 7;
									local218 = local93 + local88.anInt381 - local168 - 5;
									local220 = local98 + local88.anInt394 + 5;
									if (local218 < local93 + 5) {
										local218 = this.anInt1000 + 5;
									}
									Class6_Sub2_Sub2.method519(16777120, local220, local170, local218, local168);
									Class6_Sub2_Sub2.method520(local218, local220, local168, 0, 248, local170);
									local1298 = local88.aString10;
									local227 = local220 + local1295.anInt174 + 2;
									while (local1298.length() > 0) {
										local252 = local1298.indexOf("\\n");
										if (local252 == -1) {
											local968 = local1298;
											local1298 = "";
										} else {
											local968 = local1298.substring(0, local252);
											local1298 = local1298.substring(local252 + 2);
										}
										local1295.method168(false, local968, 0, local218 + 3, local227);
										local227 += local1295.anInt174 + 1;
									}
								}
							}
						}
					}
				}
				Class6_Sub2_Sub2.method516(local31, local33, local35, local29);
			}
		} catch (@Pc(1454) RuntimeException local1454) {
			signlink.reporterror("35796, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 67 + ", " + arg3 + ", " + local1454.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method675() {
		try {
			for (@Pc(4) Class6_Sub1 local4 = (Class6_Sub1) this.aClass39_12.method459(); local4 != null; local4 = (Class6_Sub1) this.aClass39_12.method461()) {
				if (local4.anInt62 == -1) {
					local4.anInt63 = 0;
					this.method708(local4);
				} else {
					local4.method512();
				}
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("9676, " + 818 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method676() {
		try {
			@Pc(20) int local20;
			@Pc(27) int local27;
			if (this.anInt887 == 0) {
				local20 = super.anInt811 / 2 - 80;
				local27 = super.anInt812 / 2 + 20;
				local27 += 20;
				if (super.anInt820 == 1 && super.anInt821 >= local20 - 75 && super.anInt821 <= local20 + 75 && super.anInt822 >= local27 - 20 && super.anInt822 <= local27 + 20) {
					this.anInt887 = 3;
					this.anInt998 = 0;
				}
				local20 = super.anInt811 / 2 + 80;
				if (super.anInt820 == 1 && super.anInt821 >= local20 - 75 && super.anInt821 <= local20 + 75 && super.anInt822 >= local27 - 20 && super.anInt822 <= local27 + 20) {
					this.aString20 = "";
					this.aString21 = "Enter your username & password.";
					this.anInt887 = 2;
					this.anInt998 = 0;
				}
			} else if (this.anInt887 == 2) {
				local20 = super.anInt812 / 2 - 40;
				local20 += 30;
				local20 += 25;
				if (super.anInt820 == 1 && super.anInt822 >= local20 - 15 && super.anInt822 < local20) {
					this.anInt998 = 0;
				}
				local20 += 15;
				if (super.anInt820 == 1 && super.anInt822 >= local20 - 15 && super.anInt822 < local20) {
					this.anInt998 = 1;
				}
				local20 += 15;
				local27 = super.anInt811 / 2 - 80;
				@Pc(173) int local173 = super.anInt812 / 2 + 50;
				@Pc(174) int local174 = local173 + 20;
				if (super.anInt820 == 1 && super.anInt821 >= local27 - 75 && super.anInt821 <= local27 + 75 && super.anInt822 >= local174 - 20 && super.anInt822 <= local174 + 20) {
					this.anInt996 = 0;
					this.method611(this.aString24, this.aString25, false);
					if (this.aBoolean226) {
						return;
					}
				}
				local27 = super.anInt811 / 2 + 80;
				if (super.anInt820 == 1 && super.anInt821 >= local27 - 75 && super.anInt821 <= local27 + 75 && super.anInt822 >= local174 - 20 && super.anInt822 <= local174 + 20) {
					this.anInt887 = 0;
					this.aString24 = "";
					this.aString25 = "";
				}
				while (true) {
					while (true) {
						@Pc(264) int local264 = this.method575();
						if (local264 == -1) {
							return;
						}
						@Pc(269) boolean local269 = false;
						for (@Pc(271) int local271 = 0; local271 < aString30.length(); local271++) {
							if (local264 == aString30.charAt(local271)) {
								local269 = true;
								break;
							}
						}
						if (this.anInt998 == 0) {
							if (local264 == 8 && this.aString24.length() > 0) {
								this.aString24 = this.aString24.substring(0, this.aString24.length() - 1);
							}
							if (local264 == 9 || local264 == 10 || local264 == 13) {
								this.anInt998 = 1;
							}
							if (local269) {
								this.aString24 = this.aString24 + (char) local264;
							}
							if (this.aString24.length() > 12) {
								this.aString24 = this.aString24.substring(0, 12);
							}
						} else if (this.anInt998 == 1) {
							if (local264 == 8 && this.aString25.length() > 0) {
								this.aString25 = this.aString25.substring(0, this.aString25.length() - 1);
							}
							if (local264 == 9 || local264 == 10 || local264 == 13) {
								this.anInt998 = 0;
							}
							if (local269) {
								this.aString25 = this.aString25 + (char) local264;
							}
							if (this.aString25.length() > 20) {
								this.aString25 = this.aString25.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt887 == 3) {
				local20 = super.anInt811 / 2;
				local27 = super.anInt812 / 2 + 50;
				@Pc(428) int local428 = local27 + 20;
				if (super.anInt820 == 1 && super.anInt821 >= local20 - 75 && super.anInt821 <= local20 + 75 && super.anInt822 >= local428 - 20 && super.anInt822 <= local428 + 20) {
					this.anInt887 = 0;
					return;
				}
			}
		} catch (@Pc(461) RuntimeException local461) {
			signlink.reporterror("82132, " + 3 + ", " + local461.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method677() {
		try {
			if (this.anInt960 == 2) {
				this.method707((this.anInt879 - this.anInt893 << 7) + this.anInt882, this.anInt881 * 2, (this.anInt880 - this.anInt894 << 7) + this.anInt883, this.aByte37);
				if (this.anInt935 > -1 && anInt928 % 20 < 10) {
					this.aClass6_Sub2_Sub2_Sub1Array7[0].method137(this.anInt935 - 12, this.anInt936 - 28, this.anInt992);
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("43900, " + 0 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method678() {
		try {
			@Pc(7) int local7 = 5;
			this.anIntArray226[8] = 0;
			@Pc(14) int local14 = 0;
			while (this.anIntArray226[8] == 0) {
				@Pc(18) String local18 = "Unknown problem";
				this.method583(20, "Connecting to web server");
				try {
					@Pc(40) DataInputStream local40 = this.method695("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 333);
					@Pc(47) Class6_Sub2_Sub3 local47 = new Class6_Sub2_Sub3(741, new byte[40]);
					local40.readFully(local47.aByteArray17, 0, 40);
					local40.close();
					for (@Pc(57) int local57 = 0; local57 < 9; local57++) {
						this.anIntArray226[local57] = local47.method407();
					}
					@Pc(72) int local72 = local47.method407();
					@Pc(74) int local74 = 1234;
					for (@Pc(76) int local76 = 0; local76 < 9; local76++) {
						local74 = (local74 << 1) + this.anIntArray226[local76];
					}
					if (local72 != local74) {
						local18 = "checksum problem";
						this.anIntArray226[8] = 0;
					}
				} catch (@Pc(103) EOFException local103) {
					local18 = "EOF problem";
					this.anIntArray226[8] = 0;
				} catch (@Pc(112) IOException local112) {
					local18 = "connection problem";
					this.anIntArray226[8] = 0;
				} catch (@Pc(121) Exception local121) {
					local18 = "logic problem";
					this.anIntArray226[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray226[8] == 0) {
					local14++;
					for (@Pc(139) int local139 = local7; local139 > 0; local139--) {
						if (local14 >= 10) {
							this.method583(10, "Game updated - please reload page");
							local139 = 10;
						} else {
							this.method583(10, local18 + " - Will retry in " + local139 + " secs.");
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
			signlink.reporterror("22542, " + -47231 + ", " + local201.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method679(@OriginalArg(0) byte arg0) {
		try {
			if (this.aClass28_12 == null) {
				super.aClass28_2 = null;
				this.aClass28_24 = null;
				this.aClass28_22 = null;
				this.aClass28_21 = null;
				this.aClass28_23 = null;
				this.aClass28_25 = null;
				this.aClass28_26 = null;
				this.aClass28_27 = null;
				this.aClass28_15 = new Class28(128, this.method581(), 265, (byte) 33);
				Class6_Sub2_Sub2.method517();
				this.aClass28_16 = new Class28(128, this.method581(), 265, (byte) 33);
				Class6_Sub2_Sub2.method517();
				this.aClass28_12 = new Class28(509, this.method581(), 171, (byte) 33);
				Class6_Sub2_Sub2.method517();
				this.aClass28_13 = new Class28(360, this.method581(), 132, (byte) 33);
				Class6_Sub2_Sub2.method517();
				this.aClass28_14 = new Class28(360, this.method581(), 200, (byte) 33);
				Class6_Sub2_Sub2.method517();
				this.aClass28_17 = new Class28(202, this.method581(), 238, (byte) 33);
				Class6_Sub2_Sub2.method517();
				this.aClass28_18 = new Class28(203, this.method581(), 238, (byte) 33);
				Class6_Sub2_Sub2.method517();
				this.aClass28_19 = new Class28(74, this.method581(), 94, (byte) 33);
				@Pc(134) boolean local134 = false;
				Class6_Sub2_Sub2.method517();
				this.aClass28_20 = new Class28(75, this.method581(), 94, (byte) 33);
				Class6_Sub2_Sub2.method517();
				if (this.aClass36_1 != null) {
					this.method609();
					this.method653();
				}
				this.aBoolean240 = true;
			}
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("32059, " + arg0 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(IZ)V")
	private void method680(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean226 &= true;
			@Pc(9) Class18 local9 = Class18.aClass18Array1[arg0];
			for (@Pc(11) int local11 = 0; local11 < local9.anIntArray85.length && local9.anIntArray85[local11] != -1; local11++) {
				@Pc(26) Class18 local26 = Class18.aClass18Array1[local9.anIntArray85[local11]];
				if (local26.anInt366 == 1) {
					this.method680(local26.anInt374);
				}
				local26.anInt390 = 0;
				local26.anInt392 = 0;
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("80843, " + arg0 + ", " + true + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!UAWAYCTK;IZ)V")
	private void method681(@OriginalArg(0) Class6_Sub2_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt913 = 0;
			this.anInt988 = 0;
			this.method626(arg1, arg0);
			this.method659((byte) 5, arg0, arg1);
			this.method631(arg0, arg1, this.anInt827);
			this.method608(arg0, (byte) 2, arg1);
			@Pc(42) int local42;
			for (@Pc(35) int local35 = 0; local35 < this.anInt913; local35++) {
				local42 = this.anIntArray244[local35];
				if (this.aClass6_Sub2_Sub1_Sub3_Sub2Array1[local42].anInt660 != anInt928) {
					this.aClass6_Sub2_Sub1_Sub3_Sub2Array1[local42] = null;
				}
			}
			if (arg0.anInt609 != arg1) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.anInt609 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local42 = 0; local42 < this.anInt987; local42++) {
				if (this.aClass6_Sub2_Sub1_Sub3_Sub2Array1[this.anIntArray265[local42]] == null) {
					signlink.reporterror(this.aString24 + " null entry in pl list - pos:" + local42 + " size:" + this.anInt987);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("47388, " + arg0 + ", " + arg1 + ", " + false + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method682() {
		try {
			this.aBoolean226 &= true;
			if (this.anInt839 >= 2 || this.anInt999 != 0 || this.anInt843 != 0) {
				@Pc(37) String local37;
				if (this.anInt999 == 1 && this.anInt839 < 2) {
					local37 = "Use " + this.aString29 + " with...";
				} else if (this.anInt843 == 1 && this.anInt839 < 2) {
					local37 = this.aString18 + "...";
				} else {
					local37 = this.aStringArray10[this.anInt839 - 1];
				}
				if (this.anInt839 > 2) {
					local37 = local37 + "@whi@ / " + (this.anInt839 - 2) + " more options";
				}
				this.aClass6_Sub2_Sub2_Sub2_4.method169(anInt928 / 1000, local37, 16777215, 4, 15);
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("96989, " + true + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method683(@OriginalArg(1) int arg0) {
		try {
			if (!aBoolean223) {
				@Pc(16) Class6_Sub2_Sub2_Sub4 local16;
				@Pc(24) int local24;
				@Pc(32) int local32;
				@Pc(35) byte[] local35;
				@Pc(38) byte[] local38;
				@Pc(40) int local40;
				if (Class6_Sub2_Sub2_Sub3.anIntArray80[17] >= arg0) {
					local16 = Class6_Sub2_Sub2_Sub3.aClass6_Sub2_Sub2_Sub4Array1[17];
					local24 = local16.anInt770 * local16.anInt771 - 1;
					local32 = local16.anInt770 * this.anInt1039 * 2;
					local35 = local16.aByteArray20;
					local38 = this.aByteArray21;
					for (local40 = 0; local40 <= local24; local40++) {
						local38[local40] = local35[local40 - local32 & local24];
					}
					local16.aByteArray20 = local38;
					this.aByteArray21 = local35;
					Class6_Sub2_Sub2_Sub3.method249(17);
				}
				if (Class6_Sub2_Sub2_Sub3.anIntArray80[24] >= arg0) {
					local16 = Class6_Sub2_Sub2_Sub3.aClass6_Sub2_Sub2_Sub4Array1[24];
					local24 = local16.anInt770 * local16.anInt771 - 1;
					local32 = local16.anInt770 * this.anInt1039 * 2;
					local35 = local16.aByteArray20;
					local38 = this.aByteArray21;
					for (local40 = 0; local40 <= local24; local40++) {
						local38[local40] = local35[local40 - local32 & local24];
					}
					local16.aByteArray20 = local38;
					this.aByteArray21 = local35;
					Class6_Sub2_Sub2_Sub3.method249(24);
				}
				if (Class6_Sub2_Sub2_Sub3.anIntArray80[34] >= arg0) {
					local16 = Class6_Sub2_Sub2_Sub3.aClass6_Sub2_Sub2_Sub4Array1[34];
					local24 = local16.anInt770 * local16.anInt771 - 1;
					local32 = local16.anInt770 * this.anInt1039 * 2;
					local35 = local16.aByteArray20;
					local38 = this.aByteArray21;
					for (local40 = 0; local40 <= local24; local40++) {
						local38[local40] = local35[local40 - local32 & local24];
					}
					local16.aByteArray20 = local38;
					this.aByteArray21 = local35;
					Class6_Sub2_Sub2_Sub3.method249(34);
					return;
				}
			}
		} catch (@Pc(183) RuntimeException local183) {
			signlink.reporterror("26117, " + 26 + ", " + arg0 + ", " + local183.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)I")
	private int method684() {
		try {
			@Pc(14) int local14 = 3;
			if (this.anInt862 < 310) {
				@Pc(23) int local23 = this.anInt859 >> 7;
				@Pc(28) int local28 = this.anInt861 >> 7;
				@Pc(33) int local33 = aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt651 >> 7;
				@Pc(38) int local38 = aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt652 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt1026][local23][local28] & 0x4) != 0) {
					local14 = this.anInt1026;
				}
				@Pc(60) int local60;
				if (local33 > local23) {
					local60 = local33 - local23;
				} else {
					local60 = local23 - local33;
				}
				@Pc(73) int local73;
				if (local38 > local28) {
					local73 = local38 - local28;
				} else {
					local73 = local28 - local38;
				}
				@Pc(88) int local88;
				@Pc(90) int local90;
				if (local60 > local73) {
					local88 = local73 * 65536 / local60;
					local90 = 32768;
					while (local23 != local33) {
						if (local23 < local33) {
							local23++;
						} else if (local23 > local33) {
							local23--;
						}
						if ((this.aByteArrayArrayArray8[this.anInt1026][local23][local28] & 0x4) != 0) {
							local14 = this.anInt1026;
						}
						local90 += local88;
						if (local90 >= 65536) {
							local90 -= 65536;
							if (local28 < local38) {
								local28++;
							} else if (local28 > local38) {
								local28--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt1026][local23][local28] & 0x4) != 0) {
								local14 = this.anInt1026;
							}
						}
					}
				} else {
					local88 = local60 * 65536 / local73;
					local90 = 32768;
					while (local28 != local38) {
						if (local28 < local38) {
							local28++;
						} else if (local28 > local38) {
							local28--;
						}
						if ((this.aByteArrayArrayArray8[this.anInt1026][local23][local28] & 0x4) != 0) {
							local14 = this.anInt1026;
						}
						local90 += local88;
						if (local90 >= 65536) {
							local90 -= 65536;
							if (local23 < local33) {
								local23++;
							} else if (local23 > local33) {
								local23--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt1026][local23][local28] & 0x4) != 0) {
								local14 = this.anInt1026;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt1026][aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt651 >> 7][aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt652 >> 7] & 0x4) != 0) {
				local14 = this.anInt1026;
			}
			return local14;
		} catch (@Pc(256) RuntimeException local256) {
			signlink.reporterror("74906, " + 9 + ", " + local256.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)I")
	private int method685() {
		try {
			@Pc(9) int local9 = this.method616(this.anInt861, this.anInt859, this.anInt1026);
			return local9 - this.anInt860 >= 800 || (this.aByteArrayArrayArray8[this.anInt1026][this.anInt859 >> 7][this.anInt861 >> 7] & 0x4) == 0 ? 3 : this.anInt1026;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("16781, " + 90 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method686() {
		try {
			this.aBoolean238 = false;
			while (this.aBoolean245) {
				this.aBoolean238 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass6_Sub2_Sub2_Sub4_1 = null;
			this.aClass6_Sub2_Sub2_Sub4_2 = null;
			this.aClass6_Sub2_Sub2_Sub4Array2 = null;
			this.anIntArray246 = null;
			this.anIntArray247 = null;
			this.anIntArray248 = null;
			this.anIntArray249 = null;
			this.anIntArray254 = null;
			this.anIntArray255 = null;
			this.anIntArray223 = null;
			this.anIntArray224 = null;
			this.aClass6_Sub2_Sub2_Sub1_11 = null;
			this.aClass6_Sub2_Sub2_Sub1_12 = null;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("22846, " + 1 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
	private void method687() {
		try {
			this.aClass6_Sub2_Sub3_7.method391(165);
			if (this.anInt1034 != -1) {
				this.anInt1034 = -1;
				this.aBoolean252 = true;
				this.aBoolean255 = false;
				this.aBoolean247 = true;
			}
			if (this.anInt923 != -1) {
				this.anInt923 = -1;
				this.aBoolean239 = true;
				this.aBoolean255 = false;
			}
			if (this.anInt1020 != -1) {
				this.anInt1020 = -1;
				this.aBoolean240 = true;
			}
			this.anInt914 = -1;
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("37297, " + false + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method688() {
		try {
			if (this.anInt1018 > 1) {
				this.anInt1018--;
			}
			if (this.anInt1012 > 0) {
				this.anInt1012--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method663(); local22++) {
			}
			if (this.aBoolean226) {
				@Pc(41) Object local41 = this.aClass44_1.anObject1;
				@Pc(66) int local66;
				@Pc(68) int local68;
				@Pc(70) int local70;
				@Pc(103) int local103;
				synchronized (this.aClass44_1.anObject1) {
					if (!aBoolean242) {
						this.aClass44_1.anInt708 = 0;
					} else if (super.anInt820 != 0 || this.aClass44_1.anInt708 >= 40) {
						this.aClass6_Sub2_Sub3_7.method391(95);
						this.aClass6_Sub2_Sub3_7.method392(0);
						local66 = this.aClass6_Sub2_Sub3_7.anInt609;
						local68 = 0;
						@Pc(86) int local86;
						for (local70 = 0; local70 < this.aClass44_1.anInt708 && local66 - this.aClass6_Sub2_Sub3_7.anInt609 < 240; local70++) {
							local68++;
							local86 = this.aClass44_1.anIntArray162[local70];
							if (local86 < 0) {
								local86 = 0;
							} else if (local86 > 502) {
								local86 = 502;
							}
							local103 = this.aClass44_1.anIntArray161[local70];
							if (local103 < 0) {
								local103 = 0;
							} else if (local103 > 764) {
								local103 = 764;
							}
							@Pc(120) int local120 = local86 * 765 + local103;
							if (this.aClass44_1.anIntArray162[local70] == -1 && this.aClass44_1.anIntArray161[local70] == -1) {
								local103 = -1;
								local86 = -1;
								local120 = 524287;
							}
							if (local103 != this.anInt1037 || local86 != this.anInt1038) {
								@Pc(165) int local165 = local103 - this.anInt1037;
								this.anInt1037 = local103;
								@Pc(173) int local173 = local86 - this.anInt1038;
								this.anInt1038 = local86;
								if (this.anInt884 < 8 && local165 >= -32 && local165 <= 31 && local173 >= -32 && local173 <= 31) {
									local165 += 32;
									local173 += 32;
									this.aClass6_Sub2_Sub3_7.method393((this.anInt884 << 12) + (local165 << 6) + local173);
									this.anInt884 = 0;
								} else if (this.anInt884 < 8) {
									this.aClass6_Sub2_Sub3_7.method395((this.anInt884 << 19) + local120 + 8388608);
									this.anInt884 = 0;
								} else {
									this.aClass6_Sub2_Sub3_7.method396((this.anInt884 << 19) + local120 - 1073741824);
									this.anInt884 = 0;
								}
							} else if (this.anInt884 < 2047) {
								this.anInt884++;
							}
						}
						this.aClass6_Sub2_Sub3_7.method401(this.aClass6_Sub2_Sub3_7.anInt609 - local66);
						if (local68 >= this.aClass44_1.anInt708) {
							this.aClass44_1.anInt708 = 0;
						} else {
							this.aClass44_1.anInt708 -= local68;
							for (local86 = 0; local86 < this.aClass44_1.anInt708; local86++) {
								this.aClass44_1.anIntArray161[local86] = this.aClass44_1.anIntArray161[local86 + local68];
								this.aClass44_1.anIntArray162[local86] = this.aClass44_1.anIntArray162[local86 + local68];
							}
						}
					}
				}
				if (super.anInt820 != 0) {
					@Pc(336) long local336 = (super.aLong28 - this.aLong33) / 50L;
					if (local336 > 4095L) {
						local336 = 4095L;
					}
					this.aLong33 = super.aLong28;
					local66 = super.anInt822;
					if (local66 < 0) {
						local66 = 0;
					} else if (local66 > 502) {
						local66 = 502;
					}
					local68 = super.anInt821;
					if (local68 < 0) {
						local68 = 0;
					} else if (local68 > 764) {
						local68 = 764;
					}
					local70 = local66 * 765 + local68;
					@Pc(382) byte local382 = 0;
					if (super.anInt820 == 2) {
						local382 = 1;
					}
					local103 = (int) local336;
					this.aClass6_Sub2_Sub3_7.method391(217);
					this.aClass6_Sub2_Sub3_7.method435((local103 << 20) + (local382 << 19) + local70);
				}
				if (this.anInt1031 > 0) {
					this.anInt1031--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean261 = true;
				}
				if (this.aBoolean261 && this.anInt1031 <= 0) {
					this.anInt1031 = 20;
					this.aBoolean261 = false;
					this.aClass6_Sub2_Sub3_7.method391(239);
					this.aClass6_Sub2_Sub3_7.method428(this.anInt831);
					this.aClass6_Sub2_Sub3_7.method393(this.anInt832);
				}
				if (super.aBoolean215 && !this.aBoolean230) {
					this.aBoolean230 = true;
					this.aClass6_Sub2_Sub3_7.method391(207);
					this.aClass6_Sub2_Sub3_7.method392(1);
				}
				if (!super.aBoolean215 && this.aBoolean230) {
					this.aBoolean230 = false;
					this.aClass6_Sub2_Sub3_7.method391(207);
					this.aClass6_Sub2_Sub3_7.method392(0);
				}
				this.method628();
				this.method642();
				this.method661();
				this.anInt1010++;
				if (this.anInt1010 > 750) {
					this.method694();
				}
				this.method691(this.aByte34);
				this.method584();
				this.method596();
				this.anInt1039++;
				if (this.anInt967 != 0) {
					this.anInt966 += 20;
					if (this.anInt966 >= 400) {
						this.anInt967 = 0;
					}
				}
				if (this.anInt878 != 0) {
					this.anInt875++;
					if (this.anInt875 >= 15) {
						if (this.anInt878 == 2) {
							this.aBoolean252 = true;
						}
						if (this.anInt878 == 3) {
							this.aBoolean239 = true;
						}
						this.anInt878 = 0;
					}
				}
				if (this.anInt1042 != 0) {
					this.anInt997++;
					if (super.anInt815 > this.anInt1043 + 5 || super.anInt815 < this.anInt1043 - 5 || super.anInt816 > this.anInt1044 + 5 || super.anInt816 < this.anInt1044 - 5) {
						this.aBoolean243 = true;
					}
					if (super.anInt814 == 0) {
						if (this.anInt1042 == 2) {
							this.aBoolean252 = true;
						}
						if (this.anInt1042 == 3) {
							this.aBoolean239 = true;
						}
						this.anInt1042 = 0;
						if (this.aBoolean243 && this.anInt997 >= 5) {
							this.anInt886 = -1;
							this.method701();
							if (this.anInt886 == this.anInt1040 && this.anInt885 != this.anInt1041) {
								@Pc(685) Class18 local685 = Class18.aClass18Array1[this.anInt1040];
								@Pc(687) byte local687 = 0;
								if (this.anInt874 == 1 && local685.anInt383 == 206) {
									local687 = 1;
								}
								if (local685.anIntArray88[this.anInt885] <= 0) {
									local687 = 0;
								}
								if (local685.aBoolean110) {
									local66 = this.anInt1041;
									local68 = this.anInt885;
									local685.anIntArray88[local68] = local685.anIntArray88[local66];
									local685.anIntArray83[local68] = local685.anIntArray83[local66];
									local685.anIntArray88[local66] = -1;
									local685.anIntArray83[local66] = 0;
								} else if (local687 == 1) {
									local66 = this.anInt1041;
									local68 = this.anInt885;
									while (local66 != local68) {
										if (local66 > local68) {
											local685.method267(local66, local66 - 1);
											local66--;
										} else if (local66 < local68) {
											local685.method267(local66, local66 + 1);
											local66++;
										}
									}
								} else {
									local685.method267(this.anInt1041, this.anInt885);
								}
								this.aClass6_Sub2_Sub3_7.method391(159);
								this.aClass6_Sub2_Sub3_7.method427(this.anInt885);
								this.aClass6_Sub2_Sub3_7.method428(this.anInt1040);
								this.aClass6_Sub2_Sub3_7.method393(this.anInt1041);
								this.aClass6_Sub2_Sub3_7.method420(local687, this.anInt969);
							}
						} else if ((this.anInt828 == 1 || this.method638(this.anInt839 - 1)) && this.anInt839 > 2) {
							this.method618();
						} else if (this.anInt839 > 0) {
							this.method606(this.anInt839 - 1);
						}
						this.anInt875 = 10;
						super.anInt820 = 0;
					}
				}
				@Pc(860) int local860;
				@Pc(862) int local862;
				if (Class25.anInt497 != -1) {
					local860 = Class25.anInt497;
					local862 = Class25.anInt498;
					@Pc(883) boolean local883 = this.method615(local860, true, 0, 0, 0, aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0], aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0], 0, 0, local862, 0);
					Class25.anInt497 = -1;
					if (local883) {
						this.anInt964 = super.anInt821;
						this.anInt965 = super.anInt822;
						this.anInt967 = 1;
						this.anInt966 = 0;
					}
				}
				if (super.anInt820 == 1 && this.aString26 != null) {
					this.aString26 = null;
					this.aBoolean239 = true;
					super.anInt820 = 0;
				}
				this.method715();
				this.method612();
				this.method617(115);
				this.method702();
				if (super.anInt814 == 1 || super.anInt820 == 1) {
					this.anInt871++;
				}
				if (this.anInt978 == 2) {
					this.method604();
				}
				if (this.anInt978 == 2 && this.aBoolean228) {
					this.method657();
				}
				for (local860 = 0; local860 < 5; local860++) {
					@Pc(978) int local978 = this.anIntArray260[local860]++;
				}
				this.method599();
				super.anInt813++;
				if (super.anInt813 > 4500) {
					this.anInt1012 = 250;
					super.anInt813 -= 500;
					this.aClass6_Sub2_Sub3_7.method391(214);
				}
				this.anInt920++;
				if (this.anInt920 > 500) {
					this.anInt920 = 0;
					local862 = (int) (Math.random() * 8.0D);
					if ((local862 & 0x1) == 1) {
						this.anInt944 += this.anInt945;
					}
					if ((local862 & 0x2) == 2) {
						this.anInt829 += this.anInt830;
					}
					if ((local862 & 0x4) == 4) {
						this.anInt926 += this.anInt927;
					}
				}
				if (this.anInt944 < -50) {
					this.anInt945 = 2;
				}
				if (this.anInt944 > 50) {
					this.anInt945 = -2;
				}
				if (this.anInt829 < -55) {
					this.anInt830 = 2;
				}
				if (this.anInt829 > 55) {
					this.anInt830 = -2;
				}
				if (this.anInt926 < -40) {
					this.anInt927 = 1;
				}
				if (this.anInt926 > 40) {
					this.anInt927 = -1;
				}
				this.anInt961++;
				if (this.anInt961 > 500) {
					this.anInt961 = 0;
					local862 = (int) (Math.random() * 8.0D);
					if ((local862 & 0x1) == 1) {
						this.anInt867 += this.anInt868;
					}
					if ((local862 & 0x2) == 2) {
						this.anInt911 += this.anInt912;
					}
				}
				if (this.anInt867 < -60) {
					this.anInt868 = 2;
				}
				if (this.anInt867 > 60) {
					this.anInt868 = -2;
				}
				if (this.anInt911 < -20) {
					this.anInt912 = 1;
				}
				if (this.anInt911 > 10) {
					this.anInt912 = -1;
				}
				this.anInt1011++;
				if (this.anInt1011 > 50) {
					this.aClass6_Sub2_Sub3_7.method391(161);
				}
				try {
					if (this.aClass7_1 != null && this.aClass6_Sub2_Sub3_7.anInt609 > 0) {
						this.aClass7_1.method46(this.aClass6_Sub2_Sub3_7.aByteArray17, this.aClass6_Sub2_Sub3_7.anInt609);
						this.aClass6_Sub2_Sub3_7.anInt609 = 0;
						this.anInt1011 = 0;
					}
				} catch (@Pc(1220) IOException local1220) {
					this.method694();
				} catch (@Pc(1225) Exception local1225) {
					this.method622();
				}
			}
		} catch (@Pc(1230) RuntimeException local1230) {
			signlink.reporterror("28478, " + -182 + ", " + local1230.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method689() {
		try {
			@Pc(14) int local14;
			if (this.anInt994 > 0) {
				for (local14 = 0; local14 < 256; local14++) {
					if (this.anInt994 > 768) {
						this.anIntArray246[local14] = this.method635(1024 - this.anInt994, this.anIntArray247[local14], this.anIntArray248[local14]);
					} else if (this.anInt994 > 256) {
						this.anIntArray246[local14] = this.anIntArray248[local14];
					} else {
						this.anIntArray246[local14] = this.method635(256 - this.anInt994, this.anIntArray248[local14], this.anIntArray247[local14]);
					}
				}
			} else if (this.anInt995 > 0) {
				for (local14 = 0; local14 < 256; local14++) {
					if (this.anInt995 > 768) {
						this.anIntArray246[local14] = this.method635(1024 - this.anInt995, this.anIntArray247[local14], this.anIntArray249[local14]);
					} else if (this.anInt995 > 256) {
						this.anIntArray246[local14] = this.anIntArray249[local14];
					} else {
						this.anIntArray246[local14] = this.method635(256 - this.anInt995, this.anIntArray249[local14], this.anIntArray247[local14]);
					}
				}
			} else {
				for (local14 = 0; local14 < 256; local14++) {
					this.anIntArray246[local14] = this.anIntArray247[local14];
				}
			}
			for (local14 = 0; local14 < 33920; local14++) {
				this.aClass28_15.anIntArray124[local14] = this.aClass6_Sub2_Sub2_Sub1_11.anIntArray40[local14];
			}
			@Pc(185) int local185 = 0;
			@Pc(187) int local187 = 1152;
			@Pc(202) int local202;
			@Pc(206) int local206;
			@Pc(216) int local216;
			@Pc(224) int local224;
			@Pc(228) int local228;
			@Pc(232) int local232;
			@Pc(243) int local243;
			for (@Pc(189) int local189 = 1; local189 < 255; local189++) {
				local202 = this.anIntArray269[local189] * (256 - local189) / 256;
				local206 = local202 + 22;
				if (local206 < 0) {
					local206 = 0;
				}
				local185 += local206;
				for (local216 = local206; local216 < 128; local216++) {
					local224 = this.anIntArray223[local185++];
					if (local224 == 0) {
						local187++;
					} else {
						local228 = local224;
						local232 = 256 - local224;
						local224 = this.anIntArray246[local224];
						local243 = this.aClass28_15.anIntArray124[local187];
						this.aClass28_15.anIntArray124[local187++] = ((local224 & 0xFF00FF) * local228 + (local243 & 0xFF00FF) * local232 & 0xFF00FF00) + ((local224 & 0xFF00) * local228 + (local243 & 0xFF00) * local232 & 0xFF0000) >> 8;
					}
				}
				local187 += local206;
			}
			this.aClass28_15.method357(0, 0, super.aGraphics2);
			for (local202 = 0; local202 < 33920; local202++) {
				this.aClass28_16.anIntArray124[local202] = this.aClass6_Sub2_Sub2_Sub1_12.anIntArray40[local202];
			}
			local185 = 0;
			local187 = 1176;
			for (local206 = 1; local206 < 255; local206++) {
				local216 = this.anIntArray269[local206] * (256 - local206) / 256;
				local224 = 103 - local216;
				local187 += local216;
				for (local228 = 0; local228 < local224; local228++) {
					local232 = this.anIntArray223[local185++];
					if (local232 == 0) {
						local187++;
					} else {
						local243 = local232;
						@Pc(366) int local366 = 256 - local232;
						local232 = this.anIntArray246[local232];
						@Pc(377) int local377 = this.aClass28_16.anIntArray124[local187];
						this.aClass28_16.anIntArray124[local187++] = ((local232 & 0xFF00FF) * local243 + (local377 & 0xFF00FF) * local366 & 0xFF00FF00) + ((local232 & 0xFF00) * local243 + (local377 & 0xFF00) * local366 & 0xFF0000) >> 8;
					}
				}
				local185 += 128 - local224;
				local187 += 128 - local224 - local216;
			}
			this.aClass28_16.method357(0, 637, super.aGraphics2);
		} catch (@Pc(449) RuntimeException local449) {
			signlink.reporterror("26714, " + -77 + ", " + local449.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method690() {
		try {
			this.aBoolean232 = true;
			for (@Pc(6) int local6 = 0; local6 < 7; local6++) {
				this.anIntArray271[local6] = -1;
				for (@Pc(15) int local15 = 0; local15 < Class23.anInt464; local15++) {
					if (!Class23.aClass23Array1[local15].aBoolean134 && Class23.aClass23Array1[local15].anInt465 == local6 + (this.aBoolean257 ? 0 : 7)) {
						this.anIntArray271[local6] = local15;
						break;
					}
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("38614, " + 454 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method691(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != 1) {
				this.anInt993 = 118;
			}
			for (@Pc(9) int local9 = -1; local9 < this.anInt987; local9++) {
				@Pc(17) int local17;
				if (local9 == -1) {
					local17 = this.anInt986;
				} else {
					local17 = this.anIntArray265[local9];
				}
				@Pc(29) Class6_Sub2_Sub1_Sub3_Sub2 local29 = this.aClass6_Sub2_Sub1_Sub3_Sub2Array1[local17];
				if (local29 != null) {
					this.method585(594, 1, local29);
				}
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("77335, " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!UAWAYCTK;II)V")
	private void method692(@OriginalArg(0) Class6_Sub2_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(5) boolean local5 = false;
			this.anInt913 = 0;
			this.anInt988 = 0;
			this.method605(arg0, arg1);
			this.method693(arg1, arg0);
			this.method636(arg0, this.aByte31, arg1);
			@Pc(36) int local36;
			for (@Pc(29) int local29 = 0; local29 < this.anInt913; local29++) {
				local36 = this.anIntArray244[local29];
				if (this.aClass6_Sub2_Sub1_Sub3_Sub1Array1[local36].anInt660 != anInt928) {
					this.aClass6_Sub2_Sub1_Sub3_Sub1Array1[local36].aClass16_1 = null;
					this.aClass6_Sub2_Sub1_Sub3_Sub1Array1[local36] = null;
				}
			}
			if (arg0.anInt609 != arg1) {
				signlink.reporterror(this.aString24 + " size mismatch in getnpcpos - pos:" + arg0.anInt609 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local36 = 0; local36 < this.anInt939; local36++) {
				if (this.aClass6_Sub2_Sub1_Sub3_Sub1Array1[this.anIntArray253[local36]] == null) {
					signlink.reporterror(this.aString24 + " null entry in npc list - pos:" + local36 + " size:" + this.anInt939);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("31113, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IILclient!UAWAYCTK;)V")
	private void method693(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub2_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt610 + 21 < arg0 * 8) {
					@Pc(22) int local22 = arg1.method413(14);
					if (local22 != 16383) {
						if (this.aClass6_Sub2_Sub1_Sub3_Sub1Array1[local22] == null) {
							this.aClass6_Sub2_Sub1_Sub3_Sub1Array1[local22] = new Class6_Sub2_Sub1_Sub3_Sub1();
						}
						@Pc(42) Class6_Sub2_Sub1_Sub3_Sub1 local42 = this.aClass6_Sub2_Sub1_Sub3_Sub1Array1[local22];
						this.anIntArray253[this.anInt939++] = local22;
						local42.anInt660 = anInt928;
						local42.aClass16_1 = Class16.method207(arg1.method413(12));
						@Pc(68) int local68 = arg1.method413(1);
						if (local68 == 1) {
							this.anIntArray266[this.anInt988++] = local22;
						}
						@Pc(87) int local87 = arg1.method413(5);
						if (local87 > 15) {
							local87 -= 32;
						}
						@Pc(96) int local96 = arg1.method413(5);
						if (local96 > 15) {
							local96 -= 32;
						}
						@Pc(105) int local105 = arg1.method413(1);
						local42.anInt648 = local42.aClass16_1.aByte10;
						local42.anInt649 = local42.aClass16_1.anInt222;
						local42.anInt643 = local42.aClass16_1.anInt212;
						local42.anInt644 = local42.aClass16_1.anInt223;
						local42.anInt645 = local42.aClass16_1.anInt209;
						local42.anInt646 = local42.aClass16_1.anInt219;
						local42.anInt640 = local42.aClass16_1.anInt207;
						local42.method449(aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray144[0] + local96, local105 == 1, aClass6_Sub2_Sub1_Sub3_Sub2_1.anIntArray143[0] + local87);
						continue;
					}
				}
				arg1.method414();
				return;
			}
		} catch (@Pc(168) RuntimeException local168) {
			signlink.reporterror("67846, " + 969 + ", " + arg0 + ", " + arg1 + ", " + local168.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
	private void method694() {
		try {
			if (this.anInt1012 > 0) {
				this.method622();
			} else {
				this.aClass28_23.method356();
				this.aClass6_Sub2_Sub2_Sub2_3.method160(144, 257, "Connection lost", 0);
				this.aClass6_Sub2_Sub2_Sub2_3.method160(143, 256, "Connection lost", 16777215);
				this.aClass6_Sub2_Sub2_Sub2_3.method160(159, 257, "Please wait - attempting to reestablish", 0);
				this.aClass6_Sub2_Sub2_Sub2_3.method160(158, 256, "Please wait - attempting to reestablish", 16777215);
				this.aClass28_23.method357(4, 4, super.aGraphics2);
				this.anInt1027 = 0;
				this.anInt954 = 0;
				@Pc(68) Class7 local68 = this.aClass7_1;
				this.aBoolean226 = false;
				this.anInt996 = 0;
				this.method611(this.aString24, this.aString25, true);
				if (!this.aBoolean226) {
					this.method622();
				}
				try {
					local68.method42();
				} catch (@Pc(91) Exception local91) {
				}
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("61170, " + false + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method695(@OriginalArg(0) String arg0) throws IOException {
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!LYHLTGUG;B)Z")
	private boolean method696(@OriginalArg(0) Class18 arg0) {
		try {
			@Pc(11) int local11 = arg0.anInt383;
			if (local11 >= 1 && local11 <= 200 || !(local11 < 701 || local11 > 900)) {
				if (local11 >= 801) {
					local11 -= 701;
				} else if (local11 >= 701) {
					local11 -= 601;
				} else if (local11 >= 101) {
					local11 -= 101;
				} else {
					local11--;
				}
				this.aStringArray10[this.anInt839] = "Remove @whi@" + this.aStringArray13[local11];
				this.anIntArray233[this.anInt839] = 280;
				this.anInt839++;
				this.aStringArray10[this.anInt839] = "Message @whi@" + this.aStringArray13[local11];
				this.anIntArray233[this.anInt839] = 73;
				this.anInt839++;
				return true;
			} else if (local11 >= 401 && local11 <= 500) {
				this.aStringArray10[this.anInt839] = "Remove @whi@" + arg0.aString10;
				this.anIntArray233[this.anInt839] = 279;
				this.anInt839++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("70400, " + arg0 + ", " + 44 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Z")
	private boolean method698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(7) Class18 local7 = Class18.aClass18Array1[arg0];
			for (@Pc(9) int local9 = 0; local9 < local7.anIntArray85.length && local7.anIntArray85[local9] != -1; local9++) {
				@Pc(24) Class18 local24 = Class18.aClass18Array1[local7.anIntArray85[local9]];
				if (local24.anInt366 == 1) {
					local3 |= this.method698(local24.anInt374, arg1);
				}
				@Pc(59) int local59;
				if (local24.anInt366 == 6 && (local24.anInt384 != -1 || local24.anInt385 != -1)) {
					@Pc(54) boolean local54 = this.method641(local24);
					if (local54) {
						local59 = local24.anInt385;
					} else {
						local59 = local24.anInt384;
					}
					if (local59 != -1) {
						@Pc(71) Class33 local71 = Class33.aClass33Array1[local59];
						local24.anInt392 += arg1;
						while (local24.anInt392 > local71.method371(local24.anInt390, this.anInt842)) {
							local24.anInt392 -= local71.method371(local24.anInt390, this.anInt842) + 1;
							local24.anInt390++;
							if (local24.anInt390 >= local71.anInt558) {
								local24.anInt390 -= local71.anInt559;
								if (local24.anInt390 < 0 || local24.anInt390 >= local71.anInt558) {
									local24.anInt390 = 0;
								}
							}
							local3 = true;
						}
					}
				}
				if (local24.anInt366 == 6 && local24.anInt367 != 0) {
					@Pc(144) int local144 = local24.anInt367 >> 16;
					local59 = local24.anInt367 << 16 >> 16;
					@Pc(155) int local155 = local144 * arg1;
					local59 *= arg1;
					local24.anInt379 = local24.anInt379 + local155 & 0x7FF;
					local24.anInt380 = local24.anInt380 + local59 & 0x7FF;
					local3 = true;
				}
			}
			this.anInt1008 += 0;
			return local3;
		} catch (@Pc(192) RuntimeException local192) {
			signlink.reporterror("61864, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local192.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)V")
	private void method699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass6_Sub2_Sub2_Sub4_6.method531(arg3, arg2, this.anInt992);
			this.aClass6_Sub2_Sub2_Sub4_7.method531(arg3, arg2 + arg1 - 16, this.anInt992);
			Class6_Sub2_Sub2.method519(this.anInt957, arg2 + 16, arg1 - 32, arg3, 16);
			@Pc(46) int local46 = (arg1 - 32) * arg1 / arg0;
			if (local46 < 8) {
				local46 = 8;
			}
			@Pc(63) int local63 = (arg1 - local46 - 32) * arg4 / (arg0 - arg1);
			Class6_Sub2_Sub2.method519(this.anInt932, arg2 + local63 + 16, local46, arg3, 16);
			Class6_Sub2_Sub2.method524(this.anInt915, arg3, local46, arg2 + local63 + 16);
			Class6_Sub2_Sub2.method524(this.anInt915, arg3 + 1, local46, arg2 + local63 + 16);
			Class6_Sub2_Sub2.method522(arg2 + local63 + 16, 16, this.anInt915, arg3);
			Class6_Sub2_Sub2.method522(arg2 + local63 + 17, 16, this.anInt915, arg3);
			Class6_Sub2_Sub2.method524(this.anInt906, arg3 + 15, local46, arg2 + local63 + 16);
			Class6_Sub2_Sub2.method524(this.anInt906, arg3 + 14, local46 - 1, arg2 + local63 + 17);
			Class6_Sub2_Sub2.method522(arg2 + local63 + local46 + 15, 16, this.anInt906, arg3);
			Class6_Sub2_Sub2.method522(arg2 + local63 + local46 + 14, 15, this.anInt906, arg3 + 1);
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("67469, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 7 + ", " + arg3 + ", " + arg4 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!UFGXOLGK;II)V")
	private void method700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub2_Sub1_Sub3_Sub2 arg2, @OriginalArg(4) int arg3) {
		try {
			this.anInt1008 += 0;
			if (arg2 != aClass6_Sub2_Sub1_Sub3_Sub2_1 && this.anInt839 < 400) {
				@Pc(41) String local41;
				if (arg2.anInt667 == 0) {
					local41 = arg2.aString15 + method625(arg2.anInt669, aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt669) + " (level-" + arg2.anInt669 + ")";
				} else {
					local41 = arg2.aString15 + " (skill-" + arg2.anInt667 + ")";
				}
				@Pc(171) int local171;
				if (this.anInt999 == 1) {
					this.aStringArray10[this.anInt839] = "Use " + this.aString29 + " with @whi@" + local41;
					this.anIntArray233[this.anInt839] = 863;
					this.anIntArray234[this.anInt839] = arg1;
					this.anIntArray231[this.anInt839] = arg3;
					this.anIntArray232[this.anInt839] = arg0;
					this.anInt839++;
				} else if (this.anInt843 != 1) {
					for (local171 = 4; local171 >= 0; local171--) {
						if (this.aStringArray8[local171] != null) {
							this.aStringArray10[this.anInt839] = this.aStringArray8[local171] + " @whi@" + local41;
							@Pc(198) short local198 = 0;
							if (this.aStringArray8[local171].equalsIgnoreCase("attack")) {
								if (arg2.anInt669 > aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt669) {
									local198 = 2000;
								}
								if (aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt665 != 0 && arg2.anInt665 != 0) {
									if (aClass6_Sub2_Sub1_Sub3_Sub2_1.anInt665 == arg2.anInt665) {
										local198 = 2000;
									} else {
										local198 = 0;
									}
								}
							} else if (this.aBooleanArray12[local171]) {
								local198 = 2000;
							}
							if (local171 == 0) {
								this.anIntArray233[this.anInt839] = local198 + 267;
							}
							if (local171 == 1) {
								this.anIntArray233[this.anInt839] = local198 + 962;
							}
							if (local171 == 2) {
								this.anIntArray233[this.anInt839] = local198 + 275;
							}
							if (local171 == 3) {
								this.anIntArray233[this.anInt839] = local198 + 634;
							}
							if (local171 == 4) {
								this.anIntArray233[this.anInt839] = local198 + 187;
							}
							this.anIntArray234[this.anInt839] = arg1;
							this.anIntArray231[this.anInt839] = arg3;
							this.anIntArray232[this.anInt839] = arg0;
							this.anInt839++;
						}
					}
				} else if ((this.anInt845 & 0x8) == 8) {
					this.aStringArray10[this.anInt839] = this.aString18 + " @whi@" + local41;
					this.anIntArray233[this.anInt839] = 222;
					this.anIntArray234[this.anInt839] = arg1;
					this.anIntArray231[this.anInt839] = arg3;
					this.anIntArray232[this.anInt839] = arg0;
					this.anInt839++;
				}
				for (local171 = 0; local171 < this.anInt839; local171++) {
					if (this.anIntArray233[local171] == 904) {
						this.aStringArray10[local171] = "Walk here @whi@" + local41;
						return;
					}
				}
			}
		} catch (@Pc(348) RuntimeException local348) {
			signlink.reporterror("31751, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + local348.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean220) {
			this.method671();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method701() {
		try {
			if (this.anInt1042 == 0) {
				this.aStringArray10[0] = "Cancel";
				this.anIntArray233[0] = 1966;
				this.anInt839 = 1;
				this.method620(this.aBoolean224);
				this.anInt1007 = 0;
				this.anInt910 = 0;
				if (super.anInt815 > 4 && super.anInt816 > 4 && super.anInt815 < 516 && super.anInt816 < 338) {
					if (this.anInt914 == -1) {
						this.method716();
					} else {
						this.method713(Class18.aClass18Array1[this.anInt914], 0, super.anInt815, 4, 0, super.anInt816, 4);
					}
				}
				if (this.anInt1007 != this.anInt858) {
					this.anInt858 = this.anInt1007;
				}
				if (this.anInt910 != this.anInt864) {
					this.anInt864 = this.anInt910;
				}
				this.anInt1007 = 0;
				this.anInt910 = 0;
				if (super.anInt815 > 553 && super.anInt816 > 205 && super.anInt815 < 743 && super.anInt816 < 466) {
					if (this.anInt1034 != -1) {
						this.method713(Class18.aClass18Array1[this.anInt1034], 1, super.anInt815, 205, 0, super.anInt816, 553);
					} else if (this.anIntArray259[this.anInt836] != -1) {
						this.method713(Class18.aClass18Array1[this.anIntArray259[this.anInt836]], 1, super.anInt815, 205, 0, super.anInt816, 553);
					}
				}
				if (this.anInt1007 != this.anInt956) {
					this.aBoolean252 = true;
					this.anInt956 = this.anInt1007;
				}
				if (this.anInt910 != this.anInt1014) {
					this.aBoolean252 = true;
					this.anInt1014 = this.anInt910;
				}
				this.anInt1007 = 0;
				this.anInt910 = 0;
				if (super.anInt815 > 17 && super.anInt816 > 357 && super.anInt815 < 496 && super.anInt816 < 453) {
					if (this.anInt923 != -1) {
						this.method713(Class18.aClass18Array1[this.anInt923], 2, super.anInt815, 357, 0, super.anInt816, 17);
					} else if (this.anInt837 != -1) {
						this.method713(Class18.aClass18Array1[this.anInt837], 3, super.anInt815, 357, 0, super.anInt816, 17);
					} else if (super.anInt816 < 434 && super.anInt815 < 426) {
						this.method637(super.anInt815 - 17, super.anInt816 - 357);
					}
				}
				if (this.anInt923 != -1 && this.anInt1007 != this.anInt937) {
					this.aBoolean239 = true;
					this.anInt937 = this.anInt1007;
				}
				if (this.anInt923 != -1 && this.anInt910 != this.anInt971) {
					this.aBoolean239 = true;
					this.anInt971 = this.anInt910;
				}
				@Pc(302) boolean local302 = false;
				while (!local302) {
					local302 = true;
					for (@Pc(308) int local308 = 0; local308 < this.anInt839 - 1; local308++) {
						if (this.anIntArray233[local308] < 1000 && this.anIntArray233[local308 + 1] > 1000) {
							@Pc(329) String local329 = this.aStringArray10[local308];
							this.aStringArray10[local308] = this.aStringArray10[local308 + 1];
							this.aStringArray10[local308 + 1] = local329;
							@Pc(351) int local351 = this.anIntArray233[local308];
							this.anIntArray233[local308] = this.anIntArray233[local308 + 1];
							this.anIntArray233[local308 + 1] = local351;
							@Pc(373) int local373 = this.anIntArray231[local308];
							this.anIntArray231[local308] = this.anIntArray231[local308 + 1];
							this.anIntArray231[local308 + 1] = local373;
							@Pc(395) int local395 = this.anIntArray232[local308];
							this.anIntArray232[local308] = this.anIntArray232[local308 + 1];
							this.anIntArray232[local308 + 1] = local395;
							@Pc(417) int local417 = this.anIntArray234[local308];
							this.anIntArray234[local308] = this.anIntArray234[local308 + 1];
							this.anIntArray234[local308 + 1] = local417;
							local302 = false;
						}
					}
				}
			}
		} catch (@Pc(447) RuntimeException local447) {
			signlink.reporterror("39956, " + -7 + ", " + local447.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method702() {
		try {
			if (super.anInt820 == 1) {
				if (super.anInt821 >= 6 && super.anInt821 <= 106 && super.anInt822 >= 467 && super.anInt822 <= 499) {
					this.anInt1036 = (this.anInt1036 + 1) % 4;
					this.aBoolean248 = true;
					this.aBoolean239 = true;
					this.aClass6_Sub2_Sub3_7.method391(4);
					this.aClass6_Sub2_Sub3_7.method392(this.anInt1036);
					this.aClass6_Sub2_Sub3_7.method392(this.anInt934);
					this.aClass6_Sub2_Sub3_7.method392(this.anInt1006);
				}
				if (super.anInt821 >= 135 && super.anInt821 <= 235 && super.anInt822 >= 467 && super.anInt822 <= 499) {
					this.anInt934 = (this.anInt934 + 1) % 3;
					this.aBoolean248 = true;
					this.aBoolean239 = true;
					this.aClass6_Sub2_Sub3_7.method391(4);
					this.aClass6_Sub2_Sub3_7.method392(this.anInt1036);
					this.aClass6_Sub2_Sub3_7.method392(this.anInt934);
					this.aClass6_Sub2_Sub3_7.method392(this.anInt1006);
				}
				if (super.anInt821 >= 273 && super.anInt821 <= 373 && super.anInt822 >= 467 && super.anInt822 <= 499) {
					this.anInt1006 = (this.anInt1006 + 1) % 3;
					this.aBoolean248 = true;
					this.aBoolean239 = true;
					this.aClass6_Sub2_Sub3_7.method391(4);
					this.aClass6_Sub2_Sub3_7.method392(this.anInt1036);
					this.aClass6_Sub2_Sub3_7.method392(this.anInt934);
					this.aClass6_Sub2_Sub3_7.method392(this.anInt1006);
				}
				if (super.anInt821 >= 412 && super.anInt821 <= 512 && super.anInt822 >= 467 && super.anInt822 <= 499) {
					if (this.anInt914 == -1) {
						this.method687();
						this.aString28 = "";
						this.aBoolean254 = false;
						for (@Pc(192) int local192 = 0; local192 < Class18.aClass18Array1.length; local192++) {
							if (Class18.aClass18Array1[local192] != null && Class18.aClass18Array1[local192].anInt383 == 600) {
								this.anInt888 = this.anInt914 = Class18.aClass18Array1[local192].anInt369;
								return;
							}
						}
						return;
					}
					this.method648("", "Please close the interface you have open before using 'report abuse'", 0, this.aBoolean235);
					return;
				}
			}
		} catch (@Pc(229) RuntimeException local229) {
			signlink.reporterror("56972, " + 9 + ", " + local229.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IILclient!IBHVCUAH;I)V")
	private void method703(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub2_Sub2_Sub1 arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg2 * arg2 + arg0 * arg0;
			if (local7 > 4225 && local7 < 90000) {
				@Pc(30) int local30 = this.anInt832 + this.anInt867 & 0x7FF;
				@Pc(34) int local34 = Class6_Sub2_Sub1_Sub6.anIntArray202[local30];
				@Pc(38) int local38 = Class6_Sub2_Sub1_Sub6.anIntArray203[local30];
				@Pc(47) int local47 = local34 * 256 / (this.anInt911 + 256);
				@Pc(56) int local56 = local38 * 256 / (this.anInt911 + 256);
				@Pc(66) int local66 = arg0 * local47 + arg2 * local56 >> 16;
				@Pc(76) int local76 = arg0 * local56 - arg2 * local47 >> 16;
				@Pc(82) double local82 = Math.atan2((double) local66, (double) local76);
				@Pc(88) int local88 = (int) (Math.sin(local82) * 63.0D);
				@Pc(94) int local94 = (int) (Math.cos(local82) * 57.0D);
				this.aClass6_Sub2_Sub2_Sub1_4.method142(local82, 83 - local94 - 20, local88 + 94 + 4 - 10);
			} else {
				this.method644(arg2, arg0, arg1);
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("29916, " + arg0 + ", " + -325 + ", " + arg1 + ", " + arg2 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method704(@OriginalArg(0) byte arg0) {
		try {
			@Pc(41) int local41;
			@Pc(54) int local54;
			@Pc(58) int local58;
			@Pc(62) int local62;
			@Pc(110) int local110;
			@Pc(124) int local124;
			@Pc(136) int local136;
			@Pc(195) int local195;
			try {
				this.anInt962 = -1;
				this.aClass39_11.method463();
				this.aClass39_10.method463();
				anInt1013++;
				if (anInt1013 > 118) {
					anInt1013 = 0;
					this.aClass6_Sub2_Sub3_7.method391(118);
					this.aClass6_Sub2_Sub3_7.method396(0);
				}
				Class6_Sub2_Sub2_Sub3.method245();
				this.method614(this.anInt959);
				this.aClass25_1.method300();
				System.gc();
				for (local41 = 0; local41 < 4; local41++) {
					this.aClass3Array1[local41].method25();
				}
				for (local54 = 0; local54 < 4; local54++) {
					for (local58 = 0; local58 < 104; local58++) {
						for (local62 = 0; local62 < 104; local62++) {
							this.aByteArrayArrayArray8[local54][local58][local62] = 0;
						}
					}
				}
				@Pc(96) Class15 local96 = new Class15(104, 104, this.anIntArrayArrayArray7, (byte) -35, this.aByteArrayArrayArray8);
				local62 = this.aByteArrayArray4.length;
				this.aClass6_Sub2_Sub3_7.method391(161);
				@Pc(257) int local257;
				@Pc(245) int local245;
				if (!this.aBoolean253) {
					@Pc(141) byte[] local141;
					for (local110 = 0; local110 < local62; local110++) {
						local124 = (this.anIntArray236[local110] >> 8) * 64 - this.anInt893;
						local136 = (this.anIntArray236[local110] & 0xFF) * 64 - this.anInt894;
						local141 = this.aByteArrayArray4[local110];
						if (local141 != null) {
							local96.method195(local124, (this.anInt1033 - 6) * 8, (this.anInt1032 - 6) * 8, this.aClass3Array1, local141, local136);
						}
					}
					for (local124 = 0; local124 < local62; local124++) {
						local136 = (this.anIntArray236[local124] >> 8) * 64 - this.anInt893;
						local195 = (this.anIntArray236[local124] & 0xFF) * 64 - this.anInt894;
						@Pc(200) byte[] local200 = this.aByteArrayArray4[local124];
						if (local200 == null && this.anInt1033 < 800) {
							local96.method175(local136, 64, local195, 64);
						}
					}
					this.aClass6_Sub2_Sub3_7.method391(161);
					for (local136 = 0; local136 < local62; local136++) {
						local141 = this.aByteArrayArray5[local136];
						if (local141 != null) {
							local245 = (this.anIntArray236[local136] >> 8) * 64 - this.anInt893;
							local257 = (this.anIntArray236[local136] & 0xFF) * 64 - this.anInt894;
							local96.method183(local257, local141, this.aClass3Array1, this.aClass25_1, local245);
						}
					}
				}
				if (this.aBoolean253) {
					local110 = 0;
					label250: while (true) {
						@Pc(316) int local316;
						@Pc(322) int local322;
						@Pc(332) int local332;
						@Pc(334) int local334;
						if (local110 >= 4) {
							for (local124 = 0; local124 < 13; local124++) {
								for (local136 = 0; local136 < 13; local136++) {
									local195 = this.anIntArrayArrayArray8[0][local124][local136];
									if (local195 == -1) {
										local96.method175(local124 * 8, 8, local136 * 8, 8);
									}
								}
							}
							this.aClass6_Sub2_Sub3_7.method391(161);
							local136 = 0;
							while (true) {
								if (local136 >= 4) {
									break label250;
								}
								for (local195 = 0; local195 < 13; local195++) {
									for (local245 = 0; local245 < 13; local245++) {
										local257 = this.anIntArrayArrayArray8[local136][local195][local245];
										if (local257 != -1) {
											local316 = local257 >> 24 & 0x3;
											local322 = local257 >> 1 & 0x3;
											local332 = local257 >> 14 & 0x3FF;
											local334 = local257 >> 3 & 0x7FF;
											@Pc(497) int local497 = (local332 / 8 << 8) + local334 / 8;
											for (@Pc(499) int local499 = 0; local499 < this.anIntArray236.length; local499++) {
												if (this.anIntArray236[local499] == local497 && this.aByteArrayArray5[local499] != null) {
													local96.method192((local332 & 0x7) * 8, local195 * 8, local245 * 8, this.aByteArrayArray5[local499], local322, local136, this.aClass25_1, (local334 & 0x7) * 8, local316, this.aClass3Array1);
													break;
												}
											}
										}
									}
								}
								local136++;
							}
						}
						for (local124 = 0; local124 < 13; local124++) {
							for (local136 = 0; local136 < 13; local136++) {
								local195 = this.anIntArrayArrayArray8[local110][local124][local136];
								if (local195 != -1) {
									local245 = local195 >> 24 & 0x3;
									local257 = local195 >> 1 & 0x3;
									local316 = local195 >> 14 & 0x3FF;
									local322 = local195 >> 3 & 0x7FF;
									local332 = (local316 / 8 << 8) + local322 / 8;
									for (local334 = 0; local334 < this.anIntArray236.length; local334++) {
										if (this.anIntArray236[local334] == local332 && this.aByteArrayArray4[local334] != null) {
											local96.method177(local257, local136 * 8, this.aByteArrayArray4[local334], this.aClass3Array1, local124 * 8, local245, (local322 & 0x7) * 8, (local316 & 0x7) * 8, local110);
											break;
										}
									}
								}
							}
						}
						local110++;
					}
				}
				this.aClass6_Sub2_Sub3_7.method391(161);
				local96.method179(this.aClass3Array1, this.aClass25_1);
				this.aClass28_23.method356();
				this.aClass6_Sub2_Sub3_7.method391(161);
				local110 = Class15.anInt180;
				if (local110 > this.anInt1026) {
					local110 = this.anInt1026;
				}
				if (local110 < this.anInt1026 - 1) {
					local110 = this.anInt1026 - 1;
				}
				if (aBoolean223) {
					this.aClass25_1.method301(Class15.anInt180);
				} else {
					this.aClass25_1.method301(0);
				}
				for (local124 = 0; local124 < 104; local124++) {
					for (local136 = 0; local136 < 104; local136++) {
						this.method610(local124, local136);
					}
				}
				this.method675();
			} catch (@Pc(642) Exception local642) {
			}
			Class2.aClass10_2.method77();
			if (super.aFrame_Sub1_2 != null) {
				this.aClass6_Sub2_Sub3_7.method391(37);
				this.aClass6_Sub2_Sub3_7.method396(1057001181);
			}
			if (aBoolean223 && signlink.aRandomAccessFile3 != null) {
				local41 = this.aClass9_Sub1_1.method61(0);
				for (local54 = 0; local54 < local41; local54++) {
					local58 = this.aClass9_Sub1_1.method69(local54);
					if ((local58 & 0x79) == 0) {
						Class6_Sub2_Sub1_Sub6.method486(local54);
					}
				}
			}
			System.gc();
			Class6_Sub2_Sub2_Sub3.method246();
			this.aClass9_Sub1_1.method55();
			local41 = (this.anInt1032 - 6) / 8 - 1;
			local54 = (this.anInt1032 + 6) / 8 + 1;
			local58 = (this.anInt1033 - 6) / 8 - 1;
			local62 = (this.anInt1033 + 6) / 8 + 1;
			@Pc(736) boolean local736 = false;
			if (this.aBoolean218) {
				local41 = 49;
				local54 = 50;
				local58 = 49;
				local62 = 50;
			}
			for (local110 = local41; local110 <= local54; local110++) {
				for (local124 = local58; local124 <= local62; local124++) {
					if (local110 == local41 || local110 == local54 || local124 == local58 || local124 == local62) {
						local136 = this.aClass9_Sub1_1.method68(local124, 0, local110);
						if (local136 != -1) {
							this.aClass9_Sub1_1.method65(local136, 3);
						}
						local195 = this.aClass9_Sub1_1.method68(local124, 1, local110);
						if (local195 != -1) {
							this.aClass9_Sub1_1.method65(local195, 3);
						}
					}
				}
			}
		} catch (@Pc(815) RuntimeException local815) {
			signlink.reporterror("70770, " + arg0 + ", " + local815.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method705(@OriginalArg(0) int arg0) {
		try {
			@Pc(6) Class6_Sub2_Sub1_Sub5 local6 = (Class6_Sub2_Sub1_Sub5) this.aClass39_10.method459();
			@Pc(10) boolean local10 = false;
			while (local6 != null) {
				if (local6.anInt589 != this.anInt1026 || anInt928 > local6.anInt597) {
					local6.method512();
				} else if (anInt928 >= local6.anInt596) {
					if (local6.anInt588 > 0) {
						@Pc(40) Class6_Sub2_Sub1_Sub3_Sub1 local40 = this.aClass6_Sub2_Sub1_Sub3_Sub1Array1[local6.anInt588 - 1];
						if (local40 != null && local40.anInt651 >= 0 && local40.anInt651 < 13312 && local40.anInt652 >= 0 && local40.anInt652 < 13312) {
							local6.method386(this.method616(local40.anInt652, local40.anInt651, local6.anInt589) - local6.anInt595, local40.anInt651, local40.anInt652, anInt928);
						}
					}
					if (local6.anInt588 < 0) {
						@Pc(85) int local85 = -local6.anInt588 - 1;
						@Pc(91) Class6_Sub2_Sub1_Sub3_Sub2 local91;
						if (local85 == this.anInt943) {
							local91 = aClass6_Sub2_Sub1_Sub3_Sub2_1;
						} else {
							local91 = this.aClass6_Sub2_Sub1_Sub3_Sub2Array1[local85];
						}
						if (local91 != null && local91.anInt651 >= 0 && local91.anInt651 < 13312 && local91.anInt652 >= 0 && local91.anInt652 < 13312) {
							local6.method386(this.method616(local91.anInt652, local91.anInt651, local6.anInt589) - local6.anInt595, local91.anInt651, local91.anInt652, anInt928);
						}
					}
					local6.method387(this.anInt953, this.anInt1039);
					this.aClass25_1.method311(60, (int) local6.aDouble1, local6.anInt583, -1, (int) local6.aDouble3, this.anInt1026, (int) local6.aDouble2, local6, false);
				}
				local6 = (Class6_Sub2_Sub1_Sub5) this.aClass39_10.method461();
			}
		} catch (@Pc(172) RuntimeException local172) {
			signlink.reporterror("63517, " + arg0 + ", " + local172.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLclient!TTYUWHXI;)V")
	private void method706(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub2_Sub1_Sub3 arg1) {
		try {
			this.method707(arg1.anInt651, arg0, arg1.anInt652, this.aByte37);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("56734, " + arg0 + ", " + false + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIB)V")
	private void method707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			if (arg0 >= 128 && arg2 >= 128 && arg0 <= 13056 && arg2 <= 13056) {
				@Pc(28) int local28 = this.method616(arg2, arg0, this.anInt1026) - arg1;
				@Pc(33) int local33 = arg0 - this.anInt859;
				@Pc(38) int local38 = local28 - this.anInt860;
				@Pc(43) int local43 = arg2 - this.anInt861;
				if (arg3 != this.aByte41) {
					this.anInt1009 = this.aClass6_Sub2_Sub3_8.method402();
				}
				@Pc(57) int local57 = Class6_Sub2_Sub1_Sub6.anIntArray202[this.anInt862];
				@Pc(62) int local62 = Class6_Sub2_Sub1_Sub6.anIntArray203[this.anInt862];
				@Pc(67) int local67 = Class6_Sub2_Sub1_Sub6.anIntArray202[this.anInt863];
				@Pc(72) int local72 = Class6_Sub2_Sub1_Sub6.anIntArray203[this.anInt863];
				@Pc(82) int local82 = local43 * local67 + local33 * local72 >> 16;
				local43 = local43 * local72 - local33 * local67 >> 16;
				local33 = local82;
				@Pc(104) int local104 = local38 * local62 - local43 * local57 >> 16;
				local43 = local38 * local57 + local43 * local62 >> 16;
				if (local43 >= 50) {
					this.anInt935 = Class6_Sub2_Sub2_Sub3.anInt340 + (local33 << 9) / local43;
					this.anInt936 = Class6_Sub2_Sub2_Sub3.anInt341 + (local104 << 9) / local43;
				} else {
					this.anInt935 = -1;
					this.anInt936 = -1;
				}
			} else {
				this.anInt935 = -1;
				this.anInt936 = -1;
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("32990, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!DOIBONME;)V")
	private void method708(@OriginalArg(1) Class6_Sub1 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt65 == 0) {
				local1 = this.aClass25_1.method326(arg0.anInt64, arg0.anInt66, arg0.anInt67);
			}
			if (arg0.anInt65 == 1) {
				local1 = this.aClass25_1.method327(arg0.anInt67, arg0.anInt66, arg0.anInt64);
			}
			if (arg0.anInt65 == 2) {
				local1 = this.aClass25_1.method328(arg0.anInt64, arg0.anInt66, arg0.anInt67);
			}
			if (arg0.anInt65 == 3) {
				local1 = this.aClass25_1.method329(arg0.anInt64, arg0.anInt66, arg0.anInt67);
			}
			if (local1 != 0) {
				@Pc(76) int local76 = this.aClass25_1.method330(arg0.anInt64, arg0.anInt66, arg0.anInt67, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local76 & 0x1F;
				local7 = local76 >> 6;
			}
			arg0.anInt59 = local3;
			arg0.anInt61 = local5;
			arg0.anInt60 = local7;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("7009, " + 0 + ", " + arg0 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)V")
	private void method709(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = Class35.aClass35Array1[arg1].anInt576;
			if (local4 != 0) {
				@Pc(12) int local12 = this.anIntArray240[arg1];
				if (arg0 == 109) {
					if (local4 == 1) {
						if (local12 == 1) {
							Class6_Sub2_Sub2_Sub3.method251(0.9D);
						}
						if (local12 == 2) {
							Class6_Sub2_Sub2_Sub3.method251(0.8D);
						}
						if (local12 == 3) {
							Class6_Sub2_Sub2_Sub3.method251(0.7D);
						}
						if (local12 == 4) {
							Class6_Sub2_Sub2_Sub3.method251(0.6D);
						}
						Class19.aClass10_7.method77();
						this.aBoolean240 = true;
					}
					if (local4 == 3) {
						@Pc(54) boolean local54 = this.aBoolean258;
						if (local12 == 0) {
							this.method607(0, this.aBoolean258);
							this.aBoolean258 = true;
						}
						if (local12 == 1) {
							this.method607(-400, this.aBoolean258);
							this.aBoolean258 = true;
						}
						if (local12 == 2) {
							this.method607(-800, this.aBoolean258);
							this.aBoolean258 = true;
						}
						if (local12 == 3) {
							this.method607(-1200, this.aBoolean258);
							this.aBoolean258 = true;
						}
						if (local12 == 4) {
							this.aBoolean258 = false;
						}
						if (this.aBoolean258 != local54 && !aBoolean223) {
							if (this.aBoolean258) {
								this.anInt941 = this.anInt989;
								this.aBoolean236 = true;
								this.aClass9_Sub1_1.method54(2, this.anInt941);
							} else {
								this.method667();
							}
							this.anInt870 = 0;
						}
					}
					if (local4 == 4) {
						if (local12 == 0) {
							this.aBoolean225 = true;
							this.method592(0);
						}
						if (local12 == 1) {
							this.aBoolean225 = true;
							this.method592(-400);
						}
						if (local12 == 2) {
							this.aBoolean225 = true;
							this.method592(-800);
						}
						if (local12 == 3) {
							this.aBoolean225 = true;
							this.method592(-1200);
						}
						if (local12 == 4) {
							this.aBoolean225 = false;
						}
					}
					if (local4 == 5) {
						this.anInt828 = local12;
					}
					if (local4 == 6) {
						this.anInt948 = local12;
					}
					if (local4 == 8) {
						this.anInt873 = local12;
						this.aBoolean239 = true;
					}
					if (local4 == 9) {
						this.anInt874 = local12;
					}
				}
			}
		} catch (@Pc(214) RuntimeException local214) {
			signlink.reporterror("36163, " + arg0 + ", " + arg1 + ", " + local214.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
	private void method710() {
		try {
			while (true) {
				@Pc(15) Class6_Sub2_Sub4 local15 = this.aClass9_Sub1_1.method67();
				if (local15 == null) {
					return;
				}
				if (local15.anInt705 == 0) {
					Class6_Sub2_Sub1_Sub6.method485(local15.aByteArray18, local15.anInt706);
					if ((this.aClass9_Sub1_1.method69(local15.anInt706) & 0x62) != 0) {
						this.aBoolean252 = true;
						if (this.anInt923 != -1) {
							this.aBoolean239 = true;
						}
					}
				}
				if (local15.anInt705 == 1 && local15.aByteArray18 != null) {
					Class12.method85(local15.aByteArray18);
				}
				if (local15.anInt705 == 2 && local15.anInt706 == this.anInt941 && local15.aByteArray18 != null) {
					this.method632(this.aBoolean236, local15.aByteArray18);
				}
				if (local15.anInt705 == 3 && this.anInt978 == 1) {
					for (@Pc(86) int local86 = 0; local86 < this.aByteArrayArray4.length; local86++) {
						if (this.anIntArray237[local86] == local15.anInt706) {
							this.aByteArrayArray4[local86] = local15.aByteArray18;
							if (local15.aByteArray18 == null) {
								this.anIntArray237[local86] = -1;
							}
							break;
						}
						if (this.anIntArray238[local86] == local15.anInt706) {
							this.aByteArrayArray5[local86] = local15.aByteArray18;
							if (local15.aByteArray18 == null) {
								this.anIntArray238[local86] = -1;
							}
							break;
						}
					}
				}
				if (local15.anInt705 == 93 && this.aClass9_Sub1_1.method57(this.aBoolean221, local15.anInt706)) {
					Class15.method184(this.aClass9_Sub1_1, new Class6_Sub2_Sub3(741, local15.aByteArray18));
				}
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("32057, " + -17023 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!LYHLTGUG;I)Z")
	private boolean method711(@OriginalArg(0) Class18 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt383;
			if (this.anInt982 == 2) {
				if (local4 == 201) {
					this.aBoolean239 = true;
					this.anInt1035 = 0;
					this.aBoolean234 = true;
					this.aString19 = "";
					this.anInt916 = 1;
					this.aString22 = "Enter name of friend to add to list";
				}
				if (local4 == 202) {
					this.aBoolean239 = true;
					this.anInt1035 = 0;
					this.aBoolean234 = true;
					this.aString19 = "";
					this.anInt916 = 2;
					this.aString22 = "Enter name of friend to delete from list";
				}
			}
			if (local4 == 205) {
				this.anInt1012 = 250;
				return true;
			}
			if (local4 == 501) {
				this.aBoolean239 = true;
				this.anInt1035 = 0;
				this.aBoolean234 = true;
				this.aString19 = "";
				this.anInt916 = 4;
				this.aString22 = "Enter name of player to add to list";
			}
			if (local4 == 502) {
				this.aBoolean239 = true;
				this.anInt1035 = 0;
				this.aBoolean234 = true;
				this.aString19 = "";
				this.anInt916 = 5;
				this.aString22 = "Enter name of player to delete from list";
			}
			@Pc(118) int local118;
			@Pc(122) int local122;
			@Pc(127) int local127;
			if (local4 >= 300 && local4 <= 313) {
				local118 = (local4 - 300) / 2;
				local122 = local4 & 0x1;
				local127 = this.anIntArray271[local118];
				if (local127 != -1) {
					while (true) {
						if (local122 == 0) {
							local127--;
							if (local127 < 0) {
								local127 = Class23.anInt464 - 1;
							}
						}
						if (local122 == 1) {
							local127++;
							if (local127 >= Class23.anInt464) {
								local127 = 0;
							}
						}
						if (!Class23.aClass23Array1[local127].aBoolean134 && Class23.aClass23Array1[local127].anInt465 == local118 + (this.aBoolean257 ? 0 : 7)) {
							this.anIntArray271[local118] = local127;
							this.aBoolean232 = true;
							break;
						}
					}
				}
			}
			if (local4 >= 314 && local4 <= 323) {
				local118 = (local4 - 314) / 2;
				local122 = local4 & 0x1;
				local127 = this.anIntArray257[local118];
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
				this.anIntArray257[local118] = local127;
				this.aBoolean232 = true;
			}
			if (local4 == 324 && !this.aBoolean257) {
				this.aBoolean257 = true;
				this.method690();
			}
			if (local4 == 325 && this.aBoolean257) {
				this.aBoolean257 = false;
				this.method690();
			}
			if (local4 == 326) {
				this.aClass6_Sub2_Sub3_7.method391(19);
				this.aClass6_Sub2_Sub3_7.method392(this.aBoolean257 ? 0 : 1);
				for (local118 = 0; local118 < 7; local118++) {
					this.aClass6_Sub2_Sub3_7.method392(this.anIntArray271[local118]);
				}
				for (local122 = 0; local122 < 5; local122++) {
					this.aClass6_Sub2_Sub3_7.method392(this.anIntArray257[local122]);
				}
				return true;
			}
			if (local4 == 620) {
				this.aBoolean254 = !this.aBoolean254;
			}
			if (local4 >= 601 && local4 <= 613) {
				this.method687();
				if (this.aString28.length() > 0) {
					this.aClass6_Sub2_Sub3_7.method391(190);
					this.aClass6_Sub2_Sub3_7.method398(Class42.method464(this.aString28));
					this.aClass6_Sub2_Sub3_7.method392(local4 - 601);
					this.aClass6_Sub2_Sub3_7.method392(this.aBoolean254 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(355) RuntimeException local355) {
			signlink.reporterror("11596, " + arg0 + ", " + 927 + ", " + local355.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
	private void method712() {
		try {
			if (this.aClass28_24 == null) {
				this.method686();
				super.aClass28_2 = null;
				this.aClass28_12 = null;
				this.aClass28_13 = null;
				this.aClass28_14 = null;
				this.aClass28_15 = null;
				this.aClass28_16 = null;
				this.aClass28_17 = null;
				this.aClass28_18 = null;
				this.aClass28_19 = null;
				this.aClass28_20 = null;
				this.aClass28_24 = new Class28(479, this.method581(), 96, (byte) 33);
				this.aClass28_22 = new Class28(172, this.method581(), 156, (byte) 33);
				Class6_Sub2_Sub2.method517();
				this.aClass6_Sub2_Sub2_Sub4_9.method531(0, 0, this.anInt992);
				this.aClass28_21 = new Class28(190, this.method581(), 261, (byte) 33);
				this.aClass28_23 = new Class28(512, this.method581(), 334, (byte) 33);
				Class6_Sub2_Sub2.method517();
				this.aClass28_25 = new Class28(496, this.method581(), 50, (byte) 33);
				this.aClass28_26 = new Class28(269, this.method581(), 37, (byte) 33);
				this.aClass28_27 = new Class28(249, this.method581(), 45, (byte) 33);
				this.aBoolean240 = true;
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("33845, " + 0 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt865 = Integer.parseInt(this.getParameter("nodeid"));
		anInt866 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method697();
		} else {
			method639();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean222 = false;
		} else {
			aBoolean222 = true;
		}
		this.method572();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!LYHLTGUG;IIIIIII)V")
	private void method713(@OriginalArg(0) Class18 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg0.anInt366 == 0 && arg0.anIntArray85 != null && !arg0.aBoolean117 && (arg2 >= arg6 && arg5 >= arg3 && arg2 <= arg6 + arg0.anInt381 && arg5 <= arg3 + arg0.anInt394)) {
				@Pc(41) int local41 = arg0.anIntArray85.length;
				for (@Pc(43) int local43 = 0; local43 < local41; local43++) {
					@Pc(52) int local52 = arg0.anIntArray84[local43] + arg6;
					@Pc(61) int local61 = arg0.anIntArray89[local43] + arg3 - arg4;
					@Pc(68) Class18 local68 = Class18.aClass18Array1[arg0.anIntArray85[local43]];
					@Pc(73) int local73 = local52 + local68.anInt370;
					@Pc(78) int local78 = local61 + local68.anInt372;
					if ((local68.anInt371 >= 0 || local68.anInt382 != 0) && arg2 >= local73 && arg5 >= local78 && arg2 < local73 + local68.anInt381 && arg5 < local78 + local68.anInt394) {
						if (local68.anInt371 >= 0) {
							this.anInt1007 = local68.anInt371;
						} else {
							this.anInt1007 = local68.anInt374;
						}
					}
					if (local68.anInt366 == 8 && arg2 >= local73 && arg5 >= local78 && arg2 < local73 + local68.anInt381 && arg5 < local78 + local68.anInt394) {
						this.anInt910 = local68.anInt374;
					}
					if (local68.anInt366 == 0) {
						this.method713(local68, arg1, arg2, local78, local68.anInt365, arg5, local73);
						if (local68.anInt386 > local68.anInt394) {
							this.method664(local68.anInt394, local68.anInt386, arg2, local78, local73 + local68.anInt381, arg1, local68, arg5);
						}
					} else {
						if (local68.anInt364 == 1 && arg2 >= local73 && arg5 >= local78 && arg2 < local73 + local68.anInt381 && arg5 < local78 + local68.anInt394) {
							@Pc(202) boolean local202 = false;
							if (local68.anInt383 != 0) {
								local202 = this.method696(local68);
							}
							if (!local202) {
								this.aStringArray10[this.anInt839] = local68.aString9;
								this.anIntArray233[this.anInt839] = 951;
								this.anIntArray232[this.anInt839] = local68.anInt374;
								this.anInt839++;
							}
						}
						if (local68.anInt364 == 2 && this.anInt843 == 0 && arg2 >= local73 && arg5 >= local78 && arg2 < local73 + local68.anInt381 && arg5 < local78 + local68.anInt394) {
							@Pc(266) String local266 = local68.aString11;
							if (local266.indexOf(" ") != -1) {
								local266 = local266.substring(0, local266.indexOf(" "));
							}
							this.aStringArray10[this.anInt839] = local266 + " @gre@" + local68.aString8;
							this.anIntArray233[this.anInt839] = 870;
							this.anIntArray232[this.anInt839] = local68.anInt374;
							this.anInt839++;
						}
						if (local68.anInt364 == 3 && arg2 >= local73 && arg5 >= local78 && arg2 < local73 + local68.anInt381 && arg5 < local78 + local68.anInt394) {
							this.aStringArray10[this.anInt839] = "Close";
							if (arg1 == 3) {
								this.anIntArray233[this.anInt839] = 861;
							} else {
								this.anIntArray233[this.anInt839] = 978;
							}
							this.anIntArray232[this.anInt839] = local68.anInt374;
							this.anInt839++;
						}
						if (local68.anInt364 == 4 && arg2 >= local73 && arg5 >= local78 && arg2 < local73 + local68.anInt381 && arg5 < local78 + local68.anInt394) {
							this.aStringArray10[this.anInt839] = local68.aString9;
							this.anIntArray233[this.anInt839] = 734;
							this.anIntArray232[this.anInt839] = local68.anInt374;
							this.anInt839++;
						}
						if (local68.anInt364 == 5 && arg2 >= local73 && arg5 >= local78 && arg2 < local73 + local68.anInt381 && arg5 < local78 + local68.anInt394) {
							this.aStringArray10[this.anInt839] = local68.aString9;
							this.anIntArray233[this.anInt839] = 597;
							this.anIntArray232[this.anInt839] = local68.anInt374;
							this.anInt839++;
						}
						if (local68.anInt364 == 6 && !this.aBoolean255 && arg2 >= local73 && arg5 >= local78 && arg2 < local73 + local68.anInt381 && arg5 < local78 + local68.anInt394) {
							this.aStringArray10[this.anInt839] = local68.aString9;
							this.anIntArray233[this.anInt839] = 217;
							this.anIntArray232[this.anInt839] = local68.anInt374;
							this.anInt839++;
						}
						if (local68.anInt366 == 2) {
							@Pc(525) int local525 = 0;
							for (@Pc(527) int local527 = 0; local527 < local68.anInt394; local527++) {
								for (@Pc(531) int local531 = 0; local531 < local68.anInt381; local531++) {
									@Pc(542) int local542 = local73 + local531 * (local68.anInt389 + 32);
									@Pc(551) int local551 = local78 + local527 * (local68.anInt375 + 32);
									if (local525 < 20) {
										local542 += local68.anIntArray90[local525];
										local551 += local68.anIntArray82[local525];
									}
									if (arg2 >= local542 && arg5 >= local551 && arg2 < local542 + 32 && arg5 < local551 + 32) {
										this.anInt885 = local525;
										this.anInt886 = local68.anInt374;
										if (local68.anIntArray88[local525] > 0) {
											@Pc(604) Class19 local604 = Class19.method281(local68.anIntArray88[local525] - 1);
											if (this.anInt999 == 1 && local68.aBoolean108) {
												if (local68.anInt374 != this.anInt1001 || local525 != this.anInt1000) {
													this.aStringArray10[this.anInt839] = "Use " + this.aString29 + " with @lre@" + local604.aString12;
													this.anIntArray233[this.anInt839] = 208;
													this.anIntArray234[this.anInt839] = local604.anInt414;
													this.anIntArray231[this.anInt839] = local525;
													this.anIntArray232[this.anInt839] = local68.anInt374;
													this.anInt839++;
												}
											} else if (this.anInt843 != 1 || !local68.aBoolean108) {
												@Pc(741) int local741;
												if (local68.aBoolean108) {
													for (local741 = 4; local741 >= 3; local741--) {
														if (local604.aStringArray6 != null && local604.aStringArray6[local741] != null) {
															this.aStringArray10[this.anInt839] = local604.aStringArray6[local741] + " @lre@" + local604.aString12;
															if (local741 == 3) {
																this.anIntArray233[this.anInt839] = 532;
															}
															if (local741 == 4) {
																this.anIntArray233[this.anInt839] = 69;
															}
															this.anIntArray234[this.anInt839] = local604.anInt414;
															this.anIntArray231[this.anInt839] = local525;
															this.anIntArray232[this.anInt839] = local68.anInt374;
															this.anInt839++;
														} else if (local741 == 4) {
															this.aStringArray10[this.anInt839] = "Drop @lre@" + local604.aString12;
															this.anIntArray233[this.anInt839] = 69;
															this.anIntArray234[this.anInt839] = local604.anInt414;
															this.anIntArray231[this.anInt839] = local525;
															this.anIntArray232[this.anInt839] = local68.anInt374;
															this.anInt839++;
														}
													}
												}
												if (local68.aBoolean114) {
													this.aStringArray10[this.anInt839] = "Use @lre@" + local604.aString12;
													this.anIntArray233[this.anInt839] = 681;
													this.anIntArray234[this.anInt839] = local604.anInt414;
													this.anIntArray231[this.anInt839] = local525;
													this.anIntArray232[this.anInt839] = local68.anInt374;
													this.anInt839++;
												}
												if (local68.aBoolean108 && local604.aStringArray6 != null) {
													for (local741 = 2; local741 >= 0; local741--) {
														if (local604.aStringArray6[local741] != null) {
															this.aStringArray10[this.anInt839] = local604.aStringArray6[local741] + " @lre@" + local604.aString12;
															if (local741 == 0) {
																this.anIntArray233[this.anInt839] = 650;
															}
															if (local741 == 1) {
																this.anIntArray233[this.anInt839] = 118;
															}
															if (local741 == 2) {
																this.anIntArray233[this.anInt839] = 821;
															}
															this.anIntArray234[this.anInt839] = local604.anInt414;
															this.anIntArray231[this.anInt839] = local525;
															this.anIntArray232[this.anInt839] = local68.anInt374;
															this.anInt839++;
														}
													}
												}
												if (local68.aStringArray4 != null) {
													for (local741 = 4; local741 >= 0; local741--) {
														if (local68.aStringArray4[local741] != null) {
															this.aStringArray10[this.anInt839] = local68.aStringArray4[local741] + " @lre@" + local604.aString12;
															if (local741 == 0) {
																this.anIntArray233[this.anInt839] = 35;
															}
															if (local741 == 1) {
																this.anIntArray233[this.anInt839] = 479;
															}
															if (local741 == 2) {
																this.anIntArray233[this.anInt839] = 684;
															}
															if (local741 == 3) {
																this.anIntArray233[this.anInt839] = 842;
															}
															if (local741 == 4) {
																this.anIntArray233[this.anInt839] = 149;
															}
															this.anIntArray234[this.anInt839] = local604.anInt414;
															this.anIntArray231[this.anInt839] = local525;
															this.anIntArray232[this.anInt839] = local68.anInt374;
															this.anInt839++;
														}
													}
												}
												this.aStringArray10[this.anInt839] = "Examine @lre@" + local604.aString12;
												this.anIntArray233[this.anInt839] = 1969;
												this.anIntArray234[this.anInt839] = local604.anInt414;
												this.anIntArray231[this.anInt839] = local525;
												this.anIntArray232[this.anInt839] = local68.anInt374;
												this.anInt839++;
											} else if ((this.anInt845 & 0x10) == 16) {
												this.aStringArray10[this.anInt839] = this.aString18 + " @lre@" + local604.aString12;
												this.anIntArray233[this.anInt839] = 775;
												this.anIntArray234[this.anInt839] = local604.anInt414;
												this.anIntArray231[this.anInt839] = local525;
												this.anIntArray232[this.anInt839] = local68.anInt374;
												this.anInt839++;
											}
										}
									}
									local525++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1171) RuntimeException local1171) {
			signlink.reporterror("97050, " + arg0 + ", " + 5 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local1171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(Z)V")
	private void method714() {
		try {
			for (@Pc(6) Class6_Sub2_Sub1_Sub1 local6 = (Class6_Sub2_Sub1_Sub1) this.aClass39_11.method459(); local6 != null; local6 = (Class6_Sub2_Sub1_Sub1) this.aClass39_11.method461()) {
				if (local6.anInt117 != this.anInt1026 || local6.aBoolean47) {
					local6.method512();
				} else if (anInt928 >= local6.anInt113) {
					local6.method103((byte) 6, this.anInt1039);
					if (local6.aBoolean47) {
						local6.method512();
					} else {
						this.aClass25_1.method311(60, local6.anInt118, 0, -1, local6.anInt120, local6.anInt117, local6.anInt119, local6, false);
					}
				}
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("80811, " + false + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method579() {
		try {
			if (this.aBoolean241 || this.aBoolean259 || this.aBoolean256) {
				this.method649();
			} else {
				anInt924++;
				if (this.aBoolean226) {
					this.method591();
				} else {
					this.method600(false);
				}
				this.anInt871 = 0;
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("55380, " + -601 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method715() {
		try {
			if (this.anInt1042 == 0) {
				@Pc(14) int local14 = super.anInt820;
				if (this.anInt843 == 1 && super.anInt821 >= 516 && super.anInt822 >= 160 && super.anInt821 <= 765 && super.anInt822 <= 205) {
					local14 = 0;
				}
				@Pc(45) int local45;
				@Pc(48) int local48;
				@Pc(124) int local124;
				if (this.aBoolean262) {
					if (local14 != 1) {
						local45 = super.anInt815;
						local48 = super.anInt816;
						if (this.anInt973 == 0) {
							local45 -= 4;
							local48 -= 4;
						}
						if (this.anInt973 == 1) {
							local45 -= 553;
							local48 -= 205;
						}
						if (this.anInt973 == 2) {
							local45 -= 17;
							local48 -= 357;
						}
						if (local45 < this.anInt974 - 10 || local45 > this.anInt974 + this.anInt976 + 10 || local48 < this.anInt975 - 10 || local48 > this.anInt975 + this.anInt977 + 10) {
							this.aBoolean262 = false;
							if (this.anInt973 == 1) {
								this.aBoolean252 = true;
							}
							if (this.anInt973 == 2) {
								this.aBoolean239 = true;
							}
						}
					}
					if (local14 == 1) {
						local45 = this.anInt974;
						local48 = this.anInt975;
						local124 = this.anInt976;
						@Pc(127) int local127 = super.anInt821;
						@Pc(130) int local130 = super.anInt822;
						if (this.anInt973 == 0) {
							local127 -= 4;
							local130 -= 4;
						}
						if (this.anInt973 == 1) {
							local127 -= 553;
							local130 -= 205;
						}
						if (this.anInt973 == 2) {
							local127 -= 17;
							local130 -= 357;
						}
						@Pc(149) int local149 = -1;
						for (@Pc(151) int local151 = 0; local151 < this.anInt839; local151++) {
							@Pc(166) int local166 = local48 + (this.anInt839 - 1 - local151) * 15 + 31;
							if (local127 > local45 && local127 < local45 + local124 && local130 > local166 - 13 && local130 < local166 + 3) {
								local149 = local151;
							}
						}
						if (local149 != -1) {
							this.method606(local149);
						}
						this.aBoolean262 = false;
						if (this.anInt973 == 1) {
							this.aBoolean252 = true;
						}
						if (this.anInt973 == 2) {
							this.aBoolean239 = true;
							return;
						}
					}
				} else {
					if (local14 == 1 && this.anInt839 > 0) {
						local45 = this.anIntArray233[this.anInt839 - 1];
						if (local45 == 35 || local45 == 479 || local45 == 684 || local45 == 842 || local45 == 149 || local45 == 650 || local45 == 118 || local45 == 821 || local45 == 532 || local45 == 69 || local45 == 681 || local45 == 1969) {
							local48 = this.anIntArray231[this.anInt839 - 1];
							local124 = this.anIntArray232[this.anInt839 - 1];
							@Pc(286) Class18 local286 = Class18.aClass18Array1[local124];
							if (local286.aBoolean116 || local286.aBoolean110) {
								this.aBoolean243 = false;
								this.anInt997 = 0;
								this.anInt1040 = local124;
								this.anInt1041 = local48;
								this.anInt1042 = 2;
								this.anInt1043 = super.anInt821;
								this.anInt1044 = super.anInt822;
								if (Class18.aClass18Array1[local124].anInt369 == this.anInt914) {
									this.anInt1042 = 1;
								}
								if (Class18.aClass18Array1[local124].anInt369 == this.anInt923) {
									this.anInt1042 = 3;
								}
								return;
							}
						}
					}
					if (local14 == 1 && (this.anInt828 == 1 || this.method638(this.anInt839 - 1)) && this.anInt839 > 2) {
						local14 = 2;
					}
					if (local14 == 1 && this.anInt839 > 0) {
						this.method606(this.anInt839 - 1);
					}
					if (local14 != 2 || this.anInt839 <= 0) {
						return;
					}
					this.method618();
				}
			}
		} catch (@Pc(381) RuntimeException local381) {
			signlink.reporterror("88656, " + 117 + ", " + local381.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
	private void method716() {
		try {
			if (this.anInt999 == 0 && this.anInt843 == 0) {
				this.aStringArray10[this.anInt839] = "Walk here";
				this.anIntArray233[this.anInt839] = 904;
				this.anIntArray231[this.anInt839] = super.anInt815;
				this.anIntArray232[this.anInt839] = super.anInt816;
				this.anInt839++;
			}
			@Pc(41) int local41 = -1;
			for (@Pc(51) int local51 = 0; local51 < Class6_Sub2_Sub1_Sub6.anInt737; local51++) {
				@Pc(57) int local57 = Class6_Sub2_Sub1_Sub6.anIntArray201[local51];
				@Pc(61) int local61 = local57 & 0x7F;
				@Pc(67) int local67 = local57 >> 7 & 0x7F;
				@Pc(73) int local73 = local57 >> 29 & 0x3;
				@Pc(79) int local79 = local57 >> 14 & 0x7FFF;
				if (local57 != local41) {
					local41 = local57;
					@Pc(226) int local226;
					if (local73 == 2 && this.aClass25_1.method330(this.anInt1026, local61, local67, local57) >= 0) {
						@Pc(99) Class2 local99 = Class2.method24(local79);
						if (local99.anIntArray3 != null) {
							local99 = local99.method17();
						}
						if (local99 == null) {
							continue;
						}
						if (this.anInt999 == 1) {
							this.aStringArray10[this.anInt839] = "Use " + this.aString29 + " with @cya@" + local99.aString1;
							this.anIntArray233[this.anInt839] = 102;
							this.anIntArray234[this.anInt839] = local57;
							this.anIntArray231[this.anInt839] = local61;
							this.anIntArray232[this.anInt839] = local67;
							this.anInt839++;
						} else if (this.anInt843 != 1) {
							if (local99.aStringArray2 != null) {
								for (local226 = 4; local226 >= 0; local226--) {
									if (local99.aStringArray2[local226] != null) {
										this.aStringArray10[this.anInt839] = local99.aStringArray2[local226] + " @cya@" + local99.aString1;
										if (local226 == 0) {
											this.anIntArray233[this.anInt839] = 551;
										}
										if (local226 == 1) {
											this.anIntArray233[this.anInt839] = 568;
										}
										if (local226 == 2) {
											this.anIntArray233[this.anInt839] = 698;
										}
										if (local226 == 3) {
											this.anIntArray233[this.anInt839] = 388;
										}
										if (local226 == 4) {
											this.anIntArray233[this.anInt839] = 1500;
										}
										this.anIntArray234[this.anInt839] = local57;
										this.anIntArray231[this.anInt839] = local61;
										this.anIntArray232[this.anInt839] = local67;
										this.anInt839++;
									}
								}
							}
							this.aStringArray10[this.anInt839] = "Examine @cya@" + local99.aString1;
							this.anIntArray233[this.anInt839] = 1554;
							this.anIntArray234[this.anInt839] = local99.anInt32 << 14;
							this.anIntArray231[this.anInt839] = local61;
							this.anIntArray232[this.anInt839] = local67;
							this.anInt839++;
						} else if ((this.anInt845 & 0x4) == 4) {
							this.aStringArray10[this.anInt839] = this.aString18 + " @cya@" + local99.aString1;
							this.anIntArray233[this.anInt839] = 255;
							this.anIntArray234[this.anInt839] = local57;
							this.anIntArray231[this.anInt839] = local61;
							this.anIntArray232[this.anInt839] = local67;
							this.anInt839++;
						}
					}
					@Pc(406) Class6_Sub2_Sub1_Sub3_Sub1 local406;
					@Pc(454) Class6_Sub2_Sub1_Sub3_Sub2 local454;
					@Pc(444) int local444;
					if (local73 == 1) {
						@Pc(377) Class6_Sub2_Sub1_Sub3_Sub1 local377 = this.aClass6_Sub2_Sub1_Sub3_Sub1Array1[local79];
						if (local377.aClass16_1.aByte10 == 1 && (local377.anInt651 & 0x7F) == 64 && (local377.anInt652 & 0x7F) == 64) {
							for (local226 = 0; local226 < this.anInt939; local226++) {
								local406 = this.aClass6_Sub2_Sub1_Sub3_Sub1Array1[this.anIntArray253[local226]];
								if (local406 != null && local406 != local377 && local406.aClass16_1.aByte10 == 1 && local406.anInt651 == local377.anInt651 && local406.anInt652 == local377.anInt652) {
									this.method640(local61, local406.aClass16_1, local67, this.anIntArray253[local226]);
								}
							}
							for (local444 = 0; local444 < this.anInt987; local444++) {
								local454 = this.aClass6_Sub2_Sub1_Sub3_Sub2Array1[this.anIntArray265[local444]];
								if (local454 != null && local454.anInt651 == local377.anInt651 && local454.anInt652 == local377.anInt652) {
									this.method700(local67, this.anIntArray265[local444], local454, local61);
								}
							}
						}
						this.method640(local61, local377.aClass16_1, local67, local79);
					}
					if (local73 == 0) {
						@Pc(496) Class6_Sub2_Sub1_Sub3_Sub2 local496 = this.aClass6_Sub2_Sub1_Sub3_Sub2Array1[local79];
						if ((local496.anInt651 & 0x7F) == 64 && (local496.anInt652 & 0x7F) == 64) {
							for (local226 = 0; local226 < this.anInt939; local226++) {
								local406 = this.aClass6_Sub2_Sub1_Sub3_Sub1Array1[this.anIntArray253[local226]];
								if (local406 != null && local406.aClass16_1.aByte10 == 1 && local406.anInt651 == local496.anInt651 && local406.anInt652 == local496.anInt652) {
									this.method640(local61, local406.aClass16_1, local67, this.anIntArray253[local226]);
								}
							}
							for (local444 = 0; local444 < this.anInt987; local444++) {
								local454 = this.aClass6_Sub2_Sub1_Sub3_Sub2Array1[this.anIntArray265[local444]];
								if (local454 != null && local454 != local496 && local454.anInt651 == local496.anInt651 && local454.anInt652 == local496.anInt652) {
									this.method700(local67, this.anIntArray265[local444], local454, local61);
								}
							}
						}
						this.method700(local67, local79, local496, local61);
					}
					if (local73 == 3) {
						@Pc(615) Class39 local615 = this.aClass39ArrayArrayArray1[this.anInt1026][local61][local67];
						if (local615 != null) {
							for (@Pc(622) Class6_Sub2_Sub1_Sub4 local622 = (Class6_Sub2_Sub1_Sub4) local615.method460(); local622 != null; local622 = (Class6_Sub2_Sub1_Sub4) local615.method462()) {
								@Pc(628) Class19 local628 = Class19.method281(local622.anInt347);
								if (this.anInt999 == 1) {
									this.aStringArray10[this.anInt839] = "Use " + this.aString29 + " with @lre@" + local628.aString12;
									this.anIntArray233[this.anInt839] = 534;
									this.anIntArray234[this.anInt839] = local622.anInt347;
									this.anIntArray231[this.anInt839] = local61;
									this.anIntArray232[this.anInt839] = local67;
									this.anInt839++;
								} else if (this.anInt843 != 1) {
									for (@Pc(745) int local745 = 4; local745 >= 0; local745--) {
										if (local628.aStringArray5 != null && local628.aStringArray5[local745] != null) {
											this.aStringArray10[this.anInt839] = local628.aStringArray5[local745] + " @lre@" + local628.aString12;
											if (local745 == 0) {
												this.anIntArray233[this.anInt839] = 915;
											}
											if (local745 == 1) {
												this.anIntArray233[this.anInt839] = 109;
											}
											if (local745 == 2) {
												this.anIntArray233[this.anInt839] = 14;
											}
											if (local745 == 3) {
												this.anIntArray233[this.anInt839] = 186;
											}
											if (local745 == 4) {
												this.anIntArray233[this.anInt839] = 401;
											}
											this.anIntArray234[this.anInt839] = local622.anInt347;
											this.anIntArray231[this.anInt839] = local61;
											this.anIntArray232[this.anInt839] = local67;
											this.anInt839++;
										} else if (local745 == 2) {
											this.aStringArray10[this.anInt839] = "Take @lre@" + local628.aString12;
											this.anIntArray233[this.anInt839] = 14;
											this.anIntArray234[this.anInt839] = local622.anInt347;
											this.anIntArray231[this.anInt839] = local61;
											this.anIntArray232[this.anInt839] = local67;
											this.anInt839++;
										}
									}
									this.aStringArray10[this.anInt839] = "Examine @lre@" + local628.aString12;
									this.anIntArray233[this.anInt839] = 1892;
									this.anIntArray234[this.anInt839] = local622.anInt347;
									this.anIntArray231[this.anInt839] = local61;
									this.anIntArray232[this.anInt839] = local67;
									this.anInt839++;
								} else if ((this.anInt845 & 0x1) == 1) {
									this.aStringArray10[this.anInt839] = this.aString18 + " @lre@" + local628.aString12;
									this.anIntArray233[this.anInt839] = 468;
									this.anIntArray234[this.anInt839] = local622.anInt347;
									this.anIntArray231[this.anInt839] = local61;
									this.anIntArray232[this.anInt839] = local67;
									this.anInt839++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(952) RuntimeException local952) {
			signlink.reporterror("20087, " + 5631 + ", " + local952.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
	private void method717(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg1 != 0L) {
				if (this.anInt981 >= 100 && this.anInt942 != 1) {
					this.method648("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0, this.aBoolean235);
				} else if (this.anInt981 >= 200) {
					this.method648("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0, this.aBoolean235);
				} else {
					@Pc(41) String local41 = Class42.method468(Class42.method465(this.anInt1019, arg1));
					if (!arg0) {
						this.anInt1009 = -1;
					}
					for (@Pc(48) int local48 = 0; local48 < this.anInt981; local48++) {
						if (this.aLongArray3[local48] == arg1) {
							this.method648("", local41 + " is already on your friend list", 0, this.aBoolean235);
							return;
						}
					}
					for (@Pc(79) int local79 = 0; local79 < this.anInt891; local79++) {
						if (this.aLongArray4[local79] == arg1) {
							this.method648("", "Please remove " + local41 + " from your ignore list first", 0, this.aBoolean235);
							return;
						}
					}
					if (!local41.equals(aClass6_Sub2_Sub1_Sub3_Sub2_1.aString15)) {
						this.aStringArray13[this.anInt981] = local41;
						this.aLongArray3[this.anInt981] = arg1;
						this.anIntArray225[this.anInt981] = 0;
						this.anInt981++;
						this.aBoolean252 = true;
						this.aClass6_Sub2_Sub3_7.method391(27);
						this.aClass6_Sub2_Sub3_7.method398(arg1);
					}
				}
			}
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("15464, " + arg0 + ", " + arg1 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}
}
