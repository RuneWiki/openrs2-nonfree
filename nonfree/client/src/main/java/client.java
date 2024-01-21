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

	@OriginalMember(owner = "client!client", name = "S", descriptor = "Z")
	private static boolean aBoolean211;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
	private static int anInt831;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Lclient!TPTANZXN;")
	public static Class6_Sub1_Sub2_Sub4_Sub2 aClass6_Sub1_Sub2_Sub4_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
	private static int anInt860;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
	private static int anInt867;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
	public static int anInt877;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "Z")
	private static boolean aBoolean225;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "I")
	private static int anInt882;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "I")
	private static int anInt891;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
	private static int anInt903;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
	private static int anInt904;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
	private static int anInt905;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "Z")
	private static boolean aBoolean229;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
	private static int anInt906;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
	private static int anInt908;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "Z")
	private static boolean aBoolean230;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "I")
	private static int anInt916;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
	private static int anInt938;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
	private static int anInt941;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
	private static int anInt993;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "I")
	private static int anInt1020;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
	private static int anInt1036;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "I")
	public static int anInt1041;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "[I")
	public static int[] anIntArray223 = new int[32];

	@OriginalMember(owner = "client!client", name = "id", descriptor = "I")
	private static int anInt876;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "Z")
	private static boolean aBoolean224;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "B")
	private static byte aByte63;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private static int anInt948;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "I")
	private static int anInt952;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "I")
	private static int anInt978;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "Ljava/lang/String;")
	private static String aString26;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "[I")
	private static int[] anIntArray253;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "[[I")
	public static final int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "I")
	private static int anInt1037;

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "[I")
	public static final int[] anIntArray271;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "Lclient!XOJZVVDK;")
	private Class43 aClass43_2;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "I")
	private int anInt827;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "I")
	private int anInt828;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
	private int anInt833;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
	private int anInt835;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	private int anInt837;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
	private int anInt838;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	private int anInt839;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
	private int anInt841;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
	private int anInt843;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
	private int anInt844;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
	private int anInt846;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	private int anInt847;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
	private int anInt849;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
	private int anInt850;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
	private int anInt851;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
	private int anInt852;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private int anInt853;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "I")
	private int anInt854;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
	private int anInt856;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "Lclient!DRNBRPSO;")
	private Class8 aClass8_3;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "Lclient!DRNBRPSO;")
	private Class8 aClass8_4;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "Lclient!DRNBRPSO;")
	private Class8 aClass8_5;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "Lclient!DRNBRPSO;")
	private Class8 aClass8_6;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "Lclient!DRNBRPSO;")
	private Class8 aClass8_7;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "Lclient!DRNBRPSO;")
	private Class8 aClass8_8;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "Lclient!DRNBRPSO;")
	private Class8 aClass8_9;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "Lclient!DRNBRPSO;")
	private Class8 aClass8_10;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "Lclient!DRNBRPSO;")
	private Class8 aClass8_11;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "I")
	private int anInt858;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
	private int anInt859;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "Lclient!DRNBRPSO;")
	private Class8 aClass8_12;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "Lclient!DRNBRPSO;")
	private Class8 aClass8_13;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "Lclient!DRNBRPSO;")
	private Class8 aClass8_14;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "Lclient!DRNBRPSO;")
	private Class8 aClass8_15;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "Lclient!DRNBRPSO;")
	private Class8 aClass8_16;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "Lclient!DRNBRPSO;")
	private Class8 aClass8_17;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "Lclient!DRNBRPSO;")
	private Class8 aClass8_18;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "Lclient!DRNBRPSO;")
	private Class8 aClass8_19;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "Lclient!DRNBRPSO;")
	private Class8 aClass8_20;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
	private int anInt861;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
	private int anInt862;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
	private int anInt863;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
	private int anInt864;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "I")
	private int anInt865;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
	private int anInt866;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "Lclient!WQACZBNG;")
	private Class6_Sub1_Sub3_Sub3 aClass6_Sub1_Sub3_Sub3_3;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "Lclient!WQACZBNG;")
	private Class6_Sub1_Sub3_Sub3 aClass6_Sub1_Sub3_Sub3_4;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "Lclient!ZFUOSNLM;")
	private Class6_Sub1_Sub3_Sub4 aClass6_Sub1_Sub3_Sub4_2;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "Lclient!ZFUOSNLM;")
	private Class6_Sub1_Sub3_Sub4 aClass6_Sub1_Sub3_Sub4_3;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "Lclient!ZFUOSNLM;")
	private Class6_Sub1_Sub3_Sub4 aClass6_Sub1_Sub3_Sub4_4;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "Lclient!ZFUOSNLM;")
	private Class6_Sub1_Sub3_Sub4 aClass6_Sub1_Sub3_Sub4_5;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
	private int anInt869;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
	private int anInt870;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
	private int anInt871;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "I")
	private int anInt873;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "Lclient!VEIVHFHZ;")
	private Class6_Sub1_Sub3_Sub2 aClass6_Sub1_Sub3_Sub2_1;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "Lclient!VEIVHFHZ;")
	private Class6_Sub1_Sub3_Sub2 aClass6_Sub1_Sub3_Sub2_2;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
	private int anInt874;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "I")
	private int anInt880;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "Lclient!QUPTMIEH;")
	private Class30_Sub1 aClass30_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
	private int anInt885;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
	private int anInt888;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
	private int anInt889;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
	private int anInt890;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "Lclient!VEIVHFHZ;")
	private Class6_Sub1_Sub3_Sub2 aClass6_Sub1_Sub3_Sub2_3;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "Lclient!VEIVHFHZ;")
	private Class6_Sub1_Sub3_Sub2 aClass6_Sub1_Sub3_Sub2_4;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "Lclient!VEIVHFHZ;")
	private Class6_Sub1_Sub3_Sub2 aClass6_Sub1_Sub3_Sub2_5;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "I")
	private int anInt892;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "I")
	private int anInt893;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "I")
	private int anInt894;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "I")
	private int anInt895;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "I")
	private int anInt896;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
	private int anInt900;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "Lclient!TVERLIYS;")
	private Class37 aClass37_1;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
	private int anInt901;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
	private int anInt902;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "Ljava/lang/String;")
	private String aString22;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "Lclient!VEIVHFHZ;")
	private Class6_Sub1_Sub3_Sub2 aClass6_Sub1_Sub3_Sub2_6;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "Lclient!VEIVHFHZ;")
	private Class6_Sub1_Sub3_Sub2 aClass6_Sub1_Sub3_Sub2_7;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "[I")
	private int[] anIntArray228;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "[I")
	private int[] anIntArray229;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "[I")
	private int[] anIntArray230;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "[I")
	private int[] anIntArray231;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private int anInt907;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "I")
	private int anInt910;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "I")
	private int anInt911;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "Lclient!UVFIVFPB;")
	private Class39 aClass39_1;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "Lclient!WUYFIEBK;")
	private Class42 aClass42_2;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
	private int anInt913;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "Lclient!DRNBRPSO;")
	private Class8 aClass8_21;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "Lclient!DRNBRPSO;")
	private Class8 aClass8_22;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "Lclient!DRNBRPSO;")
	private Class8 aClass8_23;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "Lclient!DRNBRPSO;")
	private Class8 aClass8_24;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "I")
	private int anInt914;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
	private int anInt915;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "Lclient!WQACZBNG;")
	private Class6_Sub1_Sub3_Sub3 aClass6_Sub1_Sub3_Sub3_5;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
	private int anInt918;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
	private int anInt919;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
	private int anInt920;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
	private int anInt921;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
	private int anInt922;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
	private int anInt923;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
	private int anInt925;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "I")
	private int anInt928;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "Ljava/lang/String;")
	private String aString23;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "I")
	private int anInt929;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private int anInt930;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
	private int anInt932;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "Lclient!VEIVHFHZ;")
	private Class6_Sub1_Sub3_Sub2 aClass6_Sub1_Sub3_Sub2_8;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "Lclient!VEIVHFHZ;")
	private Class6_Sub1_Sub3_Sub2 aClass6_Sub1_Sub3_Sub2_9;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "Lclient!VEIVHFHZ;")
	private Class6_Sub1_Sub3_Sub2 aClass6_Sub1_Sub3_Sub2_10;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "Lclient!VEIVHFHZ;")
	private Class6_Sub1_Sub3_Sub2 aClass6_Sub1_Sub3_Sub2_11;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "Lclient!VEIVHFHZ;")
	private Class6_Sub1_Sub3_Sub2 aClass6_Sub1_Sub3_Sub2_12;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "I")
	private int anInt934;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
	private int anInt935;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "I")
	private int anInt936;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "I")
	private int anInt937;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
	private int anInt939;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private int anInt942;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
	private int anInt943;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
	private int anInt944;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
	private int anInt945;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "I")
	private int anInt946;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "I")
	private int anInt947;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private int anInt951;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
	private int anInt954;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
	private int anInt955;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
	private int anInt956;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
	private int anInt958;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
	private int anInt959;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
	private int anInt960;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
	private int anInt961;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "I")
	private int anInt962;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
	private int anInt963;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "[I")
	private int[] anIntArray240;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "[I")
	private int[] anIntArray241;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
	private int anInt968;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "Lclient!VEIVHFHZ;")
	private Class6_Sub1_Sub3_Sub2 aClass6_Sub1_Sub3_Sub2_13;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "Lclient!VEIVHFHZ;")
	private Class6_Sub1_Sub3_Sub2 aClass6_Sub1_Sub3_Sub2_14;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "Lclient!VEIVHFHZ;")
	private Class6_Sub1_Sub3_Sub2 aClass6_Sub1_Sub3_Sub2_15;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
	private int anInt971;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "[I")
	private int[] anIntArray244;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "[I")
	private int[] anIntArray245;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "[I")
	private int[] anIntArray246;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "[I")
	private int[] anIntArray247;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
	private int anInt972;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "Lclient!WQACZBNG;")
	private Class6_Sub1_Sub3_Sub3 aClass6_Sub1_Sub3_Sub3_6;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "Lclient!WQACZBNG;")
	private Class6_Sub1_Sub3_Sub3 aClass6_Sub1_Sub3_Sub3_7;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "I")
	private int anInt975;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "I")
	private int anInt980;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "Lclient!UMNOCQQA;")
	private Class38 aClass38_1;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "Lclient!WQACZBNG;")
	private Class6_Sub1_Sub3_Sub3 aClass6_Sub1_Sub3_Sub3_8;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "Lclient!WQACZBNG;")
	private Class6_Sub1_Sub3_Sub3 aClass6_Sub1_Sub3_Sub3_9;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "Lclient!WQACZBNG;")
	private Class6_Sub1_Sub3_Sub3 aClass6_Sub1_Sub3_Sub3_10;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "Lclient!WQACZBNG;")
	private Class6_Sub1_Sub3_Sub3 aClass6_Sub1_Sub3_Sub3_11;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "Lclient!WQACZBNG;")
	private Class6_Sub1_Sub3_Sub3 aClass6_Sub1_Sub3_Sub3_12;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
	private int anInt987;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
	private int anInt988;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "I")
	private int anInt989;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "I")
	private int anInt990;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
	private int anInt991;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "I")
	private int anInt992;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "Ljava/lang/String;")
	private String aString29;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
	private int anInt995;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
	private int anInt998;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "[I")
	private int[] anIntArray254;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "[I")
	private int[] anIntArray255;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "[I")
	private int[] anIntArray256;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "Lclient!WQACZBNG;")
	private Class6_Sub1_Sub3_Sub3 aClass6_Sub1_Sub3_Sub3_13;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "I")
	private int anInt1002;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "[Lclient!VEIVHFHZ;")
	private Class6_Sub1_Sub3_Sub2[] aClass6_Sub1_Sub3_Sub2Array5;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
	private int anInt1003;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
	private int anInt1004;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
	private int anInt1005;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
	private int anInt1006;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
	private int anInt1007;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "I")
	private int anInt1008;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "Lclient!WQACZBNG;")
	private Class6_Sub1_Sub3_Sub3 aClass6_Sub1_Sub3_Sub3_14;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
	private int anInt1010;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
	private int anInt1011;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private int anInt1012;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
	private int anInt1013;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
	private int anInt1014;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
	private int anInt1017;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "Lclient!WQACZBNG;")
	private Class6_Sub1_Sub3_Sub3 aClass6_Sub1_Sub3_Sub3_15;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "Lclient!WQACZBNG;")
	private Class6_Sub1_Sub3_Sub3 aClass6_Sub1_Sub3_Sub3_16;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "I")
	private int anInt1018;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
	private int anInt1019;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "I")
	private int anInt1021;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "I")
	private int anInt1022;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "I")
	private int anInt1023;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "I")
	private int anInt1024;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
	private int anInt1025;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "I")
	private int anInt1026;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
	private int anInt1027;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "Lclient!WQACZBNG;")
	private Class6_Sub1_Sub3_Sub3 aClass6_Sub1_Sub3_Sub3_17;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
	private int anInt1029;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
	private int anInt1030;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "I")
	private int anInt1032;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
	private int anInt1033;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "I")
	private int anInt1034;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "Lclient!VEIVHFHZ;")
	private Class6_Sub1_Sub3_Sub2 aClass6_Sub1_Sub3_Sub2_16;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "Lclient!VEIVHFHZ;")
	private Class6_Sub1_Sub3_Sub2 aClass6_Sub1_Sub3_Sub2_17;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "Lclient!VEIVHFHZ;")
	private Class6_Sub1_Sub3_Sub2 aClass6_Sub1_Sub3_Sub2_18;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "Lclient!VEIVHFHZ;")
	private Class6_Sub1_Sub3_Sub2 aClass6_Sub1_Sub3_Sub2_19;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "Lclient!VEIVHFHZ;")
	private Class6_Sub1_Sub3_Sub2 aClass6_Sub1_Sub3_Sub2_20;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "I")
	private int anInt1039;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "[I")
	private int[] anIntArray268;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "[I")
	private int[] anIntArray269;

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "Lclient!DRNBRPSO;")
	private Class8 aClass8_25;

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "Lclient!DRNBRPSO;")
	private Class8 aClass8_26;

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "Lclient!DRNBRPSO;")
	private Class8 aClass8_27;

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "I")
	private int anInt1042;

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "I")
	private int anInt1043;

	@OriginalMember(owner = "client!client", name = "Pj", descriptor = "I")
	private int anInt1044;

	@OriginalMember(owner = "client!client", name = "Qj", descriptor = "I")
	private int anInt1045;

	@OriginalMember(owner = "client!client", name = "Rj", descriptor = "Ljava/lang/String;")
	private String aString31;

	@OriginalMember(owner = "client!client", name = "Tj", descriptor = "I")
	private int anInt1047;

	@OriginalMember(owner = "client!client", name = "Uj", descriptor = "I")
	private int anInt1048;

	@OriginalMember(owner = "client!client", name = "Wj", descriptor = "I")
	private int anInt1049;

	@OriginalMember(owner = "client!client", name = "Zj", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "ek", descriptor = "I")
	private int anInt1053;

	@OriginalMember(owner = "client!client", name = "fk", descriptor = "I")
	private int anInt1054;

	@OriginalMember(owner = "client!client", name = "gk", descriptor = "I")
	private int anInt1055;

	@OriginalMember(owner = "client!client", name = "jk", descriptor = "I")
	private int anInt1056;

	@OriginalMember(owner = "client!client", name = "kk", descriptor = "I")
	private int anInt1057;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "B")
	private byte aByte57 = 8;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "[Lclient!YFAYUBGF;")
	public Class45[] aClass45Array1 = new Class45[5];

	@OriginalMember(owner = "client!client", name = "M", descriptor = "I")
	private int anInt825 = 5063219;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "O", descriptor = "[I")
	private int[] anIntArray212 = new int[5];

	@OriginalMember(owner = "client!client", name = "P", descriptor = "I")
	private int anInt826 = 907;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "T", descriptor = "Z")
	private boolean aBoolean212 = false;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "I")
	private int anInt829 = -1;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Lclient!PQBRPYKE;")
	private Class6_Sub1_Sub4 aClass6_Sub1_Sub4_6 = Class6_Sub1_Sub4.method227();

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
	private int anInt830 = -1;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "[I")
	private int[] anIntArray213 = new int[256];

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
	private int anInt832 = -214;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Ljava/lang/String;")
	private String aString18 = "";

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
	private int anInt834 = 2;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	private int anInt836 = 1;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Lclient!PQBRPYKE;")
	private Class6_Sub1_Sub4 aClass6_Sub1_Sub4_7 = Class6_Sub1_Sub4.method227();

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
	private int anInt840 = 3;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
	private int anInt842 = 5;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "[Lclient!WQACZBNG;")
	private Class6_Sub1_Sub3_Sub3[] aClass6_Sub1_Sub3_Sub3Array4 = new Class6_Sub1_Sub3_Sub3[8];

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	private int anInt845 = -799;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	private int anInt848 = -1;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "Z")
	private boolean aBoolean213 = true;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "Z")
	private boolean aBoolean214 = false;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "Z")
	private boolean aBoolean215 = false;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "Ljava/lang/String;")
	private String aString19 = "";

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[100];

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "[I")
	private int[] anIntArray214 = new int[100];

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "Z")
	private boolean aBoolean216 = false;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "[Lclient!VEIVHFHZ;")
	private Class6_Sub1_Sub3_Sub2[] aClass6_Sub1_Sub3_Sub2Array2 = new Class6_Sub1_Sub3_Sub2[100];

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "[Lclient!VEIVHFHZ;")
	private Class6_Sub1_Sub3_Sub2[] aClass6_Sub1_Sub3_Sub2Array3 = new Class6_Sub1_Sub3_Sub2[2];

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "[[I")
	private int[][] anIntArrayArray22 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "B")
	private byte aByte58 = -119;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "Z")
	private boolean aBoolean217 = false;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "B")
	private byte aByte59 = -125;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "[I")
	private int[] anIntArray215 = new int[5];

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "Z")
	private boolean aBoolean218 = false;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "[I")
	private int[] anIntArray216 = new int[500];

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "[I")
	private int[] anIntArray217 = new int[500];

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "[I")
	private int[] anIntArray218 = new int[500];

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "[I")
	private int[] anIntArray219 = new int[500];

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "Z")
	private boolean aBoolean219 = false;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
	private int anInt855 = -1;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "[I")
	private int[] anIntArray220 = new int[50];

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "B")
	private byte aByte60 = 40;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "[I")
	private int[] anIntArray221 = new int[33];

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "I")
	private int anInt857 = 464;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "B")
	private byte aByte61 = -72;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "[I")
	private int[] anIntArray222 = new int[50];

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "Z")
	private boolean aBoolean220 = true;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "Ljava/lang/String;")
	private String aString20 = "";

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "Ljava/lang/String;")
	private String aString21 = "";

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "Z")
	private boolean aBoolean221 = false;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[500];

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
	private int anInt868 = -1;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "[[I")
	private int[][] anIntArrayArray23 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "Z")
	private boolean aBoolean222 = false;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "Lclient!ATOBWHST;")
	private Class1 aClass1_1 = new Class1();

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "Z")
	private boolean aBoolean223 = false;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
	private int anInt875 = 2;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "I")
	private int anInt878 = -129;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "I")
	private int anInt879 = -1;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "[I")
	private int[] anIntArray224 = new int[1000];

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "[I")
	private int[] anIntArray225 = new int[1000];

	@OriginalMember(owner = "client!client", name = "td", descriptor = "I")
	private int anInt883 = -1;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "[I")
	private int[] anIntArray226 = new int[Class3.anInt51];

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "[Lclient!EOSBSGLH;")
	private Class12[] aClass12Array1 = new Class12[4];

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "Z")
	private boolean aBoolean226 = false;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "Lclient!PQBRPYKE;")
	private Class6_Sub1_Sub4 aClass6_Sub1_Sub4_8 = new Class6_Sub1_Sub4(888, new byte[5000]);

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "[Lclient!TBFTCCSF;")
	private Class6_Sub1_Sub2_Sub4_Sub1[] aClass6_Sub1_Sub2_Sub4_Sub1Array1 = new Class6_Sub1_Sub2_Sub4_Sub1[16384];

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "[I")
	private int[] anIntArray227 = new int[16384];

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "Z")
	private boolean aBoolean227 = false;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
	private int anInt897 = -489;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
	private int anInt899 = 2;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "Z")
	private boolean aBoolean228 = false;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "Lclient!VGFLNLXH;")
	private Class40 aClass40_10 = new Class40(826);

	@OriginalMember(owner = "client!client", name = "je", descriptor = "Lclient!VGFLNLXH;")
	private Class40 aClass40_11 = new Class40(826);

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
	private int anInt909 = -1;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "[I")
	private int[] anIntArray232 = new int[151];

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "[I")
	private int[] anIntArray233 = new int[7];

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
	private int anInt917 = 584;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "[Lclient!WQACZBNG;")
	private Class6_Sub1_Sub3_Sub3[] aClass6_Sub1_Sub3_Sub3Array5 = new Class6_Sub1_Sub3_Sub3[32];

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
	private int anInt924 = -1;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "Z")
	private boolean aBoolean231 = false;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
	private final int anInt927 = 100;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "[I")
	private int[] anIntArray234 = new int[100];

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "Z")
	private boolean aBoolean232 = false;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "B")
	private byte aByte62 = -68;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "Ljava/lang/String;")
	private String aString24 = "";

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "[I")
	private final int[] anIntArray235 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "[I")
	private int[] anIntArray236 = new int[9];

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[5];

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[200];

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "Z")
	private volatile boolean aBoolean233 = false;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "Ljava/lang/String;")
	private String aString25 = "";

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "I")
	private int anInt940 = 7;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "[Lclient!WQACZBNG;")
	private Class6_Sub1_Sub3_Sub3[] aClass6_Sub1_Sub3_Sub3Array6 = new Class6_Sub1_Sub3_Sub3[20];

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "Z")
	private boolean aBoolean234 = false;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "[I")
	private int[] anIntArray237 = new int[200];

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "[I")
	private int[] anIntArray238 = new int[5];

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "Lclient!VGFLNLXH;")
	private Class40 aClass40_12 = new Class40(826);

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "Z")
	private boolean aBoolean235 = false;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "Z")
	private boolean aBoolean236 = false;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "[I")
	public int[] anIntArray239 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "Z")
	private boolean aBoolean237 = false;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "Z")
	private boolean aBoolean238 = false;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "Z")
	private boolean aBoolean239 = true;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "Z")
	private volatile boolean aBoolean240 = false;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "I")
	private int anInt966 = 642;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
	private int anInt967 = -11116;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "B")
	private byte aByte64 = 10;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "I")
	private int anInt969 = 7759444;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "[I")
	private int[] anIntArray242 = new int[Class3.anInt51];

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "[I")
	private int[] anIntArray243 = new int[100];

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[100];

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[100];

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "Z")
	private boolean aBoolean241 = true;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private int anInt970 = 9;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "Z")
	private boolean aBoolean242 = true;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "B")
	private byte aByte65 = 0;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "[Lclient!WQACZBNG;")
	private Class6_Sub1_Sub3_Sub3[] aClass6_Sub1_Sub3_Sub3Array7 = new Class6_Sub1_Sub3_Sub3[32];

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "I")
	private int anInt974 = 1;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "[I")
	private int[] anIntArray248 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "[I")
	private int[] anIntArray249 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
	private int anInt976 = -1;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "[Lclient!VEIVHFHZ;")
	private Class6_Sub1_Sub3_Sub2[] aClass6_Sub1_Sub3_Sub2Array4 = new Class6_Sub1_Sub3_Sub2[13];

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "I")
	private int anInt979 = -1;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "B")
	private byte aByte66 = 58;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "I")
	private int anInt981 = 7558;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "Z")
	public boolean aBoolean243 = false;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "I")
	private int anInt982 = -42352;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "[Lclient!WQACZBNG;")
	private Class6_Sub1_Sub3_Sub3[] aClass6_Sub1_Sub3_Sub3Array8 = new Class6_Sub1_Sub3_Sub3[100];

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "[Lclient!WQACZBNG;")
	private Class6_Sub1_Sub3_Sub3[] aClass6_Sub1_Sub3_Sub3Array9 = new Class6_Sub1_Sub3_Sub3[1000];

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "[I")
	private int[] anIntArray250 = new int[Class3.anInt51];

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "[[[Lclient!VGFLNLXH;")
	private Class40[][][] aClass40ArrayArrayArray1 = new Class40[4][104][104];

	@OriginalMember(owner = "client!client", name = "th", descriptor = "Ljava/lang/String;")
	private String aString27 = "";

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "Ljava/lang/String;")
	private String aString28 = "";

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "Z")
	private boolean aBoolean244 = false;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "Z")
	private boolean aBoolean245 = false;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "I")
	private int anInt985 = 2048;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
	private int anInt986 = 2047;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "[Lclient!TPTANZXN;")
	private Class6_Sub1_Sub2_Sub4_Sub2[] aClass6_Sub1_Sub2_Sub4_Sub2Array1 = new Class6_Sub1_Sub2_Sub4_Sub2[this.anInt985];

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "[I")
	private int[] anIntArray251 = new int[this.anInt985];

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "[I")
	private int[] anIntArray252 = new int[this.anInt985];

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "[Lclient!PQBRPYKE;")
	private Class6_Sub1_Sub4[] aClass6_Sub1_Sub4Array1 = new Class6_Sub1_Sub4[this.anInt985];

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
	private int anInt994 = 2301979;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "[Lclient!WQACZBNG;")
	private Class6_Sub1_Sub3_Sub3[] aClass6_Sub1_Sub3_Sub3Array10 = new Class6_Sub1_Sub3_Sub3[32];

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "I")
	private int anInt997 = 15536;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "Z")
	private boolean aBoolean246 = true;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "I")
	private int anInt999 = 78;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
	private int anInt1000 = -1;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "I")
	private int anInt1001 = -1;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
	private int anInt1015 = 3353893;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "[I")
	private int[] anIntArray257 = new int[33];

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "B")
	private byte aByte67 = 106;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
	private int anInt1016 = 3;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "[J")
	private long[] aLongArray4 = new long[200];

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "[I")
	private int[] anIntArray258 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "B")
	private byte aByte68 = 100;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
	private int anInt1031 = 50;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "[I")
	private int[] anIntArray259 = new int[this.anInt1031];

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "[I")
	private int[] anIntArray260 = new int[this.anInt1031];

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "[I")
	private int[] anIntArray261 = new int[this.anInt1031];

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "[I")
	private int[] anIntArray262 = new int[this.anInt1031];

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "[I")
	private int[] anIntArray263 = new int[this.anInt1031];

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "[I")
	private int[] anIntArray264 = new int[this.anInt1031];

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "[I")
	private int[] anIntArray265 = new int[this.anInt1031];

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray14 = new String[this.anInt1031];

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "[I")
	private int[] anIntArray266 = new int[50];

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "Z")
	private boolean aBoolean247 = false;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "Z")
	private volatile boolean aBoolean248 = false;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "I")
	private int anInt1035 = 3;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "Lclient!PQBRPYKE;")
	private Class6_Sub1_Sub4 aClass6_Sub1_Sub4_9 = Class6_Sub1_Sub4.method227();

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "Ljava/lang/String;")
	private String aString30 = "";

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "I")
	private int anInt1038 = -1;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "Z")
	private boolean aBoolean249 = false;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "[I")
	private int[] anIntArray267 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "I")
	private int anInt1040 = -234;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "[I")
	private int[] anIntArray270 = new int[] { 17, 24, 34, 40 };

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "Z")
	private boolean aBoolean250 = false;

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "[I")
	private int[] anIntArray272 = new int[151];

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "[I")
	private int[] anIntArray273 = new int[5];

	@OriginalMember(owner = "client!client", name = "Sj", descriptor = "I")
	private int anInt1046 = -1;

	@OriginalMember(owner = "client!client", name = "Vj", descriptor = "[I")
	private int[] anIntArray274 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Xj", descriptor = "Z")
	private boolean aBoolean251 = false;

	@OriginalMember(owner = "client!client", name = "Yj", descriptor = "[I")
	private int[] anIntArray275 = new int[2000];

	@OriginalMember(owner = "client!client", name = "ak", descriptor = "I")
	private int anInt1050 = 6;

	@OriginalMember(owner = "client!client", name = "bk", descriptor = "I")
	private int anInt1051 = -1;

	@OriginalMember(owner = "client!client", name = "ck", descriptor = "Z")
	private boolean aBoolean252 = false;

	@OriginalMember(owner = "client!client", name = "dk", descriptor = "I")
	private int anInt1052 = 128;

	@OriginalMember(owner = "client!client", name = "hk", descriptor = "[I")
	private int[] anIntArray276 = new int[5];

	@OriginalMember(owner = "client!client", name = "ik", descriptor = "Z")
	private boolean aBoolean253 = true;

	static {
		@Pc(4) int local4 = 2;
		@Pc(6) int local6;
		for (local6 = 0; local6 < 32; local6++) {
			anIntArray223[local6] = local4 - 1;
			local4 += local4;
		}
		anInt876 = 10;
		aBoolean224 = true;
		aByte63 = 8;
		anInt948 = -251;
		anInt952 = 33560;
		anInt978 = -46;
		aString26 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		anIntArray253 = new int[99];
		local4 = 0;
		for (local6 = 0; local6 < 99; local6++) {
			@Pc(47) int local47 = local6 + 1;
			@Pc(60) int local60 = (int) ((double) local47 + 300.0D * Math.pow(2.0D, (double) local47 / 7.0D));
			local4 += local60;
			anIntArray253[local6] = local4 / 4;
		}
		aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		anIntArrayArray25 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		anInt1037 = -126;
		anIntArray271 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private static void method612() {
		try {
			Class38.aBoolean156 = false;
			Class6_Sub1_Sub3_Sub1.aBoolean99 = false;
			aBoolean225 = false;
			Class7.aBoolean22 = false;
			Class11.aBoolean43 = false;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("82238, " + true + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)Ljava/lang/String;")
	private static String method633(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("77356, " + arg0 + ", " + -2 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private static void method652(@OriginalArg(0) int arg0) {
		try {
			Class38.aBoolean156 = true;
			Class6_Sub1_Sub3_Sub1.aBoolean99 = true;
			@Pc(7) boolean local7 = false;
			aBoolean225 = true;
			Class7.aBoolean22 = true;
			Class11.aBoolean43 = true;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("40617, " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
	private static String method659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(7) int local7 = arg1 - arg0;
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
			signlink.reporterror("47974, " + arg0 + ", " + arg1 + ", " + true + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 374);
			if (arg0.length == 5) {
				anInt876 = Integer.parseInt(arg0[0]);
				anInt877 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method652(258);
				} else if (arg0[2].equals("highmem")) {
					method612();
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
				local87.method574();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)Ljava/lang/String;")
	private static String method721(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) String local4 = String.valueOf(arg1);
			if (arg0 != -125) {
				anInt1037 = -246;
			}
			for (@Pc(14) int local14 = local4.length() - 3; local14 > 0; local14 -= 3) {
				local4 = local4.substring(0, local14) + "," + local4.substring(local14);
			}
			if (local4.length() > 8) {
				local4 = "@gre@" + local4.substring(0, local4.length() - 8) + " million @whi@(" + local4 + ")";
			} else if (local4.length() > 4) {
				local4 = "@cya@" + local4.substring(0, local4.length() - 4) + "K @whi@(" + local4 + ")";
			}
			return " " + local4;
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("15103, " + arg0 + ", " + arg1 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method587() {
		try {
			this.anInt1030 = 0;
			@Pc(70) int local70;
			for (@Pc(6) int local6 = -1; local6 < this.anInt987 + this.anInt885; local6++) {
				@Pc(13) Class6_Sub1_Sub2_Sub4 local13;
				if (local6 == -1) {
					local13 = aClass6_Sub1_Sub2_Sub4_Sub2_1;
				} else if (local6 < this.anInt987) {
					local13 = this.aClass6_Sub1_Sub2_Sub4_Sub2Array1[this.anIntArray251[local6]];
				} else {
					local13 = this.aClass6_Sub1_Sub2_Sub4_Sub1Array1[this.anIntArray227[local6 - this.anInt987]];
				}
				if (local13 != null && local13.method381()) {
					@Pc(54) Class20 local54;
					if (local13 instanceof Class6_Sub1_Sub2_Sub4_Sub1) {
						local54 = ((Class6_Sub1_Sub2_Sub4_Sub1) local13).aClass20_1;
						if (local54.anIntArray82 != null) {
							local54 = local54.method147();
						}
						if (local54 == null) {
							continue;
						}
					}
					if (local6 >= this.anInt987) {
						local54 = ((Class6_Sub1_Sub2_Sub4_Sub1) local13).aClass20_1;
						if (local54.anInt291 >= 0 && local54.anInt291 < this.aClass6_Sub1_Sub3_Sub3Array10.length) {
							this.method622(local13.anInt605 + 15, local13);
							if (this.anInt1000 > -1) {
								this.aClass6_Sub1_Sub3_Sub3Array10[local54.anInt291].method506(this.anInt1001 - 30, this.anInt1000 - 12, this.anInt1040);
							}
						}
						if (this.anInt1002 == 1 && this.anInt847 == this.anIntArray227[local6 - this.anInt987] && anInt1041 % 20 < 10) {
							this.method622(local13.anInt605 + 15, local13);
							if (this.anInt1000 > -1) {
								this.aClass6_Sub1_Sub3_Sub3Array7[0].method506(this.anInt1001 - 28, this.anInt1000 - 12, this.anInt1040);
							}
						}
					} else {
						local70 = 30;
						@Pc(73) Class6_Sub1_Sub2_Sub4_Sub2 local73 = (Class6_Sub1_Sub2_Sub4_Sub2) local13;
						if (local73.anInt629 != -1 || local73.anInt630 != -1) {
							this.method622(local13.anInt605 + 15, local13);
							if (this.anInt1000 > -1) {
								if (local73.anInt629 != -1) {
									this.aClass6_Sub1_Sub3_Sub3Array5[local73.anInt629].method506(this.anInt1001 - 30, this.anInt1000 - 12, this.anInt1040);
									local70 += 25;
								}
								if (local73.anInt630 != -1) {
									this.aClass6_Sub1_Sub3_Sub3Array10[local73.anInt630].method506(this.anInt1001 - local70, this.anInt1000 - 12, this.anInt1040);
									local70 += 25;
								}
							}
						}
						if (local6 >= 0 && this.anInt1002 == 10 && this.anInt837 == this.anIntArray251[local6]) {
							this.method622(local13.anInt605 + 15, local13);
							if (this.anInt1000 > -1) {
								this.aClass6_Sub1_Sub3_Sub3Array7[1].method506(this.anInt1001 - local70, this.anInt1000 - 12, this.anInt1040);
							}
						}
					}
					if (local13.aString15 != null && (local6 >= this.anInt987 || this.anInt964 == 0 || this.anInt964 == 3 || this.anInt964 == 1 && this.method702(((Class6_Sub1_Sub2_Sub4_Sub2) local13).aString16))) {
						this.method622(local13.anInt605, local13);
						if (this.anInt1000 > -1 && this.anInt1030 < this.anInt1031) {
							this.anIntArray262[this.anInt1030] = this.aClass6_Sub1_Sub3_Sub4_4.method560(local13.aString15) / 2;
							this.anIntArray261[this.anInt1030] = this.aClass6_Sub1_Sub3_Sub4_4.anInt797;
							this.anIntArray259[this.anInt1030] = this.anInt1000;
							this.anIntArray260[this.anInt1030] = this.anInt1001;
							this.anIntArray263[this.anInt1030] = local13.anInt598;
							this.anIntArray264[this.anInt1030] = local13.anInt608;
							this.anIntArray265[this.anInt1030] = local13.anInt601;
							this.aStringArray14[this.anInt1030++] = local13.aString15;
							if (this.anInt901 == 0 && local13.anInt608 >= 1 && local13.anInt608 <= 3) {
								this.anIntArray261[this.anInt1030] += 10;
								this.anIntArray260[this.anInt1030] += 5;
							}
							if (this.anInt901 == 0 && local13.anInt608 == 4) {
								this.anIntArray262[this.anInt1030] = 60;
							}
							if (this.anInt901 == 0 && local13.anInt608 == 5) {
								this.anIntArray261[this.anInt1030] += 5;
							}
						}
					}
					if (local13.anInt567 > anInt1041) {
						this.method622(local13.anInt605 + 15, local13);
						if (this.anInt1000 > -1) {
							local70 = local13.anInt568 * 30 / local13.anInt569;
							if (local70 > 30) {
								local70 = 30;
							}
							Class6_Sub1_Sub3.method549(this.anInt1000 - 15, local70, this.anInt1001 - 3, 65280, 5);
							Class6_Sub1_Sub3.method549(this.anInt1000 - 15 + local70, 30 - local70, this.anInt1001 - 3, 16711680, 5);
						}
					}
					for (local70 = 0; local70 < 4; local70++) {
						if (local13.anIntArray168[local70] > anInt1041) {
							this.method622(local13.anInt605 / 2, local13);
							if (this.anInt1000 > -1) {
								if (local70 == 1) {
									this.anInt1001 -= 20;
								}
								if (local70 == 2) {
									this.anInt1000 -= 15;
									this.anInt1001 -= 10;
								}
								if (local70 == 3) {
									this.anInt1000 += 15;
									this.anInt1001 -= 10;
								}
								this.aClass6_Sub1_Sub3_Sub3Array6[local13.anIntArray167[local70]].method506(this.anInt1001 - 12, this.anInt1000 - 12, this.anInt1040);
								this.aClass6_Sub1_Sub3_Sub4_2.method557(String.valueOf(local13.anIntArray166[local70]), this.anInt1000, 0, this.anInt1001 + 4);
								this.aClass6_Sub1_Sub3_Sub4_2.method557(String.valueOf(local13.anIntArray166[local70]), this.anInt1000 - 1, 16777215, this.anInt1001 + 3);
							}
						}
					}
				}
			}
			anInt1036++;
			@Pc(636) int local636;
			if (anInt1036 > 1485) {
				anInt1036 = 0;
				this.aClass6_Sub1_Sub4_6.method228(254);
				this.aClass6_Sub1_Sub4_6.method229(0);
				local636 = this.aClass6_Sub1_Sub4_6.anInt390;
				this.aClass6_Sub1_Sub4_6.method229(155);
				this.aClass6_Sub1_Sub4_6.method230(29543);
				this.aClass6_Sub1_Sub4_6.method229((int) (Math.random() * 256.0D));
				this.aClass6_Sub1_Sub4_6.method229((int) (Math.random() * 256.0D));
				this.aClass6_Sub1_Sub4_6.method229((int) (Math.random() * 256.0D));
				this.aClass6_Sub1_Sub4_6.method229((int) (Math.random() * 256.0D));
				this.aClass6_Sub1_Sub4_6.method230(42538);
				this.aClass6_Sub1_Sub4_6.method229((int) (Math.random() * 256.0D));
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass6_Sub1_Sub4_6.method230(6785);
				}
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass6_Sub1_Sub4_6.method230(34515);
				}
				this.aClass6_Sub1_Sub4_6.method238(this.aClass6_Sub1_Sub4_6.anInt390 - local636);
			}
			for (local636 = 0; local636 < this.anInt1030; local636++) {
				local70 = this.anIntArray259[local636];
				@Pc(724) int local724 = this.anIntArray260[local636];
				@Pc(729) int local729 = this.anIntArray262[local636];
				@Pc(734) int local734 = this.anIntArray261[local636];
				@Pc(736) boolean local736 = true;
				while (local736) {
					local736 = false;
					for (@Pc(742) int local742 = 0; local742 < local636; local742++) {
						if (local724 + 2 > this.anIntArray260[local742] - this.anIntArray261[local742] && local724 - local734 < this.anIntArray260[local742] + 2 && local70 - local729 < this.anIntArray259[local742] + this.anIntArray262[local742] && local70 + local729 > this.anIntArray259[local742] - this.anIntArray262[local742] && this.anIntArray260[local742] - this.anIntArray261[local742] < local724) {
							local724 = this.anIntArray260[local742] - this.anIntArray261[local742];
							local736 = true;
						}
					}
				}
				this.anInt1000 = this.anIntArray259[local636];
				this.anInt1001 = this.anIntArray260[local636] = local724;
				@Pc(841) String local841 = this.aStringArray14[local636];
				if (this.anInt901 == 0) {
					@Pc(846) int local846 = 16776960;
					if (this.anIntArray263[local636] < 6) {
						local846 = this.anIntArray258[this.anIntArray263[local636]];
					}
					if (this.anIntArray263[local636] == 6) {
						local846 = this.anInt930 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray263[local636] == 7) {
						local846 = this.anInt930 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray263[local636] == 8) {
						local846 = this.anInt930 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(921) int local921;
					if (this.anIntArray263[local636] == 9) {
						local921 = 150 - this.anIntArray265[local636];
						if (local921 < 50) {
							local846 = 16711680 + 1280 * local921;
						} else if (local921 < 100) {
							local846 = 16776960 - 327680 * (local921 - 50);
						} else if (local921 < 150) {
							local846 = 65280 + 5 * (local921 - 100);
						}
					}
					if (this.anIntArray263[local636] == 10) {
						local921 = 150 - this.anIntArray265[local636];
						if (local921 < 50) {
							local846 = 16711680 + 5 * local921;
						} else if (local921 < 100) {
							local846 = 16711935 - 327680 * (local921 - 50);
						} else if (local921 < 150) {
							local846 = 255 + 327680 * (local921 - 100) - 5 * (local921 - 100);
						}
					}
					if (this.anIntArray263[local636] == 11) {
						local921 = 150 - this.anIntArray265[local636];
						if (local921 < 50) {
							local846 = 16777215 - 327685 * local921;
						} else if (local921 < 100) {
							local846 = 65280 + 327685 * (local921 - 50);
						} else if (local921 < 150) {
							local846 = 16777215 - 327680 * (local921 - 100);
						}
					}
					if (this.anIntArray264[local636] == 0) {
						this.aClass6_Sub1_Sub3_Sub4_4.method557(local841, this.anInt1000, 0, this.anInt1001 + 1);
						this.aClass6_Sub1_Sub3_Sub4_4.method557(local841, this.anInt1000, local846, this.anInt1001);
					}
					if (this.anIntArray264[local636] == 1) {
						this.aClass6_Sub1_Sub3_Sub4_4.method562(local841, this.anInt1000, 0, this.anInt930, this.anInt1001 + 1);
						this.aClass6_Sub1_Sub3_Sub4_4.method562(local841, this.anInt1000, local846, this.anInt930, this.anInt1001);
					}
					if (this.anIntArray264[local636] == 2) {
						this.aClass6_Sub1_Sub3_Sub4_4.method563(0, this.anInt1001 + 1, this.anInt930, local841, this.anInt1000);
						this.aClass6_Sub1_Sub3_Sub4_4.method563(local846, this.anInt1001, this.anInt930, local841, this.anInt1000);
					}
					if (this.anIntArray264[local636] == 3) {
						this.aClass6_Sub1_Sub3_Sub4_4.method564(this.anInt1001 + 1, this.anInt930, local841, 150 - this.anIntArray265[local636], this.anInt1000, 0);
						this.aClass6_Sub1_Sub3_Sub4_4.method564(this.anInt1001, this.anInt930, local841, 150 - this.anIntArray265[local636], this.anInt1000, local846);
					}
					@Pc(1218) int local1218;
					if (this.anIntArray264[local636] == 4) {
						local921 = this.aClass6_Sub1_Sub3_Sub4_4.method560(local841);
						local1218 = (150 - this.anIntArray265[local636]) * (local921 + 100) / 150;
						Class6_Sub1_Sub3.method546(this.anInt1000 - 50, 334, 0, this.anInt1000 + 50);
						this.aClass6_Sub1_Sub3_Sub4_4.method561(local841, this.anInt1001 + 1, 0, this.anInt1000 + 50 - local1218);
						this.aClass6_Sub1_Sub3_Sub4_4.method561(local841, this.anInt1001, local846, this.anInt1000 + 50 - local1218);
						Class6_Sub1_Sub3.method545();
					}
					if (this.anIntArray264[local636] == 5) {
						local921 = 150 - this.anIntArray265[local636];
						local1218 = 0;
						if (local921 < 25) {
							local1218 = local921 - 25;
						} else if (local921 > 125) {
							local1218 = local921 - 125;
						}
						Class6_Sub1_Sub3.method546(0, this.anInt1001 + 5, this.anInt1001 - this.aClass6_Sub1_Sub3_Sub4_4.anInt797 - 1, 512);
						this.aClass6_Sub1_Sub3_Sub4_4.method557(local841, this.anInt1000, 0, this.anInt1001 + 1 + local1218);
						this.aClass6_Sub1_Sub3_Sub4_4.method557(local841, this.anInt1000, local846, this.anInt1001 + local1218);
						Class6_Sub1_Sub3.method545();
					}
				} else {
					this.aClass6_Sub1_Sub3_Sub4_4.method557(local841, this.anInt1000, 0, this.anInt1001 + 1);
					this.aClass6_Sub1_Sub3_Sub4_4.method557(local841, this.anInt1000, 16776960, this.anInt1001);
				}
			}
		} catch (@Pc(1371) RuntimeException local1371) {
			signlink.reporterror("32884, " + 3 + ", " + local1371.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/lang/String;ILjava/lang/String;I)Lclient!XOJZVVDK;")
	private Class43 method588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(3) byte[] local3 = null;
			this.anInt1004 += arg3;
			@Pc(11) int local11 = 5;
			try {
				if (this.aClass45Array1[0] != null) {
					local3 = this.aClass45Array1[0].method525(arg0);
				}
			} catch (@Pc(26) Exception local26) {
			}
			@Pc(40) int local40;
			if (local3 != null) {
				this.aCRC32_2.reset();
				this.aCRC32_2.update(local3);
				local40 = (int) this.aCRC32_2.getValue();
				if (local40 != arg5) {
					local3 = null;
				}
			}
			if (local3 != null) {
				return new Class43(local3, this.anInt940);
			}
			local40 = 0;
			while (local3 == null) {
				@Pc(62) String local62 = "Unknown error";
				this.method586("Requesting " + arg2, arg1);
				@Pc(77) int local77;
				try {
					local77 = 0;
					@Pc(88) DataInputStream local88 = this.method658(arg4 + arg5);
					@Pc(91) byte[] local91 = new byte[6];
					local88.readFully(local91, 0, 6);
					@Pc(102) Class6_Sub1_Sub4 local102 = new Class6_Sub1_Sub4(888, local91);
					local102.anInt390 = 3;
					@Pc(110) int local110 = local102.method243() + 6;
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
							this.method586("Loading " + arg2 + " - " + local175 + "%", arg1);
						}
						local77 = local175;
					}
					local88.close();
					try {
						if (this.aClass45Array1[0] != null) {
							this.aClass45Array1[0].method526(local3, local3.length, arg0);
						}
					} catch (@Pc(220) Exception local220) {
						this.aClass45Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local3);
						local135 = (int) this.aCRC32_2.getValue();
						if (local135 != arg5) {
							local3 = null;
							local40++;
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
					for (local77 = local11; local77 > 0; local77--) {
						if (local40 >= 3) {
							this.method586("Game updated - please reload page", arg1);
							local77 = 10;
						} else {
							this.method586(local62 + " - Retrying in " + local77, arg1);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(327) Exception local327) {
						}
					}
					local11 *= 2;
					if (local11 > 60) {
						local11 = 60;
					}
					this.aBoolean237 = !this.aBoolean237;
				}
			}
			return new Class43(local3, this.anInt940);
		} catch (@Pc(360) RuntimeException local360) {
			signlink.reporterror("35725, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local360.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	private void method589() {
		try {
			@Pc(6) int local6 = this.anInt943 * 128 + 64;
			@Pc(13) int local13 = this.anInt944 * 128 + 64;
			@Pc(24) int local24 = this.method635(this.anInt854, local13, local6) - this.anInt945;
			if (this.anInt1009 < local6) {
				this.anInt1009 += this.anInt946 + (local6 - this.anInt1009) * this.anInt947 / 1000;
				if (this.anInt1009 > local6) {
					this.anInt1009 = local6;
				}
			}
			if (this.anInt1009 > local6) {
				this.anInt1009 -= this.anInt946 + (this.anInt1009 - local6) * this.anInt947 / 1000;
				if (this.anInt1009 < local6) {
					this.anInt1009 = local6;
				}
			}
			if (this.anInt1010 < local24) {
				this.anInt1010 += this.anInt946 + (local24 - this.anInt1010) * this.anInt947 / 1000;
				if (this.anInt1010 > local24) {
					this.anInt1010 = local24;
				}
			}
			if (this.anInt1010 > local24) {
				this.anInt1010 -= this.anInt946 + (this.anInt1010 - local24) * this.anInt947 / 1000;
				if (this.anInt1010 < local24) {
					this.anInt1010 = local24;
				}
			}
			if (this.anInt1011 < local13) {
				this.anInt1011 += this.anInt946 + (local13 - this.anInt1011) * this.anInt947 / 1000;
				if (this.anInt1011 > local13) {
					this.anInt1011 = local13;
				}
			}
			if (this.anInt1011 > local13) {
				this.anInt1011 -= this.anInt946 + (this.anInt1011 - local13) * this.anInt947 / 1000;
				if (this.anInt1011 < local13) {
					this.anInt1011 = local13;
				}
			}
			local6 = this.anInt953 * 128 + 64;
			local13 = this.anInt954 * 128 + 64;
			local24 = this.method635(this.anInt854, local13, local6) - this.anInt955;
			@Pc(228) int local228 = local6 - this.anInt1009;
			@Pc(233) int local233 = local24 - this.anInt1010;
			@Pc(238) int local238 = local13 - this.anInt1011;
			@Pc(249) int local249 = (int) Math.sqrt((double) (local228 * local228 + local238 * local238));
			@Pc(260) int local260 = (int) (Math.atan2((double) local233, (double) local249) * 325.949D) & 0x7FF;
			@Pc(271) int local271 = (int) (Math.atan2((double) local228, (double) local238) * -325.949D) & 0x7FF;
			if (local260 < 128) {
				local260 = 128;
			}
			if (local260 > 383) {
				local260 = 383;
			}
			if (this.anInt1012 < local260) {
				this.anInt1012 += this.anInt956 + (local260 - this.anInt1012) * this.anInt957 / 1000;
				if (this.anInt1012 > local260) {
					this.anInt1012 = local260;
				}
			}
			if (this.anInt1012 > local260) {
				this.anInt1012 -= this.anInt956 + (this.anInt1012 - local260) * this.anInt957 / 1000;
				if (this.anInt1012 < local260) {
					this.anInt1012 = local260;
				}
			}
			@Pc(342) int local342 = local271 - this.anInt1013;
			if (local342 > 1024) {
				local342 -= 2048;
			}
			if (local342 < -1024) {
				local342 += 2048;
			}
			if (local342 > 0) {
				this.anInt1013 += this.anInt956 + local342 * this.anInt957 / 1000;
				this.anInt1013 &= 0x7FF;
			}
			if (local342 < 0) {
				this.anInt1013 -= this.anInt956 + -local342 * this.anInt957 / 1000;
				this.anInt1013 &= 0x7FF;
			}
			@Pc(400) int local400 = local271 - this.anInt1013;
			if (local400 > 1024) {
				local400 -= 2048;
			}
			if (local400 < -1024) {
				local400 += 2048;
			}
			if (local400 < 0 && local342 > 0 || local400 > 0 && local342 < 0) {
				this.anInt1013 = local271;
			}
		} catch (@Pc(421) RuntimeException local421) {
			signlink.reporterror("16693, " + 0 + ", " + local421.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!PQBRPYKE;I)V")
	private void method590(@OriginalArg(1) Class6_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(12) int local12;
			@Pc(17) int local17;
			@Pc(26) int local26;
			@Pc(33) int local33;
			@Pc(59) Class6_Sub1_Sub2_Sub5 local59;
			if (arg1 == 124) {
				local12 = arg0.method267();
				local17 = arg0.method260(this.anInt856);
				local26 = this.anInt995 + (local17 >> 4 & 0x7);
				local33 = this.anInt996 + (local17 & 0x7);
				if (local26 >= 0 && local33 >= 0 && local26 < 104 && local33 < 104) {
					@Pc(53) Class40 local53 = this.aClass40ArrayArrayArray1[this.anInt854][local26][local33];
					if (local53 != null) {
						for (local59 = (Class6_Sub1_Sub2_Sub5) local53.method472(); local59 != null; local59 = (Class6_Sub1_Sub2_Sub5) local53.method474()) {
							if (local59.anInt704 == (local12 & 0x7FFF)) {
								local59.method542();
								break;
							}
						}
						if (local53.method472() == null) {
							this.aClass40ArrayArrayArray1[this.anInt854][local26][local33] = null;
						}
						this.method636(local26, local33);
					}
				}
			} else {
				@Pc(127) int local127;
				@Pc(131) int local131;
				@Pc(135) int local135;
				@Pc(140) int local140;
				@Pc(160) int local160;
				@Pc(172) int local172;
				@Pc(186) int local186;
				@Pc(198) int local198;
				if (arg1 == 11) {
					local12 = arg0.method259();
					local17 = this.anInt995 + (local12 >> 4 & 0x7);
					local26 = this.anInt996 + (local12 & 0x7);
					local33 = arg0.method269((byte) 2);
					local127 = arg0.method258();
					local131 = local127 >> 2;
					local135 = local127 & 0x3;
					local140 = this.anIntArray235[local131];
					if (local17 >= 0 && local26 >= 0 && local17 < 103 && local26 < 103) {
						local160 = this.anIntArrayArrayArray7[this.anInt854][local17][local26];
						local172 = this.anIntArrayArrayArray7[this.anInt854][local17 + 1][local26];
						local186 = this.anIntArrayArrayArray7[this.anInt854][local17 + 1][local26 + 1];
						local198 = this.anIntArrayArrayArray7[this.anInt854][local17][local26 + 1];
						if (local140 == 0) {
							@Pc(209) Class10 local209 = this.aClass38_1.method419(local17, this.anInt854, local26);
							if (local209 != null) {
								@Pc(218) int local218 = local209.anInt92 >> 14 & 0x7FFF;
								if (local131 == 2) {
									local209.aClass6_Sub1_Sub2_2 = new Class6_Sub1_Sub2_Sub1(local33, local218, 0, 4 + local135, local172, local186, local160, 2, false, local198);
									local209.aClass6_Sub1_Sub2_3 = new Class6_Sub1_Sub2_Sub1(local33, local218, 0, local135 + 1 & 0x3, local172, local186, local160, 2, false, local198);
								} else {
									local209.aClass6_Sub1_Sub2_2 = new Class6_Sub1_Sub2_Sub1(local33, local218, 0, local135, local172, local186, local160, local131, false, local198);
								}
							}
						}
						if (local140 == 1) {
							@Pc(286) Class9 local286 = this.aClass38_1.method420(local26, local17, this.anInt854);
							if (local286 != null) {
								local286.aClass6_Sub1_Sub2_1 = new Class6_Sub1_Sub2_Sub1(local33, local286.anInt86 >> 14 & 0x7FFF, 0, 0, local172, local186, local160, 4, false, local198);
							}
						}
						if (local140 == 2) {
							@Pc(320) Class14 local320 = this.aClass38_1.method421(939, local17, local26, this.anInt854);
							if (local131 == 11) {
								local131 = 10;
							}
							if (local320 != null) {
								local320.aClass6_Sub1_Sub2_4 = new Class6_Sub1_Sub2_Sub1(local33, local320.anInt172 >> 14 & 0x7FFF, 0, local135, local172, local186, local160, local131, false, local198);
							}
						}
						if (local140 == 3) {
							@Pc(359) Class32 local359 = this.aClass38_1.method422(local17, this.anInt854, local26);
							if (local359 != null) {
								local359.aClass6_Sub1_Sub2_8 = new Class6_Sub1_Sub2_Sub1(local33, local359.anInt417 >> 14 & 0x7FFF, 0, local135, local172, local186, local160, 22, false, local198);
							}
						}
					}
				} else if (arg1 == 68) {
					local12 = arg0.method239();
					local17 = this.anInt995 + (local12 >> 4 & 0x7);
					local26 = this.anInt996 + (local12 & 0x7);
					local33 = arg0.method241();
					local127 = arg0.method241();
					local131 = arg0.method241();
					if (local17 >= 0 && local26 >= 0 && local17 < 104 && local26 < 104) {
						@Pc(433) Class40 local433 = this.aClass40ArrayArrayArray1[this.anInt854][local17][local26];
						if (local433 != null) {
							for (@Pc(439) Class6_Sub1_Sub2_Sub5 local439 = (Class6_Sub1_Sub2_Sub5) local433.method472(); local439 != null; local439 = (Class6_Sub1_Sub2_Sub5) local433.method474()) {
								if (local439.anInt704 == (local33 & 0x7FFF) && local439.anInt705 == local127) {
									local439.anInt705 = local131;
									break;
								}
							}
							this.method636(local17, local26);
						}
					}
				} else {
					@Pc(528) int local528;
					if (arg1 == 248) {
						local12 = arg0.method239();
						local17 = this.anInt995 + (local12 >> 4 & 0x7);
						local26 = this.anInt996 + (local12 & 0x7);
						local33 = local17 + arg0.method240();
						local127 = local26 + arg0.method240();
						local131 = arg0.method242();
						local135 = arg0.method241();
						local140 = arg0.method239() * 4;
						local160 = arg0.method239() * 4;
						local172 = arg0.method241();
						local186 = arg0.method241();
						local198 = arg0.method239();
						local528 = arg0.method239();
						if (local17 >= 0 && local26 >= 0 && local17 < 104 && local26 < 104 && local33 >= 0 && local127 >= 0 && local33 < 104 && local127 < 104 && local135 != 65535) {
							local17 = local17 * 128 + 64;
							local26 = local26 * 128 + 64;
							local33 = local33 * 128 + 64;
							local127 = local127 * 128 + 64;
							@Pc(604) Class6_Sub1_Sub2_Sub6 local604 = new Class6_Sub1_Sub2_Sub6(local135, this.anInt854, local17, local131, local26, local198, false, local160, local528, this.method635(this.anInt854, local26, local17) - local140, local186 + anInt1041, local172 + anInt1041);
							local604.method524(local172 + anInt1041, local127, this.method635(this.anInt854, local127, local33) - local160, local33);
							this.aClass40_12.method469(local604);
						}
					} else if (arg1 == 156) {
						local12 = arg0.method258();
						local17 = local12 >> 2;
						local26 = local12 & 0x3;
						local33 = this.anIntArray235[local17];
						local127 = arg0.method258();
						local131 = this.anInt995 + (local127 >> 4 & 0x7);
						local135 = this.anInt996 + (local127 & 0x7);
						if (local131 >= 0 && local135 >= 0 && local131 < 104 && local135 < 104) {
							this.method650(0, local17, this.anInt854, -1, local33, local131, local135, local26, -1);
						}
					} else if (arg1 == 183) {
						local12 = arg0.method241();
						local17 = arg0.method260(this.anInt856);
						local26 = this.anInt995 + (local17 >> 4 & 0x7);
						local33 = this.anInt996 + (local17 & 0x7);
						local127 = arg0.method269((byte) 2);
						local131 = arg0.method241();
						if (local26 >= 0 && local33 >= 0 && local26 < 104 && local33 < 104 && local127 != this.anInt848) {
							@Pc(742) Class6_Sub1_Sub2_Sub5 local742 = new Class6_Sub1_Sub2_Sub5();
							local742.anInt704 = local12;
							local742.anInt705 = local131;
							if (this.aClass40ArrayArrayArray1[this.anInt854][local26][local33] == null) {
								this.aClass40ArrayArrayArray1[this.anInt854][local26][local33] = new Class40(826);
							}
							this.aClass40ArrayArrayArray1[this.anInt854][local26][local33].method469(local742);
							this.method636(local26, local33);
						}
					} else if (arg1 == 241) {
						local12 = arg0.method241();
						local17 = arg0.method269((byte) 2);
						local26 = arg0.method258();
						local33 = this.anInt995 + (local26 >> 4 & 0x7);
						local127 = this.anInt996 + (local26 & 0x7);
						if (local33 >= 0 && local127 >= 0 && local33 < 104 && local127 < 104) {
							local59 = new Class6_Sub1_Sub2_Sub5();
							local59.anInt704 = local17;
							local59.anInt705 = local12;
							if (this.aClass40ArrayArrayArray1[this.anInt854][local33][local127] == null) {
								this.aClass40ArrayArrayArray1[this.anInt854][local33][local127] = new Class40(826);
							}
							this.aClass40ArrayArrayArray1[this.anInt854][local33][local127].method469(local59);
							this.method636(local33, local127);
						}
					} else {
						if (arg1 == 164) {
							local12 = arg0.method269((byte) 2);
							@Pc(887) byte local887 = arg0.method261();
							@Pc(891) byte local891 = arg0.method262();
							@Pc(894) byte local894 = arg0.method240();
							local127 = arg0.method268();
							local131 = arg0.method239();
							local135 = this.anInt995 + (local131 >> 4 & 0x7);
							local140 = this.anInt996 + (local131 & 0x7);
							local160 = arg0.method259();
							local172 = local160 >> 2;
							local186 = local160 & 0x3;
							local198 = this.anIntArray235[local172];
							local528 = arg0.method268();
							@Pc(943) byte local943 = arg0.method263(this.anInt966);
							@Pc(947) int local947 = arg0.method267();
							@Pc(953) Class6_Sub1_Sub2_Sub4_Sub2 local953;
							if (local528 == this.anInt848) {
								local953 = aClass6_Sub1_Sub2_Sub4_Sub2_1;
							} else {
								local953 = this.aClass6_Sub1_Sub2_Sub4_Sub2Array1[local528];
							}
							if (local953 != null) {
								@Pc(965) Class11 local965 = Class11.method60(local947);
								@Pc(975) int local975 = this.anIntArrayArrayArray7[this.anInt854][local135][local140];
								@Pc(987) int local987 = this.anIntArrayArrayArray7[this.anInt854][local135 + 1][local140];
								@Pc(1001) int local1001 = this.anIntArrayArrayArray7[this.anInt854][local135 + 1][local140 + 1];
								@Pc(1013) int local1013 = this.anIntArrayArrayArray7[this.anInt854][local135][local140 + 1];
								@Pc(1023) Class6_Sub1_Sub2_Sub2 local1023 = local965.method65(local172, local186, local975, local987, local1001, local1013, -1);
								if (local1023 != null) {
									this.method650(local127 + 1, 0, this.anInt854, local12 + 1, local198, local135, local140, 0, -1);
									local953.anInt621 = local127 + anInt1041;
									local953.anInt622 = local12 + anInt1041;
									local953.aClass6_Sub1_Sub2_Sub2_2 = local1023;
									@Pc(1058) int local1058 = local965.anInt111;
									@Pc(1061) int local1061 = local965.anInt127;
									if (local186 == 1 || local186 == 3) {
										local1058 = local965.anInt127;
										local1061 = local965.anInt111;
									}
									local953.anInt625 = local135 * 128 + local1058 * 64;
									local953.anInt627 = local140 * 128 + local1061 * 64;
									local953.anInt626 = this.method635(this.anInt854, local953.anInt627, local953.anInt625);
									@Pc(1107) byte local1107;
									if (local943 > local891) {
										local1107 = local943;
										local943 = local891;
										local891 = local1107;
									}
									if (local894 > local887) {
										local1107 = local894;
										local894 = local887;
										local887 = local1107;
									}
									local953.anInt616 = local135 + local943;
									local953.anInt618 = local135 + local891;
									local953.anInt617 = local140 + local894;
									local953.anInt619 = local140 + local887;
								}
							}
						}
						if (arg1 == 121) {
							local12 = arg0.method241();
							local17 = arg0.method259();
							local26 = local17 >> 2;
							local33 = local17 & 0x3;
							local127 = this.anIntArray235[local26];
							local131 = arg0.method260(this.anInt856);
							local135 = this.anInt995 + (local131 >> 4 & 0x7);
							local140 = this.anInt996 + (local131 & 0x7);
							if (local135 >= 0 && local140 >= 0 && local135 < 104 && local140 < 104) {
								this.method650(0, local26, this.anInt854, -1, local127, local135, local140, local33, local12);
							}
						} else {
							if (arg1 == 245) {
								local12 = arg0.method239();
								local17 = this.anInt995 + (local12 >> 4 & 0x7);
								local26 = this.anInt996 + (local12 & 0x7);
								local33 = arg0.method241();
								local127 = arg0.method239();
								local131 = local127 >> 4 & 0xF;
								local135 = local127 & 0x7;
								if (aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0] >= local17 - local131 && aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0] <= local17 + local131 && aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0] >= local26 - local131 && aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0] <= local26 + local131 && this.aBoolean241 && !aBoolean225 && this.anInt873 < 50) {
									this.anIntArray266[this.anInt873] = local33;
									this.anIntArray220[this.anInt873] = local135;
									this.anIntArray222[this.anInt873] = Class25.anIntArray110[local33];
									this.anInt873++;
								}
							}
							if (arg1 == 252) {
								local12 = arg0.method239();
								local17 = this.anInt995 + (local12 >> 4 & 0x7);
								local26 = this.anInt996 + (local12 & 0x7);
								local33 = arg0.method241();
								local127 = arg0.method239();
								local131 = arg0.method241();
								if (local17 >= 0 && local26 >= 0 && local17 < 104 && local26 < 104) {
									local17 = local17 * 128 + 64;
									local26 = local26 * 128 + 64;
									@Pc(1387) Class6_Sub1_Sub2_Sub3 local1387 = new Class6_Sub1_Sub2_Sub3(local131, local33, local17, this.anInt854, anInt1041, (byte) 3, this.method635(this.anInt854, local26, local17) - local127, local26);
									this.aClass40_10.method469(local1387);
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1393) RuntimeException local1393) {
			signlink.reporterror("70018, " + -28839 + ", " + arg0 + ", " + arg1 + ", " + local1393.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)V")
	private void method591(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
	private void method592(@OriginalArg(1) boolean arg0) {
		try {
			if (aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt583 >> 7 == this.anInt1026 && aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt584 >> 7 == this.anInt1027) {
				this.anInt1026 = 0;
			}
			@Pc(21) int local21 = this.anInt987;
			if (arg0) {
				local21 = 1;
			}
			for (@Pc(27) int local27 = 0; local27 < local21; local27++) {
				@Pc(33) Class6_Sub1_Sub2_Sub4_Sub2 local33;
				@Pc(38) int local38;
				if (arg0) {
					local33 = aClass6_Sub1_Sub2_Sub4_Sub2_1;
					local38 = this.anInt986 << 14;
				} else {
					local33 = this.aClass6_Sub1_Sub2_Sub4_Sub2Array1[this.anIntArray251[local27]];
					local38 = this.anIntArray251[local27] << 14;
				}
				if (local33 != null && local33.method381()) {
					local33.aBoolean147 = false;
					if ((aBoolean225 && this.anInt987 > 50 || this.anInt987 > 200) && !arg0 && local33.anInt587 == local33.anInt599) {
						local33.aBoolean147 = true;
					}
					@Pc(89) int local89 = local33.anInt583 >> 7;
					@Pc(94) int local94 = local33.anInt584 >> 7;
					if (local89 >= 0 && local89 < 104 && local94 >= 0 && local94 < 104) {
						if (local33.aClass6_Sub1_Sub2_Sub2_2 == null || anInt1041 < local33.anInt621 || anInt1041 >= local33.anInt622) {
							if ((local33.anInt583 & 0x7F) == 64 && (local33.anInt584 & 0x7F) == 64) {
								if (this.anIntArrayArray23[local89][local94] == this.anInt930) {
									continue;
								}
								this.anIntArrayArray23[local89][local94] = this.anInt930;
							}
							local33.anInt632 = this.method635(this.anInt854, local33.anInt584, local33.anInt583);
							this.aClass38_1.method408(local38, local33, local33.aBoolean143, this.anInt854, local33.anInt632, 60, local33.anInt583, local33.anInt585, local33.anInt584);
						} else {
							local33.aBoolean147 = false;
							local33.anInt632 = this.method635(this.anInt854, local33.anInt584, local33.anInt583);
							this.aClass38_1.method409(local33.anInt619, local33.anInt585, local33.anInt584, local33.anInt583, local33.anInt632, local33.anInt616, this.anInt854, local33.anInt617, local38, local33.anInt618, (byte) 9, local33);
						}
					}
				}
			}
		} catch (@Pc(228) RuntimeException local228) {
			signlink.reporterror("79573, " + 58 + ", " + arg0 + ", " + local228.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method593(@OriginalArg(0) int arg0) {
		try {
			@Pc(7) int local7;
			if (arg0 != this.anInt840) {
				for (local7 = 1; local7 > 0; local7++) {
				}
			}
			while (true) {
				do {
					while (true) {
						local7 = this.method578();
						if (local7 == -1) {
							return;
						}
						if (this.anInt1051 != -1 && this.anInt1051 == this.anInt1046) {
							if (local7 == 8 && this.aString30.length() > 0) {
								this.aString30 = this.aString30.substring(0, this.aString30.length() - 1);
							}
							break;
						}
						@Pc(196) int local196;
						if (this.aBoolean216) {
							if (local7 >= 32 && local7 <= 122 && this.aString18.length() < 80) {
								this.aString18 = this.aString18 + (char) local7;
								this.aBoolean252 = true;
							}
							if (local7 == 8 && this.aString18.length() > 0) {
								this.aString18 = this.aString18.substring(0, this.aString18.length() - 1);
								this.aBoolean252 = true;
							}
							if (local7 == 13 || local7 == 10) {
								this.aBoolean216 = false;
								this.aBoolean252 = true;
								@Pc(156) long local156;
								if (this.anInt975 == 1) {
									local156 = Class41.method481(this.aString18);
									this.method594(local156);
								}
								if (this.anInt975 == 2 && this.anInt827 > 0) {
									local156 = Class41.method481(this.aString18);
									this.method699(local156);
								}
								if (this.anInt975 == 3 && this.aString18.length() > 0) {
									this.aClass6_Sub1_Sub4_6.method228(252);
									this.aClass6_Sub1_Sub4_6.method229(0);
									local196 = this.aClass6_Sub1_Sub4_6.anInt390;
									this.aClass6_Sub1_Sub4_6.method235(this.aLong31);
									Class13.method113(this.aString18, this.aClass6_Sub1_Sub4_6, (byte) 1);
									this.aClass6_Sub1_Sub4_6.method238(this.aClass6_Sub1_Sub4_6.anInt390 - local196);
									this.aString18 = Class13.method114(this.aString18);
									this.aString18 = Class34.method313(this.aString18);
									this.method670(this.aString18, Class41.method485(Class41.method482(this.aLong31, (byte) 7)), 6);
									if (this.anInt933 == 2) {
										this.anInt933 = 1;
										this.aBoolean231 = true;
										this.aClass6_Sub1_Sub4_6.method228(186);
										this.aClass6_Sub1_Sub4_6.method229(this.anInt964);
										this.aClass6_Sub1_Sub4_6.method229(this.anInt933);
										this.aClass6_Sub1_Sub4_6.method229(this.anInt858);
									}
								}
								if (this.anInt975 == 4 && this.anInt843 < 100) {
									local156 = Class41.method481(this.aString18);
									this.method637(local156);
								}
								if (this.anInt975 == 5 && this.anInt843 > 0) {
									local156 = Class41.method481(this.aString18);
									this.method630(100, local156);
								}
							}
						} else if (this.anInt1018 == 1) {
							if (local7 >= 48 && local7 <= 57 && this.aString17.length() < 10) {
								this.aString17 = this.aString17 + (char) local7;
								this.aBoolean252 = true;
							}
							if (local7 == 8 && this.aString17.length() > 0) {
								this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
								this.aBoolean252 = true;
							}
							if (local7 == 13 || local7 == 10) {
								if (this.aString17.length() > 0) {
									local196 = 0;
									try {
										local196 = Integer.parseInt(this.aString17);
									} catch (@Pc(373) Exception local373) {
									}
									this.aClass6_Sub1_Sub4_6.method228(104);
									this.aClass6_Sub1_Sub4_6.method233(local196);
								}
								this.anInt1018 = 0;
								this.aBoolean252 = true;
							}
						} else if (this.anInt1018 == 2) {
							if (local7 >= 32 && local7 <= 122 && this.aString17.length() < 12) {
								this.aString17 = this.aString17 + (char) local7;
								this.aBoolean252 = true;
							}
							if (local7 == 8 && this.aString17.length() > 0) {
								this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
								this.aBoolean252 = true;
							}
							if (local7 == 13 || local7 == 10) {
								if (this.aString17.length() > 0) {
									this.aClass6_Sub1_Sub4_6.method228(32);
									this.aClass6_Sub1_Sub4_6.method235(Class41.method481(this.aString17));
								}
								this.anInt1018 = 0;
								this.aBoolean252 = true;
							}
						} else if (this.anInt1018 == 3) {
							if (local7 >= 32 && local7 <= 122 && this.aString17.length() < 40) {
								this.aString17 = this.aString17 + (char) local7;
								this.aBoolean252 = true;
							}
							if (local7 == 8 && this.aString17.length() > 0) {
								this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
								this.aBoolean252 = true;
							}
						} else if (this.anInt979 == -1 && this.anInt879 == -1) {
							if (local7 >= 32 && local7 <= 122 && this.aString25.length() < 80) {
								this.aString25 = this.aString25 + (char) local7;
								this.aBoolean252 = true;
							}
							if (local7 == 8 && this.aString25.length() > 0) {
								this.aString25 = this.aString25.substring(0, this.aString25.length() - 1);
								this.aBoolean252 = true;
							}
							if ((local7 == 13 || local7 == 10) && this.aString25.length() > 0) {
								if (this.anInt980 == 2) {
									if (this.aString25.equals("::clientdrop")) {
										this.method629();
									}
									if (this.aString25.equals("::lag")) {
										this.method716();
									}
									if (this.aString25.equals("::prefetchmusic")) {
										for (local196 = 0; local196 < this.aClass30_Sub1_1.method296(2); local196++) {
											this.aClass30_Sub1_1.method289(2, (byte) 1, local196);
										}
									}
									if (this.aString25.equals("::fpson")) {
										aBoolean229 = true;
									}
									if (this.aString25.equals("::fpsoff")) {
										aBoolean229 = false;
									}
									if (this.aString25.equals("::noclip")) {
										for (local196 = 0; local196 < 4; local196++) {
											for (@Pc(658) int local658 = 1; local658 < 103; local658++) {
												for (@Pc(662) int local662 = 1; local662 < 103; local662++) {
													this.aClass12Array1[local196].anIntArrayArray3[local658][local662] = 0;
												}
											}
										}
									}
								}
								if (this.aString25.startsWith("::")) {
									this.aClass6_Sub1_Sub4_6.method228(75);
									this.aClass6_Sub1_Sub4_6.method229(this.aString25.length() - 1);
									this.aClass6_Sub1_Sub4_6.method236(this.aString25.substring(2));
								} else {
									@Pc(717) String local717 = this.aString25.toLowerCase();
									@Pc(719) byte local719 = 0;
									if (local717.startsWith("yellow:")) {
										local719 = 0;
										this.aString25 = this.aString25.substring(7);
									} else if (local717.startsWith("red:")) {
										local719 = 1;
										this.aString25 = this.aString25.substring(4);
									} else if (local717.startsWith("green:")) {
										local719 = 2;
										this.aString25 = this.aString25.substring(6);
									} else if (local717.startsWith("cyan:")) {
										local719 = 3;
										this.aString25 = this.aString25.substring(5);
									} else if (local717.startsWith("purple:")) {
										local719 = 4;
										this.aString25 = this.aString25.substring(7);
									} else if (local717.startsWith("white:")) {
										local719 = 5;
										this.aString25 = this.aString25.substring(6);
									} else if (local717.startsWith("flash1:")) {
										local719 = 6;
										this.aString25 = this.aString25.substring(7);
									} else if (local717.startsWith("flash2:")) {
										local719 = 7;
										this.aString25 = this.aString25.substring(7);
									} else if (local717.startsWith("flash3:")) {
										local719 = 8;
										this.aString25 = this.aString25.substring(7);
									} else if (local717.startsWith("glow1:")) {
										local719 = 9;
										this.aString25 = this.aString25.substring(6);
									} else if (local717.startsWith("glow2:")) {
										local719 = 10;
										this.aString25 = this.aString25.substring(6);
									} else if (local717.startsWith("glow3:")) {
										local719 = 11;
										this.aString25 = this.aString25.substring(6);
									}
									local717 = this.aString25.toLowerCase();
									@Pc(891) byte local891 = 0;
									if (local717.startsWith("wave:")) {
										local891 = 1;
										this.aString25 = this.aString25.substring(5);
									} else if (local717.startsWith("wave2:")) {
										local891 = 2;
										this.aString25 = this.aString25.substring(6);
									} else if (local717.startsWith("shake:")) {
										local891 = 3;
										this.aString25 = this.aString25.substring(6);
									} else if (local717.startsWith("scroll:")) {
										local891 = 4;
										this.aString25 = this.aString25.substring(7);
									} else if (local717.startsWith("slide:")) {
										local891 = 5;
										this.aString25 = this.aString25.substring(6);
									}
									this.aClass6_Sub1_Sub4_6.method228(199);
									this.aClass6_Sub1_Sub4_6.method229(0);
									@Pc(972) int local972 = this.aClass6_Sub1_Sub4_6.anInt390;
									this.aClass6_Sub1_Sub4_6.method256(local719, this.anInt982);
									this.aClass6_Sub1_Sub4_8.anInt390 = 0;
									Class13.method113(this.aString25, this.aClass6_Sub1_Sub4_8, (byte) 1);
									this.aClass6_Sub1_Sub4_6.method237(this.aClass6_Sub1_Sub4_8.anInt390, this.aClass6_Sub1_Sub4_8.aByteArray12);
									this.aClass6_Sub1_Sub4_6.method229(local891);
									this.aClass6_Sub1_Sub4_6.method238(this.aClass6_Sub1_Sub4_6.anInt390 - local972);
									this.aString25 = Class13.method114(this.aString25);
									this.aString25 = Class34.method313(this.aString25);
									aClass6_Sub1_Sub2_Sub4_Sub2_1.aString15 = this.aString25;
									aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt598 = local719;
									aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt608 = local891;
									aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt601 = 150;
									if (this.anInt980 == 2) {
										this.method670(aClass6_Sub1_Sub2_Sub4_Sub2_1.aString15, "@cr2@" + aClass6_Sub1_Sub2_Sub4_Sub2_1.aString16, 2);
									} else if (this.anInt980 == 1) {
										this.method670(aClass6_Sub1_Sub2_Sub4_Sub2_1.aString15, "@cr1@" + aClass6_Sub1_Sub2_Sub4_Sub2_1.aString16, 2);
									} else {
										this.method670(aClass6_Sub1_Sub2_Sub4_Sub2_1.aString15, aClass6_Sub1_Sub2_Sub4_Sub2_1.aString16, 2);
									}
									if (this.anInt964 == 2) {
										this.anInt964 = 3;
										this.aBoolean231 = true;
										this.aClass6_Sub1_Sub4_6.method228(186);
										this.aClass6_Sub1_Sub4_6.method229(this.anInt964);
										this.aClass6_Sub1_Sub4_6.method229(this.anInt933);
										this.aClass6_Sub1_Sub4_6.method229(this.anInt858);
									}
								}
								this.aString25 = "";
								this.aBoolean252 = true;
							}
						}
					}
				} while ((local7 < 97 || local7 > 122) && (local7 < 65 || local7 > 90) && (local7 < 48 || local7 > 57) && local7 != 32);
				if (this.aString30.length() < 12) {
					this.aString30 = this.aString30 + (char) local7;
				}
			}
		} catch (@Pc(1125) RuntimeException local1125) {
			signlink.reporterror("89182, " + arg0 + ", " + local1125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
	private void method594(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt827 >= 100 && this.anInt926 != 1) {
					this.method670("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
				} else if (this.anInt827 >= 200) {
					this.method670("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
				} else {
					@Pc(38) String local38 = Class41.method485(Class41.method482(arg0, (byte) 7));
					for (@Pc(40) int local40 = 0; local40 < this.anInt827; local40++) {
						if (this.aLongArray4[local40] == arg0) {
							this.method670(local38 + " is already on your friend list", "", 0);
							return;
						}
					}
					for (@Pc(70) int local70 = 0; local70 < this.anInt843; local70++) {
						if (this.aLongArray3[local70] == arg0) {
							this.method670("Please remove " + local38 + " from your ignore list first", "", 0);
							return;
						}
					}
					if (!local38.equals(aClass6_Sub1_Sub2_Sub4_Sub2_1.aString16)) {
						this.aStringArray11[this.anInt827] = local38;
						this.aLongArray4[this.anInt827] = arg0;
						this.anIntArray237[this.anInt827] = 0;
						this.anInt827++;
						this.aBoolean238 = true;
						this.aClass6_Sub1_Sub4_6.method228(40);
						this.aClass6_Sub1_Sub4_6.method235(arg0);
					}
				}
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("20273, " + false + ", " + arg0 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	private String method595(@OriginalArg(0) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("85427, " + arg0 + ", " + false + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!WQACZBNG;II)V")
	private void method596(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub1_Sub3_Sub3 arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg1 != null) {
				@Pc(10) int local10 = this.anInt1053 + this.anInt874 & 0x7FF;
				@Pc(18) int local18 = arg0 * arg0 + arg2 * arg2;
				if (local18 <= 6400) {
					@Pc(33) int local33 = Class6_Sub1_Sub2_Sub2.anIntArray69[local10];
					@Pc(37) int local37 = Class6_Sub1_Sub2_Sub2.anIntArray70[local10];
					@Pc(46) int local46 = local33 * 256 / (this.anInt973 + 256);
					@Pc(55) int local55 = local37 * 256 / (this.anInt973 + 256);
					@Pc(65) int local65 = arg2 * local46 + arg0 * local55 >> 16;
					@Pc(75) int local75 = arg2 * local55 - arg0 * local46 >> 16;
					if (local18 > 2500) {
						arg1.method512(83 - local75 - arg1.anInt731 / 2 - 4, 94 + local65 - arg1.anInt730 / 2 + 4, this.aClass6_Sub1_Sub3_Sub2_14);
					} else {
						arg1.method506(83 - local75 - arg1.anInt731 / 2 - 4, 94 + local65 - arg1.anInt730 / 2 + 4, this.anInt1040);
					}
				}
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("74970, " + arg0 + ", " + arg1 + ", " + -129 + ", " + arg2 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method597() {
		try {
			this.anInt1049 = 0;
			@Pc(14) int local14 = (aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt583 >> 7) + this.anInt959;
			@Pc(22) int local22 = (aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt584 >> 7) + this.anInt960;
			if (local14 >= 3053 && local14 <= 3156 && local22 >= 3056 && local22 <= 3136) {
				this.anInt1049 = 1;
			}
			if (local14 >= 3072 && local14 <= 3118 && local22 >= 9492 && local22 <= 9535) {
				this.anInt1049 = 1;
			}
			if (this.anInt1049 == 1 && local14 >= 3139 && local14 <= 3199 && local22 >= 3008 && local22 <= 3062) {
				this.anInt1049 = 0;
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("88599, " + 3 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIZIII)Z")
	private boolean method598(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray24[local7][local11] = 0;
					this.anIntArrayArray22[local7][local11] = 99999999;
				}
			}
			local11 = arg8;
			@Pc(39) int local39 = arg3;
			this.anIntArrayArray24[arg8][arg3] = 99;
			this.anIntArrayArray22[arg8][arg3] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray248[0] = arg8;
			@Pc(66) int local66 = local55 + 1;
			this.anIntArray249[0] = arg3;
			@Pc(70) boolean local70 = false;
			@Pc(79) int local79 = this.anIntArray248.length;
			@Pc(86) int[][] local86 = this.aClass12Array1[this.anInt854].anIntArrayArray3;
			@Pc(198) int local198;
			while (local57 != local66) {
				local11 = this.anIntArray248[local57];
				local39 = this.anIntArray249[local57];
				local57 = (local57 + 1) % local79;
				if (local11 == arg0 && local39 == arg1) {
					local70 = true;
					break;
				}
				if (arg9 != 0) {
					if ((arg9 < 5 || arg9 == 10) && this.aClass12Array1[this.anInt854].method75((byte) 8, arg1, local11, local39, arg0, arg9 - 1, arg10)) {
						local70 = true;
						break;
					}
					if (arg9 < 10 && this.aClass12Array1[this.anInt854].method76(arg9 - 1, arg0, arg1, local11, local39, arg10)) {
						local70 = true;
						break;
					}
				}
				if (arg4 != 0 && arg6 != 0 && this.aClass12Array1[this.anInt854].method77(arg1, arg4, this.anInt866, local11, arg2, arg6, arg0, local39)) {
					local70 = true;
					break;
				}
				local198 = this.anIntArrayArray22[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray24[local11 - 1][local39] == 0 && (local86[local11 - 1][local39] & 0x1280108) == 0) {
					this.anIntArray248[local66] = local11 - 1;
					this.anIntArray249[local66] = local39;
					local66 = (local66 + 1) % local79;
					this.anIntArrayArray24[local11 - 1][local39] = 2;
					this.anIntArrayArray22[local11 - 1][local39] = local198;
				}
				if (local11 < 103 && this.anIntArrayArray24[local11 + 1][local39] == 0 && (local86[local11 + 1][local39] & 0x1280180) == 0) {
					this.anIntArray248[local66] = local11 + 1;
					this.anIntArray249[local66] = local39;
					local66 = (local66 + 1) % local79;
					this.anIntArrayArray24[local11 + 1][local39] = 8;
					this.anIntArrayArray22[local11 + 1][local39] = local198;
				}
				if (local39 > 0 && this.anIntArrayArray24[local11][local39 - 1] == 0 && (local86[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray248[local66] = local11;
					this.anIntArray249[local66] = local39 - 1;
					local66 = (local66 + 1) % local79;
					this.anIntArrayArray24[local11][local39 - 1] = 1;
					this.anIntArrayArray22[local11][local39 - 1] = local198;
				}
				if (local39 < 103 && this.anIntArrayArray24[local11][local39 + 1] == 0 && (local86[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray248[local66] = local11;
					this.anIntArray249[local66] = local39 + 1;
					local66 = (local66 + 1) % local79;
					this.anIntArrayArray24[local11][local39 + 1] = 4;
					this.anIntArrayArray22[local11][local39 + 1] = local198;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray24[local11 - 1][local39 - 1] == 0 && (local86[local11 - 1][local39 - 1] & 0x128010E) == 0 && (local86[local11 - 1][local39] & 0x1280108) == 0 && (local86[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray248[local66] = local11 - 1;
					this.anIntArray249[local66] = local39 - 1;
					local66 = (local66 + 1) % local79;
					this.anIntArrayArray24[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray22[local11 - 1][local39 - 1] = local198;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray24[local11 + 1][local39 - 1] == 0 && (local86[local11 + 1][local39 - 1] & 0x1280183) == 0 && (local86[local11 + 1][local39] & 0x1280180) == 0 && (local86[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray248[local66] = local11 + 1;
					this.anIntArray249[local66] = local39 - 1;
					local66 = (local66 + 1) % local79;
					this.anIntArrayArray24[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray22[local11 + 1][local39 - 1] = local198;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray24[local11 - 1][local39 + 1] == 0 && (local86[local11 - 1][local39 + 1] & 0x1280138) == 0 && (local86[local11 - 1][local39] & 0x1280108) == 0 && (local86[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray248[local66] = local11 - 1;
					this.anIntArray249[local66] = local39 + 1;
					local66 = (local66 + 1) % local79;
					this.anIntArrayArray24[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray22[local11 - 1][local39 + 1] = local198;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray24[local11 + 1][local39 + 1] == 0 && (local86[local11 + 1][local39 + 1] & 0x12801E0) == 0 && (local86[local11 + 1][local39] & 0x1280180) == 0 && (local86[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray248[local66] = local11 + 1;
					this.anIntArray249[local66] = local39 + 1;
					local66 = (local66 + 1) % local79;
					this.anIntArrayArray24[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray22[local11 + 1][local39 + 1] = local198;
				}
			}
			this.anInt1034 = 0;
			@Pc(814) int local814;
			@Pc(820) int local820;
			@Pc(826) int local826;
			if (!local70) {
				if (!arg7) {
					return false;
				}
				local198 = 1000;
				local814 = 100;
				for (local820 = arg0 - 10; local820 <= arg0 + 10; local820++) {
					for (local826 = arg1 - 10; local826 <= arg1 + 10; local826++) {
						if (local820 >= 0 && local826 >= 0 && local820 < 104 && local826 < 104 && this.anIntArrayArray22[local820][local826] < 100) {
							@Pc(848) int local848 = 0;
							if (local820 < arg0) {
								local848 = arg0 - local820;
							} else if (local820 > arg0 + arg4 - 1) {
								local848 = local820 - (arg0 + arg4 - 1);
							}
							@Pc(874) int local874 = 0;
							if (local826 < arg1) {
								local874 = arg1 - local826;
							} else if (local826 > arg1 + arg6 - 1) {
								local874 = local826 - (arg1 + arg6 - 1);
							}
							@Pc(906) int local906 = local848 * local848 + local874 * local874;
							if (local906 < local198 || local906 == local198 && this.anIntArrayArray22[local820][local826] < local814) {
								local198 = local906;
								local814 = this.anIntArrayArray22[local820][local826];
								local11 = local820;
								local39 = local826;
							}
						}
					}
				}
				if (local198 == 1000) {
					return false;
				}
				if (local11 == arg8 && local39 == arg3) {
					return false;
				}
				this.anInt1034 = 1;
			}
			@Pc(967) byte local967 = 0;
			this.anIntArray248[0] = local11;
			local57 = local967 + 1;
			this.anIntArray249[0] = local39;
			local198 = local814 = this.anIntArrayArray24[local11][local39];
			while (local11 != arg8 || local39 != arg3) {
				if (local198 != local814) {
					local814 = local198;
					this.anIntArray248[local57] = local11;
					this.anIntArray249[local57++] = local39;
				}
				if ((local198 & 0x2) != 0) {
					local11++;
				} else if ((local198 & 0x8) != 0) {
					local11--;
				}
				if ((local198 & 0x1) != 0) {
					local39++;
				} else if ((local198 & 0x4) != 0) {
					local39--;
				}
				local198 = this.anIntArrayArray24[local11][local39];
			}
			if (local57 > 0) {
				local79 = local57;
				if (local57 > 25) {
					local79 = 25;
				}
				local57--;
				@Pc(1057) int local1057 = this.anIntArray248[local57];
				local820 = this.anIntArray249[local57];
				if (arg5 == 0) {
					this.aClass6_Sub1_Sub4_6.method228(120);
					this.aClass6_Sub1_Sub4_6.method229(local79 + local79 + 3);
				}
				if (arg5 == 1) {
					this.aClass6_Sub1_Sub4_6.method228(56);
					this.aClass6_Sub1_Sub4_6.method229(local79 + local79 + 3 + 14);
				}
				if (arg5 == 2) {
					this.aClass6_Sub1_Sub4_6.method228(70);
					this.aClass6_Sub1_Sub4_6.method229(local79 + local79 + 3);
				}
				this.aClass6_Sub1_Sub4_6.method266(local820 + this.anInt960);
				this.anInt1026 = this.anIntArray248[0];
				this.anInt1027 = this.anIntArray249[0];
				for (local826 = 1; local826 < local79; local826++) {
					local57--;
					this.aClass6_Sub1_Sub4_6.method255(this.anIntArray248[local57] - local1057, this.aByte65);
					this.aClass6_Sub1_Sub4_6.method255(this.anIntArray249[local57] - local820, this.aByte65);
				}
				this.aClass6_Sub1_Sub4_6.method264(local1057 + this.anInt959);
				this.aClass6_Sub1_Sub4_6.method257(super.anIntArray210[5] == 1 ? 1 : 0);
				return true;
			} else if (arg5 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1193) RuntimeException local1193) {
			signlink.reporterror("7856, " + arg0 + ", " + 6 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1193.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			this.aClass6_Sub1_Sub3_Sub2_6.method467(arg3, arg4, this.anInt1040);
			this.aClass6_Sub1_Sub3_Sub2_7.method467(arg3 + arg2 - 16, arg4, this.anInt1040);
			Class6_Sub1_Sub3.method549(arg4, 16, arg3 + 16, this.anInt994, arg2 - 32);
			@Pc(37) int local37 = (arg2 - 32) * arg2 / arg1;
			if (local37 < 8) {
				local37 = 8;
			}
			@Pc(54) int local54 = (arg2 - 32 - local37) * arg0 / (arg1 - arg2);
			Class6_Sub1_Sub3.method549(arg4, 16, arg3 + 16 + local54, this.anInt825, local37);
			Class6_Sub1_Sub3.method554(this.anInt969, local37, arg3 + 16 + local54, arg4);
			Class6_Sub1_Sub3.method554(this.anInt969, local37, arg3 + 16 + local54, arg4 + 1);
			Class6_Sub1_Sub3.method552(arg4, arg3 + 16 + local54, 16, this.anInt969);
			Class6_Sub1_Sub3.method552(arg4, arg3 + 17 + local54, 16, this.anInt969);
			Class6_Sub1_Sub3.method554(this.anInt1015, local37, arg3 + 16 + local54, arg4 + 15);
			Class6_Sub1_Sub3.method554(this.anInt1015, local37 - 1, arg3 + 17 + local54, arg4 + 14);
			Class6_Sub1_Sub3.method552(arg4, arg3 + 15 + local54 + local37, 16, this.anInt1015);
			Class6_Sub1_Sub3.method552(arg4 + 1, arg3 + 14 + local54 + local37, 15, this.anInt1015);
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("42526, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 6 + ", " + local177.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method600(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) int local6;
			if (arg0 != 8) {
				for (local6 = 1; local6 > 0; local6++) {
				}
			}
			for (local6 = -1; local6 < this.anInt987; local6++) {
				@Pc(21) int local21;
				if (local6 == -1) {
					local21 = this.anInt986;
				} else {
					local21 = this.anIntArray251[local6];
				}
				@Pc(33) Class6_Sub1_Sub2_Sub4_Sub2 local33 = this.aClass6_Sub1_Sub2_Sub4_Sub2Array1[local21];
				if (local33 != null) {
					this.method639(1, local33);
				}
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("84245, " + arg0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!VEIVHFHZ;I)V")
	private void method601(@OriginalArg(0) Class6_Sub1_Sub3_Sub2 arg0) {
		try {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray240.length; local10++) {
				this.anIntArray240[local10] = 0;
			}
			@Pc(35) int local35;
			for (@Pc(25) int local25 = 0; local25 < 5000; local25++) {
				local35 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray240[local35] = (int) (Math.random() * 256.0D);
			}
			@Pc(53) int local53;
			@Pc(57) int local57;
			@Pc(65) int local65;
			for (local35 = 0; local35 < 20; local35++) {
				for (local53 = 1; local53 < 255; local53++) {
					for (local57 = 1; local57 < 127; local57++) {
						local65 = local57 + (local53 << 7);
						this.anIntArray241[local65] = (this.anIntArray240[local65 - 1] + this.anIntArray240[local65 + 1] + this.anIntArray240[local65 - 128] + this.anIntArray240[local65 + 128]) / 4;
					}
				}
				@Pc(111) int[] local111 = this.anIntArray240;
				this.anIntArray240 = this.anIntArray241;
				this.anIntArray241 = local111;
			}
			if (arg0 != null) {
				local53 = 0;
				for (local57 = 0; local57 < arg0.anInt695; local57++) {
					for (local65 = 0; local65 < arg0.anInt694; local65++) {
						if (arg0.aByteArray18[local53++] != 0) {
							@Pc(147) int local147 = local65 + 16 + arg0.anInt696;
							@Pc(154) int local154 = local57 + 16 + arg0.anInt697;
							@Pc(160) int local160 = local147 + (local154 << 7);
							this.anIntArray240[local160] = 0;
						}
					}
				}
			}
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("46035, " + arg0 + ", " + 5980 + ", " + local177.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[BI)V")
	private void method602(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		try {
			if (this.aBoolean239) {
				signlink.anInt1065 = arg0 ? 1 : 0;
				signlink.midisave(arg1, arg1.length);
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("96541, " + arg0 + ", " + arg1 + ", " + -542 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method603(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString27 = "";
				this.aString28 = "Connecting to server...";
				this.method671(true);
			}
			this.aClass37_1 = new Class37(this.aBoolean236, this.method654(43594 + anInt877), this);
			@Pc(31) long local31 = Class41.method481(arg0);
			@Pc(38) int local38 = (int) (local31 >> 16 & 0x1FL);
			this.aClass6_Sub1_Sub4_6.anInt390 = 0;
			this.aClass6_Sub1_Sub4_6.method229(14);
			this.aClass6_Sub1_Sub4_6.method229(local38);
			this.aClass37_1.method394(this.aClass6_Sub1_Sub4_6.aByteArray12, 2);
			for (@Pc(61) int local61 = 0; local61 < 8; local61++) {
				this.aClass37_1.method391();
			}
			@Pc(75) int local75 = this.aClass37_1.method391();
			@Pc(77) int local77 = local75;
			@Pc(226) int local226;
			@Pc(260) int local260;
			if (local75 == 0) {
				this.aClass37_1.method393(this.aClass6_Sub1_Sub4_7.aByteArray12, 0, 8);
				this.aClass6_Sub1_Sub4_7.anInt390 = 0;
				this.aLong30 = this.aClass6_Sub1_Sub4_7.method245();
				@Pc(100) int[] local100 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong30 >> 32), (int) this.aLong30 };
				this.aClass6_Sub1_Sub4_6.anInt390 = 0;
				this.aClass6_Sub1_Sub4_6.method229(10);
				this.aClass6_Sub1_Sub4_6.method233(local100[0]);
				this.aClass6_Sub1_Sub4_6.method233(local100[1]);
				this.aClass6_Sub1_Sub4_6.method233(local100[2]);
				this.aClass6_Sub1_Sub4_6.method233(local100[3]);
				this.aClass6_Sub1_Sub4_6.method233(signlink.anInt1059);
				this.aClass6_Sub1_Sub4_6.method236(arg0);
				this.aClass6_Sub1_Sub4_6.method236(arg1);
				this.aClass6_Sub1_Sub4_6.method254(aBigInteger1, aBigInteger2);
				this.aClass6_Sub1_Sub4_9.anInt390 = 0;
				if (arg2) {
					this.aClass6_Sub1_Sub4_9.method229(18);
				} else {
					this.aClass6_Sub1_Sub4_9.method229(16);
				}
				this.aClass6_Sub1_Sub4_9.method229(this.aClass6_Sub1_Sub4_6.anInt390 + 36 + 1 + 1 + 2);
				this.aClass6_Sub1_Sub4_9.method229(255);
				this.aClass6_Sub1_Sub4_9.method230(374);
				this.aClass6_Sub1_Sub4_9.method229(aBoolean225 ? 1 : 0);
				for (local226 = 0; local226 < 9; local226++) {
					this.aClass6_Sub1_Sub4_9.method233(this.anIntArray236[local226]);
				}
				this.aClass6_Sub1_Sub4_9.method237(this.aClass6_Sub1_Sub4_6.anInt390, this.aClass6_Sub1_Sub4_6.aByteArray12);
				this.aClass6_Sub1_Sub4_6.aClass42_1 = new Class42(0, local100);
				for (local260 = 0; local260 < 4; local260++) {
					local100[local260] += 50;
				}
				this.aClass42_2 = new Class42(0, local100);
				this.aClass37_1.method394(this.aClass6_Sub1_Sub4_9.aByteArray12, this.aClass6_Sub1_Sub4_9.anInt390);
				local75 = this.aClass37_1.method391();
			}
			if (local75 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(302) Exception local302) {
				}
				this.method603(arg0, arg1, arg2);
			} else {
				@Pc(390) int local390;
				if (local75 == 2) {
					this.anInt980 = this.aClass37_1.method391();
					aBoolean211 = this.aClass37_1.method391() == 1;
					this.aLong29 = 0L;
					this.anInt851 = 0;
					this.aClass39_1.anInt678 = 0;
					super.aBoolean210 = true;
					this.aBoolean253 = true;
					this.aBoolean243 = true;
					this.aClass6_Sub1_Sub4_6.anInt390 = 0;
					this.aClass6_Sub1_Sub4_7.anInt390 = 0;
					this.anInt1005 = -1;
					this.anInt949 = -1;
					this.anInt950 = -1;
					this.anInt951 = -1;
					this.anInt1004 = 0;
					this.anInt1006 = 0;
					this.anInt1019 = 0;
					this.anInt1008 = 0;
					this.anInt1002 = 0;
					this.anInt890 = 0;
					this.aBoolean217 = false;
					super.anInt812 = 0;
					for (local390 = 0; local390 < 100; local390++) {
						this.aStringArray13[local390] = null;
					}
					this.anInt1042 = 0;
					this.anInt990 = 0;
					this.anInt928 = 0;
					this.anInt873 = 0;
					this.anInt898 = (int) (Math.random() * 100.0D) - 50;
					this.anInt833 = (int) (Math.random() * 110.0D) - 55;
					this.anInt835 = (int) (Math.random() * 80.0D) - 40;
					this.anInt874 = (int) (Math.random() * 120.0D) - 60;
					this.anInt973 = (int) (Math.random() * 30.0D) - 20;
					this.anInt1053 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt965 = 0;
					this.anInt924 = -1;
					this.anInt1026 = 0;
					this.anInt1027 = 0;
					this.anInt987 = 0;
					this.anInt885 = 0;
					for (local226 = 0; local226 < this.anInt985; local226++) {
						this.aClass6_Sub1_Sub2_Sub4_Sub2Array1[local226] = null;
						this.aClass6_Sub1_Sub4Array1[local226] = null;
					}
					for (local260 = 0; local260 < 16384; local260++) {
						this.aClass6_Sub1_Sub2_Sub4_Sub1Array1[local260] = null;
					}
					aClass6_Sub1_Sub2_Sub4_Sub2_1 = this.aClass6_Sub1_Sub2_Sub4_Sub2Array1[this.anInt986] = new Class6_Sub1_Sub2_Sub4_Sub2();
					this.aClass40_12.method476();
					this.aClass40_10.method476();
					@Pc(535) int local535;
					@Pc(539) int local539;
					for (@Pc(531) int local531 = 0; local531 < 4; local531++) {
						for (local535 = 0; local535 < 104; local535++) {
							for (local539 = 0; local539 < 104; local539++) {
								this.aClass40ArrayArrayArray1[local531][local535][local539] = null;
							}
						}
					}
					this.aClass40_11 = new Class40(826);
					this.anInt828 = 0;
					this.anInt827 = 0;
					this.method604(this.anInt976);
					this.anInt976 = -1;
					this.method604(this.anInt979);
					this.anInt979 = -1;
					this.method604(this.anInt1051);
					this.anInt1051 = -1;
					this.method604(this.anInt879);
					this.anInt879 = -1;
					this.method604(this.anInt855);
					this.anInt855 = -1;
					this.method604(this.anInt868);
					this.anInt868 = -1;
					this.method604(this.anInt830);
					this.anInt830 = -1;
					this.aBoolean245 = false;
					this.anInt1016 = 3;
					this.anInt1018 = 0;
					this.aBoolean217 = false;
					this.aBoolean216 = false;
					this.aString23 = null;
					this.anInt1047 = 0;
					this.anInt1038 = -1;
					this.aBoolean220 = true;
					this.method627();
					for (local535 = 0; local535 < 5; local535++) {
						this.anIntArray212[local535] = 0;
					}
					for (local539 = 0; local539 < 5; local539++) {
						this.aStringArray10[local539] = null;
						this.aBooleanArray11[local539] = false;
					}
					anInt938 = 0;
					anInt1020 = 0;
					anInt831 = 0;
					anInt908 = 0;
					anInt993 = 0;
					anInt906 = 0;
					anInt903 = 0;
					anInt882 = 0;
					this.method660();
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
					this.aBoolean243 = true;
					this.aClass6_Sub1_Sub4_6.anInt390 = 0;
					this.aClass6_Sub1_Sub4_7.anInt390 = 0;
					this.anInt1005 = -1;
					this.anInt949 = -1;
					this.anInt950 = -1;
					this.anInt951 = -1;
					this.anInt1004 = 0;
					this.anInt1006 = 0;
					this.anInt1019 = 0;
					this.anInt890 = 0;
					this.aBoolean217 = false;
					this.aLong33 = System.currentTimeMillis();
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
					local390 = this.aClass37_1.method391();
					for (@Pc(908) int local908 = local390 + 3; local908 >= 0; local908--) {
						this.aString27 = "You have only just left another world";
						this.aString28 = "Your profile will be transferred in: " + local908;
						this.method671(true);
						try {
							Thread.sleep(1200L);
						} catch (@Pc(930) Exception local930) {
						}
					}
					this.method603(arg0, arg1, arg2);
				} else if (local75 == 22) {
					this.aString27 = "Malformed login packet.";
					this.aString28 = "Please try again.";
				} else if (local75 == 23) {
					this.aString27 = "No reply from loginserver.";
					this.aString28 = "Please try again.";
				} else if (local75 == 24) {
					this.aString27 = "Error loading your profile.";
					this.aString28 = "Please contact customer support.";
				} else if (local75 == 25) {
					this.aString27 = "Unexpected loginserver response.";
					this.aString28 = "Please try using a different world.";
				} else if (local75 == 26) {
					this.aString27 = "This computers address has been blocked";
					this.aString28 = "as it was used to break our rules";
				} else if (local75 != -1) {
					System.out.println("response:" + local75);
					this.aString27 = "Unexpected server response";
					this.aString28 = "Please try using a different world.";
				} else if (local77 != 0) {
					this.aString27 = "No response from server";
					this.aString28 = "Please try using a different world.";
				} else if (this.anInt846 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(1002) Exception local1002) {
					}
					this.anInt846++;
					this.method603(arg0, arg1, arg2);
				} else {
					this.aString27 = "No response from loginserver";
					this.aString28 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(1045) IOException local1045) {
			this.aString27 = "";
			this.aString28 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method604(@OriginalArg(1) int arg0) {
		try {
			Class1.method1(arg0);
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("4950, " + -31 + ", " + arg0 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	private void method605() {
		try {
			this.aBoolean248 = true;
			try {
				@Pc(4) long local4 = System.currentTimeMillis();
				@Pc(6) int local6 = 0;
				@Pc(8) int local8 = 20;
				while (this.aBoolean240) {
					this.anInt937++;
					this.method613();
					this.method613();
					this.method648((byte) 3);
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
			this.aBoolean248 = false;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("2260, " + true + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method606() {
		try {
			this.aBoolean243 &= true;
			this.aClass6_Sub1_Sub4_6.method228(237);
			if (this.anInt868 != -1) {
				this.method604(this.anInt868);
				this.anInt868 = -1;
				this.aBoolean238 = true;
				this.aBoolean245 = false;
				this.aBoolean219 = true;
			}
			if (this.anInt979 != -1) {
				this.method604(this.anInt979);
				this.anInt979 = -1;
				this.aBoolean252 = true;
				this.aBoolean245 = false;
			}
			if (this.anInt879 != -1) {
				this.method604(this.anInt879);
				this.anInt879 = -1;
				this.aBoolean244 = true;
			}
			if (this.anInt855 != -1) {
				this.method604(this.anInt855);
				this.anInt855 = -1;
			}
			if (this.anInt1051 != -1) {
				this.method604(this.anInt1051);
				this.anInt1051 = -1;
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("4357, " + true + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!PQBRPYKE;ZI)V")
	private void method607(@OriginalArg(0) Class6_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt1048 = 0;
			this.anInt988 = 0;
			this.method675(arg1, arg0);
			this.method713(arg1, arg0);
			this.method689(arg0, arg1);
			this.method693(arg1, arg0);
			@Pc(39) int local39;
			for (@Pc(32) int local32 = 0; local32 < this.anInt1048; local32++) {
				local39 = this.anIntArray274[local32];
				if (this.aClass6_Sub1_Sub2_Sub4_Sub2Array1[local39].anInt602 != anInt1041) {
					this.aClass6_Sub1_Sub2_Sub4_Sub2Array1[local39] = null;
				}
			}
			if (arg0.anInt390 != arg1) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.anInt390 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local39 = 0; local39 < this.anInt987; local39++) {
				if (this.aClass6_Sub1_Sub2_Sub4_Sub2Array1[this.anIntArray251[local39]] == null) {
					signlink.reporterror(this.aString20 + " null entry in pl list - pos:" + local39 + " size:" + this.anInt987);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("19564, " + arg0 + ", " + true + ", " + arg1 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method608(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 7558) {
				anInt905 = this.aClass42_2.method514();
			}
			if (super.anInt819 == 1) {
				if (super.anInt820 >= 6 && super.anInt820 <= 106 && super.anInt821 >= 467 && super.anInt821 <= 499) {
					this.anInt964 = (this.anInt964 + 1) % 4;
					this.aBoolean231 = true;
					this.aBoolean252 = true;
					this.aClass6_Sub1_Sub4_6.method228(186);
					this.aClass6_Sub1_Sub4_6.method229(this.anInt964);
					this.aClass6_Sub1_Sub4_6.method229(this.anInt933);
					this.aClass6_Sub1_Sub4_6.method229(this.anInt858);
				}
				if (super.anInt820 >= 135 && super.anInt820 <= 235 && super.anInt821 >= 467 && super.anInt821 <= 499) {
					this.anInt933 = (this.anInt933 + 1) % 3;
					this.aBoolean231 = true;
					this.aBoolean252 = true;
					this.aClass6_Sub1_Sub4_6.method228(186);
					this.aClass6_Sub1_Sub4_6.method229(this.anInt964);
					this.aClass6_Sub1_Sub4_6.method229(this.anInt933);
					this.aClass6_Sub1_Sub4_6.method229(this.anInt858);
				}
				if (super.anInt820 >= 273 && super.anInt820 <= 373 && super.anInt821 >= 467 && super.anInt821 <= 499) {
					this.anInt858 = (this.anInt858 + 1) % 3;
					this.aBoolean231 = true;
					this.aBoolean252 = true;
					this.aClass6_Sub1_Sub4_6.method228(186);
					this.aClass6_Sub1_Sub4_6.method229(this.anInt964);
					this.aClass6_Sub1_Sub4_6.method229(this.anInt933);
					this.aClass6_Sub1_Sub4_6.method229(this.anInt858);
				}
				if (super.anInt820 >= 412 && super.anInt820 <= 512 && super.anInt821 >= 467 && super.anInt821 <= 499) {
					if (this.anInt1051 == -1) {
						this.method606();
						this.aString30 = "";
						this.aBoolean234 = false;
						this.anInt1046 = this.anInt1051 = Class1.anInt20;
						return;
					}
					this.method670("Please close the interface you have open before using 'report abuse'", "", 0);
					return;
				}
			}
		} catch (@Pc(204) RuntimeException local204) {
			signlink.reporterror("7557, " + arg0 + ", " + local204.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!GWDACNJF;Z)V")
	private void method609(@OriginalArg(0) Class6_Sub2 arg0) {
		try {
			@Pc(4) int local4 = 0;
			@Pc(6) int local6 = -1;
			@Pc(8) int local8 = 0;
			@Pc(10) int local10 = 0;
			if (arg0.anInt207 == 0) {
				local4 = this.aClass38_1.method423(arg0.anInt206, arg0.anInt208, arg0.anInt209);
			}
			if (arg0.anInt207 == 1) {
				local4 = this.aClass38_1.method424(arg0.anInt206, arg0.anInt209, arg0.anInt208);
			}
			if (arg0.anInt207 == 2) {
				local4 = this.aClass38_1.method425(arg0.anInt206, arg0.anInt208, arg0.anInt209);
			}
			if (arg0.anInt207 == 3) {
				local4 = this.aClass38_1.method426(arg0.anInt206, arg0.anInt208, arg0.anInt209);
			}
			if (local4 != 0) {
				@Pc(79) int local79 = this.aClass38_1.method427(arg0.anInt206, arg0.anInt208, arg0.anInt209, local4);
				local6 = local4 >> 14 & 0x7FFF;
				local8 = local79 & 0x1F;
				local10 = local79 >> 6;
			}
			arg0.anInt203 = local6;
			arg0.anInt205 = local8;
			arg0.anInt204 = local10;
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("16813, " + arg0 + ", " + false + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method581(@OriginalArg(0) int arg0) {
		try {
			this.aClass8_15 = null;
			this.aClass8_16 = null;
			this.aClass8_12 = null;
			this.aClass8_13 = null;
			this.aClass8_14 = null;
			this.anIntArrayArray24 = null;
			this.anIntArrayArray22 = null;
			this.anIntArray248 = null;
			this.anIntArray249 = null;
			this.anIntArrayArrayArray7 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass38_1 = null;
			this.aClass12Array1 = null;
			this.anIntArray254 = null;
			this.aByteArrayArray6 = null;
			this.aByteArrayArray5 = null;
			this.anIntArray255 = null;
			this.anIntArray256 = null;
			this.anIntArray239 = null;
			this.aClass6_Sub1_Sub2_Sub4_Sub2Array1 = null;
			this.anIntArray251 = null;
			this.anIntArray252 = null;
			this.aClass6_Sub1_Sub4Array1 = null;
			this.anIntArray274 = null;
			this.aClass8_17 = null;
			this.aClass8_18 = null;
			this.aClass8_19 = null;
			this.aClass8_20 = null;
			this.aClass6_Sub1_Sub3_Sub2Array4 = null;
			this.aClass6_Sub1_Sub3_Sub2_13 = null;
			this.aClass6_Sub1_Sub3_Sub2_14 = null;
			this.aClass6_Sub1_Sub3_Sub2_15 = null;
			this.anIntArray224 = null;
			this.anIntArray225 = null;
			this.aClass6_Sub1_Sub3_Sub3Array9 = null;
			this.aByteArray21 = null;
			this.anIntArray216 = null;
			this.anIntArray217 = null;
			this.anIntArray218 = null;
			this.anIntArray219 = null;
			this.aStringArray9 = null;
			this.method649();
			this.aClass6_Sub1_Sub3_Sub3_17 = null;
			this.aClass40_12 = null;
			this.aClass40_10 = null;
			if (this.aClass39_1 != null) {
				this.aClass39_1.aBoolean158 = false;
			}
			this.aClass39_1 = null;
			this.aClass8_7 = null;
			this.aClass8_8 = null;
			this.aClass8_9 = null;
			this.aClass8_10 = null;
			this.aClass8_11 = null;
			if (this.aClass30_Sub1_1 != null) {
				this.aClass30_Sub1_1.method294();
			}
			this.aClass30_Sub1_1 = null;
			this.aClass8_3 = null;
			if (arg0 != 3) {
				this.aClass6_Sub1_Sub4_6.method229(134);
			}
			this.aClass8_4 = null;
			this.aClass8_5 = null;
			this.aClass8_6 = null;
			this.aClass6_Sub1_Sub3_Sub2_3 = null;
			this.aClass6_Sub1_Sub3_Sub2_4 = null;
			this.aClass6_Sub1_Sub3_Sub2_5 = null;
			this.aClass6_Sub1_Sub2_Sub4_Sub1Array1 = null;
			this.anIntArray227 = null;
			this.aClass6_Sub1_Sub3_Sub2_16 = null;
			this.aClass6_Sub1_Sub3_Sub2_17 = null;
			this.aClass6_Sub1_Sub3_Sub2_18 = null;
			this.aClass6_Sub1_Sub3_Sub2_19 = null;
			this.aClass6_Sub1_Sub3_Sub2_20 = null;
			this.aClass8_25 = null;
			this.aClass8_26 = null;
			this.aClass8_27 = null;
			this.aClass6_Sub1_Sub3_Sub2Array2 = null;
			this.aClass6_Sub1_Sub3_Sub3Array8 = null;
			this.aStringArray11 = null;
			this.aLongArray4 = null;
			this.anIntArray237 = null;
			this.aClass6_Sub1_Sub3_Sub2_8 = null;
			this.aClass6_Sub1_Sub3_Sub2_9 = null;
			this.aClass6_Sub1_Sub3_Sub2_10 = null;
			this.aClass6_Sub1_Sub3_Sub2_11 = null;
			this.aClass6_Sub1_Sub3_Sub2_12 = null;
			this.aClass6_Sub1_Sub4_8 = null;
			this.aClass40ArrayArrayArray1 = null;
			this.aClass40_11 = null;
			this.anIntArrayArray23 = null;
			this.aClass8_21 = null;
			this.aClass8_22 = null;
			this.aClass8_23 = null;
			this.aClass8_24 = null;
			this.aClass6_Sub1_Sub4_6 = null;
			this.aClass6_Sub1_Sub4_9 = null;
			this.aClass6_Sub1_Sub4_7 = null;
			this.aClass6_Sub1_Sub3_Sub3_13 = null;
			try {
				if (this.aClass37_1 != null) {
					this.aClass37_1.method390();
				}
			} catch (@Pc(300) Exception local300) {
			}
			this.aClass37_1 = null;
			this.aClass6_Sub1_Sub3_Sub3_14 = null;
			this.aClass6_Sub1_Sub3_Sub3Array6 = null;
			this.aClass6_Sub1_Sub3_Sub3Array5 = null;
			this.aClass6_Sub1_Sub3_Sub3Array10 = null;
			this.aClass6_Sub1_Sub3_Sub3Array7 = null;
			this.aClass6_Sub1_Sub3_Sub3Array4 = null;
			this.aClass6_Sub1_Sub3_Sub3_8 = null;
			this.aClass6_Sub1_Sub3_Sub3_9 = null;
			this.aClass6_Sub1_Sub3_Sub3_10 = null;
			this.aClass6_Sub1_Sub3_Sub3_11 = null;
			this.aClass6_Sub1_Sub3_Sub3_12 = null;
			this.method710();
			Class11.method55();
			Class20.method148();
			Class35.method365();
			Class1.method3();
			Class24.aClass24Array1 = null;
			Class48.aClass48Array1 = null;
			Class49.aClass49Array1 = null;
			Class2.aClass2Array1 = null;
			Class28.aClass28Array1 = null;
			Class28.aClass46_6 = null;
			Class5.aClass5Array1 = null;
			super.aClass8_2 = null;
			Class6_Sub1_Sub2_Sub4_Sub2.aClass46_9 = null;
			Class6_Sub1_Sub3_Sub1.method203();
			Class38.method396();
			Class6_Sub1_Sub2_Sub2.method82();
			Class27.method183();
			System.gc();
		} catch (@Pc(377) RuntimeException local377) {
			signlink.reporterror("60075, " + arg0 + ", " + local377.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method610() {
		try {
			if (this.anInt1002 == 2) {
				this.method623((this.anInt861 - this.anInt959 << 7) + this.anInt864, this.anInt863 * 2, (this.anInt862 - this.anInt960 << 7) + this.anInt865);
				if (this.anInt1000 > -1 && anInt1041 % 20 < 10) {
					this.aClass6_Sub1_Sub3_Sub3Array7[0].method506(this.anInt1001 - 28, this.anInt1000 - 12, this.anInt1040);
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("73874, " + 22 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method611() {
		try {
			if (this.aClass8_12 == null) {
				super.aClass8_2 = null;
				this.aClass8_24 = null;
				this.aClass8_22 = null;
				this.aClass8_21 = null;
				this.aClass8_23 = null;
				this.aClass8_25 = null;
				this.aClass8_26 = null;
				this.aClass8_27 = null;
				this.aClass8_15 = new Class8(265, 128, this.method584(), 384);
				Class6_Sub1_Sub3.method547();
				this.aClass8_16 = new Class8(265, 128, this.method584(), 384);
				Class6_Sub1_Sub3.method547();
				this.aClass8_12 = new Class8(171, 509, this.method584(), 384);
				Class6_Sub1_Sub3.method547();
				this.aClass8_13 = new Class8(132, 360, this.method584(), 384);
				Class6_Sub1_Sub3.method547();
				this.aClass8_14 = new Class8(200, 360, this.method584(), 384);
				Class6_Sub1_Sub3.method547();
				this.aClass8_17 = new Class8(238, 202, this.method584(), 384);
				Class6_Sub1_Sub3.method547();
				this.aClass8_18 = new Class8(238, 203, this.method584(), 384);
				Class6_Sub1_Sub3.method547();
				this.aClass8_19 = new Class8(94, 74, this.method584(), 384);
				Class6_Sub1_Sub3.method547();
				this.aClass8_20 = new Class8(94, 75, this.method584(), 384);
				Class6_Sub1_Sub3.method547();
				if (this.aClass43_2 != null) {
					this.method682();
					this.method720();
				}
				this.aBoolean244 = true;
			}
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("93034, " + 7 + ", " + local171.toString());
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
				return new URL("http://127.0.0.1:" + (80 + anInt877));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method613() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray268[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray268[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray269[local54] = (this.anIntArray268[local54 - 1] + this.anIntArray268[local54 + 1] + this.anIntArray268[local54 - 128] + this.anIntArray268[local54 + 128]) / 4;
				}
			}
			this.anInt942 += 128;
			if (this.anInt942 > this.anIntArray240.length) {
				this.anInt942 -= this.anIntArray240.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method601(this.aClass6_Sub1_Sub3_Sub2Array5[local48]);
			}
			@Pc(166) int local166;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local166 = local54 + (local48 << 7);
					@Pc(189) int local189 = this.anIntArray269[local166 + 128] - this.anIntArray240[local166 + this.anInt942 & this.anIntArray240.length - 1] / 5;
					if (local189 < 0) {
						local189 = 0;
					}
					this.anIntArray268[local166] = local189;
				}
			}
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray213[local54] = this.anIntArray213[local54 + 1];
			}
			this.anIntArray213[255] = (int) (Math.sin((double) anInt1041 / 14.0D) * 16.0D + Math.sin((double) anInt1041 / 15.0D) * 14.0D + Math.sin((double) anInt1041 / 16.0D) * 12.0D);
			if (this.anInt1056 > 0) {
				this.anInt1056 -= 4;
			}
			if (this.anInt1057 > 0) {
				this.anInt1057 -= 4;
			}
			if (this.anInt1056 == 0 && this.anInt1057 == 0) {
				local166 = (int) (Math.random() * 2000.0D);
				if (local166 == 0) {
					this.anInt1056 = 1024;
				}
				if (local166 == 1) {
					this.anInt1057 = 1024;
					return;
				}
			}
		} catch (@Pc(306) RuntimeException local306) {
			signlink.reporterror("36844, " + 2 + ", " + local306.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method614() {
		try {
			if (aBoolean225 && this.anInt928 == 2 && Class7.anInt77 != this.anInt854) {
				this.method706((String) null, "Loading - please wait.");
				this.anInt928 = 1;
				this.aLong33 = System.currentTimeMillis();
			}
			if (this.anInt928 == 1) {
				@Pc(31) int local31 = this.method615((byte) 8);
				if (local31 != 0 && System.currentTimeMillis() - this.aLong33 > 360000L) {
					signlink.reporterror(this.aString20 + " glcfb " + this.aLong30 + "," + local31 + "," + aBoolean225 + "," + this.aClass45Array1[0] + "," + this.aClass30_Sub1_1.method285() + "," + this.anInt854 + "," + this.anInt910 + "," + this.anInt911);
					this.aLong33 = System.currentTimeMillis();
				}
			}
			if (this.anInt928 == 2 && this.anInt854 != this.anInt924) {
				this.anInt924 = this.anInt854;
				this.method725(this.anInt854);
			}
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("77971, " + 144 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)I")
	private int method615(@OriginalArg(0) byte arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray6.length; local3++) {
				if (this.aByteArrayArray6[local3] == null && this.anIntArray255[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray5[local3] == null && this.anIntArray256[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(41) int local41 = 0; local41 < this.aByteArrayArray6.length; local41++) {
				@Pc(48) byte[] local48 = this.aByteArrayArray5[local41];
				if (local48 != null) {
					@Pc(62) int local62 = (this.anIntArray254[local41] >> 8) * 64 - this.anInt959;
					@Pc(74) int local74 = (this.anIntArray254[local41] & 0xFF) * 64 - this.anInt960;
					if (this.aBoolean251) {
						local62 = 10;
						local74 = 10;
					}
					local39 &= Class7.method35(local62, local74, (byte) 1, local48);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean249) {
				return -4;
			} else {
				this.anInt928 = 2;
				Class7.anInt77 = this.anInt854;
				this.method704((byte) 2);
				this.aClass6_Sub1_Sub4_6.method228(198);
				@Pc(123) boolean local123 = false;
				return 0;
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("68889, " + arg0 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method616(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				@Pc(9) int local9 = this.anIntArray216[arg0];
				@Pc(14) int local14 = this.anIntArray217[arg0];
				@Pc(19) int local19 = this.anIntArray218[arg0];
				@Pc(24) int local24 = this.anIntArray219[arg0];
				if (local19 >= 2000) {
					local19 -= 2000;
				}
				if (this.anInt1018 != 0 && local19 != 1718) {
					this.anInt1018 = 0;
					this.aBoolean252 = true;
				}
				@Pc(48) Class6_Sub1_Sub2_Sub4_Sub1 local48;
				if (local19 == 19) {
					local48 = this.aClass6_Sub1_Sub2_Sub4_Sub1Array1[local24];
					if (local48 != null) {
						this.method598(local48.anIntArray169[0], local48.anIntArray170[0], 0, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0], 1, 2, 1, false, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0], 0, 0);
						this.anInt893 = super.anInt820;
						this.anInt894 = super.anInt821;
						this.anInt896 = 2;
						this.anInt895 = 0;
						this.aClass6_Sub1_Sub4_6.method228(148);
						this.aClass6_Sub1_Sub4_6.method265(this.aBoolean223, local24);
					}
				}
				@Pc(135) int local135;
				@Pc(117) Class1 local117;
				if (local19 == 843) {
					this.aClass6_Sub1_Sub4_6.method228(72);
					this.aClass6_Sub1_Sub4_6.method230(local14);
					local117 = Class1.method4(local14);
					if (local117.anIntArrayArray1 != null && local117.anIntArrayArray1[0][0] == 5) {
						local135 = local117.anIntArrayArray1[0][1];
						if (this.anIntArray239[local135] != local117.anIntArray6[0]) {
							this.anIntArray239[local135] = local117.anIntArray6[0];
							this.method714(local135);
							this.aBoolean238 = true;
						}
					}
				}
				if (local19 == 1234) {
					this.method701(local24, local9, local14);
					this.aClass6_Sub1_Sub4_6.method228(0);
					this.aClass6_Sub1_Sub4_6.method265(this.aBoolean223, local9 + this.anInt959);
					this.aClass6_Sub1_Sub4_6.method265(this.aBoolean223, local24 >> 14 & 0x7FFF);
					this.aClass6_Sub1_Sub4_6.method266(local14 + this.anInt960);
				}
				if (local19 == 699) {
					this.method604(this.anInt976);
					this.anInt976 = -1;
					this.aBoolean252 = true;
				}
				if (local19 == 115) {
					anInt906 += local24;
					if (anInt906 >= 132) {
						this.aClass6_Sub1_Sub4_6.method228(12);
						this.aClass6_Sub1_Sub4_6.method232(12545964);
						anInt906 = 0;
					}
					this.aClass6_Sub1_Sub4_6.method228(231);
					this.aClass6_Sub1_Sub4_6.method230(local9);
					this.aClass6_Sub1_Sub4_6.method264(local14);
					this.aClass6_Sub1_Sub4_6.method264(local24);
					this.anInt886 = 0;
					this.anInt887 = local14;
					this.anInt888 = local9;
					this.anInt889 = 2;
					if (Class1.method4(local14).anInt2 == this.anInt1051) {
						this.anInt889 = 1;
					}
					if (Class1.method4(local14).anInt2 == this.anInt979) {
						this.anInt889 = 3;
					}
				}
				@Pc(309) boolean local309;
				if (local19 == 764) {
					local309 = this.method598(local9, local14, 0, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0], 0, 2, 0, false, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0], 0, 0);
					if (!local309) {
						this.method598(local9, local14, 0, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0], 1, 2, 1, false, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0], 0, 0);
					}
					this.anInt893 = super.anInt820;
					this.anInt894 = super.anInt821;
					this.anInt896 = 2;
					this.anInt895 = 0;
					this.aClass6_Sub1_Sub4_6.method228(156);
					this.aClass6_Sub1_Sub4_6.method265(this.aBoolean223, local9 + this.anInt959);
					this.aClass6_Sub1_Sub4_6.method230(local14 + this.anInt960);
					this.aClass6_Sub1_Sub4_6.method266(local24);
				}
				if (local19 == 652 && this.method701(local24, local9, local14)) {
					this.aClass6_Sub1_Sub4_6.method228(251);
					this.aClass6_Sub1_Sub4_6.method230(local9 + this.anInt959);
					this.aClass6_Sub1_Sub4_6.method230(local14 + this.anInt960);
					this.aClass6_Sub1_Sub4_6.method230(this.anInt991);
					this.aClass6_Sub1_Sub4_6.method265(this.aBoolean223, local24 >> 14 & 0x7FFF);
				}
				if (local19 == 915) {
					this.aClass6_Sub1_Sub4_6.method228(72);
					this.aClass6_Sub1_Sub4_6.method230(local14);
					local117 = Class1.method4(local14);
					if (local117.anIntArrayArray1 != null && local117.anIntArrayArray1[0][0] == 5) {
						local135 = local117.anIntArrayArray1[0][1];
						this.anIntArray239[local135] = 1 - this.anIntArray239[local135];
						this.method714(local135);
						this.aBoolean238 = true;
					}
				}
				@Pc(474) Class6_Sub1_Sub2_Sub4_Sub2 local474;
				if (local19 == 891) {
					local474 = this.aClass6_Sub1_Sub2_Sub4_Sub2Array1[local24];
					if (local474 != null) {
						this.method598(local474.anIntArray169[0], local474.anIntArray170[0], 0, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0], 1, 2, 1, false, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0], 0, 0);
						this.anInt893 = super.anInt820;
						this.anInt894 = super.anInt821;
						this.anInt896 = 2;
						this.anInt895 = 0;
						this.aClass6_Sub1_Sub4_6.method228(192);
						this.aClass6_Sub1_Sub4_6.method266(this.anInt991);
						this.aClass6_Sub1_Sub4_6.method265(this.aBoolean223, local24);
					}
				}
				@Pc(566) String local566;
				@Pc(570) int local570;
				@Pc(545) String local545;
				if (local19 == 464 || local19 == 323) {
					local545 = this.aStringArray9[arg0];
					local135 = local545.indexOf("@whi@");
					if (local135 != -1) {
						local545 = local545.substring(local135 + 5).trim();
						local566 = Class41.method485(Class41.method482(Class41.method481(local545), (byte) 7));
						@Pc(568) boolean local568 = false;
						for (local570 = 0; local570 < this.anInt987; local570++) {
							@Pc(580) Class6_Sub1_Sub2_Sub4_Sub2 local580 = this.aClass6_Sub1_Sub2_Sub4_Sub2Array1[this.anIntArray251[local570]];
							if (local580 != null && local580.aString16 != null && local580.aString16.equalsIgnoreCase(local566)) {
								this.method598(local580.anIntArray169[0], local580.anIntArray170[0], 0, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0], 1, 2, 1, false, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0], 0, 0);
								if (local19 == 464) {
									this.aClass6_Sub1_Sub4_6.method228(214);
									this.aClass6_Sub1_Sub4_6.method230(this.anIntArray251[local570]);
								}
								if (local19 == 323) {
									this.aClass6_Sub1_Sub4_6.method228(121);
									this.aClass6_Sub1_Sub4_6.method265(this.aBoolean223, this.anIntArray251[local570]);
								}
								local568 = true;
								break;
							}
						}
						if (!local568) {
							this.method670("Unable to find " + local566, "", 0);
						}
					}
				}
				if (local19 == 426) {
					local474 = this.aClass6_Sub1_Sub2_Sub4_Sub2Array1[local24];
					if (local474 != null) {
						this.method598(local474.anIntArray169[0], local474.anIntArray170[0], 0, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0], 1, 2, 1, false, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0], 0, 0);
						this.anInt893 = super.anInt820;
						this.anInt894 = super.anInt821;
						this.anInt896 = 2;
						this.anInt895 = 0;
						this.aClass6_Sub1_Sub4_6.method228(121);
						this.aClass6_Sub1_Sub4_6.method265(this.aBoolean223, local24);
					}
				}
				if (local19 == 155) {
					this.method701(local24, local9, local14);
					this.aClass6_Sub1_Sub4_6.method228(66);
					this.aClass6_Sub1_Sub4_6.method266(local14 + this.anInt960);
					this.aClass6_Sub1_Sub4_6.method266(local24 >> 14 & 0x7FFF);
					this.aClass6_Sub1_Sub4_6.method265(this.aBoolean223, local9 + this.anInt959);
				}
				if (local19 == 659) {
					local48 = this.aClass6_Sub1_Sub2_Sub4_Sub1Array1[local24];
					if (local48 != null) {
						this.method598(local48.anIntArray169[0], local48.anIntArray170[0], 0, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0], 1, 2, 1, false, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0], 0, 0);
						this.anInt893 = super.anInt820;
						this.anInt894 = super.anInt821;
						this.anInt896 = 2;
						this.anInt895 = 0;
						this.aClass6_Sub1_Sub4_6.method228(170);
						this.aClass6_Sub1_Sub4_6.method230(local24);
					}
				}
				if (local19 == 247) {
					this.aClass6_Sub1_Sub4_6.method228(67);
					this.aClass6_Sub1_Sub4_6.method230(local9);
					this.aClass6_Sub1_Sub4_6.method265(this.aBoolean223, this.anInt1044);
					this.aClass6_Sub1_Sub4_6.method266(this.anInt1045);
					this.aClass6_Sub1_Sub4_6.method230(this.anInt1043);
					this.aClass6_Sub1_Sub4_6.method230(local24);
					this.aClass6_Sub1_Sub4_6.method266(local14);
					this.anInt886 = 0;
					this.anInt887 = local14;
					this.anInt888 = local9;
					this.anInt889 = 2;
					if (Class1.method4(local14).anInt2 == this.anInt1051) {
						this.anInt889 = 1;
					}
					if (Class1.method4(local14).anInt2 == this.anInt979) {
						this.anInt889 = 3;
					}
				}
				if (local19 == 513) {
					this.method701(local24, local9, local14);
					this.aClass6_Sub1_Sub4_6.method228(8);
					this.aClass6_Sub1_Sub4_6.method230(local14 + this.anInt960);
					this.aClass6_Sub1_Sub4_6.method266(local9 + this.anInt959);
					this.aClass6_Sub1_Sub4_6.method266(local24 >> 14 & 0x7FFF);
				}
				if (local19 == 376) {
					local545 = this.aStringArray9[arg0];
					local135 = local545.indexOf("@whi@");
					if (local135 != -1) {
						if (this.anInt1051 == -1) {
							this.method606();
							this.aString30 = local545.substring(local135 + 5).trim();
							this.aBoolean234 = false;
							this.anInt1046 = this.anInt1051 = Class1.anInt20;
						} else {
							this.method670("Please close the interface you have open before using 'report abuse'", "", 0);
						}
					}
				}
				if (local19 == 108) {
					local309 = this.method598(local9, local14, 0, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0], 0, 2, 0, false, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0], 0, 0);
					if (!local309) {
						this.method598(local9, local14, 0, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0], 1, 2, 1, false, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0], 0, 0);
					}
					this.anInt893 = super.anInt820;
					this.anInt894 = super.anInt821;
					this.anInt896 = 2;
					this.anInt895 = 0;
					this.aClass6_Sub1_Sub4_6.method228(106);
					this.aClass6_Sub1_Sub4_6.method230(local24);
					this.aClass6_Sub1_Sub4_6.method264(local14 + this.anInt960);
					this.aClass6_Sub1_Sub4_6.method230(local9 + this.anInt959);
				}
				if (local19 == 1420) {
					@Pc(1084) int local1084 = local24 >> 14 & 0x7FFF;
					@Pc(1087) Class11 local1087 = Class11.method60(local1084);
					if (local1087.aByteArray2 == null) {
						local566 = "It's a " + local1087.aString7 + ".";
					} else {
						local566 = new String(local1087.aByteArray2);
					}
					this.method670(local566, "", 0);
				}
				if (local19 == 619) {
					local48 = this.aClass6_Sub1_Sub2_Sub4_Sub1Array1[local24];
					if (local48 != null) {
						this.method598(local48.anIntArray169[0], local48.anIntArray170[0], 0, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0], 1, 2, 1, false, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0], 0, 0);
						this.anInt893 = super.anInt820;
						this.anInt894 = super.anInt821;
						this.anInt896 = 2;
						this.anInt895 = 0;
						this.aClass6_Sub1_Sub4_6.method228(80);
						this.aClass6_Sub1_Sub4_6.method264(local24);
					}
				}
				@Pc(1208) long local1208;
				if (local19 == 675 || local19 == 720 || local19 == 360 || local19 == 61) {
					local545 = this.aStringArray9[arg0];
					local135 = local545.indexOf("@whi@");
					if (local135 != -1) {
						local1208 = Class41.method481(local545.substring(local135 + 5).trim());
						if (local19 == 675) {
							this.method594(local1208);
						}
						if (local19 == 720) {
							this.method637(local1208);
						}
						if (local19 == 360) {
							this.method699(local1208);
						}
						if (local19 == 61) {
							this.method630(100, local1208);
						}
					}
				}
				if (local19 == 21) {
					local309 = this.method598(local9, local14, 0, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0], 0, 2, 0, false, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0], 0, 0);
					if (!local309) {
						this.method598(local9, local14, 0, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0], 1, 2, 1, false, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0], 0, 0);
					}
					this.anInt893 = super.anInt820;
					this.anInt894 = super.anInt821;
					this.anInt896 = 2;
					this.anInt895 = 0;
					this.aClass6_Sub1_Sub4_6.method228(246);
					this.aClass6_Sub1_Sub4_6.method266(local9 + this.anInt959);
					this.aClass6_Sub1_Sub4_6.method265(this.aBoolean223, local14 + this.anInt960);
					this.aClass6_Sub1_Sub4_6.method266(local24);
				}
				if (local19 == 871) {
					anInt993 += local14;
					if (anInt993 >= 98) {
						this.aClass6_Sub1_Sub4_6.method228(189);
						this.aClass6_Sub1_Sub4_6.method233(0);
						anInt993 = 0;
					}
					this.aClass6_Sub1_Sub4_6.method228(2);
					this.aClass6_Sub1_Sub4_6.method266(local14);
					this.aClass6_Sub1_Sub4_6.method230(local9);
					this.aClass6_Sub1_Sub4_6.method230(local24);
					this.anInt886 = 0;
					this.anInt887 = local14;
					this.anInt888 = local9;
					this.anInt889 = 2;
					if (Class1.method4(local14).anInt2 == this.anInt1051) {
						this.anInt889 = 1;
					}
					if (Class1.method4(local14).anInt2 == this.anInt979) {
						this.anInt889 = 3;
					}
				}
				if (local19 == 257) {
					local48 = this.aClass6_Sub1_Sub2_Sub4_Sub1Array1[local24];
					if (local48 != null) {
						this.method598(local48.anIntArray169[0], local48.anIntArray170[0], 0, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0], 1, 2, 1, false, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0], 0, 0);
						this.anInt893 = super.anInt820;
						this.anInt894 = super.anInt821;
						this.anInt896 = 2;
						this.anInt895 = 0;
						this.aClass6_Sub1_Sub4_6.method228(35);
						this.aClass6_Sub1_Sub4_6.method264(this.anInt991);
						this.aClass6_Sub1_Sub4_6.method265(this.aBoolean223, local24);
					}
				}
				if (local19 == 850) {
					this.aClass6_Sub1_Sub4_6.method228(48);
					this.aClass6_Sub1_Sub4_6.method264(local24);
					this.aClass6_Sub1_Sub4_6.method266(local14);
					this.aClass6_Sub1_Sub4_6.method265(this.aBoolean223, local9);
					this.anInt886 = 0;
					this.anInt887 = local14;
					this.anInt888 = local9;
					this.anInt889 = 2;
					if (Class1.method4(local14).anInt2 == this.anInt1051) {
						this.anInt889 = 1;
					}
					if (Class1.method4(local14).anInt2 == this.anInt979) {
						this.anInt889 = 3;
					}
				}
				@Pc(1530) String local1530;
				@Pc(1521) Class35 local1521;
				if (local19 == 1663) {
					local1521 = Class35.method370(local24);
					if (local1521.aByteArray16 == null) {
						local1530 = "It's a " + local1521.aString14 + ".";
					} else {
						local1530 = new String(local1521.aByteArray16);
					}
					this.method670(local1530, "", 0);
				}
				if (local19 == 547) {
					this.aClass6_Sub1_Sub4_6.method228(225);
					this.aClass6_Sub1_Sub4_6.method264(local14);
					this.aClass6_Sub1_Sub4_6.method264(local24);
					this.aClass6_Sub1_Sub4_6.method264(local9);
					this.anInt886 = 0;
					this.anInt887 = local14;
					this.anInt888 = local9;
					this.anInt889 = 2;
					if (Class1.method4(local14).anInt2 == this.anInt1051) {
						this.anInt889 = 1;
					}
					if (Class1.method4(local14).anInt2 == this.anInt979) {
						this.anInt889 = 3;
					}
				}
				if (local19 == 479) {
					this.aClass6_Sub1_Sub4_6.method228(233);
					this.aClass6_Sub1_Sub4_6.method230(local9);
					this.aClass6_Sub1_Sub4_6.method266(local14);
					this.aClass6_Sub1_Sub4_6.method265(this.aBoolean223, local24);
					this.anInt886 = 0;
					this.anInt887 = local14;
					this.anInt888 = local9;
					this.anInt889 = 2;
					if (Class1.method4(local14).anInt2 == this.anInt1051) {
						this.anInt889 = 1;
					}
					if (Class1.method4(local14).anInt2 == this.anInt979) {
						this.anInt889 = 3;
					}
				}
				if (local19 == 886) {
					local474 = this.aClass6_Sub1_Sub2_Sub4_Sub2Array1[local24];
					if (local474 != null) {
						this.method598(local474.anIntArray169[0], local474.anIntArray170[0], 0, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0], 1, 2, 1, false, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0], 0, 0);
						this.anInt893 = super.anInt820;
						this.anInt894 = super.anInt821;
						this.anInt896 = 2;
						this.anInt895 = 0;
						this.aClass6_Sub1_Sub4_6.method228(211);
						this.aClass6_Sub1_Sub4_6.method265(this.aBoolean223, local24);
					}
				}
				if (local19 == 712) {
					local309 = this.method598(local9, local14, 0, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0], 0, 2, 0, false, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0], 0, 0);
					if (!local309) {
						this.method598(local9, local14, 0, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0], 1, 2, 1, false, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0], 0, 0);
					}
					this.anInt893 = super.anInt820;
					this.anInt894 = super.anInt821;
					this.anInt896 = 2;
					this.anInt895 = 0;
					this.aClass6_Sub1_Sub4_6.method228(202);
					this.aClass6_Sub1_Sub4_6.method264(local9 + this.anInt959);
					this.aClass6_Sub1_Sub4_6.method264(local14 + this.anInt960);
					this.aClass6_Sub1_Sub4_6.method265(this.aBoolean223, local24);
					this.aClass6_Sub1_Sub4_6.method266(this.anInt991);
				}
				if (local19 == 268 && !this.aBoolean245) {
					this.aClass6_Sub1_Sub4_6.method228(175);
					this.aClass6_Sub1_Sub4_6.method230(local14);
					this.aBoolean245 = true;
				}
				if (local19 == 616) {
					if (this.aBoolean217) {
						this.aClass38_1.method435(local9 - 4, local14 - 4);
					} else {
						this.aClass38_1.method435(super.anInt820 - 4, super.anInt821 - 4);
					}
				}
				if (local19 == 253) {
					this.anInt1042 = 1;
					this.anInt1043 = local9;
					this.anInt1044 = local14;
					this.anInt1045 = local24;
					this.aString31 = String.valueOf(Class35.method370(local24).aString14);
					this.anInt990 = 0;
					this.aBoolean238 = true;
				} else {
					if (local19 == 670) {
						anInt1020 += local9;
						if (anInt1020 >= 85) {
							this.aClass6_Sub1_Sub4_6.method228(141);
							this.aClass6_Sub1_Sub4_6.method230(8034);
							anInt1020 = 0;
						}
						this.aClass6_Sub1_Sub4_6.method228(99);
						this.aClass6_Sub1_Sub4_6.method264(local9);
						this.aClass6_Sub1_Sub4_6.method266(local24);
						this.aClass6_Sub1_Sub4_6.method264(local14);
						this.anInt886 = 0;
						this.anInt887 = local14;
						this.anInt888 = local9;
						this.anInt889 = 2;
						if (Class1.method4(local14).anInt2 == this.anInt1051) {
							this.anInt889 = 1;
						}
						if (Class1.method4(local14).anInt2 == this.anInt979) {
							this.anInt889 = 3;
						}
					}
					if (local19 == 1327) {
						local1521 = Class35.method370(local24);
						@Pc(1967) Class1 local1967 = Class1.method4(local14);
						if (local1967 != null && local1967.anIntArray1[local9] >= 100000) {
							local1530 = local1967.anIntArray1[local9] + " x " + local1521.aString14;
						} else if (local1521.aByteArray16 == null) {
							local1530 = "It's a " + local1521.aString14 + ".";
						} else {
							local1530 = new String(local1521.aByteArray16);
						}
						this.method670(local1530, "", 0);
					}
					if (local19 == 165) {
						local48 = this.aClass6_Sub1_Sub2_Sub4_Sub1Array1[local24];
						if (local48 != null) {
							this.method598(local48.anIntArray169[0], local48.anIntArray170[0], 0, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0], 1, 2, 1, false, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0], 0, 0);
							this.anInt893 = super.anInt820;
							this.anInt894 = super.anInt821;
							this.anInt896 = 2;
							this.anInt895 = 0;
							anInt903 += local24;
							if (anInt903 >= 58) {
								this.aClass6_Sub1_Sub4_6.method228(21);
								this.aClass6_Sub1_Sub4_6.method229(154);
								anInt903 = 0;
							}
							this.aClass6_Sub1_Sub4_6.method228(235);
							this.aClass6_Sub1_Sub4_6.method230(local24);
						}
					}
					if (local19 == 940) {
						this.aClass6_Sub1_Sub4_6.method228(118);
						this.aClass6_Sub1_Sub4_6.method264(local9);
						this.aClass6_Sub1_Sub4_6.method264(local14);
						this.aClass6_Sub1_Sub4_6.method264(local24);
						this.anInt886 = 0;
						this.anInt887 = local14;
						this.anInt888 = local9;
						this.anInt889 = 2;
						if (Class1.method4(local14).anInt2 == this.anInt1051) {
							this.anInt889 = 1;
						}
						if (Class1.method4(local14).anInt2 == this.anInt979) {
							this.anInt889 = 3;
						}
					}
					if (local19 == 349) {
						local117 = Class1.method4(local14);
						@Pc(2159) boolean local2159 = true;
						if (local117.anInt12 > 0) {
							local2159 = this.method703(local117);
						}
						if (local2159) {
							this.aClass6_Sub1_Sub4_6.method228(72);
							this.aClass6_Sub1_Sub4_6.method230(local14);
						}
					}
					if (local19 == 20) {
						this.method701(local24, local9, local14);
						this.aClass6_Sub1_Sub4_6.method228(38);
						this.aClass6_Sub1_Sub4_6.method230(local24 >> 14 & 0x7FFF);
						this.aClass6_Sub1_Sub4_6.method266(local14 + this.anInt960);
						this.aClass6_Sub1_Sub4_6.method230(local9 + this.anInt959);
					}
					if (local19 == 857) {
						local48 = this.aClass6_Sub1_Sub2_Sub4_Sub1Array1[local24];
						if (local48 != null) {
							this.method598(local48.anIntArray169[0], local48.anIntArray170[0], 0, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0], 1, 2, 1, false, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0], 0, 0);
							this.anInt893 = super.anInt820;
							this.anInt894 = super.anInt821;
							this.anInt896 = 2;
							this.anInt895 = 0;
							anInt938++;
							if (anInt938 >= 85) {
								this.aClass6_Sub1_Sub4_6.method228(191);
								this.aClass6_Sub1_Sub4_6.method230(23198);
								anInt938 = 0;
							}
							this.aClass6_Sub1_Sub4_6.method228(187);
							this.aClass6_Sub1_Sub4_6.method265(this.aBoolean223, local24);
						}
					}
					if (local19 == 330) {
						local309 = this.method598(local9, local14, 0, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0], 0, 2, 0, false, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0], 0, 0);
						if (!local309) {
							this.method598(local9, local14, 0, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0], 1, 2, 1, false, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0], 0, 0);
						}
						this.anInt893 = super.anInt820;
						this.anInt894 = super.anInt821;
						this.anInt896 = 2;
						this.anInt895 = 0;
						this.aClass6_Sub1_Sub4_6.method228(226);
						this.aClass6_Sub1_Sub4_6.method264(local24);
						this.aClass6_Sub1_Sub4_6.method266(local14 + this.anInt960);
						this.aClass6_Sub1_Sub4_6.method264(local9 + this.anInt959);
					}
					if (local19 == 5) {
						if ((local14 & 0x3) == 0) {
							anInt908++;
						}
						if (anInt908 >= 68) {
							this.aClass6_Sub1_Sub4_6.method228(215);
							anInt908 = 0;
						}
						this.aClass6_Sub1_Sub4_6.method228(110);
						this.aClass6_Sub1_Sub4_6.method230(local9);
						this.aClass6_Sub1_Sub4_6.method230(local24);
						this.aClass6_Sub1_Sub4_6.method264(local14);
						this.anInt886 = 0;
						this.anInt887 = local14;
						this.anInt888 = local9;
						this.anInt889 = 2;
						if (Class1.method4(local14).anInt2 == this.anInt1051) {
							this.anInt889 = 1;
						}
						if (Class1.method4(local14).anInt2 == this.anInt979) {
							this.anInt889 = 3;
						}
					}
					if (local19 == 419) {
						this.aClass6_Sub1_Sub4_6.method228(184);
						this.aClass6_Sub1_Sub4_6.method230(this.anInt991);
						this.aClass6_Sub1_Sub4_6.method230(local14);
						this.aClass6_Sub1_Sub4_6.method230(local9);
						this.aClass6_Sub1_Sub4_6.method266(local24);
						this.anInt886 = 0;
						this.anInt887 = local14;
						this.anInt888 = local9;
						this.anInt889 = 2;
						if (Class1.method4(local14).anInt2 == this.anInt1051) {
							this.anInt889 = 1;
						}
						if (Class1.method4(local14).anInt2 == this.anInt979) {
							this.anInt889 = 3;
						}
					}
					if (local19 == 123) {
						this.aClass6_Sub1_Sub4_6.method228(139);
						this.aClass6_Sub1_Sub4_6.method230(local24);
						this.aClass6_Sub1_Sub4_6.method266(local9);
						this.aClass6_Sub1_Sub4_6.method266(local14);
						this.anInt886 = 0;
						this.anInt887 = local14;
						this.anInt888 = local9;
						this.anInt889 = 2;
						if (Class1.method4(local14).anInt2 == this.anInt1051) {
							this.anInt889 = 1;
						}
						if (Class1.method4(local14).anInt2 == this.anInt979) {
							this.anInt889 = 3;
						}
					}
					if (local19 == 863) {
						local474 = this.aClass6_Sub1_Sub2_Sub4_Sub2Array1[local24];
						if (local474 != null) {
							this.method598(local474.anIntArray169[0], local474.anIntArray170[0], 0, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0], 1, 2, 1, false, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0], 0, 0);
							this.anInt893 = super.anInt820;
							this.anInt894 = super.anInt821;
							this.anInt896 = 2;
							this.anInt895 = 0;
							this.aClass6_Sub1_Sub4_6.method228(149);
							this.aClass6_Sub1_Sub4_6.method264(local24);
						}
					}
					if (local19 == 654) {
						local545 = this.aStringArray9[arg0];
						local135 = local545.indexOf("@whi@");
						if (local135 != -1) {
							local1208 = Class41.method481(local545.substring(local135 + 5).trim());
							local570 = -1;
							for (@Pc(2648) int local2648 = 0; local2648 < this.anInt827; local2648++) {
								if (this.aLongArray4[local2648] == local1208) {
									local570 = local2648;
									break;
								}
							}
							if (local570 != -1 && this.anIntArray237[local570] > 0) {
								this.aBoolean252 = true;
								this.anInt1018 = 0;
								this.aBoolean216 = true;
								this.aString18 = "";
								this.anInt975 = 3;
								this.aLong31 = this.aLongArray4[local570];
								this.aString24 = "Enter message to send to " + this.aStringArray11[local570];
							}
						}
					}
					if (local19 == 826) {
						anInt831++;
						if (anInt831 >= 127) {
							this.aClass6_Sub1_Sub4_6.method228(103);
							this.aClass6_Sub1_Sub4_6.method230(56911);
							anInt831 = 0;
						}
						this.method701(local24, local9, local14);
						this.aClass6_Sub1_Sub4_6.method228(203);
						this.aClass6_Sub1_Sub4_6.method264(local9 + this.anInt959);
						this.aClass6_Sub1_Sub4_6.method230(local14 + this.anInt960);
						this.aClass6_Sub1_Sub4_6.method265(this.aBoolean223, local24 >> 14 & 0x7FFF);
					}
					if (local19 == 715) {
						local309 = this.method598(local9, local14, 0, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0], 0, 2, 0, false, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0], 0, 0);
						if (!local309) {
							this.method598(local9, local14, 0, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0], 1, 2, 1, false, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0], 0, 0);
						}
						this.anInt893 = super.anInt820;
						this.anInt894 = super.anInt821;
						this.anInt896 = 2;
						this.anInt895 = 0;
						this.aClass6_Sub1_Sub4_6.method228(177);
						this.aClass6_Sub1_Sub4_6.method265(this.aBoolean223, local9 + this.anInt959);
						this.aClass6_Sub1_Sub4_6.method266(local24);
						this.aClass6_Sub1_Sub4_6.method266(local14 + this.anInt960);
					}
					if (local19 == 193) {
						this.aClass6_Sub1_Sub4_6.method228(182);
						this.aClass6_Sub1_Sub4_6.method265(this.aBoolean223, local14);
						this.aClass6_Sub1_Sub4_6.method266(local9);
						this.aClass6_Sub1_Sub4_6.method266(local24);
						this.anInt886 = 0;
						this.anInt887 = local14;
						this.anInt888 = local9;
						this.anInt889 = 2;
						if (Class1.method4(local14).anInt2 == this.anInt1051) {
							this.anInt889 = 1;
						}
						if (Class1.method4(local14).anInt2 == this.anInt979) {
							this.anInt889 = 3;
						}
					}
					if (local19 == 1) {
						local117 = Class1.method4(local14);
						this.anInt990 = 1;
						this.anInt991 = local14;
						this.anInt992 = local117.anInt9;
						this.anInt1042 = 0;
						this.aBoolean238 = true;
						local1530 = local117.aString4;
						if (local1530.indexOf(" ") != -1) {
							local1530 = local1530.substring(0, local1530.indexOf(" "));
						}
						local566 = local117.aString4;
						if (local566.indexOf(" ") != -1) {
							local566 = local566.substring(local566.indexOf(" ") + 1);
						}
						this.aString29 = local1530 + " " + local117.aString5 + " " + local566;
						if (this.anInt992 == 16) {
							this.aBoolean238 = true;
							this.anInt1016 = 3;
							this.aBoolean219 = true;
						}
					} else {
						if (local19 == 804 && this.method701(local24, local9, local14)) {
							this.aClass6_Sub1_Sub4_6.method228(222);
							this.aClass6_Sub1_Sub4_6.method230(this.anInt1043);
							this.aClass6_Sub1_Sub4_6.method266(this.anInt1044);
							this.aClass6_Sub1_Sub4_6.method230(local14 + this.anInt960);
							this.aClass6_Sub1_Sub4_6.method264(local9 + this.anInt959);
							this.aClass6_Sub1_Sub4_6.method266(local24 >> 14 & 0x7FFF);
							this.aClass6_Sub1_Sub4_6.method266(this.anInt1045);
						}
						if (local19 == 564) {
							local48 = this.aClass6_Sub1_Sub2_Sub4_Sub1Array1[local24];
							if (local48 != null) {
								this.method598(local48.anIntArray169[0], local48.anIntArray170[0], 0, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0], 1, 2, 1, false, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0], 0, 0);
								this.anInt893 = super.anInt820;
								this.anInt894 = super.anInt821;
								this.anInt896 = 2;
								this.anInt895 = 0;
								this.aClass6_Sub1_Sub4_6.method228(7);
								this.aClass6_Sub1_Sub4_6.method265(this.aBoolean223, this.anInt1043);
								this.aClass6_Sub1_Sub4_6.method265(this.aBoolean223, this.anInt1045);
								this.aClass6_Sub1_Sub4_6.method265(this.aBoolean223, this.anInt1044);
								this.aClass6_Sub1_Sub4_6.method230(local24);
							}
						}
						if (local19 == 1505) {
							local48 = this.aClass6_Sub1_Sub2_Sub4_Sub1Array1[local24];
							if (local48 != null) {
								@Pc(3141) Class20 local3141 = local48.aClass20_1;
								if (local3141.anIntArray82 != null) {
									local3141 = local3141.method147();
								}
								if (local3141 != null) {
									if (local3141.aByteArray10 == null) {
										local566 = "It's a " + local3141.aString9 + ".";
									} else {
										local566 = new String(local3141.aByteArray10);
									}
									this.method670(local566, "", 0);
								}
							}
						}
						if (local19 == 417) {
							local309 = this.method598(local9, local14, 0, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0], 0, 2, 0, false, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0], 0, 0);
							if (!local309) {
								this.method598(local9, local14, 0, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0], 1, 2, 1, false, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0], 0, 0);
							}
							this.anInt893 = super.anInt820;
							this.anInt894 = super.anInt821;
							this.anInt896 = 2;
							this.anInt895 = 0;
							this.aClass6_Sub1_Sub4_6.method228(86);
							this.aClass6_Sub1_Sub4_6.method266(this.anInt1045);
							this.aClass6_Sub1_Sub4_6.method266(local14 + this.anInt960);
							this.aClass6_Sub1_Sub4_6.method230(local9 + this.anInt959);
							this.aClass6_Sub1_Sub4_6.method264(this.anInt1043);
							this.aClass6_Sub1_Sub4_6.method230(local24);
							this.aClass6_Sub1_Sub4_6.method264(this.anInt1044);
						}
						if (local19 == 266) {
							local474 = this.aClass6_Sub1_Sub2_Sub4_Sub2Array1[local24];
							if (local474 != null) {
								this.method598(local474.anIntArray169[0], local474.anIntArray170[0], 0, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0], 1, 2, 1, false, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0], 0, 0);
								this.anInt893 = super.anInt820;
								this.anInt894 = super.anInt821;
								this.anInt896 = 2;
								this.anInt895 = 0;
								this.aClass6_Sub1_Sub4_6.method228(214);
								this.aClass6_Sub1_Sub4_6.method230(local24);
							}
						}
						if (local19 == 629) {
							local474 = this.aClass6_Sub1_Sub2_Sub4_Sub2Array1[local24];
							if (local474 != null) {
								this.method598(local474.anIntArray169[0], local474.anIntArray170[0], 0, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0], 1, 2, 1, false, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0], 0, 0);
								this.anInt893 = super.anInt820;
								this.anInt894 = super.anInt821;
								this.anInt896 = 2;
								this.anInt895 = 0;
								anInt882 += local24;
								if (anInt882 >= 115) {
									this.aClass6_Sub1_Sub4_6.method228(45);
									this.aClass6_Sub1_Sub4_6.method232(11222690);
									anInt882 = 0;
								}
								this.aClass6_Sub1_Sub4_6.method228(33);
								this.aClass6_Sub1_Sub4_6.method230(local24);
							}
						}
						if (local19 == 969) {
							this.method606();
						}
						if (local19 == 56) {
							local474 = this.aClass6_Sub1_Sub2_Sub4_Sub2Array1[local24];
							if (local474 != null) {
								this.method598(local474.anIntArray169[0], local474.anIntArray170[0], 0, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0], 1, 2, 1, false, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0], 0, 0);
								this.anInt893 = super.anInt820;
								this.anInt894 = super.anInt821;
								this.anInt896 = 2;
								this.anInt895 = 0;
								this.aClass6_Sub1_Sub4_6.method228(57);
								this.aClass6_Sub1_Sub4_6.method230(this.anInt1044);
								this.aClass6_Sub1_Sub4_6.method230(local24);
								this.aClass6_Sub1_Sub4_6.method230(this.anInt1043);
								this.aClass6_Sub1_Sub4_6.method265(this.aBoolean223, this.anInt1045);
							}
						}
						this.anInt1042 = 0;
						this.anInt990 = 0;
						this.aBoolean238 = true;
					}
				}
			}
		} catch (@Pc(3517) RuntimeException local3517) {
			signlink.reporterror("80273, " + arg0 + ", " + -31 + ", " + local3517.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!ATOBWHST;III)V")
	private void method617(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg1.anInt33 == 0 && arg1.anIntArray5 != null && (!arg1.aBoolean5 || this.anInt918 == arg1.anInt8 || this.anInt841 == arg1.anInt8 || this.anInt972 == arg1.anInt8)) {
				@Pc(29) int local29 = Class6_Sub1_Sub3.anInt789;
				@Pc(31) int local31 = Class6_Sub1_Sub3.anInt787;
				@Pc(33) int local33 = Class6_Sub1_Sub3.anInt790;
				@Pc(35) int local35 = Class6_Sub1_Sub3.anInt788;
				Class6_Sub1_Sub3.method546(arg3, arg4 + arg1.anInt27, arg4, arg3 + arg1.anInt34);
				@Pc(51) int local51 = arg1.anIntArray5.length;
				for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
					@Pc(62) int local62 = arg1.anIntArray8[local53] + arg3;
					@Pc(71) int local71 = arg1.anIntArray7[local53] + arg4 - arg0;
					@Pc(77) Class1 local77 = Class1.method4(arg1.anIntArray5[local53]);
					@Pc(82) int local82 = local62 + local77.anInt7;
					@Pc(87) int local87 = local71 + local77.anInt31;
					if (local77.anInt12 > 0) {
						this.method694(local77);
					}
					if (local77.anInt33 == 0) {
						if (local77.anInt32 > local77.anInt21 - local77.anInt27) {
							local77.anInt32 = local77.anInt21 - local77.anInt27;
						}
						if (local77.anInt32 < 0) {
							local77.anInt32 = 0;
						}
						this.method617(local77.anInt32, local77, this.anInt857, local82, local87);
						if (local77.anInt21 > local77.anInt27) {
							this.method599(local77.anInt32, local77.anInt21, local77.anInt27, local87, local82 + local77.anInt34);
						}
					} else if (local77.anInt33 != 1) {
						@Pc(160) int local160;
						@Pc(164) int local164;
						@Pc(175) int local175;
						@Pc(210) int local210;
						@Pc(217) int local217;
						@Pc(242) int local242;
						@Pc(158) int local158;
						@Pc(208) int local208;
						if (local77.anInt33 == 2) {
							local158 = 0;
							for (local160 = 0; local160 < local77.anInt27; local160++) {
								for (local164 = 0; local164 < local77.anInt34; local164++) {
									local175 = local82 + local164 * (32 + local77.anInt13);
									@Pc(184) int local184 = local87 + local160 * (32 + local77.anInt25);
									if (local158 < 20) {
										local175 += local77.anIntArray3[local158];
										local184 += local77.anIntArray4[local158];
									}
									if (local77.anIntArray9[local158] > 0) {
										local208 = 0;
										local210 = 0;
										local217 = local77.anIntArray9[local158] - 1;
										if (local175 > Class6_Sub1_Sub3.anInt789 - 32 && local175 < Class6_Sub1_Sub3.anInt790 && local184 > Class6_Sub1_Sub3.anInt787 - 32 && local184 < Class6_Sub1_Sub3.anInt788 || this.anInt1023 != 0 && this.anInt1022 == local158) {
											local242 = 0;
											if (this.anInt1042 == 1 && this.anInt1043 == local158 && this.anInt1044 == local77.anInt8) {
												local242 = 16777215;
											}
											@Pc(266) Class6_Sub1_Sub3_Sub3 local266 = Class35.method363(local217, local242, local77.anIntArray1[local158]);
											if (local266 != null) {
												@Pc(345) int local345;
												if (this.anInt1023 != 0 && this.anInt1022 == local158 && this.anInt1021 == local77.anInt8) {
													local208 = super.anInt814 - this.anInt1024;
													local210 = super.anInt815 - this.anInt1025;
													if (local208 < 5 && local208 > -5) {
														local208 = 0;
													}
													if (local210 < 5 && local210 > -5) {
														local210 = 0;
													}
													if (this.anInt971 < 5) {
														local208 = 0;
														local210 = 0;
													}
													local266.method508(local175 + local208, local184 + local210);
													if (local184 + local210 < Class6_Sub1_Sub3.anInt787 && arg1.anInt32 > 0) {
														local345 = this.anInt880 * (Class6_Sub1_Sub3.anInt787 - local184 - local210) / 3;
														if (local345 > this.anInt880 * 10) {
															local345 = this.anInt880 * 10;
														}
														if (local345 > arg1.anInt32) {
															local345 = arg1.anInt32;
														}
														arg1.anInt32 -= local345;
														this.anInt1025 += local345;
													}
													if (local184 + local210 + 32 > Class6_Sub1_Sub3.anInt788 && arg1.anInt32 < arg1.anInt21 - arg1.anInt27) {
														local345 = this.anInt880 * (local184 + local210 + 32 - Class6_Sub1_Sub3.anInt788) / 3;
														if (local345 > this.anInt880 * 10) {
															local345 = this.anInt880 * 10;
														}
														if (local345 > arg1.anInt21 - arg1.anInt27 - arg1.anInt32) {
															local345 = arg1.anInt21 - arg1.anInt27 - arg1.anInt32;
														}
														arg1.anInt32 += local345;
														this.anInt1025 -= local345;
													}
												} else if (this.anInt889 != 0 && this.anInt888 == local158 && this.anInt887 == local77.anInt8) {
													local266.method508(local175, local184);
												} else {
													local266.method506(local184, local175, this.anInt1040);
												}
												if (local266.anInt730 == 33 || local77.anIntArray1[local158] != 1) {
													local345 = local77.anIntArray1[local158];
													this.aClass6_Sub1_Sub3_Sub4_2.method561(method633(local345), local184 + 10 + local210, 0, local175 + 1 + local208);
													this.aClass6_Sub1_Sub3_Sub4_2.method561(method633(local345), local184 + 9 + local210, 16776960, local175 + local208);
												}
											}
										}
									} else if (local77.aClass6_Sub1_Sub3_Sub3Array1 != null && local158 < 20) {
										@Pc(535) Class6_Sub1_Sub3_Sub3 local535 = local77.aClass6_Sub1_Sub3_Sub3Array1[local158];
										if (local535 != null) {
											local535.method506(local184, local175, this.anInt1040);
										}
									}
									local158++;
								}
							}
						} else if (local77.anInt33 == 3) {
							@Pc(562) boolean local562 = false;
							if (this.anInt972 == local77.anInt8 || this.anInt841 == local77.anInt8 || this.anInt918 == local77.anInt8) {
								local562 = true;
							}
							if (this.method655(local77)) {
								local158 = local77.anInt1;
								if (local562 && local77.anInt24 != 0) {
									local158 = local77.anInt24;
								}
							} else {
								local158 = local77.anInt26;
								if (local562 && local77.anInt37 != 0) {
									local158 = local77.anInt37;
								}
							}
							if (local77.aByte1 == 0) {
								if (local77.aBoolean10) {
									Class6_Sub1_Sub3.method549(local82, local77.anInt34, local87, local158, local77.anInt27);
								} else {
									Class6_Sub1_Sub3.method550(local77.anInt27, local77.anInt34, local82, local87, local158, (byte) 1);
								}
							} else if (local77.aBoolean10) {
								Class6_Sub1_Sub3.method548(256 - (local77.aByte1 & 0xFF), local82, local77.anInt27, local158, local87, local77.anInt34);
							} else {
								Class6_Sub1_Sub3.method551(local158, 256 - (local77.aByte1 & 0xFF), local77.anInt27, local82, local77.anInt34, local87);
							}
						} else {
							@Pc(680) Class6_Sub1_Sub3_Sub4 local680;
							@Pc(957) String local957;
							if (local77.anInt33 == 4) {
								local680 = local77.aClass6_Sub1_Sub3_Sub4_1;
								@Pc(683) String local683 = local77.aString3;
								@Pc(685) boolean local685 = false;
								if (this.anInt972 == local77.anInt8 || this.anInt841 == local77.anInt8 || this.anInt918 == local77.anInt8) {
									local685 = true;
								}
								if (this.method655(local77)) {
									local160 = local77.anInt1;
									if (local685 && local77.anInt24 != 0) {
										local160 = local77.anInt24;
									}
									if (local77.aString1.length() > 0) {
										local683 = local77.aString1;
									}
								} else {
									local160 = local77.anInt26;
									if (local685 && local77.anInt37 != 0) {
										local160 = local77.anInt37;
									}
								}
								if (local77.anInt23 == 6 && this.aBoolean245) {
									local683 = "Please wait...";
									local160 = local77.anInt26;
								}
								if (Class6_Sub1_Sub3.anInt785 == 479) {
									if (local160 == 16776960) {
										local160 = 255;
									}
									if (local160 == 49152) {
										local160 = 16777215;
									}
								}
								local208 = local87 + local680.anInt797;
								while (local683.length() > 0) {
									if (local683.indexOf("%") != -1) {
										label390: while (true) {
											local210 = local683.indexOf("%1");
											if (local210 == -1) {
												while (true) {
													local210 = local683.indexOf("%2");
													if (local210 == -1) {
														while (true) {
															local210 = local683.indexOf("%3");
															if (local210 == -1) {
																while (true) {
																	local210 = local683.indexOf("%4");
																	if (local210 == -1) {
																		while (true) {
																			local210 = local683.indexOf("%5");
																			if (local210 == -1) {
																				break label390;
																			}
																			local683 = local683.substring(0, local210) + this.method595(this.method692(4, local77)) + local683.substring(local210 + 2);
																		}
																	}
																	local683 = local683.substring(0, local210) + this.method595(this.method692(3, local77)) + local683.substring(local210 + 2);
																}
															}
															local683 = local683.substring(0, local210) + this.method595(this.method692(2, local77)) + local683.substring(local210 + 2);
														}
													}
													local683 = local683.substring(0, local210) + this.method595(this.method692(1, local77)) + local683.substring(local210 + 2);
												}
											}
											local683 = local683.substring(0, local210) + this.method595(this.method692(0, local77)) + local683.substring(local210 + 2);
										}
									}
									local210 = local683.indexOf("\\n");
									if (local210 == -1) {
										local957 = local683;
										local683 = "";
									} else {
										local957 = local683.substring(0, local210);
										local683 = local683.substring(local210 + 2);
									}
									if (local77.aBoolean2) {
										local680.method558(local82 + local77.anInt34 / 2, local160, local208, local957, local77.aBoolean9);
									} else {
										local680.method565(local82, local957, local208, local160, this.anInt826, local77.aBoolean9);
									}
									local208 += local680.anInt797;
								}
							} else if (local77.anInt33 == 5) {
								@Pc(1020) Class6_Sub1_Sub3_Sub3 local1020;
								if (this.method655(local77)) {
									local1020 = local77.aClass6_Sub1_Sub3_Sub3_1;
								} else {
									local1020 = local77.aClass6_Sub1_Sub3_Sub3_2;
								}
								if (local1020 != null) {
									local1020.method506(local87, local82, this.anInt1040);
								}
							} else if (local77.anInt33 == 6) {
								local158 = Class6_Sub1_Sub3_Sub1.anInt373;
								local160 = Class6_Sub1_Sub3_Sub1.anInt374;
								Class6_Sub1_Sub3_Sub1.anInt373 = local82 + local77.anInt34 / 2;
								Class6_Sub1_Sub3_Sub1.anInt374 = local87 + local77.anInt27 / 2;
								local164 = Class6_Sub1_Sub3_Sub1.anIntArray122[local77.anInt18] * local77.anInt17 >> 16;
								local175 = Class6_Sub1_Sub3_Sub1.anIntArray123[local77.anInt18] * local77.anInt17 >> 16;
								@Pc(1082) boolean local1082 = this.method655(local77);
								if (local1082) {
									local208 = local77.anInt4;
								} else {
									local208 = local77.anInt3;
								}
								@Pc(1102) Class6_Sub1_Sub2_Sub2 local1102;
								if (local208 == -1) {
									local1102 = local77.method6(local1082, -1, -1);
								} else {
									@Pc(1108) Class2 local1108 = Class2.aClass2Array1[local208];
									local1102 = local77.method6(local1082, local1108.anIntArray11[local77.anInt38], local1108.anIntArray10[local77.anInt38]);
								}
								if (local1102 != null) {
									local1102.method107(local77.anInt19, 0, local77.anInt18, 0, local164, local175);
								}
								Class6_Sub1_Sub3_Sub1.anInt373 = local158;
								Class6_Sub1_Sub3_Sub1.anInt374 = local160;
							} else {
								if (local77.anInt33 == 7) {
									local680 = local77.aClass6_Sub1_Sub3_Sub4_1;
									local160 = 0;
									for (local164 = 0; local164 < local77.anInt27; local164++) {
										for (local175 = 0; local175 < local77.anInt34; local175++) {
											if (local77.anIntArray9[local160] > 0) {
												@Pc(1172) Class35 local1172 = Class35.method370(local77.anIntArray9[local160] - 1);
												@Pc(1176) String local1176 = String.valueOf(local1172.aString14);
												if (local1172.aBoolean139 || local77.anIntArray1[local160] != 1) {
													local1176 = local1176 + " x" + method721(this.aByte59, local77.anIntArray1[local160]);
												}
												local210 = local82 + local175 * (115 + local77.anInt13);
												local217 = local87 + local164 * (12 + local77.anInt25);
												if (local77.aBoolean2) {
													local680.method558(local210 + local77.anInt34 / 2, local77.anInt26, local217, local1176, local77.aBoolean9);
												} else {
													local680.method565(local210, local1176, local217, local77.anInt26, this.anInt826, local77.aBoolean9);
												}
											}
											local160++;
										}
									}
								}
								if (local77.anInt33 == 8 && (this.anInt892 == local77.anInt8 || this.anInt844 == local77.anInt8 || this.anInt939 == local77.anInt8) && this.anInt936 == 100) {
									local158 = 0;
									local160 = 0;
									@Pc(1292) Class6_Sub1_Sub3_Sub4 local1292 = this.aClass6_Sub1_Sub3_Sub4_3;
									@Pc(1295) String local1295 = local77.aString3;
									while (local1295.length() > 0) {
										local208 = local1295.indexOf("\\n");
										if (local208 == -1) {
											local957 = local1295;
											local1295 = "";
										} else {
											local957 = local1295.substring(0, local208);
											local1295 = local1295.substring(local208 + 2);
										}
										local210 = local1292.method559(local957);
										if (local210 > local158) {
											local158 = local210;
										}
										local160 += local1292.anInt797 + 1;
									}
									local158 += 6;
									local160 += 7;
									local208 = local82 + local77.anInt34 - 5 - local158;
									local210 = local87 + local77.anInt27 + 5;
									if (local208 < local82 + 5) {
										local208 = local82 + 5;
									}
									if (local208 + local158 > arg3 + arg1.anInt34) {
										local208 = arg3 + arg1.anInt34 - local158;
									}
									if (local210 + local160 > arg4 + arg1.anInt27) {
										local210 = arg4 + arg1.anInt27 - local160;
									}
									Class6_Sub1_Sub3.method549(local208, local158, local210, 16777120, local160);
									Class6_Sub1_Sub3.method550(local160, local158, local208, local210, 0, (byte) 1);
									local1295 = local77.aString3;
									local217 = local210 + local1292.anInt797 + 2;
									while (local1295.length() > 0) {
										local242 = local1295.indexOf("\\n");
										if (local242 == -1) {
											local957 = local1295;
											local1295 = "";
										} else {
											local957 = local1295.substring(0, local242);
											local1295 = local1295.substring(local242 + 2);
										}
										local1292.method565(local208 + 3, local957, local217, 0, this.anInt826, false);
										local217 += local1292.anInt797 + 1;
									}
								}
							}
						}
					}
				}
				@Pc(1477) int local1477 = 34 / arg2;
				Class6_Sub1_Sub3.method546(local29, local35, local31, local33);
			}
		} catch (@Pc(1485) RuntimeException local1485) {
			signlink.reporterror("31601, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local1485.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method618() {
		try {
			if (this.anInt965 == 0 && super.anInt819 == 1) {
				@Pc(23) int local23 = super.anInt820 - 25 - 550;
				@Pc(30) int local30 = super.anInt821 - 5 - 4;
				if (local23 >= 0 && local30 >= 0 && local23 < 146 && local30 < 151) {
					local23 -= 73;
					local30 -= 75;
					@Pc(50) int local50 = this.anInt1053 + this.anInt874 & 0x7FF;
					@Pc(54) int local54 = Class6_Sub1_Sub3_Sub1.anIntArray122[local50];
					@Pc(58) int local58 = Class6_Sub1_Sub3_Sub1.anIntArray123[local50];
					@Pc(67) int local67 = local54 * (this.anInt973 + 256) >> 8;
					@Pc(76) int local76 = local58 * (this.anInt973 + 256) >> 8;
					@Pc(86) int local86 = local30 * local67 + local23 * local76 >> 11;
					@Pc(96) int local96 = local30 * local76 - local23 * local67 >> 11;
					@Pc(103) int local103 = aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt583 + local86 >> 7;
					@Pc(110) int local110 = aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt584 - local96 >> 7;
					@Pc(131) boolean local131 = this.method598(local103, local110, 0, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0], 0, 1, 0, true, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0], 0, 0);
					if (local131) {
						this.aClass6_Sub1_Sub4_6.method229(local23);
						this.aClass6_Sub1_Sub4_6.method229(local30);
						this.aClass6_Sub1_Sub4_6.method230(this.anInt1053);
						this.aClass6_Sub1_Sub4_6.method229(57);
						this.aClass6_Sub1_Sub4_6.method229(this.anInt874);
						this.aClass6_Sub1_Sub4_6.method229(this.anInt973);
						this.aClass6_Sub1_Sub4_6.method229(89);
						this.aClass6_Sub1_Sub4_6.method230(aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt583);
						this.aClass6_Sub1_Sub4_6.method230(aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt584);
						this.aClass6_Sub1_Sub4_6.method229(this.anInt1034);
						this.aClass6_Sub1_Sub4_6.method229(63);
						return;
					}
				}
			}
		} catch (@Pc(185) RuntimeException local185) {
			signlink.reporterror("61727, " + -281 + ", " + local185.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method619(@OriginalArg(1) int arg0) {
		try {
			@Pc(2) Class1 local2 = Class1.method4(arg0);
			for (@Pc(4) int local4 = 0; local4 < local2.anIntArray5.length && local2.anIntArray5[local4] != -1; local4++) {
				@Pc(18) Class1 local18 = Class1.method4(local2.anIntArray5[local4]);
				if (local18.anInt33 == 1) {
					this.method619(local18.anInt8);
				}
				local18.anInt38 = 0;
				local18.anInt36 = 0;
			}
			if (58 != this.aByte66) {
				this.aClass40ArrayArrayArray1 = null;
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("77505, " + 58 + ", " + arg0 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)Z")
	private boolean method620() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("25188, " + -38 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method621() {
		try {
			try {
				@Pc(10) int local10 = aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt583 + this.anInt898;
				@Pc(16) int local16 = aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt584 + this.anInt833;
				if (this.anInt869 - local10 < -500 || this.anInt869 - local10 > 500 || this.anInt870 - local16 < -500 || this.anInt870 - local16 > 500) {
					this.anInt869 = local10;
					this.anInt870 = local16;
				}
				if (this.anInt869 != local10) {
					this.anInt869 += (local10 - this.anInt869) / 16;
				}
				if (this.anInt870 != local16) {
					this.anInt870 += (local16 - this.anInt870) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt1054 += (-24 - this.anInt1054) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt1054 += (24 - this.anInt1054) / 2;
				} else {
					this.anInt1054 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt1055 += (12 - this.anInt1055) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt1055 += (-12 - this.anInt1055) / 2;
				} else {
					this.anInt1055 /= 2;
				}
				this.anInt1053 = this.anInt1053 + this.anInt1054 / 2 & 0x7FF;
				this.anInt1052 += this.anInt1055 / 2;
				if (this.anInt1052 < 128) {
					this.anInt1052 = 128;
				}
				if (this.anInt1052 > 383) {
					this.anInt1052 = 383;
				}
				@Pc(203) int local203 = this.anInt869 >> 7;
				@Pc(208) int local208 = this.anInt870 >> 7;
				@Pc(218) int local218 = this.method635(this.anInt854, this.anInt870, this.anInt869);
				@Pc(220) int local220 = 0;
				@Pc(236) int local236;
				if (local203 > 3 && local208 > 3 && local203 < 100 && local208 < 100) {
					for (local236 = local203 - 4; local236 <= local203 + 4; local236++) {
						for (@Pc(242) int local242 = local208 - 4; local242 <= local208 + 4; local242++) {
							@Pc(247) int local247 = this.anInt854;
							if (local247 < 3 && (this.aByteArrayArrayArray8[1][local236][local242] & 0x2) == 2) {
								local247++;
							}
							@Pc(274) int local274 = local218 - this.anIntArrayArrayArray7[local247][local236][local242];
							if (local274 > local220) {
								local220 = local274;
							}
						}
					}
				}
				local236 = local220 * 192;
				if (local236 > 98048) {
					local236 = 98048;
				}
				if (local236 < 32768) {
					local236 = 32768;
				}
				if (local236 > this.anInt884) {
					this.anInt884 += (local236 - this.anInt884) / 24;
				} else if (local236 < this.anInt884) {
					this.anInt884 += (local236 - this.anInt884) / 80;
				}
			} catch (@Pc(338) Exception local338) {
				signlink.reporterror("glfc_ex " + aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt583 + "," + aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt584 + "," + this.anInt869 + "," + this.anInt870 + "," + this.anInt910 + "," + this.anInt911 + "," + this.anInt959 + "," + this.anInt960);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(388) RuntimeException local388) {
			signlink.reporterror("40562, " + 783 + ", " + local388.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!XOZCTLMB;)V")
	private void method622(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1_Sub2_Sub4 arg1) {
		try {
			this.method623(arg1.anInt583, arg0, arg1.anInt584);
			this.anInt1004 += 0;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("40986, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V")
	private void method623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg0 >= 128 && arg2 >= 128 && arg0 <= 13056 && arg2 <= 13056) {
				@Pc(37) int local37 = this.method635(this.anInt854, arg2, arg0) - arg1;
				@Pc(42) int local42 = arg0 - this.anInt1009;
				@Pc(47) int local47 = local37 - this.anInt1010;
				@Pc(52) int local52 = arg2 - this.anInt1011;
				@Pc(57) int local57 = Class6_Sub1_Sub2_Sub2.anIntArray69[this.anInt1012];
				@Pc(62) int local62 = Class6_Sub1_Sub2_Sub2.anIntArray70[this.anInt1012];
				@Pc(67) int local67 = Class6_Sub1_Sub2_Sub2.anIntArray69[this.anInt1013];
				@Pc(72) int local72 = Class6_Sub1_Sub2_Sub2.anIntArray70[this.anInt1013];
				@Pc(82) int local82 = local52 * local67 + local42 * local72 >> 16;
				@Pc(92) int local92 = local52 * local72 - local42 * local67 >> 16;
				@Pc(94) int local94 = local82;
				@Pc(104) int local104 = local47 * local62 - local92 * local57 >> 16;
				@Pc(114) int local114 = local47 * local57 + local92 * local62 >> 16;
				if (local114 >= 50) {
					this.anInt1000 = Class6_Sub1_Sub3_Sub1.anInt373 + (local94 << 9) / local114;
					this.anInt1001 = Class6_Sub1_Sub3_Sub1.anInt374 + (local104 << 9) / local114;
				} else {
					this.anInt1000 = -1;
					this.anInt1001 = -1;
				}
			} else {
				this.anInt1000 = -1;
				this.anInt1001 = -1;
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("41631, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method624(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			while (true) {
				@Pc(14) Class6_Sub1_Sub1 local14 = this.aClass30_Sub1_1.method288();
				if (local14 == null) {
					return;
				}
				if (local14.anInt67 == 0) {
					Class6_Sub1_Sub2_Sub2.method84(local14.anInt68, local14.aByteArray1);
					if ((this.aClass30_Sub1_1.method279(anInt978, local14.anInt68) & 0x62) != 0) {
						this.aBoolean238 = true;
						if (this.anInt979 != -1 || this.anInt976 != -1) {
							this.aBoolean252 = true;
						}
					}
				}
				if (local14.anInt67 == 1 && local14.aByteArray1 != null) {
					Class27.method182(local14.aByteArray1, this.aBoolean213);
				}
				if (local14.anInt67 == 2 && local14.anInt68 == this.anInt998 && local14.aByteArray1 != null) {
					this.method602(this.aBoolean246, local14.aByteArray1);
				}
				if (local14.anInt67 == 3 && this.anInt928 == 1) {
					for (@Pc(90) int local90 = 0; local90 < this.aByteArrayArray6.length; local90++) {
						if (this.anIntArray255[local90] == local14.anInt68) {
							this.aByteArrayArray6[local90] = local14.aByteArray1;
							if (local14.aByteArray1 == null) {
								this.anIntArray255[local90] = -1;
							}
							break;
						}
						if (this.anIntArray256[local90] == local14.anInt68) {
							this.aByteArrayArray5[local90] = local14.aByteArray1;
							if (local14.aByteArray1 == null) {
								this.anIntArray256[local90] = -1;
							}
							break;
						}
					}
				}
				if (local14.anInt67 == 93 && this.aClass30_Sub1_1.method290(local14.anInt68)) {
					Class7.method36(new Class6_Sub1_Sub4(888, local14.aByteArray1), this.aClass30_Sub1_1);
				}
			}
		} catch (@Pc(167) RuntimeException local167) {
			signlink.reporterror("48115, " + arg0 + ", " + local167.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	@Override
	protected void method586(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt963 = arg1;
			this.aString22 = arg0;
			this.method611();
			if (this.aClass43_2 == null) {
				super.method586(arg0, arg1);
			} else {
				this.aClass8_14.method43();
				this.aClass6_Sub1_Sub3_Sub4_4.method557("RuneScape is loading - please wait...", 180, 16777215, 54);
				Class6_Sub1_Sub3.method550(34, 304, 28, 62, 9179409, (byte) 1);
				Class6_Sub1_Sub3.method550(32, 302, 29, 63, 0, (byte) 1);
				Class6_Sub1_Sub3.method549(30, arg1 * 3, 64, 9179409, 30);
				Class6_Sub1_Sub3.method549(30 + arg1 * 3, 300 - arg1 * 3, 64, 0, 30);
				this.aClass6_Sub1_Sub3_Sub4_4.method557(arg0, 180, 16777215, 85);
				this.aClass8_14.method44(202, super.aGraphics2, 171);
				if (this.aBoolean244) {
					this.aBoolean244 = false;
					if (!this.aBoolean240) {
						this.aClass8_15.method44(0, super.aGraphics2, 0);
						this.aClass8_16.method44(637, super.aGraphics2, 0);
					}
					this.aClass8_12.method44(128, super.aGraphics2, 0);
					this.aClass8_13.method44(202, super.aGraphics2, 371);
					this.aClass8_17.method44(0, super.aGraphics2, 265);
					this.aClass8_18.method44(562, super.aGraphics2, 265);
					this.aClass8_19.method44(128, super.aGraphics2, 171);
					this.aClass8_20.method44(562, super.aGraphics2, 171);
				}
			}
		} catch (@Pc(214) RuntimeException local214) {
			signlink.reporterror("50991, " + arg0 + ", " + false + ", " + arg1 + ", " + local214.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!WQACZBNG;II)V")
	private void method625(@OriginalArg(1) Class6_Sub1_Sub3_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.anInt1004 += 0;
			@Pc(13) int local13 = arg2 * arg2 + arg1 * arg1;
			if (local13 > 4225 && local13 < 90000) {
				@Pc(27) int local27 = this.anInt1053 + this.anInt874 & 0x7FF;
				@Pc(31) int local31 = Class6_Sub1_Sub2_Sub2.anIntArray69[local27];
				@Pc(35) int local35 = Class6_Sub1_Sub2_Sub2.anIntArray70[local27];
				@Pc(44) int local44 = local31 * 256 / (this.anInt973 + 256);
				@Pc(53) int local53 = local35 * 256 / (this.anInt973 + 256);
				@Pc(63) int local63 = arg1 * local44 + arg2 * local53 >> 16;
				@Pc(73) int local73 = arg1 * local53 - arg2 * local44 >> 16;
				@Pc(79) double local79 = Math.atan2((double) local63, (double) local73);
				@Pc(85) int local85 = (int) (Math.sin(local79) * 63.0D);
				@Pc(91) int local91 = (int) (Math.cos(local79) * 57.0D);
				this.aClass6_Sub1_Sub3_Sub3_5.method511(83 - local91 - 20, 94 + local85 + 4 - 10, local79);
			} else {
				this.method596(arg2, arg0, arg1);
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("3434, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method626() {
		try {
			for (@Pc(6) Class6_Sub2 local6 = (Class6_Sub2) this.aClass40_11.method472(); local6 != null; local6 = (Class6_Sub2) this.aClass40_11.method474()) {
				if (local6.anInt199 == -1) {
					local6.anInt210 = 0;
					this.method609(local6);
				} else {
					local6.method542();
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("52460, " + 104 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method627() {
		try {
			this.aBoolean232 = true;
			for (@Pc(6) int local6 = 0; local6 < 7; local6++) {
				this.anIntArray233[local6] = -1;
				for (@Pc(15) int local15 = 0; local15 < Class48.anInt779; local15++) {
					if (!Class48.aClass48Array1[local15].aBoolean188 && Class48.aClass48Array1[local15].anInt780 == local6 + (this.aBoolean220 ? 0 : 7)) {
						this.anIntArray233[local6] = local15;
						break;
					}
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("4310, " + 11278 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BZ)V")
	private void method628(@OriginalArg(0) byte arg0, @OriginalArg(1) boolean arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt885; local1++) {
				@Pc(11) Class6_Sub1_Sub2_Sub4_Sub1 local11 = this.aClass6_Sub1_Sub2_Sub4_Sub1Array1[this.anIntArray227[local1]];
				@Pc(20) int local20 = 536870912 + (this.anIntArray227[local1] << 14);
				if (local11 != null && local11.method381() && local11.aClass20_1.aBoolean76 == arg1 && local11.aClass20_1.method146()) {
					@Pc(41) int local41 = local11.anInt583 >> 7;
					@Pc(46) int local46 = local11.anInt584 >> 7;
					if (local41 >= 0 && local41 < 104 && local46 >= 0 && local46 < 104) {
						if (local11.anInt577 == 1 && (local11.anInt583 & 0x7F) == 64 && (local11.anInt584 & 0x7F) == 64) {
							if (this.anIntArrayArray23[local41][local46] == this.anInt930) {
								continue;
							}
							this.anIntArrayArray23[local41][local46] = this.anInt930;
						}
						if (!local11.aClass20_1.aBoolean78) {
							local20 += Integer.MIN_VALUE;
						}
						this.aClass38_1.method408(local20, local11, local11.aBoolean143, this.anInt854, this.method635(this.anInt854, local11.anInt584, local11.anInt583), (local11.anInt577 - 1) * 64 + 60, local11.anInt583, local11.anInt585, local11.anInt584);
					}
				}
			}
			@Pc(141) boolean local141 = false;
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("47177, " + arg0 + ", " + arg1 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method629() {
		try {
			if (this.anInt1008 > 0) {
				this.method705();
			} else {
				this.method706("Please wait - attempting to reestablish", "Connection lost");
				this.anInt965 = 0;
				this.anInt1026 = 0;
				@Pc(26) Class37 local26 = this.aClass37_1;
				this.aBoolean243 = false;
				this.anInt846 = 0;
				this.method603(this.aString20, this.aString21, true);
				if (!this.aBoolean243) {
					this.method705();
				}
				try {
					local26.method390();
				} catch (@Pc(49) Exception local49) {
				}
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("97344, " + -50 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method630(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg1 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt843; local8++) {
					if (this.aLongArray3[local8] == arg1) {
						this.anInt843--;
						this.aBoolean238 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt843; local28++) {
							this.aLongArray3[local28] = this.aLongArray3[local28 + 1];
						}
						this.aClass6_Sub1_Sub4_6.method228(59);
						this.aClass6_Sub1_Sub4_6.method235(arg1);
						break;
					}
				}
				@Pc(66) boolean local66 = false;
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("62998, " + arg0 + ", " + arg1 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method631() {
		try {
			if (this.anInt1042 == 0 && this.anInt990 == 0) {
				this.aStringArray9[this.anInt890] = "Walk here";
				this.anIntArray218[this.anInt890] = 616;
				this.anIntArray216[this.anInt890] = super.anInt814;
				this.anIntArray217[this.anInt890] = super.anInt815;
				this.anInt890++;
			}
			@Pc(44) int local44 = -1;
			for (@Pc(46) int local46 = 0; local46 < Class6_Sub1_Sub2_Sub2.anInt160; local46++) {
				@Pc(52) int local52 = Class6_Sub1_Sub2_Sub2.anIntArray68[local46];
				@Pc(56) int local56 = local52 & 0x7F;
				@Pc(62) int local62 = local52 >> 7 & 0x7F;
				@Pc(68) int local68 = local52 >> 29 & 0x3;
				@Pc(74) int local74 = local52 >> 14 & 0x7FFF;
				if (local52 != local44) {
					local44 = local52;
					@Pc(221) int local221;
					if (local68 == 2 && this.aClass38_1.method427(this.anInt854, local56, local62, local52) >= 0) {
						@Pc(94) Class11 local94 = Class11.method60(local74);
						if (local94.anIntArray29 != null) {
							local94 = local94.method59();
						}
						if (local94 == null) {
							continue;
						}
						if (this.anInt1042 == 1) {
							this.aStringArray9[this.anInt890] = "Use " + this.aString31 + " with @cya@" + local94.aString7;
							this.anIntArray218[this.anInt890] = 804;
							this.anIntArray219[this.anInt890] = local52;
							this.anIntArray216[this.anInt890] = local56;
							this.anIntArray217[this.anInt890] = local62;
							this.anInt890++;
						} else if (this.anInt990 != 1) {
							if (local94.aStringArray3 != null) {
								for (local221 = 4; local221 >= 0; local221--) {
									if (local94.aStringArray3[local221] != null) {
										this.aStringArray9[this.anInt890] = local94.aStringArray3[local221] + " @cya@" + local94.aString7;
										if (local221 == 0) {
											this.anIntArray218[this.anInt890] = 513;
										}
										if (local221 == 1) {
											this.anIntArray218[this.anInt890] = 20;
										}
										if (local221 == 2) {
											this.anIntArray218[this.anInt890] = 155;
										}
										if (local221 == 3) {
											this.anIntArray218[this.anInt890] = 826;
										}
										if (local221 == 4) {
											this.anIntArray218[this.anInt890] = 1234;
										}
										this.anIntArray219[this.anInt890] = local52;
										this.anIntArray216[this.anInt890] = local56;
										this.anIntArray217[this.anInt890] = local62;
										this.anInt890++;
									}
								}
							}
							this.aStringArray9[this.anInt890] = "Examine @cya@" + local94.aString7;
							this.anIntArray218[this.anInt890] = 1420;
							this.anIntArray219[this.anInt890] = local94.anInt121 << 14;
							this.anIntArray216[this.anInt890] = local56;
							this.anIntArray217[this.anInt890] = local62;
							this.anInt890++;
						} else if ((this.anInt992 & 0x4) == 4) {
							this.aStringArray9[this.anInt890] = this.aString29 + " @cya@" + local94.aString7;
							this.anIntArray218[this.anInt890] = 652;
							this.anIntArray219[this.anInt890] = local52;
							this.anIntArray216[this.anInt890] = local56;
							this.anIntArray217[this.anInt890] = local62;
							this.anInt890++;
						}
					}
					@Pc(401) Class6_Sub1_Sub2_Sub4_Sub1 local401;
					@Pc(449) Class6_Sub1_Sub2_Sub4_Sub2 local449;
					@Pc(439) int local439;
					if (local68 == 1) {
						@Pc(372) Class6_Sub1_Sub2_Sub4_Sub1 local372 = this.aClass6_Sub1_Sub2_Sub4_Sub1Array1[local74];
						if (local372.aClass20_1.aByte22 == 1 && (local372.anInt583 & 0x7F) == 64 && (local372.anInt584 & 0x7F) == 64) {
							for (local221 = 0; local221 < this.anInt885; local221++) {
								local401 = this.aClass6_Sub1_Sub2_Sub4_Sub1Array1[this.anIntArray227[local221]];
								if (local401 != null && local401 != local372 && local401.aClass20_1.aByte22 == 1 && local401.anInt583 == local372.anInt583 && local401.anInt584 == local372.anInt584) {
									this.method679(local56, local401.aClass20_1, this.anIntArray227[local221], local62);
								}
							}
							for (local439 = 0; local439 < this.anInt987; local439++) {
								local449 = this.aClass6_Sub1_Sub2_Sub4_Sub2Array1[this.anIntArray251[local439]];
								if (local449 != null && local449.anInt583 == local372.anInt583 && local449.anInt584 == local372.anInt584) {
									this.method667(259, local62, local449, this.anIntArray251[local439], local56);
								}
							}
						}
						this.method679(local56, local372.aClass20_1, local74, local62);
					}
					if (local68 == 0) {
						@Pc(491) Class6_Sub1_Sub2_Sub4_Sub2 local491 = this.aClass6_Sub1_Sub2_Sub4_Sub2Array1[local74];
						if ((local491.anInt583 & 0x7F) == 64 && (local491.anInt584 & 0x7F) == 64) {
							for (local221 = 0; local221 < this.anInt885; local221++) {
								local401 = this.aClass6_Sub1_Sub2_Sub4_Sub1Array1[this.anIntArray227[local221]];
								if (local401 != null && local401.aClass20_1.aByte22 == 1 && local401.anInt583 == local491.anInt583 && local401.anInt584 == local491.anInt584) {
									this.method679(local56, local401.aClass20_1, this.anIntArray227[local221], local62);
								}
							}
							for (local439 = 0; local439 < this.anInt987; local439++) {
								local449 = this.aClass6_Sub1_Sub2_Sub4_Sub2Array1[this.anIntArray251[local439]];
								if (local449 != null && local449 != local491 && local449.anInt583 == local491.anInt583 && local449.anInt584 == local491.anInt584) {
									this.method667(259, local62, local449, this.anIntArray251[local439], local56);
								}
							}
						}
						this.method667(259, local62, local491, local74, local56);
					}
					if (local68 == 3) {
						@Pc(610) Class40 local610 = this.aClass40ArrayArrayArray1[this.anInt854][local56][local62];
						if (local610 != null) {
							for (@Pc(617) Class6_Sub1_Sub2_Sub5 local617 = (Class6_Sub1_Sub2_Sub5) local610.method473(); local617 != null; local617 = (Class6_Sub1_Sub2_Sub5) local610.method475(this.aByte68)) {
								@Pc(623) Class35 local623 = Class35.method370(local617.anInt704);
								if (this.anInt1042 == 1) {
									this.aStringArray9[this.anInt890] = "Use " + this.aString31 + " with @lre@" + local623.aString14;
									this.anIntArray218[this.anInt890] = 417;
									this.anIntArray219[this.anInt890] = local617.anInt704;
									this.anIntArray216[this.anInt890] = local56;
									this.anIntArray217[this.anInt890] = local62;
									this.anInt890++;
								} else if (this.anInt990 != 1) {
									for (@Pc(740) int local740 = 4; local740 >= 0; local740--) {
										if (local623.aStringArray7 != null && local623.aStringArray7[local740] != null) {
											this.aStringArray9[this.anInt890] = local623.aStringArray7[local740] + " @lre@" + local623.aString14;
											if (local740 == 0) {
												this.anIntArray218[this.anInt890] = 108;
											}
											if (local740 == 1) {
												this.anIntArray218[this.anInt890] = 715;
											}
											if (local740 == 2) {
												this.anIntArray218[this.anInt890] = 764;
											}
											if (local740 == 3) {
												this.anIntArray218[this.anInt890] = 330;
											}
											if (local740 == 4) {
												this.anIntArray218[this.anInt890] = 21;
											}
											this.anIntArray219[this.anInt890] = local617.anInt704;
											this.anIntArray216[this.anInt890] = local56;
											this.anIntArray217[this.anInt890] = local62;
											this.anInt890++;
										} else if (local740 == 2) {
											this.aStringArray9[this.anInt890] = "Take @lre@" + local623.aString14;
											this.anIntArray218[this.anInt890] = 764;
											this.anIntArray219[this.anInt890] = local617.anInt704;
											this.anIntArray216[this.anInt890] = local56;
											this.anIntArray217[this.anInt890] = local62;
											this.anInt890++;
										}
									}
									this.aStringArray9[this.anInt890] = "Examine @lre@" + local623.aString14;
									this.anIntArray218[this.anInt890] = 1663;
									this.anIntArray219[this.anInt890] = local617.anInt704;
									this.anIntArray216[this.anInt890] = local56;
									this.anIntArray217[this.anInt890] = local62;
									this.anInt890++;
								} else if ((this.anInt992 & 0x1) == 1) {
									this.aStringArray9[this.anInt890] = this.aString29 + " @lre@" + local623.aString14;
									this.anIntArray218[this.anInt890] = 712;
									this.anIntArray219[this.anInt890] = local617.anInt704;
									this.anIntArray216[this.anInt890] = local56;
									this.anIntArray217[this.anInt890] = local62;
									this.anInt890++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(948) RuntimeException local948) {
			signlink.reporterror("53611, " + 0 + ", " + local948.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[BI)Z")
	private boolean method632(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			return arg0 == null ? true : signlink.wavesave(arg0, arg1);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("75622, " + -35761 + ", " + arg0 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean233) {
			this.method605();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method634() {
		try {
			if (super.aClass8_2 == null) {
				this.method710();
				this.aClass8_12 = null;
				this.aClass8_13 = null;
				this.aClass8_14 = null;
				this.aClass8_15 = null;
				this.aClass8_16 = null;
				this.aClass8_17 = null;
				this.aClass8_18 = null;
				this.aClass8_19 = null;
				this.aClass8_20 = null;
				this.aClass8_24 = null;
				this.aClass8_22 = null;
				this.aClass8_21 = null;
				this.aClass8_23 = null;
				this.aClass8_25 = null;
				this.aClass8_26 = null;
				this.aClass8_27 = null;
				super.aClass8_2 = new Class8(503, 765, this.method584(), 384);
				this.aBoolean244 = true;
				if (-68 != this.aByte62) {
					this.aBoolean215 = !this.aBoolean215;
				}
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("71356, " + -68 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)I")
	private int method635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = arg2 >> 7;
			@Pc(7) int local7 = arg1 >> 7;
			if (local3 < 0 || local7 < 0 || local3 > 103 || local7 > 103) {
				return 0;
			}
			@Pc(27) int local27 = arg0;
			if (arg0 < 3 && (this.aByteArrayArrayArray8[1][local3][local7] & 0x2) == 2) {
				local27 = arg0 + 1;
			}
			@Pc(47) int local47 = arg2 & 0x7F;
			@Pc(51) int local51 = arg1 & 0x7F;
			@Pc(79) int local79 = this.anIntArrayArrayArray7[local27][local3][local7] * (128 - local47) + this.anIntArrayArrayArray7[local27][local3 + 1][local7] * local47 >> 7;
			@Pc(111) int local111 = this.anIntArrayArrayArray7[local27][local3][local7 + 1] * (128 - local47) + this.anIntArrayArrayArray7[local27][local3 + 1][local7 + 1] * local47 >> 7;
			return local79 * (128 - local51) + local111 * local51 >> 7;
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("10192, " + arg0 + ", " + arg1 + ", " + 6 + ", " + arg2 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class40 local9 = this.aClass40ArrayArrayArray1[this.anInt854][arg0][arg1];
		if (local9 == null) {
			this.aClass38_1.method418(this.anInt854, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class6_Sub1_Sub2_Sub5 local23 = null;
		@Pc(27) Class6_Sub1_Sub2_Sub5 local27;
		for (local27 = (Class6_Sub1_Sub2_Sub5) local9.method472(); local27 != null; local27 = (Class6_Sub1_Sub2_Sub5) local9.method474()) {
			@Pc(32) Class35 local32 = Class35.method370(local27.anInt704);
			@Pc(35) int local35 = local32.anInt548;
			if (local32.aBoolean139) {
				local35 *= local27.anInt705 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method470(local23);
		@Pc(65) Class6_Sub1_Sub2_Sub5 local65 = null;
		@Pc(67) Class6_Sub1_Sub2_Sub5 local67 = null;
		for (local27 = (Class6_Sub1_Sub2_Sub5) local9.method472(); local27 != null; local27 = (Class6_Sub1_Sub2_Sub5) local9.method474()) {
			if (local27.anInt704 != local23.anInt704 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt704 != local23.anInt704 && local27.anInt704 != local65.anInt704 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass38_1.method404(this.anInt854, arg0, this.method635(this.anInt854, arg1 * 128 + 64, arg0 * 128 + 64), local65, local110, arg1, local23, local67);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JZ)V")
	private void method637(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt843 >= 100) {
					this.method670("Your ignore list is full. Max of 100 hit", "", 0);
				} else {
					@Pc(23) String local23 = Class41.method485(Class41.method482(arg0, (byte) 7));
					for (@Pc(25) int local25 = 0; local25 < this.anInt843; local25++) {
						if (this.aLongArray3[local25] == arg0) {
							this.method670(local23 + " is already on your ignore list", "", 0);
							return;
						}
					}
					for (@Pc(55) int local55 = 0; local55 < this.anInt827; local55++) {
						if (this.aLongArray4[local55] == arg0) {
							this.method670("Please remove " + local23 + " from your friend list first", "", 0);
							return;
						}
					}
					this.aLongArray3[this.anInt843++] = arg0;
					this.aBoolean238 = true;
					this.aClass6_Sub1_Sub4_6.method228(129);
					this.aClass6_Sub1_Sub4_6.method235(arg0);
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("40311, " + arg0 + ", " + false + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method638() {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt885; local1++) {
				@Pc(8) int local8 = this.anIntArray227[local1];
				@Pc(13) Class6_Sub1_Sub2_Sub4_Sub1 local13 = this.aClass6_Sub1_Sub2_Sub4_Sub1Array1[local8];
				if (local13 != null) {
					this.method639(local13.aClass20_1.aByte22, local13);
				}
			}
			if (9 != this.anInt970) {
				this.anInt1005 = this.aClass6_Sub1_Sub4_7.method239();
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("81810, " + 9 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!XOZCTLMB;I)V")
	private void method639(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub1_Sub2_Sub4 arg1) {
		try {
			if (arg1.anInt583 < 128 || arg1.anInt584 < 128 || arg1.anInt583 >= 13184 || arg1.anInt584 >= 13184) {
				arg1.anInt609 = -1;
				arg1.anInt592 = -1;
				arg1.anInt574 = 0;
				arg1.anInt575 = 0;
				arg1.anInt583 = arg1.anIntArray169[0] * 128 + arg1.anInt577 * 64;
				arg1.anInt584 = arg1.anIntArray170[0] * 128 + arg1.anInt577 * 64;
				arg1.method378();
			}
			if (arg1 == aClass6_Sub1_Sub2_Sub4_Sub2_1 && (arg1.anInt583 < 1536 || arg1.anInt584 < 1536 || arg1.anInt583 >= 11776 || arg1.anInt584 >= 11776)) {
				arg1.anInt609 = -1;
				arg1.anInt592 = -1;
				arg1.anInt574 = 0;
				arg1.anInt575 = 0;
				arg1.anInt583 = arg1.anIntArray169[0] * 128 + arg1.anInt577 * 64;
				arg1.anInt584 = arg1.anIntArray170[0] * 128 + arg1.anInt577 * 64;
				arg1.method378();
			}
			if (arg1.anInt574 > anInt1041) {
				this.method640(arg1);
			} else if (arg1.anInt575 >= anInt1041) {
				this.method641(arg1);
			} else {
				this.method642(arg1);
			}
			this.method643(arg1, 786);
			this.method644(arg1);
		} catch (@Pc(156) RuntimeException local156) {
			signlink.reporterror("33610, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local156.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!XOZCTLMB;I)V")
	private void method640(@OriginalArg(0) Class6_Sub1_Sub2_Sub4 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt574 - anInt1041;
			@Pc(14) int local14 = arg0.anInt570 * 128 + arg0.anInt577 * 64;
			@Pc(24) int local24 = arg0.anInt572 * 128 + arg0.anInt577 * 64;
			arg0.anInt583 += (local14 - arg0.anInt583) / local4;
			this.anInt1004 += 0;
			arg0.anInt584 += (local24 - arg0.anInt584) / local4;
			arg0.anInt590 = 0;
			if (arg0.anInt576 == 0) {
				arg0.anInt578 = 1024;
			}
			if (arg0.anInt576 == 1) {
				arg0.anInt578 = 1536;
			}
			if (arg0.anInt576 == 2) {
				arg0.anInt578 = 0;
			}
			if (arg0.anInt576 == 3) {
				arg0.anInt578 = 512;
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("19075, " + arg0 + ", " + 0 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!XOZCTLMB;)V")
	private void method641(@OriginalArg(1) Class6_Sub1_Sub2_Sub4 arg0) {
		try {
			if (arg0.anInt575 == anInt1041 || arg0.anInt609 == -1 || arg0.anInt612 != 0 || arg0.anInt611 + 1 > Class2.aClass2Array1[arg0.anInt609].method12(arg0.anInt610, 214)) {
				@Pc(36) int local36 = arg0.anInt575 - arg0.anInt574;
				@Pc(41) int local41 = anInt1041 - arg0.anInt574;
				@Pc(51) int local51 = arg0.anInt570 * 128 + arg0.anInt577 * 64;
				@Pc(61) int local61 = arg0.anInt572 * 128 + arg0.anInt577 * 64;
				@Pc(71) int local71 = arg0.anInt571 * 128 + arg0.anInt577 * 64;
				@Pc(81) int local81 = arg0.anInt573 * 128 + arg0.anInt577 * 64;
				arg0.anInt583 = (local51 * (local36 - local41) + local71 * local41) / local36;
				arg0.anInt584 = (local61 * (local36 - local41) + local81 * local41) / local36;
			}
			arg0.anInt590 = 0;
			if (arg0.anInt576 == 0) {
				arg0.anInt578 = 1024;
			}
			if (arg0.anInt576 == 1) {
				arg0.anInt578 = 1536;
			}
			if (arg0.anInt576 == 2) {
				arg0.anInt578 = 0;
			}
			if (arg0.anInt576 == 3) {
				arg0.anInt578 = 512;
			}
			arg0.anInt585 = arg0.anInt578;
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("84663, " + 3 + ", " + arg0 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!XOZCTLMB;)V")
	private void method642(@OriginalArg(1) Class6_Sub1_Sub2_Sub4 arg0) {
		try {
			arg0.anInt587 = arg0.anInt599;
			if (arg0.anInt597 == 0) {
				arg0.anInt590 = 0;
			} else {
				if (arg0.anInt609 != -1 && arg0.anInt612 == 0) {
					@Pc(24) Class2 local24 = Class2.aClass2Array1[arg0.anInt609];
					if (arg0.anInt607 > 0 && local24.anInt46 == 0) {
						arg0.anInt590++;
						return;
					}
					if (arg0.anInt607 <= 0 && local24.anInt47 == 0) {
						arg0.anInt590++;
						return;
					}
				}
				@Pc(53) int local53 = arg0.anInt583;
				@Pc(56) int local56 = arg0.anInt584;
				@Pc(74) int local74 = arg0.anIntArray169[arg0.anInt597 - 1] * 128 + arg0.anInt577 * 64;
				@Pc(89) int local89 = arg0.anIntArray170[arg0.anInt597 - 1] * 128 + arg0.anInt577 * 64;
				if (local74 - local53 <= 256 && local74 - local53 >= -256 && local89 - local56 <= 256 && local89 - local56 >= -256) {
					if (local53 < local74) {
						if (local56 < local89) {
							arg0.anInt578 = 1280;
						} else if (local56 > local89) {
							arg0.anInt578 = 1792;
						} else {
							arg0.anInt578 = 1536;
						}
					} else if (local53 > local74) {
						if (local56 < local89) {
							arg0.anInt578 = 768;
						} else if (local56 > local89) {
							arg0.anInt578 = 256;
						} else {
							arg0.anInt578 = 512;
						}
					} else if (local56 < local89) {
						arg0.anInt578 = 1024;
					} else {
						arg0.anInt578 = 0;
					}
					@Pc(183) int local183 = arg0.anInt578 - arg0.anInt585 & 0x7FF;
					if (local183 > 1024) {
						local183 -= 2048;
					}
					@Pc(190) int local190 = arg0.anInt580;
					if (local183 >= -256 && local183 <= 256) {
						local190 = arg0.anInt579;
					} else if (local183 >= 256 && local183 < 768) {
						local190 = arg0.anInt582;
					} else if (local183 >= -768 && local183 <= -256) {
						local190 = arg0.anInt581;
					}
					if (local190 == -1) {
						local190 = arg0.anInt579;
					}
					arg0.anInt587 = local190;
					@Pc(232) int local232 = 4;
					if (arg0.anInt585 != arg0.anInt578 && arg0.anInt591 == -1 && arg0.anInt586 != 0) {
						local232 = 2;
					}
					if (arg0.anInt597 > 2) {
						local232 = 6;
					}
					if (arg0.anInt597 > 3) {
						local232 = 8;
					}
					if (arg0.anInt590 > 0 && arg0.anInt597 > 1) {
						local232 = 8;
						arg0.anInt590--;
					}
					if (arg0.aBooleanArray10[arg0.anInt597 - 1]) {
						local232 <<= 0x1;
					}
					if (local232 >= 8 && arg0.anInt587 == arg0.anInt579 && arg0.anInt614 != -1) {
						arg0.anInt587 = arg0.anInt614;
					}
					if (local53 < local74) {
						arg0.anInt583 += local232;
						if (arg0.anInt583 > local74) {
							arg0.anInt583 = local74;
						}
					} else if (local53 > local74) {
						arg0.anInt583 -= local232;
						if (arg0.anInt583 < local74) {
							arg0.anInt583 = local74;
						}
					}
					if (local56 < local89) {
						arg0.anInt584 += local232;
						if (arg0.anInt584 > local89) {
							arg0.anInt584 = local89;
						}
					} else if (local56 > local89) {
						arg0.anInt584 -= local232;
						if (arg0.anInt584 < local89) {
							arg0.anInt584 = local89;
						}
					}
					if (arg0.anInt583 == local74 && arg0.anInt584 == local89) {
						arg0.anInt597--;
						if (arg0.anInt607 > 0) {
							arg0.anInt607--;
							return;
						}
					}
				} else {
					arg0.anInt583 = local74;
					arg0.anInt584 = local89;
				}
			}
		} catch (@Pc(394) RuntimeException local394) {
			signlink.reporterror("25274, " + false + ", " + arg0 + ", " + local394.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!XOZCTLMB;I)V")
	private void method643(@OriginalArg(0) Class6_Sub1_Sub2_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) boolean local5 = false;
			if (arg0.anInt586 != 0) {
				@Pc(31) int local31;
				@Pc(37) int local37;
				if (arg0.anInt591 != -1 && arg0.anInt591 < 32768) {
					@Pc(23) Class6_Sub1_Sub2_Sub4_Sub1 local23 = this.aClass6_Sub1_Sub2_Sub4_Sub1Array1[arg0.anInt591];
					if (local23 != null) {
						local31 = arg0.anInt583 - local23.anInt583;
						local37 = arg0.anInt584 - local23.anInt584;
						if (local31 != 0 || local37 != 0) {
							arg0.anInt578 = (int) (Math.atan2((double) local31, (double) local37) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(62) int local62;
				if (arg0.anInt591 >= 32768) {
					local62 = arg0.anInt591 - 32768;
					if (local62 == this.anInt848) {
						local62 = this.anInt986;
					}
					@Pc(74) Class6_Sub1_Sub2_Sub4_Sub2 local74 = this.aClass6_Sub1_Sub2_Sub4_Sub2Array1[local62];
					if (local74 != null) {
						local37 = arg0.anInt583 - local74.anInt583;
						@Pc(88) int local88 = arg0.anInt584 - local74.anInt584;
						if (local37 != 0 || local88 != 0) {
							arg0.anInt578 = (int) (Math.atan2((double) local37, (double) local88) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt603 != 0 || arg0.anInt604 != 0) && (arg0.anInt597 == 0 || arg0.anInt590 > 0)) {
					local62 = arg0.anInt583 - (arg0.anInt603 - this.anInt959 - this.anInt959) * 64;
					local31 = arg0.anInt584 - (arg0.anInt604 - this.anInt960 - this.anInt960) * 64;
					if (local62 != 0 || local31 != 0) {
						arg0.anInt578 = (int) (Math.atan2((double) local62, (double) local31) * 325.949D) & 0x7FF;
					}
					arg0.anInt603 = 0;
					arg0.anInt604 = 0;
				}
				local62 = arg0.anInt578 - arg0.anInt585 & 0x7FF;
				if (local62 != 0) {
					if (local62 < arg0.anInt586 || local62 > 2048 - arg0.anInt586) {
						arg0.anInt585 = arg0.anInt578;
					} else if (local62 > 1024) {
						arg0.anInt585 -= arg0.anInt586;
					} else {
						arg0.anInt585 += arg0.anInt586;
					}
					arg0.anInt585 &= 0x7FF;
					if (arg0.anInt587 == arg0.anInt599 && arg0.anInt585 != arg0.anInt578) {
						if (arg0.anInt600 != -1) {
							arg0.anInt587 = arg0.anInt600;
							return;
						}
						arg0.anInt587 = arg0.anInt579;
						return;
					}
				}
			}
		} catch (@Pc(242) RuntimeException local242) {
			signlink.reporterror("82598, " + arg0 + ", " + arg1 + ", " + local242.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!XOZCTLMB;)V")
	private void method644(@OriginalArg(1) Class6_Sub1_Sub2_Sub4 arg0) {
		try {
			arg0.aBoolean143 = false;
			@Pc(18) Class2 local18;
			if (arg0.anInt587 != -1) {
				local18 = Class2.aClass2Array1[arg0.anInt587];
				arg0.anInt589++;
				if (arg0.anInt588 < local18.anInt40 && arg0.anInt589 > local18.method12(arg0.anInt588, 214)) {
					arg0.anInt589 = 1;
					arg0.anInt588++;
				}
				if (arg0.anInt588 >= local18.anInt40) {
					arg0.anInt589 = 1;
					arg0.anInt588 = 0;
				}
			}
			if (arg0.anInt592 != -1 && anInt1041 >= arg0.anInt595) {
				if (arg0.anInt593 < 0) {
					arg0.anInt593 = 0;
				}
				local18 = Class28.aClass28Array1[arg0.anInt592].aClass2_2;
				arg0.anInt594++;
				if (arg0.anInt593 < local18.anInt40 && arg0.anInt594 > local18.method12(arg0.anInt593, 214)) {
					arg0.anInt594 = 1;
					arg0.anInt593++;
				}
				if (arg0.anInt593 >= local18.anInt40 && (arg0.anInt593 < 0 || arg0.anInt593 >= local18.anInt40)) {
					arg0.anInt592 = -1;
				}
			}
			if (arg0.anInt609 != -1 && arg0.anInt612 <= 1) {
				local18 = Class2.aClass2Array1[arg0.anInt609];
				if (local18.anInt46 == 1 && arg0.anInt607 > 0 && arg0.anInt574 <= anInt1041 && arg0.anInt575 < anInt1041) {
					arg0.anInt612 = 1;
					return;
				}
			}
			if (arg0.anInt609 != -1 && arg0.anInt612 == 0) {
				local18 = Class2.aClass2Array1[arg0.anInt609];
				arg0.anInt611++;
				if (arg0.anInt610 < local18.anInt40 && arg0.anInt611 > local18.method12(arg0.anInt610, 214)) {
					arg0.anInt611 = 1;
					arg0.anInt610++;
				}
				if (arg0.anInt610 >= local18.anInt40) {
					arg0.anInt610 -= local18.anInt41;
					arg0.anInt613++;
					if (arg0.anInt613 >= local18.anInt45) {
						arg0.anInt609 = -1;
					}
					if (arg0.anInt610 < 0 || arg0.anInt610 >= local18.anInt40) {
						arg0.anInt609 = -1;
					}
				}
				arg0.aBoolean143 = local18.aBoolean11;
			}
			if (arg0.anInt612 > 0) {
				arg0.anInt612--;
			}
		} catch (@Pc(245) RuntimeException local245) {
			signlink.reporterror("11623, " + -918 + ", " + arg0 + ", " + local245.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method645() {
		try {
			if (this.anInt879 == -1 || this.anInt928 != 2 && super.aClass8_2 == null) {
				if (this.aBoolean244) {
					this.method660();
					this.aBoolean244 = false;
					this.aClass8_3.method44(0, super.aGraphics2, 4);
					this.aClass8_4.method44(0, super.aGraphics2, 357);
					this.aClass8_5.method44(722, super.aGraphics2, 4);
					this.aClass8_6.method44(743, super.aGraphics2, 205);
					this.aClass8_7.method44(0, super.aGraphics2, 0);
					this.aClass8_8.method44(516, super.aGraphics2, 4);
					this.aClass8_9.method44(516, super.aGraphics2, 205);
					this.aClass8_10.method44(496, super.aGraphics2, 357);
					this.aClass8_11.method44(0, super.aGraphics2, 338);
					this.aBoolean238 = true;
					this.aBoolean252 = true;
					this.aBoolean219 = true;
					this.aBoolean231 = true;
					if (this.anInt928 != 2) {
						this.aClass8_23.method44(4, super.aGraphics2, 4);
						this.aClass8_22.method44(550, super.aGraphics2, 4);
					}
				}
				if (this.anInt928 == 2) {
					this.method712(this.anInt845);
				}
				if (this.aBoolean217 && this.anInt919 == 1) {
					this.aBoolean238 = true;
				}
				@Pc(280) boolean local280;
				if (this.anInt868 != -1) {
					local280 = this.method668(this.anInt880, this.anInt868);
					if (local280) {
						this.aBoolean238 = true;
					}
				}
				if (this.anInt889 == 2) {
					this.aBoolean238 = true;
				}
				if (this.anInt1023 == 2) {
					this.aBoolean238 = true;
				}
				if (this.aBoolean238) {
					this.method646();
					this.aBoolean238 = false;
				}
				@Pc(365) int local365;
				if (this.anInt979 == -1 && this.anInt1018 == 0) {
					this.aClass1_1.anInt32 = this.anInt999 - this.anInt935 - 77;
					if (super.anInt814 > 448 && super.anInt814 < 560 && super.anInt815 > 332) {
						this.method657(77, super.anInt815 - 357, -1, this.aClass1_1, super.anInt814 - 17, this.anInt999, 463, (byte) 9, 0);
					}
					local365 = this.anInt999 - 77 - this.aClass1_1.anInt32;
					if (local365 < 0) {
						local365 = 0;
					}
					if (local365 > this.anInt999 - 77) {
						local365 = this.anInt999 - 77;
					}
					if (this.anInt935 != local365) {
						this.anInt935 = local365;
						this.aBoolean252 = true;
					}
				}
				if (this.anInt979 == -1 && this.anInt1018 == 3) {
					local365 = this.anInt849 * 14 + 7;
					this.aClass1_1.anInt32 = this.anInt850;
					if (super.anInt814 > 448 && super.anInt814 < 560 && super.anInt815 > 332) {
						this.method657(77, super.anInt815 - 357, -1, this.aClass1_1, super.anInt814 - 17, local365, 463, (byte) 9, 0);
					}
					@Pc(444) int local444 = this.aClass1_1.anInt32;
					if (local444 < 0) {
						local444 = 0;
					}
					if (local444 > local365 - 77) {
						local444 = local365 - 77;
					}
					if (this.anInt850 != local444) {
						this.anInt850 = local444;
						this.aBoolean252 = true;
					}
				}
				if (this.anInt979 != -1) {
					local280 = this.method668(this.anInt880, this.anInt979);
					if (local280) {
						this.aBoolean252 = true;
					}
				}
				if (this.anInt889 == 3) {
					this.aBoolean252 = true;
				}
				if (this.anInt1023 == 3) {
					this.aBoolean252 = true;
				}
				if (this.aString23 != null) {
					this.aBoolean252 = true;
				}
				if (this.aBoolean217 && this.anInt919 == 2) {
					this.aBoolean252 = true;
				}
				if (this.aBoolean252) {
					this.method680();
					this.aBoolean252 = false;
				}
				if (this.anInt928 == 2) {
					this.method663();
					this.aClass8_22.method44(550, super.aGraphics2, 4);
					anInt941++;
					if (anInt941 > 1246) {
						anInt941 = 0;
						this.aClass6_Sub1_Sub4_6.method228(232);
						this.aClass6_Sub1_Sub4_6.method229(0);
						local365 = this.aClass6_Sub1_Sub4_6.anInt390;
						this.aClass6_Sub1_Sub4_6.method230(23861);
						this.aClass6_Sub1_Sub4_6.method229(28);
						this.aClass6_Sub1_Sub4_6.method230(63549);
						this.aClass6_Sub1_Sub4_6.method229(30);
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass6_Sub1_Sub4_6.method230(30108);
						}
						this.aClass6_Sub1_Sub4_6.method229((int) (Math.random() * 256.0D));
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass6_Sub1_Sub4_6.method229(7);
						}
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass6_Sub1_Sub4_6.method230(23140);
						}
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass6_Sub1_Sub4_6.method229(247);
						}
						this.aClass6_Sub1_Sub4_6.method230(43120);
						this.aClass6_Sub1_Sub4_6.method238(this.aClass6_Sub1_Sub4_6.anInt390 - local365);
					}
				}
				if (this.anInt1038 != -1) {
					this.aBoolean219 = true;
				}
				if (this.aBoolean219) {
					if (this.anInt1038 != -1 && this.anInt1038 == this.anInt1016) {
						this.anInt1038 = -1;
						this.aClass6_Sub1_Sub4_6.method228(242);
						this.aClass6_Sub1_Sub4_6.method229(this.anInt1016);
					}
					this.aBoolean219 = false;
					this.aClass8_27.method43();
					this.aClass6_Sub1_Sub3_Sub2_5.method467(0, 0, this.anInt1040);
					if (this.anInt868 == -1) {
						if (this.anIntArray267[this.anInt1016] != -1) {
							if (this.anInt1016 == 0) {
								this.aClass6_Sub1_Sub3_Sub2_16.method467(10, 22, this.anInt1040);
							}
							if (this.anInt1016 == 1) {
								this.aClass6_Sub1_Sub3_Sub2_17.method467(8, 54, this.anInt1040);
							}
							if (this.anInt1016 == 2) {
								this.aClass6_Sub1_Sub3_Sub2_17.method467(8, 82, this.anInt1040);
							}
							if (this.anInt1016 == 3) {
								this.aClass6_Sub1_Sub3_Sub2_18.method467(8, 110, this.anInt1040);
							}
							if (this.anInt1016 == 4) {
								this.aClass6_Sub1_Sub3_Sub2_20.method467(8, 153, this.anInt1040);
							}
							if (this.anInt1016 == 5) {
								this.aClass6_Sub1_Sub3_Sub2_20.method467(8, 181, this.anInt1040);
							}
							if (this.anInt1016 == 6) {
								this.aClass6_Sub1_Sub3_Sub2_19.method467(9, 209, this.anInt1040);
							}
						}
						if (this.anIntArray267[0] != -1 && (this.anInt1038 != 0 || anInt1041 % 20 < 10)) {
							this.aClass6_Sub1_Sub3_Sub2Array4[0].method467(13, 29, this.anInt1040);
						}
						if (this.anIntArray267[1] != -1 && (this.anInt1038 != 1 || anInt1041 % 20 < 10)) {
							this.aClass6_Sub1_Sub3_Sub2Array4[1].method467(11, 53, this.anInt1040);
						}
						if (this.anIntArray267[2] != -1 && (this.anInt1038 != 2 || anInt1041 % 20 < 10)) {
							this.aClass6_Sub1_Sub3_Sub2Array4[2].method467(11, 82, this.anInt1040);
						}
						if (this.anIntArray267[3] != -1 && (this.anInt1038 != 3 || anInt1041 % 20 < 10)) {
							this.aClass6_Sub1_Sub3_Sub2Array4[3].method467(12, 115, this.anInt1040);
						}
						if (this.anIntArray267[4] != -1 && (this.anInt1038 != 4 || anInt1041 % 20 < 10)) {
							this.aClass6_Sub1_Sub3_Sub2Array4[4].method467(13, 153, this.anInt1040);
						}
						if (this.anIntArray267[5] != -1 && (this.anInt1038 != 5 || anInt1041 % 20 < 10)) {
							this.aClass6_Sub1_Sub3_Sub2Array4[5].method467(11, 180, this.anInt1040);
						}
						if (this.anIntArray267[6] != -1 && (this.anInt1038 != 6 || anInt1041 % 20 < 10)) {
							this.aClass6_Sub1_Sub3_Sub2Array4[6].method467(13, 208, this.anInt1040);
						}
					}
					this.aClass8_27.method44(516, super.aGraphics2, 160);
					anInt891++;
					if (anInt891 > 1764) {
						anInt891 = 0;
						this.aClass6_Sub1_Sub4_6.method228(49);
						this.aClass6_Sub1_Sub4_6.method229(0);
						local365 = this.aClass6_Sub1_Sub4_6.anInt390;
						this.aClass6_Sub1_Sub4_6.method230(51137);
						this.aClass6_Sub1_Sub4_6.method230(62484);
						this.aClass6_Sub1_Sub4_6.method229((int) (Math.random() * 256.0D));
						this.aClass6_Sub1_Sub4_6.method229(21);
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass6_Sub1_Sub4_6.method230(59541);
						}
						this.aClass6_Sub1_Sub4_6.method229((int) (Math.random() * 256.0D));
						this.aClass6_Sub1_Sub4_6.method230(15406);
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass6_Sub1_Sub4_6.method230(19970);
						}
						this.aClass6_Sub1_Sub4_6.method229(219);
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass6_Sub1_Sub4_6.method230(18918);
						}
						this.aClass6_Sub1_Sub4_6.method238(this.aClass6_Sub1_Sub4_6.anInt390 - local365);
					}
					this.aClass8_26.method43();
					this.aClass6_Sub1_Sub3_Sub2_4.method467(0, 0, this.anInt1040);
					if (this.anInt868 == -1) {
						if (this.anIntArray267[this.anInt1016] != -1) {
							if (this.anInt1016 == 7) {
								this.aClass6_Sub1_Sub3_Sub2_8.method467(0, 42, this.anInt1040);
							}
							if (this.anInt1016 == 8) {
								this.aClass6_Sub1_Sub3_Sub2_9.method467(0, 74, this.anInt1040);
							}
							if (this.anInt1016 == 9) {
								this.aClass6_Sub1_Sub3_Sub2_9.method467(0, 102, this.anInt1040);
							}
							if (this.anInt1016 == 10) {
								this.aClass6_Sub1_Sub3_Sub2_10.method467(1, 130, this.anInt1040);
							}
							if (this.anInt1016 == 11) {
								this.aClass6_Sub1_Sub3_Sub2_12.method467(0, 173, this.anInt1040);
							}
							if (this.anInt1016 == 12) {
								this.aClass6_Sub1_Sub3_Sub2_12.method467(0, 201, this.anInt1040);
							}
							if (this.anInt1016 == 13) {
								this.aClass6_Sub1_Sub3_Sub2_11.method467(0, 229, this.anInt1040);
							}
						}
						if (this.anIntArray267[8] != -1 && (this.anInt1038 != 8 || anInt1041 % 20 < 10)) {
							this.aClass6_Sub1_Sub3_Sub2Array4[7].method467(2, 74, this.anInt1040);
						}
						if (this.anIntArray267[9] != -1 && (this.anInt1038 != 9 || anInt1041 % 20 < 10)) {
							this.aClass6_Sub1_Sub3_Sub2Array4[8].method467(3, 102, this.anInt1040);
						}
						if (this.anIntArray267[10] != -1 && (this.anInt1038 != 10 || anInt1041 % 20 < 10)) {
							this.aClass6_Sub1_Sub3_Sub2Array4[9].method467(4, 137, this.anInt1040);
						}
						if (this.anIntArray267[11] != -1 && (this.anInt1038 != 11 || anInt1041 % 20 < 10)) {
							this.aClass6_Sub1_Sub3_Sub2Array4[10].method467(2, 174, this.anInt1040);
						}
						if (this.anIntArray267[12] != -1 && (this.anInt1038 != 12 || anInt1041 % 20 < 10)) {
							this.aClass6_Sub1_Sub3_Sub2Array4[11].method467(2, 201, this.anInt1040);
						}
						if (this.anIntArray267[13] != -1 && (this.anInt1038 != 13 || anInt1041 % 20 < 10)) {
							this.aClass6_Sub1_Sub3_Sub2Array4[12].method467(2, 226, this.anInt1040);
						}
					}
					this.aClass8_26.method44(496, super.aGraphics2, 466);
					this.aClass8_23.method43();
					Class6_Sub1_Sub3_Sub1.anIntArray124 = this.anIntArray246;
				}
				if (this.aBoolean231) {
					this.aBoolean231 = false;
					this.aClass8_25.method43();
					this.aClass6_Sub1_Sub3_Sub2_3.method467(0, 0, this.anInt1040);
					this.aClass6_Sub1_Sub3_Sub4_3.method558(55, 16777215, 28, "Public chat", true);
					if (this.anInt964 == 0) {
						this.aClass6_Sub1_Sub3_Sub4_3.method558(55, 65280, 41, "On", true);
					}
					if (this.anInt964 == 1) {
						this.aClass6_Sub1_Sub3_Sub4_3.method558(55, 16776960, 41, "Friends", true);
					}
					if (this.anInt964 == 2) {
						this.aClass6_Sub1_Sub3_Sub4_3.method558(55, 16711680, 41, "Off", true);
					}
					if (this.anInt964 == 3) {
						this.aClass6_Sub1_Sub3_Sub4_3.method558(55, 65535, 41, "Hide", true);
					}
					this.aClass6_Sub1_Sub3_Sub4_3.method558(184, 16777215, 28, "Private chat", true);
					if (this.anInt933 == 0) {
						this.aClass6_Sub1_Sub3_Sub4_3.method558(184, 65280, 41, "On", true);
					}
					if (this.anInt933 == 1) {
						this.aClass6_Sub1_Sub3_Sub4_3.method558(184, 16776960, 41, "Friends", true);
					}
					if (this.anInt933 == 2) {
						this.aClass6_Sub1_Sub3_Sub4_3.method558(184, 16711680, 41, "Off", true);
					}
					this.aClass6_Sub1_Sub3_Sub4_3.method558(324, 16777215, 28, "Trade/compete", true);
					if (this.anInt858 == 0) {
						this.aClass6_Sub1_Sub3_Sub4_3.method558(324, 65280, 41, "On", true);
					}
					if (this.anInt858 == 1) {
						this.aClass6_Sub1_Sub3_Sub4_3.method558(324, 16776960, 41, "Friends", true);
					}
					if (this.anInt858 == 2) {
						this.aClass6_Sub1_Sub3_Sub4_3.method558(324, 16711680, 41, "Off", true);
					}
					this.aClass6_Sub1_Sub3_Sub4_3.method558(458, 16777215, 33, "Report abuse", true);
					this.aClass8_25.method44(0, super.aGraphics2, 453);
					this.aClass8_23.method43();
					Class6_Sub1_Sub3_Sub1.anIntArray124 = this.anIntArray246;
				}
				this.anInt880 = 0;
			} else {
				if (this.anInt928 == 2) {
					this.method668(this.anInt880, this.anInt879);
					if (this.anInt855 != -1) {
						this.method668(this.anInt880, this.anInt855);
					}
					this.anInt880 = 0;
					this.method634();
					super.aClass8_2.method43();
					Class6_Sub1_Sub3_Sub1.anIntArray124 = this.anIntArray247;
					Class6_Sub1_Sub3.method547();
					this.aBoolean244 = true;
					@Pc(56) Class1 local56 = Class1.method4(this.anInt879);
					if (local56.anInt34 == 512 && local56.anInt27 == 334 && local56.anInt33 == 0) {
						local56.anInt34 = 765;
						local56.anInt27 = 503;
					}
					this.method617(0, local56, this.anInt857, 0, 0);
					if (this.anInt855 != -1) {
						local56 = Class1.method4(this.anInt855);
						if (local56.anInt34 == 512 && local56.anInt27 == 334 && local56.anInt33 == 0) {
							local56.anInt34 = 765;
							local56.anInt27 = 503;
						}
						this.method617(0, local56, this.anInt857, 0, 0);
					}
					if (this.aBoolean217) {
						this.method674();
					} else {
						this.method722();
						this.method677();
					}
				}
				super.aClass8_2.method44(0, super.aGraphics2, 0);
			}
		} catch (@Pc(1497) RuntimeException local1497) {
			signlink.reporterror("68573, " + 381 + ", " + local1497.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method646() {
		try {
			this.aClass8_21.method43();
			Class6_Sub1_Sub3_Sub1.anIntArray124 = this.anIntArray245;
			this.aClass6_Sub1_Sub3_Sub2_13.method467(0, 0, this.anInt1040);
			if (this.anInt868 != -1) {
				this.method617(0, Class1.method4(this.anInt868), this.anInt857, 0, 0);
			} else if (this.anIntArray267[this.anInt1016] != -1) {
				this.method617(0, Class1.method4(this.anIntArray267[this.anInt1016]), this.anInt857, 0, 0);
			}
			if (this.aBoolean217 && this.anInt919 == 1) {
				this.method674();
			}
			this.aClass8_21.method44(553, super.aGraphics2, 205);
			this.aClass8_23.method43();
			Class6_Sub1_Sub3_Sub1.anIntArray124 = this.anIntArray246;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("61662, " + 0 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method647(@OriginalArg(1) int arg0) {
		try {
			if (!aBoolean225) {
				for (@Pc(13) int local13 = 0; local13 < this.anIntArray270.length; local13++) {
					@Pc(20) int local20 = this.anIntArray270[local13];
					if (Class6_Sub1_Sub3_Sub1.anIntArray126[local20] >= arg0) {
						@Pc(29) Class6_Sub1_Sub3_Sub2 local29 = Class6_Sub1_Sub3_Sub1.aClass6_Sub1_Sub3_Sub2Array1[local20];
						@Pc(37) int local37 = local29.anInt694 * local29.anInt695 - 1;
						@Pc(45) int local45 = local29.anInt694 * this.anInt880 * 2;
						@Pc(48) byte[] local48 = local29.aByteArray18;
						@Pc(51) byte[] local51 = this.aByteArray21;
						for (@Pc(53) int local53 = 0; local53 <= local37; local53++) {
							local51[local53] = local48[local53 - local45 & local37];
						}
						local29.aByteArray18 = local51;
						this.aByteArray21 = local48;
						Class6_Sub1_Sub3_Sub1.method210(local20);
					}
				}
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("80430, " + 5 + ", " + arg0 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method648(@OriginalArg(0) byte arg0) {
		try {
			@Pc(8) int local8;
			if (this.anInt1056 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt1056 > 768) {
						this.anIntArray228[local8] = this.method698(1024 - this.anInt1056, this.anIntArray229[local8], this.anIntArray230[local8]);
					} else if (this.anInt1056 > 256) {
						this.anIntArray228[local8] = this.anIntArray230[local8];
					} else {
						this.anIntArray228[local8] = this.method698(256 - this.anInt1056, this.anIntArray230[local8], this.anIntArray229[local8]);
					}
				}
			} else if (this.anInt1057 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt1057 > 768) {
						this.anIntArray228[local8] = this.method698(1024 - this.anInt1057, this.anIntArray229[local8], this.anIntArray231[local8]);
					} else if (this.anInt1057 > 256) {
						this.anIntArray228[local8] = this.anIntArray231[local8];
					} else {
						this.anIntArray228[local8] = this.method698(256 - this.anInt1057, this.anIntArray231[local8], this.anIntArray229[local8]);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray228[local8] = this.anIntArray229[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass8_15.anIntArray24[local8] = this.aClass6_Sub1_Sub3_Sub3_15.anIntArray193[local8];
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
				local198 = this.anIntArray213[local185] * (256 - local185) / 256;
				local202 = 22 + local198;
				if (local202 < 0) {
					local202 = 0;
				}
				local181 += local202;
				for (local212 = local202; local212 < 128; local212++) {
					local220 = this.anIntArray268[local181++];
					if (local220 == 0) {
						local183++;
					} else {
						local224 = local220;
						local228 = 256 - local220;
						local220 = this.anIntArray228[local220];
						local239 = this.aClass8_15.anIntArray24[local183];
						this.aClass8_15.anIntArray24[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			@Pc(296) boolean local296 = false;
			this.aClass8_15.method44(0, super.aGraphics2, 0);
			for (local198 = 0; local198 < 33920; local198++) {
				this.aClass8_16.anIntArray24[local198] = this.aClass6_Sub1_Sub3_Sub3_16.anIntArray193[local198];
			}
			local181 = 0;
			local183 = 1176;
			for (local202 = 1; local202 < 255; local202++) {
				local212 = this.anIntArray213[local202] * (256 - local202) / 256;
				local220 = 103 - local212;
				local183 += local212;
				for (local224 = 0; local224 < local220; local224++) {
					local228 = this.anIntArray268[local181++];
					if (local228 == 0) {
						local183++;
					} else {
						local239 = local228;
						@Pc(373) int local373 = 256 - local228;
						local228 = this.anIntArray228[local228];
						@Pc(384) int local384 = this.aClass8_16.anIntArray24[local183];
						this.aClass8_16.anIntArray24[local183++] = ((local228 & 0xFF00FF) * local239 + (local384 & 0xFF00FF) * local373 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local384 & 0xFF00) * local373 & 0xFF0000) >> 8;
					}
				}
				local181 += 128 - local220;
				local183 += 128 - local220 - local212;
			}
			this.aClass8_16.method44(637, super.aGraphics2, 0);
		} catch (@Pc(456) RuntimeException local456) {
			signlink.reporterror("75281, " + arg0 + ", " + local456.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method649() {
		try {
			signlink.aBoolean254 = false;
			signlink.anInt1065 = 0;
			signlink.midi = "stop";
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("39848, " + -480 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	private void method650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(1) Class6_Sub2 local1 = null;
			for (@Pc(6) Class6_Sub2 local6 = (Class6_Sub2) this.aClass40_11.method472(); local6 != null; local6 = (Class6_Sub2) this.aClass40_11.method474()) {
				if (local6.anInt206 == arg2 && local6.anInt208 == arg5 && local6.anInt209 == arg6 && local6.anInt207 == arg4) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class6_Sub2();
				local1.anInt206 = arg2;
				local1.anInt207 = arg4;
				local1.anInt208 = arg5;
				local1.anInt209 = arg6;
				this.method609(local1);
				this.aClass40_11.method469(local1);
			}
			local1.anInt200 = arg8;
			local1.anInt202 = arg1;
			local1.anInt201 = arg7;
			local1.anInt210 = arg0;
			local1.anInt199 = arg3;
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("47510, " + arg0 + ", " + arg1 + ", " + -625 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method651() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt987; local3++) {
				if (local3 == -1) {
					local11 = this.anInt986;
				} else {
					local11 = this.anIntArray251[local3];
				}
				@Pc(23) Class6_Sub1_Sub2_Sub4_Sub2 local23 = this.aClass6_Sub1_Sub2_Sub4_Sub2Array1[local11];
				if (local23 != null && local23.anInt601 > 0) {
					local23.anInt601--;
					if (local23.anInt601 == 0) {
						local23.aString15 = null;
					}
				}
			}
			for (local11 = 0; local11 < this.anInt885; local11++) {
				@Pc(54) int local54 = this.anIntArray227[local11];
				@Pc(59) Class6_Sub1_Sub2_Sub4_Sub1 local59 = this.aClass6_Sub1_Sub2_Sub4_Sub1Array1[local54];
				if (local59 != null && local59.anInt601 > 0) {
					local59.anInt601--;
					if (local59.anInt601 == 0) {
						local59.aString15 = null;
					}
				}
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("9243, " + 24 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZI)V")
	private void method653(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		try {
			signlink.anInt1064 = arg1;
			if (arg0) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("31765, " + -285 + ", " + arg0 + ", " + arg1 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)Ljava/net/Socket;")
	public Socket method654(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ATOBWHST;I)Z")
	private boolean method655(@OriginalArg(0) Class1 arg0) {
		try {
			if (arg0.anIntArray2 == null) {
				return false;
			}
			for (@Pc(16) int local16 = 0; local16 < arg0.anIntArray2.length; local16++) {
				@Pc(24) int local24 = this.method692(local16, arg0);
				@Pc(29) int local29 = arg0.anIntArray6[local16];
				if (arg0.anIntArray2[local16] == 2) {
					if (local24 >= local29) {
						return false;
					}
				} else if (arg0.anIntArray2[local16] == 3) {
					if (local24 <= local29) {
						return false;
					}
				} else if (arg0.anIntArray2[local16] == 4) {
					if (local24 == local29) {
						return false;
					}
				} else if (local24 != local29) {
					return false;
				}
			}
			return true;
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("64933, " + arg0 + ", " + 5 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)V")
	private void method656(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(8) int local8 = 0;
			for (@Pc(10) int local10 = 0; local10 < 100; local10++) {
				if (this.aStringArray13[local10] != null) {
					@Pc(22) int local22 = this.anIntArray243[local10];
					@Pc(33) int local33 = 70 - local8 * 14 + this.anInt935 + 4;
					if (local33 < -20) {
						break;
					}
					@Pc(41) String local41 = this.aStringArray12[local10];
					if (local41 != null && local41.startsWith("@cr1@")) {
						local41 = local41.substring(5);
					}
					if (local41 != null && local41.startsWith("@cr2@")) {
						local41 = local41.substring(5);
					}
					if (local22 == 0) {
						local8++;
					}
					if ((local22 == 1 || local22 == 2) && (local22 == 1 || this.anInt964 == 0 || this.anInt964 == 1 && this.method702(local41))) {
						if (arg1 > local33 - 14 && arg1 <= local33 && !local41.equals(aClass6_Sub1_Sub2_Sub4_Sub2_1.aString16)) {
							if (this.anInt980 >= 1) {
								this.aStringArray9[this.anInt890] = "Report abuse @whi@" + local41;
								this.anIntArray218[this.anInt890] = 376;
								this.anInt890++;
							}
							this.aStringArray9[this.anInt890] = "Add ignore @whi@" + local41;
							this.anIntArray218[this.anInt890] = 720;
							this.anInt890++;
							this.aStringArray9[this.anInt890] = "Add friend @whi@" + local41;
							this.anIntArray218[this.anInt890] = 675;
							this.anInt890++;
						}
						local8++;
					}
					if ((local22 == 3 || local22 == 7) && this.anInt907 == 0 && (local22 == 7 || this.anInt933 == 0 || this.anInt933 == 1 && this.method702(local41))) {
						if (arg1 > local33 - 14 && arg1 <= local33) {
							if (this.anInt980 >= 1) {
								this.aStringArray9[this.anInt890] = "Report abuse @whi@" + local41;
								this.anIntArray218[this.anInt890] = 376;
								this.anInt890++;
							}
							this.aStringArray9[this.anInt890] = "Add ignore @whi@" + local41;
							this.anIntArray218[this.anInt890] = 720;
							this.anInt890++;
							this.aStringArray9[this.anInt890] = "Add friend @whi@" + local41;
							this.anIntArray218[this.anInt890] = 675;
							this.anInt890++;
						}
						local8++;
					}
					if (local22 == 4 && (this.anInt858 == 0 || this.anInt858 == 1 && this.method702(local41))) {
						if (arg1 > local33 - 14 && arg1 <= local33) {
							this.aStringArray9[this.anInt890] = "Accept trade @whi@" + local41;
							this.anIntArray218[this.anInt890] = 464;
							this.anInt890++;
						}
						local8++;
					}
					if ((local22 == 5 || local22 == 6) && this.anInt907 == 0 && this.anInt933 < 2) {
						local8++;
					}
					if (local22 == 8 && (this.anInt858 == 0 || this.anInt858 == 1 && this.method702(local41))) {
						if (arg1 > local33 - 14 && arg1 <= local33) {
							this.aStringArray9[this.anInt890] = "Accept challenge @whi@" + local41;
							this.anIntArray218[this.anInt890] = 323;
							this.anInt890++;
						}
						local8++;
					}
				}
			}
		} catch (@Pc(406) RuntimeException local406) {
			signlink.reporterror("62041, " + arg0 + ", " + 23977 + ", " + arg1 + ", " + local406.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!ATOBWHST;IIIBI)V")
	private void method657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) int arg8) {
		try {
			@Pc(6) boolean local6 = false;
			if (this.aBoolean227) {
				this.anInt914 = 32;
			} else {
				this.anInt914 = 0;
			}
			this.aBoolean227 = false;
			if (arg4 >= arg6 && arg4 < arg6 + 16 && arg1 >= arg8 && arg1 < arg8 + 16) {
				arg3.anInt32 -= this.anInt934 * 4;
				if (arg2 == 1) {
					this.aBoolean238 = true;
				}
				if (arg2 == 2 || arg2 == 3) {
					this.aBoolean252 = true;
				}
			} else if (arg4 >= arg6 && arg4 < arg6 + 16 && arg1 >= arg8 + arg0 - 16 && arg1 < arg8 + arg0) {
				arg3.anInt32 += this.anInt934 * 4;
				if (arg2 == 1) {
					this.aBoolean238 = true;
				}
				if (arg2 == 2 || arg2 == 3) {
					this.aBoolean252 = true;
				}
			} else if (arg4 >= arg6 - this.anInt914 && arg4 < arg6 + 16 + this.anInt914 && arg1 >= arg8 + 16 && arg1 < arg8 + arg0 - 16 && this.anInt934 > 0) {
				@Pc(146) int local146 = (arg0 - 32) * arg0 / arg5;
				if (local146 < 8) {
					local146 = 8;
				}
				@Pc(161) int local161 = arg1 - arg8 - 16 - local146 / 2;
				@Pc(167) int local167 = arg0 - 32 - local146;
				arg3.anInt32 = (arg5 - arg0) * local161 / local167;
				if (arg2 == 1) {
					this.aBoolean238 = true;
				}
				if (arg2 == 2 || arg2 == 3) {
					this.aBoolean252 = true;
				}
				this.aBoolean227 = true;
			}
		} catch (@Pc(196) RuntimeException local196) {
			signlink.reporterror("83857, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local196.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method658(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean237) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.method654(43595);
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

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method660() {
		try {
			if (this.aClass8_24 == null) {
				this.method710();
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
				this.aClass8_24 = new Class8(96, 479, this.method584(), 384);
				this.aClass8_22 = new Class8(156, 172, this.method584(), 384);
				Class6_Sub1_Sub3.method547();
				this.aClass6_Sub1_Sub3_Sub2_14.method467(0, 0, this.anInt1040);
				this.aClass8_21 = new Class8(261, 190, this.method584(), 384);
				this.aClass8_23 = new Class8(334, 512, this.method584(), 384);
				Class6_Sub1_Sub3.method547();
				this.aClass8_25 = new Class8(50, 496, this.method584(), 384);
				this.aClass8_26 = new Class8(37, 269, this.method584(), 384);
				this.aClass8_27 = new Class8(45, 249, this.method584(), 384);
				this.aBoolean244 = true;
				this.aBoolean243 &= true;
				this.aClass8_23.method43();
				Class6_Sub1_Sub3_Sub1.anIntArray124 = this.anIntArray246;
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("2900, " + true + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIIIIII)V")
	private void method661(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg5 >= 1 && arg6 >= 1 && arg5 <= 102 && arg6 <= 102) {
				if (aBoolean225 && arg3 != this.anInt854) {
					return;
				}
				@Pc(26) int local26 = 0;
				if (arg1 == 0) {
					local26 = this.aClass38_1.method423(arg3, arg5, arg6);
				}
				if (arg1 == 1) {
					local26 = this.aClass38_1.method424(arg3, arg6, arg5);
				}
				if (arg1 == 2) {
					local26 = this.aClass38_1.method425(arg3, arg5, arg6);
				}
				if (arg1 == 3) {
					local26 = this.aClass38_1.method426(arg3, arg5, arg6);
				}
				@Pc(82) int local82;
				if (local26 != 0) {
					local82 = this.aClass38_1.method427(arg3, arg5, arg6, local26);
					@Pc(88) int local88 = local26 >> 14 & 0x7FFF;
					@Pc(92) int local92 = local82 & 0x1F;
					@Pc(96) int local96 = local82 >> 6;
					@Pc(108) Class11 local108;
					if (arg1 == 0) {
						this.aClass38_1.method414(arg6, arg3, arg5);
						local108 = Class11.method60(local88);
						if (local108.aBoolean37) {
							this.aClass12Array1[arg3].method71(arg6, arg5, local108.aBoolean36, local92, local96);
						}
					}
					if (arg1 == 1) {
						this.aClass38_1.method415(arg6, arg3, arg5);
					}
					if (arg1 == 2) {
						this.aClass38_1.method416(arg5, arg6, arg3);
						local108 = Class11.method60(local88);
						if (arg5 + local108.anInt111 > 103 || arg6 + local108.anInt111 > 103 || arg5 + local108.anInt127 > 103 || arg6 + local108.anInt127 > 103) {
							return;
						}
						if (local108.aBoolean37) {
							this.aClass12Array1[arg3].method72(local108.anInt111, local108.anInt127, arg6, arg5, local96, local108.aBoolean36);
						}
					}
					if (arg1 == 3) {
						this.aClass38_1.method417(arg6, arg3, arg5);
						local108 = Class11.method60(local88);
						if (local108.aBoolean37 && local108.aBoolean44) {
							this.aClass12Array1[arg3].method74(arg5, arg6);
						}
					}
				}
				if (arg2 >= 0) {
					local82 = arg3;
					if (arg3 < 3 && (this.aByteArrayArrayArray8[1][arg5][arg6] & 0x2) == 2) {
						local82 = arg3 + 1;
					}
					Class7.method26(this.anIntArrayArrayArray7, arg3, local82, arg5, this.aClass12Array1[arg3], arg6, arg2, 850, arg4, arg0, this.aClass38_1);
					return;
				}
			}
		} catch (@Pc(255) RuntimeException local255) {
			signlink.reporterror("41593, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local255.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIBII)V")
	private void method662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg4 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg2 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg1;
			@Pc(23) int local23;
			@Pc(27) int local27;
			@Pc(37) int local37;
			if (local5 != 0) {
				local23 = Class6_Sub1_Sub2_Sub2.anIntArray69[local5];
				local27 = Class6_Sub1_Sub2_Sub2.anIntArray70[local5];
				local37 = 0 * local27 - arg1 * local23 >> 16;
				local17 = 0 * local23 + arg1 * local27 >> 16;
				local15 = local37;
			}
			if (local11 != 0) {
				local23 = Class6_Sub1_Sub2_Sub2.anIntArray69[local11];
				local27 = Class6_Sub1_Sub2_Sub2.anIntArray70[local11];
				local37 = local17 * local23 + 0 * local27 >> 16;
				local17 = local17 * local27 - 0 * local23 >> 16;
				local13 = local37;
			}
			this.anInt1009 = arg5 - local13;
			this.anInt1010 = arg3 - local15;
			this.anInt1011 = arg0 - local17;
			this.anInt1012 = arg4;
			this.anInt1013 = arg2;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("89010, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -113 + ", " + arg4 + ", " + arg5 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method663() {
		try {
			this.aClass8_22.method43();
			@Pc(18) int local18;
			@Pc(20) int local20;
			if (this.anInt965 == 2) {
				@Pc(13) byte[] local13 = this.aClass6_Sub1_Sub3_Sub2_14.aByteArray18;
				@Pc(15) int[] local15 = Class6_Sub1_Sub3.anIntArray204;
				local18 = local13.length;
				for (local20 = 0; local20 < local18; local20++) {
					if (local13[local20] == 0) {
						local15[local20] = 0;
					}
				}
				this.aClass6_Sub1_Sub3_Sub3_14.method510(0, 256, this.anIntArray257, this.anInt1053, 33, 25, this.anIntArray221, 33, 0, 25);
				this.aClass8_23.method43();
				Class6_Sub1_Sub3_Sub1.anIntArray124 = this.anIntArray246;
			} else {
				@Pc(67) int local67 = this.anInt1053 + this.anInt874 & 0x7FF;
				@Pc(74) int local74 = 48 + aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt583 / 32;
				local18 = 464 - aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt584 / 32;
				this.aClass6_Sub1_Sub3_Sub3_17.method510(5, 256 + this.anInt973, this.anIntArray272, local67, 146, local74, this.anIntArray232, 151, 25, local18);
				this.aClass6_Sub1_Sub3_Sub3_14.method510(0, 256, this.anIntArray257, this.anInt1053, 33, 25, this.anIntArray221, 33, 0, 25);
				for (local20 = 0; local20 < this.anInt881; local20++) {
					local74 = this.anIntArray224[local20] * 4 + 2 - aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt583 / 32;
					local18 = this.anIntArray225[local20] * 4 + 2 - aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt584 / 32;
					this.method596(local74, this.aClass6_Sub1_Sub3_Sub3Array9[local20], local18);
				}
				@Pc(175) int local175;
				for (@Pc(171) int local171 = 0; local171 < 104; local171++) {
					for (local175 = 0; local175 < 104; local175++) {
						@Pc(187) Class40 local187 = this.aClass40ArrayArrayArray1[this.anInt854][local171][local175];
						if (local187 != null) {
							local74 = local171 * 4 + 2 - aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt583 / 32;
							local18 = local175 * 4 + 2 - aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt584 / 32;
							this.method596(local74, this.aClass6_Sub1_Sub3_Sub3_8, local18);
						}
					}
				}
				for (local175 = 0; local175 < this.anInt885; local175++) {
					@Pc(238) Class6_Sub1_Sub2_Sub4_Sub1 local238 = this.aClass6_Sub1_Sub2_Sub4_Sub1Array1[this.anIntArray227[local175]];
					if (local238 != null && local238.method381()) {
						@Pc(247) Class20 local247 = local238.aClass20_1;
						if (local247.anIntArray82 != null) {
							local247 = local247.method147();
						}
						if (local247 != null && local247.aBoolean77 && local247.aBoolean78) {
							local74 = local238.anInt583 / 32 - aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt583 / 32;
							local18 = local238.anInt584 / 32 - aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt584 / 32;
							this.method596(local74, this.aClass6_Sub1_Sub3_Sub3_9, local18);
						}
					}
				}
				@Pc(306) Class6_Sub1_Sub2_Sub4_Sub2 local306;
				for (@Pc(296) int local296 = 0; local296 < this.anInt987; local296++) {
					local306 = this.aClass6_Sub1_Sub2_Sub4_Sub2Array1[this.anIntArray251[local296]];
					if (local306 != null && local306.method381()) {
						local74 = local306.anInt583 / 32 - aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt583 / 32;
						local18 = local306.anInt584 / 32 - aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt584 / 32;
						@Pc(334) boolean local334 = false;
						@Pc(338) long local338 = Class41.method481(local306.aString16);
						for (@Pc(340) int local340 = 0; local340 < this.anInt827; local340++) {
							if (local338 == this.aLongArray4[local340] && this.anIntArray237[local340] != 0) {
								local334 = true;
								break;
							}
						}
						@Pc(365) boolean local365 = false;
						if (aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt631 != 0 && local306.anInt631 != 0 && aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt631 == local306.anInt631) {
							local365 = true;
						}
						if (local334) {
							this.method596(local74, this.aClass6_Sub1_Sub3_Sub3_11, local18);
						} else if (local365) {
							this.method596(local74, this.aClass6_Sub1_Sub3_Sub3_12, local18);
						} else {
							this.method596(local74, this.aClass6_Sub1_Sub3_Sub3_10, local18);
						}
					}
				}
				if (this.anInt1002 != 0 && anInt1041 % 20 < 10) {
					if (this.anInt1002 == 1 && this.anInt847 >= 0 && this.anInt847 < this.aClass6_Sub1_Sub2_Sub4_Sub1Array1.length) {
						@Pc(439) Class6_Sub1_Sub2_Sub4_Sub1 local439 = this.aClass6_Sub1_Sub2_Sub4_Sub1Array1[this.anInt847];
						if (local439 != null) {
							local74 = local439.anInt583 / 32 - aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt583 / 32;
							local18 = local439.anInt584 / 32 - aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt584 / 32;
							this.method625(this.aClass6_Sub1_Sub3_Sub3_4, local18, local74);
						}
					}
					if (this.anInt1002 == 2) {
						local74 = (this.anInt861 - this.anInt959) * 4 + 2 - aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt583 / 32;
						local18 = (this.anInt862 - this.anInt960) * 4 + 2 - aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt584 / 32;
						this.method625(this.aClass6_Sub1_Sub3_Sub3_4, local18, local74);
					}
					if (this.anInt1002 == 10 && this.anInt837 >= 0 && this.anInt837 < this.aClass6_Sub1_Sub2_Sub4_Sub2Array1.length) {
						local306 = this.aClass6_Sub1_Sub2_Sub4_Sub2Array1[this.anInt837];
						if (local306 != null) {
							local74 = local306.anInt583 / 32 - aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt583 / 32;
							local18 = local306.anInt584 / 32 - aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt584 / 32;
							this.method625(this.aClass6_Sub1_Sub3_Sub3_4, local18, local74);
						}
					}
				}
				if (this.anInt1026 != 0) {
					local74 = this.anInt1026 * 4 + 2 - aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt583 / 32;
					local18 = this.anInt1027 * 4 + 2 - aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt584 / 32;
					this.method596(local74, this.aClass6_Sub1_Sub3_Sub3_3, local18);
				}
				Class6_Sub1_Sub3.method549(97, 3, 78, 16777215, 3);
				this.aClass8_23.method43();
				Class6_Sub1_Sub3_Sub1.anIntArray124 = this.anIntArray246;
			}
		} catch (@Pc(607) RuntimeException local607) {
			signlink.reporterror("66155, " + false + ", " + local607.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method664() {
		try {
			if (super.anInt819 == 1) {
				if (super.anInt820 >= 539 && super.anInt820 <= 573 && super.anInt821 >= 169 && super.anInt821 < 205 && this.anIntArray267[0] != -1) {
					this.aBoolean238 = true;
					this.anInt1016 = 0;
					this.aBoolean219 = true;
				}
				if (super.anInt820 >= 569 && super.anInt820 <= 599 && super.anInt821 >= 168 && super.anInt821 < 205 && this.anIntArray267[1] != -1) {
					this.aBoolean238 = true;
					this.anInt1016 = 1;
					this.aBoolean219 = true;
				}
				if (super.anInt820 >= 597 && super.anInt820 <= 627 && super.anInt821 >= 168 && super.anInt821 < 205 && this.anIntArray267[2] != -1) {
					this.aBoolean238 = true;
					this.anInt1016 = 2;
					this.aBoolean219 = true;
				}
				if (super.anInt820 >= 625 && super.anInt820 <= 669 && super.anInt821 >= 168 && super.anInt821 < 203 && this.anIntArray267[3] != -1) {
					this.aBoolean238 = true;
					this.anInt1016 = 3;
					this.aBoolean219 = true;
				}
				if (super.anInt820 >= 666 && super.anInt820 <= 696 && super.anInt821 >= 168 && super.anInt821 < 205 && this.anIntArray267[4] != -1) {
					this.aBoolean238 = true;
					this.anInt1016 = 4;
					this.aBoolean219 = true;
				}
				if (super.anInt820 >= 694 && super.anInt820 <= 724 && super.anInt821 >= 168 && super.anInt821 < 205 && this.anIntArray267[5] != -1) {
					this.aBoolean238 = true;
					this.anInt1016 = 5;
					this.aBoolean219 = true;
				}
				if (super.anInt820 >= 722 && super.anInt820 <= 756 && super.anInt821 >= 169 && super.anInt821 < 205 && this.anIntArray267[6] != -1) {
					this.aBoolean238 = true;
					this.anInt1016 = 6;
					this.aBoolean219 = true;
				}
				if (super.anInt820 >= 540 && super.anInt820 <= 574 && super.anInt821 >= 466 && super.anInt821 < 502 && this.anIntArray267[7] != -1) {
					this.aBoolean238 = true;
					this.anInt1016 = 7;
					this.aBoolean219 = true;
				}
				if (super.anInt820 >= 572 && super.anInt820 <= 602 && super.anInt821 >= 466 && super.anInt821 < 503 && this.anIntArray267[8] != -1) {
					this.aBoolean238 = true;
					this.anInt1016 = 8;
					this.aBoolean219 = true;
				}
				if (super.anInt820 >= 599 && super.anInt820 <= 629 && super.anInt821 >= 466 && super.anInt821 < 503 && this.anIntArray267[9] != -1) {
					this.aBoolean238 = true;
					this.anInt1016 = 9;
					this.aBoolean219 = true;
				}
				if (super.anInt820 >= 627 && super.anInt820 <= 671 && super.anInt821 >= 467 && super.anInt821 < 502 && this.anIntArray267[10] != -1) {
					this.aBoolean238 = true;
					this.anInt1016 = 10;
					this.aBoolean219 = true;
				}
				if (super.anInt820 >= 669 && super.anInt820 <= 699 && super.anInt821 >= 466 && super.anInt821 < 503 && this.anIntArray267[11] != -1) {
					this.aBoolean238 = true;
					this.anInt1016 = 11;
					this.aBoolean219 = true;
				}
				if (super.anInt820 >= 696 && super.anInt820 <= 726 && super.anInt821 >= 466 && super.anInt821 < 503 && this.anIntArray267[12] != -1) {
					this.aBoolean238 = true;
					this.anInt1016 = 12;
					this.aBoolean219 = true;
				}
				if (super.anInt820 >= 724 && super.anInt820 <= 758 && super.anInt821 >= 466 && super.anInt821 < 502 && this.anIntArray267[13] != -1) {
					this.aBoolean238 = true;
					this.anInt1016 = 13;
					this.aBoolean219 = true;
					return;
				}
			}
		} catch (@Pc(449) RuntimeException local449) {
			signlink.reporterror("36457, " + 41 + ", " + local449.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method583() {
		try {
			this.aBoolean244 = true;
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("78486, " + 0 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method665() {
		try {
			if (this.anInt907 != 0) {
				@Pc(5) int local5 = 0;
				if (this.anInt1019 != 0) {
					local5 = 1;
				}
				for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
					if (this.aStringArray13[local15] != null) {
						@Pc(27) int local27 = this.anIntArray243[local15];
						@Pc(32) String local32 = this.aStringArray12[local15];
						if (local32 != null && local32.startsWith("@cr1@")) {
							local32 = local32.substring(5);
						}
						if (local32 != null && local32.startsWith("@cr2@")) {
							local32 = local32.substring(5);
						}
						if ((local27 == 3 || local27 == 7) && (local27 == 7 || this.anInt933 == 0 || this.anInt933 == 1 && this.method702(local32))) {
							@Pc(85) int local85 = 329 - local5 * 13;
							if (super.anInt814 > 4 && super.anInt815 - 4 > local85 - 10 && super.anInt815 - 4 <= local85 + 3) {
								@Pc(124) int local124 = this.aClass6_Sub1_Sub3_Sub4_3.method559("From:  " + local32 + this.aStringArray13[local15]) + 25;
								if (local124 > 450) {
									local124 = 450;
								}
								if (super.anInt814 < 4 + local124) {
									if (this.anInt980 >= 1) {
										this.aStringArray9[this.anInt890] = "Report abuse @whi@" + local32;
										this.anIntArray218[this.anInt890] = 2376;
										this.anInt890++;
									}
									this.aStringArray9[this.anInt890] = "Add ignore @whi@" + local32;
									this.anIntArray218[this.anInt890] = 2720;
									this.anInt890++;
									this.aStringArray9[this.anInt890] = "Add friend @whi@" + local32;
									this.anIntArray218[this.anInt890] = 2675;
									this.anInt890++;
								}
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local27 == 5 || local27 == 6) && this.anInt933 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(237) RuntimeException local237) {
			signlink.reporterror("57689, " + false + ", " + local237.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)V")
	private void method666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(8) int local8 = this.aClass38_1.method423(arg5, arg1, arg4);
			if (arg0 >= 5 && arg0 <= 5) {
				@Pc(25) int local25;
				@Pc(31) int local31;
				@Pc(35) int local35;
				@Pc(37) int local37;
				@Pc(59) int local59;
				@Pc(65) int local65;
				if (local8 != 0) {
					local25 = this.aClass38_1.method427(arg5, arg1, arg4, local8);
					local31 = local25 >> 6 & 0x3;
					local35 = local25 & 0x1F;
					local37 = arg3;
					if (local8 > 0) {
						local37 = arg2;
					}
					@Pc(45) int[] local45 = this.aClass6_Sub1_Sub3_Sub3_17.anIntArray193;
					local59 = 24624 + arg1 * 4 + (103 - arg4) * 512 * 4;
					local65 = local8 >> 14 & 0x7FFF;
					@Pc(68) Class11 local68 = Class11.method60(local65);
					if (local68.anInt110 == -1) {
						if (local35 == 0 || local35 == 2) {
							if (local31 == 0) {
								local45[local59] = local37;
								local45[local59 + 512] = local37;
								local45[local59 + 1024] = local37;
								local45[local59 + 1536] = local37;
							} else if (local31 == 1) {
								local45[local59] = local37;
								local45[local59 + 1] = local37;
								local45[local59 + 2] = local37;
								local45[local59 + 3] = local37;
							} else if (local31 == 2) {
								local45[local59 + 3] = local37;
								local45[local59 + 3 + 512] = local37;
								local45[local59 + 3 + 1024] = local37;
								local45[local59 + 3 + 1536] = local37;
							} else if (local31 == 3) {
								local45[local59 + 1536] = local37;
								local45[local59 + 1536 + 1] = local37;
								local45[local59 + 1536 + 2] = local37;
								local45[local59 + 1536 + 3] = local37;
							}
						}
						if (local35 == 3) {
							if (local31 == 0) {
								local45[local59] = local37;
							} else if (local31 == 1) {
								local45[local59 + 3] = local37;
							} else if (local31 == 2) {
								local45[local59 + 3 + 1536] = local37;
							} else if (local31 == 3) {
								local45[local59 + 1536] = local37;
							}
						}
						if (local35 == 2) {
							if (local31 == 3) {
								local45[local59] = local37;
								local45[local59 + 512] = local37;
								local45[local59 + 1024] = local37;
								local45[local59 + 1536] = local37;
							} else if (local31 == 0) {
								local45[local59] = local37;
								local45[local59 + 1] = local37;
								local45[local59 + 2] = local37;
								local45[local59 + 3] = local37;
							} else if (local31 == 1) {
								local45[local59 + 3] = local37;
								local45[local59 + 3 + 512] = local37;
								local45[local59 + 3 + 1024] = local37;
								local45[local59 + 3 + 1536] = local37;
							} else if (local31 == 2) {
								local45[local59 + 1536] = local37;
								local45[local59 + 1536 + 1] = local37;
								local45[local59 + 1536 + 2] = local37;
								local45[local59 + 1536 + 3] = local37;
							}
						}
					} else {
						@Pc(78) Class6_Sub1_Sub3_Sub2 local78 = this.aClass6_Sub1_Sub3_Sub2Array2[local68.anInt110];
						if (local78 != null) {
							@Pc(90) int local90 = (local68.anInt111 * 4 - local78.anInt694) / 2;
							@Pc(100) int local100 = (local68.anInt127 * 4 - local78.anInt695) / 2;
							local78.method467(48 + (104 - arg4 - local68.anInt127) * 4 + local100, 48 + arg1 * 4 + local90, this.anInt1040);
						}
					}
				}
				local8 = this.aClass38_1.method425(arg5, arg1, arg4);
				if (local8 != 0) {
					local25 = this.aClass38_1.method427(arg5, arg1, arg4, local8);
					local31 = local25 >> 6 & 0x3;
					local35 = local25 & 0x1F;
					local37 = local8 >> 14 & 0x7FFF;
					@Pc(455) Class11 local455 = Class11.method60(local37);
					@Pc(487) int local487;
					if (local455.anInt110 != -1) {
						@Pc(465) Class6_Sub1_Sub3_Sub2 local465 = this.aClass6_Sub1_Sub3_Sub2Array2[local455.anInt110];
						if (local465 != null) {
							local65 = (local455.anInt111 * 4 - local465.anInt694) / 2;
							local487 = (local455.anInt127 * 4 - local465.anInt695) / 2;
							local465.method467(48 + (104 - arg4 - local455.anInt127) * 4 + local487, 48 + arg1 * 4 + local65, this.anInt1040);
						}
					} else if (local35 == 9) {
						local59 = 15658734;
						if (local8 > 0) {
							local59 = 15597568;
						}
						@Pc(525) int[] local525 = this.aClass6_Sub1_Sub3_Sub3_17.anIntArray193;
						local487 = 24624 + arg1 * 4 + (103 - arg4) * 512 * 4;
						if (local31 == 0 || local31 == 2) {
							local525[local487 + 1536] = local59;
							local525[local487 + 1024 + 1] = local59;
							local525[local487 + 512 + 2] = local59;
							local525[local487 + 3] = local59;
						} else {
							local525[local487] = local59;
							local525[local487 + 512 + 1] = local59;
							local525[local487 + 1024 + 2] = local59;
							local525[local487 + 1536 + 3] = local59;
						}
					}
				}
				local8 = this.aClass38_1.method426(arg5, arg1, arg4);
				if (local8 != 0) {
					local25 = local8 >> 14 & 0x7FFF;
					@Pc(620) Class11 local620 = Class11.method60(local25);
					if (local620.anInt110 != -1) {
						@Pc(630) Class6_Sub1_Sub3_Sub2 local630 = this.aClass6_Sub1_Sub3_Sub2Array2[local620.anInt110];
						if (local630 != null) {
							local37 = (local620.anInt111 * 4 - local630.anInt694) / 2;
							@Pc(652) int local652 = (local620.anInt127 * 4 - local630.anInt695) / 2;
							local630.method467(48 + (104 - arg4 - local620.anInt127) * 4 + local652, 48 + arg1 * 4 + local37, this.anInt1040);
							return;
						}
					}
				}
			}
		} catch (@Pc(677) RuntimeException local677) {
			signlink.reporterror("18002, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local677.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!TPTANZXN;II)V")
	private void method667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub1_Sub2_Sub4_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg2 != aClass6_Sub1_Sub2_Sub4_Sub2_1 && this.anInt890 < 400) {
				@Pc(35) String local35;
				if (arg2.anInt623 == 0) {
					local35 = arg2.aString16 + method659(arg2.anInt628, aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt628) + " (level-" + arg2.anInt628 + ")";
				} else {
					local35 = arg2.aString16 + " (skill-" + arg2.anInt623 + ")";
				}
				@Pc(165) int local165;
				if (this.anInt1042 == 1) {
					this.aStringArray9[this.anInt890] = "Use " + this.aString31 + " with @whi@" + local35;
					this.anIntArray218[this.anInt890] = 56;
					this.anIntArray219[this.anInt890] = arg3;
					this.anIntArray216[this.anInt890] = arg4;
					this.anIntArray217[this.anInt890] = arg1;
					this.anInt890++;
				} else if (this.anInt990 != 1) {
					for (local165 = 4; local165 >= 0; local165--) {
						if (this.aStringArray10[local165] != null) {
							this.aStringArray9[this.anInt890] = this.aStringArray10[local165] + " @whi@" + local35;
							@Pc(192) short local192 = 0;
							if (this.aStringArray10[local165].equalsIgnoreCase("attack")) {
								if (arg2.anInt628 > aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt628) {
									local192 = 2000;
								}
								if (aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt631 != 0 && arg2.anInt631 != 0) {
									if (aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt631 == arg2.anInt631) {
										local192 = 2000;
									} else {
										local192 = 0;
									}
								}
							} else if (this.aBooleanArray11[local165]) {
								local192 = 2000;
							}
							if (local165 == 0) {
								this.anIntArray218[this.anInt890] = 426 + local192;
							}
							if (local165 == 1) {
								this.anIntArray218[this.anInt890] = 629 + local192;
							}
							if (local165 == 2) {
								this.anIntArray218[this.anInt890] = 863 + local192;
							}
							if (local165 == 3) {
								this.anIntArray218[this.anInt890] = 266 + local192;
							}
							if (local165 == 4) {
								this.anIntArray218[this.anInt890] = 886 + local192;
							}
							this.anIntArray219[this.anInt890] = arg3;
							this.anIntArray216[this.anInt890] = arg4;
							this.anIntArray217[this.anInt890] = arg1;
							this.anInt890++;
						}
					}
				} else if ((this.anInt992 & 0x8) == 8) {
					this.aStringArray9[this.anInt890] = this.aString29 + " @whi@" + local35;
					this.anIntArray218[this.anInt890] = 891;
					this.anIntArray219[this.anInt890] = arg3;
					this.anIntArray216[this.anInt890] = arg4;
					this.anIntArray217[this.anInt890] = arg1;
					this.anInt890++;
				}
				for (local165 = 0; local165 < this.anInt890; local165++) {
					if (this.anIntArray218[local165] == 616) {
						this.aStringArray9[local165] = "Walk here @whi@" + local35;
						break;
					}
				}
				@Pc(345) boolean local345 = false;
			}
		} catch (@Pc(347) RuntimeException local347) {
			signlink.reporterror("62411, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local347.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIZ)Z")
	private boolean method668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(6) Class1 local6 = Class1.method4(arg1);
			for (@Pc(8) int local8 = 0; local8 < local6.anIntArray5.length && local6.anIntArray5[local8] != -1; local8++) {
				@Pc(22) Class1 local22 = Class1.method4(local6.anIntArray5[local8]);
				if (local22.anInt33 == 0) {
					local3 |= this.method668(arg0, local22.anInt8);
				}
				@Pc(56) int local56;
				if (local22.anInt33 == 6 && (local22.anInt3 != -1 || local22.anInt4 != -1)) {
					@Pc(51) boolean local51 = this.method655(local22);
					if (local51) {
						local56 = local22.anInt4;
					} else {
						local56 = local22.anInt3;
					}
					if (local56 != -1) {
						@Pc(68) Class2 local68 = Class2.aClass2Array1[local56];
						local22.anInt36 += arg0;
						while (local22.anInt36 > local68.method12(local22.anInt38, 214)) {
							local22.anInt36 -= local68.method12(local22.anInt38, 214);
							local22.anInt38++;
							if (local22.anInt38 >= local68.anInt40) {
								local22.anInt38 -= local68.anInt41;
								if (local22.anInt38 < 0 || local22.anInt38 >= local68.anInt40) {
									local22.anInt38 = 0;
								}
							}
							local3 = true;
						}
					}
				}
				if (local22.anInt33 == 6 && local22.anInt28 != 0) {
					@Pc(137) int local137 = local22.anInt28 >> 16;
					local56 = local22.anInt28 << 16 >> 16;
					@Pc(148) int local148 = local137 * arg0;
					local56 *= arg0;
					local22.anInt18 = local22.anInt18 + local148 & 0x7FF;
					local22.anInt19 = local22.anInt19 + local56 & 0x7FF;
					local3 = true;
				}
			}
			return local3;
		} catch (@Pc(189) RuntimeException local189) {
			signlink.reporterror("37853, " + arg0 + ", " + arg1 + ", " + true + ", " + local189.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!PQBRPYKE;I)V")
	private void method669(@OriginalArg(1) Class6_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				if (arg0.anInt391 + 21 < arg1 * 8) {
					@Pc(12) int local12 = arg0.method250(14);
					if (local12 != 16383) {
						if (this.aClass6_Sub1_Sub2_Sub4_Sub1Array1[local12] == null) {
							this.aClass6_Sub1_Sub2_Sub4_Sub1Array1[local12] = new Class6_Sub1_Sub2_Sub4_Sub1();
						}
						@Pc(32) Class6_Sub1_Sub2_Sub4_Sub1 local32 = this.aClass6_Sub1_Sub2_Sub4_Sub1Array1[local12];
						this.anIntArray227[this.anInt885++] = local12;
						local32.anInt602 = anInt1041;
						@Pc(51) int local51 = arg0.method250(1);
						@Pc(56) int local56 = arg0.method250(5);
						if (local56 > 15) {
							local56 -= 32;
						}
						@Pc(65) int local65 = arg0.method250(1);
						if (local65 == 1) {
							this.anIntArray252[this.anInt988++] = local12;
						}
						local32.aClass20_1 = Class20.method150(arg0.method250(13));
						@Pc(91) int local91 = arg0.method250(5);
						if (local91 > 15) {
							local91 -= 32;
						}
						local32.anInt577 = local32.aClass20_1.aByte22;
						local32.anInt586 = local32.aClass20_1.anInt286;
						local32.anInt579 = local32.aClass20_1.anInt297;
						local32.anInt580 = local32.aClass20_1.anInt302;
						local32.anInt581 = local32.aClass20_1.anInt284;
						local32.anInt582 = local32.aClass20_1.anInt285;
						local32.anInt599 = local32.aClass20_1.anInt283;
						local32.method377(aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0] + local56, local51 == 1, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0] + local91);
						continue;
					}
				}
				arg0.method251();
				return;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("52399, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V")
	private void method670(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0 && this.anInt976 != -1) {
				this.aString23 = arg0;
				super.anInt819 = 0;
			}
			if (this.anInt979 == -1) {
				this.aBoolean252 = true;
			}
			for (@Pc(22) int local22 = 99; local22 > 0; local22--) {
				this.anIntArray243[local22] = this.anIntArray243[local22 - 1];
				this.aStringArray12[local22] = this.aStringArray12[local22 - 1];
				this.aStringArray13[local22] = this.aStringArray13[local22 - 1];
			}
			this.anIntArray243[0] = arg2;
			this.aStringArray12[0] = arg1;
			this.aStringArray13[0] = arg0;
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("51042, " + arg0 + ", " + arg1 + ", " + -459 + ", " + arg2 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
	private void method671(@OriginalArg(1) boolean arg0) {
		try {
			this.method611();
			this.aClass8_14.method43();
			this.aClass6_Sub1_Sub3_Sub2_1.method467(0, 0, this.anInt1040);
			@Pc(52) byte local52;
			@Pc(64) int local64;
			if (this.anInt925 == 0) {
				this.aClass6_Sub1_Sub3_Sub4_2.method558(180, 7711145, 180, this.aClass30_Sub1_1.aString11, true);
				local52 = 80;
				this.aClass6_Sub1_Sub3_Sub4_4.method558(180, 16776960, 80, "Welcome to RuneScape", true);
				local64 = local52 + 30;
				this.aClass6_Sub1_Sub3_Sub2_2.method467(100, 27, this.anInt1040);
				this.aClass6_Sub1_Sub3_Sub4_4.method558(100, 16777215, 125, "New User", true);
				this.aClass6_Sub1_Sub3_Sub2_2.method467(100, 187, this.anInt1040);
				this.aClass6_Sub1_Sub3_Sub4_4.method558(260, 16777215, 125, "Existing User", true);
			}
			if (this.anInt925 == 2) {
				local52 = 60;
				if (this.aString27.length() > 0) {
					this.aClass6_Sub1_Sub3_Sub4_4.method558(180, 16776960, 45, this.aString27, true);
					this.aClass6_Sub1_Sub3_Sub4_4.method558(180, 16776960, 60, this.aString28, true);
					local64 = local52 + 30;
				} else {
					this.aClass6_Sub1_Sub3_Sub4_4.method558(180, 16776960, 53, this.aString28, true);
					local64 = local52 + 30;
				}
				this.aClass6_Sub1_Sub3_Sub4_4.method565(90, "Username: " + this.aString20 + (this.anInt932 == 0 & anInt1041 % 40 < 20 ? "@yel@|" : ""), 90, 16777215, this.anInt826, true);
				local64 += 15;
				this.aClass6_Sub1_Sub3_Sub4_4.method565(92, "Password: " + Class41.method486(this.aString21) + (this.anInt932 == 1 & anInt1041 % 40 < 20 ? "@yel@|" : ""), 105, 16777215, this.anInt826, true);
				local64 += 15;
				if (!arg0) {
					this.aClass6_Sub1_Sub3_Sub2_2.method467(130, 27, this.anInt1040);
					this.aClass6_Sub1_Sub3_Sub4_4.method558(100, 16777215, 155, "Login", true);
					this.aClass6_Sub1_Sub3_Sub2_2.method467(130, 187, this.anInt1040);
					this.aClass6_Sub1_Sub3_Sub4_4.method558(260, 16777215, 155, "Cancel", true);
				}
			}
			if (this.anInt925 == 3) {
				this.aClass6_Sub1_Sub3_Sub4_4.method558(180, 16776960, 40, "Create a free account", true);
				local52 = 65;
				this.aClass6_Sub1_Sub3_Sub4_4.method558(180, 16777215, 65, "To create a new account you need to", true);
				local64 = local52 + 15;
				this.aClass6_Sub1_Sub3_Sub4_4.method558(180, 16777215, 80, "go back to the main RuneScape webpage", true);
				local64 += 15;
				this.aClass6_Sub1_Sub3_Sub4_4.method558(180, 16777215, 95, "and choose the 'create account'", true);
				local64 += 15;
				this.aClass6_Sub1_Sub3_Sub4_4.method558(180, 16777215, 110, "button near the top of that page.", true);
				local64 += 15;
				this.aClass6_Sub1_Sub3_Sub2_2.method467(130, 107, this.anInt1040);
				this.aClass6_Sub1_Sub3_Sub4_4.method558(180, 16777215, 155, "Cancel", true);
			}
			this.aClass8_14.method44(202, super.aGraphics2, 171);
			if (this.aBoolean244) {
				this.aBoolean244 = false;
				this.aClass8_12.method44(128, super.aGraphics2, 0);
				this.aClass8_13.method44(202, super.aGraphics2, 371);
				this.aClass8_17.method44(0, super.aGraphics2, 265);
				this.aClass8_18.method44(562, super.aGraphics2, 265);
				this.aClass8_19.method44(128, super.aGraphics2, 171);
				this.aClass8_20.method44(562, super.aGraphics2, 171);
			}
		} catch (@Pc(504) RuntimeException local504) {
			signlink.reporterror("59687, " + -892 + ", " + arg0 + ", " + local504.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)Z")
	private boolean method672(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(18) int local18 = this.anIntArray218[arg0];
			if (local18 >= 2000) {
				local18 -= 2000;
			}
			return local18 == 675;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("96341, " + false + ", " + arg0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)Ljava/lang/String;")
	private String method673(@OriginalArg(0) int arg0) {
		try {
			this.anInt1004 += arg0;
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("76966, " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method582(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			if (this.aBoolean214 || this.aBoolean226 || this.aBoolean221) {
				this.method691();
			} else {
				anInt916++;
				if (this.aBoolean243) {
					this.method645();
				} else {
					this.method671(false);
				}
				this.anInt934 = 0;
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("79462, " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method674() {
		try {
			@Pc(9) int local9 = this.anInt920;
			@Pc(12) int local12 = this.anInt921;
			@Pc(15) int local15 = this.anInt922;
			@Pc(18) int local18 = this.anInt923;
			Class6_Sub1_Sub3.method549(local9, local15, local12, 6116423, local18);
			Class6_Sub1_Sub3.method549(local9 + 1, local15 - 2, local12 + 1, 0, 16);
			Class6_Sub1_Sub3.method550(local18 - 19, local15 - 2, local9 + 1, local12 + 18, 0, (byte) 1);
			this.aClass6_Sub1_Sub3_Sub4_4.method561("Choose Option", local12 + 14, 6116423, local9 + 3);
			@Pc(70) int local70 = super.anInt814;
			@Pc(73) int local73 = super.anInt815;
			if (this.anInt919 == 0) {
				local70 -= 4;
				local73 -= 4;
			}
			if (this.anInt919 == 1) {
				local70 -= 553;
				local73 -= 205;
			}
			if (this.anInt919 == 2) {
				local70 -= 17;
				local73 -= 357;
			}
			for (@Pc(92) int local92 = 0; local92 < this.anInt890; local92++) {
				@Pc(107) int local107 = local12 + 31 + (this.anInt890 - 1 - local92) * 15;
				@Pc(109) int local109 = 16777215;
				if (local70 > local9 && local70 < local9 + local15 && local73 > local107 - 13 && local73 < local107 + 3) {
					local109 = 16776960;
				}
				this.aClass6_Sub1_Sub3_Sub4_4.method565(local9 + 3, this.aStringArray9[local92], local107, local109, this.anInt826, true);
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("67264, " + -41188 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLclient!PQBRPYKE;)V")
	private void method675(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1_Sub4 arg1) {
		try {
			arg1.method249();
			@Pc(7) int local7 = arg1.method250(1);
			if (local7 != 0) {
				@Pc(24) int local24 = arg1.method250(2);
				if (local24 == 0) {
					this.anIntArray252[this.anInt988++] = this.anInt986;
				} else {
					@Pc(47) int local47;
					@Pc(57) int local57;
					if (local24 == 1) {
						local47 = arg1.method250(3);
						aClass6_Sub1_Sub2_Sub4_Sub2_1.method379(false, local47);
						local57 = arg1.method250(1);
						if (local57 == 1) {
							this.anIntArray252[this.anInt988++] = this.anInt986;
						}
					} else {
						@Pc(101) int local101;
						if (local24 == 2) {
							local47 = arg1.method250(3);
							aClass6_Sub1_Sub2_Sub4_Sub2_1.method379(true, local47);
							local57 = arg1.method250(3);
							aClass6_Sub1_Sub2_Sub4_Sub2_1.method379(true, local57);
							local101 = arg1.method250(1);
							if (local101 == 1) {
								this.anIntArray252[this.anInt988++] = this.anInt986;
							}
						} else if (local24 == 3) {
							local47 = arg1.method250(7);
							local57 = arg1.method250(1);
							this.anInt854 = arg1.method250(2);
							local101 = arg1.method250(7);
							@Pc(146) int local146 = arg1.method250(1);
							if (local146 == 1) {
								this.anIntArray252[this.anInt988++] = this.anInt986;
							}
							aClass6_Sub1_Sub2_Sub4_Sub2_1.method377(local101, local57 == 1, local47);
						}
					}
				}
			}
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("99429, " + arg0 + ", " + false + ", " + arg1 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLclient!ATOBWHST;IIIII)V")
	private void method676(@OriginalArg(0) int arg0, @OriginalArg(2) Class1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg1.anInt33 == 0 && arg1.anIntArray5 != null && !arg1.aBoolean5 && (arg6 >= arg4 && arg0 >= arg3 && arg6 <= arg4 + arg1.anInt34 && arg0 <= arg3 + arg1.anInt27)) {
				@Pc(40) int local40 = arg1.anIntArray5.length;
				for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
					@Pc(51) int local51 = arg1.anIntArray8[local42] + arg4;
					@Pc(60) int local60 = arg1.anIntArray7[local42] + arg3 - arg2;
					@Pc(66) Class1 local66 = Class1.method4(arg1.anIntArray5[local42]);
					@Pc(71) int local71 = local51 + local66.anInt7;
					@Pc(76) int local76 = local60 + local66.anInt31;
					if ((local66.anInt30 >= 0 || local66.anInt37 != 0) && arg6 >= local71 && arg0 >= local76 && arg6 < local71 + local66.anInt34 && arg0 < local76 + local66.anInt27) {
						if (local66.anInt30 >= 0) {
							this.anInt931 = local66.anInt30;
						} else {
							this.anInt931 = local66.anInt8;
						}
					}
					if (local66.anInt33 == 8 && arg6 >= local71 && arg0 >= local76 && arg6 < local71 + local66.anInt34 && arg0 < local76 + local66.anInt27) {
						this.anInt1003 = local66.anInt8;
					}
					if (local66.anInt33 == 0) {
						this.method676(arg0, local66, local66.anInt32, local76, local71, arg5, arg6);
						if (local66.anInt21 > local66.anInt27) {
							this.method657(local66.anInt27, arg0, arg5, local66, arg6, local66.anInt21, local71 + local66.anInt34, (byte) 9, local76);
						}
					} else {
						if (local66.anInt23 == 1 && arg6 >= local71 && arg0 >= local76 && arg6 < local71 + local66.anInt34 && arg0 < local76 + local66.anInt27) {
							@Pc(200) boolean local200 = false;
							if (local66.anInt12 != 0) {
								local200 = this.method707(local66);
							}
							if (!local200) {
								this.aStringArray9[this.anInt890] = local66.aString2;
								this.anIntArray218[this.anInt890] = 349;
								this.anIntArray217[this.anInt890] = local66.anInt8;
								this.anInt890++;
							}
						}
						if (local66.anInt23 == 2 && this.anInt990 == 0 && arg6 >= local71 && arg0 >= local76 && arg6 < local71 + local66.anInt34 && arg0 < local76 + local66.anInt27) {
							@Pc(264) String local264 = local66.aString4;
							if (local264.indexOf(" ") != -1) {
								local264 = local264.substring(0, local264.indexOf(" "));
							}
							this.aStringArray9[this.anInt890] = local264 + " @gre@" + local66.aString5;
							this.anIntArray218[this.anInt890] = 1;
							this.anIntArray217[this.anInt890] = local66.anInt8;
							this.anInt890++;
						}
						if (local66.anInt23 == 3 && arg6 >= local71 && arg0 >= local76 && arg6 < local71 + local66.anInt34 && arg0 < local76 + local66.anInt27) {
							this.aStringArray9[this.anInt890] = "Close";
							if (arg5 == 3) {
								this.anIntArray218[this.anInt890] = 699;
							} else {
								this.anIntArray218[this.anInt890] = 969;
							}
							this.anIntArray217[this.anInt890] = local66.anInt8;
							this.anInt890++;
						}
						if (local66.anInt23 == 4 && arg6 >= local71 && arg0 >= local76 && arg6 < local71 + local66.anInt34 && arg0 < local76 + local66.anInt27) {
							this.aStringArray9[this.anInt890] = local66.aString2;
							this.anIntArray218[this.anInt890] = 915;
							this.anIntArray217[this.anInt890] = local66.anInt8;
							this.anInt890++;
						}
						if (local66.anInt23 == 5 && arg6 >= local71 && arg0 >= local76 && arg6 < local71 + local66.anInt34 && arg0 < local76 + local66.anInt27) {
							this.aStringArray9[this.anInt890] = local66.aString2;
							this.anIntArray218[this.anInt890] = 843;
							this.anIntArray217[this.anInt890] = local66.anInt8;
							this.anInt890++;
						}
						if (local66.anInt23 == 6 && !this.aBoolean245 && arg6 >= local71 && arg0 >= local76 && arg6 < local71 + local66.anInt34 && arg0 < local76 + local66.anInt27) {
							this.aStringArray9[this.anInt890] = local66.aString2;
							this.anIntArray218[this.anInt890] = 268;
							this.anIntArray217[this.anInt890] = local66.anInt8;
							this.anInt890++;
						}
						if (local66.anInt33 == 2) {
							@Pc(523) int local523 = 0;
							for (@Pc(525) int local525 = 0; local525 < local66.anInt27; local525++) {
								for (@Pc(529) int local529 = 0; local529 < local66.anInt34; local529++) {
									@Pc(540) int local540 = local71 + local529 * (32 + local66.anInt13);
									@Pc(549) int local549 = local76 + local525 * (32 + local66.anInt25);
									if (local523 < 20) {
										local540 += local66.anIntArray3[local523];
										local549 += local66.anIntArray4[local523];
									}
									if (arg6 >= local540 && arg0 >= local549 && arg6 < local540 + 32 && arg0 < local549 + 32) {
										this.anInt1032 = local523;
										this.anInt1033 = local66.anInt8;
										if (local66.anIntArray9[local523] > 0) {
											@Pc(602) Class35 local602 = Class35.method370(local66.anIntArray9[local523] - 1);
											if (this.anInt1042 == 1 && local66.aBoolean1) {
												if (local66.anInt8 != this.anInt1044 || local523 != this.anInt1043) {
													this.aStringArray9[this.anInt890] = "Use " + this.aString31 + " with @lre@" + local602.aString14;
													this.anIntArray218[this.anInt890] = 247;
													this.anIntArray219[this.anInt890] = local602.anInt559;
													this.anIntArray216[this.anInt890] = local523;
													this.anIntArray217[this.anInt890] = local66.anInt8;
													this.anInt890++;
												}
											} else if (this.anInt990 != 1 || !local66.aBoolean1) {
												@Pc(739) int local739;
												if (local66.aBoolean1) {
													for (local739 = 4; local739 >= 3; local739--) {
														if (local602.aStringArray6 != null && local602.aStringArray6[local739] != null) {
															this.aStringArray9[this.anInt890] = local602.aStringArray6[local739] + " @lre@" + local602.aString14;
															if (local739 == 3) {
																this.anIntArray218[this.anInt890] = 115;
															}
															if (local739 == 4) {
																this.anIntArray218[this.anInt890] = 547;
															}
															this.anIntArray219[this.anInt890] = local602.anInt559;
															this.anIntArray216[this.anInt890] = local523;
															this.anIntArray217[this.anInt890] = local66.anInt8;
															this.anInt890++;
														} else if (local739 == 4) {
															this.aStringArray9[this.anInt890] = "Drop @lre@" + local602.aString14;
															this.anIntArray218[this.anInt890] = 547;
															this.anIntArray219[this.anInt890] = local602.anInt559;
															this.anIntArray216[this.anInt890] = local523;
															this.anIntArray217[this.anInt890] = local66.anInt8;
															this.anInt890++;
														}
													}
												}
												if (local66.aBoolean3) {
													this.aStringArray9[this.anInt890] = "Use @lre@" + local602.aString14;
													this.anIntArray218[this.anInt890] = 253;
													this.anIntArray219[this.anInt890] = local602.anInt559;
													this.anIntArray216[this.anInt890] = local523;
													this.anIntArray217[this.anInt890] = local66.anInt8;
													this.anInt890++;
												}
												if (local66.aBoolean1 && local602.aStringArray6 != null) {
													for (local739 = 2; local739 >= 0; local739--) {
														if (local602.aStringArray6[local739] != null) {
															this.aStringArray9[this.anInt890] = local602.aStringArray6[local739] + " @lre@" + local602.aString14;
															if (local739 == 0) {
																this.anIntArray218[this.anInt890] = 479;
															}
															if (local739 == 1) {
																this.anIntArray218[this.anInt890] = 940;
															}
															if (local739 == 2) {
																this.anIntArray218[this.anInt890] = 193;
															}
															this.anIntArray219[this.anInt890] = local602.anInt559;
															this.anIntArray216[this.anInt890] = local523;
															this.anIntArray217[this.anInt890] = local66.anInt8;
															this.anInt890++;
														}
													}
												}
												if (local66.aStringArray1 != null) {
													for (local739 = 4; local739 >= 0; local739--) {
														if (local66.aStringArray1[local739] != null) {
															this.aStringArray9[this.anInt890] = local66.aStringArray1[local739] + " @lre@" + local602.aString14;
															if (local739 == 0) {
																this.anIntArray218[this.anInt890] = 5;
															}
															if (local739 == 1) {
																this.anIntArray218[this.anInt890] = 871;
															}
															if (local739 == 2) {
																this.anIntArray218[this.anInt890] = 123;
															}
															if (local739 == 3) {
																this.anIntArray218[this.anInt890] = 850;
															}
															if (local739 == 4) {
																this.anIntArray218[this.anInt890] = 670;
															}
															this.anIntArray219[this.anInt890] = local602.anInt559;
															this.anIntArray216[this.anInt890] = local523;
															this.anIntArray217[this.anInt890] = local66.anInt8;
															this.anInt890++;
														}
													}
												}
												this.aStringArray9[this.anInt890] = "Examine @lre@" + local602.aString14;
												this.anIntArray218[this.anInt890] = 1327;
												this.anIntArray219[this.anInt890] = local602.anInt559;
												this.anIntArray216[this.anInt890] = local523;
												this.anIntArray217[this.anInt890] = local66.anInt8;
												this.anInt890++;
											} else if ((this.anInt992 & 0x10) == 16) {
												this.aStringArray9[this.anInt890] = this.aString29 + " @lre@" + local602.aString14;
												this.anIntArray218[this.anInt890] = 419;
												this.anIntArray219[this.anInt890] = local602.anInt559;
												this.anIntArray216[this.anInt890] = local523;
												this.anIntArray217[this.anInt890] = local66.anInt8;
												this.anInt890++;
											}
										}
									}
									local523++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1169) RuntimeException local1169) {
			signlink.reporterror("1690, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local1169.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method580() {
		try {
			if (!this.aBoolean214 && !this.aBoolean226 && !this.aBoolean221) {
				anInt1041++;
				if (this.aBoolean243) {
					this.method696();
				} else {
					this.method678(this.aByte58);
				}
				this.method624((byte) 7);
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("20214, " + 0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method677() {
		try {
			if (15536 != this.anInt997) {
				this.anInt1040 = this.aClass42_2.method514();
			}
			if (this.anInt890 >= 2 || this.anInt1042 != 0 || this.anInt990 != 0) {
				@Pc(40) String local40;
				if (this.anInt1042 == 1 && this.anInt890 < 2) {
					local40 = "Use " + this.aString31 + " with...";
				} else if (this.anInt990 == 1 && this.anInt890 < 2) {
					local40 = this.aString29 + "...";
				} else {
					local40 = this.aStringArray9[this.anInt890 - 1];
				}
				if (this.anInt890 > 2) {
					local40 = local40 + "@whi@ / " + (this.anInt890 - 2) + " more options";
				}
				this.aClass6_Sub1_Sub3_Sub4_4.method566(16777215, local40, anInt1041 / 1000, 4, 15);
			}
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("52537, " + 15536 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method678(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != -119) {
				this.aClass40ArrayArrayArray1 = null;
			}
			@Pc(17) int local17;
			@Pc(24) int local24;
			if (this.anInt925 == 0) {
				local17 = super.anInt810 / 2 - 80;
				local24 = super.anInt811 / 2 + 20;
				local24 += 20;
				if (super.anInt819 == 1 && super.anInt820 >= local17 - 75 && super.anInt820 <= local17 + 75 && super.anInt821 >= local24 - 20 && super.anInt821 <= local24 + 20) {
					this.anInt925 = 3;
					this.anInt932 = 0;
				}
				local17 = super.anInt810 / 2 + 80;
				if (super.anInt819 == 1 && super.anInt820 >= local17 - 75 && super.anInt820 <= local17 + 75 && super.anInt821 >= local24 - 20 && super.anInt821 <= local24 + 20) {
					this.aString27 = "";
					this.aString28 = "Enter your username & password.";
					this.anInt925 = 2;
					this.anInt932 = 0;
				}
			} else if (this.anInt925 == 2) {
				local17 = super.anInt811 / 2 - 40;
				local17 += 30;
				local17 += 25;
				if (super.anInt819 == 1 && super.anInt821 >= local17 - 15 && super.anInt821 < local17) {
					this.anInt932 = 0;
				}
				local17 += 15;
				if (super.anInt819 == 1 && super.anInt821 >= local17 - 15 && super.anInt821 < local17) {
					this.anInt932 = 1;
				}
				local17 += 15;
				local24 = super.anInt810 / 2 - 80;
				@Pc(170) int local170 = super.anInt811 / 2 + 50;
				@Pc(171) int local171 = local170 + 20;
				if (super.anInt819 == 1 && super.anInt820 >= local24 - 75 && super.anInt820 <= local24 + 75 && super.anInt821 >= local171 - 20 && super.anInt821 <= local171 + 20) {
					this.anInt846 = 0;
					this.method603(this.aString20, this.aString21, false);
					if (this.aBoolean243) {
						return;
					}
				}
				local24 = super.anInt810 / 2 + 80;
				if (super.anInt819 == 1 && super.anInt820 >= local24 - 75 && super.anInt820 <= local24 + 75 && super.anInt821 >= local171 - 20 && super.anInt821 <= local171 + 20) {
					this.anInt925 = 0;
					this.aString20 = "";
					this.aString21 = "";
				}
				while (true) {
					while (true) {
						@Pc(261) int local261 = this.method578();
						if (local261 == -1) {
							return;
						}
						@Pc(266) boolean local266 = false;
						for (@Pc(268) int local268 = 0; local268 < aString26.length(); local268++) {
							if (local261 == aString26.charAt(local268)) {
								local266 = true;
								break;
							}
						}
						if (this.anInt932 == 0) {
							if (local261 == 8 && this.aString20.length() > 0) {
								this.aString20 = this.aString20.substring(0, this.aString20.length() - 1);
							}
							if (local261 == 9 || local261 == 10 || local261 == 13) {
								this.anInt932 = 1;
							}
							if (local266) {
								this.aString20 = this.aString20 + (char) local261;
							}
							if (this.aString20.length() > 12) {
								this.aString20 = this.aString20.substring(0, 12);
							}
						} else if (this.anInt932 == 1) {
							if (local261 == 8 && this.aString21.length() > 0) {
								this.aString21 = this.aString21.substring(0, this.aString21.length() - 1);
							}
							if (local261 == 9 || local261 == 10 || local261 == 13) {
								this.anInt932 = 0;
							}
							if (local266) {
								this.aString21 = this.aString21 + (char) local261;
							}
							if (this.aString21.length() > 20) {
								this.aString21 = this.aString21.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt925 == 3) {
				local17 = super.anInt810 / 2;
				local24 = super.anInt811 / 2 + 50;
				@Pc(425) int local425 = local24 + 20;
				if (super.anInt819 == 1 && super.anInt820 >= local17 - 75 && super.anInt820 <= local17 + 75 && super.anInt821 >= local425 - 20 && super.anInt821 <= local425 + 20) {
					this.anInt925 = 0;
					return;
				}
			}
		} catch (@Pc(458) RuntimeException local458) {
			signlink.reporterror("53503, " + arg0 + ", " + local458.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!JRELGTVY;II)V")
	private void method679(@OriginalArg(0) int arg0, @OriginalArg(2) Class20 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (this.anInt890 < 400) {
				if (arg1.anIntArray82 != null) {
					arg1 = arg1.method147();
				}
				if (arg1 != null && arg1.aBoolean78) {
					@Pc(28) String local28 = arg1.aString9;
					if (arg1.anInt293 != 0) {
						local28 = local28 + method659(arg1.anInt293, aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt628) + " (level-" + arg1.anInt293 + ")";
					}
					if (this.anInt1042 == 1) {
						this.aStringArray9[this.anInt890] = "Use " + this.aString31 + " with @yel@" + local28;
						this.anIntArray218[this.anInt890] = 564;
						this.anIntArray219[this.anInt890] = arg2;
						this.anIntArray216[this.anInt890] = arg0;
						this.anIntArray217[this.anInt890] = arg3;
						this.anInt890++;
					} else if (this.anInt990 != 1) {
						@Pc(166) int local166;
						if (arg1.aStringArray4 != null) {
							for (local166 = 4; local166 >= 0; local166--) {
								if (arg1.aStringArray4[local166] != null && !arg1.aStringArray4[local166].equalsIgnoreCase("attack")) {
									this.aStringArray9[this.anInt890] = arg1.aStringArray4[local166] + " @yel@" + local28;
									if (local166 == 0) {
										this.anIntArray218[this.anInt890] = 165;
									}
									if (local166 == 1) {
										this.anIntArray218[this.anInt890] = 19;
									}
									if (local166 == 2) {
										this.anIntArray218[this.anInt890] = 857;
									}
									if (local166 == 3) {
										this.anIntArray218[this.anInt890] = 659;
									}
									if (local166 == 4) {
										this.anIntArray218[this.anInt890] = 619;
									}
									this.anIntArray219[this.anInt890] = arg2;
									this.anIntArray216[this.anInt890] = arg0;
									this.anIntArray217[this.anInt890] = arg3;
									this.anInt890++;
								}
							}
						}
						if (arg1.aStringArray4 != null) {
							for (local166 = 4; local166 >= 0; local166--) {
								if (arg1.aStringArray4[local166] != null && arg1.aStringArray4[local166].equalsIgnoreCase("attack")) {
									@Pc(290) short local290 = 0;
									if (arg1.anInt293 > aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt628) {
										local290 = 2000;
									}
									this.aStringArray9[this.anInt890] = arg1.aStringArray4[local166] + " @yel@" + local28;
									if (local166 == 0) {
										this.anIntArray218[this.anInt890] = 165 + local290;
									}
									if (local166 == 1) {
										this.anIntArray218[this.anInt890] = 19 + local290;
									}
									if (local166 == 2) {
										this.anIntArray218[this.anInt890] = 857 + local290;
									}
									if (local166 == 3) {
										this.anIntArray218[this.anInt890] = 659 + local290;
									}
									if (local166 == 4) {
										this.anIntArray218[this.anInt890] = 619 + local290;
									}
									this.anIntArray219[this.anInt890] = arg2;
									this.anIntArray216[this.anInt890] = arg0;
									this.anIntArray217[this.anInt890] = arg3;
									this.anInt890++;
								}
							}
						}
						this.aStringArray9[this.anInt890] = "Examine @yel@" + local28;
						this.anIntArray218[this.anInt890] = 1505;
						this.anIntArray219[this.anInt890] = arg2;
						this.anIntArray216[this.anInt890] = arg0;
						this.anIntArray217[this.anInt890] = arg3;
						this.anInt890++;
					} else if ((this.anInt992 & 0x2) == 2) {
						this.aStringArray9[this.anInt890] = this.aString29 + " @yel@" + local28;
						this.anIntArray218[this.anInt890] = 257;
						this.anIntArray219[this.anInt890] = arg2;
						this.anIntArray216[this.anInt890] = arg0;
						this.anIntArray217[this.anInt890] = arg3;
						this.anInt890++;
						return;
					}
				}
			}
		} catch (@Pc(440) RuntimeException local440) {
			signlink.reporterror("95968, " + arg0 + ", " + -126 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local440.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
	private void method680() {
		try {
			this.aClass8_24.method43();
			Class6_Sub1_Sub3_Sub1.anIntArray124 = this.anIntArray244;
			this.aClass6_Sub1_Sub3_Sub2_15.method467(0, 0, this.anInt1040);
			if (this.aBoolean216) {
				this.aClass6_Sub1_Sub3_Sub4_4.method557(this.aString24, 239, 0, 40);
				this.aClass6_Sub1_Sub3_Sub4_4.method557(this.aString18 + "*", 239, 128, 60);
			} else if (this.anInt1018 == 1) {
				this.aClass6_Sub1_Sub3_Sub4_4.method557("Enter amount:", 239, 0, 40);
				this.aClass6_Sub1_Sub3_Sub4_4.method557(this.aString17 + "*", 239, 128, 60);
			} else if (this.anInt1018 == 2) {
				this.aClass6_Sub1_Sub3_Sub4_4.method557("Enter name:", 239, 0, 40);
				this.aClass6_Sub1_Sub3_Sub4_4.method557(this.aString17 + "*", 239, 128, 60);
			} else {
				@Pc(134) Class6_Sub1_Sub3_Sub4 local134;
				@Pc(142) int local142;
				@Pc(153) int local153;
				if (this.anInt1018 == 3) {
					if (this.aString17 != this.aString19) {
						this.method683(this.aString17, this.anInt967);
						this.aString19 = this.aString17;
					}
					local134 = this.aClass6_Sub1_Sub3_Sub4_3;
					Class6_Sub1_Sub3.method546(0, 77, 0, 463);
					for (local142 = 0; local142 < this.anInt849; local142++) {
						local153 = 18 + local142 * 14 - this.anInt850;
						if (local153 > 0 && local153 < 110) {
							local134.method557(this.aStringArray8[local142], 239, 0, local153);
						}
					}
					Class6_Sub1_Sub3.method545();
					if (this.anInt849 > 5) {
						this.method599(this.anInt850, this.anInt849 * 14 + 7, 77, 0, 463);
					}
					if (this.aString17.length() == 0) {
						this.aClass6_Sub1_Sub3_Sub4_4.method557("Enter object name", 239, 255, 40);
					} else if (this.anInt849 == 0) {
						this.aClass6_Sub1_Sub3_Sub4_4.method557("No matching objects found, please shorten search", 239, 0, 40);
					}
					local134.method557(this.aString17 + "*", 239, 0, 90);
					Class6_Sub1_Sub3.method552(0, 77, 479, 0);
				} else if (this.aString23 != null) {
					this.aClass6_Sub1_Sub3_Sub4_4.method557(this.aString23, 239, 0, 40);
					this.aClass6_Sub1_Sub3_Sub4_4.method557("Click to continue", 239, 128, 60);
				} else if (this.anInt979 != -1) {
					this.method617(0, Class1.method4(this.anInt979), this.anInt857, 0, 0);
				} else if (this.anInt976 == -1) {
					local134 = this.aClass6_Sub1_Sub3_Sub4_3;
					local142 = 0;
					Class6_Sub1_Sub3.method546(0, 77, 0, 463);
					for (local153 = 0; local153 < 100; local153++) {
						if (this.aStringArray13[local153] != null) {
							@Pc(320) int local320 = this.anIntArray243[local153];
							@Pc(329) int local329 = 70 - local142 * 14 + this.anInt935;
							@Pc(334) String local334 = this.aStringArray12[local153];
							@Pc(336) byte local336 = 0;
							if (local334 != null && local334.startsWith("@cr1@")) {
								local334 = local334.substring(5);
								local336 = 1;
							}
							if (local334 != null && local334.startsWith("@cr2@")) {
								local334 = local334.substring(5);
								local336 = 2;
							}
							if (local320 == 0) {
								if (local329 > 0 && local329 < 110) {
									local134.method561(this.aStringArray13[local153], local329, 0, 4);
								}
								local142++;
							}
							@Pc(406) int local406;
							if ((local320 == 1 || local320 == 2) && (local320 == 1 || this.anInt964 == 0 || this.anInt964 == 1 && this.method702(local334))) {
								if (local329 > 0 && local329 < 110) {
									local406 = 4;
									if (local336 == 1) {
										this.aClass6_Sub1_Sub3_Sub2Array3[0].method467(local329 - 12, 4, this.anInt1040);
										local406 += 14;
									}
									if (local336 == 2) {
										this.aClass6_Sub1_Sub3_Sub2Array3[1].method467(local329 - 12, local406, this.anInt1040);
										local406 += 14;
									}
									local134.method561(local334 + ":", local329, 0, local406);
									local406 += local134.method559(local334) + 8;
									local134.method561(this.aStringArray13[local153], local329, 255, local406);
								}
								local142++;
							}
							if ((local320 == 3 || local320 == 7) && this.anInt907 == 0 && (local320 == 7 || this.anInt933 == 0 || this.anInt933 == 1 && this.method702(local334))) {
								if (local329 > 0 && local329 < 110) {
									local134.method561("From", local329, 0, 4);
									local406 = 4 + local134.method559("From ");
									if (local336 == 1) {
										this.aClass6_Sub1_Sub3_Sub2Array3[0].method467(local329 - 12, local406, this.anInt1040);
										local406 += 14;
									}
									if (local336 == 2) {
										this.aClass6_Sub1_Sub3_Sub2Array3[1].method467(local329 - 12, local406, this.anInt1040);
										local406 += 14;
									}
									local134.method561(local334 + ":", local329, 0, local406);
									local406 += local134.method559(local334) + 8;
									local134.method561(this.aStringArray13[local153], local329, 8388608, local406);
								}
								local142++;
							}
							if (local320 == 4 && (this.anInt858 == 0 || this.anInt858 == 1 && this.method702(local334))) {
								if (local329 > 0 && local329 < 110) {
									local134.method561(local334 + " " + this.aStringArray13[local153], local329, 8388736, 4);
								}
								local142++;
							}
							if (local320 == 5 && this.anInt907 == 0 && this.anInt933 < 2) {
								if (local329 > 0 && local329 < 110) {
									local134.method561(this.aStringArray13[local153], local329, 8388608, 4);
								}
								local142++;
							}
							if (local320 == 6 && this.anInt907 == 0 && this.anInt933 < 2) {
								if (local329 > 0 && local329 < 110) {
									local134.method561("To " + local334 + ":", local329, 0, 4);
									local134.method561(this.aStringArray13[local153], local329, 8388608, 12 + local134.method559("To " + local334));
								}
								local142++;
							}
							if (local320 == 8 && (this.anInt858 == 0 || this.anInt858 == 1 && this.method702(local334))) {
								if (local329 > 0 && local329 < 110) {
									local134.method561(local334 + " " + this.aStringArray13[local153], local329, 8270336, 4);
								}
								local142++;
							}
						}
					}
					Class6_Sub1_Sub3.method545();
					this.anInt999 = local142 * 14 + 7;
					if (this.anInt999 < 78) {
						this.anInt999 = 78;
					}
					this.method599(this.anInt999 - this.anInt935 - 77, this.anInt999, 77, 0, 463);
					@Pc(780) String local780;
					if (aClass6_Sub1_Sub2_Sub4_Sub2_1 == null || aClass6_Sub1_Sub2_Sub4_Sub2_1.aString16 == null) {
						local780 = Class41.method485(this.aString20);
					} else {
						local780 = aClass6_Sub1_Sub2_Sub4_Sub2_1.aString16;
					}
					local134.method561(local780 + ":", 90, 0, 4);
					local134.method561(this.aString25 + "*", 90, 255, 6 + local134.method559(local780 + ": "));
					Class6_Sub1_Sub3.method552(0, 77, 479, 0);
				} else {
					this.method617(0, Class1.method4(this.anInt976), this.anInt857, 0, 0);
				}
			}
			if (this.aBoolean217 && this.anInt919 == 2) {
				this.method674();
			}
			this.aClass8_24.method44(17, super.aGraphics2, 357);
			this.aClass8_23.method43();
			Class6_Sub1_Sub3_Sub1.anIntArray124 = this.anIntArray246;
		} catch (@Pc(861) RuntimeException local861) {
			signlink.reporterror("97174, " + 0 + ", " + local861.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method681(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			for (@Pc(10) Class6_Sub1_Sub2_Sub3 local10 = (Class6_Sub1_Sub2_Sub3) this.aClass40_10.method472(); local10 != null; local10 = (Class6_Sub1_Sub2_Sub3) this.aClass40_10.method474()) {
				if (local10.anInt194 != this.anInt854 || local10.aBoolean62) {
					local10.method542();
				} else if (anInt1041 >= local10.anInt191) {
					local10.method127(this.anInt880);
					if (local10.aBoolean62) {
						local10.method542();
					} else {
						this.aClass38_1.method408(-1, local10, false, local10.anInt194, local10.anInt197, 60, local10.anInt195, 0, local10.anInt196);
					}
				}
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("55489, " + arg0 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method682() {
		try {
			@Pc(7) byte[] local7 = this.aClass43_2.method518("title.dat", (byte[]) null);
			@Pc(13) Class6_Sub1_Sub3_Sub3 local13 = new Class6_Sub1_Sub3_Sub3(local7, this);
			this.aClass8_15.method43();
			local13.method504(0, 0);
			this.aClass8_16.method43();
			local13.method504(-637, 0);
			this.aClass8_12.method43();
			local13.method504(-128, 0);
			this.aClass8_13.method43();
			local13.method504(-202, -371);
			this.aClass8_14.method43();
			local13.method504(-202, -171);
			this.aClass8_17.method43();
			local13.method504(0, -265);
			this.aClass8_18.method43();
			local13.method504(-562, -265);
			this.aClass8_19.method43();
			local13.method504(-128, -171);
			this.aClass8_20.method43();
			local13.method504(-562, -171);
			@Pc(98) int[] local98 = new int[local13.anInt726];
			for (@Pc(100) int local100 = 0; local100 < local13.anInt727; local100++) {
				for (@Pc(104) int local104 = 0; local104 < local13.anInt726; local104++) {
					local98[local104] = local13.anIntArray193[local13.anInt726 - local104 - 1 + local13.anInt726 * local100];
				}
				for (@Pc(130) int local130 = 0; local130 < local13.anInt726; local130++) {
					local13.anIntArray193[local130 + local13.anInt726 * local100] = local98[local130];
				}
			}
			this.aClass8_15.method43();
			local13.method504(382, 0);
			this.aClass8_16.method43();
			local13.method504(-255, 0);
			this.aClass8_12.method43();
			local13.method504(254, 0);
			this.aClass8_13.method43();
			local13.method504(180, -371);
			this.aClass8_14.method43();
			local13.method504(180, -171);
			this.aClass8_17.method43();
			local13.method504(382, -265);
			this.aClass8_18.method43();
			local13.method504(-180, -265);
			this.aClass8_19.method43();
			local13.method504(254, -171);
			this.aClass8_20.method43();
			local13.method504(-180, -171);
			local13 = new Class6_Sub1_Sub3_Sub3(this.aClass43_2, "logo", 0);
			this.aClass8_12.method43();
			local13.method506(18, 382 - local13.anInt726 / 2 - 128, this.anInt1040);
			System.gc();
		} catch (@Pc(272) RuntimeException local272) {
			signlink.reporterror("75558, " + false + ", " + local272.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method683(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 != -11116) {
				this.aClass6_Sub1_Sub4_6.method229(55);
			}
			if (arg0 == null || arg0.length() == 0) {
				this.anInt849 = 0;
			} else {
				@Pc(19) String local19 = arg0;
				@Pc(22) String[] local22 = new String[100];
				@Pc(24) int local24 = 0;
				while (true) {
					@Pc(28) int local28 = local19.indexOf(" ");
					if (local28 == -1) {
						local19 = local19.trim();
						if (local19.length() > 0) {
							local22[local24++] = local19.toLowerCase();
						}
						this.anInt849 = 0;
						label52: for (local28 = 0; local28 < Class35.anInt552; local28++) {
							@Pc(77) Class35 local77 = Class35.method370(local28);
							if (local77.anInt553 == -1 && local77.aString14 != null) {
								@Pc(88) String local88 = local77.aString14.toLowerCase();
								for (@Pc(90) int local90 = 0; local90 < local24; local90++) {
									if (local88.indexOf(local22[local90]) == -1) {
										continue label52;
									}
								}
								this.aStringArray8[this.anInt849] = local88;
								this.anIntArray214[this.anInt849] = local28;
								this.anInt849++;
								if (this.anInt849 >= this.aStringArray8.length) {
									return;
								}
							}
						}
						return;
					}
					@Pc(37) String local37 = local19.substring(0, local28).trim();
					if (local37.length() > 0) {
						local22[local24++] = local37.toLowerCase();
					}
					local19 = local19.substring(local28 + 1);
				}
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("56537, " + arg0 + ", " + arg1 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)I")
	private int method684() {
		try {
			@Pc(3) int local3 = 3;
			this.aBoolean243 &= true;
			if (this.anInt1012 < 310) {
				@Pc(18) int local18 = this.anInt1009 >> 7;
				@Pc(23) int local23 = this.anInt1011 >> 7;
				@Pc(28) int local28 = aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt583 >> 7;
				@Pc(33) int local33 = aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt584 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt854][local18][local23] & 0x4) != 0) {
					local3 = this.anInt854;
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
						if ((this.aByteArrayArrayArray8[this.anInt854][local18][local23] & 0x4) != 0) {
							local3 = this.anInt854;
						}
						local85 += local83;
						if (local85 >= 65536) {
							local85 -= 65536;
							if (local23 < local33) {
								local23++;
							} else if (local23 > local33) {
								local23--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt854][local18][local23] & 0x4) != 0) {
								local3 = this.anInt854;
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
						if ((this.aByteArrayArrayArray8[this.anInt854][local18][local23] & 0x4) != 0) {
							local3 = this.anInt854;
						}
						local85 += local83;
						if (local85 >= 65536) {
							local85 -= 65536;
							if (local18 < local28) {
								local18++;
							} else if (local18 > local28) {
								local18--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt854][local18][local23] & 0x4) != 0) {
								local3 = this.anInt854;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt854][aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt583 >> 7][aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt584 >> 7] & 0x4) != 0) {
				local3 = this.anInt854;
			}
			return local3;
		} catch (@Pc(251) RuntimeException local251) {
			signlink.reporterror("10350, " + true + ", " + local251.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)I")
	private int method685() {
		try {
			@Pc(9) int local9 = this.method635(this.anInt854, this.anInt1011, this.anInt1009);
			return local9 - this.anInt1010 >= 800 || (this.aByteArrayArrayArray8[this.anInt854][this.anInt1009 >> 7][this.anInt1011 >> 7] & 0x4) == 0 ? 3 : this.anInt854;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("69340, " + false + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!PQBRPYKE;Lclient!TPTANZXN;IB)V")
	private void method686(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub1_Sub4 arg1, @OriginalArg(2) Class6_Sub1_Sub2_Sub4_Sub2 arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(17) int local17;
			@Pc(20) int local20;
			if ((arg3 & 0x400) != 0) {
				local17 = arg1.method259();
				local20 = arg1.method239();
				arg2.method380(anInt1041, local17, local20);
				arg2.anInt567 = anInt1041 + 300;
				arg2.anInt568 = arg1.method239();
				arg2.anInt569 = arg1.method260(this.anInt856);
			}
			if ((arg3 & 0x40) != 0) {
				local17 = arg1.method258();
				local20 = arg1.method259();
				arg2.method380(anInt1041, local17, local20);
				arg2.anInt567 = anInt1041 + 300;
				arg2.anInt568 = arg1.method258();
				arg2.anInt569 = arg1.method260(this.anInt856);
			}
			if ((arg3 & 0x1) != 0) {
				arg2.aString15 = arg1.method246();
				if (arg2.aString15.charAt(0) == '~') {
					arg2.aString15 = arg2.aString15.substring(1);
					this.method670(arg2.aString15, arg2.aString16, 2);
				} else if (arg2 == aClass6_Sub1_Sub2_Sub4_Sub2_1) {
					this.method670(arg2.aString15, arg2.aString16, 2);
				}
				arg2.anInt598 = 0;
				arg2.anInt608 = 0;
				arg2.anInt601 = 150;
			}
			if ((arg3 & 0x100) != 0) {
				arg2.anInt570 = arg1.method260(this.anInt856);
				arg2.anInt572 = arg1.method239();
				arg2.anInt571 = arg1.method260(this.anInt856);
				arg2.anInt573 = arg1.method239();
				arg2.anInt574 = arg1.method241() + anInt1041;
				arg2.anInt575 = arg1.method267() + anInt1041;
				arg2.anInt576 = arg1.method258();
				arg2.method378();
			}
			if ((arg3 & 0x200) != 0) {
				arg2.anInt592 = arg1.method267();
				local17 = arg1.method244();
				arg2.anInt596 = local17 >> 16;
				arg2.anInt595 = anInt1041 + (local17 & 0xFFFF);
				arg2.anInt593 = 0;
				arg2.anInt594 = 0;
				if (arg2.anInt595 > anInt1041) {
					arg2.anInt593 = -1;
				}
				if (arg2.anInt592 == 65535) {
					arg2.anInt592 = -1;
				}
			}
			if ((arg3 & 0x4) != 0) {
				local17 = arg1.method260(this.anInt856);
				@Pc(226) byte[] local226 = new byte[local17];
				@Pc(232) Class6_Sub1_Sub4 local232 = new Class6_Sub1_Sub4(888, local226);
				arg1.method275(local226, local17);
				this.aClass6_Sub1_Sub4Array1[arg0] = local232;
				arg2.method382(local232);
			}
			@Pc(264) int local264;
			if ((arg3 & 0x10) != 0) {
				local17 = arg1.method267();
				local20 = arg1.method260(this.anInt856);
				local264 = arg1.method259();
				@Pc(267) int local267 = arg1.anInt390;
				if (arg2.aString16 != null && arg2.aBoolean145) {
					@Pc(277) long local277 = Class41.method481(arg2.aString16);
					@Pc(279) boolean local279 = false;
					if (local20 <= 1) {
						for (@Pc(284) int local284 = 0; local284 < this.anInt843; local284++) {
							if (this.aLongArray3[local284] == local277) {
								local279 = true;
								break;
							}
						}
					}
					if (!local279 && this.anInt1049 == 0) {
						try {
							this.aClass6_Sub1_Sub4_8.anInt390 = 0;
							arg1.method275(this.aClass6_Sub1_Sub4_8.aByteArray12, local264);
							this.aClass6_Sub1_Sub4_8.anInt390 = 0;
							@Pc(329) String local329 = Class13.method112(local264, this.aClass6_Sub1_Sub4_8);
							@Pc(333) String local333 = Class34.method313(local329);
							arg2.aString15 = local333;
							arg2.anInt598 = local17 >> 8;
							arg2.anInt608 = local17 & 0xFF;
							arg2.anInt601 = 150;
							if (local20 == 2 || local20 == 3) {
								this.method670(local333, "@cr2@" + arg2.aString16, 1);
							} else if (local20 == 1) {
								this.method670(local333, "@cr1@" + arg2.aString16, 1);
							} else {
								this.method670(local333, arg2.aString16, 2);
							}
						} catch (@Pc(397) Exception local397) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg1.anInt390 = local267 + local264;
			}
			if ((arg3 & 0x20) != 0) {
				local17 = arg1.method269((byte) 2);
				if (local17 == 65535) {
					local17 = -1;
				}
				local20 = arg1.method260(this.anInt856);
				if (local17 == arg2.anInt609 && local17 != -1) {
					local264 = Class2.aClass2Array1[local17].anInt48;
					if (local264 == 1) {
						arg2.anInt610 = 0;
						arg2.anInt611 = 0;
						arg2.anInt612 = local20;
						arg2.anInt613 = 0;
					}
					if (local264 == 2) {
						arg2.anInt613 = 0;
					}
				} else if (local17 == -1 || arg2.anInt609 == -1 || Class2.aClass2Array1[local17].anInt42 >= Class2.aClass2Array1[arg2.anInt609].anInt42) {
					arg2.anInt609 = local17;
					arg2.anInt610 = 0;
					arg2.anInt611 = 0;
					arg2.anInt612 = local20;
					arg2.anInt613 = 0;
					arg2.anInt607 = arg2.anInt597;
				}
			}
			if ((arg3 & 0x80) != 0) {
				arg2.anInt603 = arg1.method268();
				arg2.anInt604 = arg1.method269((byte) 2);
			}
			if ((arg3 & 0x2) != 0) {
				arg2.anInt591 = arg1.method269((byte) 2);
				if (arg2.anInt591 == 65535) {
					arg2.anInt591 = -1;
					return;
				}
			}
		} catch (@Pc(526) RuntimeException local526) {
			signlink.reporterror("74624, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 2 + ", " + local526.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method579() {
		this.method586("Starting up", 20);
		if (signlink.sunjava) {
			super.anInt808 = 5;
		}
		if (aBoolean230) {
			this.aBoolean214 = true;
			return;
		}
		aBoolean230 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method673(anInt904);
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
			this.aBoolean221 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(107) int local107 = 0; local107 < 5; local107++) {
				this.aClass45Array1[local107] = new Class45(600000, false, local107 + 1, signlink.aRandomAccessFile3, signlink.aRandomAccessFileArray1[local107]);
			}
		}
		try {
			this.method697(aByte63);
			this.aClass43_2 = this.method588(1, 25, "title screen", anInt905, "title", this.anIntArray236[1]);
			this.aClass6_Sub1_Sub3_Sub4_2 = new Class6_Sub1_Sub3_Sub4(false, this.aClass43_2, true, "p11_full");
			this.aClass6_Sub1_Sub3_Sub4_3 = new Class6_Sub1_Sub3_Sub4(false, this.aClass43_2, true, "p12_full");
			this.aClass6_Sub1_Sub3_Sub4_4 = new Class6_Sub1_Sub3_Sub4(false, this.aClass43_2, true, "b12_full");
			this.aClass6_Sub1_Sub3_Sub4_5 = new Class6_Sub1_Sub3_Sub4(true, this.aClass43_2, true, "q8_full");
			this.method682();
			this.method720();
			@Pc(203) Class43 local203 = this.method588(2, 30, "config", anInt905, "config", this.anIntArray236[2]);
			@Pc(215) Class43 local215 = this.method588(3, 35, "interface", anInt905, "interface", this.anIntArray236[3]);
			@Pc(227) Class43 local227 = this.method588(4, 40, "2d graphics", anInt905, "media", this.anIntArray236[4]);
			@Pc(239) Class43 local239 = this.method588(6, 45, "textures", anInt905, "textures", this.anIntArray236[6]);
			@Pc(251) Class43 local251 = this.method588(7, 50, "chat system", anInt905, "wordenc", this.anIntArray236[7]);
			@Pc(263) Class43 local263 = this.method588(8, 55, "sound effects", anInt905, "sounds", this.anIntArray236[8]);
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray7 = new int[4][105][105];
			this.aClass38_1 = new Class38(104, false, 104, this.anIntArrayArrayArray7, 4);
			for (@Pc(288) int local288 = 0; local288 < 4; local288++) {
				this.aClass12Array1[local288] = new Class12(104, 104, (byte) 6);
			}
			this.aClass6_Sub1_Sub3_Sub3_17 = new Class6_Sub1_Sub3_Sub3(512, 512);
			@Pc(323) Class43 local323 = this.method588(5, 60, "update list", anInt905, "versionlist", this.anIntArray236[5]);
			this.method586("Connecting to update server", 60);
			this.aClass30_Sub1_1 = new Class30_Sub1();
			this.aClass30_Sub1_1.method278(local323, this);
			Class27.method181(this.aClass30_Sub1_1.method287());
			Class6_Sub1_Sub2_Sub2.method83(this.aClass30_Sub1_1.method296(0), this.aClass30_Sub1_1);
			if (!aBoolean225) {
				this.anInt998 = 0;
				this.aBoolean246 = true;
				this.aClass30_Sub1_1.method282(2, this.anInt998);
				while (this.aClass30_Sub1_1.method285() > 0) {
					this.method624((byte) 7);
					try {
						Thread.sleep(100L);
					} catch (@Pc(374) Exception local374) {
					}
					if (this.aClass30_Sub1_1.anInt409 > 3) {
						this.method591("ondemand");
						return;
					}
				}
			}
			this.method586("Requesting animations", 65);
			@Pc(398) int local398 = this.aClass30_Sub1_1.method296(1);
			for (@Pc(400) int local400 = 0; local400 < local398; local400++) {
				this.aClass30_Sub1_1.method282(1, local400);
			}
			@Pc(419) int local419;
			while (this.aClass30_Sub1_1.method285() > 0) {
				local419 = local398 - this.aClass30_Sub1_1.method285();
				if (local419 > 0) {
					this.method586("Loading animations - " + local419 * 100 / local398 + "%", 65);
				}
				this.method624((byte) 7);
				try {
					Thread.sleep(100L);
				} catch (@Pc(445) Exception local445) {
				}
				if (this.aClass30_Sub1_1.anInt409 > 3) {
					this.method591("ondemand");
					return;
				}
			}
			this.method586("Requesting models", 70);
			local398 = this.aClass30_Sub1_1.method296(0);
			@Pc(479) int local479;
			for (local419 = 0; local419 < local398; local419++) {
				local479 = this.aClass30_Sub1_1.method279(anInt978, local419);
				if ((local479 & 0x1) != 0) {
					this.aClass30_Sub1_1.method282(0, local419);
				}
			}
			local398 = this.aClass30_Sub1_1.method285();
			while (this.aClass30_Sub1_1.method285() > 0) {
				local479 = local398 - this.aClass30_Sub1_1.method285();
				if (local479 > 0) {
					this.method586("Loading models - " + local479 * 100 / local398 + "%", 70);
				}
				this.method624((byte) 7);
				try {
					Thread.sleep(100L);
				} catch (@Pc(530) Exception local530) {
				}
			}
			if (this.aClass45Array1[0] != null) {
				this.method586("Requesting maps", 75);
				this.aClass30_Sub1_1.method282(3, this.aClass30_Sub1_1.method284(0, 47, 48, (byte) 2));
				this.aClass30_Sub1_1.method282(3, this.aClass30_Sub1_1.method284(1, 47, 48, (byte) 2));
				this.aClass30_Sub1_1.method282(3, this.aClass30_Sub1_1.method284(0, 48, 48, (byte) 2));
				this.aClass30_Sub1_1.method282(3, this.aClass30_Sub1_1.method284(1, 48, 48, (byte) 2));
				this.aClass30_Sub1_1.method282(3, this.aClass30_Sub1_1.method284(0, 49, 48, (byte) 2));
				this.aClass30_Sub1_1.method282(3, this.aClass30_Sub1_1.method284(1, 49, 48, (byte) 2));
				this.aClass30_Sub1_1.method282(3, this.aClass30_Sub1_1.method284(0, 47, 47, (byte) 2));
				this.aClass30_Sub1_1.method282(3, this.aClass30_Sub1_1.method284(1, 47, 47, (byte) 2));
				this.aClass30_Sub1_1.method282(3, this.aClass30_Sub1_1.method284(0, 48, 47, (byte) 2));
				this.aClass30_Sub1_1.method282(3, this.aClass30_Sub1_1.method284(1, 48, 47, (byte) 2));
				this.aClass30_Sub1_1.method282(3, this.aClass30_Sub1_1.method284(0, 48, 148, (byte) 2));
				this.aClass30_Sub1_1.method282(3, this.aClass30_Sub1_1.method284(1, 48, 148, (byte) 2));
				local398 = this.aClass30_Sub1_1.method285();
				while (this.aClass30_Sub1_1.method285() > 0) {
					local479 = local398 - this.aClass30_Sub1_1.method285();
					if (local479 > 0) {
						this.method586("Loading maps - " + local479 * 100 / local398 + "%", 75);
					}
					this.method624((byte) 7);
					try {
						Thread.sleep(100L);
					} catch (@Pc(715) Exception local715) {
					}
				}
			}
			local398 = this.aClass30_Sub1_1.method296(0);
			@Pc(736) int local736;
			for (local479 = 0; local479 < local398; local479++) {
				local736 = this.aClass30_Sub1_1.method279(anInt978, local479);
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
					this.aClass30_Sub1_1.method289(0, local738, local479);
				}
			}
			this.aClass30_Sub1_1.method293(aBoolean224);
			if (!aBoolean225) {
				local398 = this.aClass30_Sub1_1.method296(2);
				for (local736 = 1; local736 < local398; local736++) {
					if (this.aClass30_Sub1_1.method281(local736)) {
						this.aClass30_Sub1_1.method289(2, (byte) 1, local736);
					}
				}
			}
			local398 = this.aClass30_Sub1_1.method296(0);
			@Pc(861) int local861;
			for (local736 = 0; local736 < local398; local736++) {
				local861 = this.aClass30_Sub1_1.method279(anInt978, local736);
				if (local861 == 0 && this.aClass30_Sub1_1.anInt408 < 200) {
					this.aClass30_Sub1_1.method289(0, (byte) 1, local736);
				}
			}
			this.method586("Unpacking media", 80);
			this.aClass6_Sub1_Sub3_Sub2_13 = new Class6_Sub1_Sub3_Sub2(local227, "invback", 0);
			this.aClass6_Sub1_Sub3_Sub2_15 = new Class6_Sub1_Sub3_Sub2(local227, "chatback", 0);
			this.aClass6_Sub1_Sub3_Sub2_14 = new Class6_Sub1_Sub3_Sub2(local227, "mapback", 0);
			this.aClass6_Sub1_Sub3_Sub2_3 = new Class6_Sub1_Sub3_Sub2(local227, "backbase1", 0);
			this.aClass6_Sub1_Sub3_Sub2_4 = new Class6_Sub1_Sub3_Sub2(local227, "backbase2", 0);
			this.aClass6_Sub1_Sub3_Sub2_5 = new Class6_Sub1_Sub3_Sub2(local227, "backhmid1", 0);
			for (local861 = 0; local861 < 13; local861++) {
				this.aClass6_Sub1_Sub3_Sub2Array4[local861] = new Class6_Sub1_Sub3_Sub2(local227, "sideicons", local861);
			}
			this.aClass6_Sub1_Sub3_Sub3_14 = new Class6_Sub1_Sub3_Sub3(local227, "compass", 0);
			this.aClass6_Sub1_Sub3_Sub3_5 = new Class6_Sub1_Sub3_Sub3(local227, "mapedge", 0);
			this.aClass6_Sub1_Sub3_Sub3_5.method503();
			for (@Pc(972) int local972 = 0; local972 < 72; local972++) {
				this.aClass6_Sub1_Sub3_Sub2Array2[local972] = new Class6_Sub1_Sub3_Sub2(local227, "mapscene", local972);
			}
			for (@Pc(990) int local990 = 0; local990 < 70; local990++) {
				this.aClass6_Sub1_Sub3_Sub3Array8[local990] = new Class6_Sub1_Sub3_Sub3(local227, "mapfunction", local990);
			}
			for (@Pc(1008) int local1008 = 0; local1008 < 5; local1008++) {
				this.aClass6_Sub1_Sub3_Sub3Array6[local1008] = new Class6_Sub1_Sub3_Sub3(local227, "hitmarks", local1008);
			}
			for (@Pc(1026) int local1026 = 0; local1026 < 6; local1026++) {
				this.aClass6_Sub1_Sub3_Sub3Array5[local1026] = new Class6_Sub1_Sub3_Sub3(local227, "headicons_pk", local1026);
			}
			for (@Pc(1044) int local1044 = 0; local1044 < 9; local1044++) {
				this.aClass6_Sub1_Sub3_Sub3Array10[local1044] = new Class6_Sub1_Sub3_Sub3(local227, "headicons_prayer", local1044);
			}
			for (@Pc(1062) int local1062 = 0; local1062 < 6; local1062++) {
				this.aClass6_Sub1_Sub3_Sub3Array7[local1062] = new Class6_Sub1_Sub3_Sub3(local227, "headicons_hint", local1062);
			}
			this.aClass6_Sub1_Sub3_Sub3_13 = new Class6_Sub1_Sub3_Sub3(local227, "overlay_multiway", 0);
			this.aClass6_Sub1_Sub3_Sub3_3 = new Class6_Sub1_Sub3_Sub3(local227, "mapmarker", 0);
			this.aClass6_Sub1_Sub3_Sub3_4 = new Class6_Sub1_Sub3_Sub3(local227, "mapmarker", 1);
			for (@Pc(1104) int local1104 = 0; local1104 < 8; local1104++) {
				this.aClass6_Sub1_Sub3_Sub3Array4[local1104] = new Class6_Sub1_Sub3_Sub3(local227, "cross", local1104);
			}
			this.aClass6_Sub1_Sub3_Sub3_8 = new Class6_Sub1_Sub3_Sub3(local227, "mapdots", 0);
			this.aClass6_Sub1_Sub3_Sub3_9 = new Class6_Sub1_Sub3_Sub3(local227, "mapdots", 1);
			this.aClass6_Sub1_Sub3_Sub3_10 = new Class6_Sub1_Sub3_Sub3(local227, "mapdots", 2);
			this.aClass6_Sub1_Sub3_Sub3_11 = new Class6_Sub1_Sub3_Sub3(local227, "mapdots", 3);
			this.aClass6_Sub1_Sub3_Sub3_12 = new Class6_Sub1_Sub3_Sub3(local227, "mapdots", 4);
			this.aClass6_Sub1_Sub3_Sub2_6 = new Class6_Sub1_Sub3_Sub2(local227, "scrollbar", 0);
			this.aClass6_Sub1_Sub3_Sub2_7 = new Class6_Sub1_Sub3_Sub2(local227, "scrollbar", 1);
			this.aClass6_Sub1_Sub3_Sub2_16 = new Class6_Sub1_Sub3_Sub2(local227, "redstone1", 0);
			this.aClass6_Sub1_Sub3_Sub2_17 = new Class6_Sub1_Sub3_Sub2(local227, "redstone2", 0);
			this.aClass6_Sub1_Sub3_Sub2_18 = new Class6_Sub1_Sub3_Sub2(local227, "redstone3", 0);
			this.aClass6_Sub1_Sub3_Sub2_19 = new Class6_Sub1_Sub3_Sub2(local227, "redstone1", 0);
			this.aClass6_Sub1_Sub3_Sub2_19.method464((byte) 1);
			this.aClass6_Sub1_Sub3_Sub2_20 = new Class6_Sub1_Sub3_Sub2(local227, "redstone2", 0);
			this.aClass6_Sub1_Sub3_Sub2_20.method464((byte) 1);
			this.aClass6_Sub1_Sub3_Sub2_8 = new Class6_Sub1_Sub3_Sub2(local227, "redstone1", 0);
			this.aClass6_Sub1_Sub3_Sub2_8.method465(480);
			this.aClass6_Sub1_Sub3_Sub2_9 = new Class6_Sub1_Sub3_Sub2(local227, "redstone2", 0);
			this.aClass6_Sub1_Sub3_Sub2_9.method465(480);
			this.aClass6_Sub1_Sub3_Sub2_10 = new Class6_Sub1_Sub3_Sub2(local227, "redstone3", 0);
			this.aClass6_Sub1_Sub3_Sub2_10.method465(480);
			this.aClass6_Sub1_Sub3_Sub2_11 = new Class6_Sub1_Sub3_Sub2(local227, "redstone1", 0);
			this.aClass6_Sub1_Sub3_Sub2_11.method464((byte) 1);
			this.aClass6_Sub1_Sub3_Sub2_11.method465(480);
			this.aClass6_Sub1_Sub3_Sub2_12 = new Class6_Sub1_Sub3_Sub2(local227, "redstone2", 0);
			this.aClass6_Sub1_Sub3_Sub2_12.method464((byte) 1);
			this.aClass6_Sub1_Sub3_Sub2_12.method465(480);
			for (@Pc(1294) int local1294 = 0; local1294 < 2; local1294++) {
				this.aClass6_Sub1_Sub3_Sub2Array3[local1294] = new Class6_Sub1_Sub3_Sub2(local227, "mod_icons", local1294);
			}
			@Pc(1317) Class6_Sub1_Sub3_Sub3 local1317 = new Class6_Sub1_Sub3_Sub3(local227, "backleft1", 0);
			this.aClass8_3 = new Class8(local1317.anInt727, local1317.anInt726, this.method584(), 384);
			local1317.method504(0, 0);
			@Pc(1342) Class6_Sub1_Sub3_Sub3 local1342 = new Class6_Sub1_Sub3_Sub3(local227, "backleft2", 0);
			this.aClass8_4 = new Class8(local1342.anInt727, local1342.anInt726, this.method584(), 384);
			local1342.method504(0, 0);
			@Pc(1367) Class6_Sub1_Sub3_Sub3 local1367 = new Class6_Sub1_Sub3_Sub3(local227, "backright1", 0);
			this.aClass8_5 = new Class8(local1367.anInt727, local1367.anInt726, this.method584(), 384);
			local1367.method504(0, 0);
			@Pc(1392) Class6_Sub1_Sub3_Sub3 local1392 = new Class6_Sub1_Sub3_Sub3(local227, "backright2", 0);
			this.aClass8_6 = new Class8(local1392.anInt727, local1392.anInt726, this.method584(), 384);
			local1392.method504(0, 0);
			@Pc(1417) Class6_Sub1_Sub3_Sub3 local1417 = new Class6_Sub1_Sub3_Sub3(local227, "backtop1", 0);
			this.aClass8_7 = new Class8(local1417.anInt727, local1417.anInt726, this.method584(), 384);
			local1417.method504(0, 0);
			@Pc(1442) Class6_Sub1_Sub3_Sub3 local1442 = new Class6_Sub1_Sub3_Sub3(local227, "backvmid1", 0);
			this.aClass8_8 = new Class8(local1442.anInt727, local1442.anInt726, this.method584(), 384);
			local1442.method504(0, 0);
			@Pc(1467) Class6_Sub1_Sub3_Sub3 local1467 = new Class6_Sub1_Sub3_Sub3(local227, "backvmid2", 0);
			this.aClass8_9 = new Class8(local1467.anInt727, local1467.anInt726, this.method584(), 384);
			local1467.method504(0, 0);
			@Pc(1492) Class6_Sub1_Sub3_Sub3 local1492 = new Class6_Sub1_Sub3_Sub3(local227, "backvmid3", 0);
			this.aClass8_10 = new Class8(local1492.anInt727, local1492.anInt726, this.method584(), 384);
			local1492.method504(0, 0);
			@Pc(1517) Class6_Sub1_Sub3_Sub3 local1517 = new Class6_Sub1_Sub3_Sub3(local227, "backhmid2", 0);
			this.aClass8_11 = new Class8(local1517.anInt727, local1517.anInt726, this.method584(), 384);
			local1517.method504(0, 0);
			@Pc(1542) int local1542 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1549) int local1549 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1556) int local1556 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1563) int local1563 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1565) int local1565 = 0; local1565 < 100; local1565++) {
				if (this.aClass6_Sub1_Sub3_Sub3Array8[local1565] != null) {
					this.aClass6_Sub1_Sub3_Sub3Array8[local1565].method502(local1549 + local1563, local1542 + local1563, local1556 + local1563);
				}
				if (this.aClass6_Sub1_Sub3_Sub2Array2[local1565] != null) {
					this.aClass6_Sub1_Sub3_Sub2Array2[local1565].method466(local1549 + local1563, local1542 + local1563, local1556 + local1563);
				}
			}
			this.method586("Unpacking textures", 83);
			Class6_Sub1_Sub3_Sub1.method208(local239);
			Class6_Sub1_Sub3_Sub1.method212(0.8D);
			Class6_Sub1_Sub3_Sub1.method207();
			this.method586("Unpacking config", 86);
			Class2.method11(local203);
			Class11.method58(local203);
			Class24.method157(local203);
			Class35.method362(local203);
			Class20.method149(local203);
			Class48.method536(local203);
			Class28.method186(local203);
			Class5.method14(local203);
			Class18.method129(local203);
			Class35.aBoolean137 = aBoolean224;
			if (!aBoolean225) {
				this.method586("Unpacking sounds", 90);
				@Pc(1668) byte[] local1668 = local263.method518("sounds.dat", (byte[]) null);
				@Pc(1674) Class6_Sub1_Sub4 local1674 = new Class6_Sub1_Sub4(888, local1668);
				Class25.method161(local1674);
			}
			this.method586("Unpacking interfaces", 95);
			@Pc(1705) Class6_Sub1_Sub3_Sub4[] local1705 = new Class6_Sub1_Sub3_Sub4[] { this.aClass6_Sub1_Sub3_Sub4_2, this.aClass6_Sub1_Sub3_Sub4_3, this.aClass6_Sub1_Sub3_Sub4_4, this.aClass6_Sub1_Sub3_Sub4_5 };
			Class1.method2(local215, local1705, local227);
			this.method586("Preparing game engine", 100);
			@Pc(1721) int local1721;
			@Pc(1723) int local1723;
			@Pc(1725) int local1725;
			for (@Pc(1717) int local1717 = 0; local1717 < 33; local1717++) {
				local1721 = 999;
				local1723 = 0;
				for (local1725 = 0; local1725 < 34; local1725++) {
					if (this.aClass6_Sub1_Sub3_Sub2_14.aByteArray18[local1725 + local1717 * this.aClass6_Sub1_Sub3_Sub2_14.anInt694] == 0) {
						if (local1721 == 999) {
							local1721 = local1725;
						}
					} else if (local1721 != 999) {
						local1723 = local1725;
						break;
					}
				}
				this.anIntArray257[local1717] = local1721;
				this.anIntArray221[local1717] = local1723 - local1721;
			}
			@Pc(1783) int local1783;
			for (local1721 = 5; local1721 < 156; local1721++) {
				local1723 = 999;
				local1725 = 0;
				for (local1783 = 25; local1783 < 172; local1783++) {
					if (this.aClass6_Sub1_Sub3_Sub2_14.aByteArray18[local1783 + local1721 * this.aClass6_Sub1_Sub3_Sub2_14.anInt694] == 0 && (local1783 > 34 || local1721 > 34)) {
						if (local1723 == 999) {
							local1723 = local1783;
						}
					} else if (local1723 != 999) {
						local1725 = local1783;
						break;
					}
				}
				this.anIntArray272[local1721 - 5] = local1723 - 25;
				this.anIntArray232[local1721 - 5] = local1725 - local1723;
			}
			Class6_Sub1_Sub3_Sub1.method205(anInt948, 765, 503);
			this.anIntArray247 = Class6_Sub1_Sub3_Sub1.anIntArray124;
			Class6_Sub1_Sub3_Sub1.method205(anInt948, 479, 96);
			this.anIntArray244 = Class6_Sub1_Sub3_Sub1.anIntArray124;
			Class6_Sub1_Sub3_Sub1.method205(anInt948, 190, 261);
			this.anIntArray245 = Class6_Sub1_Sub3_Sub1.anIntArray124;
			Class6_Sub1_Sub3_Sub1.method205(anInt948, 512, 334);
			this.anIntArray246 = Class6_Sub1_Sub3_Sub1.anIntArray124;
			@Pc(1874) int[] local1874 = new int[9];
			for (local1725 = 0; local1725 < 9; local1725++) {
				local1783 = 128 + local1725 * 32 + 15;
				@Pc(1892) int local1892 = 600 + local1783 * 3;
				@Pc(1896) int local1896 = Class6_Sub1_Sub3_Sub1.anIntArray122[local1783];
				local1874[local1725] = local1892 * local1896 >> 16;
			}
			Class38.method433(local1874);
			Class34.method303(local251);
			this.aClass39_1 = new Class39(this, -257);
			this.method585(this.aClass39_1, 10);
			Class6_Sub1_Sub2_Sub1.aClient1 = this;
			Class11.aClient2 = this;
			Class20.aClient3 = this;
		} catch (@Pc(1937) Exception local1937) {
			signlink.reporterror("loaderror " + this.aString22 + " " + this.anInt963);
			this.aBoolean226 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method687() {
		try {
			for (@Pc(11) Class6_Sub1_Sub2_Sub6 local11 = (Class6_Sub1_Sub2_Sub6) this.aClass40_12.method472(); local11 != null; local11 = (Class6_Sub1_Sub2_Sub6) this.aClass40_12.method474()) {
				if (local11.anInt750 != this.anInt854 || anInt1041 > local11.anInt753) {
					local11.method542();
				} else if (anInt1041 >= local11.anInt752) {
					if (local11.anInt749 > 0) {
						@Pc(41) Class6_Sub1_Sub2_Sub4_Sub1 local41 = this.aClass6_Sub1_Sub2_Sub4_Sub1Array1[local11.anInt749 - 1];
						if (local41 != null && local41.anInt583 >= 0 && local41.anInt583 < 13312 && local41.anInt584 >= 0 && local41.anInt584 < 13312) {
							local11.method524(anInt1041, local41.anInt584, this.method635(local11.anInt750, local41.anInt584, local41.anInt583) - local11.anInt746, local41.anInt583);
						}
					}
					if (local11.anInt749 < 0) {
						@Pc(86) int local86 = -local11.anInt749 - 1;
						@Pc(92) Class6_Sub1_Sub2_Sub4_Sub2 local92;
						if (local86 == this.anInt848) {
							local92 = aClass6_Sub1_Sub2_Sub4_Sub2_1;
						} else {
							local92 = this.aClass6_Sub1_Sub2_Sub4_Sub2Array1[local86];
						}
						if (local92 != null && local92.anInt583 >= 0 && local92.anInt583 < 13312 && local92.anInt584 >= 0 && local92.anInt584 < 13312) {
							local11.method524(anInt1041, local92.anInt584, this.method635(local11.anInt750, local92.anInt584, local92.anInt583) - local11.anInt746, local92.anInt583);
						}
					}
					local11.method523(this.anInt880, this.aByte64);
					this.aClass38_1.method408(-1, local11, false, this.anInt854, (int) local11.aDouble3, 60, (int) local11.aDouble1, local11.anInt741, (int) local11.aDouble2);
				}
			}
		} catch (@Pc(173) RuntimeException local173) {
			signlink.reporterror("59251, " + 584 + ", " + local173.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!PQBRPYKE;ZI)V")
	private void method688(@OriginalArg(0) Class6_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt1048 = 0;
			this.anInt988 = 0;
			this.method718(arg0, arg1);
			this.method669(arg0, arg1);
			this.method709(arg0, arg1);
			@Pc(36) int local36;
			for (@Pc(29) int local29 = 0; local29 < this.anInt1048; local29++) {
				local36 = this.anIntArray274[local29];
				if (this.aClass6_Sub1_Sub2_Sub4_Sub1Array1[local36].anInt602 != anInt1041) {
					this.aClass6_Sub1_Sub2_Sub4_Sub1Array1[local36].aClass20_1 = null;
					this.aClass6_Sub1_Sub2_Sub4_Sub1Array1[local36] = null;
				}
			}
			if (arg0.anInt390 != arg1) {
				signlink.reporterror(this.aString20 + " size mismatch in getnpcpos - pos:" + arg0.anInt390 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local36 = 0; local36 < this.anInt885; local36++) {
				if (this.aClass6_Sub1_Sub2_Sub4_Sub1Array1[this.anIntArray227[local36]] == null) {
					signlink.reporterror(this.aString20 + " null entry in npc list - pos:" + local36 + " size:" + this.anInt885);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("17375, " + arg0 + ", " + true + ", " + arg1 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ILclient!PQBRPYKE;I)V")
	private void method689(@OriginalArg(1) Class6_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				if (arg0.anInt391 + 10 < arg1 * 8) {
					@Pc(17) int local17 = arg0.method250(11);
					if (local17 != 2047) {
						if (this.aClass6_Sub1_Sub2_Sub4_Sub2Array1[local17] == null) {
							this.aClass6_Sub1_Sub2_Sub4_Sub2Array1[local17] = new Class6_Sub1_Sub2_Sub4_Sub2();
							if (this.aClass6_Sub1_Sub4Array1[local17] != null) {
								this.aClass6_Sub1_Sub2_Sub4_Sub2Array1[local17].method382(this.aClass6_Sub1_Sub4Array1[local17]);
							}
						}
						this.anIntArray251[this.anInt987++] = local17;
						@Pc(63) Class6_Sub1_Sub2_Sub4_Sub2 local63 = this.aClass6_Sub1_Sub2_Sub4_Sub2Array1[local17];
						local63.anInt602 = anInt1041;
						@Pc(71) int local71 = arg0.method250(5);
						if (local71 > 15) {
							local71 -= 32;
						}
						@Pc(80) int local80 = arg0.method250(5);
						if (local80 > 15) {
							local80 -= 32;
						}
						@Pc(89) int local89 = arg0.method250(1);
						if (local89 == 1) {
							this.anIntArray252[this.anInt988++] = local17;
						}
						@Pc(108) int local108 = arg0.method250(1);
						local63.method377(aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0] + local80, local108 == 1, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0] + local71);
						continue;
					}
				}
				arg0.method251();
				return;
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("80856, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method690() {
		try {
			Class11.aClass46_4.method531();
			Class11.aClass46_3.method531();
			Class20.aClass46_5.method531();
			Class35.aClass46_7.method531();
			Class35.aClass46_8.method531();
			Class6_Sub1_Sub2_Sub4_Sub2.aClass46_9.method531();
			Class28.aClass46_6.method531();
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("87410, " + 8 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method691() {
		try {
			@Pc(4) Graphics local4 = this.method584().getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			this.method577();
			@Pc(41) byte local41;
			@Pc(47) int local47;
			if (this.aBoolean226) {
				this.aBoolean240 = false;
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
			if (this.aBoolean221) {
				this.aBoolean240 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean214) {
				this.aBoolean240 = false;
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
			signlink.reporterror("13719, " + -27417 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!ATOBWHST;)I")
	private int method692(@OriginalArg(0) int arg0, @OriginalArg(2) Class1 arg1) {
		try {
			if (arg1.anIntArrayArray1 == null || arg0 >= arg1.anIntArrayArray1.length) {
				return -2;
			}
			try {
				@Pc(22) int[] local22 = arg1.anIntArrayArray1[arg0];
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
						local35 = this.anIntArray250[local22[local26++]];
					}
					if (local33 == 3) {
						local35 = this.anIntArray226[local22[local26++]];
					}
					@Pc(83) Class1 local83;
					@Pc(88) int local88;
					@Pc(101) int local101;
					if (local33 == 4) {
						local83 = Class1.method4(local22[local26++]);
						local88 = local22[local26++];
						if (local88 >= 0 && local88 < Class35.anInt552 && (!Class35.method370(local88).aBoolean136 || aBoolean224)) {
							for (local101 = 0; local101 < local83.anIntArray9.length; local101++) {
								if (local83.anIntArray9[local101] == local88 + 1) {
									local35 += local83.anIntArray1[local101];
								}
							}
						}
					}
					if (local33 == 5) {
						local35 = this.anIntArray239[local22[local26++]];
					}
					if (local33 == 6) {
						local35 = anIntArray253[this.anIntArray250[local22[local26++]] - 1];
					}
					if (local33 == 7) {
						local35 = this.anIntArray239[local22[local26++]] * 100 / 46875;
					}
					if (local33 == 8) {
						local35 = aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt628;
					}
					@Pc(176) int local176;
					if (local33 == 9) {
						for (local176 = 0; local176 < Class3.anInt51; local176++) {
							if (Class3.aBooleanArray1[local176]) {
								local35 += this.anIntArray250[local176];
							}
						}
					}
					if (local33 == 10) {
						local83 = Class1.method4(local22[local26++]);
						local88 = local22[local26++] + 1;
						if (local88 >= 0 && local88 < Class35.anInt552 && (!Class35.method370(local88).aBoolean136 || aBoolean224)) {
							for (local101 = 0; local101 < local83.anIntArray9.length; local101++) {
								if (local83.anIntArray9[local101] == local88) {
									local35 = 999999999;
									break;
								}
							}
						}
					}
					if (local33 == 11) {
						local35 = this.anInt1039;
					}
					if (local33 == 12) {
						local35 = this.anInt989;
					}
					if (local33 == 13) {
						local176 = this.anIntArray239[local22[local26++]];
						local88 = local22[local26++];
						local35 = (local176 & 0x1 << local88) == 0 ? 0 : 1;
					}
					if (local33 == 14) {
						local176 = local22[local26++];
						@Pc(290) Class18 local290 = Class18.aClass18Array1[local176];
						local101 = local290.anInt217;
						@Pc(296) int local296 = local290.anInt218;
						@Pc(299) int local299 = local290.anInt219;
						@Pc(305) int local305 = anIntArray223[local299 - local296];
						local35 = this.anIntArray239[local101] >> local296 & local305;
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
						local35 = (aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt583 >> 7) + this.anInt959;
					}
					if (local33 == 19) {
						local35 = (aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt584 >> 7) + this.anInt960;
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
			signlink.reporterror("9427, " + arg0 + ", " + -489 + ", " + arg1 + ", " + local401.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt876 = Integer.parseInt(this.getParameter("nodeid"));
		anInt877 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method652(258);
		} else {
			method612();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean224 = false;
		} else {
			aBoolean224 = true;
		}
		this.method575();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!PQBRPYKE;B)V")
	private void method693(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub1_Sub4 arg1) {
		try {
			for (@Pc(12) int local12 = 0; local12 < this.anInt988; local12++) {
				@Pc(19) int local19 = this.anIntArray252[local12];
				@Pc(24) Class6_Sub1_Sub2_Sub4_Sub2 local24 = this.aClass6_Sub1_Sub2_Sub4_Sub2Array1[local19];
				@Pc(27) int local27 = arg1.method239();
				if ((local27 & 0x8) != 0) {
					local27 += arg1.method239() << 8;
				}
				this.method686(local19, arg1, local24, local27);
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("5074, " + arg0 + ", " + arg1 + ", " + 5 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!ATOBWHST;)V")
	private void method694(@OriginalArg(1) Class1 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt12;
			this.aBoolean243 &= true;
			@Pc(66) int local66;
			if ((local4 < 1 || local4 > 100) && (local4 < 701 || local4 > 800)) {
				if (local4 >= 101 && local4 <= 200 || !(local4 < 801 || local4 > 900)) {
					local66 = this.anInt827;
					if (this.anInt828 != 2) {
						local66 = 0;
					}
					if (local4 > 800) {
						local4 -= 701;
					} else {
						local4 -= 101;
					}
					if (local4 >= local66) {
						arg0.aString3 = "";
						arg0.anInt23 = 0;
					} else {
						if (this.anIntArray237[local4] == 0) {
							arg0.aString3 = "@red@Offline";
						} else if (this.anIntArray237[local4] < 200) {
							if (this.anIntArray237[local4] == anInt876) {
								arg0.aString3 = "@gre@World" + (this.anIntArray237[local4] - 9);
							} else {
								arg0.aString3 = "@yel@World" + (this.anIntArray237[local4] - 9);
							}
						} else if (this.anIntArray237[local4] == anInt876) {
							arg0.aString3 = "@gre@Classic" + (this.anIntArray237[local4] - 219);
						} else {
							arg0.aString3 = "@yel@Classic" + (this.anIntArray237[local4] - 219);
						}
						arg0.anInt23 = 1;
					}
				} else if (local4 == 203) {
					local66 = this.anInt827;
					if (this.anInt828 != 2) {
						local66 = 0;
					}
					arg0.anInt21 = local66 * 15 + 20;
					if (arg0.anInt21 <= arg0.anInt27) {
						arg0.anInt21 = arg0.anInt27 + 1;
					}
				} else if (local4 >= 401 && local4 <= 500) {
					local4 -= 401;
					if (local4 == 0 && this.anInt828 == 0) {
						arg0.aString3 = "Loading ignore list";
						arg0.anInt23 = 0;
					} else if (local4 == 1 && this.anInt828 == 0) {
						arg0.aString3 = "Please wait...";
						arg0.anInt23 = 0;
					} else {
						local66 = this.anInt843;
						if (this.anInt828 == 0) {
							local66 = 0;
						}
						if (local4 >= local66) {
							arg0.aString3 = "";
							arg0.anInt23 = 0;
						} else {
							arg0.aString3 = Class41.method485(Class41.method482(this.aLongArray3[local4], (byte) 7));
							arg0.anInt23 = 1;
						}
					}
				} else if (local4 == 503) {
					arg0.anInt21 = this.anInt843 * 15 + 20;
					if (arg0.anInt21 <= arg0.anInt27) {
						arg0.anInt21 = arg0.anInt27 + 1;
					}
				} else if (local4 == 327) {
					arg0.anInt18 = 150;
					arg0.anInt19 = (int) (Math.sin((double) anInt1041 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean232) {
						for (local66 = 0; local66 < 7; local66++) {
							@Pc(379) int local379 = this.anIntArray233[local66];
							if (local379 >= 0 && !Class48.aClass48Array1[local379].method538()) {
								return;
							}
						}
						this.aBoolean232 = false;
						@Pc(398) Class6_Sub1_Sub2_Sub2[] local398 = new Class6_Sub1_Sub2_Sub2[7];
						@Pc(400) int local400 = 0;
						for (@Pc(402) int local402 = 0; local402 < 7; local402++) {
							@Pc(409) int local409 = this.anIntArray233[local402];
							if (local409 >= 0) {
								local398[local400++] = Class48.aClass48Array1[local409].method539(this.anInt1050);
							}
						}
						@Pc(433) Class6_Sub1_Sub2_Sub2 local433 = new Class6_Sub1_Sub2_Sub2(local400, local398, this.aByte61);
						for (@Pc(435) int local435 = 0; local435 < 5; local435++) {
							if (this.anIntArray212[local435] != 0) {
								local433.method100(anIntArrayArray25[local435][0], anIntArrayArray25[local435][this.anIntArray212[local435]]);
								if (local435 == 1) {
									local433.method100(anIntArray271[0], anIntArray271[this.anIntArray212[local435]]);
								}
							}
						}
						local433.method93();
						local433.method94(Class2.aClass2Array1[aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt599].anIntArray10[0]);
						local433.method103(64, 850, -30, -50, -30, true);
						arg0.anInt5 = 5;
						arg0.anInt6 = 0;
						Class1.method9(local433);
					}
				} else if (local4 == 324) {
					if (this.aClass6_Sub1_Sub3_Sub3_6 == null) {
						this.aClass6_Sub1_Sub3_Sub3_6 = arg0.aClass6_Sub1_Sub3_Sub3_2;
						this.aClass6_Sub1_Sub3_Sub3_7 = arg0.aClass6_Sub1_Sub3_Sub3_1;
					}
					if (this.aBoolean220) {
						arg0.aClass6_Sub1_Sub3_Sub3_2 = this.aClass6_Sub1_Sub3_Sub3_7;
					} else {
						arg0.aClass6_Sub1_Sub3_Sub3_2 = this.aClass6_Sub1_Sub3_Sub3_6;
					}
				} else if (local4 == 325) {
					if (this.aClass6_Sub1_Sub3_Sub3_6 == null) {
						this.aClass6_Sub1_Sub3_Sub3_6 = arg0.aClass6_Sub1_Sub3_Sub3_2;
						this.aClass6_Sub1_Sub3_Sub3_7 = arg0.aClass6_Sub1_Sub3_Sub3_1;
					}
					if (this.aBoolean220) {
						arg0.aClass6_Sub1_Sub3_Sub3_2 = this.aClass6_Sub1_Sub3_Sub3_6;
					} else {
						arg0.aClass6_Sub1_Sub3_Sub3_2 = this.aClass6_Sub1_Sub3_Sub3_7;
					}
				} else if (local4 == 600) {
					arg0.aString3 = this.aString30;
					if (anInt1041 % 20 < 10) {
						arg0.aString3 = arg0.aString3 + "|";
					} else {
						arg0.aString3 = arg0.aString3 + " ";
					}
				} else {
					if (local4 == 620) {
						if (this.anInt980 < 1) {
							arg0.aString3 = "";
						} else if (this.aBoolean234) {
							arg0.anInt26 = 16711680;
							arg0.aString3 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt26 = 16777215;
							arg0.aString3 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(640) String local640;
					if (local4 == 660) {
						local66 = this.anInt1017 - this.anInt853;
						if (local66 <= 0) {
							local640 = "earlier today";
						} else if (local66 == 1) {
							local640 = "yesterday";
						} else {
							local640 = local66 + " days ago";
						}
						arg0.aString3 = "You last logged in @red@" + local640 + "@bla@ from: @red@" + signlink.dns;
					}
					if (local4 == 661) {
						if (this.anInt958 == 0) {
							arg0.aString3 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
						} else if (this.anInt958 <= this.anInt1017) {
							arg0.aString3 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method695(this.anInt958, (byte) 1);
						} else {
							local66 = this.anInt1017 + 14 - this.anInt958;
							if (local66 <= 0) {
								local640 = "Earlier today";
							} else if (local66 == 1) {
								local640 = "Yesterday";
							} else {
								local640 = local66 + " days ago";
							}
							arg0.aString3 = local640 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method695(this.anInt958, (byte) 1) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
						}
					}
					if (local4 == 662) {
						@Pc(758) String local758;
						if (this.anInt968 == 0) {
							local758 = "@yel@0 unread messages";
						} else if (this.anInt968 == 1) {
							local758 = "@gre@1 unread message";
						} else {
							local758 = "@gre@" + this.anInt968 + " unread messages";
						}
						arg0.aString3 = "You have " + local758 + "\\nin your message centre.";
					}
					if (local4 == 663) {
						if (this.anInt902 > 0 && this.anInt902 <= this.anInt1017 + 10) {
							arg0.aString3 = "Last password change:\\n@gre@" + this.method695(this.anInt902, (byte) 1);
						} else {
							arg0.aString3 = "Last password change:\\n@gre@Never changed";
						}
					}
					if (local4 == 665) {
						if (this.anInt859 > 2 && !aBoolean224) {
							arg0.aString3 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
						} else if (this.anInt859 > 2) {
							arg0.aString3 = "\\n\\nYou have @gre@" + this.anInt859 + "@yel@ days of\\nmember credit remaining.";
						} else if (this.anInt859 > 0) {
							arg0.aString3 = "You have @gre@" + this.anInt859 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
						} else {
							arg0.aString3 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
						}
					}
					if (local4 == 667) {
						if (this.anInt859 > 2 && !aBoolean224) {
							arg0.aString3 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
						} else if (this.anInt859 > 0) {
							arg0.aString3 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
						} else {
							arg0.aString3 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
						}
					}
					if (local4 == 668) {
						if (this.anInt958 > this.anInt1017) {
							arg0.aString3 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
						} else {
							arg0.aString3 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
						}
					}
				}
			} else if (local4 == 1 && this.anInt828 == 0) {
				arg0.aString3 = "Loading friend list";
				arg0.anInt23 = 0;
			} else if (local4 == 1 && this.anInt828 == 1) {
				arg0.aString3 = "Connecting to friendserver";
				arg0.anInt23 = 0;
			} else if (local4 == 2 && this.anInt828 != 2) {
				arg0.aString3 = "Please wait...";
				arg0.anInt23 = 0;
			} else {
				local66 = this.anInt827;
				if (this.anInt828 != 2) {
					local66 = 0;
				}
				if (local4 > 700) {
					local4 -= 601;
				} else {
					local4--;
				}
				if (local4 >= local66) {
					arg0.aString3 = "";
					arg0.anInt23 = 0;
				} else {
					arg0.aString3 = this.aStringArray11[local4];
					arg0.anInt23 = 1;
				}
			}
		} catch (@Pc(915) RuntimeException local915) {
			signlink.reporterror("65213, " + true + ", " + arg0 + ", " + local915.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IB)Ljava/lang/String;")
	private String method695(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg0 > this.anInt1017 + 10) {
				return "Unknown";
			}
			@Pc(16) long local16 = ((long) arg0 + 11745L) * 86400000L;
			@Pc(18) Calendar local18 = Calendar.getInstance();
			@Pc(23) boolean local23 = false;
			local18.setTime(new Date(local16));
			@Pc(42) int local42 = local18.get(5);
			@Pc(46) int local46 = local18.get(2);
			@Pc(50) int local50 = local18.get(1);
			@Pc(101) String[] local101 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
			return local42 + "-" + local101[local46] + "-" + local50;
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("18851, " + arg0 + ", " + arg1 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method696() {
		try {
			if (this.anInt1019 > 1) {
				this.anInt1019--;
			}
			if (this.anInt1008 > 0) {
				this.anInt1008--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method719(); local22++) {
			}
			if (this.aBoolean243) {
				@Pc(41) Object local41 = this.aClass39_1.anObject1;
				@Pc(66) int local66;
				@Pc(68) int local68;
				@Pc(70) int local70;
				@Pc(103) int local103;
				synchronized (this.aClass39_1.anObject1) {
					if (!aBoolean211) {
						this.aClass39_1.anInt678 = 0;
					} else if (super.anInt819 != 0 || this.aClass39_1.anInt678 >= 40) {
						this.aClass6_Sub1_Sub4_6.method228(128);
						this.aClass6_Sub1_Sub4_6.method229(0);
						local66 = this.aClass6_Sub1_Sub4_6.anInt390;
						local68 = 0;
						@Pc(86) int local86;
						for (local70 = 0; local70 < this.aClass39_1.anInt678 && local66 - this.aClass6_Sub1_Sub4_6.anInt390 < 240; local70++) {
							local68++;
							local86 = this.aClass39_1.anIntArray188[local70];
							if (local86 < 0) {
								local86 = 0;
							} else if (local86 > 502) {
								local86 = 502;
							}
							local103 = this.aClass39_1.anIntArray189[local70];
							if (local103 < 0) {
								local103 = 0;
							} else if (local103 > 764) {
								local103 = 764;
							}
							@Pc(120) int local120 = local86 * 765 + local103;
							if (this.aClass39_1.anIntArray188[local70] == -1 && this.aClass39_1.anIntArray189[local70] == -1) {
								local103 = -1;
								local86 = -1;
								local120 = 524287;
							}
							if (local103 != this.anInt838 || local86 != this.anInt839) {
								@Pc(165) int local165 = local103 - this.anInt838;
								this.anInt838 = local103;
								@Pc(173) int local173 = local86 - this.anInt839;
								this.anInt839 = local86;
								if (this.anInt851 < 8 && local165 >= -32 && local165 <= 31 && local173 >= -32 && local173 <= 31) {
									local165 += 32;
									local173 += 32;
									this.aClass6_Sub1_Sub4_6.method230((this.anInt851 << 12) + (local165 << 6) + local173);
									this.anInt851 = 0;
								} else if (this.anInt851 < 8) {
									this.aClass6_Sub1_Sub4_6.method232(8388608 + (this.anInt851 << 19) + local120);
									this.anInt851 = 0;
								} else {
									this.aClass6_Sub1_Sub4_6.method233(-1073741824 + (this.anInt851 << 19) + local120);
									this.anInt851 = 0;
								}
							} else if (this.anInt851 < 2047) {
								this.anInt851++;
							}
						}
						this.aClass6_Sub1_Sub4_6.method238(this.aClass6_Sub1_Sub4_6.anInt390 - local66);
						if (local68 >= this.aClass39_1.anInt678) {
							this.aClass39_1.anInt678 = 0;
						} else {
							this.aClass39_1.anInt678 -= local68;
							for (local86 = 0; local86 < this.aClass39_1.anInt678; local86++) {
								this.aClass39_1.anIntArray189[local86] = this.aClass39_1.anIntArray189[local86 + local68];
								this.aClass39_1.anIntArray188[local86] = this.aClass39_1.anIntArray188[local86 + local68];
							}
						}
					}
				}
				if (super.anInt819 != 0) {
					@Pc(336) long local336 = (super.aLong28 - this.aLong29) / 50L;
					if (local336 > 4095L) {
						local336 = 4095L;
					}
					this.aLong29 = super.aLong28;
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
					this.aClass6_Sub1_Sub4_6.method228(1);
					this.aClass6_Sub1_Sub4_6.method233((local103 << 20) + (local382 << 19) + local70);
				}
				if (this.anInt871 > 0) {
					this.anInt871--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean222 = true;
				}
				if (this.aBoolean222 && this.anInt871 <= 0) {
					this.anInt871 = 20;
					this.aBoolean222 = false;
					this.aClass6_Sub1_Sub4_6.method228(85);
					this.aClass6_Sub1_Sub4_6.method266(this.anInt1052);
					this.aClass6_Sub1_Sub4_6.method264(this.anInt1053);
				}
				if (super.aBoolean210 && !this.aBoolean253) {
					this.aBoolean253 = true;
					this.aClass6_Sub1_Sub4_6.method228(201);
					this.aClass6_Sub1_Sub4_6.method229(1);
				}
				if (!super.aBoolean210 && this.aBoolean253) {
					this.aBoolean253 = false;
					this.aClass6_Sub1_Sub4_6.method228(201);
					this.aClass6_Sub1_Sub4_6.method229(0);
				}
				this.method614();
				this.method717();
				this.method700((byte) 4);
				this.anInt1006++;
				if (this.anInt1006 > 750) {
					this.method629();
				}
				this.method600(this.aByte57);
				this.method638();
				this.method651();
				this.anInt880++;
				if (this.anInt896 != 0) {
					this.anInt895 += 20;
					if (this.anInt895 >= 400) {
						this.anInt896 = 0;
					}
				}
				if (this.anInt889 != 0) {
					this.anInt886++;
					if (this.anInt886 >= 15) {
						if (this.anInt889 == 2) {
							this.aBoolean238 = true;
						}
						if (this.anInt889 == 3) {
							this.aBoolean252 = true;
						}
						this.anInt889 = 0;
					}
				}
				if (this.anInt1023 != 0) {
					this.anInt971++;
					if (super.anInt814 > this.anInt1024 + 5 || super.anInt814 < this.anInt1024 - 5 || super.anInt815 > this.anInt1025 + 5 || super.anInt815 < this.anInt1025 - 5) {
						this.aBoolean218 = true;
					}
					if (super.anInt813 == 0) {
						if (this.anInt1023 == 2) {
							this.aBoolean238 = true;
						}
						if (this.anInt1023 == 3) {
							this.aBoolean252 = true;
						}
						this.anInt1023 = 0;
						if (this.aBoolean218 && this.anInt971 >= 5) {
							this.anInt1033 = -1;
							this.method722();
							if (this.anInt1033 == this.anInt1021 && this.anInt1032 != this.anInt1022) {
								@Pc(684) Class1 local684 = Class1.method4(this.anInt1021);
								@Pc(686) byte local686 = 0;
								if (this.anInt1014 == 1 && local684.anInt12 == 206) {
									local686 = 1;
								}
								if (local684.anIntArray9[this.anInt1032] <= 0) {
									local686 = 0;
								}
								if (local684.aBoolean6) {
									local66 = this.anInt1022;
									local68 = this.anInt1032;
									local684.anIntArray9[local68] = local684.anIntArray9[local66];
									local684.anIntArray1[local68] = local684.anIntArray1[local66];
									local684.anIntArray9[local66] = -1;
									local684.anIntArray1[local66] = 0;
								} else if (local686 == 1) {
									local66 = this.anInt1022;
									local68 = this.anInt1032;
									while (local66 != local68) {
										if (local66 > local68) {
											local684.method7(local66, local66 - 1);
											local66--;
										} else if (local66 < local68) {
											local684.method7(local66, local66 + 1);
											local66++;
										}
									}
								} else {
									local684.method7(this.anInt1022, this.anInt1032);
								}
								this.aClass6_Sub1_Sub4_6.method228(166);
								this.aClass6_Sub1_Sub4_6.method255(local686, this.aByte65);
								this.aClass6_Sub1_Sub4_6.method264(this.anInt1022);
								this.aClass6_Sub1_Sub4_6.method230(this.anInt1032);
								this.aClass6_Sub1_Sub4_6.method264(this.anInt1021);
							}
						} else if ((this.anInt913 == 1 || this.method672(this.anInt890 - 1)) && this.anInt890 > 2) {
							this.method708();
						} else if (this.anInt890 > 0) {
							this.method616(this.anInt890 - 1);
						}
						this.anInt886 = 10;
						super.anInt819 = 0;
					}
				}
				@Pc(860) int local860;
				@Pc(862) int local862;
				if (Class38.anInt666 != -1) {
					local860 = Class38.anInt666;
					local862 = Class38.anInt667;
					@Pc(883) boolean local883 = this.method598(local860, local862, 0, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0], 0, 0, 0, true, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0], 0, 0);
					Class38.anInt666 = -1;
					if (local883) {
						this.anInt893 = super.anInt820;
						this.anInt894 = super.anInt821;
						this.anInt896 = 1;
						this.anInt895 = 0;
					}
				}
				if (super.anInt819 == 1 && this.aString23 != null) {
					this.aString23 = null;
					this.aBoolean252 = true;
					super.anInt819 = 0;
				}
				this.method711();
				if (this.anInt879 == -1) {
					this.method618();
					this.method664();
					this.method608(this.anInt981);
				}
				if (super.anInt813 == 1 || super.anInt819 == 1) {
					this.anInt934++;
				}
				if (this.anInt892 == 0 && this.anInt844 == 0 && this.anInt939 == 0) {
					if (this.anInt936 > 0) {
						this.anInt936--;
					}
				} else if (this.anInt936 < 100) {
					this.anInt936++;
					if (this.anInt936 == 100) {
						if (this.anInt892 != 0) {
							this.aBoolean252 = true;
						}
						if (this.anInt844 != 0) {
							this.aBoolean238 = true;
						}
					}
				}
				if (this.anInt928 == 2) {
					this.method621();
				}
				if (this.anInt928 == 2 && this.aBoolean247) {
					this.method589();
				}
				for (local860 = 0; local860 < 5; local860++) {
					@Pc(1020) int local1020 = this.anIntArray273[local860]++;
				}
				this.method593(this.anInt1035);
				super.anInt812++;
				if (super.anInt812 > 4500) {
					this.anInt1008 = 250;
					super.anInt812 -= 500;
					this.aClass6_Sub1_Sub4_6.method228(223);
				}
				this.anInt915++;
				if (this.anInt915 > 500) {
					this.anInt915 = 0;
					local862 = (int) (Math.random() * 8.0D);
					if ((local862 & 0x1) == 1) {
						this.anInt898 += this.anInt899;
					}
					if ((local862 & 0x2) == 2) {
						this.anInt833 += this.anInt834;
					}
					if ((local862 & 0x4) == 4) {
						this.anInt835 += this.anInt836;
					}
				}
				if (this.anInt898 < -50) {
					this.anInt899 = 2;
				}
				if (this.anInt898 > 50) {
					this.anInt899 = -2;
				}
				if (this.anInt833 < -55) {
					this.anInt834 = 2;
				}
				if (this.anInt833 > 55) {
					this.anInt834 = -2;
				}
				if (this.anInt835 < -40) {
					this.anInt836 = 1;
				}
				if (this.anInt835 > 40) {
					this.anInt836 = -1;
				}
				this.anInt984++;
				if (this.anInt984 > 500) {
					this.anInt984 = 0;
					local862 = (int) (Math.random() * 8.0D);
					if ((local862 & 0x1) == 1) {
						this.anInt874 += this.anInt875;
					}
					if ((local862 & 0x2) == 2) {
						this.anInt973 += this.anInt974;
					}
				}
				if (this.anInt874 < -60) {
					this.anInt875 = 2;
				}
				if (this.anInt874 > 60) {
					this.anInt875 = -2;
				}
				if (this.anInt973 < -20) {
					this.anInt974 = 1;
				}
				if (this.anInt973 > 10) {
					this.anInt974 = -1;
				}
				this.anInt1007++;
				this.aBoolean243 &= true;
				if (this.anInt1007 > 50) {
					this.aClass6_Sub1_Sub4_6.method228(114);
				}
				try {
					if (this.aClass37_1 != null && this.aClass6_Sub1_Sub4_6.anInt390 > 0) {
						this.aClass37_1.method394(this.aClass6_Sub1_Sub4_6.aByteArray12, this.aClass6_Sub1_Sub4_6.anInt390);
						this.aClass6_Sub1_Sub4_6.anInt390 = 0;
						this.anInt1007 = 0;
					}
				} catch (@Pc(1269) IOException local1269) {
					this.method629();
				} catch (@Pc(1274) Exception local1274) {
					this.method705();
				}
			}
		} catch (@Pc(1279) RuntimeException local1279) {
			signlink.reporterror("27431, " + true + ", " + local1279.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
	private void method697(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) int local3 = 5;
			this.anIntArray236[8] = 0;
			@Pc(10) int local10 = 0;
			if (arg0 != 8) {
				this.aBoolean212 = !this.aBoolean212;
			}
			while (this.anIntArray236[8] == 0) {
				@Pc(25) String local25 = "Unknown problem";
				this.method586("Connecting to web server", 20);
				try {
					@Pc(47) DataInputStream local47 = this.method658("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 374);
					@Pc(54) Class6_Sub1_Sub4 local54 = new Class6_Sub1_Sub4(888, new byte[40]);
					local47.readFully(local54.aByteArray12, 0, 40);
					local47.close();
					for (@Pc(64) int local64 = 0; local64 < 9; local64++) {
						this.anIntArray236[local64] = local54.method244();
					}
					@Pc(79) int local79 = local54.method244();
					@Pc(81) int local81 = 1234;
					for (@Pc(83) int local83 = 0; local83 < 9; local83++) {
						local81 = (local81 << 1) + this.anIntArray236[local83];
					}
					if (local79 != local81) {
						local25 = "checksum problem";
						this.anIntArray236[8] = 0;
					}
				} catch (@Pc(110) EOFException local110) {
					local25 = "EOF problem";
					this.anIntArray236[8] = 0;
				} catch (@Pc(119) IOException local119) {
					local25 = "connection problem";
					this.anIntArray236[8] = 0;
				} catch (@Pc(128) Exception local128) {
					local25 = "logic problem";
					this.anIntArray236[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray236[8] == 0) {
					local10++;
					for (@Pc(146) int local146 = local3; local146 > 0; local146--) {
						if (local10 >= 10) {
							this.method586("Game updated - please reload page", 10);
							local146 = 10;
						} else {
							this.method586(local25 + " - Will retry in " + local146 + " secs.", 10);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(180) Exception local180) {
						}
					}
					local3 *= 2;
					if (local3 > 60) {
						local3 = 60;
					}
					this.aBoolean237 = !this.aBoolean237;
				}
			}
		} catch (@Pc(208) RuntimeException local208) {
			signlink.reporterror("26117, " + arg0 + ", " + local208.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIII)I")
	private int method698(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(9) int local9 = 256 - arg0;
			return ((arg1 & 0xFF00FF) * local9 + (arg2 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg1 & 0xFF00) * local9 + (arg2 & 0xFF00) * arg0 & 0xFF0000) >> 8;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("35625, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method699(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt827; local8++) {
					if (this.aLongArray4[local8] == arg0) {
						this.anInt827--;
						this.aBoolean238 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt827; local28++) {
							this.aStringArray11[local28] = this.aStringArray11[local28 + 1];
							this.anIntArray237[local28] = this.anIntArray237[local28 + 1];
							this.aLongArray4[local28] = this.aLongArray4[local28 + 1];
						}
						this.aClass6_Sub1_Sub4_6.method228(116);
						this.aClass6_Sub1_Sub4_6.method235(arg0);
						break;
					}
				}
			}
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("65859, " + arg0 + ", " + -637 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
	private void method700(@OriginalArg(0) byte arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt873; local3++) {
				if (this.anIntArray222[local3] <= 0) {
					@Pc(12) boolean local12 = false;
					try {
						if (this.anIntArray266[local3] != this.anInt829 || this.anIntArray220[local3] != this.anInt909) {
							@Pc(45) Class6_Sub1_Sub4 local45 = Class25.method162(this.anIntArray266[local3], this.anIntArray220[local3]);
							if (System.currentTimeMillis() + (long) (local45.anInt390 / 22) > this.aLong32 + (long) (this.anInt852 / 22)) {
								this.anInt852 = local45.anInt390;
								this.aLong32 = System.currentTimeMillis();
								if (this.method632(local45.aByteArray12, local45.anInt390)) {
									this.anInt829 = this.anIntArray266[local3];
									this.anInt909 = this.anIntArray220[local3];
								} else {
									local12 = true;
								}
							}
						} else if (!this.method620()) {
							local12 = true;
						}
					} catch (@Pc(95) Exception local95) {
						if (signlink.reporterror) {
							this.aClass6_Sub1_Sub4_6.method228(171);
							this.aClass6_Sub1_Sub4_6.method230(this.anIntArray266[local3] & 0x7FFF);
						} else {
							this.aClass6_Sub1_Sub4_6.method228(171);
							this.aClass6_Sub1_Sub4_6.method230(-1);
						}
					}
					if (local12 && this.anIntArray222[local3] != -5) {
						this.anIntArray222[local3] = -5;
					} else {
						this.anInt873--;
						for (@Pc(138) int local138 = local3; local138 < this.anInt873; local138++) {
							this.anIntArray266[local138] = this.anIntArray266[local138 + 1];
							this.anIntArray220[local138] = this.anIntArray220[local138 + 1];
							this.anIntArray222[local138] = this.anIntArray222[local138 + 1];
						}
						local3--;
					}
				} else {
					@Pc(190) int local190 = this.anIntArray222[local3]--;
				}
			}
			anInt867++;
			@Pc(207) boolean local207 = false;
			if (anInt867 > 1454) {
				anInt867 = 0;
				this.aClass6_Sub1_Sub4_6.method228(31);
				this.aClass6_Sub1_Sub4_6.method229(0);
				@Pc(231) int local231 = this.aClass6_Sub1_Sub4_6.anInt390;
				this.aClass6_Sub1_Sub4_6.method230((int) (Math.random() * 65536.0D));
				this.aClass6_Sub1_Sub4_6.method230(26445);
				this.aClass6_Sub1_Sub4_6.method229((int) (Math.random() * 256.0D));
				this.aClass6_Sub1_Sub4_6.method230((int) (Math.random() * 65536.0D));
				this.aClass6_Sub1_Sub4_6.method229((int) (Math.random() * 256.0D));
				this.aClass6_Sub1_Sub4_6.method230((int) (Math.random() * 65536.0D));
				this.aClass6_Sub1_Sub4_6.method230(39738);
				this.aClass6_Sub1_Sub4_6.method229(180);
				this.aClass6_Sub1_Sub4_6.method229(202);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass6_Sub1_Sub4_6.method230(48946);
				}
				this.aClass6_Sub1_Sub4_6.method238(this.aClass6_Sub1_Sub4_6.anInt390 - local231);
			}
			if (this.anInt1028 > 0) {
				this.anInt1028 -= 20;
				if (this.anInt1028 < 0) {
					this.anInt1028 = 0;
				}
				if (this.anInt1028 == 0 && this.aBoolean239 && !aBoolean225) {
					this.anInt998 = this.anInt883;
					this.aBoolean246 = true;
					this.aClass30_Sub1_1.method282(2, this.anInt998);
					return;
				}
			}
		} catch (@Pc(338) RuntimeException local338) {
			signlink.reporterror("76800, " + arg0 + ", " + local338.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IIII)Z")
	private boolean method701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(7) int local7 = arg0 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass38_1.method427(this.anInt854, arg1, arg2, arg0);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(43) Class11 local43 = Class11.method60(local7);
				@Pc(51) int local51;
				@Pc(54) int local54;
				if (local31 == 0 || local31 == 2) {
					local51 = local43.anInt111;
					local54 = local43.anInt127;
				} else {
					local51 = local43.anInt127;
					local54 = local43.anInt111;
				}
				@Pc(65) int local65 = local43.anInt126;
				if (local31 != 0) {
					local65 = (local65 << local31 & 0xF) + (local65 >> 4 - local31);
				}
				this.method598(arg1, arg2, local65, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0], local51, 2, local54, true, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0], 0, 0);
			} else {
				this.method598(arg1, arg2, 0, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0], 0, 2, 0, true, aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0], local25 + 1, local31);
			}
			this.anInt893 = super.anInt820;
			this.anInt894 = super.anInt821;
			this.anInt896 = 2;
			this.anInt895 = 0;
			return true;
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("67319, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 6 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;)Z")
	private boolean method702(@OriginalArg(1) String arg0) {
		try {
			@Pc(7) int local7;
			if (106 != this.aByte67) {
				for (local7 = 1; local7 > 0; local7++) {
				}
			}
			if (arg0 == null) {
				return false;
			}
			for (local7 = 0; local7 < this.anInt827; local7++) {
				if (arg0.equalsIgnoreCase(this.aStringArray11[local7])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass6_Sub1_Sub2_Sub4_Sub2_1.aString16);
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("56816, " + 106 + ", " + arg0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!ATOBWHST;)Z")
	private boolean method703(@OriginalArg(1) Class1 arg0) {
		try {
			@Pc(9) int local9 = arg0.anInt12;
			if (this.anInt828 == 2) {
				if (local9 == 201) {
					this.aBoolean252 = true;
					this.anInt1018 = 0;
					this.aBoolean216 = true;
					this.aString18 = "";
					this.anInt975 = 1;
					this.aString24 = "Enter name of friend to add to list";
				}
				if (local9 == 202) {
					this.aBoolean252 = true;
					this.anInt1018 = 0;
					this.aBoolean216 = true;
					this.aString18 = "";
					this.anInt975 = 2;
					this.aString24 = "Enter name of friend to delete from list";
				}
			}
			if (local9 == 205) {
				this.anInt1008 = 250;
				return true;
			}
			if (local9 == 501) {
				this.aBoolean252 = true;
				this.anInt1018 = 0;
				this.aBoolean216 = true;
				this.aString18 = "";
				this.anInt975 = 4;
				this.aString24 = "Enter name of player to add to list";
			}
			if (local9 == 502) {
				this.aBoolean252 = true;
				this.anInt1018 = 0;
				this.aBoolean216 = true;
				this.aString18 = "";
				this.anInt975 = 5;
				this.aString24 = "Enter name of player to delete from list";
			}
			@Pc(117) int local117;
			@Pc(121) int local121;
			@Pc(126) int local126;
			if (local9 >= 300 && local9 <= 313) {
				local117 = (local9 - 300) / 2;
				local121 = local9 & 0x1;
				local126 = this.anIntArray233[local117];
				if (local126 != -1) {
					while (true) {
						if (local121 == 0) {
							local126--;
							if (local126 < 0) {
								local126 = Class48.anInt779 - 1;
							}
						}
						if (local121 == 1) {
							local126++;
							if (local126 >= Class48.anInt779) {
								local126 = 0;
							}
						}
						if (!Class48.aClass48Array1[local126].aBoolean188 && Class48.aClass48Array1[local126].anInt780 == local117 + (this.aBoolean220 ? 0 : 7)) {
							this.anIntArray233[local117] = local126;
							this.aBoolean232 = true;
							break;
						}
					}
				}
			}
			if (local9 >= 314 && local9 <= 323) {
				local117 = (local9 - 314) / 2;
				local121 = local9 & 0x1;
				local126 = this.anIntArray212[local117];
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
				this.anIntArray212[local117] = local126;
				this.aBoolean232 = true;
			}
			if (local9 == 324 && !this.aBoolean220) {
				this.aBoolean220 = true;
				this.method627();
			}
			if (local9 == 325 && this.aBoolean220) {
				this.aBoolean220 = false;
				this.method627();
			}
			if (local9 == 326) {
				this.aClass6_Sub1_Sub4_6.method228(94);
				this.aClass6_Sub1_Sub4_6.method229(this.aBoolean220 ? 0 : 1);
				for (local117 = 0; local117 < 7; local117++) {
					this.aClass6_Sub1_Sub4_6.method229(this.anIntArray233[local117]);
				}
				for (local121 = 0; local121 < 5; local121++) {
					this.aClass6_Sub1_Sub4_6.method229(this.anIntArray212[local121]);
				}
				return true;
			}
			if (local9 == 620) {
				this.aBoolean234 = !this.aBoolean234;
			}
			if (local9 >= 601 && local9 <= 613) {
				this.method606();
				if (this.aString30.length() > 0) {
					this.aClass6_Sub1_Sub4_6.method228(52);
					this.aClass6_Sub1_Sub4_6.method235(Class41.method481(this.aString30));
					this.aClass6_Sub1_Sub4_6.method229(local9 - 601);
					this.aClass6_Sub1_Sub4_6.method229(this.aBoolean234 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(354) RuntimeException local354) {
			signlink.reporterror("44832, " + 0 + ", " + arg0 + ", " + local354.toString());
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

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(B)V")
	private void method704(@OriginalArg(0) byte arg0) {
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
				this.anInt924 = -1;
				this.aClass40_10.method476();
				this.aClass40_12.method476();
				Class6_Sub1_Sub3_Sub1.method206();
				this.method690();
				this.aClass38_1.method397();
				System.gc();
				for (local22 = 0; local22 < 4; local22++) {
					this.aClass12Array1[local22].method66();
				}
				for (local35 = 0; local35 < 4; local35++) {
					for (local39 = 0; local39 < 104; local39++) {
						for (local43 = 0; local43 < 104; local43++) {
							this.aByteArrayArrayArray8[local35][local39][local43] = 0;
						}
					}
				}
				@Pc(77) Class7 local77 = new Class7(104, 0, this.aByteArrayArrayArray8, this.anIntArrayArrayArray7, 104);
				local43 = this.aByteArrayArray6.length;
				this.aClass6_Sub1_Sub4_6.method228(114);
				@Pc(238) int local238;
				@Pc(226) int local226;
				if (!this.aBoolean251) {
					@Pc(122) byte[] local122;
					for (local91 = 0; local91 < local43; local91++) {
						local105 = (this.anIntArray254[local91] >> 8) * 64 - this.anInt959;
						local117 = (this.anIntArray254[local91] & 0xFF) * 64 - this.anInt960;
						local122 = this.aByteArrayArray6[local91];
						if (local122 != null) {
							local77.method25(local122, (this.anInt910 - 6) * 8, local105, this.aClass12Array1, local117, (this.anInt911 - 6) * 8);
						}
					}
					for (local105 = 0; local105 < local43; local105++) {
						local117 = (this.anIntArray254[local105] >> 8) * 64 - this.anInt959;
						local176 = (this.anIntArray254[local105] & 0xFF) * 64 - this.anInt960;
						@Pc(181) byte[] local181 = this.aByteArrayArray6[local105];
						if (local181 == null && this.anInt911 < 800) {
							local77.method22(64, 64, local117, local176);
						}
					}
					this.aClass6_Sub1_Sub4_6.method228(114);
					for (local117 = 0; local117 < local43; local117++) {
						local122 = this.aByteArrayArray5[local117];
						if (local122 != null) {
							local226 = (this.anIntArray254[local117] >> 8) * 64 - this.anInt959;
							local238 = (this.anIntArray254[local117] & 0xFF) * 64 - this.anInt960;
							local77.method27(this.aClass38_1, this.aClass12Array1, local122, local226, local238, this.aByte60);
						}
					}
				}
				if (this.aBoolean251) {
					local91 = 0;
					label254: while (true) {
						@Pc(294) int local294;
						@Pc(300) int local300;
						@Pc(306) int local306;
						@Pc(316) int local316;
						@Pc(318) int local318;
						if (local91 >= 4) {
							for (local105 = 0; local105 < 13; local105++) {
								for (local117 = 0; local117 < 13; local117++) {
									local176 = this.anIntArrayArrayArray8[0][local105][local117];
									if (local176 == -1) {
										local77.method22(8, 8, local105 * 8, local117 * 8);
									}
								}
							}
							this.aClass6_Sub1_Sub4_6.method228(114);
							local117 = 0;
							while (true) {
								if (local117 >= 4) {
									break label254;
								}
								for (local176 = 0; local176 < 13; local176++) {
									for (local226 = 0; local226 < 13; local226++) {
										local238 = this.anIntArrayArrayArray8[local117][local176][local226];
										if (local238 != -1) {
											local294 = local238 >> 24 & 0x3;
											local300 = local238 >> 1 & 0x3;
											local306 = local238 >> 14 & 0x3FF;
											local316 = local238 >> 3 & 0x7FF;
											local318 = (local306 / 8 << 8) + local316 / 8;
											for (@Pc(497) int local497 = 0; local497 < this.anIntArray254.length; local497++) {
												if (this.anIntArray254[local497] == local318 && this.aByteArrayArray5[local497] != null) {
													local77.method41(local294, local176 * 8, (local316 & 0x7) * 8, this.aClass38_1, this.aClass12Array1, local117, local226 * 8, local300, this.aByteArrayArray5[local497], (local306 & 0x7) * 8);
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
								@Pc(270) boolean local270 = false;
								local226 = this.anIntArrayArrayArray8[local91][local105][local117];
								if (local226 != -1) {
									local238 = local226 >> 24 & 0x3;
									local294 = local226 >> 1 & 0x3;
									local300 = local226 >> 14 & 0x3FF;
									local306 = local226 >> 3 & 0x7FF;
									local316 = (local300 / 8 << 8) + local306 / 8;
									for (local318 = 0; local318 < this.anIntArray254.length; local318++) {
										if (this.anIntArray254[local318] == local316 && this.aByteArrayArray6[local318] != null) {
											local77.method29(this.aClass12Array1, (local300 & 0x7) * 8, local117 * 8, local105 * 8, local294, local238, local91, this.aByteArrayArray6[local318], (local306 & 0x7) * 8);
											local270 = true;
											break;
										}
									}
								}
								if (!local270) {
									local77.method34(local91, local105 * 8, local117 * 8);
								}
							}
						}
						local91++;
					}
				}
				this.aClass6_Sub1_Sub4_6.method228(114);
				local77.method42(this.aClass12Array1, this.aClass38_1);
				if (this.aClass8_23 != null) {
					this.aClass8_23.method43();
					Class6_Sub1_Sub3_Sub1.anIntArray124 = this.anIntArray246;
				}
				this.aClass6_Sub1_Sub4_6.method228(114);
				local91 = Class7.anInt69;
				if (local91 > this.anInt854) {
					local91 = this.anInt854;
				}
				if (local91 < this.anInt854 - 1) {
					local91 = this.anInt854 - 1;
				}
				if (aBoolean225) {
					this.aClass38_1.method398(Class7.anInt69);
				} else {
					this.aClass38_1.method398(0);
				}
				for (local105 = 0; local105 < 104; local105++) {
					for (local117 = 0; local117 < 104; local117++) {
						this.method636(local105, local117);
					}
				}
				this.method626();
			} catch (@Pc(646) Exception local646) {
			}
			Class11.aClass46_4.method531();
			if (super.aFrame_Sub1_2 != null) {
				this.aClass6_Sub1_Sub4_6.method228(81);
				this.aClass6_Sub1_Sub4_6.method233(1057001181);
			}
			if (aBoolean225 && signlink.aRandomAccessFile3 != null) {
				local22 = this.aClass30_Sub1_1.method296(0);
				for (local35 = 0; local35 < local22; local35++) {
					local39 = this.aClass30_Sub1_1.method279(anInt978, local35);
					if ((local39 & 0x79) == 0) {
						Class6_Sub1_Sub2_Sub2.method85((byte) 3, local35);
					}
				}
			}
			System.gc();
			Class6_Sub1_Sub3_Sub1.method207();
			this.aClass30_Sub1_1.method292();
			local22 = (this.anInt910 - 6) / 8 - 1;
			local35 = (this.anInt910 + 6) / 8 + 1;
			local39 = (this.anInt911 - 6) / 8 - 1;
			local43 = (this.anInt911 + 6) / 8 + 1;
			@Pc(740) boolean local740 = false;
			if (this.aBoolean250) {
				local22 = 49;
				local35 = 50;
				local39 = 49;
				local43 = 50;
			}
			for (local91 = local22; local91 <= local35; local91++) {
				for (local105 = local39; local105 <= local43; local105++) {
					if (local91 == local22 || local91 == local35 || local105 == local39 || local105 == local43) {
						local117 = this.aClass30_Sub1_1.method284(0, local91, local105, (byte) 2);
						if (local117 != -1) {
							this.aClass30_Sub1_1.method283(local117, 3);
						}
						local176 = this.aClass30_Sub1_1.method284(1, local91, local105, (byte) 2);
						if (local176 != -1) {
							this.aClass30_Sub1_1.method283(local176, 3);
						}
					}
				}
			}
		} catch (@Pc(822) RuntimeException local822) {
			signlink.reporterror("318, " + arg0 + ", " + local822.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method705() {
		try {
			this.anInt1004 += 0;
			try {
				if (this.aClass37_1 != null) {
					this.aClass37_1.method390();
				}
			} catch (@Pc(13) Exception local13) {
			}
			this.aClass37_1 = null;
			this.aBoolean243 = false;
			this.anInt925 = 0;
			this.aString20 = "";
			this.aString21 = "";
			this.method690();
			this.aClass38_1.method397();
			for (@Pc(37) int local37 = 0; local37 < 4; local37++) {
				this.aClass12Array1[local37].method66();
			}
			System.gc();
			this.method649();
			this.anInt883 = -1;
			this.anInt998 = -1;
			this.anInt1028 = 0;
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("28202, " + 0 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
	private void method706(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(16) int local16;
			if (this.aClass8_23 != null) {
				this.aClass8_23.method43();
				Class6_Sub1_Sub3_Sub1.anIntArray124 = this.anIntArray246;
				local16 = 151;
				if (arg0 != null) {
					local16 -= 7;
				}
				this.aClass6_Sub1_Sub3_Sub4_3.method557(arg1, 257, 0, local16);
				this.aClass6_Sub1_Sub3_Sub4_3.method557(arg1, 256, 16777215, local16 - 1);
				local16 += 15;
				if (arg0 != null) {
					this.aClass6_Sub1_Sub3_Sub4_3.method557(arg0, 257, 0, local16);
					this.aClass6_Sub1_Sub3_Sub4_3.method557(arg0, 256, 16777215, local16 - 1);
				}
				this.aClass8_23.method44(4, super.aGraphics2, 4);
			} else if (super.aClass8_2 != null) {
				super.aClass8_2.method43();
				Class6_Sub1_Sub3_Sub1.anIntArray124 = this.anIntArray247;
				local16 = 251;
				Class6_Sub1_Sub3.method549(233, 300, 221, 0, 50);
				Class6_Sub1_Sub3.method550(50, 300, 233, 221, 16777215, (byte) 1);
				if (arg0 != null) {
					local16 -= 7;
				}
				this.aClass6_Sub1_Sub3_Sub4_3.method557(arg1, 383, 0, local16);
				this.aClass6_Sub1_Sub3_Sub4_3.method557(arg1, 382, 16777215, local16 - 1);
				local16 += 15;
				if (arg0 != null) {
					this.aClass6_Sub1_Sub3_Sub4_3.method557(arg0, 383, 0, local16);
					this.aClass6_Sub1_Sub3_Sub4_3.method557(arg0, 382, 16777215, local16 - 1);
				}
				super.aClass8_2.method44(0, super.aGraphics2, 0);
			}
		} catch (@Pc(169) RuntimeException local169) {
			signlink.reporterror("4079, " + arg0 + ", " + 462 + ", " + arg1 + ", " + local169.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZLclient!ATOBWHST;)Z")
	private boolean method707(@OriginalArg(1) Class1 arg0) {
		try {
			@Pc(10) int local10 = arg0.anInt12;
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
				this.aStringArray9[this.anInt890] = "Remove @whi@" + this.aStringArray11[local10];
				this.anIntArray218[this.anInt890] = 360;
				this.anInt890++;
				this.aStringArray9[this.anInt890] = "Message @whi@" + this.aStringArray11[local10];
				this.anIntArray218[this.anInt890] = 654;
				this.anInt890++;
				return true;
			} else if (local10 >= 401 && local10 <= 500) {
				this.aStringArray9[this.anInt890] = "Remove @whi@" + arg0.aString3;
				this.anIntArray218[this.anInt890] = 61;
				this.anInt890++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("28406, " + false + ", " + arg0 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method708() {
		try {
			@Pc(7) int local7 = this.aClass6_Sub1_Sub3_Sub4_4.method559("Choose Option");
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt890; local9++) {
				local20 = this.aClass6_Sub1_Sub3_Sub4_4.method559(this.aStringArray9[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			local7 += 8;
			local20 = 15 * this.anInt890 + 21;
			@Pc(77) int local77;
			@Pc(95) int local95;
			if (super.anInt820 > 4 && super.anInt821 > 4 && super.anInt820 < 516 && super.anInt821 < 338) {
				local77 = super.anInt820 - 4 - local7 / 2;
				if (local77 + local7 > 512) {
					local77 = 512 - local7;
				}
				if (local77 < 0) {
					local77 = 0;
				}
				local95 = super.anInt821 - 4;
				if (local95 + local20 > 334) {
					local95 = 334 - local20;
				}
				if (local95 < 0) {
					local95 = 0;
				}
				this.aBoolean217 = true;
				this.anInt919 = 0;
				this.anInt920 = local77;
				this.anInt921 = local95;
				this.anInt922 = local7;
				this.anInt923 = 15 * this.anInt890 + 22;
			}
			if (super.anInt820 > 553 && super.anInt821 > 205 && super.anInt820 < 743 && super.anInt821 < 466) {
				local77 = super.anInt820 - 553 - local7 / 2;
				if (local77 < 0) {
					local77 = 0;
				} else if (local77 + local7 > 190) {
					local77 = 190 - local7;
				}
				local95 = super.anInt821 - 205;
				if (local95 < 0) {
					local95 = 0;
				} else if (local95 + local20 > 261) {
					local95 = 261 - local20;
				}
				this.aBoolean217 = true;
				this.anInt919 = 1;
				this.anInt920 = local77;
				this.anInt921 = local95;
				this.anInt922 = local7;
				this.anInt923 = 15 * this.anInt890 + 22;
			}
			if (super.anInt820 > 17 && super.anInt821 > 357 && super.anInt820 < 496 && super.anInt821 < 453) {
				local77 = super.anInt820 - 17 - local7 / 2;
				if (local77 < 0) {
					local77 = 0;
				} else if (local77 + local7 > 479) {
					local77 = 479 - local7;
				}
				local95 = super.anInt821 - 357;
				if (local95 < 0) {
					local95 = 0;
				} else if (local95 + local20 > 96) {
					local95 = 96 - local20;
				}
				this.aBoolean217 = true;
				this.anInt919 = 2;
				this.anInt920 = local77;
				this.anInt921 = local95;
				this.anInt922 = local7;
				this.anInt923 = 15 * this.anInt890 + 22;
			}
		} catch (@Pc(299) RuntimeException local299) {
			signlink.reporterror("53898, " + 9 + ", " + local299.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!PQBRPYKE;II)V")
	private void method709(@OriginalArg(0) Class6_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt988; local3++) {
				@Pc(10) int local10 = this.anIntArray252[local3];
				@Pc(15) Class6_Sub1_Sub2_Sub4_Sub1 local15 = this.aClass6_Sub1_Sub2_Sub4_Sub1Array1[local10];
				@Pc(18) int local18 = arg0.method239();
				@Pc(27) int local27;
				@Pc(31) int local31;
				if ((local18 & 0x20) != 0) {
					local27 = arg0.method260(this.anInt856);
					local31 = arg0.method259();
					local15.method380(anInt1041, local27, local31);
					local15.anInt567 = anInt1041 + 300;
					local15.anInt568 = arg0.method259();
					local15.anInt569 = arg0.method239();
				}
				if ((local18 & 0x4) != 0) {
					local15.anInt591 = arg0.method269((byte) 2);
					if (local15.anInt591 == 65535) {
						local15.anInt591 = -1;
					}
				}
				if ((local18 & 0x2) != 0) {
					local15.anInt603 = arg0.method269((byte) 2);
					local15.anInt604 = arg0.method267();
				}
				if ((local18 & 0x10) != 0) {
					local15.anInt592 = arg0.method241();
					local27 = arg0.method244();
					local15.anInt596 = local27 >> 16;
					local15.anInt595 = anInt1041 + (local27 & 0xFFFF);
					local15.anInt593 = 0;
					local15.anInt594 = 0;
					if (local15.anInt595 > anInt1041) {
						local15.anInt593 = -1;
					}
					if (local15.anInt592 == 65535) {
						local15.anInt592 = -1;
					}
				}
				if ((local18 & 0x1) != 0) {
					local15.aString15 = arg0.method246();
					local15.anInt601 = 100;
				}
				if ((local18 & 0x80) != 0) {
					local27 = arg0.method267();
					if (local27 == 65535) {
						local27 = -1;
					}
					local31 = arg0.method258();
					if (local27 == local15.anInt609 && local27 != -1) {
						@Pc(164) int local164 = Class2.aClass2Array1[local27].anInt48;
						if (local164 == 1) {
							local15.anInt610 = 0;
							local15.anInt611 = 0;
							local15.anInt612 = local31;
							local15.anInt613 = 0;
						}
						if (local164 == 2) {
							local15.anInt613 = 0;
						}
					} else if (local27 == -1 || local15.anInt609 == -1 || Class2.aClass2Array1[local27].anInt42 >= Class2.aClass2Array1[local15.anInt609].anInt42) {
						local15.anInt609 = local27;
						local15.anInt610 = 0;
						local15.anInt611 = 0;
						local15.anInt612 = local31;
						local15.anInt613 = 0;
						local15.anInt607 = local15.anInt597;
					}
				}
				if ((local18 & 0x8) != 0) {
					local15.aClass20_1 = Class20.method150(arg0.method267());
					local15.anInt577 = local15.aClass20_1.aByte22;
					local15.anInt586 = local15.aClass20_1.anInt286;
					local15.anInt579 = local15.aClass20_1.anInt297;
					local15.anInt580 = local15.aClass20_1.anInt302;
					local15.anInt581 = local15.aClass20_1.anInt284;
					local15.anInt582 = local15.aClass20_1.anInt285;
					local15.anInt599 = local15.aClass20_1.anInt283;
				}
				if ((local18 & 0x40) != 0) {
					local27 = arg0.method239();
					local31 = arg0.method258();
					local15.method380(anInt1041, local27, local31);
					local15.anInt567 = anInt1041 + 300;
					local15.anInt568 = arg0.method239();
					local15.anInt569 = arg0.method258();
				}
			}
		} catch (@Pc(311) RuntimeException local311) {
			signlink.reporterror("72252, " + arg0 + ", " + -843 + ", " + arg1 + ", " + local311.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method710() {
		try {
			this.aBoolean240 = false;
			while (this.aBoolean248) {
				this.aBoolean240 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass6_Sub1_Sub3_Sub2_1 = null;
			this.aClass6_Sub1_Sub3_Sub2_2 = null;
			this.aClass6_Sub1_Sub3_Sub2Array5 = null;
			this.anIntArray228 = null;
			this.anIntArray229 = null;
			this.anIntArray230 = null;
			this.anIntArray231 = null;
			this.anIntArray240 = null;
			this.anIntArray241 = null;
			this.anIntArray268 = null;
			this.anIntArray269 = null;
			this.aClass6_Sub1_Sub3_Sub3_15 = null;
			if (33560 == anInt952) {
				this.aClass6_Sub1_Sub3_Sub3_16 = null;
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("45116, " + 33560 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method711() {
		try {
			if (this.anInt1023 == 0) {
				@Pc(6) int local6 = super.anInt819;
				if (this.anInt990 == 1 && super.anInt820 >= 516 && super.anInt821 >= 160 && super.anInt820 <= 765 && super.anInt821 <= 205) {
					local6 = 0;
				}
				@Pc(41) int local41;
				@Pc(44) int local44;
				@Pc(120) int local120;
				if (this.aBoolean217) {
					if (local6 != 1) {
						local41 = super.anInt814;
						local44 = super.anInt815;
						if (this.anInt919 == 0) {
							local41 -= 4;
							local44 -= 4;
						}
						if (this.anInt919 == 1) {
							local41 -= 553;
							local44 -= 205;
						}
						if (this.anInt919 == 2) {
							local41 -= 17;
							local44 -= 357;
						}
						if (local41 < this.anInt920 - 10 || local41 > this.anInt920 + this.anInt922 + 10 || local44 < this.anInt921 - 10 || local44 > this.anInt921 + this.anInt923 + 10) {
							this.aBoolean217 = false;
							if (this.anInt919 == 1) {
								this.aBoolean238 = true;
							}
							if (this.anInt919 == 2) {
								this.aBoolean252 = true;
							}
						}
					}
					if (local6 == 1) {
						local41 = this.anInt920;
						local44 = this.anInt921;
						local120 = this.anInt922;
						@Pc(123) int local123 = super.anInt820;
						@Pc(126) int local126 = super.anInt821;
						if (this.anInt919 == 0) {
							local123 -= 4;
							local126 -= 4;
						}
						if (this.anInt919 == 1) {
							local123 -= 553;
							local126 -= 205;
						}
						if (this.anInt919 == 2) {
							local123 -= 17;
							local126 -= 357;
						}
						@Pc(145) int local145 = -1;
						for (@Pc(147) int local147 = 0; local147 < this.anInt890; local147++) {
							@Pc(162) int local162 = local44 + 31 + (this.anInt890 - 1 - local147) * 15;
							if (local123 > local41 && local123 < local41 + local120 && local126 > local162 - 13 && local126 < local162 + 3) {
								local145 = local147;
							}
						}
						if (local145 != -1) {
							this.method616(local145);
						}
						this.aBoolean217 = false;
						if (this.anInt919 == 1) {
							this.aBoolean238 = true;
						}
						if (this.anInt919 == 2) {
							this.aBoolean252 = true;
							return;
						}
					}
				} else {
					if (local6 == 1 && this.anInt890 > 0) {
						local41 = this.anIntArray218[this.anInt890 - 1];
						if (local41 == 5 || local41 == 871 || local41 == 123 || local41 == 850 || local41 == 670 || local41 == 479 || local41 == 940 || local41 == 193 || local41 == 115 || local41 == 547 || local41 == 253 || local41 == 1327) {
							local44 = this.anIntArray216[this.anInt890 - 1];
							local120 = this.anIntArray217[this.anInt890 - 1];
							@Pc(281) Class1 local281 = Class1.method4(local120);
							if (local281.aBoolean7 || local281.aBoolean6) {
								this.aBoolean218 = false;
								this.anInt971 = 0;
								this.anInt1021 = local120;
								this.anInt1022 = local44;
								this.anInt1023 = 2;
								this.anInt1024 = super.anInt820;
								this.anInt1025 = super.anInt821;
								if (Class1.method4(local120).anInt2 == this.anInt1051) {
									this.anInt1023 = 1;
								}
								if (Class1.method4(local120).anInt2 == this.anInt979) {
									this.anInt1023 = 3;
								}
								return;
							}
						}
					}
					if (local6 == 1 && (this.anInt913 == 1 || this.method672(this.anInt890 - 1)) && this.anInt890 > 2) {
						local6 = 2;
					}
					if (local6 == 1 && this.anInt890 > 0) {
						this.method616(this.anInt890 - 1);
					}
					if (local6 != 2 || this.anInt890 <= 0) {
						return;
					}
					this.method708();
				}
			}
		} catch (@Pc(374) RuntimeException local374) {
			signlink.reporterror("51182, " + -740 + ", " + local374.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method712(@OriginalArg(0) int arg0) {
		try {
			this.anInt930++;
			this.method592(true);
			this.method628((byte) 3, true);
			this.method592(false);
			this.method628((byte) 3, false);
			this.method687();
			this.method681(550);
			@Pc(35) int local35;
			@Pc(74) int local74;
			if (!this.aBoolean247) {
				local35 = this.anInt1052;
				if (this.anInt884 / 256 > local35) {
					local35 = this.anInt884 / 256;
				}
				if (this.aBooleanArray12[4] && this.anIntArray276[4] + 128 > local35) {
					local35 = this.anIntArray276[4] + 128;
				}
				local74 = this.anInt1053 + this.anInt835 & 0x7FF;
				this.method662(this.anInt870, 600 + local35 * 3, local74, this.method635(this.anInt854, aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt584, aClass6_Sub1_Sub2_Sub4_Sub2_1.anInt583) - 50, local35, this.anInt869);
			}
			if (this.aBoolean247) {
				local35 = this.method685();
			} else {
				local35 = this.method684();
			}
			local74 = this.anInt1009;
			@Pc(118) int local118 = this.anInt1010;
			@Pc(121) int local121 = this.anInt1011;
			@Pc(124) int local124 = this.anInt1012;
			@Pc(127) int local127 = this.anInt1013;
			@Pc(176) int local176;
			for (@Pc(129) int local129 = 0; local129 < 5; local129++) {
				if (this.aBooleanArray12[local129]) {
					local176 = (int) (Math.random() * (double) (this.anIntArray215[local129] * 2 + 1) - (double) this.anIntArray215[local129] + Math.sin((double) this.anIntArray273[local129] * ((double) this.anIntArray238[local129] / 100.0D)) * (double) this.anIntArray276[local129]);
					if (local129 == 0) {
						this.anInt1009 += local176;
					}
					if (local129 == 1) {
						this.anInt1010 += local176;
					}
					if (local129 == 2) {
						this.anInt1011 += local176;
					}
					if (local129 == 3) {
						this.anInt1013 = this.anInt1013 + local176 & 0x7FF;
					}
					if (local129 == 4) {
						this.anInt1012 += local176;
						if (this.anInt1012 < 128) {
							this.anInt1012 = 128;
						}
						if (this.anInt1012 > 383) {
							this.anInt1012 = 383;
						}
					}
				}
			}
			local176 = Class6_Sub1_Sub3_Sub1.anInt377;
			Class6_Sub1_Sub2_Sub2.aBoolean57 = true;
			Class6_Sub1_Sub2_Sub2.anInt160 = 0;
			Class6_Sub1_Sub2_Sub2.anInt158 = super.anInt814 - 4;
			Class6_Sub1_Sub2_Sub2.anInt159 = super.anInt815 - 4;
			Class6_Sub1_Sub3.method547();
			while (arg0 >= 0) {
				for (@Pc(262) int local262 = 1; local262 > 0; local262++) {
				}
			}
			this.aClass38_1.method436(local35, this.anInt1011, this.anInt1009, this.anInt1012, this.anInt1010, this.anInt1013);
			this.aClass38_1.method411();
			this.method587();
			this.method610();
			this.method647(local176);
			this.method723();
			this.aClass8_23.method44(4, super.aGraphics2, 4);
			this.anInt1009 = local74;
			this.anInt1010 = local118;
			this.anInt1011 = local121;
			this.anInt1012 = local124;
			this.anInt1013 = local127;
		} catch (@Pc(326) RuntimeException local326) {
			signlink.reporterror("58865, " + arg0 + ", " + local326.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!PQBRPYKE;)V")
	private void method713(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1_Sub4 arg1) {
		try {
			@Pc(10) int local10 = arg1.method250(8);
			@Pc(16) int local16;
			if (local10 < this.anInt987) {
				for (local16 = local10; local16 < this.anInt987; local16++) {
					this.anIntArray274[this.anInt1048++] = this.anIntArray251[local16];
				}
			}
			if (local10 > this.anInt987) {
				signlink.reporterror(this.aString20 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt987 = 0;
			for (local16 = 0; local16 < local10; local16++) {
				@Pc(68) int local68 = this.anIntArray251[local16];
				@Pc(73) Class6_Sub1_Sub2_Sub4_Sub2 local73 = this.aClass6_Sub1_Sub2_Sub4_Sub2Array1[local68];
				@Pc(78) int local78 = arg1.method250(1);
				if (local78 == 0) {
					this.anIntArray251[this.anInt987++] = local68;
					local73.anInt602 = anInt1041;
				} else {
					@Pc(101) int local101 = arg1.method250(2);
					if (local101 == 0) {
						this.anIntArray251[this.anInt987++] = local68;
						local73.anInt602 = anInt1041;
						this.anIntArray252[this.anInt988++] = local68;
					} else {
						@Pc(152) int local152;
						@Pc(162) int local162;
						if (local101 == 1) {
							this.anIntArray251[this.anInt987++] = local68;
							local73.anInt602 = anInt1041;
							local152 = arg1.method250(3);
							local73.method379(false, local152);
							local162 = arg1.method250(1);
							if (local162 == 1) {
								this.anIntArray252[this.anInt988++] = local68;
							}
						} else if (local101 == 2) {
							this.anIntArray251[this.anInt987++] = local68;
							local73.anInt602 = anInt1041;
							local152 = arg1.method250(3);
							local73.method379(true, local152);
							local162 = arg1.method250(3);
							local73.method379(true, local162);
							@Pc(220) int local220 = arg1.method250(1);
							if (local220 == 1) {
								this.anIntArray252[this.anInt988++] = local68;
							}
						} else if (local101 == 3) {
							this.anIntArray274[this.anInt1048++] = local68;
						}
					}
				}
			}
		} catch (@Pc(257) RuntimeException local257) {
			signlink.reporterror("89063, " + arg0 + ", " + -579 + ", " + arg1 + ", " + local257.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ZI)V")
	private void method714(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) int local4 = Class5.aClass5Array1[arg0].anInt60;
			if (local4 != 0) {
				@Pc(12) int local12 = this.anIntArray239[arg0];
				if (local4 == 1) {
					if (local12 == 1) {
						Class6_Sub1_Sub3_Sub1.method212(0.9D);
					}
					if (local12 == 2) {
						Class6_Sub1_Sub3_Sub1.method212(0.8D);
					}
					if (local12 == 3) {
						Class6_Sub1_Sub3_Sub1.method212(0.7D);
					}
					if (local12 == 4) {
						Class6_Sub1_Sub3_Sub1.method212(0.6D);
					}
					Class35.aClass46_8.method531();
					this.aBoolean244 = true;
				}
				if (local4 == 3) {
					@Pc(56) boolean local56 = this.aBoolean239;
					if (local12 == 0) {
						this.method653(this.aBoolean239, 0);
						this.aBoolean239 = true;
					}
					if (local12 == 1) {
						this.method653(this.aBoolean239, -400);
						this.aBoolean239 = true;
					}
					if (local12 == 2) {
						this.method653(this.aBoolean239, -800);
						this.aBoolean239 = true;
					}
					if (local12 == 3) {
						this.method653(this.aBoolean239, -1200);
						this.aBoolean239 = true;
					}
					if (local12 == 4) {
						this.aBoolean239 = false;
					}
					if (this.aBoolean239 != local56 && !aBoolean225) {
						if (this.aBoolean239) {
							this.anInt998 = this.anInt883;
							this.aBoolean246 = true;
							this.aClass30_Sub1_1.method282(2, this.anInt998);
						} else {
							this.method649();
						}
						this.anInt1028 = 0;
					}
				}
				if (local4 == 4) {
					if (local12 == 0) {
						this.aBoolean241 = true;
						this.method715(0);
					}
					if (local12 == 1) {
						this.aBoolean241 = true;
						this.method715(-400);
					}
					if (local12 == 2) {
						this.aBoolean241 = true;
						this.method715(-800);
					}
					if (local12 == 3) {
						this.aBoolean241 = true;
						this.method715(-1200);
					}
					if (local12 == 4) {
						this.aBoolean241 = false;
					}
				}
				if (local4 == 5) {
					this.anInt913 = local12;
				}
				if (local4 == 6) {
					this.anInt901 = local12;
				}
				if (local4 == 8) {
					this.anInt907 = local12;
					this.aBoolean252 = true;
				}
				if (local4 == 9) {
					this.anInt1014 = local12;
				}
			}
		} catch (@Pc(216) RuntimeException local216) {
			signlink.reporterror("25088, " + true + ", " + arg0 + ", " + local216.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method715(@OriginalArg(0) int arg0) {
		try {
			signlink.anInt1067 = arg0;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("75911, " + arg0 + ", " + 5 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
	private void method716() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt937);
			if (this.aClass30_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass30_Sub1_1.anInt406);
			}
			System.out.println("loop-cycle:" + anInt1041);
			System.out.println("draw-cycle:" + anInt916);
			System.out.println("ptype:" + this.anInt1005);
			System.out.println("psize:" + this.anInt1004);
			if (this.aClass37_1 != null) {
				this.aClass37_1.method395(764);
			}
			super.aBoolean208 = true;
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("19954, " + 764 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)Ljava/awt/Component;")
	@Override
	protected Component method584() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("73092, " + -518 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(B)V")
	private void method717() {
		try {
			if (this.anInt928 == 2) {
				for (@Pc(19) Class6_Sub2 local19 = (Class6_Sub2) this.aClass40_11.method472(); local19 != null; local19 = (Class6_Sub2) this.aClass40_11.method474()) {
					if (local19.anInt199 > 0) {
						local19.anInt199--;
					}
					if (local19.anInt199 != 0) {
						if (local19.anInt210 > 0) {
							local19.anInt210--;
						}
						if (local19.anInt210 == 0 && local19.anInt208 >= 1 && local19.anInt209 >= 1 && local19.anInt208 <= 102 && local19.anInt209 <= 102 && (local19.anInt200 < 0 || Class7.method21(local19.anInt200, local19.anInt202))) {
							this.method661(local19.anInt202, local19.anInt207, local19.anInt200, local19.anInt206, local19.anInt201, local19.anInt208, local19.anInt209);
							local19.anInt210 = -1;
							if (local19.anInt200 == local19.anInt203 && local19.anInt203 == -1) {
								local19.method542();
							} else if (local19.anInt200 == local19.anInt203 && local19.anInt201 == local19.anInt204 && local19.anInt202 == local19.anInt205) {
								local19.method542();
							}
						}
					} else if (local19.anInt203 < 0 || Class7.method21(local19.anInt203, local19.anInt205)) {
						this.method661(local19.anInt205, local19.anInt207, local19.anInt203, local19.anInt206, local19.anInt204, local19.anInt208, local19.anInt209);
						local19.method542();
					}
				}
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("36506, " + 0 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!PQBRPYKE;IB)V")
	private void method718(@OriginalArg(0) Class6_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			arg0.method249();
			@Pc(9) int local9 = arg0.method250(8);
			@Pc(15) int local15;
			if (local9 < this.anInt885) {
				for (local15 = local9; local15 < this.anInt885; local15++) {
					this.anIntArray274[this.anInt1048++] = this.anIntArray227[local15];
				}
			}
			if (local9 > this.anInt885) {
				signlink.reporterror(this.aString20 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt885 = 0;
			for (local15 = 0; local15 < local9; local15++) {
				@Pc(73) int local73 = this.anIntArray227[local15];
				@Pc(78) Class6_Sub1_Sub2_Sub4_Sub1 local78 = this.aClass6_Sub1_Sub2_Sub4_Sub1Array1[local73];
				@Pc(83) int local83 = arg0.method250(1);
				if (local83 == 0) {
					this.anIntArray227[this.anInt885++] = local73;
					local78.anInt602 = anInt1041;
				} else {
					@Pc(106) int local106 = arg0.method250(2);
					if (local106 == 0) {
						this.anIntArray227[this.anInt885++] = local73;
						local78.anInt602 = anInt1041;
						this.anIntArray252[this.anInt988++] = local73;
					} else {
						@Pc(157) int local157;
						@Pc(167) int local167;
						if (local106 == 1) {
							this.anIntArray227[this.anInt885++] = local73;
							local78.anInt602 = anInt1041;
							local157 = arg0.method250(3);
							local78.method379(false, local157);
							local167 = arg0.method250(1);
							if (local167 == 1) {
								this.anIntArray252[this.anInt988++] = local73;
							}
						} else if (local106 == 2) {
							this.anIntArray227[this.anInt885++] = local73;
							local78.anInt602 = anInt1041;
							local157 = arg0.method250(3);
							local78.method379(true, local157);
							local167 = arg0.method250(3);
							local78.method379(true, local167);
							@Pc(225) int local225 = arg0.method250(1);
							if (local225 == 1) {
								this.anIntArray252[this.anInt988++] = local73;
							}
						} else if (local106 == 3) {
							this.anIntArray274[this.anInt1048++] = local73;
						}
					}
				}
			}
		} catch (@Pc(262) RuntimeException local262) {
			signlink.reporterror("70705, " + arg0 + ", " + arg1 + ", " + -22 + ", " + local262.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(B)Z")
	private boolean method719() {
		try {
			if (this.aClass37_1 == null) {
				return false;
			}
			@Pc(1877) String local1877;
			@Pc(242) int local242;
			try {
				@Pc(15) int local15 = this.aClass37_1.method392();
				if (local15 == 0) {
					return false;
				}
				if (this.anInt1005 == -1) {
					this.aClass37_1.method393(this.aClass6_Sub1_Sub4_7.aByteArray12, 0, 1);
					this.anInt1005 = this.aClass6_Sub1_Sub4_7.aByteArray12[0] & 0xFF;
					if (this.aClass42_2 != null) {
						this.anInt1005 = this.anInt1005 - this.aClass42_2.method514() & 0xFF;
					}
					this.anInt1004 = Class22.anIntArray91[this.anInt1005];
					local15--;
				}
				if (this.anInt1004 == -1) {
					if (local15 <= 0) {
						return false;
					}
					this.aClass37_1.method393(this.aClass6_Sub1_Sub4_7.aByteArray12, 0, 1);
					this.anInt1004 = this.aClass6_Sub1_Sub4_7.aByteArray12[0] & 0xFF;
					local15--;
				}
				if (this.anInt1004 == -2) {
					if (local15 <= 1) {
						return false;
					}
					this.aClass37_1.method393(this.aClass6_Sub1_Sub4_7.aByteArray12, 0, 2);
					this.aClass6_Sub1_Sub4_7.anInt390 = 0;
					this.anInt1004 = this.aClass6_Sub1_Sub4_7.method241();
					local15 -= 2;
				}
				if (local15 < this.anInt1004) {
					return false;
				}
				this.aClass6_Sub1_Sub4_7.anInt390 = 0;
				this.aClass37_1.method393(this.aClass6_Sub1_Sub4_7.aByteArray12, 0, this.anInt1004);
				this.anInt1006 = 0;
				this.anInt951 = this.anInt950;
				this.anInt950 = this.anInt949;
				this.anInt949 = this.anInt1005;
				@Pc(169) int local169;
				@Pc(171) int local171;
				@Pc(186) int local186;
				@Pc(162) int local162;
				@Pc(165) Class1 local165;
				if (this.anInt1005 == 180) {
					this.aBoolean238 = true;
					local162 = this.aClass6_Sub1_Sub4_7.method241();
					local165 = Class1.method4(local162);
					local169 = this.aClass6_Sub1_Sub4_7.method241();
					for (local171 = 0; local171 < local169; local171++) {
						local165.anIntArray9[local171] = this.aClass6_Sub1_Sub4_7.method269((byte) 2);
						local186 = this.aClass6_Sub1_Sub4_7.method258();
						if (local186 == 255) {
							local186 = this.aClass6_Sub1_Sub4_7.method274((byte) 4);
						}
						local165.anIntArray1[local171] = local186;
					}
					for (local186 = local169; local186 < local165.anIntArray9.length; local186++) {
						local165.anIntArray9[local186] = 0;
						local165.anIntArray1[local186] = 0;
					}
					this.anInt1005 = -1;
					return true;
				}
				@Pc(294) int local294;
				@Pc(568) int local568;
				@Pc(589) int local589;
				if (this.anInt1005 != 52 && this.anInt1005 != 6) {
					if (this.anInt1005 == 236) {
						this.method607(this.aClass6_Sub1_Sub4_7, this.anInt1004);
						this.aBoolean249 = false;
						this.anInt1005 = -1;
						return true;
					}
					if (this.anInt1005 == 253) {
						this.method688(this.aClass6_Sub1_Sub4_7, this.anInt1004);
						this.anInt1005 = -1;
						return true;
					}
					if (this.anInt1005 == 137) {
						local162 = this.aClass6_Sub1_Sub4_7.method239();
						local242 = this.aClass6_Sub1_Sub4_7.method239();
						local169 = this.aClass6_Sub1_Sub4_7.method239();
						local171 = this.aClass6_Sub1_Sub4_7.method239();
						this.aBooleanArray12[local162] = true;
						this.anIntArray215[local162] = local242;
						this.anIntArray276[local162] = local169;
						this.anIntArray238[local162] = local171;
						this.anIntArray273[local162] = 0;
						this.anInt1005 = -1;
						return true;
					}
					if (this.anInt1005 == 64) {
						this.anInt1019 = this.aClass6_Sub1_Sub4_7.method268() * 30;
						this.anInt1005 = -1;
						return true;
					}
					if (this.anInt1005 == 79) {
						local162 = this.aClass6_Sub1_Sub4_7.method268();
						Class1.method4(local162).anInt5 = 3;
						if (aClass6_Sub1_Sub2_Sub4_Sub2_1.aClass20_2 == null) {
							Class1.method4(local162).anInt6 = (aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray172[0] << 25) + (aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray172[4] << 20) + (aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray171[0] << 15) + (aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray171[8] << 10) + (aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray171[11] << 5) + aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray171[1];
						} else {
							Class1.method4(local162).anInt6 = (int) (305419896L + aClass6_Sub1_Sub2_Sub4_Sub2_1.aClass20_2.aLong12);
						}
						this.anInt1005 = -1;
						return true;
					}
					@Pc(1293) Class1 local1293;
					if (this.anInt1005 == 181) {
						local162 = this.aClass6_Sub1_Sub4_7.method271();
						local242 = this.aClass6_Sub1_Sub4_7.method267();
						local1293 = Class1.method4(local242);
						if (local1293.anInt3 != local162 || local162 == -1) {
							local1293.anInt3 = local162;
							local1293.anInt38 = 0;
							local1293.anInt36 = 0;
						}
						this.anInt1005 = -1;
						return true;
					}
					if (this.anInt1005 != 71) {
						if (this.anInt1005 == 235) {
							this.anInt1002 = this.aClass6_Sub1_Sub4_7.method239();
							if (this.anInt1002 == 1) {
								this.anInt847 = this.aClass6_Sub1_Sub4_7.method241();
							}
							if (this.anInt1002 >= 2 && this.anInt1002 <= 6) {
								if (this.anInt1002 == 2) {
									this.anInt864 = 64;
									this.anInt865 = 64;
								}
								if (this.anInt1002 == 3) {
									this.anInt864 = 0;
									this.anInt865 = 64;
								}
								if (this.anInt1002 == 4) {
									this.anInt864 = 128;
									this.anInt865 = 64;
								}
								if (this.anInt1002 == 5) {
									this.anInt864 = 64;
									this.anInt865 = 0;
								}
								if (this.anInt1002 == 6) {
									this.anInt864 = 64;
									this.anInt865 = 128;
								}
								this.anInt1002 = 2;
								this.anInt861 = this.aClass6_Sub1_Sub4_7.method241();
								this.anInt862 = this.aClass6_Sub1_Sub4_7.method241();
								this.anInt863 = this.aClass6_Sub1_Sub4_7.method239();
							}
							if (this.anInt1002 == 10) {
								this.anInt837 = this.aClass6_Sub1_Sub4_7.method241();
							}
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 36) {
							local162 = this.aClass6_Sub1_Sub4_7.method268();
							local242 = this.aClass6_Sub1_Sub4_7.method241();
							local169 = this.aClass6_Sub1_Sub4_7.method269((byte) 2);
							Class1.method4(local169).anInt28 = (local162 << 16) + local242;
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 163) {
							this.anInt1038 = this.aClass6_Sub1_Sub4_7.method259();
							if (this.anInt1038 == this.anInt1016) {
								if (this.anInt1038 == 3) {
									this.anInt1016 = 1;
								} else {
									this.anInt1016 = 3;
								}
								this.aBoolean238 = true;
							}
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 134) {
							this.aBoolean238 = true;
							local162 = this.aClass6_Sub1_Sub4_7.method258();
							local242 = this.aClass6_Sub1_Sub4_7.method273();
							local169 = this.aClass6_Sub1_Sub4_7.method239();
							this.anIntArray226[local162] = local242;
							this.anIntArray242[local162] = local169;
							this.anIntArray250[local162] = 1;
							for (local171 = 0; local171 < 98; local171++) {
								if (local242 >= anIntArray253[local171]) {
									this.anIntArray250[local162] = local171 + 2;
								}
							}
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 46) {
							this.aBoolean247 = false;
							for (local162 = 0; local162 < 5; local162++) {
								this.aBooleanArray12[local162] = false;
							}
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 226) {
							local162 = this.aClass6_Sub1_Sub4_7.method268();
							local242 = this.aClass6_Sub1_Sub4_7.method269((byte) 2);
							this.method619(local162);
							if (local242 != -1) {
								this.method619(local242);
							}
							if (this.anInt1051 != -1) {
								this.method604(this.anInt1051);
								this.anInt1051 = -1;
							}
							if (this.anInt868 != -1) {
								this.method604(this.anInt868);
								this.anInt868 = -1;
							}
							if (this.anInt979 != -1) {
								this.method604(this.anInt979);
								this.anInt979 = -1;
							}
							if (this.anInt879 != local162) {
								this.method604(this.anInt879);
								this.anInt879 = local162;
							}
							if (this.anInt855 != local162) {
								this.method604(this.anInt855);
								this.anInt855 = local242;
							}
							this.anInt1018 = 0;
							this.aBoolean245 = false;
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 158) {
							local162 = this.aClass6_Sub1_Sub4_7.method267();
							@Pc(1716) boolean local1716 = this.aClass6_Sub1_Sub4_7.method260(this.anInt856) == 1;
							Class1.method4(local162).aBoolean5 = local1716;
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 152) {
							for (local162 = 0; local162 < this.aClass6_Sub1_Sub2_Sub4_Sub2Array1.length; local162++) {
								if (this.aClass6_Sub1_Sub2_Sub4_Sub2Array1[local162] != null) {
									this.aClass6_Sub1_Sub2_Sub4_Sub2Array1[local162].anInt609 = -1;
								}
							}
							for (local242 = 0; local242 < this.aClass6_Sub1_Sub2_Sub4_Sub1Array1.length; local242++) {
								if (this.aClass6_Sub1_Sub2_Sub4_Sub1Array1[local242] != null) {
									this.aClass6_Sub1_Sub2_Sub4_Sub1Array1[local242].anInt609 = -1;
								}
							}
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 2) {
							this.anInt853 = this.aClass6_Sub1_Sub4_7.method267();
							this.anInt872 = this.aClass6_Sub1_Sub4_7.method267();
							this.anInt1017 = this.aClass6_Sub1_Sub4_7.method269((byte) 2);
							this.anInt859 = this.aClass6_Sub1_Sub4_7.method267();
							this.anInt929 = this.aClass6_Sub1_Sub4_7.method274((byte) 4);
							this.aClass6_Sub1_Sub4_7.method268();
							this.anInt958 = this.aClass6_Sub1_Sub4_7.method269((byte) 2);
							this.anInt977 = this.aClass6_Sub1_Sub4_7.method267();
							this.anInt902 = this.aClass6_Sub1_Sub4_7.method268();
							this.anInt968 = this.aClass6_Sub1_Sub4_7.method268();
							this.aClass6_Sub1_Sub4_7.method260(this.anInt856);
							signlink.dnslookup(Class41.method484(this.anInt929));
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 243) {
							this.anInt1047 = this.aClass6_Sub1_Sub4_7.method239();
							this.anInt1005 = -1;
							return true;
						}
						@Pc(1888) String local1888;
						@Pc(1893) boolean local1893;
						@Pc(2028) String local2028;
						if (this.anInt1005 == 162) {
							local1877 = this.aClass6_Sub1_Sub4_7.method246();
							@Pc(1891) long local1891;
							if (local1877.endsWith(":tradereq:")) {
								local1888 = local1877.substring(0, local1877.indexOf(":"));
								local1891 = Class41.method481(local1888);
								local1893 = false;
								for (local294 = 0; local294 < this.anInt843; local294++) {
									if (this.aLongArray3[local294] == local1891) {
										local1893 = true;
										break;
									}
								}
								if (!local1893 && this.anInt1049 == 0) {
									this.method670("wishes to trade with you.", local1888, 4);
								}
							} else if (local1877.endsWith(":duelreq:")) {
								local1888 = local1877.substring(0, local1877.indexOf(":"));
								local1891 = Class41.method481(local1888);
								local1893 = false;
								for (local294 = 0; local294 < this.anInt843; local294++) {
									if (this.aLongArray3[local294] == local1891) {
										local1893 = true;
										break;
									}
								}
								if (!local1893 && this.anInt1049 == 0) {
									this.method670("wishes to duel with you.", local1888, 8);
								}
							} else if (local1877.endsWith(":chalreq:")) {
								local1888 = local1877.substring(0, local1877.indexOf(":"));
								local1891 = Class41.method481(local1888);
								local1893 = false;
								for (local294 = 0; local294 < this.anInt843; local294++) {
									if (this.aLongArray3[local294] == local1891) {
										local1893 = true;
										break;
									}
								}
								if (!local1893 && this.anInt1049 == 0) {
									local2028 = local1877.substring(local1877.indexOf(":") + 1, local1877.length() - 9);
									this.method670(local2028, local1888, 8);
								}
							} else {
								this.method670(local1877, "", 0);
							}
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 115) {
							local162 = this.aClass6_Sub1_Sub4_7.method242();
							if (local162 != this.anInt976) {
								this.method604(this.anInt976);
								this.anInt976 = local162;
							}
							this.aBoolean252 = true;
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 100) {
							local162 = this.aClass6_Sub1_Sub4_7.method274((byte) 4);
							local242 = this.aClass6_Sub1_Sub4_7.method269((byte) 2);
							this.anIntArray275[local242] = local162;
							if (this.anIntArray239[local242] != local162) {
								this.anIntArray239[local242] = local162;
								this.method714(local242);
								this.aBoolean238 = true;
								if (this.anInt976 != -1) {
									this.aBoolean252 = true;
								}
							}
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 245 || this.anInt1005 == 68 || this.anInt1005 == 164 || this.anInt1005 == 183 || this.anInt1005 == 252 || this.anInt1005 == 248 || this.anInt1005 == 124 || this.anInt1005 == 241 || this.anInt1005 == 11 || this.anInt1005 == 156 || this.anInt1005 == 121) {
							this.method590(this.aClass6_Sub1_Sub4_7, this.anInt1005);
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 14) {
							local162 = this.aClass6_Sub1_Sub4_7.method242();
							if (local162 >= 0) {
								this.method619(local162);
							}
							if (local162 != this.anInt830) {
								this.method604(this.anInt830);
								this.anInt830 = local162;
							}
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 184) {
							this.anInt1026 = 0;
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 196) {
							this.anInt843 = this.anInt1004 / 8;
							for (local162 = 0; local162 < this.anInt843; local162++) {
								this.aLongArray3[local162] = this.aClass6_Sub1_Sub4_7.method245();
							}
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 26) {
							local162 = this.aClass6_Sub1_Sub4_7.method268();
							if (local162 == 65535) {
								local162 = -1;
							}
							if (local162 != this.anInt883 && this.aBoolean239 && !aBoolean225 && this.anInt1028 == 0) {
								this.anInt998 = local162;
								this.aBoolean246 = true;
								this.aClass30_Sub1_1.method282(2, this.anInt998);
							}
							this.anInt883 = local162;
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 53) {
							local162 = this.aClass6_Sub1_Sub4_7.method272(572);
							local242 = this.aClass6_Sub1_Sub4_7.method267();
							if (this.aBoolean239 && !aBoolean225) {
								this.anInt998 = local242;
								this.aBoolean246 = false;
								this.aClass30_Sub1_1.method282(2, this.anInt998);
								this.anInt1028 = local162;
							}
							this.anInt1005 = -1;
							return true;
						}
						@Pc(2349) long local2349;
						if (this.anInt1005 == 136) {
							local2349 = this.aClass6_Sub1_Sub4_7.method245();
							local169 = this.aClass6_Sub1_Sub4_7.method239();
							@Pc(2359) String local2359 = Class41.method485(Class41.method482(local2349, (byte) 7));
							for (local186 = 0; local186 < this.anInt827; local186++) {
								if (local2349 == this.aLongArray4[local186]) {
									if (this.anIntArray237[local186] != local169) {
										this.anIntArray237[local186] = local169;
										this.aBoolean238 = true;
										if (local169 > 0) {
											this.method670(local2359 + " has logged in.", "", 5);
										}
										if (local169 == 0) {
											this.method670(local2359 + " has logged out.", "", 5);
										}
									}
									local2359 = null;
									break;
								}
							}
							if (local2359 != null && this.anInt827 < 200) {
								this.aLongArray4[this.anInt827] = local2349;
								this.aStringArray11[this.anInt827] = local2359;
								this.anIntArray237[this.anInt827] = local169;
								this.anInt827++;
								this.aBoolean238 = true;
							}
							@Pc(2457) boolean local2457 = false;
							while (!local2457) {
								local2457 = true;
								for (local568 = 0; local568 < this.anInt827 - 1; local568++) {
									if (this.anIntArray237[local568] != anInt876 && this.anIntArray237[local568 + 1] == anInt876 || this.anIntArray237[local568] == 0 && this.anIntArray237[local568 + 1] != 0) {
										local589 = this.anIntArray237[local568];
										this.anIntArray237[local568] = this.anIntArray237[local568 + 1];
										this.anIntArray237[local568 + 1] = local589;
										@Pc(2518) String local2518 = this.aStringArray11[local568];
										this.aStringArray11[local568] = this.aStringArray11[local568 + 1];
										this.aStringArray11[local568 + 1] = local2518;
										@Pc(2540) long local2540 = this.aLongArray4[local568];
										this.aLongArray4[local568] = this.aLongArray4[local568 + 1];
										this.aLongArray4[local568 + 1] = local2540;
										this.aBoolean238 = true;
										local2457 = false;
									}
								}
							}
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 104) {
							this.anInt996 = this.aClass6_Sub1_Sub4_7.method259();
							this.anInt995 = this.aClass6_Sub1_Sub4_7.method259();
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 221) {
							this.anInt965 = this.aClass6_Sub1_Sub4_7.method239();
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 229) {
							local162 = this.aClass6_Sub1_Sub4_7.method269((byte) 2);
							local242 = this.aClass6_Sub1_Sub4_7.method269((byte) 2);
							local169 = this.aClass6_Sub1_Sub4_7.method268();
							local171 = this.aClass6_Sub1_Sub4_7.method267();
							Class1.method4(local162).anInt18 = local242;
							Class1.method4(local162).anInt19 = local171;
							Class1.method4(local162).anInt17 = local169;
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 29) {
							local162 = this.aClass6_Sub1_Sub4_7.method268();
							this.method619(local162);
							if (this.anInt979 != -1) {
								this.method604(this.anInt979);
								this.anInt979 = -1;
								this.aBoolean252 = true;
							}
							if (this.anInt879 != -1) {
								this.method604(this.anInt879);
								this.anInt879 = -1;
								this.aBoolean244 = true;
							}
							if (this.anInt855 != -1) {
								this.method604(this.anInt855);
								this.anInt855 = -1;
							}
							if (this.anInt1051 != -1) {
								this.method604(this.anInt1051);
								this.anInt1051 = -1;
							}
							if (this.anInt868 != local162) {
								this.method604(this.anInt868);
								this.anInt868 = local162;
							}
							if (this.anInt1018 != 0) {
								this.anInt1018 = 0;
								this.aBoolean252 = true;
							}
							this.aBoolean238 = true;
							this.aBoolean219 = true;
							this.aBoolean245 = false;
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 179) {
							local162 = this.aClass6_Sub1_Sub4_7.method267();
							local242 = this.aClass6_Sub1_Sub4_7.method241();
							local1293 = Class1.method4(local242);
							if (local1293 != null && local1293.anInt33 == 0) {
								if (local162 < 0) {
									local162 = 0;
								}
								if (local162 > local1293.anInt21 - local1293.anInt27) {
									local162 = local1293.anInt21 - local1293.anInt27;
								}
								local1293.anInt32 = local162;
							}
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 150) {
							this.aBoolean216 = false;
							this.anInt1018 = 1;
							this.aString17 = "";
							this.aBoolean252 = true;
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 3) {
							local162 = this.aClass6_Sub1_Sub4_7.method269((byte) 2);
							this.method619(local162);
							if (this.anInt868 != -1) {
								this.method604(this.anInt868);
								this.anInt868 = -1;
								this.aBoolean238 = true;
								this.aBoolean219 = true;
							}
							if (this.anInt879 != -1) {
								this.method604(this.anInt879);
								this.anInt879 = -1;
								this.aBoolean244 = true;
							}
							if (this.anInt855 != -1) {
								this.method604(this.anInt855);
								this.anInt855 = -1;
							}
							if (this.anInt1051 != -1) {
								this.method604(this.anInt1051);
								this.anInt1051 = -1;
							}
							if (this.anInt979 != local162) {
								this.method604(this.anInt979);
								this.anInt979 = local162;
							}
							this.aBoolean245 = false;
							this.aBoolean252 = true;
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 211) {
							if (this.anInt1016 == 12) {
								this.aBoolean238 = true;
							}
							this.anInt1039 = this.aClass6_Sub1_Sub4_7.method239();
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 230) {
							this.anInt996 = this.aClass6_Sub1_Sub4_7.method259();
							this.anInt995 = this.aClass6_Sub1_Sub4_7.method260(this.anInt856);
							for (local162 = this.anInt995; local162 < this.anInt995 + 8; local162++) {
								for (local242 = this.anInt996; local242 < this.anInt996 + 8; local242++) {
									if (this.aClass40ArrayArrayArray1[this.anInt854][local162][local242] != null) {
										this.aClass40ArrayArrayArray1[this.anInt854][local162][local242] = null;
										this.method636(local162, local242);
									}
								}
							}
							for (@Pc(3005) Class6_Sub2 local3005 = (Class6_Sub2) this.aClass40_11.method472(); local3005 != null; local3005 = (Class6_Sub2) this.aClass40_11.method474()) {
								if (local3005.anInt208 >= this.anInt995 && local3005.anInt208 < this.anInt995 + 8 && local3005.anInt209 >= this.anInt996 && local3005.anInt209 < this.anInt996 + 8 && local3005.anInt206 == this.anInt854) {
									local3005.anInt199 = 0;
								}
							}
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 13) {
							local162 = this.aClass6_Sub1_Sub4_7.method267();
							local242 = this.aClass6_Sub1_Sub4_7.method268();
							Class1.method4(local162).anInt5 = 2;
							Class1.method4(local162).anInt6 = local242;
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 54) {
							this.aBoolean238 = true;
							local162 = this.aClass6_Sub1_Sub4_7.method241();
							local165 = Class1.method4(local162);
							while (this.aClass6_Sub1_Sub4_7.anInt390 < this.anInt1004) {
								local169 = this.aClass6_Sub1_Sub4_7.method253();
								local171 = this.aClass6_Sub1_Sub4_7.method241();
								local186 = this.aClass6_Sub1_Sub4_7.method239();
								if (local186 == 255) {
									local186 = this.aClass6_Sub1_Sub4_7.method244();
								}
								if (local169 >= 0 && local169 < local165.anIntArray9.length) {
									local165.anIntArray9[local169] = local171;
									local165.anIntArray1[local169] = local186;
								}
							}
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 10) {
							this.anInt828 = this.aClass6_Sub1_Sub4_7.method239();
							this.aBoolean238 = true;
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 237) {
							local162 = this.aClass6_Sub1_Sub4_7.method267();
							local242 = this.aClass6_Sub1_Sub4_7.method241();
							if (this.anInt979 != -1) {
								this.method604(this.anInt979);
								this.anInt979 = -1;
								this.aBoolean252 = true;
							}
							if (this.anInt879 != -1) {
								this.method604(this.anInt879);
								this.anInt879 = -1;
								this.aBoolean244 = true;
							}
							if (this.anInt855 != -1) {
								this.method604(this.anInt855);
								this.anInt855 = -1;
							}
							if (this.anInt1051 != local162) {
								this.method604(this.anInt1051);
								this.anInt1051 = local162;
							}
							if (this.anInt868 != local242) {
								this.method604(this.anInt868);
								this.anInt868 = local242;
							}
							if (this.anInt1018 != 0) {
								this.anInt1018 = 0;
								this.aBoolean252 = true;
							}
							this.aBoolean238 = true;
							this.aBoolean219 = true;
							this.aBoolean245 = false;
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 195) {
							local1877 = this.aClass6_Sub1_Sub4_7.method246();
							local242 = this.aClass6_Sub1_Sub4_7.method269((byte) 2);
							Class1.method4(local242).aString3 = local1877;
							@Pc(3286) int local3286 = this.anIntArray267[this.anInt1016];
							if (Class1.method4(local242).anInt2 == local3286) {
								this.aBoolean238 = true;
							}
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 76) {
							this.method705();
							this.anInt1005 = -1;
							return false;
						}
						if (this.anInt1005 == 0) {
							this.anInt1016 = this.aClass6_Sub1_Sub4_7.method258();
							this.aBoolean238 = true;
							this.aBoolean219 = true;
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 107) {
							this.anInt964 = this.aClass6_Sub1_Sub4_7.method239();
							this.anInt933 = this.aClass6_Sub1_Sub4_7.method239();
							this.anInt858 = this.aClass6_Sub1_Sub4_7.method239();
							this.aBoolean231 = true;
							this.aBoolean252 = true;
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 188) {
							local162 = this.aClass6_Sub1_Sub4_7.method258();
							local1888 = this.aClass6_Sub1_Sub4_7.method246();
							local169 = this.aClass6_Sub1_Sub4_7.method239();
							if (local162 >= 1 && local162 <= 5) {
								if (local1888.equalsIgnoreCase("null")) {
									local1888 = null;
								}
								this.aStringArray10[local162 - 1] = local1888;
								this.aBooleanArray11[local162 - 1] = local169 == 0;
							}
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 254) {
							if (this.anInt1016 == 12) {
								this.aBoolean238 = true;
							}
							this.anInt989 = this.aClass6_Sub1_Sub4_7.method242();
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 72) {
							local162 = this.aClass6_Sub1_Sub4_7.method268();
							local242 = this.aClass6_Sub1_Sub4_7.method269((byte) 2);
							local169 = local242 >> 10 & 0x1F;
							local171 = local242 >> 5 & 0x1F;
							local186 = local242 & 0x1F;
							Class1.method4(local162).anInt26 = (local169 << 19) + (local171 << 11) + (local186 << 3);
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 120) {
							local162 = this.aClass6_Sub1_Sub4_7.method268();
							local242 = this.aClass6_Sub1_Sub4_7.method258();
							if (local162 == 65535) {
								local162 = -1;
							}
							if (this.anIntArray267[local242] != local162) {
								this.method604(this.anIntArray267[local242]);
								this.anIntArray267[local242] = local162;
							}
							this.aBoolean238 = true;
							this.aBoolean219 = true;
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 168) {
							local162 = this.aClass6_Sub1_Sub4_7.method269((byte) 2);
							local242 = this.aClass6_Sub1_Sub4_7.method269((byte) 2);
							local169 = this.aClass6_Sub1_Sub4_7.method241();
							if (local242 == 65535) {
								Class1.method4(local162).anInt5 = 0;
								this.anInt1005 = -1;
								return true;
							}
							@Pc(3560) Class35 local3560 = Class35.method370(local242);
							Class1.method4(local162).anInt5 = 4;
							Class1.method4(local162).anInt6 = local242;
							Class1.method4(local162).anInt18 = local3560.anInt534;
							Class1.method4(local162).anInt19 = local3560.anInt535;
							Class1.method4(local162).anInt17 = local3560.anInt542 * 100 / local169;
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 41) {
							if (this.anInt868 != -1) {
								this.method604(this.anInt868);
								this.anInt868 = -1;
								this.aBoolean238 = true;
								this.aBoolean219 = true;
							}
							if (this.anInt979 != -1) {
								this.method604(this.anInt979);
								this.anInt979 = -1;
								this.aBoolean252 = true;
							}
							if (this.anInt879 != -1) {
								this.method604(this.anInt879);
								this.anInt879 = -1;
								this.aBoolean244 = true;
							}
							if (this.anInt855 != -1) {
								this.method604(this.anInt855);
								this.anInt855 = -1;
							}
							if (this.anInt1051 != -1) {
								this.method604(this.anInt1051);
								this.anInt1051 = -1;
							}
							if (this.anInt1018 != 0) {
								this.anInt1018 = 0;
								this.aBoolean252 = true;
							}
							this.aBoolean245 = false;
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 177) {
							this.aBoolean247 = true;
							this.anInt953 = this.aClass6_Sub1_Sub4_7.method239();
							this.anInt954 = this.aClass6_Sub1_Sub4_7.method239();
							this.anInt955 = this.aClass6_Sub1_Sub4_7.method241();
							this.anInt956 = this.aClass6_Sub1_Sub4_7.method239();
							this.anInt957 = this.aClass6_Sub1_Sub4_7.method239();
							if (this.anInt957 >= 100) {
								local162 = this.anInt953 * 128 + 64;
								local242 = this.anInt954 * 128 + 64;
								local169 = this.method635(this.anInt854, local242, local162) - this.anInt955;
								local171 = local162 - this.anInt1009;
								local186 = local169 - this.anInt1010;
								local294 = local242 - this.anInt1011;
								local568 = (int) Math.sqrt((double) (local171 * local171 + local294 * local294));
								this.anInt1012 = (int) (Math.atan2((double) local186, (double) local568) * 325.949D) & 0x7FF;
								this.anInt1013 = (int) (Math.atan2((double) local171, (double) local294) * -325.949D) & 0x7FF;
								if (this.anInt1012 < 128) {
									this.anInt1012 = 128;
								}
								if (this.anInt1012 > 383) {
									this.anInt1012 = 383;
								}
							}
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 34) {
							local162 = this.aClass6_Sub1_Sub4_7.method241();
							local242 = this.aClass6_Sub1_Sub4_7.method239();
							local169 = this.aClass6_Sub1_Sub4_7.method241();
							if (local169 == 65535) {
								if (this.anInt873 < 50) {
									this.anIntArray266[this.anInt873] = (short) local162;
									this.anIntArray220[this.anInt873] = local242;
									this.anIntArray222[this.anInt873] = 0;
									this.anInt873++;
								}
							} else if (this.aBoolean241 && !aBoolean225 && this.anInt873 < 50) {
								this.anIntArray266[this.anInt873] = local162;
								this.anIntArray220[this.anInt873] = local242;
								this.anIntArray222[this.anInt873] = local169 + Class25.anIntArray110[local162];
								this.anInt873++;
							}
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 147) {
							this.anInt996 = this.aClass6_Sub1_Sub4_7.method259();
							this.anInt995 = this.aClass6_Sub1_Sub4_7.method259();
							while (this.aClass6_Sub1_Sub4_7.anInt390 < this.anInt1004) {
								local162 = this.aClass6_Sub1_Sub4_7.method239();
								this.method590(this.aClass6_Sub1_Sub4_7, local162);
							}
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 190) {
							local162 = this.aClass6_Sub1_Sub4_7.method269((byte) 2);
							this.method619(local162);
							if (this.anInt868 != -1) {
								this.method604(this.anInt868);
								this.anInt868 = -1;
								this.aBoolean238 = true;
								this.aBoolean219 = true;
							}
							if (this.anInt979 != -1) {
								this.method604(this.anInt979);
								this.anInt979 = -1;
								this.aBoolean252 = true;
							}
							if (this.anInt879 != -1) {
								this.method604(this.anInt879);
								this.anInt879 = -1;
								this.aBoolean244 = true;
							}
							if (this.anInt855 != -1) {
								this.method604(this.anInt855);
								this.anInt855 = -1;
							}
							if (this.anInt1051 != local162) {
								this.method604(this.anInt1051);
								this.anInt1051 = local162;
							}
							if (this.anInt1018 != 0) {
								this.anInt1018 = 0;
								this.aBoolean252 = true;
							}
							this.aBoolean245 = false;
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 197) {
							local2349 = this.aClass6_Sub1_Sub4_7.method245();
							local169 = this.aClass6_Sub1_Sub4_7.method244();
							local171 = this.aClass6_Sub1_Sub4_7.method239();
							local1893 = false;
							for (local294 = 0; local294 < 100; local294++) {
								if (this.anIntArray234[local294] == local169) {
									local1893 = true;
									break;
								}
							}
							if (local171 <= 1) {
								for (local568 = 0; local568 < this.anInt843; local568++) {
									if (this.aLongArray3[local568] == local2349) {
										local1893 = true;
										break;
									}
								}
							}
							if (!local1893 && this.anInt1049 == 0) {
								try {
									this.anIntArray234[this.anInt900] = local169;
									this.anInt900 = (this.anInt900 + 1) % 100;
									local2028 = Class13.method112(this.anInt1004 - 13, this.aClass6_Sub1_Sub4_7);
									if (local171 != 3) {
										local2028 = Class34.method313(local2028);
									}
									if (local171 == 2 || local171 == 3) {
										this.method670(local2028, "@cr2@" + Class41.method485(Class41.method482(local2349, (byte) 7)), 7);
									} else if (local171 == 1) {
										this.method670(local2028, "@cr1@" + Class41.method485(Class41.method482(local2349, (byte) 7)), 7);
									} else {
										this.method670(local2028, Class41.method485(Class41.method482(local2349, (byte) 7)), 3);
									}
								} catch (@Pc(4200) Exception local4200) {
									signlink.reporterror("cde1");
								}
							}
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 18) {
							local162 = this.aClass6_Sub1_Sub4_7.method241();
							local165 = Class1.method4(local162);
							for (local169 = 0; local169 < local165.anIntArray9.length; local169++) {
								local165.anIntArray9[local169] = -1;
								local165.anIntArray9[local169] = 0;
							}
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 216) {
							for (local162 = 0; local162 < this.anIntArray239.length; local162++) {
								if (this.anIntArray239[local162] != this.anIntArray275[local162]) {
									this.anIntArray239[local162] = this.anIntArray275[local162];
									this.method714(local162);
									this.aBoolean238 = true;
								}
							}
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 5) {
							local162 = this.aClass6_Sub1_Sub4_7.method269((byte) 2);
							local242 = this.aClass6_Sub1_Sub4_7.method270();
							local169 = this.aClass6_Sub1_Sub4_7.method271();
							@Pc(4309) Class1 local4309 = Class1.method4(local162);
							local4309.anInt7 = local169;
							local4309.anInt31 = local242;
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 125) {
							this.aBoolean247 = true;
							this.anInt943 = this.aClass6_Sub1_Sub4_7.method239();
							this.anInt944 = this.aClass6_Sub1_Sub4_7.method239();
							this.anInt945 = this.aClass6_Sub1_Sub4_7.method241();
							this.anInt946 = this.aClass6_Sub1_Sub4_7.method239();
							this.anInt947 = this.aClass6_Sub1_Sub4_7.method239();
							if (this.anInt947 >= 100) {
								this.anInt1009 = this.anInt943 * 128 + 64;
								this.anInt1011 = this.anInt944 * 128 + 64;
								this.anInt1010 = this.method635(this.anInt854, this.anInt1011, this.anInt1009) - this.anInt945;
							}
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 146) {
							this.anInt926 = this.aClass6_Sub1_Sub4_7.method239();
							this.anInt848 = this.aClass6_Sub1_Sub4_7.method241();
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 194) {
							@Pc(4420) byte local4420 = this.aClass6_Sub1_Sub4_7.method263(this.anInt966);
							local242 = this.aClass6_Sub1_Sub4_7.method268();
							this.anIntArray275[local242] = local4420;
							if (this.anIntArray239[local242] != local4420) {
								this.anIntArray239[local242] = local4420;
								this.method714(local242);
								this.aBoolean238 = true;
								if (this.anInt976 != -1) {
									this.aBoolean252 = true;
								}
							}
							this.anInt1005 = -1;
							return true;
						}
						if (this.anInt1005 == 175) {
							this.aBoolean216 = false;
							this.anInt1018 = 2;
							this.aString17 = "";
							this.aBoolean252 = true;
							this.anInt1005 = -1;
							return true;
						}
						signlink.reporterror("T1 - " + this.anInt1005 + "," + this.anInt1004 + " - " + this.anInt950 + "," + this.anInt951);
						this.method705();
						return true;
					}
					local162 = this.aClass6_Sub1_Sub4_7.method267();
					local242 = this.aClass6_Sub1_Sub4_7.method241();
					Class1.method4(local242).anInt5 = 1;
					Class1.method4(local242).anInt6 = local162;
					this.anInt1005 = -1;
					return true;
				}
				local162 = this.anInt910;
				local242 = this.anInt911;
				if (this.anInt1005 == 52) {
					local162 = this.aClass6_Sub1_Sub4_7.method267();
					local242 = this.aClass6_Sub1_Sub4_7.method269((byte) 2);
					this.aBoolean251 = false;
				}
				if (this.anInt1005 == 6) {
					local242 = this.aClass6_Sub1_Sub4_7.method269((byte) 2);
					local162 = this.aClass6_Sub1_Sub4_7.method241();
					this.aClass6_Sub1_Sub4_7.method249();
					local169 = 0;
					while (true) {
						if (local169 >= 4) {
							this.aClass6_Sub1_Sub4_7.method251();
							this.aBoolean251 = true;
							break;
						}
						for (local171 = 0; local171 < 13; local171++) {
							for (local186 = 0; local186 < 13; local186++) {
								local294 = this.aClass6_Sub1_Sub4_7.method250(1);
								if (local294 == 1) {
									this.anIntArrayArrayArray8[local169][local171][local186] = this.aClass6_Sub1_Sub4_7.method250(26);
								} else {
									this.anIntArrayArrayArray8[local169][local171][local186] = -1;
								}
							}
						}
						local169++;
					}
				}
				if (this.anInt910 == local162 && this.anInt911 == local242 && this.anInt928 == 2) {
					this.anInt1005 = -1;
					return true;
				}
				this.anInt910 = local162;
				this.anInt911 = local242;
				this.anInt959 = (this.anInt910 - 6) * 8;
				this.anInt960 = (this.anInt911 - 6) * 8;
				this.aBoolean250 = false;
				if ((this.anInt910 / 8 == 48 || this.anInt910 / 8 == 49) && this.anInt911 / 8 == 48) {
					this.aBoolean250 = true;
				}
				if (this.anInt910 / 8 == 48 && this.anInt911 / 8 == 148) {
					this.aBoolean250 = true;
				}
				this.anInt928 = 1;
				this.aLong33 = System.currentTimeMillis();
				this.method706((String) null, "Loading - please wait.");
				if (this.anInt1005 == 52) {
					local169 = 0;
					local171 = (this.anInt910 - 6) / 8;
					label1242: while (true) {
						if (local171 > (this.anInt910 + 6) / 8) {
							this.aByteArrayArray6 = new byte[local169][];
							this.aByteArrayArray5 = new byte[local169][];
							this.anIntArray254 = new int[local169];
							this.anIntArray255 = new int[local169];
							this.anIntArray256 = new int[local169];
							local169 = 0;
							local186 = (this.anInt910 - 6) / 8;
							while (true) {
								if (local186 > (this.anInt910 + 6) / 8) {
									break label1242;
								}
								for (local294 = (this.anInt911 - 6) / 8; local294 <= (this.anInt911 + 6) / 8; local294++) {
									this.anIntArray254[local169] = (local186 << 8) + local294;
									if (this.aBoolean250 && (local294 == 49 || local294 == 149 || local294 == 147 || local186 == 50 || local186 == 49 && local294 == 47)) {
										this.anIntArray255[local169] = -1;
										this.anIntArray256[local169] = -1;
										local169++;
									} else {
										local568 = this.anIntArray255[local169] = this.aClass30_Sub1_1.method284(0, local186, local294, (byte) 2);
										if (local568 != -1) {
											this.aClass30_Sub1_1.method282(3, local568);
										}
										local589 = this.anIntArray256[local169] = this.aClass30_Sub1_1.method284(1, local186, local294, (byte) 2);
										if (local589 != -1) {
											this.aClass30_Sub1_1.method282(3, local589);
										}
										local169++;
									}
								}
								local186++;
							}
						}
						for (local186 = (this.anInt911 - 6) / 8; local186 <= (this.anInt911 + 6) / 8; local186++) {
							local169++;
						}
						local171++;
					}
				}
				if (this.anInt1005 == 6) {
					local169 = 0;
					@Pc(625) int[] local625 = new int[676];
					local186 = 0;
					label1203: while (true) {
						@Pc(655) int local655;
						@Pc(661) int local661;
						@Pc(671) int local671;
						if (local186 >= 4) {
							this.aByteArrayArray6 = new byte[local169][];
							this.aByteArrayArray5 = new byte[local169][];
							this.anIntArray254 = new int[local169];
							this.anIntArray255 = new int[local169];
							this.anIntArray256 = new int[local169];
							local294 = 0;
							while (true) {
								if (local294 >= local169) {
									break label1203;
								}
								local568 = this.anIntArray254[local294] = local625[local294];
								local589 = local568 >> 8 & 0xFF;
								local655 = local568 & 0xFF;
								local661 = this.anIntArray255[local294] = this.aClass30_Sub1_1.method284(0, local589, local655, (byte) 2);
								if (local661 != -1) {
									this.aClass30_Sub1_1.method282(3, local661);
								}
								local671 = this.anIntArray256[local294] = this.aClass30_Sub1_1.method284(1, local589, local655, (byte) 2);
								if (local671 != -1) {
									this.aClass30_Sub1_1.method282(3, local671);
								}
								local294++;
							}
						}
						for (local294 = 0; local294 < 13; local294++) {
							for (local568 = 0; local568 < 13; local568++) {
								local589 = this.anIntArrayArrayArray8[local186][local294][local568];
								if (local589 != -1) {
									local655 = local589 >> 14 & 0x3FF;
									local661 = local589 >> 3 & 0x7FF;
									local671 = (local655 / 8 << 8) + local661 / 8;
									for (@Pc(673) int local673 = 0; local673 < local169; local673++) {
										if (local625[local673] == local671) {
											local671 = -1;
											break;
										}
									}
									if (local671 != -1) {
										local625[local169++] = local671;
									}
								}
							}
						}
						local186++;
					}
				}
				local169 = this.anInt959 - this.anInt961;
				local171 = this.anInt960 - this.anInt962;
				this.anInt961 = this.anInt959;
				this.anInt962 = this.anInt960;
				for (local186 = 0; local186 < 16384; local186++) {
					@Pc(826) Class6_Sub1_Sub2_Sub4_Sub1 local826 = this.aClass6_Sub1_Sub2_Sub4_Sub1Array1[local186];
					if (local826 != null) {
						for (local568 = 0; local568 < 10; local568++) {
							local826.anIntArray169[local568] -= local169;
							local826.anIntArray170[local568] -= local171;
						}
						local826.anInt583 -= local169 * 128;
						local826.anInt584 -= local171 * 128;
					}
				}
				for (local294 = 0; local294 < this.anInt985; local294++) {
					@Pc(881) Class6_Sub1_Sub2_Sub4_Sub2 local881 = this.aClass6_Sub1_Sub2_Sub4_Sub2Array1[local294];
					if (local881 != null) {
						for (local589 = 0; local589 < 10; local589++) {
							local881.anIntArray169[local589] -= local169;
							local881.anIntArray170[local589] -= local171;
						}
						local881.anInt583 -= local169 * 128;
						local881.anInt584 -= local171 * 128;
					}
				}
				this.aBoolean249 = true;
				@Pc(933) byte local933 = 0;
				@Pc(935) byte local935 = 104;
				@Pc(937) byte local937 = 1;
				if (local169 < 0) {
					local933 = 103;
					local935 = -1;
					local937 = -1;
				}
				@Pc(947) byte local947 = 0;
				@Pc(949) byte local949 = 104;
				@Pc(951) byte local951 = 1;
				if (local171 < 0) {
					local947 = 103;
					local949 = -1;
					local951 = -1;
				}
				for (@Pc(961) int local961 = local933; local961 != local935; local961 += local937) {
					for (@Pc(965) int local965 = local947; local965 != local949; local965 += local951) {
						@Pc(971) int local971 = local961 + local169;
						@Pc(975) int local975 = local965 + local171;
						for (@Pc(977) int local977 = 0; local977 < 4; local977++) {
							if (local971 >= 0 && local975 >= 0 && local971 < 104 && local975 < 104) {
								this.aClass40ArrayArrayArray1[local977][local961][local965] = this.aClass40ArrayArrayArray1[local977][local971][local975];
							} else {
								this.aClass40ArrayArrayArray1[local977][local961][local965] = null;
							}
						}
					}
				}
				for (@Pc(1039) Class6_Sub2 local1039 = (Class6_Sub2) this.aClass40_11.method472(); local1039 != null; local1039 = (Class6_Sub2) this.aClass40_11.method474()) {
					local1039.anInt208 -= local169;
					local1039.anInt209 -= local171;
					if (local1039.anInt208 < 0 || local1039.anInt209 < 0 || local1039.anInt208 >= 104 || local1039.anInt209 >= 104) {
						local1039.method542();
					}
				}
				if (this.anInt1026 != 0) {
					this.anInt1026 -= local169;
					this.anInt1027 -= local171;
				}
				this.aBoolean247 = false;
				this.anInt1005 = -1;
				return true;
			} catch (@Pc(4510) IOException local4510) {
				this.method629();
			} catch (@Pc(4515) Exception local4515) {
				local1877 = "T2 - " + this.anInt1005 + "," + this.anInt950 + "," + this.anInt951 + " - " + this.anInt1004 + "," + (this.anInt959 + aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray169[0]) + "," + (this.anInt960 + aClass6_Sub1_Sub2_Sub4_Sub2_1.anIntArray170[0]) + " - ";
				for (local242 = 0; local242 < this.anInt1004 && local242 < 50; local242++) {
					local1877 = local1877 + this.aClass6_Sub1_Sub4_7.aByteArray12[local242] + ",";
				}
				signlink.reporterror(local1877);
				this.method705();
			}
			return true;
		} catch (@Pc(4596) RuntimeException local4596) {
			signlink.reporterror("41169, " + 111 + ", " + local4596.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
	private void method720() {
		try {
			this.aClass6_Sub1_Sub3_Sub2_1 = new Class6_Sub1_Sub3_Sub2(this.aClass43_2, "titlebox", 0);
			this.aClass6_Sub1_Sub3_Sub2_2 = new Class6_Sub1_Sub3_Sub2(this.aClass43_2, "titlebutton", 0);
			this.aClass6_Sub1_Sub3_Sub2Array5 = new Class6_Sub1_Sub3_Sub2[12];
			for (@Pc(30) int local30 = 0; local30 < 12; local30++) {
				this.aClass6_Sub1_Sub3_Sub2Array5[local30] = new Class6_Sub1_Sub3_Sub2(this.aClass43_2, "runes", local30);
			}
			this.aClass6_Sub1_Sub3_Sub3_15 = new Class6_Sub1_Sub3_Sub3(128, 265);
			this.aClass6_Sub1_Sub3_Sub3_16 = new Class6_Sub1_Sub3_Sub3(128, 265);
			for (@Pc(63) int local63 = 0; local63 < 33920; local63++) {
				this.aClass6_Sub1_Sub3_Sub3_15.anIntArray193[local63] = this.aClass8_15.anIntArray24[local63];
			}
			for (@Pc(81) int local81 = 0; local81 < 33920; local81++) {
				this.aClass6_Sub1_Sub3_Sub3_16.anIntArray193[local81] = this.aClass8_16.anIntArray24[local81];
			}
			this.anIntArray229 = new int[256];
			for (@Pc(103) int local103 = 0; local103 < 64; local103++) {
				this.anIntArray229[local103] = local103 * 262144;
			}
			for (@Pc(118) int local118 = 0; local118 < 64; local118++) {
				this.anIntArray229[local118 + 64] = 16711680 + 1024 * local118;
			}
			for (@Pc(137) int local137 = 0; local137 < 64; local137++) {
				this.anIntArray229[local137 + 128] = 16776960 + 4 * local137;
			}
			for (@Pc(156) int local156 = 0; local156 < 64; local156++) {
				this.anIntArray229[local156 + 192] = 16777215;
			}
			this.anIntArray230 = new int[256];
			for (@Pc(175) int local175 = 0; local175 < 64; local175++) {
				this.anIntArray230[local175] = local175 * 1024;
			}
			for (@Pc(190) int local190 = 0; local190 < 64; local190++) {
				this.anIntArray230[local190 + 64] = 65280 + 4 * local190;
			}
			for (@Pc(209) int local209 = 0; local209 < 64; local209++) {
				this.anIntArray230[local209 + 128] = 65535 + 262144 * local209;
			}
			for (@Pc(228) int local228 = 0; local228 < 64; local228++) {
				this.anIntArray230[local228 + 192] = 16777215;
			}
			this.anIntArray231 = new int[256];
			for (@Pc(247) int local247 = 0; local247 < 64; local247++) {
				this.anIntArray231[local247] = local247 * 4;
			}
			for (@Pc(262) int local262 = 0; local262 < 64; local262++) {
				this.anIntArray231[local262 + 64] = 255 + 262144 * local262;
			}
			for (@Pc(281) int local281 = 0; local281 < 64; local281++) {
				this.anIntArray231[local281 + 128] = 16711935 + 1024 * local281;
			}
			for (@Pc(300) int local300 = 0; local300 < 64; local300++) {
				this.anIntArray231[local300 + 192] = 16777215;
			}
			this.anIntArray228 = new int[256];
			this.anIntArray240 = new int[32768];
			this.anIntArray241 = new int[32768];
			this.method601((Class6_Sub1_Sub3_Sub2) null);
			this.anIntArray268 = new int[32768];
			this.anIntArray269 = new int[32768];
			this.method586("Connecting to fileserver", 10);
			if (!this.aBoolean240) {
				this.aBoolean233 = true;
				this.aBoolean240 = true;
				this.method585(this, 2);
			}
		} catch (@Pc(357) RuntimeException local357) {
			signlink.reporterror("8705, " + 16460 + ", " + local357.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
	private void method722() {
		try {
			if (this.anInt1023 == 0) {
				this.aStringArray9[0] = "Cancel";
				this.anIntArray218[0] = 1718;
				this.anInt890 = 1;
				if (this.anInt879 == -1) {
					this.method665();
					this.anInt931 = 0;
					this.anInt1003 = 0;
					if (super.anInt814 > 4 && super.anInt815 > 4 && super.anInt814 < 516 && super.anInt815 < 338) {
						if (this.anInt1051 == -1) {
							this.method631();
						} else {
							this.method676(super.anInt815, Class1.method4(this.anInt1051), 0, 4, 4, 0, super.anInt814);
						}
					}
					if (this.anInt931 != this.anInt918) {
						this.anInt918 = this.anInt931;
					}
					if (this.anInt1003 != this.anInt939) {
						this.anInt939 = this.anInt1003;
					}
					this.anInt931 = 0;
					this.anInt1003 = 0;
					if (super.anInt814 > 553 && super.anInt815 > 205 && super.anInt814 < 743 && super.anInt815 < 466) {
						if (this.anInt868 != -1) {
							this.method676(super.anInt815, Class1.method4(this.anInt868), 0, 205, 553, 1, super.anInt814);
						} else if (this.anIntArray267[this.anInt1016] != -1) {
							this.method676(super.anInt815, Class1.method4(this.anIntArray267[this.anInt1016]), 0, 205, 553, 1, super.anInt814);
						}
					}
					if (this.anInt931 != this.anInt841) {
						this.aBoolean238 = true;
						this.anInt841 = this.anInt931;
					}
					if (this.anInt1003 != this.anInt844) {
						this.aBoolean238 = true;
						this.anInt844 = this.anInt1003;
					}
					this.anInt931 = 0;
					this.anInt1003 = 0;
					if (super.anInt814 > 17 && super.anInt815 > 357 && super.anInt814 < 496 && super.anInt815 < 453) {
						if (this.anInt979 != -1) {
							this.method676(super.anInt815, Class1.method4(this.anInt979), 0, 357, 17, 2, super.anInt814);
						} else if (this.anInt976 != -1) {
							this.method676(super.anInt815, Class1.method4(this.anInt976), 0, 357, 17, 3, super.anInt814);
						} else if (super.anInt815 < 434 && super.anInt814 < 426 && this.anInt1018 == 0) {
							this.method656(super.anInt814 - 17, super.anInt815 - 357);
						}
					}
					if ((this.anInt979 != -1 || this.anInt976 != -1) && this.anInt931 != this.anInt972) {
						this.aBoolean252 = true;
						this.anInt972 = this.anInt931;
					}
					if ((this.anInt979 != -1 || this.anInt976 != -1) && this.anInt1003 != this.anInt892) {
						this.aBoolean252 = true;
						this.anInt892 = this.anInt1003;
					}
					@Pc(347) boolean local347 = false;
					while (!local347) {
						local347 = true;
						for (@Pc(353) int local353 = 0; local353 < this.anInt890 - 1; local353++) {
							if (this.anIntArray218[local353] < 1000 && this.anIntArray218[local353 + 1] > 1000) {
								@Pc(374) String local374 = this.aStringArray9[local353];
								this.aStringArray9[local353] = this.aStringArray9[local353 + 1];
								this.aStringArray9[local353 + 1] = local374;
								@Pc(396) int local396 = this.anIntArray218[local353];
								this.anIntArray218[local353] = this.anIntArray218[local353 + 1];
								this.anIntArray218[local353 + 1] = local396;
								@Pc(418) int local418 = this.anIntArray216[local353];
								this.anIntArray216[local353] = this.anIntArray216[local353 + 1];
								this.anIntArray216[local353 + 1] = local418;
								@Pc(440) int local440 = this.anIntArray217[local353];
								this.anIntArray217[local353] = this.anIntArray217[local353 + 1];
								this.anIntArray217[local353 + 1] = local440;
								@Pc(462) int local462 = this.anIntArray219[local353];
								this.anIntArray219[local353] = this.anIntArray219[local353 + 1];
								this.anIntArray219[local353 + 1] = local462;
								local347 = false;
							}
						}
					}
				} else {
					this.anInt931 = 0;
					this.anInt1003 = 0;
					this.method676(super.anInt815, Class1.method4(this.anInt879), 0, 0, 0, 0, super.anInt814);
					if (this.anInt931 != this.anInt918) {
						this.anInt918 = this.anInt931;
					}
					if (this.anInt1003 != this.anInt939) {
						this.anInt939 = this.anInt1003;
					}
				}
			}
		} catch (@Pc(492) RuntimeException local492) {
			signlink.reporterror("85239, " + -31550 + ", " + local492.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "N", descriptor = "(I)V")
	private void method723() {
		try {
			this.method724(this.anInt832);
			if (this.anInt896 == 1) {
				this.aClass6_Sub1_Sub3_Sub3Array4[this.anInt895 / 100].method506(this.anInt894 - 8 - 4, this.anInt893 - 8 - 4, this.anInt1040);
			}
			if (this.anInt896 == 2) {
				this.aClass6_Sub1_Sub3_Sub3Array4[4 + this.anInt895 / 100].method506(this.anInt894 - 8 - 4, this.anInt893 - 8 - 4, this.anInt1040);
				anInt860++;
				if (anInt860 > 140) {
					anInt860 = 0;
					this.aClass6_Sub1_Sub4_6.method228(122);
					this.aClass6_Sub1_Sub4_6.method233(0);
				}
			}
			if (this.anInt830 != -1) {
				this.method668(this.anInt880, this.anInt830);
				this.method617(0, Class1.method4(this.anInt830), this.anInt857, 0, 0);
			}
			if (this.anInt1051 != -1) {
				this.method668(this.anInt880, this.anInt1051);
				this.method617(0, Class1.method4(this.anInt1051), this.anInt857, 0, 0);
			}
			this.method597();
			if (!this.aBoolean217) {
				this.method722();
				this.method677();
			} else if (this.anInt919 == 0) {
				this.method674();
			}
			if (this.anInt1047 == 1) {
				this.aClass6_Sub1_Sub3_Sub3_13.method506(296, 472, this.anInt1040);
			}
			@Pc(195) int local195;
			if (aBoolean229) {
				@Pc(161) byte local161 = 20;
				@Pc(163) int local163 = 16776960;
				if (super.anInt809 < 30 && aBoolean225) {
					local163 = 16711680;
				}
				if (super.anInt809 < 20 && !aBoolean225) {
					local163 = 16711680;
				}
				this.aClass6_Sub1_Sub3_Sub4_3.method556(local163, "Fps:" + super.anInt809, 20);
				local195 = local161 + 15;
				@Pc(197) Runtime local197 = Runtime.getRuntime();
				@Pc(206) int local206 = (int) ((local197.totalMemory() - local197.freeMemory()) / 1024L);
				if (local206 > 33554432 && aBoolean225) {
				}
				if (local206 > 67108864 && !aBoolean225) {
				}
				this.aClass6_Sub1_Sub3_Sub4_3.method556(16776960, "Mem:" + local206 + "k", 35);
				local195 += 15;
			}
			if (this.anInt1019 != 0) {
				@Pc(247) int local247 = this.anInt1019 / 50;
				local195 = local247 / 60;
				@Pc(255) int local255 = local247 % 60;
				if (local255 < 10) {
					this.aClass6_Sub1_Sub3_Sub4_3.method561("System update in: " + local195 + ":0" + local255, 329, 16776960, 4);
				} else {
					this.aClass6_Sub1_Sub3_Sub4_3.method561("System update in: " + local195 + ":" + local255, 329, 16776960, 4);
				}
			}
		} catch (@Pc(297) RuntimeException local297) {
			signlink.reporterror("4610, " + 836 + ", " + local297.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "O", descriptor = "(I)V")
	private void method724(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt907 != 0) {
				@Pc(6) Class6_Sub1_Sub3_Sub4 local6 = this.aClass6_Sub1_Sub3_Sub4_3;
				@Pc(8) int local8 = 0;
				if (this.anInt1019 != 0) {
					local8 = 1;
				}
				for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
					if (this.aStringArray13[local15] != null) {
						@Pc(27) int local27 = this.anIntArray243[local15];
						@Pc(32) String local32 = this.aStringArray12[local15];
						@Pc(34) byte local34 = 0;
						if (local32 != null && local32.startsWith("@cr1@")) {
							local32 = local32.substring(5);
							local34 = 1;
						}
						if (local32 != null && local32.startsWith("@cr2@")) {
							local32 = local32.substring(5);
							local34 = 2;
						}
						@Pc(85) int local85;
						if ((local27 == 3 || local27 == 7) && (local27 == 7 || this.anInt933 == 0 || this.anInt933 == 1 && this.method702(local32))) {
							local85 = 329 - local8 * 13;
							local6.method561("From", local85, 0, 4);
							local6.method561("From", local85 - 1, 65535, 4);
							@Pc(110) int local110 = 4 + local6.method559("From ");
							if (local34 == 1) {
								this.aClass6_Sub1_Sub3_Sub2Array3[0].method467(local85 - 12, local110, this.anInt1040);
								local110 += 14;
							}
							if (local34 == 2) {
								this.aClass6_Sub1_Sub3_Sub2Array3[1].method467(local85 - 12, local110, this.anInt1040);
								local110 += 14;
							}
							local6.method561(local32 + ": " + this.aStringArray13[local15], local85, 0, local110);
							local6.method561(local32 + ": " + this.aStringArray13[local15], local85 - 1, 65535, local110);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local27 == 5 && this.anInt933 < 2) {
							local85 = 329 - local8 * 13;
							local6.method561(this.aStringArray13[local15], local85, 0, 4);
							local6.method561(this.aStringArray13[local15], local85 - 1, 65535, 4);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local27 == 6 && this.anInt933 < 2) {
							local85 = 329 - local8 * 13;
							local6.method561("To " + local32 + ": " + this.aStringArray13[local15], local85, 0, 4);
							local6.method561("To " + local32 + ": " + this.aStringArray13[local15], local85 - 1, 65535, 4);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
					}
				}
				while (arg0 >= 0) {
					this.aClass40ArrayArrayArray1 = null;
				}
			}
		} catch (@Pc(297) RuntimeException local297) {
			signlink.reporterror("6412, " + arg0 + ", " + local297.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method725(@OriginalArg(1) int arg0) {
		try {
			@Pc(14) int[] local14 = this.aClass6_Sub1_Sub3_Sub3_17.anIntArray193;
			@Pc(17) int local17 = local14.length;
			for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
				local14[local19] = 0;
			}
			@Pc(43) int local43;
			@Pc(45) int local45;
			for (@Pc(31) int local31 = 1; local31 < 103; local31++) {
				local43 = 24628 + (103 - local31) * 512 * 4;
				for (local45 = 1; local45 < 103; local45++) {
					if ((this.aByteArrayArrayArray8[arg0][local45][local31] & 0x18) == 0) {
						this.aClass38_1.method432(local14, local43, arg0, local45, local31);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local45][local31] & 0x8) != 0) {
						this.aClass38_1.method432(local14, local43, arg0 + 1, local45, local31);
					}
					local43 += 4;
				}
			}
			local43 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
			local45 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
			this.aClass6_Sub1_Sub3_Sub3_17.method501();
			@Pc(155) int local155;
			for (@Pc(151) int local151 = 1; local151 < 103; local151++) {
				for (local155 = 1; local155 < 103; local155++) {
					if ((this.aByteArrayArrayArray8[arg0][local155][local151] & 0x18) == 0) {
						this.method666(this.anInt842, local155, local45, local43, local151, arg0);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local155][local151] & 0x8) != 0) {
						this.method666(this.anInt842, local155, local45, local43, local151, arg0 + 1);
					}
				}
			}
			if (this.aClass8_23 != null) {
				this.aClass8_23.method43();
				Class6_Sub1_Sub3_Sub1.anIntArray124 = this.anIntArray246;
			}
			this.anInt881 = 0;
			for (local155 = 0; local155 < 104; local155++) {
				for (@Pc(231) int local231 = 0; local231 < 104; local231++) {
					@Pc(241) int local241 = this.aClass38_1.method426(this.anInt854, local155, local231);
					if (local241 != 0) {
						local241 = local241 >> 14 & 0x7FFF;
						@Pc(253) int local253 = Class11.method60(local241).anInt109;
						if (local253 >= 0) {
							@Pc(257) int local257 = local155;
							@Pc(259) int local259 = local231;
							if (local253 != 22 && local253 != 29 && local253 != 34 && local253 != 36 && local253 != 46 && local253 != 47 && local253 != 48) {
								@Pc(291) int[][] local291 = this.aClass12Array1[this.anInt854].anIntArrayArray3;
								for (@Pc(293) int local293 = 0; local293 < 10; local293++) {
									@Pc(300) int local300 = (int) (Math.random() * 4.0D);
									if (local300 == 0 && local257 > 0 && local257 > local155 - 3 && (local291[local257 - 1][local259] & 0x1280108) == 0) {
										local257--;
									}
									if (local300 == 1 && local257 < 103 && local257 < local155 + 3 && (local291[local257 + 1][local259] & 0x1280180) == 0) {
										local257++;
									}
									if (local300 == 2 && local259 > 0 && local259 > local231 - 3 && (local291[local257][local259 - 1] & 0x1280102) == 0) {
										local259--;
									}
									if (local300 == 3 && local259 < 103 && local259 < local231 + 3 && (local291[local257][local259 + 1] & 0x1280120) == 0) {
										local259++;
									}
								}
							}
							this.aClass6_Sub1_Sub3_Sub3Array9[this.anInt881] = this.aClass6_Sub1_Sub3_Sub3Array8[local253];
							this.anIntArray224[this.anInt881] = local257;
							this.anIntArray225[this.anInt881] = local259;
							this.anInt881++;
						}
					}
				}
			}
		} catch (@Pc(430) RuntimeException local430) {
			signlink.reporterror("6472, " + -493 + ", " + arg0 + ", " + local430.toString());
			throw new RuntimeException();
		}
	}
}
