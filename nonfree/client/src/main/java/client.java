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

	@OriginalMember(owner = "client!client", name = "T", descriptor = "I")
	private static int anInt841;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "I")
	private static int anInt843;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "I")
	private static int anInt844;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Z")
	private static boolean aBoolean245;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
	private static int anInt847;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "Lclient!SJUCHLXH;")
	public static Class3_Sub1_Sub2_Sub1_Sub2 aClass3_Sub1_Sub2_Sub1_Sub2_1;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
	private static int anInt852;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
	private static int anInt854;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
	private static int anInt883;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
	private static int anInt890;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
	private static int anInt905;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
	public static int anInt913;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "Z")
	private static boolean aBoolean258;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
	private static int anInt916;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
	private static int anInt918;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
	private static int anInt937;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
	private static int anInt962;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
	private static int anInt964;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
	private static int anInt973;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
	private static int anInt975;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
	private static int anInt985;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "I")
	private static int anInt1007;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "Z")
	private static boolean aBoolean275;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "Z")
	private static boolean aBoolean282;

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "I")
	private static int anInt1053;

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "I")
	public static int anInt1054;

	@OriginalMember(owner = "client!client", name = "Tj", descriptor = "Z")
	private static boolean aBoolean288;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "[[I")
	public static final int[][] anIntArrayArray22 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "I")
	private static int anInt880 = 38686;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "[I")
	public static int[] anIntArray233 = new int[32];

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
	private static int anInt912;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "Z")
	private static boolean aBoolean257;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "Z")
	private static boolean aBoolean265;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "Ljava/lang/String;")
	private static String aString27;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "[I")
	public static final int[] anIntArray252;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "[I")
	private static int[] anIntArray254;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "J", descriptor = "I")
	private int anInt834;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "I")
	private int anInt835;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "I")
	private int anInt836;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "I")
	private int anInt837;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
	private int anInt838;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "I")
	private int anInt839;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "I")
	private int anInt840;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "I")
	private int anInt842;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!SKZHQGHX;")
	private Class36 aClass36_3;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Lclient!SKZHQGHX;")
	private Class36 aClass36_4;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Lclient!SKZHQGHX;")
	private Class36 aClass36_5;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "[[B")
	private byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	private int anInt849;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private int anInt856;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "Lclient!YHASUFYG;")
	private Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_3;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "Lclient!YHASUFYG;")
	private Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_4;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "Lclient!YHASUFYG;")
	private Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_5;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "Lclient!YHASUFYG;")
	private Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_6;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "Lclient!YHASUFYG;")
	private Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_7;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
	private int anInt857;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private int anInt859;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
	private int anInt860;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
	private int anInt861;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private int anInt862;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "I")
	private int anInt863;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
	private int anInt864;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
	private int anInt865;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
	private int anInt866;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "Ljava/lang/String;")
	private String aString21;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
	private int anInt868;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "I")
	private int anInt870;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "I")
	private int anInt871;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
	private int anInt873;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
	private int anInt874;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
	private int anInt875;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "I")
	private int anInt876;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
	private int anInt877;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "I")
	private int anInt878;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "Ljava/lang/String;")
	private String aString22;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
	private int anInt882;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "[I")
	private int[] anIntArray229;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "[I")
	private int[] anIntArray230;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "[Lclient!AGTHLVTI;")
	private Class3_Sub1_Sub1_Sub1[] aClass3_Sub1_Sub1_Sub1Array3;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
	private int anInt889;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "I")
	private int anInt891;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
	private int anInt892;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
	private int anInt893;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "I")
	private int anInt894;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
	private int anInt895;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "I")
	private int anInt896;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
	private int anInt897;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "I")
	private int anInt899;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "I")
	private int anInt902;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
	private int anInt903;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "Lclient!AGTHLVTI;")
	private Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "Lclient!AGTHLVTI;")
	private Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_2;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "I")
	private int anInt906;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "Lclient!BYZSQZUF;")
	private Class5 aClass5_1;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
	private int anInt907;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
	private int anInt908;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
	private int anInt909;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
	private int anInt911;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "Lclient!SKZHQGHX;")
	private Class36 aClass36_6;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "Lclient!SKZHQGHX;")
	private Class36 aClass36_7;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "Lclient!SKZHQGHX;")
	private Class36 aClass36_8;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "Lclient!SKZHQGHX;")
	private Class36 aClass36_9;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "Lclient!SKZHQGHX;")
	private Class36 aClass36_10;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "Lclient!SKZHQGHX;")
	private Class36 aClass36_11;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "Lclient!SKZHQGHX;")
	private Class36 aClass36_12;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "Lclient!SKZHQGHX;")
	private Class36 aClass36_13;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "Lclient!SKZHQGHX;")
	private Class36 aClass36_14;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
	private int anInt914;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "I")
	private int anInt917;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "Lclient!AGTHLVTI;")
	private Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_3;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "Lclient!AGTHLVTI;")
	private Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_4;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "I")
	private int anInt919;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "I")
	private int anInt920;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
	private int anInt921;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "I")
	private int anInt922;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private int anInt925;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "I")
	private int anInt928;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
	private int anInt929;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
	private int anInt930;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "Lclient!YHASUFYG;")
	private Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_8;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
	private int anInt932;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
	private int anInt934;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
	private int anInt935;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
	private int anInt936;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
	private int anInt938;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
	private int anInt940;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
	private int anInt941;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
	private int anInt942;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
	private int anInt945;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
	private int anInt948;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "Lclient!DIVYVFFL;")
	private Class3_Sub1_Sub1_Sub2 aClass3_Sub1_Sub1_Sub2_2;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "Lclient!DIVYVFFL;")
	private Class3_Sub1_Sub1_Sub2 aClass3_Sub1_Sub1_Sub2_3;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "Lclient!DIVYVFFL;")
	private Class3_Sub1_Sub1_Sub2 aClass3_Sub1_Sub1_Sub2_4;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "Lclient!DIVYVFFL;")
	private Class3_Sub1_Sub1_Sub2 aClass3_Sub1_Sub1_Sub2_5;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
	private int anInt956;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "Lclient!HUWYSFFT;")
	private Class16 aClass16_1;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "I")
	private int anInt960;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "Lclient!XAXJBOWU;")
	private Class45 aClass45_1;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
	private int anInt963;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "Lclient!YHASUFYG;")
	private Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_9;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "Lclient!YHASUFYG;")
	private Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_10;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "I")
	private int anInt966;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
	private int anInt967;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private int anInt968;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "I")
	private int anInt971;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "[I")
	private int[] anIntArray246;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "[I")
	private int[] anIntArray247;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "[I")
	private int[] anIntArray248;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "[I")
	private int[] anIntArray249;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "Lclient!AGTHLVTI;")
	private Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_5;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "Lclient!AGTHLVTI;")
	private Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_6;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "Lclient!AGTHLVTI;")
	private Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_7;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "Lclient!TDBJVJCU;")
	private Class19_Sub1 aClass19_Sub1_1;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "Lclient!AGTHLVTI;")
	private Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_8;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "Lclient!AGTHLVTI;")
	private Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_9;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "Lclient!AGTHLVTI;")
	private Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_10;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "Lclient!AGTHLVTI;")
	private Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_11;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "Lclient!AGTHLVTI;")
	private Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_12;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "I")
	private int anInt978;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
	private int anInt979;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "I")
	private int anInt980;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "I")
	private int anInt981;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
	private int anInt982;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
	private int anInt983;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
	private int anInt986;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
	private int anInt987;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "Lclient!AGTHLVTI;")
	private Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_13;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "Lclient!AGTHLVTI;")
	private Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_14;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "Lclient!AGTHLVTI;")
	private Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_15;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
	private int anInt989;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
	private int anInt990;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
	private int anInt991;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "I")
	private int anInt992;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "I")
	private int anInt993;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
	private int anInt994;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "I")
	private int anInt995;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "I")
	private int anInt997;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "Lclient!YHASUFYG;")
	private Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_11;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "I")
	private int anInt998;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "I")
	private int anInt999;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
	private int anInt1000;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "I")
	private int anInt1001;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "I")
	private int anInt1002;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "Ljava/lang/String;")
	private String aString29;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "I")
	private int anInt1004;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "I")
	private int anInt1006;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
	private int anInt1010;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
	private int anInt1011;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
	private int anInt1012;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
	private int anInt1013;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "I")
	private int anInt1014;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "I")
	private int anInt1018;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "I")
	private int anInt1019;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
	private int anInt1020;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "Lclient!AGTHLVTI;")
	private Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_16;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "Lclient!AGTHLVTI;")
	private Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_17;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "Lclient!AGTHLVTI;")
	private Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_18;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "Lclient!AGTHLVTI;")
	private Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_19;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "Lclient!AGTHLVTI;")
	private Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_20;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "Lclient!YHASUFYG;")
	private Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_12;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "Lclient!YHASUFYG;")
	private Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_13;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "I")
	private int anInt1021;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "Lclient!LIOYHOWO;")
	private Class25 aClass25_1;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "I")
	private int anInt1022;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
	private int anInt1023;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "[I")
	private int[] anIntArray260;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "[I")
	private int[] anIntArray261;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "[I")
	private int[] anIntArray262;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "[I")
	private int[] anIntArray263;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "[I")
	private int[] anIntArray264;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "Lclient!SKZHQGHX;")
	private Class36 aClass36_15;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "Lclient!SKZHQGHX;")
	private Class36 aClass36_16;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "Lclient!SKZHQGHX;")
	private Class36 aClass36_17;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "Lclient!SKZHQGHX;")
	private Class36 aClass36_18;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "Lclient!SKZHQGHX;")
	private Class36 aClass36_19;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "Lclient!SKZHQGHX;")
	private Class36 aClass36_20;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "Lclient!SKZHQGHX;")
	private Class36 aClass36_21;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "Lclient!SKZHQGHX;")
	private Class36 aClass36_22;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "Lclient!SKZHQGHX;")
	private Class36 aClass36_23;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
	private int anInt1025;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
	private int anInt1029;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "I")
	private int anInt1030;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
	private int anInt1031;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "Lclient!XXDUCPOC;")
	private Class46 aClass46_2;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
	private int anInt1032;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
	private int anInt1033;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private int anInt1034;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "I")
	private int anInt1035;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "I")
	private int anInt1036;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "I")
	private int anInt1037;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
	private int anInt1038;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
	private int anInt1039;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "I")
	private int anInt1040;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "I")
	private int anInt1041;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "Lclient!YHASUFYG;")
	private Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_14;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "Lclient!YHASUFYG;")
	private Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_15;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "I")
	private int anInt1043;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "I")
	private int anInt1045;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "Ljava/lang/String;")
	private String aString30;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "[I")
	private int[] anIntArray270;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "[I")
	private int[] anIntArray271;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "[I")
	private int[] anIntArray272;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "I")
	private int anInt1047;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "Lclient!YHASUFYG;")
	private Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_16;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "I")
	private int anInt1051;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "I")
	private int anInt1052;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "I")
	private int anInt1055;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "Lclient!SKZHQGHX;")
	private Class36 aClass36_24;

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "Lclient!SKZHQGHX;")
	private Class36 aClass36_25;

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "Lclient!SKZHQGHX;")
	private Class36 aClass36_26;

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "Lclient!SKZHQGHX;")
	private Class36 aClass36_27;

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "I")
	private int anInt1057;

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "I")
	private int anInt1058;

	@OriginalMember(owner = "client!client", name = "Pj", descriptor = "I")
	private int anInt1059;

	@OriginalMember(owner = "client!client", name = "Qj", descriptor = "I")
	private int anInt1060;

	@OriginalMember(owner = "client!client", name = "Rj", descriptor = "I")
	private int anInt1061;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "[Lclient!RZNFVLPG;")
	public Class32[] aClass32Array1 = new Class32[5];

	@OriginalMember(owner = "client!client", name = "L", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "M", descriptor = "Ljava/lang/String;")
	private String aString18 = "";

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
	private int anInt845 = 752;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
	private int anInt846 = 7759444;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Z")
	private boolean aBoolean244 = false;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
	private int anInt848 = 31514;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Ljava/lang/String;")
	private String aString19 = "";

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Ljava/lang/String;")
	private String aString20 = "";

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "Z")
	private boolean aBoolean246 = false;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
	private int anInt850 = 50;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "[I")
	private int[] anIntArray212 = new int[this.anInt850];

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "[I")
	private int[] anIntArray213 = new int[this.anInt850];

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "[I")
	private int[] anIntArray214 = new int[this.anInt850];

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "[I")
	private int[] anIntArray215 = new int[this.anInt850];

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "[I")
	private int[] anIntArray216 = new int[this.anInt850];

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "[I")
	private int[] anIntArray217 = new int[this.anInt850];

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "[I")
	private int[] anIntArray218 = new int[this.anInt850];

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[this.anInt850];

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
	private final int anInt851 = 100;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "[I")
	private int[] anIntArray219 = new int[100];

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
	private int anInt853 = 586;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
	private int anInt855 = 351;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "Z")
	private boolean aBoolean247 = true;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "Z")
	private boolean aBoolean248 = false;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
	private int anInt858 = 439;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "[I")
	private int[] anIntArray220 = new int[5];

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "[I")
	private int[] anIntArray221 = new int[5];

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "Z")
	private boolean aBoolean249 = false;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "[I")
	private int[] anIntArray222 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "[I")
	private int[] anIntArray223 = new int[50];

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "[I")
	public int[] anIntArray224 = new int[2000];

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt867 = -1;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "Lclient!IMUIZRAF;")
	private Class3_Sub1_Sub3 aClass3_Sub1_Sub3_6 = Class3_Sub1_Sub3.method134();

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "I")
	private int anInt869 = 8;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "[Lclient!YHASUFYG;")
	private Class3_Sub1_Sub1_Sub4[] aClass3_Sub1_Sub1_Sub4Array4 = new Class3_Sub1_Sub1_Sub4[20];

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "Z")
	private boolean aBoolean250 = false;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "[I")
	private int[] anIntArray225 = new int[50];

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "[I")
	private int[] anIntArray226 = new int[1000];

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "[I")
	private int[] anIntArray227 = new int[1000];

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
	private int anInt879 = 32747;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "[I")
	private int[] anIntArray228 = new int[Class22.anInt286];

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "[Lclient!AGTHLVTI;")
	private Class3_Sub1_Sub1_Sub1[] aClass3_Sub1_Sub1_Sub1Array2 = new Class3_Sub1_Sub1_Sub1[13];

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "Lclient!IMUIZRAF;")
	private Class3_Sub1_Sub3 aClass3_Sub1_Sub3_7 = Class3_Sub1_Sub3.method134();

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "Ljava/lang/String;")
	private String aString23 = "";

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "[Lclient!YHASUFYG;")
	private Class3_Sub1_Sub1_Sub4[] aClass3_Sub1_Sub1_Sub4Array5 = new Class3_Sub1_Sub1_Sub4[20];

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "Z")
	public boolean aBoolean251 = false;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
	private int anInt885 = 774;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "[I")
	private int[] anIntArray231 = new int[Class22.anInt286];

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "I")
	private int anInt888 = -1;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "Ljava/lang/String;")
	private String aString24 = "";

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "B")
	private byte aByte21 = -121;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "Z")
	private volatile boolean aBoolean252 = false;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "Z")
	private boolean aBoolean253 = false;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
	private int anInt900 = 26615;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
	private int anInt901 = -797;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "Lclient!IMUIZRAF;")
	private Class3_Sub1_Sub3 aClass3_Sub1_Sub3_8 = new Class3_Sub1_Sub3(0, new byte[5000]);

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "[Lclient!OTOMPFCI;")
	private Class3_Sub1_Sub2_Sub1_Sub1[] aClass3_Sub1_Sub2_Sub1_Sub1Array1 = new Class3_Sub1_Sub2_Sub1_Sub1[16384];

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "[I")
	private int[] anIntArray232 = new int[16384];

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[500];

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "I")
	private int anInt904 = 1;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "Ljava/lang/String;")
	private String aString25 = "";

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "[[[Lclient!PILILDKN;")
	private Class27[][][] aClass27ArrayArrayArray1 = new Class27[4][104][104];

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "Z")
	private boolean aBoolean254 = true;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "Z")
	private boolean aBoolean255 = false;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
	private int anInt910 = 2;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "Z")
	private boolean aBoolean256 = true;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "[I")
	private int[] anIntArray234 = new int[5];

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
	private int anInt915 = 2;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "[I")
	private int[] anIntArray235 = new int[5];

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "Z")
	private volatile boolean aBoolean259 = false;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "Lclient!SJPORZIF;")
	private Class35 aClass35_1 = new Class35();

	@OriginalMember(owner = "client!client", name = "me", descriptor = "I")
	private int anInt923 = -820;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
	private int anInt924 = 2301979;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "[I")
	private int[] anIntArray236 = new int[33];

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "[I")
	private int[] anIntArray237 = new int[100];

	@OriginalMember(owner = "client!client", name = "re", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[100];

	@OriginalMember(owner = "client!client", name = "se", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[100];

	@OriginalMember(owner = "client!client", name = "te", descriptor = "[I")
	private int[] anIntArray238 = new int[5];

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "[J")
	private long[] aLongArray4 = new long[200];

	@OriginalMember(owner = "client!client", name = "we", descriptor = "I")
	private int anInt927 = -1;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "Z")
	private boolean aBoolean260 = true;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "Ljava/lang/String;")
	private String aString26 = "";

	@OriginalMember(owner = "client!client", name = "De", descriptor = "Z")
	private boolean aBoolean261 = true;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "Z")
	private boolean aBoolean262 = false;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "I")
	private int anInt933 = 4;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "B")
	private byte aByte22 = 4;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "[I")
	private int[] anIntArray239 = new int[9];

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "[I")
	private int[] anIntArray240 = new int[Class22.anInt286];

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
	private int anInt939 = -958;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "Z")
	private volatile boolean aBoolean263 = false;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "I")
	private int anInt943 = 1;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "Z")
	private boolean aBoolean264 = false;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "[I")
	private final int[] anIntArray241 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "af", descriptor = "I")
	private int anInt944 = 1;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
	private int anInt946 = 627;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "I")
	private int anInt947 = -1;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
	private int anInt950 = -820;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private int anInt951 = -999;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private int anInt952 = -13016;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "[I")
	private int[] anIntArray242 = new int[4000];

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "[I")
	private int[] anIntArray243 = new int[4000];

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "[Lclient!AGTHLVTI;")
	private Class3_Sub1_Sub1_Sub1[] aClass3_Sub1_Sub1_Sub1Array4 = new Class3_Sub1_Sub1_Sub1[2];

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "I")
	private int anInt954 = -1;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "I")
	private int anInt955 = -1;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
	private int anInt958 = -1;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "[I")
	private int[] anIntArray244 = new int[50];

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "[[I")
	private int[][] anIntArrayArray23 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "[I")
	private int[] anIntArray245 = new int[256];

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "B")
	private byte aByte23 = 2;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "I")
	private int anInt961 = -1;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "Z")
	private boolean aBoolean266 = false;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "I")
	private int anInt965 = 128;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
	private int anInt969 = 317;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
	private int anInt970 = -458;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "[Lclient!YHASUFYG;")
	private Class3_Sub1_Sub1_Sub4[] aClass3_Sub1_Sub1_Sub4Array6 = new Class3_Sub1_Sub1_Sub4[1000];

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[200];

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "B")
	private byte aByte24 = 2;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "I")
	private int anInt972 = -1;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "Z")
	private boolean aBoolean267 = false;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "Lclient!IMUIZRAF;")
	private Class3_Sub1_Sub3 aClass3_Sub1_Sub3_9 = Class3_Sub1_Sub3.method134();

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "Lclient!PILILDKN;")
	private Class27 aClass27_10 = new Class27(false);

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "Z")
	private boolean aBoolean268 = false;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "[I")
	private int[] anIntArray250 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "I")
	private int anInt976 = 78;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "[Lclient!AGTHLVTI;")
	private Class3_Sub1_Sub1_Sub1[] aClass3_Sub1_Sub1_Sub1Array5 = new Class3_Sub1_Sub1_Sub1[100];

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private int anInt984 = -948;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "[I")
	private int[] anIntArray251 = new int[151];

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
	private int anInt988 = -1;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "Ljava/lang/String;")
	private String aString28 = "";

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "Z")
	private boolean aBoolean269 = false;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "[Lclient!YHASUFYG;")
	private Class3_Sub1_Sub1_Sub4[] aClass3_Sub1_Sub1_Sub4Array7 = new Class3_Sub1_Sub1_Sub4[100];

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "[I")
	private int[] anIntArray253 = new int[1000];

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "I")
	private int anInt1003 = -23175;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "I")
	private int anInt1005 = -1;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "Lclient!PILILDKN;")
	private Class27 aClass27_11 = new Class27(false);

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
	private int anInt1008 = 5063219;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
	private int anInt1015 = 2;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "B")
	private byte aByte25 = -105;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "Z")
	private boolean aBoolean270 = false;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[5];

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "I")
	private int anInt1016 = 2048;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "I")
	private int anInt1017 = 2047;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "[Lclient!SJUCHLXH;")
	private Class3_Sub1_Sub2_Sub1_Sub2[] aClass3_Sub1_Sub2_Sub1_Sub2Array1 = new Class3_Sub1_Sub2_Sub1_Sub2[this.anInt1016];

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "[I")
	private int[] anIntArray255 = new int[this.anInt1016];

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "[I")
	private int[] anIntArray256 = new int[this.anInt1016];

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "[Lclient!IMUIZRAF;")
	private Class3_Sub1_Sub3[] aClass3_Sub1_Sub3Array1 = new Class3_Sub1_Sub3[this.anInt1016];

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "Z")
	private boolean aBoolean271 = false;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "[I")
	private int[] anIntArray257 = new int[200];

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "Z")
	private boolean aBoolean272 = true;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "[I")
	private int[] anIntArray258 = new int[151];

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "[I")
	private int[] anIntArray259 = new int[7];

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "Z")
	private boolean aBoolean273 = false;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "B")
	private byte aByte26 = 4;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "Z")
	private boolean aBoolean274 = false;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "I")
	private int anInt1024 = 3353893;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "[Lclient!WWMUUFBO;")
	private Class44[] aClass44Array1 = new Class44[4];

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
	private int anInt1026 = -1;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "I")
	private int anInt1027 = -1;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "[Lclient!YHASUFYG;")
	private Class3_Sub1_Sub1_Sub4[] aClass3_Sub1_Sub1_Sub4Array8 = new Class3_Sub1_Sub1_Sub4[8];

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "I")
	private int anInt1028 = 317;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "[I")
	private int[] anIntArray265 = new int[500];

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "[I")
	private int[] anIntArray266 = new int[500];

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "[I")
	private int[] anIntArray267 = new int[500];

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "[I")
	private int[] anIntArray268 = new int[500];

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "B")
	private byte aByte27 = 96;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "Z")
	private boolean aBoolean276 = true;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "Z")
	private boolean aBoolean277 = true;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "Z")
	private boolean aBoolean278 = true;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
	private int anInt1042 = 12314;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "Z")
	private boolean aBoolean279 = false;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "Z")
	private boolean aBoolean280 = false;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "Z")
	private boolean aBoolean281 = false;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "[I")
	private int[] anIntArray269 = new int[2000];

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "I")
	private int anInt1044 = 3;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "I")
	private int anInt1048 = 1;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "I")
	private int anInt1049 = 692;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "Z")
	private boolean aBoolean283 = false;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "I")
	private int anInt1050 = -1;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "Z")
	private boolean aBoolean284 = false;

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "Z")
	private boolean aBoolean285 = false;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "Z")
	private boolean aBoolean286 = true;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "Z")
	private boolean aBoolean287 = false;

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "I")
	private int anInt1056 = -948;

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "Lclient!PILILDKN;")
	private Class27 aClass27_12 = new Class27(false);

	@OriginalMember(owner = "client!client", name = "Sj", descriptor = "[I")
	private int[] anIntArray273 = new int[33];

	static {
		@Pc(271) int local271 = 2;
		@Pc(273) int local273;
		for (local273 = 0; local273 < 32; local273++) {
			anIntArray233[local273] = local271 - 1;
			local271 += local271;
		}
		anInt912 = 10;
		aBoolean257 = true;
		aBoolean265 = true;
		aString27 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		anIntArray252 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		anIntArray254 = new int[99];
		local271 = 0;
		for (local273 = 0; local273 < 99; local273++) {
			@Pc(375) int local375 = local273 + 1;
			@Pc(388) int local388 = (int) ((double) local375 + Math.pow(2.0D, (double) local375 / 7.0D) * 300.0D);
			local271 += local388;
			anIntArray254[local273] = local271 / 4;
		}
		aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 330);
			if (arg0.length == 5) {
				anInt912 = Integer.parseInt(arg0[0]);
				anInt913 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method649();
				} else if (arg0[2].equals("highmem")) {
					method598();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean257 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean257 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt1064 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method569();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private static void method598() {
		try {
			Class25.aBoolean105 = false;
			Class3_Sub1_Sub1_Sub3.aBoolean203 = false;
			aBoolean258 = false;
			Class30.aBoolean137 = false;
			Class29.aBoolean125 = false;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("29080, " + 0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Ljava/lang/String;")
	private static String method599(@OriginalArg(0) int arg0) {
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
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("3359, " + arg0 + ", " + -26537 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)Ljava/lang/String;")
	private static String method600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 != 0) {
				throw new NullPointerException();
			} else if (arg1 < 100000) {
				return String.valueOf(arg1);
			} else if (arg1 < 10000000) {
				return arg1 / 1000 + "K";
			} else {
				return arg1 / 1000000 + "M";
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("9958, " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
	private static String method603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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
			signlink.reporterror("20723, " + arg0 + ", " + arg1 + ", " + true + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private static void method649() {
		try {
			Class25.aBoolean105 = true;
			Class3_Sub1_Sub1_Sub3.aBoolean203 = true;
			aBoolean258 = true;
			Class30.aBoolean137 = true;
			Class29.aBoolean125 = true;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("1285, " + -19 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!SJPORZIF;)Z")
	private boolean method582(@OriginalArg(1) Class35 arg0) {
		try {
			if (arg0.anIntArray105 == null) {
				return false;
			}
			for (@Pc(6) int local6 = 0; local6 < arg0.anIntArray105.length; local6++) {
				@Pc(14) int local14 = this.method589(local6, arg0);
				@Pc(19) int local19 = arg0.anIntArray107[local6];
				if (arg0.anIntArray105[local6] == 2) {
					if (local14 >= local19) {
						return false;
					}
				} else if (arg0.anIntArray105[local6] == 3) {
					if (local14 <= local19) {
						return false;
					}
				} else if (arg0.anIntArray105[local6] == 4) {
					if (local14 == local19) {
						return false;
					}
				} else if (local14 != local19) {
					return false;
				}
			}
			return true;
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("28984, " + 45167 + ", " + arg0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method583() {
		try {
			this.aClass36_24.method391();
			Class3_Sub1_Sub1_Sub3.anIntArray146 = this.anIntArray271;
			this.aClass3_Sub1_Sub1_Sub1_13.method44(0, 0);
			if (this.anInt958 != -1) {
				this.method673(0, 0, 0, Class35.aClass35Array1[this.anInt958]);
			} else if (this.anIntArray250[this.anInt1044] != -1) {
				this.method673(0, 0, 0, Class35.aClass35Array1[this.anIntArray250[this.anInt1044]]);
			}
			if (this.aBoolean271 && this.anInt859 == 1) {
				this.method677();
			}
			this.aClass36_24.method392(553, 205, super.aGraphics2);
			this.aClass36_26.method391();
			Class3_Sub1_Sub1_Sub3.anIntArray146 = this.anIntArray272;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("34664, " + 759 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method584() {
		try {
			this.aClass3_Sub1_Sub1_Sub1_1 = new Class3_Sub1_Sub1_Sub1(this.aClass5_1, "titlebox", 0);
			this.aClass3_Sub1_Sub1_Sub1_2 = new Class3_Sub1_Sub1_Sub1(this.aClass5_1, "titlebutton", 0);
			this.aClass3_Sub1_Sub1_Sub1Array3 = new Class3_Sub1_Sub1_Sub1[12];
			@Pc(25) int local25 = 0;
			try {
				local25 = Integer.parseInt(this.getParameter("fl_icon"));
			} catch (@Pc(32) Exception local32) {
			}
			@Pc(36) int local36;
			if (local25 == 0) {
				for (local36 = 0; local36 < 12; local36++) {
					this.aClass3_Sub1_Sub1_Sub1Array3[local36] = new Class3_Sub1_Sub1_Sub1(this.aClass5_1, "runes", local36);
				}
			} else {
				for (local36 = 0; local36 < 12; local36++) {
					this.aClass3_Sub1_Sub1_Sub1Array3[local36] = new Class3_Sub1_Sub1_Sub1(this.aClass5_1, "runes", (local36 & 0x3) + 12);
				}
			}
			this.aClass3_Sub1_Sub1_Sub4_9 = new Class3_Sub1_Sub1_Sub4(128, 265);
			this.aClass3_Sub1_Sub1_Sub4_10 = new Class3_Sub1_Sub1_Sub4(128, 265);
			for (local36 = 0; local36 < 33920; local36++) {
				this.aClass3_Sub1_Sub1_Sub4_9.anIntArray204[local36] = this.aClass36_18.anIntArray119[local36];
			}
			for (@Pc(116) int local116 = 0; local116 < 33920; local116++) {
				this.aClass3_Sub1_Sub1_Sub4_10.anIntArray204[local116] = this.aClass36_19.anIntArray119[local116];
			}
			this.anIntArray247 = new int[256];
			for (@Pc(138) int local138 = 0; local138 < 64; local138++) {
				this.anIntArray247[local138] = local138 * 262144;
			}
			for (@Pc(153) int local153 = 0; local153 < 64; local153++) {
				this.anIntArray247[local153 + 64] = local153 * 1024 + 16711680;
			}
			for (@Pc(172) int local172 = 0; local172 < 64; local172++) {
				this.anIntArray247[local172 + 128] = local172 * 4 + 16776960;
			}
			for (@Pc(191) int local191 = 0; local191 < 64; local191++) {
				this.anIntArray247[local191 + 192] = 16777215;
			}
			this.anIntArray248 = new int[256];
			for (@Pc(210) int local210 = 0; local210 < 64; local210++) {
				this.anIntArray248[local210] = local210 * 1024;
			}
			for (@Pc(225) int local225 = 0; local225 < 64; local225++) {
				this.anIntArray248[local225 + 64] = local225 * 4 + 65280;
			}
			for (@Pc(244) int local244 = 0; local244 < 64; local244++) {
				this.anIntArray248[local244 + 128] = local244 * 262144 + 65535;
			}
			for (@Pc(263) int local263 = 0; local263 < 64; local263++) {
				this.anIntArray248[local263 + 192] = 16777215;
			}
			this.anIntArray249 = new int[256];
			for (@Pc(282) int local282 = 0; local282 < 64; local282++) {
				this.anIntArray249[local282] = local282 * 4;
			}
			for (@Pc(297) int local297 = 0; local297 < 64; local297++) {
				this.anIntArray249[local297 + 64] = local297 * 262144 + 255;
			}
			for (@Pc(316) int local316 = 0; local316 < 64; local316++) {
				this.anIntArray249[local316 + 128] = local316 * 1024 + 16711935;
			}
			for (@Pc(335) int local335 = 0; local335 < 64; local335++) {
				this.anIntArray249[local335 + 192] = 16777215;
			}
			this.anIntArray246 = new int[256];
			this.anIntArray229 = new int[32768];
			this.anIntArray230 = new int[32768];
			this.method588(null, this.aBoolean278);
			this.anIntArray260 = new int[32768];
			this.anIntArray261 = new int[32768];
			this.method581(aBoolean265, 10, "Connecting to fileserver");
			if (!this.aBoolean263) {
				this.aBoolean252 = true;
				this.aBoolean263 = true;
				this.method580(this, 2);
			}
		} catch (@Pc(393) RuntimeException local393) {
			signlink.reporterror("33674, " + 59 + ", " + local393.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	@Override
	public void method580(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}
		if (signlink.mainapp == null) {
			super.method580(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!YHASUFYG;I)V")
	private void method585(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub1_Sub4 arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = this.anInt966 + this.anInt914 & 0x7FF;
			@Pc(15) int local15 = arg0 * arg0 + arg2 * arg2;
			if (local15 <= 6400) {
				@Pc(23) int local23 = Class3_Sub1_Sub2_Sub6.anIntArray199[local7];
				@Pc(27) int local27 = Class3_Sub1_Sub2_Sub6.anIntArray200[local7];
				@Pc(36) int local36 = local23 * 256 / (this.anInt903 + 256);
				@Pc(55) int local55 = local27 * 256 / (this.anInt903 + 256);
				@Pc(65) int local65 = arg2 * local36 + arg0 * local55 >> 16;
				@Pc(75) int local75 = arg2 * local55 - arg0 * local36 >> 16;
				if (local15 > 2500) {
					arg1.method560(83 - local75 - arg1.anInt779 / 2 - 4, this.aClass3_Sub1_Sub1_Sub1_14, local65 + 94 + 4 - arg1.anInt778 / 2, this.aByte21);
				} else {
					arg1.method554(local65 + 94 + 4 - arg1.anInt778 / 2, 83 - local75 - arg1.anInt779 / 2 - 4);
				}
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("65971, " + -98 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method586() {
		try {
			this.method703(this.aBoolean277);
			if (this.anInt894 == 1) {
				this.aClass3_Sub1_Sub1_Sub4Array8[this.anInt893 / 100].method554(this.anInt891 - 8 - 4, this.anInt892 - 8 - 4);
			}
			if (this.anInt894 == 2) {
				this.aClass3_Sub1_Sub1_Sub4Array8[this.anInt893 / 100 + 4].method554(this.anInt891 - 8 - 4, this.anInt892 - 8 - 4);
			}
			if (this.anInt954 != -1) {
				this.method704(this.anInt1052, this.anInt954);
				this.method673(0, 0, 0, Class35.aClass35Array1[this.anInt954]);
			}
			if (this.anInt888 != -1) {
				this.method704(this.anInt1052, this.anInt888);
				this.method673(0, 0, 0, Class35.aClass35Array1[this.anInt888]);
			}
			this.method616();
			if (!this.aBoolean271) {
				this.method709();
				this.method647();
			} else if (this.anInt859 == 0) {
				this.method677();
			}
			if (this.anInt1045 == 1) {
				this.aClass3_Sub1_Sub1_Sub4Array4[1].method554(472, 296);
			}
			@Pc(171) int local171;
			if (aBoolean282) {
				@Pc(147) byte local147 = 20;
				@Pc(149) int local149 = 16776960;
				if (super.anInt818 < 15) {
					local149 = 16711680;
				}
				this.aClass3_Sub1_Sub1_Sub2_3.method84("Fps:" + super.anInt818, local149, 20);
				local171 = local147 + 15;
				@Pc(173) Runtime local173 = Runtime.getRuntime();
				@Pc(182) int local182 = (int) ((local173.totalMemory() - local173.freeMemory()) / 1024L);
				if (local182 > 33554432 && aBoolean258) {
				}
				this.aClass3_Sub1_Sub1_Sub2_3.method84("Mem:" + local182 + "k", 16776960, 35);
				local171 += 15;
			}
			if (this.anInt1041 != 0) {
				@Pc(216) int local216 = this.anInt1041 / 50;
				local171 = local216 / 60;
				@Pc(224) int local224 = local216 % 60;
				if (local224 < 10) {
					this.aClass3_Sub1_Sub1_Sub2_3.method89(329, "System update in: " + local171 + ":0" + local224, 4, 16776960);
				} else {
					this.aClass3_Sub1_Sub1_Sub2_3.method89(329, "System update in: " + local171 + ":" + local224, 4, 16776960);
				}
			}
		} catch (@Pc(266) RuntimeException local266) {
			signlink.reporterror("20716, " + -69 + ", " + local266.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBIILclient!SJUCHLXH;)V")
	private void method587(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub1_Sub2_Sub1_Sub2 arg3) {
		try {
			if (arg3 != aClass3_Sub1_Sub2_Sub1_Sub2_1 && this.anInt857 < 400) {
				if (this.aByte27 != 96) {
					this.aBoolean286 = !this.aBoolean286;
				}
				@Pc(47) String local47;
				if (arg3.anInt590 == 0) {
					local47 = arg3.aString13 + method603(arg3.anInt582, aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt582) + " (level-" + arg3.anInt582 + ")";
				} else {
					local47 = arg3.aString13 + " (skill-" + arg3.anInt590 + ")";
				}
				@Pc(177) int local177;
				if (this.anInt999 == 1) {
					this.aStringArray9[this.anInt857] = "Use " + this.aString29 + " with @whi@" + local47;
					this.anIntArray267[this.anInt857] = 29;
					this.anIntArray268[this.anInt857] = arg1;
					this.anIntArray265[this.anInt857] = arg0;
					this.anIntArray266[this.anInt857] = arg2;
					this.anInt857++;
				} else if (this.anInt864 != 1) {
					for (local177 = 4; local177 >= 0; local177--) {
						if (this.aStringArray13[local177] != null) {
							this.aStringArray9[this.anInt857] = this.aStringArray13[local177] + " @whi@" + local47;
							@Pc(204) short local204 = 0;
							if (this.aStringArray13[local177].equalsIgnoreCase("attack")) {
								if (arg3.anInt582 > aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt582) {
									local204 = 2000;
								}
								if (aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt574 != 0 && arg3.anInt574 != 0) {
									if (aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt574 == arg3.anInt574) {
										local204 = 2000;
									} else {
										local204 = 0;
									}
								}
							} else if (this.aBooleanArray12[local177]) {
								local204 = 2000;
							}
							if (local177 == 0) {
								this.anIntArray267[this.anInt857] = local204 + 409;
							}
							if (local177 == 1) {
								this.anIntArray267[this.anInt857] = local204 + 148;
							}
							if (local177 == 2) {
								this.anIntArray267[this.anInt857] = local204 + 743;
							}
							if (local177 == 3) {
								this.anIntArray267[this.anInt857] = local204 + 540;
							}
							if (local177 == 4) {
								this.anIntArray267[this.anInt857] = local204 + 575;
							}
							this.anIntArray268[this.anInt857] = arg1;
							this.anIntArray265[this.anInt857] = arg0;
							this.anIntArray266[this.anInt857] = arg2;
							this.anInt857++;
						}
					}
				} else if ((this.anInt866 & 0x8) == 8) {
					this.aStringArray9[this.anInt857] = this.aString21 + " @whi@" + local47;
					this.anIntArray267[this.anInt857] = 313;
					this.anIntArray268[this.anInt857] = arg1;
					this.anIntArray265[this.anInt857] = arg0;
					this.anIntArray266[this.anInt857] = arg2;
					this.anInt857++;
				}
				for (local177 = 0; local177 < this.anInt857; local177++) {
					if (this.anIntArray267[local177] == 797) {
						this.aStringArray9[local177] = "Walk here @whi@" + local47;
						return;
					}
				}
			}
		} catch (@Pc(354) RuntimeException local354) {
			signlink.reporterror("65219, " + arg0 + ", " + 96 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local354.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!AGTHLVTI;Z)V")
	private void method588(@OriginalArg(0) Class3_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.aBoolean251 &= arg1;
			for (@Pc(11) int local11 = 0; local11 < this.anIntArray229.length; local11++) {
				this.anIntArray229[local11] = 0;
			}
			@Pc(36) int local36;
			for (@Pc(26) int local26 = 0; local26 < 5000; local26++) {
				local36 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray229[local36] = (int) (Math.random() * 256.0D);
			}
			@Pc(54) int local54;
			@Pc(58) int local58;
			@Pc(66) int local66;
			for (local36 = 0; local36 < 20; local36++) {
				for (local54 = 1; local54 < 255; local54++) {
					for (local58 = 1; local58 < 127; local58++) {
						local66 = local58 + (local54 << 7);
						this.anIntArray230[local66] = (this.anIntArray229[local66 - 1] + this.anIntArray229[local66 + 1] + this.anIntArray229[local66 - 128] + this.anIntArray229[local66 + 128]) / 4;
					}
				}
				@Pc(112) int[] local112 = this.anIntArray229;
				this.anIntArray229 = this.anIntArray230;
				this.anIntArray230 = local112;
			}
			if (arg0 != null) {
				local54 = 0;
				for (local58 = 0; local58 < arg0.anInt40; local58++) {
					for (local66 = 0; local66 < arg0.anInt39; local66++) {
						if (arg0.aByteArray1[local54++] != 0) {
							@Pc(148) int local148 = local66 + arg0.anInt41 + 16;
							@Pc(155) int local155 = local58 + arg0.anInt42 + 16;
							@Pc(161) int local161 = local148 + (local155 << 7);
							this.anIntArray229[local161] = 0;
						}
					}
				}
			}
		} catch (@Pc(178) RuntimeException local178) {
			signlink.reporterror("20602, " + arg0 + ", " + arg1 + ", " + local178.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!SJPORZIF;)I")
	private int method589(@OriginalArg(0) int arg0, @OriginalArg(2) Class35 arg1) {
		try {
			if (arg1.anIntArrayArray10 == null || arg0 >= arg1.anIntArrayArray10.length) {
				return -2;
			}
			try {
				@Pc(21) int[] local21 = arg1.anIntArrayArray10[arg0];
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
						local34 = this.anIntArray240[local21[local25++]];
					}
					if (local32 == 2) {
						local34 = this.anIntArray228[local21[local25++]];
					}
					if (local32 == 3) {
						local34 = this.anIntArray231[local21[local25++]];
					}
					@Pc(83) Class35 local83;
					@Pc(88) int local88;
					@Pc(101) int local101;
					if (local32 == 4) {
						local83 = Class35.aClass35Array1[local21[local25++]];
						local88 = local21[local25++];
						if (local88 >= 0 && local88 < Class34.anInt452 && (!Class34.method361(local88).aBoolean149 || aBoolean257)) {
							for (local101 = 0; local101 < local83.anIntArray109.length; local101++) {
								if (local83.anIntArray109[local101] == local88 + 1) {
									local34 += local83.anIntArray104[local101];
								}
							}
						}
					}
					if (local32 == 5) {
						local34 = this.anIntArray224[local21[local25++]];
					}
					if (local32 == 6) {
						local34 = anIntArray254[this.anIntArray228[local21[local25++]] - 1];
					}
					if (local32 == 7) {
						local34 = this.anIntArray224[local21[local25++]] * 100 / 46875;
					}
					if (local32 == 8) {
						local34 = aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt582;
					}
					@Pc(176) int local176;
					if (local32 == 9) {
						for (local176 = 0; local176 < Class22.anInt286; local176++) {
							if (Class22.aBooleanArray5[local176]) {
								local34 += this.anIntArray228[local176];
							}
						}
					}
					if (local32 == 10) {
						local83 = Class35.aClass35Array1[local21[local25++]];
						local88 = local21[local25++] + 1;
						if (local88 >= 0 && local88 < Class34.anInt452 && (!Class34.method361(local88).aBoolean149 || aBoolean257)) {
							for (local101 = 0; local101 < local83.anIntArray109.length; local101++) {
								if (local83.anIntArray109[local101] == local88) {
									local34 = 999999999;
									break;
								}
							}
						}
					}
					if (local32 == 11) {
						local34 = this.anInt992;
					}
					if (local32 == 12) {
						local34 = this.anInt881;
					}
					if (local32 == 13) {
						local176 = this.anIntArray224[local21[local25++]];
						local88 = local21[local25++];
						local34 = (local176 & 0x1 << local88) == 0 ? 0 : 1;
					}
					if (local32 == 14) {
						local176 = local21[local25++];
						@Pc(291) Class2 local291 = Class2.aClass2Array1[local176];
						local101 = local291.anInt3;
						@Pc(297) int local297 = local291.anInt4;
						@Pc(300) int local300 = local291.anInt5;
						@Pc(306) int local306 = anIntArray233[local300 - local297];
						local34 = this.anIntArray224[local101] >> local297 & local306;
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
						local34 = (aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt533 >> 7) + this.anInt919;
					}
					if (local32 == 19) {
						local34 = (aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt534 >> 7) + this.anInt920;
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
			} catch (@Pc(399) Exception local399) {
				return -1;
			}
		} catch (@Pc(402) RuntimeException local402) {
			signlink.reporterror("7590, " + arg0 + ", " + 180 + ", " + arg1 + ", " + local402.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!IMUIZRAF;)V")
	private void method590(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub3 arg1) {
		try {
			this.anInt998 = 0;
			this.anInt1019 = 0;
			this.method593(arg0, arg1);
			this.method675(arg0, arg1);
			this.method628(arg1, arg0);
			@Pc(37) int local37;
			for (@Pc(30) int local30 = 0; local30 < this.anInt998; local30++) {
				local37 = this.anIntArray253[local30];
				if (this.aClass3_Sub1_Sub2_Sub1_Sub1Array1[local37].anInt560 != anInt1054) {
					this.aClass3_Sub1_Sub2_Sub1_Sub1Array1[local37].aClass42_1 = null;
					this.aClass3_Sub1_Sub2_Sub1_Sub1Array1[local37] = null;
				}
			}
			if (arg1.anInt243 != arg0) {
				signlink.reporterror(this.aString17 + " size mismatch in getnpcpos - pos:" + arg1.anInt243 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local37 = 0; local37 < this.anInt902; local37++) {
				if (this.aClass3_Sub1_Sub2_Sub1_Sub1Array1[this.anIntArray232[local37]] == null) {
					signlink.reporterror(this.aString17 + " null entry in npc list - pos:" + local37 + " size:" + this.anInt902);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("6279, " + -611 + ", " + arg0 + ", " + arg1 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	private void method591() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt953);
			if (this.aClass19_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass19_Sub1_1.anInt609);
			}
			System.out.println("loop-cycle:" + anInt1054);
			System.out.println("draw-cycle:" + anInt975);
			System.out.println("ptype:" + this.anInt1010);
			System.out.println("psize:" + this.anInt1009);
			if (this.aClass16_1 != null) {
				this.aClass16_1.method131();
			}
			super.aBoolean241 = true;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("45931, " + true + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)Ljava/awt/Component;")
	@Override
	protected Component method579(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("46153, " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method592(@OriginalArg(1) boolean arg0) {
		try {
			if (this.anInt1042 != 12314) {
				this.aClass27ArrayArrayArray1 = null;
			}
			for (@Pc(8) int local8 = 0; local8 < this.anInt902; local8++) {
				@Pc(18) Class3_Sub1_Sub2_Sub1_Sub1 local18 = this.aClass3_Sub1_Sub2_Sub1_Sub1Array1[this.anIntArray232[local8]];
				@Pc(27) int local27 = (this.anIntArray232[local8] << 14) + 536870912;
				if (local18 != null && local18.method387() && local18.aClass42_1.aBoolean213 == arg0 && local18.aClass42_1.method479(207)) {
					@Pc(48) int local48 = local18.anInt533 >> 7;
					@Pc(53) int local53 = local18.anInt534 >> 7;
					if (local48 >= 0 && local48 < 104 && local53 >= 0 && local53 < 104) {
						if (local18.anInt525 == 1 && (local18.anInt533 & 0x7F) == 64 && (local18.anInt534 & 0x7F) == 64) {
							if (this.anIntArrayArray23[local48][local53] == this.anInt949) {
								continue;
							}
							this.anIntArrayArray23[local48][local53] = this.anInt949;
						}
						if (!local18.aClass42_1.aBoolean215) {
							local27 += Integer.MIN_VALUE;
						}
						this.aClass25_1.method246(this.method629(local18.anInt534, this.anInt911, local18.anInt533), local27, (local18.anInt525 - 1) * 64 + 60, local18.anInt533, local18, this.anInt911, local18.anInt534, local18.anInt535, local18.aBoolean174);
					}
				}
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("49624, " + 12314 + ", " + arg0 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!IMUIZRAF;)V")
	private void method593(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub1_Sub3 arg1) {
		try {
			arg1.method156((byte) 7);
			@Pc(9) int local9 = arg1.method157(8);
			@Pc(21) int local21;
			if (local9 < this.anInt902) {
				for (local21 = local9; local21 < this.anInt902; local21++) {
					this.anIntArray253[this.anInt998++] = this.anIntArray232[local21];
				}
			}
			if (local9 > this.anInt902) {
				signlink.reporterror(this.aString17 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt902 = 0;
			for (local21 = 0; local21 < local9; local21++) {
				@Pc(73) int local73 = this.anIntArray232[local21];
				@Pc(78) Class3_Sub1_Sub2_Sub1_Sub1 local78 = this.aClass3_Sub1_Sub2_Sub1_Sub1Array1[local73];
				@Pc(83) int local83 = arg1.method157(1);
				if (local83 == 0) {
					this.anIntArray232[this.anInt902++] = local73;
					local78.anInt560 = anInt1054;
				} else {
					@Pc(106) int local106 = arg1.method157(2);
					if (local106 == 0) {
						this.anIntArray232[this.anInt902++] = local73;
						local78.anInt560 = anInt1054;
						this.anIntArray256[this.anInt1019++] = local73;
					} else {
						@Pc(157) int local157;
						@Pc(167) int local167;
						if (local106 == 1) {
							this.anIntArray232[this.anInt902++] = local73;
							local78.anInt560 = anInt1054;
							local157 = arg1.method157(3);
							local78.method386(false, local157);
							local167 = arg1.method157(1);
							if (local167 == 1) {
								this.anIntArray256[this.anInt1019++] = local73;
							}
						} else if (local106 == 2) {
							this.anIntArray232[this.anInt902++] = local73;
							local78.anInt560 = anInt1054;
							local157 = arg1.method157(3);
							local78.method386(true, local157);
							local167 = arg1.method157(3);
							local78.method386(true, local167);
							@Pc(225) int local225 = arg1.method157(1);
							if (local225 == 1) {
								this.anIntArray256[this.anInt1019++] = local73;
							}
						} else if (local106 == 3) {
							this.anIntArray253[this.anInt998++] = local73;
						}
					}
				}
			}
		} catch (@Pc(262) RuntimeException local262) {
			signlink.reporterror("95614, " + arg0 + ", " + 8 + ", " + arg1 + ", " + local262.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!BBWFUJHQ;I)V")
	private void method594(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub2_Sub1 arg1) {
		try {
			this.method595(arg0, (byte) 8, arg1.anInt533, arg1.anInt534);
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("46440, " + arg0 + ", " + arg1 + ", " + 42909 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBII)V")
	private void method595(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg2 >= 128 && arg3 >= 128 && arg2 <= 13056 && arg3 <= 13056) {
				@Pc(28) int local28 = this.method629(arg3, this.anInt911, arg2) - arg0;
				@Pc(33) int local33 = arg2 - this.anInt871;
				@Pc(38) int local38 = local28 - this.anInt872;
				@Pc(43) int local43 = arg3 - this.anInt873;
				@Pc(48) int local48 = Class3_Sub1_Sub2_Sub6.anIntArray199[this.anInt874];
				@Pc(53) int local53 = Class3_Sub1_Sub2_Sub6.anIntArray200[this.anInt874];
				@Pc(58) int local58 = Class3_Sub1_Sub2_Sub6.anIntArray199[this.anInt875];
				@Pc(63) int local63 = Class3_Sub1_Sub2_Sub6.anIntArray200[this.anInt875];
				@Pc(73) int local73 = local43 * local58 + local33 * local63 >> 16;
				@Pc(83) int local83 = local43 * local63 - local33 * local58 >> 16;
				@Pc(88) boolean local88 = false;
				@Pc(95) int local95 = local73;
				@Pc(105) int local105 = local38 * local53 - local83 * local48 >> 16;
				@Pc(115) int local115 = local38 * local48 + local83 * local53 >> 16;
				if (local115 >= 50) {
					this.anInt1026 = Class3_Sub1_Sub1_Sub3.anInt669 + (local95 << 9) / local115;
					this.anInt1027 = Class3_Sub1_Sub1_Sub3.anInt670 + (local105 << 9) / local115;
				} else {
					this.anInt1026 = -1;
					this.anInt1027 = -1;
				}
			} else {
				this.anInt1026 = -1;
				this.anInt1027 = -1;
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("40930, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!SJPORZIF;I)Z")
	private boolean method596(@OriginalArg(0) Class35 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = arg0.anInt513;
			this.anInt1009 += arg1;
			if (this.anInt1038 == 2) {
				if (local4 == 201) {
					this.aBoolean249 = true;
					this.anInt1006 = 0;
					this.aBoolean267 = true;
					this.aString24 = "";
					this.anInt1025 = 1;
					this.aString26 = "Enter name of friend to add to list";
				}
				if (local4 == 202) {
					this.aBoolean249 = true;
					this.anInt1006 = 0;
					this.aBoolean267 = true;
					this.aString24 = "";
					this.anInt1025 = 2;
					this.aString26 = "Enter name of friend to delete from list";
				}
			}
			if (local4 == 205) {
				this.anInt1013 = 250;
				return true;
			}
			if (local4 == 501) {
				this.aBoolean249 = true;
				this.anInt1006 = 0;
				this.aBoolean267 = true;
				this.aString24 = "";
				this.anInt1025 = 4;
				this.aString26 = "Enter name of player to add to list";
			}
			if (local4 == 502) {
				this.aBoolean249 = true;
				this.anInt1006 = 0;
				this.aBoolean267 = true;
				this.aString24 = "";
				this.anInt1025 = 5;
				this.aString26 = "Enter name of player to delete from list";
			}
			@Pc(118) int local118;
			@Pc(122) int local122;
			@Pc(127) int local127;
			if (local4 >= 300 && local4 <= 313) {
				local118 = (local4 - 300) / 2;
				local122 = local4 & 0x1;
				local127 = this.anIntArray259[local118];
				if (local127 != -1) {
					while (true) {
						if (local122 == 0) {
							local127--;
							if (local127 < 0) {
								local127 = Class4.anInt100 - 1;
							}
						}
						if (local122 == 1) {
							local127++;
							if (local127 >= Class4.anInt100) {
								local127 = 0;
							}
						}
						if (!Class4.aClass4Array1[local127].aBoolean34 && Class4.aClass4Array1[local127].anInt101 == local118 + (this.aBoolean256 ? 0 : 7)) {
							this.anIntArray259[local118] = local127;
							this.aBoolean248 = true;
							break;
						}
					}
				}
			}
			if (local4 >= 314 && local4 <= 323) {
				local118 = (local4 - 314) / 2;
				local122 = local4 & 0x1;
				local127 = this.anIntArray238[local118];
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
				this.anIntArray238[local118] = local127;
				this.aBoolean248 = true;
			}
			if (local4 == 324 && !this.aBoolean256) {
				this.aBoolean256 = true;
				this.method715();
			}
			if (local4 == 325 && this.aBoolean256) {
				this.aBoolean256 = false;
				this.method715();
			}
			if (local4 == 326) {
				this.aClass3_Sub1_Sub3_6.method135(159, this.anInt946);
				this.aClass3_Sub1_Sub3_6.method136(this.aBoolean256 ? 0 : 1);
				for (local118 = 0; local118 < 7; local118++) {
					this.aClass3_Sub1_Sub3_6.method136(this.anIntArray259[local118]);
				}
				for (local122 = 0; local122 < 5; local122++) {
					this.aClass3_Sub1_Sub3_6.method136(this.anIntArray238[local122]);
				}
				return true;
			}
			if (local4 == 613) {
				this.aBoolean266 = !this.aBoolean266;
			}
			if (local4 >= 601 && local4 <= 612) {
				this.method622();
				if (this.aString23.length() > 0) {
					this.aClass3_Sub1_Sub3_6.method135(40, this.anInt946);
					this.aClass3_Sub1_Sub3_6.method142(979, Class23.method226(this.aString23));
					this.aClass3_Sub1_Sub3_6.method136(local4 - 601);
					this.aClass3_Sub1_Sub3_6.method136(this.aBoolean266 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(357) RuntimeException local357) {
			signlink.reporterror("19816, " + arg0 + ", " + arg1 + ", " + local357.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!FHZFOSDU;B)V")
	private void method597(@OriginalArg(0) Class3_Sub2 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt192 == 0) {
				local1 = this.aClass25_1.method261(arg0.anInt191, arg0.anInt193, arg0.anInt194);
			}
			if (arg0.anInt192 == 1) {
				local1 = this.aClass25_1.method262(arg0.anInt191, arg0.anInt194, arg0.anInt193);
			}
			if (arg0.anInt192 == 2) {
				local1 = this.aClass25_1.method263(arg0.anInt191, arg0.anInt193, arg0.anInt194);
			}
			if (arg0.anInt192 == 3) {
				local1 = this.aClass25_1.method264(arg0.anInt191, arg0.anInt193, arg0.anInt194);
			}
			if (local1 != 0) {
				@Pc(76) int local76 = this.aClass25_1.method265(arg0.anInt191, arg0.anInt193, arg0.anInt194, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local76 & 0x1F;
				local7 = local76 >> 6;
			}
			arg0.anInt195 = local3;
			arg0.anInt197 = local5;
			arg0.anInt196 = local7;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("94502, " + arg0 + ", " + 0 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method577() {
		try {
			if (this.aBoolean280 || this.aBoolean264 || this.aBoolean274) {
				this.method641();
			} else {
				anInt975++;
				if (this.aBoolean251) {
					this.method693();
				} else {
					this.method672(false, 887);
				}
				this.anInt1043 = 0;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("70015, " + 112 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIZII)V")
	private void method601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass3_Sub1_Sub1_Sub1_3.method44(arg2, arg4);
			this.aClass3_Sub1_Sub1_Sub1_4.method44(arg2, arg4 + arg1 - 16);
			Class3_Sub1_Sub1.method542(this.anInt924, arg2, 16, arg1 - 32, arg4 + 16);
			@Pc(35) int local35 = (arg1 - 32) * arg1 / arg3;
			if (local35 < 8) {
				local35 = 8;
			}
			@Pc(52) int local52 = (arg1 - local35 - 32) * arg0 / (arg3 - arg1);
			Class3_Sub1_Sub1.method542(this.anInt1008, arg2, 16, local35, arg4 + local52 + 16);
			Class3_Sub1_Sub1.method547(arg2, local35, arg4 + local52 + 16, this.anInt846);
			Class3_Sub1_Sub1.method547(arg2 + 1, local35, arg4 + local52 + 16, this.anInt846);
			Class3_Sub1_Sub1.method545(this.anInt846, arg2, arg4 + local52 + 16, 16);
			Class3_Sub1_Sub1.method545(this.anInt846, arg2, arg4 + local52 + 17, 16);
			this.aBoolean251 &= true;
			Class3_Sub1_Sub1.method547(arg2 + 15, local35, arg4 + local52 + 16, this.anInt1024);
			Class3_Sub1_Sub1.method547(arg2 + 14, local35 - 1, arg4 + local52 + 17, this.anInt1024);
			Class3_Sub1_Sub1.method545(this.anInt1024, arg2, arg4 + local52 + local35 + 15, 16);
			Class3_Sub1_Sub1.method545(this.anInt1024, arg2 + 1, arg4 + 14 + local52 + local35, 15);
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("40476, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(14) int local14 = this.aClass25_1.method261(arg3, arg4, arg1);
			@Pc(24) int local24;
			@Pc(30) int local30;
			@Pc(34) int local34;
			@Pc(36) int local36;
			@Pc(58) int local58;
			@Pc(64) int local64;
			if (local14 != 0) {
				local24 = this.aClass25_1.method265(arg3, arg4, arg1, local14);
				local30 = local24 >> 6 & 0x3;
				local34 = local24 & 0x1F;
				local36 = arg2;
				if (local14 > 0) {
					local36 = arg0;
				}
				@Pc(44) int[] local44 = this.aClass3_Sub1_Sub1_Sub4_11.anIntArray204;
				local58 = arg4 * 4 + (103 - arg1) * 512 * 4 + 24624;
				local64 = local14 >> 14 & 0x7FFF;
				@Pc(67) Class29 local67 = Class29.method321(local64);
				if (local67.anInt420 == -1) {
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
					@Pc(77) Class3_Sub1_Sub1_Sub1 local77 = this.aClass3_Sub1_Sub1_Sub1Array5[local67.anInt420];
					if (local77 != null) {
						@Pc(89) int local89 = (local67.anInt421 * 4 - local77.anInt39) / 2;
						@Pc(99) int local99 = (local67.anInt411 * 4 - local77.anInt40) / 2;
						local77.method44(arg4 * 4 + local89 + 48, (104 - arg1 - local67.anInt411) * 4 + 48 + local99);
					}
				}
			}
			local14 = this.aClass25_1.method263(arg3, arg4, arg1);
			if (local14 != 0) {
				local24 = this.aClass25_1.method265(arg3, arg4, arg1, local14);
				local30 = local24 >> 6 & 0x3;
				local34 = local24 & 0x1F;
				local36 = local14 >> 14 & 0x7FFF;
				@Pc(453) Class29 local453 = Class29.method321(local36);
				@Pc(485) int local485;
				if (local453.anInt420 != -1) {
					@Pc(463) Class3_Sub1_Sub1_Sub1 local463 = this.aClass3_Sub1_Sub1_Sub1Array5[local453.anInt420];
					if (local463 != null) {
						local64 = (local453.anInt421 * 4 - local463.anInt39) / 2;
						local485 = (local453.anInt411 * 4 - local463.anInt40) / 2;
						local463.method44(arg4 * 4 + local64 + 48, (104 - arg1 - local453.anInt411) * 4 + 48 + local485);
					}
				} else if (local34 == 9) {
					local58 = 15658734;
					if (local14 > 0) {
						local58 = 15597568;
					}
					@Pc(522) int[] local522 = this.aClass3_Sub1_Sub1_Sub4_11.anIntArray204;
					local485 = arg4 * 4 + (103 - arg1) * 512 * 4 + 24624;
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
			local14 = this.aClass25_1.method264(arg3, arg4, arg1);
			if (local14 != 0) {
				local24 = local14 >> 14 & 0x7FFF;
				@Pc(617) Class29 local617 = Class29.method321(local24);
				if (local617.anInt420 != -1) {
					@Pc(627) Class3_Sub1_Sub1_Sub1 local627 = this.aClass3_Sub1_Sub1_Sub1Array5[local617.anInt420];
					if (local627 != null) {
						local36 = (local617.anInt421 * 4 - local627.anInt39) / 2;
						@Pc(649) int local649 = (local617.anInt411 * 4 - local627.anInt40) / 2;
						local627.method44(arg4 * 4 + local36 + 48, (104 - arg1 - local617.anInt411) * 4 + 48 + local649);
						return;
					}
				}
			}
		} catch (@Pc(673) RuntimeException local673) {
			signlink.reporterror("97292, " + arg0 + ", " + arg1 + ", " + 17156 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local673.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method604() {
		try {
			Class29.aClass43_2.method486();
			Class29.aClass43_3.method486();
			Class42.aClass43_9.method486();
			Class34.aClass43_5.method486();
			Class34.aClass43_4.method486();
			Class3_Sub1_Sub2_Sub1_Sub2.aClass43_8.method486();
			Class7.aClass43_1.method486();
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("28368, " + true + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!IMUIZRAF;I)V")
	private void method605(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub3 arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) boolean local3 = false;
			for (@Pc(5) int local5 = 0; local5 < this.anInt1019; local5++) {
				@Pc(12) int local12 = this.anIntArray256[local5];
				@Pc(17) Class3_Sub1_Sub2_Sub1_Sub2 local17 = this.aClass3_Sub1_Sub2_Sub1_Sub2Array1[local12];
				@Pc(20) int local20 = arg1.method146();
				if ((local20 & 0x4) != 0) {
					local20 += arg1.method146() << 8;
				}
				this.method661(arg1, local17, local20, local12, (byte) 1);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("47456, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method606(@OriginalArg(0) int arg0) {
		try {
			if (arg0 <= 0) {
				this.anInt1010 = -1;
			}
			if (aBoolean258 && this.anInt870 == 2 && Class30.anInt433 != this.anInt911) {
				this.aClass36_26.method391();
				this.aClass3_Sub1_Sub1_Sub2_3.method85(151, 0, 257, "Loading - please wait.");
				this.aClass3_Sub1_Sub1_Sub2_3.method85(150, 16777215, 256, "Loading - please wait.");
				this.aClass36_26.method392(4, 4, super.aGraphics2);
				this.anInt870 = 1;
				this.aLong33 = System.currentTimeMillis();
			}
			if (this.anInt870 == 1) {
				@Pc(56) int local56 = this.method607();
				if (local56 != 0 && System.currentTimeMillis() - this.aLong33 > 360000L) {
					signlink.reporterror(this.aString17 + " glcfb " + this.aLong31 + "," + local56 + "," + aBoolean258 + "," + this.aClass32Array1[0] + "," + this.aClass19_Sub1_1.method409() + "," + this.anInt911 + "," + this.anInt986 + "," + this.anInt987);
					this.aLong33 = System.currentTimeMillis();
				}
			}
			if (this.anInt870 == 2 && this.anInt911 != this.anInt972) {
				this.anInt972 = this.anInt911;
				this.method657(this.anInt969, this.anInt911);
			}
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("98899, " + arg0 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)I")
	private int method607() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray4.length; local3++) {
				if (this.aByteArrayArray4[local3] == null && this.anIntArray263[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray5[local3] == null && this.anIntArray264[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(41) int local41 = 0; local41 < this.aByteArrayArray4.length; local41++) {
				@Pc(48) byte[] local48 = this.aByteArrayArray5[local41];
				if (local48 != null) {
					@Pc(62) int local62 = (this.anIntArray262[local41] >> 8) * 64 - this.anInt919;
					@Pc(74) int local74 = (this.anIntArray262[local41] & 0xFF) * 64 - this.anInt920;
					if (this.aBoolean287) {
						local62 = 10;
						local74 = 10;
					}
					local39 &= Class30.method330(local48, local62, local74);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean270) {
				return -4;
			} else {
				this.anInt870 = 2;
				Class30.anInt433 = this.anInt911;
				this.aBoolean251 &= true;
				this.method670();
				this.aClass3_Sub1_Sub3_6.method135(231, this.anInt946);
				return 0;
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("70734, " + true + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	private boolean method608(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(7) int local7 = 0; local7 < this.anInt1037; local7++) {
				if (arg0.equalsIgnoreCase(this.aStringArray12[local7])) {
					return true;
				}
			}
			if (arg1 == this.aByte22) {
				@Pc(29) boolean local29 = false;
			} else {
				this.anInt952 = 482;
			}
			return arg0.equalsIgnoreCase(aClass3_Sub1_Sub2_Sub1_Sub2_1.aString13);
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("2898, " + arg0 + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(6) int local6 = Class38.aClass38Array1[arg1].anInt604;
			if (local6 != 0) {
				@Pc(14) int local14 = this.anIntArray224[arg1];
				if (arg0 < 0) {
					if (local6 == 1) {
						if (local14 == 1) {
							Class3_Sub1_Sub1_Sub3.method455(0.9D);
						}
						if (local14 == 2) {
							Class3_Sub1_Sub1_Sub3.method455(0.8D);
						}
						if (local14 == 3) {
							Class3_Sub1_Sub1_Sub3.method455(0.7D);
						}
						if (local14 == 4) {
							Class3_Sub1_Sub1_Sub3.method455(0.6D);
						}
						Class34.aClass43_4.method486();
						this.aBoolean285 = true;
					}
					if (local6 == 3) {
						@Pc(57) boolean local57 = this.aBoolean247;
						if (local14 == 0) {
							this.method694(this.aBoolean247, 0);
							this.aBoolean247 = true;
						}
						if (local14 == 1) {
							this.method694(this.aBoolean247, -400);
							this.aBoolean247 = true;
						}
						if (local14 == 2) {
							this.method694(this.aBoolean247, -800);
							this.aBoolean247 = true;
						}
						if (local14 == 3) {
							this.method694(this.aBoolean247, -1200);
							this.aBoolean247 = true;
						}
						if (local14 == 4) {
							this.aBoolean247 = false;
						}
						if (this.aBoolean247 != local57 && !aBoolean258) {
							if (this.aBoolean247) {
								this.anInt929 = this.anInt947;
								this.aBoolean260 = true;
								this.aClass19_Sub1_1.method406(2, this.anInt929);
							} else {
								this.method643(this.anInt952);
							}
							this.anInt868 = 0;
						}
					}
					if (local6 == 4) {
						if (local14 == 0) {
							this.aBoolean261 = true;
							this.method646(0);
						}
						if (local14 == 1) {
							this.aBoolean261 = true;
							this.method646(-400);
						}
						if (local14 == 2) {
							this.aBoolean261 = true;
							this.method646(-800);
						}
						if (local14 == 3) {
							this.aBoolean261 = true;
							this.method646(-1200);
						}
						if (local14 == 4) {
							this.aBoolean261 = false;
						}
					}
					if (local6 == 5) {
						this.anInt940 = local14;
					}
					if (local6 == 6) {
						this.anInt983 = local14;
					}
					if (local6 == 8) {
						this.anInt925 = local14;
						this.aBoolean249 = true;
					}
					if (local6 == 9) {
						this.anInt878 = local14;
					}
				}
			}
		} catch (@Pc(218) RuntimeException local218) {
			signlink.reporterror("96564, " + arg0 + ", " + arg1 + ", " + local218.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method610() {
		try {
			if (this.anInt1013 > 0) {
				this.method707();
			} else {
				this.aClass36_26.method391();
				this.aClass3_Sub1_Sub1_Sub2_3.method85(144, 0, 257, "Connection lost");
				this.aClass3_Sub1_Sub1_Sub2_3.method85(143, 16777215, 256, "Connection lost");
				this.aClass3_Sub1_Sub1_Sub2_3.method85(159, 0, 257, "Please wait - attempting to reestablish");
				this.aClass3_Sub1_Sub1_Sub2_3.method85(158, 16777215, 256, "Please wait - attempting to reestablish");
				this.aClass36_26.method392(4, 4, super.aGraphics2);
				this.anInt942 = 0;
				this.anInt996 = 0;
				@Pc(62) Class16 local62 = this.aClass16_1;
				this.aBoolean251 = false;
				this.anInt938 = 0;
				this.method653(this.aString17, this.aString18, true);
				if (!this.aBoolean251) {
					this.method707();
				}
				try {
					local62.method126();
				} catch (@Pc(85) Exception local85) {
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("87900, " + true + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!SJPORZIF;)V")
	private void method611(@OriginalArg(1) Class35 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt513;
			@Pc(68) int local68;
			if ((local4 < 1 || local4 > 100) && (local4 < 701 || local4 > 800)) {
				if (local4 >= 101 && local4 <= 200 || local4 >= 801 && local4 <= 900) {
					local68 = this.anInt1037;
					if (this.anInt1038 != 2) {
						local68 = 0;
					}
					if (local4 > 800) {
						local4 -= 701;
					} else {
						local4 -= 101;
					}
					if (local4 >= local68) {
						arg0.aString8 = "";
						arg0.anInt491 = 0;
					} else {
						if (this.anIntArray257[local4] == 0) {
							arg0.aString8 = "@red@Offline";
						} else if (this.anIntArray257[local4] < 200) {
							if (this.anIntArray257[local4] == anInt912) {
								arg0.aString8 = "@gre@World-" + (this.anIntArray257[local4] - 9);
							} else {
								arg0.aString8 = "@yel@World-" + (this.anIntArray257[local4] - 9);
							}
						} else if (this.anIntArray257[local4] == anInt912) {
							arg0.aString8 = "@gre@Classic" + (this.anIntArray257[local4] - 219);
						} else {
							arg0.aString8 = "@yel@Classic" + (this.anIntArray257[local4] - 219);
						}
						arg0.anInt491 = 1;
					}
				} else if (local4 == 203) {
					local68 = this.anInt1037;
					if (this.anInt1038 != 2) {
						local68 = 0;
					}
					arg0.anInt488 = local68 * 15 + 20;
					if (arg0.anInt488 <= arg0.anInt512) {
						arg0.anInt488 = arg0.anInt512 + 1;
					}
				} else if (local4 >= 401 && local4 <= 500) {
					local4 -= 401;
					if (local4 == 0 && this.anInt1038 == 0) {
						arg0.aString8 = "Loading ignore list";
						arg0.anInt491 = 0;
					} else if (local4 == 1 && this.anInt1038 == 0) {
						arg0.aString8 = "Please wait...";
						arg0.anInt491 = 0;
					} else {
						local68 = this.anInt977;
						if (this.anInt1038 == 0) {
							local68 = 0;
						}
						if (local4 >= local68) {
							arg0.aString8 = "";
							arg0.anInt491 = 0;
						} else {
							arg0.aString8 = Class23.method230(Class23.method227(this.aLongArray3[local4]));
							arg0.anInt491 = 1;
						}
					}
				} else if (local4 == 503) {
					arg0.anInt488 = this.anInt977 * 15 + 20;
					if (arg0.anInt488 <= arg0.anInt512) {
						arg0.anInt488 = arg0.anInt512 + 1;
					}
				} else if (local4 == 327) {
					arg0.anInt496 = 150;
					arg0.anInt497 = (int) (Math.sin((double) anInt1054 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean248) {
						for (local68 = 0; local68 < 7; local68++) {
							@Pc(381) int local381 = this.anIntArray259[local68];
							if (local381 >= 0 && !Class4.aClass4Array1[local381].method61(989)) {
								return;
							}
						}
						this.aBoolean248 = false;
						@Pc(400) Class3_Sub1_Sub2_Sub6[] local400 = new Class3_Sub1_Sub2_Sub6[7];
						@Pc(402) int local402 = 0;
						for (@Pc(404) int local404 = 0; local404 < 7; local404++) {
							@Pc(411) int local411 = this.anIntArray259[local404];
							if (local411 >= 0) {
								local400[local402++] = Class4.aClass4Array1[local411].method62();
							}
						}
						@Pc(433) Class3_Sub1_Sub2_Sub6 local433 = new Class3_Sub1_Sub2_Sub6(local400, true, local402);
						for (@Pc(435) int local435 = 0; local435 < 5; local435++) {
							if (this.anIntArray238[local435] != 0) {
								local433.method524(anIntArrayArray22[local435][0], anIntArrayArray22[local435][this.anIntArray238[local435]]);
								if (local435 == 1) {
									local433.method524(anIntArray252[0], anIntArray252[this.anIntArray238[local435]]);
								}
							}
						}
						local433.method517();
						local433.method518(598, Class49.aClass49Array1[aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt567].anIntArray206[0]);
						local433.method527(64, 850, -30, -50, -30, true);
						arg0.anInt501 = 5;
						arg0.anInt502 = 0;
						Class35.method378(this.anInt933, local433);
					}
				} else if (local4 == 324) {
					if (this.aClass3_Sub1_Sub1_Sub4_14 == null) {
						this.aClass3_Sub1_Sub1_Sub4_14 = arg0.aClass3_Sub1_Sub1_Sub4_2;
						this.aClass3_Sub1_Sub1_Sub4_15 = arg0.aClass3_Sub1_Sub1_Sub4_1;
					}
					if (this.aBoolean256) {
						arg0.aClass3_Sub1_Sub1_Sub4_2 = this.aClass3_Sub1_Sub1_Sub4_15;
					} else {
						arg0.aClass3_Sub1_Sub1_Sub4_2 = this.aClass3_Sub1_Sub1_Sub4_14;
					}
				} else if (local4 == 325) {
					if (this.aClass3_Sub1_Sub1_Sub4_14 == null) {
						this.aClass3_Sub1_Sub1_Sub4_14 = arg0.aClass3_Sub1_Sub1_Sub4_2;
						this.aClass3_Sub1_Sub1_Sub4_15 = arg0.aClass3_Sub1_Sub1_Sub4_1;
					}
					if (this.aBoolean256) {
						arg0.aClass3_Sub1_Sub1_Sub4_2 = this.aClass3_Sub1_Sub1_Sub4_14;
					} else {
						arg0.aClass3_Sub1_Sub1_Sub4_2 = this.aClass3_Sub1_Sub1_Sub4_15;
					}
				} else if (local4 == 600) {
					arg0.aString8 = this.aString23;
					if (anInt1054 % 20 < 10) {
						arg0.aString8 = arg0.aString8 + "|";
					} else {
						arg0.aString8 = arg0.aString8 + " ";
					}
				} else {
					if (local4 == 613) {
						if (this.anInt876 < 1) {
							arg0.aString8 = "";
						} else if (this.aBoolean266) {
							arg0.anInt494 = 16711680;
							arg0.aString8 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt494 = 16777215;
							arg0.aString8 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(642) String local642;
					if (local4 == 650 || local4 == 655) {
						if (this.anInt882 == 0) {
							arg0.aString8 = "";
						} else {
							if (this.anInt960 == 0) {
								local642 = "earlier today";
							} else if (this.anInt960 == 1) {
								local642 = "yesterday";
							} else {
								local642 = this.anInt960 + " days ago";
							}
							arg0.aString8 = "You last logged in " + local642 + " from: " + signlink.dns;
						}
					}
					if (local4 == 651) {
						if (this.anInt926 == 0) {
							arg0.aString8 = "0 unread messages";
							arg0.anInt494 = 16776960;
						}
						if (this.anInt926 == 1) {
							arg0.aString8 = "1 unread message";
							arg0.anInt494 = 65280;
						}
						if (this.anInt926 > 1) {
							arg0.aString8 = this.anInt926 + " unread messages";
							arg0.anInt494 = 65280;
						}
					}
					if (local4 == 652) {
						if (this.anInt908 == 201) {
							if (this.anInt906 == 1) {
								arg0.aString8 = "@yel@This is a non-members world: @whi@Since you are a member we";
							} else {
								arg0.aString8 = "";
							}
						} else if (this.anInt908 == 200) {
							arg0.aString8 = "You have not yet set any password recovery questions.";
						} else {
							if (this.anInt908 == 0) {
								local642 = "Earlier today";
							} else if (this.anInt908 == 1) {
								local642 = "Yesterday";
							} else {
								local642 = this.anInt908 + " days ago";
							}
							arg0.aString8 = local642 + " you changed your recovery questions";
						}
					}
					if (local4 == 653) {
						if (this.anInt908 == 201) {
							if (this.anInt906 == 1) {
								arg0.aString8 = "@whi@recommend you use a members world instead. You may use";
							} else {
								arg0.aString8 = "";
							}
						} else if (this.anInt908 == 200) {
							arg0.aString8 = "We strongly recommend you do so now to secure your account.";
						} else {
							arg0.aString8 = "If you do not remember making this change then cancel it immediately";
						}
					}
					if (local4 == 654) {
						if (this.anInt908 == 201) {
							if (this.anInt906 == 1) {
								arg0.aString8 = "@whi@this world but member benefits are unavailable whilst here.";
							} else {
								arg0.aString8 = "";
							}
						} else if (this.anInt908 == 200) {
							arg0.aString8 = "Do this from the 'account management' area on our front webpage";
						} else {
							arg0.aString8 = "Do this from the 'account management' area on our front webpage";
						}
					}
				}
			} else if (local4 == 1 && this.anInt1038 == 0) {
				arg0.aString8 = "Loading friend list";
				arg0.anInt491 = 0;
			} else if (local4 == 1 && this.anInt1038 == 1) {
				arg0.aString8 = "Connecting to friendserver";
				arg0.anInt491 = 0;
			} else if (local4 == 2 && this.anInt1038 != 2) {
				arg0.aString8 = "Please wait...";
				arg0.anInt491 = 0;
			} else {
				local68 = this.anInt1037;
				if (this.anInt1038 != 2) {
					local68 = 0;
				}
				if (local4 > 700) {
					local4 -= 601;
				} else {
					local4--;
				}
				if (local4 >= local68) {
					arg0.aString8 = "";
					arg0.anInt491 = 0;
				} else {
					arg0.aString8 = this.aStringArray12[local4];
					arg0.anInt491 = 1;
				}
			}
		} catch (@Pc(850) RuntimeException local850) {
			signlink.reporterror("1050, " + -12 + ", " + arg0 + ", " + local850.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method612(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt977 >= 100) {
					this.method667(0, "", "Your ignore list is full. Max of 100 hit");
				} else {
					@Pc(23) String local23 = Class23.method230(Class23.method227(arg0));
					for (@Pc(25) int local25 = 0; local25 < this.anInt977; local25++) {
						if (this.aLongArray3[local25] == arg0) {
							this.method667(0, "", local23 + " is already on your ignore list");
							return;
						}
					}
					for (@Pc(55) int local55 = 0; local55 < this.anInt1037; local55++) {
						if (this.aLongArray4[local55] == arg0) {
							this.method667(0, "", "Please remove " + local23 + " from your friend list first");
							return;
						}
					}
					this.aLongArray3[this.anInt977++] = arg0;
					this.aBoolean281 = true;
					this.anInt1009 += 0;
					this.aClass3_Sub1_Sub3_6.method135(235, this.anInt946);
					this.aClass3_Sub1_Sub3_6.method142(979, arg0);
				}
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("57593, " + arg0 + ", " + 0 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)I")
	private int method613() {
		try {
			@Pc(3) int local3 = 3;
			if (this.anInt874 < 310) {
				@Pc(18) int local18 = this.anInt871 >> 7;
				@Pc(23) int local23 = this.anInt873 >> 7;
				@Pc(28) int local28 = aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt533 >> 7;
				@Pc(33) int local33 = aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt534 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt911][local18][local23] & 0x4) != 0) {
					local3 = this.anInt911;
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
						if ((this.aByteArrayArrayArray8[this.anInt911][local18][local23] & 0x4) != 0) {
							local3 = this.anInt911;
						}
						local85 += local83;
						if (local85 >= 65536) {
							local85 -= 65536;
							if (local23 < local33) {
								local23++;
							} else if (local23 > local33) {
								local23--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt911][local18][local23] & 0x4) != 0) {
								local3 = this.anInt911;
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
						if ((this.aByteArrayArrayArray8[this.anInt911][local18][local23] & 0x4) != 0) {
							local3 = this.anInt911;
						}
						local85 += local83;
						if (local85 >= 65536) {
							local85 -= 65536;
							if (local18 < local28) {
								local18++;
							} else if (local18 > local28) {
								local18--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt911][local18][local23] & 0x4) != 0) {
								local3 = this.anInt911;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt911][aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt533 >> 7][aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt534 >> 7] & 0x4) != 0) {
				local3 = this.anInt911;
			}
			return local3;
		} catch (@Pc(251) RuntimeException local251) {
			signlink.reporterror("24344, " + true + ", " + local251.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)I")
	private int method614() {
		try {
			@Pc(9) int local9 = this.method629(this.anInt873, this.anInt911, this.anInt871);
			return local9 - this.anInt872 >= 800 || (this.aByteArrayArrayArray8[this.anInt911][this.anInt871 >> 7][this.anInt873 >> 7] & 0x4) == 0 ? 3 : this.anInt911;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("36240, " + 76 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method615() {
		try {
			@Pc(11) int local11 = this.aClass3_Sub1_Sub1_Sub2_4.method87("Choose Option");
			@Pc(24) int local24;
			for (@Pc(13) int local13 = 0; local13 < this.anInt857; local13++) {
				local24 = this.aClass3_Sub1_Sub1_Sub2_4.method87(this.aStringArray9[local13]);
				if (local24 > local11) {
					local11 = local24;
				}
			}
			local11 += 8;
			local24 = this.anInt857 * 15 + 21;
			@Pc(67) int local67;
			@Pc(85) int local85;
			if (super.anInt829 > 4 && super.anInt830 > 4 && super.anInt829 < 516 && super.anInt830 < 338) {
				local67 = super.anInt829 - local11 / 2 - 4;
				if (local67 + local11 > 512) {
					local67 = 512 - local11;
				}
				if (local67 < 0) {
					local67 = 0;
				}
				local85 = super.anInt830 - 4;
				if (local85 + local24 > 334) {
					local85 = 334 - local24;
				}
				if (local85 < 0) {
					local85 = 0;
				}
				this.aBoolean271 = true;
				this.anInt859 = 0;
				this.anInt860 = local67;
				this.anInt861 = local85;
				this.anInt862 = local11;
				this.anInt863 = this.anInt857 * 15 + 22;
			}
			if (super.anInt829 > 553 && super.anInt830 > 205 && super.anInt829 < 743 && super.anInt830 < 466) {
				local67 = super.anInt829 - local11 / 2 - 553;
				if (local67 < 0) {
					local67 = 0;
				} else if (local67 + local11 > 190) {
					local67 = 190 - local11;
				}
				local85 = super.anInt830 - 205;
				if (local85 < 0) {
					local85 = 0;
				} else if (local85 + local24 > 261) {
					local85 = 261 - local24;
				}
				this.aBoolean271 = true;
				this.anInt859 = 1;
				this.anInt860 = local67;
				this.anInt861 = local85;
				this.anInt862 = local11;
				this.anInt863 = this.anInt857 * 15 + 22;
			}
			if (super.anInt829 > 17 && super.anInt830 > 357 && super.anInt829 < 496 && super.anInt830 < 453) {
				local67 = super.anInt829 - local11 / 2 - 17;
				if (local67 < 0) {
					local67 = 0;
				} else if (local67 + local11 > 479) {
					local67 = 479 - local11;
				}
				local85 = super.anInt830 - 357;
				if (local85 < 0) {
					local85 = 0;
				} else if (local85 + local24 > 96) {
					local85 = 96 - local24;
				}
				this.aBoolean271 = true;
				this.anInt859 = 2;
				this.anInt860 = local67;
				this.anInt861 = local85;
				this.anInt862 = local11;
				this.anInt863 = this.anInt857 * 15 + 22;
			}
		} catch (@Pc(289) RuntimeException local289) {
			signlink.reporterror("25010, " + 13755 + ", " + local289.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method616() {
		try {
			this.anInt1029 = 0;
			@Pc(15) int local15 = (aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt533 >> 7) + this.anInt919;
			@Pc(23) int local23 = (aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt534 >> 7) + this.anInt920;
			if (local15 >= 3053 && local15 <= 3156 && local23 >= 3056 && local23 <= 3136) {
				this.anInt1029 = 1;
			}
			if (local15 >= 3072 && local15 <= 3118 && local23 >= 9492 && local23 <= 9535) {
				this.anInt1029 = 1;
			}
			if (this.anInt1029 == 1 && local15 >= 3139 && local15 <= 3199 && local23 >= 3008 && local23 <= 3062) {
				this.anInt1029 = 0;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("39078, " + 748 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIBIIIII)V")
	private void method617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(1) Class3_Sub2 local1 = null;
			for (@Pc(6) Class3_Sub2 local6 = (Class3_Sub2) this.aClass27_10.method305(); local6 != null; local6 = (Class3_Sub2) this.aClass27_10.method307()) {
				if (local6.anInt191 == arg0 && local6.anInt193 == arg7 && local6.anInt194 == arg3 && local6.anInt192 == arg5) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class3_Sub2();
				local1.anInt191 = arg0;
				local1.anInt192 = arg5;
				local1.anInt193 = arg7;
				local1.anInt194 = arg3;
				this.method597(local1);
				this.aClass27_10.method302(local1);
			}
			local1.anInt198 = arg1;
			local1.anInt200 = arg4;
			local1.anInt199 = arg8;
			local1.anInt202 = arg6;
			local1.anInt201 = arg2;
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("31023, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -33 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method618() {
		try {
			this.anInt1009 += 0;
			if (super.anInt828 == 1) {
				if (super.anInt829 >= 6 && super.anInt829 <= 106 && super.anInt830 >= 467 && super.anInt830 <= 499) {
					this.anInt971 = (this.anInt971 + 1) % 4;
					this.aBoolean246 = true;
					this.aBoolean249 = true;
					this.aClass3_Sub1_Sub3_6.method135(112, this.anInt946);
					this.aClass3_Sub1_Sub3_6.method136(this.anInt971);
					this.aClass3_Sub1_Sub3_6.method136(this.anInt1020);
					this.aClass3_Sub1_Sub3_6.method136(this.anInt1004);
				}
				if (super.anInt829 >= 135 && super.anInt829 <= 235 && super.anInt830 >= 467 && super.anInt830 <= 499) {
					this.anInt1020 = (this.anInt1020 + 1) % 3;
					this.aBoolean246 = true;
					this.aBoolean249 = true;
					this.aClass3_Sub1_Sub3_6.method135(112, this.anInt946);
					this.aClass3_Sub1_Sub3_6.method136(this.anInt971);
					this.aClass3_Sub1_Sub3_6.method136(this.anInt1020);
					this.aClass3_Sub1_Sub3_6.method136(this.anInt1004);
				}
				if (super.anInt829 >= 273 && super.anInt829 <= 373 && super.anInt830 >= 467 && super.anInt830 <= 499) {
					this.anInt1004 = (this.anInt1004 + 1) % 3;
					this.aBoolean246 = true;
					this.aBoolean249 = true;
					this.aClass3_Sub1_Sub3_6.method135(112, this.anInt946);
					this.aClass3_Sub1_Sub3_6.method136(this.anInt971);
					this.aClass3_Sub1_Sub3_6.method136(this.anInt1020);
					this.aClass3_Sub1_Sub3_6.method136(this.anInt1004);
				}
				@Pc(195) int local195;
				if (super.anInt829 >= 412 && super.anInt829 <= 512 && super.anInt830 >= 467 && super.anInt830 <= 499) {
					if (this.anInt888 == -1) {
						this.method622();
						this.aString23 = "";
						this.aBoolean266 = false;
						for (local195 = 0; local195 < Class35.aClass35Array1.length; local195++) {
							if (Class35.aClass35Array1[local195] != null && Class35.aClass35Array1[local195].anInt513 == 600) {
								this.anInt1005 = this.anInt888 = Class35.aClass35Array1[local195].anInt492;
								break;
							}
						}
					} else {
						this.method667(0, "", "Please close the interface you have open before using 'report abuse'");
					}
				}
				anInt854++;
				if (anInt854 > 1463) {
					anInt854 = 0;
					this.aClass3_Sub1_Sub3_6.method135(79, this.anInt946);
					this.aClass3_Sub1_Sub3_6.method136(0);
					local195 = this.aClass3_Sub1_Sub3_6.anInt243;
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass3_Sub1_Sub3_6.method137(31213);
					}
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass3_Sub1_Sub3_6.method137(17777);
					}
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass3_Sub1_Sub3_6.method137(29378);
					}
					this.aClass3_Sub1_Sub3_6.method137(63715);
					this.aClass3_Sub1_Sub3_6.method136((int) (Math.random() * 256.0D));
					this.aClass3_Sub1_Sub3_6.method136(38);
					this.aClass3_Sub1_Sub3_6.method137(31503);
					this.aClass3_Sub1_Sub3_6.method136(5);
					this.aClass3_Sub1_Sub3_6.method136((int) (Math.random() * 256.0D));
					this.aClass3_Sub1_Sub3_6.method136((int) (Math.random() * 256.0D));
					this.aClass3_Sub1_Sub3_6.method145(this.anInt853, this.aClass3_Sub1_Sub3_6.anInt243 - local195);
					return;
				}
			}
		} catch (@Pc(330) RuntimeException local330) {
			signlink.reporterror("19744, " + 0 + ", " + local330.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method619(@OriginalArg(0) int arg0) {
		try {
			if (!aBoolean258) {
				@Pc(18) Class3_Sub1_Sub1_Sub1 local18;
				@Pc(26) int local26;
				@Pc(34) int local34;
				@Pc(37) byte[] local37;
				@Pc(40) byte[] local40;
				@Pc(42) int local42;
				if (Class3_Sub1_Sub1_Sub3.anIntArray148[17] >= arg0) {
					local18 = Class3_Sub1_Sub1_Sub3.aClass3_Sub1_Sub1_Sub1Array1[17];
					local26 = local18.anInt39 * local18.anInt40 - 1;
					local34 = local18.anInt39 * this.anInt1052 * 2;
					local37 = local18.aByteArray1;
					local40 = this.aByteArray21;
					for (local42 = 0; local42 <= local26; local42++) {
						local40[local42] = local37[local42 - local34 & local26];
					}
					local18.aByteArray1 = local40;
					this.aByteArray21 = local37;
					Class3_Sub1_Sub1_Sub3.method453(17);
					anInt985++;
					if (anInt985 > 57) {
						anInt985 = 0;
						this.aClass3_Sub1_Sub3_6.method135(16, this.anInt946);
					}
				}
				if (Class3_Sub1_Sub1_Sub3.anIntArray148[24] >= arg0) {
					local18 = Class3_Sub1_Sub1_Sub3.aClass3_Sub1_Sub1_Sub1Array1[24];
					local26 = local18.anInt39 * local18.anInt40 - 1;
					local34 = local18.anInt39 * this.anInt1052 * 2;
					local37 = local18.aByteArray1;
					local40 = this.aByteArray21;
					for (local42 = 0; local42 <= local26; local42++) {
						local40[local42] = local37[local42 - local34 & local26];
					}
					local18.aByteArray1 = local40;
					this.aByteArray21 = local37;
					Class3_Sub1_Sub1_Sub3.method453(24);
				}
				if (Class3_Sub1_Sub1_Sub3.anIntArray148[34] >= arg0) {
					local18 = Class3_Sub1_Sub1_Sub3.aClass3_Sub1_Sub1_Sub1Array1[34];
					local26 = local18.anInt39 * local18.anInt40 - 1;
					local34 = local18.anInt39 * this.anInt1052 * 2;
					local37 = local18.aByteArray1;
					local40 = this.aByteArray21;
					for (local42 = 0; local42 <= local26; local42++) {
						local40[local42] = local37[local42 - local34 & local26];
					}
					local18.aByteArray1 = local40;
					this.aByteArray21 = local37;
					Class3_Sub1_Sub1_Sub3.method453(34);
					return;
				}
			}
		} catch (@Pc(200) RuntimeException local200) {
			signlink.reporterror("86984, " + arg0 + ", " + 6225 + ", " + local200.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II[B)Z")
	private boolean method620(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			return arg1 == null ? true : signlink.wavesave(arg1, arg0);
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("79447, " + -416 + ", " + arg0 + ", " + arg1 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method621() {
		try {
			@Pc(8) int local8;
			if (this.anInt886 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt886 > 768) {
						this.anIntArray246[local8] = this.method666(this.anIntArray248[local8], this.anIntArray247[local8], 1024 - this.anInt886);
					} else if (this.anInt886 > 256) {
						this.anIntArray246[local8] = this.anIntArray248[local8];
					} else {
						this.anIntArray246[local8] = this.method666(this.anIntArray247[local8], this.anIntArray248[local8], 256 - this.anInt886);
					}
				}
			} else if (this.anInt887 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt887 > 768) {
						this.anIntArray246[local8] = this.method666(this.anIntArray249[local8], this.anIntArray247[local8], 1024 - this.anInt887);
					} else if (this.anInt887 > 256) {
						this.anIntArray246[local8] = this.anIntArray249[local8];
					} else {
						this.anIntArray246[local8] = this.method666(this.anIntArray247[local8], this.anIntArray249[local8], 256 - this.anInt887);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray246[local8] = this.anIntArray247[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass36_18.anIntArray119[local8] = this.aClass3_Sub1_Sub1_Sub4_9.anIntArray204[local8];
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
				local198 = this.anIntArray245[local185] * (256 - local185) / 256;
				local202 = local198 + 22;
				if (local202 < 0) {
					local202 = 0;
				}
				local181 += local202;
				for (local212 = local202; local212 < 128; local212++) {
					local220 = this.anIntArray260[local181++];
					if (local220 == 0) {
						local183++;
					} else {
						local224 = local220;
						local228 = 256 - local220;
						local220 = this.anIntArray246[local220];
						local239 = this.aClass36_18.anIntArray119[local183];
						this.aClass36_18.anIntArray119[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			this.aClass36_18.method392(0, 0, super.aGraphics2);
			for (local198 = 0; local198 < 33920; local198++) {
				this.aClass36_19.anIntArray119[local198] = this.aClass3_Sub1_Sub1_Sub4_10.anIntArray204[local198];
			}
			local181 = 0;
			local183 = 1176;
			for (local202 = 1; local202 < 255; local202++) {
				local212 = this.anIntArray245[local202] * (256 - local202) / 256;
				local220 = 103 - local212;
				local183 += local212;
				for (local224 = 0; local224 < local220; local224++) {
					local228 = this.anIntArray260[local181++];
					if (local228 == 0) {
						local183++;
					} else {
						local239 = local228;
						@Pc(362) int local362 = 256 - local228;
						local228 = this.anIntArray246[local228];
						@Pc(373) int local373 = this.aClass36_19.anIntArray119[local183];
						this.aClass36_19.anIntArray119[local183++] = ((local228 & 0xFF00FF) * local239 + (local373 & 0xFF00FF) * local362 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local373 & 0xFF00) * local362 & 0xFF0000) >> 8;
					}
				}
				local181 += 128 - local220;
				local183 += 128 - local220 - local212;
			}
			this.aClass36_19.method392(637, 0, super.aGraphics2);
		} catch (@Pc(451) RuntimeException local451) {
			signlink.reporterror("93277, " + 3 + ", " + local451.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method622() {
		try {
			this.aClass3_Sub1_Sub3_6.method135(169, this.anInt946);
			if (this.anInt958 != -1) {
				this.anInt958 = -1;
				this.aBoolean281 = true;
				this.aBoolean255 = false;
				this.aBoolean262 = true;
			}
			if (this.anInt867 != -1) {
				this.anInt867 = -1;
				this.aBoolean249 = true;
				this.aBoolean255 = false;
			}
			this.anInt888 = -1;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("94878, " + 188 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)V")
	private void method623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(5) boolean local5 = false;
			for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
				if (this.aStringArray11[local7] != null) {
					@Pc(19) int local19 = this.anIntArray237[local7];
					@Pc(30) int local30 = this.anInt990 + 70 + 4 - local1 * 14;
					if (local30 < -20) {
						break;
					}
					@Pc(38) String local38 = this.aStringArray10[local7];
					if (local38 != null && local38.startsWith("@cr1@")) {
						local38 = local38.substring(5);
					}
					if (local38 != null && local38.startsWith("@cr2@")) {
						local38 = local38.substring(5);
					}
					if (local19 == 0) {
						local1++;
					}
					if ((local19 == 1 || local19 == 2) && (local19 == 1 || this.anInt971 == 0 || this.anInt971 == 1 && this.method608(local38, this.aByte26))) {
						if (arg2 > local30 - 14 && arg2 <= local30 && !local38.equals(aClass3_Sub1_Sub2_Sub1_Sub2_1.aString13)) {
							if (this.anInt876 >= 1) {
								this.aStringArray9[this.anInt857] = "Report abuse @whi@" + local38;
								this.anIntArray267[this.anInt857] = 629;
								this.anInt857++;
							}
							this.aStringArray9[this.anInt857] = "Add ignore @whi@" + local38;
							this.anIntArray267[this.anInt857] = 51;
							this.anInt857++;
							this.aStringArray9[this.anInt857] = "Add friend @whi@" + local38;
							this.anIntArray267[this.anInt857] = 79;
							this.anInt857++;
						}
						local1++;
					}
					if ((local19 == 3 || local19 == 7) && this.anInt925 == 0 && (local19 == 7 || this.anInt1020 == 0 || this.anInt1020 == 1 && this.method608(local38, this.aByte26))) {
						if (arg2 > local30 - 14 && arg2 <= local30) {
							if (this.anInt876 >= 1) {
								this.aStringArray9[this.anInt857] = "Report abuse @whi@" + local38;
								this.anIntArray267[this.anInt857] = 629;
								this.anInt857++;
							}
							this.aStringArray9[this.anInt857] = "Add ignore @whi@" + local38;
							this.anIntArray267[this.anInt857] = 51;
							this.anInt857++;
							this.aStringArray9[this.anInt857] = "Add friend @whi@" + local38;
							this.anIntArray267[this.anInt857] = 79;
							this.anInt857++;
						}
						local1++;
					}
					if (local19 == 4 && (this.anInt1004 == 0 || this.anInt1004 == 1 && this.method608(local38, this.aByte26))) {
						if (arg2 > local30 - 14 && arg2 <= local30) {
							this.aStringArray9[this.anInt857] = "Accept trade @whi@" + local38;
							this.anIntArray267[this.anInt857] = 457;
							this.anInt857++;
						}
						local1++;
					}
					if ((local19 == 5 || local19 == 6) && this.anInt925 == 0 && this.anInt1020 < 2) {
						local1++;
					}
					if (local19 == 8 && (this.anInt1004 == 0 || this.anInt1004 == 1 && this.method608(local38, this.aByte26))) {
						if (arg2 > local30 - 14 && arg2 <= local30) {
							this.aStringArray9[this.anInt857] = "Accept challenge @whi@" + local38;
							this.anIntArray267[this.anInt857] = 502;
							this.anInt857++;
						}
						local1++;
					}
				}
			}
		} catch (@Pc(407) RuntimeException local407) {
			signlink.reporterror("836, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local407.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIZZIIIIII)Z")
	private boolean method624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray25[local7][local11] = 0;
					this.anIntArrayArray24[local7][local11] = 99999999;
				}
			}
			local11 = arg1;
			@Pc(39) int local39 = arg2;
			this.anIntArrayArray25[arg1][arg2] = 99;
			this.anIntArrayArray24[arg1][arg2] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.aBoolean251 &= true;
			this.anIntArray242[0] = arg1;
			@Pc(72) int local72 = local55 + 1;
			this.anIntArray243[0] = arg2;
			@Pc(76) boolean local76 = false;
			@Pc(80) int local80 = this.anIntArray242.length;
			@Pc(87) int[][] local87 = this.aClass44Array1[this.anInt911].anIntArrayArray16;
			@Pc(199) int local199;
			while (local57 != local72) {
				local11 = this.anIntArray242[local57];
				local39 = this.anIntArray243[local57];
				local57 = (local57 + 1) % local80;
				if (local11 == arg7 && local39 == arg6) {
					local76 = true;
					break;
				}
				if (arg0 != 0) {
					if ((arg0 < 5 || arg0 == 10) && this.aClass44Array1[this.anInt911].method496(arg7, arg0 - 1, arg3, local39, local11, arg6, this.anInt879)) {
						local76 = true;
						break;
					}
					if (arg0 < 10 && this.aClass44Array1[this.anInt911].method497(arg0 - 1, arg7, arg6, arg3, local39, local11)) {
						local76 = true;
						break;
					}
				}
				if (arg9 != 0 && arg10 != 0 && this.aClass44Array1[this.anInt911].method498(arg10, arg8, arg9, arg7, local39, arg6, local11)) {
					local76 = true;
					break;
				}
				local199 = this.anIntArrayArray24[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray25[local11 - 1][local39] == 0 && (local87[local11 - 1][local39] & 0x1280108) == 0) {
					this.anIntArray242[local72] = local11 - 1;
					this.anIntArray243[local72] = local39;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray25[local11 - 1][local39] = 2;
					this.anIntArrayArray24[local11 - 1][local39] = local199;
				}
				if (local11 < 103 && this.anIntArrayArray25[local11 + 1][local39] == 0 && (local87[local11 + 1][local39] & 0x1280180) == 0) {
					this.anIntArray242[local72] = local11 + 1;
					this.anIntArray243[local72] = local39;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray25[local11 + 1][local39] = 8;
					this.anIntArrayArray24[local11 + 1][local39] = local199;
				}
				if (local39 > 0 && this.anIntArrayArray25[local11][local39 - 1] == 0 && (local87[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray242[local72] = local11;
					this.anIntArray243[local72] = local39 - 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray25[local11][local39 - 1] = 1;
					this.anIntArrayArray24[local11][local39 - 1] = local199;
				}
				if (local39 < 103 && this.anIntArrayArray25[local11][local39 + 1] == 0 && (local87[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray242[local72] = local11;
					this.anIntArray243[local72] = local39 + 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray25[local11][local39 + 1] = 4;
					this.anIntArrayArray24[local11][local39 + 1] = local199;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray25[local11 - 1][local39 - 1] == 0 && (local87[local11 - 1][local39 - 1] & 0x128010E) == 0 && (local87[local11 - 1][local39] & 0x1280108) == 0 && (local87[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray242[local72] = local11 - 1;
					this.anIntArray243[local72] = local39 - 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray25[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray24[local11 - 1][local39 - 1] = local199;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray25[local11 + 1][local39 - 1] == 0 && (local87[local11 + 1][local39 - 1] & 0x1280183) == 0 && (local87[local11 + 1][local39] & 0x1280180) == 0 && (local87[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray242[local72] = local11 + 1;
					this.anIntArray243[local72] = local39 - 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray25[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray24[local11 + 1][local39 - 1] = local199;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray25[local11 - 1][local39 + 1] == 0 && (local87[local11 - 1][local39 + 1] & 0x1280138) == 0 && (local87[local11 - 1][local39] & 0x1280108) == 0 && (local87[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray242[local72] = local11 - 1;
					this.anIntArray243[local72] = local39 + 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray25[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray24[local11 - 1][local39 + 1] = local199;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray25[local11 + 1][local39 + 1] == 0 && (local87[local11 + 1][local39 + 1] & 0x12801E0) == 0 && (local87[local11 + 1][local39] & 0x1280180) == 0 && (local87[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray242[local72] = local11 + 1;
					this.anIntArray243[local72] = local39 + 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray25[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray24[local11 + 1][local39 + 1] = local199;
				}
			}
			this.anInt1051 = 0;
			@Pc(815) int local815;
			@Pc(821) int local821;
			@Pc(827) int local827;
			if (!local76) {
				if (arg4) {
					local199 = 100;
					for (local815 = 1; local815 < 2; local815++) {
						for (local821 = arg7 - local815; local821 <= arg7 + local815; local821++) {
							for (local827 = arg6 - local815; local827 <= arg6 + local815; local827++) {
								if (local821 >= 0 && local827 >= 0 && local821 < 104 && local827 < 104 && this.anIntArrayArray24[local821][local827] < local199) {
									local199 = this.anIntArrayArray24[local821][local827];
									local11 = local821;
									local39 = local827;
									this.anInt1051 = 1;
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
			@Pc(888) byte local888 = 0;
			this.anIntArray242[0] = local11;
			local57 = local888 + 1;
			this.anIntArray243[0] = local39;
			local199 = local815 = this.anIntArrayArray25[local11][local39];
			while (local11 != arg1 || local39 != arg2) {
				if (local199 != local815) {
					local815 = local199;
					this.anIntArray242[local57] = local11;
					this.anIntArray243[local57++] = local39;
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
				local80 = local57;
				if (local57 > 25) {
					local80 = 25;
				}
				local57--;
				local821 = this.anIntArray242[local57];
				local827 = this.anIntArray243[local57];
				if (arg5 == 0) {
					this.aClass3_Sub1_Sub3_6.method135(58, this.anInt946);
					this.aClass3_Sub1_Sub3_6.method136(local80 + local80 + 3);
				}
				if (arg5 == 1) {
					this.aClass3_Sub1_Sub3_6.method135(21, this.anInt946);
					this.aClass3_Sub1_Sub3_6.method136(local80 + local80 + 3 + 14);
				}
				if (arg5 == 2) {
					this.aClass3_Sub1_Sub3_6.method135(221, this.anInt946);
					this.aClass3_Sub1_Sub3_6.method136(local80 + local80 + 3);
				}
				this.aClass3_Sub1_Sub3_6.method170(local821 + this.anInt919);
				this.aClass3_Sub1_Sub3_6.method163(super.anIntArray210[5] == 1 ? 1 : 0);
				this.anInt996 = this.anIntArray242[0];
				this.anInt997 = this.anIntArray243[0];
				for (@Pc(1070) int local1070 = 1; local1070 < local80; local1070++) {
					local57--;
					this.aClass3_Sub1_Sub3_6.method136(this.anIntArray242[local57] - local821);
					this.aClass3_Sub1_Sub3_6.method162(this.anIntArray243[local57] - local827);
				}
				this.aClass3_Sub1_Sub3_6.method170(local827 + this.anInt920);
				return true;
			} else if (arg5 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1114) RuntimeException local1114) {
			signlink.reporterror("79253, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	private void method625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg5 >= 1 && arg0 >= 1 && arg5 <= 102 && arg0 <= 102) {
				if (aBoolean258 && arg1 != this.anInt911) {
					return;
				}
				@Pc(29) int local29 = 0;
				if (arg6 == 0) {
					local29 = this.aClass25_1.method261(arg1, arg5, arg0);
				}
				if (arg6 == 1) {
					local29 = this.aClass25_1.method262(arg1, arg0, arg5);
				}
				if (arg6 == 2) {
					local29 = this.aClass25_1.method263(arg1, arg5, arg0);
				}
				if (arg6 == 3) {
					local29 = this.aClass25_1.method264(arg1, arg5, arg0);
				}
				@Pc(85) int local85;
				if (local29 != 0) {
					local85 = this.aClass25_1.method265(arg1, arg5, arg0, local29);
					@Pc(91) int local91 = local29 >> 14 & 0x7FFF;
					@Pc(95) int local95 = local85 & 0x1F;
					@Pc(99) int local99 = local85 >> 6;
					@Pc(111) Class29 local111;
					if (arg6 == 0) {
						this.aClass25_1.method252(arg1, arg0, arg5);
						local111 = Class29.method321(local91);
						if (local111.aBoolean136) {
							this.aClass44Array1[arg1].method492(local111.aBoolean133, local99, arg5, local95, arg0);
						}
					}
					if (arg6 == 1) {
						this.aClass25_1.method253(arg0, arg1, arg5);
					}
					if (arg6 == 2) {
						this.aClass25_1.method254(arg0, arg1, arg5);
						local111 = Class29.method321(local91);
						if (arg5 + local111.anInt421 > 103 || arg0 + local111.anInt421 > 103 || arg5 + local111.anInt411 > 103 || arg0 + local111.anInt411 > 103) {
							return;
						}
						if (local111.aBoolean136) {
							this.aClass44Array1[arg1].method493(arg5, local111.anInt411, arg0, local99, local111.anInt421, local111.aBoolean133);
						}
					}
					if (arg6 == 3) {
						this.aClass25_1.method255(arg5, arg1, arg0);
						local111 = Class29.method321(local91);
						if (local111.aBoolean136 && local111.aBoolean132) {
							this.aClass44Array1[arg1].method495(arg0, arg5);
						}
					}
				}
				if (arg4 >= 0) {
					local85 = arg1;
					if (arg1 < 3 && (this.aByteArrayArrayArray8[1][arg5][arg0] & 0x2) == 2) {
						local85 = arg1 + 1;
					}
					Class30.method340(arg5, this.anIntArrayArrayArray7, local85, arg3, this.aClass44Array1[arg1], arg2, 927, arg0, arg4, arg1, this.aClass25_1);
					return;
				}
			}
		} catch (@Pc(258) RuntimeException local258) {
			signlink.reporterror("6320, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -48118 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local258.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BZZ)V")
	private void method626(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		try {
			if (this.aBoolean247) {
				signlink.anInt1069 = arg2 ? 1 : 0;
				signlink.midisave(arg0, arg0.length);
				if (!arg1) {
					for (@Pc(17) int local17 = 1; local17 > 0; local17++) {
					}
				}
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("69643, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!YHASUFYG;III)V")
	private void method627(@OriginalArg(0) Class3_Sub1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg2 > 0) {
				@Pc(10) int local10 = arg1 * arg1 + arg3 * arg3;
				if (local10 > 4225 && local10 < 90000) {
					@Pc(24) int local24 = this.anInt966 + this.anInt914 & 0x7FF;
					@Pc(28) int local28 = Class3_Sub1_Sub2_Sub6.anIntArray199[local24];
					@Pc(32) int local32 = Class3_Sub1_Sub2_Sub6.anIntArray200[local24];
					@Pc(41) int local41 = local28 * 256 / (this.anInt903 + 256);
					@Pc(50) int local50 = local32 * 256 / (this.anInt903 + 256);
					@Pc(60) int local60 = arg3 * local41 + arg1 * local50 >> 16;
					@Pc(70) int local70 = arg3 * local50 - arg1 * local41 >> 16;
					@Pc(76) double local76 = Math.atan2((double) local60, (double) local70);
					@Pc(82) int local82 = (int) (Math.sin(local76) * 63.0D);
					@Pc(88) int local88 = (int) (Math.cos(local76) * 57.0D);
					this.aClass3_Sub1_Sub1_Sub4_16.method559(local82 + 94 + 4 - 10, local76, 83 - local88 - 20);
				} else {
					this.method585(arg1, arg0, arg3);
				}
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("11517, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!IMUIZRAF;IZ)V")
	private void method628(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(13) int local13 = 0; local13 < this.anInt1019; local13++) {
				@Pc(20) int local20 = this.anIntArray256[local13];
				@Pc(25) Class3_Sub1_Sub2_Sub1_Sub1 local25 = this.aClass3_Sub1_Sub2_Sub1_Sub1Array1[local20];
				@Pc(28) int local28 = arg0.method146();
				if ((local28 & 0x2) != 0) {
					local25.anInt537 = arg0.method174();
					local25.anInt538 = arg0.method148();
				}
				@Pc(49) int local49;
				@Pc(52) int local52;
				if ((local28 & 0x4) != 0) {
					local49 = arg0.method167();
					local52 = arg0.method146();
					local25.method384(local52, anInt1054, local49);
					local25.anInt569 = anInt1054 + 300;
					local25.anInt570 = arg0.method146();
					local25.anInt571 = arg0.method146();
				}
				if ((local28 & 0x1) != 0) {
					local25.aString12 = arg0.method153();
					local25.anInt540 = 100;
				}
				if ((local28 & 0x40) != 0) {
					local25.aClass42_1 = Class42.method481(arg0.method173());
					local25.anInt525 = local25.aClass42_1.aByte18;
					local25.anInt552 = local25.aClass42_1.anInt703;
					local25.anInt553 = local25.aClass42_1.anInt696;
					local25.anInt554 = local25.aClass42_1.anInt706;
					local25.anInt555 = local25.aClass42_1.anInt707;
					local25.anInt556 = local25.aClass42_1.anInt700;
					local25.anInt567 = local25.aClass42_1.anInt698;
				}
				if ((local28 & 0x20) != 0) {
					local25.anInt561 = arg0.method148();
					local49 = arg0.method179();
					local25.anInt565 = local49 >> 16;
					local25.anInt564 = anInt1054 + (local49 & 0xFFFF);
					local25.anInt562 = 0;
					local25.anInt563 = 0;
					if (local25.anInt564 > anInt1054) {
						local25.anInt562 = -1;
					}
					if (local25.anInt561 == 65535) {
						local25.anInt561 = -1;
					}
				}
				if ((local28 & 0x80) != 0) {
					local25.anInt531 = arg0.method174();
					if (local25.anInt531 == 65535) {
						local25.anInt531 = -1;
					}
				}
				if ((local28 & 0x8) != 0) {
					local49 = arg0.method175();
					if (local49 == 65535) {
						local49 = -1;
					}
					local52 = arg0.method167();
					if (local49 == local25.anInt526 && local49 != -1) {
						@Pc(216) int local216 = Class49.aClass49Array1[local49].anInt794;
						if (local216 == 1) {
							local25.anInt527 = 0;
							local25.anInt528 = 0;
							local25.anInt529 = local52;
							local25.anInt530 = 0;
						}
						if (local216 == 2) {
							local25.anInt530 = 0;
						}
					} else if (local49 == -1 || local25.anInt526 == -1 || Class49.aClass49Array1[local49].anInt788 >= Class49.aClass49Array1[local25.anInt526].anInt788) {
						local25.anInt526 = local49;
						local25.anInt527 = 0;
						local25.anInt528 = 0;
						local25.anInt529 = local52;
						local25.anInt530 = 0;
						local25.anInt541 = local25.anInt557;
					}
				}
				if ((local28 & 0x10) != 0) {
					local49 = arg0.method166();
					local52 = arg0.method165();
					local25.method384(local52, anInt1054, local49);
					local25.anInt569 = anInt1054 + 300;
					local25.anInt570 = arg0.method167();
					local25.anInt571 = arg0.method166();
				}
			}
		} catch (@Pc(315) RuntimeException local315) {
			signlink.reporterror("13583, " + arg0 + ", " + arg1 + ", " + true + ", " + local315.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILjava/lang/String;)V")
	@Override
	protected void method581(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		try {
			this.anInt974 = arg1;
			this.aString30 = arg2;
			this.method663((byte) 8);
			if (this.aClass5_1 == null) {
				super.method581(aBoolean265, arg1, arg2);
			} else {
				this.aClass36_17.method391();
				this.aClass3_Sub1_Sub1_Sub2_4.method85(54, 16777215, 180, "RuneScape is loading - please wait...");
				this.aBoolean251 &= arg0;
				Class3_Sub1_Sub1.method543(62, 304, 28, 34, 9179409);
				Class3_Sub1_Sub1.method543(63, 302, 29, 32, 0);
				Class3_Sub1_Sub1.method542(9179409, 30, arg1 * 3, 30, 64);
				Class3_Sub1_Sub1.method542(0, arg1 * 3 + 30, 300 - arg1 * 3, 30, 64);
				this.aClass3_Sub1_Sub1_Sub2_4.method85(85, 16777215, 180, arg2);
				this.aClass36_17.method392(202, 171, super.aGraphics2);
				if (this.aBoolean285) {
					this.aBoolean285 = false;
					if (!this.aBoolean263) {
						this.aClass36_18.method392(0, 0, super.aGraphics2);
						this.aClass36_19.method392(637, 0, super.aGraphics2);
					}
					this.aClass36_15.method392(128, 0, super.aGraphics2);
					this.aClass36_16.method392(202, 371, super.aGraphics2);
					this.aClass36_20.method392(0, 265, super.aGraphics2);
					this.aClass36_21.method392(562, 265, super.aGraphics2);
					this.aClass36_22.method392(128, 171, super.aGraphics2);
					this.aClass36_23.method392(562, 171, super.aGraphics2);
				}
			}
		} catch (@Pc(216) RuntimeException local216) {
			signlink.reporterror("24692, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local216.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIII)I")
	private int method629(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = arg2 >> 7;
			@Pc(7) int local7 = arg0 >> 7;
			if (local3 < 0 || local7 < 0 || local3 > 103 || local7 > 103) {
				return 0;
			}
			@Pc(21) int local21 = arg1;
			if (arg1 < 3 && (this.aByteArrayArrayArray8[1][local3][local7] & 0x2) == 2) {
				local21 = arg1 + 1;
			}
			@Pc(41) int local41 = arg2 & 0x7F;
			@Pc(45) int local45 = arg0 & 0x7F;
			@Pc(73) int local73 = this.anIntArrayArrayArray7[local21][local3][local7] * (128 - local41) + this.anIntArrayArrayArray7[local21][local3 + 1][local7] * local41 >> 7;
			@Pc(112) int local112 = this.anIntArrayArrayArray7[local21][local3][local7 + 1] * (128 - local41) + this.anIntArrayArrayArray7[local21][local3 + 1][local7 + 1] * local41 >> 7;
			return local73 * (128 - local45) + local112 * local45 >> 7;
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("27341, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZZLclient!SJPORZIF;IIIII)V")
	private void method630(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class35 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (this.aBoolean268) {
				this.anInt917 = 32;
			} else {
				this.anInt917 = 0;
			}
			this.aBoolean268 = false;
			if (arg6 >= arg5 && arg6 < arg5 + 16 && arg7 >= arg3 && arg7 < arg3 + 16) {
				arg2.anInt511 -= this.anInt1043 * 4;
				if (arg1) {
					this.aBoolean281 = true;
					return;
				}
			} else if (arg6 >= arg5 && arg6 < arg5 + 16 && arg7 >= arg3 + arg0 - 16 && arg7 < arg3 + arg0) {
				arg2.anInt511 += this.anInt1043 * 4;
				if (arg1) {
					this.aBoolean281 = true;
					return;
				}
			} else if (arg6 >= arg5 - this.anInt917 && arg6 < arg5 + this.anInt917 + 16 && arg7 >= arg3 + 16 && arg7 < arg3 + arg0 - 16 && this.anInt1043 > 0) {
				@Pc(127) int local127 = (arg0 - 32) * arg0 / arg4;
				if (local127 < 8) {
					local127 = 8;
				}
				@Pc(142) int local142 = arg7 - arg3 - local127 / 2 - 16;
				@Pc(148) int local148 = arg0 - local127 - 32;
				arg2.anInt511 = (arg4 - arg0) * local142 / local148;
				if (arg1) {
					this.aBoolean281 = true;
				}
				this.aBoolean268 = true;
			} else {
				return;
			}
		} catch (@Pc(167) RuntimeException local167) {
			signlink.reporterror("22822, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local167.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method631() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt1018; local3++) {
				if (local3 == -1) {
					local11 = this.anInt1017;
				} else {
					local11 = this.anIntArray255[local3];
				}
				@Pc(23) Class3_Sub1_Sub2_Sub1_Sub2 local23 = this.aClass3_Sub1_Sub2_Sub1_Sub2Array1[local11];
				if (local23 != null && local23.anInt540 > 0) {
					local23.anInt540--;
					if (local23.anInt540 == 0) {
						local23.aString12 = null;
					}
				}
			}
			for (local11 = 0; local11 < this.anInt902; local11++) {
				@Pc(60) int local60 = this.anIntArray232[local11];
				@Pc(65) Class3_Sub1_Sub2_Sub1_Sub1 local65 = this.aClass3_Sub1_Sub2_Sub1_Sub1Array1[local60];
				if (local65 != null && local65.anInt540 > 0) {
					local65.anInt540--;
					if (local65.anInt540 == 0) {
						local65.aString12 = null;
					}
				}
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("25609, " + -42 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(JI)V")
	private void method632(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt1037 >= 100 && this.anInt1022 != 1) {
					this.method667(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
				} else if (this.anInt1037 >= 200) {
					this.method667(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
				} else {
					@Pc(38) String local38 = Class23.method230(Class23.method227(arg0));
					for (@Pc(40) int local40 = 0; local40 < this.anInt1037; local40++) {
						if (this.aLongArray4[local40] == arg0) {
							this.method667(0, "", local38 + " is already on your friend list");
							return;
						}
					}
					for (@Pc(70) int local70 = 0; local70 < this.anInt977; local70++) {
						if (this.aLongArray3[local70] == arg0) {
							this.method667(0, "", "Please remove " + local38 + " from your ignore list first");
							return;
						}
					}
					if (!local38.equals(aClass3_Sub1_Sub2_Sub1_Sub2_1.aString13)) {
						this.aStringArray12[this.anInt1037] = local38;
						this.aLongArray4[this.anInt1037] = arg0;
						this.anIntArray257[this.anInt1037] = 0;
						this.anInt1037++;
						this.aBoolean281 = true;
						this.aClass3_Sub1_Sub3_6.method135(22, this.anInt946);
						this.aClass3_Sub1_Sub3_6.method142(979, arg0);
					}
				}
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("15599, " + arg0 + ", " + 735 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method633() {
		try {
			@Pc(19) int local19;
			@Pc(26) int local26;
			if (this.anInt1021 == 0) {
				local19 = super.anInt819 / 2 - 80;
				local26 = super.anInt820 / 2 + 20;
				local26 += 20;
				if (super.anInt828 == 1 && super.anInt829 >= local19 - 75 && super.anInt829 <= local19 + 75 && super.anInt830 >= local26 - 20 && super.anInt830 <= local26 + 20) {
					this.anInt1021 = 3;
					this.anInt842 = 0;
				}
				local19 = super.anInt819 / 2 + 80;
				if (super.anInt828 == 1 && super.anInt829 >= local19 - 75 && super.anInt829 <= local19 + 75 && super.anInt830 >= local26 - 20 && super.anInt830 <= local26 + 20) {
					this.aString19 = "";
					this.aString20 = "Enter your username & password.";
					this.anInt1021 = 2;
					this.anInt842 = 0;
				}
			} else if (this.anInt1021 == 2) {
				local19 = super.anInt820 / 2 - 40;
				local19 += 30;
				local19 += 25;
				if (super.anInt828 == 1 && super.anInt830 >= local19 - 15 && super.anInt830 < local19) {
					this.anInt842 = 0;
				}
				local19 += 15;
				if (super.anInt828 == 1 && super.anInt830 >= local19 - 15 && super.anInt830 < local19) {
					this.anInt842 = 1;
				}
				local19 += 15;
				local26 = super.anInt819 / 2 - 80;
				@Pc(172) int local172 = super.anInt820 / 2 + 50;
				@Pc(173) int local173 = local172 + 20;
				if (super.anInt828 == 1 && super.anInt829 >= local26 - 75 && super.anInt829 <= local26 + 75 && super.anInt830 >= local173 - 20 && super.anInt830 <= local173 + 20) {
					this.anInt938 = 0;
					this.method653(this.aString17, this.aString18, false);
					if (this.aBoolean251) {
						return;
					}
				}
				local26 = super.anInt819 / 2 + 80;
				if (super.anInt828 == 1 && super.anInt829 >= local26 - 75 && super.anInt829 <= local26 + 75 && super.anInt830 >= local173 - 20 && super.anInt830 <= local173 + 20) {
					this.anInt1021 = 0;
					this.aString17 = "";
					this.aString18 = "";
				}
				while (true) {
					while (true) {
						@Pc(264) int local264 = this.method573(this.anInt848);
						if (local264 == -1) {
							return;
						}
						@Pc(269) boolean local269 = false;
						for (@Pc(271) int local271 = 0; local271 < aString27.length(); local271++) {
							if (local264 == aString27.charAt(local271)) {
								local269 = true;
								break;
							}
						}
						if (this.anInt842 == 0) {
							if (local264 == 8 && this.aString17.length() > 0) {
								this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
							}
							if (local264 == 9 || local264 == 10 || local264 == 13) {
								this.anInt842 = 1;
							}
							if (local269) {
								this.aString17 = this.aString17 + (char) local264;
							}
							if (this.aString17.length() > 12) {
								this.aString17 = this.aString17.substring(0, 12);
							}
						} else if (this.anInt842 == 1) {
							if (local264 == 8 && this.aString18.length() > 0) {
								this.aString18 = this.aString18.substring(0, this.aString18.length() - 1);
							}
							if (local264 == 9 || local264 == 10 || local264 == 13) {
								this.anInt842 = 0;
							}
							if (local269) {
								this.aString18 = this.aString18 + (char) local264;
							}
							if (this.aString18.length() > 20) {
								this.aString18 = this.aString18.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt1021 == 3) {
				local19 = super.anInt819 / 2;
				local26 = super.anInt820 / 2 + 50;
				@Pc(428) int local428 = local26 + 20;
				if (super.anInt828 == 1 && super.anInt829 >= local19 - 75 && super.anInt829 <= local19 + 75 && super.anInt830 >= local428 - 20 && super.anInt830 <= local428 + 20) {
					this.anInt1021 = 0;
					return;
				}
			}
		} catch (@Pc(461) RuntimeException local461) {
			signlink.reporterror("73754, " + 692 + ", " + local461.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method634() {
		try {
			@Pc(7) byte[] local7 = this.aClass5_1.method66("title.dat", null);
			@Pc(13) Class3_Sub1_Sub1_Sub4 local13 = new Class3_Sub1_Sub1_Sub4(local7, this);
			this.aClass36_18.method391();
			local13.method552(0, 0);
			this.aClass36_19.method391();
			local13.method552(-637, 0);
			this.aClass36_15.method391();
			local13.method552(-128, 0);
			this.aClass36_16.method391();
			local13.method552(-202, -371);
			this.aClass36_17.method391();
			local13.method552(-202, -171);
			this.aClass36_20.method391();
			local13.method552(0, -265);
			this.aClass36_21.method391();
			local13.method552(-562, -265);
			this.aClass36_22.method391();
			local13.method552(-128, -171);
			this.aClass36_23.method391();
			local13.method552(-562, -171);
			@Pc(107) int[] local107 = new int[local13.anInt774];
			for (@Pc(109) int local109 = 0; local109 < local13.anInt775; local109++) {
				for (@Pc(113) int local113 = 0; local113 < local13.anInt774; local113++) {
					local107[local113] = local13.anIntArray204[local13.anInt774 + local13.anInt774 * local109 - local113 - 1];
				}
				for (@Pc(139) int local139 = 0; local139 < local13.anInt774; local139++) {
					local13.anIntArray204[local139 + local13.anInt774 * local109] = local107[local139];
				}
			}
			this.aClass36_18.method391();
			local13.method552(382, 0);
			this.aClass36_19.method391();
			local13.method552(-255, 0);
			this.aClass36_15.method391();
			local13.method552(254, 0);
			this.aClass36_16.method391();
			local13.method552(180, -371);
			this.aClass36_17.method391();
			local13.method552(180, -171);
			this.aClass36_20.method391();
			local13.method552(382, -265);
			this.aClass36_21.method391();
			local13.method552(-180, -265);
			this.aClass36_22.method391();
			local13.method552(254, -171);
			this.aClass36_23.method391();
			local13.method552(-180, -171);
			local13 = new Class3_Sub1_Sub1_Sub4(this.aClass5_1, "logo", 0);
			this.aClass36_15.method391();
			local13.method554(382 - local13.anInt774 / 2 - 128, 18);
			System.gc();
		} catch (@Pc(277) RuntimeException local277) {
			signlink.reporterror("62194, " + -930 + ", " + local277.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method635() {
		try {
			@Pc(3) int local3 = 5;
			this.anIntArray239[8] = 0;
			@Pc(10) int local10 = 0;
			while (this.anIntArray239[8] == 0) {
				@Pc(23) String local23 = "Unknown problem";
				this.method581(aBoolean265, 20, "Connecting to web server");
				try {
					@Pc(45) DataInputStream local45 = this.method708("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 330);
					@Pc(52) Class3_Sub1_Sub3 local52 = new Class3_Sub1_Sub3(0, new byte[40]);
					local45.readFully(local52.aByteArray5, 0, 40);
					local45.close();
					for (@Pc(62) int local62 = 0; local62 < 9; local62++) {
						this.anIntArray239[local62] = local52.method151();
					}
					@Pc(77) int local77 = local52.method151();
					@Pc(79) int local79 = 1234;
					for (@Pc(81) int local81 = 0; local81 < 9; local81++) {
						local79 = (local79 << 1) + this.anIntArray239[local81];
					}
					if (local77 != local79) {
						local23 = "checksum problem";
						this.anIntArray239[8] = 0;
					}
				} catch (@Pc(108) EOFException local108) {
					local23 = "EOF problem";
					this.anIntArray239[8] = 0;
				} catch (@Pc(117) IOException local117) {
					local23 = "connection problem";
					this.anIntArray239[8] = 0;
				} catch (@Pc(126) Exception local126) {
					local23 = "logic problem";
					this.anIntArray239[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray239[8] == 0) {
					local10++;
					for (@Pc(144) int local144 = local3; local144 > 0; local144--) {
						if (local10 >= 10) {
							this.method581(aBoolean265, 10, "Game updated - please reload page");
							local144 = 10;
						} else {
							this.method581(aBoolean265, 10, local23 + " - Will retry in " + local144 + " secs.");
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
					this.aBoolean253 = !this.aBoolean253;
				}
			}
		} catch (@Pc(206) RuntimeException local206) {
			signlink.reporterror("91219, " + 0 + ", " + local206.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class27 local9 = this.aClass27ArrayArrayArray1[this.anInt911][arg0][arg1];
		if (local9 == null) {
			this.aClass25_1.method256(this.anInt911, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class3_Sub1_Sub2_Sub5 local23 = null;
		@Pc(27) Class3_Sub1_Sub2_Sub5 local27;
		for (local27 = (Class3_Sub1_Sub2_Sub5) local9.method305(); local27 != null; local27 = (Class3_Sub1_Sub2_Sub5) local9.method307()) {
			@Pc(32) Class34 local32 = Class34.method361(local27.anInt487);
			@Pc(35) int local35 = local32.anInt472;
			if (local32.aBoolean148) {
				local35 *= local27.anInt486 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method303(local23);
		@Pc(65) Class3_Sub1_Sub2_Sub5 local65 = null;
		@Pc(67) Class3_Sub1_Sub2_Sub5 local67 = null;
		for (local27 = (Class3_Sub1_Sub2_Sub5) local9.method305(); local27 != null; local27 = (Class3_Sub1_Sub2_Sub5) local9.method307()) {
			if (local27.anInt487 != local23.anInt487 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt487 != local23.anInt487 && local27.anInt487 != local65.anInt487 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass25_1.method242(local65, this.anInt911, this.method629(arg1 * 128 + 64, this.anInt911, arg0 * 128 + 64), local110, arg1, local23, local67, arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!WHKCNEXD;II)V")
	private void method637(@OriginalArg(1) int arg0, @OriginalArg(2) Class42 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (this.anInt857 < 400) {
				if (arg1.anIntArray155 != null) {
					arg1 = arg1.method478();
				}
				if (arg1 != null && arg1.aBoolean215) {
					@Pc(23) String local23 = arg1.aString16;
					if (arg1.anInt702 != 0) {
						local23 = local23 + method603(arg1.anInt702, aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt582) + " (level-" + arg1.anInt702 + ")";
					}
					if (this.anInt999 == 1) {
						this.aStringArray9[this.anInt857] = "Use " + this.aString29 + " with @yel@" + local23;
						this.anIntArray267[this.anInt857] = 124;
						this.anIntArray268[this.anInt857] = arg2;
						this.anIntArray265[this.anInt857] = arg0;
						this.anIntArray266[this.anInt857] = arg3;
						this.anInt857++;
					} else if (this.anInt864 != 1) {
						@Pc(167) int local167;
						if (arg1.aStringArray7 != null) {
							for (local167 = 4; local167 >= 0; local167--) {
								if (arg1.aStringArray7[local167] != null && !arg1.aStringArray7[local167].equalsIgnoreCase("attack")) {
									this.aStringArray9[this.anInt857] = arg1.aStringArray7[local167] + " @yel@" + local23;
									if (local167 == 0) {
										this.anIntArray267[this.anInt857] = 17;
									}
									if (local167 == 1) {
										this.anIntArray267[this.anInt857] = 507;
									}
									if (local167 == 2) {
										this.anIntArray267[this.anInt857] = 215;
									}
									if (local167 == 3) {
										this.anIntArray267[this.anInt857] = 919;
									}
									if (local167 == 4) {
										this.anIntArray267[this.anInt857] = 216;
									}
									this.anIntArray268[this.anInt857] = arg2;
									this.anIntArray265[this.anInt857] = arg0;
									this.anIntArray266[this.anInt857] = arg3;
									this.anInt857++;
								}
							}
						}
						if (arg1.aStringArray7 != null) {
							for (local167 = 4; local167 >= 0; local167--) {
								if (arg1.aStringArray7[local167] != null && arg1.aStringArray7[local167].equalsIgnoreCase("attack")) {
									@Pc(291) short local291 = 0;
									if (arg1.anInt702 > aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt582) {
										local291 = 2000;
									}
									this.aStringArray9[this.anInt857] = arg1.aStringArray7[local167] + " @yel@" + local23;
									if (local167 == 0) {
										this.anIntArray267[this.anInt857] = local291 + 17;
									}
									if (local167 == 1) {
										this.anIntArray267[this.anInt857] = local291 + 507;
									}
									if (local167 == 2) {
										this.anIntArray267[this.anInt857] = local291 + 215;
									}
									if (local167 == 3) {
										this.anIntArray267[this.anInt857] = local291 + 919;
									}
									if (local167 == 4) {
										this.anIntArray267[this.anInt857] = local291 + 216;
									}
									this.anIntArray268[this.anInt857] = arg2;
									this.anIntArray265[this.anInt857] = arg0;
									this.anIntArray266[this.anInt857] = arg3;
									this.anInt857++;
								}
							}
						}
						this.aStringArray9[this.anInt857] = "Examine @yel@" + local23;
						this.anIntArray267[this.anInt857] = 1159;
						this.anIntArray268[this.anInt857] = arg2;
						this.anIntArray265[this.anInt857] = arg0;
						this.anIntArray266[this.anInt857] = arg3;
						this.anInt857++;
					} else if ((this.anInt866 & 0x2) == 2) {
						this.aStringArray9[this.anInt857] = this.aString21 + " @yel@" + local23;
						this.anIntArray267[this.anInt857] = 53;
						this.anIntArray268[this.anInt857] = arg2;
						this.anIntArray265[this.anInt857] = arg0;
						this.anIntArray266[this.anInt857] = arg3;
						this.anInt857++;
						return;
					}
				}
			}
		} catch (@Pc(441) RuntimeException local441) {
			signlink.reporterror("21259, " + -797 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local441.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method638() {
		try {
			if (this.anInt999 == 0 && this.anInt864 == 0) {
				this.aStringArray9[this.anInt857] = "Walk here";
				this.anIntArray267[this.anInt857] = 797;
				this.anIntArray265[this.anInt857] = super.anInt823;
				this.anIntArray266[this.anInt857] = super.anInt824;
				this.anInt857++;
			}
			@Pc(41) int local41 = -1;
			for (@Pc(48) int local48 = 0; local48 < Class3_Sub1_Sub2_Sub6.anInt755; local48++) {
				@Pc(54) int local54 = Class3_Sub1_Sub2_Sub6.anIntArray198[local48];
				@Pc(58) int local58 = local54 & 0x7F;
				@Pc(64) int local64 = local54 >> 7 & 0x7F;
				@Pc(70) int local70 = local54 >> 29 & 0x3;
				@Pc(76) int local76 = local54 >> 14 & 0x7FFF;
				if (local54 != local41) {
					local41 = local54;
					@Pc(223) int local223;
					if (local70 == 2 && this.aClass25_1.method265(this.anInt911, local58, local64, local54) >= 0) {
						@Pc(96) Class29 local96 = Class29.method321(local76);
						if (local96.anIntArray85 != null) {
							local96 = local96.method325(228);
						}
						if (local96 == null) {
							continue;
						}
						if (this.anInt999 == 1) {
							this.aStringArray9[this.anInt857] = "Use " + this.aString29 + " with @cya@" + local96.aString5;
							this.anIntArray267[this.anInt857] = 748;
							this.anIntArray268[this.anInt857] = local54;
							this.anIntArray265[this.anInt857] = local58;
							this.anIntArray266[this.anInt857] = local64;
							this.anInt857++;
						} else if (this.anInt864 != 1) {
							if (local96.aStringArray3 != null) {
								for (local223 = 4; local223 >= 0; local223--) {
									if (local96.aStringArray3[local223] != null) {
										this.aStringArray9[this.anInt857] = local96.aStringArray3[local223] + " @cya@" + local96.aString5;
										if (local223 == 0) {
											this.anIntArray267[this.anInt857] = 314;
										}
										if (local223 == 1) {
											this.anIntArray267[this.anInt857] = 217;
										}
										if (local223 == 2) {
											this.anIntArray267[this.anInt857] = 139;
										}
										if (local223 == 3) {
											this.anIntArray267[this.anInt857] = 693;
										}
										if (local223 == 4) {
											this.anIntArray267[this.anInt857] = 1963;
										}
										this.anIntArray268[this.anInt857] = local54;
										this.anIntArray265[this.anInt857] = local58;
										this.anIntArray266[this.anInt857] = local64;
										this.anInt857++;
									}
								}
							}
							this.aStringArray9[this.anInt857] = "Examine @cya@" + local96.aString5;
							this.anIntArray267[this.anInt857] = 1619;
							this.anIntArray268[this.anInt857] = local96.anInt415 << 14;
							this.anIntArray265[this.anInt857] = local58;
							this.anIntArray266[this.anInt857] = local64;
							this.anInt857++;
						} else if ((this.anInt866 & 0x4) == 4) {
							this.aStringArray9[this.anInt857] = this.aString21 + " @cya@" + local96.aString5;
							this.anIntArray267[this.anInt857] = 749;
							this.anIntArray268[this.anInt857] = local54;
							this.anIntArray265[this.anInt857] = local58;
							this.anIntArray266[this.anInt857] = local64;
							this.anInt857++;
						}
					}
					@Pc(403) Class3_Sub1_Sub2_Sub1_Sub1 local403;
					@Pc(451) Class3_Sub1_Sub2_Sub1_Sub2 local451;
					@Pc(441) int local441;
					if (local70 == 1) {
						@Pc(374) Class3_Sub1_Sub2_Sub1_Sub1 local374 = this.aClass3_Sub1_Sub2_Sub1_Sub1Array1[local76];
						if (local374.aClass42_1.aByte18 == 1 && (local374.anInt533 & 0x7F) == 64 && (local374.anInt534 & 0x7F) == 64) {
							for (local223 = 0; local223 < this.anInt902; local223++) {
								local403 = this.aClass3_Sub1_Sub2_Sub1_Sub1Array1[this.anIntArray232[local223]];
								if (local403 != null && local403 != local374 && local403.aClass42_1.aByte18 == 1 && local403.anInt533 == local374.anInt533 && local403.anInt534 == local374.anInt534) {
									this.method637(local58, local403.aClass42_1, this.anIntArray232[local223], local64);
								}
							}
							for (local441 = 0; local441 < this.anInt1018; local441++) {
								local451 = this.aClass3_Sub1_Sub2_Sub1_Sub2Array1[this.anIntArray255[local441]];
								if (local451 != null && local451.anInt533 == local374.anInt533 && local451.anInt534 == local374.anInt534) {
									this.method587(local58, this.anIntArray255[local441], local64, local451);
								}
							}
						}
						this.method637(local58, local374.aClass42_1, local76, local64);
					}
					if (local70 == 0) {
						@Pc(493) Class3_Sub1_Sub2_Sub1_Sub2 local493 = this.aClass3_Sub1_Sub2_Sub1_Sub2Array1[local76];
						if ((local493.anInt533 & 0x7F) == 64 && (local493.anInt534 & 0x7F) == 64) {
							for (local223 = 0; local223 < this.anInt902; local223++) {
								local403 = this.aClass3_Sub1_Sub2_Sub1_Sub1Array1[this.anIntArray232[local223]];
								if (local403 != null && local403.aClass42_1.aByte18 == 1 && local403.anInt533 == local493.anInt533 && local403.anInt534 == local493.anInt534) {
									this.method637(local58, local403.aClass42_1, this.anIntArray232[local223], local64);
								}
							}
							for (local441 = 0; local441 < this.anInt1018; local441++) {
								local451 = this.aClass3_Sub1_Sub2_Sub1_Sub2Array1[this.anIntArray255[local441]];
								if (local451 != null && local451 != local493 && local451.anInt533 == local493.anInt533 && local451.anInt534 == local493.anInt534) {
									this.method587(local58, this.anIntArray255[local441], local64, local451);
								}
							}
						}
						this.method587(local58, local76, local64, local493);
					}
					if (local70 == 3) {
						@Pc(612) Class27 local612 = this.aClass27ArrayArrayArray1[this.anInt911][local58][local64];
						if (local612 != null) {
							for (@Pc(619) Class3_Sub1_Sub2_Sub5 local619 = (Class3_Sub1_Sub2_Sub5) local612.method306(); local619 != null; local619 = (Class3_Sub1_Sub2_Sub5) local612.method308()) {
								@Pc(625) Class34 local625 = Class34.method361(local619.anInt487);
								if (this.anInt999 == 1) {
									this.aStringArray9[this.anInt857] = "Use " + this.aString29 + " with @lre@" + local625.aString6;
									this.anIntArray267[this.anInt857] = 567;
									this.anIntArray268[this.anInt857] = local619.anInt487;
									this.anIntArray265[this.anInt857] = local58;
									this.anIntArray266[this.anInt857] = local64;
									this.anInt857++;
								} else if (this.anInt864 != 1) {
									for (@Pc(742) int local742 = 4; local742 >= 0; local742--) {
										if (local625.aStringArray5 != null && local625.aStringArray5[local742] != null) {
											this.aStringArray9[this.anInt857] = local625.aStringArray5[local742] + " @lre@" + local625.aString6;
											if (local742 == 0) {
												this.anIntArray267[this.anInt857] = 464;
											}
											if (local742 == 1) {
												this.anIntArray267[this.anInt857] = 6;
											}
											if (local742 == 2) {
												this.anIntArray267[this.anInt857] = 263;
											}
											if (local742 == 3) {
												this.anIntArray267[this.anInt857] = 348;
											}
											if (local742 == 4) {
												this.anIntArray267[this.anInt857] = 482;
											}
											this.anIntArray268[this.anInt857] = local619.anInt487;
											this.anIntArray265[this.anInt857] = local58;
											this.anIntArray266[this.anInt857] = local64;
											this.anInt857++;
										} else if (local742 == 2) {
											this.aStringArray9[this.anInt857] = "Take @lre@" + local625.aString6;
											this.anIntArray267[this.anInt857] = 263;
											this.anIntArray268[this.anInt857] = local619.anInt487;
											this.anIntArray265[this.anInt857] = local58;
											this.anIntArray266[this.anInt857] = local64;
											this.anInt857++;
										}
									}
									this.aStringArray9[this.anInt857] = "Examine @lre@" + local625.aString6;
									this.anIntArray267[this.anInt857] = 1334;
									this.anIntArray268[this.anInt857] = local619.anInt487;
									this.anIntArray265[this.anInt857] = local58;
									this.anIntArray266[this.anInt857] = local64;
									this.anInt857++;
								} else if ((this.anInt866 & 0x1) == 1) {
									this.aStringArray9[this.anInt857] = this.aString21 + " @lre@" + local625.aString6;
									this.anIntArray267[this.anInt857] = 862;
									this.anIntArray268[this.anInt857] = local619.anInt487;
									this.anIntArray265[this.anInt857] = local58;
									this.anIntArray266[this.anInt857] = local64;
									this.anInt857++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(949) RuntimeException local949) {
			signlink.reporterror("1040, " + 0 + ", " + local949.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(JI)V")
	private void method639(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt977; local8++) {
					if (this.aLongArray3[local8] == arg0) {
						this.anInt977--;
						this.aBoolean281 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt977; local28++) {
							this.aLongArray3[local28] = this.aLongArray3[local28 + 1];
						}
						this.aClass3_Sub1_Sub3_6.method135(33, this.anInt946);
						this.aClass3_Sub1_Sub3_6.method142(979, arg0);
						break;
					}
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("75476, " + arg0 + ", " + 0 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;IZI)Lclient!BYZSQZUF;")
	private Class5 method640(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(3) byte[] local3 = null;
			@Pc(5) int local5 = 5;
			try {
				if (this.aClass32Array1[0] != null) {
					local3 = this.aClass32Array1[0].method350(this.anInt869, arg4);
				}
			} catch (@Pc(21) Exception local21) {
			}
			@Pc(35) int local35;
			if (local3 != null) {
				this.aCRC32_2.reset();
				this.aCRC32_2.update(local3);
				local35 = (int) this.aCRC32_2.getValue();
				if (local35 != arg3) {
					local3 = null;
				}
			}
			if (local3 != null) {
				return new Class5(-7298, local3);
			}
			local35 = 0;
			while (local3 == null) {
				@Pc(56) String local56 = "Unknown error";
				this.method581(aBoolean265, arg0, "Requesting " + arg2);
				@Pc(71) int local71;
				try {
					local71 = 0;
					@Pc(82) DataInputStream local82 = this.method708(arg1 + arg3);
					@Pc(85) byte[] local85 = new byte[6];
					local82.readFully(local85, 0, 6);
					@Pc(96) Class3_Sub1_Sub3 local96 = new Class3_Sub1_Sub3(0, local85);
					local96.anInt243 = 3;
					@Pc(104) int local104 = local96.method150() + 6;
					@Pc(106) int local106 = 6;
					local3 = new byte[local104];
					for (@Pc(111) int local111 = 0; local111 < 6; local111++) {
						local3[local111] = local85[local111];
					}
					@Pc(129) int local129;
					while (local106 < local104) {
						local129 = local104 - local106;
						if (local129 > 1000) {
							local129 = 1000;
						}
						@Pc(140) int local140 = local82.read(local3, local106, local129);
						if (local140 < 0) {
							(new StringBuffer("Length error: ")).append(local106).append("/").append(local104).toString();
							throw new IOException("EOF");
						}
						local106 += local140;
						@Pc(169) int local169 = local106 * 100 / local104;
						if (local169 != local71) {
							this.method581(aBoolean265, arg0, "Loading " + arg2 + " - " + local169 + "%");
						}
						local71 = local169;
					}
					local82.close();
					try {
						if (this.aClass32Array1[0] != null) {
							this.aClass32Array1[0].method351(arg4, local3.length, local3);
						}
					} catch (@Pc(214) Exception local214) {
						this.aClass32Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local3);
						local129 = (int) this.aCRC32_2.getValue();
						if (local129 != arg3) {
							local3 = null;
							local35++;
							local56 = "Checksum error: " + local129;
						}
					}
				} catch (@Pc(249) IOException local249) {
					if (local56.equals("Unknown error")) {
						local56 = "Connection error";
					}
					local3 = null;
				} catch (@Pc(259) NullPointerException local259) {
					local56 = "Null error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(268) ArrayIndexOutOfBoundsException local268) {
					local56 = "Bounds error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(277) Exception local277) {
					local56 = "Unexpected error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local3 == null) {
					for (local71 = local5; local71 > 0; local71--) {
						if (local35 >= 3) {
							this.method581(aBoolean265, arg0, "Game updated - please reload page");
							local71 = 10;
						} else {
							this.method581(aBoolean265, arg0, local56 + " - Retrying in " + local71);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(321) Exception local321) {
						}
					}
					local5 *= 2;
					if (local5 > 60) {
						local5 = 60;
					}
					this.aBoolean253 = !this.aBoolean253;
				}
			}
			return new Class5(-7298, local3);
		} catch (@Pc(359) RuntimeException local359) {
			signlink.reporterror("28193, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + local359.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method578() {
		try {
			this.aBoolean285 = true;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("9062, " + 0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method641() {
		try {
			@Pc(4) Graphics local4 = this.method579((byte) 2).getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			this.aBoolean251 &= true;
			this.method572();
			@Pc(42) byte local42;
			@Pc(48) int local48;
			if (this.aBoolean264) {
				this.aBoolean263 = false;
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
			if (this.aBoolean274) {
				this.aBoolean263 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean280) {
				this.aBoolean263 = false;
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
			signlink.reporterror("91646, " + true + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean252) {
			this.method702();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method642() {
		try {
			for (@Pc(6) Class3_Sub1_Sub2_Sub4 local6 = (Class3_Sub1_Sub2_Sub4) this.aClass27_11.method305(); local6 != null; local6 = (Class3_Sub1_Sub2_Sub4) this.aClass27_11.method307()) {
				if (local6.anInt343 != this.anInt911 || anInt1054 > local6.anInt351) {
					local6.method535();
				} else if (anInt1054 >= local6.anInt350) {
					if (local6.anInt340 > 0) {
						@Pc(46) Class3_Sub1_Sub2_Sub1_Sub1 local46 = this.aClass3_Sub1_Sub2_Sub1_Sub1Array1[local6.anInt340 - 1];
						if (local46 != null && local46.anInt533 >= 0 && local46.anInt533 < 13312 && local46.anInt534 >= 0 && local46.anInt534 < 13312) {
							local6.method290(local46.anInt533, local46.anInt534, anInt1054, this.method629(local46.anInt534, local6.anInt343, local46.anInt533) - local6.anInt349);
						}
					}
					if (local6.anInt340 < 0) {
						@Pc(91) int local91 = -local6.anInt340 - 1;
						@Pc(97) Class3_Sub1_Sub2_Sub1_Sub2 local97;
						if (local91 == this.anInt961) {
							local97 = aClass3_Sub1_Sub2_Sub1_Sub2_1;
						} else {
							local97 = this.aClass3_Sub1_Sub2_Sub1_Sub2Array1[local91];
						}
						if (local97 != null && local97.anInt533 >= 0 && local97.anInt533 < 13312 && local97.anInt534 >= 0 && local97.anInt534 < 13312) {
							local6.method290(local97.anInt533, local97.anInt534, anInt1054, this.method629(local97.anInt534, local6.anInt343, local97.anInt533) - local6.anInt349);
						}
					}
					local6.method291(this.aBoolean250, this.anInt1052);
					this.aClass25_1.method246((int) local6.aDouble3, -1, 60, (int) local6.aDouble1, local6, this.anInt911, (int) local6.aDouble2, local6.anInt344, false);
				}
			}
		} catch (@Pc(178) RuntimeException local178) {
			signlink.reporterror("44867, " + -74 + ", " + local178.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method643(@OriginalArg(0) int arg0) {
		try {
			signlink.aBoolean289 = false;
			signlink.anInt1069 = 0;
			signlink.midi = "stop";
			if (arg0 != -13016) {
				this.anInt901 = this.aClass46_2.method499();
			}
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("78696, " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method644() {
		try {
			for (@Pc(7) int local7 = -1; local7 < this.anInt1018; local7++) {
				@Pc(15) int local15;
				if (local7 == -1) {
					local15 = this.anInt1017;
				} else {
					local15 = this.anIntArray255[local7];
				}
				@Pc(27) Class3_Sub1_Sub2_Sub1_Sub2 local27 = this.aClass3_Sub1_Sub2_Sub1_Sub2Array1[local15];
				if (local27 != null) {
					this.method687(local27, 1);
				}
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("79413, " + 53 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IILclient!IMUIZRAF;)V")
	private void method645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub3 arg2) {
		try {
			this.anInt998 = 0;
			this.anInt1019 = 0;
			@Pc(11) boolean local11 = false;
			this.method648(arg2, arg1);
			this.method680(arg2, arg1);
			this.method698(arg2, arg1, this.anInt885);
			this.method605(811, arg2, arg1);
			@Pc(41) int local41;
			for (@Pc(34) int local34 = 0; local34 < this.anInt998; local34++) {
				local41 = this.anIntArray253[local34];
				if (this.aClass3_Sub1_Sub2_Sub1_Sub2Array1[local41].anInt560 != anInt1054) {
					this.aClass3_Sub1_Sub2_Sub1_Sub2Array1[local41] = null;
				}
			}
			if (arg2.anInt243 != arg1) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.anInt243 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local41 = 0; local41 < this.anInt1018; local41++) {
				if (this.aClass3_Sub1_Sub2_Sub1_Sub2Array1[this.anIntArray255[local41]] == null) {
					signlink.reporterror(this.aString17 + " null entry in pl list - pos:" + local41 + " size:" + this.anInt1018);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("1476, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method646(@OriginalArg(0) int arg0) {
		try {
			signlink.anInt1071 = arg0;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("97836, " + arg0 + ", " + 6 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method647() {
		try {
			if (this.anInt857 >= 2 || this.anInt999 != 0 || this.anInt864 != 0) {
				@Pc(37) String local37;
				if (this.anInt999 == 1 && this.anInt857 < 2) {
					local37 = "Use " + this.aString29 + " with...";
				} else if (this.anInt864 == 1 && this.anInt857 < 2) {
					local37 = this.aString21 + "...";
				} else {
					local37 = this.aStringArray9[this.anInt857 - 1];
				}
				if (this.anInt857 > 2) {
					local37 = local37 + "@whi@ / " + (this.anInt857 - 2) + " more options";
				}
				this.aClass3_Sub1_Sub1_Sub2_4.method94(15, 4, local37, 16777215, anInt1054 / 1000);
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("94299, " + -9516 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!IMUIZRAF;IB)V")
	private void method648(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			arg0.method156((byte) 7);
			@Pc(7) int local7 = arg0.method157(1);
			if (local7 != 0) {
				@Pc(15) int local15 = arg0.method157(2);
				if (local15 == 0) {
					this.anIntArray256[this.anInt1019++] = this.anInt1017;
				} else {
					@Pc(49) int local49;
					@Pc(59) int local59;
					if (local15 == 1) {
						local49 = arg0.method157(3);
						aClass3_Sub1_Sub2_Sub1_Sub2_1.method386(false, local49);
						local59 = arg0.method157(1);
						if (local59 == 1) {
							this.anIntArray256[this.anInt1019++] = this.anInt1017;
						}
					} else {
						@Pc(103) int local103;
						if (local15 == 2) {
							local49 = arg0.method157(3);
							aClass3_Sub1_Sub2_Sub1_Sub2_1.method386(true, local49);
							local59 = arg0.method157(3);
							aClass3_Sub1_Sub2_Sub1_Sub2_1.method386(true, local59);
							local103 = arg0.method157(1);
							if (local103 == 1) {
								this.anIntArray256[this.anInt1019++] = this.anInt1017;
							}
						} else if (local15 == 3) {
							local49 = arg0.method157(7);
							this.anInt911 = arg0.method157(2);
							local59 = arg0.method157(1);
							local103 = arg0.method157(7);
							@Pc(148) int local148 = arg0.method157(1);
							if (local148 == 1) {
								this.anIntArray256[this.anInt1019++] = this.anInt1017;
							}
							aClass3_Sub1_Sub2_Sub1_Sub2_1.method385(local103, local59 == 1, local49);
						}
					}
				}
			}
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("59400, " + arg0 + ", " + arg1 + ", " + -115 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method650() {
		try {
			@Pc(6) Class3_Sub1_Sub2_Sub2 local6 = (Class3_Sub1_Sub2_Sub2) this.aClass27_12.method305();
			this.aBoolean251 &= true;
			while (local6 != null) {
				if (local6.anInt154 != this.anInt911 || local6.aBoolean53) {
					local6.method535();
				} else if (anInt1054 >= local6.anInt158) {
					local6.method110(this.anInt1052);
					if (local6.aBoolean53) {
						local6.method535();
					} else {
						this.aClass25_1.method246(local6.anInt157, -1, 60, local6.anInt155, local6, local6.anInt154, local6.anInt156, 0, false);
					}
				}
				local6 = (Class3_Sub1_Sub2_Sub2) this.aClass27_12.method307();
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("80737, " + true + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method651() {
		try {
			if (this.anInt1041 > 1) {
				this.anInt1041--;
			}
			if (this.anInt1013 > 0) {
				this.anInt1013--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method665(); local22++) {
			}
			if (this.aBoolean251) {
				@Pc(41) Object local41 = this.aClass45_1.anObject1;
				@Pc(67) int local67;
				@Pc(69) int local69;
				@Pc(71) int local71;
				@Pc(104) int local104;
				synchronized (this.aClass45_1.anObject1) {
					if (!aBoolean245) {
						this.aClass45_1.anInt726 = 0;
					} else if (super.anInt828 != 0 || this.aClass45_1.anInt726 >= 40) {
						this.aClass3_Sub1_Sub3_6.method135(42, this.anInt946);
						this.aClass3_Sub1_Sub3_6.method136(0);
						local67 = this.aClass3_Sub1_Sub3_6.anInt243;
						local69 = 0;
						@Pc(87) int local87;
						for (local71 = 0; local71 < this.aClass45_1.anInt726 && local67 - this.aClass3_Sub1_Sub3_6.anInt243 < 240; local71++) {
							local69++;
							local87 = this.aClass45_1.anIntArray158[local71];
							if (local87 < 0) {
								local87 = 0;
							} else if (local87 > 502) {
								local87 = 502;
							}
							local104 = this.aClass45_1.anIntArray159[local71];
							if (local104 < 0) {
								local104 = 0;
							} else if (local104 > 764) {
								local104 = 764;
							}
							@Pc(121) int local121 = local87 * 765 + local104;
							if (this.aClass45_1.anIntArray158[local71] == -1 && this.aClass45_1.anIntArray159[local71] == -1) {
								local104 = -1;
								local87 = -1;
								local121 = 524287;
							}
							if (local104 != this.anInt956 || local87 != this.anInt957) {
								@Pc(166) int local166 = local104 - this.anInt956;
								this.anInt956 = local104;
								@Pc(174) int local174 = local87 - this.anInt957;
								this.anInt957 = local87;
								if (this.anInt932 < 8 && local166 >= -32 && local166 <= 31 && local174 >= -32 && local174 <= 31) {
									local166 += 32;
									local174 += 32;
									this.aClass3_Sub1_Sub3_6.method137((this.anInt932 << 12) + (local166 << 6) + local174);
									this.anInt932 = 0;
								} else if (this.anInt932 < 8) {
									this.aClass3_Sub1_Sub3_6.method139((this.anInt932 << 19) + local121 + 8388608);
									this.anInt932 = 0;
								} else {
									this.aClass3_Sub1_Sub3_6.method140((this.anInt932 << 19) + local121 - 1073741824);
									this.anInt932 = 0;
								}
							} else if (this.anInt932 < 2047) {
								this.anInt932++;
							}
						}
						this.aClass3_Sub1_Sub3_6.method145(this.anInt853, this.aClass3_Sub1_Sub3_6.anInt243 - local67);
						if (local69 >= this.aClass45_1.anInt726) {
							this.aClass45_1.anInt726 = 0;
						} else {
							this.aClass45_1.anInt726 -= local69;
							for (local87 = 0; local87 < this.aClass45_1.anInt726; local87++) {
								this.aClass45_1.anIntArray159[local87] = this.aClass45_1.anIntArray159[local87 + local69];
								this.aClass45_1.anIntArray158[local87] = this.aClass45_1.anIntArray158[local87 + local69];
							}
						}
					}
				}
				if (super.anInt828 != 0) {
					@Pc(338) long local338 = (super.aLong28 - this.aLong30) / 50L;
					if (local338 > 4095L) {
						local338 = 4095L;
					}
					this.aLong30 = super.aLong28;
					local67 = super.anInt830;
					if (local67 < 0) {
						local67 = 0;
					} else if (local67 > 502) {
						local67 = 502;
					}
					local69 = super.anInt829;
					if (local69 < 0) {
						local69 = 0;
					} else if (local69 > 764) {
						local69 = 764;
					}
					local71 = local67 * 765 + local69;
					@Pc(384) byte local384 = 0;
					if (super.anInt828 == 2) {
						local384 = 1;
					}
					local104 = (int) local338;
					this.aClass3_Sub1_Sub3_6.method135(185, this.anInt946);
					this.aClass3_Sub1_Sub3_6.method140((local104 << 20) + (local384 << 19) + local71);
				}
				if (this.anInt995 > 0) {
					this.anInt995--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean269 = true;
				}
				if (this.aBoolean269 && this.anInt995 <= 0) {
					this.anInt995 = 20;
					this.aBoolean269 = false;
					this.aClass3_Sub1_Sub3_6.method135(29, this.anInt946);
					this.aClass3_Sub1_Sub3_6.method172(this.anInt966);
					this.aClass3_Sub1_Sub3_6.method137(this.anInt965);
				}
				if (super.aBoolean243 && !this.aBoolean272) {
					this.aBoolean272 = true;
					this.aClass3_Sub1_Sub3_6.method135(239, this.anInt946);
					this.aClass3_Sub1_Sub3_6.method136(1);
				}
				if (!super.aBoolean243 && this.aBoolean272) {
					this.aBoolean272 = false;
					this.aClass3_Sub1_Sub3_6.method135(239, this.anInt946);
					this.aClass3_Sub1_Sub3_6.method136(0);
				}
				this.method606(this.anInt855);
				this.method700(this.aBoolean254);
				this.method695();
				anInt916++;
				if (anInt916 > 120) {
					anInt916 = 0;
					this.aClass3_Sub1_Sub3_6.method135(24, this.anInt946);
					this.aClass3_Sub1_Sub3_6.method137(20610);
				}
				this.anInt1011++;
				if (this.anInt1011 > 750) {
					this.method610();
				}
				this.method644();
				this.method686();
				this.method631();
				anInt964++;
				@Pc(593) int local593;
				if (anInt964 > 1891) {
					anInt964 = 0;
					this.aClass3_Sub1_Sub3_6.method135(226, this.anInt946);
					this.aClass3_Sub1_Sub3_6.method136(0);
					local593 = this.aClass3_Sub1_Sub3_6.anInt243;
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass3_Sub1_Sub3_6.method136(173);
					}
					this.aClass3_Sub1_Sub3_6.method137(47741);
					this.aClass3_Sub1_Sub3_6.method137(19406);
					this.aClass3_Sub1_Sub3_6.method136((int) (Math.random() * 256.0D));
					this.aClass3_Sub1_Sub3_6.method136(255);
					this.aClass3_Sub1_Sub3_6.method137(61428);
					this.aClass3_Sub1_Sub3_6.method137(35709);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass3_Sub1_Sub3_6.method136(79);
					}
					this.aClass3_Sub1_Sub3_6.method137(26314);
					this.aClass3_Sub1_Sub3_6.method137((int) (Math.random() * 65536.0D));
					this.aClass3_Sub1_Sub3_6.method145(this.anInt853, this.aClass3_Sub1_Sub3_6.anInt243 - local593);
				}
				this.anInt1052++;
				if (this.anInt894 != 0) {
					this.anInt893 += 20;
					if (this.anInt893 >= 400) {
						this.anInt894 = 0;
					}
				}
				if (this.anInt838 != 0) {
					this.anInt835++;
					if (this.anInt835 >= 15) {
						if (this.anInt838 == 2) {
							this.aBoolean281 = true;
						}
						if (this.anInt838 == 3) {
							this.aBoolean249 = true;
						}
						this.anInt838 = 0;
					}
				}
				if (this.anInt980 != 0) {
					this.anInt1030++;
					if (super.anInt823 > this.anInt981 + 5 || super.anInt823 < this.anInt981 - 5 || super.anInt824 > this.anInt982 + 5 || super.anInt824 < this.anInt982 - 5) {
						this.aBoolean273 = true;
					}
					if (super.anInt822 == 0) {
						if (this.anInt980 == 2) {
							this.aBoolean281 = true;
						}
						if (this.anInt980 == 3) {
							this.aBoolean249 = true;
						}
						this.anInt980 = 0;
						if (this.aBoolean273 && this.anInt1030 >= 5) {
							this.anInt1040 = -1;
							this.method709();
							if (this.anInt1040 == this.anInt978 && this.anInt1039 != this.anInt979) {
								@Pc(799) Class35 local799 = Class35.aClass35Array1[this.anInt978];
								@Pc(801) byte local801 = 0;
								if (this.anInt878 == 1 && local799.anInt513 == 206) {
									local801 = 1;
								}
								if (local799.anIntArray109[this.anInt1039] <= 0) {
									local801 = 0;
								}
								if (local799.aBoolean166) {
									local67 = this.anInt979;
									local69 = this.anInt1039;
									local799.anIntArray109[local69] = local799.anIntArray109[local67];
									local799.anIntArray104[local69] = local799.anIntArray104[local67];
									local799.anIntArray109[local67] = -1;
									local799.anIntArray104[local67] = 0;
								} else if (local801 == 1) {
									local67 = this.anInt979;
									local69 = this.anInt1039;
									while (local67 != local69) {
										if (local67 > local69) {
											local799.method374(local67, local67 - 1);
											local67--;
										} else if (local67 < local69) {
											local799.method374(local67, local67 + 1);
											local67++;
										}
									}
								} else {
									local799.method374(this.anInt979, this.anInt1039);
								}
								this.aClass3_Sub1_Sub3_6.method135(3, this.anInt946);
								this.aClass3_Sub1_Sub3_6.method171(this.anInt943, this.anInt978);
								this.aClass3_Sub1_Sub3_6.method172(this.anInt979);
								this.aClass3_Sub1_Sub3_6.method171(this.anInt943, this.anInt1039);
								this.aClass3_Sub1_Sub3_6.method163(local801);
							}
						} else if ((this.anInt940 == 1 || this.method664(this.anInt857 - 1)) && this.anInt857 > 2) {
							this.method615();
						} else if (this.anInt857 > 0) {
							this.method658(this.anInt857 - 1);
						}
						this.anInt835 = 10;
						super.anInt828 = 0;
					}
				}
				@Pc(980) int local980;
				if (Class25.anInt325 != -1) {
					local593 = Class25.anInt325;
					local980 = Class25.anInt326;
					@Pc(1001) boolean local1001 = this.method624(0, aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0], aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0], 0, true, 0, local980, local593, 0, 0, 0);
					Class25.anInt325 = -1;
					if (local1001) {
						this.anInt891 = super.anInt829;
						this.anInt892 = super.anInt830;
						this.anInt894 = 1;
						this.anInt893 = 0;
					}
				}
				if (super.anInt828 == 1 && this.aString22 != null) {
					this.aString22 = null;
					this.aBoolean249 = true;
					super.anInt828 = 0;
				}
				this.method679();
				this.method697();
				this.method712(this.anInt944);
				this.method618();
				if (super.anInt822 == 1 || super.anInt828 == 1) {
					this.anInt1043++;
				}
				if (this.anInt870 == 2) {
					this.method682();
				}
				if (this.anInt870 == 2 && this.aBoolean284) {
					this.method676();
				}
				for (local593 = 0; local593 < 5; local593++) {
					@Pc(1088) int local1088 = this.anIntArray234[local593]++;
				}
				this.method683(this.aBoolean244);
				anInt844++;
				if (anInt844 > 97) {
					anInt844 = 0;
					this.aClass3_Sub1_Sub3_6.method135(207, this.anInt946);
				}
				super.anInt821++;
				if (super.anInt821 > 4500) {
					this.anInt1013 = 250;
					super.anInt821 -= 500;
					this.aClass3_Sub1_Sub3_6.method135(41, this.anInt946);
				}
				this.anInt839++;
				if (this.anInt839 > 500) {
					this.anInt839 = 0;
					local980 = (int) (Math.random() * 8.0D);
					if ((local980 & 0x1) == 1) {
						this.anInt1014 += this.anInt1015;
					}
					if ((local980 & 0x2) == 2) {
						this.anInt909 += this.anInt910;
					}
					if ((local980 & 0x4) == 4) {
						this.anInt1047 += this.anInt1048;
					}
				}
				if (this.anInt1014 < -50) {
					this.anInt1015 = 2;
				}
				if (this.anInt1014 > 50) {
					this.anInt1015 = -2;
				}
				if (this.anInt909 < -55) {
					this.anInt910 = 2;
				}
				if (this.anInt909 > 55) {
					this.anInt910 = -2;
				}
				if (this.anInt1047 < -40) {
					this.anInt1048 = 1;
				}
				if (this.anInt1047 > 40) {
					this.anInt1048 = -1;
				}
				this.anInt1055++;
				if (this.anInt1055 > 500) {
					this.anInt1055 = 0;
					local980 = (int) (Math.random() * 8.0D);
					if ((local980 & 0x1) == 1) {
						this.anInt914 += this.anInt915;
					}
					if ((local980 & 0x2) == 2) {
						this.anInt903 += this.anInt904;
					}
				}
				if (this.anInt914 < -60) {
					this.anInt915 = 2;
				}
				if (this.anInt914 > 60) {
					this.anInt915 = -2;
				}
				if (this.anInt903 < -20) {
					this.anInt904 = 1;
				}
				if (this.anInt903 > 10) {
					this.anInt904 = -1;
				}
				this.anInt1012++;
				if (this.anInt1012 > 50) {
					this.aClass3_Sub1_Sub3_6.method135(184, this.anInt946);
				}
				try {
					if (this.aClass16_1 != null && this.aClass3_Sub1_Sub3_6.anInt243 > 0) {
						this.aClass16_1.method130(this.aClass3_Sub1_Sub3_6.aByteArray5, this.aClass3_Sub1_Sub3_6.anInt243);
						this.aClass3_Sub1_Sub3_6.anInt243 = 0;
						this.anInt1012 = 0;
					}
				} catch (@Pc(1356) IOException local1356) {
					this.method610();
				} catch (@Pc(1361) Exception local1361) {
					this.method707();
				}
			}
		} catch (@Pc(1366) RuntimeException local1366) {
			signlink.reporterror("79329, " + 0 + ", " + local1366.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method652(@OriginalArg(0) byte arg0) {
		try {
			if (this.aClass36_27 == null) {
				this.method710(this.anInt970);
				super.aClass36_2 = null;
				this.aClass36_15 = null;
				this.aClass36_16 = null;
				this.aClass36_17 = null;
				this.aClass36_18 = null;
				this.aClass36_19 = null;
				this.aClass36_20 = null;
				this.aClass36_21 = null;
				this.aClass36_22 = null;
				this.aClass36_23 = null;
				this.aClass36_27 = new Class36(96, 13856, 479, this.method579((byte) 2));
				this.aClass36_25 = new Class36(156, 13856, 172, this.method579((byte) 2));
				Class3_Sub1_Sub1.method540();
				this.aClass3_Sub1_Sub1_Sub1_14.method44(0, 0);
				this.aClass36_24 = new Class36(261, 13856, 190, this.method579((byte) 2));
				this.aClass36_26 = new Class36(334, 13856, 512, this.method579((byte) 2));
				Class3_Sub1_Sub1.method540();
				this.aClass36_3 = new Class36(50, 13856, 496, this.method579((byte) 2));
				this.aClass36_4 = new Class36(37, 13856, 269, this.method579((byte) 2));
				if (arg0 == this.aByte23) {
					@Pc(119) boolean local119 = false;
				} else {
					anInt883 = this.aClass46_2.method499();
				}
				this.aClass36_5 = new Class36(45, 13856, 249, this.method579((byte) 2));
				this.aBoolean285 = true;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("92307, " + arg0 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method653(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString19 = "";
				this.aString20 = "Connecting to server...";
				this.method672(true, 887);
			}
			this.aClass16_1 = new Class16(true, this.method654(anInt913 + 43594), this);
			@Pc(30) long local30 = Class23.method226(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass3_Sub1_Sub3_6.anInt243 = 0;
			this.aClass3_Sub1_Sub3_6.method136(14);
			this.aClass3_Sub1_Sub3_6.method136(local37);
			this.aClass16_1.method130(this.aClass3_Sub1_Sub3_6.aByteArray5, 2);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass16_1.method127();
			}
			@Pc(74) int local74 = this.aClass16_1.method127();
			@Pc(76) int local76 = local74;
			@Pc(225) int local225;
			@Pc(259) int local259;
			if (local74 == 0) {
				this.aClass16_1.method129(this.aClass3_Sub1_Sub3_7.aByteArray5, 0, 8);
				this.aClass3_Sub1_Sub3_7.anInt243 = 0;
				this.aLong31 = this.aClass3_Sub1_Sub3_7.method152();
				@Pc(99) int[] local99 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong31 >> 32), (int) this.aLong31 };
				this.aClass3_Sub1_Sub3_6.anInt243 = 0;
				this.aClass3_Sub1_Sub3_6.method136(10);
				this.aClass3_Sub1_Sub3_6.method140(local99[0]);
				this.aClass3_Sub1_Sub3_6.method140(local99[1]);
				this.aClass3_Sub1_Sub3_6.method140(local99[2]);
				this.aClass3_Sub1_Sub3_6.method140(local99[3]);
				this.aClass3_Sub1_Sub3_6.method140(signlink.anInt1063);
				this.aClass3_Sub1_Sub3_6.method143(arg0);
				this.aClass3_Sub1_Sub3_6.method143(arg1);
				this.aClass3_Sub1_Sub3_6.method161(aBigInteger2, aBigInteger1);
				this.aClass3_Sub1_Sub3_9.anInt243 = 0;
				if (arg2) {
					this.aClass3_Sub1_Sub3_9.method136(18);
				} else {
					this.aClass3_Sub1_Sub3_9.method136(16);
				}
				this.aClass3_Sub1_Sub3_9.method136(this.aClass3_Sub1_Sub3_6.anInt243 + 36 + 1 + 1 + 2);
				this.aClass3_Sub1_Sub3_9.method136(255);
				this.aClass3_Sub1_Sub3_9.method137(330);
				this.aClass3_Sub1_Sub3_9.method136(aBoolean258 ? 1 : 0);
				for (local225 = 0; local225 < 9; local225++) {
					this.aClass3_Sub1_Sub3_9.method140(this.anIntArray239[local225]);
				}
				this.aClass3_Sub1_Sub3_9.method144(this.aClass3_Sub1_Sub3_6.aByteArray5, this.aClass3_Sub1_Sub3_6.anInt243);
				this.aClass3_Sub1_Sub3_6.aClass46_1 = new Class46(local99, (byte) -48);
				for (local259 = 0; local259 < 4; local259++) {
					local99[local259] += 50;
				}
				this.aClass46_2 = new Class46(local99, (byte) -48);
				this.aClass16_1.method130(this.aClass3_Sub1_Sub3_9.aByteArray5, this.aClass3_Sub1_Sub3_9.anInt243);
				local74 = this.aClass16_1.method127();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(301) Exception local301) {
				}
				this.method653(arg0, arg1, arg2);
			} else {
				@Pc(389) int local389;
				if (local74 == 2) {
					this.anInt876 = this.aClass16_1.method127();
					aBoolean245 = this.aClass16_1.method127() == 1;
					this.aLong30 = 0L;
					this.anInt932 = 0;
					this.aClass45_1.anInt726 = 0;
					super.aBoolean243 = true;
					this.aBoolean272 = true;
					this.aBoolean251 = true;
					this.aClass3_Sub1_Sub3_6.anInt243 = 0;
					this.aClass3_Sub1_Sub3_7.anInt243 = 0;
					this.anInt1010 = -1;
					this.anInt934 = -1;
					this.anInt935 = -1;
					this.anInt936 = -1;
					this.anInt1009 = 0;
					this.anInt1011 = 0;
					this.anInt1041 = 0;
					this.anInt1013 = 0;
					this.anInt928 = 0;
					this.anInt857 = 0;
					this.aBoolean271 = false;
					super.anInt821 = 0;
					for (local389 = 0; local389 < 100; local389++) {
						this.aStringArray11[local389] = null;
					}
					this.anInt999 = 0;
					this.anInt864 = 0;
					this.anInt870 = 0;
					this.anInt907 = 0;
					this.anInt1014 = (int) (Math.random() * 100.0D) - 50;
					this.anInt909 = (int) (Math.random() * 110.0D) - 55;
					this.anInt1047 = (int) (Math.random() * 80.0D) - 40;
					this.anInt914 = (int) (Math.random() * 120.0D) - 60;
					this.anInt903 = (int) (Math.random() * 30.0D) - 20;
					this.anInt966 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt942 = 0;
					this.anInt972 = -1;
					this.anInt996 = 0;
					this.anInt997 = 0;
					this.anInt1018 = 0;
					this.anInt902 = 0;
					for (local225 = 0; local225 < this.anInt1016; local225++) {
						this.aClass3_Sub1_Sub2_Sub1_Sub2Array1[local225] = null;
						this.aClass3_Sub1_Sub3Array1[local225] = null;
					}
					for (local259 = 0; local259 < 16384; local259++) {
						this.aClass3_Sub1_Sub2_Sub1_Sub1Array1[local259] = null;
					}
					aClass3_Sub1_Sub2_Sub1_Sub2_1 = this.aClass3_Sub1_Sub2_Sub1_Sub2Array1[this.anInt1017] = new Class3_Sub1_Sub2_Sub1_Sub2();
					this.aClass27_11.method309();
					this.aClass27_12.method309();
					@Pc(534) int local534;
					@Pc(538) int local538;
					for (@Pc(530) int local530 = 0; local530 < 4; local530++) {
						for (local534 = 0; local534 < 104; local534++) {
							for (local538 = 0; local538 < 104; local538++) {
								this.aClass27ArrayArrayArray1[local530][local534][local538] = null;
							}
						}
					}
					this.aClass27_10 = new Class27(false);
					this.anInt1038 = 0;
					this.anInt1037 = 0;
					this.anInt988 = -1;
					this.anInt867 = -1;
					this.anInt888 = -1;
					this.anInt958 = -1;
					this.anInt954 = -1;
					this.aBoolean255 = false;
					this.anInt1044 = 3;
					this.anInt1006 = 0;
					this.aBoolean271 = false;
					this.aBoolean267 = false;
					this.aString22 = null;
					this.anInt1045 = 0;
					this.anInt955 = -1;
					this.aBoolean256 = true;
					this.method715();
					for (local534 = 0; local534 < 5; local534++) {
						this.anIntArray238[local534] = 0;
					}
					for (local538 = 0; local538 < 5; local538++) {
						this.aStringArray13[local538] = null;
						this.aBooleanArray12[local538] = false;
					}
					anInt852 = 0;
					anInt841 = 0;
					anInt937 = 0;
					anInt973 = 0;
					anInt890 = 0;
					anInt962 = 0;
					anInt1053 = 0;
					anInt847 = 0;
					this.method652(this.aByte24);
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
					this.aBoolean251 = true;
					this.aClass3_Sub1_Sub3_6.anInt243 = 0;
					this.aClass3_Sub1_Sub3_7.anInt243 = 0;
					this.anInt1010 = -1;
					this.anInt934 = -1;
					this.anInt935 = -1;
					this.anInt936 = -1;
					this.anInt1009 = 0;
					this.anInt1011 = 0;
					this.anInt1041 = 0;
					this.anInt857 = 0;
					this.aBoolean271 = false;
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
					local389 = this.aClass16_1.method127();
					for (@Pc(877) int local877 = local389 + 3; local877 >= 0; local877--) {
						this.aString19 = "You have only just left another world";
						this.aString20 = "Your profile will be transferred in: " + local877;
						this.method672(true, 887);
						try {
							Thread.sleep(1200L);
						} catch (@Pc(899) Exception local899) {
						}
					}
					this.method653(arg0, arg1, arg2);
				} else if (local74 != -1) {
					System.out.println("response:" + local74);
					this.aString19 = "Unexpected server response";
					this.aString20 = "Please try using a different world.";
				} else if (local76 != 0) {
					this.aString19 = "No response from server";
					this.aString20 = "Please try using a different world.";
				} else if (this.anInt938 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(921) Exception local921) {
					}
					this.anInt938++;
					this.method653(arg0, arg1, arg2);
				} else {
					this.aString19 = "No response from loginserver";
					this.aString20 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(964) IOException local964) {
			this.aString19 = "";
			this.aString20 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method576(@OriginalArg(0) int arg0) {
		try {
			signlink.reporterror = false;
			try {
				if (this.aClass16_1 != null) {
					this.aClass16_1.method126();
				}
			} catch (@Pc(11) Exception local11) {
			}
			this.aClass16_1 = null;
			this.method643(this.anInt952);
			if (this.aClass45_1 != null) {
				this.aClass45_1.aBoolean219 = false;
			}
			this.aClass45_1 = null;
			this.aClass19_Sub1_1.method407();
			this.aClass19_Sub1_1 = null;
			this.aClass3_Sub1_Sub3_8 = null;
			this.aClass3_Sub1_Sub3_6 = null;
			this.aClass3_Sub1_Sub3_9 = null;
			this.aClass3_Sub1_Sub3_7 = null;
			this.anIntArray262 = null;
			this.aByteArrayArray4 = null;
			this.aByteArrayArray5 = null;
			this.anIntArray263 = null;
			this.anIntArray264 = null;
			this.anIntArrayArrayArray7 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass25_1 = null;
			this.aClass44Array1 = null;
			this.anIntArrayArray25 = null;
			this.anIntArrayArray24 = null;
			this.anIntArray242 = null;
			this.anIntArray243 = null;
			this.aByteArray21 = null;
			this.aClass36_24 = null;
			this.aClass36_25 = null;
			this.aClass36_26 = null;
			this.aClass36_27 = null;
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
			this.aClass36_13 = null;
			this.aClass36_14 = null;
			this.aClass3_Sub1_Sub1_Sub1_13 = null;
			this.aClass3_Sub1_Sub1_Sub1_14 = null;
			this.aClass3_Sub1_Sub1_Sub1_15 = null;
			this.aClass3_Sub1_Sub1_Sub1_5 = null;
			this.aClass3_Sub1_Sub1_Sub1_6 = null;
			this.aClass3_Sub1_Sub1_Sub1_7 = null;
			this.aClass3_Sub1_Sub1_Sub1Array2 = null;
			this.aClass3_Sub1_Sub1_Sub1_8 = null;
			this.aClass3_Sub1_Sub1_Sub1_9 = null;
			this.aClass3_Sub1_Sub1_Sub1_10 = null;
			this.aClass3_Sub1_Sub1_Sub1_11 = null;
			this.aClass3_Sub1_Sub1_Sub1_12 = null;
			this.aClass3_Sub1_Sub1_Sub1_16 = null;
			this.aClass3_Sub1_Sub1_Sub1_17 = null;
			this.aClass3_Sub1_Sub1_Sub1_18 = null;
			this.aClass3_Sub1_Sub1_Sub1_19 = null;
			this.aClass3_Sub1_Sub1_Sub1_20 = null;
			this.aClass3_Sub1_Sub1_Sub4_8 = null;
			this.aClass3_Sub1_Sub1_Sub4Array5 = null;
			this.aClass3_Sub1_Sub1_Sub4Array4 = null;
			this.aClass3_Sub1_Sub1_Sub4Array8 = null;
			this.aClass3_Sub1_Sub1_Sub4_3 = null;
			this.aClass3_Sub1_Sub1_Sub4_4 = null;
			@Pc(209) boolean local209 = false;
			this.aClass3_Sub1_Sub1_Sub4_5 = null;
			this.aClass3_Sub1_Sub1_Sub4_6 = null;
			this.aClass3_Sub1_Sub1_Sub4_7 = null;
			this.aClass3_Sub1_Sub1_Sub1Array5 = null;
			this.aClass3_Sub1_Sub1_Sub4Array7 = null;
			this.anIntArrayArray23 = null;
			this.aClass3_Sub1_Sub2_Sub1_Sub2Array1 = null;
			this.anIntArray255 = null;
			this.anIntArray256 = null;
			this.aClass3_Sub1_Sub3Array1 = null;
			this.anIntArray253 = null;
			this.aClass3_Sub1_Sub2_Sub1_Sub1Array1 = null;
			this.anIntArray232 = null;
			this.aClass27ArrayArrayArray1 = null;
			this.aClass27_10 = null;
			this.aClass27_11 = null;
			this.aClass27_12 = null;
			this.anIntArray265 = null;
			this.anIntArray266 = null;
			this.anIntArray267 = null;
			this.anIntArray268 = null;
			this.aStringArray9 = null;
			this.anIntArray224 = null;
			this.anIntArray226 = null;
			this.anIntArray227 = null;
			this.aClass3_Sub1_Sub1_Sub4Array6 = null;
			this.aClass3_Sub1_Sub1_Sub4_11 = null;
			this.aStringArray12 = null;
			this.aLongArray4 = null;
			this.anIntArray257 = null;
			this.aClass36_18 = null;
			this.aClass36_19 = null;
			this.aClass36_15 = null;
			this.aClass36_16 = null;
			this.aClass36_17 = null;
			this.aClass36_20 = null;
			this.aClass36_21 = null;
			this.aClass36_22 = null;
			this.aClass36_23 = null;
			this.method710(this.anInt970);
			Class29.method322();
			Class42.method476(285);
			Class34.method362();
			Class12.aClass12Array1 = null;
			Class4.aClass4Array1 = null;
			Class35.aClass35Array1 = null;
			Class14.aClass14Array1 = null;
			Class49.aClass49Array1 = null;
			Class7.aClass7Array1 = null;
			Class7.aClass43_1 = null;
			Class38.aClass38Array1 = null;
			super.aClass36_2 = null;
			Class3_Sub1_Sub2_Sub1_Sub2.aClass43_8 = null;
			Class3_Sub1_Sub1_Sub3.method446();
			Class25.method234();
			Class3_Sub1_Sub2_Sub6.method506();
			Class15.method123(285);
			System.gc();
		} catch (@Pc(373) RuntimeException local373) {
			signlink.reporterror("34618, " + arg0 + ", " + local373.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)Ljava/net/Socket;")
	public Socket method654(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method655(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(13) int local13 = 0; local13 < this.anInt1037; local13++) {
					if (this.aLongArray4[local13] == arg0) {
						this.anInt1037--;
						this.aBoolean281 = true;
						for (@Pc(33) int local33 = local13; local33 < this.anInt1037; local33++) {
							this.aStringArray12[local33] = this.aStringArray12[local33 + 1];
							this.anIntArray257[local33] = this.anIntArray257[local33 + 1];
							this.aLongArray4[local33] = this.aLongArray4[local33 + 1];
						}
						this.aClass3_Sub1_Sub3_6.method135(253, this.anInt946);
						this.aClass3_Sub1_Sub3_6.method142(979, arg0);
						return;
					}
				}
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("69755, " + 103 + ", " + arg0 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)Z")
	private boolean method656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg0 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass25_1.method265(this.anInt911, arg1, arg2, arg0);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			anInt918++;
			if (anInt918 > 91) {
				anInt918 = 0;
				this.aClass3_Sub1_Sub3_6.method135(233, this.anInt946);
			}
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(69) Class29 local69 = Class29.method321(local7);
				@Pc(77) int local77;
				@Pc(80) int local80;
				if (local31 == 0 || local31 == 2) {
					local77 = local69.anInt421;
					local80 = local69.anInt411;
				} else {
					local77 = local69.anInt411;
					local80 = local69.anInt421;
				}
				@Pc(91) int local91 = local69.anInt409;
				if (local31 != 0) {
					local91 = (local91 << local31 & 0xF) + (local91 >> 4 - local31);
				}
				this.method624(0, aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0], aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0], 0, false, 2, arg2, arg1, local91, local77, local80);
			} else {
				this.method624(local25 + 1, aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0], aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0], local31, false, 2, arg2, arg1, 0, 0, 0);
			}
			this.anInt891 = super.anInt829;
			this.anInt892 = super.anInt830;
			this.anInt894 = 2;
			this.anInt893 = 0;
			return true;
		} catch (@Pc(168) RuntimeException local168) {
			signlink.reporterror("77198, " + arg0 + ", " + arg1 + ", " + 4 + ", " + arg2 + ", " + local168.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)V")
	private void method657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) int[] local5 = this.aClass3_Sub1_Sub1_Sub4_11.anIntArray204;
			@Pc(8) int local8 = local5.length;
			for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
				local5[local10] = 0;
			}
			@Pc(34) int local34;
			@Pc(36) int local36;
			for (@Pc(22) int local22 = 1; local22 < 103; local22++) {
				local34 = (103 - local22) * 512 * 4 + 24628;
				for (local36 = 1; local36 < 103; local36++) {
					if ((this.aByteArrayArrayArray8[arg1][local36][local22] & 0x18) == 0) {
						this.aClass25_1.method270(local5, local34, arg1, local36, local22);
					}
					if (arg1 < 3 && (this.aByteArrayArrayArray8[arg1 + 1][local36][local22] & 0x8) != 0) {
						this.aClass25_1.method270(local5, local34, arg1 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass3_Sub1_Sub1_Sub4_11.method549();
			@Pc(146) int local146;
			for (@Pc(142) int local142 = 1; local142 < 103; local142++) {
				for (local146 = 1; local146 < 103; local146++) {
					if ((this.aByteArrayArrayArray8[arg1][local146][local142] & 0x18) == 0) {
						this.method602(local36, local142, local34, arg1, local146);
					}
					if (arg1 < 3 && (this.aByteArrayArrayArray8[arg1 + 1][local146][local142] & 0x8) != 0) {
						this.method602(local36, local142, local34, arg1 + 1, local146);
					}
				}
			}
			if (arg0 <= 0) {
				this.aClass27ArrayArrayArray1 = null;
			}
			this.aClass36_26.method391();
			this.anInt877 = 0;
			for (local146 = 0; local146 < 104; local146++) {
				for (@Pc(219) int local219 = 0; local219 < 104; local219++) {
					@Pc(229) int local229 = this.aClass25_1.method264(this.anInt911, local146, local219);
					if (local229 != 0) {
						local229 = local229 >> 14 & 0x7FFF;
						@Pc(241) int local241 = Class29.method321(local229).anInt424;
						if (local241 >= 0) {
							@Pc(245) int local245 = local146;
							@Pc(247) int local247 = local219;
							if (local241 != 22 && local241 != 29 && local241 != 34 && local241 != 36 && local241 != 46 && local241 != 47 && local241 != 48) {
								@Pc(279) int[][] local279 = this.aClass44Array1[this.anInt911].anIntArrayArray16;
								for (@Pc(281) int local281 = 0; local281 < 10; local281++) {
									@Pc(288) int local288 = (int) (Math.random() * 4.0D);
									if (local288 == 0 && local245 > 0 && local245 > local146 - 3 && (local279[local245 - 1][local247] & 0x1280108) == 0) {
										local245--;
									}
									if (local288 == 1 && local245 < 103 && local245 < local146 + 3 && (local279[local245 + 1][local247] & 0x1280180) == 0) {
										local245++;
									}
									if (local288 == 2 && local247 > 0 && local247 > local219 - 3 && (local279[local245][local247 - 1] & 0x1280102) == 0) {
										local247--;
									}
									if (local288 == 3 && local247 < 103 && local247 < local219 + 3 && (local279[local245][local247 + 1] & 0x1280120) == 0) {
										local247++;
									}
								}
							}
							this.aClass3_Sub1_Sub1_Sub4Array6[this.anInt877] = this.aClass3_Sub1_Sub1_Sub4Array7[local241];
							this.anIntArray226[this.anInt877] = local245;
							this.anIntArray227[this.anInt877] = local247;
							this.anInt877++;
						}
					}
				}
			}
		} catch (@Pc(418) RuntimeException local418) {
			signlink.reporterror("72096, " + arg0 + ", " + arg1 + ", " + local418.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(II)V")
	private void method658(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				if (this.anInt1006 != 0) {
					this.anInt1006 = 0;
					this.aBoolean249 = true;
				}
				@Pc(18) int local18 = this.anIntArray265[arg0];
				@Pc(23) int local23 = this.anIntArray266[arg0];
				@Pc(28) int local28 = this.anIntArray267[arg0];
				@Pc(33) int local33 = this.anIntArray268[arg0];
				if (local28 >= 2000) {
					local28 -= 2000;
				}
				@Pc(48) String local48;
				@Pc(52) int local52;
				if (local28 == 629) {
					local48 = this.aStringArray9[arg0];
					local52 = local48.indexOf("@whi@");
					if (local52 != -1) {
						if (this.anInt888 == -1) {
							this.method622();
							this.aString23 = local48.substring(local52 + 5).trim();
							this.aBoolean266 = false;
							for (@Pc(75) int local75 = 0; local75 < Class35.aClass35Array1.length; local75++) {
								if (Class35.aClass35Array1[local75] != null && Class35.aClass35Array1[local75].anInt513 == 600) {
									this.anInt1005 = this.anInt888 = Class35.aClass35Array1[local75].anInt492;
									break;
								}
							}
						} else {
							this.method667(0, "", "Please close the interface you have open before using 'report abuse'");
						}
					}
				}
				@Pc(119) Class3_Sub1_Sub2_Sub1_Sub2 local119;
				if (local28 == 575) {
					local119 = this.aClass3_Sub1_Sub2_Sub1_Sub2Array1[local33];
					if (local119 != null) {
						this.method624(0, aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0], aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0], 0, false, 2, local119.anIntArray116[0], local119.anIntArray115[0], 0, 1, 1);
						this.anInt891 = super.anInt829;
						this.anInt892 = super.anInt830;
						this.anInt894 = 2;
						this.anInt893 = 0;
						this.aClass3_Sub1_Sub3_6.method135(124, this.anInt946);
						this.aClass3_Sub1_Sub3_6.method170(local33);
					}
				}
				@Pc(180) Class35 local180;
				if (local28 == 843) {
					local180 = Class35.aClass35Array1[local23];
					@Pc(182) boolean local182 = true;
					if (local180.anInt513 > 0) {
						local182 = this.method596(local180, this.anInt963);
					}
					if (local182) {
						this.aClass3_Sub1_Sub3_6.method135(166, this.anInt946);
						this.aClass3_Sub1_Sub3_6.method137(local23);
					}
				}
				if (local28 == 68) {
					this.anInt999 = 1;
					this.anInt1000 = local18;
					this.anInt1001 = local23;
					this.anInt1002 = local33;
					this.aString29 = Class34.method361(local33).aString6;
					this.anInt864 = 0;
					this.aBoolean281 = true;
				} else {
					if (local28 == 36) {
						this.aClass3_Sub1_Sub3_6.method135(165, this.anInt946);
						this.aClass3_Sub1_Sub3_6.method171(this.anInt943, local33);
						this.aClass3_Sub1_Sub3_6.method137(local23);
						this.aClass3_Sub1_Sub3_6.method172(local18);
						this.anInt835 = 0;
						this.anInt836 = local23;
						this.anInt837 = local18;
						this.anInt838 = 2;
						if (Class35.aClass35Array1[local23].anInt492 == this.anInt888) {
							this.anInt838 = 1;
						}
						if (Class35.aClass35Array1[local23].anInt492 == this.anInt867) {
							this.anInt838 = 3;
						}
					}
					@Pc(310) boolean local310;
					if (local28 == 567) {
						local310 = this.method624(0, aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0], aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0], 0, false, 2, local23, local18, 0, 0, 0);
						if (!local310) {
							this.method624(0, aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0], aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0], 0, false, 2, local23, local18, 0, 1, 1);
						}
						this.anInt891 = super.anInt829;
						this.anInt892 = super.anInt830;
						this.anInt894 = 2;
						this.anInt893 = 0;
						this.aClass3_Sub1_Sub3_6.method135(215, this.anInt946);
						this.aClass3_Sub1_Sub3_6.method172(this.anInt1002);
						this.aClass3_Sub1_Sub3_6.method172(this.anInt1000);
						this.aClass3_Sub1_Sub3_6.method170(this.anInt1001);
						this.aClass3_Sub1_Sub3_6.method172(local18 + this.anInt919);
						this.aClass3_Sub1_Sub3_6.method137(local33);
						this.aClass3_Sub1_Sub3_6.method170(local23 + this.anInt920);
					}
					if (local28 == 6) {
						local310 = this.method624(0, aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0], aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0], 0, false, 2, local23, local18, 0, 0, 0);
						if (!local310) {
							this.method624(0, aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0], aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0], 0, false, 2, local23, local18, 0, 1, 1);
						}
						this.anInt891 = super.anInt829;
						this.anInt892 = super.anInt830;
						this.anInt894 = 2;
						this.anInt893 = 0;
						this.aClass3_Sub1_Sub3_6.method135(189, this.anInt946);
						this.aClass3_Sub1_Sub3_6.method170(local18 + this.anInt919);
						this.aClass3_Sub1_Sub3_6.method172(local33);
						this.aClass3_Sub1_Sub3_6.method171(this.anInt943, local23 + this.anInt920);
					}
					@Pc(512) long local512;
					if (local28 == 79 || local28 == 51 || local28 == 647 || local28 == 320) {
						local48 = this.aStringArray9[arg0];
						local52 = local48.indexOf("@whi@");
						if (local52 != -1) {
							local512 = Class23.method226(local48.substring(local52 + 5).trim());
							if (local28 == 79) {
								this.method632(local512);
							}
							if (local28 == 51) {
								this.method612(local512);
							}
							if (local28 == 647) {
								this.method655(local512);
							}
							if (local28 == 320) {
								this.method639(local512);
							}
						}
					}
					if (local28 == 819) {
						this.aClass3_Sub1_Sub3_6.method135(177, this.anInt946);
						this.aClass3_Sub1_Sub3_6.method172(local18);
						this.aClass3_Sub1_Sub3_6.method137(local23);
						this.aClass3_Sub1_Sub3_6.method170(local33);
						this.anInt835 = 0;
						this.anInt836 = local23;
						this.anInt837 = local18;
						this.anInt838 = 2;
						if (Class35.aClass35Array1[local23].anInt492 == this.anInt888) {
							this.anInt838 = 1;
						}
						if (Class35.aClass35Array1[local23].anInt492 == this.anInt867) {
							this.anInt838 = 3;
						}
					}
					if (local28 == 482) {
						local310 = this.method624(0, aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0], aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0], 0, false, 2, local23, local18, 0, 0, 0);
						if (!local310) {
							this.method624(0, aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0], aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0], 0, false, 2, local23, local18, 0, 1, 1);
						}
						this.anInt891 = super.anInt829;
						this.anInt892 = super.anInt830;
						this.anInt894 = 2;
						this.anInt893 = 0;
						anInt1053 += this.anInt919;
						if (anInt1053 >= 143) {
							this.aClass3_Sub1_Sub3_6.method135(115, this.anInt946);
							this.aClass3_Sub1_Sub3_6.method139(13559990);
							anInt1053 = 0;
						}
						this.aClass3_Sub1_Sub3_6.method135(141, this.anInt946);
						this.aClass3_Sub1_Sub3_6.method172(local33);
						this.aClass3_Sub1_Sub3_6.method171(this.anInt943, local18 + this.anInt919);
						this.aClass3_Sub1_Sub3_6.method171(this.anInt943, local23 + this.anInt920);
					}
					if (local28 == 936) {
						this.aClass3_Sub1_Sub3_6.method135(166, this.anInt946);
						this.aClass3_Sub1_Sub3_6.method137(local23);
						local180 = Class35.aClass35Array1[local23];
						if (local180.anIntArrayArray10 != null && local180.anIntArrayArray10[0][0] == 5) {
							local52 = local180.anIntArrayArray10[0][1];
							if (this.anIntArray224[local52] != local180.anIntArray107[0]) {
								this.anIntArray224[local52] = local180.anIntArray107[0];
								this.method609(this.anInt923, local52);
								this.aBoolean281 = true;
							}
						}
					}
					if (local28 == 464) {
						local310 = this.method624(0, aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0], aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0], 0, false, 2, local23, local18, 0, 0, 0);
						if (!local310) {
							this.method624(0, aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0], aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0], 0, false, 2, local23, local18, 0, 1, 1);
						}
						this.anInt891 = super.anInt829;
						this.anInt892 = super.anInt830;
						this.anInt894 = 2;
						this.anInt893 = 0;
						this.aClass3_Sub1_Sub3_6.method135(237, this.anInt946);
						this.aClass3_Sub1_Sub3_6.method171(this.anInt943, local18 + this.anInt919);
						this.aClass3_Sub1_Sub3_6.method137(local33);
						this.aClass3_Sub1_Sub3_6.method171(this.anInt943, local23 + this.anInt920);
					}
					@Pc(862) Class3_Sub1_Sub2_Sub1_Sub1 local862;
					if (local28 == 17) {
						local862 = this.aClass3_Sub1_Sub2_Sub1_Sub1Array1[local33];
						if (local862 != null) {
							this.method624(0, aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0], aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0], 0, false, 2, local862.anIntArray116[0], local862.anIntArray115[0], 0, 1, 1);
							this.anInt891 = super.anInt829;
							this.anInt892 = super.anInt830;
							this.anInt894 = 2;
							this.anInt893 = 0;
							this.aClass3_Sub1_Sub3_6.method135(82, this.anInt946);
							this.aClass3_Sub1_Sub3_6.method172(local33);
						}
					}
					if (local28 == 29) {
						local119 = this.aClass3_Sub1_Sub2_Sub1_Sub2Array1[local33];
						if (local119 != null) {
							this.method624(0, aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0], aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0], 0, false, 2, local119.anIntArray116[0], local119.anIntArray115[0], 0, 1, 1);
							this.anInt891 = super.anInt829;
							this.anInt892 = super.anInt830;
							this.anInt894 = 2;
							this.anInt893 = 0;
							this.aClass3_Sub1_Sub3_6.method135(154, this.anInt946);
							this.aClass3_Sub1_Sub3_6.method137(local33);
							this.aClass3_Sub1_Sub3_6.method172(this.anInt1002);
							this.aClass3_Sub1_Sub3_6.method137(this.anInt1001);
							this.aClass3_Sub1_Sub3_6.method137(this.anInt1000);
						}
					}
					if (local28 == 348) {
						local310 = this.method624(0, aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0], aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0], 0, false, 2, local23, local18, 0, 0, 0);
						if (!local310) {
							this.method624(0, aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0], aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0], 0, false, 2, local23, local18, 0, 1, 1);
						}
						this.anInt891 = super.anInt829;
						this.anInt892 = super.anInt830;
						this.anInt894 = 2;
						this.anInt893 = 0;
						this.aClass3_Sub1_Sub3_6.method135(8, this.anInt946);
						this.aClass3_Sub1_Sub3_6.method170(local33);
						this.aClass3_Sub1_Sub3_6.method172(local18 + this.anInt919);
						this.aClass3_Sub1_Sub3_6.method172(local23 + this.anInt920);
					}
					if (local28 == 329) {
						this.method622();
					}
					if (local28 == 313) {
						local119 = this.aClass3_Sub1_Sub2_Sub1_Sub2Array1[local33];
						if (local119 != null) {
							this.method624(0, aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0], aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0], 0, false, 2, local119.anIntArray116[0], local119.anIntArray115[0], 0, 1, 1);
							this.anInt891 = super.anInt829;
							this.anInt892 = super.anInt830;
							this.anInt894 = 2;
							this.anInt893 = 0;
							this.aClass3_Sub1_Sub3_6.method135(72, this.anInt946);
							this.aClass3_Sub1_Sub3_6.method172(local33);
							this.aClass3_Sub1_Sub3_6.method172(this.anInt865);
						}
					}
					if (local28 == 409) {
						local119 = this.aClass3_Sub1_Sub2_Sub1_Sub2Array1[local33];
						if (local119 != null) {
							this.method624(0, aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0], aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0], 0, false, 2, local119.anIntArray116[0], local119.anIntArray115[0], 0, 1, 1);
							this.anInt891 = super.anInt829;
							this.anInt892 = super.anInt830;
							this.anInt894 = 2;
							this.anInt893 = 0;
							anInt841++;
							if (anInt841 >= 128) {
								this.aClass3_Sub1_Sub3_6.method135(90, this.anInt946);
								anInt841 = 0;
							}
							this.aClass3_Sub1_Sub3_6.method135(240, this.anInt946);
							this.aClass3_Sub1_Sub3_6.method137(local33);
						}
					}
					if (local28 == 139) {
						this.method656(local33, local18, local23);
						this.aClass3_Sub1_Sub3_6.method135(217, this.anInt946);
						this.aClass3_Sub1_Sub3_6.method170(local23 + this.anInt920);
						this.aClass3_Sub1_Sub3_6.method170(local18 + this.anInt919);
						this.aClass3_Sub1_Sub3_6.method137(local33 >> 14 & 0x7FFF);
					}
					@Pc(1286) String local1286;
					@Pc(1277) Class34 local1277;
					if (local28 == 1334) {
						local1277 = Class34.method361(local33);
						if (local1277.aByteArray15 == null) {
							local1286 = "It's a " + local1277.aString6 + ".";
						} else {
							local1286 = new String(local1277.aByteArray15);
						}
						this.method667(0, "", local1286);
					}
					if (local28 == 748 && this.method656(local33, local18, local23)) {
						this.aClass3_Sub1_Sub3_6.method135(176, this.anInt946);
						this.aClass3_Sub1_Sub3_6.method170(local33 >> 14 & 0x7FFF);
						this.aClass3_Sub1_Sub3_6.method172(this.anInt1000);
						this.aClass3_Sub1_Sub3_6.method172(this.anInt1002);
						this.aClass3_Sub1_Sub3_6.method172(this.anInt1001);
						this.aClass3_Sub1_Sub3_6.method137(local18 + this.anInt919);
						this.aClass3_Sub1_Sub3_6.method170(local23 + this.anInt920);
					}
					if (local28 == 749 && this.method656(local33, local18, local23)) {
						this.aClass3_Sub1_Sub3_6.method135(174, this.anInt946);
						this.aClass3_Sub1_Sub3_6.method172(local18 + this.anInt919);
						this.aClass3_Sub1_Sub3_6.method171(this.anInt943, local23 + this.anInt920);
						this.aClass3_Sub1_Sub3_6.method170(this.anInt865);
						this.aClass3_Sub1_Sub3_6.method172(local33 >> 14 & 0x7FFF);
					}
					@Pc(1447) int local1447;
					@Pc(1443) String local1443;
					if (local28 == 457 || local28 == 502) {
						local48 = this.aStringArray9[arg0];
						local52 = local48.indexOf("@whi@");
						if (local52 != -1) {
							local48 = local48.substring(local52 + 5).trim();
							local1443 = Class23.method230(Class23.method227(Class23.method226(local48)));
							@Pc(1445) boolean local1445 = false;
							for (local1447 = 0; local1447 < this.anInt1018; local1447++) {
								@Pc(1457) Class3_Sub1_Sub2_Sub1_Sub2 local1457 = this.aClass3_Sub1_Sub2_Sub1_Sub2Array1[this.anIntArray255[local1447]];
								if (local1457 != null && local1457.aString13 != null && local1457.aString13.equalsIgnoreCase(local1443)) {
									this.method624(0, aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0], aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0], 0, false, 2, local1457.anIntArray116[0], local1457.anIntArray115[0], 0, 1, 1);
									if (local28 == 457) {
										anInt890++;
										if (anInt890 >= 76) {
											this.aClass3_Sub1_Sub3_6.method135(129, this.anInt946);
											this.aClass3_Sub1_Sub3_6.method136(78);
											anInt890 = 0;
										}
										this.aClass3_Sub1_Sub3_6.method135(78, this.anInt946);
										this.aClass3_Sub1_Sub3_6.method170(this.anIntArray255[local1447]);
									}
									if (local28 == 502) {
										anInt841++;
										if (anInt841 >= 128) {
											this.aClass3_Sub1_Sub3_6.method135(90, this.anInt946);
											anInt841 = 0;
										}
										this.aClass3_Sub1_Sub3_6.method135(240, this.anInt946);
										this.aClass3_Sub1_Sub3_6.method137(this.anIntArray255[local1447]);
									}
									local1445 = true;
									break;
								}
							}
							if (!local1445) {
								this.method667(0, "", "Unable to find " + local1443);
							}
						}
					}
					if (local28 == 215) {
						local862 = this.aClass3_Sub1_Sub2_Sub1_Sub1Array1[local33];
						if (local862 != null) {
							this.method624(0, aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0], aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0], 0, false, 2, local862.anIntArray116[0], local862.anIntArray115[0], 0, 1, 1);
							this.anInt891 = super.anInt829;
							this.anInt892 = super.anInt830;
							this.anInt894 = 2;
							this.anInt893 = 0;
							anInt937++;
							if (anInt937 >= 86) {
								this.aClass3_Sub1_Sub3_6.method135(136, this.anInt946);
								this.aClass3_Sub1_Sub3_6.method136(103);
								anInt937 = 0;
							}
							this.aClass3_Sub1_Sub3_6.method135(108, this.anInt946);
							this.aClass3_Sub1_Sub3_6.method171(this.anInt943, local33);
						}
					}
					if (local28 == 314) {
						this.method656(local33, local18, local23);
						this.aClass3_Sub1_Sub3_6.method135(12, this.anInt946);
						this.aClass3_Sub1_Sub3_6.method137(local33 >> 14 & 0x7FFF);
						this.aClass3_Sub1_Sub3_6.method137(local18 + this.anInt919);
						this.aClass3_Sub1_Sub3_6.method171(this.anInt943, local23 + this.anInt920);
					}
					if (local28 == 541) {
						this.aClass3_Sub1_Sub3_6.method135(47, this.anInt946);
						this.aClass3_Sub1_Sub3_6.method170(local18);
						this.aClass3_Sub1_Sub3_6.method170(local33);
						this.aClass3_Sub1_Sub3_6.method170(local23);
						this.anInt835 = 0;
						this.anInt836 = local23;
						this.anInt837 = local18;
						this.anInt838 = 2;
						if (Class35.aClass35Array1[local23].anInt492 == this.anInt888) {
							this.anInt838 = 1;
						}
						if (Class35.aClass35Array1[local23].anInt492 == this.anInt867) {
							this.anInt838 = 3;
						}
					}
					if (local28 == 1313) {
						local1277 = Class34.method361(local33);
						@Pc(1772) Class35 local1772 = Class35.aClass35Array1[local23];
						if (local1772 != null && local1772.anIntArray104[local18] >= 100000) {
							local1286 = local1772.anIntArray104[local18] + " x " + local1277.aString6;
						} else if (local1277.aByteArray15 == null) {
							local1286 = "It's a " + local1277.aString6 + ".";
						} else {
							local1286 = new String(local1277.aByteArray15);
						}
						this.method667(0, "", local1286);
					}
					if (local28 == 257) {
						this.aClass3_Sub1_Sub3_6.method135(70, this.anInt946);
						this.aClass3_Sub1_Sub3_6.method170(local23);
						this.aClass3_Sub1_Sub3_6.method172(local18);
						this.aClass3_Sub1_Sub3_6.method171(this.anInt943, local33);
						this.anInt835 = 0;
						this.anInt836 = local23;
						this.anInt837 = local18;
						this.anInt838 = 2;
						if (Class35.aClass35Array1[local23].anInt492 == this.anInt888) {
							this.anInt838 = 1;
						}
						if (Class35.aClass35Array1[local23].anInt492 == this.anInt867) {
							this.anInt838 = 3;
						}
					}
					if (local28 == 124) {
						local862 = this.aClass3_Sub1_Sub2_Sub1_Sub1Array1[local33];
						if (local862 != null) {
							this.method624(0, aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0], aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0], 0, false, 2, local862.anIntArray116[0], local862.anIntArray115[0], 0, 1, 1);
							this.anInt891 = super.anInt829;
							this.anInt892 = super.anInt830;
							this.anInt894 = 2;
							this.anInt893 = 0;
							this.aClass3_Sub1_Sub3_6.method135(96, this.anInt946);
							this.aClass3_Sub1_Sub3_6.method170(this.anInt1002);
							this.aClass3_Sub1_Sub3_6.method172(this.anInt1001);
							this.aClass3_Sub1_Sub3_6.method137(this.anInt1000);
							this.aClass3_Sub1_Sub3_6.method170(local33);
						}
					}
					if (local28 == 114) {
						this.aClass3_Sub1_Sub3_6.method135(67, this.anInt946);
						this.aClass3_Sub1_Sub3_6.method172(local23);
						this.aClass3_Sub1_Sub3_6.method137(local33);
						this.aClass3_Sub1_Sub3_6.method172(local18);
						this.anInt835 = 0;
						this.anInt836 = local23;
						this.anInt837 = local18;
						this.anInt838 = 2;
						if (Class35.aClass35Array1[local23].anInt492 == this.anInt888) {
							this.anInt838 = 1;
						}
						if (Class35.aClass35Array1[local23].anInt492 == this.anInt867) {
							this.anInt838 = 3;
						}
					}
					if (local28 == 862) {
						local310 = this.method624(0, aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0], aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0], 0, false, 2, local23, local18, 0, 0, 0);
						if (!local310) {
							this.method624(0, aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0], aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0], 0, false, 2, local23, local18, 0, 1, 1);
						}
						this.anInt891 = super.anInt829;
						this.anInt892 = super.anInt830;
						this.anInt894 = 2;
						this.anInt893 = 0;
						this.aClass3_Sub1_Sub3_6.method135(125, this.anInt946);
						this.aClass3_Sub1_Sub3_6.method170(this.anInt865);
						this.aClass3_Sub1_Sub3_6.method172(local33);
						this.aClass3_Sub1_Sub3_6.method170(local18 + this.anInt919);
						this.aClass3_Sub1_Sub3_6.method171(this.anInt943, local23 + this.anInt920);
					}
					if (local28 == 797) {
						if (this.aBoolean271) {
							this.aClass25_1.method273(local18 - 4, (byte) 5, local23 - 4);
						} else {
							this.aClass25_1.method273(super.anInt829 - 4, (byte) 5, super.anInt830 - 4);
						}
					}
					if (local28 == 140) {
						this.aClass3_Sub1_Sub3_6.method135(188, this.anInt946);
						this.aClass3_Sub1_Sub3_6.method137(local33);
						this.aClass3_Sub1_Sub3_6.method172(local18);
						this.aClass3_Sub1_Sub3_6.method171(this.anInt943, local23);
						this.anInt835 = 0;
						this.anInt836 = local23;
						this.anInt837 = local18;
						this.anInt838 = 2;
						if (Class35.aClass35Array1[local23].anInt492 == this.anInt888) {
							this.anInt838 = 1;
						}
						if (Class35.aClass35Array1[local23].anInt492 == this.anInt867) {
							this.anInt838 = 3;
						}
					}
					if (local28 == 148) {
						local119 = this.aClass3_Sub1_Sub2_Sub1_Sub2Array1[local33];
						if (local119 != null) {
							this.method624(0, aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0], aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0], 0, false, 2, local119.anIntArray116[0], local119.anIntArray115[0], 0, 1, 1);
							this.anInt891 = super.anInt829;
							this.anInt892 = super.anInt830;
							this.anInt894 = 2;
							this.anInt893 = 0;
							this.aClass3_Sub1_Sub3_6.method135(131, this.anInt946);
							this.aClass3_Sub1_Sub3_6.method137(local33);
						}
					}
					if (local28 == 693) {
						this.method656(local33, local18, local23);
						this.aClass3_Sub1_Sub3_6.method135(10, this.anInt946);
						this.aClass3_Sub1_Sub3_6.method172(local23 + this.anInt920);
						this.aClass3_Sub1_Sub3_6.method170(local33 >> 14 & 0x7FFF);
						this.aClass3_Sub1_Sub3_6.method137(local18 + this.anInt919);
					}
					if (local28 == 263) {
						local310 = this.method624(0, aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0], aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0], 0, false, 2, local23, local18, 0, 0, 0);
						if (!local310) {
							this.method624(0, aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0], aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0], 0, false, 2, local23, local18, 0, 1, 1);
						}
						this.anInt891 = super.anInt829;
						this.anInt892 = super.anInt830;
						this.anInt894 = 2;
						this.anInt893 = 0;
						if ((local23 & 0x3) == 0) {
							anInt962++;
						}
						if (anInt962 >= 133) {
							this.aClass3_Sub1_Sub3_6.method135(110, this.anInt946);
							this.aClass3_Sub1_Sub3_6.method136(182);
							anInt962 = 0;
						}
						this.aClass3_Sub1_Sub3_6.method135(206, this.anInt946);
						this.aClass3_Sub1_Sub3_6.method170(local18 + this.anInt919);
						this.aClass3_Sub1_Sub3_6.method170(local23 + this.anInt920);
						this.aClass3_Sub1_Sub3_6.method172(local33);
					}
					if (local28 == 815) {
						this.aClass3_Sub1_Sub3_6.method135(241, this.anInt946);
						this.aClass3_Sub1_Sub3_6.method171(this.anInt943, local18);
						this.aClass3_Sub1_Sub3_6.method170(local33);
						this.aClass3_Sub1_Sub3_6.method137(local23);
						this.anInt835 = 0;
						this.anInt836 = local23;
						this.anInt837 = local18;
						this.anInt838 = 2;
						if (Class35.aClass35Array1[local23].anInt492 == this.anInt888) {
							this.anInt838 = 1;
						}
						if (Class35.aClass35Array1[local23].anInt492 == this.anInt867) {
							this.anInt838 = 3;
						}
					}
					if (local28 == 1619) {
						@Pc(2474) int local2474 = local33 >> 14 & 0x7FFF;
						@Pc(2477) Class29 local2477 = Class29.method321(local2474);
						if (local2477.aByteArray13 == null) {
							local1443 = "It's a " + local2477.aString5 + ".";
						} else {
							local1443 = new String(local2477.aByteArray13);
						}
						this.method667(0, "", local1443);
					}
					if (local28 == 507) {
						local862 = this.aClass3_Sub1_Sub2_Sub1_Sub1Array1[local33];
						if (local862 != null) {
							this.method624(0, aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0], aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0], 0, false, 2, local862.anIntArray116[0], local862.anIntArray115[0], 0, 1, 1);
							this.anInt891 = super.anInt829;
							this.anInt892 = super.anInt830;
							this.anInt894 = 2;
							this.anInt893 = 0;
							anInt847++;
							if (anInt847 >= 62) {
								this.aClass3_Sub1_Sub3_6.method135(109, this.anInt946);
								anInt847 = 0;
							}
							this.aClass3_Sub1_Sub3_6.method135(175, this.anInt946);
							this.aClass3_Sub1_Sub3_6.method137(local33);
						}
					}
					if (local28 == 938) {
						this.aClass3_Sub1_Sub3_6.method135(166, this.anInt946);
						this.aClass3_Sub1_Sub3_6.method137(local23);
						local180 = Class35.aClass35Array1[local23];
						if (local180.anIntArrayArray10 != null && local180.anIntArrayArray10[0][0] == 5) {
							local52 = local180.anIntArrayArray10[0][1];
							this.anIntArray224[local52] = 1 - this.anIntArray224[local52];
							this.method609(this.anInt923, local52);
							this.aBoolean281 = true;
						}
					}
					if (local28 == 474) {
						this.aClass3_Sub1_Sub3_6.method135(81, this.anInt946);
						this.aClass3_Sub1_Sub3_6.method137(local33);
						this.aClass3_Sub1_Sub3_6.method171(this.anInt943, local18);
						this.aClass3_Sub1_Sub3_6.method137(local23);
						this.anInt835 = 0;
						this.anInt836 = local23;
						this.anInt837 = local18;
						this.anInt838 = 2;
						if (Class35.aClass35Array1[local23].anInt492 == this.anInt888) {
							this.anInt838 = 1;
						}
						if (Class35.aClass35Array1[local23].anInt492 == this.anInt867) {
							this.anInt838 = 3;
						}
					}
					if (local28 == 919) {
						local862 = this.aClass3_Sub1_Sub2_Sub1_Sub1Array1[local33];
						if (local862 != null) {
							this.method624(0, aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0], aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0], 0, false, 2, local862.anIntArray116[0], local862.anIntArray115[0], 0, 1, 1);
							this.anInt891 = super.anInt829;
							this.anInt892 = super.anInt830;
							this.anInt894 = 2;
							this.anInt893 = 0;
							this.aClass3_Sub1_Sub3_6.method135(225, this.anInt946);
							this.aClass3_Sub1_Sub3_6.method170(local33);
						}
					}
					if (local28 == 104) {
						this.aClass3_Sub1_Sub3_6.method135(76, this.anInt946);
						this.aClass3_Sub1_Sub3_6.method170(local33);
						this.aClass3_Sub1_Sub3_6.method170(local23);
						this.aClass3_Sub1_Sub3_6.method170(local18);
						this.anInt835 = 0;
						this.anInt836 = local23;
						this.anInt837 = local18;
						this.anInt838 = 2;
						if (Class35.aClass35Array1[local23].anInt492 == this.anInt888) {
							this.anInt838 = 1;
						}
						if (Class35.aClass35Array1[local23].anInt492 == this.anInt867) {
							this.anInt838 = 3;
						}
					}
					if (local28 == 637) {
						this.aClass3_Sub1_Sub3_6.method135(28, this.anInt946);
						this.aClass3_Sub1_Sub3_6.method172(local23);
						this.aClass3_Sub1_Sub3_6.method171(this.anInt943, this.anInt1001);
						this.aClass3_Sub1_Sub3_6.method137(this.anInt1002);
						this.aClass3_Sub1_Sub3_6.method170(local18);
						this.aClass3_Sub1_Sub3_6.method172(this.anInt1000);
						this.aClass3_Sub1_Sub3_6.method170(local33);
						this.anInt835 = 0;
						this.anInt836 = local23;
						this.anInt837 = local18;
						this.anInt838 = 2;
						if (Class35.aClass35Array1[local23].anInt492 == this.anInt888) {
							this.anInt838 = 1;
						}
						if (Class35.aClass35Array1[local23].anInt492 == this.anInt867) {
							this.anInt838 = 3;
						}
					}
					if (local28 == 522) {
						this.aClass3_Sub1_Sub3_6.method135(45, this.anInt946);
						this.aClass3_Sub1_Sub3_6.method171(this.anInt943, this.anInt865);
						this.aClass3_Sub1_Sub3_6.method171(this.anInt943, local33);
						this.aClass3_Sub1_Sub3_6.method137(local23);
						this.aClass3_Sub1_Sub3_6.method172(local18);
						this.anInt835 = 0;
						this.anInt836 = local23;
						this.anInt837 = local18;
						this.anInt838 = 2;
						if (Class35.aClass35Array1[local23].anInt492 == this.anInt888) {
							this.anInt838 = 1;
						}
						if (Class35.aClass35Array1[local23].anInt492 == this.anInt867) {
							this.anInt838 = 3;
						}
					}
					if (local28 == 1963) {
						this.method656(local33, local18, local23);
						this.aClass3_Sub1_Sub3_6.method135(190, this.anInt946);
						this.aClass3_Sub1_Sub3_6.method170(local23 + this.anInt920);
						this.aClass3_Sub1_Sub3_6.method172(local18 + this.anInt919);
						this.aClass3_Sub1_Sub3_6.method137(local33 >> 14 & 0x7FFF);
					}
					if (local28 == 216) {
						local862 = this.aClass3_Sub1_Sub2_Sub1_Sub1Array1[local33];
						if (local862 != null) {
							this.method624(0, aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0], aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0], 0, false, 2, local862.anIntArray116[0], local862.anIntArray115[0], 0, 1, 1);
							this.anInt891 = super.anInt829;
							this.anInt892 = super.anInt830;
							this.anInt894 = 2;
							this.anInt893 = 0;
							anInt852++;
							if (anInt852 >= 144) {
								this.aClass3_Sub1_Sub3_6.method135(71, this.anInt946);
								this.aClass3_Sub1_Sub3_6.method136(125);
								anInt852 = 0;
							}
							this.aClass3_Sub1_Sub3_6.method135(242, this.anInt946);
							this.aClass3_Sub1_Sub3_6.method172(local33);
						}
					}
					if (local28 == 1159) {
						local862 = this.aClass3_Sub1_Sub2_Sub1_Sub1Array1[local33];
						if (local862 != null) {
							@Pc(3078) Class42 local3078 = local862.aClass42_1;
							if (local3078.anIntArray155 != null) {
								local3078 = local3078.method478();
							}
							if (local3078 != null) {
								if (local3078.aByteArray19 == null) {
									local1443 = "It's a " + local3078.aString16 + ".";
								} else {
									local1443 = new String(local3078.aByteArray19);
								}
								this.method667(0, "", local1443);
							}
						}
					}
					if (local28 == 499) {
						local48 = this.aStringArray9[arg0];
						local52 = local48.indexOf("@whi@");
						if (local52 != -1) {
							local512 = Class23.method226(local48.substring(local52 + 5).trim());
							local1447 = -1;
							for (@Pc(3142) int local3142 = 0; local3142 < this.anInt1037; local3142++) {
								if (this.aLongArray4[local3142] == local512) {
									local1447 = local3142;
									break;
								}
							}
							if (local1447 != -1 && this.anIntArray257[local1447] > 0) {
								this.aBoolean249 = true;
								this.anInt1006 = 0;
								this.aBoolean267 = true;
								this.aString24 = "";
								this.anInt1025 = 3;
								this.aLong29 = this.aLongArray4[local1447];
								this.aString26 = "Enter message to send to " + this.aStringArray12[local1447];
							}
						}
					}
					if (local28 == 264 && !this.aBoolean255) {
						this.aClass3_Sub1_Sub3_6.method135(99, this.anInt946);
						this.aClass3_Sub1_Sub3_6.method137(local23);
						this.aBoolean255 = true;
					}
					if (local28 == 743) {
						local119 = this.aClass3_Sub1_Sub2_Sub1_Sub2Array1[local33];
						if (local119 != null) {
							this.method624(0, aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0], aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0], 0, false, 2, local119.anIntArray116[0], local119.anIntArray115[0], 0, 1, 1);
							this.anInt891 = super.anInt829;
							this.anInt892 = super.anInt830;
							this.anInt894 = 2;
							this.anInt893 = 0;
							this.aClass3_Sub1_Sub3_6.method135(196, this.anInt946);
							this.aClass3_Sub1_Sub3_6.method170(local33);
						}
					}
					if (local28 == 217) {
						this.method656(local33, local18, local23);
						this.aClass3_Sub1_Sub3_6.method135(119, this.anInt946);
						this.aClass3_Sub1_Sub3_6.method171(this.anInt943, local18 + this.anInt919);
						this.aClass3_Sub1_Sub3_6.method170(local23 + this.anInt920);
						this.aClass3_Sub1_Sub3_6.method171(this.anInt943, local33 >> 14 & 0x7FFF);
					}
					if (local28 == 841) {
						local180 = Class35.aClass35Array1[local23];
						this.anInt864 = 1;
						this.anInt865 = local23;
						this.anInt866 = local180.anInt520;
						this.anInt999 = 0;
						this.aBoolean281 = true;
						local1286 = local180.aString10;
						if (local1286.indexOf(" ") != -1) {
							local1286 = local1286.substring(0, local1286.indexOf(" "));
						}
						local1443 = local180.aString10;
						if (local1443.indexOf(" ") != -1) {
							local1443 = local1443.substring(local1443.indexOf(" ") + 1);
						}
						this.aString21 = local1286 + " " + local180.aString11 + " " + local1443;
						if (this.anInt866 == 16) {
							this.aBoolean281 = true;
							this.anInt1044 = 3;
							this.aBoolean262 = true;
						}
					} else {
						if (local28 == 540) {
							local119 = this.aClass3_Sub1_Sub2_Sub1_Sub2Array1[local33];
							if (local119 != null) {
								this.method624(0, aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0], aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0], 0, false, 2, local119.anIntArray116[0], local119.anIntArray115[0], 0, 1, 1);
								this.anInt891 = super.anInt829;
								this.anInt892 = super.anInt830;
								this.anInt894 = 2;
								this.anInt893 = 0;
								anInt890++;
								if (anInt890 >= 76) {
									this.aClass3_Sub1_Sub3_6.method135(129, this.anInt946);
									this.aClass3_Sub1_Sub3_6.method136(78);
									anInt890 = 0;
								}
								this.aClass3_Sub1_Sub3_6.method135(78, this.anInt946);
								this.aClass3_Sub1_Sub3_6.method170(local33);
							}
						}
						if (local28 == 53) {
							local862 = this.aClass3_Sub1_Sub2_Sub1_Sub1Array1[local33];
							if (local862 != null) {
								this.method624(0, aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0], aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0], 0, false, 2, local862.anIntArray116[0], local862.anIntArray115[0], 0, 1, 1);
								this.anInt891 = super.anInt829;
								this.anInt892 = super.anInt830;
								this.anInt894 = 2;
								this.anInt893 = 0;
								this.aClass3_Sub1_Sub3_6.method135(152, this.anInt946);
								this.aClass3_Sub1_Sub3_6.method171(this.anInt943, this.anInt865);
								this.aClass3_Sub1_Sub3_6.method172(local33);
							}
						}
						if (local28 == 984) {
							anInt973 += local23;
							if (anInt973 >= 136) {
								this.aClass3_Sub1_Sub3_6.method135(197, this.anInt946);
								this.aClass3_Sub1_Sub3_6.method137(41190);
								anInt973 = 0;
							}
							this.aClass3_Sub1_Sub3_6.method135(181, this.anInt946);
							this.aClass3_Sub1_Sub3_6.method170(local33);
							this.aClass3_Sub1_Sub3_6.method137(local18);
							this.aClass3_Sub1_Sub3_6.method172(local23);
							this.anInt835 = 0;
							this.anInt836 = local23;
							this.anInt837 = local18;
							this.anInt838 = 2;
							if (Class35.aClass35Array1[local23].anInt492 == this.anInt888) {
								this.anInt838 = 1;
							}
							if (Class35.aClass35Array1[local23].anInt492 == this.anInt867) {
								this.anInt838 = 3;
							}
						}
						this.anInt999 = 0;
						this.anInt864 = 0;
						this.aBoolean281 = true;
					}
				}
			}
		} catch (@Pc(3645) RuntimeException local3645) {
			signlink.reporterror("41124, " + arg0 + ", " + -390 + ", " + local3645.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method574() {
		this.method581(aBoolean265, 20, "Starting up");
		if (signlink.sunjava) {
			super.anInt817 = 5;
		}
		if (aBoolean275) {
			this.aBoolean280 = true;
			return;
		}
		aBoolean275 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method701();
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
			this.aBoolean274 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(89) int local89 = 0; local89 < 5; local89++) {
				this.aClass32Array1[local89] = new Class32(signlink.aRandomAccessFile3, false, local89 + 1, 500000, signlink.aRandomAccessFileArray1[local89]);
			}
		}
		try {
			this.method635();
			this.aClass5_1 = this.method640(25, "title", "title screen", this.anIntArray239[1], 1);
			this.aClass3_Sub1_Sub1_Sub2_2 = new Class3_Sub1_Sub1_Sub2(false, "p11_full", this.aClass5_1, 4348);
			this.aClass3_Sub1_Sub1_Sub2_3 = new Class3_Sub1_Sub1_Sub2(false, "p12_full", this.aClass5_1, 4348);
			this.aClass3_Sub1_Sub1_Sub2_4 = new Class3_Sub1_Sub1_Sub2(false, "b12_full", this.aClass5_1, 4348);
			this.aClass3_Sub1_Sub1_Sub2_5 = new Class3_Sub1_Sub1_Sub2(true, "q8_full", this.aClass5_1, 4348);
			this.method634();
			this.method584();
			@Pc(185) Class5 local185 = this.method640(30, "config", "config", this.anIntArray239[2], 2);
			@Pc(197) Class5 local197 = this.method640(35, "interface", "interface", this.anIntArray239[3], 3);
			@Pc(209) Class5 local209 = this.method640(40, "media", "2d graphics", this.anIntArray239[4], 4);
			@Pc(221) Class5 local221 = this.method640(45, "textures", "textures", this.anIntArray239[6], 6);
			@Pc(233) Class5 local233 = this.method640(50, "wordenc", "chat system", this.anIntArray239[7], 7);
			@Pc(245) Class5 local245 = this.method640(55, "sounds", "sound effects", this.anIntArray239[8], 8);
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray7 = new int[4][105][105];
			this.aClass25_1 = new Class25(104, this.anIntArrayArrayArray7, 4, -82, 104);
			for (@Pc(270) int local270 = 0; local270 < 4; local270++) {
				this.aClass44Array1[local270] = new Class44(104, anInt883, 104);
			}
			this.aClass3_Sub1_Sub1_Sub4_11 = new Class3_Sub1_Sub1_Sub4(512, 512);
			@Pc(305) Class5 local305 = this.method640(60, "versionlist", "update list", this.anIntArray239[5], 5);
			this.method581(aBoolean265, 60, "Connecting to update server");
			this.aClass19_Sub1_1 = new Class19_Sub1();
			this.aClass19_Sub1_1.method401(local305, this);
			Class15.method121(this.aClass19_Sub1_1.method404());
			Class3_Sub1_Sub2_Sub6.method507(this.aClass19_Sub1_1.method411(0, 86), this.aClass19_Sub1_1);
			if (!aBoolean258) {
				this.anInt929 = 0;
				try {
					this.anInt929 = Integer.parseInt(this.getParameter("music"));
				} catch (@Pc(346) Exception local346) {
				}
				this.aBoolean260 = true;
				this.aClass19_Sub1_1.method406(2, this.anInt929);
				while (this.aClass19_Sub1_1.method409() > 0) {
					this.method713();
					try {
						Thread.sleep(100L);
					} catch (@Pc(364) Exception local364) {
					}
					if (this.aClass19_Sub1_1.anInt622 > 3) {
						this.method705("ondemand");
						return;
					}
				}
			}
			this.method581(aBoolean265, 65, "Requesting animations");
			@Pc(388) int local388 = this.aClass19_Sub1_1.method411(1, 86);
			for (@Pc(390) int local390 = 0; local390 < local388; local390++) {
				this.aClass19_Sub1_1.method406(1, local390);
			}
			@Pc(409) int local409;
			while (this.aClass19_Sub1_1.method409() > 0) {
				local409 = local388 - this.aClass19_Sub1_1.method409();
				if (local409 > 0) {
					this.method581(aBoolean265, 65, "Loading animations - " + local409 * 100 / local388 + "%");
				}
				this.method713();
				try {
					Thread.sleep(100L);
				} catch (@Pc(435) Exception local435) {
				}
				if (this.aClass19_Sub1_1.anInt622 > 3) {
					this.method705("ondemand");
					return;
				}
			}
			this.method581(aBoolean265, 70, "Requesting models");
			local388 = this.aClass19_Sub1_1.method411(0, 86);
			@Pc(469) int local469;
			for (local409 = 0; local409 < local388; local409++) {
				local469 = this.aClass19_Sub1_1.method417(local409);
				if ((local469 & 0x1) != 0) {
					this.aClass19_Sub1_1.method406(0, local409);
				}
			}
			local388 = this.aClass19_Sub1_1.method409();
			while (this.aClass19_Sub1_1.method409() > 0) {
				local469 = local388 - this.aClass19_Sub1_1.method409();
				if (local469 > 0) {
					this.method581(aBoolean265, 70, "Loading models - " + local469 * 100 / local388 + "%");
				}
				this.method713();
				try {
					Thread.sleep(100L);
				} catch (@Pc(520) Exception local520) {
				}
			}
			if (this.aClass32Array1[0] != null) {
				this.method581(aBoolean265, 75, "Requesting maps");
				this.aClass19_Sub1_1.method406(3, this.aClass19_Sub1_1.method402(47, 48, 0));
				this.aClass19_Sub1_1.method406(3, this.aClass19_Sub1_1.method402(47, 48, 1));
				this.aClass19_Sub1_1.method406(3, this.aClass19_Sub1_1.method402(48, 48, 0));
				this.aClass19_Sub1_1.method406(3, this.aClass19_Sub1_1.method402(48, 48, 1));
				this.aClass19_Sub1_1.method406(3, this.aClass19_Sub1_1.method402(49, 48, 0));
				this.aClass19_Sub1_1.method406(3, this.aClass19_Sub1_1.method402(49, 48, 1));
				this.aClass19_Sub1_1.method406(3, this.aClass19_Sub1_1.method402(47, 47, 0));
				this.aClass19_Sub1_1.method406(3, this.aClass19_Sub1_1.method402(47, 47, 1));
				this.aClass19_Sub1_1.method406(3, this.aClass19_Sub1_1.method402(48, 47, 0));
				this.aClass19_Sub1_1.method406(3, this.aClass19_Sub1_1.method402(48, 47, 1));
				this.aClass19_Sub1_1.method406(3, this.aClass19_Sub1_1.method402(48, 148, 0));
				this.aClass19_Sub1_1.method406(3, this.aClass19_Sub1_1.method402(48, 148, 1));
				local388 = this.aClass19_Sub1_1.method409();
				while (this.aClass19_Sub1_1.method409() > 0) {
					local469 = local388 - this.aClass19_Sub1_1.method409();
					if (local469 > 0) {
						this.method581(aBoolean265, 75, "Loading maps - " + local469 * 100 / local388 + "%");
					}
					this.method713();
					try {
						Thread.sleep(100L);
					} catch (@Pc(705) Exception local705) {
					}
				}
			}
			local388 = this.aClass19_Sub1_1.method411(0, 86);
			@Pc(726) int local726;
			for (local469 = 0; local469 < local388; local469++) {
				local726 = this.aClass19_Sub1_1.method417(local469);
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
					this.aClass19_Sub1_1.method405(0, local469, local728);
				}
			}
			this.aClass19_Sub1_1.method415(aBoolean257);
			if (!aBoolean258) {
				local388 = this.aClass19_Sub1_1.method411(2, 86);
				for (local726 = 1; local726 < local388; local726++) {
					if (this.aClass19_Sub1_1.method416(local726)) {
						this.aClass19_Sub1_1.method405(2, local726, (byte) 1);
					}
				}
			}
			this.method581(aBoolean265, 80, "Unpacking media");
			this.aClass3_Sub1_Sub1_Sub1_13 = new Class3_Sub1_Sub1_Sub1(local209, "invback", 0);
			this.aClass3_Sub1_Sub1_Sub1_15 = new Class3_Sub1_Sub1_Sub1(local209, "chatback", 0);
			this.aClass3_Sub1_Sub1_Sub1_14 = new Class3_Sub1_Sub1_Sub1(local209, "mapback", 0);
			this.aClass3_Sub1_Sub1_Sub1_5 = new Class3_Sub1_Sub1_Sub1(local209, "backbase1", 0);
			this.aClass3_Sub1_Sub1_Sub1_6 = new Class3_Sub1_Sub1_Sub1(local209, "backbase2", 0);
			this.aClass3_Sub1_Sub1_Sub1_7 = new Class3_Sub1_Sub1_Sub1(local209, "backhmid1", 0);
			for (local726 = 0; local726 < 13; local726++) {
				this.aClass3_Sub1_Sub1_Sub1Array2[local726] = new Class3_Sub1_Sub1_Sub1(local209, "sideicons", local726);
			}
			this.aClass3_Sub1_Sub1_Sub4_8 = new Class3_Sub1_Sub1_Sub4(local209, "compass", 0);
			this.aClass3_Sub1_Sub1_Sub4_16 = new Class3_Sub1_Sub1_Sub4(local209, "mapedge", 0);
			this.aClass3_Sub1_Sub1_Sub4_16.method551();
			@Pc(928) int local928;
			try {
				for (local928 = 0; local928 < 100; local928++) {
					this.aClass3_Sub1_Sub1_Sub1Array5[local928] = new Class3_Sub1_Sub1_Sub1(local209, "mapscene", local928);
				}
			} catch (@Pc(946) Exception local946) {
			}
			try {
				for (local928 = 0; local928 < 100; local928++) {
					this.aClass3_Sub1_Sub1_Sub4Array7[local928] = new Class3_Sub1_Sub1_Sub4(local209, "mapfunction", local928);
				}
			} catch (@Pc(966) Exception local966) {
			}
			try {
				for (local928 = 0; local928 < 20; local928++) {
					this.aClass3_Sub1_Sub1_Sub4Array5[local928] = new Class3_Sub1_Sub1_Sub4(local209, "hitmarks", local928);
				}
			} catch (@Pc(986) Exception local986) {
			}
			try {
				for (local928 = 0; local928 < 20; local928++) {
					this.aClass3_Sub1_Sub1_Sub4Array4[local928] = new Class3_Sub1_Sub1_Sub4(local209, "headicons", local928);
				}
			} catch (@Pc(1006) Exception local1006) {
			}
			this.aClass3_Sub1_Sub1_Sub4_12 = new Class3_Sub1_Sub1_Sub4(local209, "mapmarker", 0);
			this.aClass3_Sub1_Sub1_Sub4_13 = new Class3_Sub1_Sub1_Sub4(local209, "mapmarker", 1);
			for (local928 = 0; local928 < 8; local928++) {
				this.aClass3_Sub1_Sub1_Sub4Array8[local928] = new Class3_Sub1_Sub1_Sub4(local209, "cross", local928);
			}
			this.aClass3_Sub1_Sub1_Sub4_3 = new Class3_Sub1_Sub1_Sub4(local209, "mapdots", 0);
			this.aClass3_Sub1_Sub1_Sub4_4 = new Class3_Sub1_Sub1_Sub4(local209, "mapdots", 1);
			this.aClass3_Sub1_Sub1_Sub4_5 = new Class3_Sub1_Sub1_Sub4(local209, "mapdots", 2);
			this.aClass3_Sub1_Sub1_Sub4_6 = new Class3_Sub1_Sub1_Sub4(local209, "mapdots", 3);
			this.aClass3_Sub1_Sub1_Sub4_7 = new Class3_Sub1_Sub1_Sub4(local209, "mapdots", 4);
			this.aClass3_Sub1_Sub1_Sub1_3 = new Class3_Sub1_Sub1_Sub1(local209, "scrollbar", 0);
			this.aClass3_Sub1_Sub1_Sub1_4 = new Class3_Sub1_Sub1_Sub1(local209, "scrollbar", 1);
			this.aClass3_Sub1_Sub1_Sub1_8 = new Class3_Sub1_Sub1_Sub1(local209, "redstone1", 0);
			this.aClass3_Sub1_Sub1_Sub1_9 = new Class3_Sub1_Sub1_Sub1(local209, "redstone2", 0);
			this.aClass3_Sub1_Sub1_Sub1_10 = new Class3_Sub1_Sub1_Sub1(local209, "redstone3", 0);
			this.aClass3_Sub1_Sub1_Sub1_11 = new Class3_Sub1_Sub1_Sub1(local209, "redstone1", 0);
			this.aClass3_Sub1_Sub1_Sub1_11.method41((byte) 5);
			this.aClass3_Sub1_Sub1_Sub1_12 = new Class3_Sub1_Sub1_Sub1(local209, "redstone2", 0);
			this.aClass3_Sub1_Sub1_Sub1_12.method41((byte) 5);
			this.aClass3_Sub1_Sub1_Sub1_16 = new Class3_Sub1_Sub1_Sub1(local209, "redstone1", 0);
			this.aClass3_Sub1_Sub1_Sub1_16.method42();
			this.aClass3_Sub1_Sub1_Sub1_17 = new Class3_Sub1_Sub1_Sub1(local209, "redstone2", 0);
			this.aClass3_Sub1_Sub1_Sub1_17.method42();
			this.aClass3_Sub1_Sub1_Sub1_18 = new Class3_Sub1_Sub1_Sub1(local209, "redstone3", 0);
			this.aClass3_Sub1_Sub1_Sub1_18.method42();
			this.aClass3_Sub1_Sub1_Sub1_19 = new Class3_Sub1_Sub1_Sub1(local209, "redstone1", 0);
			this.aClass3_Sub1_Sub1_Sub1_19.method41((byte) 5);
			this.aClass3_Sub1_Sub1_Sub1_19.method42();
			this.aClass3_Sub1_Sub1_Sub1_20 = new Class3_Sub1_Sub1_Sub1(local209, "redstone2", 0);
			this.aClass3_Sub1_Sub1_Sub1_20.method41((byte) 5);
			this.aClass3_Sub1_Sub1_Sub1_20.method42();
			for (@Pc(1214) int local1214 = 0; local1214 < 2; local1214++) {
				this.aClass3_Sub1_Sub1_Sub1Array4[local1214] = new Class3_Sub1_Sub1_Sub1(local209, "mod_icons", local1214);
			}
			@Pc(1237) Class3_Sub1_Sub1_Sub4 local1237 = new Class3_Sub1_Sub1_Sub4(local209, "backleft1", 0);
			this.aClass36_6 = new Class36(local1237.anInt775, 13856, local1237.anInt774, this.method579((byte) 2));
			local1237.method552(0, 0);
			@Pc(1262) Class3_Sub1_Sub1_Sub4 local1262 = new Class3_Sub1_Sub1_Sub4(local209, "backleft2", 0);
			this.aClass36_7 = new Class36(local1262.anInt775, 13856, local1262.anInt774, this.method579((byte) 2));
			local1262.method552(0, 0);
			@Pc(1287) Class3_Sub1_Sub1_Sub4 local1287 = new Class3_Sub1_Sub1_Sub4(local209, "backright1", 0);
			this.aClass36_8 = new Class36(local1287.anInt775, 13856, local1287.anInt774, this.method579((byte) 2));
			local1287.method552(0, 0);
			@Pc(1312) Class3_Sub1_Sub1_Sub4 local1312 = new Class3_Sub1_Sub1_Sub4(local209, "backright2", 0);
			this.aClass36_9 = new Class36(local1312.anInt775, 13856, local1312.anInt774, this.method579((byte) 2));
			local1312.method552(0, 0);
			@Pc(1337) Class3_Sub1_Sub1_Sub4 local1337 = new Class3_Sub1_Sub1_Sub4(local209, "backtop1", 0);
			this.aClass36_10 = new Class36(local1337.anInt775, 13856, local1337.anInt774, this.method579((byte) 2));
			local1337.method552(0, 0);
			@Pc(1362) Class3_Sub1_Sub1_Sub4 local1362 = new Class3_Sub1_Sub1_Sub4(local209, "backvmid1", 0);
			this.aClass36_11 = new Class36(local1362.anInt775, 13856, local1362.anInt774, this.method579((byte) 2));
			local1362.method552(0, 0);
			@Pc(1387) Class3_Sub1_Sub1_Sub4 local1387 = new Class3_Sub1_Sub1_Sub4(local209, "backvmid2", 0);
			this.aClass36_12 = new Class36(local1387.anInt775, 13856, local1387.anInt774, this.method579((byte) 2));
			local1387.method552(0, 0);
			@Pc(1412) Class3_Sub1_Sub1_Sub4 local1412 = new Class3_Sub1_Sub1_Sub4(local209, "backvmid3", 0);
			this.aClass36_13 = new Class36(local1412.anInt775, 13856, local1412.anInt774, this.method579((byte) 2));
			local1412.method552(0, 0);
			@Pc(1437) Class3_Sub1_Sub1_Sub4 local1437 = new Class3_Sub1_Sub1_Sub4(local209, "backhmid2", 0);
			this.aClass36_14 = new Class36(local1437.anInt775, 13856, local1437.anInt774, this.method579((byte) 2));
			local1437.method552(0, 0);
			@Pc(1462) int local1462 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1469) int local1469 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1476) int local1476 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1483) int local1483 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1485) int local1485 = 0; local1485 < 100; local1485++) {
				if (this.aClass3_Sub1_Sub1_Sub4Array7[local1485] != null) {
					this.aClass3_Sub1_Sub1_Sub4Array7[local1485].method550(local1462 + local1483, local1476 + local1483, local1469 + local1483);
				}
				if (this.aClass3_Sub1_Sub1_Sub1Array5[local1485] != null) {
					this.aClass3_Sub1_Sub1_Sub1Array5[local1485].method43(local1462 + local1483, local1476 + local1483, local1469 + local1483);
				}
			}
			this.method581(aBoolean265, 83, "Unpacking textures");
			Class3_Sub1_Sub1_Sub3.method451(local221);
			Class3_Sub1_Sub1_Sub3.method455(0.8D);
			Class3_Sub1_Sub1_Sub3.method450((byte) 1);
			this.method581(aBoolean265, 86, "Unpacking config");
			Class49.method566(local185);
			Class29.method323(local185);
			Class12.method117(local185);
			Class34.method357(local185);
			Class42.method477(local185);
			Class4.method59(local185);
			Class7.method67(local185);
			Class38.method398(local185);
			Class2.method6(local185);
			Class34.aBoolean147 = aBoolean257;
			if (!aBoolean258) {
				this.method581(aBoolean265, 90, "Unpacking sounds");
				@Pc(1588) byte[] local1588 = local245.method66("sounds.dat", null);
				@Pc(1594) Class3_Sub1_Sub3 local1594 = new Class3_Sub1_Sub3(0, local1588);
				Class8.method100(local1594);
			}
			this.method581(aBoolean265, 95, "Unpacking interfaces");
			@Pc(1625) Class3_Sub1_Sub1_Sub2[] local1625 = new Class3_Sub1_Sub1_Sub2[] { this.aClass3_Sub1_Sub1_Sub2_2, this.aClass3_Sub1_Sub1_Sub2_3, this.aClass3_Sub1_Sub1_Sub2_4, this.aClass3_Sub1_Sub1_Sub2_5 };
			Class35.method377(local197, local1625, anInt880, local209);
			this.method581(aBoolean265, 100, "Preparing game engine");
			@Pc(1641) int local1641;
			@Pc(1643) int local1643;
			@Pc(1645) int local1645;
			for (@Pc(1637) int local1637 = 0; local1637 < 33; local1637++) {
				local1641 = 999;
				local1643 = 0;
				for (local1645 = 0; local1645 < 34; local1645++) {
					if (this.aClass3_Sub1_Sub1_Sub1_14.aByteArray1[local1645 + local1637 * this.aClass3_Sub1_Sub1_Sub1_14.anInt39] == 0) {
						if (local1641 == 999) {
							local1641 = local1645;
						}
					} else if (local1641 != 999) {
						local1643 = local1645;
						break;
					}
				}
				this.anIntArray273[local1637] = local1641;
				this.anIntArray236[local1637] = local1643 - local1641;
			}
			@Pc(1703) int local1703;
			for (local1641 = 5; local1641 < 156; local1641++) {
				local1643 = 999;
				local1645 = 0;
				for (local1703 = 25; local1703 < 172; local1703++) {
					if (this.aClass3_Sub1_Sub1_Sub1_14.aByteArray1[local1703 + local1641 * this.aClass3_Sub1_Sub1_Sub1_14.anInt39] == 0 && (local1703 > 34 || local1641 > 34)) {
						if (local1643 == 999) {
							local1643 = local1703;
						}
					} else if (local1643 != 999) {
						local1645 = local1703;
						break;
					}
				}
				this.anIntArray258[local1641 - 5] = local1643 - 25;
				this.anIntArray251[local1641 - 5] = local1645 - local1643;
			}
			Class3_Sub1_Sub1_Sub3.method448(96, 479, aBoolean288);
			this.anIntArray270 = Class3_Sub1_Sub1_Sub3.anIntArray146;
			Class3_Sub1_Sub1_Sub3.method448(261, 190, aBoolean288);
			this.anIntArray271 = Class3_Sub1_Sub1_Sub3.anIntArray146;
			Class3_Sub1_Sub1_Sub3.method448(334, 512, aBoolean288);
			this.anIntArray272 = Class3_Sub1_Sub1_Sub3.anIntArray146;
			@Pc(1787) int[] local1787 = new int[9];
			for (local1645 = 0; local1645 < 9; local1645++) {
				local1703 = local1645 * 32 + 128 + 15;
				@Pc(1805) int local1805 = local1703 * 3 + 600;
				@Pc(1809) int local1809 = Class3_Sub1_Sub1_Sub3.anIntArray144[local1703];
				local1787[local1645] = local1805 * local1809 >> 16;
			}
			Class25.method271(local1787);
			Class21.method188(local233);
			this.aClass45_1 = new Class45(6, this);
			this.method580(this.aClass45_1, 10);
			Class3_Sub1_Sub2_Sub3.aClient1 = this;
			Class29.aClient2 = this;
			Class42.aClient4 = this;
		} catch (@Pc(1850) Exception local1850) {
			signlink.reporterror("loaderror " + this.aString30 + " " + this.anInt974);
			this.aBoolean264 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method659() {
		try {
			for (@Pc(15) Class3_Sub2 local15 = (Class3_Sub2) this.aClass27_10.method305(); local15 != null; local15 = (Class3_Sub2) this.aClass27_10.method307()) {
				if (local15.anInt201 == -1) {
					local15.anInt202 = 0;
					this.method597(local15);
				} else {
					local15.method535();
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("20515, " + 6 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method660(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt925 != 0) {
				@Pc(5) int local5 = 0;
				if (this.anInt1041 != 0) {
					local5 = 1;
				}
				for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
					if (this.aStringArray11[local12] != null) {
						@Pc(24) int local24 = this.anIntArray237[local12];
						@Pc(29) String local29 = this.aStringArray10[local12];
						if (local29 != null && local29.startsWith("@cr1@")) {
							local29 = local29.substring(5);
						}
						if (local29 != null && local29.startsWith("@cr2@")) {
							local29 = local29.substring(5);
						}
						if ((local24 == 3 || local24 == 7) && (local24 == 7 || this.anInt1020 == 0 || this.anInt1020 == 1 && this.method608(local29, this.aByte26))) {
							@Pc(83) int local83 = 329 - local5 * 13;
							if (super.anInt823 > 4 && super.anInt824 - 4 > local83 - 10 && super.anInt824 - 4 <= local83 + 3) {
								@Pc(122) int local122 = this.aClass3_Sub1_Sub1_Sub2_3.method87("From:  " + local29 + this.aStringArray11[local12]) + 25;
								if (local122 > 450) {
									local122 = 450;
								}
								if (super.anInt823 < local122 + 4) {
									if (this.anInt876 >= 1) {
										this.aStringArray9[this.anInt857] = "Report abuse @whi@" + local29;
										this.anIntArray267[this.anInt857] = 2629;
										this.anInt857++;
									}
									this.aStringArray9[this.anInt857] = "Add ignore @whi@" + local29;
									this.anIntArray267[this.anInt857] = 2051;
									this.anInt857++;
									this.aStringArray9[this.anInt857] = "Add friend @whi@" + local29;
									this.anIntArray267[this.anInt857] = 2079;
									this.anInt857++;
								}
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local24 == 5 || local24 == 6) && this.anInt1020 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
				@Pc(237) boolean local237 = false;
			}
		} catch (@Pc(239) RuntimeException local239) {
			signlink.reporterror("20398, " + arg0 + ", " + local239.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!IMUIZRAF;Lclient!SJUCHLXH;IIB)V")
	private void method661(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) Class3_Sub1_Sub2_Sub1_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(18) int local18;
			if ((arg2 & 0x10) != 0) {
				local18 = arg0.method166();
				@Pc(21) byte[] local21 = new byte[local18];
				@Pc(27) Class3_Sub1_Sub3 local27 = new Class3_Sub1_Sub3(0, local21);
				arg0.method182(local18, local21);
				this.aClass3_Sub1_Sub3Array1[arg3] = local27;
				arg1.method388(local27);
			}
			@Pc(54) int local54;
			if ((arg2 & 0x8) != 0) {
				local18 = arg0.method165();
				local54 = arg0.method166();
				arg1.method384(local54, anInt1054, local18);
				arg1.anInt569 = anInt1054 + 300;
				arg1.anInt570 = arg0.method166();
				arg1.anInt571 = arg0.method165();
			}
			@Pc(103) int local103;
			if ((arg2 & 0x80) != 0) {
				local18 = arg0.method175();
				if (local18 == 65535) {
					local18 = -1;
				}
				local54 = arg0.method146();
				if (local18 == arg1.anInt526 && local18 != -1) {
					local103 = Class49.aClass49Array1[local18].anInt794;
					if (local103 == 1) {
						arg1.anInt527 = 0;
						arg1.anInt528 = 0;
						arg1.anInt529 = local54;
						arg1.anInt530 = 0;
					}
					if (local103 == 2) {
						arg1.anInt530 = 0;
					}
				} else if (local18 == -1 || arg1.anInt526 == -1 || Class49.aClass49Array1[local18].anInt788 >= Class49.aClass49Array1[arg1.anInt526].anInt788) {
					arg1.anInt526 = local18;
					arg1.anInt527 = 0;
					arg1.anInt528 = 0;
					arg1.anInt529 = local54;
					arg1.anInt530 = 0;
					arg1.anInt541 = arg1.anInt557;
				}
			}
			if ((arg2 & 0x20) != 0) {
				arg1.anInt531 = arg0.method148();
				if (arg1.anInt531 == 65535) {
					arg1.anInt531 = -1;
				}
			}
			if ((arg2 & 0x100) != 0) {
				local18 = arg0.method167();
				local54 = arg0.method167();
				arg1.method384(local54, anInt1054, local18);
				arg1.anInt569 = anInt1054 + 300;
				arg1.anInt570 = arg0.method146();
				arg1.anInt571 = arg0.method167();
			}
			if ((arg2 & 0x200) != 0) {
				arg1.anInt542 = arg0.method146();
				arg1.anInt544 = arg0.method146();
				arg1.anInt543 = arg0.method167();
				arg1.anInt545 = arg0.method146();
				arg1.anInt546 = arg0.method148() + anInt1054;
				arg1.anInt547 = arg0.method175() + anInt1054;
				arg1.anInt548 = arg0.method146();
				arg1.method383();
			}
			if ((arg2 & 0x40) != 0) {
				local18 = arg0.method175();
				local54 = arg0.method167();
				local103 = arg0.method146();
				@Pc(268) int local268 = arg0.anInt243;
				if (arg1.aString13 != null && arg1.aBoolean176) {
					@Pc(278) long local278 = Class23.method226(arg1.aString13);
					@Pc(280) boolean local280 = false;
					if (local54 <= 1) {
						for (@Pc(285) int local285 = 0; local285 < this.anInt977; local285++) {
							if (this.aLongArray3[local285] == local278) {
								local280 = true;
								break;
							}
						}
					}
					if (!local280 && this.anInt1029 == 0) {
						try {
							this.aClass3_Sub1_Sub3_8.anInt243 = 0;
							arg0.method183(this.aClass3_Sub1_Sub3_8.aByteArray5, local103);
							this.aClass3_Sub1_Sub3_8.anInt243 = 0;
							@Pc(331) String local331 = Class18.method184(this.aBoolean286, this.aClass3_Sub1_Sub3_8, local103);
							@Pc(335) String local335 = Class21.method198(local331, 852);
							arg1.aString12 = local335;
							arg1.anInt536 = local18 >> 8;
							arg1.anInt559 = local18 & 0xFF;
							arg1.anInt540 = 150;
							if (local54 == 2 || local54 == 3) {
								this.method667(1, "@cr2@" + arg1.aString13, local335);
							} else if (local54 == 1) {
								this.method667(1, "@cr1@" + arg1.aString13, local335);
							} else {
								this.method667(2, arg1.aString13, local335);
							}
						} catch (@Pc(399) Exception local399) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg0.anInt243 = local268 + local103;
			}
			if ((arg2 & 0x2) != 0) {
				arg1.aString12 = arg0.method153();
				if (arg1.aString12.charAt(0) == '~') {
					arg1.aString12 = arg1.aString12.substring(1);
					this.method667(2, arg1.aString13, arg1.aString12);
				} else if (arg1 == aClass3_Sub1_Sub2_Sub1_Sub2_1) {
					this.method667(2, arg1.aString13, arg1.aString12);
				}
				arg1.anInt536 = 0;
				arg1.anInt559 = 0;
				arg1.anInt540 = 150;
			}
			if ((arg2 & 0x1) != 0) {
				arg1.anInt537 = arg0.method148();
				arg1.anInt538 = arg0.method148();
			}
			if ((arg2 & 0x400) != 0) {
				arg1.anInt561 = arg0.method148();
				local18 = arg0.method179();
				arg1.anInt565 = local18 >> 16;
				arg1.anInt564 = anInt1054 + (local18 & 0xFFFF);
				arg1.anInt562 = 0;
				arg1.anInt563 = 0;
				if (arg1.anInt564 > anInt1054) {
					arg1.anInt562 = -1;
				}
				if (arg1.anInt561 == 65535) {
					arg1.anInt561 = -1;
					return;
				}
			}
		} catch (@Pc(515) RuntimeException local515) {
			signlink.reporterror("58082, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local515.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method662() {
		try {
			this.aClass36_25.method391();
			@Pc(18) int local18;
			@Pc(20) int local20;
			if (this.anInt942 == 2) {
				@Pc(13) byte[] local13 = this.aClass3_Sub1_Sub1_Sub1_14.aByteArray1;
				@Pc(15) int[] local15 = Class3_Sub1_Sub1.anIntArray203;
				local18 = local13.length;
				for (local20 = 0; local20 < local18; local20++) {
					if (local13[local20] == 0) {
						local15[local20] = 0;
					}
				}
				this.aClass3_Sub1_Sub1_Sub4_8.method558(this.anInt966, 33, this.anIntArray236, 25, 0, 0, 33, 256, this.anIntArray273, 25);
				this.aClass36_26.method391();
			} else {
				@Pc(64) int local64 = this.anInt966 + this.anInt914 & 0x7FF;
				@Pc(71) int local71 = aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt533 / 32 + 48;
				local18 = 464 - aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt534 / 32;
				this.aClass3_Sub1_Sub1_Sub4_11.method558(local64, 151, this.anIntArray251, local71, 5, 25, 146, this.anInt903 + 256, this.anIntArray258, local18);
				this.aClass3_Sub1_Sub1_Sub4_8.method558(this.anInt966, 33, this.anIntArray236, 25, 0, 0, 33, 256, this.anIntArray273, 25);
				for (local20 = 0; local20 < this.anInt877; local20++) {
					local71 = this.anIntArray226[local20] * 4 + 2 - aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt533 / 32;
					local18 = this.anIntArray227[local20] * 4 + 2 - aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt534 / 32;
					this.method585(local71, this.aClass3_Sub1_Sub1_Sub4Array6[local20], local18);
				}
				@Pc(169) int local169;
				for (@Pc(165) int local165 = 0; local165 < 104; local165++) {
					for (local169 = 0; local169 < 104; local169++) {
						@Pc(181) Class27 local181 = this.aClass27ArrayArrayArray1[this.anInt911][local165][local169];
						if (local181 != null) {
							local71 = local165 * 4 + 2 - aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt533 / 32;
							local18 = local169 * 4 + 2 - aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt534 / 32;
							this.method585(local71, this.aClass3_Sub1_Sub1_Sub4_3, local18);
						}
					}
				}
				for (local169 = 0; local169 < this.anInt902; local169++) {
					@Pc(232) Class3_Sub1_Sub2_Sub1_Sub1 local232 = this.aClass3_Sub1_Sub2_Sub1_Sub1Array1[this.anIntArray232[local169]];
					if (local232 != null && local232.method387()) {
						@Pc(241) Class42 local241 = local232.aClass42_1;
						if (local241.anIntArray155 != null) {
							local241 = local241.method478();
						}
						if (local241 != null && local241.aBoolean212 && local241.aBoolean215) {
							local71 = local232.anInt533 / 32 - aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt533 / 32;
							local18 = local232.anInt534 / 32 - aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt534 / 32;
							this.method585(local71, this.aClass3_Sub1_Sub1_Sub4_4, local18);
						}
					}
				}
				@Pc(300) Class3_Sub1_Sub2_Sub1_Sub2 local300;
				for (@Pc(290) int local290 = 0; local290 < this.anInt1018; local290++) {
					local300 = this.aClass3_Sub1_Sub2_Sub1_Sub2Array1[this.anIntArray255[local290]];
					if (local300 != null && local300.method387()) {
						local71 = local300.anInt533 / 32 - aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt533 / 32;
						local18 = local300.anInt534 / 32 - aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt534 / 32;
						@Pc(328) boolean local328 = false;
						@Pc(332) long local332 = Class23.method226(local300.aString13);
						for (@Pc(334) int local334 = 0; local334 < this.anInt1037; local334++) {
							if (local332 == this.aLongArray4[local334] && this.anIntArray257[local334] != 0) {
								local328 = true;
								break;
							}
						}
						@Pc(359) boolean local359 = false;
						if (aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt574 != 0 && local300.anInt574 != 0 && aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt574 == local300.anInt574) {
							local359 = true;
						}
						if (local328) {
							this.method585(local71, this.aClass3_Sub1_Sub1_Sub4_6, local18);
						} else if (local359) {
							this.method585(local71, this.aClass3_Sub1_Sub1_Sub4_7, local18);
						} else {
							this.method585(local71, this.aClass3_Sub1_Sub1_Sub4_5, local18);
						}
					}
				}
				if (this.anInt928 != 0 && anInt1054 % 20 < 10) {
					if (this.anInt928 == 1 && this.anInt1023 >= 0 && this.anInt1023 < this.aClass3_Sub1_Sub2_Sub1_Sub1Array1.length) {
						@Pc(433) Class3_Sub1_Sub2_Sub1_Sub1 local433 = this.aClass3_Sub1_Sub2_Sub1_Sub1Array1[this.anInt1023];
						if (local433 != null) {
							local71 = local433.anInt533 / 32 - aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt533 / 32;
							local18 = local433.anInt534 / 32 - aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt534 / 32;
							this.method627(this.aClass3_Sub1_Sub1_Sub4_13, local71, this.anInt858, local18);
						}
					}
					if (this.anInt928 == 2) {
						local71 = (this.anInt1032 - this.anInt919) * 4 + 2 - aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt533 / 32;
						local18 = (this.anInt1033 - this.anInt920) * 4 + 2 - aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt534 / 32;
						this.method627(this.aClass3_Sub1_Sub1_Sub4_13, local71, this.anInt858, local18);
					}
					if (this.anInt928 == 10 && this.anInt945 >= 0 && this.anInt945 < this.aClass3_Sub1_Sub2_Sub1_Sub2Array1.length) {
						local300 = this.aClass3_Sub1_Sub2_Sub1_Sub2Array1[this.anInt945];
						if (local300 != null) {
							local71 = local300.anInt533 / 32 - aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt533 / 32;
							local18 = local300.anInt534 / 32 - aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt534 / 32;
							this.method627(this.aClass3_Sub1_Sub1_Sub4_13, local71, this.anInt858, local18);
						}
					}
				}
				if (this.anInt996 != 0) {
					local71 = this.anInt996 * 4 + 2 - aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt533 / 32;
					local18 = this.anInt997 * 4 + 2 - aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt534 / 32;
					this.method585(local71, this.aClass3_Sub1_Sub1_Sub4_12, local18);
				}
				Class3_Sub1_Sub1.method542(16777215, 97, 3, 3, 78);
				this.aClass36_26.method391();
			}
		} catch (@Pc(601) RuntimeException local601) {
			signlink.reporterror("88618, " + 0 + ", " + local601.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method663(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			if (this.aClass36_15 == null) {
				super.aClass36_2 = null;
				this.aClass36_27 = null;
				this.aClass36_25 = null;
				this.aClass36_24 = null;
				this.aClass36_26 = null;
				this.aClass36_3 = null;
				this.aClass36_4 = null;
				this.aClass36_5 = null;
				this.aClass36_18 = new Class36(265, 13856, 128, this.method579((byte) 2));
				Class3_Sub1_Sub1.method540();
				this.aClass36_19 = new Class36(265, 13856, 128, this.method579((byte) 2));
				Class3_Sub1_Sub1.method540();
				this.aClass36_15 = new Class36(171, 13856, 509, this.method579((byte) 2));
				Class3_Sub1_Sub1.method540();
				this.aClass36_16 = new Class36(132, 13856, 360, this.method579((byte) 2));
				Class3_Sub1_Sub1.method540();
				this.aClass36_17 = new Class36(200, 13856, 360, this.method579((byte) 2));
				Class3_Sub1_Sub1.method540();
				this.aClass36_20 = new Class36(238, 13856, 202, this.method579((byte) 2));
				Class3_Sub1_Sub1.method540();
				this.aClass36_21 = new Class36(238, 13856, 203, this.method579((byte) 2));
				Class3_Sub1_Sub1.method540();
				this.aClass36_22 = new Class36(94, 13856, 74, this.method579((byte) 2));
				Class3_Sub1_Sub1.method540();
				this.aClass36_23 = new Class36(94, 13856, 75, this.method579((byte) 2));
				Class3_Sub1_Sub1.method540();
				if (this.aClass5_1 != null) {
					this.method634();
					this.method584();
				}
				this.aBoolean285 = true;
			}
		} catch (@Pc(166) RuntimeException local166) {
			signlink.reporterror("80983, " + arg0 + ", " + local166.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)Z")
	private boolean method664(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(8) int local8 = this.anIntArray267[arg0];
			if (local8 >= 2000) {
				local8 -= 2000;
			}
			return local8 == 79;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("9545, " + -101 + ", " + arg0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)Z")
	private boolean method665() {
		try {
			if (this.aClass16_1 == null) {
				return false;
			}
			@Pc(299) String local299;
			@Pc(495) int local495;
			try {
				@Pc(18) int local18 = this.aClass16_1.method128();
				if (local18 == 0) {
					return false;
				}
				if (this.anInt1010 == -1) {
					this.aClass16_1.method129(this.aClass3_Sub1_Sub3_7.aByteArray5, 0, 1);
					this.anInt1010 = this.aClass3_Sub1_Sub3_7.aByteArray5[0] & 0xFF;
					if (this.aClass46_2 != null) {
						this.anInt1010 = this.anInt1010 - this.aClass46_2.method499() & 0xFF;
					}
					this.anInt1009 = Class26.anIntArray77[this.anInt1010];
					local18--;
				}
				if (this.anInt1009 == -1) {
					if (local18 <= 0) {
						return false;
					}
					this.aClass16_1.method129(this.aClass3_Sub1_Sub3_7.aByteArray5, 0, 1);
					this.anInt1009 = this.aClass3_Sub1_Sub3_7.aByteArray5[0] & 0xFF;
					local18--;
				}
				if (this.anInt1009 == -2) {
					if (local18 <= 1) {
						return false;
					}
					this.aClass16_1.method129(this.aClass3_Sub1_Sub3_7.aByteArray5, 0, 2);
					this.aClass3_Sub1_Sub3_7.anInt243 = 0;
					this.anInt1009 = this.aClass3_Sub1_Sub3_7.method148();
					local18 -= 2;
				}
				if (local18 < this.anInt1009) {
					return false;
				}
				this.aClass3_Sub1_Sub3_7.anInt243 = 0;
				this.aClass16_1.method129(this.aClass3_Sub1_Sub3_7.aByteArray5, 0, this.anInt1009);
				this.anInt1011 = 0;
				this.anInt936 = this.anInt935;
				this.anInt935 = this.anInt934;
				this.anInt934 = this.anInt1010;
				if (this.anInt1010 == 44) {
					this.anInt942 = this.aClass3_Sub1_Sub3_7.method146();
					this.anInt1010 = -1;
					return true;
				}
				@Pc(177) int local177;
				if (this.anInt1010 == 117) {
					local177 = this.aClass3_Sub1_Sub3_7.method173();
					this.method671(local177);
					if (this.anInt867 != -1) {
						this.anInt867 = -1;
						this.aBoolean249 = true;
					}
					if (this.anInt1006 != 0) {
						this.anInt1006 = 0;
						this.aBoolean249 = true;
					}
					this.anInt958 = local177;
					this.aBoolean281 = true;
					this.aBoolean262 = true;
					this.anInt888 = -1;
					this.aBoolean255 = false;
					this.anInt1010 = -1;
					return true;
				}
				if (this.anInt1010 == 253) {
					this.aBoolean284 = true;
					this.anInt1057 = this.aClass3_Sub1_Sub3_7.method146();
					this.anInt1058 = this.aClass3_Sub1_Sub3_7.method146();
					this.anInt1059 = this.aClass3_Sub1_Sub3_7.method148();
					this.anInt1060 = this.aClass3_Sub1_Sub3_7.method146();
					this.anInt1061 = this.aClass3_Sub1_Sub3_7.method146();
					if (this.anInt1061 >= 100) {
						this.anInt871 = this.anInt1057 * 128 + 64;
						this.anInt873 = this.anInt1058 * 128 + 64;
						this.anInt872 = this.method629(this.anInt873, this.anInt911, this.anInt871) - this.anInt1059;
					}
					this.anInt1010 = -1;
					return true;
				}
				@Pc(317) int local317;
				@Pc(315) boolean local315;
				@Pc(450) String local450;
				if (this.anInt1010 == 177) {
					local299 = this.aClass3_Sub1_Sub3_7.method153();
					@Pc(313) long local313;
					@Pc(310) String local310;
					if (local299.endsWith(":tradereq:")) {
						local310 = local299.substring(0, local299.indexOf(":"));
						local313 = Class23.method226(local310);
						local315 = false;
						for (local317 = 0; local317 < this.anInt977; local317++) {
							if (this.aLongArray3[local317] == local313) {
								local315 = true;
								break;
							}
						}
						if (!local315 && this.anInt1029 == 0) {
							this.method667(4, local310, "wishes to trade with you.");
						}
					} else if (local299.endsWith(":duelreq:")) {
						local310 = local299.substring(0, local299.indexOf(":"));
						local313 = Class23.method226(local310);
						local315 = false;
						for (local317 = 0; local317 < this.anInt977; local317++) {
							if (this.aLongArray3[local317] == local313) {
								local315 = true;
								break;
							}
						}
						if (!local315 && this.anInt1029 == 0) {
							this.method667(8, local310, "wishes to duel with you.");
						}
					} else if (local299.endsWith(":chalreq:")) {
						local310 = local299.substring(0, local299.indexOf(":"));
						local313 = Class23.method226(local310);
						local315 = false;
						for (local317 = 0; local317 < this.anInt977; local317++) {
							if (this.aLongArray3[local317] == local313) {
								local315 = true;
								break;
							}
						}
						if (!local315 && this.anInt1029 == 0) {
							local450 = local299.substring(local299.indexOf(":") + 1, local299.length() - 9);
							this.method667(8, local310, local450);
						}
					} else {
						this.method667(0, "", local299);
					}
					this.anInt1010 = -1;
					return true;
				}
				if (this.anInt1010 == 179) {
					this.anInt996 = 0;
					this.anInt1010 = -1;
					return true;
				}
				@Pc(499) Class35 local499;
				if (this.anInt1010 == 254) {
					local177 = this.aClass3_Sub1_Sub3_7.method173();
					local495 = this.aClass3_Sub1_Sub3_7.method176((byte) 5);
					local499 = Class35.aClass35Array1[local177];
					local499.anInt498 = local495;
					if (local495 == -1) {
						local499.anInt489 = 0;
						local499.anInt490 = 0;
					}
					this.anInt1010 = -1;
					return true;
				}
				if (this.anInt1010 == 239) {
					local177 = this.aClass3_Sub1_Sub3_7.method174();
					Class35.aClass35Array1[local177].anInt501 = 3;
					if (aClass3_Sub1_Sub2_Sub1_Sub2_1.aClass42_2 == null) {
						Class35.aClass35Array1[local177].anInt502 = (aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray118[0] << 25) + (aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray118[4] << 20) + (aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray117[0] << 15) + (aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray117[8] << 10) + (aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray117[11] << 5) + aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray117[1];
					} else {
						Class35.aClass35Array1[local177].anInt502 = (int) (aClass3_Sub1_Sub2_Sub1_Sub2_1.aClass42_2.aLong24 + 305419896L);
					}
					this.anInt1010 = -1;
					return true;
				}
				if (this.anInt1010 == 62) {
					this.anInt977 = this.anInt1009 / 8;
					for (local177 = 0; local177 < this.anInt977; local177++) {
						this.aLongArray3[local177] = this.aClass3_Sub1_Sub3_7.method152();
					}
					this.anInt1010 = -1;
					return true;
				}
				@Pc(646) int local646;
				@Pc(650) int local650;
				@Pc(654) int local654;
				@Pc(640) Class35 local640;
				if (this.anInt1010 == 156) {
					this.aBoolean281 = true;
					local177 = this.aClass3_Sub1_Sub3_7.method148();
					local640 = Class35.aClass35Array1[local177];
					while (this.aClass3_Sub1_Sub3_7.anInt243 < this.anInt1009) {
						local646 = this.aClass3_Sub1_Sub3_7.method160();
						local650 = this.aClass3_Sub1_Sub3_7.method148();
						local654 = this.aClass3_Sub1_Sub3_7.method146();
						if (local654 == 255) {
							local654 = this.aClass3_Sub1_Sub3_7.method151();
						}
						if (local646 >= 0 && local646 < local640.anIntArray109.length) {
							local640.anIntArray109[local646] = local650;
							local640.anIntArray104[local646] = local654;
						}
					}
					this.anInt1010 = -1;
					return true;
				}
				if (this.anInt1010 == 22) {
					this.anInt1044 = this.aClass3_Sub1_Sub3_7.method167();
					this.aBoolean281 = true;
					this.aBoolean262 = true;
					this.anInt1010 = -1;
					return true;
				}
				if (this.anInt1010 == 144) {
					for (local177 = 0; local177 < this.anIntArray224.length; local177++) {
						if (this.anIntArray224[local177] != this.anIntArray269[local177]) {
							this.anIntArray224[local177] = this.anIntArray269[local177];
							this.method609(this.anInt923, local177);
							this.aBoolean281 = true;
						}
					}
					this.anInt1010 = -1;
					return true;
				}
				if (this.anInt1010 == 163) {
					if (this.anInt958 != -1) {
						this.anInt958 = -1;
						this.aBoolean281 = true;
						this.aBoolean262 = true;
					}
					if (this.anInt867 != -1) {
						this.anInt867 = -1;
						this.aBoolean249 = true;
					}
					if (this.anInt1006 != 0) {
						this.anInt1006 = 0;
						this.aBoolean249 = true;
					}
					this.anInt888 = -1;
					this.aBoolean255 = false;
					this.anInt1010 = -1;
					return true;
				}
				if (this.anInt1010 == 86) {
					local177 = this.aClass3_Sub1_Sub3_7.method173();
					local495 = this.aClass3_Sub1_Sub3_7.method174();
					local646 = this.aClass3_Sub1_Sub3_7.method148();
					Class35.aClass35Array1[local646].anInt519 = (local495 << 16) + local177;
					this.anInt1010 = -1;
					return true;
				}
				if (this.anInt1010 == 69) {
					this.method645(963, this.anInt1009, this.aClass3_Sub1_Sub3_7);
					this.aBoolean270 = false;
					this.anInt1010 = -1;
					return true;
				}
				@Pc(975) int local975;
				@Pc(1008) int local1008;
				@Pc(861) long local861;
				if (this.anInt1010 == 155) {
					local861 = this.aClass3_Sub1_Sub3_7.method152();
					local646 = this.aClass3_Sub1_Sub3_7.method146();
					@Pc(871) String local871 = Class23.method230(Class23.method227(local861));
					for (local654 = 0; local654 < this.anInt1037; local654++) {
						if (local861 == this.aLongArray4[local654]) {
							if (this.anIntArray257[local654] != local646) {
								this.anIntArray257[local654] = local646;
								this.aBoolean281 = true;
								if (local646 > 0) {
									this.method667(5, "", local871 + " has logged in.");
								}
								if (local646 == 0) {
									this.method667(5, "", local871 + " has logged out.");
								}
							}
							local871 = null;
							break;
						}
					}
					if (local871 != null && this.anInt1037 < 200) {
						this.aLongArray4[this.anInt1037] = local861;
						this.aStringArray12[this.anInt1037] = local871;
						this.anIntArray257[this.anInt1037] = local646;
						this.anInt1037++;
						this.aBoolean281 = true;
					}
					@Pc(969) boolean local969 = false;
					while (!local969) {
						local969 = true;
						for (local975 = 0; local975 < this.anInt1037 - 1; local975++) {
							if (this.anIntArray257[local975] != anInt912 && this.anIntArray257[local975 + 1] == anInt912 || this.anIntArray257[local975] == 0 && this.anIntArray257[local975 + 1] != 0) {
								local1008 = this.anIntArray257[local975];
								this.anIntArray257[local975] = this.anIntArray257[local975 + 1];
								this.anIntArray257[local975 + 1] = local1008;
								@Pc(1030) String local1030 = this.aStringArray12[local975];
								this.aStringArray12[local975] = this.aStringArray12[local975 + 1];
								this.aStringArray12[local975 + 1] = local1030;
								@Pc(1052) long local1052 = this.aLongArray4[local975];
								this.aLongArray4[local975] = this.aLongArray4[local975 + 1];
								this.aLongArray4[local975 + 1] = local1052;
								this.aBoolean281 = true;
								local969 = false;
							}
						}
					}
					this.anInt1010 = -1;
					return true;
				}
				if (this.anInt1010 == 213) {
					this.method590(this.anInt1009, this.aClass3_Sub1_Sub3_7);
					this.anInt1010 = -1;
					return true;
				}
				if (this.anInt1010 == 60) {
					local177 = this.aClass3_Sub1_Sub3_7.method175();
					local495 = this.aClass3_Sub1_Sub3_7.method148();
					local646 = this.aClass3_Sub1_Sub3_7.method173();
					local650 = this.aClass3_Sub1_Sub3_7.method175();
					Class35.aClass35Array1[local646].anInt496 = local650;
					Class35.aClass35Array1[local646].anInt497 = local495;
					Class35.aClass35Array1[local646].anInt495 = local177;
					this.anInt1010 = -1;
					return true;
				}
				if (this.anInt1010 == 153) {
					this.anInt961 = this.aClass3_Sub1_Sub3_7.method148();
					this.anInt1022 = this.aClass3_Sub1_Sub3_7.method167();
					this.anInt1010 = -1;
					return true;
				}
				if (this.anInt1010 == 85) {
					@Pc(1176) byte local1176 = this.aClass3_Sub1_Sub3_7.method169();
					local495 = this.aClass3_Sub1_Sub3_7.method173();
					this.anIntArray269[local495] = local1176;
					if (this.anIntArray224[local495] != local1176) {
						this.anIntArray224[local495] = local1176;
						this.method609(this.anInt923, local495);
						this.aBoolean281 = true;
						if (this.anInt988 != -1) {
							this.aBoolean249 = true;
						}
					}
					this.anInt1010 = -1;
					return true;
				}
				if (this.anInt1010 == 252) {
					this.anInt1041 = this.aClass3_Sub1_Sub3_7.method148() * 30;
					this.anInt1010 = -1;
					return true;
				}
				if (this.anInt1010 != 66 && this.anInt1010 != 97) {
					if (this.anInt1010 == 6) {
						local177 = this.aClass3_Sub1_Sub3_7.method174();
						local495 = this.aClass3_Sub1_Sub3_7.method148();
						local499 = Class35.aClass35Array1[local495];
						if (local499 != null && local499.anInt514 == 0) {
							if (local177 < 0) {
								local177 = 0;
							}
							if (local177 > local499.anInt488 - local499.anInt512) {
								local177 = local499.anInt488 - local499.anInt512;
							}
							local499.anInt511 = local177;
						}
						this.anInt1010 = -1;
						return true;
					}
					if (this.anInt1010 != 76 && this.anInt1010 != 147 && this.anInt1010 != 54 && this.anInt1010 != 243 && this.anInt1010 != 100 && this.anInt1010 != 96 && this.anInt1010 != 9 && this.anInt1010 != 107 && this.anInt1010 != 222 && this.anInt1010 != 211 && this.anInt1010 != 94) {
						if (this.anInt1010 == 64) {
							this.anInt928 = this.aClass3_Sub1_Sub3_7.method146();
							if (this.anInt928 == 1) {
								this.anInt1023 = this.aClass3_Sub1_Sub3_7.method148();
							}
							if (this.anInt928 >= 2 && this.anInt928 <= 6) {
								if (this.anInt928 == 2) {
									this.anInt1035 = 64;
									this.anInt1036 = 64;
								}
								if (this.anInt928 == 3) {
									this.anInt1035 = 0;
									this.anInt1036 = 64;
								}
								if (this.anInt928 == 4) {
									this.anInt1035 = 128;
									this.anInt1036 = 64;
								}
								if (this.anInt928 == 5) {
									this.anInt1035 = 64;
									this.anInt1036 = 0;
								}
								if (this.anInt928 == 6) {
									this.anInt1035 = 64;
									this.anInt1036 = 128;
								}
								this.anInt928 = 2;
								this.anInt1032 = this.aClass3_Sub1_Sub3_7.method148();
								this.anInt1033 = this.aClass3_Sub1_Sub3_7.method148();
								this.anInt1034 = this.aClass3_Sub1_Sub3_7.method146();
							}
							if (this.anInt928 == 10) {
								this.anInt945 = this.aClass3_Sub1_Sub3_7.method148();
							}
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 16) {
							local177 = this.aClass3_Sub1_Sub3_7.method174();
							local640 = Class35.aClass35Array1[local177];
							for (local646 = 0; local646 < local640.anIntArray109.length; local646++) {
								local640.anIntArray109[local646] = -1;
								local640.anIntArray109[local646] = 0;
							}
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 152) {
							local177 = this.aClass3_Sub1_Sub3_7.method148();
							this.method671(local177);
							if (this.anInt958 != -1) {
								this.anInt958 = -1;
								this.aBoolean281 = true;
								this.aBoolean262 = true;
							}
							this.anInt867 = local177;
							this.aBoolean249 = true;
							this.anInt888 = -1;
							this.aBoolean255 = false;
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 40) {
							this.method707();
							this.anInt1010 = -1;
							return false;
						}
						if (this.anInt1010 == 208) {
							this.anInt1045 = this.aClass3_Sub1_Sub3_7.method146();
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 203) {
							local177 = this.aClass3_Sub1_Sub3_7.method148();
							local495 = this.aClass3_Sub1_Sub3_7.method174();
							local646 = this.aClass3_Sub1_Sub3_7.method175();
							if (local646 == 65535) {
								Class35.aClass35Array1[local177].anInt501 = 0;
								this.anInt1010 = -1;
								return true;
							}
							@Pc(2478) Class34 local2478 = Class34.method361(local646);
							Class35.aClass35Array1[local177].anInt501 = 4;
							Class35.aClass35Array1[local177].anInt502 = local646;
							Class35.aClass35Array1[local177].anInt496 = local2478.anInt465;
							Class35.aClass35Array1[local177].anInt497 = local2478.anInt457;
							Class35.aClass35Array1[local177].anInt495 = local2478.anInt471 * 100 / local495;
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 240) {
							local177 = this.aClass3_Sub1_Sub3_7.method148();
							local495 = this.aClass3_Sub1_Sub3_7.method148();
							Class35.aClass35Array1[local495].anInt501 = 2;
							Class35.aClass35Array1[local495].anInt502 = local177;
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 204) {
							@Pc(2556) boolean local2556 = this.aClass3_Sub1_Sub3_7.method167() == 1;
							local495 = this.aClass3_Sub1_Sub3_7.method173();
							Class35.aClass35Array1[local495].aBoolean158 = local2556;
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 205) {
							local177 = this.aClass3_Sub1_Sub3_7.method174();
							if (local177 == 65535) {
								local177 = -1;
							}
							if (local177 != this.anInt947 && this.aBoolean247 && !aBoolean258 && this.anInt868 == 0) {
								this.anInt929 = local177;
								this.aBoolean260 = true;
								this.aClass19_Sub1_1.method406(2, this.anInt929);
							}
							this.anInt947 = local177;
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 194) {
							local177 = this.aClass3_Sub1_Sub3_7.method148();
							local495 = this.aClass3_Sub1_Sub3_7.method150();
							if (this.aBoolean247 && !aBoolean258) {
								this.anInt929 = local177;
								this.aBoolean260 = false;
								this.aClass19_Sub1_1.method406(2, this.anInt929);
								this.anInt868 = local495;
							}
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 73) {
							if (this.anInt1044 == 12) {
								this.aBoolean281 = true;
							}
							this.anInt992 = this.aClass3_Sub1_Sub3_7.method146();
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 167) {
							local299 = this.aClass3_Sub1_Sub3_7.method153();
							local495 = this.aClass3_Sub1_Sub3_7.method174();
							Class35.aClass35Array1[local495].aString8 = local299;
							if (Class35.aClass35Array1[local495].anInt492 == this.anIntArray250[this.anInt1044]) {
								this.aBoolean281 = true;
							}
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 180) {
							local299 = this.aClass3_Sub1_Sub3_7.method153();
							local495 = this.aClass3_Sub1_Sub3_7.method166();
							local646 = this.aClass3_Sub1_Sub3_7.method165();
							if (local646 >= 1 && local646 <= 5) {
								if (local299.equalsIgnoreCase("null")) {
									local299 = null;
								}
								this.aStringArray13[local646 - 1] = local299;
								this.aBooleanArray12[local646 - 1] = local495 == 0;
							}
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 224) {
							local177 = this.aClass3_Sub1_Sub3_7.method146();
							local495 = this.aClass3_Sub1_Sub3_7.method146();
							local646 = this.aClass3_Sub1_Sub3_7.method146();
							local650 = this.aClass3_Sub1_Sub3_7.method146();
							this.aBooleanArray11[local177] = true;
							this.anIntArray235[local177] = local495;
							this.anIntArray221[local177] = local646;
							this.anIntArray220[local177] = local650;
							this.anIntArray234[local177] = 0;
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 114) {
							local177 = this.aClass3_Sub1_Sub3_7.method148();
							local495 = this.aClass3_Sub1_Sub3_7.method146();
							local646 = this.aClass3_Sub1_Sub3_7.method148();
							if (this.aBoolean261 && !aBoolean258 && this.anInt907 < 50) {
								this.anIntArray225[this.anInt907] = local177;
								this.anIntArray223[this.anInt907] = local495;
								this.anIntArray244[this.anInt907] = local646 + Class8.anIntArray27[local177];
								this.anInt907++;
							}
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 4) {
							local177 = this.aClass3_Sub1_Sub3_7.method149();
							local495 = this.aClass3_Sub1_Sub3_7.method174();
							local646 = this.aClass3_Sub1_Sub3_7.method176((byte) 5);
							@Pc(2894) Class35 local2894 = Class35.aClass35Array1[local495];
							local2894.anInt515 = local177;
							local2894.anInt517 = local646;
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 41) {
							local177 = this.aClass3_Sub1_Sub3_7.method146();
							local495 = this.aClass3_Sub1_Sub3_7.method148();
							if (local495 == 65535) {
								local495 = -1;
							}
							this.anIntArray250[local177] = local495;
							this.aBoolean281 = true;
							this.aBoolean262 = true;
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 226) {
							this.aBoolean281 = true;
							local177 = this.aClass3_Sub1_Sub3_7.method148();
							local640 = Class35.aClass35Array1[local177];
							local646 = this.aClass3_Sub1_Sub3_7.method148();
							for (local650 = 0; local650 < local646; local650++) {
								local640.anIntArray109[local650] = this.aClass3_Sub1_Sub3_7.method175();
								local654 = this.aClass3_Sub1_Sub3_7.method167();
								if (local654 == 255) {
									local654 = this.aClass3_Sub1_Sub3_7.method180(this.aByte25);
								}
								local640.anIntArray104[local650] = local654;
							}
							for (local654 = local646; local654 < local640.anIntArray109.length; local654++) {
								local640.anIntArray109[local654] = 0;
								local640.anIntArray104[local654] = 0;
							}
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 170) {
							local177 = this.aClass3_Sub1_Sub3_7.method178();
							local495 = this.aClass3_Sub1_Sub3_7.method175();
							this.anIntArray269[local495] = local177;
							if (this.anIntArray224[local495] != local177) {
								this.anIntArray224[local495] = local177;
								this.method609(this.anInt923, local495);
								this.aBoolean281 = true;
								if (this.anInt988 != -1) {
									this.aBoolean249 = true;
								}
							}
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 88) {
							if (this.anInt1044 == 12) {
								this.aBoolean281 = true;
							}
							this.anInt881 = this.aClass3_Sub1_Sub3_7.method149();
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 32) {
							local177 = this.aClass3_Sub1_Sub3_7.method173();
							local495 = this.aClass3_Sub1_Sub3_7.method175();
							local646 = local495 >> 10 & 0x1F;
							local650 = local495 >> 5 & 0x1F;
							local654 = local495 & 0x1F;
							Class35.aClass35Array1[local177].anInt494 = (local646 << 19) + (local650 << 11) + (local654 << 3);
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 238) {
							this.aBoolean284 = true;
							this.anInt895 = this.aClass3_Sub1_Sub3_7.method146();
							this.anInt896 = this.aClass3_Sub1_Sub3_7.method146();
							this.anInt897 = this.aClass3_Sub1_Sub3_7.method148();
							this.anInt898 = this.aClass3_Sub1_Sub3_7.method146();
							this.anInt899 = this.aClass3_Sub1_Sub3_7.method146();
							if (this.anInt899 >= 100) {
								local177 = this.anInt895 * 128 + 64;
								local495 = this.anInt896 * 128 + 64;
								local646 = this.method629(local495, this.anInt911, local177) - this.anInt897;
								local650 = local177 - this.anInt871;
								local654 = local646 - this.anInt872;
								local317 = local495 - this.anInt873;
								local975 = (int) Math.sqrt((double) (local650 * local650 + local317 * local317));
								this.anInt874 = (int) (Math.atan2((double) local654, (double) local975) * 325.949D) & 0x7FF;
								this.anInt875 = (int) (Math.atan2((double) local650, (double) local317) * -325.949D) & 0x7FF;
								if (this.anInt874 < 128) {
									this.anInt874 = 128;
								}
								if (this.anInt874 > 383) {
									this.anInt874 = 383;
								}
							}
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 98) {
							local177 = this.aClass3_Sub1_Sub3_7.method177();
							if (local177 >= 0) {
								this.method671(local177);
							}
							this.anInt954 = local177;
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 131) {
							this.anInt930 = this.aClass3_Sub1_Sub3_7.method165();
							this.anInt931 = this.aClass3_Sub1_Sub3_7.method166();
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 166) {
							this.anInt882 = this.aClass3_Sub1_Sub3_7.method178();
							this.anInt908 = this.aClass3_Sub1_Sub3_7.method146();
							this.anInt960 = this.aClass3_Sub1_Sub3_7.method175();
							this.anInt926 = this.aClass3_Sub1_Sub3_7.method173();
							this.anInt906 = this.aClass3_Sub1_Sub3_7.method166();
							if (this.anInt882 != 0 && this.anInt888 == -1) {
								signlink.dnslookup(Class23.method229(this.anInt882));
								this.method622();
								@Pc(3362) short local3362 = 650;
								if (this.anInt908 != 201 || this.anInt906 == 1) {
									local3362 = 655;
								}
								this.aString23 = "";
								this.aBoolean266 = false;
								for (local495 = 0; local495 < Class35.aClass35Array1.length; local495++) {
									if (Class35.aClass35Array1[local495] != null && Class35.aClass35Array1[local495].anInt513 == local3362) {
										this.anInt888 = Class35.aClass35Array1[local495].anInt492;
										break;
									}
								}
							}
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 67) {
							local861 = this.aClass3_Sub1_Sub3_7.method152();
							local646 = this.aClass3_Sub1_Sub3_7.method151();
							local650 = this.aClass3_Sub1_Sub3_7.method146();
							local315 = false;
							for (local317 = 0; local317 < 100; local317++) {
								if (this.anIntArray219[local317] == local646) {
									local315 = true;
									break;
								}
							}
							if (local650 <= 1) {
								for (local975 = 0; local975 < this.anInt977; local975++) {
									if (this.aLongArray3[local975] == local861) {
										local315 = true;
										break;
									}
								}
							}
							if (!local315 && this.anInt1029 == 0) {
								try {
									this.anIntArray219[this.anInt1031] = local646;
									this.anInt1031 = (this.anInt1031 + 1) % 100;
									local450 = Class18.method184(this.aBoolean286, this.aClass3_Sub1_Sub3_7, this.anInt1009 - 13);
									if (local650 != 3) {
										local450 = Class21.method198(local450, 852);
									}
									if (local650 == 2 || local650 == 3) {
										this.method667(7, "@cr2@" + Class23.method230(Class23.method227(local861)), local450);
									} else if (local650 == 1) {
										this.method667(7, "@cr1@" + Class23.method230(Class23.method227(local861)), local450);
									} else {
										this.method667(3, Class23.method230(Class23.method227(local861)), local450);
									}
								} catch (@Pc(3563) Exception local3563) {
									signlink.reporterror("cde1");
								}
							}
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 87) {
							this.anInt930 = this.aClass3_Sub1_Sub3_7.method167();
							this.anInt931 = this.aClass3_Sub1_Sub3_7.method146();
							while (this.aClass3_Sub1_Sub3_7.anInt243 < this.anInt1009) {
								local177 = this.aClass3_Sub1_Sub3_7.method146();
								this.method669(local177, this.aClass3_Sub1_Sub3_7);
							}
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 115) {
							this.anInt955 = this.aClass3_Sub1_Sub3_7.method165();
							if (this.anInt955 == this.anInt1044) {
								if (this.anInt955 == 3) {
									this.anInt1044 = 1;
								} else {
									this.anInt1044 = 3;
								}
								this.aBoolean281 = true;
							}
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 0) {
							this.aBoolean267 = false;
							this.anInt1006 = 2;
							this.aString28 = "";
							this.aBoolean249 = true;
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 199) {
							this.aBoolean284 = false;
							for (local177 = 0; local177 < 5; local177++) {
								this.aBooleanArray11[local177] = false;
							}
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 154) {
							this.anInt971 = this.aClass3_Sub1_Sub3_7.method146();
							this.anInt1020 = this.aClass3_Sub1_Sub3_7.method146();
							this.anInt1004 = this.aClass3_Sub1_Sub3_7.method146();
							this.aBoolean246 = true;
							this.aBoolean249 = true;
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 17) {
							this.anInt1038 = this.aClass3_Sub1_Sub3_7.method146();
							this.aBoolean281 = true;
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 92) {
							local177 = this.aClass3_Sub1_Sub3_7.method149();
							this.anInt988 = local177;
							this.aBoolean249 = true;
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 113) {
							local177 = this.aClass3_Sub1_Sub3_7.method174();
							local495 = this.aClass3_Sub1_Sub3_7.method148();
							Class35.aClass35Array1[local495].anInt501 = 1;
							Class35.aClass35Array1[local495].anInt502 = local177;
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 126) {
							this.aBoolean267 = false;
							this.anInt1006 = 1;
							this.aString28 = "";
							this.aBoolean249 = true;
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 145) {
							this.aBoolean281 = true;
							local177 = this.aClass3_Sub1_Sub3_7.method165();
							local495 = this.aClass3_Sub1_Sub3_7.method151();
							local646 = this.aClass3_Sub1_Sub3_7.method166();
							this.anIntArray231[local177] = local495;
							this.anIntArray240[local177] = local646;
							this.anIntArray228[local177] = 1;
							for (local650 = 0; local650 < 98; local650++) {
								if (local495 >= anIntArray254[local650]) {
									this.anIntArray228[local177] = local650 + 2;
								}
							}
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 178) {
							local177 = this.aClass3_Sub1_Sub3_7.method173();
							local495 = this.aClass3_Sub1_Sub3_7.method148();
							if (this.anInt867 != -1) {
								this.anInt867 = -1;
								this.aBoolean249 = true;
							}
							if (this.anInt1006 != 0) {
								this.anInt1006 = 0;
								this.aBoolean249 = true;
							}
							this.anInt888 = local495;
							this.anInt958 = local177;
							this.aBoolean281 = true;
							this.aBoolean262 = true;
							this.aBoolean255 = false;
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 39) {
							this.anInt930 = this.aClass3_Sub1_Sub3_7.method165();
							this.anInt931 = this.aClass3_Sub1_Sub3_7.method146();
							for (local177 = this.anInt930; local177 < this.anInt930 + 8; local177++) {
								for (local495 = this.anInt931; local495 < this.anInt931 + 8; local495++) {
									if (this.aClass27ArrayArrayArray1[this.anInt911][local177][local495] != null) {
										this.aClass27ArrayArrayArray1[this.anInt911][local177][local495] = null;
										this.method636(local177, local495);
									}
								}
							}
							for (@Pc(3985) Class3_Sub2 local3985 = (Class3_Sub2) this.aClass27_10.method305(); local3985 != null; local3985 = (Class3_Sub2) this.aClass27_10.method307()) {
								if (local3985.anInt193 >= this.anInt930 && local3985.anInt193 < this.anInt930 + 8 && local3985.anInt194 >= this.anInt931 && local3985.anInt194 < this.anInt931 + 8 && local3985.anInt191 == this.anInt911) {
									local3985.anInt201 = 0;
								}
							}
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 112) {
							local177 = this.aClass3_Sub1_Sub3_7.method174();
							this.method671(local177);
							if (this.anInt958 != -1) {
								this.anInt958 = -1;
								this.aBoolean281 = true;
								this.aBoolean262 = true;
							}
							if (this.anInt867 != -1) {
								this.anInt867 = -1;
								this.aBoolean249 = true;
							}
							if (this.anInt1006 != 0) {
								this.anInt1006 = 0;
								this.aBoolean249 = true;
							}
							this.anInt888 = local177;
							this.aBoolean255 = false;
							this.anInt1010 = -1;
							return true;
						}
						if (this.anInt1010 == 249) {
							for (local177 = 0; local177 < this.aClass3_Sub1_Sub2_Sub1_Sub2Array1.length; local177++) {
								if (this.aClass3_Sub1_Sub2_Sub1_Sub2Array1[local177] != null) {
									this.aClass3_Sub1_Sub2_Sub1_Sub2Array1[local177].anInt526 = -1;
								}
							}
							for (local495 = 0; local495 < this.aClass3_Sub1_Sub2_Sub1_Sub1Array1.length; local495++) {
								if (this.aClass3_Sub1_Sub2_Sub1_Sub1Array1[local495] != null) {
									this.aClass3_Sub1_Sub2_Sub1_Sub1Array1[local495].anInt526 = -1;
								}
							}
							this.anInt1010 = -1;
							return true;
						}
						signlink.reporterror("T1 - " + this.anInt1010 + "," + this.anInt1009 + " - " + this.anInt935 + "," + this.anInt936);
						this.method707();
						return true;
					}
					this.method669(this.anInt1010, this.aClass3_Sub1_Sub3_7);
					this.anInt1010 = -1;
					return true;
				}
				local177 = this.anInt986;
				local495 = this.anInt987;
				if (this.anInt1010 == 66) {
					local177 = this.aClass3_Sub1_Sub3_7.method173();
					local495 = this.aClass3_Sub1_Sub3_7.method148();
					this.aBoolean287 = false;
				}
				if (this.anInt1010 == 97) {
					local495 = this.aClass3_Sub1_Sub3_7.method148();
					local177 = this.aClass3_Sub1_Sub3_7.method173();
					this.aClass3_Sub1_Sub3_7.method156((byte) 7);
					local646 = 0;
					while (true) {
						if (local646 >= 4) {
							this.aClass3_Sub1_Sub3_7.method158();
							this.aBoolean287 = true;
							break;
						}
						for (local650 = 0; local650 < 13; local650++) {
							for (local654 = 0; local654 < 13; local654++) {
								local317 = this.aClass3_Sub1_Sub3_7.method157(1);
								if (local317 == 1) {
									this.anIntArrayArrayArray8[local646][local650][local654] = this.aClass3_Sub1_Sub3_7.method157(26);
								} else {
									this.anIntArrayArrayArray8[local646][local650][local654] = -1;
								}
							}
						}
						local646++;
					}
				}
				if (this.anInt986 == local177 && this.anInt987 == local495 && this.anInt870 == 2) {
					this.anInt1010 = -1;
					return true;
				}
				this.anInt986 = local177;
				this.anInt987 = local495;
				this.anInt919 = (this.anInt986 - 6) * 8;
				this.anInt920 = (this.anInt987 - 6) * 8;
				this.aBoolean283 = false;
				if ((this.anInt986 / 8 == 48 || this.anInt986 / 8 == 49) && this.anInt987 / 8 == 48) {
					this.aBoolean283 = true;
				}
				if (this.anInt986 / 8 == 48 && this.anInt987 / 8 == 148) {
					this.aBoolean283 = true;
				}
				this.anInt870 = 1;
				this.aLong33 = System.currentTimeMillis();
				this.aClass36_26.method391();
				this.aClass3_Sub1_Sub1_Sub2_3.method85(151, 0, 257, "Loading - please wait.");
				this.aClass3_Sub1_Sub1_Sub2_3.method85(150, 16777215, 256, "Loading - please wait.");
				this.aClass36_26.method392(4, 4, super.aGraphics2);
				if (this.anInt1010 == 66) {
					local646 = 0;
					local650 = (this.anInt986 - 6) / 8;
					label1148: while (true) {
						if (local650 > (this.anInt986 + 6) / 8) {
							this.aByteArrayArray4 = new byte[local646][];
							this.aByteArrayArray5 = new byte[local646][];
							this.anIntArray262 = new int[local646];
							this.anIntArray263 = new int[local646];
							this.anIntArray264 = new int[local646];
							local646 = 0;
							local654 = (this.anInt986 - 6) / 8;
							while (true) {
								if (local654 > (this.anInt986 + 6) / 8) {
									break label1148;
								}
								for (local317 = (this.anInt987 - 6) / 8; local317 <= (this.anInt987 + 6) / 8; local317++) {
									this.anIntArray262[local646] = (local654 << 8) + local317;
									if (this.aBoolean283 && (local317 == 49 || local317 == 149 || local317 == 147 || local654 == 50 || local654 == 49 && local317 == 47)) {
										this.anIntArray263[local646] = -1;
										this.anIntArray264[local646] = -1;
										local646++;
									} else {
										local975 = this.anIntArray263[local646] = this.aClass19_Sub1_1.method402(local654, local317, 0);
										if (local975 != -1) {
											this.aClass19_Sub1_1.method406(3, local975);
										}
										local1008 = this.anIntArray264[local646] = this.aClass19_Sub1_1.method402(local654, local317, 1);
										if (local1008 != -1) {
											this.aClass19_Sub1_1.method406(3, local1008);
										}
										local646++;
									}
								}
								local654++;
							}
						}
						for (local654 = (this.anInt987 - 6) / 8; local654 <= (this.anInt987 + 6) / 8; local654++) {
							local646++;
						}
						local650++;
					}
				}
				if (this.anInt1010 == 97) {
					local646 = 0;
					@Pc(1652) int[] local1652 = new int[676];
					local654 = 0;
					label1107: while (true) {
						@Pc(1682) int local1682;
						@Pc(1688) int local1688;
						@Pc(1698) int local1698;
						if (local654 >= 4) {
							this.aByteArrayArray4 = new byte[local646][];
							this.aByteArrayArray5 = new byte[local646][];
							this.anIntArray262 = new int[local646];
							this.anIntArray263 = new int[local646];
							this.anIntArray264 = new int[local646];
							local317 = 0;
							while (true) {
								if (local317 >= local646) {
									break label1107;
								}
								local975 = this.anIntArray262[local317] = local1652[local317];
								local1008 = local975 >> 8 & 0xFF;
								local1682 = local975 & 0xFF;
								local1688 = this.anIntArray263[local317] = this.aClass19_Sub1_1.method402(local1008, local1682, 0);
								if (local1688 != -1) {
									this.aClass19_Sub1_1.method406(3, local1688);
								}
								local1698 = this.anIntArray264[local317] = this.aClass19_Sub1_1.method402(local1008, local1682, 1);
								if (local1698 != -1) {
									this.aClass19_Sub1_1.method406(3, local1698);
								}
								local317++;
							}
						}
						for (local317 = 0; local317 < 13; local317++) {
							for (local975 = 0; local975 < 13; local975++) {
								local1008 = this.anIntArrayArrayArray8[local654][local317][local975];
								if (local1008 != -1) {
									local1682 = local1008 >> 14 & 0x3FF;
									local1688 = local1008 >> 3 & 0x7FF;
									local1698 = (local1682 / 8 << 8) + local1688 / 8;
									for (@Pc(1700) int local1700 = 0; local1700 < local646; local1700++) {
										if (local1652[local1700] == local1698) {
											local1698 = -1;
											break;
										}
									}
									if (local1698 != -1) {
										local1652[local646++] = local1698;
									}
								}
							}
						}
						local654++;
					}
				}
				local646 = this.anInt919 - this.anInt921;
				local650 = this.anInt920 - this.anInt922;
				this.anInt921 = this.anInt919;
				this.anInt922 = this.anInt920;
				for (local654 = 0; local654 < 16384; local654++) {
					@Pc(1853) Class3_Sub1_Sub2_Sub1_Sub1 local1853 = this.aClass3_Sub1_Sub2_Sub1_Sub1Array1[local654];
					if (local1853 != null) {
						for (local975 = 0; local975 < 10; local975++) {
							local1853.anIntArray115[local975] -= local646;
							local1853.anIntArray116[local975] -= local650;
						}
						local1853.anInt533 -= local646 * 128;
						local1853.anInt534 -= local650 * 128;
					}
				}
				for (local317 = 0; local317 < this.anInt1016; local317++) {
					@Pc(1908) Class3_Sub1_Sub2_Sub1_Sub2 local1908 = this.aClass3_Sub1_Sub2_Sub1_Sub2Array1[local317];
					if (local1908 != null) {
						for (local1008 = 0; local1008 < 10; local1008++) {
							local1908.anIntArray115[local1008] -= local646;
							local1908.anIntArray116[local1008] -= local650;
						}
						local1908.anInt533 -= local646 * 128;
						local1908.anInt534 -= local650 * 128;
					}
				}
				this.aBoolean270 = true;
				@Pc(1960) byte local1960 = 0;
				@Pc(1962) byte local1962 = 104;
				@Pc(1964) byte local1964 = 1;
				if (local646 < 0) {
					local1960 = 103;
					local1962 = -1;
					local1964 = -1;
				}
				@Pc(1974) byte local1974 = 0;
				@Pc(1976) byte local1976 = 104;
				@Pc(1978) byte local1978 = 1;
				if (local650 < 0) {
					local1974 = 103;
					local1976 = -1;
					local1978 = -1;
				}
				for (@Pc(1988) int local1988 = local1960; local1988 != local1962; local1988 += local1964) {
					for (@Pc(1992) int local1992 = local1974; local1992 != local1976; local1992 += local1978) {
						@Pc(1998) int local1998 = local1988 + local646;
						@Pc(2002) int local2002 = local1992 + local650;
						for (@Pc(2004) int local2004 = 0; local2004 < 4; local2004++) {
							if (local1998 >= 0 && local2002 >= 0 && local1998 < 104 && local2002 < 104) {
								this.aClass27ArrayArrayArray1[local2004][local1988][local1992] = this.aClass27ArrayArrayArray1[local2004][local1998][local2002];
							} else {
								this.aClass27ArrayArrayArray1[local2004][local1988][local1992] = null;
							}
						}
					}
				}
				for (@Pc(2066) Class3_Sub2 local2066 = (Class3_Sub2) this.aClass27_10.method305(); local2066 != null; local2066 = (Class3_Sub2) this.aClass27_10.method307()) {
					local2066.anInt193 -= local646;
					local2066.anInt194 -= local650;
					if (local2066.anInt193 < 0 || local2066.anInt194 < 0 || local2066.anInt193 >= 104 || local2066.anInt194 >= 104) {
						local2066.method535();
					}
				}
				if (this.anInt996 != 0) {
					this.anInt996 -= local646;
					this.anInt997 -= local650;
				}
				this.aBoolean284 = false;
				this.anInt1010 = -1;
				return true;
			} catch (@Pc(4168) IOException local4168) {
				this.method610();
			} catch (@Pc(4173) Exception local4173) {
				local299 = "T2 - " + this.anInt1010 + "," + this.anInt935 + "," + this.anInt936 + " - " + this.anInt1009 + "," + (this.anInt919 + aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0]) + "," + (this.anInt920 + aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0]) + " - ";
				for (local495 = 0; local495 < this.anInt1009 && local495 < 50; local495++) {
					local299 = local299 + this.aClass3_Sub1_Sub3_7.aByteArray5[local495] + ",";
				}
				signlink.reporterror(local299);
				this.method707();
			}
			return true;
		} catch (@Pc(4254) RuntimeException local4254) {
			signlink.reporterror("81462, " + 74 + ", " + local4254.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)I")
	private int method666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = 256 - arg2;
			return ((arg1 & 0xFF00FF) * local3 + (arg0 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg1 & 0xFF00) * local3 + (arg0 & 0xFF00) * arg2 & 0xFF0000) >> 8;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("58337, " + arg0 + ", " + arg1 + ", " + 9 + ", " + arg2 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;B)V")
	private void method667(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		try {
			if (arg0 == 0 && this.anInt988 != -1) {
				this.aString22 = arg2;
				super.anInt828 = 0;
			}
			if (this.anInt867 == -1) {
				this.aBoolean249 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray237[local20] = this.anIntArray237[local20 - 1];
				this.aStringArray10[local20] = this.aStringArray10[local20 - 1];
				this.aStringArray11[local20] = this.aStringArray11[local20 - 1];
			}
			this.anIntArray237[0] = arg0;
			this.aStringArray10[0] = arg1;
			this.aStringArray11[0] = arg2;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("13775, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 5 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(II)Ljava/lang/String;")
	private String method668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			while (arg0 >= 0) {
				this.method574();
			}
			if (arg1 < 999999999) {
				return String.valueOf(arg1);
			} else {
				return "*";
			}
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("63447, " + arg0 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!IMUIZRAF;Z)V")
	private void method669(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub3 arg1) {
		try {
			@Pc(11) int local11;
			@Pc(20) int local20;
			@Pc(44) int local44;
			@Pc(27) int local27;
			@Pc(31) int local31;
			@Pc(35) int local35;
			@Pc(39) int local39;
			if (arg0 == 211) {
				local11 = arg1.method167();
				local20 = this.anInt930 + (local11 >> 4 & 0x7);
				local27 = this.anInt931 + (local11 & 0x7);
				local31 = arg1.method166();
				local35 = local31 >> 2;
				local39 = local31 & 0x3;
				local44 = this.anIntArray241[local35];
				if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104) {
					this.method617(this.anInt911, -1, -1, local27, local35, local44, 0, local20, local39);
				}
			} else if (arg0 == 243) {
				local11 = arg1.method173();
				local20 = arg1.method148();
				local27 = arg1.method175();
				local31 = arg1.method166();
				local35 = this.anInt930 + (local31 >> 4 & 0x7);
				local39 = this.anInt931 + (local31 & 0x7);
				if (local35 >= 0 && local39 >= 0 && local35 < 104 && local39 < 104 && local20 != this.anInt961) {
					@Pc(120) Class3_Sub1_Sub2_Sub5 local120 = new Class3_Sub1_Sub2_Sub5();
					local120.anInt487 = local27;
					local120.anInt486 = local11;
					if (this.aClass27ArrayArrayArray1[this.anInt911][local35][local39] == null) {
						this.aClass27ArrayArrayArray1[this.anInt911][local35][local39] = new Class27(false);
					}
					this.aClass27ArrayArrayArray1[this.anInt911][local35][local39].method302(local120);
					this.method636(local35, local39);
				}
			} else if (arg0 == 147) {
				local11 = arg1.method146();
				local20 = this.anInt930 + (local11 >> 4 & 0x7);
				local27 = this.anInt931 + (local11 & 0x7);
				local31 = arg1.method148();
				local35 = arg1.method148();
				local39 = arg1.method148();
				if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104) {
					@Pc(216) Class27 local216 = this.aClass27ArrayArrayArray1[this.anInt911][local20][local27];
					if (local216 != null) {
						for (@Pc(222) Class3_Sub1_Sub2_Sub5 local222 = (Class3_Sub1_Sub2_Sub5) local216.method305(); local222 != null; local222 = (Class3_Sub1_Sub2_Sub5) local216.method307()) {
							if (local222.anInt487 == (local31 & 0x7FFF) && local222.anInt486 == local35) {
								local222.anInt486 = local39;
								break;
							}
						}
						this.method636(local20, local27);
					}
				}
			} else {
				@Pc(287) int local287;
				@Pc(294) int local294;
				@Pc(298) int local298;
				@Pc(301) int local301;
				@Pc(305) int local305;
				@Pc(309) int local309;
				@Pc(313) int local313;
				if (arg0 == 54) {
					local11 = arg1.method148();
					local20 = arg1.method174();
					@Pc(264) byte local264 = arg1.method147();
					@Pc(267) byte local267 = arg1.method147();
					@Pc(271) byte local271 = arg1.method169();
					@Pc(275) byte local275 = arg1.method168(268);
					local44 = arg1.method146();
					local287 = this.anInt930 + (local44 >> 4 & 0x7);
					local294 = this.anInt931 + (local44 & 0x7);
					local298 = arg1.method173();
					local301 = arg1.method148();
					local305 = arg1.method167();
					local309 = local305 >> 2;
					local313 = local305 & 0x3;
					@Pc(318) int local318 = this.anIntArray241[local309];
					@Pc(324) Class3_Sub1_Sub2_Sub1_Sub2 local324;
					if (local301 == this.anInt961) {
						local324 = aClass3_Sub1_Sub2_Sub1_Sub2_1;
					} else {
						local324 = this.aClass3_Sub1_Sub2_Sub1_Sub2Array1[local301];
					}
					if (local324 != null) {
						@Pc(336) Class29 local336 = Class29.method321(local20);
						@Pc(346) int local346 = this.anIntArrayArrayArray7[this.anInt911][local287][local294];
						@Pc(358) int local358 = this.anIntArrayArrayArray7[this.anInt911][local287 + 1][local294];
						@Pc(372) int local372 = this.anIntArrayArrayArray7[this.anInt911][local287 + 1][local294 + 1];
						@Pc(384) int local384 = this.anIntArrayArrayArray7[this.anInt911][local287][local294 + 1];
						@Pc(394) Class3_Sub1_Sub2_Sub6 local394 = local336.method328(local309, local313, local346, local358, local372, local384, -1);
						if (local394 != null) {
							this.method617(this.anInt911, -1, local298 + 1, local294, 0, local318, local11 + 1, local287, 0);
							local324.anInt575 = local11 + anInt1054;
							local324.anInt576 = local298 + anInt1054;
							local324.aClass3_Sub1_Sub2_Sub6_1 = local394;
							@Pc(429) int local429 = local336.anInt421;
							@Pc(432) int local432 = local336.anInt411;
							if (local313 == 1 || local313 == 3) {
								local429 = local336.anInt411;
								local432 = local336.anInt421;
							}
							local324.anInt585 = local287 * 128 + local429 * 64;
							local324.anInt587 = local294 * 128 + local432 * 64;
							local324.anInt586 = this.method629(local324.anInt587, this.anInt911, local324.anInt585);
							@Pc(478) byte local478;
							if (local275 > local264) {
								local478 = local275;
								local275 = local264;
								local264 = local478;
							}
							if (local271 > local267) {
								local478 = local271;
								local271 = local267;
								local267 = local478;
							}
							local324.anInt578 = local287 + local275;
							local324.anInt580 = local287 + local264;
							local324.anInt579 = local294 + local271;
							local324.anInt581 = local294 + local267;
						}
					}
				}
				@Pc(555) Class3_Sub1_Sub2_Sub5 local555;
				if (arg0 == 107) {
					local11 = arg1.method166();
					local20 = this.anInt930 + (local11 >> 4 & 0x7);
					local27 = this.anInt931 + (local11 & 0x7);
					local31 = arg1.method174();
					local35 = arg1.method148();
					if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104) {
						local555 = new Class3_Sub1_Sub2_Sub5();
						local555.anInt487 = local31;
						local555.anInt486 = local35;
						if (this.aClass27ArrayArrayArray1[this.anInt911][local20][local27] == null) {
							this.aClass27ArrayArrayArray1[this.anInt911][local20][local27] = new Class27(false);
						}
						this.aClass27ArrayArrayArray1[this.anInt911][local20][local27].method302(local555);
						this.method636(local20, local27);
					}
				} else if (arg0 == 9) {
					local11 = arg1.method166();
					local20 = this.anInt930 + (local11 >> 4 & 0x7);
					local27 = this.anInt931 + (local11 & 0x7);
					local31 = arg1.method175();
					if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104) {
						@Pc(647) Class27 local647 = this.aClass27ArrayArrayArray1[this.anInt911][local20][local27];
						if (local647 != null) {
							for (local555 = (Class3_Sub1_Sub2_Sub5) local647.method305(); local555 != null; local555 = (Class3_Sub1_Sub2_Sub5) local647.method307()) {
								if (local555.anInt487 == (local31 & 0x7FFF)) {
									local555.method535();
									break;
								}
							}
							if (local647.method305() == null) {
								this.aClass27ArrayArrayArray1[this.anInt911][local20][local27] = null;
							}
							this.method636(local20, local27);
						}
					}
				} else if (arg0 == 222) {
					local11 = arg1.method148();
					local20 = arg1.method166();
					local27 = local20 >> 2;
					local31 = local20 & 0x3;
					local35 = this.anIntArray241[local27];
					local39 = arg1.method165();
					local44 = this.anInt930 + (local39 >> 4 & 0x7);
					local287 = this.anInt931 + (local39 & 0x7);
					if (local44 >= 0 && local287 >= 0 && local44 < 103 && local287 < 103) {
						local294 = this.anIntArrayArrayArray7[this.anInt911][local44][local287];
						local298 = this.anIntArrayArrayArray7[this.anInt911][local44 + 1][local287];
						local301 = this.anIntArrayArrayArray7[this.anInt911][local44 + 1][local287 + 1];
						local305 = this.anIntArrayArrayArray7[this.anInt911][local44][local287 + 1];
						if (local35 == 0) {
							@Pc(802) Class40 local802 = this.aClass25_1.method257(local44, local287, this.anInt911);
							if (local802 != null) {
								local313 = local802.anInt652 >> 14 & 0x7FFF;
								if (local27 == 2) {
									local802.aClass3_Sub1_Sub2_7 = new Class3_Sub1_Sub2_Sub3(local31 + 4, false, local298, local305, local301, local294, 0, local313, local11, 2);
									local802.aClass3_Sub1_Sub2_8 = new Class3_Sub1_Sub2_Sub3(local31 + 1 & 0x3, false, local298, local305, local301, local294, 0, local313, local11, 2);
								} else {
									local802.aClass3_Sub1_Sub2_7 = new Class3_Sub1_Sub2_Sub3(local31, false, local298, local305, local301, local294, 0, local313, local11, local27);
								}
							}
						}
						if (local35 == 1) {
							@Pc(879) Class10 local879 = this.aClass25_1.method258(this.anInt911, local287, local44);
							if (local879 != null) {
								local879.aClass3_Sub1_Sub2_2 = new Class3_Sub1_Sub2_Sub3(0, false, local298, local305, local301, local294, 0, local879.anInt208 >> 14 & 0x7FFF, local11, 4);
							}
						}
						if (local35 == 2) {
							@Pc(913) Class6 local913 = this.aClass25_1.method259(local287, this.anInt911, 258, local44);
							if (local27 == 11) {
								local27 = 10;
							}
							if (local913 != null) {
								local913.aClass3_Sub1_Sub2_1 = new Class3_Sub1_Sub2_Sub3(local31, false, local298, local305, local301, local294, 0, local913.anInt117 >> 14 & 0x7FFF, local11, local27);
							}
						}
						if (local35 == 3) {
							@Pc(952) Class11 local952 = this.aClass25_1.method260(this.anInt911, local287, local44);
							if (local952 != null) {
								local952.aClass3_Sub1_Sub2_3 = new Class3_Sub1_Sub2_Sub3(local31, false, local298, local305, local301, local294, 0, local952.anInt212 >> 14 & 0x7FFF, local11, 22);
							}
						}
					}
				} else if (arg0 == 94) {
					local11 = arg1.method146();
					local20 = this.anInt930 + (local11 >> 4 & 0x7);
					local27 = this.anInt931 + (local11 & 0x7);
					local31 = arg1.method146();
					local35 = local31 >> 2;
					local39 = local31 & 0x3;
					local44 = this.anIntArray241[local35];
					local287 = arg1.method173();
					if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104) {
						this.method617(this.anInt911, local287, -1, local27, local35, local44, 0, local20, local39);
					}
				} else if (arg0 == 100) {
					local11 = arg1.method146();
					local20 = this.anInt930 + (local11 >> 4 & 0x7);
					local27 = this.anInt931 + (local11 & 0x7);
					local31 = arg1.method148();
					local35 = arg1.method146();
					local39 = arg1.method148();
					if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104) {
						local20 = local20 * 128 + 64;
						local27 = local27 * 128 + 64;
						@Pc(1115) Class3_Sub1_Sub2_Sub2 local1115 = new Class3_Sub1_Sub2_Sub2(local20, 0, local27, anInt1054, this.anInt911, this.method629(local27, this.anInt911, local20) - local35, local39, local31);
						this.aClass27_12.method302(local1115);
					}
				} else {
					if (arg0 == 76) {
						local11 = arg1.method146();
						local20 = this.anInt930 + (local11 >> 4 & 0x7);
						local27 = this.anInt931 + (local11 & 0x7);
						local31 = arg1.method148();
						local35 = arg1.method146();
						local39 = local35 >> 4 & 0xF;
						local44 = local35 & 0x7;
						if (aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0] >= local20 - local39 && aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0] <= local20 + local39 && aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0] >= local27 - local39 && aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0] <= local27 + local39 && this.aBoolean261 && !aBoolean258 && this.anInt907 < 50) {
							this.anIntArray225[this.anInt907] = local31;
							this.anIntArray223[this.anInt907] = local44;
							this.anIntArray244[this.anInt907] = Class8.anIntArray27[local31];
							this.anInt907++;
						}
					}
					if (arg0 == 96) {
						local11 = arg1.method146();
						local20 = this.anInt930 + (local11 >> 4 & 0x7);
						local27 = this.anInt931 + (local11 & 0x7);
						local31 = local20 + arg1.method147();
						local35 = local27 + arg1.method147();
						local39 = arg1.method149();
						local44 = arg1.method148();
						local287 = arg1.method146() * 4;
						local294 = arg1.method146() * 4;
						local298 = arg1.method148();
						local301 = arg1.method148();
						local305 = arg1.method146();
						local309 = arg1.method146();
						if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104 && local31 >= 0 && local35 >= 0 && local31 < 104 && local35 < 104 && local44 != 65535) {
							local20 = local20 * 128 + 64;
							local27 = local27 * 128 + 64;
							local31 = local31 * 128 + 64;
							local35 = local35 * 128 + 64;
							@Pc(1361) Class3_Sub1_Sub2_Sub4 local1361 = new Class3_Sub1_Sub2_Sub4(local309, local298 + anInt1054, local305, 2, this.method629(local27, this.anInt911, local20) - local287, this.anInt911, local27, local294, local20, local39, local301 + anInt1054, local44);
							local1361.method290(local31, local35, local298 + anInt1054, this.method629(local35, this.anInt911, local31) - local294);
							this.aClass27_11.method302(local1361);
						}
					}
				}
			}
		} catch (@Pc(1384) RuntimeException local1384) {
			signlink.reporterror("73425, " + arg0 + ", " + arg1 + ", " + false + ", " + local1384.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method670() {
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
				this.anInt972 = -1;
				this.aClass27_12.method309();
				this.aClass27_11.method309();
				Class3_Sub1_Sub1_Sub3.method449();
				this.method604();
				this.aClass25_1.method235(614);
				System.gc();
				for (local22 = 0; local22 < 4; local22++) {
					this.aClass44Array1[local22].method487();
				}
				for (local35 = 0; local35 < 4; local35++) {
					for (local39 = 0; local39 < 104; local39++) {
						for (local43 = 0; local43 < 104; local43++) {
							this.aByteArrayArrayArray8[local35][local39][local43] = 0;
						}
					}
				}
				@Pc(77) Class30 local77 = new Class30(-863, 104, this.aByteArrayArrayArray8, 104, this.anIntArrayArrayArray7);
				local43 = this.aByteArrayArray4.length;
				this.aClass3_Sub1_Sub3_6.method135(184, this.anInt946);
				@Pc(241) int local241;
				@Pc(229) int local229;
				if (!this.aBoolean287) {
					@Pc(123) byte[] local123;
					for (local92 = 0; local92 < local43; local92++) {
						local106 = (this.anIntArray262[local92] >> 8) * 64 - this.anInt919;
						local118 = (this.anIntArray262[local92] & 0xFF) * 64 - this.anInt920;
						local123 = this.aByteArrayArray4[local92];
						if (local123 != null) {
							local77.method331(local123, local106, local118, (this.anInt986 - 6) * 8, this.aClass44Array1, (this.anInt987 - 6) * 8);
						}
					}
					for (local106 = 0; local106 < local43; local106++) {
						local118 = (this.anIntArray262[local106] >> 8) * 64 - this.anInt919;
						local177 = (this.anIntArray262[local106] & 0xFF) * 64 - this.anInt920;
						@Pc(182) byte[] local182 = this.aByteArrayArray4[local106];
						if (local182 == null && this.anInt987 < 800) {
							local77.method347(64, local118, this.anInt884, local177, 64);
						}
					}
					this.aClass3_Sub1_Sub3_6.method135(184, this.anInt946);
					for (local118 = 0; local118 < local43; local118++) {
						local123 = this.aByteArrayArray5[local118];
						if (local123 != null) {
							local229 = (this.anIntArray262[local118] >> 8) * 64 - this.anInt919;
							local241 = (this.anIntArray262[local118] & 0xFF) * 64 - this.anInt920;
							local77.method337(this.aClass25_1, local123, local229, this.aClass44Array1, local241);
						}
					}
				}
				if (this.aBoolean287) {
					local92 = 0;
					label246: while (true) {
						@Pc(300) int local300;
						@Pc(306) int local306;
						@Pc(316) int local316;
						@Pc(318) int local318;
						if (local92 >= 4) {
							for (local106 = 0; local106 < 13; local106++) {
								for (local118 = 0; local118 < 13; local118++) {
									local177 = this.anIntArrayArrayArray8[0][local106][local118];
									if (local177 == -1) {
										local77.method347(8, local106 * 8, this.anInt884, local118 * 8, 8);
									}
								}
							}
							this.aClass3_Sub1_Sub3_6.method135(184, this.anInt946);
							local118 = 0;
							while (true) {
								if (local118 >= 4) {
									break label246;
								}
								for (local177 = 0; local177 < 13; local177++) {
									for (local229 = 0; local229 < 13; local229++) {
										local241 = this.anIntArrayArrayArray8[local118][local177][local229];
										if (local241 != -1) {
											local300 = local241 >> 24 & 0x3;
											local306 = local241 >> 1 & 0x3;
											local316 = local241 >> 14 & 0x3FF;
											local318 = local241 >> 3 & 0x7FF;
											@Pc(483) int local483 = (local316 / 8 << 8) + local318 / 8;
											for (@Pc(485) int local485 = 0; local485 < this.anIntArray262.length; local485++) {
												if (this.anIntArray262[local485] == local483 && this.aByteArrayArray5[local485] != null) {
													local77.method343(local177 * 8, this.aClass44Array1, (local316 & 0x7) * 8, local306, local300, local118, this.aClass25_1, (local318 & 0x7) * 8, local229 * 8, this.aByteArrayArray5[local485]);
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
								local177 = this.anIntArrayArrayArray8[local92][local106][local118];
								if (local177 != -1) {
									local229 = local177 >> 24 & 0x3;
									local241 = local177 >> 1 & 0x3;
									local300 = local177 >> 14 & 0x3FF;
									local306 = local177 >> 3 & 0x7FF;
									local316 = (local300 / 8 << 8) + local306 / 8;
									for (local318 = 0; local318 < this.anIntArray262.length; local318++) {
										if (this.anIntArray262[local318] == local316 && this.aByteArrayArray4[local318] != null) {
											local77.method334(local118 * 8, local241, 308, this.aClass44Array1, local229, local106 * 8, (local300 & 0x7) * 8, local92, (local306 & 0x7) * 8, this.aByteArrayArray4[local318]);
											break;
										}
									}
								}
							}
						}
						local92++;
					}
				}
				this.aClass3_Sub1_Sub3_6.method135(184, this.anInt946);
				local77.method345(this.aClass25_1, this.aClass44Array1);
				this.aClass36_26.method391();
				this.aClass3_Sub1_Sub3_6.method135(184, this.anInt946);
				local92 = Class30.anInt435;
				if (local92 > this.anInt911) {
					local92 = this.anInt911;
				}
				if (local92 < this.anInt911 - 1) {
					local92 = this.anInt911 - 1;
				}
				if (aBoolean258) {
					this.aClass25_1.method236(Class30.anInt435);
				} else {
					this.aClass25_1.method236(0);
				}
				for (local106 = 0; local106 < 104; local106++) {
					for (local118 = 0; local118 < 104; local118++) {
						this.method636(local106, local118);
					}
				}
				this.method659();
			} catch (@Pc(630) Exception local630) {
			}
			Class29.aClass43_2.method486();
			if (super.aFrame_Sub1_2 != null) {
				this.aClass3_Sub1_Sub3_6.method135(4, this.anInt946);
				this.aClass3_Sub1_Sub3_6.method140(1057001181);
			}
			if (aBoolean258 && signlink.aRandomAccessFile3 != null) {
				local22 = this.aClass19_Sub1_1.method411(0, 86);
				for (local35 = 0; local35 < local22; local35++) {
					local39 = this.aClass19_Sub1_1.method417(local35);
					if ((local39 & 0x79) == 0) {
						Class3_Sub1_Sub2_Sub6.method509(local35);
					}
				}
			}
			System.gc();
			Class3_Sub1_Sub1_Sub3.method450((byte) 1);
			this.aBoolean251 &= true;
			this.aClass19_Sub1_1.method412();
			local22 = (this.anInt986 - 6) / 8 - 1;
			local35 = (this.anInt986 + 6) / 8 + 1;
			local39 = (this.anInt987 - 6) / 8 - 1;
			local43 = (this.anInt987 + 6) / 8 + 1;
			if (this.aBoolean283) {
				local22 = 49;
				local35 = 50;
				local39 = 49;
				local43 = 50;
			}
			for (local92 = local22; local92 <= local35; local92++) {
				for (local106 = local39; local106 <= local43; local106++) {
					if (local92 == local22 || local92 == local35 || local106 == local39 || local106 == local43) {
						local118 = this.aClass19_Sub1_1.method402(local92, local106, 0);
						if (local118 != -1) {
							this.aClass19_Sub1_1.method414(local118, 3);
						}
						local177 = this.aClass19_Sub1_1.method402(local92, local106, 1);
						if (local177 != -1) {
							this.aClass19_Sub1_1.method414(local177, 3);
						}
					}
				}
			}
		} catch (@Pc(801) RuntimeException local801) {
			signlink.reporterror("87241, " + true + ", " + local801.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)V")
	private void method671(@OriginalArg(0) int arg0) {
		try {
			@Pc(7) Class35 local7 = Class35.aClass35Array1[arg0];
			for (@Pc(9) int local9 = 0; local9 < local7.anIntArray103.length && local7.anIntArray103[local9] != -1; local9++) {
				@Pc(24) Class35 local24 = Class35.aClass35Array1[local7.anIntArray103[local9]];
				if (local24.anInt514 == 1) {
					this.method671(local24.anInt509);
				}
				local24.anInt489 = 0;
				local24.anInt490 = 0;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("25906, " + arg0 + ", " + 4 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method672(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			this.method663((byte) 8);
			this.aClass36_17.method391();
			this.aClass3_Sub1_Sub1_Sub1_1.method44(0, 0);
			@Pc(20) boolean local20 = false;
			@Pc(48) byte local48;
			@Pc(60) int local60;
			if (this.anInt1021 == 0) {
				this.aClass3_Sub1_Sub1_Sub2_2.method86(this.aClass19_Sub1_1.aString15, 180, 180, true, 7711145);
				local48 = 80;
				this.aClass3_Sub1_Sub1_Sub2_4.method86("Welcome to RuneScape", 180, 80, true, 16776960);
				local60 = local48 + 30;
				this.aClass3_Sub1_Sub1_Sub1_2.method44(27, 100);
				this.aClass3_Sub1_Sub1_Sub2_4.method86("New User", 100, 125, true, 16777215);
				this.aClass3_Sub1_Sub1_Sub1_2.method44(187, 100);
				this.aClass3_Sub1_Sub1_Sub2_4.method86("Existing User", 260, 125, true, 16777215);
			}
			if (this.anInt1021 == 2) {
				local48 = 60;
				if (this.aString19.length() > 0) {
					this.aClass3_Sub1_Sub1_Sub2_4.method86(this.aString19, 180, 45, true, 16776960);
					this.aClass3_Sub1_Sub1_Sub2_4.method86(this.aString20, 180, 60, true, 16776960);
					local60 = local48 + 30;
				} else {
					this.aClass3_Sub1_Sub1_Sub2_4.method86(this.aString20, 180, 53, true, 16776960);
					local60 = local48 + 30;
				}
				this.aClass3_Sub1_Sub1_Sub2_4.method93(16777215, "Username: " + this.aString17 + (this.anInt842 == 0 & anInt1054 % 40 < 20 ? "@yel@|" : ""), true, 90, 90);
				local60 += 15;
				this.aClass3_Sub1_Sub1_Sub2_4.method93(16777215, "Password: " + Class23.method231(this.aString18) + (this.anInt842 == 1 & anInt1054 % 40 < 20 ? "@yel@|" : ""), true, 105, 92);
				local60 += 15;
				if (!arg0) {
					this.aClass3_Sub1_Sub1_Sub1_2.method44(27, 130);
					this.aClass3_Sub1_Sub1_Sub2_4.method86("Login", 100, 155, true, 16777215);
					this.aClass3_Sub1_Sub1_Sub1_2.method44(187, 130);
					this.aClass3_Sub1_Sub1_Sub2_4.method86("Cancel", 260, 155, true, 16777215);
				}
			}
			if (this.anInt1021 == 3) {
				this.aClass3_Sub1_Sub1_Sub2_4.method86("Create a free account", 180, 40, true, 16776960);
				local48 = 65;
				this.aClass3_Sub1_Sub1_Sub2_4.method86("To create a new account you need to", 180, 65, true, 16777215);
				local60 = local48 + 15;
				this.aClass3_Sub1_Sub1_Sub2_4.method86("go back to the main RuneScape webpage", 180, 80, true, 16777215);
				local60 += 15;
				this.aClass3_Sub1_Sub1_Sub2_4.method86("and choose the red 'create account'", 180, 95, true, 16777215);
				local60 += 15;
				this.aClass3_Sub1_Sub1_Sub2_4.method86("button at the top right of that page.", 180, 110, true, 16777215);
				local60 += 15;
				this.aClass3_Sub1_Sub1_Sub1_2.method44(107, 130);
				this.aClass3_Sub1_Sub1_Sub2_4.method86("Cancel", 180, 155, true, 16777215);
			}
			this.aClass36_17.method392(202, 171, super.aGraphics2);
			if (this.aBoolean285) {
				this.aBoolean285 = false;
				this.aClass36_15.method392(128, 0, super.aGraphics2);
				this.aClass36_16.method392(202, 371, super.aGraphics2);
				this.aClass36_20.method392(0, 265, super.aGraphics2);
				this.aClass36_21.method392(562, 265, super.aGraphics2);
				this.aClass36_22.method392(128, 171, super.aGraphics2);
				this.aClass36_23.method392(562, 171, super.aGraphics2);
			}
		} catch (@Pc(493) RuntimeException local493) {
			signlink.reporterror("78799, " + arg0 + ", " + arg1 + ", " + local493.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILclient!SJPORZIF;)V")
	private void method673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class35 arg3) {
		try {
			if (arg3.anInt514 == 0 && arg3.anIntArray103 != null && (!arg3.aBoolean158 || this.anInt889 == arg3.anInt509 || this.anInt840 == arg3.anInt509 || this.anInt948 == arg3.anInt509)) {
				@Pc(29) int local29 = Class3_Sub1_Sub1.anInt764;
				@Pc(31) int local31 = Class3_Sub1_Sub1.anInt762;
				@Pc(33) int local33 = Class3_Sub1_Sub1.anInt765;
				@Pc(35) int local35 = Class3_Sub1_Sub1.anInt763;
				Class3_Sub1_Sub1.method539(arg1 + arg3.anInt505, arg0 + arg3.anInt512, arg1, arg0);
				@Pc(51) int local51 = arg3.anIntArray103.length;
				for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
					@Pc(62) int local62 = arg3.anIntArray111[local53] + arg1;
					@Pc(71) int local71 = arg3.anIntArray110[local53] + arg0 - arg2;
					@Pc(78) Class35 local78 = Class35.aClass35Array1[arg3.anIntArray103[local53]];
					@Pc(83) int local83 = local62 + local78.anInt515;
					@Pc(88) int local88 = local71 + local78.anInt517;
					if (local78.anInt513 > 0) {
						this.method611(local78);
					}
					if (local78.anInt514 == 0) {
						if (local78.anInt511 > local78.anInt488 - local78.anInt512) {
							local78.anInt511 = local78.anInt488 - local78.anInt512;
						}
						if (local78.anInt511 < 0) {
							local78.anInt511 = 0;
						}
						this.method673(local88, local83, local78.anInt511, local78);
						if (local78.anInt488 > local78.anInt512) {
							this.method601(local78.anInt511, local78.anInt512, local83 + local78.anInt505, local78.anInt488, local88);
						}
					} else if (local78.anInt514 != 1) {
						@Pc(160) int local160;
						@Pc(164) int local164;
						@Pc(175) int local175;
						@Pc(210) int local210;
						@Pc(217) int local217;
						@Pc(158) int local158;
						@Pc(208) int local208;
						if (local78.anInt514 == 2) {
							local158 = 0;
							for (local160 = 0; local160 < local78.anInt512; local160++) {
								for (local164 = 0; local164 < local78.anInt505; local164++) {
									local175 = local83 + local164 * (local78.anInt506 + 32);
									@Pc(184) int local184 = local88 + local160 * (local78.anInt508 + 32);
									if (local158 < 20) {
										local175 += local78.anIntArray108[local158];
										local184 += local78.anIntArray106[local158];
									}
									if (local78.anIntArray109[local158] > 0) {
										local208 = 0;
										local210 = 0;
										local217 = local78.anIntArray109[local158] - 1;
										if (local175 > Class3_Sub1_Sub1.anInt764 - 32 && local175 < Class3_Sub1_Sub1.anInt765 && local184 > Class3_Sub1_Sub1.anInt762 - 32 && local184 < Class3_Sub1_Sub1.anInt763 || this.anInt980 != 0 && this.anInt979 == local158) {
											@Pc(242) int local242 = 0;
											if (this.anInt999 == 1 && this.anInt1000 == local158 && this.anInt1001 == local78.anInt509) {
												local242 = 16777215;
											}
											@Pc(266) Class3_Sub1_Sub1_Sub4 local266 = Class34.method368(local78.anIntArray104[local158], local242, local217);
											if (local266 != null) {
												@Pc(345) int local345;
												if (this.anInt980 != 0 && this.anInt979 == local158 && this.anInt978 == local78.anInt509) {
													local208 = super.anInt823 - this.anInt981;
													local210 = super.anInt824 - this.anInt982;
													if (local208 < 5 && local208 > -5) {
														local208 = 0;
													}
													if (local210 < 5 && local210 > -5) {
														local210 = 0;
													}
													if (this.anInt1030 < 5) {
														local208 = 0;
														local210 = 0;
													}
													local266.method556(local184 + local210, local175 + local208);
													if (local184 + local210 < Class3_Sub1_Sub1.anInt762 && arg3.anInt511 > 0) {
														local345 = this.anInt1052 * (Class3_Sub1_Sub1.anInt762 - local184 - local210) / 3;
														if (local345 > this.anInt1052 * 10) {
															local345 = this.anInt1052 * 10;
														}
														if (local345 > arg3.anInt511) {
															local345 = arg3.anInt511;
														}
														arg3.anInt511 -= local345;
														this.anInt982 += local345;
													}
													if (local184 + local210 + 32 > Class3_Sub1_Sub1.anInt763 && arg3.anInt511 < arg3.anInt488 - arg3.anInt512) {
														local345 = this.anInt1052 * (local184 + local210 + 32 - Class3_Sub1_Sub1.anInt763) / 3;
														if (local345 > this.anInt1052 * 10) {
															local345 = this.anInt1052 * 10;
														}
														if (local345 > arg3.anInt488 - arg3.anInt512 - arg3.anInt511) {
															local345 = arg3.anInt488 - arg3.anInt512 - arg3.anInt511;
														}
														arg3.anInt511 += local345;
														this.anInt982 -= local345;
													}
												} else if (this.anInt838 != 0 && this.anInt837 == local158 && this.anInt836 == local78.anInt509) {
													local266.method556(local184, local175);
												} else {
													local266.method554(local175, local184);
												}
												if (local266.anInt778 == 33 || local78.anIntArray104[local158] != 1) {
													local345 = local78.anIntArray104[local158];
													this.aClass3_Sub1_Sub1_Sub2_2.method89(local184 + local210 + 10, method600(anInt843, local345), local175 + local208 + 1, 0);
													this.aClass3_Sub1_Sub1_Sub2_2.method89(local184 + local210 + 9, method600(anInt843, local345), local175 + local208, 16776960);
												}
											}
										}
									} else if (local78.aClass3_Sub1_Sub1_Sub4Array1 != null && local158 < 20) {
										@Pc(534) Class3_Sub1_Sub1_Sub4 local534 = local78.aClass3_Sub1_Sub1_Sub4Array1[local158];
										if (local534 != null) {
											local534.method554(local175, local184);
										}
									}
									local158++;
								}
							}
						} else if (local78.anInt514 == 3) {
							@Pc(560) boolean local560 = false;
							if (this.anInt948 == local78.anInt509 || this.anInt840 == local78.anInt509 || this.anInt889 == local78.anInt509) {
								local560 = true;
							}
							if (this.method582(local78)) {
								local158 = local78.anInt503;
								if (local560 && local78.anInt500 != 0) {
									local158 = local78.anInt500;
								}
							} else {
								local158 = local78.anInt494;
								if (local560 && local78.anInt504 != 0) {
									local158 = local78.anInt504;
								}
							}
							if (local78.aByte14 == 0) {
								if (local78.aBoolean157) {
									Class3_Sub1_Sub1.method542(local158, local83, local78.anInt505, local78.anInt512, local88);
								} else {
									Class3_Sub1_Sub1.method543(local88, local78.anInt505, local83, local78.anInt512, local158);
								}
							} else if (local78.aBoolean157) {
								Class3_Sub1_Sub1.method541(256 - (local78.aByte14 & 0xFF), local78.anInt505, local88, local83, local78.anInt512, local158);
							} else {
								Class3_Sub1_Sub1.method544(local88, local78.anInt505, local83, local158, local78.anInt512, 256 - (local78.aByte14 & 0xFF));
							}
						} else {
							@Pc(678) Class3_Sub1_Sub1_Sub2 local678;
							if (local78.anInt514 == 4) {
								local678 = local78.aClass3_Sub1_Sub1_Sub2_1;
								@Pc(681) String local681 = local78.aString8;
								@Pc(683) boolean local683 = false;
								if (this.anInt948 == local78.anInt509 || this.anInt840 == local78.anInt509 || this.anInt889 == local78.anInt509) {
									local683 = true;
								}
								if (this.method582(local78)) {
									local160 = local78.anInt503;
									if (local683 && local78.anInt500 != 0) {
										local160 = local78.anInt500;
									}
									if (local78.aString9.length() > 0) {
										local681 = local78.aString9;
									}
								} else {
									local160 = local78.anInt494;
									if (local683 && local78.anInt504 != 0) {
										local160 = local78.anInt504;
									}
								}
								if (local78.anInt491 == 6 && this.aBoolean255) {
									local681 = "Please wait...";
									local160 = local78.anInt494;
								}
								if (Class3_Sub1_Sub1.anInt760 == 479) {
									if (local160 == 16776960) {
										local160 = 255;
									}
									if (local160 == 49152) {
										local160 = 16777215;
									}
								}
								local208 = local88 + local678.anInt145;
								while (local681.length() > 0) {
									if (local681.indexOf("%") != -1) {
										label348: while (true) {
											local210 = local681.indexOf("%1");
											if (local210 == -1) {
												while (true) {
													local210 = local681.indexOf("%2");
													if (local210 == -1) {
														while (true) {
															local210 = local681.indexOf("%3");
															if (local210 == -1) {
																while (true) {
																	local210 = local681.indexOf("%4");
																	if (local210 == -1) {
																		while (true) {
																			local210 = local681.indexOf("%5");
																			if (local210 == -1) {
																				break label348;
																			}
																			local681 = local681.substring(0, local210) + this.method668(this.anInt984, this.method589(4, local78)) + local681.substring(local210 + 2);
																		}
																	}
																	local681 = local681.substring(0, local210) + this.method668(this.anInt984, this.method589(3, local78)) + local681.substring(local210 + 2);
																}
															}
															local681 = local681.substring(0, local210) + this.method668(this.anInt984, this.method589(2, local78)) + local681.substring(local210 + 2);
														}
													}
													local681 = local681.substring(0, local210) + this.method668(this.anInt984, this.method589(1, local78)) + local681.substring(local210 + 2);
												}
											}
											local681 = local681.substring(0, local210) + this.method668(this.anInt984, this.method589(0, local78)) + local681.substring(local210 + 2);
										}
									}
									local210 = local681.indexOf("\\n");
									@Pc(960) String local960;
									if (local210 == -1) {
										local960 = local681;
										local681 = "";
									} else {
										local960 = local681.substring(0, local210);
										local681 = local681.substring(local210 + 2);
									}
									if (local78.aBoolean164) {
										local678.method86(local960, local83 + local78.anInt505 / 2, local208, local78.aBoolean160, local160);
									} else {
										local678.method93(local160, local960, local78.aBoolean160, local208, local83);
									}
									local208 += local678.anInt145;
								}
							} else if (local78.anInt514 == 5) {
								@Pc(1022) Class3_Sub1_Sub1_Sub4 local1022;
								if (this.method582(local78)) {
									local1022 = local78.aClass3_Sub1_Sub1_Sub4_1;
								} else {
									local1022 = local78.aClass3_Sub1_Sub1_Sub4_2;
								}
								if (local1022 != null) {
									local1022.method554(local83, local88);
								}
							} else if (local78.anInt514 == 6) {
								local158 = Class3_Sub1_Sub1_Sub3.anInt669;
								local160 = Class3_Sub1_Sub1_Sub3.anInt670;
								Class3_Sub1_Sub1_Sub3.anInt669 = local83 + local78.anInt505 / 2;
								Class3_Sub1_Sub1_Sub3.anInt670 = local88 + local78.anInt512 / 2;
								local164 = Class3_Sub1_Sub1_Sub3.anIntArray144[local78.anInt496] * local78.anInt495 >> 16;
								local175 = Class3_Sub1_Sub1_Sub3.anIntArray145[local78.anInt496] * local78.anInt495 >> 16;
								@Pc(1083) boolean local1083 = this.method582(local78);
								if (local1083) {
									local208 = local78.anInt499;
								} else {
									local208 = local78.anInt498;
								}
								@Pc(1103) Class3_Sub1_Sub2_Sub6 local1103;
								if (local208 == -1) {
									local1103 = local78.method373(local1083, -1, -1);
								} else {
									@Pc(1109) Class49 local1109 = Class49.aClass49Array1[local208];
									local1103 = local78.method373(local1083, local1109.anIntArray206[local78.anInt489], local1109.anIntArray207[local78.anInt489]);
								}
								if (local1103 != null) {
									local1103.method530(local78.anInt497, 0, local78.anInt496, 0, local164, local175);
								}
								Class3_Sub1_Sub1_Sub3.anInt669 = local158;
								Class3_Sub1_Sub1_Sub3.anInt670 = local160;
							} else if (local78.anInt514 == 7) {
								local678 = local78.aClass3_Sub1_Sub1_Sub2_1;
								local160 = 0;
								for (local164 = 0; local164 < local78.anInt512; local164++) {
									for (local175 = 0; local175 < local78.anInt505; local175++) {
										if (local78.anIntArray109[local160] > 0) {
											@Pc(1173) Class34 local1173 = Class34.method361(local78.anIntArray109[local160] - 1);
											@Pc(1176) String local1176 = local1173.aString6;
											if (local1173.aBoolean148 || local78.anIntArray104[local160] != 1) {
												local1176 = local1176 + " x" + method599(local78.anIntArray104[local160]);
											}
											local210 = local83 + local175 * (local78.anInt506 + 115);
											local217 = local88 + local164 * (local78.anInt508 + 12);
											if (local78.aBoolean164) {
												local678.method86(local1176, local210 + local78.anInt505 / 2, local217, local78.aBoolean160, local78.anInt494);
											} else {
												local678.method93(local78.anInt494, local1176, local78.aBoolean160, local217, local210);
											}
										}
										local160++;
									}
								}
							}
						}
					}
				}
				Class3_Sub1_Sub1.method539(local33, local35, local29, local31);
			}
		} catch (@Pc(1276) RuntimeException local1276) {
			signlink.reporterror("95076, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -44100 + ", " + arg3 + ", " + local1276.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method674() {
		try {
			this.anInt949++;
			this.method681((byte) 8, true);
			this.method592(true);
			this.method681((byte) 8, false);
			this.method592(false);
			this.method642();
			this.method650();
			@Pc(35) int local35;
			@Pc(74) int local74;
			if (!this.aBoolean284) {
				local35 = this.anInt965;
				if (this.anInt941 / 256 > local35) {
					local35 = this.anInt941 / 256;
				}
				if (this.aBooleanArray11[4] && this.anIntArray221[4] + 128 > local35) {
					local35 = this.anIntArray221[4] + 128;
				}
				local74 = this.anInt966 + this.anInt1047 & 0x7FF;
				this.method696(local35 * 3 + 600, local35, this.anInt994, local74, this.anInt993, this.method629(aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt534, this.anInt911, aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt533) - 50);
			}
			if (this.aBoolean284) {
				local35 = this.method614();
			} else {
				local35 = this.method613();
			}
			local74 = this.anInt871;
			@Pc(118) int local118 = this.anInt872;
			@Pc(121) int local121 = this.anInt873;
			@Pc(124) int local124 = this.anInt874;
			@Pc(127) int local127 = this.anInt875;
			@Pc(176) int local176;
			for (@Pc(129) int local129 = 0; local129 < 5; local129++) {
				if (this.aBooleanArray11[local129]) {
					local176 = (int) (Math.random() * (double) (this.anIntArray235[local129] * 2 + 1) - (double) this.anIntArray235[local129] + Math.sin((double) this.anIntArray234[local129] * ((double) this.anIntArray220[local129] / 100.0D)) * (double) this.anIntArray221[local129]);
					if (local129 == 0) {
						this.anInt871 += local176;
					}
					if (local129 == 1) {
						this.anInt872 += local176;
					}
					if (local129 == 2) {
						this.anInt873 += local176;
					}
					if (local129 == 3) {
						this.anInt875 = this.anInt875 + local176 & 0x7FF;
					}
					if (local129 == 4) {
						this.anInt874 += local176;
						if (this.anInt874 < 128) {
							this.anInt874 = 128;
						}
						if (this.anInt874 > 383) {
							this.anInt874 = 383;
						}
					}
				}
			}
			local176 = Class3_Sub1_Sub1_Sub3.anInt673;
			Class3_Sub1_Sub2_Sub6.aBoolean228 = true;
			Class3_Sub1_Sub2_Sub6.anInt755 = 0;
			Class3_Sub1_Sub2_Sub6.anInt753 = super.anInt823 - 4;
			Class3_Sub1_Sub2_Sub6.anInt754 = super.anInt824 - 4;
			Class3_Sub1_Sub1.method540();
			this.aClass25_1.method274(this.anInt871, local35, this.anInt872, this.anInt874, this.anInt875, this.anInt873);
			this.aClass25_1.method249();
			this.method706();
			this.method685(this.anInt939);
			this.method619(local176);
			this.method586();
			this.aClass36_26.method392(4, 4, super.aGraphics2);
			this.anInt871 = local74;
			this.anInt872 = local118;
			this.anInt873 = local121;
			this.anInt874 = local124;
			this.anInt875 = local127;
		} catch (@Pc(319) RuntimeException local319) {
			signlink.reporterror("73273, " + 0 + ", " + local319.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILclient!IMUIZRAF;)V")
	private void method675(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt244 + 21 < arg0 * 8) {
					@Pc(19) int local19 = arg1.method157(14);
					if (local19 != 16383) {
						if (this.aClass3_Sub1_Sub2_Sub1_Sub1Array1[local19] == null) {
							this.aClass3_Sub1_Sub2_Sub1_Sub1Array1[local19] = new Class3_Sub1_Sub2_Sub1_Sub1();
						}
						@Pc(39) Class3_Sub1_Sub2_Sub1_Sub1 local39 = this.aClass3_Sub1_Sub2_Sub1_Sub1Array1[local19];
						this.anIntArray232[this.anInt902++] = local19;
						local39.anInt560 = anInt1054;
						@Pc(58) int local58 = arg1.method157(1);
						local39.aClass42_1 = Class42.method481(arg1.method157(12));
						@Pc(70) int local70 = arg1.method157(1);
						if (local70 == 1) {
							this.anIntArray256[this.anInt1019++] = local19;
						}
						@Pc(89) int local89 = arg1.method157(5);
						if (local89 > 15) {
							local89 -= 32;
						}
						@Pc(98) int local98 = arg1.method157(5);
						if (local98 > 15) {
							local98 -= 32;
						}
						local39.anInt525 = local39.aClass42_1.aByte18;
						local39.anInt552 = local39.aClass42_1.anInt703;
						local39.anInt553 = local39.aClass42_1.anInt696;
						local39.anInt554 = local39.aClass42_1.anInt706;
						local39.anInt555 = local39.aClass42_1.anInt707;
						local39.anInt556 = local39.aClass42_1.anInt700;
						local39.anInt567 = local39.aClass42_1.anInt698;
						local39.method385(aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0] + local89, local58 == 1, aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0] + local98);
						continue;
					}
				}
				arg1.method158();
				return;
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("21214, " + true + ", " + arg0 + ", " + arg1 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method676() {
		try {
			@Pc(6) int local6 = this.anInt1057 * 128 + 64;
			@Pc(13) int local13 = this.anInt1058 * 128 + 64;
			@Pc(24) int local24 = this.method629(local13, this.anInt911, local6) - this.anInt1059;
			if (this.anInt871 < local6) {
				this.anInt871 += this.anInt1060 + (local6 - this.anInt871) * this.anInt1061 / 1000;
				if (this.anInt871 > local6) {
					this.anInt871 = local6;
				}
			}
			if (this.anInt871 > local6) {
				this.anInt871 -= this.anInt1060 + (this.anInt871 - local6) * this.anInt1061 / 1000;
				if (this.anInt871 < local6) {
					this.anInt871 = local6;
				}
			}
			if (this.anInt872 < local24) {
				this.anInt872 += this.anInt1060 + (local24 - this.anInt872) * this.anInt1061 / 1000;
				if (this.anInt872 > local24) {
					this.anInt872 = local24;
				}
			}
			if (this.anInt872 > local24) {
				this.anInt872 -= this.anInt1060 + (this.anInt872 - local24) * this.anInt1061 / 1000;
				if (this.anInt872 < local24) {
					this.anInt872 = local24;
				}
			}
			if (this.anInt873 < local13) {
				this.anInt873 += this.anInt1060 + (local13 - this.anInt873) * this.anInt1061 / 1000;
				if (this.anInt873 > local13) {
					this.anInt873 = local13;
				}
			}
			if (this.anInt873 > local13) {
				this.anInt873 -= this.anInt1060 + (this.anInt873 - local13) * this.anInt1061 / 1000;
				if (this.anInt873 < local13) {
					this.anInt873 = local13;
				}
			}
			local6 = this.anInt895 * 128 + 64;
			local13 = this.anInt896 * 128 + 64;
			local24 = this.method629(local13, this.anInt911, local6) - this.anInt897;
			@Pc(222) int local222 = local6 - this.anInt871;
			@Pc(227) int local227 = local24 - this.anInt872;
			@Pc(232) int local232 = local13 - this.anInt873;
			@Pc(243) int local243 = (int) Math.sqrt((double) (local222 * local222 + local232 * local232));
			@Pc(254) int local254 = (int) (Math.atan2((double) local227, (double) local243) * 325.949D) & 0x7FF;
			@Pc(271) int local271 = (int) (Math.atan2((double) local222, (double) local232) * -325.949D) & 0x7FF;
			if (local254 < 128) {
				local254 = 128;
			}
			if (local254 > 383) {
				local254 = 383;
			}
			if (this.anInt874 < local254) {
				this.anInt874 += this.anInt898 + (local254 - this.anInt874) * this.anInt899 / 1000;
				if (this.anInt874 > local254) {
					this.anInt874 = local254;
				}
			}
			if (this.anInt874 > local254) {
				this.anInt874 -= this.anInt898 + (this.anInt874 - local254) * this.anInt899 / 1000;
				if (this.anInt874 < local254) {
					this.anInt874 = local254;
				}
			}
			@Pc(342) int local342 = local271 - this.anInt875;
			if (local342 > 1024) {
				local342 -= 2048;
			}
			if (local342 < -1024) {
				local342 += 2048;
			}
			if (local342 > 0) {
				this.anInt875 += this.anInt898 + local342 * this.anInt899 / 1000;
				this.anInt875 &= 0x7FF;
			}
			if (local342 < 0) {
				this.anInt875 -= this.anInt898 + -local342 * this.anInt899 / 1000;
				this.anInt875 &= 0x7FF;
			}
			@Pc(400) int local400 = local271 - this.anInt875;
			if (local400 > 1024) {
				local400 -= 2048;
			}
			if (local400 < -1024) {
				local400 += 2048;
			}
			if (local400 < 0 && local342 > 0 || local400 > 0 && local342 < 0) {
				this.anInt875 = local271;
			}
		} catch (@Pc(421) RuntimeException local421) {
			signlink.reporterror("7235, " + 0 + ", " + local421.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method677() {
		try {
			@Pc(2) int local2 = this.anInt860;
			@Pc(5) int local5 = this.anInt861;
			@Pc(8) int local8 = this.anInt862;
			@Pc(11) int local11 = this.anInt863;
			Class3_Sub1_Sub1.method542(6116423, local2, local8, local11, local5);
			Class3_Sub1_Sub1.method542(0, local2 + 1, local8 - 2, 16, local5 + 1);
			Class3_Sub1_Sub1.method543(local5 + 18, local8 - 2, local2 + 1, local11 - 19, 0);
			this.aClass3_Sub1_Sub1_Sub2_4.method89(local5 + 14, "Choose Option", local2 + 3, 6116423);
			@Pc(68) int local68 = super.anInt823;
			@Pc(71) int local71 = super.anInt824;
			if (this.anInt859 == 0) {
				local68 -= 4;
				local71 -= 4;
			}
			if (this.anInt859 == 1) {
				local68 -= 553;
				local71 -= 205;
			}
			if (this.anInt859 == 2) {
				local68 -= 17;
				local71 -= 357;
			}
			for (@Pc(90) int local90 = 0; local90 < this.anInt857; local90++) {
				@Pc(105) int local105 = local5 + (this.anInt857 - 1 - local90) * 15 + 31;
				@Pc(107) int local107 = 16777215;
				if (local68 > local2 && local68 < local2 + local8 && local71 > local105 - 13 && local71 < local105 + 3) {
					local107 = 16776960;
				}
				this.aClass3_Sub1_Sub1_Sub2_4.method93(local107, this.aStringArray9[local90], true, local105, local2 + 3);
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("86959, " + true + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIILclient!SJPORZIF;)V")
	private void method678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class35 arg5) {
		try {
			if (arg5.anInt514 == 0 && arg5.anIntArray103 != null && !arg5.aBoolean158 && (arg1 >= arg2 && arg0 >= arg4 && arg1 <= arg2 + arg5.anInt505 && arg0 <= arg4 + arg5.anInt512)) {
				@Pc(34) int local34 = arg5.anIntArray103.length;
				for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
					@Pc(45) int local45 = arg5.anIntArray111[local36] + arg2;
					@Pc(54) int local54 = arg5.anIntArray110[local36] + arg4 - arg3;
					@Pc(61) Class35 local61 = Class35.aClass35Array1[arg5.anIntArray103[local36]];
					@Pc(66) int local66 = local45 + local61.anInt515;
					@Pc(71) int local71 = local54 + local61.anInt517;
					if ((local61.anInt518 >= 0 || local61.anInt504 != 0) && arg1 >= local66 && arg0 >= local71 && arg1 < local66 + local61.anInt505 && arg0 < local71 + local61.anInt512) {
						if (local61.anInt518 >= 0) {
							this.anInt834 = local61.anInt518;
						} else {
							this.anInt834 = local61.anInt509;
						}
					}
					if (local61.anInt514 == 0) {
						this.method678(arg0, arg1, local66, local61.anInt511, local71, local61);
						if (local61.anInt488 > local61.anInt512) {
							this.method630(local61.anInt512, true, local61, local71, local61.anInt488, local66 + local61.anInt505, arg1, arg0);
						}
					} else {
						if (local61.anInt491 == 1 && arg1 >= local66 && arg0 >= local71 && arg1 < local66 + local61.anInt505 && arg0 < local71 + local61.anInt512) {
							@Pc(168) boolean local168 = false;
							if (local61.anInt513 != 0) {
								local168 = this.method684(local61);
							}
							if (!local168) {
								this.aStringArray9[this.anInt857] = local61.aString7;
								this.anIntArray267[this.anInt857] = 843;
								this.anIntArray266[this.anInt857] = local61.anInt509;
								this.anInt857++;
							}
						}
						if (local61.anInt491 == 2 && this.anInt864 == 0 && arg1 >= local66 && arg0 >= local71 && arg1 < local66 + local61.anInt505 && arg0 < local71 + local61.anInt512) {
							@Pc(232) String local232 = local61.aString10;
							if (local232.indexOf(" ") != -1) {
								local232 = local232.substring(0, local232.indexOf(" "));
							}
							this.aStringArray9[this.anInt857] = local232 + " @gre@" + local61.aString11;
							this.anIntArray267[this.anInt857] = 841;
							this.anIntArray266[this.anInt857] = local61.anInt509;
							this.anInt857++;
						}
						if (local61.anInt491 == 3 && arg1 >= local66 && arg0 >= local71 && arg1 < local66 + local61.anInt505 && arg0 < local71 + local61.anInt512) {
							this.aStringArray9[this.anInt857] = "Close";
							this.anIntArray267[this.anInt857] = 329;
							this.anIntArray266[this.anInt857] = local61.anInt509;
							this.anInt857++;
						}
						if (local61.anInt491 == 4 && arg1 >= local66 && arg0 >= local71 && arg1 < local66 + local61.anInt505 && arg0 < local71 + local61.anInt512) {
							this.aStringArray9[this.anInt857] = local61.aString7;
							this.anIntArray267[this.anInt857] = 938;
							this.anIntArray266[this.anInt857] = local61.anInt509;
							this.anInt857++;
						}
						if (local61.anInt491 == 5 && arg1 >= local66 && arg0 >= local71 && arg1 < local66 + local61.anInt505 && arg0 < local71 + local61.anInt512) {
							this.aStringArray9[this.anInt857] = local61.aString7;
							this.anIntArray267[this.anInt857] = 936;
							this.anIntArray266[this.anInt857] = local61.anInt509;
							this.anInt857++;
						}
						if (local61.anInt491 == 6 && !this.aBoolean255 && arg1 >= local66 && arg0 >= local71 && arg1 < local66 + local61.anInt505 && arg0 < local71 + local61.anInt512) {
							this.aStringArray9[this.anInt857] = local61.aString7;
							this.anIntArray267[this.anInt857] = 264;
							this.anIntArray266[this.anInt857] = local61.anInt509;
							this.anInt857++;
						}
						if (local61.anInt514 == 2) {
							@Pc(480) int local480 = 0;
							for (@Pc(482) int local482 = 0; local482 < local61.anInt512; local482++) {
								for (@Pc(486) int local486 = 0; local486 < local61.anInt505; local486++) {
									@Pc(497) int local497 = local66 + local486 * (local61.anInt506 + 32);
									@Pc(506) int local506 = local71 + local482 * (local61.anInt508 + 32);
									if (local480 < 20) {
										local497 += local61.anIntArray108[local480];
										local506 += local61.anIntArray106[local480];
									}
									if (arg1 >= local497 && arg0 >= local506 && arg1 < local497 + 32 && arg0 < local506 + 32) {
										this.anInt1039 = local480;
										this.anInt1040 = local61.anInt509;
										if (local61.anIntArray109[local480] > 0) {
											@Pc(559) Class34 local559 = Class34.method361(local61.anIntArray109[local480] - 1);
											if (this.anInt999 == 1 && local61.aBoolean167) {
												if (local61.anInt509 != this.anInt1001 || local480 != this.anInt1000) {
													this.aStringArray9[this.anInt857] = "Use " + this.aString29 + " with @lre@" + local559.aString6;
													this.anIntArray267[this.anInt857] = 637;
													this.anIntArray268[this.anInt857] = local559.anInt461;
													this.anIntArray265[this.anInt857] = local480;
													this.anIntArray266[this.anInt857] = local61.anInt509;
													this.anInt857++;
												}
											} else if (this.anInt864 != 1 || !local61.aBoolean167) {
												@Pc(696) int local696;
												if (local61.aBoolean167) {
													for (local696 = 4; local696 >= 3; local696--) {
														if (local559.aStringArray4 != null && local559.aStringArray4[local696] != null) {
															this.aStringArray9[this.anInt857] = local559.aStringArray4[local696] + " @lre@" + local559.aString6;
															if (local696 == 3) {
																this.anIntArray267[this.anInt857] = 36;
															}
															if (local696 == 4) {
																this.anIntArray267[this.anInt857] = 815;
															}
															this.anIntArray268[this.anInt857] = local559.anInt461;
															this.anIntArray265[this.anInt857] = local480;
															this.anIntArray266[this.anInt857] = local61.anInt509;
															this.anInt857++;
														} else if (local696 == 4) {
															this.aStringArray9[this.anInt857] = "Drop @lre@" + local559.aString6;
															this.anIntArray267[this.anInt857] = 815;
															this.anIntArray268[this.anInt857] = local559.anInt461;
															this.anIntArray265[this.anInt857] = local480;
															this.anIntArray266[this.anInt857] = local61.anInt509;
															this.anInt857++;
														}
													}
												}
												if (local61.aBoolean162) {
													this.aStringArray9[this.anInt857] = "Use @lre@" + local559.aString6;
													this.anIntArray267[this.anInt857] = 68;
													this.anIntArray268[this.anInt857] = local559.anInt461;
													this.anIntArray265[this.anInt857] = local480;
													this.anIntArray266[this.anInt857] = local61.anInt509;
													this.anInt857++;
												}
												if (local61.aBoolean167 && local559.aStringArray4 != null) {
													for (local696 = 2; local696 >= 0; local696--) {
														if (local559.aStringArray4[local696] != null) {
															this.aStringArray9[this.anInt857] = local559.aStringArray4[local696] + " @lre@" + local559.aString6;
															if (local696 == 0) {
																this.anIntArray267[this.anInt857] = 257;
															}
															if (local696 == 1) {
																this.anIntArray267[this.anInt857] = 104;
															}
															if (local696 == 2) {
																this.anIntArray267[this.anInt857] = 984;
															}
															this.anIntArray268[this.anInt857] = local559.anInt461;
															this.anIntArray265[this.anInt857] = local480;
															this.anIntArray266[this.anInt857] = local61.anInt509;
															this.anInt857++;
														}
													}
												}
												if (local61.aStringArray6 != null) {
													for (local696 = 4; local696 >= 0; local696--) {
														if (local61.aStringArray6[local696] != null) {
															this.aStringArray9[this.anInt857] = local61.aStringArray6[local696] + " @lre@" + local559.aString6;
															if (local696 == 0) {
																this.anIntArray267[this.anInt857] = 114;
															}
															if (local696 == 1) {
																this.anIntArray267[this.anInt857] = 819;
															}
															if (local696 == 2) {
																this.anIntArray267[this.anInt857] = 474;
															}
															if (local696 == 3) {
																this.anIntArray267[this.anInt857] = 541;
															}
															if (local696 == 4) {
																this.anIntArray267[this.anInt857] = 140;
															}
															this.anIntArray268[this.anInt857] = local559.anInt461;
															this.anIntArray265[this.anInt857] = local480;
															this.anIntArray266[this.anInt857] = local61.anInt509;
															this.anInt857++;
														}
													}
												}
												this.aStringArray9[this.anInt857] = "Examine @lre@" + local559.aString6;
												this.anIntArray267[this.anInt857] = 1313;
												this.anIntArray268[this.anInt857] = local559.anInt461;
												this.anIntArray265[this.anInt857] = local480;
												this.anIntArray266[this.anInt857] = local61.anInt509;
												this.anInt857++;
											} else if ((this.anInt866 & 0x10) == 16) {
												this.aStringArray9[this.anInt857] = this.aString21 + " @lre@" + local559.aString6;
												this.anIntArray267[this.anInt857] = 522;
												this.anIntArray268[this.anInt857] = local559.anInt461;
												this.anIntArray265[this.anInt857] = local480;
												this.anIntArray266[this.anInt857] = local61.anInt509;
												this.anInt857++;
											}
										}
									}
									local480++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1135) RuntimeException local1135) {
			signlink.reporterror("81682, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -4903 + ", " + arg5 + ", " + local1135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method679() {
		try {
			if (this.anInt980 == 0) {
				@Pc(8) int local8 = super.anInt828;
				if (this.anInt864 == 1 && super.anInt829 >= 516 && super.anInt830 >= 160 && super.anInt829 <= 765 && super.anInt830 <= 205) {
					local8 = 0;
				}
				@Pc(49) int local49;
				@Pc(52) int local52;
				@Pc(128) int local128;
				if (this.aBoolean271) {
					if (local8 != 1) {
						local49 = super.anInt823;
						local52 = super.anInt824;
						if (this.anInt859 == 0) {
							local49 -= 4;
							local52 -= 4;
						}
						if (this.anInt859 == 1) {
							local49 -= 553;
							local52 -= 205;
						}
						if (this.anInt859 == 2) {
							local49 -= 17;
							local52 -= 357;
						}
						if (local49 < this.anInt860 - 10 || local49 > this.anInt860 + this.anInt862 + 10 || local52 < this.anInt861 - 10 || local52 > this.anInt861 + this.anInt863 + 10) {
							this.aBoolean271 = false;
							if (this.anInt859 == 1) {
								this.aBoolean281 = true;
							}
							if (this.anInt859 == 2) {
								this.aBoolean249 = true;
							}
						}
					}
					if (local8 == 1) {
						local49 = this.anInt860;
						local52 = this.anInt861;
						local128 = this.anInt862;
						@Pc(131) int local131 = super.anInt829;
						@Pc(134) int local134 = super.anInt830;
						if (this.anInt859 == 0) {
							local131 -= 4;
							local134 -= 4;
						}
						if (this.anInt859 == 1) {
							local131 -= 553;
							local134 -= 205;
						}
						if (this.anInt859 == 2) {
							local131 -= 17;
							local134 -= 357;
						}
						@Pc(153) int local153 = -1;
						for (@Pc(155) int local155 = 0; local155 < this.anInt857; local155++) {
							@Pc(170) int local170 = local52 + (this.anInt857 - 1 - local155) * 15 + 31;
							if (local131 > local49 && local131 < local49 + local128 && local134 > local170 - 13 && local134 < local170 + 3) {
								local153 = local155;
							}
						}
						if (local153 != -1) {
							this.method658(local153);
						}
						this.aBoolean271 = false;
						if (this.anInt859 == 1) {
							this.aBoolean281 = true;
						}
						if (this.anInt859 == 2) {
							this.aBoolean249 = true;
							return;
						}
					}
				} else {
					if (local8 == 1 && this.anInt857 > 0) {
						local49 = this.anIntArray267[this.anInt857 - 1];
						if (local49 == 114 || local49 == 819 || local49 == 474 || local49 == 541 || local49 == 140 || local49 == 257 || local49 == 104 || local49 == 984 || local49 == 36 || local49 == 815 || local49 == 68 || local49 == 1313) {
							local52 = this.anIntArray265[this.anInt857 - 1];
							local128 = this.anIntArray266[this.anInt857 - 1];
							@Pc(290) Class35 local290 = Class35.aClass35Array1[local128];
							if (local290.aBoolean161 || local290.aBoolean166) {
								this.aBoolean273 = false;
								this.anInt1030 = 0;
								this.anInt978 = local128;
								this.anInt979 = local52;
								this.anInt980 = 2;
								this.anInt981 = super.anInt829;
								this.anInt982 = super.anInt830;
								if (Class35.aClass35Array1[local128].anInt492 == this.anInt888) {
									this.anInt980 = 1;
								}
								if (Class35.aClass35Array1[local128].anInt492 == this.anInt867) {
									this.anInt980 = 3;
								}
								return;
							}
						}
					}
					if (local8 == 1 && (this.anInt940 == 1 || this.method664(this.anInt857 - 1)) && this.anInt857 > 2) {
						local8 = 2;
					}
					if (local8 == 1 && this.anInt857 > 0) {
						this.method658(this.anInt857 - 1);
					}
					if (local8 != 2 || this.anInt857 <= 0) {
						return;
					}
					this.method615();
				}
			}
		} catch (@Pc(385) RuntimeException local385) {
			signlink.reporterror("58677, " + -39297 + ", " + local385.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!IMUIZRAF;I)V")
	private void method680(@OriginalArg(1) Class3_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(17) int local17 = arg0.method157(8);
			@Pc(23) int local23;
			if (local17 < this.anInt1018) {
				for (local23 = local17; local23 < this.anInt1018; local23++) {
					this.anIntArray253[this.anInt998++] = this.anIntArray255[local23];
				}
			}
			if (local17 > this.anInt1018) {
				signlink.reporterror(this.aString17 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt1018 = 0;
			for (local23 = 0; local23 < local17; local23++) {
				@Pc(75) int local75 = this.anIntArray255[local23];
				@Pc(80) Class3_Sub1_Sub2_Sub1_Sub2 local80 = this.aClass3_Sub1_Sub2_Sub1_Sub2Array1[local75];
				@Pc(85) int local85 = arg0.method157(1);
				if (local85 == 0) {
					this.anIntArray255[this.anInt1018++] = local75;
					local80.anInt560 = anInt1054;
				} else {
					@Pc(108) int local108 = arg0.method157(2);
					if (local108 == 0) {
						this.anIntArray255[this.anInt1018++] = local75;
						local80.anInt560 = anInt1054;
						this.anIntArray256[this.anInt1019++] = local75;
					} else {
						@Pc(159) int local159;
						@Pc(169) int local169;
						if (local108 == 1) {
							this.anIntArray255[this.anInt1018++] = local75;
							local80.anInt560 = anInt1054;
							local159 = arg0.method157(3);
							local80.method386(false, local159);
							local169 = arg0.method157(1);
							if (local169 == 1) {
								this.anIntArray256[this.anInt1019++] = local75;
							}
						} else if (local108 == 2) {
							this.anIntArray255[this.anInt1018++] = local75;
							local80.anInt560 = anInt1054;
							local159 = arg0.method157(3);
							local80.method386(true, local159);
							local169 = arg0.method157(3);
							local80.method386(true, local169);
							@Pc(227) int local227 = arg0.method157(1);
							if (local227 == 1) {
								this.anIntArray256[this.anInt1019++] = local75;
							}
						} else if (local108 == 3) {
							this.anIntArray253[this.anInt998++] = local75;
						}
					}
				}
			}
		} catch (@Pc(264) RuntimeException local264) {
			signlink.reporterror("85203, " + -857 + ", " + arg0 + ", " + arg1 + ", " + local264.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
	private void method681(@OriginalArg(0) byte arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt533 >> 7 == this.anInt996 && aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt534 >> 7 == this.anInt997) {
				this.anInt996 = 0;
			}
			@Pc(21) int local21 = this.anInt1018;
			@Pc(26) boolean local26 = false;
			if (arg1) {
				local21 = 1;
			}
			for (@Pc(36) int local36 = 0; local36 < local21; local36++) {
				@Pc(42) Class3_Sub1_Sub2_Sub1_Sub2 local42;
				@Pc(47) int local47;
				if (arg1) {
					local42 = aClass3_Sub1_Sub2_Sub1_Sub2_1;
					local47 = this.anInt1017 << 14;
				} else {
					local42 = this.aClass3_Sub1_Sub2_Sub1_Sub2Array1[this.anIntArray255[local36]];
					local47 = this.anIntArray255[local36] << 14;
				}
				if (local42 != null && local42.method387()) {
					local42.aBoolean177 = false;
					if ((aBoolean258 && this.anInt1018 > 50 || this.anInt1018 > 200) && !arg1 && local42.anInt549 == local42.anInt567) {
						local42.aBoolean177 = true;
					}
					@Pc(98) int local98 = local42.anInt533 >> 7;
					@Pc(103) int local103 = local42.anInt534 >> 7;
					if (local98 >= 0 && local98 < 104 && local103 >= 0 && local103 < 104) {
						if (local42.aClass3_Sub1_Sub2_Sub6_1 == null || anInt1054 < local42.anInt575 || anInt1054 >= local42.anInt576) {
							if ((local42.anInt533 & 0x7F) == 64 && (local42.anInt534 & 0x7F) == 64) {
								if (this.anIntArrayArray23[local98][local103] == this.anInt949) {
									continue;
								}
								this.anIntArrayArray23[local98][local103] = this.anInt949;
							}
							local42.anInt588 = this.method629(local42.anInt534, this.anInt911, local42.anInt533);
							this.aClass25_1.method246(local42.anInt588, local47, 60, local42.anInt533, local42, this.anInt911, local42.anInt534, local42.anInt535, local42.aBoolean174);
						} else {
							local42.aBoolean177 = false;
							local42.anInt588 = this.method629(local42.anInt534, this.anInt911, local42.anInt533);
							this.aClass25_1.method247(local42.anInt533, local42.anInt581, local47, local42.anInt578, local42.anInt588, local42.anInt535, this.anInt911, local42, local42.anInt580, local42.anInt579, local42.anInt534);
						}
					}
				}
			}
		} catch (@Pc(232) RuntimeException local232) {
			signlink.reporterror("42805, " + arg0 + ", " + arg1 + ", " + local232.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method682() {
		try {
			try {
				@Pc(12) int local12 = aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt533 + this.anInt1014;
				@Pc(18) int local18 = aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt534 + this.anInt909;
				if (this.anInt993 - local12 < -500 || this.anInt993 - local12 > 500 || this.anInt994 - local18 < -500 || this.anInt994 - local18 > 500) {
					this.anInt993 = local12;
					this.anInt994 = local18;
				}
				if (this.anInt993 != local12) {
					this.anInt993 += (local12 - this.anInt993) / 16;
				}
				if (this.anInt994 != local18) {
					this.anInt994 += (local18 - this.anInt994) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt967 += (-this.anInt967 - 24) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt967 += (24 - this.anInt967) / 2;
				} else {
					this.anInt967 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt968 += (12 - this.anInt968) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt968 += (-this.anInt968 - 12) / 2;
				} else {
					this.anInt968 /= 2;
				}
				this.anInt966 = this.anInt966 + this.anInt967 / 2 & 0x7FF;
				this.anInt965 += this.anInt968 / 2;
				if (this.anInt965 < 128) {
					this.anInt965 = 128;
				}
				if (this.anInt965 > 383) {
					this.anInt965 = 383;
				}
				@Pc(205) int local205 = this.anInt993 >> 7;
				@Pc(210) int local210 = this.anInt994 >> 7;
				@Pc(220) int local220 = this.method629(this.anInt994, this.anInt911, this.anInt993);
				@Pc(222) int local222 = 0;
				@Pc(238) int local238;
				if (local205 > 3 && local210 > 3 && local205 < 100 && local210 < 100) {
					for (local238 = local205 - 4; local238 <= local205 + 4; local238++) {
						for (@Pc(244) int local244 = local210 - 4; local244 <= local210 + 4; local244++) {
							@Pc(249) int local249 = this.anInt911;
							if (local249 < 3 && (this.aByteArrayArrayArray8[1][local238][local244] & 0x2) == 2) {
								local249++;
							}
							@Pc(276) int local276 = local220 - this.anIntArrayArrayArray7[local249][local238][local244];
							if (local276 > local222) {
								local222 = local276;
							}
						}
					}
				}
				local238 = local222 * 192;
				if (local238 > 98048) {
					local238 = 98048;
				}
				if (local238 < 32768) {
					local238 = 32768;
				}
				if (local238 > this.anInt941) {
					this.anInt941 += (local238 - this.anInt941) / 24;
				} else if (local238 < this.anInt941) {
					this.anInt941 += (local238 - this.anInt941) / 80;
				}
			} catch (@Pc(340) Exception local340) {
				signlink.reporterror("glfc_ex " + aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt533 + "," + aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt534 + "," + this.anInt993 + "," + this.anInt994 + "," + this.anInt986 + "," + this.anInt987 + "," + this.anInt919 + "," + this.anInt920);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(390) RuntimeException local390) {
			signlink.reporterror("93278, " + 752 + ", " + local390.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method683(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0) {
				anInt1007++;
				if (anInt1007 > 138) {
					anInt1007 = 0;
					this.aClass3_Sub1_Sub3_6.method135(104, this.anInt946);
					this.aClass3_Sub1_Sub3_6.method136(156);
				}
				while (true) {
					@Pc(28) int local28;
					do {
						while (true) {
							local28 = this.method573(this.anInt848);
							if (local28 == -1) {
								return;
							}
							if (this.anInt888 != -1 && this.anInt888 == this.anInt1005) {
								if (local28 == 8 && this.aString23.length() > 0) {
									this.aString23 = this.aString23.substring(0, this.aString23.length() - 1);
								}
								break;
							}
							@Pc(209) int local209;
							if (this.aBoolean267) {
								if (local28 >= 32 && local28 <= 122 && this.aString24.length() < 80) {
									this.aString24 = this.aString24 + (char) local28;
									this.aBoolean249 = true;
								}
								if (local28 == 8 && this.aString24.length() > 0) {
									this.aString24 = this.aString24.substring(0, this.aString24.length() - 1);
									this.aBoolean249 = true;
								}
								if (local28 == 13 || local28 == 10) {
									this.aBoolean267 = false;
									this.aBoolean249 = true;
									@Pc(168) long local168;
									if (this.anInt1025 == 1) {
										local168 = Class23.method226(this.aString24);
										this.method632(local168);
									}
									if (this.anInt1025 == 2 && this.anInt1037 > 0) {
										local168 = Class23.method226(this.aString24);
										this.method655(local168);
									}
									if (this.anInt1025 == 3 && this.aString24.length() > 0) {
										this.aClass3_Sub1_Sub3_6.method135(53, this.anInt946);
										this.aClass3_Sub1_Sub3_6.method136(0);
										local209 = this.aClass3_Sub1_Sub3_6.anInt243;
										this.aClass3_Sub1_Sub3_6.method142(979, this.aLong29);
										Class18.method185(this.aString24, this.aClass3_Sub1_Sub3_6, 974);
										this.aClass3_Sub1_Sub3_6.method145(this.anInt853, this.aClass3_Sub1_Sub3_6.anInt243 - local209);
										this.aString24 = Class18.method186(this.aString24, 852);
										this.aString24 = Class21.method198(this.aString24, 852);
										this.method667(6, Class23.method230(Class23.method227(this.aLong29)), this.aString24);
										if (this.anInt1020 == 2) {
											this.anInt1020 = 1;
											this.aBoolean246 = true;
											this.aClass3_Sub1_Sub3_6.method135(112, this.anInt946);
											this.aClass3_Sub1_Sub3_6.method136(this.anInt971);
											this.aClass3_Sub1_Sub3_6.method136(this.anInt1020);
											this.aClass3_Sub1_Sub3_6.method136(this.anInt1004);
										}
									}
									if (this.anInt1025 == 4 && this.anInt977 < 100) {
										local168 = Class23.method226(this.aString24);
										this.method612(local168);
									}
									if (this.anInt1025 == 5 && this.anInt977 > 0) {
										local168 = Class23.method226(this.aString24);
										this.method639(local168);
									}
								}
							} else if (this.anInt1006 == 1) {
								if (local28 >= 48 && local28 <= 57 && this.aString28.length() < 10) {
									this.aString28 = this.aString28 + (char) local28;
									this.aBoolean249 = true;
								}
								if (local28 == 8 && this.aString28.length() > 0) {
									this.aString28 = this.aString28.substring(0, this.aString28.length() - 1);
									this.aBoolean249 = true;
								}
								if (local28 == 13 || local28 == 10) {
									if (this.aString28.length() > 0) {
										local209 = 0;
										try {
											local209 = Integer.parseInt(this.aString28);
										} catch (@Pc(388) Exception local388) {
										}
										this.aClass3_Sub1_Sub3_6.method135(134, this.anInt946);
										this.aClass3_Sub1_Sub3_6.method140(local209);
									}
									this.anInt1006 = 0;
									this.aBoolean249 = true;
								}
							} else if (this.anInt1006 == 2) {
								if (local28 >= 32 && local28 <= 122 && this.aString28.length() < 12) {
									this.aString28 = this.aString28 + (char) local28;
									this.aBoolean249 = true;
								}
								if (local28 == 8 && this.aString28.length() > 0) {
									this.aString28 = this.aString28.substring(0, this.aString28.length() - 1);
									this.aBoolean249 = true;
								}
								if (local28 == 13 || local28 == 10) {
									if (this.aString28.length() > 0) {
										this.aClass3_Sub1_Sub3_6.method135(69, this.anInt946);
										this.aClass3_Sub1_Sub3_6.method142(979, Class23.method226(this.aString28));
									}
									this.anInt1006 = 0;
									this.aBoolean249 = true;
								}
							} else if (this.anInt867 == -1) {
								if (local28 >= 32 && local28 <= 122 && this.aString25.length() < 80) {
									this.aString25 = this.aString25 + (char) local28;
									this.aBoolean249 = true;
								}
								if (local28 == 8 && this.aString25.length() > 0) {
									this.aString25 = this.aString25.substring(0, this.aString25.length() - 1);
									this.aBoolean249 = true;
								}
								if ((local28 == 13 || local28 == 10) && this.aString25.length() > 0) {
									if (this.anInt876 == 2) {
										if (this.aString25.equals("::clientdrop")) {
											this.method610();
										}
										if (this.aString25.equals("::lag")) {
											this.method591();
										}
										if (this.aString25.equals("::prefetchmusic")) {
											for (local209 = 0; local209 < this.aClass19_Sub1_1.method411(2, 86); local209++) {
												this.aClass19_Sub1_1.method405(2, local209, (byte) 1);
											}
										}
										if (this.aString25.equals("::fpson")) {
											aBoolean282 = true;
										}
										if (this.aString25.equals("::fpsoff")) {
											aBoolean282 = false;
										}
										if (this.aString25.equals("::noclip")) {
											for (local209 = 0; local209 < 4; local209++) {
												for (@Pc(618) int local618 = 1; local618 < 103; local618++) {
													for (@Pc(622) int local622 = 1; local622 < 103; local622++) {
														this.aClass44Array1[local209].anIntArrayArray16[local618][local622] = 0;
													}
												}
											}
										}
									}
									if (this.aString25.startsWith("::")) {
										this.aClass3_Sub1_Sub3_6.method135(98, this.anInt946);
										this.aClass3_Sub1_Sub3_6.method136(this.aString25.length() - 1);
										this.aClass3_Sub1_Sub3_6.method143(this.aString25.substring(2));
									} else {
										@Pc(678) String local678 = this.aString25.toLowerCase();
										@Pc(680) byte local680 = 0;
										if (local678.startsWith("yellow:")) {
											local680 = 0;
											this.aString25 = this.aString25.substring(7);
										} else if (local678.startsWith("red:")) {
											local680 = 1;
											this.aString25 = this.aString25.substring(4);
										} else if (local678.startsWith("green:")) {
											local680 = 2;
											this.aString25 = this.aString25.substring(6);
										} else if (local678.startsWith("cyan:")) {
											local680 = 3;
											this.aString25 = this.aString25.substring(5);
										} else if (local678.startsWith("purple:")) {
											local680 = 4;
											this.aString25 = this.aString25.substring(7);
										} else if (local678.startsWith("white:")) {
											local680 = 5;
											this.aString25 = this.aString25.substring(6);
										} else if (local678.startsWith("flash1:")) {
											local680 = 6;
											this.aString25 = this.aString25.substring(7);
										} else if (local678.startsWith("flash2:")) {
											local680 = 7;
											this.aString25 = this.aString25.substring(7);
										} else if (local678.startsWith("flash3:")) {
											local680 = 8;
											this.aString25 = this.aString25.substring(7);
										} else if (local678.startsWith("glow1:")) {
											local680 = 9;
											this.aString25 = this.aString25.substring(6);
										} else if (local678.startsWith("glow2:")) {
											local680 = 10;
											this.aString25 = this.aString25.substring(6);
										} else if (local678.startsWith("glow3:")) {
											local680 = 11;
											this.aString25 = this.aString25.substring(6);
										}
										local678 = this.aString25.toLowerCase();
										@Pc(852) byte local852 = 0;
										if (local678.startsWith("wave:")) {
											local852 = 1;
											this.aString25 = this.aString25.substring(5);
										} else if (local678.startsWith("wave2:")) {
											local852 = 2;
											this.aString25 = this.aString25.substring(6);
										} else if (local678.startsWith("shake:")) {
											local852 = 3;
											this.aString25 = this.aString25.substring(6);
										} else if (local678.startsWith("scroll:")) {
											local852 = 4;
											this.aString25 = this.aString25.substring(7);
										} else if (local678.startsWith("slide:")) {
											local852 = 5;
											this.aString25 = this.aString25.substring(6);
										}
										this.aClass3_Sub1_Sub3_6.method135(228, this.anInt946);
										this.aClass3_Sub1_Sub3_6.method136(0);
										@Pc(934) int local934 = this.aClass3_Sub1_Sub3_6.anInt243;
										this.aClass3_Sub1_Sub3_6.method164(local680);
										this.aClass3_Sub1_Sub3_8.anInt243 = 0;
										Class18.method185(this.aString25, this.aClass3_Sub1_Sub3_8, 974);
										this.aClass3_Sub1_Sub3_6.method181(this.aClass3_Sub1_Sub3_8.aByteArray5, this.aClass3_Sub1_Sub3_8.anInt243);
										this.aClass3_Sub1_Sub3_6.method136(local852);
										this.aClass3_Sub1_Sub3_6.method145(this.anInt853, this.aClass3_Sub1_Sub3_6.anInt243 - local934);
										this.aString25 = Class18.method186(this.aString25, 852);
										this.aString25 = Class21.method198(this.aString25, 852);
										aClass3_Sub1_Sub2_Sub1_Sub2_1.aString12 = this.aString25;
										aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt536 = local680;
										aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt559 = local852;
										aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt540 = 150;
										if (this.anInt876 == 2) {
											this.method667(2, "@cr2@" + aClass3_Sub1_Sub2_Sub1_Sub2_1.aString13, aClass3_Sub1_Sub2_Sub1_Sub2_1.aString12);
										} else if (this.anInt876 == 1) {
											this.method667(2, "@cr1@" + aClass3_Sub1_Sub2_Sub1_Sub2_1.aString13, aClass3_Sub1_Sub2_Sub1_Sub2_1.aString12);
										} else {
											this.method667(2, aClass3_Sub1_Sub2_Sub1_Sub2_1.aString13, aClass3_Sub1_Sub2_Sub1_Sub2_1.aString12);
										}
										if (this.anInt971 == 2) {
											this.anInt971 = 3;
											this.aBoolean246 = true;
											this.aClass3_Sub1_Sub3_6.method135(112, this.anInt946);
											this.aClass3_Sub1_Sub3_6.method136(this.anInt971);
											this.aClass3_Sub1_Sub3_6.method136(this.anInt1020);
											this.aClass3_Sub1_Sub3_6.method136(this.anInt1004);
										}
									}
									this.aString25 = "";
									this.aBoolean249 = true;
								}
							}
						}
					} while ((local28 < 97 || local28 > 122) && (local28 < 65 || local28 > 90) && (local28 < 48 || local28 > 57) && local28 != 32);
					if (this.aString23.length() < 12) {
						this.aString23 = this.aString23 + (char) local28;
					}
				}
			}
		} catch (@Pc(1088) RuntimeException local1088) {
			signlink.reporterror("9792, " + arg0 + ", " + local1088.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!SJPORZIF;I)Z")
	private boolean method684(@OriginalArg(0) Class35 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt513;
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
				this.aStringArray9[this.anInt857] = "Remove @whi@" + this.aStringArray12[local4];
				this.anIntArray267[this.anInt857] = 647;
				this.anInt857++;
				this.aStringArray9[this.anInt857] = "Message @whi@" + this.aStringArray12[local4];
				this.anIntArray267[this.anInt857] = 499;
				this.anInt857++;
				return true;
			} else if (local4 >= 401 && local4 <= 500) {
				this.aStringArray9[this.anInt857] = "Remove @whi@" + arg0.aString8;
				this.anIntArray267[this.anInt857] = 320;
				this.anInt857++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("37868, " + arg0 + ", " + 21568 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method685(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt928 == 2) {
				this.method595(this.anInt1034 * 2, (byte) 8, (this.anInt1032 - this.anInt919 << 7) + this.anInt1035, (this.anInt1033 - this.anInt920 << 7) + this.anInt1036);
				while (arg0 >= 0) {
					this.method574();
				}
				if (this.anInt1026 > -1 && anInt1054 % 20 < 10) {
					this.aClass3_Sub1_Sub1_Sub4Array4[2].method554(this.anInt1026 - 12, this.anInt1027 - 28);
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("92881, " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method686() {
		try {
			for (@Pc(6) int local6 = 0; local6 < this.anInt902; local6++) {
				@Pc(13) int local13 = this.anIntArray232[local6];
				@Pc(18) Class3_Sub1_Sub2_Sub1_Sub1 local18 = this.aClass3_Sub1_Sub2_Sub1_Sub1Array1[local13];
				if (local18 != null) {
					this.method687(local18, local18.aClass42_1.aByte18);
				}
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("78552, " + 0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!BBWFUJHQ;BI)V")
	private void method687(@OriginalArg(0) Class3_Sub1_Sub2_Sub1 arg0, @OriginalArg(2) int arg1) {
		try {
			if (arg0.anInt533 < 128 || arg0.anInt534 < 128 || arg0.anInt533 >= 13184 || arg0.anInt534 >= 13184) {
				arg0.anInt526 = -1;
				arg0.anInt561 = -1;
				arg0.anInt546 = 0;
				arg0.anInt547 = 0;
				arg0.anInt533 = arg0.anIntArray115[0] * 128 + arg0.anInt525 * 64;
				arg0.anInt534 = arg0.anIntArray116[0] * 128 + arg0.anInt525 * 64;
				arg0.method383();
			}
			if (arg0 == aClass3_Sub1_Sub2_Sub1_Sub2_1 && (arg0.anInt533 < 1536 || arg0.anInt534 < 1536 || arg0.anInt533 >= 11776 || arg0.anInt534 >= 11776)) {
				arg0.anInt526 = -1;
				arg0.anInt561 = -1;
				arg0.anInt546 = 0;
				arg0.anInt547 = 0;
				arg0.anInt533 = arg0.anIntArray115[0] * 128 + arg0.anInt525 * 64;
				arg0.anInt534 = arg0.anIntArray116[0] * 128 + arg0.anInt525 * 64;
				arg0.method383();
			}
			if (arg0.anInt546 > anInt1054) {
				this.method688(arg0);
			} else if (arg0.anInt547 >= anInt1054) {
				this.method689(arg0);
			} else {
				this.method690(arg0);
			}
			this.method691(arg0);
			this.method692(arg0);
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("74668, " + arg0 + ", " + 42 + ", " + arg1 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!BBWFUJHQ;)V")
	private void method688(@OriginalArg(1) Class3_Sub1_Sub2_Sub1 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt546 - anInt1054;
			@Pc(14) int local14 = arg0.anInt542 * 128 + arg0.anInt525 * 64;
			@Pc(24) int local24 = arg0.anInt544 * 128 + arg0.anInt525 * 64;
			arg0.anInt533 += (local14 - arg0.anInt533) / local4;
			arg0.anInt534 += (local24 - arg0.anInt534) / local4;
			arg0.anInt532 = 0;
			if (arg0.anInt548 == 0) {
				arg0.anInt572 = 1024;
			}
			if (arg0.anInt548 == 1) {
				arg0.anInt572 = 1536;
			}
			if (arg0.anInt548 == 2) {
				arg0.anInt572 = 0;
			}
			if (arg0.anInt548 == 3) {
				arg0.anInt572 = 512;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("14596, " + -874 + ", " + arg0 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!BBWFUJHQ;Z)V")
	private void method689(@OriginalArg(0) Class3_Sub1_Sub2_Sub1 arg0) {
		try {
			if (arg0.anInt547 == anInt1054 || arg0.anInt526 == -1 || arg0.anInt529 != 0 || arg0.anInt528 + 1 > Class49.aClass49Array1[arg0.anInt526].method567(arg0.anInt527)) {
				@Pc(29) int local29 = arg0.anInt547 - arg0.anInt546;
				@Pc(34) int local34 = anInt1054 - arg0.anInt546;
				@Pc(44) int local44 = arg0.anInt542 * 128 + arg0.anInt525 * 64;
				@Pc(54) int local54 = arg0.anInt544 * 128 + arg0.anInt525 * 64;
				@Pc(64) int local64 = arg0.anInt543 * 128 + arg0.anInt525 * 64;
				@Pc(74) int local74 = arg0.anInt545 * 128 + arg0.anInt525 * 64;
				arg0.anInt533 = (local44 * (local29 - local34) + local64 * local34) / local29;
				arg0.anInt534 = (local54 * (local29 - local34) + local74 * local34) / local29;
			}
			arg0.anInt532 = 0;
			this.aBoolean251 &= true;
			if (arg0.anInt548 == 0) {
				arg0.anInt572 = 1024;
			}
			if (arg0.anInt548 == 1) {
				arg0.anInt572 = 1536;
			}
			if (arg0.anInt548 == 2) {
				arg0.anInt572 = 0;
			}
			if (arg0.anInt548 == 3) {
				arg0.anInt572 = 512;
			}
			arg0.anInt535 = arg0.anInt572;
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("95052, " + arg0 + ", " + true + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!BBWFUJHQ;)V")
	private void method690(@OriginalArg(1) Class3_Sub1_Sub2_Sub1 arg0) {
		try {
			arg0.anInt549 = arg0.anInt567;
			if (arg0.anInt557 == 0) {
				arg0.anInt532 = 0;
			} else {
				if (arg0.anInt526 != -1 && arg0.anInt529 == 0) {
					@Pc(24) Class49 local24 = Class49.aClass49Array1[arg0.anInt526];
					if (arg0.anInt541 > 0 && local24.anInt792 == 0) {
						arg0.anInt532++;
						return;
					}
					if (arg0.anInt541 <= 0 && local24.anInt793 == 0) {
						arg0.anInt532++;
						return;
					}
				}
				@Pc(53) int local53 = arg0.anInt533;
				@Pc(56) int local56 = arg0.anInt534;
				@Pc(71) int local71 = arg0.anIntArray115[arg0.anInt557 - 1] * 128 + arg0.anInt525 * 64;
				@Pc(86) int local86 = arg0.anIntArray116[arg0.anInt557 - 1] * 128 + arg0.anInt525 * 64;
				if (local71 - local53 <= 256 && local71 - local53 >= -256 && local86 - local56 <= 256 && local86 - local56 >= -256) {
					if (local53 < local71) {
						if (local56 < local86) {
							arg0.anInt572 = 1280;
						} else if (local56 > local86) {
							arg0.anInt572 = 1792;
						} else {
							arg0.anInt572 = 1536;
						}
					} else if (local53 > local71) {
						if (local56 < local86) {
							arg0.anInt572 = 768;
						} else if (local56 > local86) {
							arg0.anInt572 = 256;
						} else {
							arg0.anInt572 = 512;
						}
					} else if (local56 < local86) {
						arg0.anInt572 = 1024;
					} else {
						arg0.anInt572 = 0;
					}
					@Pc(180) int local180 = arg0.anInt572 - arg0.anInt535 & 0x7FF;
					if (local180 > 1024) {
						local180 -= 2048;
					}
					@Pc(187) int local187 = arg0.anInt554;
					if (local180 >= -256 && local180 <= 256) {
						local187 = arg0.anInt553;
					} else if (local180 >= 256 && local180 < 768) {
						local187 = arg0.anInt556;
					} else if (local180 >= -768 && local180 <= -256) {
						local187 = arg0.anInt555;
					}
					if (local187 == -1) {
						local187 = arg0.anInt553;
					}
					arg0.anInt549 = local187;
					@Pc(235) int local235 = 4;
					if (arg0.anInt535 != arg0.anInt572 && arg0.anInt531 == -1 && arg0.anInt552 != 0) {
						local235 = 2;
					}
					if (arg0.anInt557 > 2) {
						local235 = 6;
					}
					if (arg0.anInt557 > 3) {
						local235 = 8;
					}
					if (arg0.anInt532 > 0 && arg0.anInt557 > 1) {
						local235 = 8;
						arg0.anInt532--;
					}
					if (arg0.aBooleanArray7[arg0.anInt557 - 1]) {
						local235 <<= 0x1;
					}
					if (local235 >= 8 && arg0.anInt549 == arg0.anInt553 && arg0.anInt566 != -1) {
						arg0.anInt549 = arg0.anInt566;
					}
					if (local53 < local71) {
						arg0.anInt533 += local235;
						if (arg0.anInt533 > local71) {
							arg0.anInt533 = local71;
						}
					} else if (local53 > local71) {
						arg0.anInt533 -= local235;
						if (arg0.anInt533 < local71) {
							arg0.anInt533 = local71;
						}
					}
					if (local56 < local86) {
						arg0.anInt534 += local235;
						if (arg0.anInt534 > local86) {
							arg0.anInt534 = local86;
						}
					} else if (local56 > local86) {
						arg0.anInt534 -= local235;
						if (arg0.anInt534 < local86) {
							arg0.anInt534 = local86;
						}
					}
					if (arg0.anInt533 == local71 && arg0.anInt534 == local86) {
						arg0.anInt557--;
						if (arg0.anInt541 > 0) {
							arg0.anInt541--;
							return;
						}
					}
				} else {
					arg0.anInt533 = local71;
					arg0.anInt534 = local86;
				}
			}
		} catch (@Pc(397) RuntimeException local397) {
			signlink.reporterror("25692, " + -79 + ", " + arg0 + ", " + local397.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!BBWFUJHQ;)V")
	private void method691(@OriginalArg(1) Class3_Sub1_Sub2_Sub1 arg0) {
		try {
			if (arg0.anInt552 != 0) {
				@Pc(32) int local32;
				@Pc(38) int local38;
				if (arg0.anInt531 != -1 && arg0.anInt531 < 32768) {
					@Pc(24) Class3_Sub1_Sub2_Sub1_Sub1 local24 = this.aClass3_Sub1_Sub2_Sub1_Sub1Array1[arg0.anInt531];
					if (local24 != null) {
						local32 = arg0.anInt533 - local24.anInt533;
						local38 = arg0.anInt534 - local24.anInt534;
						if (local32 != 0 || local38 != 0) {
							arg0.anInt572 = (int) (Math.atan2((double) local32, (double) local38) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(63) int local63;
				if (arg0.anInt531 >= 32768) {
					local63 = arg0.anInt531 - 32768;
					if (local63 == this.anInt961) {
						local63 = this.anInt1017;
					}
					@Pc(75) Class3_Sub1_Sub2_Sub1_Sub2 local75 = this.aClass3_Sub1_Sub2_Sub1_Sub2Array1[local63];
					if (local75 != null) {
						local38 = arg0.anInt533 - local75.anInt533;
						@Pc(89) int local89 = arg0.anInt534 - local75.anInt534;
						if (local38 != 0 || local89 != 0) {
							arg0.anInt572 = (int) (Math.atan2((double) local38, (double) local89) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt537 != 0 || arg0.anInt538 != 0) && (arg0.anInt557 == 0 || arg0.anInt532 > 0)) {
					local63 = arg0.anInt533 - (arg0.anInt537 - this.anInt919 - this.anInt919) * 64;
					local32 = arg0.anInt534 - (arg0.anInt538 - this.anInt920 - this.anInt920) * 64;
					if (local63 != 0 || local32 != 0) {
						arg0.anInt572 = (int) (Math.atan2((double) local63, (double) local32) * 325.949D) & 0x7FF;
					}
					arg0.anInt537 = 0;
					arg0.anInt538 = 0;
				}
				local63 = arg0.anInt572 - arg0.anInt535 & 0x7FF;
				if (local63 != 0) {
					if (local63 < arg0.anInt552 || local63 > 2048 - arg0.anInt552) {
						arg0.anInt535 = arg0.anInt572;
					} else if (local63 > 1024) {
						arg0.anInt535 -= arg0.anInt552;
					} else {
						arg0.anInt535 += arg0.anInt552;
					}
					arg0.anInt535 &= 0x7FF;
					if (arg0.anInt549 == arg0.anInt567 && arg0.anInt535 != arg0.anInt572) {
						if (arg0.anInt568 != -1) {
							arg0.anInt549 = arg0.anInt568;
							return;
						}
						arg0.anInt549 = arg0.anInt553;
						return;
					}
				}
			}
		} catch (@Pc(243) RuntimeException local243) {
			signlink.reporterror("47855, " + false + ", " + arg0 + ", " + local243.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!BBWFUJHQ;)V")
	private void method692(@OriginalArg(1) Class3_Sub1_Sub2_Sub1 arg0) {
		try {
			arg0.aBoolean174 = false;
			@Pc(22) Class49 local22;
			if (arg0.anInt549 != -1) {
				local22 = Class49.aClass49Array1[arg0.anInt549];
				arg0.anInt551++;
				if (arg0.anInt550 < local22.anInt786 && arg0.anInt551 > local22.method567(arg0.anInt550)) {
					arg0.anInt551 = 0;
					arg0.anInt550++;
				}
				if (arg0.anInt550 >= local22.anInt786) {
					arg0.anInt551 = 0;
					arg0.anInt550 = 0;
				}
			}
			if (arg0.anInt561 != -1 && anInt1054 >= arg0.anInt564) {
				if (arg0.anInt562 < 0) {
					arg0.anInt562 = 0;
				}
				local22 = Class7.aClass7Array1[arg0.anInt561].aClass49_1;
				arg0.anInt563++;
				while (arg0.anInt562 < local22.anInt786 && arg0.anInt563 > local22.method567(arg0.anInt562)) {
					arg0.anInt563 -= local22.method567(arg0.anInt562);
					arg0.anInt562++;
				}
				if (arg0.anInt562 >= local22.anInt786 && (arg0.anInt562 < 0 || arg0.anInt562 >= local22.anInt786)) {
					arg0.anInt561 = -1;
				}
			}
			if (arg0.anInt526 != -1 && arg0.anInt529 <= 1) {
				local22 = Class49.aClass49Array1[arg0.anInt526];
				if (local22.anInt792 == 1 && arg0.anInt541 > 0 && arg0.anInt546 <= anInt1054 && arg0.anInt547 < anInt1054) {
					arg0.anInt529 = 1;
					return;
				}
			}
			if (arg0.anInt526 != -1 && arg0.anInt529 == 0) {
				local22 = Class49.aClass49Array1[arg0.anInt526];
				arg0.anInt528++;
				while (arg0.anInt527 < local22.anInt786 && arg0.anInt528 > local22.method567(arg0.anInt527)) {
					arg0.anInt528 -= local22.method567(arg0.anInt527);
					arg0.anInt527++;
				}
				if (arg0.anInt527 >= local22.anInt786) {
					arg0.anInt527 -= local22.anInt787;
					arg0.anInt530++;
					if (arg0.anInt530 >= local22.anInt791) {
						arg0.anInt526 = -1;
					}
					if (arg0.anInt527 < 0 || arg0.anInt527 >= local22.anInt786) {
						arg0.anInt526 = -1;
					}
				}
				arg0.aBoolean174 = local22.aBoolean238;
			}
			if (arg0.anInt529 > 0) {
				arg0.anInt529--;
			}
		} catch (@Pc(267) RuntimeException local267) {
			signlink.reporterror("41055, " + 44843 + ", " + arg0 + ", " + local267.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method693() {
		try {
			if (this.aBoolean285) {
				this.aBoolean285 = false;
				this.aClass36_6.method392(0, 4, super.aGraphics2);
				this.aClass36_7.method392(0, 357, super.aGraphics2);
				this.aClass36_8.method392(722, 4, super.aGraphics2);
				this.aClass36_9.method392(743, 205, super.aGraphics2);
				this.aClass36_10.method392(0, 0, super.aGraphics2);
				this.aClass36_11.method392(516, 4, super.aGraphics2);
				this.aClass36_12.method392(516, 205, super.aGraphics2);
				this.aClass36_13.method392(496, 357, super.aGraphics2);
				this.aClass36_14.method392(0, 338, super.aGraphics2);
				this.aBoolean281 = true;
				this.aBoolean249 = true;
				this.aBoolean262 = true;
				this.aBoolean246 = true;
				if (this.anInt870 != 2) {
					this.aClass36_26.method392(4, 4, super.aGraphics2);
					this.aClass36_25.method392(550, 4, super.aGraphics2);
				}
			}
			if (this.anInt870 == 2) {
				this.method674();
			}
			if (this.aBoolean271 && this.anInt859 == 1) {
				this.aBoolean281 = true;
			}
			@Pc(148) boolean local148;
			if (this.anInt958 != -1) {
				local148 = this.method704(this.anInt1052, this.anInt958);
				if (local148) {
					this.aBoolean281 = true;
				}
			}
			if (this.anInt838 == 2) {
				this.aBoolean281 = true;
			}
			if (this.anInt980 == 2) {
				this.aBoolean281 = true;
			}
			if (this.aBoolean281) {
				this.method583();
				this.aBoolean281 = false;
			}
			if (this.anInt867 == -1) {
				this.aClass35_1.anInt511 = this.anInt976 - this.anInt990 - 77;
				if (super.anInt823 > 448 && super.anInt823 < 560 && super.anInt824 > 332) {
					this.method630(77, false, this.aClass35_1, 0, this.anInt976, 463, super.anInt823 - 17, super.anInt824 - 357);
				}
				@Pc(230) int local230 = this.anInt976 - this.aClass35_1.anInt511 - 77;
				if (local230 < 0) {
					local230 = 0;
				}
				if (local230 > this.anInt976 - 77) {
					local230 = this.anInt976 - 77;
				}
				if (this.anInt990 != local230) {
					this.anInt990 = local230;
					this.aBoolean249 = true;
				}
			}
			if (this.anInt867 != -1) {
				local148 = this.method704(this.anInt1052, this.anInt867);
				if (local148) {
					this.aBoolean249 = true;
				}
			}
			if (this.anInt838 == 3) {
				this.aBoolean249 = true;
			}
			if (this.anInt980 == 3) {
				this.aBoolean249 = true;
			}
			if (this.aString22 != null) {
				this.aBoolean249 = true;
			}
			if (this.aBoolean271 && this.anInt859 == 2) {
				this.aBoolean249 = true;
			}
			if (this.aBoolean249) {
				this.method714();
				this.aBoolean249 = false;
			}
			if (this.anInt870 == 2) {
				this.method662();
				this.aClass36_25.method392(550, 4, super.aGraphics2);
			}
			if (this.anInt955 != -1) {
				this.aBoolean262 = true;
			}
			if (this.aBoolean262) {
				if (this.anInt955 != -1 && this.anInt955 == this.anInt1044) {
					this.anInt955 = -1;
					this.aClass3_Sub1_Sub3_6.method135(150, this.anInt946);
					this.aClass3_Sub1_Sub3_6.method136(this.anInt1044);
				}
				this.aBoolean262 = false;
				this.aClass36_5.method391();
				this.aClass3_Sub1_Sub1_Sub1_7.method44(0, 0);
				if (this.anInt958 == -1) {
					if (this.anIntArray250[this.anInt1044] != -1) {
						if (this.anInt1044 == 0) {
							this.aClass3_Sub1_Sub1_Sub1_8.method44(22, 10);
						}
						if (this.anInt1044 == 1) {
							this.aClass3_Sub1_Sub1_Sub1_9.method44(54, 8);
						}
						if (this.anInt1044 == 2) {
							this.aClass3_Sub1_Sub1_Sub1_9.method44(82, 8);
						}
						if (this.anInt1044 == 3) {
							this.aClass3_Sub1_Sub1_Sub1_10.method44(110, 8);
						}
						if (this.anInt1044 == 4) {
							this.aClass3_Sub1_Sub1_Sub1_12.method44(153, 8);
						}
						if (this.anInt1044 == 5) {
							this.aClass3_Sub1_Sub1_Sub1_12.method44(181, 8);
						}
						if (this.anInt1044 == 6) {
							this.aClass3_Sub1_Sub1_Sub1_11.method44(209, 9);
						}
					}
					if (this.anIntArray250[0] != -1 && (this.anInt955 != 0 || anInt1054 % 20 < 10)) {
						this.aClass3_Sub1_Sub1_Sub1Array2[0].method44(29, 13);
					}
					if (this.anIntArray250[1] != -1 && (this.anInt955 != 1 || anInt1054 % 20 < 10)) {
						this.aClass3_Sub1_Sub1_Sub1Array2[1].method44(53, 11);
					}
					if (this.anIntArray250[2] != -1 && (this.anInt955 != 2 || anInt1054 % 20 < 10)) {
						this.aClass3_Sub1_Sub1_Sub1Array2[2].method44(82, 11);
					}
					if (this.anIntArray250[3] != -1 && (this.anInt955 != 3 || anInt1054 % 20 < 10)) {
						this.aClass3_Sub1_Sub1_Sub1Array2[3].method44(115, 12);
					}
					if (this.anIntArray250[4] != -1 && (this.anInt955 != 4 || anInt1054 % 20 < 10)) {
						this.aClass3_Sub1_Sub1_Sub1Array2[4].method44(153, 13);
					}
					if (this.anIntArray250[5] != -1 && (this.anInt955 != 5 || anInt1054 % 20 < 10)) {
						this.aClass3_Sub1_Sub1_Sub1Array2[5].method44(180, 11);
					}
					if (this.anIntArray250[6] != -1 && (this.anInt955 != 6 || anInt1054 % 20 < 10)) {
						this.aClass3_Sub1_Sub1_Sub1Array2[6].method44(208, 13);
					}
				}
				this.aClass36_5.method392(516, 160, super.aGraphics2);
				this.aClass36_4.method391();
				this.aClass3_Sub1_Sub1_Sub1_6.method44(0, 0);
				if (this.anInt958 == -1) {
					if (this.anIntArray250[this.anInt1044] != -1) {
						if (this.anInt1044 == 7) {
							this.aClass3_Sub1_Sub1_Sub1_16.method44(42, 0);
						}
						if (this.anInt1044 == 8) {
							this.aClass3_Sub1_Sub1_Sub1_17.method44(74, 0);
						}
						if (this.anInt1044 == 9) {
							this.aClass3_Sub1_Sub1_Sub1_17.method44(102, 0);
						}
						if (this.anInt1044 == 10) {
							this.aClass3_Sub1_Sub1_Sub1_18.method44(130, 1);
						}
						if (this.anInt1044 == 11) {
							this.aClass3_Sub1_Sub1_Sub1_20.method44(173, 0);
						}
						if (this.anInt1044 == 12) {
							this.aClass3_Sub1_Sub1_Sub1_20.method44(201, 0);
						}
						if (this.anInt1044 == 13) {
							this.aClass3_Sub1_Sub1_Sub1_19.method44(229, 0);
						}
					}
					if (this.anIntArray250[8] != -1 && (this.anInt955 != 8 || anInt1054 % 20 < 10)) {
						this.aClass3_Sub1_Sub1_Sub1Array2[7].method44(74, 2);
					}
					if (this.anIntArray250[9] != -1 && (this.anInt955 != 9 || anInt1054 % 20 < 10)) {
						this.aClass3_Sub1_Sub1_Sub1Array2[8].method44(102, 3);
					}
					if (this.anIntArray250[10] != -1 && (this.anInt955 != 10 || anInt1054 % 20 < 10)) {
						this.aClass3_Sub1_Sub1_Sub1Array2[9].method44(137, 4);
					}
					if (this.anIntArray250[11] != -1 && (this.anInt955 != 11 || anInt1054 % 20 < 10)) {
						this.aClass3_Sub1_Sub1_Sub1Array2[10].method44(174, 2);
					}
					if (this.anIntArray250[12] != -1 && (this.anInt955 != 12 || anInt1054 % 20 < 10)) {
						this.aClass3_Sub1_Sub1_Sub1Array2[11].method44(201, 2);
					}
					if (this.anIntArray250[13] != -1 && (this.anInt955 != 13 || anInt1054 % 20 < 10)) {
						this.aClass3_Sub1_Sub1_Sub1Array2[12].method44(226, 2);
					}
				}
				this.aClass36_4.method392(496, 466, super.aGraphics2);
				this.aClass36_26.method391();
			}
			if (this.aBoolean246) {
				this.aBoolean246 = false;
				this.aClass36_3.method391();
				this.aClass3_Sub1_Sub1_Sub1_5.method44(0, 0);
				this.aClass3_Sub1_Sub1_Sub2_3.method86("Public chat", 55, 28, true, 16777215);
				if (this.anInt971 == 0) {
					this.aClass3_Sub1_Sub1_Sub2_3.method86("On", 55, 41, true, 65280);
				}
				if (this.anInt971 == 1) {
					this.aClass3_Sub1_Sub1_Sub2_3.method86("Friends", 55, 41, true, 16776960);
				}
				if (this.anInt971 == 2) {
					this.aClass3_Sub1_Sub1_Sub2_3.method86("Off", 55, 41, true, 16711680);
				}
				if (this.anInt971 == 3) {
					this.aClass3_Sub1_Sub1_Sub2_3.method86("Hide", 55, 41, true, 65535);
				}
				this.aClass3_Sub1_Sub1_Sub2_3.method86("Private chat", 184, 28, true, 16777215);
				if (this.anInt1020 == 0) {
					this.aClass3_Sub1_Sub1_Sub2_3.method86("On", 184, 41, true, 65280);
				}
				if (this.anInt1020 == 1) {
					this.aClass3_Sub1_Sub1_Sub2_3.method86("Friends", 184, 41, true, 16776960);
				}
				if (this.anInt1020 == 2) {
					this.aClass3_Sub1_Sub1_Sub2_3.method86("Off", 184, 41, true, 16711680);
				}
				this.aClass3_Sub1_Sub1_Sub2_3.method86("Trade/compete", 324, 28, true, 16777215);
				if (this.anInt1004 == 0) {
					this.aClass3_Sub1_Sub1_Sub2_3.method86("On", 324, 41, true, 65280);
				}
				if (this.anInt1004 == 1) {
					this.aClass3_Sub1_Sub1_Sub2_3.method86("Friends", 324, 41, true, 16776960);
				}
				if (this.anInt1004 == 2) {
					this.aClass3_Sub1_Sub1_Sub2_3.method86("Off", 324, 41, true, 16711680);
				}
				this.aClass3_Sub1_Sub1_Sub2_3.method86("Report abuse", 458, 33, true, 16777215);
				this.aClass36_3.method392(0, 453, super.aGraphics2);
				this.aClass36_26.method391();
			}
			this.anInt1052 = 0;
		} catch (@Pc(1057) RuntimeException local1057) {
			signlink.reporterror("50866, " + 0 + ", " + local1057.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method575() {
		try {
			if (!this.aBoolean280 && !this.aBoolean264 && !this.aBoolean274) {
				anInt1054++;
				if (this.aBoolean251) {
					this.method651();
				} else {
					this.method633();
				}
				this.method713();
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("13225, " + -601 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZII)V")
	private void method694(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		try {
			signlink.anInt1068 = arg1;
			if (arg0) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("15525, " + arg0 + ", " + -455 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method695() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt907; local3++) {
				if (this.anIntArray244[local3] <= 0) {
					@Pc(12) boolean local12 = false;
					try {
						if (this.anIntArray225[local3] != this.anInt1050 || this.anIntArray223[local3] != this.anInt927) {
							@Pc(45) Class3_Sub1_Sub3 local45 = Class8.method101(this.anIntArray225[local3], this.anIntArray223[local3]);
							if (System.currentTimeMillis() + (long) (local45.anInt243 / 22) > this.aLong32 + (long) (this.anInt991 / 22)) {
								this.anInt991 = local45.anInt243;
								this.aLong32 = System.currentTimeMillis();
								if (this.method620(local45.anInt243, local45.aByteArray5)) {
									this.anInt1050 = this.anIntArray225[local3];
									this.anInt927 = this.anIntArray223[local3];
								} else {
									local12 = true;
								}
							}
						} else if (!this.method711()) {
							local12 = true;
						}
					} catch (@Pc(95) Exception local95) {
					}
					if (local12 && this.anIntArray244[local3] != -5) {
						this.anIntArray244[local3] = -5;
					} else {
						this.anInt907--;
						for (@Pc(111) int local111 = local3; local111 < this.anInt907; local111++) {
							this.anIntArray225[local111] = this.anIntArray225[local111 + 1];
							this.anIntArray223[local111] = this.anIntArray223[local111 + 1];
							this.anIntArray244[local111] = this.anIntArray244[local111 + 1];
						}
						local3--;
					}
				} else {
					@Pc(163) int local163 = this.anIntArray244[local3]--;
				}
			}
			if (this.anInt868 > 0) {
				this.anInt868 -= 20;
				if (this.anInt868 < 0) {
					this.anInt868 = 0;
				}
				if (this.anInt868 == 0 && this.aBoolean247 && !aBoolean258) {
					this.anInt929 = this.anInt947;
					this.aBoolean260 = true;
					this.aClass19_Sub1_1.method406(2, this.anInt929);
					return;
				}
			}
		} catch (@Pc(216) RuntimeException local216) {
			signlink.reporterror("48590, " + 984 + ", " + local216.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZIIII)V")
	private void method696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg1 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg3 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg0;
			@Pc(23) int local23;
			@Pc(27) int local27;
			@Pc(37) int local37;
			if (local5 != 0) {
				local23 = Class3_Sub1_Sub2_Sub6.anIntArray199[local5];
				local27 = Class3_Sub1_Sub2_Sub6.anIntArray200[local5];
				local37 = local27 * 0 - arg0 * local23 >> 16;
				local17 = local23 * 0 + arg0 * local27 >> 16;
				local15 = local37;
			}
			if (local11 != 0) {
				local23 = Class3_Sub1_Sub2_Sub6.anIntArray199[local11];
				local27 = Class3_Sub1_Sub2_Sub6.anIntArray200[local11];
				local37 = local17 * local23 + local27 * 0 >> 16;
				local17 = local17 * local27 - local23 * 0 >> 16;
				local13 = local37;
			}
			this.anInt871 = arg4 - local13;
			this.anInt872 = arg5 - local15;
			this.anInt873 = arg2 - local17;
			this.anInt874 = arg1;
			this.anInt875 = arg3;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("78281, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method697() {
		try {
			if (this.anInt942 == 0 && super.anInt828 == 1) {
				@Pc(23) int local23 = super.anInt829 - 25 - 550;
				@Pc(30) int local30 = super.anInt830 - 5 - 4;
				if (local23 >= 0 && local30 >= 0 && local23 < 146 && local30 < 151) {
					local23 -= 73;
					local30 -= 75;
					@Pc(50) int local50 = this.anInt966 + this.anInt914 & 0x7FF;
					@Pc(54) int local54 = Class3_Sub1_Sub1_Sub3.anIntArray144[local50];
					@Pc(58) int local58 = Class3_Sub1_Sub1_Sub3.anIntArray145[local50];
					@Pc(67) int local67 = local54 * (this.anInt903 + 256) >> 8;
					@Pc(76) int local76 = local58 * (this.anInt903 + 256) >> 8;
					@Pc(86) int local86 = local30 * local67 + local23 * local76 >> 11;
					@Pc(96) int local96 = local30 * local76 - local23 * local67 >> 11;
					@Pc(103) int local103 = aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt533 + local86 >> 7;
					@Pc(110) int local110 = aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt534 - local96 >> 7;
					@Pc(131) boolean local131 = this.method624(0, aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0], aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0], 0, true, 1, local110, local103, 0, 0, 0);
					if (local131) {
						this.aClass3_Sub1_Sub3_6.method136(local23);
						this.aClass3_Sub1_Sub3_6.method136(local30);
						this.aClass3_Sub1_Sub3_6.method137(this.anInt966);
						this.aClass3_Sub1_Sub3_6.method136(57);
						this.aClass3_Sub1_Sub3_6.method136(this.anInt914);
						this.aClass3_Sub1_Sub3_6.method136(this.anInt903);
						this.aClass3_Sub1_Sub3_6.method136(89);
						this.aClass3_Sub1_Sub3_6.method137(aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt533);
						this.aClass3_Sub1_Sub3_6.method137(aClass3_Sub1_Sub2_Sub1_Sub2_1.anInt534);
						this.aClass3_Sub1_Sub3_6.method136(this.anInt1051);
						this.aClass3_Sub1_Sub3_6.method136(63);
						return;
					}
				}
			}
		} catch (@Pc(185) RuntimeException local185) {
			signlink.reporterror("62959, " + true + ", " + local185.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!IMUIZRAF;II)V")
	private void method698(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) int local3 = 92 / arg2;
			while (arg0.anInt244 + 10 < arg1 * 8) {
				@Pc(16) int local16 = arg0.method157(11);
				if (local16 == 2047) {
					break;
				}
				if (this.aClass3_Sub1_Sub2_Sub1_Sub2Array1[local16] == null) {
					this.aClass3_Sub1_Sub2_Sub1_Sub2Array1[local16] = new Class3_Sub1_Sub2_Sub1_Sub2();
					if (this.aClass3_Sub1_Sub3Array1[local16] != null) {
						this.aClass3_Sub1_Sub2_Sub1_Sub2Array1[local16].method388(this.aClass3_Sub1_Sub3Array1[local16]);
					}
				}
				this.anIntArray255[this.anInt1018++] = local16;
				@Pc(62) Class3_Sub1_Sub2_Sub1_Sub2 local62 = this.aClass3_Sub1_Sub2_Sub1_Sub2Array1[local16];
				local62.anInt560 = anInt1054;
				@Pc(70) int local70 = arg0.method157(5);
				if (local70 > 15) {
					local70 -= 32;
				}
				@Pc(79) int local79 = arg0.method157(1);
				@Pc(84) int local84 = arg0.method157(5);
				if (local84 > 15) {
					local84 -= 32;
				}
				@Pc(93) int local93 = arg0.method157(1);
				if (local93 == 1) {
					this.anIntArray256[this.anInt1019++] = local16;
				}
				local62.method385(aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray115[0] + local70, local79 == 1, aClass3_Sub1_Sub2_Sub1_Sub2_1.anIntArray116[0] + local84);
			}
			arg0.method158();
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("23115, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local135.toString());
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
				return new URL("http://127.0.0.1:" + (anInt913 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method699() {
		try {
			@Pc(16) int local16;
			for (@Pc(9) int local9 = 10; local9 < 117; local9++) {
				local16 = (int) (Math.random() * 100.0D);
				if (local16 < 50) {
					this.anIntArray260[local9 + 32512] = 255;
				}
			}
			@Pc(45) int local45;
			@Pc(52) int local52;
			@Pc(58) int local58;
			for (local16 = 0; local16 < 100; local16++) {
				local45 = (int) (Math.random() * 124.0D) + 2;
				local52 = (int) (Math.random() * 128.0D) + 128;
				local58 = local45 + (local52 << 7);
				this.anIntArray260[local58] = 192;
			}
			for (local45 = 1; local45 < 255; local45++) {
				for (local52 = 1; local52 < 127; local52++) {
					local58 = local52 + (local45 << 7);
					this.anIntArray261[local58] = (this.anIntArray260[local58 - 1] + this.anIntArray260[local58 + 1] + this.anIntArray260[local58 - 128] + this.anIntArray260[local58 + 128]) / 4;
				}
			}
			this.anInt856 += 128;
			if (this.anInt856 > this.anIntArray229.length) {
				this.anInt856 -= this.anIntArray229.length;
				local52 = (int) (Math.random() * 12.0D);
				this.method588(this.aClass3_Sub1_Sub1_Sub1Array3[local52], this.aBoolean278);
			}
			@Pc(171) int local171;
			for (local52 = 1; local52 < 255; local52++) {
				for (local58 = 1; local58 < 127; local58++) {
					local171 = local58 + (local52 << 7);
					@Pc(194) int local194 = this.anIntArray261[local171 + 128] - this.anIntArray229[local171 + this.anInt856 & this.anIntArray229.length - 1] / 5;
					if (local194 < 0) {
						local194 = 0;
					}
					this.anIntArray260[local171] = local194;
				}
			}
			for (local58 = 0; local58 < 255; local58++) {
				this.anIntArray245[local58] = this.anIntArray245[local58 + 1];
			}
			this.anIntArray245[255] = (int) (Math.sin((double) anInt1054 / 14.0D) * 16.0D + Math.sin((double) anInt1054 / 15.0D) * 14.0D + Math.sin((double) anInt1054 / 16.0D) * 12.0D);
			if (this.anInt886 > 0) {
				this.anInt886 -= 4;
			}
			if (this.anInt887 > 0) {
				this.anInt887 -= 4;
			}
			if (this.anInt886 == 0 && this.anInt887 == 0) {
				local171 = (int) (Math.random() * 2000.0D);
				if (local171 == 0) {
					this.anInt886 = 1024;
				}
				if (local171 == 1) {
					this.anInt887 = 1024;
					return;
				}
			}
		} catch (@Pc(305) RuntimeException local305) {
			signlink.reporterror("38316, " + true + ", " + local305.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method700(@OriginalArg(0) boolean arg0) {
		try {
			this.aBoolean251 &= arg0;
			if (this.anInt870 == 2) {
				for (@Pc(16) Class3_Sub2 local16 = (Class3_Sub2) this.aClass27_10.method305(); local16 != null; local16 = (Class3_Sub2) this.aClass27_10.method307()) {
					if (local16.anInt201 > 0) {
						local16.anInt201--;
					}
					if (local16.anInt201 != 0) {
						if (local16.anInt202 > 0) {
							local16.anInt202--;
						}
						if (local16.anInt202 == 0 && local16.anInt193 >= 1 && local16.anInt194 >= 1 && local16.anInt193 <= 102 && local16.anInt194 <= 102 && (local16.anInt198 < 0 || Class30.method348(local16.anInt200, local16.anInt198, this.anInt900))) {
							this.method625(local16.anInt194, local16.anInt191, local16.anInt200, local16.anInt199, local16.anInt198, local16.anInt193, local16.anInt192);
							local16.anInt202 = -1;
							if (local16.anInt198 == local16.anInt195 && local16.anInt195 == -1) {
								local16.method535();
							} else if (local16.anInt198 == local16.anInt195 && local16.anInt199 == local16.anInt196 && local16.anInt200 == local16.anInt197) {
								local16.method535();
							}
						}
					} else if (local16.anInt195 < 0 || Class30.method348(local16.anInt197, local16.anInt195, this.anInt900)) {
						this.method625(local16.anInt194, local16.anInt191, local16.anInt197, local16.anInt196, local16.anInt195, local16.anInt193, local16.anInt192);
						local16.method535();
					}
				}
				anInt905++;
				if (anInt905 > 100) {
					anInt905 = 0;
					this.aClass3_Sub1_Sub3_6.method135(15, this.anInt946);
					this.aClass3_Sub1_Sub3_6.method136(209);
					return;
				}
			}
		} catch (@Pc(180) RuntimeException local180) {
			signlink.reporterror("64495, " + arg0 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)Ljava/lang/String;")
	private String method701() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("9491, " + true + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method702() {
		try {
			this.aBoolean259 = true;
			try {
				@Pc(8) long local8 = System.currentTimeMillis();
				@Pc(10) int local10 = 0;
				@Pc(12) int local12 = 20;
				while (this.aBoolean263) {
					this.anInt953++;
					this.method699();
					this.method699();
					this.method621();
					local10++;
					if (local10 > 10) {
						@Pc(35) long local35 = System.currentTimeMillis();
						@Pc(44) int local44 = (int) (local35 - local8) / 10 - local12;
						local12 = 40 - local44;
						if (local12 < 5) {
							local12 = 5;
						}
						local10 = 0;
						local8 = local35;
					}
					try {
						Thread.sleep((long) local12);
					} catch (@Pc(62) Exception local62) {
					}
				}
			} catch (@Pc(68) Exception local68) {
			}
			this.aBoolean259 = false;
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("27649, " + 7 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
	private void method703(@OriginalArg(0) boolean arg0) {
		try {
			if (this.anInt925 != 0) {
				@Pc(6) Class3_Sub1_Sub1_Sub2 local6 = this.aClass3_Sub1_Sub1_Sub2_3;
				this.aBoolean251 &= arg0;
				@Pc(14) int local14 = 0;
				if (this.anInt1041 != 0) {
					local14 = 1;
				}
				for (@Pc(21) int local21 = 0; local21 < 100; local21++) {
					if (this.aStringArray11[local21] != null) {
						@Pc(33) int local33 = this.anIntArray237[local21];
						@Pc(38) String local38 = this.aStringArray10[local21];
						@Pc(40) byte local40 = 0;
						if (local38 != null && local38.startsWith("@cr1@")) {
							local38 = local38.substring(5);
							local40 = 1;
						}
						if (local38 != null && local38.startsWith("@cr2@")) {
							local38 = local38.substring(5);
							local40 = 2;
						}
						@Pc(92) int local92;
						if ((local33 == 3 || local33 == 7) && (local33 == 7 || this.anInt1020 == 0 || this.anInt1020 == 1 && this.method608(local38, this.aByte26))) {
							local92 = 329 - local14 * 13;
							local6.method89(local92, "From", 4, 0);
							local6.method89(local92 - 1, "From", 4, 65535);
							@Pc(117) int local117 = local6.method87("From ") + 4;
							if (local40 == 1) {
								this.aClass3_Sub1_Sub1_Sub1Array4[0].method44(local117, local92 - 12);
								local117 += 14;
							}
							if (local40 == 2) {
								this.aClass3_Sub1_Sub1_Sub1Array4[1].method44(local117, local92 - 12);
								local117 += 14;
							}
							local6.method89(local92, local38 + ": " + this.aStringArray11[local21], local117, 0);
							local6.method89(local92 - 1, local38 + ": " + this.aStringArray11[local21], local117, 65535);
							local14++;
							if (local14 >= 5) {
								return;
							}
						}
						if (local33 == 5 && this.anInt1020 < 2) {
							local92 = 329 - local14 * 13;
							local6.method89(local92, this.aStringArray11[local21], 4, 0);
							local6.method89(local92 - 1, this.aStringArray11[local21], 4, 65535);
							local14++;
							if (local14 >= 5) {
								return;
							}
						}
						if (local33 == 6 && this.anInt1020 < 2) {
							local92 = 329 - local14 * 13;
							local6.method89(local92, "To " + local38 + ": " + this.aStringArray11[local21], 4, 0);
							local6.method89(local92 - 1, "To " + local38 + ": " + this.aStringArray11[local21], 4, 65535);
							local14++;
							if (local14 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(296) RuntimeException local296) {
			signlink.reporterror("39070, " + arg0 + ", " + local296.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(III)Z")
	private boolean method704(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(7) Class35 local7 = Class35.aClass35Array1[arg1];
			for (@Pc(9) int local9 = 0; local9 < local7.anIntArray103.length && local7.anIntArray103[local9] != -1; local9++) {
				@Pc(24) Class35 local24 = Class35.aClass35Array1[local7.anIntArray103[local9]];
				if (local24.anInt514 == 1) {
					local3 |= this.method704(arg0, local24.anInt509);
				}
				@Pc(59) int local59;
				if (local24.anInt514 == 6 && (local24.anInt498 != -1 || local24.anInt499 != -1)) {
					@Pc(54) boolean local54 = this.method582(local24);
					if (local54) {
						local59 = local24.anInt499;
					} else {
						local59 = local24.anInt498;
					}
					if (local59 != -1) {
						@Pc(71) Class49 local71 = Class49.aClass49Array1[local59];
						local24.anInt490 += arg0;
						while (local24.anInt490 > local71.method567(local24.anInt489)) {
							local24.anInt490 -= local71.method567(local24.anInt489) + 1;
							local24.anInt489++;
							if (local24.anInt489 >= local71.anInt786) {
								local24.anInt489 -= local71.anInt787;
								if (local24.anInt489 < 0 || local24.anInt489 >= local71.anInt786) {
									local24.anInt489 = 0;
								}
							}
							local3 = true;
						}
					}
				}
				if (local24.anInt514 == 6 && local24.anInt519 != 0) {
					@Pc(142) int local142 = local24.anInt519 >> 16;
					local59 = local24.anInt519 << 16 >> 16;
					@Pc(153) int local153 = local142 * arg0;
					local59 *= arg0;
					local24.anInt496 = local24.anInt496 + local153 & 0x7FF;
					local24.anInt497 = local24.anInt497 + local59 & 0x7FF;
					local3 = true;
				}
			}
			if (this.anInt989 != 0) {
				this.method574();
			}
			return local3;
		} catch (@Pc(190) RuntimeException local190) {
			signlink.reporterror("56867, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local190.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)V")
	private void method705(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method706() {
		try {
			this.anInt849 = 0;
			@Pc(90) int local90;
			@Pc(70) int local70;
			for (@Pc(6) int local6 = -1; local6 < this.anInt1018 + this.anInt902; local6++) {
				@Pc(13) Class3_Sub1_Sub2_Sub1 local13;
				if (local6 == -1) {
					local13 = aClass3_Sub1_Sub2_Sub1_Sub2_1;
				} else if (local6 < this.anInt1018) {
					local13 = this.aClass3_Sub1_Sub2_Sub1_Sub2Array1[this.anIntArray255[local6]];
				} else {
					local13 = this.aClass3_Sub1_Sub2_Sub1_Sub1Array1[this.anIntArray232[local6 - this.anInt1018]];
				}
				if (local13 != null && local13.method387()) {
					@Pc(54) Class42 local54;
					if (local13 instanceof Class3_Sub1_Sub2_Sub1_Sub1) {
						local54 = ((Class3_Sub1_Sub2_Sub1_Sub1) local13).aClass42_1;
						if (local54.anIntArray155 != null) {
							local54 = local54.method478();
						}
						if (local54 == null) {
							continue;
						}
					}
					if (local6 >= this.anInt1018) {
						local54 = ((Class3_Sub1_Sub2_Sub1_Sub1) local13).aClass42_1;
						if (local54.anInt710 >= 0 && local54.anInt710 < this.aClass3_Sub1_Sub1_Sub4Array4.length) {
							this.method594(local13.anInt539 + 15, local13);
							if (this.anInt1026 > -1) {
								this.aClass3_Sub1_Sub1_Sub4Array4[local54.anInt710].method554(this.anInt1026 - 12, this.anInt1027 - 30);
							}
						}
						if (this.anInt928 == 1 && this.anInt1023 == this.anIntArray232[local6 - this.anInt1018] && anInt1054 % 20 < 10) {
							this.method594(local13.anInt539 + 15, local13);
							if (this.anInt1026 > -1) {
								this.aClass3_Sub1_Sub1_Sub4Array4[2].method554(this.anInt1026 - 12, this.anInt1027 - 28);
							}
						}
					} else {
						local70 = 30;
						@Pc(73) Class3_Sub1_Sub2_Sub1_Sub2 local73 = (Class3_Sub1_Sub2_Sub1_Sub2) local13;
						if (local73.anInt577 != 0) {
							this.method594(local13.anInt539 + 15, local13);
							if (this.anInt1026 > -1) {
								for (local90 = 0; local90 < 8; local90++) {
									if ((local73.anInt577 & 0x1 << local90) != 0) {
										this.aClass3_Sub1_Sub1_Sub4Array4[local90].method554(this.anInt1026 - 12, this.anInt1027 - local70);
										local70 -= 25;
									}
								}
							}
						}
						if (local6 >= 0 && this.anInt928 == 10 && this.anInt945 == this.anIntArray255[local6]) {
							this.method594(local13.anInt539 + 15, local13);
							if (this.anInt1026 > -1) {
								this.aClass3_Sub1_Sub1_Sub4Array4[7].method554(this.anInt1026 - 12, this.anInt1027 - local70);
							}
						}
					}
					if (local13.aString12 != null && (local6 >= this.anInt1018 || this.anInt971 == 0 || this.anInt971 == 3 || this.anInt971 == 1 && this.method608(((Class3_Sub1_Sub2_Sub1_Sub2) local13).aString13, this.aByte26))) {
						this.method594(local13.anInt539, local13);
						if (this.anInt1026 > -1 && this.anInt849 < this.anInt850) {
							this.anIntArray215[this.anInt849] = this.aClass3_Sub1_Sub1_Sub2_4.method88(local13.aString12) / 2;
							this.anIntArray214[this.anInt849] = this.aClass3_Sub1_Sub1_Sub2_4.anInt145;
							this.anIntArray212[this.anInt849] = this.anInt1026;
							this.anIntArray213[this.anInt849] = this.anInt1027;
							this.anIntArray216[this.anInt849] = local13.anInt536;
							this.anIntArray217[this.anInt849] = local13.anInt559;
							this.anIntArray218[this.anInt849] = local13.anInt540;
							this.aStringArray8[this.anInt849++] = local13.aString12;
							if (this.anInt983 == 0 && local13.anInt559 >= 1 && local13.anInt559 <= 3) {
								this.anIntArray214[this.anInt849] += 10;
								this.anIntArray213[this.anInt849] += 5;
							}
							if (this.anInt983 == 0 && local13.anInt559 == 4) {
								this.anIntArray215[this.anInt849] = 60;
							}
							if (this.anInt983 == 0 && local13.anInt559 == 5) {
								this.anIntArray214[this.anInt849] += 5;
							}
						}
					}
					if (local13.anInt569 > anInt1054) {
						this.method594(local13.anInt539 + 15, local13);
						if (this.anInt1026 > -1) {
							local70 = local13.anInt570 * 30 / local13.anInt571;
							if (local70 > 30) {
								local70 = 30;
							}
							Class3_Sub1_Sub1.method542(65280, this.anInt1026 - 15, local70, 5, this.anInt1027 - 3);
							Class3_Sub1_Sub1.method542(16711680, this.anInt1026 + local70 - 15, 30 - local70, 5, this.anInt1027 - 3);
						}
					}
					for (local70 = 0; local70 < 4; local70++) {
						if (local13.anIntArray114[local70] > anInt1054) {
							this.method594(local13.anInt539 / 2, local13);
							if (this.anInt1026 > -1) {
								if (local70 == 1) {
									this.anInt1027 -= 20;
								}
								if (local70 == 2) {
									this.anInt1026 -= 15;
									this.anInt1027 -= 10;
								}
								if (local70 == 3) {
									this.anInt1026 += 15;
									this.anInt1027 -= 10;
								}
								this.aClass3_Sub1_Sub1_Sub4Array5[local13.anIntArray113[local70]].method554(this.anInt1026 - 12, this.anInt1027 - 12);
								this.aClass3_Sub1_Sub1_Sub2_2.method85(this.anInt1027 + 4, 0, this.anInt1026, String.valueOf(local13.anIntArray112[local70]));
								this.aClass3_Sub1_Sub1_Sub2_2.method85(this.anInt1027 + 3, 16777215, this.anInt1026 - 1, String.valueOf(local13.anIntArray112[local70]));
							}
						}
					}
				}
			}
			for (@Pc(596) int local596 = 0; local596 < this.anInt849; local596++) {
				local70 = this.anIntArray212[local596];
				@Pc(608) int local608 = this.anIntArray213[local596];
				local90 = this.anIntArray215[local596];
				@Pc(618) int local618 = this.anIntArray214[local596];
				@Pc(620) boolean local620 = true;
				while (local620) {
					local620 = false;
					for (@Pc(626) int local626 = 0; local626 < local596; local626++) {
						if (local608 + 2 > this.anIntArray213[local626] - this.anIntArray214[local626] && local608 - local618 < this.anIntArray213[local626] + 2 && local70 - local90 < this.anIntArray212[local626] + this.anIntArray215[local626] && local70 + local90 > this.anIntArray212[local626] - this.anIntArray215[local626] && this.anIntArray213[local626] - this.anIntArray214[local626] < local608) {
							local608 = this.anIntArray213[local626] - this.anIntArray214[local626];
							local620 = true;
						}
					}
				}
				this.anInt1026 = this.anIntArray212[local596];
				this.anInt1027 = this.anIntArray213[local596] = local608;
				@Pc(725) String local725 = this.aStringArray8[local596];
				if (this.anInt983 == 0) {
					@Pc(730) int local730 = 16776960;
					if (this.anIntArray216[local596] < 6) {
						local730 = this.anIntArray222[this.anIntArray216[local596]];
					}
					if (this.anIntArray216[local596] == 6) {
						local730 = this.anInt949 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray216[local596] == 7) {
						local730 = this.anInt949 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray216[local596] == 8) {
						local730 = this.anInt949 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(805) int local805;
					if (this.anIntArray216[local596] == 9) {
						local805 = 150 - this.anIntArray218[local596];
						if (local805 < 50) {
							local730 = local805 * 1280 + 16711680;
						} else if (local805 < 100) {
							local730 = 16776960 - (local805 - 50) * 327680;
						} else if (local805 < 150) {
							local730 = (local805 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray216[local596] == 10) {
						local805 = 150 - this.anIntArray218[local596];
						if (local805 < 50) {
							local730 = local805 * 5 + 16711680;
						} else if (local805 < 100) {
							local730 = 16711935 - (local805 - 50) * 327680;
						} else if (local805 < 150) {
							local730 = (local805 - 100) * 327680 + 255 - (local805 - 100) * 5;
						}
					}
					if (this.anIntArray216[local596] == 11) {
						local805 = 150 - this.anIntArray218[local596];
						if (local805 < 50) {
							local730 = 16777215 - local805 * 327685;
						} else if (local805 < 100) {
							local730 = (local805 - 50) * 327685 + 65280;
						} else if (local805 < 150) {
							local730 = 16777215 - (local805 - 100) * 327680;
						}
					}
					if (this.anIntArray217[local596] == 0) {
						this.aClass3_Sub1_Sub1_Sub2_4.method85(this.anInt1027 + 1, 0, this.anInt1026, local725);
						this.aClass3_Sub1_Sub1_Sub2_4.method85(this.anInt1027, local730, this.anInt1026, local725);
					}
					if (this.anIntArray217[local596] == 1) {
						this.aClass3_Sub1_Sub1_Sub2_4.method90(this.anInt1027 + 1, this.anInt949, local725, this.anInt1026, 0);
						this.aClass3_Sub1_Sub1_Sub2_4.method90(this.anInt1027, this.anInt949, local725, this.anInt1026, local730);
					}
					if (this.anIntArray217[local596] == 2) {
						this.aClass3_Sub1_Sub1_Sub2_4.method91(0, this.anInt949, local725, this.anInt1026, this.anInt1027 + 1);
						this.aClass3_Sub1_Sub1_Sub2_4.method91(local730, this.anInt949, local725, this.anInt1026, this.anInt1027);
					}
					if (this.anIntArray217[local596] == 3) {
						this.aClass3_Sub1_Sub1_Sub2_4.method92(this.anInt949, 150 - this.anIntArray218[local596], local725, this.anInt1026, 0, this.anInt1027 + 1);
						this.aClass3_Sub1_Sub1_Sub2_4.method92(this.anInt949, 150 - this.anIntArray218[local596], local725, this.anInt1026, local730, this.anInt1027);
					}
					@Pc(1102) int local1102;
					if (this.anIntArray217[local596] == 4) {
						local805 = this.aClass3_Sub1_Sub1_Sub2_4.method88(local725);
						local1102 = (150 - this.anIntArray218[local596]) * (local805 + 100) / 150;
						Class3_Sub1_Sub1.method539(this.anInt1026 + 50, 334, this.anInt1026 - 50, 0);
						this.aClass3_Sub1_Sub1_Sub2_4.method89(this.anInt1027 + 1, local725, this.anInt1026 + 50 - local1102, 0);
						this.aClass3_Sub1_Sub1_Sub2_4.method89(this.anInt1027, local725, this.anInt1026 + 50 - local1102, local730);
						Class3_Sub1_Sub1.method538();
					}
					if (this.anIntArray217[local596] == 5) {
						local805 = 150 - this.anIntArray218[local596];
						local1102 = 0;
						if (local805 < 25) {
							local1102 = local805 - 25;
						} else if (local805 > 125) {
							local1102 = local805 - 125;
						}
						Class3_Sub1_Sub1.method539(512, this.anInt1027 + 5, 0, this.anInt1027 - this.aClass3_Sub1_Sub1_Sub2_4.anInt145 - 1);
						this.aClass3_Sub1_Sub1_Sub2_4.method85(this.anInt1027 + local1102 + 1, 0, this.anInt1026, local725);
						this.aClass3_Sub1_Sub1_Sub2_4.method85(this.anInt1027 + local1102, local730, this.anInt1026, local725);
						Class3_Sub1_Sub1.method538();
					}
				} else {
					this.aClass3_Sub1_Sub1_Sub2_4.method85(this.anInt1027 + 1, 0, this.anInt1026, local725);
					this.aClass3_Sub1_Sub1_Sub2_4.method85(this.anInt1027, 16776960, this.anInt1026, local725);
				}
			}
		} catch (@Pc(1260) RuntimeException local1260) {
			signlink.reporterror("2687, " + -999 + ", " + local1260.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
	private void method707() {
		try {
			try {
				if (this.aClass16_1 != null) {
					this.aClass16_1.method126();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass16_1 = null;
			this.aBoolean251 = false;
			this.anInt1021 = 0;
			this.aString17 = "";
			this.aString18 = "";
			this.method604();
			this.aBoolean251 &= true;
			this.aClass25_1.method235(614);
			for (@Pc(37) int local37 = 0; local37 < 4; local37++) {
				this.aClass44Array1[local37].method487();
			}
			System.gc();
			this.method643(this.anInt952);
			this.anInt947 = -1;
			this.anInt929 = -1;
			this.anInt868 = 0;
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("45082, " + true + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method708(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean253) {
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

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt912 = Integer.parseInt(this.getParameter("nodeid"));
		anInt913 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method649();
		} else {
			method598();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean257 = false;
		} else {
			aBoolean257 = true;
		}
		this.method570();
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method709() {
		try {
			if (this.anInt980 == 0) {
				this.aStringArray9[0] = "Cancel";
				this.anIntArray267[0] = 1575;
				this.anInt857 = 1;
				this.method660(284);
				this.anInt834 = 0;
				if (super.anInt823 > 4 && super.anInt824 > 4 && super.anInt823 < 516 && super.anInt824 < 338) {
					if (this.anInt888 == -1) {
						this.method638();
					} else {
						this.method678(super.anInt824, super.anInt823, 4, 0, 4, Class35.aClass35Array1[this.anInt888]);
					}
				}
				if (this.anInt834 != this.anInt889) {
					this.anInt889 = this.anInt834;
				}
				this.anInt834 = 0;
				if (super.anInt823 > 553 && super.anInt824 > 205 && super.anInt823 < 743 && super.anInt824 < 466) {
					if (this.anInt958 != -1) {
						this.method678(super.anInt824, super.anInt823, 553, 0, 205, Class35.aClass35Array1[this.anInt958]);
					} else if (this.anIntArray250[this.anInt1044] != -1) {
						this.method678(super.anInt824, super.anInt823, 553, 0, 205, Class35.aClass35Array1[this.anIntArray250[this.anInt1044]]);
					}
				}
				if (this.anInt834 != this.anInt840) {
					this.aBoolean281 = true;
					this.anInt840 = this.anInt834;
				}
				this.anInt834 = 0;
				if (super.anInt823 > 17 && super.anInt824 > 357 && super.anInt823 < 496 && super.anInt824 < 453) {
					if (this.anInt867 != -1) {
						this.method678(super.anInt824, super.anInt823, 17, 0, 357, Class35.aClass35Array1[this.anInt867]);
					} else if (super.anInt824 < 434 && super.anInt823 < 426) {
						this.method623(840, super.anInt823 - 17, super.anInt824 - 357);
					}
				}
				if (this.anInt867 != -1 && this.anInt834 != this.anInt948) {
					this.aBoolean249 = true;
					this.anInt948 = this.anInt834;
				}
				@Pc(233) boolean local233 = false;
				while (!local233) {
					local233 = true;
					for (@Pc(239) int local239 = 0; local239 < this.anInt857 - 1; local239++) {
						if (this.anIntArray267[local239] < 1000 && this.anIntArray267[local239 + 1] > 1000) {
							@Pc(260) String local260 = this.aStringArray9[local239];
							this.aStringArray9[local239] = this.aStringArray9[local239 + 1];
							this.aStringArray9[local239 + 1] = local260;
							@Pc(282) int local282 = this.anIntArray267[local239];
							this.anIntArray267[local239] = this.anIntArray267[local239 + 1];
							this.anIntArray267[local239 + 1] = local282;
							@Pc(304) int local304 = this.anIntArray265[local239];
							this.anIntArray265[local239] = this.anIntArray265[local239 + 1];
							this.anIntArray265[local239 + 1] = local304;
							@Pc(326) int local326 = this.anIntArray266[local239];
							this.anIntArray266[local239] = this.anIntArray266[local239 + 1];
							this.anIntArray266[local239 + 1] = local326;
							@Pc(348) int local348 = this.anIntArray268[local239];
							this.anIntArray268[local239] = this.anIntArray268[local239 + 1];
							this.anIntArray268[local239 + 1] = local348;
							local233 = false;
						}
					}
				}
			}
		} catch (@Pc(378) RuntimeException local378) {
			signlink.reporterror("84867, " + 7 + ", " + local378.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
	private void method710(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean263 = false;
			while (this.aBoolean259) {
				this.aBoolean263 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass3_Sub1_Sub1_Sub1_1 = null;
			this.aClass3_Sub1_Sub1_Sub1_2 = null;
			this.aClass3_Sub1_Sub1_Sub1Array3 = null;
			this.anIntArray246 = null;
			this.anIntArray247 = null;
			this.anIntArray248 = null;
			if (arg0 >= 0) {
				aBoolean265 = !aBoolean265;
			}
			this.anIntArray249 = null;
			this.anIntArray229 = null;
			this.anIntArray230 = null;
			this.anIntArray260 = null;
			this.anIntArray261 = null;
			this.aClass3_Sub1_Sub1_Sub4_9 = null;
			this.aClass3_Sub1_Sub1_Sub4_10 = null;
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("85109, " + arg0 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)Z")
	private boolean method711() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("25244, " + -130 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
	private void method712(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 1) {
				for (@Pc(4) int local4 = 1; local4 > 0; local4++) {
				}
			}
			if (super.anInt828 == 1) {
				if (super.anInt829 >= 539 && super.anInt829 <= 573 && super.anInt830 >= 169 && super.anInt830 < 205 && this.anIntArray250[0] != -1) {
					this.aBoolean281 = true;
					this.anInt1044 = 0;
					this.aBoolean262 = true;
				}
				if (super.anInt829 >= 569 && super.anInt829 <= 599 && super.anInt830 >= 168 && super.anInt830 < 205 && this.anIntArray250[1] != -1) {
					this.aBoolean281 = true;
					this.anInt1044 = 1;
					this.aBoolean262 = true;
				}
				if (super.anInt829 >= 597 && super.anInt829 <= 627 && super.anInt830 >= 168 && super.anInt830 < 205 && this.anIntArray250[2] != -1) {
					this.aBoolean281 = true;
					this.anInt1044 = 2;
					this.aBoolean262 = true;
				}
				if (super.anInt829 >= 625 && super.anInt829 <= 669 && super.anInt830 >= 168 && super.anInt830 < 203 && this.anIntArray250[3] != -1) {
					this.aBoolean281 = true;
					this.anInt1044 = 3;
					this.aBoolean262 = true;
				}
				if (super.anInt829 >= 666 && super.anInt829 <= 696 && super.anInt830 >= 168 && super.anInt830 < 205 && this.anIntArray250[4] != -1) {
					this.aBoolean281 = true;
					this.anInt1044 = 4;
					this.aBoolean262 = true;
				}
				if (super.anInt829 >= 694 && super.anInt829 <= 724 && super.anInt830 >= 168 && super.anInt830 < 205 && this.anIntArray250[5] != -1) {
					this.aBoolean281 = true;
					this.anInt1044 = 5;
					this.aBoolean262 = true;
				}
				if (super.anInt829 >= 722 && super.anInt829 <= 756 && super.anInt830 >= 169 && super.anInt830 < 205 && this.anIntArray250[6] != -1) {
					this.aBoolean281 = true;
					this.anInt1044 = 6;
					this.aBoolean262 = true;
				}
				if (super.anInt829 >= 540 && super.anInt829 <= 574 && super.anInt830 >= 466 && super.anInt830 < 502 && this.anIntArray250[7] != -1) {
					this.aBoolean281 = true;
					this.anInt1044 = 7;
					this.aBoolean262 = true;
				}
				if (super.anInt829 >= 572 && super.anInt829 <= 602 && super.anInt830 >= 466 && super.anInt830 < 503 && this.anIntArray250[8] != -1) {
					this.aBoolean281 = true;
					this.anInt1044 = 8;
					this.aBoolean262 = true;
				}
				if (super.anInt829 >= 599 && super.anInt829 <= 629 && super.anInt830 >= 466 && super.anInt830 < 503 && this.anIntArray250[9] != -1) {
					this.aBoolean281 = true;
					this.anInt1044 = 9;
					this.aBoolean262 = true;
				}
				if (super.anInt829 >= 627 && super.anInt829 <= 671 && super.anInt830 >= 467 && super.anInt830 < 502 && this.anIntArray250[10] != -1) {
					this.aBoolean281 = true;
					this.anInt1044 = 10;
					this.aBoolean262 = true;
				}
				if (super.anInt829 >= 669 && super.anInt829 <= 699 && super.anInt830 >= 466 && super.anInt830 < 503 && this.anIntArray250[11] != -1) {
					this.aBoolean281 = true;
					this.anInt1044 = 11;
					this.aBoolean262 = true;
				}
				if (super.anInt829 >= 696 && super.anInt829 <= 726 && super.anInt830 >= 466 && super.anInt830 < 503 && this.anIntArray250[12] != -1) {
					this.aBoolean281 = true;
					this.anInt1044 = 12;
					this.aBoolean262 = true;
				}
				if (super.anInt829 >= 724 && super.anInt829 <= 758 && super.anInt830 >= 466 && super.anInt830 < 502 && this.anIntArray250[13] != -1) {
					this.aBoolean281 = true;
					this.anInt1044 = 13;
					this.aBoolean262 = true;
					return;
				}
			}
		} catch (@Pc(449) RuntimeException local449) {
			signlink.reporterror("52319, " + arg0 + ", " + local449.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "N", descriptor = "(I)V")
	private void method713() {
		try {
			while (true) {
				@Pc(12) Class3_Sub1_Sub4 local12 = this.aClass19_Sub1_1.method413();
				if (local12 == null) {
					return;
				}
				if (local12.anInt294 == 0) {
					Class3_Sub1_Sub2_Sub6.method508(local12.anInt295, local12.aByteArray12);
					if ((this.aClass19_Sub1_1.method417(local12.anInt295) & 0x62) != 0) {
						this.aBoolean281 = true;
						if (this.anInt867 != -1) {
							this.aBoolean249 = true;
						}
					}
				}
				if (local12.anInt294 == 1 && local12.aByteArray12 != null) {
					Class15.method122(local12.aByteArray12, (byte) 7);
				}
				if (local12.anInt294 == 2 && local12.anInt295 == this.anInt929 && local12.aByteArray12 != null) {
					this.method626(local12.aByteArray12, this.aBoolean276, this.aBoolean260);
				}
				if (local12.anInt294 == 3 && this.anInt870 == 1) {
					for (@Pc(84) int local84 = 0; local84 < this.aByteArrayArray4.length; local84++) {
						if (this.anIntArray263[local84] == local12.anInt295) {
							this.aByteArrayArray4[local84] = local12.aByteArray12;
							if (local12.aByteArray12 == null) {
								this.anIntArray263[local84] = -1;
							}
							break;
						}
						if (this.anIntArray264[local84] == local12.anInt295) {
							this.aByteArrayArray5[local84] = local12.aByteArray12;
							if (local12.aByteArray12 == null) {
								this.anIntArray264[local84] = -1;
							}
							break;
						}
					}
				}
				if (local12.anInt294 == 93 && this.aClass19_Sub1_1.method420(541, local12.anInt295)) {
					Class30.method338(this.anInt1003, new Class3_Sub1_Sub3(0, local12.aByteArray12), this.aClass19_Sub1_1);
				}
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("59297, " + 0 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(Z)V")
	private void method714() {
		try {
			this.aClass36_27.method391();
			Class3_Sub1_Sub1_Sub3.anIntArray146 = this.anIntArray270;
			this.aClass3_Sub1_Sub1_Sub1_15.method44(0, 0);
			if (this.aBoolean267) {
				this.aClass3_Sub1_Sub1_Sub2_4.method85(40, 0, 239, this.aString26);
				this.aClass3_Sub1_Sub1_Sub2_4.method85(60, 128, 239, this.aString24 + "*");
			} else if (this.anInt1006 == 1) {
				this.aClass3_Sub1_Sub1_Sub2_4.method85(40, 0, 239, "Enter amount:");
				this.aClass3_Sub1_Sub1_Sub2_4.method85(60, 128, 239, this.aString28 + "*");
			} else if (this.anInt1006 == 2) {
				this.aClass3_Sub1_Sub1_Sub2_4.method85(40, 0, 239, "Enter name:");
				this.aClass3_Sub1_Sub1_Sub2_4.method85(60, 128, 239, this.aString28 + "*");
			} else if (this.aString22 != null) {
				this.aClass3_Sub1_Sub1_Sub2_4.method85(40, 0, 239, this.aString22);
				this.aClass3_Sub1_Sub1_Sub2_4.method85(60, 128, 239, "Click to continue");
			} else if (this.anInt867 != -1) {
				this.method673(0, 0, 0, Class35.aClass35Array1[this.anInt867]);
			} else if (this.anInt988 == -1) {
				@Pc(161) Class3_Sub1_Sub1_Sub2 local161 = this.aClass3_Sub1_Sub1_Sub2_3;
				@Pc(163) int local163 = 0;
				Class3_Sub1_Sub1.method539(463, 77, 0, 0);
				for (@Pc(171) int local171 = 0; local171 < 100; local171++) {
					if (this.aStringArray11[local171] != null) {
						@Pc(183) int local183 = this.anIntArray237[local171];
						@Pc(192) int local192 = this.anInt990 + 70 - local163 * 14;
						@Pc(197) String local197 = this.aStringArray10[local171];
						@Pc(199) byte local199 = 0;
						if (local197 != null && local197.startsWith("@cr1@")) {
							local197 = local197.substring(5);
							local199 = 1;
						}
						if (local197 != null && local197.startsWith("@cr2@")) {
							local197 = local197.substring(5);
							local199 = 2;
						}
						if (local183 == 0) {
							if (local192 > 0 && local192 < 110) {
								local161.method89(local192, this.aStringArray11[local171], 4, 0);
							}
							local163++;
						}
						@Pc(270) int local270;
						if ((local183 == 1 || local183 == 2) && (local183 == 1 || this.anInt971 == 0 || this.anInt971 == 1 && this.method608(local197, this.aByte26))) {
							if (local192 > 0 && local192 < 110) {
								local270 = 4;
								if (local199 == 1) {
									this.aClass3_Sub1_Sub1_Sub1Array4[0].method44(4, local192 - 12);
									local270 += 14;
								}
								if (local199 == 2) {
									this.aClass3_Sub1_Sub1_Sub1Array4[1].method44(local270, local192 - 12);
									local270 += 14;
								}
								local161.method89(local192, local197 + ":", local270, 0);
								local270 += local161.method87(local197) + 8;
								local161.method89(local192, this.aStringArray11[local171], local270, 255);
							}
							local163++;
						}
						if ((local183 == 3 || local183 == 7) && this.anInt925 == 0 && (local183 == 7 || this.anInt1020 == 0 || this.anInt1020 == 1 && this.method608(local197, this.aByte26))) {
							if (local192 > 0 && local192 < 110) {
								local161.method89(local192, "From", 4, 0);
								local270 = local161.method87("From ") + 4;
								if (local199 == 1) {
									this.aClass3_Sub1_Sub1_Sub1Array4[0].method44(local270, local192 - 12);
									local270 += 14;
								}
								if (local199 == 2) {
									this.aClass3_Sub1_Sub1_Sub1Array4[1].method44(local270, local192 - 12);
									local270 += 14;
								}
								local161.method89(local192, local197 + ":", local270, 0);
								local270 += local161.method87(local197) + 8;
								local161.method89(local192, this.aStringArray11[local171], local270, 8388608);
							}
							local163++;
						}
						if (local183 == 4 && (this.anInt1004 == 0 || this.anInt1004 == 1 && this.method608(local197, this.aByte26))) {
							if (local192 > 0 && local192 < 110) {
								local161.method89(local192, local197 + " " + this.aStringArray11[local171], 4, 8388736);
							}
							local163++;
						}
						if (local183 == 5 && this.anInt925 == 0 && this.anInt1020 < 2) {
							if (local192 > 0 && local192 < 110) {
								local161.method89(local192, this.aStringArray11[local171], 4, 8388608);
							}
							local163++;
						}
						if (local183 == 6 && this.anInt925 == 0 && this.anInt1020 < 2) {
							if (local192 > 0 && local192 < 110) {
								local161.method89(local192, "To " + local197 + ":", 4, 0);
								local161.method89(local192, this.aStringArray11[local171], local161.method87("To " + local197) + 12, 8388608);
							}
							local163++;
						}
						if (local183 == 8 && (this.anInt1004 == 0 || this.anInt1004 == 1 && this.method608(local197, this.aByte26))) {
							if (local192 > 0 && local192 < 110) {
								local161.method89(local192, local197 + " " + this.aStringArray11[local171], 4, 8270336);
							}
							local163++;
						}
					}
				}
				Class3_Sub1_Sub1.method538();
				this.anInt976 = local163 * 14 + 7;
				if (this.anInt976 < 78) {
					this.anInt976 = 78;
				}
				this.method601(this.anInt976 - this.anInt990 - 77, 77, 463, this.anInt976, 0);
				@Pc(643) String local643;
				if (aClass3_Sub1_Sub2_Sub1_Sub2_1 == null || aClass3_Sub1_Sub2_Sub1_Sub2_1.aString13 == null) {
					local643 = Class23.method230(this.aString17);
				} else {
					local643 = aClass3_Sub1_Sub2_Sub1_Sub2_1.aString13;
				}
				local161.method89(90, local643 + ":", 4, 0);
				local161.method89(90, this.aString25 + "*", local161.method87(local643 + ": ") + 6, 255);
				Class3_Sub1_Sub1.method545(0, 0, 77, 479);
			} else {
				this.method673(0, 0, 0, Class35.aClass35Array1[this.anInt988]);
			}
			if (this.aBoolean271 && this.anInt859 == 2) {
				this.method677();
			}
			this.aClass36_27.method392(17, 357, super.aGraphics2);
			this.aClass36_26.method391();
			Class3_Sub1_Sub1_Sub3.anIntArray146 = this.anIntArray272;
		} catch (@Pc(729) RuntimeException local729) {
			signlink.reporterror("17575, " + true + ", " + local729.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "O", descriptor = "(I)V")
	private void method715() {
		try {
			this.aBoolean248 = true;
			for (@Pc(10) int local10 = 0; local10 < 7; local10++) {
				this.anIntArray259[local10] = -1;
				for (@Pc(19) int local19 = 0; local19 < Class4.anInt100; local19++) {
					if (!Class4.aClass4Array1[local19].aBoolean34 && Class4.aClass4Array1[local19].anInt101 == local10 + (this.aBoolean256 ? 0 : 7)) {
						this.anIntArray259[local10] = local19;
						break;
					}
				}
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("94748, " + 89 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}
}
